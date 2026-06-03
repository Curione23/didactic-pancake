package com.google.android.material.card;

/* JADX INFO: loaded from: classes.dex */
class MaterialCardViewHelper {
    private static final float CARD_VIEW_SHADOW_MULTIPLIER = 1.5f;
    private static final int CHECKED_ICON_LAYER_INDEX = 2;
    private static final android.graphics.drawable.Drawable CHECKED_ICON_NONE = null;
    private static final double COS_45 = 0.0d;
    public static final int DEFAULT_FADE_ANIM_DURATION = 300;
    private static final int DEFAULT_STROKE_VALUE = -1;
    private final com.google.android.material.shape.MaterialShapeDrawable bgDrawable;
    private boolean checkable;
    private float checkedAnimationProgress;
    private android.graphics.drawable.Drawable checkedIcon;
    private int checkedIconGravity;
    private int checkedIconMargin;
    private int checkedIconSize;
    private android.content.res.ColorStateList checkedIconTint;
    private android.graphics.drawable.LayerDrawable clickableForegroundDrawable;
    private com.google.android.material.shape.MaterialShapeDrawable compatRippleDrawable;
    private android.graphics.drawable.Drawable fgDrawable;
    private final com.google.android.material.shape.MaterialShapeDrawable foregroundContentDrawable;
    private com.google.android.material.shape.MaterialShapeDrawable foregroundShapeDrawable;
    private android.animation.ValueAnimator iconAnimator;
    private final android.animation.TimeInterpolator iconFadeAnimInterpolator;
    private final int iconFadeInAnimDuration;
    private final int iconFadeOutAnimDuration;
    private boolean isBackgroundOverwritten;
    private final com.google.android.material.card.MaterialCardView materialCardView;
    private android.content.res.ColorStateList rippleColor;
    private android.graphics.drawable.Drawable rippleDrawable;
    private com.google.android.material.shape.ShapeAppearanceModel shapeAppearanceModel;
    private android.content.res.ColorStateList strokeColor;
    private int strokeWidth;
    private final android.graphics.Rect userContentPadding;


    static {
            r0 = 4631530004285489152(0x4046800000000000, double:45.0)
            double r0 = java.lang.Math.toRadians(r0)
            double r0 = java.lang.Math.cos(r0)
            com.google.android.material.card.MaterialCardViewHelper.COS_45 = r0
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            if (r0 > r1) goto L1b
            android.graphics.drawable.ColorDrawable r0 = new android.graphics.drawable.ColorDrawable
            r0.<init>()
            goto L1c
        L1b:
            r0 = 0
        L1c:
            com.google.android.material.card.MaterialCardViewHelper.CHECKED_ICON_NONE = r0
            return
    }

    public MaterialCardViewHelper(com.google.android.material.card.MaterialCardView r5, android.util.AttributeSet r6, int r7, int r8) {
            r4 = this;
            r4.<init>()
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            r4.userContentPadding = r0
            r0 = 0
            r4.isBackgroundOverwritten = r0
            r0 = 0
            r4.checkedAnimationProgress = r0
            r4.materialCardView = r5
            com.google.android.material.shape.MaterialShapeDrawable r1 = new com.google.android.material.shape.MaterialShapeDrawable
            android.content.Context r2 = r5.getContext()
            r1.<init>(r2, r6, r7, r8)
            r4.bgDrawable = r1
            android.content.Context r8 = r5.getContext()
            r1.initializeElevationOverlay(r8)
            r8 = -12303292(0xffffffffff444444, float:-2.6088314E38)
            r1.setShadowColor(r8)
            com.google.android.material.shape.ShapeAppearanceModel r8 = r1.getShapeAppearanceModel()
            com.google.android.material.shape.ShapeAppearanceModel$Builder r8 = r8.toBuilder()
            android.content.Context r1 = r5.getContext()
            int[] r2 = com.google.android.material.R.styleable.CardView
            int r3 = com.google.android.material.R.style.CardView
            android.content.res.TypedArray r6 = r1.obtainStyledAttributes(r6, r2, r7, r3)
            int r7 = com.google.android.material.R.styleable.CardView_cardCornerRadius
            boolean r7 = r6.hasValue(r7)
            if (r7 == 0) goto L4f
            int r7 = com.google.android.material.R.styleable.CardView_cardCornerRadius
            float r7 = r6.getDimension(r7, r0)
            r8.setAllCornerSizes(r7)
        L4f:
            com.google.android.material.shape.MaterialShapeDrawable r7 = new com.google.android.material.shape.MaterialShapeDrawable
            r7.<init>()
            r4.foregroundContentDrawable = r7
            com.google.android.material.shape.ShapeAppearanceModel r7 = r8.build()
            r4.setShapeAppearanceModel(r7)
            android.content.Context r7 = r5.getContext()
            int r8 = com.google.android.material.R.attr.motionEasingLinearInterpolator
            android.animation.TimeInterpolator r0 = com.google.android.material.animation.AnimationUtils.LINEAR_INTERPOLATOR
            android.animation.TimeInterpolator r7 = com.google.android.material.motion.MotionUtils.resolveThemeInterpolator(r7, r8, r0)
            r4.iconFadeAnimInterpolator = r7
            android.content.Context r7 = r5.getContext()
            int r8 = com.google.android.material.R.attr.motionDurationShort2
            r0 = 300(0x12c, float:4.2E-43)
            int r7 = com.google.android.material.motion.MotionUtils.resolveThemeDuration(r7, r8, r0)
            r4.iconFadeInAnimDuration = r7
            android.content.Context r5 = r5.getContext()
            int r7 = com.google.android.material.R.attr.motionDurationShort1
            int r5 = com.google.android.material.motion.MotionUtils.resolveThemeDuration(r5, r7, r0)
            r4.iconFadeOutAnimDuration = r5
            r6.recycle()
            return
    }

    private float calculateActualCornerPadding() {
            r4 = this;
            com.google.android.material.shape.ShapeAppearanceModel r0 = r4.shapeAppearanceModel
            com.google.android.material.shape.CornerTreatment r0 = r0.getTopLeftCorner()
            com.google.android.material.shape.MaterialShapeDrawable r1 = r4.bgDrawable
            float r1 = r1.getTopLeftCornerResolvedSize()
            float r0 = r4.calculateCornerPaddingForCornerTreatment(r0, r1)
            com.google.android.material.shape.ShapeAppearanceModel r1 = r4.shapeAppearanceModel
            com.google.android.material.shape.CornerTreatment r1 = r1.getTopRightCorner()
            com.google.android.material.shape.MaterialShapeDrawable r2 = r4.bgDrawable
            float r2 = r2.getTopRightCornerResolvedSize()
            float r1 = r4.calculateCornerPaddingForCornerTreatment(r1, r2)
            float r0 = java.lang.Math.max(r0, r1)
            com.google.android.material.shape.ShapeAppearanceModel r1 = r4.shapeAppearanceModel
            com.google.android.material.shape.CornerTreatment r1 = r1.getBottomRightCorner()
            com.google.android.material.shape.MaterialShapeDrawable r2 = r4.bgDrawable
            float r2 = r2.getBottomRightCornerResolvedSize()
            float r1 = r4.calculateCornerPaddingForCornerTreatment(r1, r2)
            com.google.android.material.shape.ShapeAppearanceModel r2 = r4.shapeAppearanceModel
            com.google.android.material.shape.CornerTreatment r2 = r2.getBottomLeftCorner()
            com.google.android.material.shape.MaterialShapeDrawable r3 = r4.bgDrawable
            float r3 = r3.getBottomLeftCornerResolvedSize()
            float r2 = r4.calculateCornerPaddingForCornerTreatment(r2, r3)
            float r1 = java.lang.Math.max(r1, r2)
            float r0 = java.lang.Math.max(r0, r1)
            return r0
    }

    private float calculateCornerPaddingForCornerTreatment(com.google.android.material.shape.CornerTreatment r5, float r6) {
            r4 = this;
            boolean r0 = r5 instanceof com.google.android.material.shape.RoundedCornerTreatment
            if (r0 == 0) goto Ld
            r0 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            double r2 = com.google.android.material.card.MaterialCardViewHelper.COS_45
            double r0 = r0 - r2
            double r5 = (double) r6
            double r0 = r0 * r5
            float r5 = (float) r0
            return r5
        Ld:
            boolean r5 = r5 instanceof com.google.android.material.shape.CutCornerTreatment
            if (r5 == 0) goto L15
            r5 = 1073741824(0x40000000, float:2.0)
            float r6 = r6 / r5
            return r6
        L15:
            r5 = 0
            return r5
    }

    private float calculateHorizontalBackgroundPadding() {
            r2 = this;
            com.google.android.material.card.MaterialCardView r0 = r2.materialCardView
            float r0 = r0.getMaxCardElevation()
            boolean r1 = r2.shouldAddCornerPaddingOutsideCardBackground()
            if (r1 == 0) goto L11
            float r1 = r2.calculateActualCornerPadding()
            goto L12
        L11:
            r1 = 0
        L12:
            float r0 = r0 + r1
            return r0
    }

    private float calculateVerticalBackgroundPadding() {
            r2 = this;
            com.google.android.material.card.MaterialCardView r0 = r2.materialCardView
            float r0 = r0.getMaxCardElevation()
            r1 = 1069547520(0x3fc00000, float:1.5)
            float r0 = r0 * r1
            boolean r1 = r2.shouldAddCornerPaddingOutsideCardBackground()
            if (r1 == 0) goto L14
            float r1 = r2.calculateActualCornerPadding()
            goto L15
        L14:
            r1 = 0
        L15:
            float r0 = r0 + r1
            return r0
    }

    private boolean canClipToOutline() {
            r1 = this;
            com.google.android.material.shape.MaterialShapeDrawable r0 = r1.bgDrawable
            boolean r0 = r0.isRoundRect()
            return r0
    }

    private android.graphics.drawable.Drawable createCompatRippleDrawable() {
            r3 = this;
            android.graphics.drawable.StateListDrawable r0 = new android.graphics.drawable.StateListDrawable
            r0.<init>()
            com.google.android.material.shape.MaterialShapeDrawable r1 = r3.createForegroundShapeDrawable()
            r3.compatRippleDrawable = r1
            android.content.res.ColorStateList r2 = r3.rippleColor
            r1.setFillColor(r2)
            r1 = 16842919(0x10100a7, float:2.3694026E-38)
            int[] r1 = new int[]{r1}
            com.google.android.material.shape.MaterialShapeDrawable r2 = r3.compatRippleDrawable
            r0.addState(r1, r2)
            return r0
    }

    private android.graphics.drawable.Drawable createForegroundRippleDrawable() {
            r4 = this;
            boolean r0 = com.google.android.material.ripple.RippleUtils.USE_FRAMEWORK_RIPPLE
            if (r0 == 0) goto L15
            com.google.android.material.shape.MaterialShapeDrawable r0 = r4.createForegroundShapeDrawable()
            r4.foregroundShapeDrawable = r0
            android.graphics.drawable.RippleDrawable r0 = new android.graphics.drawable.RippleDrawable
            android.content.res.ColorStateList r1 = r4.rippleColor
            r2 = 0
            com.google.android.material.shape.MaterialShapeDrawable r3 = r4.foregroundShapeDrawable
            r0.<init>(r1, r2, r3)
            return r0
        L15:
            android.graphics.drawable.Drawable r0 = r4.createCompatRippleDrawable()
            return r0
    }

    private com.google.android.material.shape.MaterialShapeDrawable createForegroundShapeDrawable() {
            r2 = this;
            com.google.android.material.shape.MaterialShapeDrawable r0 = new com.google.android.material.shape.MaterialShapeDrawable
            com.google.android.material.shape.ShapeAppearanceModel r1 = r2.shapeAppearanceModel
            r0.<init>(r1)
            return r0
    }

    private android.graphics.drawable.Drawable getClickableForeground() {
            r4 = this;
            android.graphics.drawable.Drawable r0 = r4.rippleDrawable
            if (r0 != 0) goto La
            android.graphics.drawable.Drawable r0 = r4.createForegroundRippleDrawable()
            r4.rippleDrawable = r0
        La:
            android.graphics.drawable.LayerDrawable r0 = r4.clickableForegroundDrawable
            if (r0 != 0) goto L2c
            android.graphics.drawable.LayerDrawable r0 = new android.graphics.drawable.LayerDrawable
            r1 = 3
            android.graphics.drawable.Drawable[] r1 = new android.graphics.drawable.Drawable[r1]
            r2 = 0
            android.graphics.drawable.Drawable r3 = r4.rippleDrawable
            r1[r2] = r3
            r2 = 1
            com.google.android.material.shape.MaterialShapeDrawable r3 = r4.foregroundContentDrawable
            r1[r2] = r3
            android.graphics.drawable.Drawable r2 = r4.checkedIcon
            r3 = 2
            r1[r3] = r2
            r0.<init>(r1)
            r4.clickableForegroundDrawable = r0
            int r1 = com.google.android.material.R.id.mtrl_card_checked_layer_id
            r0.setId(r3, r1)
        L2c:
            android.graphics.drawable.LayerDrawable r0 = r4.clickableForegroundDrawable
            return r0
    }

    private float getParentCardViewCalculatedCornerPadding() {
            r4 = this;
            com.google.android.material.card.MaterialCardView r0 = r4.materialCardView
            boolean r0 = r0.getPreventCornerOverlap()
            if (r0 == 0) goto L1f
            com.google.android.material.card.MaterialCardView r0 = r4.materialCardView
            boolean r0 = r0.getUseCompatPadding()
            if (r0 == 0) goto L1f
            r0 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            double r2 = com.google.android.material.card.MaterialCardViewHelper.COS_45
            double r0 = r0 - r2
            com.google.android.material.card.MaterialCardView r2 = r4.materialCardView
            float r2 = r2.getCardViewRadius()
            double r2 = (double) r2
            double r0 = r0 * r2
            float r0 = (float) r0
            return r0
        L1f:
            r0 = 0
            return r0
    }

    private android.graphics.drawable.Drawable insetDrawable(android.graphics.drawable.Drawable r9) {
            r8 = this;
            com.google.android.material.card.MaterialCardView r0 = r8.materialCardView
            boolean r0 = r0.getUseCompatPadding()
            if (r0 == 0) goto L1f
            float r0 = r8.calculateVerticalBackgroundPadding()
            double r0 = (double) r0
            double r0 = java.lang.Math.ceil(r0)
            int r0 = (int) r0
            float r1 = r8.calculateHorizontalBackgroundPadding()
            double r1 = (double) r1
            double r1 = java.lang.Math.ceil(r1)
            int r1 = (int) r1
            r7 = r0
            r6 = r1
            goto L22
        L1f:
            r0 = 0
            r6 = r0
            r7 = r6
        L22:
            com.google.android.material.card.MaterialCardViewHelper$1 r0 = new com.google.android.material.card.MaterialCardViewHelper$1
            r1 = r0
            r2 = r8
            r3 = r9
            r4 = r6
            r5 = r7
            r1.<init>(r2, r3, r4, r5, r6, r7)
            return r0
    }

    private boolean isCheckedIconBottom() {
            r2 = this;
            int r0 = r2.checkedIconGravity
            r1 = 80
            r0 = r0 & r1
            if (r0 != r1) goto L9
            r0 = 1
            goto La
        L9:
            r0 = 0
        La:
            return r0
    }

    private boolean isCheckedIconEnd() {
            r2 = this;
            int r0 = r2.checkedIconGravity
            r1 = 8388613(0x800005, float:1.175495E-38)
            r0 = r0 & r1
            if (r0 != r1) goto La
            r0 = 1
            goto Lb
        La:
            r0 = 0
        Lb:
            return r0
    }

    private boolean shouldAddCornerPaddingInsideCardBackground() {
            r1 = this;
            com.google.android.material.card.MaterialCardView r0 = r1.materialCardView
            boolean r0 = r0.getPreventCornerOverlap()
            if (r0 == 0) goto L10
            boolean r0 = r1.canClipToOutline()
            if (r0 != 0) goto L10
            r0 = 1
            goto L11
        L10:
            r0 = 0
        L11:
            return r0
    }

    private boolean shouldAddCornerPaddingOutsideCardBackground() {
            r1 = this;
            com.google.android.material.card.MaterialCardView r0 = r1.materialCardView
            boolean r0 = r0.getPreventCornerOverlap()
            if (r0 == 0) goto L18
            boolean r0 = r1.canClipToOutline()
            if (r0 == 0) goto L18
            com.google.android.material.card.MaterialCardView r0 = r1.materialCardView
            boolean r0 = r0.getUseCompatPadding()
            if (r0 == 0) goto L18
            r0 = 1
            goto L19
        L18:
            r0 = 0
        L19:
            return r0
    }

    private boolean shouldUseClickableForeground() {
            r2 = this;
            com.google.android.material.card.MaterialCardView r0 = r2.materialCardView
            boolean r0 = r0.isClickable()
            if (r0 == 0) goto La
            r0 = 1
            return r0
        La:
            com.google.android.material.card.MaterialCardView r0 = r2.materialCardView
        Lc:
            boolean r1 = r0.isDuplicateParentStateEnabled()
            if (r1 == 0) goto L21
            android.view.ViewParent r1 = r0.getParent()
            boolean r1 = r1 instanceof android.view.View
            if (r1 == 0) goto L21
            android.view.ViewParent r0 = r0.getParent()
            android.view.View r0 = (android.view.View) r0
            goto Lc
        L21:
            boolean r0 = r0.isClickable()
            return r0
    }

    private void updateInsetForeground(android.graphics.drawable.Drawable r2) {
            r1 = this;
            com.google.android.material.card.MaterialCardView r0 = r1.materialCardView
            android.graphics.drawable.Drawable r0 = r0.getForeground()
            boolean r0 = r0 instanceof android.graphics.drawable.InsetDrawable
            if (r0 == 0) goto L16
            com.google.android.material.card.MaterialCardView r0 = r1.materialCardView
            android.graphics.drawable.Drawable r0 = r0.getForeground()
            android.graphics.drawable.InsetDrawable r0 = (android.graphics.drawable.InsetDrawable) r0
            r0.setDrawable(r2)
            goto L1f
        L16:
            com.google.android.material.card.MaterialCardView r0 = r1.materialCardView
            android.graphics.drawable.Drawable r2 = r1.insetDrawable(r2)
            r0.setForeground(r2)
        L1f:
            return
    }

    private void updateRippleColor() {
            r2 = this;
            boolean r0 = com.google.android.material.ripple.RippleUtils.USE_FRAMEWORK_RIPPLE
            if (r0 == 0) goto L10
            android.graphics.drawable.Drawable r0 = r2.rippleDrawable
            if (r0 == 0) goto L10
            android.graphics.drawable.RippleDrawable r0 = (android.graphics.drawable.RippleDrawable) r0
            android.content.res.ColorStateList r1 = r2.rippleColor
            r0.setColor(r1)
            goto L19
        L10:
            com.google.android.material.shape.MaterialShapeDrawable r0 = r2.compatRippleDrawable
            if (r0 == 0) goto L19
            android.content.res.ColorStateList r1 = r2.rippleColor
            r0.setFillColor(r1)
        L19:
            return
    }

    public void animateCheckedIcon(boolean r6) {
            r5 = this;
            r0 = 1065353216(0x3f800000, float:1.0)
            if (r6 == 0) goto L6
            r1 = r0
            goto L7
        L6:
            r1 = 0
        L7:
            if (r6 == 0) goto Ld
            float r2 = r5.checkedAnimationProgress
            float r0 = r0 - r2
            goto Lf
        Ld:
            float r0 = r5.checkedAnimationProgress
        Lf:
            android.animation.ValueAnimator r2 = r5.iconAnimator
            if (r2 == 0) goto L19
            r2.cancel()
            r2 = 0
            r5.iconAnimator = r2
        L19:
            float r2 = r5.checkedAnimationProgress
            r3 = 2
            float[] r3 = new float[r3]
            r4 = 0
            r3[r4] = r2
            r2 = 1
            r3[r2] = r1
            android.animation.ValueAnimator r1 = android.animation.ValueAnimator.ofFloat(r3)
            r5.iconAnimator = r1
            com.google.android.material.card.MaterialCardViewHelper$$ExternalSyntheticLambda0 r2 = new com.google.android.material.card.MaterialCardViewHelper$$ExternalSyntheticLambda0
            r2.<init>(r5)
            r1.addUpdateListener(r2)
            android.animation.ValueAnimator r1 = r5.iconAnimator
            android.animation.TimeInterpolator r2 = r5.iconFadeAnimInterpolator
            r1.setInterpolator(r2)
            android.animation.ValueAnimator r1 = r5.iconAnimator
            if (r6 == 0) goto L40
            int r6 = r5.iconFadeInAnimDuration
            goto L42
        L40:
            int r6 = r5.iconFadeOutAnimDuration
        L42:
            float r6 = (float) r6
            float r6 = r6 * r0
            long r2 = (long) r6
            r1.setDuration(r2)
            android.animation.ValueAnimator r6 = r5.iconAnimator
            r6.start()
            return
    }

    void forceRippleRedraw() {
            r7 = this;
            android.graphics.drawable.Drawable r0 = r7.rippleDrawable
            if (r0 == 0) goto L22
            android.graphics.Rect r0 = r0.getBounds()
            int r1 = r0.bottom
            android.graphics.drawable.Drawable r2 = r7.rippleDrawable
            int r3 = r0.left
            int r4 = r0.top
            int r5 = r0.right
            int r6 = r1 + (-1)
            r2.setBounds(r3, r4, r5, r6)
            android.graphics.drawable.Drawable r2 = r7.rippleDrawable
            int r3 = r0.left
            int r4 = r0.top
            int r0 = r0.right
            r2.setBounds(r3, r4, r0, r1)
        L22:
            return
    }

    com.google.android.material.shape.MaterialShapeDrawable getBackground() {
            r1 = this;
            com.google.android.material.shape.MaterialShapeDrawable r0 = r1.bgDrawable
            return r0
    }

    android.content.res.ColorStateList getCardBackgroundColor() {
            r1 = this;
            com.google.android.material.shape.MaterialShapeDrawable r0 = r1.bgDrawable
            android.content.res.ColorStateList r0 = r0.getFillColor()
            return r0
    }

    android.content.res.ColorStateList getCardForegroundColor() {
            r1 = this;
            com.google.android.material.shape.MaterialShapeDrawable r0 = r1.foregroundContentDrawable
            android.content.res.ColorStateList r0 = r0.getFillColor()
            return r0
    }

    android.graphics.drawable.Drawable getCheckedIcon() {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.checkedIcon
            return r0
    }

    int getCheckedIconGravity() {
            r1 = this;
            int r0 = r1.checkedIconGravity
            return r0
    }

    int getCheckedIconMargin() {
            r1 = this;
            int r0 = r1.checkedIconMargin
            return r0
    }

    int getCheckedIconSize() {
            r1 = this;
            int r0 = r1.checkedIconSize
            return r0
    }

    android.content.res.ColorStateList getCheckedIconTint() {
            r1 = this;
            android.content.res.ColorStateList r0 = r1.checkedIconTint
            return r0
    }

    float getCornerRadius() {
            r1 = this;
            com.google.android.material.shape.MaterialShapeDrawable r0 = r1.bgDrawable
            float r0 = r0.getTopLeftCornerResolvedSize()
            return r0
    }

    float getProgress() {
            r1 = this;
            com.google.android.material.shape.MaterialShapeDrawable r0 = r1.bgDrawable
            float r0 = r0.getInterpolation()
            return r0
    }

    android.content.res.ColorStateList getRippleColor() {
            r1 = this;
            android.content.res.ColorStateList r0 = r1.rippleColor
            return r0
    }

    com.google.android.material.shape.ShapeAppearanceModel getShapeAppearanceModel() {
            r1 = this;
            com.google.android.material.shape.ShapeAppearanceModel r0 = r1.shapeAppearanceModel
            return r0
    }

    int getStrokeColor() {
            r1 = this;
            android.content.res.ColorStateList r0 = r1.strokeColor
            if (r0 != 0) goto L6
            r0 = -1
            goto La
        L6:
            int r0 = r0.getDefaultColor()
        La:
            return r0
    }

    android.content.res.ColorStateList getStrokeColorStateList() {
            r1 = this;
            android.content.res.ColorStateList r0 = r1.strokeColor
            return r0
    }

    int getStrokeWidth() {
            r1 = this;
            int r0 = r1.strokeWidth
            return r0
    }

    android.graphics.Rect getUserContentPadding() {
            r1 = this;
            android.graphics.Rect r0 = r1.userContentPadding
            return r0
    }

    boolean isBackgroundOverwritten() {
            r1 = this;
            boolean r0 = r1.isBackgroundOverwritten
            return r0
    }

    boolean isCheckable() {
            r1 = this;
            boolean r0 = r1.checkable
            return r0
    }

    /* JADX INFO: renamed from: lambda$animateCheckedIcon$0$com-google-android-material-card-MaterialCardViewHelper, reason: not valid java name */
    /* synthetic */ void m610xa4d79c2b(android.animation.ValueAnimator r3) {
            r2 = this;
            java.lang.Object r3 = r3.getAnimatedValue()
            java.lang.Float r3 = (java.lang.Float) r3
            float r3 = r3.floatValue()
            r0 = 1132396544(0x437f0000, float:255.0)
            float r0 = r0 * r3
            int r0 = (int) r0
            android.graphics.drawable.Drawable r1 = r2.checkedIcon
            r1.setAlpha(r0)
            r2.checkedAnimationProgress = r3
            return
    }

    void loadFromAttributes(android.content.res.TypedArray r4) {
            r3 = this;
            com.google.android.material.card.MaterialCardView r0 = r3.materialCardView
            android.content.Context r0 = r0.getContext()
            int r1 = com.google.android.material.R.styleable.MaterialCardView_strokeColor
            android.content.res.ColorStateList r0 = com.google.android.material.resources.MaterialResources.getColorStateList(r0, r4, r1)
            r3.strokeColor = r0
            if (r0 != 0) goto L17
            r0 = -1
            android.content.res.ColorStateList r0 = android.content.res.ColorStateList.valueOf(r0)
            r3.strokeColor = r0
        L17:
            int r0 = com.google.android.material.R.styleable.MaterialCardView_strokeWidth
            r1 = 0
            int r0 = r4.getDimensionPixelSize(r0, r1)
            r3.strokeWidth = r0
            int r0 = com.google.android.material.R.styleable.MaterialCardView_android_checkable
            boolean r0 = r4.getBoolean(r0, r1)
            r3.checkable = r0
            com.google.android.material.card.MaterialCardView r2 = r3.materialCardView
            r2.setLongClickable(r0)
            com.google.android.material.card.MaterialCardView r0 = r3.materialCardView
            android.content.Context r0 = r0.getContext()
            int r2 = com.google.android.material.R.styleable.MaterialCardView_checkedIconTint
            android.content.res.ColorStateList r0 = com.google.android.material.resources.MaterialResources.getColorStateList(r0, r4, r2)
            r3.checkedIconTint = r0
            com.google.android.material.card.MaterialCardView r0 = r3.materialCardView
            android.content.Context r0 = r0.getContext()
            int r2 = com.google.android.material.R.styleable.MaterialCardView_checkedIcon
            android.graphics.drawable.Drawable r0 = com.google.android.material.resources.MaterialResources.getDrawable(r0, r4, r2)
            r3.setCheckedIcon(r0)
            int r0 = com.google.android.material.R.styleable.MaterialCardView_checkedIconSize
            int r0 = r4.getDimensionPixelSize(r0, r1)
            r3.setCheckedIconSize(r0)
            int r0 = com.google.android.material.R.styleable.MaterialCardView_checkedIconMargin
            int r0 = r4.getDimensionPixelSize(r0, r1)
            r3.setCheckedIconMargin(r0)
            int r0 = com.google.android.material.R.styleable.MaterialCardView_checkedIconGravity
            r1 = 8388661(0x800035, float:1.1755018E-38)
            int r0 = r4.getInteger(r0, r1)
            r3.checkedIconGravity = r0
            com.google.android.material.card.MaterialCardView r0 = r3.materialCardView
            android.content.Context r0 = r0.getContext()
            int r1 = com.google.android.material.R.styleable.MaterialCardView_rippleColor
            android.content.res.ColorStateList r0 = com.google.android.material.resources.MaterialResources.getColorStateList(r0, r4, r1)
            r3.rippleColor = r0
            if (r0 != 0) goto L85
            com.google.android.material.card.MaterialCardView r0 = r3.materialCardView
            int r1 = com.google.android.material.R.attr.colorControlHighlight
            int r0 = com.google.android.material.color.MaterialColors.getColor(r0, r1)
            android.content.res.ColorStateList r0 = android.content.res.ColorStateList.valueOf(r0)
            r3.rippleColor = r0
        L85:
            com.google.android.material.card.MaterialCardView r0 = r3.materialCardView
            android.content.Context r0 = r0.getContext()
            int r1 = com.google.android.material.R.styleable.MaterialCardView_cardForegroundColor
            android.content.res.ColorStateList r4 = com.google.android.material.resources.MaterialResources.getColorStateList(r0, r4, r1)
            r3.setCardForegroundColor(r4)
            r3.updateRippleColor()
            r3.updateElevation()
            r3.updateStroke()
            com.google.android.material.card.MaterialCardView r4 = r3.materialCardView
            com.google.android.material.shape.MaterialShapeDrawable r0 = r3.bgDrawable
            android.graphics.drawable.Drawable r0 = r3.insetDrawable(r0)
            r4.setBackgroundInternal(r0)
            boolean r4 = r3.shouldUseClickableForeground()
            if (r4 == 0) goto Lb3
            android.graphics.drawable.Drawable r4 = r3.getClickableForeground()
            goto Lb5
        Lb3:
            com.google.android.material.shape.MaterialShapeDrawable r4 = r3.foregroundContentDrawable
        Lb5:
            r3.fgDrawable = r4
            com.google.android.material.card.MaterialCardView r0 = r3.materialCardView
            android.graphics.drawable.Drawable r4 = r3.insetDrawable(r4)
            r0.setForeground(r4)
            return
    }

    void recalculateCheckedIconPosition(int r11, int r12) {
            r10 = this;
            android.graphics.drawable.LayerDrawable r0 = r10.clickableForegroundDrawable
            if (r0 == 0) goto L7f
            com.google.android.material.card.MaterialCardView r0 = r10.materialCardView
            boolean r0 = r0.getUseCompatPadding()
            if (r0 == 0) goto L25
            float r0 = r10.calculateVerticalBackgroundPadding()
            r1 = 1073741824(0x40000000, float:2.0)
            float r0 = r0 * r1
            double r2 = (double) r0
            double r2 = java.lang.Math.ceil(r2)
            int r0 = (int) r2
            float r2 = r10.calculateHorizontalBackgroundPadding()
            float r2 = r2 * r1
            double r1 = (double) r2
            double r1 = java.lang.Math.ceil(r1)
            int r1 = (int) r1
            goto L27
        L25:
            r0 = 0
            r1 = r0
        L27:
            boolean r2 = r10.isCheckedIconEnd()
            if (r2 == 0) goto L36
            int r2 = r10.checkedIconMargin
            int r2 = r11 - r2
            int r3 = r10.checkedIconSize
            int r2 = r2 - r3
            int r2 = r2 - r1
            goto L38
        L36:
            int r2 = r10.checkedIconMargin
        L38:
            boolean r3 = r10.isCheckedIconBottom()
            if (r3 == 0) goto L41
            int r3 = r10.checkedIconMargin
            goto L49
        L41:
            int r3 = r10.checkedIconMargin
            int r3 = r12 - r3
            int r4 = r10.checkedIconSize
            int r3 = r3 - r4
            int r3 = r3 - r0
        L49:
            r9 = r3
            boolean r3 = r10.isCheckedIconEnd()
            if (r3 == 0) goto L53
            int r11 = r10.checkedIconMargin
            goto L5a
        L53:
            int r3 = r10.checkedIconMargin
            int r11 = r11 - r3
            int r3 = r10.checkedIconSize
            int r11 = r11 - r3
            int r11 = r11 - r1
        L5a:
            boolean r1 = r10.isCheckedIconBottom()
            if (r1 == 0) goto L68
            int r1 = r10.checkedIconMargin
            int r12 = r12 - r1
            int r1 = r10.checkedIconSize
            int r12 = r12 - r1
            int r12 = r12 - r0
            goto L6a
        L68:
            int r12 = r10.checkedIconMargin
        L6a:
            r7 = r12
            com.google.android.material.card.MaterialCardView r12 = r10.materialCardView
            int r12 = androidx.core.view.ViewCompat.getLayoutDirection(r12)
            r0 = 1
            if (r12 != r0) goto L77
            r6 = r11
            r8 = r2
            goto L79
        L77:
            r8 = r11
            r6 = r2
        L79:
            android.graphics.drawable.LayerDrawable r4 = r10.clickableForegroundDrawable
            r5 = 2
            r4.setLayerInset(r5, r6, r7, r8, r9)
        L7f:
            return
    }

    void setBackgroundOverwritten(boolean r1) {
            r0 = this;
            r0.isBackgroundOverwritten = r1
            return
    }

    void setCardBackgroundColor(android.content.res.ColorStateList r2) {
            r1 = this;
            com.google.android.material.shape.MaterialShapeDrawable r0 = r1.bgDrawable
            r0.setFillColor(r2)
            return
    }

    void setCardForegroundColor(android.content.res.ColorStateList r2) {
            r1 = this;
            com.google.android.material.shape.MaterialShapeDrawable r0 = r1.foregroundContentDrawable
            if (r2 != 0) goto L9
            r2 = 0
            android.content.res.ColorStateList r2 = android.content.res.ColorStateList.valueOf(r2)
        L9:
            r0.setFillColor(r2)
            return
    }

    void setCheckable(boolean r1) {
            r0 = this;
            r0.checkable = r1
            return
    }

    public void setChecked(boolean r2) {
            r1 = this;
            r0 = 0
            r1.setChecked(r2, r0)
            return
    }

    public void setChecked(boolean r2, boolean r3) {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.checkedIcon
            if (r0 == 0) goto L1b
            if (r3 == 0) goto La
            r1.animateCheckedIcon(r2)
            goto L1b
        La:
            if (r2 == 0) goto Lf
            r3 = 255(0xff, float:3.57E-43)
            goto L10
        Lf:
            r3 = 0
        L10:
            r0.setAlpha(r3)
            if (r2 == 0) goto L18
            r2 = 1065353216(0x3f800000, float:1.0)
            goto L19
        L18:
            r2 = 0
        L19:
            r1.checkedAnimationProgress = r2
        L1b:
            return
    }

    void setCheckedIcon(android.graphics.drawable.Drawable r3) {
            r2 = this;
            if (r3 == 0) goto L1b
            android.graphics.drawable.Drawable r3 = androidx.core.graphics.drawable.DrawableCompat.wrap(r3)
            android.graphics.drawable.Drawable r3 = r3.mutate()
            r2.checkedIcon = r3
            android.content.res.ColorStateList r0 = r2.checkedIconTint
            androidx.core.graphics.drawable.DrawableCompat.setTintList(r3, r0)
            com.google.android.material.card.MaterialCardView r3 = r2.materialCardView
            boolean r3 = r3.isChecked()
            r2.setChecked(r3)
            goto L1f
        L1b:
            android.graphics.drawable.Drawable r3 = com.google.android.material.card.MaterialCardViewHelper.CHECKED_ICON_NONE
            r2.checkedIcon = r3
        L1f:
            android.graphics.drawable.LayerDrawable r3 = r2.clickableForegroundDrawable
            if (r3 == 0) goto L2a
            int r0 = com.google.android.material.R.id.mtrl_card_checked_layer_id
            android.graphics.drawable.Drawable r1 = r2.checkedIcon
            r3.setDrawableByLayerId(r0, r1)
        L2a:
            return
    }

    void setCheckedIconGravity(int r2) {
            r1 = this;
            r1.checkedIconGravity = r2
            com.google.android.material.card.MaterialCardView r2 = r1.materialCardView
            int r2 = r2.getMeasuredWidth()
            com.google.android.material.card.MaterialCardView r0 = r1.materialCardView
            int r0 = r0.getMeasuredHeight()
            r1.recalculateCheckedIconPosition(r2, r0)
            return
    }

    void setCheckedIconMargin(int r1) {
            r0 = this;
            r0.checkedIconMargin = r1
            return
    }

    void setCheckedIconSize(int r1) {
            r0 = this;
            r0.checkedIconSize = r1
            return
    }

    void setCheckedIconTint(android.content.res.ColorStateList r2) {
            r1 = this;
            r1.checkedIconTint = r2
            android.graphics.drawable.Drawable r0 = r1.checkedIcon
            if (r0 == 0) goto L9
            androidx.core.graphics.drawable.DrawableCompat.setTintList(r0, r2)
        L9:
            return
    }

    void setCornerRadius(float r2) {
            r1 = this;
            com.google.android.material.shape.ShapeAppearanceModel r0 = r1.shapeAppearanceModel
            com.google.android.material.shape.ShapeAppearanceModel r2 = r0.withCornerSize(r2)
            r1.setShapeAppearanceModel(r2)
            android.graphics.drawable.Drawable r2 = r1.fgDrawable
            r2.invalidateSelf()
            boolean r2 = r1.shouldAddCornerPaddingOutsideCardBackground()
            if (r2 != 0) goto L1a
            boolean r2 = r1.shouldAddCornerPaddingInsideCardBackground()
            if (r2 == 0) goto L1d
        L1a:
            r1.updateContentPadding()
        L1d:
            boolean r2 = r1.shouldAddCornerPaddingOutsideCardBackground()
            if (r2 == 0) goto L26
            r1.updateInsets()
        L26:
            return
    }

    void setProgress(float r2) {
            r1 = this;
            com.google.android.material.shape.MaterialShapeDrawable r0 = r1.bgDrawable
            r0.setInterpolation(r2)
            com.google.android.material.shape.MaterialShapeDrawable r0 = r1.foregroundContentDrawable
            if (r0 == 0) goto Lc
            r0.setInterpolation(r2)
        Lc:
            com.google.android.material.shape.MaterialShapeDrawable r0 = r1.foregroundShapeDrawable
            if (r0 == 0) goto L13
            r0.setInterpolation(r2)
        L13:
            return
    }

    void setRippleColor(android.content.res.ColorStateList r1) {
            r0 = this;
            r0.rippleColor = r1
            r0.updateRippleColor()
            return
    }

    void setShapeAppearanceModel(com.google.android.material.shape.ShapeAppearanceModel r3) {
            r2 = this;
            r2.shapeAppearanceModel = r3
            com.google.android.material.shape.MaterialShapeDrawable r0 = r2.bgDrawable
            r0.setShapeAppearanceModel(r3)
            com.google.android.material.shape.MaterialShapeDrawable r0 = r2.bgDrawable
            boolean r1 = r0.isRoundRect()
            r1 = r1 ^ 1
            r0.setShadowBitmapDrawingEnable(r1)
            com.google.android.material.shape.MaterialShapeDrawable r0 = r2.foregroundContentDrawable
            if (r0 == 0) goto L19
            r0.setShapeAppearanceModel(r3)
        L19:
            com.google.android.material.shape.MaterialShapeDrawable r0 = r2.foregroundShapeDrawable
            if (r0 == 0) goto L20
            r0.setShapeAppearanceModel(r3)
        L20:
            com.google.android.material.shape.MaterialShapeDrawable r0 = r2.compatRippleDrawable
            if (r0 == 0) goto L27
            r0.setShapeAppearanceModel(r3)
        L27:
            return
    }

    void setStrokeColor(android.content.res.ColorStateList r2) {
            r1 = this;
            android.content.res.ColorStateList r0 = r1.strokeColor
            if (r0 != r2) goto L5
            return
        L5:
            r1.strokeColor = r2
            r1.updateStroke()
            return
    }

    void setStrokeWidth(int r2) {
            r1 = this;
            int r0 = r1.strokeWidth
            if (r2 != r0) goto L5
            return
        L5:
            r1.strokeWidth = r2
            r1.updateStroke()
            return
    }

    void setUserContentPadding(int r2, int r3, int r4, int r5) {
            r1 = this;
            android.graphics.Rect r0 = r1.userContentPadding
            r0.set(r2, r3, r4, r5)
            r1.updateContentPadding()
            return
    }

    void updateClickable() {
            r2 = this;
            android.graphics.drawable.Drawable r0 = r2.fgDrawable
            boolean r1 = r2.shouldUseClickableForeground()
            if (r1 == 0) goto Ld
            android.graphics.drawable.Drawable r1 = r2.getClickableForeground()
            goto Lf
        Ld:
            com.google.android.material.shape.MaterialShapeDrawable r1 = r2.foregroundContentDrawable
        Lf:
            r2.fgDrawable = r1
            if (r0 == r1) goto L16
            r2.updateInsetForeground(r1)
        L16:
            return
    }

    void updateContentPadding() {
            r6 = this;
            boolean r0 = r6.shouldAddCornerPaddingInsideCardBackground()
            if (r0 != 0) goto Lf
            boolean r0 = r6.shouldAddCornerPaddingOutsideCardBackground()
            if (r0 == 0) goto Ld
            goto Lf
        Ld:
            r0 = 0
            goto L13
        Lf:
            float r0 = r6.calculateActualCornerPadding()
        L13:
            float r1 = r6.getParentCardViewCalculatedCornerPadding()
            float r0 = r0 - r1
            int r0 = (int) r0
            com.google.android.material.card.MaterialCardView r1 = r6.materialCardView
            android.graphics.Rect r2 = r6.userContentPadding
            int r2 = r2.left
            int r2 = r2 + r0
            android.graphics.Rect r3 = r6.userContentPadding
            int r3 = r3.top
            int r3 = r3 + r0
            android.graphics.Rect r4 = r6.userContentPadding
            int r4 = r4.right
            int r4 = r4 + r0
            android.graphics.Rect r5 = r6.userContentPadding
            int r5 = r5.bottom
            int r5 = r5 + r0
            r1.setAncestorContentPadding(r2, r3, r4, r5)
            return
    }

    void updateElevation() {
            r2 = this;
            com.google.android.material.shape.MaterialShapeDrawable r0 = r2.bgDrawable
            com.google.android.material.card.MaterialCardView r1 = r2.materialCardView
            float r1 = r1.getCardElevation()
            r0.setElevation(r1)
            return
    }

    void updateInsets() {
            r2 = this;
            boolean r0 = r2.isBackgroundOverwritten()
            if (r0 != 0) goto L11
            com.google.android.material.card.MaterialCardView r0 = r2.materialCardView
            com.google.android.material.shape.MaterialShapeDrawable r1 = r2.bgDrawable
            android.graphics.drawable.Drawable r1 = r2.insetDrawable(r1)
            r0.setBackgroundInternal(r1)
        L11:
            com.google.android.material.card.MaterialCardView r0 = r2.materialCardView
            android.graphics.drawable.Drawable r1 = r2.fgDrawable
            android.graphics.drawable.Drawable r1 = r2.insetDrawable(r1)
            r0.setForeground(r1)
            return
    }

    void updateStroke() {
            r3 = this;
            com.google.android.material.shape.MaterialShapeDrawable r0 = r3.foregroundContentDrawable
            int r1 = r3.strokeWidth
            float r1 = (float) r1
            android.content.res.ColorStateList r2 = r3.strokeColor
            r0.setStroke(r1, r2)
            return
    }
}
