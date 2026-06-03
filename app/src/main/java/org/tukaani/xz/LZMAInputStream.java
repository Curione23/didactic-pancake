package org.tukaani.xz;

/* JADX INFO: loaded from: classes2.dex */
public class LZMAInputStream extends java.io.InputStream {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    public static final int DICT_SIZE_MAX = 2147483632;
    private org.tukaani.xz.ArrayCache arrayCache;
    private boolean endReached;
    private java.io.IOException exception;
    private java.io.InputStream in;
    private org.tukaani.xz.lz.LZDecoder lz;
    private org.tukaani.xz.lzma.LZMADecoder lzma;
    private org.tukaani.xz.rangecoder.RangeDecoderFromStream rc;
    private boolean relaxedEndCondition;
    private long remainingSize;
    private final byte[] tempBuf;

    static {
            return
    }

    public LZMAInputStream(java.io.InputStream r2) throws java.io.IOException {
            r1 = this;
            r0 = -1
            r1.<init>(r2, r0)
            return
    }

    public LZMAInputStream(java.io.InputStream r2, int r3) throws java.io.IOException {
            r1 = this;
            org.tukaani.xz.ArrayCache r0 = org.tukaani.xz.ArrayCache.getDefaultCache()
            r1.<init>(r2, r3, r0)
            return
    }

    public LZMAInputStream(java.io.InputStream r12, int r13, org.tukaani.xz.ArrayCache r14) throws java.io.IOException {
            r11 = this;
            r11.<init>()
            r0 = 0
            r11.endReached = r0
            r11.relaxedEndCondition = r0
            r1 = 1
            byte[] r2 = new byte[r1]
            r11.tempBuf = r2
            r2 = 0
            r11.exception = r2
            java.io.DataInputStream r2 = new java.io.DataInputStream
            r2.<init>(r12)
            byte r7 = r2.readByte()
            r3 = r0
            r8 = r3
        L1b:
            r4 = 4
            if (r3 >= r4) goto L29
            int r4 = r2.readUnsignedByte()
            int r5 = r3 * 8
            int r4 = r4 << r5
            r8 = r8 | r4
            int r3 = r3 + 1
            goto L1b
        L29:
            r3 = 0
            r5 = r3
        L2c:
            r3 = 8
            if (r0 >= r3) goto L3c
            int r3 = r2.readUnsignedByte()
            long r3 = (long) r3
            int r9 = r0 * 8
            long r3 = r3 << r9
            long r5 = r5 | r3
            int r0 = r0 + 1
            goto L2c
        L3c:
            int r0 = getMemoryUsage(r8, r7)
            r2 = -1
            if (r13 == r2) goto L4c
            if (r0 > r13) goto L46
            goto L4c
        L46:
            org.tukaani.xz.MemoryLimitException r12 = new org.tukaani.xz.MemoryLimitException
            r12.<init>(r0, r13)
            throw r12
        L4c:
            r11.relaxedEndCondition = r1
            r9 = 0
            r3 = r11
            r4 = r12
            r10 = r14
            r3.initialize(r4, r5, r7, r8, r9, r10)
            return
    }

    public LZMAInputStream(java.io.InputStream r10, long r11, byte r13, int r14) throws java.io.IOException {
            r9 = this;
            r9.<init>()
            r0 = 0
            r9.endReached = r0
            r9.relaxedEndCondition = r0
            r0 = 1
            byte[] r0 = new byte[r0]
            r9.tempBuf = r0
            r0 = 0
            r9.exception = r0
            r7 = 0
            org.tukaani.xz.ArrayCache r8 = org.tukaani.xz.ArrayCache.getDefaultCache()
            r1 = r9
            r2 = r10
            r3 = r11
            r5 = r13
            r6 = r14
            r1.initialize(r2, r3, r5, r6, r7, r8)
            return
    }

    public LZMAInputStream(java.io.InputStream r10, long r11, byte r13, int r14, byte[] r15) throws java.io.IOException {
            r9 = this;
            r9.<init>()
            r0 = 0
            r9.endReached = r0
            r9.relaxedEndCondition = r0
            r0 = 1
            byte[] r0 = new byte[r0]
            r9.tempBuf = r0
            r0 = 0
            r9.exception = r0
            org.tukaani.xz.ArrayCache r8 = org.tukaani.xz.ArrayCache.getDefaultCache()
            r1 = r9
            r2 = r10
            r3 = r11
            r5 = r13
            r6 = r14
            r7 = r15
            r1.initialize(r2, r3, r5, r6, r7, r8)
            return
    }

    public LZMAInputStream(java.io.InputStream r2, long r3, byte r5, int r6, byte[] r7, org.tukaani.xz.ArrayCache r8) throws java.io.IOException {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.endReached = r0
            r1.relaxedEndCondition = r0
            r0 = 1
            byte[] r0 = new byte[r0]
            r1.tempBuf = r0
            r0 = 0
            r1.exception = r0
            r1.initialize(r2, r3, r5, r6, r7, r8)
            return
    }

    public LZMAInputStream(java.io.InputStream r12, long r13, int r15, int r16, int r17, int r18, byte[] r19) throws java.io.IOException {
            r11 = this;
            r10 = r11
            r11.<init>()
            r0 = 0
            r10.endReached = r0
            r10.relaxedEndCondition = r0
            r0 = 1
            byte[] r0 = new byte[r0]
            r10.tempBuf = r0
            r0 = 0
            r10.exception = r0
            org.tukaani.xz.ArrayCache r9 = org.tukaani.xz.ArrayCache.getDefaultCache()
            r0 = r11
            r1 = r12
            r2 = r13
            r4 = r15
            r5 = r16
            r6 = r17
            r7 = r18
            r8 = r19
            r0.initialize(r1, r2, r4, r5, r6, r7, r8, r9)
            return
    }

    public LZMAInputStream(java.io.InputStream r2, long r3, int r5, int r6, int r7, int r8, byte[] r9, org.tukaani.xz.ArrayCache r10) throws java.io.IOException {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.endReached = r0
            r1.relaxedEndCondition = r0
            r0 = 1
            byte[] r0 = new byte[r0]
            r1.tempBuf = r0
            r0 = 0
            r1.exception = r0
            r1.initialize(r2, r3, r5, r6, r7, r8, r9, r10)
            return
    }

    public LZMAInputStream(java.io.InputStream r2, org.tukaani.xz.ArrayCache r3) throws java.io.IOException {
            r1 = this;
            r0 = -1
            r1.<init>(r2, r0, r3)
            return
    }

    private static int getDictSize(int r1) {
            if (r1 < 0) goto L11
            r0 = 2147483632(0x7ffffff0, float:NaN)
            if (r1 > r0) goto L11
            r0 = 4096(0x1000, float:5.74E-42)
            if (r1 >= r0) goto Lc
            r1 = r0
        Lc:
            int r1 = r1 + 15
            r1 = r1 & (-16)
            return r1
        L11:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "LZMA dictionary is too big for this implementation"
            r1.<init>(r0)
            throw r1
    }

    public static int getMemoryUsage(int r2, byte r3) throws org.tukaani.xz.UnsupportedOptionsException, org.tukaani.xz.CorruptedInputException {
            if (r2 < 0) goto L21
            r0 = 2147483632(0x7ffffff0, float:NaN)
            if (r2 > r0) goto L21
            r3 = r3 & 255(0xff, float:3.57E-43)
            r0 = 224(0xe0, float:3.14E-43)
            if (r3 > r0) goto L19
            int r3 = r3 % 45
            int r0 = r3 / 9
            int r1 = r0 * 9
            int r3 = r3 - r1
            int r2 = getMemoryUsage(r2, r3, r0)
            return r2
        L19:
            org.tukaani.xz.CorruptedInputException r2 = new org.tukaani.xz.CorruptedInputException
            java.lang.String r3 = "Invalid LZMA properties byte"
            r2.<init>(r3)
            throw r2
        L21:
            org.tukaani.xz.UnsupportedOptionsException r2 = new org.tukaani.xz.UnsupportedOptionsException
            java.lang.String r3 = "LZMA dictionary is too big for this implementation"
            r2.<init>(r3)
            throw r2
    }

    public static int getMemoryUsage(int r1, int r2, int r3) {
            if (r2 < 0) goto L1c
            r0 = 8
            if (r2 > r0) goto L1c
            if (r3 < 0) goto L1c
            r0 = 4
            if (r3 > r0) goto L1c
            int r1 = getDictSize(r1)
            int r1 = r1 / 1024
            int r1 = r1 + 10
            r0 = 1536(0x600, float:2.152E-42)
            int r2 = r2 + r3
            int r2 = r0 << r2
            int r2 = r2 / 1024
            int r1 = r1 + r2
            return r1
        L1c:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "Invalid lc or lp"
            r1.<init>(r2)
            throw r1
    }

    private void initialize(java.io.InputStream r11, long r12, byte r14, int r15, byte[] r16, org.tukaani.xz.ArrayCache r17) throws java.io.IOException {
            r10 = this;
            r7 = r15
            r0 = -1
            int r0 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            if (r0 < 0) goto L3c
            r0 = r14
            r0 = r0 & 255(0xff, float:3.57E-43)
            r1 = 224(0xe0, float:3.14E-43)
            if (r0 > r1) goto L34
            int r6 = r0 / 45
            int r1 = r6 * 45
            int r0 = r0 - r1
            int r5 = r0 / 9
            int r1 = r5 * 9
            int r4 = r0 - r1
            if (r7 < 0) goto L2c
            r0 = 2147483632(0x7ffffff0, float:NaN)
            if (r7 > r0) goto L2c
            r0 = r10
            r1 = r11
            r2 = r12
            r7 = r15
            r8 = r16
            r9 = r17
            r0.initialize(r1, r2, r4, r5, r6, r7, r8, r9)
            return
        L2c:
            org.tukaani.xz.UnsupportedOptionsException r0 = new org.tukaani.xz.UnsupportedOptionsException
            java.lang.String r1 = "LZMA dictionary is too big for this implementation"
            r0.<init>(r1)
            throw r0
        L34:
            org.tukaani.xz.CorruptedInputException r0 = new org.tukaani.xz.CorruptedInputException
            java.lang.String r1 = "Invalid LZMA properties byte"
            r0.<init>(r1)
            throw r0
        L3c:
            org.tukaani.xz.UnsupportedOptionsException r0 = new org.tukaani.xz.UnsupportedOptionsException
            java.lang.String r1 = "Uncompressed size is too big"
            r0.<init>(r1)
            throw r0
    }

    private void initialize(java.io.InputStream r7, long r8, int r10, int r11, int r12, int r13, byte[] r14, org.tukaani.xz.ArrayCache r15) throws java.io.IOException {
            r6 = this;
            r0 = -1
            int r0 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r0 < 0) goto L51
            if (r10 < 0) goto L51
            r0 = 8
            if (r10 > r0) goto L51
            if (r11 < 0) goto L51
            r0 = 4
            if (r11 > r0) goto L51
            if (r12 < 0) goto L51
            if (r12 > r0) goto L51
            r6.in = r7
            r6.arrayCache = r15
            int r13 = getDictSize(r13)
            r0 = 0
            int r0 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r0 < 0) goto L2d
            long r0 = (long) r13
            int r0 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            if (r0 <= 0) goto L2d
            int r13 = (int) r8
            int r13 = getDictSize(r13)
        L2d:
            org.tukaani.xz.lz.LZDecoder r0 = new org.tukaani.xz.lz.LZDecoder
            int r13 = getDictSize(r13)
            r0.<init>(r13, r14, r15)
            r6.lz = r0
            org.tukaani.xz.rangecoder.RangeDecoderFromStream r13 = new org.tukaani.xz.rangecoder.RangeDecoderFromStream
            r13.<init>(r7)
            r6.rc = r13
            org.tukaani.xz.lzma.LZMADecoder r7 = new org.tukaani.xz.lzma.LZMADecoder
            org.tukaani.xz.lz.LZDecoder r1 = r6.lz
            org.tukaani.xz.rangecoder.RangeDecoderFromStream r2 = r6.rc
            r0 = r7
            r3 = r10
            r4 = r11
            r5 = r12
            r0.<init>(r1, r2, r3, r4, r5)
            r6.lzma = r7
            r6.remainingSize = r8
            return
        L51:
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            r7.<init>()
            throw r7
    }

    private void putArraysToCache() {
            r2 = this;
            org.tukaani.xz.lz.LZDecoder r0 = r2.lz
            if (r0 == 0) goto Lc
            org.tukaani.xz.ArrayCache r1 = r2.arrayCache
            r0.putArraysToCache(r1)
            r0 = 0
            r2.lz = r0
        Lc:
            return
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws java.io.IOException {
            r2 = this;
            java.io.InputStream r0 = r2.in
            if (r0 == 0) goto L14
            r2.putArraysToCache()
            r0 = 0
            java.io.InputStream r1 = r2.in     // Catch: java.lang.Throwable -> L10
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

    public void enableRelaxedEndCondition() {
            r1 = this;
            r0 = 1
            r1.relaxedEndCondition = r0
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
    public int read(byte[] r13, int r14, int r15) throws java.io.IOException {
            r12 = this;
            if (r14 < 0) goto Ld6
            if (r15 < 0) goto Ld6
            int r0 = r14 + r15
            if (r0 < 0) goto Ld6
            int r1 = r13.length
            if (r0 > r1) goto Ld6
            r0 = 0
            if (r15 != 0) goto Lf
            return r0
        Lf:
            java.io.InputStream r1 = r12.in
            if (r1 == 0) goto Lce
            java.io.IOException r1 = r12.exception
            if (r1 != 0) goto Lcd
            boolean r1 = r12.endReached
            r2 = -1
            if (r1 == 0) goto L1d
            return r2
        L1d:
            if (r15 <= 0) goto Lcc
            long r3 = r12.remainingSize     // Catch: java.io.IOException -> Lc8
            r5 = 0
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 < 0) goto L2e
            long r7 = (long) r15     // Catch: java.io.IOException -> Lc8
            int r1 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r1 >= 0) goto L2e
            int r1 = (int) r3     // Catch: java.io.IOException -> Lc8
            goto L2f
        L2e:
            r1 = r15
        L2f:
            org.tukaani.xz.lz.LZDecoder r3 = r12.lz     // Catch: java.io.IOException -> Lc8
            r3.setLimit(r1)     // Catch: java.io.IOException -> Lc8
            r3 = -1
            r1 = 1
            org.tukaani.xz.lzma.LZMADecoder r7 = r12.lzma     // Catch: org.tukaani.xz.CorruptedInputException -> L3d java.io.IOException -> Lc8
            r7.decode()     // Catch: org.tukaani.xz.CorruptedInputException -> L3d java.io.IOException -> Lc8
            goto L53
        L3d:
            r7 = move-exception
            long r8 = r12.remainingSize     // Catch: java.io.IOException -> Lc8
            int r8 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r8 != 0) goto Lc7
            org.tukaani.xz.lzma.LZMADecoder r8 = r12.lzma     // Catch: java.io.IOException -> Lc8
            boolean r8 = r8.endMarkerDetected()     // Catch: java.io.IOException -> Lc8
            if (r8 == 0) goto Lc7
            r12.endReached = r1     // Catch: java.io.IOException -> Lc8
            org.tukaani.xz.rangecoder.RangeDecoderFromStream r7 = r12.rc     // Catch: java.io.IOException -> Lc8
            r7.normalize()     // Catch: java.io.IOException -> Lc8
        L53:
            org.tukaani.xz.lz.LZDecoder r7 = r12.lz     // Catch: java.io.IOException -> Lc8
            int r7 = r7.flush(r13, r14)     // Catch: java.io.IOException -> Lc8
            int r14 = r14 + r7
            int r15 = r15 - r7
            int r0 = r0 + r7
            long r8 = r12.remainingSize     // Catch: java.io.IOException -> Lc8
            int r10 = (r8 > r5 ? 1 : (r8 == r5 ? 0 : -1))
            if (r10 < 0) goto L6c
            long r10 = (long) r7     // Catch: java.io.IOException -> Lc8
            long r8 = r8 - r10
            r12.remainingSize = r8     // Catch: java.io.IOException -> Lc8
            int r5 = (r8 > r5 ? 1 : (r8 == r5 ? 0 : -1))
            if (r5 != 0) goto L6c
            r12.endReached = r1     // Catch: java.io.IOException -> Lc8
        L6c:
            boolean r5 = r12.endReached     // Catch: java.io.IOException -> Lc8
            if (r5 == 0) goto L1d
            org.tukaani.xz.lz.LZDecoder r13 = r12.lz     // Catch: java.io.IOException -> Lc8
            boolean r13 = r13.hasPending()     // Catch: java.io.IOException -> Lc8
            if (r13 != 0) goto Lc1
            org.tukaani.xz.rangecoder.RangeDecoderFromStream r13 = r12.rc     // Catch: java.io.IOException -> Lc8
            boolean r13 = r13.isFinished()     // Catch: java.io.IOException -> Lc8
            if (r13 != 0) goto Lb9
            long r13 = r12.remainingSize     // Catch: java.io.IOException -> Lc8
            int r13 = (r13 > r3 ? 1 : (r13 == r3 ? 0 : -1))
            if (r13 == 0) goto Lb3
            boolean r13 = r12.relaxedEndCondition     // Catch: java.io.IOException -> Lc8
            if (r13 == 0) goto Lb3
            org.tukaani.xz.lz.LZDecoder r13 = r12.lz     // Catch: java.io.IOException -> Lc8
            r13.setLimit(r1)     // Catch: java.io.IOException -> Lc8
            org.tukaani.xz.lzma.LZMADecoder r13 = r12.lzma     // Catch: org.tukaani.xz.CorruptedInputException -> L95 java.io.IOException -> Lc8
            r13.decode()     // Catch: org.tukaani.xz.CorruptedInputException -> L95 java.io.IOException -> Lc8
            goto Lac
        L95:
            r13 = move-exception
            org.tukaani.xz.lzma.LZMADecoder r14 = r12.lzma     // Catch: java.io.IOException -> Lc8
            boolean r14 = r14.endMarkerDetected()     // Catch: java.io.IOException -> Lc8
            if (r14 == 0) goto Lb2
            org.tukaani.xz.rangecoder.RangeDecoderFromStream r13 = r12.rc     // Catch: java.io.IOException -> Lc8
            r13.normalize()     // Catch: java.io.IOException -> Lc8
            org.tukaani.xz.rangecoder.RangeDecoderFromStream r13 = r12.rc     // Catch: java.io.IOException -> Lc8
            boolean r13 = r13.isFinished()     // Catch: java.io.IOException -> Lc8
            if (r13 == 0) goto Lac
            goto Lb9
        Lac:
            org.tukaani.xz.CorruptedInputException r13 = new org.tukaani.xz.CorruptedInputException     // Catch: java.io.IOException -> Lc8
            r13.<init>()     // Catch: java.io.IOException -> Lc8
            throw r13     // Catch: java.io.IOException -> Lc8
        Lb2:
            throw r13     // Catch: java.io.IOException -> Lc8
        Lb3:
            org.tukaani.xz.CorruptedInputException r13 = new org.tukaani.xz.CorruptedInputException     // Catch: java.io.IOException -> Lc8
            r13.<init>()     // Catch: java.io.IOException -> Lc8
            throw r13     // Catch: java.io.IOException -> Lc8
        Lb9:
            r12.putArraysToCache()     // Catch: java.io.IOException -> Lc8
            if (r0 != 0) goto Lbf
            goto Lc0
        Lbf:
            r2 = r0
        Lc0:
            return r2
        Lc1:
            org.tukaani.xz.CorruptedInputException r13 = new org.tukaani.xz.CorruptedInputException     // Catch: java.io.IOException -> Lc8
            r13.<init>()     // Catch: java.io.IOException -> Lc8
            throw r13     // Catch: java.io.IOException -> Lc8
        Lc7:
            throw r7     // Catch: java.io.IOException -> Lc8
        Lc8:
            r13 = move-exception
            r12.exception = r13
            throw r13
        Lcc:
            return r0
        Lcd:
            throw r1
        Lce:
            org.tukaani.xz.XZIOException r13 = new org.tukaani.xz.XZIOException
            java.lang.String r14 = "Stream closed"
            r13.<init>(r14)
            throw r13
        Ld6:
            java.lang.IndexOutOfBoundsException r13 = new java.lang.IndexOutOfBoundsException
            r13.<init>()
            throw r13
    }
}
