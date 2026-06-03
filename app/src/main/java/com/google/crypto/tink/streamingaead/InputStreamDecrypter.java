package com.google.crypto.tink.streamingaead;

/* JADX INFO: loaded from: classes2.dex */
final class InputStreamDecrypter extends java.io.InputStream {
    byte[] associatedData;
    boolean attemptedMatching;
    java.io.InputStream ciphertextStream;
    java.io.InputStream matchingStream;
    com.google.crypto.tink.PrimitiveSet<com.google.crypto.tink.StreamingAead> primitives;

    public InputStreamDecrypter(com.google.crypto.tink.PrimitiveSet<com.google.crypto.tink.StreamingAead> r2, java.io.InputStream r3, byte[] r4) {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.attemptedMatching = r0
            r0 = 0
            r1.matchingStream = r0
            r1.primitives = r2
            boolean r2 = r3.markSupported()
            if (r2 == 0) goto L14
            r1.ciphertextStream = r3
            goto L1b
        L14:
            java.io.BufferedInputStream r2 = new java.io.BufferedInputStream
            r2.<init>(r3)
            r1.ciphertextStream = r2
        L1b:
            java.io.InputStream r2 = r1.ciphertextStream
            r3 = 2147483647(0x7fffffff, float:NaN)
            r2.mark(r3)
            java.lang.Object r2 = r4.clone()
            byte[] r2 = (byte[]) r2
            r1.associatedData = r2
            return
    }

    private void disableRewinding() throws java.io.IOException {
            r2 = this;
            java.io.InputStream r0 = r2.ciphertextStream
            r1 = 0
            r0.mark(r1)
            return
    }

    private void rewind() throws java.io.IOException {
            r1 = this;
            java.io.InputStream r0 = r1.ciphertextStream
            r0.reset()
            return
    }

    @Override // java.io.InputStream
    public synchronized int available() throws java.io.IOException {
            r1 = this;
            monitor-enter(r1)
            java.io.InputStream r0 = r1.matchingStream     // Catch: java.lang.Throwable -> Le
            if (r0 != 0) goto L8
            monitor-exit(r1)
            r0 = 0
            return r0
        L8:
            int r0 = r0.available()     // Catch: java.lang.Throwable -> Le
            monitor-exit(r1)
            return r0
        Le:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> Le
            throw r0
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() throws java.io.IOException {
            r1 = this;
            monitor-enter(r1)
            java.io.InputStream r0 = r1.ciphertextStream     // Catch: java.lang.Throwable -> L8
            r0.close()     // Catch: java.lang.Throwable -> L8
            monitor-exit(r1)
            return
        L8:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L8
            throw r0
    }

    @Override // java.io.InputStream
    public boolean markSupported() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // java.io.InputStream
    public synchronized int read() throws java.io.IOException {
            r3 = this;
            monitor-enter(r3)
            r0 = 1
            byte[] r1 = new byte[r0]     // Catch: java.lang.Throwable -> L12
            int r2 = r3.read(r1)     // Catch: java.lang.Throwable -> L12
            if (r2 != r0) goto Lf
            r0 = 0
            r0 = r1[r0]     // Catch: java.lang.Throwable -> L12
            monitor-exit(r3)
            return r0
        Lf:
            monitor-exit(r3)
            r0 = -1
            return r0
        L12:
            r0 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L12
            throw r0
    }

    @Override // java.io.InputStream
    public synchronized int read(byte[] r3) throws java.io.IOException {
            r2 = this;
            monitor-enter(r2)
            int r0 = r3.length     // Catch: java.lang.Throwable -> L9
            r1 = 0
            int r3 = r2.read(r3, r1, r0)     // Catch: java.lang.Throwable -> L9
            monitor-exit(r2)
            return r3
        L9:
            r3 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L9
            throw r3
    }

    @Override // java.io.InputStream
    public synchronized int read(byte[] r5, int r6, int r7) throws java.io.IOException {
            r4 = this;
            monitor-enter(r4)
            if (r7 != 0) goto L6
            monitor-exit(r4)
            r5 = 0
            return r5
        L6:
            java.io.InputStream r0 = r4.matchingStream     // Catch: java.lang.Throwable -> L68
            if (r0 == 0) goto L10
            int r5 = r0.read(r5, r6, r7)     // Catch: java.lang.Throwable -> L68
            monitor-exit(r4)
            return r5
        L10:
            boolean r0 = r4.attemptedMatching     // Catch: java.lang.Throwable -> L68
            if (r0 != 0) goto L60
            r0 = 1
            r4.attemptedMatching = r0     // Catch: java.lang.Throwable -> L68
            com.google.crypto.tink.PrimitiveSet<com.google.crypto.tink.StreamingAead> r0 = r4.primitives     // Catch: java.lang.Throwable -> L68
            java.util.List r0 = r0.getRawPrimitives()     // Catch: java.lang.Throwable -> L68
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L68
        L21:
            boolean r1 = r0.hasNext()     // Catch: java.lang.Throwable -> L68
            if (r1 == 0) goto L58
            java.lang.Object r1 = r0.next()     // Catch: java.lang.Throwable -> L68
            com.google.crypto.tink.PrimitiveSet$Entry r1 = (com.google.crypto.tink.PrimitiveSet.Entry) r1     // Catch: java.lang.Throwable -> L68
            java.lang.Object r1 = r1.getPrimitive()     // Catch: java.security.GeneralSecurityException -> L50 java.io.IOException -> L54 java.lang.Throwable -> L68
            com.google.crypto.tink.StreamingAead r1 = (com.google.crypto.tink.StreamingAead) r1     // Catch: java.security.GeneralSecurityException -> L50 java.io.IOException -> L54 java.lang.Throwable -> L68
            java.io.InputStream r2 = r4.ciphertextStream     // Catch: java.security.GeneralSecurityException -> L50 java.io.IOException -> L54 java.lang.Throwable -> L68
            byte[] r3 = r4.associatedData     // Catch: java.security.GeneralSecurityException -> L50 java.io.IOException -> L54 java.lang.Throwable -> L68
            java.io.InputStream r1 = r1.newDecryptingStream(r2, r3)     // Catch: java.security.GeneralSecurityException -> L50 java.io.IOException -> L54 java.lang.Throwable -> L68
            int r2 = r1.read(r5, r6, r7)     // Catch: java.security.GeneralSecurityException -> L50 java.io.IOException -> L54 java.lang.Throwable -> L68
            if (r2 == 0) goto L48
            r4.matchingStream = r1     // Catch: java.security.GeneralSecurityException -> L50 java.io.IOException -> L54 java.lang.Throwable -> L68
            r4.disableRewinding()     // Catch: java.security.GeneralSecurityException -> L50 java.io.IOException -> L54 java.lang.Throwable -> L68
            monitor-exit(r4)
            return r2
        L48:
            java.io.IOException r1 = new java.io.IOException     // Catch: java.security.GeneralSecurityException -> L50 java.io.IOException -> L54 java.lang.Throwable -> L68
            java.lang.String r2 = "Could not read bytes from the ciphertext stream"
            r1.<init>(r2)     // Catch: java.security.GeneralSecurityException -> L50 java.io.IOException -> L54 java.lang.Throwable -> L68
            throw r1     // Catch: java.security.GeneralSecurityException -> L50 java.io.IOException -> L54 java.lang.Throwable -> L68
        L50:
            r4.rewind()     // Catch: java.lang.Throwable -> L68
            goto L21
        L54:
            r4.rewind()     // Catch: java.lang.Throwable -> L68
            goto L21
        L58:
            java.io.IOException r5 = new java.io.IOException     // Catch: java.lang.Throwable -> L68
            java.lang.String r6 = "No matching key found for the ciphertext in the stream."
            r5.<init>(r6)     // Catch: java.lang.Throwable -> L68
            throw r5     // Catch: java.lang.Throwable -> L68
        L60:
            java.io.IOException r5 = new java.io.IOException     // Catch: java.lang.Throwable -> L68
            java.lang.String r6 = "No matching key found for the ciphertext in the stream."
            r5.<init>(r6)     // Catch: java.lang.Throwable -> L68
            throw r5     // Catch: java.lang.Throwable -> L68
        L68:
            r5 = move-exception
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L68
            throw r5
    }
}
