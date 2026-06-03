package com.google.crypto.tink.subtle;

/* JADX INFO: loaded from: classes2.dex */
public final class AesEaxJce implements com.google.crypto.tink.Aead {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    static final int BLOCK_SIZE_IN_BYTES = 16;
    public static final com.google.crypto.tink.config.internal.TinkFipsUtil.AlgorithmFipsCompatibility FIPS = null;
    static final int TAG_SIZE_IN_BYTES = 16;
    private static final java.lang.ThreadLocal<javax.crypto.Cipher> localCtrCipher = null;
    private static final java.lang.ThreadLocal<javax.crypto.Cipher> localEcbCipher = null;
    private final byte[] b;
    private final int ivSizeInBytes;
    private final javax.crypto.spec.SecretKeySpec keySpec;
    private final byte[] p;



    static {
            com.google.crypto.tink.config.internal.TinkFipsUtil$AlgorithmFipsCompatibility r0 = com.google.crypto.tink.config.internal.TinkFipsUtil.AlgorithmFipsCompatibility.ALGORITHM_NOT_FIPS
            com.google.crypto.tink.subtle.AesEaxJce.FIPS = r0
            com.google.crypto.tink.subtle.AesEaxJce$1 r0 = new com.google.crypto.tink.subtle.AesEaxJce$1
            r0.<init>()
            com.google.crypto.tink.subtle.AesEaxJce.localEcbCipher = r0
            com.google.crypto.tink.subtle.AesEaxJce$2 r0 = new com.google.crypto.tink.subtle.AesEaxJce$2
            r0.<init>()
            com.google.crypto.tink.subtle.AesEaxJce.localCtrCipher = r0
            return
    }

    public AesEaxJce(byte[] r3, int r4) throws java.security.GeneralSecurityException {
            r2 = this;
            r2.<init>()
            com.google.crypto.tink.config.internal.TinkFipsUtil$AlgorithmFipsCompatibility r0 = com.google.crypto.tink.subtle.AesEaxJce.FIPS
            boolean r0 = r0.isCompatible()
            if (r0 == 0) goto L4a
            r0 = 12
            r1 = 16
            if (r4 == r0) goto L1c
            if (r4 != r1) goto L14
            goto L1c
        L14:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r4 = "IV size should be either 12 or 16 bytes"
            r3.<init>(r4)
            throw r3
        L1c:
            r2.ivSizeInBytes = r4
            int r4 = r3.length
            com.google.crypto.tink.subtle.Validators.validateAesKeySize(r4)
            javax.crypto.spec.SecretKeySpec r4 = new javax.crypto.spec.SecretKeySpec
            java.lang.String r0 = "AES"
            r4.<init>(r3, r0)
            r2.keySpec = r4
            java.lang.ThreadLocal<javax.crypto.Cipher> r3 = com.google.crypto.tink.subtle.AesEaxJce.localEcbCipher
            java.lang.Object r3 = r3.get()
            javax.crypto.Cipher r3 = (javax.crypto.Cipher) r3
            r0 = 1
            r3.init(r0, r4)
            byte[] r4 = new byte[r1]
            byte[] r3 = r3.doFinal(r4)
            byte[] r3 = multiplyByX(r3)
            r2.b = r3
            byte[] r3 = multiplyByX(r3)
            r2.p = r3
            return
        L4a:
            java.security.GeneralSecurityException r3 = new java.security.GeneralSecurityException
            java.lang.String r4 = "Can not use AES-EAX in FIPS-mode."
            r3.<init>(r4)
            throw r3
    }

    private static byte[] multiplyByX(byte[] r6) {
            r0 = 16
            byte[] r0 = new byte[r0]
            r1 = 0
            r2 = r1
        L6:
            r3 = 15
            if (r2 >= r3) goto L1e
            r3 = r6[r2]
            int r3 = r3 << 1
            int r4 = r2 + 1
            r5 = r6[r4]
            r5 = r5 & 255(0xff, float:3.57E-43)
            int r5 = r5 >>> 7
            r3 = r3 ^ r5
            r3 = r3 & 255(0xff, float:3.57E-43)
            byte r3 = (byte) r3
            r0[r2] = r3
            r2 = r4
            goto L6
        L1e:
            r2 = r6[r3]
            int r2 = r2 << 1
            r6 = r6[r1]
            int r6 = r6 >> 7
            r6 = r6 & 135(0x87, float:1.89E-43)
            r6 = r6 ^ r2
            byte r6 = (byte) r6
            r0[r3] = r6
            return r0
    }

    private byte[] omac(javax.crypto.Cipher r7, int r8, byte[] r9, int r10, int r11) throws javax.crypto.IllegalBlockSizeException, javax.crypto.BadPaddingException {
            r6 = this;
            r0 = 16
            byte[] r1 = new byte[r0]
            r2 = 15
            byte r8 = (byte) r8
            r1[r2] = r8
            if (r11 != 0) goto L16
            byte[] r8 = r6.b
            byte[] r8 = xor(r1, r8)
            byte[] r7 = r7.doFinal(r8)
            return r7
        L16:
            byte[] r8 = r7.doFinal(r1)
            r1 = 0
            r2 = r1
        L1c:
            int r3 = r11 - r2
            if (r3 <= r0) goto L38
            r3 = r1
        L21:
            if (r3 >= r0) goto L31
            r4 = r8[r3]
            int r5 = r10 + r2
            int r5 = r5 + r3
            r5 = r9[r5]
            r4 = r4 ^ r5
            byte r4 = (byte) r4
            r8[r3] = r4
            int r3 = r3 + 1
            goto L21
        L31:
            byte[] r8 = r7.doFinal(r8)
            int r2 = r2 + 16
            goto L1c
        L38:
            int r2 = r2 + r10
            int r10 = r10 + r11
            byte[] r9 = java.util.Arrays.copyOfRange(r9, r2, r10)
            byte[] r9 = r6.pad(r9)
            byte[] r8 = xor(r8, r9)
            byte[] r7 = r7.doFinal(r8)
            return r7
    }

    private byte[] pad(byte[] r5) {
            r4 = this;
            int r0 = r5.length
            r1 = 16
            if (r0 != r1) goto Lc
            byte[] r0 = r4.b
            byte[] r5 = xor(r5, r0)
            return r5
        Lc:
            byte[] r0 = r4.p
            byte[] r0 = java.util.Arrays.copyOf(r0, r1)
            r1 = 0
        L13:
            int r2 = r5.length
            if (r1 >= r2) goto L21
            r2 = r0[r1]
            r3 = r5[r1]
            r2 = r2 ^ r3
            byte r2 = (byte) r2
            r0[r1] = r2
            int r1 = r1 + 1
            goto L13
        L21:
            int r1 = r5.length
            int r5 = r5.length
            r5 = r0[r5]
            r5 = r5 ^ 128(0x80, float:1.8E-43)
            byte r5 = (byte) r5
            r0[r1] = r5
            return r0
    }

    private static byte[] xor(byte[] r5, byte[] r6) {
            int r0 = r5.length
            byte[] r1 = new byte[r0]
            r2 = 0
        L4:
            if (r2 >= r0) goto L11
            r3 = r5[r2]
            r4 = r6[r2]
            r3 = r3 ^ r4
            byte r3 = (byte) r3
            r1[r2] = r3
            int r2 = r2 + 1
            goto L4
        L11:
            return r1
    }

    @Override // com.google.crypto.tink.Aead
    public byte[] decrypt(byte[] r14, byte[] r15) throws java.security.GeneralSecurityException {
            r13 = this;
            int r0 = r14.length
            int r1 = r13.ivSizeInBytes
            int r0 = r0 - r1
            r1 = 16
            int r0 = r0 - r1
            if (r0 < 0) goto L77
            java.lang.ThreadLocal<javax.crypto.Cipher> r2 = com.google.crypto.tink.subtle.AesEaxJce.localEcbCipher
            java.lang.Object r2 = r2.get()
            r9 = r2
            javax.crypto.Cipher r9 = (javax.crypto.Cipher) r9
            javax.crypto.spec.SecretKeySpec r2 = r13.keySpec
            r10 = 1
            r9.init(r10, r2)
            r7 = 0
            int r8 = r13.ivSizeInBytes
            r5 = 0
            r3 = r13
            r4 = r9
            r6 = r14
            byte[] r11 = r3.omac(r4, r5, r6, r7, r8)
            r12 = 0
            if (r15 != 0) goto L28
            byte[] r15 = new byte[r12]
        L28:
            r6 = r15
            r7 = 0
            int r8 = r6.length
            r5 = 1
            r3 = r13
            r4 = r9
            byte[] r15 = r3.omac(r4, r5, r6, r7, r8)
            r4 = 2
            int r6 = r13.ivSizeInBytes
            r2 = r13
            r3 = r9
            r5 = r14
            r7 = r0
            byte[] r2 = r2.omac(r3, r4, r5, r6, r7)
            int r3 = r14.length
            int r3 = r3 - r1
            r4 = r12
        L40:
            if (r12 >= r1) goto L54
            int r5 = r3 + r12
            r5 = r14[r5]
            r6 = r15[r12]
            r5 = r5 ^ r6
            r6 = r11[r12]
            r5 = r5 ^ r6
            r6 = r2[r12]
            r5 = r5 ^ r6
            r4 = r4 | r5
            byte r4 = (byte) r4
            int r12 = r12 + 1
            goto L40
        L54:
            if (r4 != 0) goto L6f
            java.lang.ThreadLocal<javax.crypto.Cipher> r15 = com.google.crypto.tink.subtle.AesEaxJce.localCtrCipher
            java.lang.Object r15 = r15.get()
            javax.crypto.Cipher r15 = (javax.crypto.Cipher) r15
            javax.crypto.spec.SecretKeySpec r1 = r13.keySpec
            javax.crypto.spec.IvParameterSpec r2 = new javax.crypto.spec.IvParameterSpec
            r2.<init>(r11)
            r15.init(r10, r1, r2)
            int r1 = r13.ivSizeInBytes
            byte[] r14 = r15.doFinal(r14, r1, r0)
            return r14
        L6f:
            javax.crypto.AEADBadTagException r14 = new javax.crypto.AEADBadTagException
            java.lang.String r15 = "tag mismatch"
            r14.<init>(r15)
            throw r14
        L77:
            java.security.GeneralSecurityException r14 = new java.security.GeneralSecurityException
            java.lang.String r15 = "ciphertext too short"
            r14.<init>(r15)
            throw r14
    }

    @Override // com.google.crypto.tink.Aead
    public byte[] encrypt(byte[] r16, byte[] r17) throws java.security.GeneralSecurityException {
            r15 = this;
            r6 = r15
            r7 = r16
            int r0 = r7.length
            int r1 = r6.ivSizeInBytes
            r2 = 2147483631(0x7fffffef, float:NaN)
            int r2 = r2 - r1
            if (r0 > r2) goto L84
            int r0 = r7.length
            int r0 = r0 + r1
            r8 = 16
            int r0 = r0 + r8
            byte[] r9 = new byte[r0]
            byte[] r3 = com.google.crypto.tink.subtle.Random.randBytes(r1)
            int r0 = r6.ivSizeInBytes
            r10 = 0
            java.lang.System.arraycopy(r3, r10, r9, r10, r0)
            java.lang.ThreadLocal<javax.crypto.Cipher> r0 = com.google.crypto.tink.subtle.AesEaxJce.localEcbCipher
            java.lang.Object r0 = r0.get()
            r11 = r0
            javax.crypto.Cipher r11 = (javax.crypto.Cipher) r11
            javax.crypto.spec.SecretKeySpec r0 = r6.keySpec
            r12 = 1
            r11.init(r12, r0)
            r4 = 0
            int r5 = r3.length
            r2 = 0
            r0 = r15
            r1 = r11
            byte[] r13 = r0.omac(r1, r2, r3, r4, r5)
            if (r17 != 0) goto L3b
            byte[] r0 = new byte[r10]
            r3 = r0
            goto L3d
        L3b:
            r3 = r17
        L3d:
            r4 = 0
            int r5 = r3.length
            r2 = 1
            r0 = r15
            r1 = r11
            byte[] r14 = r0.omac(r1, r2, r3, r4, r5)
            java.lang.ThreadLocal<javax.crypto.Cipher> r0 = com.google.crypto.tink.subtle.AesEaxJce.localCtrCipher
            java.lang.Object r0 = r0.get()
            javax.crypto.Cipher r0 = (javax.crypto.Cipher) r0
            javax.crypto.spec.SecretKeySpec r1 = r6.keySpec
            javax.crypto.spec.IvParameterSpec r2 = new javax.crypto.spec.IvParameterSpec
            r2.<init>(r13)
            r0.init(r12, r1, r2)
            int r3 = r7.length
            int r5 = r6.ivSizeInBytes
            r2 = 0
            r1 = r16
            r4 = r9
            r0.doFinal(r1, r2, r3, r4, r5)
            int r4 = r6.ivSizeInBytes
            int r5 = r7.length
            r2 = 2
            r0 = r15
            r1 = r11
            r3 = r9
            byte[] r0 = r0.omac(r1, r2, r3, r4, r5)
            int r1 = r7.length
            int r2 = r6.ivSizeInBytes
            int r1 = r1 + r2
        L71:
            if (r10 >= r8) goto L83
            int r2 = r1 + r10
            r3 = r14[r10]
            r4 = r13[r10]
            r3 = r3 ^ r4
            r4 = r0[r10]
            r3 = r3 ^ r4
            byte r3 = (byte) r3
            r9[r2] = r3
            int r10 = r10 + 1
            goto L71
        L83:
            return r9
        L84:
            java.security.GeneralSecurityException r0 = new java.security.GeneralSecurityException
            java.lang.String r1 = "plaintext too long"
            r0.<init>(r1)
            throw r0
    }
}
