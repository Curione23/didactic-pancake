package com.google.crypto.tink.aead.internal;

/* JADX INFO: loaded from: classes2.dex */
abstract class InsecureNonceChaCha20Poly1305Base {
    public static final com.google.crypto.tink.config.internal.TinkFipsUtil.AlgorithmFipsCompatibility FIPS = null;
    private final com.google.crypto.tink.aead.internal.InsecureNonceChaCha20Base chacha20;
    private final com.google.crypto.tink.aead.internal.InsecureNonceChaCha20Base macKeyChaCha20;

    static {
            com.google.crypto.tink.config.internal.TinkFipsUtil$AlgorithmFipsCompatibility r0 = com.google.crypto.tink.config.internal.TinkFipsUtil.AlgorithmFipsCompatibility.ALGORITHM_NOT_FIPS
            com.google.crypto.tink.aead.internal.InsecureNonceChaCha20Poly1305Base.FIPS = r0
            return
    }

    public InsecureNonceChaCha20Poly1305Base(byte[] r2) throws java.security.GeneralSecurityException {
            r1 = this;
            r1.<init>()
            com.google.crypto.tink.config.internal.TinkFipsUtil$AlgorithmFipsCompatibility r0 = com.google.crypto.tink.aead.internal.InsecureNonceChaCha20Poly1305Base.FIPS
            boolean r0 = r0.isCompatible()
            if (r0 == 0) goto L1a
            r0 = 1
            com.google.crypto.tink.aead.internal.InsecureNonceChaCha20Base r0 = r1.newChaCha20Instance(r2, r0)
            r1.chacha20 = r0
            r0 = 0
            com.google.crypto.tink.aead.internal.InsecureNonceChaCha20Base r2 = r1.newChaCha20Instance(r2, r0)
            r1.macKeyChaCha20 = r2
            return
        L1a:
            java.security.GeneralSecurityException r2 = new java.security.GeneralSecurityException
            java.lang.String r0 = "Can not use ChaCha20Poly1305 in FIPS-mode."
            r2.<init>(r0)
            throw r2
    }

    private byte[] getMacKey(byte[] r3) throws java.security.GeneralSecurityException {
            r2 = this;
            com.google.crypto.tink.aead.internal.InsecureNonceChaCha20Base r0 = r2.macKeyChaCha20
            r1 = 0
            java.nio.ByteBuffer r3 = r0.chacha20Block(r3, r1)
            r0 = 32
            byte[] r0 = new byte[r0]
            r3.get(r0)
            return r0
    }

    private static byte[] macDataRfc8439(byte[] r5, java.nio.ByteBuffer r6) {
            int r0 = r5.length
            int r0 = r0 % 16
            if (r0 != 0) goto L7
            int r0 = r5.length
            goto Le
        L7:
            int r0 = r5.length
            int r0 = r0 + 16
            int r1 = r5.length
            int r1 = r1 % 16
            int r0 = r0 - r1
        Le:
            int r1 = r6.remaining()
            int r2 = r1 % 16
            if (r2 != 0) goto L18
            r3 = r1
            goto L1b
        L18:
            int r3 = r1 + 16
            int r3 = r3 - r2
        L1b:
            int r3 = r3 + r0
            int r2 = r3 + 16
            java.nio.ByteBuffer r2 = java.nio.ByteBuffer.allocate(r2)
            java.nio.ByteOrder r4 = java.nio.ByteOrder.LITTLE_ENDIAN
            java.nio.ByteBuffer r2 = r2.order(r4)
            r2.put(r5)
            r2.position(r0)
            r2.put(r6)
            r2.position(r3)
            int r5 = r5.length
            long r5 = (long) r5
            r2.putLong(r5)
            long r5 = (long) r1
            r2.putLong(r5)
            byte[] r5 = r2.array()
            return r5
    }

    public byte[] decrypt(java.nio.ByteBuffer r5, byte[] r6, byte[] r7) throws java.security.GeneralSecurityException {
            r4 = this;
            int r0 = r5.remaining()
            r1 = 16
            if (r0 < r1) goto L49
            int r0 = r5.position()
            byte[] r2 = new byte[r1]
            int r3 = r5.limit()
            int r3 = r3 - r1
            r5.position(r3)
            r5.get(r2)
            r5.position(r0)
            int r3 = r5.limit()
            int r3 = r3 - r1
            r5.limit(r3)
            if (r7 != 0) goto L29
            r7 = 0
            byte[] r7 = new byte[r7]
        L29:
            byte[] r1 = r4.getMacKey(r6)     // Catch: java.security.GeneralSecurityException -> L3e
            byte[] r7 = macDataRfc8439(r7, r5)     // Catch: java.security.GeneralSecurityException -> L3e
            com.google.crypto.tink.aead.internal.Poly1305.verifyMac(r1, r7, r2)     // Catch: java.security.GeneralSecurityException -> L3e
            r5.position(r0)
            com.google.crypto.tink.aead.internal.InsecureNonceChaCha20Base r7 = r4.chacha20
            byte[] r5 = r7.decrypt(r6, r5)
            return r5
        L3e:
            r5 = move-exception
            javax.crypto.AEADBadTagException r6 = new javax.crypto.AEADBadTagException
            java.lang.String r5 = r5.toString()
            r6.<init>(r5)
            throw r6
        L49:
            java.security.GeneralSecurityException r5 = new java.security.GeneralSecurityException
            java.lang.String r6 = "ciphertext too short"
            r5.<init>(r6)
            throw r5
    }

    public byte[] decrypt(byte[] r1, byte[] r2, byte[] r3) throws java.security.GeneralSecurityException {
            r0 = this;
            java.nio.ByteBuffer r2 = java.nio.ByteBuffer.wrap(r2)
            byte[] r1 = r0.decrypt(r2, r1, r3)
            return r1
    }

    public void encrypt(java.nio.ByteBuffer r3, byte[] r4, byte[] r5, byte[] r6) throws java.security.GeneralSecurityException {
            r2 = this;
            int r0 = r3.remaining()
            int r1 = r5.length
            int r1 = r1 + 16
            if (r0 < r1) goto L3c
            int r0 = r3.position()
            com.google.crypto.tink.aead.internal.InsecureNonceChaCha20Base r1 = r2.chacha20
            r1.encrypt(r3, r4, r5)
            r3.position(r0)
            int r5 = r3.limit()
            int r5 = r5 + (-16)
            r3.limit(r5)
            if (r6 != 0) goto L23
            r5 = 0
            byte[] r6 = new byte[r5]
        L23:
            byte[] r4 = r2.getMacKey(r4)
            byte[] r5 = macDataRfc8439(r6, r3)
            byte[] r4 = com.google.crypto.tink.aead.internal.Poly1305.computeMac(r4, r5)
            int r5 = r3.limit()
            int r5 = r5 + 16
            r3.limit(r5)
            r3.put(r4)
            return
        L3c:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r4 = "Given ByteBuffer output is too small"
            r3.<init>(r4)
            throw r3
    }

    public byte[] encrypt(byte[] r3, byte[] r4, byte[] r5) throws java.security.GeneralSecurityException {
            r2 = this;
            int r0 = r4.length
            r1 = 2147483631(0x7fffffef, float:NaN)
            if (r0 > r1) goto L15
            int r0 = r4.length
            int r0 = r0 + 16
            java.nio.ByteBuffer r0 = java.nio.ByteBuffer.allocate(r0)
            r2.encrypt(r0, r3, r4, r5)
            byte[] r3 = r0.array()
            return r3
        L15:
            java.security.GeneralSecurityException r3 = new java.security.GeneralSecurityException
            java.lang.String r4 = "plaintext too long"
            r3.<init>(r4)
            throw r3
    }

    abstract com.google.crypto.tink.aead.internal.InsecureNonceChaCha20Base newChaCha20Instance(byte[] r1, int r2) throws java.security.InvalidKeyException;
}
