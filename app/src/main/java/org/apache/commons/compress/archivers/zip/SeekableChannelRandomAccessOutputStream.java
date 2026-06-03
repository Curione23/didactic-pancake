package org.apache.commons.compress.archivers.zip;

/* JADX INFO: loaded from: classes2.dex */
class SeekableChannelRandomAccessOutputStream extends org.apache.commons.compress.archivers.zip.RandomAccessOutputStream {
    private final java.nio.channels.SeekableByteChannel channel;

    SeekableChannelRandomAccessOutputStream(java.nio.channels.SeekableByteChannel r1) {
            r0 = this;
            r0.<init>()
            r0.channel = r1
            return
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() throws java.io.IOException {
            r1 = this;
            monitor-enter(r1)
            java.nio.channels.SeekableByteChannel r0 = r1.channel     // Catch: java.lang.Throwable -> L8
            r0.close()     // Catch: java.lang.Throwable -> L8
            monitor-exit(r1)
            return
        L8:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L8
            throw r0
    }

    @Override // org.apache.commons.compress.archivers.zip.RandomAccessOutputStream
    public synchronized long position() throws java.io.IOException {
            r2 = this;
            monitor-enter(r2)
            java.nio.channels.SeekableByteChannel r0 = r2.channel     // Catch: java.lang.Throwable -> L9
            long r0 = r0.position()     // Catch: java.lang.Throwable -> L9
            monitor-exit(r2)
            return r0
        L9:
            r0 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L9
            throw r0
    }

    @Override // java.io.OutputStream
    public synchronized void write(byte[] r2, int r3, int r4) throws java.io.IOException {
            r1 = this;
            monitor-enter(r1)
            java.nio.channels.SeekableByteChannel r0 = r1.channel     // Catch: java.lang.Throwable -> Lc
            java.nio.ByteBuffer r2 = java.nio.ByteBuffer.wrap(r2, r3, r4)     // Catch: java.lang.Throwable -> Lc
            org.apache.commons.compress.archivers.zip.ZipIoUtil.writeFully(r0, r2)     // Catch: java.lang.Throwable -> Lc
            monitor-exit(r1)
            return
        Lc:
            r2 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> Lc
            throw r2
    }

    @Override // org.apache.commons.compress.archivers.zip.RandomAccessOutputStream
    public synchronized void writeFully(byte[] r4, int r5, int r6, long r7) throws java.io.IOException {
            r3 = this;
            monitor-enter(r3)
            java.nio.channels.SeekableByteChannel r0 = r3.channel     // Catch: java.lang.Throwable -> L23
            long r0 = r0.position()     // Catch: java.lang.Throwable -> L23
            java.nio.channels.SeekableByteChannel r2 = r3.channel     // Catch: java.lang.Throwable -> L1c
            r2.position(r7)     // Catch: java.lang.Throwable -> L1c
            java.nio.channels.SeekableByteChannel r7 = r3.channel     // Catch: java.lang.Throwable -> L1c
            java.nio.ByteBuffer r4 = java.nio.ByteBuffer.wrap(r4, r5, r6)     // Catch: java.lang.Throwable -> L1c
            org.apache.commons.compress.archivers.zip.ZipIoUtil.writeFully(r7, r4)     // Catch: java.lang.Throwable -> L1c
            java.nio.channels.SeekableByteChannel r4 = r3.channel     // Catch: java.lang.Throwable -> L23
            r4.position(r0)     // Catch: java.lang.Throwable -> L23
            monitor-exit(r3)
            return
        L1c:
            r4 = move-exception
            java.nio.channels.SeekableByteChannel r5 = r3.channel     // Catch: java.lang.Throwable -> L23
            r5.position(r0)     // Catch: java.lang.Throwable -> L23
            throw r4     // Catch: java.lang.Throwable -> L23
        L23:
            r4 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L23
            throw r4
    }
}
