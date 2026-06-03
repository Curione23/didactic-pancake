package com.google.android.material.progressindicator;

import com.google.android.material.progressindicator.BaseProgressIndicatorSpec;

/* JADX INFO: loaded from: classes.dex */
public final class IndeterminateDrawable<S extends com.google.android.material.progressindicator.BaseProgressIndicatorSpec> extends com.google.android.material.progressindicator.DrawableWithAnimatedVisibilityChange {
    private com.google.android.material.progressindicator.IndeterminateAnimatorDelegate<android.animation.ObjectAnimator> animatorDelegate;
    private com.google.android.material.progressindicator.DrawingDelegate<S> drawingDelegate;
    private android.graphics.drawable.Drawable staticDummyDrawable;

    IndeterminateDrawable(android.content.Context r1, com.google.android.material.progressindicator.BaseProgressIndicatorSpec r2, com.google.android.material.progressindicator.DrawingDelegate<S> r3, com.google.android.material.progressindicator.IndeterminateAnimatorDelegate<android.animation.ObjectAnimator> r4) {
            r0 = this;
            r0.<init>(r1, r2)
            r0.setDrawingDelegate(r3)
            r0.setAnimatorDelegate(r4)
            return
    }

    public static com.google.android.material.progressindicator.IndeterminateDrawable<com.google.android.material.progressindicator.CircularProgressIndicatorSpec> createCircularDrawable(android.content.Context r1, com.google.android.material.progressindicator.CircularProgressIndicatorSpec r2) {
            com.google.android.material.progressindicator.CircularDrawingDelegate r0 = new com.google.android.material.progressindicator.CircularDrawingDelegate
            r0.<init>(r2)
            com.google.android.material.progressindicator.IndeterminateDrawable r1 = createCircularDrawable(r1, r2, r0)
            return r1
    }

    static com.google.android.material.progressindicator.IndeterminateDrawable<com.google.android.material.progressindicator.CircularProgressIndicatorSpec> createCircularDrawable(android.content.Context r2, com.google.android.material.progressindicator.CircularProgressIndicatorSpec r3, com.google.android.material.progressindicator.CircularDrawingDelegate r4) {
            com.google.android.material.progressindicator.IndeterminateDrawable r0 = new com.google.android.material.progressindicator.IndeterminateDrawable
            com.google.android.material.progressindicator.CircularIndeterminateAnimatorDelegate r1 = new com.google.android.material.progressindicator.CircularIndeterminateAnimatorDelegate
            r1.<init>(r3)
            r0.<init>(r2, r3, r4, r1)
            android.content.res.Resources r2 = r2.getResources()
            int r3 = com.google.android.material.R.drawable.indeterminate_static
            r4 = 0
            androidx.vectordrawable.graphics.drawable.VectorDrawableCompat r2 = androidx.vectordrawable.graphics.drawable.VectorDrawableCompat.create(r2, r3, r4)
            r0.setStaticDummyDrawable(r2)
            return r0
    }

    public static com.google.android.material.progressindicator.IndeterminateDrawable<com.google.android.material.progressindicator.LinearProgressIndicatorSpec> createLinearDrawable(android.content.Context r1, com.google.android.material.progressindicator.LinearProgressIndicatorSpec r2) {
            com.google.android.material.progressindicator.LinearDrawingDelegate r0 = new com.google.android.material.progressindicator.LinearDrawingDelegate
            r0.<init>(r2)
            com.google.android.material.progressindicator.IndeterminateDrawable r1 = createLinearDrawable(r1, r2, r0)
            return r1
    }

    static com.google.android.material.progressindicator.IndeterminateDrawable<com.google.android.material.progressindicator.LinearProgressIndicatorSpec> createLinearDrawable(android.content.Context r2, com.google.android.material.progressindicator.LinearProgressIndicatorSpec r3, com.google.android.material.progressindicator.LinearDrawingDelegate r4) {
            com.google.android.material.progressindicator.IndeterminateDrawable r0 = new com.google.android.material.progressindicator.IndeterminateDrawable
            int r1 = r3.indeterminateAnimationType
            if (r1 != 0) goto Lc
            com.google.android.material.progressindicator.LinearIndeterminateContiguousAnimatorDelegate r1 = new com.google.android.material.progressindicator.LinearIndeterminateContiguousAnimatorDelegate
            r1.<init>(r3)
            goto L11
        Lc:
            com.google.android.material.progressindicator.LinearIndeterminateDisjointAnimatorDelegate r1 = new com.google.android.material.progressindicator.LinearIndeterminateDisjointAnimatorDelegate
            r1.<init>(r2, r3)
        L11:
            r0.<init>(r2, r3, r4, r1)
            return r0
    }

    private boolean isSystemAnimatorDisabled() {
            r3 = this;
            com.google.android.material.progressindicator.AnimatorDurationScaleProvider r0 = r3.animatorDurationScaleProvider
            r1 = 0
            if (r0 == 0) goto L17
            com.google.android.material.progressindicator.AnimatorDurationScaleProvider r0 = r3.animatorDurationScaleProvider
            android.content.Context r2 = r3.context
            android.content.ContentResolver r2 = r2.getContentResolver()
            float r0 = r0.getSystemAnimatorDurationScale(r2)
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 != 0) goto L17
            r1 = 1
        L17:
            return r1
    }

    @Override // com.google.android.material.progressindicator.DrawableWithAnimatedVisibilityChange, androidx.vectordrawable.graphics.drawable.Animatable2Compat
    public /* bridge */ /* synthetic */ void clearAnimationCallbacks() {
            r0 = this;
            super.clearAnimationCallbacks()
            return
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(android.graphics.Canvas r13) {
            r12 = this;
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            android.graphics.Rect r1 = r12.getBounds()
            boolean r1 = r1.isEmpty()
            if (r1 != 0) goto L11c
            boolean r1 = r12.isVisible()
            if (r1 == 0) goto L11c
            boolean r0 = r13.getClipBounds(r0)
            if (r0 != 0) goto L1d
            goto L11c
        L1d:
            boolean r0 = r12.isSystemAnimatorDisabled()
            r1 = 0
            if (r0 == 0) goto L40
            android.graphics.drawable.Drawable r0 = r12.staticDummyDrawable
            if (r0 == 0) goto L40
            android.graphics.Rect r2 = r12.getBounds()
            r0.setBounds(r2)
            android.graphics.drawable.Drawable r0 = r12.staticDummyDrawable
            com.google.android.material.progressindicator.BaseProgressIndicatorSpec r2 = r12.baseSpec
            int[] r2 = r2.indicatorColors
            r1 = r2[r1]
            androidx.core.graphics.drawable.DrawableCompat.setTint(r0, r1)
            android.graphics.drawable.Drawable r0 = r12.staticDummyDrawable
            r0.draw(r13)
            return
        L40:
            r13.save()
            com.google.android.material.progressindicator.DrawingDelegate<S extends com.google.android.material.progressindicator.BaseProgressIndicatorSpec> r2 = r12.drawingDelegate
            android.graphics.Rect r4 = r12.getBounds()
            float r5 = r12.getGrowFraction()
            boolean r6 = r12.isShowing()
            boolean r7 = r12.isHiding()
            r3 = r13
            r2.validateSpecAndAdjustCanvas(r3, r4, r5, r6, r7)
            com.google.android.material.progressindicator.BaseProgressIndicatorSpec r0 = r12.baseSpec
            int r0 = r0.indicatorTrackGapSize
            int r10 = r12.getAlpha()
            if (r0 != 0) goto L75
            com.google.android.material.progressindicator.DrawingDelegate<S extends com.google.android.material.progressindicator.BaseProgressIndicatorSpec> r2 = r12.drawingDelegate
            android.graphics.Paint r4 = r12.paint
            com.google.android.material.progressindicator.BaseProgressIndicatorSpec r3 = r12.baseSpec
            int r7 = r3.trackColor
            r9 = 0
            r5 = 0
            r6 = 1065353216(0x3f800000, float:1.0)
            r3 = r13
            r8 = r10
            r2.fillTrack(r3, r4, r5, r6, r7, r8, r9)
            goto Ld0
        L75:
            com.google.android.material.progressindicator.IndeterminateAnimatorDelegate<android.animation.ObjectAnimator> r2 = r12.animatorDelegate
            java.util.List<com.google.android.material.progressindicator.DrawingDelegate$ActiveIndicator> r2 = r2.activeIndicators
            java.lang.Object r2 = r2.get(r1)
            com.google.android.material.progressindicator.DrawingDelegate$ActiveIndicator r2 = (com.google.android.material.progressindicator.DrawingDelegate.ActiveIndicator) r2
            com.google.android.material.progressindicator.IndeterminateAnimatorDelegate<android.animation.ObjectAnimator> r3 = r12.animatorDelegate
            java.util.List<com.google.android.material.progressindicator.DrawingDelegate$ActiveIndicator> r3 = r3.activeIndicators
            com.google.android.material.progressindicator.IndeterminateAnimatorDelegate<android.animation.ObjectAnimator> r4 = r12.animatorDelegate
            java.util.List<com.google.android.material.progressindicator.DrawingDelegate$ActiveIndicator> r4 = r4.activeIndicators
            int r4 = r4.size()
            int r4 = r4 + (-1)
            java.lang.Object r3 = r3.get(r4)
            r11 = r3
            com.google.android.material.progressindicator.DrawingDelegate$ActiveIndicator r11 = (com.google.android.material.progressindicator.DrawingDelegate.ActiveIndicator) r11
            com.google.android.material.progressindicator.DrawingDelegate<S extends com.google.android.material.progressindicator.BaseProgressIndicatorSpec> r3 = r12.drawingDelegate
            boolean r4 = r3 instanceof com.google.android.material.progressindicator.LinearDrawingDelegate
            if (r4 == 0) goto Lbb
            android.graphics.Paint r4 = r12.paint
            float r6 = r2.startFraction
            com.google.android.material.progressindicator.BaseProgressIndicatorSpec r2 = r12.baseSpec
            int r7 = r2.trackColor
            r5 = 0
            r2 = r3
            r3 = r13
            r8 = r10
            r9 = r0
            r2.fillTrack(r3, r4, r5, r6, r7, r8, r9)
            com.google.android.material.progressindicator.DrawingDelegate<S extends com.google.android.material.progressindicator.BaseProgressIndicatorSpec> r2 = r12.drawingDelegate
            android.graphics.Paint r4 = r12.paint
            float r5 = r11.endFraction
            com.google.android.material.progressindicator.BaseProgressIndicatorSpec r3 = r12.baseSpec
            int r7 = r3.trackColor
            r6 = 1065353216(0x3f800000, float:1.0)
            r3 = r13
            r2.fillTrack(r3, r4, r5, r6, r7, r8, r9)
            goto Ld0
        Lbb:
            android.graphics.Paint r4 = r12.paint
            float r5 = r11.endFraction
            float r2 = r2.startFraction
            r6 = 1065353216(0x3f800000, float:1.0)
            float r6 = r6 + r2
            com.google.android.material.progressindicator.BaseProgressIndicatorSpec r2 = r12.baseSpec
            int r7 = r2.trackColor
            r10 = 0
            r2 = r3
            r3 = r13
            r8 = r10
            r9 = r0
            r2.fillTrack(r3, r4, r5, r6, r7, r8, r9)
        Ld0:
            com.google.android.material.progressindicator.IndeterminateAnimatorDelegate<android.animation.ObjectAnimator> r2 = r12.animatorDelegate
            java.util.List<com.google.android.material.progressindicator.DrawingDelegate$ActiveIndicator> r2 = r2.activeIndicators
            int r2 = r2.size()
            if (r1 >= r2) goto L119
            com.google.android.material.progressindicator.IndeterminateAnimatorDelegate<android.animation.ObjectAnimator> r2 = r12.animatorDelegate
            java.util.List<com.google.android.material.progressindicator.DrawingDelegate$ActiveIndicator> r2 = r2.activeIndicators
            java.lang.Object r2 = r2.get(r1)
            com.google.android.material.progressindicator.DrawingDelegate$ActiveIndicator r2 = (com.google.android.material.progressindicator.DrawingDelegate.ActiveIndicator) r2
            com.google.android.material.progressindicator.DrawingDelegate<S extends com.google.android.material.progressindicator.BaseProgressIndicatorSpec> r3 = r12.drawingDelegate
            android.graphics.Paint r4 = r12.paint
            int r5 = r12.getAlpha()
            r3.fillIndicator(r13, r4, r2, r5)
            if (r1 <= 0) goto L116
            if (r0 <= 0) goto L116
            com.google.android.material.progressindicator.IndeterminateAnimatorDelegate<android.animation.ObjectAnimator> r3 = r12.animatorDelegate
            java.util.List<com.google.android.material.progressindicator.DrawingDelegate$ActiveIndicator> r3 = r3.activeIndicators
            int r4 = r1 + (-1)
            java.lang.Object r3 = r3.get(r4)
            com.google.android.material.progressindicator.DrawingDelegate$ActiveIndicator r3 = (com.google.android.material.progressindicator.DrawingDelegate.ActiveIndicator) r3
            com.google.android.material.progressindicator.DrawingDelegate<S extends com.google.android.material.progressindicator.BaseProgressIndicatorSpec> r4 = r12.drawingDelegate
            android.graphics.Paint r5 = r12.paint
            float r6 = r3.endFraction
            float r7 = r2.startFraction
            com.google.android.material.progressindicator.BaseProgressIndicatorSpec r2 = r12.baseSpec
            int r8 = r2.trackColor
            r2 = r4
            r3 = r13
            r4 = r5
            r5 = r6
            r6 = r7
            r7 = r8
            r8 = r10
            r9 = r0
            r2.fillTrack(r3, r4, r5, r6, r7, r8, r9)
        L116:
            int r1 = r1 + 1
            goto Ld0
        L119:
            r13.restore()
        L11c:
            return
    }

    @Override // com.google.android.material.progressindicator.DrawableWithAnimatedVisibilityChange, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getAlpha() {
            r1 = this;
            int r0 = super.getAlpha()
            return r0
    }

    com.google.android.material.progressindicator.IndeterminateAnimatorDelegate<android.animation.ObjectAnimator> getAnimatorDelegate() {
            r1 = this;
            com.google.android.material.progressindicator.IndeterminateAnimatorDelegate<android.animation.ObjectAnimator> r0 = r1.animatorDelegate
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

    public android.graphics.drawable.Drawable getStaticDummyDrawable() {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.staticDummyDrawable
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

    @Override // com.google.android.material.progressindicator.DrawableWithAnimatedVisibilityChange, androidx.vectordrawable.graphics.drawable.Animatable2Compat
    public /* bridge */ /* synthetic */ void registerAnimationCallback(androidx.vectordrawable.graphics.drawable.Animatable2Compat.AnimationCallback r1) {
            r0 = this;
            super.registerAnimationCallback(r1)
            return
    }

    @Override // com.google.android.material.progressindicator.DrawableWithAnimatedVisibilityChange, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setAlpha(int r1) {
            r0 = this;
            super.setAlpha(r1)
            return
    }

    void setAnimatorDelegate(com.google.android.material.progressindicator.IndeterminateAnimatorDelegate<android.animation.ObjectAnimator> r1) {
            r0 = this;
            r0.animatorDelegate = r1
            r1.registerDrawable(r0)
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

    public void setStaticDummyDrawable(android.graphics.drawable.Drawable r1) {
            r0 = this;
            r0.staticDummyDrawable = r1
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
    boolean setVisibleInternal(boolean r3, boolean r4, boolean r5) {
            r2 = this;
            boolean r0 = super.setVisibleInternal(r3, r4, r5)
            boolean r1 = r2.isSystemAnimatorDisabled()
            if (r1 == 0) goto L13
            android.graphics.drawable.Drawable r1 = r2.staticDummyDrawable
            if (r1 == 0) goto L13
            boolean r3 = r1.setVisible(r3, r4)
            return r3
        L13:
            boolean r4 = r2.isRunning()
            if (r4 != 0) goto L1e
            com.google.android.material.progressindicator.IndeterminateAnimatorDelegate<android.animation.ObjectAnimator> r4 = r2.animatorDelegate
            r4.cancelAnimatorImmediately()
        L1e:
            if (r3 == 0) goto L28
            if (r5 != 0) goto L23
            goto L28
        L23:
            com.google.android.material.progressindicator.IndeterminateAnimatorDelegate<android.animation.ObjectAnimator> r3 = r2.animatorDelegate
            r3.startAnimator()
        L28:
            return r0
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
