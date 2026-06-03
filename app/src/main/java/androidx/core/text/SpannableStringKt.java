package androidx.core.text;

/* JADX INFO: compiled from: SpannableString.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000(\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0000\u001a\r\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0086\b\u001a%\u0010\u0003\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\bH\u0086\n\u001a\u001d\u0010\u0003\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\bH\u0086\n\u001a\r\u0010\u000b\u001a\u00020\u0002*\u00020\fH\u0086\b¨\u0006\r"}, d2 = {"clearSpans", "", "Landroid/text/Spannable;", "set", "start", "", "end", "span", "", "range", "Lkotlin/ranges/IntRange;", "toSpannable", "", "core-ktx_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class SpannableStringKt {
    public static final void clearSpans(android.text.Spannable r4) {
            r0 = r4
            android.text.Spanned r0 = (android.text.Spanned) r0
            int r1 = r0.length()
            java.lang.Class<java.lang.Object> r2 = java.lang.Object.class
            r3 = 0
            java.lang.Object[] r0 = r0.getSpans(r3, r1, r2)
            int r1 = r0.length
        Lf:
            if (r3 >= r1) goto L19
            r2 = r0[r3]
            r4.removeSpan(r2)
            int r3 = r3 + 1
            goto Lf
        L19:
            return
    }

    public static final void set(android.text.Spannable r1, int r2, int r3, java.lang.Object r4) {
            r0 = 17
            r1.setSpan(r4, r2, r3, r0)
            return
    }

    public static final void set(android.text.Spannable r2, kotlin.ranges.IntRange r3, java.lang.Object r4) {
            java.lang.Integer r0 = r3.getStart()
            int r0 = r0.intValue()
            java.lang.Integer r3 = r3.getEndInclusive()
            int r3 = r3.intValue()
            r1 = 17
            r2.setSpan(r4, r0, r3, r1)
            return
    }

    public static final android.text.Spannable toSpannable(java.lang.CharSequence r0) {
            android.text.SpannableString r0 = android.text.SpannableString.valueOf(r0)
            android.text.Spannable r0 = (android.text.Spannable) r0
            return r0
    }
}
