package com.google.crypto.tink.subtle;

/* JADX INFO: loaded from: classes2.dex */
public final class EncryptThenAuthenticate implements com.google.crypto.tink.Aead {
    private final com.google.crypto.tink.subtle.IndCpaCipher cipher;
    private final com.google.crypto.tink.Mac mac;
    private final int macLength;

    public EncryptThenAuthenticate(com.google.crypto.tink.subtle.IndCpaCipher r1, com.google.crypto.tink.Mac r2, int r3) {
            r0 = this;
            r0.<init>()
            r0.cipher = r1
            r0.mac = r2
            r0.macLength = r3
            return
    }

    public static com.google.crypto.tink.Aead newAesCtrHmac(byte[] r1, int r2, java.lang.String r3, byte[] r4, int r5) throws java.security.GeneralSecurityException {
            com.google.crypto.tink.subtle.AesCtrJceCipher r0 = new com.google.crypto.tink.subtle.AesCtrJceCipher
            r0.<init>(r1, r2)
            javax.crypto.spec.SecretKeySpec r1 = new javax.crypto.spec.SecretKeySpec
            java.lang.String r2 = "HMAC"
            r1.<init>(r4, r2)
            com.google.crypto.tink.subtle.PrfMac r2 = new com.google.crypto.tink.subtle.PrfMac
            com.google.crypto.tink.subtle.PrfHmacJce r4 = new com.google.crypto.tink.subtle.PrfHmacJce
            r4.<init>(r3, r1)
            r2.<init>(r4, r5)
            com.google.crypto.tink.subtle.EncryptThenAuthenticate r1 = new com.google.crypto.tink.subtle.EncryptThenAuthenticate
            r1.<init>(r0, r2, r5)
            return r1
    }

    @Override // com.google.crypto.tink.Aead
    public byte[] decrypt(byte[] r8, byte[] r9) throws java.security.GeneralSecurityException {
            r7 = this;
            int r0 = r8.length
            int r1 = r7.macLength
            if (r0 < r1) goto L44
            int r0 = r8.length
            int r0 = r0 - r1
            r1 = 0
            byte[] r0 = java.util.Arrays.copyOfRange(r8, r1, r0)
            int r2 = r8.length
            int r3 = r7.macLength
            int r2 = r2 - r3
            int r3 = r8.length
            byte[] r8 = java.util.Arrays.copyOfRange(r8, r2, r3)
            if (r9 != 0) goto L19
            byte[] r9 = new byte[r1]
        L19:
            r1 = 8
            java.nio.ByteBuffer r2 = java.nio.ByteBuffer.allocate(r1)
            int r3 = r9.length
            long r3 = (long) r3
            r5 = 8
            long r3 = r3 * r5
            java.nio.ByteBuffer r2 = r2.putLong(r3)
            byte[] r2 = r2.array()
            byte[] r1 = java.util.Arrays.copyOf(r2, r1)
            com.google.crypto.tink.Mac r2 = r7.mac
            byte[][] r9 = new byte[][]{r9, r0, r1}
            byte[] r9 = com.google.crypto.tink.subtle.Bytes.concat(r9)
            r2.verifyMac(r8, r9)
            com.google.crypto.tink.subtle.IndCpaCipher r8 = r7.cipher
            byte[] r8 = r8.decrypt(r0)
            return r8
        L44:
            java.security.GeneralSecurityException r8 = new java.security.GeneralSecurityException
            java.lang.String r9 = "ciphertext too short"
            r8.<init>(r9)
            throw r8
    }

    @Override // com.google.crypto.tink.Aead
    public byte[] encrypt(byte[] r7, byte[] r8) throws java.security.GeneralSecurityException {
            r6 = this;
            com.google.crypto.tink.subtle.IndCpaCipher r0 = r6.cipher
            byte[] r7 = r0.encrypt(r7)
            if (r8 != 0) goto Lb
            r8 = 0
            byte[] r8 = new byte[r8]
        Lb:
            r0 = 8
            java.nio.ByteBuffer r1 = java.nio.ByteBuffer.allocate(r0)
            int r2 = r8.length
            long r2 = (long) r2
            r4 = 8
            long r2 = r2 * r4
            java.nio.ByteBuffer r1 = r1.putLong(r2)
            byte[] r1 = r1.array()
            byte[] r0 = java.util.Arrays.copyOf(r1, r0)
            com.google.crypto.tink.Mac r1 = r6.mac
            byte[][] r8 = new byte[][]{r8, r7, r0}
            byte[] r8 = com.google.crypto.tink.subtle.Bytes.concat(r8)
            byte[] r8 = r1.computeMac(r8)
            byte[][] r7 = new byte[][]{r7, r8}
            byte[] r7 = com.google.crypto.tink.subtle.Bytes.concat(r7)
            return r7
    }
}
