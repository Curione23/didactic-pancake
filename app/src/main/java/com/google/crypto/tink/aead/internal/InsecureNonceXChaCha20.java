package com.google.crypto.tink.aead.internal;

/* JADX INFO: loaded from: classes2.dex */
public class InsecureNonceXChaCha20 extends com.google.crypto.tink.aead.internal.InsecureNonceChaCha20Base {
    public static final int NONCE_SIZE_IN_BYTES = 24;

    public InsecureNonceXChaCha20(byte[] r1, int r2) throws java.security.InvalidKeyException {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    static int[] hChaCha20(int[] r4, int[] r5) {
            r0 = 16
            int[] r0 = new int[r0]
            com.google.crypto.tink.aead.internal.ChaCha20Util.setSigmaAndKey(r0, r4)
            r4 = 0
            r4 = r5[r4]
            r1 = 12
            r0[r1] = r4
            r4 = 1
            r4 = r5[r4]
            r2 = 13
            r0[r2] = r4
            r4 = 2
            r4 = r5[r4]
            r3 = 14
            r0[r3] = r4
            r4 = 3
            r4 = r5[r4]
            r5 = 15
            r0[r5] = r4
            com.google.crypto.tink.aead.internal.ChaCha20Util.shuffleState(r0)
            r4 = 4
            r1 = r0[r1]
            r0[r4] = r1
            r4 = 5
            r1 = r0[r2]
            r0[r4] = r1
            r4 = 6
            r1 = r0[r3]
            r0[r4] = r1
            r4 = 7
            r5 = r0[r5]
            r0[r4] = r5
            r4 = 8
            int[] r4 = java.util.Arrays.copyOf(r0, r4)
            return r4
    }

    @Override // com.google.crypto.tink.aead.internal.InsecureNonceChaCha20Base
    int[] createInitialState(int[] r4, int r5) {
            r3 = this;
            int r0 = r4.length
            int r1 = r3.nonceSizeInBytes()
            r2 = 4
            int r1 = r1 / r2
            if (r0 != r1) goto L2d
            r0 = 16
            int[] r0 = new int[r0]
            int[] r1 = r3.key
            int[] r1 = hChaCha20(r1, r4)
            com.google.crypto.tink.aead.internal.ChaCha20Util.setSigmaAndKey(r0, r1)
            r1 = 12
            r0[r1] = r5
            r5 = 13
            r1 = 0
            r0[r5] = r1
            r5 = 14
            r1 = r4[r2]
            r0[r5] = r1
            r5 = 5
            r4 = r4[r5]
            r5 = 15
            r0[r5] = r4
            return r0
        L2d:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            int r4 = r4.length
            int r4 = r4 * 32
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            java.lang.Object[] r4 = new java.lang.Object[]{r4}
            java.lang.String r0 = "XChaCha20 uses 192-bit nonces, but got a %d-bit nonce"
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
    int nonceSizeInBytes() {
            r1 = this;
            r0 = 24
            return r0
    }
}
