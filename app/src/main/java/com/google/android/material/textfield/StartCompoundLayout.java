package com.google.android.material.textfield;

/* JADX INFO: loaded from: classes.dex */
class StartCompoundLayout extends android.widget.LinearLayout {
    private boolean hintExpanded;
    private java.lang.CharSequence prefixText;
    private final android.widget.TextView prefixTextView;
    private int startIconMinSize;
    private android.view.View.OnLongClickListener startIconOnLongClickListener;
    private android.widget.ImageView.ScaleType startIconScaleType;
    private android.content.res.ColorStateList startIconTintList;
    private android.graphics.PorterDuff.Mode startIconTintMode;
    private final com.google.android.material.internal.CheckableImageButton startIconView;
    private final com.google.android.material.textfield.TextInputLayout textInputLayout;

    StartCompoundLayout(com.google.android.material.textfield.TextInputLayout r5, androidx.appcompat.widget.TintTypedArray r6) {
            r4 = this;
            android.content.Context r0 = r5.getContext()
            r4.<init>(r0)
            r4.textInputLayout = r5
            r5 = 8
            r4.setVisibility(r5)
            r5 = 0
            r4.setOrientation(r5)
            android.widget.FrameLayout$LayoutParams r0 = new android.widget.FrameLayout$LayoutParams
            r1 = -1
            r2 = 8388611(0x800003, float:1.1754948E-38)
            r3 = -2
            r0.<init>(r3, r1, r2)
            r4.setLayoutParams(r0)
            android.content.Context r0 = r4.getContext()
            android.view.LayoutInflater r0 = android.view.LayoutInflater.from(r0)
            int r1 = com.google.android.material.R.layout.design_text_input_start_icon
            android.view.View r5 = r0.inflate(r1, r4, r5)
            com.google.android.material.internal.CheckableImageButton r5 = (com.google.android.material.internal.CheckableImageButton) r5
            r4.startIconView = r5
            com.google.android.material.textfield.IconHelper.setCompatRippleBackgroundIfNeeded(r5)
            androidx.appcompat.widget.AppCompatTextView r0 = new androidx.appcompat.widget.AppCompatTextView
            android.content.Context r1 = r4.getContext()
            r0.<init>(r1)
            r4.prefixTextView = r0
            r4.initStartIconView(r6)
            r4.initPrefixTextView(r6)
            r4.addView(r5)
            r4.addView(r0)
            return
    }

    private void initPrefixTextView(androidx.appcompat.widget.TintTypedArray r4) {
            r3 = this;
            android.widget.TextView r0 = r3.prefixTextView
            r1 = 8
            r0.setVisibility(r1)
            android.widget.TextView r0 = r3.prefixTextView
            int r1 = com.google.android.material.R.id.textinput_prefix_text
            r0.setId(r1)
            android.widget.TextView r0 = r3.prefixTextView
            android.widget.LinearLayout$LayoutParams r1 = new android.widget.LinearLayout$LayoutParams
            r2 = -2
            r1.<init>(r2, r2)
            r0.setLayoutParams(r1)
            android.widget.TextView r0 = r3.prefixTextView
            r1 = 1
            androidx.core.view.ViewCompat.setAccessibilityLiveRegion(r0, r1)
            int r0 = com.google.android.material.R.styleable.TextInputLayout_prefixTextAppearance
            r1 = 0
            int r0 = r4.getResourceId(r0, r1)
            r3.setPrefixTextAppearance(r0)
            int r0 = com.google.android.material.R.styleable.TextInputLayout_prefixTextColor
            boolean r0 = r4.hasValue(r0)
            if (r0 == 0) goto L3a
            int r0 = com.google.android.material.R.styleable.TextInputLayout_prefixTextColor
            android.content.res.ColorStateList r0 = r4.getColorStateList(r0)
            r3.setPrefixTextColor(r0)
        L3a:
            int r0 = com.google.android.material.R.styleable.TextInputLayout_prefixText
            java.lang.CharSequence r4 = r4.getText(r0)
            r3.setPrefixText(r4)
            return
    }

    private void initStartIconView(androidx.appcompat.widget.TintTypedArray r5) {
            r4 = this;
            android.content.Context r0 = r4.getContext()
            boolean r0 = com.google.android.material.resources.MaterialResources.isFontScaleAtLeast1_3(r0)
            if (r0 == 0) goto L16
            com.google.android.material.internal.CheckableImageButton r0 = r4.startIconView
            android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()
            android.view.ViewGroup$MarginLayoutParams r0 = (android.view.ViewGroup.MarginLayoutParams) r0
            r1 = 0
            androidx.core.view.MarginLayoutParamsCompat.setMarginEnd(r0, r1)
        L16:
            r0 = 0
            r4.setStartIconOnClickListener(r0)
            r4.setStartIconOnLongClickListener(r0)
            int r1 = com.google.android.material.R.styleable.TextInputLayout_startIconTint
            boolean r1 = r5.hasValue(r1)
            if (r1 == 0) goto L31
            android.content.Context r1 = r4.getContext()
            int r2 = com.google.android.material.R.styleable.TextInputLayout_startIconTint
            android.content.res.ColorStateList r1 = com.google.android.material.resources.MaterialResources.getColorStateList(r1, r5, r2)
            r4.startIconTintList = r1
        L31:
            int r1 = com.google.android.material.R.styleable.TextInputLayout_startIconTintMode
            boolean r1 = r5.hasValue(r1)
            r2 = -1
            if (r1 == 0) goto L46
            int r1 = com.google.android.material.R.styleable.TextInputLayout_startIconTintMode
            int r1 = r5.getInt(r1, r2)
            android.graphics.PorterDuff$Mode r0 = com.google.android.material.internal.ViewUtils.parseTintMode(r1, r0)
            r4.startIconTintMode = r0
        L46:
            int r0 = com.google.android.material.R.styleable.TextInputLayout_startIconDrawable
            boolean r0 = r5.hasValue(r0)
            if (r0 == 0) goto L72
            int r0 = com.google.android.material.R.styleable.TextInputLayout_startIconDrawable
            android.graphics.drawable.Drawable r0 = r5.getDrawable(r0)
            r4.setStartIconDrawable(r0)
            int r0 = com.google.android.material.R.styleable.TextInputLayout_startIconContentDescription
            boolean r0 = r5.hasValue(r0)
            if (r0 == 0) goto L68
            int r0 = com.google.android.material.R.styleable.TextInputLayout_startIconContentDescription
            java.lang.CharSequence r0 = r5.getText(r0)
            r4.setStartIconContentDescription(r0)
        L68:
            int r0 = com.google.android.material.R.styleable.TextInputLayout_startIconCheckable
            r1 = 1
            boolean r0 = r5.getBoolean(r0, r1)
            r4.setStartIconCheckable(r0)
        L72:
            int r0 = com.google.android.material.R.styleable.TextInputLayout_startIconMinSize
            android.content.res.Resources r1 = r4.getResources()
            int r3 = com.google.android.material.R.dimen.mtrl_min_touch_target_size
            int r1 = r1.getDimensionPixelSize(r3)
            int r0 = r5.getDimensionPixelSize(r0, r1)
            r4.setStartIconMinSize(r0)
            int r0 = com.google.android.material.R.styleable.TextInputLayout_startIconScaleType
            boolean r0 = r5.hasValue(r0)
            if (r0 == 0) goto L9a
            int r0 = com.google.android.material.R.styleable.TextInputLayout_startIconScaleType
            int r5 = r5.getInt(r0, r2)
            android.widget.ImageView$ScaleType r5 = com.google.android.material.textfield.IconHelper.convertScaleType(r5)
            r4.setStartIconScaleType(r5)
        L9a:
            return
    }

    private void updateVisibility() {
            r4 = this;
            java.lang.CharSequence r0 = r4.prefixText
            r1 = 0
            r2 = 8
            if (r0 == 0) goto Ld
            boolean r0 = r4.hintExpanded
            if (r0 != 0) goto Ld
            r0 = r1
            goto Le
        Ld:
            r0 = r2
        Le:
            com.google.android.material.internal.CheckableImageButton r3 = r4.startIconView
            int r3 = r3.getVisibility()
            if (r3 == 0) goto L1a
            if (r0 != 0) goto L19
            goto L1a
        L19:
            r1 = r2
        L1a:
            r4.setVisibility(r1)
            android.widget.TextView r1 = r4.prefixTextView
            r1.setVisibility(r0)
            com.google.android.material.textfield.TextInputLayout r0 = r4.textInputLayout
            r0.updateDummyDrawables()
            return
    }

    java.lang.CharSequence getPrefixText() {
            r1 = this;
            java.lang.CharSequence r0 = r1.prefixText
            return r0
    }

    android.content.res.ColorStateList getPrefixTextColor() {
            r1 = this;
            android.widget.TextView r0 = r1.prefixTextView
            android.content.res.ColorStateList r0 = r0.getTextColors()
            return r0
    }

    int getPrefixTextStartOffset() {
            r3 = this;
            boolean r0 = r3.isStartIconVisible()
            if (r0 == 0) goto L1a
            com.google.android.material.internal.CheckableImageButton r0 = r3.startIconView
            int r0 = r0.getMeasuredWidth()
            com.google.android.material.internal.CheckableImageButton r1 = r3.startIconView
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            android.view.ViewGroup$MarginLayoutParams r1 = (android.view.ViewGroup.MarginLayoutParams) r1
            int r1 = androidx.core.view.MarginLayoutParamsCompat.getMarginEnd(r1)
            int r0 = r0 + r1
            goto L1b
        L1a:
            r0 = 0
        L1b:
            int r1 = androidx.core.view.ViewCompat.getPaddingStart(r3)
            android.widget.TextView r2 = r3.prefixTextView
            int r2 = androidx.core.view.ViewCompat.getPaddingStart(r2)
            int r1 = r1 + r2
            int r1 = r1 + r0
            return r1
    }

    android.widget.TextView getPrefixTextView() {
            r1 = this;
            android.widget.TextView r0 = r1.prefixTextView
            return r0
    }

    java.lang.CharSequence getStartIconContentDescription() {
            r1 = this;
            com.google.android.material.internal.CheckableImageButton r0 = r1.startIconView
            java.lang.CharSequence r0 = r0.getContentDescription()
            return r0
    }

    android.graphics.drawable.Drawable getStartIconDrawable() {
            r1 = this;
            com.google.android.material.internal.CheckableImageButton r0 = r1.startIconView
            android.graphics.drawable.Drawable r0 = r0.getDrawable()
            return r0
    }

    int getStartIconMinSize() {
            r1 = this;
            int r0 = r1.startIconMinSize
            return r0
    }

    android.widget.ImageView.ScaleType getStartIconScaleType() {
            r1 = this;
            android.widget.ImageView$ScaleType r0 = r1.startIconScaleType
            return r0
    }

    boolean isStartIconCheckable() {
            r1 = this;
            com.google.android.material.internal.CheckableImageButton r0 = r1.startIconView
            boolean r0 = r0.isCheckable()
            return r0
    }

    boolean isStartIconVisible() {
            r1 = this;
            com.google.android.material.internal.CheckableImageButton r0 = r1.startIconView
            int r0 = r0.getVisibility()
            if (r0 != 0) goto La
            r0 = 1
            goto Lb
        La:
            r0 = 0
        Lb:
            return r0
    }

    void onHintStateChanged(boolean r1) {
            r0 = this;
            r0.hintExpanded = r1
            r0.updateVisibility()
            return
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onMeasure(int r1, int r2) {
            r0 = this;
            super.onMeasure(r1, r2)
            r0.updatePrefixTextViewPadding()
            return
    }

    void refreshStartIconDrawableState() {
            r3 = this;
            com.google.android.material.textfield.TextInputLayout r0 = r3.textInputLayout
            com.google.android.material.internal.CheckableImageButton r1 = r3.startIconView
            android.content.res.ColorStateList r2 = r3.startIconTintList
            com.google.android.material.textfield.IconHelper.refreshIconDrawableState(r0, r1, r2)
            return
    }

    void setPrefixText(java.lang.CharSequence r2) {
            r1 = this;
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 == 0) goto L8
            r0 = 0
            goto L9
        L8:
            r0 = r2
        L9:
            r1.prefixText = r0
            android.widget.TextView r0 = r1.prefixTextView
            r0.setText(r2)
            r1.updateVisibility()
            return
    }

    void setPrefixTextAppearance(int r2) {
            r1 = this;
            android.widget.TextView r0 = r1.prefixTextView
            androidx.core.widget.TextViewCompat.setTextAppearance(r0, r2)
            return
    }

    void setPrefixTextColor(android.content.res.ColorStateList r2) {
            r1 = this;
            android.widget.TextView r0 = r1.prefixTextView
            r0.setTextColor(r2)
            return
    }

    void setStartIconCheckable(boolean r2) {
            r1 = this;
            com.google.android.material.internal.CheckableImageButton r0 = r1.startIconView
            r0.setCheckable(r2)
            return
    }

    void setStartIconContentDescription(java.lang.CharSequence r2) {
            r1 = this;
            java.lang.CharSequence r0 = r1.getStartIconContentDescription()
            if (r0 == r2) goto Lb
            com.google.android.material.internal.CheckableImageButton r0 = r1.startIconView
            r0.setContentDescription(r2)
        Lb:
            return
    }

    void setStartIconDrawable(android.graphics.drawable.Drawable r4) {
            r3 = this;
            com.google.android.material.internal.CheckableImageButton r0 = r3.startIconView
            r0.setImageDrawable(r4)
            if (r4 == 0) goto L1a
            com.google.android.material.textfield.TextInputLayout r4 = r3.textInputLayout
            com.google.android.material.internal.CheckableImageButton r0 = r3.startIconView
            android.content.res.ColorStateList r1 = r3.startIconTintList
            android.graphics.PorterDuff$Mode r2 = r3.startIconTintMode
            com.google.android.material.textfield.IconHelper.applyIconTint(r4, r0, r1, r2)
            r4 = 1
            r3.setStartIconVisible(r4)
            r3.refreshStartIconDrawableState()
            goto L28
        L1a:
            r4 = 0
            r3.setStartIconVisible(r4)
            r4 = 0
            r3.setStartIconOnClickListener(r4)
            r3.setStartIconOnLongClickListener(r4)
            r3.setStartIconContentDescription(r4)
        L28:
            return
    }

    void setStartIconMinSize(int r2) {
            r1 = this;
            if (r2 < 0) goto Le
            int r0 = r1.startIconMinSize
            if (r2 == r0) goto Ld
            r1.startIconMinSize = r2
            com.google.android.material.internal.CheckableImageButton r0 = r1.startIconView
            com.google.android.material.textfield.IconHelper.setIconMinSize(r0, r2)
        Ld:
            return
        Le:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "startIconSize cannot be less than 0"
            r2.<init>(r0)
            throw r2
    }

    void setStartIconOnClickListener(android.view.View.OnClickListener r3) {
            r2 = this;
            com.google.android.material.internal.CheckableImageButton r0 = r2.startIconView
            android.view.View$OnLongClickListener r1 = r2.startIconOnLongClickListener
            com.google.android.material.textfield.IconHelper.setIconOnClickListener(r0, r3, r1)
            return
    }

    void setStartIconOnLongClickListener(android.view.View.OnLongClickListener r2) {
            r1 = this;
            r1.startIconOnLongClickListener = r2
            com.google.android.material.internal.CheckableImageButton r0 = r1.startIconView
            com.google.android.material.textfield.IconHelper.setIconOnLongClickListener(r0, r2)
            return
    }

    void setStartIconScaleType(android.widget.ImageView.ScaleType r2) {
            r1 = this;
            r1.startIconScaleType = r2
            com.google.android.material.internal.CheckableImageButton r0 = r1.startIconView
            com.google.android.material.textfield.IconHelper.setIconScaleType(r0, r2)
            return
    }

    void setStartIconTintList(android.content.res.ColorStateList r4) {
            r3 = this;
            android.content.res.ColorStateList r0 = r3.startIconTintList
            if (r0 == r4) goto Lf
            r3.startIconTintList = r4
            com.google.android.material.textfield.TextInputLayout r0 = r3.textInputLayout
            com.google.android.material.internal.CheckableImageButton r1 = r3.startIconView
            android.graphics.PorterDuff$Mode r2 = r3.startIconTintMode
            com.google.android.material.textfield.IconHelper.applyIconTint(r0, r1, r4, r2)
        Lf:
            return
    }

    void setStartIconTintMode(android.graphics.PorterDuff.Mode r4) {
            r3 = this;
            android.graphics.PorterDuff$Mode r0 = r3.startIconTintMode
            if (r0 == r4) goto Lf
            r3.startIconTintMode = r4
            com.google.android.material.textfield.TextInputLayout r0 = r3.textInputLayout
            com.google.android.material.internal.CheckableImageButton r1 = r3.startIconView
            android.content.res.ColorStateList r2 = r3.startIconTintList
            com.google.android.material.textfield.IconHelper.applyIconTint(r0, r1, r2, r4)
        Lf:
            return
    }

    void setStartIconVisible(boolean r2) {
            r1 = this;
            boolean r0 = r1.isStartIconVisible()
            if (r0 == r2) goto L17
            com.google.android.material.internal.CheckableImageButton r0 = r1.startIconView
            if (r2 == 0) goto Lc
            r2 = 0
            goto Le
        Lc:
            r2 = 8
        Le:
            r0.setVisibility(r2)
            r1.updatePrefixTextViewPadding()
            r1.updateVisibility()
        L17:
            return
    }

    void setupAccessibilityNodeInfo(androidx.core.view.accessibility.AccessibilityNodeInfoCompat r2) {
            r1 = this;
            android.widget.TextView r0 = r1.prefixTextView
            int r0 = r0.getVisibility()
            if (r0 != 0) goto L13
            android.widget.TextView r0 = r1.prefixTextView
            r2.setLabelFor(r0)
            android.widget.TextView r0 = r1.prefixTextView
            r2.setTraversalAfter(r0)
            goto L18
        L13:
            com.google.android.material.internal.CheckableImageButton r0 = r1.startIconView
            r2.setTraversalAfter(r0)
        L18:
            return
    }

    void updatePrefixTextViewPadding() {
            r6 = this;
            com.google.android.material.textfield.TextInputLayout r0 = r6.textInputLayout
            android.widget.EditText r0 = r0.editText
            if (r0 != 0) goto L7
            return
        L7:
            boolean r1 = r6.isStartIconVisible()
            if (r1 == 0) goto Lf
            r1 = 0
            goto L13
        Lf:
            int r1 = androidx.core.view.ViewCompat.getPaddingStart(r0)
        L13:
            android.widget.TextView r2 = r6.prefixTextView
            int r3 = r0.getCompoundPaddingTop()
            android.content.Context r4 = r6.getContext()
            android.content.res.Resources r4 = r4.getResources()
            int r5 = com.google.android.material.R.dimen.material_input_text_to_prefix_suffix_padding
            int r4 = r4.getDimensionPixelSize(r5)
            int r0 = r0.getCompoundPaddingBottom()
            androidx.core.view.ViewCompat.setPaddingRelative(r2, r1, r3, r4, r0)
            return
    }
}
