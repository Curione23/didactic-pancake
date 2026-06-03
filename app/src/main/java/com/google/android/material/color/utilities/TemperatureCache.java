package com.google.android.material.color.utilities;

/* JADX INFO: loaded from: classes.dex */
public final class TemperatureCache {
    private final com.google.android.material.color.utilities.Hct input;
    private com.google.android.material.color.utilities.Hct precomputedComplement;
    private java.util.List<com.google.android.material.color.utilities.Hct> precomputedHctsByHue;
    private java.util.List<com.google.android.material.color.utilities.Hct> precomputedHctsByTemp;
    private java.util.Map<com.google.android.material.color.utilities.Hct, java.lang.Double> precomputedTempsByHct;

    /* JADX INFO: renamed from: $r8$lambda$hQjdIIwNZ3zUpaMt273Bn5gwl-w, reason: not valid java name */
    public static /* synthetic */ int m655$r8$lambda$hQjdIIwNZ3zUpaMt273Bn5gwlw(java.lang.Double r0, java.lang.Double r1) {
            int r0 = r0.compareTo(r1)
            return r0
    }

    private TemperatureCache() {
            r1 = this;
            r1.<init>()
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r0.<init>()
            throw r0
    }

    public TemperatureCache(com.google.android.material.color.utilities.Hct r1) {
            r0 = this;
            r0.<init>()
            r0.input = r1
            return
    }

    private com.google.android.material.color.utilities.Hct getColdest() {
            r2 = this;
            java.util.List r0 = r2.getHctsByTemp()
            r1 = 0
            java.lang.Object r0 = r0.get(r1)
            com.google.android.material.color.utilities.Hct r0 = (com.google.android.material.color.utilities.Hct) r0
            return r0
    }

    private java.util.List<com.google.android.material.color.utilities.Hct> getHctsByHue() {
            r9 = this;
            java.util.List<com.google.android.material.color.utilities.Hct> r0 = r9.precomputedHctsByHue
            if (r0 == 0) goto L5
            return r0
        L5:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1 = 0
        Lc:
            r3 = 4645040803167600640(0x4076800000000000, double:360.0)
            int r3 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r3 > 0) goto L2d
            com.google.android.material.color.utilities.Hct r3 = r9.input
            double r5 = r3.getChroma()
            com.google.android.material.color.utilities.Hct r3 = r9.input
            double r7 = r3.getTone()
            r3 = r1
            com.google.android.material.color.utilities.Hct r3 = com.google.android.material.color.utilities.Hct.from(r3, r5, r7)
            r0.add(r3)
            r3 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            double r1 = r1 + r3
            goto Lc
        L2d:
            java.util.List r0 = java.util.Collections.unmodifiableList(r0)
            r9.precomputedHctsByHue = r0
            return r0
    }

    private java.util.List<com.google.android.material.color.utilities.Hct> getHctsByTemp() {
            r3 = this;
            java.util.List<com.google.android.material.color.utilities.Hct> r0 = r3.precomputedHctsByTemp
            if (r0 == 0) goto L5
            return r0
        L5:
            java.util.ArrayList r0 = new java.util.ArrayList
            java.util.List r1 = r3.getHctsByHue()
            r0.<init>(r1)
            com.google.android.material.color.utilities.Hct r1 = r3.input
            r0.add(r1)
            com.google.android.material.color.utilities.TemperatureCache$$ExternalSyntheticLambda0 r1 = new com.google.android.material.color.utilities.TemperatureCache$$ExternalSyntheticLambda0
            r1.<init>(r3)
            com.google.android.material.color.utilities.TemperatureCache$$ExternalSyntheticLambda1 r2 = new com.google.android.material.color.utilities.TemperatureCache$$ExternalSyntheticLambda1
            r2.<init>()
            java.util.Comparator r1 = java.util.Comparator.comparing(r1, r2)
            java.util.Collections.sort(r0, r1)
            r3.precomputedHctsByTemp = r0
            return r0
    }

    private java.util.Map<com.google.android.material.color.utilities.Hct, java.lang.Double> getTempsByHct() {
            r5 = this;
            java.util.Map<com.google.android.material.color.utilities.Hct, java.lang.Double> r0 = r5.precomputedTempsByHct
            if (r0 == 0) goto L5
            return r0
        L5:
            java.util.ArrayList r0 = new java.util.ArrayList
            java.util.List r1 = r5.getHctsByHue()
            r0.<init>(r1)
            com.google.android.material.color.utilities.Hct r1 = r5.input
            r0.add(r1)
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            java.util.Iterator r0 = r0.iterator()
        L1c:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L34
            java.lang.Object r2 = r0.next()
            com.google.android.material.color.utilities.Hct r2 = (com.google.android.material.color.utilities.Hct) r2
            double r3 = rawTemperature(r2)
            java.lang.Double r3 = java.lang.Double.valueOf(r3)
            r1.put(r2, r3)
            goto L1c
        L34:
            r5.precomputedTempsByHct = r1
            return r1
    }

    private com.google.android.material.color.utilities.Hct getWarmest() {
            r2 = this;
            java.util.List r0 = r2.getHctsByTemp()
            java.util.List r1 = r2.getHctsByTemp()
            int r1 = r1.size()
            int r1 = r1 + (-1)
            java.lang.Object r0 = r0.get(r1)
            com.google.android.material.color.utilities.Hct r0 = (com.google.android.material.color.utilities.Hct) r0
            return r0
    }

    private static boolean isBetween(double r3, double r5, double r7) {
            int r0 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            r1 = 0
            r2 = 1
            if (r0 >= 0) goto L10
            int r5 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r5 > 0) goto Lf
            int r3 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r3 > 0) goto Lf
            r1 = r2
        Lf:
            return r1
        L10:
            int r5 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r5 <= 0) goto L18
            int r3 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r3 > 0) goto L19
        L18:
            r1 = r2
        L19:
            return r1
    }

    public static double rawTemperature(com.google.android.material.color.utilities.Hct r7) {
            int r7 = r7.toInt()
            double[] r7 = com.google.android.material.color.utilities.ColorUtils.labFromArgb(r7)
            r0 = 2
            r1 = r7[r0]
            r3 = 1
            r4 = r7[r3]
            double r1 = java.lang.Math.atan2(r1, r4)
            double r1 = java.lang.Math.toDegrees(r1)
            double r1 = com.google.android.material.color.utilities.MathUtils.sanitizeDegreesDouble(r1)
            r3 = r7[r3]
            r5 = r7[r0]
            double r3 = java.lang.Math.hypot(r3, r5)
            r5 = 4607497670773933343(0x3ff11eb851eb851f, double:1.07)
            double r3 = java.lang.Math.pow(r3, r5)
            r5 = 4581421828931458171(0x3f947ae147ae147b, double:0.02)
            double r3 = r3 * r5
            r5 = 4632233691727265792(0x4049000000000000, double:50.0)
            double r1 = r1 - r5
            double r0 = com.google.android.material.color.utilities.MathUtils.sanitizeDegreesDouble(r1)
            double r0 = java.lang.Math.toRadians(r0)
            double r0 = java.lang.Math.cos(r0)
            double r3 = r3 * r0
            r0 = -4620693217682128896(0xbfe0000000000000, double:-0.5)
            double r3 = r3 + r0
            return r3
    }

    public java.util.List<com.google.android.material.color.utilities.Hct> getAnalogousColors() {
            r2 = this;
            r0 = 5
            r1 = 12
            java.util.List r0 = r2.getAnalogousColors(r0, r1)
            return r0
    }

    public java.util.List<com.google.android.material.color.utilities.Hct> getAnalogousColors(int r19, int r20) {
            r18 = this;
            r0 = r18
            r1 = r19
            r2 = r20
            com.google.android.material.color.utilities.Hct r3 = r0.input
            double r3 = r3.getHue()
            long r3 = java.lang.Math.round(r3)
            int r3 = (int) r3
            java.util.List r4 = r18.getHctsByHue()
            java.lang.Object r4 = r4.get(r3)
            com.google.android.material.color.utilities.Hct r4 = (com.google.android.material.color.utilities.Hct) r4
            double r5 = r0.getRelativeTemperature(r4)
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            r7.add(r4)
            r8 = 0
            r10 = 0
            r12 = r8
            r11 = r10
        L2c:
            r14 = 360(0x168, float:5.04E-43)
            if (r11 >= r14) goto L4f
            int r14 = r3 + r11
            int r14 = com.google.android.material.color.utilities.MathUtils.sanitizeDegreesInt(r14)
            java.util.List r15 = r18.getHctsByHue()
            java.lang.Object r14 = r15.get(r14)
            com.google.android.material.color.utilities.Hct r14 = (com.google.android.material.color.utilities.Hct) r14
            double r14 = r0.getRelativeTemperature(r14)
            double r5 = r14 - r5
            double r5 = java.lang.Math.abs(r5)
            double r12 = r12 + r5
            int r11 = r11 + 1
            r5 = r14
            goto L2c
        L4f:
            double r5 = (double) r2
            double r12 = r12 / r5
            double r4 = r0.getRelativeTemperature(r4)
            r11 = 1
        L56:
            int r15 = r7.size()
            if (r15 >= r2) goto Lb7
            int r15 = r3 + r11
            int r15 = com.google.android.material.color.utilities.MathUtils.sanitizeDegreesInt(r15)
            java.util.List r6 = r18.getHctsByHue()
            java.lang.Object r6 = r6.get(r15)
            com.google.android.material.color.utilities.Hct r6 = (com.google.android.material.color.utilities.Hct) r6
            double r16 = r0.getRelativeTemperature(r6)
            double r4 = r16 - r4
            double r4 = java.lang.Math.abs(r4)
            double r8 = r8 + r4
            int r4 = r7.size()
            double r4 = (double) r4
            double r4 = r4 * r12
            int r4 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
            if (r4 < 0) goto L83
            r4 = 1
            goto L84
        L83:
            r4 = r10
        L84:
            r5 = 1
        L85:
            if (r4 == 0) goto La3
            int r4 = r7.size()
            if (r4 >= r2) goto La3
            r7.add(r6)
            int r4 = r7.size()
            int r4 = r4 + r5
            double r14 = (double) r4
            double r14 = r14 * r12
            int r4 = (r8 > r14 ? 1 : (r8 == r14 ? 0 : -1))
            if (r4 < 0) goto L9d
            r4 = 1
            goto L9e
        L9d:
            r4 = r10
        L9e:
            int r5 = r5 + 1
            r14 = 360(0x168, float:5.04E-43)
            goto L85
        La3:
            int r11 = r11 + 1
            r4 = 360(0x168, float:5.04E-43)
            if (r11 <= r4) goto Lb3
        La9:
            int r3 = r7.size()
            if (r3 >= r2) goto Lb7
            r7.add(r6)
            goto La9
        Lb3:
            r14 = r4
            r4 = r16
            goto L56
        Lb7:
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            com.google.android.material.color.utilities.Hct r3 = r0.input
            r2.add(r3)
            double r3 = (double) r1
            r5 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            double r3 = r3 - r5
            r5 = 4611686018427387904(0x4000000000000000, double:2.0)
            double r3 = r3 / r5
            double r3 = java.lang.Math.floor(r3)
            int r3 = (int) r3
            r4 = 1
        Lce:
            int r5 = r3 + 1
            if (r4 >= r5) goto Lf3
            int r5 = 0 - r4
        Ld4:
            if (r5 >= 0) goto Ldc
            int r6 = r7.size()
            int r5 = r5 + r6
            goto Ld4
        Ldc:
            int r6 = r7.size()
            if (r5 < r6) goto Le7
            int r6 = r7.size()
            int r5 = r5 % r6
        Le7:
            java.lang.Object r5 = r7.get(r5)
            com.google.android.material.color.utilities.Hct r5 = (com.google.android.material.color.utilities.Hct) r5
            r2.add(r10, r5)
            int r4 = r4 + 1
            goto Lce
        Lf3:
            int r1 = r1 - r3
            r6 = 1
        Lf5:
            if (r6 >= r1) goto L117
            r3 = r6
        Lf8:
            if (r3 >= 0) goto L100
            int r4 = r7.size()
            int r3 = r3 + r4
            goto Lf8
        L100:
            int r4 = r7.size()
            if (r3 < r4) goto L10b
            int r4 = r7.size()
            int r3 = r3 % r4
        L10b:
            java.lang.Object r3 = r7.get(r3)
            com.google.android.material.color.utilities.Hct r3 = (com.google.android.material.color.utilities.Hct) r3
            r2.add(r3)
            int r6 = r6 + 1
            goto Lf5
        L117:
            return r2
    }

    public com.google.android.material.color.utilities.Hct getComplement() {
            r26 = this;
            r0 = r26
            com.google.android.material.color.utilities.Hct r1 = r0.precomputedComplement
            if (r1 == 0) goto L7
            return r1
        L7:
            com.google.android.material.color.utilities.Hct r1 = r26.getColdest()
            double r8 = r1.getHue()
            java.util.Map r1 = r26.getTempsByHct()
            com.google.android.material.color.utilities.Hct r2 = r26.getColdest()
            java.lang.Object r1 = r1.get(r2)
            java.lang.Double r1 = (java.lang.Double) r1
            double r10 = r1.doubleValue()
            com.google.android.material.color.utilities.Hct r1 = r26.getWarmest()
            double r12 = r1.getHue()
            java.util.Map r1 = r26.getTempsByHct()
            com.google.android.material.color.utilities.Hct r2 = r26.getWarmest()
            java.lang.Object r1 = r1.get(r2)
            java.lang.Double r1 = (java.lang.Double) r1
            double r1 = r1.doubleValue()
            double r14 = r1 - r10
            com.google.android.material.color.utilities.Hct r1 = r0.input
            double r2 = r1.getHue()
            r4 = r8
            r6 = r12
            boolean r1 = isBetween(r2, r4, r6)
            if (r1 == 0) goto L4e
            r16 = r12
            goto L50
        L4e:
            r16 = r8
        L50:
            if (r1 == 0) goto L53
            goto L54
        L53:
            r8 = r12
        L54:
            java.util.List r1 = r26.getHctsByHue()
            com.google.android.material.color.utilities.Hct r2 = r0.input
            double r2 = r2.getHue()
            long r2 = java.lang.Math.round(r2)
            int r2 = (int) r2
            java.lang.Object r1 = r1.get(r2)
            com.google.android.material.color.utilities.Hct r1 = (com.google.android.material.color.utilities.Hct) r1
            com.google.android.material.color.utilities.Hct r2 = r0.input
            double r2 = r0.getRelativeTemperature(r2)
            r12 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            double r18 = r12 - r2
            r2 = 4652007308841189376(0x408f400000000000, double:1000.0)
            r4 = 0
            r20 = r2
            r22 = r4
        L7e:
            r2 = 4645040803167600640(0x4076800000000000, double:360.0)
            int r2 = (r22 > r2 ? 1 : (r22 == r2 ? 0 : -1))
            if (r2 > 0) goto Lca
            double r2 = r12 * r22
            double r2 = r16 + r2
            double r24 = com.google.android.material.color.utilities.MathUtils.sanitizeDegreesDouble(r2)
            r2 = r24
            r4 = r16
            r6 = r8
            boolean r2 = isBetween(r2, r4, r6)
            if (r2 != 0) goto L9b
            goto Lc7
        L9b:
            java.util.List r2 = r26.getHctsByHue()
            long r3 = java.lang.Math.round(r24)
            int r3 = (int) r3
            java.lang.Object r2 = r2.get(r3)
            com.google.android.material.color.utilities.Hct r2 = (com.google.android.material.color.utilities.Hct) r2
            java.util.Map r3 = r26.getTempsByHct()
            java.lang.Object r3 = r3.get(r2)
            java.lang.Double r3 = (java.lang.Double) r3
            double r3 = r3.doubleValue()
            double r3 = r3 - r10
            double r3 = r3 / r14
            double r3 = r18 - r3
            double r3 = java.lang.Math.abs(r3)
            int r5 = (r3 > r20 ? 1 : (r3 == r20 ? 0 : -1))
            if (r5 >= 0) goto Lc7
            r1 = r2
            r20 = r3
        Lc7:
            double r22 = r22 + r12
            goto L7e
        Lca:
            r0.precomputedComplement = r1
            return r1
    }

    public double getRelativeTemperature(com.google.android.material.color.utilities.Hct r7) {
            r6 = this;
            java.util.Map r0 = r6.getTempsByHct()
            com.google.android.material.color.utilities.Hct r1 = r6.getWarmest()
            java.lang.Object r0 = r0.get(r1)
            java.lang.Double r0 = (java.lang.Double) r0
            double r0 = r0.doubleValue()
            java.util.Map r2 = r6.getTempsByHct()
            com.google.android.material.color.utilities.Hct r3 = r6.getColdest()
            java.lang.Object r2 = r2.get(r3)
            java.lang.Double r2 = (java.lang.Double) r2
            double r2 = r2.doubleValue()
            double r0 = r0 - r2
            java.util.Map r2 = r6.getTempsByHct()
            java.lang.Object r7 = r2.get(r7)
            java.lang.Double r7 = (java.lang.Double) r7
            double r2 = r7.doubleValue()
            java.util.Map r7 = r6.getTempsByHct()
            com.google.android.material.color.utilities.Hct r4 = r6.getColdest()
            java.lang.Object r7 = r7.get(r4)
            java.lang.Double r7 = (java.lang.Double) r7
            double r4 = r7.doubleValue()
            double r2 = r2 - r4
            r4 = 0
            int r7 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r7 != 0) goto L4f
            r0 = 4602678819172646912(0x3fe0000000000000, double:0.5)
            return r0
        L4f:
            double r2 = r2 / r0
            return r2
    }

    /* JADX INFO: renamed from: lambda$getHctsByTemp$0$com-google-android-material-color-utilities-TemperatureCache, reason: not valid java name */
    /* synthetic */ java.lang.Double m656xb7a75f35(com.google.android.material.color.utilities.Hct r2) {
            r1 = this;
            java.util.Map r0 = r1.getTempsByHct()
            java.lang.Object r2 = r0.get(r2)
            java.lang.Double r2 = (java.lang.Double) r2
            return r2
    }
}
