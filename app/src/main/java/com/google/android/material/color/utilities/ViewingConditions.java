package com.google.android.material.color.utilities;

/* JADX INFO: loaded from: classes.dex */
public final class ViewingConditions {
    public static final com.google.android.material.color.utilities.ViewingConditions DEFAULT = null;
    private final double aw;
    private final double c;
    private final double fl;
    private final double flRoot;
    private final double n;
    private final double nbb;
    private final double nc;
    private final double ncb;
    private final double[] rgbD;
    private final double z;

    static {
            r0 = 4632233691727265792(0x4049000000000000, double:50.0)
            com.google.android.material.color.utilities.ViewingConditions r0 = defaultWithBackgroundLstar(r0)
            com.google.android.material.color.utilities.ViewingConditions.DEFAULT = r0
            return
    }

    private ViewingConditions(double r4, double r6, double r8, double r10, double r12, double r14, double[] r16, double r17, double r19, double r21) {
            r3 = this;
            r0 = r3
            r3.<init>()
            r1 = r4
            r0.n = r1
            r1 = r6
            r0.aw = r1
            r1 = r8
            r0.nbb = r1
            r1 = r10
            r0.ncb = r1
            r1 = r12
            r0.c = r1
            r1 = r14
            r0.nc = r1
            r1 = r16
            r0.rgbD = r1
            r1 = r17
            r0.fl = r1
            r1 = r19
            r0.flRoot = r1
            r1 = r21
            r0.z = r1
            return
    }

    public static com.google.android.material.color.utilities.ViewingConditions defaultWithBackgroundLstar(double r8) {
            double[] r0 = com.google.android.material.color.utilities.ColorUtils.whitePointD65()
            r1 = 4632233691727265792(0x4049000000000000, double:50.0)
            double r1 = com.google.android.material.color.utilities.ColorUtils.yFromLstar(r1)
            r3 = 4634156444089534796(0x404fd4bbab8b494c, double:63.66197723675813)
            double r1 = r1 * r3
            r3 = 4636737291354636288(0x4059000000000000, double:100.0)
            double r1 = r1 / r3
            r5 = 4611686018427387904(0x4000000000000000, double:2.0)
            r7 = 0
            r3 = r8
            com.google.android.material.color.utilities.ViewingConditions r8 = make(r0, r1, r3, r5, r7)
            return r8
    }

    public static com.google.android.material.color.utilities.ViewingConditions make(double[] r43, double r44, double r46, double r48, boolean r50) {
            r0 = r44
            r2 = 4591870180066957722(0x3fb999999999999a, double:0.1)
            r4 = r46
            double r4 = java.lang.Math.max(r2, r4)
            double[][] r6 = com.google.android.material.color.utilities.Cam16.XYZ_TO_CAM16RGB
            r7 = 0
            r8 = r43[r7]
            r10 = r6[r7]
            r11 = r10[r7]
            double r11 = r11 * r8
            r13 = 1
            r14 = r43[r13]
            r16 = r10[r13]
            double r16 = r16 * r14
            double r11 = r11 + r16
            r16 = 2
            r17 = r43[r16]
            r19 = r10[r16]
            double r19 = r19 * r17
            double r11 = r11 + r19
            r10 = r6[r13]
            r19 = r10[r7]
            double r19 = r19 * r8
            r21 = r10[r13]
            double r21 = r21 * r14
            double r19 = r19 + r21
            r21 = r10[r16]
            double r21 = r21 * r17
            double r19 = r19 + r21
            r6 = r6[r16]
            r21 = r6[r7]
            double r8 = r8 * r21
            r21 = r6[r13]
            double r14 = r14 * r21
            double r8 = r8 + r14
            r14 = r6[r16]
            double r17 = r17 * r14
            double r8 = r8 + r17
            r14 = 4621819117588971520(0x4024000000000000, double:10.0)
            double r17 = r48 / r14
            r21 = 4605380978949069210(0x3fe999999999999a, double:0.8)
            double r34 = r17 + r21
            r17 = 4606281698874543309(0x3feccccccccccccd, double:0.9)
            int r6 = (r34 > r17 ? 1 : (r34 == r17 ? 0 : -1))
            if (r6 < 0) goto L74
            double r17 = r34 - r17
            double r25 = r17 * r14
            r21 = 4603489467105573601(0x3fe2e147ae147ae1, double:0.59)
            r23 = 4604390187031047700(0x3fe6147ae147ae14, double:0.69)
            double r14 = com.google.android.material.color.utilities.MathUtils.lerp(r21, r23, r25)
            goto L86
        L74:
            double r17 = r34 - r21
            double r25 = r17 * r14
            r21 = 4602903999154015437(0x3fe0cccccccccccd, double:0.525)
            r23 = 4603489467105573601(0x3fe2e147ae147ae1, double:0.59)
            double r14 = com.google.android.material.color.utilities.MathUtils.lerp(r21, r23, r25)
        L86:
            r32 = r14
            r14 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            if (r50 == 0) goto L8f
            r25 = r14
            goto La9
        L8f:
            double r2 = -r0
            r21 = 4631107791820423168(0x4045000000000000, double:42.0)
            double r2 = r2 - r21
            r21 = 4636174341401214976(0x4057000000000000, double:92.0)
            double r2 = r2 / r21
            double r2 = java.lang.Math.exp(r2)
            r21 = 4598675619503873138(0x3fd1c71c71c71c72, double:0.2777777777777778)
            double r2 = r2 * r21
            double r2 = r14 - r2
            double r2 = r2 * r34
            r25 = r2
        La9:
            r21 = 0
            r23 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            double r2 = com.google.android.material.color.utilities.MathUtils.clampDouble(r21, r23, r25)
            r21 = 4636737291354636288(0x4059000000000000, double:100.0)
            double r23 = r21 / r11
            double r23 = r23 * r2
            double r23 = r23 + r14
            double r23 = r23 - r2
            double r25 = r21 / r19
            double r25 = r25 * r2
            double r25 = r25 + r14
            double r25 = r25 - r2
            double r27 = r21 / r8
            double r27 = r27 * r2
            double r27 = r27 + r14
            double r27 = r27 - r2
            r2 = 3
            double[] r3 = new double[r2]
            r36 = r3
            r3[r7] = r23
            r3[r13] = r25
            r3[r16] = r27
            r23 = 4617315517961601024(0x4014000000000000, double:5.0)
            double r23 = r23 * r0
            double r25 = r23 + r14
            double r25 = r14 / r25
            double r27 = r25 * r25
            double r27 = r27 * r25
            double r27 = r27 * r25
            double r14 = r14 - r27
            double r27 = r27 * r0
            r0 = 4591870180066957722(0x3fb999999999999a, double:0.1)
            double r0 = r0 * r14
            double r0 = r0 * r14
            double r14 = java.lang.Math.cbrt(r23)
            double r0 = r0 * r14
            double r0 = r27 + r0
            r37 = r0
            double r4 = com.google.android.material.color.utilities.ColorUtils.yFromLstar(r4)
            r14 = r43[r13]
            double r4 = r4 / r14
            r24 = r4
            r14 = 4609344146621155246(0x3ff7ae147ae147ae, double:1.48)
            double r17 = java.lang.Math.sqrt(r4)
            double r41 = r17 + r14
            r14 = 4596373779694328218(0x3fc999999999999a, double:0.2)
            double r4 = java.lang.Math.pow(r4, r14)
            r14 = 4604705439004963635(0x3fe7333333333333, double:0.725)
            double r14 = r14 / r4
            r28 = r14
            r30 = r14
            r4 = r3[r7]
            double r4 = r4 * r0
            double r4 = r4 * r11
            double r4 = r4 / r21
            r10 = 4601237667291888353(0x3fdae147ae147ae1, double:0.42)
            double r4 = java.lang.Math.pow(r4, r10)
            r17 = r3[r13]
            double r17 = r17 * r0
            double r17 = r17 * r19
            r43 = r14
            double r13 = r17 / r21
            double r12 = java.lang.Math.pow(r13, r10)
            r14 = r3[r16]
            double r14 = r14 * r0
            double r14 = r14 * r8
            double r14 = r14 / r21
            double r8 = java.lang.Math.pow(r14, r10)
            double[] r3 = new double[r2]
            r3[r7] = r4
            r4 = 1
            r3[r4] = r12
            r3[r16] = r8
            r5 = r3[r7]
            r8 = 4645744490609377280(0x4079000000000000, double:400.0)
            double r10 = r5 * r8
            r12 = 4628329633800288993(0x403b2147ae147ae1, double:27.13)
            double r5 = r5 + r12
            double r10 = r10 / r5
            r5 = r3[r4]
            double r14 = r5 * r8
            double r5 = r5 + r12
            double r14 = r14 / r5
            r5 = r3[r16]
            double r8 = r8 * r5
            double r5 = r5 + r12
            double r8 = r8 / r5
            double[] r2 = new double[r2]
            r2[r7] = r10
            r2[r4] = r14
            r2[r16] = r8
            r5 = 4611686018427387904(0x4000000000000000, double:2.0)
            r7 = r2[r7]
            double r7 = r7 * r5
            r3 = r2[r4]
            double r7 = r7 + r3
            r3 = 4587366580439587226(0x3fa999999999999a, double:0.05)
            r5 = r2[r16]
            double r5 = r5 * r3
            double r7 = r7 + r5
            r14 = r43
            double r26 = r7 * r14
            com.google.android.material.color.utilities.ViewingConditions r2 = new com.google.android.material.color.utilities.ViewingConditions
            r23 = r2
            r3 = 4598175219545276416(0x3fd0000000000000, double:0.25)
            double r39 = java.lang.Math.pow(r0, r3)
            r23.<init>(r24, r26, r28, r30, r32, r34, r36, r37, r39, r41)
            return r2
    }

    public double getAw() {
            r2 = this;
            double r0 = r2.aw
            return r0
    }

    double getC() {
            r2 = this;
            double r0 = r2.c
            return r0
    }

    double getFl() {
            r2 = this;
            double r0 = r2.fl
            return r0
    }

    public double getFlRoot() {
            r2 = this;
            double r0 = r2.flRoot
            return r0
    }

    public double getN() {
            r2 = this;
            double r0 = r2.n
            return r0
    }

    public double getNbb() {
            r2 = this;
            double r0 = r2.nbb
            return r0
    }

    double getNc() {
            r2 = this;
            double r0 = r2.nc
            return r0
    }

    double getNcb() {
            r2 = this;
            double r0 = r2.ncb
            return r0
    }

    public double[] getRgbD() {
            r1 = this;
            double[] r0 = r1.rgbD
            return r0
    }

    double getZ() {
            r2 = this;
            double r0 = r2.z
            return r0
    }
}
