package com.google.android.material.animation;

/* JADX INFO: loaded from: classes.dex */
public interface AnimatableView {

    public interface Listener {
        void onAnimationEnd();
    }

    void startAnimation(com.google.android.material.animation.AnimatableView.Listener r1);

    void stopAnimation();
}
