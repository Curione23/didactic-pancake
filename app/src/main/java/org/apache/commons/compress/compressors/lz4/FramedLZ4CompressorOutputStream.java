package org.apache.commons.compress.compressors.lz4;

/* JADX INFO: loaded from: classes2.dex */
public class FramedLZ4CompressorOutputStream extends org.apache.commons.compress.compressors.CompressorOutputStream<java.io.OutputStream> {
    private static final byte[] END_MARK = null;
    private final byte[] blockData;
    private final byte[] blockDependencyBuffer;
    private final org.apache.commons.codec.digest.XXHash32 blockHash;
    private int collectedBlockDependencyBytes;
    private final org.apache.commons.codec.digest.XXHash32 contentHash;
    private int currentIndex;
    private boolean finished;
    private final byte[] oneByte;
    private final org.apache.commons.compress.compressors.lz4.FramedLZ4CompressorOutputStream.Parameters params;

    public enum BlockSize extends java.lang.Enum<org.apache.commons.compress.compressors.lz4.FramedLZ4CompressorOutputStream.BlockSize> {
        private static final /* synthetic */ org.apache.commons.compress.compressors.lz4.FramedLZ4CompressorOutputStream.BlockSize[] $VALUES = null;
        public static final org.apache.commons.compress.compressors.lz4.FramedLZ4CompressorOutputStream.BlockSize K256 = null;
        public static final org.apache.commons.compress.compressors.lz4.FramedLZ4CompressorOutputStream.BlockSize K64 = null;
        public static final org.apache.commons.compress.compressors.lz4.FramedLZ4CompressorOutputStream.BlockSize M1 = null;
        public static final org.apache.commons.compress.compressors.lz4.FramedLZ4CompressorOutputStream.BlockSize M4 = null;
        private final int index;
        private final int size;

        private static /* synthetic */ org.apache.commons.compress.compressors.lz4.FramedLZ4CompressorOutputStream.BlockSize[] $values() {
                org.apache.commons.compress.compressors.lz4.FramedLZ4CompressorOutputStream$BlockSize r0 = org.apache.commons.compress.compressors.lz4.FramedLZ4CompressorOutputStream.BlockSize.K64
                org.apache.commons.compress.compressors.lz4.FramedLZ4CompressorOutputStream$BlockSize r1 = org.apache.commons.compress.compressors.lz4.FramedLZ4CompressorOutputStream.BlockSize.K256
                org.apache.commons.compress.compressors.lz4.FramedLZ4CompressorOutputStream$BlockSize r2 = org.apache.commons.compress.compressors.lz4.FramedLZ4CompressorOutputStream.BlockSize.M1
                org.apache.commons.compress.compressors.lz4.FramedLZ4CompressorOutputStream$BlockSize r3 = org.apache.commons.compress.compressors.lz4.FramedLZ4CompressorOutputStream.BlockSize.M4
                org.apache.commons.compress.compressors.lz4.FramedLZ4CompressorOutputStream$BlockSize[] r0 = new org.apache.commons.compress.compressors.lz4.FramedLZ4CompressorOutputStream.BlockSize[]{r0, r1, r2, r3}
                return r0
        }

        static {
                org.apache.commons.compress.compressors.lz4.FramedLZ4CompressorOutputStream$BlockSize r0 = new org.apache.commons.compress.compressors.lz4.FramedLZ4CompressorOutputStream$BlockSize
                r1 = 65536(0x10000, float:9.1835E-41)
                r2 = 4
                java.lang.String r3 = "K64"
                r4 = 0
                r0.<init>(r3, r4, r1, r2)
                org.apache.commons.compress.compressors.lz4.FramedLZ4CompressorOutputStream.BlockSize.K64 = r0
                org.apache.commons.compress.compressors.lz4.FramedLZ4CompressorOutputStream$BlockSize r0 = new org.apache.commons.compress.compressors.lz4.FramedLZ4CompressorOutputStream$BlockSize
                r1 = 262144(0x40000, float:3.67342E-40)
                r2 = 5
                java.lang.String r3 = "K256"
                r4 = 1
                r0.<init>(r3, r4, r1, r2)
                org.apache.commons.compress.compressors.lz4.FramedLZ4CompressorOutputStream.BlockSize.K256 = r0
                org.apache.commons.compress.compressors.lz4.FramedLZ4CompressorOutputStream$BlockSize r0 = new org.apache.commons.compress.compressors.lz4.FramedLZ4CompressorOutputStream$BlockSize
                r1 = 1048576(0x100000, float:1.469368E-39)
                r2 = 6
                java.lang.String r3 = "M1"
                r4 = 2
                r0.<init>(r3, r4, r1, r2)
                org.apache.commons.compress.compressors.lz4.FramedLZ4CompressorOutputStream.BlockSize.M1 = r0
                org.apache.commons.compress.compressors.lz4.FramedLZ4CompressorOutputStream$BlockSize r0 = new org.apache.commons.compress.compressors.lz4.FramedLZ4CompressorOutputStream$BlockSize
                r1 = 4194304(0x400000, float:5.877472E-39)
                r2 = 7
                java.lang.String r3 = "M4"
                r4 = 3
                r0.<init>(r3, r4, r1, r2)
                org.apache.commons.compress.compressors.lz4.FramedLZ4CompressorOutputStream.BlockSize.M4 = r0
                org.apache.commons.compress.compressors.lz4.FramedLZ4CompressorOutputStream$BlockSize[] r0 = $values()
                org.apache.commons.compress.compressors.lz4.FramedLZ4CompressorOutputStream.BlockSize.$VALUES = r0
                return
        }

        BlockSize(java.lang.String r1, int r2, int r3, int r4) {
                r0 = this;
                r0.<init>(r1, r2)
                r0.size = r3
                r0.index = r4
                return
        }

        public static org.apache.commons.compress.compressors.lz4.FramedLZ4CompressorOutputStream.BlockSize valueOf(java.lang.String r1) {
                java.lang.Class<org.apache.commons.compress.compressors.lz4.FramedLZ4CompressorOutputStream$BlockSize> r0 = org.apache.commons.compress.compressors.lz4.FramedLZ4CompressorOutputStream.BlockSize.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                org.apache.commons.compress.compressors.lz4.FramedLZ4CompressorOutputStream$BlockSize r1 = (org.apache.commons.compress.compressors.lz4.FramedLZ4CompressorOutputStream.BlockSize) r1
                return r1
        }

        public static org.apache.commons.compress.compressors.lz4.FramedLZ4CompressorOutputStream.BlockSize[] values() {
                org.apache.commons.compress.compressors.lz4.FramedLZ4CompressorOutputStream$BlockSize[] r0 = org.apache.commons.compress.compressors.lz4.FramedLZ4CompressorOutputStream.BlockSize.$VALUES
                java.lang.Object r0 = r0.clone()
                org.apache.commons.compress.compressors.lz4.FramedLZ4CompressorOutputStream$BlockSize[] r0 = (org.apache.commons.compress.compressors.lz4.FramedLZ4CompressorOutputStream.BlockSize[]) r0
                return r0
        }

        int getIndex() {
                r1 = this;
                int r0 = r1.index
                return r0
        }

        int getSize() {
                r1 = this;
                int r0 = r1.size
                return r0
        }
    }

    public static class Parameters {
        public static final org.apache.commons.compress.compressors.lz4.FramedLZ4CompressorOutputStream.Parameters DEFAULT = null;
        private final org.apache.commons.compress.compressors.lz4.FramedLZ4CompressorOutputStream.BlockSize blockSize;
        private final org.apache.commons.compress.compressors.lz77support.Parameters lz77params;
        private final boolean withBlockChecksum;
        private final boolean withBlockDependency;
        private final boolean withContentChecksum;

        static {
                org.apache.commons.compress.compressors.lz4.FramedLZ4CompressorOutputStream$Parameters r0 = new org.apache.commons.compress.compressors.lz4.FramedLZ4CompressorOutputStream$Parameters
                org.apache.commons.compress.compressors.lz4.FramedLZ4CompressorOutputStream$BlockSize r1 = org.apache.commons.compress.compressors.lz4.FramedLZ4CompressorOutputStream.BlockSize.M4
                r2 = 1
                r3 = 0
                r0.<init>(r1, r2, r3, r3)
                org.apache.commons.compress.compressors.lz4.FramedLZ4CompressorOutputStream.Parameters.DEFAULT = r0
                return
        }

        public Parameters(org.apache.commons.compress.compressors.lz4.FramedLZ4CompressorOutputStream.BlockSize r3) {
                r2 = this;
                r0 = 1
                r1 = 0
                r2.<init>(r3, r0, r1, r1)
                return
        }

        public Parameters(org.apache.commons.compress.compressors.lz4.FramedLZ4CompressorOutputStream.BlockSize r7, org.apache.commons.compress.compressors.lz77support.Parameters r8) {
                r6 = this;
                r3 = 0
                r4 = 0
                r2 = 1
                r0 = r6
                r1 = r7
                r5 = r8
                r0.<init>(r1, r2, r3, r4, r5)
                return
        }

        public Parameters(org.apache.commons.compress.compressors.lz4.FramedLZ4CompressorOutputStream.BlockSize r8, boolean r9, boolean r10, boolean r11) {
                r7 = this;
                org.apache.commons.compress.compressors.lz77support.Parameters$Builder r0 = org.apache.commons.compress.compressors.lz4.BlockLZ4CompressorOutputStream.createParameterBuilder()
                org.apache.commons.compress.compressors.lz77support.Parameters r6 = r0.build()
                r1 = r7
                r2 = r8
                r3 = r9
                r4 = r10
                r5 = r11
                r1.<init>(r2, r3, r4, r5, r6)
                return
        }

        public Parameters(org.apache.commons.compress.compressors.lz4.FramedLZ4CompressorOutputStream.BlockSize r1, boolean r2, boolean r3, boolean r4, org.apache.commons.compress.compressors.lz77support.Parameters r5) {
                r0 = this;
                r0.<init>()
                r0.blockSize = r1
                r0.withContentChecksum = r2
                r0.withBlockChecksum = r3
                r0.withBlockDependency = r4
                r0.lz77params = r5
                return
        }

        static /* synthetic */ org.apache.commons.compress.compressors.lz4.FramedLZ4CompressorOutputStream.BlockSize access$000(org.apache.commons.compress.compressors.lz4.FramedLZ4CompressorOutputStream.Parameters r0) {
                org.apache.commons.compress.compressors.lz4.FramedLZ4CompressorOutputStream$BlockSize r0 = r0.blockSize
                return r0
        }

        static /* synthetic */ boolean access$100(org.apache.commons.compress.compressors.lz4.FramedLZ4CompressorOutputStream.Parameters r0) {
                boolean r0 = r0.withBlockChecksum
                return r0
        }

        static /* synthetic */ boolean access$200(org.apache.commons.compress.compressors.lz4.FramedLZ4CompressorOutputStream.Parameters r0) {
                boolean r0 = r0.withBlockDependency
                return r0
        }

        static /* synthetic */ org.apache.commons.compress.compressors.lz77support.Parameters access$300(org.apache.commons.compress.compressors.lz4.FramedLZ4CompressorOutputStream.Parameters r0) {
                org.apache.commons.compress.compressors.lz77support.Parameters r0 = r0.lz77params
                return r0
        }

        static /* synthetic */ boolean access$400(org.apache.commons.compress.compressors.lz4.FramedLZ4CompressorOutputStream.Parameters r0) {
                boolean r0 = r0.withContentChecksum
                return r0
        }

        public java.lang.String toString() {
                r2 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                java.lang.String r1 = "LZ4 Parameters with BlockSize "
                r0.<init>(r1)
                org.apache.commons.compress.compressors.lz4.FramedLZ4CompressorOutputStream$BlockSize r1 = r2.blockSize
                java.lang.StringBuilder r0 = r0.append(r1)
                java.lang.String r1 = ", withContentChecksum "
                java.lang.StringBuilder r0 = r0.append(r1)
                boolean r1 = r2.withContentChecksum
                java.lang.StringBuilder r0 = r0.append(r1)
                java.lang.String r1 = ", withBlockChecksum "
                java.lang.StringBuilder r0 = r0.append(r1)
                boolean r1 = r2.withBlockChecksum
                java.lang.StringBuilder r0 = r0.append(r1)
                java.lang.String r1 = ", withBlockDependency "
                java.lang.StringBuilder r0 = r0.append(r1)
                boolean r1 = r2.withBlockDependency
                java.lang.StringBuilder r0 = r0.append(r1)
                java.lang.String r0 = r0.toString()
                return r0
        }
    }

    static {
            r0 = 4
            byte[] r0 = new byte[r0]
            org.apache.commons.compress.compressors.lz4.FramedLZ4CompressorOutputStream.END_MARK = r0
            return
    }

    public FramedLZ4CompressorOutputStream(java.io.OutputStream r2) throws java.io.IOException {
            r1 = this;
            org.apache.commons.compress.compressors.lz4.FramedLZ4CompressorOutputStream$Parameters r0 = org.apache.commons.compress.compressors.lz4.FramedLZ4CompressorOutputStream.Parameters.DEFAULT
            r1.<init>(r2, r0)
            return
    }

    public FramedLZ4CompressorOutputStream(java.io.OutputStream r3, org.apache.commons.compress.compressors.lz4.FramedLZ4CompressorOutputStream.Parameters r4) throws java.io.IOException {
            r2 = this;
            r2.<init>(r3)
            r0 = 1
            byte[] r0 = new byte[r0]
            r2.oneByte = r0
            org.apache.commons.codec.digest.XXHash32 r0 = new org.apache.commons.codec.digest.XXHash32
            r0.<init>()
            r2.contentHash = r0
            r2.params = r4
            org.apache.commons.compress.compressors.lz4.FramedLZ4CompressorOutputStream$BlockSize r0 = org.apache.commons.compress.compressors.lz4.FramedLZ4CompressorOutputStream.Parameters.access$000(r4)
            int r0 = r0.getSize()
            byte[] r0 = new byte[r0]
            r2.blockData = r0
            boolean r0 = org.apache.commons.compress.compressors.lz4.FramedLZ4CompressorOutputStream.Parameters.access$100(r4)
            r1 = 0
            if (r0 == 0) goto L2a
            org.apache.commons.codec.digest.XXHash32 r0 = new org.apache.commons.codec.digest.XXHash32
            r0.<init>()
            goto L2b
        L2a:
            r0 = r1
        L2b:
            r2.blockHash = r0
            byte[] r0 = org.apache.commons.compress.compressors.lz4.FramedLZ4CompressorInputStream.LZ4_SIGNATURE
            r3.write(r0)
            r2.writeFrameDescriptor()
            boolean r3 = org.apache.commons.compress.compressors.lz4.FramedLZ4CompressorOutputStream.Parameters.access$200(r4)
            if (r3 == 0) goto L3f
            r3 = 65536(0x10000, float:9.1835E-41)
            byte[] r1 = new byte[r3]
        L3f:
            r2.blockDependencyBuffer = r1
            return
    }

    private void appendToBlockDependencyBuffer(byte[] r4, int r5, int r6) {
            r3 = this;
            byte[] r0 = r3.blockDependencyBuffer
            int r0 = r0.length
            int r6 = java.lang.Math.min(r6, r0)
            if (r6 <= 0) goto L24
            byte[] r0 = r3.blockDependencyBuffer
            int r1 = r0.length
            int r1 = r1 - r6
            if (r1 <= 0) goto L13
            r2 = 0
            java.lang.System.arraycopy(r0, r6, r0, r2, r1)
        L13:
            byte[] r0 = r3.blockDependencyBuffer
            java.lang.System.arraycopy(r4, r5, r0, r1, r6)
            int r4 = r3.collectedBlockDependencyBytes
            int r4 = r4 + r6
            byte[] r5 = r3.blockDependencyBuffer
            int r5 = r5.length
            int r4 = java.lang.Math.min(r4, r5)
            r3.collectedBlockDependencyBytes = r4
        L24:
            return
    }

    private void flushBlock() throws java.io.IOException {
            r8 = this;
            int r0 = r8.currentIndex
            if (r0 != 0) goto L5
            return
        L5:
            org.apache.commons.compress.compressors.lz4.FramedLZ4CompressorOutputStream$Parameters r0 = r8.params
            boolean r0 = org.apache.commons.compress.compressors.lz4.FramedLZ4CompressorOutputStream.Parameters.access$200(r0)
            java.io.ByteArrayOutputStream r1 = new java.io.ByteArrayOutputStream
            r1.<init>()
            org.apache.commons.compress.compressors.lz4.BlockLZ4CompressorOutputStream r2 = new org.apache.commons.compress.compressors.lz4.BlockLZ4CompressorOutputStream
            org.apache.commons.compress.compressors.lz4.FramedLZ4CompressorOutputStream$Parameters r3 = r8.params
            org.apache.commons.compress.compressors.lz77support.Parameters r3 = org.apache.commons.compress.compressors.lz4.FramedLZ4CompressorOutputStream.Parameters.access$300(r3)
            r2.<init>(r1, r3)
            if (r0 == 0) goto L26
            byte[] r3 = r8.blockDependencyBuffer     // Catch: java.lang.Throwable -> L9f
            int r4 = r3.length     // Catch: java.lang.Throwable -> L9f
            int r5 = r8.collectedBlockDependencyBytes     // Catch: java.lang.Throwable -> L9f
            int r4 = r4 - r5
            r2.prefill(r3, r4, r5)     // Catch: java.lang.Throwable -> L9f
        L26:
            byte[] r3 = r8.blockData     // Catch: java.lang.Throwable -> L9f
            int r4 = r8.currentIndex     // Catch: java.lang.Throwable -> L9f
            r5 = 0
            r2.write(r3, r5, r4)     // Catch: java.lang.Throwable -> L9f
            r2.close()
            if (r0 == 0) goto L3a
            byte[] r0 = r8.blockData
            int r2 = r8.currentIndex
            r8.appendToBlockDependencyBuffer(r0, r5, r2)
        L3a:
            byte[] r0 = r1.toByteArray()
            int r1 = r0.length
            int r2 = r8.currentIndex
            r3 = 4
            if (r1 <= r2) goto L6a
            java.io.OutputStream r0 = r8.out
            int r1 = r8.currentIndex
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 | r2
            long r1 = (long) r1
            org.apache.commons.compress.utils.ByteUtils.toLittleEndian(r0, r1, r3)
            java.io.OutputStream r0 = r8.out
            byte[] r1 = r8.blockData
            int r2 = r8.currentIndex
            r0.write(r1, r5, r2)
            org.apache.commons.compress.compressors.lz4.FramedLZ4CompressorOutputStream$Parameters r0 = r8.params
            boolean r0 = org.apache.commons.compress.compressors.lz4.FramedLZ4CompressorOutputStream.Parameters.access$100(r0)
            if (r0 == 0) goto L84
            org.apache.commons.codec.digest.XXHash32 r0 = r8.blockHash
            byte[] r1 = r8.blockData
            int r2 = r8.currentIndex
            r0.update(r1, r5, r2)
            goto L84
        L6a:
            java.io.OutputStream r1 = r8.out
            int r2 = r0.length
            long r6 = (long) r2
            org.apache.commons.compress.utils.ByteUtils.toLittleEndian(r1, r6, r3)
            java.io.OutputStream r1 = r8.out
            r1.write(r0)
            org.apache.commons.compress.compressors.lz4.FramedLZ4CompressorOutputStream$Parameters r1 = r8.params
            boolean r1 = org.apache.commons.compress.compressors.lz4.FramedLZ4CompressorOutputStream.Parameters.access$100(r1)
            if (r1 == 0) goto L84
            org.apache.commons.codec.digest.XXHash32 r1 = r8.blockHash
            int r2 = r0.length
            r1.update(r0, r5, r2)
        L84:
            org.apache.commons.compress.compressors.lz4.FramedLZ4CompressorOutputStream$Parameters r0 = r8.params
            boolean r0 = org.apache.commons.compress.compressors.lz4.FramedLZ4CompressorOutputStream.Parameters.access$100(r0)
            if (r0 == 0) goto L9c
            java.io.OutputStream r0 = r8.out
            org.apache.commons.codec.digest.XXHash32 r1 = r8.blockHash
            long r1 = r1.getValue()
            org.apache.commons.compress.utils.ByteUtils.toLittleEndian(r0, r1, r3)
            org.apache.commons.codec.digest.XXHash32 r0 = r8.blockHash
            r0.reset()
        L9c:
            r8.currentIndex = r5
            return
        L9f:
            r0 = move-exception
            r2.close()     // Catch: java.lang.Throwable -> La4
            goto La8
        La4:
            r1 = move-exception
            r0.addSuppressed(r1)
        La8:
            throw r0
    }

    private void writeFrameDescriptor() throws java.io.IOException {
            r5 = this;
            org.apache.commons.compress.compressors.lz4.FramedLZ4CompressorOutputStream$Parameters r0 = r5.params
            boolean r0 = org.apache.commons.compress.compressors.lz4.FramedLZ4CompressorOutputStream.Parameters.access$200(r0)
            if (r0 != 0) goto Lb
            r0 = 96
            goto Ld
        Lb:
            r0 = 64
        Ld:
            org.apache.commons.compress.compressors.lz4.FramedLZ4CompressorOutputStream$Parameters r1 = r5.params
            boolean r1 = org.apache.commons.compress.compressors.lz4.FramedLZ4CompressorOutputStream.Parameters.access$400(r1)
            if (r1 == 0) goto L17
            r0 = r0 | 4
        L17:
            org.apache.commons.compress.compressors.lz4.FramedLZ4CompressorOutputStream$Parameters r1 = r5.params
            boolean r1 = org.apache.commons.compress.compressors.lz4.FramedLZ4CompressorOutputStream.Parameters.access$100(r1)
            if (r1 == 0) goto L21
            r0 = r0 | 16
        L21:
            java.io.OutputStream r1 = r5.out
            r1.write(r0)
            org.apache.commons.codec.digest.XXHash32 r1 = r5.contentHash
            r1.update(r0)
            org.apache.commons.compress.compressors.lz4.FramedLZ4CompressorOutputStream$Parameters r0 = r5.params
            org.apache.commons.compress.compressors.lz4.FramedLZ4CompressorOutputStream$BlockSize r0 = org.apache.commons.compress.compressors.lz4.FramedLZ4CompressorOutputStream.Parameters.access$000(r0)
            int r0 = r0.getIndex()
            int r0 = r0 << 4
            r0 = r0 & 112(0x70, float:1.57E-43)
            java.io.OutputStream r1 = r5.out
            r1.write(r0)
            org.apache.commons.codec.digest.XXHash32 r1 = r5.contentHash
            r1.update(r0)
            java.io.OutputStream r0 = r5.out
            org.apache.commons.codec.digest.XXHash32 r1 = r5.contentHash
            long r1 = r1.getValue()
            r3 = 8
            long r1 = r1 >> r3
            r3 = 255(0xff, double:1.26E-321)
            long r1 = r1 & r3
            int r1 = (int) r1
            r0.write(r1)
            org.apache.commons.codec.digest.XXHash32 r0 = r5.contentHash
            r0.reset()
            return
    }

    private void writeTrailer() throws java.io.IOException {
            r4 = this;
            java.io.OutputStream r0 = r4.out
            byte[] r1 = org.apache.commons.compress.compressors.lz4.FramedLZ4CompressorOutputStream.END_MARK
            r0.write(r1)
            org.apache.commons.compress.compressors.lz4.FramedLZ4CompressorOutputStream$Parameters r0 = r4.params
            boolean r0 = org.apache.commons.compress.compressors.lz4.FramedLZ4CompressorOutputStream.Parameters.access$400(r0)
            if (r0 == 0) goto L1b
            java.io.OutputStream r0 = r4.out
            org.apache.commons.codec.digest.XXHash32 r1 = r4.contentHash
            long r1 = r1.getValue()
            r3 = 4
            org.apache.commons.compress.utils.ByteUtils.toLittleEndian(r0, r1, r3)
        L1b:
            return
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws java.io.IOException {
            r2 = this;
            r2.finish()     // Catch: java.lang.Throwable -> L9
            java.io.OutputStream r0 = r2.out
            r0.close()
            return
        L9:
            r0 = move-exception
            java.io.OutputStream r1 = r2.out
            r1.close()
            throw r0
    }

    public void finish() throws java.io.IOException {
            r1 = this;
            boolean r0 = r1.finished
            if (r0 != 0) goto Ld
            r1.flushBlock()
            r1.writeTrailer()
            r0 = 1
            r1.finished = r0
        Ld:
            return
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(int r3) throws java.io.IOException {
            r2 = this;
            byte[] r0 = r2.oneByte
            r3 = r3 & 255(0xff, float:3.57E-43)
            byte r3 = (byte) r3
            r1 = 0
            r0[r1] = r3
            r2.write(r0)
            return
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(byte[] r5, int r6, int r7) throws java.io.IOException {
            r4 = this;
            org.apache.commons.compress.compressors.lz4.FramedLZ4CompressorOutputStream$Parameters r0 = r4.params
            boolean r0 = org.apache.commons.compress.compressors.lz4.FramedLZ4CompressorOutputStream.Parameters.access$400(r0)
            if (r0 == 0) goto Ld
            org.apache.commons.codec.digest.XXHash32 r0 = r4.contentHash
            r0.update(r5, r6, r7)
        Ld:
            byte[] r0 = r4.blockData
            int r0 = r0.length
            int r1 = r4.currentIndex
            int r0 = r0 - r1
        L13:
            if (r7 <= 0) goto L31
            int r1 = java.lang.Math.min(r7, r0)
            byte[] r2 = r4.blockData
            int r3 = r4.currentIndex
            java.lang.System.arraycopy(r5, r6, r2, r3, r1)
            int r6 = r6 + r1
            int r0 = r0 - r1
            int r7 = r7 - r1
            int r2 = r4.currentIndex
            int r2 = r2 + r1
            r4.currentIndex = r2
            if (r0 != 0) goto L13
            r4.flushBlock()
            byte[] r0 = r4.blockData
            int r0 = r0.length
            goto L13
        L31:
            return
    }
}
