package com.google.android.material.carousel;

/* JADX INFO: loaded from: classes.dex */
public class CarouselSnapHelper extends androidx.recyclerview.widget.SnapHelper {
    private static final float HORIZONTAL_SNAP_SPEED = 100.0f;
    private static final float VERTICAL_SNAP_SPEED = 50.0f;
    private final boolean disableFling;
    private androidx.recyclerview.widget.RecyclerView recyclerView;


    public CarouselSnapHelper() {
            r1 = this;
            r0 = 1
            r1.<init>(r0)
            return
    }

    public CarouselSnapHelper(boolean r1) {
            r0 = this;
            r0.<init>()
            r0.disableFling = r1
            return
    }

    static /* synthetic */ androidx.recyclerview.widget.RecyclerView access$000(com.google.android.material.carousel.CarouselSnapHelper r0) {
            androidx.recyclerview.widget.RecyclerView r0 = r0.recyclerView
            return r0
    }

    static /* synthetic */ int[] access$100(com.google.android.material.carousel.CarouselSnapHelper r0, androidx.recyclerview.widget.RecyclerView.LayoutManager r1, android.view.View r2, boolean r3) {
            int[] r0 = r0.calculateDistanceToSnap(r1, r2, r3)
            return r0
    }

    private int[] calculateDistanceToSnap(androidx.recyclerview.widget.RecyclerView.LayoutManager r3, android.view.View r4, boolean r5) {
            r2 = this;
            boolean r0 = r3 instanceof com.google.android.material.carousel.CarouselLayoutManager
            r1 = 0
            if (r0 != 0) goto La
            int[] r3 = new int[]{r1, r1}
            return r3
        La:
            r0 = r3
            com.google.android.material.carousel.CarouselLayoutManager r0 = (com.google.android.material.carousel.CarouselLayoutManager) r0
            int r4 = r2.distanceToFirstFocalKeyline(r4, r0, r5)
            boolean r5 = r3.canScrollHorizontally()
            if (r5 == 0) goto L1c
            int[] r3 = new int[]{r4, r1}
            return r3
        L1c:
            boolean r3 = r3.canScrollVertically()
            if (r3 == 0) goto L27
            int[] r3 = new int[]{r1, r4}
            return r3
        L27:
            int[] r3 = new int[]{r1, r1}
            return r3
    }

    private int distanceToFirstFocalKeyline(android.view.View r1, com.google.android.material.carousel.CarouselLayoutManager r2, boolean r3) {
            r0 = this;
            int r1 = r2.getPosition(r1)
            int r1 = r2.getOffsetToScrollToPositionForSnap(r1, r3)
            return r1
    }

    private android.view.View findViewNearestFirstKeyline(androidx.recyclerview.widget.RecyclerView.LayoutManager r9) {
            r8 = this;
            int r0 = r9.getChildCount()
            r1 = 0
            if (r0 == 0) goto L2d
            boolean r2 = r9 instanceof com.google.android.material.carousel.CarouselLayoutManager
            if (r2 != 0) goto Lc
            goto L2d
        Lc:
            r2 = r9
            com.google.android.material.carousel.CarouselLayoutManager r2 = (com.google.android.material.carousel.CarouselLayoutManager) r2
            r3 = 0
            r4 = 2147483647(0x7fffffff, float:NaN)
            r5 = r3
        L14:
            if (r5 >= r0) goto L2d
            android.view.View r6 = r9.getChildAt(r5)
            int r7 = r9.getPosition(r6)
            int r7 = r2.getOffsetToScrollToPositionForSnap(r7, r3)
            int r7 = java.lang.Math.abs(r7)
            if (r7 >= r4) goto L2a
            r1 = r6
            r4 = r7
        L2a:
            int r5 = r5 + 1
            goto L14
        L2d:
            return r1
    }

    private boolean isForwardFling(androidx.recyclerview.widget.RecyclerView.LayoutManager r3, int r4, int r5) {
            r2 = this;
            boolean r3 = r3.canScrollHorizontally()
            r0 = 1
            r1 = 0
            if (r3 == 0) goto Ld
            if (r4 <= 0) goto Lb
            goto Lc
        Lb:
            r0 = r1
        Lc:
            return r0
        Ld:
            if (r5 <= 0) goto L10
            goto L11
        L10:
            r0 = r1
        L11:
            return r0
    }

    private boolean isReverseLayout(androidx.recyclerview.widget.RecyclerView.LayoutManager r5) {
            r4 = this;
            int r0 = r5.getItemCount()
            boolean r1 = r5 instanceof androidx.recyclerview.widget.RecyclerView.SmoothScroller.ScrollVectorProvider
            r2 = 0
            if (r1 == 0) goto L21
            androidx.recyclerview.widget.RecyclerView$SmoothScroller$ScrollVectorProvider r5 = (androidx.recyclerview.widget.RecyclerView.SmoothScroller.ScrollVectorProvider) r5
            r1 = 1
            int r0 = r0 - r1
            android.graphics.PointF r5 = r5.computeScrollVectorForPosition(r0)
            if (r5 == 0) goto L21
            float r0 = r5.x
            r3 = 0
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 < 0) goto L20
            float r5 = r5.y
            int r5 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r5 >= 0) goto L21
        L20:
            r2 = r1
        L21:
            return r2
    }

    @Override // androidx.recyclerview.widget.SnapHelper
    public void attachToRecyclerView(androidx.recyclerview.widget.RecyclerView r1) {
            r0 = this;
            super.attachToRecyclerView(r1)
            r0.recyclerView = r1
            return
    }

    @Override // androidx.recyclerview.widget.SnapHelper
    public int[] calculateDistanceToFinalSnap(androidx.recyclerview.widget.RecyclerView.LayoutManager r2, android.view.View r3) {
            r1 = this;
            r0 = 0
            int[] r2 = r1.calculateDistanceToSnap(r2, r3, r0)
            return r2
    }

    @Override // androidx.recyclerview.widget.SnapHelper
    protected androidx.recyclerview.widget.RecyclerView.SmoothScroller createScroller(androidx.recyclerview.widget.RecyclerView.LayoutManager r3) {
            r2 = this;
            boolean r0 = r3 instanceof androidx.recyclerview.widget.RecyclerView.SmoothScroller.ScrollVectorProvider
            if (r0 == 0) goto L10
            com.google.android.material.carousel.CarouselSnapHelper$1 r0 = new com.google.android.material.carousel.CarouselSnapHelper$1
            androidx.recyclerview.widget.RecyclerView r1 = r2.recyclerView
            android.content.Context r1 = r1.getContext()
            r0.<init>(r2, r1, r3)
            goto L11
        L10:
            r0 = 0
        L11:
            return r0
    }

    @Override // androidx.recyclerview.widget.SnapHelper
    public android.view.View findSnapView(androidx.recyclerview.widget.RecyclerView.LayoutManager r1) {
            r0 = this;
            android.view.View r1 = r0.findViewNearestFirstKeyline(r1)
            return r1
    }

    @Override // androidx.recyclerview.widget.SnapHelper
    public int findTargetSnapPosition(androidx.recyclerview.widget.RecyclerView.LayoutManager r12, int r13, int r14) {
            r11 = this;
            boolean r0 = r11.disableFling
            r1 = -1
            if (r0 != 0) goto L6
            return r1
        L6:
            int r0 = r12.getItemCount()
            if (r0 != 0) goto Ld
            return r1
        Ld:
            int r2 = r12.getChildCount()
            r3 = 0
            r4 = 0
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = 2147483647(0x7fffffff, float:NaN)
            r8 = r3
            r7 = r6
            r6 = r5
            r5 = r4
        L1c:
            if (r8 >= r2) goto L3b
            android.view.View r9 = r12.getChildAt(r8)
            if (r9 != 0) goto L25
            goto L38
        L25:
            r10 = r12
            com.google.android.material.carousel.CarouselLayoutManager r10 = (com.google.android.material.carousel.CarouselLayoutManager) r10
            int r10 = r11.distanceToFirstFocalKeyline(r9, r10, r3)
            if (r10 > 0) goto L32
            if (r10 <= r6) goto L32
            r5 = r9
            r6 = r10
        L32:
            if (r10 < 0) goto L38
            if (r10 >= r7) goto L38
            r4 = r9
            r7 = r10
        L38:
            int r8 = r8 + 1
            goto L1c
        L3b:
            boolean r13 = r11.isForwardFling(r12, r13, r14)
            if (r13 == 0) goto L48
            if (r4 == 0) goto L48
            int r12 = r12.getPosition(r4)
            return r12
        L48:
            if (r13 != 0) goto L51
            if (r5 == 0) goto L51
            int r12 = r12.getPosition(r5)
            return r12
        L51:
            if (r13 == 0) goto L54
            r4 = r5
        L54:
            if (r4 != 0) goto L57
            return r1
        L57:
            int r14 = r12.getPosition(r4)
            boolean r12 = r11.isReverseLayout(r12)
            if (r12 != r13) goto L63
            r12 = r1
            goto L64
        L63:
            r12 = 1
        L64:
            int r14 = r14 + r12
            if (r14 < 0) goto L6b
            if (r14 < r0) goto L6a
            goto L6b
        L6a:
            return r14
        L6b:
            return r1
    }
}
