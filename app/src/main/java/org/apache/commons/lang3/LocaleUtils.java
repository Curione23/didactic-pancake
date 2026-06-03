package org.apache.commons.lang3;

/* JADX INFO: loaded from: classes2.dex */
public class LocaleUtils {
    private static final char DASH = '-';
    private static final char UNDERSCORE = '_';
    private static final java.lang.String UNDETERMINED = "und";
    private static final java.util.concurrent.ConcurrentMap<java.lang.String, java.util.List<java.util.Locale>> cCountriesByLanguage = null;
    private static final java.util.concurrent.ConcurrentMap<java.lang.String, java.util.List<java.util.Locale>> cLanguagesByCountry = null;

    static class SyncAvoid {
        private static final java.util.List<java.util.Locale> AVAILABLE_LOCALE_LIST = null;
        private static final java.util.Set<java.util.Locale> AVAILABLE_LOCALE_SET = null;

        static {
                java.util.ArrayList r0 = new java.util.ArrayList
                java.util.Locale[] r1 = java.util.Locale.getAvailableLocales()
                java.util.List r1 = java.util.Arrays.asList(r1)
                r0.<init>(r1)
                java.util.List r1 = java.util.Collections.unmodifiableList(r0)
                org.apache.commons.lang3.LocaleUtils.SyncAvoid.AVAILABLE_LOCALE_LIST = r1
                java.util.HashSet r1 = new java.util.HashSet
                r1.<init>(r0)
                java.util.Set r0 = java.util.Collections.unmodifiableSet(r1)
                org.apache.commons.lang3.LocaleUtils.SyncAvoid.AVAILABLE_LOCALE_SET = r0
                return
        }

        SyncAvoid() {
                r0 = this;
                r0.<init>()
                return
        }

        static /* synthetic */ java.util.List access$000() {
                java.util.List<java.util.Locale> r0 = org.apache.commons.lang3.LocaleUtils.SyncAvoid.AVAILABLE_LOCALE_LIST
                return r0
        }

        static /* synthetic */ java.util.Set access$100() {
                java.util.Set<java.util.Locale> r0 = org.apache.commons.lang3.LocaleUtils.SyncAvoid.AVAILABLE_LOCALE_SET
                return r0
        }
    }

    static {
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r0.<init>()
            org.apache.commons.lang3.LocaleUtils.cLanguagesByCountry = r0
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r0.<init>()
            org.apache.commons.lang3.LocaleUtils.cCountriesByLanguage = r0
            return
    }

    @java.lang.Deprecated
    public LocaleUtils() {
            r0 = this;
            r0.<init>()
            return
    }

    public static java.util.List<java.util.Locale> availableLocaleList() {
            java.util.List r0 = org.apache.commons.lang3.LocaleUtils.SyncAvoid.access$000()
            return r0
    }

    private static java.util.List<java.util.Locale> availableLocaleList(java.util.function.Predicate<java.util.Locale> r1) {
            java.util.List r0 = availableLocaleList()
            java.util.stream.Stream r0 = r0.stream()
            java.util.stream.Stream r1 = r0.filter(r1)
            java.util.stream.Collector r0 = java.util.stream.Collectors.toList()
            java.lang.Object r1 = r1.collect(r0)
            java.util.List r1 = (java.util.List) r1
            return r1
    }

    public static java.util.Set<java.util.Locale> availableLocaleSet() {
            java.util.Set r0 = org.apache.commons.lang3.LocaleUtils.SyncAvoid.access$100()
            return r0
    }

    public static java.util.List<java.util.Locale> countriesByLanguage(java.lang.String r2) {
            if (r2 != 0) goto L7
            java.util.List r2 = java.util.Collections.emptyList()
            return r2
        L7:
            java.util.concurrent.ConcurrentMap<java.lang.String, java.util.List<java.util.Locale>> r0 = org.apache.commons.lang3.LocaleUtils.cCountriesByLanguage
            org.apache.commons.lang3.LocaleUtils$$ExternalSyntheticLambda1 r1 = new org.apache.commons.lang3.LocaleUtils$$ExternalSyntheticLambda1
            r1.<init>(r2)
            java.lang.Object r2 = r0.computeIfAbsent(r2, r1)
            java.util.List r2 = (java.util.List) r2
            return r2
    }

    public static boolean isAvailableLocale(java.util.Locale r1) {
            java.util.Set r0 = availableLocaleSet()
            boolean r1 = r0.contains(r1)
            return r1
    }

    private static boolean isISO3166CountryCode(java.lang.String r1) {
            boolean r0 = org.apache.commons.lang3.StringUtils.isAllUpperCase(r1)
            if (r0 == 0) goto Lf
            int r1 = r1.length()
            r0 = 2
            if (r1 != r0) goto Lf
            r1 = 1
            goto L10
        Lf:
            r1 = 0
        L10:
            return r1
    }

    private static boolean isISO639LanguageCode(java.lang.String r2) {
            boolean r0 = org.apache.commons.lang3.StringUtils.isAllLowerCase(r2)
            if (r0 == 0) goto L16
            int r0 = r2.length()
            r1 = 2
            if (r0 == r1) goto L14
            int r2 = r2.length()
            r0 = 3
            if (r2 != r0) goto L16
        L14:
            r2 = 1
            goto L17
        L16:
            r2 = 0
        L17:
            return r2
    }

    public static boolean isLanguageUndetermined(java.util.Locale r1) {
            if (r1 == 0) goto L11
            java.lang.String r0 = "und"
            java.lang.String r1 = r1.toLanguageTag()
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto Lf
            goto L11
        Lf:
            r1 = 0
            goto L12
        L11:
            r1 = 1
        L12:
            return r1
    }

    private static boolean isNumericAreaCode(java.lang.String r1) {
            boolean r0 = org.apache.commons.lang3.StringUtils.isNumeric(r1)
            if (r0 == 0) goto Lf
            int r1 = r1.length()
            r0 = 3
            if (r1 != r0) goto Lf
            r1 = 1
            goto L10
        Lf:
            r1 = 0
        L10:
            return r1
    }

    static /* synthetic */ boolean lambda$countriesByLanguage$0(java.lang.String r1, java.util.Locale r2) {
            java.lang.String r0 = r2.getLanguage()
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L20
            java.lang.String r1 = r2.getCountry()
            boolean r1 = r1.isEmpty()
            if (r1 != 0) goto L20
            java.lang.String r1 = r2.getVariant()
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L20
            r1 = 1
            goto L21
        L20:
            r1 = 0
        L21:
            return r1
    }

    static /* synthetic */ java.util.List lambda$countriesByLanguage$1(java.lang.String r0, java.lang.String r1) {
            org.apache.commons.lang3.LocaleUtils$$ExternalSyntheticLambda2 r1 = new org.apache.commons.lang3.LocaleUtils$$ExternalSyntheticLambda2
            r1.<init>(r0)
            java.util.List r0 = availableLocaleList(r1)
            java.util.List r0 = java.util.Collections.unmodifiableList(r0)
            return r0
    }

    static /* synthetic */ boolean lambda$languagesByCountry$2(java.lang.String r1, java.util.Locale r2) {
            java.lang.String r0 = r2.getCountry()
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L16
            java.lang.String r1 = r2.getVariant()
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L16
            r1 = 1
            goto L17
        L16:
            r1 = 0
        L17:
            return r1
    }

    static /* synthetic */ java.util.List lambda$languagesByCountry$3(java.lang.String r0, java.lang.String r1) {
            org.apache.commons.lang3.LocaleUtils$$ExternalSyntheticLambda0 r1 = new org.apache.commons.lang3.LocaleUtils$$ExternalSyntheticLambda0
            r1.<init>(r0)
            java.util.List r0 = availableLocaleList(r1)
            java.util.List r0 = java.util.Collections.unmodifiableList(r0)
            return r0
    }

    public static java.util.List<java.util.Locale> languagesByCountry(java.lang.String r2) {
            if (r2 != 0) goto L7
            java.util.List r2 = java.util.Collections.emptyList()
            return r2
        L7:
            java.util.concurrent.ConcurrentMap<java.lang.String, java.util.List<java.util.Locale>> r0 = org.apache.commons.lang3.LocaleUtils.cLanguagesByCountry
            org.apache.commons.lang3.LocaleUtils$$ExternalSyntheticLambda3 r1 = new org.apache.commons.lang3.LocaleUtils$$ExternalSyntheticLambda3
            r1.<init>(r2)
            java.lang.Object r2 = r0.computeIfAbsent(r2, r1)
            java.util.List r2 = (java.util.List) r2
            return r2
    }

    public static java.util.List<java.util.Locale> localeLookupList(java.util.Locale r0) {
            java.util.List r0 = localeLookupList(r0, r0)
            return r0
    }

    public static java.util.List<java.util.Locale> localeLookupList(java.util.Locale r4, java.util.Locale r5) {
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = 4
            r0.<init>(r1)
            if (r4 == 0) goto L46
            r0.add(r4)
            java.lang.String r1 = r4.getVariant()
            boolean r1 = r1.isEmpty()
            if (r1 != 0) goto L25
            java.util.Locale r1 = new java.util.Locale
            java.lang.String r2 = r4.getLanguage()
            java.lang.String r3 = r4.getCountry()
            r1.<init>(r2, r3)
            r0.add(r1)
        L25:
            java.lang.String r1 = r4.getCountry()
            boolean r1 = r1.isEmpty()
            if (r1 != 0) goto L3d
            java.util.Locale r1 = new java.util.Locale
            java.lang.String r4 = r4.getLanguage()
            java.lang.String r2 = ""
            r1.<init>(r4, r2)
            r0.add(r1)
        L3d:
            boolean r4 = r0.contains(r5)
            if (r4 != 0) goto L46
            r0.add(r5)
        L46:
            java.util.List r4 = java.util.Collections.unmodifiableList(r0)
            return r4
    }

    private static java.util.Locale parseLocale(java.lang.String r6) {
            boolean r0 = isISO639LanguageCode(r6)
            if (r0 == 0) goto Lc
            java.util.Locale r0 = new java.util.Locale
            r0.<init>(r6)
            return r0
        Lc:
            r0 = 95
            int r1 = r6.indexOf(r0)
            r2 = -1
            if (r1 == r2) goto L16
            goto L18
        L16:
            r0 = 45
        L18:
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r1 = 3
            java.lang.String[] r0 = r6.split(r0, r1)
            r2 = 0
            r2 = r0[r2]
            int r3 = r0.length
            r4 = 1
            r5 = 2
            if (r3 != r5) goto L43
            r0 = r0[r4]
            boolean r1 = isISO639LanguageCode(r2)
            if (r1 == 0) goto L37
            boolean r1 = isISO3166CountryCode(r0)
            if (r1 != 0) goto L3d
        L37:
            boolean r1 = isNumericAreaCode(r0)
            if (r1 == 0) goto L6e
        L3d:
            java.util.Locale r6 = new java.util.Locale
            r6.<init>(r2, r0)
            return r6
        L43:
            int r3 = r0.length
            if (r3 != r1) goto L6e
            r1 = r0[r4]
            r0 = r0[r5]
            boolean r3 = isISO639LanguageCode(r2)
            if (r3 == 0) goto L6e
            boolean r3 = r1.isEmpty()
            if (r3 != 0) goto L62
            boolean r3 = isISO3166CountryCode(r1)
            if (r3 != 0) goto L62
            boolean r3 = isNumericAreaCode(r1)
            if (r3 == 0) goto L6e
        L62:
            boolean r3 = r0.isEmpty()
            if (r3 != 0) goto L6e
            java.util.Locale r6 = new java.util.Locale
            r6.<init>(r2, r1, r0)
            return r6
        L6e:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Invalid locale format: "
            r1.<init>(r2)
            java.lang.StringBuilder r6 = r1.append(r6)
            java.lang.String r6 = r6.toString()
            r0.<init>(r6)
            throw r0
    }

    public static java.util.Locale toLocale(java.lang.String r8) {
            if (r8 != 0) goto L4
            r8 = 0
            return r8
        L4:
            boolean r0 = r8.isEmpty()
            java.lang.String r1 = ""
            if (r0 == 0) goto L12
            java.util.Locale r8 = new java.util.Locale
            r8.<init>(r1, r1)
            return r8
        L12:
            java.lang.String r0 = "#"
            boolean r0 = r8.contains(r0)
            java.lang.String r2 = "Invalid locale format: "
            if (r0 != 0) goto Ld1
            int r0 = r8.length()
            r3 = 2
            if (r0 < r3) goto Lbe
            r4 = 0
            char r4 = r8.charAt(r4)
            r5 = 95
            if (r4 == r5) goto L36
            r5 = 45
            if (r4 != r5) goto L31
            goto L36
        L31:
            java.util.Locale r8 = parseLocale(r8)
            return r8
        L36:
            r5 = 3
            if (r0 < r5) goto Lab
            r6 = 1
            char r7 = r8.charAt(r6)
            char r3 = r8.charAt(r3)
            boolean r7 = java.lang.Character.isUpperCase(r7)
            if (r7 == 0) goto L98
            boolean r3 = java.lang.Character.isUpperCase(r3)
            if (r3 == 0) goto L98
            if (r0 != r5) goto L5a
            java.util.Locale r0 = new java.util.Locale
            java.lang.String r8 = r8.substring(r6, r5)
            r0.<init>(r1, r8)
            return r0
        L5a:
            r3 = 5
            if (r0 < r3) goto L85
            char r0 = r8.charAt(r5)
            if (r0 != r4) goto L72
            java.util.Locale r0 = new java.util.Locale
            java.lang.String r2 = r8.substring(r6, r5)
            r3 = 4
            java.lang.String r8 = r8.substring(r3)
            r0.<init>(r1, r2, r8)
            return r0
        L72:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r2)
            java.lang.StringBuilder r8 = r1.append(r8)
            java.lang.String r8 = r8.toString()
            r0.<init>(r8)
            throw r0
        L85:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r2)
            java.lang.StringBuilder r8 = r1.append(r8)
            java.lang.String r8 = r8.toString()
            r0.<init>(r8)
            throw r0
        L98:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r2)
            java.lang.StringBuilder r8 = r1.append(r8)
            java.lang.String r8 = r8.toString()
            r0.<init>(r8)
            throw r0
        Lab:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r2)
            java.lang.StringBuilder r8 = r1.append(r8)
            java.lang.String r8 = r8.toString()
            r0.<init>(r8)
            throw r0
        Lbe:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r2)
            java.lang.StringBuilder r8 = r1.append(r8)
            java.lang.String r8 = r8.toString()
            r0.<init>(r8)
            throw r0
        Ld1:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r2)
            java.lang.StringBuilder r8 = r1.append(r8)
            java.lang.String r8 = r8.toString()
            r0.<init>(r8)
            throw r0
    }

    public static java.util.Locale toLocale(java.util.Locale r0) {
            if (r0 == 0) goto L3
            goto L7
        L3:
            java.util.Locale r0 = java.util.Locale.getDefault()
        L7:
            return r0
    }
}
