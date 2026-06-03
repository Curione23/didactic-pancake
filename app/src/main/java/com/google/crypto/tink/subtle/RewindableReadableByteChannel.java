package com.google.crypto.tink.subtle;

/* JADX INFO: loaded from: classes2.dex */
public final class RewindableReadableByteChannel implements java.nio.channels.ReadableByteChannel {
    final java.nio.channels.ReadableByteChannel baseChannel;
    java.nio.ByteBuffer buffer;
    boolean canRewind;
    boolean directRead;

    public RewindableReadableByteChannel(java.nio.channels.ReadableByteChannel r1) {
            r0 = this;
            r0.<init>()
            r0.baseChannel = r1
            r1 = 0
            r0.buffer = r1
            r1 = 1
            r0.canRewind = r1
            r1 = 0
            r0.directRead = r1
            return
    }

    private synchronized void setBufferLimit(int r4) {
            r3 = this;
            monitor-enter(r3)
            java.nio.ByteBuffer r0 = r3.buffer     // Catch: java.lang.Throwable -> L35
            int r0 = r0.capacity()     // Catch: java.lang.Throwable -> L35
            if (r0 >= r4) goto L2e
            java.nio.ByteBuffer r0 = r3.buffer     // Catch: java.lang.Throwable -> L35
            int r0 = r0.position()     // Catch: java.lang.Throwable -> L35
            java.nio.ByteBuffer r1 = r3.buffer     // Catch: java.lang.Throwable -> L35
            int r1 = r1.capacity()     // Catch: java.lang.Throwable -> L35
            int r1 = r1 * 2
            int r1 = java.lang.Math.max(r1, r4)     // Catch: java.lang.Throwable -> L35
            java.nio.ByteBuffer r1 = java.nio.ByteBuffer.allocate(r1)     // Catch: java.lang.Throwable -> L35
            java.nio.ByteBuffer r2 = r3.buffer     // Catch: java.lang.Throwable -> L35
            r2.rewind()     // Catch: java.lang.Throwable -> L35
            java.nio.ByteBuffer r2 = r3.buffer     // Catch: java.lang.Throwable -> L35
            r1.put(r2)     // Catch: java.lang.Throwable -> L35
            r1.position(r0)     // Catch: java.lang.Throwable -> L35
            r3.buffer = r1     // Catch: java.lang.Throwable -> L35
        L2e:
            java.nio.ByteBuffer r0 = r3.buffer     // Catch: java.lang.Throwable -> L35
            r0.limit(r4)     // Catch: java.lang.Throwable -> L35
            monitor-exit(r3)
            return
        L35:
            r4 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L35
            throw r4
    }

    @Override // java.nio.channels.Channel, java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() throws java.io.IOException {
            r1 = this;
            monitor-enter(r1)
            r0 = 0
            r1.canRewind = r0     // Catch: java.lang.Throwable -> Le
            r0 = 1
            r1.directRead = r0     // Catch: java.lang.Throwable -> Le
            java.nio.channels.ReadableByteChannel r0 = r1.baseChannel     // Catch: java.lang.Throwable -> Le
            r0.close()     // Catch: java.lang.Throwable -> Le
            monitor-exit(r1)
            return
        Le:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> Le
            throw r0
    }

    public synchronized void disableRewinding() {
            r1 = this;
            monitor-enter(r1)
            r0 = 0
            r1.canRewind = r0     // Catch: java.lang.Throwable -> L6
            monitor-exit(r1)
            return
        L6:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L6
            throw r0
    }

    @Override // java.nio.channels.Channel
    public synchronized boolean isOpen() {
            r1 = this;
            monitor-enter(r1)
            java.nio.channels.ReadableByteChannel r0 = r1.baseChannel     // Catch: java.lang.Throwable -> L9
            boolean r0 = r0.isOpen()     // Catch: java.lang.Throwable -> L9
            monitor-exit(r1)
            return r0
        L9:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L9
            throw r0
    }

    @Override // java.nio.channels.ReadableByteChannel
    public synchronized int read(java.nio.ByteBuffer r7) throws java.io.IOException {
            r6 = this;
            monitor-enter(r6)
            boolean r0 = r6.directRead     // Catch: java.lang.Throwable -> Lc9
            if (r0 == 0) goto Ld
            java.nio.channels.ReadableByteChannel r0 = r6.baseChannel     // Catch: java.lang.Throwable -> Lc9
            int r7 = r0.read(r7)     // Catch: java.lang.Throwable -> Lc9
            monitor-exit(r6)
            return r7
        Ld:
            int r0 = r7.remaining()     // Catch: java.lang.Throwable -> Lc9
            if (r0 != 0) goto L16
            monitor-exit(r6)
            r7 = 0
            return r7
        L16:
            java.nio.ByteBuffer r1 = r6.buffer     // Catch: java.lang.Throwable -> Lc9
            r2 = 1
            if (r1 != 0) goto L43
            boolean r1 = r6.canRewind     // Catch: java.lang.Throwable -> Lc9
            if (r1 != 0) goto L29
            r6.directRead = r2     // Catch: java.lang.Throwable -> Lc9
            java.nio.channels.ReadableByteChannel r0 = r6.baseChannel     // Catch: java.lang.Throwable -> Lc9
            int r7 = r0.read(r7)     // Catch: java.lang.Throwable -> Lc9
            monitor-exit(r6)
            return r7
        L29:
            java.nio.ByteBuffer r0 = java.nio.ByteBuffer.allocate(r0)     // Catch: java.lang.Throwable -> Lc9
            r6.buffer = r0     // Catch: java.lang.Throwable -> Lc9
            java.nio.channels.ReadableByteChannel r1 = r6.baseChannel     // Catch: java.lang.Throwable -> Lc9
            int r0 = r1.read(r0)     // Catch: java.lang.Throwable -> Lc9
            java.nio.ByteBuffer r1 = r6.buffer     // Catch: java.lang.Throwable -> Lc9
            r1.flip()     // Catch: java.lang.Throwable -> Lc9
            if (r0 <= 0) goto L41
            java.nio.ByteBuffer r1 = r6.buffer     // Catch: java.lang.Throwable -> Lc9
            r7.put(r1)     // Catch: java.lang.Throwable -> Lc9
        L41:
            monitor-exit(r6)
            return r0
        L43:
            int r1 = r1.remaining()     // Catch: java.lang.Throwable -> Lc9
            r3 = 0
            if (r1 < r0) goto L76
            java.nio.ByteBuffer r1 = r6.buffer     // Catch: java.lang.Throwable -> Lc9
            int r1 = r1.limit()     // Catch: java.lang.Throwable -> Lc9
            java.nio.ByteBuffer r4 = r6.buffer     // Catch: java.lang.Throwable -> Lc9
            int r5 = r4.position()     // Catch: java.lang.Throwable -> Lc9
            int r5 = r5 + r0
            r4.limit(r5)     // Catch: java.lang.Throwable -> Lc9
            java.nio.ByteBuffer r4 = r6.buffer     // Catch: java.lang.Throwable -> Lc9
            r7.put(r4)     // Catch: java.lang.Throwable -> Lc9
            java.nio.ByteBuffer r7 = r6.buffer     // Catch: java.lang.Throwable -> Lc9
            r7.limit(r1)     // Catch: java.lang.Throwable -> Lc9
            boolean r7 = r6.canRewind     // Catch: java.lang.Throwable -> Lc9
            if (r7 != 0) goto L74
            java.nio.ByteBuffer r7 = r6.buffer     // Catch: java.lang.Throwable -> Lc9
            boolean r7 = r7.hasRemaining()     // Catch: java.lang.Throwable -> Lc9
            if (r7 != 0) goto L74
            r6.buffer = r3     // Catch: java.lang.Throwable -> Lc9
            r6.directRead = r2     // Catch: java.lang.Throwable -> Lc9
        L74:
            monitor-exit(r6)
            return r0
        L76:
            java.nio.ByteBuffer r1 = r6.buffer     // Catch: java.lang.Throwable -> Lc9
            int r1 = r1.remaining()     // Catch: java.lang.Throwable -> Lc9
            int r0 = r0 - r1
            java.nio.ByteBuffer r4 = r6.buffer     // Catch: java.lang.Throwable -> Lc9
            int r4 = r4.position()     // Catch: java.lang.Throwable -> Lc9
            java.nio.ByteBuffer r5 = r6.buffer     // Catch: java.lang.Throwable -> Lc9
            int r5 = r5.limit()     // Catch: java.lang.Throwable -> Lc9
            int r0 = r0 + r5
            r6.setBufferLimit(r0)     // Catch: java.lang.Throwable -> Lc9
            java.nio.ByteBuffer r0 = r6.buffer     // Catch: java.lang.Throwable -> Lc9
            r0.position(r5)     // Catch: java.lang.Throwable -> Lc9
            java.nio.channels.ReadableByteChannel r0 = r6.baseChannel     // Catch: java.lang.Throwable -> Lc9
            java.nio.ByteBuffer r5 = r6.buffer     // Catch: java.lang.Throwable -> Lc9
            int r0 = r0.read(r5)     // Catch: java.lang.Throwable -> Lc9
            java.nio.ByteBuffer r5 = r6.buffer     // Catch: java.lang.Throwable -> Lc9
            r5.flip()     // Catch: java.lang.Throwable -> Lc9
            java.nio.ByteBuffer r5 = r6.buffer     // Catch: java.lang.Throwable -> Lc9
            r5.position(r4)     // Catch: java.lang.Throwable -> Lc9
            java.nio.ByteBuffer r5 = r6.buffer     // Catch: java.lang.Throwable -> Lc9
            r7.put(r5)     // Catch: java.lang.Throwable -> Lc9
            if (r1 != 0) goto Lb0
            if (r0 >= 0) goto Lb0
            monitor-exit(r6)
            r7 = -1
            return r7
        Lb0:
            java.nio.ByteBuffer r7 = r6.buffer     // Catch: java.lang.Throwable -> Lc9
            int r7 = r7.position()     // Catch: java.lang.Throwable -> Lc9
            int r7 = r7 - r4
            boolean r0 = r6.canRewind     // Catch: java.lang.Throwable -> Lc9
            if (r0 != 0) goto Lc7
            java.nio.ByteBuffer r0 = r6.buffer     // Catch: java.lang.Throwable -> Lc9
            boolean r0 = r0.hasRemaining()     // Catch: java.lang.Throwable -> Lc9
            if (r0 != 0) goto Lc7
            r6.buffer = r3     // Catch: java.lang.Throwable -> Lc9
            r6.directRead = r2     // Catch: java.lang.Throwable -> Lc9
        Lc7:
            monitor-exit(r6)
            return r7
        Lc9:
            r7 = move-exception
            monitor-exit(r6)     // Catch: java.lang.Throwable -> Lc9
            throw r7
    }

    public synchronized void rewind() throws java.io.IOException {
            r2 = this;
            monitor-enter(r2)
            boolean r0 = r2.canRewind     // Catch: java.lang.Throwable -> L17
            if (r0 == 0) goto Lf
            java.nio.ByteBuffer r0 = r2.buffer     // Catch: java.lang.Throwable -> L17
            if (r0 == 0) goto Ld
            r1 = 0
            r0.position(r1)     // Catch: java.lang.Throwable -> L17
        Ld:
            monitor-exit(r2)
            return
        Lf:
            java.io.IOException r0 = new java.io.IOException     // Catch: java.lang.Throwable -> L17
            java.lang.String r1 = "Cannot rewind anymore."
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L17
            throw r0     // Catch: java.lang.Throwable -> L17
        L17:
            r0 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L17
            throw r0
    }
}
