package com.google.android.material.badge;

/* JADX INFO: loaded from: classes.dex */
public class BadgeDrawable extends android.graphics.drawable.Drawable implements com.google.android.material.internal.TextDrawableHelper.TextDrawableDelegate {
    public static final int BADGE_CONTENT_NOT_TRUNCATED = -2;
    static final int BADGE_RADIUS_NOT_SPECIFIED = -1;

    @java.lang.Deprecated
    public static final int BOTTOM_END = 8388693;

    @java.lang.Deprecated
    public static final int BOTTOM_START = 8388691;
    static final java.lang.String DEFAULT_EXCEED_MAX_BADGE_NUMBER_SUFFIX = "+";
    static final java.lang.String DEFAULT_EXCEED_MAX_BADGE_TEXT_SUFFIX = "…";
    private static final int DEFAULT_STYLE = 0;
    private static final int DEFAULT_THEME_ATTR = 0;
    private static final float FONT_SCALE_THRESHOLD = 0.3f;
    static final int OFFSET_ALIGNMENT_MODE_EDGE = 0;
    static final int OFFSET_ALIGNMENT_MODE_LEGACY = 1;
    private static final java.lang.String TAG = "Badge";
    public static final int TOP_END = 8388661;
    public static final int TOP_START = 8388659;
    private java.lang.ref.WeakReference<android.view.View> anchorViewRef;
    private final android.graphics.Rect badgeBounds;
    private float badgeCenterX;
    private float badgeCenterY;
    private final java.lang.ref.WeakReference<android.content.Context> contextRef;
    private float cornerRadius;
    private java.lang.ref.WeakReference<android.widget.FrameLayout> customBadgeParentRef;
    private float halfBadgeHeight;
    private float halfBadgeWidth;
    private int maxBadgeNumber;
    private final com.google.android.material.shape.MaterialShapeDrawable shapeDrawable;
    private final com.google.android.material.badge.BadgeState state;
    private final com.google.android.material.internal.TextDrawableHelper textDrawableHelper;


    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface BadgeGravity {
    }

    static {
            int r0 = com.google.android.material.R.style.Widget_MaterialComponents_Badge
            com.google.android.material.badge.BadgeDrawable.DEFAULT_STYLE = r0
            int r0 = com.google.android.material.R.attr.badgeStyle
            com.google.android.material.badge.BadgeDrawable.DEFAULT_THEME_ATTR = r0
            return
    }

    private BadgeDrawable(android.content.Context r9, int r10, int r11, int r12, com.google.android.material.badge.BadgeState.State r13) {
            r8 = this;
            r8.<init>()
            java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference
            r0.<init>(r9)
            r8.contextRef = r0
            com.google.android.material.internal.ThemeEnforcement.checkMaterialTheme(r9)
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            r8.badgeBounds = r0
            com.google.android.material.internal.TextDrawableHelper r0 = new com.google.android.material.internal.TextDrawableHelper
            r0.<init>(r8)
            r8.textDrawableHelper = r0
            android.text.TextPaint r0 = r0.getTextPaint()
            android.graphics.Paint$Align r1 = android.graphics.Paint.Align.CENTER
            r0.setTextAlign(r1)
            com.google.android.material.badge.BadgeState r0 = new com.google.android.material.badge.BadgeState
            r2 = r0
            r3 = r9
            r4 = r10
            r5 = r11
            r6 = r12
            r7 = r13
            r2.<init>(r3, r4, r5, r6, r7)
            r8.state = r0
            com.google.android.material.shape.MaterialShapeDrawable r10 = new com.google.android.material.shape.MaterialShapeDrawable
            boolean r11 = r8.hasBadgeContent()
            if (r11 == 0) goto L3e
            int r11 = r0.getBadgeWithTextShapeAppearanceResId()
            goto L42
        L3e:
            int r11 = r0.getBadgeShapeAppearanceResId()
        L42:
            boolean r12 = r8.hasBadgeContent()
            if (r12 == 0) goto L4d
            int r12 = r0.getBadgeWithTextShapeAppearanceOverlayResId()
            goto L51
        L4d:
            int r12 = r0.getBadgeShapeAppearanceOverlayResId()
        L51:
            com.google.android.material.shape.ShapeAppearanceModel$Builder r9 = com.google.android.material.shape.ShapeAppearanceModel.builder(r9, r11, r12)
            com.google.android.material.shape.ShapeAppearanceModel r9 = r9.build()
            r10.<init>(r9)
            r8.shapeDrawable = r10
            r8.restoreState()
            return
    }

    private void autoAdjustWithinGrandparentBounds(android.view.View r7) {
            r6 = this;
            android.widget.FrameLayout r0 = r6.getCustomBadgeParent()
            r1 = 0
            if (r0 != 0) goto L22
            android.view.ViewParent r0 = r7.getParent()
            boolean r0 = r0 instanceof android.view.View
            if (r0 != 0) goto L10
            return
        L10:
            float r0 = r7.getY()
            float r2 = r7.getX()
            android.view.ViewParent r7 = r7.getParent()
            android.view.View r7 = (android.view.View) r7
            r5 = r0
            r0 = r7
            r7 = r5
            goto L42
        L22:
            boolean r7 = r6.isAnchorViewWrappedInCompatParent()
            if (r7 == 0) goto L40
            android.view.ViewParent r7 = r0.getParent()
            boolean r7 = r7 instanceof android.view.View
            if (r7 != 0) goto L31
            return
        L31:
            float r7 = r0.getY()
            float r2 = r0.getX()
            android.view.ViewParent r0 = r0.getParent()
            android.view.View r0 = (android.view.View) r0
            goto L42
        L40:
            r7 = r1
            r2 = r7
        L42:
            float r3 = r6.getTopCutOff(r0, r7)
            float r4 = r6.getLeftCutOff(r0, r2)
            float r7 = r6.getBottomCutOff(r0, r7)
            float r0 = r6.getRightCutoff(r0, r2)
            int r2 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r2 >= 0) goto L5f
            float r2 = r6.badgeCenterY
            float r3 = java.lang.Math.abs(r3)
            float r2 = r2 + r3
            r6.badgeCenterY = r2
        L5f:
            int r2 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r2 >= 0) goto L6c
            float r2 = r6.badgeCenterX
            float r3 = java.lang.Math.abs(r4)
            float r2 = r2 + r3
            r6.badgeCenterX = r2
        L6c:
            int r2 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r2 <= 0) goto L79
            float r2 = r6.badgeCenterY
            float r7 = java.lang.Math.abs(r7)
            float r2 = r2 - r7
            r6.badgeCenterY = r2
        L79:
            int r7 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r7 <= 0) goto L86
            float r7 = r6.badgeCenterX
            float r0 = java.lang.Math.abs(r0)
            float r7 = r7 - r0
            r6.badgeCenterX = r7
        L86:
            return
    }

    private void calculateCenterAndBounds(android.graphics.Rect r6, android.view.View r7) {
            r5 = this;
            boolean r0 = r5.hasBadgeContent()
            if (r0 == 0) goto Lb
            com.google.android.material.badge.BadgeState r0 = r5.state
            float r0 = r0.badgeWithTextRadius
            goto Lf
        Lb:
            com.google.android.material.badge.BadgeState r0 = r5.state
            float r0 = r0.badgeRadius
        Lf:
            r5.cornerRadius = r0
            r1 = -1082130432(0xffffffffbf800000, float:-1.0)
            int r1 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            r2 = 1073741824(0x40000000, float:2.0)
            if (r1 == 0) goto L1e
            r5.halfBadgeWidth = r0
            r5.halfBadgeHeight = r0
            goto L4c
        L1e:
            boolean r0 = r5.hasBadgeContent()
            if (r0 == 0) goto L29
            com.google.android.material.badge.BadgeState r0 = r5.state
            float r0 = r0.badgeWithTextWidth
            goto L2d
        L29:
            com.google.android.material.badge.BadgeState r0 = r5.state
            float r0 = r0.badgeWidth
        L2d:
            float r0 = r0 / r2
            int r0 = java.lang.Math.round(r0)
            float r0 = (float) r0
            r5.halfBadgeWidth = r0
            boolean r0 = r5.hasBadgeContent()
            if (r0 == 0) goto L40
            com.google.android.material.badge.BadgeState r0 = r5.state
            float r0 = r0.badgeWithTextHeight
            goto L44
        L40:
            com.google.android.material.badge.BadgeState r0 = r5.state
            float r0 = r0.badgeHeight
        L44:
            float r0 = r0 / r2
            int r0 = java.lang.Math.round(r0)
            float r0 = (float) r0
            r5.halfBadgeHeight = r0
        L4c:
            boolean r0 = r5.hasBadgeContent()
            if (r0 == 0) goto L8c
            java.lang.String r0 = r5.getBadgeContent()
            float r1 = r5.halfBadgeWidth
            com.google.android.material.internal.TextDrawableHelper r3 = r5.textDrawableHelper
            float r3 = r3.getTextWidth(r0)
            float r3 = r3 / r2
            com.google.android.material.badge.BadgeState r4 = r5.state
            int r4 = r4.getBadgeHorizontalPadding()
            float r4 = (float) r4
            float r3 = r3 + r4
            float r1 = java.lang.Math.max(r1, r3)
            r5.halfBadgeWidth = r1
            float r1 = r5.halfBadgeHeight
            com.google.android.material.internal.TextDrawableHelper r3 = r5.textDrawableHelper
            float r0 = r3.getTextHeight(r0)
            float r0 = r0 / r2
            com.google.android.material.badge.BadgeState r2 = r5.state
            int r2 = r2.getBadgeVerticalPadding()
            float r2 = (float) r2
            float r0 = r0 + r2
            float r0 = java.lang.Math.max(r1, r0)
            r5.halfBadgeHeight = r0
            float r1 = r5.halfBadgeWidth
            float r0 = java.lang.Math.max(r1, r0)
            r5.halfBadgeWidth = r0
        L8c:
            int r0 = r5.getTotalVerticalOffsetForState()
            com.google.android.material.badge.BadgeState r1 = r5.state
            int r1 = r1.getBadgeGravity()
            r2 = 8388691(0x800053, float:1.175506E-38)
            if (r1 == r2) goto La7
            r3 = 8388693(0x800055, float:1.1755063E-38)
            if (r1 == r3) goto La7
            int r1 = r6.top
            int r1 = r1 + r0
            float r0 = (float) r1
            r5.badgeCenterY = r0
            goto Lad
        La7:
            int r1 = r6.bottom
            int r1 = r1 - r0
            float r0 = (float) r1
            r5.badgeCenterY = r0
        Lad:
            int r0 = r5.getTotalHorizontalOffsetForState()
            com.google.android.material.badge.BadgeState r1 = r5.state
            int r1 = r1.getBadgeGravity()
            r3 = 8388659(0x800033, float:1.1755015E-38)
            if (r1 == r3) goto Ld8
            if (r1 == r2) goto Ld8
            int r1 = androidx.core.view.ViewCompat.getLayoutDirection(r7)
            if (r1 != 0) goto Lcd
            int r6 = r6.right
            float r6 = (float) r6
            float r1 = r5.halfBadgeWidth
            float r6 = r6 + r1
            float r0 = (float) r0
            float r6 = r6 - r0
            goto Ld5
        Lcd:
            int r6 = r6.left
            float r6 = (float) r6
            float r1 = r5.halfBadgeWidth
            float r6 = r6 - r1
            float r0 = (float) r0
            float r6 = r6 + r0
        Ld5:
            r5.badgeCenterX = r6
            goto Lf1
        Ld8:
            int r1 = androidx.core.view.ViewCompat.getLayoutDirection(r7)
            if (r1 != 0) goto Le7
            int r6 = r6.left
            float r6 = (float) r6
            float r1 = r5.halfBadgeWidth
            float r6 = r6 - r1
            float r0 = (float) r0
            float r6 = r6 + r0
            goto Lef
        Le7:
            int r6 = r6.right
            float r6 = (float) r6
            float r1 = r5.halfBadgeWidth
            float r6 = r6 + r1
            float r0 = (float) r0
            float r6 = r6 - r0
        Lef:
            r5.badgeCenterX = r6
        Lf1:
            com.google.android.material.badge.BadgeState r6 = r5.state
            boolean r6 = r6.isAutoAdjustedToGrandparentBounds()
            if (r6 == 0) goto Lfc
            r5.autoAdjustWithinGrandparentBounds(r7)
        Lfc:
            return
    }

    public static com.google.android.material.badge.BadgeDrawable create(android.content.Context r7) {
            com.google.android.material.badge.BadgeDrawable r6 = new com.google.android.material.badge.BadgeDrawable
            int r3 = com.google.android.material.badge.BadgeDrawable.DEFAULT_THEME_ATTR
            int r4 = com.google.android.material.badge.BadgeDrawable.DEFAULT_STYLE
            r5 = 0
            r2 = 0
            r0 = r6
            r1 = r7
            r0.<init>(r1, r2, r3, r4, r5)
            return r6
    }

    public static com.google.android.material.badge.BadgeDrawable createFromResource(android.content.Context r7, int r8) {
            com.google.android.material.badge.BadgeDrawable r6 = new com.google.android.material.badge.BadgeDrawable
            int r3 = com.google.android.material.badge.BadgeDrawable.DEFAULT_THEME_ATTR
            int r4 = com.google.android.material.badge.BadgeDrawable.DEFAULT_STYLE
            r5 = 0
            r0 = r6
            r1 = r7
            r2 = r8
            r0.<init>(r1, r2, r3, r4, r5)
            return r6
    }

    static com.google.android.material.badge.BadgeDrawable createFromSavedState(android.content.Context r7, com.google.android.material.badge.BadgeState.State r8) {
            com.google.android.material.badge.BadgeDrawable r6 = new com.google.android.material.badge.BadgeDrawable
            int r3 = com.google.android.material.badge.BadgeDrawable.DEFAULT_THEME_ATTR
            int r4 = com.google.android.material.badge.BadgeDrawable.DEFAULT_STYLE
            r2 = 0
            r0 = r6
            r1 = r7
            r5 = r8
            r0.<init>(r1, r2, r3, r4, r5)
            return r6
    }

    private void drawBadgeContent(android.graphics.Canvas r6) {
            r5 = this;
            java.lang.String r0 = r5.getBadgeContent()
            if (r0 == 0) goto L36
            android.graphics.Rect r1 = new android.graphics.Rect
            r1.<init>()
            com.google.android.material.internal.TextDrawableHelper r2 = r5.textDrawableHelper
            android.text.TextPaint r2 = r2.getTextPaint()
            r3 = 0
            int r4 = r0.length()
            r2.getTextBounds(r0, r3, r4, r1)
            float r2 = r5.badgeCenterY
            float r3 = r1.exactCenterY()
            float r2 = r2 - r3
            float r3 = r5.badgeCenterX
            int r1 = r1.bottom
            if (r1 > 0) goto L28
            int r1 = (int) r2
            goto L2c
        L28:
            int r1 = java.lang.Math.round(r2)
        L2c:
            float r1 = (float) r1
            com.google.android.material.internal.TextDrawableHelper r2 = r5.textDrawableHelper
            android.text.TextPaint r2 = r2.getTextPaint()
            r6.drawText(r0, r3, r1, r2)
        L36:
            return
    }

    private java.lang.String getBadgeContent() {
            r1 = this;
            boolean r0 = r1.hasText()
            if (r0 == 0) goto Lb
            java.lang.String r0 = r1.getTextBadgeText()
            return r0
        Lb:
            boolean r0 = r1.hasNumber()
            if (r0 == 0) goto L16
            java.lang.String r0 = r1.getNumberBadgeText()
            return r0
        L16:
            r0 = 0
            return r0
    }

    private float getBottomCutOff(android.view.View r4, float r5) {
            r3 = this;
            android.view.ViewParent r0 = r4.getParent()
            boolean r0 = r0 instanceof android.view.View
            if (r0 == 0) goto L20
            android.view.ViewParent r0 = r4.getParent()
            android.view.View r0 = (android.view.View) r0
            float r1 = r3.badgeCenterY
            float r2 = r3.halfBadgeHeight
            float r1 = r1 + r2
            int r0 = r0.getHeight()
            float r0 = (float) r0
            float r4 = r4.getY()
            float r0 = r0 - r4
            float r1 = r1 - r0
            float r1 = r1 + r5
            goto L21
        L20:
            r1 = 0
        L21:
            return r1
    }

    private java.lang.CharSequence getEmptyContentDescription() {
            r1 = this;
            com.google.android.material.badge.BadgeState r0 = r1.state
            java.lang.CharSequence r0 = r0.getContentDescriptionNumberless()
            return r0
    }

    private float getLeftCutOff(android.view.View r3, float r4) {
            r2 = this;
            float r0 = r2.badgeCenterX
            float r1 = r2.halfBadgeWidth
            float r0 = r0 - r1
            float r3 = r3.getX()
            float r0 = r0 + r3
            float r0 = r0 + r4
            return r0
    }

    private java.lang.String getNumberBadgeText() {
            r4 = this;
            int r0 = r4.maxBadgeNumber
            r1 = -2
            if (r0 == r1) goto L38
            int r0 = r4.getNumber()
            int r1 = r4.maxBadgeNumber
            if (r0 > r1) goto Le
            goto L38
        Le:
            java.lang.ref.WeakReference<android.content.Context> r0 = r4.contextRef
            java.lang.Object r0 = r0.get()
            android.content.Context r0 = (android.content.Context) r0
            if (r0 != 0) goto L1b
            java.lang.String r0 = ""
            return r0
        L1b:
            com.google.android.material.badge.BadgeState r1 = r4.state
            java.util.Locale r1 = r1.getNumberLocale()
            int r2 = com.google.android.material.R.string.mtrl_exceed_max_badge_number_suffix
            java.lang.String r0 = r0.getString(r2)
            int r2 = r4.maxBadgeNumber
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.String r3 = "+"
            java.lang.Object[] r2 = new java.lang.Object[]{r2, r3}
            java.lang.String r0 = java.lang.String.format(r1, r0, r2)
            return r0
        L38:
            com.google.android.material.badge.BadgeState r0 = r4.state
            java.util.Locale r0 = r0.getNumberLocale()
            java.text.NumberFormat r0 = java.text.NumberFormat.getInstance(r0)
            int r1 = r4.getNumber()
            long r1 = (long) r1
            java.lang.String r0 = r0.format(r1)
            return r0
    }

    private java.lang.String getNumberContentDescription() {
            r4 = this;
            com.google.android.material.badge.BadgeState r0 = r4.state
            int r0 = r0.getContentDescriptionQuantityStrings()
            r1 = 0
            if (r0 == 0) goto L56
            java.lang.ref.WeakReference<android.content.Context> r0 = r4.contextRef
            java.lang.Object r0 = r0.get()
            android.content.Context r0 = (android.content.Context) r0
            if (r0 != 0) goto L14
            return r1
        L14:
            int r1 = r4.maxBadgeNumber
            r2 = -2
            if (r1 == r2) goto L37
            int r1 = r4.getNumber()
            int r2 = r4.maxBadgeNumber
            if (r1 > r2) goto L22
            goto L37
        L22:
            com.google.android.material.badge.BadgeState r1 = r4.state
            int r1 = r1.getContentDescriptionExceedsMaxBadgeNumberStringResource()
            int r2 = r4.maxBadgeNumber
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.Object[] r2 = new java.lang.Object[]{r2}
            java.lang.String r0 = r0.getString(r1, r2)
            return r0
        L37:
            android.content.res.Resources r0 = r0.getResources()
            com.google.android.material.badge.BadgeState r1 = r4.state
            int r1 = r1.getContentDescriptionQuantityStrings()
            int r2 = r4.getNumber()
            int r3 = r4.getNumber()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            java.lang.Object[] r3 = new java.lang.Object[]{r3}
            java.lang.String r0 = r0.getQuantityString(r1, r2, r3)
            return r0
        L56:
            return r1
    }

    private float getRightCutoff(android.view.View r4, float r5) {
            r3 = this;
            android.view.ViewParent r0 = r4.getParent()
            boolean r0 = r0 instanceof android.view.View
            if (r0 == 0) goto L20
            android.view.ViewParent r0 = r4.getParent()
            android.view.View r0 = (android.view.View) r0
            float r1 = r3.badgeCenterX
            float r2 = r3.halfBadgeWidth
            float r1 = r1 + r2
            int r0 = r0.getWidth()
            float r0 = (float) r0
            float r4 = r4.getX()
            float r0 = r0 - r4
            float r1 = r1 - r0
            float r1 = r1 + r5
            goto L21
        L20:
            r1 = 0
        L21:
            return r1
    }

    private java.lang.String getTextBadgeText() {
            r4 = this;
            java.lang.String r0 = r4.getText()
            int r1 = r4.getMaxCharacterCount()
            r2 = -2
            if (r1 != r2) goto Lc
            return r0
        Lc:
            if (r0 == 0) goto L38
            int r2 = r0.length()
            if (r2 <= r1) goto L38
            java.lang.ref.WeakReference<android.content.Context> r2 = r4.contextRef
            java.lang.Object r2 = r2.get()
            android.content.Context r2 = (android.content.Context) r2
            if (r2 != 0) goto L21
            java.lang.String r0 = ""
            return r0
        L21:
            int r1 = r1 + (-1)
            r3 = 0
            java.lang.String r0 = r0.substring(r3, r1)
            int r1 = com.google.android.material.R.string.m3_exceed_max_badge_text_suffix
            java.lang.String r1 = r2.getString(r1)
            java.lang.String r2 = "…"
            java.lang.Object[] r0 = new java.lang.Object[]{r0, r2}
            java.lang.String r0 = java.lang.String.format(r1, r0)
        L38:
            return r0
    }

    private java.lang.CharSequence getTextContentDescription() {
            r1 = this;
            com.google.android.material.badge.BadgeState r0 = r1.state
            java.lang.CharSequence r0 = r0.getContentDescriptionForText()
            if (r0 == 0) goto L9
            return r0
        L9:
            java.lang.String r0 = r1.getText()
            return r0
    }

    private float getTopCutOff(android.view.View r3, float r4) {
            r2 = this;
            float r0 = r2.badgeCenterY
            float r1 = r2.halfBadgeHeight
            float r0 = r0 - r1
            float r3 = r3.getY()
            float r0 = r0 + r3
            float r0 = r0 + r4
            return r0
    }

    private int getTotalHorizontalOffsetForState() {
            r3 = this;
            boolean r0 = r3.hasBadgeContent()
            if (r0 == 0) goto Ld
            com.google.android.material.badge.BadgeState r0 = r3.state
            int r0 = r0.getHorizontalOffsetWithText()
            goto L13
        Ld:
            com.google.android.material.badge.BadgeState r0 = r3.state
            int r0 = r0.getHorizontalOffsetWithoutText()
        L13:
            com.google.android.material.badge.BadgeState r1 = r3.state
            int r1 = r1.offsetAlignmentMode
            r2 = 1
            if (r1 != r2) goto L2a
            boolean r1 = r3.hasBadgeContent()
            if (r1 == 0) goto L25
            com.google.android.material.badge.BadgeState r1 = r3.state
            int r1 = r1.horizontalInsetWithText
            goto L29
        L25:
            com.google.android.material.badge.BadgeState r1 = r3.state
            int r1 = r1.horizontalInset
        L29:
            int r0 = r0 + r1
        L2a:
            com.google.android.material.badge.BadgeState r1 = r3.state
            int r1 = r1.getAdditionalHorizontalOffset()
            int r0 = r0 + r1
            return r0
    }

    private int getTotalVerticalOffsetForState() {
            r5 = this;
            com.google.android.material.badge.BadgeState r0 = r5.state
            int r0 = r0.getVerticalOffsetWithoutText()
            boolean r1 = r5.hasBadgeContent()
            if (r1 == 0) goto L37
            com.google.android.material.badge.BadgeState r0 = r5.state
            int r0 = r0.getVerticalOffsetWithText()
            java.lang.ref.WeakReference<android.content.Context> r1 = r5.contextRef
            java.lang.Object r1 = r1.get()
            android.content.Context r1 = (android.content.Context) r1
            if (r1 == 0) goto L37
            float r1 = com.google.android.material.resources.MaterialResources.getFontScale(r1)
            r2 = 1065353216(0x3f800000, float:1.0)
            float r1 = r1 - r2
            r3 = 0
            r4 = 1050253722(0x3e99999a, float:0.3)
            float r1 = com.google.android.material.animation.AnimationUtils.lerp(r3, r2, r4, r2, r1)
            com.google.android.material.badge.BadgeState r2 = r5.state
            int r2 = r2.getLargeFontVerticalOffsetAdjustment()
            int r2 = r0 - r2
            int r0 = com.google.android.material.animation.AnimationUtils.lerp(r0, r2, r1)
        L37:
            com.google.android.material.badge.BadgeState r1 = r5.state
            int r1 = r1.offsetAlignmentMode
            if (r1 != 0) goto L44
            float r1 = r5.halfBadgeHeight
            int r1 = java.lang.Math.round(r1)
            int r0 = r0 - r1
        L44:
            com.google.android.material.badge.BadgeState r1 = r5.state
            int r1 = r1.getAdditionalVerticalOffset()
            int r0 = r0 + r1
            return r0
    }

    private boolean hasBadgeContent() {
            r1 = this;
            boolean r0 = r1.hasText()
            if (r0 != 0) goto Lf
            boolean r0 = r1.hasNumber()
            if (r0 == 0) goto Ld
            goto Lf
        Ld:
            r0 = 0
            goto L10
        Lf:
            r0 = 1
        L10:
            return r0
    }

    private boolean isAnchorViewWrappedInCompatParent() {
            r2 = this;
            android.widget.FrameLayout r0 = r2.getCustomBadgeParent()
            if (r0 == 0) goto L10
            int r0 = r0.getId()
            int r1 = com.google.android.material.R.id.mtrl_anchor_parent
            if (r0 != r1) goto L10
            r0 = 1
            goto L11
        L10:
            r0 = 0
        L11:
            return r0
    }

    private void onAlphaUpdated() {
            r2 = this;
            com.google.android.material.internal.TextDrawableHelper r0 = r2.textDrawableHelper
            android.text.TextPaint r0 = r0.getTextPaint()
            int r1 = r2.getAlpha()
            r0.setAlpha(r1)
            r2.invalidateSelf()
            return
    }

    private void onBackgroundColorUpdated() {
            r2 = this;
            com.google.android.material.badge.BadgeState r0 = r2.state
            int r0 = r0.getBackgroundColor()
            android.content.res.ColorStateList r0 = android.content.res.ColorStateList.valueOf(r0)
            com.google.android.material.shape.MaterialShapeDrawable r1 = r2.shapeDrawable
            android.content.res.ColorStateList r1 = r1.getFillColor()
            if (r1 == r0) goto L1a
            com.google.android.material.shape.MaterialShapeDrawable r1 = r2.shapeDrawable
            r1.setFillColor(r0)
            r2.invalidateSelf()
        L1a:
            return
    }

    private void onBadgeContentUpdated() {
            r2 = this;
            com.google.android.material.internal.TextDrawableHelper r0 = r2.textDrawableHelper
            r1 = 1
            r0.setTextSizeDirty(r1)
            r2.onBadgeShapeAppearanceUpdated()
            r2.updateCenterAndBounds()
            r2.invalidateSelf()
            return
    }

    private void onBadgeGravityUpdated() {
            r2 = this;
            java.lang.ref.WeakReference<android.view.View> r0 = r2.anchorViewRef
            if (r0 == 0) goto L21
            java.lang.Object r0 = r0.get()
            if (r0 == 0) goto L21
            java.lang.ref.WeakReference<android.view.View> r0 = r2.anchorViewRef
            java.lang.Object r0 = r0.get()
            android.view.View r0 = (android.view.View) r0
            java.lang.ref.WeakReference<android.widget.FrameLayout> r1 = r2.customBadgeParentRef
            if (r1 == 0) goto L1d
            java.lang.Object r1 = r1.get()
            android.widget.FrameLayout r1 = (android.widget.FrameLayout) r1
            goto L1e
        L1d:
            r1 = 0
        L1e:
            r2.updateBadgeCoordinates(r0, r1)
        L21:
            return
    }

    private void onBadgeShapeAppearanceUpdated() {
            r4 = this;
            java.lang.ref.WeakReference<android.content.Context> r0 = r4.contextRef
            java.lang.Object r0 = r0.get()
            android.content.Context r0 = (android.content.Context) r0
            if (r0 != 0) goto Lb
            return
        Lb:
            com.google.android.material.shape.MaterialShapeDrawable r1 = r4.shapeDrawable
            boolean r2 = r4.hasBadgeContent()
            if (r2 == 0) goto L1a
            com.google.android.material.badge.BadgeState r2 = r4.state
            int r2 = r2.getBadgeWithTextShapeAppearanceResId()
            goto L20
        L1a:
            com.google.android.material.badge.BadgeState r2 = r4.state
            int r2 = r2.getBadgeShapeAppearanceResId()
        L20:
            boolean r3 = r4.hasBadgeContent()
            if (r3 == 0) goto L2d
            com.google.android.material.badge.BadgeState r3 = r4.state
            int r3 = r3.getBadgeWithTextShapeAppearanceOverlayResId()
            goto L33
        L2d:
            com.google.android.material.badge.BadgeState r3 = r4.state
            int r3 = r3.getBadgeShapeAppearanceOverlayResId()
        L33:
            com.google.android.material.shape.ShapeAppearanceModel$Builder r0 = com.google.android.material.shape.ShapeAppearanceModel.builder(r0, r2, r3)
            com.google.android.material.shape.ShapeAppearanceModel r0 = r0.build()
            r1.setShapeAppearanceModel(r0)
            r4.invalidateSelf()
            return
    }

    private void onBadgeTextAppearanceUpdated() {
            r3 = this;
            java.lang.ref.WeakReference<android.content.Context> r0 = r3.contextRef
            java.lang.Object r0 = r0.get()
            android.content.Context r0 = (android.content.Context) r0
            if (r0 != 0) goto Lb
            return
        Lb:
            com.google.android.material.resources.TextAppearance r1 = new com.google.android.material.resources.TextAppearance
            com.google.android.material.badge.BadgeState r2 = r3.state
            int r2 = r2.getTextAppearanceResId()
            r1.<init>(r0, r2)
            com.google.android.material.internal.TextDrawableHelper r2 = r3.textDrawableHelper
            com.google.android.material.resources.TextAppearance r2 = r2.getTextAppearance()
            if (r2 != r1) goto L1f
            return
        L1f:
            com.google.android.material.internal.TextDrawableHelper r2 = r3.textDrawableHelper
            r2.setTextAppearance(r1, r0)
            r3.onBadgeTextColorUpdated()
            r3.updateCenterAndBounds()
            r3.invalidateSelf()
            return
    }

    private void onBadgeTextColorUpdated() {
            r2 = this;
            com.google.android.material.internal.TextDrawableHelper r0 = r2.textDrawableHelper
            android.text.TextPaint r0 = r0.getTextPaint()
            com.google.android.material.badge.BadgeState r1 = r2.state
            int r1 = r1.getBadgeTextColor()
            r0.setColor(r1)
            r2.invalidateSelf()
            return
    }

    private void onMaxBadgeLengthUpdated() {
            r2 = this;
            r2.updateMaxBadgeNumber()
            com.google.android.material.internal.TextDrawableHelper r0 = r2.textDrawableHelper
            r1 = 1
            r0.setTextSizeDirty(r1)
            r2.updateCenterAndBounds()
            r2.invalidateSelf()
            return
    }

    private void onNumberUpdated() {
            r1 = this;
            boolean r0 = r1.hasText()
            if (r0 != 0) goto L9
            r1.onBadgeContentUpdated()
        L9:
            return
    }

    private void onTextUpdated() {
            r0 = this;
            r0.onBadgeContentUpdated()
            return
    }

    private void onVisibilityUpdated() {
            r2 = this;
            com.google.android.material.badge.BadgeState r0 = r2.state
            boolean r0 = r0.isVisible()
            r1 = 0
            r2.setVisible(r0, r1)
            boolean r1 = com.google.android.material.badge.BadgeUtils.USE_COMPAT_PARENT
            if (r1 == 0) goto L23
            android.widget.FrameLayout r1 = r2.getCustomBadgeParent()
            if (r1 == 0) goto L23
            if (r0 != 0) goto L23
            android.widget.FrameLayout r0 = r2.getCustomBadgeParent()
            android.view.ViewParent r0 = r0.getParent()
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            r0.invalidate()
        L23:
            return
    }

    private void restoreState() {
            r0 = this;
            r0.onBadgeShapeAppearanceUpdated()
            r0.onBadgeTextAppearanceUpdated()
            r0.onMaxBadgeLengthUpdated()
            r0.onBadgeContentUpdated()
            r0.onAlphaUpdated()
            r0.onBackgroundColorUpdated()
            r0.onBadgeTextColorUpdated()
            r0.onBadgeGravityUpdated()
            r0.updateCenterAndBounds()
            r0.onVisibilityUpdated()
            return
    }

    private void tryWrapAnchorInCompatParent(android.view.View r6) {
            r5 = this;
            android.view.ViewParent r0 = r6.getParent()
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            if (r0 == 0) goto L10
            int r1 = r0.getId()
            int r2 = com.google.android.material.R.id.mtrl_anchor_parent
            if (r1 == r2) goto L1a
        L10:
            java.lang.ref.WeakReference<android.widget.FrameLayout> r1 = r5.customBadgeParentRef
            if (r1 == 0) goto L1b
            java.lang.Object r1 = r1.get()
            if (r1 != r0) goto L1b
        L1a:
            return
        L1b:
            updateAnchorParentToNotClip(r6)
            android.widget.FrameLayout r1 = new android.widget.FrameLayout
            android.content.Context r2 = r6.getContext()
            r1.<init>(r2)
            int r2 = com.google.android.material.R.id.mtrl_anchor_parent
            r1.setId(r2)
            r2 = 0
            r1.setClipChildren(r2)
            r1.setClipToPadding(r2)
            android.view.ViewGroup$LayoutParams r2 = r6.getLayoutParams()
            r1.setLayoutParams(r2)
            int r2 = r6.getWidth()
            r1.setMinimumWidth(r2)
            int r2 = r6.getHeight()
            r1.setMinimumHeight(r2)
            int r2 = r0.indexOfChild(r6)
            r0.removeViewAt(r2)
            android.widget.FrameLayout$LayoutParams r3 = new android.widget.FrameLayout$LayoutParams
            r4 = -1
            r3.<init>(r4, r4)
            r6.setLayoutParams(r3)
            r1.addView(r6)
            r0.addView(r1, r2)
            java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference
            r0.<init>(r1)
            r5.customBadgeParentRef = r0
            com.google.android.material.badge.BadgeDrawable$1 r0 = new com.google.android.material.badge.BadgeDrawable$1
            r0.<init>(r5, r6, r1)
            r1.post(r0)
            return
    }

    private static void updateAnchorParentToNotClip(android.view.View r1) {
            android.view.ViewParent r1 = r1.getParent()
            android.view.ViewGroup r1 = (android.view.ViewGroup) r1
            r0 = 0
            r1.setClipChildren(r0)
            r1.setClipToPadding(r0)
            return
    }

    private void updateCenterAndBounds() {
            r6 = this;
            java.lang.ref.WeakReference<android.content.Context> r0 = r6.contextRef
            java.lang.Object r0 = r0.get()
            android.content.Context r0 = (android.content.Context) r0
            java.lang.ref.WeakReference<android.view.View> r1 = r6.anchorViewRef
            r2 = 0
            if (r1 == 0) goto L14
            java.lang.Object r1 = r1.get()
            android.view.View r1 = (android.view.View) r1
            goto L15
        L14:
            r1 = r2
        L15:
            if (r0 == 0) goto L73
            if (r1 != 0) goto L1a
            goto L73
        L1a:
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            android.graphics.Rect r3 = r6.badgeBounds
            r0.set(r3)
            android.graphics.Rect r3 = new android.graphics.Rect
            r3.<init>()
            r1.getDrawingRect(r3)
            java.lang.ref.WeakReference<android.widget.FrameLayout> r4 = r6.customBadgeParentRef
            if (r4 == 0) goto L36
            java.lang.Object r2 = r4.get()
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2
        L36:
            if (r2 != 0) goto L3c
            boolean r4 = com.google.android.material.badge.BadgeUtils.USE_COMPAT_PARENT
            if (r4 == 0) goto L47
        L3c:
            if (r2 != 0) goto L44
            android.view.ViewParent r2 = r1.getParent()
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2
        L44:
            r2.offsetDescendantRectToMyCoords(r1, r3)
        L47:
            r6.calculateCenterAndBounds(r3, r1)
            android.graphics.Rect r1 = r6.badgeBounds
            float r2 = r6.badgeCenterX
            float r3 = r6.badgeCenterY
            float r4 = r6.halfBadgeWidth
            float r5 = r6.halfBadgeHeight
            com.google.android.material.badge.BadgeUtils.updateBadgeBounds(r1, r2, r3, r4, r5)
            float r1 = r6.cornerRadius
            r2 = -1082130432(0xffffffffbf800000, float:-1.0)
            int r2 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r2 == 0) goto L64
            com.google.android.material.shape.MaterialShapeDrawable r2 = r6.shapeDrawable
            r2.setCornerSize(r1)
        L64:
            android.graphics.Rect r1 = r6.badgeBounds
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L73
            com.google.android.material.shape.MaterialShapeDrawable r0 = r6.shapeDrawable
            android.graphics.Rect r1 = r6.badgeBounds
            r0.setBounds(r1)
        L73:
            return
    }

    private void updateMaxBadgeNumber() {
            r4 = this;
            int r0 = r4.getMaxCharacterCount()
            r1 = -2
            if (r0 == r1) goto L1b
            int r0 = r4.getMaxCharacterCount()
            double r0 = (double) r0
            r2 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            double r0 = r0 - r2
            r2 = 4621819117588971520(0x4024000000000000, double:10.0)
            double r0 = java.lang.Math.pow(r2, r0)
            int r0 = (int) r0
            int r0 = r0 + (-1)
            r4.maxBadgeNumber = r0
            goto L21
        L1b:
            int r0 = r4.getMaxNumber()
            r4.maxBadgeNumber = r0
        L21:
            return
    }

    public void clearNumber() {
            r1 = this;
            com.google.android.material.badge.BadgeState r0 = r1.state
            boolean r0 = r0.hasNumber()
            if (r0 == 0) goto L10
            com.google.android.material.badge.BadgeState r0 = r1.state
            r0.clearNumber()
            r1.onNumberUpdated()
        L10:
            return
    }

    public void clearText() {
            r1 = this;
            com.google.android.material.badge.BadgeState r0 = r1.state
            boolean r0 = r0.hasText()
            if (r0 == 0) goto L10
            com.google.android.material.badge.BadgeState r0 = r1.state
            r0.clearText()
            r1.onTextUpdated()
        L10:
            return
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(android.graphics.Canvas r2) {
            r1 = this;
            android.graphics.Rect r0 = r1.getBounds()
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L25
            int r0 = r1.getAlpha()
            if (r0 == 0) goto L25
            boolean r0 = r1.isVisible()
            if (r0 != 0) goto L17
            goto L25
        L17:
            com.google.android.material.shape.MaterialShapeDrawable r0 = r1.shapeDrawable
            r0.draw(r2)
            boolean r0 = r1.hasBadgeContent()
            if (r0 == 0) goto L25
            r1.drawBadgeContent(r2)
        L25:
            return
    }

    int getAdditionalHorizontalOffset() {
            r1 = this;
            com.google.android.material.badge.BadgeState r0 = r1.state
            int r0 = r0.getAdditionalHorizontalOffset()
            return r0
    }

    int getAdditionalVerticalOffset() {
            r1 = this;
            com.google.android.material.badge.BadgeState r0 = r1.state
            int r0 = r0.getAdditionalVerticalOffset()
            return r0
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
            r1 = this;
            com.google.android.material.badge.BadgeState r0 = r1.state
            int r0 = r0.getAlpha()
            return r0
    }

    public int getBackgroundColor() {
            r1 = this;
            com.google.android.material.shape.MaterialShapeDrawable r0 = r1.shapeDrawable
            android.content.res.ColorStateList r0 = r0.getFillColor()
            int r0 = r0.getDefaultColor()
            return r0
    }

    public int getBadgeGravity() {
            r1 = this;
            com.google.android.material.badge.BadgeState r0 = r1.state
            int r0 = r0.getBadgeGravity()
            return r0
    }

    public java.util.Locale getBadgeNumberLocale() {
            r1 = this;
            com.google.android.material.badge.BadgeState r0 = r1.state
            java.util.Locale r0 = r0.getNumberLocale()
            return r0
    }

    public int getBadgeTextColor() {
            r1 = this;
            com.google.android.material.internal.TextDrawableHelper r0 = r1.textDrawableHelper
            android.text.TextPaint r0 = r0.getTextPaint()
            int r0 = r0.getColor()
            return r0
    }

    public java.lang.CharSequence getContentDescription() {
            r1 = this;
            boolean r0 = r1.isVisible()
            if (r0 != 0) goto L8
            r0 = 0
            return r0
        L8:
            boolean r0 = r1.hasText()
            if (r0 == 0) goto L13
            java.lang.CharSequence r0 = r1.getTextContentDescription()
            return r0
        L13:
            boolean r0 = r1.hasNumber()
            if (r0 == 0) goto L1e
            java.lang.String r0 = r1.getNumberContentDescription()
            return r0
        L1e:
            java.lang.CharSequence r0 = r1.getEmptyContentDescription()
            return r0
    }

    public android.widget.FrameLayout getCustomBadgeParent() {
            r1 = this;
            java.lang.ref.WeakReference<android.widget.FrameLayout> r0 = r1.customBadgeParentRef
            if (r0 == 0) goto Lb
            java.lang.Object r0 = r0.get()
            android.widget.FrameLayout r0 = (android.widget.FrameLayout) r0
            goto Lc
        Lb:
            r0 = 0
        Lc:
            return r0
    }

    public int getHorizontalOffset() {
            r1 = this;
            com.google.android.material.badge.BadgeState r0 = r1.state
            int r0 = r0.getHorizontalOffsetWithoutText()
            return r0
    }

    public int getHorizontalOffsetWithText() {
            r1 = this;
            com.google.android.material.badge.BadgeState r0 = r1.state
            int r0 = r0.getHorizontalOffsetWithText()
            return r0
    }

    public int getHorizontalOffsetWithoutText() {
            r1 = this;
            com.google.android.material.badge.BadgeState r0 = r1.state
            int r0 = r0.getHorizontalOffsetWithoutText()
            return r0
    }

    public int getHorizontalPadding() {
            r1 = this;
            com.google.android.material.badge.BadgeState r0 = r1.state
            int r0 = r0.getBadgeHorizontalPadding()
            return r0
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
            r1 = this;
            android.graphics.Rect r0 = r1.badgeBounds
            int r0 = r0.height()
            return r0
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
            r1 = this;
            android.graphics.Rect r0 = r1.badgeBounds
            int r0 = r0.width()
            return r0
    }

    public int getLargeFontVerticalOffsetAdjustment() {
            r1 = this;
            com.google.android.material.badge.BadgeState r0 = r1.state
            int r0 = r0.getLargeFontVerticalOffsetAdjustment()
            return r0
    }

    public int getMaxCharacterCount() {
            r1 = this;
            com.google.android.material.badge.BadgeState r0 = r1.state
            int r0 = r0.getMaxCharacterCount()
            return r0
    }

    public int getMaxNumber() {
            r1 = this;
            com.google.android.material.badge.BadgeState r0 = r1.state
            int r0 = r0.getMaxNumber()
            return r0
    }

    public int getNumber() {
            r1 = this;
            com.google.android.material.badge.BadgeState r0 = r1.state
            boolean r0 = r0.hasNumber()
            if (r0 == 0) goto Lf
            com.google.android.material.badge.BadgeState r0 = r1.state
            int r0 = r0.getNumber()
            goto L10
        Lf:
            r0 = 0
        L10:
            return r0
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
            r1 = this;
            r0 = -3
            return r0
    }

    com.google.android.material.badge.BadgeState.State getSavedState() {
            r1 = this;
            com.google.android.material.badge.BadgeState r0 = r1.state
            com.google.android.material.badge.BadgeState$State r0 = r0.getOverridingState()
            return r0
    }

    public java.lang.String getText() {
            r1 = this;
            com.google.android.material.badge.BadgeState r0 = r1.state
            java.lang.String r0 = r0.getText()
            return r0
    }

    public int getVerticalOffset() {
            r1 = this;
            com.google.android.material.badge.BadgeState r0 = r1.state
            int r0 = r0.getVerticalOffsetWithoutText()
            return r0
    }

    public int getVerticalOffsetWithText() {
            r1 = this;
            com.google.android.material.badge.BadgeState r0 = r1.state
            int r0 = r0.getVerticalOffsetWithText()
            return r0
    }

    public int getVerticalOffsetWithoutText() {
            r1 = this;
            com.google.android.material.badge.BadgeState r0 = r1.state
            int r0 = r0.getVerticalOffsetWithoutText()
            return r0
    }

    public int getVerticalPadding() {
            r1 = this;
            com.google.android.material.badge.BadgeState r0 = r1.state
            int r0 = r0.getBadgeVerticalPadding()
            return r0
    }

    public boolean hasNumber() {
            r1 = this;
            com.google.android.material.badge.BadgeState r0 = r1.state
            boolean r0 = r0.hasText()
            if (r0 != 0) goto L12
            com.google.android.material.badge.BadgeState r0 = r1.state
            boolean r0 = r0.hasNumber()
            if (r0 == 0) goto L12
            r0 = 1
            goto L13
        L12:
            r0 = 0
        L13:
            return r0
    }

    public boolean hasText() {
            r1 = this;
            com.google.android.material.badge.BadgeState r0 = r1.state
            boolean r0 = r0.hasText()
            return r0
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // android.graphics.drawable.Drawable, com.google.android.material.internal.TextDrawableHelper.TextDrawableDelegate
    public boolean onStateChange(int[] r1) {
            r0 = this;
            boolean r1 = super.onStateChange(r1)
            return r1
    }

    @Override // com.google.android.material.internal.TextDrawableHelper.TextDrawableDelegate
    public void onTextSizeChange() {
            r0 = this;
            r0.invalidateSelf()
            return
    }

    void setAdditionalHorizontalOffset(int r2) {
            r1 = this;
            com.google.android.material.badge.BadgeState r0 = r1.state
            r0.setAdditionalHorizontalOffset(r2)
            r1.updateCenterAndBounds()
            return
    }

    void setAdditionalVerticalOffset(int r2) {
            r1 = this;
            com.google.android.material.badge.BadgeState r0 = r1.state
            r0.setAdditionalVerticalOffset(r2)
            r1.updateCenterAndBounds()
            return
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int r2) {
            r1 = this;
            com.google.android.material.badge.BadgeState r0 = r1.state
            r0.setAlpha(r2)
            r1.onAlphaUpdated()
            return
    }

    public void setAutoAdjustToWithinGrandparentBounds(boolean r2) {
            r1 = this;
            com.google.android.material.badge.BadgeState r0 = r1.state
            boolean r0 = r0.isAutoAdjustedToGrandparentBounds()
            if (r0 != r2) goto L9
            return
        L9:
            com.google.android.material.badge.BadgeState r0 = r1.state
            r0.setAutoAdjustToGrandparentBounds(r2)
            java.lang.ref.WeakReference<android.view.View> r2 = r1.anchorViewRef
            if (r2 == 0) goto L23
            java.lang.Object r2 = r2.get()
            if (r2 == 0) goto L23
            java.lang.ref.WeakReference<android.view.View> r2 = r1.anchorViewRef
            java.lang.Object r2 = r2.get()
            android.view.View r2 = (android.view.View) r2
            r1.autoAdjustWithinGrandparentBounds(r2)
        L23:
            return
    }

    public void setBackgroundColor(int r2) {
            r1 = this;
            com.google.android.material.badge.BadgeState r0 = r1.state
            r0.setBackgroundColor(r2)
            r1.onBackgroundColorUpdated()
            return
    }

    public void setBadgeGravity(int r3) {
            r2 = this;
            r0 = 8388691(0x800053, float:1.175506E-38)
            if (r3 == r0) goto La
            r0 = 8388693(0x800055, float:1.1755063E-38)
            if (r3 != r0) goto L11
        La:
            java.lang.String r0 = "Badge"
            java.lang.String r1 = "Bottom badge gravities are deprecated; please use a top gravity instead."
            android.util.Log.w(r0, r1)
        L11:
            com.google.android.material.badge.BadgeState r0 = r2.state
            int r0 = r0.getBadgeGravity()
            if (r0 == r3) goto L21
            com.google.android.material.badge.BadgeState r0 = r2.state
            r0.setBadgeGravity(r3)
            r2.onBadgeGravityUpdated()
        L21:
            return
    }

    public void setBadgeNumberLocale(java.util.Locale r2) {
            r1 = this;
            com.google.android.material.badge.BadgeState r0 = r1.state
            java.util.Locale r0 = r0.getNumberLocale()
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L14
            com.google.android.material.badge.BadgeState r0 = r1.state
            r0.setNumberLocale(r2)
            r1.invalidateSelf()
        L14:
            return
    }

    public void setBadgeTextColor(int r2) {
            r1 = this;
            com.google.android.material.internal.TextDrawableHelper r0 = r1.textDrawableHelper
            android.text.TextPaint r0 = r0.getTextPaint()
            int r0 = r0.getColor()
            if (r0 == r2) goto L14
            com.google.android.material.badge.BadgeState r0 = r1.state
            r0.setBadgeTextColor(r2)
            r1.onBadgeTextColorUpdated()
        L14:
            return
    }

    public void setBadgeWithTextShapeAppearance(int r2) {
            r1 = this;
            com.google.android.material.badge.BadgeState r0 = r1.state
            r0.setBadgeWithTextShapeAppearanceResId(r2)
            r1.onBadgeShapeAppearanceUpdated()
            return
    }

    public void setBadgeWithTextShapeAppearanceOverlay(int r2) {
            r1 = this;
            com.google.android.material.badge.BadgeState r0 = r1.state
            r0.setBadgeWithTextShapeAppearanceOverlayResId(r2)
            r1.onBadgeShapeAppearanceUpdated()
            return
    }

    public void setBadgeWithoutTextShapeAppearance(int r2) {
            r1 = this;
            com.google.android.material.badge.BadgeState r0 = r1.state
            r0.setBadgeShapeAppearanceResId(r2)
            r1.onBadgeShapeAppearanceUpdated()
            return
    }

    public void setBadgeWithoutTextShapeAppearanceOverlay(int r2) {
            r1 = this;
            com.google.android.material.badge.BadgeState r0 = r1.state
            r0.setBadgeShapeAppearanceOverlayResId(r2)
            r1.onBadgeShapeAppearanceUpdated()
            return
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(android.graphics.ColorFilter r1) {
            r0 = this;
            return
    }

    public void setContentDescriptionExceedsMaxBadgeNumberStringResource(int r2) {
            r1 = this;
            com.google.android.material.badge.BadgeState r0 = r1.state
            r0.setContentDescriptionExceedsMaxBadgeNumberStringResource(r2)
            return
    }

    public void setContentDescriptionForText(java.lang.CharSequence r2) {
            r1 = this;
            com.google.android.material.badge.BadgeState r0 = r1.state
            r0.setContentDescriptionForText(r2)
            return
    }

    public void setContentDescriptionNumberless(java.lang.CharSequence r2) {
            r1 = this;
            com.google.android.material.badge.BadgeState r0 = r1.state
            r0.setContentDescriptionNumberless(r2)
            return
    }

    public void setContentDescriptionQuantityStringsResource(int r2) {
            r1 = this;
            com.google.android.material.badge.BadgeState r0 = r1.state
            r0.setContentDescriptionQuantityStringsResource(r2)
            return
    }

    public void setHorizontalOffset(int r1) {
            r0 = this;
            r0.setHorizontalOffsetWithoutText(r1)
            r0.setHorizontalOffsetWithText(r1)
            return
    }

    public void setHorizontalOffsetWithText(int r2) {
            r1 = this;
            com.google.android.material.badge.BadgeState r0 = r1.state
            r0.setHorizontalOffsetWithText(r2)
            r1.updateCenterAndBounds()
            return
    }

    public void setHorizontalOffsetWithoutText(int r2) {
            r1 = this;
            com.google.android.material.badge.BadgeState r0 = r1.state
            r0.setHorizontalOffsetWithoutText(r2)
            r1.updateCenterAndBounds()
            return
    }

    public void setHorizontalPadding(int r2) {
            r1 = this;
            com.google.android.material.badge.BadgeState r0 = r1.state
            int r0 = r0.getBadgeHorizontalPadding()
            if (r2 == r0) goto L10
            com.google.android.material.badge.BadgeState r0 = r1.state
            r0.setBadgeHorizontalPadding(r2)
            r1.updateCenterAndBounds()
        L10:
            return
    }

    public void setLargeFontVerticalOffsetAdjustment(int r2) {
            r1 = this;
            com.google.android.material.badge.BadgeState r0 = r1.state
            r0.setLargeFontVerticalOffsetAdjustment(r2)
            r1.updateCenterAndBounds()
            return
    }

    public void setMaxCharacterCount(int r2) {
            r1 = this;
            com.google.android.material.badge.BadgeState r0 = r1.state
            int r0 = r0.getMaxCharacterCount()
            if (r0 == r2) goto L10
            com.google.android.material.badge.BadgeState r0 = r1.state
            r0.setMaxCharacterCount(r2)
            r1.onMaxBadgeLengthUpdated()
        L10:
            return
    }

    public void setMaxNumber(int r2) {
            r1 = this;
            com.google.android.material.badge.BadgeState r0 = r1.state
            int r0 = r0.getMaxNumber()
            if (r0 == r2) goto L10
            com.google.android.material.badge.BadgeState r0 = r1.state
            r0.setMaxNumber(r2)
            r1.onMaxBadgeLengthUpdated()
        L10:
            return
    }

    public void setNumber(int r2) {
            r1 = this;
            r0 = 0
            int r2 = java.lang.Math.max(r0, r2)
            com.google.android.material.badge.BadgeState r0 = r1.state
            int r0 = r0.getNumber()
            if (r0 == r2) goto L15
            com.google.android.material.badge.BadgeState r0 = r1.state
            r0.setNumber(r2)
            r1.onNumberUpdated()
        L15:
            return
    }

    public void setText(java.lang.String r2) {
            r1 = this;
            com.google.android.material.badge.BadgeState r0 = r1.state
            java.lang.String r0 = r0.getText()
            boolean r0 = android.text.TextUtils.equals(r0, r2)
            if (r0 != 0) goto L14
            com.google.android.material.badge.BadgeState r0 = r1.state
            r0.setText(r2)
            r1.onTextUpdated()
        L14:
            return
    }

    public void setTextAppearance(int r2) {
            r1 = this;
            com.google.android.material.badge.BadgeState r0 = r1.state
            r0.setTextAppearanceResId(r2)
            r1.onBadgeTextAppearanceUpdated()
            return
    }

    public void setVerticalOffset(int r1) {
            r0 = this;
            r0.setVerticalOffsetWithoutText(r1)
            r0.setVerticalOffsetWithText(r1)
            return
    }

    public void setVerticalOffsetWithText(int r2) {
            r1 = this;
            com.google.android.material.badge.BadgeState r0 = r1.state
            r0.setVerticalOffsetWithText(r2)
            r1.updateCenterAndBounds()
            return
    }

    public void setVerticalOffsetWithoutText(int r2) {
            r1 = this;
            com.google.android.material.badge.BadgeState r0 = r1.state
            r0.setVerticalOffsetWithoutText(r2)
            r1.updateCenterAndBounds()
            return
    }

    public void setVerticalPadding(int r2) {
            r1 = this;
            com.google.android.material.badge.BadgeState r0 = r1.state
            int r0 = r0.getBadgeVerticalPadding()
            if (r2 == r0) goto L10
            com.google.android.material.badge.BadgeState r0 = r1.state
            r0.setBadgeVerticalPadding(r2)
            r1.updateCenterAndBounds()
        L10:
            return
    }

    public void setVisible(boolean r2) {
            r1 = this;
            com.google.android.material.badge.BadgeState r0 = r1.state
            r0.setVisible(r2)
            r1.onVisibilityUpdated()
            return
    }

    public void updateBadgeCoordinates(android.view.View r2) {
            r1 = this;
            r0 = 0
            r1.updateBadgeCoordinates(r2, r0)
            return
    }

    @java.lang.Deprecated
    public void updateBadgeCoordinates(android.view.View r2, android.view.ViewGroup r3) {
            r1 = this;
            boolean r0 = r3 instanceof android.widget.FrameLayout
            if (r0 == 0) goto La
            android.widget.FrameLayout r3 = (android.widget.FrameLayout) r3
            r1.updateBadgeCoordinates(r2, r3)
            return
        La:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r3 = "customBadgeParent must be a FrameLayout"
            r2.<init>(r3)
            throw r2
    }

    public void updateBadgeCoordinates(android.view.View r2, android.widget.FrameLayout r3) {
            r1 = this;
            java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference
            r0.<init>(r2)
            r1.anchorViewRef = r0
            boolean r0 = com.google.android.material.badge.BadgeUtils.USE_COMPAT_PARENT
            if (r0 == 0) goto L11
            if (r3 != 0) goto L11
            r1.tryWrapAnchorInCompatParent(r2)
            goto L18
        L11:
            java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference
            r0.<init>(r3)
            r1.customBadgeParentRef = r0
        L18:
            boolean r3 = com.google.android.material.badge.BadgeUtils.USE_COMPAT_PARENT
            if (r3 != 0) goto L1f
            updateAnchorParentToNotClip(r2)
        L1f:
            r1.updateCenterAndBounds()
            r1.invalidateSelf()
            return
    }
}
