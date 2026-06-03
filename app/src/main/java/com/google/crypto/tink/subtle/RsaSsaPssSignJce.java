package com.google.crypto.tink.subtle;

/* JADX INFO: loaded from: classes2.dex */
@com.google.errorprone.annotations.Immutable
public final class RsaSsaPssSignJce implements com.google.crypto.tink.PublicKeySign {
    public static final com.google.crypto.tink.config.internal.TinkFipsUtil.AlgorithmFipsCompatibility FIPS = null;
    private static final java.lang.String RAW_RSA_ALGORITHM = "RSA/ECB/NOPADDING";
    private final com.google.crypto.tink.subtle.Enums.HashType mgf1Hash;
    private final java.security.interfaces.RSAPrivateCrtKey privateKey;
    private final java.security.interfaces.RSAPublicKey publicKey;
    private final int saltLength;
    private final com.google.crypto.tink.subtle.Enums.HashType sigHash;

    static {
            com.google.crypto.tink.config.internal.TinkFipsUtil$AlgorithmFipsCompatibility r0 = com.google.crypto.tink.config.internal.TinkFipsUtil.AlgorithmFipsCompatibility.ALGORITHM_REQUIRES_BORINGCRYPTO
            com.google.crypto.tink.subtle.RsaSsaPssSignJce.FIPS = r0
            return
    }

    public RsaSsaPssSignJce(java.security.interfaces.RSAPrivateCrtKey r4, com.google.crypto.tink.subtle.Enums.HashType r5, com.google.crypto.tink.subtle.Enums.HashType r6, int r7) throws java.security.GeneralSecurityException {
            r3 = this;
            r3.<init>()
            com.google.crypto.tink.config.internal.TinkFipsUtil$AlgorithmFipsCompatibility r0 = com.google.crypto.tink.subtle.RsaSsaPssSignJce.FIPS
            boolean r0 = r0.isCompatible()
            if (r0 == 0) goto L48
            com.google.crypto.tink.subtle.Validators.validateSignatureHash(r5)
            java.math.BigInteger r0 = r4.getModulus()
            int r0 = r0.bitLength()
            com.google.crypto.tink.subtle.Validators.validateRsaModulusSize(r0)
            java.math.BigInteger r0 = r4.getPublicExponent()
            com.google.crypto.tink.subtle.Validators.validateRsaPublicExponent(r0)
            r3.privateKey = r4
            com.google.crypto.tink.subtle.EngineFactory<com.google.crypto.tink.subtle.EngineWrapper$TKeyFactory, java.security.KeyFactory> r0 = com.google.crypto.tink.subtle.EngineFactory.KEY_FACTORY
            java.lang.String r1 = "RSA"
            java.lang.Object r0 = r0.getInstance(r1)
            java.security.KeyFactory r0 = (java.security.KeyFactory) r0
            java.security.spec.RSAPublicKeySpec r1 = new java.security.spec.RSAPublicKeySpec
            java.math.BigInteger r2 = r4.getModulus()
            java.math.BigInteger r4 = r4.getPublicExponent()
            r1.<init>(r2, r4)
            java.security.PublicKey r4 = r0.generatePublic(r1)
            java.security.interfaces.RSAPublicKey r4 = (java.security.interfaces.RSAPublicKey) r4
            r3.publicKey = r4
            r3.sigHash = r5
            r3.mgf1Hash = r6
            r3.saltLength = r7
            return
        L48:
            java.security.GeneralSecurityException r4 = new java.security.GeneralSecurityException
            java.lang.String r5 = "Can not use RSA PSS in FIPS-mode, as BoringCrypto module is not available."
            r4.<init>(r5)
            throw r4
    }

    private byte[] emsaPssEncode(byte[] r19, int r20) throws java.security.GeneralSecurityException {
            r18 = this;
            r0 = r18
            r1 = r20
            com.google.crypto.tink.subtle.Enums$HashType r2 = r0.sigHash
            com.google.crypto.tink.subtle.Validators.validateSignatureHash(r2)
            com.google.crypto.tink.subtle.EngineFactory<com.google.crypto.tink.subtle.EngineWrapper$TMessageDigest, java.security.MessageDigest> r2 = com.google.crypto.tink.subtle.EngineFactory.MESSAGE_DIGEST
            com.google.crypto.tink.subtle.Enums$HashType r3 = r0.sigHash
            java.lang.String r3 = com.google.crypto.tink.subtle.SubtleUtil.toDigestAlgo(r3)
            java.lang.Object r2 = r2.getInstance(r3)
            java.security.MessageDigest r2 = (java.security.MessageDigest) r2
            r3 = r19
            byte[] r3 = r2.digest(r3)
            int r4 = r2.getDigestLength()
            int r5 = r1 + (-1)
            r6 = 8
            int r5 = r5 / r6
            r7 = 1
            int r5 = r5 + r7
            int r8 = r0.saltLength
            int r9 = r4 + r8
            int r9 = r9 + 2
            if (r5 < r9) goto La5
            byte[] r8 = com.google.crypto.tink.subtle.Random.randBytes(r8)
            int r9 = r4 + 8
            int r10 = r0.saltLength
            int r10 = r10 + r9
            byte[] r10 = new byte[r10]
            r11 = 0
            java.lang.System.arraycopy(r3, r11, r10, r6, r4)
            int r3 = r8.length
            java.lang.System.arraycopy(r8, r11, r10, r9, r3)
            byte[] r2 = r2.digest(r10)
            int r3 = r5 - r4
            int r3 = r3 - r7
            byte[] r6 = new byte[r3]
            int r9 = r0.saltLength
            int r10 = r5 - r9
            int r10 = r10 - r4
            int r10 = r10 + (-2)
            r6[r10] = r7
            int r9 = r5 - r9
            int r9 = r9 - r4
            int r9 = r9 - r7
            int r10 = r8.length
            java.lang.System.arraycopy(r8, r11, r6, r9, r10)
            com.google.crypto.tink.subtle.Enums$HashType r8 = r0.mgf1Hash
            byte[] r8 = com.google.crypto.tink.subtle.SubtleUtil.mgf1(r2, r3, r8)
            byte[] r9 = new byte[r3]
            r10 = r11
        L66:
            if (r10 >= r3) goto L73
            r12 = r6[r10]
            r13 = r8[r10]
            r12 = r12 ^ r13
            byte r12 = (byte) r12
            r9[r10] = r12
            int r10 = r10 + 1
            goto L66
        L73:
            r6 = r11
        L74:
            long r12 = (long) r6
            long r14 = (long) r5
            r16 = 8
            long r14 = r14 * r16
            long r7 = (long) r1
            long r14 = r14 - r7
            int r7 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r7 >= 0) goto L94
            int r7 = r6 / 8
            int r8 = r6 % 8
            int r8 = 7 - r8
            r10 = r9[r7]
            r12 = 1
            int r8 = r12 << r8
            int r8 = ~r8
            r8 = r8 & r10
            byte r8 = (byte) r8
            r9[r7] = r8
            int r6 = r6 + 1
            r7 = r12
            goto L74
        L94:
            int r4 = r4 + r3
            int r1 = r4 + 1
            byte[] r1 = new byte[r1]
            java.lang.System.arraycopy(r9, r11, r1, r11, r3)
            int r5 = r2.length
            java.lang.System.arraycopy(r2, r11, r1, r3, r5)
            r2 = -68
            r1[r4] = r2
            return r1
        La5:
            java.security.GeneralSecurityException r1 = new java.security.GeneralSecurityException
            java.lang.String r2 = "encoding error"
            r1.<init>(r2)
            throw r1
    }

    private byte[] rsasp1(byte[] r5) throws java.security.GeneralSecurityException {
            r4 = this;
            com.google.crypto.tink.subtle.EngineFactory<com.google.crypto.tink.subtle.EngineWrapper$TCipher, javax.crypto.Cipher> r0 = com.google.crypto.tink.subtle.EngineFactory.CIPHER
            java.lang.String r1 = "RSA/ECB/NOPADDING"
            java.lang.Object r0 = r0.getInstance(r1)
            javax.crypto.Cipher r0 = (javax.crypto.Cipher) r0
            r2 = 2
            java.security.interfaces.RSAPrivateCrtKey r3 = r4.privateKey
            r0.init(r2, r3)
            byte[] r0 = r0.doFinal(r5)
            com.google.crypto.tink.subtle.EngineFactory<com.google.crypto.tink.subtle.EngineWrapper$TCipher, javax.crypto.Cipher> r2 = com.google.crypto.tink.subtle.EngineFactory.CIPHER
            java.lang.Object r1 = r2.getInstance(r1)
            javax.crypto.Cipher r1 = (javax.crypto.Cipher) r1
            java.security.interfaces.RSAPublicKey r2 = r4.publicKey
            r3 = 1
            r1.init(r3, r2)
            byte[] r1 = r1.doFinal(r0)
            java.math.BigInteger r2 = new java.math.BigInteger
            r2.<init>(r3, r5)
            java.math.BigInteger r5 = new java.math.BigInteger
            r5.<init>(r3, r1)
            boolean r5 = r2.equals(r5)
            if (r5 == 0) goto L37
            return r0
        L37:
            java.lang.RuntimeException r5 = new java.lang.RuntimeException
            java.lang.String r0 = "Security bug: RSA signature computation error"
            r5.<init>(r0)
            throw r5
    }

    @Override // com.google.crypto.tink.PublicKeySign
    public byte[] sign(byte[] r2) throws java.security.GeneralSecurityException {
            r1 = this;
            java.security.interfaces.RSAPublicKey r0 = r1.publicKey
            java.math.BigInteger r0 = r0.getModulus()
            int r0 = r0.bitLength()
            int r0 = r0 + (-1)
            byte[] r2 = r1.emsaPssEncode(r2, r0)
            byte[] r2 = r1.rsasp1(r2)
            return r2
    }
}
