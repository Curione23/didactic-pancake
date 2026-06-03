package com.google.android.material.progressindicator;

/* JADX INFO: loaded from: classes.dex */
final class LinearIndeterminateDisjointAnimatorDelegate extends com.google.android.material.progressindicator.IndeterminateAnimatorDelegate<android.animation.ObjectAnimator> {
    private static final android.util.Property<com.google.android.material.progressindicator.LinearIndeterminateDisjointAnimatorDelegate, java.lang.Float> ANIMATION_FRACTION = null;
    private static final int[] DELAY_TO_MOVE_SEGMENT_ENDS = null;
    private static final int[] DURATION_TO_MOVE_SEGMENT_ENDS = null;
    private static final int TOTAL_DURATION_IN_MS = 1800;
    private float animationFraction;
    private android.animation.ObjectAnimator animator;
    androidx.vectordrawable.graphics.drawable.Animatable2Compat.AnimationCallback animatorCompleteCallback;
    private final com.google.android.material.progressindicator.BaseProgressIndicatorSpec baseSpec;
    private android.animation.ObjectAnimator completeEndAnimator;
    private boolean dirtyColors;
    private int indicatorColorIndex;
    private final android.view.animation.Interpolator[] interpolatorArray;




    static {
            r0 = 850(0x352, float:1.191E-42)
            r1 = 750(0x2ee, float:1.051E-42)
            r2 = 533(0x215, float:7.47E-43)
            r3 = 567(0x237, float:7.95E-43)
            int[] r0 = new int[]{r2, r3, r0, r1}
            com.google.android.material.progressindicator.LinearIndeterminateDisjointAnimatorDelegate.DURATION_TO_MOVE_SEGMENT_ENDS = r0
            r0 = 333(0x14d, float:4.67E-43)
            r1 = 0
            r2 = 1267(0x4f3, float:1.775E-42)
            r3 = 1000(0x3e8, float:1.401E-42)
            int[] r0 = new int[]{r2, r3, r0, r1}
            com.google.android.material.progressindicator.LinearIndeterminateDisjointAnimatorDelegate.DELAY_TO_MOVE_SEGMENT_ENDS = r0
            com.google.android.material.progressindicator.LinearIndeterminateDisjointAnimatorDelegate$3 r0 = new com.google.android.material.progressindicator.LinearIndeterminateDisjointAnimatorDelegate$3
            java.lang.Class<java.lang.Float> r1 = java.lang.Float.class
            java.lang.String r2 = "animationFraction"
            r0.<init>(r1, r2)
            com.google.android.material.progressindicator.LinearIndeterminateDisjointAnimatorDelegate.ANIMATION_FRACTION = r0
            return
    }

    public LinearIndeterminateDisjointAnimatorDelegate(android.content.Context r4, com.google.android.material.progressindicator.LinearProgressIndicatorSpec r5) {
            r3 = this;
            r0 = 2
            r3.<init>(r0)
            r1 = 0
            r3.indicatorColorIndex = r1
            r2 = 0
            r3.animatorCompleteCallback = r2
            r3.baseSpec = r5
            r5 = 4
            android.view.animation.Interpolator[] r5 = new android.view.animation.Interpolator[r5]
            int r2 = com.google.android.material.R.anim.linear_indeterminate_line1_head_interpolator
            android.view.animation.Interpolator r2 = androidx.vectordrawable.graphics.drawable.AnimationUtilsCompat.loadInterpolator(r4, r2)
            r5[r1] = r2
            int r1 = com.google.android.material.R.anim.linear_indeterminate_line1_tail_interpolator
            android.view.animation.Interpolator r1 = androidx.vectordrawable.graphics.drawable.AnimationUtilsCompat.loadInterpolator(r4, r1)
            r2 = 1
            r5[r2] = r1
            int r1 = com.google.android.material.R.anim.linear_indeterminate_line2_head_interpolator
            android.view.animation.Interpolator r1 = androidx.vectordrawable.graphics.drawable.AnimationUtilsCompat.loadInterpolator(r4, r1)
            r5[r0] = r1
            int r0 = com.google.android.material.R.anim.linear_indeterminate_line2_tail_interpolator
            android.view.animation.Interpolator r4 = androidx.vectordrawable.graphics.drawable.AnimationUtilsCompat.loadInterpolator(r4, r0)
            r0 = 3
            r5[r0] = r4
            r3.interpolatorArray = r5
            return
    }

    static /* synthetic */ int access$000(com.google.android.material.progressindicator.LinearIndeterminateDisjointAnimatorDelegate r0) {
            int r0 = r0.indicatorColorIndex
            return r0
    }

    static /* synthetic */ int access$002(com.google.android.material.progressindicator.LinearIndeterminateDisjointAnimatorDelegate r0, int r1) {
            r0.indicatorColorIndex = r1
            return r1
    }

    static /* synthetic */ com.google.android.material.progressindicator.BaseProgressIndicatorSpec access$100(com.google.android.material.progressindicator.LinearIndeterminateDisjointAnimatorDelegate r0) {
            com.google.android.material.progressindicator.BaseProgressIndicatorSpec r0 = r0.baseSpec
            return r0
    }

    static /* synthetic */ boolean access$202(com.google.android.material.progressindicator.LinearIndeterminateDisjointAnimatorDelegate r0, boolean r1) {
            r0.dirtyColors = r1
            return r1
    }

    static /* synthetic */ float access$300(com.google.android.material.progressindicator.LinearIndeterminateDisjointAnimatorDelegate r0) {
            float r0 = r0.getAnimationFraction()
            return r0
    }

    private float getAnimationFraction() {
            r1 = this;
            float r0 = r1.animationFraction
            return r0
    }

    private void maybeInitializeAnimators() {
            r7 = this;
            android.animation.ObjectAnimator r0 = r7.animator
            r1 = 0
            r2 = 1800(0x708, double:8.893E-321)
            if (r0 != 0) goto L2d
            android.util.Property<com.google.android.material.progressindicator.LinearIndeterminateDisjointAnimatorDelegate, java.lang.Float> r0 = com.google.android.material.progressindicator.LinearIndeterminateDisjointAnimatorDelegate.ANIMATION_FRACTION
            r4 = 2
            float[] r4 = new float[r4]
            r4 = {x0054: FILL_ARRAY_DATA , data: [0, 1065353216} // fill-array
            android.animation.ObjectAnimator r0 = android.animation.ObjectAnimator.ofFloat(r7, r0, r4)
            r7.animator = r0
            r0.setDuration(r2)
            android.animation.ObjectAnimator r0 = r7.animator
            r0.setInterpolator(r1)
            android.animation.ObjectAnimator r0 = r7.animator
            r4 = -1
            r0.setRepeatCount(r4)
            android.animation.ObjectAnimator r0 = r7.animator
            com.google.android.material.progressindicator.LinearIndeterminateDisjointAnimatorDelegate$1 r4 = new com.google.android.material.progressindicator.LinearIndeterminateDisjointAnimatorDelegate$1
            r4.<init>(r7)
            r0.addListener(r4)
        L2d:
            android.animation.ObjectAnimator r0 = r7.completeEndAnimator
            if (r0 != 0) goto L53
            android.util.Property<com.google.android.material.progressindicator.LinearIndeterminateDisjointAnimatorDelegate, java.lang.Float> r0 = com.google.android.material.progressindicator.LinearIndeterminateDisjointAnimatorDelegate.ANIMATION_FRACTION
            r4 = 1
            float[] r4 = new float[r4]
            r5 = 0
            r6 = 1065353216(0x3f800000, float:1.0)
            r4[r5] = r6
            android.animation.ObjectAnimator r0 = android.animation.ObjectAnimator.ofFloat(r7, r0, r4)
            r7.completeEndAnimator = r0
            r0.setDuration(r2)
            android.animation.ObjectAnimator r0 = r7.completeEndAnimator
            r0.setInterpolator(r1)
            android.animation.ObjectAnimator r0 = r7.completeEndAnimator
            com.google.android.material.progressindicator.LinearIndeterminateDisjointAnimatorDelegate$2 r1 = new com.google.android.material.progressindicator.LinearIndeterminateDisjointAnimatorDelegate$2
            r1.<init>(r7)
            r0.addListener(r1)
        L53:
            return
    }

    private void maybeUpdateSegmentColors() {
            r4 = this;
            boolean r0 = r4.dirtyColors
            if (r0 == 0) goto L24
            java.util.List<com.google.android.material.progressindicator.DrawingDelegate$ActiveIndicator> r0 = r4.activeIndicators
            java.util.Iterator r0 = r0.iterator()
        La:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L21
            java.lang.Object r1 = r0.next()
            com.google.android.material.progressindicator.DrawingDelegate$ActiveIndicator r1 = (com.google.android.material.progressindicator.DrawingDelegate.ActiveIndicator) r1
            com.google.android.material.progressindicator.BaseProgressIndicatorSpec r2 = r4.baseSpec
            int[] r2 = r2.indicatorColors
            int r3 = r4.indicatorColorIndex
            r2 = r2[r3]
            r1.color = r2
            goto La
        L21:
            r0 = 0
            r4.dirtyColors = r0
        L24:
            return
    }

    private void updateSegmentPositions(int r9) {
            r8 = this;
            r0 = 0
        L1:
            java.util.List<com.google.android.material.progressindicator.DrawingDelegate$ActiveIndicator> r1 = r8.activeIndicators
            int r1 = r1.size()
            if (r0 >= r1) goto L4b
            java.util.List<com.google.android.material.progressindicator.DrawingDelegate$ActiveIndicator> r1 = r8.activeIndicators
            java.lang.Object r1 = r1.get(r0)
            com.google.android.material.progressindicator.DrawingDelegate$ActiveIndicator r1 = (com.google.android.material.progressindicator.DrawingDelegate.ActiveIndicator) r1
            int[] r2 = com.google.android.material.progressindicator.LinearIndeterminateDisjointAnimatorDelegate.DELAY_TO_MOVE_SEGMENT_ENDS
            int r3 = r0 * 2
            r4 = r2[r3]
            int[] r5 = com.google.android.material.progressindicator.LinearIndeterminateDisjointAnimatorDelegate.DURATION_TO_MOVE_SEGMENT_ENDS
            r6 = r5[r3]
            float r4 = r8.getFractionInRange(r9, r4, r6)
            android.view.animation.Interpolator[] r6 = r8.interpolatorArray
            r6 = r6[r3]
            float r4 = r6.getInterpolation(r4)
            r6 = 0
            r7 = 1065353216(0x3f800000, float:1.0)
            float r4 = androidx.core.math.MathUtils.clamp(r4, r6, r7)
            r1.startFraction = r4
            int r3 = r3 + 1
            r2 = r2[r3]
            r4 = r5[r3]
            float r2 = r8.getFractionInRange(r9, r2, r4)
            android.view.animation.Interpolator[] r4 = r8.interpolatorArray
            r3 = r4[r3]
            float r2 = r3.getInterpolation(r2)
            float r2 = androidx.core.math.MathUtils.clamp(r2, r6, r7)
            r1.endFraction = r2
            int r0 = r0 + 1
            goto L1
        L4b:
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
            r0.animatorCompleteCallback = r1
            return
    }

    @Override // com.google.android.material.progressindicator.IndeterminateAnimatorDelegate
    public void requestCancelAnimatorAfterCurrentCycle() {
            r4 = this;
            android.animation.ObjectAnimator r0 = r4.completeEndAnimator
            if (r0 == 0) goto L39
            boolean r0 = r0.isRunning()
            if (r0 == 0) goto Lb
            goto L39
        Lb:
            r4.cancelAnimatorImmediately()
            com.google.android.material.progressindicator.IndeterminateDrawable r0 = r4.drawable
            boolean r0 = r0.isVisible()
            if (r0 == 0) goto L39
            android.animation.ObjectAnimator r0 = r4.completeEndAnimator
            float r1 = r4.animationFraction
            r2 = 2
            float[] r2 = new float[r2]
            r3 = 0
            r2[r3] = r1
            r1 = 1
            r3 = 1065353216(0x3f800000, float:1.0)
            r2[r1] = r3
            r0.setFloatValues(r2)
            android.animation.ObjectAnimator r0 = r4.completeEndAnimator
            float r1 = r4.animationFraction
            float r3 = r3 - r1
            r1 = 1155596288(0x44e10000, float:1800.0)
            float r3 = r3 * r1
            long r1 = (long) r3
            r0.setDuration(r1)
            android.animation.ObjectAnimator r0 = r4.completeEndAnimator
            r0.start()
        L39:
            return
    }

    @Override // com.google.android.material.progressindicator.IndeterminateAnimatorDelegate
    void resetPropertiesForNewStart() {
            r4 = this;
            r0 = 0
            r4.indicatorColorIndex = r0
            java.util.List<com.google.android.material.progressindicator.DrawingDelegate$ActiveIndicator> r1 = r4.activeIndicators
            java.util.Iterator r1 = r1.iterator()
        L9:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L1e
            java.lang.Object r2 = r1.next()
            com.google.android.material.progressindicator.DrawingDelegate$ActiveIndicator r2 = (com.google.android.material.progressindicator.DrawingDelegate.ActiveIndicator) r2
            com.google.android.material.progressindicator.BaseProgressIndicatorSpec r3 = r4.baseSpec
            int[] r3 = r3.indicatorColors
            r3 = r3[r0]
            r2.color = r3
            goto L9
        L1e:
            return
    }

    @Override // com.google.android.material.progressindicator.IndeterminateAnimatorDelegate
    void setAnimationFraction(float r2) {
            r1 = this;
            r1.animationFraction = r2
            r0 = 1155596288(0x44e10000, float:1800.0)
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
            r1 = this;
            r0 = 0
            r1.animatorCompleteCallback = r0
            return
    }
}
