package androidx.transition;

/* JADX INFO: loaded from: classes.dex */
public class ChangeImageTransform extends androidx.transition.Transition {
    private static final android.util.Property<android.widget.ImageView, android.graphics.Matrix> ANIMATED_TRANSFORM_PROPERTY = null;
    private static final android.animation.TypeEvaluator<android.graphics.Matrix> NULL_MATRIX_EVALUATOR = null;
    private static final java.lang.String PROPNAME_BOUNDS = "android:changeImageTransform:bounds";
    private static final java.lang.String PROPNAME_MATRIX = "android:changeImageTransform:matrix";
    private static final java.lang.String[] sTransitionProperties = null;



    /* JADX INFO: renamed from: androidx.transition.ChangeImageTransform$3, reason: invalid class name */
    static /* synthetic */ class AnonymousClass3 {
        static final /* synthetic */ int[] $SwitchMap$android$widget$ImageView$ScaleType = null;

        static {
                android.widget.ImageView$ScaleType[] r0 = android.widget.ImageView.ScaleType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                androidx.transition.ChangeImageTransform.AnonymousClass3.$SwitchMap$android$widget$ImageView$ScaleType = r0
                android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.FIT_XY     // Catch: java.lang.NoSuchFieldError -> L12
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L12
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L12
            L12:
                int[] r0 = androidx.transition.ChangeImageTransform.AnonymousClass3.$SwitchMap$android$widget$ImageView$ScaleType     // Catch: java.lang.NoSuchFieldError -> L1d
                android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.CENTER_CROP     // Catch: java.lang.NoSuchFieldError -> L1d
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L1d
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L1d
            L1d:
                return
        }
    }

    private static class Listener extends android.animation.AnimatorListenerAdapter implements androidx.transition.Transition.TransitionListener {
        private final android.graphics.Matrix mEndMatrix;
        private final android.widget.ImageView mImageView;
        private boolean mIsBeforeAnimator;
        private final android.graphics.Matrix mStartMatrix;

        Listener(android.widget.ImageView r2, android.graphics.Matrix r3, android.graphics.Matrix r4) {
                r1 = this;
                r1.<init>()
                r0 = 1
                r1.mIsBeforeAnimator = r0
                r1.mImageView = r2
                r1.mStartMatrix = r3
                r1.mEndMatrix = r4
                return
        }

        private void restoreMatrix() {
                r3 = this;
                android.widget.ImageView r0 = r3.mImageView
                int r1 = androidx.transition.R.id.transition_image_transform
                java.lang.Object r0 = r0.getTag(r1)
                android.graphics.Matrix r0 = (android.graphics.Matrix) r0
                if (r0 == 0) goto L19
                android.widget.ImageView r1 = r3.mImageView
                androidx.transition.ImageViewUtils.animateTransform(r1, r0)
                android.widget.ImageView r0 = r3.mImageView
                int r1 = androidx.transition.R.id.transition_image_transform
                r2 = 0
                r0.setTag(r1, r2)
            L19:
                return
        }

        private void saveMatrix(android.graphics.Matrix r3) {
                r2 = this;
                android.widget.ImageView r0 = r2.mImageView
                int r1 = androidx.transition.R.id.transition_image_transform
                r0.setTag(r1, r3)
                android.widget.ImageView r3 = r2.mImageView
                android.graphics.Matrix r0 = r2.mEndMatrix
                androidx.transition.ImageViewUtils.animateTransform(r3, r0)
                return
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(android.animation.Animator r1) {
                r0 = this;
                r1 = 0
                r0.mIsBeforeAnimator = r1
                return
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(android.animation.Animator r1, boolean r2) {
                r0 = this;
                r0.mIsBeforeAnimator = r2
                return
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
        public void onAnimationPause(android.animation.Animator r1) {
                r0 = this;
                android.animation.ObjectAnimator r1 = (android.animation.ObjectAnimator) r1
                java.lang.Object r1 = r1.getAnimatedValue()
                android.graphics.Matrix r1 = (android.graphics.Matrix) r1
                r0.saveMatrix(r1)
                return
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
        public void onAnimationResume(android.animation.Animator r1) {
                r0 = this;
                r0.restoreMatrix()
                return
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(android.animation.Animator r1) {
                r0 = this;
                r1 = 0
                r0.mIsBeforeAnimator = r1
                return
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(android.animation.Animator r1, boolean r2) {
                r0 = this;
                r1 = 0
                r0.mIsBeforeAnimator = r1
                return
        }

        @Override // androidx.transition.Transition.TransitionListener
        public void onTransitionCancel(androidx.transition.Transition r1) {
                r0 = this;
                return
        }

        @Override // androidx.transition.Transition.TransitionListener
        public void onTransitionEnd(androidx.transition.Transition r1) {
                r0 = this;
                return
        }

        @Override // androidx.transition.Transition.TransitionListener
        public void onTransitionPause(androidx.transition.Transition r1) {
                r0 = this;
                boolean r1 = r0.mIsBeforeAnimator
                if (r1 == 0) goto L9
                android.graphics.Matrix r1 = r0.mStartMatrix
                r0.saveMatrix(r1)
            L9:
                return
        }

        @Override // androidx.transition.Transition.TransitionListener
        public void onTransitionResume(androidx.transition.Transition r1) {
                r0 = this;
                r0.restoreMatrix()
                return
        }

        @Override // androidx.transition.Transition.TransitionListener
        public void onTransitionStart(androidx.transition.Transition r1) {
                r0 = this;
                return
        }
    }

    static {
            r0 = 2
            java.lang.String[] r0 = new java.lang.String[r0]
            r1 = 0
            java.lang.String r2 = "android:changeImageTransform:matrix"
            r0[r1] = r2
            r1 = 1
            java.lang.String r2 = "android:changeImageTransform:bounds"
            r0[r1] = r2
            androidx.transition.ChangeImageTransform.sTransitionProperties = r0
            androidx.transition.ChangeImageTransform$1 r0 = new androidx.transition.ChangeImageTransform$1
            r0.<init>()
            androidx.transition.ChangeImageTransform.NULL_MATRIX_EVALUATOR = r0
            androidx.transition.ChangeImageTransform$2 r0 = new androidx.transition.ChangeImageTransform$2
            java.lang.Class<android.graphics.Matrix> r1 = android.graphics.Matrix.class
            java.lang.String r2 = "animatedTransform"
            r0.<init>(r1, r2)
            androidx.transition.ChangeImageTransform.ANIMATED_TRANSFORM_PROPERTY = r0
            return
    }

    public ChangeImageTransform() {
            r0 = this;
            r0.<init>()
            return
    }

    public ChangeImageTransform(android.content.Context r1, android.util.AttributeSet r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    private void captureValues(androidx.transition.TransitionValues r7, boolean r8) {
            r6 = this;
            android.view.View r0 = r7.view
            boolean r1 = r0 instanceof android.widget.ImageView
            if (r1 == 0) goto L4a
            int r1 = r0.getVisibility()
            if (r1 == 0) goto Ld
            goto L4a
        Ld:
            r1 = r0
            android.widget.ImageView r1 = (android.widget.ImageView) r1
            android.graphics.drawable.Drawable r2 = r1.getDrawable()
            if (r2 != 0) goto L17
            return
        L17:
            java.util.Map<java.lang.String, java.lang.Object> r7 = r7.values
            int r2 = r0.getLeft()
            int r3 = r0.getTop()
            int r4 = r0.getRight()
            int r0 = r0.getBottom()
            android.graphics.Rect r5 = new android.graphics.Rect
            r5.<init>(r2, r3, r4, r0)
            java.lang.String r0 = "android:changeImageTransform:bounds"
            r7.put(r0, r5)
            if (r8 == 0) goto L3e
            int r8 = androidx.transition.R.id.transition_image_transform
            java.lang.Object r8 = r1.getTag(r8)
            android.graphics.Matrix r8 = (android.graphics.Matrix) r8
            goto L3f
        L3e:
            r8 = 0
        L3f:
            if (r8 != 0) goto L45
            android.graphics.Matrix r8 = copyImageMatrix(r1)
        L45:
            java.lang.String r0 = "android:changeImageTransform:matrix"
            r7.put(r0, r8)
        L4a:
            return
    }

    private static android.graphics.Matrix centerCropMatrix(android.widget.ImageView r5) {
            android.graphics.drawable.Drawable r0 = r5.getDrawable()
            int r1 = r0.getIntrinsicWidth()
            int r2 = r5.getWidth()
            float r2 = (float) r2
            float r1 = (float) r1
            float r3 = r2 / r1
            int r0 = r0.getIntrinsicHeight()
            int r5 = r5.getHeight()
            float r5 = (float) r5
            float r0 = (float) r0
            float r4 = r5 / r0
            float r3 = java.lang.Math.max(r3, r4)
            float r1 = r1 * r3
            float r0 = r0 * r3
            float r2 = r2 - r1
            r1 = 1073741824(0x40000000, float:2.0)
            float r2 = r2 / r1
            int r2 = java.lang.Math.round(r2)
            float r5 = r5 - r0
            float r5 = r5 / r1
            int r5 = java.lang.Math.round(r5)
            android.graphics.Matrix r0 = new android.graphics.Matrix
            r0.<init>()
            r0.postScale(r3, r3)
            float r1 = (float) r2
            float r5 = (float) r5
            r0.postTranslate(r1, r5)
            return r0
    }

    private static android.graphics.Matrix copyImageMatrix(android.widget.ImageView r2) {
            android.graphics.drawable.Drawable r0 = r2.getDrawable()
            int r1 = r0.getIntrinsicWidth()
            if (r1 <= 0) goto L36
            int r0 = r0.getIntrinsicHeight()
            if (r0 <= 0) goto L36
            int[] r0 = androidx.transition.ChangeImageTransform.AnonymousClass3.$SwitchMap$android$widget$ImageView$ScaleType
            android.widget.ImageView$ScaleType r1 = r2.getScaleType()
            int r1 = r1.ordinal()
            r0 = r0[r1]
            r1 = 1
            if (r0 == r1) goto L31
            r1 = 2
            if (r0 == r1) goto L2c
            android.graphics.Matrix r0 = new android.graphics.Matrix
            android.graphics.Matrix r2 = r2.getImageMatrix()
            r0.<init>(r2)
            return r0
        L2c:
            android.graphics.Matrix r2 = centerCropMatrix(r2)
            return r2
        L31:
            android.graphics.Matrix r2 = fitXYMatrix(r2)
            return r2
        L36:
            android.graphics.Matrix r0 = new android.graphics.Matrix
            android.graphics.Matrix r2 = r2.getImageMatrix()
            r0.<init>(r2)
            return r0
    }

    private android.animation.ObjectAnimator createMatrixAnimator(android.widget.ImageView r5, android.graphics.Matrix r6, android.graphics.Matrix r7) {
            r4 = this;
            android.util.Property<android.widget.ImageView, android.graphics.Matrix> r0 = androidx.transition.ChangeImageTransform.ANIMATED_TRANSFORM_PROPERTY
            androidx.transition.TransitionUtils$MatrixEvaluator r1 = new androidx.transition.TransitionUtils$MatrixEvaluator
            r1.<init>()
            r2 = 2
            android.graphics.Matrix[] r2 = new android.graphics.Matrix[r2]
            r3 = 0
            r2[r3] = r6
            r6 = 1
            r2[r6] = r7
            android.animation.ObjectAnimator r5 = android.animation.ObjectAnimator.ofObject(r5, r0, r1, r2)
            return r5
    }

    private android.animation.ObjectAnimator createNullAnimator(android.widget.ImageView r6) {
            r5 = this;
            android.util.Property<android.widget.ImageView, android.graphics.Matrix> r0 = androidx.transition.ChangeImageTransform.ANIMATED_TRANSFORM_PROPERTY
            android.animation.TypeEvaluator<android.graphics.Matrix> r1 = androidx.transition.ChangeImageTransform.NULL_MATRIX_EVALUATOR
            r2 = 2
            android.graphics.Matrix[] r2 = new android.graphics.Matrix[r2]
            r3 = 0
            android.graphics.Matrix r4 = androidx.transition.MatrixUtils.IDENTITY_MATRIX
            r2[r3] = r4
            r3 = 1
            android.graphics.Matrix r4 = androidx.transition.MatrixUtils.IDENTITY_MATRIX
            r2[r3] = r4
            android.animation.ObjectAnimator r6 = android.animation.ObjectAnimator.ofObject(r6, r0, r1, r2)
            return r6
    }

    private static android.graphics.Matrix fitXYMatrix(android.widget.ImageView r4) {
            android.graphics.drawable.Drawable r0 = r4.getDrawable()
            android.graphics.Matrix r1 = new android.graphics.Matrix
            r1.<init>()
            int r2 = r4.getWidth()
            float r2 = (float) r2
            int r3 = r0.getIntrinsicWidth()
            float r3 = (float) r3
            float r2 = r2 / r3
            int r4 = r4.getHeight()
            float r4 = (float) r4
            int r0 = r0.getIntrinsicHeight()
            float r0 = (float) r0
            float r4 = r4 / r0
            r1.postScale(r2, r4)
            return r1
    }

    @Override // androidx.transition.Transition
    public void captureEndValues(androidx.transition.TransitionValues r2) {
            r1 = this;
            r0 = 0
            r1.captureValues(r2, r0)
            return
    }

    @Override // androidx.transition.Transition
    public void captureStartValues(androidx.transition.TransitionValues r2) {
            r1 = this;
            r0 = 1
            r1.captureValues(r2, r0)
            return
    }

    @Override // androidx.transition.Transition
    public android.animation.Animator createAnimator(android.view.ViewGroup r5, androidx.transition.TransitionValues r6, androidx.transition.TransitionValues r7) {
            r4 = this;
            r5 = 0
            if (r6 == 0) goto L82
            if (r7 != 0) goto L7
            goto L82
        L7:
            java.util.Map<java.lang.String, java.lang.Object> r0 = r6.values
            java.lang.String r1 = "android:changeImageTransform:bounds"
            java.lang.Object r0 = r0.get(r1)
            android.graphics.Rect r0 = (android.graphics.Rect) r0
            java.util.Map<java.lang.String, java.lang.Object> r2 = r7.values
            java.lang.Object r1 = r2.get(r1)
            android.graphics.Rect r1 = (android.graphics.Rect) r1
            if (r0 == 0) goto L82
            if (r1 != 0) goto L1e
            goto L82
        L1e:
            java.util.Map<java.lang.String, java.lang.Object> r6 = r6.values
            java.lang.String r2 = "android:changeImageTransform:matrix"
            java.lang.Object r6 = r6.get(r2)
            android.graphics.Matrix r6 = (android.graphics.Matrix) r6
            java.util.Map<java.lang.String, java.lang.Object> r3 = r7.values
            java.lang.Object r2 = r3.get(r2)
            android.graphics.Matrix r2 = (android.graphics.Matrix) r2
            if (r6 != 0) goto L34
            if (r2 == 0) goto L3c
        L34:
            if (r6 == 0) goto L3e
            boolean r3 = r6.equals(r2)
            if (r3 == 0) goto L3e
        L3c:
            r3 = 1
            goto L3f
        L3e:
            r3 = 0
        L3f:
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L48
            if (r3 == 0) goto L48
            return r5
        L48:
            android.view.View r5 = r7.view
            android.widget.ImageView r5 = (android.widget.ImageView) r5
            android.graphics.drawable.Drawable r7 = r5.getDrawable()
            int r0 = r7.getIntrinsicWidth()
            int r7 = r7.getIntrinsicHeight()
            if (r0 <= 0) goto L7d
            if (r7 > 0) goto L5d
            goto L7d
        L5d:
            if (r6 != 0) goto L61
            android.graphics.Matrix r6 = androidx.transition.MatrixUtils.IDENTITY_MATRIX
        L61:
            if (r2 != 0) goto L65
            android.graphics.Matrix r2 = androidx.transition.MatrixUtils.IDENTITY_MATRIX
        L65:
            android.util.Property<android.widget.ImageView, android.graphics.Matrix> r7 = androidx.transition.ChangeImageTransform.ANIMATED_TRANSFORM_PROPERTY
            r7.set(r5, r6)
            android.animation.ObjectAnimator r7 = r4.createMatrixAnimator(r5, r6, r2)
            androidx.transition.ChangeImageTransform$Listener r0 = new androidx.transition.ChangeImageTransform$Listener
            r0.<init>(r5, r6, r2)
            r7.addListener(r0)
            r7.addPauseListener(r0)
            r4.addListener(r0)
            goto L81
        L7d:
            android.animation.ObjectAnimator r7 = r4.createNullAnimator(r5)
        L81:
            return r7
        L82:
            return r5
    }

    @Override // androidx.transition.Transition
    public java.lang.String[] getTransitionProperties() {
            r1 = this;
            java.lang.String[] r0 = androidx.transition.ChangeImageTransform.sTransitionProperties
            return r0
    }

    @Override // androidx.transition.Transition
    public boolean isSeekingSupported() {
            r1 = this;
            r0 = 1
            return r0
    }
}
