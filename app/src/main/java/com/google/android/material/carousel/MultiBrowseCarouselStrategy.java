package com.google.android.material.carousel;

/* JADX INFO: loaded from: classes.dex */
public final class MultiBrowseCarouselStrategy extends com.google.android.material.carousel.CarouselStrategy {
    private static final int[] MEDIUM_COUNTS = null;
    private static final int[] SMALL_COUNTS = null;
    private int keylineCount;

    static {
            r0 = 1
            int[] r1 = new int[]{r0}
            com.google.android.material.carousel.MultiBrowseCarouselStrategy.SMALL_COUNTS = r1
            r1 = 0
            int[] r0 = new int[]{r0, r1}
            com.google.android.material.carousel.MultiBrowseCarouselStrategy.MEDIUM_COUNTS = r0
            return
    }

    public MultiBrowseCarouselStrategy() {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.keylineCount = r0
            return
    }

    boolean ensureArrangementFitsItemCount(com.google.android.material.carousel.Arrangement r4, int r5) {
            r3 = this;
            int r0 = r4.getItemCount()
            int r0 = r0 - r5
            r5 = 1
            if (r0 <= 0) goto L12
            int r1 = r4.smallCount
            if (r1 > 0) goto L10
            int r1 = r4.mediumCount
            if (r1 <= r5) goto L12
        L10:
            r1 = r5
            goto L13
        L12:
            r1 = 0
        L13:
            if (r0 <= 0) goto L2b
            int r2 = r4.smallCount
            if (r2 <= 0) goto L1f
            int r2 = r4.smallCount
            int r2 = r2 - r5
            r4.smallCount = r2
            goto L28
        L1f:
            int r2 = r4.mediumCount
            if (r2 <= r5) goto L28
            int r2 = r4.mediumCount
            int r2 = r2 - r5
            r4.mediumCount = r2
        L28:
            int r0 = r0 + (-1)
            goto L13
        L2b:
            return r1
    }

    @Override // com.google.android.material.carousel.CarouselStrategy
    com.google.android.material.carousel.KeylineState onFirstChildMeasuredWithMargins(com.google.android.material.carousel.Carousel r18, android.view.View r19) {
            r17 = this;
            r0 = r17
            int r1 = r18.getContainerHeight()
            float r1 = (float) r1
            boolean r2 = r18.isHorizontal()
            if (r2 == 0) goto L12
            int r1 = r18.getContainerWidth()
            float r1 = (float) r1
        L12:
            android.view.ViewGroup$LayoutParams r2 = r19.getLayoutParams()
            androidx.recyclerview.widget.RecyclerView$LayoutParams r2 = (androidx.recyclerview.widget.RecyclerView.LayoutParams) r2
            int r3 = r2.topMargin
            int r4 = r2.bottomMargin
            int r3 = r3 + r4
            float r3 = (float) r3
            int r4 = r19.getMeasuredHeight()
            float r4 = (float) r4
            boolean r5 = r18.isHorizontal()
            if (r5 == 0) goto L34
            int r3 = r2.leftMargin
            int r2 = r2.rightMargin
            int r3 = r3 + r2
            float r3 = (float) r3
            int r2 = r19.getMeasuredWidth()
            float r4 = (float) r2
        L34:
            r11 = r3
            float r2 = r17.getSmallItemSizeMin()
            float r12 = r2 + r11
            float r2 = r17.getSmallItemSizeMax()
            float r2 = r2 + r11
            float r13 = java.lang.Math.max(r2, r12)
            float r2 = r4 + r11
            float r14 = java.lang.Math.min(r2, r1)
            r2 = 1077936128(0x40400000, float:3.0)
            float r4 = r4 / r2
            float r4 = r4 + r11
            float r2 = r12 + r11
            float r3 = r13 + r11
            float r15 = androidx.core.math.MathUtils.clamp(r4, r2, r3)
            float r2 = r14 + r15
            r3 = 1073741824(0x40000000, float:2.0)
            float r16 = r2 / r3
            int[] r2 = com.google.android.material.carousel.MultiBrowseCarouselStrategy.SMALL_COUNTS
            float r3 = r3 * r12
            int r3 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            r4 = 0
            r5 = 1
            if (r3 >= 0) goto L69
            int[] r2 = new int[r5]
            r2[r4] = r4
        L69:
            int[] r3 = com.google.android.material.carousel.MultiBrowseCarouselStrategy.MEDIUM_COUNTS
            int r6 = r18.getCarouselAlignment()
            if (r6 != r5) goto L79
            int[] r2 = doubleCounts(r2)
            int[] r3 = doubleCounts(r3)
        L79:
            r6 = r2
            r8 = r3
            int r2 = com.google.android.material.carousel.CarouselStrategyHelper.maxValue(r8)
            float r2 = (float) r2
            float r2 = r2 * r16
            float r2 = r1 - r2
            int r3 = com.google.android.material.carousel.CarouselStrategyHelper.maxValue(r6)
            float r3 = (float) r3
            float r3 = r3 * r13
            float r2 = r2 - r3
            float r2 = r2 / r14
            double r2 = (double) r2
            double r2 = java.lang.Math.floor(r2)
            r9 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            double r2 = java.lang.Math.max(r9, r2)
            int r2 = (int) r2
            float r3 = r1 / r14
            double r9 = (double) r3
            double r9 = java.lang.Math.ceil(r9)
            int r3 = (int) r9
            int r2 = r3 - r2
            int r2 = r2 + r5
            int[] r10 = new int[r2]
        La5:
            if (r4 >= r2) goto Lae
            int r5 = r3 - r4
            r10[r4] = r5
            int r4 = r4 + 1
            goto La5
        Lae:
            r2 = r1
            r3 = r15
            r4 = r12
            r5 = r13
            r7 = r16
            r9 = r14
            com.google.android.material.carousel.Arrangement r2 = com.google.android.material.carousel.Arrangement.findLowestCostArrangement(r2, r3, r4, r5, r6, r7, r8, r9, r10)
            int r3 = r2.getItemCount()
            r0.keylineCount = r3
            int r3 = r18.getItemCount()
            boolean r3 = r0.ensureArrangementFitsItemCount(r2, r3)
            if (r3 == 0) goto Le6
            int r3 = r2.smallCount
            int[] r6 = new int[]{r3}
            int r3 = r2.mediumCount
            int[] r8 = new int[]{r3}
            int r2 = r2.largeCount
            int[] r10 = new int[]{r2}
            r2 = r1
            r3 = r15
            r4 = r12
            r5 = r13
            r7 = r16
            r9 = r14
            com.google.android.material.carousel.Arrangement r2 = com.google.android.material.carousel.Arrangement.findLowestCostArrangement(r2, r3, r4, r5, r6, r7, r8, r9, r10)
        Le6:
            android.content.Context r3 = r19.getContext()
            int r4 = r18.getCarouselAlignment()
            com.google.android.material.carousel.KeylineState r1 = com.google.android.material.carousel.CarouselStrategyHelper.createKeylineState(r3, r11, r1, r2, r4)
            return r1
    }

    @Override // com.google.android.material.carousel.CarouselStrategy
    boolean shouldRefreshKeylineState(com.google.android.material.carousel.Carousel r3, int r4) {
            r2 = this;
            int r0 = r2.keylineCount
            if (r4 >= r0) goto Lc
            int r0 = r3.getItemCount()
            int r1 = r2.keylineCount
            if (r0 >= r1) goto L18
        Lc:
            int r0 = r2.keylineCount
            if (r4 < r0) goto L1a
            int r3 = r3.getItemCount()
            int r4 = r2.keylineCount
            if (r3 >= r4) goto L1a
        L18:
            r3 = 1
            goto L1b
        L1a:
            r3 = 0
        L1b:
            return r3
    }
}
