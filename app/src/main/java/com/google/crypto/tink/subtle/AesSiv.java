package com.google.crypto.tink.subtle;

/* JADX INFO: loaded from: classes2.dex */
public final class AesSiv implements com.google.crypto.tink.DeterministicAead {
    private static final byte[] BLOCK_ONE = null;
    private static final byte[] BLOCK_ZERO = null;
    public static final com.google.crypto.tink.config.internal.TinkFipsUtil.AlgorithmFipsCompatibility FIPS = null;
    private static final java.util.Collection<java.lang.Integer> KEY_SIZES = null;
    private final byte[] aesCtrKey;
    private final com.google.crypto.tink.subtle.PrfAesCmac cmacForS2V;

    static {
            com.google.crypto.tink.config.internal.TinkFipsUtil$AlgorithmFipsCompatibility r0 = com.google.crypto.tink.config.internal.TinkFipsUtil.AlgorithmFipsCompatibility.ALGORITHM_NOT_FIPS
            com.google.crypto.tink.subtle.AesSiv.FIPS = r0
            r0 = 1
            java.lang.Integer[] r0 = new java.lang.Integer[r0]
            r1 = 64
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r2 = 0
            r0[r2] = r1
            java.util.List r0 = java.util.Arrays.asList(r0)
            com.google.crypto.tink.subtle.AesSiv.KEY_SIZES = r0
            r0 = 16
            byte[] r1 = new byte[r0]
            com.google.crypto.tink.subtle.AesSiv.BLOCK_ZERO = r1
            byte[] r0 = new byte[r0]
            r0 = {x0024: FILL_ARRAY_DATA , data: [0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1} // fill-array
            com.google.crypto.tink.subtle.AesSiv.BLOCK_ONE = r0
            return
    }

    public AesSiv(byte[] r4) throws java.security.GeneralSecurityException {
            r3 = this;
            r3.<init>()
            com.google.crypto.tink.config.internal.TinkFipsUtil$AlgorithmFipsCompatibility r0 = com.google.crypto.tink.subtle.AesSiv.FIPS
            boolean r0 = r0.isCompatible()
            if (r0 == 0) goto L4e
            java.util.Collection<java.lang.Integer> r0 = com.google.crypto.tink.subtle.AesSiv.KEY_SIZES
            int r1 = r4.length
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            boolean r0 = r0.contains(r1)
            if (r0 == 0) goto L32
            int r0 = r4.length
            int r0 = r0 / 2
            r1 = 0
            byte[] r0 = java.util.Arrays.copyOfRange(r4, r1, r0)
            int r1 = r4.length
            int r1 = r1 / 2
            int r2 = r4.length
            byte[] r4 = java.util.Arrays.copyOfRange(r4, r1, r2)
            r3.aesCtrKey = r4
            com.google.crypto.tink.subtle.PrfAesCmac r4 = new com.google.crypto.tink.subtle.PrfAesCmac
            r4.<init>(r0)
            r3.cmacForS2V = r4
            return
        L32:
            java.security.InvalidKeyException r0 = new java.security.InvalidKeyException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "invalid key size: "
            r1.<init>(r2)
            int r4 = r4.length
            java.lang.StringBuilder r4 = r1.append(r4)
            java.lang.String r1 = " bytes; key must have 64 bytes"
            java.lang.StringBuilder r4 = r4.append(r1)
            java.lang.String r4 = r4.toString()
            r0.<init>(r4)
            throw r0
        L4e:
            java.security.GeneralSecurityException r4 = new java.security.GeneralSecurityException
            java.lang.String r0 = "Can not use AES-SIV in FIPS-mode."
            r4.<init>(r0)
            throw r4
    }

    private byte[] s2v(byte[]... r7) throws java.security.GeneralSecurityException {
            r6 = this;
            int r0 = r7.length
            r1 = 16
            if (r0 != 0) goto Le
            com.google.crypto.tink.subtle.PrfAesCmac r7 = r6.cmacForS2V
            byte[] r0 = com.google.crypto.tink.subtle.AesSiv.BLOCK_ONE
            byte[] r7 = r7.compute(r0, r1)
            return r7
        Le:
            com.google.crypto.tink.subtle.PrfAesCmac r0 = r6.cmacForS2V
            byte[] r2 = com.google.crypto.tink.subtle.AesSiv.BLOCK_ZERO
            byte[] r0 = r0.compute(r2, r1)
            r2 = 0
            r3 = r2
        L18:
            int r4 = r7.length
            int r4 = r4 + (-1)
            if (r3 >= r4) goto L34
            r4 = r7[r3]
            if (r4 != 0) goto L23
            byte[] r4 = new byte[r2]
        L23:
            byte[] r0 = com.google.crypto.tink.mac.internal.AesUtil.dbl(r0)
            com.google.crypto.tink.subtle.PrfAesCmac r5 = r6.cmacForS2V
            byte[] r4 = r5.compute(r4, r1)
            byte[] r0 = com.google.crypto.tink.subtle.Bytes.xor(r0, r4)
            int r3 = r3 + 1
            goto L18
        L34:
            int r2 = r7.length
            int r2 = r2 + (-1)
            r7 = r7[r2]
            int r2 = r7.length
            if (r2 < r1) goto L41
            byte[] r7 = com.google.crypto.tink.subtle.Bytes.xorEnd(r7, r0)
            goto L4d
        L41:
            byte[] r7 = com.google.crypto.tink.mac.internal.AesUtil.cmacPad(r7)
            byte[] r0 = com.google.crypto.tink.mac.internal.AesUtil.dbl(r0)
            byte[] r7 = com.google.crypto.tink.subtle.Bytes.xor(r7, r0)
        L4d:
            com.google.crypto.tink.subtle.PrfAesCmac r0 = r6.cmacForS2V
            byte[] r7 = r0.compute(r7, r1)
            return r7
    }

    @Override // com.google.crypto.tink.DeterministicAead
    public byte[] decryptDeterministically(byte[] r9, byte[] r10) throws java.security.GeneralSecurityException {
            r8 = this;
            int r0 = r9.length
            r1 = 16
            if (r0 < r1) goto L6b
            com.google.crypto.tink.subtle.EngineFactory<com.google.crypto.tink.subtle.EngineWrapper$TCipher, javax.crypto.Cipher> r0 = com.google.crypto.tink.subtle.EngineFactory.CIPHER
            java.lang.String r2 = "AES/CTR/NoPadding"
            java.lang.Object r0 = r0.getInstance(r2)
            javax.crypto.Cipher r0 = (javax.crypto.Cipher) r0
            r2 = 0
            byte[] r3 = java.util.Arrays.copyOfRange(r9, r2, r1)
            java.lang.Object r4 = r3.clone()
            byte[] r4 = (byte[]) r4
            r5 = 8
            r6 = r4[r5]
            r6 = r6 & 127(0x7f, float:1.78E-43)
            byte r6 = (byte) r6
            r4[r5] = r6
            r5 = 12
            r6 = r4[r5]
            r6 = r6 & 127(0x7f, float:1.78E-43)
            byte r6 = (byte) r6
            r4[r5] = r6
            javax.crypto.spec.SecretKeySpec r5 = new javax.crypto.spec.SecretKeySpec
            byte[] r6 = r8.aesCtrKey
            java.lang.String r7 = "AES"
            r5.<init>(r6, r7)
            javax.crypto.spec.IvParameterSpec r6 = new javax.crypto.spec.IvParameterSpec
            r6.<init>(r4)
            r4 = 2
            r0.init(r4, r5, r6)
            int r4 = r9.length
            byte[] r9 = java.util.Arrays.copyOfRange(r9, r1, r4)
            byte[] r0 = r0.doFinal(r9)
            int r9 = r9.length
            if (r9 != 0) goto L54
            if (r0 != 0) goto L54
            boolean r9 = com.google.crypto.tink.subtle.SubtleUtil.isAndroid()
            if (r9 == 0) goto L54
            byte[] r0 = new byte[r2]
        L54:
            byte[][] r9 = new byte[][]{r10, r0}
            byte[] r9 = r8.s2v(r9)
            boolean r9 = com.google.crypto.tink.subtle.Bytes.equal(r3, r9)
            if (r9 == 0) goto L63
            return r0
        L63:
            javax.crypto.AEADBadTagException r9 = new javax.crypto.AEADBadTagException
            java.lang.String r10 = "Integrity check failed."
            r9.<init>(r10)
            throw r9
        L6b:
            java.security.GeneralSecurityException r9 = new java.security.GeneralSecurityException
            java.lang.String r10 = "Ciphertext too short."
            r9.<init>(r10)
            throw r9
    }

    @Override // com.google.crypto.tink.DeterministicAead
    public byte[] encryptDeterministically(byte[] r6, byte[] r7) throws java.security.GeneralSecurityException {
            r5 = this;
            int r0 = r6.length
            r1 = 2147483631(0x7fffffef, float:NaN)
            if (r0 > r1) goto L4f
            com.google.crypto.tink.subtle.EngineFactory<com.google.crypto.tink.subtle.EngineWrapper$TCipher, javax.crypto.Cipher> r0 = com.google.crypto.tink.subtle.EngineFactory.CIPHER
            java.lang.String r1 = "AES/CTR/NoPadding"
            java.lang.Object r0 = r0.getInstance(r1)
            javax.crypto.Cipher r0 = (javax.crypto.Cipher) r0
            byte[][] r7 = new byte[][]{r7, r6}
            byte[] r7 = r5.s2v(r7)
            java.lang.Object r1 = r7.clone()
            byte[] r1 = (byte[]) r1
            r2 = 8
            r3 = r1[r2]
            r3 = r3 & 127(0x7f, float:1.78E-43)
            byte r3 = (byte) r3
            r1[r2] = r3
            r2 = 12
            r3 = r1[r2]
            r3 = r3 & 127(0x7f, float:1.78E-43)
            byte r3 = (byte) r3
            r1[r2] = r3
            javax.crypto.spec.SecretKeySpec r2 = new javax.crypto.spec.SecretKeySpec
            byte[] r3 = r5.aesCtrKey
            java.lang.String r4 = "AES"
            r2.<init>(r3, r4)
            javax.crypto.spec.IvParameterSpec r3 = new javax.crypto.spec.IvParameterSpec
            r3.<init>(r1)
            r1 = 1
            r0.init(r1, r2, r3)
            byte[] r6 = r0.doFinal(r6)
            byte[][] r6 = new byte[][]{r7, r6}
            byte[] r6 = com.google.crypto.tink.subtle.Bytes.concat(r6)
            return r6
        L4f:
            java.security.GeneralSecurityException r6 = new java.security.GeneralSecurityException
            java.lang.String r7 = "plaintext too long"
            r6.<init>(r7)
            throw r6
    }
}
