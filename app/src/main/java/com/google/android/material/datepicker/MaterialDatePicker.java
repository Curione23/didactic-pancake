package com.google.android.material.datepicker;

/* JADX INFO: loaded from: classes.dex */
public final class MaterialDatePicker<S> extends androidx.fragment.app.DialogFragment {
    private static final java.lang.String CALENDAR_CONSTRAINTS_KEY = "CALENDAR_CONSTRAINTS_KEY";
    static final java.lang.Object CANCEL_BUTTON_TAG = null;
    static final java.lang.Object CONFIRM_BUTTON_TAG = null;
    private static final java.lang.String DATE_SELECTOR_KEY = "DATE_SELECTOR_KEY";
    private static final java.lang.String DAY_VIEW_DECORATOR_KEY = "DAY_VIEW_DECORATOR_KEY";
    public static final int INPUT_MODE_CALENDAR = 0;
    private static final java.lang.String INPUT_MODE_KEY = "INPUT_MODE_KEY";
    public static final int INPUT_MODE_TEXT = 1;
    private static final java.lang.String NEGATIVE_BUTTON_CONTENT_DESCRIPTION_KEY = "NEGATIVE_BUTTON_CONTENT_DESCRIPTION_KEY";
    private static final java.lang.String NEGATIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY = "NEGATIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY";
    private static final java.lang.String NEGATIVE_BUTTON_TEXT_KEY = "NEGATIVE_BUTTON_TEXT_KEY";
    private static final java.lang.String NEGATIVE_BUTTON_TEXT_RES_ID_KEY = "NEGATIVE_BUTTON_TEXT_RES_ID_KEY";
    private static final java.lang.String OVERRIDE_THEME_RES_ID = "OVERRIDE_THEME_RES_ID";
    private static final java.lang.String POSITIVE_BUTTON_CONTENT_DESCRIPTION_KEY = "POSITIVE_BUTTON_CONTENT_DESCRIPTION_KEY";
    private static final java.lang.String POSITIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY = "POSITIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY";
    private static final java.lang.String POSITIVE_BUTTON_TEXT_KEY = "POSITIVE_BUTTON_TEXT_KEY";
    private static final java.lang.String POSITIVE_BUTTON_TEXT_RES_ID_KEY = "POSITIVE_BUTTON_TEXT_RES_ID_KEY";
    private static final java.lang.String TITLE_TEXT_KEY = "TITLE_TEXT_KEY";
    private static final java.lang.String TITLE_TEXT_RES_ID_KEY = "TITLE_TEXT_RES_ID_KEY";
    static final java.lang.Object TOGGLE_BUTTON_TAG = null;
    private com.google.android.material.shape.MaterialShapeDrawable background;
    private com.google.android.material.datepicker.MaterialCalendar<S> calendar;
    private com.google.android.material.datepicker.CalendarConstraints calendarConstraints;
    private android.widget.Button confirmButton;
    private com.google.android.material.datepicker.DateSelector<S> dateSelector;
    private com.google.android.material.datepicker.DayViewDecorator dayViewDecorator;
    private boolean edgeToEdgeEnabled;
    private java.lang.CharSequence fullTitleText;
    private boolean fullscreen;
    private android.widget.TextView headerSelectionText;
    private android.widget.TextView headerTitleTextView;
    private com.google.android.material.internal.CheckableImageButton headerToggleButton;
    private int inputMode;
    private java.lang.CharSequence negativeButtonContentDescription;
    private int negativeButtonContentDescriptionResId;
    private java.lang.CharSequence negativeButtonText;
    private int negativeButtonTextResId;
    private final java.util.LinkedHashSet<android.content.DialogInterface.OnCancelListener> onCancelListeners;
    private final java.util.LinkedHashSet<android.content.DialogInterface.OnDismissListener> onDismissListeners;
    private final java.util.LinkedHashSet<android.view.View.OnClickListener> onNegativeButtonClickListeners;
    private final java.util.LinkedHashSet<com.google.android.material.datepicker.MaterialPickerOnPositiveButtonClickListener<? super S>> onPositiveButtonClickListeners;
    private int overrideThemeResId;
    private com.google.android.material.datepicker.PickerFragment<S> pickerFragment;
    private java.lang.CharSequence positiveButtonContentDescription;
    private int positiveButtonContentDescriptionResId;
    private java.lang.CharSequence positiveButtonText;
    private int positiveButtonTextResId;
    private java.lang.CharSequence singleLineTitleText;
    private java.lang.CharSequence titleText;
    private int titleTextResId;





    public static final class Builder<S> {
        com.google.android.material.datepicker.CalendarConstraints calendarConstraints;
        final com.google.android.material.datepicker.DateSelector<S> dateSelector;
        com.google.android.material.datepicker.DayViewDecorator dayViewDecorator;
        int inputMode;
        java.lang.CharSequence negativeButtonContentDescription;
        int negativeButtonContentDescriptionResId;
        java.lang.CharSequence negativeButtonText;
        int negativeButtonTextResId;
        int overrideThemeResId;
        java.lang.CharSequence positiveButtonContentDescription;
        int positiveButtonContentDescriptionResId;
        java.lang.CharSequence positiveButtonText;
        int positiveButtonTextResId;
        S selection;
        java.lang.CharSequence titleText;
        int titleTextResId;

        private Builder(com.google.android.material.datepicker.DateSelector<S> r3) {
                r2 = this;
                r2.<init>()
                r0 = 0
                r2.overrideThemeResId = r0
                r2.titleTextResId = r0
                r1 = 0
                r2.titleText = r1
                r2.positiveButtonTextResId = r0
                r2.positiveButtonText = r1
                r2.positiveButtonContentDescriptionResId = r0
                r2.positiveButtonContentDescription = r1
                r2.negativeButtonTextResId = r0
                r2.negativeButtonText = r1
                r2.negativeButtonContentDescriptionResId = r0
                r2.negativeButtonContentDescription = r1
                r2.selection = r1
                r2.inputMode = r0
                r2.dateSelector = r3
                return
        }

        private com.google.android.material.datepicker.Month createDefaultOpenAt() {
                r2 = this;
                com.google.android.material.datepicker.DateSelector<S> r0 = r2.dateSelector
                java.util.Collection r0 = r0.getSelectedDays()
                boolean r0 = r0.isEmpty()
                if (r0 != 0) goto L2d
                com.google.android.material.datepicker.DateSelector<S> r0 = r2.dateSelector
                java.util.Collection r0 = r0.getSelectedDays()
                java.util.Iterator r0 = r0.iterator()
                java.lang.Object r0 = r0.next()
                java.lang.Long r0 = (java.lang.Long) r0
                long r0 = r0.longValue()
                com.google.android.material.datepicker.Month r0 = com.google.android.material.datepicker.Month.create(r0)
                com.google.android.material.datepicker.CalendarConstraints r1 = r2.calendarConstraints
                boolean r1 = monthInValidRange(r0, r1)
                if (r1 == 0) goto L2d
                return r0
            L2d:
                com.google.android.material.datepicker.Month r0 = com.google.android.material.datepicker.Month.current()
                com.google.android.material.datepicker.CalendarConstraints r1 = r2.calendarConstraints
                boolean r1 = monthInValidRange(r0, r1)
                if (r1 == 0) goto L3a
                goto L40
            L3a:
                com.google.android.material.datepicker.CalendarConstraints r0 = r2.calendarConstraints
                com.google.android.material.datepicker.Month r0 = r0.getStart()
            L40:
                return r0
        }

        public static <S> com.google.android.material.datepicker.MaterialDatePicker.Builder<S> customDatePicker(com.google.android.material.datepicker.DateSelector<S> r1) {
                com.google.android.material.datepicker.MaterialDatePicker$Builder r0 = new com.google.android.material.datepicker.MaterialDatePicker$Builder
                r0.<init>(r1)
                return r0
        }

        public static com.google.android.material.datepicker.MaterialDatePicker.Builder<java.lang.Long> datePicker() {
                com.google.android.material.datepicker.MaterialDatePicker$Builder r0 = new com.google.android.material.datepicker.MaterialDatePicker$Builder
                com.google.android.material.datepicker.SingleDateSelector r1 = new com.google.android.material.datepicker.SingleDateSelector
                r1.<init>()
                r0.<init>(r1)
                return r0
        }

        public static com.google.android.material.datepicker.MaterialDatePicker.Builder<androidx.core.util.Pair<java.lang.Long, java.lang.Long>> dateRangePicker() {
                com.google.android.material.datepicker.MaterialDatePicker$Builder r0 = new com.google.android.material.datepicker.MaterialDatePicker$Builder
                com.google.android.material.datepicker.RangeDateSelector r1 = new com.google.android.material.datepicker.RangeDateSelector
                r1.<init>()
                r0.<init>(r1)
                return r0
        }

        private static boolean monthInValidRange(com.google.android.material.datepicker.Month r1, com.google.android.material.datepicker.CalendarConstraints r2) {
                com.google.android.material.datepicker.Month r0 = r2.getStart()
                int r0 = r1.compareTo2(r0)
                if (r0 < 0) goto L16
                com.google.android.material.datepicker.Month r2 = r2.getEnd()
                int r1 = r1.compareTo2(r2)
                if (r1 > 0) goto L16
                r1 = 1
                goto L17
            L16:
                r1 = 0
            L17:
                return r1
        }

        public com.google.android.material.datepicker.MaterialDatePicker<S> build() {
                r2 = this;
                com.google.android.material.datepicker.CalendarConstraints r0 = r2.calendarConstraints
                if (r0 != 0) goto Lf
                com.google.android.material.datepicker.CalendarConstraints$Builder r0 = new com.google.android.material.datepicker.CalendarConstraints$Builder
                r0.<init>()
                com.google.android.material.datepicker.CalendarConstraints r0 = r0.build()
                r2.calendarConstraints = r0
            Lf:
                int r0 = r2.titleTextResId
                if (r0 != 0) goto L1b
                com.google.android.material.datepicker.DateSelector<S> r0 = r2.dateSelector
                int r0 = r0.getDefaultTitleResId()
                r2.titleTextResId = r0
            L1b:
                S r0 = r2.selection
                if (r0 == 0) goto L24
                com.google.android.material.datepicker.DateSelector<S> r1 = r2.dateSelector
                r1.setSelection(r0)
            L24:
                com.google.android.material.datepicker.CalendarConstraints r0 = r2.calendarConstraints
                com.google.android.material.datepicker.Month r0 = r0.getOpenAt()
                if (r0 != 0) goto L35
                com.google.android.material.datepicker.CalendarConstraints r0 = r2.calendarConstraints
                com.google.android.material.datepicker.Month r1 = r2.createDefaultOpenAt()
                r0.setOpenAt(r1)
            L35:
                com.google.android.material.datepicker.MaterialDatePicker r0 = com.google.android.material.datepicker.MaterialDatePicker.newInstance(r2)
                return r0
        }

        public com.google.android.material.datepicker.MaterialDatePicker.Builder<S> setCalendarConstraints(com.google.android.material.datepicker.CalendarConstraints r1) {
                r0 = this;
                r0.calendarConstraints = r1
                return r0
        }

        public com.google.android.material.datepicker.MaterialDatePicker.Builder<S> setDayViewDecorator(com.google.android.material.datepicker.DayViewDecorator r1) {
                r0 = this;
                r0.dayViewDecorator = r1
                return r0
        }

        public com.google.android.material.datepicker.MaterialDatePicker.Builder<S> setInputMode(int r1) {
                r0 = this;
                r0.inputMode = r1
                return r0
        }

        public com.google.android.material.datepicker.MaterialDatePicker.Builder<S> setNegativeButtonContentDescription(int r1) {
                r0 = this;
                r0.negativeButtonContentDescriptionResId = r1
                r1 = 0
                r0.negativeButtonContentDescription = r1
                return r0
        }

        public com.google.android.material.datepicker.MaterialDatePicker.Builder<S> setNegativeButtonContentDescription(java.lang.CharSequence r1) {
                r0 = this;
                r0.negativeButtonContentDescription = r1
                r1 = 0
                r0.negativeButtonContentDescriptionResId = r1
                return r0
        }

        public com.google.android.material.datepicker.MaterialDatePicker.Builder<S> setNegativeButtonText(int r1) {
                r0 = this;
                r0.negativeButtonTextResId = r1
                r1 = 0
                r0.negativeButtonText = r1
                return r0
        }

        public com.google.android.material.datepicker.MaterialDatePicker.Builder<S> setNegativeButtonText(java.lang.CharSequence r1) {
                r0 = this;
                r0.negativeButtonText = r1
                r1 = 0
                r0.negativeButtonTextResId = r1
                return r0
        }

        public com.google.android.material.datepicker.MaterialDatePicker.Builder<S> setPositiveButtonContentDescription(int r1) {
                r0 = this;
                r0.positiveButtonContentDescriptionResId = r1
                r1 = 0
                r0.positiveButtonContentDescription = r1
                return r0
        }

        public com.google.android.material.datepicker.MaterialDatePicker.Builder<S> setPositiveButtonContentDescription(java.lang.CharSequence r1) {
                r0 = this;
                r0.positiveButtonContentDescription = r1
                r1 = 0
                r0.positiveButtonContentDescriptionResId = r1
                return r0
        }

        public com.google.android.material.datepicker.MaterialDatePicker.Builder<S> setPositiveButtonText(int r1) {
                r0 = this;
                r0.positiveButtonTextResId = r1
                r1 = 0
                r0.positiveButtonText = r1
                return r0
        }

        public com.google.android.material.datepicker.MaterialDatePicker.Builder<S> setPositiveButtonText(java.lang.CharSequence r1) {
                r0 = this;
                r0.positiveButtonText = r1
                r1 = 0
                r0.positiveButtonTextResId = r1
                return r0
        }

        public com.google.android.material.datepicker.MaterialDatePicker.Builder<S> setSelection(S r1) {
                r0 = this;
                r0.selection = r1
                return r0
        }

        public com.google.android.material.datepicker.MaterialDatePicker.Builder<S> setTextInputFormat(java.text.SimpleDateFormat r2) {
                r1 = this;
                com.google.android.material.datepicker.DateSelector<S> r0 = r1.dateSelector
                r0.setTextInputFormat(r2)
                return r1
        }

        public com.google.android.material.datepicker.MaterialDatePicker.Builder<S> setTheme(int r1) {
                r0 = this;
                r0.overrideThemeResId = r1
                return r0
        }

        public com.google.android.material.datepicker.MaterialDatePicker.Builder<S> setTitleText(int r1) {
                r0 = this;
                r0.titleTextResId = r1
                r1 = 0
                r0.titleText = r1
                return r0
        }

        public com.google.android.material.datepicker.MaterialDatePicker.Builder<S> setTitleText(java.lang.CharSequence r1) {
                r0 = this;
                r0.titleText = r1
                r1 = 0
                r0.titleTextResId = r1
                return r0
        }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface InputMode {
    }

    static {
            java.lang.String r0 = "CONFIRM_BUTTON_TAG"
            com.google.android.material.datepicker.MaterialDatePicker.CONFIRM_BUTTON_TAG = r0
            java.lang.String r0 = "CANCEL_BUTTON_TAG"
            com.google.android.material.datepicker.MaterialDatePicker.CANCEL_BUTTON_TAG = r0
            java.lang.String r0 = "TOGGLE_BUTTON_TAG"
            com.google.android.material.datepicker.MaterialDatePicker.TOGGLE_BUTTON_TAG = r0
            return
    }

    public MaterialDatePicker() {
            r1 = this;
            r1.<init>()
            java.util.LinkedHashSet r0 = new java.util.LinkedHashSet
            r0.<init>()
            r1.onPositiveButtonClickListeners = r0
            java.util.LinkedHashSet r0 = new java.util.LinkedHashSet
            r0.<init>()
            r1.onNegativeButtonClickListeners = r0
            java.util.LinkedHashSet r0 = new java.util.LinkedHashSet
            r0.<init>()
            r1.onCancelListeners = r0
            java.util.LinkedHashSet r0 = new java.util.LinkedHashSet
            r0.<init>()
            r1.onDismissListeners = r0
            return
    }

    static /* synthetic */ java.util.LinkedHashSet access$000(com.google.android.material.datepicker.MaterialDatePicker r0) {
            java.util.LinkedHashSet<com.google.android.material.datepicker.MaterialPickerOnPositiveButtonClickListener<? super S>> r0 = r0.onPositiveButtonClickListeners
            return r0
    }

    static /* synthetic */ java.util.LinkedHashSet access$100(com.google.android.material.datepicker.MaterialDatePicker r0) {
            java.util.LinkedHashSet<android.view.View$OnClickListener> r0 = r0.onNegativeButtonClickListeners
            return r0
    }

    static /* synthetic */ com.google.android.material.datepicker.DateSelector access$200(com.google.android.material.datepicker.MaterialDatePicker r0) {
            com.google.android.material.datepicker.DateSelector r0 = r0.getDateSelector()
            return r0
    }

    static /* synthetic */ android.widget.Button access$300(com.google.android.material.datepicker.MaterialDatePicker r0) {
            android.widget.Button r0 = r0.confirmButton
            return r0
    }

    private static android.graphics.drawable.Drawable createHeaderToggleDrawable(android.content.Context r3) {
            android.graphics.drawable.StateListDrawable r0 = new android.graphics.drawable.StateListDrawable
            r0.<init>()
            r1 = 16842912(0x10100a0, float:2.3694006E-38)
            int[] r1 = new int[]{r1}
            int r2 = com.google.android.material.R.drawable.material_ic_calendar_black_24dp
            android.graphics.drawable.Drawable r2 = androidx.appcompat.content.res.AppCompatResources.getDrawable(r3, r2)
            r0.addState(r1, r2)
            r1 = 0
            int[] r1 = new int[r1]
            int r2 = com.google.android.material.R.drawable.material_ic_edit_black_24dp
            android.graphics.drawable.Drawable r3 = androidx.appcompat.content.res.AppCompatResources.getDrawable(r3, r2)
            r0.addState(r1, r3)
            return r0
    }

    private void enableEdgeToEdgeIfNeeded(android.view.Window r5) {
            r4 = this;
            boolean r0 = r4.edgeToEdgeEnabled
            if (r0 == 0) goto L5
            return
        L5:
            android.view.View r0 = r4.requireView()
            int r1 = com.google.android.material.R.id.fullscreen_header
            android.view.View r0 = r0.findViewById(r1)
            java.lang.Integer r1 = com.google.android.material.internal.ViewUtils.getBackgroundColor(r0)
            r2 = 0
            r3 = 1
            com.google.android.material.internal.EdgeToEdgeUtils.applyEdgeToEdge(r5, r3, r1, r2)
            int r5 = r0.getPaddingTop()
            android.view.ViewGroup$LayoutParams r1 = r0.getLayoutParams()
            int r1 = r1.height
            com.google.android.material.datepicker.MaterialDatePicker$3 r2 = new com.google.android.material.datepicker.MaterialDatePicker$3
            r2.<init>(r4, r1, r0, r5)
            androidx.core.view.ViewCompat.setOnApplyWindowInsetsListener(r0, r2)
            r4.edgeToEdgeEnabled = r3
            return
    }

    private com.google.android.material.datepicker.DateSelector<S> getDateSelector() {
            r2 = this;
            com.google.android.material.datepicker.DateSelector<S> r0 = r2.dateSelector
            if (r0 != 0) goto L12
            android.os.Bundle r0 = r2.getArguments()
            java.lang.String r1 = "DATE_SELECTOR_KEY"
            android.os.Parcelable r0 = r0.getParcelable(r1)
            com.google.android.material.datepicker.DateSelector r0 = (com.google.android.material.datepicker.DateSelector) r0
            r2.dateSelector = r0
        L12:
            com.google.android.material.datepicker.DateSelector<S> r0 = r2.dateSelector
            return r0
    }

    private static java.lang.CharSequence getFirstLineBySeparator(java.lang.CharSequence r3) {
            if (r3 == 0) goto L14
            java.lang.String r0 = java.lang.String.valueOf(r3)
            java.lang.String r1 = "\n"
            java.lang.String[] r0 = android.text.TextUtils.split(r0, r1)
            int r1 = r0.length
            r2 = 1
            if (r1 <= r2) goto L13
            r3 = 0
            r3 = r0[r3]
        L13:
            return r3
        L14:
            r3 = 0
            return r3
    }

    private java.lang.String getHeaderContentDescription() {
            r2 = this;
            com.google.android.material.datepicker.DateSelector r0 = r2.getDateSelector()
            android.content.Context r1 = r2.requireContext()
            java.lang.String r0 = r0.getSelectionContentDescription(r1)
            return r0
    }

    private static int getPaddedPickerWidth(android.content.Context r4) {
            android.content.res.Resources r4 = r4.getResources()
            int r0 = com.google.android.material.R.dimen.mtrl_calendar_content_padding
            int r0 = r4.getDimensionPixelOffset(r0)
            com.google.android.material.datepicker.Month r1 = com.google.android.material.datepicker.Month.current()
            int r1 = r1.daysInWeek
            int r2 = com.google.android.material.R.dimen.mtrl_calendar_day_width
            int r2 = r4.getDimensionPixelSize(r2)
            int r3 = com.google.android.material.R.dimen.mtrl_calendar_month_horizontal_padding
            int r4 = r4.getDimensionPixelOffset(r3)
            int r0 = r0 * 2
            int r2 = r2 * r1
            int r0 = r0 + r2
            int r1 = r1 + (-1)
            int r1 = r1 * r4
            int r0 = r0 + r1
            return r0
    }

    private int getThemeResId(android.content.Context r2) {
            r1 = this;
            int r0 = r1.overrideThemeResId
            if (r0 == 0) goto L5
            return r0
        L5:
            com.google.android.material.datepicker.DateSelector r0 = r1.getDateSelector()
            int r2 = r0.getDefaultThemeResId(r2)
            return r2
    }

    private void initHeaderToggle(android.content.Context r3) {
            r2 = this;
            com.google.android.material.internal.CheckableImageButton r0 = r2.headerToggleButton
            java.lang.Object r1 = com.google.android.material.datepicker.MaterialDatePicker.TOGGLE_BUTTON_TAG
            r0.setTag(r1)
            com.google.android.material.internal.CheckableImageButton r0 = r2.headerToggleButton
            android.graphics.drawable.Drawable r3 = createHeaderToggleDrawable(r3)
            r0.setImageDrawable(r3)
            com.google.android.material.internal.CheckableImageButton r3 = r2.headerToggleButton
            int r0 = r2.inputMode
            if (r0 == 0) goto L18
            r0 = 1
            goto L19
        L18:
            r0 = 0
        L19:
            r3.setChecked(r0)
            com.google.android.material.internal.CheckableImageButton r3 = r2.headerToggleButton
            r0 = 0
            androidx.core.view.ViewCompat.setAccessibilityDelegate(r3, r0)
            com.google.android.material.internal.CheckableImageButton r3 = r2.headerToggleButton
            r2.updateToggleContentDescription(r3)
            com.google.android.material.internal.CheckableImageButton r3 = r2.headerToggleButton
            com.google.android.material.datepicker.MaterialDatePicker$$ExternalSyntheticLambda0 r0 = new com.google.android.material.datepicker.MaterialDatePicker$$ExternalSyntheticLambda0
            r0.<init>(r2)
            r3.setOnClickListener(r0)
            return
    }

    static boolean isFullscreen(android.content.Context r1) {
            r0 = 16843277(0x101020d, float:2.369503E-38)
            boolean r1 = readMaterialCalendarStyleBoolean(r1, r0)
            return r1
    }

    private boolean isLandscape() {
            r2 = this;
            android.content.res.Resources r0 = r2.getResources()
            android.content.res.Configuration r0 = r0.getConfiguration()
            int r0 = r0.orientation
            r1 = 2
            if (r0 != r1) goto Lf
            r0 = 1
            goto L10
        Lf:
            r0 = 0
        L10:
            return r0
    }

    static boolean isNestedScrollable(android.content.Context r1) {
            int r0 = com.google.android.material.R.attr.nestedScrollable
            boolean r1 = readMaterialCalendarStyleBoolean(r1, r0)
            return r1
    }

    static <S> com.google.android.material.datepicker.MaterialDatePicker<S> newInstance(com.google.android.material.datepicker.MaterialDatePicker.Builder<S> r4) {
            com.google.android.material.datepicker.MaterialDatePicker r0 = new com.google.android.material.datepicker.MaterialDatePicker
            r0.<init>()
            android.os.Bundle r1 = new android.os.Bundle
            r1.<init>()
            java.lang.String r2 = "OVERRIDE_THEME_RES_ID"
            int r3 = r4.overrideThemeResId
            r1.putInt(r2, r3)
            java.lang.String r2 = "DATE_SELECTOR_KEY"
            com.google.android.material.datepicker.DateSelector<S> r3 = r4.dateSelector
            r1.putParcelable(r2, r3)
            java.lang.String r2 = "CALENDAR_CONSTRAINTS_KEY"
            com.google.android.material.datepicker.CalendarConstraints r3 = r4.calendarConstraints
            r1.putParcelable(r2, r3)
            java.lang.String r2 = "DAY_VIEW_DECORATOR_KEY"
            com.google.android.material.datepicker.DayViewDecorator r3 = r4.dayViewDecorator
            r1.putParcelable(r2, r3)
            java.lang.String r2 = "TITLE_TEXT_RES_ID_KEY"
            int r3 = r4.titleTextResId
            r1.putInt(r2, r3)
            java.lang.String r2 = "TITLE_TEXT_KEY"
            java.lang.CharSequence r3 = r4.titleText
            r1.putCharSequence(r2, r3)
            java.lang.String r2 = "INPUT_MODE_KEY"
            int r3 = r4.inputMode
            r1.putInt(r2, r3)
            java.lang.String r2 = "POSITIVE_BUTTON_TEXT_RES_ID_KEY"
            int r3 = r4.positiveButtonTextResId
            r1.putInt(r2, r3)
            java.lang.String r2 = "POSITIVE_BUTTON_TEXT_KEY"
            java.lang.CharSequence r3 = r4.positiveButtonText
            r1.putCharSequence(r2, r3)
            java.lang.String r2 = "POSITIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY"
            int r3 = r4.positiveButtonContentDescriptionResId
            r1.putInt(r2, r3)
            java.lang.String r2 = "POSITIVE_BUTTON_CONTENT_DESCRIPTION_KEY"
            java.lang.CharSequence r3 = r4.positiveButtonContentDescription
            r1.putCharSequence(r2, r3)
            java.lang.String r2 = "NEGATIVE_BUTTON_TEXT_RES_ID_KEY"
            int r3 = r4.negativeButtonTextResId
            r1.putInt(r2, r3)
            java.lang.String r2 = "NEGATIVE_BUTTON_TEXT_KEY"
            java.lang.CharSequence r3 = r4.negativeButtonText
            r1.putCharSequence(r2, r3)
            java.lang.String r2 = "NEGATIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY"
            int r3 = r4.negativeButtonContentDescriptionResId
            r1.putInt(r2, r3)
            java.lang.String r2 = "NEGATIVE_BUTTON_CONTENT_DESCRIPTION_KEY"
            java.lang.CharSequence r4 = r4.negativeButtonContentDescription
            r1.putCharSequence(r2, r4)
            r0.setArguments(r1)
            return r0
    }

    static boolean readMaterialCalendarStyleBoolean(android.content.Context r2, int r3) {
            int r0 = com.google.android.material.R.attr.materialCalendarStyle
            java.lang.Class<com.google.android.material.datepicker.MaterialCalendar> r1 = com.google.android.material.datepicker.MaterialCalendar.class
            java.lang.String r1 = r1.getCanonicalName()
            int r0 = com.google.android.material.resources.MaterialAttributes.resolveOrThrow(r2, r0, r1)
            int[] r3 = new int[]{r3}
            android.content.res.TypedArray r2 = r2.obtainStyledAttributes(r0, r3)
            r3 = 0
            boolean r3 = r2.getBoolean(r3, r3)
            r2.recycle()
            return r3
    }

    private void startPickerFragment() {
            r4 = this;
            android.content.Context r0 = r4.requireContext()
            int r0 = r4.getThemeResId(r0)
            com.google.android.material.datepicker.DateSelector r1 = r4.getDateSelector()
            com.google.android.material.datepicker.CalendarConstraints r2 = r4.calendarConstraints
            com.google.android.material.datepicker.DayViewDecorator r3 = r4.dayViewDecorator
            com.google.android.material.datepicker.MaterialCalendar r1 = com.google.android.material.datepicker.MaterialCalendar.newInstance(r1, r0, r2, r3)
            r4.calendar = r1
            int r2 = r4.inputMode
            r3 = 1
            if (r2 != r3) goto L25
            com.google.android.material.datepicker.DateSelector r1 = r4.getDateSelector()
            com.google.android.material.datepicker.CalendarConstraints r2 = r4.calendarConstraints
            com.google.android.material.datepicker.MaterialTextInputPicker r1 = com.google.android.material.datepicker.MaterialTextInputPicker.newInstance(r1, r0, r2)
        L25:
            r4.pickerFragment = r1
            r4.updateTitle()
            java.lang.String r0 = r4.getHeaderText()
            r4.updateHeader(r0)
            androidx.fragment.app.FragmentManager r0 = r4.getChildFragmentManager()
            androidx.fragment.app.FragmentTransaction r0 = r0.beginTransaction()
            int r1 = com.google.android.material.R.id.mtrl_calendar_frame
            com.google.android.material.datepicker.PickerFragment<S> r2 = r4.pickerFragment
            r0.replace(r1, r2)
            r0.commitNow()
            com.google.android.material.datepicker.PickerFragment<S> r0 = r4.pickerFragment
            com.google.android.material.datepicker.MaterialDatePicker$4 r1 = new com.google.android.material.datepicker.MaterialDatePicker$4
            r1.<init>(r4)
            r0.addOnSelectionChangedListener(r1)
            return
    }

    public static long thisMonthInUtcMilliseconds() {
            com.google.android.material.datepicker.Month r0 = com.google.android.material.datepicker.Month.current()
            long r0 = r0.timeInMillis
            return r0
    }

    public static long todayInUtcMilliseconds() {
            java.util.Calendar r0 = com.google.android.material.datepicker.UtcDates.getTodayCalendar()
            long r0 = r0.getTimeInMillis()
            return r0
    }

    private void updateTitle() {
            r3 = this;
            android.widget.TextView r0 = r3.headerTitleTextView
            int r1 = r3.inputMode
            r2 = 1
            if (r1 != r2) goto L10
            boolean r1 = r3.isLandscape()
            if (r1 == 0) goto L10
            java.lang.CharSequence r1 = r3.singleLineTitleText
            goto L12
        L10:
            java.lang.CharSequence r1 = r3.fullTitleText
        L12:
            r0.setText(r1)
            return
    }

    private void updateToggleContentDescription(com.google.android.material.internal.CheckableImageButton r3) {
            r2 = this;
            int r0 = r2.inputMode
            r1 = 1
            if (r0 != r1) goto L10
            android.content.Context r3 = r3.getContext()
            int r0 = com.google.android.material.R.string.mtrl_picker_toggle_to_calendar_input_mode
            java.lang.String r3 = r3.getString(r0)
            goto L1a
        L10:
            android.content.Context r3 = r3.getContext()
            int r0 = com.google.android.material.R.string.mtrl_picker_toggle_to_text_input_mode
            java.lang.String r3 = r3.getString(r0)
        L1a:
            com.google.android.material.internal.CheckableImageButton r0 = r2.headerToggleButton
            r0.setContentDescription(r3)
            return
    }

    public boolean addOnCancelListener(android.content.DialogInterface.OnCancelListener r2) {
            r1 = this;
            java.util.LinkedHashSet<android.content.DialogInterface$OnCancelListener> r0 = r1.onCancelListeners
            boolean r2 = r0.add(r2)
            return r2
    }

    public boolean addOnDismissListener(android.content.DialogInterface.OnDismissListener r2) {
            r1 = this;
            java.util.LinkedHashSet<android.content.DialogInterface$OnDismissListener> r0 = r1.onDismissListeners
            boolean r2 = r0.add(r2)
            return r2
    }

    public boolean addOnNegativeButtonClickListener(android.view.View.OnClickListener r2) {
            r1 = this;
            java.util.LinkedHashSet<android.view.View$OnClickListener> r0 = r1.onNegativeButtonClickListeners
            boolean r2 = r0.add(r2)
            return r2
    }

    public boolean addOnPositiveButtonClickListener(com.google.android.material.datepicker.MaterialPickerOnPositiveButtonClickListener<? super S> r2) {
            r1 = this;
            java.util.LinkedHashSet<com.google.android.material.datepicker.MaterialPickerOnPositiveButtonClickListener<? super S>> r0 = r1.onPositiveButtonClickListeners
            boolean r2 = r0.add(r2)
            return r2
    }

    public void clearOnCancelListeners() {
            r1 = this;
            java.util.LinkedHashSet<android.content.DialogInterface$OnCancelListener> r0 = r1.onCancelListeners
            r0.clear()
            return
    }

    public void clearOnDismissListeners() {
            r1 = this;
            java.util.LinkedHashSet<android.content.DialogInterface$OnDismissListener> r0 = r1.onDismissListeners
            r0.clear()
            return
    }

    public void clearOnNegativeButtonClickListeners() {
            r1 = this;
            java.util.LinkedHashSet<android.view.View$OnClickListener> r0 = r1.onNegativeButtonClickListeners
            r0.clear()
            return
    }

    public void clearOnPositiveButtonClickListeners() {
            r1 = this;
            java.util.LinkedHashSet<com.google.android.material.datepicker.MaterialPickerOnPositiveButtonClickListener<? super S>> r0 = r1.onPositiveButtonClickListeners
            r0.clear()
            return
    }

    public java.lang.String getHeaderText() {
            r2 = this;
            com.google.android.material.datepicker.DateSelector r0 = r2.getDateSelector()
            android.content.Context r1 = r2.getContext()
            java.lang.String r0 = r0.getSelectionDisplayString(r1)
            return r0
    }

    public int getInputMode() {
            r1 = this;
            int r0 = r1.inputMode
            return r0
    }

    public final S getSelection() {
            r1 = this;
            com.google.android.material.datepicker.DateSelector r0 = r1.getDateSelector()
            java.lang.Object r0 = r0.getSelection()
            return r0
    }

    /* JADX INFO: renamed from: lambda$initHeaderToggle$0$com-google-android-material-datepicker-MaterialDatePicker, reason: not valid java name */
    /* synthetic */ void m659x8a93f18a(android.view.View r2) {
            r1 = this;
            android.widget.Button r2 = r1.confirmButton
            com.google.android.material.datepicker.DateSelector r0 = r1.getDateSelector()
            boolean r0 = r0.isSelectionComplete()
            r2.setEnabled(r0)
            com.google.android.material.internal.CheckableImageButton r2 = r1.headerToggleButton
            r2.toggle()
            int r2 = r1.inputMode
            r0 = 1
            if (r2 != r0) goto L18
            r0 = 0
        L18:
            r1.inputMode = r0
            com.google.android.material.internal.CheckableImageButton r2 = r1.headerToggleButton
            r1.updateToggleContentDescription(r2)
            r1.startPickerFragment()
            return
    }

    @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnCancelListener
    public final void onCancel(android.content.DialogInterface r3) {
            r2 = this;
            java.util.LinkedHashSet<android.content.DialogInterface$OnCancelListener> r0 = r2.onCancelListeners
            java.util.Iterator r0 = r0.iterator()
        L6:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L16
            java.lang.Object r1 = r0.next()
            android.content.DialogInterface$OnCancelListener r1 = (android.content.DialogInterface.OnCancelListener) r1
            r1.onCancel(r3)
            goto L6
        L16:
            super.onCancel(r3)
            return
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onCreate(android.os.Bundle r2) {
            r1 = this;
            super.onCreate(r2)
            if (r2 != 0) goto L9
            android.os.Bundle r2 = r1.getArguments()
        L9:
            java.lang.String r0 = "OVERRIDE_THEME_RES_ID"
            int r0 = r2.getInt(r0)
            r1.overrideThemeResId = r0
            java.lang.String r0 = "DATE_SELECTOR_KEY"
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
            java.lang.String r0 = "TITLE_TEXT_RES_ID_KEY"
            int r0 = r2.getInt(r0)
            r1.titleTextResId = r0
            java.lang.String r0 = "TITLE_TEXT_KEY"
            java.lang.CharSequence r0 = r2.getCharSequence(r0)
            r1.titleText = r0
            java.lang.String r0 = "INPUT_MODE_KEY"
            int r0 = r2.getInt(r0)
            r1.inputMode = r0
            java.lang.String r0 = "POSITIVE_BUTTON_TEXT_RES_ID_KEY"
            int r0 = r2.getInt(r0)
            r1.positiveButtonTextResId = r0
            java.lang.String r0 = "POSITIVE_BUTTON_TEXT_KEY"
            java.lang.CharSequence r0 = r2.getCharSequence(r0)
            r1.positiveButtonText = r0
            java.lang.String r0 = "POSITIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY"
            int r0 = r2.getInt(r0)
            r1.positiveButtonContentDescriptionResId = r0
            java.lang.String r0 = "POSITIVE_BUTTON_CONTENT_DESCRIPTION_KEY"
            java.lang.CharSequence r0 = r2.getCharSequence(r0)
            r1.positiveButtonContentDescription = r0
            java.lang.String r0 = "NEGATIVE_BUTTON_TEXT_RES_ID_KEY"
            int r0 = r2.getInt(r0)
            r1.negativeButtonTextResId = r0
            java.lang.String r0 = "NEGATIVE_BUTTON_TEXT_KEY"
            java.lang.CharSequence r0 = r2.getCharSequence(r0)
            r1.negativeButtonText = r0
            java.lang.String r0 = "NEGATIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY"
            int r0 = r2.getInt(r0)
            r1.negativeButtonContentDescriptionResId = r0
            java.lang.String r0 = "NEGATIVE_BUTTON_CONTENT_DESCRIPTION_KEY"
            java.lang.CharSequence r2 = r2.getCharSequence(r0)
            r1.negativeButtonContentDescription = r2
            java.lang.CharSequence r2 = r1.titleText
            if (r2 == 0) goto L8c
            goto L9a
        L8c:
            android.content.Context r2 = r1.requireContext()
            android.content.res.Resources r2 = r2.getResources()
            int r0 = r1.titleTextResId
            java.lang.CharSequence r2 = r2.getText(r0)
        L9a:
            r1.fullTitleText = r2
            java.lang.CharSequence r2 = getFirstLineBySeparator(r2)
            r1.singleLineTitleText = r2
            return
    }

    @Override // androidx.fragment.app.DialogFragment
    public final android.app.Dialog onCreateDialog(android.os.Bundle r6) {
            r5 = this;
            android.app.Dialog r6 = new android.app.Dialog
            android.content.Context r0 = r5.requireContext()
            android.content.Context r1 = r5.requireContext()
            int r1 = r5.getThemeResId(r1)
            r6.<init>(r0, r1)
            android.content.Context r0 = r6.getContext()
            boolean r1 = isFullscreen(r0)
            r5.fullscreen = r1
            com.google.android.material.shape.MaterialShapeDrawable r1 = new com.google.android.material.shape.MaterialShapeDrawable
            int r2 = com.google.android.material.R.attr.materialCalendarStyle
            int r3 = com.google.android.material.R.style.Widget_MaterialComponents_MaterialCalendar
            r4 = 0
            r1.<init>(r0, r4, r2, r3)
            r5.background = r1
            int[] r1 = com.google.android.material.R.styleable.MaterialCalendar
            int r2 = com.google.android.material.R.attr.materialCalendarStyle
            int r3 = com.google.android.material.R.style.Widget_MaterialComponents_MaterialCalendar
            android.content.res.TypedArray r1 = r0.obtainStyledAttributes(r4, r1, r2, r3)
            int r2 = com.google.android.material.R.styleable.MaterialCalendar_backgroundTint
            r3 = 0
            int r2 = r1.getColor(r2, r3)
            r1.recycle()
            com.google.android.material.shape.MaterialShapeDrawable r1 = r5.background
            r1.initializeElevationOverlay(r0)
            com.google.android.material.shape.MaterialShapeDrawable r0 = r5.background
            android.content.res.ColorStateList r1 = android.content.res.ColorStateList.valueOf(r2)
            r0.setFillColor(r1)
            com.google.android.material.shape.MaterialShapeDrawable r0 = r5.background
            android.view.Window r1 = r6.getWindow()
            android.view.View r1 = r1.getDecorView()
            float r1 = androidx.core.view.ViewCompat.getElevation(r1)
            r0.setElevation(r1)
            return r6
    }

    @Override // androidx.fragment.app.Fragment
    public final android.view.View onCreateView(android.view.LayoutInflater r4, android.view.ViewGroup r5, android.os.Bundle r6) {
            r3 = this;
            boolean r6 = r3.fullscreen
            if (r6 == 0) goto L7
            int r6 = com.google.android.material.R.layout.mtrl_picker_fullscreen
            goto L9
        L7:
            int r6 = com.google.android.material.R.layout.mtrl_picker_dialog
        L9:
            android.view.View r4 = r4.inflate(r6, r5)
            android.content.Context r5 = r4.getContext()
            com.google.android.material.datepicker.DayViewDecorator r6 = r3.dayViewDecorator
            if (r6 == 0) goto L18
            r6.initialize(r5)
        L18:
            boolean r6 = r3.fullscreen
            if (r6 == 0) goto L30
            int r6 = com.google.android.material.R.id.mtrl_calendar_frame
            android.view.View r6 = r4.findViewById(r6)
            android.widget.LinearLayout$LayoutParams r0 = new android.widget.LinearLayout$LayoutParams
            int r1 = getPaddedPickerWidth(r5)
            r2 = -2
            r0.<init>(r1, r2)
            r6.setLayoutParams(r0)
            goto L43
        L30:
            int r6 = com.google.android.material.R.id.mtrl_calendar_main_pane
            android.view.View r6 = r4.findViewById(r6)
            android.widget.LinearLayout$LayoutParams r0 = new android.widget.LinearLayout$LayoutParams
            int r1 = getPaddedPickerWidth(r5)
            r2 = -1
            r0.<init>(r1, r2)
            r6.setLayoutParams(r0)
        L43:
            int r6 = com.google.android.material.R.id.mtrl_picker_header_selection_text
            android.view.View r6 = r4.findViewById(r6)
            android.widget.TextView r6 = (android.widget.TextView) r6
            r3.headerSelectionText = r6
            r0 = 1
            androidx.core.view.ViewCompat.setAccessibilityLiveRegion(r6, r0)
            int r6 = com.google.android.material.R.id.mtrl_picker_header_toggle
            android.view.View r6 = r4.findViewById(r6)
            com.google.android.material.internal.CheckableImageButton r6 = (com.google.android.material.internal.CheckableImageButton) r6
            r3.headerToggleButton = r6
            int r6 = com.google.android.material.R.id.mtrl_picker_title_text
            android.view.View r6 = r4.findViewById(r6)
            android.widget.TextView r6 = (android.widget.TextView) r6
            r3.headerTitleTextView = r6
            r3.initHeaderToggle(r5)
            int r5 = com.google.android.material.R.id.confirm_button
            android.view.View r5 = r4.findViewById(r5)
            android.widget.Button r5 = (android.widget.Button) r5
            r3.confirmButton = r5
            com.google.android.material.datepicker.DateSelector r5 = r3.getDateSelector()
            boolean r5 = r5.isSelectionComplete()
            if (r5 == 0) goto L82
            android.widget.Button r5 = r3.confirmButton
            r5.setEnabled(r0)
            goto L88
        L82:
            android.widget.Button r5 = r3.confirmButton
            r6 = 0
            r5.setEnabled(r6)
        L88:
            android.widget.Button r5 = r3.confirmButton
            java.lang.Object r6 = com.google.android.material.datepicker.MaterialDatePicker.CONFIRM_BUTTON_TAG
            r5.setTag(r6)
            java.lang.CharSequence r5 = r3.positiveButtonText
            if (r5 == 0) goto L99
            android.widget.Button r6 = r3.confirmButton
            r6.setText(r5)
            goto La2
        L99:
            int r5 = r3.positiveButtonTextResId
            if (r5 == 0) goto La2
            android.widget.Button r6 = r3.confirmButton
            r6.setText(r5)
        La2:
            java.lang.CharSequence r5 = r3.positiveButtonContentDescription
            if (r5 == 0) goto Lac
            android.widget.Button r6 = r3.confirmButton
            r6.setContentDescription(r5)
            goto Lc3
        Lac:
            int r5 = r3.positiveButtonContentDescriptionResId
            if (r5 == 0) goto Lc3
            android.widget.Button r5 = r3.confirmButton
            android.content.Context r6 = r3.getContext()
            android.content.res.Resources r6 = r6.getResources()
            int r0 = r3.positiveButtonContentDescriptionResId
            java.lang.CharSequence r6 = r6.getText(r0)
            r5.setContentDescription(r6)
        Lc3:
            android.widget.Button r5 = r3.confirmButton
            com.google.android.material.datepicker.MaterialDatePicker$1 r6 = new com.google.android.material.datepicker.MaterialDatePicker$1
            r6.<init>(r3)
            r5.setOnClickListener(r6)
            int r5 = com.google.android.material.R.id.cancel_button
            android.view.View r5 = r4.findViewById(r5)
            android.widget.Button r5 = (android.widget.Button) r5
            java.lang.Object r6 = com.google.android.material.datepicker.MaterialDatePicker.CANCEL_BUTTON_TAG
            r5.setTag(r6)
            java.lang.CharSequence r6 = r3.negativeButtonText
            if (r6 == 0) goto Le2
            r5.setText(r6)
            goto Le9
        Le2:
            int r6 = r3.negativeButtonTextResId
            if (r6 == 0) goto Le9
            r5.setText(r6)
        Le9:
            java.lang.CharSequence r6 = r3.negativeButtonContentDescription
            if (r6 == 0) goto Lf1
            r5.setContentDescription(r6)
            goto L106
        Lf1:
            int r6 = r3.negativeButtonContentDescriptionResId
            if (r6 == 0) goto L106
            android.content.Context r6 = r3.getContext()
            android.content.res.Resources r6 = r6.getResources()
            int r0 = r3.negativeButtonContentDescriptionResId
            java.lang.CharSequence r6 = r6.getText(r0)
            r5.setContentDescription(r6)
        L106:
            com.google.android.material.datepicker.MaterialDatePicker$2 r6 = new com.google.android.material.datepicker.MaterialDatePicker$2
            r6.<init>(r3)
            r5.setOnClickListener(r6)
            return r4
    }

    @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(android.content.DialogInterface r3) {
            r2 = this;
            java.util.LinkedHashSet<android.content.DialogInterface$OnDismissListener> r0 = r2.onDismissListeners
            java.util.Iterator r0 = r0.iterator()
        L6:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L16
            java.lang.Object r1 = r0.next()
            android.content.DialogInterface$OnDismissListener r1 = (android.content.DialogInterface.OnDismissListener) r1
            r1.onDismiss(r3)
            goto L6
        L16:
            android.view.View r0 = r2.getView()
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            if (r0 == 0) goto L21
            r0.removeAllViews()
        L21:
            super.onDismiss(r3)
            return
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onSaveInstanceState(android.os.Bundle r4) {
            r3 = this;
            super.onSaveInstanceState(r4)
            java.lang.String r0 = "OVERRIDE_THEME_RES_ID"
            int r1 = r3.overrideThemeResId
            r4.putInt(r0, r1)
            java.lang.String r0 = "DATE_SELECTOR_KEY"
            com.google.android.material.datepicker.DateSelector<S> r1 = r3.dateSelector
            r4.putParcelable(r0, r1)
            com.google.android.material.datepicker.CalendarConstraints$Builder r0 = new com.google.android.material.datepicker.CalendarConstraints$Builder
            com.google.android.material.datepicker.CalendarConstraints r1 = r3.calendarConstraints
            r0.<init>(r1)
            com.google.android.material.datepicker.MaterialCalendar<S> r1 = r3.calendar
            if (r1 != 0) goto L1e
            r1 = 0
            goto L22
        L1e:
            com.google.android.material.datepicker.Month r1 = r1.getCurrentMonth()
        L22:
            if (r1 == 0) goto L29
            long r1 = r1.timeInMillis
            r0.setOpenAt(r1)
        L29:
            java.lang.String r1 = "CALENDAR_CONSTRAINTS_KEY"
            com.google.android.material.datepicker.CalendarConstraints r0 = r0.build()
            r4.putParcelable(r1, r0)
            java.lang.String r0 = "DAY_VIEW_DECORATOR_KEY"
            com.google.android.material.datepicker.DayViewDecorator r1 = r3.dayViewDecorator
            r4.putParcelable(r0, r1)
            java.lang.String r0 = "TITLE_TEXT_RES_ID_KEY"
            int r1 = r3.titleTextResId
            r4.putInt(r0, r1)
            java.lang.String r0 = "TITLE_TEXT_KEY"
            java.lang.CharSequence r1 = r3.titleText
            r4.putCharSequence(r0, r1)
            java.lang.String r0 = "INPUT_MODE_KEY"
            int r1 = r3.inputMode
            r4.putInt(r0, r1)
            java.lang.String r0 = "POSITIVE_BUTTON_TEXT_RES_ID_KEY"
            int r1 = r3.positiveButtonTextResId
            r4.putInt(r0, r1)
            java.lang.String r0 = "POSITIVE_BUTTON_TEXT_KEY"
            java.lang.CharSequence r1 = r3.positiveButtonText
            r4.putCharSequence(r0, r1)
            java.lang.String r0 = "POSITIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY"
            int r1 = r3.positiveButtonContentDescriptionResId
            r4.putInt(r0, r1)
            java.lang.String r0 = "POSITIVE_BUTTON_CONTENT_DESCRIPTION_KEY"
            java.lang.CharSequence r1 = r3.positiveButtonContentDescription
            r4.putCharSequence(r0, r1)
            java.lang.String r0 = "NEGATIVE_BUTTON_TEXT_RES_ID_KEY"
            int r1 = r3.negativeButtonTextResId
            r4.putInt(r0, r1)
            java.lang.String r0 = "NEGATIVE_BUTTON_TEXT_KEY"
            java.lang.CharSequence r1 = r3.negativeButtonText
            r4.putCharSequence(r0, r1)
            java.lang.String r0 = "NEGATIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY"
            int r1 = r3.negativeButtonContentDescriptionResId
            r4.putInt(r0, r1)
            java.lang.String r0 = "NEGATIVE_BUTTON_CONTENT_DESCRIPTION_KEY"
            java.lang.CharSequence r1 = r3.negativeButtonContentDescription
            r4.putCharSequence(r0, r1)
            return
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onStart() {
            r9 = this;
            super.onStart()
            android.app.Dialog r0 = r9.requireDialog()
            android.view.Window r0 = r0.getWindow()
            boolean r1 = r9.fullscreen
            if (r1 == 0) goto L1c
            r1 = -1
            r0.setLayout(r1, r1)
            com.google.android.material.shape.MaterialShapeDrawable r1 = r9.background
            r0.setBackgroundDrawable(r1)
            r9.enableEdgeToEdgeIfNeeded(r0)
            goto L4d
        L1c:
            r1 = -2
            r0.setLayout(r1, r1)
            android.content.res.Resources r1 = r9.getResources()
            int r2 = com.google.android.material.R.dimen.mtrl_calendar_dialog_background_inset
            int r8 = r1.getDimensionPixelOffset(r2)
            android.graphics.Rect r1 = new android.graphics.Rect
            r1.<init>(r8, r8, r8, r8)
            android.graphics.drawable.InsetDrawable r2 = new android.graphics.drawable.InsetDrawable
            com.google.android.material.shape.MaterialShapeDrawable r4 = r9.background
            r3 = r2
            r5 = r8
            r6 = r8
            r7 = r8
            r3.<init>(r4, r5, r6, r7, r8)
            r0.setBackgroundDrawable(r2)
            android.view.View r0 = r0.getDecorView()
            com.google.android.material.dialog.InsetDialogOnTouchListener r2 = new com.google.android.material.dialog.InsetDialogOnTouchListener
            android.app.Dialog r3 = r9.requireDialog()
            r2.<init>(r3, r1)
            r0.setOnTouchListener(r2)
        L4d:
            r9.startPickerFragment()
            return
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onStop() {
            r1 = this;
            com.google.android.material.datepicker.PickerFragment<S> r0 = r1.pickerFragment
            r0.clearOnSelectionChangedListeners()
            super.onStop()
            return
    }

    public boolean removeOnCancelListener(android.content.DialogInterface.OnCancelListener r2) {
            r1 = this;
            java.util.LinkedHashSet<android.content.DialogInterface$OnCancelListener> r0 = r1.onCancelListeners
            boolean r2 = r0.remove(r2)
            return r2
    }

    public boolean removeOnDismissListener(android.content.DialogInterface.OnDismissListener r2) {
            r1 = this;
            java.util.LinkedHashSet<android.content.DialogInterface$OnDismissListener> r0 = r1.onDismissListeners
            boolean r2 = r0.remove(r2)
            return r2
    }

    public boolean removeOnNegativeButtonClickListener(android.view.View.OnClickListener r2) {
            r1 = this;
            java.util.LinkedHashSet<android.view.View$OnClickListener> r0 = r1.onNegativeButtonClickListeners
            boolean r2 = r0.remove(r2)
            return r2
    }

    public boolean removeOnPositiveButtonClickListener(com.google.android.material.datepicker.MaterialPickerOnPositiveButtonClickListener<? super S> r2) {
            r1 = this;
            java.util.LinkedHashSet<com.google.android.material.datepicker.MaterialPickerOnPositiveButtonClickListener<? super S>> r0 = r1.onPositiveButtonClickListeners
            boolean r2 = r0.remove(r2)
            return r2
    }

    void updateHeader(java.lang.String r3) {
            r2 = this;
            android.widget.TextView r0 = r2.headerSelectionText
            java.lang.String r1 = r2.getHeaderContentDescription()
            r0.setContentDescription(r1)
            android.widget.TextView r0 = r2.headerSelectionText
            r0.setText(r3)
            return
    }
}
