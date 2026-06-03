package com.google.crypto.tink.subtle;

/* JADX INFO: loaded from: classes2.dex */
public final class AesCtrHmacStreaming extends com.google.crypto.tink.subtle.NonceBasedStreamingAead {
    public static final com.google.crypto.tink.config.internal.TinkFipsUtil.AlgorithmFipsCompatibility FIPS = null;
    private static final int HMAC_KEY_SIZE_IN_BYTES = 32;
    private static final int NONCE_PREFIX_IN_BYTES = 7;
    private static final int NONCE_SIZE_IN_BYTES = 16;
    private final int ciphertextSegmentSize;
    private final int firstSegmentOffset;
    private final java.lang.String hkdfAlgo;
    private final byte[] ikm;
    private final int keySizeInBytes;
    private final int plaintextSegmentSize;
    private final java.lang.String tagAlgo;
    private final int tagSizeInBytes;

    class AesCtrHmacStreamDecrypter implements com.google.crypto.tink.subtle.StreamSegmentDecrypter {
        static final /* synthetic */ boolean $assertionsDisabled = false;
        private javax.crypto.Cipher cipher;
        private javax.crypto.spec.SecretKeySpec hmacKeySpec;
        private javax.crypto.spec.SecretKeySpec keySpec;
        private javax.crypto.Mac mac;
        private byte[] noncePrefix;
        final /* synthetic */ com.google.crypto.tink.subtle.AesCtrHmacStreaming this$0;

        static {
                java.lang.Class<com.google.crypto.tink.subtle.AesCtrHmacStreaming> r0 = com.google.crypto.tink.subtle.AesCtrHmacStreaming.class
                return
        }

        AesCtrHmacStreamDecrypter(com.google.crypto.tink.subtle.AesCtrHmacStreaming r1) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                return
        }

        @Override // com.google.crypto.tink.subtle.StreamSegmentDecrypter
        public synchronized void decryptSegment(java.nio.ByteBuffer r6, int r7, boolean r8, java.nio.ByteBuffer r9) throws java.security.GeneralSecurityException {
                r5 = this;
                monitor-enter(r5)
                int r0 = r6.position()     // Catch: java.lang.Throwable -> L89
                com.google.crypto.tink.subtle.AesCtrHmacStreaming r1 = r5.this$0     // Catch: java.lang.Throwable -> L89
                byte[] r2 = r5.noncePrefix     // Catch: java.lang.Throwable -> L89
                long r3 = (long) r7     // Catch: java.lang.Throwable -> L89
                byte[] r7 = com.google.crypto.tink.subtle.AesCtrHmacStreaming.access$700(r1, r2, r3, r8)     // Catch: java.lang.Throwable -> L89
                int r8 = r6.remaining()     // Catch: java.lang.Throwable -> L89
                com.google.crypto.tink.subtle.AesCtrHmacStreaming r1 = r5.this$0     // Catch: java.lang.Throwable -> L89
                int r1 = com.google.crypto.tink.subtle.AesCtrHmacStreaming.access$800(r1)     // Catch: java.lang.Throwable -> L89
                if (r8 < r1) goto L81
                com.google.crypto.tink.subtle.AesCtrHmacStreaming r1 = r5.this$0     // Catch: java.lang.Throwable -> L89
                int r1 = com.google.crypto.tink.subtle.AesCtrHmacStreaming.access$800(r1)     // Catch: java.lang.Throwable -> L89
                int r8 = r8 - r1
                int r0 = r0 + r8
                java.nio.ByteBuffer r8 = r6.duplicate()     // Catch: java.lang.Throwable -> L89
                r8.limit(r0)     // Catch: java.lang.Throwable -> L89
                java.nio.ByteBuffer r1 = r6.duplicate()     // Catch: java.lang.Throwable -> L89
                r1.position(r0)     // Catch: java.lang.Throwable -> L89
                javax.crypto.Mac r2 = r5.mac     // Catch: java.lang.Throwable -> L89
                javax.crypto.spec.SecretKeySpec r3 = r5.hmacKeySpec     // Catch: java.lang.Throwable -> L89
                r2.init(r3)     // Catch: java.lang.Throwable -> L89
                javax.crypto.Mac r2 = r5.mac     // Catch: java.lang.Throwable -> L89
                r2.update(r7)     // Catch: java.lang.Throwable -> L89
                javax.crypto.Mac r2 = r5.mac     // Catch: java.lang.Throwable -> L89
                r2.update(r8)     // Catch: java.lang.Throwable -> L89
                javax.crypto.Mac r8 = r5.mac     // Catch: java.lang.Throwable -> L89
                byte[] r8 = r8.doFinal()     // Catch: java.lang.Throwable -> L89
                com.google.crypto.tink.subtle.AesCtrHmacStreaming r2 = r5.this$0     // Catch: java.lang.Throwable -> L89
                int r2 = com.google.crypto.tink.subtle.AesCtrHmacStreaming.access$800(r2)     // Catch: java.lang.Throwable -> L89
                byte[] r8 = java.util.Arrays.copyOf(r8, r2)     // Catch: java.lang.Throwable -> L89
                com.google.crypto.tink.subtle.AesCtrHmacStreaming r2 = r5.this$0     // Catch: java.lang.Throwable -> L89
                int r2 = com.google.crypto.tink.subtle.AesCtrHmacStreaming.access$800(r2)     // Catch: java.lang.Throwable -> L89
                byte[] r2 = new byte[r2]     // Catch: java.lang.Throwable -> L89
                r1.get(r2)     // Catch: java.lang.Throwable -> L89
                boolean r8 = com.google.crypto.tink.subtle.Bytes.equal(r2, r8)     // Catch: java.lang.Throwable -> L89
                if (r8 == 0) goto L79
                r6.limit(r0)     // Catch: java.lang.Throwable -> L89
                javax.crypto.Cipher r8 = r5.cipher     // Catch: java.lang.Throwable -> L89
                javax.crypto.spec.SecretKeySpec r0 = r5.keySpec     // Catch: java.lang.Throwable -> L89
                javax.crypto.spec.IvParameterSpec r1 = new javax.crypto.spec.IvParameterSpec     // Catch: java.lang.Throwable -> L89
                r1.<init>(r7)     // Catch: java.lang.Throwable -> L89
                r7 = 1
                r8.init(r7, r0, r1)     // Catch: java.lang.Throwable -> L89
                javax.crypto.Cipher r7 = r5.cipher     // Catch: java.lang.Throwable -> L89
                r7.doFinal(r6, r9)     // Catch: java.lang.Throwable -> L89
                monitor-exit(r5)
                return
            L79:
                java.security.GeneralSecurityException r6 = new java.security.GeneralSecurityException     // Catch: java.lang.Throwable -> L89
                java.lang.String r7 = "Tag mismatch"
                r6.<init>(r7)     // Catch: java.lang.Throwable -> L89
                throw r6     // Catch: java.lang.Throwable -> L89
            L81:
                java.security.GeneralSecurityException r6 = new java.security.GeneralSecurityException     // Catch: java.lang.Throwable -> L89
                java.lang.String r7 = "Ciphertext too short"
                r6.<init>(r7)     // Catch: java.lang.Throwable -> L89
                throw r6     // Catch: java.lang.Throwable -> L89
            L89:
                r6 = move-exception
                monitor-exit(r5)     // Catch: java.lang.Throwable -> L89
                throw r6
        }

        @Override // com.google.crypto.tink.subtle.StreamSegmentDecrypter
        public synchronized void init(java.nio.ByteBuffer r3, byte[] r4) throws java.security.GeneralSecurityException {
                r2 = this;
                monitor-enter(r2)
                int r0 = r3.remaining()     // Catch: java.lang.Throwable -> L64
                com.google.crypto.tink.subtle.AesCtrHmacStreaming r1 = r2.this$0     // Catch: java.lang.Throwable -> L64
                int r1 = r1.getHeaderLength()     // Catch: java.lang.Throwable -> L64
                if (r0 != r1) goto L5c
                byte r0 = r3.get()     // Catch: java.lang.Throwable -> L64
                com.google.crypto.tink.subtle.AesCtrHmacStreaming r1 = r2.this$0     // Catch: java.lang.Throwable -> L64
                int r1 = r1.getHeaderLength()     // Catch: java.lang.Throwable -> L64
                if (r0 != r1) goto L54
                r0 = 7
                byte[] r0 = new byte[r0]     // Catch: java.lang.Throwable -> L64
                r2.noncePrefix = r0     // Catch: java.lang.Throwable -> L64
                com.google.crypto.tink.subtle.AesCtrHmacStreaming r0 = r2.this$0     // Catch: java.lang.Throwable -> L64
                int r0 = com.google.crypto.tink.subtle.AesCtrHmacStreaming.access$900(r0)     // Catch: java.lang.Throwable -> L64
                byte[] r0 = new byte[r0]     // Catch: java.lang.Throwable -> L64
                r3.get(r0)     // Catch: java.lang.Throwable -> L64
                byte[] r1 = r2.noncePrefix     // Catch: java.lang.Throwable -> L64
                r3.get(r1)     // Catch: java.lang.Throwable -> L64
                com.google.crypto.tink.subtle.AesCtrHmacStreaming r3 = r2.this$0     // Catch: java.lang.Throwable -> L64
                byte[] r3 = com.google.crypto.tink.subtle.AesCtrHmacStreaming.access$400(r3, r0, r4)     // Catch: java.lang.Throwable -> L64
                com.google.crypto.tink.subtle.AesCtrHmacStreaming r4 = r2.this$0     // Catch: java.lang.Throwable -> L64
                javax.crypto.spec.SecretKeySpec r4 = com.google.crypto.tink.subtle.AesCtrHmacStreaming.access$500(r4, r3)     // Catch: java.lang.Throwable -> L64
                r2.keySpec = r4     // Catch: java.lang.Throwable -> L64
                com.google.crypto.tink.subtle.AesCtrHmacStreaming r4 = r2.this$0     // Catch: java.lang.Throwable -> L64
                javax.crypto.spec.SecretKeySpec r3 = com.google.crypto.tink.subtle.AesCtrHmacStreaming.access$600(r4, r3)     // Catch: java.lang.Throwable -> L64
                r2.hmacKeySpec = r3     // Catch: java.lang.Throwable -> L64
                javax.crypto.Cipher r3 = com.google.crypto.tink.subtle.AesCtrHmacStreaming.access$000()     // Catch: java.lang.Throwable -> L64
                r2.cipher = r3     // Catch: java.lang.Throwable -> L64
                com.google.crypto.tink.subtle.AesCtrHmacStreaming r3 = r2.this$0     // Catch: java.lang.Throwable -> L64
                javax.crypto.Mac r3 = com.google.crypto.tink.subtle.AesCtrHmacStreaming.access$100(r3)     // Catch: java.lang.Throwable -> L64
                r2.mac = r3     // Catch: java.lang.Throwable -> L64
                monitor-exit(r2)
                return
            L54:
                java.security.GeneralSecurityException r3 = new java.security.GeneralSecurityException     // Catch: java.lang.Throwable -> L64
                java.lang.String r4 = "Invalid ciphertext"
                r3.<init>(r4)     // Catch: java.lang.Throwable -> L64
                throw r3     // Catch: java.lang.Throwable -> L64
            L5c:
                java.security.InvalidAlgorithmParameterException r3 = new java.security.InvalidAlgorithmParameterException     // Catch: java.lang.Throwable -> L64
                java.lang.String r4 = "Invalid header length"
                r3.<init>(r4)     // Catch: java.lang.Throwable -> L64
                throw r3     // Catch: java.lang.Throwable -> L64
            L64:
                r3 = move-exception
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L64
                throw r3
        }
    }

    class AesCtrHmacStreamEncrypter implements com.google.crypto.tink.subtle.StreamSegmentEncrypter {
        private final javax.crypto.Cipher cipher;
        private long encryptedSegments;
        private java.nio.ByteBuffer header;
        private final javax.crypto.spec.SecretKeySpec hmacKeySpec;
        private final javax.crypto.spec.SecretKeySpec keySpec;
        private final javax.crypto.Mac mac;
        private final byte[] noncePrefix;
        final /* synthetic */ com.google.crypto.tink.subtle.AesCtrHmacStreaming this$0;

        public AesCtrHmacStreamEncrypter(com.google.crypto.tink.subtle.AesCtrHmacStreaming r5, byte[] r6) throws java.security.GeneralSecurityException {
                r4 = this;
                r4.this$0 = r5
                r4.<init>()
                r0 = 0
                r4.encryptedSegments = r0
                javax.crypto.Cipher r2 = com.google.crypto.tink.subtle.AesCtrHmacStreaming.access$000()
                r4.cipher = r2
                javax.crypto.Mac r2 = com.google.crypto.tink.subtle.AesCtrHmacStreaming.access$100(r5)
                r4.mac = r2
                r4.encryptedSegments = r0
                byte[] r0 = com.google.crypto.tink.subtle.AesCtrHmacStreaming.access$200(r5)
                byte[] r1 = com.google.crypto.tink.subtle.AesCtrHmacStreaming.access$300(r5)
                r4.noncePrefix = r1
                int r2 = r5.getHeaderLength()
                java.nio.ByteBuffer r2 = java.nio.ByteBuffer.allocate(r2)
                r4.header = r2
                int r3 = r5.getHeaderLength()
                byte r3 = (byte) r3
                r2.put(r3)
                java.nio.ByteBuffer r2 = r4.header
                r2.put(r0)
                java.nio.ByteBuffer r2 = r4.header
                r2.put(r1)
                java.nio.ByteBuffer r1 = r4.header
                r1.flip()
                byte[] r6 = com.google.crypto.tink.subtle.AesCtrHmacStreaming.access$400(r5, r0, r6)
                javax.crypto.spec.SecretKeySpec r0 = com.google.crypto.tink.subtle.AesCtrHmacStreaming.access$500(r5, r6)
                r4.keySpec = r0
                javax.crypto.spec.SecretKeySpec r5 = com.google.crypto.tink.subtle.AesCtrHmacStreaming.access$600(r5, r6)
                r4.hmacKeySpec = r5
                return
        }

        @Override // com.google.crypto.tink.subtle.StreamSegmentEncrypter
        public synchronized void encryptSegment(java.nio.ByteBuffer r6, java.nio.ByteBuffer r7, boolean r8, java.nio.ByteBuffer r9) throws java.security.GeneralSecurityException {
                r5 = this;
                monitor-enter(r5)
                int r0 = r9.position()     // Catch: java.lang.Throwable -> L5a
                com.google.crypto.tink.subtle.AesCtrHmacStreaming r1 = r5.this$0     // Catch: java.lang.Throwable -> L5a
                byte[] r2 = r5.noncePrefix     // Catch: java.lang.Throwable -> L5a
                long r3 = r5.encryptedSegments     // Catch: java.lang.Throwable -> L5a
                byte[] r8 = com.google.crypto.tink.subtle.AesCtrHmacStreaming.access$700(r1, r2, r3, r8)     // Catch: java.lang.Throwable -> L5a
                javax.crypto.Cipher r1 = r5.cipher     // Catch: java.lang.Throwable -> L5a
                javax.crypto.spec.SecretKeySpec r2 = r5.keySpec     // Catch: java.lang.Throwable -> L5a
                javax.crypto.spec.IvParameterSpec r3 = new javax.crypto.spec.IvParameterSpec     // Catch: java.lang.Throwable -> L5a
                r3.<init>(r8)     // Catch: java.lang.Throwable -> L5a
                r4 = 1
                r1.init(r4, r2, r3)     // Catch: java.lang.Throwable -> L5a
                long r1 = r5.encryptedSegments     // Catch: java.lang.Throwable -> L5a
                r3 = 1
                long r1 = r1 + r3
                r5.encryptedSegments = r1     // Catch: java.lang.Throwable -> L5a
                javax.crypto.Cipher r1 = r5.cipher     // Catch: java.lang.Throwable -> L5a
                r1.update(r6, r9)     // Catch: java.lang.Throwable -> L5a
                javax.crypto.Cipher r6 = r5.cipher     // Catch: java.lang.Throwable -> L5a
                r6.doFinal(r7, r9)     // Catch: java.lang.Throwable -> L5a
                java.nio.ByteBuffer r6 = r9.duplicate()     // Catch: java.lang.Throwable -> L5a
                r6.flip()     // Catch: java.lang.Throwable -> L5a
                r6.position(r0)     // Catch: java.lang.Throwable -> L5a
                javax.crypto.Mac r7 = r5.mac     // Catch: java.lang.Throwable -> L5a
                javax.crypto.spec.SecretKeySpec r0 = r5.hmacKeySpec     // Catch: java.lang.Throwable -> L5a
                r7.init(r0)     // Catch: java.lang.Throwable -> L5a
                javax.crypto.Mac r7 = r5.mac     // Catch: java.lang.Throwable -> L5a
                r7.update(r8)     // Catch: java.lang.Throwable -> L5a
                javax.crypto.Mac r7 = r5.mac     // Catch: java.lang.Throwable -> L5a
                r7.update(r6)     // Catch: java.lang.Throwable -> L5a
                javax.crypto.Mac r6 = r5.mac     // Catch: java.lang.Throwable -> L5a
                byte[] r6 = r6.doFinal()     // Catch: java.lang.Throwable -> L5a
                com.google.crypto.tink.subtle.AesCtrHmacStreaming r7 = r5.this$0     // Catch: java.lang.Throwable -> L5a
                int r7 = com.google.crypto.tink.subtle.AesCtrHmacStreaming.access$800(r7)     // Catch: java.lang.Throwable -> L5a
                r8 = 0
                r9.put(r6, r8, r7)     // Catch: java.lang.Throwable -> L5a
                monitor-exit(r5)
                return
            L5a:
                r6 = move-exception
                monitor-exit(r5)     // Catch: java.lang.Throwable -> L5a
                throw r6
        }

        @Override // com.google.crypto.tink.subtle.StreamSegmentEncrypter
        public synchronized void encryptSegment(java.nio.ByteBuffer r6, boolean r7, java.nio.ByteBuffer r8) throws java.security.GeneralSecurityException {
                r5 = this;
                monitor-enter(r5)
                int r0 = r8.position()     // Catch: java.lang.Throwable -> L55
                com.google.crypto.tink.subtle.AesCtrHmacStreaming r1 = r5.this$0     // Catch: java.lang.Throwable -> L55
                byte[] r2 = r5.noncePrefix     // Catch: java.lang.Throwable -> L55
                long r3 = r5.encryptedSegments     // Catch: java.lang.Throwable -> L55
                byte[] r7 = com.google.crypto.tink.subtle.AesCtrHmacStreaming.access$700(r1, r2, r3, r7)     // Catch: java.lang.Throwable -> L55
                javax.crypto.Cipher r1 = r5.cipher     // Catch: java.lang.Throwable -> L55
                javax.crypto.spec.SecretKeySpec r2 = r5.keySpec     // Catch: java.lang.Throwable -> L55
                javax.crypto.spec.IvParameterSpec r3 = new javax.crypto.spec.IvParameterSpec     // Catch: java.lang.Throwable -> L55
                r3.<init>(r7)     // Catch: java.lang.Throwable -> L55
                r4 = 1
                r1.init(r4, r2, r3)     // Catch: java.lang.Throwable -> L55
                long r1 = r5.encryptedSegments     // Catch: java.lang.Throwable -> L55
                r3 = 1
                long r1 = r1 + r3
                r5.encryptedSegments = r1     // Catch: java.lang.Throwable -> L55
                javax.crypto.Cipher r1 = r5.cipher     // Catch: java.lang.Throwable -> L55
                r1.doFinal(r6, r8)     // Catch: java.lang.Throwable -> L55
                java.nio.ByteBuffer r6 = r8.duplicate()     // Catch: java.lang.Throwable -> L55
                r6.flip()     // Catch: java.lang.Throwable -> L55
                r6.position(r0)     // Catch: java.lang.Throwable -> L55
                javax.crypto.Mac r0 = r5.mac     // Catch: java.lang.Throwable -> L55
                javax.crypto.spec.SecretKeySpec r1 = r5.hmacKeySpec     // Catch: java.lang.Throwable -> L55
                r0.init(r1)     // Catch: java.lang.Throwable -> L55
                javax.crypto.Mac r0 = r5.mac     // Catch: java.lang.Throwable -> L55
                r0.update(r7)     // Catch: java.lang.Throwable -> L55
                javax.crypto.Mac r7 = r5.mac     // Catch: java.lang.Throwable -> L55
                r7.update(r6)     // Catch: java.lang.Throwable -> L55
                javax.crypto.Mac r6 = r5.mac     // Catch: java.lang.Throwable -> L55
                byte[] r6 = r6.doFinal()     // Catch: java.lang.Throwable -> L55
                com.google.crypto.tink.subtle.AesCtrHmacStreaming r7 = r5.this$0     // Catch: java.lang.Throwable -> L55
                int r7 = com.google.crypto.tink.subtle.AesCtrHmacStreaming.access$800(r7)     // Catch: java.lang.Throwable -> L55
                r0 = 0
                r8.put(r6, r0, r7)     // Catch: java.lang.Throwable -> L55
                monitor-exit(r5)
                return
            L55:
                r6 = move-exception
                monitor-exit(r5)     // Catch: java.lang.Throwable -> L55
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

    static {
            com.google.crypto.tink.config.internal.TinkFipsUtil$AlgorithmFipsCompatibility r0 = com.google.crypto.tink.config.internal.TinkFipsUtil.AlgorithmFipsCompatibility.ALGORITHM_NOT_FIPS
            com.google.crypto.tink.subtle.AesCtrHmacStreaming.FIPS = r0
            return
    }

    public AesCtrHmacStreaming(byte[] r8, java.lang.String r9, int r10, java.lang.String r11, int r12, int r13, int r14) throws java.security.GeneralSecurityException {
            r7 = this;
            r7.<init>()
            com.google.crypto.tink.config.internal.TinkFipsUtil$AlgorithmFipsCompatibility r0 = com.google.crypto.tink.subtle.AesCtrHmacStreaming.FIPS
            boolean r0 = r0.isCompatible()
            if (r0 == 0) goto L2b
            int r1 = r8.length
            r2 = r10
            r3 = r11
            r4 = r12
            r5 = r13
            r6 = r14
            validateParameters(r1, r2, r3, r4, r5, r6)
            int r0 = r8.length
            byte[] r8 = java.util.Arrays.copyOf(r8, r0)
            r7.ikm = r8
            r7.hkdfAlgo = r9
            r7.keySizeInBytes = r10
            r7.tagAlgo = r11
            r7.tagSizeInBytes = r12
            r7.ciphertextSegmentSize = r13
            r7.firstSegmentOffset = r14
            int r13 = r13 - r12
            r7.plaintextSegmentSize = r13
            return
        L2b:
            java.security.GeneralSecurityException r8 = new java.security.GeneralSecurityException
            java.lang.String r9 = "Can not use AES-CTR-HMAC streaming in FIPS-mode."
            r8.<init>(r9)
            throw r8
    }

    static /* synthetic */ javax.crypto.Cipher access$000() throws java.security.GeneralSecurityException {
            javax.crypto.Cipher r0 = cipherInstance()
            return r0
    }

    static /* synthetic */ javax.crypto.Mac access$100(com.google.crypto.tink.subtle.AesCtrHmacStreaming r0) throws java.security.GeneralSecurityException {
            javax.crypto.Mac r0 = r0.macInstance()
            return r0
    }

    static /* synthetic */ byte[] access$200(com.google.crypto.tink.subtle.AesCtrHmacStreaming r0) {
            byte[] r0 = r0.randomSalt()
            return r0
    }

    static /* synthetic */ byte[] access$300(com.google.crypto.tink.subtle.AesCtrHmacStreaming r0) {
            byte[] r0 = r0.randomNonce()
            return r0
    }

    static /* synthetic */ byte[] access$400(com.google.crypto.tink.subtle.AesCtrHmacStreaming r0, byte[] r1, byte[] r2) throws java.security.GeneralSecurityException {
            byte[] r0 = r0.deriveKeyMaterial(r1, r2)
            return r0
    }

    static /* synthetic */ javax.crypto.spec.SecretKeySpec access$500(com.google.crypto.tink.subtle.AesCtrHmacStreaming r0, byte[] r1) throws java.security.GeneralSecurityException {
            javax.crypto.spec.SecretKeySpec r0 = r0.deriveKeySpec(r1)
            return r0
    }

    static /* synthetic */ javax.crypto.spec.SecretKeySpec access$600(com.google.crypto.tink.subtle.AesCtrHmacStreaming r0, byte[] r1) throws java.security.GeneralSecurityException {
            javax.crypto.spec.SecretKeySpec r0 = r0.deriveHmacKeySpec(r1)
            return r0
    }

    static /* synthetic */ byte[] access$700(com.google.crypto.tink.subtle.AesCtrHmacStreaming r0, byte[] r1, long r2, boolean r4) throws java.security.GeneralSecurityException {
            byte[] r0 = r0.nonceForSegment(r1, r2, r4)
            return r0
    }

    static /* synthetic */ int access$800(com.google.crypto.tink.subtle.AesCtrHmacStreaming r0) {
            int r0 = r0.tagSizeInBytes
            return r0
    }

    static /* synthetic */ int access$900(com.google.crypto.tink.subtle.AesCtrHmacStreaming r0) {
            int r0 = r0.keySizeInBytes
            return r0
    }

    private static javax.crypto.Cipher cipherInstance() throws java.security.GeneralSecurityException {
            com.google.crypto.tink.subtle.EngineFactory<com.google.crypto.tink.subtle.EngineWrapper$TCipher, javax.crypto.Cipher> r0 = com.google.crypto.tink.subtle.EngineFactory.CIPHER
            java.lang.String r1 = "AES/CTR/NoPadding"
            java.lang.Object r0 = r0.getInstance(r1)
            javax.crypto.Cipher r0 = (javax.crypto.Cipher) r0
            return r0
    }

    private javax.crypto.spec.SecretKeySpec deriveHmacKeySpec(byte[] r5) throws java.security.GeneralSecurityException {
            r4 = this;
            javax.crypto.spec.SecretKeySpec r0 = new javax.crypto.spec.SecretKeySpec
            int r1 = r4.keySizeInBytes
            r2 = 32
            java.lang.String r3 = r4.tagAlgo
            r0.<init>(r5, r1, r2, r3)
            return r0
    }

    private byte[] deriveKeyMaterial(byte[] r4, byte[] r5) throws java.security.GeneralSecurityException {
            r3 = this;
            int r0 = r3.keySizeInBytes
            int r0 = r0 + 32
            java.lang.String r1 = r3.hkdfAlgo
            byte[] r2 = r3.ikm
            byte[] r4 = com.google.crypto.tink.subtle.Hkdf.computeHkdf(r1, r2, r4, r5, r0)
            return r4
    }

    private javax.crypto.spec.SecretKeySpec deriveKeySpec(byte[] r5) throws java.security.GeneralSecurityException {
            r4 = this;
            javax.crypto.spec.SecretKeySpec r0 = new javax.crypto.spec.SecretKeySpec
            int r1 = r4.keySizeInBytes
            java.lang.String r2 = "AES"
            r3 = 0
            r0.<init>(r5, r3, r1, r2)
            return r0
    }

    private javax.crypto.Mac macInstance() throws java.security.GeneralSecurityException {
            r2 = this;
            com.google.crypto.tink.subtle.EngineFactory<com.google.crypto.tink.subtle.EngineWrapper$TMac, javax.crypto.Mac> r0 = com.google.crypto.tink.subtle.EngineFactory.MAC
            java.lang.String r1 = r2.tagAlgo
            java.lang.Object r0 = r0.getInstance(r1)
            javax.crypto.Mac r0 = (javax.crypto.Mac) r0
            return r0
    }

    private byte[] nonceForSegment(byte[] r3, long r4, boolean r6) throws java.security.GeneralSecurityException {
            r2 = this;
            r0 = 16
            java.nio.ByteBuffer r0 = java.nio.ByteBuffer.allocate(r0)
            java.nio.ByteOrder r1 = java.nio.ByteOrder.BIG_ENDIAN
            r0.order(r1)
            r0.put(r3)
            com.google.crypto.tink.subtle.SubtleUtil.putAsUnsigedInt(r0, r4)
            byte r3 = (byte) r6
            r0.put(r3)
            r3 = 0
            r0.putInt(r3)
            byte[] r3 = r0.array()
            return r3
    }

    private byte[] randomNonce() {
            r1 = this;
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

    private static void validateParameters(int r1, int r2, java.lang.String r3, int r4, int r5, int r6) throws java.security.InvalidAlgorithmParameterException {
            r0 = 16
            if (r1 < r0) goto L5f
            if (r1 < r2) goto L5f
            com.google.crypto.tink.subtle.Validators.validateAesKeySize(r2)
            r1 = 10
            if (r4 < r1) goto L4a
            java.lang.String r1 = "HmacSha1"
            boolean r1 = r3.equals(r1)
            if (r1 == 0) goto L19
            r1 = 20
            if (r4 > r1) goto L32
        L19:
            java.lang.String r1 = "HmacSha256"
            boolean r1 = r3.equals(r1)
            if (r1 == 0) goto L25
            r1 = 32
            if (r4 > r1) goto L32
        L25:
            java.lang.String r1 = "HmacSha512"
            boolean r1 = r3.equals(r1)
            if (r1 == 0) goto L3a
            r1 = 64
            if (r4 > r1) goto L32
            goto L3a
        L32:
            java.security.InvalidAlgorithmParameterException r1 = new java.security.InvalidAlgorithmParameterException
            java.lang.String r2 = "tag size too big"
            r1.<init>(r2)
            throw r1
        L3a:
            int r5 = r5 - r6
            int r5 = r5 - r4
            int r5 = r5 - r2
            int r5 = r5 + (-8)
            if (r5 <= 0) goto L42
            return
        L42:
            java.security.InvalidAlgorithmParameterException r1 = new java.security.InvalidAlgorithmParameterException
            java.lang.String r2 = "ciphertextSegmentSize too small"
            r1.<init>(r2)
            throw r1
        L4a:
            java.security.InvalidAlgorithmParameterException r1 = new java.security.InvalidAlgorithmParameterException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "tag size too small "
            r2.<init>(r3)
            java.lang.StringBuilder r2 = r2.append(r4)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        L5f:
            java.security.InvalidAlgorithmParameterException r1 = new java.security.InvalidAlgorithmParameterException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "ikm too short, must be >= "
            r3.<init>(r4)
            int r2 = java.lang.Math.max(r0, r2)
            java.lang.StringBuilder r2 = r3.append(r2)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
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
            if (r0 <= 0) goto L1c
            int r0 = r5.tagSizeInBytes
            long r3 = (long) r0
            long r6 = r6 + r3
            long r1 = r1 + r6
        L1c:
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
            int r0 = r1.tagSizeInBytes
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
    public com.google.crypto.tink.subtle.AesCtrHmacStreaming.AesCtrHmacStreamDecrypter newStreamSegmentDecrypter() throws java.security.GeneralSecurityException {
            r1 = this;
            com.google.crypto.tink.subtle.AesCtrHmacStreaming$AesCtrHmacStreamDecrypter r0 = new com.google.crypto.tink.subtle.AesCtrHmacStreaming$AesCtrHmacStreamDecrypter
            r0.<init>(r1)
            return r0
    }

    @Override // com.google.crypto.tink.subtle.NonceBasedStreamingAead
    public /* bridge */ /* synthetic */ com.google.crypto.tink.subtle.StreamSegmentDecrypter newStreamSegmentDecrypter() throws java.security.GeneralSecurityException {
            r1 = this;
            com.google.crypto.tink.subtle.AesCtrHmacStreaming$AesCtrHmacStreamDecrypter r0 = r1.newStreamSegmentDecrypter()
            return r0
    }

    @Override // com.google.crypto.tink.subtle.NonceBasedStreamingAead
    public com.google.crypto.tink.subtle.AesCtrHmacStreaming.AesCtrHmacStreamEncrypter newStreamSegmentEncrypter(byte[] r2) throws java.security.GeneralSecurityException {
            r1 = this;
            com.google.crypto.tink.subtle.AesCtrHmacStreaming$AesCtrHmacStreamEncrypter r0 = new com.google.crypto.tink.subtle.AesCtrHmacStreaming$AesCtrHmacStreamEncrypter
            r0.<init>(r1, r2)
            return r0
    }

    @Override // com.google.crypto.tink.subtle.NonceBasedStreamingAead
    public /* bridge */ /* synthetic */ com.google.crypto.tink.subtle.StreamSegmentEncrypter newStreamSegmentEncrypter(byte[] r1) throws java.security.GeneralSecurityException {
            r0 = this;
            com.google.crypto.tink.subtle.AesCtrHmacStreaming$AesCtrHmacStreamEncrypter r1 = r0.newStreamSegmentEncrypter(r1)
            return r1
    }
}
