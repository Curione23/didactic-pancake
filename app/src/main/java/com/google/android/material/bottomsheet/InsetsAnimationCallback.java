package com.google.android.material.bottomsheet;

/* JADX INFO: loaded from: classes.dex */
class InsetsAnimationCallback extends androidx.core.view.WindowInsetsAnimationCompat.Callback {
    private int startTranslationY;
    private int startY;
    private final int[] tmpLocation;
    private final android.view.View view;

    public InsetsAnimationCallback(android.view.View r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r0)
            r0 = 2
            int[] r0 = new int[r0]
            r1.tmpLocation = r0
            r1.view = r2
            return
    }

    @Override // androidx.core.view.WindowInsetsAnimationCompat.Callback
    public void onEnd(androidx.core.view.WindowInsetsAnimationCompat r2) {
            r1 = this;
            android.view.View r2 = r1.view
            r0 = 0
            r2.setTranslationY(r0)
            return
    }

    @Override // androidx.core.view.WindowInsetsAnimationCompat.Callback
    public void onPrepare(androidx.core.view.WindowInsetsAnimationCompat r2) {
            r1 = this;
            android.view.View r2 = r1.view
            int[] r0 = r1.tmpLocation
            r2.getLocationOnScreen(r0)
            int[] r2 = r1.tmpLocation
            r0 = 1
            r2 = r2[r0]
            r1.startY = r2
            return
    }

    @Override // androidx.core.view.WindowInsetsAnimationCompat.Callback
    public androidx.core.view.WindowInsetsCompat onProgress(androidx.core.view.WindowInsetsCompat r4, java.util.List<androidx.core.view.WindowInsetsAnimationCompat> r5) {
            r3 = this;
            java.util.Iterator r5 = r5.iterator()
        L4:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L2c
            java.lang.Object r0 = r5.next()
            androidx.core.view.WindowInsetsAnimationCompat r0 = (androidx.core.view.WindowInsetsAnimationCompat) r0
            int r1 = r0.getTypeMask()
            int r2 = androidx.core.view.WindowInsetsCompat.Type.ime()
            r1 = r1 & r2
            if (r1 == 0) goto L4
            int r5 = r3.startTranslationY
            r1 = 0
            float r0 = r0.getInterpolatedFraction()
            int r5 = com.google.android.material.animation.AnimationUtils.lerp(r5, r1, r0)
            float r5 = (float) r5
            android.view.View r0 = r3.view
            r0.setTranslationY(r5)
        L2c:
            return r4
    }

    @Override // androidx.core.view.WindowInsetsAnimationCompat.Callback
    public androidx.core.view.WindowInsetsAnimationCompat.BoundsCompat onStart(androidx.core.view.WindowInsetsAnimationCompat r2, androidx.core.view.WindowInsetsAnimationCompat.BoundsCompat r3) {
            r1 = this;
            android.view.View r2 = r1.view
            int[] r0 = r1.tmpLocation
            r2.getLocationOnScreen(r0)
            int[] r2 = r1.tmpLocation
            r0 = 1
            r2 = r2[r0]
            int r0 = r1.startY
            int r0 = r0 - r2
            r1.startTranslationY = r0
            android.view.View r2 = r1.view
            float r0 = (float) r0
            r2.setTranslationY(r0)
            return r3
    }
}
