package com.google.android.material.textfield;

/* JADX INFO: loaded from: classes.dex */
class EndCompoundLayout extends android.widget.LinearLayout {
    private final android.view.accessibility.AccessibilityManager accessibilityManager;
    private android.widget.EditText editText;
    private final android.text.TextWatcher editTextWatcher;
    private final java.util.LinkedHashSet<com.google.android.material.textfield.TextInputLayout.OnEndIconChangedListener> endIconChangedListeners;
    private final com.google.android.material.textfield.EndCompoundLayout.EndIconDelegates endIconDelegates;
    private final android.widget.FrameLayout endIconFrame;
    private int endIconMinSize;
    private int endIconMode;
    private android.view.View.OnLongClickListener endIconOnLongClickListener;
    private android.widget.ImageView.ScaleType endIconScaleType;
    private android.content.res.ColorStateList endIconTintList;
    private android.graphics.PorterDuff.Mode endIconTintMode;
    private final com.google.android.material.internal.CheckableImageButton endIconView;
    private android.view.View.OnLongClickListener errorIconOnLongClickListener;
    private android.content.res.ColorStateList errorIconTintList;
    private android.graphics.PorterDuff.Mode errorIconTintMode;
    private final com.google.android.material.internal.CheckableImageButton errorIconView;
    private boolean hintExpanded;
    private final com.google.android.material.textfield.TextInputLayout.OnEditTextAttachedListener onEditTextAttachedListener;
    private java.lang.CharSequence suffixText;
    private final android.widget.TextView suffixTextView;
    final com.google.android.material.textfield.TextInputLayout textInputLayout;
    private androidx.core.view.accessibility.AccessibilityManagerCompat.TouchExplorationStateChangeListener touchExplorationStateChangeListener;




    private static class EndIconDelegates {
        private final int customEndIconDrawableId;
        private final android.util.SparseArray<com.google.android.material.textfield.EndIconDelegate> delegates;
        private final com.google.android.material.textfield.EndCompoundLayout endLayout;
        private final int passwordIconDrawableId;

        EndIconDelegates(com.google.android.material.textfield.EndCompoundLayout r2, androidx.appcompat.widget.TintTypedArray r3) {
                r1 = this;
                r1.<init>()
                android.util.SparseArray r0 = new android.util.SparseArray
                r0.<init>()
                r1.delegates = r0
                r1.endLayout = r2
                int r2 = com.google.android.material.R.styleable.TextInputLayout_endIconDrawable
                r0 = 0
                int r2 = r3.getResourceId(r2, r0)
                r1.customEndIconDrawableId = r2
                int r2 = com.google.android.material.R.styleable.TextInputLayout_passwordToggleDrawable
                int r2 = r3.getResourceId(r2, r0)
                r1.passwordIconDrawableId = r2
                return
        }

        static /* synthetic */ int access$500(com.google.android.material.textfield.EndCompoundLayout.EndIconDelegates r0) {
                int r0 = r0.customEndIconDrawableId
                return r0
        }

        private com.google.android.material.textfield.EndIconDelegate create(int r4) {
                r3 = this;
                r0 = -1
                if (r4 == r0) goto L45
                if (r4 == 0) goto L3d
                r0 = 1
                if (r4 == r0) goto L33
                r0 = 2
                if (r4 == r0) goto L2b
                r0 = 3
                if (r4 != r0) goto L16
                com.google.android.material.textfield.DropdownMenuEndIconDelegate r4 = new com.google.android.material.textfield.DropdownMenuEndIconDelegate
                com.google.android.material.textfield.EndCompoundLayout r0 = r3.endLayout
                r4.<init>(r0)
                return r4
            L16:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                java.lang.String r2 = "Invalid end icon mode: "
                r1.<init>(r2)
                java.lang.StringBuilder r4 = r1.append(r4)
                java.lang.String r4 = r4.toString()
                r0.<init>(r4)
                throw r0
            L2b:
                com.google.android.material.textfield.ClearTextEndIconDelegate r4 = new com.google.android.material.textfield.ClearTextEndIconDelegate
                com.google.android.material.textfield.EndCompoundLayout r0 = r3.endLayout
                r4.<init>(r0)
                return r4
            L33:
                com.google.android.material.textfield.PasswordToggleEndIconDelegate r4 = new com.google.android.material.textfield.PasswordToggleEndIconDelegate
                com.google.android.material.textfield.EndCompoundLayout r0 = r3.endLayout
                int r1 = r3.passwordIconDrawableId
                r4.<init>(r0, r1)
                return r4
            L3d:
                com.google.android.material.textfield.NoEndIconDelegate r4 = new com.google.android.material.textfield.NoEndIconDelegate
                com.google.android.material.textfield.EndCompoundLayout r0 = r3.endLayout
                r4.<init>(r0)
                return r4
            L45:
                com.google.android.material.textfield.CustomEndIconDelegate r4 = new com.google.android.material.textfield.CustomEndIconDelegate
                com.google.android.material.textfield.EndCompoundLayout r0 = r3.endLayout
                r4.<init>(r0)
                return r4
        }

        com.google.android.material.textfield.EndIconDelegate get(int r3) {
                r2 = this;
                android.util.SparseArray<com.google.android.material.textfield.EndIconDelegate> r0 = r2.delegates
                java.lang.Object r0 = r0.get(r3)
                com.google.android.material.textfield.EndIconDelegate r0 = (com.google.android.material.textfield.EndIconDelegate) r0
                if (r0 != 0) goto L13
                com.google.android.material.textfield.EndIconDelegate r0 = r2.create(r3)
                android.util.SparseArray<com.google.android.material.textfield.EndIconDelegate> r1 = r2.delegates
                r1.append(r3, r0)
            L13:
                return r0
        }
    }

    EndCompoundLayout(com.google.android.material.textfield.TextInputLayout r7, androidx.appcompat.widget.TintTypedArray r8) {
            r6 = this;
            android.content.Context r0 = r7.getContext()
            r6.<init>(r0)
            r0 = 0
            r6.endIconMode = r0
            java.util.LinkedHashSet r1 = new java.util.LinkedHashSet
            r1.<init>()
            r6.endIconChangedListeners = r1
            com.google.android.material.textfield.EndCompoundLayout$1 r1 = new com.google.android.material.textfield.EndCompoundLayout$1
            r1.<init>(r6)
            r6.editTextWatcher = r1
            com.google.android.material.textfield.EndCompoundLayout$2 r1 = new com.google.android.material.textfield.EndCompoundLayout$2
            r1.<init>(r6)
            r6.onEditTextAttachedListener = r1
            android.content.Context r2 = r6.getContext()
            java.lang.String r3 = "accessibility"
            java.lang.Object r2 = r2.getSystemService(r3)
            android.view.accessibility.AccessibilityManager r2 = (android.view.accessibility.AccessibilityManager) r2
            r6.accessibilityManager = r2
            r6.textInputLayout = r7
            r2 = 8
            r6.setVisibility(r2)
            r6.setOrientation(r0)
            android.widget.FrameLayout$LayoutParams r0 = new android.widget.FrameLayout$LayoutParams
            r3 = 8388613(0x800005, float:1.175495E-38)
            r4 = -2
            r5 = -1
            r0.<init>(r4, r5, r3)
            r6.setLayoutParams(r0)
            android.widget.FrameLayout r0 = new android.widget.FrameLayout
            android.content.Context r3 = r6.getContext()
            r0.<init>(r3)
            r6.endIconFrame = r0
            r0.setVisibility(r2)
            android.widget.LinearLayout$LayoutParams r2 = new android.widget.LinearLayout$LayoutParams
            r2.<init>(r4, r5)
            r0.setLayoutParams(r2)
            android.content.Context r2 = r6.getContext()
            android.view.LayoutInflater r2 = android.view.LayoutInflater.from(r2)
            int r3 = com.google.android.material.R.id.text_input_error_icon
            com.google.android.material.internal.CheckableImageButton r3 = r6.createIconView(r6, r2, r3)
            r6.errorIconView = r3
            int r4 = com.google.android.material.R.id.text_input_end_icon
            com.google.android.material.internal.CheckableImageButton r2 = r6.createIconView(r0, r2, r4)
            r6.endIconView = r2
            com.google.android.material.textfield.EndCompoundLayout$EndIconDelegates r4 = new com.google.android.material.textfield.EndCompoundLayout$EndIconDelegates
            r4.<init>(r6, r8)
            r6.endIconDelegates = r4
            androidx.appcompat.widget.AppCompatTextView r4 = new androidx.appcompat.widget.AppCompatTextView
            android.content.Context r5 = r6.getContext()
            r4.<init>(r5)
            r6.suffixTextView = r4
            r6.initErrorIconView(r8)
            r6.initEndIconView(r8)
            r6.initSuffixTextView(r8)
            r0.addView(r2)
            r6.addView(r4)
            r6.addView(r0)
            r6.addView(r3)
            r7.addOnEditTextAttachedListener(r1)
            com.google.android.material.textfield.EndCompoundLayout$3 r7 = new com.google.android.material.textfield.EndCompoundLayout$3
            r7.<init>(r6)
            r6.addOnAttachStateChangeListener(r7)
            return
    }

    static /* synthetic */ android.widget.EditText access$000(com.google.android.material.textfield.EndCompoundLayout r0) {
            android.widget.EditText r0 = r0.editText
            return r0
    }

    static /* synthetic */ android.widget.EditText access$002(com.google.android.material.textfield.EndCompoundLayout r0, android.widget.EditText r1) {
            r0.editText = r1
            return r1
    }

    static /* synthetic */ android.text.TextWatcher access$100(com.google.android.material.textfield.EndCompoundLayout r0) {
            android.text.TextWatcher r0 = r0.editTextWatcher
            return r0
    }

    static /* synthetic */ void access$200(com.google.android.material.textfield.EndCompoundLayout r0, com.google.android.material.textfield.EndIconDelegate r1) {
            r0.setOnFocusChangeListenersIfNeeded(r1)
            return
    }

    static /* synthetic */ void access$300(com.google.android.material.textfield.EndCompoundLayout r0) {
            r0.addTouchExplorationStateChangeListenerIfNeeded()
            return
    }

    static /* synthetic */ void access$400(com.google.android.material.textfield.EndCompoundLayout r0) {
            r0.removeTouchExplorationStateChangeListenerIfNeeded()
            return
    }

    private void addTouchExplorationStateChangeListenerIfNeeded() {
            r2 = this;
            androidx.core.view.accessibility.AccessibilityManagerCompat$TouchExplorationStateChangeListener r0 = r2.touchExplorationStateChangeListener
            if (r0 == 0) goto L15
            android.view.accessibility.AccessibilityManager r0 = r2.accessibilityManager
            if (r0 == 0) goto L15
            boolean r0 = androidx.core.view.ViewCompat.isAttachedToWindow(r2)
            if (r0 == 0) goto L15
            android.view.accessibility.AccessibilityManager r0 = r2.accessibilityManager
            androidx.core.view.accessibility.AccessibilityManagerCompat$TouchExplorationStateChangeListener r1 = r2.touchExplorationStateChangeListener
            androidx.core.view.accessibility.AccessibilityManagerCompat.addTouchExplorationStateChangeListener(r0, r1)
        L15:
            return
    }

    private com.google.android.material.internal.CheckableImageButton createIconView(android.view.ViewGroup r3, android.view.LayoutInflater r4, int r5) {
            r2 = this;
            int r0 = com.google.android.material.R.layout.design_text_input_end_icon
            r1 = 0
            android.view.View r3 = r4.inflate(r0, r3, r1)
            com.google.android.material.internal.CheckableImageButton r3 = (com.google.android.material.internal.CheckableImageButton) r3
            r3.setId(r5)
            com.google.android.material.textfield.IconHelper.setCompatRippleBackgroundIfNeeded(r3)
            android.content.Context r4 = r2.getContext()
            boolean r4 = com.google.android.material.resources.MaterialResources.isFontScaleAtLeast1_3(r4)
            if (r4 == 0) goto L22
            android.view.ViewGroup$LayoutParams r4 = r3.getLayoutParams()
            android.view.ViewGroup$MarginLayoutParams r4 = (android.view.ViewGroup.MarginLayoutParams) r4
            androidx.core.view.MarginLayoutParamsCompat.setMarginStart(r4, r1)
        L22:
            return r3
    }

    private void dispatchOnEndIconChanged(int r4) {
            r3 = this;
            java.util.LinkedHashSet<com.google.android.material.textfield.TextInputLayout$OnEndIconChangedListener> r0 = r3.endIconChangedListeners
            java.util.Iterator r0 = r0.iterator()
        L6:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L18
            java.lang.Object r1 = r0.next()
            com.google.android.material.textfield.TextInputLayout$OnEndIconChangedListener r1 = (com.google.android.material.textfield.TextInputLayout.OnEndIconChangedListener) r1
            com.google.android.material.textfield.TextInputLayout r2 = r3.textInputLayout
            r1.onEndIconChanged(r2, r4)
            goto L6
        L18:
            return
    }

    private int getIconResId(com.google.android.material.textfield.EndIconDelegate r2) {
            r1 = this;
            com.google.android.material.textfield.EndCompoundLayout$EndIconDelegates r0 = r1.endIconDelegates
            int r0 = com.google.android.material.textfield.EndCompoundLayout.EndIconDelegates.access$500(r0)
            if (r0 != 0) goto Lc
            int r0 = r2.getIconDrawableResId()
        Lc:
            return r0
    }

    private void initEndIconView(androidx.appcompat.widget.TintTypedArray r6) {
            r5 = this;
            int r0 = com.google.android.material.R.styleable.TextInputLayout_passwordToggleEnabled
            boolean r0 = r6.hasValue(r0)
            r1 = 0
            r2 = -1
            if (r0 != 0) goto L32
            int r0 = com.google.android.material.R.styleable.TextInputLayout_endIconTint
            boolean r0 = r6.hasValue(r0)
            if (r0 == 0) goto L1e
            android.content.Context r0 = r5.getContext()
            int r3 = com.google.android.material.R.styleable.TextInputLayout_endIconTint
            android.content.res.ColorStateList r0 = com.google.android.material.resources.MaterialResources.getColorStateList(r0, r6, r3)
            r5.endIconTintList = r0
        L1e:
            int r0 = com.google.android.material.R.styleable.TextInputLayout_endIconTintMode
            boolean r0 = r6.hasValue(r0)
            if (r0 == 0) goto L32
            int r0 = com.google.android.material.R.styleable.TextInputLayout_endIconTintMode
            int r0 = r6.getInt(r0, r2)
            android.graphics.PorterDuff$Mode r0 = com.google.android.material.internal.ViewUtils.parseTintMode(r0, r1)
            r5.endIconTintMode = r0
        L32:
            int r0 = com.google.android.material.R.styleable.TextInputLayout_endIconMode
            boolean r0 = r6.hasValue(r0)
            r3 = 0
            if (r0 == 0) goto L60
            int r0 = com.google.android.material.R.styleable.TextInputLayout_endIconMode
            int r0 = r6.getInt(r0, r3)
            r5.setEndIconMode(r0)
            int r0 = com.google.android.material.R.styleable.TextInputLayout_endIconContentDescription
            boolean r0 = r6.hasValue(r0)
            if (r0 == 0) goto L55
            int r0 = com.google.android.material.R.styleable.TextInputLayout_endIconContentDescription
            java.lang.CharSequence r0 = r6.getText(r0)
            r5.setEndIconContentDescription(r0)
        L55:
            int r0 = com.google.android.material.R.styleable.TextInputLayout_endIconCheckable
            r1 = 1
            boolean r0 = r6.getBoolean(r0, r1)
            r5.setEndIconCheckable(r0)
            goto La2
        L60:
            int r0 = com.google.android.material.R.styleable.TextInputLayout_passwordToggleEnabled
            boolean r0 = r6.hasValue(r0)
            if (r0 == 0) goto La2
            int r0 = com.google.android.material.R.styleable.TextInputLayout_passwordToggleTint
            boolean r0 = r6.hasValue(r0)
            if (r0 == 0) goto L7c
            android.content.Context r0 = r5.getContext()
            int r4 = com.google.android.material.R.styleable.TextInputLayout_passwordToggleTint
            android.content.res.ColorStateList r0 = com.google.android.material.resources.MaterialResources.getColorStateList(r0, r6, r4)
            r5.endIconTintList = r0
        L7c:
            int r0 = com.google.android.material.R.styleable.TextInputLayout_passwordToggleTintMode
            boolean r0 = r6.hasValue(r0)
            if (r0 == 0) goto L90
            int r0 = com.google.android.material.R.styleable.TextInputLayout_passwordToggleTintMode
            int r0 = r6.getInt(r0, r2)
            android.graphics.PorterDuff$Mode r0 = com.google.android.material.internal.ViewUtils.parseTintMode(r0, r1)
            r5.endIconTintMode = r0
        L90:
            int r0 = com.google.android.material.R.styleable.TextInputLayout_passwordToggleEnabled
            boolean r0 = r6.getBoolean(r0, r3)
            r5.setEndIconMode(r0)
            int r0 = com.google.android.material.R.styleable.TextInputLayout_passwordToggleContentDescription
            java.lang.CharSequence r0 = r6.getText(r0)
            r5.setEndIconContentDescription(r0)
        La2:
            int r0 = com.google.android.material.R.styleable.TextInputLayout_endIconMinSize
            android.content.res.Resources r1 = r5.getResources()
            int r3 = com.google.android.material.R.dimen.mtrl_min_touch_target_size
            int r1 = r1.getDimensionPixelSize(r3)
            int r0 = r6.getDimensionPixelSize(r0, r1)
            r5.setEndIconMinSize(r0)
            int r0 = com.google.android.material.R.styleable.TextInputLayout_endIconScaleType
            boolean r0 = r6.hasValue(r0)
            if (r0 == 0) goto Lca
            int r0 = com.google.android.material.R.styleable.TextInputLayout_endIconScaleType
            int r6 = r6.getInt(r0, r2)
            android.widget.ImageView$ScaleType r6 = com.google.android.material.textfield.IconHelper.convertScaleType(r6)
            r5.setEndIconScaleType(r6)
        Lca:
            return
    }

    private void initErrorIconView(androidx.appcompat.widget.TintTypedArray r3) {
            r2 = this;
            int r0 = com.google.android.material.R.styleable.TextInputLayout_errorIconTint
            boolean r0 = r3.hasValue(r0)
            if (r0 == 0) goto L14
            android.content.Context r0 = r2.getContext()
            int r1 = com.google.android.material.R.styleable.TextInputLayout_errorIconTint
            android.content.res.ColorStateList r0 = com.google.android.material.resources.MaterialResources.getColorStateList(r0, r3, r1)
            r2.errorIconTintList = r0
        L14:
            int r0 = com.google.android.material.R.styleable.TextInputLayout_errorIconTintMode
            boolean r0 = r3.hasValue(r0)
            if (r0 == 0) goto L2a
            int r0 = com.google.android.material.R.styleable.TextInputLayout_errorIconTintMode
            r1 = -1
            int r0 = r3.getInt(r0, r1)
            r1 = 0
            android.graphics.PorterDuff$Mode r0 = com.google.android.material.internal.ViewUtils.parseTintMode(r0, r1)
            r2.errorIconTintMode = r0
        L2a:
            int r0 = com.google.android.material.R.styleable.TextInputLayout_errorIconDrawable
            boolean r0 = r3.hasValue(r0)
            if (r0 == 0) goto L3b
            int r0 = com.google.android.material.R.styleable.TextInputLayout_errorIconDrawable
            android.graphics.drawable.Drawable r3 = r3.getDrawable(r0)
            r2.setErrorIconDrawable(r3)
        L3b:
            com.google.android.material.internal.CheckableImageButton r3 = r2.errorIconView
            android.content.res.Resources r0 = r2.getResources()
            int r1 = com.google.android.material.R.string.error_icon_content_description
            java.lang.CharSequence r0 = r0.getText(r1)
            r3.setContentDescription(r0)
            com.google.android.material.internal.CheckableImageButton r3 = r2.errorIconView
            r0 = 2
            androidx.core.view.ViewCompat.setImportantForAccessibility(r3, r0)
            com.google.android.material.internal.CheckableImageButton r3 = r2.errorIconView
            r0 = 0
            r3.setClickable(r0)
            com.google.android.material.internal.CheckableImageButton r3 = r2.errorIconView
            r3.setPressable(r0)
            com.google.android.material.internal.CheckableImageButton r3 = r2.errorIconView
            r3.setFocusable(r0)
            return
    }

    private void initSuffixTextView(androidx.appcompat.widget.TintTypedArray r5) {
            r4 = this;
            android.widget.TextView r0 = r4.suffixTextView
            r1 = 8
            r0.setVisibility(r1)
            android.widget.TextView r0 = r4.suffixTextView
            int r1 = com.google.android.material.R.id.textinput_suffix_text
            r0.setId(r1)
            android.widget.TextView r0 = r4.suffixTextView
            android.widget.LinearLayout$LayoutParams r1 = new android.widget.LinearLayout$LayoutParams
            r2 = -2
            r3 = 1117782016(0x42a00000, float:80.0)
            r1.<init>(r2, r2, r3)
            r0.setLayoutParams(r1)
            android.widget.TextView r0 = r4.suffixTextView
            r1 = 1
            androidx.core.view.ViewCompat.setAccessibilityLiveRegion(r0, r1)
            int r0 = com.google.android.material.R.styleable.TextInputLayout_suffixTextAppearance
            r1 = 0
            int r0 = r5.getResourceId(r0, r1)
            r4.setSuffixTextAppearance(r0)
            int r0 = com.google.android.material.R.styleable.TextInputLayout_suffixTextColor
            boolean r0 = r5.hasValue(r0)
            if (r0 == 0) goto L3c
            int r0 = com.google.android.material.R.styleable.TextInputLayout_suffixTextColor
            android.content.res.ColorStateList r0 = r5.getColorStateList(r0)
            r4.setSuffixTextColor(r0)
        L3c:
            int r0 = com.google.android.material.R.styleable.TextInputLayout_suffixText
            java.lang.CharSequence r5 = r5.getText(r0)
            r4.setSuffixText(r5)
            return
    }

    private void removeTouchExplorationStateChangeListenerIfNeeded() {
            r2 = this;
            androidx.core.view.accessibility.AccessibilityManagerCompat$TouchExplorationStateChangeListener r0 = r2.touchExplorationStateChangeListener
            if (r0 == 0) goto Lb
            android.view.accessibility.AccessibilityManager r1 = r2.accessibilityManager
            if (r1 == 0) goto Lb
            androidx.core.view.accessibility.AccessibilityManagerCompat.removeTouchExplorationStateChangeListener(r1, r0)
        Lb:
            return
    }

    private void setOnFocusChangeListenersIfNeeded(com.google.android.material.textfield.EndIconDelegate r3) {
            r2 = this;
            android.widget.EditText r0 = r2.editText
            if (r0 != 0) goto L5
            return
        L5:
            android.view.View$OnFocusChangeListener r0 = r3.getOnEditTextFocusChangeListener()
            if (r0 == 0) goto L14
            android.widget.EditText r0 = r2.editText
            android.view.View$OnFocusChangeListener r1 = r3.getOnEditTextFocusChangeListener()
            r0.setOnFocusChangeListener(r1)
        L14:
            android.view.View$OnFocusChangeListener r0 = r3.getOnIconViewFocusChangeListener()
            if (r0 == 0) goto L23
            com.google.android.material.internal.CheckableImageButton r0 = r2.endIconView
            android.view.View$OnFocusChangeListener r3 = r3.getOnIconViewFocusChangeListener()
            r0.setOnFocusChangeListener(r3)
        L23:
            return
    }

    private void setUpDelegate(com.google.android.material.textfield.EndIconDelegate r1) {
            r0 = this;
            r1.setUp()
            androidx.core.view.accessibility.AccessibilityManagerCompat$TouchExplorationStateChangeListener r1 = r1.getTouchExplorationStateChangeListener()
            r0.touchExplorationStateChangeListener = r1
            r0.addTouchExplorationStateChangeListenerIfNeeded()
            return
    }

    private void tearDownDelegate(com.google.android.material.textfield.EndIconDelegate r2) {
            r1 = this;
            r1.removeTouchExplorationStateChangeListenerIfNeeded()
            r0 = 0
            r1.touchExplorationStateChangeListener = r0
            r2.tearDown()
            return
    }

    private void tintEndIconOnError(boolean r4) {
            r3 = this;
            if (r4 == 0) goto L23
            android.graphics.drawable.Drawable r4 = r3.getEndIconDrawable()
            if (r4 == 0) goto L23
            android.graphics.drawable.Drawable r4 = r3.getEndIconDrawable()
            android.graphics.drawable.Drawable r4 = androidx.core.graphics.drawable.DrawableCompat.wrap(r4)
            android.graphics.drawable.Drawable r4 = r4.mutate()
            com.google.android.material.textfield.TextInputLayout r0 = r3.textInputLayout
            int r0 = r0.getErrorCurrentTextColors()
            androidx.core.graphics.drawable.DrawableCompat.setTint(r4, r0)
            com.google.android.material.internal.CheckableImageButton r0 = r3.endIconView
            r0.setImageDrawable(r4)
            goto L2e
        L23:
            com.google.android.material.textfield.TextInputLayout r4 = r3.textInputLayout
            com.google.android.material.internal.CheckableImageButton r0 = r3.endIconView
            android.content.res.ColorStateList r1 = r3.endIconTintList
            android.graphics.PorterDuff$Mode r2 = r3.endIconTintMode
            com.google.android.material.textfield.IconHelper.applyIconTint(r4, r0, r1, r2)
        L2e:
            return
    }

    private void updateEndLayoutVisibility() {
            r4 = this;
            android.widget.FrameLayout r0 = r4.endIconFrame
            com.google.android.material.internal.CheckableImageButton r1 = r4.endIconView
            int r1 = r1.getVisibility()
            r2 = 0
            r3 = 8
            if (r1 != 0) goto L15
            boolean r1 = r4.isErrorIconVisible()
            if (r1 != 0) goto L15
            r1 = r2
            goto L16
        L15:
            r1 = r3
        L16:
            r0.setVisibility(r1)
            java.lang.CharSequence r0 = r4.suffixText
            if (r0 == 0) goto L23
            boolean r0 = r4.hintExpanded
            if (r0 != 0) goto L23
            r0 = r2
            goto L24
        L23:
            r0 = r3
        L24:
            boolean r1 = r4.isEndIconVisible()
            if (r1 != 0) goto L34
            boolean r1 = r4.isErrorIconVisible()
            if (r1 != 0) goto L34
            if (r0 != 0) goto L33
            goto L34
        L33:
            r2 = r3
        L34:
            r4.setVisibility(r2)
            return
    }

    private void updateErrorIconVisibility() {
            r3 = this;
            android.graphics.drawable.Drawable r0 = r3.getErrorIconDrawable()
            r1 = 0
            if (r0 == 0) goto L19
            com.google.android.material.textfield.TextInputLayout r0 = r3.textInputLayout
            boolean r0 = r0.isErrorEnabled()
            if (r0 == 0) goto L19
            com.google.android.material.textfield.TextInputLayout r0 = r3.textInputLayout
            boolean r0 = r0.shouldShowError()
            if (r0 == 0) goto L19
            r0 = 1
            goto L1a
        L19:
            r0 = r1
        L1a:
            com.google.android.material.internal.CheckableImageButton r2 = r3.errorIconView
            if (r0 == 0) goto L1f
            goto L21
        L1f:
            r1 = 8
        L21:
            r2.setVisibility(r1)
            r3.updateEndLayoutVisibility()
            r3.updateSuffixTextViewPadding()
            boolean r0 = r3.hasEndIcon()
            if (r0 != 0) goto L35
            com.google.android.material.textfield.TextInputLayout r0 = r3.textInputLayout
            r0.updateDummyDrawables()
        L35:
            return
    }

    private void updateSuffixTextVisibility() {
            r3 = this;
            android.widget.TextView r0 = r3.suffixTextView
            int r0 = r0.getVisibility()
            java.lang.CharSequence r1 = r3.suffixText
            r2 = 0
            if (r1 == 0) goto L11
            boolean r1 = r3.hintExpanded
            if (r1 != 0) goto L11
            r1 = r2
            goto L13
        L11:
            r1 = 8
        L13:
            if (r0 == r1) goto L1f
            com.google.android.material.textfield.EndIconDelegate r0 = r3.getEndIconDelegate()
            if (r1 != 0) goto L1c
            r2 = 1
        L1c:
            r0.onSuffixVisibilityChanged(r2)
        L1f:
            r3.updateEndLayoutVisibility()
            android.widget.TextView r0 = r3.suffixTextView
            r0.setVisibility(r1)
            com.google.android.material.textfield.TextInputLayout r0 = r3.textInputLayout
            r0.updateDummyDrawables()
            return
    }

    void addOnEndIconChangedListener(com.google.android.material.textfield.TextInputLayout.OnEndIconChangedListener r2) {
            r1 = this;
            java.util.LinkedHashSet<com.google.android.material.textfield.TextInputLayout$OnEndIconChangedListener> r0 = r1.endIconChangedListeners
            r0.add(r2)
            return
    }

    void checkEndIcon() {
            r1 = this;
            com.google.android.material.internal.CheckableImageButton r0 = r1.endIconView
            r0.performClick()
            com.google.android.material.internal.CheckableImageButton r0 = r1.endIconView
            r0.jumpDrawablesToCurrentState()
            return
    }

    void clearOnEndIconChangedListeners() {
            r1 = this;
            java.util.LinkedHashSet<com.google.android.material.textfield.TextInputLayout$OnEndIconChangedListener> r0 = r1.endIconChangedListeners
            r0.clear()
            return
    }

    com.google.android.material.internal.CheckableImageButton getCurrentEndIconView() {
            r1 = this;
            boolean r0 = r1.isErrorIconVisible()
            if (r0 == 0) goto L9
            com.google.android.material.internal.CheckableImageButton r0 = r1.errorIconView
            return r0
        L9:
            boolean r0 = r1.hasEndIcon()
            if (r0 == 0) goto L18
            boolean r0 = r1.isEndIconVisible()
            if (r0 == 0) goto L18
            com.google.android.material.internal.CheckableImageButton r0 = r1.endIconView
            return r0
        L18:
            r0 = 0
            return r0
    }

    java.lang.CharSequence getEndIconContentDescription() {
            r1 = this;
            com.google.android.material.internal.CheckableImageButton r0 = r1.endIconView
            java.lang.CharSequence r0 = r0.getContentDescription()
            return r0
    }

    com.google.android.material.textfield.EndIconDelegate getEndIconDelegate() {
            r2 = this;
            com.google.android.material.textfield.EndCompoundLayout$EndIconDelegates r0 = r2.endIconDelegates
            int r1 = r2.endIconMode
            com.google.android.material.textfield.EndIconDelegate r0 = r0.get(r1)
            return r0
    }

    android.graphics.drawable.Drawable getEndIconDrawable() {
            r1 = this;
            com.google.android.material.internal.CheckableImageButton r0 = r1.endIconView
            android.graphics.drawable.Drawable r0 = r0.getDrawable()
            return r0
    }

    int getEndIconMinSize() {
            r1 = this;
            int r0 = r1.endIconMinSize
            return r0
    }

    int getEndIconMode() {
            r1 = this;
            int r0 = r1.endIconMode
            return r0
    }

    android.widget.ImageView.ScaleType getEndIconScaleType() {
            r1 = this;
            android.widget.ImageView$ScaleType r0 = r1.endIconScaleType
            return r0
    }

    com.google.android.material.internal.CheckableImageButton getEndIconView() {
            r1 = this;
            com.google.android.material.internal.CheckableImageButton r0 = r1.endIconView
            return r0
    }

    android.graphics.drawable.Drawable getErrorIconDrawable() {
            r1 = this;
            com.google.android.material.internal.CheckableImageButton r0 = r1.errorIconView
            android.graphics.drawable.Drawable r0 = r0.getDrawable()
            return r0
    }

    java.lang.CharSequence getPasswordVisibilityToggleContentDescription() {
            r1 = this;
            com.google.android.material.internal.CheckableImageButton r0 = r1.endIconView
            java.lang.CharSequence r0 = r0.getContentDescription()
            return r0
    }

    android.graphics.drawable.Drawable getPasswordVisibilityToggleDrawable() {
            r1 = this;
            com.google.android.material.internal.CheckableImageButton r0 = r1.endIconView
            android.graphics.drawable.Drawable r0 = r0.getDrawable()
            return r0
    }

    java.lang.CharSequence getSuffixText() {
            r1 = this;
            java.lang.CharSequence r0 = r1.suffixText
            return r0
    }

    android.content.res.ColorStateList getSuffixTextColor() {
            r1 = this;
            android.widget.TextView r0 = r1.suffixTextView
            android.content.res.ColorStateList r0 = r0.getTextColors()
            return r0
    }

    int getSuffixTextEndOffset() {
            r3 = this;
            boolean r0 = r3.isEndIconVisible()
            if (r0 != 0) goto Lf
            boolean r0 = r3.isErrorIconVisible()
            if (r0 == 0) goto Ld
            goto Lf
        Ld:
            r0 = 0
            goto L22
        Lf:
            com.google.android.material.internal.CheckableImageButton r0 = r3.endIconView
            int r0 = r0.getMeasuredWidth()
            com.google.android.material.internal.CheckableImageButton r1 = r3.endIconView
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            android.view.ViewGroup$MarginLayoutParams r1 = (android.view.ViewGroup.MarginLayoutParams) r1
            int r1 = androidx.core.view.MarginLayoutParamsCompat.getMarginStart(r1)
            int r0 = r0 + r1
        L22:
            int r1 = androidx.core.view.ViewCompat.getPaddingEnd(r3)
            android.widget.TextView r2 = r3.suffixTextView
            int r2 = androidx.core.view.ViewCompat.getPaddingEnd(r2)
            int r1 = r1 + r2
            int r1 = r1 + r0
            return r1
    }

    android.widget.TextView getSuffixTextView() {
            r1 = this;
            android.widget.TextView r0 = r1.suffixTextView
            return r0
    }

    boolean hasEndIcon() {
            r1 = this;
            int r0 = r1.endIconMode
            if (r0 == 0) goto L6
            r0 = 1
            goto L7
        L6:
            r0 = 0
        L7:
            return r0
    }

    boolean isEndIconCheckable() {
            r1 = this;
            com.google.android.material.internal.CheckableImageButton r0 = r1.endIconView
            boolean r0 = r0.isCheckable()
            return r0
    }

    boolean isEndIconChecked() {
            r1 = this;
            boolean r0 = r1.hasEndIcon()
            if (r0 == 0) goto L10
            com.google.android.material.internal.CheckableImageButton r0 = r1.endIconView
            boolean r0 = r0.isChecked()
            if (r0 == 0) goto L10
            r0 = 1
            goto L11
        L10:
            r0 = 0
        L11:
            return r0
    }

    boolean isEndIconVisible() {
            r1 = this;
            android.widget.FrameLayout r0 = r1.endIconFrame
            int r0 = r0.getVisibility()
            if (r0 != 0) goto L12
            com.google.android.material.internal.CheckableImageButton r0 = r1.endIconView
            int r0 = r0.getVisibility()
            if (r0 != 0) goto L12
            r0 = 1
            goto L13
        L12:
            r0 = 0
        L13:
            return r0
    }

    boolean isErrorIconVisible() {
            r1 = this;
            com.google.android.material.internal.CheckableImageButton r0 = r1.errorIconView
            int r0 = r0.getVisibility()
            if (r0 != 0) goto La
            r0 = 1
            goto Lb
        La:
            r0 = 0
        Lb:
            return r0
    }

    boolean isPasswordVisibilityToggleEnabled() {
            r2 = this;
            int r0 = r2.endIconMode
            r1 = 1
            if (r0 != r1) goto L6
            goto L7
        L6:
            r1 = 0
        L7:
            return r1
    }

    void onHintStateChanged(boolean r1) {
            r0 = this;
            r0.hintExpanded = r1
            r0.updateSuffixTextVisibility()
            return
    }

    void onTextInputBoxStateUpdated() {
            r1 = this;
            r1.updateErrorIconVisibility()
            r1.refreshErrorIconDrawableState()
            r1.refreshEndIconDrawableState()
            com.google.android.material.textfield.EndIconDelegate r0 = r1.getEndIconDelegate()
            boolean r0 = r0.shouldTintIconOnError()
            if (r0 == 0) goto L1c
            com.google.android.material.textfield.TextInputLayout r0 = r1.textInputLayout
            boolean r0 = r0.shouldShowError()
            r1.tintEndIconOnError(r0)
        L1c:
            return
    }

    void refreshEndIconDrawableState() {
            r3 = this;
            com.google.android.material.textfield.TextInputLayout r0 = r3.textInputLayout
            com.google.android.material.internal.CheckableImageButton r1 = r3.endIconView
            android.content.res.ColorStateList r2 = r3.endIconTintList
            com.google.android.material.textfield.IconHelper.refreshIconDrawableState(r0, r1, r2)
            return
    }

    void refreshErrorIconDrawableState() {
            r3 = this;
            com.google.android.material.textfield.TextInputLayout r0 = r3.textInputLayout
            com.google.android.material.internal.CheckableImageButton r1 = r3.errorIconView
            android.content.res.ColorStateList r2 = r3.errorIconTintList
            com.google.android.material.textfield.IconHelper.refreshIconDrawableState(r0, r1, r2)
            return
    }

    void refreshIconState(boolean r5) {
            r4 = this;
            com.google.android.material.textfield.EndIconDelegate r0 = r4.getEndIconDelegate()
            boolean r1 = r0.isIconCheckable()
            r2 = 1
            if (r1 == 0) goto L1f
            com.google.android.material.internal.CheckableImageButton r1 = r4.endIconView
            boolean r1 = r1.isChecked()
            boolean r3 = r0.isIconChecked()
            if (r1 == r3) goto L1f
            com.google.android.material.internal.CheckableImageButton r3 = r4.endIconView
            r1 = r1 ^ r2
            r3.setChecked(r1)
            r1 = r2
            goto L20
        L1f:
            r1 = 0
        L20:
            boolean r3 = r0.isIconActivable()
            if (r3 == 0) goto L38
            com.google.android.material.internal.CheckableImageButton r3 = r4.endIconView
            boolean r3 = r3.isActivated()
            boolean r0 = r0.isIconActivated()
            if (r3 == r0) goto L38
            r0 = r3 ^ 1
            r4.setEndIconActivated(r0)
            goto L39
        L38:
            r2 = r1
        L39:
            if (r5 != 0) goto L3d
            if (r2 == 0) goto L40
        L3d:
            r4.refreshEndIconDrawableState()
        L40:
            return
    }

    void removeOnEndIconChangedListener(com.google.android.material.textfield.TextInputLayout.OnEndIconChangedListener r2) {
            r1 = this;
            java.util.LinkedHashSet<com.google.android.material.textfield.TextInputLayout$OnEndIconChangedListener> r0 = r1.endIconChangedListeners
            r0.remove(r2)
            return
    }

    void setEndIconActivated(boolean r2) {
            r1 = this;
            com.google.android.material.internal.CheckableImageButton r0 = r1.endIconView
            r0.setActivated(r2)
            return
    }

    void setEndIconCheckable(boolean r2) {
            r1 = this;
            com.google.android.material.internal.CheckableImageButton r0 = r1.endIconView
            r0.setCheckable(r2)
            return
    }

    void setEndIconContentDescription(int r2) {
            r1 = this;
            if (r2 == 0) goto Lb
            android.content.res.Resources r0 = r1.getResources()
            java.lang.CharSequence r2 = r0.getText(r2)
            goto Lc
        Lb:
            r2 = 0
        Lc:
            r1.setEndIconContentDescription(r2)
            return
    }

    void setEndIconContentDescription(java.lang.CharSequence r2) {
            r1 = this;
            java.lang.CharSequence r0 = r1.getEndIconContentDescription()
            if (r0 == r2) goto Lb
            com.google.android.material.internal.CheckableImageButton r0 = r1.endIconView
            r0.setContentDescription(r2)
        Lb:
            return
    }

    void setEndIconDrawable(int r2) {
            r1 = this;
            if (r2 == 0) goto Lb
            android.content.Context r0 = r1.getContext()
            android.graphics.drawable.Drawable r2 = androidx.appcompat.content.res.AppCompatResources.getDrawable(r0, r2)
            goto Lc
        Lb:
            r2 = 0
        Lc:
            r1.setEndIconDrawable(r2)
            return
    }

    void setEndIconDrawable(android.graphics.drawable.Drawable r4) {
            r3 = this;
            com.google.android.material.internal.CheckableImageButton r0 = r3.endIconView
            r0.setImageDrawable(r4)
            if (r4 == 0) goto L15
            com.google.android.material.textfield.TextInputLayout r4 = r3.textInputLayout
            com.google.android.material.internal.CheckableImageButton r0 = r3.endIconView
            android.content.res.ColorStateList r1 = r3.endIconTintList
            android.graphics.PorterDuff$Mode r2 = r3.endIconTintMode
            com.google.android.material.textfield.IconHelper.applyIconTint(r4, r0, r1, r2)
            r3.refreshEndIconDrawableState()
        L15:
            return
    }

    void setEndIconMinSize(int r2) {
            r1 = this;
            if (r2 < 0) goto L13
            int r0 = r1.endIconMinSize
            if (r2 == r0) goto L12
            r1.endIconMinSize = r2
            com.google.android.material.internal.CheckableImageButton r0 = r1.endIconView
            com.google.android.material.textfield.IconHelper.setIconMinSize(r0, r2)
            com.google.android.material.internal.CheckableImageButton r0 = r1.errorIconView
            com.google.android.material.textfield.IconHelper.setIconMinSize(r0, r2)
        L12:
            return
        L13:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "endIconSize cannot be less than 0"
            r2.<init>(r0)
            throw r2
    }

    void setEndIconMode(int r5) {
            r4 = this;
            int r0 = r4.endIconMode
            if (r0 != r5) goto L5
            return
        L5:
            com.google.android.material.textfield.EndIconDelegate r0 = r4.getEndIconDelegate()
            r4.tearDownDelegate(r0)
            int r0 = r4.endIconMode
            r4.endIconMode = r5
            r4.dispatchOnEndIconChanged(r0)
            r0 = 1
            if (r5 == 0) goto L18
            r1 = r0
            goto L19
        L18:
            r1 = 0
        L19:
            r4.setEndIconVisible(r1)
            com.google.android.material.textfield.EndIconDelegate r1 = r4.getEndIconDelegate()
            int r2 = r4.getIconResId(r1)
            r4.setEndIconDrawable(r2)
            int r2 = r1.getIconContentDescriptionResId()
            r4.setEndIconContentDescription(r2)
            boolean r2 = r1.isIconCheckable()
            r4.setEndIconCheckable(r2)
            com.google.android.material.textfield.TextInputLayout r2 = r4.textInputLayout
            int r2 = r2.getBoxBackgroundMode()
            boolean r2 = r1.isBoxBackgroundModeSupported(r2)
            if (r2 == 0) goto L64
            r4.setUpDelegate(r1)
            android.view.View$OnClickListener r5 = r1.getOnIconClickListener()
            r4.setEndIconOnClickListener(r5)
            android.widget.EditText r5 = r4.editText
            if (r5 == 0) goto L55
            r1.onEditTextAttached(r5)
            r4.setOnFocusChangeListenersIfNeeded(r1)
        L55:
            com.google.android.material.textfield.TextInputLayout r5 = r4.textInputLayout
            com.google.android.material.internal.CheckableImageButton r1 = r4.endIconView
            android.content.res.ColorStateList r2 = r4.endIconTintList
            android.graphics.PorterDuff$Mode r3 = r4.endIconTintMode
            com.google.android.material.textfield.IconHelper.applyIconTint(r5, r1, r2, r3)
            r4.refreshIconState(r0)
            return
        L64:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "The current box background mode "
            r1.<init>(r2)
            com.google.android.material.textfield.TextInputLayout r2 = r4.textInputLayout
            int r2 = r2.getBoxBackgroundMode()
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = " is not supported by the end icon mode "
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.StringBuilder r5 = r1.append(r5)
            java.lang.String r5 = r5.toString()
            r0.<init>(r5)
            throw r0
    }

    void setEndIconOnClickListener(android.view.View.OnClickListener r3) {
            r2 = this;
            com.google.android.material.internal.CheckableImageButton r0 = r2.endIconView
            android.view.View$OnLongClickListener r1 = r2.endIconOnLongClickListener
            com.google.android.material.textfield.IconHelper.setIconOnClickListener(r0, r3, r1)
            return
    }

    void setEndIconOnLongClickListener(android.view.View.OnLongClickListener r2) {
            r1 = this;
            r1.endIconOnLongClickListener = r2
            com.google.android.material.internal.CheckableImageButton r0 = r1.endIconView
            com.google.android.material.textfield.IconHelper.setIconOnLongClickListener(r0, r2)
            return
    }

    void setEndIconScaleType(android.widget.ImageView.ScaleType r2) {
            r1 = this;
            r1.endIconScaleType = r2
            com.google.android.material.internal.CheckableImageButton r0 = r1.endIconView
            com.google.android.material.textfield.IconHelper.setIconScaleType(r0, r2)
            com.google.android.material.internal.CheckableImageButton r0 = r1.errorIconView
            com.google.android.material.textfield.IconHelper.setIconScaleType(r0, r2)
            return
    }

    void setEndIconTintList(android.content.res.ColorStateList r4) {
            r3 = this;
            android.content.res.ColorStateList r0 = r3.endIconTintList
            if (r0 == r4) goto Lf
            r3.endIconTintList = r4
            com.google.android.material.textfield.TextInputLayout r0 = r3.textInputLayout
            com.google.android.material.internal.CheckableImageButton r1 = r3.endIconView
            android.graphics.PorterDuff$Mode r2 = r3.endIconTintMode
            com.google.android.material.textfield.IconHelper.applyIconTint(r0, r1, r4, r2)
        Lf:
            return
    }

    void setEndIconTintMode(android.graphics.PorterDuff.Mode r4) {
            r3 = this;
            android.graphics.PorterDuff$Mode r0 = r3.endIconTintMode
            if (r0 == r4) goto Lf
            r3.endIconTintMode = r4
            com.google.android.material.textfield.TextInputLayout r0 = r3.textInputLayout
            com.google.android.material.internal.CheckableImageButton r1 = r3.endIconView
            android.content.res.ColorStateList r2 = r3.endIconTintList
            com.google.android.material.textfield.IconHelper.applyIconTint(r0, r1, r2, r4)
        Lf:
            return
    }

    void setEndIconVisible(boolean r2) {
            r1 = this;
            boolean r0 = r1.isEndIconVisible()
            if (r0 == r2) goto L1c
            com.google.android.material.internal.CheckableImageButton r0 = r1.endIconView
            if (r2 == 0) goto Lc
            r2 = 0
            goto Le
        Lc:
            r2 = 8
        Le:
            r0.setVisibility(r2)
            r1.updateEndLayoutVisibility()
            r1.updateSuffixTextViewPadding()
            com.google.android.material.textfield.TextInputLayout r2 = r1.textInputLayout
            r2.updateDummyDrawables()
        L1c:
            return
    }

    void setErrorIconDrawable(int r2) {
            r1 = this;
            if (r2 == 0) goto Lb
            android.content.Context r0 = r1.getContext()
            android.graphics.drawable.Drawable r2 = androidx.appcompat.content.res.AppCompatResources.getDrawable(r0, r2)
            goto Lc
        Lb:
            r2 = 0
        Lc:
            r1.setErrorIconDrawable(r2)
            r1.refreshErrorIconDrawableState()
            return
    }

    void setErrorIconDrawable(android.graphics.drawable.Drawable r4) {
            r3 = this;
            com.google.android.material.internal.CheckableImageButton r0 = r3.errorIconView
            r0.setImageDrawable(r4)
            r3.updateErrorIconVisibility()
            com.google.android.material.textfield.TextInputLayout r4 = r3.textInputLayout
            com.google.android.material.internal.CheckableImageButton r0 = r3.errorIconView
            android.content.res.ColorStateList r1 = r3.errorIconTintList
            android.graphics.PorterDuff$Mode r2 = r3.errorIconTintMode
            com.google.android.material.textfield.IconHelper.applyIconTint(r4, r0, r1, r2)
            return
    }

    void setErrorIconOnClickListener(android.view.View.OnClickListener r3) {
            r2 = this;
            com.google.android.material.internal.CheckableImageButton r0 = r2.errorIconView
            android.view.View$OnLongClickListener r1 = r2.errorIconOnLongClickListener
            com.google.android.material.textfield.IconHelper.setIconOnClickListener(r0, r3, r1)
            return
    }

    void setErrorIconOnLongClickListener(android.view.View.OnLongClickListener r2) {
            r1 = this;
            r1.errorIconOnLongClickListener = r2
            com.google.android.material.internal.CheckableImageButton r0 = r1.errorIconView
            com.google.android.material.textfield.IconHelper.setIconOnLongClickListener(r0, r2)
            return
    }

    void setErrorIconTintList(android.content.res.ColorStateList r4) {
            r3 = this;
            android.content.res.ColorStateList r0 = r3.errorIconTintList
            if (r0 == r4) goto Lf
            r3.errorIconTintList = r4
            com.google.android.material.textfield.TextInputLayout r0 = r3.textInputLayout
            com.google.android.material.internal.CheckableImageButton r1 = r3.errorIconView
            android.graphics.PorterDuff$Mode r2 = r3.errorIconTintMode
            com.google.android.material.textfield.IconHelper.applyIconTint(r0, r1, r4, r2)
        Lf:
            return
    }

    void setErrorIconTintMode(android.graphics.PorterDuff.Mode r4) {
            r3 = this;
            android.graphics.PorterDuff$Mode r0 = r3.errorIconTintMode
            if (r0 == r4) goto Lf
            r3.errorIconTintMode = r4
            com.google.android.material.textfield.TextInputLayout r0 = r3.textInputLayout
            com.google.android.material.internal.CheckableImageButton r1 = r3.errorIconView
            android.content.res.ColorStateList r2 = r3.errorIconTintList
            com.google.android.material.textfield.IconHelper.applyIconTint(r0, r1, r2, r4)
        Lf:
            return
    }

    void setPasswordVisibilityToggleContentDescription(int r2) {
            r1 = this;
            if (r2 == 0) goto Lb
            android.content.res.Resources r0 = r1.getResources()
            java.lang.CharSequence r2 = r0.getText(r2)
            goto Lc
        Lb:
            r2 = 0
        Lc:
            r1.setPasswordVisibilityToggleContentDescription(r2)
            return
    }

    void setPasswordVisibilityToggleContentDescription(java.lang.CharSequence r2) {
            r1 = this;
            com.google.android.material.internal.CheckableImageButton r0 = r1.endIconView
            r0.setContentDescription(r2)
            return
    }

    void setPasswordVisibilityToggleDrawable(int r2) {
            r1 = this;
            if (r2 == 0) goto Lb
            android.content.Context r0 = r1.getContext()
            android.graphics.drawable.Drawable r2 = androidx.appcompat.content.res.AppCompatResources.getDrawable(r0, r2)
            goto Lc
        Lb:
            r2 = 0
        Lc:
            r1.setPasswordVisibilityToggleDrawable(r2)
            return
    }

    void setPasswordVisibilityToggleDrawable(android.graphics.drawable.Drawable r2) {
            r1 = this;
            com.google.android.material.internal.CheckableImageButton r0 = r1.endIconView
            r0.setImageDrawable(r2)
            return
    }

    void setPasswordVisibilityToggleEnabled(boolean r3) {
            r2 = this;
            if (r3 == 0) goto Lb
            int r0 = r2.endIconMode
            r1 = 1
            if (r0 == r1) goto Lb
            r2.setEndIconMode(r1)
            goto L11
        Lb:
            if (r3 != 0) goto L11
            r3 = 0
            r2.setEndIconMode(r3)
        L11:
            return
    }

    void setPasswordVisibilityToggleTintList(android.content.res.ColorStateList r4) {
            r3 = this;
            r3.endIconTintList = r4
            com.google.android.material.textfield.TextInputLayout r0 = r3.textInputLayout
            com.google.android.material.internal.CheckableImageButton r1 = r3.endIconView
            android.graphics.PorterDuff$Mode r2 = r3.endIconTintMode
            com.google.android.material.textfield.IconHelper.applyIconTint(r0, r1, r4, r2)
            return
    }

    void setPasswordVisibilityToggleTintMode(android.graphics.PorterDuff.Mode r4) {
            r3 = this;
            r3.endIconTintMode = r4
            com.google.android.material.textfield.TextInputLayout r0 = r3.textInputLayout
            com.google.android.material.internal.CheckableImageButton r1 = r3.endIconView
            android.content.res.ColorStateList r2 = r3.endIconTintList
            com.google.android.material.textfield.IconHelper.applyIconTint(r0, r1, r2, r4)
            return
    }

    void setSuffixText(java.lang.CharSequence r2) {
            r1 = this;
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 == 0) goto L8
            r0 = 0
            goto L9
        L8:
            r0 = r2
        L9:
            r1.suffixText = r0
            android.widget.TextView r0 = r1.suffixTextView
            r0.setText(r2)
            r1.updateSuffixTextVisibility()
            return
    }

    void setSuffixTextAppearance(int r2) {
            r1 = this;
            android.widget.TextView r0 = r1.suffixTextView
            androidx.core.widget.TextViewCompat.setTextAppearance(r0, r2)
            return
    }

    void setSuffixTextColor(android.content.res.ColorStateList r2) {
            r1 = this;
            android.widget.TextView r0 = r1.suffixTextView
            r0.setTextColor(r2)
            return
    }

    void togglePasswordVisibilityToggle(boolean r3) {
            r2 = this;
            int r0 = r2.endIconMode
            r1 = 1
            if (r0 != r1) goto L11
            com.google.android.material.internal.CheckableImageButton r0 = r2.endIconView
            r0.performClick()
            if (r3 == 0) goto L11
            com.google.android.material.internal.CheckableImageButton r3 = r2.endIconView
            r3.jumpDrawablesToCurrentState()
        L11:
            return
    }

    void updateSuffixTextViewPadding() {
            r5 = this;
            com.google.android.material.textfield.TextInputLayout r0 = r5.textInputLayout
            android.widget.EditText r0 = r0.editText
            if (r0 != 0) goto L7
            return
        L7:
            boolean r0 = r5.isEndIconVisible()
            if (r0 != 0) goto L1d
            boolean r0 = r5.isErrorIconVisible()
            if (r0 == 0) goto L14
            goto L1d
        L14:
            com.google.android.material.textfield.TextInputLayout r0 = r5.textInputLayout
            android.widget.EditText r0 = r0.editText
            int r0 = androidx.core.view.ViewCompat.getPaddingEnd(r0)
            goto L1e
        L1d:
            r0 = 0
        L1e:
            android.widget.TextView r1 = r5.suffixTextView
            android.content.Context r2 = r5.getContext()
            android.content.res.Resources r2 = r2.getResources()
            int r3 = com.google.android.material.R.dimen.material_input_text_to_prefix_suffix_padding
            int r2 = r2.getDimensionPixelSize(r3)
            com.google.android.material.textfield.TextInputLayout r3 = r5.textInputLayout
            android.widget.EditText r3 = r3.editText
            int r3 = r3.getPaddingTop()
            com.google.android.material.textfield.TextInputLayout r4 = r5.textInputLayout
            android.widget.EditText r4 = r4.editText
            int r4 = r4.getPaddingBottom()
            androidx.core.view.ViewCompat.setPaddingRelative(r1, r2, r3, r0, r4)
            return
    }
}
