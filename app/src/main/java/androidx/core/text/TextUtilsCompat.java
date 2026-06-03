package androidx.core.text;

/* JADX INFO: loaded from: classes.dex */
public final class TextUtilsCompat {
    private TextUtilsCompat() {
            r0 = this;
            r0.<init>()
            return
    }

    public static int getLayoutDirectionFromLocale(java.util.Locale r0) {
            int r0 = android.text.TextUtils.getLayoutDirectionFromLocale(r0)
            return r0
    }

    public static java.lang.String htmlEncode(java.lang.String r0) {
            java.lang.String r0 = android.text.TextUtils.htmlEncode(r0)
            return r0
    }
}
