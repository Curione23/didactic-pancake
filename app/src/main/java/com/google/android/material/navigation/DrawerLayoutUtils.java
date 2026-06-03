package com.google.android.material.navigation;

/* JADX INFO: loaded from: classes.dex */
public class DrawerLayoutUtils {
    private static final int DEFAULT_SCRIM_ALPHA = 0;
    private static final int DEFAULT_SCRIM_COLOR = -1728053248;


    static {
            r0 = -1728053248(0xffffffff99000000, float:-6.617445E-24)
            int r0 = android.graphics.Color.alpha(r0)
            com.google.android.material.navigation.DrawerLayoutUtils.DEFAULT_SCRIM_ALPHA = r0
            return
    }

    private DrawerLayoutUtils() {
            r0 = this;
            r0.<init>()
            return
    }

    public static android.animation.Animator.AnimatorListener getScrimCloseAnimatorListener(androidx.drawerlayout.widget.DrawerLayout r1, android.view.View r2) {
            com.google.android.material.navigation.DrawerLayoutUtils$1 r0 = new com.google.android.material.navigation.DrawerLayoutUtils$1
            r0.<init>(r1, r2)
            return r0
    }

    public static android.animation.ValueAnimator.AnimatorUpdateListener getScrimCloseAnimatorUpdateListener(androidx.drawerlayout.widget.DrawerLayout r1) {
            com.google.android.material.navigation.DrawerLayoutUtils$$ExternalSyntheticLambda0 r0 = new com.google.android.material.navigation.DrawerLayoutUtils$$ExternalSyntheticLambda0
            r0.<init>(r1)
            return r0
    }

    static /* synthetic */ void lambda$getScrimCloseAnimatorUpdateListener$0(androidx.drawerlayout.widget.DrawerLayout r2, android.animation.ValueAnimator r3) {
            int r0 = com.google.android.material.navigation.DrawerLayoutUtils.DEFAULT_SCRIM_ALPHA
            r1 = 0
            float r3 = r3.getAnimatedFraction()
            int r3 = com.google.android.material.animation.AnimationUtils.lerp(r0, r1, r3)
            r0 = -1728053248(0xffffffff99000000, float:-6.617445E-24)
            int r3 = androidx.core.graphics.ColorUtils.setAlphaComponent(r0, r3)
            r2.setScrimColor(r3)
            return
    }
}
