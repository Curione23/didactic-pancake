package com.google.crypto.tink.subtle;

/* JADX INFO: loaded from: classes2.dex */
public final class SelfKeyTestValidators {
    private static final com.google.crypto.tink.shaded.protobuf.ByteString TEST_MESSAGE = null;

    static {
            java.lang.String r0 = "Tink and Wycheproof."
            com.google.crypto.tink.shaded.protobuf.ByteString r0 = com.google.crypto.tink.shaded.protobuf.ByteString.copyFromUtf8(r0)
            com.google.crypto.tink.subtle.SelfKeyTestValidators.TEST_MESSAGE = r0
            return
    }

    private SelfKeyTestValidators() {
            r0 = this;
            r0.<init>()
            return
    }

    public static final void validateEcdsa(java.security.interfaces.ECPrivateKey r1, java.security.interfaces.ECPublicKey r2, com.google.crypto.tink.subtle.Enums.HashType r3, com.google.crypto.tink.subtle.EllipticCurves.EcdsaEncoding r4) throws java.security.GeneralSecurityException {
            com.google.crypto.tink.subtle.EcdsaSignJce r0 = new com.google.crypto.tink.subtle.EcdsaSignJce
            r0.<init>(r1, r3, r4)
            com.google.crypto.tink.subtle.EcdsaVerifyJce r1 = new com.google.crypto.tink.subtle.EcdsaVerifyJce
            r1.<init>(r2, r3, r4)
            com.google.crypto.tink.shaded.protobuf.ByteString r2 = com.google.crypto.tink.subtle.SelfKeyTestValidators.TEST_MESSAGE     // Catch: java.security.GeneralSecurityException -> L1c
            byte[] r3 = r2.toByteArray()     // Catch: java.security.GeneralSecurityException -> L1c
            byte[] r3 = r0.sign(r3)     // Catch: java.security.GeneralSecurityException -> L1c
            byte[] r2 = r2.toByteArray()     // Catch: java.security.GeneralSecurityException -> L1c
            r1.verify(r3, r2)     // Catch: java.security.GeneralSecurityException -> L1c
            return
        L1c:
            r1 = move-exception
            java.security.GeneralSecurityException r2 = new java.security.GeneralSecurityException
            java.lang.String r3 = "ECDSA signing with private key followed by verifying with public key failed. The key may be corrupted."
            r2.<init>(r3, r1)
            throw r2
    }

    public static final void validateRsaSsaPkcs1(java.security.interfaces.RSAPrivateCrtKey r1, java.security.interfaces.RSAPublicKey r2, com.google.crypto.tink.subtle.Enums.HashType r3) throws java.security.GeneralSecurityException {
            com.google.crypto.tink.subtle.RsaSsaPkcs1SignJce r0 = new com.google.crypto.tink.subtle.RsaSsaPkcs1SignJce
            r0.<init>(r1, r3)
            com.google.crypto.tink.subtle.RsaSsaPkcs1VerifyJce r1 = new com.google.crypto.tink.subtle.RsaSsaPkcs1VerifyJce
            r1.<init>(r2, r3)
            com.google.crypto.tink.shaded.protobuf.ByteString r2 = com.google.crypto.tink.subtle.SelfKeyTestValidators.TEST_MESSAGE     // Catch: java.security.GeneralSecurityException -> L1c
            byte[] r3 = r2.toByteArray()     // Catch: java.security.GeneralSecurityException -> L1c
            byte[] r3 = r0.sign(r3)     // Catch: java.security.GeneralSecurityException -> L1c
            byte[] r2 = r2.toByteArray()     // Catch: java.security.GeneralSecurityException -> L1c
            r1.verify(r3, r2)     // Catch: java.security.GeneralSecurityException -> L1c
            return
        L1c:
            r1 = move-exception
            java.security.GeneralSecurityException r2 = new java.security.GeneralSecurityException
            java.lang.String r3 = "RSA PKCS1 signing with private key followed by verifying with public key failed. The key may be corrupted."
            r2.<init>(r3, r1)
            throw r2
    }

    public static final void validateRsaSsaPss(java.security.interfaces.RSAPrivateCrtKey r1, java.security.interfaces.RSAPublicKey r2, com.google.crypto.tink.subtle.Enums.HashType r3, com.google.crypto.tink.subtle.Enums.HashType r4, int r5) throws java.security.GeneralSecurityException {
            com.google.crypto.tink.subtle.RsaSsaPssSignJce r0 = new com.google.crypto.tink.subtle.RsaSsaPssSignJce
            r0.<init>(r1, r3, r4, r5)
            com.google.crypto.tink.subtle.RsaSsaPssVerifyJce r1 = new com.google.crypto.tink.subtle.RsaSsaPssVerifyJce
            r1.<init>(r2, r3, r4, r5)
            com.google.crypto.tink.shaded.protobuf.ByteString r2 = com.google.crypto.tink.subtle.SelfKeyTestValidators.TEST_MESSAGE     // Catch: java.security.GeneralSecurityException -> L1c
            byte[] r3 = r2.toByteArray()     // Catch: java.security.GeneralSecurityException -> L1c
            byte[] r3 = r0.sign(r3)     // Catch: java.security.GeneralSecurityException -> L1c
            byte[] r2 = r2.toByteArray()     // Catch: java.security.GeneralSecurityException -> L1c
            r1.verify(r3, r2)     // Catch: java.security.GeneralSecurityException -> L1c
            return
        L1c:
            r1 = move-exception
            java.security.GeneralSecurityException r2 = new java.security.GeneralSecurityException
            java.lang.String r3 = "RSA PSS signing with private key followed by verifying with public key failed. The key may be corrupted."
            r2.<init>(r3, r1)
            throw r2
    }
}
