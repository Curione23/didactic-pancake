package com.google.android.material.divider;

/* JADX INFO: loaded from: classes.dex */
public class MaterialDividerItemDecoration extends androidx.recyclerview.widget.RecyclerView.ItemDecoration {
    private static final int DEF_STYLE_RES = 0;
    public static final int HORIZONTAL = 0;
    public static final int VERTICAL = 1;
    private int color;
    private android.graphics.drawable.Drawable dividerDrawable;
    private int insetEnd;
    private int insetStart;
    private boolean lastItemDecorated;
    private int orientation;
    private final android.graphics.Rect tempRect;
    private int thickness;

    static {
            int r0 = com.google.android.material.R.style.Widget_MaterialComponents_MaterialDivider
            com.google.android.material.divider.MaterialDividerItemDecoration.DEF_STYLE_RES = r0
            return
    }

    public MaterialDividerItemDecoration(android.content.Context r2, int r3) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0, r3)
            return
    }

    public MaterialDividerItemDecoration(android.content.Context r2, android.util.AttributeSet r3, int r4) {
            r1 = this;
            int r0 = com.google.android.material.R.attr.materialDividerStyle
            r1.<init>(r2, r3, r0, r4)
            return
    }

    public MaterialDividerItemDecoration(android.content.Context r8, android.util.AttributeSet r9, int r10, int r11) {
            r7 = this;
            r7.<init>()
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            r7.tempRect = r0
            int[] r3 = com.google.android.material.R.styleable.MaterialDivider
            int r5 = com.google.android.material.divider.MaterialDividerItemDecoration.DEF_STYLE_RES
            r0 = 0
            int[] r6 = new int[r0]
            r1 = r8
            r2 = r9
            r4 = r10
            android.content.res.TypedArray r9 = com.google.android.material.internal.ThemeEnforcement.obtainStyledAttributes(r1, r2, r3, r4, r5, r6)
            int r10 = com.google.android.material.R.styleable.MaterialDivider_dividerColor
            android.content.res.ColorStateList r10 = com.google.android.material.resources.MaterialResources.getColorStateList(r8, r9, r10)
            int r10 = r10.getDefaultColor()
            r7.color = r10
            int r10 = com.google.android.material.R.styleable.MaterialDivider_dividerThickness
            android.content.res.Resources r8 = r8.getResources()
            int r1 = com.google.android.material.R.dimen.material_divider_thickness
            int r8 = r8.getDimensionPixelSize(r1)
            int r8 = r9.getDimensionPixelSize(r10, r8)
            r7.thickness = r8
            int r8 = com.google.android.material.R.styleable.MaterialDivider_dividerInsetStart
            int r8 = r9.getDimensionPixelOffset(r8, r0)
            r7.insetStart = r8
            int r8 = com.google.android.material.R.styleable.MaterialDivider_dividerInsetEnd
            int r8 = r9.getDimensionPixelOffset(r8, r0)
            r7.insetEnd = r8
            int r8 = com.google.android.material.R.styleable.MaterialDivider_lastItemDecorated
            r10 = 1
            boolean r8 = r9.getBoolean(r8, r10)
            r7.lastItemDecorated = r8
            r9.recycle()
            android.graphics.drawable.ShapeDrawable r8 = new android.graphics.drawable.ShapeDrawable
            r8.<init>()
            r7.dividerDrawable = r8
            int r8 = r7.color
            r7.setDividerColor(r8)
            r7.setOrientation(r11)
            return
    }

    private void drawForHorizontalOrientation(android.graphics.Canvas r10, androidx.recyclerview.widget.RecyclerView r11) {
            r9 = this;
            r10.save()
            boolean r0 = r11.getClipToPadding()
            r1 = 0
            if (r0 == 0) goto L28
            int r0 = r11.getPaddingTop()
            int r2 = r11.getHeight()
            int r3 = r11.getPaddingBottom()
            int r2 = r2 - r3
            int r3 = r11.getPaddingLeft()
            int r4 = r11.getWidth()
            int r5 = r11.getPaddingRight()
            int r4 = r4 - r5
            r10.clipRect(r3, r0, r4, r2)
            goto L2d
        L28:
            int r2 = r11.getHeight()
            r0 = r1
        L2d:
            int r3 = r9.insetStart
            int r0 = r0 + r3
            int r3 = r9.insetEnd
            int r2 = r2 - r3
            boolean r3 = com.google.android.material.internal.ViewUtils.isLayoutRtl(r11)
            int r4 = r11.getChildCount()
        L3b:
            if (r1 >= r4) goto L89
            android.view.View r5 = r11.getChildAt(r1)
            boolean r6 = r9.shouldDrawDivider(r11, r5)
            if (r6 == 0) goto L86
            androidx.recyclerview.widget.RecyclerView$LayoutManager r6 = r11.getLayoutManager()
            android.graphics.Rect r7 = r9.tempRect
            r6.getDecoratedBoundsWithMargins(r5, r7)
            float r6 = r5.getTranslationX()
            int r6 = java.lang.Math.round(r6)
            if (r3 == 0) goto L63
            android.graphics.Rect r7 = r9.tempRect
            int r7 = r7.left
            int r7 = r7 + r6
            int r6 = r9.thickness
            int r6 = r6 + r7
            goto L6c
        L63:
            android.graphics.Rect r7 = r9.tempRect
            int r7 = r7.right
            int r6 = r6 + r7
            int r7 = r9.thickness
            int r7 = r6 - r7
        L6c:
            android.graphics.drawable.Drawable r8 = r9.dividerDrawable
            r8.setBounds(r7, r0, r6, r2)
            float r5 = r5.getAlpha()
            r6 = 1132396544(0x437f0000, float:255.0)
            float r5 = r5 * r6
            int r5 = java.lang.Math.round(r5)
            android.graphics.drawable.Drawable r6 = r9.dividerDrawable
            r6.setAlpha(r5)
            android.graphics.drawable.Drawable r5 = r9.dividerDrawable
            r5.draw(r10)
        L86:
            int r1 = r1 + 1
            goto L3b
        L89:
            r10.restore()
            return
    }

    private void drawForVerticalOrientation(android.graphics.Canvas r9, androidx.recyclerview.widget.RecyclerView r10) {
            r8 = this;
            r9.save()
            boolean r0 = r10.getClipToPadding()
            r1 = 0
            if (r0 == 0) goto L28
            int r0 = r10.getPaddingLeft()
            int r2 = r10.getWidth()
            int r3 = r10.getPaddingRight()
            int r2 = r2 - r3
            int r3 = r10.getPaddingTop()
            int r4 = r10.getHeight()
            int r5 = r10.getPaddingBottom()
            int r4 = r4 - r5
            r9.clipRect(r0, r3, r2, r4)
            goto L2d
        L28:
            int r2 = r10.getWidth()
            r0 = r1
        L2d:
            boolean r3 = com.google.android.material.internal.ViewUtils.isLayoutRtl(r10)
            if (r3 == 0) goto L36
            int r4 = r8.insetEnd
            goto L38
        L36:
            int r4 = r8.insetStart
        L38:
            int r0 = r0 + r4
            if (r3 == 0) goto L3e
            int r3 = r8.insetStart
            goto L40
        L3e:
            int r3 = r8.insetEnd
        L40:
            int r2 = r2 - r3
            int r3 = r10.getChildCount()
        L45:
            if (r1 >= r3) goto L88
            android.view.View r4 = r10.getChildAt(r1)
            boolean r5 = r8.shouldDrawDivider(r10, r4)
            if (r5 == 0) goto L85
            androidx.recyclerview.widget.RecyclerView$LayoutManager r5 = r10.getLayoutManager()
            android.graphics.Rect r6 = r8.tempRect
            r5.getDecoratedBoundsWithMargins(r4, r6)
            android.graphics.Rect r5 = r8.tempRect
            int r5 = r5.bottom
            float r6 = r4.getTranslationY()
            int r6 = java.lang.Math.round(r6)
            int r5 = r5 + r6
            int r6 = r8.thickness
            int r6 = r5 - r6
            android.graphics.drawable.Drawable r7 = r8.dividerDrawable
            r7.setBounds(r0, r6, r2, r5)
            float r4 = r4.getAlpha()
            r5 = 1132396544(0x437f0000, float:255.0)
            float r4 = r4 * r5
            int r4 = java.lang.Math.round(r4)
            android.graphics.drawable.Drawable r5 = r8.dividerDrawable
            r5.setAlpha(r4)
            android.graphics.drawable.Drawable r4 = r8.dividerDrawable
            r4.draw(r9)
        L85:
            int r1 = r1 + 1
            goto L45
        L88:
            r9.restore()
            return
    }

    private boolean shouldDrawDivider(androidx.recyclerview.widget.RecyclerView r5, android.view.View r6) {
            r4 = this;
            int r6 = r5.getChildAdapterPosition(r6)
            androidx.recyclerview.widget.RecyclerView$Adapter r5 = r5.getAdapter()
            r0 = 0
            r1 = 1
            if (r5 == 0) goto L15
            int r2 = r5.getItemCount()
            int r2 = r2 - r1
            if (r6 != r2) goto L15
            r2 = r1
            goto L16
        L15:
            r2 = r0
        L16:
            r3 = -1
            if (r6 == r3) goto L26
            if (r2 == 0) goto L1f
            boolean r2 = r4.lastItemDecorated
            if (r2 == 0) goto L26
        L1f:
            boolean r5 = r4.shouldDrawDivider(r6, r5)
            if (r5 == 0) goto L26
            r0 = r1
        L26:
            return r0
    }

    public int getDividerColor() {
            r1 = this;
            int r0 = r1.color
            return r0
    }

    public int getDividerInsetEnd() {
            r1 = this;
            int r0 = r1.insetEnd
            return r0
    }

    public int getDividerInsetStart() {
            r1 = this;
            int r0 = r1.insetStart
            return r0
    }

    public int getDividerThickness() {
            r1 = this;
            int r0 = r1.thickness
            return r0
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public void getItemOffsets(android.graphics.Rect r1, android.view.View r2, androidx.recyclerview.widget.RecyclerView r3, androidx.recyclerview.widget.RecyclerView.State r4) {
            r0 = this;
            r4 = 0
            r1.set(r4, r4, r4, r4)
            boolean r2 = r0.shouldDrawDivider(r3, r2)
            if (r2 == 0) goto L23
            int r2 = r0.orientation
            r4 = 1
            if (r2 != r4) goto L14
            int r2 = r0.thickness
            r1.bottom = r2
            goto L23
        L14:
            boolean r2 = com.google.android.material.internal.ViewUtils.isLayoutRtl(r3)
            if (r2 == 0) goto L1f
            int r2 = r0.thickness
            r1.left = r2
            goto L23
        L1f:
            int r2 = r0.thickness
            r1.right = r2
        L23:
            return
    }

    public int getOrientation() {
            r1 = this;
            int r0 = r1.orientation
            return r0
    }

    public boolean isLastItemDecorated() {
            r1 = this;
            boolean r0 = r1.lastItemDecorated
            return r0
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public void onDraw(android.graphics.Canvas r2, androidx.recyclerview.widget.RecyclerView r3, androidx.recyclerview.widget.RecyclerView.State r4) {
            r1 = this;
            androidx.recyclerview.widget.RecyclerView$LayoutManager r4 = r3.getLayoutManager()
            if (r4 != 0) goto L7
            return
        L7:
            int r4 = r1.orientation
            r0 = 1
            if (r4 != r0) goto L10
            r1.drawForVerticalOrientation(r2, r3)
            goto L13
        L10:
            r1.drawForHorizontalOrientation(r2, r3)
        L13:
            return
    }

    public void setDividerColor(int r2) {
            r1 = this;
            r1.color = r2
            android.graphics.drawable.Drawable r0 = r1.dividerDrawable
            android.graphics.drawable.Drawable r0 = androidx.core.graphics.drawable.DrawableCompat.wrap(r0)
            r1.dividerDrawable = r0
            androidx.core.graphics.drawable.DrawableCompat.setTint(r0, r2)
            return
    }

    public void setDividerColorResource(android.content.Context r1, int r2) {
            r0 = this;
            int r1 = androidx.core.content.ContextCompat.getColor(r1, r2)
            r0.setDividerColor(r1)
            return
    }

    public void setDividerInsetEnd(int r1) {
            r0 = this;
            r0.insetEnd = r1
            return
    }

    public void setDividerInsetEndResource(android.content.Context r1, int r2) {
            r0 = this;
            android.content.res.Resources r1 = r1.getResources()
            int r1 = r1.getDimensionPixelOffset(r2)
            r0.setDividerInsetEnd(r1)
            return
    }

    public void setDividerInsetStart(int r1) {
            r0 = this;
            r0.insetStart = r1
            return
    }

    public void setDividerInsetStartResource(android.content.Context r1, int r2) {
            r0 = this;
            android.content.res.Resources r1 = r1.getResources()
            int r1 = r1.getDimensionPixelOffset(r2)
            r0.setDividerInsetStart(r1)
            return
    }

    public void setDividerThickness(int r1) {
            r0 = this;
            r0.thickness = r1
            return
    }

    public void setDividerThicknessResource(android.content.Context r1, int r2) {
            r0 = this;
            android.content.res.Resources r1 = r1.getResources()
            int r1 = r1.getDimensionPixelSize(r2)
            r0.setDividerThickness(r1)
            return
    }

    public void setLastItemDecorated(boolean r1) {
            r0 = this;
            r0.lastItemDecorated = r1
            return
    }

    public void setOrientation(int r4) {
            r3 = this;
            if (r4 == 0) goto L21
            r0 = 1
            if (r4 != r0) goto L6
            goto L21
        L6:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Invalid orientation: "
            r1.<init>(r2)
            java.lang.StringBuilder r4 = r1.append(r4)
            java.lang.String r1 = ". It should be either HORIZONTAL or VERTICAL"
            java.lang.StringBuilder r4 = r4.append(r1)
            java.lang.String r4 = r4.toString()
            r0.<init>(r4)
            throw r0
        L21:
            r3.orientation = r4
            return
    }

    protected boolean shouldDrawDivider(int r1, androidx.recyclerview.widget.RecyclerView.Adapter<?> r2) {
            r0 = this;
            r1 = 1
            return r1
    }
}
