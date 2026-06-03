package com.google.android.material.navigationrail;

/* JADX INFO: loaded from: classes.dex */
public class NavigationRailView extends com.google.android.material.navigation.NavigationBarView {
    private static final int DEFAULT_HEADER_GRAVITY = 49;
    static final int DEFAULT_MENU_GRAVITY = 49;
    static final int MAX_ITEM_COUNT = 7;
    static final int NO_ITEM_MINIMUM_HEIGHT = -1;
    private android.view.View headerView;
    private java.lang.Boolean paddingBottomSystemWindowInsets;
    private java.lang.Boolean paddingStartSystemWindowInsets;
    private java.lang.Boolean paddingTopSystemWindowInsets;
    private final int topMargin;


    public NavigationRailView(android.content.Context r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0)
            return
    }

    public NavigationRailView(android.content.Context r2, android.util.AttributeSet r3) {
            r1 = this;
            int r0 = com.google.android.material.R.attr.navigationRailStyle
            r1.<init>(r2, r3, r0)
            return
    }

    public NavigationRailView(android.content.Context r2, android.util.AttributeSet r3, int r4) {
            r1 = this;
            int r0 = com.google.android.material.R.style.Widget_MaterialComponents_NavigationRailView
            r1.<init>(r2, r3, r4, r0)
            return
    }

    public NavigationRailView(android.content.Context r8, android.util.AttributeSet r9, int r10, int r11) {
            r7 = this;
            r7.<init>(r8, r9, r10, r11)
            r8 = 0
            r7.paddingTopSystemWindowInsets = r8
            r7.paddingBottomSystemWindowInsets = r8
            r7.paddingStartSystemWindowInsets = r8
            android.content.res.Resources r8 = r7.getResources()
            int r0 = com.google.android.material.R.dimen.mtrl_navigation_rail_margin
            int r8 = r8.getDimensionPixelSize(r0)
            r7.topMargin = r8
            android.content.Context r8 = r7.getContext()
            int[] r2 = com.google.android.material.R.styleable.NavigationRailView
            r6 = 0
            int[] r5 = new int[r6]
            r0 = r8
            r1 = r9
            r3 = r10
            r4 = r11
            androidx.appcompat.widget.TintTypedArray r9 = com.google.android.material.internal.ThemeEnforcement.obtainTintedStyledAttributes(r0, r1, r2, r3, r4, r5)
            int r10 = com.google.android.material.R.styleable.NavigationRailView_headerLayout
            int r10 = r9.getResourceId(r10, r6)
            if (r10 == 0) goto L32
            r7.addHeaderView(r10)
        L32:
            int r10 = com.google.android.material.R.styleable.NavigationRailView_menuGravity
            r11 = 49
            int r10 = r9.getInt(r10, r11)
            r7.setMenuGravity(r10)
            int r10 = com.google.android.material.R.styleable.NavigationRailView_itemMinHeight
            boolean r10 = r9.hasValue(r10)
            if (r10 == 0) goto L4f
            int r10 = com.google.android.material.R.styleable.NavigationRailView_itemMinHeight
            r11 = -1
            int r10 = r9.getDimensionPixelSize(r10, r11)
            r7.setItemMinimumHeight(r10)
        L4f:
            int r10 = com.google.android.material.R.styleable.NavigationRailView_paddingTopSystemWindowInsets
            boolean r10 = r9.hasValue(r10)
            if (r10 == 0) goto L63
            int r10 = com.google.android.material.R.styleable.NavigationRailView_paddingTopSystemWindowInsets
            boolean r10 = r9.getBoolean(r10, r6)
            java.lang.Boolean r10 = java.lang.Boolean.valueOf(r10)
            r7.paddingTopSystemWindowInsets = r10
        L63:
            int r10 = com.google.android.material.R.styleable.NavigationRailView_paddingBottomSystemWindowInsets
            boolean r10 = r9.hasValue(r10)
            if (r10 == 0) goto L77
            int r10 = com.google.android.material.R.styleable.NavigationRailView_paddingBottomSystemWindowInsets
            boolean r10 = r9.getBoolean(r10, r6)
            java.lang.Boolean r10 = java.lang.Boolean.valueOf(r10)
            r7.paddingBottomSystemWindowInsets = r10
        L77:
            int r10 = com.google.android.material.R.styleable.NavigationRailView_paddingStartSystemWindowInsets
            boolean r10 = r9.hasValue(r10)
            if (r10 == 0) goto L8b
            int r10 = com.google.android.material.R.styleable.NavigationRailView_paddingStartSystemWindowInsets
            boolean r10 = r9.getBoolean(r10, r6)
            java.lang.Boolean r10 = java.lang.Boolean.valueOf(r10)
            r7.paddingStartSystemWindowInsets = r10
        L8b:
            android.content.res.Resources r10 = r7.getResources()
            int r11 = com.google.android.material.R.dimen.m3_navigation_rail_item_padding_top_with_large_font
            int r10 = r10.getDimensionPixelOffset(r11)
            android.content.res.Resources r11 = r7.getResources()
            int r0 = com.google.android.material.R.dimen.m3_navigation_rail_item_padding_bottom_with_large_font
            int r11 = r11.getDimensionPixelOffset(r0)
            float r8 = com.google.android.material.resources.MaterialResources.getFontScale(r8)
            r0 = 1065353216(0x3f800000, float:1.0)
            float r8 = r8 - r0
            r1 = 0
            r2 = 1050253722(0x3e99999a, float:0.3)
            float r8 = com.google.android.material.animation.AnimationUtils.lerp(r1, r0, r2, r0, r8)
            int r0 = r7.getItemPaddingTop()
            int r10 = com.google.android.material.animation.AnimationUtils.lerp(r0, r10, r8)
            float r10 = (float) r10
            int r0 = r7.getItemPaddingBottom()
            int r8 = com.google.android.material.animation.AnimationUtils.lerp(r0, r11, r8)
            float r8 = (float) r8
            int r10 = java.lang.Math.round(r10)
            r7.setItemPaddingTop(r10)
            int r8 = java.lang.Math.round(r8)
            r7.setItemPaddingBottom(r8)
            r9.recycle()
            r7.applyWindowInsets()
            return
    }

    static /* synthetic */ java.lang.Boolean access$000(com.google.android.material.navigationrail.NavigationRailView r0) {
            java.lang.Boolean r0 = r0.paddingTopSystemWindowInsets
            return r0
    }

    static /* synthetic */ boolean access$100(com.google.android.material.navigationrail.NavigationRailView r0, java.lang.Boolean r1) {
            boolean r0 = r0.shouldApplyWindowInsetPadding(r1)
            return r0
    }

    static /* synthetic */ java.lang.Boolean access$200(com.google.android.material.navigationrail.NavigationRailView r0) {
            java.lang.Boolean r0 = r0.paddingBottomSystemWindowInsets
            return r0
    }

    static /* synthetic */ java.lang.Boolean access$300(com.google.android.material.navigationrail.NavigationRailView r0) {
            java.lang.Boolean r0 = r0.paddingStartSystemWindowInsets
            return r0
    }

    private void applyWindowInsets() {
            r1 = this;
            com.google.android.material.navigationrail.NavigationRailView$1 r0 = new com.google.android.material.navigationrail.NavigationRailView$1
            r0.<init>(r1)
            com.google.android.material.internal.ViewUtils.doOnApplyWindowInsets(r1, r0)
            return
    }

    private com.google.android.material.navigationrail.NavigationRailMenuView getNavigationRailMenuView() {
            r1 = this;
            androidx.appcompat.view.menu.MenuView r0 = r1.getMenuView()
            com.google.android.material.navigationrail.NavigationRailMenuView r0 = (com.google.android.material.navigationrail.NavigationRailMenuView) r0
            return r0
    }

    private boolean isHeaderViewVisible() {
            r2 = this;
            android.view.View r0 = r2.headerView
            if (r0 == 0) goto Le
            int r0 = r0.getVisibility()
            r1 = 8
            if (r0 == r1) goto Le
            r0 = 1
            goto Lf
        Le:
            r0 = 0
        Lf:
            return r0
    }

    private int makeMinWidthSpec(int r5) {
            r4 = this;
            int r0 = r4.getSuggestedMinimumWidth()
            int r1 = android.view.View.MeasureSpec.getMode(r5)
            r2 = 1073741824(0x40000000, float:2.0)
            if (r1 == r2) goto L24
            if (r0 <= 0) goto L24
            int r1 = r4.getPaddingLeft()
            int r3 = r4.getPaddingRight()
            int r1 = r1 + r3
            int r0 = r0 + r1
            int r5 = android.view.View.MeasureSpec.getSize(r5)
            int r5 = java.lang.Math.min(r5, r0)
            int r5 = android.view.View.MeasureSpec.makeMeasureSpec(r5, r2)
        L24:
            return r5
    }

    private boolean shouldApplyWindowInsetPadding(java.lang.Boolean r1) {
            r0 = this;
            if (r1 == 0) goto L7
            boolean r1 = r1.booleanValue()
            goto Lb
        L7:
            boolean r1 = androidx.core.view.ViewCompat.getFitsSystemWindows(r0)
        Lb:
            return r1
    }

    public void addHeaderView(int r3) {
            r2 = this;
            android.content.Context r0 = r2.getContext()
            android.view.LayoutInflater r0 = android.view.LayoutInflater.from(r0)
            r1 = 0
            android.view.View r3 = r0.inflate(r3, r2, r1)
            r2.addHeaderView(r3)
            return
    }

    public void addHeaderView(android.view.View r3) {
            r2 = this;
            r2.removeHeaderView()
            r2.headerView = r3
            android.widget.FrameLayout$LayoutParams r0 = new android.widget.FrameLayout$LayoutParams
            r1 = -2
            r0.<init>(r1, r1)
            r1 = 49
            r0.gravity = r1
            int r1 = r2.topMargin
            r0.topMargin = r1
            r1 = 0
            r2.addView(r3, r1, r0)
            return
    }

    @Override // com.google.android.material.navigation.NavigationBarView
    protected /* bridge */ /* synthetic */ com.google.android.material.navigation.NavigationBarMenuView createNavigationBarMenuView(android.content.Context r1) {
            r0 = this;
            com.google.android.material.navigationrail.NavigationRailMenuView r1 = r0.createNavigationBarMenuView(r1)
            return r1
    }

    @Override // com.google.android.material.navigation.NavigationBarView
    protected com.google.android.material.navigationrail.NavigationRailMenuView createNavigationBarMenuView(android.content.Context r2) {
            r1 = this;
            com.google.android.material.navigationrail.NavigationRailMenuView r0 = new com.google.android.material.navigationrail.NavigationRailMenuView
            r0.<init>(r2)
            return r0
    }

    public android.view.View getHeaderView() {
            r1 = this;
            android.view.View r0 = r1.headerView
            return r0
    }

    public int getItemMinimumHeight() {
            r1 = this;
            androidx.appcompat.view.menu.MenuView r0 = r1.getMenuView()
            com.google.android.material.navigationrail.NavigationRailMenuView r0 = (com.google.android.material.navigationrail.NavigationRailMenuView) r0
            int r0 = r0.getItemMinimumHeight()
            return r0
    }

    @Override // com.google.android.material.navigation.NavigationBarView
    public int getMaxItemCount() {
            r1 = this;
            r0 = 7
            return r0
    }

    public int getMenuGravity() {
            r1 = this;
            com.google.android.material.navigationrail.NavigationRailMenuView r0 = r1.getNavigationRailMenuView()
            int r0 = r0.getMenuGravity()
            return r0
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean r2, int r3, int r4, int r5, int r6) {
            r1 = this;
            super.onLayout(r2, r3, r4, r5, r6)
            com.google.android.material.navigationrail.NavigationRailMenuView r2 = r1.getNavigationRailMenuView()
            boolean r3 = r1.isHeaderViewVisible()
            r4 = 0
            if (r3 == 0) goto L20
            android.view.View r3 = r1.headerView
            int r3 = r3.getBottom()
            int r5 = r1.topMargin
            int r3 = r3 + r5
            int r5 = r2.getTop()
            if (r5 >= r3) goto L28
            int r3 = r3 - r5
            r4 = r3
            goto L28
        L20:
            boolean r3 = r2.isTopGravity()
            if (r3 == 0) goto L28
            int r4 = r1.topMargin
        L28:
            if (r4 <= 0) goto L3f
            int r3 = r2.getLeft()
            int r5 = r2.getTop()
            int r5 = r5 + r4
            int r6 = r2.getRight()
            int r0 = r2.getBottom()
            int r0 = r0 + r4
            r2.layout(r3, r5, r6, r0)
        L3f:
            return
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int r2, int r3) {
            r1 = this;
            int r2 = r1.makeMinWidthSpec(r2)
            super.onMeasure(r2, r3)
            boolean r3 = r1.isHeaderViewVisible()
            if (r3 == 0) goto L28
            int r3 = r1.getMeasuredHeight()
            android.view.View r0 = r1.headerView
            int r0 = r0.getMeasuredHeight()
            int r3 = r3 - r0
            int r0 = r1.topMargin
            int r3 = r3 - r0
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            int r3 = android.view.View.MeasureSpec.makeMeasureSpec(r3, r0)
            com.google.android.material.navigationrail.NavigationRailMenuView r0 = r1.getNavigationRailMenuView()
            r1.measureChild(r0, r2, r3)
        L28:
            return
    }

    public void removeHeaderView() {
            r1 = this;
            android.view.View r0 = r1.headerView
            if (r0 == 0) goto La
            r1.removeView(r0)
            r0 = 0
            r1.headerView = r0
        La:
            return
    }

    public void setItemMinimumHeight(int r2) {
            r1 = this;
            androidx.appcompat.view.menu.MenuView r0 = r1.getMenuView()
            com.google.android.material.navigationrail.NavigationRailMenuView r0 = (com.google.android.material.navigationrail.NavigationRailMenuView) r0
            r0.setItemMinimumHeight(r2)
            return
    }

    public void setMenuGravity(int r2) {
            r1 = this;
            com.google.android.material.navigationrail.NavigationRailMenuView r0 = r1.getNavigationRailMenuView()
            r0.setMenuGravity(r2)
            return
    }
}
