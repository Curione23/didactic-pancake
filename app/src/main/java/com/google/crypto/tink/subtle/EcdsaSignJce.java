package com.google.crypto.tink.subtle;

/* JADX INFO: loaded from: classes2.dex */
@com.google.errorprone.annotations.Immutable
public final class EcdsaSignJce implements com.google.crypto.tink.PublicKeySign {
    public static final com.google.crypto.tink.config.internal.TinkFipsUtil.AlgorithmFipsCompatibility FIPS = null;
    private final com.google.crypto.tink.subtle.EllipticCurves.EcdsaEncoding encoding;
    private final java.security.interfaces.ECPrivateKey privateKey;
    private final java.lang.String signatureAlgorithm;

    static {
            com.google.crypto.tink.config.internal.TinkFipsUtil$AlgorithmFipsCompatibility r0 = com.google.crypto.tink.config.internal.TinkFipsUtil.AlgorithmFipsCompatibility.ALGORITHM_REQUIRES_BORINGCRYPTO
            com.google.crypto.tink.subtle.EcdsaSignJce.FIPS = r0
            return
    }

    public EcdsaSignJce(java.security.interfaces.ECPrivateKey r2, com.google.crypto.tink.subtle.Enums.HashType r3, com.google.crypto.tink.subtle.EllipticCurves.EcdsaEncoding r4) throws java.security.GeneralSecurityException {
            r1 = this;
            r1.<init>()
            com.google.crypto.tink.config.internal.TinkFipsUtil$AlgorithmFipsCompatibility r0 = com.google.crypto.tink.subtle.EcdsaSignJce.FIPS
            boolean r0 = r0.isCompatible()
            if (r0 == 0) goto L16
            r1.privateKey = r2
            java.lang.String r2 = com.google.crypto.tink.subtle.SubtleUtil.toEcdsaAlgo(r3)
            r1.signatureAlgorithm = r2
            r1.encoding = r4
            return
        L16:
            java.security.GeneralSecurityException r2 = new java.security.GeneralSecurityException
            java.lang.String r3 = "Can not use ECDSA in FIPS-mode, as BoringCrypto is not available."
            r2.<init>(r3)
            throw r2
    }

    @Override // com.google.crypto.tink.PublicKeySign
    public byte[] sign(byte[] r5) throws java.security.GeneralSecurityException {
            r4 = this;
            r0 = 3
            java.lang.String[] r0 = new java.lang.String[r0]
            r1 = 0
            java.lang.String r2 = "GmsCore_OpenSSL"
            r0[r1] = r2
            r1 = 1
            java.lang.String r2 = "AndroidOpenSSL"
            r0[r1] = r2
            java.lang.String r1 = "Conscrypt"
            r2 = 2
            r0[r2] = r1
            java.util.List r0 = com.google.crypto.tink.subtle.EngineFactory.toProviderList(r0)
            com.google.crypto.tink.subtle.EngineFactory<com.google.crypto.tink.subtle.EngineWrapper$TSignature, java.security.Signature> r1 = com.google.crypto.tink.subtle.EngineFactory.SIGNATURE
            java.lang.String r3 = r4.signatureAlgorithm
            java.lang.Object r0 = r1.getInstance(r3, r0)
            java.security.Signature r0 = (java.security.Signature) r0
            java.security.interfaces.ECPrivateKey r1 = r4.privateKey
            r0.initSign(r1)
            r0.update(r5)
            byte[] r5 = r0.sign()
            com.google.crypto.tink.subtle.EllipticCurves$EcdsaEncoding r0 = r4.encoding
            com.google.crypto.tink.subtle.EllipticCurves$EcdsaEncoding r1 = com.google.crypto.tink.subtle.EllipticCurves.EcdsaEncoding.IEEE_P1363
            if (r0 != r1) goto L45
            java.security.interfaces.ECPrivateKey r0 = r4.privateKey
            java.security.spec.ECParameterSpec r0 = r0.getParams()
            java.security.spec.EllipticCurve r0 = r0.getCurve()
            int r0 = com.google.crypto.tink.subtle.EllipticCurves.fieldSizeInBytes(r0)
            int r0 = r0 * r2
            byte[] r5 = com.google.crypto.tink.subtle.EllipticCurves.ecdsaDer2Ieee(r5, r0)
        L45:
            return r5
    }
}
