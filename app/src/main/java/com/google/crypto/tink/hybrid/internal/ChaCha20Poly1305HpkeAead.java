package com.google.crypto.tink.hybrid.internal;

/* JADX INFO: loaded from: classes2.dex */
@com.google.errorprone.annotations.Immutable
final class ChaCha20Poly1305HpkeAead implements com.google.crypto.tink.hybrid.internal.HpkeAead {
    ChaCha20Poly1305HpkeAead() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // com.google.crypto.tink.hybrid.internal.HpkeAead
    public byte[] getAeadId() {
            r1 = this;
            byte[] r0 = com.google.crypto.tink.hybrid.internal.HpkeUtil.CHACHA20_POLY1305_AEAD_ID
            return r0
    }

    @Override // com.google.crypto.tink.hybrid.internal.HpkeAead
    public int getKeyLength() {
            r1 = this;
            r0 = 32
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
            int r1 = r2.getKeyLength()
            if (r0 != r1) goto L11
            com.google.crypto.tink.aead.internal.InsecureNonceChaCha20Poly1305 r0 = new com.google.crypto.tink.aead.internal.InsecureNonceChaCha20Poly1305
            r0.<init>(r3)
            byte[] r3 = r0.decrypt(r4, r5, r6)
            return r3
        L11:
            java.security.InvalidAlgorithmParameterException r3 = new java.security.InvalidAlgorithmParameterException
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "Unexpected key length: "
            r4.<init>(r5)
            int r5 = r2.getKeyLength()
            java.lang.StringBuilder r4 = r4.append(r5)
            java.lang.String r4 = r4.toString()
            r3.<init>(r4)
            throw r3
    }

    @Override // com.google.crypto.tink.hybrid.internal.HpkeAead
    public byte[] seal(byte[] r3, byte[] r4, byte[] r5, byte[] r6) throws java.security.GeneralSecurityException {
            r2 = this;
            int r0 = r3.length
            int r1 = r2.getKeyLength()
            if (r0 != r1) goto L11
            com.google.crypto.tink.aead.internal.InsecureNonceChaCha20Poly1305 r0 = new com.google.crypto.tink.aead.internal.InsecureNonceChaCha20Poly1305
            r0.<init>(r3)
            byte[] r3 = r0.encrypt(r4, r5, r6)
            return r3
        L11:
            java.security.InvalidAlgorithmParameterException r3 = new java.security.InvalidAlgorithmParameterException
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "Unexpected key length: "
            r4.<init>(r5)
            int r5 = r2.getKeyLength()
            java.lang.StringBuilder r4 = r4.append(r5)
            java.lang.String r4 = r4.toString()
            r3.<init>(r4)
            throw r3
    }
}
