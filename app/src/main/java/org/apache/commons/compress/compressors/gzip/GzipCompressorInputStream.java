package org.apache.commons.compress.compressors.gzip;

/* JADX INFO: loaded from: classes2.dex */
public class GzipCompressorInputStream extends org.apache.commons.compress.compressors.CompressorInputStream implements org.apache.commons.compress.utils.InputStreamStatistics {
    private static final int FCOMMENT = 16;
    private static final int FEXTRA = 4;
    private static final int FHCRC = 2;
    private static final int FNAME = 8;
    private static final int FRESERVED = 224;
    private final byte[] buf;
    private int bufUsed;
    private final org.apache.commons.io.input.BoundedInputStream countingStream;
    private final java.util.zip.CRC32 crc;
    private final boolean decompressConcatenated;
    private boolean endReached;
    private final java.io.InputStream in;
    private java.util.zip.Inflater inf;
    private final byte[] oneByte;
    private final org.apache.commons.compress.compressors.gzip.GzipParameters parameters;

    public GzipCompressorInputStream(java.io.InputStream r2) throws java.io.IOException {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0)
            return
    }

    public GzipCompressorInputStream(java.io.InputStream r3, boolean r4) throws java.io.IOException {
            r2 = this;
            r2.<init>()
            r0 = 8192(0x2000, float:1.148E-41)
            byte[] r0 = new byte[r0]
            r2.buf = r0
            java.util.zip.Inflater r0 = new java.util.zip.Inflater
            r1 = 1
            r0.<init>(r1)
            r2.inf = r0
            java.util.zip.CRC32 r0 = new java.util.zip.CRC32
            r0.<init>()
            r2.crc = r0
            byte[] r0 = new byte[r1]
            r2.oneByte = r0
            org.apache.commons.compress.compressors.gzip.GzipParameters r0 = new org.apache.commons.compress.compressors.gzip.GzipParameters
            r0.<init>()
            r2.parameters = r0
            org.apache.commons.io.input.BoundedInputStream$Builder r0 = org.apache.commons.io.input.BoundedInputStream.builder()
            org.apache.commons.io.build.AbstractOriginSupplier r3 = r0.setInputStream(r3)
            org.apache.commons.io.input.BoundedInputStream$Builder r3 = (org.apache.commons.io.input.BoundedInputStream.Builder) r3
            org.apache.commons.io.input.BoundedInputStream r3 = r3.get()
            r2.countingStream = r3
            boolean r0 = r3.markSupported()
            if (r0 == 0) goto L3c
            r2.in = r3
            goto L43
        L3c:
            java.io.BufferedInputStream r0 = new java.io.BufferedInputStream
            r0.<init>(r3)
            r2.in = r0
        L43:
            r2.decompressConcatenated = r4
            r2.init(r1)
            return
    }

    private boolean init(boolean r9) throws java.io.IOException {
            r8 = this;
            if (r9 != 0) goto Lf
            boolean r0 = r8.decompressConcatenated
            if (r0 == 0) goto L7
            goto Lf
        L7:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "Unexpected: isFirstMember and decompressConcatenated are both false!"
            r9.<init>(r0)
            throw r9
        Lf:
            java.io.InputStream r0 = r8.in
            int r0 = r0.read()
            r1 = -1
            if (r0 != r1) goto L1c
            if (r9 != 0) goto L1c
            r9 = 0
            return r9
        L1c:
            r1 = 31
            if (r0 != r1) goto Le5
            java.io.InputStream r0 = r8.in
            int r0 = r0.read()
            r1 = 139(0x8b, float:1.95E-43)
            if (r0 == r1) goto L2c
            goto Le5
        L2c:
            java.io.DataInputStream r9 = new java.io.DataInputStream
            java.io.InputStream r0 = r8.in
            r9.<init>(r0)
            int r0 = r9.readUnsignedByte()
            r1 = 8
            if (r0 != r1) goto Lca
            int r0 = r9.readUnsignedByte()
            r2 = r0 & 224(0xe0, float:3.14E-43)
            if (r2 != 0) goto Lc2
            org.apache.commons.compress.compressors.gzip.GzipParameters r2 = r8.parameters
            r3 = 4
            long r4 = org.apache.commons.compress.utils.ByteUtils.fromLittleEndian(r9, r3)
            r6 = 1000(0x3e8, double:4.94E-321)
            long r4 = r4 * r6
            r2.setModificationTime(r4)
            int r2 = r9.readUnsignedByte()
            r4 = 1
            r5 = 2
            if (r2 == r5) goto L61
            if (r2 == r3) goto L5b
            goto L68
        L5b:
            org.apache.commons.compress.compressors.gzip.GzipParameters r2 = r8.parameters
            r2.setCompressionLevel(r4)
            goto L68
        L61:
            org.apache.commons.compress.compressors.gzip.GzipParameters r2 = r8.parameters
            r3 = 9
            r2.setCompressionLevel(r3)
        L68:
            org.apache.commons.compress.compressors.gzip.GzipParameters r2 = r8.parameters
            int r3 = r9.readUnsignedByte()
            r2.setOperatingSystem(r3)
            r2 = r0 & 4
            if (r2 == 0) goto L89
            int r2 = r9.readUnsignedByte()
            int r3 = r9.readUnsignedByte()
            int r1 = r3 << 8
            r1 = r1 | r2
        L80:
            int r2 = r1 + (-1)
            if (r1 <= 0) goto L89
            r9.readUnsignedByte()
            r1 = r2
            goto L80
        L89:
            r1 = r0 & 8
            if (r1 == 0) goto L9d
            org.apache.commons.compress.compressors.gzip.GzipParameters r1 = r8.parameters
            java.lang.String r2 = new java.lang.String
            byte[] r3 = readToNull(r9)
            java.nio.charset.Charset r6 = org.apache.commons.compress.compressors.gzip.GzipUtils.GZIP_ENCODING
            r2.<init>(r3, r6)
            r1.setFileName(r2)
        L9d:
            r1 = r0 & 16
            if (r1 == 0) goto Lb1
            org.apache.commons.compress.compressors.gzip.GzipParameters r1 = r8.parameters
            java.lang.String r2 = new java.lang.String
            byte[] r3 = readToNull(r9)
            java.nio.charset.Charset r6 = org.apache.commons.compress.compressors.gzip.GzipUtils.GZIP_ENCODING
            r2.<init>(r3, r6)
            r1.setComment(r2)
        Lb1:
            r0 = r0 & r5
            if (r0 == 0) goto Lb7
            r9.readShort()
        Lb7:
            java.util.zip.Inflater r9 = r8.inf
            r9.reset()
            java.util.zip.CRC32 r9 = r8.crc
            r9.reset()
            return r4
        Lc2:
            java.io.IOException r9 = new java.io.IOException
            java.lang.String r0 = "Reserved flags are set in the .gz header"
            r9.<init>(r0)
            throw r9
        Lca:
            java.io.IOException r9 = new java.io.IOException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Unsupported compression method "
            r1.<init>(r2)
            java.lang.StringBuilder r0 = r1.append(r0)
            java.lang.String r1 = " in the .gz header"
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            r9.<init>(r0)
            throw r9
        Le5:
            java.io.IOException r0 = new java.io.IOException
            if (r9 == 0) goto Lec
            java.lang.String r9 = "Input is not in the .gz format"
            goto Lee
        Lec:
            java.lang.String r9 = "Garbage after a valid .gz stream"
        Lee:
            r0.<init>(r9)
            throw r0
    }

    public static boolean matches(byte[] r2, int r3) {
            r0 = 2
            r1 = 0
            if (r3 < r0) goto L12
            r3 = r2[r1]
            r0 = 31
            if (r3 != r0) goto L12
            r3 = 1
            r2 = r2[r3]
            r0 = -117(0xffffffffffffff8b, float:NaN)
            if (r2 != r0) goto L12
            r1 = r3
        L12:
            return r1
    }

    private static byte[] readToNull(java.io.DataInput r2) throws java.io.IOException {
            java.io.ByteArrayOutputStream r0 = new java.io.ByteArrayOutputStream
            r0.<init>()
        L5:
            int r1 = r2.readUnsignedByte()     // Catch: java.lang.Throwable -> L17
            if (r1 == 0) goto Lf
            r0.write(r1)     // Catch: java.lang.Throwable -> L17
            goto L5
        Lf:
            byte[] r2 = r0.toByteArray()     // Catch: java.lang.Throwable -> L17
            r0.close()
            return r2
        L17:
            r2 = move-exception
            r0.close()     // Catch: java.lang.Throwable -> L1c
            goto L20
        L1c:
            r0 = move-exception
            r2.addSuppressed(r0)
        L20:
            throw r2
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws java.io.IOException {
            r2 = this;
            java.util.zip.Inflater r0 = r2.inf
            if (r0 == 0) goto La
            r0.end()
            r0 = 0
            r2.inf = r0
        La:
            java.io.InputStream r0 = r2.in
            java.io.InputStream r1 = java.lang.System.in
            if (r0 == r1) goto L15
            java.io.InputStream r0 = r2.in
            r0.close()
        L15:
            return
    }

    @Override // org.apache.commons.compress.utils.InputStreamStatistics
    public long getCompressedCount() {
            r2 = this;
            org.apache.commons.io.input.BoundedInputStream r0 = r2.countingStream
            long r0 = r0.getCount()
            return r0
    }

    public org.apache.commons.compress.compressors.gzip.GzipParameters getMetaData() {
            r1 = this;
            org.apache.commons.compress.compressors.gzip.GzipParameters r0 = r1.parameters
            return r0
    }

    @Override // java.io.InputStream
    public int read() throws java.io.IOException {
            r3 = this;
            byte[] r0 = r3.oneByte
            r1 = 1
            r2 = 0
            int r0 = r3.read(r0, r2, r1)
            r1 = -1
            if (r0 != r1) goto Lc
            goto L12
        Lc:
            byte[] r0 = r3.oneByte
            r0 = r0[r2]
            r1 = r0 & 255(0xff, float:3.57E-43)
        L12:
            return r1
    }

    @Override // java.io.InputStream
    public int read(byte[] r10, int r11, int r12) throws java.io.IOException {
            r9 = this;
            r0 = 0
            if (r12 != 0) goto L4
            return r0
        L4:
            boolean r1 = r9.endReached
            r2 = -1
            if (r1 == 0) goto La
            return r2
        La:
            r1 = r0
        Lb:
            if (r12 <= 0) goto Lcd
            java.util.zip.Inflater r3 = r9.inf
            boolean r3 = r3.needsInput()
            if (r3 == 0) goto L37
            java.io.InputStream r3 = r9.in
            byte[] r4 = r9.buf
            int r4 = r4.length
            r3.mark(r4)
            java.io.InputStream r3 = r9.in
            byte[] r4 = r9.buf
            int r3 = r3.read(r4)
            r9.bufUsed = r3
            if (r3 == r2) goto L31
            java.util.zip.Inflater r4 = r9.inf
            byte[] r5 = r9.buf
            r4.setInput(r5, r0, r3)
            goto L37
        L31:
            java.io.EOFException r10 = new java.io.EOFException
            r10.<init>()
            throw r10
        L37:
            java.util.zip.Inflater r3 = r9.inf     // Catch: java.util.zip.DataFormatException -> Lc5
            int r3 = r3.inflate(r10, r11, r12)     // Catch: java.util.zip.DataFormatException -> Lc5
            java.util.zip.CRC32 r4 = r9.crc
            r4.update(r10, r11, r3)
            int r11 = r11 + r3
            int r12 = r12 - r3
            int r1 = r1 + r3
            r9.count(r3)
            java.util.zip.Inflater r3 = r9.inf
            boolean r3 = r3.finished()
            if (r3 == 0) goto Lb
            java.io.InputStream r3 = r9.in
            r3.reset()
            int r3 = r9.bufUsed
            java.util.zip.Inflater r4 = r9.inf
            int r4 = r4.getRemaining()
            int r3 = r3 - r4
            java.io.InputStream r4 = r9.in
            long r5 = (long) r3
            long r3 = org.apache.commons.io.IOUtils.skip(r4, r5)
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r3 != 0) goto Lbf
            r9.bufUsed = r0
            java.io.DataInputStream r3 = new java.io.DataInputStream
            java.io.InputStream r4 = r9.in
            r3.<init>(r4)
            r4 = 4
            long r5 = org.apache.commons.compress.utils.ByteUtils.fromLittleEndian(r3, r4)
            java.util.zip.CRC32 r7 = r9.crc
            long r7 = r7.getValue()
            int r5 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r5 != 0) goto Lb7
            long r3 = org.apache.commons.compress.utils.ByteUtils.fromLittleEndian(r3, r4)
            java.util.zip.Inflater r5 = r9.inf
            long r5 = r5.getBytesWritten()
            r7 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r5 = r5 & r7
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r3 != 0) goto Laf
            boolean r3 = r9.decompressConcatenated
            if (r3 == 0) goto L9f
            boolean r3 = r9.init(r0)
            if (r3 != 0) goto Lb
        L9f:
            java.util.zip.Inflater r10 = r9.inf
            r10.end()
            r10 = 0
            r9.inf = r10
            r10 = 1
            r9.endReached = r10
            if (r1 != 0) goto Lad
            goto Lae
        Lad:
            r2 = r1
        Lae:
            return r2
        Laf:
            java.io.IOException r10 = new java.io.IOException
            java.lang.String r11 = "Gzip-compressed data is corrupt(uncompressed size mismatch)"
            r10.<init>(r11)
            throw r10
        Lb7:
            java.io.IOException r10 = new java.io.IOException
            java.lang.String r11 = "Gzip-compressed data is corrupt (CRC32 error)"
            r10.<init>(r11)
            throw r10
        Lbf:
            java.io.IOException r10 = new java.io.IOException
            r10.<init>()
            throw r10
        Lc5:
            java.io.IOException r10 = new java.io.IOException
            java.lang.String r11 = "Gzip-compressed data is corrupt"
            r10.<init>(r11)
            throw r10
        Lcd:
            return r1
    }
}
