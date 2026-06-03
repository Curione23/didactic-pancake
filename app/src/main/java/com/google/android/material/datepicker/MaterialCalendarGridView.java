package com.google.android.material.datepicker;

/* JADX INFO: loaded from: classes.dex */
final class MaterialCalendarGridView extends android.widget.GridView {
    private final java.util.Calendar dayCompute;
    private final boolean nestedScrollable;


    public MaterialCalendarGridView(android.content.Context r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0)
            return
    }

    public MaterialCalendarGridView(android.content.Context r2, android.util.AttributeSet r3) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r3, r0)
            return
    }

    public MaterialCalendarGridView(android.content.Context r1, android.util.AttributeSet r2, int r3) {
            r0 = this;
            r0.<init>(r1, r2, r3)
            java.util.Calendar r1 = com.google.android.material.datepicker.UtcDates.getUtcCalendar()
            r0.dayCompute = r1
            android.content.Context r1 = r0.getContext()
            boolean r1 = com.google.android.material.datepicker.MaterialDatePicker.isFullscreen(r1)
            if (r1 == 0) goto L1d
            int r1 = com.google.android.material.R.id.cancel_button
            r0.setNextFocusLeftId(r1)
            int r1 = com.google.android.material.R.id.confirm_button
            r0.setNextFocusRightId(r1)
        L1d:
            android.content.Context r1 = r0.getContext()
            boolean r1 = com.google.android.material.datepicker.MaterialDatePicker.isNestedScrollable(r1)
            r0.nestedScrollable = r1
            com.google.android.material.datepicker.MaterialCalendarGridView$1 r1 = new com.google.android.material.datepicker.MaterialCalendarGridView$1
            r1.<init>(r0)
            androidx.core.view.ViewCompat.setAccessibilityDelegate(r0, r1)
            return
    }

    private void gainFocus(int r2, android.graphics.Rect r3) {
            r1 = this;
            r0 = 33
            if (r2 != r0) goto L10
            com.google.android.material.datepicker.MonthAdapter r2 = r1.getAdapter()
            int r2 = r2.lastPositionInMonth()
            r1.setSelection(r2)
            goto L24
        L10:
            r0 = 130(0x82, float:1.82E-43)
            if (r2 != r0) goto L20
            com.google.android.material.datepicker.MonthAdapter r2 = r1.getAdapter()
            int r2 = r2.firstPositionInMonth()
            r1.setSelection(r2)
            goto L24
        L20:
            r0 = 1
            super.onFocusChanged(r0, r2, r3)
        L24:
            return
    }

    private android.view.View getChildAtPosition(int r2) {
            r1 = this;
            int r0 = r1.getFirstVisiblePosition()
            int r2 = r2 - r0
            android.view.View r2 = r1.getChildAt(r2)
            return r2
    }

    private static int horizontalMidPoint(android.view.View r1) {
            int r0 = r1.getLeft()
            int r1 = r1.getWidth()
            int r1 = r1 / 2
            int r0 = r0 + r1
            return r0
    }

    private static boolean skipMonth(java.lang.Long r3, java.lang.Long r4, java.lang.Long r5, java.lang.Long r6) {
            r0 = 1
            if (r3 == 0) goto L24
            if (r4 == 0) goto L24
            if (r5 == 0) goto L24
            if (r6 != 0) goto La
            goto L24
        La:
            long r1 = r5.longValue()
            long r4 = r4.longValue()
            int r4 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r4 > 0) goto L24
            long r4 = r6.longValue()
            long r1 = r3.longValue()
            int r3 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r3 >= 0) goto L23
            goto L24
        L23:
            r0 = 0
        L24:
            return r0
    }

    @Override // android.widget.GridView, android.widget.AdapterView
    public /* bridge */ /* synthetic */ android.widget.Adapter getAdapter() {
            r1 = this;
            com.google.android.material.datepicker.MonthAdapter r0 = r1.getAdapter()
            return r0
    }

    @Override // android.widget.GridView, android.widget.AdapterView
    public /* bridge */ /* synthetic */ android.widget.ListAdapter getAdapter() {
            r1 = this;
            com.google.android.material.datepicker.MonthAdapter r0 = r1.getAdapter()
            return r0
    }

    @Override // android.widget.GridView, android.widget.AdapterView
    public com.google.android.material.datepicker.MonthAdapter getAdapter() {
            r1 = this;
            android.widget.ListAdapter r0 = super.getAdapter()
            com.google.android.material.datepicker.MonthAdapter r0 = (com.google.android.material.datepicker.MonthAdapter) r0
            return r0
    }

    @Override // android.widget.AbsListView, android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
            r1 = this;
            super.onAttachedToWindow()
            com.google.android.material.datepicker.MonthAdapter r0 = r1.getAdapter()
            r0.notifyDataSetChanged()
            return
    }

    @Override // android.view.View
    protected final void onDraw(android.graphics.Canvas r27) {
            r26 = this;
            r0 = r26
            super.onDraw(r27)
            com.google.android.material.datepicker.MonthAdapter r1 = r26.getAdapter()
            com.google.android.material.datepicker.DateSelector<?> r2 = r1.dateSelector
            com.google.android.material.datepicker.CalendarStyle r3 = r1.calendarStyle
            int r4 = r1.firstPositionInMonth()
            int r5 = r26.getFirstVisiblePosition()
            int r4 = java.lang.Math.max(r4, r5)
            int r5 = r1.lastPositionInMonth()
            int r6 = r26.getLastVisiblePosition()
            int r5 = java.lang.Math.min(r5, r6)
            java.lang.Long r6 = r1.getItem(r4)
            java.lang.Long r7 = r1.getItem(r5)
            java.util.Collection r2 = r2.getSelectedRanges()
            java.util.Iterator r2 = r2.iterator()
        L35:
            boolean r8 = r2.hasNext()
            if (r8 == 0) goto L176
            java.lang.Object r8 = r2.next()
            androidx.core.util.Pair r8 = (androidx.core.util.Pair) r8
            F r9 = r8.first
            if (r9 == 0) goto L172
            S r9 = r8.second
            if (r9 != 0) goto L4a
            goto L35
        L4a:
            F r9 = r8.first
            java.lang.Long r9 = (java.lang.Long) r9
            long r9 = r9.longValue()
            S r8 = r8.second
            java.lang.Long r8 = (java.lang.Long) r8
            long r11 = r8.longValue()
            java.lang.Long r8 = java.lang.Long.valueOf(r9)
            java.lang.Long r13 = java.lang.Long.valueOf(r11)
            boolean r8 = skipMonth(r6, r7, r8, r13)
            if (r8 == 0) goto L69
            goto L35
        L69:
            boolean r8 = com.google.android.material.internal.ViewUtils.isLayoutRtl(r26)
            long r13 = r6.longValue()
            int r13 = (r9 > r13 ? 1 : (r9 == r13 ? 0 : -1))
            r14 = 5
            if (r13 >= 0) goto L98
            boolean r9 = r1.isFirstInRow(r4)
            if (r9 == 0) goto L7e
            r9 = 0
            goto L95
        L7e:
            if (r8 != 0) goto L8b
            int r9 = r4 + (-1)
            android.view.View r9 = r0.getChildAtPosition(r9)
            int r9 = r9.getRight()
            goto L95
        L8b:
            int r9 = r4 + (-1)
            android.view.View r9 = r0.getChildAtPosition(r9)
            int r9 = r9.getLeft()
        L95:
            r10 = r9
            r9 = r4
            goto Laf
        L98:
            java.util.Calendar r13 = r0.dayCompute
            r13.setTimeInMillis(r9)
            java.util.Calendar r9 = r0.dayCompute
            int r9 = r9.get(r14)
            int r9 = r1.dayToPosition(r9)
            android.view.View r10 = r0.getChildAtPosition(r9)
            int r10 = horizontalMidPoint(r10)
        Laf:
            long r16 = r7.longValue()
            int r13 = (r11 > r16 ? 1 : (r11 == r16 ? 0 : -1))
            if (r13 <= 0) goto Ld8
            boolean r11 = r1.isLastInRow(r5)
            if (r11 == 0) goto Lc2
            int r11 = r26.getWidth()
            goto Ld5
        Lc2:
            if (r8 != 0) goto Lcd
            android.view.View r11 = r0.getChildAtPosition(r5)
            int r11 = r11.getRight()
            goto Ld5
        Lcd:
            android.view.View r11 = r0.getChildAtPosition(r5)
            int r11 = r11.getLeft()
        Ld5:
            r12 = r11
            r11 = r5
            goto Lef
        Ld8:
            java.util.Calendar r13 = r0.dayCompute
            r13.setTimeInMillis(r11)
            java.util.Calendar r11 = r0.dayCompute
            int r11 = r11.get(r14)
            int r11 = r1.dayToPosition(r11)
            android.view.View r12 = r0.getChildAtPosition(r11)
            int r12 = horizontalMidPoint(r12)
        Lef:
            long r13 = r1.getItemId(r9)
            int r13 = (int) r13
            r14 = r4
            r16 = r5
            long r4 = r1.getItemId(r11)
            int r4 = (int) r4
        Lfc:
            if (r13 > r4) goto L16b
            int r5 = r26.getNumColumns()
            int r5 = r5 * r13
            int r17 = r26.getNumColumns()
            int r17 = r5 + r17
            int r15 = r17 + (-1)
            android.view.View r17 = r0.getChildAtPosition(r5)
            int r18 = r17.getTop()
            com.google.android.material.datepicker.CalendarItemStyle r0 = r3.day
            int r0 = r0.getTopInset()
            int r0 = r18 + r0
            int r17 = r17.getBottom()
            r18 = r1
            com.google.android.material.datepicker.CalendarItemStyle r1 = r3.day
            int r1 = r1.getBottomInset()
            int r1 = r17 - r1
            if (r8 != 0) goto L139
            if (r5 <= r9) goto L12f
            r5 = 0
            goto L130
        L12f:
            r5 = r10
        L130:
            if (r11 <= r15) goto L137
            int r15 = r26.getWidth()
            goto L14b
        L137:
            r15 = r12
            goto L14b
        L139:
            if (r11 <= r15) goto L13d
            r15 = 0
            goto L13e
        L13d:
            r15 = r12
        L13e:
            if (r5 <= r9) goto L145
            int r5 = r26.getWidth()
            goto L146
        L145:
            r5 = r10
        L146:
            r25 = r15
            r15 = r5
            r5 = r25
        L14b:
            float r5 = (float) r5
            float r0 = (float) r0
            float r15 = (float) r15
            float r1 = (float) r1
            r17 = r2
            android.graphics.Paint r2 = r3.rangeFill
            r19 = r27
            r20 = r5
            r21 = r0
            r22 = r15
            r23 = r1
            r24 = r2
            r19.drawRect(r20, r21, r22, r23, r24)
            int r13 = r13 + 1
            r0 = r26
            r2 = r17
            r1 = r18
            goto Lfc
        L16b:
            r0 = r26
            r4 = r14
            r5 = r16
            goto L35
        L172:
            r0 = r26
            goto L35
        L176:
            return
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View
    protected void onFocusChanged(boolean r1, int r2, android.graphics.Rect r3) {
            r0 = this;
            if (r1 == 0) goto L6
            r0.gainFocus(r2, r3)
            goto La
        L6:
            r1 = 0
            super.onFocusChanged(r1, r2, r3)
        La:
            return
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyDown(int r4, android.view.KeyEvent r5) {
            r3 = this;
            boolean r5 = super.onKeyDown(r4, r5)
            r0 = 0
            if (r5 != 0) goto L8
            return r0
        L8:
            int r5 = r3.getSelectedItemPosition()
            r1 = -1
            r2 = 1
            if (r5 == r1) goto L30
            int r5 = r3.getSelectedItemPosition()
            com.google.android.material.datepicker.MonthAdapter r1 = r3.getAdapter()
            int r1 = r1.firstPositionInMonth()
            if (r5 < r1) goto L1f
            goto L30
        L1f:
            r5 = 19
            if (r5 != r4) goto L2f
            com.google.android.material.datepicker.MonthAdapter r4 = r3.getAdapter()
            int r4 = r4.firstPositionInMonth()
            r3.setSelection(r4)
            return r2
        L2f:
            return r0
        L30:
            return r2
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View
    public void onMeasure(int r2, int r3) {
            r1 = this;
            boolean r0 = r1.nestedScrollable
            if (r0 == 0) goto L1b
            r3 = 16777215(0xffffff, float:2.3509886E-38)
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            int r3 = android.view.View.MeasureSpec.makeMeasureSpec(r3, r0)
            super.onMeasure(r2, r3)
            android.view.ViewGroup$LayoutParams r2 = r1.getLayoutParams()
            int r3 = r1.getMeasuredHeight()
            r2.height = r3
            goto L1e
        L1b:
            super.onMeasure(r2, r3)
        L1e:
            return
    }

    @Override // android.widget.AdapterView
    public /* bridge */ /* synthetic */ void setAdapter(android.widget.Adapter r1) {
            r0 = this;
            android.widget.ListAdapter r1 = (android.widget.ListAdapter) r1
            r0.setAdapter(r1)
            return
    }

    @Override // android.widget.GridView, android.widget.AbsListView
    public final void setAdapter(android.widget.ListAdapter r3) {
            r2 = this;
            boolean r0 = r3 instanceof com.google.android.material.datepicker.MonthAdapter
            if (r0 == 0) goto L8
            super.setAdapter(r3)
            return
        L8:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.Class<com.google.android.material.datepicker.MaterialCalendarGridView> r0 = com.google.android.material.datepicker.MaterialCalendarGridView.class
            java.lang.String r0 = r0.getCanonicalName()
            java.lang.Class<com.google.android.material.datepicker.MonthAdapter> r1 = com.google.android.material.datepicker.MonthAdapter.class
            java.lang.String r1 = r1.getCanonicalName()
            java.lang.Object[] r0 = new java.lang.Object[]{r0, r1}
            java.lang.String r1 = "%1$s must have its Adapter set to a %2$s"
            java.lang.String r0 = java.lang.String.format(r1, r0)
            r3.<init>(r0)
            throw r3
    }

    @Override // android.widget.GridView, android.widget.AdapterView
    public void setSelection(int r2) {
            r1 = this;
            com.google.android.material.datepicker.MonthAdapter r0 = r1.getAdapter()
            int r0 = r0.firstPositionInMonth()
            if (r2 >= r0) goto L16
            com.google.android.material.datepicker.MonthAdapter r2 = r1.getAdapter()
            int r2 = r2.firstPositionInMonth()
            super.setSelection(r2)
            goto L19
        L16:
            super.setSelection(r2)
        L19:
            return
    }
}
