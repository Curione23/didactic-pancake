package com.google.crypto.tink.aead.subtle;

/* JADX INFO: loaded from: classes2.dex */
@com.google.errorprone.annotations.Immutable
public final class AesGcmFactory implements com.google.crypto.tink.aead.subtle.AeadFactory {
    private final int keySizeInBytes;

    public AesGcmFactory(int r1) throws java.security.GeneralSecurityException {
            r0 = this;
            r0.<init>()
            int r1 = validateAesKeySize(r1)
            r0.keySizeInBytes = r1
            return
    }

    private static int validateAesKeySize(int r2) throws java.security.InvalidAlgorithmParameterException {
            r0 = 16
            if (r2 == r0) goto L1d
            r0 = 32
            if (r2 != r0) goto L9
            goto L1d
        L9:
            java.security.InvalidAlgorithmParameterException r0 = new java.security.InvalidAlgorithmParameterException
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.Object[] r2 = new java.lang.Object[]{r2}
            java.lang.String r1 = "Invalid AES key size, expected 16 or 32, but got %d"
            java.lang.String r2 = java.lang.String.format(r1, r2)
            r0.<init>(r2)
            throw r0
        L1d:
            return r2
    }

    @Override // com.google.crypto.tink.aead.subtle.AeadFactory
    public com.google.crypto.tink.Aead createAead(byte[] r3) throws java.security.GeneralSecurityException {
            r2 = this;
            int r0 = r3.length
            int r1 = r2.getKeySizeInBytes()
            if (r0 != r1) goto Ld
            com.google.crypto.tink.subtle.AesGcmJce r0 = new com.google.crypto.tink.subtle.AesGcmJce
            r0.<init>(r3)
            return r0
        Ld:
            java.security.GeneralSecurityException r0 = new java.security.GeneralSecurityException
            int r1 = r2.getKeySizeInBytes()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            int r3 = r3.length
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            java.lang.Object[] r3 = new java.lang.Object[]{r1, r3}
            java.lang.String r1 = "Symmetric key has incorrect length; expected %s, but got %s"
            java.lang.String r3 = java.lang.String.format(r1, r3)
            r0.<init>(r3)
            throw r0
    }

    @Override // com.google.crypto.tink.aead.subtle.AeadFactory
    public int getKeySizeInBytes() {
            r1 = this;
            int r0 = r1.keySizeInBytes
            return r0
    }
}
