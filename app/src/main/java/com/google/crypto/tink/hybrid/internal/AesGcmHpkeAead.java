package com.google.crypto.tink.hybrid.internal;

/* JADX INFO: loaded from: classes2.dex */
@com.google.errorprone.annotations.Immutable
final class AesGcmHpkeAead implements com.google.crypto.tink.hybrid.internal.HpkeAead {
    private final int keyLength;

    AesGcmHpkeAead(int r4) throws java.security.InvalidAlgorithmParameterException {
            r3 = this;
            r3.<init>()
            r0 = 16
            if (r4 == r0) goto L21
            r0 = 32
            if (r4 != r0) goto Lc
            goto L21
        Lc:
            java.security.InvalidAlgorithmParameterException r0 = new java.security.InvalidAlgorithmParameterException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Unsupported key length: "
            r1.<init>(r2)
            java.lang.StringBuilder r4 = r1.append(r4)
            java.lang.String r4 = r4.toString()
            r0.<init>(r4)
            throw r0
        L21:
            r3.keyLength = r4
            return
    }

    @Override // com.google.crypto.tink.hybrid.internal.HpkeAead
    public byte[] getAeadId() throws java.security.GeneralSecurityException {
            r2 = this;
            int r0 = r2.keyLength
            r1 = 16
            if (r0 == r1) goto L15
            r1 = 32
            if (r0 != r1) goto Ld
            byte[] r0 = com.google.crypto.tink.hybrid.internal.HpkeUtil.AES_256_GCM_AEAD_ID
            return r0
        Ld:
            java.security.GeneralSecurityException r0 = new java.security.GeneralSecurityException
            java.lang.String r1 = "Could not determine HPKE AEAD ID"
            r0.<init>(r1)
            throw r0
        L15:
            byte[] r0 = com.google.crypto.tink.hybrid.internal.HpkeUtil.AES_128_GCM_AEAD_ID
            return r0
    }

    @Override // com.google.crypto.tink.hybrid.internal.HpkeAead
    public int getKeyLength() {
            r1 = this;
            int r0 = r1.keyLength
            return r0
    }

    @Override // com.google.crypto.tink.hybrid.internal.HpkeAead
    public int getNonceLength() {
            r1 = this;
            r0 = 12
            return r0
    }

    @Override // com.google.crypto.tink.hybrid.internal.HpkeAead
    public byte[] open(byte[] r3, byte[] r4, byte[] r5, byte[] r6) throws java.security.GeneralSecurityException {
            r2 = this;
            int r0 = r3.length
            int r1 = r2.keyLength
            if (r0 != r1) goto L10
            com.google.crypto.tink.aead.internal.InsecureNonceAesGcmJce r0 = new com.google.crypto.tink.aead.internal.InsecureNonceAesGcmJce
            r1 = 0
            r0.<init>(r3, r1)
            byte[] r3 = r0.decrypt(r4, r5, r6)
            return r3
        L10:
            java.security.InvalidAlgorithmParameterException r4 = new java.security.InvalidAlgorithmParameterException
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "Unexpected key length: "
            r5.<init>(r6)
            int r3 = r3.length
            java.lang.StringBuilder r3 = r5.append(r3)
            java.lang.String r3 = r3.toString()
            r4.<init>(r3)
            throw r4
    }

    @Override // com.google.crypto.tink.hybrid.internal.HpkeAead
    public byte[] seal(byte[] r3, byte[] r4, byte[] r5, byte[] r6) throws java.security.GeneralSecurityException {
            r2 = this;
            int r0 = r3.length
            int r1 = r2.keyLength
            if (r0 != r1) goto L10
            com.google.crypto.tink.aead.internal.InsecureNonceAesGcmJce r0 = new com.google.crypto.tink.aead.internal.InsecureNonceAesGcmJce
            r1 = 0
            r0.<init>(r3, r1)
            byte[] r3 = r0.encrypt(r4, r5, r6)
            return r3
        L10:
            java.security.InvalidAlgorithmParameterException r4 = new java.security.InvalidAlgorithmParameterException
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "Unexpected key length: "
            r5.<init>(r6)
            int r3 = r3.length
            java.lang.StringBuilder r3 = r5.append(r3)
            java.lang.String r3 = r3.toString()
            r4.<init>(r3)
            throw r4
    }
}
