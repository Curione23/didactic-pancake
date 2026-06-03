package org.apache.commons.compress.compressors.snappy;

/* JADX INFO: loaded from: classes2.dex */
public class FramedSnappyCompressorOutputStream extends org.apache.commons.compress.compressors.CompressorOutputStream<java.io.OutputStream> {
    private static final int MAX_COMPRESSED_BUFFER_SIZE = 65536;
    private final byte[] buffer;
    private final org.apache.commons.codec.digest.PureJavaCrc32C checksum;
    private final org.apache.commons.compress.utils.ByteUtils.ByteConsumer consumer;
    private int currentIndex;
    private final byte[] oneByte;
    private final org.apache.commons.compress.compressors.lz77support.Parameters params;

    public FramedSnappyCompressorOutputStream(java.io.OutputStream r2) throws java.io.IOException {
            r1 = this;
            r0 = 32768(0x8000, float:4.5918E-41)
            org.apache.commons.compress.compressors.lz77support.Parameters$Builder r0 = org.apache.commons.compress.compressors.snappy.SnappyCompressorOutputStream.createParameterBuilder(r0)
            org.apache.commons.compress.compressors.lz77support.Parameters r0 = r0.build()
            r1.<init>(r2, r0)
            return
    }

    public FramedSnappyCompressorOutputStream(java.io.OutputStream r2, org.apache.commons.compress.compressors.lz77support.Parameters r3) throws java.io.IOException {
            r1 = this;
            r1.<init>(r2)
            org.apache.commons.codec.digest.PureJavaCrc32C r0 = new org.apache.commons.codec.digest.PureJavaCrc32C
            r0.<init>()
            r1.checksum = r0
            r0 = 1
            byte[] r0 = new byte[r0]
            r1.oneByte = r0
            r0 = 65536(0x10000, float:9.1835E-41)
            byte[] r0 = new byte[r0]
            r1.buffer = r0
            r1.params = r3
            org.apache.commons.compress.utils.ByteUtils$OutputStreamByteConsumer r3 = new org.apache.commons.compress.utils.ByteUtils$OutputStreamByteConsumer
            r3.<init>(r2)
            r1.consumer = r3
            byte[] r3 = org.apache.commons.compress.compressors.snappy.FramedSnappyCompressorInputStream.SZ_SIGNATURE
            r2.write(r3)
            return
    }

    private void flushBuffer() throws java.io.IOException {
            r6 = this;
            int r0 = r6.currentIndex
            if (r0 != 0) goto L5
            return
        L5:
            java.io.OutputStream r0 = r6.out
            r1 = 0
            r0.write(r1)
            java.io.ByteArrayOutputStream r0 = new java.io.ByteArrayOutputStream
            r0.<init>()
            org.apache.commons.compress.compressors.snappy.SnappyCompressorOutputStream r2 = new org.apache.commons.compress.compressors.snappy.SnappyCompressorOutputStream
            int r3 = r6.currentIndex
            long r3 = (long) r3
            org.apache.commons.compress.compressors.lz77support.Parameters r5 = r6.params
            r2.<init>(r0, r3, r5)
            byte[] r3 = r6.buffer     // Catch: java.lang.Throwable -> L3c
            int r4 = r6.currentIndex     // Catch: java.lang.Throwable -> L3c
            r2.write(r3, r1, r4)     // Catch: java.lang.Throwable -> L3c
            r2.close()
            byte[] r0 = r0.toByteArray()
            int r2 = r0.length
            long r2 = (long) r2
            r4 = 4
            long r2 = r2 + r4
            r4 = 3
            r6.writeLittleEndian(r4, r2)
            r6.writeCrc()
            java.io.OutputStream r2 = r6.out
            r2.write(r0)
            r6.currentIndex = r1
            return
        L3c:
            r0 = move-exception
            r2.close()     // Catch: java.lang.Throwable -> L41
            goto L45
        L41:
            r1 = move-exception
            r0.addSuppressed(r1)
        L45:
            throw r0
    }

    static long mask(long r3) {
            r0 = 15
            long r0 = r3 >> r0
            r2 = 17
            long r3 = r3 << r2
            long r3 = r3 | r0
            r0 = 2726488792(0xa282ead8, double:1.347064446E-314)
            long r3 = r3 + r0
            r0 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r3 = r3 & r0
            return r3
    }

    private void writeCrc() throws java.io.IOException {
            r4 = this;
            org.apache.commons.codec.digest.PureJavaCrc32C r0 = r4.checksum
            byte[] r1 = r4.buffer
            r2 = 0
            int r3 = r4.currentIndex
            r0.update(r1, r2, r3)
            org.apache.commons.codec.digest.PureJavaCrc32C r0 = r4.checksum
            long r0 = r0.getValue()
            long r0 = mask(r0)
            r2 = 4
            r4.writeLittleEndian(r2, r0)
            org.apache.commons.codec.digest.PureJavaCrc32C r0 = r4.checksum
            r0.reset()
            return
    }

    private void writeLittleEndian(int r2, long r3) throws java.io.IOException {
            r1 = this;
            org.apache.commons.compress.utils.ByteUtils$ByteConsumer r0 = r1.consumer
            org.apache.commons.compress.utils.ByteUtils.toLittleEndian(r0, r3, r2)
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
            r0 = this;
            r0.flushBuffer()
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
            byte[] r0 = r4.buffer
            int r0 = r0.length
            int r1 = r4.currentIndex
            int r0 = r0 - r1
        L6:
            if (r7 <= 0) goto L24
            int r1 = java.lang.Math.min(r7, r0)
            byte[] r2 = r4.buffer
            int r3 = r4.currentIndex
            java.lang.System.arraycopy(r5, r6, r2, r3, r1)
            int r6 = r6 + r1
            int r0 = r0 - r1
            int r7 = r7 - r1
            int r2 = r4.currentIndex
            int r2 = r2 + r1
            r4.currentIndex = r2
            if (r0 != 0) goto L6
            r4.flushBuffer()
            byte[] r0 = r4.buffer
            int r0 = r0.length
            goto L6
        L24:
            return
    }
}
