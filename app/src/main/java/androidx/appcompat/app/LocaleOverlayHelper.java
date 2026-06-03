package androidx.appcompat.app;

/* JADX INFO: loaded from: classes.dex */
final class LocaleOverlayHelper {
    private LocaleOverlayHelper() {
            r0 = this;
            r0.<init>()
            return
    }

    private static androidx.core.os.LocaleListCompat combineLocales(androidx.core.os.LocaleListCompat r4, androidx.core.os.LocaleListCompat r5) {
            java.util.LinkedHashSet r0 = new java.util.LinkedHashSet
            r0.<init>()
            r1 = 0
        L6:
            int r2 = r4.size()
            int r3 = r5.size()
            int r2 = r2 + r3
            if (r1 >= r2) goto L2e
            int r2 = r4.size()
            if (r1 >= r2) goto L1c
            java.util.Locale r2 = r4.get(r1)
            goto L26
        L1c:
            int r2 = r4.size()
            int r2 = r1 - r2
            java.util.Locale r2 = r5.get(r2)
        L26:
            if (r2 == 0) goto L2b
            r0.add(r2)
        L2b:
            int r1 = r1 + 1
            goto L6
        L2e:
            int r4 = r0.size()
            java.util.Locale[] r4 = new java.util.Locale[r4]
            java.lang.Object[] r4 = r0.toArray(r4)
            java.util.Locale[] r4 = (java.util.Locale[]) r4
            androidx.core.os.LocaleListCompat r4 = androidx.core.os.LocaleListCompat.create(r4)
            return r4
    }

    static androidx.core.os.LocaleListCompat combineLocalesIfOverlayExists(android.os.LocaleList r1, android.os.LocaleList r2) {
            if (r1 == 0) goto L16
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto L9
            goto L16
        L9:
            androidx.core.os.LocaleListCompat r1 = androidx.core.os.LocaleListCompat.wrap(r1)
            androidx.core.os.LocaleListCompat r2 = androidx.core.os.LocaleListCompat.wrap(r2)
            androidx.core.os.LocaleListCompat r1 = combineLocales(r1, r2)
            return r1
        L16:
            androidx.core.os.LocaleListCompat r1 = androidx.core.os.LocaleListCompat.getEmptyLocaleList()
            return r1
    }

    static androidx.core.os.LocaleListCompat combineLocalesIfOverlayExists(androidx.core.os.LocaleListCompat r1, androidx.core.os.LocaleListCompat r2) {
            if (r1 == 0) goto Le
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto L9
            goto Le
        L9:
            androidx.core.os.LocaleListCompat r1 = combineLocales(r1, r2)
            return r1
        Le:
            androidx.core.os.LocaleListCompat r1 = androidx.core.os.LocaleListCompat.getEmptyLocaleList()
            return r1
    }
}
