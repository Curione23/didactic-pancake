package com.google.crypto.tink.subtle;

/* JADX INFO: loaded from: classes2.dex */
class StreamingAeadDecryptingChannel implements java.nio.channels.ReadableByteChannel {
    private static final int PLAINTEXT_SEGMENT_EXTRA_SIZE = 16;
    private final byte[] associatedData;
    private java.nio.channels.ReadableByteChannel ciphertextChannel;
    private java.nio.ByteBuffer ciphertextSegment;
    private final int ciphertextSegmentSize;
    private final com.google.crypto.tink.subtle.StreamSegmentDecrypter decrypter;
    private boolean definedState;
    private boolean endOfCiphertext;
    private boolean endOfPlaintext;
    private final int firstCiphertextSegmentSize;
    private java.nio.ByteBuffer header;
    private boolean headerRead;
    private java.nio.ByteBuffer plaintextSegment;
    private int segmentNr;

    public StreamingAeadDecryptingChannel(com.google.crypto.tink.subtle.NonceBasedStreamingAead r2, java.nio.channels.ReadableByteChannel r3, byte[] r4) throws java.security.GeneralSecurityException, java.io.IOException {
            r1 = this;
            r1.<init>()
            com.google.crypto.tink.subtle.StreamSegmentDecrypter r0 = r2.newStreamSegmentDecrypter()
            r1.decrypter = r0
            r1.ciphertextChannel = r3
            int r3 = r2.getHeaderLength()
            java.nio.ByteBuffer r3 = java.nio.ByteBuffer.allocate(r3)
            r1.header = r3
            int r3 = r4.length
            byte[] r3 = java.util.Arrays.copyOf(r4, r3)
            r1.associatedData = r3
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
            r2 = 1
            r1.definedState = r2
            return
    }

    private void readSomeCiphertext(java.nio.ByteBuffer r3) throws java.io.IOException {
            r2 = this;
        L0:
            java.nio.channels.ReadableByteChannel r0 = r2.ciphertextChannel
            int r0 = r0.read(r3)
            if (r0 <= 0) goto Le
            int r1 = r3.remaining()
            if (r1 > 0) goto L0
        Le:
            r3 = -1
            if (r0 != r3) goto L14
            r3 = 1
            r2.endOfCiphertext = r3
        L14:
            return
    }

    private void setUndefinedState() {
            r2 = this;
            r0 = 0
            r2.definedState = r0
            java.nio.ByteBuffer r1 = r2.plaintextSegment
            r1.limit(r0)
            return
    }

    private boolean tryLoadSegment() throws java.io.IOException {
            r7 = this;
            boolean r0 = r7.endOfCiphertext
            if (r0 != 0) goto L9
            java.nio.ByteBuffer r0 = r7.ciphertextSegment
            r7.readSomeCiphertext(r0)
        L9:
            java.nio.ByteBuffer r0 = r7.ciphertextSegment
            int r0 = r0.remaining()
            r1 = 0
            if (r0 <= 0) goto L17
            boolean r0 = r7.endOfCiphertext
            if (r0 != 0) goto L17
            return r1
        L17:
            boolean r0 = r7.endOfCiphertext
            r2 = 1
            if (r0 != 0) goto L31
            java.nio.ByteBuffer r0 = r7.ciphertextSegment
            int r1 = r0.position()
            int r1 = r1 - r2
            byte r1 = r0.get(r1)
            java.nio.ByteBuffer r0 = r7.ciphertextSegment
            int r3 = r0.position()
            int r3 = r3 - r2
            r0.position(r3)
        L31:
            java.nio.ByteBuffer r0 = r7.ciphertextSegment
            r0.flip()
            java.nio.ByteBuffer r0 = r7.plaintextSegment
            r0.clear()
            com.google.crypto.tink.subtle.StreamSegmentDecrypter r0 = r7.decrypter     // Catch: java.security.GeneralSecurityException -> L6e
            java.nio.ByteBuffer r3 = r7.ciphertextSegment     // Catch: java.security.GeneralSecurityException -> L6e
            int r4 = r7.segmentNr     // Catch: java.security.GeneralSecurityException -> L6e
            boolean r5 = r7.endOfCiphertext     // Catch: java.security.GeneralSecurityException -> L6e
            java.nio.ByteBuffer r6 = r7.plaintextSegment     // Catch: java.security.GeneralSecurityException -> L6e
            r0.decryptSegment(r3, r4, r5, r6)     // Catch: java.security.GeneralSecurityException -> L6e
            int r0 = r7.segmentNr
            int r0 = r0 + r2
            r7.segmentNr = r0
            java.nio.ByteBuffer r0 = r7.plaintextSegment
            r0.flip()
            java.nio.ByteBuffer r0 = r7.ciphertextSegment
            r0.clear()
            boolean r0 = r7.endOfCiphertext
            if (r0 != 0) goto L6d
            java.nio.ByteBuffer r0 = r7.ciphertextSegment
            r0.clear()
            java.nio.ByteBuffer r0 = r7.ciphertextSegment
            int r3 = r7.ciphertextSegmentSize
            int r3 = r3 + r2
            r0.limit(r3)
            java.nio.ByteBuffer r0 = r7.ciphertextSegment
            r0.put(r1)
        L6d:
            return r2
        L6e:
            r0 = move-exception
            r7.setUndefinedState()
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

    private boolean tryReadHeader() throws java.io.IOException {
            r3 = this;
            boolean r0 = r3.endOfCiphertext
            if (r0 != 0) goto L2f
            java.nio.ByteBuffer r0 = r3.header
            r3.readSomeCiphertext(r0)
            java.nio.ByteBuffer r0 = r3.header
            int r0 = r0.remaining()
            if (r0 <= 0) goto L13
            r0 = 0
            return r0
        L13:
            java.nio.ByteBuffer r0 = r3.header
            r0.flip()
            com.google.crypto.tink.subtle.StreamSegmentDecrypter r0 = r3.decrypter     // Catch: java.security.GeneralSecurityException -> L25
            java.nio.ByteBuffer r1 = r3.header     // Catch: java.security.GeneralSecurityException -> L25
            byte[] r2 = r3.associatedData     // Catch: java.security.GeneralSecurityException -> L25
            r0.init(r1, r2)     // Catch: java.security.GeneralSecurityException -> L25
            r0 = 1
            r3.headerRead = r0     // Catch: java.security.GeneralSecurityException -> L25
            return r0
        L25:
            r0 = move-exception
            r3.setUndefinedState()
            java.io.IOException r1 = new java.io.IOException
            r1.<init>(r0)
            throw r1
        L2f:
            java.io.IOException r0 = new java.io.IOException
            java.lang.String r1 = "Ciphertext is too short"
            r0.<init>(r1)
            throw r0
    }

    @Override // java.nio.channels.Channel, java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() throws java.io.IOException {
            r1 = this;
            monitor-enter(r1)
            java.nio.channels.ReadableByteChannel r0 = r1.ciphertextChannel     // Catch: java.lang.Throwable -> L8
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
            java.nio.channels.ReadableByteChannel r0 = r1.ciphertextChannel     // Catch: java.lang.Throwable -> L9
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
            boolean r0 = r6.definedState     // Catch: java.lang.Throwable -> L90
            if (r0 == 0) goto L88
            boolean r0 = r6.headerRead     // Catch: java.lang.Throwable -> L90
            r1 = 1
            if (r0 != 0) goto L20
            boolean r0 = r6.tryReadHeader()     // Catch: java.lang.Throwable -> L90
            if (r0 != 0) goto L13
            monitor-exit(r6)
            r7 = 0
            return r7
        L13:
            java.nio.ByteBuffer r0 = r6.ciphertextSegment     // Catch: java.lang.Throwable -> L90
            r0.clear()     // Catch: java.lang.Throwable -> L90
            java.nio.ByteBuffer r0 = r6.ciphertextSegment     // Catch: java.lang.Throwable -> L90
            int r2 = r6.firstCiphertextSegmentSize     // Catch: java.lang.Throwable -> L90
            int r2 = r2 + r1
            r0.limit(r2)     // Catch: java.lang.Throwable -> L90
        L20:
            boolean r0 = r6.endOfPlaintext     // Catch: java.lang.Throwable -> L90
            r2 = -1
            if (r0 == 0) goto L27
            monitor-exit(r6)
            return r2
        L27:
            int r0 = r7.position()     // Catch: java.lang.Throwable -> L90
        L2b:
            int r3 = r7.remaining()     // Catch: java.lang.Throwable -> L90
            if (r3 <= 0) goto L79
            java.nio.ByteBuffer r3 = r6.plaintextSegment     // Catch: java.lang.Throwable -> L90
            int r3 = r3.remaining()     // Catch: java.lang.Throwable -> L90
            if (r3 != 0) goto L47
            boolean r3 = r6.endOfCiphertext     // Catch: java.lang.Throwable -> L90
            if (r3 == 0) goto L40
            r6.endOfPlaintext = r1     // Catch: java.lang.Throwable -> L90
            goto L79
        L40:
            boolean r3 = r6.tryLoadSegment()     // Catch: java.lang.Throwable -> L90
            if (r3 != 0) goto L47
            goto L79
        L47:
            java.nio.ByteBuffer r3 = r6.plaintextSegment     // Catch: java.lang.Throwable -> L90
            int r3 = r3.remaining()     // Catch: java.lang.Throwable -> L90
            int r4 = r7.remaining()     // Catch: java.lang.Throwable -> L90
            if (r3 > r4) goto L59
            java.nio.ByteBuffer r3 = r6.plaintextSegment     // Catch: java.lang.Throwable -> L90
            r7.put(r3)     // Catch: java.lang.Throwable -> L90
            goto L2b
        L59:
            int r3 = r7.remaining()     // Catch: java.lang.Throwable -> L90
            java.nio.ByteBuffer r4 = r6.plaintextSegment     // Catch: java.lang.Throwable -> L90
            java.nio.ByteBuffer r4 = r4.duplicate()     // Catch: java.lang.Throwable -> L90
            int r5 = r4.position()     // Catch: java.lang.Throwable -> L90
            int r5 = r5 + r3
            r4.limit(r5)     // Catch: java.lang.Throwable -> L90
            r7.put(r4)     // Catch: java.lang.Throwable -> L90
            java.nio.ByteBuffer r4 = r6.plaintextSegment     // Catch: java.lang.Throwable -> L90
            int r5 = r4.position()     // Catch: java.lang.Throwable -> L90
            int r5 = r5 + r3
            r4.position(r5)     // Catch: java.lang.Throwable -> L90
            goto L2b
        L79:
            int r7 = r7.position()     // Catch: java.lang.Throwable -> L90
            int r7 = r7 - r0
            if (r7 != 0) goto L86
            boolean r0 = r6.endOfPlaintext     // Catch: java.lang.Throwable -> L90
            if (r0 == 0) goto L86
            monitor-exit(r6)
            return r2
        L86:
            monitor-exit(r6)
            return r7
        L88:
            java.io.IOException r7 = new java.io.IOException     // Catch: java.lang.Throwable -> L90
            java.lang.String r0 = "This StreamingAeadDecryptingChannel is in an undefined state"
            r7.<init>(r0)     // Catch: java.lang.Throwable -> L90
            throw r7     // Catch: java.lang.Throwable -> L90
        L90:
            r7 = move-exception
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L90
            throw r7
    }

    public synchronized java.lang.String toString() {
            r6 = this;
            java.lang.String r0 = "\nplaintextSegment position:"
            java.lang.String r1 = "\nciphertextSgement position:"
            java.lang.String r2 = "\nHeader position:"
            java.lang.String r3 = "StreamingAeadDecryptingChannel\nsegmentNr:"
            monitor-enter(r6)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Laf
            r4.<init>(r3)     // Catch: java.lang.Throwable -> Laf
            int r3 = r6.segmentNr     // Catch: java.lang.Throwable -> Laf
            java.lang.StringBuilder r3 = r4.append(r3)     // Catch: java.lang.Throwable -> Laf
            java.lang.String r5 = "\nciphertextSegmentSize:"
            java.lang.StringBuilder r3 = r3.append(r5)     // Catch: java.lang.Throwable -> Laf
            int r5 = r6.ciphertextSegmentSize     // Catch: java.lang.Throwable -> Laf
            java.lang.StringBuilder r3 = r3.append(r5)     // Catch: java.lang.Throwable -> Laf
            java.lang.String r5 = "\nheaderRead:"
            java.lang.StringBuilder r3 = r3.append(r5)     // Catch: java.lang.Throwable -> Laf
            boolean r5 = r6.headerRead     // Catch: java.lang.Throwable -> Laf
            java.lang.StringBuilder r3 = r3.append(r5)     // Catch: java.lang.Throwable -> Laf
            java.lang.String r5 = "\nendOfCiphertext:"
            java.lang.StringBuilder r3 = r3.append(r5)     // Catch: java.lang.Throwable -> Laf
            boolean r5 = r6.endOfCiphertext     // Catch: java.lang.Throwable -> Laf
            java.lang.StringBuilder r3 = r3.append(r5)     // Catch: java.lang.Throwable -> Laf
            java.lang.String r5 = "\nendOfPlaintext:"
            java.lang.StringBuilder r3 = r3.append(r5)     // Catch: java.lang.Throwable -> Laf
            boolean r5 = r6.endOfPlaintext     // Catch: java.lang.Throwable -> Laf
            java.lang.StringBuilder r3 = r3.append(r5)     // Catch: java.lang.Throwable -> Laf
            java.lang.String r5 = "\ndefinedState:"
            java.lang.StringBuilder r3 = r3.append(r5)     // Catch: java.lang.Throwable -> Laf
            boolean r5 = r6.definedState     // Catch: java.lang.Throwable -> Laf
            java.lang.StringBuilder r3 = r3.append(r5)     // Catch: java.lang.Throwable -> Laf
            java.lang.StringBuilder r2 = r3.append(r2)     // Catch: java.lang.Throwable -> Laf
            java.nio.ByteBuffer r3 = r6.header     // Catch: java.lang.Throwable -> Laf
            int r3 = r3.position()     // Catch: java.lang.Throwable -> Laf
            java.lang.StringBuilder r2 = r2.append(r3)     // Catch: java.lang.Throwable -> Laf
            java.lang.String r3 = " limit:"
            java.lang.StringBuilder r2 = r2.append(r3)     // Catch: java.lang.Throwable -> Laf
            java.nio.ByteBuffer r3 = r6.header     // Catch: java.lang.Throwable -> Laf
            int r3 = r3.position()     // Catch: java.lang.Throwable -> Laf
            java.lang.StringBuilder r2 = r2.append(r3)     // Catch: java.lang.Throwable -> Laf
            java.lang.StringBuilder r1 = r2.append(r1)     // Catch: java.lang.Throwable -> Laf
            java.nio.ByteBuffer r2 = r6.ciphertextSegment     // Catch: java.lang.Throwable -> Laf
            int r2 = r2.position()     // Catch: java.lang.Throwable -> Laf
            java.lang.StringBuilder r1 = r1.append(r2)     // Catch: java.lang.Throwable -> Laf
            java.lang.String r2 = " limit:"
            java.lang.StringBuilder r1 = r1.append(r2)     // Catch: java.lang.Throwable -> Laf
            java.nio.ByteBuffer r2 = r6.ciphertextSegment     // Catch: java.lang.Throwable -> Laf
            int r2 = r2.limit()     // Catch: java.lang.Throwable -> Laf
            java.lang.StringBuilder r1 = r1.append(r2)     // Catch: java.lang.Throwable -> Laf
            java.lang.StringBuilder r0 = r1.append(r0)     // Catch: java.lang.Throwable -> Laf
            java.nio.ByteBuffer r1 = r6.plaintextSegment     // Catch: java.lang.Throwable -> Laf
            int r1 = r1.position()     // Catch: java.lang.Throwable -> Laf
            java.lang.StringBuilder r0 = r0.append(r1)     // Catch: java.lang.Throwable -> Laf
            java.lang.String r1 = " limit:"
            java.lang.StringBuilder r0 = r0.append(r1)     // Catch: java.lang.Throwable -> Laf
            java.nio.ByteBuffer r1 = r6.plaintextSegment     // Catch: java.lang.Throwable -> Laf
            int r1 = r1.limit()     // Catch: java.lang.Throwable -> Laf
            r0.append(r1)     // Catch: java.lang.Throwable -> Laf
            java.lang.String r0 = r4.toString()     // Catch: java.lang.Throwable -> Laf
            monitor-exit(r6)
            return r0
        Laf:
            r0 = move-exception
            monitor-exit(r6)     // Catch: java.lang.Throwable -> Laf
            throw r0
    }
}
