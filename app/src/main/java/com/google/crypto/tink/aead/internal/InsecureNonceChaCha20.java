package com.google.crypto.tink.aead.internal;

/* JADX INFO: loaded from: classes2.dex */
public class InsecureNonceChaCha20 extends com.google.crypto.tink.aead.internal.InsecureNonceChaCha20Base {
    public InsecureNonceChaCha20(byte[] r1, int r2) throws java.security.InvalidKeyException {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    @Override // com.google.crypto.tink.aead.internal.InsecureNonceChaCha20Base
    public int[] createInitialState(int[] r4, int r5) {
            r3 = this;
            int r0 = r4.length
            int r1 = r3.nonceSizeInBytes()
            int r1 = r1 / 4
            if (r0 != r1) goto L1e
            r0 = 16
            int[] r0 = new int[r0]
            int[] r1 = r3.key
            com.google.crypto.tink.aead.internal.ChaCha20Util.setSigmaAndKey(r0, r1)
            r1 = 12
            r0[r1] = r5
            r5 = 13
            int r1 = r4.length
            r2 = 0
            java.lang.System.arraycopy(r4, r2, r0, r5, r1)
            return r0
        L1e:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            int r4 = r4.length
            int r4 = r4 * 32
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            java.lang.Object[] r4 = new java.lang.Object[]{r4}
            java.lang.String r0 = "ChaCha20 uses 96-bit nonces, but got a %d-bit nonce"
            java.lang.String r4 = java.lang.String.format(r0, r4)
            r5.<init>(r4)
            throw r5
    }

    @Override // com.google.crypto.tink.aead.internal.InsecureNonceChaCha20Base
    public /* bridge */ /* synthetic */ byte[] decrypt(byte[] r1, java.nio.ByteBuffer r2) throws java.security.GeneralSecurityException {
            r0 = this;
            byte[] r1 = super.decrypt(r1, r2)
            return r1
    }

    @Override // com.google.crypto.tink.aead.internal.InsecureNonceChaCha20Base
    public /* bridge */ /* synthetic */ byte[] decrypt(byte[] r1, byte[] r2) throws java.security.GeneralSecurityException {
            r0 = this;
            byte[] r1 = super.decrypt(r1, r2)
            return r1
    }

    @Override // com.google.crypto.tink.aead.internal.InsecureNonceChaCha20Base
    public /* bridge */ /* synthetic */ void encrypt(java.nio.ByteBuffer r1, byte[] r2, byte[] r3) throws java.security.GeneralSecurityException {
            r0 = this;
            super.encrypt(r1, r2, r3)
            return
    }

    @Override // com.google.crypto.tink.aead.internal.InsecureNonceChaCha20Base
    public /* bridge */ /* synthetic */ byte[] encrypt(byte[] r1, byte[] r2) throws java.security.GeneralSecurityException {
            r0 = this;
            byte[] r1 = super.encrypt(r1, r2)
            return r1
    }

    @Override // com.google.crypto.tink.aead.internal.InsecureNonceChaCha20Base
    public int nonceSizeInBytes() {
            r1 = this;
            r0 = 12
            return r0
    }
}
