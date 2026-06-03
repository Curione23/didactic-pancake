package com.google.android.material.color.utilities;

/* JADX INFO: loaded from: classes.dex */
public final class Contrast {
    private static final double CONTRAST_RATIO_EPSILON = 0.04d;
    private static final double LUMINANCE_GAMUT_MAP_TOLERANCE = 0.4d;
    public static final double RATIO_30 = 3.0d;
    public static final double RATIO_45 = 4.5d;
    public static final double RATIO_70 = 7.0d;
    public static final double RATIO_MAX = 21.0d;
    public static final double RATIO_MIN = 1.0d;

    private Contrast() {
            r0 = this;
            r0.<init>()
            return
    }

    public static double darker(double r11, double r13) {
            r0 = 0
            int r2 = (r11 > r0 ? 1 : (r11 == r0 ? 0 : -1))
            r3 = -4616189618054758400(0xbff0000000000000, double:-1.0)
            if (r2 < 0) goto L4e
            r5 = 4636737291354636288(0x4059000000000000, double:100.0)
            int r2 = (r11 > r5 ? 1 : (r11 == r5 ? 0 : -1))
            if (r2 <= 0) goto Lf
            goto L4e
        Lf:
            double r11 = com.google.android.material.color.utilities.ColorUtils.yFromLstar(r11)
            r7 = 4617315517961601024(0x4014000000000000, double:5.0)
            double r9 = r11 + r7
            double r9 = r9 / r13
            double r9 = r9 - r7
            int r2 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r2 < 0) goto L4e
            int r2 = (r9 > r5 ? 1 : (r9 == r5 ? 0 : -1))
            if (r2 <= 0) goto L22
            goto L4e
        L22:
            double r11 = ratioOfYs(r11, r9)
            double r7 = r11 - r13
            double r7 = java.lang.Math.abs(r7)
            int r11 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r11 >= 0) goto L3a
            r11 = 4585925428558828667(0x3fa47ae147ae147b, double:0.04)
            int r11 = (r7 > r11 ? 1 : (r7 == r11 ? 0 : -1))
            if (r11 <= 0) goto L3a
            return r3
        L3a:
            double r11 = com.google.android.material.color.utilities.ColorUtils.lstarFromY(r9)
            r13 = 4600877379321698714(0x3fd999999999999a, double:0.4)
            double r11 = r11 - r13
            int r13 = (r11 > r0 ? 1 : (r11 == r0 ? 0 : -1))
            if (r13 < 0) goto L4e
            int r13 = (r11 > r5 ? 1 : (r11 == r5 ? 0 : -1))
            if (r13 <= 0) goto L4d
            goto L4e
        L4d:
            return r11
        L4e:
            return r3
    }

    public static double darkerUnsafe(double r0, double r2) {
            double r0 = darker(r0, r2)
            r2 = 0
            double r0 = java.lang.Math.max(r2, r0)
            return r0
    }

    public static double lighter(double r11, double r13) {
            r0 = 0
            int r2 = (r11 > r0 ? 1 : (r11 == r0 ? 0 : -1))
            r3 = -4616189618054758400(0xbff0000000000000, double:-1.0)
            if (r2 < 0) goto L4e
            r5 = 4636737291354636288(0x4059000000000000, double:100.0)
            int r2 = (r11 > r5 ? 1 : (r11 == r5 ? 0 : -1))
            if (r2 <= 0) goto Lf
            goto L4e
        Lf:
            double r11 = com.google.android.material.color.utilities.ColorUtils.yFromLstar(r11)
            r7 = 4617315517961601024(0x4014000000000000, double:5.0)
            double r9 = r11 + r7
            double r9 = r9 * r13
            double r9 = r9 - r7
            int r2 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r2 < 0) goto L4e
            int r2 = (r9 > r5 ? 1 : (r9 == r5 ? 0 : -1))
            if (r2 <= 0) goto L22
            goto L4e
        L22:
            double r11 = ratioOfYs(r9, r11)
            double r7 = r11 - r13
            double r7 = java.lang.Math.abs(r7)
            int r11 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r11 >= 0) goto L3a
            r11 = 4585925428558828667(0x3fa47ae147ae147b, double:0.04)
            int r11 = (r7 > r11 ? 1 : (r7 == r11 ? 0 : -1))
            if (r11 <= 0) goto L3a
            return r3
        L3a:
            double r11 = com.google.android.material.color.utilities.ColorUtils.lstarFromY(r9)
            r13 = 4600877379321698714(0x3fd999999999999a, double:0.4)
            double r11 = r11 + r13
            int r13 = (r11 > r0 ? 1 : (r11 == r0 ? 0 : -1))
            if (r13 < 0) goto L4e
            int r13 = (r11 > r5 ? 1 : (r11 == r5 ? 0 : -1))
            if (r13 <= 0) goto L4d
            goto L4e
        L4d:
            return r11
        L4e:
            return r3
    }

    public static double lighterUnsafe(double r0, double r2) {
            double r0 = lighter(r0, r2)
            r2 = 0
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 >= 0) goto Lc
            r0 = 4636737291354636288(0x4059000000000000, double:100.0)
        Lc:
            return r0
    }

    public static double ratioOfTones(double r0, double r2) {
            double r0 = com.google.android.material.color.utilities.ColorUtils.yFromLstar(r0)
            double r2 = com.google.android.material.color.utilities.ColorUtils.yFromLstar(r2)
            double r0 = ratioOfYs(r0, r2)
            return r0
    }

    public static double ratioOfYs(double r3, double r5) {
            double r0 = java.lang.Math.max(r3, r5)
            int r2 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r2 != 0) goto L9
            goto La
        L9:
            r3 = r5
        La:
            r5 = 4617315517961601024(0x4014000000000000, double:5.0)
            double r0 = r0 + r5
            double r3 = r3 + r5
            double r0 = r0 / r3
            return r0
    }
}
