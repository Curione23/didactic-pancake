package com.google.android.material.internal;

/* JADX INFO: loaded from: classes.dex */
public class MultiViewUpdateListener implements android.animation.ValueAnimator.AnimatorUpdateListener {
    private final com.google.android.material.internal.MultiViewUpdateListener.Listener listener;
    private final android.view.View[] views;

    interface Listener {
        void onAnimationUpdate(android.animation.ValueAnimator r1, android.view.View r2);
    }

    public static /* synthetic */ void $r8$lambda$WkRITrIg1eLk2gv__5iwocHDqeg(android.animation.ValueAnimator r0, android.view.View r1) {
            setScale(r0, r1)
            return
    }

    public static /* synthetic */ void $r8$lambda$kNR6Np3RAVUjjKtQJR0ljE_6vq8(android.animation.ValueAnimator r0, android.view.View r1) {
            setTranslationY(r0, r1)
            return
    }

    public static /* synthetic */ void $r8$lambda$l3sYajCeVVvEXOGqzrBJyGlXVps(android.animation.ValueAnimator r0, android.view.View r1) {
            setAlpha(r0, r1)
            return
    }

    public static /* synthetic */ void $r8$lambda$tf5oGWUNf6tQQxMTGg7FpP3COoI(android.animation.ValueAnimator r0, android.view.View r1) {
            setTranslationX(r0, r1)
            return
    }

    public MultiViewUpdateListener(com.google.android.material.internal.MultiViewUpdateListener.Listener r1, java.util.Collection<android.view.View> r2) {
            r0 = this;
            r0.<init>()
            r0.listener = r1
            r1 = 0
            android.view.View[] r1 = new android.view.View[r1]
            java.lang.Object[] r1 = r2.toArray(r1)
            android.view.View[] r1 = (android.view.View[]) r1
            r0.views = r1
            return
    }

    public MultiViewUpdateListener(com.google.android.material.internal.MultiViewUpdateListener.Listener r1, android.view.View... r2) {
            r0 = this;
            r0.<init>()
            r0.listener = r1
            r0.views = r2
            return
    }

    public static com.google.android.material.internal.MultiViewUpdateListener alphaListener(java.util.Collection<android.view.View> r2) {
            com.google.android.material.internal.MultiViewUpdateListener r0 = new com.google.android.material.internal.MultiViewUpdateListener
            com.google.android.material.internal.MultiViewUpdateListener$$ExternalSyntheticLambda3 r1 = new com.google.android.material.internal.MultiViewUpdateListener$$ExternalSyntheticLambda3
            r1.<init>()
            r0.<init>(r1, r2)
            return r0
    }

    public static com.google.android.material.internal.MultiViewUpdateListener alphaListener(android.view.View... r2) {
            com.google.android.material.internal.MultiViewUpdateListener r0 = new com.google.android.material.internal.MultiViewUpdateListener
            com.google.android.material.internal.MultiViewUpdateListener$$ExternalSyntheticLambda3 r1 = new com.google.android.material.internal.MultiViewUpdateListener$$ExternalSyntheticLambda3
            r1.<init>()
            r0.<init>(r1, r2)
            return r0
    }

    public static com.google.android.material.internal.MultiViewUpdateListener scaleListener(java.util.Collection<android.view.View> r2) {
            com.google.android.material.internal.MultiViewUpdateListener r0 = new com.google.android.material.internal.MultiViewUpdateListener
            com.google.android.material.internal.MultiViewUpdateListener$$ExternalSyntheticLambda1 r1 = new com.google.android.material.internal.MultiViewUpdateListener$$ExternalSyntheticLambda1
            r1.<init>()
            r0.<init>(r1, r2)
            return r0
    }

    public static com.google.android.material.internal.MultiViewUpdateListener scaleListener(android.view.View... r2) {
            com.google.android.material.internal.MultiViewUpdateListener r0 = new com.google.android.material.internal.MultiViewUpdateListener
            com.google.android.material.internal.MultiViewUpdateListener$$ExternalSyntheticLambda1 r1 = new com.google.android.material.internal.MultiViewUpdateListener$$ExternalSyntheticLambda1
            r1.<init>()
            r0.<init>(r1, r2)
            return r0
    }

    private static void setAlpha(android.animation.ValueAnimator r0, android.view.View r1) {
            java.lang.Object r0 = r0.getAnimatedValue()
            java.lang.Float r0 = (java.lang.Float) r0
            float r0 = r0.floatValue()
            r1.setAlpha(r0)
            return
    }

    private static void setScale(android.animation.ValueAnimator r1, android.view.View r2) {
            java.lang.Object r1 = r1.getAnimatedValue()
            java.lang.Float r1 = (java.lang.Float) r1
            float r0 = r1.floatValue()
            r2.setScaleX(r0)
            float r1 = r1.floatValue()
            r2.setScaleY(r1)
            return
    }

    private static void setTranslationX(android.animation.ValueAnimator r0, android.view.View r1) {
            java.lang.Object r0 = r0.getAnimatedValue()
            java.lang.Float r0 = (java.lang.Float) r0
            float r0 = r0.floatValue()
            r1.setTranslationX(r0)
            return
    }

    private static void setTranslationY(android.animation.ValueAnimator r0, android.view.View r1) {
            java.lang.Object r0 = r0.getAnimatedValue()
            java.lang.Float r0 = (java.lang.Float) r0
            float r0 = r0.floatValue()
            r1.setTranslationY(r0)
            return
    }

    public static com.google.android.material.internal.MultiViewUpdateListener translationXListener(java.util.Collection<android.view.View> r2) {
            com.google.android.material.internal.MultiViewUpdateListener r0 = new com.google.android.material.internal.MultiViewUpdateListener
            com.google.android.material.internal.MultiViewUpdateListener$$ExternalSyntheticLambda0 r1 = new com.google.android.material.internal.MultiViewUpdateListener$$ExternalSyntheticLambda0
            r1.<init>()
            r0.<init>(r1, r2)
            return r0
    }

    public static com.google.android.material.internal.MultiViewUpdateListener translationXListener(android.view.View... r2) {
            com.google.android.material.internal.MultiViewUpdateListener r0 = new com.google.android.material.internal.MultiViewUpdateListener
            com.google.android.material.internal.MultiViewUpdateListener$$ExternalSyntheticLambda0 r1 = new com.google.android.material.internal.MultiViewUpdateListener$$ExternalSyntheticLambda0
            r1.<init>()
            r0.<init>(r1, r2)
            return r0
    }

    public static com.google.android.material.internal.MultiViewUpdateListener translationYListener(java.util.Collection<android.view.View> r2) {
            com.google.android.material.internal.MultiViewUpdateListener r0 = new com.google.android.material.internal.MultiViewUpdateListener
            com.google.android.material.internal.MultiViewUpdateListener$$ExternalSyntheticLambda2 r1 = new com.google.android.material.internal.MultiViewUpdateListener$$ExternalSyntheticLambda2
            r1.<init>()
            r0.<init>(r1, r2)
            return r0
    }

    public static com.google.android.material.internal.MultiViewUpdateListener translationYListener(android.view.View... r2) {
            com.google.android.material.internal.MultiViewUpdateListener r0 = new com.google.android.material.internal.MultiViewUpdateListener
            com.google.android.material.internal.MultiViewUpdateListener$$ExternalSyntheticLambda2 r1 = new com.google.android.material.internal.MultiViewUpdateListener$$ExternalSyntheticLambda2
            r1.<init>()
            r0.<init>(r1, r2)
            return r0
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(android.animation.ValueAnimator r6) {
            r5 = this;
            android.view.View[] r0 = r5.views
            int r1 = r0.length
            r2 = 0
        L4:
            if (r2 >= r1) goto L10
            r3 = r0[r2]
            com.google.android.material.internal.MultiViewUpdateListener$Listener r4 = r5.listener
            r4.onAnimationUpdate(r6, r3)
            int r2 = r2 + 1
            goto L4
        L10:
            return
    }
}
