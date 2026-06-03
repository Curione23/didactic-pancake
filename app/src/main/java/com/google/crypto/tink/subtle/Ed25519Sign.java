package com.google.crypto.tink.subtle;

/* JADX INFO: loaded from: classes2.dex */
public final class Ed25519Sign implements com.google.crypto.tink.PublicKeySign {
    public static final com.google.crypto.tink.config.internal.TinkFipsUtil.AlgorithmFipsCompatibility FIPS = null;
    public static final int SECRET_KEY_LEN = 32;
    private final byte[] hashedPrivateKey;
    private final byte[] publicKey;

    public static final class KeyPair {
        private final byte[] privateKey;
        private final byte[] publicKey;

        private KeyPair(byte[] r1, byte[] r2) {
                r0 = this;
                r0.<init>()
                r0.publicKey = r1
                r0.privateKey = r2
                return
        }

        public static com.google.crypto.tink.subtle.Ed25519Sign.KeyPair newKeyPair() throws java.security.GeneralSecurityException {
                r0 = 32
                byte[] r0 = com.google.crypto.tink.subtle.Random.randBytes(r0)
                com.google.crypto.tink.subtle.Ed25519Sign$KeyPair r0 = newKeyPairFromSeed(r0)
                return r0
        }

        public static com.google.crypto.tink.subtle.Ed25519Sign.KeyPair newKeyPairFromSeed(byte[] r2) throws java.security.GeneralSecurityException {
                int r0 = r2.length
                r1 = 32
                if (r0 != r1) goto L13
                byte[] r0 = com.google.crypto.tink.subtle.Ed25519.getHashedScalar(r2)
                byte[] r0 = com.google.crypto.tink.subtle.Ed25519.scalarMultWithBaseToBytes(r0)
                com.google.crypto.tink.subtle.Ed25519Sign$KeyPair r1 = new com.google.crypto.tink.subtle.Ed25519Sign$KeyPair
                r1.<init>(r0, r2)
                return r1
            L13:
                java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
                java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
                java.lang.Object[] r0 = new java.lang.Object[]{r0}
                java.lang.String r1 = "Given secret seed length is not %s"
                java.lang.String r0 = java.lang.String.format(r1, r0)
                r2.<init>(r0)
                throw r2
        }

        public byte[] getPrivateKey() {
                r2 = this;
                byte[] r0 = r2.privateKey
                int r1 = r0.length
                byte[] r0 = java.util.Arrays.copyOf(r0, r1)
                return r0
        }

        public byte[] getPublicKey() {
                r2 = this;
                byte[] r0 = r2.publicKey
                int r1 = r0.length
                byte[] r0 = java.util.Arrays.copyOf(r0, r1)
                return r0
        }
    }

    static {
            com.google.crypto.tink.config.internal.TinkFipsUtil$AlgorithmFipsCompatibility r0 = com.google.crypto.tink.config.internal.TinkFipsUtil.AlgorithmFipsCompatibility.ALGORITHM_NOT_FIPS
            com.google.crypto.tink.subtle.Ed25519Sign.FIPS = r0
            return
    }

    public Ed25519Sign(byte[] r3) throws java.security.GeneralSecurityException {
            r2 = this;
            r2.<init>()
            com.google.crypto.tink.config.internal.TinkFipsUtil$AlgorithmFipsCompatibility r0 = com.google.crypto.tink.subtle.Ed25519Sign.FIPS
            boolean r0 = r0.isCompatible()
            if (r0 == 0) goto L31
            int r0 = r3.length
            r1 = 32
            if (r0 != r1) goto L1d
            byte[] r3 = com.google.crypto.tink.subtle.Ed25519.getHashedScalar(r3)
            r2.hashedPrivateKey = r3
            byte[] r3 = com.google.crypto.tink.subtle.Ed25519.scalarMultWithBaseToBytes(r3)
            r2.publicKey = r3
            return
        L1d:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            java.lang.String r1 = "Given private key's length is not %s"
            java.lang.String r0 = java.lang.String.format(r1, r0)
            r3.<init>(r0)
            throw r3
        L31:
            java.security.GeneralSecurityException r3 = new java.security.GeneralSecurityException
            java.lang.String r0 = "Can not use Ed25519 in FIPS-mode."
            r3.<init>(r0)
            throw r3
    }

    @Override // com.google.crypto.tink.PublicKeySign
    public byte[] sign(byte[] r3) throws java.security.GeneralSecurityException {
            r2 = this;
            byte[] r0 = r2.publicKey
            byte[] r1 = r2.hashedPrivateKey
            byte[] r3 = com.google.crypto.tink.subtle.Ed25519.sign(r3, r0, r1)
            return r3
    }
}
