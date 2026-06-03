package org.apache.commons.compress.compressors.snappy;

/* JADX INFO: loaded from: classes2.dex */
public class SnappyCompressorOutputStream extends org.apache.commons.compress.compressors.CompressorOutputStream<java.io.OutputStream> {
    private static final int FOUR_BYTE_COPY_TAG = 3;
    private static final int FOUR_SIZE_BYTE_MARKER = 252;
    private static final int MAX_LITERAL_SIZE_WITHOUT_SIZE_BYTES = 60;
    private static final int MAX_LITERAL_SIZE_WITH_ONE_SIZE_BYTE = 256;
    private static final int MAX_LITERAL_SIZE_WITH_THREE_SIZE_BYTES = 16777216;
    private static final int MAX_LITERAL_SIZE_WITH_TWO_SIZE_BYTES = 65536;
    private static final int MAX_MATCH_LENGTH = 64;
    private static final int MAX_MATCH_LENGTH_WITH_ONE_OFFSET_BYTE = 11;
    private static final int MAX_OFFSET_WITH_ONE_OFFSET_BYTE = 1024;
    private static final int MAX_OFFSET_WITH_TWO_OFFSET_BYTES = 32768;
    private static final int MIN_MATCH_LENGTH = 4;
    private static final int MIN_MATCH_LENGTH_WITH_ONE_OFFSET_BYTE = 4;
    private static final int ONE_BYTE_COPY_TAG = 1;
    private static final int ONE_SIZE_BYTE_MARKER = 240;
    private static final int THREE_SIZE_BYTE_MARKER = 248;
    private static final int TWO_BYTE_COPY_TAG = 2;
    private static final int TWO_SIZE_BYTE_MARKER = 244;
    private final org.apache.commons.compress.compressors.lz77support.LZ77Compressor compressor;
    private final org.apache.commons.compress.utils.ByteUtils.ByteConsumer consumer;
    private boolean finished;
    private final byte[] oneByte;

    /* JADX INFO: renamed from: org.apache.commons.compress.compressors.snappy.SnappyCompressorOutputStream$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$org$apache$commons$compress$compressors$lz77support$LZ77Compressor$Block$BlockType = null;

        static {
                org.apache.commons.compress.compressors.lz77support.LZ77Compressor$Block$BlockType[] r0 = org.apache.commons.compress.compressors.lz77support.LZ77Compressor.Block.BlockType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                org.apache.commons.compress.compressors.snappy.SnappyCompressorOutputStream.AnonymousClass1.$SwitchMap$org$apache$commons$compress$compressors$lz77support$LZ77Compressor$Block$BlockType = r0
                org.apache.commons.compress.compressors.lz77support.LZ77Compressor$Block$BlockType r1 = org.apache.commons.compress.compressors.lz77support.LZ77Compressor.Block.BlockType.LITERAL     // Catch: java.lang.NoSuchFieldError -> L12
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L12
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L12
            L12:
                int[] r0 = org.apache.commons.compress.compressors.snappy.SnappyCompressorOutputStream.AnonymousClass1.$SwitchMap$org$apache$commons$compress$compressors$lz77support$LZ77Compressor$Block$BlockType     // Catch: java.lang.NoSuchFieldError -> L1d
                org.apache.commons.compress.compressors.lz77support.LZ77Compressor$Block$BlockType r1 = org.apache.commons.compress.compressors.lz77support.LZ77Compressor.Block.BlockType.BACK_REFERENCE     // Catch: java.lang.NoSuchFieldError -> L1d
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L1d
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L1d
            L1d:
                int[] r0 = org.apache.commons.compress.compressors.snappy.SnappyCompressorOutputStream.AnonymousClass1.$SwitchMap$org$apache$commons$compress$compressors$lz77support$LZ77Compressor$Block$BlockType     // Catch: java.lang.NoSuchFieldError -> L28
                org.apache.commons.compress.compressors.lz77support.LZ77Compressor$Block$BlockType r1 = org.apache.commons.compress.compressors.lz77support.LZ77Compressor.Block.BlockType.EOD     // Catch: java.lang.NoSuchFieldError -> L28
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L28
                r2 = 3
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L28
            L28:
                return
        }
    }

    public SnappyCompressorOutputStream(java.io.OutputStream r2, long r3) throws java.io.IOException {
            r1 = this;
            r0 = 32768(0x8000, float:4.5918E-41)
            r1.<init>(r2, r3, r0)
            return
    }

    public SnappyCompressorOutputStream(java.io.OutputStream r1, long r2, int r4) throws java.io.IOException {
            r0 = this;
            org.apache.commons.compress.compressors.lz77support.Parameters$Builder r4 = createParameterBuilder(r4)
            org.apache.commons.compress.compressors.lz77support.Parameters r4 = r4.build()
            r0.<init>(r1, r2, r4)
            return
    }

    public SnappyCompressorOutputStream(java.io.OutputStream r2, long r3, org.apache.commons.compress.compressors.lz77support.Parameters r5) throws java.io.IOException {
            r1 = this;
            r1.<init>(r2)
            r0 = 1
            byte[] r0 = new byte[r0]
            r1.oneByte = r0
            org.apache.commons.compress.utils.ByteUtils$OutputStreamByteConsumer r0 = new org.apache.commons.compress.utils.ByteUtils$OutputStreamByteConsumer
            r0.<init>(r2)
            r1.consumer = r0
            org.apache.commons.compress.compressors.lz77support.LZ77Compressor r2 = new org.apache.commons.compress.compressors.lz77support.LZ77Compressor
            org.apache.commons.compress.compressors.snappy.SnappyCompressorOutputStream$$ExternalSyntheticLambda0 r0 = new org.apache.commons.compress.compressors.snappy.SnappyCompressorOutputStream$$ExternalSyntheticLambda0
            r0.<init>(r1)
            r2.<init>(r5, r0)
            r1.compressor = r2
            r1.writeUncompressedSize(r3)
            return
    }

    public static org.apache.commons.compress.compressors.lz77support.Parameters.Builder createParameterBuilder(int r2) {
            org.apache.commons.compress.compressors.lz77support.Parameters$Builder r0 = org.apache.commons.compress.compressors.lz77support.Parameters.builder(r2)
            r1 = 4
            org.apache.commons.compress.compressors.lz77support.Parameters$Builder r0 = r0.withMinBackReferenceLength(r1)
            r1 = 64
            org.apache.commons.compress.compressors.lz77support.Parameters$Builder r0 = r0.withMaxBackReferenceLength(r1)
            org.apache.commons.compress.compressors.lz77support.Parameters$Builder r0 = r0.withMaxOffset(r2)
            org.apache.commons.compress.compressors.lz77support.Parameters$Builder r2 = r0.withMaxLiteralLength(r2)
            return r2
    }

    private void writeBackReference(org.apache.commons.compress.compressors.lz77support.LZ77Compressor.BackReference r3) throws java.io.IOException {
            r2 = this;
            int r0 = r3.getLength()
            int r3 = r3.getOffset()
            r1 = 4
            if (r0 < r1) goto L17
            r1 = 11
            if (r0 > r1) goto L17
            r1 = 1024(0x400, float:1.435E-42)
            if (r3 > r1) goto L17
            r2.writeBackReferenceWithOneOffsetByte(r0, r3)
            goto L23
        L17:
            r1 = 32768(0x8000, float:4.5918E-41)
            if (r3 >= r1) goto L20
            r2.writeBackReferenceWithTwoOffsetBytes(r0, r3)
            goto L23
        L20:
            r2.writeBackReferenceWithFourOffsetBytes(r0, r3)
        L23:
            return
    }

    private void writeBackReferenceWithFourOffsetBytes(int r3, int r4) throws java.io.IOException {
            r2 = this;
            r0 = 3
            r1 = 4
            r2.writeBackReferenceWithLittleEndianOffset(r0, r1, r3, r4)
            return
    }

    private void writeBackReferenceWithLittleEndianOffset(int r2, int r3, int r4, int r5) throws java.io.IOException {
            r1 = this;
            java.io.OutputStream r0 = r1.out
            int r4 = r4 + (-1)
            int r4 = r4 << 2
            r2 = r2 | r4
            r0.write(r2)
            r1.writeLittleEndian(r3, r5)
            return
    }

    private void writeBackReferenceWithOneOffsetByte(int r3, int r4) throws java.io.IOException {
            r2 = this;
            java.io.OutputStream r0 = r2.out
            int r3 = r3 + (-4)
            int r3 = r3 << 2
            r3 = r3 | 1
            r1 = r4 & 1792(0x700, float:2.511E-42)
            int r1 = r1 >> 3
            r3 = r3 | r1
            r0.write(r3)
            java.io.OutputStream r3 = r2.out
            r4 = r4 & 255(0xff, float:3.57E-43)
            r3.write(r4)
            return
    }

    private void writeBackReferenceWithTwoOffsetBytes(int r2, int r3) throws java.io.IOException {
            r1 = this;
            r0 = 2
            r1.writeBackReferenceWithLittleEndianOffset(r0, r0, r2, r3)
            return
    }

    private void writeLiteralBlock(org.apache.commons.compress.compressors.lz77support.LZ77Compressor.LiteralBlock r3) throws java.io.IOException {
            r2 = this;
            int r0 = r3.getLength()
            r1 = 60
            if (r0 > r1) goto Lc
            r2.writeLiteralBlockNoSizeBytes(r3, r0)
            goto L27
        Lc:
            r1 = 256(0x100, float:3.59E-43)
            if (r0 > r1) goto L14
            r2.writeLiteralBlockOneSizeByte(r3, r0)
            goto L27
        L14:
            r1 = 65536(0x10000, float:9.1835E-41)
            if (r0 > r1) goto L1c
            r2.writeLiteralBlockTwoSizeBytes(r3, r0)
            goto L27
        L1c:
            r1 = 16777216(0x1000000, float:2.3509887E-38)
            if (r0 > r1) goto L24
            r2.writeLiteralBlockThreeSizeBytes(r3, r0)
            goto L27
        L24:
            r2.writeLiteralBlockFourSizeBytes(r3, r0)
        L27:
            return
    }

    private void writeLiteralBlockFourSizeBytes(org.apache.commons.compress.compressors.lz77support.LZ77Compressor.LiteralBlock r3, int r4) throws java.io.IOException {
            r2 = this;
            r0 = 252(0xfc, float:3.53E-43)
            r1 = 4
            r2.writeLiteralBlockWithSize(r0, r1, r4, r3)
            return
    }

    private void writeLiteralBlockNoSizeBytes(org.apache.commons.compress.compressors.lz77support.LZ77Compressor.LiteralBlock r3, int r4) throws java.io.IOException {
            r2 = this;
            int r0 = r4 + (-1)
            int r0 = r0 << 2
            r1 = 0
            r2.writeLiteralBlockWithSize(r0, r1, r4, r3)
            return
    }

    private void writeLiteralBlockOneSizeByte(org.apache.commons.compress.compressors.lz77support.LZ77Compressor.LiteralBlock r3, int r4) throws java.io.IOException {
            r2 = this;
            r0 = 240(0xf0, float:3.36E-43)
            r1 = 1
            r2.writeLiteralBlockWithSize(r0, r1, r4, r3)
            return
    }

    private void writeLiteralBlockThreeSizeBytes(org.apache.commons.compress.compressors.lz77support.LZ77Compressor.LiteralBlock r3, int r4) throws java.io.IOException {
            r2 = this;
            r0 = 248(0xf8, float:3.48E-43)
            r1 = 3
            r2.writeLiteralBlockWithSize(r0, r1, r4, r3)
            return
    }

    private void writeLiteralBlockTwoSizeBytes(org.apache.commons.compress.compressors.lz77support.LZ77Compressor.LiteralBlock r3, int r4) throws java.io.IOException {
            r2 = this;
            r0 = 244(0xf4, float:3.42E-43)
            r1 = 2
            r2.writeLiteralBlockWithSize(r0, r1, r4, r3)
            return
    }

    private void writeLiteralBlockWithSize(int r2, int r3, int r4, org.apache.commons.compress.compressors.lz77support.LZ77Compressor.LiteralBlock r5) throws java.io.IOException {
            r1 = this;
            java.io.OutputStream r0 = r1.out
            r0.write(r2)
            int r2 = r4 + (-1)
            r1.writeLittleEndian(r3, r2)
            java.io.OutputStream r2 = r1.out
            byte[] r3 = r5.getData()
            int r5 = r5.getOffset()
            r2.write(r3, r5, r4)
            return
    }

    private void writeLittleEndian(int r4, int r5) throws java.io.IOException {
            r3 = this;
            org.apache.commons.compress.utils.ByteUtils$ByteConsumer r0 = r3.consumer
            long r1 = (long) r5
            org.apache.commons.compress.utils.ByteUtils.toLittleEndian(r0, r1, r4)
            return
    }

    private void writeUncompressedSize(long r4) throws java.io.IOException {
            r3 = this;
        L0:
            r0 = 127(0x7f, double:6.27E-322)
            long r0 = r0 & r4
            int r0 = (int) r0
            long r1 = (long) r0
            int r1 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r1 <= 0) goto Lb
            r1 = 1
            goto Lc
        Lb:
            r1 = 0
        Lc:
            if (r1 == 0) goto L10
            r0 = r0 | 128(0x80, float:1.8E-43)
        L10:
            java.io.OutputStream r2 = r3.out
            r2.write(r0)
            r0 = 7
            long r4 = r4 >> r0
            if (r1 != 0) goto L0
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
            if (r0 != 0) goto Lc
            org.apache.commons.compress.compressors.lz77support.LZ77Compressor r0 = r1.compressor
            r0.finish()
            r0 = 1
            r1.finished = r0
        Lc:
            return
    }

    /* JADX INFO: renamed from: lambda$new$0$org-apache-commons-compress-compressors-snappy-SnappyCompressorOutputStream, reason: not valid java name */
    /* synthetic */ void m2550xe163bd4f(org.apache.commons.compress.compressors.lz77support.LZ77Compressor.Block r3) throws java.io.IOException {
            r2 = this;
            int[] r0 = org.apache.commons.compress.compressors.snappy.SnappyCompressorOutputStream.AnonymousClass1.$SwitchMap$org$apache$commons$compress$compressors$lz77support$LZ77Compressor$Block$BlockType
            org.apache.commons.compress.compressors.lz77support.LZ77Compressor$Block$BlockType r1 = r3.getType()
            int r1 = r1.ordinal()
            r0 = r0[r1]
            r1 = 1
            if (r0 == r1) goto L19
            r1 = 2
            if (r0 == r1) goto L13
            goto L1e
        L13:
            org.apache.commons.compress.compressors.lz77support.LZ77Compressor$BackReference r3 = (org.apache.commons.compress.compressors.lz77support.LZ77Compressor.BackReference) r3
            r2.writeBackReference(r3)
            goto L1e
        L19:
            org.apache.commons.compress.compressors.lz77support.LZ77Compressor$LiteralBlock r3 = (org.apache.commons.compress.compressors.lz77support.LZ77Compressor.LiteralBlock) r3
            r2.writeLiteralBlock(r3)
        L1e:
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
    public void write(byte[] r2, int r3, int r4) throws java.io.IOException {
            r1 = this;
            org.apache.commons.compress.compressors.lz77support.LZ77Compressor r0 = r1.compressor
            r0.compress(r2, r3, r4)
            return
    }
}
