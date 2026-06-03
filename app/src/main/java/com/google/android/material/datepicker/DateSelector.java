package com.google.android.material.datepicker;

/* JADX INFO: loaded from: classes.dex */
public interface DateSelector<S> extends android.os.Parcelable {
    static /* synthetic */ void lambda$showKeyboardWithAutoHideBehavior$0(android.widget.EditText[] r3, android.view.View r4, boolean r5) {
            int r5 = r3.length
            r0 = 0
            r1 = r0
        L3:
            if (r1 >= r5) goto L11
            r2 = r3[r1]
            boolean r2 = r2.hasFocus()
            if (r2 == 0) goto Le
            return
        Le:
            int r1 = r1 + 1
            goto L3
        L11:
            com.google.android.material.internal.ViewUtils.hideKeyboard(r4, r0)
            return
    }

    static /* synthetic */ void lambda$showKeyboardWithAutoHideBehavior$1(android.view.View r1) {
            r0 = 0
            com.google.android.material.internal.ViewUtils.requestFocusAndShowKeyboard(r1, r0)
            return
    }

    static void showKeyboardWithAutoHideBehavior(android.widget.EditText... r5) {
            int r0 = r5.length
            if (r0 != 0) goto L4
            return
        L4:
            com.google.android.material.datepicker.DateSelector$$ExternalSyntheticLambda0 r0 = new com.google.android.material.datepicker.DateSelector$$ExternalSyntheticLambda0
            r0.<init>(r5)
            int r1 = r5.length
            r2 = 0
            r3 = r2
        Lc:
            if (r3 >= r1) goto L16
            r4 = r5[r3]
            r4.setOnFocusChangeListener(r0)
            int r3 = r3 + 1
            goto Lc
        L16:
            r5 = r5[r2]
            com.google.android.material.datepicker.DateSelector$$ExternalSyntheticLambda1 r0 = new com.google.android.material.datepicker.DateSelector$$ExternalSyntheticLambda1
            r0.<init>(r5)
            r1 = 100
            r5.postDelayed(r0, r1)
            return
    }

    int getDefaultThemeResId(android.content.Context r1);

    int getDefaultTitleResId();

    java.lang.String getError();

    java.util.Collection<java.lang.Long> getSelectedDays();

    java.util.Collection<androidx.core.util.Pair<java.lang.Long, java.lang.Long>> getSelectedRanges();

    S getSelection();

    java.lang.String getSelectionContentDescription(android.content.Context r1);

    java.lang.String getSelectionDisplayString(android.content.Context r1);

    boolean isSelectionComplete();

    android.view.View onCreateTextInputView(android.view.LayoutInflater r1, android.view.ViewGroup r2, android.os.Bundle r3, com.google.android.material.datepicker.CalendarConstraints r4, com.google.android.material.datepicker.OnSelectionChangedListener<S> r5);

    void select(long r1);

    void setSelection(S r1);

    void setTextInputFormat(java.text.SimpleDateFormat r1);
}
