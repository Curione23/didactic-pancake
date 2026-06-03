package androidx.core.text;

/* JADX INFO: loaded from: classes.dex */
public final class ICUCompat {
    private static final java.lang.String TAG = "ICUCompat";
    private static java.lang.reflect.Method sAddLikelySubtagsMethod;
    private static java.lang.reflect.Method sGetScriptMethod;

    static class Api21Impl {
        private Api21Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        static java.lang.String getScript(java.util.Locale r0) {
                java.lang.String r0 = r0.getScript()
                return r0
        }
    }

    static class Api24Impl {
        private Api24Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        static android.icu.util.ULocale addLikelySubtags(java.lang.Object r0) {
                android.icu.util.ULocale r0 = (android.icu.util.ULocale) r0
                android.icu.util.ULocale r0 = android.icu.util.ULocale.addLikelySubtags(r0)
                return r0
        }

        static android.icu.util.ULocale forLocale(java.util.Locale r0) {
                android.icu.util.ULocale r0 = android.icu.util.ULocale.forLocale(r0)
                return r0
        }

        static java.lang.String getScript(java.lang.Object r0) {
                android.icu.util.ULocale r0 = (android.icu.util.ULocale) r0
                java.lang.String r0 = r0.getScript()
                return r0
        }
    }

    static {
            return
    }

    private ICUCompat() {
            r0 = this;
            r0.<init>()
            return
    }

    private static java.lang.String addLikelySubtagsBelowApi21(java.util.Locale r4) {
            java.lang.String r0 = "ICUCompat"
            java.lang.String r4 = r4.toString()
            java.lang.reflect.Method r1 = androidx.core.text.ICUCompat.sAddLikelySubtagsMethod     // Catch: java.lang.reflect.InvocationTargetException -> L16 java.lang.IllegalAccessException -> L1b
            if (r1 == 0) goto L1f
            java.lang.Object[] r2 = new java.lang.Object[]{r4}     // Catch: java.lang.reflect.InvocationTargetException -> L16 java.lang.IllegalAccessException -> L1b
            r3 = 0
            java.lang.Object r1 = r1.invoke(r3, r2)     // Catch: java.lang.reflect.InvocationTargetException -> L16 java.lang.IllegalAccessException -> L1b
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.reflect.InvocationTargetException -> L16 java.lang.IllegalAccessException -> L1b
            return r1
        L16:
            r1 = move-exception
            android.util.Log.w(r0, r1)
            goto L1f
        L1b:
            r1 = move-exception
            android.util.Log.w(r0, r1)
        L1f:
            return r4
    }

    private static java.lang.String getScriptBelowApi21(java.lang.String r3) {
            java.lang.String r0 = "ICUCompat"
            r1 = 0
            java.lang.reflect.Method r2 = androidx.core.text.ICUCompat.sGetScriptMethod     // Catch: java.lang.reflect.InvocationTargetException -> L12 java.lang.IllegalAccessException -> L17
            if (r2 == 0) goto L1b
            java.lang.Object[] r3 = new java.lang.Object[]{r3}     // Catch: java.lang.reflect.InvocationTargetException -> L12 java.lang.IllegalAccessException -> L17
            java.lang.Object r3 = r2.invoke(r1, r3)     // Catch: java.lang.reflect.InvocationTargetException -> L12 java.lang.IllegalAccessException -> L17
            java.lang.String r3 = (java.lang.String) r3     // Catch: java.lang.reflect.InvocationTargetException -> L12 java.lang.IllegalAccessException -> L17
            return r3
        L12:
            r3 = move-exception
            android.util.Log.w(r0, r3)
            goto L1b
        L17:
            r3 = move-exception
            android.util.Log.w(r0, r3)
        L1b:
            return r1
    }

    public static java.lang.String maximizeAndGetScript(java.util.Locale r0) {
            android.icu.util.ULocale r0 = androidx.core.text.ICUCompat.Api24Impl.forLocale(r0)
            android.icu.util.ULocale r0 = androidx.core.text.ICUCompat.Api24Impl.addLikelySubtags(r0)
            java.lang.String r0 = androidx.core.text.ICUCompat.Api24Impl.getScript(r0)
            return r0
    }
}
