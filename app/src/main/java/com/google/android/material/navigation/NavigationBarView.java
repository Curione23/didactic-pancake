package com.google.android.material.navigation;

/* JADX INFO: loaded from: classes.dex */
public abstract class NavigationBarView extends android.widget.FrameLayout {
    public static final int LABEL_VISIBILITY_AUTO = -1;
    public static final int LABEL_VISIBILITY_LABELED = 1;
    public static final int LABEL_VISIBILITY_SELECTED = 0;
    public static final int LABEL_VISIBILITY_UNLABELED = 2;
    private static final int MENU_PRESENTER_ID = 1;
    private final com.google.android.material.navigation.NavigationBarMenu menu;
    private android.view.MenuInflater menuInflater;
    private final com.google.android.material.navigation.NavigationBarMenuView menuView;
    private final com.google.android.material.navigation.NavigationBarPresenter presenter;
    private com.google.android.material.navigation.NavigationBarView.OnItemReselectedListener reselectedListener;
    private com.google.android.material.navigation.NavigationBarView.OnItemSelectedListener selectedListener;


    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface LabelVisibility {
    }

    public interface OnItemReselectedListener {
        void onNavigationItemReselected(android.view.MenuItem r1);
    }

    public interface OnItemSelectedListener {
        boolean onNavigationItemSelected(android.view.MenuItem r1);
    }

    static class SavedState extends androidx.customview.view.AbsSavedState {
        public static final android.os.Parcelable.Creator<com.google.android.material.navigation.NavigationBarView.SavedState> CREATOR = null;
        android.os.Bundle menuPresenterState;


        static {
                com.google.android.material.navigation.NavigationBarView$SavedState$1 r0 = new com.google.android.material.navigation.NavigationBarView$SavedState$1
                r0.<init>()
                com.google.android.material.navigation.NavigationBarView.SavedState.CREATOR = r0
                return
        }

        public SavedState(android.os.Parcel r1, java.lang.ClassLoader r2) {
                r0 = this;
                r0.<init>(r1, r2)
                if (r2 != 0) goto Ld
                java.lang.Class r2 = r0.getClass()
                java.lang.ClassLoader r2 = r2.getClassLoader()
            Ld:
                r0.readFromParcel(r1, r2)
                return
        }

        public SavedState(android.os.Parcelable r1) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        private void readFromParcel(android.os.Parcel r1, java.lang.ClassLoader r2) {
                r0 = this;
                android.os.Bundle r1 = r1.readBundle(r2)
                r0.menuPresenterState = r1
                return
        }

        @Override // androidx.customview.view.AbsSavedState
        public void writeToParcel(android.os.Parcel r1, int r2) {
                r0 = this;
                super.writeToParcel(r1, r2)
                android.os.Bundle r2 = r0.menuPresenterState
                r1.writeBundle(r2)
                return
        }
    }

    public NavigationBarView(android.content.Context r8, android.util.AttributeSet r9, int r10, int r11) {
            r7 = this;
            android.content.Context r8 = com.google.android.material.theme.overlay.MaterialThemeOverlay.wrap(r8, r9, r10, r11)
            r7.<init>(r8, r9, r10)
            com.google.android.material.navigation.NavigationBarPresenter r8 = new com.google.android.material.navigation.NavigationBarPresenter
            r8.<init>()
            r7.presenter = r8
            android.content.Context r6 = r7.getContext()
            int[] r2 = com.google.android.material.R.styleable.NavigationBarView
            int r0 = com.google.android.material.R.styleable.NavigationBarView_itemTextAppearanceInactive
            int r1 = com.google.android.material.R.styleable.NavigationBarView_itemTextAppearanceActive
            int[] r5 = new int[]{r0, r1}
            r0 = r6
            r1 = r9
            r3 = r10
            r4 = r11
            androidx.appcompat.widget.TintTypedArray r0 = com.google.android.material.internal.ThemeEnforcement.obtainTintedStyledAttributes(r0, r1, r2, r3, r4, r5)
            com.google.android.material.navigation.NavigationBarMenu r1 = new com.google.android.material.navigation.NavigationBarMenu
            java.lang.Class r2 = r7.getClass()
            int r3 = r7.getMaxItemCount()
            r1.<init>(r6, r2, r3)
            r7.menu = r1
            com.google.android.material.navigation.NavigationBarMenuView r2 = r7.createNavigationBarMenuView(r6)
            r7.menuView = r2
            r8.setMenuView(r2)
            r3 = 1
            r8.setId(r3)
            r2.setPresenter(r8)
            r1.addMenuPresenter(r8)
            android.content.Context r4 = r7.getContext()
            r8.initForMenu(r4, r1)
            int r8 = com.google.android.material.R.styleable.NavigationBarView_itemIconTint
            boolean r8 = r0.hasValue(r8)
            if (r8 == 0) goto L5f
            int r8 = com.google.android.material.R.styleable.NavigationBarView_itemIconTint
            android.content.res.ColorStateList r8 = r0.getColorStateList(r8)
            r2.setIconTintList(r8)
            goto L69
        L5f:
            r8 = 16842808(0x1010038, float:2.3693715E-38)
            android.content.res.ColorStateList r8 = r2.createDefaultColorStateList(r8)
            r2.setIconTintList(r8)
        L69:
            int r8 = com.google.android.material.R.styleable.NavigationBarView_itemIconSize
            android.content.res.Resources r4 = r7.getResources()
            int r5 = com.google.android.material.R.dimen.mtrl_navigation_bar_item_default_icon_size
            int r4 = r4.getDimensionPixelSize(r5)
            int r8 = r0.getDimensionPixelSize(r8, r4)
            r7.setItemIconSize(r8)
            int r8 = com.google.android.material.R.styleable.NavigationBarView_itemTextAppearanceInactive
            boolean r8 = r0.hasValue(r8)
            r4 = 0
            if (r8 == 0) goto L8e
            int r8 = com.google.android.material.R.styleable.NavigationBarView_itemTextAppearanceInactive
            int r8 = r0.getResourceId(r8, r4)
            r7.setItemTextAppearanceInactive(r8)
        L8e:
            int r8 = com.google.android.material.R.styleable.NavigationBarView_itemTextAppearanceActive
            boolean r8 = r0.hasValue(r8)
            if (r8 == 0) goto L9f
            int r8 = com.google.android.material.R.styleable.NavigationBarView_itemTextAppearanceActive
            int r8 = r0.getResourceId(r8, r4)
            r7.setItemTextAppearanceActive(r8)
        L9f:
            int r8 = com.google.android.material.R.styleable.NavigationBarView_itemTextAppearanceActiveBoldEnabled
            boolean r8 = r0.getBoolean(r8, r3)
            r7.setItemTextAppearanceActiveBoldEnabled(r8)
            int r8 = com.google.android.material.R.styleable.NavigationBarView_itemTextColor
            boolean r8 = r0.hasValue(r8)
            if (r8 == 0) goto Lb9
            int r8 = com.google.android.material.R.styleable.NavigationBarView_itemTextColor
            android.content.res.ColorStateList r8 = r0.getColorStateList(r8)
            r7.setItemTextColor(r8)
        Lb9:
            android.graphics.drawable.Drawable r8 = r7.getBackground()
            android.content.res.ColorStateList r5 = com.google.android.material.drawable.DrawableUtils.getColorStateListOrNull(r8)
            if (r8 == 0) goto Lc5
            if (r5 == 0) goto Ldd
        Lc5:
            com.google.android.material.shape.ShapeAppearanceModel$Builder r8 = com.google.android.material.shape.ShapeAppearanceModel.builder(r6, r9, r10, r11)
            com.google.android.material.shape.ShapeAppearanceModel r8 = r8.build()
            com.google.android.material.shape.MaterialShapeDrawable r9 = new com.google.android.material.shape.MaterialShapeDrawable
            r9.<init>(r8)
            if (r5 == 0) goto Ld7
            r9.setFillColor(r5)
        Ld7:
            r9.initializeElevationOverlay(r6)
            androidx.core.view.ViewCompat.setBackground(r7, r9)
        Ldd:
            int r8 = com.google.android.material.R.styleable.NavigationBarView_itemPaddingTop
            boolean r8 = r0.hasValue(r8)
            if (r8 == 0) goto Lee
            int r8 = com.google.android.material.R.styleable.NavigationBarView_itemPaddingTop
            int r8 = r0.getDimensionPixelSize(r8, r4)
            r7.setItemPaddingTop(r8)
        Lee:
            int r8 = com.google.android.material.R.styleable.NavigationBarView_itemPaddingBottom
            boolean r8 = r0.hasValue(r8)
            if (r8 == 0) goto Lff
            int r8 = com.google.android.material.R.styleable.NavigationBarView_itemPaddingBottom
            int r8 = r0.getDimensionPixelSize(r8, r4)
            r7.setItemPaddingBottom(r8)
        Lff:
            int r8 = com.google.android.material.R.styleable.NavigationBarView_activeIndicatorLabelPadding
            boolean r8 = r0.hasValue(r8)
            if (r8 == 0) goto L110
            int r8 = com.google.android.material.R.styleable.NavigationBarView_activeIndicatorLabelPadding
            int r8 = r0.getDimensionPixelSize(r8, r4)
            r7.setActiveIndicatorLabelPadding(r8)
        L110:
            int r8 = com.google.android.material.R.styleable.NavigationBarView_elevation
            boolean r8 = r0.hasValue(r8)
            if (r8 == 0) goto L122
            int r8 = com.google.android.material.R.styleable.NavigationBarView_elevation
            int r8 = r0.getDimensionPixelSize(r8, r4)
            float r8 = (float) r8
            r7.setElevation(r8)
        L122:
            int r8 = com.google.android.material.R.styleable.NavigationBarView_backgroundTint
            android.content.res.ColorStateList r8 = com.google.android.material.resources.MaterialResources.getColorStateList(r6, r0, r8)
            android.graphics.drawable.Drawable r9 = r7.getBackground()
            android.graphics.drawable.Drawable r9 = r9.mutate()
            androidx.core.graphics.drawable.DrawableCompat.setTintList(r9, r8)
            int r8 = com.google.android.material.R.styleable.NavigationBarView_labelVisibilityMode
            r9 = -1
            int r8 = r0.getInteger(r8, r9)
            r7.setLabelVisibilityMode(r8)
            int r8 = com.google.android.material.R.styleable.NavigationBarView_itemBackground
            int r8 = r0.getResourceId(r8, r4)
            if (r8 == 0) goto L149
            r2.setItemBackgroundRes(r8)
            goto L152
        L149:
            int r8 = com.google.android.material.R.styleable.NavigationBarView_itemRippleColor
            android.content.res.ColorStateList r8 = com.google.android.material.resources.MaterialResources.getColorStateList(r6, r0, r8)
            r7.setItemRippleColor(r8)
        L152:
            int r8 = com.google.android.material.R.styleable.NavigationBarView_itemActiveIndicatorStyle
            int r8 = r0.getResourceId(r8, r4)
            if (r8 == 0) goto L19b
            r7.setItemActiveIndicatorEnabled(r3)
            int[] r9 = com.google.android.material.R.styleable.NavigationBarActiveIndicator
            android.content.res.TypedArray r8 = r6.obtainStyledAttributes(r8, r9)
            int r9 = com.google.android.material.R.styleable.NavigationBarActiveIndicator_android_width
            int r9 = r8.getDimensionPixelSize(r9, r4)
            r7.setItemActiveIndicatorWidth(r9)
            int r9 = com.google.android.material.R.styleable.NavigationBarActiveIndicator_android_height
            int r9 = r8.getDimensionPixelSize(r9, r4)
            r7.setItemActiveIndicatorHeight(r9)
            int r9 = com.google.android.material.R.styleable.NavigationBarActiveIndicator_marginHorizontal
            int r9 = r8.getDimensionPixelOffset(r9, r4)
            r7.setItemActiveIndicatorMarginHorizontal(r9)
            int r9 = com.google.android.material.R.styleable.NavigationBarActiveIndicator_android_color
            android.content.res.ColorStateList r9 = com.google.android.material.resources.MaterialResources.getColorStateList(r6, r8, r9)
            r7.setItemActiveIndicatorColor(r9)
            int r9 = com.google.android.material.R.styleable.NavigationBarActiveIndicator_shapeAppearance
            int r9 = r8.getResourceId(r9, r4)
            com.google.android.material.shape.ShapeAppearanceModel$Builder r9 = com.google.android.material.shape.ShapeAppearanceModel.builder(r6, r9, r4)
            com.google.android.material.shape.ShapeAppearanceModel r9 = r9.build()
            r7.setItemActiveIndicatorShapeAppearance(r9)
            r8.recycle()
        L19b:
            int r8 = com.google.android.material.R.styleable.NavigationBarView_menu
            boolean r8 = r0.hasValue(r8)
            if (r8 == 0) goto L1ac
            int r8 = com.google.android.material.R.styleable.NavigationBarView_menu
            int r8 = r0.getResourceId(r8, r4)
            r7.inflateMenu(r8)
        L1ac:
            r0.recycle()
            r7.addView(r2)
            com.google.android.material.navigation.NavigationBarView$1 r8 = new com.google.android.material.navigation.NavigationBarView$1
            r8.<init>(r7)
            r1.setCallback(r8)
            return
    }

    static /* synthetic */ com.google.android.material.navigation.NavigationBarView.OnItemReselectedListener access$000(com.google.android.material.navigation.NavigationBarView r0) {
            com.google.android.material.navigation.NavigationBarView$OnItemReselectedListener r0 = r0.reselectedListener
            return r0
    }

    static /* synthetic */ com.google.android.material.navigation.NavigationBarView.OnItemSelectedListener access$100(com.google.android.material.navigation.NavigationBarView r0) {
            com.google.android.material.navigation.NavigationBarView$OnItemSelectedListener r0 = r0.selectedListener
            return r0
    }

    private android.view.MenuInflater getMenuInflater() {
            r2 = this;
            android.view.MenuInflater r0 = r2.menuInflater
            if (r0 != 0) goto Lf
            androidx.appcompat.view.SupportMenuInflater r0 = new androidx.appcompat.view.SupportMenuInflater
            android.content.Context r1 = r2.getContext()
            r0.<init>(r1)
            r2.menuInflater = r0
        Lf:
            android.view.MenuInflater r0 = r2.menuInflater
            return r0
    }

    protected abstract com.google.android.material.navigation.NavigationBarMenuView createNavigationBarMenuView(android.content.Context r1);

    public int getActiveIndicatorLabelPadding() {
            r1 = this;
            com.google.android.material.navigation.NavigationBarMenuView r0 = r1.menuView
            int r0 = r0.getActiveIndicatorLabelPadding()
            return r0
    }

    public com.google.android.material.badge.BadgeDrawable getBadge(int r2) {
            r1 = this;
            com.google.android.material.navigation.NavigationBarMenuView r0 = r1.menuView
            com.google.android.material.badge.BadgeDrawable r2 = r0.getBadge(r2)
            return r2
    }

    public android.content.res.ColorStateList getItemActiveIndicatorColor() {
            r1 = this;
            com.google.android.material.navigation.NavigationBarMenuView r0 = r1.menuView
            android.content.res.ColorStateList r0 = r0.getItemActiveIndicatorColor()
            return r0
    }

    public int getItemActiveIndicatorHeight() {
            r1 = this;
            com.google.android.material.navigation.NavigationBarMenuView r0 = r1.menuView
            int r0 = r0.getItemActiveIndicatorHeight()
            return r0
    }

    public int getItemActiveIndicatorMarginHorizontal() {
            r1 = this;
            com.google.android.material.navigation.NavigationBarMenuView r0 = r1.menuView
            int r0 = r0.getItemActiveIndicatorMarginHorizontal()
            return r0
    }

    public com.google.android.material.shape.ShapeAppearanceModel getItemActiveIndicatorShapeAppearance() {
            r1 = this;
            com.google.android.material.navigation.NavigationBarMenuView r0 = r1.menuView
            com.google.android.material.shape.ShapeAppearanceModel r0 = r0.getItemActiveIndicatorShapeAppearance()
            return r0
    }

    public int getItemActiveIndicatorWidth() {
            r1 = this;
            com.google.android.material.navigation.NavigationBarMenuView r0 = r1.menuView
            int r0 = r0.getItemActiveIndicatorWidth()
            return r0
    }

    public android.graphics.drawable.Drawable getItemBackground() {
            r1 = this;
            com.google.android.material.navigation.NavigationBarMenuView r0 = r1.menuView
            android.graphics.drawable.Drawable r0 = r0.getItemBackground()
            return r0
    }

    @java.lang.Deprecated
    public int getItemBackgroundResource() {
            r1 = this;
            com.google.android.material.navigation.NavigationBarMenuView r0 = r1.menuView
            int r0 = r0.getItemBackgroundRes()
            return r0
    }

    public int getItemIconSize() {
            r1 = this;
            com.google.android.material.navigation.NavigationBarMenuView r0 = r1.menuView
            int r0 = r0.getItemIconSize()
            return r0
    }

    public android.content.res.ColorStateList getItemIconTintList() {
            r1 = this;
            com.google.android.material.navigation.NavigationBarMenuView r0 = r1.menuView
            android.content.res.ColorStateList r0 = r0.getIconTintList()
            return r0
    }

    public int getItemPaddingBottom() {
            r1 = this;
            com.google.android.material.navigation.NavigationBarMenuView r0 = r1.menuView
            int r0 = r0.getItemPaddingBottom()
            return r0
    }

    public int getItemPaddingTop() {
            r1 = this;
            com.google.android.material.navigation.NavigationBarMenuView r0 = r1.menuView
            int r0 = r0.getItemPaddingTop()
            return r0
    }

    public android.content.res.ColorStateList getItemRippleColor() {
            r1 = this;
            com.google.android.material.navigation.NavigationBarMenuView r0 = r1.menuView
            android.content.res.ColorStateList r0 = r0.getItemRippleColor()
            return r0
    }

    public int getItemTextAppearanceActive() {
            r1 = this;
            com.google.android.material.navigation.NavigationBarMenuView r0 = r1.menuView
            int r0 = r0.getItemTextAppearanceActive()
            return r0
    }

    public int getItemTextAppearanceInactive() {
            r1 = this;
            com.google.android.material.navigation.NavigationBarMenuView r0 = r1.menuView
            int r0 = r0.getItemTextAppearanceInactive()
            return r0
    }

    public android.content.res.ColorStateList getItemTextColor() {
            r1 = this;
            com.google.android.material.navigation.NavigationBarMenuView r0 = r1.menuView
            android.content.res.ColorStateList r0 = r0.getItemTextColor()
            return r0
    }

    public int getLabelVisibilityMode() {
            r1 = this;
            com.google.android.material.navigation.NavigationBarMenuView r0 = r1.menuView
            int r0 = r0.getLabelVisibilityMode()
            return r0
    }

    public abstract int getMaxItemCount();

    public android.view.Menu getMenu() {
            r1 = this;
            com.google.android.material.navigation.NavigationBarMenu r0 = r1.menu
            return r0
    }

    public androidx.appcompat.view.menu.MenuView getMenuView() {
            r1 = this;
            com.google.android.material.navigation.NavigationBarMenuView r0 = r1.menuView
            return r0
    }

    public com.google.android.material.badge.BadgeDrawable getOrCreateBadge(int r2) {
            r1 = this;
            com.google.android.material.navigation.NavigationBarMenuView r0 = r1.menuView
            com.google.android.material.badge.BadgeDrawable r2 = r0.getOrCreateBadge(r2)
            return r2
    }

    public com.google.android.material.navigation.NavigationBarPresenter getPresenter() {
            r1 = this;
            com.google.android.material.navigation.NavigationBarPresenter r0 = r1.presenter
            return r0
    }

    public int getSelectedItemId() {
            r1 = this;
            com.google.android.material.navigation.NavigationBarMenuView r0 = r1.menuView
            int r0 = r0.getSelectedItemId()
            return r0
    }

    public void inflateMenu(int r4) {
            r3 = this;
            com.google.android.material.navigation.NavigationBarPresenter r0 = r3.presenter
            r1 = 1
            r0.setUpdateSuspended(r1)
            android.view.MenuInflater r0 = r3.getMenuInflater()
            com.google.android.material.navigation.NavigationBarMenu r2 = r3.menu
            r0.inflate(r4, r2)
            com.google.android.material.navigation.NavigationBarPresenter r4 = r3.presenter
            r0 = 0
            r4.setUpdateSuspended(r0)
            com.google.android.material.navigation.NavigationBarPresenter r4 = r3.presenter
            r4.updateMenuView(r1)
            return
    }

    public boolean isItemActiveIndicatorEnabled() {
            r1 = this;
            com.google.android.material.navigation.NavigationBarMenuView r0 = r1.menuView
            boolean r0 = r0.getItemActiveIndicatorEnabled()
            return r0
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
            r0 = this;
            super.onAttachedToWindow()
            com.google.android.material.shape.MaterialShapeUtils.setParentAbsoluteElevation(r0)
            return
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(android.os.Parcelable r2) {
            r1 = this;
            boolean r0 = r2 instanceof com.google.android.material.navigation.NavigationBarView.SavedState
            if (r0 != 0) goto L8
            super.onRestoreInstanceState(r2)
            return
        L8:
            com.google.android.material.navigation.NavigationBarView$SavedState r2 = (com.google.android.material.navigation.NavigationBarView.SavedState) r2
            android.os.Parcelable r0 = r2.getSuperState()
            super.onRestoreInstanceState(r0)
            com.google.android.material.navigation.NavigationBarMenu r0 = r1.menu
            android.os.Bundle r2 = r2.menuPresenterState
            r0.restorePresenterStates(r2)
            return
    }

    @Override // android.view.View
    protected android.os.Parcelable onSaveInstanceState() {
            r3 = this;
            android.os.Parcelable r0 = super.onSaveInstanceState()
            com.google.android.material.navigation.NavigationBarView$SavedState r1 = new com.google.android.material.navigation.NavigationBarView$SavedState
            r1.<init>(r0)
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            r1.menuPresenterState = r0
            com.google.android.material.navigation.NavigationBarMenu r0 = r3.menu
            android.os.Bundle r2 = r1.menuPresenterState
            r0.savePresenterStates(r2)
            return r1
    }

    public void removeBadge(int r2) {
            r1 = this;
            com.google.android.material.navigation.NavigationBarMenuView r0 = r1.menuView
            r0.removeBadge(r2)
            return
    }

    public void setActiveIndicatorLabelPadding(int r2) {
            r1 = this;
            com.google.android.material.navigation.NavigationBarMenuView r0 = r1.menuView
            r0.setActiveIndicatorLabelPadding(r2)
            return
    }

    @Override // android.view.View
    public void setElevation(float r1) {
            r0 = this;
            super.setElevation(r1)
            com.google.android.material.shape.MaterialShapeUtils.setElevation(r0, r1)
            return
    }

    public void setItemActiveIndicatorColor(android.content.res.ColorStateList r2) {
            r1 = this;
            com.google.android.material.navigation.NavigationBarMenuView r0 = r1.menuView
            r0.setItemActiveIndicatorColor(r2)
            return
    }

    public void setItemActiveIndicatorEnabled(boolean r2) {
            r1 = this;
            com.google.android.material.navigation.NavigationBarMenuView r0 = r1.menuView
            r0.setItemActiveIndicatorEnabled(r2)
            return
    }

    public void setItemActiveIndicatorHeight(int r2) {
            r1 = this;
            com.google.android.material.navigation.NavigationBarMenuView r0 = r1.menuView
            r0.setItemActiveIndicatorHeight(r2)
            return
    }

    public void setItemActiveIndicatorMarginHorizontal(int r2) {
            r1 = this;
            com.google.android.material.navigation.NavigationBarMenuView r0 = r1.menuView
            r0.setItemActiveIndicatorMarginHorizontal(r2)
            return
    }

    public void setItemActiveIndicatorShapeAppearance(com.google.android.material.shape.ShapeAppearanceModel r2) {
            r1 = this;
            com.google.android.material.navigation.NavigationBarMenuView r0 = r1.menuView
            r0.setItemActiveIndicatorShapeAppearance(r2)
            return
    }

    public void setItemActiveIndicatorWidth(int r2) {
            r1 = this;
            com.google.android.material.navigation.NavigationBarMenuView r0 = r1.menuView
            r0.setItemActiveIndicatorWidth(r2)
            return
    }

    public void setItemBackground(android.graphics.drawable.Drawable r2) {
            r1 = this;
            com.google.android.material.navigation.NavigationBarMenuView r0 = r1.menuView
            r0.setItemBackground(r2)
            return
    }

    public void setItemBackgroundResource(int r2) {
            r1 = this;
            com.google.android.material.navigation.NavigationBarMenuView r0 = r1.menuView
            r0.setItemBackgroundRes(r2)
            return
    }

    public void setItemIconSize(int r2) {
            r1 = this;
            com.google.android.material.navigation.NavigationBarMenuView r0 = r1.menuView
            r0.setItemIconSize(r2)
            return
    }

    public void setItemIconSizeRes(int r2) {
            r1 = this;
            android.content.res.Resources r0 = r1.getResources()
            int r2 = r0.getDimensionPixelSize(r2)
            r1.setItemIconSize(r2)
            return
    }

    public void setItemIconTintList(android.content.res.ColorStateList r2) {
            r1 = this;
            com.google.android.material.navigation.NavigationBarMenuView r0 = r1.menuView
            r0.setIconTintList(r2)
            return
    }

    public void setItemOnTouchListener(int r2, android.view.View.OnTouchListener r3) {
            r1 = this;
            com.google.android.material.navigation.NavigationBarMenuView r0 = r1.menuView
            r0.setItemOnTouchListener(r2, r3)
            return
    }

    public void setItemPaddingBottom(int r2) {
            r1 = this;
            com.google.android.material.navigation.NavigationBarMenuView r0 = r1.menuView
            r0.setItemPaddingBottom(r2)
            return
    }

    public void setItemPaddingTop(int r2) {
            r1 = this;
            com.google.android.material.navigation.NavigationBarMenuView r0 = r1.menuView
            r0.setItemPaddingTop(r2)
            return
    }

    public void setItemRippleColor(android.content.res.ColorStateList r2) {
            r1 = this;
            com.google.android.material.navigation.NavigationBarMenuView r0 = r1.menuView
            r0.setItemRippleColor(r2)
            return
    }

    public void setItemTextAppearanceActive(int r2) {
            r1 = this;
            com.google.android.material.navigation.NavigationBarMenuView r0 = r1.menuView
            r0.setItemTextAppearanceActive(r2)
            return
    }

    public void setItemTextAppearanceActiveBoldEnabled(boolean r2) {
            r1 = this;
            com.google.android.material.navigation.NavigationBarMenuView r0 = r1.menuView
            r0.setItemTextAppearanceActiveBoldEnabled(r2)
            return
    }

    public void setItemTextAppearanceInactive(int r2) {
            r1 = this;
            com.google.android.material.navigation.NavigationBarMenuView r0 = r1.menuView
            r0.setItemTextAppearanceInactive(r2)
            return
    }

    public void setItemTextColor(android.content.res.ColorStateList r2) {
            r1 = this;
            com.google.android.material.navigation.NavigationBarMenuView r0 = r1.menuView
            r0.setItemTextColor(r2)
            return
    }

    public void setLabelVisibilityMode(int r2) {
            r1 = this;
            com.google.android.material.navigation.NavigationBarMenuView r0 = r1.menuView
            int r0 = r0.getLabelVisibilityMode()
            if (r0 == r2) goto L13
            com.google.android.material.navigation.NavigationBarMenuView r0 = r1.menuView
            r0.setLabelVisibilityMode(r2)
            com.google.android.material.navigation.NavigationBarPresenter r2 = r1.presenter
            r0 = 0
            r2.updateMenuView(r0)
        L13:
            return
    }

    public void setOnItemReselectedListener(com.google.android.material.navigation.NavigationBarView.OnItemReselectedListener r1) {
            r0 = this;
            r0.reselectedListener = r1
            return
    }

    public void setOnItemSelectedListener(com.google.android.material.navigation.NavigationBarView.OnItemSelectedListener r1) {
            r0 = this;
            r0.selectedListener = r1
            return
    }

    public void setSelectedItemId(int r4) {
            r3 = this;
            com.google.android.material.navigation.NavigationBarMenu r0 = r3.menu
            android.view.MenuItem r4 = r0.findItem(r4)
            if (r4 == 0) goto L17
            com.google.android.material.navigation.NavigationBarMenu r0 = r3.menu
            com.google.android.material.navigation.NavigationBarPresenter r1 = r3.presenter
            r2 = 0
            boolean r0 = r0.performItemAction(r4, r1, r2)
            if (r0 != 0) goto L17
            r0 = 1
            r4.setChecked(r0)
        L17:
            return
    }
}
