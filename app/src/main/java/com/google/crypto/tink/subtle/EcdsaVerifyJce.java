package com.google.crypto.tink.subtle;

/* JADX INFO: loaded from: classes2.dex */
@com.google.errorprone.annotations.Immutable
public final class EcdsaVerifyJce implements com.google.crypto.tink.PublicKeyVerify {
    public static final com.google.crypto.tink.config.internal.TinkFipsUtil.AlgorithmFipsCompatibility FIPS = null;
    private final com.google.crypto.tink.subtle.EllipticCurves.EcdsaEncoding encoding;
    private final java.security.interfaces.ECPublicKey publicKey;
    private final java.lang.String signatureAlgorithm;

    static {
            com.google.crypto.tink.config.internal.TinkFipsUtil$AlgorithmFipsCompatibility r0 = com.google.crypto.tink.config.internal.TinkFipsUtil.AlgorithmFipsCompatibility.ALGORITHM_REQUIRES_BORINGCRYPTO
            com.google.crypto.tink.subtle.EcdsaVerifyJce.FIPS = r0
            return
    }

    public EcdsaVerifyJce(java.security.interfaces.ECPublicKey r2, com.google.crypto.tink.subtle.Enums.HashType r3, com.google.crypto.tink.subtle.EllipticCurves.EcdsaEncoding r4) throws java.security.GeneralSecurityException {
            r1 = this;
            r1.<init>()
            com.google.crypto.tink.config.internal.TinkFipsUtil$AlgorithmFipsCompatibility r0 = com.google.crypto.tink.subtle.EcdsaVerifyJce.FIPS
            boolean r0 = r0.isCompatible()
            if (r0 == 0) goto L19
            com.google.crypto.tink.subtle.EllipticCurves.checkPublicKey(r2)
            java.lang.String r3 = com.google.crypto.tink.subtle.SubtleUtil.toEcdsaAlgo(r3)
            r1.signatureAlgorithm = r3
            r1.publicKey = r2
            r1.encoding = r4
            return
        L19:
            java.security.GeneralSecurityException r2 = new java.security.GeneralSecurityException
            java.lang.String r3 = "Can not use ECDSA in FIPS-mode, as BoringCrypto is not available."
            r2.<init>(r3)
            throw r2
    }

    @Override // com.google.crypto.tink.PublicKeyVerify
    public void verify(byte[] r7, byte[] r8) throws java.security.GeneralSecurityException {
            r6 = this;
            com.google.crypto.tink.subtle.EllipticCurves$EcdsaEncoding r0 = r6.encoding
            com.google.crypto.tink.subtle.EllipticCurves$EcdsaEncoding r1 = com.google.crypto.tink.subtle.EllipticCurves.EcdsaEncoding.IEEE_P1363
            r2 = 2
            java.lang.String r3 = "Invalid signature"
            if (r0 != r1) goto L26
            java.security.interfaces.ECPublicKey r0 = r6.publicKey
            java.security.spec.ECParameterSpec r0 = r0.getParams()
            java.security.spec.EllipticCurve r0 = r0.getCurve()
            int r1 = r7.length
            int r0 = com.google.crypto.tink.subtle.EllipticCurves.fieldSizeInBytes(r0)
            int r0 = r0 * r2
            if (r1 != r0) goto L20
            byte[] r7 = com.google.crypto.tink.subtle.EllipticCurves.ecdsaIeee2Der(r7)
            goto L26
        L20:
            java.security.GeneralSecurityException r7 = new java.security.GeneralSecurityException
            r7.<init>(r3)
            throw r7
        L26:
            boolean r0 = com.google.crypto.tink.subtle.EllipticCurves.isValidDerEncoding(r7)
            if (r0 == 0) goto L60
            r0 = 3
            java.lang.String[] r0 = new java.lang.String[r0]
            java.lang.String r1 = "GmsCore_OpenSSL"
            r4 = 0
            r0[r4] = r1
            r1 = 1
            java.lang.String r5 = "AndroidOpenSSL"
            r0[r1] = r5
            java.lang.String r1 = "Conscrypt"
            r0[r2] = r1
            java.util.List r0 = com.google.crypto.tink.subtle.EngineFactory.toProviderList(r0)
            com.google.crypto.tink.subtle.EngineFactory<com.google.crypto.tink.subtle.EngineWrapper$TSignature, java.security.Signature> r1 = com.google.crypto.tink.subtle.EngineFactory.SIGNATURE
            java.lang.String r2 = r6.signatureAlgorithm
            java.lang.Object r0 = r1.getInstance(r2, r0)
            java.security.Signature r0 = (java.security.Signature) r0
            java.security.interfaces.ECPublicKey r1 = r6.publicKey
            r0.initVerify(r1)
            r0.update(r8)
            boolean r4 = r0.verify(r7)     // Catch: java.lang.RuntimeException -> L57
        L57:
            if (r4 == 0) goto L5a
            return
        L5a:
            java.security.GeneralSecurityException r7 = new java.security.GeneralSecurityException
            r7.<init>(r3)
            throw r7
        L60:
            java.security.GeneralSecurityException r7 = new java.security.GeneralSecurityException
            r7.<init>(r3)
            throw r7
    }
}
