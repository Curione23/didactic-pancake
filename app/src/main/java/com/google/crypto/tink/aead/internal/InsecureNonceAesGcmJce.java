package com.google.crypto.tink.aead.internal;

/* JADX INFO: loaded from: classes2.dex */
public final class InsecureNonceAesGcmJce {
    public static final com.google.crypto.tink.config.internal.TinkFipsUtil.AlgorithmFipsCompatibility FIPS = null;
    public static final int IV_SIZE_IN_BYTES = 12;
    public static final int TAG_SIZE_IN_BYTES = 16;
    private static final java.lang.ThreadLocal<javax.crypto.Cipher> localCipher = null;
    private final javax.crypto.SecretKey keySpec;
    private final boolean prependIv;


    static {
            com.google.crypto.tink.config.internal.TinkFipsUtil$AlgorithmFipsCompatibility r0 = com.google.crypto.tink.config.internal.TinkFipsUtil.AlgorithmFipsCompatibility.ALGORITHM_REQUIRES_BORINGCRYPTO
            com.google.crypto.tink.aead.internal.InsecureNonceAesGcmJce.FIPS = r0
            com.google.crypto.tink.aead.internal.InsecureNonceAesGcmJce$1 r0 = new com.google.crypto.tink.aead.internal.InsecureNonceAesGcmJce$1
            r0.<init>()
            com.google.crypto.tink.aead.internal.InsecureNonceAesGcmJce.localCipher = r0
            return
    }

    public InsecureNonceAesGcmJce(byte[] r3, boolean r4) throws java.security.GeneralSecurityException {
            r2 = this;
            r2.<init>()
            com.google.crypto.tink.config.internal.TinkFipsUtil$AlgorithmFipsCompatibility r0 = com.google.crypto.tink.aead.internal.InsecureNonceAesGcmJce.FIPS
            boolean r0 = r0.isCompatible()
            if (r0 == 0) goto L1b
            int r0 = r3.length
            com.google.crypto.tink.subtle.Validators.validateAesKeySize(r0)
            javax.crypto.spec.SecretKeySpec r0 = new javax.crypto.spec.SecretKeySpec
            java.lang.String r1 = "AES"
            r0.<init>(r3, r1)
            r2.keySpec = r0
            r2.prependIv = r4
            return
        L1b:
            java.security.GeneralSecurityException r3 = new java.security.GeneralSecurityException
            java.lang.String r4 = "Can not use AES-GCM in FIPS-mode, as BoringCrypto module is not available."
            r3.<init>(r4)
            throw r3
    }

    private static java.security.spec.AlgorithmParameterSpec getParams(byte[] r2) throws java.security.GeneralSecurityException {
            r0 = 0
            int r1 = r2.length
            java.security.spec.AlgorithmParameterSpec r2 = getParams(r2, r0, r1)
            return r2
    }

    private static java.security.spec.AlgorithmParameterSpec getParams(byte[] r2, int r3, int r4) throws java.security.GeneralSecurityException {
            boolean r0 = com.google.crypto.tink.subtle.SubtleUtil.isAndroid()
            if (r0 == 0) goto L14
            int r0 = com.google.crypto.tink.subtle.SubtleUtil.androidApiLevel()
            r1 = 19
            if (r0 > r1) goto L14
            javax.crypto.spec.IvParameterSpec r0 = new javax.crypto.spec.IvParameterSpec
            r0.<init>(r2, r3, r4)
            return r0
        L14:
            javax.crypto.spec.GCMParameterSpec r0 = new javax.crypto.spec.GCMParameterSpec
            r1 = 128(0x80, float:1.8E-43)
            r0.<init>(r1, r2, r3, r4)
            return r0
    }

    public byte[] decrypt(byte[] r7, byte[] r8, byte[] r9) throws java.security.GeneralSecurityException {
            r6 = this;
            int r0 = r7.length
            r1 = 12
            if (r0 != r1) goto L69
            boolean r0 = r6.prependIv
            if (r0 == 0) goto Lc
            r2 = 28
            goto Le
        Lc:
            r2 = 16
        Le:
            int r3 = r8.length
            if (r3 < r2) goto L61
            r2 = 0
            if (r0 == 0) goto L2b
            java.nio.ByteBuffer r0 = java.nio.ByteBuffer.wrap(r7)
            java.nio.ByteBuffer r3 = java.nio.ByteBuffer.wrap(r8, r2, r1)
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L23
            goto L2b
        L23:
            java.security.GeneralSecurityException r7 = new java.security.GeneralSecurityException
            java.lang.String r8 = "iv does not match prepended iv"
            r7.<init>(r8)
            throw r7
        L2b:
            java.security.spec.AlgorithmParameterSpec r7 = getParams(r7)
            java.lang.ThreadLocal<javax.crypto.Cipher> r0 = com.google.crypto.tink.aead.internal.InsecureNonceAesGcmJce.localCipher
            java.lang.Object r3 = r0.get()
            javax.crypto.Cipher r3 = (javax.crypto.Cipher) r3
            r4 = 2
            javax.crypto.SecretKey r5 = r6.keySpec
            r3.init(r4, r5, r7)
            if (r9 == 0) goto L4b
            int r7 = r9.length
            if (r7 == 0) goto L4b
            java.lang.Object r7 = r0.get()
            javax.crypto.Cipher r7 = (javax.crypto.Cipher) r7
            r7.updateAAD(r9)
        L4b:
            boolean r7 = r6.prependIv
            if (r7 == 0) goto L50
            r2 = r1
        L50:
            if (r7 == 0) goto L55
            int r7 = r8.length
            int r7 = r7 - r1
            goto L56
        L55:
            int r7 = r8.length
        L56:
            java.lang.Object r9 = r0.get()
            javax.crypto.Cipher r9 = (javax.crypto.Cipher) r9
            byte[] r7 = r9.doFinal(r8, r2, r7)
            return r7
        L61:
            java.security.GeneralSecurityException r7 = new java.security.GeneralSecurityException
            java.lang.String r8 = "ciphertext too short"
            r7.<init>(r8)
            throw r7
        L69:
            java.security.GeneralSecurityException r7 = new java.security.GeneralSecurityException
            java.lang.String r8 = "iv is wrong size"
            r7.<init>(r8)
            throw r7
    }

    public byte[] encrypt(byte[] r11, byte[] r12, byte[] r13) throws java.security.GeneralSecurityException {
            r10 = this;
            int r0 = r11.length
            r1 = 12
            if (r0 != r1) goto L7c
            int r0 = r12.length
            r2 = 2147483619(0x7fffffe3, float:NaN)
            if (r0 > r2) goto L74
            boolean r0 = r10.prependIv
            r2 = 16
            if (r0 == 0) goto L15
            int r3 = r12.length
            int r3 = r3 + 28
            goto L17
        L15:
            int r3 = r12.length
            int r3 = r3 + r2
        L17:
            byte[] r3 = new byte[r3]
            r4 = 0
            if (r0 == 0) goto L1f
            java.lang.System.arraycopy(r11, r4, r3, r4, r1)
        L1f:
            java.security.spec.AlgorithmParameterSpec r11 = getParams(r11)
            java.lang.ThreadLocal<javax.crypto.Cipher> r0 = com.google.crypto.tink.aead.internal.InsecureNonceAesGcmJce.localCipher
            java.lang.Object r5 = r0.get()
            javax.crypto.Cipher r5 = (javax.crypto.Cipher) r5
            r6 = 1
            javax.crypto.SecretKey r7 = r10.keySpec
            r5.init(r6, r7, r11)
            if (r13 == 0) goto L3f
            int r11 = r13.length
            if (r11 == 0) goto L3f
            java.lang.Object r11 = r0.get()
            javax.crypto.Cipher r11 = (javax.crypto.Cipher) r11
            r11.updateAAD(r13)
        L3f:
            boolean r11 = r10.prependIv
            if (r11 == 0) goto L45
            r9 = r1
            goto L46
        L45:
            r9 = r4
        L46:
            java.lang.Object r11 = r0.get()
            r4 = r11
            javax.crypto.Cipher r4 = (javax.crypto.Cipher) r4
            r6 = 0
            int r7 = r12.length
            r5 = r12
            r8 = r3
            int r11 = r4.doFinal(r5, r6, r7, r8, r9)
            int r13 = r12.length
            int r13 = r13 + r2
            if (r11 != r13) goto L5a
            return r3
        L5a:
            int r12 = r12.length
            int r11 = r11 - r12
            java.security.GeneralSecurityException r12 = new java.security.GeneralSecurityException
            java.lang.Integer r13 = java.lang.Integer.valueOf(r2)
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            java.lang.Object[] r11 = new java.lang.Object[]{r13, r11}
            java.lang.String r13 = "encryption failed; GCM tag must be %s bytes, but got only %s bytes"
            java.lang.String r11 = java.lang.String.format(r13, r11)
            r12.<init>(r11)
            throw r12
        L74:
            java.security.GeneralSecurityException r11 = new java.security.GeneralSecurityException
            java.lang.String r12 = "plaintext too long"
            r11.<init>(r12)
            throw r11
        L7c:
            java.security.GeneralSecurityException r11 = new java.security.GeneralSecurityException
            java.lang.String r12 = "iv is wrong size"
            r11.<init>(r12)
            throw r11
    }
}
