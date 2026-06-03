package com.google.gson.internal;

/* JADX INFO: loaded from: classes2.dex */
public class NumberLimits {
    private static final int MAX_NUMBER_STRING_LENGTH = 10000;

    private NumberLimits() {
            r0 = this;
            r0.<init>()
            return
    }

    private static void checkNumberStringLength(java.lang.String r4) {
            int r0 = r4.length()
            r1 = 10000(0x2710, float:1.4013E-41)
            if (r0 > r1) goto L9
            return
        L9:
            java.lang.NumberFormatException r0 = new java.lang.NumberFormatException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Number string too large: "
            r1.<init>(r2)
            r2 = 0
            r3 = 30
            java.lang.String r4 = r4.substring(r2, r3)
            java.lang.StringBuilder r4 = r1.append(r4)
            java.lang.String r1 = "..."
            java.lang.StringBuilder r4 = r4.append(r1)
            java.lang.String r4 = r4.toString()
            r0.<init>(r4)
            throw r0
    }

    public static java.math.BigDecimal parseBigDecimal(java.lang.String r5) throws java.lang.NumberFormatException {
            checkNumberStringLength(r5)
            java.math.BigDecimal r0 = new java.math.BigDecimal
            r0.<init>(r5)
            int r1 = r0.scale()
            long r1 = (long) r1
            long r1 = java.lang.Math.abs(r1)
            r3 = 10000(0x2710, double:4.9407E-320)
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 >= 0) goto L18
            return r0
        L18:
            java.lang.NumberFormatException r0 = new java.lang.NumberFormatException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Number has unsupported scale: "
            r1.<init>(r2)
            java.lang.StringBuilder r5 = r1.append(r5)
            java.lang.String r5 = r5.toString()
            r0.<init>(r5)
            throw r0
    }

    public static java.math.BigInteger parseBigInteger(java.lang.String r1) throws java.lang.NumberFormatException {
            checkNumberStringLength(r1)
            java.math.BigInteger r0 = new java.math.BigInteger
            r0.<init>(r1)
            return r0
    }
}
