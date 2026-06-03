package org.apache.commons.compress.archivers.sevenz;

/* JADX INFO: loaded from: classes2.dex */
final class AES256Options {
    static final java.lang.String ALGORITHM = "AES";
    private static final byte[] EMPTY_BYTE_ARRAY = null;
    static final java.lang.String TRANSFORMATION = "AES/CBC/NoPadding";
    private final javax.crypto.Cipher cipher;
    private final byte[] iv;
    private final int numCyclesPower;
    private final byte[] salt;

    static {
            r0 = 0
            byte[] r0 = new byte[r0]
            org.apache.commons.compress.archivers.sevenz.AES256Options.EMPTY_BYTE_ARRAY = r0
            return
    }

    AES256Options(char[] r4) {
            r3 = this;
            byte[] r0 = org.apache.commons.compress.archivers.sevenz.AES256Options.EMPTY_BYTE_ARRAY
            r1 = 16
            byte[] r1 = randomBytes(r1)
            r2 = 19
            r3.<init>(r4, r0, r1, r2)
            return
    }

    AES256Options(char[] r1, byte[] r2, byte[] r3, int r4) {
            r0 = this;
            r0.<init>()
            r0.salt = r2
            r0.iv = r3
            r0.numCyclesPower = r4
            byte[] r1 = org.apache.commons.compress.archivers.sevenz.AES256SHA256Decoder.sha256Password(r1, r4, r2)
            javax.crypto.spec.SecretKeySpec r1 = newSecretKeySpec(r1)
            java.lang.String r2 = "AES/CBC/NoPadding"
            javax.crypto.Cipher r2 = javax.crypto.Cipher.getInstance(r2)     // Catch: java.security.GeneralSecurityException -> L23
            r0.cipher = r2     // Catch: java.security.GeneralSecurityException -> L23
            javax.crypto.spec.IvParameterSpec r4 = new javax.crypto.spec.IvParameterSpec     // Catch: java.security.GeneralSecurityException -> L23
            r4.<init>(r3)     // Catch: java.security.GeneralSecurityException -> L23
            r3 = 1
            r2.init(r3, r1, r4)     // Catch: java.security.GeneralSecurityException -> L23
            return
        L23:
            r1 = move-exception
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r3 = "Encryption error (do you have the JCE Unlimited Strength Jurisdiction Policy Files installed?)"
            r2.<init>(r3, r1)
            throw r2
    }

    static javax.crypto.spec.SecretKeySpec newSecretKeySpec(byte[] r2) {
            javax.crypto.spec.SecretKeySpec r0 = new javax.crypto.spec.SecretKeySpec
            java.lang.String r1 = "AES"
            r0.<init>(r2, r1)
            return r0
    }

    private static byte[] randomBytes(int r2) {
            byte[] r2 = new byte[r2]
            java.security.SecureRandom r0 = java.security.SecureRandom.getInstanceStrong()     // Catch: java.security.NoSuchAlgorithmException -> La
            r0.nextBytes(r2)     // Catch: java.security.NoSuchAlgorithmException -> La
            return r2
        La:
            r2 = move-exception
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "No strong secure random available to generate strong AES key"
            r0.<init>(r1, r2)
            throw r0
    }

    javax.crypto.Cipher getCipher() {
            r1 = this;
            javax.crypto.Cipher r0 = r1.cipher
            return r0
    }

    byte[] getIv() {
            r1 = this;
            byte[] r0 = r1.iv
            return r0
    }

    int getNumCyclesPower() {
            r1 = this;
            int r0 = r1.numCyclesPower
            return r0
    }

    byte[] getSalt() {
            r1 = this;
            byte[] r0 = r1.salt
            return r0
    }
}
