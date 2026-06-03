package org.apache.commons.lang3.text;

/* JADX INFO: loaded from: classes2.dex */
@java.lang.Deprecated
public class StrSubstitutor {
    public static final char DEFAULT_ESCAPE = '$';
    public static final org.apache.commons.lang3.text.StrMatcher DEFAULT_PREFIX = null;
    public static final org.apache.commons.lang3.text.StrMatcher DEFAULT_SUFFIX = null;
    public static final org.apache.commons.lang3.text.StrMatcher DEFAULT_VALUE_DELIMITER = null;
    private boolean enableSubstitutionInVariables;
    private char escapeChar;
    private org.apache.commons.lang3.text.StrMatcher prefixMatcher;
    private boolean preserveEscapes;
    private org.apache.commons.lang3.text.StrMatcher suffixMatcher;
    private org.apache.commons.lang3.text.StrMatcher valueDelimiterMatcher;
    private org.apache.commons.lang3.text.StrLookup<?> variableResolver;

    static {
            java.lang.String r0 = "${"
            org.apache.commons.lang3.text.StrMatcher r0 = org.apache.commons.lang3.text.StrMatcher.stringMatcher(r0)
            org.apache.commons.lang3.text.StrSubstitutor.DEFAULT_PREFIX = r0
            java.lang.String r0 = "}"
            org.apache.commons.lang3.text.StrMatcher r0 = org.apache.commons.lang3.text.StrMatcher.stringMatcher(r0)
            org.apache.commons.lang3.text.StrSubstitutor.DEFAULT_SUFFIX = r0
            java.lang.String r0 = ":-"
            org.apache.commons.lang3.text.StrMatcher r0 = org.apache.commons.lang3.text.StrMatcher.stringMatcher(r0)
            org.apache.commons.lang3.text.StrSubstitutor.DEFAULT_VALUE_DELIMITER = r0
            return
    }

    public StrSubstitutor() {
            r4 = this;
            org.apache.commons.lang3.text.StrMatcher r0 = org.apache.commons.lang3.text.StrSubstitutor.DEFAULT_PREFIX
            org.apache.commons.lang3.text.StrMatcher r1 = org.apache.commons.lang3.text.StrSubstitutor.DEFAULT_SUFFIX
            r2 = 36
            r3 = 0
            r4.<init>(r3, r0, r1, r2)
            return
    }

    public <V> StrSubstitutor(java.util.Map<java.lang.String, V> r4) {
            r3 = this;
            org.apache.commons.lang3.text.StrLookup r4 = org.apache.commons.lang3.text.StrLookup.mapLookup(r4)
            org.apache.commons.lang3.text.StrMatcher r0 = org.apache.commons.lang3.text.StrSubstitutor.DEFAULT_PREFIX
            org.apache.commons.lang3.text.StrMatcher r1 = org.apache.commons.lang3.text.StrSubstitutor.DEFAULT_SUFFIX
            r2 = 36
            r3.<init>(r4, r0, r1, r2)
            return
    }

    public <V> StrSubstitutor(java.util.Map<java.lang.String, V> r2, java.lang.String r3, java.lang.String r4) {
            r1 = this;
            org.apache.commons.lang3.text.StrLookup r2 = org.apache.commons.lang3.text.StrLookup.mapLookup(r2)
            r0 = 36
            r1.<init>(r2, r3, r4, r0)
            return
    }

    public <V> StrSubstitutor(java.util.Map<java.lang.String, V> r1, java.lang.String r2, java.lang.String r3, char r4) {
            r0 = this;
            org.apache.commons.lang3.text.StrLookup r1 = org.apache.commons.lang3.text.StrLookup.mapLookup(r1)
            r0.<init>(r1, r2, r3, r4)
            return
    }

    public <V> StrSubstitutor(java.util.Map<java.lang.String, V> r7, java.lang.String r8, java.lang.String r9, char r10, java.lang.String r11) {
            r6 = this;
            org.apache.commons.lang3.text.StrLookup r1 = org.apache.commons.lang3.text.StrLookup.mapLookup(r7)
            r0 = r6
            r2 = r8
            r3 = r9
            r4 = r10
            r5 = r11
            r0.<init>(r1, r2, r3, r4, r5)
            return
    }

    public StrSubstitutor(org.apache.commons.lang3.text.StrLookup<?> r4) {
            r3 = this;
            org.apache.commons.lang3.text.StrMatcher r0 = org.apache.commons.lang3.text.StrSubstitutor.DEFAULT_PREFIX
            org.apache.commons.lang3.text.StrMatcher r1 = org.apache.commons.lang3.text.StrSubstitutor.DEFAULT_SUFFIX
            r2 = 36
            r3.<init>(r4, r0, r1, r2)
            return
    }

    public StrSubstitutor(org.apache.commons.lang3.text.StrLookup<?> r1, java.lang.String r2, java.lang.String r3, char r4) {
            r0 = this;
            r0.<init>()
            r0.setVariableResolver(r1)
            r0.setVariablePrefix(r2)
            r0.setVariableSuffix(r3)
            r0.setEscapeChar(r4)
            org.apache.commons.lang3.text.StrMatcher r1 = org.apache.commons.lang3.text.StrSubstitutor.DEFAULT_VALUE_DELIMITER
            r0.setValueDelimiterMatcher(r1)
            return
    }

    public StrSubstitutor(org.apache.commons.lang3.text.StrLookup<?> r1, java.lang.String r2, java.lang.String r3, char r4, java.lang.String r5) {
            r0 = this;
            r0.<init>()
            r0.setVariableResolver(r1)
            r0.setVariablePrefix(r2)
            r0.setVariableSuffix(r3)
            r0.setEscapeChar(r4)
            r0.setValueDelimiter(r5)
            return
    }

    public StrSubstitutor(org.apache.commons.lang3.text.StrLookup<?> r7, org.apache.commons.lang3.text.StrMatcher r8, org.apache.commons.lang3.text.StrMatcher r9, char r10) {
            r6 = this;
            org.apache.commons.lang3.text.StrMatcher r5 = org.apache.commons.lang3.text.StrSubstitutor.DEFAULT_VALUE_DELIMITER
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            r0.<init>(r1, r2, r3, r4, r5)
            return
    }

    public StrSubstitutor(org.apache.commons.lang3.text.StrLookup<?> r1, org.apache.commons.lang3.text.StrMatcher r2, org.apache.commons.lang3.text.StrMatcher r3, char r4, org.apache.commons.lang3.text.StrMatcher r5) {
            r0 = this;
            r0.<init>()
            r0.setVariableResolver(r1)
            r0.setVariablePrefixMatcher(r2)
            r0.setVariableSuffixMatcher(r3)
            r0.setEscapeChar(r4)
            r0.setValueDelimiterMatcher(r5)
            return
    }

    private void checkCyclicSubstitution(java.lang.String r2, java.util.List<java.lang.String> r3) {
            r1 = this;
            boolean r2 = r3.contains(r2)
            if (r2 != 0) goto L7
            return
        L7:
            org.apache.commons.lang3.text.StrBuilder r2 = new org.apache.commons.lang3.text.StrBuilder
            r0 = 256(0x100, float:3.59E-43)
            r2.<init>(r0)
            java.lang.String r0 = "Infinite loop in property interpolation of "
            r2.append(r0)
            r0 = 0
            java.lang.Object r0 = r3.remove(r0)
            java.lang.String r0 = (java.lang.String) r0
            r2.append(r0)
            java.lang.String r0 = ": "
            r2.append(r0)
            java.lang.String r0 = "->"
            r2.appendWithSeparators(r3, r0)
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.String r2 = r2.toString()
            r3.<init>(r2)
            throw r3
    }

    public static <V> java.lang.String replace(java.lang.Object r1, java.util.Map<java.lang.String, V> r2) {
            org.apache.commons.lang3.text.StrSubstitutor r0 = new org.apache.commons.lang3.text.StrSubstitutor
            r0.<init>(r2)
            java.lang.String r1 = r0.replace(r1)
            return r1
    }

    public static <V> java.lang.String replace(java.lang.Object r1, java.util.Map<java.lang.String, V> r2, java.lang.String r3, java.lang.String r4) {
            org.apache.commons.lang3.text.StrSubstitutor r0 = new org.apache.commons.lang3.text.StrSubstitutor
            r0.<init>(r2, r3, r4)
            java.lang.String r1 = r0.replace(r1)
            return r1
    }

    public static java.lang.String replace(java.lang.Object r4, java.util.Properties r5) {
            if (r5 != 0) goto L7
            java.lang.String r4 = r4.toString()
            return r4
        L7:
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            java.util.Enumeration r1 = r5.propertyNames()
        L10:
            boolean r2 = r1.hasMoreElements()
            if (r2 == 0) goto L26
            java.lang.Object r2 = r1.nextElement()
            java.lang.String r2 = java.lang.String.valueOf(r2)
            java.lang.String r3 = r5.getProperty(r2)
            r0.put(r2, r3)
            goto L10
        L26:
            java.lang.String r4 = replace(r4, r0)
            return r4
    }

    public static java.lang.String replaceSystemProperties(java.lang.Object r2) {
            org.apache.commons.lang3.text.StrSubstitutor r0 = new org.apache.commons.lang3.text.StrSubstitutor
            org.apache.commons.lang3.text.StrLookup r1 = org.apache.commons.lang3.text.StrLookup.systemPropertiesLookup()
            r0.<init>(r1)
            java.lang.String r2 = r0.replace(r2)
            return r2
    }

    private int substitute(org.apache.commons.lang3.text.StrBuilder r27, int r28, int r29, java.util.List<java.lang.String> r30) {
            r26 = this;
            r0 = r26
            r1 = r27
            r2 = r28
            r3 = r29
            org.apache.commons.lang3.text.StrMatcher r4 = r26.getVariablePrefixMatcher()
            org.apache.commons.lang3.text.StrMatcher r5 = r26.getVariableSuffixMatcher()
            char r6 = r26.getEscapeChar()
            org.apache.commons.lang3.text.StrMatcher r7 = r26.getValueDelimiterMatcher()
            boolean r8 = r26.isEnableSubstitutionInVariables()
            if (r30 != 0) goto L20
            r11 = 1
            goto L21
        L20:
            r11 = 0
        L21:
            char[] r12 = r1.buffer
            int r13 = r2 + r3
            r15 = r2
            r14 = r13
            r16 = 0
            r17 = 0
            r13 = r12
            r12 = r30
        L2e:
            if (r15 >= r14) goto L157
            int r18 = r4.isMatch(r13, r15, r2, r14)
            if (r18 != 0) goto L44
            int r15 = r15 + 1
            r24 = r4
            r21 = r5
            r22 = r6
            r23 = r11
            r4 = 0
            r6 = 1
            goto L14d
        L44:
            if (r15 <= r2) goto L6b
            int r10 = r15 + (-1)
            char r9 = r13[r10]
            if (r9 != r6) goto L6b
            boolean r9 = r0.preserveEscapes
            if (r9 == 0) goto L53
            int r15 = r15 + 1
            goto L2e
        L53:
            r1.deleteCharAt(r10)
            char[] r9 = r1.buffer
            int r16 = r16 + (-1)
            int r14 = r14 + (-1)
            r24 = r4
            r21 = r5
            r22 = r6
            r13 = r9
            r23 = r11
            r4 = 0
            r6 = 1
            r17 = 1
            goto L14d
        L6b:
            int r9 = r15 + r18
            r10 = r9
            r19 = 0
        L70:
            if (r10 >= r14) goto L142
            if (r8 == 0) goto L7f
            int r20 = r4.isMatch(r13, r10, r2, r14)
            if (r20 == 0) goto L7f
            int r19 = r19 + 1
            int r10 = r10 + r20
            goto L70
        L7f:
            int r20 = r5.isMatch(r13, r10, r2, r14)
            if (r20 != 0) goto L88
            int r10 = r10 + 1
            goto L70
        L88:
            if (r19 != 0) goto L12e
            r21 = r5
            java.lang.String r5 = new java.lang.String
            int r19 = r10 - r15
            r22 = r6
            int r6 = r19 - r18
            r5.<init>(r13, r9, r6)
            if (r8 == 0) goto Laa
            org.apache.commons.lang3.text.StrBuilder r6 = new org.apache.commons.lang3.text.StrBuilder
            r6.<init>(r5)
            int r5 = r6.length()
            r9 = 0
            r0.substitute(r6, r9, r5)
            java.lang.String r5 = r6.toString()
        Laa:
            int r10 = r10 + r20
            if (r7 == 0) goto Le5
            char[] r6 = r5.toCharArray()
            r23 = r11
            r9 = 0
        Lb5:
            int r11 = r6.length
            if (r9 >= r11) goto Le2
            if (r8 != 0) goto Lc2
            int r11 = r6.length
            int r11 = r4.isMatch(r6, r9, r9, r11)
            if (r11 == 0) goto Lc2
            goto Le2
        Lc2:
            int r11 = r7.isMatch(r6, r9)
            if (r11 == 0) goto Lda
            r24 = r4
            r4 = 0
            java.lang.String r6 = r5.substring(r4, r9)
            int r9 = r9 + r11
            java.lang.String r5 = r5.substring(r9)
            r25 = r6
            r6 = r5
            r5 = r25
            goto Leb
        Lda:
            r24 = r4
            r4 = 0
            int r9 = r9 + 1
            r4 = r24
            goto Lb5
        Le2:
            r24 = r4
            goto Le9
        Le5:
            r24 = r4
            r23 = r11
        Le9:
            r4 = 0
            r6 = 0
        Leb:
            if (r12 != 0) goto Lfa
            java.util.ArrayList r12 = new java.util.ArrayList
            r12.<init>()
            java.lang.String r9 = new java.lang.String
            r9.<init>(r13, r2, r3)
            r12.add(r9)
        Lfa:
            r0.checkCyclicSubstitution(r5, r12)
            r12.add(r5)
            java.lang.String r5 = r0.resolveVariable(r5, r1, r15, r10)
            if (r5 != 0) goto L107
            goto L108
        L107:
            r6 = r5
        L108:
            if (r6 == 0) goto L123
            int r5 = r6.length()
            r1.replace(r15, r10, r6)
            int r6 = r0.substitute(r1, r15, r5, r12)
            int r6 = r6 + r5
            int r5 = r10 - r15
            int r6 = r6 - r5
            int r10 = r10 + r6
            int r14 = r14 + r6
            int r16 = r16 + r6
            char[] r13 = r1.buffer
            r15 = r10
            r17 = 1
            goto L124
        L123:
            r15 = r10
        L124:
            int r5 = r12.size()
            r6 = 1
            int r5 = r5 - r6
            r12.remove(r5)
            goto L14d
        L12e:
            r24 = r4
            r21 = r5
            r22 = r6
            r23 = r11
            r4 = 0
            r6 = 1
            int r19 = r19 + (-1)
            int r10 = r10 + r20
            r6 = r22
            r4 = r24
            goto L70
        L142:
            r24 = r4
            r21 = r5
            r22 = r6
            r23 = r11
            r4 = 0
            r6 = 1
            r15 = r10
        L14d:
            r5 = r21
            r6 = r22
            r11 = r23
            r4 = r24
            goto L2e
        L157:
            r23 = r11
            if (r23 == 0) goto L15c
            return r17
        L15c:
            return r16
    }

    public char getEscapeChar() {
            r1 = this;
            char r0 = r1.escapeChar
            return r0
    }

    public org.apache.commons.lang3.text.StrMatcher getValueDelimiterMatcher() {
            r1 = this;
            org.apache.commons.lang3.text.StrMatcher r0 = r1.valueDelimiterMatcher
            return r0
    }

    public org.apache.commons.lang3.text.StrMatcher getVariablePrefixMatcher() {
            r1 = this;
            org.apache.commons.lang3.text.StrMatcher r0 = r1.prefixMatcher
            return r0
    }

    public org.apache.commons.lang3.text.StrLookup<?> getVariableResolver() {
            r1 = this;
            org.apache.commons.lang3.text.StrLookup<?> r0 = r1.variableResolver
            return r0
    }

    public org.apache.commons.lang3.text.StrMatcher getVariableSuffixMatcher() {
            r1 = this;
            org.apache.commons.lang3.text.StrMatcher r0 = r1.suffixMatcher
            return r0
    }

    public boolean isEnableSubstitutionInVariables() {
            r1 = this;
            boolean r0 = r1.enableSubstitutionInVariables
            return r0
    }

    public boolean isPreserveEscapes() {
            r1 = this;
            boolean r0 = r1.preserveEscapes
            return r0
    }

    public java.lang.String replace(java.lang.CharSequence r3) {
            r2 = this;
            if (r3 != 0) goto L4
            r3 = 0
            return r3
        L4:
            r0 = 0
            int r1 = r3.length()
            java.lang.String r3 = r2.replace(r3, r0, r1)
            return r3
    }

    public java.lang.String replace(java.lang.CharSequence r2, int r3, int r4) {
            r1 = this;
            if (r2 != 0) goto L4
            r2 = 0
            return r2
        L4:
            org.apache.commons.lang3.text.StrBuilder r0 = new org.apache.commons.lang3.text.StrBuilder
            r0.<init>(r4)
            org.apache.commons.lang3.text.StrBuilder r2 = r0.append(r2, r3, r4)
            r3 = 0
            r1.substitute(r2, r3, r4)
            java.lang.String r2 = r2.toString()
            return r2
    }

    public java.lang.String replace(java.lang.Object r3) {
            r2 = this;
            if (r3 != 0) goto L4
            r3 = 0
            return r3
        L4:
            org.apache.commons.lang3.text.StrBuilder r0 = new org.apache.commons.lang3.text.StrBuilder
            r0.<init>()
            org.apache.commons.lang3.text.StrBuilder r3 = r0.append(r3)
            r0 = 0
            int r1 = r3.length()
            r2.substitute(r3, r0, r1)
            java.lang.String r3 = r3.toString()
            return r3
    }

    public java.lang.String replace(java.lang.String r4) {
            r3 = this;
            if (r4 != 0) goto L4
            r4 = 0
            return r4
        L4:
            org.apache.commons.lang3.text.StrBuilder r0 = new org.apache.commons.lang3.text.StrBuilder
            r0.<init>(r4)
            r1 = 0
            int r2 = r4.length()
            boolean r1 = r3.substitute(r0, r1, r2)
            if (r1 != 0) goto L15
            return r4
        L15:
            java.lang.String r4 = r0.toString()
            return r4
    }

    public java.lang.String replace(java.lang.String r3, int r4, int r5) {
            r2 = this;
            if (r3 != 0) goto L4
            r3 = 0
            return r3
        L4:
            org.apache.commons.lang3.text.StrBuilder r0 = new org.apache.commons.lang3.text.StrBuilder
            r0.<init>(r5)
            org.apache.commons.lang3.text.StrBuilder r0 = r0.append(r3, r4, r5)
            r1 = 0
            boolean r1 = r2.substitute(r0, r1, r5)
            if (r1 != 0) goto L1a
            int r5 = r5 + r4
            java.lang.String r3 = r3.substring(r4, r5)
            return r3
        L1a:
            java.lang.String r3 = r0.toString()
            return r3
    }

    public java.lang.String replace(java.lang.StringBuffer r3) {
            r2 = this;
            if (r3 != 0) goto L4
            r3 = 0
            return r3
        L4:
            org.apache.commons.lang3.text.StrBuilder r0 = new org.apache.commons.lang3.text.StrBuilder
            int r1 = r3.length()
            r0.<init>(r1)
            org.apache.commons.lang3.text.StrBuilder r3 = r0.append(r3)
            r0 = 0
            int r1 = r3.length()
            r2.substitute(r3, r0, r1)
            java.lang.String r3 = r3.toString()
            return r3
    }

    public java.lang.String replace(java.lang.StringBuffer r2, int r3, int r4) {
            r1 = this;
            if (r2 != 0) goto L4
            r2 = 0
            return r2
        L4:
            org.apache.commons.lang3.text.StrBuilder r0 = new org.apache.commons.lang3.text.StrBuilder
            r0.<init>(r4)
            org.apache.commons.lang3.text.StrBuilder r2 = r0.append(r2, r3, r4)
            r3 = 0
            r1.substitute(r2, r3, r4)
            java.lang.String r2 = r2.toString()
            return r2
    }

    public java.lang.String replace(org.apache.commons.lang3.text.StrBuilder r3) {
            r2 = this;
            if (r3 != 0) goto L4
            r3 = 0
            return r3
        L4:
            org.apache.commons.lang3.text.StrBuilder r0 = new org.apache.commons.lang3.text.StrBuilder
            int r1 = r3.length()
            r0.<init>(r1)
            org.apache.commons.lang3.text.StrBuilder r3 = r0.append(r3)
            r0 = 0
            int r1 = r3.length()
            r2.substitute(r3, r0, r1)
            java.lang.String r3 = r3.toString()
            return r3
    }

    public java.lang.String replace(org.apache.commons.lang3.text.StrBuilder r2, int r3, int r4) {
            r1 = this;
            if (r2 != 0) goto L4
            r2 = 0
            return r2
        L4:
            org.apache.commons.lang3.text.StrBuilder r0 = new org.apache.commons.lang3.text.StrBuilder
            r0.<init>(r4)
            org.apache.commons.lang3.text.StrBuilder r2 = r0.append(r2, r3, r4)
            r3 = 0
            r1.substitute(r2, r3, r4)
            java.lang.String r2 = r2.toString()
            return r2
    }

    public java.lang.String replace(char[] r3) {
            r2 = this;
            if (r3 != 0) goto L4
            r3 = 0
            return r3
        L4:
            org.apache.commons.lang3.text.StrBuilder r0 = new org.apache.commons.lang3.text.StrBuilder
            int r1 = r3.length
            r0.<init>(r1)
            org.apache.commons.lang3.text.StrBuilder r0 = r0.append(r3)
            r1 = 0
            int r3 = r3.length
            r2.substitute(r0, r1, r3)
            java.lang.String r3 = r0.toString()
            return r3
    }

    public java.lang.String replace(char[] r2, int r3, int r4) {
            r1 = this;
            if (r2 != 0) goto L4
            r2 = 0
            return r2
        L4:
            org.apache.commons.lang3.text.StrBuilder r0 = new org.apache.commons.lang3.text.StrBuilder
            r0.<init>(r4)
            org.apache.commons.lang3.text.StrBuilder r2 = r0.append(r2, r3, r4)
            r3 = 0
            r1.substitute(r2, r3, r4)
            java.lang.String r2 = r2.toString()
            return r2
    }

    public boolean replaceIn(java.lang.StringBuffer r3) {
            r2 = this;
            r0 = 0
            if (r3 != 0) goto L4
            return r0
        L4:
            int r1 = r3.length()
            boolean r3 = r2.replaceIn(r3, r0, r1)
            return r3
    }

    public boolean replaceIn(java.lang.StringBuffer r4, int r5, int r6) {
            r3 = this;
            r0 = 0
            if (r4 != 0) goto L4
            return r0
        L4:
            org.apache.commons.lang3.text.StrBuilder r1 = new org.apache.commons.lang3.text.StrBuilder
            r1.<init>(r6)
            org.apache.commons.lang3.text.StrBuilder r1 = r1.append(r4, r5, r6)
            boolean r2 = r3.substitute(r1, r0, r6)
            if (r2 != 0) goto L14
            return r0
        L14:
            int r6 = r6 + r5
            java.lang.String r0 = r1.toString()
            r4.replace(r5, r6, r0)
            r4 = 1
            return r4
    }

    public boolean replaceIn(java.lang.StringBuilder r3) {
            r2 = this;
            r0 = 0
            if (r3 != 0) goto L4
            return r0
        L4:
            int r1 = r3.length()
            boolean r3 = r2.replaceIn(r3, r0, r1)
            return r3
    }

    public boolean replaceIn(java.lang.StringBuilder r4, int r5, int r6) {
            r3 = this;
            r0 = 0
            if (r4 != 0) goto L4
            return r0
        L4:
            org.apache.commons.lang3.text.StrBuilder r1 = new org.apache.commons.lang3.text.StrBuilder
            r1.<init>(r6)
            org.apache.commons.lang3.text.StrBuilder r1 = r1.append(r4, r5, r6)
            boolean r2 = r3.substitute(r1, r0, r6)
            if (r2 != 0) goto L14
            return r0
        L14:
            int r6 = r6 + r5
            java.lang.String r0 = r1.toString()
            r4.replace(r5, r6, r0)
            r4 = 1
            return r4
    }

    public boolean replaceIn(org.apache.commons.lang3.text.StrBuilder r3) {
            r2 = this;
            r0 = 0
            if (r3 != 0) goto L4
            return r0
        L4:
            int r1 = r3.length()
            boolean r3 = r2.substitute(r3, r0, r1)
            return r3
    }

    public boolean replaceIn(org.apache.commons.lang3.text.StrBuilder r1, int r2, int r3) {
            r0 = this;
            if (r1 != 0) goto L4
            r1 = 0
            return r1
        L4:
            boolean r1 = r0.substitute(r1, r2, r3)
            return r1
    }

    protected java.lang.String resolveVariable(java.lang.String r1, org.apache.commons.lang3.text.StrBuilder r2, int r3, int r4) {
            r0 = this;
            org.apache.commons.lang3.text.StrLookup r2 = r0.getVariableResolver()
            if (r2 != 0) goto L8
            r1 = 0
            return r1
        L8:
            java.lang.String r1 = r2.lookup(r1)
            return r1
    }

    public void setEnableSubstitutionInVariables(boolean r1) {
            r0 = this;
            r0.enableSubstitutionInVariables = r1
            return
    }

    public void setEscapeChar(char r1) {
            r0 = this;
            r0.escapeChar = r1
            return
    }

    public void setPreserveEscapes(boolean r1) {
            r0 = this;
            r0.preserveEscapes = r1
            return
    }

    public org.apache.commons.lang3.text.StrSubstitutor setValueDelimiter(char r1) {
            r0 = this;
            org.apache.commons.lang3.text.StrMatcher r1 = org.apache.commons.lang3.text.StrMatcher.charMatcher(r1)
            org.apache.commons.lang3.text.StrSubstitutor r1 = r0.setValueDelimiterMatcher(r1)
            return r1
    }

    public org.apache.commons.lang3.text.StrSubstitutor setValueDelimiter(java.lang.String r2) {
            r1 = this;
            boolean r0 = org.apache.commons.lang3.StringUtils.isEmpty(r2)
            if (r0 == 0) goto Lb
            r2 = 0
            r1.setValueDelimiterMatcher(r2)
            return r1
        Lb:
            org.apache.commons.lang3.text.StrMatcher r2 = org.apache.commons.lang3.text.StrMatcher.stringMatcher(r2)
            org.apache.commons.lang3.text.StrSubstitutor r2 = r1.setValueDelimiterMatcher(r2)
            return r2
    }

    public org.apache.commons.lang3.text.StrSubstitutor setValueDelimiterMatcher(org.apache.commons.lang3.text.StrMatcher r1) {
            r0 = this;
            r0.valueDelimiterMatcher = r1
            return r0
    }

    public org.apache.commons.lang3.text.StrSubstitutor setVariablePrefix(char r1) {
            r0 = this;
            org.apache.commons.lang3.text.StrMatcher r1 = org.apache.commons.lang3.text.StrMatcher.charMatcher(r1)
            org.apache.commons.lang3.text.StrSubstitutor r1 = r0.setVariablePrefixMatcher(r1)
            return r1
    }

    public org.apache.commons.lang3.text.StrSubstitutor setVariablePrefix(java.lang.String r1) {
            r0 = this;
            java.lang.Object r1 = java.util.Objects.requireNonNull(r1)
            java.lang.String r1 = (java.lang.String) r1
            org.apache.commons.lang3.text.StrMatcher r1 = org.apache.commons.lang3.text.StrMatcher.stringMatcher(r1)
            org.apache.commons.lang3.text.StrSubstitutor r1 = r0.setVariablePrefixMatcher(r1)
            return r1
    }

    public org.apache.commons.lang3.text.StrSubstitutor setVariablePrefixMatcher(org.apache.commons.lang3.text.StrMatcher r2) {
            r1 = this;
            java.lang.String r0 = "prefixMatcher"
            java.lang.Object r2 = java.util.Objects.requireNonNull(r2, r0)
            org.apache.commons.lang3.text.StrMatcher r2 = (org.apache.commons.lang3.text.StrMatcher) r2
            r1.prefixMatcher = r2
            return r1
    }

    public void setVariableResolver(org.apache.commons.lang3.text.StrLookup<?> r1) {
            r0 = this;
            r0.variableResolver = r1
            return
    }

    public org.apache.commons.lang3.text.StrSubstitutor setVariableSuffix(char r1) {
            r0 = this;
            org.apache.commons.lang3.text.StrMatcher r1 = org.apache.commons.lang3.text.StrMatcher.charMatcher(r1)
            org.apache.commons.lang3.text.StrSubstitutor r1 = r0.setVariableSuffixMatcher(r1)
            return r1
    }

    public org.apache.commons.lang3.text.StrSubstitutor setVariableSuffix(java.lang.String r1) {
            r0 = this;
            java.lang.Object r1 = java.util.Objects.requireNonNull(r1)
            java.lang.String r1 = (java.lang.String) r1
            org.apache.commons.lang3.text.StrMatcher r1 = org.apache.commons.lang3.text.StrMatcher.stringMatcher(r1)
            org.apache.commons.lang3.text.StrSubstitutor r1 = r0.setVariableSuffixMatcher(r1)
            return r1
    }

    public org.apache.commons.lang3.text.StrSubstitutor setVariableSuffixMatcher(org.apache.commons.lang3.text.StrMatcher r1) {
            r0 = this;
            java.lang.Object r1 = java.util.Objects.requireNonNull(r1)
            org.apache.commons.lang3.text.StrMatcher r1 = (org.apache.commons.lang3.text.StrMatcher) r1
            r0.suffixMatcher = r1
            return r0
    }

    protected boolean substitute(org.apache.commons.lang3.text.StrBuilder r2, int r3, int r4) {
            r1 = this;
            r0 = 0
            int r2 = r1.substitute(r2, r3, r4, r0)
            if (r2 <= 0) goto L9
            r2 = 1
            goto La
        L9:
            r2 = 0
        La:
            return r2
    }
}
