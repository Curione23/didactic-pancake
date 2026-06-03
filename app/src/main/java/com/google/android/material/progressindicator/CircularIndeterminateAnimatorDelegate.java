package com.google.android.material.progressindicator;

/* JADX INFO: loaded from: classes.dex */
final class CircularIndeterminateAnimatorDelegate extends com.google.android.material.progressindicator.IndeterminateAnimatorDelegate<android.animation.ObjectAnimator> {
    private static final android.util.Property<com.google.android.material.progressindicator.CircularIndeterminateAnimatorDelegate, java.lang.Float> ANIMATION_FRACTION = null;
    private static final android.util.Property<com.google.android.material.progressindicator.CircularIndeterminateAnimatorDelegate, java.lang.Float> COMPLETE_END_FRACTION = null;
    private static final int CONSTANT_ROTATION_DEGREES = 1520;
    private static final int[] DELAY_TO_COLLAPSE_IN_MS = null;
    private static final int[] DELAY_TO_EXPAND_IN_MS = null;
    private static final int[] DELAY_TO_FADE_IN_MS = null;
    private static final int DURATION_TO_COLLAPSE_IN_MS = 667;
    private static final int DURATION_TO_COMPLETE_END_IN_MS = 333;
    private static final int DURATION_TO_EXPAND_IN_MS = 667;
    private static final int DURATION_TO_FADE_IN_MS = 333;
    private static final int EXTRA_DEGREES_PER_CYCLE = 250;
    private static final int TAIL_DEGREES_OFFSET = -20;
    private static final int TOTAL_CYCLES = 4;
    private static final int TOTAL_DURATION_IN_MS = 5400;
    private float animationFraction;
    private android.animation.ObjectAnimator animator;
    androidx.vectordrawable.graphics.drawable.Animatable2Compat.AnimationCallback animatorCompleteCallback;
    private final com.google.android.material.progressindicator.BaseProgressIndicatorSpec baseSpec;
    private android.animation.ObjectAnimator completeEndAnimator;
    private float completeEndFraction;
    private int indicatorColorIndexOffset;
    private final androidx.interpolator.view.animation.FastOutSlowInInterpolator interpolator;





    static {
            r0 = 2700(0xa8c, float:3.784E-42)
            r1 = 4050(0xfd2, float:5.675E-42)
            r2 = 0
            r3 = 1350(0x546, float:1.892E-42)
            int[] r0 = new int[]{r2, r3, r0, r1}
            com.google.android.material.progressindicator.CircularIndeterminateAnimatorDelegate.DELAY_TO_EXPAND_IN_MS = r0
            r0 = 3367(0xd27, float:4.718E-42)
            r1 = 4717(0x126d, float:6.61E-42)
            r2 = 667(0x29b, float:9.35E-43)
            r3 = 2017(0x7e1, float:2.826E-42)
            int[] r0 = new int[]{r2, r3, r0, r1}
            com.google.android.material.progressindicator.CircularIndeterminateAnimatorDelegate.DELAY_TO_COLLAPSE_IN_MS = r0
            r0 = 3700(0xe74, float:5.185E-42)
            r1 = 5050(0x13ba, float:7.077E-42)
            r2 = 1000(0x3e8, float:1.401E-42)
            r3 = 2350(0x92e, float:3.293E-42)
            int[] r0 = new int[]{r2, r3, r0, r1}
            com.google.android.material.progressindicator.CircularIndeterminateAnimatorDelegate.DELAY_TO_FADE_IN_MS = r0
            com.google.android.material.progressindicator.CircularIndeterminateAnimatorDelegate$3 r0 = new com.google.android.material.progressindicator.CircularIndeterminateAnimatorDelegate$3
            java.lang.Class<java.lang.Float> r1 = java.lang.Float.class
            java.lang.String r2 = "animationFraction"
            r0.<init>(r1, r2)
            com.google.android.material.progressindicator.CircularIndeterminateAnimatorDelegate.ANIMATION_FRACTION = r0
            com.google.android.material.progressindicator.CircularIndeterminateAnimatorDelegate$4 r0 = new com.google.android.material.progressindicator.CircularIndeterminateAnimatorDelegate$4
            java.lang.Class<java.lang.Float> r1 = java.lang.Float.class
            java.lang.String r2 = "completeEndFraction"
            r0.<init>(r1, r2)
            com.google.android.material.progressindicator.CircularIndeterminateAnimatorDelegate.COMPLETE_END_FRACTION = r0
            return
    }

    public CircularIndeterminateAnimatorDelegate(com.google.android.material.progressindicator.CircularProgressIndicatorSpec r2) {
            r1 = this;
            r0 = 1
            r1.<init>(r0)
            r0 = 0
            r1.indicatorColorIndexOffset = r0
            r0 = 0
            r1.animatorCompleteCallback = r0
            r1.baseSpec = r2
            androidx.interpolator.view.animation.FastOutSlowInInterpolator r2 = new androidx.interpolator.view.animation.FastOutSlowInInterpolator
            r2.<init>()
            r1.interpolator = r2
            return
    }

    static /* synthetic */ int access$000(com.google.android.material.progressindicator.CircularIndeterminateAnimatorDelegate r0) {
            int r0 = r0.indicatorColorIndexOffset
            return r0
    }

    static /* synthetic */ int access$002(com.google.android.material.progressindicator.CircularIndeterminateAnimatorDelegate r0, int r1) {
            r0.indicatorColorIndexOffset = r1
            return r1
    }

    static /* synthetic */ com.google.android.material.progressindicator.BaseProgressIndicatorSpec access$100(com.google.android.material.progressindicator.CircularIndeterminateAnimatorDelegate r0) {
            com.google.android.material.progressindicator.BaseProgressIndicatorSpec r0 = r0.baseSpec
            return r0
    }

    static /* synthetic */ float access$200(com.google.android.material.progressindicator.CircularIndeterminateAnimatorDelegate r0) {
            float r0 = r0.getAnimationFraction()
            return r0
    }

    static /* synthetic */ float access$300(com.google.android.material.progressindicator.CircularIndeterminateAnimatorDelegate r0) {
            float r0 = r0.getCompleteEndFraction()
            return r0
    }

    static /* synthetic */ void access$400(com.google.android.material.progressindicator.CircularIndeterminateAnimatorDelegate r0, float r1) {
            r0.setCompleteEndFraction(r1)
            return
    }

    private float getAnimationFraction() {
            r1 = this;
            float r0 = r1.animationFraction
            return r0
    }

    private float getCompleteEndFraction() {
            r1 = this;
            float r0 = r1.completeEndFraction
            return r0
    }

    private void maybeInitializeAnimators() {
            r4 = this;
            android.animation.ObjectAnimator r0 = r4.animator
            r1 = 2
            if (r0 != 0) goto L2d
            android.util.Property<com.google.android.material.progressindicator.CircularIndeterminateAnimatorDelegate, java.lang.Float> r0 = com.google.android.material.progressindicator.CircularIndeterminateAnimatorDelegate.ANIMATION_FRACTION
            float[] r2 = new float[r1]
            r2 = {x0056: FILL_ARRAY_DATA , data: [0, 1065353216} // fill-array
            android.animation.ObjectAnimator r0 = android.animation.ObjectAnimator.ofFloat(r4, r0, r2)
            r4.animator = r0
            r2 = 5400(0x1518, double:2.668E-320)
            r0.setDuration(r2)
            android.animation.ObjectAnimator r0 = r4.animator
            r2 = 0
            r0.setInterpolator(r2)
            android.animation.ObjectAnimator r0 = r4.animator
            r2 = -1
            r0.setRepeatCount(r2)
            android.animation.ObjectAnimator r0 = r4.animator
            com.google.android.material.progressindicator.CircularIndeterminateAnimatorDelegate$1 r2 = new com.google.android.material.progressindicator.CircularIndeterminateAnimatorDelegate$1
            r2.<init>(r4)
            r0.addListener(r2)
        L2d:
            android.animation.ObjectAnimator r0 = r4.completeEndAnimator
            if (r0 != 0) goto L54
            android.util.Property<com.google.android.material.progressindicator.CircularIndeterminateAnimatorDelegate, java.lang.Float> r0 = com.google.android.material.progressindicator.CircularIndeterminateAnimatorDelegate.COMPLETE_END_FRACTION
            float[] r1 = new float[r1]
            r1 = {x005e: FILL_ARRAY_DATA , data: [0, 1065353216} // fill-array
            android.animation.ObjectAnimator r0 = android.animation.ObjectAnimator.ofFloat(r4, r0, r1)
            r4.completeEndAnimator = r0
            r1 = 333(0x14d, double:1.645E-321)
            r0.setDuration(r1)
            android.animation.ObjectAnimator r0 = r4.completeEndAnimator
            androidx.interpolator.view.animation.FastOutSlowInInterpolator r1 = r4.interpolator
            r0.setInterpolator(r1)
            android.animation.ObjectAnimator r0 = r4.completeEndAnimator
            com.google.android.material.progressindicator.CircularIndeterminateAnimatorDelegate$2 r1 = new com.google.android.material.progressindicator.CircularIndeterminateAnimatorDelegate$2
            r1.<init>(r4)
            r0.addListener(r1)
        L54:
            return
    }

    private void maybeUpdateSegmentColors(int r5) {
            r4 = this;
            r0 = 0
            r1 = r0
        L2:
            r2 = 4
            if (r1 >= r2) goto L5f
            int[] r2 = com.google.android.material.progressindicator.CircularIndeterminateAnimatorDelegate.DELAY_TO_FADE_IN_MS
            r2 = r2[r1]
            r3 = 333(0x14d, float:4.67E-43)
            float r2 = r4.getFractionInRange(r5, r2, r3)
            r3 = 0
            int r3 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r3 < 0) goto L5c
            r3 = 1065353216(0x3f800000, float:1.0)
            int r3 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r3 > 0) goto L5c
            int r5 = r4.indicatorColorIndexOffset
            int r1 = r1 + r5
            com.google.android.material.progressindicator.BaseProgressIndicatorSpec r5 = r4.baseSpec
            int[] r5 = r5.indicatorColors
            int r5 = r5.length
            int r1 = r1 % r5
            int r5 = r1 + 1
            com.google.android.material.progressindicator.BaseProgressIndicatorSpec r3 = r4.baseSpec
            int[] r3 = r3.indicatorColors
            int r3 = r3.length
            int r5 = r5 % r3
            com.google.android.material.progressindicator.BaseProgressIndicatorSpec r3 = r4.baseSpec
            int[] r3 = r3.indicatorColors
            r1 = r3[r1]
            com.google.android.material.progressindicator.BaseProgressIndicatorSpec r3 = r4.baseSpec
            int[] r3 = r3.indicatorColors
            r5 = r3[r5]
            androidx.interpolator.view.animation.FastOutSlowInInterpolator r3 = r4.interpolator
            float r2 = r3.getInterpolation(r2)
            java.util.List<com.google.android.material.progressindicator.DrawingDelegate$ActiveIndicator> r3 = r4.activeIndicators
            java.lang.Object r0 = r3.get(r0)
            com.google.android.material.progressindicator.DrawingDelegate$ActiveIndicator r0 = (com.google.android.material.progressindicator.DrawingDelegate.ActiveIndicator) r0
            com.google.android.material.animation.ArgbEvaluatorCompat r3 = com.google.android.material.animation.ArgbEvaluatorCompat.getInstance()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            java.lang.Integer r5 = r3.evaluate2(r2, r1, r5)
            int r5 = r5.intValue()
            r0.color = r5
            goto L5f
        L5c:
            int r1 = r1 + 1
            goto L2
        L5f:
            return
    }

    private void setCompleteEndFraction(float r1) {
            r0 = this;
            r0.completeEndFraction = r1
            return
    }

    private void updateSegmentPositions(int r7) {
            r6 = this;
            java.util.List<com.google.android.material.progressindicator.DrawingDelegate$ActiveIndicator> r0 = r6.activeIndicators
            r1 = 0
            java.lang.Object r0 = r0.get(r1)
            com.google.android.material.progressindicator.DrawingDelegate$ActiveIndicator r0 = (com.google.android.material.progressindicator.DrawingDelegate.ActiveIndicator) r0
            float r2 = r6.animationFraction
            r3 = 1153302528(0x44be0000, float:1520.0)
            float r2 = r2 * r3
            r4 = -1046478848(0xffffffffc1a00000, float:-20.0)
            float r2 = r2 + r4
            r0.startFraction = r2
            float r2 = r6.animationFraction
            float r2 = r2 * r3
            r0.endFraction = r2
        L18:
            r2 = 4
            if (r1 >= r2) goto L4a
            int[] r2 = com.google.android.material.progressindicator.CircularIndeterminateAnimatorDelegate.DELAY_TO_EXPAND_IN_MS
            r2 = r2[r1]
            r3 = 667(0x29b, float:9.35E-43)
            float r2 = r6.getFractionInRange(r7, r2, r3)
            float r4 = r0.endFraction
            androidx.interpolator.view.animation.FastOutSlowInInterpolator r5 = r6.interpolator
            float r2 = r5.getInterpolation(r2)
            r5 = 1132068864(0x437a0000, float:250.0)
            float r2 = r2 * r5
            float r4 = r4 + r2
            r0.endFraction = r4
            int[] r2 = com.google.android.material.progressindicator.CircularIndeterminateAnimatorDelegate.DELAY_TO_COLLAPSE_IN_MS
            r2 = r2[r1]
            float r2 = r6.getFractionInRange(r7, r2, r3)
            float r3 = r0.startFraction
            androidx.interpolator.view.animation.FastOutSlowInInterpolator r4 = r6.interpolator
            float r2 = r4.getInterpolation(r2)
            float r2 = r2 * r5
            float r3 = r3 + r2
            r0.startFraction = r3
            int r1 = r1 + 1
            goto L18
        L4a:
            float r7 = r0.startFraction
            float r1 = r0.endFraction
            float r2 = r0.startFraction
            float r1 = r1 - r2
            float r2 = r6.completeEndFraction
            float r1 = r1 * r2
            float r7 = r7 + r1
            r0.startFraction = r7
            float r7 = r0.startFraction
            r1 = 1135869952(0x43b40000, float:360.0)
            float r7 = r7 / r1
            r0.startFraction = r7
            float r7 = r0.endFraction
            float r7 = r7 / r1
            r0.endFraction = r7
            return
    }

    @Override // com.google.android.material.progressindicator.IndeterminateAnimatorDelegate
    void cancelAnimatorImmediately() {
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
            r0.animatorCompleteCallback = r1
            return
    }

    @Override // com.google.android.material.progressindicator.IndeterminateAnimatorDelegate
    void requestCancelAnimatorAfterCurrentCycle() {
            r1 = this;
            android.animation.ObjectAnimator r0 = r1.completeEndAnimator
            if (r0 == 0) goto L1c
            boolean r0 = r0.isRunning()
            if (r0 == 0) goto Lb
            goto L1c
        Lb:
            com.google.android.material.progressindicator.IndeterminateDrawable r0 = r1.drawable
            boolean r0 = r0.isVisible()
            if (r0 == 0) goto L19
            android.animation.ObjectAnimator r0 = r1.completeEndAnimator
            r0.start()
            goto L1c
        L19:
            r1.cancelAnimatorImmediately()
        L1c:
            return
    }

    @Override // com.google.android.material.progressindicator.IndeterminateAnimatorDelegate
    void resetPropertiesForNewStart() {
            r3 = this;
            r0 = 0
            r3.indicatorColorIndexOffset = r0
            java.util.List<com.google.android.material.progressindicator.DrawingDelegate$ActiveIndicator> r1 = r3.activeIndicators
            java.lang.Object r1 = r1.get(r0)
            com.google.android.material.progressindicator.DrawingDelegate$ActiveIndicator r1 = (com.google.android.material.progressindicator.DrawingDelegate.ActiveIndicator) r1
            com.google.android.material.progressindicator.BaseProgressIndicatorSpec r2 = r3.baseSpec
            int[] r2 = r2.indicatorColors
            r0 = r2[r0]
            r1.color = r0
            r0 = 0
            r3.completeEndFraction = r0
            return
    }

    @Override // com.google.android.material.progressindicator.IndeterminateAnimatorDelegate
    void setAnimationFraction(float r2) {
            r1 = this;
            r1.animationFraction = r2
            r0 = 1168687104(0x45a8c000, float:5400.0)
            float r2 = r2 * r0
            int r2 = (int) r2
            r1.updateSegmentPositions(r2)
            r1.maybeUpdateSegmentColors(r2)
            com.google.android.material.progressindicator.IndeterminateDrawable r2 = r1.drawable
            r2.invalidateSelf()
            return
    }

    @Override // com.google.android.material.progressindicator.IndeterminateAnimatorDelegate
    void startAnimator() {
            r1 = this;
            r1.maybeInitializeAnimators()
            r1.resetPropertiesForNewStart()
            android.animation.ObjectAnimator r0 = r1.animator
            r0.start()
            return
    }

    @Override // com.google.android.material.progressindicator.IndeterminateAnimatorDelegate
    public void unregisterAnimatorsCompleteCallback() {
            r1 = this;
            r0 = 0
            r1.animatorCompleteCallback = r0
            return
    }
}
