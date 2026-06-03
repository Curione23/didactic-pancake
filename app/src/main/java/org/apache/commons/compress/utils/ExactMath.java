package org.apache.commons.compress.utils;

/* JADX INFO: loaded from: classes2.dex */
public class ExactMath {
    private ExactMath() {
            r0 = this;
            r0.<init>()
            return
    }

    public static int add(int r0, long r1) {
            int r1 = java.lang.Math.toIntExact(r1)     // Catch: java.lang.ArithmeticException -> L9
            int r0 = java.lang.Math.addExact(r0, r1)     // Catch: java.lang.ArithmeticException -> L9
            return r0
        L9:
            r0 = move-exception
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "Argument too large or result overflows"
            r1.<init>(r2, r0)
            throw r1
    }
}
