package com.google.android.material.color.utilities;

/* JADX INFO: loaded from: classes.dex */
public final class Cam16 {
    static final double[][] CAM16RGB_TO_XYZ = null;
    static final double[][] XYZ_TO_CAM16RGB = null;
    private final double astar;
    private final double bstar;
    private final double chroma;
    private final double hue;
    private final double j;
    private final double jstar;
    private final double m;
    private final double q;
    private final double s;
    private final double[] tempArray;

    static {
            r0 = 3
            double[] r1 = new double[r0]
            r1 = {x002c: FILL_ARRAY_DATA , data: [4600900581866978926, 4604031457306329131, -4635794904125409757} // fill-array
            double[] r2 = new double[r0]
            r2 = {x003c: FILL_ARRAY_DATA , data: [-4625191989450698851, 4608103017614246721, 4586769078869824727} // fill-array
            double[] r3 = new double[r0]
            r3 = {x004c: FILL_ARRAY_DATA , data: [-4656431766712308090, 4587215547722483729, 4606760224349349933} // fill-array
            double[][] r1 = new double[][]{r1, r2, r3}
            com.google.android.material.color.utilities.Cam16.XYZ_TO_CAM16RGB = r1
            double[] r1 = new double[r0]
            r1 = {x005c: FILL_ARRAY_DATA , data: [4611064827022865511, -4616138931392032233, 4594543040505068257} // fill-array
            double[] r2 = new double[r0]
            r2 = {x006c: FILL_ARRAY_DATA , data: [4600652677442466630, 4603772720463705113, -4647045267811766492} // fill-array
            double[] r0 = new double[r0]
            r0 = {x007c: FILL_ARRAY_DATA , data: [-4643148813942544530, -4638293581903180231, 4607407438453239198} // fill-array
            double[][] r0 = new double[][]{r1, r2, r0}
            com.google.android.material.color.utilities.Cam16.CAM16RGB_TO_XYZ = r0
            return
    }

    private Cam16(double r4, double r6, double r8, double r10, double r12, double r14, double r16, double r18, double r20) {
            r3 = this;
            r0 = r3
            r3.<init>()
            r1 = 3
            double[] r1 = new double[r1]
            r1 = {x002c: FILL_ARRAY_DATA , data: [0, 0, 0} // fill-array
            r0.tempArray = r1
            r1 = r4
            r0.hue = r1
            r1 = r6
            r0.chroma = r1
            r1 = r8
            r0.j = r1
            r1 = r10
            r0.q = r1
            r1 = r12
            r0.m = r1
            r1 = r14
            r0.s = r1
            r1 = r16
            r0.jstar = r1
            r1 = r18
            r0.astar = r1
            r1 = r20
            r0.bstar = r1
            return
    }

    public static com.google.android.material.color.utilities.Cam16 fromInt(int r1) {
            com.google.android.material.color.utilities.ViewingConditions r0 = com.google.android.material.color.utilities.ViewingConditions.DEFAULT
            com.google.android.material.color.utilities.Cam16 r1 = fromIntInViewingConditions(r1, r0)
            return r1
    }

    static com.google.android.material.color.utilities.Cam16 fromIntInViewingConditions(int r18, com.google.android.material.color.utilities.ViewingConditions r19) {
            r0 = r18
            r1 = 16711680(0xff0000, float:2.3418052E-38)
            r1 = r1 & r0
            int r1 = r1 >> 16
            r2 = 65280(0xff00, float:9.1477E-41)
            r2 = r2 & r0
            int r2 = r2 >> 8
            r0 = r0 & 255(0xff, float:3.57E-43)
            double r3 = com.google.android.material.color.utilities.ColorUtils.linearized(r1)
            double r1 = com.google.android.material.color.utilities.ColorUtils.linearized(r2)
            double r5 = com.google.android.material.color.utilities.ColorUtils.linearized(r0)
            r7 = 4601099658084187286(0x3fda63c2e8477c96, double:0.41233895)
            double r7 = r7 * r3
            r9 = 4600113940642081913(0x3fd6e341ae4b2c79, double:0.35762064)
            double r9 = r9 * r1
            double r7 = r7 + r9
            r9 = 4595671593572523358(0x3fc71af7273e5d5e, double:0.18051042)
            double r9 = r9 * r5
            double r11 = r7 + r9
            r7 = 4596827742536767164(0x3fcb367a0f9096bc, double:0.2126)
            double r7 = r7 * r3
            r9 = 4604617168452267173(0x3fe6e2eb1c432ca5, double:0.7152)
            double r9 = r9 * r1
            double r7 = r7 + r9
            r9 = 4589866978952703325(0x3fb27bb2fec56d5d, double:0.0722)
            double r9 = r9 * r5
            double r13 = r7 + r9
            r7 = 4581226238680505381(0x3f93c8fde0401c25, double:0.01932141)
            double r3 = r3 * r7
            r7 = 4593251078828733646(0x3fbe818525c434ce, double:0.11916382)
            double r1 = r1 * r7
            double r3 = r3 + r1
            r0 = 4606735164339439408(0x3fee693974c0c730, double:0.95034478)
            double r5 = r5 * r0
            double r15 = r3 + r5
            r17 = r19
            com.google.android.material.color.utilities.Cam16 r0 = fromXyzInViewingConditions(r11, r13, r15, r17)
            return r0
    }

    static com.google.android.material.color.utilities.Cam16 fromJch(double r7, double r9, double r11) {
            com.google.android.material.color.utilities.ViewingConditions r6 = com.google.android.material.color.utilities.ViewingConditions.DEFAULT
            r0 = r7
            r2 = r9
            r4 = r11
            com.google.android.material.color.utilities.Cam16 r7 = fromJchInViewingConditions(r0, r2, r4, r6)
            return r7
    }

    private static com.google.android.material.color.utilities.Cam16 fromJchInViewingConditions(double r23, double r25, double r27, com.google.android.material.color.utilities.ViewingConditions r29) {
            r5 = r23
            r3 = r25
            r1 = r27
            double r7 = r29.getC()
            r11 = 4616189618054758400(0x4010000000000000, double:4.0)
            double r7 = r11 / r7
            r9 = 4636737291354636288(0x4059000000000000, double:100.0)
            double r13 = r23 / r9
            double r9 = java.lang.Math.sqrt(r13)
            double r7 = r7 * r9
            double r9 = r29.getAw()
            double r9 = r9 + r11
            double r7 = r7 * r9
            double r9 = r29.getFlRoot()
            double r7 = r7 * r9
            double r9 = r29.getFlRoot()
            double r15 = r25 * r9
            r9 = r15
            double r13 = java.lang.Math.sqrt(r13)
            double r13 = r25 / r13
            double r17 = r29.getC()
            double r13 = r13 * r17
            double r17 = r29.getAw()
            double r17 = r17 + r11
            double r13 = r13 / r17
            double r11 = java.lang.Math.sqrt(r13)
            r13 = 4632233691727265792(0x4049000000000000, double:50.0)
            double r11 = r11 * r13
            double r17 = java.lang.Math.toRadians(r27)
            r13 = 4610334938539176756(0x3ffb333333333334, double:1.7000000000000002)
            double r13 = r13 * r23
            r19 = 4574720472685930873(0x3f7cac083126e979, double:0.007)
            double r19 = r19 * r23
            r21 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            double r19 = r19 + r21
            double r13 = r13 / r19
            r19 = 4582228873984682964(0x3f9758e219652bd4, double:0.0228)
            double r15 = r15 * r19
            double r15 = java.lang.Math.log1p(r15)
            r19 = 4631369514167189216(0x4045ee08fb823ee0, double:43.859649122807014)
            double r19 = r19 * r15
            double r15 = java.lang.Math.cos(r17)
            double r15 = r15 * r19
            double r17 = java.lang.Math.sin(r17)
            double r17 = r17 * r19
            com.google.android.material.color.utilities.Cam16 r19 = new com.google.android.material.color.utilities.Cam16
            r0 = r19
            r0.<init>(r1, r3, r5, r7, r9, r11, r13, r15, r17)
            return r19
    }

    public static com.google.android.material.color.utilities.Cam16 fromUcs(double r7, double r9, double r11) {
            com.google.android.material.color.utilities.ViewingConditions r6 = com.google.android.material.color.utilities.ViewingConditions.DEFAULT
            r0 = r7
            r2 = r9
            r4 = r11
            com.google.android.material.color.utilities.Cam16 r7 = fromUcsInViewingConditions(r0, r2, r4, r6)
            return r7
    }

    public static com.google.android.material.color.utilities.Cam16 fromUcsInViewingConditions(double r11, double r13, double r15, com.google.android.material.color.utilities.ViewingConditions r17) {
            double r0 = java.lang.Math.hypot(r13, r15)
            r2 = 4582228873984682964(0x3f9758e219652bd4, double:0.0228)
            double r0 = r0 * r2
            double r0 = java.lang.Math.expm1(r0)
            double r0 = r0 / r2
            double r2 = r17.getFlRoot()
            double r6 = r0 / r2
            r0 = r13
            r2 = r15
            double r0 = java.lang.Math.atan2(r2, r13)
            r2 = 4633260481411531256(0x404ca5dc1a63c1f8, double:57.29577951308232)
            double r0 = r0 * r2
            r2 = 0
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 >= 0) goto L2d
            r2 = 4645040803167600640(0x4076800000000000, double:360.0)
            double r0 = r0 + r2
        L2d:
            r8 = r0
            r0 = 4636737291354636288(0x4059000000000000, double:100.0)
            double r0 = r11 - r0
            r2 = 4574720472685930873(0x3f7cac083126e979, double:0.007)
            double r0 = r0 * r2
            r2 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            double r2 = r2 - r0
            double r4 = r11 / r2
            r10 = r17
            com.google.android.material.color.utilities.Cam16 r0 = fromJchInViewingConditions(r4, r6, r8, r10)
            return r0
    }

    static com.google.android.material.color.utilities.Cam16 fromXyzInViewingConditions(double r38, double r40, double r42, com.google.android.material.color.utilities.ViewingConditions r44) {
            double[][] r0 = com.google.android.material.color.utilities.Cam16.XYZ_TO_CAM16RGB
            r1 = 0
            r2 = r0[r1]
            r3 = r2[r1]
            double r3 = r3 * r38
            r5 = 1
            r6 = r2[r5]
            double r6 = r6 * r40
            double r3 = r3 + r6
            r6 = 2
            r7 = r2[r6]
            double r7 = r7 * r42
            double r3 = r3 + r7
            r2 = r0[r5]
            r7 = r2[r1]
            double r7 = r7 * r38
            r9 = r2[r5]
            double r9 = r9 * r40
            double r7 = r7 + r9
            r9 = r2[r6]
            double r9 = r9 * r42
            double r7 = r7 + r9
            r0 = r0[r6]
            r9 = r0[r1]
            double r9 = r9 * r38
            r11 = r0[r5]
            double r11 = r11 * r40
            double r9 = r9 + r11
            r11 = r0[r6]
            double r11 = r11 * r42
            double r9 = r9 + r11
            double[] r0 = r44.getRgbD()
            r1 = r0[r1]
            double r1 = r1 * r3
            double[] r0 = r44.getRgbD()
            r3 = r0[r5]
            double r3 = r3 * r7
            double[] r0 = r44.getRgbD()
            r5 = r0[r6]
            double r5 = r5 * r9
            double r7 = r44.getFl()
            double r9 = java.lang.Math.abs(r1)
            double r7 = r7 * r9
            r9 = 4636737291354636288(0x4059000000000000, double:100.0)
            double r7 = r7 / r9
            r11 = 4601237667291888353(0x3fdae147ae147ae1, double:0.42)
            double r7 = java.lang.Math.pow(r7, r11)
            double r13 = r44.getFl()
            double r15 = java.lang.Math.abs(r3)
            double r13 = r13 * r15
            double r13 = r13 / r9
            double r13 = java.lang.Math.pow(r13, r11)
            double r15 = r44.getFl()
            double r17 = java.lang.Math.abs(r5)
            double r15 = r15 * r17
            r38 = r5
            double r5 = r15 / r9
            double r5 = java.lang.Math.pow(r5, r11)
            double r0 = java.lang.Math.signum(r1)
            r11 = 4645744490609377280(0x4079000000000000, double:400.0)
            double r0 = r0 * r11
            double r0 = r0 * r7
            r15 = 4628329633800288993(0x403b2147ae147ae1, double:27.13)
            double r7 = r7 + r15
            double r0 = r0 / r7
            double r2 = java.lang.Math.signum(r3)
            double r2 = r2 * r11
            double r2 = r2 * r13
            double r13 = r13 + r15
            double r2 = r2 / r13
            double r7 = java.lang.Math.signum(r38)
            double r7 = r7 * r11
            double r7 = r7 * r5
            double r5 = r5 + r15
            double r7 = r7 / r5
            r4 = 4622382067542392832(0x4026000000000000, double:11.0)
            double r11 = r0 * r4
            r13 = -4600427019358961664(0xc028000000000000, double:-12.0)
            double r13 = r13 * r2
            double r11 = r11 + r13
            double r11 = r11 + r7
            double r11 = r11 / r4
            double r4 = r0 + r2
            r13 = 4611686018427387904(0x4000000000000000, double:2.0)
            double r15 = r7 * r13
            double r4 = r4 - r15
            r15 = 4621256167635550208(0x4022000000000000, double:9.0)
            double r4 = r4 / r15
            r15 = 4626322717216342016(0x4034000000000000, double:20.0)
            double r17 = r0 * r15
            double r2 = r2 * r15
            double r17 = r17 + r2
            r19 = 4626604192193052672(0x4035000000000000, double:21.0)
            double r19 = r19 * r7
            double r17 = r17 + r19
            double r17 = r17 / r15
            r19 = 4630826316843712512(0x4044000000000000, double:40.0)
            double r0 = r0 * r19
            double r0 = r0 + r2
            double r0 = r0 + r7
            double r0 = r0 / r15
            double r2 = java.lang.Math.atan2(r4, r11)
            double r2 = java.lang.Math.toDegrees(r2)
            r6 = 0
            int r6 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            r7 = 4645040803167600640(0x4076800000000000, double:360.0)
            if (r6 >= 0) goto Ldf
            double r2 = r2 + r7
        Ldc:
            r20 = r2
            goto Le5
        Ldf:
            int r6 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
            if (r6 < 0) goto Ldc
            double r2 = r2 - r7
            goto Ldc
        Le5:
            double r2 = java.lang.Math.toRadians(r20)
            double r15 = r44.getNbb()
            double r0 = r0 * r15
            double r15 = r44.getAw()
            double r0 = r0 / r15
            double r15 = r44.getC()
            double r22 = r44.getZ()
            double r13 = r15 * r22
            double r0 = java.lang.Math.pow(r0, r13)
            double r24 = r0 * r9
            double r0 = r44.getC()
            r13 = 4616189618054758400(0x4010000000000000, double:4.0)
            double r0 = r13 / r0
            double r9 = r24 / r9
            double r15 = java.lang.Math.sqrt(r9)
            double r0 = r0 * r15
            double r15 = r44.getAw()
            double r15 = r15 + r13
            double r0 = r0 * r15
            double r15 = r44.getFlRoot()
            double r26 = r0 * r15
            r0 = 4626362123713081508(0x403423d70a3d70a4, double:20.14)
            int r0 = (r20 > r0 ? 1 : (r20 == r0 ? 0 : -1))
            if (r0 >= 0) goto L12a
            double r7 = r20 + r7
            goto L12c
        L12a:
            r7 = r20
        L12c:
            double r0 = java.lang.Math.toRadians(r7)
            r6 = 4611686018427387904(0x4000000000000000, double:2.0)
            double r0 = r0 + r6
            double r0 = java.lang.Math.cos(r0)
            r6 = 4615739258092021350(0x400e666666666666, double:3.8)
            double r0 = r0 + r6
            r6 = 4598175219545276416(0x3fd0000000000000, double:0.25)
            double r0 = r0 * r6
            r6 = 4660676196825845445(0x40ae0c4ec4ec4ec5, double:3846.153846153846)
            double r0 = r0 * r6
            double r6 = r44.getNc()
            double r0 = r0 * r6
            double r6 = r44.getNcb()
            double r0 = r0 * r6
            double r4 = java.lang.Math.hypot(r11, r4)
            double r0 = r0 * r4
            r4 = 4599166011463297925(0x3fd3851eb851eb85, double:0.305)
            double r17 = r17 + r4
            double r0 = r0 / r17
            r4 = 4598895795485655695(0x3fd28f5c28f5c28f, double:0.29)
            double r6 = r44.getN()
            double r4 = java.lang.Math.pow(r4, r6)
            r6 = 4610064722561534525(0x3ffa3d70a3d70a3d, double:1.64)
            double r6 = r6 - r4
            r4 = 4604750475001237340(0x3fe75c28f5c28f5c, double:0.73)
            double r4 = java.lang.Math.pow(r6, r4)
            r6 = 4606281698874543309(0x3feccccccccccccd, double:0.9)
            double r0 = java.lang.Math.pow(r0, r6)
            double r4 = r4 * r0
            double r0 = java.lang.Math.sqrt(r9)
            double r0 = r0 * r4
            r22 = r0
            double r6 = r44.getFlRoot()
            double r0 = r0 * r6
            r28 = r0
            double r6 = r44.getC()
            double r4 = r4 * r6
            double r6 = r44.getAw()
            double r6 = r6 + r13
            double r4 = r4 / r6
            double r4 = java.lang.Math.sqrt(r4)
            r6 = 4632233691727265792(0x4049000000000000, double:50.0)
            double r30 = r4 * r6
            r4 = 4610334938539176756(0x3ffb333333333334, double:1.7000000000000002)
            double r4 = r4 * r24
            r6 = 4574720472685930873(0x3f7cac083126e979, double:0.007)
            double r6 = r6 * r24
            r8 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            double r6 = r6 + r8
            double r32 = r4 / r6
            r4 = 4582228873984682964(0x3f9758e219652bd4, double:0.0228)
            double r0 = r0 * r4
            double r0 = java.lang.Math.log1p(r0)
            r4 = 4631369514167189216(0x4045ee08fb823ee0, double:43.859649122807014)
            double r0 = r0 * r4
            double r4 = java.lang.Math.cos(r2)
            double r34 = r0 * r4
            double r2 = java.lang.Math.sin(r2)
            double r36 = r0 * r2
            com.google.android.material.color.utilities.Cam16 r0 = new com.google.android.material.color.utilities.Cam16
            r19 = r0
            r19.<init>(r20, r22, r24, r26, r28, r30, r32, r34, r36)
            return r0
    }

    double distance(com.google.android.material.color.utilities.Cam16 r9) {
            r8 = this;
            double r0 = r8.getJstar()
            double r2 = r9.getJstar()
            double r0 = r0 - r2
            double r2 = r8.getAstar()
            double r4 = r9.getAstar()
            double r2 = r2 - r4
            double r4 = r8.getBstar()
            double r6 = r9.getBstar()
            double r4 = r4 - r6
            double r0 = r0 * r0
            double r2 = r2 * r2
            double r0 = r0 + r2
            double r4 = r4 * r4
            double r0 = r0 + r4
            double r0 = java.lang.Math.sqrt(r0)
            r2 = 4603849755075763241(0x3fe428f5c28f5c29, double:0.63)
            double r0 = java.lang.Math.pow(r0, r2)
            r2 = 4609028894647239311(0x3ff68f5c28f5c28f, double:1.41)
            double r0 = r0 * r2
            return r0
    }

    public double getAstar() {
            r2 = this;
            double r0 = r2.astar
            return r0
    }

    public double getBstar() {
            r2 = this;
            double r0 = r2.bstar
            return r0
    }

    public double getChroma() {
            r2 = this;
            double r0 = r2.chroma
            return r0
    }

    public double getHue() {
            r2 = this;
            double r0 = r2.hue
            return r0
    }

    public double getJ() {
            r2 = this;
            double r0 = r2.j
            return r0
    }

    public double getJstar() {
            r2 = this;
            double r0 = r2.jstar
            return r0
    }

    public double getM() {
            r2 = this;
            double r0 = r2.m
            return r0
    }

    public double getQ() {
            r2 = this;
            double r0 = r2.q
            return r0
    }

    public double getS() {
            r2 = this;
            double r0 = r2.s
            return r0
    }

    public int toInt() {
            r1 = this;
            com.google.android.material.color.utilities.ViewingConditions r0 = com.google.android.material.color.utilities.ViewingConditions.DEFAULT
            int r0 = r1.viewed(r0)
            return r0
    }

    int viewed(com.google.android.material.color.utilities.ViewingConditions r8) {
            r7 = this;
            double[] r0 = r7.tempArray
            double[] r8 = r7.xyzInViewingConditions(r8, r0)
            r0 = 0
            r1 = r8[r0]
            r0 = 1
            r3 = r8[r0]
            r0 = 2
            r5 = r8[r0]
            int r8 = com.google.android.material.color.utilities.ColorUtils.argbFromXyz(r1, r3, r5)
            return r8
    }

    double[] xyzInViewingConditions(com.google.android.material.color.utilities.ViewingConditions r21, double[] r22) {
            r20 = this;
            double r0 = r20.getChroma()
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            r4 = 4636737291354636288(0x4059000000000000, double:100.0)
            if (r0 == 0) goto L24
            double r0 = r20.getJ()
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 != 0) goto L15
            goto L24
        L15:
            double r0 = r20.getChroma()
            double r6 = r20.getJ()
            double r6 = r6 / r4
            double r6 = java.lang.Math.sqrt(r6)
            double r0 = r0 / r6
            goto L25
        L24:
            r0 = r2
        L25:
            r6 = 4598895795485655695(0x3fd28f5c28f5c28f, double:0.29)
            double r8 = r21.getN()
            double r6 = java.lang.Math.pow(r6, r8)
            r8 = 4610064722561534525(0x3ffa3d70a3d70a3d, double:1.64)
            double r8 = r8 - r6
            r6 = 4604750475001237340(0x3fe75c28f5c28f5c, double:0.73)
            double r6 = java.lang.Math.pow(r8, r6)
            double r0 = r0 / r6
            r6 = 4607682818758614130(0x3ff1c71c71c71c72, double:1.1111111111111112)
            double r0 = java.lang.Math.pow(r0, r6)
            double r6 = r20.getHue()
            double r6 = java.lang.Math.toRadians(r6)
            r8 = 4611686018427387904(0x4000000000000000, double:2.0)
            double r8 = r8 + r6
            double r8 = java.lang.Math.cos(r8)
            r10 = 4615739258092021350(0x400e666666666666, double:3.8)
            double r8 = r8 + r10
            r10 = 4598175219545276416(0x3fd0000000000000, double:0.25)
            double r8 = r8 * r10
            double r10 = r21.getAw()
            double r12 = r20.getJ()
            double r12 = r12 / r4
            r14 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            double r16 = r21.getC()
            double r14 = r14 / r16
            double r16 = r21.getZ()
            double r14 = r14 / r16
            double r12 = java.lang.Math.pow(r12, r14)
            double r10 = r10 * r12
            r12 = 4660676196825845445(0x40ae0c4ec4ec4ec5, double:3846.153846153846)
            double r8 = r8 * r12
            double r12 = r21.getNc()
            double r8 = r8 * r12
            double r12 = r21.getNcb()
            double r8 = r8 * r12
            double r12 = r21.getNbb()
            double r10 = r10 / r12
            double r12 = java.lang.Math.sin(r6)
            double r6 = java.lang.Math.cos(r6)
            r14 = 4599166011463297925(0x3fd3851eb851eb85, double:0.305)
            double r14 = r14 + r10
            r16 = 4627167142146473984(0x4037000000000000, double:23.0)
            double r14 = r14 * r16
            double r14 = r14 * r0
            double r8 = r8 * r16
            r16 = 4622382067542392832(0x4026000000000000, double:11.0)
            double r16 = r16 * r0
            double r16 = r16 * r6
            double r8 = r8 + r16
            r16 = 4637300241308057600(0x405b000000000000, double:108.0)
            double r0 = r0 * r16
            double r0 = r0 * r12
            double r8 = r8 + r0
            double r14 = r14 / r8
            double r6 = r6 * r14
            double r14 = r14 * r12
            r0 = 4646800021772042240(0x407cc00000000000, double:460.0)
            double r10 = r10 * r0
            r0 = 4646641692097642496(0x407c300000000000, double:451.0)
            double r0 = r0 * r6
            double r0 = r0 + r10
            r8 = 4643774165772402688(0x4072000000000000, double:288.0)
            double r8 = r8 * r14
            double r0 = r0 + r8
            r8 = 4653885274701430784(0x4095ec0000000000, double:1403.0)
            double r0 = r0 / r8
            r12 = 4651048534701768704(0x408bd80000000000, double:891.0)
            double r12 = r12 * r6
            double r12 = r10 - r12
            r16 = 4643299176749203456(0x4070500000000000, double:261.0)
            double r16 = r16 * r14
            double r12 = r12 - r16
            double r12 = r12 / r8
            r16 = 4641944578423783424(0x406b800000000000, double:220.0)
            double r6 = r6 * r16
            double r10 = r10 - r6
            r6 = 4663648937956081664(0x40b89c0000000000, double:6300.0)
            double r14 = r14 * r6
            double r10 = r10 - r14
            double r10 = r10 / r8
            double r6 = java.lang.Math.abs(r0)
            r8 = 4628329633800288993(0x403b2147ae147ae1, double:27.13)
            double r6 = r6 * r8
            double r14 = java.lang.Math.abs(r0)
            r16 = 4645744490609377280(0x4079000000000000, double:400.0)
            double r14 = r16 - r14
            double r6 = r6 / r14
            double r6 = java.lang.Math.max(r2, r6)
            double r0 = java.lang.Math.signum(r0)
            double r14 = r21.getFl()
            double r14 = r4 / r14
            double r0 = r0 * r14
            r14 = 4612543846927839427(0x40030c30c30c30c3, double:2.380952380952381)
            double r6 = java.lang.Math.pow(r6, r14)
            double r0 = r0 * r6
            double r6 = java.lang.Math.abs(r12)
            double r6 = r6 * r8
            double r18 = java.lang.Math.abs(r12)
            double r18 = r16 - r18
            double r6 = r6 / r18
            double r6 = java.lang.Math.max(r2, r6)
            double r12 = java.lang.Math.signum(r12)
            double r18 = r21.getFl()
            double r18 = r4 / r18
            double r12 = r12 * r18
            double r6 = java.lang.Math.pow(r6, r14)
            double r12 = r12 * r6
            double r6 = java.lang.Math.abs(r10)
            double r6 = r6 * r8
            double r8 = java.lang.Math.abs(r10)
            double r16 = r16 - r8
            double r6 = r6 / r16
            double r2 = java.lang.Math.max(r2, r6)
            double r6 = java.lang.Math.signum(r10)
            double r8 = r21.getFl()
            double r4 = r4 / r8
            double r6 = r6 * r4
            double r2 = java.lang.Math.pow(r2, r14)
            double r6 = r6 * r2
            double[] r2 = r21.getRgbD()
            r3 = 0
            r4 = r2[r3]
            double r0 = r0 / r4
            double[] r2 = r21.getRgbD()
            r4 = 1
            r8 = r2[r4]
            double r12 = r12 / r8
            double[] r2 = r21.getRgbD()
            r5 = 2
            r8 = r2[r5]
            double r6 = r6 / r8
            double[][] r2 = com.google.android.material.color.utilities.Cam16.CAM16RGB_TO_XYZ
            r8 = r2[r3]
            r9 = r8[r3]
            double r9 = r9 * r0
            r14 = r8[r4]
            double r14 = r14 * r12
            double r9 = r9 + r14
            r14 = r8[r5]
            double r14 = r14 * r6
            double r9 = r9 + r14
            r8 = r2[r4]
            r14 = r8[r3]
            double r14 = r14 * r0
            r16 = r8[r4]
            double r16 = r16 * r12
            double r14 = r14 + r16
            r16 = r8[r5]
            double r16 = r16 * r6
            double r14 = r14 + r16
            r2 = r2[r5]
            r16 = r2[r3]
            double r0 = r0 * r16
            r16 = r2[r4]
            double r12 = r12 * r16
            double r0 = r0 + r12
            r11 = r2[r5]
            double r6 = r6 * r11
            double r0 = r0 + r6
            if (r22 == 0) goto L1b1
            r22[r3] = r9
            r22[r4] = r14
            r22[r5] = r0
            return r22
        L1b1:
            r2 = 3
            double[] r2 = new double[r2]
            r2[r3] = r9
            r2[r4] = r14
            r2[r5] = r0
            return r2
    }
}
