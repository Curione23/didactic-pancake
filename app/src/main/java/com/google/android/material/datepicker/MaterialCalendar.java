package com.google.android.material.datepicker;

/* JADX INFO: loaded from: classes.dex */
public final class MaterialCalendar<S> extends com.google.android.material.datepicker.PickerFragment<S> {
    private static final java.lang.String CALENDAR_CONSTRAINTS_KEY = "CALENDAR_CONSTRAINTS_KEY";
    private static final java.lang.String CURRENT_MONTH_KEY = "CURRENT_MONTH_KEY";
    private static final java.lang.String DAY_VIEW_DECORATOR_KEY = "DAY_VIEW_DECORATOR_KEY";
    private static final java.lang.String GRID_SELECTOR_KEY = "GRID_SELECTOR_KEY";
    static final java.lang.Object MONTHS_VIEW_GROUP_TAG = null;
    static final java.lang.Object NAVIGATION_NEXT_TAG = null;
    static final java.lang.Object NAVIGATION_PREV_TAG = null;
    static final java.lang.Object SELECTOR_TOGGLE_TAG = null;
    private static final int SMOOTH_SCROLL_MAX = 3;
    private static final java.lang.String THEME_RES_ID_KEY = "THEME_RES_ID_KEY";
    private com.google.android.material.datepicker.CalendarConstraints calendarConstraints;
    private com.google.android.material.datepicker.MaterialCalendar.CalendarSelector calendarSelector;
    private com.google.android.material.datepicker.CalendarStyle calendarStyle;
    private com.google.android.material.datepicker.Month current;
    private com.google.android.material.datepicker.DateSelector<S> dateSelector;
    private android.view.View dayFrame;
    private com.google.android.material.datepicker.DayViewDecorator dayViewDecorator;
    private android.view.View monthNext;
    private android.view.View monthPrev;
    private androidx.recyclerview.widget.RecyclerView recyclerView;
    private int themeResId;
    private android.view.View yearFrame;
    private androidx.recyclerview.widget.RecyclerView yearSelector;












    enum CalendarSelector extends java.lang.Enum<com.google.android.material.datepicker.MaterialCalendar.CalendarSelector> {
        private static final /* synthetic */ com.google.android.material.datepicker.MaterialCalendar.CalendarSelector[] $VALUES = null;
        public static final com.google.android.material.datepicker.MaterialCalendar.CalendarSelector DAY = null;
        public static final com.google.android.material.datepicker.MaterialCalendar.CalendarSelector YEAR = null;

        static {
                com.google.android.material.datepicker.MaterialCalendar$CalendarSelector r0 = new com.google.android.material.datepicker.MaterialCalendar$CalendarSelector
                java.lang.String r1 = "DAY"
                r2 = 0
                r0.<init>(r1, r2)
                com.google.android.material.datepicker.MaterialCalendar.CalendarSelector.DAY = r0
                com.google.android.material.datepicker.MaterialCalendar$CalendarSelector r1 = new com.google.android.material.datepicker.MaterialCalendar$CalendarSelector
                java.lang.String r2 = "YEAR"
                r3 = 1
                r1.<init>(r2, r3)
                com.google.android.material.datepicker.MaterialCalendar.CalendarSelector.YEAR = r1
                com.google.android.material.datepicker.MaterialCalendar$CalendarSelector[] r0 = new com.google.android.material.datepicker.MaterialCalendar.CalendarSelector[]{r0, r1}
                com.google.android.material.datepicker.MaterialCalendar.CalendarSelector.$VALUES = r0
                return
        }

        CalendarSelector(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public static com.google.android.material.datepicker.MaterialCalendar.CalendarSelector valueOf(java.lang.String r1) {
                java.lang.Class<com.google.android.material.datepicker.MaterialCalendar$CalendarSelector> r0 = com.google.android.material.datepicker.MaterialCalendar.CalendarSelector.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                com.google.android.material.datepicker.MaterialCalendar$CalendarSelector r1 = (com.google.android.material.datepicker.MaterialCalendar.CalendarSelector) r1
                return r1
        }

        public static com.google.android.material.datepicker.MaterialCalendar.CalendarSelector[] values() {
                com.google.android.material.datepicker.MaterialCalendar$CalendarSelector[] r0 = com.google.android.material.datepicker.MaterialCalendar.CalendarSelector.$VALUES
                java.lang.Object r0 = r0.clone()
                com.google.android.material.datepicker.MaterialCalendar$CalendarSelector[] r0 = (com.google.android.material.datepicker.MaterialCalendar.CalendarSelector[]) r0
                return r0
        }
    }

    interface OnDayClickListener {
        void onDayClick(long r1);
    }

    static {
            java.lang.String r0 = "MONTHS_VIEW_GROUP_TAG"
            com.google.android.material.datepicker.MaterialCalendar.MONTHS_VIEW_GROUP_TAG = r0
            java.lang.String r0 = "NAVIGATION_PREV_TAG"
            com.google.android.material.datepicker.MaterialCalendar.NAVIGATION_PREV_TAG = r0
            java.lang.String r0 = "NAVIGATION_NEXT_TAG"
            com.google.android.material.datepicker.MaterialCalendar.NAVIGATION_NEXT_TAG = r0
            java.lang.String r0 = "SELECTOR_TOGGLE_TAG"
            com.google.android.material.datepicker.MaterialCalendar.SELECTOR_TOGGLE_TAG = r0
            return
    }

    public MaterialCalendar() {
            r0 = this;
            r0.<init>()
            return
    }

    static /* synthetic */ androidx.recyclerview.widget.RecyclerView access$000(com.google.android.material.datepicker.MaterialCalendar r0) {
            androidx.recyclerview.widget.RecyclerView r0 = r0.recyclerView
            return r0
    }

    static /* synthetic */ com.google.android.material.datepicker.CalendarConstraints access$100(com.google.android.material.datepicker.MaterialCalendar r0) {
            com.google.android.material.datepicker.CalendarConstraints r0 = r0.calendarConstraints
            return r0
    }

    static /* synthetic */ com.google.android.material.datepicker.DateSelector access$200(com.google.android.material.datepicker.MaterialCalendar r0) {
            com.google.android.material.datepicker.DateSelector<S> r0 = r0.dateSelector
            return r0
    }

    static /* synthetic */ androidx.recyclerview.widget.RecyclerView access$300(com.google.android.material.datepicker.MaterialCalendar r0) {
            androidx.recyclerview.widget.RecyclerView r0 = r0.yearSelector
            return r0
    }

    static /* synthetic */ com.google.android.material.datepicker.CalendarStyle access$400(com.google.android.material.datepicker.MaterialCalendar r0) {
            com.google.android.material.datepicker.CalendarStyle r0 = r0.calendarStyle
            return r0
    }

    static /* synthetic */ android.view.View access$500(com.google.android.material.datepicker.MaterialCalendar r0) {
            android.view.View r0 = r0.dayFrame
            return r0
    }

    static /* synthetic */ com.google.android.material.datepicker.Month access$602(com.google.android.material.datepicker.MaterialCalendar r0, com.google.android.material.datepicker.Month r1) {
            r0.current = r1
            return r1
    }

    private void addActionsToMonthNavigation(android.view.View r4, com.google.android.material.datepicker.MonthsPagerAdapter r5) {
            r3 = this;
            int r0 = com.google.android.material.R.id.month_navigation_fragment_toggle
            android.view.View r0 = r4.findViewById(r0)
            com.google.android.material.button.MaterialButton r0 = (com.google.android.material.button.MaterialButton) r0
            java.lang.Object r1 = com.google.android.material.datepicker.MaterialCalendar.SELECTOR_TOGGLE_TAG
            r0.setTag(r1)
            com.google.android.material.datepicker.MaterialCalendar$6 r1 = new com.google.android.material.datepicker.MaterialCalendar$6
            r1.<init>(r3)
            androidx.core.view.ViewCompat.setAccessibilityDelegate(r0, r1)
            int r1 = com.google.android.material.R.id.month_navigation_previous
            android.view.View r1 = r4.findViewById(r1)
            r3.monthPrev = r1
            java.lang.Object r2 = com.google.android.material.datepicker.MaterialCalendar.NAVIGATION_PREV_TAG
            r1.setTag(r2)
            int r1 = com.google.android.material.R.id.month_navigation_next
            android.view.View r1 = r4.findViewById(r1)
            r3.monthNext = r1
            java.lang.Object r2 = com.google.android.material.datepicker.MaterialCalendar.NAVIGATION_NEXT_TAG
            r1.setTag(r2)
            int r1 = com.google.android.material.R.id.mtrl_calendar_year_selector_frame
            android.view.View r1 = r4.findViewById(r1)
            r3.yearFrame = r1
            int r1 = com.google.android.material.R.id.mtrl_calendar_day_selector_frame
            android.view.View r4 = r4.findViewById(r1)
            r3.dayFrame = r4
            com.google.android.material.datepicker.MaterialCalendar$CalendarSelector r4 = com.google.android.material.datepicker.MaterialCalendar.CalendarSelector.DAY
            r3.setSelector(r4)
            com.google.android.material.datepicker.Month r4 = r3.current
            java.lang.String r4 = r4.getLongName()
            r0.setText(r4)
            androidx.recyclerview.widget.RecyclerView r4 = r3.recyclerView
            com.google.android.material.datepicker.MaterialCalendar$7 r1 = new com.google.android.material.datepicker.MaterialCalendar$7
            r1.<init>(r3, r5, r0)
            r4.addOnScrollListener(r1)
            com.google.android.material.datepicker.MaterialCalendar$8 r4 = new com.google.android.material.datepicker.MaterialCalendar$8
            r4.<init>(r3)
            r0.setOnClickListener(r4)
            android.view.View r4 = r3.monthNext
            com.google.android.material.datepicker.MaterialCalendar$9 r0 = new com.google.android.material.datepicker.MaterialCalendar$9
            r0.<init>(r3, r5)
            r4.setOnClickListener(r0)
            android.view.View r4 = r3.monthPrev
            com.google.android.material.datepicker.MaterialCalendar$10 r0 = new com.google.android.material.datepicker.MaterialCalendar$10
            r0.<init>(r3, r5)
            r4.setOnClickListener(r0)
            return
    }

    private androidx.recyclerview.widget.RecyclerView.ItemDecoration createItemDecoration() {
            r1 = this;
            com.google.android.material.datepicker.MaterialCalendar$5 r0 = new com.google.android.material.datepicker.MaterialCalendar$5
            r0.<init>(r1)
            return r0
    }

    static int getDayHeight(android.content.Context r1) {
            android.content.res.Resources r1 = r1.getResources()
            int r0 = com.google.android.material.R.dimen.mtrl_calendar_day_height
            int r1 = r1.getDimensionPixelSize(r0)
            return r1
    }

    private static int getDialogPickerHeight(android.content.Context r5) {
            android.content.res.Resources r5 = r5.getResources()
            int r0 = com.google.android.material.R.dimen.mtrl_calendar_navigation_height
            int r0 = r5.getDimensionPixelSize(r0)
            int r1 = com.google.android.material.R.dimen.mtrl_calendar_navigation_top_padding
            int r1 = r5.getDimensionPixelOffset(r1)
            int r0 = r0 + r1
            int r1 = com.google.android.material.R.dimen.mtrl_calendar_navigation_bottom_padding
            int r1 = r5.getDimensionPixelOffset(r1)
            int r0 = r0 + r1
            int r1 = com.google.android.material.R.dimen.mtrl_calendar_days_of_week_height
            int r1 = r5.getDimensionPixelSize(r1)
            int r2 = com.google.android.material.datepicker.MonthAdapter.MAXIMUM_WEEKS
            int r3 = com.google.android.material.R.dimen.mtrl_calendar_day_height
            int r3 = r5.getDimensionPixelSize(r3)
            int r2 = r2 * r3
            int r3 = com.google.android.material.datepicker.MonthAdapter.MAXIMUM_WEEKS
            int r3 = r3 + (-1)
            int r4 = com.google.android.material.R.dimen.mtrl_calendar_month_vertical_padding
            int r4 = r5.getDimensionPixelOffset(r4)
            int r3 = r3 * r4
            int r2 = r2 + r3
            int r3 = com.google.android.material.R.dimen.mtrl_calendar_bottom_padding
            int r5 = r5.getDimensionPixelOffset(r3)
            int r0 = r0 + r1
            int r0 = r0 + r2
            int r0 = r0 + r5
            return r0
    }

    public static <T> com.google.android.material.datepicker.MaterialCalendar<T> newInstance(com.google.android.material.datepicker.DateSelector<T> r1, int r2, com.google.android.material.datepicker.CalendarConstraints r3) {
            r0 = 0
            com.google.android.material.datepicker.MaterialCalendar r1 = newInstance(r1, r2, r3, r0)
            return r1
    }

    public static <T> com.google.android.material.datepicker.MaterialCalendar<T> newInstance(com.google.android.material.datepicker.DateSelector<T> r3, int r4, com.google.android.material.datepicker.CalendarConstraints r5, com.google.android.material.datepicker.DayViewDecorator r6) {
            com.google.android.material.datepicker.MaterialCalendar r0 = new com.google.android.material.datepicker.MaterialCalendar
            r0.<init>()
            android.os.Bundle r1 = new android.os.Bundle
            r1.<init>()
            java.lang.String r2 = "THEME_RES_ID_KEY"
            r1.putInt(r2, r4)
            java.lang.String r4 = "GRID_SELECTOR_KEY"
            r1.putParcelable(r4, r3)
            java.lang.String r3 = "CALENDAR_CONSTRAINTS_KEY"
            r1.putParcelable(r3, r5)
            java.lang.String r3 = "DAY_VIEW_DECORATOR_KEY"
            r1.putParcelable(r3, r6)
            java.lang.String r3 = "CURRENT_MONTH_KEY"
            com.google.android.material.datepicker.Month r4 = r5.getOpenAt()
            r1.putParcelable(r3, r4)
            r0.setArguments(r1)
            return r0
    }

    private void postSmoothRecyclerViewScroll(int r3) {
            r2 = this;
            androidx.recyclerview.widget.RecyclerView r0 = r2.recyclerView
            com.google.android.material.datepicker.MaterialCalendar$11 r1 = new com.google.android.material.datepicker.MaterialCalendar$11
            r1.<init>(r2, r3)
            r0.post(r1)
            return
    }

    private void setUpForAccessibility() {
            r2 = this;
            androidx.recyclerview.widget.RecyclerView r0 = r2.recyclerView
            com.google.android.material.datepicker.MaterialCalendar$4 r1 = new com.google.android.material.datepicker.MaterialCalendar$4
            r1.<init>(r2)
            androidx.core.view.ViewCompat.setAccessibilityDelegate(r0, r1)
            return
    }

    @Override // com.google.android.material.datepicker.PickerFragment
    public boolean addOnSelectionChangedListener(com.google.android.material.datepicker.OnSelectionChangedListener<S> r1) {
            r0 = this;
            boolean r1 = super.addOnSelectionChangedListener(r1)
            return r1
    }

    com.google.android.material.datepicker.CalendarConstraints getCalendarConstraints() {
            r1 = this;
            com.google.android.material.datepicker.CalendarConstraints r0 = r1.calendarConstraints
            return r0
    }

    com.google.android.material.datepicker.CalendarStyle getCalendarStyle() {
            r1 = this;
            com.google.android.material.datepicker.CalendarStyle r0 = r1.calendarStyle
            return r0
    }

    com.google.android.material.datepicker.Month getCurrentMonth() {
            r1 = this;
            com.google.android.material.datepicker.Month r0 = r1.current
            return r0
    }

    @Override // com.google.android.material.datepicker.PickerFragment
    public com.google.android.material.datepicker.DateSelector<S> getDateSelector() {
            r1 = this;
            com.google.android.material.datepicker.DateSelector<S> r0 = r1.dateSelector
            return r0
    }

    androidx.recyclerview.widget.LinearLayoutManager getLayoutManager() {
            r1 = this;
            androidx.recyclerview.widget.RecyclerView r0 = r1.recyclerView
            androidx.recyclerview.widget.RecyclerView$LayoutManager r0 = r0.getLayoutManager()
            androidx.recyclerview.widget.LinearLayoutManager r0 = (androidx.recyclerview.widget.LinearLayoutManager) r0
            return r0
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(android.os.Bundle r2) {
            r1 = this;
            super.onCreate(r2)
            if (r2 != 0) goto L9
            android.os.Bundle r2 = r1.getArguments()
        L9:
            java.lang.String r0 = "THEME_RES_ID_KEY"
            int r0 = r2.getInt(r0)
            r1.themeResId = r0
            java.lang.String r0 = "GRID_SELECTOR_KEY"
            android.os.Parcelable r0 = r2.getParcelable(r0)
            com.google.android.material.datepicker.DateSelector r0 = (com.google.android.material.datepicker.DateSelector) r0
            r1.dateSelector = r0
            java.lang.String r0 = "CALENDAR_CONSTRAINTS_KEY"
            android.os.Parcelable r0 = r2.getParcelable(r0)
            com.google.android.material.datepicker.CalendarConstraints r0 = (com.google.android.material.datepicker.CalendarConstraints) r0
            r1.calendarConstraints = r0
            java.lang.String r0 = "DAY_VIEW_DECORATOR_KEY"
            android.os.Parcelable r0 = r2.getParcelable(r0)
            com.google.android.material.datepicker.DayViewDecorator r0 = (com.google.android.material.datepicker.DayViewDecorator) r0
            r1.dayViewDecorator = r0
            java.lang.String r0 = "CURRENT_MONTH_KEY"
            android.os.Parcelable r2 = r2.getParcelable(r0)
            com.google.android.material.datepicker.Month r2 = (com.google.android.material.datepicker.Month) r2
            r1.current = r2
            return
    }

    @Override // androidx.fragment.app.Fragment
    public android.view.View onCreateView(android.view.LayoutInflater r12, android.view.ViewGroup r13, android.os.Bundle r14) {
            r11 = this;
            android.view.ContextThemeWrapper r6 = new android.view.ContextThemeWrapper
            android.content.Context r0 = r11.getContext()
            int r1 = r11.themeResId
            r6.<init>(r0, r1)
            com.google.android.material.datepicker.CalendarStyle r0 = new com.google.android.material.datepicker.CalendarStyle
            r0.<init>(r6)
            r11.calendarStyle = r0
            android.view.LayoutInflater r0 = r12.cloneInContext(r6)
            com.google.android.material.datepicker.CalendarConstraints r1 = r11.calendarConstraints
            com.google.android.material.datepicker.Month r1 = r1.getStart()
            boolean r2 = com.google.android.material.datepicker.MaterialDatePicker.isFullscreen(r6)
            r7 = 1
            r8 = 0
            if (r2 == 0) goto L28
            int r2 = com.google.android.material.R.layout.mtrl_calendar_vertical
            r5 = r7
            goto L2b
        L28:
            int r2 = com.google.android.material.R.layout.mtrl_calendar_horizontal
            r5 = r8
        L2b:
            android.view.View r9 = r0.inflate(r2, r13, r8)
            android.content.Context r0 = r11.requireContext()
            int r0 = getDialogPickerHeight(r0)
            r9.setMinimumHeight(r0)
            int r0 = com.google.android.material.R.id.mtrl_calendar_days_of_week
            android.view.View r0 = r9.findViewById(r0)
            android.widget.GridView r0 = (android.widget.GridView) r0
            com.google.android.material.datepicker.MaterialCalendar$1 r2 = new com.google.android.material.datepicker.MaterialCalendar$1
            r2.<init>(r11)
            androidx.core.view.ViewCompat.setAccessibilityDelegate(r0, r2)
            com.google.android.material.datepicker.CalendarConstraints r2 = r11.calendarConstraints
            int r2 = r2.getFirstDayOfWeek()
            com.google.android.material.datepicker.DaysOfWeekAdapter r3 = new com.google.android.material.datepicker.DaysOfWeekAdapter
            if (r2 <= 0) goto L58
            r3.<init>(r2)
            goto L5b
        L58:
            r3.<init>()
        L5b:
            r0.setAdapter(r3)
            int r1 = r1.daysInWeek
            r0.setNumColumns(r1)
            r0.setEnabled(r8)
            int r0 = com.google.android.material.R.id.mtrl_calendar_months
            android.view.View r0 = r9.findViewById(r0)
            androidx.recyclerview.widget.RecyclerView r0 = (androidx.recyclerview.widget.RecyclerView) r0
            r11.recyclerView = r0
            com.google.android.material.datepicker.MaterialCalendar$2 r10 = new com.google.android.material.datepicker.MaterialCalendar$2
            android.content.Context r2 = r11.getContext()
            r4 = 0
            r0 = r10
            r1 = r11
            r3 = r5
            r0.<init>(r1, r2, r3, r4, r5)
            androidx.recyclerview.widget.RecyclerView r0 = r11.recyclerView
            r0.setLayoutManager(r10)
            androidx.recyclerview.widget.RecyclerView r0 = r11.recyclerView
            java.lang.Object r1 = com.google.android.material.datepicker.MaterialCalendar.MONTHS_VIEW_GROUP_TAG
            r0.setTag(r1)
            com.google.android.material.datepicker.MonthsPagerAdapter r10 = new com.google.android.material.datepicker.MonthsPagerAdapter
            com.google.android.material.datepicker.DateSelector<S> r2 = r11.dateSelector
            com.google.android.material.datepicker.CalendarConstraints r3 = r11.calendarConstraints
            com.google.android.material.datepicker.DayViewDecorator r4 = r11.dayViewDecorator
            com.google.android.material.datepicker.MaterialCalendar$3 r5 = new com.google.android.material.datepicker.MaterialCalendar$3
            r5.<init>(r11)
            r0 = r10
            r1 = r6
            r0.<init>(r1, r2, r3, r4, r5)
            androidx.recyclerview.widget.RecyclerView r0 = r11.recyclerView
            r0.setAdapter(r10)
            android.content.res.Resources r0 = r6.getResources()
            int r1 = com.google.android.material.R.integer.mtrl_calendar_year_selector_span
            int r0 = r0.getInteger(r1)
            int r1 = com.google.android.material.R.id.mtrl_calendar_year_selector_frame
            android.view.View r1 = r9.findViewById(r1)
            androidx.recyclerview.widget.RecyclerView r1 = (androidx.recyclerview.widget.RecyclerView) r1
            r11.yearSelector = r1
            if (r1 == 0) goto Ld6
            r1.setHasFixedSize(r7)
            androidx.recyclerview.widget.RecyclerView r1 = r11.yearSelector
            androidx.recyclerview.widget.GridLayoutManager r2 = new androidx.recyclerview.widget.GridLayoutManager
            r2.<init>(r6, r0, r7, r8)
            r1.setLayoutManager(r2)
            androidx.recyclerview.widget.RecyclerView r0 = r11.yearSelector
            com.google.android.material.datepicker.YearGridAdapter r1 = new com.google.android.material.datepicker.YearGridAdapter
            r1.<init>(r11)
            r0.setAdapter(r1)
            androidx.recyclerview.widget.RecyclerView r0 = r11.yearSelector
            androidx.recyclerview.widget.RecyclerView$ItemDecoration r1 = r11.createItemDecoration()
            r0.addItemDecoration(r1)
        Ld6:
            int r0 = com.google.android.material.R.id.month_navigation_fragment_toggle
            android.view.View r0 = r9.findViewById(r0)
            if (r0 == 0) goto Le1
            r11.addActionsToMonthNavigation(r9, r10)
        Le1:
            boolean r0 = com.google.android.material.datepicker.MaterialDatePicker.isFullscreen(r6)
            if (r0 != 0) goto Lf1
            androidx.recyclerview.widget.PagerSnapHelper r0 = new androidx.recyclerview.widget.PagerSnapHelper
            r0.<init>()
            androidx.recyclerview.widget.RecyclerView r1 = r11.recyclerView
            r0.attachToRecyclerView(r1)
        Lf1:
            androidx.recyclerview.widget.RecyclerView r0 = r11.recyclerView
            com.google.android.material.datepicker.Month r1 = r11.current
            int r1 = r10.getPosition(r1)
            r0.scrollToPosition(r1)
            r11.setUpForAccessibility()
            return r9
    }

    @Override // androidx.fragment.app.Fragment
    public void onSaveInstanceState(android.os.Bundle r3) {
            r2 = this;
            super.onSaveInstanceState(r3)
            java.lang.String r0 = "THEME_RES_ID_KEY"
            int r1 = r2.themeResId
            r3.putInt(r0, r1)
            java.lang.String r0 = "GRID_SELECTOR_KEY"
            com.google.android.material.datepicker.DateSelector<S> r1 = r2.dateSelector
            r3.putParcelable(r0, r1)
            java.lang.String r0 = "CALENDAR_CONSTRAINTS_KEY"
            com.google.android.material.datepicker.CalendarConstraints r1 = r2.calendarConstraints
            r3.putParcelable(r0, r1)
            java.lang.String r0 = "DAY_VIEW_DECORATOR_KEY"
            com.google.android.material.datepicker.DayViewDecorator r1 = r2.dayViewDecorator
            r3.putParcelable(r0, r1)
            java.lang.String r0 = "CURRENT_MONTH_KEY"
            com.google.android.material.datepicker.Month r1 = r2.current
            r3.putParcelable(r0, r1)
            return
    }

    void setCurrentMonth(com.google.android.material.datepicker.Month r7) {
            r6 = this;
            androidx.recyclerview.widget.RecyclerView r0 = r6.recyclerView
            androidx.recyclerview.widget.RecyclerView$Adapter r0 = r0.getAdapter()
            com.google.android.material.datepicker.MonthsPagerAdapter r0 = (com.google.android.material.datepicker.MonthsPagerAdapter) r0
            int r1 = r0.getPosition(r7)
            com.google.android.material.datepicker.Month r2 = r6.current
            int r0 = r0.getPosition(r2)
            int r0 = r1 - r0
            int r2 = java.lang.Math.abs(r0)
            r3 = 3
            r4 = 1
            r5 = 0
            if (r2 <= r3) goto L1f
            r2 = r4
            goto L20
        L1f:
            r2 = r5
        L20:
            if (r0 <= 0) goto L23
            goto L24
        L23:
            r4 = r5
        L24:
            r6.current = r7
            if (r2 == 0) goto L35
            if (r4 == 0) goto L35
            androidx.recyclerview.widget.RecyclerView r7 = r6.recyclerView
            int r0 = r1 + (-3)
            r7.scrollToPosition(r0)
            r6.postSmoothRecyclerViewScroll(r1)
            goto L45
        L35:
            if (r2 == 0) goto L42
            androidx.recyclerview.widget.RecyclerView r7 = r6.recyclerView
            int r0 = r1 + 3
            r7.scrollToPosition(r0)
            r6.postSmoothRecyclerViewScroll(r1)
            goto L45
        L42:
            r6.postSmoothRecyclerViewScroll(r1)
        L45:
            return
    }

    void setSelector(com.google.android.material.datepicker.MaterialCalendar.CalendarSelector r5) {
            r4 = this;
            r4.calendarSelector = r5
            com.google.android.material.datepicker.MaterialCalendar$CalendarSelector r0 = com.google.android.material.datepicker.MaterialCalendar.CalendarSelector.YEAR
            r1 = 8
            r2 = 0
            if (r5 != r0) goto L37
            androidx.recyclerview.widget.RecyclerView r5 = r4.yearSelector
            androidx.recyclerview.widget.RecyclerView$LayoutManager r5 = r5.getLayoutManager()
            androidx.recyclerview.widget.RecyclerView r0 = r4.yearSelector
            androidx.recyclerview.widget.RecyclerView$Adapter r0 = r0.getAdapter()
            com.google.android.material.datepicker.YearGridAdapter r0 = (com.google.android.material.datepicker.YearGridAdapter) r0
            com.google.android.material.datepicker.Month r3 = r4.current
            int r3 = r3.year
            int r0 = r0.getPositionForYear(r3)
            r5.scrollToPosition(r0)
            android.view.View r5 = r4.yearFrame
            r5.setVisibility(r2)
            android.view.View r5 = r4.dayFrame
            r5.setVisibility(r1)
            android.view.View r5 = r4.monthPrev
            r5.setVisibility(r1)
            android.view.View r5 = r4.monthNext
            r5.setVisibility(r1)
            goto L54
        L37:
            com.google.android.material.datepicker.MaterialCalendar$CalendarSelector r0 = com.google.android.material.datepicker.MaterialCalendar.CalendarSelector.DAY
            if (r5 != r0) goto L54
            android.view.View r5 = r4.yearFrame
            r5.setVisibility(r1)
            android.view.View r5 = r4.dayFrame
            r5.setVisibility(r2)
            android.view.View r5 = r4.monthPrev
            r5.setVisibility(r2)
            android.view.View r5 = r4.monthNext
            r5.setVisibility(r2)
            com.google.android.material.datepicker.Month r5 = r4.current
            r4.setCurrentMonth(r5)
        L54:
            return
    }

    void toggleVisibleSelector() {
            r2 = this;
            com.google.android.material.datepicker.MaterialCalendar$CalendarSelector r0 = r2.calendarSelector
            com.google.android.material.datepicker.MaterialCalendar$CalendarSelector r1 = com.google.android.material.datepicker.MaterialCalendar.CalendarSelector.YEAR
            if (r0 != r1) goto Lc
            com.google.android.material.datepicker.MaterialCalendar$CalendarSelector r0 = com.google.android.material.datepicker.MaterialCalendar.CalendarSelector.DAY
            r2.setSelector(r0)
            goto L17
        Lc:
            com.google.android.material.datepicker.MaterialCalendar$CalendarSelector r0 = r2.calendarSelector
            com.google.android.material.datepicker.MaterialCalendar$CalendarSelector r1 = com.google.android.material.datepicker.MaterialCalendar.CalendarSelector.DAY
            if (r0 != r1) goto L17
            com.google.android.material.datepicker.MaterialCalendar$CalendarSelector r0 = com.google.android.material.datepicker.MaterialCalendar.CalendarSelector.YEAR
            r2.setSelector(r0)
        L17:
            return
    }
}
