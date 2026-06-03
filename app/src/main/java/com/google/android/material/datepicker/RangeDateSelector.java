package com.google.android.material.datepicker;

/* JADX INFO: loaded from: classes.dex */
public class RangeDateSelector implements com.google.android.material.datepicker.DateSelector<androidx.core.util.Pair<java.lang.Long, java.lang.Long>> {
    public static final android.os.Parcelable.Creator<com.google.android.material.datepicker.RangeDateSelector> CREATOR = null;
    private java.lang.CharSequence error;
    private final java.lang.String invalidRangeEndError;
    private java.lang.String invalidRangeStartError;
    private java.lang.Long proposedTextEnd;
    private java.lang.Long proposedTextStart;
    private java.lang.Long selectedEndItem;
    private java.lang.Long selectedStartItem;
    private java.text.SimpleDateFormat textInputFormat;




    static {
            com.google.android.material.datepicker.RangeDateSelector$3 r0 = new com.google.android.material.datepicker.RangeDateSelector$3
            r0.<init>()
            com.google.android.material.datepicker.RangeDateSelector.CREATOR = r0
            return
    }

    public RangeDateSelector() {
            r1 = this;
            r1.<init>()
            java.lang.String r0 = " "
            r1.invalidRangeEndError = r0
            r0 = 0
            r1.selectedStartItem = r0
            r1.selectedEndItem = r0
            r1.proposedTextStart = r0
            r1.proposedTextEnd = r0
            return
    }

    static /* synthetic */ java.lang.Long access$002(com.google.android.material.datepicker.RangeDateSelector r0, java.lang.Long r1) {
            r0.proposedTextStart = r1
            return r1
    }

    static /* synthetic */ void access$100(com.google.android.material.datepicker.RangeDateSelector r0, com.google.android.material.textfield.TextInputLayout r1, com.google.android.material.textfield.TextInputLayout r2, com.google.android.material.datepicker.OnSelectionChangedListener r3) {
            r0.updateIfValidTextProposal(r1, r2, r3)
            return
    }

    static /* synthetic */ java.lang.Long access$202(com.google.android.material.datepicker.RangeDateSelector r0, java.lang.Long r1) {
            r0.proposedTextEnd = r1
            return r1
    }

    static /* synthetic */ java.lang.Long access$302(com.google.android.material.datepicker.RangeDateSelector r0, java.lang.Long r1) {
            r0.selectedStartItem = r1
            return r1
    }

    static /* synthetic */ java.lang.Long access$402(com.google.android.material.datepicker.RangeDateSelector r0, java.lang.Long r1) {
            r0.selectedEndItem = r1
            return r1
    }

    private void clearInvalidRange(com.google.android.material.textfield.TextInputLayout r4, com.google.android.material.textfield.TextInputLayout r5) {
            r3 = this;
            java.lang.CharSequence r0 = r4.getError()
            r1 = 0
            if (r0 == 0) goto L16
            java.lang.String r0 = r3.invalidRangeStartError
            java.lang.CharSequence r2 = r4.getError()
            boolean r0 = r0.contentEquals(r2)
            if (r0 == 0) goto L16
            r4.setError(r1)
        L16:
            java.lang.CharSequence r4 = r5.getError()
            if (r4 == 0) goto L2b
            java.lang.String r4 = " "
            java.lang.CharSequence r0 = r5.getError()
            boolean r4 = r4.contentEquals(r0)
            if (r4 == 0) goto L2b
            r5.setError(r1)
        L2b:
            return
    }

    private boolean isValidRange(long r1, long r3) {
            r0 = this;
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 > 0) goto L6
            r1 = 1
            goto L7
        L6:
            r1 = 0
        L7:
            return r1
    }

    private void setInvalidRange(com.google.android.material.textfield.TextInputLayout r2, com.google.android.material.textfield.TextInputLayout r3) {
            r1 = this;
            java.lang.String r0 = r1.invalidRangeStartError
            r2.setError(r0)
            java.lang.String r2 = " "
            r3.setError(r2)
            return
    }

    private void updateError(com.google.android.material.textfield.TextInputLayout r2, com.google.android.material.textfield.TextInputLayout r3) {
            r1 = this;
            java.lang.CharSequence r0 = r2.getError()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L11
            java.lang.CharSequence r2 = r2.getError()
            r1.error = r2
            goto L25
        L11:
            java.lang.CharSequence r2 = r3.getError()
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            if (r2 != 0) goto L22
            java.lang.CharSequence r2 = r3.getError()
            r1.error = r2
            goto L25
        L22:
            r2 = 0
            r1.error = r2
        L25:
            return
    }

    private void updateIfValidTextProposal(com.google.android.material.textfield.TextInputLayout r5, com.google.android.material.textfield.TextInputLayout r6, com.google.android.material.datepicker.OnSelectionChangedListener<androidx.core.util.Pair<java.lang.Long, java.lang.Long>> r7) {
            r4 = this;
            java.lang.Long r0 = r4.proposedTextStart
            if (r0 == 0) goto L30
            java.lang.Long r1 = r4.proposedTextEnd
            if (r1 != 0) goto L9
            goto L30
        L9:
            long r0 = r0.longValue()
            java.lang.Long r2 = r4.proposedTextEnd
            long r2 = r2.longValue()
            boolean r0 = r4.isValidRange(r0, r2)
            if (r0 == 0) goto L29
            java.lang.Long r0 = r4.proposedTextStart
            r4.selectedStartItem = r0
            java.lang.Long r0 = r4.proposedTextEnd
            r4.selectedEndItem = r0
            androidx.core.util.Pair r0 = r4.getSelection()
            r7.onSelectionChanged(r0)
            goto L36
        L29:
            r4.setInvalidRange(r5, r6)
            r7.onIncompleteSelectionChanged()
            goto L36
        L30:
            r4.clearInvalidRange(r5, r6)
            r7.onIncompleteSelectionChanged()
        L36:
            r4.updateError(r5, r6)
            return
    }

    public int describeContents() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // com.google.android.material.datepicker.DateSelector
    public int getDefaultThemeResId(android.content.Context r4) {
            r3 = this;
            android.content.res.Resources r0 = r4.getResources()
            android.util.DisplayMetrics r1 = r0.getDisplayMetrics()
            int r2 = com.google.android.material.R.dimen.mtrl_calendar_maximum_default_fullscreen_minor_axis
            int r0 = r0.getDimensionPixelSize(r2)
            int r2 = r1.widthPixels
            int r1 = r1.heightPixels
            int r1 = java.lang.Math.min(r2, r1)
            if (r1 <= r0) goto L1b
            int r0 = com.google.android.material.R.attr.materialCalendarTheme
            goto L1d
        L1b:
            int r0 = com.google.android.material.R.attr.materialCalendarFullscreenTheme
        L1d:
            java.lang.Class<com.google.android.material.datepicker.MaterialDatePicker> r1 = com.google.android.material.datepicker.MaterialDatePicker.class
            java.lang.String r1 = r1.getCanonicalName()
            int r4 = com.google.android.material.resources.MaterialAttributes.resolveOrThrow(r4, r0, r1)
            return r4
    }

    @Override // com.google.android.material.datepicker.DateSelector
    public int getDefaultTitleResId() {
            r1 = this;
            int r0 = com.google.android.material.R.string.mtrl_picker_range_header_title
            return r0
    }

    @Override // com.google.android.material.datepicker.DateSelector
    public java.lang.String getError() {
            r1 = this;
            java.lang.CharSequence r0 = r1.error
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto La
            r0 = 0
            goto L10
        La:
            java.lang.CharSequence r0 = r1.error
            java.lang.String r0 = r0.toString()
        L10:
            return r0
    }

    @Override // com.google.android.material.datepicker.DateSelector
    public java.util.Collection<java.lang.Long> getSelectedDays() {
            r2 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.lang.Long r1 = r2.selectedStartItem
            if (r1 == 0) goto Lc
            r0.add(r1)
        Lc:
            java.lang.Long r1 = r2.selectedEndItem
            if (r1 == 0) goto L13
            r0.add(r1)
        L13:
            return r0
    }

    @Override // com.google.android.material.datepicker.DateSelector
    public java.util.Collection<androidx.core.util.Pair<java.lang.Long, java.lang.Long>> getSelectedRanges() {
            r4 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            androidx.core.util.Pair r1 = new androidx.core.util.Pair
            java.lang.Long r2 = r4.selectedStartItem
            java.lang.Long r3 = r4.selectedEndItem
            r1.<init>(r2, r3)
            r0.add(r1)
            return r0
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.google.android.material.datepicker.DateSelector
    public androidx.core.util.Pair<java.lang.Long, java.lang.Long> getSelection() {
            r3 = this;
            androidx.core.util.Pair r0 = new androidx.core.util.Pair
            java.lang.Long r1 = r3.selectedStartItem
            java.lang.Long r2 = r3.selectedEndItem
            r0.<init>(r1, r2)
            return r0
    }

    @Override // com.google.android.material.datepicker.DateSelector
    public /* bridge */ /* synthetic */ androidx.core.util.Pair<java.lang.Long, java.lang.Long> getSelection() {
            r1 = this;
            androidx.core.util.Pair r0 = r1.getSelection()
            return r0
    }

    @Override // com.google.android.material.datepicker.DateSelector
    public java.lang.String getSelectionContentDescription(android.content.Context r4) {
            r3 = this;
            android.content.res.Resources r4 = r4.getResources()
            java.lang.Long r0 = r3.selectedStartItem
            java.lang.Long r1 = r3.selectedEndItem
            androidx.core.util.Pair r0 = com.google.android.material.datepicker.DateStrings.getDateRangeString(r0, r1)
            F r1 = r0.first
            if (r1 != 0) goto L17
            int r1 = com.google.android.material.R.string.mtrl_picker_announce_current_selection_none
            java.lang.String r1 = r4.getString(r1)
            goto L1b
        L17:
            F r1 = r0.first
            java.lang.String r1 = (java.lang.String) r1
        L1b:
            S r2 = r0.second
            if (r2 != 0) goto L26
            int r0 = com.google.android.material.R.string.mtrl_picker_announce_current_selection_none
            java.lang.String r0 = r4.getString(r0)
            goto L2a
        L26:
            S r0 = r0.second
            java.lang.String r0 = (java.lang.String) r0
        L2a:
            int r2 = com.google.android.material.R.string.mtrl_picker_announce_current_range_selection
            java.lang.Object[] r0 = new java.lang.Object[]{r1, r0}
            java.lang.String r4 = r4.getString(r2, r0)
            return r4
    }

    @Override // com.google.android.material.datepicker.DateSelector
    public java.lang.String getSelectionDisplayString(android.content.Context r4) {
            r3 = this;
            android.content.res.Resources r4 = r4.getResources()
            java.lang.Long r0 = r3.selectedStartItem
            if (r0 != 0) goto L13
            java.lang.Long r1 = r3.selectedEndItem
            if (r1 != 0) goto L13
            int r0 = com.google.android.material.R.string.mtrl_picker_range_header_unselected
            java.lang.String r4 = r4.getString(r0)
            return r4
        L13:
            java.lang.Long r1 = r3.selectedEndItem
            if (r1 != 0) goto L2c
            int r0 = com.google.android.material.R.string.mtrl_picker_range_header_only_start_selected
            java.lang.Long r1 = r3.selectedStartItem
            long r1 = r1.longValue()
            java.lang.String r1 = com.google.android.material.datepicker.DateStrings.getDateString(r1)
            java.lang.Object[] r1 = new java.lang.Object[]{r1}
            java.lang.String r4 = r4.getString(r0, r1)
            return r4
        L2c:
            if (r0 != 0) goto L43
            int r0 = com.google.android.material.R.string.mtrl_picker_range_header_only_end_selected
            java.lang.Long r1 = r3.selectedEndItem
            long r1 = r1.longValue()
            java.lang.String r1 = com.google.android.material.datepicker.DateStrings.getDateString(r1)
            java.lang.Object[] r1 = new java.lang.Object[]{r1}
            java.lang.String r4 = r4.getString(r0, r1)
            return r4
        L43:
            androidx.core.util.Pair r0 = com.google.android.material.datepicker.DateStrings.getDateRangeString(r0, r1)
            int r1 = com.google.android.material.R.string.mtrl_picker_range_header_selected
            F r2 = r0.first
            S r0 = r0.second
            java.lang.Object[] r0 = new java.lang.Object[]{r2, r0}
            java.lang.String r4 = r4.getString(r1, r0)
            return r4
    }

    @Override // com.google.android.material.datepicker.DateSelector
    public boolean isSelectionComplete() {
            r4 = this;
            java.lang.Long r0 = r4.selectedStartItem
            if (r0 == 0) goto L1a
            java.lang.Long r1 = r4.selectedEndItem
            if (r1 == 0) goto L1a
            long r0 = r0.longValue()
            java.lang.Long r2 = r4.selectedEndItem
            long r2 = r2.longValue()
            boolean r0 = r4.isValidRange(r0, r2)
            if (r0 == 0) goto L1a
            r0 = 1
            goto L1b
        L1a:
            r0 = 0
        L1b:
            return r0
    }

    @Override // com.google.android.material.datepicker.DateSelector
    public android.view.View onCreateTextInputView(android.view.LayoutInflater r20, android.view.ViewGroup r21, android.os.Bundle r22, com.google.android.material.datepicker.CalendarConstraints r23, com.google.android.material.datepicker.OnSelectionChangedListener<androidx.core.util.Pair<java.lang.Long, java.lang.Long>> r24) {
            r19 = this;
            r9 = r19
            int r0 = com.google.android.material.R.layout.mtrl_picker_text_input_date_range
            r10 = 0
            r1 = r20
            r2 = r21
            android.view.View r11 = r1.inflate(r0, r2, r10)
            int r0 = com.google.android.material.R.id.mtrl_picker_text_input_range_start
            android.view.View r0 = r11.findViewById(r0)
            r12 = r0
            com.google.android.material.textfield.TextInputLayout r12 = (com.google.android.material.textfield.TextInputLayout) r12
            int r0 = com.google.android.material.R.id.mtrl_picker_text_input_range_end
            android.view.View r0 = r11.findViewById(r0)
            r13 = r0
            com.google.android.material.textfield.TextInputLayout r13 = (com.google.android.material.textfield.TextInputLayout) r13
            android.widget.EditText r14 = r12.getEditText()
            android.widget.EditText r15 = r13.getEditText()
            boolean r0 = com.google.android.material.internal.ManufacturerUtils.isDateInputKeyboardMissingSeparatorCharacters()
            if (r0 == 0) goto L35
            r0 = 17
            r14.setInputType(r0)
            r15.setInputType(r0)
        L35:
            android.content.res.Resources r0 = r11.getResources()
            int r1 = com.google.android.material.R.string.mtrl_picker_invalid_range
            java.lang.String r0 = r0.getString(r1)
            r9.invalidRangeStartError = r0
            java.text.SimpleDateFormat r0 = r9.textInputFormat
            r16 = 1
            if (r0 == 0) goto L4a
            r1 = r16
            goto L4b
        L4a:
            r1 = r10
        L4b:
            if (r1 == 0) goto L4e
            goto L52
        L4e:
            java.text.SimpleDateFormat r0 = com.google.android.material.datepicker.UtcDates.getDefaultTextInputFormat()
        L52:
            r8 = r0
            java.lang.Long r0 = r9.selectedStartItem
            if (r0 == 0) goto L62
            java.lang.String r0 = r8.format(r0)
            r14.setText(r0)
            java.lang.Long r0 = r9.selectedStartItem
            r9.proposedTextStart = r0
        L62:
            java.lang.Long r0 = r9.selectedEndItem
            if (r0 == 0) goto L71
            java.lang.String r0 = r8.format(r0)
            r15.setText(r0)
            java.lang.Long r0 = r9.selectedEndItem
            r9.proposedTextEnd = r0
        L71:
            if (r1 == 0) goto L78
            java.lang.String r0 = r8.toPattern()
            goto L80
        L78:
            android.content.res.Resources r0 = r11.getResources()
            java.lang.String r0 = com.google.android.material.datepicker.UtcDates.getDefaultTextInputHint(r0, r8)
        L80:
            r7 = r0
            r12.setPlaceholderText(r7)
            r13.setPlaceholderText(r7)
            com.google.android.material.datepicker.RangeDateSelector$1 r6 = new com.google.android.material.datepicker.RangeDateSelector$1
            r0 = r6
            r1 = r19
            r2 = r7
            r3 = r8
            r4 = r12
            r5 = r23
            r10 = r6
            r6 = r12
            r17 = r7
            r7 = r13
            r18 = r8
            r8 = r24
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            r14.addTextChangedListener(r10)
            com.google.android.material.datepicker.RangeDateSelector$2 r10 = new com.google.android.material.datepicker.RangeDateSelector$2
            r0 = r10
            r2 = r17
            r3 = r18
            r4 = r13
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            r15.addTextChangedListener(r10)
            r0 = 2
            android.widget.EditText[] r0 = new android.widget.EditText[r0]
            r1 = 0
            r0[r1] = r14
            r0[r16] = r15
            com.google.android.material.datepicker.DateSelector.showKeyboardWithAutoHideBehavior(r0)
            return r11
    }

    @Override // com.google.android.material.datepicker.DateSelector
    public void select(long r3) {
            r2 = this;
            java.lang.Long r0 = r2.selectedStartItem
            if (r0 != 0) goto Lb
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            r2.selectedStartItem = r3
            goto L29
        Lb:
            java.lang.Long r1 = r2.selectedEndItem
            if (r1 != 0) goto L20
            long r0 = r0.longValue()
            boolean r0 = r2.isValidRange(r0, r3)
            if (r0 == 0) goto L20
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            r2.selectedEndItem = r3
            goto L29
        L20:
            r0 = 0
            r2.selectedEndItem = r0
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            r2.selectedStartItem = r3
        L29:
            return
    }

    /* JADX INFO: renamed from: setSelection, reason: avoid collision after fix types in other method */
    public void setSelection2(androidx.core.util.Pair<java.lang.Long, java.lang.Long> r5) {
            r4 = this;
            F r0 = r5.first
            if (r0 == 0) goto L1f
            S r0 = r5.second
            if (r0 == 0) goto L1f
            F r0 = r5.first
            java.lang.Long r0 = (java.lang.Long) r0
            long r0 = r0.longValue()
            S r2 = r5.second
            java.lang.Long r2 = (java.lang.Long) r2
            long r2 = r2.longValue()
            boolean r0 = r4.isValidRange(r0, r2)
            androidx.core.util.Preconditions.checkArgument(r0)
        L1f:
            F r0 = r5.first
            r1 = 0
            if (r0 != 0) goto L26
            r0 = r1
            goto L36
        L26:
            F r0 = r5.first
            java.lang.Long r0 = (java.lang.Long) r0
            long r2 = r0.longValue()
            long r2 = com.google.android.material.datepicker.UtcDates.canonicalYearMonthDay(r2)
            java.lang.Long r0 = java.lang.Long.valueOf(r2)
        L36:
            r4.selectedStartItem = r0
            S r0 = r5.second
            if (r0 != 0) goto L3d
            goto L4d
        L3d:
            S r5 = r5.second
            java.lang.Long r5 = (java.lang.Long) r5
            long r0 = r5.longValue()
            long r0 = com.google.android.material.datepicker.UtcDates.canonicalYearMonthDay(r0)
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
        L4d:
            r4.selectedEndItem = r1
            return
    }

    @Override // com.google.android.material.datepicker.DateSelector
    public /* bridge */ /* synthetic */ void setSelection(androidx.core.util.Pair<java.lang.Long, java.lang.Long> r1) {
            r0 = this;
            androidx.core.util.Pair r1 = (androidx.core.util.Pair) r1
            r0.setSelection2(r1)
            return
    }

    @Override // com.google.android.material.datepicker.DateSelector
    public void setTextInputFormat(java.text.SimpleDateFormat r1) {
            r0 = this;
            if (r1 == 0) goto L8
            java.text.DateFormat r1 = com.google.android.material.datepicker.UtcDates.getNormalizedFormat(r1)
            java.text.SimpleDateFormat r1 = (java.text.SimpleDateFormat) r1
        L8:
            r0.textInputFormat = r1
            return
    }

    public void writeToParcel(android.os.Parcel r1, int r2) {
            r0 = this;
            java.lang.Long r2 = r0.selectedStartItem
            r1.writeValue(r2)
            java.lang.Long r2 = r0.selectedEndItem
            r1.writeValue(r2)
            return
    }
}
