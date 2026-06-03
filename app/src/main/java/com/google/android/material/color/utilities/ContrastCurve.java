package com.google.android.material.color.utilities;

/* JADX INFO: loaded from: classes.dex */
public final class ContrastCurve {
    private final double high;
    private final double low;
    private final double medium;
    private final double normal;

    public ContrastCurve(double r1, double r3, double r5, double r7) {
            r0 = this;
            r0.<init>()
            r0.low = r1
            r0.normal = r3
            r0.medium = r5
            r0.high = r7
            return
    }

    public double getContrast(double r14) {
            r13 = this;
            r0 = -4616189618054758400(0xbff0000000000000, double:-1.0)
            int r2 = (r14 > r0 ? 1 : (r14 == r0 ? 0 : -1))
            if (r2 > 0) goto L9
            double r14 = r13.low
            return r14
        L9:
            r2 = 0
            int r4 = (r14 > r2 ? 1 : (r14 == r2 ? 0 : -1))
            r5 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            if (r4 >= 0) goto L1d
            double r7 = r13.low
            double r9 = r13.normal
            double r14 = r14 - r0
            double r11 = r14 / r5
            double r14 = com.google.android.material.color.utilities.MathUtils.lerp(r7, r9, r11)
            return r14
        L1d:
            r0 = 4602678819172646912(0x3fe0000000000000, double:0.5)
            int r4 = (r14 > r0 ? 1 : (r14 == r0 ? 0 : -1))
            if (r4 >= 0) goto L2f
            double r7 = r13.normal
            double r9 = r13.medium
            double r14 = r14 - r2
            double r11 = r14 / r0
            double r14 = com.google.android.material.color.utilities.MathUtils.lerp(r7, r9, r11)
            return r14
        L2f:
            int r2 = (r14 > r5 ? 1 : (r14 == r5 ? 0 : -1))
            if (r2 >= 0) goto L3f
            double r3 = r13.medium
            double r5 = r13.high
            double r14 = r14 - r0
            double r7 = r14 / r0
            double r14 = com.google.android.material.color.utilities.MathUtils.lerp(r3, r5, r7)
            return r14
        L3f:
            double r14 = r13.high
            return r14
    }
}
