package androidx.transition;

/* JADX INFO: loaded from: classes.dex */
public class ChangeScroll extends androidx.transition.Transition {
    private static final java.lang.String[] PROPERTIES = null;
    private static final java.lang.String PROPNAME_SCROLL_X = "android:changeScroll:x";
    private static final java.lang.String PROPNAME_SCROLL_Y = "android:changeScroll:y";

    static {
            r0 = 2
            java.lang.String[] r0 = new java.lang.String[r0]
            r1 = 0
            java.lang.String r2 = "android:changeScroll:x"
            r0[r1] = r2
            r1 = 1
            java.lang.String r2 = "android:changeScroll:y"
            r0[r1] = r2
            androidx.transition.ChangeScroll.PROPERTIES = r0
            return
    }

    public ChangeScroll() {
            r0 = this;
            r0.<init>()
            return
    }

    public ChangeScroll(android.content.Context r1, android.util.AttributeSet r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    private void captureValues(androidx.transition.TransitionValues r4) {
            r3 = this;
            java.util.Map<java.lang.String, java.lang.Object> r0 = r4.values
            android.view.View r1 = r4.view
            int r1 = r1.getScrollX()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "android:changeScroll:x"
            r0.put(r2, r1)
            java.util.Map<java.lang.String, java.lang.Object> r0 = r4.values
            android.view.View r4 = r4.view
            int r4 = r4.getScrollY()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            java.lang.String r1 = "android:changeScroll:y"
            r0.put(r1, r4)
            return
    }

    @Override // androidx.transition.Transition
    public void captureEndValues(androidx.transition.TransitionValues r1) {
            r0 = this;
            r0.captureValues(r1)
            return
    }

    @Override // androidx.transition.Transition
    public void captureStartValues(androidx.transition.TransitionValues r1) {
            r0 = this;
            r0.captureValues(r1)
            return
    }

    @Override // androidx.transition.Transition
    public android.animation.Animator createAnimator(android.view.ViewGroup r5, androidx.transition.TransitionValues r6, androidx.transition.TransitionValues r7) {
            r4 = this;
            r5 = 0
            if (r6 == 0) goto L60
            if (r7 != 0) goto L6
            goto L60
        L6:
            android.view.View r0 = r7.view
            java.util.Map<java.lang.String, java.lang.Object> r1 = r6.values
            java.lang.String r2 = "android:changeScroll:x"
            java.lang.Object r1 = r1.get(r2)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            java.util.Map<java.lang.String, java.lang.Object> r3 = r7.values
            java.lang.Object r2 = r3.get(r2)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            java.util.Map<java.lang.String, java.lang.Object> r6 = r6.values
            java.lang.String r3 = "android:changeScroll:y"
            java.lang.Object r6 = r6.get(r3)
            java.lang.Integer r6 = (java.lang.Integer) r6
            int r6 = r6.intValue()
            java.util.Map<java.lang.String, java.lang.Object> r7 = r7.values
            java.lang.Object r7 = r7.get(r3)
            java.lang.Integer r7 = (java.lang.Integer) r7
            int r7 = r7.intValue()
            if (r1 == r2) goto L4c
            r0.setScrollX(r1)
            java.lang.String r3 = "scrollX"
            int[] r1 = new int[]{r1, r2}
            android.animation.ObjectAnimator r1 = android.animation.ObjectAnimator.ofInt(r0, r3, r1)
            goto L4d
        L4c:
            r1 = r5
        L4d:
            if (r6 == r7) goto L5c
            r0.setScrollY(r6)
            java.lang.String r5 = "scrollY"
            int[] r6 = new int[]{r6, r7}
            android.animation.ObjectAnimator r5 = android.animation.ObjectAnimator.ofInt(r0, r5, r6)
        L5c:
            android.animation.Animator r5 = androidx.transition.TransitionUtils.mergeAnimators(r1, r5)
        L60:
            return r5
    }

    @Override // androidx.transition.Transition
    public java.lang.String[] getTransitionProperties() {
            r1 = this;
            java.lang.String[] r0 = androidx.transition.ChangeScroll.PROPERTIES
            return r0
    }

    @Override // androidx.transition.Transition
    public boolean isSeekingSupported() {
            r1 = this;
            r0 = 1
            return r0
    }
}
