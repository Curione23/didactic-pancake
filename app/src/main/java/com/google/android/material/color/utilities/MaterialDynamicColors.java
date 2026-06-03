package com.google.android.material.color.utilities;

/* JADX INFO: loaded from: classes.dex */
public final class MaterialDynamicColors {
    public MaterialDynamicColors() {
            r0 = this;
            r0.<init>()
            return
    }

    static double findDesiredChromaByTone(double r11, double r13, double r15, boolean r17) {
            com.google.android.material.color.utilities.Hct r0 = com.google.android.material.color.utilities.Hct.from(r11, r13, r15)
            double r1 = r0.getChroma()
            int r1 = (r1 > r13 ? 1 : (r1 == r13 ? 0 : -1))
            if (r1 >= 0) goto L6a
            double r1 = r0.getChroma()
            r6 = r0
            r7 = r1
            r0 = r15
        L13:
            double r2 = r6.getChroma()
            int r2 = (r2 > r13 ? 1 : (r2 == r13 ? 0 : -1))
            if (r2 >= 0) goto L68
            if (r17 == 0) goto L20
            r2 = -4616189618054758400(0xbff0000000000000, double:-1.0)
            goto L22
        L20:
            r2 = 4607182418800017408(0x3ff0000000000000, double:1.0)
        L22:
            double r9 = r0 + r2
            r0 = r11
            r2 = r13
            r4 = r9
            com.google.android.material.color.utilities.Hct r0 = com.google.android.material.color.utilities.Hct.from(r0, r2, r4)
            double r1 = r0.getChroma()
            int r1 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r1 <= 0) goto L34
            goto L6b
        L34:
            double r1 = r0.getChroma()
            double r1 = r1 - r13
            double r1 = java.lang.Math.abs(r1)
            r3 = 4600877379321698714(0x3fd999999999999a, double:0.4)
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 >= 0) goto L47
            goto L6b
        L47:
            double r1 = r0.getChroma()
            double r1 = r1 - r13
            double r1 = java.lang.Math.abs(r1)
            double r3 = r6.getChroma()
            double r3 = r3 - r13
            double r3 = java.lang.Math.abs(r3)
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 >= 0) goto L5e
            r6 = r0
        L5e:
            double r0 = r0.getChroma()
            double r7 = java.lang.Math.max(r7, r0)
            r0 = r9
            goto L13
        L68:
            r9 = r0
            goto L6b
        L6a:
            r9 = r15
        L6b:
            return r9
    }

    private static boolean isFidelity(com.google.android.material.color.utilities.DynamicScheme r2) {
            com.google.android.material.color.utilities.Variant r0 = r2.variant
            com.google.android.material.color.utilities.Variant r1 = com.google.android.material.color.utilities.Variant.FIDELITY
            if (r0 == r1) goto Lf
            com.google.android.material.color.utilities.Variant r2 = r2.variant
            com.google.android.material.color.utilities.Variant r0 = com.google.android.material.color.utilities.Variant.CONTENT
            if (r2 != r0) goto Ld
            goto Lf
        Ld:
            r2 = 0
            goto L10
        Lf:
            r2 = 1
        L10:
            return r2
    }

    private static boolean isMonochrome(com.google.android.material.color.utilities.DynamicScheme r1) {
            com.google.android.material.color.utilities.Variant r1 = r1.variant
            com.google.android.material.color.utilities.Variant r0 = com.google.android.material.color.utilities.Variant.MONOCHROME
            if (r1 != r0) goto L8
            r1 = 1
            goto L9
        L8:
            r1 = 0
        L9:
            return r1
    }

    static /* synthetic */ com.google.android.material.color.utilities.TonalPalette lambda$background$10(com.google.android.material.color.utilities.DynamicScheme r0) {
            com.google.android.material.color.utilities.TonalPalette r0 = r0.neutralPalette
            return r0
    }

    static /* synthetic */ java.lang.Double lambda$background$11(com.google.android.material.color.utilities.DynamicScheme r2) {
            boolean r2 = r2.isDark
            if (r2 == 0) goto L7
            r0 = 4618441417868443648(0x4018000000000000, double:6.0)
            goto Lc
        L7:
            r0 = 4636596553866280960(0x4058800000000000, double:98.0)
        Lc:
            java.lang.Double r2 = java.lang.Double.valueOf(r0)
            return r2
    }

    static /* synthetic */ com.google.android.material.color.utilities.TonalPalette lambda$controlActivated$145(com.google.android.material.color.utilities.DynamicScheme r0) {
            com.google.android.material.color.utilities.TonalPalette r0 = r0.primaryPalette
            return r0
    }

    static /* synthetic */ java.lang.Double lambda$controlActivated$146(com.google.android.material.color.utilities.DynamicScheme r2) {
            boolean r2 = r2.isDark
            if (r2 == 0) goto L7
            r0 = 4629137466983448576(0x403e000000000000, double:30.0)
            goto Lc
        L7:
            r0 = 4636033603912859648(0x4056800000000000, double:90.0)
        Lc:
            java.lang.Double r2 = java.lang.Double.valueOf(r0)
            return r2
    }

    static /* synthetic */ com.google.android.material.color.utilities.TonalPalette lambda$controlHighlight$149(com.google.android.material.color.utilities.DynamicScheme r0) {
            com.google.android.material.color.utilities.TonalPalette r0 = r0.neutralPalette
            return r0
    }

    static /* synthetic */ java.lang.Double lambda$controlHighlight$150(com.google.android.material.color.utilities.DynamicScheme r2) {
            boolean r2 = r2.isDark
            if (r2 == 0) goto L7
            r0 = 4636737291354636288(0x4059000000000000, double:100.0)
            goto L9
        L7:
            r0 = 0
        L9:
            java.lang.Double r2 = java.lang.Double.valueOf(r0)
            return r2
    }

    static /* synthetic */ java.lang.Double lambda$controlHighlight$151(com.google.android.material.color.utilities.DynamicScheme r2) {
            boolean r2 = r2.isDark
            if (r2 == 0) goto La
            r0 = 4596373779694328218(0x3fc999999999999a, double:0.2)
            goto Lf
        La:
            r0 = 4593311331947716280(0x3fbeb851eb851eb8, double:0.12)
        Lf:
            java.lang.Double r2 = java.lang.Double.valueOf(r0)
            return r2
    }

    static /* synthetic */ com.google.android.material.color.utilities.TonalPalette lambda$controlNormal$147(com.google.android.material.color.utilities.DynamicScheme r0) {
            com.google.android.material.color.utilities.TonalPalette r0 = r0.neutralVariantPalette
            return r0
    }

    static /* synthetic */ java.lang.Double lambda$controlNormal$148(com.google.android.material.color.utilities.DynamicScheme r2) {
            boolean r2 = r2.isDark
            if (r2 == 0) goto L7
            r0 = 4635329916471083008(0x4054000000000000, double:80.0)
            goto L9
        L7:
            r0 = 4629137466983448576(0x403e000000000000, double:30.0)
        L9:
            java.lang.Double r2 = java.lang.Double.valueOf(r0)
            return r2
    }

    static /* synthetic */ com.google.android.material.color.utilities.TonalPalette lambda$error$91(com.google.android.material.color.utilities.DynamicScheme r0) {
            com.google.android.material.color.utilities.TonalPalette r0 = r0.errorPalette
            return r0
    }

    static /* synthetic */ java.lang.Double lambda$error$92(com.google.android.material.color.utilities.DynamicScheme r2) {
            boolean r2 = r2.isDark
            if (r2 == 0) goto L7
            r0 = 4635329916471083008(0x4054000000000000, double:80.0)
            goto L9
        L7:
            r0 = 4630826316843712512(0x4044000000000000, double:40.0)
        L9:
            java.lang.Double r2 = java.lang.Double.valueOf(r0)
            return r2
    }

    static /* synthetic */ com.google.android.material.color.utilities.TonalPalette lambda$errorContainer$97(com.google.android.material.color.utilities.DynamicScheme r0) {
            com.google.android.material.color.utilities.TonalPalette r0 = r0.errorPalette
            return r0
    }

    static /* synthetic */ java.lang.Double lambda$errorContainer$98(com.google.android.material.color.utilities.DynamicScheme r2) {
            boolean r2 = r2.isDark
            if (r2 == 0) goto L7
            r0 = 4629137466983448576(0x403e000000000000, double:30.0)
            goto Lc
        L7:
            r0 = 4636033603912859648(0x4056800000000000, double:90.0)
        Lc:
            java.lang.Double r2 = java.lang.Double.valueOf(r0)
            return r2
    }

    static /* synthetic */ com.google.android.material.color.utilities.TonalPalette lambda$inverseOnSurface$39(com.google.android.material.color.utilities.DynamicScheme r0) {
            com.google.android.material.color.utilities.TonalPalette r0 = r0.neutralPalette
            return r0
    }

    static /* synthetic */ java.lang.Double lambda$inverseOnSurface$40(com.google.android.material.color.utilities.DynamicScheme r2) {
            boolean r2 = r2.isDark
            if (r2 == 0) goto L7
            r0 = 4626322717216342016(0x4034000000000000, double:20.0)
            goto Lc
        L7:
            r0 = 4636385447633747968(0x4057c00000000000, double:95.0)
        Lc:
            java.lang.Double r2 = java.lang.Double.valueOf(r0)
            return r2
    }

    static /* synthetic */ com.google.android.material.color.utilities.TonalPalette lambda$inversePrimary$64(com.google.android.material.color.utilities.DynamicScheme r0) {
            com.google.android.material.color.utilities.TonalPalette r0 = r0.primaryPalette
            return r0
    }

    static /* synthetic */ java.lang.Double lambda$inversePrimary$65(com.google.android.material.color.utilities.DynamicScheme r2) {
            boolean r2 = r2.isDark
            if (r2 == 0) goto L7
            r0 = 4630826316843712512(0x4044000000000000, double:40.0)
            goto L9
        L7:
            r0 = 4635329916471083008(0x4054000000000000, double:80.0)
        L9:
            java.lang.Double r2 = java.lang.Double.valueOf(r0)
            return r2
    }

    static /* synthetic */ com.google.android.material.color.utilities.TonalPalette lambda$inverseSurface$37(com.google.android.material.color.utilities.DynamicScheme r0) {
            com.google.android.material.color.utilities.TonalPalette r0 = r0.neutralPalette
            return r0
    }

    static /* synthetic */ java.lang.Double lambda$inverseSurface$38(com.google.android.material.color.utilities.DynamicScheme r2) {
            boolean r2 = r2.isDark
            if (r2 == 0) goto La
            r0 = 4636033603912859648(0x4056800000000000, double:90.0)
            goto Lc
        La:
            r0 = 4626322717216342016(0x4034000000000000, double:20.0)
        Lc:
            java.lang.Double r2 = java.lang.Double.valueOf(r0)
            return r2
    }

    static /* synthetic */ com.google.android.material.color.utilities.TonalPalette lambda$neutralPaletteKeyColor$6(com.google.android.material.color.utilities.DynamicScheme r0) {
            com.google.android.material.color.utilities.TonalPalette r0 = r0.neutralPalette
            return r0
    }

    static /* synthetic */ java.lang.Double lambda$neutralPaletteKeyColor$7(com.google.android.material.color.utilities.DynamicScheme r2) {
            com.google.android.material.color.utilities.TonalPalette r2 = r2.neutralPalette
            com.google.android.material.color.utilities.Hct r2 = r2.getKeyColor()
            double r0 = r2.getTone()
            java.lang.Double r2 = java.lang.Double.valueOf(r0)
            return r2
    }

    static /* synthetic */ com.google.android.material.color.utilities.TonalPalette lambda$neutralVariantPaletteKeyColor$8(com.google.android.material.color.utilities.DynamicScheme r0) {
            com.google.android.material.color.utilities.TonalPalette r0 = r0.neutralVariantPalette
            return r0
    }

    static /* synthetic */ java.lang.Double lambda$neutralVariantPaletteKeyColor$9(com.google.android.material.color.utilities.DynamicScheme r2) {
            com.google.android.material.color.utilities.TonalPalette r2 = r2.neutralVariantPalette
            com.google.android.material.color.utilities.Hct r2 = r2.getKeyColor()
            double r0 = r2.getTone()
            java.lang.Double r2 = java.lang.Double.valueOf(r0)
            return r2
    }

    static /* synthetic */ com.google.android.material.color.utilities.TonalPalette lambda$onBackground$12(com.google.android.material.color.utilities.DynamicScheme r0) {
            com.google.android.material.color.utilities.TonalPalette r0 = r0.neutralPalette
            return r0
    }

    static /* synthetic */ java.lang.Double lambda$onBackground$13(com.google.android.material.color.utilities.DynamicScheme r2) {
            boolean r2 = r2.isDark
            if (r2 == 0) goto La
            r0 = 4636033603912859648(0x4056800000000000, double:90.0)
            goto Lc
        La:
            r0 = 4621819117588971520(0x4024000000000000, double:10.0)
        Lc:
            java.lang.Double r2 = java.lang.Double.valueOf(r0)
            return r2
    }

    static /* synthetic */ com.google.android.material.color.utilities.TonalPalette lambda$onError$94(com.google.android.material.color.utilities.DynamicScheme r0) {
            com.google.android.material.color.utilities.TonalPalette r0 = r0.errorPalette
            return r0
    }

    static /* synthetic */ java.lang.Double lambda$onError$95(com.google.android.material.color.utilities.DynamicScheme r2) {
            boolean r2 = r2.isDark
            if (r2 == 0) goto L7
            r0 = 4626322717216342016(0x4034000000000000, double:20.0)
            goto L9
        L7:
            r0 = 4636737291354636288(0x4059000000000000, double:100.0)
        L9:
            java.lang.Double r2 = java.lang.Double.valueOf(r0)
            return r2
    }

    static /* synthetic */ com.google.android.material.color.utilities.TonalPalette lambda$onErrorContainer$100(com.google.android.material.color.utilities.DynamicScheme r0) {
            com.google.android.material.color.utilities.TonalPalette r0 = r0.errorPalette
            return r0
    }

    static /* synthetic */ java.lang.Double lambda$onErrorContainer$101(com.google.android.material.color.utilities.DynamicScheme r2) {
            boolean r2 = r2.isDark
            if (r2 == 0) goto La
            r0 = 4636033603912859648(0x4056800000000000, double:90.0)
            goto Lc
        La:
            r0 = 4621819117588971520(0x4024000000000000, double:10.0)
        Lc:
            java.lang.Double r2 = java.lang.Double.valueOf(r0)
            return r2
    }

    static /* synthetic */ com.google.android.material.color.utilities.TonalPalette lambda$onPrimary$55(com.google.android.material.color.utilities.DynamicScheme r0) {
            com.google.android.material.color.utilities.TonalPalette r0 = r0.primaryPalette
            return r0
    }

    static /* synthetic */ java.lang.Double lambda$onPrimary$56(com.google.android.material.color.utilities.DynamicScheme r2) {
            boolean r0 = isMonochrome(r2)
            if (r0 == 0) goto L17
            boolean r2 = r2.isDark
            if (r2 == 0) goto Ld
            r0 = 4621819117588971520(0x4024000000000000, double:10.0)
            goto L12
        Ld:
            r0 = 4636033603912859648(0x4056800000000000, double:90.0)
        L12:
            java.lang.Double r2 = java.lang.Double.valueOf(r0)
            return r2
        L17:
            boolean r2 = r2.isDark
            if (r2 == 0) goto L1e
            r0 = 4626322717216342016(0x4034000000000000, double:20.0)
            goto L20
        L1e:
            r0 = 4636737291354636288(0x4059000000000000, double:100.0)
        L20:
            java.lang.Double r2 = java.lang.Double.valueOf(r0)
            return r2
    }

    static /* synthetic */ com.google.android.material.color.utilities.TonalPalette lambda$onPrimaryContainer$61(com.google.android.material.color.utilities.DynamicScheme r0) {
            com.google.android.material.color.utilities.TonalPalette r0 = r0.primaryPalette
            return r0
    }

    static /* synthetic */ com.google.android.material.color.utilities.TonalPalette lambda$onPrimaryFixed$109(com.google.android.material.color.utilities.DynamicScheme r0) {
            com.google.android.material.color.utilities.TonalPalette r0 = r0.primaryPalette
            return r0
    }

    static /* synthetic */ java.lang.Double lambda$onPrimaryFixed$110(com.google.android.material.color.utilities.DynamicScheme r2) {
            boolean r2 = isMonochrome(r2)
            if (r2 == 0) goto L9
            r0 = 4636737291354636288(0x4059000000000000, double:100.0)
            goto Lb
        L9:
            r0 = 4621819117588971520(0x4024000000000000, double:10.0)
        Lb:
            java.lang.Double r2 = java.lang.Double.valueOf(r0)
            return r2
    }

    static /* synthetic */ com.google.android.material.color.utilities.TonalPalette lambda$onPrimaryFixedVariant$113(com.google.android.material.color.utilities.DynamicScheme r0) {
            com.google.android.material.color.utilities.TonalPalette r0 = r0.primaryPalette
            return r0
    }

    static /* synthetic */ java.lang.Double lambda$onPrimaryFixedVariant$114(com.google.android.material.color.utilities.DynamicScheme r2) {
            boolean r2 = isMonochrome(r2)
            if (r2 == 0) goto Lc
            r0 = 4636033603912859648(0x4056800000000000, double:90.0)
            goto Le
        Lc:
            r0 = 4629137466983448576(0x403e000000000000, double:30.0)
        Le:
            java.lang.Double r2 = java.lang.Double.valueOf(r0)
            return r2
    }

    static /* synthetic */ com.google.android.material.color.utilities.TonalPalette lambda$onSecondary$70(com.google.android.material.color.utilities.DynamicScheme r0) {
            com.google.android.material.color.utilities.TonalPalette r0 = r0.secondaryPalette
            return r0
    }

    static /* synthetic */ java.lang.Double lambda$onSecondary$71(com.google.android.material.color.utilities.DynamicScheme r3) {
            boolean r0 = isMonochrome(r3)
            r1 = 4636737291354636288(0x4059000000000000, double:100.0)
            if (r0 == 0) goto L13
            boolean r3 = r3.isDark
            if (r3 == 0) goto Le
            r1 = 4621819117588971520(0x4024000000000000, double:10.0)
        Le:
            java.lang.Double r3 = java.lang.Double.valueOf(r1)
            return r3
        L13:
            boolean r3 = r3.isDark
            if (r3 == 0) goto L19
            r1 = 4626322717216342016(0x4034000000000000, double:20.0)
        L19:
            java.lang.Double r3 = java.lang.Double.valueOf(r1)
            return r3
    }

    static /* synthetic */ com.google.android.material.color.utilities.TonalPalette lambda$onSecondaryContainer$76(com.google.android.material.color.utilities.DynamicScheme r0) {
            com.google.android.material.color.utilities.TonalPalette r0 = r0.secondaryPalette
            return r0
    }

    static /* synthetic */ com.google.android.material.color.utilities.TonalPalette lambda$onSecondaryFixed$123(com.google.android.material.color.utilities.DynamicScheme r0) {
            com.google.android.material.color.utilities.TonalPalette r0 = r0.secondaryPalette
            return r0
    }

    static /* synthetic */ java.lang.Double lambda$onSecondaryFixed$124(com.google.android.material.color.utilities.DynamicScheme r2) {
            r0 = 4621819117588971520(0x4024000000000000, double:10.0)
            java.lang.Double r2 = java.lang.Double.valueOf(r0)
            return r2
    }

    static /* synthetic */ com.google.android.material.color.utilities.TonalPalette lambda$onSecondaryFixedVariant$127(com.google.android.material.color.utilities.DynamicScheme r0) {
            com.google.android.material.color.utilities.TonalPalette r0 = r0.secondaryPalette
            return r0
    }

    static /* synthetic */ java.lang.Double lambda$onSecondaryFixedVariant$128(com.google.android.material.color.utilities.DynamicScheme r2) {
            boolean r2 = isMonochrome(r2)
            if (r2 == 0) goto L9
            r0 = 4627730092099895296(0x4039000000000000, double:25.0)
            goto Lb
        L9:
            r0 = 4629137466983448576(0x403e000000000000, double:30.0)
        Lb:
            java.lang.Double r2 = java.lang.Double.valueOf(r0)
            return r2
    }

    static /* synthetic */ com.google.android.material.color.utilities.TonalPalette lambda$onSurface$31(com.google.android.material.color.utilities.DynamicScheme r0) {
            com.google.android.material.color.utilities.TonalPalette r0 = r0.neutralPalette
            return r0
    }

    static /* synthetic */ java.lang.Double lambda$onSurface$32(com.google.android.material.color.utilities.DynamicScheme r2) {
            boolean r2 = r2.isDark
            if (r2 == 0) goto La
            r0 = 4636033603912859648(0x4056800000000000, double:90.0)
            goto Lc
        La:
            r0 = 4621819117588971520(0x4024000000000000, double:10.0)
        Lc:
            java.lang.Double r2 = java.lang.Double.valueOf(r0)
            return r2
    }

    static /* synthetic */ com.google.android.material.color.utilities.TonalPalette lambda$onSurfaceVariant$35(com.google.android.material.color.utilities.DynamicScheme r0) {
            com.google.android.material.color.utilities.TonalPalette r0 = r0.neutralVariantPalette
            return r0
    }

    static /* synthetic */ java.lang.Double lambda$onSurfaceVariant$36(com.google.android.material.color.utilities.DynamicScheme r2) {
            boolean r2 = r2.isDark
            if (r2 == 0) goto L7
            r0 = 4635329916471083008(0x4054000000000000, double:80.0)
            goto L9
        L7:
            r0 = 4629137466983448576(0x403e000000000000, double:30.0)
        L9:
            java.lang.Double r2 = java.lang.Double.valueOf(r0)
            return r2
    }

    static /* synthetic */ com.google.android.material.color.utilities.TonalPalette lambda$onTertiary$82(com.google.android.material.color.utilities.DynamicScheme r0) {
            com.google.android.material.color.utilities.TonalPalette r0 = r0.tertiaryPalette
            return r0
    }

    static /* synthetic */ java.lang.Double lambda$onTertiary$83(com.google.android.material.color.utilities.DynamicScheme r2) {
            boolean r0 = isMonochrome(r2)
            if (r0 == 0) goto L17
            boolean r2 = r2.isDark
            if (r2 == 0) goto Ld
            r0 = 4621819117588971520(0x4024000000000000, double:10.0)
            goto L12
        Ld:
            r0 = 4636033603912859648(0x4056800000000000, double:90.0)
        L12:
            java.lang.Double r2 = java.lang.Double.valueOf(r0)
            return r2
        L17:
            boolean r2 = r2.isDark
            if (r2 == 0) goto L1e
            r0 = 4626322717216342016(0x4034000000000000, double:20.0)
            goto L20
        L1e:
            r0 = 4636737291354636288(0x4059000000000000, double:100.0)
        L20:
            java.lang.Double r2 = java.lang.Double.valueOf(r0)
            return r2
    }

    static /* synthetic */ com.google.android.material.color.utilities.TonalPalette lambda$onTertiaryContainer$88(com.google.android.material.color.utilities.DynamicScheme r0) {
            com.google.android.material.color.utilities.TonalPalette r0 = r0.tertiaryPalette
            return r0
    }

    static /* synthetic */ com.google.android.material.color.utilities.TonalPalette lambda$onTertiaryFixed$137(com.google.android.material.color.utilities.DynamicScheme r0) {
            com.google.android.material.color.utilities.TonalPalette r0 = r0.tertiaryPalette
            return r0
    }

    static /* synthetic */ java.lang.Double lambda$onTertiaryFixed$138(com.google.android.material.color.utilities.DynamicScheme r2) {
            boolean r2 = isMonochrome(r2)
            if (r2 == 0) goto L9
            r0 = 4636737291354636288(0x4059000000000000, double:100.0)
            goto Lb
        L9:
            r0 = 4621819117588971520(0x4024000000000000, double:10.0)
        Lb:
            java.lang.Double r2 = java.lang.Double.valueOf(r0)
            return r2
    }

    static /* synthetic */ com.google.android.material.color.utilities.TonalPalette lambda$onTertiaryFixedVariant$141(com.google.android.material.color.utilities.DynamicScheme r0) {
            com.google.android.material.color.utilities.TonalPalette r0 = r0.tertiaryPalette
            return r0
    }

    static /* synthetic */ java.lang.Double lambda$onTertiaryFixedVariant$142(com.google.android.material.color.utilities.DynamicScheme r2) {
            boolean r2 = isMonochrome(r2)
            if (r2 == 0) goto Lc
            r0 = 4636033603912859648(0x4056800000000000, double:90.0)
            goto Le
        Lc:
            r0 = 4629137466983448576(0x403e000000000000, double:30.0)
        Le:
            java.lang.Double r2 = java.lang.Double.valueOf(r0)
            return r2
    }

    static /* synthetic */ com.google.android.material.color.utilities.TonalPalette lambda$outline$42(com.google.android.material.color.utilities.DynamicScheme r0) {
            com.google.android.material.color.utilities.TonalPalette r0 = r0.neutralVariantPalette
            return r0
    }

    static /* synthetic */ java.lang.Double lambda$outline$43(com.google.android.material.color.utilities.DynamicScheme r2) {
            boolean r2 = r2.isDark
            if (r2 == 0) goto L7
            r0 = 4633641066610819072(0x404e000000000000, double:60.0)
            goto L9
        L7:
            r0 = 4632233691727265792(0x4049000000000000, double:50.0)
        L9:
            java.lang.Double r2 = java.lang.Double.valueOf(r0)
            return r2
    }

    static /* synthetic */ com.google.android.material.color.utilities.TonalPalette lambda$outlineVariant$44(com.google.android.material.color.utilities.DynamicScheme r0) {
            com.google.android.material.color.utilities.TonalPalette r0 = r0.neutralVariantPalette
            return r0
    }

    static /* synthetic */ java.lang.Double lambda$outlineVariant$45(com.google.android.material.color.utilities.DynamicScheme r2) {
            boolean r2 = r2.isDark
            if (r2 == 0) goto L7
            r0 = 4629137466983448576(0x403e000000000000, double:30.0)
            goto L9
        L7:
            r0 = 4635329916471083008(0x4054000000000000, double:80.0)
        L9:
            java.lang.Double r2 = java.lang.Double.valueOf(r0)
            return r2
    }

    static /* synthetic */ com.google.android.material.color.utilities.TonalPalette lambda$primary$52(com.google.android.material.color.utilities.DynamicScheme r0) {
            com.google.android.material.color.utilities.TonalPalette r0 = r0.primaryPalette
            return r0
    }

    static /* synthetic */ java.lang.Double lambda$primary$53(com.google.android.material.color.utilities.DynamicScheme r2) {
            boolean r0 = isMonochrome(r2)
            if (r0 == 0) goto L14
            boolean r2 = r2.isDark
            if (r2 == 0) goto Ld
            r0 = 4636737291354636288(0x4059000000000000, double:100.0)
            goto Lf
        Ld:
            r0 = 0
        Lf:
            java.lang.Double r2 = java.lang.Double.valueOf(r0)
            return r2
        L14:
            boolean r2 = r2.isDark
            if (r2 == 0) goto L1b
            r0 = 4635329916471083008(0x4054000000000000, double:80.0)
            goto L1d
        L1b:
            r0 = 4630826316843712512(0x4044000000000000, double:40.0)
        L1d:
            java.lang.Double r2 = java.lang.Double.valueOf(r0)
            return r2
    }

    static /* synthetic */ com.google.android.material.color.utilities.TonalPalette lambda$primaryContainer$58(com.google.android.material.color.utilities.DynamicScheme r0) {
            com.google.android.material.color.utilities.TonalPalette r0 = r0.primaryPalette
            return r0
    }

    static /* synthetic */ java.lang.Double lambda$primaryContainer$59(com.google.android.material.color.utilities.DynamicScheme r2) {
            boolean r0 = isFidelity(r2)
            if (r0 == 0) goto L11
            com.google.android.material.color.utilities.Hct r0 = r2.sourceColorHct
            double r0 = performAlbers(r0, r2)
            java.lang.Double r2 = java.lang.Double.valueOf(r0)
            return r2
        L11:
            boolean r0 = isMonochrome(r2)
            if (r0 == 0) goto L28
            boolean r2 = r2.isDark
            if (r2 == 0) goto L21
            r0 = 4635681760191971328(0x4055400000000000, double:85.0)
            goto L23
        L21:
            r0 = 4627730092099895296(0x4039000000000000, double:25.0)
        L23:
            java.lang.Double r2 = java.lang.Double.valueOf(r0)
            return r2
        L28:
            boolean r2 = r2.isDark
            if (r2 == 0) goto L2f
            r0 = 4629137466983448576(0x403e000000000000, double:30.0)
            goto L34
        L2f:
            r0 = 4636033603912859648(0x4056800000000000, double:90.0)
        L34:
            java.lang.Double r2 = java.lang.Double.valueOf(r0)
            return r2
    }

    static /* synthetic */ com.google.android.material.color.utilities.TonalPalette lambda$primaryFixed$103(com.google.android.material.color.utilities.DynamicScheme r0) {
            com.google.android.material.color.utilities.TonalPalette r0 = r0.primaryPalette
            return r0
    }

    static /* synthetic */ java.lang.Double lambda$primaryFixed$104(com.google.android.material.color.utilities.DynamicScheme r2) {
            boolean r2 = isMonochrome(r2)
            if (r2 == 0) goto L9
            r0 = 4630826316843712512(0x4044000000000000, double:40.0)
            goto Le
        L9:
            r0 = 4636033603912859648(0x4056800000000000, double:90.0)
        Le:
            java.lang.Double r2 = java.lang.Double.valueOf(r0)
            return r2
    }

    static /* synthetic */ com.google.android.material.color.utilities.TonalPalette lambda$primaryFixedDim$106(com.google.android.material.color.utilities.DynamicScheme r0) {
            com.google.android.material.color.utilities.TonalPalette r0 = r0.primaryPalette
            return r0
    }

    static /* synthetic */ java.lang.Double lambda$primaryFixedDim$107(com.google.android.material.color.utilities.DynamicScheme r2) {
            boolean r2 = isMonochrome(r2)
            if (r2 == 0) goto L9
            r0 = 4629137466983448576(0x403e000000000000, double:30.0)
            goto Lb
        L9:
            r0 = 4635329916471083008(0x4054000000000000, double:80.0)
        Lb:
            java.lang.Double r2 = java.lang.Double.valueOf(r0)
            return r2
    }

    static /* synthetic */ com.google.android.material.color.utilities.TonalPalette lambda$primaryPaletteKeyColor$0(com.google.android.material.color.utilities.DynamicScheme r0) {
            com.google.android.material.color.utilities.TonalPalette r0 = r0.primaryPalette
            return r0
    }

    static /* synthetic */ java.lang.Double lambda$primaryPaletteKeyColor$1(com.google.android.material.color.utilities.DynamicScheme r2) {
            com.google.android.material.color.utilities.TonalPalette r2 = r2.primaryPalette
            com.google.android.material.color.utilities.Hct r2 = r2.getKeyColor()
            double r0 = r2.getTone()
            java.lang.Double r2 = java.lang.Double.valueOf(r0)
            return r2
    }

    static /* synthetic */ com.google.android.material.color.utilities.TonalPalette lambda$scrim$48(com.google.android.material.color.utilities.DynamicScheme r0) {
            com.google.android.material.color.utilities.TonalPalette r0 = r0.neutralPalette
            return r0
    }

    static /* synthetic */ java.lang.Double lambda$scrim$49(com.google.android.material.color.utilities.DynamicScheme r2) {
            r0 = 0
            java.lang.Double r2 = java.lang.Double.valueOf(r0)
            return r2
    }

    static /* synthetic */ com.google.android.material.color.utilities.TonalPalette lambda$secondary$67(com.google.android.material.color.utilities.DynamicScheme r0) {
            com.google.android.material.color.utilities.TonalPalette r0 = r0.secondaryPalette
            return r0
    }

    static /* synthetic */ java.lang.Double lambda$secondary$68(com.google.android.material.color.utilities.DynamicScheme r2) {
            boolean r2 = r2.isDark
            if (r2 == 0) goto L7
            r0 = 4635329916471083008(0x4054000000000000, double:80.0)
            goto L9
        L7:
            r0 = 4630826316843712512(0x4044000000000000, double:40.0)
        L9:
            java.lang.Double r2 = java.lang.Double.valueOf(r0)
            return r2
    }

    static /* synthetic */ com.google.android.material.color.utilities.TonalPalette lambda$secondaryContainer$73(com.google.android.material.color.utilities.DynamicScheme r0) {
            com.google.android.material.color.utilities.TonalPalette r0 = r0.secondaryPalette
            return r0
    }

    static /* synthetic */ java.lang.Double lambda$secondaryContainer$74(com.google.android.material.color.utilities.DynamicScheme r12) {
            boolean r0 = r12.isDark
            r1 = 4629137466983448576(0x403e000000000000, double:30.0)
            if (r0 == 0) goto L8
            r9 = r1
            goto Le
        L8:
            r3 = 4636033603912859648(0x4056800000000000, double:90.0)
            r9 = r3
        Le:
            boolean r0 = isMonochrome(r12)
            if (r0 == 0) goto L23
            boolean r12 = r12.isDark
            if (r12 == 0) goto L19
            goto L1e
        L19:
            r1 = 4635681760191971328(0x4055400000000000, double:85.0)
        L1e:
            java.lang.Double r12 = java.lang.Double.valueOf(r1)
            return r12
        L23:
            boolean r0 = isFidelity(r12)
            if (r0 != 0) goto L2e
            java.lang.Double r12 = java.lang.Double.valueOf(r9)
            return r12
        L2e:
            com.google.android.material.color.utilities.TonalPalette r0 = r12.secondaryPalette
            double r5 = r0.getHue()
            com.google.android.material.color.utilities.TonalPalette r0 = r12.secondaryPalette
            double r7 = r0.getChroma()
            boolean r0 = r12.isDark
            r11 = r0 ^ 1
            double r0 = findDesiredChromaByTone(r5, r7, r9, r11)
            com.google.android.material.color.utilities.TonalPalette r2 = r12.secondaryPalette
            com.google.android.material.color.utilities.Hct r0 = r2.getHct(r0)
            double r0 = performAlbers(r0, r12)
            java.lang.Double r12 = java.lang.Double.valueOf(r0)
            return r12
    }

    static /* synthetic */ com.google.android.material.color.utilities.TonalPalette lambda$secondaryFixed$117(com.google.android.material.color.utilities.DynamicScheme r0) {
            com.google.android.material.color.utilities.TonalPalette r0 = r0.secondaryPalette
            return r0
    }

    static /* synthetic */ java.lang.Double lambda$secondaryFixed$118(com.google.android.material.color.utilities.DynamicScheme r2) {
            boolean r2 = isMonochrome(r2)
            if (r2 == 0) goto L9
            r0 = 4635329916471083008(0x4054000000000000, double:80.0)
            goto Le
        L9:
            r0 = 4636033603912859648(0x4056800000000000, double:90.0)
        Le:
            java.lang.Double r2 = java.lang.Double.valueOf(r0)
            return r2
    }

    static /* synthetic */ com.google.android.material.color.utilities.TonalPalette lambda$secondaryFixedDim$120(com.google.android.material.color.utilities.DynamicScheme r0) {
            com.google.android.material.color.utilities.TonalPalette r0 = r0.secondaryPalette
            return r0
    }

    static /* synthetic */ java.lang.Double lambda$secondaryFixedDim$121(com.google.android.material.color.utilities.DynamicScheme r2) {
            boolean r2 = isMonochrome(r2)
            if (r2 == 0) goto Lc
            r0 = 4634626229029306368(0x4051800000000000, double:70.0)
            goto Le
        Lc:
            r0 = 4635329916471083008(0x4054000000000000, double:80.0)
        Le:
            java.lang.Double r2 = java.lang.Double.valueOf(r0)
            return r2
    }

    static /* synthetic */ com.google.android.material.color.utilities.TonalPalette lambda$secondaryPaletteKeyColor$2(com.google.android.material.color.utilities.DynamicScheme r0) {
            com.google.android.material.color.utilities.TonalPalette r0 = r0.secondaryPalette
            return r0
    }

    static /* synthetic */ java.lang.Double lambda$secondaryPaletteKeyColor$3(com.google.android.material.color.utilities.DynamicScheme r2) {
            com.google.android.material.color.utilities.TonalPalette r2 = r2.secondaryPalette
            com.google.android.material.color.utilities.Hct r2 = r2.getKeyColor()
            double r0 = r2.getTone()
            java.lang.Double r2 = java.lang.Double.valueOf(r0)
            return r2
    }

    static /* synthetic */ com.google.android.material.color.utilities.TonalPalette lambda$shadow$46(com.google.android.material.color.utilities.DynamicScheme r0) {
            com.google.android.material.color.utilities.TonalPalette r0 = r0.neutralPalette
            return r0
    }

    static /* synthetic */ java.lang.Double lambda$shadow$47(com.google.android.material.color.utilities.DynamicScheme r2) {
            r0 = 0
            java.lang.Double r2 = java.lang.Double.valueOf(r0)
            return r2
    }

    static /* synthetic */ com.google.android.material.color.utilities.TonalPalette lambda$surface$15(com.google.android.material.color.utilities.DynamicScheme r0) {
            com.google.android.material.color.utilities.TonalPalette r0 = r0.neutralPalette
            return r0
    }

    static /* synthetic */ java.lang.Double lambda$surface$16(com.google.android.material.color.utilities.DynamicScheme r2) {
            boolean r2 = r2.isDark
            if (r2 == 0) goto L7
            r0 = 4618441417868443648(0x4018000000000000, double:6.0)
            goto Lc
        L7:
            r0 = 4636596553866280960(0x4058800000000000, double:98.0)
        Lc:
            java.lang.Double r2 = java.lang.Double.valueOf(r0)
            return r2
    }

    static /* synthetic */ com.google.android.material.color.utilities.TonalPalette lambda$surfaceBright$19(com.google.android.material.color.utilities.DynamicScheme r0) {
            com.google.android.material.color.utilities.TonalPalette r0 = r0.neutralPalette
            return r0
    }

    static /* synthetic */ java.lang.Double lambda$surfaceBright$20(com.google.android.material.color.utilities.DynamicScheme r2) {
            boolean r2 = r2.isDark
            if (r2 == 0) goto L7
            r0 = 4627448617123184640(0x4038000000000000, double:24.0)
            goto Lc
        L7:
            r0 = 4636596553866280960(0x4058800000000000, double:98.0)
        Lc:
            java.lang.Double r2 = java.lang.Double.valueOf(r0)
            return r2
    }

    static /* synthetic */ com.google.android.material.color.utilities.TonalPalette lambda$surfaceContainer$25(com.google.android.material.color.utilities.DynamicScheme r0) {
            com.google.android.material.color.utilities.TonalPalette r0 = r0.neutralPalette
            return r0
    }

    static /* synthetic */ java.lang.Double lambda$surfaceContainer$26(com.google.android.material.color.utilities.DynamicScheme r2) {
            boolean r2 = r2.isDark
            if (r2 == 0) goto L7
            r0 = 4622945017495814144(0x4028000000000000, double:12.0)
            goto Lc
        L7:
            r0 = 4636315078889570304(0x4057800000000000, double:94.0)
        Lc:
            java.lang.Double r2 = java.lang.Double.valueOf(r0)
            return r2
    }

    static /* synthetic */ com.google.android.material.color.utilities.TonalPalette lambda$surfaceContainerHigh$27(com.google.android.material.color.utilities.DynamicScheme r0) {
            com.google.android.material.color.utilities.TonalPalette r0 = r0.neutralPalette
            return r0
    }

    static /* synthetic */ java.lang.Double lambda$surfaceContainerHigh$28(com.google.android.material.color.utilities.DynamicScheme r2) {
            boolean r2 = r2.isDark
            if (r2 == 0) goto L7
            r0 = 4625478292286210048(0x4031000000000000, double:17.0)
            goto L9
        L7:
            r0 = 4636174341401214976(0x4057000000000000, double:92.0)
        L9:
            java.lang.Double r2 = java.lang.Double.valueOf(r0)
            return r2
    }

    static /* synthetic */ com.google.android.material.color.utilities.TonalPalette lambda$surfaceContainerHighest$29(com.google.android.material.color.utilities.DynamicScheme r0) {
            com.google.android.material.color.utilities.TonalPalette r0 = r0.neutralPalette
            return r0
    }

    static /* synthetic */ java.lang.Double lambda$surfaceContainerHighest$30(com.google.android.material.color.utilities.DynamicScheme r2) {
            boolean r2 = r2.isDark
            if (r2 == 0) goto L7
            r0 = 4626885667169763328(0x4036000000000000, double:22.0)
            goto Lc
        L7:
            r0 = 4636033603912859648(0x4056800000000000, double:90.0)
        Lc:
            java.lang.Double r2 = java.lang.Double.valueOf(r0)
            return r2
    }

    static /* synthetic */ com.google.android.material.color.utilities.TonalPalette lambda$surfaceContainerLow$23(com.google.android.material.color.utilities.DynamicScheme r0) {
            com.google.android.material.color.utilities.TonalPalette r0 = r0.neutralPalette
            return r0
    }

    static /* synthetic */ java.lang.Double lambda$surfaceContainerLow$24(com.google.android.material.color.utilities.DynamicScheme r2) {
            boolean r2 = r2.isDark
            if (r2 == 0) goto L7
            r0 = 4621819117588971520(0x4024000000000000, double:10.0)
            goto L9
        L7:
            r0 = 4636455816377925632(0x4058000000000000, double:96.0)
        L9:
            java.lang.Double r2 = java.lang.Double.valueOf(r0)
            return r2
    }

    static /* synthetic */ com.google.android.material.color.utilities.TonalPalette lambda$surfaceContainerLowest$21(com.google.android.material.color.utilities.DynamicScheme r0) {
            com.google.android.material.color.utilities.TonalPalette r0 = r0.neutralPalette
            return r0
    }

    static /* synthetic */ java.lang.Double lambda$surfaceContainerLowest$22(com.google.android.material.color.utilities.DynamicScheme r2) {
            boolean r2 = r2.isDark
            if (r2 == 0) goto L7
            r0 = 4616189618054758400(0x4010000000000000, double:4.0)
            goto L9
        L7:
            r0 = 4636737291354636288(0x4059000000000000, double:100.0)
        L9:
            java.lang.Double r2 = java.lang.Double.valueOf(r0)
            return r2
    }

    static /* synthetic */ com.google.android.material.color.utilities.TonalPalette lambda$surfaceDim$17(com.google.android.material.color.utilities.DynamicScheme r0) {
            com.google.android.material.color.utilities.TonalPalette r0 = r0.neutralPalette
            return r0
    }

    static /* synthetic */ java.lang.Double lambda$surfaceDim$18(com.google.android.material.color.utilities.DynamicScheme r2) {
            boolean r2 = r2.isDark
            if (r2 == 0) goto L7
            r0 = 4618441417868443648(0x4018000000000000, double:6.0)
            goto Lc
        L7:
            r0 = 4635822497680326656(0x4055c00000000000, double:87.0)
        Lc:
            java.lang.Double r2 = java.lang.Double.valueOf(r0)
            return r2
    }

    static /* synthetic */ com.google.android.material.color.utilities.TonalPalette lambda$surfaceTint$50(com.google.android.material.color.utilities.DynamicScheme r0) {
            com.google.android.material.color.utilities.TonalPalette r0 = r0.primaryPalette
            return r0
    }

    static /* synthetic */ java.lang.Double lambda$surfaceTint$51(com.google.android.material.color.utilities.DynamicScheme r2) {
            boolean r2 = r2.isDark
            if (r2 == 0) goto L7
            r0 = 4635329916471083008(0x4054000000000000, double:80.0)
            goto L9
        L7:
            r0 = 4630826316843712512(0x4044000000000000, double:40.0)
        L9:
            java.lang.Double r2 = java.lang.Double.valueOf(r0)
            return r2
    }

    static /* synthetic */ com.google.android.material.color.utilities.TonalPalette lambda$surfaceVariant$33(com.google.android.material.color.utilities.DynamicScheme r0) {
            com.google.android.material.color.utilities.TonalPalette r0 = r0.neutralVariantPalette
            return r0
    }

    static /* synthetic */ java.lang.Double lambda$surfaceVariant$34(com.google.android.material.color.utilities.DynamicScheme r2) {
            boolean r2 = r2.isDark
            if (r2 == 0) goto L7
            r0 = 4629137466983448576(0x403e000000000000, double:30.0)
            goto Lc
        L7:
            r0 = 4636033603912859648(0x4056800000000000, double:90.0)
        Lc:
            java.lang.Double r2 = java.lang.Double.valueOf(r0)
            return r2
    }

    static /* synthetic */ com.google.android.material.color.utilities.TonalPalette lambda$tertiary$79(com.google.android.material.color.utilities.DynamicScheme r0) {
            com.google.android.material.color.utilities.TonalPalette r0 = r0.tertiaryPalette
            return r0
    }

    static /* synthetic */ java.lang.Double lambda$tertiary$80(com.google.android.material.color.utilities.DynamicScheme r2) {
            boolean r0 = isMonochrome(r2)
            if (r0 == 0) goto L17
            boolean r2 = r2.isDark
            if (r2 == 0) goto L10
            r0 = 4636033603912859648(0x4056800000000000, double:90.0)
            goto L12
        L10:
            r0 = 4627730092099895296(0x4039000000000000, double:25.0)
        L12:
            java.lang.Double r2 = java.lang.Double.valueOf(r0)
            return r2
        L17:
            boolean r2 = r2.isDark
            if (r2 == 0) goto L1e
            r0 = 4635329916471083008(0x4054000000000000, double:80.0)
            goto L20
        L1e:
            r0 = 4630826316843712512(0x4044000000000000, double:40.0)
        L20:
            java.lang.Double r2 = java.lang.Double.valueOf(r0)
            return r2
    }

    static /* synthetic */ com.google.android.material.color.utilities.TonalPalette lambda$tertiaryContainer$85(com.google.android.material.color.utilities.DynamicScheme r0) {
            com.google.android.material.color.utilities.TonalPalette r0 = r0.tertiaryPalette
            return r0
    }

    static /* synthetic */ java.lang.Double lambda$tertiaryContainer$86(com.google.android.material.color.utilities.DynamicScheme r3) {
            boolean r0 = isMonochrome(r3)
            if (r0 == 0) goto L17
            boolean r3 = r3.isDark
            if (r3 == 0) goto Ld
            r0 = 4633641066610819072(0x404e000000000000, double:60.0)
            goto L12
        Ld:
            r0 = 4632092954238910464(0x4048800000000000, double:49.0)
        L12:
            java.lang.Double r3 = java.lang.Double.valueOf(r0)
            return r3
        L17:
            boolean r0 = isFidelity(r3)
            if (r0 != 0) goto L2e
            boolean r3 = r3.isDark
            if (r3 == 0) goto L24
            r0 = 4629137466983448576(0x403e000000000000, double:30.0)
            goto L29
        L24:
            r0 = 4636033603912859648(0x4056800000000000, double:90.0)
        L29:
            java.lang.Double r3 = java.lang.Double.valueOf(r0)
            return r3
        L2e:
            com.google.android.material.color.utilities.TonalPalette r0 = r3.tertiaryPalette
            com.google.android.material.color.utilities.Hct r1 = r3.sourceColorHct
            double r1 = r1.getTone()
            com.google.android.material.color.utilities.Hct r0 = r0.getHct(r1)
            double r0 = performAlbers(r0, r3)
            com.google.android.material.color.utilities.TonalPalette r3 = r3.tertiaryPalette
            com.google.android.material.color.utilities.Hct r3 = r3.getHct(r0)
            com.google.android.material.color.utilities.Hct r3 = com.google.android.material.color.utilities.DislikeAnalyzer.fixIfDisliked(r3)
            double r0 = r3.getTone()
            java.lang.Double r3 = java.lang.Double.valueOf(r0)
            return r3
    }

    static /* synthetic */ com.google.android.material.color.utilities.TonalPalette lambda$tertiaryFixed$131(com.google.android.material.color.utilities.DynamicScheme r0) {
            com.google.android.material.color.utilities.TonalPalette r0 = r0.tertiaryPalette
            return r0
    }

    static /* synthetic */ java.lang.Double lambda$tertiaryFixed$132(com.google.android.material.color.utilities.DynamicScheme r2) {
            boolean r2 = isMonochrome(r2)
            if (r2 == 0) goto L9
            r0 = 4630826316843712512(0x4044000000000000, double:40.0)
            goto Le
        L9:
            r0 = 4636033603912859648(0x4056800000000000, double:90.0)
        Le:
            java.lang.Double r2 = java.lang.Double.valueOf(r0)
            return r2
    }

    static /* synthetic */ com.google.android.material.color.utilities.TonalPalette lambda$tertiaryFixedDim$134(com.google.android.material.color.utilities.DynamicScheme r0) {
            com.google.android.material.color.utilities.TonalPalette r0 = r0.tertiaryPalette
            return r0
    }

    static /* synthetic */ java.lang.Double lambda$tertiaryFixedDim$135(com.google.android.material.color.utilities.DynamicScheme r2) {
            boolean r2 = isMonochrome(r2)
            if (r2 == 0) goto L9
            r0 = 4629137466983448576(0x403e000000000000, double:30.0)
            goto Lb
        L9:
            r0 = 4635329916471083008(0x4054000000000000, double:80.0)
        Lb:
            java.lang.Double r2 = java.lang.Double.valueOf(r0)
            return r2
    }

    static /* synthetic */ com.google.android.material.color.utilities.TonalPalette lambda$tertiaryPaletteKeyColor$4(com.google.android.material.color.utilities.DynamicScheme r0) {
            com.google.android.material.color.utilities.TonalPalette r0 = r0.tertiaryPalette
            return r0
    }

    static /* synthetic */ java.lang.Double lambda$tertiaryPaletteKeyColor$5(com.google.android.material.color.utilities.DynamicScheme r2) {
            com.google.android.material.color.utilities.TonalPalette r2 = r2.tertiaryPalette
            com.google.android.material.color.utilities.Hct r2 = r2.getKeyColor()
            double r0 = r2.getTone()
            java.lang.Double r2 = java.lang.Double.valueOf(r0)
            return r2
    }

    static /* synthetic */ com.google.android.material.color.utilities.TonalPalette lambda$textHintInverse$160(com.google.android.material.color.utilities.DynamicScheme r0) {
            com.google.android.material.color.utilities.TonalPalette r0 = r0.neutralPalette
            return r0
    }

    static /* synthetic */ java.lang.Double lambda$textHintInverse$161(com.google.android.material.color.utilities.DynamicScheme r2) {
            boolean r2 = r2.isDark
            if (r2 == 0) goto L7
            r0 = 4621819117588971520(0x4024000000000000, double:10.0)
            goto Lc
        L7:
            r0 = 4636033603912859648(0x4056800000000000, double:90.0)
        Lc:
            java.lang.Double r2 = java.lang.Double.valueOf(r0)
            return r2
    }

    static /* synthetic */ com.google.android.material.color.utilities.TonalPalette lambda$textPrimaryInverse$152(com.google.android.material.color.utilities.DynamicScheme r0) {
            com.google.android.material.color.utilities.TonalPalette r0 = r0.neutralPalette
            return r0
    }

    static /* synthetic */ java.lang.Double lambda$textPrimaryInverse$153(com.google.android.material.color.utilities.DynamicScheme r2) {
            boolean r2 = r2.isDark
            if (r2 == 0) goto L7
            r0 = 4621819117588971520(0x4024000000000000, double:10.0)
            goto Lc
        L7:
            r0 = 4636033603912859648(0x4056800000000000, double:90.0)
        Lc:
            java.lang.Double r2 = java.lang.Double.valueOf(r0)
            return r2
    }

    static /* synthetic */ com.google.android.material.color.utilities.TonalPalette lambda$textPrimaryInverseDisableOnly$156(com.google.android.material.color.utilities.DynamicScheme r0) {
            com.google.android.material.color.utilities.TonalPalette r0 = r0.neutralPalette
            return r0
    }

    static /* synthetic */ java.lang.Double lambda$textPrimaryInverseDisableOnly$157(com.google.android.material.color.utilities.DynamicScheme r2) {
            boolean r2 = r2.isDark
            if (r2 == 0) goto L7
            r0 = 4621819117588971520(0x4024000000000000, double:10.0)
            goto Lc
        L7:
            r0 = 4636033603912859648(0x4056800000000000, double:90.0)
        Lc:
            java.lang.Double r2 = java.lang.Double.valueOf(r0)
            return r2
    }

    static /* synthetic */ com.google.android.material.color.utilities.TonalPalette lambda$textSecondaryAndTertiaryInverse$154(com.google.android.material.color.utilities.DynamicScheme r0) {
            com.google.android.material.color.utilities.TonalPalette r0 = r0.neutralVariantPalette
            return r0
    }

    static /* synthetic */ java.lang.Double lambda$textSecondaryAndTertiaryInverse$155(com.google.android.material.color.utilities.DynamicScheme r2) {
            boolean r2 = r2.isDark
            if (r2 == 0) goto L7
            r0 = 4629137466983448576(0x403e000000000000, double:30.0)
            goto L9
        L7:
            r0 = 4635329916471083008(0x4054000000000000, double:80.0)
        L9:
            java.lang.Double r2 = java.lang.Double.valueOf(r0)
            return r2
    }

    static /* synthetic */ com.google.android.material.color.utilities.TonalPalette lambda$textSecondaryAndTertiaryInverseDisabled$158(com.google.android.material.color.utilities.DynamicScheme r0) {
            com.google.android.material.color.utilities.TonalPalette r0 = r0.neutralPalette
            return r0
    }

    static /* synthetic */ java.lang.Double lambda$textSecondaryAndTertiaryInverseDisabled$159(com.google.android.material.color.utilities.DynamicScheme r2) {
            boolean r2 = r2.isDark
            if (r2 == 0) goto L7
            r0 = 4621819117588971520(0x4024000000000000, double:10.0)
            goto Lc
        L7:
            r0 = 4636033603912859648(0x4056800000000000, double:90.0)
        Lc:
            java.lang.Double r2 = java.lang.Double.valueOf(r0)
            return r2
    }

    static double performAlbers(com.google.android.material.color.utilities.Hct r2, com.google.android.material.color.utilities.DynamicScheme r3) {
            com.google.android.material.color.utilities.ViewingConditions r3 = viewingConditionsForAlbers(r3)
            com.google.android.material.color.utilities.Hct r3 = r2.inViewingConditions(r3)
            double r0 = r2.getTone()
            boolean r0 = com.google.android.material.color.utilities.DynamicColor.tonePrefersLightForeground(r0)
            if (r0 == 0) goto L25
            double r0 = r3.getTone()
            boolean r0 = com.google.android.material.color.utilities.DynamicColor.toneAllowsLightForeground(r0)
            if (r0 != 0) goto L25
            double r2 = r2.getTone()
            double r2 = com.google.android.material.color.utilities.DynamicColor.enableLightForeground(r2)
            return r2
        L25:
            double r2 = r3.getTone()
            double r2 = com.google.android.material.color.utilities.DynamicColor.enableLightForeground(r2)
            return r2
    }

    private static com.google.android.material.color.utilities.ViewingConditions viewingConditionsForAlbers(com.google.android.material.color.utilities.DynamicScheme r2) {
            boolean r2 = r2.isDark
            if (r2 == 0) goto L7
            r0 = 4629137466983448576(0x403e000000000000, double:30.0)
            goto L9
        L7:
            r0 = 4635329916471083008(0x4054000000000000, double:80.0)
        L9:
            com.google.android.material.color.utilities.ViewingConditions r2 = com.google.android.material.color.utilities.ViewingConditions.defaultWithBackgroundLstar(r0)
            return r2
    }

    public com.google.android.material.color.utilities.DynamicColor background() {
            r10 = this;
            com.google.android.material.color.utilities.DynamicColor r9 = new com.google.android.material.color.utilities.DynamicColor
            com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda100 r2 = new com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda100
            r2.<init>()
            com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda101 r3 = new com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda101
            r3.<init>()
            r7 = 0
            r8 = 0
            java.lang.String r1 = "background"
            r4 = 1
            r5 = 0
            r6 = 0
            r0 = r9
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            return r9
    }

    public com.google.android.material.color.utilities.DynamicColor controlActivated() {
            r3 = this;
            com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda70 r0 = new com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda70
            r0.<init>()
            com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda71 r1 = new com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda71
            r1.<init>()
            java.lang.String r2 = "control_activated"
            com.google.android.material.color.utilities.DynamicColor r0 = com.google.android.material.color.utilities.DynamicColor.fromPalette(r2, r0, r1)
            return r0
    }

    public com.google.android.material.color.utilities.DynamicColor controlHighlight() {
            r11 = this;
            com.google.android.material.color.utilities.DynamicColor r10 = new com.google.android.material.color.utilities.DynamicColor
            com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda93 r2 = new com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda93
            r2.<init>()
            com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda94 r3 = new com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda94
            r3.<init>()
            com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda95 r9 = new com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda95
            r9.<init>()
            java.lang.String r1 = "control_highlight"
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r0 = r10
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            return r10
    }

    public com.google.android.material.color.utilities.DynamicColor controlNormal() {
            r3 = this;
            com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda55 r0 = new com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda55
            r0.<init>()
            com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda66 r1 = new com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda66
            r1.<init>()
            java.lang.String r2 = "control_normal"
            com.google.android.material.color.utilities.DynamicColor r0 = com.google.android.material.color.utilities.DynamicColor.fromPalette(r2, r0, r1)
            return r0
    }

    public com.google.android.material.color.utilities.DynamicColor error() {
            r20 = this;
            r0 = r20
            com.google.android.material.color.utilities.DynamicColor r10 = new com.google.android.material.color.utilities.DynamicColor
            com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda32 r3 = new com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda32
            r3.<init>()
            com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda34 r4 = new com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda34
            r4.<init>()
            com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda162 r6 = new com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda162
            r6.<init>(r0)
            com.google.android.material.color.utilities.ContrastCurve r8 = new com.google.android.material.color.utilities.ContrastCurve
            r16 = 4619567317775286272(0x401c000000000000, double:7.0)
            r18 = 4622382067542392832(0x4026000000000000, double:11.0)
            r12 = 4613937818241073152(0x4008000000000000, double:3.0)
            r14 = 4616752568008179712(0x4012000000000000, double:4.5)
            r11 = r8
            r11.<init>(r12, r14, r16, r18)
            com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda35 r9 = new com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda35
            r9.<init>(r0)
            java.lang.String r2 = "error"
            r5 = 1
            r7 = 0
            r1 = r10
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9)
            return r10
    }

    public com.google.android.material.color.utilities.DynamicColor errorContainer() {
            r20 = this;
            r0 = r20
            com.google.android.material.color.utilities.DynamicColor r10 = new com.google.android.material.color.utilities.DynamicColor
            com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda50 r3 = new com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda50
            r3.<init>()
            com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda51 r4 = new com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda51
            r4.<init>()
            com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda162 r6 = new com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda162
            r6.<init>(r0)
            com.google.android.material.color.utilities.ContrastCurve r8 = new com.google.android.material.color.utilities.ContrastCurve
            r16 = 4613937818241073152(0x4008000000000000, double:3.0)
            r18 = 4619567317775286272(0x401c000000000000, double:7.0)
            r12 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            r14 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            r11 = r8
            r11.<init>(r12, r14, r16, r18)
            com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda52 r9 = new com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda52
            r9.<init>(r0)
            java.lang.String r2 = "error_container"
            r5 = 1
            r7 = 0
            r1 = r10
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9)
            return r10
    }

    public com.google.android.material.color.utilities.DynamicColor highestSurface(com.google.android.material.color.utilities.DynamicScheme r1) {
            r0 = this;
            boolean r1 = r1.isDark
            if (r1 == 0) goto L9
            com.google.android.material.color.utilities.DynamicColor r1 = r0.surfaceBright()
            goto Ld
        L9:
            com.google.android.material.color.utilities.DynamicColor r1 = r0.surfaceDim()
        Ld:
            return r1
    }

    public com.google.android.material.color.utilities.DynamicColor inverseOnSurface() {
            r20 = this;
            com.google.android.material.color.utilities.DynamicColor r9 = new com.google.android.material.color.utilities.DynamicColor
            com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda18 r2 = new com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda18
            r2.<init>()
            com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda19 r3 = new com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda19
            r3.<init>()
            com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda20 r5 = new com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda20
            r10 = r20
            r5.<init>(r10)
            com.google.android.material.color.utilities.ContrastCurve r7 = new com.google.android.material.color.utilities.ContrastCurve
            r16 = 4622382067542392832(0x4026000000000000, double:11.0)
            r18 = 4626604192193052672(0x4035000000000000, double:21.0)
            r12 = 4616752568008179712(0x4012000000000000, double:4.5)
            r14 = 4619567317775286272(0x401c000000000000, double:7.0)
            r11 = r7
            r11.<init>(r12, r14, r16, r18)
            r8 = 0
            java.lang.String r1 = "inverse_on_surface"
            r4 = 0
            r6 = 0
            r0 = r9
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            return r9
    }

    public com.google.android.material.color.utilities.DynamicColor inversePrimary() {
            r20 = this;
            com.google.android.material.color.utilities.DynamicColor r9 = new com.google.android.material.color.utilities.DynamicColor
            com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda115 r2 = new com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda115
            r2.<init>()
            com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda116 r3 = new com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda116
            r3.<init>()
            com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda117 r5 = new com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda117
            r10 = r20
            r5.<init>(r10)
            com.google.android.material.color.utilities.ContrastCurve r7 = new com.google.android.material.color.utilities.ContrastCurve
            r16 = 4619567317775286272(0x401c000000000000, double:7.0)
            r18 = 4622382067542392832(0x4026000000000000, double:11.0)
            r12 = 4613937818241073152(0x4008000000000000, double:3.0)
            r14 = 4616752568008179712(0x4012000000000000, double:4.5)
            r11 = r7
            r11.<init>(r12, r14, r16, r18)
            r8 = 0
            java.lang.String r1 = "inverse_primary"
            r4 = 0
            r6 = 0
            r0 = r9
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            return r9
    }

    public com.google.android.material.color.utilities.DynamicColor inverseSurface() {
            r10 = this;
            com.google.android.material.color.utilities.DynamicColor r9 = new com.google.android.material.color.utilities.DynamicColor
            com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda42 r2 = new com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda42
            r2.<init>()
            com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda43 r3 = new com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda43
            r3.<init>()
            r7 = 0
            r8 = 0
            java.lang.String r1 = "inverse_surface"
            r4 = 0
            r5 = 0
            r6 = 0
            r0 = r9
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            return r9
    }

    /* JADX INFO: renamed from: lambda$error$93$com-google-android-material-color-utilities-MaterialDynamicColors, reason: not valid java name */
    /* synthetic */ com.google.android.material.color.utilities.ToneDeltaPair m615x590ec46a(com.google.android.material.color.utilities.DynamicScheme r8) {
            r7 = this;
            com.google.android.material.color.utilities.ToneDeltaPair r8 = new com.google.android.material.color.utilities.ToneDeltaPair
            com.google.android.material.color.utilities.DynamicColor r1 = r7.errorContainer()
            com.google.android.material.color.utilities.DynamicColor r2 = r7.error()
            com.google.android.material.color.utilities.TonePolarity r5 = com.google.android.material.color.utilities.TonePolarity.NEARER
            r6 = 0
            r3 = 4624633867356078080(0x402e000000000000, double:15.0)
            r0 = r8
            r0.<init>(r1, r2, r3, r5, r6)
            return r8
    }

    /* JADX INFO: renamed from: lambda$errorContainer$99$com-google-android-material-color-utilities-MaterialDynamicColors, reason: not valid java name */
    /* synthetic */ com.google.android.material.color.utilities.ToneDeltaPair m616x33346ee5(com.google.android.material.color.utilities.DynamicScheme r8) {
            r7 = this;
            com.google.android.material.color.utilities.ToneDeltaPair r8 = new com.google.android.material.color.utilities.ToneDeltaPair
            com.google.android.material.color.utilities.DynamicColor r1 = r7.errorContainer()
            com.google.android.material.color.utilities.DynamicColor r2 = r7.error()
            com.google.android.material.color.utilities.TonePolarity r5 = com.google.android.material.color.utilities.TonePolarity.NEARER
            r6 = 0
            r3 = 4624633867356078080(0x402e000000000000, double:15.0)
            r0 = r8
            r0.<init>(r1, r2, r3, r5, r6)
            return r8
    }

    /* JADX INFO: renamed from: lambda$inverseOnSurface$41$com-google-android-material-color-utilities-MaterialDynamicColors, reason: not valid java name */
    /* synthetic */ com.google.android.material.color.utilities.DynamicColor m617xcbcaf83d(com.google.android.material.color.utilities.DynamicScheme r1) {
            r0 = this;
            com.google.android.material.color.utilities.DynamicColor r1 = r0.inverseSurface()
            return r1
    }

    /* JADX INFO: renamed from: lambda$inversePrimary$66$com-google-android-material-color-utilities-MaterialDynamicColors, reason: not valid java name */
    /* synthetic */ com.google.android.material.color.utilities.DynamicColor m618x6f94cccc(com.google.android.material.color.utilities.DynamicScheme r1) {
            r0 = this;
            com.google.android.material.color.utilities.DynamicColor r1 = r0.inverseSurface()
            return r1
    }

    /* JADX INFO: renamed from: lambda$onBackground$14$com-google-android-material-color-utilities-MaterialDynamicColors, reason: not valid java name */
    /* synthetic */ com.google.android.material.color.utilities.DynamicColor m619x24678954(com.google.android.material.color.utilities.DynamicScheme r1) {
            r0 = this;
            com.google.android.material.color.utilities.DynamicColor r1 = r0.background()
            return r1
    }

    /* JADX INFO: renamed from: lambda$onError$96$com-google-android-material-color-utilities-MaterialDynamicColors, reason: not valid java name */
    /* synthetic */ com.google.android.material.color.utilities.DynamicColor m620xb6a5d3ac(com.google.android.material.color.utilities.DynamicScheme r1) {
            r0 = this;
            com.google.android.material.color.utilities.DynamicColor r1 = r0.error()
            return r1
    }

    /* JADX INFO: renamed from: lambda$onErrorContainer$102$com-google-android-material-color-utilities-MaterialDynamicColors, reason: not valid java name */
    /* synthetic */ com.google.android.material.color.utilities.DynamicColor m621x2dffdbdb(com.google.android.material.color.utilities.DynamicScheme r1) {
            r0 = this;
            com.google.android.material.color.utilities.DynamicColor r1 = r0.errorContainer()
            return r1
    }

    /* JADX INFO: renamed from: lambda$onPrimary$57$com-google-android-material-color-utilities-MaterialDynamicColors, reason: not valid java name */
    /* synthetic */ com.google.android.material.color.utilities.DynamicColor m622x16f20f37(com.google.android.material.color.utilities.DynamicScheme r1) {
            r0 = this;
            com.google.android.material.color.utilities.DynamicColor r1 = r0.primary()
            return r1
    }

    /* JADX INFO: renamed from: lambda$onPrimaryContainer$62$com-google-android-material-color-utilities-MaterialDynamicColors, reason: not valid java name */
    /* synthetic */ java.lang.Double m623x617ce7dc(com.google.android.material.color.utilities.DynamicScheme r5) {
            r4 = this;
            boolean r0 = isFidelity(r5)
            if (r0 == 0) goto L21
            com.google.android.material.color.utilities.DynamicColor r0 = r4.primaryContainer()
            java.util.function.Function<com.google.android.material.color.utilities.DynamicScheme, java.lang.Double> r0 = r0.tone
            java.lang.Object r5 = r0.apply(r5)
            java.lang.Double r5 = (java.lang.Double) r5
            double r0 = r5.doubleValue()
            r2 = 4616752568008179712(0x4012000000000000, double:4.5)
            double r0 = com.google.android.material.color.utilities.DynamicColor.foregroundTone(r0, r2)
            java.lang.Double r5 = java.lang.Double.valueOf(r0)
            return r5
        L21:
            boolean r0 = isMonochrome(r5)
            if (r0 == 0) goto L35
            boolean r5 = r5.isDark
            if (r5 == 0) goto L2e
            r0 = 0
            goto L30
        L2e:
            r0 = 4636737291354636288(0x4059000000000000, double:100.0)
        L30:
            java.lang.Double r5 = java.lang.Double.valueOf(r0)
            return r5
        L35:
            boolean r5 = r5.isDark
            if (r5 == 0) goto L3f
            r0 = 4636033603912859648(0x4056800000000000, double:90.0)
            goto L41
        L3f:
            r0 = 4621819117588971520(0x4024000000000000, double:10.0)
        L41:
            java.lang.Double r5 = java.lang.Double.valueOf(r0)
            return r5
    }

    /* JADX INFO: renamed from: lambda$onPrimaryContainer$63$com-google-android-material-color-utilities-MaterialDynamicColors, reason: not valid java name */
    /* synthetic */ com.google.android.material.color.utilities.DynamicColor m624x3d3e639d(com.google.android.material.color.utilities.DynamicScheme r1) {
            r0 = this;
            com.google.android.material.color.utilities.DynamicColor r1 = r0.primaryContainer()
            return r1
    }

    /* JADX INFO: renamed from: lambda$onPrimaryFixed$111$com-google-android-material-color-utilities-MaterialDynamicColors, reason: not valid java name */
    /* synthetic */ com.google.android.material.color.utilities.DynamicColor m625x702e4bf2(com.google.android.material.color.utilities.DynamicScheme r1) {
            r0 = this;
            com.google.android.material.color.utilities.DynamicColor r1 = r0.primaryFixedDim()
            return r1
    }

    /* JADX INFO: renamed from: lambda$onPrimaryFixed$112$com-google-android-material-color-utilities-MaterialDynamicColors, reason: not valid java name */
    /* synthetic */ com.google.android.material.color.utilities.DynamicColor m626x4befc7b3(com.google.android.material.color.utilities.DynamicScheme r1) {
            r0 = this;
            com.google.android.material.color.utilities.DynamicColor r1 = r0.primaryFixed()
            return r1
    }

    /* JADX INFO: renamed from: lambda$onPrimaryFixedVariant$115$com-google-android-material-color-utilities-MaterialDynamicColors, reason: not valid java name */
    /* synthetic */ com.google.android.material.color.utilities.DynamicColor m627x19d0bbbf(com.google.android.material.color.utilities.DynamicScheme r1) {
            r0 = this;
            com.google.android.material.color.utilities.DynamicColor r1 = r0.primaryFixedDim()
            return r1
    }

    /* JADX INFO: renamed from: lambda$onPrimaryFixedVariant$116$com-google-android-material-color-utilities-MaterialDynamicColors, reason: not valid java name */
    /* synthetic */ com.google.android.material.color.utilities.DynamicColor m628xf5923780(com.google.android.material.color.utilities.DynamicScheme r1) {
            r0 = this;
            com.google.android.material.color.utilities.DynamicColor r1 = r0.primaryFixed()
            return r1
    }

    /* JADX INFO: renamed from: lambda$onSecondary$72$com-google-android-material-color-utilities-MaterialDynamicColors, reason: not valid java name */
    /* synthetic */ com.google.android.material.color.utilities.DynamicColor m629x1ad791fe(com.google.android.material.color.utilities.DynamicScheme r1) {
            r0 = this;
            com.google.android.material.color.utilities.DynamicColor r1 = r0.secondary()
            return r1
    }

    /* JADX INFO: renamed from: lambda$onSecondaryContainer$77$com-google-android-material-color-utilities-MaterialDynamicColors, reason: not valid java name */
    /* synthetic */ java.lang.Double m630x4fcce1f2(com.google.android.material.color.utilities.DynamicScheme r5) {
            r4 = this;
            boolean r0 = isFidelity(r5)
            if (r0 != 0) goto L17
            boolean r5 = r5.isDark
            if (r5 == 0) goto L10
            r0 = 4636033603912859648(0x4056800000000000, double:90.0)
            goto L12
        L10:
            r0 = 4621819117588971520(0x4024000000000000, double:10.0)
        L12:
            java.lang.Double r5 = java.lang.Double.valueOf(r0)
            return r5
        L17:
            com.google.android.material.color.utilities.DynamicColor r0 = r4.secondaryContainer()
            java.util.function.Function<com.google.android.material.color.utilities.DynamicScheme, java.lang.Double> r0 = r0.tone
            java.lang.Object r5 = r0.apply(r5)
            java.lang.Double r5 = (java.lang.Double) r5
            double r0 = r5.doubleValue()
            r2 = 4616752568008179712(0x4012000000000000, double:4.5)
            double r0 = com.google.android.material.color.utilities.DynamicColor.foregroundTone(r0, r2)
            java.lang.Double r5 = java.lang.Double.valueOf(r0)
            return r5
    }

    /* JADX INFO: renamed from: lambda$onSecondaryContainer$78$com-google-android-material-color-utilities-MaterialDynamicColors, reason: not valid java name */
    /* synthetic */ com.google.android.material.color.utilities.DynamicColor m631x2b8e5db3(com.google.android.material.color.utilities.DynamicScheme r1) {
            r0 = this;
            com.google.android.material.color.utilities.DynamicColor r1 = r0.secondaryContainer()
            return r1
    }

    /* JADX INFO: renamed from: lambda$onSecondaryFixed$125$com-google-android-material-color-utilities-MaterialDynamicColors, reason: not valid java name */
    /* synthetic */ com.google.android.material.color.utilities.DynamicColor m632xf72fd9a3(com.google.android.material.color.utilities.DynamicScheme r1) {
            r0 = this;
            com.google.android.material.color.utilities.DynamicColor r1 = r0.secondaryFixedDim()
            return r1
    }

    /* JADX INFO: renamed from: lambda$onSecondaryFixed$126$com-google-android-material-color-utilities-MaterialDynamicColors, reason: not valid java name */
    /* synthetic */ com.google.android.material.color.utilities.DynamicColor m633xd2f15564(com.google.android.material.color.utilities.DynamicScheme r1) {
            r0 = this;
            com.google.android.material.color.utilities.DynamicColor r1 = r0.secondaryFixed()
            return r1
    }

    /* JADX INFO: renamed from: lambda$onSecondaryFixedVariant$129$com-google-android-material-color-utilities-MaterialDynamicColors, reason: not valid java name */
    /* synthetic */ com.google.android.material.color.utilities.DynamicColor m634x26187114(com.google.android.material.color.utilities.DynamicScheme r1) {
            r0 = this;
            com.google.android.material.color.utilities.DynamicColor r1 = r0.secondaryFixedDim()
            return r1
    }

    /* JADX INFO: renamed from: lambda$onSecondaryFixedVariant$130$com-google-android-material-color-utilities-MaterialDynamicColors, reason: not valid java name */
    /* synthetic */ com.google.android.material.color.utilities.DynamicColor m635x8b913aa(com.google.android.material.color.utilities.DynamicScheme r1) {
            r0 = this;
            com.google.android.material.color.utilities.DynamicColor r1 = r0.secondaryFixed()
            return r1
    }

    /* JADX INFO: renamed from: lambda$onTertiary$84$com-google-android-material-color-utilities-MaterialDynamicColors, reason: not valid java name */
    /* synthetic */ com.google.android.material.color.utilities.DynamicColor m636x36068449(com.google.android.material.color.utilities.DynamicScheme r1) {
            r0 = this;
            com.google.android.material.color.utilities.DynamicColor r1 = r0.tertiary()
            return r1
    }

    /* JADX INFO: renamed from: lambda$onTertiaryContainer$89$com-google-android-material-color-utilities-MaterialDynamicColors, reason: not valid java name */
    /* synthetic */ java.lang.Double m637xb5c66ea9(com.google.android.material.color.utilities.DynamicScheme r5) {
            r4 = this;
            boolean r0 = isMonochrome(r5)
            if (r0 == 0) goto L14
            boolean r5 = r5.isDark
            if (r5 == 0) goto Ld
            r0 = 0
            goto Lf
        Ld:
            r0 = 4636737291354636288(0x4059000000000000, double:100.0)
        Lf:
            java.lang.Double r5 = java.lang.Double.valueOf(r0)
            return r5
        L14:
            boolean r0 = isFidelity(r5)
            if (r0 != 0) goto L2b
            boolean r5 = r5.isDark
            if (r5 == 0) goto L24
            r0 = 4636033603912859648(0x4056800000000000, double:90.0)
            goto L26
        L24:
            r0 = 4621819117588971520(0x4024000000000000, double:10.0)
        L26:
            java.lang.Double r5 = java.lang.Double.valueOf(r0)
            return r5
        L2b:
            com.google.android.material.color.utilities.DynamicColor r0 = r4.tertiaryContainer()
            java.util.function.Function<com.google.android.material.color.utilities.DynamicScheme, java.lang.Double> r0 = r0.tone
            java.lang.Object r5 = r0.apply(r5)
            java.lang.Double r5 = (java.lang.Double) r5
            double r0 = r5.doubleValue()
            r2 = 4616752568008179712(0x4012000000000000, double:4.5)
            double r0 = com.google.android.material.color.utilities.DynamicColor.foregroundTone(r0, r2)
            java.lang.Double r5 = java.lang.Double.valueOf(r0)
            return r5
    }

    /* JADX INFO: renamed from: lambda$onTertiaryContainer$90$com-google-android-material-color-utilities-MaterialDynamicColors, reason: not valid java name */
    /* synthetic */ com.google.android.material.color.utilities.DynamicColor m638x9867113f(com.google.android.material.color.utilities.DynamicScheme r1) {
            r0 = this;
            com.google.android.material.color.utilities.DynamicColor r1 = r0.tertiaryContainer()
            return r1
    }

    /* JADX INFO: renamed from: lambda$onTertiaryFixed$139$com-google-android-material-color-utilities-MaterialDynamicColors, reason: not valid java name */
    /* synthetic */ com.google.android.material.color.utilities.DynamicColor m639xfe3fcbf0(com.google.android.material.color.utilities.DynamicScheme r1) {
            r0 = this;
            com.google.android.material.color.utilities.DynamicColor r1 = r0.tertiaryFixedDim()
            return r1
    }

    /* JADX INFO: renamed from: lambda$onTertiaryFixed$140$com-google-android-material-color-utilities-MaterialDynamicColors, reason: not valid java name */
    /* synthetic */ com.google.android.material.color.utilities.DynamicColor m640xe0e06e86(com.google.android.material.color.utilities.DynamicScheme r1) {
            r0 = this;
            com.google.android.material.color.utilities.DynamicColor r1 = r0.tertiaryFixed()
            return r1
    }

    /* JADX INFO: renamed from: lambda$onTertiaryFixedVariant$143$com-google-android-material-color-utilities-MaterialDynamicColors, reason: not valid java name */
    /* synthetic */ com.google.android.material.color.utilities.DynamicColor m641x702fc122(com.google.android.material.color.utilities.DynamicScheme r1) {
            r0 = this;
            com.google.android.material.color.utilities.DynamicColor r1 = r0.tertiaryFixedDim()
            return r1
    }

    /* JADX INFO: renamed from: lambda$onTertiaryFixedVariant$144$com-google-android-material-color-utilities-MaterialDynamicColors, reason: not valid java name */
    /* synthetic */ com.google.android.material.color.utilities.DynamicColor m642x4bf13ce3(com.google.android.material.color.utilities.DynamicScheme r1) {
            r0 = this;
            com.google.android.material.color.utilities.DynamicColor r1 = r0.tertiaryFixed()
            return r1
    }

    /* JADX INFO: renamed from: lambda$primary$54$com-google-android-material-color-utilities-MaterialDynamicColors, reason: not valid java name */
    /* synthetic */ com.google.android.material.color.utilities.ToneDeltaPair m643x39203b5(com.google.android.material.color.utilities.DynamicScheme r8) {
            r7 = this;
            com.google.android.material.color.utilities.ToneDeltaPair r8 = new com.google.android.material.color.utilities.ToneDeltaPair
            com.google.android.material.color.utilities.DynamicColor r1 = r7.primaryContainer()
            com.google.android.material.color.utilities.DynamicColor r2 = r7.primary()
            com.google.android.material.color.utilities.TonePolarity r5 = com.google.android.material.color.utilities.TonePolarity.NEARER
            r6 = 0
            r3 = 4624633867356078080(0x402e000000000000, double:15.0)
            r0 = r8
            r0.<init>(r1, r2, r3, r5, r6)
            return r8
    }

    /* JADX INFO: renamed from: lambda$primaryContainer$60$com-google-android-material-color-utilities-MaterialDynamicColors, reason: not valid java name */
    /* synthetic */ com.google.android.material.color.utilities.ToneDeltaPair m644x8277b1b9(com.google.android.material.color.utilities.DynamicScheme r8) {
            r7 = this;
            com.google.android.material.color.utilities.ToneDeltaPair r8 = new com.google.android.material.color.utilities.ToneDeltaPair
            com.google.android.material.color.utilities.DynamicColor r1 = r7.primaryContainer()
            com.google.android.material.color.utilities.DynamicColor r2 = r7.primary()
            com.google.android.material.color.utilities.TonePolarity r5 = com.google.android.material.color.utilities.TonePolarity.NEARER
            r6 = 0
            r3 = 4624633867356078080(0x402e000000000000, double:15.0)
            r0 = r8
            r0.<init>(r1, r2, r3, r5, r6)
            return r8
    }

    /* JADX INFO: renamed from: lambda$primaryFixed$105$com-google-android-material-color-utilities-MaterialDynamicColors, reason: not valid java name */
    /* synthetic */ com.google.android.material.color.utilities.ToneDeltaPair m645xcb141198(com.google.android.material.color.utilities.DynamicScheme r8) {
            r7 = this;
            com.google.android.material.color.utilities.ToneDeltaPair r8 = new com.google.android.material.color.utilities.ToneDeltaPair
            com.google.android.material.color.utilities.DynamicColor r1 = r7.primaryFixed()
            com.google.android.material.color.utilities.DynamicColor r2 = r7.primaryFixedDim()
            com.google.android.material.color.utilities.TonePolarity r5 = com.google.android.material.color.utilities.TonePolarity.LIGHTER
            r6 = 1
            r3 = 4621819117588971520(0x4024000000000000, double:10.0)
            r0 = r8
            r0.<init>(r1, r2, r3, r5, r6)
            return r8
    }

    /* JADX INFO: renamed from: lambda$primaryFixedDim$108$com-google-android-material-color-utilities-MaterialDynamicColors, reason: not valid java name */
    /* synthetic */ com.google.android.material.color.utilities.ToneDeltaPair m646x8f195ac5(com.google.android.material.color.utilities.DynamicScheme r8) {
            r7 = this;
            com.google.android.material.color.utilities.ToneDeltaPair r8 = new com.google.android.material.color.utilities.ToneDeltaPair
            com.google.android.material.color.utilities.DynamicColor r1 = r7.primaryFixed()
            com.google.android.material.color.utilities.DynamicColor r2 = r7.primaryFixedDim()
            com.google.android.material.color.utilities.TonePolarity r5 = com.google.android.material.color.utilities.TonePolarity.LIGHTER
            r6 = 1
            r3 = 4621819117588971520(0x4024000000000000, double:10.0)
            r0 = r8
            r0.<init>(r1, r2, r3, r5, r6)
            return r8
    }

    /* JADX INFO: renamed from: lambda$secondary$69$com-google-android-material-color-utilities-MaterialDynamicColors, reason: not valid java name */
    /* synthetic */ com.google.android.material.color.utilities.ToneDeltaPair m647x991d7367(com.google.android.material.color.utilities.DynamicScheme r8) {
            r7 = this;
            com.google.android.material.color.utilities.ToneDeltaPair r8 = new com.google.android.material.color.utilities.ToneDeltaPair
            com.google.android.material.color.utilities.DynamicColor r1 = r7.secondaryContainer()
            com.google.android.material.color.utilities.DynamicColor r2 = r7.secondary()
            com.google.android.material.color.utilities.TonePolarity r5 = com.google.android.material.color.utilities.TonePolarity.NEARER
            r6 = 0
            r3 = 4624633867356078080(0x402e000000000000, double:15.0)
            r0 = r8
            r0.<init>(r1, r2, r3, r5, r6)
            return r8
    }

    /* JADX INFO: renamed from: lambda$secondaryContainer$75$com-google-android-material-color-utilities-MaterialDynamicColors, reason: not valid java name */
    /* synthetic */ com.google.android.material.color.utilities.ToneDeltaPair m648x485cd00f(com.google.android.material.color.utilities.DynamicScheme r8) {
            r7 = this;
            com.google.android.material.color.utilities.ToneDeltaPair r8 = new com.google.android.material.color.utilities.ToneDeltaPair
            com.google.android.material.color.utilities.DynamicColor r1 = r7.secondaryContainer()
            com.google.android.material.color.utilities.DynamicColor r2 = r7.secondary()
            com.google.android.material.color.utilities.TonePolarity r5 = com.google.android.material.color.utilities.TonePolarity.NEARER
            r6 = 0
            r3 = 4624633867356078080(0x402e000000000000, double:15.0)
            r0 = r8
            r0.<init>(r1, r2, r3, r5, r6)
            return r8
    }

    /* JADX INFO: renamed from: lambda$secondaryFixed$119$com-google-android-material-color-utilities-MaterialDynamicColors, reason: not valid java name */
    /* synthetic */ com.google.android.material.color.utilities.ToneDeltaPair m649x75ece309(com.google.android.material.color.utilities.DynamicScheme r8) {
            r7 = this;
            com.google.android.material.color.utilities.ToneDeltaPair r8 = new com.google.android.material.color.utilities.ToneDeltaPair
            com.google.android.material.color.utilities.DynamicColor r1 = r7.secondaryFixed()
            com.google.android.material.color.utilities.DynamicColor r2 = r7.secondaryFixedDim()
            com.google.android.material.color.utilities.TonePolarity r5 = com.google.android.material.color.utilities.TonePolarity.LIGHTER
            r6 = 1
            r3 = 4621819117588971520(0x4024000000000000, double:10.0)
            r0 = r8
            r0.<init>(r1, r2, r3, r5, r6)
            return r8
    }

    /* JADX INFO: renamed from: lambda$secondaryFixedDim$122$com-google-android-material-color-utilities-MaterialDynamicColors, reason: not valid java name */
    /* synthetic */ com.google.android.material.color.utilities.ToneDeltaPair m650x801c242f(com.google.android.material.color.utilities.DynamicScheme r8) {
            r7 = this;
            com.google.android.material.color.utilities.ToneDeltaPair r8 = new com.google.android.material.color.utilities.ToneDeltaPair
            com.google.android.material.color.utilities.DynamicColor r1 = r7.secondaryFixed()
            com.google.android.material.color.utilities.DynamicColor r2 = r7.secondaryFixedDim()
            com.google.android.material.color.utilities.TonePolarity r5 = com.google.android.material.color.utilities.TonePolarity.LIGHTER
            r6 = 1
            r3 = 4621819117588971520(0x4024000000000000, double:10.0)
            r0 = r8
            r0.<init>(r1, r2, r3, r5, r6)
            return r8
    }

    /* JADX INFO: renamed from: lambda$tertiary$81$com-google-android-material-color-utilities-MaterialDynamicColors, reason: not valid java name */
    /* synthetic */ com.google.android.material.color.utilities.ToneDeltaPair m651x1f6aa165(com.google.android.material.color.utilities.DynamicScheme r8) {
            r7 = this;
            com.google.android.material.color.utilities.ToneDeltaPair r8 = new com.google.android.material.color.utilities.ToneDeltaPair
            com.google.android.material.color.utilities.DynamicColor r1 = r7.tertiaryContainer()
            com.google.android.material.color.utilities.DynamicColor r2 = r7.tertiary()
            com.google.android.material.color.utilities.TonePolarity r5 = com.google.android.material.color.utilities.TonePolarity.NEARER
            r6 = 0
            r3 = 4624633867356078080(0x402e000000000000, double:15.0)
            r0 = r8
            r0.<init>(r1, r2, r3, r5, r6)
            return r8
    }

    /* JADX INFO: renamed from: lambda$tertiaryContainer$87$com-google-android-material-color-utilities-MaterialDynamicColors, reason: not valid java name */
    /* synthetic */ com.google.android.material.color.utilities.ToneDeltaPair m652x357de1a8(com.google.android.material.color.utilities.DynamicScheme r8) {
            r7 = this;
            com.google.android.material.color.utilities.ToneDeltaPair r8 = new com.google.android.material.color.utilities.ToneDeltaPair
            com.google.android.material.color.utilities.DynamicColor r1 = r7.tertiaryContainer()
            com.google.android.material.color.utilities.DynamicColor r2 = r7.tertiary()
            com.google.android.material.color.utilities.TonePolarity r5 = com.google.android.material.color.utilities.TonePolarity.NEARER
            r6 = 0
            r3 = 4624633867356078080(0x402e000000000000, double:15.0)
            r0 = r8
            r0.<init>(r1, r2, r3, r5, r6)
            return r8
    }

    /* JADX INFO: renamed from: lambda$tertiaryFixed$133$com-google-android-material-color-utilities-MaterialDynamicColors, reason: not valid java name */
    /* synthetic */ com.google.android.material.color.utilities.ToneDeltaPair m653x59237289(com.google.android.material.color.utilities.DynamicScheme r8) {
            r7 = this;
            com.google.android.material.color.utilities.ToneDeltaPair r8 = new com.google.android.material.color.utilities.ToneDeltaPair
            com.google.android.material.color.utilities.DynamicColor r1 = r7.tertiaryFixed()
            com.google.android.material.color.utilities.DynamicColor r2 = r7.tertiaryFixedDim()
            com.google.android.material.color.utilities.TonePolarity r5 = com.google.android.material.color.utilities.TonePolarity.LIGHTER
            r6 = 1
            r3 = 4621819117588971520(0x4024000000000000, double:10.0)
            r0 = r8
            r0.<init>(r1, r2, r3, r5, r6)
            return r8
    }

    /* JADX INFO: renamed from: lambda$tertiaryFixedDim$136$com-google-android-material-color-utilities-MaterialDynamicColors, reason: not valid java name */
    /* synthetic */ com.google.android.material.color.utilities.ToneDeltaPair m654x24c02d4a(com.google.android.material.color.utilities.DynamicScheme r8) {
            r7 = this;
            com.google.android.material.color.utilities.ToneDeltaPair r8 = new com.google.android.material.color.utilities.ToneDeltaPair
            com.google.android.material.color.utilities.DynamicColor r1 = r7.tertiaryFixed()
            com.google.android.material.color.utilities.DynamicColor r2 = r7.tertiaryFixedDim()
            com.google.android.material.color.utilities.TonePolarity r5 = com.google.android.material.color.utilities.TonePolarity.LIGHTER
            r6 = 1
            r3 = 4621819117588971520(0x4024000000000000, double:10.0)
            r0 = r8
            r0.<init>(r1, r2, r3, r5, r6)
            return r8
    }

    public com.google.android.material.color.utilities.DynamicColor neutralPaletteKeyColor() {
            r3 = this;
            com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda11 r0 = new com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda11
            r0.<init>()
            com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda22 r1 = new com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda22
            r1.<init>()
            java.lang.String r2 = "neutral_palette_key_color"
            com.google.android.material.color.utilities.DynamicColor r0 = com.google.android.material.color.utilities.DynamicColor.fromPalette(r2, r0, r1)
            return r0
    }

    public com.google.android.material.color.utilities.DynamicColor neutralVariantPaletteKeyColor() {
            r3 = this;
            com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda144 r0 = new com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda144
            r0.<init>()
            com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda145 r1 = new com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda145
            r1.<init>()
            java.lang.String r2 = "neutral_variant_palette_key_color"
            com.google.android.material.color.utilities.DynamicColor r0 = com.google.android.material.color.utilities.DynamicColor.fromPalette(r2, r0, r1)
            return r0
    }

    public com.google.android.material.color.utilities.DynamicColor onBackground() {
            r20 = this;
            com.google.android.material.color.utilities.DynamicColor r9 = new com.google.android.material.color.utilities.DynamicColor
            com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda104 r2 = new com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda104
            r2.<init>()
            com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda105 r3 = new com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda105
            r3.<init>()
            com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda106 r5 = new com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda106
            r10 = r20
            r5.<init>(r10)
            com.google.android.material.color.utilities.ContrastCurve r7 = new com.google.android.material.color.utilities.ContrastCurve
            r16 = 4616752568008179712(0x4012000000000000, double:4.5)
            r18 = 4619567317775286272(0x401c000000000000, double:7.0)
            r12 = 4613937818241073152(0x4008000000000000, double:3.0)
            r14 = 4613937818241073152(0x4008000000000000, double:3.0)
            r11 = r7
            r11.<init>(r12, r14, r16, r18)
            r8 = 0
            java.lang.String r1 = "on_background"
            r4 = 0
            r6 = 0
            r0 = r9
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            return r9
    }

    public com.google.android.material.color.utilities.DynamicColor onError() {
            r20 = this;
            com.google.android.material.color.utilities.DynamicColor r9 = new com.google.android.material.color.utilities.DynamicColor
            com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda130 r2 = new com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda130
            r2.<init>()
            com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda131 r3 = new com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda131
            r3.<init>()
            com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda132 r5 = new com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda132
            r10 = r20
            r5.<init>(r10)
            com.google.android.material.color.utilities.ContrastCurve r7 = new com.google.android.material.color.utilities.ContrastCurve
            r16 = 4622382067542392832(0x4026000000000000, double:11.0)
            r18 = 4626604192193052672(0x4035000000000000, double:21.0)
            r12 = 4616752568008179712(0x4012000000000000, double:4.5)
            r14 = 4619567317775286272(0x401c000000000000, double:7.0)
            r11 = r7
            r11.<init>(r12, r14, r16, r18)
            r8 = 0
            java.lang.String r1 = "on_error"
            r4 = 0
            r6 = 0
            r0 = r9
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            return r9
    }

    public com.google.android.material.color.utilities.DynamicColor onErrorContainer() {
            r20 = this;
            com.google.android.material.color.utilities.DynamicColor r9 = new com.google.android.material.color.utilities.DynamicColor
            com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda45 r2 = new com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda45
            r2.<init>()
            com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda46 r3 = new com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda46
            r3.<init>()
            com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda47 r5 = new com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda47
            r10 = r20
            r5.<init>(r10)
            com.google.android.material.color.utilities.ContrastCurve r7 = new com.google.android.material.color.utilities.ContrastCurve
            r16 = 4622382067542392832(0x4026000000000000, double:11.0)
            r18 = 4626604192193052672(0x4035000000000000, double:21.0)
            r12 = 4616752568008179712(0x4012000000000000, double:4.5)
            r14 = 4619567317775286272(0x401c000000000000, double:7.0)
            r11 = r7
            r11.<init>(r12, r14, r16, r18)
            r8 = 0
            java.lang.String r1 = "on_error_container"
            r4 = 0
            r6 = 0
            r0 = r9
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            return r9
    }

    public com.google.android.material.color.utilities.DynamicColor onPrimary() {
            r20 = this;
            com.google.android.material.color.utilities.DynamicColor r9 = new com.google.android.material.color.utilities.DynamicColor
            com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda112 r2 = new com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda112
            r2.<init>()
            com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda113 r3 = new com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda113
            r3.<init>()
            com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda114 r5 = new com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda114
            r10 = r20
            r5.<init>(r10)
            com.google.android.material.color.utilities.ContrastCurve r7 = new com.google.android.material.color.utilities.ContrastCurve
            r16 = 4622382067542392832(0x4026000000000000, double:11.0)
            r18 = 4626604192193052672(0x4035000000000000, double:21.0)
            r12 = 4616752568008179712(0x4012000000000000, double:4.5)
            r14 = 4619567317775286272(0x401c000000000000, double:7.0)
            r11 = r7
            r11.<init>(r12, r14, r16, r18)
            r8 = 0
            java.lang.String r1 = "on_primary"
            r4 = 0
            r6 = 0
            r0 = r9
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            return r9
    }

    public com.google.android.material.color.utilities.DynamicColor onPrimaryContainer() {
            r20 = this;
            r0 = r20
            com.google.android.material.color.utilities.DynamicColor r10 = new com.google.android.material.color.utilities.DynamicColor
            com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda135 r3 = new com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda135
            r3.<init>()
            com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda136 r4 = new com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda136
            r4.<init>(r0)
            com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda137 r6 = new com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda137
            r6.<init>(r0)
            com.google.android.material.color.utilities.ContrastCurve r8 = new com.google.android.material.color.utilities.ContrastCurve
            r16 = 4622382067542392832(0x4026000000000000, double:11.0)
            r18 = 4626604192193052672(0x4035000000000000, double:21.0)
            r12 = 4616752568008179712(0x4012000000000000, double:4.5)
            r14 = 4619567317775286272(0x401c000000000000, double:7.0)
            r11 = r8
            r11.<init>(r12, r14, r16, r18)
            r9 = 0
            java.lang.String r2 = "on_primary_container"
            r5 = 0
            r7 = 0
            r1 = r10
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9)
            return r10
    }

    public com.google.android.material.color.utilities.DynamicColor onPrimaryFixed() {
            r20 = this;
            r0 = r20
            com.google.android.material.color.utilities.DynamicColor r10 = new com.google.android.material.color.utilities.DynamicColor
            com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda28 r3 = new com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda28
            r3.<init>()
            com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda29 r4 = new com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda29
            r4.<init>()
            com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda30 r6 = new com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda30
            r6.<init>(r0)
            com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda31 r7 = new com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda31
            r7.<init>(r0)
            com.google.android.material.color.utilities.ContrastCurve r8 = new com.google.android.material.color.utilities.ContrastCurve
            r16 = 4622382067542392832(0x4026000000000000, double:11.0)
            r18 = 4626604192193052672(0x4035000000000000, double:21.0)
            r12 = 4616752568008179712(0x4012000000000000, double:4.5)
            r14 = 4619567317775286272(0x401c000000000000, double:7.0)
            r11 = r8
            r11.<init>(r12, r14, r16, r18)
            r9 = 0
            java.lang.String r2 = "on_primary_fixed"
            r5 = 0
            r1 = r10
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9)
            return r10
    }

    public com.google.android.material.color.utilities.DynamicColor onPrimaryFixedVariant() {
            r20 = this;
            r0 = r20
            com.google.android.material.color.utilities.DynamicColor r10 = new com.google.android.material.color.utilities.DynamicColor
            com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda122 r3 = new com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda122
            r3.<init>()
            com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda123 r4 = new com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda123
            r4.<init>()
            com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda124 r6 = new com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda124
            r6.<init>(r0)
            com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda125 r7 = new com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda125
            r7.<init>(r0)
            com.google.android.material.color.utilities.ContrastCurve r8 = new com.google.android.material.color.utilities.ContrastCurve
            r16 = 4619567317775286272(0x401c000000000000, double:7.0)
            r18 = 4622382067542392832(0x4026000000000000, double:11.0)
            r12 = 4613937818241073152(0x4008000000000000, double:3.0)
            r14 = 4616752568008179712(0x4012000000000000, double:4.5)
            r11 = r8
            r11.<init>(r12, r14, r16, r18)
            r9 = 0
            java.lang.String r2 = "on_primary_fixed_variant"
            r5 = 0
            r1 = r10
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9)
            return r10
    }

    public com.google.android.material.color.utilities.DynamicColor onSecondary() {
            r20 = this;
            com.google.android.material.color.utilities.DynamicColor r9 = new com.google.android.material.color.utilities.DynamicColor
            com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda1 r2 = new com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda1
            r2.<init>()
            com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda2 r3 = new com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda2
            r3.<init>()
            com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda3 r5 = new com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda3
            r10 = r20
            r5.<init>(r10)
            com.google.android.material.color.utilities.ContrastCurve r7 = new com.google.android.material.color.utilities.ContrastCurve
            r16 = 4622382067542392832(0x4026000000000000, double:11.0)
            r18 = 4626604192193052672(0x4035000000000000, double:21.0)
            r12 = 4616752568008179712(0x4012000000000000, double:4.5)
            r14 = 4619567317775286272(0x401c000000000000, double:7.0)
            r11 = r7
            r11.<init>(r12, r14, r16, r18)
            r8 = 0
            java.lang.String r1 = "on_secondary"
            r4 = 0
            r6 = 0
            r0 = r9
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            return r9
    }

    public com.google.android.material.color.utilities.DynamicColor onSecondaryContainer() {
            r20 = this;
            r0 = r20
            com.google.android.material.color.utilities.DynamicColor r10 = new com.google.android.material.color.utilities.DynamicColor
            com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda25 r3 = new com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda25
            r3.<init>()
            com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda26 r4 = new com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda26
            r4.<init>(r0)
            com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda27 r6 = new com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda27
            r6.<init>(r0)
            com.google.android.material.color.utilities.ContrastCurve r8 = new com.google.android.material.color.utilities.ContrastCurve
            r16 = 4622382067542392832(0x4026000000000000, double:11.0)
            r18 = 4626604192193052672(0x4035000000000000, double:21.0)
            r12 = 4616752568008179712(0x4012000000000000, double:4.5)
            r14 = 4619567317775286272(0x401c000000000000, double:7.0)
            r11 = r8
            r11.<init>(r12, r14, r16, r18)
            r9 = 0
            java.lang.String r2 = "on_secondary_container"
            r5 = 0
            r7 = 0
            r1 = r10
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9)
            return r10
    }

    public com.google.android.material.color.utilities.DynamicColor onSecondaryFixed() {
            r20 = this;
            r0 = r20
            com.google.android.material.color.utilities.DynamicColor r10 = new com.google.android.material.color.utilities.DynamicColor
            com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda14 r3 = new com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda14
            r3.<init>()
            com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda15 r4 = new com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda15
            r4.<init>()
            com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda16 r6 = new com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda16
            r6.<init>(r0)
            com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda17 r7 = new com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda17
            r7.<init>(r0)
            com.google.android.material.color.utilities.ContrastCurve r8 = new com.google.android.material.color.utilities.ContrastCurve
            r16 = 4622382067542392832(0x4026000000000000, double:11.0)
            r18 = 4626604192193052672(0x4035000000000000, double:21.0)
            r12 = 4616752568008179712(0x4012000000000000, double:4.5)
            r14 = 4619567317775286272(0x401c000000000000, double:7.0)
            r11 = r8
            r11.<init>(r12, r14, r16, r18)
            r9 = 0
            java.lang.String r2 = "on_secondary_fixed"
            r5 = 0
            r1 = r10
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9)
            return r10
    }

    public com.google.android.material.color.utilities.DynamicColor onSecondaryFixedVariant() {
            r20 = this;
            r0 = r20
            com.google.android.material.color.utilities.DynamicColor r10 = new com.google.android.material.color.utilities.DynamicColor
            com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda62 r3 = new com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda62
            r3.<init>()
            com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda63 r4 = new com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda63
            r4.<init>()
            com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda64 r6 = new com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda64
            r6.<init>(r0)
            com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda65 r7 = new com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda65
            r7.<init>(r0)
            com.google.android.material.color.utilities.ContrastCurve r8 = new com.google.android.material.color.utilities.ContrastCurve
            r16 = 4619567317775286272(0x401c000000000000, double:7.0)
            r18 = 4622382067542392832(0x4026000000000000, double:11.0)
            r12 = 4613937818241073152(0x4008000000000000, double:3.0)
            r14 = 4616752568008179712(0x4012000000000000, double:4.5)
            r11 = r8
            r11.<init>(r12, r14, r16, r18)
            r9 = 0
            java.lang.String r2 = "on_secondary_fixed_variant"
            r5 = 0
            r1 = r10
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9)
            return r10
    }

    public com.google.android.material.color.utilities.DynamicColor onSurface() {
            r20 = this;
            com.google.android.material.color.utilities.DynamicColor r9 = new com.google.android.material.color.utilities.DynamicColor
            com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda140 r2 = new com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda140
            r2.<init>()
            com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda151 r3 = new com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda151
            r3.<init>()
            com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda162 r5 = new com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda162
            r10 = r20
            r5.<init>(r10)
            com.google.android.material.color.utilities.ContrastCurve r7 = new com.google.android.material.color.utilities.ContrastCurve
            r16 = 4622382067542392832(0x4026000000000000, double:11.0)
            r18 = 4626604192193052672(0x4035000000000000, double:21.0)
            r12 = 4616752568008179712(0x4012000000000000, double:4.5)
            r14 = 4619567317775286272(0x401c000000000000, double:7.0)
            r11 = r7
            r11.<init>(r12, r14, r16, r18)
            r8 = 0
            java.lang.String r1 = "on_surface"
            r4 = 0
            r6 = 0
            r0 = r9
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            return r9
    }

    public com.google.android.material.color.utilities.DynamicColor onSurfaceVariant() {
            r20 = this;
            com.google.android.material.color.utilities.DynamicColor r9 = new com.google.android.material.color.utilities.DynamicColor
            com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda40 r2 = new com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda40
            r2.<init>()
            com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda41 r3 = new com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda41
            r3.<init>()
            com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda162 r5 = new com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda162
            r10 = r20
            r5.<init>(r10)
            com.google.android.material.color.utilities.ContrastCurve r7 = new com.google.android.material.color.utilities.ContrastCurve
            r16 = 4619567317775286272(0x401c000000000000, double:7.0)
            r18 = 4622382067542392832(0x4026000000000000, double:11.0)
            r12 = 4613937818241073152(0x4008000000000000, double:3.0)
            r14 = 4616752568008179712(0x4012000000000000, double:4.5)
            r11 = r7
            r11.<init>(r12, r14, r16, r18)
            r8 = 0
            java.lang.String r1 = "on_surface_variant"
            r4 = 0
            r6 = 0
            r0 = r9
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            return r9
    }

    public com.google.android.material.color.utilities.DynamicColor onTertiary() {
            r20 = this;
            com.google.android.material.color.utilities.DynamicColor r9 = new com.google.android.material.color.utilities.DynamicColor
            com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda107 r2 = new com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda107
            r2.<init>()
            com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda118 r3 = new com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda118
            r3.<init>()
            com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda129 r5 = new com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda129
            r10 = r20
            r5.<init>(r10)
            com.google.android.material.color.utilities.ContrastCurve r7 = new com.google.android.material.color.utilities.ContrastCurve
            r16 = 4622382067542392832(0x4026000000000000, double:11.0)
            r18 = 4626604192193052672(0x4035000000000000, double:21.0)
            r12 = 4616752568008179712(0x4012000000000000, double:4.5)
            r14 = 4619567317775286272(0x401c000000000000, double:7.0)
            r11 = r7
            r11.<init>(r12, r14, r16, r18)
            r8 = 0
            java.lang.String r1 = "on_tertiary"
            r4 = 0
            r6 = 0
            r0 = r9
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            return r9
    }

    public com.google.android.material.color.utilities.DynamicColor onTertiaryContainer() {
            r20 = this;
            r0 = r20
            com.google.android.material.color.utilities.DynamicColor r10 = new com.google.android.material.color.utilities.DynamicColor
            com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda21 r3 = new com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda21
            r3.<init>()
            com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda23 r4 = new com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda23
            r4.<init>(r0)
            com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda24 r6 = new com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda24
            r6.<init>(r0)
            com.google.android.material.color.utilities.ContrastCurve r8 = new com.google.android.material.color.utilities.ContrastCurve
            r16 = 4622382067542392832(0x4026000000000000, double:11.0)
            r18 = 4626604192193052672(0x4035000000000000, double:21.0)
            r12 = 4616752568008179712(0x4012000000000000, double:4.5)
            r14 = 4619567317775286272(0x401c000000000000, double:7.0)
            r11 = r8
            r11.<init>(r12, r14, r16, r18)
            r9 = 0
            java.lang.String r2 = "on_tertiary_container"
            r5 = 0
            r7 = 0
            r1 = r10
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9)
            return r10
    }

    public com.google.android.material.color.utilities.DynamicColor onTertiaryFixed() {
            r20 = this;
            r0 = r20
            com.google.android.material.color.utilities.DynamicColor r10 = new com.google.android.material.color.utilities.DynamicColor
            com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda87 r3 = new com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda87
            r3.<init>()
            com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda88 r4 = new com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda88
            r4.<init>()
            com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda89 r6 = new com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda89
            r6.<init>(r0)
            com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda90 r7 = new com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda90
            r7.<init>(r0)
            com.google.android.material.color.utilities.ContrastCurve r8 = new com.google.android.material.color.utilities.ContrastCurve
            r16 = 4622382067542392832(0x4026000000000000, double:11.0)
            r18 = 4626604192193052672(0x4035000000000000, double:21.0)
            r12 = 4616752568008179712(0x4012000000000000, double:4.5)
            r14 = 4619567317775286272(0x401c000000000000, double:7.0)
            r11 = r8
            r11.<init>(r12, r14, r16, r18)
            r9 = 0
            java.lang.String r2 = "on_tertiary_fixed"
            r5 = 0
            r1 = r10
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9)
            return r10
    }

    public com.google.android.material.color.utilities.DynamicColor onTertiaryFixedVariant() {
            r20 = this;
            r0 = r20
            com.google.android.material.color.utilities.DynamicColor r10 = new com.google.android.material.color.utilities.DynamicColor
            com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda75 r3 = new com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda75
            r3.<init>()
            com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda76 r4 = new com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda76
            r4.<init>()
            com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda77 r6 = new com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda77
            r6.<init>(r0)
            com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda78 r7 = new com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda78
            r7.<init>(r0)
            com.google.android.material.color.utilities.ContrastCurve r8 = new com.google.android.material.color.utilities.ContrastCurve
            r16 = 4619567317775286272(0x401c000000000000, double:7.0)
            r18 = 4622382067542392832(0x4026000000000000, double:11.0)
            r12 = 4613937818241073152(0x4008000000000000, double:3.0)
            r14 = 4616752568008179712(0x4012000000000000, double:4.5)
            r11 = r8
            r11.<init>(r12, r14, r16, r18)
            r9 = 0
            java.lang.String r2 = "on_tertiary_fixed_variant"
            r5 = 0
            r1 = r10
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9)
            return r10
    }

    public com.google.android.material.color.utilities.DynamicColor outline() {
            r20 = this;
            com.google.android.material.color.utilities.DynamicColor r9 = new com.google.android.material.color.utilities.DynamicColor
            com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda9 r2 = new com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda9
            r2.<init>()
            com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda10 r3 = new com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda10
            r3.<init>()
            com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda162 r5 = new com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda162
            r10 = r20
            r5.<init>(r10)
            com.google.android.material.color.utilities.ContrastCurve r7 = new com.google.android.material.color.utilities.ContrastCurve
            r16 = 4616752568008179712(0x4012000000000000, double:4.5)
            r18 = 4619567317775286272(0x401c000000000000, double:7.0)
            r12 = 4609434218613702656(0x3ff8000000000000, double:1.5)
            r14 = 4613937818241073152(0x4008000000000000, double:3.0)
            r11 = r7
            r11.<init>(r12, r14, r16, r18)
            r8 = 0
            java.lang.String r1 = "outline"
            r4 = 0
            r6 = 0
            r0 = r9
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            return r9
    }

    public com.google.android.material.color.utilities.DynamicColor outlineVariant() {
            r20 = this;
            com.google.android.material.color.utilities.DynamicColor r9 = new com.google.android.material.color.utilities.DynamicColor
            com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda108 r2 = new com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda108
            r2.<init>()
            com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda109 r3 = new com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda109
            r3.<init>()
            com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda162 r5 = new com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda162
            r10 = r20
            r5.<init>(r10)
            com.google.android.material.color.utilities.ContrastCurve r7 = new com.google.android.material.color.utilities.ContrastCurve
            r16 = 4613937818241073152(0x4008000000000000, double:3.0)
            r18 = 4619567317775286272(0x401c000000000000, double:7.0)
            r12 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            r14 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            r11 = r7
            r11.<init>(r12, r14, r16, r18)
            r8 = 0
            java.lang.String r1 = "outline_variant"
            r4 = 0
            r6 = 0
            r0 = r9
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            return r9
    }

    public com.google.android.material.color.utilities.DynamicColor primary() {
            r20 = this;
            r0 = r20
            com.google.android.material.color.utilities.DynamicColor r10 = new com.google.android.material.color.utilities.DynamicColor
            com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda57 r3 = new com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda57
            r3.<init>()
            com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda58 r4 = new com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda58
            r4.<init>()
            com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda162 r6 = new com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda162
            r6.<init>(r0)
            com.google.android.material.color.utilities.ContrastCurve r8 = new com.google.android.material.color.utilities.ContrastCurve
            r16 = 4619567317775286272(0x401c000000000000, double:7.0)
            r18 = 4622382067542392832(0x4026000000000000, double:11.0)
            r12 = 4613937818241073152(0x4008000000000000, double:3.0)
            r14 = 4616752568008179712(0x4012000000000000, double:4.5)
            r11 = r8
            r11.<init>(r12, r14, r16, r18)
            com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda59 r9 = new com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda59
            r9.<init>(r0)
            java.lang.String r2 = "primary"
            r5 = 1
            r7 = 0
            r1 = r10
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9)
            return r10
    }

    public com.google.android.material.color.utilities.DynamicColor primaryContainer() {
            r20 = this;
            r0 = r20
            com.google.android.material.color.utilities.DynamicColor r10 = new com.google.android.material.color.utilities.DynamicColor
            com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda97 r3 = new com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda97
            r3.<init>()
            com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda98 r4 = new com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda98
            r4.<init>()
            com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda162 r6 = new com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda162
            r6.<init>(r0)
            com.google.android.material.color.utilities.ContrastCurve r8 = new com.google.android.material.color.utilities.ContrastCurve
            r16 = 4613937818241073152(0x4008000000000000, double:3.0)
            r18 = 4619567317775286272(0x401c000000000000, double:7.0)
            r12 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            r14 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            r11 = r8
            r11.<init>(r12, r14, r16, r18)
            com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda99 r9 = new com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda99
            r9.<init>(r0)
            java.lang.String r2 = "primary_container"
            r5 = 1
            r7 = 0
            r1 = r10
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9)
            return r10
    }

    public com.google.android.material.color.utilities.DynamicColor primaryFixed() {
            r20 = this;
            r0 = r20
            com.google.android.material.color.utilities.DynamicColor r10 = new com.google.android.material.color.utilities.DynamicColor
            com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda153 r3 = new com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda153
            r3.<init>()
            com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda154 r4 = new com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda154
            r4.<init>()
            com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda162 r6 = new com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda162
            r6.<init>(r0)
            com.google.android.material.color.utilities.ContrastCurve r8 = new com.google.android.material.color.utilities.ContrastCurve
            r16 = 4613937818241073152(0x4008000000000000, double:3.0)
            r18 = 4619567317775286272(0x401c000000000000, double:7.0)
            r12 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            r14 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            r11 = r8
            r11.<init>(r12, r14, r16, r18)
            com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda155 r9 = new com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda155
            r9.<init>(r0)
            java.lang.String r2 = "primary_fixed"
            r5 = 1
            r7 = 0
            r1 = r10
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9)
            return r10
    }

    public com.google.android.material.color.utilities.DynamicColor primaryFixedDim() {
            r20 = this;
            r0 = r20
            com.google.android.material.color.utilities.DynamicColor r10 = new com.google.android.material.color.utilities.DynamicColor
            com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda156 r3 = new com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda156
            r3.<init>()
            com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda157 r4 = new com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda157
            r4.<init>()
            com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda162 r6 = new com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda162
            r6.<init>(r0)
            com.google.android.material.color.utilities.ContrastCurve r8 = new com.google.android.material.color.utilities.ContrastCurve
            r16 = 4613937818241073152(0x4008000000000000, double:3.0)
            r18 = 4619567317775286272(0x401c000000000000, double:7.0)
            r12 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            r14 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            r11 = r8
            r11.<init>(r12, r14, r16, r18)
            com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda158 r9 = new com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda158
            r9.<init>(r0)
            java.lang.String r2 = "primary_fixed_dim"
            r5 = 1
            r7 = 0
            r1 = r10
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9)
            return r10
    }

    public com.google.android.material.color.utilities.DynamicColor primaryPaletteKeyColor() {
            r3 = this;
            com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda72 r0 = new com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda72
            r0.<init>()
            com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda73 r1 = new com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda73
            r1.<init>()
            java.lang.String r2 = "primary_palette_key_color"
            com.google.android.material.color.utilities.DynamicColor r0 = com.google.android.material.color.utilities.DynamicColor.fromPalette(r2, r0, r1)
            return r0
    }

    public com.google.android.material.color.utilities.DynamicColor scrim() {
            r10 = this;
            com.google.android.material.color.utilities.DynamicColor r9 = new com.google.android.material.color.utilities.DynamicColor
            com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda60 r2 = new com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda60
            r2.<init>()
            com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda61 r3 = new com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda61
            r3.<init>()
            r7 = 0
            r8 = 0
            java.lang.String r1 = "scrim"
            r4 = 0
            r5 = 0
            r6 = 0
            r0 = r9
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            return r9
    }

    public com.google.android.material.color.utilities.DynamicColor secondary() {
            r20 = this;
            r0 = r20
            com.google.android.material.color.utilities.DynamicColor r10 = new com.google.android.material.color.utilities.DynamicColor
            com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda4 r3 = new com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda4
            r3.<init>()
            com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda5 r4 = new com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda5
            r4.<init>()
            com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda162 r6 = new com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda162
            r6.<init>(r0)
            com.google.android.material.color.utilities.ContrastCurve r8 = new com.google.android.material.color.utilities.ContrastCurve
            r16 = 4619567317775286272(0x401c000000000000, double:7.0)
            r18 = 4622382067542392832(0x4026000000000000, double:11.0)
            r12 = 4613937818241073152(0x4008000000000000, double:3.0)
            r14 = 4616752568008179712(0x4012000000000000, double:4.5)
            r11 = r8
            r11.<init>(r12, r14, r16, r18)
            com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda6 r9 = new com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda6
            r9.<init>(r0)
            java.lang.String r2 = "secondary"
            r5 = 1
            r7 = 0
            r1 = r10
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9)
            return r10
    }

    public com.google.android.material.color.utilities.DynamicColor secondaryContainer() {
            r20 = this;
            r0 = r20
            com.google.android.material.color.utilities.DynamicColor r10 = new com.google.android.material.color.utilities.DynamicColor
            com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda83 r3 = new com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda83
            r3.<init>()
            com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda84 r4 = new com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda84
            r4.<init>()
            com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda162 r6 = new com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda162
            r6.<init>(r0)
            com.google.android.material.color.utilities.ContrastCurve r8 = new com.google.android.material.color.utilities.ContrastCurve
            r16 = 4613937818241073152(0x4008000000000000, double:3.0)
            r18 = 4619567317775286272(0x401c000000000000, double:7.0)
            r12 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            r14 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            r11 = r8
            r11.<init>(r12, r14, r16, r18)
            com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda86 r9 = new com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda86
            r9.<init>(r0)
            java.lang.String r2 = "secondary_container"
            r5 = 1
            r7 = 0
            r1 = r10
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9)
            return r10
    }

    public com.google.android.material.color.utilities.DynamicColor secondaryFixed() {
            r20 = this;
            r0 = r20
            com.google.android.material.color.utilities.DynamicColor r10 = new com.google.android.material.color.utilities.DynamicColor
            com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda119 r3 = new com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda119
            r3.<init>()
            com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda120 r4 = new com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda120
            r4.<init>()
            com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda162 r6 = new com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda162
            r6.<init>(r0)
            com.google.android.material.color.utilities.ContrastCurve r8 = new com.google.android.material.color.utilities.ContrastCurve
            r16 = 4613937818241073152(0x4008000000000000, double:3.0)
            r18 = 4619567317775286272(0x401c000000000000, double:7.0)
            r12 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            r14 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            r11 = r8
            r11.<init>(r12, r14, r16, r18)
            com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda121 r9 = new com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda121
            r9.<init>(r0)
            java.lang.String r2 = "secondary_fixed"
            r5 = 1
            r7 = 0
            r1 = r10
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9)
            return r10
    }

    public com.google.android.material.color.utilities.DynamicColor secondaryFixedDim() {
            r20 = this;
            r0 = r20
            com.google.android.material.color.utilities.DynamicColor r10 = new com.google.android.material.color.utilities.DynamicColor
            com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda138 r3 = new com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda138
            r3.<init>()
            com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda139 r4 = new com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda139
            r4.<init>()
            com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda162 r6 = new com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda162
            r6.<init>(r0)
            com.google.android.material.color.utilities.ContrastCurve r8 = new com.google.android.material.color.utilities.ContrastCurve
            r16 = 4613937818241073152(0x4008000000000000, double:3.0)
            r18 = 4619567317775286272(0x401c000000000000, double:7.0)
            r12 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            r14 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            r11 = r8
            r11.<init>(r12, r14, r16, r18)
            com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda141 r9 = new com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda141
            r9.<init>(r0)
            java.lang.String r2 = "secondary_fixed_dim"
            r5 = 1
            r7 = 0
            r1 = r10
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9)
            return r10
    }

    public com.google.android.material.color.utilities.DynamicColor secondaryPaletteKeyColor() {
            r3 = this;
            com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda79 r0 = new com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda79
            r0.<init>()
            com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda80 r1 = new com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda80
            r1.<init>()
            java.lang.String r2 = "secondary_palette_key_color"
            com.google.android.material.color.utilities.DynamicColor r0 = com.google.android.material.color.utilities.DynamicColor.fromPalette(r2, r0, r1)
            return r0
    }

    public com.google.android.material.color.utilities.DynamicColor shadow() {
            r10 = this;
            com.google.android.material.color.utilities.DynamicColor r9 = new com.google.android.material.color.utilities.DynamicColor
            com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda148 r2 = new com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda148
            r2.<init>()
            com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda149 r3 = new com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda149
            r3.<init>()
            r7 = 0
            r8 = 0
            java.lang.String r1 = "shadow"
            r4 = 0
            r5 = 0
            r6 = 0
            r0 = r9
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            return r9
    }

    public com.google.android.material.color.utilities.DynamicColor surface() {
            r10 = this;
            com.google.android.material.color.utilities.DynamicColor r9 = new com.google.android.material.color.utilities.DynamicColor
            com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda0 r2 = new com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda0
            r2.<init>()
            com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda74 r3 = new com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda74
            r3.<init>()
            r7 = 0
            r8 = 0
            java.lang.String r1 = "surface"
            r4 = 1
            r5 = 0
            r6 = 0
            r0 = r9
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            return r9
    }

    public com.google.android.material.color.utilities.DynamicColor surfaceBright() {
            r10 = this;
            com.google.android.material.color.utilities.DynamicColor r9 = new com.google.android.material.color.utilities.DynamicColor
            com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda110 r2 = new com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda110
            r2.<init>()
            com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda111 r3 = new com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda111
            r3.<init>()
            r7 = 0
            r8 = 0
            java.lang.String r1 = "surface_bright"
            r4 = 1
            r5 = 0
            r6 = 0
            r0 = r9
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            return r9
    }

    public com.google.android.material.color.utilities.DynamicColor surfaceContainer() {
            r10 = this;
            com.google.android.material.color.utilities.DynamicColor r9 = new com.google.android.material.color.utilities.DynamicColor
            com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda38 r2 = new com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda38
            r2.<init>()
            com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda39 r3 = new com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda39
            r3.<init>()
            r7 = 0
            r8 = 0
            java.lang.String r1 = "surface_container"
            r4 = 1
            r5 = 0
            r6 = 0
            r0 = r9
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            return r9
    }

    public com.google.android.material.color.utilities.DynamicColor surfaceContainerHigh() {
            r10 = this;
            com.google.android.material.color.utilities.DynamicColor r9 = new com.google.android.material.color.utilities.DynamicColor
            com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda102 r2 = new com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda102
            r2.<init>()
            com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda103 r3 = new com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda103
            r3.<init>()
            r7 = 0
            r8 = 0
            java.lang.String r1 = "surface_container_high"
            r4 = 1
            r5 = 0
            r6 = 0
            r0 = r9
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            return r9
    }

    public com.google.android.material.color.utilities.DynamicColor surfaceContainerHighest() {
            r10 = this;
            com.google.android.material.color.utilities.DynamicColor r9 = new com.google.android.material.color.utilities.DynamicColor
            com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda150 r2 = new com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda150
            r2.<init>()
            com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda152 r3 = new com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda152
            r3.<init>()
            r7 = 0
            r8 = 0
            java.lang.String r1 = "surface_container_highest"
            r4 = 1
            r5 = 0
            r6 = 0
            r0 = r9
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            return r9
    }

    public com.google.android.material.color.utilities.DynamicColor surfaceContainerLow() {
            r10 = this;
            com.google.android.material.color.utilities.DynamicColor r9 = new com.google.android.material.color.utilities.DynamicColor
            com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda81 r2 = new com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda81
            r2.<init>()
            com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda82 r3 = new com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda82
            r3.<init>()
            r7 = 0
            r8 = 0
            java.lang.String r1 = "surface_container_low"
            r4 = 1
            r5 = 0
            r6 = 0
            r0 = r9
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            return r9
    }

    public com.google.android.material.color.utilities.DynamicColor surfaceContainerLowest() {
            r10 = this;
            com.google.android.material.color.utilities.DynamicColor r9 = new com.google.android.material.color.utilities.DynamicColor
            com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda7 r2 = new com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda7
            r2.<init>()
            com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda8 r3 = new com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda8
            r3.<init>()
            r7 = 0
            r8 = 0
            java.lang.String r1 = "surface_container_lowest"
            r4 = 1
            r5 = 0
            r6 = 0
            r0 = r9
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            return r9
    }

    public com.google.android.material.color.utilities.DynamicColor surfaceDim() {
            r10 = this;
            com.google.android.material.color.utilities.DynamicColor r9 = new com.google.android.material.color.utilities.DynamicColor
            com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda33 r2 = new com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda33
            r2.<init>()
            com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda44 r3 = new com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda44
            r3.<init>()
            r7 = 0
            r8 = 0
            java.lang.String r1 = "surface_dim"
            r4 = 1
            r5 = 0
            r6 = 0
            r0 = r9
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            return r9
    }

    public com.google.android.material.color.utilities.DynamicColor surfaceTint() {
            r10 = this;
            com.google.android.material.color.utilities.DynamicColor r9 = new com.google.android.material.color.utilities.DynamicColor
            com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda12 r2 = new com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda12
            r2.<init>()
            com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda13 r3 = new com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda13
            r3.<init>()
            r7 = 0
            r8 = 0
            java.lang.String r1 = "surface_tint"
            r4 = 1
            r5 = 0
            r6 = 0
            r0 = r9
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            return r9
    }

    public com.google.android.material.color.utilities.DynamicColor surfaceVariant() {
            r10 = this;
            com.google.android.material.color.utilities.DynamicColor r9 = new com.google.android.material.color.utilities.DynamicColor
            com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda142 r2 = new com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda142
            r2.<init>()
            com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda143 r3 = new com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda143
            r3.<init>()
            r7 = 0
            r8 = 0
            java.lang.String r1 = "surface_variant"
            r4 = 1
            r5 = 0
            r6 = 0
            r0 = r9
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            return r9
    }

    public com.google.android.material.color.utilities.DynamicColor tertiary() {
            r20 = this;
            r0 = r20
            com.google.android.material.color.utilities.DynamicColor r10 = new com.google.android.material.color.utilities.DynamicColor
            com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda67 r3 = new com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda67
            r3.<init>()
            com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda68 r4 = new com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda68
            r4.<init>()
            com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda162 r6 = new com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda162
            r6.<init>(r0)
            com.google.android.material.color.utilities.ContrastCurve r8 = new com.google.android.material.color.utilities.ContrastCurve
            r16 = 4619567317775286272(0x401c000000000000, double:7.0)
            r18 = 4622382067542392832(0x4026000000000000, double:11.0)
            r12 = 4613937818241073152(0x4008000000000000, double:3.0)
            r14 = 4616752568008179712(0x4012000000000000, double:4.5)
            r11 = r8
            r11.<init>(r12, r14, r16, r18)
            com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda69 r9 = new com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda69
            r9.<init>(r0)
            java.lang.String r2 = "tertiary"
            r5 = 1
            r7 = 0
            r1 = r10
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9)
            return r10
    }

    public com.google.android.material.color.utilities.DynamicColor tertiaryContainer() {
            r20 = this;
            r0 = r20
            com.google.android.material.color.utilities.DynamicColor r10 = new com.google.android.material.color.utilities.DynamicColor
            com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda159 r3 = new com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda159
            r3.<init>()
            com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda160 r4 = new com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda160
            r4.<init>()
            com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda162 r6 = new com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda162
            r6.<init>(r0)
            com.google.android.material.color.utilities.ContrastCurve r8 = new com.google.android.material.color.utilities.ContrastCurve
            r16 = 4613937818241073152(0x4008000000000000, double:3.0)
            r18 = 4619567317775286272(0x401c000000000000, double:7.0)
            r12 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            r14 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            r11 = r8
            r11.<init>(r12, r14, r16, r18)
            com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda161 r9 = new com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda161
            r9.<init>(r0)
            java.lang.String r2 = "tertiary_container"
            r5 = 1
            r7 = 0
            r1 = r10
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9)
            return r10
    }

    public com.google.android.material.color.utilities.DynamicColor tertiaryFixed() {
            r20 = this;
            r0 = r20
            com.google.android.material.color.utilities.DynamicColor r10 = new com.google.android.material.color.utilities.DynamicColor
            com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda53 r3 = new com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda53
            r3.<init>()
            com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda54 r4 = new com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda54
            r4.<init>()
            com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda162 r6 = new com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda162
            r6.<init>(r0)
            com.google.android.material.color.utilities.ContrastCurve r8 = new com.google.android.material.color.utilities.ContrastCurve
            r16 = 4613937818241073152(0x4008000000000000, double:3.0)
            r18 = 4619567317775286272(0x401c000000000000, double:7.0)
            r12 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            r14 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            r11 = r8
            r11.<init>(r12, r14, r16, r18)
            com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda56 r9 = new com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda56
            r9.<init>(r0)
            java.lang.String r2 = "tertiary_fixed"
            r5 = 1
            r7 = 0
            r1 = r10
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9)
            return r10
    }

    public com.google.android.material.color.utilities.DynamicColor tertiaryFixedDim() {
            r20 = this;
            r0 = r20
            com.google.android.material.color.utilities.DynamicColor r10 = new com.google.android.material.color.utilities.DynamicColor
            com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda126 r3 = new com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda126
            r3.<init>()
            com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda127 r4 = new com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda127
            r4.<init>()
            com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda162 r6 = new com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda162
            r6.<init>(r0)
            com.google.android.material.color.utilities.ContrastCurve r8 = new com.google.android.material.color.utilities.ContrastCurve
            r16 = 4613937818241073152(0x4008000000000000, double:3.0)
            r18 = 4619567317775286272(0x401c000000000000, double:7.0)
            r12 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            r14 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            r11 = r8
            r11.<init>(r12, r14, r16, r18)
            com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda128 r9 = new com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda128
            r9.<init>(r0)
            java.lang.String r2 = "tertiary_fixed_dim"
            r5 = 1
            r7 = 0
            r1 = r10
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9)
            return r10
    }

    public com.google.android.material.color.utilities.DynamicColor tertiaryPaletteKeyColor() {
            r3 = this;
            com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda91 r0 = new com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda91
            r0.<init>()
            com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda92 r1 = new com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda92
            r1.<init>()
            java.lang.String r2 = "tertiary_palette_key_color"
            com.google.android.material.color.utilities.DynamicColor r0 = com.google.android.material.color.utilities.DynamicColor.fromPalette(r2, r0, r1)
            return r0
    }

    public com.google.android.material.color.utilities.DynamicColor textHintInverse() {
            r3 = this;
            com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda146 r0 = new com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda146
            r0.<init>()
            com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda147 r1 = new com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda147
            r1.<init>()
            java.lang.String r2 = "text_hint_inverse"
            com.google.android.material.color.utilities.DynamicColor r0 = com.google.android.material.color.utilities.DynamicColor.fromPalette(r2, r0, r1)
            return r0
    }

    public com.google.android.material.color.utilities.DynamicColor textPrimaryInverse() {
            r3 = this;
            com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda36 r0 = new com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda36
            r0.<init>()
            com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda37 r1 = new com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda37
            r1.<init>()
            java.lang.String r2 = "text_primary_inverse"
            com.google.android.material.color.utilities.DynamicColor r0 = com.google.android.material.color.utilities.DynamicColor.fromPalette(r2, r0, r1)
            return r0
    }

    public com.google.android.material.color.utilities.DynamicColor textPrimaryInverseDisableOnly() {
            r3 = this;
            com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda133 r0 = new com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda133
            r0.<init>()
            com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda134 r1 = new com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda134
            r1.<init>()
            java.lang.String r2 = "text_primary_inverse_disable_only"
            com.google.android.material.color.utilities.DynamicColor r0 = com.google.android.material.color.utilities.DynamicColor.fromPalette(r2, r0, r1)
            return r0
    }

    public com.google.android.material.color.utilities.DynamicColor textSecondaryAndTertiaryInverse() {
            r3 = this;
            com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda48 r0 = new com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda48
            r0.<init>()
            com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda49 r1 = new com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda49
            r1.<init>()
            java.lang.String r2 = "text_secondary_and_tertiary_inverse"
            com.google.android.material.color.utilities.DynamicColor r0 = com.google.android.material.color.utilities.DynamicColor.fromPalette(r2, r0, r1)
            return r0
    }

    public com.google.android.material.color.utilities.DynamicColor textSecondaryAndTertiaryInverseDisabled() {
            r3 = this;
            com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda85 r0 = new com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda85
            r0.<init>()
            com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda96 r1 = new com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda96
            r1.<init>()
            java.lang.String r2 = "text_secondary_and_tertiary_inverse_disabled"
            com.google.android.material.color.utilities.DynamicColor r0 = com.google.android.material.color.utilities.DynamicColor.fromPalette(r2, r0, r1)
            return r0
    }
}
