package com.google.crypto.tink.hybrid.subtle;

/* JADX INFO: loaded from: classes2.dex */
public final class RsaKemHybridDecrypt implements com.google.crypto.tink.HybridDecrypt {
    private final com.google.crypto.tink.aead.subtle.AeadFactory aeadFactory;
    private final java.lang.String hkdfHmacAlgo;
    private final byte[] hkdfSalt;
    private final java.security.interfaces.RSAPrivateKey recipientPrivateKey;

    public RsaKemHybridDecrypt(java.security.interfaces.RSAPrivateKey r2, java.lang.String r3, byte[] r4, com.google.crypto.tink.aead.subtle.AeadFactory r5) throws java.security.GeneralSecurityException {
            r1 = this;
            r1.<init>()
            java.math.BigInteger r0 = r2.getModulus()
            com.google.crypto.tink.hybrid.subtle.RsaKem.validateRsaModulus(r0)
            r1.recipientPrivateKey = r2
            r1.hkdfSalt = r4
            r1.hkdfHmacAlgo = r3
            r1.aeadFactory = r5
            return
    }

    @Override // com.google.crypto.tink.HybridDecrypt
    public byte[] decrypt(byte[] r5, byte[] r6) throws java.security.GeneralSecurityException {
            r4 = this;
            java.security.interfaces.RSAPrivateKey r0 = r4.recipientPrivateKey
            java.math.BigInteger r0 = r0.getModulus()
            int r0 = com.google.crypto.tink.hybrid.subtle.RsaKem.bigIntSizeInBytes(r0)
            int r1 = r5.length
            if (r1 < r0) goto L4a
            java.nio.ByteBuffer r5 = java.nio.ByteBuffer.wrap(r5)
            byte[] r0 = new byte[r0]
            r5.get(r0)
            java.lang.String r1 = "RSA/ECB/NoPadding"
            javax.crypto.Cipher r1 = javax.crypto.Cipher.getInstance(r1)
            r2 = 2
            java.security.interfaces.RSAPrivateKey r3 = r4.recipientPrivateKey
            r1.init(r2, r3)
            byte[] r0 = r1.doFinal(r0)
            java.lang.String r1 = r4.hkdfHmacAlgo
            byte[] r2 = r4.hkdfSalt
            com.google.crypto.tink.aead.subtle.AeadFactory r3 = r4.aeadFactory
            int r3 = r3.getKeySizeInBytes()
            byte[] r6 = com.google.crypto.tink.subtle.Hkdf.computeHkdf(r1, r0, r2, r6, r3)
            com.google.crypto.tink.aead.subtle.AeadFactory r0 = r4.aeadFactory
            com.google.crypto.tink.Aead r6 = r0.createAead(r6)
            int r0 = r5.remaining()
            byte[] r0 = new byte[r0]
            r5.get(r0)
            byte[] r5 = com.google.crypto.tink.hybrid.subtle.RsaKem.EMPTY_AAD
            byte[] r5 = r6.decrypt(r0, r5)
            return r5
        L4a:
            java.security.GeneralSecurityException r6 = new java.security.GeneralSecurityException
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            int r5 = r5.length
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            java.lang.Object[] r5 = new java.lang.Object[]{r0, r5}
            java.lang.String r0 = "Ciphertext must be of at least size %d bytes, but got %d"
            java.lang.String r5 = java.lang.String.format(r0, r5)
            r6.<init>(r5)
            throw r6
    }
}
