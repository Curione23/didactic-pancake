package com.google.android.material.datepicker;

/* JADX INFO: loaded from: classes.dex */
class DaysOfWeekAdapter extends android.widget.BaseAdapter {
    private static final int CALENDAR_DAY_STYLE = 0;
    private static final int NARROW_FORMAT = 4;
    private final java.util.Calendar calendar;
    private final int daysInWeek;
    private final int firstDayOfWeek;

    static {
            r0 = 4
            com.google.android.material.datepicker.DaysOfWeekAdapter.CALENDAR_DAY_STYLE = r0
            return
    }

    public DaysOfWeekAdapter() {
            r2 = this;
            r2.<init>()
            java.util.Calendar r0 = com.google.android.material.datepicker.UtcDates.getUtcCalendar()
            r2.calendar = r0
            r1 = 7
            int r1 = r0.getMaximum(r1)
            r2.daysInWeek = r1
            int r0 = r0.getFirstDayOfWeek()
            r2.firstDayOfWeek = r0
            return
    }

    public DaysOfWeekAdapter(int r3) {
            r2 = this;
            r2.<init>()
            java.util.Calendar r0 = com.google.android.material.datepicker.UtcDates.getUtcCalendar()
            r2.calendar = r0
            r1 = 7
            int r0 = r0.getMaximum(r1)
            r2.daysInWeek = r0
            r2.firstDayOfWeek = r3
            return
    }

    private int positionToDayOfWeek(int r2) {
            r1 = this;
            int r0 = r1.firstDayOfWeek
            int r2 = r2 + r0
            int r0 = r1.daysInWeek
            if (r2 <= r0) goto L8
            int r2 = r2 - r0
        L8:
            return r2
    }

    @Override // android.widget.Adapter
    public int getCount() {
            r1 = this;
            int r0 = r1.daysInWeek
            return r0
    }

    @Override // android.widget.Adapter
    public java.lang.Integer getItem(int r2) {
            r1 = this;
            int r0 = r1.daysInWeek
            if (r2 < r0) goto L6
            r2 = 0
            return r2
        L6:
            int r2 = r1.positionToDayOfWeek(r2)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            return r2
    }

    @Override // android.widget.Adapter
    public /* bridge */ /* synthetic */ java.lang.Object getItem(int r1) {
            r0 = this;
            java.lang.Integer r1 = r0.getItem(r1)
            return r1
    }

    @Override // android.widget.Adapter
    public long getItemId(int r3) {
            r2 = this;
            r0 = 0
            return r0
    }

    @Override // android.widget.Adapter
    public android.view.View getView(int r4, android.view.View r5, android.view.ViewGroup r6) {
            r3 = this;
            r0 = r5
            android.widget.TextView r0 = (android.widget.TextView) r0
            if (r5 != 0) goto L17
            android.content.Context r5 = r6.getContext()
            android.view.LayoutInflater r5 = android.view.LayoutInflater.from(r5)
            int r0 = com.google.android.material.R.layout.mtrl_calendar_day_of_week
            r1 = 0
            android.view.View r5 = r5.inflate(r0, r6, r1)
            r0 = r5
            android.widget.TextView r0 = (android.widget.TextView) r0
        L17:
            java.util.Calendar r5 = r3.calendar
            int r4 = r3.positionToDayOfWeek(r4)
            r1 = 7
            r5.set(r1, r4)
            android.content.res.Resources r4 = r0.getResources()
            android.content.res.Configuration r4 = r4.getConfiguration()
            java.util.Locale r4 = r4.locale
            java.util.Calendar r5 = r3.calendar
            int r2 = com.google.android.material.datepicker.DaysOfWeekAdapter.CALENDAR_DAY_STYLE
            java.lang.String r4 = r5.getDisplayName(r1, r2, r4)
            r0.setText(r4)
            android.content.Context r4 = r6.getContext()
            int r5 = com.google.android.material.R.string.mtrl_picker_day_of_week_column_header
            java.lang.String r4 = r4.getString(r5)
            java.util.Calendar r5 = r3.calendar
            r6 = 2
            java.util.Locale r2 = java.util.Locale.getDefault()
            java.lang.String r5 = r5.getDisplayName(r1, r6, r2)
            java.lang.Object[] r5 = new java.lang.Object[]{r5}
            java.lang.String r4 = java.lang.String.format(r4, r5)
            r0.setContentDescription(r4)
            return r0
    }
}
