package org.apache.commons.compress.compressors.snappy;

/* JADX INFO: loaded from: classes2.dex */
public class FramedSnappyCompressorInputStream extends org.apache.commons.compress.compressors.CompressorInputStream implements org.apache.commons.compress.utils.InputStreamStatistics {
    static final int COMPRESSED_CHUNK_TYPE = 0;
    static final long MASK_OFFSET = 2726488792L;
    private static final int MAX_SKIPPABLE_TYPE = 253;
    private static final int MAX_UNSKIPPABLE_TYPE = 127;
    private static final int MIN_UNSKIPPABLE_TYPE = 2;
    private static final int PADDING_CHUNK_TYPE = 254;
    private static final int STREAM_IDENTIFIER_TYPE = 255;
    static final byte[] SZ_SIGNATURE = null;
    private static final int UNCOMPRESSED_CHUNK_TYPE = 1;
    private final int blockSize;
    private final org.apache.commons.codec.digest.PureJavaCrc32C checksum;
    private final org.apache.commons.io.input.BoundedInputStream countingStream;
    private org.apache.commons.compress.compressors.snappy.SnappyCompressorInputStream currentCompressedChunk;
    private final org.apache.commons.compress.compressors.snappy.FramedSnappyDialect dialect;
    private boolean endReached;
    private long expectedChecksum;
    private boolean inUncompressedChunk;
    private final java.io.PushbackInputStream inputStream;
    private final byte[] oneByte;
    private final org.apache.commons.compress.utils.ByteUtils.ByteSupplier supplier;
    private int uncompressedBytesRemaining;
    private long unreadBytes;

    /* JADX INFO: renamed from: $r8$lambda$-DAvSMx8j7UwtIodSzxoNOaMKBM, reason: not valid java name */
    public static /* synthetic */ int m2549$r8$lambda$DAvSMx8j7UwtIodSzxoNOaMKBM(org.apache.commons.compress.compressors.snappy.FramedSnappyCompressorInputStream r0) {
            int r0 = r0.readOneByte()
            return r0
    }

    static {
            r0 = 10
            byte[] r0 = new byte[r0]
            r0 = {x000a: FILL_ARRAY_DATA , data: [-1, 6, 0, 0, 115, 78, 97, 80, 112, 89} // fill-array
            org.apache.commons.compress.compressors.snappy.FramedSnappyCompressorInputStream.SZ_SIGNATURE = r0
            return
    }

    public FramedSnappyCompressorInputStream(java.io.InputStream r2) throws java.io.IOException {
            r1 = this;
            org.apache.commons.compress.compressors.snappy.FramedSnappyDialect r0 = org.apache.commons.compress.compressors.snappy.FramedSnappyDialect.STANDARD
            r1.<init>(r2, r0)
            return
    }

    public FramedSnappyCompressorInputStream(java.io.InputStream r4, int r5, org.apache.commons.compress.compressors.snappy.FramedSnappyDialect r6) throws java.io.IOException {
            r3 = this;
            r3.<init>()
            r0 = 1
            byte[] r1 = new byte[r0]
            r3.oneByte = r1
            r1 = -1
            r3.expectedChecksum = r1
            org.apache.commons.codec.digest.PureJavaCrc32C r1 = new org.apache.commons.codec.digest.PureJavaCrc32C
            r1.<init>()
            r3.checksum = r1
            org.apache.commons.compress.compressors.snappy.FramedSnappyCompressorInputStream$$ExternalSyntheticLambda0 r1 = new org.apache.commons.compress.compressors.snappy.FramedSnappyCompressorInputStream$$ExternalSyntheticLambda0
            r1.<init>(r3)
            r3.supplier = r1
            if (r5 <= 0) goto L41
            org.apache.commons.io.input.BoundedInputStream$Builder r1 = org.apache.commons.io.input.BoundedInputStream.builder()
            org.apache.commons.io.build.AbstractOriginSupplier r4 = r1.setInputStream(r4)
            org.apache.commons.io.input.BoundedInputStream$Builder r4 = (org.apache.commons.io.input.BoundedInputStream.Builder) r4
            org.apache.commons.io.input.BoundedInputStream r4 = r4.get()
            r3.countingStream = r4
            java.io.PushbackInputStream r1 = new java.io.PushbackInputStream
            r1.<init>(r4, r0)
            r3.inputStream = r1
            r3.blockSize = r5
            r3.dialect = r6
            boolean r4 = r6.hasStreamIdentifier()
            if (r4 == 0) goto L40
            r3.readStreamIdentifier()
        L40:
            return
        L41:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r5 = "blockSize must be bigger than 0"
            r4.<init>(r5)
            throw r4
    }

    public FramedSnappyCompressorInputStream(java.io.InputStream r2, org.apache.commons.compress.compressors.snappy.FramedSnappyDialect r3) throws java.io.IOException {
            r1 = this;
            r0 = 32768(0x8000, float:4.5918E-41)
            r1.<init>(r2, r0, r3)
            return
    }

    public static boolean matches(byte[] r2, int r3) {
            byte[] r0 = org.apache.commons.compress.compressors.snappy.FramedSnappyCompressorInputStream.SZ_SIGNATURE
            int r1 = r0.length
            if (r3 >= r1) goto L7
            r2 = 0
            return r2
        L7:
            int r3 = r2.length
            int r1 = r0.length
            if (r3 <= r1) goto L10
            int r3 = r0.length
            byte[] r2 = java.util.Arrays.copyOf(r2, r3)
        L10:
            boolean r2 = java.util.Arrays.equals(r2, r0)
            return r2
    }

    private long readCrc() throws java.io.IOException {
            r3 = this;
            r0 = 4
            byte[] r1 = new byte[r0]
            java.io.PushbackInputStream r2 = r3.inputStream
            int r2 = org.apache.commons.compress.utils.IOUtils.readFully(r2, r1)
            r3.count(r2)
            if (r2 != r0) goto L13
            long r0 = org.apache.commons.compress.utils.ByteUtils.fromLittleEndian(r1)
            return r0
        L13:
            java.io.IOException r0 = new java.io.IOException
            java.lang.String r1 = "Premature end of stream"
            r0.<init>(r1)
            throw r0
    }

    private void readNextBlock() throws java.io.IOException {
            r9 = this;
            r9.verifyLastChecksumAndReset()
            r0 = 0
            r9.inUncompressedChunk = r0
            int r1 = r9.readOneByte()
            r2 = -1
            r3 = 1
            if (r1 != r2) goto L12
            r9.endReached = r3
            goto L10b
        L12:
            r2 = 255(0xff, float:3.57E-43)
            if (r1 != r2) goto L2d
            java.io.PushbackInputStream r0 = r9.inputStream
            r0.unread(r1)
            long r0 = r9.unreadBytes
            r2 = 1
            long r0 = r0 + r2
            r9.unreadBytes = r0
            r9.pushedBackBytes(r2)
            r9.readStreamIdentifier()
            r9.readNextBlock()
            goto L10b
        L2d:
            r2 = 254(0xfe, float:3.56E-43)
            if (r1 == r2) goto L105
            r2 = 127(0x7f, float:1.78E-43)
            if (r1 <= r2) goto L3b
            r4 = 253(0xfd, float:3.55E-43)
            if (r1 > r4) goto L3b
            goto L105
        L3b:
            r4 = 2
            if (r1 < r4) goto L6a
            if (r1 <= r2) goto L41
            goto L6a
        L41:
            java.io.IOException r0 = new java.io.IOException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Unskippable chunk with type "
            r2.<init>(r3)
            java.lang.StringBuilder r2 = r2.append(r1)
            java.lang.String r3 = " (hex "
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r1 = java.lang.Integer.toHexString(r1)
            java.lang.StringBuilder r1 = r2.append(r1)
            java.lang.String r2 = ") detected."
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L6a:
            java.lang.String r2 = "Found illegal chunk with negative size"
            if (r1 != r3) goto L8c
            r9.inUncompressedChunk = r3
            int r0 = r9.readSize()
            int r0 = r0 + (-4)
            r9.uncompressedBytesRemaining = r0
            if (r0 < 0) goto L86
            long r0 = r9.readCrc()
            long r0 = unmask(r0)
            r9.expectedChecksum = r0
            goto L10b
        L86:
            java.io.IOException r0 = new java.io.IOException
            r0.<init>(r2)
            throw r0
        L8c:
            if (r1 != 0) goto Lea
            org.apache.commons.compress.compressors.snappy.FramedSnappyDialect r1 = r9.dialect
            boolean r1 = r1.usesChecksumWithCompressedChunks()
            int r3 = r9.readSize()
            long r3 = (long) r3
            r5 = 0
            if (r1 == 0) goto La0
            r7 = 4
            goto La1
        La0:
            r7 = r5
        La1:
            long r3 = r3 - r7
            int r5 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r5 < 0) goto Le4
            if (r1 == 0) goto Lb3
            long r1 = r9.readCrc()
            long r1 = unmask(r1)
            r9.expectedChecksum = r1
            goto Lb7
        Lb3:
            r1 = -1
            r9.expectedChecksum = r1
        Lb7:
            org.apache.commons.compress.compressors.snappy.SnappyCompressorInputStream r1 = new org.apache.commons.compress.compressors.snappy.SnappyCompressorInputStream
            org.apache.commons.io.input.BoundedInputStream$Builder r2 = org.apache.commons.io.input.BoundedInputStream.builder()
            java.io.PushbackInputStream r5 = r9.inputStream
            org.apache.commons.io.build.AbstractOriginSupplier r2 = r2.setInputStream(r5)
            org.apache.commons.io.input.BoundedInputStream$Builder r2 = (org.apache.commons.io.input.BoundedInputStream.Builder) r2
            org.apache.commons.io.input.BoundedInputStream$AbstractBuilder r2 = r2.setMaxCount(r3)
            org.apache.commons.io.input.BoundedInputStream$Builder r2 = (org.apache.commons.io.input.BoundedInputStream.Builder) r2
            org.apache.commons.io.input.BoundedInputStream$AbstractBuilder r0 = r2.setPropagateClose(r0)
            org.apache.commons.io.input.BoundedInputStream$Builder r0 = (org.apache.commons.io.input.BoundedInputStream.Builder) r0
            org.apache.commons.io.input.BoundedInputStream r0 = r0.get()
            int r2 = r9.blockSize
            r1.<init>(r0, r2)
            r9.currentCompressedChunk = r1
            long r0 = r1.getBytesRead()
            r9.count(r0)
            goto L10b
        Le4:
            java.io.IOException r0 = new java.io.IOException
            r0.<init>(r2)
            throw r0
        Lea:
            java.io.IOException r0 = new java.io.IOException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Unknown chunk type "
            r2.<init>(r3)
            java.lang.StringBuilder r1 = r2.append(r1)
            java.lang.String r2 = " detected."
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L105:
            r9.skipBlock()
            r9.readNextBlock()
        L10b:
            return
    }

    private int readOnce(byte[] r5, int r6, int r7) throws java.io.IOException {
            r4 = this;
            boolean r0 = r4.inUncompressedChunk
            r1 = -1
            if (r0 == 0) goto L1f
            int r0 = r4.uncompressedBytesRemaining
            int r7 = java.lang.Math.min(r0, r7)
            if (r7 != 0) goto Le
            return r1
        Le:
            java.io.PushbackInputStream r0 = r4.inputStream
            int r7 = r0.read(r5, r6, r7)
            if (r7 == r1) goto L42
            int r0 = r4.uncompressedBytesRemaining
            int r0 = r0 - r7
            r4.uncompressedBytesRemaining = r0
            r4.count(r7)
            goto L42
        L1f:
            org.apache.commons.compress.compressors.snappy.SnappyCompressorInputStream r0 = r4.currentCompressedChunk
            if (r0 == 0) goto L43
            long r2 = r0.getBytesRead()
            org.apache.commons.compress.compressors.snappy.SnappyCompressorInputStream r0 = r4.currentCompressedChunk
            int r7 = r0.read(r5, r6, r7)
            if (r7 != r1) goto L38
            org.apache.commons.compress.compressors.snappy.SnappyCompressorInputStream r0 = r4.currentCompressedChunk
            r0.close()
            r0 = 0
            r4.currentCompressedChunk = r0
            goto L42
        L38:
            org.apache.commons.compress.compressors.snappy.SnappyCompressorInputStream r0 = r4.currentCompressedChunk
            long r0 = r0.getBytesRead()
            long r0 = r0 - r2
            r4.count(r0)
        L42:
            r1 = r7
        L43:
            if (r1 <= 0) goto L4a
            org.apache.commons.codec.digest.PureJavaCrc32C r7 = r4.checksum
            r7.update(r5, r6, r1)
        L4a:
            return r1
    }

    private int readOneByte() throws java.io.IOException {
            r2 = this;
            java.io.PushbackInputStream r0 = r2.inputStream
            int r0 = r0.read()
            r1 = -1
            if (r0 == r1) goto L10
            r1 = 1
            r2.count(r1)
            r0 = r0 & 255(0xff, float:3.57E-43)
            return r0
        L10:
            return r1
    }

    private int readSize() throws java.io.IOException {
            r2 = this;
            org.apache.commons.compress.utils.ByteUtils$ByteSupplier r0 = r2.supplier
            r1 = 3
            long r0 = org.apache.commons.compress.utils.ByteUtils.fromLittleEndian(r0, r1)
            int r0 = (int) r0
            return r0
    }

    private void readStreamIdentifier() throws java.io.IOException {
            r3 = this;
            r0 = 10
            byte[] r1 = new byte[r0]
            java.io.PushbackInputStream r2 = r3.inputStream
            int r2 = org.apache.commons.compress.utils.IOUtils.readFully(r2, r1)
            r3.count(r2)
            if (r0 != r2) goto L16
            boolean r0 = matches(r1, r0)
            if (r0 == 0) goto L16
            return
        L16:
            java.io.IOException r0 = new java.io.IOException
            java.lang.String r1 = "Not a framed Snappy stream"
            r0.<init>(r1)
            throw r0
    }

    private void skipBlock() throws java.io.IOException {
            r4 = this;
            int r0 = r4.readSize()
            if (r0 < 0) goto L1d
            java.io.PushbackInputStream r1 = r4.inputStream
            long r2 = (long) r0
            long r0 = org.apache.commons.io.IOUtils.skip(r1, r2)
            r4.count(r0)
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 != 0) goto L15
            return
        L15:
            java.io.IOException r0 = new java.io.IOException
            java.lang.String r1 = "Premature end of stream"
            r0.<init>(r1)
            throw r0
        L1d:
            java.io.IOException r0 = new java.io.IOException
            java.lang.String r1 = "Found illegal chunk with negative size"
            r0.<init>(r1)
            throw r0
    }

    static long unmask(long r5) {
            r0 = 2726488792(0xa282ead8, double:1.347064446E-314)
            long r5 = r5 - r0
            r0 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r5 = r5 & r0
            r2 = 17
            long r2 = r5 >> r2
            r4 = 15
            long r5 = r5 << r4
            long r5 = r5 | r2
            long r5 = r5 & r0
            return r5
    }

    private void verifyLastChecksumAndReset() throws java.io.IOException {
            r4 = this;
            long r0 = r4.expectedChecksum
            r2 = 0
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 < 0) goto L1b
            org.apache.commons.codec.digest.PureJavaCrc32C r2 = r4.checksum
            long r2 = r2.getValue()
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 != 0) goto L13
            goto L1b
        L13:
            java.io.IOException r0 = new java.io.IOException
            java.lang.String r1 = "Checksum verification failed"
            r0.<init>(r1)
            throw r0
        L1b:
            r0 = -1
            r4.expectedChecksum = r0
            org.apache.commons.codec.digest.PureJavaCrc32C r0 = r4.checksum
            r0.reset()
            return
    }

    @Override // java.io.InputStream
    public int available() throws java.io.IOException {
            r2 = this;
            boolean r0 = r2.inUncompressedChunk
            if (r0 == 0) goto L11
            int r0 = r2.uncompressedBytesRemaining
            java.io.PushbackInputStream r1 = r2.inputStream
            int r1 = r1.available()
            int r0 = java.lang.Math.min(r0, r1)
            return r0
        L11:
            org.apache.commons.compress.compressors.snappy.SnappyCompressorInputStream r0 = r2.currentCompressedChunk
            if (r0 == 0) goto L1a
            int r0 = r0.available()
            return r0
        L1a:
            r0 = 0
            return r0
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws java.io.IOException {
            r2 = this;
            org.apache.commons.compress.compressors.snappy.SnappyCompressorInputStream r0 = r2.currentCompressedChunk     // Catch: java.lang.Throwable -> L10
            if (r0 == 0) goto La
            r0.close()     // Catch: java.lang.Throwable -> L10
            r0 = 0
            r2.currentCompressedChunk = r0     // Catch: java.lang.Throwable -> L10
        La:
            java.io.PushbackInputStream r0 = r2.inputStream
            r0.close()
            return
        L10:
            r0 = move-exception
            java.io.PushbackInputStream r1 = r2.inputStream
            r1.close()
            throw r0
    }

    @Override // org.apache.commons.compress.utils.InputStreamStatistics
    public long getCompressedCount() {
            r4 = this;
            org.apache.commons.io.input.BoundedInputStream r0 = r4.countingStream
            long r0 = r0.getCount()
            long r2 = r4.unreadBytes
            long r0 = r0 - r2
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
    public int read(byte[] r3, int r4, int r5) throws java.io.IOException {
            r2 = this;
            if (r5 != 0) goto L4
            r3 = 0
            return r3
        L4:
            int r0 = r2.readOnce(r3, r4, r5)
            r1 = -1
            if (r0 != r1) goto L17
            r2.readNextBlock()
            boolean r0 = r2.endReached
            if (r0 == 0) goto L13
            return r1
        L13:
            int r0 = r2.readOnce(r3, r4, r5)
        L17:
            return r0
    }
}
