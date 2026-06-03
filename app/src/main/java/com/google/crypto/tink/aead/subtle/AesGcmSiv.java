package com.google.crypto.tink.aead.subtle;

/* JADX INFO: loaded from: classes2.dex */
public final class AesGcmSiv implements com.google.crypto.tink.Aead {
    private static final int IV_SIZE_IN_BYTES = 12;
    private static final int TAG_SIZE_IN_BYTES = 16;
    private static final java.lang.ThreadLocal<javax.crypto.Cipher> localCipher = null;
    private final javax.crypto.SecretKey keySpec;


    static {
            com.google.crypto.tink.aead.subtle.AesGcmSiv$1 r0 = new com.google.crypto.tink.aead.subtle.AesGcmSiv$1
            r0.<init>()
            com.google.crypto.tink.aead.subtle.AesGcmSiv.localCipher = r0
            return
    }

    public AesGcmSiv(byte[] r3) throws java.security.GeneralSecurityException {
            r2 = this;
            r2.<init>()
            int r0 = r3.length
            com.google.crypto.tink.subtle.Validators.validateAesKeySize(r0)
            javax.crypto.spec.SecretKeySpec r0 = new javax.crypto.spec.SecretKeySpec
            java.lang.String r1 = "AES"
            r0.<init>(r3, r1)
            r2.keySpec = r0
            return
    }

    private static java.security.spec.AlgorithmParameterSpec getParams(byte[] r2) throws java.security.GeneralSecurityException {
            r0 = 0
            int r1 = r2.length
            java.security.spec.AlgorithmParameterSpec r2 = getParams(r2, r0, r1)
            return r2
    }

    private static java.security.spec.AlgorithmParameterSpec getParams(byte[] r2, int r3, int r4) throws java.security.GeneralSecurityException {
            java.lang.String r0 = "javax.crypto.spec.GCMParameterSpec"
            java.lang.Class.forName(r0)     // Catch: java.lang.ClassNotFoundException -> Ld
            javax.crypto.spec.GCMParameterSpec r0 = new javax.crypto.spec.GCMParameterSpec     // Catch: java.lang.ClassNotFoundException -> Ld
            r1 = 128(0x80, float:1.8E-43)
            r0.<init>(r1, r2, r3, r4)     // Catch: java.lang.ClassNotFoundException -> Ld
            return r0
        Ld:
            boolean r0 = com.google.crypto.tink.subtle.SubtleUtil.isAndroid()
            if (r0 == 0) goto L19
            javax.crypto.spec.IvParameterSpec r0 = new javax.crypto.spec.IvParameterSpec
            r0.<init>(r2, r3, r4)
            return r0
        L19:
            java.security.GeneralSecurityException r2 = new java.security.GeneralSecurityException
            java.lang.String r3 = "cannot use AES-GCM: javax.crypto.spec.GCMParameterSpec not found"
            r2.<init>(r3)
            throw r2
    }

    @Override // com.google.crypto.tink.Aead
    public byte[] decrypt(byte[] r7, byte[] r8) throws java.security.GeneralSecurityException {
            r6 = this;
            int r0 = r7.length
            r1 = 28
            if (r0 < r1) goto L35
            r0 = 0
            r1 = 12
            java.security.spec.AlgorithmParameterSpec r0 = getParams(r7, r0, r1)
            java.lang.ThreadLocal<javax.crypto.Cipher> r2 = com.google.crypto.tink.aead.subtle.AesGcmSiv.localCipher
            java.lang.Object r3 = r2.get()
            javax.crypto.Cipher r3 = (javax.crypto.Cipher) r3
            r4 = 2
            javax.crypto.SecretKey r5 = r6.keySpec
            r3.init(r4, r5, r0)
            if (r8 == 0) goto L28
            int r0 = r8.length
            if (r0 == 0) goto L28
            java.lang.Object r0 = r2.get()
            javax.crypto.Cipher r0 = (javax.crypto.Cipher) r0
            r0.updateAAD(r8)
        L28:
            java.lang.Object r8 = r2.get()
            javax.crypto.Cipher r8 = (javax.crypto.Cipher) r8
            int r0 = r7.length
            int r0 = r0 - r1
            byte[] r7 = r8.doFinal(r7, r1, r0)
            return r7
        L35:
            java.security.GeneralSecurityException r7 = new java.security.GeneralSecurityException
            java.lang.String r8 = "ciphertext too short"
            r7.<init>(r8)
            throw r7
    }

    @Override // com.google.crypto.tink.Aead
    public byte[] encrypt(byte[] r8, byte[] r9) throws java.security.GeneralSecurityException {
            r7 = this;
            int r0 = r8.length
            r1 = 2147483619(0x7fffffe3, float:NaN)
            if (r0 > r1) goto L67
            int r0 = r8.length
            int r0 = r0 + 28
            byte[] r0 = new byte[r0]
            r1 = 12
            byte[] r2 = com.google.crypto.tink.subtle.Random.randBytes(r1)
            r3 = 0
            java.lang.System.arraycopy(r2, r3, r0, r3, r1)
            java.security.spec.AlgorithmParameterSpec r1 = getParams(r2)
            java.lang.ThreadLocal<javax.crypto.Cipher> r2 = com.google.crypto.tink.aead.subtle.AesGcmSiv.localCipher
            java.lang.Object r3 = r2.get()
            javax.crypto.Cipher r3 = (javax.crypto.Cipher) r3
            r4 = 1
            javax.crypto.SecretKey r5 = r7.keySpec
            r3.init(r4, r5, r1)
            if (r9 == 0) goto L35
            int r1 = r9.length
            if (r1 == 0) goto L35
            java.lang.Object r1 = r2.get()
            javax.crypto.Cipher r1 = (javax.crypto.Cipher) r1
            r1.updateAAD(r9)
        L35:
            java.lang.Object r9 = r2.get()
            r1 = r9
            javax.crypto.Cipher r1 = (javax.crypto.Cipher) r1
            int r4 = r8.length
            r6 = 12
            r3 = 0
            r2 = r8
            r5 = r0
            int r9 = r1.doFinal(r2, r3, r4, r5, r6)
            int r1 = r8.length
            r2 = 16
            int r1 = r1 + r2
            if (r9 != r1) goto L4d
            return r0
        L4d:
            int r8 = r8.length
            int r9 = r9 - r8
            java.security.GeneralSecurityException r8 = new java.security.GeneralSecurityException
            java.lang.Integer r0 = java.lang.Integer.valueOf(r2)
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            java.lang.Object[] r9 = new java.lang.Object[]{r0, r9}
            java.lang.String r0 = "encryption failed; GCM tag must be %s bytes, but got only %s bytes"
            java.lang.String r9 = java.lang.String.format(r0, r9)
            r8.<init>(r9)
            throw r8
        L67:
            java.security.GeneralSecurityException r8 = new java.security.GeneralSecurityException
            java.lang.String r9 = "plaintext too long"
            r8.<init>(r9)
            throw r8
    }
}
