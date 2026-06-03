package androidx.core.content.res;

/* JADX INFO: loaded from: classes.dex */
final class ViewingConditions {
    static final androidx.core.content.res.ViewingConditions DEFAULT = null;
    private final float mAw;
    private final float mC;
    private final float mFl;
    private final float mFlRoot;
    private final float mN;
    private final float mNbb;
    private final float mNc;
    private final float mNcb;
    private final float[] mRgbD;
    private final float mZ;

    static {
            float[] r0 = androidx.core.content.res.CamUtils.WHITE_POINT_D65
            r1 = 1112014848(0x42480000, float:50.0)
            float r2 = androidx.core.content.res.CamUtils.yFromLStar(r1)
            double r2 = (double) r2
            r4 = 4634156444089534796(0x404fd4bbab8b494c, double:63.66197723675813)
            double r2 = r2 * r4
            r4 = 4636737291354636288(0x4059000000000000, double:100.0)
            double r2 = r2 / r4
            float r2 = (float) r2
            r3 = 1073741824(0x40000000, float:2.0)
            r4 = 0
            androidx.core.content.res.ViewingConditions r0 = make(r0, r2, r1, r3, r4)
            androidx.core.content.res.ViewingConditions.DEFAULT = r0
            return
    }

    private ViewingConditions(float r1, float r2, float r3, float r4, float r5, float r6, float[] r7, float r8, float r9, float r10) {
            r0 = this;
            r0.<init>()
            r0.mN = r1
            r0.mAw = r2
            r0.mNbb = r3
            r0.mNcb = r4
            r0.mC = r5
            r0.mNc = r6
            r0.mRgbD = r7
            r0.mFl = r8
            r0.mFlRoot = r9
            r0.mZ = r10
            return
    }

    static androidx.core.content.res.ViewingConditions make(float[] r22, float r23, float r24, float r25, boolean r26) {
            r0 = r23
            float[][] r1 = androidx.core.content.res.CamUtils.XYZ_TO_CAM16RGB
            r2 = 0
            r3 = r22[r2]
            r4 = r1[r2]
            r5 = r4[r2]
            float r5 = r5 * r3
            r6 = 1
            r7 = r22[r6]
            r8 = r4[r6]
            float r8 = r8 * r7
            float r5 = r5 + r8
            r8 = 2
            r9 = r22[r8]
            r4 = r4[r8]
            float r4 = r4 * r9
            float r5 = r5 + r4
            r4 = r1[r6]
            r10 = r4[r2]
            float r10 = r10 * r3
            r11 = r4[r6]
            float r11 = r11 * r7
            float r10 = r10 + r11
            r4 = r4[r8]
            float r4 = r4 * r9
            float r10 = r10 + r4
            r1 = r1[r8]
            r4 = r1[r2]
            float r3 = r3 * r4
            r4 = r1[r6]
            float r7 = r7 * r4
            float r3 = r3 + r7
            r1 = r1[r8]
            float r9 = r9 * r1
            float r3 = r3 + r9
            r1 = 1092616192(0x41200000, float:10.0)
            float r4 = r25 / r1
            r7 = 1061997773(0x3f4ccccd, float:0.8)
            float r4 = r4 + r7
            double r11 = (double) r4
            r13 = 4606281698874543309(0x3feccccccccccccd, double:0.9)
            int r9 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            r11 = 1058474557(0x3f170a3d, float:0.59)
            if (r9 < 0) goto L57
            r7 = 1063675494(0x3f666666, float:0.9)
            float r7 = r4 - r7
            float r7 = r7 * r1
            r1 = 1060152279(0x3f30a3d7, float:0.69)
            float r1 = androidx.core.content.res.CamUtils.lerp(r11, r1, r7)
            goto L61
        L57:
            float r7 = r4 - r7
            float r7 = r7 * r1
            r1 = 1057384038(0x3f066666, float:0.525)
            float r1 = androidx.core.content.res.CamUtils.lerp(r1, r11, r7)
        L61:
            r16 = r1
            r1 = 1065353216(0x3f800000, float:1.0)
            if (r26 == 0) goto L69
            r7 = r1
            goto L7d
        L69:
            float r7 = -r0
            r9 = 1109917696(0x42280000, float:42.0)
            float r7 = r7 - r9
            r9 = 1119354880(0x42b80000, float:92.0)
            float r7 = r7 / r9
            double r11 = (double) r7
            double r11 = java.lang.Math.exp(r11)
            float r7 = (float) r11
            r9 = 1049508068(0x3e8e38e4, float:0.2777778)
            float r7 = r7 * r9
            float r7 = r1 - r7
            float r7 = r7 * r4
        L7d:
            double r11 = (double) r7
            r13 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            int r9 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r9 <= 0) goto L86
            r7 = r1
            goto L8d
        L86:
            r13 = 0
            int r9 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r9 >= 0) goto L8d
            r7 = 0
        L8d:
            r9 = 1120403456(0x42c80000, float:100.0)
            float r11 = r9 / r5
            float r11 = r11 * r7
            float r11 = r11 + r1
            float r11 = r11 - r7
            float r12 = r9 / r10
            float r12 = r12 * r7
            float r12 = r12 + r1
            float r12 = r12 - r7
            float r9 = r9 / r3
            float r9 = r9 * r7
            float r9 = r9 + r1
            float r9 = r9 - r7
            r7 = 3
            float[] r15 = new float[r7]
            r15[r2] = r11
            r15[r6] = r12
            r15[r8] = r9
            r9 = 1084227584(0x40a00000, float:5.0)
            float r9 = r9 * r0
            float r9 = r9 + r1
            float r9 = r1 / r9
            float r11 = r9 * r9
            float r11 = r11 * r9
            float r11 = r11 * r9
            float r1 = r1 - r11
            float r11 = r11 * r0
            r9 = 1036831949(0x3dcccccd, float:0.1)
            float r9 = r9 * r1
            float r9 = r9 * r1
            r12 = 4617315517961601024(0x4014000000000000, double:5.0)
            double r0 = (double) r0
            double r0 = r0 * r12
            double r0 = java.lang.Math.cbrt(r0)
            float r0 = (float) r0
            float r9 = r9 * r0
            float r0 = r11 + r9
            float r1 = androidx.core.content.res.CamUtils.yFromLStar(r24)
            r9 = r22[r6]
            float r12 = r1 / r9
            double r13 = (double) r12
            double r7 = java.lang.Math.sqrt(r13)
            float r7 = (float) r7
            r8 = 1069379748(0x3fbd70a4, float:1.48)
            float r21 = r7 + r8
            r7 = 4596373779694328218(0x3fc999999999999a, double:0.2)
            double r7 = java.lang.Math.pow(r13, r7)
            float r7 = (float) r7
            r8 = 1060739482(0x3f39999a, float:0.725)
            float r7 = r8 / r7
            r8 = r15[r2]
            float r8 = r8 * r0
            float r8 = r8 * r5
            double r8 = (double) r8
            r13 = 4636737291354636288(0x4059000000000000, double:100.0)
            double r8 = r8 / r13
            r1 = 4601237667291888353(0x3fdae147ae147ae1, double:0.42)
            double r8 = java.lang.Math.pow(r8, r1)
            float r8 = (float) r8
            r9 = r15[r6]
            float r9 = r9 * r0
            float r9 = r9 * r10
            double r9 = (double) r9
            double r9 = r9 / r13
            double r9 = java.lang.Math.pow(r9, r1)
            float r9 = (float) r9
            r10 = 2
            r11 = r15[r10]
            float r11 = r11 * r0
            float r11 = r11 * r3
            double r10 = (double) r11
            double r10 = r10 / r13
            double r1 = java.lang.Math.pow(r10, r1)
            float r1 = (float) r1
            r2 = 3
            float[] r3 = new float[r2]
            r2 = 0
            r3[r2] = r8
            r3[r6] = r9
            r8 = 2
            r3[r8] = r1
            r1 = r3[r2]
            r2 = 1137180672(0x43c80000, float:400.0)
            float r9 = r1 * r2
            r10 = 1104742973(0x41d90a3d, float:27.13)
            float r1 = r1 + r10
            float r9 = r9 / r1
            r1 = r3[r6]
            float r11 = r1 * r2
            float r1 = r1 + r10
            float r11 = r11 / r1
            r1 = r3[r8]
            float r2 = r2 * r1
            float r1 = r1 + r10
            float r2 = r2 / r1
            r1 = 3
            float[] r1 = new float[r1]
            r3 = 0
            r1[r3] = r9
            r1[r6] = r11
            r1[r8] = r2
            r2 = 1073741824(0x40000000, float:2.0)
            r3 = r1[r3]
            float r3 = r3 * r2
            r2 = r1[r6]
            float r3 = r3 + r2
            r2 = 1028443341(0x3d4ccccd, float:0.05)
            r1 = r1[r8]
            float r1 = r1 * r2
            float r3 = r3 + r1
            float r13 = r3 * r7
            androidx.core.content.res.ViewingConditions r1 = new androidx.core.content.res.ViewingConditions
            double r2 = (double) r0
            r5 = 4598175219545276416(0x3fd0000000000000, double:0.25)
            double r2 = java.lang.Math.pow(r2, r5)
            float r2 = (float) r2
            r11 = r1
            r14 = r7
            r3 = r15
            r15 = r7
            r17 = r4
            r18 = r3
            r19 = r0
            r20 = r2
            r11.<init>(r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)
            return r1
    }

    float getAw() {
            r1 = this;
            float r0 = r1.mAw
            return r0
    }

    float getC() {
            r1 = this;
            float r0 = r1.mC
            return r0
    }

    float getFl() {
            r1 = this;
            float r0 = r1.mFl
            return r0
    }

    float getFlRoot() {
            r1 = this;
            float r0 = r1.mFlRoot
            return r0
    }

    float getN() {
            r1 = this;
            float r0 = r1.mN
            return r0
    }

    float getNbb() {
            r1 = this;
            float r0 = r1.mNbb
            return r0
    }

    float getNc() {
            r1 = this;
            float r0 = r1.mNc
            return r0
    }

    float getNcb() {
            r1 = this;
            float r0 = r1.mNcb
            return r0
    }

    float[] getRgbD() {
            r1 = this;
            float[] r0 = r1.mRgbD
            return r0
    }

    float getZ() {
            r1 = this;
            float r0 = r1.mZ
            return r0
    }
}
