package com.google.crypto.tink.subtle;

/* JADX INFO: loaded from: classes2.dex */
@com.google.errorprone.annotations.Immutable
public final class RsaSsaPssVerifyJce implements com.google.crypto.tink.PublicKeyVerify {
    public static final com.google.crypto.tink.config.internal.TinkFipsUtil.AlgorithmFipsCompatibility FIPS = null;
    private final com.google.crypto.tink.subtle.Enums.HashType mgf1Hash;
    private final java.security.interfaces.RSAPublicKey publicKey;
    private final int saltLength;
    private final com.google.crypto.tink.subtle.Enums.HashType sigHash;

    static {
            com.google.crypto.tink.config.internal.TinkFipsUtil$AlgorithmFipsCompatibility r0 = com.google.crypto.tink.config.internal.TinkFipsUtil.AlgorithmFipsCompatibility.ALGORITHM_REQUIRES_BORINGCRYPTO
            com.google.crypto.tink.subtle.RsaSsaPssVerifyJce.FIPS = r0
            return
    }

    public RsaSsaPssVerifyJce(java.security.interfaces.RSAPublicKey r2, com.google.crypto.tink.subtle.Enums.HashType r3, com.google.crypto.tink.subtle.Enums.HashType r4, int r5) throws java.security.GeneralSecurityException {
            r1 = this;
            r1.<init>()
            com.google.crypto.tink.config.internal.TinkFipsUtil$AlgorithmFipsCompatibility r0 = com.google.crypto.tink.subtle.RsaSsaPssVerifyJce.FIPS
            boolean r0 = r0.isCompatible()
            if (r0 == 0) goto L29
            com.google.crypto.tink.subtle.Validators.validateSignatureHash(r3)
            java.math.BigInteger r0 = r2.getModulus()
            int r0 = r0.bitLength()
            com.google.crypto.tink.subtle.Validators.validateRsaModulusSize(r0)
            java.math.BigInteger r0 = r2.getPublicExponent()
            com.google.crypto.tink.subtle.Validators.validateRsaPublicExponent(r0)
            r1.publicKey = r2
            r1.sigHash = r3
            r1.mgf1Hash = r4
            r1.saltLength = r5
            return
        L29:
            java.security.GeneralSecurityException r2 = new java.security.GeneralSecurityException
            java.lang.String r3 = "Can not use RSA PSS in FIPS-mode, as BoringCrypto module is not available."
            r2.<init>(r3)
            throw r2
    }

    private void emsaPssVerify(byte[] r19, byte[] r20, int r21) throws java.security.GeneralSecurityException {
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
            int r5 = r1.length
            int r6 = r0.saltLength
            int r6 = r6 + r4
            int r6 = r6 + 2
            java.lang.String r7 = "inconsistent"
            if (r5 < r6) goto Lfa
            int r6 = r1.length
            r8 = 1
            int r6 = r6 - r8
            r6 = r1[r6]
            r9 = -68
            if (r6 != r9) goto Lf4
            int r6 = r5 - r4
            int r9 = r6 + (-1)
            byte[] r10 = java.util.Arrays.copyOf(r1, r9)
            int r11 = r10.length
            int r12 = r10.length
            int r12 = r12 + r4
            byte[] r1 = java.util.Arrays.copyOfRange(r1, r11, r12)
            r12 = 0
        L44:
            long r13 = (long) r12
            r15 = r9
            long r8 = (long) r5
            r16 = 8
            long r8 = r8 * r16
            r11 = r21
            r16 = r2
            r17 = r3
            long r2 = (long) r11
            long r8 = r8 - r2
            int r2 = (r13 > r8 ? 1 : (r13 == r8 ? 0 : -1))
            if (r2 >= 0) goto L73
            int r2 = r12 / 8
            int r3 = r12 % 8
            int r3 = 7 - r3
            r2 = r10[r2]
            int r2 = r2 >> r3
            r3 = 1
            r2 = r2 & r3
            if (r2 != 0) goto L6d
            int r12 = r12 + 1
            r9 = r15
            r2 = r16
            r3 = r17
            r8 = 1
            goto L44
        L6d:
            java.security.GeneralSecurityException r1 = new java.security.GeneralSecurityException
            r1.<init>(r7)
            throw r1
        L73:
            com.google.crypto.tink.subtle.Enums$HashType r2 = r0.mgf1Hash
            r3 = r15
            byte[] r2 = com.google.crypto.tink.subtle.SubtleUtil.mgf1(r1, r3, r2)
            int r3 = r2.length
            byte[] r5 = new byte[r3]
            r11 = 0
        L7e:
            if (r11 >= r3) goto L8b
            r12 = r2[r11]
            r13 = r10[r11]
            r12 = r12 ^ r13
            byte r12 = (byte) r12
            r5[r11] = r12
            int r11 = r11 + 1
            goto L7e
        L8b:
            r2 = 0
        L8c:
            long r10 = (long) r2
            int r10 = (r10 > r8 ? 1 : (r10 == r8 ? 0 : -1))
            if (r10 > 0) goto La4
            int r10 = r2 / 8
            int r11 = r2 % 8
            int r11 = 7 - r11
            r12 = r5[r10]
            r13 = 1
            int r11 = r13 << r11
            int r11 = ~r11
            r11 = r11 & r12
            byte r11 = (byte) r11
            r5[r10] = r11
            int r2 = r2 + 1
            goto L8c
        La4:
            r2 = 0
        La5:
            int r8 = r0.saltLength
            int r9 = r6 - r8
            int r9 = r9 + (-2)
            if (r2 >= r9) goto Lba
            r8 = r5[r2]
            if (r8 != 0) goto Lb4
            int r2 = r2 + 1
            goto La5
        Lb4:
            java.security.GeneralSecurityException r1 = new java.security.GeneralSecurityException
            r1.<init>(r7)
            throw r1
        Lba:
            int r6 = r6 - r8
            int r6 = r6 + (-2)
            r2 = r5[r6]
            r6 = 1
            if (r2 != r6) goto Lee
            int r2 = r3 - r8
            byte[] r2 = java.util.Arrays.copyOfRange(r5, r2, r3)
            r3 = 8
            int r4 = r4 + r3
            int r5 = r0.saltLength
            int r5 = r5 + r4
            byte[] r5 = new byte[r5]
            r6 = r17
            int r8 = r6.length
            r9 = 0
            java.lang.System.arraycopy(r6, r9, r5, r3, r8)
            int r3 = r2.length
            java.lang.System.arraycopy(r2, r9, r5, r4, r3)
            r2 = r16
            byte[] r2 = r2.digest(r5)
            boolean r1 = com.google.crypto.tink.subtle.Bytes.equal(r2, r1)
            if (r1 == 0) goto Le8
            return
        Le8:
            java.security.GeneralSecurityException r1 = new java.security.GeneralSecurityException
            r1.<init>(r7)
            throw r1
        Lee:
            java.security.GeneralSecurityException r1 = new java.security.GeneralSecurityException
            r1.<init>(r7)
            throw r1
        Lf4:
            java.security.GeneralSecurityException r1 = new java.security.GeneralSecurityException
            r1.<init>(r7)
            throw r1
        Lfa:
            java.security.GeneralSecurityException r1 = new java.security.GeneralSecurityException
            r1.<init>(r7)
            throw r1
    }

    @Override // com.google.crypto.tink.PublicKeyVerify
    public void verify(byte[] r6, byte[] r7) throws java.security.GeneralSecurityException {
            r5 = this;
            java.security.interfaces.RSAPublicKey r0 = r5.publicKey
            java.math.BigInteger r0 = r0.getPublicExponent()
            java.security.interfaces.RSAPublicKey r1 = r5.publicKey
            java.math.BigInteger r1 = r1.getModulus()
            int r2 = r1.bitLength()
            int r2 = r2 + 7
            int r2 = r2 / 8
            int r3 = r1.bitLength()
            int r3 = r3 + 6
            int r3 = r3 / 8
            int r4 = r6.length
            if (r2 != r4) goto L43
            java.math.BigInteger r6 = com.google.crypto.tink.subtle.SubtleUtil.bytes2Integer(r6)
            int r2 = r6.compareTo(r1)
            if (r2 >= 0) goto L3b
            java.math.BigInteger r6 = r6.modPow(r0, r1)
            byte[] r6 = com.google.crypto.tink.subtle.SubtleUtil.integer2Bytes(r6, r3)
            int r0 = r1.bitLength()
            int r0 = r0 + (-1)
            r5.emsaPssVerify(r7, r6, r0)
            return
        L3b:
            java.security.GeneralSecurityException r6 = new java.security.GeneralSecurityException
            java.lang.String r7 = "signature out of range"
            r6.<init>(r7)
            throw r6
        L43:
            java.security.GeneralSecurityException r6 = new java.security.GeneralSecurityException
            java.lang.String r7 = "invalid signature's length"
            r6.<init>(r7)
            throw r6
    }
}
