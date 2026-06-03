package com.google.crypto.tink.subtle;

/* JADX INFO: loaded from: classes2.dex */
class StreamingAeadSeekableDecryptingChannel implements java.nio.channels.SeekableByteChannel {
    private static final int PLAINTEXT_SEGMENT_EXTRA_SIZE = 16;
    private final byte[] aad;
    private final java.nio.channels.SeekableByteChannel ciphertextChannel;
    private final long ciphertextChannelSize;
    private final int ciphertextOffset;
    private final java.nio.ByteBuffer ciphertextSegment;
    private final int ciphertextSegmentSize;
    private int currentSegmentNr;
    private final com.google.crypto.tink.subtle.StreamSegmentDecrypter decrypter;
    private final int firstSegmentOffset;
    private final java.nio.ByteBuffer header;
    private boolean headerRead;
    private boolean isCurrentSegmentDecrypted;
    private boolean isopen;
    private final int lastCiphertextSegmentSize;
    private final int numberOfSegments;
    private long plaintextPosition;
    private final java.nio.ByteBuffer plaintextSegment;
    private final int plaintextSegmentSize;
    private long plaintextSize;

    public StreamingAeadSeekableDecryptingChannel(com.google.crypto.tink.subtle.NonceBasedStreamingAead r9, java.nio.channels.SeekableByteChannel r10, byte[] r11) throws java.io.IOException, java.security.GeneralSecurityException {
            r8 = this;
            r8.<init>()
            com.google.crypto.tink.subtle.StreamSegmentDecrypter r0 = r9.newStreamSegmentDecrypter()
            r8.decrypter = r0
            r8.ciphertextChannel = r10
            int r0 = r9.getHeaderLength()
            java.nio.ByteBuffer r0 = java.nio.ByteBuffer.allocate(r0)
            r8.header = r0
            int r0 = r9.getCiphertextSegmentSize()
            r8.ciphertextSegmentSize = r0
            java.nio.ByteBuffer r1 = java.nio.ByteBuffer.allocate(r0)
            r8.ciphertextSegment = r1
            int r1 = r9.getPlaintextSegmentSize()
            r8.plaintextSegmentSize = r1
            int r1 = r1 + 16
            java.nio.ByteBuffer r1 = java.nio.ByteBuffer.allocate(r1)
            r8.plaintextSegment = r1
            r1 = 0
            r8.plaintextPosition = r1
            r1 = 0
            r8.headerRead = r1
            r2 = -1
            r8.currentSegmentNr = r2
            r8.isCurrentSegmentDecrypted = r1
            long r1 = r10.size()
            r8.ciphertextChannelSize = r1
            int r3 = r11.length
            byte[] r11 = java.util.Arrays.copyOf(r11, r3)
            r8.aad = r11
            boolean r10 = r10.isOpen()
            r8.isopen = r10
            long r10 = (long) r0
            long r10 = r1 / r10
            int r10 = (int) r10
            long r3 = (long) r0
            long r3 = r1 % r3
            int r11 = (int) r3
            int r3 = r9.getCiphertextOverhead()
            if (r11 <= 0) goto L6d
            int r10 = r10 + 1
            r8.numberOfSegments = r10
            if (r11 < r3) goto L65
            r8.lastCiphertextSegmentSize = r11
            goto L71
        L65:
            java.io.IOException r9 = new java.io.IOException
            java.lang.String r10 = "Invalid ciphertext size"
            r9.<init>(r10)
            throw r9
        L6d:
            r8.numberOfSegments = r10
            r8.lastCiphertextSegmentSize = r0
        L71:
            int r10 = r9.getCiphertextOffset()
            r8.ciphertextOffset = r10
            int r9 = r9.getHeaderLength()
            int r9 = r10 - r9
            r8.firstSegmentOffset = r9
            if (r9 < 0) goto L98
            int r9 = r8.numberOfSegments
            long r4 = (long) r9
            long r6 = (long) r3
            long r4 = r4 * r6
            long r9 = (long) r10
            long r4 = r4 + r9
            int r9 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r9 > 0) goto L90
            long r1 = r1 - r4
            r8.plaintextSize = r1
            return
        L90:
            java.io.IOException r9 = new java.io.IOException
            java.lang.String r10 = "Ciphertext is too short"
            r9.<init>(r10)
            throw r9
        L98:
            java.io.IOException r9 = new java.io.IOException
            java.lang.String r10 = "Invalid ciphertext offset or header length"
            r9.<init>(r10)
            throw r9
    }

    private int getSegmentNr(long r3) {
            r2 = this;
            int r0 = r2.ciphertextOffset
            long r0 = (long) r0
            long r3 = r3 + r0
            int r0 = r2.plaintextSegmentSize
            long r0 = (long) r0
            long r3 = r3 / r0
            int r3 = (int) r3
            return r3
    }

    private boolean reachedEnd() {
            r3 = this;
            boolean r0 = r3.isCurrentSegmentDecrypted
            if (r0 == 0) goto L15
            int r0 = r3.currentSegmentNr
            int r1 = r3.numberOfSegments
            r2 = 1
            int r1 = r1 - r2
            if (r0 != r1) goto L15
            java.nio.ByteBuffer r0 = r3.plaintextSegment
            int r0 = r0.remaining()
            if (r0 != 0) goto L15
            goto L16
        L15:
            r2 = 0
        L16:
            return r2
    }

    private boolean tryLoadSegment(int r9) throws java.io.IOException {
            r8 = this;
            if (r9 < 0) goto L78
            int r0 = r8.numberOfSegments
            if (r9 >= r0) goto L78
            r1 = 1
            int r0 = r0 - r1
            r2 = 0
            if (r9 != r0) goto Ld
            r0 = r1
            goto Le
        Ld:
            r0 = r2
        Le:
            int r3 = r8.currentSegmentNr
            if (r9 != r3) goto L17
            boolean r3 = r8.isCurrentSegmentDecrypted
            if (r3 == 0) goto L39
            return r1
        L17:
            long r3 = (long) r9
            int r5 = r8.ciphertextSegmentSize
            long r6 = (long) r5
            long r3 = r3 * r6
            if (r0 == 0) goto L20
            int r5 = r8.lastCiphertextSegmentSize
        L20:
            if (r9 != 0) goto L26
            int r3 = r8.ciphertextOffset
            int r5 = r5 - r3
            long r3 = (long) r3
        L26:
            java.nio.channels.SeekableByteChannel r6 = r8.ciphertextChannel
            r6.position(r3)
            java.nio.ByteBuffer r3 = r8.ciphertextSegment
            r3.clear()
            java.nio.ByteBuffer r3 = r8.ciphertextSegment
            r3.limit(r5)
            r8.currentSegmentNr = r9
            r8.isCurrentSegmentDecrypted = r2
        L39:
            java.nio.ByteBuffer r3 = r8.ciphertextSegment
            int r3 = r3.remaining()
            if (r3 <= 0) goto L48
            java.nio.channels.SeekableByteChannel r3 = r8.ciphertextChannel
            java.nio.ByteBuffer r4 = r8.ciphertextSegment
            r3.read(r4)
        L48:
            java.nio.ByteBuffer r3 = r8.ciphertextSegment
            int r3 = r3.remaining()
            if (r3 <= 0) goto L51
            return r2
        L51:
            java.nio.ByteBuffer r2 = r8.ciphertextSegment
            r2.flip()
            java.nio.ByteBuffer r2 = r8.plaintextSegment
            r2.clear()
            com.google.crypto.tink.subtle.StreamSegmentDecrypter r2 = r8.decrypter     // Catch: java.security.GeneralSecurityException -> L6c
            java.nio.ByteBuffer r3 = r8.ciphertextSegment     // Catch: java.security.GeneralSecurityException -> L6c
            java.nio.ByteBuffer r4 = r8.plaintextSegment     // Catch: java.security.GeneralSecurityException -> L6c
            r2.decryptSegment(r3, r9, r0, r4)     // Catch: java.security.GeneralSecurityException -> L6c
            java.nio.ByteBuffer r9 = r8.plaintextSegment
            r9.flip()
            r8.isCurrentSegmentDecrypted = r1
            return r1
        L6c:
            r9 = move-exception
            r0 = -1
            r8.currentSegmentNr = r0
            java.io.IOException r0 = new java.io.IOException
            java.lang.String r1 = "Failed to decrypt"
            r0.<init>(r1, r9)
            throw r0
        L78:
            java.io.IOException r9 = new java.io.IOException
            java.lang.String r0 = "Invalid position"
            r9.<init>(r0)
            throw r9
    }

    private boolean tryReadHeader() throws java.io.IOException {
            r3 = this;
            java.nio.channels.SeekableByteChannel r0 = r3.ciphertextChannel
            java.nio.ByteBuffer r1 = r3.header
            int r1 = r1.position()
            int r2 = r3.firstSegmentOffset
            int r1 = r1 + r2
            long r1 = (long) r1
            r0.position(r1)
            java.nio.channels.SeekableByteChannel r0 = r3.ciphertextChannel
            java.nio.ByteBuffer r1 = r3.header
            r0.read(r1)
            java.nio.ByteBuffer r0 = r3.header
            int r0 = r0.remaining()
            if (r0 <= 0) goto L20
            r0 = 0
            return r0
        L20:
            java.nio.ByteBuffer r0 = r3.header
            r0.flip()
            com.google.crypto.tink.subtle.StreamSegmentDecrypter r0 = r3.decrypter     // Catch: java.security.GeneralSecurityException -> L32
            java.nio.ByteBuffer r1 = r3.header     // Catch: java.security.GeneralSecurityException -> L32
            byte[] r2 = r3.aad     // Catch: java.security.GeneralSecurityException -> L32
            r0.init(r1, r2)     // Catch: java.security.GeneralSecurityException -> L32
            r0 = 1
            r3.headerRead = r0     // Catch: java.security.GeneralSecurityException -> L32
            return r0
        L32:
            r0 = move-exception
            java.io.IOException r1 = new java.io.IOException
            r1.<init>(r0)
            throw r1
    }

    @Override // java.nio.channels.Channel, java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() throws java.io.IOException {
            r1 = this;
            monitor-enter(r1)
            java.nio.channels.SeekableByteChannel r0 = r1.ciphertextChannel     // Catch: java.lang.Throwable -> Lb
            r0.close()     // Catch: java.lang.Throwable -> Lb
            r0 = 0
            r1.isopen = r0     // Catch: java.lang.Throwable -> Lb
            monitor-exit(r1)
            return
        Lb:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> Lb
            throw r0
    }

    @Override // java.nio.channels.Channel
    public synchronized boolean isOpen() {
            r1 = this;
            monitor-enter(r1)
            boolean r0 = r1.isopen     // Catch: java.lang.Throwable -> L5
            monitor-exit(r1)
            return r0
        L5:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L5
            throw r0
    }

    @Override // java.nio.channels.SeekableByteChannel
    public synchronized long position() {
            r2 = this;
            monitor-enter(r2)
            long r0 = r2.plaintextPosition     // Catch: java.lang.Throwable -> L5
            monitor-exit(r2)
            return r0
        L5:
            r0 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L5
            throw r0
    }

    @Override // java.nio.channels.SeekableByteChannel
    public synchronized java.nio.channels.SeekableByteChannel position(long r1) {
            r0 = this;
            monitor-enter(r0)
            r0.plaintextPosition = r1     // Catch: java.lang.Throwable -> L5
            monitor-exit(r0)
            return r0
        L5:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L5
            throw r1
    }

    @Override // java.nio.channels.SeekableByteChannel, java.nio.channels.ReadableByteChannel
    public synchronized int read(java.nio.ByteBuffer r7) throws java.io.IOException {
            r6 = this;
            monitor-enter(r6)
            boolean r0 = r6.isopen     // Catch: java.lang.Throwable -> La0
            if (r0 == 0) goto L9a
            boolean r0 = r6.headerRead     // Catch: java.lang.Throwable -> La0
            if (r0 != 0) goto L12
            boolean r0 = r6.tryReadHeader()     // Catch: java.lang.Throwable -> La0
            if (r0 != 0) goto L12
            monitor-exit(r6)
            r7 = 0
            return r7
        L12:
            int r0 = r7.position()     // Catch: java.lang.Throwable -> La0
        L16:
            int r1 = r7.remaining()     // Catch: java.lang.Throwable -> La0
            if (r1 <= 0) goto L88
            long r1 = r6.plaintextPosition     // Catch: java.lang.Throwable -> La0
            long r3 = r6.plaintextSize     // Catch: java.lang.Throwable -> La0
            int r3 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r3 >= 0) goto L88
            int r1 = r6.getSegmentNr(r1)     // Catch: java.lang.Throwable -> La0
            if (r1 != 0) goto L2e
            long r2 = r6.plaintextPosition     // Catch: java.lang.Throwable -> La0
        L2c:
            int r2 = (int) r2     // Catch: java.lang.Throwable -> La0
            goto L39
        L2e:
            long r2 = r6.plaintextPosition     // Catch: java.lang.Throwable -> La0
            int r4 = r6.ciphertextOffset     // Catch: java.lang.Throwable -> La0
            long r4 = (long) r4     // Catch: java.lang.Throwable -> La0
            long r2 = r2 + r4
            int r4 = r6.plaintextSegmentSize     // Catch: java.lang.Throwable -> La0
            long r4 = (long) r4     // Catch: java.lang.Throwable -> La0
            long r2 = r2 % r4
            goto L2c
        L39:
            boolean r1 = r6.tryLoadSegment(r1)     // Catch: java.lang.Throwable -> La0
            if (r1 == 0) goto L88
            java.nio.ByteBuffer r1 = r6.plaintextSegment     // Catch: java.lang.Throwable -> La0
            r1.position(r2)     // Catch: java.lang.Throwable -> La0
            java.nio.ByteBuffer r1 = r6.plaintextSegment     // Catch: java.lang.Throwable -> La0
            int r1 = r1.remaining()     // Catch: java.lang.Throwable -> La0
            int r2 = r7.remaining()     // Catch: java.lang.Throwable -> La0
            if (r1 > r2) goto L62
            long r1 = r6.plaintextPosition     // Catch: java.lang.Throwable -> La0
            java.nio.ByteBuffer r3 = r6.plaintextSegment     // Catch: java.lang.Throwable -> La0
            int r3 = r3.remaining()     // Catch: java.lang.Throwable -> La0
            long r3 = (long) r3     // Catch: java.lang.Throwable -> La0
            long r1 = r1 + r3
            r6.plaintextPosition = r1     // Catch: java.lang.Throwable -> La0
            java.nio.ByteBuffer r1 = r6.plaintextSegment     // Catch: java.lang.Throwable -> La0
            r7.put(r1)     // Catch: java.lang.Throwable -> La0
            goto L16
        L62:
            int r1 = r7.remaining()     // Catch: java.lang.Throwable -> La0
            java.nio.ByteBuffer r2 = r6.plaintextSegment     // Catch: java.lang.Throwable -> La0
            java.nio.ByteBuffer r2 = r2.duplicate()     // Catch: java.lang.Throwable -> La0
            int r3 = r2.position()     // Catch: java.lang.Throwable -> La0
            int r3 = r3 + r1
            r2.limit(r3)     // Catch: java.lang.Throwable -> La0
            r7.put(r2)     // Catch: java.lang.Throwable -> La0
            long r2 = r6.plaintextPosition     // Catch: java.lang.Throwable -> La0
            long r4 = (long) r1     // Catch: java.lang.Throwable -> La0
            long r2 = r2 + r4
            r6.plaintextPosition = r2     // Catch: java.lang.Throwable -> La0
            java.nio.ByteBuffer r2 = r6.plaintextSegment     // Catch: java.lang.Throwable -> La0
            int r3 = r2.position()     // Catch: java.lang.Throwable -> La0
            int r3 = r3 + r1
            r2.position(r3)     // Catch: java.lang.Throwable -> La0
            goto L16
        L88:
            int r7 = r7.position()     // Catch: java.lang.Throwable -> La0
            int r7 = r7 - r0
            if (r7 != 0) goto L98
            boolean r0 = r6.reachedEnd()     // Catch: java.lang.Throwable -> La0
            if (r0 == 0) goto L98
            monitor-exit(r6)
            r7 = -1
            return r7
        L98:
            monitor-exit(r6)
            return r7
        L9a:
            java.nio.channels.ClosedChannelException r7 = new java.nio.channels.ClosedChannelException     // Catch: java.lang.Throwable -> La0
            r7.<init>()     // Catch: java.lang.Throwable -> La0
            throw r7     // Catch: java.lang.Throwable -> La0
        La0:
            r7 = move-exception
            monitor-exit(r6)     // Catch: java.lang.Throwable -> La0
            throw r7
    }

    public synchronized int read(java.nio.ByteBuffer r3, long r4) throws java.io.IOException {
            r2 = this;
            monitor-enter(r2)
            long r0 = r2.position()     // Catch: java.lang.Throwable -> L16
            r2.position(r4)     // Catch: java.lang.Throwable -> L11
            int r3 = r2.read(r3)     // Catch: java.lang.Throwable -> L11
            r2.position(r0)     // Catch: java.lang.Throwable -> L16
            monitor-exit(r2)
            return r3
        L11:
            r3 = move-exception
            r2.position(r0)     // Catch: java.lang.Throwable -> L16
            throw r3     // Catch: java.lang.Throwable -> L16
        L16:
            r3 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L16
            throw r3
    }

    @Override // java.nio.channels.SeekableByteChannel
    public long size() {
            r2 = this;
            long r0 = r2.plaintextSize
            return r0
    }

    public synchronized java.lang.String toString() {
            r8 = this;
            java.lang.String r0 = "\nplaintextSegment position:"
            java.lang.String r1 = "\nciphertextSgement position:"
            java.lang.String r2 = "\nHeader position:"
            java.lang.String r3 = "position:"
            java.lang.String r4 = "StreamingAeadSeekableDecryptingChannel\nciphertextChannel"
            monitor-enter(r8)
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Le9
            r5.<init>(r4)     // Catch: java.lang.Throwable -> Le9
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.io.IOException -> L24 java.lang.Throwable -> Le9
            r4.<init>(r3)     // Catch: java.io.IOException -> L24 java.lang.Throwable -> Le9
            java.nio.channels.SeekableByteChannel r3 = r8.ciphertextChannel     // Catch: java.io.IOException -> L24 java.lang.Throwable -> Le9
            long r6 = r3.position()     // Catch: java.io.IOException -> L24 java.lang.Throwable -> Le9
            java.lang.StringBuilder r3 = r4.append(r6)     // Catch: java.io.IOException -> L24 java.lang.Throwable -> Le9
            java.lang.String r3 = r3.toString()     // Catch: java.io.IOException -> L24 java.lang.Throwable -> Le9
            goto L26
        L24:
            java.lang.String r3 = "position: n/a"
        L26:
            java.lang.StringBuilder r3 = r5.append(r3)     // Catch: java.lang.Throwable -> Le9
            java.lang.String r4 = "\nciphertextChannelSize:"
            java.lang.StringBuilder r3 = r3.append(r4)     // Catch: java.lang.Throwable -> Le9
            long r6 = r8.ciphertextChannelSize     // Catch: java.lang.Throwable -> Le9
            java.lang.StringBuilder r3 = r3.append(r6)     // Catch: java.lang.Throwable -> Le9
            java.lang.String r4 = "\nplaintextSize:"
            java.lang.StringBuilder r3 = r3.append(r4)     // Catch: java.lang.Throwable -> Le9
            long r6 = r8.plaintextSize     // Catch: java.lang.Throwable -> Le9
            java.lang.StringBuilder r3 = r3.append(r6)     // Catch: java.lang.Throwable -> Le9
            java.lang.String r4 = "\nciphertextSegmentSize:"
            java.lang.StringBuilder r3 = r3.append(r4)     // Catch: java.lang.Throwable -> Le9
            int r4 = r8.ciphertextSegmentSize     // Catch: java.lang.Throwable -> Le9
            java.lang.StringBuilder r3 = r3.append(r4)     // Catch: java.lang.Throwable -> Le9
            java.lang.String r4 = "\nnumberOfSegments:"
            java.lang.StringBuilder r3 = r3.append(r4)     // Catch: java.lang.Throwable -> Le9
            int r4 = r8.numberOfSegments     // Catch: java.lang.Throwable -> Le9
            java.lang.StringBuilder r3 = r3.append(r4)     // Catch: java.lang.Throwable -> Le9
            java.lang.String r4 = "\nheaderRead:"
            java.lang.StringBuilder r3 = r3.append(r4)     // Catch: java.lang.Throwable -> Le9
            boolean r4 = r8.headerRead     // Catch: java.lang.Throwable -> Le9
            java.lang.StringBuilder r3 = r3.append(r4)     // Catch: java.lang.Throwable -> Le9
            java.lang.String r4 = "\nplaintextPosition:"
            java.lang.StringBuilder r3 = r3.append(r4)     // Catch: java.lang.Throwable -> Le9
            long r6 = r8.plaintextPosition     // Catch: java.lang.Throwable -> Le9
            java.lang.StringBuilder r3 = r3.append(r6)     // Catch: java.lang.Throwable -> Le9
            java.lang.StringBuilder r2 = r3.append(r2)     // Catch: java.lang.Throwable -> Le9
            java.nio.ByteBuffer r3 = r8.header     // Catch: java.lang.Throwable -> Le9
            int r3 = r3.position()     // Catch: java.lang.Throwable -> Le9
            java.lang.StringBuilder r2 = r2.append(r3)     // Catch: java.lang.Throwable -> Le9
            java.lang.String r3 = " limit:"
            java.lang.StringBuilder r2 = r2.append(r3)     // Catch: java.lang.Throwable -> Le9
            java.nio.ByteBuffer r3 = r8.header     // Catch: java.lang.Throwable -> Le9
            int r3 = r3.position()     // Catch: java.lang.Throwable -> Le9
            java.lang.StringBuilder r2 = r2.append(r3)     // Catch: java.lang.Throwable -> Le9
            java.lang.String r3 = "\ncurrentSegmentNr:"
            java.lang.StringBuilder r2 = r2.append(r3)     // Catch: java.lang.Throwable -> Le9
            int r3 = r8.currentSegmentNr     // Catch: java.lang.Throwable -> Le9
            java.lang.StringBuilder r2 = r2.append(r3)     // Catch: java.lang.Throwable -> Le9
            java.lang.StringBuilder r1 = r2.append(r1)     // Catch: java.lang.Throwable -> Le9
            java.nio.ByteBuffer r2 = r8.ciphertextSegment     // Catch: java.lang.Throwable -> Le9
            int r2 = r2.position()     // Catch: java.lang.Throwable -> Le9
            java.lang.StringBuilder r1 = r1.append(r2)     // Catch: java.lang.Throwable -> Le9
            java.lang.String r2 = " limit:"
            java.lang.StringBuilder r1 = r1.append(r2)     // Catch: java.lang.Throwable -> Le9
            java.nio.ByteBuffer r2 = r8.ciphertextSegment     // Catch: java.lang.Throwable -> Le9
            int r2 = r2.limit()     // Catch: java.lang.Throwable -> Le9
            java.lang.StringBuilder r1 = r1.append(r2)     // Catch: java.lang.Throwable -> Le9
            java.lang.String r2 = "\nisCurrentSegmentDecrypted:"
            java.lang.StringBuilder r1 = r1.append(r2)     // Catch: java.lang.Throwable -> Le9
            boolean r2 = r8.isCurrentSegmentDecrypted     // Catch: java.lang.Throwable -> Le9
            java.lang.StringBuilder r1 = r1.append(r2)     // Catch: java.lang.Throwable -> Le9
            java.lang.StringBuilder r0 = r1.append(r0)     // Catch: java.lang.Throwable -> Le9
            java.nio.ByteBuffer r1 = r8.plaintextSegment     // Catch: java.lang.Throwable -> Le9
            int r1 = r1.position()     // Catch: java.lang.Throwable -> Le9
            java.lang.StringBuilder r0 = r0.append(r1)     // Catch: java.lang.Throwable -> Le9
            java.lang.String r1 = " limit:"
            java.lang.StringBuilder r0 = r0.append(r1)     // Catch: java.lang.Throwable -> Le9
            java.nio.ByteBuffer r1 = r8.plaintextSegment     // Catch: java.lang.Throwable -> Le9
            int r1 = r1.limit()     // Catch: java.lang.Throwable -> Le9
            r0.append(r1)     // Catch: java.lang.Throwable -> Le9
            java.lang.String r0 = r5.toString()     // Catch: java.lang.Throwable -> Le9
            monitor-exit(r8)
            return r0
        Le9:
            r0 = move-exception
            monitor-exit(r8)     // Catch: java.lang.Throwable -> Le9
            throw r0
    }

    @Override // java.nio.channels.SeekableByteChannel
    public java.nio.channels.SeekableByteChannel truncate(long r1) throws java.nio.channels.NonWritableChannelException {
            r0 = this;
            java.nio.channels.NonWritableChannelException r1 = new java.nio.channels.NonWritableChannelException
            r1.<init>()
            throw r1
    }

    public synchronized long verifiedSize() throws java.io.IOException {
            r2 = this;
            monitor-enter(r2)
            int r0 = r2.numberOfSegments     // Catch: java.lang.Throwable -> L17
            int r0 = r0 + (-1)
            boolean r0 = r2.tryLoadSegment(r0)     // Catch: java.lang.Throwable -> L17
            if (r0 == 0) goto Lf
            long r0 = r2.plaintextSize     // Catch: java.lang.Throwable -> L17
            monitor-exit(r2)
            return r0
        Lf:
            java.io.IOException r0 = new java.io.IOException     // Catch: java.lang.Throwable -> L17
            java.lang.String r1 = "could not verify the size"
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L17
            throw r0     // Catch: java.lang.Throwable -> L17
        L17:
            r0 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L17
            throw r0
    }

    @Override // java.nio.channels.SeekableByteChannel, java.nio.channels.WritableByteChannel
    public int write(java.nio.ByteBuffer r1) throws java.nio.channels.NonWritableChannelException {
            r0 = this;
            java.nio.channels.NonWritableChannelException r1 = new java.nio.channels.NonWritableChannelException
            r1.<init>()
            throw r1
    }
}
