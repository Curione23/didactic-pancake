package com.google.crypto.tink.internal;

/* JADX INFO: loaded from: classes2.dex */
public final class BigIntegerEncoding {
    private BigIntegerEncoding() {
            r0 = this;
            r0.<init>()
            return
    }

    public static java.math.BigInteger fromUnsignedBigEndianBytes(byte[] r2) {
            java.math.BigInteger r0 = new java.math.BigInteger
            r1 = 1
            r0.<init>(r1, r2)
            return r0
    }

    public static byte[] toBigEndianBytes(java.math.BigInteger r2) {
            int r0 = r2.signum()
            r1 = -1
            if (r0 == r1) goto Lc
            byte[] r2 = r2.toByteArray()
            return r2
        Lc:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "n must not be negative"
            r2.<init>(r0)
            throw r2
    }

    public static byte[] toBigEndianBytesOfFixedLength(java.math.BigInteger r4, int r5) throws java.security.GeneralSecurityException {
            int r0 = r4.signum()
            r1 = -1
            if (r0 == r1) goto L3a
            byte[] r4 = r4.toByteArray()
            int r0 = r4.length
            if (r0 != r5) goto Lf
            return r4
        Lf:
            int r0 = r4.length
            int r1 = r5 + 1
            java.lang.String r2 = "integer too large"
            if (r0 > r1) goto L34
            int r0 = r4.length
            r3 = 0
            if (r0 != r1) goto L2b
            r5 = r4[r3]
            if (r5 != 0) goto L25
            int r5 = r4.length
            r0 = 1
            byte[] r4 = java.util.Arrays.copyOfRange(r4, r0, r5)
            return r4
        L25:
            java.security.GeneralSecurityException r4 = new java.security.GeneralSecurityException
            r4.<init>(r2)
            throw r4
        L2b:
            byte[] r0 = new byte[r5]
            int r1 = r4.length
            int r5 = r5 - r1
            int r1 = r4.length
            java.lang.System.arraycopy(r4, r3, r0, r5, r1)
            return r0
        L34:
            java.security.GeneralSecurityException r4 = new java.security.GeneralSecurityException
            r4.<init>(r2)
            throw r4
        L3a:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r5 = "integer must be nonnegative"
            r4.<init>(r5)
            throw r4
    }
}
