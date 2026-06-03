package androidx.transition;

/* JADX INFO: loaded from: classes.dex */
class TranslationAnimationCreator {

    private static class TransitionPositionListener extends android.animation.AnimatorListenerAdapter implements androidx.transition.Transition.TransitionListener {
        private boolean mIsTransitionCanceled;
        private final android.view.View mMovingView;
        private float mPausedX;
        private float mPausedY;
        private final float mTerminalX;
        private final float mTerminalY;
        private int[] mTransitionPosition;
        private final android.view.View mViewInHierarchy;

        TransitionPositionListener(android.view.View r1, android.view.View r2, float r3, float r4) {
                r0 = this;
                r0.<init>()
                r0.mMovingView = r1
                r0.mViewInHierarchy = r2
                r0.mTerminalX = r3
                r0.mTerminalY = r4
                int r1 = androidx.transition.R.id.transition_position
                java.lang.Object r1 = r2.getTag(r1)
                int[] r1 = (int[]) r1
                r0.mTransitionPosition = r1
                if (r1 == 0) goto L1d
                int r1 = androidx.transition.R.id.transition_position
                r3 = 0
                r2.setTag(r1, r3)
            L1d:
                return
        }

        private void setInterruptedPosition() {
                r3 = this;
                int[] r0 = r3.mTransitionPosition
                if (r0 != 0) goto L9
                r0 = 2
                int[] r0 = new int[r0]
                r3.mTransitionPosition = r0
            L9:
                android.view.View r0 = r3.mMovingView
                int[] r1 = r3.mTransitionPosition
                r0.getLocationOnScreen(r1)
                android.view.View r0 = r3.mViewInHierarchy
                int r1 = androidx.transition.R.id.transition_position
                int[] r2 = r3.mTransitionPosition
                r0.setTag(r1, r2)
                return
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(android.animation.Animator r2) {
                r1 = this;
                r2 = 1
                r1.mIsTransitionCanceled = r2
                android.view.View r2 = r1.mMovingView
                float r0 = r1.mTerminalX
                r2.setTranslationX(r0)
                android.view.View r2 = r1.mMovingView
                float r0 = r1.mTerminalY
                r2.setTranslationY(r0)
                return
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(android.animation.Animator r2) {
                r1 = this;
                r0 = 0
                r1.onAnimationEnd(r2, r0)
                return
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(android.animation.Animator r1, boolean r2) {
                r0 = this;
                if (r2 != 0) goto L10
                android.view.View r1 = r0.mMovingView
                float r2 = r0.mTerminalX
                r1.setTranslationX(r2)
                android.view.View r1 = r0.mMovingView
                float r2 = r0.mTerminalY
                r1.setTranslationY(r2)
            L10:
                return
        }

        @Override // androidx.transition.Transition.TransitionListener
        public void onTransitionCancel(androidx.transition.Transition r2) {
                r1 = this;
                r2 = 1
                r1.mIsTransitionCanceled = r2
                android.view.View r2 = r1.mMovingView
                float r0 = r1.mTerminalX
                r2.setTranslationX(r0)
                android.view.View r2 = r1.mMovingView
                float r0 = r1.mTerminalY
                r2.setTranslationY(r0)
                return
        }

        @Override // androidx.transition.Transition.TransitionListener
        public void onTransitionEnd(androidx.transition.Transition r2) {
                r1 = this;
                r0 = 0
                r1.onTransitionEnd(r2, r0)
                return
        }

        @Override // androidx.transition.Transition.TransitionListener
        public void onTransitionEnd(androidx.transition.Transition r2, boolean r3) {
                r1 = this;
                boolean r2 = r1.mIsTransitionCanceled
                if (r2 != 0) goto Lc
                android.view.View r2 = r1.mViewInHierarchy
                int r3 = androidx.transition.R.id.transition_position
                r0 = 0
                r2.setTag(r3, r0)
            Lc:
                return
        }

        @Override // androidx.transition.Transition.TransitionListener
        public void onTransitionPause(androidx.transition.Transition r2) {
                r1 = this;
                r1.setInterruptedPosition()
                android.view.View r2 = r1.mMovingView
                float r2 = r2.getTranslationX()
                r1.mPausedX = r2
                android.view.View r2 = r1.mMovingView
                float r2 = r2.getTranslationY()
                r1.mPausedY = r2
                android.view.View r2 = r1.mMovingView
                float r0 = r1.mTerminalX
                r2.setTranslationX(r0)
                android.view.View r2 = r1.mMovingView
                float r0 = r1.mTerminalY
                r2.setTranslationY(r0)
                return
        }

        @Override // androidx.transition.Transition.TransitionListener
        public void onTransitionResume(androidx.transition.Transition r2) {
                r1 = this;
                android.view.View r2 = r1.mMovingView
                float r0 = r1.mPausedX
                r2.setTranslationX(r0)
                android.view.View r2 = r1.mMovingView
                float r0 = r1.mPausedY
                r2.setTranslationY(r0)
                return
        }

        @Override // androidx.transition.Transition.TransitionListener
        public void onTransitionStart(androidx.transition.Transition r1) {
                r0 = this;
                return
        }
    }

    private TranslationAnimationCreator() {
            r0 = this;
            r0.<init>()
            return
    }

    static android.animation.Animator createAnimation(android.view.View r6, androidx.transition.TransitionValues r7, int r8, int r9, float r10, float r11, float r12, float r13, android.animation.TimeInterpolator r14, androidx.transition.Transition r15) {
            float r0 = r6.getTranslationX()
            float r1 = r6.getTranslationY()
            android.view.View r2 = r7.view
            int r3 = androidx.transition.R.id.transition_position
            java.lang.Object r2 = r2.getTag(r3)
            int[] r2 = (int[]) r2
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L22
            r10 = r2[r4]
            int r10 = r10 - r8
            float r8 = (float) r10
            float r10 = r8 + r0
            r8 = r2[r3]
            int r8 = r8 - r9
            float r8 = (float) r8
            float r11 = r8 + r1
        L22:
            r6.setTranslationX(r10)
            r6.setTranslationY(r11)
            int r8 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r8 != 0) goto L32
            int r8 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r8 != 0) goto L32
            r6 = 0
            return r6
        L32:
            r8 = 2
            android.animation.PropertyValuesHolder[] r9 = new android.animation.PropertyValuesHolder[r8]
            android.util.Property r2 = android.view.View.TRANSLATION_X
            float[] r5 = new float[r8]
            r5[r4] = r10
            r5[r3] = r12
            android.animation.PropertyValuesHolder r10 = android.animation.PropertyValuesHolder.ofFloat(r2, r5)
            r9[r4] = r10
            android.util.Property r10 = android.view.View.TRANSLATION_Y
            float[] r8 = new float[r8]
            r8[r4] = r11
            r8[r3] = r13
            android.animation.PropertyValuesHolder r8 = android.animation.PropertyValuesHolder.ofFloat(r10, r8)
            r9[r3] = r8
            android.animation.ObjectAnimator r8 = android.animation.ObjectAnimator.ofPropertyValuesHolder(r6, r9)
            androidx.transition.TranslationAnimationCreator$TransitionPositionListener r9 = new androidx.transition.TranslationAnimationCreator$TransitionPositionListener
            android.view.View r7 = r7.view
            r9.<init>(r6, r7, r0, r1)
            r15.addListener(r9)
            r8.addListener(r9)
            r8.setInterpolator(r14)
            return r8
    }
}
