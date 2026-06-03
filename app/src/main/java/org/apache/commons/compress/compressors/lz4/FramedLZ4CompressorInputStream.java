package org.apache.commons.compress.compressors.lz4;

/* JADX INFO: loaded from: classes2.dex */
public class FramedLZ4CompressorInputStream extends org.apache.commons.compress.compressors.CompressorInputStream implements org.apache.commons.compress.utils.InputStreamStatistics {
    static final int BLOCK_CHECKSUM_MASK = 16;
    static final int BLOCK_INDEPENDENCE_MASK = 32;
    static final int BLOCK_MAX_SIZE_MASK = 112;
    static final int CONTENT_CHECKSUM_MASK = 4;
    static final int CONTENT_SIZE_MASK = 8;
    static final byte[] LZ4_SIGNATURE = null;
    private static final byte SKIPPABLE_FRAME_PREFIX_BYTE_MASK = 80;
    private static final byte[] SKIPPABLE_FRAME_TRAILER = null;
    static final int SUPPORTED_VERSION = 64;
    static final int UNCOMPRESSED_FLAG_MASK = Integer.MIN_VALUE;
    static final int VERSION_MASK = 192;
    private byte[] blockDependencyBuffer;
    private final org.apache.commons.codec.digest.XXHash32 blockHash;
    private final org.apache.commons.codec.digest.XXHash32 contentHash;
    private java.io.InputStream currentBlock;
    private final boolean decompressConcatenated;
    private boolean endReached;
    private boolean expectBlockChecksum;
    private boolean expectBlockDependency;
    private boolean expectContentChecksum;
    private boolean inUncompressed;
    private final org.apache.commons.io.input.BoundedInputStream inputStream;
    private final byte[] oneByte;
    private final org.apache.commons.compress.utils.ByteUtils.ByteSupplier supplier;

    public static /* synthetic */ int $r8$lambda$PtEEfWy_YIMWdq9j1iaDUbmT8xs(org.apache.commons.compress.compressors.lz4.FramedLZ4CompressorInputStream r0) {
            int r0 = r0.readOneByte()
            return r0
    }

    static {
            r0 = 4
            byte[] r0 = new byte[r0]
            r0 = {x0012: FILL_ARRAY_DATA , data: [4, 34, 77, 24} // fill-array
            org.apache.commons.compress.compressors.lz4.FramedLZ4CompressorInputStream.LZ4_SIGNATURE = r0
            r0 = 3
            byte[] r0 = new byte[r0]
            r0 = {x0018: FILL_ARRAY_DATA , data: [42, 77, 24} // fill-array
            org.apache.commons.compress.compressors.lz4.FramedLZ4CompressorInputStream.SKIPPABLE_FRAME_TRAILER = r0
            return
    }

    public FramedLZ4CompressorInputStream(java.io.InputStream r2) throws java.io.IOException {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0)
            return
    }

    public FramedLZ4CompressorInputStream(java.io.InputStream r3, boolean r4) throws java.io.IOException {
            r2 = this;
            r2.<init>()
            r0 = 1
            byte[] r1 = new byte[r0]
            r2.oneByte = r1
            org.apache.commons.compress.compressors.lz4.FramedLZ4CompressorInputStream$$ExternalSyntheticLambda0 r1 = new org.apache.commons.compress.compressors.lz4.FramedLZ4CompressorInputStream$$ExternalSyntheticLambda0
            r1.<init>(r2)
            r2.supplier = r1
            org.apache.commons.codec.digest.XXHash32 r1 = new org.apache.commons.codec.digest.XXHash32
            r1.<init>()
            r2.contentHash = r1
            org.apache.commons.codec.digest.XXHash32 r1 = new org.apache.commons.codec.digest.XXHash32
            r1.<init>()
            r2.blockHash = r1
            org.apache.commons.io.input.BoundedInputStream$Builder r1 = org.apache.commons.io.input.BoundedInputStream.builder()
            org.apache.commons.io.build.AbstractOriginSupplier r3 = r1.setInputStream(r3)
            org.apache.commons.io.input.BoundedInputStream$Builder r3 = (org.apache.commons.io.input.BoundedInputStream.Builder) r3
            org.apache.commons.io.input.BoundedInputStream r3 = r3.get()
            r2.inputStream = r3
            r2.decompressConcatenated = r4
            r2.init(r0)
            return
    }

    private void appendToBlockDependencyBuffer(byte[] r4, int r5, int r6) {
            r3 = this;
            byte[] r0 = r3.blockDependencyBuffer
            int r0 = r0.length
            int r6 = java.lang.Math.min(r6, r0)
            if (r6 <= 0) goto L18
            byte[] r0 = r3.blockDependencyBuffer
            int r1 = r0.length
            int r1 = r1 - r6
            if (r1 <= 0) goto L13
            r2 = 0
            java.lang.System.arraycopy(r0, r6, r0, r2, r1)
        L13:
            byte[] r0 = r3.blockDependencyBuffer
            java.lang.System.arraycopy(r4, r5, r0, r1, r6)
        L18:
            return
    }

    private void init(boolean r1) throws java.io.IOException {
            r0 = this;
            boolean r1 = r0.readSignature(r1)
            if (r1 == 0) goto Lc
            r0.readFrameDescriptor()
            r0.nextBlock()
        Lc:
            return
    }

    private static boolean isSkippableFrameSignature(byte[] r6) {
            r0 = 0
            r1 = r6[r0]
            r2 = 80
            r1 = r1 & r2
            if (r1 == r2) goto L9
            return r0
        L9:
            r1 = 1
            r2 = r1
        Lb:
            r3 = 4
            if (r2 >= r3) goto L1c
            r3 = r6[r2]
            byte[] r4 = org.apache.commons.compress.compressors.lz4.FramedLZ4CompressorInputStream.SKIPPABLE_FRAME_TRAILER
            int r5 = r2 + (-1)
            r4 = r4[r5]
            if (r3 == r4) goto L19
            return r0
        L19:
            int r2 = r2 + 1
            goto Lb
        L1c:
            return r1
    }

    public static boolean matches(byte[] r2, int r3) {
            byte[] r0 = org.apache.commons.compress.compressors.lz4.FramedLZ4CompressorInputStream.LZ4_SIGNATURE
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

    private void maybeFinishCurrentBlock() throws java.io.IOException {
            r2 = this;
            java.io.InputStream r0 = r2.currentBlock
            if (r0 == 0) goto L1a
            r0.close()
            r0 = 0
            r2.currentBlock = r0
            boolean r0 = r2.expectBlockChecksum
            if (r0 == 0) goto L1a
            org.apache.commons.codec.digest.XXHash32 r0 = r2.blockHash
            java.lang.String r1 = "block"
            r2.verifyChecksum(r0, r1)
            org.apache.commons.codec.digest.XXHash32 r0 = r2.blockHash
            r0.reset()
        L1a:
            return
    }

    private void nextBlock() throws java.io.IOException {
            r7 = this;
            r7.maybeFinishCurrentBlock()
            org.apache.commons.compress.utils.ByteUtils$ByteSupplier r0 = r7.supplier
            r1 = 4
            long r0 = org.apache.commons.compress.utils.ByteUtils.fromLittleEndian(r0, r1)
            r2 = -2147483648(0xffffffff80000000, double:NaN)
            long r2 = r2 & r0
            r4 = 0
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L18
            r2 = r3
            goto L19
        L18:
            r2 = r4
        L19:
            r5 = 2147483647(0x7fffffff, double:1.060997895E-314)
            long r0 = r0 & r5
            int r0 = (int) r0
            if (r0 != 0) goto L2e
            r7.verifyContentChecksum()
            boolean r0 = r7.decompressConcatenated
            if (r0 != 0) goto L2a
            r7.endReached = r3
            goto L2d
        L2a:
            r7.init(r4)
        L2d:
            return
        L2e:
            org.apache.commons.io.input.BoundedInputStream$Builder r1 = org.apache.commons.io.input.BoundedInputStream.builder()
            org.apache.commons.io.input.BoundedInputStream r5 = r7.inputStream
            org.apache.commons.io.build.AbstractOriginSupplier r1 = r1.setInputStream(r5)
            org.apache.commons.io.input.BoundedInputStream$Builder r1 = (org.apache.commons.io.input.BoundedInputStream.Builder) r1
            long r5 = (long) r0
            org.apache.commons.io.input.BoundedInputStream$AbstractBuilder r0 = r1.setMaxCount(r5)
            org.apache.commons.io.input.BoundedInputStream$Builder r0 = (org.apache.commons.io.input.BoundedInputStream.Builder) r0
            org.apache.commons.io.input.BoundedInputStream$AbstractBuilder r0 = r0.setPropagateClose(r4)
            org.apache.commons.io.input.BoundedInputStream$Builder r0 = (org.apache.commons.io.input.BoundedInputStream.Builder) r0
            org.apache.commons.io.input.BoundedInputStream r0 = r0.get()
            boolean r1 = r7.expectBlockChecksum
            if (r1 == 0) goto L57
            java.util.zip.CheckedInputStream r1 = new java.util.zip.CheckedInputStream
            org.apache.commons.codec.digest.XXHash32 r5 = r7.blockHash
            r1.<init>(r0, r5)
            r0 = r1
        L57:
            if (r2 == 0) goto L5e
            r7.inUncompressed = r3
            r7.currentBlock = r0
            goto L70
        L5e:
            r7.inUncompressed = r4
            org.apache.commons.compress.compressors.lz4.BlockLZ4CompressorInputStream r1 = new org.apache.commons.compress.compressors.lz4.BlockLZ4CompressorInputStream
            r1.<init>(r0)
            boolean r0 = r7.expectBlockDependency
            if (r0 == 0) goto L6e
            byte[] r0 = r7.blockDependencyBuffer
            r1.prefill(r0)
        L6e:
            r7.currentBlock = r1
        L70:
            return
    }

    private void readFrameDescriptor() throws java.io.IOException {
            r5 = this;
            int r0 = r5.readOneByte()
            r1 = -1
            if (r0 == r1) goto Lb8
            org.apache.commons.codec.digest.XXHash32 r2 = r5.contentHash
            r2.update(r0)
            r2 = r0 & 192(0xc0, float:2.69E-43)
            r3 = 64
            if (r2 != r3) goto La1
            r2 = r0 & 32
            r3 = 1
            r4 = 0
            if (r2 != 0) goto L1a
            r2 = r3
            goto L1b
        L1a:
            r2 = r4
        L1b:
            r5.expectBlockDependency = r2
            if (r2 == 0) goto L2a
            byte[] r2 = r5.blockDependencyBuffer
            if (r2 != 0) goto L2d
            r2 = 65536(0x10000, float:9.1835E-41)
            byte[] r2 = new byte[r2]
            r5.blockDependencyBuffer = r2
            goto L2d
        L2a:
            r2 = 0
            r5.blockDependencyBuffer = r2
        L2d:
            r2 = r0 & 16
            if (r2 == 0) goto L33
            r2 = r3
            goto L34
        L33:
            r2 = r4
        L34:
            r5.expectBlockChecksum = r2
            r2 = r0 & 8
            if (r2 == 0) goto L3c
            r2 = r3
            goto L3d
        L3c:
            r2 = r4
        L3d:
            r0 = r0 & 4
            if (r0 == 0) goto L42
            goto L43
        L42:
            r3 = r4
        L43:
            r5.expectContentChecksum = r3
            int r0 = r5.readOneByte()
            if (r0 == r1) goto L99
            org.apache.commons.codec.digest.XXHash32 r3 = r5.contentHash
            r3.update(r0)
            r0 = 8
            if (r2 == 0) goto L6f
            byte[] r2 = new byte[r0]
            org.apache.commons.io.input.BoundedInputStream r3 = r5.inputStream
            int r3 = org.apache.commons.compress.utils.IOUtils.readFully(r3, r2)
            r5.count(r3)
            if (r0 != r3) goto L67
            org.apache.commons.codec.digest.XXHash32 r3 = r5.contentHash
            r3.update(r2, r4, r0)
            goto L6f
        L67:
            java.io.IOException r0 = new java.io.IOException
            java.lang.String r1 = "Premature end of stream while reading content size"
            r0.<init>(r1)
            throw r0
        L6f:
            int r2 = r5.readOneByte()
            if (r2 == r1) goto L91
            org.apache.commons.codec.digest.XXHash32 r1 = r5.contentHash
            long r3 = r1.getValue()
            long r0 = r3 >> r0
            r3 = 255(0xff, double:1.26E-321)
            long r0 = r0 & r3
            int r0 = (int) r0
            org.apache.commons.codec.digest.XXHash32 r1 = r5.contentHash
            r1.reset()
            if (r2 != r0) goto L89
            return
        L89:
            java.io.IOException r0 = new java.io.IOException
            java.lang.String r1 = "Frame header checksum mismatch"
            r0.<init>(r1)
            throw r0
        L91:
            java.io.IOException r0 = new java.io.IOException
            java.lang.String r1 = "Premature end of stream while reading frame header checksum"
            r0.<init>(r1)
            throw r0
        L99:
            java.io.IOException r0 = new java.io.IOException
            java.lang.String r1 = "Premature end of stream while reading frame BD byte"
            r0.<init>(r1)
            throw r0
        La1:
            java.io.IOException r1 = new java.io.IOException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Unsupported version "
            r2.<init>(r3)
            int r0 = r0 >> 6
            java.lang.StringBuilder r0 = r2.append(r0)
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            throw r1
        Lb8:
            java.io.IOException r0 = new java.io.IOException
            java.lang.String r1 = "Premature end of stream while reading frame flags"
            r0.<init>(r1)
            throw r0
    }

    private int readOnce(byte[] r5, int r6, int r7) throws java.io.IOException {
            r4 = this;
            boolean r0 = r4.inUncompressed
            if (r0 == 0) goto Le
            java.io.InputStream r0 = r4.currentBlock
            int r5 = r0.read(r5, r6, r7)
            r4.count(r5)
            return r5
        Le:
            java.io.InputStream r0 = r4.currentBlock
            org.apache.commons.compress.compressors.lz4.BlockLZ4CompressorInputStream r0 = (org.apache.commons.compress.compressors.lz4.BlockLZ4CompressorInputStream) r0
            long r1 = r0.getBytesRead()
            java.io.InputStream r3 = r4.currentBlock
            int r5 = r3.read(r5, r6, r7)
            long r6 = r0.getBytesRead()
            long r6 = r6 - r1
            r4.count(r6)
            return r5
    }

    private int readOneByte() throws java.io.IOException {
            r2 = this;
            org.apache.commons.io.input.BoundedInputStream r0 = r2.inputStream
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

    private boolean readSignature(boolean r7) throws java.io.IOException {
            r6 = this;
            if (r7 == 0) goto L5
            java.lang.String r0 = "Not a LZ4 frame stream"
            goto L7
        L5:
            java.lang.String r0 = "LZ4 frame stream followed by garbage"
        L7:
            r1 = 4
            byte[] r2 = new byte[r1]
            org.apache.commons.io.input.BoundedInputStream r3 = r6.inputStream
            int r3 = org.apache.commons.compress.utils.IOUtils.readFully(r3, r2)
            r6.count(r3)
            r4 = 0
            r5 = 1
            if (r3 != 0) goto L1c
            if (r7 != 0) goto L1c
            r6.endReached = r5
            return r4
        L1c:
            if (r1 != r3) goto L38
            int r3 = r6.skipSkippableFrame(r2)
            if (r3 != 0) goto L29
            if (r7 != 0) goto L29
            r6.endReached = r5
            return r4
        L29:
            if (r1 != r3) goto L32
            boolean r7 = matches(r2, r1)
            if (r7 == 0) goto L32
            return r5
        L32:
            java.io.IOException r7 = new java.io.IOException
            r7.<init>(r0)
            throw r7
        L38:
            java.io.IOException r7 = new java.io.IOException
            r7.<init>(r0)
            throw r7
    }

    private int skipSkippableFrame(byte[] r6) throws java.io.IOException {
            r5 = this;
            r0 = 4
            r1 = r0
        L2:
            if (r1 != r0) goto L3d
            boolean r2 = isSkippableFrameSignature(r6)
            if (r2 == 0) goto L3d
            org.apache.commons.compress.utils.ByteUtils$ByteSupplier r1 = r5.supplier
            long r1 = org.apache.commons.compress.utils.ByteUtils.fromLittleEndian(r1, r0)
            r3 = 0
            int r3 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r3 < 0) goto L35
            org.apache.commons.io.input.BoundedInputStream r3 = r5.inputStream
            long r3 = org.apache.commons.io.IOUtils.skip(r3, r1)
            r5.count(r3)
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 != 0) goto L2d
            org.apache.commons.io.input.BoundedInputStream r1 = r5.inputStream
            int r1 = org.apache.commons.compress.utils.IOUtils.readFully(r1, r6)
            r5.count(r1)
            goto L2
        L2d:
            java.io.IOException r6 = new java.io.IOException
            java.lang.String r0 = "Premature end of stream while skipping frame"
            r6.<init>(r0)
            throw r6
        L35:
            java.io.IOException r6 = new java.io.IOException
            java.lang.String r0 = "Found illegal skippable frame with negative size"
            r6.<init>(r0)
            throw r6
        L3d:
            return r1
    }

    private void verifyChecksum(org.apache.commons.codec.digest.XXHash32 r5, java.lang.String r6) throws java.io.IOException {
            r4 = this;
            r0 = 4
            byte[] r1 = new byte[r0]
            org.apache.commons.io.input.BoundedInputStream r2 = r4.inputStream
            int r2 = org.apache.commons.compress.utils.IOUtils.readFully(r2, r1)
            r4.count(r2)
            if (r0 != r2) goto L34
            long r2 = r5.getValue()
            long r0 = org.apache.commons.compress.utils.ByteUtils.fromLittleEndian(r1)
            int r5 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r5 != 0) goto L1b
            return
        L1b:
            java.io.IOException r5 = new java.io.IOException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.StringBuilder r6 = r0.append(r6)
            java.lang.String r0 = " checksum mismatch."
            java.lang.StringBuilder r6 = r6.append(r0)
            java.lang.String r6 = r6.toString()
            r5.<init>(r6)
            throw r5
        L34:
            java.io.IOException r5 = new java.io.IOException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Premature end of stream while reading "
            r0.<init>(r1)
            java.lang.StringBuilder r6 = r0.append(r6)
            java.lang.String r0 = " checksum"
            java.lang.StringBuilder r6 = r6.append(r0)
            java.lang.String r6 = r6.toString()
            r5.<init>(r6)
            throw r5
    }

    private void verifyContentChecksum() throws java.io.IOException {
            r2 = this;
            boolean r0 = r2.expectContentChecksum
            if (r0 == 0) goto Lb
            org.apache.commons.codec.digest.XXHash32 r0 = r2.contentHash
            java.lang.String r1 = "content"
            r2.verifyChecksum(r0, r1)
        Lb:
            org.apache.commons.codec.digest.XXHash32 r0 = r2.contentHash
            r0.reset()
            return
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws java.io.IOException {
            r2 = this;
            java.io.InputStream r0 = r2.currentBlock     // Catch: java.lang.Throwable -> L10
            if (r0 == 0) goto La
            r0.close()     // Catch: java.lang.Throwable -> L10
            r0 = 0
            r2.currentBlock = r0     // Catch: java.lang.Throwable -> L10
        La:
            org.apache.commons.io.input.BoundedInputStream r0 = r2.inputStream
            r0.close()
            return
        L10:
            r0 = move-exception
            org.apache.commons.io.input.BoundedInputStream r1 = r2.inputStream
            r1.close()
            throw r0
    }

    @Override // org.apache.commons.compress.utils.InputStreamStatistics
    public long getCompressedCount() {
            r2 = this;
            org.apache.commons.io.input.BoundedInputStream r0 = r2.inputStream
            long r0 = r0.getCount()
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
    public int read(byte[] r4, int r5, int r6) throws java.io.IOException {
            r3 = this;
            if (r6 != 0) goto L4
            r4 = 0
            return r4
        L4:
            boolean r0 = r3.endReached
            r1 = -1
            if (r0 == 0) goto La
            return r1
        La:
            int r0 = r3.readOnce(r4, r5, r6)
            if (r0 != r1) goto L1b
            r3.nextBlock()
            boolean r2 = r3.endReached
            if (r2 != 0) goto L1b
            int r0 = r3.readOnce(r4, r5, r6)
        L1b:
            if (r0 == r1) goto L2d
            boolean r6 = r3.expectBlockDependency
            if (r6 == 0) goto L24
            r3.appendToBlockDependencyBuffer(r4, r5, r0)
        L24:
            boolean r6 = r3.expectContentChecksum
            if (r6 == 0) goto L2d
            org.apache.commons.codec.digest.XXHash32 r6 = r3.contentHash
            r6.update(r4, r5, r0)
        L2d:
            return r0
    }
}
