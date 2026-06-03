package com.google.crypto.tink.subtle;

/* JADX INFO: loaded from: classes2.dex */
public final class AesGcmHkdfStreaming extends com.google.crypto.tink.subtle.NonceBasedStreamingAead {
    private static final int NONCE_PREFIX_IN_BYTES = 7;
    private static final int NONCE_SIZE_IN_BYTES = 12;
    private static final int TAG_SIZE_IN_BYTES = 16;
    private final int ciphertextSegmentSize;
    private final int firstSegmentOffset;
    private final java.lang.String hkdfAlg;
    private final byte[] ikm;
    private final int keySizeInBytes;
    private final int plaintextSegmentSize;

    class AesGcmHkdfStreamDecrypter implements com.google.crypto.tink.subtle.StreamSegmentDecrypter {
        private javax.crypto.Cipher cipher;
        private javax.crypto.spec.SecretKeySpec keySpec;
        private byte[] noncePrefix;
        final /* synthetic */ com.google.crypto.tink.subtle.AesGcmHkdfStreaming this$0;

        AesGcmHkdfStreamDecrypter(com.google.crypto.tink.subtle.AesGcmHkdfStreaming r1) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                return
        }

        @Override // com.google.crypto.tink.subtle.StreamSegmentDecrypter
        public synchronized void decryptSegment(java.nio.ByteBuffer r4, int r5, boolean r6, java.nio.ByteBuffer r7) throws java.security.GeneralSecurityException {
                r3 = this;
                monitor-enter(r3)
                byte[] r0 = r3.noncePrefix     // Catch: java.lang.Throwable -> L17
                long r1 = (long) r5     // Catch: java.lang.Throwable -> L17
                javax.crypto.spec.GCMParameterSpec r5 = com.google.crypto.tink.subtle.AesGcmHkdfStreaming.access$400(r0, r1, r6)     // Catch: java.lang.Throwable -> L17
                javax.crypto.Cipher r6 = r3.cipher     // Catch: java.lang.Throwable -> L17
                javax.crypto.spec.SecretKeySpec r0 = r3.keySpec     // Catch: java.lang.Throwable -> L17
                r1 = 2
                r6.init(r1, r0, r5)     // Catch: java.lang.Throwable -> L17
                javax.crypto.Cipher r5 = r3.cipher     // Catch: java.lang.Throwable -> L17
                r5.doFinal(r4, r7)     // Catch: java.lang.Throwable -> L17
                monitor-exit(r3)
                return
            L17:
                r4 = move-exception
                monitor-exit(r3)     // Catch: java.lang.Throwable -> L17
                throw r4
        }

        @Override // com.google.crypto.tink.subtle.StreamSegmentDecrypter
        public synchronized void init(java.nio.ByteBuffer r3, byte[] r4) throws java.security.GeneralSecurityException {
                r2 = this;
                monitor-enter(r2)
                int r0 = r3.remaining()     // Catch: java.lang.Throwable -> L4e
                com.google.crypto.tink.subtle.AesGcmHkdfStreaming r1 = r2.this$0     // Catch: java.lang.Throwable -> L4e
                int r1 = r1.getHeaderLength()     // Catch: java.lang.Throwable -> L4e
                if (r0 != r1) goto L46
                byte r0 = r3.get()     // Catch: java.lang.Throwable -> L4e
                com.google.crypto.tink.subtle.AesGcmHkdfStreaming r1 = r2.this$0     // Catch: java.lang.Throwable -> L4e
                int r1 = r1.getHeaderLength()     // Catch: java.lang.Throwable -> L4e
                if (r0 != r1) goto L3e
                r0 = 7
                byte[] r0 = new byte[r0]     // Catch: java.lang.Throwable -> L4e
                r2.noncePrefix = r0     // Catch: java.lang.Throwable -> L4e
                com.google.crypto.tink.subtle.AesGcmHkdfStreaming r0 = r2.this$0     // Catch: java.lang.Throwable -> L4e
                int r0 = com.google.crypto.tink.subtle.AesGcmHkdfStreaming.access$500(r0)     // Catch: java.lang.Throwable -> L4e
                byte[] r0 = new byte[r0]     // Catch: java.lang.Throwable -> L4e
                r3.get(r0)     // Catch: java.lang.Throwable -> L4e
                byte[] r1 = r2.noncePrefix     // Catch: java.lang.Throwable -> L4e
                r3.get(r1)     // Catch: java.lang.Throwable -> L4e
                com.google.crypto.tink.subtle.AesGcmHkdfStreaming r3 = r2.this$0     // Catch: java.lang.Throwable -> L4e
                javax.crypto.spec.SecretKeySpec r3 = com.google.crypto.tink.subtle.AesGcmHkdfStreaming.access$300(r3, r0, r4)     // Catch: java.lang.Throwable -> L4e
                r2.keySpec = r3     // Catch: java.lang.Throwable -> L4e
                javax.crypto.Cipher r3 = com.google.crypto.tink.subtle.AesGcmHkdfStreaming.access$000()     // Catch: java.lang.Throwable -> L4e
                r2.cipher = r3     // Catch: java.lang.Throwable -> L4e
                monitor-exit(r2)
                return
            L3e:
                java.security.GeneralSecurityException r3 = new java.security.GeneralSecurityException     // Catch: java.lang.Throwable -> L4e
                java.lang.String r4 = "Invalid ciphertext"
                r3.<init>(r4)     // Catch: java.lang.Throwable -> L4e
                throw r3     // Catch: java.lang.Throwable -> L4e
            L46:
                java.security.InvalidAlgorithmParameterException r3 = new java.security.InvalidAlgorithmParameterException     // Catch: java.lang.Throwable -> L4e
                java.lang.String r4 = "Invalid header length"
                r3.<init>(r4)     // Catch: java.lang.Throwable -> L4e
                throw r3     // Catch: java.lang.Throwable -> L4e
            L4e:
                r3 = move-exception
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L4e
                throw r3
        }
    }

    class AesGcmHkdfStreamEncrypter implements com.google.crypto.tink.subtle.StreamSegmentEncrypter {
        private final javax.crypto.Cipher cipher;
        private long encryptedSegments;
        private final java.nio.ByteBuffer header;
        private final javax.crypto.spec.SecretKeySpec keySpec;
        private final byte[] noncePrefix;
        final /* synthetic */ com.google.crypto.tink.subtle.AesGcmHkdfStreaming this$0;

        public AesGcmHkdfStreamEncrypter(com.google.crypto.tink.subtle.AesGcmHkdfStreaming r5, byte[] r6) throws java.security.GeneralSecurityException {
                r4 = this;
                r4.this$0 = r5
                r4.<init>()
                r0 = 0
                r4.encryptedSegments = r0
                javax.crypto.Cipher r2 = com.google.crypto.tink.subtle.AesGcmHkdfStreaming.access$000()
                r4.cipher = r2
                r4.encryptedSegments = r0
                byte[] r0 = com.google.crypto.tink.subtle.AesGcmHkdfStreaming.access$100(r5)
                byte[] r1 = com.google.crypto.tink.subtle.AesGcmHkdfStreaming.access$200()
                r4.noncePrefix = r1
                int r2 = r5.getHeaderLength()
                java.nio.ByteBuffer r2 = java.nio.ByteBuffer.allocate(r2)
                r4.header = r2
                int r3 = r5.getHeaderLength()
                byte r3 = (byte) r3
                r2.put(r3)
                r2.put(r0)
                r2.put(r1)
                r2.flip()
                javax.crypto.spec.SecretKeySpec r5 = com.google.crypto.tink.subtle.AesGcmHkdfStreaming.access$300(r5, r0, r6)
                r4.keySpec = r5
                return
        }

        @Override // com.google.crypto.tink.subtle.StreamSegmentEncrypter
        public synchronized void encryptSegment(java.nio.ByteBuffer r6, java.nio.ByteBuffer r7, boolean r8, java.nio.ByteBuffer r9) throws java.security.GeneralSecurityException {
                r5 = this;
                monitor-enter(r5)
                javax.crypto.Cipher r0 = r5.cipher     // Catch: java.lang.Throwable -> L30
                javax.crypto.spec.SecretKeySpec r1 = r5.keySpec     // Catch: java.lang.Throwable -> L30
                byte[] r2 = r5.noncePrefix     // Catch: java.lang.Throwable -> L30
                long r3 = r5.encryptedSegments     // Catch: java.lang.Throwable -> L30
                javax.crypto.spec.GCMParameterSpec r8 = com.google.crypto.tink.subtle.AesGcmHkdfStreaming.access$400(r2, r3, r8)     // Catch: java.lang.Throwable -> L30
                r2 = 1
                r0.init(r2, r1, r8)     // Catch: java.lang.Throwable -> L30
                long r0 = r5.encryptedSegments     // Catch: java.lang.Throwable -> L30
                r2 = 1
                long r0 = r0 + r2
                r5.encryptedSegments = r0     // Catch: java.lang.Throwable -> L30
                boolean r8 = r7.hasRemaining()     // Catch: java.lang.Throwable -> L30
                if (r8 == 0) goto L29
                javax.crypto.Cipher r8 = r5.cipher     // Catch: java.lang.Throwable -> L30
                r8.update(r6, r9)     // Catch: java.lang.Throwable -> L30
                javax.crypto.Cipher r6 = r5.cipher     // Catch: java.lang.Throwable -> L30
                r6.doFinal(r7, r9)     // Catch: java.lang.Throwable -> L30
                goto L2e
            L29:
                javax.crypto.Cipher r7 = r5.cipher     // Catch: java.lang.Throwable -> L30
                r7.doFinal(r6, r9)     // Catch: java.lang.Throwable -> L30
            L2e:
                monitor-exit(r5)
                return
            L30:
                r6 = move-exception
                monitor-exit(r5)     // Catch: java.lang.Throwable -> L30
                throw r6
        }

        @Override // com.google.crypto.tink.subtle.StreamSegmentEncrypter
        public synchronized void encryptSegment(java.nio.ByteBuffer r6, boolean r7, java.nio.ByteBuffer r8) throws java.security.GeneralSecurityException {
                r5 = this;
                monitor-enter(r5)
                javax.crypto.Cipher r0 = r5.cipher     // Catch: java.lang.Throwable -> L1f
                javax.crypto.spec.SecretKeySpec r1 = r5.keySpec     // Catch: java.lang.Throwable -> L1f
                byte[] r2 = r5.noncePrefix     // Catch: java.lang.Throwable -> L1f
                long r3 = r5.encryptedSegments     // Catch: java.lang.Throwable -> L1f
                javax.crypto.spec.GCMParameterSpec r7 = com.google.crypto.tink.subtle.AesGcmHkdfStreaming.access$400(r2, r3, r7)     // Catch: java.lang.Throwable -> L1f
                r2 = 1
                r0.init(r2, r1, r7)     // Catch: java.lang.Throwable -> L1f
                long r0 = r5.encryptedSegments     // Catch: java.lang.Throwable -> L1f
                r2 = 1
                long r0 = r0 + r2
                r5.encryptedSegments = r0     // Catch: java.lang.Throwable -> L1f
                javax.crypto.Cipher r7 = r5.cipher     // Catch: java.lang.Throwable -> L1f
                r7.doFinal(r6, r8)     // Catch: java.lang.Throwable -> L1f
                monitor-exit(r5)
                return
            L1f:
                r6 = move-exception
                monitor-exit(r5)     // Catch: java.lang.Throwable -> L1f
                throw r6
        }

        @Override // com.google.crypto.tink.subtle.StreamSegmentEncrypter
        public java.nio.ByteBuffer getHeader() {
                r1 = this;
                java.nio.ByteBuffer r0 = r1.header
                java.nio.ByteBuffer r0 = r0.asReadOnlyBuffer()
                return r0
        }
    }

    public AesGcmHkdfStreaming(byte[] r3, java.lang.String r4, int r5, int r6, int r7) throws java.security.InvalidAlgorithmParameterException {
            r2 = this;
            r2.<init>()
            int r0 = r3.length
            r1 = 16
            if (r0 < r1) goto L31
            int r0 = r3.length
            if (r0 < r5) goto L31
            com.google.crypto.tink.subtle.Validators.validateAesKeySize(r5)
            int r0 = r2.getHeaderLength()
            int r0 = r0 + r7
            int r0 = r0 + r1
            if (r6 <= r0) goto L29
            int r0 = r3.length
            byte[] r3 = java.util.Arrays.copyOf(r3, r0)
            r2.ikm = r3
            r2.hkdfAlg = r4
            r2.keySizeInBytes = r5
            r2.ciphertextSegmentSize = r6
            r2.firstSegmentOffset = r7
            int r6 = r6 - r1
            r2.plaintextSegmentSize = r6
            return
        L29:
            java.security.InvalidAlgorithmParameterException r3 = new java.security.InvalidAlgorithmParameterException
            java.lang.String r4 = "ciphertextSegmentSize too small"
            r3.<init>(r4)
            throw r3
        L31:
            java.security.InvalidAlgorithmParameterException r3 = new java.security.InvalidAlgorithmParameterException
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r6 = "ikm too short, must be >= "
            r4.<init>(r6)
            int r5 = java.lang.Math.max(r1, r5)
            java.lang.StringBuilder r4 = r4.append(r5)
            java.lang.String r4 = r4.toString()
            r3.<init>(r4)
            throw r3
    }

    static /* synthetic */ javax.crypto.Cipher access$000() throws java.security.GeneralSecurityException {
            javax.crypto.Cipher r0 = cipherInstance()
            return r0
    }

    static /* synthetic */ byte[] access$100(com.google.crypto.tink.subtle.AesGcmHkdfStreaming r0) {
            byte[] r0 = r0.randomSalt()
            return r0
    }

    static /* synthetic */ byte[] access$200() {
            byte[] r0 = randomNonce()
            return r0
    }

    static /* synthetic */ javax.crypto.spec.SecretKeySpec access$300(com.google.crypto.tink.subtle.AesGcmHkdfStreaming r0, byte[] r1, byte[] r2) throws java.security.GeneralSecurityException {
            javax.crypto.spec.SecretKeySpec r0 = r0.deriveKeySpec(r1, r2)
            return r0
    }

    static /* synthetic */ javax.crypto.spec.GCMParameterSpec access$400(byte[] r0, long r1, boolean r3) throws java.security.GeneralSecurityException {
            javax.crypto.spec.GCMParameterSpec r0 = paramsForSegment(r0, r1, r3)
            return r0
    }

    static /* synthetic */ int access$500(com.google.crypto.tink.subtle.AesGcmHkdfStreaming r0) {
            int r0 = r0.keySizeInBytes
            return r0
    }

    private static javax.crypto.Cipher cipherInstance() throws java.security.GeneralSecurityException {
            com.google.crypto.tink.subtle.EngineFactory<com.google.crypto.tink.subtle.EngineWrapper$TCipher, javax.crypto.Cipher> r0 = com.google.crypto.tink.subtle.EngineFactory.CIPHER
            java.lang.String r1 = "AES/GCM/NoPadding"
            java.lang.Object r0 = r0.getInstance(r1)
            javax.crypto.Cipher r0 = (javax.crypto.Cipher) r0
            return r0
    }

    private javax.crypto.spec.SecretKeySpec deriveKeySpec(byte[] r4, byte[] r5) throws java.security.GeneralSecurityException {
            r3 = this;
            java.lang.String r0 = r3.hkdfAlg
            byte[] r1 = r3.ikm
            int r2 = r3.keySizeInBytes
            byte[] r4 = com.google.crypto.tink.subtle.Hkdf.computeHkdf(r0, r1, r4, r5, r2)
            javax.crypto.spec.SecretKeySpec r5 = new javax.crypto.spec.SecretKeySpec
            java.lang.String r0 = "AES"
            r5.<init>(r4, r0)
            return r5
    }

    private static javax.crypto.spec.GCMParameterSpec paramsForSegment(byte[] r2, long r3, boolean r5) throws java.security.GeneralSecurityException {
            r0 = 12
            java.nio.ByteBuffer r0 = java.nio.ByteBuffer.allocate(r0)
            java.nio.ByteOrder r1 = java.nio.ByteOrder.BIG_ENDIAN
            r0.order(r1)
            r0.put(r2)
            com.google.crypto.tink.subtle.SubtleUtil.putAsUnsigedInt(r0, r3)
            byte r2 = (byte) r5
            r0.put(r2)
            javax.crypto.spec.GCMParameterSpec r2 = new javax.crypto.spec.GCMParameterSpec
            r3 = 128(0x80, float:1.8E-43)
            byte[] r4 = r0.array()
            r2.<init>(r3, r4)
            return r2
    }

    private static byte[] randomNonce() {
            r0 = 7
            byte[] r0 = com.google.crypto.tink.subtle.Random.randBytes(r0)
            return r0
    }

    private byte[] randomSalt() {
            r1 = this;
            int r0 = r1.keySizeInBytes
            byte[] r0 = com.google.crypto.tink.subtle.Random.randBytes(r0)
            return r0
    }

    public long expectedCiphertextSize(long r6) {
            r5 = this;
            int r0 = r5.getCiphertextOffset()
            long r0 = (long) r0
            long r6 = r6 + r0
            int r0 = r5.plaintextSegmentSize
            long r1 = (long) r0
            long r1 = r6 / r1
            int r3 = r5.ciphertextSegmentSize
            long r3 = (long) r3
            long r1 = r1 * r3
            long r3 = (long) r0
            long r6 = r6 % r3
            r3 = 0
            int r0 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
            if (r0 <= 0) goto L1b
            r3 = 16
            long r6 = r6 + r3
            long r1 = r1 + r6
        L1b:
            return r1
    }

    @Override // com.google.crypto.tink.subtle.NonceBasedStreamingAead
    public int getCiphertextOffset() {
            r2 = this;
            int r0 = r2.getHeaderLength()
            int r1 = r2.firstSegmentOffset
            int r0 = r0 + r1
            return r0
    }

    @Override // com.google.crypto.tink.subtle.NonceBasedStreamingAead
    public int getCiphertextOverhead() {
            r1 = this;
            r0 = 16
            return r0
    }

    @Override // com.google.crypto.tink.subtle.NonceBasedStreamingAead
    public int getCiphertextSegmentSize() {
            r1 = this;
            int r0 = r1.ciphertextSegmentSize
            return r0
    }

    public int getFirstSegmentOffset() {
            r1 = this;
            int r0 = r1.firstSegmentOffset
            return r0
    }

    @Override // com.google.crypto.tink.subtle.NonceBasedStreamingAead
    public int getHeaderLength() {
            r1 = this;
            int r0 = r1.keySizeInBytes
            int r0 = r0 + 8
            return r0
    }

    @Override // com.google.crypto.tink.subtle.NonceBasedStreamingAead
    public int getPlaintextSegmentSize() {
            r1 = this;
            int r0 = r1.plaintextSegmentSize
            return r0
    }

    @Override // com.google.crypto.tink.subtle.NonceBasedStreamingAead, com.google.crypto.tink.StreamingAead
    public /* bridge */ /* synthetic */ java.nio.channels.ReadableByteChannel newDecryptingChannel(java.nio.channels.ReadableByteChannel r1, byte[] r2) throws java.security.GeneralSecurityException, java.io.IOException {
            r0 = this;
            java.nio.channels.ReadableByteChannel r1 = super.newDecryptingChannel(r1, r2)
            return r1
    }

    @Override // com.google.crypto.tink.subtle.NonceBasedStreamingAead, com.google.crypto.tink.StreamingAead
    public /* bridge */ /* synthetic */ java.io.InputStream newDecryptingStream(java.io.InputStream r1, byte[] r2) throws java.security.GeneralSecurityException, java.io.IOException {
            r0 = this;
            java.io.InputStream r1 = super.newDecryptingStream(r1, r2)
            return r1
    }

    @Override // com.google.crypto.tink.subtle.NonceBasedStreamingAead, com.google.crypto.tink.StreamingAead
    public /* bridge */ /* synthetic */ java.nio.channels.WritableByteChannel newEncryptingChannel(java.nio.channels.WritableByteChannel r1, byte[] r2) throws java.security.GeneralSecurityException, java.io.IOException {
            r0 = this;
            java.nio.channels.WritableByteChannel r1 = super.newEncryptingChannel(r1, r2)
            return r1
    }

    @Override // com.google.crypto.tink.subtle.NonceBasedStreamingAead, com.google.crypto.tink.StreamingAead
    public /* bridge */ /* synthetic */ java.io.OutputStream newEncryptingStream(java.io.OutputStream r1, byte[] r2) throws java.security.GeneralSecurityException, java.io.IOException {
            r0 = this;
            java.io.OutputStream r1 = super.newEncryptingStream(r1, r2)
            return r1
    }

    @Override // com.google.crypto.tink.subtle.NonceBasedStreamingAead, com.google.crypto.tink.StreamingAead
    public /* bridge */ /* synthetic */ java.nio.channels.SeekableByteChannel newSeekableDecryptingChannel(java.nio.channels.SeekableByteChannel r1, byte[] r2) throws java.security.GeneralSecurityException, java.io.IOException {
            r0 = this;
            java.nio.channels.SeekableByteChannel r1 = super.newSeekableDecryptingChannel(r1, r2)
            return r1
    }

    @Override // com.google.crypto.tink.subtle.NonceBasedStreamingAead
    public com.google.crypto.tink.subtle.AesGcmHkdfStreaming.AesGcmHkdfStreamDecrypter newStreamSegmentDecrypter() throws java.security.GeneralSecurityException {
            r1 = this;
            com.google.crypto.tink.subtle.AesGcmHkdfStreaming$AesGcmHkdfStreamDecrypter r0 = new com.google.crypto.tink.subtle.AesGcmHkdfStreaming$AesGcmHkdfStreamDecrypter
            r0.<init>(r1)
            return r0
    }

    @Override // com.google.crypto.tink.subtle.NonceBasedStreamingAead
    public /* bridge */ /* synthetic */ com.google.crypto.tink.subtle.StreamSegmentDecrypter newStreamSegmentDecrypter() throws java.security.GeneralSecurityException {
            r1 = this;
            com.google.crypto.tink.subtle.AesGcmHkdfStreaming$AesGcmHkdfStreamDecrypter r0 = r1.newStreamSegmentDecrypter()
            return r0
    }

    @Override // com.google.crypto.tink.subtle.NonceBasedStreamingAead
    public com.google.crypto.tink.subtle.AesGcmHkdfStreaming.AesGcmHkdfStreamEncrypter newStreamSegmentEncrypter(byte[] r2) throws java.security.GeneralSecurityException {
            r1 = this;
            com.google.crypto.tink.subtle.AesGcmHkdfStreaming$AesGcmHkdfStreamEncrypter r0 = new com.google.crypto.tink.subtle.AesGcmHkdfStreaming$AesGcmHkdfStreamEncrypter
            r0.<init>(r1, r2)
            return r0
    }

    @Override // com.google.crypto.tink.subtle.NonceBasedStreamingAead
    public /* bridge */ /* synthetic */ com.google.crypto.tink.subtle.StreamSegmentEncrypter newStreamSegmentEncrypter(byte[] r1) throws java.security.GeneralSecurityException {
            r0 = this;
            com.google.crypto.tink.subtle.AesGcmHkdfStreaming$AesGcmHkdfStreamEncrypter r1 = r0.newStreamSegmentEncrypter(r1)
            return r1
    }
}
