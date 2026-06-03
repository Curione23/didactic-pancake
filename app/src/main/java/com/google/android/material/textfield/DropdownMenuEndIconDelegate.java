package com.google.android.material.textfield;

/* JADX INFO: loaded from: classes.dex */
class DropdownMenuEndIconDelegate extends com.google.android.material.textfield.EndIconDelegate {
    private static final int DEFAULT_ANIMATION_FADE_IN_DURATION = 67;
    private static final int DEFAULT_ANIMATION_FADE_OUT_DURATION = 50;
    private static final boolean IS_LOLLIPOP = false;
    private android.view.accessibility.AccessibilityManager accessibilityManager;
    private final int animationFadeInDuration;
    private final android.animation.TimeInterpolator animationFadeInterpolator;
    private final int animationFadeOutDuration;
    private android.widget.AutoCompleteTextView autoCompleteTextView;
    private long dropdownPopupActivatedAt;
    private boolean dropdownPopupDirty;
    private boolean editTextHasFocus;
    private android.animation.ValueAnimator fadeInAnim;
    private android.animation.ValueAnimator fadeOutAnim;
    private boolean isEndIconChecked;
    private final android.view.View.OnFocusChangeListener onEditTextFocusChangeListener;
    private final android.view.View.OnClickListener onIconClickListener;
    private final androidx.core.view.accessibility.AccessibilityManagerCompat.TouchExplorationStateChangeListener touchExplorationStateChangeListener;


    static {
            r0 = 1
            com.google.android.material.textfield.DropdownMenuEndIconDelegate.IS_LOLLIPOP = r0
            return
    }

    DropdownMenuEndIconDelegate(com.google.android.material.textfield.EndCompoundLayout r4) {
            r3 = this;
            r3.<init>(r4)
            com.google.android.material.textfield.DropdownMenuEndIconDelegate$$ExternalSyntheticLambda3 r0 = new com.google.android.material.textfield.DropdownMenuEndIconDelegate$$ExternalSyntheticLambda3
            r0.<init>(r3)
            r3.onIconClickListener = r0
            com.google.android.material.textfield.DropdownMenuEndIconDelegate$$ExternalSyntheticLambda4 r0 = new com.google.android.material.textfield.DropdownMenuEndIconDelegate$$ExternalSyntheticLambda4
            r0.<init>(r3)
            r3.onEditTextFocusChangeListener = r0
            com.google.android.material.textfield.DropdownMenuEndIconDelegate$$ExternalSyntheticLambda5 r0 = new com.google.android.material.textfield.DropdownMenuEndIconDelegate$$ExternalSyntheticLambda5
            r0.<init>(r3)
            r3.touchExplorationStateChangeListener = r0
            r0 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r3.dropdownPopupActivatedAt = r0
            android.content.Context r0 = r4.getContext()
            int r1 = com.google.android.material.R.attr.motionDurationShort3
            r2 = 67
            int r0 = com.google.android.material.motion.MotionUtils.resolveThemeDuration(r0, r1, r2)
            r3.animationFadeInDuration = r0
            android.content.Context r0 = r4.getContext()
            int r1 = com.google.android.material.R.attr.motionDurationShort3
            r2 = 50
            int r0 = com.google.android.material.motion.MotionUtils.resolveThemeDuration(r0, r1, r2)
            r3.animationFadeOutDuration = r0
            android.content.Context r4 = r4.getContext()
            int r0 = com.google.android.material.R.attr.motionEasingLinearInterpolator
            android.animation.TimeInterpolator r1 = com.google.android.material.animation.AnimationUtils.LINEAR_INTERPOLATOR
            android.animation.TimeInterpolator r4 = com.google.android.material.motion.MotionUtils.resolveThemeInterpolator(r4, r0, r1)
            r3.animationFadeInterpolator = r4
            return
    }

    static /* synthetic */ android.animation.ValueAnimator access$000(com.google.android.material.textfield.DropdownMenuEndIconDelegate r0) {
            android.animation.ValueAnimator r0 = r0.fadeInAnim
            return r0
    }

    private static android.widget.AutoCompleteTextView castAutoCompleteTextViewOrThrow(android.widget.EditText r1) {
            boolean r0 = r1 instanceof android.widget.AutoCompleteTextView
            if (r0 == 0) goto L7
            android.widget.AutoCompleteTextView r1 = (android.widget.AutoCompleteTextView) r1
            return r1
        L7:
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            java.lang.String r0 = "EditText needs to be an AutoCompleteTextView if an Exposed Dropdown Menu is being used."
            r1.<init>(r0)
            throw r1
    }

    private android.animation.ValueAnimator getAlphaAnimator(int r3, float... r4) {
            r2 = this;
            android.animation.ValueAnimator r4 = android.animation.ValueAnimator.ofFloat(r4)
            android.animation.TimeInterpolator r0 = r2.animationFadeInterpolator
            r4.setInterpolator(r0)
            long r0 = (long) r3
            r4.setDuration(r0)
            com.google.android.material.textfield.DropdownMenuEndIconDelegate$$ExternalSyntheticLambda0 r3 = new com.google.android.material.textfield.DropdownMenuEndIconDelegate$$ExternalSyntheticLambda0
            r3.<init>(r2)
            r4.addUpdateListener(r3)
            return r4
    }

    private void initAnimators() {
            r3 = this;
            int r0 = r3.animationFadeInDuration
            r1 = 2
            float[] r2 = new float[r1]
            r2 = {x0024: FILL_ARRAY_DATA , data: [0, 1065353216} // fill-array
            android.animation.ValueAnimator r0 = r3.getAlphaAnimator(r0, r2)
            r3.fadeInAnim = r0
            int r0 = r3.animationFadeOutDuration
            float[] r1 = new float[r1]
            r1 = {x002c: FILL_ARRAY_DATA , data: [1065353216, 0} // fill-array
            android.animation.ValueAnimator r0 = r3.getAlphaAnimator(r0, r1)
            r3.fadeOutAnim = r0
            com.google.android.material.textfield.DropdownMenuEndIconDelegate$1 r1 = new com.google.android.material.textfield.DropdownMenuEndIconDelegate$1
            r1.<init>(r3)
            r0.addListener(r1)
            return
    }

    private boolean isDropdownPopupActive() {
            r4 = this;
            long r0 = java.lang.System.currentTimeMillis()
            long r2 = r4.dropdownPopupActivatedAt
            long r0 = r0 - r2
            r2 = 0
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 < 0) goto L16
            r2 = 300(0x12c, double:1.48E-321)
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 <= 0) goto L14
            goto L16
        L14:
            r0 = 0
            goto L17
        L16:
            r0 = 1
        L17:
            return r0
    }

    private void setEndIconChecked(boolean r2) {
            r1 = this;
            boolean r0 = r1.isEndIconChecked
            if (r0 == r2) goto L10
            r1.isEndIconChecked = r2
            android.animation.ValueAnimator r2 = r1.fadeInAnim
            r2.cancel()
            android.animation.ValueAnimator r2 = r1.fadeOutAnim
            r2.start()
        L10:
            return
    }

    private void setUpDropdownShowHideBehavior() {
            r2 = this;
            android.widget.AutoCompleteTextView r0 = r2.autoCompleteTextView
            com.google.android.material.textfield.DropdownMenuEndIconDelegate$$ExternalSyntheticLambda1 r1 = new com.google.android.material.textfield.DropdownMenuEndIconDelegate$$ExternalSyntheticLambda1
            r1.<init>(r2)
            r0.setOnTouchListener(r1)
            boolean r0 = com.google.android.material.textfield.DropdownMenuEndIconDelegate.IS_LOLLIPOP
            if (r0 == 0) goto L18
            android.widget.AutoCompleteTextView r0 = r2.autoCompleteTextView
            com.google.android.material.textfield.DropdownMenuEndIconDelegate$$ExternalSyntheticLambda2 r1 = new com.google.android.material.textfield.DropdownMenuEndIconDelegate$$ExternalSyntheticLambda2
            r1.<init>(r2)
            r0.setOnDismissListener(r1)
        L18:
            android.widget.AutoCompleteTextView r0 = r2.autoCompleteTextView
            r1 = 0
            r0.setThreshold(r1)
            return
    }

    private void showHideDropdown() {
            r2 = this;
            android.widget.AutoCompleteTextView r0 = r2.autoCompleteTextView
            if (r0 != 0) goto L5
            return
        L5:
            boolean r0 = r2.isDropdownPopupActive()
            r1 = 0
            if (r0 == 0) goto Le
            r2.dropdownPopupDirty = r1
        Le:
            boolean r0 = r2.dropdownPopupDirty
            if (r0 != 0) goto L3c
            boolean r0 = com.google.android.material.textfield.DropdownMenuEndIconDelegate.IS_LOLLIPOP
            if (r0 == 0) goto L1e
            boolean r0 = r2.isEndIconChecked
            r0 = r0 ^ 1
            r2.setEndIconChecked(r0)
            goto L27
        L1e:
            boolean r0 = r2.isEndIconChecked
            r0 = r0 ^ 1
            r2.isEndIconChecked = r0
            r2.refreshIconState()
        L27:
            boolean r0 = r2.isEndIconChecked
            if (r0 == 0) goto L36
            android.widget.AutoCompleteTextView r0 = r2.autoCompleteTextView
            r0.requestFocus()
            android.widget.AutoCompleteTextView r0 = r2.autoCompleteTextView
            r0.showDropDown()
            goto L3e
        L36:
            android.widget.AutoCompleteTextView r0 = r2.autoCompleteTextView
            r0.dismissDropDown()
            goto L3e
        L3c:
            r2.dropdownPopupDirty = r1
        L3e:
            return
    }

    private void updateDropdownPopupDirty() {
            r2 = this;
            r0 = 1
            r2.dropdownPopupDirty = r0
            long r0 = java.lang.System.currentTimeMillis()
            r2.dropdownPopupActivatedAt = r0
            return
    }

    @Override // com.google.android.material.textfield.EndIconDelegate
    public void afterEditTextChanged(android.text.Editable r2) {
            r1 = this;
            android.view.accessibility.AccessibilityManager r2 = r1.accessibilityManager
            boolean r2 = r2.isTouchExplorationEnabled()
            if (r2 == 0) goto L1d
            android.widget.AutoCompleteTextView r2 = r1.autoCompleteTextView
            boolean r2 = com.google.android.material.textfield.EditTextUtils.isEditable(r2)
            if (r2 == 0) goto L1d
            com.google.android.material.internal.CheckableImageButton r2 = r1.endIconView
            boolean r2 = r2.hasFocus()
            if (r2 != 0) goto L1d
            android.widget.AutoCompleteTextView r2 = r1.autoCompleteTextView
            r2.dismissDropDown()
        L1d:
            android.widget.AutoCompleteTextView r2 = r1.autoCompleteTextView
            com.google.android.material.textfield.DropdownMenuEndIconDelegate$$ExternalSyntheticLambda6 r0 = new com.google.android.material.textfield.DropdownMenuEndIconDelegate$$ExternalSyntheticLambda6
            r0.<init>(r1)
            r2.post(r0)
            return
    }

    @Override // com.google.android.material.textfield.EndIconDelegate
    int getIconContentDescriptionResId() {
            r1 = this;
            int r0 = com.google.android.material.R.string.exposed_dropdown_menu_content_description
            return r0
    }

    @Override // com.google.android.material.textfield.EndIconDelegate
    int getIconDrawableResId() {
            r1 = this;
            boolean r0 = com.google.android.material.textfield.DropdownMenuEndIconDelegate.IS_LOLLIPOP
            if (r0 == 0) goto L7
            int r0 = com.google.android.material.R.drawable.mtrl_dropdown_arrow
            goto L9
        L7:
            int r0 = com.google.android.material.R.drawable.mtrl_ic_arrow_drop_down
        L9:
            return r0
    }

    @Override // com.google.android.material.textfield.EndIconDelegate
    android.view.View.OnFocusChangeListener getOnEditTextFocusChangeListener() {
            r1 = this;
            android.view.View$OnFocusChangeListener r0 = r1.onEditTextFocusChangeListener
            return r0
    }

    @Override // com.google.android.material.textfield.EndIconDelegate
    android.view.View.OnClickListener getOnIconClickListener() {
            r1 = this;
            android.view.View$OnClickListener r0 = r1.onIconClickListener
            return r0
    }

    @Override // com.google.android.material.textfield.EndIconDelegate
    public androidx.core.view.accessibility.AccessibilityManagerCompat.TouchExplorationStateChangeListener getTouchExplorationStateChangeListener() {
            r1 = this;
            androidx.core.view.accessibility.AccessibilityManagerCompat$TouchExplorationStateChangeListener r0 = r1.touchExplorationStateChangeListener
            return r0
    }

    @Override // com.google.android.material.textfield.EndIconDelegate
    boolean isBoxBackgroundModeSupported(int r1) {
            r0 = this;
            if (r1 == 0) goto L4
            r1 = 1
            goto L5
        L4:
            r1 = 0
        L5:
            return r1
    }

    @Override // com.google.android.material.textfield.EndIconDelegate
    boolean isIconActivable() {
            r1 = this;
            r0 = 1
            return r0
    }

    @Override // com.google.android.material.textfield.EndIconDelegate
    boolean isIconActivated() {
            r1 = this;
            boolean r0 = r1.editTextHasFocus
            return r0
    }

    @Override // com.google.android.material.textfield.EndIconDelegate
    boolean isIconCheckable() {
            r1 = this;
            r0 = 1
            return r0
    }

    @Override // com.google.android.material.textfield.EndIconDelegate
    boolean isIconChecked() {
            r1 = this;
            boolean r0 = r1.isEndIconChecked
            return r0
    }

    /* JADX INFO: renamed from: lambda$afterEditTextChanged$3$com-google-android-material-textfield-DropdownMenuEndIconDelegate, reason: not valid java name */
    /* synthetic */ void m687xae660ff2() {
            r1 = this;
            android.widget.AutoCompleteTextView r0 = r1.autoCompleteTextView
            boolean r0 = r0.isPopupShowing()
            r1.setEndIconChecked(r0)
            r1.dropdownPopupDirty = r0
            return
    }

    /* JADX INFO: renamed from: lambda$getAlphaAnimator$6$com-google-android-material-textfield-DropdownMenuEndIconDelegate, reason: not valid java name */
    /* synthetic */ void m688x6b943a83(android.animation.ValueAnimator r2) {
            r1 = this;
            java.lang.Object r2 = r2.getAnimatedValue()
            java.lang.Float r2 = (java.lang.Float) r2
            float r2 = r2.floatValue()
            com.google.android.material.internal.CheckableImageButton r0 = r1.endIconView
            r0.setAlpha(r2)
            return
    }

    /* JADX INFO: renamed from: lambda$new$0$com-google-android-material-textfield-DropdownMenuEndIconDelegate, reason: not valid java name */
    /* synthetic */ void m689xd03fedd4(android.view.View r1) {
            r0 = this;
            r0.showHideDropdown()
            return
    }

    /* JADX INFO: renamed from: lambda$new$1$com-google-android-material-textfield-DropdownMenuEndIconDelegate, reason: not valid java name */
    /* synthetic */ void m690xac016995(android.view.View r1, boolean r2) {
            r0 = this;
            r0.editTextHasFocus = r2
            r0.refreshIconState()
            if (r2 != 0) goto Ld
            r1 = 0
            r0.setEndIconChecked(r1)
            r0.dropdownPopupDirty = r1
        Ld:
            return
    }

    /* JADX INFO: renamed from: lambda$new$2$com-google-android-material-textfield-DropdownMenuEndIconDelegate, reason: not valid java name */
    /* synthetic */ void m691x87c2e556(boolean r2) {
            r1 = this;
            android.widget.AutoCompleteTextView r0 = r1.autoCompleteTextView
            if (r0 == 0) goto L14
            boolean r0 = com.google.android.material.textfield.EditTextUtils.isEditable(r0)
            if (r0 != 0) goto L14
            com.google.android.material.internal.CheckableImageButton r0 = r1.endIconView
            if (r2 == 0) goto L10
            r2 = 2
            goto L11
        L10:
            r2 = 1
        L11:
            androidx.core.view.ViewCompat.setImportantForAccessibility(r0, r2)
        L14:
            return
    }

    /* JADX INFO: renamed from: lambda$setUpDropdownShowHideBehavior$4$com-google-android-material-textfield-DropdownMenuEndIconDelegate, reason: not valid java name */
    /* synthetic */ boolean m692x5f2e2537(android.view.View r2, android.view.MotionEvent r3) {
            r1 = this;
            int r2 = r3.getAction()
            r3 = 1
            r0 = 0
            if (r2 != r3) goto L16
            boolean r2 = r1.isDropdownPopupActive()
            if (r2 == 0) goto L10
            r1.dropdownPopupDirty = r0
        L10:
            r1.showHideDropdown()
            r1.updateDropdownPopupDirty()
        L16:
            return r0
    }

    /* JADX INFO: renamed from: lambda$setUpDropdownShowHideBehavior$5$com-google-android-material-textfield-DropdownMenuEndIconDelegate, reason: not valid java name */
    /* synthetic */ void m693x3aefa0f8() {
            r1 = this;
            r1.updateDropdownPopupDirty()
            r0 = 0
            r1.setEndIconChecked(r0)
            return
    }

    @Override // com.google.android.material.textfield.EndIconDelegate
    public void onEditTextAttached(android.widget.EditText r3) {
            r2 = this;
            android.widget.AutoCompleteTextView r0 = castAutoCompleteTextViewOrThrow(r3)
            r2.autoCompleteTextView = r0
            r2.setUpDropdownShowHideBehavior()
            com.google.android.material.textfield.TextInputLayout r0 = r2.textInputLayout
            r1 = 0
            r0.setErrorIconDrawable(r1)
            boolean r3 = com.google.android.material.textfield.EditTextUtils.isEditable(r3)
            if (r3 != 0) goto L23
            android.view.accessibility.AccessibilityManager r3 = r2.accessibilityManager
            boolean r3 = r3.isTouchExplorationEnabled()
            if (r3 == 0) goto L23
            com.google.android.material.internal.CheckableImageButton r3 = r2.endIconView
            r0 = 2
            androidx.core.view.ViewCompat.setImportantForAccessibility(r3, r0)
        L23:
            com.google.android.material.textfield.TextInputLayout r3 = r2.textInputLayout
            r0 = 1
            r3.setEndIconVisible(r0)
            return
    }

    @Override // com.google.android.material.textfield.EndIconDelegate
    public void onInitializeAccessibilityNodeInfo(android.view.View r1, androidx.core.view.accessibility.AccessibilityNodeInfoCompat r2) {
            r0 = this;
            android.widget.AutoCompleteTextView r1 = r0.autoCompleteTextView
            boolean r1 = com.google.android.material.textfield.EditTextUtils.isEditable(r1)
            if (r1 != 0) goto L11
            java.lang.Class<android.widget.Spinner> r1 = android.widget.Spinner.class
            java.lang.String r1 = r1.getName()
            r2.setClassName(r1)
        L11:
            boolean r1 = r2.isShowingHintText()
            if (r1 == 0) goto L1b
            r1 = 0
            r2.setHintText(r1)
        L1b:
            return
    }

    @Override // com.google.android.material.textfield.EndIconDelegate
    public void onPopulateAccessibilityEvent(android.view.View r3, android.view.accessibility.AccessibilityEvent r4) {
            r2 = this;
            android.view.accessibility.AccessibilityManager r3 = r2.accessibilityManager
            boolean r3 = r3.isEnabled()
            if (r3 == 0) goto L40
            android.widget.AutoCompleteTextView r3 = r2.autoCompleteTextView
            boolean r3 = com.google.android.material.textfield.EditTextUtils.isEditable(r3)
            if (r3 == 0) goto L11
            goto L40
        L11:
            int r3 = r4.getEventType()
            r0 = 32768(0x8000, float:4.5918E-41)
            r1 = 1
            if (r3 == r0) goto L23
            int r3 = r4.getEventType()
            r0 = 8
            if (r3 != r0) goto L31
        L23:
            boolean r3 = r2.isEndIconChecked
            if (r3 == 0) goto L31
            android.widget.AutoCompleteTextView r3 = r2.autoCompleteTextView
            boolean r3 = r3.isPopupShowing()
            if (r3 != 0) goto L31
            r3 = r1
            goto L32
        L31:
            r3 = 0
        L32:
            int r4 = r4.getEventType()
            if (r4 == r1) goto L3a
            if (r3 == 0) goto L40
        L3a:
            r2.showHideDropdown()
            r2.updateDropdownPopupDirty()
        L40:
            return
    }

    @Override // com.google.android.material.textfield.EndIconDelegate
    void setUp() {
            r2 = this;
            r2.initAnimators()
            android.content.Context r0 = r2.context
            java.lang.String r1 = "accessibility"
            java.lang.Object r0 = r0.getSystemService(r1)
            android.view.accessibility.AccessibilityManager r0 = (android.view.accessibility.AccessibilityManager) r0
            r2.accessibilityManager = r0
            return
    }

    @Override // com.google.android.material.textfield.EndIconDelegate
    boolean shouldTintIconOnError() {
            r1 = this;
            r0 = 1
            return r0
    }

    @Override // com.google.android.material.textfield.EndIconDelegate
    void tearDown() {
            r2 = this;
            android.widget.AutoCompleteTextView r0 = r2.autoCompleteTextView
            if (r0 == 0) goto L11
            r1 = 0
            r0.setOnTouchListener(r1)
            boolean r0 = com.google.android.material.textfield.DropdownMenuEndIconDelegate.IS_LOLLIPOP
            if (r0 == 0) goto L11
            android.widget.AutoCompleteTextView r0 = r2.autoCompleteTextView
            r0.setOnDismissListener(r1)
        L11:
            return
    }
}
