package com.google.crypto.tink.subtle;

/* JADX INFO: loaded from: classes2.dex */
public final class Hex {
    private Hex() {
            r0 = this;
            r0.<init>()
            return
    }

    public static byte[] decode(java.lang.String r6) {
            int r0 = r6.length()
            int r0 = r0 % 2
            if (r0 != 0) goto L40
            int r0 = r6.length()
            int r0 = r0 / 2
            byte[] r1 = new byte[r0]
            r2 = 0
        L11:
            if (r2 >= r0) goto L3f
            int r3 = r2 * 2
            char r4 = r6.charAt(r3)
            r5 = 16
            int r4 = java.lang.Character.digit(r4, r5)
            int r3 = r3 + 1
            char r3 = r6.charAt(r3)
            int r3 = java.lang.Character.digit(r3, r5)
            r5 = -1
            if (r4 == r5) goto L37
            if (r3 == r5) goto L37
            int r4 = r4 * 16
            int r4 = r4 + r3
            byte r3 = (byte) r4
            r1[r2] = r3
            int r2 = r2 + 1
            goto L11
        L37:
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "input is not hexadecimal"
            r6.<init>(r0)
            throw r6
        L3f:
            return r1
        L40:
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Expected a string of even length"
            r6.<init>(r0)
            throw r6
    }

    public static java.lang.String encode(byte[] r6) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            int r1 = r6.length
            int r1 = r1 * 2
            r0.<init>(r1)
            int r1 = r6.length
            r2 = 0
        La:
            if (r2 >= r1) goto L27
            r3 = r6[r2]
            r3 = r3 & 255(0xff, float:3.57E-43)
            int r4 = r3 / 16
            java.lang.String r5 = "0123456789abcdef"
            char r4 = r5.charAt(r4)
            r0.append(r4)
            int r3 = r3 % 16
            char r3 = r5.charAt(r3)
            r0.append(r3)
            int r2 = r2 + 1
            goto La
        L27:
            java.lang.String r6 = r0.toString()
            return r6
    }
}
