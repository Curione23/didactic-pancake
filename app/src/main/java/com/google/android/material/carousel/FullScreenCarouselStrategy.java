package com.google.android.material.carousel;

/* JADX INFO: loaded from: classes.dex */
public class FullScreenCarouselStrategy extends com.google.android.material.carousel.CarouselStrategy {
    public FullScreenCarouselStrategy() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // com.google.android.material.carousel.CarouselStrategy
    com.google.android.material.carousel.KeylineState onFirstChildMeasuredWithMargins(com.google.android.material.carousel.Carousel r14, android.view.View r15) {
            r13 = this;
            android.view.ViewGroup$LayoutParams r0 = r15.getLayoutParams()
            androidx.recyclerview.widget.RecyclerView$LayoutParams r0 = (androidx.recyclerview.widget.RecyclerView.LayoutParams) r0
            boolean r1 = r14.isHorizontal()
            if (r1 == 0) goto L16
            int r14 = r14.getContainerWidth()
            float r14 = (float) r14
            int r1 = r0.leftMargin
            int r0 = r0.rightMargin
            goto L1f
        L16:
            int r14 = r14.getContainerHeight()
            float r14 = (float) r14
            int r1 = r0.topMargin
            int r0 = r0.bottomMargin
        L1f:
            int r1 = r1 + r0
            float r0 = (float) r1
            float r1 = r14 + r0
            float r9 = java.lang.Math.min(r1, r14)
            com.google.android.material.carousel.Arrangement r12 = new com.google.android.material.carousel.Arrangement
            r8 = 0
            r10 = 1
            r2 = 0
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r1 = r12
            r11 = r14
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            android.content.Context r15 = r15.getContext()
            com.google.android.material.carousel.KeylineState r14 = com.google.android.material.carousel.CarouselStrategyHelper.createLeftAlignedKeylineState(r15, r0, r14, r12)
            return r14
    }
}
