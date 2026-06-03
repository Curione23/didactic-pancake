package com.google.android.material.carousel;

/* JADX INFO: loaded from: classes.dex */
public class HeroCarouselStrategy extends com.google.android.material.carousel.CarouselStrategy {
    private static final int[] MEDIUM_COUNTS = null;
    private static final int[] SMALL_COUNTS = null;
    private int keylineCount;

    static {
            r0 = 1
            int[] r1 = new int[]{r0}
            com.google.android.material.carousel.HeroCarouselStrategy.SMALL_COUNTS = r1
            r1 = 0
            int[] r0 = new int[]{r1, r0}
            com.google.android.material.carousel.HeroCarouselStrategy.MEDIUM_COUNTS = r0
            return
    }

    public HeroCarouselStrategy() {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.keylineCount = r0
            return
    }

    @Override // com.google.android.material.carousel.CarouselStrategy
    com.google.android.material.carousel.KeylineState onFirstChildMeasuredWithMargins(com.google.android.material.carousel.Carousel r21, android.view.View r22) {
            r20 = this;
            int r0 = r21.getContainerHeight()
            boolean r1 = r21.isHorizontal()
            if (r1 == 0) goto Le
            int r0 = r21.getContainerWidth()
        Le:
            android.view.ViewGroup$LayoutParams r1 = r22.getLayoutParams()
            androidx.recyclerview.widget.RecyclerView$LayoutParams r1 = (androidx.recyclerview.widget.RecyclerView.LayoutParams) r1
            int r2 = r1.topMargin
            int r3 = r1.bottomMargin
            int r2 = r2 + r3
            float r2 = (float) r2
            int r3 = r22.getMeasuredWidth()
            int r3 = r3 * 2
            float r3 = (float) r3
            boolean r4 = r21.isHorizontal()
            if (r4 == 0) goto L34
            int r2 = r1.leftMargin
            int r1 = r1.rightMargin
            int r2 = r2 + r1
            float r2 = (float) r2
            int r1 = r22.getMeasuredHeight()
            int r1 = r1 * 2
            float r3 = (float) r1
        L34:
            float r1 = r20.getSmallItemSizeMin()
            float r1 = r1 + r2
            float r4 = r20.getSmallItemSizeMax()
            float r4 = r4 + r2
            float r13 = java.lang.Math.max(r4, r1)
            float r4 = r3 + r2
            float r0 = (float) r0
            float r14 = java.lang.Math.min(r4, r0)
            r4 = 1077936128(0x40400000, float:3.0)
            float r3 = r3 / r4
            float r3 = r3 + r2
            float r4 = r1 + r2
            float r5 = r13 + r2
            float r3 = androidx.core.math.MathUtils.clamp(r3, r4, r5)
            float r4 = r14 + r3
            r5 = 1073741824(0x40000000, float:2.0)
            float r15 = r4 / r5
            int[] r4 = com.google.android.material.carousel.HeroCarouselStrategy.SMALL_COUNTS
            float r5 = r5 * r1
            int r5 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            r16 = 0
            r6 = 1
            if (r5 >= 0) goto L6c
            int[] r5 = new int[r6]
            r5[r16] = r16
            r17 = r5
            goto L6e
        L6c:
            r17 = r4
        L6e:
            int r4 = com.google.android.material.carousel.CarouselStrategyHelper.maxValue(r4)
            float r4 = (float) r4
            float r4 = r4 * r13
            float r4 = r0 - r4
            float r4 = r4 / r14
            double r4 = (double) r4
            double r4 = java.lang.Math.floor(r4)
            r7 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            double r4 = java.lang.Math.max(r7, r4)
            int r4 = (int) r4
            float r5 = r0 / r14
            double r7 = (double) r5
            double r7 = java.lang.Math.ceil(r7)
            int r5 = (int) r7
            int r5 = r5 - r4
            int r5 = r5 + r6
            int[] r12 = new int[r5]
            r7 = r16
        L91:
            if (r7 >= r5) goto L9a
            int r8 = r4 + r7
            r12[r7] = r8
            int r7 = r7 + 1
            goto L91
        L9a:
            int r4 = r21.getCarouselAlignment()
            if (r4 != r6) goto La3
            r18 = r6
            goto La5
        La3:
            r18 = r16
        La5:
            if (r18 == 0) goto Lad
            int[] r4 = doubleCounts(r17)
            r8 = r4
            goto Laf
        Lad:
            r8 = r17
        Laf:
            if (r18 == 0) goto Lb8
            int[] r4 = com.google.android.material.carousel.HeroCarouselStrategy.MEDIUM_COUNTS
            int[] r4 = doubleCounts(r4)
            goto Lba
        Lb8:
            int[] r4 = com.google.android.material.carousel.HeroCarouselStrategy.MEDIUM_COUNTS
        Lba:
            r10 = r4
            r4 = r0
            r5 = r3
            r6 = r1
            r7 = r13
            r9 = r15
            r11 = r14
            r19 = r12
            com.google.android.material.carousel.Arrangement r4 = com.google.android.material.carousel.Arrangement.findLowestCostArrangement(r4, r5, r6, r7, r8, r9, r10, r11, r12)
            int r5 = r4.getItemCount()
            r12 = r20
            r12.keylineCount = r5
            int r5 = r4.getItemCount()
            int r6 = r21.getItemCount()
            if (r5 <= r6) goto Lec
            int[] r10 = com.google.android.material.carousel.HeroCarouselStrategy.MEDIUM_COUNTS
            r4 = r0
            r5 = r3
            r6 = r1
            r7 = r13
            r8 = r17
            r9 = r15
            r11 = r14
            r12 = r19
            com.google.android.material.carousel.Arrangement r4 = com.google.android.material.carousel.Arrangement.findLowestCostArrangement(r4, r5, r6, r7, r8, r9, r10, r11, r12)
            r1 = r16
            goto Lee
        Lec:
            r1 = r18
        Lee:
            android.content.Context r3 = r22.getContext()
            com.google.android.material.carousel.KeylineState r0 = com.google.android.material.carousel.CarouselStrategyHelper.createKeylineState(r3, r2, r0, r4, r1)
            return r0
    }

    @Override // com.google.android.material.carousel.CarouselStrategy
    boolean shouldRefreshKeylineState(com.google.android.material.carousel.Carousel r4, int r5) {
            r3 = this;
            int r0 = r4.getCarouselAlignment()
            r1 = 1
            if (r0 != r1) goto L20
            int r0 = r3.keylineCount
            if (r5 >= r0) goto L13
            int r0 = r4.getItemCount()
            int r2 = r3.keylineCount
            if (r0 >= r2) goto L21
        L13:
            int r0 = r3.keylineCount
            if (r5 < r0) goto L20
            int r4 = r4.getItemCount()
            int r5 = r3.keylineCount
            if (r4 >= r5) goto L20
            goto L21
        L20:
            r1 = 0
        L21:
            return r1
    }
}
