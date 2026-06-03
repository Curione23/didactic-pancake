package com.google.android.material.color.utilities;

/* JADX INFO: loaded from: classes.dex */
public class SchemeTonalSpot extends com.google.android.material.color.utilities.DynamicScheme {
    public SchemeTonalSpot(com.google.android.material.color.utilities.Hct r12, boolean r13, double r14) {
            r11 = this;
            com.google.android.material.color.utilities.Variant r2 = com.google.android.material.color.utilities.Variant.TONAL_SPOT
            double r0 = r12.getHue()
            r3 = 4630263366890291200(0x4042000000000000, double:36.0)
            com.google.android.material.color.utilities.TonalPalette r6 = com.google.android.material.color.utilities.TonalPalette.fromHueAndChroma(r0, r3)
            double r0 = r12.getHue()
            r3 = 4625196817309499392(0x4030000000000000, double:16.0)
            com.google.android.material.color.utilities.TonalPalette r7 = com.google.android.material.color.utilities.TonalPalette.fromHueAndChroma(r0, r3)
            double r0 = r12.getHue()
            r3 = 4633641066610819072(0x404e000000000000, double:60.0)
            double r0 = r0 + r3
            double r0 = com.google.android.material.color.utilities.MathUtils.sanitizeDegreesDouble(r0)
            r3 = 4627448617123184640(0x4038000000000000, double:24.0)
            com.google.android.material.color.utilities.TonalPalette r8 = com.google.android.material.color.utilities.TonalPalette.fromHueAndChroma(r0, r3)
            double r0 = r12.getHue()
            r3 = 4618441417868443648(0x4018000000000000, double:6.0)
            com.google.android.material.color.utilities.TonalPalette r9 = com.google.android.material.color.utilities.TonalPalette.fromHueAndChroma(r0, r3)
            double r0 = r12.getHue()
            r3 = 4620693217682128896(0x4020000000000000, double:8.0)
            com.google.android.material.color.utilities.TonalPalette r10 = com.google.android.material.color.utilities.TonalPalette.fromHueAndChroma(r0, r3)
            r0 = r11
            r1 = r12
            r3 = r13
            r4 = r14
            r0.<init>(r1, r2, r3, r4, r6, r7, r8, r9, r10)
            return
    }
}
