package org.apache.commons.io.input;

/* JADX INFO: loaded from: classes2.dex */
public final class MemoryMappedFileInputStream extends java.io.InputStream {
    private static final int DEFAULT_BUFFER_SIZE = 262144;
    private static final java.nio.ByteBuffer EMPTY_BUFFER = null;
    private java.nio.ByteBuffer buffer;
    private final int bufferSize;
    private final java.nio.channels.FileChannel channel;
    private boolean closed;
    private long nextBufferPosition;

    /* JADX INFO: renamed from: org.apache.commons.io.input.MemoryMappedFileInputStream$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
    }

    public static class Builder extends org.apache.commons.io.build.AbstractStreamBuilder<org.apache.commons.io.input.MemoryMappedFileInputStream, org.apache.commons.io.input.MemoryMappedFileInputStream.Builder> {
        public Builder() {
                r1 = this;
                r1.<init>()
                r0 = 262144(0x40000, float:3.67342E-40)
                r1.setBufferSizeDefault(r0)
                r1.setBufferSize(r0)
                return
        }

        @Override // org.apache.commons.io.function.IOSupplier
        public /* bridge */ /* synthetic */ java.lang.Object get() throws java.io.IOException {
                r1 = this;
                org.apache.commons.io.input.MemoryMappedFileInputStream r0 = r1.get()
                return r0
        }

        @Override // org.apache.commons.io.function.IOSupplier
        public org.apache.commons.io.input.MemoryMappedFileInputStream get() throws java.io.IOException {
                r4 = this;
                org.apache.commons.io.input.MemoryMappedFileInputStream r0 = new org.apache.commons.io.input.MemoryMappedFileInputStream
                java.nio.file.Path r1 = r4.getPath()
                int r2 = r4.getBufferSize()
                r3 = 0
                r0.<init>(r1, r2, r3)
                return r0
        }
    }

    static {
            r0 = 0
            byte[] r0 = new byte[r0]
            java.nio.ByteBuffer r0 = java.nio.ByteBuffer.wrap(r0)
            java.nio.ByteBuffer r0 = r0.asReadOnlyBuffer()
            org.apache.commons.io.input.MemoryMappedFileInputStream.EMPTY_BUFFER = r0
            return
    }

    private MemoryMappedFileInputStream(java.nio.file.Path r3, int r4) throws java.io.IOException {
            r2 = this;
            r2.<init>()
            java.nio.ByteBuffer r0 = org.apache.commons.io.input.MemoryMappedFileInputStream.EMPTY_BUFFER
            r2.buffer = r0
            r2.bufferSize = r4
            r4 = 1
            java.nio.file.OpenOption[] r4 = new java.nio.file.OpenOption[r4]
            r0 = 0
            java.nio.file.StandardOpenOption r1 = java.nio.file.StandardOpenOption.READ
            r4[r0] = r1
            java.nio.channels.FileChannel r3 = java.nio.channels.FileChannel.open(r3, r4)
            r2.channel = r3
            return
    }

    /* synthetic */ MemoryMappedFileInputStream(java.nio.file.Path r1, int r2, org.apache.commons.io.input.MemoryMappedFileInputStream.AnonymousClass1 r3) throws java.io.IOException {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    public static org.apache.commons.io.input.MemoryMappedFileInputStream.Builder builder() {
            org.apache.commons.io.input.MemoryMappedFileInputStream$Builder r0 = new org.apache.commons.io.input.MemoryMappedFileInputStream$Builder
            r0.<init>()
            return r0
    }

    private void cleanBuffer() {
            r1 = this;
            boolean r0 = org.apache.commons.io.input.ByteBufferCleaner.isSupported()
            if (r0 == 0) goto L13
            java.nio.ByteBuffer r0 = r1.buffer
            boolean r0 = r0.isDirect()
            if (r0 == 0) goto L13
            java.nio.ByteBuffer r0 = r1.buffer
            org.apache.commons.io.input.ByteBufferCleaner.clean(r0)
        L13:
            return
    }

    private void ensureOpen() throws java.io.IOException {
            r2 = this;
            boolean r0 = r2.closed
            if (r0 != 0) goto L5
            return
        L5:
            java.io.IOException r0 = new java.io.IOException
            java.lang.String r1 = "Stream closed"
            r0.<init>(r1)
            throw r0
    }

    private void nextBuffer() throws java.io.IOException {
            r10 = this;
            java.nio.channels.FileChannel r0 = r10.channel
            long r0 = r0.size()
            long r2 = r10.nextBufferPosition
            long r0 = r0 - r2
            r2 = 0
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 <= 0) goto L2c
            int r2 = r10.bufferSize
            long r2 = (long) r2
            long r0 = java.lang.Math.min(r0, r2)
            r10.cleanBuffer()
            java.nio.channels.FileChannel r4 = r10.channel
            java.nio.channels.FileChannel$MapMode r5 = java.nio.channels.FileChannel.MapMode.READ_ONLY
            long r6 = r10.nextBufferPosition
            r8 = r0
            java.nio.MappedByteBuffer r2 = r4.map(r5, r6, r8)
            r10.buffer = r2
            long r2 = r10.nextBufferPosition
            long r2 = r2 + r0
            r10.nextBufferPosition = r2
            goto L30
        L2c:
            java.nio.ByteBuffer r0 = org.apache.commons.io.input.MemoryMappedFileInputStream.EMPTY_BUFFER
            r10.buffer = r0
        L30:
            return
    }

    @Override // java.io.InputStream
    public int available() throws java.io.IOException {
            r1 = this;
            java.nio.ByteBuffer r0 = r1.buffer
            int r0 = r0.remaining()
            return r0
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws java.io.IOException {
            r1 = this;
            boolean r0 = r1.closed
            if (r0 != 0) goto L12
            r1.cleanBuffer()
            r0 = 0
            r1.buffer = r0
            java.nio.channels.FileChannel r0 = r1.channel
            r0.close()
            r0 = 1
            r1.closed = r0
        L12:
            return
    }

    int getBufferSize() {
            r1 = this;
            int r0 = r1.bufferSize
            return r0
    }

    @Override // java.io.InputStream
    public int read() throws java.io.IOException {
            r1 = this;
            r1.ensureOpen()
            java.nio.ByteBuffer r0 = r1.buffer
            boolean r0 = r0.hasRemaining()
            if (r0 != 0) goto L18
            r1.nextBuffer()
            java.nio.ByteBuffer r0 = r1.buffer
            boolean r0 = r0.hasRemaining()
            if (r0 != 0) goto L18
            r0 = -1
            return r0
        L18:
            java.nio.ByteBuffer r0 = r1.buffer
            byte r0 = r0.get()
            short r0 = (short) r0
            int r0 = java.lang.Short.toUnsignedInt(r0)
            return r0
    }

    @Override // java.io.InputStream
    public int read(byte[] r2, int r3, int r4) throws java.io.IOException {
            r1 = this;
            r1.ensureOpen()
            java.nio.ByteBuffer r0 = r1.buffer
            boolean r0 = r0.hasRemaining()
            if (r0 != 0) goto L18
            r1.nextBuffer()
            java.nio.ByteBuffer r0 = r1.buffer
            boolean r0 = r0.hasRemaining()
            if (r0 != 0) goto L18
            r2 = -1
            return r2
        L18:
            java.nio.ByteBuffer r0 = r1.buffer
            int r0 = r0.remaining()
            int r4 = java.lang.Math.min(r0, r4)
            java.nio.ByteBuffer r0 = r1.buffer
            r0.get(r2, r3, r4)
            return r4
    }

    @Override // java.io.InputStream
    public long skip(long r7) throws java.io.IOException {
            r6 = this;
            r6.ensureOpen()
            r0 = 0
            int r2 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r2 > 0) goto La
            return r0
        La:
            java.nio.ByteBuffer r0 = r6.buffer
            int r0 = r0.remaining()
            long r0 = (long) r0
            int r0 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r0 > 0) goto L22
            java.nio.ByteBuffer r0 = r6.buffer
            int r1 = r0.position()
            long r1 = (long) r1
            long r1 = r1 + r7
            int r1 = (int) r1
            r0.position(r1)
            return r7
        L22:
            java.nio.channels.FileChannel r0 = r6.channel
            long r0 = r0.size()
            long r2 = r6.nextBufferPosition
            long r0 = r0 - r2
            java.nio.ByteBuffer r2 = r6.buffer
            int r2 = r2.remaining()
            long r2 = (long) r2
            java.nio.ByteBuffer r4 = r6.buffer
            int r4 = r4.remaining()
            long r4 = (long) r4
            long r7 = r7 - r4
            long r7 = java.lang.Math.min(r0, r7)
            long r2 = r2 + r7
            long r7 = r6.nextBufferPosition
            java.nio.ByteBuffer r0 = r6.buffer
            int r0 = r0.remaining()
            long r0 = (long) r0
            long r0 = r2 - r0
            long r7 = r7 + r0
            r6.nextBufferPosition = r7
            r6.nextBuffer()
            return r2
    }
}
