package com.google.crypto.tink.subtle;

/* JADX INFO: loaded from: classes2.dex */
class StreamingAeadEncryptingChannel implements java.nio.channels.WritableByteChannel {
    private java.nio.channels.WritableByteChannel ciphertextChannel;
    java.nio.ByteBuffer ctBuffer;
    private com.google.crypto.tink.subtle.StreamSegmentEncrypter encrypter;
    boolean open;
    private int plaintextSegmentSize;
    java.nio.ByteBuffer ptBuffer;

    public StreamingAeadEncryptingChannel(com.google.crypto.tink.subtle.NonceBasedStreamingAead r3, java.nio.channels.WritableByteChannel r4, byte[] r5) throws java.security.GeneralSecurityException, java.io.IOException {
            r2 = this;
            r2.<init>()
            r0 = 1
            r2.open = r0
            r2.ciphertextChannel = r4
            com.google.crypto.tink.subtle.StreamSegmentEncrypter r5 = r3.newStreamSegmentEncrypter(r5)
            r2.encrypter = r5
            int r5 = r3.getPlaintextSegmentSize()
            r2.plaintextSegmentSize = r5
            java.nio.ByteBuffer r5 = java.nio.ByteBuffer.allocate(r5)
            r2.ptBuffer = r5
            int r0 = r2.plaintextSegmentSize
            int r1 = r3.getCiphertextOffset()
            int r0 = r0 - r1
            r5.limit(r0)
            int r3 = r3.getCiphertextSegmentSize()
            java.nio.ByteBuffer r3 = java.nio.ByteBuffer.allocate(r3)
            r2.ctBuffer = r3
            com.google.crypto.tink.subtle.StreamSegmentEncrypter r5 = r2.encrypter
            java.nio.ByteBuffer r5 = r5.getHeader()
            r3.put(r5)
            java.nio.ByteBuffer r3 = r2.ctBuffer
            r3.flip()
            java.nio.ByteBuffer r3 = r2.ctBuffer
            r4.write(r3)
            return
    }

    @Override // java.nio.channels.Channel, java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() throws java.io.IOException {
            r4 = this;
            monitor-enter(r4)
            boolean r0 = r4.open     // Catch: java.lang.Throwable -> L67
            if (r0 != 0) goto L7
            monitor-exit(r4)
            return
        L7:
            java.nio.ByteBuffer r0 = r4.ctBuffer     // Catch: java.lang.Throwable -> L67
            int r0 = r0.remaining()     // Catch: java.lang.Throwable -> L67
            if (r0 <= 0) goto L22
            java.nio.channels.WritableByteChannel r0 = r4.ciphertextChannel     // Catch: java.lang.Throwable -> L67
            java.nio.ByteBuffer r1 = r4.ctBuffer     // Catch: java.lang.Throwable -> L67
            int r0 = r0.write(r1)     // Catch: java.lang.Throwable -> L67
            if (r0 <= 0) goto L1a
            goto L7
        L1a:
            java.io.IOException r0 = new java.io.IOException     // Catch: java.lang.Throwable -> L67
            java.lang.String r1 = "Failed to write ciphertext before closing"
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L67
            throw r0     // Catch: java.lang.Throwable -> L67
        L22:
            java.nio.ByteBuffer r0 = r4.ctBuffer     // Catch: java.security.GeneralSecurityException -> L60 java.lang.Throwable -> L67
            r0.clear()     // Catch: java.security.GeneralSecurityException -> L60 java.lang.Throwable -> L67
            java.nio.ByteBuffer r0 = r4.ptBuffer     // Catch: java.security.GeneralSecurityException -> L60 java.lang.Throwable -> L67
            r0.flip()     // Catch: java.security.GeneralSecurityException -> L60 java.lang.Throwable -> L67
            com.google.crypto.tink.subtle.StreamSegmentEncrypter r0 = r4.encrypter     // Catch: java.security.GeneralSecurityException -> L60 java.lang.Throwable -> L67
            java.nio.ByteBuffer r1 = r4.ptBuffer     // Catch: java.security.GeneralSecurityException -> L60 java.lang.Throwable -> L67
            java.nio.ByteBuffer r2 = r4.ctBuffer     // Catch: java.security.GeneralSecurityException -> L60 java.lang.Throwable -> L67
            r3 = 1
            r0.encryptSegment(r1, r3, r2)     // Catch: java.security.GeneralSecurityException -> L60 java.lang.Throwable -> L67
            java.nio.ByteBuffer r0 = r4.ctBuffer     // Catch: java.lang.Throwable -> L67
            r0.flip()     // Catch: java.lang.Throwable -> L67
        L3b:
            java.nio.ByteBuffer r0 = r4.ctBuffer     // Catch: java.lang.Throwable -> L67
            int r0 = r0.remaining()     // Catch: java.lang.Throwable -> L67
            if (r0 <= 0) goto L56
            java.nio.channels.WritableByteChannel r0 = r4.ciphertextChannel     // Catch: java.lang.Throwable -> L67
            java.nio.ByteBuffer r1 = r4.ctBuffer     // Catch: java.lang.Throwable -> L67
            int r0 = r0.write(r1)     // Catch: java.lang.Throwable -> L67
            if (r0 <= 0) goto L4e
            goto L3b
        L4e:
            java.io.IOException r0 = new java.io.IOException     // Catch: java.lang.Throwable -> L67
            java.lang.String r1 = "Failed to write ciphertext before closing"
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L67
            throw r0     // Catch: java.lang.Throwable -> L67
        L56:
            java.nio.channels.WritableByteChannel r0 = r4.ciphertextChannel     // Catch: java.lang.Throwable -> L67
            r0.close()     // Catch: java.lang.Throwable -> L67
            r0 = 0
            r4.open = r0     // Catch: java.lang.Throwable -> L67
            monitor-exit(r4)
            return
        L60:
            r0 = move-exception
            java.io.IOException r1 = new java.io.IOException     // Catch: java.lang.Throwable -> L67
            r1.<init>(r0)     // Catch: java.lang.Throwable -> L67
            throw r1     // Catch: java.lang.Throwable -> L67
        L67:
            r0 = move-exception
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L67
            throw r0
    }

    @Override // java.nio.channels.Channel
    public boolean isOpen() {
            r1 = this;
            boolean r0 = r1.open
            return r0
    }

    @Override // java.nio.channels.WritableByteChannel
    public synchronized int write(java.nio.ByteBuffer r7) throws java.io.IOException {
            r6 = this;
            monitor-enter(r6)
            boolean r0 = r6.open     // Catch: java.lang.Throwable -> L9e
            if (r0 == 0) goto L98
            java.nio.ByteBuffer r0 = r6.ctBuffer     // Catch: java.lang.Throwable -> L9e
            int r0 = r0.remaining()     // Catch: java.lang.Throwable -> L9e
            if (r0 <= 0) goto L14
            java.nio.channels.WritableByteChannel r0 = r6.ciphertextChannel     // Catch: java.lang.Throwable -> L9e
            java.nio.ByteBuffer r1 = r6.ctBuffer     // Catch: java.lang.Throwable -> L9e
            r0.write(r1)     // Catch: java.lang.Throwable -> L9e
        L14:
            int r0 = r7.position()     // Catch: java.lang.Throwable -> L9e
        L18:
            int r1 = r7.remaining()     // Catch: java.lang.Throwable -> L9e
            java.nio.ByteBuffer r2 = r6.ptBuffer     // Catch: java.lang.Throwable -> L9e
            int r2 = r2.remaining()     // Catch: java.lang.Throwable -> L9e
            if (r1 <= r2) goto L8c
            java.nio.ByteBuffer r1 = r6.ctBuffer     // Catch: java.lang.Throwable -> L9e
            int r1 = r1.remaining()     // Catch: java.lang.Throwable -> L9e
            if (r1 <= 0) goto L33
            int r7 = r7.position()     // Catch: java.lang.Throwable -> L9e
            int r7 = r7 - r0
            monitor-exit(r6)
            return r7
        L33:
            java.nio.ByteBuffer r1 = r6.ptBuffer     // Catch: java.lang.Throwable -> L9e
            int r1 = r1.remaining()     // Catch: java.lang.Throwable -> L9e
            java.nio.ByteBuffer r2 = r7.slice()     // Catch: java.lang.Throwable -> L9e
            r2.limit(r1)     // Catch: java.lang.Throwable -> L9e
            int r3 = r7.position()     // Catch: java.lang.Throwable -> L9e
            int r3 = r3 + r1
            r7.position(r3)     // Catch: java.lang.Throwable -> L9e
            java.nio.ByteBuffer r1 = r6.ptBuffer     // Catch: java.security.GeneralSecurityException -> L85 java.lang.Throwable -> L9e
            r1.flip()     // Catch: java.security.GeneralSecurityException -> L85 java.lang.Throwable -> L9e
            java.nio.ByteBuffer r1 = r6.ctBuffer     // Catch: java.security.GeneralSecurityException -> L85 java.lang.Throwable -> L9e
            r1.clear()     // Catch: java.security.GeneralSecurityException -> L85 java.lang.Throwable -> L9e
            int r1 = r2.remaining()     // Catch: java.security.GeneralSecurityException -> L85 java.lang.Throwable -> L9e
            r3 = 0
            if (r1 == 0) goto L63
            com.google.crypto.tink.subtle.StreamSegmentEncrypter r1 = r6.encrypter     // Catch: java.security.GeneralSecurityException -> L85 java.lang.Throwable -> L9e
            java.nio.ByteBuffer r4 = r6.ptBuffer     // Catch: java.security.GeneralSecurityException -> L85 java.lang.Throwable -> L9e
            java.nio.ByteBuffer r5 = r6.ctBuffer     // Catch: java.security.GeneralSecurityException -> L85 java.lang.Throwable -> L9e
            r1.encryptSegment(r4, r2, r3, r5)     // Catch: java.security.GeneralSecurityException -> L85 java.lang.Throwable -> L9e
            goto L6c
        L63:
            com.google.crypto.tink.subtle.StreamSegmentEncrypter r1 = r6.encrypter     // Catch: java.security.GeneralSecurityException -> L85 java.lang.Throwable -> L9e
            java.nio.ByteBuffer r2 = r6.ptBuffer     // Catch: java.security.GeneralSecurityException -> L85 java.lang.Throwable -> L9e
            java.nio.ByteBuffer r4 = r6.ctBuffer     // Catch: java.security.GeneralSecurityException -> L85 java.lang.Throwable -> L9e
            r1.encryptSegment(r2, r3, r4)     // Catch: java.security.GeneralSecurityException -> L85 java.lang.Throwable -> L9e
        L6c:
            java.nio.ByteBuffer r1 = r6.ctBuffer     // Catch: java.lang.Throwable -> L9e
            r1.flip()     // Catch: java.lang.Throwable -> L9e
            java.nio.channels.WritableByteChannel r1 = r6.ciphertextChannel     // Catch: java.lang.Throwable -> L9e
            java.nio.ByteBuffer r2 = r6.ctBuffer     // Catch: java.lang.Throwable -> L9e
            r1.write(r2)     // Catch: java.lang.Throwable -> L9e
            java.nio.ByteBuffer r1 = r6.ptBuffer     // Catch: java.lang.Throwable -> L9e
            r1.clear()     // Catch: java.lang.Throwable -> L9e
            java.nio.ByteBuffer r1 = r6.ptBuffer     // Catch: java.lang.Throwable -> L9e
            int r2 = r6.plaintextSegmentSize     // Catch: java.lang.Throwable -> L9e
            r1.limit(r2)     // Catch: java.lang.Throwable -> L9e
            goto L18
        L85:
            r7 = move-exception
            java.io.IOException r0 = new java.io.IOException     // Catch: java.lang.Throwable -> L9e
            r0.<init>(r7)     // Catch: java.lang.Throwable -> L9e
            throw r0     // Catch: java.lang.Throwable -> L9e
        L8c:
            java.nio.ByteBuffer r1 = r6.ptBuffer     // Catch: java.lang.Throwable -> L9e
            r1.put(r7)     // Catch: java.lang.Throwable -> L9e
            int r7 = r7.position()     // Catch: java.lang.Throwable -> L9e
            int r7 = r7 - r0
            monitor-exit(r6)
            return r7
        L98:
            java.nio.channels.ClosedChannelException r7 = new java.nio.channels.ClosedChannelException     // Catch: java.lang.Throwable -> L9e
            r7.<init>()     // Catch: java.lang.Throwable -> L9e
            throw r7     // Catch: java.lang.Throwable -> L9e
        L9e:
            r7 = move-exception
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L9e
            throw r7
    }
}
