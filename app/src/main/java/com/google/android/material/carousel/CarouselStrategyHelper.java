package com.google.android.material.carousel;

/* JADX INFO: loaded from: classes.dex */
final class CarouselStrategyHelper {
    private CarouselStrategyHelper() {
            r0 = this;
            r0.<init>()
            return
    }

    static float addEnd(float r1, float r2, int r3) {
            int r3 = r3 + (-1)
            r0 = 0
            int r3 = java.lang.Math.max(r0, r3)
            float r3 = (float) r3
            float r3 = r3 * r2
            float r1 = r1 + r3
            return r1
    }

    static float addStart(float r0, float r1, int r2) {
            if (r2 <= 0) goto L6
            r2 = 1073741824(0x40000000, float:2.0)
            float r1 = r1 / r2
            float r0 = r0 + r1
        L6:
            return r0
    }

    static com.google.android.material.carousel.KeylineState createCenterAlignedKeylineState(android.content.Context r19, float r20, float r21, com.google.android.material.carousel.Arrangement r22) {
            r0 = r20
            r1 = r21
            r2 = r22
            float r3 = getExtraSmallSize(r19)
            float r3 = r3 + r0
            float r4 = r2.largeSize
            float r3 = java.lang.Math.min(r3, r4)
            r4 = 1073741824(0x40000000, float:2.0)
            float r5 = r3 / r4
            r6 = 0
            float r7 = r6 - r5
            float r8 = r2.smallSize
            int r9 = r2.smallCount
            float r8 = addStart(r6, r8, r9)
            float r9 = r2.smallSize
            int r10 = r2.smallCount
            float r10 = (float) r10
            float r10 = r10 / r4
            double r10 = (double) r10
            double r10 = java.lang.Math.floor(r10)
            int r10 = (int) r10
            float r9 = addEnd(r8, r9, r10)
            float r10 = r2.smallSize
            int r11 = r2.smallCount
            float r6 = updateCurPosition(r6, r9, r10, r11)
            float r9 = r2.mediumSize
            int r10 = r2.mediumCount
            float r9 = addStart(r6, r9, r10)
            float r10 = r2.mediumSize
            int r11 = r2.mediumCount
            float r11 = (float) r11
            float r11 = r11 / r4
            double r11 = (double) r11
            double r11 = java.lang.Math.floor(r11)
            int r11 = (int) r11
            float r10 = addEnd(r9, r10, r11)
            float r11 = r2.mediumSize
            int r12 = r2.mediumCount
            float r6 = updateCurPosition(r6, r10, r11, r12)
            float r10 = r2.largeSize
            int r11 = r2.largeCount
            float r13 = addStart(r6, r10, r11)
            float r10 = r2.largeSize
            int r11 = r2.largeCount
            float r10 = addEnd(r13, r10, r11)
            float r11 = r2.largeSize
            int r12 = r2.largeCount
            float r6 = updateCurPosition(r6, r10, r11, r12)
            float r10 = r2.mediumSize
            int r11 = r2.mediumCount
            float r10 = addStart(r6, r10, r11)
            float r11 = r2.mediumSize
            int r12 = r2.mediumCount
            float r12 = (float) r12
            float r12 = r12 / r4
            double r14 = (double) r12
            double r14 = java.lang.Math.ceil(r14)
            int r12 = (int) r14
            float r11 = addEnd(r10, r11, r12)
            float r12 = r2.mediumSize
            int r14 = r2.mediumCount
            float r6 = updateCurPosition(r6, r11, r12, r14)
            float r11 = r2.smallSize
            int r12 = r2.smallCount
            float r6 = addStart(r6, r11, r12)
            float r5 = r5 + r1
            float r11 = r2.largeSize
            float r11 = com.google.android.material.carousel.CarouselStrategy.getChildMaskPercentage(r3, r11, r0)
            float r12 = r2.smallSize
            float r14 = r2.largeSize
            float r15 = com.google.android.material.carousel.CarouselStrategy.getChildMaskPercentage(r12, r14, r0)
            float r12 = r2.mediumSize
            float r14 = r2.largeSize
            float r0 = com.google.android.material.carousel.CarouselStrategy.getChildMaskPercentage(r12, r14, r0)
            com.google.android.material.carousel.KeylineState$Builder r12 = new com.google.android.material.carousel.KeylineState$Builder
            float r14 = r2.largeSize
            r12.<init>(r14, r1)
            com.google.android.material.carousel.KeylineState$Builder r1 = r12.addAnchorKeyline(r7, r11, r3)
            int r7 = r2.smallCount
            if (r7 <= 0) goto Ld0
            float r7 = r2.smallSize
            int r12 = r2.smallCount
            float r12 = (float) r12
            float r12 = r12 / r4
            r18 = r5
            double r4 = (double) r12
            double r4 = java.lang.Math.floor(r4)
            int r4 = (int) r4
            r1.addKeylineRange(r8, r15, r7, r4)
            goto Ld2
        Ld0:
            r18 = r5
        Ld2:
            int r4 = r2.mediumCount
            if (r4 <= 0) goto Le7
            float r4 = r2.mediumSize
            int r5 = r2.mediumCount
            float r5 = (float) r5
            r7 = 1073741824(0x40000000, float:2.0)
            float r5 = r5 / r7
            double r7 = (double) r5
            double r7 = java.lang.Math.floor(r7)
            int r5 = (int) r7
            r1.addKeylineRange(r9, r0, r4, r5)
        Le7:
            float r4 = r2.largeSize
            int r5 = r2.largeCount
            r17 = 1
            r14 = 0
            r12 = r1
            r7 = r15
            r15 = r4
            r16 = r5
            r12.addKeylineRange(r13, r14, r15, r16, r17)
            int r4 = r2.mediumCount
            if (r4 <= 0) goto L10b
            float r4 = r2.mediumSize
            int r5 = r2.mediumCount
            float r5 = (float) r5
            r8 = 1073741824(0x40000000, float:2.0)
            float r5 = r5 / r8
            double r8 = (double) r5
            double r8 = java.lang.Math.ceil(r8)
            int r5 = (int) r8
            r1.addKeylineRange(r10, r0, r4, r5)
        L10b:
            int r0 = r2.smallCount
            if (r0 <= 0) goto L120
            float r0 = r2.smallSize
            int r2 = r2.smallCount
            float r2 = (float) r2
            r4 = 1073741824(0x40000000, float:2.0)
            float r2 = r2 / r4
            double r4 = (double) r2
            double r4 = java.lang.Math.ceil(r4)
            int r2 = (int) r4
            r1.addKeylineRange(r6, r7, r0, r2)
        L120:
            r0 = r18
            r1.addAnchorKeyline(r0, r11, r3)
            com.google.android.material.carousel.KeylineState r0 = r1.build()
            return r0
    }

    static com.google.android.material.carousel.KeylineState createKeylineState(android.content.Context r1, float r2, float r3, com.google.android.material.carousel.Arrangement r4, int r5) {
            r0 = 1
            if (r5 != r0) goto L8
            com.google.android.material.carousel.KeylineState r1 = createCenterAlignedKeylineState(r1, r2, r3, r4)
            return r1
        L8:
            com.google.android.material.carousel.KeylineState r1 = createLeftAlignedKeylineState(r1, r2, r3, r4)
            return r1
    }

    static com.google.android.material.carousel.KeylineState createLeftAlignedKeylineState(android.content.Context r12, float r13, float r14, com.google.android.material.carousel.Arrangement r15) {
            float r12 = getExtraSmallSize(r12)
            float r12 = r12 + r13
            float r0 = r15.largeSize
            float r12 = java.lang.Math.min(r12, r0)
            r0 = 1073741824(0x40000000, float:2.0)
            float r0 = r12 / r0
            r1 = 0
            float r2 = r1 - r0
            float r3 = r15.largeSize
            int r4 = r15.largeCount
            float r6 = addStart(r1, r3, r4)
            float r3 = r15.largeSize
            int r4 = r15.largeCount
            float r3 = addEnd(r6, r3, r4)
            float r4 = r15.largeSize
            int r5 = r15.largeCount
            float r1 = updateCurPosition(r1, r3, r4, r5)
            float r3 = r15.mediumSize
            int r4 = r15.mediumCount
            float r3 = addStart(r1, r3, r4)
            float r4 = r15.mediumSize
            int r5 = r15.mediumCount
            float r1 = updateCurPosition(r1, r3, r4, r5)
            float r4 = r15.smallSize
            int r5 = r15.smallCount
            float r1 = addStart(r1, r4, r5)
            float r0 = r0 + r14
            float r4 = r15.largeSize
            float r4 = com.google.android.material.carousel.CarouselStrategy.getChildMaskPercentage(r12, r4, r13)
            float r5 = r15.smallSize
            float r7 = r15.largeSize
            float r11 = com.google.android.material.carousel.CarouselStrategy.getChildMaskPercentage(r5, r7, r13)
            float r5 = r15.mediumSize
            float r7 = r15.largeSize
            float r13 = com.google.android.material.carousel.CarouselStrategy.getChildMaskPercentage(r5, r7, r13)
            com.google.android.material.carousel.KeylineState$Builder r5 = new com.google.android.material.carousel.KeylineState$Builder
            float r7 = r15.largeSize
            r5.<init>(r7, r14)
            com.google.android.material.carousel.KeylineState$Builder r5 = r5.addAnchorKeyline(r2, r4, r12)
            float r8 = r15.largeSize
            int r9 = r15.largeCount
            r10 = 1
            r7 = 0
            com.google.android.material.carousel.KeylineState$Builder r14 = r5.addKeylineRange(r6, r7, r8, r9, r10)
            int r2 = r15.mediumCount
            if (r2 <= 0) goto L77
            float r2 = r15.mediumSize
            r14.addKeyline(r3, r13, r2)
        L77:
            int r13 = r15.smallCount
            if (r13 <= 0) goto L82
            float r13 = r15.smallSize
            int r15 = r15.smallCount
            r14.addKeylineRange(r1, r11, r13, r15)
        L82:
            r14.addAnchorKeyline(r0, r4, r12)
            com.google.android.material.carousel.KeylineState r12 = r14.build()
            return r12
    }

    static float getExtraSmallSize(android.content.Context r1) {
            android.content.res.Resources r1 = r1.getResources()
            int r0 = com.google.android.material.R.dimen.m3_carousel_gone_size
            float r1 = r1.getDimension(r0)
            return r1
    }

    static float getSmallSizeMax(android.content.Context r1) {
            android.content.res.Resources r1 = r1.getResources()
            int r0 = com.google.android.material.R.dimen.m3_carousel_small_item_size_max
            float r1 = r1.getDimension(r0)
            return r1
    }

    static float getSmallSizeMin(android.content.Context r1) {
            android.content.res.Resources r1 = r1.getResources()
            int r0 = com.google.android.material.R.dimen.m3_carousel_small_item_size_min
            float r1 = r1.getDimension(r0)
            return r1
    }

    static int maxValue(int[] r4) {
            int r0 = r4.length
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = 0
        L4:
            if (r2 >= r0) goto Le
            r3 = r4[r2]
            if (r3 <= r1) goto Lb
            r1 = r3
        Lb:
            int r2 = r2 + 1
            goto L4
        Le:
            return r1
    }

    static float updateCurPosition(float r0, float r1, float r2, int r3) {
            if (r3 <= 0) goto L7
            r0 = 1073741824(0x40000000, float:2.0)
            float r2 = r2 / r0
            float r1 = r1 + r2
            return r1
        L7:
            return r0
    }
}
