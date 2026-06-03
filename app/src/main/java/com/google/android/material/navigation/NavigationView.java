package com.google.android.material.navigation;

/* JADX INFO: loaded from: classes.dex */
public class NavigationView extends com.google.android.material.internal.ScrimInsetsFrameLayout implements com.google.android.material.motion.MaterialBackHandler {
    private static final int[] CHECKED_STATE_SET = null;
    private static final int DEF_STYLE_RES = 0;
    private static final int[] DISABLED_STATE_SET = null;
    private static final int PRESENTER_NAVIGATION_VIEW_ID = 1;
    private final androidx.drawerlayout.widget.DrawerLayout.DrawerListener backDrawerListener;
    private final com.google.android.material.motion.MaterialBackOrchestrator backOrchestrator;
    private boolean bottomInsetScrimEnabled;
    private int drawerLayoutCornerSize;
    private final boolean drawerLayoutCornerSizeBackAnimationEnabled;
    private final int drawerLayoutCornerSizeBackAnimationMax;
    com.google.android.material.navigation.NavigationView.OnNavigationItemSelectedListener listener;
    private final int maxWidth;
    private final com.google.android.material.internal.NavigationMenu menu;
    private android.view.MenuInflater menuInflater;
    private android.view.ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener;
    private final com.google.android.material.internal.NavigationMenuPresenter presenter;
    private final com.google.android.material.shape.ShapeableDelegate shapeableDelegate;
    private final com.google.android.material.motion.MaterialSideContainerBackHelper sideContainerBackHelper;
    private final int[] tmpLocation;
    private boolean topInsetScrimEnabled;




    public interface OnNavigationItemSelectedListener {
        boolean onNavigationItemSelected(android.view.MenuItem r1);
    }

    public static class SavedState extends androidx.customview.view.AbsSavedState {
        public static final android.os.Parcelable.Creator<com.google.android.material.navigation.NavigationView.SavedState> CREATOR = null;
        public android.os.Bundle menuState;


        static {
                com.google.android.material.navigation.NavigationView$SavedState$1 r0 = new com.google.android.material.navigation.NavigationView$SavedState$1
                r0.<init>()
                com.google.android.material.navigation.NavigationView.SavedState.CREATOR = r0
                return
        }

        public SavedState(android.os.Parcel r1, java.lang.ClassLoader r2) {
                r0 = this;
                r0.<init>(r1, r2)
                android.os.Bundle r1 = r1.readBundle(r2)
                r0.menuState = r1
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
                android.os.Bundle r2 = r0.menuState
                r1.writeBundle(r2)
                return
        }
    }

    static {
            r0 = 16842912(0x10100a0, float:2.3694006E-38)
            int[] r0 = new int[]{r0}
            com.google.android.material.navigation.NavigationView.CHECKED_STATE_SET = r0
            r0 = -16842910(0xfffffffffefeff62, float:-1.6947497E38)
            int[] r0 = new int[]{r0}
            com.google.android.material.navigation.NavigationView.DISABLED_STATE_SET = r0
            int r0 = com.google.android.material.R.style.Widget_Design_NavigationView
            com.google.android.material.navigation.NavigationView.DEF_STYLE_RES = r0
            return
    }

    public NavigationView(android.content.Context r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0)
            return
    }

    public NavigationView(android.content.Context r2, android.util.AttributeSet r3) {
            r1 = this;
            int r0 = com.google.android.material.R.attr.navigationViewStyle
            r1.<init>(r2, r3, r0)
            return
    }

    public NavigationView(android.content.Context r17, android.util.AttributeSet r18, int r19) {
            r16 = this;
            r0 = r16
            r7 = r18
            r8 = r19
            int r9 = com.google.android.material.navigation.NavigationView.DEF_STYLE_RES
            r1 = r17
            android.content.Context r1 = com.google.android.material.theme.overlay.MaterialThemeOverlay.wrap(r1, r7, r8, r9)
            r0.<init>(r1, r7, r8)
            com.google.android.material.internal.NavigationMenuPresenter r10 = new com.google.android.material.internal.NavigationMenuPresenter
            r10.<init>()
            r0.presenter = r10
            r1 = 2
            int[] r1 = new int[r1]
            r0.tmpLocation = r1
            r11 = 1
            r0.topInsetScrimEnabled = r11
            r0.bottomInsetScrimEnabled = r11
            r12 = 0
            r0.drawerLayoutCornerSize = r12
            com.google.android.material.shape.ShapeableDelegate r1 = com.google.android.material.shape.ShapeableDelegate.create(r16)
            r0.shapeableDelegate = r1
            com.google.android.material.motion.MaterialSideContainerBackHelper r1 = new com.google.android.material.motion.MaterialSideContainerBackHelper
            r1.<init>(r0)
            r0.sideContainerBackHelper = r1
            com.google.android.material.motion.MaterialBackOrchestrator r1 = new com.google.android.material.motion.MaterialBackOrchestrator
            r1.<init>(r0)
            r0.backOrchestrator = r1
            com.google.android.material.navigation.NavigationView$1 r1 = new com.google.android.material.navigation.NavigationView$1
            r1.<init>(r0)
            r0.backDrawerListener = r1
            android.content.Context r13 = r16.getContext()
            com.google.android.material.internal.NavigationMenu r14 = new com.google.android.material.internal.NavigationMenu
            r14.<init>(r13)
            r0.menu = r14
            int[] r3 = com.google.android.material.R.styleable.NavigationView
            int[] r6 = new int[r12]
            r1 = r13
            r2 = r18
            r4 = r19
            r5 = r9
            androidx.appcompat.widget.TintTypedArray r1 = com.google.android.material.internal.ThemeEnforcement.obtainTintedStyledAttributes(r1, r2, r3, r4, r5, r6)
            int r2 = com.google.android.material.R.styleable.NavigationView_android_background
            boolean r2 = r1.hasValue(r2)
            if (r2 == 0) goto L6a
            int r2 = com.google.android.material.R.styleable.NavigationView_android_background
            android.graphics.drawable.Drawable r2 = r1.getDrawable(r2)
            androidx.core.view.ViewCompat.setBackground(r0, r2)
        L6a:
            int r2 = com.google.android.material.R.styleable.NavigationView_drawerLayoutCornerSize
            int r2 = r1.getDimensionPixelSize(r2, r12)
            r0.drawerLayoutCornerSize = r2
            if (r2 != 0) goto L76
            r2 = r11
            goto L77
        L76:
            r2 = r12
        L77:
            r0.drawerLayoutCornerSizeBackAnimationEnabled = r2
            android.content.res.Resources r2 = r16.getResources()
            int r3 = com.google.android.material.R.dimen.m3_navigation_drawer_layout_corner_size
            int r2 = r2.getDimensionPixelSize(r3)
            r0.drawerLayoutCornerSizeBackAnimationMax = r2
            android.graphics.drawable.Drawable r2 = r16.getBackground()
            android.content.res.ColorStateList r3 = com.google.android.material.drawable.DrawableUtils.getColorStateListOrNull(r2)
            if (r2 == 0) goto L91
            if (r3 == 0) goto La9
        L91:
            com.google.android.material.shape.ShapeAppearanceModel$Builder r2 = com.google.android.material.shape.ShapeAppearanceModel.builder(r13, r7, r8, r9)
            com.google.android.material.shape.ShapeAppearanceModel r2 = r2.build()
            com.google.android.material.shape.MaterialShapeDrawable r4 = new com.google.android.material.shape.MaterialShapeDrawable
            r4.<init>(r2)
            if (r3 == 0) goto La3
            r4.setFillColor(r3)
        La3:
            r4.initializeElevationOverlay(r13)
            androidx.core.view.ViewCompat.setBackground(r0, r4)
        La9:
            int r2 = com.google.android.material.R.styleable.NavigationView_elevation
            boolean r2 = r1.hasValue(r2)
            if (r2 == 0) goto Lbb
            int r2 = com.google.android.material.R.styleable.NavigationView_elevation
            int r2 = r1.getDimensionPixelSize(r2, r12)
            float r2 = (float) r2
            r0.setElevation(r2)
        Lbb:
            int r2 = com.google.android.material.R.styleable.NavigationView_android_fitsSystemWindows
            boolean r2 = r1.getBoolean(r2, r12)
            r0.setFitsSystemWindows(r2)
            int r2 = com.google.android.material.R.styleable.NavigationView_android_maxWidth
            int r2 = r1.getDimensionPixelSize(r2, r12)
            r0.maxWidth = r2
            int r2 = com.google.android.material.R.styleable.NavigationView_subheaderColor
            boolean r2 = r1.hasValue(r2)
            r3 = 0
            if (r2 == 0) goto Ldc
            int r2 = com.google.android.material.R.styleable.NavigationView_subheaderColor
            android.content.res.ColorStateList r2 = r1.getColorStateList(r2)
            goto Ldd
        Ldc:
            r2 = r3
        Ldd:
            int r4 = com.google.android.material.R.styleable.NavigationView_subheaderTextAppearance
            boolean r4 = r1.hasValue(r4)
            if (r4 == 0) goto Lec
            int r4 = com.google.android.material.R.styleable.NavigationView_subheaderTextAppearance
            int r4 = r1.getResourceId(r4, r12)
            goto Led
        Lec:
            r4 = r12
        Led:
            r5 = 16842808(0x1010038, float:2.3693715E-38)
            if (r4 != 0) goto Lf8
            if (r2 != 0) goto Lf8
            android.content.res.ColorStateList r2 = r0.createDefaultColorStateList(r5)
        Lf8:
            int r6 = com.google.android.material.R.styleable.NavigationView_itemIconTint
            boolean r6 = r1.hasValue(r6)
            if (r6 == 0) goto L107
            int r5 = com.google.android.material.R.styleable.NavigationView_itemIconTint
            android.content.res.ColorStateList r5 = r1.getColorStateList(r5)
            goto L10b
        L107:
            android.content.res.ColorStateList r5 = r0.createDefaultColorStateList(r5)
        L10b:
            int r6 = com.google.android.material.R.styleable.NavigationView_itemTextAppearance
            boolean r6 = r1.hasValue(r6)
            if (r6 == 0) goto L11a
            int r6 = com.google.android.material.R.styleable.NavigationView_itemTextAppearance
            int r6 = r1.getResourceId(r6, r12)
            goto L11b
        L11a:
            r6 = r12
        L11b:
            int r7 = com.google.android.material.R.styleable.NavigationView_itemTextAppearanceActiveBoldEnabled
            boolean r7 = r1.getBoolean(r7, r11)
            int r8 = com.google.android.material.R.styleable.NavigationView_itemIconSize
            boolean r8 = r1.hasValue(r8)
            if (r8 == 0) goto L132
            int r8 = com.google.android.material.R.styleable.NavigationView_itemIconSize
            int r8 = r1.getDimensionPixelSize(r8, r12)
            r0.setItemIconSize(r8)
        L132:
            int r8 = com.google.android.material.R.styleable.NavigationView_itemTextColor
            boolean r8 = r1.hasValue(r8)
            if (r8 == 0) goto L141
            int r8 = com.google.android.material.R.styleable.NavigationView_itemTextColor
            android.content.res.ColorStateList r8 = r1.getColorStateList(r8)
            goto L142
        L141:
            r8 = r3
        L142:
            if (r6 != 0) goto L14d
            if (r8 != 0) goto L14d
            r8 = 16842806(0x1010036, float:2.369371E-38)
            android.content.res.ColorStateList r8 = r0.createDefaultColorStateList(r8)
        L14d:
            int r9 = com.google.android.material.R.styleable.NavigationView_itemBackground
            android.graphics.drawable.Drawable r9 = r1.getDrawable(r9)
            if (r9 != 0) goto L177
            boolean r15 = r0.hasShapeAppearance(r1)
            if (r15 == 0) goto L177
            android.graphics.drawable.Drawable r9 = r0.createDefaultItemBackground(r1)
            int r15 = com.google.android.material.R.styleable.NavigationView_itemRippleColor
            android.content.res.ColorStateList r15 = com.google.android.material.resources.MaterialResources.getColorStateList(r13, r1, r15)
            if (r15 == 0) goto L177
            android.graphics.drawable.Drawable r11 = r0.createDefaultItemDrawable(r1, r3)
            android.graphics.drawable.RippleDrawable r12 = new android.graphics.drawable.RippleDrawable
            android.content.res.ColorStateList r15 = com.google.android.material.ripple.RippleUtils.sanitizeRippleDrawableColor(r15)
            r12.<init>(r15, r3, r11)
            r10.setItemForeground(r12)
        L177:
            int r3 = com.google.android.material.R.styleable.NavigationView_itemHorizontalPadding
            boolean r3 = r1.hasValue(r3)
            if (r3 == 0) goto L18a
            int r3 = com.google.android.material.R.styleable.NavigationView_itemHorizontalPadding
            r11 = 0
            int r3 = r1.getDimensionPixelSize(r3, r11)
            r0.setItemHorizontalPadding(r3)
            goto L18b
        L18a:
            r11 = 0
        L18b:
            int r3 = com.google.android.material.R.styleable.NavigationView_itemVerticalPadding
            boolean r3 = r1.hasValue(r3)
            if (r3 == 0) goto L19c
            int r3 = com.google.android.material.R.styleable.NavigationView_itemVerticalPadding
            int r3 = r1.getDimensionPixelSize(r3, r11)
            r0.setItemVerticalPadding(r3)
        L19c:
            int r3 = com.google.android.material.R.styleable.NavigationView_dividerInsetStart
            int r3 = r1.getDimensionPixelSize(r3, r11)
            r0.setDividerInsetStart(r3)
            int r3 = com.google.android.material.R.styleable.NavigationView_dividerInsetEnd
            int r3 = r1.getDimensionPixelSize(r3, r11)
            r0.setDividerInsetEnd(r3)
            int r3 = com.google.android.material.R.styleable.NavigationView_subheaderInsetStart
            int r3 = r1.getDimensionPixelSize(r3, r11)
            r0.setSubheaderInsetStart(r3)
            int r3 = com.google.android.material.R.styleable.NavigationView_subheaderInsetEnd
            int r3 = r1.getDimensionPixelSize(r3, r11)
            r0.setSubheaderInsetEnd(r3)
            int r3 = com.google.android.material.R.styleable.NavigationView_topInsetScrimEnabled
            boolean r12 = r0.topInsetScrimEnabled
            boolean r3 = r1.getBoolean(r3, r12)
            r0.setTopInsetScrimEnabled(r3)
            int r3 = com.google.android.material.R.styleable.NavigationView_bottomInsetScrimEnabled
            boolean r12 = r0.bottomInsetScrimEnabled
            boolean r3 = r1.getBoolean(r3, r12)
            r0.setBottomInsetScrimEnabled(r3)
            int r3 = com.google.android.material.R.styleable.NavigationView_itemIconPadding
            int r3 = r1.getDimensionPixelSize(r3, r11)
            int r11 = com.google.android.material.R.styleable.NavigationView_itemMaxLines
            r12 = 1
            int r11 = r1.getInt(r11, r12)
            r0.setItemMaxLines(r11)
            com.google.android.material.navigation.NavigationView$2 r11 = new com.google.android.material.navigation.NavigationView$2
            r11.<init>(r0)
            r14.setCallback(r11)
            r10.setId(r12)
            r10.initForMenu(r13, r14)
            if (r4 == 0) goto L1f9
            r10.setSubheaderTextAppearance(r4)
        L1f9:
            r10.setSubheaderColor(r2)
            r10.setItemIconTintList(r5)
            int r2 = r16.getOverScrollMode()
            r10.setOverScrollMode(r2)
            if (r6 == 0) goto L20b
            r10.setItemTextAppearance(r6)
        L20b:
            r10.setItemTextAppearanceActiveBoldEnabled(r7)
            r10.setItemTextColor(r8)
            r10.setItemBackground(r9)
            r10.setItemIconPadding(r3)
            r14.addMenuPresenter(r10)
            androidx.appcompat.view.menu.MenuView r2 = r10.getMenuView(r0)
            android.view.View r2 = (android.view.View) r2
            r0.addView(r2)
            int r2 = com.google.android.material.R.styleable.NavigationView_menu
            boolean r2 = r1.hasValue(r2)
            if (r2 == 0) goto L236
            int r2 = com.google.android.material.R.styleable.NavigationView_menu
            r3 = 0
            int r2 = r1.getResourceId(r2, r3)
            r0.inflateMenu(r2)
            goto L237
        L236:
            r3 = 0
        L237:
            int r2 = com.google.android.material.R.styleable.NavigationView_headerLayout
            boolean r2 = r1.hasValue(r2)
            if (r2 == 0) goto L248
            int r2 = com.google.android.material.R.styleable.NavigationView_headerLayout
            int r2 = r1.getResourceId(r2, r3)
            r0.inflateHeaderView(r2)
        L248:
            r1.recycle()
            r16.setupInsetScrimsListener()
            return
    }

    static /* synthetic */ com.google.android.material.motion.MaterialBackOrchestrator access$000(com.google.android.material.navigation.NavigationView r0) {
            com.google.android.material.motion.MaterialBackOrchestrator r0 = r0.backOrchestrator
            return r0
    }

    static /* synthetic */ void access$100(com.google.android.material.navigation.NavigationView r0) {
            r0.maybeClearCornerSizeAnimationForDrawerLayout()
            return
    }

    static /* synthetic */ int[] access$200(com.google.android.material.navigation.NavigationView r0) {
            int[] r0 = r0.tmpLocation
            return r0
    }

    static /* synthetic */ com.google.android.material.internal.NavigationMenuPresenter access$300(com.google.android.material.navigation.NavigationView r0) {
            com.google.android.material.internal.NavigationMenuPresenter r0 = r0.presenter
            return r0
    }

    private android.content.res.ColorStateList createDefaultColorStateList(int r7) {
            r6 = this;
            android.util.TypedValue r0 = new android.util.TypedValue
            r0.<init>()
            android.content.Context r1 = r6.getContext()
            android.content.res.Resources$Theme r1 = r1.getTheme()
            r2 = 1
            boolean r7 = r1.resolveAttribute(r7, r0, r2)
            r1 = 0
            if (r7 != 0) goto L16
            return r1
        L16:
            android.content.Context r7 = r6.getContext()
            int r3 = r0.resourceId
            android.content.res.ColorStateList r7 = androidx.appcompat.content.res.AppCompatResources.getColorStateList(r7, r3)
            android.content.Context r3 = r6.getContext()
            android.content.res.Resources$Theme r3 = r3.getTheme()
            int r4 = androidx.appcompat.R.attr.colorPrimary
            boolean r2 = r3.resolveAttribute(r4, r0, r2)
            if (r2 != 0) goto L31
            return r1
        L31:
            int r0 = r0.data
            int r1 = r7.getDefaultColor()
            android.content.res.ColorStateList r2 = new android.content.res.ColorStateList
            int[] r3 = com.google.android.material.navigation.NavigationView.DISABLED_STATE_SET
            int[] r4 = com.google.android.material.navigation.NavigationView.CHECKED_STATE_SET
            int[] r5 = com.google.android.material.navigation.NavigationView.EMPTY_STATE_SET
            int[][] r4 = new int[][]{r3, r4, r5}
            int r7 = r7.getColorForState(r3, r1)
            int[] r7 = new int[]{r7, r0, r1}
            r2.<init>(r4, r7)
            return r2
    }

    private android.graphics.drawable.Drawable createDefaultItemBackground(androidx.appcompat.widget.TintTypedArray r3) {
            r2 = this;
            android.content.Context r0 = r2.getContext()
            int r1 = com.google.android.material.R.styleable.NavigationView_itemShapeFillColor
            android.content.res.ColorStateList r0 = com.google.android.material.resources.MaterialResources.getColorStateList(r0, r3, r1)
            android.graphics.drawable.Drawable r3 = r2.createDefaultItemDrawable(r3, r0)
            return r3
    }

    private android.graphics.drawable.Drawable createDefaultItemDrawable(androidx.appcompat.widget.TintTypedArray r10, android.content.res.ColorStateList r11) {
            r9 = this;
            int r0 = com.google.android.material.R.styleable.NavigationView_itemShapeAppearance
            r1 = 0
            int r0 = r10.getResourceId(r0, r1)
            int r2 = com.google.android.material.R.styleable.NavigationView_itemShapeAppearanceOverlay
            int r2 = r10.getResourceId(r2, r1)
            com.google.android.material.shape.MaterialShapeDrawable r4 = new com.google.android.material.shape.MaterialShapeDrawable
            android.content.Context r3 = r9.getContext()
            com.google.android.material.shape.ShapeAppearanceModel$Builder r0 = com.google.android.material.shape.ShapeAppearanceModel.builder(r3, r0, r2)
            com.google.android.material.shape.ShapeAppearanceModel r0 = r0.build()
            r4.<init>(r0)
            r4.setFillColor(r11)
            int r11 = com.google.android.material.R.styleable.NavigationView_itemShapeInsetStart
            int r5 = r10.getDimensionPixelSize(r11, r1)
            int r11 = com.google.android.material.R.styleable.NavigationView_itemShapeInsetTop
            int r6 = r10.getDimensionPixelSize(r11, r1)
            int r11 = com.google.android.material.R.styleable.NavigationView_itemShapeInsetEnd
            int r7 = r10.getDimensionPixelSize(r11, r1)
            int r11 = com.google.android.material.R.styleable.NavigationView_itemShapeInsetBottom
            int r8 = r10.getDimensionPixelSize(r11, r1)
            android.graphics.drawable.InsetDrawable r10 = new android.graphics.drawable.InsetDrawable
            r3 = r10
            r3.<init>(r4, r5, r6, r7, r8)
            return r10
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

    private boolean hasShapeAppearance(androidx.appcompat.widget.TintTypedArray r2) {
            r1 = this;
            int r0 = com.google.android.material.R.styleable.NavigationView_itemShapeAppearance
            boolean r0 = r2.hasValue(r0)
            if (r0 != 0) goto L13
            int r0 = com.google.android.material.R.styleable.NavigationView_itemShapeAppearanceOverlay
            boolean r2 = r2.hasValue(r0)
            if (r2 == 0) goto L11
            goto L13
        L11:
            r2 = 0
            goto L14
        L13:
            r2 = 1
        L14:
            return r2
    }

    private void maybeClearCornerSizeAnimationForDrawerLayout() {
            r2 = this;
            boolean r0 = r2.drawerLayoutCornerSizeBackAnimationEnabled
            if (r0 == 0) goto L16
            int r0 = r2.drawerLayoutCornerSize
            if (r0 == 0) goto L16
            r0 = 0
            r2.drawerLayoutCornerSize = r0
            int r0 = r2.getWidth()
            int r1 = r2.getHeight()
            r2.maybeUpdateCornerSizeForDrawerLayout(r0, r1)
        L16:
            return
    }

    private void maybeUpdateCornerSizeForDrawerLayout(int r6, int r7) {
            r5 = this;
            android.view.ViewParent r0 = r5.getParent()
            boolean r0 = r0 instanceof androidx.drawerlayout.widget.DrawerLayout
            if (r0 == 0) goto L79
            android.view.ViewGroup$LayoutParams r0 = r5.getLayoutParams()
            boolean r0 = r0 instanceof androidx.drawerlayout.widget.DrawerLayout.LayoutParams
            if (r0 == 0) goto L79
            int r0 = r5.drawerLayoutCornerSize
            if (r0 > 0) goto L18
            boolean r0 = r5.drawerLayoutCornerSizeBackAnimationEnabled
            if (r0 == 0) goto L79
        L18:
            android.graphics.drawable.Drawable r0 = r5.getBackground()
            boolean r0 = r0 instanceof com.google.android.material.shape.MaterialShapeDrawable
            if (r0 == 0) goto L79
            android.view.ViewGroup$LayoutParams r0 = r5.getLayoutParams()
            androidx.drawerlayout.widget.DrawerLayout$LayoutParams r0 = (androidx.drawerlayout.widget.DrawerLayout.LayoutParams) r0
            int r0 = r0.gravity
            int r1 = androidx.core.view.ViewCompat.getLayoutDirection(r5)
            int r0 = androidx.core.view.GravityCompat.getAbsoluteGravity(r0, r1)
            r1 = 3
            r2 = 1
            if (r0 != r1) goto L36
            r0 = r2
            goto L37
        L36:
            r0 = 0
        L37:
            android.graphics.drawable.Drawable r1 = r5.getBackground()
            com.google.android.material.shape.MaterialShapeDrawable r1 = (com.google.android.material.shape.MaterialShapeDrawable) r1
            com.google.android.material.shape.ShapeAppearanceModel r3 = r1.getShapeAppearanceModel()
            com.google.android.material.shape.ShapeAppearanceModel$Builder r3 = r3.toBuilder()
            int r4 = r5.drawerLayoutCornerSize
            float r4 = (float) r4
            com.google.android.material.shape.ShapeAppearanceModel$Builder r3 = r3.setAllCornerSizes(r4)
            r4 = 0
            if (r0 == 0) goto L56
            r3.setTopLeftCornerSize(r4)
            r3.setBottomLeftCornerSize(r4)
            goto L5c
        L56:
            r3.setTopRightCornerSize(r4)
            r3.setBottomRightCornerSize(r4)
        L5c:
            com.google.android.material.shape.ShapeAppearanceModel r0 = r3.build()
            r1.setShapeAppearanceModel(r0)
            com.google.android.material.shape.ShapeableDelegate r1 = r5.shapeableDelegate
            r1.onShapeAppearanceChanged(r5, r0)
            com.google.android.material.shape.ShapeableDelegate r0 = r5.shapeableDelegate
            android.graphics.RectF r1 = new android.graphics.RectF
            float r6 = (float) r6
            float r7 = (float) r7
            r1.<init>(r4, r4, r6, r7)
            r0.onMaskChanged(r5, r1)
            com.google.android.material.shape.ShapeableDelegate r6 = r5.shapeableDelegate
            r6.setOffsetZeroCornerEdgeBoundsEnabled(r5, r2)
        L79:
            return
    }

    private android.util.Pair<androidx.drawerlayout.widget.DrawerLayout, androidx.drawerlayout.widget.DrawerLayout.LayoutParams> requireDrawerLayoutParent() {
            r3 = this;
            android.view.ViewParent r0 = r3.getParent()
            android.view.ViewGroup$LayoutParams r1 = r3.getLayoutParams()
            boolean r2 = r0 instanceof androidx.drawerlayout.widget.DrawerLayout
            if (r2 == 0) goto L1a
            boolean r2 = r1 instanceof androidx.drawerlayout.widget.DrawerLayout.LayoutParams
            if (r2 == 0) goto L1a
            android.util.Pair r2 = new android.util.Pair
            androidx.drawerlayout.widget.DrawerLayout r0 = (androidx.drawerlayout.widget.DrawerLayout) r0
            androidx.drawerlayout.widget.DrawerLayout$LayoutParams r1 = (androidx.drawerlayout.widget.DrawerLayout.LayoutParams) r1
            r2.<init>(r0, r1)
            return r2
        L1a:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "NavigationView back progress requires the direct parent view to be a DrawerLayout."
            r0.<init>(r1)
            throw r0
    }

    private void setupInsetScrimsListener() {
            r2 = this;
            com.google.android.material.navigation.NavigationView$3 r0 = new com.google.android.material.navigation.NavigationView$3
            r0.<init>(r2)
            r2.onGlobalLayoutListener = r0
            android.view.ViewTreeObserver r0 = r2.getViewTreeObserver()
            android.view.ViewTreeObserver$OnGlobalLayoutListener r1 = r2.onGlobalLayoutListener
            r0.addOnGlobalLayoutListener(r1)
            return
    }

    public void addHeaderView(android.view.View r2) {
            r1 = this;
            com.google.android.material.internal.NavigationMenuPresenter r0 = r1.presenter
            r0.addHeaderView(r2)
            return
    }

    @Override // com.google.android.material.motion.MaterialBackHandler
    public void cancelBackProgress() {
            r1 = this;
            r1.requireDrawerLayoutParent()
            com.google.android.material.motion.MaterialSideContainerBackHelper r0 = r1.sideContainerBackHelper
            r0.cancelBackProgress()
            r1.maybeClearCornerSizeAnimationForDrawerLayout()
            return
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchDraw(android.graphics.Canvas r3) {
            r2 = this;
            com.google.android.material.shape.ShapeableDelegate r0 = r2.shapeableDelegate
            com.google.android.material.navigation.NavigationView$$ExternalSyntheticLambda0 r1 = new com.google.android.material.navigation.NavigationView$$ExternalSyntheticLambda0
            r1.<init>(r2)
            r0.maybeClip(r3, r1)
            return
    }

    com.google.android.material.motion.MaterialSideContainerBackHelper getBackHelper() {
            r1 = this;
            com.google.android.material.motion.MaterialSideContainerBackHelper r0 = r1.sideContainerBackHelper
            return r0
    }

    public android.view.MenuItem getCheckedItem() {
            r1 = this;
            com.google.android.material.internal.NavigationMenuPresenter r0 = r1.presenter
            androidx.appcompat.view.menu.MenuItemImpl r0 = r0.getCheckedItem()
            return r0
    }

    public int getDividerInsetEnd() {
            r1 = this;
            com.google.android.material.internal.NavigationMenuPresenter r0 = r1.presenter
            int r0 = r0.getDividerInsetEnd()
            return r0
    }

    public int getDividerInsetStart() {
            r1 = this;
            com.google.android.material.internal.NavigationMenuPresenter r0 = r1.presenter
            int r0 = r0.getDividerInsetStart()
            return r0
    }

    public int getHeaderCount() {
            r1 = this;
            com.google.android.material.internal.NavigationMenuPresenter r0 = r1.presenter
            int r0 = r0.getHeaderCount()
            return r0
    }

    public android.view.View getHeaderView(int r2) {
            r1 = this;
            com.google.android.material.internal.NavigationMenuPresenter r0 = r1.presenter
            android.view.View r2 = r0.getHeaderView(r2)
            return r2
    }

    public android.graphics.drawable.Drawable getItemBackground() {
            r1 = this;
            com.google.android.material.internal.NavigationMenuPresenter r0 = r1.presenter
            android.graphics.drawable.Drawable r0 = r0.getItemBackground()
            return r0
    }

    public int getItemHorizontalPadding() {
            r1 = this;
            com.google.android.material.internal.NavigationMenuPresenter r0 = r1.presenter
            int r0 = r0.getItemHorizontalPadding()
            return r0
    }

    public int getItemIconPadding() {
            r1 = this;
            com.google.android.material.internal.NavigationMenuPresenter r0 = r1.presenter
            int r0 = r0.getItemIconPadding()
            return r0
    }

    public android.content.res.ColorStateList getItemIconTintList() {
            r1 = this;
            com.google.android.material.internal.NavigationMenuPresenter r0 = r1.presenter
            android.content.res.ColorStateList r0 = r0.getItemTintList()
            return r0
    }

    public int getItemMaxLines() {
            r1 = this;
            com.google.android.material.internal.NavigationMenuPresenter r0 = r1.presenter
            int r0 = r0.getItemMaxLines()
            return r0
    }

    public android.content.res.ColorStateList getItemTextColor() {
            r1 = this;
            com.google.android.material.internal.NavigationMenuPresenter r0 = r1.presenter
            android.content.res.ColorStateList r0 = r0.getItemTextColor()
            return r0
    }

    public int getItemVerticalPadding() {
            r1 = this;
            com.google.android.material.internal.NavigationMenuPresenter r0 = r1.presenter
            int r0 = r0.getItemVerticalPadding()
            return r0
    }

    public android.view.Menu getMenu() {
            r1 = this;
            com.google.android.material.internal.NavigationMenu r0 = r1.menu
            return r0
    }

    public int getSubheaderInsetEnd() {
            r1 = this;
            com.google.android.material.internal.NavigationMenuPresenter r0 = r1.presenter
            int r0 = r0.getSubheaderInsetEnd()
            return r0
    }

    public int getSubheaderInsetStart() {
            r1 = this;
            com.google.android.material.internal.NavigationMenuPresenter r0 = r1.presenter
            int r0 = r0.getSubheaderInsetStart()
            return r0
    }

    @Override // com.google.android.material.motion.MaterialBackHandler
    public void handleBackInvoked() {
            r5 = this;
            android.util.Pair r0 = r5.requireDrawerLayoutParent()
            java.lang.Object r1 = r0.first
            androidx.drawerlayout.widget.DrawerLayout r1 = (androidx.drawerlayout.widget.DrawerLayout) r1
            com.google.android.material.motion.MaterialSideContainerBackHelper r2 = r5.sideContainerBackHelper
            androidx.activity.BackEventCompat r2 = r2.onHandleBackInvoked()
            if (r2 == 0) goto L2b
            int r3 = android.os.Build.VERSION.SDK_INT
            r4 = 34
            if (r3 >= r4) goto L17
            goto L2b
        L17:
            java.lang.Object r0 = r0.second
            androidx.drawerlayout.widget.DrawerLayout$LayoutParams r0 = (androidx.drawerlayout.widget.DrawerLayout.LayoutParams) r0
            int r0 = r0.gravity
            android.animation.Animator$AnimatorListener r3 = com.google.android.material.navigation.DrawerLayoutUtils.getScrimCloseAnimatorListener(r1, r5)
            android.animation.ValueAnimator$AnimatorUpdateListener r1 = com.google.android.material.navigation.DrawerLayoutUtils.getScrimCloseAnimatorUpdateListener(r1)
            com.google.android.material.motion.MaterialSideContainerBackHelper r4 = r5.sideContainerBackHelper
            r4.finishBackProgress(r2, r0, r3, r1)
            return
        L2b:
            r1.closeDrawer(r5)
            return
    }

    public android.view.View inflateHeaderView(int r2) {
            r1 = this;
            com.google.android.material.internal.NavigationMenuPresenter r0 = r1.presenter
            android.view.View r2 = r0.inflateHeaderView(r2)
            return r2
    }

    public void inflateMenu(int r3) {
            r2 = this;
            com.google.android.material.internal.NavigationMenuPresenter r0 = r2.presenter
            r1 = 1
            r0.setUpdateSuspended(r1)
            android.view.MenuInflater r0 = r2.getMenuInflater()
            com.google.android.material.internal.NavigationMenu r1 = r2.menu
            r0.inflate(r3, r1)
            com.google.android.material.internal.NavigationMenuPresenter r3 = r2.presenter
            r0 = 0
            r3.setUpdateSuspended(r0)
            com.google.android.material.internal.NavigationMenuPresenter r3 = r2.presenter
            r3.updateMenuView(r0)
            return
    }

    public boolean isBottomInsetScrimEnabled() {
            r1 = this;
            boolean r0 = r1.bottomInsetScrimEnabled
            return r0
    }

    public boolean isTopInsetScrimEnabled() {
            r1 = this;
            boolean r0 = r1.topInsetScrimEnabled
            return r0
    }

    /* JADX INFO: renamed from: lambda$dispatchDraw$0$com-google-android-material-navigation-NavigationView, reason: not valid java name */
    /* synthetic */ void m661xb790515(android.graphics.Canvas r1) {
            r0 = this;
            super.dispatchDraw(r1)
            return
    }

    @Override // com.google.android.material.internal.ScrimInsetsFrameLayout, android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
            r2 = this;
            super.onAttachedToWindow()
            com.google.android.material.shape.MaterialShapeUtils.setParentAbsoluteElevation(r2)
            android.view.ViewParent r0 = r2.getParent()
            boolean r1 = r0 instanceof androidx.drawerlayout.widget.DrawerLayout
            if (r1 == 0) goto L2d
            com.google.android.material.motion.MaterialBackOrchestrator r1 = r2.backOrchestrator
            boolean r1 = r1.shouldListenForBackCallbacks()
            if (r1 == 0) goto L2d
            androidx.drawerlayout.widget.DrawerLayout r0 = (androidx.drawerlayout.widget.DrawerLayout) r0
            androidx.drawerlayout.widget.DrawerLayout$DrawerListener r1 = r2.backDrawerListener
            r0.removeDrawerListener(r1)
            androidx.drawerlayout.widget.DrawerLayout$DrawerListener r1 = r2.backDrawerListener
            r0.addDrawerListener(r1)
            boolean r0 = r0.isDrawerOpen(r2)
            if (r0 == 0) goto L2d
            com.google.android.material.motion.MaterialBackOrchestrator r0 = r2.backOrchestrator
            r0.startListeningForBackCallbacksWithPriorityOverlay()
        L2d:
            return
    }

    @Override // com.google.android.material.internal.ScrimInsetsFrameLayout, android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
            r2 = this;
            super.onDetachedFromWindow()
            android.view.ViewTreeObserver r0 = r2.getViewTreeObserver()
            android.view.ViewTreeObserver$OnGlobalLayoutListener r1 = r2.onGlobalLayoutListener
            r0.removeOnGlobalLayoutListener(r1)
            android.view.ViewParent r0 = r2.getParent()
            boolean r1 = r0 instanceof androidx.drawerlayout.widget.DrawerLayout
            if (r1 == 0) goto L1b
            androidx.drawerlayout.widget.DrawerLayout r0 = (androidx.drawerlayout.widget.DrawerLayout) r0
            androidx.drawerlayout.widget.DrawerLayout$DrawerListener r1 = r2.backDrawerListener
            r0.removeDrawerListener(r1)
        L1b:
            return
    }

    @Override // com.google.android.material.internal.ScrimInsetsFrameLayout
    protected void onInsetsChanged(androidx.core.view.WindowInsetsCompat r2) {
            r1 = this;
            com.google.android.material.internal.NavigationMenuPresenter r0 = r1.presenter
            r0.dispatchApplyWindowInsets(r2)
            return
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int r4, int r5) {
            r3 = this;
            int r0 = android.view.View.MeasureSpec.getMode(r4)
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = 1073741824(0x40000000, float:2.0)
            if (r0 == r1) goto L14
            if (r0 == 0) goto Ld
            goto L22
        Ld:
            int r4 = r3.maxWidth
            int r4 = android.view.View.MeasureSpec.makeMeasureSpec(r4, r2)
            goto L22
        L14:
            int r4 = android.view.View.MeasureSpec.getSize(r4)
            int r0 = r3.maxWidth
            int r4 = java.lang.Math.min(r4, r0)
            int r4 = android.view.View.MeasureSpec.makeMeasureSpec(r4, r2)
        L22:
            super.onMeasure(r4, r5)
            return
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(android.os.Parcelable r2) {
            r1 = this;
            boolean r0 = r2 instanceof com.google.android.material.navigation.NavigationView.SavedState
            if (r0 != 0) goto L8
            super.onRestoreInstanceState(r2)
            return
        L8:
            com.google.android.material.navigation.NavigationView$SavedState r2 = (com.google.android.material.navigation.NavigationView.SavedState) r2
            android.os.Parcelable r0 = r2.getSuperState()
            super.onRestoreInstanceState(r0)
            com.google.android.material.internal.NavigationMenu r0 = r1.menu
            android.os.Bundle r2 = r2.menuState
            r0.restorePresenterStates(r2)
            return
    }

    @Override // android.view.View
    protected android.os.Parcelable onSaveInstanceState() {
            r3 = this;
            android.os.Parcelable r0 = super.onSaveInstanceState()
            com.google.android.material.navigation.NavigationView$SavedState r1 = new com.google.android.material.navigation.NavigationView$SavedState
            r1.<init>(r0)
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            r1.menuState = r0
            com.google.android.material.internal.NavigationMenu r0 = r3.menu
            android.os.Bundle r2 = r1.menuState
            r0.savePresenterStates(r2)
            return r1
    }

    @Override // android.view.View
    protected void onSizeChanged(int r1, int r2, int r3, int r4) {
            r0 = this;
            super.onSizeChanged(r1, r2, r3, r4)
            r0.maybeUpdateCornerSizeForDrawerLayout(r1, r2)
            return
    }

    public void removeHeaderView(android.view.View r2) {
            r1 = this;
            com.google.android.material.internal.NavigationMenuPresenter r0 = r1.presenter
            r0.removeHeaderView(r2)
            return
    }

    public void setBottomInsetScrimEnabled(boolean r1) {
            r0 = this;
            r0.bottomInsetScrimEnabled = r1
            return
    }

    public void setCheckedItem(int r2) {
            r1 = this;
            com.google.android.material.internal.NavigationMenu r0 = r1.menu
            android.view.MenuItem r2 = r0.findItem(r2)
            if (r2 == 0) goto Lf
            com.google.android.material.internal.NavigationMenuPresenter r0 = r1.presenter
            androidx.appcompat.view.menu.MenuItemImpl r2 = (androidx.appcompat.view.menu.MenuItemImpl) r2
            r0.setCheckedItem(r2)
        Lf:
            return
    }

    public void setCheckedItem(android.view.MenuItem r2) {
            r1 = this;
            com.google.android.material.internal.NavigationMenu r0 = r1.menu
            int r2 = r2.getItemId()
            android.view.MenuItem r2 = r0.findItem(r2)
            if (r2 == 0) goto L14
            com.google.android.material.internal.NavigationMenuPresenter r0 = r1.presenter
            androidx.appcompat.view.menu.MenuItemImpl r2 = (androidx.appcompat.view.menu.MenuItemImpl) r2
            r0.setCheckedItem(r2)
            return
        L14:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Called setCheckedItem(MenuItem) with an item that is not in the current menu."
            r2.<init>(r0)
            throw r2
    }

    public void setDividerInsetEnd(int r2) {
            r1 = this;
            com.google.android.material.internal.NavigationMenuPresenter r0 = r1.presenter
            r0.setDividerInsetEnd(r2)
            return
    }

    public void setDividerInsetStart(int r2) {
            r1 = this;
            com.google.android.material.internal.NavigationMenuPresenter r0 = r1.presenter
            r0.setDividerInsetStart(r2)
            return
    }

    @Override // android.view.View
    public void setElevation(float r1) {
            r0 = this;
            super.setElevation(r1)
            com.google.android.material.shape.MaterialShapeUtils.setElevation(r0, r1)
            return
    }

    public void setForceCompatClippingEnabled(boolean r2) {
            r1 = this;
            com.google.android.material.shape.ShapeableDelegate r0 = r1.shapeableDelegate
            r0.setForceCompatClippingEnabled(r1, r2)
            return
    }

    public void setItemBackground(android.graphics.drawable.Drawable r2) {
            r1 = this;
            com.google.android.material.internal.NavigationMenuPresenter r0 = r1.presenter
            r0.setItemBackground(r2)
            return
    }

    public void setItemBackgroundResource(int r2) {
            r1 = this;
            android.content.Context r0 = r1.getContext()
            android.graphics.drawable.Drawable r2 = androidx.core.content.ContextCompat.getDrawable(r0, r2)
            r1.setItemBackground(r2)
            return
    }

    public void setItemHorizontalPadding(int r2) {
            r1 = this;
            com.google.android.material.internal.NavigationMenuPresenter r0 = r1.presenter
            r0.setItemHorizontalPadding(r2)
            return
    }

    public void setItemHorizontalPaddingResource(int r3) {
            r2 = this;
            com.google.android.material.internal.NavigationMenuPresenter r0 = r2.presenter
            android.content.res.Resources r1 = r2.getResources()
            int r3 = r1.getDimensionPixelSize(r3)
            r0.setItemHorizontalPadding(r3)
            return
    }

    public void setItemIconPadding(int r2) {
            r1 = this;
            com.google.android.material.internal.NavigationMenuPresenter r0 = r1.presenter
            r0.setItemIconPadding(r2)
            return
    }

    public void setItemIconPaddingResource(int r3) {
            r2 = this;
            com.google.android.material.internal.NavigationMenuPresenter r0 = r2.presenter
            android.content.res.Resources r1 = r2.getResources()
            int r3 = r1.getDimensionPixelSize(r3)
            r0.setItemIconPadding(r3)
            return
    }

    public void setItemIconSize(int r2) {
            r1 = this;
            com.google.android.material.internal.NavigationMenuPresenter r0 = r1.presenter
            r0.setItemIconSize(r2)
            return
    }

    public void setItemIconTintList(android.content.res.ColorStateList r2) {
            r1 = this;
            com.google.android.material.internal.NavigationMenuPresenter r0 = r1.presenter
            r0.setItemIconTintList(r2)
            return
    }

    public void setItemMaxLines(int r2) {
            r1 = this;
            com.google.android.material.internal.NavigationMenuPresenter r0 = r1.presenter
            r0.setItemMaxLines(r2)
            return
    }

    public void setItemTextAppearance(int r2) {
            r1 = this;
            com.google.android.material.internal.NavigationMenuPresenter r0 = r1.presenter
            r0.setItemTextAppearance(r2)
            return
    }

    public void setItemTextAppearanceActiveBoldEnabled(boolean r2) {
            r1 = this;
            com.google.android.material.internal.NavigationMenuPresenter r0 = r1.presenter
            r0.setItemTextAppearanceActiveBoldEnabled(r2)
            return
    }

    public void setItemTextColor(android.content.res.ColorStateList r2) {
            r1 = this;
            com.google.android.material.internal.NavigationMenuPresenter r0 = r1.presenter
            r0.setItemTextColor(r2)
            return
    }

    public void setItemVerticalPadding(int r2) {
            r1 = this;
            com.google.android.material.internal.NavigationMenuPresenter r0 = r1.presenter
            r0.setItemVerticalPadding(r2)
            return
    }

    public void setItemVerticalPaddingResource(int r3) {
            r2 = this;
            com.google.android.material.internal.NavigationMenuPresenter r0 = r2.presenter
            android.content.res.Resources r1 = r2.getResources()
            int r3 = r1.getDimensionPixelSize(r3)
            r0.setItemVerticalPadding(r3)
            return
    }

    public void setNavigationItemSelectedListener(com.google.android.material.navigation.NavigationView.OnNavigationItemSelectedListener r1) {
            r0 = this;
            r0.listener = r1
            return
    }

    @Override // android.view.View
    public void setOverScrollMode(int r2) {
            r1 = this;
            super.setOverScrollMode(r2)
            com.google.android.material.internal.NavigationMenuPresenter r0 = r1.presenter
            if (r0 == 0) goto La
            r0.setOverScrollMode(r2)
        La:
            return
    }

    public void setSubheaderInsetEnd(int r2) {
            r1 = this;
            com.google.android.material.internal.NavigationMenuPresenter r0 = r1.presenter
            r0.setSubheaderInsetEnd(r2)
            return
    }

    public void setSubheaderInsetStart(int r2) {
            r1 = this;
            com.google.android.material.internal.NavigationMenuPresenter r0 = r1.presenter
            r0.setSubheaderInsetStart(r2)
            return
    }

    public void setTopInsetScrimEnabled(boolean r1) {
            r0 = this;
            r0.topInsetScrimEnabled = r1
            return
    }

    @Override // com.google.android.material.motion.MaterialBackHandler
    public void startBackProgress(androidx.activity.BackEventCompat r2) {
            r1 = this;
            r1.requireDrawerLayoutParent()
            com.google.android.material.motion.MaterialSideContainerBackHelper r0 = r1.sideContainerBackHelper
            r0.startBackProgress(r2)
            return
    }

    @Override // com.google.android.material.motion.MaterialBackHandler
    public void updateBackProgress(androidx.activity.BackEventCompat r3) {
            r2 = this;
            android.util.Pair r0 = r2.requireDrawerLayoutParent()
            com.google.android.material.motion.MaterialSideContainerBackHelper r1 = r2.sideContainerBackHelper
            java.lang.Object r0 = r0.second
            androidx.drawerlayout.widget.DrawerLayout$LayoutParams r0 = (androidx.drawerlayout.widget.DrawerLayout.LayoutParams) r0
            int r0 = r0.gravity
            r1.updateBackProgress(r3, r0)
            boolean r0 = r2.drawerLayoutCornerSizeBackAnimationEnabled
            if (r0 == 0) goto L31
            com.google.android.material.motion.MaterialSideContainerBackHelper r0 = r2.sideContainerBackHelper
            float r3 = r3.getProgress()
            float r3 = r0.interpolateProgress(r3)
            r0 = 0
            int r1 = r2.drawerLayoutCornerSizeBackAnimationMax
            int r3 = com.google.android.material.animation.AnimationUtils.lerp(r0, r1, r3)
            r2.drawerLayoutCornerSize = r3
            int r3 = r2.getWidth()
            int r0 = r2.getHeight()
            r2.maybeUpdateCornerSizeForDrawerLayout(r3, r0)
        L31:
            return
    }
}
