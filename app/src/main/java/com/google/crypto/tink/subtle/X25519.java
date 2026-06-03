package com.google.crypto.tink.subtle;

/* JADX INFO: loaded from: classes2.dex */
public final class X25519 {
    private X25519() {
            r0 = this;
            r0.<init>()
            return
    }

    public static byte[] computeSharedSecret(byte[] r3, byte[] r4) throws java.security.InvalidKeyException {
            int r0 = r3.length
            r1 = 32
            if (r0 != r1) goto L2b
            r0 = 11
            long[] r0 = new long[r0]
            byte[] r3 = java.util.Arrays.copyOf(r3, r1)
            r1 = 0
            r2 = r3[r1]
            r2 = r2 & 248(0xf8, float:3.48E-43)
            byte r2 = (byte) r2
            r3[r1] = r2
            r1 = 31
            r2 = r3[r1]
            r2 = r2 & 127(0x7f, float:1.78E-43)
            byte r2 = (byte) r2
            r3[r1] = r2
            r2 = r2 | 64
            byte r2 = (byte) r2
            r3[r1] = r2
            com.google.crypto.tink.subtle.Curve25519.curveMult(r0, r3, r4)
            byte[] r3 = com.google.crypto.tink.subtle.Field25519.contract(r0)
            return r3
        L2b:
            java.security.InvalidKeyException r3 = new java.security.InvalidKeyException
            java.lang.String r4 = "Private key must have 32 bytes."
            r3.<init>(r4)
            throw r3
    }

    public static byte[] generatePrivateKey() {
            r0 = 32
            byte[] r0 = com.google.crypto.tink.subtle.Random.randBytes(r0)
            r1 = 0
            r2 = r0[r1]
            r2 = r2 | 7
            byte r2 = (byte) r2
            r0[r1] = r2
            r1 = 31
            r2 = r0[r1]
            r2 = r2 & 63
            byte r2 = (byte) r2
            r0[r1] = r2
            r2 = r2 | 128(0x80, float:1.8E-43)
            byte r2 = (byte) r2
            r0[r1] = r2
            return r0
    }

    public static byte[] publicFromPrivate(byte[] r3) throws java.security.InvalidKeyException {
            int r0 = r3.length
            r1 = 32
            if (r0 != r1) goto L11
            byte[] r0 = new byte[r1]
            r1 = 0
            r2 = 9
            r0[r1] = r2
            byte[] r3 = computeSharedSecret(r3, r0)
            return r3
        L11:
            java.security.InvalidKeyException r3 = new java.security.InvalidKeyException
            java.lang.String r0 = "Private key must have 32 bytes."
            r3.<init>(r0)
            throw r3
    }
}
