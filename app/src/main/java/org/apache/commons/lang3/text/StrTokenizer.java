package org.apache.commons.lang3.text;

/* JADX INFO: loaded from: classes2.dex */
@java.lang.Deprecated
public class StrTokenizer implements java.util.ListIterator<java.lang.String>, java.lang.Cloneable {
    private static final org.apache.commons.lang3.text.StrTokenizer CSV_TOKENIZER_PROTOTYPE = null;
    private static final org.apache.commons.lang3.text.StrTokenizer TSV_TOKENIZER_PROTOTYPE = null;
    private char[] chars;
    private org.apache.commons.lang3.text.StrMatcher delimMatcher;
    private boolean emptyAsNull;
    private boolean ignoreEmptyTokens;
    private org.apache.commons.lang3.text.StrMatcher ignoredMatcher;
    private org.apache.commons.lang3.text.StrMatcher quoteMatcher;
    private int tokenPos;
    private java.lang.String[] tokens;
    private org.apache.commons.lang3.text.StrMatcher trimmerMatcher;

    static {
            org.apache.commons.lang3.text.StrTokenizer r0 = new org.apache.commons.lang3.text.StrTokenizer
            r0.<init>()
            org.apache.commons.lang3.text.StrTokenizer.CSV_TOKENIZER_PROTOTYPE = r0
            org.apache.commons.lang3.text.StrMatcher r1 = org.apache.commons.lang3.text.StrMatcher.commaMatcher()
            r0.setDelimiterMatcher(r1)
            org.apache.commons.lang3.text.StrMatcher r1 = org.apache.commons.lang3.text.StrMatcher.doubleQuoteMatcher()
            r0.setQuoteMatcher(r1)
            org.apache.commons.lang3.text.StrMatcher r1 = org.apache.commons.lang3.text.StrMatcher.noneMatcher()
            r0.setIgnoredMatcher(r1)
            org.apache.commons.lang3.text.StrMatcher r1 = org.apache.commons.lang3.text.StrMatcher.trimMatcher()
            r0.setTrimmerMatcher(r1)
            r1 = 0
            r0.setEmptyTokenAsNull(r1)
            r0.setIgnoreEmptyTokens(r1)
            org.apache.commons.lang3.text.StrTokenizer r0 = new org.apache.commons.lang3.text.StrTokenizer
            r0.<init>()
            org.apache.commons.lang3.text.StrTokenizer.TSV_TOKENIZER_PROTOTYPE = r0
            org.apache.commons.lang3.text.StrMatcher r2 = org.apache.commons.lang3.text.StrMatcher.tabMatcher()
            r0.setDelimiterMatcher(r2)
            org.apache.commons.lang3.text.StrMatcher r2 = org.apache.commons.lang3.text.StrMatcher.doubleQuoteMatcher()
            r0.setQuoteMatcher(r2)
            org.apache.commons.lang3.text.StrMatcher r2 = org.apache.commons.lang3.text.StrMatcher.noneMatcher()
            r0.setIgnoredMatcher(r2)
            org.apache.commons.lang3.text.StrMatcher r2 = org.apache.commons.lang3.text.StrMatcher.trimMatcher()
            r0.setTrimmerMatcher(r2)
            r0.setEmptyTokenAsNull(r1)
            r0.setIgnoreEmptyTokens(r1)
            return
    }

    public StrTokenizer() {
            r1 = this;
            r1.<init>()
            org.apache.commons.lang3.text.StrMatcher r0 = org.apache.commons.lang3.text.StrMatcher.splitMatcher()
            r1.delimMatcher = r0
            org.apache.commons.lang3.text.StrMatcher r0 = org.apache.commons.lang3.text.StrMatcher.noneMatcher()
            r1.quoteMatcher = r0
            org.apache.commons.lang3.text.StrMatcher r0 = org.apache.commons.lang3.text.StrMatcher.noneMatcher()
            r1.ignoredMatcher = r0
            org.apache.commons.lang3.text.StrMatcher r0 = org.apache.commons.lang3.text.StrMatcher.noneMatcher()
            r1.trimmerMatcher = r0
            r0 = 1
            r1.ignoreEmptyTokens = r0
            r0 = 0
            r1.chars = r0
            return
    }

    public StrTokenizer(java.lang.String r2) {
            r1 = this;
            r1.<init>()
            org.apache.commons.lang3.text.StrMatcher r0 = org.apache.commons.lang3.text.StrMatcher.splitMatcher()
            r1.delimMatcher = r0
            org.apache.commons.lang3.text.StrMatcher r0 = org.apache.commons.lang3.text.StrMatcher.noneMatcher()
            r1.quoteMatcher = r0
            org.apache.commons.lang3.text.StrMatcher r0 = org.apache.commons.lang3.text.StrMatcher.noneMatcher()
            r1.ignoredMatcher = r0
            org.apache.commons.lang3.text.StrMatcher r0 = org.apache.commons.lang3.text.StrMatcher.noneMatcher()
            r1.trimmerMatcher = r0
            r0 = 1
            r1.ignoreEmptyTokens = r0
            if (r2 == 0) goto L27
            char[] r2 = r2.toCharArray()
            r1.chars = r2
            goto L2a
        L27:
            r2 = 0
            r1.chars = r2
        L2a:
            return
    }

    public StrTokenizer(java.lang.String r1, char r2) {
            r0 = this;
            r0.<init>(r1)
            r0.setDelimiterChar(r2)
            return
    }

    public StrTokenizer(java.lang.String r1, char r2, char r3) {
            r0 = this;
            r0.<init>(r1, r2)
            r0.setQuoteChar(r3)
            return
    }

    public StrTokenizer(java.lang.String r1, java.lang.String r2) {
            r0 = this;
            r0.<init>(r1)
            r0.setDelimiterString(r2)
            return
    }

    public StrTokenizer(java.lang.String r1, org.apache.commons.lang3.text.StrMatcher r2) {
            r0 = this;
            r0.<init>(r1)
            r0.setDelimiterMatcher(r2)
            return
    }

    public StrTokenizer(java.lang.String r1, org.apache.commons.lang3.text.StrMatcher r2, org.apache.commons.lang3.text.StrMatcher r3) {
            r0 = this;
            r0.<init>(r1, r2)
            r0.setQuoteMatcher(r3)
            return
    }

    public StrTokenizer(char[] r2) {
            r1 = this;
            r1.<init>()
            org.apache.commons.lang3.text.StrMatcher r0 = org.apache.commons.lang3.text.StrMatcher.splitMatcher()
            r1.delimMatcher = r0
            org.apache.commons.lang3.text.StrMatcher r0 = org.apache.commons.lang3.text.StrMatcher.noneMatcher()
            r1.quoteMatcher = r0
            org.apache.commons.lang3.text.StrMatcher r0 = org.apache.commons.lang3.text.StrMatcher.noneMatcher()
            r1.ignoredMatcher = r0
            org.apache.commons.lang3.text.StrMatcher r0 = org.apache.commons.lang3.text.StrMatcher.noneMatcher()
            r1.trimmerMatcher = r0
            r0 = 1
            r1.ignoreEmptyTokens = r0
            char[] r2 = org.apache.commons.lang3.ArrayUtils.clone(r2)
            r1.chars = r2
            return
    }

    public StrTokenizer(char[] r1, char r2) {
            r0 = this;
            r0.<init>(r1)
            r0.setDelimiterChar(r2)
            return
    }

    public StrTokenizer(char[] r1, char r2, char r3) {
            r0 = this;
            r0.<init>(r1, r2)
            r0.setQuoteChar(r3)
            return
    }

    public StrTokenizer(char[] r1, java.lang.String r2) {
            r0 = this;
            r0.<init>(r1)
            r0.setDelimiterString(r2)
            return
    }

    public StrTokenizer(char[] r1, org.apache.commons.lang3.text.StrMatcher r2) {
            r0 = this;
            r0.<init>(r1)
            r0.setDelimiterMatcher(r2)
            return
    }

    public StrTokenizer(char[] r1, org.apache.commons.lang3.text.StrMatcher r2, org.apache.commons.lang3.text.StrMatcher r3) {
            r0 = this;
            r0.<init>(r1, r2)
            r0.setQuoteMatcher(r3)
            return
    }

    private void addToken(java.util.List<java.lang.String> r2, java.lang.String r3) {
            r1 = this;
            boolean r0 = org.apache.commons.lang3.StringUtils.isEmpty(r3)
            if (r0 == 0) goto L14
            boolean r0 = r1.isIgnoreEmptyTokens()
            if (r0 == 0) goto Ld
            return
        Ld:
            boolean r0 = r1.isEmptyTokenAsNull()
            if (r0 == 0) goto L14
            r3 = 0
        L14:
            r2.add(r3)
            return
    }

    private void checkTokenized() {
            r3 = this;
            java.lang.String[] r0 = r3.tokens
            if (r0 != 0) goto L28
            char[] r0 = r3.chars
            r1 = 0
            if (r0 != 0) goto L19
            r0 = 0
            java.util.List r0 = r3.tokenize(r0, r1, r1)
            java.lang.String[] r1 = org.apache.commons.lang3.ArrayUtils.EMPTY_STRING_ARRAY
            java.lang.Object[] r0 = r0.toArray(r1)
            java.lang.String[] r0 = (java.lang.String[]) r0
            r3.tokens = r0
            goto L28
        L19:
            int r2 = r0.length
            java.util.List r0 = r3.tokenize(r0, r1, r2)
            java.lang.String[] r1 = org.apache.commons.lang3.ArrayUtils.EMPTY_STRING_ARRAY
            java.lang.Object[] r0 = r0.toArray(r1)
            java.lang.String[] r0 = (java.lang.String[]) r0
            r3.tokens = r0
        L28:
            return
    }

    private static org.apache.commons.lang3.text.StrTokenizer getCSVClone() {
            org.apache.commons.lang3.text.StrTokenizer r0 = org.apache.commons.lang3.text.StrTokenizer.CSV_TOKENIZER_PROTOTYPE
            java.lang.Object r0 = r0.clone()
            org.apache.commons.lang3.text.StrTokenizer r0 = (org.apache.commons.lang3.text.StrTokenizer) r0
            return r0
    }

    public static org.apache.commons.lang3.text.StrTokenizer getCSVInstance() {
            org.apache.commons.lang3.text.StrTokenizer r0 = getCSVClone()
            return r0
    }

    public static org.apache.commons.lang3.text.StrTokenizer getCSVInstance(java.lang.String r1) {
            org.apache.commons.lang3.text.StrTokenizer r0 = getCSVClone()
            r0.reset(r1)
            return r0
    }

    public static org.apache.commons.lang3.text.StrTokenizer getCSVInstance(char[] r1) {
            org.apache.commons.lang3.text.StrTokenizer r0 = getCSVClone()
            r0.reset(r1)
            return r0
    }

    private static org.apache.commons.lang3.text.StrTokenizer getTSVClone() {
            org.apache.commons.lang3.text.StrTokenizer r0 = org.apache.commons.lang3.text.StrTokenizer.TSV_TOKENIZER_PROTOTYPE
            java.lang.Object r0 = r0.clone()
            org.apache.commons.lang3.text.StrTokenizer r0 = (org.apache.commons.lang3.text.StrTokenizer) r0
            return r0
    }

    public static org.apache.commons.lang3.text.StrTokenizer getTSVInstance() {
            org.apache.commons.lang3.text.StrTokenizer r0 = getTSVClone()
            return r0
    }

    public static org.apache.commons.lang3.text.StrTokenizer getTSVInstance(java.lang.String r1) {
            org.apache.commons.lang3.text.StrTokenizer r0 = getTSVClone()
            r0.reset(r1)
            return r0
    }

    public static org.apache.commons.lang3.text.StrTokenizer getTSVInstance(char[] r1) {
            org.apache.commons.lang3.text.StrTokenizer r0 = getTSVClone()
            r0.reset(r1)
            return r0
    }

    private boolean isQuote(char[] r5, int r6, int r7, int r8, int r9) {
            r4 = this;
            r0 = 0
            r1 = r0
        L2:
            if (r1 >= r9) goto L15
            int r2 = r6 + r1
            if (r2 >= r7) goto L14
            char r2 = r5[r2]
            int r3 = r8 + r1
            char r3 = r5[r3]
            if (r2 == r3) goto L11
            goto L14
        L11:
            int r1 = r1 + 1
            goto L2
        L14:
            return r0
        L15:
            r5 = 1
            return r5
    }

    private int readNextToken(char[] r9, int r10, int r11, org.apache.commons.lang3.text.StrBuilder r12, java.util.List<java.lang.String> r13) {
            r8 = this;
        L0:
            if (r10 >= r11) goto L2f
            org.apache.commons.lang3.text.StrMatcher r0 = r8.getIgnoredMatcher()
            int r0 = r0.isMatch(r9, r10, r10, r11)
            org.apache.commons.lang3.text.StrMatcher r1 = r8.getTrimmerMatcher()
            int r1 = r1.isMatch(r9, r10, r10, r11)
            int r0 = java.lang.Math.max(r0, r1)
            if (r0 == 0) goto L2f
            org.apache.commons.lang3.text.StrMatcher r1 = r8.getDelimiterMatcher()
            int r1 = r1.isMatch(r9, r10, r10, r11)
            if (r1 > 0) goto L2f
            org.apache.commons.lang3.text.StrMatcher r1 = r8.getQuoteMatcher()
            int r1 = r1.isMatch(r9, r10, r10, r11)
            if (r1 <= 0) goto L2d
            goto L2f
        L2d:
            int r10 = r10 + r0
            goto L0
        L2f:
            java.lang.String r0 = ""
            if (r10 < r11) goto L38
            r8.addToken(r13, r0)
            r9 = -1
            return r9
        L38:
            org.apache.commons.lang3.text.StrMatcher r1 = r8.getDelimiterMatcher()
            int r1 = r1.isMatch(r9, r10, r10, r11)
            if (r1 <= 0) goto L47
            r8.addToken(r13, r0)
            int r10 = r10 + r1
            return r10
        L47:
            org.apache.commons.lang3.text.StrMatcher r0 = r8.getQuoteMatcher()
            int r7 = r0.isMatch(r9, r10, r10, r11)
            if (r7 <= 0) goto L5e
            int r2 = r10 + r7
            r0 = r8
            r1 = r9
            r3 = r11
            r4 = r12
            r5 = r13
            r6 = r10
            int r9 = r0.readWithQuotes(r1, r2, r3, r4, r5, r6, r7)
            return r9
        L5e:
            r6 = 0
            r7 = 0
            r0 = r8
            r1 = r9
            r2 = r10
            r3 = r11
            r4 = r12
            r5 = r13
            int r9 = r0.readWithQuotes(r1, r2, r3, r4, r5, r6, r7)
            return r9
    }

    private int readWithQuotes(char[] r18, int r19, int r20, org.apache.commons.lang3.text.StrBuilder r21, java.util.List<java.lang.String> r22, int r23, int r24) {
            r17 = this;
            r6 = r17
            r7 = r18
            r8 = r19
            r9 = r20
            r10 = r21
            r11 = r22
            r12 = r24
            r21.clear()
            if (r12 <= 0) goto L15
            r0 = 1
            goto L16
        L15:
            r0 = 0
        L16:
            r15 = r0
            r5 = r8
            r4 = 0
        L19:
            if (r5 >= r9) goto Lad
            if (r15 == 0) goto L55
            r0 = r17
            r1 = r18
            r2 = r5
            r3 = r20
            r13 = r4
            r4 = r23
            r14 = r5
            r5 = r24
            boolean r0 = r0.isQuote(r1, r2, r3, r4, r5)
            if (r0 == 0) goto La0
            int r16 = r14 + r12
            r0 = r17
            r1 = r18
            r2 = r16
            r3 = r20
            r4 = r23
            r5 = r24
            boolean r0 = r0.isQuote(r1, r2, r3, r4, r5)
            if (r0 == 0) goto L50
            r10.append(r7, r14, r12)
            int r0 = r12 * 2
            int r5 = r14 + r0
            int r4 = r21.size()
            goto L19
        L50:
            r4 = r13
            r5 = r16
            r15 = 0
            goto L19
        L55:
            r13 = r4
            r14 = r5
            org.apache.commons.lang3.text.StrMatcher r0 = r17.getDelimiterMatcher()
            int r0 = r0.isMatch(r7, r14, r8, r9)
            if (r0 <= 0) goto L6c
            r1 = 0
            java.lang.String r1 = r10.substring(r1, r13)
            r6.addToken(r11, r1)
            int r5 = r14 + r0
            return r5
        L6c:
            if (r12 <= 0) goto L84
            r0 = r17
            r1 = r18
            r2 = r14
            r3 = r20
            r4 = r23
            r5 = r24
            boolean r0 = r0.isQuote(r1, r2, r3, r4, r5)
            if (r0 == 0) goto L84
            int r5 = r14 + r12
            r4 = r13
            r15 = 1
            goto L19
        L84:
            org.apache.commons.lang3.text.StrMatcher r0 = r17.getIgnoredMatcher()
            int r0 = r0.isMatch(r7, r14, r8, r9)
            if (r0 <= 0) goto L92
        L8e:
            int r5 = r14 + r0
            r4 = r13
            goto L19
        L92:
            org.apache.commons.lang3.text.StrMatcher r0 = r17.getTrimmerMatcher()
            int r0 = r0.isMatch(r7, r14, r8, r9)
            if (r0 <= 0) goto La0
            r10.append(r7, r14, r0)
            goto L8e
        La0:
            int r5 = r14 + 1
            char r0 = r7[r14]
            r10.append(r0)
            int r4 = r21.size()
            goto L19
        Lad:
            r13 = r4
            r0 = 0
            java.lang.String r0 = r10.substring(r0, r13)
            r6.addToken(r11, r0)
            r0 = -1
            return r0
    }

    @Override // java.util.ListIterator
    public /* bridge */ /* synthetic */ void add(java.lang.String r1) {
            r0 = this;
            java.lang.String r1 = (java.lang.String) r1
            r0.add2(r1)
            return
    }

    /* JADX INFO: renamed from: add, reason: avoid collision after fix types in other method */
    public void add2(java.lang.String r2) {
            r1 = this;
            java.lang.UnsupportedOperationException r2 = new java.lang.UnsupportedOperationException
            java.lang.String r0 = "add() is unsupported"
            r2.<init>(r0)
            throw r2
    }

    public java.lang.Object clone() {
            r1 = this;
            java.lang.Object r0 = r1.cloneReset()     // Catch: java.lang.CloneNotSupportedException -> L5
            return r0
        L5:
            r0 = 0
            return r0
    }

    java.lang.Object cloneReset() throws java.lang.CloneNotSupportedException {
            r2 = this;
            java.lang.Object r0 = super.clone()
            org.apache.commons.lang3.text.StrTokenizer r0 = (org.apache.commons.lang3.text.StrTokenizer) r0
            char[] r1 = r0.chars
            if (r1 == 0) goto L12
            java.lang.Object r1 = r1.clone()
            char[] r1 = (char[]) r1
            r0.chars = r1
        L12:
            r0.reset()
            return r0
    }

    public java.lang.String getContent() {
            r2 = this;
            char[] r0 = r2.chars
            if (r0 != 0) goto L6
            r0 = 0
            return r0
        L6:
            java.lang.String r0 = new java.lang.String
            char[] r1 = r2.chars
            r0.<init>(r1)
            return r0
    }

    public org.apache.commons.lang3.text.StrMatcher getDelimiterMatcher() {
            r1 = this;
            org.apache.commons.lang3.text.StrMatcher r0 = r1.delimMatcher
            return r0
    }

    public org.apache.commons.lang3.text.StrMatcher getIgnoredMatcher() {
            r1 = this;
            org.apache.commons.lang3.text.StrMatcher r0 = r1.ignoredMatcher
            return r0
    }

    public org.apache.commons.lang3.text.StrMatcher getQuoteMatcher() {
            r1 = this;
            org.apache.commons.lang3.text.StrMatcher r0 = r1.quoteMatcher
            return r0
    }

    public java.lang.String[] getTokenArray() {
            r1 = this;
            r1.checkTokenized()
            java.lang.String[] r0 = r1.tokens
            java.lang.Object r0 = r0.clone()
            java.lang.String[] r0 = (java.lang.String[]) r0
            return r0
    }

    public java.util.List<java.lang.String> getTokenList() {
            r2 = this;
            r2.checkTokenized()
            java.util.ArrayList r0 = new java.util.ArrayList
            java.lang.String[] r1 = r2.tokens
            int r1 = r1.length
            r0.<init>(r1)
            java.lang.String[] r1 = r2.tokens
            java.util.List r1 = java.util.Arrays.asList(r1)
            r0.addAll(r1)
            return r0
    }

    public org.apache.commons.lang3.text.StrMatcher getTrimmerMatcher() {
            r1 = this;
            org.apache.commons.lang3.text.StrMatcher r0 = r1.trimmerMatcher
            return r0
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public boolean hasNext() {
            r2 = this;
            r2.checkTokenized()
            int r0 = r2.tokenPos
            java.lang.String[] r1 = r2.tokens
            int r1 = r1.length
            if (r0 >= r1) goto Lc
            r0 = 1
            goto Ld
        Lc:
            r0 = 0
        Ld:
            return r0
    }

    @Override // java.util.ListIterator
    public boolean hasPrevious() {
            r1 = this;
            r1.checkTokenized()
            int r0 = r1.tokenPos
            if (r0 <= 0) goto L9
            r0 = 1
            goto La
        L9:
            r0 = 0
        La:
            return r0
    }

    public boolean isEmptyTokenAsNull() {
            r1 = this;
            boolean r0 = r1.emptyAsNull
            return r0
    }

    public boolean isIgnoreEmptyTokens() {
            r1 = this;
            boolean r0 = r1.ignoreEmptyTokens
            return r0
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public /* bridge */ /* synthetic */ java.lang.Object next() {
            r1 = this;
            java.lang.String r0 = r1.next()
            return r0
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public java.lang.String next() {
            r3 = this;
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L11
            java.lang.String[] r0 = r3.tokens
            int r1 = r3.tokenPos
            int r2 = r1 + 1
            r3.tokenPos = r2
            r0 = r0[r1]
            return r0
        L11:
            java.util.NoSuchElementException r0 = new java.util.NoSuchElementException
            r0.<init>()
            throw r0
    }

    @Override // java.util.ListIterator
    public int nextIndex() {
            r1 = this;
            int r0 = r1.tokenPos
            return r0
    }

    public java.lang.String nextToken() {
            r3 = this;
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L11
            java.lang.String[] r0 = r3.tokens
            int r1 = r3.tokenPos
            int r2 = r1 + 1
            r3.tokenPos = r2
            r0 = r0[r1]
            return r0
        L11:
            r0 = 0
            return r0
    }

    @Override // java.util.ListIterator
    public /* bridge */ /* synthetic */ java.lang.String previous() {
            r1 = this;
            java.lang.String r0 = r1.previous2()
            return r0
    }

    @Override // java.util.ListIterator
    /* JADX INFO: renamed from: previous, reason: avoid collision after fix types in other method */
    public java.lang.String previous2() {
            r2 = this;
            boolean r0 = r2.hasPrevious()
            if (r0 == 0) goto L11
            java.lang.String[] r0 = r2.tokens
            int r1 = r2.tokenPos
            int r1 = r1 + (-1)
            r2.tokenPos = r1
            r0 = r0[r1]
            return r0
        L11:
            java.util.NoSuchElementException r0 = new java.util.NoSuchElementException
            r0.<init>()
            throw r0
    }

    @Override // java.util.ListIterator
    public int previousIndex() {
            r1 = this;
            int r0 = r1.tokenPos
            int r0 = r0 + (-1)
            return r0
    }

    public java.lang.String previousToken() {
            r2 = this;
            boolean r0 = r2.hasPrevious()
            if (r0 == 0) goto L11
            java.lang.String[] r0 = r2.tokens
            int r1 = r2.tokenPos
            int r1 = r1 + (-1)
            r2.tokenPos = r1
            r0 = r0[r1]
            return r0
        L11:
            r0 = 0
            return r0
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public void remove() {
            r2 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "remove() is unsupported"
            r0.<init>(r1)
            throw r0
    }

    public org.apache.commons.lang3.text.StrTokenizer reset() {
            r1 = this;
            r0 = 0
            r1.tokenPos = r0
            r0 = 0
            r1.tokens = r0
            return r1
    }

    public org.apache.commons.lang3.text.StrTokenizer reset(java.lang.String r1) {
            r0 = this;
            r0.reset()
            if (r1 == 0) goto Lc
            char[] r1 = r1.toCharArray()
            r0.chars = r1
            goto Lf
        Lc:
            r1 = 0
            r0.chars = r1
        Lf:
            return r0
    }

    public org.apache.commons.lang3.text.StrTokenizer reset(char[] r1) {
            r0 = this;
            r0.reset()
            char[] r1 = org.apache.commons.lang3.ArrayUtils.clone(r1)
            r0.chars = r1
            return r0
    }

    @Override // java.util.ListIterator
    public /* bridge */ /* synthetic */ void set(java.lang.String r1) {
            r0 = this;
            java.lang.String r1 = (java.lang.String) r1
            r0.set2(r1)
            return
    }

    /* JADX INFO: renamed from: set, reason: avoid collision after fix types in other method */
    public void set2(java.lang.String r2) {
            r1 = this;
            java.lang.UnsupportedOperationException r2 = new java.lang.UnsupportedOperationException
            java.lang.String r0 = "set() is unsupported"
            r2.<init>(r0)
            throw r2
    }

    public org.apache.commons.lang3.text.StrTokenizer setDelimiterChar(char r1) {
            r0 = this;
            org.apache.commons.lang3.text.StrMatcher r1 = org.apache.commons.lang3.text.StrMatcher.charMatcher(r1)
            org.apache.commons.lang3.text.StrTokenizer r1 = r0.setDelimiterMatcher(r1)
            return r1
    }

    public org.apache.commons.lang3.text.StrTokenizer setDelimiterMatcher(org.apache.commons.lang3.text.StrMatcher r1) {
            r0 = this;
            if (r1 != 0) goto L9
            org.apache.commons.lang3.text.StrMatcher r1 = org.apache.commons.lang3.text.StrMatcher.noneMatcher()
            r0.delimMatcher = r1
            goto Lb
        L9:
            r0.delimMatcher = r1
        Lb:
            return r0
    }

    public org.apache.commons.lang3.text.StrTokenizer setDelimiterString(java.lang.String r1) {
            r0 = this;
            org.apache.commons.lang3.text.StrMatcher r1 = org.apache.commons.lang3.text.StrMatcher.stringMatcher(r1)
            org.apache.commons.lang3.text.StrTokenizer r1 = r0.setDelimiterMatcher(r1)
            return r1
    }

    public org.apache.commons.lang3.text.StrTokenizer setEmptyTokenAsNull(boolean r1) {
            r0 = this;
            r0.emptyAsNull = r1
            return r0
    }

    public org.apache.commons.lang3.text.StrTokenizer setIgnoreEmptyTokens(boolean r1) {
            r0 = this;
            r0.ignoreEmptyTokens = r1
            return r0
    }

    public org.apache.commons.lang3.text.StrTokenizer setIgnoredChar(char r1) {
            r0 = this;
            org.apache.commons.lang3.text.StrMatcher r1 = org.apache.commons.lang3.text.StrMatcher.charMatcher(r1)
            org.apache.commons.lang3.text.StrTokenizer r1 = r0.setIgnoredMatcher(r1)
            return r1
    }

    public org.apache.commons.lang3.text.StrTokenizer setIgnoredMatcher(org.apache.commons.lang3.text.StrMatcher r1) {
            r0 = this;
            if (r1 == 0) goto L4
            r0.ignoredMatcher = r1
        L4:
            return r0
    }

    public org.apache.commons.lang3.text.StrTokenizer setQuoteChar(char r1) {
            r0 = this;
            org.apache.commons.lang3.text.StrMatcher r1 = org.apache.commons.lang3.text.StrMatcher.charMatcher(r1)
            org.apache.commons.lang3.text.StrTokenizer r1 = r0.setQuoteMatcher(r1)
            return r1
    }

    public org.apache.commons.lang3.text.StrTokenizer setQuoteMatcher(org.apache.commons.lang3.text.StrMatcher r1) {
            r0 = this;
            if (r1 == 0) goto L4
            r0.quoteMatcher = r1
        L4:
            return r0
    }

    public org.apache.commons.lang3.text.StrTokenizer setTrimmerMatcher(org.apache.commons.lang3.text.StrMatcher r1) {
            r0 = this;
            if (r1 == 0) goto L4
            r0.trimmerMatcher = r1
        L4:
            return r0
    }

    public int size() {
            r1 = this;
            r1.checkTokenized()
            java.lang.String[] r0 = r1.tokens
            int r0 = r0.length
            return r0
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.String[] r0 = r2.tokens
            if (r0 != 0) goto L7
            java.lang.String r0 = "StrTokenizer[not tokenized yet]"
            return r0
        L7:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "StrTokenizer"
            r0.<init>(r1)
            java.util.List r1 = r2.getTokenList()
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    protected java.util.List<java.lang.String> tokenize(char[] r9, int r10, int r11) {
            r8 = this;
            boolean r0 = org.apache.commons.lang3.ArrayUtils.isEmpty(r9)
            if (r0 == 0) goto Lb
            java.util.List r9 = java.util.Collections.emptyList()
            return r9
        Lb:
            org.apache.commons.lang3.text.StrBuilder r6 = new org.apache.commons.lang3.text.StrBuilder
            r6.<init>()
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            r2 = r10
        L16:
            if (r2 < 0) goto L2b
            if (r2 >= r11) goto L2b
            r0 = r8
            r1 = r9
            r3 = r11
            r4 = r6
            r5 = r7
            int r2 = r0.readNextToken(r1, r2, r3, r4, r5)
            if (r2 < r11) goto L16
            java.lang.String r10 = ""
            r8.addToken(r7, r10)
            goto L16
        L2b:
            return r7
    }
}
