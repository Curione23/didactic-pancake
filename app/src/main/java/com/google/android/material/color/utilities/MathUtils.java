package com.google.android.material.color.utilities;

/* JADX INFO: loaded from: classes.dex */
public class MathUtils {
    private MathUtils() {
            r0 = this;
            r0.<init>()
            return
    }

    public static double clampDouble(double r1, double r3, double r5) {
            int r0 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r0 >= 0) goto L5
            return r1
        L5:
            int r1 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r1 <= 0) goto La
            return r3
        La:
            return r5
    }

    public static int clampInt(int r0, int r1, int r2) {
            if (r2 >= r0) goto L3
            return r0
        L3:
            if (r2 <= r1) goto L6
            return r1
        L6:
            return r2
    }

    public static double differenceDegrees(double r0, double r2) {
            double r0 = r0 - r2
            double r0 = java.lang.Math.abs(r0)
            r2 = 4640537203540230144(0x4066800000000000, double:180.0)
            double r0 = r0 - r2
            double r0 = java.lang.Math.abs(r0)
            double r2 = r2 - r0
            return r2
    }

    public static double lerp(double r2, double r4, double r6) {
            r0 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            double r0 = r0 - r6
            double r0 = r0 * r2
            double r6 = r6 * r4
            double r0 = r0 + r6
            return r0
    }

    public static double[] matrixMultiply(double[] r16, double[][] r17) {
            r0 = 0
            r1 = r16[r0]
            r3 = r17[r0]
            r4 = r3[r0]
            double r4 = r4 * r1
            r6 = 1
            r7 = r16[r6]
            r9 = r3[r6]
            double r9 = r9 * r7
            double r4 = r4 + r9
            r9 = 2
            r10 = r16[r9]
            r12 = r3[r9]
            double r12 = r12 * r10
            double r4 = r4 + r12
            r3 = r17[r6]
            r12 = r3[r0]
            double r12 = r12 * r1
            r14 = r3[r6]
            double r14 = r14 * r7
            double r12 = r12 + r14
            r14 = r3[r9]
            double r14 = r14 * r10
            double r12 = r12 + r14
            r3 = r17[r9]
            r14 = r3[r0]
            double r1 = r1 * r14
            r14 = r3[r6]
            double r7 = r7 * r14
            double r1 = r1 + r7
            r7 = r3[r9]
            double r10 = r10 * r7
            double r1 = r1 + r10
            r3 = 3
            double[] r3 = new double[r3]
            r3[r0] = r4
            r3[r6] = r12
            r3[r9] = r1
            return r3
    }

    public static double rotationDirection(double r0, double r2) {
            double r2 = r2 - r0
            double r0 = sanitizeDegreesDouble(r2)
            r2 = 4640537203540230144(0x4066800000000000, double:180.0)
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 > 0) goto L11
            r0 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            goto L13
        L11:
            r0 = -4616189618054758400(0xbff0000000000000, double:-1.0)
        L13:
            return r0
    }

    public static double sanitizeDegreesDouble(double r4) {
            r0 = 4645040803167600640(0x4076800000000000, double:360.0)
            double r4 = r4 % r0
            r2 = 0
            int r2 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r2 >= 0) goto Ld
            double r4 = r4 + r0
        Ld:
            return r4
    }

    public static int sanitizeDegreesInt(int r0) {
            int r0 = r0 % 360
            if (r0 >= 0) goto L6
            int r0 = r0 + 360
        L6:
            return r0
    }

    public static int signum(double r3) {
            r0 = 0
            int r2 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r2 >= 0) goto L8
            r3 = -1
            return r3
        L8:
            int r3 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r3 != 0) goto Le
            r3 = 0
            return r3
        Le:
            r3 = 1
            return r3
    }
}
