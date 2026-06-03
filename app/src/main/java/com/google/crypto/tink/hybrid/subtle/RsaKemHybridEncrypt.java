package com.google.crypto.tink.hybrid.subtle;

/* JADX INFO: loaded from: classes2.dex */
public final class RsaKemHybridEncrypt implements com.google.crypto.tink.HybridEncrypt {
    private final com.google.crypto.tink.aead.subtle.AeadFactory aeadFactory;
    private final java.lang.String hkdfHmacAlgo;
    private final byte[] hkdfSalt;
    private final java.security.interfaces.RSAPublicKey recipientPublicKey;

    public RsaKemHybridEncrypt(java.security.interfaces.RSAPublicKey r2, java.lang.String r3, byte[] r4, com.google.crypto.tink.aead.subtle.AeadFactory r5) throws java.security.GeneralSecurityException {
            r1 = this;
            r1.<init>()
            java.math.BigInteger r0 = r2.getModulus()
            com.google.crypto.tink.hybrid.subtle.RsaKem.validateRsaModulus(r0)
            r1.recipientPublicKey = r2
            r1.hkdfHmacAlgo = r3
            r1.hkdfSalt = r4
            r1.aeadFactory = r5
            return
    }

    @Override // com.google.crypto.tink.HybridEncrypt
    public byte[] encrypt(byte[] r6, byte[] r7) throws java.security.GeneralSecurityException {
            r5 = this;
            java.security.interfaces.RSAPublicKey r0 = r5.recipientPublicKey
            java.math.BigInteger r0 = r0.getModulus()
            byte[] r0 = com.google.crypto.tink.hybrid.subtle.RsaKem.generateSecret(r0)
            java.lang.String r1 = "RSA/ECB/NoPadding"
            javax.crypto.Cipher r1 = javax.crypto.Cipher.getInstance(r1)
            r2 = 1
            java.security.interfaces.RSAPublicKey r3 = r5.recipientPublicKey
            r1.init(r2, r3)
            byte[] r1 = r1.doFinal(r0)
            java.lang.String r2 = r5.hkdfHmacAlgo
            byte[] r3 = r5.hkdfSalt
            com.google.crypto.tink.aead.subtle.AeadFactory r4 = r5.aeadFactory
            int r4 = r4.getKeySizeInBytes()
            byte[] r7 = com.google.crypto.tink.subtle.Hkdf.computeHkdf(r2, r0, r3, r7, r4)
            com.google.crypto.tink.aead.subtle.AeadFactory r0 = r5.aeadFactory
            com.google.crypto.tink.Aead r7 = r0.createAead(r7)
            byte[] r0 = com.google.crypto.tink.hybrid.subtle.RsaKem.EMPTY_AAD
            byte[] r6 = r7.encrypt(r6, r0)
            int r7 = r1.length
            int r0 = r6.length
            int r7 = r7 + r0
            java.nio.ByteBuffer r7 = java.nio.ByteBuffer.allocate(r7)
            java.nio.ByteBuffer r7 = r7.put(r1)
            java.nio.ByteBuffer r6 = r7.put(r6)
            byte[] r6 = r6.array()
            return r6
    }
}
