package com.google.android.material.datepicker;

/* JADX INFO: loaded from: classes.dex */
abstract class DateFormatTextWatcher extends com.google.android.material.internal.TextWatcherAdapter {
    private final com.google.android.material.datepicker.CalendarConstraints constraints;
    private final java.text.DateFormat dateFormat;
    private final java.lang.String formatHint;
    private int lastLength;
    private final java.lang.String outOfRange;
    private final java.lang.Runnable setErrorCallback;
    private java.lang.Runnable setRangeErrorCallback;
    private final com.google.android.material.textfield.TextInputLayout textInputLayout;

    DateFormatTextWatcher(java.lang.String r2, java.text.DateFormat r3, com.google.android.material.textfield.TextInputLayout r4, com.google.android.material.datepicker.CalendarConstraints r5) {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.lastLength = r0
            r1.formatHint = r2
            r1.dateFormat = r3
            r1.textInputLayout = r4
            r1.constraints = r5
            android.content.Context r3 = r4.getContext()
            int r4 = com.google.android.material.R.string.mtrl_picker_out_of_range
            java.lang.String r3 = r3.getString(r4)
            r1.outOfRange = r3
            com.google.android.material.datepicker.DateFormatTextWatcher$$ExternalSyntheticLambda0 r3 = new com.google.android.material.datepicker.DateFormatTextWatcher$$ExternalSyntheticLambda0
            r3.<init>(r1, r2)
            r1.setErrorCallback = r3
            return
    }

    private java.lang.Runnable createRangeErrorCallback(long r2) {
            r1 = this;
            com.google.android.material.datepicker.DateFormatTextWatcher$$ExternalSyntheticLambda1 r0 = new com.google.android.material.datepicker.DateFormatTextWatcher$$ExternalSyntheticLambda1
            r0.<init>(r1, r2)
            return r0
    }

    private java.lang.String sanitizeDateString(java.lang.String r3) {
            r2 = this;
            r0 = 32
            r1 = 160(0xa0, float:2.24E-43)
            java.lang.String r3 = r3.replace(r0, r1)
            return r3
    }

    @Override // com.google.android.material.internal.TextWatcherAdapter, android.text.TextWatcher
    public void afterTextChanged(android.text.Editable r3) {
            r2 = this;
            java.util.Locale r0 = java.util.Locale.getDefault()
            java.lang.String r0 = r0.getLanguage()
            java.util.Locale r1 = java.util.Locale.KOREAN
            java.lang.String r1 = r1.getLanguage()
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L15
            return
        L15:
            int r0 = r3.length()
            if (r0 == 0) goto L43
            int r0 = r3.length()
            java.lang.String r1 = r2.formatHint
            int r1 = r1.length()
            if (r0 >= r1) goto L43
            int r0 = r3.length()
            int r1 = r2.lastLength
            if (r0 >= r1) goto L30
            goto L43
        L30:
            java.lang.String r0 = r2.formatHint
            int r1 = r3.length()
            char r0 = r0.charAt(r1)
            boolean r1 = java.lang.Character.isLetterOrDigit(r0)
            if (r1 != 0) goto L43
            r3.append(r0)
        L43:
            return
    }

    @Override // com.google.android.material.internal.TextWatcherAdapter, android.text.TextWatcher
    public void beforeTextChanged(java.lang.CharSequence r1, int r2, int r3, int r4) {
            r0 = this;
            int r1 = r1.length()
            r0.lastLength = r1
            return
    }

    /* JADX INFO: renamed from: lambda$createRangeErrorCallback$1$com-google-android-material-datepicker-DateFormatTextWatcher, reason: not valid java name */
    /* synthetic */ void m657x14d77527(long r2) {
            r1 = this;
            java.lang.String r2 = com.google.android.material.datepicker.DateStrings.getDateString(r2)
            com.google.android.material.textfield.TextInputLayout r3 = r1.textInputLayout
            java.lang.String r0 = r1.outOfRange
            java.lang.String r2 = r1.sanitizeDateString(r2)
            java.lang.Object[] r2 = new java.lang.Object[]{r2}
            java.lang.String r2 = java.lang.String.format(r0, r2)
            r3.setError(r2)
            r1.onInvalidDate()
            return
    }

    /* JADX INFO: renamed from: lambda$new$0$com-google-android-material-datepicker-DateFormatTextWatcher, reason: not valid java name */
    /* synthetic */ void m658x5657fb8e(java.lang.String r8) {
            r7 = this;
            com.google.android.material.textfield.TextInputLayout r0 = r7.textInputLayout
            java.text.DateFormat r1 = r7.dateFormat
            android.content.Context r2 = r0.getContext()
            int r3 = com.google.android.material.R.string.mtrl_picker_invalid_format
            java.lang.String r3 = r2.getString(r3)
            int r4 = com.google.android.material.R.string.mtrl_picker_invalid_format_use
            java.lang.String r4 = r2.getString(r4)
            java.lang.String r8 = r7.sanitizeDateString(r8)
            java.lang.Object[] r8 = new java.lang.Object[]{r8}
            java.lang.String r8 = java.lang.String.format(r4, r8)
            int r4 = com.google.android.material.R.string.mtrl_picker_invalid_format_example
            java.lang.String r2 = r2.getString(r4)
            java.util.Date r4 = new java.util.Date
            java.util.Calendar r5 = com.google.android.material.datepicker.UtcDates.getTodayCalendar()
            long r5 = r5.getTimeInMillis()
            r4.<init>(r5)
            java.lang.String r1 = r1.format(r4)
            java.lang.String r1 = r7.sanitizeDateString(r1)
            java.lang.Object[] r1 = new java.lang.Object[]{r1}
            java.lang.String r1 = java.lang.String.format(r2, r1)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r3 = "\n"
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.StringBuilder r8 = r2.append(r8)
            java.lang.StringBuilder r8 = r8.append(r3)
            java.lang.StringBuilder r8 = r8.append(r1)
            java.lang.String r8 = r8.toString()
            r0.setError(r8)
            r7.onInvalidDate()
            return
    }

    void onInvalidDate() {
            r0 = this;
            return
    }

    @Override // com.google.android.material.internal.TextWatcherAdapter, android.text.TextWatcher
    public void onTextChanged(java.lang.CharSequence r1, int r2, int r3, int r4) {
            r0 = this;
            com.google.android.material.textfield.TextInputLayout r2 = r0.textInputLayout
            java.lang.Runnable r3 = r0.setErrorCallback
            r2.removeCallbacks(r3)
            com.google.android.material.textfield.TextInputLayout r2 = r0.textInputLayout
            java.lang.Runnable r3 = r0.setRangeErrorCallback
            r2.removeCallbacks(r3)
            com.google.android.material.textfield.TextInputLayout r2 = r0.textInputLayout
            r3 = 0
            r2.setError(r3)
            r0.onValidDate(r3)
            boolean r2 = android.text.TextUtils.isEmpty(r1)
            if (r2 != 0) goto L70
            int r2 = r1.length()
            java.lang.String r4 = r0.formatHint
            int r4 = r4.length()
            if (r2 >= r4) goto L2a
            goto L70
        L2a:
            java.text.DateFormat r2 = r0.dateFormat     // Catch: java.text.ParseException -> L69
            java.lang.String r1 = r1.toString()     // Catch: java.text.ParseException -> L69
            java.util.Date r1 = r2.parse(r1)     // Catch: java.text.ParseException -> L69
            com.google.android.material.textfield.TextInputLayout r2 = r0.textInputLayout     // Catch: java.text.ParseException -> L69
            r2.setError(r3)     // Catch: java.text.ParseException -> L69
            long r2 = r1.getTime()     // Catch: java.text.ParseException -> L69
            com.google.android.material.datepicker.CalendarConstraints r4 = r0.constraints     // Catch: java.text.ParseException -> L69
            com.google.android.material.datepicker.CalendarConstraints$DateValidator r4 = r4.getDateValidator()     // Catch: java.text.ParseException -> L69
            boolean r4 = r4.isValid(r2)     // Catch: java.text.ParseException -> L69
            if (r4 == 0) goto L5d
            com.google.android.material.datepicker.CalendarConstraints r4 = r0.constraints     // Catch: java.text.ParseException -> L69
            boolean r4 = r4.isWithinBounds(r2)     // Catch: java.text.ParseException -> L69
            if (r4 == 0) goto L5d
            long r1 = r1.getTime()     // Catch: java.text.ParseException -> L69
            java.lang.Long r1 = java.lang.Long.valueOf(r1)     // Catch: java.text.ParseException -> L69
            r0.onValidDate(r1)     // Catch: java.text.ParseException -> L69
            return
        L5d:
            java.lang.Runnable r1 = r0.createRangeErrorCallback(r2)     // Catch: java.text.ParseException -> L69
            r0.setRangeErrorCallback = r1     // Catch: java.text.ParseException -> L69
            com.google.android.material.textfield.TextInputLayout r2 = r0.textInputLayout     // Catch: java.text.ParseException -> L69
            r0.runValidation(r2, r1)     // Catch: java.text.ParseException -> L69
            goto L70
        L69:
            com.google.android.material.textfield.TextInputLayout r1 = r0.textInputLayout
            java.lang.Runnable r2 = r0.setErrorCallback
            r0.runValidation(r1, r2)
        L70:
            return
    }

    abstract void onValidDate(java.lang.Long r1);

    public void runValidation(android.view.View r1, java.lang.Runnable r2) {
            r0 = this;
            r1.post(r2)
            return
    }
}
