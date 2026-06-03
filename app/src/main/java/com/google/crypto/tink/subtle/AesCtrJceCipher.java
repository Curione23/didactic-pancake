package com.google.crypto.tink.subtle;

/* JADX INFO: loaded from: classes2.dex */
public final class AesCtrJceCipher implements com.google.crypto.tink.subtle.IndCpaCipher {
    private static final java.lang.String CIPHER_ALGORITHM = "AES/CTR/NoPadding";
    public static final com.google.crypto.tink.config.internal.TinkFipsUtil.AlgorithmFipsCompatibility FIPS = null;
    private static final java.lang.String KEY_ALGORITHM = "AES";
    private static final int MIN_IV_SIZE_IN_BYTES = 12;
    private static final java.lang.ThreadLocal<javax.crypto.Cipher> localCipher = null;
    private final int blockSize;
    private final int ivSize;
    private final javax.crypto.spec.SecretKeySpec keySpec;


    static {
            com.google.crypto.tink.config.internal.TinkFipsUtil$AlgorithmFipsCompatibility r0 = com.google.crypto.tink.config.internal.TinkFipsUtil.AlgorithmFipsCompatibility.ALGORITHM_REQUIRES_BORINGCRYPTO
            com.google.crypto.tink.subtle.AesCtrJceCipher.FIPS = r0
            com.google.crypto.tink.subtle.AesCtrJceCipher$1 r0 = new com.google.crypto.tink.subtle.AesCtrJceCipher$1
            r0.<init>()
            com.google.crypto.tink.subtle.AesCtrJceCipher.localCipher = r0
            return
    }

    public AesCtrJceCipher(byte[] r3, int r4) throws java.security.GeneralSecurityException {
            r2 = this;
            r2.<init>()
            com.google.crypto.tink.config.internal.TinkFipsUtil$AlgorithmFipsCompatibility r0 = com.google.crypto.tink.subtle.AesCtrJceCipher.FIPS
            boolean r0 = r0.isCompatible()
            if (r0 == 0) goto L37
            int r0 = r3.length
            com.google.crypto.tink.subtle.Validators.validateAesKeySize(r0)
            javax.crypto.spec.SecretKeySpec r0 = new javax.crypto.spec.SecretKeySpec
            java.lang.String r1 = "AES"
            r0.<init>(r3, r1)
            r2.keySpec = r0
            java.lang.ThreadLocal<javax.crypto.Cipher> r3 = com.google.crypto.tink.subtle.AesCtrJceCipher.localCipher
            java.lang.Object r3 = r3.get()
            javax.crypto.Cipher r3 = (javax.crypto.Cipher) r3
            int r3 = r3.getBlockSize()
            r2.blockSize = r3
            r0 = 12
            if (r4 < r0) goto L2f
            if (r4 > r3) goto L2f
            r2.ivSize = r4
            return
        L2f:
            java.security.GeneralSecurityException r3 = new java.security.GeneralSecurityException
            java.lang.String r4 = "invalid IV size"
            r3.<init>(r4)
            throw r3
        L37:
            java.security.GeneralSecurityException r3 = new java.security.GeneralSecurityException
            java.lang.String r4 = "Can not use AES-CTR in FIPS-mode, as BoringCrypto module is not available."
            r3.<init>(r4)
            throw r3
    }

    private void doCtr(byte[] r8, int r9, int r10, byte[] r11, int r12, byte[] r13, boolean r14) throws java.security.GeneralSecurityException {
            r7 = this;
            java.lang.ThreadLocal<javax.crypto.Cipher> r0 = com.google.crypto.tink.subtle.AesCtrJceCipher.localCipher
            java.lang.Object r0 = r0.get()
            r1 = r0
            javax.crypto.Cipher r1 = (javax.crypto.Cipher) r1
            int r0 = r7.blockSize
            byte[] r0 = new byte[r0]
            r2 = 0
            int r3 = r7.ivSize
            java.lang.System.arraycopy(r13, r2, r0, r2, r3)
            javax.crypto.spec.IvParameterSpec r13 = new javax.crypto.spec.IvParameterSpec
            r13.<init>(r0)
            if (r14 == 0) goto L21
            r14 = 1
            javax.crypto.spec.SecretKeySpec r0 = r7.keySpec
            r1.init(r14, r0, r13)
            goto L27
        L21:
            r14 = 2
            javax.crypto.spec.SecretKeySpec r0 = r7.keySpec
            r1.init(r14, r0, r13)
        L27:
            r2 = r8
            r3 = r9
            r4 = r10
            r5 = r11
            r6 = r12
            int r8 = r1.doFinal(r2, r3, r4, r5, r6)
            if (r8 != r10) goto L33
            return
        L33:
            java.security.GeneralSecurityException r8 = new java.security.GeneralSecurityException
            java.lang.String r9 = "stored output's length does not match input's length"
            r8.<init>(r9)
            throw r8
    }

    @Override // com.google.crypto.tink.subtle.IndCpaCipher
    public byte[] decrypt(byte[] r11) throws java.security.GeneralSecurityException {
            r10 = this;
            int r0 = r11.length
            int r1 = r10.ivSize
            if (r0 < r1) goto L1d
            byte[] r8 = new byte[r1]
            r0 = 0
            java.lang.System.arraycopy(r11, r0, r8, r0, r1)
            int r0 = r11.length
            int r4 = r10.ivSize
            int r0 = r0 - r4
            byte[] r0 = new byte[r0]
            int r1 = r11.length
            int r5 = r1 - r4
            r7 = 0
            r9 = 0
            r2 = r10
            r3 = r11
            r6 = r0
            r2.doCtr(r3, r4, r5, r6, r7, r8, r9)
            return r0
        L1d:
            java.security.GeneralSecurityException r11 = new java.security.GeneralSecurityException
            java.lang.String r0 = "ciphertext too short"
            r11.<init>(r0)
            throw r11
    }

    @Override // com.google.crypto.tink.subtle.IndCpaCipher
    public byte[] encrypt(byte[] r11) throws java.security.GeneralSecurityException {
            r10 = this;
            int r0 = r11.length
            int r1 = r10.ivSize
            r2 = 2147483647(0x7fffffff, float:NaN)
            int r3 = r2 - r1
            if (r0 > r3) goto L24
            int r0 = r11.length
            int r0 = r0 + r1
            byte[] r0 = new byte[r0]
            byte[] r8 = com.google.crypto.tink.subtle.Random.randBytes(r1)
            int r1 = r10.ivSize
            r2 = 0
            java.lang.System.arraycopy(r8, r2, r0, r2, r1)
            int r5 = r11.length
            int r7 = r10.ivSize
            r9 = 1
            r4 = 0
            r2 = r10
            r3 = r11
            r6 = r0
            r2.doCtr(r3, r4, r5, r6, r7, r8, r9)
            return r0
        L24:
            java.security.GeneralSecurityException r11 = new java.security.GeneralSecurityException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "plaintext length can not exceed "
            r0.<init>(r1)
            int r1 = r10.ivSize
            int r2 = r2 - r1
            java.lang.StringBuilder r0 = r0.append(r2)
            java.lang.String r0 = r0.toString()
            r11.<init>(r0)
            throw r11
    }
}
