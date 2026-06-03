package com.google.android.material.search;

/* JADX INFO: loaded from: classes.dex */
public class SearchBar extends androidx.appcompat.widget.Toolbar {
    private static final int DEFAULT_SCROLL_FLAGS = 53;
    private static final int DEF_STYLE_RES = 0;
    private static final java.lang.String NAMESPACE_APP = "http://schemas.android.com/apk/res-auto";
    private final android.view.accessibility.AccessibilityManager accessibilityManager;
    private com.google.android.material.shape.MaterialShapeDrawable backgroundShape;
    private android.view.View centerView;
    private final boolean defaultMarginsEnabled;
    private final android.graphics.drawable.Drawable defaultNavigationIcon;
    private boolean defaultScrollFlagsEnabled;
    private final boolean forceDefaultNavigationOnClickListener;
    private final boolean layoutInflated;
    private int menuResId;
    private java.lang.Integer navigationIconTint;
    private android.graphics.drawable.Drawable originalNavigationIconBackground;
    private final com.google.android.material.search.SearchBarAnimationHelper searchBarAnimationHelper;
    private final android.widget.TextView textView;
    private final boolean tintNavigationIcon;
    private final androidx.core.view.accessibility.AccessibilityManagerCompat.TouchExplorationStateChangeListener touchExplorationStateChangeListener;


    public static abstract class OnLoadAnimationCallback {
        public OnLoadAnimationCallback() {
                r0 = this;
                r0.<init>()
                return
        }

        public void onAnimationEnd() {
                r0 = this;
                return
        }

        public void onAnimationStart() {
                r0 = this;
                return
        }
    }

    static class SavedState extends androidx.customview.view.AbsSavedState {
        public static final android.os.Parcelable.Creator<com.google.android.material.search.SearchBar.SavedState> CREATOR = null;
        java.lang.String text;


        static {
                com.google.android.material.search.SearchBar$SavedState$1 r0 = new com.google.android.material.search.SearchBar$SavedState$1
                r0.<init>()
                com.google.android.material.search.SearchBar.SavedState.CREATOR = r0
                return
        }

        public SavedState(android.os.Parcel r2) {
                r1 = this;
                r0 = 0
                r1.<init>(r2, r0)
                return
        }

        public SavedState(android.os.Parcel r1, java.lang.ClassLoader r2) {
                r0 = this;
                r0.<init>(r1, r2)
                java.lang.String r1 = r1.readString()
                r0.text = r1
                return
        }

        public SavedState(android.os.Parcelable r1) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        @Override // androidx.customview.view.AbsSavedState
        public void writeToParcel(android.os.Parcel r1, int r2) {
                r0 = this;
                super.writeToParcel(r1, r2)
                java.lang.String r2 = r0.text
                r1.writeString(r2)
                return
        }
    }

    public static class ScrollingViewBehavior extends com.google.android.material.appbar.AppBarLayout.ScrollingViewBehavior {
        private boolean initialized;

        public ScrollingViewBehavior() {
                r1 = this;
                r1.<init>()
                r0 = 0
                r1.initialized = r0
                return
        }

        public ScrollingViewBehavior(android.content.Context r1, android.util.AttributeSet r2) {
                r0 = this;
                r0.<init>(r1, r2)
                r1 = 0
                r0.initialized = r1
                return
        }

        private void setAppBarLayoutTransparent(com.google.android.material.appbar.AppBarLayout r2) {
                r1 = this;
                r0 = 0
                r2.setBackgroundColor(r0)
                r0 = 0
                r2.setTargetElevation(r0)
                return
        }

        @Override // com.google.android.material.appbar.AppBarLayout.ScrollingViewBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public boolean onDependentViewChanged(androidx.coordinatorlayout.widget.CoordinatorLayout r1, android.view.View r2, android.view.View r3) {
                r0 = this;
                boolean r1 = super.onDependentViewChanged(r1, r2, r3)
                boolean r2 = r0.initialized
                if (r2 != 0) goto L14
                boolean r2 = r3 instanceof com.google.android.material.appbar.AppBarLayout
                if (r2 == 0) goto L14
                r2 = 1
                r0.initialized = r2
                com.google.android.material.appbar.AppBarLayout r3 = (com.google.android.material.appbar.AppBarLayout) r3
                r0.setAppBarLayoutTransparent(r3)
            L14:
                return r1
        }

        @Override // com.google.android.material.appbar.HeaderScrollingViewBehavior
        protected boolean shouldHeaderOverlapScrollingChild() {
                r1 = this;
                r0 = 1
                return r0
        }
    }

    static {
            int r0 = com.google.android.material.R.style.Widget_Material3_SearchBar
            com.google.android.material.search.SearchBar.DEF_STYLE_RES = r0
            return
    }

    public SearchBar(android.content.Context r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0)
            return
    }

    public SearchBar(android.content.Context r2, android.util.AttributeSet r3) {
            r1 = this;
            int r0 = com.google.android.material.R.attr.materialSearchBarStyle
            r1.<init>(r2, r3, r0)
            return
    }

    public SearchBar(android.content.Context r11, android.util.AttributeSet r12, int r13) {
            r10 = this;
            int r6 = com.google.android.material.search.SearchBar.DEF_STYLE_RES
            android.content.Context r11 = com.google.android.material.theme.overlay.MaterialThemeOverlay.wrap(r11, r12, r13, r6)
            r10.<init>(r11, r12, r13)
            r11 = -1
            r10.menuResId = r11
            com.google.android.material.search.SearchBar$$ExternalSyntheticLambda1 r0 = new com.google.android.material.search.SearchBar$$ExternalSyntheticLambda1
            r0.<init>(r10)
            r10.touchExplorationStateChangeListener = r0
            android.content.Context r7 = r10.getContext()
            r10.validateAttributes(r12)
            int r0 = r10.getDefaultNavigationIconResource()
            android.graphics.drawable.Drawable r0 = androidx.appcompat.content.res.AppCompatResources.getDrawable(r7, r0)
            r10.defaultNavigationIcon = r0
            com.google.android.material.search.SearchBarAnimationHelper r0 = new com.google.android.material.search.SearchBarAnimationHelper
            r0.<init>()
            r10.searchBarAnimationHelper = r0
            int[] r2 = com.google.android.material.R.styleable.SearchBar
            r8 = 0
            int[] r5 = new int[r8]
            r0 = r7
            r1 = r12
            r3 = r13
            r4 = r6
            android.content.res.TypedArray r0 = com.google.android.material.internal.ThemeEnforcement.obtainStyledAttributes(r0, r1, r2, r3, r4, r5)
            com.google.android.material.shape.ShapeAppearanceModel$Builder r12 = com.google.android.material.shape.ShapeAppearanceModel.builder(r7, r12, r13, r6)
            com.google.android.material.shape.ShapeAppearanceModel r2 = r12.build()
            int r12 = com.google.android.material.R.styleable.SearchBar_backgroundTint
            int r3 = r0.getColor(r12, r8)
            int r12 = com.google.android.material.R.styleable.SearchBar_elevation
            r13 = 0
            float r4 = r0.getDimension(r12, r13)
            int r12 = com.google.android.material.R.styleable.SearchBar_defaultMarginsEnabled
            r13 = 1
            boolean r12 = r0.getBoolean(r12, r13)
            r10.defaultMarginsEnabled = r12
            int r12 = com.google.android.material.R.styleable.SearchBar_defaultScrollFlagsEnabled
            boolean r12 = r0.getBoolean(r12, r13)
            r10.defaultScrollFlagsEnabled = r12
            int r12 = com.google.android.material.R.styleable.SearchBar_hideNavigationIcon
            boolean r12 = r0.getBoolean(r12, r8)
            int r1 = com.google.android.material.R.styleable.SearchBar_forceDefaultNavigationOnClickListener
            boolean r1 = r0.getBoolean(r1, r8)
            r10.forceDefaultNavigationOnClickListener = r1
            int r1 = com.google.android.material.R.styleable.SearchBar_tintNavigationIcon
            boolean r1 = r0.getBoolean(r1, r13)
            r10.tintNavigationIcon = r1
            int r1 = com.google.android.material.R.styleable.SearchBar_navigationIconTint
            boolean r1 = r0.hasValue(r1)
            if (r1 == 0) goto L88
            int r1 = com.google.android.material.R.styleable.SearchBar_navigationIconTint
            int r1 = r0.getColor(r1, r11)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r10.navigationIconTint = r1
        L88:
            int r1 = com.google.android.material.R.styleable.SearchBar_android_textAppearance
            int r11 = r0.getResourceId(r1, r11)
            int r1 = com.google.android.material.R.styleable.SearchBar_android_text
            java.lang.String r1 = r0.getString(r1)
            int r5 = com.google.android.material.R.styleable.SearchBar_android_hint
            java.lang.String r5 = r0.getString(r5)
            int r6 = com.google.android.material.R.styleable.SearchBar_strokeWidth
            r9 = -1082130432(0xffffffffbf800000, float:-1.0)
            float r6 = r0.getDimension(r6, r9)
            int r9 = com.google.android.material.R.styleable.SearchBar_strokeColor
            int r8 = r0.getColor(r9, r8)
            r0.recycle()
            if (r12 != 0) goto Lb0
            r10.initNavigationIcon()
        Lb0:
            r10.setClickable(r13)
            r10.setFocusable(r13)
            android.view.LayoutInflater r12 = android.view.LayoutInflater.from(r7)
            int r0 = com.google.android.material.R.layout.mtrl_search_bar
            r12.inflate(r0, r10)
            r10.layoutInflated = r13
            int r12 = com.google.android.material.R.id.open_search_bar_text_view
            android.view.View r12 = r10.findViewById(r12)
            android.widget.TextView r12 = (android.widget.TextView) r12
            r10.textView = r12
            androidx.core.view.ViewCompat.setElevation(r10, r4)
            r10.initTextView(r11, r1, r5)
            r1 = r10
            r5 = r6
            r6 = r8
            r1.initBackground(r2, r3, r4, r5, r6)
            android.content.Context r11 = r10.getContext()
            java.lang.String r12 = "accessibility"
            java.lang.Object r11 = r11.getSystemService(r12)
            android.view.accessibility.AccessibilityManager r11 = (android.view.accessibility.AccessibilityManager) r11
            r10.accessibilityManager = r11
            r10.setupTouchExplorationStateChangeListener()
            return
    }

    static /* synthetic */ android.view.accessibility.AccessibilityManager access$000(com.google.android.material.search.SearchBar r0) {
            android.view.accessibility.AccessibilityManager r0 = r0.accessibilityManager
            return r0
    }

    static /* synthetic */ androidx.core.view.accessibility.AccessibilityManagerCompat.TouchExplorationStateChangeListener access$100(com.google.android.material.search.SearchBar r0) {
            androidx.core.view.accessibility.AccessibilityManagerCompat$TouchExplorationStateChangeListener r0 = r0.touchExplorationStateChangeListener
            return r0
    }

    private int defaultIfZero(int r1, int r2) {
            r0 = this;
            if (r1 != 0) goto L3
            r1 = r2
        L3:
            return r1
    }

    private android.content.res.ColorStateList getCompatBackgroundColorStateList(int r4, int r5) {
            r3 = this;
            r0 = 16842919(0x10100a7, float:2.3694026E-38)
            int[] r0 = new int[]{r0}
            r1 = 16842908(0x101009c, float:2.3693995E-38)
            int[] r1 = new int[]{r1}
            r2 = 0
            int[] r2 = new int[r2]
            int[][] r0 = new int[][]{r0, r1, r2}
            int r5 = com.google.android.material.color.MaterialColors.layer(r4, r5)
            int[] r4 = new int[]{r5, r5, r4}
            android.content.res.ColorStateList r5 = new android.content.res.ColorStateList
            r5.<init>(r0, r4)
            return r5
    }

    private void initBackground(com.google.android.material.shape.ShapeAppearanceModel r2, int r3, float r4, float r5, int r6) {
            r1 = this;
            com.google.android.material.shape.MaterialShapeDrawable r0 = new com.google.android.material.shape.MaterialShapeDrawable
            r0.<init>(r2)
            r1.backgroundShape = r0
            android.content.Context r2 = r1.getContext()
            r0.initializeElevationOverlay(r2)
            com.google.android.material.shape.MaterialShapeDrawable r2 = r1.backgroundShape
            r2.setElevation(r4)
            r2 = 0
            int r2 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r2 < 0) goto L1d
            com.google.android.material.shape.MaterialShapeDrawable r2 = r1.backgroundShape
            r2.setStroke(r5, r6)
        L1d:
            int r2 = com.google.android.material.R.attr.colorControlHighlight
            int r2 = com.google.android.material.color.MaterialColors.getColor(r1, r2)
            com.google.android.material.shape.MaterialShapeDrawable r4 = r1.backgroundShape
            android.content.res.ColorStateList r3 = android.content.res.ColorStateList.valueOf(r3)
            r4.setFillColor(r3)
            android.graphics.drawable.RippleDrawable r3 = new android.graphics.drawable.RippleDrawable
            android.content.res.ColorStateList r2 = android.content.res.ColorStateList.valueOf(r2)
            com.google.android.material.shape.MaterialShapeDrawable r4 = r1.backgroundShape
            r3.<init>(r2, r4, r4)
            androidx.core.view.ViewCompat.setBackground(r1, r3)
            return
    }

    private void initNavigationIcon() {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.getNavigationIcon()
            if (r0 != 0) goto L9
            android.graphics.drawable.Drawable r0 = r1.defaultNavigationIcon
            goto Ld
        L9:
            android.graphics.drawable.Drawable r0 = r1.getNavigationIcon()
        Ld:
            r1.setNavigationIcon(r0)
            r0 = 1
            r1.setNavigationIconDecorative(r0)
            return
    }

    private void initTextView(int r2, java.lang.String r3, java.lang.String r4) {
            r1 = this;
            r0 = -1
            if (r2 == r0) goto L8
            android.widget.TextView r0 = r1.textView
            androidx.core.widget.TextViewCompat.setTextAppearance(r0, r2)
        L8:
            r1.setText(r3)
            r1.setHint(r4)
            android.graphics.drawable.Drawable r2 = r1.getNavigationIcon()
            if (r2 != 0) goto L29
            android.widget.TextView r2 = r1.textView
            android.view.ViewGroup$LayoutParams r2 = r2.getLayoutParams()
            android.view.ViewGroup$MarginLayoutParams r2 = (android.view.ViewGroup.MarginLayoutParams) r2
            android.content.res.Resources r3 = r1.getResources()
            int r4 = com.google.android.material.R.dimen.m3_searchbar_text_margin_start_no_navigation_icon
            int r3 = r3.getDimensionPixelSize(r4)
            androidx.core.view.MarginLayoutParamsCompat.setMarginStart(r2, r3)
        L29:
            return
    }

    private void layoutCenterView() {
            r9 = this;
            android.view.View r0 = r9.centerView
            if (r0 != 0) goto L5
            return
        L5:
            int r0 = r0.getMeasuredWidth()
            int r1 = r9.getMeasuredWidth()
            int r1 = r1 / 2
            int r2 = r0 / 2
            int r5 = r1 - r2
            int r7 = r5 + r0
            android.view.View r0 = r9.centerView
            int r0 = r0.getMeasuredHeight()
            int r1 = r9.getMeasuredHeight()
            int r1 = r1 / 2
            int r2 = r0 / 2
            int r6 = r1 - r2
            int r8 = r6 + r0
            android.view.View r4 = r9.centerView
            r3 = r9
            r3.layoutChild(r4, r5, r6, r7, r8)
            return
    }

    private void layoutChild(android.view.View r3, int r4, int r5, int r6, int r7) {
            r2 = this;
            int r0 = androidx.core.view.ViewCompat.getLayoutDirection(r2)
            r1 = 1
            if (r0 != r1) goto L15
            int r0 = r2.getMeasuredWidth()
            int r0 = r0 - r6
            int r6 = r2.getMeasuredWidth()
            int r6 = r6 - r4
            r3.layout(r0, r5, r6, r7)
            goto L18
        L15:
            r3.layout(r4, r5, r6, r7)
        L18:
            return
    }

    private android.graphics.drawable.Drawable maybeTintNavigationIcon(android.graphics.drawable.Drawable r2) {
            r1 = this;
            boolean r0 = r1.tintNavigationIcon
            if (r0 == 0) goto L28
            if (r2 != 0) goto L7
            goto L28
        L7:
            java.lang.Integer r0 = r1.navigationIconTint
            if (r0 == 0) goto L10
            int r0 = r0.intValue()
            goto L1d
        L10:
            android.graphics.drawable.Drawable r0 = r1.defaultNavigationIcon
            if (r2 != r0) goto L17
            int r0 = com.google.android.material.R.attr.colorOnSurfaceVariant
            goto L19
        L17:
            int r0 = com.google.android.material.R.attr.colorOnSurface
        L19:
            int r0 = com.google.android.material.color.MaterialColors.getColor(r1, r0)
        L1d:
            android.graphics.drawable.Drawable r2 = r2.mutate()
            android.graphics.drawable.Drawable r2 = androidx.core.graphics.drawable.DrawableCompat.wrap(r2)
            androidx.core.graphics.drawable.DrawableCompat.setTint(r2, r0)
        L28:
            return r2
    }

    private void measureCenterView(int r2, int r3) {
            r1 = this;
            android.view.View r0 = r1.centerView
            if (r0 == 0) goto L7
            r0.measure(r2, r3)
        L7:
            return
    }

    private void setDefaultMargins() {
            r4 = this;
            boolean r0 = r4.defaultMarginsEnabled
            if (r0 == 0) goto L44
            android.view.ViewGroup$LayoutParams r0 = r4.getLayoutParams()
            boolean r0 = r0 instanceof android.view.ViewGroup.MarginLayoutParams
            if (r0 == 0) goto L44
            android.content.res.Resources r0 = r4.getResources()
            int r1 = com.google.android.material.R.dimen.m3_searchbar_margin_horizontal
            int r1 = r0.getDimensionPixelSize(r1)
            int r2 = r4.getDefaultMarginVerticalResource()
            int r0 = r0.getDimensionPixelSize(r2)
            android.view.ViewGroup$LayoutParams r2 = r4.getLayoutParams()
            android.view.ViewGroup$MarginLayoutParams r2 = (android.view.ViewGroup.MarginLayoutParams) r2
            int r3 = r2.leftMargin
            int r3 = r4.defaultIfZero(r3, r1)
            r2.leftMargin = r3
            int r3 = r2.topMargin
            int r3 = r4.defaultIfZero(r3, r0)
            r2.topMargin = r3
            int r3 = r2.rightMargin
            int r1 = r4.defaultIfZero(r3, r1)
            r2.rightMargin = r1
            int r1 = r2.bottomMargin
            int r0 = r4.defaultIfZero(r1, r0)
            r2.bottomMargin = r0
        L44:
            return
    }

    private void setHandwritingBoundsInsets() {
            r4 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 34
            if (r0 >= r1) goto L7
            return
        L7:
            int r0 = r4.getLayoutDirection()
            r1 = 1
            r2 = 0
            if (r0 != r1) goto L10
            goto L11
        L10:
            r1 = r2
        L11:
            android.widget.ImageButton r0 = com.google.android.material.internal.ToolbarUtils.getNavigationIconButton(r4)
            if (r0 == 0) goto L2e
            boolean r3 = r0.isClickable()
            if (r3 == 0) goto L2e
            if (r1 == 0) goto L29
            int r3 = r4.getWidth()
            int r0 = r0.getLeft()
            int r3 = r3 - r0
            goto L2f
        L29:
            int r3 = r0.getRight()
            goto L2f
        L2e:
            r3 = r2
        L2f:
            androidx.appcompat.widget.ActionMenuView r0 = com.google.android.material.internal.ToolbarUtils.getActionMenuView(r4)
            if (r0 == 0) goto L46
            if (r1 == 0) goto L3d
            int r0 = r0.getRight()
            r2 = r0
            goto L46
        L3d:
            int r2 = r4.getWidth()
            int r0 = r0.getLeft()
            int r2 = r2 - r0
        L46:
            if (r1 == 0) goto L4a
            r0 = r2
            goto L4b
        L4a:
            r0 = r3
        L4b:
            int r0 = -r0
            float r0 = (float) r0
            if (r1 == 0) goto L50
            goto L51
        L50:
            r3 = r2
        L51:
            int r1 = -r3
            float r1 = (float) r1
            r2 = 0
            r4.setHandwritingBoundsOffsets(r0, r2, r1, r2)
            return
    }

    private void setNavigationIconDecorative(boolean r3) {
            r2 = this;
            android.widget.ImageButton r0 = com.google.android.material.internal.ToolbarUtils.getNavigationIconButton(r2)
            if (r0 != 0) goto L7
            return
        L7:
            r1 = r3 ^ 1
            r0.setClickable(r1)
            r1 = r3 ^ 1
            r0.setFocusable(r1)
            android.graphics.drawable.Drawable r1 = r0.getBackground()
            if (r1 == 0) goto L19
            r2.originalNavigationIconBackground = r1
        L19:
            if (r3 == 0) goto L1d
            r3 = 0
            goto L1f
        L1d:
            android.graphics.drawable.Drawable r3 = r2.originalNavigationIconBackground
        L1f:
            r0.setBackgroundDrawable(r3)
            r2.setHandwritingBoundsInsets()
            return
    }

    private void setOrClearDefaultScrollFlags() {
            r3 = this;
            android.view.ViewGroup$LayoutParams r0 = r3.getLayoutParams()
            boolean r0 = r0 instanceof com.google.android.material.appbar.AppBarLayout.LayoutParams
            if (r0 == 0) goto L28
            android.view.ViewGroup$LayoutParams r0 = r3.getLayoutParams()
            com.google.android.material.appbar.AppBarLayout$LayoutParams r0 = (com.google.android.material.appbar.AppBarLayout.LayoutParams) r0
            boolean r1 = r3.defaultScrollFlagsEnabled
            r2 = 53
            if (r1 == 0) goto L1e
            int r1 = r0.getScrollFlags()
            if (r1 != 0) goto L28
            r0.setScrollFlags(r2)
            goto L28
        L1e:
            int r1 = r0.getScrollFlags()
            if (r1 != r2) goto L28
            r1 = 0
            r0.setScrollFlags(r1)
        L28:
            return
    }

    private void setupTouchExplorationStateChangeListener() {
            r1 = this;
            android.view.accessibility.AccessibilityManager r0 = r1.accessibilityManager
            if (r0 == 0) goto L1e
            boolean r0 = r0.isEnabled()
            if (r0 == 0) goto L16
            android.view.accessibility.AccessibilityManager r0 = r1.accessibilityManager
            boolean r0 = r0.isTouchExplorationEnabled()
            if (r0 == 0) goto L16
            r0 = 1
            r1.setFocusableInTouchMode(r0)
        L16:
            com.google.android.material.search.SearchBar$1 r0 = new com.google.android.material.search.SearchBar$1
            r0.<init>(r1)
            r1.addOnAttachStateChangeListener(r0)
        L1e:
            return
    }

    private void validateAttributes(android.util.AttributeSet r3) {
            r2 = this;
            if (r3 != 0) goto L3
            return
        L3:
            java.lang.String r0 = "title"
            java.lang.String r1 = "http://schemas.android.com/apk/res-auto"
            java.lang.String r0 = r3.getAttributeValue(r1, r0)
            if (r0 != 0) goto L1e
            java.lang.String r0 = "subtitle"
            java.lang.String r3 = r3.getAttributeValue(r1, r0)
            if (r3 != 0) goto L16
            return
        L16:
            java.lang.UnsupportedOperationException r3 = new java.lang.UnsupportedOperationException
            java.lang.String r0 = "SearchBar does not support subtitle. Use hint or text instead."
            r3.<init>(r0)
            throw r3
        L1e:
            java.lang.UnsupportedOperationException r3 = new java.lang.UnsupportedOperationException
            java.lang.String r0 = "SearchBar does not support title. Use hint or text instead."
            r3.<init>(r0)
            throw r3
    }

    public void addCollapseAnimationListener(android.animation.AnimatorListenerAdapter r2) {
            r1 = this;
            com.google.android.material.search.SearchBarAnimationHelper r0 = r1.searchBarAnimationHelper
            r0.addCollapseAnimationListener(r2)
            return
    }

    public void addExpandAnimationListener(android.animation.AnimatorListenerAdapter r2) {
            r1 = this;
            com.google.android.material.search.SearchBarAnimationHelper r0 = r1.searchBarAnimationHelper
            r0.addExpandAnimationListener(r2)
            return
    }

    public void addOnLoadAnimationCallback(com.google.android.material.search.SearchBar.OnLoadAnimationCallback r2) {
            r1 = this;
            com.google.android.material.search.SearchBarAnimationHelper r0 = r1.searchBarAnimationHelper
            r0.addOnLoadAnimationCallback(r2)
            return
    }

    @Override // android.view.ViewGroup
    public void addView(android.view.View r2, int r3, android.view.ViewGroup.LayoutParams r4) {
            r1 = this;
            boolean r0 = r1.layoutInflated
            if (r0 == 0) goto L12
            android.view.View r0 = r1.centerView
            if (r0 != 0) goto L12
            boolean r0 = r2 instanceof androidx.appcompat.widget.ActionMenuView
            if (r0 != 0) goto L12
            r1.centerView = r2
            r0 = 0
            r2.setAlpha(r0)
        L12:
            super.addView(r2, r3, r4)
            return
    }

    public void clearText() {
            r2 = this;
            android.widget.TextView r0 = r2.textView
            java.lang.String r1 = ""
            r0.setText(r1)
            return
    }

    public boolean collapse(android.view.View r2) {
            r1 = this;
            r0 = 0
            boolean r2 = r1.collapse(r2, r0)
            return r2
    }

    public boolean collapse(android.view.View r2, com.google.android.material.appbar.AppBarLayout r3) {
            r1 = this;
            r0 = 0
            boolean r2 = r1.collapse(r2, r3, r0)
            return r2
    }

    public boolean collapse(android.view.View r2, com.google.android.material.appbar.AppBarLayout r3, boolean r4) {
            r1 = this;
            int r0 = r2.getVisibility()
            if (r0 != 0) goto Lc
            boolean r0 = r1.isCollapsing()
            if (r0 == 0) goto L12
        Lc:
            boolean r0 = r1.isExpanding()
            if (r0 == 0) goto L19
        L12:
            com.google.android.material.search.SearchBarAnimationHelper r0 = r1.searchBarAnimationHelper
            r0.startCollapseAnimation(r1, r2, r3, r4)
            r2 = 1
            return r2
        L19:
            r2 = 0
            return r2
    }

    public boolean expand(android.view.View r2) {
            r1 = this;
            r0 = 0
            boolean r2 = r1.expand(r2, r0)
            return r2
    }

    public boolean expand(android.view.View r2, com.google.android.material.appbar.AppBarLayout r3) {
            r1 = this;
            r0 = 0
            boolean r2 = r1.expand(r2, r3, r0)
            return r2
    }

    public boolean expand(android.view.View r2, com.google.android.material.appbar.AppBarLayout r3, boolean r4) {
            r1 = this;
            int r0 = r2.getVisibility()
            if (r0 == 0) goto Lc
            boolean r0 = r1.isExpanding()
            if (r0 == 0) goto L12
        Lc:
            boolean r0 = r1.isCollapsing()
            if (r0 == 0) goto L19
        L12:
            com.google.android.material.search.SearchBarAnimationHelper r0 = r1.searchBarAnimationHelper
            r0.startExpandAnimation(r1, r2, r3, r4)
            r2 = 1
            return r2
        L19:
            r2 = 0
            return r2
    }

    public android.view.View getCenterView() {
            r1 = this;
            android.view.View r0 = r1.centerView
            return r0
    }

    float getCompatElevation() {
            r1 = this;
            com.google.android.material.shape.MaterialShapeDrawable r0 = r1.backgroundShape
            if (r0 == 0) goto L9
            float r0 = r0.getElevation()
            goto Ld
        L9:
            float r0 = androidx.core.view.ViewCompat.getElevation(r1)
        Ld:
            return r0
    }

    public float getCornerSize() {
            r1 = this;
            com.google.android.material.shape.MaterialShapeDrawable r0 = r1.backgroundShape
            float r0 = r0.getTopLeftCornerResolvedSize()
            return r0
    }

    protected int getDefaultMarginVerticalResource() {
            r1 = this;
            int r0 = com.google.android.material.R.dimen.m3_searchbar_margin_vertical
            return r0
    }

    protected int getDefaultNavigationIconResource() {
            r1 = this;
            int r0 = com.google.android.material.R.drawable.ic_search_black_24
            return r0
    }

    public java.lang.CharSequence getHint() {
            r1 = this;
            android.widget.TextView r0 = r1.textView
            java.lang.CharSequence r0 = r0.getHint()
            return r0
    }

    int getMenuResId() {
            r1 = this;
            int r0 = r1.menuResId
            return r0
    }

    public int getStrokeColor() {
            r1 = this;
            com.google.android.material.shape.MaterialShapeDrawable r0 = r1.backgroundShape
            android.content.res.ColorStateList r0 = r0.getStrokeColor()
            int r0 = r0.getDefaultColor()
            return r0
    }

    public float getStrokeWidth() {
            r1 = this;
            com.google.android.material.shape.MaterialShapeDrawable r0 = r1.backgroundShape
            float r0 = r0.getStrokeWidth()
            return r0
    }

    public java.lang.CharSequence getText() {
            r1 = this;
            android.widget.TextView r0 = r1.textView
            java.lang.CharSequence r0 = r0.getText()
            return r0
    }

    public android.widget.TextView getTextView() {
            r1 = this;
            android.widget.TextView r0 = r1.textView
            return r0
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void inflateMenu(int r4) {
            r3 = this;
            android.view.Menu r0 = r3.getMenu()
            boolean r1 = r0 instanceof androidx.appcompat.view.menu.MenuBuilder
            if (r1 == 0) goto Le
            r2 = r0
            androidx.appcompat.view.menu.MenuBuilder r2 = (androidx.appcompat.view.menu.MenuBuilder) r2
            r2.stopDispatchingItemsChanged()
        Le:
            super.inflateMenu(r4)
            r3.menuResId = r4
            if (r1 == 0) goto L1a
            androidx.appcompat.view.menu.MenuBuilder r0 = (androidx.appcompat.view.menu.MenuBuilder) r0
            r0.startDispatchingItemsChanged()
        L1a:
            return
    }

    public boolean isCollapsing() {
            r1 = this;
            com.google.android.material.search.SearchBarAnimationHelper r0 = r1.searchBarAnimationHelper
            boolean r0 = r0.isCollapsing()
            return r0
    }

    public boolean isDefaultScrollFlagsEnabled() {
            r1 = this;
            boolean r0 = r1.defaultScrollFlagsEnabled
            return r0
    }

    public boolean isExpanding() {
            r1 = this;
            com.google.android.material.search.SearchBarAnimationHelper r0 = r1.searchBarAnimationHelper
            boolean r0 = r0.isExpanding()
            return r0
    }

    public boolean isOnLoadAnimationFadeInEnabled() {
            r1 = this;
            com.google.android.material.search.SearchBarAnimationHelper r0 = r1.searchBarAnimationHelper
            boolean r0 = r0.isOnLoadAnimationFadeInEnabled()
            return r0
    }

    /* JADX INFO: renamed from: lambda$new$0$com-google-android-material-search-SearchBar, reason: not valid java name */
    /* synthetic */ void m662lambda$new$0$comgoogleandroidmaterialsearchSearchBar(boolean r1) {
            r0 = this;
            r0.setFocusableInTouchMode(r1)
            return
    }

    /* JADX INFO: renamed from: lambda$startOnLoadAnimation$1$com-google-android-material-search-SearchBar, reason: not valid java name */
    /* synthetic */ void m663x58362b63() {
            r1 = this;
            com.google.android.material.search.SearchBarAnimationHelper r0 = r1.searchBarAnimationHelper
            r0.startOnLoadAnimation(r1)
            return
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
            r1 = this;
            super.onAttachedToWindow()
            com.google.android.material.shape.MaterialShapeDrawable r0 = r1.backgroundShape
            com.google.android.material.shape.MaterialShapeUtils.setParentAbsoluteElevation(r1, r0)
            r1.setDefaultMargins()
            r1.setOrClearDefaultScrollFlags()
            return
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(android.view.accessibility.AccessibilityNodeInfo r4) {
            r3 = this;
            super.onInitializeAccessibilityNodeInfo(r4)
            java.lang.Class<android.widget.EditText> r0 = android.widget.EditText.class
            java.lang.String r0 = r0.getCanonicalName()
            r4.setClassName(r0)
            boolean r0 = r3.isEnabled()
            r4.setEditable(r0)
            java.lang.CharSequence r0 = r3.getText()
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            java.lang.CharSequence r2 = r3.getHint()
            r4.setHintText(r2)
            r4.setShowingHintText(r1)
            if (r1 == 0) goto L2b
            java.lang.CharSequence r0 = r3.getHint()
        L2b:
            r4.setText(r0)
            return
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean r1, int r2, int r3, int r4, int r5) {
            r0 = this;
            super.onLayout(r1, r2, r3, r4, r5)
            r0.layoutCenterView()
            r0.setHandwritingBoundsInsets()
            return
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.View
    protected void onMeasure(int r1, int r2) {
            r0 = this;
            super.onMeasure(r1, r2)
            r0.measureCenterView(r1, r2)
            return
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.View
    protected void onRestoreInstanceState(android.os.Parcelable r2) {
            r1 = this;
            boolean r0 = r2 instanceof com.google.android.material.search.SearchBar.SavedState
            if (r0 != 0) goto L8
            super.onRestoreInstanceState(r2)
            return
        L8:
            com.google.android.material.search.SearchBar$SavedState r2 = (com.google.android.material.search.SearchBar.SavedState) r2
            android.os.Parcelable r0 = r2.getSuperState()
            super.onRestoreInstanceState(r0)
            java.lang.String r2 = r2.text
            r1.setText(r2)
            return
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.View
    protected android.os.Parcelable onSaveInstanceState() {
            r2 = this;
            com.google.android.material.search.SearchBar$SavedState r0 = new com.google.android.material.search.SearchBar$SavedState
            android.os.Parcelable r1 = super.onSaveInstanceState()
            r0.<init>(r1)
            java.lang.CharSequence r1 = r2.getText()
            if (r1 != 0) goto L11
            r1 = 0
            goto L15
        L11:
            java.lang.String r1 = r1.toString()
        L15:
            r0.text = r1
            return r0
    }

    public boolean removeCollapseAnimationListener(android.animation.AnimatorListenerAdapter r2) {
            r1 = this;
            com.google.android.material.search.SearchBarAnimationHelper r0 = r1.searchBarAnimationHelper
            boolean r2 = r0.removeCollapseAnimationListener(r2)
            return r2
    }

    public boolean removeExpandAnimationListener(android.animation.AnimatorListenerAdapter r2) {
            r1 = this;
            com.google.android.material.search.SearchBarAnimationHelper r0 = r1.searchBarAnimationHelper
            boolean r2 = r0.removeExpandAnimationListener(r2)
            return r2
    }

    public boolean removeOnLoadAnimationCallback(com.google.android.material.search.SearchBar.OnLoadAnimationCallback r2) {
            r1 = this;
            com.google.android.material.search.SearchBarAnimationHelper r0 = r1.searchBarAnimationHelper
            boolean r2 = r0.removeOnLoadAnimationCallback(r2)
            return r2
    }

    public void setCenterView(android.view.View r2) {
            r1 = this;
            android.view.View r0 = r1.centerView
            if (r0 == 0) goto La
            r1.removeView(r0)
            r0 = 0
            r1.centerView = r0
        La:
            if (r2 == 0) goto Lf
            r1.addView(r2)
        Lf:
            return
    }

    public void setDefaultScrollFlagsEnabled(boolean r1) {
            r0 = this;
            r0.defaultScrollFlagsEnabled = r1
            r0.setOrClearDefaultScrollFlags()
            return
    }

    @Override // android.view.View
    public void setElevation(float r2) {
            r1 = this;
            super.setElevation(r2)
            com.google.android.material.shape.MaterialShapeDrawable r0 = r1.backgroundShape
            if (r0 == 0) goto La
            r0.setElevation(r2)
        La:
            return
    }

    public void setHint(int r2) {
            r1 = this;
            android.widget.TextView r0 = r1.textView
            r0.setHint(r2)
            return
    }

    public void setHint(java.lang.CharSequence r2) {
            r1 = this;
            android.widget.TextView r0 = r1.textView
            r0.setHint(r2)
            return
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setNavigationIcon(android.graphics.drawable.Drawable r1) {
            r0 = this;
            android.graphics.drawable.Drawable r1 = r0.maybeTintNavigationIcon(r1)
            super.setNavigationIcon(r1)
            return
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setNavigationOnClickListener(android.view.View.OnClickListener r2) {
            r1 = this;
            boolean r0 = r1.forceDefaultNavigationOnClickListener
            if (r0 == 0) goto L5
            return
        L5:
            super.setNavigationOnClickListener(r2)
            if (r2 != 0) goto Lc
            r2 = 1
            goto Ld
        Lc:
            r2 = 0
        Ld:
            r1.setNavigationIconDecorative(r2)
            return
    }

    public void setOnLoadAnimationFadeInEnabled(boolean r2) {
            r1 = this;
            com.google.android.material.search.SearchBarAnimationHelper r0 = r1.searchBarAnimationHelper
            r0.setOnLoadAnimationFadeInEnabled(r2)
            return
    }

    public void setStrokeColor(int r2) {
            r1 = this;
            int r0 = r1.getStrokeColor()
            if (r0 == r2) goto Lf
            com.google.android.material.shape.MaterialShapeDrawable r0 = r1.backgroundShape
            android.content.res.ColorStateList r2 = android.content.res.ColorStateList.valueOf(r2)
            r0.setStrokeColor(r2)
        Lf:
            return
    }

    public void setStrokeWidth(float r2) {
            r1 = this;
            float r0 = r1.getStrokeWidth()
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto Ld
            com.google.android.material.shape.MaterialShapeDrawable r0 = r1.backgroundShape
            r0.setStrokeWidth(r2)
        Ld:
            return
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setSubtitle(java.lang.CharSequence r1) {
            r0 = this;
            return
    }

    public void setText(int r2) {
            r1 = this;
            android.widget.TextView r0 = r1.textView
            r0.setText(r2)
            return
    }

    public void setText(java.lang.CharSequence r2) {
            r1 = this;
            android.widget.TextView r0 = r1.textView
            r0.setText(r2)
            return
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setTitle(java.lang.CharSequence r1) {
            r0 = this;
            return
    }

    public void startOnLoadAnimation() {
            r1 = this;
            com.google.android.material.search.SearchBar$$ExternalSyntheticLambda0 r0 = new com.google.android.material.search.SearchBar$$ExternalSyntheticLambda0
            r0.<init>(r1)
            r1.post(r0)
            return
    }

    public void stopOnLoadAnimation() {
            r1 = this;
            com.google.android.material.search.SearchBarAnimationHelper r0 = r1.searchBarAnimationHelper
            r0.stopOnLoadAnimation(r1)
            return
    }
}
