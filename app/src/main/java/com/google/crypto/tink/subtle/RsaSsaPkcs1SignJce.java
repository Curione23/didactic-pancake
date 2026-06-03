package com.google.crypto.tink.subtle;

/* JADX INFO: loaded from: classes2.dex */
@com.google.errorprone.annotations.Immutable
public final class RsaSsaPkcs1SignJce implements com.google.crypto.tink.PublicKeySign {
    public static final com.google.crypto.tink.config.internal.TinkFipsUtil.AlgorithmFipsCompatibility FIPS = null;
    private final java.security.interfaces.RSAPrivateCrtKey privateKey;
    private final java.security.interfaces.RSAPublicKey publicKey;
    private final java.lang.String signatureAlgorithm;

    static {
            com.google.crypto.tink.config.internal.TinkFipsUtil$AlgorithmFipsCompatibility r0 = com.google.crypto.tink.config.internal.TinkFipsUtil.AlgorithmFipsCompatibility.ALGORITHM_REQUIRES_BORINGCRYPTO
            com.google.crypto.tink.subtle.RsaSsaPkcs1SignJce.FIPS = r0
            return
    }

    public RsaSsaPkcs1SignJce(java.security.interfaces.RSAPrivateCrtKey r3, com.google.crypto.tink.subtle.Enums.HashType r4) throws java.security.GeneralSecurityException {
            r2 = this;
            r2.<init>()
            com.google.crypto.tink.config.internal.TinkFipsUtil$AlgorithmFipsCompatibility r0 = com.google.crypto.tink.subtle.RsaSsaPkcs1SignJce.FIPS
            boolean r0 = r0.isCompatible()
            if (r0 == 0) goto L48
            com.google.crypto.tink.subtle.Validators.validateSignatureHash(r4)
            java.math.BigInteger r0 = r3.getModulus()
            int r0 = r0.bitLength()
            com.google.crypto.tink.subtle.Validators.validateRsaModulusSize(r0)
            java.math.BigInteger r0 = r3.getPublicExponent()
            com.google.crypto.tink.subtle.Validators.validateRsaPublicExponent(r0)
            r2.privateKey = r3
            java.lang.String r4 = com.google.crypto.tink.subtle.SubtleUtil.toRsaSsaPkcs1Algo(r4)
            r2.signatureAlgorithm = r4
            com.google.crypto.tink.subtle.EngineFactory<com.google.crypto.tink.subtle.EngineWrapper$TKeyFactory, java.security.KeyFactory> r4 = com.google.crypto.tink.subtle.EngineFactory.KEY_FACTORY
            java.lang.String r0 = "RSA"
            java.lang.Object r4 = r4.getInstance(r0)
            java.security.KeyFactory r4 = (java.security.KeyFactory) r4
            java.security.spec.RSAPublicKeySpec r0 = new java.security.spec.RSAPublicKeySpec
            java.math.BigInteger r1 = r3.getModulus()
            java.math.BigInteger r3 = r3.getPublicExponent()
            r0.<init>(r1, r3)
            java.security.PublicKey r3 = r4.generatePublic(r0)
            java.security.interfaces.RSAPublicKey r3 = (java.security.interfaces.RSAPublicKey) r3
            r2.publicKey = r3
            return
        L48:
            java.security.GeneralSecurityException r3 = new java.security.GeneralSecurityException
            java.lang.String r4 = "Can not use RSA PKCS1.5 in FIPS-mode, as BoringCrypto module is not available."
            r3.<init>(r4)
            throw r3
    }

    @Override // com.google.crypto.tink.PublicKeySign
    public byte[] sign(byte[] r4) throws java.security.GeneralSecurityException {
            r3 = this;
            com.google.crypto.tink.subtle.EngineFactory<com.google.crypto.tink.subtle.EngineWrapper$TSignature, java.security.Signature> r0 = com.google.crypto.tink.subtle.EngineFactory.SIGNATURE
            java.lang.String r1 = r3.signatureAlgorithm
            java.lang.Object r0 = r0.getInstance(r1)
            java.security.Signature r0 = (java.security.Signature) r0
            java.security.interfaces.RSAPrivateCrtKey r1 = r3.privateKey
            r0.initSign(r1)
            r0.update(r4)
            byte[] r0 = r0.sign()
            com.google.crypto.tink.subtle.EngineFactory<com.google.crypto.tink.subtle.EngineWrapper$TSignature, java.security.Signature> r1 = com.google.crypto.tink.subtle.EngineFactory.SIGNATURE
            java.lang.String r2 = r3.signatureAlgorithm
            java.lang.Object r1 = r1.getInstance(r2)
            java.security.Signature r1 = (java.security.Signature) r1
            java.security.interfaces.RSAPublicKey r2 = r3.publicKey
            r1.initVerify(r2)
            r1.update(r4)
            boolean r4 = r1.verify(r0)
            if (r4 == 0) goto L2f
            return r0
        L2f:
            java.lang.RuntimeException r4 = new java.lang.RuntimeException
            java.lang.String r0 = "Security bug: RSA signature computation error"
            r4.<init>(r0)
            throw r4
    }
}
