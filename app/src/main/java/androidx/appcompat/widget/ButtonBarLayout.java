package androidx.appcompat.widget;

/* JADX INFO: loaded from: classes.dex */
public class ButtonBarLayout extends android.widget.LinearLayout {
    private static final int PEEK_BUTTON_DP = 16;
    private boolean mAllowStacking;
    private int mLastWidthSize;
    private boolean mStacked;

    public ButtonBarLayout(android.content.Context r9, android.util.AttributeSet r10) {
            r8 = this;
            r8.<init>(r9, r10)
            r0 = -1
            r8.mLastWidthSize = r0
            int[] r0 = androidx.appcompat.R.styleable.ButtonBarLayout
            android.content.res.TypedArray r0 = r9.obtainStyledAttributes(r10, r0)
            int[] r3 = androidx.appcompat.R.styleable.ButtonBarLayout
            r6 = 0
            r7 = 0
            r1 = r8
            r2 = r9
            r4 = r10
            r5 = r0
            androidx.core.view.ViewCompat.saveAttributeDataForStyleable(r1, r2, r3, r4, r5, r6, r7)
            int r9 = androidx.appcompat.R.styleable.ButtonBarLayout_allowStacking
            r10 = 1
            boolean r9 = r0.getBoolean(r9, r10)
            r8.mAllowStacking = r9
            r0.recycle()
            int r9 = r8.getOrientation()
            if (r9 != r10) goto L2e
            boolean r9 = r8.mAllowStacking
            r8.setStacked(r9)
        L2e:
            return
    }

    private int getNextVisibleChildIndex(int r3) {
            r2 = this;
            int r0 = r2.getChildCount()
        L4:
            if (r3 >= r0) goto L14
            android.view.View r1 = r2.getChildAt(r3)
            int r1 = r1.getVisibility()
            if (r1 != 0) goto L11
            return r3
        L11:
            int r3 = r3 + 1
            goto L4
        L14:
            r3 = -1
            return r3
    }

    private boolean isStacked() {
            r1 = this;
            boolean r0 = r1.mStacked
            return r0
    }

    private void setStacked(boolean r2) {
            r1 = this;
            boolean r0 = r1.mStacked
            if (r0 == r2) goto L3d
            if (r2 == 0) goto La
            boolean r0 = r1.mAllowStacking
            if (r0 == 0) goto L3d
        La:
            r1.mStacked = r2
            r1.setOrientation(r2)
            if (r2 == 0) goto L15
            r0 = 8388613(0x800005, float:1.175495E-38)
            goto L17
        L15:
            r0 = 80
        L17:
            r1.setGravity(r0)
            int r0 = androidx.appcompat.R.id.spacer
            android.view.View r0 = r1.findViewById(r0)
            if (r0 == 0) goto L2b
            if (r2 == 0) goto L27
            r2 = 8
            goto L28
        L27:
            r2 = 4
        L28:
            r0.setVisibility(r2)
        L2b:
            int r2 = r1.getChildCount()
            int r2 = r2 + (-2)
        L31:
            if (r2 < 0) goto L3d
            android.view.View r0 = r1.getChildAt(r2)
            r1.bringChildToFront(r0)
            int r2 = r2 + (-1)
            goto L31
        L3d:
            return
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onMeasure(int r6, int r7) {
            r5 = this;
            int r0 = android.view.View.MeasureSpec.getSize(r6)
            boolean r1 = r5.mAllowStacking
            r2 = 0
            if (r1 == 0) goto L18
            int r1 = r5.mLastWidthSize
            if (r0 <= r1) goto L16
            boolean r1 = r5.isStacked()
            if (r1 == 0) goto L16
            r5.setStacked(r2)
        L16:
            r5.mLastWidthSize = r0
        L18:
            boolean r1 = r5.isStacked()
            r3 = 1
            if (r1 != 0) goto L2f
            int r1 = android.view.View.MeasureSpec.getMode(r6)
            r4 = 1073741824(0x40000000, float:2.0)
            if (r1 != r4) goto L2f
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r1)
            r1 = r3
            goto L31
        L2f:
            r0 = r6
            r1 = r2
        L31:
            super.onMeasure(r0, r7)
            boolean r0 = r5.mAllowStacking
            if (r0 == 0) goto L52
            boolean r0 = r5.isStacked()
            if (r0 != 0) goto L52
            int r0 = r5.getMeasuredWidthAndState()
            r4 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r0 = r0 & r4
            r4 = 16777216(0x1000000, float:2.3509887E-38)
            if (r0 != r4) goto L4b
            r0 = r3
            goto L4c
        L4b:
            r0 = r2
        L4c:
            if (r0 == 0) goto L52
            r5.setStacked(r3)
            r1 = r3
        L52:
            if (r1 == 0) goto L57
            super.onMeasure(r6, r7)
        L57:
            int r0 = r5.getNextVisibleChildIndex(r2)
            if (r0 < 0) goto La3
            android.view.View r1 = r5.getChildAt(r0)
            android.view.ViewGroup$LayoutParams r2 = r1.getLayoutParams()
            android.widget.LinearLayout$LayoutParams r2 = (android.widget.LinearLayout.LayoutParams) r2
            int r4 = r5.getPaddingTop()
            int r1 = r1.getMeasuredHeight()
            int r4 = r4 + r1
            int r1 = r2.topMargin
            int r4 = r4 + r1
            int r1 = r2.bottomMargin
            int r4 = r4 + r1
            boolean r1 = r5.isStacked()
            if (r1 == 0) goto L9d
            int r0 = r0 + r3
            int r0 = r5.getNextVisibleChildIndex(r0)
            if (r0 < 0) goto L9b
            android.view.View r0 = r5.getChildAt(r0)
            int r0 = r0.getPaddingTop()
            android.content.res.Resources r1 = r5.getResources()
            android.util.DisplayMetrics r1 = r1.getDisplayMetrics()
            float r1 = r1.density
            r2 = 1098907648(0x41800000, float:16.0)
            float r1 = r1 * r2
            int r1 = (int) r1
            int r0 = r0 + r1
            int r4 = r4 + r0
        L9b:
            r2 = r4
            goto La3
        L9d:
            int r0 = r5.getPaddingBottom()
            int r2 = r4 + r0
        La3:
            int r0 = androidx.core.view.ViewCompat.getMinimumHeight(r5)
            if (r0 == r2) goto Lb1
            r5.setMinimumHeight(r2)
            if (r7 != 0) goto Lb1
            super.onMeasure(r6, r7)
        Lb1:
            return
    }

    public void setAllowStacking(boolean r2) {
            r1 = this;
            boolean r0 = r1.mAllowStacking
            if (r0 == r2) goto L15
            r1.mAllowStacking = r2
            if (r2 != 0) goto L12
            boolean r2 = r1.isStacked()
            if (r2 == 0) goto L12
            r2 = 0
            r1.setStacked(r2)
        L12:
            r1.requestLayout()
        L15:
            return
    }
}
