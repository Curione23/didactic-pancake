package org.apache.commons.lang3.text;

/* JADX INFO: loaded from: classes2.dex */
@java.lang.Deprecated
public class ExtendedMessageFormat extends java.text.MessageFormat {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final java.lang.String DUMMY_PATTERN = "";
    private static final char END_FE = '}';
    private static final int HASH_SEED = 31;
    private static final char QUOTE = '\'';
    private static final char START_FE = '{';
    private static final char START_FMT = ',';
    private static final long serialVersionUID = -2362048321261811743L;
    private final java.util.Map<java.lang.String, ? extends org.apache.commons.lang3.text.FormatFactory> registry;
    private java.lang.String toPattern;

    /* JADX INFO: renamed from: $r8$lambda$e0qfpZXSjs7T3eqaqVSaHkij-aw, reason: not valid java name */
    public static /* synthetic */ boolean m2674$r8$lambda$e0qfpZXSjs7T3eqaqVSaHkijaw(java.lang.Object r0) {
            boolean r0 = java.util.Objects.nonNull(r0)
            return r0
    }

    static {
            return
    }

    public ExtendedMessageFormat(java.lang.String r2) {
            r1 = this;
            java.util.Locale r0 = java.util.Locale.getDefault()
            r1.<init>(r2, r0)
            return
    }

    public ExtendedMessageFormat(java.lang.String r2, java.util.Locale r3) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r3, r0)
            return
    }

    public ExtendedMessageFormat(java.lang.String r2, java.util.Locale r3, java.util.Map<java.lang.String, ? extends org.apache.commons.lang3.text.FormatFactory> r4) {
            r1 = this;
            java.lang.String r0 = ""
            r1.<init>(r0)
            java.util.Locale r3 = org.apache.commons.lang3.LocaleUtils.toLocale(r3)
            r1.setLocale(r3)
            r1.registry = r4
            r1.applyPattern(r2)
            return
    }

    public ExtendedMessageFormat(java.lang.String r2, java.util.Map<java.lang.String, ? extends org.apache.commons.lang3.text.FormatFactory> r3) {
            r1 = this;
            java.util.Locale r0 = java.util.Locale.getDefault()
            r1.<init>(r2, r0, r3)
            return
    }

    private java.lang.StringBuilder appendQuotedString(java.lang.String r6, java.text.ParsePosition r7, java.lang.StringBuilder r8) {
            r5 = this;
            r0 = 39
            if (r8 == 0) goto L7
            r8.append(r0)
        L7:
            r5.next(r7)
            int r1 = r7.getIndex()
            char[] r2 = r6.toCharArray()
            int r3 = r7.getIndex()
        L16:
            int r4 = r6.length()
            if (r3 >= r4) goto L3b
            int r4 = r7.getIndex()
            char r4 = r2[r4]
            if (r4 != r0) goto L35
            r5.next(r7)
            if (r8 != 0) goto L2b
            r6 = 0
            goto L34
        L2b:
            int r6 = r7.getIndex()
            int r6 = r6 - r1
            java.lang.StringBuilder r6 = r8.append(r2, r1, r6)
        L34:
            return r6
        L35:
            r5.next(r7)
            int r3 = r3 + 1
            goto L16
        L3b:
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r8 = "Unterminated quoted string at position "
            r7.<init>(r8)
            java.lang.StringBuilder r7 = r7.append(r1)
            java.lang.String r7 = r7.toString()
            r6.<init>(r7)
            throw r6
    }

    private boolean containsElements(java.util.Collection<?> r2) {
            r1 = this;
            if (r2 == 0) goto L17
            boolean r0 = r2.isEmpty()
            if (r0 == 0) goto L9
            goto L17
        L9:
            java.util.stream.Stream r2 = r2.stream()
            org.apache.commons.lang3.text.ExtendedMessageFormat$$ExternalSyntheticLambda0 r0 = new org.apache.commons.lang3.text.ExtendedMessageFormat$$ExternalSyntheticLambda0
            r0.<init>()
            boolean r2 = r2.anyMatch(r0)
            return r2
        L17:
            r2 = 0
            return r2
    }

    private java.text.Format getFormat(java.lang.String r4) {
            r3 = this;
            java.util.Map<java.lang.String, ? extends org.apache.commons.lang3.text.FormatFactory> r0 = r3.registry
            r1 = 0
            if (r0 == 0) goto L37
            r0 = 44
            int r0 = r4.indexOf(r0)
            if (r0 <= 0) goto L23
            r2 = 0
            java.lang.String r2 = r4.substring(r2, r0)
            java.lang.String r2 = r2.trim()
            int r0 = r0 + 1
            java.lang.String r4 = r4.substring(r0)
            java.lang.String r4 = r4.trim()
            r0 = r4
            r4 = r2
            goto L24
        L23:
            r0 = r1
        L24:
            java.util.Map<java.lang.String, ? extends org.apache.commons.lang3.text.FormatFactory> r2 = r3.registry
            java.lang.Object r2 = r2.get(r4)
            org.apache.commons.lang3.text.FormatFactory r2 = (org.apache.commons.lang3.text.FormatFactory) r2
            if (r2 == 0) goto L37
            java.util.Locale r1 = r3.getLocale()
            java.text.Format r4 = r2.getFormat(r4, r0, r1)
            return r4
        L37:
            return r1
    }

    private void getQuotedString(java.lang.String r2, java.text.ParsePosition r3) {
            r1 = this;
            r0 = 0
            r1.appendQuotedString(r2, r3, r0)
            return
    }

    private java.lang.String insertFormats(java.lang.String r7, java.util.ArrayList<java.lang.String> r8) {
            r6 = this;
            boolean r0 = r6.containsElements(r8)
            if (r0 != 0) goto L7
            return r7
        L7:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            int r1 = r7.length()
            int r1 = r1 * 2
            r0.<init>(r1)
            java.text.ParsePosition r1 = new java.text.ParsePosition
            r2 = 0
            r1.<init>(r2)
            r3 = -1
        L19:
            int r4 = r1.getIndex()
            int r5 = r7.length()
            if (r4 >= r5) goto L6d
            int r4 = r1.getIndex()
            char r4 = r7.charAt(r4)
            r5 = 39
            if (r4 == r5) goto L69
            r5 = 123(0x7b, float:1.72E-43)
            if (r4 == r5) goto L41
            r5 = 125(0x7d, float:1.75E-43)
            if (r4 == r5) goto L38
            goto L3a
        L38:
            int r2 = r2 + (-1)
        L3a:
            r0.append(r4)
            r6.next(r1)
            goto L19
        L41:
            int r2 = r2 + 1
            java.lang.StringBuilder r4 = r0.append(r5)
            java.text.ParsePosition r5 = r6.next(r1)
            int r5 = r6.readArgumentIndex(r7, r5)
            r4.append(r5)
            r4 = 1
            if (r2 != r4) goto L19
            int r3 = r3 + 1
            java.lang.Object r4 = r8.get(r3)
            java.lang.String r4 = (java.lang.String) r4
            if (r4 == 0) goto L19
            r5 = 44
            java.lang.StringBuilder r5 = r0.append(r5)
            r5.append(r4)
            goto L19
        L69:
            r6.appendQuotedString(r7, r1, r0)
            goto L19
        L6d:
            java.lang.String r7 = r0.toString()
            return r7
    }

    private java.text.ParsePosition next(java.text.ParsePosition r2) {
            r1 = this;
            int r0 = r2.getIndex()
            int r0 = r0 + 1
            r2.setIndex(r0)
            return r2
    }

    private java.lang.String parseFormatDescription(java.lang.String r6, java.text.ParsePosition r7) {
            r5 = this;
            int r0 = r7.getIndex()
            r5.seekNonWs(r6, r7)
            int r1 = r7.getIndex()
            r2 = 1
        Lc:
            int r3 = r7.getIndex()
            int r4 = r6.length()
            if (r3 >= r4) goto L42
            int r3 = r7.getIndex()
            char r3 = r6.charAt(r3)
            r4 = 39
            if (r3 == r4) goto L3b
            r4 = 123(0x7b, float:1.72E-43)
            if (r3 == r4) goto L38
            r4 = 125(0x7d, float:1.75E-43)
            if (r3 == r4) goto L2b
            goto L3e
        L2b:
            int r2 = r2 + (-1)
            if (r2 != 0) goto L3e
            int r7 = r7.getIndex()
            java.lang.String r6 = r6.substring(r1, r7)
            return r6
        L38:
            int r2 = r2 + 1
            goto L3e
        L3b:
            r5.getQuotedString(r6, r7)
        L3e:
            r5.next(r7)
            goto Lc
        L42:
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r1 = "Unterminated format element at position "
            r7.<init>(r1)
            java.lang.StringBuilder r7 = r7.append(r0)
            java.lang.String r7 = r7.toString()
            r6.<init>(r7)
            throw r6
    }

    private int readArgumentIndex(java.lang.String r8, java.text.ParsePosition r9) {
            r7 = this;
            int r0 = r9.getIndex()
            r7.seekNonWs(r8, r9)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r2 = 0
        Ld:
            if (r2 != 0) goto L5d
            int r3 = r9.getIndex()
            int r4 = r8.length()
            if (r3 >= r4) goto L5d
            int r2 = r9.getIndex()
            char r2 = r8.charAt(r2)
            boolean r3 = java.lang.Character.isWhitespace(r2)
            r4 = 1
            r5 = 125(0x7d, float:1.75E-43)
            r6 = 44
            if (r3 == 0) goto L3d
            r7.seekNonWs(r8, r9)
            int r2 = r9.getIndex()
            char r2 = r8.charAt(r2)
            if (r2 == r6) goto L3d
            if (r2 == r5) goto L3d
            r2 = r4
            goto L59
        L3d:
            if (r2 == r6) goto L41
            if (r2 != r5) goto L50
        L41:
            int r3 = r1.length()
            if (r3 <= 0) goto L50
            java.lang.String r3 = r1.toString()     // Catch: java.lang.NumberFormatException -> L50
            int r8 = java.lang.Integer.parseInt(r3)     // Catch: java.lang.NumberFormatException -> L50
            return r8
        L50:
            boolean r3 = java.lang.Character.isDigit(r2)
            r3 = r3 ^ r4
            r1.append(r2)
            r2 = r3
        L59:
            r7.next(r9)
            goto Ld
        L5d:
            if (r2 == 0) goto L86
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Invalid format argument index at position "
            r2.<init>(r3)
            java.lang.StringBuilder r2 = r2.append(r0)
            java.lang.String r3 = ": "
            java.lang.StringBuilder r2 = r2.append(r3)
            int r9 = r9.getIndex()
            java.lang.String r8 = r8.substring(r0, r9)
            java.lang.StringBuilder r8 = r2.append(r8)
            java.lang.String r8 = r8.toString()
            r1.<init>(r8)
            throw r1
        L86:
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            java.lang.String r1 = "Unterminated format element at position "
            r9.<init>(r1)
            java.lang.StringBuilder r9 = r9.append(r0)
            java.lang.String r9 = r9.toString()
            r8.<init>(r9)
            throw r8
    }

    private void seekNonWs(java.lang.String r4, java.text.ParsePosition r5) {
            r3 = this;
            char[] r0 = r4.toCharArray()
        L4:
            org.apache.commons.lang3.text.StrMatcher r1 = org.apache.commons.lang3.text.StrMatcher.splitMatcher()
            int r2 = r5.getIndex()
            int r1 = r1.isMatch(r0, r2)
            int r2 = r5.getIndex()
            int r2 = r2 + r1
            r5.setIndex(r2)
            if (r1 <= 0) goto L24
            int r1 = r5.getIndex()
            int r2 = r4.length()
            if (r1 < r2) goto L4
        L24:
            return
    }

    @Override // java.text.MessageFormat
    public final void applyPattern(java.lang.String r13) {
            r12 = this;
            java.util.Map<java.lang.String, ? extends org.apache.commons.lang3.text.FormatFactory> r0 = r12.registry
            if (r0 != 0) goto Le
            super.applyPattern(r13)
            java.lang.String r13 = super.toPattern()
            r12.toPattern = r13
            return
        Le:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            int r3 = r13.length()
            r2.<init>(r3)
            java.text.ParsePosition r3 = new java.text.ParsePosition
            r4 = 0
            r3.<init>(r4)
            char[] r5 = r13.toCharArray()
            r6 = r4
        L2c:
            int r7 = r3.getIndex()
            int r8 = r13.length()
            if (r7 >= r8) goto Ld8
            int r7 = r3.getIndex()
            char r7 = r5[r7]
            r8 = 39
            if (r7 == r8) goto Ld3
            r8 = 123(0x7b, float:1.72E-43)
            if (r7 == r8) goto L46
            goto Lb0
        L46:
            int r6 = r6 + 1
            r12.seekNonWs(r13, r3)
            int r7 = r3.getIndex()
            java.text.ParsePosition r9 = r12.next(r3)
            int r9 = r12.readArgumentIndex(r13, r9)
            java.lang.StringBuilder r8 = r2.append(r8)
            r8.append(r9)
            r12.seekNonWs(r13, r3)
            int r8 = r3.getIndex()
            char r8 = r5[r8]
            r9 = 44
            r10 = 0
            if (r8 != r9) goto L82
            java.text.ParsePosition r8 = r12.next(r3)
            java.lang.String r8 = r12.parseFormatDescription(r13, r8)
            java.text.Format r11 = r12.getFormat(r8)
            if (r11 != 0) goto L84
            java.lang.StringBuilder r9 = r2.append(r9)
            r9.append(r8)
            goto L84
        L82:
            r8 = r10
            r11 = r8
        L84:
            r0.add(r11)
            if (r11 != 0) goto L8a
            goto L8b
        L8a:
            r10 = r8
        L8b:
            r1.add(r10)
            int r8 = r0.size()
            r9 = 1
            if (r8 != r6) goto L97
            r8 = r9
            goto L98
        L97:
            r8 = r4
        L98:
            org.apache.commons.lang3.Validate.isTrue(r8)
            int r8 = r1.size()
            if (r8 != r6) goto La2
            goto La3
        La2:
            r9 = r4
        La3:
            org.apache.commons.lang3.Validate.isTrue(r9)
            int r8 = r3.getIndex()
            char r8 = r5[r8]
            r9 = 125(0x7d, float:1.75E-43)
            if (r8 != r9) goto Lbe
        Lb0:
            int r7 = r3.getIndex()
            char r7 = r5[r7]
            r2.append(r7)
            r12.next(r3)
            goto L2c
        Lbe:
            java.lang.IllegalArgumentException r13 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Unreadable format element at position "
            r0.<init>(r1)
            java.lang.StringBuilder r0 = r0.append(r7)
            java.lang.String r0 = r0.toString()
            r13.<init>(r0)
            throw r13
        Ld3:
            r12.appendQuotedString(r13, r3, r2)
            goto L2c
        Ld8:
            java.lang.String r13 = r2.toString()
            super.applyPattern(r13)
            java.lang.String r13 = super.toPattern()
            java.lang.String r13 = r12.insertFormats(r13, r1)
            r12.toPattern = r13
            boolean r13 = r12.containsElements(r0)
            if (r13 == 0) goto L10d
            java.text.Format[] r13 = r12.getFormats()
            java.util.Iterator r0 = r0.iterator()
        Lf7:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L10a
            java.lang.Object r1 = r0.next()
            java.text.Format r1 = (java.text.Format) r1
            if (r1 == 0) goto L107
            r13[r4] = r1
        L107:
            int r4 = r4 + 1
            goto Lf7
        L10a:
            super.setFormats(r13)
        L10d:
            return
    }

    @Override // java.text.MessageFormat
    public boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r5 != r4) goto L4
            return r0
        L4:
            r1 = 0
            if (r5 != 0) goto L8
            return r1
        L8:
            boolean r2 = super.equals(r5)
            if (r2 != 0) goto Lf
            return r1
        Lf:
            java.lang.Class r2 = r4.getClass()
            java.lang.Class r3 = r5.getClass()
            boolean r2 = org.apache.commons.lang3.ObjectUtils.notEqual(r2, r3)
            if (r2 == 0) goto L1e
            return r1
        L1e:
            org.apache.commons.lang3.text.ExtendedMessageFormat r5 = (org.apache.commons.lang3.text.ExtendedMessageFormat) r5
            java.lang.String r2 = r4.toPattern
            java.lang.String r3 = r5.toPattern
            boolean r2 = org.apache.commons.lang3.ObjectUtils.notEqual(r2, r3)
            if (r2 == 0) goto L2b
            return r1
        L2b:
            java.util.Map<java.lang.String, ? extends org.apache.commons.lang3.text.FormatFactory> r1 = r4.registry
            java.util.Map<java.lang.String, ? extends org.apache.commons.lang3.text.FormatFactory> r5 = r5.registry
            boolean r5 = org.apache.commons.lang3.ObjectUtils.notEqual(r1, r5)
            r5 = r5 ^ r0
            return r5
    }

    @Override // java.text.MessageFormat
    public int hashCode() {
            r2 = this;
            int r0 = super.hashCode()
            int r0 = r0 * 31
            java.util.Map<java.lang.String, ? extends org.apache.commons.lang3.text.FormatFactory> r1 = r2.registry
            int r1 = java.util.Objects.hashCode(r1)
            int r0 = r0 + r1
            int r0 = r0 * 31
            java.lang.String r1 = r2.toPattern
            int r1 = java.util.Objects.hashCode(r1)
            int r0 = r0 + r1
            return r0
    }

    @Override // java.text.MessageFormat
    public void setFormat(int r1, java.text.Format r2) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            r1.<init>()
            throw r1
    }

    @Override // java.text.MessageFormat
    public void setFormatByArgumentIndex(int r1, java.text.Format r2) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            r1.<init>()
            throw r1
    }

    @Override // java.text.MessageFormat
    public void setFormats(java.text.Format[] r1) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            r1.<init>()
            throw r1
    }

    @Override // java.text.MessageFormat
    public void setFormatsByArgumentIndex(java.text.Format[] r1) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            r1.<init>()
            throw r1
    }

    @Override // java.text.MessageFormat
    public java.lang.String toPattern() {
            r1 = this;
            java.lang.String r0 = r1.toPattern
            return r0
    }
}
