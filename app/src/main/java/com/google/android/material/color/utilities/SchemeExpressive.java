package com.google.android.material.color.utilities;

/* JADX INFO: loaded from: classes.dex */
public class SchemeExpressive extends com.google.android.material.color.utilities.DynamicScheme {
    private static final double[] HUES = null;
    private static final double[] SECONDARY_ROTATIONS = null;
    private static final double[] TERTIARY_ROTATIONS = null;

    static {
            r0 = 9
            double[] r1 = new double[r0]
            r1 = {x0018: FILL_ARRAY_DATA , data: [0, 4626604192193052672, 4632374429215621120, 4638215034982367232, 4639516856749654016, 4640924231633207296, 4643475098609647616, 4644354707911868416, 4645040803167600640} // fill-array
            com.google.android.material.color.utilities.SchemeExpressive.HUES = r1
            double[] r1 = new double[r0]
            r1 = {x0040: FILL_ARRAY_DATA , data: [4631530004285489152, 4636385447633747968, 4631530004285489152, 4626322717216342016, 4631530004285489152, 4636033603912859648, 4631530004285489152, 4631530004285489152, 4631530004285489152} // fill-array
            com.google.android.material.color.utilities.SchemeExpressive.SECONDARY_ROTATIONS = r1
            double[] r0 = new double[r0]
            r0 = {x0068: FILL_ARRAY_DATA , data: [4638144666238189568, 4638144666238189568, 4626322717216342016, 4631530004285489152, 4626322717216342016, 4624633867356078080, 4626322717216342016, 4638144666238189568, 4638144666238189568} // fill-array
            com.google.android.material.color.utilities.SchemeExpressive.TERTIARY_ROTATIONS = r0
            return
    }

    public SchemeExpressive(com.google.android.material.color.utilities.Hct r12, boolean r13, double r14) {
            r11 = this;
            com.google.android.material.color.utilities.Variant r2 = com.google.android.material.color.utilities.Variant.EXPRESSIVE
            double r0 = r12.getHue()
            r3 = 4642648265865560064(0x406e000000000000, double:240.0)
            double r0 = r0 + r3
            double r0 = com.google.android.material.color.utilities.MathUtils.sanitizeDegreesDouble(r0)
            r3 = 4630826316843712512(0x4044000000000000, double:40.0)
            com.google.android.material.color.utilities.TonalPalette r6 = com.google.android.material.color.utilities.TonalPalette.fromHueAndChroma(r0, r3)
            double[] r0 = com.google.android.material.color.utilities.SchemeExpressive.HUES
            double[] r1 = com.google.android.material.color.utilities.SchemeExpressive.SECONDARY_ROTATIONS
            double r3 = com.google.android.material.color.utilities.DynamicScheme.getRotatedHue(r12, r0, r1)
            r7 = 4627448617123184640(0x4038000000000000, double:24.0)
            com.google.android.material.color.utilities.TonalPalette r7 = com.google.android.material.color.utilities.TonalPalette.fromHueAndChroma(r3, r7)
            double[] r1 = com.google.android.material.color.utilities.SchemeExpressive.TERTIARY_ROTATIONS
            double r0 = com.google.android.material.color.utilities.DynamicScheme.getRotatedHue(r12, r0, r1)
            r3 = 4629700416936869888(0x4040000000000000, double:32.0)
            com.google.android.material.color.utilities.TonalPalette r8 = com.google.android.material.color.utilities.TonalPalette.fromHueAndChroma(r0, r3)
            double r0 = r12.getHue()
            r3 = 4624633867356078080(0x402e000000000000, double:15.0)
            double r0 = r0 + r3
            double r0 = com.google.android.material.color.utilities.MathUtils.sanitizeDegreesDouble(r0)
            r9 = 4620693217682128896(0x4020000000000000, double:8.0)
            com.google.android.material.color.utilities.TonalPalette r9 = com.google.android.material.color.utilities.TonalPalette.fromHueAndChroma(r0, r9)
            double r0 = r12.getHue()
            double r0 = r0 + r3
            double r0 = com.google.android.material.color.utilities.MathUtils.sanitizeDegreesDouble(r0)
            r3 = 4622945017495814144(0x4028000000000000, double:12.0)
            com.google.android.material.color.utilities.TonalPalette r10 = com.google.android.material.color.utilities.TonalPalette.fromHueAndChroma(r0, r3)
            r0 = r11
            r1 = r12
            r3 = r13
            r4 = r14
            r0.<init>(r1, r2, r3, r4, r6, r7, r8, r9, r10)
            return
    }
}
