package com.google.android.material.tabs;

/* JADX INFO: loaded from: classes.dex */
@androidx.viewpager.widget.ViewPager.DecorView
public class TabLayout extends android.widget.HorizontalScrollView {
    private static final int ANIMATION_DURATION = 300;
    static final int DEFAULT_GAP_TEXT_ICON = 8;
    private static final int DEFAULT_HEIGHT = 48;
    private static final int DEFAULT_HEIGHT_WITH_TEXT_ICON = 72;
    private static final int DEF_STYLE_RES = 0;
    static final int FIXED_WRAP_GUTTER_MIN = 16;
    public static final int GRAVITY_CENTER = 1;
    public static final int GRAVITY_FILL = 0;
    public static final int GRAVITY_START = 2;
    public static final int INDICATOR_ANIMATION_MODE_ELASTIC = 1;
    public static final int INDICATOR_ANIMATION_MODE_FADE = 2;
    public static final int INDICATOR_ANIMATION_MODE_LINEAR = 0;
    public static final int INDICATOR_GRAVITY_BOTTOM = 0;
    public static final int INDICATOR_GRAVITY_CENTER = 1;
    public static final int INDICATOR_GRAVITY_STRETCH = 3;
    public static final int INDICATOR_GRAVITY_TOP = 2;
    private static final int INVALID_WIDTH = -1;
    private static final java.lang.String LOG_TAG = "TabLayout";
    public static final int MODE_AUTO = 2;
    public static final int MODE_FIXED = 1;
    public static final int MODE_SCROLLABLE = 0;
    private static final int SELECTED_INDICATOR_HEIGHT_DEFAULT = -1;
    public static final int TAB_LABEL_VISIBILITY_LABELED = 1;
    public static final int TAB_LABEL_VISIBILITY_UNLABELED = 0;
    private static final int TAB_MIN_WIDTH_MARGIN = 56;
    private static final androidx.core.util.Pools.Pool<com.google.android.material.tabs.TabLayout.Tab> tabPool = null;
    private com.google.android.material.tabs.TabLayout.AdapterChangeListener adapterChangeListener;
    private int contentInsetStart;
    private com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener currentVpSelectedListener;
    private final int defaultTabTextAppearance;
    int indicatorPosition;
    boolean inlineLabel;
    int mode;
    private com.google.android.material.tabs.TabLayout.TabLayoutOnPageChangeListener pageChangeListener;
    private androidx.viewpager.widget.PagerAdapter pagerAdapter;
    private android.database.DataSetObserver pagerAdapterObserver;
    private final int requestedTabMaxWidth;
    private final int requestedTabMinWidth;
    private android.animation.ValueAnimator scrollAnimator;
    private final int scrollableTabMinWidth;
    private com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener selectedListener;
    private final java.util.ArrayList<com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener> selectedListeners;
    private com.google.android.material.tabs.TabLayout.Tab selectedTab;
    private int selectedTabTextAppearance;
    float selectedTabTextSize;
    private boolean setupViewPagerImplicitly;
    final com.google.android.material.tabs.TabLayout.SlidingTabIndicator slidingTabIndicator;
    final int tabBackgroundResId;
    int tabGravity;
    android.content.res.ColorStateList tabIconTint;
    android.graphics.PorterDuff.Mode tabIconTintMode;
    int tabIndicatorAnimationDuration;
    int tabIndicatorAnimationMode;
    boolean tabIndicatorFullWidth;
    int tabIndicatorGravity;
    int tabIndicatorHeight;
    private com.google.android.material.tabs.TabIndicatorInterpolator tabIndicatorInterpolator;
    private final android.animation.TimeInterpolator tabIndicatorTimeInterpolator;
    int tabMaxWidth;
    int tabPaddingBottom;
    int tabPaddingEnd;
    int tabPaddingStart;
    int tabPaddingTop;
    android.content.res.ColorStateList tabRippleColorStateList;
    android.graphics.drawable.Drawable tabSelectedIndicator;
    private int tabSelectedIndicatorColor;
    private final int tabTextAppearance;
    android.content.res.ColorStateList tabTextColors;
    float tabTextMultiLineSize;
    float tabTextSize;
    private final androidx.core.util.Pools.Pool<com.google.android.material.tabs.TabLayout.TabView> tabViewPool;
    private final java.util.ArrayList<com.google.android.material.tabs.TabLayout.Tab> tabs;
    boolean unboundedRipple;
    androidx.viewpager.widget.ViewPager viewPager;
    private int viewPagerScrollState;


    private class AdapterChangeListener implements androidx.viewpager.widget.ViewPager.OnAdapterChangeListener {
        private boolean autoRefresh;
        final /* synthetic */ com.google.android.material.tabs.TabLayout this$0;

        AdapterChangeListener(com.google.android.material.tabs.TabLayout r1) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                return
        }

        @Override // androidx.viewpager.widget.ViewPager.OnAdapterChangeListener
        public void onAdapterChanged(androidx.viewpager.widget.ViewPager r1, androidx.viewpager.widget.PagerAdapter r2, androidx.viewpager.widget.PagerAdapter r3) {
                r0 = this;
                com.google.android.material.tabs.TabLayout r2 = r0.this$0
                androidx.viewpager.widget.ViewPager r2 = r2.viewPager
                if (r2 != r1) goto Ld
                com.google.android.material.tabs.TabLayout r1 = r0.this$0
                boolean r2 = r0.autoRefresh
                r1.setPagerAdapter(r3, r2)
            Ld:
                return
        }

        void setAutoRefresh(boolean r1) {
                r0 = this;
                r0.autoRefresh = r1
                return
        }
    }

    @java.lang.Deprecated
    public interface BaseOnTabSelectedListener<T extends com.google.android.material.tabs.TabLayout.Tab> {
        void onTabReselected(T r1);

        void onTabSelected(T r1);

        void onTabUnselected(T r1);
    }

    public @interface LabelVisibility {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface Mode {
    }

    public interface OnTabSelectedListener extends com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener<com.google.android.material.tabs.TabLayout.Tab> {
    }

    private class PagerAdapterObserver extends android.database.DataSetObserver {
        final /* synthetic */ com.google.android.material.tabs.TabLayout this$0;

        PagerAdapterObserver(com.google.android.material.tabs.TabLayout r1) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                return
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
                r1 = this;
                com.google.android.material.tabs.TabLayout r0 = r1.this$0
                r0.populateFromPagerAdapter()
                return
        }

        @Override // android.database.DataSetObserver
        public void onInvalidated() {
                r1 = this;
                com.google.android.material.tabs.TabLayout r0 = r1.this$0
                r0.populateFromPagerAdapter()
                return
        }
    }

    class SlidingTabIndicator extends android.widget.LinearLayout {
        android.animation.ValueAnimator indicatorAnimator;
        private int layoutDirection;
        final /* synthetic */ com.google.android.material.tabs.TabLayout this$0;


        SlidingTabIndicator(com.google.android.material.tabs.TabLayout r1, android.content.Context r2) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>(r2)
                r1 = -1
                r0.layoutDirection = r1
                r1 = 0
                r0.setWillNotDraw(r1)
                return
        }

        static /* synthetic */ void access$100(com.google.android.material.tabs.TabLayout.SlidingTabIndicator r0) {
                r0.jumpIndicatorToSelectedPosition()
                return
        }

        static /* synthetic */ void access$1800(com.google.android.material.tabs.TabLayout.SlidingTabIndicator r0, android.view.View r1, android.view.View r2, float r3) {
                r0.tweenIndicatorPosition(r1, r2, r3)
                return
        }

        private void jumpIndicatorToIndicatorPosition() {
                r2 = this;
                com.google.android.material.tabs.TabLayout r0 = r2.this$0
                int r0 = r0.indicatorPosition
                r1 = -1
                if (r0 != r1) goto Lf
                com.google.android.material.tabs.TabLayout r0 = r2.this$0
                int r1 = r0.getSelectedTabPosition()
                r0.indicatorPosition = r1
            Lf:
                com.google.android.material.tabs.TabLayout r0 = r2.this$0
                int r0 = r0.indicatorPosition
                r2.jumpIndicatorToPosition(r0)
                return
        }

        private void jumpIndicatorToPosition(int r5) {
                r4 = this;
                com.google.android.material.tabs.TabLayout r0 = r4.this$0
                int r0 = com.google.android.material.tabs.TabLayout.access$1600(r0)
                if (r0 == 0) goto L26
                com.google.android.material.tabs.TabLayout r0 = r4.this$0
                android.graphics.drawable.Drawable r0 = r0.getTabSelectedIndicator()
                android.graphics.Rect r0 = r0.getBounds()
                int r0 = r0.left
                r1 = -1
                if (r0 != r1) goto L25
                com.google.android.material.tabs.TabLayout r0 = r4.this$0
                android.graphics.drawable.Drawable r0 = r0.getTabSelectedIndicator()
                android.graphics.Rect r0 = r0.getBounds()
                int r0 = r0.right
                if (r0 == r1) goto L26
            L25:
                return
            L26:
                android.view.View r0 = r4.getChildAt(r5)
                com.google.android.material.tabs.TabLayout r1 = r4.this$0
                com.google.android.material.tabs.TabIndicatorInterpolator r1 = com.google.android.material.tabs.TabLayout.access$1700(r1)
                com.google.android.material.tabs.TabLayout r2 = r4.this$0
                android.graphics.drawable.Drawable r3 = r2.tabSelectedIndicator
                r1.setIndicatorBoundsForTab(r2, r0, r3)
                com.google.android.material.tabs.TabLayout r0 = r4.this$0
                r0.indicatorPosition = r5
                return
        }

        private void jumpIndicatorToSelectedPosition() {
                r1 = this;
                com.google.android.material.tabs.TabLayout r0 = r1.this$0
                int r0 = r0.getSelectedTabPosition()
                r1.jumpIndicatorToPosition(r0)
                return
        }

        private void tweenIndicatorPosition(android.view.View r8, android.view.View r9, float r10) {
                r7 = this;
                if (r8 == 0) goto L19
                int r0 = r8.getWidth()
                if (r0 <= 0) goto L19
                com.google.android.material.tabs.TabLayout r0 = r7.this$0
                com.google.android.material.tabs.TabIndicatorInterpolator r1 = com.google.android.material.tabs.TabLayout.access$1700(r0)
                com.google.android.material.tabs.TabLayout r2 = r7.this$0
                android.graphics.drawable.Drawable r6 = r2.tabSelectedIndicator
                r3 = r8
                r4 = r9
                r5 = r10
                r1.updateIndicatorForOffset(r2, r3, r4, r5, r6)
                goto L35
            L19:
                com.google.android.material.tabs.TabLayout r8 = r7.this$0
                android.graphics.drawable.Drawable r8 = r8.tabSelectedIndicator
                com.google.android.material.tabs.TabLayout r9 = r7.this$0
                android.graphics.drawable.Drawable r9 = r9.tabSelectedIndicator
                android.graphics.Rect r9 = r9.getBounds()
                int r9 = r9.top
                com.google.android.material.tabs.TabLayout r10 = r7.this$0
                android.graphics.drawable.Drawable r10 = r10.tabSelectedIndicator
                android.graphics.Rect r10 = r10.getBounds()
                int r10 = r10.bottom
                r0 = -1
                r8.setBounds(r0, r9, r0, r10)
            L35:
                androidx.core.view.ViewCompat.postInvalidateOnAnimation(r7)
                return
        }

        private void updateOrRecreateIndicatorAnimation(boolean r4, int r5, int r6) {
                r3 = this;
                com.google.android.material.tabs.TabLayout r0 = r3.this$0
                int r0 = r0.indicatorPosition
                if (r0 != r5) goto L7
                return
            L7:
                com.google.android.material.tabs.TabLayout r0 = r3.this$0
                int r0 = r0.getSelectedTabPosition()
                android.view.View r0 = r3.getChildAt(r0)
                android.view.View r1 = r3.getChildAt(r5)
                if (r1 != 0) goto L1b
                r3.jumpIndicatorToSelectedPosition()
                return
            L1b:
                com.google.android.material.tabs.TabLayout r2 = r3.this$0
                r2.indicatorPosition = r5
                com.google.android.material.tabs.TabLayout$SlidingTabIndicator$1 r5 = new com.google.android.material.tabs.TabLayout$SlidingTabIndicator$1
                r5.<init>(r3, r0, r1)
                if (r4 == 0) goto L4a
                android.animation.ValueAnimator r4 = new android.animation.ValueAnimator
                r4.<init>()
                r3.indicatorAnimator = r4
                com.google.android.material.tabs.TabLayout r0 = r3.this$0
                android.animation.TimeInterpolator r0 = com.google.android.material.tabs.TabLayout.access$1900(r0)
                r4.setInterpolator(r0)
                long r0 = (long) r6
                r4.setDuration(r0)
                r6 = 2
                float[] r6 = new float[r6]
                r6 = {x0056: FILL_ARRAY_DATA , data: [0, 1065353216} // fill-array
                r4.setFloatValues(r6)
                r4.addUpdateListener(r5)
                r4.start()
                goto L54
            L4a:
                android.animation.ValueAnimator r4 = r3.indicatorAnimator
                r4.removeAllUpdateListeners()
                android.animation.ValueAnimator r4 = r3.indicatorAnimator
                r4.addUpdateListener(r5)
            L54:
                return
        }

        void animateIndicatorToPosition(int r2, int r3) {
                r1 = this;
                android.animation.ValueAnimator r0 = r1.indicatorAnimator
                if (r0 == 0) goto L15
                boolean r0 = r0.isRunning()
                if (r0 == 0) goto L15
                com.google.android.material.tabs.TabLayout r0 = r1.this$0
                int r0 = r0.indicatorPosition
                if (r0 == r2) goto L15
                android.animation.ValueAnimator r0 = r1.indicatorAnimator
                r0.cancel()
            L15:
                r0 = 1
                r1.updateOrRecreateIndicatorAnimation(r0, r2, r3)
                return
        }

        boolean childrenNeedLayout() {
                r4 = this;
                int r0 = r4.getChildCount()
                r1 = 0
                r2 = r1
            L6:
                if (r2 >= r0) goto L17
                android.view.View r3 = r4.getChildAt(r2)
                int r3 = r3.getWidth()
                if (r3 > 0) goto L14
                r0 = 1
                return r0
            L14:
                int r2 = r2 + 1
                goto L6
            L17:
                return r1
        }

        @Override // android.view.View
        public void draw(android.graphics.Canvas r6) {
                r5 = this;
                com.google.android.material.tabs.TabLayout r0 = r5.this$0
                android.graphics.drawable.Drawable r0 = r0.tabSelectedIndicator
                android.graphics.Rect r0 = r0.getBounds()
                int r0 = r0.height()
                if (r0 >= 0) goto L16
                com.google.android.material.tabs.TabLayout r0 = r5.this$0
                android.graphics.drawable.Drawable r0 = r0.tabSelectedIndicator
                int r0 = r0.getIntrinsicHeight()
            L16:
                com.google.android.material.tabs.TabLayout r1 = r5.this$0
                int r1 = r1.tabIndicatorGravity
                if (r1 == 0) goto L3c
                r2 = 1
                r3 = 2
                if (r1 == r2) goto L2d
                r2 = 0
                if (r1 == r3) goto L46
                r0 = 3
                if (r1 == r0) goto L28
                r0 = r2
                goto L46
            L28:
                int r0 = r5.getHeight()
                goto L46
            L2d:
                int r1 = r5.getHeight()
                int r1 = r1 - r0
                int r2 = r1 / 2
                int r1 = r5.getHeight()
                int r1 = r1 + r0
                int r0 = r1 / 2
                goto L46
            L3c:
                int r1 = r5.getHeight()
                int r2 = r1 - r0
                int r0 = r5.getHeight()
            L46:
                com.google.android.material.tabs.TabLayout r1 = r5.this$0
                android.graphics.drawable.Drawable r1 = r1.tabSelectedIndicator
                android.graphics.Rect r1 = r1.getBounds()
                int r1 = r1.width()
                if (r1 <= 0) goto L6e
                com.google.android.material.tabs.TabLayout r1 = r5.this$0
                android.graphics.drawable.Drawable r1 = r1.tabSelectedIndicator
                android.graphics.Rect r1 = r1.getBounds()
                com.google.android.material.tabs.TabLayout r3 = r5.this$0
                android.graphics.drawable.Drawable r3 = r3.tabSelectedIndicator
                int r4 = r1.left
                int r1 = r1.right
                r3.setBounds(r4, r2, r1, r0)
                com.google.android.material.tabs.TabLayout r0 = r5.this$0
                android.graphics.drawable.Drawable r0 = r0.tabSelectedIndicator
                r0.draw(r6)
            L6e:
                super.draw(r6)
                return
        }

        @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
        protected void onLayout(boolean r1, int r2, int r3, int r4, int r5) {
                r0 = this;
                super.onLayout(r1, r2, r3, r4, r5)
                android.animation.ValueAnimator r1 = r0.indicatorAnimator
                if (r1 == 0) goto L19
                boolean r1 = r1.isRunning()
                if (r1 == 0) goto L19
                com.google.android.material.tabs.TabLayout r1 = r0.this$0
                int r1 = r1.getSelectedTabPosition()
                r2 = -1
                r3 = 0
                r0.updateOrRecreateIndicatorAnimation(r3, r1, r2)
                goto L1c
            L19:
                r0.jumpIndicatorToIndicatorPosition()
            L1c:
                return
        }

        @Override // android.widget.LinearLayout, android.view.View
        protected void onMeasure(int r9, int r10) {
                r8 = this;
                super.onMeasure(r9, r10)
                int r0 = android.view.View.MeasureSpec.getMode(r9)
                r1 = 1073741824(0x40000000, float:2.0)
                if (r0 == r1) goto Lc
                return
            Lc:
                com.google.android.material.tabs.TabLayout r0 = r8.this$0
                int r0 = r0.tabGravity
                r1 = 2
                r2 = 1
                if (r0 == r2) goto L1a
                com.google.android.material.tabs.TabLayout r0 = r8.this$0
                int r0 = r0.mode
                if (r0 != r1) goto L80
            L1a:
                int r0 = r8.getChildCount()
                r3 = 0
                r4 = r3
                r5 = r4
            L21:
                if (r4 >= r0) goto L38
                android.view.View r6 = r8.getChildAt(r4)
                int r7 = r6.getVisibility()
                if (r7 != 0) goto L35
                int r6 = r6.getMeasuredWidth()
                int r5 = java.lang.Math.max(r5, r6)
            L35:
                int r4 = r4 + 1
                goto L21
            L38:
                if (r5 > 0) goto L3b
                return
            L3b:
                android.content.Context r4 = r8.getContext()
                r6 = 16
                float r4 = com.google.android.material.internal.ViewUtils.dpToPx(r4, r6)
                int r4 = (int) r4
                int r6 = r5 * r0
                int r7 = r8.getMeasuredWidth()
                int r4 = r4 * r1
                int r7 = r7 - r4
                if (r6 > r7) goto L72
                r1 = r3
            L51:
                if (r3 >= r0) goto L70
                android.view.View r4 = r8.getChildAt(r3)
                android.view.ViewGroup$LayoutParams r4 = r4.getLayoutParams()
                android.widget.LinearLayout$LayoutParams r4 = (android.widget.LinearLayout.LayoutParams) r4
                int r6 = r4.width
                r7 = 0
                if (r6 != r5) goto L68
                float r6 = r4.weight
                int r6 = (r6 > r7 ? 1 : (r6 == r7 ? 0 : -1))
                if (r6 == 0) goto L6d
            L68:
                r4.width = r5
                r4.weight = r7
                r1 = r2
            L6d:
                int r3 = r3 + 1
                goto L51
            L70:
                r2 = r1
                goto L7b
            L72:
                com.google.android.material.tabs.TabLayout r0 = r8.this$0
                r0.tabGravity = r3
                com.google.android.material.tabs.TabLayout r0 = r8.this$0
                r0.updateTabViews(r3)
            L7b:
                if (r2 == 0) goto L80
                super.onMeasure(r9, r10)
            L80:
                return
        }

        @Override // android.widget.LinearLayout, android.view.View
        public void onRtlPropertiesChanged(int r1) {
                r0 = this;
                super.onRtlPropertiesChanged(r1)
                return
        }

        void setIndicatorPositionFromTabPosition(int r3, float r4) {
                r2 = this;
                com.google.android.material.tabs.TabLayout r0 = r2.this$0
                float r1 = (float) r3
                float r1 = r1 + r4
                int r1 = java.lang.Math.round(r1)
                r0.indicatorPosition = r1
                android.animation.ValueAnimator r0 = r2.indicatorAnimator
                if (r0 == 0) goto L19
                boolean r0 = r0.isRunning()
                if (r0 == 0) goto L19
                android.animation.ValueAnimator r0 = r2.indicatorAnimator
                r0.cancel()
            L19:
                android.view.View r0 = r2.getChildAt(r3)
                int r3 = r3 + 1
                android.view.View r3 = r2.getChildAt(r3)
                r2.tweenIndicatorPosition(r0, r3, r4)
                return
        }

        void setSelectedIndicatorHeight(int r5) {
                r4 = this;
                com.google.android.material.tabs.TabLayout r0 = r4.this$0
                android.graphics.drawable.Drawable r0 = r0.tabSelectedIndicator
                android.graphics.Rect r0 = r0.getBounds()
                com.google.android.material.tabs.TabLayout r1 = r4.this$0
                android.graphics.drawable.Drawable r1 = r1.tabSelectedIndicator
                int r2 = r0.left
                r3 = 0
                int r0 = r0.right
                r1.setBounds(r2, r3, r0, r5)
                r4.requestLayout()
                return
        }
    }

    public static class Tab {
        public static final int INVALID_POSITION = -1;
        private java.lang.CharSequence contentDesc;
        private android.view.View customView;
        private android.graphics.drawable.Drawable icon;
        private int id;
        private int labelVisibilityMode;
        public com.google.android.material.tabs.TabLayout parent;
        private int position;
        private java.lang.Object tag;
        private java.lang.CharSequence text;
        public com.google.android.material.tabs.TabLayout.TabView view;

        public Tab() {
                r2 = this;
                r2.<init>()
                r0 = -1
                r2.position = r0
                r1 = 1
                r2.labelVisibilityMode = r1
                r2.id = r0
                return
        }

        static /* synthetic */ int access$000(com.google.android.material.tabs.TabLayout.Tab r0) {
                int r0 = r0.id
                return r0
        }

        static /* synthetic */ int access$1500(com.google.android.material.tabs.TabLayout.Tab r0) {
                int r0 = r0.labelVisibilityMode
                return r0
        }

        static /* synthetic */ java.lang.CharSequence access$300(com.google.android.material.tabs.TabLayout.Tab r0) {
                java.lang.CharSequence r0 = r0.contentDesc
                return r0
        }

        static /* synthetic */ java.lang.CharSequence access$400(com.google.android.material.tabs.TabLayout.Tab r0) {
                java.lang.CharSequence r0 = r0.text
                return r0
        }

        public com.google.android.material.badge.BadgeDrawable getBadge() {
                r1 = this;
                com.google.android.material.tabs.TabLayout$TabView r0 = r1.view
                com.google.android.material.badge.BadgeDrawable r0 = com.google.android.material.tabs.TabLayout.TabView.access$1000(r0)
                return r0
        }

        public java.lang.CharSequence getContentDescription() {
                r1 = this;
                com.google.android.material.tabs.TabLayout$TabView r0 = r1.view
                if (r0 != 0) goto L6
                r0 = 0
                goto La
            L6:
                java.lang.CharSequence r0 = r0.getContentDescription()
            La:
                return r0
        }

        public android.view.View getCustomView() {
                r1 = this;
                android.view.View r0 = r1.customView
                return r0
        }

        public android.graphics.drawable.Drawable getIcon() {
                r1 = this;
                android.graphics.drawable.Drawable r0 = r1.icon
                return r0
        }

        public int getId() {
                r1 = this;
                int r0 = r1.id
                return r0
        }

        public com.google.android.material.badge.BadgeDrawable getOrCreateBadge() {
                r1 = this;
                com.google.android.material.tabs.TabLayout$TabView r0 = r1.view
                com.google.android.material.badge.BadgeDrawable r0 = com.google.android.material.tabs.TabLayout.TabView.access$800(r0)
                return r0
        }

        public int getPosition() {
                r1 = this;
                int r0 = r1.position
                return r0
        }

        public int getTabLabelVisibility() {
                r1 = this;
                int r0 = r1.labelVisibilityMode
                return r0
        }

        public java.lang.Object getTag() {
                r1 = this;
                java.lang.Object r0 = r1.tag
                return r0
        }

        public java.lang.CharSequence getText() {
                r1 = this;
                java.lang.CharSequence r0 = r1.text
                return r0
        }

        public boolean isSelected() {
                r2 = this;
                com.google.android.material.tabs.TabLayout r0 = r2.parent
                if (r0 == 0) goto L13
                int r0 = r0.getSelectedTabPosition()
                r1 = -1
                if (r0 == r1) goto L11
                int r1 = r2.position
                if (r0 != r1) goto L11
                r0 = 1
                goto L12
            L11:
                r0 = 0
            L12:
                return r0
            L13:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.String r1 = "Tab not attached to a TabLayout"
                r0.<init>(r1)
                throw r0
        }

        public void removeBadge() {
                r1 = this;
                com.google.android.material.tabs.TabLayout$TabView r0 = r1.view
                com.google.android.material.tabs.TabLayout.TabView.access$900(r0)
                return
        }

        void reset() {
                r2 = this;
                r0 = 0
                r2.parent = r0
                r2.view = r0
                r2.tag = r0
                r2.icon = r0
                r1 = -1
                r2.id = r1
                r2.text = r0
                r2.contentDesc = r0
                r2.position = r1
                r2.customView = r0
                return
        }

        public void select() {
                r2 = this;
                com.google.android.material.tabs.TabLayout r0 = r2.parent
                if (r0 == 0) goto L8
                r0.selectTab(r2)
                return
            L8:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.String r1 = "Tab not attached to a TabLayout"
                r0.<init>(r1)
                throw r0
        }

        public com.google.android.material.tabs.TabLayout.Tab setContentDescription(int r2) {
                r1 = this;
                com.google.android.material.tabs.TabLayout r0 = r1.parent
                if (r0 == 0) goto L11
                android.content.res.Resources r0 = r0.getResources()
                java.lang.CharSequence r2 = r0.getText(r2)
                com.google.android.material.tabs.TabLayout$Tab r2 = r1.setContentDescription(r2)
                return r2
            L11:
                java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
                java.lang.String r0 = "Tab not attached to a TabLayout"
                r2.<init>(r0)
                throw r2
        }

        public com.google.android.material.tabs.TabLayout.Tab setContentDescription(java.lang.CharSequence r1) {
                r0 = this;
                r0.contentDesc = r1
                r0.updateView()
                return r0
        }

        public com.google.android.material.tabs.TabLayout.Tab setCustomView(int r4) {
                r3 = this;
                com.google.android.material.tabs.TabLayout$TabView r0 = r3.view
                android.content.Context r0 = r0.getContext()
                android.view.LayoutInflater r0 = android.view.LayoutInflater.from(r0)
                com.google.android.material.tabs.TabLayout$TabView r1 = r3.view
                r2 = 0
                android.view.View r4 = r0.inflate(r4, r1, r2)
                com.google.android.material.tabs.TabLayout$Tab r4 = r3.setCustomView(r4)
                return r4
        }

        public com.google.android.material.tabs.TabLayout.Tab setCustomView(android.view.View r1) {
                r0 = this;
                r0.customView = r1
                r0.updateView()
                return r0
        }

        public com.google.android.material.tabs.TabLayout.Tab setIcon(int r2) {
                r1 = this;
                com.google.android.material.tabs.TabLayout r0 = r1.parent
                if (r0 == 0) goto L11
                android.content.Context r0 = r0.getContext()
                android.graphics.drawable.Drawable r2 = androidx.appcompat.content.res.AppCompatResources.getDrawable(r0, r2)
                com.google.android.material.tabs.TabLayout$Tab r2 = r1.setIcon(r2)
                return r2
            L11:
                java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
                java.lang.String r0 = "Tab not attached to a TabLayout"
                r2.<init>(r0)
                throw r2
        }

        public com.google.android.material.tabs.TabLayout.Tab setIcon(android.graphics.drawable.Drawable r3) {
                r2 = this;
                r2.icon = r3
                com.google.android.material.tabs.TabLayout r3 = r2.parent
                int r3 = r3.tabGravity
                r0 = 1
                if (r3 == r0) goto L10
                com.google.android.material.tabs.TabLayout r3 = r2.parent
                int r3 = r3.mode
                r1 = 2
                if (r3 != r1) goto L15
            L10:
                com.google.android.material.tabs.TabLayout r3 = r2.parent
                r3.updateTabViews(r0)
            L15:
                r2.updateView()
                boolean r3 = com.google.android.material.badge.BadgeUtils.USE_COMPAT_PARENT
                if (r3 == 0) goto L35
                com.google.android.material.tabs.TabLayout$TabView r3 = r2.view
                boolean r3 = com.google.android.material.tabs.TabLayout.TabView.access$600(r3)
                if (r3 == 0) goto L35
                com.google.android.material.tabs.TabLayout$TabView r3 = r2.view
                com.google.android.material.badge.BadgeDrawable r3 = com.google.android.material.tabs.TabLayout.TabView.access$700(r3)
                boolean r3 = r3.isVisible()
                if (r3 == 0) goto L35
                com.google.android.material.tabs.TabLayout$TabView r3 = r2.view
                r3.invalidate()
            L35:
                return r2
        }

        public com.google.android.material.tabs.TabLayout.Tab setId(int r2) {
                r1 = this;
                r1.id = r2
                com.google.android.material.tabs.TabLayout$TabView r0 = r1.view
                if (r0 == 0) goto L9
                r0.setId(r2)
            L9:
                return r1
        }

        void setPosition(int r1) {
                r0 = this;
                r0.position = r1
                return
        }

        public com.google.android.material.tabs.TabLayout.Tab setTabLabelVisibility(int r3) {
                r2 = this;
                r2.labelVisibilityMode = r3
                com.google.android.material.tabs.TabLayout r3 = r2.parent
                int r3 = r3.tabGravity
                r0 = 1
                if (r3 == r0) goto L10
                com.google.android.material.tabs.TabLayout r3 = r2.parent
                int r3 = r3.mode
                r1 = 2
                if (r3 != r1) goto L15
            L10:
                com.google.android.material.tabs.TabLayout r3 = r2.parent
                r3.updateTabViews(r0)
            L15:
                r2.updateView()
                boolean r3 = com.google.android.material.badge.BadgeUtils.USE_COMPAT_PARENT
                if (r3 == 0) goto L35
                com.google.android.material.tabs.TabLayout$TabView r3 = r2.view
                boolean r3 = com.google.android.material.tabs.TabLayout.TabView.access$600(r3)
                if (r3 == 0) goto L35
                com.google.android.material.tabs.TabLayout$TabView r3 = r2.view
                com.google.android.material.badge.BadgeDrawable r3 = com.google.android.material.tabs.TabLayout.TabView.access$700(r3)
                boolean r3 = r3.isVisible()
                if (r3 == 0) goto L35
                com.google.android.material.tabs.TabLayout$TabView r3 = r2.view
                r3.invalidate()
            L35:
                return r2
        }

        public com.google.android.material.tabs.TabLayout.Tab setTag(java.lang.Object r1) {
                r0 = this;
                r0.tag = r1
                return r0
        }

        public com.google.android.material.tabs.TabLayout.Tab setText(int r2) {
                r1 = this;
                com.google.android.material.tabs.TabLayout r0 = r1.parent
                if (r0 == 0) goto L11
                android.content.res.Resources r0 = r0.getResources()
                java.lang.CharSequence r2 = r0.getText(r2)
                com.google.android.material.tabs.TabLayout$Tab r2 = r1.setText(r2)
                return r2
            L11:
                java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
                java.lang.String r0 = "Tab not attached to a TabLayout"
                r2.<init>(r0)
                throw r2
        }

        public com.google.android.material.tabs.TabLayout.Tab setText(java.lang.CharSequence r2) {
                r1 = this;
                java.lang.CharSequence r0 = r1.contentDesc
                boolean r0 = android.text.TextUtils.isEmpty(r0)
                if (r0 == 0) goto L13
                boolean r0 = android.text.TextUtils.isEmpty(r2)
                if (r0 != 0) goto L13
                com.google.android.material.tabs.TabLayout$TabView r0 = r1.view
                r0.setContentDescription(r2)
            L13:
                r1.text = r2
                r1.updateView()
                return r1
        }

        void updateView() {
                r1 = this;
                com.google.android.material.tabs.TabLayout$TabView r0 = r1.view
                if (r0 == 0) goto L7
                r0.update()
            L7:
                return
        }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface TabGravity {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface TabIndicatorAnimationMode {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface TabIndicatorGravity {
    }

    public static class TabLayoutOnPageChangeListener implements androidx.viewpager.widget.ViewPager.OnPageChangeListener {
        private int previousScrollState;
        private int scrollState;
        private final java.lang.ref.WeakReference<com.google.android.material.tabs.TabLayout> tabLayoutRef;

        public TabLayoutOnPageChangeListener(com.google.android.material.tabs.TabLayout r2) {
                r1 = this;
                r1.<init>()
                java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference
                r0.<init>(r2)
                r1.tabLayoutRef = r0
                return
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageScrollStateChanged(int r2) {
                r1 = this;
                int r0 = r1.scrollState
                r1.previousScrollState = r0
                r1.scrollState = r2
                java.lang.ref.WeakReference<com.google.android.material.tabs.TabLayout> r2 = r1.tabLayoutRef
                java.lang.Object r2 = r2.get()
                com.google.android.material.tabs.TabLayout r2 = (com.google.android.material.tabs.TabLayout) r2
                if (r2 == 0) goto L15
                int r0 = r1.scrollState
                r2.updateViewPagerScrollState(r0)
            L15:
                return
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageScrolled(int r7, float r8, int r9) {
                r6 = this;
                java.lang.ref.WeakReference<com.google.android.material.tabs.TabLayout> r9 = r6.tabLayoutRef
                java.lang.Object r9 = r9.get()
                r0 = r9
                com.google.android.material.tabs.TabLayout r0 = (com.google.android.material.tabs.TabLayout) r0
                if (r0 == 0) goto L2c
                int r9 = r6.scrollState
                r1 = 0
                r2 = 2
                r3 = 1
                if (r9 != r2) goto L19
                int r4 = r6.previousScrollState
                if (r4 != r3) goto L17
                goto L19
            L17:
                r4 = r1
                goto L1a
            L19:
                r4 = r3
            L1a:
                if (r9 != r2) goto L23
                int r9 = r6.previousScrollState
                if (r9 == 0) goto L21
                goto L23
            L21:
                r9 = r1
                goto L24
            L23:
                r9 = r3
            L24:
                r5 = 0
                r1 = r7
                r2 = r8
                r3 = r4
                r4 = r9
                r0.setScrollPosition(r1, r2, r3, r4, r5)
            L2c:
                return
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageSelected(int r4) {
                r3 = this;
                java.lang.ref.WeakReference<com.google.android.material.tabs.TabLayout> r0 = r3.tabLayoutRef
                java.lang.Object r0 = r0.get()
                com.google.android.material.tabs.TabLayout r0 = (com.google.android.material.tabs.TabLayout) r0
                if (r0 == 0) goto L2c
                int r1 = r0.getSelectedTabPosition()
                if (r1 == r4) goto L2c
                int r1 = r0.getTabCount()
                if (r4 >= r1) goto L2c
                int r1 = r3.scrollState
                if (r1 == 0) goto L24
                r2 = 2
                if (r1 != r2) goto L22
                int r1 = r3.previousScrollState
                if (r1 != 0) goto L22
                goto L24
            L22:
                r1 = 0
                goto L25
            L24:
                r1 = 1
            L25:
                com.google.android.material.tabs.TabLayout$Tab r4 = r0.getTabAt(r4)
                r0.selectTab(r4, r1)
            L2c:
                return
        }

        void reset() {
                r1 = this;
                r0 = 0
                r1.scrollState = r0
                r1.previousScrollState = r0
                return
        }
    }

    public final class TabView extends android.widget.LinearLayout {
        private android.view.View badgeAnchorView;
        private com.google.android.material.badge.BadgeDrawable badgeDrawable;
        private android.graphics.drawable.Drawable baseBackgroundDrawable;
        private android.widget.ImageView customIconView;
        private android.widget.TextView customTextView;
        private android.view.View customView;
        private int defaultMaxLines;
        private android.widget.ImageView iconView;
        private com.google.android.material.tabs.TabLayout.Tab tab;
        private android.widget.TextView textView;
        final /* synthetic */ com.google.android.material.tabs.TabLayout this$0;


        public TabView(com.google.android.material.tabs.TabLayout r4, android.content.Context r5) {
                r3 = this;
                r3.this$0 = r4
                r3.<init>(r5)
                r0 = 2
                r3.defaultMaxLines = r0
                r3.updateBackgroundDrawable(r5)
                int r5 = r4.tabPaddingStart
                int r0 = r4.tabPaddingTop
                int r1 = r4.tabPaddingEnd
                int r2 = r4.tabPaddingBottom
                androidx.core.view.ViewCompat.setPaddingRelative(r3, r5, r0, r1, r2)
                r5 = 17
                r3.setGravity(r5)
                boolean r4 = r4.inlineLabel
                r5 = 1
                r4 = r4 ^ r5
                r3.setOrientation(r4)
                r3.setClickable(r5)
                android.content.Context r4 = r3.getContext()
                r5 = 1002(0x3ea, float:1.404E-42)
                androidx.core.view.PointerIconCompat r4 = androidx.core.view.PointerIconCompat.getSystemIcon(r4, r5)
                androidx.core.view.ViewCompat.setPointerIcon(r3, r4)
                return
        }

        static /* synthetic */ com.google.android.material.badge.BadgeDrawable access$1000(com.google.android.material.tabs.TabLayout.TabView r0) {
                com.google.android.material.badge.BadgeDrawable r0 = r0.getBadge()
                return r0
        }

        static /* synthetic */ void access$1400(com.google.android.material.tabs.TabLayout.TabView r0, android.view.View r1) {
                r0.tryUpdateBadgeDrawableBounds(r1)
                return
        }

        static /* synthetic */ void access$200(com.google.android.material.tabs.TabLayout.TabView r0, android.content.Context r1) {
                r0.updateBackgroundDrawable(r1)
                return
        }

        static /* synthetic */ void access$500(com.google.android.material.tabs.TabLayout.TabView r0, android.graphics.Canvas r1) {
                r0.drawBackground(r1)
                return
        }

        static /* synthetic */ boolean access$600(com.google.android.material.tabs.TabLayout.TabView r0) {
                boolean r0 = r0.hasBadgeDrawable()
                return r0
        }

        static /* synthetic */ com.google.android.material.badge.BadgeDrawable access$700(com.google.android.material.tabs.TabLayout.TabView r0) {
                com.google.android.material.badge.BadgeDrawable r0 = r0.badgeDrawable
                return r0
        }

        static /* synthetic */ com.google.android.material.badge.BadgeDrawable access$800(com.google.android.material.tabs.TabLayout.TabView r0) {
                com.google.android.material.badge.BadgeDrawable r0 = r0.getOrCreateBadge()
                return r0
        }

        static /* synthetic */ void access$900(com.google.android.material.tabs.TabLayout.TabView r0) {
                r0.removeBadge()
                return
        }

        private void addOnLayoutChangeListener(android.view.View r2) {
                r1 = this;
                if (r2 != 0) goto L3
                return
            L3:
                com.google.android.material.tabs.TabLayout$TabView$1 r0 = new com.google.android.material.tabs.TabLayout$TabView$1
                r0.<init>(r1, r2)
                r2.addOnLayoutChangeListener(r0)
                return
        }

        private float approximateLineWidth(android.text.Layout r1, int r2, float r3) {
                r0 = this;
                float r2 = r1.getLineWidth(r2)
                android.text.TextPaint r1 = r1.getPaint()
                float r1 = r1.getTextSize()
                float r3 = r3 / r1
                float r2 = r2 * r3
                return r2
        }

        private void clipViewToPaddingForBadge(boolean r2) {
                r1 = this;
                r1.setClipChildren(r2)
                r1.setClipToPadding(r2)
                android.view.ViewParent r0 = r1.getParent()
                android.view.ViewGroup r0 = (android.view.ViewGroup) r0
                if (r0 == 0) goto L14
                r0.setClipChildren(r2)
                r0.setClipToPadding(r2)
            L14:
                return
        }

        private android.widget.FrameLayout createPreApi18BadgeAnchorRoot() {
                r3 = this;
                android.widget.FrameLayout r0 = new android.widget.FrameLayout
                android.content.Context r1 = r3.getContext()
                r0.<init>(r1)
                android.widget.FrameLayout$LayoutParams r1 = new android.widget.FrameLayout$LayoutParams
                r2 = -2
                r1.<init>(r2, r2)
                r0.setLayoutParams(r1)
                return r0
        }

        private void drawBackground(android.graphics.Canvas r6) {
                r5 = this;
                android.graphics.drawable.Drawable r0 = r5.baseBackgroundDrawable
                if (r0 == 0) goto L1c
                int r1 = r5.getLeft()
                int r2 = r5.getTop()
                int r3 = r5.getRight()
                int r4 = r5.getBottom()
                r0.setBounds(r1, r2, r3, r4)
                android.graphics.drawable.Drawable r0 = r5.baseBackgroundDrawable
                r0.draw(r6)
            L1c:
                return
        }

        private com.google.android.material.badge.BadgeDrawable getBadge() {
                r1 = this;
                com.google.android.material.badge.BadgeDrawable r0 = r1.badgeDrawable
                return r0
        }

        private android.widget.FrameLayout getCustomParentForBadge(android.view.View r3) {
                r2 = this;
                android.widget.ImageView r0 = r2.iconView
                r1 = 0
                if (r3 == r0) goto La
                android.widget.TextView r0 = r2.textView
                if (r3 == r0) goto La
                return r1
            La:
                boolean r0 = com.google.android.material.badge.BadgeUtils.USE_COMPAT_PARENT
                if (r0 == 0) goto L15
                android.view.ViewParent r3 = r3.getParent()
                r1 = r3
                android.widget.FrameLayout r1 = (android.widget.FrameLayout) r1
            L15:
                return r1
        }

        private com.google.android.material.badge.BadgeDrawable getOrCreateBadge() {
                r2 = this;
                com.google.android.material.badge.BadgeDrawable r0 = r2.badgeDrawable
                if (r0 != 0) goto Le
                android.content.Context r0 = r2.getContext()
                com.google.android.material.badge.BadgeDrawable r0 = com.google.android.material.badge.BadgeDrawable.create(r0)
                r2.badgeDrawable = r0
            Le:
                r2.tryUpdateBadgeAnchor()
                com.google.android.material.badge.BadgeDrawable r0 = r2.badgeDrawable
                if (r0 == 0) goto L16
                return r0
            L16:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r1 = "Unable to create badge"
                r0.<init>(r1)
                throw r0
        }

        private boolean hasBadgeDrawable() {
                r1 = this;
                com.google.android.material.badge.BadgeDrawable r0 = r1.badgeDrawable
                if (r0 == 0) goto L6
                r0 = 1
                goto L7
            L6:
                r0 = 0
            L7:
                return r0
        }

        private void inflateAndAddDefaultIconView() {
                r4 = this;
                boolean r0 = com.google.android.material.badge.BadgeUtils.USE_COMPAT_PARENT
                r1 = 0
                if (r0 == 0) goto Ld
                android.widget.FrameLayout r0 = r4.createPreApi18BadgeAnchorRoot()
                r4.addView(r0, r1)
                goto Le
            Ld:
                r0 = r4
            Le:
                android.content.Context r2 = r4.getContext()
                android.view.LayoutInflater r2 = android.view.LayoutInflater.from(r2)
                int r3 = com.google.android.material.R.layout.design_layout_tab_icon
                android.view.View r2 = r2.inflate(r3, r0, r1)
                android.widget.ImageView r2 = (android.widget.ImageView) r2
                r4.iconView = r2
                r0.addView(r2, r1)
                return
        }

        private void inflateAndAddDefaultTextView() {
                r4 = this;
                boolean r0 = com.google.android.material.badge.BadgeUtils.USE_COMPAT_PARENT
                if (r0 == 0) goto Lc
                android.widget.FrameLayout r0 = r4.createPreApi18BadgeAnchorRoot()
                r4.addView(r0)
                goto Ld
            Lc:
                r0 = r4
            Ld:
                android.content.Context r1 = r4.getContext()
                android.view.LayoutInflater r1 = android.view.LayoutInflater.from(r1)
                int r2 = com.google.android.material.R.layout.design_layout_tab_text
                r3 = 0
                android.view.View r1 = r1.inflate(r2, r0, r3)
                android.widget.TextView r1 = (android.widget.TextView) r1
                r4.textView = r1
                r0.addView(r1)
                return
        }

        private void removeBadge() {
                r1 = this;
                android.view.View r0 = r1.badgeAnchorView
                if (r0 == 0) goto L7
                r1.tryRemoveBadgeFromAnchor()
            L7:
                r0 = 0
                r1.badgeDrawable = r0
                return
        }

        private void tryAttachBadgeToAnchor(android.view.View r3) {
                r2 = this;
                boolean r0 = r2.hasBadgeDrawable()
                if (r0 != 0) goto L7
                return
            L7:
                if (r3 == 0) goto L18
                r0 = 0
                r2.clipViewToPaddingForBadge(r0)
                com.google.android.material.badge.BadgeDrawable r0 = r2.badgeDrawable
                android.widget.FrameLayout r1 = r2.getCustomParentForBadge(r3)
                com.google.android.material.badge.BadgeUtils.attachBadgeDrawable(r0, r3, r1)
                r2.badgeAnchorView = r3
            L18:
                return
        }

        private void tryRemoveBadgeFromAnchor() {
                r2 = this;
                boolean r0 = r2.hasBadgeDrawable()
                if (r0 != 0) goto L7
                return
            L7:
                r0 = 1
                r2.clipViewToPaddingForBadge(r0)
                android.view.View r0 = r2.badgeAnchorView
                if (r0 == 0) goto L17
                com.google.android.material.badge.BadgeDrawable r1 = r2.badgeDrawable
                com.google.android.material.badge.BadgeUtils.detachBadgeDrawable(r1, r0)
                r0 = 0
                r2.badgeAnchorView = r0
            L17:
                return
        }

        private void tryUpdateBadgeAnchor() {
                r2 = this;
                boolean r0 = r2.hasBadgeDrawable()
                if (r0 != 0) goto L7
                return
            L7:
                android.view.View r0 = r2.customView
                if (r0 == 0) goto Lf
                r2.tryRemoveBadgeFromAnchor()
                goto L55
            Lf:
                android.widget.ImageView r0 = r2.iconView
                if (r0 == 0) goto L30
                com.google.android.material.tabs.TabLayout$Tab r0 = r2.tab
                if (r0 == 0) goto L30
                android.graphics.drawable.Drawable r0 = r0.getIcon()
                if (r0 == 0) goto L30
                android.view.View r0 = r2.badgeAnchorView
                android.widget.ImageView r1 = r2.iconView
                if (r0 == r1) goto L2c
                r2.tryRemoveBadgeFromAnchor()
                android.widget.ImageView r0 = r2.iconView
                r2.tryAttachBadgeToAnchor(r0)
                goto L55
            L2c:
                r2.tryUpdateBadgeDrawableBounds(r1)
                goto L55
            L30:
                android.widget.TextView r0 = r2.textView
                if (r0 == 0) goto L52
                com.google.android.material.tabs.TabLayout$Tab r0 = r2.tab
                if (r0 == 0) goto L52
                int r0 = r0.getTabLabelVisibility()
                r1 = 1
                if (r0 != r1) goto L52
                android.view.View r0 = r2.badgeAnchorView
                android.widget.TextView r1 = r2.textView
                if (r0 == r1) goto L4e
                r2.tryRemoveBadgeFromAnchor()
                android.widget.TextView r0 = r2.textView
                r2.tryAttachBadgeToAnchor(r0)
                goto L55
            L4e:
                r2.tryUpdateBadgeDrawableBounds(r1)
                goto L55
            L52:
                r2.tryRemoveBadgeFromAnchor()
            L55:
                return
        }

        private void tryUpdateBadgeDrawableBounds(android.view.View r3) {
                r2 = this;
                boolean r0 = r2.hasBadgeDrawable()
                if (r0 == 0) goto L13
                android.view.View r0 = r2.badgeAnchorView
                if (r3 != r0) goto L13
                com.google.android.material.badge.BadgeDrawable r0 = r2.badgeDrawable
                android.widget.FrameLayout r1 = r2.getCustomParentForBadge(r3)
                com.google.android.material.badge.BadgeUtils.setBadgeDrawableBounds(r0, r3, r1)
            L13:
                return
        }

        private void updateBackgroundDrawable(android.content.Context r6) {
                r5 = this;
                com.google.android.material.tabs.TabLayout r0 = r5.this$0
                int r0 = r0.tabBackgroundResId
                r1 = 0
                if (r0 == 0) goto L23
                com.google.android.material.tabs.TabLayout r0 = r5.this$0
                int r0 = r0.tabBackgroundResId
                android.graphics.drawable.Drawable r6 = androidx.appcompat.content.res.AppCompatResources.getDrawable(r6, r0)
                r5.baseBackgroundDrawable = r6
                if (r6 == 0) goto L25
                boolean r6 = r6.isStateful()
                if (r6 == 0) goto L25
                android.graphics.drawable.Drawable r6 = r5.baseBackgroundDrawable
                int[] r0 = r5.getDrawableState()
                r6.setState(r0)
                goto L25
            L23:
                r5.baseBackgroundDrawable = r1
            L25:
                android.graphics.drawable.GradientDrawable r6 = new android.graphics.drawable.GradientDrawable
                r6.<init>()
                r0 = r6
                android.graphics.drawable.GradientDrawable r0 = (android.graphics.drawable.GradientDrawable) r0
                r0 = 0
                r6.setColor(r0)
                com.google.android.material.tabs.TabLayout r0 = r5.this$0
                android.content.res.ColorStateList r0 = r0.tabRippleColorStateList
                if (r0 == 0) goto L63
                android.graphics.drawable.GradientDrawable r0 = new android.graphics.drawable.GradientDrawable
                r0.<init>()
                r2 = 925353388(0x3727c5ac, float:1.0E-5)
                r0.setCornerRadius(r2)
                r2 = -1
                r0.setColor(r2)
                com.google.android.material.tabs.TabLayout r2 = r5.this$0
                android.content.res.ColorStateList r2 = r2.tabRippleColorStateList
                android.content.res.ColorStateList r2 = com.google.android.material.ripple.RippleUtils.convertToRippleDrawableColor(r2)
                android.graphics.drawable.RippleDrawable r3 = new android.graphics.drawable.RippleDrawable
                com.google.android.material.tabs.TabLayout r4 = r5.this$0
                boolean r4 = r4.unboundedRipple
                if (r4 == 0) goto L57
                r6 = r1
            L57:
                com.google.android.material.tabs.TabLayout r4 = r5.this$0
                boolean r4 = r4.unboundedRipple
                if (r4 == 0) goto L5e
                goto L5f
            L5e:
                r1 = r0
            L5f:
                r3.<init>(r2, r6, r1)
                r6 = r3
            L63:
                androidx.core.view.ViewCompat.setBackground(r5, r6)
                com.google.android.material.tabs.TabLayout r6 = r5.this$0
                r6.invalidate()
                return
        }

        private void updateTextAndIcon(android.widget.TextView r8, android.widget.ImageView r9, boolean r10) {
                r7 = this;
                com.google.android.material.tabs.TabLayout$Tab r0 = r7.tab
                r1 = 0
                if (r0 == 0) goto L1a
                android.graphics.drawable.Drawable r0 = r0.getIcon()
                if (r0 == 0) goto L1a
                com.google.android.material.tabs.TabLayout$Tab r0 = r7.tab
                android.graphics.drawable.Drawable r0 = r0.getIcon()
                android.graphics.drawable.Drawable r0 = androidx.core.graphics.drawable.DrawableCompat.wrap(r0)
                android.graphics.drawable.Drawable r0 = r0.mutate()
                goto L1b
            L1a:
                r0 = r1
            L1b:
                if (r0 == 0) goto L31
                com.google.android.material.tabs.TabLayout r2 = r7.this$0
                android.content.res.ColorStateList r2 = r2.tabIconTint
                androidx.core.graphics.drawable.DrawableCompat.setTintList(r0, r2)
                com.google.android.material.tabs.TabLayout r2 = r7.this$0
                android.graphics.PorterDuff$Mode r2 = r2.tabIconTintMode
                if (r2 == 0) goto L31
                com.google.android.material.tabs.TabLayout r2 = r7.this$0
                android.graphics.PorterDuff$Mode r2 = r2.tabIconTintMode
                androidx.core.graphics.drawable.DrawableCompat.setTintMode(r0, r2)
            L31:
                com.google.android.material.tabs.TabLayout$Tab r2 = r7.tab
                if (r2 == 0) goto L3a
                java.lang.CharSequence r2 = r2.getText()
                goto L3b
            L3a:
                r2 = r1
            L3b:
                r3 = 8
                r4 = 0
                if (r9 == 0) goto L52
                if (r0 == 0) goto L4c
                r9.setImageDrawable(r0)
                r9.setVisibility(r4)
                r7.setVisibility(r4)
                goto L52
            L4c:
                r9.setVisibility(r3)
                r9.setImageDrawable(r1)
            L52:
                boolean r0 = android.text.TextUtils.isEmpty(r2)
                if (r8 == 0) goto L7b
                if (r0 != 0) goto L64
                com.google.android.material.tabs.TabLayout$Tab r5 = r7.tab
                int r5 = com.google.android.material.tabs.TabLayout.Tab.access$1500(r5)
                r6 = 1
                if (r5 != r6) goto L64
                goto L65
            L64:
                r6 = r4
            L65:
                if (r0 != 0) goto L69
                r5 = r2
                goto L6a
            L69:
                r5 = r1
            L6a:
                r8.setText(r5)
                if (r6 == 0) goto L71
                r5 = r4
                goto L72
            L71:
                r5 = r3
            L72:
                r8.setVisibility(r5)
                if (r0 != 0) goto L7c
                r7.setVisibility(r4)
                goto L7c
            L7b:
                r6 = r4
            L7c:
                if (r10 == 0) goto Lc0
                if (r9 == 0) goto Lc0
                android.view.ViewGroup$LayoutParams r8 = r9.getLayoutParams()
                android.view.ViewGroup$MarginLayoutParams r8 = (android.view.ViewGroup.MarginLayoutParams) r8
                if (r6 == 0) goto L98
                int r10 = r9.getVisibility()
                if (r10 != 0) goto L98
                android.content.Context r10 = r7.getContext()
                float r10 = com.google.android.material.internal.ViewUtils.dpToPx(r10, r3)
                int r10 = (int) r10
                goto L99
            L98:
                r10 = r4
            L99:
                com.google.android.material.tabs.TabLayout r3 = r7.this$0
                boolean r3 = r3.inlineLabel
                if (r3 == 0) goto Lb1
                int r3 = androidx.core.view.MarginLayoutParamsCompat.getMarginEnd(r8)
                if (r10 == r3) goto Lc0
                androidx.core.view.MarginLayoutParamsCompat.setMarginEnd(r8, r10)
                r8.bottomMargin = r4
                r9.setLayoutParams(r8)
                r9.requestLayout()
                goto Lc0
            Lb1:
                int r3 = r8.bottomMargin
                if (r10 == r3) goto Lc0
                r8.bottomMargin = r10
                androidx.core.view.MarginLayoutParamsCompat.setMarginEnd(r8, r4)
                r9.setLayoutParams(r8)
                r9.requestLayout()
            Lc0:
                com.google.android.material.tabs.TabLayout$Tab r8 = r7.tab
                if (r8 == 0) goto Lc8
                java.lang.CharSequence r1 = com.google.android.material.tabs.TabLayout.Tab.access$300(r8)
            Lc8:
                if (r0 != 0) goto Lcb
                goto Lcc
            Lcb:
                r2 = r1
            Lcc:
                androidx.appcompat.widget.TooltipCompat.setTooltipText(r7, r2)
                return
        }

        @Override // android.view.ViewGroup, android.view.View
        protected void drawableStateChanged() {
                r2 = this;
                super.drawableStateChanged()
                int[] r0 = r2.getDrawableState()
                android.graphics.drawable.Drawable r1 = r2.baseBackgroundDrawable
                if (r1 == 0) goto L18
                boolean r1 = r1.isStateful()
                if (r1 == 0) goto L18
                android.graphics.drawable.Drawable r1 = r2.baseBackgroundDrawable
                boolean r0 = r1.setState(r0)
                goto L19
            L18:
                r0 = 0
            L19:
                if (r0 == 0) goto L23
                r2.invalidate()
                com.google.android.material.tabs.TabLayout r0 = r2.this$0
                r0.invalidate()
            L23:
                return
        }

        int getContentHeight() {
                r9 = this;
                r0 = 3
                android.view.View[] r1 = new android.view.View[r0]
                android.widget.TextView r2 = r9.textView
                r3 = 0
                r1[r3] = r2
                android.widget.ImageView r2 = r9.iconView
                r4 = 1
                r1[r4] = r2
                r2 = 2
                android.view.View r5 = r9.customView
                r1[r2] = r5
                r2 = r3
                r5 = r2
                r6 = r5
            L15:
                if (r3 >= r0) goto L43
                r7 = r1[r3]
                if (r7 == 0) goto L40
                int r8 = r7.getVisibility()
                if (r8 != 0) goto L40
                if (r6 == 0) goto L2c
                int r8 = r7.getTop()
                int r5 = java.lang.Math.min(r5, r8)
                goto L30
            L2c:
                int r5 = r7.getTop()
            L30:
                if (r6 == 0) goto L3b
                int r6 = r7.getBottom()
                int r2 = java.lang.Math.max(r2, r6)
                goto L3f
            L3b:
                int r2 = r7.getBottom()
            L3f:
                r6 = r4
            L40:
                int r3 = r3 + 1
                goto L15
            L43:
                int r2 = r2 - r5
                return r2
        }

        int getContentWidth() {
                r9 = this;
                r0 = 3
                android.view.View[] r1 = new android.view.View[r0]
                android.widget.TextView r2 = r9.textView
                r3 = 0
                r1[r3] = r2
                android.widget.ImageView r2 = r9.iconView
                r4 = 1
                r1[r4] = r2
                r2 = 2
                android.view.View r5 = r9.customView
                r1[r2] = r5
                r2 = r3
                r5 = r2
                r6 = r5
            L15:
                if (r3 >= r0) goto L43
                r7 = r1[r3]
                if (r7 == 0) goto L40
                int r8 = r7.getVisibility()
                if (r8 != 0) goto L40
                if (r6 == 0) goto L2c
                int r8 = r7.getLeft()
                int r5 = java.lang.Math.min(r5, r8)
                goto L30
            L2c:
                int r5 = r7.getLeft()
            L30:
                if (r6 == 0) goto L3b
                int r6 = r7.getRight()
                int r2 = java.lang.Math.max(r2, r6)
                goto L3f
            L3b:
                int r2 = r7.getRight()
            L3f:
                r6 = r4
            L40:
                int r3 = r3 + 1
                goto L15
            L43:
                int r2 = r2 - r5
                return r2
        }

        public com.google.android.material.tabs.TabLayout.Tab getTab() {
                r1 = this;
                com.google.android.material.tabs.TabLayout$Tab r0 = r1.tab
                return r0
        }

        @Override // android.view.View
        public void onInitializeAccessibilityNodeInfo(android.view.accessibility.AccessibilityNodeInfo r8) {
                r7 = this;
                super.onInitializeAccessibilityNodeInfo(r8)
                androidx.core.view.accessibility.AccessibilityNodeInfoCompat r8 = androidx.core.view.accessibility.AccessibilityNodeInfoCompat.wrap(r8)
                com.google.android.material.badge.BadgeDrawable r0 = r7.badgeDrawable
                if (r0 == 0) goto L1a
                boolean r0 = r0.isVisible()
                if (r0 == 0) goto L1a
                com.google.android.material.badge.BadgeDrawable r0 = r7.badgeDrawable
                java.lang.CharSequence r0 = r0.getContentDescription()
                r8.setContentDescription(r0)
            L1a:
                com.google.android.material.tabs.TabLayout$Tab r0 = r7.tab
                int r3 = r0.getPosition()
                r5 = 0
                boolean r6 = r7.isSelected()
                r1 = 0
                r2 = 1
                r4 = 1
                androidx.core.view.accessibility.AccessibilityNodeInfoCompat$CollectionItemInfoCompat r0 = androidx.core.view.accessibility.AccessibilityNodeInfoCompat.CollectionItemInfoCompat.obtain(r1, r2, r3, r4, r5, r6)
                r8.setCollectionItemInfo(r0)
                boolean r0 = r7.isSelected()
                if (r0 == 0) goto L3e
                r0 = 0
                r8.setClickable(r0)
                androidx.core.view.accessibility.AccessibilityNodeInfoCompat$AccessibilityActionCompat r0 = androidx.core.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_CLICK
                r8.removeAction(r0)
            L3e:
                android.content.res.Resources r0 = r7.getResources()
                int r1 = com.google.android.material.R.string.item_view_role_description
                java.lang.String r0 = r0.getString(r1)
                r8.setRoleDescription(r0)
                return
        }

        @Override // android.widget.LinearLayout, android.view.View
        public void onMeasure(int r8, int r9) {
                r7 = this;
                int r0 = android.view.View.MeasureSpec.getSize(r8)
                int r1 = android.view.View.MeasureSpec.getMode(r8)
                com.google.android.material.tabs.TabLayout r2 = r7.this$0
                int r2 = r2.getTabMaxWidth()
                if (r2 <= 0) goto L1e
                if (r1 == 0) goto L14
                if (r0 <= r2) goto L1e
            L14:
                com.google.android.material.tabs.TabLayout r8 = r7.this$0
                int r8 = r8.tabMaxWidth
                r0 = -2147483648(0xffffffff80000000, float:-0.0)
                int r8 = android.view.View.MeasureSpec.makeMeasureSpec(r8, r0)
            L1e:
                super.onMeasure(r8, r9)
                android.widget.TextView r0 = r7.textView
                if (r0 == 0) goto L98
                com.google.android.material.tabs.TabLayout r0 = r7.this$0
                float r0 = r0.tabTextSize
                int r1 = r7.defaultMaxLines
                android.widget.ImageView r2 = r7.iconView
                r3 = 1
                if (r2 == 0) goto L38
                int r2 = r2.getVisibility()
                if (r2 != 0) goto L38
                r1 = r3
                goto L46
            L38:
                android.widget.TextView r2 = r7.textView
                if (r2 == 0) goto L46
                int r2 = r2.getLineCount()
                if (r2 <= r3) goto L46
                com.google.android.material.tabs.TabLayout r0 = r7.this$0
                float r0 = r0.tabTextMultiLineSize
            L46:
                android.widget.TextView r2 = r7.textView
                float r2 = r2.getTextSize()
                android.widget.TextView r4 = r7.textView
                int r4 = r4.getLineCount()
                android.widget.TextView r5 = r7.textView
                int r5 = androidx.core.widget.TextViewCompat.getMaxLines(r5)
                int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r2 != 0) goto L60
                if (r5 < 0) goto L98
                if (r1 == r5) goto L98
            L60:
                com.google.android.material.tabs.TabLayout r5 = r7.this$0
                int r5 = r5.mode
                r6 = 0
                if (r5 != r3) goto L8b
                if (r2 <= 0) goto L8b
                if (r4 != r3) goto L8b
                android.widget.TextView r2 = r7.textView
                android.text.Layout r2 = r2.getLayout()
                if (r2 == 0) goto L98
                float r2 = r7.approximateLineWidth(r2, r6, r0)
                int r3 = r7.getMeasuredWidth()
                int r4 = r7.getPaddingLeft()
                int r3 = r3 - r4
                int r4 = r7.getPaddingRight()
                int r3 = r3 - r4
                float r3 = (float) r3
                int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
                if (r2 <= 0) goto L8b
                goto L98
            L8b:
                android.widget.TextView r2 = r7.textView
                r2.setTextSize(r6, r0)
                android.widget.TextView r0 = r7.textView
                r0.setMaxLines(r1)
                super.onMeasure(r8, r9)
            L98:
                return
        }

        @Override // android.view.View
        public boolean performClick() {
                r2 = this;
                boolean r0 = super.performClick()
                com.google.android.material.tabs.TabLayout$Tab r1 = r2.tab
                if (r1 == 0) goto L14
                if (r0 != 0) goto Le
                r0 = 0
                r2.playSoundEffect(r0)
            Le:
                com.google.android.material.tabs.TabLayout$Tab r0 = r2.tab
                r0.select()
                r0 = 1
            L14:
                return r0
        }

        void reset() {
                r1 = this;
                r0 = 0
                r1.setTab(r0)
                r0 = 0
                r1.setSelected(r0)
                return
        }

        @Override // android.view.View
        public void setSelected(boolean r2) {
                r1 = this;
                r1.isSelected()
                super.setSelected(r2)
                android.widget.TextView r0 = r1.textView
                if (r0 == 0) goto Ld
                r0.setSelected(r2)
            Ld:
                android.widget.ImageView r0 = r1.iconView
                if (r0 == 0) goto L14
                r0.setSelected(r2)
            L14:
                android.view.View r0 = r1.customView
                if (r0 == 0) goto L1b
                r0.setSelected(r2)
            L1b:
                return
        }

        void setTab(com.google.android.material.tabs.TabLayout.Tab r2) {
                r1 = this;
                com.google.android.material.tabs.TabLayout$Tab r0 = r1.tab
                if (r2 == r0) goto L9
                r1.tab = r2
                r1.update()
            L9:
                return
        }

        final void update() {
                r1 = this;
                r1.updateTab()
                com.google.android.material.tabs.TabLayout$Tab r0 = r1.tab
                if (r0 == 0) goto Lf
                boolean r0 = r0.isSelected()
                if (r0 == 0) goto Lf
                r0 = 1
                goto L10
            Lf:
                r0 = 0
            L10:
                r1.setSelected(r0)
                return
        }

        final void updateOrientation() {
                r3 = this;
                com.google.android.material.tabs.TabLayout r0 = r3.this$0
                boolean r0 = r0.inlineLabel
                r1 = 1
                r0 = r0 ^ r1
                r3.setOrientation(r0)
                android.widget.TextView r0 = r3.customTextView
                if (r0 != 0) goto L1a
                android.widget.ImageView r2 = r3.customIconView
                if (r2 == 0) goto L12
                goto L1a
            L12:
                android.widget.TextView r0 = r3.textView
                android.widget.ImageView r2 = r3.iconView
                r3.updateTextAndIcon(r0, r2, r1)
                goto L20
            L1a:
                android.widget.ImageView r1 = r3.customIconView
                r2 = 0
                r3.updateTextAndIcon(r0, r1, r2)
            L20:
                return
        }

        final void updateTab() {
                r5 = this;
                com.google.android.material.tabs.TabLayout$Tab r0 = r5.tab
                r1 = 0
                if (r0 == 0) goto La
                android.view.View r2 = r0.getCustomView()
                goto Lb
            La:
                r2 = r1
            Lb:
                if (r2 == 0) goto L64
                android.view.ViewParent r3 = r2.getParent()
                if (r3 == r5) goto L2e
                if (r3 == 0) goto L1a
                android.view.ViewGroup r3 = (android.view.ViewGroup) r3
                r3.removeView(r2)
            L1a:
                android.view.View r3 = r5.customView
                if (r3 == 0) goto L2b
                android.view.ViewParent r3 = r3.getParent()
                if (r3 == 0) goto L2b
                android.view.ViewGroup r3 = (android.view.ViewGroup) r3
                android.view.View r4 = r5.customView
                r3.removeView(r4)
            L2b:
                r5.addView(r2)
            L2e:
                r5.customView = r2
                android.widget.TextView r3 = r5.textView
                r4 = 8
                if (r3 == 0) goto L39
                r3.setVisibility(r4)
            L39:
                android.widget.ImageView r3 = r5.iconView
                if (r3 == 0) goto L45
                r3.setVisibility(r4)
                android.widget.ImageView r3 = r5.iconView
                r3.setImageDrawable(r1)
            L45:
                r1 = 16908308(0x1020014, float:2.3877285E-38)
                android.view.View r1 = r2.findViewById(r1)
                android.widget.TextView r1 = (android.widget.TextView) r1
                r5.customTextView = r1
                if (r1 == 0) goto L58
                int r1 = androidx.core.widget.TextViewCompat.getMaxLines(r1)
                r5.defaultMaxLines = r1
            L58:
                r1 = 16908294(0x1020006, float:2.3877246E-38)
                android.view.View r1 = r2.findViewById(r1)
                android.widget.ImageView r1 = (android.widget.ImageView) r1
                r5.customIconView = r1
                goto L71
            L64:
                android.view.View r2 = r5.customView
                if (r2 == 0) goto L6d
                r5.removeView(r2)
                r5.customView = r1
            L6d:
                r5.customTextView = r1
                r5.customIconView = r1
            L71:
                android.view.View r1 = r5.customView
                if (r1 != 0) goto Le1
                android.widget.ImageView r1 = r5.iconView
                if (r1 != 0) goto L7c
                r5.inflateAndAddDefaultIconView()
            L7c:
                android.widget.TextView r1 = r5.textView
                if (r1 != 0) goto L8b
                r5.inflateAndAddDefaultTextView()
                android.widget.TextView r1 = r5.textView
                int r1 = androidx.core.widget.TextViewCompat.getMaxLines(r1)
                r5.defaultMaxLines = r1
            L8b:
                android.widget.TextView r1 = r5.textView
                com.google.android.material.tabs.TabLayout r2 = r5.this$0
                int r2 = com.google.android.material.tabs.TabLayout.access$1100(r2)
                androidx.core.widget.TextViewCompat.setTextAppearance(r1, r2)
                boolean r1 = r5.isSelected()
                if (r1 == 0) goto Lb1
                com.google.android.material.tabs.TabLayout r1 = r5.this$0
                int r1 = com.google.android.material.tabs.TabLayout.access$1200(r1)
                r2 = -1
                if (r1 == r2) goto Lb1
                android.widget.TextView r1 = r5.textView
                com.google.android.material.tabs.TabLayout r2 = r5.this$0
                int r2 = com.google.android.material.tabs.TabLayout.access$1200(r2)
                androidx.core.widget.TextViewCompat.setTextAppearance(r1, r2)
                goto Lbc
            Lb1:
                android.widget.TextView r1 = r5.textView
                com.google.android.material.tabs.TabLayout r2 = r5.this$0
                int r2 = com.google.android.material.tabs.TabLayout.access$1300(r2)
                androidx.core.widget.TextViewCompat.setTextAppearance(r1, r2)
            Lbc:
                com.google.android.material.tabs.TabLayout r1 = r5.this$0
                android.content.res.ColorStateList r1 = r1.tabTextColors
                if (r1 == 0) goto Lcb
                android.widget.TextView r1 = r5.textView
                com.google.android.material.tabs.TabLayout r2 = r5.this$0
                android.content.res.ColorStateList r2 = r2.tabTextColors
                r1.setTextColor(r2)
            Lcb:
                android.widget.TextView r1 = r5.textView
                android.widget.ImageView r2 = r5.iconView
                r3 = 1
                r5.updateTextAndIcon(r1, r2, r3)
                r5.tryUpdateBadgeAnchor()
                android.widget.ImageView r1 = r5.iconView
                r5.addOnLayoutChangeListener(r1)
                android.widget.TextView r1 = r5.textView
                r5.addOnLayoutChangeListener(r1)
                goto Lef
            Le1:
                android.widget.TextView r1 = r5.customTextView
                if (r1 != 0) goto Le9
                android.widget.ImageView r2 = r5.customIconView
                if (r2 == 0) goto Lef
            Le9:
                android.widget.ImageView r2 = r5.customIconView
                r3 = 0
                r5.updateTextAndIcon(r1, r2, r3)
            Lef:
                if (r0 == 0) goto L102
                java.lang.CharSequence r1 = com.google.android.material.tabs.TabLayout.Tab.access$300(r0)
                boolean r1 = android.text.TextUtils.isEmpty(r1)
                if (r1 != 0) goto L102
                java.lang.CharSequence r0 = com.google.android.material.tabs.TabLayout.Tab.access$300(r0)
                r5.setContentDescription(r0)
            L102:
                return
        }
    }

    public static class ViewPagerOnTabSelectedListener implements com.google.android.material.tabs.TabLayout.OnTabSelectedListener {
        private final androidx.viewpager.widget.ViewPager viewPager;

        public ViewPagerOnTabSelectedListener(androidx.viewpager.widget.ViewPager r1) {
                r0 = this;
                r0.<init>()
                r0.viewPager = r1
                return
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabReselected(com.google.android.material.tabs.TabLayout.Tab r1) {
                r0 = this;
                return
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabSelected(com.google.android.material.tabs.TabLayout.Tab r2) {
                r1 = this;
                androidx.viewpager.widget.ViewPager r0 = r1.viewPager
                int r2 = r2.getPosition()
                r0.setCurrentItem(r2)
                return
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabUnselected(com.google.android.material.tabs.TabLayout.Tab r1) {
                r0 = this;
                return
        }
    }

    static {
            int r0 = com.google.android.material.R.style.Widget_Design_TabLayout
            com.google.android.material.tabs.TabLayout.DEF_STYLE_RES = r0
            androidx.core.util.Pools$SynchronizedPool r0 = new androidx.core.util.Pools$SynchronizedPool
            r1 = 16
            r0.<init>(r1)
            com.google.android.material.tabs.TabLayout.tabPool = r0
            return
    }

    public TabLayout(android.content.Context r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0)
            return
    }

    public TabLayout(android.content.Context r2, android.util.AttributeSet r3) {
            r1 = this;
            int r0 = com.google.android.material.R.attr.tabStyle
            r1.<init>(r2, r3, r0)
            return
    }

    public TabLayout(android.content.Context r10, android.util.AttributeSet r11, int r12) {
            r9 = this;
            int r4 = com.google.android.material.tabs.TabLayout.DEF_STYLE_RES
            android.content.Context r10 = com.google.android.material.theme.overlay.MaterialThemeOverlay.wrap(r10, r11, r12, r4)
            r9.<init>(r10, r11, r12)
            r10 = -1
            r9.indicatorPosition = r10
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r9.tabs = r0
            r9.selectedTabTextAppearance = r10
            r6 = 0
            r9.tabSelectedIndicatorColor = r6
            r0 = 2147483647(0x7fffffff, float:NaN)
            r9.tabMaxWidth = r0
            r9.tabIndicatorHeight = r10
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r9.selectedListeners = r0
            androidx.core.util.Pools$SimplePool r0 = new androidx.core.util.Pools$SimplePool
            r1 = 12
            r0.<init>(r1)
            r9.tabViewPool = r0
            android.content.Context r7 = r9.getContext()
            r9.setHorizontalScrollBarEnabled(r6)
            com.google.android.material.tabs.TabLayout$SlidingTabIndicator r8 = new com.google.android.material.tabs.TabLayout$SlidingTabIndicator
            r8.<init>(r9, r7)
            r9.slidingTabIndicator = r8
            android.widget.FrameLayout$LayoutParams r0 = new android.widget.FrameLayout$LayoutParams
            r1 = -2
            r0.<init>(r1, r10)
            super.addView(r8, r6, r0)
            int[] r2 = com.google.android.material.R.styleable.TabLayout
            int r0 = com.google.android.material.R.styleable.TabLayout_tabTextAppearance
            int[] r5 = new int[]{r0}
            r0 = r7
            r1 = r11
            r3 = r12
            android.content.res.TypedArray r11 = com.google.android.material.internal.ThemeEnforcement.obtainStyledAttributes(r0, r1, r2, r3, r4, r5)
            android.graphics.drawable.Drawable r12 = r9.getBackground()
            android.content.res.ColorStateList r12 = com.google.android.material.drawable.DrawableUtils.getColorStateListOrNull(r12)
            if (r12 == 0) goto L74
            com.google.android.material.shape.MaterialShapeDrawable r0 = new com.google.android.material.shape.MaterialShapeDrawable
            r0.<init>()
            r0.setFillColor(r12)
            r0.initializeElevationOverlay(r7)
            float r12 = androidx.core.view.ViewCompat.getElevation(r9)
            r0.setElevation(r12)
            androidx.core.view.ViewCompat.setBackground(r9, r0)
        L74:
            int r12 = com.google.android.material.R.styleable.TabLayout_tabIndicator
            android.graphics.drawable.Drawable r12 = com.google.android.material.resources.MaterialResources.getDrawable(r7, r11, r12)
            r9.setSelectedTabIndicator(r12)
            int r12 = com.google.android.material.R.styleable.TabLayout_tabIndicatorColor
            int r12 = r11.getColor(r12, r6)
            r9.setSelectedTabIndicatorColor(r12)
            int r12 = com.google.android.material.R.styleable.TabLayout_tabIndicatorHeight
            int r12 = r11.getDimensionPixelSize(r12, r10)
            r8.setSelectedIndicatorHeight(r12)
            int r12 = com.google.android.material.R.styleable.TabLayout_tabIndicatorGravity
            int r12 = r11.getInt(r12, r6)
            r9.setSelectedTabIndicatorGravity(r12)
            int r12 = com.google.android.material.R.styleable.TabLayout_tabIndicatorAnimationMode
            int r12 = r11.getInt(r12, r6)
            r9.setTabIndicatorAnimationMode(r12)
            int r12 = com.google.android.material.R.styleable.TabLayout_tabIndicatorFullWidth
            r0 = 1
            boolean r12 = r11.getBoolean(r12, r0)
            r9.setTabIndicatorFullWidth(r12)
            int r12 = com.google.android.material.R.styleable.TabLayout_tabPadding
            int r12 = r11.getDimensionPixelSize(r12, r6)
            r9.tabPaddingBottom = r12
            r9.tabPaddingEnd = r12
            r9.tabPaddingTop = r12
            r9.tabPaddingStart = r12
            int r12 = com.google.android.material.R.styleable.TabLayout_tabPaddingStart
            int r1 = r9.tabPaddingStart
            int r12 = r11.getDimensionPixelSize(r12, r1)
            r9.tabPaddingStart = r12
            int r12 = com.google.android.material.R.styleable.TabLayout_tabPaddingTop
            int r1 = r9.tabPaddingTop
            int r12 = r11.getDimensionPixelSize(r12, r1)
            r9.tabPaddingTop = r12
            int r12 = com.google.android.material.R.styleable.TabLayout_tabPaddingEnd
            int r1 = r9.tabPaddingEnd
            int r12 = r11.getDimensionPixelSize(r12, r1)
            r9.tabPaddingEnd = r12
            int r12 = com.google.android.material.R.styleable.TabLayout_tabPaddingBottom
            int r1 = r9.tabPaddingBottom
            int r12 = r11.getDimensionPixelSize(r12, r1)
            r9.tabPaddingBottom = r12
            boolean r12 = com.google.android.material.internal.ThemeEnforcement.isMaterial3Theme(r7)
            if (r12 == 0) goto Lec
            int r12 = com.google.android.material.R.attr.textAppearanceTitleSmall
            r9.defaultTabTextAppearance = r12
            goto Lf0
        Lec:
            int r12 = com.google.android.material.R.attr.textAppearanceButton
            r9.defaultTabTextAppearance = r12
        Lf0:
            int r12 = com.google.android.material.R.styleable.TabLayout_tabTextAppearance
            int r1 = com.google.android.material.R.style.TextAppearance_Design_Tab
            int r12 = r11.getResourceId(r12, r1)
            r9.tabTextAppearance = r12
            int[] r1 = androidx.appcompat.R.styleable.TextAppearance
            android.content.res.TypedArray r1 = r7.obtainStyledAttributes(r12, r1)
            int r2 = androidx.appcompat.R.styleable.TextAppearance_android_textSize     // Catch: java.lang.Throwable -> L21d
            int r2 = r1.getDimensionPixelSize(r2, r6)     // Catch: java.lang.Throwable -> L21d
            float r2 = (float) r2     // Catch: java.lang.Throwable -> L21d
            r9.tabTextSize = r2     // Catch: java.lang.Throwable -> L21d
            int r2 = androidx.appcompat.R.styleable.TextAppearance_android_textColor     // Catch: java.lang.Throwable -> L21d
            android.content.res.ColorStateList r2 = com.google.android.material.resources.MaterialResources.getColorStateList(r7, r1, r2)     // Catch: java.lang.Throwable -> L21d
            r9.tabTextColors = r2     // Catch: java.lang.Throwable -> L21d
            r1.recycle()
            int r1 = com.google.android.material.R.styleable.TabLayout_tabSelectedTextAppearance
            boolean r1 = r11.hasValue(r1)
            if (r1 == 0) goto L124
            int r1 = com.google.android.material.R.styleable.TabLayout_tabSelectedTextAppearance
            int r12 = r11.getResourceId(r1, r12)
            r9.selectedTabTextAppearance = r12
        L124:
            int r12 = r9.selectedTabTextAppearance
            if (r12 == r10) goto L166
            int[] r1 = androidx.appcompat.R.styleable.TextAppearance
            android.content.res.TypedArray r12 = r7.obtainStyledAttributes(r12, r1)
            int r1 = androidx.appcompat.R.styleable.TextAppearance_android_textSize     // Catch: java.lang.Throwable -> L161
            float r2 = r9.tabTextSize     // Catch: java.lang.Throwable -> L161
            int r2 = (int) r2     // Catch: java.lang.Throwable -> L161
            int r1 = r12.getDimensionPixelSize(r1, r2)     // Catch: java.lang.Throwable -> L161
            float r1 = (float) r1     // Catch: java.lang.Throwable -> L161
            r9.selectedTabTextSize = r1     // Catch: java.lang.Throwable -> L161
            int r1 = androidx.appcompat.R.styleable.TextAppearance_android_textColor     // Catch: java.lang.Throwable -> L161
            android.content.res.ColorStateList r1 = com.google.android.material.resources.MaterialResources.getColorStateList(r7, r12, r1)     // Catch: java.lang.Throwable -> L161
            if (r1 == 0) goto L15d
            android.content.res.ColorStateList r2 = r9.tabTextColors     // Catch: java.lang.Throwable -> L161
            int r2 = r2.getDefaultColor()     // Catch: java.lang.Throwable -> L161
            r3 = 16842913(0x10100a1, float:2.369401E-38)
            int[] r3 = new int[]{r3}     // Catch: java.lang.Throwable -> L161
            int r4 = r1.getDefaultColor()     // Catch: java.lang.Throwable -> L161
            int r1 = r1.getColorForState(r3, r4)     // Catch: java.lang.Throwable -> L161
            android.content.res.ColorStateList r1 = createColorStateList(r2, r1)     // Catch: java.lang.Throwable -> L161
            r9.tabTextColors = r1     // Catch: java.lang.Throwable -> L161
        L15d:
            r12.recycle()
            goto L166
        L161:
            r10 = move-exception
            r12.recycle()
            throw r10
        L166:
            int r12 = com.google.android.material.R.styleable.TabLayout_tabTextColor
            boolean r12 = r11.hasValue(r12)
            if (r12 == 0) goto L176
            int r12 = com.google.android.material.R.styleable.TabLayout_tabTextColor
            android.content.res.ColorStateList r12 = com.google.android.material.resources.MaterialResources.getColorStateList(r7, r11, r12)
            r9.tabTextColors = r12
        L176:
            int r12 = com.google.android.material.R.styleable.TabLayout_tabSelectedTextColor
            boolean r12 = r11.hasValue(r12)
            if (r12 == 0) goto L190
            int r12 = com.google.android.material.R.styleable.TabLayout_tabSelectedTextColor
            int r12 = r11.getColor(r12, r6)
            android.content.res.ColorStateList r1 = r9.tabTextColors
            int r1 = r1.getDefaultColor()
            android.content.res.ColorStateList r12 = createColorStateList(r1, r12)
            r9.tabTextColors = r12
        L190:
            int r12 = com.google.android.material.R.styleable.TabLayout_tabIconTint
            android.content.res.ColorStateList r12 = com.google.android.material.resources.MaterialResources.getColorStateList(r7, r11, r12)
            r9.tabIconTint = r12
            int r12 = com.google.android.material.R.styleable.TabLayout_tabIconTintMode
            int r12 = r11.getInt(r12, r10)
            r1 = 0
            android.graphics.PorterDuff$Mode r12 = com.google.android.material.internal.ViewUtils.parseTintMode(r12, r1)
            r9.tabIconTintMode = r12
            int r12 = com.google.android.material.R.styleable.TabLayout_tabRippleColor
            android.content.res.ColorStateList r12 = com.google.android.material.resources.MaterialResources.getColorStateList(r7, r11, r12)
            r9.tabRippleColorStateList = r12
            int r12 = com.google.android.material.R.styleable.TabLayout_tabIndicatorAnimationDuration
            r1 = 300(0x12c, float:4.2E-43)
            int r12 = r11.getInt(r12, r1)
            r9.tabIndicatorAnimationDuration = r12
            int r12 = com.google.android.material.R.attr.motionEasingEmphasizedInterpolator
            android.animation.TimeInterpolator r1 = com.google.android.material.animation.AnimationUtils.FAST_OUT_SLOW_IN_INTERPOLATOR
            android.animation.TimeInterpolator r12 = com.google.android.material.motion.MotionUtils.resolveThemeInterpolator(r7, r12, r1)
            r9.tabIndicatorTimeInterpolator = r12
            int r12 = com.google.android.material.R.styleable.TabLayout_tabMinWidth
            int r12 = r11.getDimensionPixelSize(r12, r10)
            r9.requestedTabMinWidth = r12
            int r12 = com.google.android.material.R.styleable.TabLayout_tabMaxWidth
            int r10 = r11.getDimensionPixelSize(r12, r10)
            r9.requestedTabMaxWidth = r10
            int r10 = com.google.android.material.R.styleable.TabLayout_tabBackground
            int r10 = r11.getResourceId(r10, r6)
            r9.tabBackgroundResId = r10
            int r10 = com.google.android.material.R.styleable.TabLayout_tabContentStart
            int r10 = r11.getDimensionPixelSize(r10, r6)
            r9.contentInsetStart = r10
            int r10 = com.google.android.material.R.styleable.TabLayout_tabMode
            int r10 = r11.getInt(r10, r0)
            r9.mode = r10
            int r10 = com.google.android.material.R.styleable.TabLayout_tabGravity
            int r10 = r11.getInt(r10, r6)
            r9.tabGravity = r10
            int r10 = com.google.android.material.R.styleable.TabLayout_tabInlineLabel
            boolean r10 = r11.getBoolean(r10, r6)
            r9.inlineLabel = r10
            int r10 = com.google.android.material.R.styleable.TabLayout_tabUnboundedRipple
            boolean r10 = r11.getBoolean(r10, r6)
            r9.unboundedRipple = r10
            r11.recycle()
            android.content.res.Resources r10 = r9.getResources()
            int r11 = com.google.android.material.R.dimen.design_tab_text_size_2line
            int r11 = r10.getDimensionPixelSize(r11)
            float r11 = (float) r11
            r9.tabTextMultiLineSize = r11
            int r11 = com.google.android.material.R.dimen.design_tab_scrollable_min_width
            int r10 = r10.getDimensionPixelSize(r11)
            r9.scrollableTabMinWidth = r10
            r9.applyModeAndGravity()
            return
        L21d:
            r10 = move-exception
            r1.recycle()
            throw r10
    }

    static /* synthetic */ int access$1100(com.google.android.material.tabs.TabLayout r0) {
            int r0 = r0.defaultTabTextAppearance
            return r0
    }

    static /* synthetic */ int access$1200(com.google.android.material.tabs.TabLayout r0) {
            int r0 = r0.selectedTabTextAppearance
            return r0
    }

    static /* synthetic */ int access$1300(com.google.android.material.tabs.TabLayout r0) {
            int r0 = r0.tabTextAppearance
            return r0
    }

    static /* synthetic */ int access$1600(com.google.android.material.tabs.TabLayout r0) {
            int r0 = r0.viewPagerScrollState
            return r0
    }

    static /* synthetic */ com.google.android.material.tabs.TabIndicatorInterpolator access$1700(com.google.android.material.tabs.TabLayout r0) {
            com.google.android.material.tabs.TabIndicatorInterpolator r0 = r0.tabIndicatorInterpolator
            return r0
    }

    static /* synthetic */ android.animation.TimeInterpolator access$1900(com.google.android.material.tabs.TabLayout r0) {
            android.animation.TimeInterpolator r0 = r0.tabIndicatorTimeInterpolator
            return r0
    }

    private void addTabFromItemView(com.google.android.material.tabs.TabItem r3) {
            r2 = this;
            com.google.android.material.tabs.TabLayout$Tab r0 = r2.newTab()
            java.lang.CharSequence r1 = r3.text
            if (r1 == 0) goto Ld
            java.lang.CharSequence r1 = r3.text
            r0.setText(r1)
        Ld:
            android.graphics.drawable.Drawable r1 = r3.icon
            if (r1 == 0) goto L16
            android.graphics.drawable.Drawable r1 = r3.icon
            r0.setIcon(r1)
        L16:
            int r1 = r3.customLayout
            if (r1 == 0) goto L1f
            int r1 = r3.customLayout
            r0.setCustomView(r1)
        L1f:
            java.lang.CharSequence r1 = r3.getContentDescription()
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L30
            java.lang.CharSequence r3 = r3.getContentDescription()
            r0.setContentDescription(r3)
        L30:
            r2.addTab(r0)
            return
    }

    private void addTabView(com.google.android.material.tabs.TabLayout.Tab r4) {
            r3 = this;
            com.google.android.material.tabs.TabLayout$TabView r0 = r4.view
            r1 = 0
            r0.setSelected(r1)
            r0.setActivated(r1)
            com.google.android.material.tabs.TabLayout$SlidingTabIndicator r1 = r3.slidingTabIndicator
            int r4 = r4.getPosition()
            android.widget.LinearLayout$LayoutParams r2 = r3.createLayoutParamsForTabs()
            r1.addView(r0, r4, r2)
            return
    }

    private void addViewInternal(android.view.View r2) {
            r1 = this;
            boolean r0 = r2 instanceof com.google.android.material.tabs.TabItem
            if (r0 == 0) goto La
            com.google.android.material.tabs.TabItem r2 = (com.google.android.material.tabs.TabItem) r2
            r1.addTabFromItemView(r2)
            return
        La:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Only TabItem instances can be added to TabLayout"
            r2.<init>(r0)
            throw r2
    }

    private void animateToTab(int r4) {
            r3 = this;
            r0 = -1
            if (r4 != r0) goto L4
            return
        L4:
            android.os.IBinder r0 = r3.getWindowToken()
            r1 = 0
            if (r0 == 0) goto L3d
            boolean r0 = androidx.core.view.ViewCompat.isLaidOut(r3)
            if (r0 == 0) goto L3d
            com.google.android.material.tabs.TabLayout$SlidingTabIndicator r0 = r3.slidingTabIndicator
            boolean r0 = r0.childrenNeedLayout()
            if (r0 == 0) goto L1a
            goto L3d
        L1a:
            int r0 = r3.getScrollX()
            int r1 = r3.calculateScrollXForTab(r4, r1)
            if (r0 == r1) goto L35
            r3.ensureScrollAnimator()
            android.animation.ValueAnimator r2 = r3.scrollAnimator
            int[] r0 = new int[]{r0, r1}
            r2.setIntValues(r0)
            android.animation.ValueAnimator r0 = r3.scrollAnimator
            r0.start()
        L35:
            com.google.android.material.tabs.TabLayout$SlidingTabIndicator r0 = r3.slidingTabIndicator
            int r1 = r3.tabIndicatorAnimationDuration
            r0.animateIndicatorToPosition(r4, r1)
            return
        L3d:
            r0 = 1
            r3.setScrollPosition(r4, r1, r0)
            return
    }

    private void applyGravityForModeScrollable(int r2) {
            r1 = this;
            if (r2 == 0) goto Lf
            r0 = 1
            if (r2 == r0) goto L9
            r0 = 2
            if (r2 == r0) goto L16
            goto L1e
        L9:
            com.google.android.material.tabs.TabLayout$SlidingTabIndicator r2 = r1.slidingTabIndicator
            r2.setGravity(r0)
            goto L1e
        Lf:
            java.lang.String r2 = "TabLayout"
            java.lang.String r0 = "MODE_SCROLLABLE + GRAVITY_FILL is not supported, GRAVITY_START will be used instead"
            android.util.Log.w(r2, r0)
        L16:
            com.google.android.material.tabs.TabLayout$SlidingTabIndicator r2 = r1.slidingTabIndicator
            r0 = 8388611(0x800003, float:1.1754948E-38)
            r2.setGravity(r0)
        L1e:
            return
    }

    private void applyModeAndGravity() {
            r4 = this;
            int r0 = r4.mode
            r1 = 2
            r2 = 0
            if (r0 == 0) goto Lb
            if (r0 != r1) goto L9
            goto Lb
        L9:
            r0 = r2
            goto L14
        Lb:
            int r0 = r4.contentInsetStart
            int r3 = r4.tabPaddingStart
            int r0 = r0 - r3
            int r0 = java.lang.Math.max(r2, r0)
        L14:
            com.google.android.material.tabs.TabLayout$SlidingTabIndicator r3 = r4.slidingTabIndicator
            androidx.core.view.ViewCompat.setPaddingRelative(r3, r0, r2, r2, r2)
            int r0 = r4.mode
            r2 = 1
            if (r0 == 0) goto L34
            if (r0 == r2) goto L23
            if (r0 == r1) goto L23
            goto L39
        L23:
            int r0 = r4.tabGravity
            if (r0 != r1) goto L2e
            java.lang.String r0 = "TabLayout"
            java.lang.String r1 = "GRAVITY_START is not supported with the current tab mode, GRAVITY_CENTER will be used instead"
            android.util.Log.w(r0, r1)
        L2e:
            com.google.android.material.tabs.TabLayout$SlidingTabIndicator r0 = r4.slidingTabIndicator
            r0.setGravity(r2)
            goto L39
        L34:
            int r0 = r4.tabGravity
            r4.applyGravityForModeScrollable(r0)
        L39:
            r4.updateTabViews(r2)
            return
    }

    private int calculateScrollXForTab(int r5, float r6) {
            r4 = this;
            int r0 = r4.mode
            r1 = 0
            r2 = 2
            if (r0 == 0) goto La
            if (r0 != r2) goto L9
            goto La
        L9:
            return r1
        La:
            com.google.android.material.tabs.TabLayout$SlidingTabIndicator r0 = r4.slidingTabIndicator
            android.view.View r0 = r0.getChildAt(r5)
            if (r0 != 0) goto L13
            return r1
        L13:
            int r5 = r5 + 1
            com.google.android.material.tabs.TabLayout$SlidingTabIndicator r3 = r4.slidingTabIndicator
            int r3 = r3.getChildCount()
            if (r5 >= r3) goto L24
            com.google.android.material.tabs.TabLayout$SlidingTabIndicator r3 = r4.slidingTabIndicator
            android.view.View r5 = r3.getChildAt(r5)
            goto L25
        L24:
            r5 = 0
        L25:
            int r3 = r0.getWidth()
            if (r5 == 0) goto L2f
            int r1 = r5.getWidth()
        L2f:
            int r5 = r0.getLeft()
            int r0 = r3 / 2
            int r5 = r5 + r0
            int r0 = r4.getWidth()
            int r0 = r0 / r2
            int r5 = r5 - r0
            int r3 = r3 + r1
            float r0 = (float) r3
            r1 = 1056964608(0x3f000000, float:0.5)
            float r0 = r0 * r1
            float r0 = r0 * r6
            int r6 = (int) r0
            int r0 = androidx.core.view.ViewCompat.getLayoutDirection(r4)
            if (r0 != 0) goto L4b
            int r5 = r5 + r6
            goto L4c
        L4b:
            int r5 = r5 - r6
        L4c:
            return r5
    }

    private void configureTab(com.google.android.material.tabs.TabLayout.Tab r4, int r5) {
            r3 = this;
            r4.setPosition(r5)
            java.util.ArrayList<com.google.android.material.tabs.TabLayout$Tab> r0 = r3.tabs
            r0.add(r5, r4)
            java.util.ArrayList<com.google.android.material.tabs.TabLayout$Tab> r4 = r3.tabs
            int r4 = r4.size()
            int r5 = r5 + 1
            r0 = -1
        L11:
            if (r5 >= r4) goto L32
            java.util.ArrayList<com.google.android.material.tabs.TabLayout$Tab> r1 = r3.tabs
            java.lang.Object r1 = r1.get(r5)
            com.google.android.material.tabs.TabLayout$Tab r1 = (com.google.android.material.tabs.TabLayout.Tab) r1
            int r1 = r1.getPosition()
            int r2 = r3.indicatorPosition
            if (r1 != r2) goto L24
            r0 = r5
        L24:
            java.util.ArrayList<com.google.android.material.tabs.TabLayout$Tab> r1 = r3.tabs
            java.lang.Object r1 = r1.get(r5)
            com.google.android.material.tabs.TabLayout$Tab r1 = (com.google.android.material.tabs.TabLayout.Tab) r1
            r1.setPosition(r5)
            int r5 = r5 + 1
            goto L11
        L32:
            r3.indicatorPosition = r0
            return
    }

    private static android.content.res.ColorStateList createColorStateList(int r4, int r5) {
            r0 = 2
            int[][] r1 = new int[r0][]
            int[] r0 = new int[r0]
            int[] r2 = com.google.android.material.tabs.TabLayout.SELECTED_STATE_SET
            r3 = 0
            r1[r3] = r2
            r0[r3] = r5
            int[] r5 = com.google.android.material.tabs.TabLayout.EMPTY_STATE_SET
            r2 = 1
            r1[r2] = r5
            r0[r2] = r4
            android.content.res.ColorStateList r4 = new android.content.res.ColorStateList
            r4.<init>(r1, r0)
            return r4
    }

    private android.widget.LinearLayout.LayoutParams createLayoutParamsForTabs() {
            r3 = this;
            android.widget.LinearLayout$LayoutParams r0 = new android.widget.LinearLayout$LayoutParams
            r1 = -2
            r2 = -1
            r0.<init>(r1, r2)
            r3.updateTabViewLayoutParams(r0)
            return r0
    }

    private com.google.android.material.tabs.TabLayout.TabView createTabView(com.google.android.material.tabs.TabLayout.Tab r3) {
            r2 = this;
            androidx.core.util.Pools$Pool<com.google.android.material.tabs.TabLayout$TabView> r0 = r2.tabViewPool
            if (r0 == 0) goto Lb
            java.lang.Object r0 = r0.acquire()
            com.google.android.material.tabs.TabLayout$TabView r0 = (com.google.android.material.tabs.TabLayout.TabView) r0
            goto Lc
        Lb:
            r0 = 0
        Lc:
            if (r0 != 0) goto L17
            com.google.android.material.tabs.TabLayout$TabView r0 = new com.google.android.material.tabs.TabLayout$TabView
            android.content.Context r1 = r2.getContext()
            r0.<init>(r2, r1)
        L17:
            r0.setTab(r3)
            r1 = 1
            r0.setFocusable(r1)
            int r1 = r2.getTabMinWidth()
            r0.setMinimumWidth(r1)
            java.lang.CharSequence r1 = com.google.android.material.tabs.TabLayout.Tab.access$300(r3)
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 == 0) goto L37
            java.lang.CharSequence r3 = com.google.android.material.tabs.TabLayout.Tab.access$400(r3)
            r0.setContentDescription(r3)
            goto L3e
        L37:
            java.lang.CharSequence r3 = com.google.android.material.tabs.TabLayout.Tab.access$300(r3)
            r0.setContentDescription(r3)
        L3e:
            return r0
    }

    private void dispatchTabReselected(com.google.android.material.tabs.TabLayout.Tab r3) {
            r2 = this;
            java.util.ArrayList<com.google.android.material.tabs.TabLayout$BaseOnTabSelectedListener> r0 = r2.selectedListeners
            int r0 = r0.size()
            int r0 = r0 + (-1)
        L8:
            if (r0 < 0) goto L18
            java.util.ArrayList<com.google.android.material.tabs.TabLayout$BaseOnTabSelectedListener> r1 = r2.selectedListeners
            java.lang.Object r1 = r1.get(r0)
            com.google.android.material.tabs.TabLayout$BaseOnTabSelectedListener r1 = (com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener) r1
            r1.onTabReselected(r3)
            int r0 = r0 + (-1)
            goto L8
        L18:
            return
    }

    private void dispatchTabSelected(com.google.android.material.tabs.TabLayout.Tab r3) {
            r2 = this;
            java.util.ArrayList<com.google.android.material.tabs.TabLayout$BaseOnTabSelectedListener> r0 = r2.selectedListeners
            int r0 = r0.size()
            int r0 = r0 + (-1)
        L8:
            if (r0 < 0) goto L18
            java.util.ArrayList<com.google.android.material.tabs.TabLayout$BaseOnTabSelectedListener> r1 = r2.selectedListeners
            java.lang.Object r1 = r1.get(r0)
            com.google.android.material.tabs.TabLayout$BaseOnTabSelectedListener r1 = (com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener) r1
            r1.onTabSelected(r3)
            int r0 = r0 + (-1)
            goto L8
        L18:
            return
    }

    private void dispatchTabUnselected(com.google.android.material.tabs.TabLayout.Tab r3) {
            r2 = this;
            java.util.ArrayList<com.google.android.material.tabs.TabLayout$BaseOnTabSelectedListener> r0 = r2.selectedListeners
            int r0 = r0.size()
            int r0 = r0 + (-1)
        L8:
            if (r0 < 0) goto L18
            java.util.ArrayList<com.google.android.material.tabs.TabLayout$BaseOnTabSelectedListener> r1 = r2.selectedListeners
            java.lang.Object r1 = r1.get(r0)
            com.google.android.material.tabs.TabLayout$BaseOnTabSelectedListener r1 = (com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener) r1
            r1.onTabUnselected(r3)
            int r0 = r0 + (-1)
            goto L8
        L18:
            return
    }

    private void ensureScrollAnimator() {
            r3 = this;
            android.animation.ValueAnimator r0 = r3.scrollAnimator
            if (r0 != 0) goto L22
            android.animation.ValueAnimator r0 = new android.animation.ValueAnimator
            r0.<init>()
            r3.scrollAnimator = r0
            android.animation.TimeInterpolator r1 = r3.tabIndicatorTimeInterpolator
            r0.setInterpolator(r1)
            android.animation.ValueAnimator r0 = r3.scrollAnimator
            int r1 = r3.tabIndicatorAnimationDuration
            long r1 = (long) r1
            r0.setDuration(r1)
            android.animation.ValueAnimator r0 = r3.scrollAnimator
            com.google.android.material.tabs.TabLayout$1 r1 = new com.google.android.material.tabs.TabLayout$1
            r1.<init>(r3)
            r0.addUpdateListener(r1)
        L22:
            return
    }

    private int getDefaultHeight() {
            r4 = this;
            java.util.ArrayList<com.google.android.material.tabs.TabLayout$Tab> r0 = r4.tabs
            int r0 = r0.size()
            r1 = 0
        L7:
            if (r1 >= r0) goto L2d
            java.util.ArrayList<com.google.android.material.tabs.TabLayout$Tab> r2 = r4.tabs
            java.lang.Object r2 = r2.get(r1)
            com.google.android.material.tabs.TabLayout$Tab r2 = (com.google.android.material.tabs.TabLayout.Tab) r2
            if (r2 == 0) goto L2a
            android.graphics.drawable.Drawable r3 = r2.getIcon()
            if (r3 == 0) goto L2a
            java.lang.CharSequence r2 = r2.getText()
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            if (r2 != 0) goto L2a
            boolean r0 = r4.inlineLabel
            if (r0 != 0) goto L2d
            r0 = 72
            goto L2f
        L2a:
            int r1 = r1 + 1
            goto L7
        L2d:
            r0 = 48
        L2f:
            return r0
    }

    private int getTabMinWidth() {
            r2 = this;
            int r0 = r2.requestedTabMinWidth
            r1 = -1
            if (r0 == r1) goto L6
            return r0
        L6:
            int r0 = r2.mode
            if (r0 == 0) goto L10
            r1 = 2
            if (r0 != r1) goto Le
            goto L10
        Le:
            r0 = 0
            goto L12
        L10:
            int r0 = r2.scrollableTabMinWidth
        L12:
            return r0
    }

    private int getTabScrollRange() {
            r2 = this;
            com.google.android.material.tabs.TabLayout$SlidingTabIndicator r0 = r2.slidingTabIndicator
            int r0 = r0.getWidth()
            int r1 = r2.getWidth()
            int r0 = r0 - r1
            int r1 = r2.getPaddingLeft()
            int r0 = r0 - r1
            int r1 = r2.getPaddingRight()
            int r0 = r0 - r1
            r1 = 0
            int r0 = java.lang.Math.max(r1, r0)
            return r0
    }

    private boolean isScrollingEnabled() {
            r2 = this;
            int r0 = r2.getTabMode()
            if (r0 == 0) goto L10
            int r0 = r2.getTabMode()
            r1 = 2
            if (r0 != r1) goto Le
            goto L10
        Le:
            r0 = 0
            goto L11
        L10:
            r0 = 1
        L11:
            return r0
    }

    private void removeTabViewAt(int r3) {
            r2 = this;
            com.google.android.material.tabs.TabLayout$SlidingTabIndicator r0 = r2.slidingTabIndicator
            android.view.View r0 = r0.getChildAt(r3)
            com.google.android.material.tabs.TabLayout$TabView r0 = (com.google.android.material.tabs.TabLayout.TabView) r0
            com.google.android.material.tabs.TabLayout$SlidingTabIndicator r1 = r2.slidingTabIndicator
            r1.removeViewAt(r3)
            if (r0 == 0) goto L17
            r0.reset()
            androidx.core.util.Pools$Pool<com.google.android.material.tabs.TabLayout$TabView> r3 = r2.tabViewPool
            r3.release(r0)
        L17:
            r2.requestLayout()
            return
    }

    private void setSelectedTabView(int r7) {
            r6 = this;
            com.google.android.material.tabs.TabLayout$SlidingTabIndicator r0 = r6.slidingTabIndicator
            int r0 = r0.getChildCount()
            if (r7 >= r0) goto L4e
            r1 = 0
            r2 = r1
        La:
            if (r2 >= r0) goto L4e
            com.google.android.material.tabs.TabLayout$SlidingTabIndicator r3 = r6.slidingTabIndicator
            android.view.View r3 = r3.getChildAt(r2)
            r4 = 1
            if (r2 != r7) goto L1b
            boolean r5 = r3.isSelected()
            if (r5 == 0) goto L23
        L1b:
            if (r2 == r7) goto L3c
            boolean r5 = r3.isSelected()
            if (r5 == 0) goto L3c
        L23:
            if (r2 != r7) goto L27
            r5 = r4
            goto L28
        L27:
            r5 = r1
        L28:
            r3.setSelected(r5)
            if (r2 != r7) goto L2e
            goto L2f
        L2e:
            r4 = r1
        L2f:
            r3.setActivated(r4)
            boolean r4 = r3 instanceof com.google.android.material.tabs.TabLayout.TabView
            if (r4 == 0) goto L4b
            com.google.android.material.tabs.TabLayout$TabView r3 = (com.google.android.material.tabs.TabLayout.TabView) r3
            r3.updateTab()
            goto L4b
        L3c:
            if (r2 != r7) goto L40
            r5 = r4
            goto L41
        L40:
            r5 = r1
        L41:
            r3.setSelected(r5)
            if (r2 != r7) goto L47
            goto L48
        L47:
            r4 = r1
        L48:
            r3.setActivated(r4)
        L4b:
            int r2 = r2 + 1
            goto La
        L4e:
            return
    }

    private void setupWithViewPager(androidx.viewpager.widget.ViewPager r3, boolean r4, boolean r5) {
            r2 = this;
            androidx.viewpager.widget.ViewPager r0 = r2.viewPager
            if (r0 == 0) goto L14
            com.google.android.material.tabs.TabLayout$TabLayoutOnPageChangeListener r1 = r2.pageChangeListener
            if (r1 == 0) goto Lb
            r0.removeOnPageChangeListener(r1)
        Lb:
            com.google.android.material.tabs.TabLayout$AdapterChangeListener r0 = r2.adapterChangeListener
            if (r0 == 0) goto L14
            androidx.viewpager.widget.ViewPager r1 = r2.viewPager
            r1.removeOnAdapterChangeListener(r0)
        L14:
            com.google.android.material.tabs.TabLayout$BaseOnTabSelectedListener r0 = r2.currentVpSelectedListener
            r1 = 0
            if (r0 == 0) goto L1e
            r2.removeOnTabSelectedListener(r0)
            r2.currentVpSelectedListener = r1
        L1e:
            if (r3 == 0) goto L69
            r2.viewPager = r3
            com.google.android.material.tabs.TabLayout$TabLayoutOnPageChangeListener r0 = r2.pageChangeListener
            if (r0 != 0) goto L2d
            com.google.android.material.tabs.TabLayout$TabLayoutOnPageChangeListener r0 = new com.google.android.material.tabs.TabLayout$TabLayoutOnPageChangeListener
            r0.<init>(r2)
            r2.pageChangeListener = r0
        L2d:
            com.google.android.material.tabs.TabLayout$TabLayoutOnPageChangeListener r0 = r2.pageChangeListener
            r0.reset()
            com.google.android.material.tabs.TabLayout$TabLayoutOnPageChangeListener r0 = r2.pageChangeListener
            r3.addOnPageChangeListener(r0)
            com.google.android.material.tabs.TabLayout$ViewPagerOnTabSelectedListener r0 = new com.google.android.material.tabs.TabLayout$ViewPagerOnTabSelectedListener
            r0.<init>(r3)
            r2.currentVpSelectedListener = r0
            r2.addOnTabSelectedListener(r0)
            androidx.viewpager.widget.PagerAdapter r0 = r3.getAdapter()
            if (r0 == 0) goto L4a
            r2.setPagerAdapter(r0, r4)
        L4a:
            com.google.android.material.tabs.TabLayout$AdapterChangeListener r0 = r2.adapterChangeListener
            if (r0 != 0) goto L55
            com.google.android.material.tabs.TabLayout$AdapterChangeListener r0 = new com.google.android.material.tabs.TabLayout$AdapterChangeListener
            r0.<init>(r2)
            r2.adapterChangeListener = r0
        L55:
            com.google.android.material.tabs.TabLayout$AdapterChangeListener r0 = r2.adapterChangeListener
            r0.setAutoRefresh(r4)
            com.google.android.material.tabs.TabLayout$AdapterChangeListener r4 = r2.adapterChangeListener
            r3.addOnAdapterChangeListener(r4)
            int r3 = r3.getCurrentItem()
            r4 = 0
            r0 = 1
            r2.setScrollPosition(r3, r4, r0)
            goto L6f
        L69:
            r2.viewPager = r1
            r3 = 0
            r2.setPagerAdapter(r1, r3)
        L6f:
            r2.setupViewPagerImplicitly = r5
            return
    }

    private void updateAllTabs() {
            r3 = this;
            java.util.ArrayList<com.google.android.material.tabs.TabLayout$Tab> r0 = r3.tabs
            int r0 = r0.size()
            r1 = 0
        L7:
            if (r1 >= r0) goto L17
            java.util.ArrayList<com.google.android.material.tabs.TabLayout$Tab> r2 = r3.tabs
            java.lang.Object r2 = r2.get(r1)
            com.google.android.material.tabs.TabLayout$Tab r2 = (com.google.android.material.tabs.TabLayout.Tab) r2
            r2.updateView()
            int r1 = r1 + 1
            goto L7
        L17:
            return
    }

    private void updateTabViewLayoutParams(android.widget.LinearLayout.LayoutParams r3) {
            r2 = this;
            int r0 = r2.mode
            r1 = 1
            if (r0 != r1) goto L11
            int r0 = r2.tabGravity
            if (r0 != 0) goto L11
            r0 = 0
            r3.width = r0
            r0 = 1065353216(0x3f800000, float:1.0)
            r3.weight = r0
            goto L17
        L11:
            r0 = -2
            r3.width = r0
            r0 = 0
            r3.weight = r0
        L17:
            return
    }

    @java.lang.Deprecated
    public void addOnTabSelectedListener(com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener r2) {
            r1 = this;
            java.util.ArrayList<com.google.android.material.tabs.TabLayout$BaseOnTabSelectedListener> r0 = r1.selectedListeners
            boolean r0 = r0.contains(r2)
            if (r0 != 0) goto Ld
            java.util.ArrayList<com.google.android.material.tabs.TabLayout$BaseOnTabSelectedListener> r0 = r1.selectedListeners
            r0.add(r2)
        Ld:
            return
    }

    public void addOnTabSelectedListener(com.google.android.material.tabs.TabLayout.OnTabSelectedListener r1) {
            r0 = this;
            r0.addOnTabSelectedListener(r1)
            return
    }

    public void addTab(com.google.android.material.tabs.TabLayout.Tab r2) {
            r1 = this;
            java.util.ArrayList<com.google.android.material.tabs.TabLayout$Tab> r0 = r1.tabs
            boolean r0 = r0.isEmpty()
            r1.addTab(r2, r0)
            return
    }

    public void addTab(com.google.android.material.tabs.TabLayout.Tab r2, int r3) {
            r1 = this;
            java.util.ArrayList<com.google.android.material.tabs.TabLayout$Tab> r0 = r1.tabs
            boolean r0 = r0.isEmpty()
            r1.addTab(r2, r3, r0)
            return
    }

    public void addTab(com.google.android.material.tabs.TabLayout.Tab r2, int r3, boolean r4) {
            r1 = this;
            com.google.android.material.tabs.TabLayout r0 = r2.parent
            if (r0 != r1) goto L10
            r1.configureTab(r2, r3)
            r1.addTabView(r2)
            if (r4 == 0) goto Lf
            r2.select()
        Lf:
            return
        L10:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r3 = "Tab belongs to a different TabLayout."
            r2.<init>(r3)
            throw r2
    }

    public void addTab(com.google.android.material.tabs.TabLayout.Tab r2, boolean r3) {
            r1 = this;
            java.util.ArrayList<com.google.android.material.tabs.TabLayout$Tab> r0 = r1.tabs
            int r0 = r0.size()
            r1.addTab(r2, r0, r3)
            return
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public void addView(android.view.View r1) {
            r0 = this;
            r0.addViewInternal(r1)
            return
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public void addView(android.view.View r1, int r2) {
            r0 = this;
            r0.addViewInternal(r1)
            return
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public void addView(android.view.View r1, int r2, android.view.ViewGroup.LayoutParams r3) {
            r0 = this;
            r0.addViewInternal(r1)
            return
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup, android.view.ViewManager
    public void addView(android.view.View r1, android.view.ViewGroup.LayoutParams r2) {
            r0 = this;
            r0.addViewInternal(r1)
            return
    }

    public void clearOnTabSelectedListeners() {
            r1 = this;
            java.util.ArrayList<com.google.android.material.tabs.TabLayout$BaseOnTabSelectedListener> r0 = r1.selectedListeners
            r0.clear()
            return
    }

    protected com.google.android.material.tabs.TabLayout.Tab createTabFromPool() {
            r1 = this;
            androidx.core.util.Pools$Pool<com.google.android.material.tabs.TabLayout$Tab> r0 = com.google.android.material.tabs.TabLayout.tabPool
            java.lang.Object r0 = r0.acquire()
            com.google.android.material.tabs.TabLayout$Tab r0 = (com.google.android.material.tabs.TabLayout.Tab) r0
            if (r0 != 0) goto Lf
            com.google.android.material.tabs.TabLayout$Tab r0 = new com.google.android.material.tabs.TabLayout$Tab
            r0.<init>()
        Lf:
            return r0
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public /* bridge */ /* synthetic */ android.view.ViewGroup.LayoutParams generateLayoutParams(android.util.AttributeSet r1) {
            r0 = this;
            android.widget.FrameLayout$LayoutParams r1 = r0.generateLayoutParams(r1)
            return r1
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public android.widget.FrameLayout.LayoutParams generateLayoutParams(android.util.AttributeSet r1) {
            r0 = this;
            android.widget.FrameLayout$LayoutParams r1 = r0.generateDefaultLayoutParams()
            return r1
    }

    public int getSelectedTabPosition() {
            r1 = this;
            com.google.android.material.tabs.TabLayout$Tab r0 = r1.selectedTab
            if (r0 == 0) goto L9
            int r0 = r0.getPosition()
            goto La
        L9:
            r0 = -1
        La:
            return r0
    }

    public com.google.android.material.tabs.TabLayout.Tab getTabAt(int r2) {
            r1 = this;
            if (r2 < 0) goto L12
            int r0 = r1.getTabCount()
            if (r2 < r0) goto L9
            goto L12
        L9:
            java.util.ArrayList<com.google.android.material.tabs.TabLayout$Tab> r0 = r1.tabs
            java.lang.Object r2 = r0.get(r2)
            com.google.android.material.tabs.TabLayout$Tab r2 = (com.google.android.material.tabs.TabLayout.Tab) r2
            goto L13
        L12:
            r2 = 0
        L13:
            return r2
    }

    public int getTabCount() {
            r1 = this;
            java.util.ArrayList<com.google.android.material.tabs.TabLayout$Tab> r0 = r1.tabs
            int r0 = r0.size()
            return r0
    }

    public int getTabGravity() {
            r1 = this;
            int r0 = r1.tabGravity
            return r0
    }

    public android.content.res.ColorStateList getTabIconTint() {
            r1 = this;
            android.content.res.ColorStateList r0 = r1.tabIconTint
            return r0
    }

    public int getTabIndicatorAnimationMode() {
            r1 = this;
            int r0 = r1.tabIndicatorAnimationMode
            return r0
    }

    public int getTabIndicatorGravity() {
            r1 = this;
            int r0 = r1.tabIndicatorGravity
            return r0
    }

    int getTabMaxWidth() {
            r1 = this;
            int r0 = r1.tabMaxWidth
            return r0
    }

    public int getTabMode() {
            r1 = this;
            int r0 = r1.mode
            return r0
    }

    public android.content.res.ColorStateList getTabRippleColor() {
            r1 = this;
            android.content.res.ColorStateList r0 = r1.tabRippleColorStateList
            return r0
    }

    public android.graphics.drawable.Drawable getTabSelectedIndicator() {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.tabSelectedIndicator
            return r0
    }

    public android.content.res.ColorStateList getTabTextColors() {
            r1 = this;
            android.content.res.ColorStateList r0 = r1.tabTextColors
            return r0
    }

    public boolean hasUnboundedRipple() {
            r1 = this;
            boolean r0 = r1.unboundedRipple
            return r0
    }

    public boolean isInlineLabel() {
            r1 = this;
            boolean r0 = r1.inlineLabel
            return r0
    }

    public boolean isTabIndicatorFullWidth() {
            r1 = this;
            boolean r0 = r1.tabIndicatorFullWidth
            return r0
    }

    public com.google.android.material.tabs.TabLayout.Tab newTab() {
            r3 = this;
            com.google.android.material.tabs.TabLayout$Tab r0 = r3.createTabFromPool()
            r0.parent = r3
            com.google.android.material.tabs.TabLayout$TabView r1 = r3.createTabView(r0)
            r0.view = r1
            int r1 = com.google.android.material.tabs.TabLayout.Tab.access$000(r0)
            r2 = -1
            if (r1 == r2) goto L1c
            com.google.android.material.tabs.TabLayout$TabView r1 = r0.view
            int r2 = com.google.android.material.tabs.TabLayout.Tab.access$000(r0)
            r1.setId(r2)
        L1c:
            return r0
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
            r2 = this;
            super.onAttachedToWindow()
            com.google.android.material.shape.MaterialShapeUtils.setParentAbsoluteElevation(r2)
            androidx.viewpager.widget.ViewPager r0 = r2.viewPager
            if (r0 != 0) goto L18
            android.view.ViewParent r0 = r2.getParent()
            boolean r1 = r0 instanceof androidx.viewpager.widget.ViewPager
            if (r1 == 0) goto L18
            androidx.viewpager.widget.ViewPager r0 = (androidx.viewpager.widget.ViewPager) r0
            r1 = 1
            r2.setupWithViewPager(r0, r1, r1)
        L18:
            return
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
            r1 = this;
            super.onDetachedFromWindow()
            boolean r0 = r1.setupViewPagerImplicitly
            if (r0 == 0) goto Le
            r0 = 0
            r1.setupWithViewPager(r0)
            r0 = 0
            r1.setupViewPagerImplicitly = r0
        Le:
            return
    }

    @Override // android.view.View
    protected void onDraw(android.graphics.Canvas r4) {
            r3 = this;
            r0 = 0
        L1:
            com.google.android.material.tabs.TabLayout$SlidingTabIndicator r1 = r3.slidingTabIndicator
            int r1 = r1.getChildCount()
            if (r0 >= r1) goto L1b
            com.google.android.material.tabs.TabLayout$SlidingTabIndicator r1 = r3.slidingTabIndicator
            android.view.View r1 = r1.getChildAt(r0)
            boolean r2 = r1 instanceof com.google.android.material.tabs.TabLayout.TabView
            if (r2 == 0) goto L18
            com.google.android.material.tabs.TabLayout$TabView r1 = (com.google.android.material.tabs.TabLayout.TabView) r1
            com.google.android.material.tabs.TabLayout.TabView.access$500(r1, r4)
        L18:
            int r0 = r0 + 1
            goto L1
        L1b:
            super.onDraw(r4)
            return
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(android.view.accessibility.AccessibilityNodeInfo r4) {
            r3 = this;
            super.onInitializeAccessibilityNodeInfo(r4)
            androidx.core.view.accessibility.AccessibilityNodeInfoCompat r4 = androidx.core.view.accessibility.AccessibilityNodeInfoCompat.wrap(r4)
            int r0 = r3.getTabCount()
            r1 = 0
            r2 = 1
            androidx.core.view.accessibility.AccessibilityNodeInfoCompat$CollectionInfoCompat r0 = androidx.core.view.accessibility.AccessibilityNodeInfoCompat.CollectionInfoCompat.obtain(r2, r0, r1, r2)
            r4.setCollectionInfo(r0)
            return
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public boolean onInterceptTouchEvent(android.view.MotionEvent r2) {
            r1 = this;
            boolean r0 = r1.isScrollingEnabled()
            if (r0 == 0) goto Le
            boolean r2 = super.onInterceptTouchEvent(r2)
            if (r2 == 0) goto Le
            r2 = 1
            goto Lf
        Le:
            r2 = 0
        Lf:
            return r2
    }

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.View
    protected void onMeasure(int r7, int r8) {
            r6 = this;
            android.content.Context r0 = r6.getContext()
            int r1 = r6.getDefaultHeight()
            float r0 = com.google.android.material.internal.ViewUtils.dpToPx(r0, r1)
            int r0 = java.lang.Math.round(r0)
            int r1 = android.view.View.MeasureSpec.getMode(r8)
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = 0
            r4 = 1073741824(0x40000000, float:2.0)
            r5 = 1
            if (r1 == r2) goto L2e
            if (r1 == 0) goto L1f
            goto L41
        L1f:
            int r8 = r6.getPaddingTop()
            int r0 = r0 + r8
            int r8 = r6.getPaddingBottom()
            int r0 = r0 + r8
            int r8 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r4)
            goto L41
        L2e:
            int r1 = r6.getChildCount()
            if (r1 != r5) goto L41
            int r1 = android.view.View.MeasureSpec.getSize(r8)
            if (r1 < r0) goto L41
            android.view.View r1 = r6.getChildAt(r3)
            r1.setMinimumHeight(r0)
        L41:
            int r0 = android.view.View.MeasureSpec.getSize(r7)
            int r1 = android.view.View.MeasureSpec.getMode(r7)
            if (r1 == 0) goto L5f
            int r1 = r6.requestedTabMaxWidth
            if (r1 <= 0) goto L50
            goto L5d
        L50:
            float r0 = (float) r0
            android.content.Context r1 = r6.getContext()
            r2 = 56
            float r1 = com.google.android.material.internal.ViewUtils.dpToPx(r1, r2)
            float r0 = r0 - r1
            int r1 = (int) r0
        L5d:
            r6.tabMaxWidth = r1
        L5f:
            super.onMeasure(r7, r8)
            int r7 = r6.getChildCount()
            if (r7 != r5) goto La9
            android.view.View r7 = r6.getChildAt(r3)
            int r0 = r6.mode
            if (r0 == 0) goto L81
            if (r0 == r5) goto L76
            r1 = 2
            if (r0 == r1) goto L81
            goto La9
        L76:
            int r0 = r7.getMeasuredWidth()
            int r1 = r6.getMeasuredWidth()
            if (r0 == r1) goto La9
            goto L8b
        L81:
            int r0 = r7.getMeasuredWidth()
            int r1 = r6.getMeasuredWidth()
            if (r0 >= r1) goto La9
        L8b:
            int r0 = r6.getPaddingTop()
            int r1 = r6.getPaddingBottom()
            int r0 = r0 + r1
            android.view.ViewGroup$LayoutParams r1 = r7.getLayoutParams()
            int r1 = r1.height
            int r8 = getChildMeasureSpec(r8, r0, r1)
            int r0 = r6.getMeasuredWidth()
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r4)
            r7.measure(r0, r8)
        La9:
            return
    }

    @Override // android.widget.HorizontalScrollView, android.view.View
    public boolean onTouchEvent(android.view.MotionEvent r3) {
            r2 = this;
            int r0 = r3.getActionMasked()
            r1 = 8
            if (r0 != r1) goto L10
            boolean r0 = r2.isScrollingEnabled()
            if (r0 != 0) goto L10
            r3 = 0
            return r3
        L10:
            boolean r3 = super.onTouchEvent(r3)
            return r3
    }

    void populateFromPagerAdapter() {
            r5 = this;
            r5.removeAllTabs()
            androidx.viewpager.widget.PagerAdapter r0 = r5.pagerAdapter
            if (r0 == 0) goto L40
            int r0 = r0.getCount()
            r1 = 0
            r2 = r1
        Ld:
            if (r2 >= r0) goto L23
            com.google.android.material.tabs.TabLayout$Tab r3 = r5.newTab()
            androidx.viewpager.widget.PagerAdapter r4 = r5.pagerAdapter
            java.lang.CharSequence r4 = r4.getPageTitle(r2)
            com.google.android.material.tabs.TabLayout$Tab r3 = r3.setText(r4)
            r5.addTab(r3, r1)
            int r2 = r2 + 1
            goto Ld
        L23:
            androidx.viewpager.widget.ViewPager r1 = r5.viewPager
            if (r1 == 0) goto L40
            if (r0 <= 0) goto L40
            int r0 = r1.getCurrentItem()
            int r1 = r5.getSelectedTabPosition()
            if (r0 == r1) goto L40
            int r1 = r5.getTabCount()
            if (r0 >= r1) goto L40
            com.google.android.material.tabs.TabLayout$Tab r0 = r5.getTabAt(r0)
            r5.selectTab(r0)
        L40:
            return
    }

    protected boolean releaseFromTabPool(com.google.android.material.tabs.TabLayout.Tab r2) {
            r1 = this;
            androidx.core.util.Pools$Pool<com.google.android.material.tabs.TabLayout$Tab> r0 = com.google.android.material.tabs.TabLayout.tabPool
            boolean r2 = r0.release(r2)
            return r2
    }

    public void removeAllTabs() {
            r2 = this;
            com.google.android.material.tabs.TabLayout$SlidingTabIndicator r0 = r2.slidingTabIndicator
            int r0 = r0.getChildCount()
            int r0 = r0 + (-1)
        L8:
            if (r0 < 0) goto L10
            r2.removeTabViewAt(r0)
            int r0 = r0 + (-1)
            goto L8
        L10:
            java.util.ArrayList<com.google.android.material.tabs.TabLayout$Tab> r0 = r2.tabs
            java.util.Iterator r0 = r0.iterator()
        L16:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L2c
            java.lang.Object r1 = r0.next()
            com.google.android.material.tabs.TabLayout$Tab r1 = (com.google.android.material.tabs.TabLayout.Tab) r1
            r0.remove()
            r1.reset()
            r2.releaseFromTabPool(r1)
            goto L16
        L2c:
            r0 = 0
            r2.selectedTab = r0
            return
    }

    @java.lang.Deprecated
    public void removeOnTabSelectedListener(com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener r2) {
            r1 = this;
            java.util.ArrayList<com.google.android.material.tabs.TabLayout$BaseOnTabSelectedListener> r0 = r1.selectedListeners
            r0.remove(r2)
            return
    }

    public void removeOnTabSelectedListener(com.google.android.material.tabs.TabLayout.OnTabSelectedListener r1) {
            r0 = this;
            r0.removeOnTabSelectedListener(r1)
            return
    }

    public void removeTab(com.google.android.material.tabs.TabLayout.Tab r2) {
            r1 = this;
            com.google.android.material.tabs.TabLayout r0 = r2.parent
            if (r0 != r1) goto Lc
            int r2 = r2.getPosition()
            r1.removeTabAt(r2)
            return
        Lc:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Tab does not belong to this TabLayout."
            r2.<init>(r0)
            throw r2
    }

    public void removeTabAt(int r8) {
            r7 = this;
            com.google.android.material.tabs.TabLayout$Tab r0 = r7.selectedTab
            r1 = 0
            if (r0 == 0) goto La
            int r0 = r0.getPosition()
            goto Lb
        La:
            r0 = r1
        Lb:
            r7.removeTabViewAt(r8)
            java.util.ArrayList<com.google.android.material.tabs.TabLayout$Tab> r2 = r7.tabs
            java.lang.Object r2 = r2.remove(r8)
            com.google.android.material.tabs.TabLayout$Tab r2 = (com.google.android.material.tabs.TabLayout.Tab) r2
            if (r2 == 0) goto L1e
            r2.reset()
            r7.releaseFromTabPool(r2)
        L1e:
            java.util.ArrayList<com.google.android.material.tabs.TabLayout$Tab> r2 = r7.tabs
            int r2 = r2.size()
            r3 = -1
            r4 = r8
        L26:
            if (r4 >= r2) goto L47
            java.util.ArrayList<com.google.android.material.tabs.TabLayout$Tab> r5 = r7.tabs
            java.lang.Object r5 = r5.get(r4)
            com.google.android.material.tabs.TabLayout$Tab r5 = (com.google.android.material.tabs.TabLayout.Tab) r5
            int r5 = r5.getPosition()
            int r6 = r7.indicatorPosition
            if (r5 != r6) goto L39
            r3 = r4
        L39:
            java.util.ArrayList<com.google.android.material.tabs.TabLayout$Tab> r5 = r7.tabs
            java.lang.Object r5 = r5.get(r4)
            com.google.android.material.tabs.TabLayout$Tab r5 = (com.google.android.material.tabs.TabLayout.Tab) r5
            r5.setPosition(r4)
            int r4 = r4 + 1
            goto L26
        L47:
            r7.indicatorPosition = r3
            if (r0 != r8) goto L66
            java.util.ArrayList<com.google.android.material.tabs.TabLayout$Tab> r0 = r7.tabs
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L55
            r8 = 0
            goto L63
        L55:
            java.util.ArrayList<com.google.android.material.tabs.TabLayout$Tab> r0 = r7.tabs
            int r8 = r8 + (-1)
            int r8 = java.lang.Math.max(r1, r8)
            java.lang.Object r8 = r0.get(r8)
            com.google.android.material.tabs.TabLayout$Tab r8 = (com.google.android.material.tabs.TabLayout.Tab) r8
        L63:
            r7.selectTab(r8)
        L66:
            return
    }

    public void selectTab(com.google.android.material.tabs.TabLayout.Tab r2) {
            r1 = this;
            r0 = 1
            r1.selectTab(r2, r0)
            return
    }

    public void selectTab(com.google.android.material.tabs.TabLayout.Tab r5, boolean r6) {
            r4 = this;
            com.google.android.material.tabs.TabLayout$Tab r0 = r4.selectedTab
            if (r0 != r5) goto L11
            if (r0 == 0) goto L44
            r4.dispatchTabReselected(r5)
            int r5 = r5.getPosition()
            r4.animateToTab(r5)
            goto L44
        L11:
            r1 = -1
            if (r5 == 0) goto L19
            int r2 = r5.getPosition()
            goto L1a
        L19:
            r2 = r1
        L1a:
            if (r6 == 0) goto L34
            if (r0 == 0) goto L24
            int r6 = r0.getPosition()
            if (r6 != r1) goto L2c
        L24:
            if (r2 == r1) goto L2c
            r6 = 0
            r3 = 1
            r4.setScrollPosition(r2, r6, r3)
            goto L2f
        L2c:
            r4.animateToTab(r2)
        L2f:
            if (r2 == r1) goto L34
            r4.setSelectedTabView(r2)
        L34:
            r4.selectedTab = r5
            if (r0 == 0) goto L3f
            com.google.android.material.tabs.TabLayout r6 = r0.parent
            if (r6 == 0) goto L3f
            r4.dispatchTabUnselected(r0)
        L3f:
            if (r5 == 0) goto L44
            r4.dispatchTabSelected(r5)
        L44:
            return
    }

    @Override // android.view.View
    public void setElevation(float r1) {
            r0 = this;
            super.setElevation(r1)
            com.google.android.material.shape.MaterialShapeUtils.setElevation(r0, r1)
            return
    }

    public void setInlineLabel(boolean r3) {
            r2 = this;
            boolean r0 = r2.inlineLabel
            if (r0 == r3) goto L24
            r2.inlineLabel = r3
            r3 = 0
        L7:
            com.google.android.material.tabs.TabLayout$SlidingTabIndicator r0 = r2.slidingTabIndicator
            int r0 = r0.getChildCount()
            if (r3 >= r0) goto L21
            com.google.android.material.tabs.TabLayout$SlidingTabIndicator r0 = r2.slidingTabIndicator
            android.view.View r0 = r0.getChildAt(r3)
            boolean r1 = r0 instanceof com.google.android.material.tabs.TabLayout.TabView
            if (r1 == 0) goto L1e
            com.google.android.material.tabs.TabLayout$TabView r0 = (com.google.android.material.tabs.TabLayout.TabView) r0
            r0.updateOrientation()
        L1e:
            int r3 = r3 + 1
            goto L7
        L21:
            r2.applyModeAndGravity()
        L24:
            return
    }

    public void setInlineLabelResource(int r2) {
            r1 = this;
            android.content.res.Resources r0 = r1.getResources()
            boolean r2 = r0.getBoolean(r2)
            r1.setInlineLabel(r2)
            return
    }

    @java.lang.Deprecated
    public void setOnTabSelectedListener(com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener r2) {
            r1 = this;
            com.google.android.material.tabs.TabLayout$BaseOnTabSelectedListener r0 = r1.selectedListener
            if (r0 == 0) goto L7
            r1.removeOnTabSelectedListener(r0)
        L7:
            r1.selectedListener = r2
            if (r2 == 0) goto Le
            r1.addOnTabSelectedListener(r2)
        Le:
            return
    }

    @java.lang.Deprecated
    public void setOnTabSelectedListener(com.google.android.material.tabs.TabLayout.OnTabSelectedListener r1) {
            r0 = this;
            r0.setOnTabSelectedListener(r1)
            return
    }

    void setPagerAdapter(androidx.viewpager.widget.PagerAdapter r3, boolean r4) {
            r2 = this;
            androidx.viewpager.widget.PagerAdapter r0 = r2.pagerAdapter
            if (r0 == 0) goto Lb
            android.database.DataSetObserver r1 = r2.pagerAdapterObserver
            if (r1 == 0) goto Lb
            r0.unregisterDataSetObserver(r1)
        Lb:
            r2.pagerAdapter = r3
            if (r4 == 0) goto L21
            if (r3 == 0) goto L21
            android.database.DataSetObserver r4 = r2.pagerAdapterObserver
            if (r4 != 0) goto L1c
            com.google.android.material.tabs.TabLayout$PagerAdapterObserver r4 = new com.google.android.material.tabs.TabLayout$PagerAdapterObserver
            r4.<init>(r2)
            r2.pagerAdapterObserver = r4
        L1c:
            android.database.DataSetObserver r4 = r2.pagerAdapterObserver
            r3.registerDataSetObserver(r4)
        L21:
            r2.populateFromPagerAdapter()
            return
    }

    void setScrollAnimatorListener(android.animation.Animator.AnimatorListener r2) {
            r1 = this;
            r1.ensureScrollAnimator()
            android.animation.ValueAnimator r0 = r1.scrollAnimator
            r0.addListener(r2)
            return
    }

    public void setScrollPosition(int r2, float r3, boolean r4) {
            r1 = this;
            r0 = 1
            r1.setScrollPosition(r2, r3, r4, r0)
            return
    }

    public void setScrollPosition(int r7, float r8, boolean r9, boolean r10) {
            r6 = this;
            r5 = 1
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            r0.setScrollPosition(r1, r2, r3, r4, r5)
            return
    }

    void setScrollPosition(int r6, float r7, boolean r8, boolean r9, boolean r10) {
            r5 = this;
            float r0 = (float) r6
            float r0 = r0 + r7
            int r0 = java.lang.Math.round(r0)
            if (r0 < 0) goto L7d
            com.google.android.material.tabs.TabLayout$SlidingTabIndicator r1 = r5.slidingTabIndicator
            int r1 = r1.getChildCount()
            if (r0 < r1) goto L12
            goto L7d
        L12:
            if (r9 == 0) goto L19
            com.google.android.material.tabs.TabLayout$SlidingTabIndicator r9 = r5.slidingTabIndicator
            r9.setIndicatorPositionFromTabPosition(r6, r7)
        L19:
            android.animation.ValueAnimator r9 = r5.scrollAnimator
            if (r9 == 0) goto L28
            boolean r9 = r9.isRunning()
            if (r9 == 0) goto L28
            android.animation.ValueAnimator r9 = r5.scrollAnimator
            r9.cancel()
        L28:
            int r7 = r5.calculateScrollXForTab(r6, r7)
            int r9 = r5.getScrollX()
            int r1 = r5.getSelectedTabPosition()
            r2 = 0
            r3 = 1
            if (r6 >= r1) goto L3a
            if (r7 >= r9) goto L48
        L3a:
            int r1 = r5.getSelectedTabPosition()
            if (r6 <= r1) goto L42
            if (r7 <= r9) goto L48
        L42:
            int r1 = r5.getSelectedTabPosition()
            if (r6 != r1) goto L4a
        L48:
            r1 = r3
            goto L4b
        L4a:
            r1 = r2
        L4b:
            int r4 = androidx.core.view.ViewCompat.getLayoutDirection(r5)
            if (r4 != r3) goto L6a
            int r1 = r5.getSelectedTabPosition()
            if (r6 >= r1) goto L59
            if (r7 <= r9) goto L67
        L59:
            int r1 = r5.getSelectedTabPosition()
            if (r6 <= r1) goto L61
            if (r7 >= r9) goto L67
        L61:
            int r9 = r5.getSelectedTabPosition()
            if (r6 != r9) goto L69
        L67:
            r1 = r3
            goto L6a
        L69:
            r1 = r2
        L6a:
            if (r1 != 0) goto L72
            int r9 = r5.viewPagerScrollState
            if (r9 == r3) goto L72
            if (r10 == 0) goto L78
        L72:
            if (r6 >= 0) goto L75
            r7 = r2
        L75:
            r5.scrollTo(r7, r2)
        L78:
            if (r8 == 0) goto L7d
            r5.setSelectedTabView(r0)
        L7d:
            return
    }

    public void setSelectedTabIndicator(int r2) {
            r1 = this;
            if (r2 == 0) goto Le
            android.content.Context r0 = r1.getContext()
            android.graphics.drawable.Drawable r2 = androidx.appcompat.content.res.AppCompatResources.getDrawable(r0, r2)
            r1.setSelectedTabIndicator(r2)
            goto L12
        Le:
            r2 = 0
            r1.setSelectedTabIndicator(r2)
        L12:
            return
    }

    public void setSelectedTabIndicator(android.graphics.drawable.Drawable r2) {
            r1 = this;
            if (r2 != 0) goto L7
            android.graphics.drawable.GradientDrawable r2 = new android.graphics.drawable.GradientDrawable
            r2.<init>()
        L7:
            android.graphics.drawable.Drawable r2 = androidx.core.graphics.drawable.DrawableCompat.wrap(r2)
            android.graphics.drawable.Drawable r2 = r2.mutate()
            r1.tabSelectedIndicator = r2
            int r0 = r1.tabSelectedIndicatorColor
            com.google.android.material.drawable.DrawableUtils.setTint(r2, r0)
            int r2 = r1.tabIndicatorHeight
            r0 = -1
            if (r2 != r0) goto L21
            android.graphics.drawable.Drawable r2 = r1.tabSelectedIndicator
            int r2 = r2.getIntrinsicHeight()
        L21:
            com.google.android.material.tabs.TabLayout$SlidingTabIndicator r0 = r1.slidingTabIndicator
            r0.setSelectedIndicatorHeight(r2)
            return
    }

    public void setSelectedTabIndicatorColor(int r2) {
            r1 = this;
            r1.tabSelectedIndicatorColor = r2
            android.graphics.drawable.Drawable r0 = r1.tabSelectedIndicator
            com.google.android.material.drawable.DrawableUtils.setTint(r0, r2)
            r2 = 0
            r1.updateTabViews(r2)
            return
    }

    public void setSelectedTabIndicatorGravity(int r2) {
            r1 = this;
            int r0 = r1.tabIndicatorGravity
            if (r0 == r2) goto Lb
            r1.tabIndicatorGravity = r2
            com.google.android.material.tabs.TabLayout$SlidingTabIndicator r2 = r1.slidingTabIndicator
            androidx.core.view.ViewCompat.postInvalidateOnAnimation(r2)
        Lb:
            return
    }

    @java.lang.Deprecated
    public void setSelectedTabIndicatorHeight(int r2) {
            r1 = this;
            r1.tabIndicatorHeight = r2
            com.google.android.material.tabs.TabLayout$SlidingTabIndicator r0 = r1.slidingTabIndicator
            r0.setSelectedIndicatorHeight(r2)
            return
    }

    public void setTabGravity(int r2) {
            r1 = this;
            int r0 = r1.tabGravity
            if (r0 == r2) goto L9
            r1.tabGravity = r2
            r1.applyModeAndGravity()
        L9:
            return
    }

    public void setTabIconTint(android.content.res.ColorStateList r2) {
            r1 = this;
            android.content.res.ColorStateList r0 = r1.tabIconTint
            if (r0 == r2) goto L9
            r1.tabIconTint = r2
            r1.updateAllTabs()
        L9:
            return
    }

    public void setTabIconTintResource(int r2) {
            r1 = this;
            android.content.Context r0 = r1.getContext()
            android.content.res.ColorStateList r2 = androidx.appcompat.content.res.AppCompatResources.getColorStateList(r0, r2)
            r1.setTabIconTint(r2)
            return
    }

    public void setTabIndicatorAnimationMode(int r3) {
            r2 = this;
            r2.tabIndicatorAnimationMode = r3
            if (r3 == 0) goto L33
            r0 = 1
            if (r3 == r0) goto L2b
            r0 = 2
            if (r3 != r0) goto L12
            com.google.android.material.tabs.FadeTabIndicatorInterpolator r3 = new com.google.android.material.tabs.FadeTabIndicatorInterpolator
            r3.<init>()
            r2.tabIndicatorInterpolator = r3
            goto L3a
        L12:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.StringBuilder r3 = r1.append(r3)
            java.lang.String r1 = " is not a valid TabIndicatorAnimationMode"
            java.lang.StringBuilder r3 = r3.append(r1)
            java.lang.String r3 = r3.toString()
            r0.<init>(r3)
            throw r0
        L2b:
            com.google.android.material.tabs.ElasticTabIndicatorInterpolator r3 = new com.google.android.material.tabs.ElasticTabIndicatorInterpolator
            r3.<init>()
            r2.tabIndicatorInterpolator = r3
            goto L3a
        L33:
            com.google.android.material.tabs.TabIndicatorInterpolator r3 = new com.google.android.material.tabs.TabIndicatorInterpolator
            r3.<init>()
            r2.tabIndicatorInterpolator = r3
        L3a:
            return
    }

    public void setTabIndicatorFullWidth(boolean r1) {
            r0 = this;
            r0.tabIndicatorFullWidth = r1
            com.google.android.material.tabs.TabLayout$SlidingTabIndicator r1 = r0.slidingTabIndicator
            com.google.android.material.tabs.TabLayout.SlidingTabIndicator.access$100(r1)
            com.google.android.material.tabs.TabLayout$SlidingTabIndicator r1 = r0.slidingTabIndicator
            androidx.core.view.ViewCompat.postInvalidateOnAnimation(r1)
            return
    }

    public void setTabMode(int r2) {
            r1 = this;
            int r0 = r1.mode
            if (r2 == r0) goto L9
            r1.mode = r2
            r1.applyModeAndGravity()
        L9:
            return
    }

    public void setTabRippleColor(android.content.res.ColorStateList r3) {
            r2 = this;
            android.content.res.ColorStateList r0 = r2.tabRippleColorStateList
            if (r0 == r3) goto L25
            r2.tabRippleColorStateList = r3
            r3 = 0
        L7:
            com.google.android.material.tabs.TabLayout$SlidingTabIndicator r0 = r2.slidingTabIndicator
            int r0 = r0.getChildCount()
            if (r3 >= r0) goto L25
            com.google.android.material.tabs.TabLayout$SlidingTabIndicator r0 = r2.slidingTabIndicator
            android.view.View r0 = r0.getChildAt(r3)
            boolean r1 = r0 instanceof com.google.android.material.tabs.TabLayout.TabView
            if (r1 == 0) goto L22
            com.google.android.material.tabs.TabLayout$TabView r0 = (com.google.android.material.tabs.TabLayout.TabView) r0
            android.content.Context r1 = r2.getContext()
            com.google.android.material.tabs.TabLayout.TabView.access$200(r0, r1)
        L22:
            int r3 = r3 + 1
            goto L7
        L25:
            return
    }

    public void setTabRippleColorResource(int r2) {
            r1 = this;
            android.content.Context r0 = r1.getContext()
            android.content.res.ColorStateList r2 = androidx.appcompat.content.res.AppCompatResources.getColorStateList(r0, r2)
            r1.setTabRippleColor(r2)
            return
    }

    public void setTabTextColors(int r1, int r2) {
            r0 = this;
            android.content.res.ColorStateList r1 = createColorStateList(r1, r2)
            r0.setTabTextColors(r1)
            return
    }

    public void setTabTextColors(android.content.res.ColorStateList r2) {
            r1 = this;
            android.content.res.ColorStateList r0 = r1.tabTextColors
            if (r0 == r2) goto L9
            r1.tabTextColors = r2
            r1.updateAllTabs()
        L9:
            return
    }

    @java.lang.Deprecated
    public void setTabsFromPagerAdapter(androidx.viewpager.widget.PagerAdapter r2) {
            r1 = this;
            r0 = 0
            r1.setPagerAdapter(r2, r0)
            return
    }

    public void setUnboundedRipple(boolean r3) {
            r2 = this;
            boolean r0 = r2.unboundedRipple
            if (r0 == r3) goto L25
            r2.unboundedRipple = r3
            r3 = 0
        L7:
            com.google.android.material.tabs.TabLayout$SlidingTabIndicator r0 = r2.slidingTabIndicator
            int r0 = r0.getChildCount()
            if (r3 >= r0) goto L25
            com.google.android.material.tabs.TabLayout$SlidingTabIndicator r0 = r2.slidingTabIndicator
            android.view.View r0 = r0.getChildAt(r3)
            boolean r1 = r0 instanceof com.google.android.material.tabs.TabLayout.TabView
            if (r1 == 0) goto L22
            com.google.android.material.tabs.TabLayout$TabView r0 = (com.google.android.material.tabs.TabLayout.TabView) r0
            android.content.Context r1 = r2.getContext()
            com.google.android.material.tabs.TabLayout.TabView.access$200(r0, r1)
        L22:
            int r3 = r3 + 1
            goto L7
        L25:
            return
    }

    public void setUnboundedRippleResource(int r2) {
            r1 = this;
            android.content.res.Resources r0 = r1.getResources()
            boolean r2 = r0.getBoolean(r2)
            r1.setUnboundedRipple(r2)
            return
    }

    public void setupWithViewPager(androidx.viewpager.widget.ViewPager r2) {
            r1 = this;
            r0 = 1
            r1.setupWithViewPager(r2, r0)
            return
    }

    public void setupWithViewPager(androidx.viewpager.widget.ViewPager r2, boolean r3) {
            r1 = this;
            r0 = 0
            r1.setupWithViewPager(r2, r3, r0)
            return
    }

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
            r1 = this;
            int r0 = r1.getTabScrollRange()
            if (r0 <= 0) goto L8
            r0 = 1
            goto L9
        L8:
            r0 = 0
        L9:
            return r0
    }

    void updateTabViews(boolean r4) {
            r3 = this;
            r0 = 0
        L1:
            com.google.android.material.tabs.TabLayout$SlidingTabIndicator r1 = r3.slidingTabIndicator
            int r1 = r1.getChildCount()
            if (r0 >= r1) goto L27
            com.google.android.material.tabs.TabLayout$SlidingTabIndicator r1 = r3.slidingTabIndicator
            android.view.View r1 = r1.getChildAt(r0)
            int r2 = r3.getTabMinWidth()
            r1.setMinimumWidth(r2)
            android.view.ViewGroup$LayoutParams r2 = r1.getLayoutParams()
            android.widget.LinearLayout$LayoutParams r2 = (android.widget.LinearLayout.LayoutParams) r2
            r3.updateTabViewLayoutParams(r2)
            if (r4 == 0) goto L24
            r1.requestLayout()
        L24:
            int r0 = r0 + 1
            goto L1
        L27:
            return
    }

    void updateViewPagerScrollState(int r1) {
            r0 = this;
            r0.viewPagerScrollState = r1
            return
    }
}
