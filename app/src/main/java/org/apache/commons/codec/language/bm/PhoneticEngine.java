package org.apache.commons.codec.language.bm;

/* JADX INFO: loaded from: classes2.dex */
public class PhoneticEngine {
    private static final int DEFAULT_MAX_PHONEMES = 20;
    private static final java.util.Map<org.apache.commons.codec.language.bm.NameType, java.util.Set<java.lang.String>> NAME_PREFIXES = null;
    private final boolean concat;
    private final org.apache.commons.codec.language.bm.Lang lang;
    private final int maxPhonemes;
    private final org.apache.commons.codec.language.bm.NameType nameType;
    private final org.apache.commons.codec.language.bm.RuleType ruleType;

    /* JADX INFO: renamed from: org.apache.commons.codec.language.bm.PhoneticEngine$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$org$apache$commons$codec$language$bm$NameType = null;

        static {
                org.apache.commons.codec.language.bm.NameType[] r0 = org.apache.commons.codec.language.bm.NameType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                org.apache.commons.codec.language.bm.PhoneticEngine.AnonymousClass1.$SwitchMap$org$apache$commons$codec$language$bm$NameType = r0
                org.apache.commons.codec.language.bm.NameType r1 = org.apache.commons.codec.language.bm.NameType.SEPHARDIC     // Catch: java.lang.NoSuchFieldError -> L12
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L12
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L12
            L12:
                int[] r0 = org.apache.commons.codec.language.bm.PhoneticEngine.AnonymousClass1.$SwitchMap$org$apache$commons$codec$language$bm$NameType     // Catch: java.lang.NoSuchFieldError -> L1d
                org.apache.commons.codec.language.bm.NameType r1 = org.apache.commons.codec.language.bm.NameType.ASHKENAZI     // Catch: java.lang.NoSuchFieldError -> L1d
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L1d
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L1d
            L1d:
                int[] r0 = org.apache.commons.codec.language.bm.PhoneticEngine.AnonymousClass1.$SwitchMap$org$apache$commons$codec$language$bm$NameType     // Catch: java.lang.NoSuchFieldError -> L28
                org.apache.commons.codec.language.bm.NameType r1 = org.apache.commons.codec.language.bm.NameType.GENERIC     // Catch: java.lang.NoSuchFieldError -> L28
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L28
                r2 = 3
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L28
            L28:
                return
        }
    }

    static final class PhonemeBuilder {
        private final java.util.Set<org.apache.commons.codec.language.bm.Rule.Phoneme> phonemes;

        private PhonemeBuilder(java.util.Set<org.apache.commons.codec.language.bm.Rule.Phoneme> r1) {
                r0 = this;
                r0.<init>()
                r0.phonemes = r1
                return
        }

        /* synthetic */ PhonemeBuilder(java.util.Set r1, org.apache.commons.codec.language.bm.PhoneticEngine.AnonymousClass1 r2) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        private PhonemeBuilder(org.apache.commons.codec.language.bm.Rule.Phoneme r2) {
                r1 = this;
                r1.<init>()
                java.util.LinkedHashSet r0 = new java.util.LinkedHashSet
                r0.<init>()
                r1.phonemes = r0
                r0.add(r2)
                return
        }

        public static org.apache.commons.codec.language.bm.PhoneticEngine.PhonemeBuilder empty(org.apache.commons.codec.language.bm.Languages.LanguageSet r3) {
                org.apache.commons.codec.language.bm.PhoneticEngine$PhonemeBuilder r0 = new org.apache.commons.codec.language.bm.PhoneticEngine$PhonemeBuilder
                org.apache.commons.codec.language.bm.Rule$Phoneme r1 = new org.apache.commons.codec.language.bm.Rule$Phoneme
                java.lang.String r2 = ""
                r1.<init>(r2, r3)
                r0.<init>(r1)
                return r0
        }

        static /* synthetic */ void lambda$append$0(java.lang.CharSequence r0, org.apache.commons.codec.language.bm.Rule.Phoneme r1) {
                r1.append(r0)
                return
        }

        public void append(java.lang.CharSequence r3) {
                r2 = this;
                java.util.Set<org.apache.commons.codec.language.bm.Rule$Phoneme> r0 = r2.phonemes
                org.apache.commons.codec.language.bm.PhoneticEngine$PhonemeBuilder$$ExternalSyntheticLambda1 r1 = new org.apache.commons.codec.language.bm.PhoneticEngine$PhonemeBuilder$$ExternalSyntheticLambda1
                r1.<init>(r3)
                r0.forEach(r1)
                return
        }

        public void apply(org.apache.commons.codec.language.bm.Rule.PhonemeExpr r8, int r9) {
                r7 = this;
                java.util.LinkedHashSet r0 = new java.util.LinkedHashSet
                java.util.Set<org.apache.commons.codec.language.bm.Rule$Phoneme> r1 = r7.phonemes
                int r1 = r1.size()
                int r2 = r8.size()
                int r1 = r1 * r2
                int r1 = java.lang.Math.min(r1, r9)
                r0.<init>(r1)
                java.util.Set<org.apache.commons.codec.language.bm.Rule$Phoneme> r1 = r7.phonemes
                java.util.Iterator r1 = r1.iterator()
            L1a:
                boolean r2 = r1.hasNext()
                if (r2 == 0) goto L60
                java.lang.Object r2 = r1.next()
                org.apache.commons.codec.language.bm.Rule$Phoneme r2 = (org.apache.commons.codec.language.bm.Rule.Phoneme) r2
                java.lang.Iterable r3 = r8.getPhonemes()
                java.util.Iterator r3 = r3.iterator()
            L2e:
                boolean r4 = r3.hasNext()
                if (r4 == 0) goto L1a
                java.lang.Object r4 = r3.next()
                org.apache.commons.codec.language.bm.Rule$Phoneme r4 = (org.apache.commons.codec.language.bm.Rule.Phoneme) r4
                org.apache.commons.codec.language.bm.Languages$LanguageSet r5 = r2.getLanguages()
                org.apache.commons.codec.language.bm.Languages$LanguageSet r6 = r4.getLanguages()
                org.apache.commons.codec.language.bm.Languages$LanguageSet r5 = r5.restrictTo(r6)
                boolean r6 = r5.isEmpty()
                if (r6 != 0) goto L2e
                org.apache.commons.codec.language.bm.Rule$Phoneme r6 = new org.apache.commons.codec.language.bm.Rule$Phoneme
                r6.<init>(r2, r4, r5)
                int r4 = r0.size()
                if (r4 >= r9) goto L2e
                r0.add(r6)
                int r4 = r0.size()
                if (r4 < r9) goto L2e
            L60:
                java.util.Set<org.apache.commons.codec.language.bm.Rule$Phoneme> r8 = r7.phonemes
                r8.clear()
                java.util.Set<org.apache.commons.codec.language.bm.Rule$Phoneme> r8 = r7.phonemes
                r8.addAll(r0)
                return
        }

        public java.util.Set<org.apache.commons.codec.language.bm.Rule.Phoneme> getPhonemes() {
                r1 = this;
                java.util.Set<org.apache.commons.codec.language.bm.Rule$Phoneme> r0 = r1.phonemes
                return r0
        }

        public java.lang.String makeString() {
                r2 = this;
                java.util.Set<org.apache.commons.codec.language.bm.Rule$Phoneme> r0 = r2.phonemes
                java.util.stream.Stream r0 = r0.stream()
                org.apache.commons.codec.language.bm.PhoneticEngine$PhonemeBuilder$$ExternalSyntheticLambda0 r1 = new org.apache.commons.codec.language.bm.PhoneticEngine$PhonemeBuilder$$ExternalSyntheticLambda0
                r1.<init>()
                java.util.stream.Stream r0 = r0.map(r1)
                java.lang.String r1 = "|"
                java.util.stream.Collector r1 = java.util.stream.Collectors.joining(r1)
                java.lang.Object r0 = r0.collect(r1)
                java.lang.String r0 = (java.lang.String) r0
                return r0
        }
    }

    private static final class RulesApplication {
        private final java.util.Map<java.lang.String, java.util.List<org.apache.commons.codec.language.bm.Rule>> finalRules;
        private boolean found;
        private int i;
        private final java.lang.CharSequence input;
        private final int maxPhonemes;
        private final org.apache.commons.codec.language.bm.PhoneticEngine.PhonemeBuilder phonemeBuilder;

        public RulesApplication(java.util.Map<java.lang.String, java.util.List<org.apache.commons.codec.language.bm.Rule>> r2, java.lang.CharSequence r3, org.apache.commons.codec.language.bm.PhoneticEngine.PhonemeBuilder r4, int r5, int r6) {
                r1 = this;
                r1.<init>()
                java.lang.String r0 = "finalRules"
                java.util.Objects.requireNonNull(r2, r0)
                r1.finalRules = r2
                r1.phonemeBuilder = r4
                r1.input = r3
                r1.i = r5
                r1.maxPhonemes = r6
                return
        }

        public int getI() {
                r1 = this;
                int r0 = r1.i
                return r0
        }

        public org.apache.commons.codec.language.bm.PhoneticEngine.PhonemeBuilder getPhonemeBuilder() {
                r1 = this;
                org.apache.commons.codec.language.bm.PhoneticEngine$PhonemeBuilder r0 = r1.phonemeBuilder
                return r0
        }

        public org.apache.commons.codec.language.bm.PhoneticEngine.RulesApplication invoke() {
                r6 = this;
                r0 = 0
                r6.found = r0
                java.util.Map<java.lang.String, java.util.List<org.apache.commons.codec.language.bm.Rule>> r0 = r6.finalRules
                java.lang.CharSequence r1 = r6.input
                int r2 = r6.i
                int r3 = r2 + 1
                java.lang.CharSequence r1 = r1.subSequence(r2, r3)
                java.lang.Object r0 = r0.get(r1)
                java.util.List r0 = (java.util.List) r0
                r1 = 1
                if (r0 == 0) goto L4c
                java.util.Iterator r0 = r0.iterator()
                r2 = r1
            L1d:
                boolean r3 = r0.hasNext()
                if (r3 == 0) goto L4d
                java.lang.Object r2 = r0.next()
                org.apache.commons.codec.language.bm.Rule r2 = (org.apache.commons.codec.language.bm.Rule) r2
                java.lang.String r3 = r2.getPattern()
                int r3 = r3.length()
                java.lang.CharSequence r4 = r6.input
                int r5 = r6.i
                boolean r4 = r2.patternAndContextMatches(r4, r5)
                if (r4 == 0) goto L4a
                org.apache.commons.codec.language.bm.PhoneticEngine$PhonemeBuilder r0 = r6.phonemeBuilder
                org.apache.commons.codec.language.bm.Rule$PhonemeExpr r2 = r2.getPhoneme()
                int r4 = r6.maxPhonemes
                r0.apply(r2, r4)
                r6.found = r1
                r2 = r3
                goto L4d
            L4a:
                r2 = r3
                goto L1d
            L4c:
                r2 = r1
            L4d:
                boolean r0 = r6.found
                if (r0 != 0) goto L52
                goto L53
            L52:
                r1 = r2
            L53:
                int r0 = r6.i
                int r0 = r0 + r1
                r6.i = r0
                return r6
        }

        public boolean isFound() {
                r1 = this;
                boolean r0 = r1.found
                return r0
        }
    }

    static {
            java.util.EnumMap r0 = new java.util.EnumMap
            java.lang.Class<org.apache.commons.codec.language.bm.NameType> r1 = org.apache.commons.codec.language.bm.NameType.class
            r0.<init>(r1)
            org.apache.commons.codec.language.bm.PhoneticEngine.NAME_PREFIXES = r0
            org.apache.commons.codec.language.bm.NameType r1 = org.apache.commons.codec.language.bm.NameType.ASHKENAZI
            java.util.HashSet r2 = new java.util.HashSet
            r3 = 6
            java.lang.String[] r4 = new java.lang.String[r3]
            java.lang.String r5 = "bar"
            r6 = 0
            r4[r6] = r5
            java.lang.String r5 = "ben"
            r7 = 1
            r4[r7] = r5
            r5 = 2
            java.lang.String r8 = "da"
            r4[r5] = r8
            r9 = 3
            java.lang.String r10 = "de"
            r4[r9] = r10
            r11 = 4
            java.lang.String r12 = "van"
            r4[r11] = r12
            r13 = 5
            java.lang.String r14 = "von"
            r4[r13] = r14
            java.util.List r4 = java.util.Arrays.asList(r4)
            r2.<init>(r4)
            java.util.Set r2 = java.util.Collections.unmodifiableSet(r2)
            r0.put(r1, r2)
            org.apache.commons.codec.language.bm.NameType r1 = org.apache.commons.codec.language.bm.NameType.SEPHARDIC
            java.util.HashSet r2 = new java.util.HashSet
            r4 = 16
            java.lang.String[] r4 = new java.lang.String[r4]
            java.lang.String r15 = "al"
            r4[r6] = r15
            java.lang.String r15 = "el"
            r4[r7] = r15
            r4[r5] = r8
            java.lang.String r15 = "dal"
            r4[r9] = r15
            r4[r11] = r10
            java.lang.String r16 = "del"
            r4[r13] = r16
            java.lang.String r17 = "dela"
            r4[r3] = r17
            r18 = 7
            java.lang.String r19 = "de la"
            r4[r18] = r19
            r20 = 8
            java.lang.String r21 = "della"
            r4[r20] = r21
            r22 = 9
            java.lang.String r23 = "des"
            r4[r22] = r23
            r24 = 10
            java.lang.String r25 = "di"
            r4[r24] = r25
            r26 = 11
            java.lang.String r27 = "do"
            r4[r26] = r27
            r26 = 12
            java.lang.String r27 = "dos"
            r4[r26] = r27
            r26 = 13
            java.lang.String r27 = "du"
            r4[r26] = r27
            r26 = 14
            r4[r26] = r12
            r26 = 15
            r4[r26] = r14
            java.util.List r4 = java.util.Arrays.asList(r4)
            r2.<init>(r4)
            java.util.Set r2 = java.util.Collections.unmodifiableSet(r2)
            r0.put(r1, r2)
            org.apache.commons.codec.language.bm.NameType r1 = org.apache.commons.codec.language.bm.NameType.GENERIC
            java.util.HashSet r2 = new java.util.HashSet
            r4 = 14
            java.lang.String[] r4 = new java.lang.String[r4]
            r4[r6] = r8
            r4[r7] = r15
            r4[r5] = r10
            r4[r9] = r16
            r4[r11] = r17
            r4[r13] = r19
            r4[r3] = r21
            r4[r18] = r23
            r4[r20] = r25
            java.lang.String r3 = "do"
            r4[r22] = r3
            java.lang.String r3 = "dos"
            r4[r24] = r3
            r3 = 11
            java.lang.String r5 = "du"
            r4[r3] = r5
            r3 = 12
            r4[r3] = r12
            r3 = 13
            r4[r3] = r14
            java.util.List r3 = java.util.Arrays.asList(r4)
            r2.<init>(r3)
            java.util.Set r2 = java.util.Collections.unmodifiableSet(r2)
            r0.put(r1, r2)
            return
    }

    public PhoneticEngine(org.apache.commons.codec.language.bm.NameType r2, org.apache.commons.codec.language.bm.RuleType r3, boolean r4) {
            r1 = this;
            r0 = 20
            r1.<init>(r2, r3, r4, r0)
            return
    }

    public PhoneticEngine(org.apache.commons.codec.language.bm.NameType r2, org.apache.commons.codec.language.bm.RuleType r3, boolean r4, int r5) {
            r1 = this;
            r1.<init>()
            org.apache.commons.codec.language.bm.RuleType r0 = org.apache.commons.codec.language.bm.RuleType.RULES
            if (r3 == r0) goto L16
            r1.nameType = r2
            r1.ruleType = r3
            r1.concat = r4
            org.apache.commons.codec.language.bm.Lang r2 = org.apache.commons.codec.language.bm.Lang.instance(r2)
            r1.lang = r2
            r1.maxPhonemes = r5
            return
        L16:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "ruleType must not be "
            r3.<init>(r4)
            org.apache.commons.codec.language.bm.RuleType r4 = org.apache.commons.codec.language.bm.RuleType.RULES
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.String r3 = r3.toString()
            r2.<init>(r3)
            throw r2
    }

    private org.apache.commons.codec.language.bm.PhoneticEngine.PhonemeBuilder applyFinalRules(org.apache.commons.codec.language.bm.PhoneticEngine.PhonemeBuilder r3, java.util.Map<java.lang.String, java.util.List<org.apache.commons.codec.language.bm.Rule>> r4) {
            r2 = this;
            java.lang.String r0 = "finalRules"
            java.util.Objects.requireNonNull(r4, r0)
            boolean r0 = r4.isEmpty()
            if (r0 == 0) goto Lc
            return r3
        Lc:
            java.util.TreeMap r0 = new java.util.TreeMap
            java.util.Comparator<org.apache.commons.codec.language.bm.Rule$Phoneme> r1 = org.apache.commons.codec.language.bm.Rule.Phoneme.COMPARATOR
            r0.<init>(r1)
            java.util.Set r3 = r3.getPhonemes()
            org.apache.commons.codec.language.bm.PhoneticEngine$$ExternalSyntheticLambda3 r1 = new org.apache.commons.codec.language.bm.PhoneticEngine$$ExternalSyntheticLambda3
            r1.<init>(r2, r4, r0)
            r3.forEach(r1)
            org.apache.commons.codec.language.bm.PhoneticEngine$PhonemeBuilder r3 = new org.apache.commons.codec.language.bm.PhoneticEngine$PhonemeBuilder
            java.util.Set r4 = r0.keySet()
            r0 = 0
            r3.<init>(r4, r0)
            return r3
    }

    private static java.lang.String join(java.util.List<java.lang.String> r0, java.lang.String r1) {
            java.util.stream.Stream r0 = r0.stream()
            java.util.stream.Collector r1 = java.util.stream.Collectors.joining(r1)
            java.lang.Object r0 = r0.collect(r1)
            java.lang.String r0 = (java.lang.String) r0
            return r0
    }

    static /* synthetic */ void lambda$applyFinalRules$0(java.util.Map r1, org.apache.commons.codec.language.bm.Rule.Phoneme r2) {
            boolean r0 = r1.containsKey(r2)
            if (r0 == 0) goto L18
            java.lang.Object r0 = r1.remove(r2)
            org.apache.commons.codec.language.bm.Rule$Phoneme r0 = (org.apache.commons.codec.language.bm.Rule.Phoneme) r0
            org.apache.commons.codec.language.bm.Languages$LanguageSet r2 = r2.getLanguages()
            org.apache.commons.codec.language.bm.Rule$Phoneme r2 = r0.mergeWithLanguage(r2)
            r1.put(r2, r2)
            goto L1b
        L18:
            r1.put(r2, r2)
        L1b:
            return
    }

    static /* synthetic */ void lambda$encode$2(java.util.List r2, java.lang.String r3) {
            java.lang.String r0 = "'"
            r1 = -1
            java.lang.String[] r3 = r3.split(r0, r1)
            int r0 = r3.length
            int r0 = r0 + (-1)
            r3 = r3[r0]
            r2.add(r3)
            return
    }

    public java.lang.String encode(java.lang.String r2) {
            r1 = this;
            org.apache.commons.codec.language.bm.Lang r0 = r1.lang
            org.apache.commons.codec.language.bm.Languages$LanguageSet r0 = r0.guessLanguages(r2)
            java.lang.String r2 = r1.encode(r2, r0)
            return r2
    }

    public java.lang.String encode(java.lang.String r13, org.apache.commons.codec.language.bm.Languages.LanguageSet r14) {
            r12 = this;
            org.apache.commons.codec.language.bm.NameType r0 = r12.nameType
            org.apache.commons.codec.language.bm.RuleType r1 = org.apache.commons.codec.language.bm.RuleType.RULES
            java.util.Map r0 = org.apache.commons.codec.language.bm.Rule.getInstanceMap(r0, r1, r14)
            org.apache.commons.codec.language.bm.NameType r1 = r12.nameType
            org.apache.commons.codec.language.bm.RuleType r2 = r12.ruleType
            java.lang.String r3 = "common"
            java.util.Map r1 = org.apache.commons.codec.language.bm.Rule.getInstanceMap(r1, r2, r3)
            org.apache.commons.codec.language.bm.NameType r2 = r12.nameType
            org.apache.commons.codec.language.bm.RuleType r3 = r12.ruleType
            java.util.Map r8 = org.apache.commons.codec.language.bm.Rule.getInstanceMap(r2, r3, r14)
            java.util.Locale r2 = java.util.Locale.ENGLISH
            java.lang.String r13 = r13.toLowerCase(r2)
            r2 = 45
            r3 = 32
            java.lang.String r13 = r13.replace(r2, r3)
            java.lang.String r13 = r13.trim()
            org.apache.commons.codec.language.bm.NameType r2 = r12.nameType
            org.apache.commons.codec.language.bm.NameType r3 = org.apache.commons.codec.language.bm.NameType.GENERIC
            java.lang.String r4 = " "
            r5 = 2
            r6 = 1
            if (r2 != r3) goto Le6
            java.lang.String r2 = "d'"
            boolean r2 = r13.startsWith(r2)
            java.lang.String r3 = ")"
            java.lang.String r7 = ")-("
            java.lang.String r9 = "("
            if (r2 == 0) goto L79
            java.lang.String r13 = r13.substring(r5)
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            java.lang.String r0 = "d"
            r14.<init>(r0)
            java.lang.StringBuilder r14 = r14.append(r13)
            java.lang.String r14 = r14.toString()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r9)
            java.lang.String r13 = r12.encode(r13)
            java.lang.StringBuilder r13 = r0.append(r13)
            java.lang.StringBuilder r13 = r13.append(r7)
            java.lang.String r14 = r12.encode(r14)
            java.lang.StringBuilder r13 = r13.append(r14)
            java.lang.StringBuilder r13 = r13.append(r3)
            java.lang.String r13 = r13.toString()
            return r13
        L79:
            java.util.Map<org.apache.commons.codec.language.bm.NameType, java.util.Set<java.lang.String>> r2 = org.apache.commons.codec.language.bm.PhoneticEngine.NAME_PREFIXES
            org.apache.commons.codec.language.bm.NameType r10 = r12.nameType
            java.lang.Object r2 = r2.get(r10)
            java.util.Set r2 = (java.util.Set) r2
            java.util.Iterator r2 = r2.iterator()
        L87:
            boolean r10 = r2.hasNext()
            if (r10 == 0) goto Le6
            java.lang.Object r10 = r2.next()
            java.lang.String r10 = (java.lang.String) r10
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.StringBuilder r11 = r11.append(r10)
            java.lang.StringBuilder r11 = r11.append(r4)
            java.lang.String r11 = r11.toString()
            boolean r11 = r13.startsWith(r11)
            if (r11 == 0) goto L87
            int r14 = r10.length()
            int r14 = r14 + r6
            java.lang.String r13 = r13.substring(r14)
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>()
            java.lang.StringBuilder r14 = r14.append(r10)
            java.lang.StringBuilder r14 = r14.append(r13)
            java.lang.String r14 = r14.toString()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r9)
            java.lang.String r13 = r12.encode(r13)
            java.lang.StringBuilder r13 = r0.append(r13)
            java.lang.StringBuilder r13 = r13.append(r7)
            java.lang.String r14 = r12.encode(r14)
            java.lang.StringBuilder r13 = r13.append(r14)
            java.lang.StringBuilder r13 = r13.append(r3)
            java.lang.String r13 = r13.toString()
            return r13
        Le6:
            java.lang.String r2 = "\\s+"
            java.lang.String[] r2 = r13.split(r2)
            java.util.List r2 = java.util.Arrays.asList(r2)
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            int[] r7 = org.apache.commons.codec.language.bm.PhoneticEngine.AnonymousClass1.$SwitchMap$org$apache$commons$codec$language$bm$NameType
            org.apache.commons.codec.language.bm.NameType r9 = r12.nameType
            int r9 = r9.ordinal()
            r7 = r7[r9]
            if (r7 == r6) goto L132
            if (r7 == r5) goto L121
            r5 = 3
            if (r7 != r5) goto L10a
            r3.addAll(r2)
            goto L147
        L10a:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            java.lang.String r0 = "Unreachable case: "
            r14.<init>(r0)
            org.apache.commons.codec.language.bm.NameType r0 = r12.nameType
            java.lang.StringBuilder r14 = r14.append(r0)
            java.lang.String r14 = r14.toString()
            r13.<init>(r14)
            throw r13
        L121:
            r3.addAll(r2)
            java.util.Map<org.apache.commons.codec.language.bm.NameType, java.util.Set<java.lang.String>> r5 = org.apache.commons.codec.language.bm.PhoneticEngine.NAME_PREFIXES
            org.apache.commons.codec.language.bm.NameType r7 = r12.nameType
            java.lang.Object r5 = r5.get(r7)
            java.util.Collection r5 = (java.util.Collection) r5
            r3.removeAll(r5)
            goto L147
        L132:
            org.apache.commons.codec.language.bm.PhoneticEngine$$ExternalSyntheticLambda0 r5 = new org.apache.commons.codec.language.bm.PhoneticEngine$$ExternalSyntheticLambda0
            r5.<init>(r3)
            r2.forEach(r5)
            java.util.Map<org.apache.commons.codec.language.bm.NameType, java.util.Set<java.lang.String>> r5 = org.apache.commons.codec.language.bm.PhoneticEngine.NAME_PREFIXES
            org.apache.commons.codec.language.bm.NameType r7 = r12.nameType
            java.lang.Object r5 = r5.get(r7)
            java.util.Collection r5 = (java.util.Collection) r5
            r3.removeAll(r5)
        L147:
            boolean r5 = r12.concat
            if (r5 == 0) goto L150
            java.lang.String r13 = join(r3, r4)
            goto L179
        L150:
            int r4 = r3.size()
            if (r4 != r6) goto L161
            java.util.Iterator r13 = r2.iterator()
            java.lang.Object r13 = r13.next()
            java.lang.String r13 = (java.lang.String) r13
            goto L179
        L161:
            boolean r2 = r3.isEmpty()
            if (r2 != 0) goto L179
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            org.apache.commons.codec.language.bm.PhoneticEngine$$ExternalSyntheticLambda1 r14 = new org.apache.commons.codec.language.bm.PhoneticEngine$$ExternalSyntheticLambda1
            r14.<init>(r12, r13)
            r3.forEach(r14)
            java.lang.String r13 = r13.substring(r6)
            return r13
        L179:
            org.apache.commons.codec.language.bm.PhoneticEngine$PhonemeBuilder r14 = org.apache.commons.codec.language.bm.PhoneticEngine.PhonemeBuilder.empty(r14)
            r2 = 0
            r5 = r14
            r6 = r2
        L180:
            int r14 = r13.length()
            if (r6 >= r14) goto L19d
            org.apache.commons.codec.language.bm.PhoneticEngine$RulesApplication r14 = new org.apache.commons.codec.language.bm.PhoneticEngine$RulesApplication
            int r7 = r12.maxPhonemes
            r2 = r14
            r3 = r0
            r4 = r13
            r2.<init>(r3, r4, r5, r6, r7)
            org.apache.commons.codec.language.bm.PhoneticEngine$RulesApplication r14 = r14.invoke()
            int r6 = r14.getI()
            org.apache.commons.codec.language.bm.PhoneticEngine$PhonemeBuilder r5 = r14.getPhonemeBuilder()
            goto L180
        L19d:
            org.apache.commons.codec.language.bm.PhoneticEngine$PhonemeBuilder r13 = r12.applyFinalRules(r5, r1)
            org.apache.commons.codec.language.bm.PhoneticEngine$PhonemeBuilder r13 = r12.applyFinalRules(r13, r8)
            java.lang.String r13 = r13.makeString()
            return r13
    }

    public org.apache.commons.codec.language.bm.Lang getLang() {
            r1 = this;
            org.apache.commons.codec.language.bm.Lang r0 = r1.lang
            return r0
    }

    public int getMaxPhonemes() {
            r1 = this;
            int r0 = r1.maxPhonemes
            return r0
    }

    public org.apache.commons.codec.language.bm.NameType getNameType() {
            r1 = this;
            org.apache.commons.codec.language.bm.NameType r0 = r1.nameType
            return r0
    }

    public org.apache.commons.codec.language.bm.RuleType getRuleType() {
            r1 = this;
            org.apache.commons.codec.language.bm.RuleType r0 = r1.ruleType
            return r0
    }

    public boolean isConcat() {
            r1 = this;
            boolean r0 = r1.concat
            return r0
    }

    /* JADX INFO: renamed from: lambda$applyFinalRules$1$org-apache-commons-codec-language-bm-PhoneticEngine, reason: not valid java name */
    /* synthetic */ void m2537xf7464fbc(java.util.Map r9, java.util.Map r10, org.apache.commons.codec.language.bm.Rule.Phoneme r11) {
            r8 = this;
            org.apache.commons.codec.language.bm.Languages$LanguageSet r0 = r11.getLanguages()
            org.apache.commons.codec.language.bm.PhoneticEngine$PhonemeBuilder r0 = org.apache.commons.codec.language.bm.PhoneticEngine.PhonemeBuilder.empty(r0)
            java.lang.CharSequence r11 = r11.getPhonemeText()
            java.lang.String r11 = r11.toString()
            r1 = 0
            r4 = r0
            r0 = r1
        L13:
            int r1 = r11.length()
            if (r0 >= r1) goto L40
            org.apache.commons.codec.language.bm.PhoneticEngine$RulesApplication r7 = new org.apache.commons.codec.language.bm.PhoneticEngine$RulesApplication
            int r6 = r8.maxPhonemes
            r1 = r7
            r2 = r9
            r3 = r11
            r5 = r0
            r1.<init>(r2, r3, r4, r5, r6)
            org.apache.commons.codec.language.bm.PhoneticEngine$RulesApplication r1 = r7.invoke()
            boolean r2 = r1.isFound()
            org.apache.commons.codec.language.bm.PhoneticEngine$PhonemeBuilder r4 = r1.getPhonemeBuilder()
            if (r2 != 0) goto L3b
            int r2 = r0 + 1
            java.lang.CharSequence r0 = r11.subSequence(r0, r2)
            r4.append(r0)
        L3b:
            int r0 = r1.getI()
            goto L13
        L40:
            java.util.Set r9 = r4.getPhonemes()
            org.apache.commons.codec.language.bm.PhoneticEngine$$ExternalSyntheticLambda2 r11 = new org.apache.commons.codec.language.bm.PhoneticEngine$$ExternalSyntheticLambda2
            r11.<init>(r10)
            r9.forEach(r11)
            return
    }

    /* JADX INFO: renamed from: lambda$encode$3$org-apache-commons-codec-language-bm-PhoneticEngine, reason: not valid java name */
    /* synthetic */ void m2538xb393c13f(java.lang.StringBuilder r2, java.lang.String r3) {
            r1 = this;
            java.lang.String r0 = "-"
            java.lang.StringBuilder r2 = r2.append(r0)
            java.lang.String r3 = r1.encode(r3)
            r2.append(r3)
            return
    }
}
