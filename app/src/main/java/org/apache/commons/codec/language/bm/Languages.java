package org.apache.commons.codec.language.bm;

/* JADX INFO: loaded from: classes2.dex */
public class Languages {
    public static final java.lang.String ANY = "any";
    public static final org.apache.commons.codec.language.bm.Languages.LanguageSet ANY_LANGUAGE = null;
    private static final java.util.Map<org.apache.commons.codec.language.bm.NameType, org.apache.commons.codec.language.bm.Languages> LANGUAGES = null;
    public static final org.apache.commons.codec.language.bm.Languages.LanguageSet NO_LANGUAGES = null;
    private final java.util.Set<java.lang.String> languages;



    public static abstract class LanguageSet {
        public LanguageSet() {
                r0 = this;
                r0.<init>()
                return
        }

        public static org.apache.commons.codec.language.bm.Languages.LanguageSet from(java.util.Set<java.lang.String> r2) {
                boolean r0 = r2.isEmpty()
                if (r0 == 0) goto L9
                org.apache.commons.codec.language.bm.Languages$LanguageSet r2 = org.apache.commons.codec.language.bm.Languages.NO_LANGUAGES
                goto L10
            L9:
                org.apache.commons.codec.language.bm.Languages$SomeLanguages r0 = new org.apache.commons.codec.language.bm.Languages$SomeLanguages
                r1 = 0
                r0.<init>(r2, r1)
                r2 = r0
            L10:
                return r2
        }

        public abstract boolean contains(java.lang.String r1);

        public abstract java.lang.String getAny();

        public abstract boolean isEmpty();

        public abstract boolean isSingleton();

        abstract org.apache.commons.codec.language.bm.Languages.LanguageSet merge(org.apache.commons.codec.language.bm.Languages.LanguageSet r1);

        public abstract org.apache.commons.codec.language.bm.Languages.LanguageSet restrictTo(org.apache.commons.codec.language.bm.Languages.LanguageSet r1);
    }

    public static final class SomeLanguages extends org.apache.commons.codec.language.bm.Languages.LanguageSet {
        private final java.util.Set<java.lang.String> languages;

        private SomeLanguages(java.util.Set<java.lang.String> r1) {
                r0 = this;
                r0.<init>()
                java.util.Set r1 = java.util.Collections.unmodifiableSet(r1)
                r0.languages = r1
                return
        }

        /* synthetic */ SomeLanguages(java.util.Set r1, org.apache.commons.codec.language.bm.Languages.AnonymousClass1 r2) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        static /* synthetic */ boolean lambda$restrictTo$0(org.apache.commons.codec.language.bm.Languages.SomeLanguages r0, java.lang.String r1) {
                java.util.Set<java.lang.String> r0 = r0.languages
                boolean r0 = r0.contains(r1)
                return r0
        }

        @Override // org.apache.commons.codec.language.bm.Languages.LanguageSet
        public boolean contains(java.lang.String r2) {
                r1 = this;
                java.util.Set<java.lang.String> r0 = r1.languages
                boolean r2 = r0.contains(r2)
                return r2
        }

        @Override // org.apache.commons.codec.language.bm.Languages.LanguageSet
        public java.lang.String getAny() {
                r1 = this;
                java.util.Set<java.lang.String> r0 = r1.languages
                java.util.Iterator r0 = r0.iterator()
                java.lang.Object r0 = r0.next()
                java.lang.String r0 = (java.lang.String) r0
                return r0
        }

        public java.util.Set<java.lang.String> getLanguages() {
                r1 = this;
                java.util.Set<java.lang.String> r0 = r1.languages
                return r0
        }

        @Override // org.apache.commons.codec.language.bm.Languages.LanguageSet
        public boolean isEmpty() {
                r1 = this;
                java.util.Set<java.lang.String> r0 = r1.languages
                boolean r0 = r0.isEmpty()
                return r0
        }

        @Override // org.apache.commons.codec.language.bm.Languages.LanguageSet
        public boolean isSingleton() {
                r2 = this;
                java.util.Set<java.lang.String> r0 = r2.languages
                int r0 = r0.size()
                r1 = 1
                if (r0 != r1) goto La
                goto Lb
            La:
                r1 = 0
            Lb:
                return r1
        }

        @Override // org.apache.commons.codec.language.bm.Languages.LanguageSet
        public org.apache.commons.codec.language.bm.Languages.LanguageSet merge(org.apache.commons.codec.language.bm.Languages.LanguageSet r3) {
                r2 = this;
                org.apache.commons.codec.language.bm.Languages$LanguageSet r0 = org.apache.commons.codec.language.bm.Languages.NO_LANGUAGES
                if (r3 != r0) goto L5
                return r2
            L5:
                org.apache.commons.codec.language.bm.Languages$LanguageSet r0 = org.apache.commons.codec.language.bm.Languages.ANY_LANGUAGE
                if (r3 != r0) goto La
                return r3
            La:
                org.apache.commons.codec.language.bm.Languages$SomeLanguages r3 = (org.apache.commons.codec.language.bm.Languages.SomeLanguages) r3
                java.util.HashSet r0 = new java.util.HashSet
                java.util.Set<java.lang.String> r1 = r2.languages
                r0.<init>(r1)
                java.util.Set<java.lang.String> r3 = r3.languages
                r0.addAll(r3)
                org.apache.commons.codec.language.bm.Languages$LanguageSet r3 = from(r0)
                return r3
        }

        @Override // org.apache.commons.codec.language.bm.Languages.LanguageSet
        public org.apache.commons.codec.language.bm.Languages.LanguageSet restrictTo(org.apache.commons.codec.language.bm.Languages.LanguageSet r3) {
                r2 = this;
                org.apache.commons.codec.language.bm.Languages$LanguageSet r0 = org.apache.commons.codec.language.bm.Languages.NO_LANGUAGES
                if (r3 != r0) goto L5
                return r3
            L5:
                org.apache.commons.codec.language.bm.Languages$LanguageSet r0 = org.apache.commons.codec.language.bm.Languages.ANY_LANGUAGE
                if (r3 != r0) goto La
                return r2
            La:
                org.apache.commons.codec.language.bm.Languages$SomeLanguages r3 = (org.apache.commons.codec.language.bm.Languages.SomeLanguages) r3
                java.util.Set<java.lang.String> r0 = r2.languages
                java.util.stream.Stream r0 = r0.stream()
                org.apache.commons.codec.language.bm.Languages$SomeLanguages$$ExternalSyntheticLambda0 r1 = new org.apache.commons.codec.language.bm.Languages$SomeLanguages$$ExternalSyntheticLambda0
                r1.<init>(r3)
                java.util.stream.Stream r3 = r0.filter(r1)
                java.util.stream.Collector r0 = java.util.stream.Collectors.toSet()
                java.lang.Object r3 = r3.collect(r0)
                java.util.Set r3 = (java.util.Set) r3
                org.apache.commons.codec.language.bm.Languages$LanguageSet r3 = from(r3)
                return r3
        }

        public java.lang.String toString() {
                r2 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                java.lang.String r1 = "Languages("
                r0.<init>(r1)
                java.util.Set<java.lang.String> r1 = r2.languages
                java.lang.String r1 = r1.toString()
                java.lang.StringBuilder r0 = r0.append(r1)
                java.lang.String r1 = ")"
                java.lang.StringBuilder r0 = r0.append(r1)
                java.lang.String r0 = r0.toString()
                return r0
        }
    }

    static {
            java.util.EnumMap r0 = new java.util.EnumMap
            java.lang.Class<org.apache.commons.codec.language.bm.NameType> r1 = org.apache.commons.codec.language.bm.NameType.class
            r0.<init>(r1)
            org.apache.commons.codec.language.bm.Languages.LANGUAGES = r0
            org.apache.commons.codec.language.bm.Languages$1 r0 = new org.apache.commons.codec.language.bm.Languages$1
            r0.<init>()
            org.apache.commons.codec.language.bm.Languages.NO_LANGUAGES = r0
            org.apache.commons.codec.language.bm.Languages$2 r0 = new org.apache.commons.codec.language.bm.Languages$2
            r0.<init>()
            org.apache.commons.codec.language.bm.Languages.ANY_LANGUAGE = r0
            org.apache.commons.codec.language.bm.NameType[] r0 = org.apache.commons.codec.language.bm.NameType.values()
            int r1 = r0.length
            r2 = 0
        L1d:
            if (r2 >= r1) goto L31
            r3 = r0[r2]
            java.util.Map<org.apache.commons.codec.language.bm.NameType, org.apache.commons.codec.language.bm.Languages> r4 = org.apache.commons.codec.language.bm.Languages.LANGUAGES
            java.lang.String r5 = langResourceName(r3)
            org.apache.commons.codec.language.bm.Languages r5 = getInstance(r5)
            r4.put(r3, r5)
            int r2 = r2 + 1
            goto L1d
        L31:
            return
    }

    private Languages(java.util.Set<java.lang.String> r1) {
            r0 = this;
            r0.<init>()
            r0.languages = r1
            return
    }

    public static org.apache.commons.codec.language.bm.Languages getInstance(java.lang.String r5) {
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            java.util.Scanner r1 = new java.util.Scanner
            java.io.InputStream r5 = org.apache.commons.codec.Resources.getInputStream(r5)
            java.lang.String r2 = org.apache.commons.codec.language.bm.ResourceConstants.ENCODING
            r1.<init>(r5, r2)
            r5 = 0
        L11:
            r2 = r5
        L12:
            boolean r3 = r1.hasNextLine()     // Catch: java.lang.Throwable -> L4c
            if (r3 == 0) goto L3f
            java.lang.String r3 = r1.nextLine()     // Catch: java.lang.Throwable -> L4c
            java.lang.String r3 = r3.trim()     // Catch: java.lang.Throwable -> L4c
            if (r2 == 0) goto L2b
            java.lang.String r4 = "*/"
            boolean r3 = r3.endsWith(r4)     // Catch: java.lang.Throwable -> L4c
            if (r3 == 0) goto L12
            goto L11
        L2b:
            java.lang.String r4 = "/*"
            boolean r4 = r3.startsWith(r4)     // Catch: java.lang.Throwable -> L4c
            if (r4 == 0) goto L35
            r2 = 1
            goto L12
        L35:
            boolean r4 = r3.isEmpty()     // Catch: java.lang.Throwable -> L4c
            if (r4 != 0) goto L12
            r0.add(r3)     // Catch: java.lang.Throwable -> L4c
            goto L12
        L3f:
            org.apache.commons.codec.language.bm.Languages r5 = new org.apache.commons.codec.language.bm.Languages     // Catch: java.lang.Throwable -> L4c
            java.util.Set r0 = java.util.Collections.unmodifiableSet(r0)     // Catch: java.lang.Throwable -> L4c
            r5.<init>(r0)     // Catch: java.lang.Throwable -> L4c
            r1.close()
            return r5
        L4c:
            r5 = move-exception
            r1.close()     // Catch: java.lang.Throwable -> L51
            goto L55
        L51:
            r0 = move-exception
            r5.addSuppressed(r0)
        L55:
            throw r5
    }

    public static org.apache.commons.codec.language.bm.Languages getInstance(org.apache.commons.codec.language.bm.NameType r1) {
            java.util.Map<org.apache.commons.codec.language.bm.NameType, org.apache.commons.codec.language.bm.Languages> r0 = org.apache.commons.codec.language.bm.Languages.LANGUAGES
            java.lang.Object r1 = r0.get(r1)
            org.apache.commons.codec.language.bm.Languages r1 = (org.apache.commons.codec.language.bm.Languages) r1
            return r1
    }

    private static java.lang.String langResourceName(org.apache.commons.codec.language.bm.NameType r1) {
            java.lang.String r1 = r1.getName()
            java.lang.Object[] r1 = new java.lang.Object[]{r1}
            java.lang.String r0 = "org/apache/commons/codec/language/bm/%s_languages.txt"
            java.lang.String r1 = java.lang.String.format(r0, r1)
            return r1
    }

    public java.util.Set<java.lang.String> getLanguages() {
            r1 = this;
            java.util.Set<java.lang.String> r0 = r1.languages
            return r0
    }
}
