package com.google.android.material.color.utilities;

/* JADX INFO: loaded from: classes.dex */
public final class DynamicColor {
    public final java.util.function.Function<com.google.android.material.color.utilities.DynamicScheme, com.google.android.material.color.utilities.DynamicColor> background;
    public final com.google.android.material.color.utilities.ContrastCurve contrastCurve;
    private final java.util.HashMap<com.google.android.material.color.utilities.DynamicScheme, com.google.android.material.color.utilities.Hct> hctCache;
    public final boolean isBackground;
    public final java.lang.String name;
    public final java.util.function.Function<com.google.android.material.color.utilities.DynamicScheme, java.lang.Double> opacity;
    public final java.util.function.Function<com.google.android.material.color.utilities.DynamicScheme, com.google.android.material.color.utilities.TonalPalette> palette;
    public final java.util.function.Function<com.google.android.material.color.utilities.DynamicScheme, com.google.android.material.color.utilities.DynamicColor> secondBackground;
    public final java.util.function.Function<com.google.android.material.color.utilities.DynamicScheme, java.lang.Double> tone;
    public final java.util.function.Function<com.google.android.material.color.utilities.DynamicScheme, com.google.android.material.color.utilities.ToneDeltaPair> toneDeltaPair;

    public DynamicColor(java.lang.String r2, java.util.function.Function<com.google.android.material.color.utilities.DynamicScheme, com.google.android.material.color.utilities.TonalPalette> r3, java.util.function.Function<com.google.android.material.color.utilities.DynamicScheme, java.lang.Double> r4, boolean r5, java.util.function.Function<com.google.android.material.color.utilities.DynamicScheme, com.google.android.material.color.utilities.DynamicColor> r6, java.util.function.Function<com.google.android.material.color.utilities.DynamicScheme, com.google.android.material.color.utilities.DynamicColor> r7, com.google.android.material.color.utilities.ContrastCurve r8, java.util.function.Function<com.google.android.material.color.utilities.DynamicScheme, com.google.android.material.color.utilities.ToneDeltaPair> r9) {
            r1 = this;
            r1.<init>()
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1.hctCache = r0
            r1.name = r2
            r1.palette = r3
            r1.tone = r4
            r1.isBackground = r5
            r1.background = r6
            r1.secondBackground = r7
            r1.contrastCurve = r8
            r1.toneDeltaPair = r9
            r2 = 0
            r1.opacity = r2
            return
    }

    public DynamicColor(java.lang.String r2, java.util.function.Function<com.google.android.material.color.utilities.DynamicScheme, com.google.android.material.color.utilities.TonalPalette> r3, java.util.function.Function<com.google.android.material.color.utilities.DynamicScheme, java.lang.Double> r4, boolean r5, java.util.function.Function<com.google.android.material.color.utilities.DynamicScheme, com.google.android.material.color.utilities.DynamicColor> r6, java.util.function.Function<com.google.android.material.color.utilities.DynamicScheme, com.google.android.material.color.utilities.DynamicColor> r7, com.google.android.material.color.utilities.ContrastCurve r8, java.util.function.Function<com.google.android.material.color.utilities.DynamicScheme, com.google.android.material.color.utilities.ToneDeltaPair> r9, java.util.function.Function<com.google.android.material.color.utilities.DynamicScheme, java.lang.Double> r10) {
            r1 = this;
            r1.<init>()
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1.hctCache = r0
            r1.name = r2
            r1.palette = r3
            r1.tone = r4
            r1.isBackground = r5
            r1.background = r6
            r1.secondBackground = r7
            r1.contrastCurve = r8
            r1.toneDeltaPair = r9
            r1.opacity = r10
            return
    }

    public static double enableLightForeground(double r1) {
            boolean r0 = tonePrefersLightForeground(r1)
            if (r0 == 0) goto L11
            boolean r0 = toneAllowsLightForeground(r1)
            if (r0 != 0) goto L11
            r1 = 4632092954238910464(0x4048800000000000, double:49.0)
        L11:
            return r1
    }

    public static double foregroundTone(double r10, double r12) {
            double r0 = com.google.android.material.color.utilities.Contrast.lighterUnsafe(r10, r12)
            double r2 = com.google.android.material.color.utilities.Contrast.darkerUnsafe(r10, r12)
            double r4 = com.google.android.material.color.utilities.Contrast.ratioOfTones(r0, r10)
            double r6 = com.google.android.material.color.utilities.Contrast.ratioOfTones(r2, r10)
            boolean r10 = tonePrefersLightForeground(r10)
            if (r10 == 0) goto L3d
            double r10 = r4 - r6
            double r10 = java.lang.Math.abs(r10)
            r8 = 4591870180066957722(0x3fb999999999999a, double:0.1)
            int r10 = (r10 > r8 ? 1 : (r10 == r8 ? 0 : -1))
            if (r10 >= 0) goto L2f
            int r10 = (r4 > r12 ? 1 : (r4 == r12 ? 0 : -1))
            if (r10 >= 0) goto L2f
            int r10 = (r6 > r12 ? 1 : (r6 == r12 ? 0 : -1))
            if (r10 >= 0) goto L2f
            r10 = 1
            goto L30
        L2f:
            r10 = 0
        L30:
            int r11 = (r4 > r12 ? 1 : (r4 == r12 ? 0 : -1))
            if (r11 >= 0) goto L3c
            int r11 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r11 >= 0) goto L3c
            if (r10 == 0) goto L3b
            goto L3c
        L3b:
            return r2
        L3c:
            return r0
        L3d:
            int r10 = (r6 > r12 ? 1 : (r6 == r12 ? 0 : -1))
            if (r10 >= 0) goto L45
            int r10 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r10 < 0) goto L46
        L45:
            r0 = r2
        L46:
            return r0
    }

    public static com.google.android.material.color.utilities.DynamicColor fromArgb(java.lang.String r2, int r3) {
            com.google.android.material.color.utilities.Hct r0 = com.google.android.material.color.utilities.Hct.fromInt(r3)
            com.google.android.material.color.utilities.TonalPalette r3 = com.google.android.material.color.utilities.TonalPalette.fromInt(r3)
            com.google.android.material.color.utilities.DynamicColor$$ExternalSyntheticLambda0 r1 = new com.google.android.material.color.utilities.DynamicColor$$ExternalSyntheticLambda0
            r1.<init>(r3)
            com.google.android.material.color.utilities.DynamicColor$$ExternalSyntheticLambda1 r3 = new com.google.android.material.color.utilities.DynamicColor$$ExternalSyntheticLambda1
            r3.<init>(r0)
            com.google.android.material.color.utilities.DynamicColor r2 = fromPalette(r2, r1, r3)
            return r2
    }

    public static com.google.android.material.color.utilities.DynamicColor fromPalette(java.lang.String r10, java.util.function.Function<com.google.android.material.color.utilities.DynamicScheme, com.google.android.material.color.utilities.TonalPalette> r11, java.util.function.Function<com.google.android.material.color.utilities.DynamicScheme, java.lang.Double> r12) {
            com.google.android.material.color.utilities.DynamicColor r9 = new com.google.android.material.color.utilities.DynamicColor
            r7 = 0
            r8 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r0 = r9
            r1 = r10
            r2 = r11
            r3 = r12
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            return r9
    }

    public static com.google.android.material.color.utilities.DynamicColor fromPalette(java.lang.String r10, java.util.function.Function<com.google.android.material.color.utilities.DynamicScheme, com.google.android.material.color.utilities.TonalPalette> r11, java.util.function.Function<com.google.android.material.color.utilities.DynamicScheme, java.lang.Double> r12, boolean r13) {
            com.google.android.material.color.utilities.DynamicColor r9 = new com.google.android.material.color.utilities.DynamicColor
            r7 = 0
            r8 = 0
            r5 = 0
            r6 = 0
            r0 = r9
            r1 = r10
            r2 = r11
            r3 = r12
            r4 = r13
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            return r9
    }

    static /* synthetic */ com.google.android.material.color.utilities.TonalPalette lambda$fromArgb$0(com.google.android.material.color.utilities.TonalPalette r0, com.google.android.material.color.utilities.DynamicScheme r1) {
            return r0
    }

    static /* synthetic */ java.lang.Double lambda$fromArgb$1(com.google.android.material.color.utilities.Hct r0, com.google.android.material.color.utilities.DynamicScheme r1) {
            double r0 = r0.getTone()
            java.lang.Double r0 = java.lang.Double.valueOf(r0)
            return r0
    }

    public static boolean toneAllowsLightForeground(double r2) {
            long r2 = java.lang.Math.round(r2)
            r0 = 49
            int r2 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r2 > 0) goto Lc
            r2 = 1
            goto Ld
        Lc:
            r2 = 0
        Ld:
            return r2
    }

    public static boolean tonePrefersLightForeground(double r2) {
            long r2 = java.lang.Math.round(r2)
            r0 = 60
            int r2 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r2 >= 0) goto Lc
            r2 = 1
            goto Ld
        Lc:
            r2 = 0
        Ld:
            return r2
    }

    public int getArgb(com.google.android.material.color.utilities.DynamicScheme r6) {
            r5 = this;
            com.google.android.material.color.utilities.Hct r0 = r5.getHct(r6)
            int r0 = r0.toInt()
            java.util.function.Function<com.google.android.material.color.utilities.DynamicScheme, java.lang.Double> r1 = r5.opacity
            if (r1 != 0) goto Ld
            return r0
        Ld:
            java.lang.Object r6 = r1.apply(r6)
            java.lang.Double r6 = (java.lang.Double) r6
            double r1 = r6.doubleValue()
            r3 = 4643176031446892544(0x406fe00000000000, double:255.0)
            double r1 = r1 * r3
            long r1 = java.lang.Math.round(r1)
            int r6 = (int) r1
            r1 = 0
            r2 = 255(0xff, float:3.57E-43)
            int r6 = com.google.android.material.color.utilities.MathUtils.clampInt(r1, r2, r6)
            r1 = 16777215(0xffffff, float:2.3509886E-38)
            r0 = r0 & r1
            int r6 = r6 << 24
            r6 = r6 | r0
            return r6
    }

    public com.google.android.material.color.utilities.Hct getHct(com.google.android.material.color.utilities.DynamicScheme r4) {
            r3 = this;
            java.util.HashMap<com.google.android.material.color.utilities.DynamicScheme, com.google.android.material.color.utilities.Hct> r0 = r3.hctCache
            java.lang.Object r0 = r0.get(r4)
            com.google.android.material.color.utilities.Hct r0 = (com.google.android.material.color.utilities.Hct) r0
            if (r0 == 0) goto Lb
            return r0
        Lb:
            double r0 = r3.getTone(r4)
            java.util.function.Function<com.google.android.material.color.utilities.DynamicScheme, com.google.android.material.color.utilities.TonalPalette> r2 = r3.palette
            java.lang.Object r2 = r2.apply(r4)
            com.google.android.material.color.utilities.TonalPalette r2 = (com.google.android.material.color.utilities.TonalPalette) r2
            com.google.android.material.color.utilities.Hct r0 = r2.getHct(r0)
            java.util.HashMap<com.google.android.material.color.utilities.DynamicScheme, com.google.android.material.color.utilities.Hct> r1 = r3.hctCache
            int r1 = r1.size()
            r2 = 4
            if (r1 <= r2) goto L29
            java.util.HashMap<com.google.android.material.color.utilities.DynamicScheme, com.google.android.material.color.utilities.Hct> r1 = r3.hctCache
            r1.clear()
        L29:
            java.util.HashMap<com.google.android.material.color.utilities.DynamicScheme, com.google.android.material.color.utilities.Hct> r1 = r3.hctCache
            r1.put(r4, r0)
            return r0
    }

    public double getTone(com.google.android.material.color.utilities.DynamicScheme r31) {
            r30 = this;
            r0 = r30
            r1 = r31
            double r2 = r1.contrastLevel
            r4 = 0
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 >= 0) goto Le
            r2 = 1
            goto Lf
        Le:
            r2 = 0
        Lf:
            java.util.function.Function<com.google.android.material.color.utilities.DynamicScheme, com.google.android.material.color.utilities.ToneDeltaPair> r7 = r0.toneDeltaPair
            if (r7 == 0) goto L158
            java.lang.Object r7 = r7.apply(r1)
            com.google.android.material.color.utilities.ToneDeltaPair r7 = (com.google.android.material.color.utilities.ToneDeltaPair) r7
            com.google.android.material.color.utilities.DynamicColor r16 = r7.getRoleA()
            com.google.android.material.color.utilities.DynamicColor r17 = r7.getRoleB()
            double r18 = r7.getDelta()
            com.google.android.material.color.utilities.TonePolarity r6 = r7.getPolarity()
            boolean r7 = r7.getStayTogether()
            java.util.function.Function<com.google.android.material.color.utilities.DynamicScheme, com.google.android.material.color.utilities.DynamicColor> r3 = r0.background
            java.lang.Object r3 = r3.apply(r1)
            com.google.android.material.color.utilities.DynamicColor r3 = (com.google.android.material.color.utilities.DynamicColor) r3
            double r8 = r3.getTone(r1)
            com.google.android.material.color.utilities.TonePolarity r3 = com.google.android.material.color.utilities.TonePolarity.NEARER
            if (r6 == r3) goto L50
            com.google.android.material.color.utilities.TonePolarity r3 = com.google.android.material.color.utilities.TonePolarity.LIGHTER
            if (r6 != r3) goto L45
            boolean r3 = r1.isDark
            if (r3 == 0) goto L50
        L45:
            com.google.android.material.color.utilities.TonePolarity r3 = com.google.android.material.color.utilities.TonePolarity.DARKER
            if (r6 != r3) goto L4e
            boolean r3 = r1.isDark
            if (r3 == 0) goto L4e
            goto L50
        L4e:
            r3 = 0
            goto L51
        L50:
            r3 = 1
        L51:
            if (r3 == 0) goto L56
            r6 = r16
            goto L58
        L56:
            r6 = r17
        L58:
            if (r3 == 0) goto L5d
            r3 = r17
            goto L5f
        L5d:
            r3 = r16
        L5f:
            java.lang.String r12 = r0.name
            java.lang.String r13 = r6.name
            boolean r12 = r12.equals(r13)
            boolean r13 = r1.isDark
            if (r13 == 0) goto L6e
            r20 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            goto L70
        L6e:
            r20 = -4616189618054758400(0xbff0000000000000, double:-1.0)
        L70:
            com.google.android.material.color.utilities.ContrastCurve r13 = r6.contrastCurve
            double r4 = r1.contrastLevel
            double r4 = r13.getContrast(r4)
            com.google.android.material.color.utilities.ContrastCurve r13 = r3.contrastCurve
            double r14 = r1.contrastLevel
            double r13 = r13.getContrast(r14)
            java.util.function.Function<com.google.android.material.color.utilities.DynamicScheme, java.lang.Double> r6 = r6.tone
            java.lang.Object r6 = r6.apply(r1)
            java.lang.Double r6 = (java.lang.Double) r6
            double r10 = r6.doubleValue()
            double r22 = com.google.android.material.color.utilities.Contrast.ratioOfTones(r8, r10)
            int r6 = (r22 > r4 ? 1 : (r22 == r4 ? 0 : -1))
            if (r6 < 0) goto L95
            goto L99
        L95:
            double r10 = foregroundTone(r8, r4)
        L99:
            java.util.function.Function<com.google.android.material.color.utilities.DynamicScheme, java.lang.Double> r3 = r3.tone
            java.lang.Object r1 = r3.apply(r1)
            java.lang.Double r1 = (java.lang.Double) r1
            r22 = r10
            double r10 = r1.doubleValue()
            double r24 = com.google.android.material.color.utilities.Contrast.ratioOfTones(r8, r10)
            int r1 = (r24 > r13 ? 1 : (r24 == r13 ? 0 : -1))
            if (r1 < 0) goto Lb0
            goto Lb4
        Lb0:
            double r10 = foregroundTone(r8, r13)
        Lb4:
            if (r2 == 0) goto Lc1
            double r10 = foregroundTone(r8, r4)
            double r1 = foregroundTone(r8, r13)
            r22 = r10
            r10 = r1
        Lc1:
            double r1 = r10 - r22
            double r1 = r1 * r20
            int r1 = (r1 > r18 ? 1 : (r1 == r18 ? 0 : -1))
            if (r1 >= 0) goto Le7
            double r1 = r18 * r20
            double r28 = r22 + r1
            r24 = 0
            r26 = 4636737291354636288(0x4059000000000000, double:100.0)
            double r10 = com.google.android.material.color.utilities.MathUtils.clampDouble(r24, r26, r28)
            double r3 = r10 - r22
            double r3 = r3 * r20
            int r3 = (r3 > r18 ? 1 : (r3 == r18 ? 0 : -1))
            if (r3 >= 0) goto Le7
            r26 = 4636737291354636288(0x4059000000000000, double:100.0)
            double r28 = r10 - r1
            r24 = 0
            double r22 = com.google.android.material.color.utilities.MathUtils.clampDouble(r24, r26, r28)
        Le7:
            r1 = 4632233691727265792(0x4049000000000000, double:50.0)
            int r3 = (r1 > r22 ? 1 : (r1 == r22 ? 0 : -1))
            r1 = 4633641066610819072(0x404e000000000000, double:60.0)
            if (r3 > 0) goto L118
            int r3 = (r22 > r1 ? 1 : (r22 == r1 ? 0 : -1))
            if (r3 >= 0) goto L118
            r3 = 0
            int r3 = (r20 > r3 ? 1 : (r20 == r3 ? 0 : -1))
            if (r3 <= 0) goto L105
            double r18 = r18 * r20
            double r3 = r18 + r1
            double r3 = java.lang.Math.max(r10, r3)
            r22 = r1
            r1 = r3
            goto L153
        L105:
            double r18 = r18 * r20
            r1 = 4632092954238910464(0x4048800000000000, double:49.0)
            double r3 = r18 + r1
            double r1 = java.lang.Math.min(r10, r3)
        L112:
            r22 = 4632092954238910464(0x4048800000000000, double:49.0)
            goto L153
        L118:
            r3 = 4632233691727265792(0x4049000000000000, double:50.0)
            int r3 = (r3 > r10 ? 1 : (r3 == r10 ? 0 : -1))
            if (r3 > 0) goto L152
            int r3 = (r10 > r1 ? 1 : (r10 == r1 ? 0 : -1))
            if (r3 >= 0) goto L152
            if (r7 == 0) goto L143
            r3 = 0
            int r3 = (r20 > r3 ? 1 : (r20 == r3 ? 0 : -1))
            if (r3 <= 0) goto L135
            double r18 = r18 * r20
            double r3 = r18 + r1
            double r1 = java.lang.Math.max(r10, r3)
            r22 = 4633641066610819072(0x404e000000000000, double:60.0)
            goto L153
        L135:
            double r18 = r18 * r20
            r1 = 4632092954238910464(0x4048800000000000, double:49.0)
            double r3 = r18 + r1
            double r1 = java.lang.Math.min(r10, r3)
            goto L112
        L143:
            r3 = 0
            int r1 = (r20 > r3 ? 1 : (r20 == r3 ? 0 : -1))
            if (r1 <= 0) goto L14c
            r1 = 4633641066610819072(0x404e000000000000, double:60.0)
            goto L153
        L14c:
            r1 = 4632092954238910464(0x4048800000000000, double:49.0)
            goto L153
        L152:
            r1 = r10
        L153:
            if (r12 == 0) goto L157
            r1 = r22
        L157:
            return r1
        L158:
            r3 = r4
            java.util.function.Function<com.google.android.material.color.utilities.DynamicScheme, java.lang.Double> r5 = r0.tone
            java.lang.Object r5 = r5.apply(r1)
            java.lang.Double r5 = (java.lang.Double) r5
            double r5 = r5.doubleValue()
            java.util.function.Function<com.google.android.material.color.utilities.DynamicScheme, com.google.android.material.color.utilities.DynamicColor> r7 = r0.background
            if (r7 != 0) goto L16a
            return r5
        L16a:
            java.lang.Object r7 = r7.apply(r1)
            com.google.android.material.color.utilities.DynamicColor r7 = (com.google.android.material.color.utilities.DynamicColor) r7
            double r7 = r7.getTone(r1)
            com.google.android.material.color.utilities.ContrastCurve r9 = r0.contrastCurve
            double r10 = r1.contrastLevel
            double r9 = r9.getContrast(r10)
            double r11 = com.google.android.material.color.utilities.Contrast.ratioOfTones(r7, r5)
            int r11 = (r11 > r9 ? 1 : (r11 == r9 ? 0 : -1))
            if (r11 < 0) goto L185
            goto L189
        L185:
            double r5 = foregroundTone(r7, r9)
        L189:
            if (r2 == 0) goto L18f
            double r5 = foregroundTone(r7, r9)
        L18f:
            boolean r2 = r0.isBackground
            if (r2 == 0) goto L1b0
            r11 = 4632233691727265792(0x4049000000000000, double:50.0)
            int r2 = (r11 > r5 ? 1 : (r11 == r5 ? 0 : -1))
            if (r2 > 0) goto L1b0
            r11 = 4633641066610819072(0x404e000000000000, double:60.0)
            int r2 = (r5 > r11 ? 1 : (r5 == r11 ? 0 : -1))
            if (r2 >= 0) goto L1b0
            r13 = 4632092954238910464(0x4048800000000000, double:49.0)
            double r5 = com.google.android.material.color.utilities.Contrast.ratioOfTones(r13, r7)
            int r2 = (r5 > r9 ? 1 : (r5 == r9 ? 0 : -1))
            if (r2 < 0) goto L1ae
            r12 = r13
            goto L1b1
        L1ae:
            r12 = r11
            goto L1b1
        L1b0:
            r12 = r5
        L1b1:
            java.util.function.Function<com.google.android.material.color.utilities.DynamicScheme, com.google.android.material.color.utilities.DynamicColor> r2 = r0.secondBackground
            if (r2 == 0) goto L236
            java.util.function.Function<com.google.android.material.color.utilities.DynamicScheme, com.google.android.material.color.utilities.DynamicColor> r2 = r0.background
            java.lang.Object r2 = r2.apply(r1)
            com.google.android.material.color.utilities.DynamicColor r2 = (com.google.android.material.color.utilities.DynamicColor) r2
            double r5 = r2.getTone(r1)
            java.util.function.Function<com.google.android.material.color.utilities.DynamicScheme, com.google.android.material.color.utilities.DynamicColor> r2 = r0.secondBackground
            java.lang.Object r2 = r2.apply(r1)
            com.google.android.material.color.utilities.DynamicColor r2 = (com.google.android.material.color.utilities.DynamicColor) r2
            double r1 = r2.getTone(r1)
            double r7 = java.lang.Math.max(r5, r1)
            double r14 = java.lang.Math.min(r5, r1)
            double r16 = com.google.android.material.color.utilities.Contrast.ratioOfTones(r7, r12)
            int r11 = (r16 > r9 ? 1 : (r16 == r9 ? 0 : -1))
            if (r11 < 0) goto L1e6
            double r16 = com.google.android.material.color.utilities.Contrast.ratioOfTones(r14, r12)
            int r11 = (r16 > r9 ? 1 : (r16 == r9 ? 0 : -1))
            if (r11 < 0) goto L1e6
            return r12
        L1e6:
            double r7 = com.google.android.material.color.utilities.Contrast.lighter(r7, r9)
            double r9 = com.google.android.material.color.utilities.Contrast.darker(r14, r9)
            java.util.ArrayList r11 = new java.util.ArrayList
            r11.<init>()
            r12 = -4616189618054758400(0xbff0000000000000, double:-1.0)
            int r14 = (r7 > r12 ? 1 : (r7 == r12 ? 0 : -1))
            if (r14 == 0) goto L200
            java.lang.Double r15 = java.lang.Double.valueOf(r7)
            r11.add(r15)
        L200:
            int r12 = (r9 > r12 ? 1 : (r9 == r12 ? 0 : -1))
            if (r12 == 0) goto L20b
            java.lang.Double r13 = java.lang.Double.valueOf(r9)
            r11.add(r13)
        L20b:
            boolean r5 = tonePrefersLightForeground(r5)
            if (r5 != 0) goto L231
            boolean r1 = tonePrefersLightForeground(r1)
            if (r1 == 0) goto L218
            goto L231
        L218:
            int r1 = r11.size()
            r2 = 1
            if (r1 != r2) goto L22b
            r1 = 0
            java.lang.Object r1 = r11.get(r1)
            java.lang.Double r1 = (java.lang.Double) r1
            double r1 = r1.doubleValue()
            return r1
        L22b:
            if (r12 != 0) goto L22f
            r4 = r3
            goto L230
        L22f:
            r4 = r9
        L230:
            return r4
        L231:
            if (r14 != 0) goto L235
            r7 = 4636737291354636288(0x4059000000000000, double:100.0)
        L235:
            return r7
        L236:
            return r12
    }
}
