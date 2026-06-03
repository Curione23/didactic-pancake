package com.google.crypto.tink.mac.internal;

/* JADX INFO: loaded from: classes2.dex */
public final class AesUtil {
    public static final int BLOCK_SIZE = 16;

    private AesUtil() {
            r0 = this;
            r0.<init>()
            return
    }

    public static byte[] cmacPad(byte[] r2) {
            int r0 = r2.length
            r1 = 16
            if (r0 >= r1) goto Lf
            byte[] r0 = java.util.Arrays.copyOf(r2, r1)
            int r2 = r2.length
            r1 = -128(0xffffffffffffff80, float:NaN)
            r0[r2] = r1
            return r0
        Lf:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "x must be smaller than a block."
            r2.<init>(r0)
            throw r2
    }

    public static byte[] dbl(byte[] r6) {
            int r0 = r6.length
            r1 = 16
            if (r0 != r1) goto L36
            byte[] r0 = new byte[r1]
            r2 = 0
            r3 = r2
        L9:
            r4 = 15
            if (r3 >= r1) goto L28
            r5 = r6[r3]
            int r5 = r5 << 1
            r5 = r5 & 254(0xfe, float:3.56E-43)
            byte r5 = (byte) r5
            r0[r3] = r5
            if (r3 >= r4) goto L25
            int r4 = r3 + 1
            r4 = r6[r4]
            int r4 = r4 >> 7
            r4 = r4 & 1
            byte r4 = (byte) r4
            r4 = r4 | r5
            byte r4 = (byte) r4
            r0[r3] = r4
        L25:
            int r3 = r3 + 1
            goto L9
        L28:
            r1 = r0[r4]
            r6 = r6[r2]
            int r6 = r6 >> 7
            r6 = r6 & 135(0x87, float:1.89E-43)
            byte r6 = (byte) r6
            r6 = r6 ^ r1
            byte r6 = (byte) r6
            r0[r4] = r6
            return r0
        L36:
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "value must be a block."
            r6.<init>(r0)
            throw r6
    }
}
