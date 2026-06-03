package com.google.android.material.datepicker;

/* JADX INFO: loaded from: classes.dex */
class UtcDates {
    static final java.lang.String UTC = "UTC";
    static java.util.concurrent.atomic.AtomicReference<com.google.android.material.datepicker.TimeSource> timeSourceRef;

    static {
            java.util.concurrent.atomic.AtomicReference r0 = new java.util.concurrent.atomic.AtomicReference
            r0.<init>()
            com.google.android.material.datepicker.UtcDates.timeSourceRef = r0
            return
    }

    private UtcDates() {
            r0 = this;
            r0.<init>()
            return
    }

    static long canonicalYearMonthDay(long r1) {
            java.util.Calendar r0 = getUtcCalendar()
            r0.setTimeInMillis(r1)
            java.util.Calendar r1 = getDayCopy(r0)
            long r1 = r1.getTimeInMillis()
            return r1
    }

    private static int findCharactersInDateFormatPattern(java.lang.String r2, java.lang.String r3, int r4, int r5) {
        L0:
            if (r5 < 0) goto L2d
            int r0 = r2.length()
            if (r5 >= r0) goto L2d
            char r0 = r2.charAt(r5)
            int r0 = r3.indexOf(r0)
            r1 = -1
            if (r0 != r1) goto L2d
            char r0 = r2.charAt(r5)
            r1 = 39
            if (r0 != r1) goto L2b
        L1b:
            int r5 = r5 + r4
            if (r5 < 0) goto L2b
            int r0 = r2.length()
            if (r5 >= r0) goto L2b
            char r0 = r2.charAt(r5)
            if (r0 == r1) goto L2b
            goto L1b
        L2b:
            int r5 = r5 + r4
            goto L0
        L2d:
            return r5
    }

    static android.icu.text.DateFormat getAbbrMonthDayFormat(java.util.Locale r1) {
            java.lang.String r0 = "MMMd"
            android.icu.text.DateFormat r1 = getAndroidFormat(r0, r1)
            return r1
    }

    private static android.icu.text.DateFormat getAndroidFormat(java.lang.String r0, java.util.Locale r1) {
            android.icu.text.DateFormat r0 = android.icu.text.DateFormat.getInstanceForSkeleton(r0, r1)
            android.icu.util.TimeZone r1 = getUtcAndroidTimeZone()
            r0.setTimeZone(r1)
            android.icu.text.DisplayContext r1 = android.icu.text.DisplayContext.CAPITALIZATION_FOR_STANDALONE
            r0.setContext(r1)
            return r0
    }

    static java.lang.String getDatePatternAsInputFormat(java.lang.String r3) {
            java.lang.String r0 = "[^dMy/\\-.]"
            java.lang.String r1 = ""
            java.lang.String r3 = r3.replaceAll(r0, r1)
            java.lang.String r0 = "d{1,2}"
            java.lang.String r2 = "dd"
            java.lang.String r3 = r3.replaceAll(r0, r2)
            java.lang.String r0 = "M{1,2}"
            java.lang.String r2 = "MM"
            java.lang.String r3 = r3.replaceAll(r0, r2)
            java.lang.String r0 = "y{1,4}"
            java.lang.String r2 = "yyyy"
            java.lang.String r3 = r3.replaceAll(r0, r2)
            java.lang.String r0 = "\\.$"
            java.lang.String r3 = r3.replaceAll(r0, r1)
            java.lang.String r0 = "My"
            java.lang.String r1 = "M/y"
            java.lang.String r3 = r3.replaceAll(r0, r1)
            return r3
    }

    static java.util.Calendar getDayCopy(java.util.Calendar r4) {
            java.util.Calendar r4 = getUtcCalendarOf(r4)
            java.util.Calendar r0 = getUtcCalendar()
            r1 = 1
            int r1 = r4.get(r1)
            r2 = 2
            int r2 = r4.get(r2)
            r3 = 5
            int r4 = r4.get(r3)
            r0.set(r1, r2, r4)
            return r0
    }

    static java.text.SimpleDateFormat getDefaultTextInputFormat() {
            r0 = 3
            java.util.Locale r1 = java.util.Locale.getDefault()
            java.text.DateFormat r0 = java.text.DateFormat.getDateInstance(r0, r1)
            java.text.SimpleDateFormat r0 = (java.text.SimpleDateFormat) r0
            java.lang.String r0 = r0.toPattern()
            java.lang.String r0 = getDatePatternAsInputFormat(r0)
            java.text.SimpleDateFormat r1 = new java.text.SimpleDateFormat
            java.util.Locale r2 = java.util.Locale.getDefault()
            r1.<init>(r0, r2)
            java.util.TimeZone r0 = getTimeZone()
            r1.setTimeZone(r0)
            r0 = 0
            r1.setLenient(r0)
            return r1
    }

    static java.lang.String getDefaultTextInputHint(android.content.res.Resources r6, java.text.SimpleDateFormat r7) {
            java.lang.String r7 = r7.toPattern()
            int r0 = com.google.android.material.R.string.mtrl_picker_text_input_year_abbr
            java.lang.String r0 = r6.getString(r0)
            int r1 = com.google.android.material.R.string.mtrl_picker_text_input_month_abbr
            java.lang.String r1 = r6.getString(r1)
            int r2 = com.google.android.material.R.string.mtrl_picker_text_input_day_abbr
            java.lang.String r6 = r6.getString(r2)
            java.util.Locale r2 = java.util.Locale.getDefault()
            java.lang.String r2 = r2.getLanguage()
            java.util.Locale r3 = java.util.Locale.KOREAN
            java.lang.String r3 = r3.getLanguage()
            boolean r2 = r2.equals(r3)
            java.lang.String r3 = "y"
            java.lang.String r4 = "M"
            java.lang.String r5 = "d"
            if (r2 == 0) goto L42
            java.lang.String r2 = "d+"
            java.lang.String r7 = r7.replaceAll(r2, r5)
            java.lang.String r2 = "M+"
            java.lang.String r7 = r7.replaceAll(r2, r4)
            java.lang.String r2 = "y+"
            java.lang.String r7 = r7.replaceAll(r2, r3)
        L42:
            java.lang.String r6 = r7.replace(r5, r6)
            java.lang.String r6 = r6.replace(r4, r1)
            java.lang.String r6 = r6.replace(r3, r0)
            return r6
    }

    private static java.text.DateFormat getFormat(int r0, java.util.Locale r1) {
            java.text.DateFormat r0 = java.text.DateFormat.getDateInstance(r0, r1)
            java.util.TimeZone r1 = getTimeZone()
            r0.setTimeZone(r1)
            return r0
    }

    static java.text.DateFormat getFullFormat() {
            java.util.Locale r0 = java.util.Locale.getDefault()
            java.text.DateFormat r0 = getFullFormat(r0)
            return r0
    }

    static java.text.DateFormat getFullFormat(java.util.Locale r1) {
            r0 = 0
            java.text.DateFormat r1 = getFormat(r0, r1)
            return r1
    }

    static java.text.DateFormat getMediumFormat() {
            java.util.Locale r0 = java.util.Locale.getDefault()
            java.text.DateFormat r0 = getMediumFormat(r0)
            return r0
    }

    static java.text.DateFormat getMediumFormat(java.util.Locale r1) {
            r0 = 2
            java.text.DateFormat r1 = getFormat(r0, r1)
            return r1
    }

    static java.text.DateFormat getMediumNoYear() {
            java.util.Locale r0 = java.util.Locale.getDefault()
            java.text.DateFormat r0 = getMediumNoYear(r0)
            return r0
    }

    static java.text.DateFormat getMediumNoYear(java.util.Locale r1) {
            java.text.DateFormat r1 = getMediumFormat(r1)
            java.text.SimpleDateFormat r1 = (java.text.SimpleDateFormat) r1
            java.lang.String r0 = r1.toPattern()
            java.lang.String r0 = removeYearFromDateFormatPattern(r0)
            r1.applyPattern(r0)
            return r1
    }

    static android.icu.text.DateFormat getMonthWeekdayDayFormat(java.util.Locale r1) {
            java.lang.String r0 = "MMMMEEEEd"
            android.icu.text.DateFormat r1 = getAndroidFormat(r0, r1)
            return r1
    }

    static java.text.DateFormat getNormalizedFormat(java.text.DateFormat r1) {
            java.lang.Object r1 = r1.clone()
            java.text.DateFormat r1 = (java.text.DateFormat) r1
            java.util.TimeZone r0 = getTimeZone()
            r1.setTimeZone(r0)
            return r1
    }

    static java.text.SimpleDateFormat getSimpleFormat(java.lang.String r1) {
            java.util.Locale r0 = java.util.Locale.getDefault()
            java.text.SimpleDateFormat r1 = getSimpleFormat(r1, r0)
            return r1
    }

    private static java.text.SimpleDateFormat getSimpleFormat(java.lang.String r1, java.util.Locale r2) {
            java.text.SimpleDateFormat r0 = new java.text.SimpleDateFormat
            r0.<init>(r1, r2)
            java.util.TimeZone r1 = getTimeZone()
            r0.setTimeZone(r1)
            return r0
    }

    static com.google.android.material.datepicker.TimeSource getTimeSource() {
            java.util.concurrent.atomic.AtomicReference<com.google.android.material.datepicker.TimeSource> r0 = com.google.android.material.datepicker.UtcDates.timeSourceRef
            java.lang.Object r0 = r0.get()
            com.google.android.material.datepicker.TimeSource r0 = (com.google.android.material.datepicker.TimeSource) r0
            if (r0 != 0) goto Le
            com.google.android.material.datepicker.TimeSource r0 = com.google.android.material.datepicker.TimeSource.system()
        Le:
            return r0
    }

    private static java.util.TimeZone getTimeZone() {
            java.lang.String r0 = "UTC"
            java.util.TimeZone r0 = java.util.TimeZone.getTimeZone(r0)
            return r0
    }

    static java.util.Calendar getTodayCalendar() {
            com.google.android.material.datepicker.TimeSource r0 = getTimeSource()
            java.util.Calendar r0 = r0.now()
            r1 = 11
            r2 = 0
            r0.set(r1, r2)
            r1 = 12
            r0.set(r1, r2)
            r1 = 13
            r0.set(r1, r2)
            r1 = 14
            r0.set(r1, r2)
            java.util.TimeZone r1 = getTimeZone()
            r0.setTimeZone(r1)
            return r0
    }

    private static android.icu.util.TimeZone getUtcAndroidTimeZone() {
            java.lang.String r0 = "UTC"
            android.icu.util.TimeZone r0 = android.icu.util.TimeZone.getTimeZone(r0)
            return r0
    }

    static java.util.Calendar getUtcCalendar() {
            r0 = 0
            java.util.Calendar r0 = getUtcCalendarOf(r0)
            return r0
    }

    static java.util.Calendar getUtcCalendarOf(java.util.Calendar r3) {
            java.util.TimeZone r0 = getTimeZone()
            java.util.Calendar r0 = java.util.Calendar.getInstance(r0)
            if (r3 != 0) goto Le
            r0.clear()
            goto L15
        Le:
            long r1 = r3.getTimeInMillis()
            r0.setTimeInMillis(r1)
        L15:
            return r0
    }

    static android.icu.text.DateFormat getYearAbbrMonthDayFormat(java.util.Locale r1) {
            java.lang.String r0 = "yMMMd"
            android.icu.text.DateFormat r1 = getAndroidFormat(r0, r1)
            return r1
    }

    static android.icu.text.DateFormat getYearMonthFormat(java.util.Locale r1) {
            java.lang.String r0 = "yMMMM"
            android.icu.text.DateFormat r1 = getAndroidFormat(r0, r1)
            return r1
    }

    static android.icu.text.DateFormat getYearMonthWeekdayDayFormat(java.util.Locale r1) {
            java.lang.String r0 = "yMMMMEEEEd"
            android.icu.text.DateFormat r1 = getAndroidFormat(r0, r1)
            return r1
    }

    private static java.lang.String removeYearFromDateFormatPattern(java.lang.String r5) {
            r0 = 0
            java.lang.String r1 = "yY"
            r2 = 1
            int r0 = findCharactersInDateFormatPattern(r5, r1, r2, r0)
            int r1 = r5.length()
            if (r0 < r1) goto Lf
            return r5
        Lf:
            java.lang.String r1 = "EMd"
            int r3 = findCharactersInDateFormatPattern(r5, r1, r2, r0)
            int r4 = r5.length()
            if (r3 >= r4) goto L1d
            java.lang.String r1 = "EMd,"
        L1d:
            r4 = -1
            int r0 = findCharactersInDateFormatPattern(r5, r1, r4, r0)
            int r0 = r0 + r2
            java.lang.String r0 = r5.substring(r0, r3)
            java.lang.String r1 = " "
            java.lang.String r5 = r5.replace(r0, r1)
            java.lang.String r5 = r5.trim()
            return r5
    }

    static void setTimeSource(com.google.android.material.datepicker.TimeSource r1) {
            java.util.concurrent.atomic.AtomicReference<com.google.android.material.datepicker.TimeSource> r0 = com.google.android.material.datepicker.UtcDates.timeSourceRef
            r0.set(r1)
            return
    }
}
