package org.apache.commons.codec.language.bm;

/* JADX INFO: loaded from: classes2.dex */
public class Lang {
    private static final java.util.Map<org.apache.commons.codec.language.bm.NameType, org.apache.commons.codec.language.bm.Lang> LANGS = null;
    private static final java.lang.String LANGUAGE_RULES_RN = "org/apache/commons/codec/language/bm/%s_lang.txt";
    private final org.apache.commons.codec.language.bm.Languages languages;
    private final java.util.List<org.apache.commons.codec.language.bm.Lang.LangRule> rules;

    /* JADX INFO: renamed from: org.apache.commons.codec.language.bm.Lang$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
    }

    private static final class LangRule {
        private final boolean acceptOnMatch;
        private final java.util.Set<java.lang.String> languages;
        private final java.util.regex.Pattern pattern;

        private LangRule(java.util.regex.Pattern r1, java.util.Set<java.lang.String> r2, boolean r3) {
                r0 = this;
                r0.<init>()
                r0.pattern = r1
                r0.languages = r2
                r0.acceptOnMatch = r3
                return
        }

        /* synthetic */ LangRule(java.util.regex.Pattern r1, java.util.Set r2, boolean r3, org.apache.commons.codec.language.bm.Lang.AnonymousClass1 r4) {
                r0 = this;
                r0.<init>(r1, r2, r3)
                return
        }

        static /* synthetic */ boolean access$100(org.apache.commons.codec.language.bm.Lang.LangRule r0) {
                boolean r0 = r0.acceptOnMatch
                return r0
        }

        static /* synthetic */ java.util.Set access$200(org.apache.commons.codec.language.bm.Lang.LangRule r0) {
                java.util.Set<java.lang.String> r0 = r0.languages
                return r0
        }

        public boolean matches(java.lang.String r2) {
                r1 = this;
                java.util.regex.Pattern r0 = r1.pattern
                java.util.regex.Matcher r2 = r0.matcher(r2)
                boolean r2 = r2.find()
                return r2
        }
    }

    static {
            java.util.EnumMap r0 = new java.util.EnumMap
            java.lang.Class<org.apache.commons.codec.language.bm.NameType> r1 = org.apache.commons.codec.language.bm.NameType.class
            r0.<init>(r1)
            org.apache.commons.codec.language.bm.Lang.LANGS = r0
            org.apache.commons.codec.language.bm.NameType[] r0 = org.apache.commons.codec.language.bm.NameType.values()
            int r1 = r0.length
            r2 = 0
        Lf:
            if (r2 >= r1) goto L31
            r3 = r0[r2]
            java.util.Map<org.apache.commons.codec.language.bm.NameType, org.apache.commons.codec.language.bm.Lang> r4 = org.apache.commons.codec.language.bm.Lang.LANGS
            java.lang.String r5 = r3.getName()
            java.lang.Object[] r5 = new java.lang.Object[]{r5}
            java.lang.String r6 = "org/apache/commons/codec/language/bm/%s_lang.txt"
            java.lang.String r5 = java.lang.String.format(r6, r5)
            org.apache.commons.codec.language.bm.Languages r6 = org.apache.commons.codec.language.bm.Languages.getInstance(r3)
            org.apache.commons.codec.language.bm.Lang r5 = loadFromResource(r5, r6)
            r4.put(r3, r5)
            int r2 = r2 + 1
            goto Lf
        L31:
            return
    }

    private Lang(java.util.List<org.apache.commons.codec.language.bm.Lang.LangRule> r1, org.apache.commons.codec.language.bm.Languages r2) {
            r0 = this;
            r0.<init>()
            java.util.List r1 = java.util.Collections.unmodifiableList(r1)
            r0.rules = r1
            r0.languages = r2
            return
    }

    public static org.apache.commons.codec.language.bm.Lang instance(org.apache.commons.codec.language.bm.NameType r1) {
            java.util.Map<org.apache.commons.codec.language.bm.NameType, org.apache.commons.codec.language.bm.Lang> r0 = org.apache.commons.codec.language.bm.Lang.LANGS
            java.lang.Object r1 = r0.get(r1)
            org.apache.commons.codec.language.bm.Lang r1 = (org.apache.commons.codec.language.bm.Lang) r1
            return r1
    }

    static /* synthetic */ void lambda$guessLanguages$0(java.lang.String r0, java.util.Set r1, org.apache.commons.codec.language.bm.Lang.LangRule r2) {
            boolean r0 = r2.matches(r0)
            if (r0 == 0) goto L1b
            boolean r0 = org.apache.commons.codec.language.bm.Lang.LangRule.access$100(r2)
            if (r0 == 0) goto L14
            java.util.Set r0 = org.apache.commons.codec.language.bm.Lang.LangRule.access$200(r2)
            r1.retainAll(r0)
            goto L1b
        L14:
            java.util.Set r0 = org.apache.commons.codec.language.bm.Lang.LangRule.access$200(r2)
            r1.removeAll(r0)
        L1b:
            return
    }

    public static org.apache.commons.codec.language.bm.Lang loadFromResource(java.lang.String r9, org.apache.commons.codec.language.bm.Languages r10) {
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Scanner r1 = new java.util.Scanner
            java.io.InputStream r2 = org.apache.commons.codec.Resources.getInputStream(r9)
            java.lang.String r3 = org.apache.commons.codec.language.bm.ResourceConstants.ENCODING
            r1.<init>(r2, r3)
            r2 = 0
        L11:
            r3 = r2
        L12:
            boolean r4 = r1.hasNextLine()     // Catch: java.lang.Throwable -> Lb1
            if (r4 == 0) goto La8
            java.lang.String r4 = r1.nextLine()     // Catch: java.lang.Throwable -> Lb1
            if (r3 == 0) goto L27
            java.lang.String r5 = "*/"
            boolean r4 = r4.endsWith(r5)     // Catch: java.lang.Throwable -> Lb1
            if (r4 == 0) goto L12
            goto L11
        L27:
            java.lang.String r5 = "/*"
            boolean r5 = r4.startsWith(r5)     // Catch: java.lang.Throwable -> Lb1
            r6 = 1
            if (r5 == 0) goto L32
            r3 = r6
            goto L12
        L32:
            java.lang.String r5 = "//"
            int r5 = r4.indexOf(r5)     // Catch: java.lang.Throwable -> Lb1
            if (r5 < 0) goto L3f
            java.lang.String r5 = r4.substring(r2, r5)     // Catch: java.lang.Throwable -> Lb1
            goto L40
        L3f:
            r5 = r4
        L40:
            java.lang.String r5 = r5.trim()     // Catch: java.lang.Throwable -> Lb1
            boolean r7 = r5.isEmpty()     // Catch: java.lang.Throwable -> Lb1
            if (r7 == 0) goto L4b
            goto L12
        L4b:
            java.lang.String r7 = "\\s+"
            java.lang.String[] r5 = r5.split(r7)     // Catch: java.lang.Throwable -> Lb1
            int r7 = r5.length     // Catch: java.lang.Throwable -> Lb1
            r8 = 3
            if (r7 != r8) goto L7f
            r4 = r5[r2]     // Catch: java.lang.Throwable -> Lb1
            java.util.regex.Pattern r4 = java.util.regex.Pattern.compile(r4)     // Catch: java.lang.Throwable -> Lb1
            r6 = r5[r6]     // Catch: java.lang.Throwable -> Lb1
            java.lang.String r7 = "\\+"
            java.lang.String[] r6 = r6.split(r7)     // Catch: java.lang.Throwable -> Lb1
            r7 = 2
            r5 = r5[r7]     // Catch: java.lang.Throwable -> Lb1
            java.lang.String r7 = "true"
            boolean r5 = r5.equals(r7)     // Catch: java.lang.Throwable -> Lb1
            org.apache.commons.codec.language.bm.Lang$LangRule r7 = new org.apache.commons.codec.language.bm.Lang$LangRule     // Catch: java.lang.Throwable -> Lb1
            java.util.HashSet r8 = new java.util.HashSet     // Catch: java.lang.Throwable -> Lb1
            java.util.List r6 = java.util.Arrays.asList(r6)     // Catch: java.lang.Throwable -> Lb1
            r8.<init>(r6)     // Catch: java.lang.Throwable -> Lb1
            r6 = 0
            r7.<init>(r4, r8, r5, r6)     // Catch: java.lang.Throwable -> Lb1
            r0.add(r7)     // Catch: java.lang.Throwable -> Lb1
            goto L12
        L7f:
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException     // Catch: java.lang.Throwable -> Lb1
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lb1
            r0.<init>()     // Catch: java.lang.Throwable -> Lb1
            java.lang.String r2 = "Malformed line '"
            java.lang.StringBuilder r0 = r0.append(r2)     // Catch: java.lang.Throwable -> Lb1
            java.lang.StringBuilder r0 = r0.append(r4)     // Catch: java.lang.Throwable -> Lb1
            java.lang.String r2 = "' in language resource '"
            java.lang.StringBuilder r0 = r0.append(r2)     // Catch: java.lang.Throwable -> Lb1
            java.lang.StringBuilder r9 = r0.append(r9)     // Catch: java.lang.Throwable -> Lb1
            java.lang.String r0 = "'"
            java.lang.StringBuilder r9 = r9.append(r0)     // Catch: java.lang.Throwable -> Lb1
            java.lang.String r9 = r9.toString()     // Catch: java.lang.Throwable -> Lb1
            r10.<init>(r9)     // Catch: java.lang.Throwable -> Lb1
            throw r10     // Catch: java.lang.Throwable -> Lb1
        La8:
            r1.close()
            org.apache.commons.codec.language.bm.Lang r9 = new org.apache.commons.codec.language.bm.Lang
            r9.<init>(r0, r10)
            return r9
        Lb1:
            r9 = move-exception
            r1.close()     // Catch: java.lang.Throwable -> Lb6
            goto Lba
        Lb6:
            r10 = move-exception
            r9.addSuppressed(r10)
        Lba:
            throw r9
    }

    public java.lang.String guessLanguage(java.lang.String r2) {
            r1 = this;
            org.apache.commons.codec.language.bm.Languages$LanguageSet r2 = r1.guessLanguages(r2)
            boolean r0 = r2.isSingleton()
            if (r0 == 0) goto Lf
            java.lang.String r2 = r2.getAny()
            goto L11
        Lf:
            java.lang.String r2 = "any"
        L11:
            return r2
    }

    public org.apache.commons.codec.language.bm.Languages.LanguageSet guessLanguages(java.lang.String r4) {
            r3 = this;
            java.util.Locale r0 = java.util.Locale.ENGLISH
            java.lang.String r4 = r4.toLowerCase(r0)
            java.util.HashSet r0 = new java.util.HashSet
            org.apache.commons.codec.language.bm.Languages r1 = r3.languages
            java.util.Set r1 = r1.getLanguages()
            r0.<init>(r1)
            java.util.List<org.apache.commons.codec.language.bm.Lang$LangRule> r1 = r3.rules
            org.apache.commons.codec.language.bm.Lang$$ExternalSyntheticLambda0 r2 = new org.apache.commons.codec.language.bm.Lang$$ExternalSyntheticLambda0
            r2.<init>(r4, r0)
            r1.forEach(r2)
            org.apache.commons.codec.language.bm.Languages$LanguageSet r4 = org.apache.commons.codec.language.bm.Languages.LanguageSet.from(r0)
            org.apache.commons.codec.language.bm.Languages$LanguageSet r0 = org.apache.commons.codec.language.bm.Languages.NO_LANGUAGES
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L29
            org.apache.commons.codec.language.bm.Languages$LanguageSet r4 = org.apache.commons.codec.language.bm.Languages.ANY_LANGUAGE
        L29:
            return r4
    }
}
