package com.google.crypto.tink.streamingaead;

/* JADX INFO: loaded from: classes2.dex */
final class ReadableByteChannelDecrypter implements java.nio.channels.ReadableByteChannel {
    byte[] associatedData;
    java.nio.channels.ReadableByteChannel attemptingChannel;
    com.google.crypto.tink.subtle.RewindableReadableByteChannel ciphertextChannel;
    java.nio.channels.ReadableByteChannel matchingChannel;
    java.util.Deque<com.google.crypto.tink.StreamingAead> remainingPrimitives;

    public ReadableByteChannelDecrypter(com.google.crypto.tink.PrimitiveSet<com.google.crypto.tink.StreamingAead> r3, java.nio.channels.ReadableByteChannel r4, byte[] r5) {
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
            com.google.crypto.tink.subtle.RewindableReadableByteChannel r3 = new com.google.crypto.tink.subtle.RewindableReadableByteChannel
            r3.<init>(r4)
            r2.ciphertextChannel = r3
            java.lang.Object r3 = r5.clone()
            byte[] r3 = (byte[]) r3
            r2.associatedData = r3
            return
    }

    private synchronized java.nio.channels.ReadableByteChannel nextAttemptingChannel() throws java.io.IOException {
            r3 = this;
            monitor-enter(r3)
        L1:
            java.util.Deque<com.google.crypto.tink.StreamingAead> r0 = r3.remainingPrimitives     // Catch: java.lang.Throwable -> L29
            boolean r0 = r0.isEmpty()     // Catch: java.lang.Throwable -> L29
            if (r0 != 0) goto L21
            java.util.Deque<com.google.crypto.tink.StreamingAead> r0 = r3.remainingPrimitives     // Catch: java.lang.Throwable -> L29
            java.lang.Object r0 = r0.removeFirst()     // Catch: java.lang.Throwable -> L29
            com.google.crypto.tink.StreamingAead r0 = (com.google.crypto.tink.StreamingAead) r0     // Catch: java.lang.Throwable -> L29
            com.google.crypto.tink.subtle.RewindableReadableByteChannel r1 = r3.ciphertextChannel     // Catch: java.security.GeneralSecurityException -> L1b java.lang.Throwable -> L29
            byte[] r2 = r3.associatedData     // Catch: java.security.GeneralSecurityException -> L1b java.lang.Throwable -> L29
            java.nio.channels.ReadableByteChannel r0 = r0.newDecryptingChannel(r1, r2)     // Catch: java.security.GeneralSecurityException -> L1b java.lang.Throwable -> L29
            monitor-exit(r3)
            return r0
        L1b:
            com.google.crypto.tink.subtle.RewindableReadableByteChannel r0 = r3.ciphertextChannel     // Catch: java.lang.Throwable -> L29
            r0.rewind()     // Catch: java.lang.Throwable -> L29
            goto L1
        L21:
            java.io.IOException r0 = new java.io.IOException     // Catch: java.lang.Throwable -> L29
            java.lang.String r1 = "No matching key found for the ciphertext in the stream."
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L29
            throw r0     // Catch: java.lang.Throwable -> L29
        L29:
            r0 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L29
            throw r0
    }

    @Override // java.nio.channels.Channel, java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() throws java.io.IOException {
            r1 = this;
            monitor-enter(r1)
            com.google.crypto.tink.subtle.RewindableReadableByteChannel r0 = r1.ciphertextChannel     // Catch: java.lang.Throwable -> L8
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
            com.google.crypto.tink.subtle.RewindableReadableByteChannel r0 = r1.ciphertextChannel     // Catch: java.lang.Throwable -> L9
            boolean r0 = r0.isOpen()     // Catch: java.lang.Throwable -> L9
            monitor-exit(r1)
            return r0
        L9:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L9
            throw r0
    }

    @Override // java.nio.channels.ReadableByteChannel
    public synchronized int read(java.nio.ByteBuffer r4) throws java.io.IOException {
            r3 = this;
            monitor-enter(r3)
            int r0 = r4.remaining()     // Catch: java.lang.Throwable -> L42
            r1 = 0
            if (r0 != 0) goto La
            monitor-exit(r3)
            return r1
        La:
            java.nio.channels.ReadableByteChannel r0 = r3.matchingChannel     // Catch: java.lang.Throwable -> L42
            if (r0 == 0) goto L14
            int r4 = r0.read(r4)     // Catch: java.lang.Throwable -> L42
            monitor-exit(r3)
            return r4
        L14:
            java.nio.channels.ReadableByteChannel r0 = r3.attemptingChannel     // Catch: java.lang.Throwable -> L42
            if (r0 != 0) goto L1e
            java.nio.channels.ReadableByteChannel r0 = r3.nextAttemptingChannel()     // Catch: java.lang.Throwable -> L42
            r3.attemptingChannel = r0     // Catch: java.lang.Throwable -> L42
        L1e:
            java.nio.channels.ReadableByteChannel r0 = r3.attemptingChannel     // Catch: java.io.IOException -> L36 java.lang.Throwable -> L42
            int r0 = r0.read(r4)     // Catch: java.io.IOException -> L36 java.lang.Throwable -> L42
            if (r0 != 0) goto L28
            monitor-exit(r3)
            return r1
        L28:
            java.nio.channels.ReadableByteChannel r2 = r3.attemptingChannel     // Catch: java.io.IOException -> L36 java.lang.Throwable -> L42
            r3.matchingChannel = r2     // Catch: java.io.IOException -> L36 java.lang.Throwable -> L42
            r2 = 0
            r3.attemptingChannel = r2     // Catch: java.io.IOException -> L36 java.lang.Throwable -> L42
            com.google.crypto.tink.subtle.RewindableReadableByteChannel r2 = r3.ciphertextChannel     // Catch: java.io.IOException -> L36 java.lang.Throwable -> L42
            r2.disableRewinding()     // Catch: java.io.IOException -> L36 java.lang.Throwable -> L42
            monitor-exit(r3)
            return r0
        L36:
            com.google.crypto.tink.subtle.RewindableReadableByteChannel r0 = r3.ciphertextChannel     // Catch: java.lang.Throwable -> L42
            r0.rewind()     // Catch: java.lang.Throwable -> L42
            java.nio.channels.ReadableByteChannel r0 = r3.nextAttemptingChannel()     // Catch: java.lang.Throwable -> L42
            r3.attemptingChannel = r0     // Catch: java.lang.Throwable -> L42
            goto L1e
        L42:
            r4 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L42
            throw r4
    }
}
