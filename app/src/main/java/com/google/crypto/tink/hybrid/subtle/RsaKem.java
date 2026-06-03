package com.google.crypto.tink.hybrid.subtle;

/* JADX INFO: loaded from: classes2.dex */
class RsaKem {
    static final byte[] EMPTY_AAD = null;
    static final int MIN_RSA_KEY_LENGTH_BITS = 2048;

    static {
            r0 = 0
            byte[] r0 = new byte[r0]
            com.google.crypto.tink.hybrid.subtle.RsaKem.EMPTY_AAD = r0
            return
    }

    private RsaKem() {
            r0 = this;
            r0.<init>()
            return
    }

    static int bigIntSizeInBytes(java.math.BigInteger r0) {
            int r0 = r0.bitLength()
            int r0 = r0 + 7
            int r0 = r0 / 8
            return r0
    }

    static byte[] bigIntToByteArray(java.math.BigInteger r4, int r5) {
            byte[] r4 = r4.toByteArray()
            int r0 = r4.length
            if (r0 != r5) goto L8
            return r4
        L8:
            byte[] r0 = new byte[r5]
            int r1 = r4.length
            int r2 = r5 + 1
            r3 = 0
            if (r1 != r2) goto L21
            r1 = r4[r3]
            if (r1 != 0) goto L19
            r1 = 1
            java.lang.System.arraycopy(r4, r1, r0, r3, r5)
            goto L2a
        L19:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r5 = "Value is one-byte longer than the expected size, but its first byte is not 0"
            r4.<init>(r5)
            throw r4
        L21:
            int r1 = r4.length
            if (r1 >= r5) goto L2b
            int r1 = r4.length
            int r5 = r5 - r1
            int r1 = r4.length
            java.lang.System.arraycopy(r4, r3, r0, r5, r1)
        L2a:
            return r0
        L2b:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            int r4 = r4.length
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            java.lang.Object[] r4 = new java.lang.Object[]{r5, r4}
            java.lang.String r5 = "Value has invalid length, must be of length at most (%d + 1), but got %d"
            java.lang.String r4 = java.lang.String.format(r5, r4)
            r0.<init>(r4)
            throw r0
    }

    static java.security.KeyPair generateRsaKeyPair(int r2) {
            java.lang.String r0 = "RSA"
            java.security.KeyPairGenerator r0 = java.security.KeyPairGenerator.getInstance(r0)     // Catch: java.security.NoSuchAlgorithmException -> Le
            r0.initialize(r2)     // Catch: java.security.NoSuchAlgorithmException -> Le
            java.security.KeyPair r2 = r0.generateKeyPair()
            return r2
        Le:
            r2 = move-exception
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "No support for RSA algorithm."
            r0.<init>(r1, r2)
            throw r0
    }

    static byte[] generateSecret(java.math.BigInteger r4) {
            int r0 = bigIntSizeInBytes(r4)
            java.security.SecureRandom r1 = new java.security.SecureRandom
            r1.<init>()
        L9:
            java.math.BigInteger r2 = new java.math.BigInteger
            int r3 = r4.bitLength()
            r2.<init>(r3, r1)
            int r3 = r2.signum()
            if (r3 <= 0) goto L9
            int r3 = r2.compareTo(r4)
            if (r3 >= 0) goto L9
            byte[] r4 = bigIntToByteArray(r2, r0)
            return r4
    }

    static void validateRsaModulus(java.math.BigInteger r2) throws java.security.GeneralSecurityException {
            int r0 = r2.bitLength()
            r1 = 2048(0x800, float:2.87E-42)
            if (r0 < r1) goto L9
            return
        L9:
            java.security.GeneralSecurityException r0 = new java.security.GeneralSecurityException
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            int r2 = r2.bitLength()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.Object[] r2 = new java.lang.Object[]{r1, r2}
            java.lang.String r1 = "RSA key must be of at least size %d bits, but got %d"
            java.lang.String r2 = java.lang.String.format(r1, r2)
            r0.<init>(r2)
            throw r0
    }
}
