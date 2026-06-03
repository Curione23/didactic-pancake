package com.google.android.material.progressindicator;

/* JADX INFO: loaded from: classes.dex */
final class LinearIndeterminateContiguousAnimatorDelegate extends com.google.android.material.progressindicator.IndeterminateAnimatorDelegate<android.animation.ObjectAnimator> {
    private static final android.util.Property<com.google.android.material.progressindicator.LinearIndeterminateContiguousAnimatorDelegate, java.lang.Float> ANIMATION_FRACTION = null;
    private static final int DURATION_PER_CYCLE_IN_MS = 333;
    private static final int TOTAL_DURATION_IN_MS = 667;
    private float animationFraction;
    private android.animation.ObjectAnimator animator;
    private final com.google.android.material.progressindicator.BaseProgressIndicatorSpec baseSpec;
    private boolean dirtyColors;
    private androidx.interpolator.view.animation.FastOutSlowInInterpolator interpolator;
    private int newIndicatorColorIndex;



    static {
            com.google.android.material.progressindicator.LinearIndeterminateContiguousAnimatorDelegate$2 r0 = new com.google.android.material.progressindicator.LinearIndeterminateContiguousAnimatorDelegate$2
            java.lang.Class<java.lang.Float> r1 = java.lang.Float.class
            java.lang.String r2 = "animationFraction"
            r0.<init>(r1, r2)
            com.google.android.material.progressindicator.LinearIndeterminateContiguousAnimatorDelegate.ANIMATION_FRACTION = r0
            return
    }

    public LinearIndeterminateContiguousAnimatorDelegate(com.google.android.material.progressindicator.LinearProgressIndicatorSpec r2) {
            r1 = this;
            r0 = 3
            r1.<init>(r0)
            r0 = 1
            r1.newIndicatorColorIndex = r0
            r1.baseSpec = r2
            androidx.interpolator.view.animation.FastOutSlowInInterpolator r2 = new androidx.interpolator.view.animation.FastOutSlowInInterpolator
            r2.<init>()
            r1.interpolator = r2
            return
    }

    static /* synthetic */ int access$000(com.google.android.material.progressindicator.LinearIndeterminateContiguousAnimatorDelegate r0) {
            int r0 = r0.newIndicatorColorIndex
            return r0
    }

    static /* synthetic */ int access$002(com.google.android.material.progressindicator.LinearIndeterminateContiguousAnimatorDelegate r0, int r1) {
            r0.newIndicatorColorIndex = r1
            return r1
    }

    static /* synthetic */ com.google.android.material.progressindicator.BaseProgressIndicatorSpec access$100(com.google.android.material.progressindicator.LinearIndeterminateContiguousAnimatorDelegate r0) {
            com.google.android.material.progressindicator.BaseProgressIndicatorSpec r0 = r0.baseSpec
            return r0
    }

    static /* synthetic */ boolean access$202(com.google.android.material.progressindicator.LinearIndeterminateContiguousAnimatorDelegate r0, boolean r1) {
            r0.dirtyColors = r1
            return r1
    }

    static /* synthetic */ float access$300(com.google.android.material.progressindicator.LinearIndeterminateContiguousAnimatorDelegate r0) {
            float r0 = r0.getAnimationFraction()
            return r0
    }

    private float getAnimationFraction() {
            r1 = this;
            float r0 = r1.animationFraction
            return r0
    }

    private void maybeInitializeAnimators() {
            r3 = this;
            android.animation.ObjectAnimator r0 = r3.animator
            if (r0 != 0) goto L2d
            android.util.Property<com.google.android.material.progressindicator.LinearIndeterminateContiguousAnimatorDelegate, java.lang.Float> r0 = com.google.android.material.progressindicator.LinearIndeterminateContiguousAnimatorDelegate.ANIMATION_FRACTION
            r1 = 2
            float[] r1 = new float[r1]
            r1 = {x002e: FILL_ARRAY_DATA , data: [0, 1065353216} // fill-array
            android.animation.ObjectAnimator r0 = android.animation.ObjectAnimator.ofFloat(r3, r0, r1)
            r3.animator = r0
            r1 = 333(0x14d, double:1.645E-321)
            r0.setDuration(r1)
            android.animation.ObjectAnimator r0 = r3.animator
            r1 = 0
            r0.setInterpolator(r1)
            android.animation.ObjectAnimator r0 = r3.animator
            r1 = -1
            r0.setRepeatCount(r1)
            android.animation.ObjectAnimator r0 = r3.animator
            com.google.android.material.progressindicator.LinearIndeterminateContiguousAnimatorDelegate$1 r1 = new com.google.android.material.progressindicator.LinearIndeterminateContiguousAnimatorDelegate$1
            r1.<init>(r3)
            r0.addListener(r1)
        L2d:
            return
    }

    private void maybeUpdateSegmentColors() {
            r4 = this;
            boolean r0 = r4.dirtyColors
            if (r0 == 0) goto L53
            java.util.List<com.google.android.material.progressindicator.DrawingDelegate$ActiveIndicator> r0 = r4.activeIndicators
            r1 = 1
            java.lang.Object r0 = r0.get(r1)
            com.google.android.material.progressindicator.DrawingDelegate$ActiveIndicator r0 = (com.google.android.material.progressindicator.DrawingDelegate.ActiveIndicator) r0
            float r0 = r0.endFraction
            r2 = 1065353216(0x3f800000, float:1.0)
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 >= 0) goto L53
            java.util.List<com.google.android.material.progressindicator.DrawingDelegate$ActiveIndicator> r0 = r4.activeIndicators
            r2 = 2
            java.lang.Object r0 = r0.get(r2)
            com.google.android.material.progressindicator.DrawingDelegate$ActiveIndicator r0 = (com.google.android.material.progressindicator.DrawingDelegate.ActiveIndicator) r0
            java.util.List<com.google.android.material.progressindicator.DrawingDelegate$ActiveIndicator> r2 = r4.activeIndicators
            java.lang.Object r2 = r2.get(r1)
            com.google.android.material.progressindicator.DrawingDelegate$ActiveIndicator r2 = (com.google.android.material.progressindicator.DrawingDelegate.ActiveIndicator) r2
            int r2 = r2.color
            r0.color = r2
            java.util.List<com.google.android.material.progressindicator.DrawingDelegate$ActiveIndicator> r0 = r4.activeIndicators
            java.lang.Object r0 = r0.get(r1)
            com.google.android.material.progressindicator.DrawingDelegate$ActiveIndicator r0 = (com.google.android.material.progressindicator.DrawingDelegate.ActiveIndicator) r0
            java.util.List<com.google.android.material.progressindicator.DrawingDelegate$ActiveIndicator> r1 = r4.activeIndicators
            r2 = 0
            java.lang.Object r1 = r1.get(r2)
            com.google.android.material.progressindicator.DrawingDelegate$ActiveIndicator r1 = (com.google.android.material.progressindicator.DrawingDelegate.ActiveIndicator) r1
            int r1 = r1.color
            r0.color = r1
            java.util.List<com.google.android.material.progressindicator.DrawingDelegate$ActiveIndicator> r0 = r4.activeIndicators
            java.lang.Object r0 = r0.get(r2)
            com.google.android.material.progressindicator.DrawingDelegate$ActiveIndicator r0 = (com.google.android.material.progressindicator.DrawingDelegate.ActiveIndicator) r0
            com.google.android.material.progressindicator.BaseProgressIndicatorSpec r1 = r4.baseSpec
            int[] r1 = r1.indicatorColors
            int r3 = r4.newIndicatorColorIndex
            r1 = r1[r3]
            r0.color = r1
            r4.dirtyColors = r2
        L53:
            return
    }

    private void updateSegmentPositions(int r5) {
            r4 = this;
            java.util.List<com.google.android.material.progressindicator.DrawingDelegate$ActiveIndicator> r0 = r4.activeIndicators
            r1 = 0
            java.lang.Object r0 = r0.get(r1)
            com.google.android.material.progressindicator.DrawingDelegate$ActiveIndicator r0 = (com.google.android.material.progressindicator.DrawingDelegate.ActiveIndicator) r0
            r2 = 0
            r0.startFraction = r2
            r0 = 667(0x29b, float:9.35E-43)
            float r5 = r4.getFractionInRange(r5, r1, r0)
            java.util.List<com.google.android.material.progressindicator.DrawingDelegate$ActiveIndicator> r0 = r4.activeIndicators
            java.lang.Object r0 = r0.get(r1)
            com.google.android.material.progressindicator.DrawingDelegate$ActiveIndicator r0 = (com.google.android.material.progressindicator.DrawingDelegate.ActiveIndicator) r0
            java.util.List<com.google.android.material.progressindicator.DrawingDelegate$ActiveIndicator> r1 = r4.activeIndicators
            r2 = 1
            java.lang.Object r1 = r1.get(r2)
            com.google.android.material.progressindicator.DrawingDelegate$ActiveIndicator r1 = (com.google.android.material.progressindicator.DrawingDelegate.ActiveIndicator) r1
            androidx.interpolator.view.animation.FastOutSlowInInterpolator r3 = r4.interpolator
            float r3 = r3.getInterpolation(r5)
            r1.startFraction = r3
            r0.endFraction = r3
            r0 = 1056939455(0x3eff9dbf, float:0.49925038)
            float r5 = r5 + r0
            java.util.List<com.google.android.material.progressindicator.DrawingDelegate$ActiveIndicator> r0 = r4.activeIndicators
            java.lang.Object r0 = r0.get(r2)
            com.google.android.material.progressindicator.DrawingDelegate$ActiveIndicator r0 = (com.google.android.material.progressindicator.DrawingDelegate.ActiveIndicator) r0
            java.util.List<com.google.android.material.progressindicator.DrawingDelegate$ActiveIndicator> r1 = r4.activeIndicators
            r2 = 2
            java.lang.Object r1 = r1.get(r2)
            com.google.android.material.progressindicator.DrawingDelegate$ActiveIndicator r1 = (com.google.android.material.progressindicator.DrawingDelegate.ActiveIndicator) r1
            androidx.interpolator.view.animation.FastOutSlowInInterpolator r3 = r4.interpolator
            float r5 = r3.getInterpolation(r5)
            r1.startFraction = r5
            r0.endFraction = r5
            java.util.List<com.google.android.material.progressindicator.DrawingDelegate$ActiveIndicator> r5 = r4.activeIndicators
            java.lang.Object r5 = r5.get(r2)
            com.google.android.material.progressindicator.DrawingDelegate$ActiveIndicator r5 = (com.google.android.material.progressindicator.DrawingDelegate.ActiveIndicator) r5
            r0 = 1065353216(0x3f800000, float:1.0)
            r5.endFraction = r0
            return
    }

    @Override // com.google.android.material.progressindicator.IndeterminateAnimatorDelegate
    public void cancelAnimatorImmediately() {
            r1 = this;
            android.animation.ObjectAnimator r0 = r1.animator
            if (r0 == 0) goto L7
            r0.cancel()
        L7:
            return
    }

    @Override // com.google.android.material.progressindicator.IndeterminateAnimatorDelegate
    public void invalidateSpecValues() {
            r0 = this;
            r0.resetPropertiesForNewStart()
            return
    }

    @Override // com.google.android.material.progressindicator.IndeterminateAnimatorDelegate
    public void registerAnimatorsCompleteCallback(androidx.vectordrawable.graphics.drawable.Animatable2Compat.AnimationCallback r1) {
            r0 = this;
            return
    }

    @Override // com.google.android.material.progressindicator.IndeterminateAnimatorDelegate
    public void requestCancelAnimatorAfterCurrentCycle() {
            r0 = this;
            return
    }

    @Override // com.google.android.material.progressindicator.IndeterminateAnimatorDelegate
    void resetPropertiesForNewStart() {
            r4 = this;
            r0 = 1
            r4.dirtyColors = r0
            r4.newIndicatorColorIndex = r0
            java.util.List<com.google.android.material.progressindicator.DrawingDelegate$ActiveIndicator> r0 = r4.activeIndicators
            java.util.Iterator r0 = r0.iterator()
        Lb:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L29
            java.lang.Object r1 = r0.next()
            com.google.android.material.progressindicator.DrawingDelegate$ActiveIndicator r1 = (com.google.android.material.progressindicator.DrawingDelegate.ActiveIndicator) r1
            com.google.android.material.progressindicator.BaseProgressIndicatorSpec r2 = r4.baseSpec
            int[] r2 = r2.indicatorColors
            r3 = 0
            r2 = r2[r3]
            r1.color = r2
            com.google.android.material.progressindicator.BaseProgressIndicatorSpec r2 = r4.baseSpec
            int r2 = r2.indicatorTrackGapSize
            int r2 = r2 / 2
            r1.gapSize = r2
            goto Lb
        L29:
            return
    }

    @Override // com.google.android.material.progressindicator.IndeterminateAnimatorDelegate
    void setAnimationFraction(float r2) {
            r1 = this;
            r1.animationFraction = r2
            r0 = 1134985216(0x43a68000, float:333.0)
            float r2 = r2 * r0
            int r2 = (int) r2
            r1.updateSegmentPositions(r2)
            r1.maybeUpdateSegmentColors()
            com.google.android.material.progressindicator.IndeterminateDrawable r2 = r1.drawable
            r2.invalidateSelf()
            return
    }

    @Override // com.google.android.material.progressindicator.IndeterminateAnimatorDelegate
    public void startAnimator() {
            r1 = this;
            r1.maybeInitializeAnimators()
            r1.resetPropertiesForNewStart()
            android.animation.ObjectAnimator r0 = r1.animator
            r0.start()
            return
    }

    @Override // com.google.android.material.progressindicator.IndeterminateAnimatorDelegate
    public void unregisterAnimatorsCompleteCallback() {
            r0 = this;
            return
    }
}
