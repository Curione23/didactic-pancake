package org.apache.commons.compress.archivers.zip;

/* JADX INFO: loaded from: classes2.dex */
public abstract class StreamCompressor implements java.io.Closeable {
    private static final int BUFFER_SIZE = 4096;
    private static final int DEFLATER_BLOCK_SIZE = 8192;
    private final java.util.zip.CRC32 crc;
    private final java.util.zip.Deflater deflater;
    private final byte[] outputBuffer;
    private final byte[] readerBuf;
    private long sourcePayloadLength;
    private long totalWrittenToOutputStream;
    private long writtenToOutputStreamForLastEntry;

    private static final class DataOutputCompressor extends org.apache.commons.compress.archivers.zip.StreamCompressor {
        private final java.io.DataOutput raf;

        DataOutputCompressor(java.util.zip.Deflater r1, java.io.DataOutput r2) {
                r0 = this;
                r0.<init>(r1)
                r0.raf = r2
                return
        }

        @Override // org.apache.commons.compress.archivers.zip.StreamCompressor
        protected void writeOut(byte[] r2, int r3, int r4) throws java.io.IOException {
                r1 = this;
                java.io.DataOutput r0 = r1.raf
                r0.write(r2, r3, r4)
                return
        }
    }

    private static final class OutputStreamCompressor extends org.apache.commons.compress.archivers.zip.StreamCompressor {
        private final java.io.OutputStream os;

        OutputStreamCompressor(java.util.zip.Deflater r1, java.io.OutputStream r2) {
                r0 = this;
                r0.<init>(r1)
                r0.os = r2
                return
        }

        @Override // org.apache.commons.compress.archivers.zip.StreamCompressor
        protected void writeOut(byte[] r2, int r3, int r4) throws java.io.IOException {
                r1 = this;
                java.io.OutputStream r0 = r1.os
                r0.write(r2, r3, r4)
                return
        }
    }

    private static final class ScatterGatherBackingStoreCompressor extends org.apache.commons.compress.archivers.zip.StreamCompressor {
        private final org.apache.commons.compress.parallel.ScatterGatherBackingStore bs;

        ScatterGatherBackingStoreCompressor(java.util.zip.Deflater r1, org.apache.commons.compress.parallel.ScatterGatherBackingStore r2) {
                r0 = this;
                r0.<init>(r1)
                r0.bs = r2
                return
        }

        @Override // org.apache.commons.compress.archivers.zip.StreamCompressor
        protected void writeOut(byte[] r2, int r3, int r4) throws java.io.IOException {
                r1 = this;
                org.apache.commons.compress.parallel.ScatterGatherBackingStore r0 = r1.bs
                r0.writeOut(r2, r3, r4)
                return
        }
    }

    private static final class SeekableByteChannelCompressor extends org.apache.commons.compress.archivers.zip.StreamCompressor {
        private final java.nio.channels.SeekableByteChannel channel;

        SeekableByteChannelCompressor(java.util.zip.Deflater r1, java.nio.channels.SeekableByteChannel r2) {
                r0 = this;
                r0.<init>(r1)
                r0.channel = r2
                return
        }

        @Override // org.apache.commons.compress.archivers.zip.StreamCompressor
        protected void writeOut(byte[] r2, int r3, int r4) throws java.io.IOException {
                r1 = this;
                java.nio.channels.SeekableByteChannel r0 = r1.channel
                java.nio.ByteBuffer r2 = java.nio.ByteBuffer.wrap(r2, r3, r4)
                r0.write(r2)
                return
        }
    }

    StreamCompressor(java.util.zip.Deflater r3) {
            r2 = this;
            r2.<init>()
            java.util.zip.CRC32 r0 = new java.util.zip.CRC32
            r0.<init>()
            r2.crc = r0
            r0 = 4096(0x1000, float:5.74E-42)
            byte[] r1 = new byte[r0]
            r2.outputBuffer = r1
            byte[] r0 = new byte[r0]
            r2.readerBuf = r0
            r2.deflater = r3
            return
    }

    public static org.apache.commons.compress.archivers.zip.StreamCompressor create(int r2, org.apache.commons.compress.parallel.ScatterGatherBackingStore r3) {
            java.util.zip.Deflater r0 = new java.util.zip.Deflater
            r1 = 1
            r0.<init>(r2, r1)
            org.apache.commons.compress.archivers.zip.StreamCompressor$ScatterGatherBackingStoreCompressor r2 = new org.apache.commons.compress.archivers.zip.StreamCompressor$ScatterGatherBackingStoreCompressor
            r2.<init>(r0, r3)
            return r2
    }

    static org.apache.commons.compress.archivers.zip.StreamCompressor create(java.io.DataOutput r1, java.util.zip.Deflater r2) {
            org.apache.commons.compress.archivers.zip.StreamCompressor$DataOutputCompressor r0 = new org.apache.commons.compress.archivers.zip.StreamCompressor$DataOutputCompressor
            r0.<init>(r2, r1)
            return r0
    }

    static org.apache.commons.compress.archivers.zip.StreamCompressor create(java.io.OutputStream r3) {
            java.util.zip.Deflater r0 = new java.util.zip.Deflater
            r1 = -1
            r2 = 1
            r0.<init>(r1, r2)
            org.apache.commons.compress.archivers.zip.StreamCompressor r3 = create(r3, r0)
            return r3
    }

    static org.apache.commons.compress.archivers.zip.StreamCompressor create(java.io.OutputStream r1, java.util.zip.Deflater r2) {
            org.apache.commons.compress.archivers.zip.StreamCompressor$OutputStreamCompressor r0 = new org.apache.commons.compress.archivers.zip.StreamCompressor$OutputStreamCompressor
            r0.<init>(r2, r1)
            return r0
    }

    static org.apache.commons.compress.archivers.zip.StreamCompressor create(java.nio.channels.SeekableByteChannel r1, java.util.zip.Deflater r2) {
            org.apache.commons.compress.archivers.zip.StreamCompressor$SeekableByteChannelCompressor r0 = new org.apache.commons.compress.archivers.zip.StreamCompressor$SeekableByteChannelCompressor
            r0.<init>(r2, r1)
            return r0
    }

    public static org.apache.commons.compress.archivers.zip.StreamCompressor create(org.apache.commons.compress.parallel.ScatterGatherBackingStore r1) {
            r0 = -1
            org.apache.commons.compress.archivers.zip.StreamCompressor r1 = create(r0, r1)
            return r1
    }

    private void deflateUntilInputIsNeeded() throws java.io.IOException {
            r1 = this;
        L0:
            java.util.zip.Deflater r0 = r1.deflater
            boolean r0 = r0.needsInput()
            if (r0 != 0) goto Lc
            r1.deflate()
            goto L0
        Lc:
            return
    }

    private void writeDeflated(byte[] r6, int r7, int r8) throws java.io.IOException {
            r5 = this;
            if (r8 <= 0) goto L37
            java.util.zip.Deflater r0 = r5.deflater
            boolean r0 = r0.finished()
            if (r0 != 0) goto L37
            r0 = 8192(0x2000, float:1.148E-41)
            if (r8 > r0) goto L17
            java.util.zip.Deflater r0 = r5.deflater
            r0.setInput(r6, r7, r8)
            r5.deflateUntilInputIsNeeded()
            goto L37
        L17:
            int r1 = r8 / 8192
            r2 = 0
        L1a:
            if (r2 >= r1) goto L2a
            java.util.zip.Deflater r3 = r5.deflater
            int r4 = r2 * 8192
            int r4 = r4 + r7
            r3.setInput(r6, r4, r0)
            r5.deflateUntilInputIsNeeded()
            int r2 = r2 + 1
            goto L1a
        L2a:
            int r1 = r1 * r0
            if (r1 >= r8) goto L37
            java.util.zip.Deflater r0 = r5.deflater
            int r7 = r7 + r1
            int r8 = r8 - r1
            r0.setInput(r6, r7, r8)
            r5.deflateUntilInputIsNeeded()
        L37:
            return
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws java.io.IOException {
            r1 = this;
            java.util.zip.Deflater r0 = r1.deflater
            r0.end()
            return
    }

    void deflate() throws java.io.IOException {
            r4 = this;
            java.util.zip.Deflater r0 = r4.deflater
            byte[] r1 = r4.outputBuffer
            int r2 = r1.length
            r3 = 0
            int r0 = r0.deflate(r1, r3, r2)
            if (r0 <= 0) goto L11
            byte[] r1 = r4.outputBuffer
            r4.writeCounted(r1, r3, r0)
        L11:
            return
    }

    public void deflate(java.io.InputStream r4, int r5) throws java.io.IOException {
            r3 = this;
            r3.reset()
        L3:
            byte[] r0 = r3.readerBuf
            int r1 = r0.length
            r2 = 0
            int r0 = r4.read(r0, r2, r1)
            if (r0 < 0) goto L13
            byte[] r1 = r3.readerBuf
            r3.write(r1, r2, r0, r5)
            goto L3
        L13:
            r4 = 8
            if (r5 != r4) goto L1a
            r3.flushDeflater()
        L1a:
            return
    }

    void flushDeflater() throws java.io.IOException {
            r1 = this;
            java.util.zip.Deflater r0 = r1.deflater
            r0.finish()
        L5:
            java.util.zip.Deflater r0 = r1.deflater
            boolean r0 = r0.finished()
            if (r0 != 0) goto L11
            r1.deflate()
            goto L5
        L11:
            return
    }

    public long getBytesRead() {
            r2 = this;
            long r0 = r2.sourcePayloadLength
            return r0
    }

    public long getBytesWrittenForLastEntry() {
            r2 = this;
            long r0 = r2.writtenToOutputStreamForLastEntry
            return r0
    }

    public long getCrc32() {
            r2 = this;
            java.util.zip.CRC32 r0 = r2.crc
            long r0 = r0.getValue()
            return r0
    }

    public long getTotalBytesWritten() {
            r2 = this;
            long r0 = r2.totalWrittenToOutputStream
            return r0
    }

    void reset() {
            r2 = this;
            java.util.zip.CRC32 r0 = r2.crc
            r0.reset()
            java.util.zip.Deflater r0 = r2.deflater
            r0.reset()
            r0 = 0
            r2.sourcePayloadLength = r0
            r2.writtenToOutputStreamForLastEntry = r0
            return
    }

    long write(byte[] r4, int r5, int r6, int r7) throws java.io.IOException {
            r3 = this;
            long r0 = r3.writtenToOutputStreamForLastEntry
            java.util.zip.CRC32 r2 = r3.crc
            r2.update(r4, r5, r6)
            r2 = 8
            if (r7 != r2) goto Lf
            r3.writeDeflated(r4, r5, r6)
            goto L12
        Lf:
            r3.writeCounted(r4, r5, r6)
        L12:
            long r4 = r3.sourcePayloadLength
            long r6 = (long) r6
            long r4 = r4 + r6
            r3.sourcePayloadLength = r4
            long r4 = r3.writtenToOutputStreamForLastEntry
            long r4 = r4 - r0
            return r4
    }

    public void writeCounted(byte[] r3) throws java.io.IOException {
            r2 = this;
            r0 = 0
            int r1 = r3.length
            r2.writeCounted(r3, r0, r1)
            return
    }

    public void writeCounted(byte[] r3, int r4, int r5) throws java.io.IOException {
            r2 = this;
            r2.writeOut(r3, r4, r5)
            long r3 = r2.writtenToOutputStreamForLastEntry
            long r0 = (long) r5
            long r3 = r3 + r0
            r2.writtenToOutputStreamForLastEntry = r3
            long r3 = r2.totalWrittenToOutputStream
            long r3 = r3 + r0
            r2.totalWrittenToOutputStream = r3
            return
    }

    protected abstract void writeOut(byte[] r1, int r2, int r3) throws java.io.IOException;
}
