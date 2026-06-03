package com.google.android.material.datepicker;

/* JADX INFO: loaded from: classes.dex */
public class SingleDateSelector implements com.google.android.material.datepicker.DateSelector<java.lang.Long> {
    public static final android.os.Parcelable.Creator<com.google.android.material.datepicker.SingleDateSelector> CREATOR = null;
    private java.lang.CharSequence error;
    private java.lang.Long selectedItem;
    private java.text.SimpleDateFormat textInputFormat;



    static {
            com.google.android.material.datepicker.SingleDateSelector$2 r0 = new com.google.android.material.datepicker.SingleDateSelector$2
            r0.<init>()
            com.google.android.material.datepicker.SingleDateSelector.CREATOR = r0
            return
    }

    public SingleDateSelector() {
            r0 = this;
            r0.<init>()
            return
    }

    static /* synthetic */ void access$000(com.google.android.material.datepicker.SingleDateSelector r0) {
            r0.clearSelection()
            return
    }

    static /* synthetic */ java.lang.CharSequence access$102(com.google.android.material.datepicker.SingleDateSelector r0, java.lang.CharSequence r1) {
            r0.error = r1
            return r1
    }

    static /* synthetic */ java.lang.Long access$202(com.google.android.material.datepicker.SingleDateSelector r0, java.lang.Long r1) {
            r0.selectedItem = r1
            return r1
    }

    private void clearSelection() {
            r1 = this;
            r0 = 0
            r1.selectedItem = r0
            return
    }

    public int describeContents() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // com.google.android.material.datepicker.DateSelector
    public int getDefaultThemeResId(android.content.Context r3) {
            r2 = this;
            int r0 = com.google.android.material.R.attr.materialCalendarTheme
            java.lang.Class<com.google.android.material.datepicker.MaterialDatePicker> r1 = com.google.android.material.datepicker.MaterialDatePicker.class
            java.lang.String r1 = r1.getCanonicalName()
            int r3 = com.google.android.material.resources.MaterialAttributes.resolveOrThrow(r3, r0, r1)
            return r3
    }

    @Override // com.google.android.material.datepicker.DateSelector
    public int getDefaultTitleResId() {
            r1 = this;
            int r0 = com.google.android.material.R.string.mtrl_picker_date_header_title
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
            java.lang.Long r1 = r2.selectedItem
            if (r1 == 0) goto Lc
            r0.add(r1)
        Lc:
            return r0
    }

    @Override // com.google.android.material.datepicker.DateSelector
    public java.util.Collection<androidx.core.util.Pair<java.lang.Long, java.lang.Long>> getSelectedRanges() {
            r1 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            return r0
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.google.android.material.datepicker.DateSelector
    public java.lang.Long getSelection() {
            r1 = this;
            java.lang.Long r0 = r1.selectedItem
            return r0
    }

    @Override // com.google.android.material.datepicker.DateSelector
    public /* bridge */ /* synthetic */ java.lang.Long getSelection() {
            r1 = this;
            java.lang.Long r0 = r1.getSelection()
            return r0
    }

    @Override // com.google.android.material.datepicker.DateSelector
    public java.lang.String getSelectionContentDescription(android.content.Context r3) {
            r2 = this;
            android.content.res.Resources r3 = r3.getResources()
            java.lang.Long r0 = r2.selectedItem
            if (r0 != 0) goto Lf
            int r0 = com.google.android.material.R.string.mtrl_picker_announce_current_selection_none
            java.lang.String r0 = r3.getString(r0)
            goto L17
        Lf:
            long r0 = r0.longValue()
            java.lang.String r0 = com.google.android.material.datepicker.DateStrings.getYearMonthDay(r0)
        L17:
            int r1 = com.google.android.material.R.string.mtrl_picker_announce_current_selection
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            java.lang.String r3 = r3.getString(r1, r0)
            return r3
    }

    @Override // com.google.android.material.datepicker.DateSelector
    public java.lang.String getSelectionDisplayString(android.content.Context r3) {
            r2 = this;
            android.content.res.Resources r3 = r3.getResources()
            java.lang.Long r0 = r2.selectedItem
            if (r0 != 0) goto Lf
            int r0 = com.google.android.material.R.string.mtrl_picker_date_header_unselected
            java.lang.String r3 = r3.getString(r0)
            return r3
        Lf:
            long r0 = r0.longValue()
            java.lang.String r0 = com.google.android.material.datepicker.DateStrings.getYearMonthDay(r0)
            int r1 = com.google.android.material.R.string.mtrl_picker_date_header_selected
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            java.lang.String r3 = r3.getString(r1, r0)
            return r3
    }

    @Override // com.google.android.material.datepicker.DateSelector
    public boolean isSelectionComplete() {
            r1 = this;
            java.lang.Long r0 = r1.selectedItem
            if (r0 == 0) goto L6
            r0 = 1
            goto L7
        L6:
            r0 = 0
        L7:
            return r0
    }

    @Override // com.google.android.material.datepicker.DateSelector
    public android.view.View onCreateTextInputView(android.view.LayoutInflater r11, android.view.ViewGroup r12, android.os.Bundle r13, com.google.android.material.datepicker.CalendarConstraints r14, com.google.android.material.datepicker.OnSelectionChangedListener<java.lang.Long> r15) {
            r10 = this;
            int r13 = com.google.android.material.R.layout.mtrl_picker_text_input_date
            r0 = 0
            android.view.View r11 = r11.inflate(r13, r12, r0)
            int r12 = com.google.android.material.R.id.mtrl_picker_text_input_date
            android.view.View r12 = r11.findViewById(r12)
            r8 = r12
            com.google.android.material.textfield.TextInputLayout r8 = (com.google.android.material.textfield.TextInputLayout) r8
            android.widget.EditText r12 = r8.getEditText()
            boolean r13 = com.google.android.material.internal.ManufacturerUtils.isDateInputKeyboardMissingSeparatorCharacters()
            if (r13 == 0) goto L1f
            r13 = 17
            r12.setInputType(r13)
        L1f:
            java.text.SimpleDateFormat r13 = r10.textInputFormat
            r9 = 1
            if (r13 == 0) goto L26
            r1 = r9
            goto L27
        L26:
            r1 = r0
        L27:
            if (r1 == 0) goto L2a
            goto L2e
        L2a:
            java.text.SimpleDateFormat r13 = com.google.android.material.datepicker.UtcDates.getDefaultTextInputFormat()
        L2e:
            r4 = r13
            if (r1 == 0) goto L36
            java.lang.String r13 = r4.toPattern()
            goto L3e
        L36:
            android.content.res.Resources r13 = r11.getResources()
            java.lang.String r13 = com.google.android.material.datepicker.UtcDates.getDefaultTextInputHint(r13, r4)
        L3e:
            r3 = r13
            r8.setPlaceholderText(r3)
            java.lang.Long r13 = r10.selectedItem
            if (r13 == 0) goto L4d
            java.lang.String r13 = r4.format(r13)
            r12.setText(r13)
        L4d:
            com.google.android.material.datepicker.SingleDateSelector$1 r13 = new com.google.android.material.datepicker.SingleDateSelector$1
            r1 = r13
            r2 = r10
            r5 = r8
            r6 = r14
            r7 = r15
            r1.<init>(r2, r3, r4, r5, r6, r7, r8)
            r12.addTextChangedListener(r13)
            android.widget.EditText[] r13 = new android.widget.EditText[r9]
            r13[r0] = r12
            com.google.android.material.datepicker.DateSelector.showKeyboardWithAutoHideBehavior(r13)
            return r11
    }

    @Override // com.google.android.material.datepicker.DateSelector
    public void select(long r1) {
            r0 = this;
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            r0.selectedItem = r1
            return
    }

    /* JADX INFO: renamed from: setSelection, reason: avoid collision after fix types in other method */
    public void setSelection2(java.lang.Long r3) {
            r2 = this;
            if (r3 != 0) goto L4
            r3 = 0
            goto L10
        L4:
            long r0 = r3.longValue()
            long r0 = com.google.android.material.datepicker.UtcDates.canonicalYearMonthDay(r0)
            java.lang.Long r3 = java.lang.Long.valueOf(r0)
        L10:
            r2.selectedItem = r3
            return
    }

    @Override // com.google.android.material.datepicker.DateSelector
    public /* bridge */ /* synthetic */ void setSelection(java.lang.Long r1) {
            r0 = this;
            java.lang.Long r1 = (java.lang.Long) r1
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
            java.lang.Long r2 = r0.selectedItem
            r1.writeValue(r2)
            return
    }
}
