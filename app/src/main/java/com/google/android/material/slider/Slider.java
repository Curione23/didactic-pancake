package com.google.android.material.slider;

/* JADX INFO: loaded from: classes.dex */
public class Slider extends com.google.android.material.slider.BaseSlider<com.google.android.material.slider.Slider, com.google.android.material.slider.Slider.OnChangeListener, com.google.android.material.slider.Slider.OnSliderTouchListener> {

    public interface OnChangeListener extends com.google.android.material.slider.BaseOnChangeListener<com.google.android.material.slider.Slider> {
        /* JADX WARN: Can't rename method to resolve collision */
        void onValueChange(com.google.android.material.slider.Slider r1, float r2, boolean r3);

        @Override // com.google.android.material.slider.BaseOnChangeListener
        /* bridge */ /* synthetic */ default void onValueChange(com.google.android.material.slider.Slider r1, float r2, boolean r3) {
                r0 = this;
                com.google.android.material.slider.Slider r1 = (com.google.android.material.slider.Slider) r1
                r0.onValueChange(r1, r2, r3)
                return
        }
    }

    public interface OnSliderTouchListener extends com.google.android.material.slider.BaseOnSliderTouchListener<com.google.android.material.slider.Slider> {
        /* JADX INFO: renamed from: onStartTrackingTouch, reason: avoid collision after fix types in other method */
        void onStartTrackingTouch2(com.google.android.material.slider.Slider r1);

        @Override // com.google.android.material.slider.BaseOnSliderTouchListener
        /* bridge */ /* synthetic */ default void onStartTrackingTouch(com.google.android.material.slider.Slider r1) {
                r0 = this;
                com.google.android.material.slider.Slider r1 = (com.google.android.material.slider.Slider) r1
                r0.onStartTrackingTouch2(r1)
                return
        }

        /* JADX INFO: renamed from: onStopTrackingTouch, reason: avoid collision after fix types in other method */
        void onStopTrackingTouch2(com.google.android.material.slider.Slider r1);

        @Override // com.google.android.material.slider.BaseOnSliderTouchListener
        /* bridge */ /* synthetic */ default void onStopTrackingTouch(com.google.android.material.slider.Slider r1) {
                r0 = this;
                com.google.android.material.slider.Slider r1 = (com.google.android.material.slider.Slider) r1
                r0.onStopTrackingTouch2(r1)
                return
        }
    }

    public Slider(android.content.Context r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0)
            return
    }

    public Slider(android.content.Context r2, android.util.AttributeSet r3) {
            r1 = this;
            int r0 = com.google.android.material.R.attr.sliderStyle
            r1.<init>(r2, r3, r0)
            return
    }

    public Slider(android.content.Context r1, android.util.AttributeSet r2, int r3) {
            r0 = this;
            r0.<init>(r1, r2, r3)
            r3 = 16842788(0x1010024, float:2.369366E-38)
            int[] r3 = new int[]{r3}
            android.content.res.TypedArray r1 = r1.obtainStyledAttributes(r2, r3)
            r2 = 0
            boolean r3 = r1.hasValue(r2)
            if (r3 == 0) goto L1d
            r3 = 0
            float r2 = r1.getFloat(r2, r3)
            r0.setValue(r2)
        L1d:
            r1.recycle()
            return
    }

    @Override // com.google.android.material.slider.BaseSlider
    public /* bridge */ /* synthetic */ void addOnChangeListener(com.google.android.material.slider.BaseOnChangeListener r1) {
            r0 = this;
            super.addOnChangeListener(r1)
            return
    }

    @Override // com.google.android.material.slider.BaseSlider
    public /* bridge */ /* synthetic */ void addOnSliderTouchListener(com.google.android.material.slider.BaseOnSliderTouchListener r1) {
            r0 = this;
            super.addOnSliderTouchListener(r1)
            return
    }

    @Override // com.google.android.material.slider.BaseSlider
    public /* bridge */ /* synthetic */ void clearOnChangeListeners() {
            r0 = this;
            super.clearOnChangeListeners()
            return
    }

    @Override // com.google.android.material.slider.BaseSlider
    public /* bridge */ /* synthetic */ void clearOnSliderTouchListeners() {
            r0 = this;
            super.clearOnSliderTouchListeners()
            return
    }

    @Override // com.google.android.material.slider.BaseSlider, android.view.View
    public /* bridge */ /* synthetic */ boolean dispatchHoverEvent(android.view.MotionEvent r1) {
            r0 = this;
            boolean r1 = super.dispatchHoverEvent(r1)
            return r1
    }

    @Override // com.google.android.material.slider.BaseSlider, android.view.View
    public /* bridge */ /* synthetic */ boolean dispatchKeyEvent(android.view.KeyEvent r1) {
            r0 = this;
            boolean r1 = super.dispatchKeyEvent(r1)
            return r1
    }

    @Override // com.google.android.material.slider.BaseSlider, android.view.View
    public /* bridge */ /* synthetic */ java.lang.CharSequence getAccessibilityClassName() {
            r1 = this;
            java.lang.CharSequence r0 = super.getAccessibilityClassName()
            return r0
    }

    @Override // com.google.android.material.slider.BaseSlider
    public /* bridge */ /* synthetic */ int getActiveThumbIndex() {
            r1 = this;
            int r0 = super.getActiveThumbIndex()
            return r0
    }

    @Override // com.google.android.material.slider.BaseSlider
    public /* bridge */ /* synthetic */ int getFocusedThumbIndex() {
            r1 = this;
            int r0 = super.getFocusedThumbIndex()
            return r0
    }

    @Override // com.google.android.material.slider.BaseSlider
    public /* bridge */ /* synthetic */ int getHaloRadius() {
            r1 = this;
            int r0 = super.getHaloRadius()
            return r0
    }

    @Override // com.google.android.material.slider.BaseSlider
    public /* bridge */ /* synthetic */ android.content.res.ColorStateList getHaloTintList() {
            r1 = this;
            android.content.res.ColorStateList r0 = super.getHaloTintList()
            return r0
    }

    @Override // com.google.android.material.slider.BaseSlider
    public /* bridge */ /* synthetic */ int getLabelBehavior() {
            r1 = this;
            int r0 = super.getLabelBehavior()
            return r0
    }

    @Override // com.google.android.material.slider.BaseSlider
    public /* bridge */ /* synthetic */ float getStepSize() {
            r1 = this;
            float r0 = super.getStepSize()
            return r0
    }

    @Override // com.google.android.material.slider.BaseSlider
    public /* bridge */ /* synthetic */ float getThumbElevation() {
            r1 = this;
            float r0 = super.getThumbElevation()
            return r0
    }

    @Override // com.google.android.material.slider.BaseSlider
    public /* bridge */ /* synthetic */ int getThumbHeight() {
            r1 = this;
            int r0 = super.getThumbHeight()
            return r0
    }

    @Override // com.google.android.material.slider.BaseSlider
    public /* bridge */ /* synthetic */ int getThumbRadius() {
            r1 = this;
            int r0 = super.getThumbRadius()
            return r0
    }

    @Override // com.google.android.material.slider.BaseSlider
    public /* bridge */ /* synthetic */ android.content.res.ColorStateList getThumbStrokeColor() {
            r1 = this;
            android.content.res.ColorStateList r0 = super.getThumbStrokeColor()
            return r0
    }

    @Override // com.google.android.material.slider.BaseSlider
    public /* bridge */ /* synthetic */ float getThumbStrokeWidth() {
            r1 = this;
            float r0 = super.getThumbStrokeWidth()
            return r0
    }

    @Override // com.google.android.material.slider.BaseSlider
    public /* bridge */ /* synthetic */ android.content.res.ColorStateList getThumbTintList() {
            r1 = this;
            android.content.res.ColorStateList r0 = super.getThumbTintList()
            return r0
    }

    @Override // com.google.android.material.slider.BaseSlider
    public /* bridge */ /* synthetic */ int getThumbTrackGapSize() {
            r1 = this;
            int r0 = super.getThumbTrackGapSize()
            return r0
    }

    @Override // com.google.android.material.slider.BaseSlider
    public /* bridge */ /* synthetic */ int getThumbWidth() {
            r1 = this;
            int r0 = super.getThumbWidth()
            return r0
    }

    @Override // com.google.android.material.slider.BaseSlider
    public /* bridge */ /* synthetic */ int getTickActiveRadius() {
            r1 = this;
            int r0 = super.getTickActiveRadius()
            return r0
    }

    @Override // com.google.android.material.slider.BaseSlider
    public /* bridge */ /* synthetic */ android.content.res.ColorStateList getTickActiveTintList() {
            r1 = this;
            android.content.res.ColorStateList r0 = super.getTickActiveTintList()
            return r0
    }

    @Override // com.google.android.material.slider.BaseSlider
    public /* bridge */ /* synthetic */ int getTickInactiveRadius() {
            r1 = this;
            int r0 = super.getTickInactiveRadius()
            return r0
    }

    @Override // com.google.android.material.slider.BaseSlider
    public /* bridge */ /* synthetic */ android.content.res.ColorStateList getTickInactiveTintList() {
            r1 = this;
            android.content.res.ColorStateList r0 = super.getTickInactiveTintList()
            return r0
    }

    @Override // com.google.android.material.slider.BaseSlider
    public /* bridge */ /* synthetic */ android.content.res.ColorStateList getTickTintList() {
            r1 = this;
            android.content.res.ColorStateList r0 = super.getTickTintList()
            return r0
    }

    @Override // com.google.android.material.slider.BaseSlider
    public /* bridge */ /* synthetic */ android.content.res.ColorStateList getTrackActiveTintList() {
            r1 = this;
            android.content.res.ColorStateList r0 = super.getTrackActiveTintList()
            return r0
    }

    @Override // com.google.android.material.slider.BaseSlider
    public /* bridge */ /* synthetic */ int getTrackHeight() {
            r1 = this;
            int r0 = super.getTrackHeight()
            return r0
    }

    @Override // com.google.android.material.slider.BaseSlider
    public /* bridge */ /* synthetic */ android.content.res.ColorStateList getTrackInactiveTintList() {
            r1 = this;
            android.content.res.ColorStateList r0 = super.getTrackInactiveTintList()
            return r0
    }

    @Override // com.google.android.material.slider.BaseSlider
    public /* bridge */ /* synthetic */ int getTrackInsideCornerSize() {
            r1 = this;
            int r0 = super.getTrackInsideCornerSize()
            return r0
    }

    @Override // com.google.android.material.slider.BaseSlider
    public /* bridge */ /* synthetic */ int getTrackSidePadding() {
            r1 = this;
            int r0 = super.getTrackSidePadding()
            return r0
    }

    @Override // com.google.android.material.slider.BaseSlider
    public /* bridge */ /* synthetic */ int getTrackStopIndicatorSize() {
            r1 = this;
            int r0 = super.getTrackStopIndicatorSize()
            return r0
    }

    @Override // com.google.android.material.slider.BaseSlider
    public /* bridge */ /* synthetic */ android.content.res.ColorStateList getTrackTintList() {
            r1 = this;
            android.content.res.ColorStateList r0 = super.getTrackTintList()
            return r0
    }

    @Override // com.google.android.material.slider.BaseSlider
    public /* bridge */ /* synthetic */ int getTrackWidth() {
            r1 = this;
            int r0 = super.getTrackWidth()
            return r0
    }

    public float getValue() {
            r2 = this;
            java.util.List r0 = r2.getValues()
            r1 = 0
            java.lang.Object r0 = r0.get(r1)
            java.lang.Float r0 = (java.lang.Float) r0
            float r0 = r0.floatValue()
            return r0
    }

    @Override // com.google.android.material.slider.BaseSlider
    public /* bridge */ /* synthetic */ float getValueFrom() {
            r1 = this;
            float r0 = super.getValueFrom()
            return r0
    }

    @Override // com.google.android.material.slider.BaseSlider
    public /* bridge */ /* synthetic */ float getValueTo() {
            r1 = this;
            float r0 = super.getValueTo()
            return r0
    }

    @Override // com.google.android.material.slider.BaseSlider
    public /* bridge */ /* synthetic */ boolean hasLabelFormatter() {
            r1 = this;
            boolean r0 = super.hasLabelFormatter()
            return r0
    }

    @Override // com.google.android.material.slider.BaseSlider
    public /* bridge */ /* synthetic */ boolean isTickVisible() {
            r1 = this;
            boolean r0 = super.isTickVisible()
            return r0
    }

    @Override // com.google.android.material.slider.BaseSlider, android.view.View, android.view.KeyEvent.Callback
    public /* bridge */ /* synthetic */ boolean onKeyDown(int r1, android.view.KeyEvent r2) {
            r0 = this;
            boolean r1 = super.onKeyDown(r1, r2)
            return r1
    }

    @Override // com.google.android.material.slider.BaseSlider, android.view.View, android.view.KeyEvent.Callback
    public /* bridge */ /* synthetic */ boolean onKeyUp(int r1, android.view.KeyEvent r2) {
            r0 = this;
            boolean r1 = super.onKeyUp(r1, r2)
            return r1
    }

    @Override // com.google.android.material.slider.BaseSlider, android.view.View
    public /* bridge */ /* synthetic */ boolean onTouchEvent(android.view.MotionEvent r1) {
            r0 = this;
            boolean r1 = super.onTouchEvent(r1)
            return r1
    }

    @Override // com.google.android.material.slider.BaseSlider
    protected boolean pickActiveThumb() {
            r3 = this;
            int r0 = r3.getActiveThumbIndex()
            r1 = -1
            r2 = 1
            if (r0 == r1) goto L9
            return r2
        L9:
            r0 = 0
            r3.setActiveThumbIndex(r0)
            return r2
    }

    @Override // com.google.android.material.slider.BaseSlider
    public /* bridge */ /* synthetic */ void removeOnChangeListener(com.google.android.material.slider.BaseOnChangeListener r1) {
            r0 = this;
            super.removeOnChangeListener(r1)
            return
    }

    @Override // com.google.android.material.slider.BaseSlider
    public /* bridge */ /* synthetic */ void removeOnSliderTouchListener(com.google.android.material.slider.BaseOnSliderTouchListener r1) {
            r0 = this;
            super.removeOnSliderTouchListener(r1)
            return
    }

    @Override // com.google.android.material.slider.BaseSlider
    public void setCustomThumbDrawable(int r1) {
            r0 = this;
            super.setCustomThumbDrawable(r1)
            return
    }

    @Override // com.google.android.material.slider.BaseSlider
    public void setCustomThumbDrawable(android.graphics.drawable.Drawable r1) {
            r0 = this;
            super.setCustomThumbDrawable(r1)
            return
    }

    @Override // com.google.android.material.slider.BaseSlider, android.view.View
    public /* bridge */ /* synthetic */ void setEnabled(boolean r1) {
            r0 = this;
            super.setEnabled(r1)
            return
    }

    @Override // com.google.android.material.slider.BaseSlider
    public /* bridge */ /* synthetic */ void setFocusedThumbIndex(int r1) {
            r0 = this;
            super.setFocusedThumbIndex(r1)
            return
    }

    @Override // com.google.android.material.slider.BaseSlider
    public /* bridge */ /* synthetic */ void setHaloRadius(int r1) {
            r0 = this;
            super.setHaloRadius(r1)
            return
    }

    @Override // com.google.android.material.slider.BaseSlider
    public /* bridge */ /* synthetic */ void setHaloRadiusResource(int r1) {
            r0 = this;
            super.setHaloRadiusResource(r1)
            return
    }

    @Override // com.google.android.material.slider.BaseSlider
    public /* bridge */ /* synthetic */ void setHaloTintList(android.content.res.ColorStateList r1) {
            r0 = this;
            super.setHaloTintList(r1)
            return
    }

    @Override // com.google.android.material.slider.BaseSlider
    public /* bridge */ /* synthetic */ void setLabelBehavior(int r1) {
            r0 = this;
            super.setLabelBehavior(r1)
            return
    }

    @Override // com.google.android.material.slider.BaseSlider
    public /* bridge */ /* synthetic */ void setLabelFormatter(com.google.android.material.slider.LabelFormatter r1) {
            r0 = this;
            super.setLabelFormatter(r1)
            return
    }

    @Override // com.google.android.material.slider.BaseSlider
    public /* bridge */ /* synthetic */ void setStepSize(float r1) {
            r0 = this;
            super.setStepSize(r1)
            return
    }

    @Override // com.google.android.material.slider.BaseSlider
    public /* bridge */ /* synthetic */ void setThumbElevation(float r1) {
            r0 = this;
            super.setThumbElevation(r1)
            return
    }

    @Override // com.google.android.material.slider.BaseSlider
    public /* bridge */ /* synthetic */ void setThumbElevationResource(int r1) {
            r0 = this;
            super.setThumbElevationResource(r1)
            return
    }

    @Override // com.google.android.material.slider.BaseSlider
    public /* bridge */ /* synthetic */ void setThumbHeight(int r1) {
            r0 = this;
            super.setThumbHeight(r1)
            return
    }

    @Override // com.google.android.material.slider.BaseSlider
    public /* bridge */ /* synthetic */ void setThumbHeightResource(int r1) {
            r0 = this;
            super.setThumbHeightResource(r1)
            return
    }

    @Override // com.google.android.material.slider.BaseSlider
    public /* bridge */ /* synthetic */ void setThumbRadius(int r1) {
            r0 = this;
            super.setThumbRadius(r1)
            return
    }

    @Override // com.google.android.material.slider.BaseSlider
    public /* bridge */ /* synthetic */ void setThumbRadiusResource(int r1) {
            r0 = this;
            super.setThumbRadiusResource(r1)
            return
    }

    @Override // com.google.android.material.slider.BaseSlider
    public /* bridge */ /* synthetic */ void setThumbStrokeColor(android.content.res.ColorStateList r1) {
            r0 = this;
            super.setThumbStrokeColor(r1)
            return
    }

    @Override // com.google.android.material.slider.BaseSlider
    public /* bridge */ /* synthetic */ void setThumbStrokeColorResource(int r1) {
            r0 = this;
            super.setThumbStrokeColorResource(r1)
            return
    }

    @Override // com.google.android.material.slider.BaseSlider
    public /* bridge */ /* synthetic */ void setThumbStrokeWidth(float r1) {
            r0 = this;
            super.setThumbStrokeWidth(r1)
            return
    }

    @Override // com.google.android.material.slider.BaseSlider
    public /* bridge */ /* synthetic */ void setThumbStrokeWidthResource(int r1) {
            r0 = this;
            super.setThumbStrokeWidthResource(r1)
            return
    }

    @Override // com.google.android.material.slider.BaseSlider
    public /* bridge */ /* synthetic */ void setThumbTintList(android.content.res.ColorStateList r1) {
            r0 = this;
            super.setThumbTintList(r1)
            return
    }

    @Override // com.google.android.material.slider.BaseSlider
    public /* bridge */ /* synthetic */ void setThumbTrackGapSize(int r1) {
            r0 = this;
            super.setThumbTrackGapSize(r1)
            return
    }

    @Override // com.google.android.material.slider.BaseSlider
    public /* bridge */ /* synthetic */ void setThumbWidth(int r1) {
            r0 = this;
            super.setThumbWidth(r1)
            return
    }

    @Override // com.google.android.material.slider.BaseSlider
    public /* bridge */ /* synthetic */ void setThumbWidthResource(int r1) {
            r0 = this;
            super.setThumbWidthResource(r1)
            return
    }

    @Override // com.google.android.material.slider.BaseSlider
    public /* bridge */ /* synthetic */ void setTickActiveRadius(int r1) {
            r0 = this;
            super.setTickActiveRadius(r1)
            return
    }

    @Override // com.google.android.material.slider.BaseSlider
    public /* bridge */ /* synthetic */ void setTickActiveTintList(android.content.res.ColorStateList r1) {
            r0 = this;
            super.setTickActiveTintList(r1)
            return
    }

    @Override // com.google.android.material.slider.BaseSlider
    public /* bridge */ /* synthetic */ void setTickInactiveRadius(int r1) {
            r0 = this;
            super.setTickInactiveRadius(r1)
            return
    }

    @Override // com.google.android.material.slider.BaseSlider
    public /* bridge */ /* synthetic */ void setTickInactiveTintList(android.content.res.ColorStateList r1) {
            r0 = this;
            super.setTickInactiveTintList(r1)
            return
    }

    @Override // com.google.android.material.slider.BaseSlider
    public /* bridge */ /* synthetic */ void setTickTintList(android.content.res.ColorStateList r1) {
            r0 = this;
            super.setTickTintList(r1)
            return
    }

    @Override // com.google.android.material.slider.BaseSlider
    public /* bridge */ /* synthetic */ void setTickVisible(boolean r1) {
            r0 = this;
            super.setTickVisible(r1)
            return
    }

    @Override // com.google.android.material.slider.BaseSlider
    public /* bridge */ /* synthetic */ void setTrackActiveTintList(android.content.res.ColorStateList r1) {
            r0 = this;
            super.setTrackActiveTintList(r1)
            return
    }

    @Override // com.google.android.material.slider.BaseSlider
    public /* bridge */ /* synthetic */ void setTrackHeight(int r1) {
            r0 = this;
            super.setTrackHeight(r1)
            return
    }

    @Override // com.google.android.material.slider.BaseSlider
    public /* bridge */ /* synthetic */ void setTrackInactiveTintList(android.content.res.ColorStateList r1) {
            r0 = this;
            super.setTrackInactiveTintList(r1)
            return
    }

    @Override // com.google.android.material.slider.BaseSlider
    public /* bridge */ /* synthetic */ void setTrackInsideCornerSize(int r1) {
            r0 = this;
            super.setTrackInsideCornerSize(r1)
            return
    }

    @Override // com.google.android.material.slider.BaseSlider
    public /* bridge */ /* synthetic */ void setTrackStopIndicatorSize(int r1) {
            r0 = this;
            super.setTrackStopIndicatorSize(r1)
            return
    }

    @Override // com.google.android.material.slider.BaseSlider
    public /* bridge */ /* synthetic */ void setTrackTintList(android.content.res.ColorStateList r1) {
            r0 = this;
            super.setTrackTintList(r1)
            return
    }

    public void setValue(float r3) {
            r2 = this;
            r0 = 1
            java.lang.Float[] r0 = new java.lang.Float[r0]
            r1 = 0
            java.lang.Float r3 = java.lang.Float.valueOf(r3)
            r0[r1] = r3
            r2.setValues(r0)
            return
    }

    @Override // com.google.android.material.slider.BaseSlider
    public /* bridge */ /* synthetic */ void setValueFrom(float r1) {
            r0 = this;
            super.setValueFrom(r1)
            return
    }

    @Override // com.google.android.material.slider.BaseSlider
    public /* bridge */ /* synthetic */ void setValueTo(float r1) {
            r0 = this;
            super.setValueTo(r1)
            return
    }
}
