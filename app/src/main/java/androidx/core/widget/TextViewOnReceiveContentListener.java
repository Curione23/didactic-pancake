package androidx.core.widget;

/* JADX INFO: loaded from: classes.dex */
public final class TextViewOnReceiveContentListener implements androidx.core.view.OnReceiveContentListener {
    private static final java.lang.String LOG_TAG = "ReceiveContent";

    public TextViewOnReceiveContentListener() {
            r0 = this;
            r0.<init>()
            return
    }

    private static java.lang.CharSequence coerceToText(android.content.Context r0, android.content.ClipData.Item r1, int r2) {
            r2 = r2 & 1
            if (r2 == 0) goto L11
            java.lang.CharSequence r0 = r1.coerceToText(r0)
            boolean r1 = r0 instanceof android.text.Spanned
            if (r1 == 0) goto L10
            java.lang.String r0 = r0.toString()
        L10:
            return r0
        L11:
            java.lang.CharSequence r0 = r1.coerceToStyledText(r0)
            return r0
    }

    private static void replaceSelection(android.text.Editable r4, java.lang.CharSequence r5) {
            int r0 = android.text.Selection.getSelectionStart(r4)
            int r1 = android.text.Selection.getSelectionEnd(r4)
            int r2 = java.lang.Math.min(r0, r1)
            r3 = 0
            int r2 = java.lang.Math.max(r3, r2)
            int r0 = java.lang.Math.max(r0, r1)
            int r0 = java.lang.Math.max(r3, r0)
            android.text.Selection.setSelection(r4, r0)
            r4.replace(r2, r0, r5)
            return
    }

    @Override // androidx.core.view.OnReceiveContentListener
    public androidx.core.view.ContentInfoCompat onReceiveContent(android.view.View r8, androidx.core.view.ContentInfoCompat r9) {
            r7 = this;
            r0 = 3
            java.lang.String r1 = "ReceiveContent"
            boolean r0 = android.util.Log.isLoggable(r1, r0)
            if (r0 == 0) goto L1b
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "onReceive: "
            r0.<init>(r2)
            java.lang.StringBuilder r0 = r0.append(r9)
            java.lang.String r0 = r0.toString()
            android.util.Log.d(r1, r0)
        L1b:
            int r0 = r9.getSource()
            r1 = 2
            if (r0 != r1) goto L23
            return r9
        L23:
            android.content.ClipData r0 = r9.getClip()
            int r9 = r9.getFlags()
            android.widget.TextView r8 = (android.widget.TextView) r8
            java.lang.CharSequence r1 = r8.getText()
            android.text.Editable r1 = (android.text.Editable) r1
            android.content.Context r8 = r8.getContext()
            r2 = 0
            r3 = r2
        L39:
            int r4 = r0.getItemCount()
            if (r2 >= r4) goto L63
            android.content.ClipData$Item r4 = r0.getItemAt(r2)
            java.lang.CharSequence r4 = coerceToText(r8, r4, r9)
            if (r4 == 0) goto L60
            if (r3 != 0) goto L50
            replaceSelection(r1, r4)
            r3 = 1
            goto L60
        L50:
            int r5 = android.text.Selection.getSelectionEnd(r1)
            java.lang.String r6 = "\n"
            r1.insert(r5, r6)
            int r5 = android.text.Selection.getSelectionEnd(r1)
            r1.insert(r5, r4)
        L60:
            int r2 = r2 + 1
            goto L39
        L63:
            r8 = 0
            return r8
    }
}
