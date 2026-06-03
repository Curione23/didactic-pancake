package com.google.android.material.carousel;

/* JADX INFO: loaded from: classes.dex */
public class CarouselLayoutManager extends androidx.recyclerview.widget.RecyclerView.LayoutManager implements com.google.android.material.carousel.Carousel, androidx.recyclerview.widget.RecyclerView.SmoothScroller.ScrollVectorProvider {
    public static final int ALIGNMENT_CENTER = 1;
    public static final int ALIGNMENT_START = 0;
    public static final int HORIZONTAL = 0;
    private static final java.lang.String TAG = "CarouselLayoutManager";
    public static final int VERTICAL = 1;
    private int carouselAlignment;
    private com.google.android.material.carousel.CarouselStrategy carouselStrategy;
    private int currentEstimatedPosition;
    private int currentFillStartPosition;
    private com.google.android.material.carousel.KeylineState currentKeylineState;
    private final com.google.android.material.carousel.CarouselLayoutManager.DebugItemDecoration debugItemDecoration;
    private boolean isDebuggingEnabled;
    private com.google.android.material.carousel.KeylineStateList keylineStateList;
    private java.util.Map<java.lang.Integer, com.google.android.material.carousel.KeylineState> keylineStatePositionMap;
    private int lastItemCount;
    int maxScroll;
    int minScroll;
    private com.google.android.material.carousel.CarouselOrientationHelper orientationHelper;
    private final android.view.View.OnLayoutChangeListener recyclerViewSizeChangeListener;
    int scrollOffset;


    private static final class ChildCalculations {
        final float center;
        final android.view.View child;
        final float offsetCenter;
        final com.google.android.material.carousel.CarouselLayoutManager.KeylineRange range;

        ChildCalculations(android.view.View r1, float r2, float r3, com.google.android.material.carousel.CarouselLayoutManager.KeylineRange r4) {
                r0 = this;
                r0.<init>()
                r0.child = r1
                r0.center = r2
                r0.offsetCenter = r3
                r0.range = r4
                return
        }
    }

    private static class DebugItemDecoration extends androidx.recyclerview.widget.RecyclerView.ItemDecoration {
        private java.util.List<com.google.android.material.carousel.KeylineState.Keyline> keylines;
        private final android.graphics.Paint linePaint;

        DebugItemDecoration() {
                r2 = this;
                r2.<init>()
                android.graphics.Paint r0 = new android.graphics.Paint
                r0.<init>()
                r2.linePaint = r0
                java.util.ArrayList r1 = new java.util.ArrayList
                r1.<init>()
                java.util.List r1 = java.util.Collections.unmodifiableList(r1)
                r2.keylines = r1
                r1 = 1084227584(0x40a00000, float:5.0)
                r0.setStrokeWidth(r1)
                r1 = -65281(0xffffffffffff00ff, float:NaN)
                r0.setColor(r1)
                return
        }

        @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
        public void onDrawOver(android.graphics.Canvas r9, androidx.recyclerview.widget.RecyclerView r10, androidx.recyclerview.widget.RecyclerView.State r11) {
                r8 = this;
                super.onDrawOver(r9, r10, r11)
                android.graphics.Paint r11 = r8.linePaint
                android.content.res.Resources r0 = r10.getResources()
                int r1 = com.google.android.material.R.dimen.m3_carousel_debug_keyline_width
                float r0 = r0.getDimension(r1)
                r11.setStrokeWidth(r0)
                java.util.List<com.google.android.material.carousel.KeylineState$Keyline> r11 = r8.keylines
                java.util.Iterator r11 = r11.iterator()
            L18:
                boolean r0 = r11.hasNext()
                if (r0 == 0) goto L83
                java.lang.Object r0 = r11.next()
                com.google.android.material.carousel.KeylineState$Keyline r0 = (com.google.android.material.carousel.KeylineState.Keyline) r0
                android.graphics.Paint r1 = r8.linePaint
                r2 = -16776961(0xffffffffff0000ff, float:-1.7014636E38)
                float r3 = r0.mask
                r4 = -65281(0xffffffffffff00ff, float:NaN)
                int r2 = androidx.core.graphics.ColorUtils.blendARGB(r4, r2, r3)
                r1.setColor(r2)
                androidx.recyclerview.widget.RecyclerView$LayoutManager r1 = r10.getLayoutManager()
                com.google.android.material.carousel.CarouselLayoutManager r1 = (com.google.android.material.carousel.CarouselLayoutManager) r1
                boolean r1 = r1.isHorizontal()
                if (r1 == 0) goto L62
                float r3 = r0.locOffset
                androidx.recyclerview.widget.RecyclerView$LayoutManager r1 = r10.getLayoutManager()
                com.google.android.material.carousel.CarouselLayoutManager r1 = (com.google.android.material.carousel.CarouselLayoutManager) r1
                int r1 = com.google.android.material.carousel.CarouselLayoutManager.access$100(r1)
                float r4 = (float) r1
                float r5 = r0.locOffset
                androidx.recyclerview.widget.RecyclerView$LayoutManager r0 = r10.getLayoutManager()
                com.google.android.material.carousel.CarouselLayoutManager r0 = (com.google.android.material.carousel.CarouselLayoutManager) r0
                int r0 = com.google.android.material.carousel.CarouselLayoutManager.access$200(r0)
                float r6 = (float) r0
                android.graphics.Paint r7 = r8.linePaint
                r2 = r9
                r2.drawLine(r3, r4, r5, r6, r7)
                goto L18
            L62:
                androidx.recyclerview.widget.RecyclerView$LayoutManager r1 = r10.getLayoutManager()
                com.google.android.material.carousel.CarouselLayoutManager r1 = (com.google.android.material.carousel.CarouselLayoutManager) r1
                int r1 = com.google.android.material.carousel.CarouselLayoutManager.access$300(r1)
                float r3 = (float) r1
                float r4 = r0.locOffset
                androidx.recyclerview.widget.RecyclerView$LayoutManager r1 = r10.getLayoutManager()
                com.google.android.material.carousel.CarouselLayoutManager r1 = (com.google.android.material.carousel.CarouselLayoutManager) r1
                int r1 = com.google.android.material.carousel.CarouselLayoutManager.access$400(r1)
                float r5 = (float) r1
                float r6 = r0.locOffset
                android.graphics.Paint r7 = r8.linePaint
                r2 = r9
                r2.drawLine(r3, r4, r5, r6, r7)
                goto L18
            L83:
                return
        }

        void setKeylines(java.util.List<com.google.android.material.carousel.KeylineState.Keyline> r1) {
                r0 = this;
                java.util.List r1 = java.util.Collections.unmodifiableList(r1)
                r0.keylines = r1
                return
        }
    }

    private static class KeylineRange {
        final com.google.android.material.carousel.KeylineState.Keyline leftOrTop;
        final com.google.android.material.carousel.KeylineState.Keyline rightOrBottom;

        KeylineRange(com.google.android.material.carousel.KeylineState.Keyline r3, com.google.android.material.carousel.KeylineState.Keyline r4) {
                r2 = this;
                r2.<init>()
                float r0 = r3.loc
                float r1 = r4.loc
                int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
                if (r0 > 0) goto Ld
                r0 = 1
                goto Le
            Ld:
                r0 = 0
            Le:
                androidx.core.util.Preconditions.checkArgument(r0)
                r2.leftOrTop = r3
                r2.rightOrBottom = r4
                return
        }
    }

    private static class LayoutDirection {
        private static final int INVALID_LAYOUT = Integer.MIN_VALUE;
        private static final int LAYOUT_END = 1;
        private static final int LAYOUT_START = -1;

        private LayoutDirection() {
                r0 = this;
                r0.<init>()
                return
        }
    }

    public static /* synthetic */ void $r8$lambda$EVyYoVT11DpL60suE9bxns8qbCM(com.google.android.material.carousel.CarouselLayoutManager r0) {
            r0.refreshKeylineState()
            return
    }

    public CarouselLayoutManager() {
            r1 = this;
            com.google.android.material.carousel.MultiBrowseCarouselStrategy r0 = new com.google.android.material.carousel.MultiBrowseCarouselStrategy
            r0.<init>()
            r1.<init>(r0)
            return
    }

    public CarouselLayoutManager(android.content.Context r1, android.util.AttributeSet r2, int r3, int r4) {
            r0 = this;
            r0.<init>()
            r3 = 0
            r0.isDebuggingEnabled = r3
            com.google.android.material.carousel.CarouselLayoutManager$DebugItemDecoration r4 = new com.google.android.material.carousel.CarouselLayoutManager$DebugItemDecoration
            r4.<init>()
            r0.debugItemDecoration = r4
            r0.currentFillStartPosition = r3
            com.google.android.material.carousel.CarouselLayoutManager$$ExternalSyntheticLambda1 r4 = new com.google.android.material.carousel.CarouselLayoutManager$$ExternalSyntheticLambda1
            r4.<init>(r0)
            r0.recyclerViewSizeChangeListener = r4
            r4 = -1
            r0.currentEstimatedPosition = r4
            r0.carouselAlignment = r3
            com.google.android.material.carousel.MultiBrowseCarouselStrategy r3 = new com.google.android.material.carousel.MultiBrowseCarouselStrategy
            r3.<init>()
            r0.setCarouselStrategy(r3)
            r0.setCarouselAttributes(r1, r2)
            return
    }

    public CarouselLayoutManager(com.google.android.material.carousel.CarouselStrategy r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0)
            return
    }

    public CarouselLayoutManager(com.google.android.material.carousel.CarouselStrategy r3, int r4) {
            r2 = this;
            r2.<init>()
            r0 = 0
            r2.isDebuggingEnabled = r0
            com.google.android.material.carousel.CarouselLayoutManager$DebugItemDecoration r1 = new com.google.android.material.carousel.CarouselLayoutManager$DebugItemDecoration
            r1.<init>()
            r2.debugItemDecoration = r1
            r2.currentFillStartPosition = r0
            com.google.android.material.carousel.CarouselLayoutManager$$ExternalSyntheticLambda1 r1 = new com.google.android.material.carousel.CarouselLayoutManager$$ExternalSyntheticLambda1
            r1.<init>(r2)
            r2.recyclerViewSizeChangeListener = r1
            r1 = -1
            r2.currentEstimatedPosition = r1
            r2.carouselAlignment = r0
            r2.setCarouselStrategy(r3)
            r2.setOrientation(r4)
            return
    }

    static /* synthetic */ com.google.android.material.carousel.KeylineStateList access$000(com.google.android.material.carousel.CarouselLayoutManager r0) {
            com.google.android.material.carousel.KeylineStateList r0 = r0.keylineStateList
            return r0
    }

    static /* synthetic */ int access$100(com.google.android.material.carousel.CarouselLayoutManager r0) {
            int r0 = r0.getParentTop()
            return r0
    }

    static /* synthetic */ int access$200(com.google.android.material.carousel.CarouselLayoutManager r0) {
            int r0 = r0.getParentBottom()
            return r0
    }

    static /* synthetic */ int access$300(com.google.android.material.carousel.CarouselLayoutManager r0) {
            int r0 = r0.getParentLeft()
            return r0
    }

    static /* synthetic */ int access$400(com.google.android.material.carousel.CarouselLayoutManager r0) {
            int r0 = r0.getParentRight()
            return r0
    }

    private void addAndLayoutView(android.view.View r3, int r4, com.google.android.material.carousel.CarouselLayoutManager.ChildCalculations r5) {
            r2 = this;
            com.google.android.material.carousel.KeylineState r0 = r2.currentKeylineState
            float r0 = r0.getItemSize()
            r1 = 1073741824(0x40000000, float:2.0)
            float r0 = r0 / r1
            r2.addView(r3, r4)
            float r4 = r5.offsetCenter
            float r4 = r4 - r0
            int r4 = (int) r4
            float r1 = r5.offsetCenter
            float r1 = r1 + r0
            int r0 = (int) r1
            com.google.android.material.carousel.CarouselOrientationHelper r1 = r2.orientationHelper
            r1.layoutDecoratedWithMargins(r3, r4, r0)
            float r4 = r5.center
            com.google.android.material.carousel.CarouselLayoutManager$KeylineRange r5 = r5.range
            r2.updateChildMaskForLocation(r3, r4, r5)
            return
    }

    private float addEnd(float r2, float r3) {
            r1 = this;
            boolean r0 = r1.isLayoutRtl()
            if (r0 == 0) goto L8
            float r2 = r2 - r3
            goto L9
        L8:
            float r2 = r2 + r3
        L9:
            return r2
    }

    private float addStart(float r2, float r3) {
            r1 = this;
            boolean r0 = r1.isLayoutRtl()
            if (r0 == 0) goto L8
            float r2 = r2 + r3
            goto L9
        L8:
            float r2 = r2 - r3
        L9:
            return r2
    }

    private void addViewAtPosition(androidx.recyclerview.widget.RecyclerView.Recycler r2, int r3, int r4) {
            r1 = this;
            if (r3 < 0) goto L16
            int r0 = r1.getItemCount()
            if (r3 < r0) goto L9
            goto L16
        L9:
            float r0 = r1.calculateChildStartForFill(r3)
            com.google.android.material.carousel.CarouselLayoutManager$ChildCalculations r2 = r1.makeChildCalculations(r2, r0, r3)
            android.view.View r3 = r2.child
            r1.addAndLayoutView(r3, r4, r2)
        L16:
            return
    }

    private void addViewsEnd(androidx.recyclerview.widget.RecyclerView.Recycler r5, androidx.recyclerview.widget.RecyclerView.State r6, int r7) {
            r4 = this;
            float r0 = r4.calculateChildStartForFill(r7)
        L4:
            int r1 = r6.getItemCount()
            if (r7 >= r1) goto L37
            com.google.android.material.carousel.CarouselLayoutManager$ChildCalculations r1 = r4.makeChildCalculations(r5, r0, r7)
            float r2 = r1.offsetCenter
            com.google.android.material.carousel.CarouselLayoutManager$KeylineRange r3 = r1.range
            boolean r2 = r4.isLocOffsetOutOfFillBoundsEnd(r2, r3)
            if (r2 == 0) goto L19
            goto L37
        L19:
            com.google.android.material.carousel.KeylineState r2 = r4.currentKeylineState
            float r2 = r2.getItemSize()
            float r0 = r4.addEnd(r0, r2)
            float r2 = r1.offsetCenter
            com.google.android.material.carousel.CarouselLayoutManager$KeylineRange r3 = r1.range
            boolean r2 = r4.isLocOffsetOutOfFillBoundsStart(r2, r3)
            if (r2 == 0) goto L2e
            goto L34
        L2e:
            android.view.View r2 = r1.child
            r3 = -1
            r4.addAndLayoutView(r2, r3, r1)
        L34:
            int r7 = r7 + 1
            goto L4
        L37:
            return
    }

    private void addViewsStart(androidx.recyclerview.widget.RecyclerView.Recycler r5, int r6) {
            r4 = this;
            float r0 = r4.calculateChildStartForFill(r6)
        L4:
            if (r6 < 0) goto L33
            com.google.android.material.carousel.CarouselLayoutManager$ChildCalculations r1 = r4.makeChildCalculations(r5, r0, r6)
            float r2 = r1.offsetCenter
            com.google.android.material.carousel.CarouselLayoutManager$KeylineRange r3 = r1.range
            boolean r2 = r4.isLocOffsetOutOfFillBoundsStart(r2, r3)
            if (r2 == 0) goto L15
            goto L33
        L15:
            com.google.android.material.carousel.KeylineState r2 = r4.currentKeylineState
            float r2 = r2.getItemSize()
            float r0 = r4.addStart(r0, r2)
            float r2 = r1.offsetCenter
            com.google.android.material.carousel.CarouselLayoutManager$KeylineRange r3 = r1.range
            boolean r2 = r4.isLocOffsetOutOfFillBoundsEnd(r2, r3)
            if (r2 == 0) goto L2a
            goto L30
        L2a:
            android.view.View r2 = r1.child
            r3 = 0
            r4.addAndLayoutView(r2, r3, r1)
        L30:
            int r6 = r6 + (-1)
            goto L4
        L33:
            return
    }

    private float calculateChildOffsetCenterForLocation(android.view.View r5, float r6, com.google.android.material.carousel.CarouselLayoutManager.KeylineRange r7) {
            r4 = this;
            com.google.android.material.carousel.KeylineState$Keyline r0 = r7.leftOrTop
            float r0 = r0.locOffset
            com.google.android.material.carousel.KeylineState$Keyline r1 = r7.rightOrBottom
            float r1 = r1.locOffset
            com.google.android.material.carousel.KeylineState$Keyline r2 = r7.leftOrTop
            float r2 = r2.loc
            com.google.android.material.carousel.KeylineState$Keyline r3 = r7.rightOrBottom
            float r3 = r3.loc
            float r0 = com.google.android.material.animation.AnimationUtils.lerp(r0, r1, r2, r3, r6)
            com.google.android.material.carousel.KeylineState$Keyline r1 = r7.rightOrBottom
            com.google.android.material.carousel.KeylineState r2 = r4.currentKeylineState
            com.google.android.material.carousel.KeylineState$Keyline r2 = r2.getFirstKeyline()
            if (r1 == r2) goto L28
            com.google.android.material.carousel.KeylineState$Keyline r1 = r7.leftOrTop
            com.google.android.material.carousel.KeylineState r2 = r4.currentKeylineState
            com.google.android.material.carousel.KeylineState$Keyline r2 = r2.getLastKeyline()
            if (r1 != r2) goto L4a
        L28:
            android.view.ViewGroup$LayoutParams r5 = r5.getLayoutParams()
            androidx.recyclerview.widget.RecyclerView$LayoutParams r5 = (androidx.recyclerview.widget.RecyclerView.LayoutParams) r5
            com.google.android.material.carousel.CarouselOrientationHelper r1 = r4.orientationHelper
            float r5 = r1.getMaskMargins(r5)
            com.google.android.material.carousel.KeylineState r1 = r4.currentKeylineState
            float r1 = r1.getItemSize()
            float r5 = r5 / r1
            com.google.android.material.carousel.KeylineState$Keyline r1 = r7.rightOrBottom
            float r1 = r1.loc
            float r6 = r6 - r1
            com.google.android.material.carousel.KeylineState$Keyline r7 = r7.rightOrBottom
            float r7 = r7.mask
            r1 = 1065353216(0x3f800000, float:1.0)
            float r1 = r1 - r7
            float r1 = r1 + r5
            float r6 = r6 * r1
            float r0 = r0 + r6
        L4a:
            return r0
    }

    private float calculateChildStartForFill(int r3) {
            r2 = this;
            int r0 = r2.getParentStart()
            int r1 = r2.scrollOffset
            int r0 = r0 - r1
            float r0 = (float) r0
            com.google.android.material.carousel.KeylineState r1 = r2.currentKeylineState
            float r1 = r1.getItemSize()
            float r3 = (float) r3
            float r1 = r1 * r3
            float r3 = r2.addEnd(r0, r1)
            return r3
    }

    private int calculateEndScroll(androidx.recyclerview.widget.RecyclerView.State r5, com.google.android.material.carousel.KeylineStateList r6) {
            r4 = this;
            boolean r0 = r4.isLayoutRtl()
            if (r0 == 0) goto Lb
            com.google.android.material.carousel.KeylineState r6 = r6.getStartState()
            goto Lf
        Lb:
            com.google.android.material.carousel.KeylineState r6 = r6.getEndState()
        Lf:
            if (r0 == 0) goto L16
            com.google.android.material.carousel.KeylineState$Keyline r1 = r6.getFirstFocalKeyline()
            goto L1a
        L16:
            com.google.android.material.carousel.KeylineState$Keyline r1 = r6.getLastFocalKeyline()
        L1a:
            int r5 = r5.getItemCount()
            int r5 = r5 + (-1)
            float r5 = (float) r5
            float r6 = r6.getItemSize()
            float r5 = r5 * r6
            if (r0 == 0) goto L2b
            r6 = -1082130432(0xffffffffbf800000, float:-1.0)
            goto L2d
        L2b:
            r6 = 1065353216(0x3f800000, float:1.0)
        L2d:
            float r5 = r5 * r6
            if (r0 == 0) goto L34
            float r6 = r1.leftOrTopPaddingShift
            float r6 = -r6
            goto L36
        L34:
            float r6 = r1.rightOrBottomPaddingShift
        L36:
            float r2 = r1.loc
            int r3 = r4.getParentStart()
            float r3 = (float) r3
            float r2 = r2 - r3
            int r3 = r4.getParentEnd()
            float r3 = (float) r3
            float r1 = r1.loc
            float r3 = r3 - r1
            float r5 = r5 - r2
            float r5 = r5 + r3
            float r5 = r5 + r6
            int r5 = (int) r5
            r6 = 0
            if (r0 == 0) goto L52
            int r5 = java.lang.Math.min(r6, r5)
            goto L56
        L52:
            int r5 = java.lang.Math.max(r6, r5)
        L56:
            return r5
    }

    private static int calculateShouldScrollBy(int r1, int r2, int r3, int r4) {
            int r0 = r2 + r1
            if (r0 >= r3) goto L6
            int r3 = r3 - r2
            return r3
        L6:
            if (r0 <= r4) goto La
            int r4 = r4 - r2
            return r4
        La:
            return r1
    }

    private int calculateStartScroll(com.google.android.material.carousel.KeylineStateList r3) {
            r2 = this;
            boolean r0 = r2.isLayoutRtl()
            if (r0 == 0) goto Lb
            com.google.android.material.carousel.KeylineState r3 = r3.getEndState()
            goto Lf
        Lb:
            com.google.android.material.carousel.KeylineState r3 = r3.getStartState()
        Lf:
            if (r0 == 0) goto L16
            com.google.android.material.carousel.KeylineState$Keyline r0 = r3.getLastFocalKeyline()
            goto L1a
        L16:
            com.google.android.material.carousel.KeylineState$Keyline r0 = r3.getFirstFocalKeyline()
        L1a:
            float r0 = r0.loc
            float r3 = r3.getItemSize()
            r1 = 1073741824(0x40000000, float:2.0)
            float r3 = r3 / r1
            float r3 = r2.addStart(r0, r3)
            int r0 = r2.getParentStart()
            float r0 = (float) r0
            float r0 = r0 - r3
            int r3 = (int) r0
            return r3
    }

    private int convertFocusDirectionToLayoutDirection(int r6) {
            r5 = this;
            int r0 = r5.getOrientation()
            r1 = -1
            r2 = 1
            if (r6 == r2) goto L54
            r3 = 2
            if (r6 == r3) goto L53
            r3 = 17
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r6 == r3) goto L48
            r3 = 33
            if (r6 == r3) goto L43
            r3 = 66
            if (r6 == r3) goto L37
            r1 = 130(0x82, float:1.82E-43)
            if (r6 == r1) goto L32
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Unknown focus request:"
            r0.<init>(r1)
            java.lang.StringBuilder r6 = r0.append(r6)
            java.lang.String r6 = r6.toString()
            java.lang.String r0 = "CarouselLayoutManager"
            android.util.Log.d(r0, r6)
            return r4
        L32:
            if (r0 != r2) goto L35
            goto L36
        L35:
            r2 = r4
        L36:
            return r2
        L37:
            if (r0 != 0) goto L42
            boolean r6 = r5.isLayoutRtl()
            if (r6 == 0) goto L40
            goto L41
        L40:
            r1 = r2
        L41:
            return r1
        L42:
            return r4
        L43:
            if (r0 != r2) goto L46
            goto L47
        L46:
            r1 = r4
        L47:
            return r1
        L48:
            if (r0 != 0) goto L52
            boolean r6 = r5.isLayoutRtl()
            if (r6 == 0) goto L51
            r1 = r2
        L51:
            return r1
        L52:
            return r4
        L53:
            return r2
        L54:
            return r1
    }

    private void fill(androidx.recyclerview.widget.RecyclerView.Recycler r3, androidx.recyclerview.widget.RecyclerView.State r4) {
            r2 = this;
            r2.removeAndRecycleOutOfBoundsViews(r3)
            int r0 = r2.getChildCount()
            if (r0 != 0) goto L16
            int r0 = r2.currentFillStartPosition
            int r0 = r0 + (-1)
            r2.addViewsStart(r3, r0)
            int r0 = r2.currentFillStartPosition
            r2.addViewsEnd(r3, r4, r0)
            goto L37
        L16:
            r0 = 0
            android.view.View r0 = r2.getChildAt(r0)
            int r0 = r2.getPosition(r0)
            int r1 = r2.getChildCount()
            int r1 = r1 + (-1)
            android.view.View r1 = r2.getChildAt(r1)
            int r1 = r2.getPosition(r1)
            int r0 = r0 + (-1)
            r2.addViewsStart(r3, r0)
            int r1 = r1 + 1
            r2.addViewsEnd(r3, r4, r1)
        L37:
            r2.validateChildOrderIfDebugging()
            return
    }

    private android.view.View getChildClosestToEnd() {
            r1 = this;
            boolean r0 = r1.isLayoutRtl()
            if (r0 == 0) goto L8
            r0 = 0
            goto Le
        L8:
            int r0 = r1.getChildCount()
            int r0 = r0 + (-1)
        Le:
            android.view.View r0 = r1.getChildAt(r0)
            return r0
    }

    private android.view.View getChildClosestToStart() {
            r1 = this;
            boolean r0 = r1.isLayoutRtl()
            if (r0 == 0) goto Ld
            int r0 = r1.getChildCount()
            int r0 = r0 + (-1)
            goto Le
        Ld:
            r0 = 0
        Le:
            android.view.View r0 = r1.getChildAt(r0)
            return r0
    }

    private int getContainerSize() {
            r1 = this;
            boolean r0 = r1.isHorizontal()
            if (r0 == 0) goto Lb
            int r0 = r1.getContainerWidth()
            return r0
        Lb:
            int r0 = r1.getContainerHeight()
            return r0
    }

    private float getDecoratedCenterWithMargins(android.view.View r2) {
            r1 = this;
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            super.getDecoratedBoundsWithMargins(r2, r0)
            boolean r2 = r1.isHorizontal()
            if (r2 == 0) goto L14
            int r2 = r0.centerX()
        L12:
            float r2 = (float) r2
            return r2
        L14:
            int r2 = r0.centerY()
            goto L12
    }

    private int getItemMargins() {
            r2 = this;
            int r0 = r2.getChildCount()
            r1 = 0
            if (r0 <= 0) goto L22
            android.view.View r0 = r2.getChildAt(r1)
            android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()
            androidx.recyclerview.widget.RecyclerView$LayoutParams r0 = (androidx.recyclerview.widget.RecyclerView.LayoutParams) r0
            com.google.android.material.carousel.CarouselOrientationHelper r1 = r2.orientationHelper
            int r1 = r1.orientation
            if (r1 != 0) goto L1d
            int r1 = r0.leftMargin
            int r0 = r0.rightMargin
        L1b:
            int r1 = r1 + r0
            return r1
        L1d:
            int r1 = r0.topMargin
            int r0 = r0.bottomMargin
            goto L1b
        L22:
            return r1
    }

    private com.google.android.material.carousel.KeylineState getKeylineStateForPosition(int r4) {
            r3 = this;
            java.util.Map<java.lang.Integer, com.google.android.material.carousel.KeylineState> r0 = r3.keylineStatePositionMap
            if (r0 == 0) goto L20
            int r1 = r3.getItemCount()
            int r1 = r1 + (-1)
            r2 = 0
            int r1 = java.lang.Math.max(r2, r1)
            int r4 = androidx.core.math.MathUtils.clamp(r4, r2, r1)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            java.lang.Object r4 = r0.get(r4)
            com.google.android.material.carousel.KeylineState r4 = (com.google.android.material.carousel.KeylineState) r4
            if (r4 == 0) goto L20
            return r4
        L20:
            com.google.android.material.carousel.KeylineStateList r4 = r3.keylineStateList
            com.google.android.material.carousel.KeylineState r4 = r4.getDefaultState()
            return r4
    }

    private int getLeftOrTopPaddingForKeylineShift() {
            r2 = this;
            boolean r0 = r2.getClipToPadding()
            if (r0 != 0) goto L20
            com.google.android.material.carousel.CarouselStrategy r0 = r2.carouselStrategy
            boolean r0 = r0.isContained()
            if (r0 != 0) goto Lf
            goto L20
        Lf:
            int r0 = r2.getOrientation()
            r1 = 1
            if (r0 != r1) goto L1b
            int r0 = r2.getPaddingTop()
            return r0
        L1b:
            int r0 = r2.getPaddingLeft()
            return r0
        L20:
            r0 = 0
            return r0
    }

    private float getMaskedItemSizeForLocOffset(float r4, com.google.android.material.carousel.CarouselLayoutManager.KeylineRange r5) {
            r3 = this;
            com.google.android.material.carousel.KeylineState$Keyline r0 = r5.leftOrTop
            float r0 = r0.maskedItemSize
            com.google.android.material.carousel.KeylineState$Keyline r1 = r5.rightOrBottom
            float r1 = r1.maskedItemSize
            com.google.android.material.carousel.KeylineState$Keyline r2 = r5.leftOrTop
            float r2 = r2.locOffset
            com.google.android.material.carousel.KeylineState$Keyline r5 = r5.rightOrBottom
            float r5 = r5.locOffset
            float r4 = com.google.android.material.animation.AnimationUtils.lerp(r0, r1, r2, r5, r4)
            return r4
    }

    private int getParentBottom() {
            r1 = this;
            com.google.android.material.carousel.CarouselOrientationHelper r0 = r1.orientationHelper
            int r0 = r0.getParentBottom()
            return r0
    }

    private int getParentEnd() {
            r1 = this;
            com.google.android.material.carousel.CarouselOrientationHelper r0 = r1.orientationHelper
            int r0 = r0.getParentEnd()
            return r0
    }

    private int getParentLeft() {
            r1 = this;
            com.google.android.material.carousel.CarouselOrientationHelper r0 = r1.orientationHelper
            int r0 = r0.getParentLeft()
            return r0
    }

    private int getParentRight() {
            r1 = this;
            com.google.android.material.carousel.CarouselOrientationHelper r0 = r1.orientationHelper
            int r0 = r0.getParentRight()
            return r0
    }

    private int getParentStart() {
            r1 = this;
            com.google.android.material.carousel.CarouselOrientationHelper r0 = r1.orientationHelper
            int r0 = r0.getParentStart()
            return r0
    }

    private int getParentTop() {
            r1 = this;
            com.google.android.material.carousel.CarouselOrientationHelper r0 = r1.orientationHelper
            int r0 = r0.getParentTop()
            return r0
    }

    private int getRightOrBottomPaddingForKeylineShift() {
            r2 = this;
            boolean r0 = r2.getClipToPadding()
            if (r0 != 0) goto L20
            com.google.android.material.carousel.CarouselStrategy r0 = r2.carouselStrategy
            boolean r0 = r0.isContained()
            if (r0 != 0) goto Lf
            goto L20
        Lf:
            int r0 = r2.getOrientation()
            r1 = 1
            if (r0 != r1) goto L1b
            int r0 = r2.getPaddingBottom()
            return r0
        L1b:
            int r0 = r2.getPaddingRight()
            return r0
        L20:
            r0 = 0
            return r0
    }

    private int getScrollOffsetForPosition(int r4, com.google.android.material.carousel.KeylineState r5) {
            r3 = this;
            boolean r0 = r3.isLayoutRtl()
            r1 = 1073741824(0x40000000, float:2.0)
            if (r0 == 0) goto L23
            int r0 = r3.getContainerSize()
            float r0 = (float) r0
            com.google.android.material.carousel.KeylineState$Keyline r2 = r5.getLastFocalKeyline()
            float r2 = r2.loc
            float r0 = r0 - r2
            float r4 = (float) r4
            float r2 = r5.getItemSize()
            float r4 = r4 * r2
            float r0 = r0 - r4
            float r4 = r5.getItemSize()
            float r4 = r4 / r1
            float r0 = r0 - r4
            int r4 = (int) r0
            return r4
        L23:
            float r4 = (float) r4
            float r0 = r5.getItemSize()
            float r4 = r4 * r0
            com.google.android.material.carousel.KeylineState$Keyline r0 = r5.getFirstFocalKeyline()
            float r0 = r0.loc
            float r4 = r4 - r0
            float r5 = r5.getItemSize()
            float r5 = r5 / r1
            float r4 = r4 + r5
            int r4 = (int) r4
            return r4
    }

    private int getSmallestScrollOffsetToFocalKeyline(int r7, com.google.android.material.carousel.KeylineState r8) {
            r6 = this;
            java.util.List r0 = r8.getFocalKeylines()
            java.util.Iterator r0 = r0.iterator()
            r1 = 2147483647(0x7fffffff, float:NaN)
        Lb:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L49
            java.lang.Object r2 = r0.next()
            com.google.android.material.carousel.KeylineState$Keyline r2 = (com.google.android.material.carousel.KeylineState.Keyline) r2
            float r3 = (float) r7
            float r4 = r8.getItemSize()
            float r3 = r3 * r4
            float r4 = r8.getItemSize()
            r5 = 1073741824(0x40000000, float:2.0)
            float r4 = r4 / r5
            float r3 = r3 + r4
            boolean r4 = r6.isLayoutRtl()
            if (r4 == 0) goto L36
            int r4 = r6.getContainerSize()
            float r4 = (float) r4
            float r2 = r2.loc
            float r4 = r4 - r2
            float r4 = r4 - r3
            int r2 = (int) r4
            goto L3a
        L36:
            float r2 = r2.loc
            float r3 = r3 - r2
            int r2 = (int) r3
        L3a:
            int r3 = r6.scrollOffset
            int r2 = r2 - r3
            int r3 = java.lang.Math.abs(r1)
            int r4 = java.lang.Math.abs(r2)
            if (r3 <= r4) goto Lb
            r1 = r2
            goto Lb
        L49:
            return r1
    }

    private static com.google.android.material.carousel.CarouselLayoutManager.KeylineRange getSurroundingKeylineRange(java.util.List<com.google.android.material.carousel.KeylineState.Keyline> r13, float r14, boolean r15) {
            r0 = -1
            r1 = 2139095039(0x7f7fffff, float:3.4028235E38)
            r2 = -8388609(0xffffffffff7fffff, float:-3.4028235E38)
            r3 = 0
            r6 = r0
            r7 = r6
            r8 = r7
            r9 = r8
            r4 = r2
            r5 = r3
            r2 = r1
            r3 = r2
        L10:
            int r10 = r13.size()
            if (r5 >= r10) goto L4c
            java.lang.Object r10 = r13.get(r5)
            com.google.android.material.carousel.KeylineState$Keyline r10 = (com.google.android.material.carousel.KeylineState.Keyline) r10
            if (r15 == 0) goto L21
            float r10 = r10.locOffset
            goto L23
        L21:
            float r10 = r10.loc
        L23:
            float r11 = r10 - r14
            float r11 = java.lang.Math.abs(r11)
            int r12 = (r10 > r14 ? 1 : (r10 == r14 ? 0 : -1))
            if (r12 > 0) goto L33
            int r12 = (r11 > r1 ? 1 : (r11 == r1 ? 0 : -1))
            if (r12 > 0) goto L33
            r6 = r5
            r1 = r11
        L33:
            int r12 = (r10 > r14 ? 1 : (r10 == r14 ? 0 : -1))
            if (r12 <= 0) goto L3d
            int r12 = (r11 > r2 ? 1 : (r11 == r2 ? 0 : -1))
            if (r12 > 0) goto L3d
            r8 = r5
            r2 = r11
        L3d:
            int r11 = (r10 > r3 ? 1 : (r10 == r3 ? 0 : -1))
            if (r11 > 0) goto L43
            r7 = r5
            r3 = r10
        L43:
            int r11 = (r10 > r4 ? 1 : (r10 == r4 ? 0 : -1))
            if (r11 <= 0) goto L49
            r9 = r5
            r4 = r10
        L49:
            int r5 = r5 + 1
            goto L10
        L4c:
            if (r6 != r0) goto L4f
            r6 = r7
        L4f:
            if (r8 != r0) goto L52
            r8 = r9
        L52:
            com.google.android.material.carousel.CarouselLayoutManager$KeylineRange r14 = new com.google.android.material.carousel.CarouselLayoutManager$KeylineRange
            java.lang.Object r15 = r13.get(r6)
            com.google.android.material.carousel.KeylineState$Keyline r15 = (com.google.android.material.carousel.KeylineState.Keyline) r15
            java.lang.Object r13 = r13.get(r8)
            com.google.android.material.carousel.KeylineState$Keyline r13 = (com.google.android.material.carousel.KeylineState.Keyline) r13
            r14.<init>(r15, r13)
            return r14
    }

    private boolean isLocOffsetOutOfFillBoundsEnd(float r3, com.google.android.material.carousel.CarouselLayoutManager.KeylineRange r4) {
            r2 = this;
            float r4 = r2.getMaskedItemSizeForLocOffset(r3, r4)
            r0 = 1073741824(0x40000000, float:2.0)
            float r4 = r4 / r0
            float r3 = r2.addStart(r3, r4)
            boolean r4 = r2.isLayoutRtl()
            r0 = 1
            r1 = 0
            if (r4 == 0) goto L19
            r4 = 0
            int r3 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r3 >= 0) goto L23
            goto L24
        L19:
            int r4 = r2.getContainerSize()
            float r4 = (float) r4
            int r3 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r3 <= 0) goto L23
            goto L24
        L23:
            r0 = r1
        L24:
            return r0
    }

    private boolean isLocOffsetOutOfFillBoundsStart(float r3, com.google.android.material.carousel.CarouselLayoutManager.KeylineRange r4) {
            r2 = this;
            float r4 = r2.getMaskedItemSizeForLocOffset(r3, r4)
            r0 = 1073741824(0x40000000, float:2.0)
            float r4 = r4 / r0
            float r3 = r2.addEnd(r3, r4)
            boolean r4 = r2.isLayoutRtl()
            r0 = 1
            r1 = 0
            if (r4 == 0) goto L1d
            int r4 = r2.getContainerSize()
            float r4 = (float) r4
            int r3 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r3 <= 0) goto L23
            goto L24
        L1d:
            r4 = 0
            int r3 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r3 >= 0) goto L23
            goto L24
        L23:
            r0 = r1
        L24:
            return r0
    }

    private void logChildrenIfDebugging() {
            r6 = this;
            boolean r0 = r6.isDebuggingEnabled
            if (r0 != 0) goto L5
            return
        L5:
            r0 = 3
            java.lang.String r1 = "CarouselLayoutManager"
            boolean r0 = android.util.Log.isLoggable(r1, r0)
            if (r0 == 0) goto L54
            java.lang.String r0 = "internal representation of views on the screen"
            android.util.Log.d(r1, r0)
            r0 = 0
        L14:
            int r2 = r6.getChildCount()
            if (r0 >= r2) goto L4f
            android.view.View r2 = r6.getChildAt(r0)
            float r3 = r6.getDecoratedCenterWithMargins(r2)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "item position "
            r4.<init>(r5)
            int r2 = r6.getPosition(r2)
            java.lang.StringBuilder r2 = r4.append(r2)
            java.lang.String r4 = ", center:"
            java.lang.StringBuilder r2 = r2.append(r4)
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r3 = ", child index:"
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.StringBuilder r2 = r2.append(r0)
            java.lang.String r2 = r2.toString()
            android.util.Log.d(r1, r2)
            int r0 = r0 + 1
            goto L14
        L4f:
            java.lang.String r0 = "=============="
            android.util.Log.d(r1, r0)
        L54:
            return
    }

    private com.google.android.material.carousel.CarouselLayoutManager.ChildCalculations makeChildCalculations(androidx.recyclerview.widget.RecyclerView.Recycler r3, float r4, int r5) {
            r2 = this;
            android.view.View r3 = r3.getViewForPosition(r5)
            r5 = 0
            r2.measureChildWithMargins(r3, r5, r5)
            com.google.android.material.carousel.KeylineState r0 = r2.currentKeylineState
            float r0 = r0.getItemSize()
            r1 = 1073741824(0x40000000, float:2.0)
            float r0 = r0 / r1
            float r4 = r2.addEnd(r4, r0)
            com.google.android.material.carousel.KeylineState r0 = r2.currentKeylineState
            java.util.List r0 = r0.getKeylines()
            com.google.android.material.carousel.CarouselLayoutManager$KeylineRange r5 = getSurroundingKeylineRange(r0, r4, r5)
            float r0 = r2.calculateChildOffsetCenterForLocation(r3, r4, r5)
            com.google.android.material.carousel.CarouselLayoutManager$ChildCalculations r1 = new com.google.android.material.carousel.CarouselLayoutManager$ChildCalculations
            r1.<init>(r3, r4, r0, r5)
            return r1
    }

    private float offsetChild(android.view.View r3, float r4, float r5, android.graphics.Rect r6) {
            r2 = this;
            float r4 = r2.addEnd(r4, r5)
            com.google.android.material.carousel.KeylineState r0 = r2.currentKeylineState
            java.util.List r0 = r0.getKeylines()
            r1 = 0
            com.google.android.material.carousel.CarouselLayoutManager$KeylineRange r0 = getSurroundingKeylineRange(r0, r4, r1)
            float r1 = r2.calculateChildOffsetCenterForLocation(r3, r4, r0)
            super.getDecoratedBoundsWithMargins(r3, r6)
            r2.updateChildMaskForLocation(r3, r4, r0)
            com.google.android.material.carousel.CarouselOrientationHelper r4 = r2.orientationHelper
            r4.offsetChild(r3, r6, r5, r1)
            return r1
    }

    private void recalculateKeylineStateList(androidx.recyclerview.widget.RecyclerView.Recycler r4) {
            r3 = this;
            r0 = 0
            android.view.View r4 = r4.getViewForPosition(r0)
            r3.measureChildWithMargins(r4, r0, r0)
            com.google.android.material.carousel.CarouselStrategy r0 = r3.carouselStrategy
            com.google.android.material.carousel.KeylineState r4 = r0.onFirstChildMeasuredWithMargins(r3, r4)
            boolean r0 = r3.isLayoutRtl()
            if (r0 == 0) goto L1d
            int r0 = r3.getContainerSize()
            float r0 = (float) r0
            com.google.android.material.carousel.KeylineState r4 = com.google.android.material.carousel.KeylineState.reverse(r4, r0)
        L1d:
            int r0 = r3.getItemMargins()
            float r0 = (float) r0
            int r1 = r3.getLeftOrTopPaddingForKeylineShift()
            float r1 = (float) r1
            int r2 = r3.getRightOrBottomPaddingForKeylineShift()
            float r2 = (float) r2
            com.google.android.material.carousel.KeylineStateList r4 = com.google.android.material.carousel.KeylineStateList.from(r3, r4, r0, r1, r2)
            r3.keylineStateList = r4
            return
    }

    private void refreshKeylineState() {
            r1 = this;
            r0 = 0
            r1.keylineStateList = r0
            r1.requestLayout()
            return
    }

    private void removeAndRecycleOutOfBoundsViews(androidx.recyclerview.widget.RecyclerView.Recycler r5) {
            r4 = this;
        L0:
            int r0 = r4.getChildCount()
            r1 = 1
            if (r0 <= 0) goto L24
            r0 = 0
            android.view.View r0 = r4.getChildAt(r0)
            float r2 = r4.getDecoratedCenterWithMargins(r0)
            com.google.android.material.carousel.KeylineState r3 = r4.currentKeylineState
            java.util.List r3 = r3.getKeylines()
            com.google.android.material.carousel.CarouselLayoutManager$KeylineRange r3 = getSurroundingKeylineRange(r3, r2, r1)
            boolean r2 = r4.isLocOffsetOutOfFillBoundsStart(r2, r3)
            if (r2 == 0) goto L24
            r4.removeAndRecycleView(r0, r5)
            goto L0
        L24:
            int r0 = r4.getChildCount()
            int r0 = r0 - r1
            if (r0 < 0) goto L4c
            int r0 = r4.getChildCount()
            int r0 = r0 - r1
            android.view.View r0 = r4.getChildAt(r0)
            float r2 = r4.getDecoratedCenterWithMargins(r0)
            com.google.android.material.carousel.KeylineState r3 = r4.currentKeylineState
            java.util.List r3 = r3.getKeylines()
            com.google.android.material.carousel.CarouselLayoutManager$KeylineRange r3 = getSurroundingKeylineRange(r3, r2, r1)
            boolean r2 = r4.isLocOffsetOutOfFillBoundsEnd(r2, r3)
            if (r2 == 0) goto L4c
            r4.removeAndRecycleView(r0, r5)
            goto L24
        L4c:
            return
    }

    private int scrollBy(int r10, androidx.recyclerview.widget.RecyclerView.Recycler r11, androidx.recyclerview.widget.RecyclerView.State r12) {
            r9 = this;
            int r0 = r9.getChildCount()
            r1 = 0
            if (r0 == 0) goto L8c
            if (r10 != 0) goto Lb
            goto L8c
        Lb:
            com.google.android.material.carousel.KeylineStateList r0 = r9.keylineStateList
            if (r0 != 0) goto L12
            r9.recalculateKeylineStateList(r11)
        L12:
            int r0 = r9.scrollOffset
            int r2 = r9.minScroll
            int r3 = r9.maxScroll
            int r10 = calculateShouldScrollBy(r10, r0, r2, r3)
            int r0 = r9.scrollOffset
            int r0 = r0 + r10
            r9.scrollOffset = r0
            com.google.android.material.carousel.KeylineStateList r0 = r9.keylineStateList
            r9.updateCurrentKeylineStateForScrollOffset(r0)
            com.google.android.material.carousel.KeylineState r0 = r9.currentKeylineState
            float r0 = r0.getItemSize()
            r2 = 1073741824(0x40000000, float:2.0)
            float r0 = r0 / r2
            android.view.View r2 = r9.getChildAt(r1)
            int r2 = r9.getPosition(r2)
            float r2 = r9.calculateChildStartForFill(r2)
            android.graphics.Rect r3 = new android.graphics.Rect
            r3.<init>()
            boolean r4 = r9.isLayoutRtl()
            if (r4 == 0) goto L4f
            com.google.android.material.carousel.KeylineState r4 = r9.currentKeylineState
            com.google.android.material.carousel.KeylineState$Keyline r4 = r4.getLastFocalKeyline()
            float r4 = r4.locOffset
            goto L57
        L4f:
            com.google.android.material.carousel.KeylineState r4 = r9.currentKeylineState
            com.google.android.material.carousel.KeylineState$Keyline r4 = r4.getFirstFocalKeyline()
            float r4 = r4.locOffset
        L57:
            r5 = 2139095039(0x7f7fffff, float:3.4028235E38)
        L5a:
            int r6 = r9.getChildCount()
            if (r1 >= r6) goto L88
            android.view.View r6 = r9.getChildAt(r1)
            float r7 = r9.offsetChild(r6, r2, r0, r3)
            float r7 = r4 - r7
            float r7 = java.lang.Math.abs(r7)
            if (r6 == 0) goto L7b
            int r8 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r8 >= 0) goto L7b
            int r5 = r9.getPosition(r6)
            r9.currentEstimatedPosition = r5
            r5 = r7
        L7b:
            com.google.android.material.carousel.KeylineState r6 = r9.currentKeylineState
            float r6 = r6.getItemSize()
            float r2 = r9.addEnd(r2, r6)
            int r1 = r1 + 1
            goto L5a
        L88:
            r9.fill(r11, r12)
            return r10
        L8c:
            return r1
    }

    private void scrollBy(androidx.recyclerview.widget.RecyclerView r3, int r4) {
            r2 = this;
            boolean r0 = r2.isHorizontal()
            r1 = 0
            if (r0 == 0) goto Lb
            r3.scrollBy(r4, r1)
            goto Le
        Lb:
            r3.scrollBy(r1, r4)
        Le:
            return
    }

    private void setCarouselAttributes(android.content.Context r2, android.util.AttributeSet r3) {
            r1 = this;
            if (r3 == 0) goto L1e
            int[] r0 = com.google.android.material.R.styleable.Carousel
            android.content.res.TypedArray r2 = r2.obtainStyledAttributes(r3, r0)
            int r3 = com.google.android.material.R.styleable.Carousel_carousel_alignment
            r0 = 0
            int r3 = r2.getInt(r3, r0)
            r1.setCarouselAlignment(r3)
            int r3 = com.google.android.material.R.styleable.RecyclerView_android_orientation
            int r3 = r2.getInt(r3, r0)
            r1.setOrientation(r3)
            r2.recycle()
        L1e:
            return
    }

    private void updateChildMaskForLocation(android.view.View r9, float r10, com.google.android.material.carousel.CarouselLayoutManager.KeylineRange r11) {
            r8 = this;
            boolean r0 = r9 instanceof com.google.android.material.carousel.Maskable
            if (r0 != 0) goto L5
            return
        L5:
            com.google.android.material.carousel.KeylineState$Keyline r0 = r11.leftOrTop
            float r0 = r0.mask
            com.google.android.material.carousel.KeylineState$Keyline r1 = r11.rightOrBottom
            float r1 = r1.mask
            com.google.android.material.carousel.KeylineState$Keyline r2 = r11.leftOrTop
            float r2 = r2.loc
            com.google.android.material.carousel.KeylineState$Keyline r3 = r11.rightOrBottom
            float r3 = r3.loc
            float r0 = com.google.android.material.animation.AnimationUtils.lerp(r0, r1, r2, r3, r10)
            int r1 = r9.getHeight()
            float r1 = (float) r1
            int r2 = r9.getWidth()
            float r2 = (float) r2
            r3 = 1073741824(0x40000000, float:2.0)
            float r4 = r2 / r3
            r5 = 0
            r6 = 1065353216(0x3f800000, float:1.0)
            float r4 = com.google.android.material.animation.AnimationUtils.lerp(r5, r4, r5, r6, r0)
            float r7 = r1 / r3
            float r0 = com.google.android.material.animation.AnimationUtils.lerp(r5, r7, r5, r6, r0)
            com.google.android.material.carousel.CarouselOrientationHelper r5 = r8.orientationHelper
            android.graphics.RectF r0 = r5.getMaskRect(r1, r2, r0, r4)
            float r10 = r8.calculateChildOffsetCenterForLocation(r9, r10, r11)
            float r11 = r0.height()
            float r11 = r11 / r3
            float r11 = r10 - r11
            float r1 = r0.height()
            float r1 = r1 / r3
            float r1 = r1 + r10
            float r2 = r0.width()
            float r2 = r2 / r3
            float r2 = r10 - r2
            float r4 = r0.width()
            float r4 = r4 / r3
            float r10 = r10 + r4
            android.graphics.RectF r3 = new android.graphics.RectF
            r3.<init>(r2, r11, r10, r1)
            android.graphics.RectF r10 = new android.graphics.RectF
            int r11 = r8.getParentLeft()
            float r11 = (float) r11
            int r1 = r8.getParentTop()
            float r1 = (float) r1
            int r2 = r8.getParentRight()
            float r2 = (float) r2
            int r4 = r8.getParentBottom()
            float r4 = (float) r4
            r10.<init>(r11, r1, r2, r4)
            com.google.android.material.carousel.CarouselStrategy r11 = r8.carouselStrategy
            boolean r11 = r11.isContained()
            if (r11 == 0) goto L83
            com.google.android.material.carousel.CarouselOrientationHelper r11 = r8.orientationHelper
            r11.containMaskWithinBounds(r0, r3, r10)
        L83:
            com.google.android.material.carousel.CarouselOrientationHelper r11 = r8.orientationHelper
            r11.moveMaskOnEdgeOutsideBounds(r0, r3, r10)
            com.google.android.material.carousel.Maskable r9 = (com.google.android.material.carousel.Maskable) r9
            r9.setMaskRectF(r0)
            return
    }

    private void updateCurrentKeylineStateForScrollOffset(com.google.android.material.carousel.KeylineStateList r4) {
            r3 = this;
            int r0 = r3.maxScroll
            int r1 = r3.minScroll
            if (r0 > r1) goto L18
            boolean r0 = r3.isLayoutRtl()
            if (r0 == 0) goto L11
            com.google.android.material.carousel.KeylineState r4 = r4.getEndState()
            goto L15
        L11:
            com.google.android.material.carousel.KeylineState r4 = r4.getStartState()
        L15:
            r3.currentKeylineState = r4
            goto L23
        L18:
            int r2 = r3.scrollOffset
            float r2 = (float) r2
            float r1 = (float) r1
            float r0 = (float) r0
            com.google.android.material.carousel.KeylineState r4 = r4.getShiftedState(r2, r1, r0)
            r3.currentKeylineState = r4
        L23:
            com.google.android.material.carousel.CarouselLayoutManager$DebugItemDecoration r4 = r3.debugItemDecoration
            com.google.android.material.carousel.KeylineState r0 = r3.currentKeylineState
            java.util.List r0 = r0.getKeylines()
            r4.setKeylines(r0)
            return
    }

    private void updateItemCount() {
            r3 = this;
            int r0 = r3.getItemCount()
            int r1 = r3.lastItemCount
            if (r0 == r1) goto L1a
            com.google.android.material.carousel.KeylineStateList r2 = r3.keylineStateList
            if (r2 != 0) goto Ld
            goto L1a
        Ld:
            com.google.android.material.carousel.CarouselStrategy r2 = r3.carouselStrategy
            boolean r1 = r2.shouldRefreshKeylineState(r3, r1)
            if (r1 == 0) goto L18
            r3.refreshKeylineState()
        L18:
            r3.lastItemCount = r0
        L1a:
            return
    }

    private void validateChildOrderIfDebugging() {
            r7 = this;
            boolean r0 = r7.isDebuggingEnabled
            if (r0 == 0) goto L64
            int r0 = r7.getChildCount()
            r1 = 1
            if (r0 >= r1) goto Lc
            goto L64
        Lc:
            r0 = 0
        Ld:
            int r2 = r7.getChildCount()
            int r2 = r2 - r1
            if (r0 >= r2) goto L64
            android.view.View r2 = r7.getChildAt(r0)
            int r2 = r7.getPosition(r2)
            int r3 = r0 + 1
            android.view.View r4 = r7.getChildAt(r3)
            int r4 = r7.getPosition(r4)
            if (r2 > r4) goto L2a
            r0 = r3
            goto Ld
        L2a:
            r7.logChildrenIfDebugging()
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "Detected invalid child order. Child at index ["
            r5.<init>(r6)
            java.lang.StringBuilder r0 = r5.append(r0)
            java.lang.String r5 = "] had adapter position ["
            java.lang.StringBuilder r0 = r0.append(r5)
            java.lang.StringBuilder r0 = r0.append(r2)
            java.lang.String r2 = "] and child at index ["
            java.lang.StringBuilder r0 = r0.append(r2)
            java.lang.StringBuilder r0 = r0.append(r3)
            java.lang.StringBuilder r0 = r0.append(r5)
            java.lang.StringBuilder r0 = r0.append(r4)
            java.lang.String r2 = "]."
            java.lang.StringBuilder r0 = r0.append(r2)
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            throw r1
        L64:
            return
    }

    int calculateScrollDeltaToMakePositionVisible(int r2) {
            r1 = this;
            com.google.android.material.carousel.KeylineState r0 = r1.getKeylineStateForPosition(r2)
            int r2 = r1.getScrollOffsetForPosition(r2, r0)
            float r2 = (float) r2
            int r0 = r1.scrollOffset
            float r0 = (float) r0
            float r0 = r0 - r2
            int r2 = (int) r0
            return r2
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public boolean canScrollHorizontally() {
            r1 = this;
            boolean r0 = r1.isHorizontal()
            return r0
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public boolean canScrollVertically() {
            r1 = this;
            boolean r0 = r1.isHorizontal()
            r0 = r0 ^ 1
            return r0
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int computeHorizontalScrollExtent(androidx.recyclerview.widget.RecyclerView.State r3) {
            r2 = this;
            int r0 = r2.getChildCount()
            if (r0 == 0) goto L2a
            com.google.android.material.carousel.KeylineStateList r0 = r2.keylineStateList
            if (r0 == 0) goto L2a
            int r0 = r2.getItemCount()
            r1 = 1
            if (r0 > r1) goto L12
            goto L2a
        L12:
            com.google.android.material.carousel.KeylineStateList r0 = r2.keylineStateList
            com.google.android.material.carousel.KeylineState r0 = r0.getDefaultState()
            float r0 = r0.getItemSize()
            int r3 = r2.computeHorizontalScrollRange(r3)
            float r3 = (float) r3
            float r0 = r0 / r3
            int r3 = r2.getWidth()
            float r3 = (float) r3
            float r3 = r3 * r0
            int r3 = (int) r3
            return r3
        L2a:
            r3 = 0
            return r3
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int computeHorizontalScrollOffset(androidx.recyclerview.widget.RecyclerView.State r1) {
            r0 = this;
            int r1 = r0.scrollOffset
            return r1
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int computeHorizontalScrollRange(androidx.recyclerview.widget.RecyclerView.State r2) {
            r1 = this;
            int r2 = r1.maxScroll
            int r0 = r1.minScroll
            int r2 = r2 - r0
            return r2
    }

    @Override // androidx.recyclerview.widget.RecyclerView.SmoothScroller.ScrollVectorProvider
    public android.graphics.PointF computeScrollVectorForPosition(int r3) {
            r2 = this;
            com.google.android.material.carousel.KeylineStateList r0 = r2.keylineStateList
            if (r0 != 0) goto L6
            r3 = 0
            return r3
        L6:
            com.google.android.material.carousel.KeylineState r0 = r2.getKeylineStateForPosition(r3)
            int r3 = r2.getOffsetToScrollToPosition(r3, r0)
            boolean r0 = r2.isHorizontal()
            r1 = 0
            if (r0 == 0) goto L1c
            android.graphics.PointF r0 = new android.graphics.PointF
            float r3 = (float) r3
            r0.<init>(r3, r1)
            return r0
        L1c:
            android.graphics.PointF r0 = new android.graphics.PointF
            float r3 = (float) r3
            r0.<init>(r1, r3)
            return r0
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int computeVerticalScrollExtent(androidx.recyclerview.widget.RecyclerView.State r3) {
            r2 = this;
            int r0 = r2.getChildCount()
            if (r0 == 0) goto L2a
            com.google.android.material.carousel.KeylineStateList r0 = r2.keylineStateList
            if (r0 == 0) goto L2a
            int r0 = r2.getItemCount()
            r1 = 1
            if (r0 > r1) goto L12
            goto L2a
        L12:
            com.google.android.material.carousel.KeylineStateList r0 = r2.keylineStateList
            com.google.android.material.carousel.KeylineState r0 = r0.getDefaultState()
            float r0 = r0.getItemSize()
            int r3 = r2.computeVerticalScrollRange(r3)
            float r3 = (float) r3
            float r0 = r0 / r3
            int r3 = r2.getHeight()
            float r3 = (float) r3
            float r3 = r3 * r0
            int r3 = (int) r3
            return r3
        L2a:
            r3 = 0
            return r3
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int computeVerticalScrollOffset(androidx.recyclerview.widget.RecyclerView.State r1) {
            r0 = this;
            int r1 = r0.scrollOffset
            return r1
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int computeVerticalScrollRange(androidx.recyclerview.widget.RecyclerView.State r2) {
            r1 = this;
            int r2 = r1.maxScroll
            int r0 = r1.minScroll
            int r2 = r2 - r0
            return r2
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public androidx.recyclerview.widget.RecyclerView.LayoutParams generateDefaultLayoutParams() {
            r2 = this;
            androidx.recyclerview.widget.RecyclerView$LayoutParams r0 = new androidx.recyclerview.widget.RecyclerView$LayoutParams
            r1 = -2
            r0.<init>(r1, r1)
            return r0
    }

    @Override // com.google.android.material.carousel.Carousel
    public int getCarouselAlignment() {
            r1 = this;
            int r0 = r1.carouselAlignment
            return r0
    }

    @Override // com.google.android.material.carousel.Carousel
    public int getContainerHeight() {
            r1 = this;
            int r0 = r1.getHeight()
            return r0
    }

    @Override // com.google.android.material.carousel.Carousel
    public int getContainerWidth() {
            r1 = this;
            int r0 = r1.getWidth()
            return r0
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void getDecoratedBoundsWithMargins(android.view.View r5, android.graphics.Rect r6) {
            r4 = this;
            super.getDecoratedBoundsWithMargins(r5, r6)
            int r5 = r6.centerY()
            float r5 = (float) r5
            boolean r0 = r4.isHorizontal()
            if (r0 == 0) goto L13
            int r5 = r6.centerX()
            float r5 = (float) r5
        L13:
            com.google.android.material.carousel.KeylineState r0 = r4.currentKeylineState
            java.util.List r0 = r0.getKeylines()
            r1 = 1
            com.google.android.material.carousel.CarouselLayoutManager$KeylineRange r0 = getSurroundingKeylineRange(r0, r5, r1)
            float r5 = r4.getMaskedItemSizeForLocOffset(r5, r0)
            boolean r0 = r4.isHorizontal()
            r1 = 1073741824(0x40000000, float:2.0)
            r2 = 0
            if (r0 == 0) goto L33
            int r0 = r6.width()
            float r0 = (float) r0
            float r0 = r0 - r5
            float r0 = r0 / r1
            goto L34
        L33:
            r0 = r2
        L34:
            boolean r3 = r4.isHorizontal()
            if (r3 == 0) goto L3b
            goto L42
        L3b:
            int r2 = r6.height()
            float r2 = (float) r2
            float r2 = r2 - r5
            float r2 = r2 / r1
        L42:
            int r5 = r6.left
            float r5 = (float) r5
            float r5 = r5 + r0
            int r5 = (int) r5
            int r1 = r6.top
            float r1 = (float) r1
            float r1 = r1 + r2
            int r1 = (int) r1
            int r3 = r6.right
            float r3 = (float) r3
            float r3 = r3 - r0
            int r0 = (int) r3
            int r3 = r6.bottom
            float r3 = (float) r3
            float r3 = r3 - r2
            int r2 = (int) r3
            r6.set(r5, r1, r0, r2)
            return
    }

    int getOffsetToScrollToPosition(int r1, com.google.android.material.carousel.KeylineState r2) {
            r0 = this;
            int r1 = r0.getScrollOffsetForPosition(r1, r2)
            int r2 = r0.scrollOffset
            int r1 = r1 - r2
            return r1
    }

    int getOffsetToScrollToPositionForSnap(int r6, boolean r7) {
            r5 = this;
            com.google.android.material.carousel.KeylineStateList r0 = r5.keylineStateList
            int r1 = r5.scrollOffset
            float r1 = (float) r1
            int r2 = r5.minScroll
            float r2 = (float) r2
            int r3 = r5.maxScroll
            float r3 = (float) r3
            r4 = 1
            com.google.android.material.carousel.KeylineState r0 = r0.getShiftedState(r1, r2, r3, r4)
            int r0 = r5.getOffsetToScrollToPosition(r6, r0)
            java.util.Map<java.lang.Integer, com.google.android.material.carousel.KeylineState> r1 = r5.keylineStatePositionMap
            if (r1 == 0) goto L21
            com.google.android.material.carousel.KeylineState r1 = r5.getKeylineStateForPosition(r6)
            int r6 = r5.getOffsetToScrollToPosition(r6, r1)
            goto L22
        L21:
            r6 = r0
        L22:
            if (r7 == 0) goto L2f
            int r7 = java.lang.Math.abs(r6)
            int r1 = java.lang.Math.abs(r0)
            if (r7 >= r1) goto L2f
            r0 = r6
        L2f:
            return r0
    }

    public int getOrientation() {
            r1 = this;
            com.google.android.material.carousel.CarouselOrientationHelper r0 = r1.orientationHelper
            int r0 = r0.orientation
            return r0
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public boolean isAutoMeasureEnabled() {
            r1 = this;
            r0 = 1
            return r0
    }

    @Override // com.google.android.material.carousel.Carousel
    public boolean isHorizontal() {
            r1 = this;
            com.google.android.material.carousel.CarouselOrientationHelper r0 = r1.orientationHelper
            int r0 = r0.orientation
            if (r0 != 0) goto L8
            r0 = 1
            goto L9
        L8:
            r0 = 0
        L9:
            return r0
    }

    boolean isLayoutRtl() {
            r2 = this;
            boolean r0 = r2.isHorizontal()
            if (r0 == 0) goto Le
            int r0 = r2.getLayoutDirection()
            r1 = 1
            if (r0 != r1) goto Le
            goto Lf
        Le:
            r1 = 0
        Lf:
            return r1
    }

    /* JADX INFO: renamed from: lambda$new$0$com-google-android-material-carousel-CarouselLayoutManager, reason: not valid java name */
    /* synthetic */ void m611x2ff337cb(android.view.View r1, int r2, int r3, int r4, int r5, int r6, int r7, int r8, int r9) {
            r0 = this;
            if (r2 != r6) goto L8
            if (r3 != r7) goto L8
            if (r4 != r8) goto L8
            if (r5 == r9) goto L10
        L8:
            com.google.android.material.carousel.CarouselLayoutManager$$ExternalSyntheticLambda0 r2 = new com.google.android.material.carousel.CarouselLayoutManager$$ExternalSyntheticLambda0
            r2.<init>(r0)
            r1.post(r2)
        L10:
            return
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void measureChildWithMargins(android.view.View r8, int r9, int r10) {
            r7 = this;
            boolean r0 = r8 instanceof com.google.android.material.carousel.Maskable
            if (r0 == 0) goto L95
            android.view.ViewGroup$LayoutParams r0 = r8.getLayoutParams()
            androidx.recyclerview.widget.RecyclerView$LayoutParams r0 = (androidx.recyclerview.widget.RecyclerView.LayoutParams) r0
            android.graphics.Rect r1 = new android.graphics.Rect
            r1.<init>()
            r7.calculateItemDecorationsForChild(r8, r1)
            int r2 = r1.left
            int r3 = r1.right
            int r2 = r2 + r3
            int r9 = r9 + r2
            int r2 = r1.top
            int r1 = r1.bottom
            int r2 = r2 + r1
            int r10 = r10 + r2
            com.google.android.material.carousel.KeylineStateList r1 = r7.keylineStateList
            if (r1 == 0) goto L33
            com.google.android.material.carousel.CarouselOrientationHelper r1 = r7.orientationHelper
            int r1 = r1.orientation
            if (r1 != 0) goto L33
            com.google.android.material.carousel.KeylineStateList r1 = r7.keylineStateList
            com.google.android.material.carousel.KeylineState r1 = r1.getDefaultState()
            float r1 = r1.getItemSize()
            goto L36
        L33:
            int r1 = r0.width
            float r1 = (float) r1
        L36:
            com.google.android.material.carousel.KeylineStateList r2 = r7.keylineStateList
            if (r2 == 0) goto L4c
            com.google.android.material.carousel.CarouselOrientationHelper r2 = r7.orientationHelper
            int r2 = r2.orientation
            r3 = 1
            if (r2 != r3) goto L4c
            com.google.android.material.carousel.KeylineStateList r2 = r7.keylineStateList
            com.google.android.material.carousel.KeylineState r2 = r2.getDefaultState()
            float r2 = r2.getItemSize()
            goto L4f
        L4c:
            int r2 = r0.height
            float r2 = (float) r2
        L4f:
            int r3 = r7.getWidth()
            int r4 = r7.getWidthMode()
            int r5 = r7.getPaddingLeft()
            int r6 = r7.getPaddingRight()
            int r5 = r5 + r6
            int r6 = r0.leftMargin
            int r5 = r5 + r6
            int r6 = r0.rightMargin
            int r5 = r5 + r6
            int r5 = r5 + r9
            int r9 = (int) r1
            boolean r1 = r7.canScrollHorizontally()
            int r9 = getChildMeasureSpec(r3, r4, r5, r9, r1)
            int r1 = r7.getHeight()
            int r3 = r7.getHeightMode()
            int r4 = r7.getPaddingTop()
            int r5 = r7.getPaddingBottom()
            int r4 = r4 + r5
            int r5 = r0.topMargin
            int r4 = r4 + r5
            int r0 = r0.bottomMargin
            int r4 = r4 + r0
            int r4 = r4 + r10
            int r10 = (int) r2
            boolean r0 = r7.canScrollVertically()
            int r10 = getChildMeasureSpec(r1, r3, r4, r10, r0)
            r8.measure(r9, r10)
            return
        L95:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "All children of a RecyclerView using CarouselLayoutManager must use MaskableFrameLayout as their root ViewGroup."
            r8.<init>(r9)
            throw r8
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onAttachedToWindow(androidx.recyclerview.widget.RecyclerView r3) {
            r2 = this;
            super.onAttachedToWindow(r3)
            com.google.android.material.carousel.CarouselStrategy r0 = r2.carouselStrategy
            android.content.Context r1 = r3.getContext()
            r0.initialize(r1)
            r2.refreshKeylineState()
            android.view.View$OnLayoutChangeListener r0 = r2.recyclerViewSizeChangeListener
            r3.addOnLayoutChangeListener(r0)
            return
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onDetachedFromWindow(androidx.recyclerview.widget.RecyclerView r1, androidx.recyclerview.widget.RecyclerView.Recycler r2) {
            r0 = this;
            super.onDetachedFromWindow(r1, r2)
            android.view.View$OnLayoutChangeListener r2 = r0.recyclerViewSizeChangeListener
            r1.removeOnLayoutChangeListener(r2)
            return
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public android.view.View onFocusSearchFailed(android.view.View r2, int r3, androidx.recyclerview.widget.RecyclerView.Recycler r4, androidx.recyclerview.widget.RecyclerView.State r5) {
            r1 = this;
            int r5 = r1.getChildCount()
            r0 = 0
            if (r5 != 0) goto L8
            return r0
        L8:
            int r3 = r1.convertFocusDirectionToLayoutDirection(r3)
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r3 != r5) goto L11
            return r0
        L11:
            r5 = -1
            if (r3 != r5) goto L2e
            int r2 = r1.getPosition(r2)
            if (r2 != 0) goto L1b
            return r0
        L1b:
            r2 = 0
            android.view.View r3 = r1.getChildAt(r2)
            int r3 = r1.getPosition(r3)
            int r3 = r3 + (-1)
            r1.addViewAtPosition(r4, r3, r2)
            android.view.View r2 = r1.getChildClosestToStart()
            goto L52
        L2e:
            int r2 = r1.getPosition(r2)
            int r3 = r1.getItemCount()
            int r3 = r3 + (-1)
            if (r2 != r3) goto L3b
            return r0
        L3b:
            int r2 = r1.getChildCount()
            int r2 = r2 + (-1)
            android.view.View r2 = r1.getChildAt(r2)
            int r2 = r1.getPosition(r2)
            int r2 = r2 + 1
            r1.addViewAtPosition(r4, r2, r5)
            android.view.View r2 = r1.getChildClosestToEnd()
        L52:
            return r2
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onInitializeAccessibilityEvent(android.view.accessibility.AccessibilityEvent r2) {
            r1 = this;
            super.onInitializeAccessibilityEvent(r2)
            int r0 = r1.getChildCount()
            if (r0 <= 0) goto L26
            r0 = 0
            android.view.View r0 = r1.getChildAt(r0)
            int r0 = r1.getPosition(r0)
            r2.setFromIndex(r0)
            int r0 = r1.getChildCount()
            int r0 = r0 + (-1)
            android.view.View r0 = r1.getChildAt(r0)
            int r0 = r1.getPosition(r0)
            r2.setToIndex(r0)
        L26:
            return
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onItemsAdded(androidx.recyclerview.widget.RecyclerView r1, int r2, int r3) {
            r0 = this;
            super.onItemsAdded(r1, r2, r3)
            r0.updateItemCount()
            return
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onItemsRemoved(androidx.recyclerview.widget.RecyclerView r1, int r2, int r3) {
            r0 = this;
            super.onItemsRemoved(r1, r2, r3)
            r0.updateItemCount()
            return
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onLayoutChildren(androidx.recyclerview.widget.RecyclerView.Recycler r7, androidx.recyclerview.widget.RecyclerView.State r8) {
            r6 = this;
            int r0 = r8.getItemCount()
            r1 = 0
            if (r0 <= 0) goto L8d
            int r0 = r6.getContainerSize()
            float r0 = (float) r0
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 > 0) goto L13
            goto L8d
        L13:
            boolean r0 = r6.isLayoutRtl()
            com.google.android.material.carousel.KeylineStateList r2 = r6.keylineStateList
            if (r2 != 0) goto L1d
            r2 = 1
            goto L1e
        L1d:
            r2 = r1
        L1e:
            if (r2 == 0) goto L23
            r6.recalculateKeylineStateList(r7)
        L23:
            com.google.android.material.carousel.KeylineStateList r3 = r6.keylineStateList
            int r3 = r6.calculateStartScroll(r3)
            com.google.android.material.carousel.KeylineStateList r4 = r6.keylineStateList
            int r4 = r6.calculateEndScroll(r8, r4)
            if (r0 == 0) goto L33
            r5 = r4
            goto L34
        L33:
            r5 = r3
        L34:
            r6.minScroll = r5
            if (r0 == 0) goto L39
            r4 = r3
        L39:
            r6.maxScroll = r4
            if (r2 == 0) goto L62
            r6.scrollOffset = r3
            com.google.android.material.carousel.KeylineStateList r0 = r6.keylineStateList
            int r2 = r6.getItemCount()
            int r3 = r6.minScroll
            int r4 = r6.maxScroll
            boolean r5 = r6.isLayoutRtl()
            java.util.Map r0 = r0.getKeylineStateForPositionMap(r2, r3, r4, r5)
            r6.keylineStatePositionMap = r0
            int r0 = r6.currentEstimatedPosition
            r2 = -1
            if (r0 == r2) goto L62
            com.google.android.material.carousel.KeylineState r2 = r6.getKeylineStateForPosition(r0)
            int r0 = r6.getScrollOffsetForPosition(r0, r2)
            r6.scrollOffset = r0
        L62:
            int r0 = r6.scrollOffset
            int r2 = r6.minScroll
            int r3 = r6.maxScroll
            int r2 = calculateShouldScrollBy(r1, r0, r2, r3)
            int r0 = r0 + r2
            r6.scrollOffset = r0
            int r0 = r6.currentFillStartPosition
            int r2 = r8.getItemCount()
            int r0 = androidx.core.math.MathUtils.clamp(r0, r1, r2)
            r6.currentFillStartPosition = r0
            com.google.android.material.carousel.KeylineStateList r0 = r6.keylineStateList
            r6.updateCurrentKeylineStateForScrollOffset(r0)
            r6.detachAndScrapAttachedViews(r7)
            r6.fill(r7, r8)
            int r7 = r6.getItemCount()
            r6.lastItemCount = r7
            return
        L8d:
            r6.removeAndRecycleAllViews(r7)
            r6.currentFillStartPosition = r1
            return
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onLayoutCompleted(androidx.recyclerview.widget.RecyclerView.State r2) {
            r1 = this;
            super.onLayoutCompleted(r2)
            int r2 = r1.getChildCount()
            r0 = 0
            if (r2 != 0) goto Ld
            r1.currentFillStartPosition = r0
            goto L17
        Ld:
            android.view.View r2 = r1.getChildAt(r0)
            int r2 = r1.getPosition(r2)
            r1.currentFillStartPosition = r2
        L17:
            r1.validateChildOrderIfDebugging()
            return
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public boolean requestChildRectangleOnScreen(androidx.recyclerview.widget.RecyclerView r2, android.view.View r3, android.graphics.Rect r4, boolean r5, boolean r6) {
            r1 = this;
            com.google.android.material.carousel.KeylineStateList r4 = r1.keylineStateList
            r5 = 0
            if (r4 != 0) goto L6
            return r5
        L6:
            int r4 = r1.getPosition(r3)
            int r6 = r1.getPosition(r3)
            com.google.android.material.carousel.KeylineState r6 = r1.getKeylineStateForPosition(r6)
            int r4 = r1.getSmallestScrollOffsetToFocalKeyline(r4, r6)
            if (r4 != 0) goto L19
            return r5
        L19:
            int r5 = r1.scrollOffset
            int r6 = r1.minScroll
            int r0 = r1.maxScroll
            int r4 = calculateShouldScrollBy(r4, r5, r6, r0)
            com.google.android.material.carousel.KeylineStateList r5 = r1.keylineStateList
            int r6 = r1.scrollOffset
            int r6 = r6 + r4
            float r4 = (float) r6
            int r6 = r1.minScroll
            float r6 = (float) r6
            int r0 = r1.maxScroll
            float r0 = (float) r0
            com.google.android.material.carousel.KeylineState r4 = r5.getShiftedState(r4, r6, r0)
            int r3 = r1.getPosition(r3)
            int r3 = r1.getSmallestScrollOffsetToFocalKeyline(r3, r4)
            r1.scrollBy(r2, r3)
            r2 = 1
            return r2
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int scrollHorizontallyBy(int r2, androidx.recyclerview.widget.RecyclerView.Recycler r3, androidx.recyclerview.widget.RecyclerView.State r4) {
            r1 = this;
            boolean r0 = r1.canScrollHorizontally()
            if (r0 == 0) goto Lb
            int r2 = r1.scrollBy(r2, r3, r4)
            goto Lc
        Lb:
            r2 = 0
        Lc:
            return r2
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void scrollToPosition(int r3) {
            r2 = this;
            r2.currentEstimatedPosition = r3
            com.google.android.material.carousel.KeylineStateList r0 = r2.keylineStateList
            if (r0 != 0) goto L7
            return
        L7:
            com.google.android.material.carousel.KeylineState r0 = r2.getKeylineStateForPosition(r3)
            int r0 = r2.getScrollOffsetForPosition(r3, r0)
            r2.scrollOffset = r0
            int r0 = r2.getItemCount()
            int r0 = r0 + (-1)
            r1 = 0
            int r0 = java.lang.Math.max(r1, r0)
            int r3 = androidx.core.math.MathUtils.clamp(r3, r1, r0)
            r2.currentFillStartPosition = r3
            com.google.android.material.carousel.KeylineStateList r3 = r2.keylineStateList
            r2.updateCurrentKeylineStateForScrollOffset(r3)
            r2.requestLayout()
            return
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int scrollVerticallyBy(int r2, androidx.recyclerview.widget.RecyclerView.Recycler r3, androidx.recyclerview.widget.RecyclerView.State r4) {
            r1 = this;
            boolean r0 = r1.canScrollVertically()
            if (r0 == 0) goto Lb
            int r2 = r1.scrollBy(r2, r3, r4)
            goto Lc
        Lb:
            r2 = 0
        Lc:
            return r2
    }

    public void setCarouselAlignment(int r1) {
            r0 = this;
            r0.carouselAlignment = r1
            r0.refreshKeylineState()
            return
    }

    public void setCarouselStrategy(com.google.android.material.carousel.CarouselStrategy r1) {
            r0 = this;
            r0.carouselStrategy = r1
            r0.refreshKeylineState()
            return
    }

    public void setDebuggingEnabled(androidx.recyclerview.widget.RecyclerView r2, boolean r3) {
            r1 = this;
            r1.isDebuggingEnabled = r3
            com.google.android.material.carousel.CarouselLayoutManager$DebugItemDecoration r0 = r1.debugItemDecoration
            r2.removeItemDecoration(r0)
            if (r3 == 0) goto Le
            com.google.android.material.carousel.CarouselLayoutManager$DebugItemDecoration r3 = r1.debugItemDecoration
            r2.addItemDecoration(r3)
        Le:
            r2.invalidateItemDecorations()
            return
    }

    public void setOrientation(int r4) {
            r3 = this;
            if (r4 == 0) goto L1b
            r0 = 1
            if (r4 != r0) goto L6
            goto L1b
        L6:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "invalid orientation:"
            r1.<init>(r2)
            java.lang.StringBuilder r4 = r1.append(r4)
            java.lang.String r4 = r4.toString()
            r0.<init>(r4)
            throw r0
        L1b:
            r0 = 0
            r3.assertNotInLayoutOrScroll(r0)
            com.google.android.material.carousel.CarouselOrientationHelper r0 = r3.orientationHelper
            if (r0 == 0) goto L27
            int r0 = r0.orientation
            if (r4 == r0) goto L30
        L27:
            com.google.android.material.carousel.CarouselOrientationHelper r4 = com.google.android.material.carousel.CarouselOrientationHelper.createOrientationHelper(r3, r4)
            r3.orientationHelper = r4
            r3.refreshKeylineState()
        L30:
            return
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void smoothScrollToPosition(androidx.recyclerview.widget.RecyclerView r1, androidx.recyclerview.widget.RecyclerView.State r2, int r3) {
            r0 = this;
            com.google.android.material.carousel.CarouselLayoutManager$1 r2 = new com.google.android.material.carousel.CarouselLayoutManager$1
            android.content.Context r1 = r1.getContext()
            r2.<init>(r0, r1)
            r2.setTargetPosition(r3)
            r0.startSmoothScroll(r2)
            return
    }
}
