package org.apache.commons.io.input;

/* JADX INFO: loaded from: classes2.dex */
public final class BufferedFileChannelInputStream extends java.io.InputStream {
    private final java.nio.ByteBuffer byteBuffer;
    private final java.nio.channels.FileChannel fileChannel;

    public static class Builder extends org.apache.commons.io.build.AbstractStreamBuilder<org.apache.commons.io.input.BufferedFileChannelInputStream, org.apache.commons.io.input.BufferedFileChannelInputStream.Builder> {
        public Builder() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // org.apache.commons.io.function.IOSupplier
        public /* bridge */ /* synthetic */ java.lang.Object get() throws java.io.IOException {
                r1 = this;
                org.apache.commons.io.input.BufferedFileChannelInputStream r0 = r1.get()
                return r0
        }

        @Override // org.apache.commons.io.function.IOSupplier
        public org.apache.commons.io.input.BufferedFileChannelInputStream get() throws java.io.IOException {
                r3 = this;
                org.apache.commons.io.input.BufferedFileChannelInputStream r0 = new org.apache.commons.io.input.BufferedFileChannelInputStream
                java.nio.file.Path r1 = r3.getPath()
                int r2 = r3.getBufferSize()
                r0.<init>(r1, r2)
                return r0
        }
    }

    @java.lang.Deprecated
    public BufferedFileChannelInputStream(java.io.File r2) throws java.io.IOException {
            r1 = this;
            r0 = 8192(0x2000, float:1.148E-41)
            r1.<init>(r2, r0)
            return
    }

    @java.lang.Deprecated
    public BufferedFileChannelInputStream(java.io.File r1, int r2) throws java.io.IOException {
            r0 = this;
            java.nio.file.Path r1 = r1.toPath()
            r0.<init>(r1, r2)
            return
    }

    @java.lang.Deprecated
    public BufferedFileChannelInputStream(java.nio.file.Path r2) throws java.io.IOException {
            r1 = this;
            r0 = 8192(0x2000, float:1.148E-41)
            r1.<init>(r2, r0)
            return
    }

    @java.lang.Deprecated
    public BufferedFileChannelInputStream(java.nio.file.Path r4, int r5) throws java.io.IOException {
            r3 = this;
            r3.<init>()
            java.lang.String r0 = "path"
            java.util.Objects.requireNonNull(r4, r0)
            r0 = 1
            java.nio.file.OpenOption[] r0 = new java.nio.file.OpenOption[r0]
            r1 = 0
            java.nio.file.StandardOpenOption r2 = java.nio.file.StandardOpenOption.READ
            r0[r1] = r2
            java.nio.channels.FileChannel r4 = java.nio.channels.FileChannel.open(r4, r0)
            r3.fileChannel = r4
            java.nio.ByteBuffer r4 = java.nio.ByteBuffer.allocateDirect(r5)
            r3.byteBuffer = r4
            r4.flip()
            return
    }

    public static org.apache.commons.io.input.BufferedFileChannelInputStream.Builder builder() {
            org.apache.commons.io.input.BufferedFileChannelInputStream$Builder r0 = new org.apache.commons.io.input.BufferedFileChannelInputStream$Builder
            r0.<init>()
            return r0
    }

    private void clean(java.nio.ByteBuffer r2) {
            r1 = this;
            boolean r0 = r2.isDirect()
            if (r0 == 0) goto L9
            r1.cleanDirectBuffer(r2)
        L9:
            return
    }

    private void cleanDirectBuffer(java.nio.ByteBuffer r2) {
            r1 = this;
            boolean r0 = org.apache.commons.io.input.ByteBufferCleaner.isSupported()
            if (r0 == 0) goto L9
            org.apache.commons.io.input.ByteBufferCleaner.clean(r2)
        L9:
            return
    }

    private boolean refill() throws java.io.IOException {
            r4 = this;
            java.nio.ByteBuffer r0 = r4.byteBuffer
            boolean r0 = r0.hasRemaining()
            r1 = 1
            if (r0 != 0) goto L24
            java.nio.ByteBuffer r0 = r4.byteBuffer
            r0.clear()
            r0 = 0
            r2 = r0
        L10:
            if (r2 != 0) goto L1b
            java.nio.channels.FileChannel r2 = r4.fileChannel
            java.nio.ByteBuffer r3 = r4.byteBuffer
            int r2 = r2.read(r3)
            goto L10
        L1b:
            java.nio.ByteBuffer r3 = r4.byteBuffer
            r3.flip()
            if (r2 < 0) goto L23
            goto L24
        L23:
            r1 = r0
        L24:
            return r1
    }

    private long skipFromFileChannel(long r8) throws java.io.IOException {
            r7 = this;
            java.nio.channels.FileChannel r0 = r7.fileChannel
            long r0 = r0.position()
            java.nio.channels.FileChannel r2 = r7.fileChannel
            long r2 = r2.size()
            long r4 = r2 - r0
            int r6 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
            if (r6 <= 0) goto L18
            java.nio.channels.FileChannel r8 = r7.fileChannel
            r8.position(r2)
            return r4
        L18:
            java.nio.channels.FileChannel r2 = r7.fileChannel
            long r0 = r0 + r8
            r2.position(r0)
            return r8
    }

    @Override // java.io.InputStream
    public synchronized int available() throws java.io.IOException {
            r1 = this;
            monitor-enter(r1)
            java.nio.ByteBuffer r0 = r1.byteBuffer     // Catch: java.lang.Throwable -> L9
            int r0 = r0.remaining()     // Catch: java.lang.Throwable -> L9
            monitor-exit(r1)
            return r0
        L9:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L9
            throw r0
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() throws java.io.IOException {
            r2 = this;
            monitor-enter(r2)
            java.nio.channels.FileChannel r0 = r2.fileChannel     // Catch: java.lang.Throwable -> Ld
            r0.close()     // Catch: java.lang.Throwable -> Ld
            java.nio.ByteBuffer r0 = r2.byteBuffer     // Catch: java.lang.Throwable -> L14
            r2.clean(r0)     // Catch: java.lang.Throwable -> L14
            monitor-exit(r2)
            return
        Ld:
            r0 = move-exception
            java.nio.ByteBuffer r1 = r2.byteBuffer     // Catch: java.lang.Throwable -> L14
            r2.clean(r1)     // Catch: java.lang.Throwable -> L14
            throw r0     // Catch: java.lang.Throwable -> L14
        L14:
            r0 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L14
            throw r0
    }

    @Override // java.io.InputStream
    public synchronized int read() throws java.io.IOException {
            r1 = this;
            monitor-enter(r1)
            boolean r0 = r1.refill()     // Catch: java.lang.Throwable -> L14
            if (r0 != 0) goto La
            monitor-exit(r1)
            r0 = -1
            return r0
        La:
            java.nio.ByteBuffer r0 = r1.byteBuffer     // Catch: java.lang.Throwable -> L14
            byte r0 = r0.get()     // Catch: java.lang.Throwable -> L14
            r0 = r0 & 255(0xff, float:3.57E-43)
            monitor-exit(r1)
            return r0
        L14:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L14
            throw r0
    }

    @Override // java.io.InputStream
    public synchronized int read(byte[] r3, int r4, int r5) throws java.io.IOException {
            r2 = this;
            monitor-enter(r2)
            if (r4 < 0) goto L26
            if (r5 < 0) goto L26
            int r0 = r4 + r5
            if (r0 < 0) goto L26
            int r1 = r3.length     // Catch: java.lang.Throwable -> L2c
            if (r0 > r1) goto L26
            boolean r0 = r2.refill()     // Catch: java.lang.Throwable -> L2c
            if (r0 != 0) goto L15
            monitor-exit(r2)
            r3 = -1
            return r3
        L15:
            java.nio.ByteBuffer r0 = r2.byteBuffer     // Catch: java.lang.Throwable -> L2c
            int r0 = r0.remaining()     // Catch: java.lang.Throwable -> L2c
            int r5 = java.lang.Math.min(r5, r0)     // Catch: java.lang.Throwable -> L2c
            java.nio.ByteBuffer r0 = r2.byteBuffer     // Catch: java.lang.Throwable -> L2c
            r0.get(r3, r4, r5)     // Catch: java.lang.Throwable -> L2c
            monitor-exit(r2)
            return r5
        L26:
            java.lang.IndexOutOfBoundsException r3 = new java.lang.IndexOutOfBoundsException     // Catch: java.lang.Throwable -> L2c
            r3.<init>()     // Catch: java.lang.Throwable -> L2c
            throw r3     // Catch: java.lang.Throwable -> L2c
        L2c:
            r3 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L2c
            throw r3
    }

    @Override // java.io.InputStream
    public synchronized long skip(long r5) throws java.io.IOException {
            r4 = this;
            monitor-enter(r4)
            r0 = 0
            int r2 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r2 > 0) goto L9
            monitor-exit(r4)
            return r0
        L9:
            java.nio.ByteBuffer r0 = r4.byteBuffer     // Catch: java.lang.Throwable -> L3b
            int r0 = r0.remaining()     // Catch: java.lang.Throwable -> L3b
            long r0 = (long) r0     // Catch: java.lang.Throwable -> L3b
            int r0 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r0 < 0) goto L21
            java.nio.ByteBuffer r0 = r4.byteBuffer     // Catch: java.lang.Throwable -> L3b
            int r1 = r0.position()     // Catch: java.lang.Throwable -> L3b
            int r2 = (int) r5     // Catch: java.lang.Throwable -> L3b
            int r1 = r1 + r2
            r0.position(r1)     // Catch: java.lang.Throwable -> L3b
            monitor-exit(r4)
            return r5
        L21:
            java.nio.ByteBuffer r0 = r4.byteBuffer     // Catch: java.lang.Throwable -> L3b
            int r0 = r0.remaining()     // Catch: java.lang.Throwable -> L3b
            long r0 = (long) r0     // Catch: java.lang.Throwable -> L3b
            long r5 = r5 - r0
            java.nio.ByteBuffer r2 = r4.byteBuffer     // Catch: java.lang.Throwable -> L3b
            r3 = 0
            r2.position(r3)     // Catch: java.lang.Throwable -> L3b
            java.nio.ByteBuffer r2 = r4.byteBuffer     // Catch: java.lang.Throwable -> L3b
            r2.flip()     // Catch: java.lang.Throwable -> L3b
            long r5 = r4.skipFromFileChannel(r5)     // Catch: java.lang.Throwable -> L3b
            long r0 = r0 + r5
            monitor-exit(r4)
            return r0
        L3b:
            r5 = move-exception
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L3b
            throw r5
    }
}
