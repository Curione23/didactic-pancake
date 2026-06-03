package com.google.android.material.progressindicator;

/* JADX INFO: loaded from: classes.dex */
public abstract class BaseProgressIndicatorSpec {
    public int hideAnimationBehavior;
    public int[] indicatorColors;
    public int indicatorTrackGapSize;
    public int showAnimationBehavior;
    public int trackColor;
    public int trackCornerRadius;
    public int trackThickness;

    protected BaseProgressIndicatorSpec(android.content.Context r9, android.util.AttributeSet r10, int r11, int r12) {
            r8 = this;
            r8.<init>()
            r0 = 0
            int[] r1 = new int[r0]
            r8.indicatorColors = r1
            android.content.res.Resources r1 = r9.getResources()
            int r2 = com.google.android.material.R.dimen.mtrl_progress_track_thickness
            int r1 = r1.getDimensionPixelSize(r2)
            int[] r4 = com.google.android.material.R.styleable.BaseProgressIndicator
            int[] r7 = new int[r0]
            r2 = r9
            r3 = r10
            r5 = r11
            r6 = r12
            android.content.res.TypedArray r10 = com.google.android.material.internal.ThemeEnforcement.obtainStyledAttributes(r2, r3, r4, r5, r6, r7)
            int r11 = com.google.android.material.R.styleable.BaseProgressIndicator_trackThickness
            int r11 = com.google.android.material.resources.MaterialResources.getDimensionPixelSize(r9, r10, r11, r1)
            r8.trackThickness = r11
            int r11 = com.google.android.material.R.styleable.BaseProgressIndicator_trackCornerRadius
            int r11 = com.google.android.material.resources.MaterialResources.getDimensionPixelSize(r9, r10, r11, r0)
            int r12 = r8.trackThickness
            int r12 = r12 / 2
            int r11 = java.lang.Math.min(r11, r12)
            r8.trackCornerRadius = r11
            int r11 = com.google.android.material.R.styleable.BaseProgressIndicator_showAnimationBehavior
            int r11 = r10.getInt(r11, r0)
            r8.showAnimationBehavior = r11
            int r11 = com.google.android.material.R.styleable.BaseProgressIndicator_hideAnimationBehavior
            int r11 = r10.getInt(r11, r0)
            r8.hideAnimationBehavior = r11
            int r11 = com.google.android.material.R.styleable.BaseProgressIndicator_indicatorTrackGapSize
            int r11 = r10.getDimensionPixelSize(r11, r0)
            r8.indicatorTrackGapSize = r11
            r8.loadIndicatorColors(r9, r10)
            r8.loadTrackColor(r9, r10)
            r10.recycle()
            return
    }

    private void loadIndicatorColors(android.content.Context r4, android.content.res.TypedArray r5) {
            r3 = this;
            int r0 = com.google.android.material.R.styleable.BaseProgressIndicator_indicatorColor
            boolean r0 = r5.hasValue(r0)
            r1 = -1
            if (r0 != 0) goto L16
            int r5 = com.google.android.material.R.attr.colorPrimary
            int r4 = com.google.android.material.color.MaterialColors.getColor(r4, r5, r1)
            int[] r4 = new int[]{r4}
            r3.indicatorColors = r4
            return
        L16:
            int r0 = com.google.android.material.R.styleable.BaseProgressIndicator_indicatorColor
            android.util.TypedValue r0 = r5.peekValue(r0)
            int r0 = r0.type
            r2 = 1
            if (r0 == r2) goto L2e
            int r4 = com.google.android.material.R.styleable.BaseProgressIndicator_indicatorColor
            int r4 = r5.getColor(r4, r1)
            int[] r4 = new int[]{r4}
            r3.indicatorColors = r4
            return
        L2e:
            android.content.res.Resources r4 = r4.getResources()
            int r0 = com.google.android.material.R.styleable.BaseProgressIndicator_indicatorColor
            int r5 = r5.getResourceId(r0, r1)
            int[] r4 = r4.getIntArray(r5)
            r3.indicatorColors = r4
            int r4 = r4.length
            if (r4 == 0) goto L42
            return
        L42:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r5 = "indicatorColors cannot be empty when indicatorColor is not used."
            r4.<init>(r5)
            throw r4
    }

    private void loadTrackColor(android.content.Context r2, android.content.res.TypedArray r3) {
            r1 = this;
            int r0 = com.google.android.material.R.styleable.BaseProgressIndicator_trackColor
            boolean r0 = r3.hasValue(r0)
            if (r0 == 0) goto L12
            int r2 = com.google.android.material.R.styleable.BaseProgressIndicator_trackColor
            r0 = -1
            int r2 = r3.getColor(r2, r0)
            r1.trackColor = r2
            return
        L12:
            int[] r3 = r1.indicatorColors
            r0 = 0
            r3 = r3[r0]
            r1.trackColor = r3
            android.content.res.Resources$Theme r2 = r2.getTheme()
            r3 = 16842803(0x1010033, float:2.36937E-38)
            int[] r3 = new int[]{r3}
            android.content.res.TypedArray r2 = r2.obtainStyledAttributes(r3)
            r3 = 1045220557(0x3e4ccccd, float:0.2)
            float r3 = r2.getFloat(r0, r3)
            r2.recycle()
            r2 = 1132396544(0x437f0000, float:255.0)
            float r3 = r3 * r2
            int r2 = (int) r3
            int r3 = r1.trackColor
            int r2 = com.google.android.material.color.MaterialColors.compositeARGBWithAlpha(r3, r2)
            r1.trackColor = r2
            return
    }

    public boolean isHideAnimationEnabled() {
            r1 = this;
            int r0 = r1.hideAnimationBehavior
            if (r0 == 0) goto L6
            r0 = 1
            goto L7
        L6:
            r0 = 0
        L7:
            return r0
    }

    public boolean isShowAnimationEnabled() {
            r1 = this;
            int r0 = r1.showAnimationBehavior
            if (r0 == 0) goto L6
            r0 = 1
            goto L7
        L6:
            r0 = 0
        L7:
            return r0
    }

    void validateSpec() {
            r2 = this;
            int r0 = r2.indicatorTrackGapSize
            if (r0 < 0) goto L5
            return
        L5:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "indicatorTrackGapSize must be >= 0."
            r0.<init>(r1)
            throw r0
    }
}
