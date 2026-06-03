package com.google.android.material.elevation;

/* JADX INFO: loaded from: classes.dex */
public class ElevationOverlayProvider {
    private static final float FORMULA_MULTIPLIER = 4.5f;
    private static final float FORMULA_OFFSET = 2.0f;
    private static final int OVERLAY_ACCENT_COLOR_ALPHA = 0;
    private final int colorSurface;
    private final float displayDensity;
    private final int elevationOverlayAccentColor;
    private final int elevationOverlayColor;
    private final boolean elevationOverlayEnabled;

    static {
            r0 = 4617428107952285287(0x4014666666666667, double:5.1000000000000005)
            long r0 = java.lang.Math.round(r0)
            int r0 = (int) r0
            com.google.android.material.elevation.ElevationOverlayProvider.OVERLAY_ACCENT_COLOR_ALPHA = r0
            return
    }

    public ElevationOverlayProvider(android.content.Context r9) {
            r8 = this;
            int r0 = com.google.android.material.R.attr.elevationOverlayEnabled
            r1 = 0
            boolean r3 = com.google.android.material.resources.MaterialAttributes.resolveBoolean(r9, r0, r1)
            int r0 = com.google.android.material.R.attr.elevationOverlayColor
            int r4 = com.google.android.material.color.MaterialColors.getColor(r9, r0, r1)
            int r0 = com.google.android.material.R.attr.elevationOverlayAccentColor
            int r5 = com.google.android.material.color.MaterialColors.getColor(r9, r0, r1)
            int r0 = com.google.android.material.R.attr.colorSurface
            int r6 = com.google.android.material.color.MaterialColors.getColor(r9, r0, r1)
            android.content.res.Resources r9 = r9.getResources()
            android.util.DisplayMetrics r9 = r9.getDisplayMetrics()
            float r7 = r9.density
            r2 = r8
            r2.<init>(r3, r4, r5, r6, r7)
            return
    }

    public ElevationOverlayProvider(boolean r1, int r2, int r3, int r4, float r5) {
            r0 = this;
            r0.<init>()
            r0.elevationOverlayEnabled = r1
            r0.elevationOverlayColor = r2
            r0.elevationOverlayAccentColor = r3
            r0.colorSurface = r4
            r0.displayDensity = r5
            return
    }

    private boolean isThemeSurfaceColor(int r2) {
            r1 = this;
            r0 = 255(0xff, float:3.57E-43)
            int r2 = androidx.core.graphics.ColorUtils.setAlphaComponent(r2, r0)
            int r0 = r1.colorSurface
            if (r2 != r0) goto Lc
            r2 = 1
            goto Ld
        Lc:
            r2 = 0
        Ld:
            return r2
    }

    public int calculateOverlayAlpha(float r2) {
            r1 = this;
            float r2 = r1.calculateOverlayAlphaFraction(r2)
            r0 = 1132396544(0x437f0000, float:255.0)
            float r2 = r2 * r0
            int r2 = java.lang.Math.round(r2)
            return r2
    }

    public float calculateOverlayAlphaFraction(float r4) {
            r3 = this;
            float r0 = r3.displayDensity
            r1 = 0
            int r2 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r2 <= 0) goto L23
            int r2 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r2 > 0) goto Lc
            goto L23
        Lc:
            float r4 = r4 / r0
            double r0 = (double) r4
            double r0 = java.lang.Math.log1p(r0)
            float r4 = (float) r0
            r0 = 1083179008(0x40900000, float:4.5)
            float r4 = r4 * r0
            r0 = 1073741824(0x40000000, float:2.0)
            float r4 = r4 + r0
            r0 = 1120403456(0x42c80000, float:100.0)
            float r4 = r4 / r0
            r0 = 1065353216(0x3f800000, float:1.0)
            float r4 = java.lang.Math.min(r4, r0)
            return r4
        L23:
            return r1
    }

    public int compositeOverlay(int r3, float r4) {
            r2 = this;
            float r4 = r2.calculateOverlayAlphaFraction(r4)
            int r0 = android.graphics.Color.alpha(r3)
            r1 = 255(0xff, float:3.57E-43)
            int r3 = androidx.core.graphics.ColorUtils.setAlphaComponent(r3, r1)
            int r1 = r2.elevationOverlayColor
            int r3 = com.google.android.material.color.MaterialColors.layer(r3, r1, r4)
            r1 = 0
            int r4 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r4 <= 0) goto L27
            int r4 = r2.elevationOverlayAccentColor
            if (r4 == 0) goto L27
            int r1 = com.google.android.material.elevation.ElevationOverlayProvider.OVERLAY_ACCENT_COLOR_ALPHA
            int r4 = androidx.core.graphics.ColorUtils.setAlphaComponent(r4, r1)
            int r3 = com.google.android.material.color.MaterialColors.layer(r3, r4)
        L27:
            int r3 = androidx.core.graphics.ColorUtils.setAlphaComponent(r3, r0)
            return r3
    }

    public int compositeOverlay(int r1, float r2, android.view.View r3) {
            r0 = this;
            float r3 = r0.getParentAbsoluteElevation(r3)
            float r2 = r2 + r3
            int r1 = r0.compositeOverlay(r1, r2)
            return r1
    }

    public int compositeOverlayIfNeeded(int r2, float r3) {
            r1 = this;
            boolean r0 = r1.elevationOverlayEnabled
            if (r0 == 0) goto Le
            boolean r0 = r1.isThemeSurfaceColor(r2)
            if (r0 == 0) goto Le
            int r2 = r1.compositeOverlay(r2, r3)
        Le:
            return r2
    }

    public int compositeOverlayIfNeeded(int r1, float r2, android.view.View r3) {
            r0 = this;
            float r3 = r0.getParentAbsoluteElevation(r3)
            float r2 = r2 + r3
            int r1 = r0.compositeOverlayIfNeeded(r1, r2)
            return r1
    }

    public int compositeOverlayWithThemeSurfaceColorIfNeeded(float r2) {
            r1 = this;
            int r0 = r1.colorSurface
            int r2 = r1.compositeOverlayIfNeeded(r0, r2)
            return r2
    }

    public int compositeOverlayWithThemeSurfaceColorIfNeeded(float r1, android.view.View r2) {
            r0 = this;
            float r2 = r0.getParentAbsoluteElevation(r2)
            float r1 = r1 + r2
            int r1 = r0.compositeOverlayWithThemeSurfaceColorIfNeeded(r1)
            return r1
    }

    public float getParentAbsoluteElevation(android.view.View r1) {
            r0 = this;
            float r1 = com.google.android.material.internal.ViewUtils.getParentAbsoluteElevation(r1)
            return r1
    }

    public int getThemeElevationOverlayColor() {
            r1 = this;
            int r0 = r1.elevationOverlayColor
            return r0
    }

    public int getThemeSurfaceColor() {
            r1 = this;
            int r0 = r1.colorSurface
            return r0
    }

    public boolean isThemeElevationOverlayEnabled() {
            r1 = this;
            boolean r0 = r1.elevationOverlayEnabled
            return r0
    }
}
