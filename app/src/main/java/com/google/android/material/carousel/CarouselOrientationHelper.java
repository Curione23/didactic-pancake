package com.google.android.material.carousel;

/* JADX INFO: loaded from: classes.dex */
abstract class CarouselOrientationHelper {
    final int orientation;



    private CarouselOrientationHelper(int r1) {
            r0 = this;
            r0.<init>()
            r0.orientation = r1
            return
    }

    /* synthetic */ CarouselOrientationHelper(int r1, com.google.android.material.carousel.CarouselOrientationHelper.AnonymousClass1 r2) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    private static com.google.android.material.carousel.CarouselOrientationHelper createHorizontalHelper(com.google.android.material.carousel.CarouselLayoutManager r2) {
            com.google.android.material.carousel.CarouselOrientationHelper$2 r0 = new com.google.android.material.carousel.CarouselOrientationHelper$2
            r1 = 0
            r0.<init>(r1, r2)
            return r0
    }

    static com.google.android.material.carousel.CarouselOrientationHelper createOrientationHelper(com.google.android.material.carousel.CarouselLayoutManager r1, int r2) {
            if (r2 == 0) goto L12
            r0 = 1
            if (r2 != r0) goto La
            com.google.android.material.carousel.CarouselOrientationHelper r1 = createVerticalHelper(r1)
            return r1
        La:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "invalid orientation"
            r1.<init>(r2)
            throw r1
        L12:
            com.google.android.material.carousel.CarouselOrientationHelper r1 = createHorizontalHelper(r1)
            return r1
    }

    private static com.google.android.material.carousel.CarouselOrientationHelper createVerticalHelper(com.google.android.material.carousel.CarouselLayoutManager r2) {
            com.google.android.material.carousel.CarouselOrientationHelper$1 r0 = new com.google.android.material.carousel.CarouselOrientationHelper$1
            r1 = 1
            r0.<init>(r1, r2)
            return r0
    }

    abstract void containMaskWithinBounds(android.graphics.RectF r1, android.graphics.RectF r2, android.graphics.RectF r3);

    abstract int getDecoratedCrossAxisMeasurement(android.view.View r1);

    abstract float getMaskMargins(androidx.recyclerview.widget.RecyclerView.LayoutParams r1);

    abstract android.graphics.RectF getMaskRect(float r1, float r2, float r3, float r4);

    abstract int getParentBottom();

    abstract int getParentEnd();

    abstract int getParentLeft();

    abstract int getParentRight();

    abstract int getParentStart();

    abstract int getParentTop();

    abstract void layoutDecoratedWithMargins(android.view.View r1, int r2, int r3);

    abstract void moveMaskOnEdgeOutsideBounds(android.graphics.RectF r1, android.graphics.RectF r2, android.graphics.RectF r3);

    abstract void offsetChild(android.view.View r1, android.graphics.Rect r2, float r3, float r4);
}
