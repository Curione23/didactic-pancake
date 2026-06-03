package com.google.crypto.tink.streamingaead;

/* JADX INFO: loaded from: classes2.dex */
final class SeekableByteChannelDecrypter implements java.nio.channels.SeekableByteChannel {
    byte[] associatedData;
    java.nio.channels.SeekableByteChannel attemptingChannel;
    long cachedPosition;
    java.nio.channels.SeekableByteChannel ciphertextChannel;
    java.nio.channels.SeekableByteChannel matchingChannel;
    java.util.Deque<com.google.crypto.tink.StreamingAead> remainingPrimitives;
    long startingPosition;

    public SeekableByteChannelDecrypter(com.google.crypto.tink.PrimitiveSet<com.google.crypto.tink.StreamingAead> r3, java.nio.channels.SeekableByteChannel r4, byte[] r5) throws java.io.IOException {
            r2 = this;
            r2.<init>()
            r0 = 0
            r2.attemptingChannel = r0
            r2.matchingChannel = r0
            java.util.ArrayDeque r0 = new java.util.ArrayDeque
            r0.<init>()
            r2.remainingPrimitives = r0
            java.util.List r3 = r3.getRawPrimitives()
            java.util.Iterator r3 = r3.iterator()
        L17:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L2f
            java.lang.Object r0 = r3.next()
            com.google.crypto.tink.PrimitiveSet$Entry r0 = (com.google.crypto.tink.PrimitiveSet.Entry) r0
            java.util.Deque<com.google.crypto.tink.StreamingAead> r1 = r2.remainingPrimitives
            java.lang.Object r0 = r0.getPrimitive()
            com.google.crypto.tink.StreamingAead r0 = (com.google.crypto.tink.StreamingAead) r0
            r1.add(r0)
            goto L17
        L2f:
            r2.ciphertextChannel = r4
            r0 = -1
            r2.cachedPosition = r0
            long r3 = r4.position()
            r2.startingPosition = r3
            java.lang.Object r3 = r5.clone()
            byte[] r3 = (byte[]) r3
            r2.associatedData = r3
            return
    }

    private synchronized java.nio.channels.SeekableByteChannel nextAttemptingChannel() throws java.io.IOException {
            r5 = this;
            monitor-enter(r5)
        L1:
            java.util.Deque<com.google.crypto.tink.StreamingAead> r0 = r5.remainingPrimitives     // Catch: java.lang.Throwable -> L35
            boolean r0 = r0.isEmpty()     // Catch: java.lang.Throwable -> L35
            if (r0 != 0) goto L2d
            java.nio.channels.SeekableByteChannel r0 = r5.ciphertextChannel     // Catch: java.lang.Throwable -> L35
            long r1 = r5.startingPosition     // Catch: java.lang.Throwable -> L35
            r0.position(r1)     // Catch: java.lang.Throwable -> L35
            java.util.Deque<com.google.crypto.tink.StreamingAead> r0 = r5.remainingPrimitives     // Catch: java.lang.Throwable -> L35
            java.lang.Object r0 = r0.removeFirst()     // Catch: java.lang.Throwable -> L35
            com.google.crypto.tink.StreamingAead r0 = (com.google.crypto.tink.StreamingAead) r0     // Catch: java.lang.Throwable -> L35
            java.nio.channels.SeekableByteChannel r1 = r5.ciphertextChannel     // Catch: java.security.GeneralSecurityException -> L1 java.lang.Throwable -> L35
            byte[] r2 = r5.associatedData     // Catch: java.security.GeneralSecurityException -> L1 java.lang.Throwable -> L35
            java.nio.channels.SeekableByteChannel r0 = r0.newSeekableDecryptingChannel(r1, r2)     // Catch: java.security.GeneralSecurityException -> L1 java.lang.Throwable -> L35
            long r1 = r5.cachedPosition     // Catch: java.security.GeneralSecurityException -> L1 java.lang.Throwable -> L35
            r3 = 0
            int r3 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r3 < 0) goto L2b
            r0.position(r1)     // Catch: java.security.GeneralSecurityException -> L1 java.lang.Throwable -> L35
        L2b:
            monitor-exit(r5)
            return r0
        L2d:
            java.io.IOException r0 = new java.io.IOException     // Catch: java.lang.Throwable -> L35
            java.lang.String r1 = "No matching key found for the ciphertext in the stream."
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L35
            throw r0     // Catch: java.lang.Throwable -> L35
        L35:
            r0 = move-exception
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L35
            throw r0
    }

    @Override // java.nio.channels.Channel, java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() throws java.io.IOException {
            r1 = this;
            monitor-enter(r1)
            java.nio.channels.SeekableByteChannel r0 = r1.ciphertextChannel     // Catch: java.lang.Throwable -> L8
            r0.close()     // Catch: java.lang.Throwable -> L8
            monitor-exit(r1)
            return
        L8:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L8
            throw r0
    }

    @Override // java.nio.channels.Channel
    public synchronized boolean isOpen() {
            r1 = this;
            monitor-enter(r1)
            java.nio.channels.SeekableByteChannel r0 = r1.ciphertextChannel     // Catch: java.lang.Throwable -> L9
            boolean r0 = r0.isOpen()     // Catch: java.lang.Throwable -> L9
            monitor-exit(r1)
            return r0
        L9:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L9
            throw r0
    }

    @Override // java.nio.channels.SeekableByteChannel
    public synchronized long position() throws java.io.IOException {
            r2 = this;
            monitor-enter(r2)
            java.nio.channels.SeekableByteChannel r0 = r2.matchingChannel     // Catch: java.lang.Throwable -> Lf
            if (r0 == 0) goto Lb
            long r0 = r0.position()     // Catch: java.lang.Throwable -> Lf
            monitor-exit(r2)
            return r0
        Lb:
            long r0 = r2.cachedPosition     // Catch: java.lang.Throwable -> Lf
            monitor-exit(r2)
            return r0
        Lf:
            r0 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> Lf
            throw r0
    }

    @Override // java.nio.channels.SeekableByteChannel
    public synchronized java.nio.channels.SeekableByteChannel position(long r3) throws java.io.IOException {
            r2 = this;
            monitor-enter(r2)
            java.nio.channels.SeekableByteChannel r0 = r2.matchingChannel     // Catch: java.lang.Throwable -> L22
            if (r0 == 0) goto L9
            r0.position(r3)     // Catch: java.lang.Throwable -> L22
            goto L18
        L9:
            r0 = 0
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r0 < 0) goto L1a
            r2.cachedPosition = r3     // Catch: java.lang.Throwable -> L22
            java.nio.channels.SeekableByteChannel r0 = r2.attemptingChannel     // Catch: java.lang.Throwable -> L22
            if (r0 == 0) goto L18
            r0.position(r3)     // Catch: java.lang.Throwable -> L22
        L18:
            monitor-exit(r2)
            return r2
        L1a:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException     // Catch: java.lang.Throwable -> L22
            java.lang.String r4 = "Position must be non-negative"
            r3.<init>(r4)     // Catch: java.lang.Throwable -> L22
            throw r3     // Catch: java.lang.Throwable -> L22
        L22:
            r3 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L22
            throw r3
    }

    @Override // java.nio.channels.SeekableByteChannel, java.nio.channels.ReadableByteChannel
    public synchronized int read(java.nio.ByteBuffer r4) throws java.io.IOException {
            r3 = this;
            monitor-enter(r3)
            int r0 = r4.remaining()     // Catch: java.lang.Throwable -> L38
            r1 = 0
            if (r0 != 0) goto La
            monitor-exit(r3)
            return r1
        La:
            java.nio.channels.SeekableByteChannel r0 = r3.matchingChannel     // Catch: java.lang.Throwable -> L38
            if (r0 == 0) goto L14
            int r4 = r0.read(r4)     // Catch: java.lang.Throwable -> L38
            monitor-exit(r3)
            return r4
        L14:
            java.nio.channels.SeekableByteChannel r0 = r3.attemptingChannel     // Catch: java.lang.Throwable -> L38
            if (r0 != 0) goto L1e
            java.nio.channels.SeekableByteChannel r0 = r3.nextAttemptingChannel()     // Catch: java.lang.Throwable -> L38
            r3.attemptingChannel = r0     // Catch: java.lang.Throwable -> L38
        L1e:
            java.nio.channels.SeekableByteChannel r0 = r3.attemptingChannel     // Catch: java.io.IOException -> L31 java.lang.Throwable -> L38
            int r0 = r0.read(r4)     // Catch: java.io.IOException -> L31 java.lang.Throwable -> L38
            if (r0 != 0) goto L28
            monitor-exit(r3)
            return r1
        L28:
            java.nio.channels.SeekableByteChannel r2 = r3.attemptingChannel     // Catch: java.io.IOException -> L31 java.lang.Throwable -> L38
            r3.matchingChannel = r2     // Catch: java.io.IOException -> L31 java.lang.Throwable -> L38
            r2 = 0
            r3.attemptingChannel = r2     // Catch: java.io.IOException -> L31 java.lang.Throwable -> L38
            monitor-exit(r3)
            return r0
        L31:
            java.nio.channels.SeekableByteChannel r0 = r3.nextAttemptingChannel()     // Catch: java.lang.Throwable -> L38
            r3.attemptingChannel = r0     // Catch: java.lang.Throwable -> L38
            goto L1e
        L38:
            r4 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L38
            throw r4
    }

    @Override // java.nio.channels.SeekableByteChannel
    public synchronized long size() throws java.io.IOException {
            r2 = this;
            monitor-enter(r2)
            java.nio.channels.SeekableByteChannel r0 = r2.matchingChannel     // Catch: java.lang.Throwable -> L13
            if (r0 == 0) goto Lb
            long r0 = r0.size()     // Catch: java.lang.Throwable -> L13
            monitor-exit(r2)
            return r0
        Lb:
            java.io.IOException r0 = new java.io.IOException     // Catch: java.lang.Throwable -> L13
            java.lang.String r1 = "Cannot determine size before first read()-call."
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L13
            throw r0     // Catch: java.lang.Throwable -> L13
        L13:
            r0 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L13
            throw r0
    }

    @Override // java.nio.channels.SeekableByteChannel
    public java.nio.channels.SeekableByteChannel truncate(long r1) throws java.io.IOException {
            r0 = this;
            java.nio.channels.NonWritableChannelException r1 = new java.nio.channels.NonWritableChannelException
            r1.<init>()
            throw r1
    }

    @Override // java.nio.channels.SeekableByteChannel, java.nio.channels.WritableByteChannel
    public int write(java.nio.ByteBuffer r1) throws java.io.IOException {
            r0 = this;
            java.nio.channels.NonWritableChannelException r1 = new java.nio.channels.NonWritableChannelException
            r1.<init>()
            throw r1
    }
}
