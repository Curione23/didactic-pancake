package com.google.android.material.color.utilities;

/* JADX INFO: loaded from: classes.dex */
public final class TonalPalette {
    java.util.Map<java.lang.Integer, java.lang.Integer> cache;
    double chroma;
    double hue;
    com.google.android.material.color.utilities.Hct keyColor;

    private TonalPalette(double r2, double r4, com.google.android.material.color.utilities.Hct r6) {
            r1 = this;
            r1.<init>()
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1.cache = r0
            r1.hue = r2
            r1.chroma = r4
            r1.keyColor = r6
            return
    }

    private static com.google.android.material.color.utilities.Hct createKeyColor(double r15, double r17) {
            r6 = 4632233691727265792(0x4049000000000000, double:50.0)
            r0 = r15
            r2 = r17
            r4 = r6
            com.google.android.material.color.utilities.Hct r0 = com.google.android.material.color.utilities.Hct.from(r0, r2, r4)
            double r1 = r0.getChroma()
            double r1 = r1 - r17
            double r1 = java.lang.Math.abs(r1)
            r8 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            r10 = r0
            r11 = r1
            r13 = r8
        L19:
            r0 = 4632233691727265792(0x4049000000000000, double:50.0)
            int r0 = (r13 > r0 ? 1 : (r13 == r0 ? 0 : -1))
            if (r0 >= 0) goto L64
            long r0 = java.lang.Math.round(r17)
            double r2 = r10.getChroma()
            long r2 = java.lang.Math.round(r2)
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 != 0) goto L30
            return r10
        L30:
            double r4 = r6 + r13
            r0 = r15
            r2 = r17
            com.google.android.material.color.utilities.Hct r0 = com.google.android.material.color.utilities.Hct.from(r0, r2, r4)
            double r1 = r0.getChroma()
            double r1 = r1 - r17
            double r1 = java.lang.Math.abs(r1)
            int r3 = (r1 > r11 ? 1 : (r1 == r11 ? 0 : -1))
            if (r3 >= 0) goto L49
            r10 = r0
            r11 = r1
        L49:
            double r4 = r6 - r13
            r0 = r15
            r2 = r17
            com.google.android.material.color.utilities.Hct r0 = com.google.android.material.color.utilities.Hct.from(r0, r2, r4)
            double r1 = r0.getChroma()
            double r1 = r1 - r17
            double r1 = java.lang.Math.abs(r1)
            int r3 = (r1 > r11 ? 1 : (r1 == r11 ? 0 : -1))
            if (r3 >= 0) goto L62
            r10 = r0
            r11 = r1
        L62:
            double r13 = r13 + r8
            goto L19
        L64:
            return r10
    }

    public static com.google.android.material.color.utilities.TonalPalette fromHct(com.google.android.material.color.utilities.Hct r7) {
            com.google.android.material.color.utilities.TonalPalette r6 = new com.google.android.material.color.utilities.TonalPalette
            double r1 = r7.getHue()
            double r3 = r7.getChroma()
            r0 = r6
            r5 = r7
            r0.<init>(r1, r3, r5)
            return r6
    }

    public static com.google.android.material.color.utilities.TonalPalette fromHueAndChroma(double r7, double r9) {
            com.google.android.material.color.utilities.TonalPalette r6 = new com.google.android.material.color.utilities.TonalPalette
            com.google.android.material.color.utilities.Hct r5 = createKeyColor(r7, r9)
            r0 = r6
            r1 = r7
            r3 = r9
            r0.<init>(r1, r3, r5)
            return r6
    }

    public static com.google.android.material.color.utilities.TonalPalette fromInt(int r0) {
            com.google.android.material.color.utilities.Hct r0 = com.google.android.material.color.utilities.Hct.fromInt(r0)
            com.google.android.material.color.utilities.TonalPalette r0 = fromHct(r0)
            return r0
    }

    public double getChroma() {
            r2 = this;
            double r0 = r2.chroma
            return r0
    }

    public com.google.android.material.color.utilities.Hct getHct(double r7) {
            r6 = this;
            double r0 = r6.hue
            double r2 = r6.chroma
            r4 = r7
            com.google.android.material.color.utilities.Hct r7 = com.google.android.material.color.utilities.Hct.from(r0, r2, r4)
            return r7
    }

    public double getHue() {
            r2 = this;
            double r0 = r2.hue
            return r0
    }

    public com.google.android.material.color.utilities.Hct getKeyColor() {
            r1 = this;
            com.google.android.material.color.utilities.Hct r0 = r1.keyColor
            return r0
    }

    public int tone(int r8) {
            r7 = this;
            java.util.Map<java.lang.Integer, java.lang.Integer> r0 = r7.cache
            java.lang.Integer r1 = java.lang.Integer.valueOf(r8)
            java.lang.Object r0 = r0.get(r1)
            java.lang.Integer r0 = (java.lang.Integer) r0
            if (r0 != 0) goto L28
            double r1 = r7.hue
            double r3 = r7.chroma
            double r5 = (double) r8
            com.google.android.material.color.utilities.Hct r0 = com.google.android.material.color.utilities.Hct.from(r1, r3, r5)
            int r0 = r0.toInt()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.util.Map<java.lang.Integer, java.lang.Integer> r1 = r7.cache
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            r1.put(r8, r0)
        L28:
            int r8 = r0.intValue()
            return r8
    }
}
