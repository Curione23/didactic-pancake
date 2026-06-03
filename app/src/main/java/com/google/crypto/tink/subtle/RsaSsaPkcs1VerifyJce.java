package com.google.crypto.tink.subtle;

/* JADX INFO: loaded from: classes2.dex */
@com.google.errorprone.annotations.Immutable
public final class RsaSsaPkcs1VerifyJce implements com.google.crypto.tink.PublicKeyVerify {
    private static final java.lang.String ASN_PREFIX_SHA256 = "3031300d060960864801650304020105000420";
    private static final java.lang.String ASN_PREFIX_SHA384 = "3041300d060960864801650304020205000430";
    private static final java.lang.String ASN_PREFIX_SHA512 = "3051300d060960864801650304020305000440";
    public static final com.google.crypto.tink.config.internal.TinkFipsUtil.AlgorithmFipsCompatibility FIPS = null;
    private final com.google.crypto.tink.subtle.Enums.HashType hash;
    private final java.security.interfaces.RSAPublicKey publicKey;

    /* JADX INFO: renamed from: com.google.crypto.tink.subtle.RsaSsaPkcs1VerifyJce$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$google$crypto$tink$subtle$Enums$HashType = null;

        static {
                com.google.crypto.tink.subtle.Enums$HashType[] r0 = com.google.crypto.tink.subtle.Enums.HashType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.google.crypto.tink.subtle.RsaSsaPkcs1VerifyJce.AnonymousClass1.$SwitchMap$com$google$crypto$tink$subtle$Enums$HashType = r0
                com.google.crypto.tink.subtle.Enums$HashType r1 = com.google.crypto.tink.subtle.Enums.HashType.SHA256     // Catch: java.lang.NoSuchFieldError -> L12
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L12
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L12
            L12:
                int[] r0 = com.google.crypto.tink.subtle.RsaSsaPkcs1VerifyJce.AnonymousClass1.$SwitchMap$com$google$crypto$tink$subtle$Enums$HashType     // Catch: java.lang.NoSuchFieldError -> L1d
                com.google.crypto.tink.subtle.Enums$HashType r1 = com.google.crypto.tink.subtle.Enums.HashType.SHA384     // Catch: java.lang.NoSuchFieldError -> L1d
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L1d
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L1d
            L1d:
                int[] r0 = com.google.crypto.tink.subtle.RsaSsaPkcs1VerifyJce.AnonymousClass1.$SwitchMap$com$google$crypto$tink$subtle$Enums$HashType     // Catch: java.lang.NoSuchFieldError -> L28
                com.google.crypto.tink.subtle.Enums$HashType r1 = com.google.crypto.tink.subtle.Enums.HashType.SHA512     // Catch: java.lang.NoSuchFieldError -> L28
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L28
                r2 = 3
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L28
            L28:
                return
        }
    }

    static {
            com.google.crypto.tink.config.internal.TinkFipsUtil$AlgorithmFipsCompatibility r0 = com.google.crypto.tink.config.internal.TinkFipsUtil.AlgorithmFipsCompatibility.ALGORITHM_REQUIRES_BORINGCRYPTO
            com.google.crypto.tink.subtle.RsaSsaPkcs1VerifyJce.FIPS = r0
            return
    }

    public RsaSsaPkcs1VerifyJce(java.security.interfaces.RSAPublicKey r2, com.google.crypto.tink.subtle.Enums.HashType r3) throws java.security.GeneralSecurityException {
            r1 = this;
            r1.<init>()
            com.google.crypto.tink.config.internal.TinkFipsUtil$AlgorithmFipsCompatibility r0 = com.google.crypto.tink.subtle.RsaSsaPkcs1VerifyJce.FIPS
            boolean r0 = r0.isCompatible()
            if (r0 == 0) goto L25
            com.google.crypto.tink.subtle.Validators.validateSignatureHash(r3)
            java.math.BigInteger r0 = r2.getModulus()
            int r0 = r0.bitLength()
            com.google.crypto.tink.subtle.Validators.validateRsaModulusSize(r0)
            java.math.BigInteger r0 = r2.getPublicExponent()
            com.google.crypto.tink.subtle.Validators.validateRsaPublicExponent(r0)
            r1.publicKey = r2
            r1.hash = r3
            return
        L25:
            java.security.GeneralSecurityException r2 = new java.security.GeneralSecurityException
            java.lang.String r3 = "Can not use RSA-PKCS1.5 in FIPS-mode, as BoringCrypto module is not available."
            r2.<init>(r3)
            throw r2
    }

    private byte[] emsaPkcs1(byte[] r8, int r9, com.google.crypto.tink.subtle.Enums.HashType r10) throws java.security.GeneralSecurityException {
            r7 = this;
            com.google.crypto.tink.subtle.Validators.validateSignatureHash(r10)
            com.google.crypto.tink.subtle.EngineFactory<com.google.crypto.tink.subtle.EngineWrapper$TMessageDigest, java.security.MessageDigest> r0 = com.google.crypto.tink.subtle.EngineFactory.MESSAGE_DIGEST
            com.google.crypto.tink.subtle.Enums$HashType r1 = r7.hash
            java.lang.String r1 = com.google.crypto.tink.subtle.SubtleUtil.toDigestAlgo(r1)
            java.lang.Object r0 = r0.getInstance(r1)
            java.security.MessageDigest r0 = (java.security.MessageDigest) r0
            r0.update(r8)
            byte[] r8 = r0.digest()
            byte[] r10 = r7.toAsnPrefix(r10)
            int r0 = r10.length
            int r1 = r8.length
            int r0 = r0 + r1
            int r1 = r0 + 11
            if (r9 < r1) goto L4b
            byte[] r1 = new byte[r9]
            r2 = 0
            r1[r2] = r2
            r3 = 1
            r1[r3] = r3
            r3 = 2
            r4 = r2
        L2d:
            int r5 = r9 - r0
            int r5 = r5 + (-3)
            if (r4 >= r5) goto L3c
            int r5 = r3 + 1
            r6 = -1
            r1[r3] = r6
            int r4 = r4 + 1
            r3 = r5
            goto L2d
        L3c:
            int r9 = r3 + 1
            r1[r3] = r2
            int r0 = r10.length
            java.lang.System.arraycopy(r10, r2, r1, r9, r0)
            int r10 = r10.length
            int r9 = r9 + r10
            int r10 = r8.length
            java.lang.System.arraycopy(r8, r2, r1, r9, r10)
            return r1
        L4b:
            java.security.GeneralSecurityException r8 = new java.security.GeneralSecurityException
            java.lang.String r9 = "intended encoded message length too short"
            r8.<init>(r9)
            throw r8
    }

    private byte[] toAsnPrefix(com.google.crypto.tink.subtle.Enums.HashType r4) throws java.security.GeneralSecurityException {
            r3 = this;
            int[] r0 = com.google.crypto.tink.subtle.RsaSsaPkcs1VerifyJce.AnonymousClass1.$SwitchMap$com$google$crypto$tink$subtle$Enums$HashType
            int r1 = r4.ordinal()
            r0 = r0[r1]
            r1 = 1
            if (r0 == r1) goto L34
            r1 = 2
            if (r0 == r1) goto L2d
            r1 = 3
            if (r0 != r1) goto L18
            java.lang.String r4 = "3051300d060960864801650304020305000440"
            byte[] r4 = com.google.crypto.tink.subtle.Hex.decode(r4)
            return r4
        L18:
            java.security.GeneralSecurityException r0 = new java.security.GeneralSecurityException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Unsupported hash "
            r1.<init>(r2)
            java.lang.StringBuilder r4 = r1.append(r4)
            java.lang.String r4 = r4.toString()
            r0.<init>(r4)
            throw r0
        L2d:
            java.lang.String r4 = "3041300d060960864801650304020205000430"
            byte[] r4 = com.google.crypto.tink.subtle.Hex.decode(r4)
            return r4
        L34:
            java.lang.String r4 = "3031300d060960864801650304020105000420"
            byte[] r4 = com.google.crypto.tink.subtle.Hex.decode(r4)
            return r4
    }

    @Override // com.google.crypto.tink.PublicKeyVerify
    public void verify(byte[] r5, byte[] r6) throws java.security.GeneralSecurityException {
            r4 = this;
            java.security.interfaces.RSAPublicKey r0 = r4.publicKey
            java.math.BigInteger r0 = r0.getPublicExponent()
            java.security.interfaces.RSAPublicKey r1 = r4.publicKey
            java.math.BigInteger r1 = r1.getModulus()
            int r2 = r1.bitLength()
            int r2 = r2 + 7
            int r2 = r2 / 8
            int r3 = r5.length
            if (r2 != r3) goto L46
            java.math.BigInteger r5 = com.google.crypto.tink.subtle.SubtleUtil.bytes2Integer(r5)
            int r3 = r5.compareTo(r1)
            if (r3 >= 0) goto L3e
            java.math.BigInteger r5 = r5.modPow(r0, r1)
            byte[] r5 = com.google.crypto.tink.subtle.SubtleUtil.integer2Bytes(r5, r2)
            com.google.crypto.tink.subtle.Enums$HashType r0 = r4.hash
            byte[] r6 = r4.emsaPkcs1(r6, r2, r0)
            boolean r5 = com.google.crypto.tink.subtle.Bytes.equal(r5, r6)
            if (r5 == 0) goto L36
            return
        L36:
            java.security.GeneralSecurityException r5 = new java.security.GeneralSecurityException
            java.lang.String r6 = "invalid signature"
            r5.<init>(r6)
            throw r5
        L3e:
            java.security.GeneralSecurityException r5 = new java.security.GeneralSecurityException
            java.lang.String r6 = "signature out of range"
            r5.<init>(r6)
            throw r5
        L46:
            java.security.GeneralSecurityException r5 = new java.security.GeneralSecurityException
            java.lang.String r6 = "invalid signature's length"
            r5.<init>(r6)
            throw r5
    }
}
