package org.apache.commons.lang3.time;

import java.text.Format;

/* JADX INFO: loaded from: classes2.dex */
abstract class AbstractFormatCache<F extends java.text.Format> {
    static final int NONE = -1;
    private static final java.util.concurrent.ConcurrentMap<org.apache.commons.lang3.time.AbstractFormatCache.ArrayKey, java.lang.String> cDateTimeInstanceCache = null;
    private final java.util.concurrent.ConcurrentMap<org.apache.commons.lang3.time.AbstractFormatCache.ArrayKey, F> cInstanceCache;

    private static final class ArrayKey {
        private final int hashCode;
        private final java.lang.Object[] keys;

        ArrayKey(java.lang.Object... r1) {
                r0 = this;
                r0.<init>()
                r0.keys = r1
                int r1 = computeHashCode(r1)
                r0.hashCode = r1
                return
        }

        private static int computeHashCode(java.lang.Object[] r1) {
                r0 = 31
                int r1 = java.util.Arrays.hashCode(r1)
                int r0 = r0 + r1
                return r0
        }

        public boolean equals(java.lang.Object r4) {
                r3 = this;
                if (r3 != r4) goto L4
                r4 = 1
                return r4
            L4:
                r0 = 0
                if (r4 != 0) goto L8
                return r0
            L8:
                java.lang.Class r1 = r3.getClass()
                java.lang.Class r2 = r4.getClass()
                if (r1 == r2) goto L13
                return r0
            L13:
                org.apache.commons.lang3.time.AbstractFormatCache$ArrayKey r4 = (org.apache.commons.lang3.time.AbstractFormatCache.ArrayKey) r4
                java.lang.Object[] r0 = r3.keys
                java.lang.Object[] r4 = r4.keys
                boolean r4 = java.util.Arrays.deepEquals(r0, r4)
                return r4
        }

        public int hashCode() {
                r1 = this;
                int r0 = r1.hashCode
                return r0
        }
    }

    static {
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r1 = 7
            r0.<init>(r1)
            org.apache.commons.lang3.time.AbstractFormatCache.cDateTimeInstanceCache = r0
            return
    }

    AbstractFormatCache() {
            r2 = this;
            r2.<init>()
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r1 = 7
            r0.<init>(r1)
            r2.cInstanceCache = r0
            return
    }

    private F getDateTimeInstance(java.lang.Integer r1, java.lang.Integer r2, java.util.TimeZone r3, java.util.Locale r4) {
            r0 = this;
            java.util.Locale r4 = org.apache.commons.lang3.LocaleUtils.toLocale(r4)
            java.lang.String r1 = getPatternForStyle(r1, r2, r4)
            java.text.Format r1 = r0.getInstance(r1, r3, r4)
            return r1
    }

    static java.lang.String getPatternForStyle(java.lang.Integer r3, java.lang.Integer r4, java.util.Locale r5) {
            java.util.Locale r5 = org.apache.commons.lang3.LocaleUtils.toLocale(r5)
            org.apache.commons.lang3.time.AbstractFormatCache$ArrayKey r0 = new org.apache.commons.lang3.time.AbstractFormatCache$ArrayKey
            java.lang.Object[] r1 = new java.lang.Object[]{r3, r4, r5}
            r0.<init>(r1)
            java.util.concurrent.ConcurrentMap<org.apache.commons.lang3.time.AbstractFormatCache$ArrayKey, java.lang.String> r1 = org.apache.commons.lang3.time.AbstractFormatCache.cDateTimeInstanceCache
            org.apache.commons.lang3.time.AbstractFormatCache$$ExternalSyntheticLambda0 r2 = new org.apache.commons.lang3.time.AbstractFormatCache$$ExternalSyntheticLambda0
            r2.<init>(r3, r4, r5)
            java.lang.Object r3 = r1.computeIfAbsent(r0, r2)
            java.lang.String r3 = (java.lang.String) r3
            return r3
    }

    static /* synthetic */ java.lang.String lambda$getPatternForStyle$0(java.lang.Integer r0, java.lang.Integer r1, java.util.Locale r2, org.apache.commons.lang3.time.AbstractFormatCache.ArrayKey r3) {
            if (r0 != 0) goto Lb
            int r0 = r1.intValue()     // Catch: java.lang.ClassCastException -> L29
            java.text.DateFormat r0 = java.text.DateFormat.getTimeInstance(r0, r2)     // Catch: java.lang.ClassCastException -> L29
            goto L22
        Lb:
            if (r1 != 0) goto L16
            int r0 = r0.intValue()     // Catch: java.lang.ClassCastException -> L29
            java.text.DateFormat r0 = java.text.DateFormat.getDateInstance(r0, r2)     // Catch: java.lang.ClassCastException -> L29
            goto L22
        L16:
            int r0 = r0.intValue()     // Catch: java.lang.ClassCastException -> L29
            int r1 = r1.intValue()     // Catch: java.lang.ClassCastException -> L29
            java.text.DateFormat r0 = java.text.DateFormat.getDateTimeInstance(r0, r1, r2)     // Catch: java.lang.ClassCastException -> L29
        L22:
            java.text.SimpleDateFormat r0 = (java.text.SimpleDateFormat) r0     // Catch: java.lang.ClassCastException -> L29
            java.lang.String r0 = r0.toPattern()     // Catch: java.lang.ClassCastException -> L29
            return r0
        L29:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r3 = "No date time pattern for locale: "
            r1.<init>(r3)
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
    }

    protected abstract F createInstance(java.lang.String r1, java.util.TimeZone r2, java.util.Locale r3);

    F getDateInstance(int r2, java.util.TimeZone r3, java.util.Locale r4) {
            r1 = this;
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0 = 0
            java.text.Format r2 = r1.getDateTimeInstance(r2, r0, r3, r4)
            return r2
    }

    F getDateTimeInstance(int r1, int r2, java.util.TimeZone r3, java.util.Locale r4) {
            r0 = this;
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.text.Format r1 = r0.getDateTimeInstance(r1, r2, r3, r4)
            return r1
    }

    public F getInstance() {
            r3 = this;
            java.util.TimeZone r0 = java.util.TimeZone.getDefault()
            java.util.Locale r1 = java.util.Locale.getDefault()
            r2 = 3
            java.text.Format r0 = r3.getDateTimeInstance(r2, r2, r0, r1)
            return r0
    }

    public F getInstance(java.lang.String r4, java.util.TimeZone r5, java.util.Locale r6) {
            r3 = this;
            java.lang.String r0 = "pattern"
            java.util.Objects.requireNonNull(r4, r0)
            java.util.TimeZone r5 = org.apache.commons.lang3.time.TimeZones.toTimeZone(r5)
            java.util.Locale r6 = org.apache.commons.lang3.LocaleUtils.toLocale(r6)
            org.apache.commons.lang3.time.AbstractFormatCache$ArrayKey r0 = new org.apache.commons.lang3.time.AbstractFormatCache$ArrayKey
            java.lang.Object[] r1 = new java.lang.Object[]{r4, r5, r6}
            r0.<init>(r1)
            java.util.concurrent.ConcurrentMap<org.apache.commons.lang3.time.AbstractFormatCache$ArrayKey, F extends java.text.Format> r1 = r3.cInstanceCache
            org.apache.commons.lang3.time.AbstractFormatCache$$ExternalSyntheticLambda1 r2 = new org.apache.commons.lang3.time.AbstractFormatCache$$ExternalSyntheticLambda1
            r2.<init>(r3, r4, r5, r6)
            java.lang.Object r4 = r1.computeIfAbsent(r0, r2)
            java.text.Format r4 = (java.text.Format) r4
            return r4
    }

    F getTimeInstance(int r2, java.util.TimeZone r3, java.util.Locale r4) {
            r1 = this;
            r0 = 0
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.text.Format r2 = r1.getDateTimeInstance(r0, r2, r3, r4)
            return r2
    }

    /* JADX INFO: renamed from: lambda$getInstance$1$org-apache-commons-lang3-time-AbstractFormatCache, reason: not valid java name */
    /* synthetic */ java.text.Format m2676xcaeba003(java.lang.String r1, java.util.TimeZone r2, java.util.Locale r3, org.apache.commons.lang3.time.AbstractFormatCache.ArrayKey r4) {
            r0 = this;
            java.text.Format r1 = r0.createInstance(r1, r2, r3)
            return r1
    }
}
