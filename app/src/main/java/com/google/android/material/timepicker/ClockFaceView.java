package com.google.android.material.timepicker;

/* JADX INFO: loaded from: classes.dex */
class ClockFaceView extends com.google.android.material.timepicker.RadialViewGroup implements com.google.android.material.timepicker.ClockHandView.OnRotateListener {
    private static final float EPSILON = 0.001f;
    private static final int INITIAL_CAPACITY = 12;
    private static final java.lang.String VALUE_PLACEHOLDER = "";
    private final int clockHandPadding;
    private final com.google.android.material.timepicker.ClockHandView clockHandView;
    private final int clockSize;
    private float currentHandRotation;
    private final int[] gradientColors;
    private final float[] gradientPositions;
    private final int minimumHeight;
    private final int minimumWidth;
    private final android.graphics.RectF scratch;
    private final android.graphics.Rect scratchLineBounds;
    private final android.content.res.ColorStateList textColor;
    private final android.util.SparseArray<android.widget.TextView> textViewPool;
    private final android.graphics.Rect textViewRect;
    private final androidx.core.view.AccessibilityDelegateCompat valueAccessibilityDelegate;
    private java.lang.String[] values;



    public ClockFaceView(android.content.Context r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0)
            return
    }

    public ClockFaceView(android.content.Context r2, android.util.AttributeSet r3) {
            r1 = this;
            int r0 = com.google.android.material.R.attr.materialClockStyle
            r1.<init>(r2, r3, r0)
            return
    }

    public ClockFaceView(android.content.Context r6, android.util.AttributeSet r7, int r8) {
            r5 = this;
            r5.<init>(r6, r7, r8)
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            r5.textViewRect = r0
            android.graphics.RectF r0 = new android.graphics.RectF
            r0.<init>()
            r5.scratch = r0
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            r5.scratchLineBounds = r0
            android.util.SparseArray r0 = new android.util.SparseArray
            r0.<init>()
            r5.textViewPool = r0
            r0 = 3
            float[] r0 = new float[r0]
            r0 = {x00cc: FILL_ARRAY_DATA , data: [0, 1063675494, 1065353216} // fill-array
            r5.gradientPositions = r0
            int[] r0 = com.google.android.material.R.styleable.ClockFaceView
            int r1 = com.google.android.material.R.style.Widget_MaterialComponents_TimePicker_Clock
            android.content.res.TypedArray r7 = r6.obtainStyledAttributes(r7, r0, r8, r1)
            android.content.res.Resources r8 = r5.getResources()
            int r0 = com.google.android.material.R.styleable.ClockFaceView_clockNumberTextColor
            android.content.res.ColorStateList r0 = com.google.android.material.resources.MaterialResources.getColorStateList(r6, r7, r0)
            r5.textColor = r0
            android.view.LayoutInflater r1 = android.view.LayoutInflater.from(r6)
            int r2 = com.google.android.material.R.layout.material_clockface_view
            r3 = 1
            r1.inflate(r2, r5, r3)
            int r1 = com.google.android.material.R.id.material_clock_hand
            android.view.View r1 = r5.findViewById(r1)
            com.google.android.material.timepicker.ClockHandView r1 = (com.google.android.material.timepicker.ClockHandView) r1
            r5.clockHandView = r1
            int r2 = com.google.android.material.R.dimen.material_clock_hand_padding
            int r2 = r8.getDimensionPixelSize(r2)
            r5.clockHandPadding = r2
            r2 = 16842913(0x10100a1, float:2.369401E-38)
            int[] r2 = new int[]{r2}
            int r4 = r0.getDefaultColor()
            int r2 = r0.getColorForState(r2, r4)
            int r0 = r0.getDefaultColor()
            int[] r0 = new int[]{r2, r2, r0}
            r5.gradientColors = r0
            r1.addOnRotateListener(r5)
            int r0 = com.google.android.material.R.color.material_timepicker_clockface
            android.content.res.ColorStateList r0 = androidx.appcompat.content.res.AppCompatResources.getColorStateList(r6, r0)
            int r0 = r0.getDefaultColor()
            int r1 = com.google.android.material.R.styleable.ClockFaceView_clockFaceBackgroundColor
            android.content.res.ColorStateList r6 = com.google.android.material.resources.MaterialResources.getColorStateList(r6, r7, r1)
            if (r6 != 0) goto L86
            goto L8a
        L86:
            int r0 = r6.getDefaultColor()
        L8a:
            r5.setBackgroundColor(r0)
            android.view.ViewTreeObserver r6 = r5.getViewTreeObserver()
            com.google.android.material.timepicker.ClockFaceView$1 r0 = new com.google.android.material.timepicker.ClockFaceView$1
            r0.<init>(r5)
            r6.addOnPreDrawListener(r0)
            r5.setFocusable(r3)
            r7.recycle()
            com.google.android.material.timepicker.ClockFaceView$2 r6 = new com.google.android.material.timepicker.ClockFaceView$2
            r6.<init>(r5)
            r5.valueAccessibilityDelegate = r6
            r6 = 12
            java.lang.String[] r6 = new java.lang.String[r6]
            java.lang.String r7 = ""
            java.util.Arrays.fill(r6, r7)
            r7 = 0
            r5.setValues(r6, r7)
            int r6 = com.google.android.material.R.dimen.material_time_picker_minimum_screen_height
            int r6 = r8.getDimensionPixelSize(r6)
            r5.minimumHeight = r6
            int r6 = com.google.android.material.R.dimen.material_time_picker_minimum_screen_width
            int r6 = r8.getDimensionPixelSize(r6)
            r5.minimumWidth = r6
            int r6 = com.google.android.material.R.dimen.material_clock_size
            int r6 = r8.getDimensionPixelSize(r6)
            r5.clockSize = r6
            return
    }

    static /* synthetic */ com.google.android.material.timepicker.ClockHandView access$000(com.google.android.material.timepicker.ClockFaceView r0) {
            com.google.android.material.timepicker.ClockHandView r0 = r0.clockHandView
            return r0
    }

    static /* synthetic */ int access$100(com.google.android.material.timepicker.ClockFaceView r0) {
            int r0 = r0.clockHandPadding
            return r0
    }

    static /* synthetic */ android.util.SparseArray access$200(com.google.android.material.timepicker.ClockFaceView r0) {
            android.util.SparseArray<android.widget.TextView> r0 = r0.textViewPool
            return r0
    }

    static /* synthetic */ android.graphics.Rect access$300(com.google.android.material.timepicker.ClockFaceView r0) {
            android.graphics.Rect r0 = r0.textViewRect
            return r0
    }

    private void findIntersectingTextView() {
            r7 = this;
            com.google.android.material.timepicker.ClockHandView r0 = r7.clockHandView
            android.graphics.RectF r0 = r0.getCurrentSelectorBox()
            android.widget.TextView r1 = r7.getSelectedTextView(r0)
            r2 = 0
            r3 = r2
        Lc:
            android.util.SparseArray<android.widget.TextView> r4 = r7.textViewPool
            int r4 = r4.size()
            if (r3 >= r4) goto L38
            android.util.SparseArray<android.widget.TextView> r4 = r7.textViewPool
            java.lang.Object r4 = r4.get(r3)
            android.widget.TextView r4 = (android.widget.TextView) r4
            if (r4 != 0) goto L1f
            goto L35
        L1f:
            if (r4 != r1) goto L23
            r5 = 1
            goto L24
        L23:
            r5 = r2
        L24:
            r4.setSelected(r5)
            android.graphics.RadialGradient r5 = r7.getGradientForTextView(r0, r4)
            android.text.TextPaint r6 = r4.getPaint()
            r6.setShader(r5)
            r4.invalidate()
        L35:
            int r3 = r3 + 1
            goto Lc
        L38:
            return
    }

    private android.graphics.RadialGradient getGradientForTextView(android.graphics.RectF r8, android.widget.TextView r9) {
            r7 = this;
            android.graphics.Rect r0 = r7.textViewRect
            r9.getHitRect(r0)
            android.graphics.RectF r0 = r7.scratch
            android.graphics.Rect r1 = r7.textViewRect
            r0.set(r1)
            r0 = 0
            android.graphics.Rect r1 = r7.scratchLineBounds
            r9.getLineBounds(r0, r1)
            android.graphics.RectF r9 = r7.scratch
            android.graphics.Rect r0 = r7.scratchLineBounds
            int r0 = r0.left
            float r0 = (float) r0
            android.graphics.Rect r1 = r7.scratchLineBounds
            int r1 = r1.top
            float r1 = (float) r1
            r9.inset(r0, r1)
            android.graphics.RectF r9 = r7.scratch
            boolean r9 = android.graphics.RectF.intersects(r8, r9)
            if (r9 != 0) goto L2b
            r8 = 0
            return r8
        L2b:
            android.graphics.RadialGradient r9 = new android.graphics.RadialGradient
            float r0 = r8.centerX()
            android.graphics.RectF r1 = r7.scratch
            float r1 = r1.left
            float r1 = r0 - r1
            float r0 = r8.centerY()
            android.graphics.RectF r2 = r7.scratch
            float r2 = r2.top
            float r2 = r0 - r2
            float r8 = r8.width()
            r0 = 1056964608(0x3f000000, float:0.5)
            float r3 = r8 * r0
            int[] r4 = r7.gradientColors
            float[] r5 = r7.gradientPositions
            android.graphics.Shader$TileMode r6 = android.graphics.Shader.TileMode.CLAMP
            r0 = r9
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return r9
    }

    private android.widget.TextView getSelectedTextView(android.graphics.RectF r7) {
            r6 = this;
            r0 = 2139095039(0x7f7fffff, float:3.4028235E38)
            r1 = 0
            r2 = 0
        L5:
            android.util.SparseArray<android.widget.TextView> r3 = r6.textViewPool
            int r3 = r3.size()
            if (r2 >= r3) goto L3f
            android.util.SparseArray<android.widget.TextView> r3 = r6.textViewPool
            java.lang.Object r3 = r3.get(r2)
            android.widget.TextView r3 = (android.widget.TextView) r3
            if (r3 != 0) goto L18
            goto L3c
        L18:
            android.graphics.Rect r4 = r6.textViewRect
            r3.getHitRect(r4)
            android.graphics.RectF r4 = r6.scratch
            android.graphics.Rect r5 = r6.textViewRect
            r4.set(r5)
            android.graphics.RectF r4 = r6.scratch
            r4.union(r7)
            android.graphics.RectF r4 = r6.scratch
            float r4 = r4.width()
            android.graphics.RectF r5 = r6.scratch
            float r5 = r5.height()
            float r4 = r4 * r5
            int r5 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r5 >= 0) goto L3c
            r1 = r3
            r0 = r4
        L3c:
            int r2 = r2 + 1
            goto L5
        L3f:
            return r1
    }

    private static float max3(float r0, float r1, float r2) {
            float r0 = java.lang.Math.max(r0, r1)
            float r0 = java.lang.Math.max(r0, r2)
            return r0
    }

    private void updateTextViews(int r11) {
            r10 = this;
            android.content.Context r0 = r10.getContext()
            android.view.LayoutInflater r0 = android.view.LayoutInflater.from(r0)
            android.util.SparseArray<android.widget.TextView> r1 = r10.textViewPool
            int r1 = r1.size()
            r2 = 0
            r3 = r2
            r4 = r3
        L11:
            java.lang.String[] r5 = r10.values
            int r5 = r5.length
            int r5 = java.lang.Math.max(r5, r1)
            if (r3 >= r5) goto L84
            android.util.SparseArray<android.widget.TextView> r5 = r10.textViewPool
            java.lang.Object r5 = r5.get(r3)
            android.widget.TextView r5 = (android.widget.TextView) r5
            java.lang.String[] r6 = r10.values
            int r6 = r6.length
            if (r3 < r6) goto L30
            r10.removeView(r5)
            android.util.SparseArray<android.widget.TextView> r5 = r10.textViewPool
            r5.remove(r3)
            goto L81
        L30:
            if (r5 != 0) goto L42
            int r5 = com.google.android.material.R.layout.material_clockface_textview
            android.view.View r5 = r0.inflate(r5, r10, r2)
            android.widget.TextView r5 = (android.widget.TextView) r5
            android.util.SparseArray<android.widget.TextView> r6 = r10.textViewPool
            r6.put(r3, r5)
            r10.addView(r5)
        L42:
            java.lang.String[] r6 = r10.values
            r6 = r6[r3]
            r5.setText(r6)
            int r6 = com.google.android.material.R.id.material_value_index
            java.lang.Integer r7 = java.lang.Integer.valueOf(r3)
            r5.setTag(r6, r7)
            int r6 = r3 / 12
            r7 = 1
            int r6 = r6 + r7
            int r8 = com.google.android.material.R.id.material_clock_level
            java.lang.Integer r9 = java.lang.Integer.valueOf(r6)
            r5.setTag(r8, r9)
            if (r6 <= r7) goto L62
            r4 = r7
        L62:
            androidx.core.view.AccessibilityDelegateCompat r6 = r10.valueAccessibilityDelegate
            androidx.core.view.ViewCompat.setAccessibilityDelegate(r5, r6)
            android.content.res.ColorStateList r6 = r10.textColor
            r5.setTextColor(r6)
            if (r11 == 0) goto L81
            android.content.res.Resources r6 = r10.getResources()
            java.lang.String[] r7 = r10.values
            r7 = r7[r3]
            java.lang.Object[] r7 = new java.lang.Object[]{r7}
            java.lang.String r6 = r6.getString(r11, r7)
            r5.setContentDescription(r6)
        L81:
            int r3 = r3 + 1
            goto L11
        L84:
            com.google.android.material.timepicker.ClockHandView r11 = r10.clockHandView
            r11.setMultiLevel(r4)
            return
    }

    int getCurrentLevel() {
            r1 = this;
            com.google.android.material.timepicker.ClockHandView r0 = r1.clockHandView
            int r0 = r0.getCurrentLevel()
            return r0
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(android.view.accessibility.AccessibilityNodeInfo r4) {
            r3 = this;
            super.onInitializeAccessibilityNodeInfo(r4)
            androidx.core.view.accessibility.AccessibilityNodeInfoCompat r4 = androidx.core.view.accessibility.AccessibilityNodeInfoCompat.wrap(r4)
            java.lang.String[] r0 = r3.values
            int r0 = r0.length
            r1 = 0
            r2 = 1
            androidx.core.view.accessibility.AccessibilityNodeInfoCompat$CollectionInfoCompat r0 = androidx.core.view.accessibility.AccessibilityNodeInfoCompat.CollectionInfoCompat.obtain(r2, r0, r1, r2)
            r4.setCollectionInfo(r0)
            return
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean r1, int r2, int r3, int r4, int r5) {
            r0 = this;
            super.onLayout(r1, r2, r3, r4, r5)
            r0.findIntersectingTextView()
            return
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.View
    protected void onMeasure(int r3, int r4) {
            r2 = this;
            android.content.res.Resources r3 = r2.getResources()
            android.util.DisplayMetrics r3 = r3.getDisplayMetrics()
            int r4 = r3.heightPixels
            float r4 = (float) r4
            int r3 = r3.widthPixels
            float r3 = (float) r3
            int r0 = r2.clockSize
            float r0 = (float) r0
            int r1 = r2.minimumHeight
            float r1 = (float) r1
            float r1 = r1 / r4
            int r4 = r2.minimumWidth
            float r4 = (float) r4
            float r4 = r4 / r3
            r3 = 1065353216(0x3f800000, float:1.0)
            float r3 = max3(r1, r4, r3)
            float r0 = r0 / r3
            int r3 = (int) r0
            r4 = 1073741824(0x40000000, float:2.0)
            int r4 = android.view.View.MeasureSpec.makeMeasureSpec(r3, r4)
            r2.setMeasuredDimension(r3, r3)
            super.onMeasure(r4, r4)
            return
    }

    @Override // com.google.android.material.timepicker.ClockHandView.OnRotateListener
    public void onRotate(float r2, boolean r3) {
            r1 = this;
            float r3 = r1.currentHandRotation
            float r3 = r3 - r2
            float r3 = java.lang.Math.abs(r3)
            r0 = 981668463(0x3a83126f, float:0.001)
            int r3 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r3 <= 0) goto L13
            r1.currentHandRotation = r2
            r1.findIntersectingTextView()
        L13:
            return
    }

    void setCurrentLevel(int r2) {
            r1 = this;
            com.google.android.material.timepicker.ClockHandView r0 = r1.clockHandView
            r0.setCurrentLevel(r2)
            return
    }

    public void setHandRotation(float r2) {
            r1 = this;
            com.google.android.material.timepicker.ClockHandView r0 = r1.clockHandView
            r0.setHandRotation(r2)
            r1.findIntersectingTextView()
            return
    }

    @Override // com.google.android.material.timepicker.RadialViewGroup
    public void setRadius(int r2) {
            r1 = this;
            int r0 = r1.getRadius()
            if (r2 == r0) goto L12
            super.setRadius(r2)
            com.google.android.material.timepicker.ClockHandView r2 = r1.clockHandView
            int r0 = r1.getRadius()
            r2.setCircleRadius(r0)
        L12:
            return
    }

    public void setValues(java.lang.String[] r1, int r2) {
            r0 = this;
            r0.values = r1
            r0.updateTextViews(r2)
            return
    }

    @Override // com.google.android.material.timepicker.RadialViewGroup
    protected void updateLayoutParams() {
            r3 = this;
            super.updateLayoutParams()
            r0 = 0
            r1 = r0
        L5:
            android.util.SparseArray<android.widget.TextView> r2 = r3.textViewPool
            int r2 = r2.size()
            if (r1 >= r2) goto L1b
            android.util.SparseArray<android.widget.TextView> r2 = r3.textViewPool
            java.lang.Object r2 = r2.get(r1)
            android.widget.TextView r2 = (android.widget.TextView) r2
            r2.setVisibility(r0)
            int r1 = r1 + 1
            goto L5
        L1b:
            return
    }
}
