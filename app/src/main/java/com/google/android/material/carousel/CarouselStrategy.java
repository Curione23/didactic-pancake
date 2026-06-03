package com.google.android.material.carousel;

/* JADX INFO: loaded from: classes.dex */
public abstract class CarouselStrategy {
    private float smallSizeMax;
    private float smallSizeMin;

    public CarouselStrategy() {
            r0 = this;
            r0.<init>()
            return
    }

    static int[] doubleCounts(int[] r4) {
            int r0 = r4.length
            int[] r1 = new int[r0]
            r2 = 0
        L4:
            if (r2 >= r0) goto Lf
            r3 = r4[r2]
            int r3 = r3 * 2
            r1[r2] = r3
            int r2 = r2 + 1
            goto L4
        Lf:
            return r1
    }

    static float getChildMaskPercentage(float r0, float r1, float r2) {
            float r0 = r0 - r2
            float r1 = r1 - r2
            float r0 = r0 / r1
            r1 = 1065353216(0x3f800000, float:1.0)
            float r1 = r1 - r0
            return r1
    }

    public float getSmallItemSizeMax() {
            r1 = this;
            float r0 = r1.smallSizeMax
            return r0
    }

    public float getSmallItemSizeMin() {
            r1 = this;
            float r0 = r1.smallSizeMin
            return r0
    }

    void initialize(android.content.Context r4) {
            r3 = this;
            float r0 = r3.smallSizeMin
            r1 = 0
            int r2 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r2 <= 0) goto L8
            goto Lc
        L8:
            float r0 = com.google.android.material.carousel.CarouselStrategyHelper.getSmallSizeMin(r4)
        Lc:
            r3.smallSizeMin = r0
            float r0 = r3.smallSizeMax
            int r1 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r1 <= 0) goto L15
            goto L19
        L15:
            float r0 = com.google.android.material.carousel.CarouselStrategyHelper.getSmallSizeMax(r4)
        L19:
            r3.smallSizeMax = r0
            return
    }

    boolean isContained() {
            r1 = this;
            r0 = 1
            return r0
    }

    abstract com.google.android.material.carousel.KeylineState onFirstChildMeasuredWithMargins(com.google.android.material.carousel.Carousel r1, android.view.View r2);

    public void setSmallItemSizeMax(float r1) {
            r0 = this;
            r0.smallSizeMax = r1
            return
    }

    public void setSmallItemSizeMin(float r1) {
            r0 = this;
            r0.smallSizeMin = r1
            return
    }

    boolean shouldRefreshKeylineState(com.google.android.material.carousel.Carousel r1, int r2) {
            r0 = this;
            r1 = 0
            return r1
    }
}
