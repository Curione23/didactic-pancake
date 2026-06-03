package org.tukaani.xz;

/* JADX INFO: loaded from: classes2.dex */
public class LZMA2InputStream extends java.io.InputStream {
    private static final int COMPRESSED_SIZE_MAX = 65536;
    public static final int DICT_SIZE_MAX = 2147483632;
    public static final int DICT_SIZE_MIN = 4096;
    private final org.tukaani.xz.ArrayCache arrayCache;
    private boolean endReached;
    private java.io.IOException exception;
    private java.io.DataInputStream in;
    private boolean isLZMAChunk;
    private org.tukaani.xz.lz.LZDecoder lz;
    private org.tukaani.xz.lzma.LZMADecoder lzma;
    private boolean needDictReset;
    private boolean needProps;
    private org.tukaani.xz.rangecoder.RangeDecoderFromBuffer rc;
    private final byte[] tempBuf;
    private int uncompressedSize;

    public LZMA2InputStream(java.io.InputStream r2, int r3) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r3, r0)
            return
    }

    public LZMA2InputStream(java.io.InputStream r2, int r3, byte[] r4) {
            r1 = this;
            org.tukaani.xz.ArrayCache r0 = org.tukaani.xz.ArrayCache.getDefaultCache()
            r1.<init>(r2, r3, r4, r0)
            return
    }

    LZMA2InputStream(java.io.InputStream r4, int r5, byte[] r6, org.tukaani.xz.ArrayCache r7) {
            r3 = this;
            r3.<init>()
            r0 = 0
            r3.uncompressedSize = r0
            r3.isLZMAChunk = r0
            r1 = 1
            r3.needDictReset = r1
            r3.needProps = r1
            r3.endReached = r0
            r2 = 0
            r3.exception = r2
            byte[] r1 = new byte[r1]
            r3.tempBuf = r1
            r4.getClass()
            r3.arrayCache = r7
            java.io.DataInputStream r1 = new java.io.DataInputStream
            r1.<init>(r4)
            r3.in = r1
            org.tukaani.xz.rangecoder.RangeDecoderFromBuffer r4 = new org.tukaani.xz.rangecoder.RangeDecoderFromBuffer
            r1 = 65536(0x10000, float:9.1835E-41)
            r4.<init>(r1, r7)
            r3.rc = r4
            org.tukaani.xz.lz.LZDecoder r4 = new org.tukaani.xz.lz.LZDecoder
            int r5 = getDictSize(r5)
            r4.<init>(r5, r6, r7)
            r3.lz = r4
            if (r6 == 0) goto L3d
            int r4 = r6.length
            if (r4 <= 0) goto L3d
            r3.needDictReset = r0
        L3d:
            return
    }

    private void decodeChunkHeader() throws java.io.IOException {
            r5 = this;
            java.io.DataInputStream r0 = r5.in
            int r0 = r0.readUnsignedByte()
            r1 = 1
            if (r0 != 0) goto Lf
            r5.endReached = r1
            r5.putArraysToCache()
            return
        Lf:
            r2 = 224(0xe0, float:3.14E-43)
            r3 = 0
            if (r0 >= r2) goto L22
            if (r0 != r1) goto L17
            goto L22
        L17:
            boolean r2 = r5.needDictReset
            if (r2 != 0) goto L1c
            goto L2b
        L1c:
            org.tukaani.xz.CorruptedInputException r0 = new org.tukaani.xz.CorruptedInputException
            r0.<init>()
            throw r0
        L22:
            r5.needProps = r1
            r5.needDictReset = r3
            org.tukaani.xz.lz.LZDecoder r2 = r5.lz
            r2.reset()
        L2b:
            r2 = 128(0x80, float:1.8E-43)
            if (r0 < r2) goto L6d
            r5.isLZMAChunk = r1
            r2 = r0 & 31
            int r2 = r2 << 16
            r5.uncompressedSize = r2
            java.io.DataInputStream r4 = r5.in
            int r4 = r4.readUnsignedShort()
            int r4 = r4 + r1
            int r2 = r2 + r4
            r5.uncompressedSize = r2
            java.io.DataInputStream r2 = r5.in
            int r2 = r2.readUnsignedShort()
            int r2 = r2 + r1
            r1 = 192(0xc0, float:2.69E-43)
            if (r0 < r1) goto L52
            r5.needProps = r3
            r5.decodeProps()
            goto L5f
        L52:
            boolean r1 = r5.needProps
            if (r1 != 0) goto L67
            r1 = 160(0xa0, float:2.24E-43)
            if (r0 < r1) goto L5f
            org.tukaani.xz.lzma.LZMADecoder r0 = r5.lzma
            r0.reset()
        L5f:
            org.tukaani.xz.rangecoder.RangeDecoderFromBuffer r0 = r5.rc
            java.io.DataInputStream r1 = r5.in
            r0.prepareInputBuffer(r1, r2)
            goto L7b
        L67:
            org.tukaani.xz.CorruptedInputException r0 = new org.tukaani.xz.CorruptedInputException
            r0.<init>()
            throw r0
        L6d:
            r2 = 2
            if (r0 > r2) goto L7c
            r5.isLZMAChunk = r3
            java.io.DataInputStream r0 = r5.in
            int r0 = r0.readUnsignedShort()
            int r0 = r0 + r1
            r5.uncompressedSize = r0
        L7b:
            return
        L7c:
            org.tukaani.xz.CorruptedInputException r0 = new org.tukaani.xz.CorruptedInputException
            r0.<init>()
            throw r0
    }

    private void decodeProps() throws java.io.IOException {
            r8 = this;
            java.io.DataInputStream r0 = r8.in
            int r0 = r0.readUnsignedByte()
            r1 = 224(0xe0, float:3.14E-43)
            if (r0 > r1) goto L2d
            int r7 = r0 / 45
            int r1 = r7 * 45
            int r0 = r0 - r1
            int r6 = r0 / 9
            int r1 = r6 * 9
            int r5 = r0 - r1
            int r0 = r5 + r6
            r1 = 4
            if (r0 > r1) goto L27
            org.tukaani.xz.lzma.LZMADecoder r0 = new org.tukaani.xz.lzma.LZMADecoder
            org.tukaani.xz.lz.LZDecoder r3 = r8.lz
            org.tukaani.xz.rangecoder.RangeDecoderFromBuffer r4 = r8.rc
            r2 = r0
            r2.<init>(r3, r4, r5, r6, r7)
            r8.lzma = r0
            return
        L27:
            org.tukaani.xz.CorruptedInputException r0 = new org.tukaani.xz.CorruptedInputException
            r0.<init>()
            throw r0
        L2d:
            org.tukaani.xz.CorruptedInputException r0 = new org.tukaani.xz.CorruptedInputException
            r0.<init>()
            throw r0
    }

    private static int getDictSize(int r3) {
            r0 = 4096(0x1000, float:5.74E-42)
            if (r3 < r0) goto Le
            r0 = 2147483632(0x7ffffff0, float:NaN)
            if (r3 > r0) goto Le
            int r3 = r3 + 15
            r3 = r3 & (-16)
            return r3
        Le:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Unsupported dictionary size "
            r1.<init>(r2)
            java.lang.StringBuilder r3 = r1.append(r3)
            java.lang.String r3 = r3.toString()
            r0.<init>(r3)
            throw r0
    }

    public static int getMemoryUsage(int r0) {
            int r0 = getDictSize(r0)
            int r0 = r0 / 1024
            int r0 = r0 + 104
            return r0
    }

    private void putArraysToCache() {
            r3 = this;
            org.tukaani.xz.lz.LZDecoder r0 = r3.lz
            if (r0 == 0) goto L15
            org.tukaani.xz.ArrayCache r1 = r3.arrayCache
            r0.putArraysToCache(r1)
            r0 = 0
            r3.lz = r0
            org.tukaani.xz.rangecoder.RangeDecoderFromBuffer r1 = r3.rc
            org.tukaani.xz.ArrayCache r2 = r3.arrayCache
            r1.putArraysToCache(r2)
            r3.rc = r0
        L15:
            return
    }

    @Override // java.io.InputStream
    public int available() throws java.io.IOException {
            r2 = this;
            java.io.DataInputStream r0 = r2.in
            if (r0 == 0) goto L1b
            java.io.IOException r1 = r2.exception
            if (r1 != 0) goto L1a
            boolean r1 = r2.isLZMAChunk
            if (r1 == 0) goto Lf
            int r0 = r2.uncompressedSize
            goto L19
        Lf:
            int r1 = r2.uncompressedSize
            int r0 = r0.available()
            int r0 = java.lang.Math.min(r1, r0)
        L19:
            return r0
        L1a:
            throw r1
        L1b:
            org.tukaani.xz.XZIOException r0 = new org.tukaani.xz.XZIOException
            java.lang.String r1 = "Stream closed"
            r0.<init>(r1)
            throw r0
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws java.io.IOException {
            r2 = this;
            java.io.DataInputStream r0 = r2.in
            if (r0 == 0) goto L14
            r2.putArraysToCache()
            r0 = 0
            java.io.DataInputStream r1 = r2.in     // Catch: java.lang.Throwable -> L10
            r1.close()     // Catch: java.lang.Throwable -> L10
            r2.in = r0
            goto L14
        L10:
            r1 = move-exception
            r2.in = r0
            throw r1
        L14:
            return
    }

    @Override // java.io.InputStream
    public int read() throws java.io.IOException {
            r3 = this;
            byte[] r0 = r3.tempBuf
            r1 = 1
            r2 = 0
            int r0 = r3.read(r0, r2, r1)
            r1 = -1
            if (r0 != r1) goto Lc
            goto L12
        Lc:
            byte[] r0 = r3.tempBuf
            r0 = r0[r2]
            r1 = r0 & 255(0xff, float:3.57E-43)
        L12:
            return r1
    }

    @Override // java.io.InputStream
    public int read(byte[] r6, int r7, int r8) throws java.io.IOException {
            r5 = this;
            if (r7 < 0) goto L80
            if (r8 < 0) goto L80
            int r0 = r7 + r8
            if (r0 < 0) goto L80
            int r1 = r6.length
            if (r0 > r1) goto L80
            r0 = 0
            if (r8 != 0) goto Lf
            return r0
        Lf:
            java.io.DataInputStream r1 = r5.in
            if (r1 == 0) goto L78
            java.io.IOException r1 = r5.exception
            if (r1 != 0) goto L77
            boolean r1 = r5.endReached
            r2 = -1
            if (r1 == 0) goto L1d
            return r2
        L1d:
            if (r8 <= 0) goto L76
            int r1 = r5.uncompressedSize     // Catch: java.io.IOException -> L72
            if (r1 != 0) goto L2f
            r5.decodeChunkHeader()     // Catch: java.io.IOException -> L72
            boolean r1 = r5.endReached     // Catch: java.io.IOException -> L72
            if (r1 == 0) goto L2f
            if (r0 != 0) goto L2d
            goto L2e
        L2d:
            r2 = r0
        L2e:
            return r2
        L2f:
            int r1 = r5.uncompressedSize     // Catch: java.io.IOException -> L72
            int r1 = java.lang.Math.min(r1, r8)     // Catch: java.io.IOException -> L72
            boolean r3 = r5.isLZMAChunk     // Catch: java.io.IOException -> L72
            if (r3 != 0) goto L41
            org.tukaani.xz.lz.LZDecoder r3 = r5.lz     // Catch: java.io.IOException -> L72
            java.io.DataInputStream r4 = r5.in     // Catch: java.io.IOException -> L72
            r3.copyUncompressed(r4, r1)     // Catch: java.io.IOException -> L72
            goto L4b
        L41:
            org.tukaani.xz.lz.LZDecoder r3 = r5.lz     // Catch: java.io.IOException -> L72
            r3.setLimit(r1)     // Catch: java.io.IOException -> L72
            org.tukaani.xz.lzma.LZMADecoder r1 = r5.lzma     // Catch: java.io.IOException -> L72
            r1.decode()     // Catch: java.io.IOException -> L72
        L4b:
            org.tukaani.xz.lz.LZDecoder r1 = r5.lz     // Catch: java.io.IOException -> L72
            int r1 = r1.flush(r6, r7)     // Catch: java.io.IOException -> L72
            int r7 = r7 + r1
            int r8 = r8 - r1
            int r0 = r0 + r1
            int r3 = r5.uncompressedSize     // Catch: java.io.IOException -> L72
            int r3 = r3 - r1
            r5.uncompressedSize = r3     // Catch: java.io.IOException -> L72
            if (r3 != 0) goto L1d
            org.tukaani.xz.rangecoder.RangeDecoderFromBuffer r1 = r5.rc     // Catch: java.io.IOException -> L72
            boolean r1 = r1.isFinished()     // Catch: java.io.IOException -> L72
            if (r1 == 0) goto L6c
            org.tukaani.xz.lz.LZDecoder r1 = r5.lz     // Catch: java.io.IOException -> L72
            boolean r1 = r1.hasPending()     // Catch: java.io.IOException -> L72
            if (r1 != 0) goto L6c
            goto L1d
        L6c:
            org.tukaani.xz.CorruptedInputException r6 = new org.tukaani.xz.CorruptedInputException     // Catch: java.io.IOException -> L72
            r6.<init>()     // Catch: java.io.IOException -> L72
            throw r6     // Catch: java.io.IOException -> L72
        L72:
            r6 = move-exception
            r5.exception = r6
            throw r6
        L76:
            return r0
        L77:
            throw r1
        L78:
            org.tukaani.xz.XZIOException r6 = new org.tukaani.xz.XZIOException
            java.lang.String r7 = "Stream closed"
            r6.<init>(r7)
            throw r6
        L80:
            java.lang.IndexOutOfBoundsException r6 = new java.lang.IndexOutOfBoundsException
            r6.<init>()
            throw r6
    }
}
