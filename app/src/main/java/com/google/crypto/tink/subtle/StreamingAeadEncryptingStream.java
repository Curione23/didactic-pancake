package com.google.crypto.tink.subtle;

/* JADX INFO: loaded from: classes2.dex */
class StreamingAeadEncryptingStream extends java.io.FilterOutputStream {
    java.nio.ByteBuffer ctBuffer;
    private com.google.crypto.tink.subtle.StreamSegmentEncrypter encrypter;
    boolean open;
    private int plaintextSegmentSize;
    java.nio.ByteBuffer ptBuffer;

    public StreamingAeadEncryptingStream(com.google.crypto.tink.subtle.NonceBasedStreamingAead r1, java.io.OutputStream r2, byte[] r3) throws java.security.GeneralSecurityException, java.io.IOException {
            r0 = this;
            r0.<init>(r2)
            com.google.crypto.tink.subtle.StreamSegmentEncrypter r2 = r1.newStreamSegmentEncrypter(r3)
            r0.encrypter = r2
            int r2 = r1.getPlaintextSegmentSize()
            r0.plaintextSegmentSize = r2
            java.nio.ByteBuffer r2 = java.nio.ByteBuffer.allocate(r2)
            r0.ptBuffer = r2
            int r2 = r1.getCiphertextSegmentSize()
            java.nio.ByteBuffer r2 = java.nio.ByteBuffer.allocate(r2)
            r0.ctBuffer = r2
            java.nio.ByteBuffer r2 = r0.ptBuffer
            int r3 = r0.plaintextSegmentSize
            int r1 = r1.getCiphertextOffset()
            int r3 = r3 - r1
            r2.limit(r3)
            com.google.crypto.tink.subtle.StreamSegmentEncrypter r1 = r0.encrypter
            java.nio.ByteBuffer r1 = r1.getHeader()
            int r2 = r1.remaining()
            byte[] r2 = new byte[r2]
            r1.get(r2)
            java.io.OutputStream r1 = r0.out
            r1.write(r2)
            r1 = 1
            r0.open = r1
            return
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() throws java.io.IOException {
            r5 = this;
            java.lang.String r0 = "ptBuffer.remaining():"
            monitor-enter(r5)
            boolean r1 = r5.open     // Catch: java.lang.Throwable -> L6b
            if (r1 != 0) goto L9
            monitor-exit(r5)
            return
        L9:
            java.nio.ByteBuffer r1 = r5.ptBuffer     // Catch: java.security.GeneralSecurityException -> L41 java.lang.Throwable -> L6b
            r1.flip()     // Catch: java.security.GeneralSecurityException -> L41 java.lang.Throwable -> L6b
            java.nio.ByteBuffer r1 = r5.ctBuffer     // Catch: java.security.GeneralSecurityException -> L41 java.lang.Throwable -> L6b
            r1.clear()     // Catch: java.security.GeneralSecurityException -> L41 java.lang.Throwable -> L6b
            com.google.crypto.tink.subtle.StreamSegmentEncrypter r1 = r5.encrypter     // Catch: java.security.GeneralSecurityException -> L41 java.lang.Throwable -> L6b
            java.nio.ByteBuffer r2 = r5.ptBuffer     // Catch: java.security.GeneralSecurityException -> L41 java.lang.Throwable -> L6b
            java.nio.ByteBuffer r3 = r5.ctBuffer     // Catch: java.security.GeneralSecurityException -> L41 java.lang.Throwable -> L6b
            r4 = 1
            r1.encryptSegment(r2, r4, r3)     // Catch: java.security.GeneralSecurityException -> L41 java.lang.Throwable -> L6b
            java.nio.ByteBuffer r0 = r5.ctBuffer     // Catch: java.lang.Throwable -> L6b
            r0.flip()     // Catch: java.lang.Throwable -> L6b
            java.io.OutputStream r0 = r5.out     // Catch: java.lang.Throwable -> L6b
            java.nio.ByteBuffer r1 = r5.ctBuffer     // Catch: java.lang.Throwable -> L6b
            byte[] r1 = r1.array()     // Catch: java.lang.Throwable -> L6b
            java.nio.ByteBuffer r2 = r5.ctBuffer     // Catch: java.lang.Throwable -> L6b
            int r2 = r2.position()     // Catch: java.lang.Throwable -> L6b
            java.nio.ByteBuffer r3 = r5.ctBuffer     // Catch: java.lang.Throwable -> L6b
            int r3 = r3.remaining()     // Catch: java.lang.Throwable -> L6b
            r0.write(r1, r2, r3)     // Catch: java.lang.Throwable -> L6b
            r0 = 0
            r5.open = r0     // Catch: java.lang.Throwable -> L6b
            super.close()     // Catch: java.lang.Throwable -> L6b
            monitor-exit(r5)
            return
        L41:
            r1 = move-exception
            java.io.IOException r2 = new java.io.IOException     // Catch: java.lang.Throwable -> L6b
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L6b
            r3.<init>(r0)     // Catch: java.lang.Throwable -> L6b
            java.nio.ByteBuffer r0 = r5.ptBuffer     // Catch: java.lang.Throwable -> L6b
            int r0 = r0.remaining()     // Catch: java.lang.Throwable -> L6b
            java.lang.StringBuilder r0 = r3.append(r0)     // Catch: java.lang.Throwable -> L6b
            java.lang.String r3 = " ctBuffer.remaining():"
            java.lang.StringBuilder r0 = r0.append(r3)     // Catch: java.lang.Throwable -> L6b
            java.nio.ByteBuffer r3 = r5.ctBuffer     // Catch: java.lang.Throwable -> L6b
            int r3 = r3.remaining()     // Catch: java.lang.Throwable -> L6b
            java.lang.StringBuilder r0 = r0.append(r3)     // Catch: java.lang.Throwable -> L6b
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L6b
            r2.<init>(r0, r1)     // Catch: java.lang.Throwable -> L6b
            throw r2     // Catch: java.lang.Throwable -> L6b
        L6b:
            r0 = move-exception
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L6b
            throw r0
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(int r3) throws java.io.IOException {
            r2 = this;
            byte r3 = (byte) r3
            r0 = 1
            byte[] r0 = new byte[r0]
            r1 = 0
            r0[r1] = r3
            r2.write(r0)
            return
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(byte[] r3) throws java.io.IOException {
            r2 = this;
            r0 = 0
            int r1 = r3.length
            r2.write(r3, r0, r1)
            return
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public synchronized void write(byte[] r6, int r7, int r8) throws java.io.IOException {
            r5 = this;
            monitor-enter(r5)
            boolean r0 = r5.open     // Catch: java.lang.Throwable -> L6c
            if (r0 == 0) goto L64
        L5:
            java.nio.ByteBuffer r0 = r5.ptBuffer     // Catch: java.lang.Throwable -> L6c
            int r0 = r0.remaining()     // Catch: java.lang.Throwable -> L6c
            if (r8 <= r0) goto L5d
            java.nio.ByteBuffer r0 = r5.ptBuffer     // Catch: java.lang.Throwable -> L6c
            int r0 = r0.remaining()     // Catch: java.lang.Throwable -> L6c
            java.nio.ByteBuffer r1 = java.nio.ByteBuffer.wrap(r6, r7, r0)     // Catch: java.lang.Throwable -> L6c
            int r7 = r7 + r0
            int r8 = r8 - r0
            java.nio.ByteBuffer r0 = r5.ptBuffer     // Catch: java.security.GeneralSecurityException -> L56 java.lang.Throwable -> L6c
            r0.flip()     // Catch: java.security.GeneralSecurityException -> L56 java.lang.Throwable -> L6c
            java.nio.ByteBuffer r0 = r5.ctBuffer     // Catch: java.security.GeneralSecurityException -> L56 java.lang.Throwable -> L6c
            r0.clear()     // Catch: java.security.GeneralSecurityException -> L56 java.lang.Throwable -> L6c
            com.google.crypto.tink.subtle.StreamSegmentEncrypter r0 = r5.encrypter     // Catch: java.security.GeneralSecurityException -> L56 java.lang.Throwable -> L6c
            java.nio.ByteBuffer r2 = r5.ptBuffer     // Catch: java.security.GeneralSecurityException -> L56 java.lang.Throwable -> L6c
            java.nio.ByteBuffer r3 = r5.ctBuffer     // Catch: java.security.GeneralSecurityException -> L56 java.lang.Throwable -> L6c
            r4 = 0
            r0.encryptSegment(r2, r1, r4, r3)     // Catch: java.security.GeneralSecurityException -> L56 java.lang.Throwable -> L6c
            java.nio.ByteBuffer r0 = r5.ctBuffer     // Catch: java.lang.Throwable -> L6c
            r0.flip()     // Catch: java.lang.Throwable -> L6c
            java.io.OutputStream r0 = r5.out     // Catch: java.lang.Throwable -> L6c
            java.nio.ByteBuffer r1 = r5.ctBuffer     // Catch: java.lang.Throwable -> L6c
            byte[] r1 = r1.array()     // Catch: java.lang.Throwable -> L6c
            java.nio.ByteBuffer r2 = r5.ctBuffer     // Catch: java.lang.Throwable -> L6c
            int r2 = r2.position()     // Catch: java.lang.Throwable -> L6c
            java.nio.ByteBuffer r3 = r5.ctBuffer     // Catch: java.lang.Throwable -> L6c
            int r3 = r3.remaining()     // Catch: java.lang.Throwable -> L6c
            r0.write(r1, r2, r3)     // Catch: java.lang.Throwable -> L6c
            java.nio.ByteBuffer r0 = r5.ptBuffer     // Catch: java.lang.Throwable -> L6c
            r0.clear()     // Catch: java.lang.Throwable -> L6c
            java.nio.ByteBuffer r0 = r5.ptBuffer     // Catch: java.lang.Throwable -> L6c
            int r1 = r5.plaintextSegmentSize     // Catch: java.lang.Throwable -> L6c
            r0.limit(r1)     // Catch: java.lang.Throwable -> L6c
            goto L5
        L56:
            r6 = move-exception
            java.io.IOException r7 = new java.io.IOException     // Catch: java.lang.Throwable -> L6c
            r7.<init>(r6)     // Catch: java.lang.Throwable -> L6c
            throw r7     // Catch: java.lang.Throwable -> L6c
        L5d:
            java.nio.ByteBuffer r0 = r5.ptBuffer     // Catch: java.lang.Throwable -> L6c
            r0.put(r6, r7, r8)     // Catch: java.lang.Throwable -> L6c
            monitor-exit(r5)
            return
        L64:
            java.io.IOException r6 = new java.io.IOException     // Catch: java.lang.Throwable -> L6c
            java.lang.String r7 = "Trying to write to closed stream"
            r6.<init>(r7)     // Catch: java.lang.Throwable -> L6c
            throw r6     // Catch: java.lang.Throwable -> L6c
        L6c:
            r6 = move-exception
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L6c
            throw r6
    }
}
