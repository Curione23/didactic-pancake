package com.google.android.material.datepicker;

/* JADX INFO: loaded from: classes.dex */
class MonthAdapter extends android.widget.BaseAdapter {
    private static final int MAXIMUM_GRID_CELLS = 0;
    static final int MAXIMUM_WEEKS = 0;
    private static final int NO_DAY_NUMBER = -1;
    final com.google.android.material.datepicker.CalendarConstraints calendarConstraints;
    com.google.android.material.datepicker.CalendarStyle calendarStyle;
    final com.google.android.material.datepicker.DateSelector<?> dateSelector;
    final com.google.android.material.datepicker.DayViewDecorator dayViewDecorator;
    final com.google.android.material.datepicker.Month month;
    private java.util.Collection<java.lang.Long> previouslySelectedDates;

    static {
            java.util.Calendar r0 = com.google.android.material.datepicker.UtcDates.getUtcCalendar()
            r1 = 4
            int r0 = r0.getMaximum(r1)
            com.google.android.material.datepicker.MonthAdapter.MAXIMUM_WEEKS = r0
            java.util.Calendar r0 = com.google.android.material.datepicker.UtcDates.getUtcCalendar()
            r1 = 5
            int r0 = r0.getMaximum(r1)
            java.util.Calendar r1 = com.google.android.material.datepicker.UtcDates.getUtcCalendar()
            r2 = 7
            int r1 = r1.getMaximum(r2)
            int r0 = r0 + r1
            int r0 = r0 + (-1)
            com.google.android.material.datepicker.MonthAdapter.MAXIMUM_GRID_CELLS = r0
            return
    }

    MonthAdapter(com.google.android.material.datepicker.Month r1, com.google.android.material.datepicker.DateSelector<?> r2, com.google.android.material.datepicker.CalendarConstraints r3, com.google.android.material.datepicker.DayViewDecorator r4) {
            r0 = this;
            r0.<init>()
            r0.month = r1
            r0.dateSelector = r2
            r0.calendarConstraints = r3
            r0.dayViewDecorator = r4
            java.util.Collection r1 = r2.getSelectedDays()
            r0.previouslySelectedDates = r1
            return
    }

    private java.lang.String getDayContentDescription(android.content.Context r7, long r8) {
            r6 = this;
            boolean r3 = r6.isToday(r8)
            boolean r4 = r6.isStartOfRange(r8)
            boolean r5 = r6.isEndOfRange(r8)
            r0 = r7
            r1 = r8
            java.lang.String r7 = com.google.android.material.datepicker.DateStrings.getDayContentDescription(r0, r1, r3, r4, r5)
            return r7
    }

    private void initializeStyles(android.content.Context r2) {
            r1 = this;
            com.google.android.material.datepicker.CalendarStyle r0 = r1.calendarStyle
            if (r0 != 0) goto Lb
            com.google.android.material.datepicker.CalendarStyle r0 = new com.google.android.material.datepicker.CalendarStyle
            r0.<init>(r2)
            r1.calendarStyle = r0
        Lb:
            return
    }

    private boolean isSelected(long r6) {
            r5 = this;
            com.google.android.material.datepicker.DateSelector<?> r0 = r5.dateSelector
            java.util.Collection r0 = r0.getSelectedDays()
            java.util.Iterator r0 = r0.iterator()
        La:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L28
            java.lang.Object r1 = r0.next()
            java.lang.Long r1 = (java.lang.Long) r1
            long r1 = r1.longValue()
            long r3 = com.google.android.material.datepicker.UtcDates.canonicalYearMonthDay(r6)
            long r1 = com.google.android.material.datepicker.UtcDates.canonicalYearMonthDay(r1)
            int r1 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r1 != 0) goto La
            r6 = 1
            return r6
        L28:
            r6 = 0
            return r6
    }

    private boolean isToday(long r3) {
            r2 = this;
            java.util.Calendar r0 = com.google.android.material.datepicker.UtcDates.getTodayCalendar()
            long r0 = r0.getTimeInMillis()
            int r3 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r3 != 0) goto Le
            r3 = 1
            goto Lf
        Le:
            r3 = 0
        Lf:
            return r3
    }

    private void updateSelectedState(android.widget.TextView r19, long r20, int r22) {
            r18 = this;
            r0 = r18
            r1 = r19
            r2 = r20
            if (r1 != 0) goto L9
            return
        L9:
            android.content.Context r9 = r19.getContext()
            java.lang.String r10 = r0.getDayContentDescription(r9, r2)
            r1.setContentDescription(r10)
            com.google.android.material.datepicker.CalendarConstraints r4 = r0.calendarConstraints
            com.google.android.material.datepicker.CalendarConstraints$DateValidator r4 = r4.getDateValidator()
            boolean r11 = r4.isValid(r2)
            if (r11 == 0) goto L44
            r4 = 1
            r1.setEnabled(r4)
            boolean r4 = r0.isSelected(r2)
            r1.setSelected(r4)
            if (r4 == 0) goto L34
            com.google.android.material.datepicker.CalendarStyle r2 = r0.calendarStyle
            com.google.android.material.datepicker.CalendarItemStyle r2 = r2.selectedDay
        L31:
            r12 = r2
            r13 = r4
            goto L4e
        L34:
            boolean r2 = r0.isToday(r2)
            if (r2 == 0) goto L3f
            com.google.android.material.datepicker.CalendarStyle r2 = r0.calendarStyle
            com.google.android.material.datepicker.CalendarItemStyle r2 = r2.todayDay
            goto L31
        L3f:
            com.google.android.material.datepicker.CalendarStyle r2 = r0.calendarStyle
            com.google.android.material.datepicker.CalendarItemStyle r2 = r2.day
            goto L31
        L44:
            r2 = 0
            r1.setEnabled(r2)
            com.google.android.material.datepicker.CalendarStyle r3 = r0.calendarStyle
            com.google.android.material.datepicker.CalendarItemStyle r3 = r3.invalidDay
            r13 = r2
            r12 = r3
        L4e:
            com.google.android.material.datepicker.DayViewDecorator r2 = r0.dayViewDecorator
            if (r2 == 0) goto La6
            r2 = -1
            r14 = r22
            if (r14 == r2) goto La6
            com.google.android.material.datepicker.Month r2 = r0.month
            int r15 = r2.year
            com.google.android.material.datepicker.Month r2 = r0.month
            int r8 = r2.month
            com.google.android.material.datepicker.DayViewDecorator r2 = r0.dayViewDecorator
            r3 = r9
            r4 = r15
            r5 = r8
            r6 = r22
            r7 = r11
            r16 = r8
            r8 = r13
            android.content.res.ColorStateList r8 = r2.getBackgroundColor(r3, r4, r5, r6, r7, r8)
            com.google.android.material.datepicker.DayViewDecorator r2 = r0.dayViewDecorator
            r5 = r16
            r14 = r8
            r8 = r13
            android.content.res.ColorStateList r2 = r2.getTextColor(r3, r4, r5, r6, r7, r8)
            r12.styleItem(r1, r14, r2)
            com.google.android.material.datepicker.DayViewDecorator r2 = r0.dayViewDecorator
            android.graphics.drawable.Drawable r12 = r2.getCompoundDrawableLeft(r3, r4, r5, r6, r7, r8)
            com.google.android.material.datepicker.DayViewDecorator r2 = r0.dayViewDecorator
            android.graphics.drawable.Drawable r14 = r2.getCompoundDrawableTop(r3, r4, r5, r6, r7, r8)
            com.google.android.material.datepicker.DayViewDecorator r2 = r0.dayViewDecorator
            android.graphics.drawable.Drawable r8 = r2.getCompoundDrawableRight(r3, r4, r5, r6, r7, r8)
            com.google.android.material.datepicker.DayViewDecorator r2 = r0.dayViewDecorator
            r17 = r10
            r10 = r8
            r8 = r13
            android.graphics.drawable.Drawable r2 = r2.getCompoundDrawableBottom(r3, r4, r5, r6, r7, r8)
            r1.setCompoundDrawables(r12, r14, r10, r2)
            com.google.android.material.datepicker.DayViewDecorator r2 = r0.dayViewDecorator
            r9 = r17
            java.lang.CharSequence r2 = r2.getContentDescription(r3, r4, r5, r6, r7, r8, r9)
            r1.setContentDescription(r2)
            goto La9
        La6:
            r12.styleItem(r1)
        La9:
            return
    }

    private void updateSelectedStateForDate(com.google.android.material.datepicker.MaterialCalendarGridView r4, long r5) {
            r3 = this;
            com.google.android.material.datepicker.Month r0 = com.google.android.material.datepicker.Month.create(r5)
            com.google.android.material.datepicker.Month r1 = r3.month
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L28
            com.google.android.material.datepicker.Month r0 = r3.month
            int r0 = r0.getDayOfMonth(r5)
            com.google.android.material.datepicker.MonthAdapter r1 = r4.getAdapter()
            int r1 = r1.dayToPosition(r0)
            int r2 = r4.getFirstVisiblePosition()
            int r1 = r1 - r2
            android.view.View r4 = r4.getChildAt(r1)
            android.widget.TextView r4 = (android.widget.TextView) r4
            r3.updateSelectedState(r4, r5, r0)
        L28:
            return
    }

    int dayToPosition(int r2) {
            r1 = this;
            int r2 = r2 + (-1)
            int r0 = r1.firstPositionInMonth()
            int r0 = r0 + r2
            return r0
    }

    int firstPositionInMonth() {
            r2 = this;
            com.google.android.material.datepicker.Month r0 = r2.month
            com.google.android.material.datepicker.CalendarConstraints r1 = r2.calendarConstraints
            int r1 = r1.getFirstDayOfWeek()
            int r0 = r0.daysFromStartOfWeekToFirstOfMonth(r1)
            return r0
    }

    @Override // android.widget.Adapter
    public int getCount() {
            r1 = this;
            int r0 = com.google.android.material.datepicker.MonthAdapter.MAXIMUM_GRID_CELLS
            return r0
    }

    @Override // android.widget.Adapter
    public java.lang.Long getItem(int r3) {
            r2 = this;
            int r0 = r2.firstPositionInMonth()
            if (r3 < r0) goto L1c
            int r0 = r2.lastPositionInMonth()
            if (r3 <= r0) goto Ld
            goto L1c
        Ld:
            com.google.android.material.datepicker.Month r0 = r2.month
            int r3 = r2.positionToDay(r3)
            long r0 = r0.getDay(r3)
            java.lang.Long r3 = java.lang.Long.valueOf(r0)
            return r3
        L1c:
            r3 = 0
            return r3
    }

    @Override // android.widget.Adapter
    public /* bridge */ /* synthetic */ java.lang.Object getItem(int r1) {
            r0 = this;
            java.lang.Long r1 = r0.getItem(r1)
            return r1
    }

    @Override // android.widget.Adapter
    public long getItemId(int r3) {
            r2 = this;
            com.google.android.material.datepicker.Month r0 = r2.month
            int r0 = r0.daysInWeek
            int r3 = r3 / r0
            long r0 = (long) r3
            return r0
    }

    @Override // android.widget.Adapter
    public /* bridge */ /* synthetic */ android.view.View getView(int r1, android.view.View r2, android.view.ViewGroup r3) {
            r0 = this;
            android.widget.TextView r1 = r0.getView(r1, r2, r3)
            return r1
    }

    @Override // android.widget.Adapter
    public android.widget.TextView getView(int r6, android.view.View r7, android.view.ViewGroup r8) {
            r5 = this;
            android.content.Context r0 = r8.getContext()
            r5.initializeStyles(r0)
            r0 = r7
            android.widget.TextView r0 = (android.widget.TextView) r0
            r1 = 0
            if (r7 != 0) goto L1e
            android.content.Context r7 = r8.getContext()
            android.view.LayoutInflater r7 = android.view.LayoutInflater.from(r7)
            int r0 = com.google.android.material.R.layout.mtrl_calendar_day
            android.view.View r7 = r7.inflate(r0, r8, r1)
            r0 = r7
            android.widget.TextView r0 = (android.widget.TextView) r0
        L1e:
            int r7 = r5.firstPositionInMonth()
            int r7 = r6 - r7
            if (r7 < 0) goto L56
            com.google.android.material.datepicker.Month r8 = r5.month
            int r8 = r8.daysInMonth
            if (r7 < r8) goto L2d
            goto L56
        L2d:
            r8 = 1
            int r7 = r7 + r8
            com.google.android.material.datepicker.Month r2 = r5.month
            r0.setTag(r2)
            android.content.res.Resources r2 = r0.getResources()
            android.content.res.Configuration r2 = r2.getConfiguration()
            java.util.Locale r2 = r2.locale
            java.lang.Integer r3 = java.lang.Integer.valueOf(r7)
            java.lang.Object[] r3 = new java.lang.Object[]{r3}
            java.lang.String r4 = "%d"
            java.lang.String r2 = java.lang.String.format(r2, r4, r3)
            r0.setText(r2)
            r0.setVisibility(r1)
            r0.setEnabled(r8)
            goto L5f
        L56:
            r7 = 8
            r0.setVisibility(r7)
            r0.setEnabled(r1)
            r7 = -1
        L5f:
            java.lang.Long r6 = r5.getItem(r6)
            if (r6 != 0) goto L66
            return r0
        L66:
            long r1 = r6.longValue()
            r5.updateSelectedState(r0, r1, r7)
            return r0
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public boolean hasStableIds() {
            r1 = this;
            r0 = 1
            return r0
    }

    boolean isEndOfRange(long r4) {
            r3 = this;
            com.google.android.material.datepicker.DateSelector<?> r0 = r3.dateSelector
            java.util.Collection r0 = r0.getSelectedRanges()
            java.util.Iterator r0 = r0.iterator()
        La:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L28
            java.lang.Object r1 = r0.next()
            androidx.core.util.Pair r1 = (androidx.core.util.Pair) r1
            S r2 = r1.second
            if (r2 == 0) goto La
            S r1 = r1.second
            java.lang.Long r1 = (java.lang.Long) r1
            long r1 = r1.longValue()
            int r1 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r1 != 0) goto La
            r4 = 1
            return r4
        L28:
            r4 = 0
            return r4
    }

    boolean isFirstInRow(int r2) {
            r1 = this;
            com.google.android.material.datepicker.Month r0 = r1.month
            int r0 = r0.daysInWeek
            int r2 = r2 % r0
            if (r2 != 0) goto L9
            r2 = 1
            goto La
        L9:
            r2 = 0
        La:
            return r2
    }

    boolean isLastInRow(int r3) {
            r2 = this;
            r0 = 1
            int r3 = r3 + r0
            com.google.android.material.datepicker.Month r1 = r2.month
            int r1 = r1.daysInWeek
            int r3 = r3 % r1
            if (r3 != 0) goto La
            goto Lb
        La:
            r0 = 0
        Lb:
            return r0
    }

    boolean isStartOfRange(long r4) {
            r3 = this;
            com.google.android.material.datepicker.DateSelector<?> r0 = r3.dateSelector
            java.util.Collection r0 = r0.getSelectedRanges()
            java.util.Iterator r0 = r0.iterator()
        La:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L28
            java.lang.Object r1 = r0.next()
            androidx.core.util.Pair r1 = (androidx.core.util.Pair) r1
            F r2 = r1.first
            if (r2 == 0) goto La
            F r1 = r1.first
            java.lang.Long r1 = (java.lang.Long) r1
            long r1 = r1.longValue()
            int r1 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r1 != 0) goto La
            r4 = 1
            return r4
        L28:
            r4 = 0
            return r4
    }

    int lastPositionInMonth() {
            r2 = this;
            int r0 = r2.firstPositionInMonth()
            com.google.android.material.datepicker.Month r1 = r2.month
            int r1 = r1.daysInMonth
            int r0 = r0 + r1
            int r0 = r0 + (-1)
            return r0
    }

    int positionToDay(int r2) {
            r1 = this;
            int r0 = r1.firstPositionInMonth()
            int r2 = r2 - r0
            int r2 = r2 + 1
            return r2
    }

    public void updateSelectedStates(com.google.android.material.datepicker.MaterialCalendarGridView r4) {
            r3 = this;
            java.util.Collection<java.lang.Long> r0 = r3.previouslySelectedDates
            java.util.Iterator r0 = r0.iterator()
        L6:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L1a
            java.lang.Object r1 = r0.next()
            java.lang.Long r1 = (java.lang.Long) r1
            long r1 = r1.longValue()
            r3.updateSelectedStateForDate(r4, r1)
            goto L6
        L1a:
            com.google.android.material.datepicker.DateSelector<?> r0 = r3.dateSelector
            if (r0 == 0) goto L42
            java.util.Collection r0 = r0.getSelectedDays()
            java.util.Iterator r0 = r0.iterator()
        L26:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L3a
            java.lang.Object r1 = r0.next()
            java.lang.Long r1 = (java.lang.Long) r1
            long r1 = r1.longValue()
            r3.updateSelectedStateForDate(r4, r1)
            goto L26
        L3a:
            com.google.android.material.datepicker.DateSelector<?> r4 = r3.dateSelector
            java.util.Collection r4 = r4.getSelectedDays()
            r3.previouslySelectedDates = r4
        L42:
            return
    }

    boolean withinMonth(int r2) {
            r1 = this;
            int r0 = r1.firstPositionInMonth()
            if (r2 < r0) goto Le
            int r0 = r1.lastPositionInMonth()
            if (r2 > r0) goto Le
            r2 = 1
            goto Lf
        Le:
            r2 = 0
        Lf:
            return r2
    }
}
