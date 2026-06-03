package org.apache.commons.compress.archivers.zip;

/* JADX INFO: loaded from: classes2.dex */
class FileRandomAccessOutputStream extends org.apache.commons.compress.archivers.zip.RandomAccessOutputStream {
    private final java.nio.channels.FileChannel channel;
    private long position;

    FileRandomAccessOutputStream(java.nio.channels.FileChannel r2) {
            r1 = this;
            r1.<init>()
            java.lang.String r0 = "channel"
            java.lang.Object r2 = java.util.Objects.requireNonNull(r2, r0)
            java.nio.channels.FileChannel r2 = (java.nio.channels.FileChannel) r2
            r1.channel = r2
            return
    }

    FileRandomAccessOutputStream(java.nio.file.Path r4) throws java.io.IOException {
            r3 = this;
            r0 = 3
            java.nio.file.OpenOption[] r0 = new java.nio.file.OpenOption[r0]
            r1 = 0
            java.nio.file.StandardOpenOption r2 = java.nio.file.StandardOpenOption.CREATE
            r0[r1] = r2
            r1 = 1
            java.nio.file.StandardOpenOption r2 = java.nio.file.StandardOpenOption.TRUNCATE_EXISTING
            r0[r1] = r2
            r1 = 2
            java.nio.file.StandardOpenOption r2 = java.nio.file.StandardOpenOption.WRITE
            r0[r1] = r2
            r3.<init>(r4, r0)
            return
    }

    FileRandomAccessOutputStream(java.nio.file.Path r1, java.nio.file.OpenOption... r2) throws java.io.IOException {
            r0 = this;
            java.nio.channels.FileChannel r1 = java.nio.channels.FileChannel.open(r1, r2)
            r0.<init>(r1)
            return
    }

    java.nio.channels.FileChannel channel() {
            r1 = this;
            java.nio.channels.FileChannel r0 = r1.channel
            return r0
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws java.io.IOException {
            r1 = this;
            java.nio.channels.FileChannel r0 = r1.channel
            boolean r0 = r0.isOpen()
            if (r0 == 0) goto Ld
            java.nio.channels.FileChannel r0 = r1.channel
            r0.close()
        Ld:
            return
    }

    @Override // org.apache.commons.compress.archivers.zip.RandomAccessOutputStream
    public synchronized long position() {
            r2 = this;
            monitor-enter(r2)
            long r0 = r2.position     // Catch: java.lang.Throwable -> L5
            monitor-exit(r2)
            return r0
        L5:
            r0 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L5
            throw r0
    }

    @Override // java.io.OutputStream
    public synchronized void write(byte[] r3, int r4, int r5) throws java.io.IOException {
            r2 = this;
            monitor-enter(r2)
            java.nio.channels.FileChannel r0 = r2.channel     // Catch: java.lang.Throwable -> L12
            java.nio.ByteBuffer r3 = java.nio.ByteBuffer.wrap(r3, r4, r5)     // Catch: java.lang.Throwable -> L12
            org.apache.commons.compress.archivers.zip.ZipIoUtil.writeFully(r0, r3)     // Catch: java.lang.Throwable -> L12
            long r3 = r2.position     // Catch: java.lang.Throwable -> L12
            long r0 = (long) r5     // Catch: java.lang.Throwable -> L12
            long r3 = r3 + r0
            r2.position = r3     // Catch: java.lang.Throwable -> L12
            monitor-exit(r2)
            return
        L12:
            r3 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L12
            throw r3
    }

    @Override // org.apache.commons.compress.archivers.zip.RandomAccessOutputStream
    public void writeFully(byte[] r1, int r2, int r3, long r4) throws java.io.IOException {
            r0 = this;
            java.nio.ByteBuffer r1 = java.nio.ByteBuffer.wrap(r1, r2, r3)
        L4:
            boolean r2 = r1.hasRemaining()
            if (r2 == 0) goto L2a
            java.nio.channels.FileChannel r2 = r0.channel
            int r2 = r2.write(r1, r4)
            if (r2 <= 0) goto L15
            long r2 = (long) r2
            long r4 = r4 + r2
            goto L4
        L15:
            java.io.IOException r1 = new java.io.IOException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "Failed to fully write to file: written="
            r3.<init>(r4)
            java.lang.StringBuilder r2 = r3.append(r2)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        L2a:
            return
    }
}
