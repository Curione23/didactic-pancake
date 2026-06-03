package androidx.transition;

/* JADX INFO: loaded from: classes.dex */
public class ChangeBounds extends androidx.transition.Transition {
    private static final android.util.Property<android.view.View, android.graphics.PointF> BOTTOM_RIGHT_ONLY_PROPERTY = null;
    private static final android.util.Property<androidx.transition.ChangeBounds.ViewBounds, android.graphics.PointF> BOTTOM_RIGHT_PROPERTY = null;
    private static final android.util.Property<android.view.View, android.graphics.PointF> POSITION_PROPERTY = null;
    private static final java.lang.String PROPNAME_BOUNDS = "android:changeBounds:bounds";
    private static final java.lang.String PROPNAME_CLIP = "android:changeBounds:clip";
    private static final java.lang.String PROPNAME_PARENT = "android:changeBounds:parent";
    private static final java.lang.String PROPNAME_WINDOW_X = "android:changeBounds:windowX";
    private static final java.lang.String PROPNAME_WINDOW_Y = "android:changeBounds:windowY";
    private static final android.util.Property<android.view.View, android.graphics.PointF> TOP_LEFT_ONLY_PROPERTY = null;
    private static final android.util.Property<androidx.transition.ChangeBounds.ViewBounds, android.graphics.PointF> TOP_LEFT_PROPERTY = null;
    private static final androidx.transition.RectEvaluator sRectEvaluator = null;
    private static final java.lang.String[] sTransitionProperties = null;
    private boolean mResizeClip;







    private static class ClipListener extends android.animation.AnimatorListenerAdapter implements androidx.transition.Transition.TransitionListener {
        private final int mEndBottom;
        private final android.graphics.Rect mEndClip;
        private final boolean mEndClipIsNull;
        private final int mEndLeft;
        private final int mEndRight;
        private final int mEndTop;
        private boolean mIsCanceled;
        private final int mStartBottom;
        private final android.graphics.Rect mStartClip;
        private final boolean mStartClipIsNull;
        private final int mStartLeft;
        private final int mStartRight;
        private final int mStartTop;
        private final android.view.View mView;

        ClipListener(android.view.View r1, android.graphics.Rect r2, boolean r3, android.graphics.Rect r4, boolean r5, int r6, int r7, int r8, int r9, int r10, int r11, int r12, int r13) {
                r0 = this;
                r0.<init>()
                r0.mView = r1
                r0.mStartClip = r2
                r0.mStartClipIsNull = r3
                r0.mEndClip = r4
                r0.mEndClipIsNull = r5
                r0.mStartLeft = r6
                r0.mStartTop = r7
                r0.mStartRight = r8
                r0.mStartBottom = r9
                r0.mEndLeft = r10
                r0.mEndTop = r11
                r0.mEndRight = r12
                r0.mEndBottom = r13
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
        public void onAnimationEnd(android.animation.Animator r4, boolean r5) {
                r3 = this;
                boolean r4 = r3.mIsCanceled
                if (r4 == 0) goto L5
                return
            L5:
                r4 = 0
                if (r5 == 0) goto L10
                boolean r0 = r3.mStartClipIsNull
                if (r0 == 0) goto Ld
                goto L17
            Ld:
                android.graphics.Rect r4 = r3.mStartClip
                goto L17
            L10:
                boolean r0 = r3.mEndClipIsNull
                if (r0 == 0) goto L15
                goto L17
            L15:
                android.graphics.Rect r4 = r3.mEndClip
            L17:
                android.view.View r0 = r3.mView
                r0.setClipBounds(r4)
                if (r5 == 0) goto L2c
                android.view.View r4 = r3.mView
                int r5 = r3.mStartLeft
                int r0 = r3.mStartTop
                int r1 = r3.mStartRight
                int r2 = r3.mStartBottom
                androidx.transition.ViewUtils.setLeftTopRightBottom(r4, r5, r0, r1, r2)
                goto L39
            L2c:
                android.view.View r4 = r3.mView
                int r5 = r3.mEndLeft
                int r0 = r3.mEndTop
                int r1 = r3.mEndRight
                int r2 = r3.mEndBottom
                androidx.transition.ViewUtils.setLeftTopRightBottom(r4, r5, r0, r1, r2)
            L39:
                return
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(android.animation.Animator r2) {
                r1 = this;
                r0 = 0
                r1.onAnimationStart(r2, r0)
                return
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(android.animation.Animator r5, boolean r6) {
                r4 = this;
                int r5 = r4.mStartRight
                int r0 = r4.mStartLeft
                int r5 = r5 - r0
                int r0 = r4.mEndRight
                int r1 = r4.mEndLeft
                int r0 = r0 - r1
                int r5 = java.lang.Math.max(r5, r0)
                int r0 = r4.mStartBottom
                int r1 = r4.mStartTop
                int r0 = r0 - r1
                int r1 = r4.mEndBottom
                int r2 = r4.mEndTop
                int r1 = r1 - r2
                int r0 = java.lang.Math.max(r0, r1)
                if (r6 == 0) goto L21
                int r1 = r4.mEndLeft
                goto L23
            L21:
                int r1 = r4.mStartLeft
            L23:
                if (r6 == 0) goto L28
                int r2 = r4.mEndTop
                goto L2a
            L28:
                int r2 = r4.mStartTop
            L2a:
                android.view.View r3 = r4.mView
                int r5 = r5 + r1
                int r0 = r0 + r2
                androidx.transition.ViewUtils.setLeftTopRightBottom(r3, r1, r2, r5, r0)
                if (r6 == 0) goto L36
                android.graphics.Rect r5 = r4.mEndClip
                goto L38
            L36:
                android.graphics.Rect r5 = r4.mStartClip
            L38:
                android.view.View r6 = r4.mView
                r6.setClipBounds(r5)
                return
        }

        @Override // androidx.transition.Transition.TransitionListener
        public void onTransitionCancel(androidx.transition.Transition r1) {
                r0 = this;
                r1 = 1
                r0.mIsCanceled = r1
                return
        }

        @Override // androidx.transition.Transition.TransitionListener
        public void onTransitionEnd(androidx.transition.Transition r1) {
                r0 = this;
                return
        }

        @Override // androidx.transition.Transition.TransitionListener
        public void onTransitionPause(androidx.transition.Transition r3) {
                r2 = this;
                android.view.View r3 = r2.mView
                android.graphics.Rect r3 = r3.getClipBounds()
                android.view.View r0 = r2.mView
                int r1 = androidx.transition.R.id.transition_clip
                r0.setTag(r1, r3)
                boolean r3 = r2.mEndClipIsNull
                if (r3 == 0) goto L13
                r3 = 0
                goto L15
            L13:
                android.graphics.Rect r3 = r2.mEndClip
            L15:
                android.view.View r0 = r2.mView
                r0.setClipBounds(r3)
                return
        }

        @Override // androidx.transition.Transition.TransitionListener
        public void onTransitionResume(androidx.transition.Transition r4) {
                r3 = this;
                android.view.View r4 = r3.mView
                int r0 = androidx.transition.R.id.transition_clip
                java.lang.Object r4 = r4.getTag(r0)
                android.graphics.Rect r4 = (android.graphics.Rect) r4
                android.view.View r0 = r3.mView
                int r1 = androidx.transition.R.id.transition_clip
                r2 = 0
                r0.setTag(r1, r2)
                android.view.View r0 = r3.mView
                r0.setClipBounds(r4)
                return
        }

        @Override // androidx.transition.Transition.TransitionListener
        public void onTransitionStart(androidx.transition.Transition r1) {
                r0 = this;
                return
        }
    }

    private static class SuppressLayoutListener extends androidx.transition.TransitionListenerAdapter {
        boolean mCanceled;
        final android.view.ViewGroup mParent;

        SuppressLayoutListener(android.view.ViewGroup r2) {
                r1 = this;
                r1.<init>()
                r0 = 0
                r1.mCanceled = r0
                r1.mParent = r2
                return
        }

        @Override // androidx.transition.TransitionListenerAdapter, androidx.transition.Transition.TransitionListener
        public void onTransitionCancel(androidx.transition.Transition r2) {
                r1 = this;
                android.view.ViewGroup r2 = r1.mParent
                r0 = 0
                androidx.transition.ViewGroupUtils.suppressLayout(r2, r0)
                r2 = 1
                r1.mCanceled = r2
                return
        }

        @Override // androidx.transition.TransitionListenerAdapter, androidx.transition.Transition.TransitionListener
        public void onTransitionEnd(androidx.transition.Transition r3) {
                r2 = this;
                boolean r0 = r2.mCanceled
                if (r0 != 0) goto La
                android.view.ViewGroup r0 = r2.mParent
                r1 = 0
                androidx.transition.ViewGroupUtils.suppressLayout(r0, r1)
            La:
                r3.removeListener(r2)
                return
        }

        @Override // androidx.transition.TransitionListenerAdapter, androidx.transition.Transition.TransitionListener
        public void onTransitionPause(androidx.transition.Transition r2) {
                r1 = this;
                android.view.ViewGroup r2 = r1.mParent
                r0 = 0
                androidx.transition.ViewGroupUtils.suppressLayout(r2, r0)
                return
        }

        @Override // androidx.transition.TransitionListenerAdapter, androidx.transition.Transition.TransitionListener
        public void onTransitionResume(androidx.transition.Transition r2) {
                r1 = this;
                android.view.ViewGroup r2 = r1.mParent
                r0 = 1
                androidx.transition.ViewGroupUtils.suppressLayout(r2, r0)
                return
        }
    }

    private static class ViewBounds {
        private int mBottom;
        private int mBottomRightCalls;
        private int mLeft;
        private int mRight;
        private int mTop;
        private int mTopLeftCalls;
        private final android.view.View mView;

        ViewBounds(android.view.View r1) {
                r0 = this;
                r0.<init>()
                r0.mView = r1
                return
        }

        private void setLeftTopRightBottom() {
                r5 = this;
                android.view.View r0 = r5.mView
                int r1 = r5.mLeft
                int r2 = r5.mTop
                int r3 = r5.mRight
                int r4 = r5.mBottom
                androidx.transition.ViewUtils.setLeftTopRightBottom(r0, r1, r2, r3, r4)
                r0 = 0
                r5.mTopLeftCalls = r0
                r5.mBottomRightCalls = r0
                return
        }

        void setBottomRight(android.graphics.PointF r2) {
                r1 = this;
                float r0 = r2.x
                int r0 = java.lang.Math.round(r0)
                r1.mRight = r0
                float r2 = r2.y
                int r2 = java.lang.Math.round(r2)
                r1.mBottom = r2
                int r2 = r1.mBottomRightCalls
                int r2 = r2 + 1
                r1.mBottomRightCalls = r2
                int r0 = r1.mTopLeftCalls
                if (r0 != r2) goto L1d
                r1.setLeftTopRightBottom()
            L1d:
                return
        }

        void setTopLeft(android.graphics.PointF r2) {
                r1 = this;
                float r0 = r2.x
                int r0 = java.lang.Math.round(r0)
                r1.mLeft = r0
                float r2 = r2.y
                int r2 = java.lang.Math.round(r2)
                r1.mTop = r2
                int r2 = r1.mTopLeftCalls
                int r2 = r2 + 1
                r1.mTopLeftCalls = r2
                int r0 = r1.mBottomRightCalls
                if (r2 != r0) goto L1d
                r1.setLeftTopRightBottom()
            L1d:
                return
        }
    }

    static {
            r0 = 5
            java.lang.String[] r0 = new java.lang.String[r0]
            r1 = 0
            java.lang.String r2 = "android:changeBounds:bounds"
            r0[r1] = r2
            r1 = 1
            java.lang.String r2 = "android:changeBounds:clip"
            r0[r1] = r2
            r1 = 2
            java.lang.String r2 = "android:changeBounds:parent"
            r0[r1] = r2
            r1 = 3
            java.lang.String r2 = "android:changeBounds:windowX"
            r0[r1] = r2
            r1 = 4
            java.lang.String r2 = "android:changeBounds:windowY"
            r0[r1] = r2
            androidx.transition.ChangeBounds.sTransitionProperties = r0
            androidx.transition.ChangeBounds$1 r0 = new androidx.transition.ChangeBounds$1
            java.lang.Class<android.graphics.PointF> r1 = android.graphics.PointF.class
            java.lang.String r2 = "topLeft"
            r0.<init>(r1, r2)
            androidx.transition.ChangeBounds.TOP_LEFT_PROPERTY = r0
            androidx.transition.ChangeBounds$2 r0 = new androidx.transition.ChangeBounds$2
            java.lang.Class<android.graphics.PointF> r1 = android.graphics.PointF.class
            java.lang.String r3 = "bottomRight"
            r0.<init>(r1, r3)
            androidx.transition.ChangeBounds.BOTTOM_RIGHT_PROPERTY = r0
            androidx.transition.ChangeBounds$3 r0 = new androidx.transition.ChangeBounds$3
            java.lang.Class<android.graphics.PointF> r1 = android.graphics.PointF.class
            r0.<init>(r1, r3)
            androidx.transition.ChangeBounds.BOTTOM_RIGHT_ONLY_PROPERTY = r0
            androidx.transition.ChangeBounds$4 r0 = new androidx.transition.ChangeBounds$4
            java.lang.Class<android.graphics.PointF> r1 = android.graphics.PointF.class
            r0.<init>(r1, r2)
            androidx.transition.ChangeBounds.TOP_LEFT_ONLY_PROPERTY = r0
            androidx.transition.ChangeBounds$5 r0 = new androidx.transition.ChangeBounds$5
            java.lang.Class<android.graphics.PointF> r1 = android.graphics.PointF.class
            java.lang.String r2 = "position"
            r0.<init>(r1, r2)
            androidx.transition.ChangeBounds.POSITION_PROPERTY = r0
            androidx.transition.RectEvaluator r0 = new androidx.transition.RectEvaluator
            r0.<init>()
            androidx.transition.ChangeBounds.sRectEvaluator = r0
            return
    }

    public ChangeBounds() {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.mResizeClip = r0
            return
    }

    public ChangeBounds(android.content.Context r3, android.util.AttributeSet r4) {
            r2 = this;
            r2.<init>(r3, r4)
            r0 = 0
            r2.mResizeClip = r0
            int[] r1 = androidx.transition.Styleable.CHANGE_BOUNDS
            android.content.res.TypedArray r3 = r3.obtainStyledAttributes(r4, r1)
            android.content.res.XmlResourceParser r4 = (android.content.res.XmlResourceParser) r4
            java.lang.String r1 = "resizeClip"
            boolean r4 = androidx.core.content.res.TypedArrayUtils.getNamedBoolean(r3, r4, r1, r0, r0)
            r3.recycle()
            r2.setResizeClip(r4)
            return
    }

    private void captureValues(androidx.transition.TransitionValues r8) {
            r7 = this;
            android.view.View r0 = r8.view
            boolean r1 = r0.isLaidOut()
            if (r1 != 0) goto L14
            int r1 = r0.getWidth()
            if (r1 != 0) goto L14
            int r1 = r0.getHeight()
            if (r1 == 0) goto L4c
        L14:
            java.util.Map<java.lang.String, java.lang.Object> r1 = r8.values
            android.graphics.Rect r2 = new android.graphics.Rect
            int r3 = r0.getLeft()
            int r4 = r0.getTop()
            int r5 = r0.getRight()
            int r6 = r0.getBottom()
            r2.<init>(r3, r4, r5, r6)
            java.lang.String r3 = "android:changeBounds:bounds"
            r1.put(r3, r2)
            java.util.Map<java.lang.String, java.lang.Object> r1 = r8.values
            android.view.View r2 = r8.view
            android.view.ViewParent r2 = r2.getParent()
            java.lang.String r3 = "android:changeBounds:parent"
            r1.put(r3, r2)
            boolean r1 = r7.mResizeClip
            if (r1 == 0) goto L4c
            java.util.Map<java.lang.String, java.lang.Object> r8 = r8.values
            java.lang.String r1 = "android:changeBounds:clip"
            android.graphics.Rect r0 = r0.getClipBounds()
            r8.put(r1, r0)
        L4c:
            return
    }

    @Override // androidx.transition.Transition
    public void captureEndValues(androidx.transition.TransitionValues r1) {
            r0 = this;
            r0.captureValues(r1)
            return
    }

    @Override // androidx.transition.Transition
    public void captureStartValues(androidx.transition.TransitionValues r3) {
            r2 = this;
            r2.captureValues(r3)
            boolean r0 = r2.mResizeClip
            if (r0 == 0) goto L1a
            android.view.View r0 = r3.view
            int r1 = androidx.transition.R.id.transition_clip
            java.lang.Object r0 = r0.getTag(r1)
            android.graphics.Rect r0 = (android.graphics.Rect) r0
            if (r0 == 0) goto L1a
            java.util.Map<java.lang.String, java.lang.Object> r3 = r3.values
            java.lang.String r1 = "android:changeBounds:clip"
            r3.put(r1, r0)
        L1a:
            return
    }

    @Override // androidx.transition.Transition
    public android.animation.Animator createAnimator(android.view.ViewGroup r22, androidx.transition.TransitionValues r23, androidx.transition.TransitionValues r24) {
            r21 = this;
            r0 = r21
            r1 = r23
            r2 = r24
            if (r1 == 0) goto L1e0
            if (r2 != 0) goto Lc
            goto L1e0
        Lc:
            java.util.Map<java.lang.String, java.lang.Object> r4 = r1.values
            java.util.Map<java.lang.String, java.lang.Object> r5 = r2.values
            java.lang.String r6 = "android:changeBounds:parent"
            java.lang.Object r4 = r4.get(r6)
            android.view.ViewGroup r4 = (android.view.ViewGroup) r4
            java.lang.Object r5 = r5.get(r6)
            android.view.ViewGroup r5 = (android.view.ViewGroup) r5
            if (r4 == 0) goto L1de
            if (r5 != 0) goto L24
            goto L1de
        L24:
            android.view.View r4 = r2.view
            java.util.Map<java.lang.String, java.lang.Object> r5 = r1.values
            java.lang.String r6 = "android:changeBounds:bounds"
            java.lang.Object r5 = r5.get(r6)
            android.graphics.Rect r5 = (android.graphics.Rect) r5
            java.util.Map<java.lang.String, java.lang.Object> r7 = r2.values
            java.lang.Object r6 = r7.get(r6)
            android.graphics.Rect r6 = (android.graphics.Rect) r6
            int r12 = r5.left
            int r15 = r6.left
            int r13 = r5.top
            int r14 = r6.top
            int r11 = r5.right
            int r10 = r6.right
            int r5 = r5.bottom
            int r9 = r6.bottom
            int r6 = r11 - r12
            int r7 = r5 - r13
            int r8 = r10 - r15
            int r3 = r9 - r14
            java.util.Map<java.lang.String, java.lang.Object> r1 = r1.values
            r20 = r4
            java.lang.String r4 = "android:changeBounds:clip"
            java.lang.Object r1 = r1.get(r4)
            android.graphics.Rect r1 = (android.graphics.Rect) r1
            java.util.Map<java.lang.String, java.lang.Object> r2 = r2.values
            java.lang.Object r2 = r2.get(r4)
            android.graphics.Rect r2 = (android.graphics.Rect) r2
            if (r6 == 0) goto L68
            if (r7 != 0) goto L6c
        L68:
            if (r8 == 0) goto L7d
            if (r3 == 0) goto L7d
        L6c:
            if (r12 != r15) goto L74
            if (r13 == r14) goto L71
            goto L74
        L71:
            r16 = 0
            goto L76
        L74:
            r16 = 1
        L76:
            if (r11 != r10) goto L7a
            if (r5 == r9) goto L7f
        L7a:
            int r16 = r16 + 1
            goto L7f
        L7d:
            r16 = 0
        L7f:
            if (r1 == 0) goto L87
            boolean r17 = r1.equals(r2)
            if (r17 == 0) goto L8b
        L87:
            if (r1 != 0) goto L8d
            if (r2 == 0) goto L8d
        L8b:
            int r16 = r16 + 1
        L8d:
            r4 = r16
            if (r4 <= 0) goto L1dc
            r16 = r2
            boolean r2 = r0.mResizeClip
            if (r2 != 0) goto L12a
            r2 = r20
            androidx.transition.ViewUtils.setLeftTopRightBottom(r2, r12, r13, r11, r5)
            r1 = 2
            if (r4 != r1) goto Lfc
            if (r6 != r8) goto Lb6
            if (r7 != r3) goto Lb6
            androidx.transition.PathMotion r1 = r21.getPathMotion()
            float r3 = (float) r12
            float r4 = (float) r13
            float r5 = (float) r15
            float r6 = (float) r14
            android.graphics.Path r1 = r1.getPath(r3, r4, r5, r6)
            android.util.Property<android.view.View, android.graphics.PointF> r3 = androidx.transition.ChangeBounds.POSITION_PROPERTY
            android.animation.ObjectAnimator r1 = androidx.transition.ObjectAnimatorUtils.ofPointF(r2, r3, r1)
            goto L126
        Lb6:
            androidx.transition.ChangeBounds$ViewBounds r3 = new androidx.transition.ChangeBounds$ViewBounds
            r3.<init>(r2)
            androidx.transition.PathMotion r4 = r21.getPathMotion()
            float r6 = (float) r12
            float r7 = (float) r13
            float r8 = (float) r15
            float r12 = (float) r14
            android.graphics.Path r4 = r4.getPath(r6, r7, r8, r12)
            android.util.Property<androidx.transition.ChangeBounds$ViewBounds, android.graphics.PointF> r6 = androidx.transition.ChangeBounds.TOP_LEFT_PROPERTY
            android.animation.ObjectAnimator r4 = androidx.transition.ObjectAnimatorUtils.ofPointF(r3, r6, r4)
            androidx.transition.PathMotion r6 = r21.getPathMotion()
            float r7 = (float) r11
            float r5 = (float) r5
            float r8 = (float) r10
            float r9 = (float) r9
            android.graphics.Path r5 = r6.getPath(r7, r5, r8, r9)
            android.util.Property<androidx.transition.ChangeBounds$ViewBounds, android.graphics.PointF> r6 = androidx.transition.ChangeBounds.BOTTOM_RIGHT_PROPERTY
            android.animation.ObjectAnimator r5 = androidx.transition.ObjectAnimatorUtils.ofPointF(r3, r6, r5)
            android.animation.AnimatorSet r6 = new android.animation.AnimatorSet
            r6.<init>()
            android.animation.Animator[] r1 = new android.animation.Animator[r1]
            r7 = 0
            r1[r7] = r4
            r4 = 1
            r1[r4] = r5
            r6.playTogether(r1)
            androidx.transition.ChangeBounds$6 r1 = new androidx.transition.ChangeBounds$6
            r1.<init>(r0, r3)
            r6.addListener(r1)
            r20 = r2
            r1 = r6
            goto L1bd
        Lfc:
            if (r12 != r15) goto L114
            if (r13 == r14) goto L101
            goto L114
        L101:
            androidx.transition.PathMotion r1 = r21.getPathMotion()
            float r3 = (float) r11
            float r4 = (float) r5
            float r5 = (float) r10
            float r6 = (float) r9
            android.graphics.Path r1 = r1.getPath(r3, r4, r5, r6)
            android.util.Property<android.view.View, android.graphics.PointF> r3 = androidx.transition.ChangeBounds.BOTTOM_RIGHT_ONLY_PROPERTY
            android.animation.ObjectAnimator r1 = androidx.transition.ObjectAnimatorUtils.ofPointF(r2, r3, r1)
            goto L126
        L114:
            androidx.transition.PathMotion r1 = r21.getPathMotion()
            float r3 = (float) r12
            float r4 = (float) r13
            float r5 = (float) r15
            float r6 = (float) r14
            android.graphics.Path r1 = r1.getPath(r3, r4, r5, r6)
            android.util.Property<android.view.View, android.graphics.PointF> r3 = androidx.transition.ChangeBounds.TOP_LEFT_ONLY_PROPERTY
            android.animation.ObjectAnimator r1 = androidx.transition.ObjectAnimatorUtils.ofPointF(r2, r3, r1)
        L126:
            r20 = r2
            goto L1bd
        L12a:
            r2 = r20
            int r4 = java.lang.Math.max(r6, r8)
            int r17 = java.lang.Math.max(r7, r3)
            int r4 = r4 + r12
            r18 = r9
            int r9 = r13 + r17
            androidx.transition.ViewUtils.setLeftTopRightBottom(r2, r12, r13, r4, r9)
            if (r12 != r15) goto L149
            if (r13 == r14) goto L141
            goto L149
        L141:
            r17 = r10
            r19 = r11
            r20 = r15
            r4 = 0
            goto L161
        L149:
            androidx.transition.PathMotion r4 = r21.getPathMotion()
            float r9 = (float) r12
            r17 = r10
            float r10 = (float) r13
            r19 = r11
            float r11 = (float) r15
            r20 = r15
            float r15 = (float) r14
            android.graphics.Path r4 = r4.getPath(r9, r10, r11, r15)
            android.util.Property<android.view.View, android.graphics.PointF> r9 = androidx.transition.ChangeBounds.POSITION_PROPERTY
            android.animation.ObjectAnimator r4 = androidx.transition.ObjectAnimatorUtils.ofPointF(r2, r9, r4)
        L161:
            if (r1 != 0) goto L165
            r9 = 1
            goto L166
        L165:
            r9 = 0
        L166:
            if (r9 == 0) goto L16f
            android.graphics.Rect r1 = new android.graphics.Rect
            r10 = 0
            r1.<init>(r10, r10, r6, r7)
            goto L170
        L16f:
            r10 = 0
        L170:
            if (r16 != 0) goto L174
            r11 = 1
            goto L175
        L174:
            r11 = r10
        L175:
            if (r11 == 0) goto L17e
            android.graphics.Rect r6 = new android.graphics.Rect
            r6.<init>(r10, r10, r8, r3)
            r10 = r6
            goto L180
        L17e:
            r10 = r16
        L180:
            boolean r3 = r1.equals(r10)
            if (r3 != 0) goto L1b6
            r2.setClipBounds(r1)
            androidx.transition.RectEvaluator r3 = androidx.transition.ChangeBounds.sRectEvaluator
            java.lang.Object[] r6 = new java.lang.Object[]{r1, r10}
            java.lang.String r7 = "clipBounds"
            android.animation.ObjectAnimator r3 = android.animation.ObjectAnimator.ofObject(r2, r7, r3, r6)
            androidx.transition.ChangeBounds$ClipListener r15 = new androidx.transition.ChangeBounds$ClipListener
            r6 = r15
            r7 = r2
            r8 = r1
            r1 = r18
            r18 = r17
            r16 = r19
            r17 = r14
            r14 = r16
            r16 = r20
            r20 = r2
            r2 = r15
            r15 = r5
            r19 = r1
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            r3.addListener(r2)
            r0.addListener(r2)
            goto L1b9
        L1b6:
            r20 = r2
            r3 = 0
        L1b9:
            android.animation.Animator r1 = androidx.transition.TransitionUtils.mergeAnimators(r4, r3)
        L1bd:
            android.view.ViewParent r2 = r20.getParent()
            boolean r2 = r2 instanceof android.view.ViewGroup
            if (r2 == 0) goto L1db
            android.view.ViewParent r2 = r20.getParent()
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2
            r3 = 1
            androidx.transition.ViewGroupUtils.suppressLayout(r2, r3)
            androidx.transition.Transition r3 = r21.getRootTransition()
            androidx.transition.ChangeBounds$SuppressLayoutListener r4 = new androidx.transition.ChangeBounds$SuppressLayoutListener
            r4.<init>(r2)
            r3.addListener(r4)
        L1db:
            return r1
        L1dc:
            r1 = 0
            return r1
        L1de:
            r1 = 0
            return r1
        L1e0:
            r1 = 0
            return r1
    }

    public boolean getResizeClip() {
            r1 = this;
            boolean r0 = r1.mResizeClip
            return r0
    }

    @Override // androidx.transition.Transition
    public java.lang.String[] getTransitionProperties() {
            r1 = this;
            java.lang.String[] r0 = androidx.transition.ChangeBounds.sTransitionProperties
            return r0
    }

    @Override // androidx.transition.Transition
    public boolean isSeekingSupported() {
            r1 = this;
            r0 = 1
            return r0
    }

    public void setResizeClip(boolean r1) {
            r0 = this;
            r0.mResizeClip = r1
            return
    }
}
