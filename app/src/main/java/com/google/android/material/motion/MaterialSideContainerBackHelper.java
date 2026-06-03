package com.google.android.material.motion;

/* JADX INFO: loaded from: classes.dex */
public class MaterialSideContainerBackHelper extends com.google.android.material.motion.MaterialBackAnimationHelper<android.view.View> {
    private final float maxScaleXDistanceGrow;
    private final float maxScaleXDistanceShrink;
    private final float maxScaleYDistance;


    public MaterialSideContainerBackHelper(android.view.View r2) {
            r1 = this;
            r1.<init>(r2)
            android.content.res.Resources r2 = r2.getResources()
            int r0 = com.google.android.material.R.dimen.m3_back_progress_side_container_max_scale_x_distance_shrink
            float r0 = r2.getDimension(r0)
            r1.maxScaleXDistanceShrink = r0
            int r0 = com.google.android.material.R.dimen.m3_back_progress_side_container_max_scale_x_distance_grow
            float r0 = r2.getDimension(r0)
            r1.maxScaleXDistanceGrow = r0
            int r0 = com.google.android.material.R.dimen.m3_back_progress_side_container_max_scale_y_distance
            float r2 = r2.getDimension(r0)
            r1.maxScaleYDistance = r2
            return
    }

    private boolean checkAbsoluteGravity(int r2, int r3) {
            r1 = this;
            V extends android.view.View r0 = r1.view
            int r0 = androidx.core.view.ViewCompat.getLayoutDirection(r0)
            int r2 = androidx.core.view.GravityCompat.getAbsoluteGravity(r2, r0)
            r2 = r2 & r3
            if (r2 != r3) goto Lf
            r2 = 1
            goto L10
        Lf:
            r2 = 0
        L10:
            return r2
    }

    private int getEdgeMargin(boolean r3) {
            r2 = this;
            V extends android.view.View r0 = r2.view
            android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()
            boolean r1 = r0 instanceof android.view.ViewGroup.MarginLayoutParams
            if (r1 == 0) goto L14
            android.view.ViewGroup$MarginLayoutParams r0 = (android.view.ViewGroup.MarginLayoutParams) r0
            if (r3 == 0) goto L11
            int r3 = r0.leftMargin
            goto L13
        L11:
            int r3 = r0.rightMargin
        L13:
            return r3
        L14:
            r3 = 0
            return r3
    }

    public void cancelBackProgress() {
            r10 = this;
            androidx.activity.BackEventCompat r0 = super.onCancelBackProgress()
            if (r0 != 0) goto L7
            return
        L7:
            android.animation.AnimatorSet r0 = new android.animation.AnimatorSet
            r0.<init>()
            r1 = 2
            android.animation.Animator[] r1 = new android.animation.Animator[r1]
            V extends android.view.View r2 = r10.view
            android.util.Property r3 = android.view.View.SCALE_X
            r4 = 1
            float[] r5 = new float[r4]
            r6 = 0
            r7 = 1065353216(0x3f800000, float:1.0)
            r5[r6] = r7
            android.animation.ObjectAnimator r2 = android.animation.ObjectAnimator.ofFloat(r2, r3, r5)
            r1[r6] = r2
            V extends android.view.View r2 = r10.view
            android.util.Property r3 = android.view.View.SCALE_Y
            float[] r5 = new float[r4]
            r5[r6] = r7
            android.animation.ObjectAnimator r2 = android.animation.ObjectAnimator.ofFloat(r2, r3, r5)
            r1[r4] = r2
            r0.playTogether(r1)
            V extends android.view.View r1 = r10.view
            boolean r1 = r1 instanceof android.view.ViewGroup
            if (r1 == 0) goto L5b
            V extends android.view.View r1 = r10.view
            android.view.ViewGroup r1 = (android.view.ViewGroup) r1
            r2 = r6
        L3d:
            int r3 = r1.getChildCount()
            if (r2 >= r3) goto L5b
            android.view.View r3 = r1.getChildAt(r2)
            android.animation.Animator[] r5 = new android.animation.Animator[r4]
            android.util.Property r8 = android.view.View.SCALE_Y
            float[] r9 = new float[r4]
            r9[r6] = r7
            android.animation.ObjectAnimator r3 = android.animation.ObjectAnimator.ofFloat(r3, r8, r9)
            r5[r6] = r3
            r0.playTogether(r5)
            int r2 = r2 + 1
            goto L3d
        L5b:
            int r1 = r10.cancelDuration
            long r1 = (long) r1
            r0.setDuration(r1)
            r0.start()
            return
    }

    public void finishBackProgress(androidx.activity.BackEventCompat r8, int r9, android.animation.Animator.AnimatorListener r10, android.animation.ValueAnimator.AnimatorUpdateListener r11) {
            r7 = this;
            int r0 = r8.getSwipeEdge()
            r1 = 1
            r2 = 0
            if (r0 != 0) goto La
            r0 = r1
            goto Lb
        La:
            r0 = r2
        Lb:
            r3 = 3
            boolean r3 = r7.checkAbsoluteGravity(r9, r3)
            V extends android.view.View r4 = r7.view
            int r4 = r4.getWidth()
            float r4 = (float) r4
            V extends android.view.View r5 = r7.view
            float r5 = r5.getScaleX()
            float r4 = r4 * r5
            int r5 = r7.getEdgeMargin(r3)
            float r5 = (float) r5
            float r4 = r4 + r5
            V extends android.view.View r5 = r7.view
            android.util.Property r6 = android.view.View.TRANSLATION_X
            if (r3 == 0) goto L2b
            float r4 = -r4
        L2b:
            float[] r1 = new float[r1]
            r1[r2] = r4
            android.animation.ObjectAnimator r1 = android.animation.ObjectAnimator.ofFloat(r5, r6, r1)
            if (r11 == 0) goto L38
            r1.addUpdateListener(r11)
        L38:
            androidx.interpolator.view.animation.FastOutSlowInInterpolator r11 = new androidx.interpolator.view.animation.FastOutSlowInInterpolator
            r11.<init>()
            r1.setInterpolator(r11)
            int r11 = r7.hideDurationMax
            int r2 = r7.hideDurationMin
            float r8 = r8.getProgress()
            int r8 = com.google.android.material.animation.AnimationUtils.lerp(r11, r2, r8)
            long r2 = (long) r8
            r1.setDuration(r2)
            com.google.android.material.motion.MaterialSideContainerBackHelper$1 r8 = new com.google.android.material.motion.MaterialSideContainerBackHelper$1
            r8.<init>(r7, r0, r9)
            r1.addListener(r8)
            if (r10 == 0) goto L5d
            r1.addListener(r10)
        L5d:
            r1.start()
            return
    }

    public void startBackProgress(androidx.activity.BackEventCompat r1) {
            r0 = this;
            super.onStartBackProgress(r1)
            return
    }

    public void updateBackProgress(float r11, boolean r12, int r13) {
            r10 = this;
            float r11 = r10.interpolateProgress(r11)
            r0 = 3
            boolean r13 = r10.checkAbsoluteGravity(r13, r0)
            r0 = 0
            if (r12 != r13) goto Le
            r12 = 1
            goto Lf
        Le:
            r12 = r0
        Lf:
            V extends android.view.View r1 = r10.view
            int r1 = r1.getWidth()
            V extends android.view.View r2 = r10.view
            int r2 = r2.getHeight()
            float r3 = (float) r1
            r4 = 0
            int r5 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r5 <= 0) goto La1
            float r2 = (float) r2
            int r5 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r5 > 0) goto L28
            goto La1
        L28:
            float r5 = r10.maxScaleXDistanceShrink
            float r5 = r5 / r3
            float r6 = r10.maxScaleXDistanceGrow
            float r6 = r6 / r3
            float r7 = r10.maxScaleYDistance
            float r7 = r7 / r2
            V extends android.view.View r2 = r10.view
            if (r13 == 0) goto L36
            r3 = r4
        L36:
            r2.setPivotX(r3)
            if (r12 == 0) goto L3c
            goto L3d
        L3c:
            float r6 = -r5
        L3d:
            float r2 = com.google.android.material.animation.AnimationUtils.lerp(r4, r6, r11)
            r3 = 1065353216(0x3f800000, float:1.0)
            float r5 = r2 + r3
            V extends android.view.View r6 = r10.view
            r6.setScaleX(r5)
            float r11 = com.google.android.material.animation.AnimationUtils.lerp(r4, r7, r11)
            float r11 = r3 - r11
            V extends android.view.View r6 = r10.view
            r6.setScaleY(r11)
            V extends android.view.View r6 = r10.view
            boolean r6 = r6 instanceof android.view.ViewGroup
            if (r6 == 0) goto La1
            V extends android.view.View r6 = r10.view
            android.view.ViewGroup r6 = (android.view.ViewGroup) r6
        L5f:
            int r7 = r6.getChildCount()
            if (r0 >= r7) goto La1
            android.view.View r7 = r6.getChildAt(r0)
            if (r13 == 0) goto L77
            int r8 = r7.getRight()
            int r8 = r1 - r8
            int r9 = r7.getWidth()
            int r8 = r8 + r9
            goto L7c
        L77:
            int r8 = r7.getLeft()
            int r8 = -r8
        L7c:
            float r8 = (float) r8
            r7.setPivotX(r8)
            int r8 = r7.getTop()
            int r8 = -r8
            float r8 = (float) r8
            r7.setPivotY(r8)
            if (r12 == 0) goto L8e
            float r8 = r3 - r2
            goto L8f
        L8e:
            r8 = r3
        L8f:
            int r9 = (r11 > r4 ? 1 : (r11 == r4 ? 0 : -1))
            if (r9 == 0) goto L97
            float r9 = r5 / r11
            float r9 = r9 * r8
            goto L98
        L97:
            r9 = r3
        L98:
            r7.setScaleX(r8)
            r7.setScaleY(r9)
            int r0 = r0 + 1
            goto L5f
        La1:
            return
    }

    public void updateBackProgress(androidx.activity.BackEventCompat r2, int r3) {
            r1 = this;
            androidx.activity.BackEventCompat r0 = super.onUpdateBackProgress(r2)
            if (r0 != 0) goto L7
            return
        L7:
            int r0 = r2.getSwipeEdge()
            if (r0 != 0) goto Lf
            r0 = 1
            goto L10
        Lf:
            r0 = 0
        L10:
            float r2 = r2.getProgress()
            r1.updateBackProgress(r2, r0, r3)
            return
    }
}
