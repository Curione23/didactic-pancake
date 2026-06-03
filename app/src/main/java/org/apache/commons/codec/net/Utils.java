package org.apache.commons.codec.net;

/* JADX INFO: loaded from: classes2.dex */
final class Utils {
    private static final int RADIX = 16;

    Utils() {
            r0 = this;
            r0.<init>()
            return
    }

    static int digit16(byte r3) throws org.apache.commons.codec.DecoderException {
            char r0 = (char) r3
            r1 = 16
            int r0 = java.lang.Character.digit(r0, r1)
            r1 = -1
            if (r0 == r1) goto Lb
            return r0
        Lb:
            org.apache.commons.codec.DecoderException r0 = new org.apache.commons.codec.DecoderException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Invalid URL encoding: not a valid digit (radix 16): "
            r1.<init>(r2)
            java.lang.StringBuilder r3 = r1.append(r3)
            java.lang.String r3 = r3.toString()
            r0.<init>(r3)
            throw r0
    }

    static char hexDigit(int r1) {
            r1 = r1 & 15
            r0 = 16
            char r1 = java.lang.Character.forDigit(r1, r0)
            char r1 = java.lang.Character.toUpperCase(r1)
            return r1
    }
}
