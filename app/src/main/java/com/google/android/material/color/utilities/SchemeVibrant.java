package com.google.android.material.color.utilities;

/* JADX INFO: loaded from: classes.dex */
public class SchemeVibrant extends com.google.android.material.color.utilities.DynamicScheme {
    private static final double[] HUES = null;
    private static final double[] SECONDARY_ROTATIONS = null;
    private static final double[] TERTIARY_ROTATIONS = null;

    static {
            r0 = 9
            double[] r1 = new double[r0]
            r1 = {x0018: FILL_ARRAY_DATA , data: [0, 4630967054332067840, 4633781804099174400, 4636807660098813952, 4638813169307877376, 4640572387912318976, 4643035293958537216, 4644002864190980096, 4645040803167600640} // fill-array
            com.google.android.material.color.utilities.SchemeVibrant.HUES = r1
            double[] r1 = new double[r0]
            r1 = {x0040: FILL_ARRAY_DATA , data: [4625759767262920704, 4624633867356078080, 4621819117588971520, 4622945017495814144, 4624633867356078080, 4625759767262920704, 4624633867356078080, 4622945017495814144, 4622945017495814144} // fill-array
            com.google.android.material.color.utilities.SchemeVibrant.SECONDARY_ROTATIONS = r1
            double[] r0 = new double[r0]
            r0 = {x0068: FILL_ARRAY_DATA , data: [4630122629401935872, 4629137466983448576, 4626322717216342016, 4627730092099895296, 4629137466983448576, 4630122629401935872, 4629137466983448576, 4627730092099895296, 4627730092099895296} // fill-array
            com.google.android.material.color.utilities.SchemeVibrant.TERTIARY_ROTATIONS = r0
            return
    }

    public SchemeVibrant(com.google.android.material.color.utilities.Hct r12, boolean r13, double r14) {
            r11 = this;
            com.google.android.material.color.utilities.Variant r2 = com.google.android.material.color.utilities.Variant.VIBRANT
            double r0 = r12.getHue()
            r3 = 4641240890982006784(0x4069000000000000, double:200.0)
            com.google.android.material.color.utilities.TonalPalette r6 = com.google.android.material.color.utilities.TonalPalette.fromHueAndChroma(r0, r3)
            double[] r0 = com.google.android.material.color.utilities.SchemeVibrant.HUES
            double[] r1 = com.google.android.material.color.utilities.SchemeVibrant.SECONDARY_ROTATIONS
            double r3 = com.google.android.material.color.utilities.DynamicScheme.getRotatedHue(r12, r0, r1)
            r7 = 4627448617123184640(0x4038000000000000, double:24.0)
            com.google.android.material.color.utilities.TonalPalette r7 = com.google.android.material.color.utilities.TonalPalette.fromHueAndChroma(r3, r7)
            double[] r1 = com.google.android.material.color.utilities.SchemeVibrant.TERTIARY_ROTATIONS
            double r0 = com.google.android.material.color.utilities.DynamicScheme.getRotatedHue(r12, r0, r1)
            r3 = 4629700416936869888(0x4040000000000000, double:32.0)
            com.google.android.material.color.utilities.TonalPalette r8 = com.google.android.material.color.utilities.TonalPalette.fromHueAndChroma(r0, r3)
            double r0 = r12.getHue()
            r3 = 4621819117588971520(0x4024000000000000, double:10.0)
            com.google.android.material.color.utilities.TonalPalette r9 = com.google.android.material.color.utilities.TonalPalette.fromHueAndChroma(r0, r3)
            double r0 = r12.getHue()
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
