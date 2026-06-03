package org.apache.commons.codec.language;

/* JADX INFO: loaded from: classes2.dex */
public class DaitchMokotoffSoundex implements org.apache.commons.codec.StringEncoder {
    private static final java.lang.String COMMENT = "//";
    private static final java.lang.String DOUBLE_QUOTE = "\"";
    private static final java.util.Map<java.lang.Character, java.lang.Character> FOLDINGS = null;
    private static final int MAX_LENGTH = 6;
    private static final java.lang.String MULTILINE_COMMENT_END = "*/";
    private static final java.lang.String MULTILINE_COMMENT_START = "/*";
    private static final java.lang.String RESOURCE_FILE = "org/apache/commons/codec/language/dmrules.txt";
    private static final java.util.Map<java.lang.Character, java.util.List<org.apache.commons.codec.language.DaitchMokotoffSoundex.Rule>> RULES = null;
    private final boolean folding;

    /* JADX INFO: renamed from: org.apache.commons.codec.language.DaitchMokotoffSoundex$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
    }

    private static final class Branch {
        private final java.lang.StringBuilder builder;
        private java.lang.String cachedString;
        private java.lang.String lastReplacement;

        private Branch() {
                r1 = this;
                r1.<init>()
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                r1.builder = r0
                r0 = 0
                r1.lastReplacement = r0
                r1.cachedString = r0
                return
        }

        /* synthetic */ Branch(org.apache.commons.codec.language.DaitchMokotoffSoundex.AnonymousClass1 r1) {
                r0 = this;
                r0.<init>()
                return
        }

        public org.apache.commons.codec.language.DaitchMokotoffSoundex.Branch createBranch() {
                r3 = this;
                org.apache.commons.codec.language.DaitchMokotoffSoundex$Branch r0 = new org.apache.commons.codec.language.DaitchMokotoffSoundex$Branch
                r0.<init>()
                java.lang.StringBuilder r1 = r0.builder
                java.lang.String r2 = r3.toString()
                r1.append(r2)
                java.lang.String r1 = r3.lastReplacement
                r0.lastReplacement = r1
                return r0
        }

        public boolean equals(java.lang.Object r2) {
                r1 = this;
                if (r1 != r2) goto L4
                r2 = 1
                return r2
            L4:
                boolean r0 = r2 instanceof org.apache.commons.codec.language.DaitchMokotoffSoundex.Branch
                if (r0 != 0) goto La
                r2 = 0
                return r2
            La:
                java.lang.String r0 = r1.toString()
                org.apache.commons.codec.language.DaitchMokotoffSoundex$Branch r2 = (org.apache.commons.codec.language.DaitchMokotoffSoundex.Branch) r2
                java.lang.String r2 = r2.toString()
                boolean r2 = r0.equals(r2)
                return r2
        }

        public void finish() {
                r2 = this;
            L0:
                java.lang.StringBuilder r0 = r2.builder
                int r0 = r0.length()
                r1 = 6
                if (r0 >= r1) goto L14
                java.lang.StringBuilder r0 = r2.builder
                r1 = 48
                r0.append(r1)
                r0 = 0
                r2.cachedString = r0
                goto L0
            L14:
                return
        }

        public int hashCode() {
                r1 = this;
                java.lang.String r0 = r1.toString()
                int r0 = r0.hashCode()
                return r0
        }

        public void processNextReplacement(java.lang.String r3, boolean r4) {
                r2 = this;
                java.lang.String r0 = r2.lastReplacement
                if (r0 == 0) goto Lc
                boolean r0 = r0.endsWith(r3)
                if (r0 == 0) goto Lc
                if (r4 == 0) goto L2e
            Lc:
                java.lang.StringBuilder r4 = r2.builder
                int r4 = r4.length()
                r0 = 6
                if (r4 >= r0) goto L2e
                java.lang.StringBuilder r4 = r2.builder
                r4.append(r3)
                java.lang.StringBuilder r4 = r2.builder
                int r4 = r4.length()
                if (r4 <= r0) goto L2b
                java.lang.StringBuilder r4 = r2.builder
                int r1 = r4.length()
                r4.delete(r0, r1)
            L2b:
                r4 = 0
                r2.cachedString = r4
            L2e:
                r2.lastReplacement = r3
                return
        }

        public java.lang.String toString() {
                r1 = this;
                java.lang.String r0 = r1.cachedString
                if (r0 != 0) goto Lc
                java.lang.StringBuilder r0 = r1.builder
                java.lang.String r0 = r0.toString()
                r1.cachedString = r0
            Lc:
                java.lang.String r0 = r1.cachedString
                return r0
        }
    }

    private static final class Rule {
        private final java.lang.String pattern;
        private final java.lang.String[] replacementAtStart;
        private final java.lang.String[] replacementBeforeVowel;
        private final java.lang.String[] replacementDefault;

        protected Rule(java.lang.String r1, java.lang.String r2, java.lang.String r3, java.lang.String r4) {
                r0 = this;
                r0.<init>()
                r0.pattern = r1
                java.lang.String r1 = "\\|"
                java.lang.String[] r2 = r2.split(r1)
                r0.replacementAtStart = r2
                java.lang.String[] r2 = r3.split(r1)
                r0.replacementBeforeVowel = r2
                java.lang.String[] r1 = r4.split(r1)
                r0.replacementDefault = r1
                return
        }

        static /* synthetic */ java.lang.String access$000(org.apache.commons.codec.language.DaitchMokotoffSoundex.Rule r0) {
                java.lang.String r0 = r0.pattern
                return r0
        }

        private boolean isVowel(char r2) {
                r1 = this;
                r0 = 97
                if (r2 == r0) goto L17
                r0 = 101(0x65, float:1.42E-43)
                if (r2 == r0) goto L17
                r0 = 105(0x69, float:1.47E-43)
                if (r2 == r0) goto L17
                r0 = 111(0x6f, float:1.56E-43)
                if (r2 == r0) goto L17
                r0 = 117(0x75, float:1.64E-43)
                if (r2 != r0) goto L15
                goto L17
            L15:
                r2 = 0
                goto L18
            L17:
                r2 = 1
            L18:
                return r2
        }

        public int getPatternLength() {
                r1 = this;
                java.lang.String r0 = r1.pattern
                int r0 = r0.length()
                return r0
        }

        public java.lang.String[] getReplacements(java.lang.String r2, boolean r3) {
                r1 = this;
                if (r3 == 0) goto L5
                java.lang.String[] r2 = r1.replacementAtStart
                return r2
            L5:
                int r3 = r1.getPatternLength()
                int r0 = r2.length()
                if (r3 >= r0) goto L1c
                char r2 = r2.charAt(r3)
                boolean r2 = r1.isVowel(r2)
                if (r2 == 0) goto L1c
                java.lang.String[] r2 = r1.replacementBeforeVowel
                return r2
            L1c:
                java.lang.String[] r2 = r1.replacementDefault
                return r2
        }

        public boolean matches(java.lang.String r2) {
                r1 = this;
                java.lang.String r0 = r1.pattern
                boolean r2 = r2.startsWith(r0)
                return r2
        }

        public java.lang.String toString() {
                r4 = this;
                java.lang.String r0 = r4.pattern
                java.lang.String[] r1 = r4.replacementAtStart
                java.util.List r1 = java.util.Arrays.asList(r1)
                java.lang.String[] r2 = r4.replacementBeforeVowel
                java.util.List r2 = java.util.Arrays.asList(r2)
                java.lang.String[] r3 = r4.replacementDefault
                java.util.List r3 = java.util.Arrays.asList(r3)
                java.lang.Object[] r0 = new java.lang.Object[]{r0, r1, r2, r3}
                java.lang.String r1 = "%s=(%s,%s,%s)"
                java.lang.String r0 = java.lang.String.format(r1, r0)
                return r0
        }
    }

    static {
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            org.apache.commons.codec.language.DaitchMokotoffSoundex.RULES = r0
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            org.apache.commons.codec.language.DaitchMokotoffSoundex.FOLDINGS = r1
            java.util.Scanner r2 = new java.util.Scanner
            java.lang.String r3 = "org/apache/commons/codec/language/dmrules.txt"
            java.io.InputStream r4 = org.apache.commons.codec.Resources.getInputStream(r3)
            java.lang.String r5 = org.apache.commons.codec.CharEncoding.UTF_8
            r2.<init>(r4, r5)
            parseRules(r2, r3, r0, r1)     // Catch: java.lang.Throwable -> L2a
            r2.close()
            org.apache.commons.codec.language.DaitchMokotoffSoundex$$ExternalSyntheticLambda2 r1 = new org.apache.commons.codec.language.DaitchMokotoffSoundex$$ExternalSyntheticLambda2
            r1.<init>()
            r0.forEach(r1)
            return
        L2a:
            r0 = move-exception
            r2.close()     // Catch: java.lang.Throwable -> L2f
            goto L33
        L2f:
            r1 = move-exception
            r0.addSuppressed(r1)
        L33:
            throw r0
    }

    public DaitchMokotoffSoundex() {
            r1 = this;
            r0 = 1
            r1.<init>(r0)
            return
    }

    public DaitchMokotoffSoundex(boolean r1) {
            r0 = this;
            r0.<init>()
            r0.folding = r1
            return
    }

    private java.lang.String cleanup(java.lang.String r7) {
            r6 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            char[] r7 = r7.toCharArray()
            int r1 = r7.length
            r2 = 0
        Lb:
            if (r2 >= r1) goto L36
            char r3 = r7[r2]
            boolean r4 = java.lang.Character.isWhitespace(r3)
            if (r4 == 0) goto L16
            goto L33
        L16:
            char r3 = java.lang.Character.toLowerCase(r3)
            java.util.Map<java.lang.Character, java.lang.Character> r4 = org.apache.commons.codec.language.DaitchMokotoffSoundex.FOLDINGS
            java.lang.Character r5 = java.lang.Character.valueOf(r3)
            java.lang.Object r4 = r4.get(r5)
            java.lang.Character r4 = (java.lang.Character) r4
            boolean r5 = r6.folding
            if (r5 == 0) goto L30
            if (r4 == 0) goto L30
            char r3 = r4.charValue()
        L30:
            r0.append(r3)
        L33:
            int r2 = r2 + 1
            goto Lb
        L36:
            java.lang.String r7 = r0.toString()
            return r7
    }

    static /* synthetic */ java.util.List lambda$parseRules$2(java.lang.Character r0) {
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            return r0
    }

    static /* synthetic */ int lambda$static$0(org.apache.commons.codec.language.DaitchMokotoffSoundex.Rule r0, org.apache.commons.codec.language.DaitchMokotoffSoundex.Rule r1) {
            int r1 = r1.getPatternLength()
            int r0 = r0.getPatternLength()
            int r1 = r1 - r0
            return r1
    }

    static /* synthetic */ void lambda$static$1(java.lang.Character r0, java.util.List r1) {
            org.apache.commons.codec.language.DaitchMokotoffSoundex$$ExternalSyntheticLambda1 r0 = new org.apache.commons.codec.language.DaitchMokotoffSoundex$$ExternalSyntheticLambda1
            r0.<init>()
            r1.sort(r0)
            return
    }

    private static void parseRules(java.util.Scanner r11, java.lang.String r12, java.util.Map<java.lang.Character, java.util.List<org.apache.commons.codec.language.DaitchMokotoffSoundex.Rule>> r13, java.util.Map<java.lang.Character, java.lang.Character> r14) {
            r0 = 0
            r1 = r0
            r2 = r1
        L3:
            boolean r3 = r11.hasNextLine()
            if (r3 == 0) goto L143
            r3 = 1
            int r1 = r1 + r3
            java.lang.String r4 = r11.nextLine()
            if (r2 == 0) goto L1b
            java.lang.String r3 = "*/"
            boolean r3 = r4.endsWith(r3)
            if (r3 == 0) goto L3
            r2 = r0
            goto L3
        L1b:
            java.lang.String r5 = "/*"
            boolean r5 = r4.startsWith(r5)
            if (r5 == 0) goto L25
            r2 = r3
            goto L3
        L25:
            java.lang.String r5 = "//"
            int r5 = r4.indexOf(r5)
            if (r5 < 0) goto L32
            java.lang.String r5 = r4.substring(r0, r5)
            goto L33
        L32:
            r5 = r4
        L33:
            java.lang.String r5 = r5.trim()
            boolean r6 = r5.isEmpty()
            if (r6 == 0) goto L3e
            goto L3
        L3e:
            java.lang.String r6 = "="
            boolean r7 = r5.contains(r6)
            java.lang.String r8 = " parts: "
            r9 = 2
            java.lang.String r10 = " in "
            if (r7 == 0) goto Lb9
            java.lang.String[] r5 = r5.split(r6)
            int r6 = r5.length
            if (r6 != r9) goto L93
            r6 = r5[r0]
            r5 = r5[r3]
            int r7 = r6.length()
            if (r7 != r3) goto L76
            int r7 = r5.length()
            if (r7 != r3) goto L76
            char r3 = r6.charAt(r0)
            java.lang.Character r3 = java.lang.Character.valueOf(r3)
            char r4 = r5.charAt(r0)
            java.lang.Character r4 = java.lang.Character.valueOf(r4)
            r14.put(r3, r4)
            goto L3
        L76:
            java.lang.IllegalArgumentException r11 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            java.lang.String r14 = "Malformed folding statement - patterns are not single characters: "
            r13.<init>(r14)
            java.lang.StringBuilder r13 = r13.append(r4)
            java.lang.StringBuilder r13 = r13.append(r10)
            java.lang.StringBuilder r12 = r13.append(r12)
            java.lang.String r12 = r12.toString()
            r11.<init>(r12)
            throw r11
        L93:
            java.lang.IllegalArgumentException r11 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            java.lang.String r14 = "Malformed folding statement split into "
            r13.<init>(r14)
            int r14 = r5.length
            java.lang.StringBuilder r13 = r13.append(r14)
            java.lang.StringBuilder r13 = r13.append(r8)
            java.lang.StringBuilder r13 = r13.append(r4)
            java.lang.StringBuilder r13 = r13.append(r10)
            java.lang.StringBuilder r12 = r13.append(r12)
            java.lang.String r12 = r12.toString()
            r11.<init>(r12)
            throw r11
        Lb9:
            java.lang.String r6 = "\\s+"
            java.lang.String[] r5 = r5.split(r6)
            int r6 = r5.length
            r7 = 4
            if (r6 != r7) goto L11d
            r4 = r5[r0]     // Catch: java.lang.IllegalArgumentException -> Lfd
            java.lang.String r4 = stripQuotes(r4)     // Catch: java.lang.IllegalArgumentException -> Lfd
            r3 = r5[r3]     // Catch: java.lang.IllegalArgumentException -> Lfd
            java.lang.String r3 = stripQuotes(r3)     // Catch: java.lang.IllegalArgumentException -> Lfd
            r6 = r5[r9]     // Catch: java.lang.IllegalArgumentException -> Lfd
            java.lang.String r6 = stripQuotes(r6)     // Catch: java.lang.IllegalArgumentException -> Lfd
            r7 = 3
            r5 = r5[r7]     // Catch: java.lang.IllegalArgumentException -> Lfd
            java.lang.String r5 = stripQuotes(r5)     // Catch: java.lang.IllegalArgumentException -> Lfd
            org.apache.commons.codec.language.DaitchMokotoffSoundex$Rule r7 = new org.apache.commons.codec.language.DaitchMokotoffSoundex$Rule     // Catch: java.lang.IllegalArgumentException -> Lfd
            r7.<init>(r4, r3, r6, r5)     // Catch: java.lang.IllegalArgumentException -> Lfd
            java.lang.String r3 = org.apache.commons.codec.language.DaitchMokotoffSoundex.Rule.access$000(r7)     // Catch: java.lang.IllegalArgumentException -> Lfd
            char r3 = r3.charAt(r0)     // Catch: java.lang.IllegalArgumentException -> Lfd
            java.lang.Character r3 = java.lang.Character.valueOf(r3)     // Catch: java.lang.IllegalArgumentException -> Lfd
            org.apache.commons.codec.language.DaitchMokotoffSoundex$$ExternalSyntheticLambda0 r4 = new org.apache.commons.codec.language.DaitchMokotoffSoundex$$ExternalSyntheticLambda0     // Catch: java.lang.IllegalArgumentException -> Lfd
            r4.<init>()     // Catch: java.lang.IllegalArgumentException -> Lfd
            java.lang.Object r3 = r13.computeIfAbsent(r3, r4)     // Catch: java.lang.IllegalArgumentException -> Lfd
            java.util.List r3 = (java.util.List) r3     // Catch: java.lang.IllegalArgumentException -> Lfd
            r3.add(r7)     // Catch: java.lang.IllegalArgumentException -> Lfd
            goto L3
        Lfd:
            r11 = move-exception
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            java.lang.String r0 = "Problem parsing line '"
            r14.<init>(r0)
            java.lang.StringBuilder r14 = r14.append(r1)
            java.lang.String r0 = "' in "
            java.lang.StringBuilder r14 = r14.append(r0)
            java.lang.StringBuilder r12 = r14.append(r12)
            java.lang.String r12 = r12.toString()
            r13.<init>(r12, r11)
            throw r13
        L11d:
            java.lang.IllegalArgumentException r11 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            java.lang.String r14 = "Malformed rule statement split into "
            r13.<init>(r14)
            int r14 = r5.length
            java.lang.StringBuilder r13 = r13.append(r14)
            java.lang.StringBuilder r13 = r13.append(r8)
            java.lang.StringBuilder r13 = r13.append(r4)
            java.lang.StringBuilder r13 = r13.append(r10)
            java.lang.StringBuilder r12 = r13.append(r12)
            java.lang.String r12 = r12.toString()
            r11.<init>(r12)
            throw r11
        L143:
            return
    }

    private java.lang.String[] soundex(java.lang.String r19, boolean r20) {
            r18 = this;
            r0 = 0
            if (r19 != 0) goto L4
            return r0
        L4:
            java.lang.String r1 = r18.cleanup(r19)
            java.util.LinkedHashSet r2 = new java.util.LinkedHashSet
            r2.<init>()
            org.apache.commons.codec.language.DaitchMokotoffSoundex$Branch r3 = new org.apache.commons.codec.language.DaitchMokotoffSoundex$Branch
            r3.<init>(r0)
            r2.add(r3)
            r3 = 0
            r4 = 0
        L17:
            int r5 = r1.length()
            if (r3 >= r5) goto Ldd
            char r5 = r1.charAt(r3)
            boolean r6 = java.lang.Character.isWhitespace(r5)
            r7 = 1
            if (r6 == 0) goto L29
            goto L3b
        L29:
            java.lang.String r6 = r1.substring(r3)
            java.util.Map<java.lang.Character, java.util.List<org.apache.commons.codec.language.DaitchMokotoffSoundex$Rule>> r8 = org.apache.commons.codec.language.DaitchMokotoffSoundex.RULES
            java.lang.Character r9 = java.lang.Character.valueOf(r5)
            java.lang.Object r8 = r8.get(r9)
            java.util.List r8 = (java.util.List) r8
            if (r8 != 0) goto L40
        L3b:
            r17 = r1
            r1 = r7
            goto Ld8
        L40:
            if (r20 == 0) goto L48
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
            goto L4c
        L48:
            java.util.List r9 = java.util.Collections.emptyList()
        L4c:
            java.util.Iterator r8 = r8.iterator()
        L50:
            boolean r10 = r8.hasNext()
            if (r10 == 0) goto Ld4
            java.lang.Object r10 = r8.next()
            org.apache.commons.codec.language.DaitchMokotoffSoundex$Rule r10 = (org.apache.commons.codec.language.DaitchMokotoffSoundex.Rule) r10
            boolean r11 = r10.matches(r6)
            if (r11 == 0) goto Ld0
            if (r20 == 0) goto L67
            r9.clear()
        L67:
            if (r4 != 0) goto L6b
            r8 = r7
            goto L6c
        L6b:
            r8 = 0
        L6c:
            java.lang.String[] r6 = r10.getReplacements(r6, r8)
            int r8 = r6.length
            if (r8 <= r7) goto L77
            if (r20 == 0) goto L77
            r8 = r7
            goto L78
        L77:
            r8 = 0
        L78:
            java.util.Iterator r11 = r2.iterator()
        L7c:
            boolean r12 = r11.hasNext()
            if (r12 == 0) goto Lbe
            java.lang.Object r12 = r11.next()
            org.apache.commons.codec.language.DaitchMokotoffSoundex$Branch r12 = (org.apache.commons.codec.language.DaitchMokotoffSoundex.Branch) r12
            int r13 = r6.length
            r14 = 0
        L8a:
            if (r14 >= r13) goto Lb8
            r15 = r6[r14]
            if (r8 == 0) goto L97
            org.apache.commons.codec.language.DaitchMokotoffSoundex$Branch r16 = r12.createBranch()
            r0 = r16
            goto L98
        L97:
            r0 = r12
        L98:
            r7 = 110(0x6e, float:1.54E-43)
            r17 = r1
            r1 = 109(0x6d, float:1.53E-43)
            if (r4 != r1) goto La2
            if (r5 == r7) goto La6
        La2:
            if (r4 != r7) goto La8
            if (r5 != r1) goto La8
        La6:
            r1 = 1
            goto La9
        La8:
            r1 = 0
        La9:
            r0.processNextReplacement(r15, r1)
            if (r20 != 0) goto Laf
            goto Lba
        Laf:
            r9.add(r0)
            int r14 = r14 + 1
            r1 = r17
            r7 = 1
            goto L8a
        Lb8:
            r17 = r1
        Lba:
            r1 = r17
            r7 = 1
            goto L7c
        Lbe:
            r17 = r1
            if (r20 == 0) goto Lc8
            r2.clear()
            r2.addAll(r9)
        Lc8:
            int r0 = r10.getPatternLength()
            r1 = 1
            int r0 = r0 - r1
            int r3 = r3 + r0
            goto Ld7
        Ld0:
            r17 = r1
            goto L50
        Ld4:
            r17 = r1
            r1 = r7
        Ld7:
            r4 = r5
        Ld8:
            int r3 = r3 + r1
            r1 = r17
            goto L17
        Ldd:
            int r0 = r2.size()
            java.lang.String[] r0 = new java.lang.String[r0]
            java.util.Iterator r1 = r2.iterator()
            r2 = 0
        Le8:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L101
            java.lang.Object r3 = r1.next()
            org.apache.commons.codec.language.DaitchMokotoffSoundex$Branch r3 = (org.apache.commons.codec.language.DaitchMokotoffSoundex.Branch) r3
            r3.finish()
            int r4 = r2 + 1
            java.lang.String r3 = r3.toString()
            r0[r2] = r3
            r2 = r4
            goto Le8
        L101:
            return r0
    }

    private static java.lang.String stripQuotes(java.lang.String r3) {
            java.lang.String r0 = "\""
            boolean r1 = r3.startsWith(r0)
            r2 = 1
            if (r1 == 0) goto Ld
            java.lang.String r3 = r3.substring(r2)
        Ld:
            boolean r0 = r3.endsWith(r0)
            if (r0 == 0) goto L1d
            int r0 = r3.length()
            int r0 = r0 - r2
            r1 = 0
            java.lang.String r3 = r3.substring(r1, r0)
        L1d:
            return r3
    }

    @Override // org.apache.commons.codec.Encoder
    public java.lang.Object encode(java.lang.Object r2) throws org.apache.commons.codec.EncoderException {
            r1 = this;
            boolean r0 = r2 instanceof java.lang.String
            if (r0 == 0) goto Lb
            java.lang.String r2 = (java.lang.String) r2
            java.lang.String r2 = r1.encode(r2)
            return r2
        Lb:
            org.apache.commons.codec.EncoderException r2 = new org.apache.commons.codec.EncoderException
            java.lang.String r0 = "Parameter supplied to DaitchMokotoffSoundex encode is not of type java.lang.String"
            r2.<init>(r0)
            throw r2
    }

    @Override // org.apache.commons.codec.StringEncoder
    public java.lang.String encode(java.lang.String r2) {
            r1 = this;
            if (r2 != 0) goto L4
            r2 = 0
            return r2
        L4:
            r0 = 0
            java.lang.String[] r2 = r1.soundex(r2, r0)
            r2 = r2[r0]
            return r2
    }

    public java.lang.String soundex(java.lang.String r7) {
            r6 = this;
            r0 = 1
            java.lang.String[] r7 = r6.soundex(r7, r0)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            int r2 = r7.length
            r3 = 0
            r4 = r3
        Ld:
            if (r3 >= r2) goto L20
            r5 = r7[r3]
            r1.append(r5)
            int r4 = r4 + r0
            int r5 = r7.length
            if (r4 >= r5) goto L1d
            r5 = 124(0x7c, float:1.74E-43)
            r1.append(r5)
        L1d:
            int r3 = r3 + 1
            goto Ld
        L20:
            java.lang.String r7 = r1.toString()
            return r7
    }
}
