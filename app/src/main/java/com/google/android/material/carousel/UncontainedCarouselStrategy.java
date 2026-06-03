package com.google.android.material.carousel;

/* JADX INFO: loaded from: classes.dex */
public final class UncontainedCarouselStrategy extends com.google.android.material.carousel.CarouselStrategy {
    private static final float MEDIUM_LARGE_ITEM_PERCENTAGE_THRESHOLD = 0.85f;

    public UncontainedCarouselStrategy() {
            r0 = this;
            r0.<init>()
            return
    }

    private float calculateMediumChildSize(float r3, float r4, float r5) {
            r2 = this;
            r0 = 1069547520(0x3fc00000, float:1.5)
            float r0 = r0 * r5
            float r3 = java.lang.Math.max(r0, r3)
            r0 = 1062836634(0x3f59999a, float:0.85)
            float r0 = r0 * r4
            int r1 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r1 <= 0) goto L17
            r3 = 1067030938(0x3f99999a, float:1.2)
            float r5 = r5 * r3
            float r3 = java.lang.Math.max(r0, r5)
        L17:
            float r3 = java.lang.Math.min(r4, r3)
            return r3
    }

    private com.google.android.material.carousel.KeylineState createCenterAlignedKeylineState(float r16, float r17, float r18, int r19, float r20, float r21, float r22) {
            r15 = this;
            r0 = r17
            r3 = r18
            r6 = r20
            r1 = r21
            float r7 = java.lang.Math.min(r1, r3)
            float r8 = getChildMaskPercentage(r7, r3, r0)
            float r9 = getChildMaskPercentage(r6, r3, r0)
            r0 = 0
            float r0 = r22 + r0
            r1 = 1073741824(0x40000000, float:2.0)
            float r10 = r6 / r1
            float r0 = r0 - r10
            float r2 = r0 + r10
            float r4 = r0 - r10
            float r11 = r7 / r1
            float r4 = r4 - r11
            float r1 = r3 / r1
            float r1 = r1 + r2
            r5 = r19
            float r12 = (float) r5
            float r12 = r12 * r3
            float r12 = r12 + r2
            com.google.android.material.carousel.KeylineState$Builder r2 = new com.google.android.material.carousel.KeylineState$Builder
            r13 = r16
            r2.<init>(r3, r13)
            com.google.android.material.carousel.KeylineState$Builder r2 = r2.addAnchorKeyline(r4, r8, r7)
            r13 = 0
            com.google.android.material.carousel.KeylineState$Builder r0 = r2.addKeyline(r0, r9, r6, r13)
            r14 = 1
            r2 = 0
            r4 = r19
            r5 = r14
            com.google.android.material.carousel.KeylineState$Builder r0 = r0.addKeylineRange(r1, r2, r3, r4, r5)
            float r10 = r10 + r12
            float r12 = r12 + r6
            r0.addKeyline(r10, r9, r6, r13)
            float r12 = r12 + r11
            r0.addAnchorKeyline(r12, r8, r7)
            com.google.android.material.carousel.KeylineState r0 = r0.build()
            return r0
    }

    private com.google.android.material.carousel.KeylineState createLeftAlignedKeylineState(android.content.Context r15, float r16, float r17, float r18, int r19, float r20, int r21, float r22) {
            r14 = this;
            r0 = r16
            r3 = r18
            r6 = r20
            r1 = r22
            float r7 = java.lang.Math.min(r1, r3)
            r1 = 1056964608(0x3f000000, float:0.5)
            float r1 = r1 * r6
            float r1 = java.lang.Math.max(r7, r1)
            float r2 = getChildMaskPercentage(r1, r3, r0)
            float r8 = getChildMaskPercentage(r7, r3, r0)
            float r9 = getChildMaskPercentage(r6, r3, r0)
            r10 = 1073741824(0x40000000, float:2.0)
            float r0 = r1 / r10
            r4 = 0
            float r0 = r4 - r0
            float r5 = r3 / r10
            r11 = r19
            float r12 = (float) r11
            float r12 = r12 * r3
            float r12 = r12 + r4
            com.google.android.material.carousel.KeylineState$Builder r4 = new com.google.android.material.carousel.KeylineState$Builder
            r13 = r17
            r4.<init>(r3, r13)
            com.google.android.material.carousel.KeylineState$Builder r0 = r4.addAnchorKeyline(r0, r2, r1)
            r13 = 1
            r2 = 0
            r1 = r5
            r4 = r19
            r5 = r13
            com.google.android.material.carousel.KeylineState$Builder r0 = r0.addKeylineRange(r1, r2, r3, r4, r5)
            if (r21 <= 0) goto L4c
            float r1 = r6 / r10
            float r1 = r1 + r12
            float r12 = r12 + r6
            r2 = 0
            r0.addKeyline(r1, r9, r6, r2)
        L4c:
            float r1 = com.google.android.material.carousel.CarouselStrategyHelper.getExtraSmallSize(r15)
            float r1 = r1 / r10
            float r12 = r12 + r1
            r0.addAnchorKeyline(r12, r8, r7)
            com.google.android.material.carousel.KeylineState r0 = r0.build()
            return r0
    }

    @Override // com.google.android.material.carousel.CarouselStrategy
    boolean isContained() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // com.google.android.material.carousel.CarouselStrategy
    com.google.android.material.carousel.KeylineState onFirstChildMeasuredWithMargins(com.google.android.material.carousel.Carousel r11, android.view.View r12) {
            r10 = this;
            boolean r0 = r11.isHorizontal()
            if (r0 == 0) goto Lb
            int r0 = r11.getContainerWidth()
            goto Lf
        Lb:
            int r0 = r11.getContainerHeight()
        Lf:
            float r0 = (float) r0
            r4 = r0
            android.view.ViewGroup$LayoutParams r0 = r12.getLayoutParams()
            androidx.recyclerview.widget.RecyclerView$LayoutParams r0 = (androidx.recyclerview.widget.RecyclerView.LayoutParams) r0
            int r1 = r0.topMargin
            int r2 = r0.bottomMargin
            int r1 = r1 + r2
            float r1 = (float) r1
            int r2 = r12.getMeasuredHeight()
            float r2 = (float) r2
            boolean r3 = r11.isHorizontal()
            if (r3 == 0) goto L35
            int r1 = r0.leftMargin
            int r0 = r0.rightMargin
            int r1 = r1 + r0
            float r0 = (float) r1
            int r1 = r12.getMeasuredWidth()
            float r2 = (float) r1
            r3 = r0
            goto L36
        L35:
            r3 = r1
        L36:
            float r5 = r2 + r3
            android.content.Context r0 = r12.getContext()
            float r0 = com.google.android.material.carousel.CarouselStrategyHelper.getExtraSmallSize(r0)
            float r0 = r0 + r3
            android.content.Context r1 = r12.getContext()
            float r1 = com.google.android.material.carousel.CarouselStrategyHelper.getExtraSmallSize(r1)
            float r9 = r1 + r3
            float r1 = r4 / r5
            double r1 = (double) r1
            double r1 = java.lang.Math.floor(r1)
            int r1 = (int) r1
            r2 = 1
            int r6 = java.lang.Math.max(r2, r1)
            float r1 = (float) r6
            float r1 = r1 * r5
            float r1 = r4 - r1
            int r11 = r11.getCarouselAlignment()
            if (r11 != r2) goto L81
            r11 = 1073741824(0x40000000, float:2.0)
            float r8 = r1 / r11
            float r11 = r10.getSmallItemSizeMin()
            float r11 = r11 + r3
            r12 = 1077936128(0x40400000, float:3.0)
            float r12 = r12 * r8
            float r12 = java.lang.Math.min(r12, r5)
            float r11 = java.lang.Math.max(r12, r11)
            r1 = r10
            r2 = r4
            r4 = r5
            r5 = r6
            r6 = r11
            r7 = r9
            com.google.android.material.carousel.KeylineState r11 = r1.createCenterAlignedKeylineState(r2, r3, r4, r5, r6, r7, r8)
            return r11
        L81:
            r11 = 0
            int r11 = (r1 > r11 ? 1 : (r1 == r11 ? 0 : -1))
            if (r11 <= 0) goto L88
            r8 = r2
            goto L8a
        L88:
            r11 = 0
            r8 = r11
        L8a:
            float r7 = r10.calculateMediumChildSize(r0, r5, r1)
            android.content.Context r2 = r12.getContext()
            r1 = r10
            com.google.android.material.carousel.KeylineState r11 = r1.createLeftAlignedKeylineState(r2, r3, r4, r5, r6, r7, r8, r9)
            return r11
    }
}
