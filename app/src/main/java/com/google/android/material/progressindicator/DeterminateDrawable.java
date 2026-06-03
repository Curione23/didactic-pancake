package com.google.android.material.progressindicator;

import com.google.android.material.progressindicator.BaseProgressIndicatorSpec;

/* JADX INFO: loaded from: classes.dex */
public final class DeterminateDrawable<S extends com.google.android.material.progressindicator.BaseProgressIndicatorSpec> extends com.google.android.material.progressindicator.DrawableWithAnimatedVisibilityChange {
    static final float GAP_RAMP_DOWN_THRESHOLD = 0.01f;
    private static final androidx.dynamicanimation.animation.FloatPropertyCompat<com.google.android.material.progressindicator.DeterminateDrawable<?>> INDICATOR_LENGTH_IN_LEVEL = null;
    private static final int MAX_DRAWABLE_LEVEL = 10000;
    private static final float SPRING_FORCE_STIFFNESS = 50.0f;
    private final com.google.android.material.progressindicator.DrawingDelegate.ActiveIndicator activeIndicator;
    private com.google.android.material.progressindicator.DrawingDelegate<S> drawingDelegate;
    private boolean skipAnimationOnLevelChange;
    private final androidx.dynamicanimation.animation.SpringAnimation springAnimation;
    private final androidx.dynamicanimation.animation.SpringForce springForce;


    static {
            com.google.android.material.progressindicator.DeterminateDrawable$1 r0 = new com.google.android.material.progressindicator.DeterminateDrawable$1
            java.lang.String r1 = "indicatorLevel"
            r0.<init>(r1)
            com.google.android.material.progressindicator.DeterminateDrawable.INDICATOR_LENGTH_IN_LEVEL = r0
            return
    }

    DeterminateDrawable(android.content.Context r2, com.google.android.material.progressindicator.BaseProgressIndicatorSpec r3, com.google.android.material.progressindicator.DrawingDelegate<S> r4) {
            r1 = this;
            r1.<init>(r2, r3)
            r2 = 0
            r1.skipAnimationOnLevelChange = r2
            r1.setDrawingDelegate(r4)
            com.google.android.material.progressindicator.DrawingDelegate$ActiveIndicator r2 = new com.google.android.material.progressindicator.DrawingDelegate$ActiveIndicator
            r2.<init>()
            r1.activeIndicator = r2
            androidx.dynamicanimation.animation.SpringForce r2 = new androidx.dynamicanimation.animation.SpringForce
            r2.<init>()
            r1.springForce = r2
            r3 = 1065353216(0x3f800000, float:1.0)
            r2.setDampingRatio(r3)
            r4 = 1112014848(0x42480000, float:50.0)
            r2.setStiffness(r4)
            androidx.dynamicanimation.animation.SpringAnimation r4 = new androidx.dynamicanimation.animation.SpringAnimation
            androidx.dynamicanimation.animation.FloatPropertyCompat<com.google.android.material.progressindicator.DeterminateDrawable<?>> r0 = com.google.android.material.progressindicator.DeterminateDrawable.INDICATOR_LENGTH_IN_LEVEL
            r4.<init>(r1, r0)
            r1.springAnimation = r4
            r4.setSpring(r2)
            r1.setGrowFraction(r3)
            return
    }

    static /* synthetic */ float access$000(com.google.android.material.progressindicator.DeterminateDrawable r0) {
            float r0 = r0.getIndicatorFraction()
            return r0
    }

    static /* synthetic */ void access$100(com.google.android.material.progressindicator.DeterminateDrawable r0, float r1) {
            r0.setIndicatorFraction(r1)
            return
    }

    public static com.google.android.material.progressindicator.DeterminateDrawable<com.google.android.material.progressindicator.CircularProgressIndicatorSpec> createCircularDrawable(android.content.Context r1, com.google.android.material.progressindicator.CircularProgressIndicatorSpec r2) {
            com.google.android.material.progressindicator.CircularDrawingDelegate r0 = new com.google.android.material.progressindicator.CircularDrawingDelegate
            r0.<init>(r2)
            com.google.android.material.progressindicator.DeterminateDrawable r1 = createCircularDrawable(r1, r2, r0)
            return r1
    }

    static com.google.android.material.progressindicator.DeterminateDrawable<com.google.android.material.progressindicator.CircularProgressIndicatorSpec> createCircularDrawable(android.content.Context r1, com.google.android.material.progressindicator.CircularProgressIndicatorSpec r2, com.google.android.material.progressindicator.CircularDrawingDelegate r3) {
            com.google.android.material.progressindicator.DeterminateDrawable r0 = new com.google.android.material.progressindicator.DeterminateDrawable
            r0.<init>(r1, r2, r3)
            return r0
    }

    public static com.google.android.material.progressindicator.DeterminateDrawable<com.google.android.material.progressindicator.LinearProgressIndicatorSpec> createLinearDrawable(android.content.Context r1, com.google.android.material.progressindicator.LinearProgressIndicatorSpec r2) {
            com.google.android.material.progressindicator.LinearDrawingDelegate r0 = new com.google.android.material.progressindicator.LinearDrawingDelegate
            r0.<init>(r2)
            com.google.android.material.progressindicator.DeterminateDrawable r1 = createLinearDrawable(r1, r2, r0)
            return r1
    }

    static com.google.android.material.progressindicator.DeterminateDrawable<com.google.android.material.progressindicator.LinearProgressIndicatorSpec> createLinearDrawable(android.content.Context r1, com.google.android.material.progressindicator.LinearProgressIndicatorSpec r2, com.google.android.material.progressindicator.LinearDrawingDelegate r3) {
            com.google.android.material.progressindicator.DeterminateDrawable r0 = new com.google.android.material.progressindicator.DeterminateDrawable
            r0.<init>(r1, r2, r3)
            return r0
    }

    private float getIndicatorFraction() {
            r1 = this;
            com.google.android.material.progressindicator.DrawingDelegate$ActiveIndicator r0 = r1.activeIndicator
            float r0 = r0.endFraction
            return r0
    }

    private void setIndicatorFraction(float r2) {
            r1 = this;
            com.google.android.material.progressindicator.DrawingDelegate$ActiveIndicator r0 = r1.activeIndicator
            r0.endFraction = r2
            r1.invalidateSelf()
            return
    }

    public void addSpringAnimationEndListener(androidx.dynamicanimation.animation.DynamicAnimation.OnAnimationEndListener r2) {
            r1 = this;
            androidx.dynamicanimation.animation.SpringAnimation r0 = r1.springAnimation
            r0.addEndListener(r2)
            return
    }

    @Override // com.google.android.material.progressindicator.DrawableWithAnimatedVisibilityChange, androidx.vectordrawable.graphics.drawable.Animatable2Compat
    public /* bridge */ /* synthetic */ void clearAnimationCallbacks() {
            r0 = this;
            super.clearAnimationCallbacks()
            return
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(android.graphics.Canvas r10) {
            r9 = this;
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            android.graphics.Rect r1 = r9.getBounds()
            boolean r1 = r1.isEmpty()
            if (r1 != 0) goto Lc0
            boolean r1 = r9.isVisible()
            if (r1 == 0) goto Lc0
            boolean r0 = r10.getClipBounds(r0)
            if (r0 != 0) goto L1d
            goto Lc0
        L1d:
            r10.save()
            com.google.android.material.progressindicator.DrawingDelegate<S extends com.google.android.material.progressindicator.BaseProgressIndicatorSpec> r0 = r9.drawingDelegate
            android.graphics.Rect r2 = r9.getBounds()
            float r3 = r9.getGrowFraction()
            boolean r4 = r9.isShowing()
            boolean r5 = r9.isHiding()
            r1 = r10
            r0.validateSpecAndAdjustCanvas(r1, r2, r3, r4, r5)
            android.graphics.Paint r0 = r9.paint
            android.graphics.Paint$Style r1 = android.graphics.Paint.Style.FILL
            r0.setStyle(r1)
            android.graphics.Paint r0 = r9.paint
            r1 = 1
            r0.setAntiAlias(r1)
            com.google.android.material.progressindicator.DrawingDelegate$ActiveIndicator r0 = r9.activeIndicator
            com.google.android.material.progressindicator.BaseProgressIndicatorSpec r1 = r9.baseSpec
            int[] r1 = r1.indicatorColors
            r8 = 0
            r1 = r1[r8]
            r0.color = r1
            com.google.android.material.progressindicator.BaseProgressIndicatorSpec r0 = r9.baseSpec
            int r0 = r0.indicatorTrackGapSize
            if (r0 <= 0) goto L8b
            com.google.android.material.progressindicator.DrawingDelegate<S extends com.google.android.material.progressindicator.BaseProgressIndicatorSpec> r0 = r9.drawingDelegate
            boolean r0 = r0 instanceof com.google.android.material.progressindicator.LinearDrawingDelegate
            if (r0 == 0) goto L5f
            com.google.android.material.progressindicator.BaseProgressIndicatorSpec r0 = r9.baseSpec
            int r0 = r0.indicatorTrackGapSize
            goto L73
        L5f:
            com.google.android.material.progressindicator.BaseProgressIndicatorSpec r0 = r9.baseSpec
            int r0 = r0.indicatorTrackGapSize
            float r0 = (float) r0
            float r1 = r9.getIndicatorFraction()
            r2 = 0
            r3 = 1008981770(0x3c23d70a, float:0.01)
            float r1 = androidx.core.math.MathUtils.clamp(r1, r2, r3)
            float r0 = r0 * r1
            float r0 = r0 / r3
            int r0 = (int) r0
        L73:
            r7 = r0
            com.google.android.material.progressindicator.DrawingDelegate<S extends com.google.android.material.progressindicator.BaseProgressIndicatorSpec> r0 = r9.drawingDelegate
            android.graphics.Paint r2 = r9.paint
            float r3 = r9.getIndicatorFraction()
            com.google.android.material.progressindicator.BaseProgressIndicatorSpec r1 = r9.baseSpec
            int r5 = r1.trackColor
            int r6 = r9.getAlpha()
            r4 = 1065353216(0x3f800000, float:1.0)
            r1 = r10
            r0.fillTrack(r1, r2, r3, r4, r5, r6, r7)
            goto L9f
        L8b:
            com.google.android.material.progressindicator.DrawingDelegate<S extends com.google.android.material.progressindicator.BaseProgressIndicatorSpec> r0 = r9.drawingDelegate
            android.graphics.Paint r2 = r9.paint
            com.google.android.material.progressindicator.BaseProgressIndicatorSpec r1 = r9.baseSpec
            int r5 = r1.trackColor
            int r6 = r9.getAlpha()
            r7 = 0
            r3 = 0
            r4 = 1065353216(0x3f800000, float:1.0)
            r1 = r10
            r0.fillTrack(r1, r2, r3, r4, r5, r6, r7)
        L9f:
            com.google.android.material.progressindicator.DrawingDelegate<S extends com.google.android.material.progressindicator.BaseProgressIndicatorSpec> r0 = r9.drawingDelegate
            android.graphics.Paint r1 = r9.paint
            com.google.android.material.progressindicator.DrawingDelegate$ActiveIndicator r2 = r9.activeIndicator
            int r3 = r9.getAlpha()
            r0.fillIndicator(r10, r1, r2, r3)
            com.google.android.material.progressindicator.DrawingDelegate<S extends com.google.android.material.progressindicator.BaseProgressIndicatorSpec> r0 = r9.drawingDelegate
            android.graphics.Paint r1 = r9.paint
            com.google.android.material.progressindicator.BaseProgressIndicatorSpec r2 = r9.baseSpec
            int[] r2 = r2.indicatorColors
            r2 = r2[r8]
            int r3 = r9.getAlpha()
            r0.drawStopIndicator(r10, r1, r2, r3)
            r10.restore()
        Lc0:
            return
    }

    @Override // com.google.android.material.progressindicator.DrawableWithAnimatedVisibilityChange, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getAlpha() {
            r1 = this;
            int r0 = super.getAlpha()
            return r0
    }

    com.google.android.material.progressindicator.DrawingDelegate<S> getDrawingDelegate() {
            r1 = this;
            com.google.android.material.progressindicator.DrawingDelegate<S extends com.google.android.material.progressindicator.BaseProgressIndicatorSpec> r0 = r1.drawingDelegate
            return r0
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
            r1 = this;
            com.google.android.material.progressindicator.DrawingDelegate<S extends com.google.android.material.progressindicator.BaseProgressIndicatorSpec> r0 = r1.drawingDelegate
            int r0 = r0.getPreferredHeight()
            return r0
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
            r1 = this;
            com.google.android.material.progressindicator.DrawingDelegate<S extends com.google.android.material.progressindicator.BaseProgressIndicatorSpec> r0 = r1.drawingDelegate
            int r0 = r0.getPreferredWidth()
            return r0
    }

    @Override // com.google.android.material.progressindicator.DrawableWithAnimatedVisibilityChange, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getOpacity() {
            r1 = this;
            int r0 = super.getOpacity()
            return r0
    }

    @Override // com.google.android.material.progressindicator.DrawableWithAnimatedVisibilityChange
    public /* bridge */ /* synthetic */ boolean hideNow() {
            r1 = this;
            boolean r0 = super.hideNow()
            return r0
    }

    @Override // com.google.android.material.progressindicator.DrawableWithAnimatedVisibilityChange
    public /* bridge */ /* synthetic */ boolean isHiding() {
            r1 = this;
            boolean r0 = super.isHiding()
            return r0
    }

    @Override // com.google.android.material.progressindicator.DrawableWithAnimatedVisibilityChange, android.graphics.drawable.Animatable
    public /* bridge */ /* synthetic */ boolean isRunning() {
            r1 = this;
            boolean r0 = super.isRunning()
            return r0
    }

    @Override // com.google.android.material.progressindicator.DrawableWithAnimatedVisibilityChange
    public /* bridge */ /* synthetic */ boolean isShowing() {
            r1 = this;
            boolean r0 = super.isShowing()
            return r0
    }

    @Override // android.graphics.drawable.Drawable
    public void jumpToCurrentState() {
            r2 = this;
            androidx.dynamicanimation.animation.SpringAnimation r0 = r2.springAnimation
            r0.skipToEnd()
            int r0 = r2.getLevel()
            float r0 = (float) r0
            r1 = 1176256512(0x461c4000, float:10000.0)
            float r0 = r0 / r1
            r2.setIndicatorFraction(r0)
            return
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onLevelChange(int r4) {
            r3 = this;
            boolean r0 = r3.skipAnimationOnLevelChange
            r1 = 1176256512(0x461c4000, float:10000.0)
            if (r0 == 0) goto L12
            androidx.dynamicanimation.animation.SpringAnimation r0 = r3.springAnimation
            r0.skipToEnd()
            float r4 = (float) r4
            float r4 = r4 / r1
            r3.setIndicatorFraction(r4)
            goto L22
        L12:
            androidx.dynamicanimation.animation.SpringAnimation r0 = r3.springAnimation
            float r2 = r3.getIndicatorFraction()
            float r2 = r2 * r1
            r0.setStartValue(r2)
            androidx.dynamicanimation.animation.SpringAnimation r0 = r3.springAnimation
            float r4 = (float) r4
            r0.animateToFinalPosition(r4)
        L22:
            r4 = 1
            return r4
    }

    @Override // com.google.android.material.progressindicator.DrawableWithAnimatedVisibilityChange, androidx.vectordrawable.graphics.drawable.Animatable2Compat
    public /* bridge */ /* synthetic */ void registerAnimationCallback(androidx.vectordrawable.graphics.drawable.Animatable2Compat.AnimationCallback r1) {
            r0 = this;
            super.registerAnimationCallback(r1)
            return
    }

    public void removeSpringAnimationEndListener(androidx.dynamicanimation.animation.DynamicAnimation.OnAnimationEndListener r2) {
            r1 = this;
            androidx.dynamicanimation.animation.SpringAnimation r0 = r1.springAnimation
            r0.removeEndListener(r2)
            return
    }

    @Override // com.google.android.material.progressindicator.DrawableWithAnimatedVisibilityChange, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setAlpha(int r1) {
            r0 = this;
            super.setAlpha(r1)
            return
    }

    @Override // com.google.android.material.progressindicator.DrawableWithAnimatedVisibilityChange, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setColorFilter(android.graphics.ColorFilter r1) {
            r0 = this;
            super.setColorFilter(r1)
            return
    }

    void setDrawingDelegate(com.google.android.material.progressindicator.DrawingDelegate<S> r1) {
            r0 = this;
            r0.drawingDelegate = r1
            return
    }

    void setLevelByFraction(float r2) {
            r1 = this;
            r0 = 1176256512(0x461c4000, float:10000.0)
            float r2 = r2 * r0
            int r2 = (int) r2
            r1.setLevel(r2)
            return
    }

    @Override // com.google.android.material.progressindicator.DrawableWithAnimatedVisibilityChange, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ boolean setVisible(boolean r1, boolean r2) {
            r0 = this;
            boolean r1 = super.setVisible(r1, r2)
            return r1
    }

    @Override // com.google.android.material.progressindicator.DrawableWithAnimatedVisibilityChange
    public /* bridge */ /* synthetic */ boolean setVisible(boolean r1, boolean r2, boolean r3) {
            r0 = this;
            boolean r1 = super.setVisible(r1, r2, r3)
            return r1
    }

    @Override // com.google.android.material.progressindicator.DrawableWithAnimatedVisibilityChange
    boolean setVisibleInternal(boolean r2, boolean r3, boolean r4) {
            r1 = this;
            boolean r2 = super.setVisibleInternal(r2, r3, r4)
            com.google.android.material.progressindicator.AnimatorDurationScaleProvider r3 = r1.animatorDurationScaleProvider
            android.content.Context r4 = r1.context
            android.content.ContentResolver r4 = r4.getContentResolver()
            float r3 = r3.getSystemAnimatorDurationScale(r4)
            r4 = 0
            int r4 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r4 != 0) goto L19
            r3 = 1
            r1.skipAnimationOnLevelChange = r3
            goto L24
        L19:
            r4 = 0
            r1.skipAnimationOnLevelChange = r4
            androidx.dynamicanimation.animation.SpringForce r4 = r1.springForce
            r0 = 1112014848(0x42480000, float:50.0)
            float r0 = r0 / r3
            r4.setStiffness(r0)
        L24:
            return r2
    }

    @Override // com.google.android.material.progressindicator.DrawableWithAnimatedVisibilityChange, android.graphics.drawable.Animatable
    public /* bridge */ /* synthetic */ void start() {
            r0 = this;
            super.start()
            return
    }

    @Override // com.google.android.material.progressindicator.DrawableWithAnimatedVisibilityChange, android.graphics.drawable.Animatable
    public /* bridge */ /* synthetic */ void stop() {
            r0 = this;
            super.stop()
            return
    }

    @Override // com.google.android.material.progressindicator.DrawableWithAnimatedVisibilityChange, androidx.vectordrawable.graphics.drawable.Animatable2Compat
    public /* bridge */ /* synthetic */ boolean unregisterAnimationCallback(androidx.vectordrawable.graphics.drawable.Animatable2Compat.AnimationCallback r1) {
            r0 = this;
            boolean r1 = super.unregisterAnimationCallback(r1)
            return r1
    }
}
