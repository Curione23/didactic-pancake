package androidx.transition;

/* JADX INFO: loaded from: classes.dex */
public class ChangeClipBounds extends androidx.transition.Transition {
    static final android.graphics.Rect NULL_SENTINEL = null;
    private static final java.lang.String PROPNAME_BOUNDS = "android:clipBounds:bounds";
    private static final java.lang.String PROPNAME_CLIP = "android:clipBounds:clip";
    private static final java.lang.String[] sTransitionProperties = null;

    private static class Listener extends android.animation.AnimatorListenerAdapter implements androidx.transition.Transition.TransitionListener {
        private final android.graphics.Rect mEnd;
        private final android.graphics.Rect mStart;
        private final android.view.View mView;

        Listener(android.view.View r1, android.graphics.Rect r2, android.graphics.Rect r3) {
                r0 = this;
                r0.<init>()
                r0.mView = r1
                r0.mStart = r2
                r0.mEnd = r3
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
                if (r2 != 0) goto La
                android.view.View r1 = r0.mView
                android.graphics.Rect r2 = r0.mEnd
                r1.setClipBounds(r2)
                goto L11
            La:
                android.view.View r1 = r0.mView
                android.graphics.Rect r2 = r0.mStart
                r1.setClipBounds(r2)
            L11:
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
        public void onTransitionPause(androidx.transition.Transition r3) {
                r2 = this;
                android.view.View r3 = r2.mView
                android.graphics.Rect r3 = r3.getClipBounds()
                if (r3 != 0) goto La
                android.graphics.Rect r3 = androidx.transition.ChangeClipBounds.NULL_SENTINEL
            La:
                android.view.View r0 = r2.mView
                int r1 = androidx.transition.R.id.transition_clip
                r0.setTag(r1, r3)
                android.view.View r3 = r2.mView
                android.graphics.Rect r0 = r2.mEnd
                r3.setClipBounds(r0)
                return
        }

        @Override // androidx.transition.Transition.TransitionListener
        public void onTransitionResume(androidx.transition.Transition r3) {
                r2 = this;
                android.view.View r3 = r2.mView
                int r0 = androidx.transition.R.id.transition_clip
                java.lang.Object r3 = r3.getTag(r0)
                android.graphics.Rect r3 = (android.graphics.Rect) r3
                android.view.View r0 = r2.mView
                r0.setClipBounds(r3)
                android.view.View r3 = r2.mView
                int r0 = androidx.transition.R.id.transition_clip
                r1 = 0
                r3.setTag(r0, r1)
                return
        }

        @Override // androidx.transition.Transition.TransitionListener
        public void onTransitionStart(androidx.transition.Transition r1) {
                r0 = this;
                return
        }
    }

    static {
            r0 = 1
            java.lang.String[] r0 = new java.lang.String[r0]
            r1 = 0
            java.lang.String r2 = "android:clipBounds:clip"
            r0[r1] = r2
            androidx.transition.ChangeClipBounds.sTransitionProperties = r0
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            androidx.transition.ChangeClipBounds.NULL_SENTINEL = r0
            return
    }

    public ChangeClipBounds() {
            r0 = this;
            r0.<init>()
            return
    }

    public ChangeClipBounds(android.content.Context r1, android.util.AttributeSet r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    private void captureValues(androidx.transition.TransitionValues r4, boolean r5) {
            r3 = this;
            android.view.View r0 = r4.view
            int r1 = r0.getVisibility()
            r2 = 8
            if (r1 != r2) goto Lb
            return
        Lb:
            r1 = 0
            if (r5 == 0) goto L17
            int r5 = androidx.transition.R.id.transition_clip
            java.lang.Object r5 = r0.getTag(r5)
            android.graphics.Rect r5 = (android.graphics.Rect) r5
            goto L18
        L17:
            r5 = r1
        L18:
            if (r5 != 0) goto L1e
            android.graphics.Rect r5 = r0.getClipBounds()
        L1e:
            android.graphics.Rect r2 = androidx.transition.ChangeClipBounds.NULL_SENTINEL
            if (r5 != r2) goto L23
            goto L24
        L23:
            r1 = r5
        L24:
            java.util.Map<java.lang.String, java.lang.Object> r5 = r4.values
            java.lang.String r2 = "android:clipBounds:clip"
            r5.put(r2, r1)
            if (r1 != 0) goto L42
            android.graphics.Rect r5 = new android.graphics.Rect
            int r1 = r0.getWidth()
            int r0 = r0.getHeight()
            r2 = 0
            r5.<init>(r2, r2, r1, r0)
            java.util.Map<java.lang.String, java.lang.Object> r4 = r4.values
            java.lang.String r0 = "android:clipBounds:bounds"
            r4.put(r0, r5)
        L42:
            return
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
    public android.animation.Animator createAnimator(android.view.ViewGroup r8, androidx.transition.TransitionValues r9, androidx.transition.TransitionValues r10) {
            r7 = this;
            r8 = 0
            if (r9 == 0) goto L7b
            if (r10 == 0) goto L7b
            java.util.Map<java.lang.String, java.lang.Object> r0 = r9.values
            java.lang.String r1 = "android:clipBounds:clip"
            boolean r0 = r0.containsKey(r1)
            if (r0 == 0) goto L7b
            java.util.Map<java.lang.String, java.lang.Object> r0 = r10.values
            boolean r0 = r0.containsKey(r1)
            if (r0 != 0) goto L18
            goto L7b
        L18:
            java.util.Map<java.lang.String, java.lang.Object> r0 = r9.values
            java.lang.Object r0 = r0.get(r1)
            android.graphics.Rect r0 = (android.graphics.Rect) r0
            java.util.Map<java.lang.String, java.lang.Object> r2 = r10.values
            java.lang.Object r1 = r2.get(r1)
            android.graphics.Rect r1 = (android.graphics.Rect) r1
            if (r0 != 0) goto L2d
            if (r1 != 0) goto L2d
            return r8
        L2d:
            java.lang.String r2 = "android:clipBounds:bounds"
            if (r0 != 0) goto L3a
            java.util.Map<java.lang.String, java.lang.Object> r9 = r9.values
            java.lang.Object r9 = r9.get(r2)
            android.graphics.Rect r9 = (android.graphics.Rect) r9
            goto L3b
        L3a:
            r9 = r0
        L3b:
            if (r1 != 0) goto L46
            java.util.Map<java.lang.String, java.lang.Object> r3 = r10.values
            java.lang.Object r2 = r3.get(r2)
            android.graphics.Rect r2 = (android.graphics.Rect) r2
            goto L47
        L46:
            r2 = r1
        L47:
            boolean r3 = r9.equals(r2)
            if (r3 == 0) goto L4e
            return r8
        L4e:
            android.view.View r8 = r10.view
            r8.setClipBounds(r0)
            androidx.transition.RectEvaluator r8 = new androidx.transition.RectEvaluator
            android.graphics.Rect r3 = new android.graphics.Rect
            r3.<init>()
            r8.<init>(r3)
            android.view.View r3 = r10.view
            android.util.Property<android.view.View, android.graphics.Rect> r4 = androidx.transition.ViewUtils.CLIP_BOUNDS
            r5 = 2
            android.graphics.Rect[] r5 = new android.graphics.Rect[r5]
            r6 = 0
            r5[r6] = r9
            r9 = 1
            r5[r9] = r2
            android.animation.ObjectAnimator r8 = android.animation.ObjectAnimator.ofObject(r3, r4, r8, r5)
            android.view.View r9 = r10.view
            androidx.transition.ChangeClipBounds$Listener r10 = new androidx.transition.ChangeClipBounds$Listener
            r10.<init>(r9, r0, r1)
            r8.addListener(r10)
            r7.addListener(r10)
        L7b:
            return r8
    }

    @Override // androidx.transition.Transition
    public java.lang.String[] getTransitionProperties() {
            r1 = this;
            java.lang.String[] r0 = androidx.transition.ChangeClipBounds.sTransitionProperties
            return r0
    }

    @Override // androidx.transition.Transition
    public boolean isSeekingSupported() {
            r1 = this;
            r0 = 1
            return r0
    }
}
