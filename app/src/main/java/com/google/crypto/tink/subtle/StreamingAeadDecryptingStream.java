package com.google.crypto.tink.subtle;

/* JADX INFO: loaded from: classes2.dex */
class StreamingAeadDecryptingStream extends java.io.FilterInputStream {
    private static final int PLAINTEXT_SEGMENT_EXTRA_SIZE = 16;
    private final byte[] aad;
    private final java.nio.ByteBuffer ciphertextSegment;
    private final int ciphertextSegmentSize;
    private final com.google.crypto.tink.subtle.StreamSegmentDecrypter decrypter;
    private boolean decryptionErrorOccured;
    private boolean endOfCiphertext;
    private boolean endOfPlaintext;
    private final int firstCiphertextSegmentSize;
    private final int headerLength;
    private boolean headerRead;
    private final java.nio.ByteBuffer plaintextSegment;
    private int segmentNr;

    public StreamingAeadDecryptingStream(com.google.crypto.tink.subtle.NonceBasedStreamingAead r2, java.io.InputStream r3, byte[] r4) throws java.security.GeneralSecurityException, java.io.IOException {
            r1 = this;
            r1.<init>(r3)
            com.google.crypto.tink.subtle.StreamSegmentDecrypter r3 = r2.newStreamSegmentDecrypter()
            r1.decrypter = r3
            int r3 = r2.getHeaderLength()
            r1.headerLength = r3
            int r3 = r4.length
            byte[] r3 = java.util.Arrays.copyOf(r4, r3)
            r1.aad = r3
            int r3 = r2.getCiphertextSegmentSize()
            r1.ciphertextSegmentSize = r3
            int r4 = r3 + 1
            java.nio.ByteBuffer r4 = java.nio.ByteBuffer.allocate(r4)
            r1.ciphertextSegment = r4
            r0 = 0
            r4.limit(r0)
            int r4 = r2.getCiphertextOffset()
            int r3 = r3 - r4
            r1.firstCiphertextSegmentSize = r3
            int r2 = r2.getPlaintextSegmentSize()
            int r2 = r2 + 16
            java.nio.ByteBuffer r2 = java.nio.ByteBuffer.allocate(r2)
            r1.plaintextSegment = r2
            r2.limit(r0)
            r1.headerRead = r0
            r1.endOfCiphertext = r0
            r1.endOfPlaintext = r0
            r1.segmentNr = r0
            r1.decryptionErrorOccured = r0
            return
    }

    private void loadSegment() throws java.io.IOException {
            r7 = this;
        L0:
            boolean r0 = r7.endOfCiphertext
            r1 = 1
            if (r0 != 0) goto L43
            java.nio.ByteBuffer r0 = r7.ciphertextSegment
            int r0 = r0.remaining()
            if (r0 <= 0) goto L43
            java.io.InputStream r0 = r7.in
            java.nio.ByteBuffer r2 = r7.ciphertextSegment
            byte[] r2 = r2.array()
            java.nio.ByteBuffer r3 = r7.ciphertextSegment
            int r3 = r3.position()
            java.nio.ByteBuffer r4 = r7.ciphertextSegment
            int r4 = r4.remaining()
            int r0 = r0.read(r2, r3, r4)
            if (r0 <= 0) goto L32
            java.nio.ByteBuffer r1 = r7.ciphertextSegment
            int r2 = r1.position()
            int r2 = r2 + r0
            r1.position(r2)
            goto L0
        L32:
            r2 = -1
            if (r0 != r2) goto L38
            r7.endOfCiphertext = r1
            goto L0
        L38:
            if (r0 == 0) goto L3b
            goto L0
        L3b:
            java.io.IOException r0 = new java.io.IOException
            java.lang.String r1 = "Could not read bytes from the ciphertext stream"
            r0.<init>(r1)
            throw r0
        L43:
            boolean r0 = r7.endOfCiphertext
            if (r0 != 0) goto L5d
            java.nio.ByteBuffer r0 = r7.ciphertextSegment
            int r2 = r0.position()
            int r2 = r2 - r1
            byte r0 = r0.get(r2)
            java.nio.ByteBuffer r2 = r7.ciphertextSegment
            int r3 = r2.position()
            int r3 = r3 - r1
            r2.position(r3)
            goto L5e
        L5d:
            r0 = 0
        L5e:
            java.nio.ByteBuffer r2 = r7.ciphertextSegment
            r2.flip()
            java.nio.ByteBuffer r2 = r7.plaintextSegment
            r2.clear()
            com.google.crypto.tink.subtle.StreamSegmentDecrypter r2 = r7.decrypter     // Catch: java.security.GeneralSecurityException -> L9b
            java.nio.ByteBuffer r3 = r7.ciphertextSegment     // Catch: java.security.GeneralSecurityException -> L9b
            int r4 = r7.segmentNr     // Catch: java.security.GeneralSecurityException -> L9b
            boolean r5 = r7.endOfCiphertext     // Catch: java.security.GeneralSecurityException -> L9b
            java.nio.ByteBuffer r6 = r7.plaintextSegment     // Catch: java.security.GeneralSecurityException -> L9b
            r2.decryptSegment(r3, r4, r5, r6)     // Catch: java.security.GeneralSecurityException -> L9b
            int r2 = r7.segmentNr
            int r2 = r2 + r1
            r7.segmentNr = r2
            java.nio.ByteBuffer r2 = r7.plaintextSegment
            r2.flip()
            java.nio.ByteBuffer r2 = r7.ciphertextSegment
            r2.clear()
            boolean r2 = r7.endOfCiphertext
            if (r2 != 0) goto L9a
            java.nio.ByteBuffer r2 = r7.ciphertextSegment
            r2.clear()
            java.nio.ByteBuffer r2 = r7.ciphertextSegment
            int r3 = r7.ciphertextSegmentSize
            int r3 = r3 + r1
            r2.limit(r3)
            java.nio.ByteBuffer r1 = r7.ciphertextSegment
            r1.put(r0)
        L9a:
            return
        L9b:
            r0 = move-exception
            r7.setDecryptionErrorOccured()
            java.io.IOException r1 = new java.io.IOException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = r0.getMessage()
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r3 = "\n"
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r3 = r7.toString()
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r3 = "\nsegmentNr:"
            java.lang.StringBuilder r2 = r2.append(r3)
            int r3 = r7.segmentNr
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r3 = " endOfCiphertext:"
            java.lang.StringBuilder r2 = r2.append(r3)
            boolean r3 = r7.endOfCiphertext
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2, r0)
            throw r1
    }

    private void readHeader() throws java.io.IOException {
            r5 = this;
            boolean r0 = r5.headerRead
            if (r0 != 0) goto L58
            int r0 = r5.headerLength
            java.nio.ByteBuffer r0 = java.nio.ByteBuffer.allocate(r0)
        La:
            int r1 = r0.remaining()
            if (r1 <= 0) goto L43
            java.io.InputStream r1 = r5.in
            byte[] r2 = r0.array()
            int r3 = r0.position()
            int r4 = r0.remaining()
            int r1 = r1.read(r2, r3, r4)
            r2 = -1
            if (r1 == r2) goto L38
            if (r1 == 0) goto L30
            int r2 = r0.position()
            int r2 = r2 + r1
            r0.position(r2)
            goto La
        L30:
            java.io.IOException r0 = new java.io.IOException
            java.lang.String r1 = "Could not read bytes from the ciphertext stream"
            r0.<init>(r1)
            throw r0
        L38:
            r5.setDecryptionErrorOccured()
            java.io.IOException r0 = new java.io.IOException
            java.lang.String r1 = "Ciphertext is too short"
            r0.<init>(r1)
            throw r0
        L43:
            r0.flip()
            com.google.crypto.tink.subtle.StreamSegmentDecrypter r1 = r5.decrypter     // Catch: java.security.GeneralSecurityException -> L51
            byte[] r2 = r5.aad     // Catch: java.security.GeneralSecurityException -> L51
            r1.init(r0, r2)     // Catch: java.security.GeneralSecurityException -> L51
            r0 = 1
            r5.headerRead = r0
            return
        L51:
            r0 = move-exception
            java.io.IOException r1 = new java.io.IOException
            r1.<init>(r0)
            throw r1
        L58:
            r5.setDecryptionErrorOccured()
            java.io.IOException r0 = new java.io.IOException
            java.lang.String r1 = "Decryption failed."
            r0.<init>(r1)
            throw r0
    }

    private void setDecryptionErrorOccured() {
            r2 = this;
            r0 = 1
            r2.decryptionErrorOccured = r0
            java.nio.ByteBuffer r0 = r2.plaintextSegment
            r1 = 0
            r0.limit(r1)
            return
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized int available() {
            r1 = this;
            monitor-enter(r1)
            java.nio.ByteBuffer r0 = r1.plaintextSegment     // Catch: java.lang.Throwable -> L9
            int r0 = r0.remaining()     // Catch: java.lang.Throwable -> L9
            monitor-exit(r1)
            return r0
        L9:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L9
            throw r0
    }

    @Override // java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() throws java.io.IOException {
            r1 = this;
            monitor-enter(r1)
            super.close()     // Catch: java.lang.Throwable -> L6
            monitor-exit(r1)
            return
        L6:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L6
            throw r0
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized void mark(int r1) {
            r0 = this;
            monitor-enter(r0)
            monitor-exit(r0)
            return
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public boolean markSupported() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read() throws java.io.IOException {
            r4 = this;
            r0 = 1
            byte[] r1 = new byte[r0]
            r2 = 0
            int r3 = r4.read(r1, r2, r0)
            if (r3 != r0) goto Lf
            r0 = r1[r2]
            r0 = r0 & 255(0xff, float:3.57E-43)
            return r0
        Lf:
            r0 = -1
            if (r3 != r0) goto L13
            return r3
        L13:
            java.io.IOException r0 = new java.io.IOException
            java.lang.String r1 = "Reading failed"
            r0.<init>(r1)
            throw r0
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] r3) throws java.io.IOException {
            r2 = this;
            r0 = 0
            int r1 = r3.length
            int r3 = r2.read(r3, r0, r1)
            return r3
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized int read(byte[] r7, int r8, int r9) throws java.io.IOException {
            r6 = this;
            monitor-enter(r6)
            boolean r0 = r6.decryptionErrorOccured     // Catch: java.lang.Throwable -> L5d
            if (r0 != 0) goto L55
            boolean r0 = r6.headerRead     // Catch: java.lang.Throwable -> L5d
            r1 = 1
            if (r0 != 0) goto L1a
            r6.readHeader()     // Catch: java.lang.Throwable -> L5d
            java.nio.ByteBuffer r0 = r6.ciphertextSegment     // Catch: java.lang.Throwable -> L5d
            r0.clear()     // Catch: java.lang.Throwable -> L5d
            java.nio.ByteBuffer r0 = r6.ciphertextSegment     // Catch: java.lang.Throwable -> L5d
            int r2 = r6.firstCiphertextSegmentSize     // Catch: java.lang.Throwable -> L5d
            int r2 = r2 + r1
            r0.limit(r2)     // Catch: java.lang.Throwable -> L5d
        L1a:
            boolean r0 = r6.endOfPlaintext     // Catch: java.lang.Throwable -> L5d
            r2 = -1
            if (r0 == 0) goto L21
            monitor-exit(r6)
            return r2
        L21:
            r0 = 0
        L22:
            if (r0 >= r9) goto L4b
            java.nio.ByteBuffer r3 = r6.plaintextSegment     // Catch: java.lang.Throwable -> L5d
            int r3 = r3.remaining()     // Catch: java.lang.Throwable -> L5d
            if (r3 != 0) goto L36
            boolean r3 = r6.endOfCiphertext     // Catch: java.lang.Throwable -> L5d
            if (r3 == 0) goto L33
            r6.endOfPlaintext = r1     // Catch: java.lang.Throwable -> L5d
            goto L4b
        L33:
            r6.loadSegment()     // Catch: java.lang.Throwable -> L5d
        L36:
            java.nio.ByteBuffer r3 = r6.plaintextSegment     // Catch: java.lang.Throwable -> L5d
            int r3 = r3.remaining()     // Catch: java.lang.Throwable -> L5d
            int r4 = r9 - r0
            int r3 = java.lang.Math.min(r3, r4)     // Catch: java.lang.Throwable -> L5d
            java.nio.ByteBuffer r4 = r6.plaintextSegment     // Catch: java.lang.Throwable -> L5d
            int r5 = r0 + r8
            r4.get(r7, r5, r3)     // Catch: java.lang.Throwable -> L5d
            int r0 = r0 + r3
            goto L22
        L4b:
            if (r0 != 0) goto L53
            boolean r7 = r6.endOfPlaintext     // Catch: java.lang.Throwable -> L5d
            if (r7 == 0) goto L53
            monitor-exit(r6)
            return r2
        L53:
            monitor-exit(r6)
            return r0
        L55:
            java.io.IOException r7 = new java.io.IOException     // Catch: java.lang.Throwable -> L5d
            java.lang.String r8 = "Decryption failed."
            r7.<init>(r8)     // Catch: java.lang.Throwable -> L5d
            throw r7     // Catch: java.lang.Throwable -> L5d
        L5d:
            r7 = move-exception
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L5d
            throw r7
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public long skip(long r9) throws java.io.IOException {
            r8 = this;
            int r0 = r8.ciphertextSegmentSize
            long r0 = (long) r0
            r2 = 0
            int r4 = (r9 > r2 ? 1 : (r9 == r2 ? 0 : -1))
            if (r4 > 0) goto La
            return r2
        La:
            long r0 = java.lang.Math.min(r0, r9)
            int r0 = (int) r0
            byte[] r1 = new byte[r0]
            r4 = r9
        L12:
            int r6 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r6 <= 0) goto L27
            long r6 = (long) r0
            long r6 = java.lang.Math.min(r6, r4)
            int r6 = (int) r6
            r7 = 0
            int r6 = r8.read(r1, r7, r6)
            if (r6 > 0) goto L24
            goto L27
        L24:
            long r6 = (long) r6
            long r4 = r4 - r6
            goto L12
        L27:
            long r9 = r9 - r4
            return r9
    }

    public synchronized java.lang.String toString() {
            r5 = this;
            java.lang.String r0 = "\nplaintextSegment position:"
            java.lang.String r1 = "\nciphertextSgement position:"
            java.lang.String r2 = "StreamingAeadDecryptingStream\nsegmentNr:"
            monitor-enter(r5)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L8f
            r3.<init>(r2)     // Catch: java.lang.Throwable -> L8f
            int r2 = r5.segmentNr     // Catch: java.lang.Throwable -> L8f
            java.lang.StringBuilder r2 = r3.append(r2)     // Catch: java.lang.Throwable -> L8f
            java.lang.String r4 = "\nciphertextSegmentSize:"
            java.lang.StringBuilder r2 = r2.append(r4)     // Catch: java.lang.Throwable -> L8f
            int r4 = r5.ciphertextSegmentSize     // Catch: java.lang.Throwable -> L8f
            java.lang.StringBuilder r2 = r2.append(r4)     // Catch: java.lang.Throwable -> L8f
            java.lang.String r4 = "\nheaderRead:"
            java.lang.StringBuilder r2 = r2.append(r4)     // Catch: java.lang.Throwable -> L8f
            boolean r4 = r5.headerRead     // Catch: java.lang.Throwable -> L8f
            java.lang.StringBuilder r2 = r2.append(r4)     // Catch: java.lang.Throwable -> L8f
            java.lang.String r4 = "\nendOfCiphertext:"
            java.lang.StringBuilder r2 = r2.append(r4)     // Catch: java.lang.Throwable -> L8f
            boolean r4 = r5.endOfCiphertext     // Catch: java.lang.Throwable -> L8f
            java.lang.StringBuilder r2 = r2.append(r4)     // Catch: java.lang.Throwable -> L8f
            java.lang.String r4 = "\nendOfPlaintext:"
            java.lang.StringBuilder r2 = r2.append(r4)     // Catch: java.lang.Throwable -> L8f
            boolean r4 = r5.endOfPlaintext     // Catch: java.lang.Throwable -> L8f
            java.lang.StringBuilder r2 = r2.append(r4)     // Catch: java.lang.Throwable -> L8f
            java.lang.String r4 = "\ndecryptionErrorOccured:"
            java.lang.StringBuilder r2 = r2.append(r4)     // Catch: java.lang.Throwable -> L8f
            boolean r4 = r5.decryptionErrorOccured     // Catch: java.lang.Throwable -> L8f
            java.lang.StringBuilder r2 = r2.append(r4)     // Catch: java.lang.Throwable -> L8f
            java.lang.StringBuilder r1 = r2.append(r1)     // Catch: java.lang.Throwable -> L8f
            java.nio.ByteBuffer r2 = r5.ciphertextSegment     // Catch: java.lang.Throwable -> L8f
            int r2 = r2.position()     // Catch: java.lang.Throwable -> L8f
            java.lang.StringBuilder r1 = r1.append(r2)     // Catch: java.lang.Throwable -> L8f
            java.lang.String r2 = " limit:"
            java.lang.StringBuilder r1 = r1.append(r2)     // Catch: java.lang.Throwable -> L8f
            java.nio.ByteBuffer r2 = r5.ciphertextSegment     // Catch: java.lang.Throwable -> L8f
            int r2 = r2.limit()     // Catch: java.lang.Throwable -> L8f
            java.lang.StringBuilder r1 = r1.append(r2)     // Catch: java.lang.Throwable -> L8f
            java.lang.StringBuilder r0 = r1.append(r0)     // Catch: java.lang.Throwable -> L8f
            java.nio.ByteBuffer r1 = r5.plaintextSegment     // Catch: java.lang.Throwable -> L8f
            int r1 = r1.position()     // Catch: java.lang.Throwable -> L8f
            java.lang.StringBuilder r0 = r0.append(r1)     // Catch: java.lang.Throwable -> L8f
            java.lang.String r1 = " limit:"
            java.lang.StringBuilder r0 = r0.append(r1)     // Catch: java.lang.Throwable -> L8f
            java.nio.ByteBuffer r1 = r5.plaintextSegment     // Catch: java.lang.Throwable -> L8f
            int r1 = r1.limit()     // Catch: java.lang.Throwable -> L8f
            r0.append(r1)     // Catch: java.lang.Throwable -> L8f
            java.lang.String r0 = r3.toString()     // Catch: java.lang.Throwable -> L8f
            monitor-exit(r5)
            return r0
        L8f:
            r0 = move-exception
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L8f
            throw r0
    }
}
