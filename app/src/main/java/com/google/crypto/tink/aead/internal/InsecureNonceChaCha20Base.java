package com.google.crypto.tink.aead.internal;

/* JADX INFO: loaded from: classes2.dex */
abstract class InsecureNonceChaCha20Base {
    private final int initialCounter;
    int[] key;

    public InsecureNonceChaCha20Base(byte[] r3, int r4) throws java.security.InvalidKeyException {
            r2 = this;
            r2.<init>()
            int r0 = r3.length
            r1 = 32
            if (r0 != r1) goto L11
            int[] r3 = com.google.crypto.tink.aead.internal.ChaCha20Util.toIntArray(r3)
            r2.key = r3
            r2.initialCounter = r4
            return
        L11:
            java.security.InvalidKeyException r3 = new java.security.InvalidKeyException
            java.lang.String r4 = "The key length in bytes must be 32."
            r3.<init>(r4)
            throw r3
    }

    private void process(byte[] r7, java.nio.ByteBuffer r8, java.nio.ByteBuffer r9) throws java.security.GeneralSecurityException {
            r6 = this;
            int r0 = r7.length
            int r1 = r6.nonceSizeInBytes()
            if (r0 != r1) goto L2a
            int r0 = r9.remaining()
            int r1 = r0 / 64
            int r2 = r1 + 1
            r3 = 0
        L10:
            if (r3 >= r2) goto L29
            int r4 = r6.initialCounter
            int r4 = r4 + r3
            java.nio.ByteBuffer r4 = r6.chacha20Block(r7, r4)
            r5 = 64
            if (r3 != r1) goto L23
            int r5 = r0 % 64
            com.google.crypto.tink.subtle.Bytes.xor(r8, r9, r4, r5)
            goto L26
        L23:
            com.google.crypto.tink.subtle.Bytes.xor(r8, r9, r4, r5)
        L26:
            int r3 = r3 + 1
            goto L10
        L29:
            return
        L2a:
            java.security.GeneralSecurityException r7 = new java.security.GeneralSecurityException
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r9 = "The nonce length (in bytes) must be "
            r8.<init>(r9)
            int r9 = r6.nonceSizeInBytes()
            java.lang.StringBuilder r8 = r8.append(r9)
            java.lang.String r8 = r8.toString()
            r7.<init>(r8)
            throw r7
    }

    java.nio.ByteBuffer chacha20Block(byte[] r5, int r6) {
            r4 = this;
            int[] r5 = com.google.crypto.tink.aead.internal.ChaCha20Util.toIntArray(r5)
            int[] r5 = r4.createInitialState(r5, r6)
            java.lang.Object r6 = r5.clone()
            int[] r6 = (int[]) r6
            com.google.crypto.tink.aead.internal.ChaCha20Util.shuffleState(r6)
            r0 = 0
            r1 = r0
        L13:
            int r2 = r5.length
            if (r1 >= r2) goto L20
            r2 = r5[r1]
            r3 = r6[r1]
            int r2 = r2 + r3
            r5[r1] = r2
            int r1 = r1 + 1
            goto L13
        L20:
            r6 = 64
            java.nio.ByteBuffer r6 = java.nio.ByteBuffer.allocate(r6)
            java.nio.ByteOrder r1 = java.nio.ByteOrder.LITTLE_ENDIAN
            java.nio.ByteBuffer r6 = r6.order(r1)
            java.nio.IntBuffer r1 = r6.asIntBuffer()
            r2 = 16
            r1.put(r5, r0, r2)
            return r6
    }

    abstract int[] createInitialState(int[] r1, int r2);

    public byte[] decrypt(byte[] r2, java.nio.ByteBuffer r3) throws java.security.GeneralSecurityException {
            r1 = this;
            int r0 = r3.remaining()
            java.nio.ByteBuffer r0 = java.nio.ByteBuffer.allocate(r0)
            r1.process(r2, r0, r3)
            byte[] r2 = r0.array()
            return r2
    }

    public byte[] decrypt(byte[] r1, byte[] r2) throws java.security.GeneralSecurityException {
            r0 = this;
            java.nio.ByteBuffer r2 = java.nio.ByteBuffer.wrap(r2)
            byte[] r1 = r0.decrypt(r1, r2)
            return r1
    }

    public void encrypt(java.nio.ByteBuffer r3, byte[] r4, byte[] r5) throws java.security.GeneralSecurityException {
            r2 = this;
            int r0 = r3.remaining()
            int r1 = r5.length
            if (r0 < r1) goto Lf
            java.nio.ByteBuffer r5 = java.nio.ByteBuffer.wrap(r5)
            r2.process(r4, r3, r5)
            return
        Lf:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r4 = "Given ByteBuffer output is too small"
            r3.<init>(r4)
            throw r3
    }

    public byte[] encrypt(byte[] r2, byte[] r3) throws java.security.GeneralSecurityException {
            r1 = this;
            int r0 = r3.length
            java.nio.ByteBuffer r0 = java.nio.ByteBuffer.allocate(r0)
            r1.encrypt(r0, r2, r3)
            byte[] r2 = r0.array()
            return r2
    }

    abstract int nonceSizeInBytes();
}
