package com.google.android.material.motion;

/* JADX INFO: loaded from: classes.dex */
public class MaterialMainContainerBackHelper extends com.google.android.material.motion.MaterialBackAnimationHelper<android.view.View> {
    private static final float MIN_SCALE = 0.9f;
    private java.lang.Integer expandedCornerSize;
    private android.graphics.Rect initialHideFromClipBounds;
    private android.graphics.Rect initialHideToClipBounds;
    private float initialTouchY;
    private final float maxTranslationY;
    private final float minEdgeGap;


    public MaterialMainContainerBackHelper(android.view.View r2) {
            r1 = this;
            r1.<init>(r2)
            android.content.res.Resources r2 = r2.getResources()
            int r0 = com.google.android.material.R.dimen.m3_back_progress_main_container_min_edge_gap
            float r0 = r2.getDimension(r0)
            r1.minEdgeGap = r0
            int r0 = com.google.android.material.R.dimen.m3_back_progress_main_container_max_translation_y
            float r2 = r2.getDimension(r0)
            r1.maxTranslationY = r2
            return
    }

    private android.animation.ValueAnimator createCornerAnimator(com.google.android.material.internal.ClippableRoundedCornerLayout r5) {
            r4 = this;
            float r0 = r5.getCornerRadius()
            int r1 = r4.getExpandedCornerSize()
            float r1 = (float) r1
            r2 = 2
            float[] r2 = new float[r2]
            r3 = 0
            r2[r3] = r0
            r0 = 1
            r2[r0] = r1
            android.animation.ValueAnimator r0 = android.animation.ValueAnimator.ofFloat(r2)
            com.google.android.material.motion.MaterialMainContainerBackHelper$$ExternalSyntheticLambda0 r1 = new com.google.android.material.motion.MaterialMainContainerBackHelper$$ExternalSyntheticLambda0
            r1.<init>(r5)
            r0.addUpdateListener(r1)
            return r0
    }

    private android.animation.AnimatorSet createResetScaleAndTranslationAnimator(android.view.View r9) {
            r8 = this;
            android.animation.AnimatorSet r0 = new android.animation.AnimatorSet
            r0.<init>()
            r1 = 4
            android.animation.Animator[] r1 = new android.animation.Animator[r1]
            V extends android.view.View r2 = r8.view
            android.util.Property r3 = android.view.View.SCALE_X
            r4 = 1
            float[] r5 = new float[r4]
            r6 = 0
            r7 = 1065353216(0x3f800000, float:1.0)
            r5[r6] = r7
            android.animation.ObjectAnimator r2 = android.animation.ObjectAnimator.ofFloat(r2, r3, r5)
            r1[r6] = r2
            V extends android.view.View r2 = r8.view
            android.util.Property r3 = android.view.View.SCALE_Y
            float[] r5 = new float[r4]
            r5[r6] = r7
            android.animation.ObjectAnimator r2 = android.animation.ObjectAnimator.ofFloat(r2, r3, r5)
            r1[r4] = r2
            V extends android.view.View r2 = r8.view
            android.util.Property r3 = android.view.View.TRANSLATION_X
            float[] r5 = new float[r4]
            r7 = 0
            r5[r6] = r7
            android.animation.ObjectAnimator r2 = android.animation.ObjectAnimator.ofFloat(r2, r3, r5)
            r3 = 2
            r1[r3] = r2
            V extends android.view.View r2 = r8.view
            android.util.Property r3 = android.view.View.TRANSLATION_Y
            float[] r4 = new float[r4]
            r4[r6] = r7
            android.animation.ObjectAnimator r2 = android.animation.ObjectAnimator.ofFloat(r2, r3, r4)
            r3 = 3
            r1[r3] = r2
            r0.playTogether(r1)
            com.google.android.material.motion.MaterialMainContainerBackHelper$1 r1 = new com.google.android.material.motion.MaterialMainContainerBackHelper$1
            r1.<init>(r8, r9)
            r0.addListener(r1)
            return r0
    }

    private int getMaxDeviceCornerRadius() {
            r4 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 31
            r2 = 0
            if (r0 < r1) goto L2f
            V extends android.view.View r0 = r4.view
            android.view.WindowInsets r0 = r0.getRootWindowInsets()
            if (r0 == 0) goto L2f
            int r1 = r4.getRoundedCornerRadius(r0, r2)
            r2 = 1
            int r2 = r4.getRoundedCornerRadius(r0, r2)
            int r1 = java.lang.Math.max(r1, r2)
            r2 = 3
            int r2 = r4.getRoundedCornerRadius(r0, r2)
            r3 = 2
            int r0 = r4.getRoundedCornerRadius(r0, r3)
            int r0 = java.lang.Math.max(r2, r0)
            int r0 = java.lang.Math.max(r1, r0)
            return r0
        L2f:
            return r2
    }

    private int getRoundedCornerRadius(android.view.WindowInsets r1, int r2) {
            r0 = this;
            android.view.RoundedCorner r1 = r1.getRoundedCorner(r2)
            if (r1 == 0) goto Lb
            int r1 = r1.getRadius()
            goto Lc
        Lb:
            r1 = 0
        Lc:
            return r1
    }

    private boolean isAtTopOfScreen() {
            r2 = this;
            r0 = 2
            int[] r0 = new int[r0]
            V extends android.view.View r1 = r2.view
            r1.getLocationOnScreen(r0)
            r1 = 1
            r0 = r0[r1]
            if (r0 != 0) goto Le
            goto Lf
        Le:
            r1 = 0
        Lf:
            return r1
    }

    static /* synthetic */ void lambda$createCornerAnimator$0(com.google.android.material.internal.ClippableRoundedCornerLayout r0, android.animation.ValueAnimator r1) {
            java.lang.Object r1 = r1.getAnimatedValue()
            java.lang.Float r1 = (java.lang.Float) r1
            float r1 = r1.floatValue()
            r0.updateCornerRadius(r1)
            return
    }

    private void resetInitialValues() {
            r1 = this;
            r0 = 0
            r1.initialTouchY = r0
            r0 = 0
            r1.initialHideToClipBounds = r0
            r1.initialHideFromClipBounds = r0
            return
    }

    public void cancelBackProgress(android.view.View r4) {
            r3 = this;
            androidx.activity.BackEventCompat r0 = super.onCancelBackProgress()
            if (r0 != 0) goto L7
            return
        L7:
            android.animation.AnimatorSet r4 = r3.createResetScaleAndTranslationAnimator(r4)
            V extends android.view.View r0 = r3.view
            boolean r0 = r0 instanceof com.google.android.material.internal.ClippableRoundedCornerLayout
            if (r0 == 0) goto L22
            r0 = 1
            android.animation.Animator[] r0 = new android.animation.Animator[r0]
            V extends android.view.View r1 = r3.view
            com.google.android.material.internal.ClippableRoundedCornerLayout r1 = (com.google.android.material.internal.ClippableRoundedCornerLayout) r1
            android.animation.ValueAnimator r1 = r3.createCornerAnimator(r1)
            r2 = 0
            r0[r2] = r1
            r4.playTogether(r0)
        L22:
            int r0 = r3.cancelDuration
            long r0 = (long) r0
            r4.setDuration(r0)
            r4.start()
            r3.resetInitialValues()
            return
    }

    public void finishBackProgress(long r1, android.view.View r3) {
            r0 = this;
            android.animation.AnimatorSet r3 = r0.createResetScaleAndTranslationAnimator(r3)
            r3.setDuration(r1)
            r3.start()
            r0.resetInitialValues()
            return
    }

    public int getExpandedCornerSize() {
            r1 = this;
            java.lang.Integer r0 = r1.expandedCornerSize
            if (r0 != 0) goto L16
            boolean r0 = r1.isAtTopOfScreen()
            if (r0 == 0) goto Lf
            int r0 = r1.getMaxDeviceCornerRadius()
            goto L10
        Lf:
            r0 = 0
        L10:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1.expandedCornerSize = r0
        L16:
            java.lang.Integer r0 = r1.expandedCornerSize
            int r0 = r0.intValue()
            return r0
    }

    public android.graphics.Rect getInitialHideFromClipBounds() {
            r1 = this;
            android.graphics.Rect r0 = r1.initialHideFromClipBounds
            return r0
    }

    public android.graphics.Rect getInitialHideToClipBounds() {
            r1 = this;
            android.graphics.Rect r0 = r1.initialHideToClipBounds
            return r0
    }

    public void startBackProgress(float r2, android.view.View r3) {
            r1 = this;
            V extends android.view.View r0 = r1.view
            android.graphics.Rect r0 = com.google.android.material.internal.ViewUtils.calculateRectFromBounds(r0)
            r1.initialHideToClipBounds = r0
            if (r3 == 0) goto L12
            V extends android.view.View r0 = r1.view
            android.graphics.Rect r3 = com.google.android.material.internal.ViewUtils.calculateOffsetRectFromBounds(r0, r3)
            r1.initialHideFromClipBounds = r3
        L12:
            r1.initialTouchY = r2
            return
    }

    public void startBackProgress(androidx.activity.BackEventCompat r1, android.view.View r2) {
            r0 = this;
            super.onStartBackProgress(r1)
            float r1 = r1.getTouchY()
            r0.startBackProgress(r1, r2)
            return
    }

    public void updateBackProgress(float r7, boolean r8, float r9, float r10) {
            r6 = this;
            float r7 = r6.interpolateProgress(r7)
            V extends android.view.View r0 = r6.view
            int r0 = r0.getWidth()
            float r0 = (float) r0
            V extends android.view.View r1 = r6.view
            int r1 = r1.getHeight()
            float r1 = (float) r1
            r2 = 0
            int r3 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r3 <= 0) goto L89
            int r3 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r3 > 0) goto L1c
            goto L89
        L1c:
            r3 = 1065353216(0x3f800000, float:1.0)
            r4 = 1063675494(0x3f666666, float:0.9)
            float r3 = com.google.android.material.animation.AnimationUtils.lerp(r3, r4, r7)
            float r4 = r4 * r0
            float r0 = r0 - r4
            r4 = 1073741824(0x40000000, float:2.0)
            float r0 = r0 / r4
            float r5 = r6.minEdgeGap
            float r0 = r0 - r5
            float r0 = java.lang.Math.max(r2, r0)
            float r0 = com.google.android.material.animation.AnimationUtils.lerp(r2, r0, r7)
            if (r8 == 0) goto L39
            r8 = 1
            goto L3a
        L39:
            r8 = -1
        L3a:
            float r8 = (float) r8
            float r0 = r0 * r8
            float r8 = r3 * r1
            float r8 = r1 - r8
            float r8 = r8 / r4
            float r4 = r6.minEdgeGap
            float r8 = r8 - r4
            float r8 = java.lang.Math.max(r2, r8)
            float r4 = r6.maxTranslationY
            float r8 = java.lang.Math.min(r8, r4)
            float r4 = r6.initialTouchY
            float r9 = r9 - r4
            float r4 = java.lang.Math.abs(r9)
            float r4 = r4 / r1
            float r9 = java.lang.Math.signum(r9)
            float r8 = com.google.android.material.animation.AnimationUtils.lerp(r2, r8, r4)
            float r8 = r8 * r9
            V extends android.view.View r9 = r6.view
            r9.setScaleX(r3)
            V extends android.view.View r9 = r6.view
            r9.setScaleY(r3)
            V extends android.view.View r9 = r6.view
            r9.setTranslationX(r0)
            V extends android.view.View r9 = r6.view
            r9.setTranslationY(r8)
            V extends android.view.View r8 = r6.view
            boolean r8 = r8 instanceof com.google.android.material.internal.ClippableRoundedCornerLayout
            if (r8 == 0) goto L89
            V extends android.view.View r8 = r6.view
            com.google.android.material.internal.ClippableRoundedCornerLayout r8 = (com.google.android.material.internal.ClippableRoundedCornerLayout) r8
            int r9 = r6.getExpandedCornerSize()
            float r9 = (float) r9
            float r7 = com.google.android.material.animation.AnimationUtils.lerp(r9, r10, r7)
            r8.updateCornerRadius(r7)
        L89:
            return
    }

    public void updateBackProgress(androidx.activity.BackEventCompat r3, android.view.View r4, float r5) {
            r2 = this;
            androidx.activity.BackEventCompat r0 = super.onUpdateBackProgress(r3)
            if (r0 != 0) goto L7
            return
        L7:
            if (r4 == 0) goto L13
            int r0 = r4.getVisibility()
            r1 = 4
            if (r0 == r1) goto L13
            r4.setVisibility(r1)
        L13:
            int r4 = r3.getSwipeEdge()
            if (r4 != 0) goto L1b
            r4 = 1
            goto L1c
        L1b:
            r4 = 0
        L1c:
            float r0 = r3.getProgress()
            float r3 = r3.getTouchY()
            r2.updateBackProgress(r0, r4, r3, r5)
            return
    }
}
