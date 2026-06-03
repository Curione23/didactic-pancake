package org.apache.commons.lang3;

/* JADX INFO: loaded from: classes2.dex */
@java.lang.Deprecated
public class StringEscapeUtils {
    public static final org.apache.commons.lang3.text.translate.CharSequenceTranslator ESCAPE_CSV = null;
    public static final org.apache.commons.lang3.text.translate.CharSequenceTranslator ESCAPE_ECMASCRIPT = null;
    public static final org.apache.commons.lang3.text.translate.CharSequenceTranslator ESCAPE_HTML3 = null;
    public static final org.apache.commons.lang3.text.translate.CharSequenceTranslator ESCAPE_HTML4 = null;
    public static final org.apache.commons.lang3.text.translate.CharSequenceTranslator ESCAPE_JAVA = null;
    public static final org.apache.commons.lang3.text.translate.CharSequenceTranslator ESCAPE_JSON = null;

    @java.lang.Deprecated
    public static final org.apache.commons.lang3.text.translate.CharSequenceTranslator ESCAPE_XML = null;
    public static final org.apache.commons.lang3.text.translate.CharSequenceTranslator ESCAPE_XML10 = null;
    public static final org.apache.commons.lang3.text.translate.CharSequenceTranslator ESCAPE_XML11 = null;
    public static final org.apache.commons.lang3.text.translate.CharSequenceTranslator UNESCAPE_CSV = null;
    public static final org.apache.commons.lang3.text.translate.CharSequenceTranslator UNESCAPE_ECMASCRIPT = null;
    public static final org.apache.commons.lang3.text.translate.CharSequenceTranslator UNESCAPE_HTML3 = null;
    public static final org.apache.commons.lang3.text.translate.CharSequenceTranslator UNESCAPE_HTML4 = null;
    public static final org.apache.commons.lang3.text.translate.CharSequenceTranslator UNESCAPE_JAVA = null;
    public static final org.apache.commons.lang3.text.translate.CharSequenceTranslator UNESCAPE_JSON = null;
    public static final org.apache.commons.lang3.text.translate.CharSequenceTranslator UNESCAPE_XML = null;

    static class CsvEscaper extends org.apache.commons.lang3.text.translate.CharSequenceTranslator {
        private static final char CSV_DELIMITER = ',';
        private static final char CSV_QUOTE = '\"';
        private static final java.lang.String CSV_QUOTE_STR = null;
        private static final char[] CSV_SEARCH_CHARS = null;

        static {
                r0 = 34
                java.lang.String r0 = java.lang.String.valueOf(r0)
                org.apache.commons.lang3.StringEscapeUtils.CsvEscaper.CSV_QUOTE_STR = r0
                r0 = 4
                char[] r0 = new char[r0]
                r0 = {x0012: FILL_ARRAY_DATA , data: [44, 34, 13, 10} // fill-array
                org.apache.commons.lang3.StringEscapeUtils.CsvEscaper.CSV_SEARCH_CHARS = r0
                return
        }

        CsvEscaper() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // org.apache.commons.lang3.text.translate.CharSequenceTranslator
        public int translate(java.lang.CharSequence r4, int r5, java.io.Writer r6) throws java.io.IOException {
                r3 = this;
                if (r5 != 0) goto L46
                java.lang.String r5 = r4.toString()
                char[] r0 = org.apache.commons.lang3.StringEscapeUtils.CsvEscaper.CSV_SEARCH_CHARS
                boolean r5 = org.apache.commons.lang3.StringUtils.containsNone(r5, r0)
                if (r5 == 0) goto L16
                java.lang.String r5 = r4.toString()
                r6.write(r5)
                goto L3c
            L16:
                r5 = 34
                r6.write(r5)
                java.lang.String r0 = r4.toString()
                java.lang.String r1 = org.apache.commons.lang3.StringEscapeUtils.CsvEscaper.CSV_QUOTE_STR
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.StringBuilder r2 = r2.append(r1)
                java.lang.StringBuilder r2 = r2.append(r1)
                java.lang.String r2 = r2.toString()
                java.lang.String r0 = org.apache.commons.lang3.StringUtils.replace(r0, r1, r2)
                r6.write(r0)
                r6.write(r5)
            L3c:
                r5 = 0
                int r6 = r4.length()
                int r4 = java.lang.Character.codePointCount(r4, r5, r6)
                return r4
            L46:
                java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
                java.lang.String r5 = "CsvEscaper should never reach the [1] index"
                r4.<init>(r5)
                throw r4
        }
    }

    static class CsvUnescaper extends org.apache.commons.lang3.text.translate.CharSequenceTranslator {
        private static final char CSV_DELIMITER = ',';
        private static final char CSV_QUOTE = '\"';
        private static final java.lang.String CSV_QUOTE_STR = null;
        private static final char[] CSV_SEARCH_CHARS = null;

        static {
                r0 = 34
                java.lang.String r0 = java.lang.String.valueOf(r0)
                org.apache.commons.lang3.StringEscapeUtils.CsvUnescaper.CSV_QUOTE_STR = r0
                r0 = 4
                char[] r0 = new char[r0]
                r0 = {x0012: FILL_ARRAY_DATA , data: [44, 34, 13, 10} // fill-array
                org.apache.commons.lang3.StringEscapeUtils.CsvUnescaper.CSV_SEARCH_CHARS = r0
                return
        }

        CsvUnescaper() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // org.apache.commons.lang3.text.translate.CharSequenceTranslator
        public int translate(java.lang.CharSequence r4, int r5, java.io.Writer r6) throws java.io.IOException {
                r3 = this;
                if (r5 != 0) goto L68
                r5 = 0
                char r0 = r4.charAt(r5)
                r1 = 34
                if (r0 != r1) goto L58
                int r0 = r4.length()
                r2 = 1
                int r0 = r0 - r2
                char r0 = r4.charAt(r0)
                if (r0 == r1) goto L18
                goto L58
            L18:
                int r0 = r4.length()
                int r0 = r0 - r2
                java.lang.CharSequence r0 = r4.subSequence(r2, r0)
                java.lang.String r0 = r0.toString()
                char[] r1 = org.apache.commons.lang3.StringEscapeUtils.CsvUnescaper.CSV_SEARCH_CHARS
                boolean r1 = org.apache.commons.lang3.StringUtils.containsAny(r0, r1)
                if (r1 == 0) goto L48
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = org.apache.commons.lang3.StringEscapeUtils.CsvUnescaper.CSV_QUOTE_STR
                java.lang.StringBuilder r1 = r1.append(r2)
                java.lang.StringBuilder r1 = r1.append(r2)
                java.lang.String r1 = r1.toString()
                java.lang.String r0 = org.apache.commons.lang3.StringUtils.replace(r0, r1, r2)
                r6.write(r0)
                goto L4f
            L48:
                java.lang.String r0 = r4.toString()
                r6.write(r0)
            L4f:
                int r6 = r4.length()
                int r4 = java.lang.Character.codePointCount(r4, r5, r6)
                return r4
            L58:
                java.lang.String r0 = r4.toString()
                r6.write(r0)
                int r6 = r4.length()
                int r4 = java.lang.Character.codePointCount(r4, r5, r6)
                return r4
            L68:
                java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
                java.lang.String r5 = "CsvUnescaper should never reach the [1] index"
                r4.<init>(r5)
                throw r4
        }
    }

    static {
            org.apache.commons.lang3.text.translate.LookupTranslator r0 = new org.apache.commons.lang3.text.translate.LookupTranslator
            r1 = 2
            java.lang.String[][] r2 = new java.lang.String[r1][]
            java.lang.String[] r3 = new java.lang.String[r1]
            r4 = 0
            java.lang.String r5 = "\""
            r3[r4] = r5
            r6 = 1
            java.lang.String r7 = "\\\""
            r3[r6] = r7
            r2[r4] = r3
            java.lang.String[] r3 = new java.lang.String[r1]
            java.lang.String r8 = "\\"
            r3[r4] = r8
            java.lang.String r9 = "\\\\"
            r3[r6] = r9
            r2[r6] = r3
            r0.<init>(r2)
            org.apache.commons.lang3.text.translate.CharSequenceTranslator[] r2 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[r6]
            org.apache.commons.lang3.text.translate.LookupTranslator r3 = new org.apache.commons.lang3.text.translate.LookupTranslator
            java.lang.String[][] r10 = org.apache.commons.lang3.text.translate.EntityArrays.JAVA_CTRL_CHARS_ESCAPE()
            r3.<init>(r10)
            r2[r4] = r3
            org.apache.commons.lang3.text.translate.CharSequenceTranslator r0 = r0.with(r2)
            org.apache.commons.lang3.text.translate.CharSequenceTranslator[] r2 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[r6]
            r3 = 32
            r10 = 127(0x7f, float:1.78E-43)
            org.apache.commons.lang3.text.translate.JavaUnicodeEscaper r11 = org.apache.commons.lang3.text.translate.JavaUnicodeEscaper.outsideOf(r3, r10)
            r2[r4] = r11
            org.apache.commons.lang3.text.translate.CharSequenceTranslator r0 = r0.with(r2)
            org.apache.commons.lang3.StringEscapeUtils.ESCAPE_JAVA = r0
            org.apache.commons.lang3.text.translate.AggregateTranslator r0 = new org.apache.commons.lang3.text.translate.AggregateTranslator
            r2 = 3
            org.apache.commons.lang3.text.translate.CharSequenceTranslator[] r11 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[r2]
            org.apache.commons.lang3.text.translate.LookupTranslator r12 = new org.apache.commons.lang3.text.translate.LookupTranslator
            r13 = 4
            java.lang.String[][] r14 = new java.lang.String[r13][]
            java.lang.String[] r15 = new java.lang.String[r1]
            java.lang.String r16 = "'"
            r15[r4] = r16
            java.lang.String r17 = "\\'"
            r15[r6] = r17
            r14[r4] = r15
            java.lang.String[] r15 = new java.lang.String[r1]
            r15[r4] = r5
            r15[r6] = r7
            r14[r6] = r15
            java.lang.String[] r15 = new java.lang.String[r1]
            r15[r4] = r8
            r15[r6] = r9
            r14[r1] = r15
            java.lang.String[] r15 = new java.lang.String[r1]
            java.lang.String r18 = "/"
            r15[r4] = r18
            java.lang.String r19 = "\\/"
            r15[r6] = r19
            r14[r2] = r15
            r12.<init>(r14)
            r11[r4] = r12
            org.apache.commons.lang3.text.translate.LookupTranslator r12 = new org.apache.commons.lang3.text.translate.LookupTranslator
            java.lang.String[][] r14 = org.apache.commons.lang3.text.translate.EntityArrays.JAVA_CTRL_CHARS_ESCAPE()
            r12.<init>(r14)
            r11[r6] = r12
            org.apache.commons.lang3.text.translate.JavaUnicodeEscaper r12 = org.apache.commons.lang3.text.translate.JavaUnicodeEscaper.outsideOf(r3, r10)
            r11[r1] = r12
            r0.<init>(r11)
            org.apache.commons.lang3.StringEscapeUtils.ESCAPE_ECMASCRIPT = r0
            org.apache.commons.lang3.text.translate.AggregateTranslator r0 = new org.apache.commons.lang3.text.translate.AggregateTranslator
            org.apache.commons.lang3.text.translate.CharSequenceTranslator[] r11 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[r2]
            org.apache.commons.lang3.text.translate.LookupTranslator r12 = new org.apache.commons.lang3.text.translate.LookupTranslator
            java.lang.String[][] r14 = new java.lang.String[r2][]
            java.lang.String[] r15 = new java.lang.String[r1]
            r15[r4] = r5
            r15[r6] = r7
            r14[r4] = r15
            java.lang.String[] r15 = new java.lang.String[r1]
            r15[r4] = r8
            r15[r6] = r9
            r14[r6] = r15
            java.lang.String[] r15 = new java.lang.String[r1]
            r15[r4] = r18
            r15[r6] = r19
            r14[r1] = r15
            r12.<init>(r14)
            r11[r4] = r12
            org.apache.commons.lang3.text.translate.LookupTranslator r12 = new org.apache.commons.lang3.text.translate.LookupTranslator
            java.lang.String[][] r14 = org.apache.commons.lang3.text.translate.EntityArrays.JAVA_CTRL_CHARS_ESCAPE()
            r12.<init>(r14)
            r11[r6] = r12
            org.apache.commons.lang3.text.translate.JavaUnicodeEscaper r3 = org.apache.commons.lang3.text.translate.JavaUnicodeEscaper.outsideOf(r3, r10)
            r11[r1] = r3
            r0.<init>(r11)
            org.apache.commons.lang3.StringEscapeUtils.ESCAPE_JSON = r0
            org.apache.commons.lang3.text.translate.AggregateTranslator r0 = new org.apache.commons.lang3.text.translate.AggregateTranslator
            org.apache.commons.lang3.text.translate.CharSequenceTranslator[] r3 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[r1]
            org.apache.commons.lang3.text.translate.LookupTranslator r11 = new org.apache.commons.lang3.text.translate.LookupTranslator
            java.lang.String[][] r12 = org.apache.commons.lang3.text.translate.EntityArrays.BASIC_ESCAPE()
            r11.<init>(r12)
            r3[r4] = r11
            org.apache.commons.lang3.text.translate.LookupTranslator r11 = new org.apache.commons.lang3.text.translate.LookupTranslator
            java.lang.String[][] r12 = org.apache.commons.lang3.text.translate.EntityArrays.APOS_ESCAPE()
            r11.<init>(r12)
            r3[r6] = r11
            r0.<init>(r3)
            org.apache.commons.lang3.StringEscapeUtils.ESCAPE_XML = r0
            org.apache.commons.lang3.text.translate.AggregateTranslator r0 = new org.apache.commons.lang3.text.translate.AggregateTranslator
            r3 = 6
            org.apache.commons.lang3.text.translate.CharSequenceTranslator[] r11 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[r3]
            org.apache.commons.lang3.text.translate.LookupTranslator r12 = new org.apache.commons.lang3.text.translate.LookupTranslator
            java.lang.String[][] r14 = org.apache.commons.lang3.text.translate.EntityArrays.BASIC_ESCAPE()
            r12.<init>(r14)
            r11[r4] = r12
            org.apache.commons.lang3.text.translate.LookupTranslator r12 = new org.apache.commons.lang3.text.translate.LookupTranslator
            java.lang.String[][] r14 = org.apache.commons.lang3.text.translate.EntityArrays.APOS_ESCAPE()
            r12.<init>(r14)
            r11[r6] = r12
            org.apache.commons.lang3.text.translate.LookupTranslator r12 = new org.apache.commons.lang3.text.translate.LookupTranslator
            r14 = 31
            java.lang.String[][] r15 = new java.lang.String[r14][]
            java.lang.String[] r14 = new java.lang.String[r1]
            java.lang.String r19 = "\u0000"
            r14[r4] = r19
            java.lang.String r20 = ""
            r14[r6] = r20
            r15[r4] = r14
            java.lang.String[] r14 = new java.lang.String[r1]
            java.lang.String r21 = "\u0001"
            r14[r4] = r21
            r14[r6] = r20
            r15[r6] = r14
            java.lang.String[] r14 = new java.lang.String[r1]
            java.lang.String r21 = "\u0002"
            r14[r4] = r21
            r14[r6] = r20
            r15[r1] = r14
            java.lang.String[] r14 = new java.lang.String[r1]
            java.lang.String r21 = "\u0003"
            r14[r4] = r21
            r14[r6] = r20
            r15[r2] = r14
            java.lang.String[] r14 = new java.lang.String[r1]
            java.lang.String r21 = "\u0004"
            r14[r4] = r21
            r14[r6] = r20
            r15[r13] = r14
            java.lang.String[] r14 = new java.lang.String[r1]
            java.lang.String r21 = "\u0005"
            r14[r4] = r21
            r14[r6] = r20
            r13 = 5
            r15[r13] = r14
            java.lang.String[] r14 = new java.lang.String[r1]
            java.lang.String r22 = "\u0006"
            r14[r4] = r22
            r14[r6] = r20
            r15[r3] = r14
            java.lang.String[] r14 = new java.lang.String[r1]
            java.lang.String r22 = "\u0007"
            r14[r4] = r22
            r14[r6] = r20
            r22 = 7
            r15[r22] = r14
            java.lang.String[] r14 = new java.lang.String[r1]
            java.lang.String r23 = "\b"
            r14[r4] = r23
            r14[r6] = r20
            r3 = 8
            r15[r3] = r14
            java.lang.String[] r14 = new java.lang.String[r1]
            java.lang.String r24 = "\u000b"
            r14[r4] = r24
            r14[r6] = r20
            r24 = 9
            r15[r24] = r14
            java.lang.String[] r14 = new java.lang.String[r1]
            java.lang.String r24 = "\f"
            r14[r4] = r24
            r14[r6] = r20
            r24 = 10
            r15[r24] = r14
            java.lang.String[] r14 = new java.lang.String[r1]
            java.lang.String r24 = "\u000e"
            r14[r4] = r24
            r14[r6] = r20
            r24 = 11
            r15[r24] = r14
            java.lang.String[] r14 = new java.lang.String[r1]
            java.lang.String r24 = "\u000f"
            r14[r4] = r24
            r14[r6] = r20
            r24 = 12
            r15[r24] = r14
            java.lang.String[] r14 = new java.lang.String[r1]
            java.lang.String r24 = "\u0010"
            r14[r4] = r24
            r14[r6] = r20
            r24 = 13
            r15[r24] = r14
            java.lang.String[] r14 = new java.lang.String[r1]
            java.lang.String r24 = "\u0011"
            r14[r4] = r24
            r14[r6] = r20
            r24 = 14
            r15[r24] = r14
            java.lang.String[] r14 = new java.lang.String[r1]
            java.lang.String r24 = "\u0012"
            r14[r4] = r24
            r14[r6] = r20
            r24 = 15
            r15[r24] = r14
            java.lang.String[] r14 = new java.lang.String[r1]
            java.lang.String r24 = "\u0013"
            r14[r4] = r24
            r14[r6] = r20
            r24 = 16
            r15[r24] = r14
            java.lang.String[] r14 = new java.lang.String[r1]
            java.lang.String r24 = "\u0014"
            r14[r4] = r24
            r14[r6] = r20
            r24 = 17
            r15[r24] = r14
            java.lang.String[] r14 = new java.lang.String[r1]
            java.lang.String r24 = "\u0015"
            r14[r4] = r24
            r14[r6] = r20
            r24 = 18
            r15[r24] = r14
            java.lang.String[] r14 = new java.lang.String[r1]
            java.lang.String r24 = "\u0016"
            r14[r4] = r24
            r14[r6] = r20
            r24 = 19
            r15[r24] = r14
            java.lang.String[] r14 = new java.lang.String[r1]
            java.lang.String r24 = "\u0017"
            r14[r4] = r24
            r14[r6] = r20
            r24 = 20
            r15[r24] = r14
            java.lang.String[] r14 = new java.lang.String[r1]
            java.lang.String r24 = "\u0018"
            r14[r4] = r24
            r14[r6] = r20
            r24 = 21
            r15[r24] = r14
            java.lang.String[] r14 = new java.lang.String[r1]
            java.lang.String r24 = "\u0019"
            r14[r4] = r24
            r14[r6] = r20
            r24 = 22
            r15[r24] = r14
            java.lang.String[] r14 = new java.lang.String[r1]
            java.lang.String r24 = "\u001a"
            r14[r4] = r24
            r14[r6] = r20
            r24 = 23
            r15[r24] = r14
            java.lang.String[] r14 = new java.lang.String[r1]
            java.lang.String r24 = "\u001b"
            r14[r4] = r24
            r14[r6] = r20
            r24 = 24
            r15[r24] = r14
            java.lang.String[] r14 = new java.lang.String[r1]
            java.lang.String r24 = "\u001c"
            r14[r4] = r24
            r14[r6] = r20
            r24 = 25
            r15[r24] = r14
            java.lang.String[] r14 = new java.lang.String[r1]
            java.lang.String r24 = "\u001d"
            r14[r4] = r24
            r14[r6] = r20
            r24 = 26
            r15[r24] = r14
            java.lang.String[] r14 = new java.lang.String[r1]
            java.lang.String r24 = "\u001e"
            r14[r4] = r24
            r14[r6] = r20
            r24 = 27
            r15[r24] = r14
            java.lang.String[] r14 = new java.lang.String[r1]
            java.lang.String r24 = "\u001f"
            r14[r4] = r24
            r14[r6] = r20
            r24 = 28
            r15[r24] = r14
            java.lang.String[] r14 = new java.lang.String[r1]
            java.lang.String r24 = "\ufffe"
            r14[r4] = r24
            r14[r6] = r20
            r24 = 29
            r15[r24] = r14
            java.lang.String[] r14 = new java.lang.String[r1]
            java.lang.String r24 = "\uffff"
            r14[r4] = r24
            r14[r6] = r20
            r24 = 30
            r15[r24] = r14
            r12.<init>(r15)
            r11[r1] = r12
            r12 = 132(0x84, float:1.85E-43)
            org.apache.commons.lang3.text.translate.NumericEntityEscaper r12 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between(r10, r12)
            r11[r2] = r12
            r12 = 134(0x86, float:1.88E-43)
            r14 = 159(0x9f, float:2.23E-43)
            org.apache.commons.lang3.text.translate.NumericEntityEscaper r12 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between(r12, r14)
            r14 = 4
            r11[r14] = r12
            org.apache.commons.lang3.text.translate.UnicodeUnpairedSurrogateRemover r12 = new org.apache.commons.lang3.text.translate.UnicodeUnpairedSurrogateRemover
            r12.<init>()
            r11[r13] = r12
            r0.<init>(r11)
            org.apache.commons.lang3.StringEscapeUtils.ESCAPE_XML10 = r0
            org.apache.commons.lang3.text.translate.AggregateTranslator r0 = new org.apache.commons.lang3.text.translate.AggregateTranslator
            org.apache.commons.lang3.text.translate.CharSequenceTranslator[] r11 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[r3]
            org.apache.commons.lang3.text.translate.LookupTranslator r12 = new org.apache.commons.lang3.text.translate.LookupTranslator
            java.lang.String[][] r14 = org.apache.commons.lang3.text.translate.EntityArrays.BASIC_ESCAPE()
            r12.<init>(r14)
            r11[r4] = r12
            org.apache.commons.lang3.text.translate.LookupTranslator r12 = new org.apache.commons.lang3.text.translate.LookupTranslator
            java.lang.String[][] r14 = org.apache.commons.lang3.text.translate.EntityArrays.APOS_ESCAPE()
            r12.<init>(r14)
            r11[r6] = r12
            org.apache.commons.lang3.text.translate.LookupTranslator r12 = new org.apache.commons.lang3.text.translate.LookupTranslator
            java.lang.String[][] r14 = new java.lang.String[r13][]
            java.lang.String[] r15 = new java.lang.String[r1]
            r15[r4] = r19
            r15[r6] = r20
            r14[r4] = r15
            java.lang.String[] r15 = new java.lang.String[r1]
            java.lang.String r19 = "\u000b"
            r15[r4] = r19
            java.lang.String r19 = "&#11;"
            r15[r6] = r19
            r14[r6] = r15
            java.lang.String[] r15 = new java.lang.String[r1]
            java.lang.String r19 = "\f"
            r15[r4] = r19
            java.lang.String r19 = "&#12;"
            r15[r6] = r19
            r14[r1] = r15
            java.lang.String[] r15 = new java.lang.String[r1]
            java.lang.String r19 = "\ufffe"
            r15[r4] = r19
            r15[r6] = r20
            r14[r2] = r15
            java.lang.String[] r15 = new java.lang.String[r1]
            java.lang.String r19 = "\uffff"
            r15[r4] = r19
            r15[r6] = r20
            r19 = 4
            r14[r19] = r15
            r12.<init>(r14)
            r11[r1] = r12
            org.apache.commons.lang3.text.translate.NumericEntityEscaper r3 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between(r6, r3)
            r11[r2] = r3
            r3 = 14
            r12 = 31
            org.apache.commons.lang3.text.translate.NumericEntityEscaper r3 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between(r3, r12)
            r11[r19] = r3
            r3 = 132(0x84, float:1.85E-43)
            org.apache.commons.lang3.text.translate.NumericEntityEscaper r3 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between(r10, r3)
            r11[r13] = r3
            r3 = 134(0x86, float:1.88E-43)
            r10 = 159(0x9f, float:2.23E-43)
            org.apache.commons.lang3.text.translate.NumericEntityEscaper r3 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between(r3, r10)
            r10 = 6
            r11[r10] = r3
            org.apache.commons.lang3.text.translate.UnicodeUnpairedSurrogateRemover r3 = new org.apache.commons.lang3.text.translate.UnicodeUnpairedSurrogateRemover
            r3.<init>()
            r11[r22] = r3
            r0.<init>(r11)
            org.apache.commons.lang3.StringEscapeUtils.ESCAPE_XML11 = r0
            org.apache.commons.lang3.text.translate.AggregateTranslator r0 = new org.apache.commons.lang3.text.translate.AggregateTranslator
            org.apache.commons.lang3.text.translate.CharSequenceTranslator[] r3 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[r1]
            org.apache.commons.lang3.text.translate.LookupTranslator r10 = new org.apache.commons.lang3.text.translate.LookupTranslator
            java.lang.String[][] r11 = org.apache.commons.lang3.text.translate.EntityArrays.BASIC_ESCAPE()
            r10.<init>(r11)
            r3[r4] = r10
            org.apache.commons.lang3.text.translate.LookupTranslator r10 = new org.apache.commons.lang3.text.translate.LookupTranslator
            java.lang.String[][] r11 = org.apache.commons.lang3.text.translate.EntityArrays.ISO8859_1_ESCAPE()
            r10.<init>(r11)
            r3[r6] = r10
            r0.<init>(r3)
            org.apache.commons.lang3.StringEscapeUtils.ESCAPE_HTML3 = r0
            org.apache.commons.lang3.text.translate.AggregateTranslator r0 = new org.apache.commons.lang3.text.translate.AggregateTranslator
            org.apache.commons.lang3.text.translate.CharSequenceTranslator[] r3 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[r2]
            org.apache.commons.lang3.text.translate.LookupTranslator r10 = new org.apache.commons.lang3.text.translate.LookupTranslator
            java.lang.String[][] r11 = org.apache.commons.lang3.text.translate.EntityArrays.BASIC_ESCAPE()
            r10.<init>(r11)
            r3[r4] = r10
            org.apache.commons.lang3.text.translate.LookupTranslator r10 = new org.apache.commons.lang3.text.translate.LookupTranslator
            java.lang.String[][] r11 = org.apache.commons.lang3.text.translate.EntityArrays.ISO8859_1_ESCAPE()
            r10.<init>(r11)
            r3[r6] = r10
            org.apache.commons.lang3.text.translate.LookupTranslator r10 = new org.apache.commons.lang3.text.translate.LookupTranslator
            java.lang.String[][] r11 = org.apache.commons.lang3.text.translate.EntityArrays.HTML40_EXTENDED_ESCAPE()
            r10.<init>(r11)
            r3[r1] = r10
            r0.<init>(r3)
            org.apache.commons.lang3.StringEscapeUtils.ESCAPE_HTML4 = r0
            org.apache.commons.lang3.StringEscapeUtils$CsvEscaper r0 = new org.apache.commons.lang3.StringEscapeUtils$CsvEscaper
            r0.<init>()
            org.apache.commons.lang3.StringEscapeUtils.ESCAPE_CSV = r0
            org.apache.commons.lang3.text.translate.AggregateTranslator r0 = new org.apache.commons.lang3.text.translate.AggregateTranslator
            r3 = 4
            org.apache.commons.lang3.text.translate.CharSequenceTranslator[] r10 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[r3]
            org.apache.commons.lang3.text.translate.OctalUnescaper r3 = new org.apache.commons.lang3.text.translate.OctalUnescaper
            r3.<init>()
            r10[r4] = r3
            org.apache.commons.lang3.text.translate.UnicodeUnescaper r3 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper
            r3.<init>()
            r10[r6] = r3
            org.apache.commons.lang3.text.translate.LookupTranslator r3 = new org.apache.commons.lang3.text.translate.LookupTranslator
            java.lang.String[][] r11 = org.apache.commons.lang3.text.translate.EntityArrays.JAVA_CTRL_CHARS_UNESCAPE()
            r3.<init>(r11)
            r10[r1] = r3
            org.apache.commons.lang3.text.translate.LookupTranslator r3 = new org.apache.commons.lang3.text.translate.LookupTranslator
            r11 = 4
            java.lang.String[][] r12 = new java.lang.String[r11][]
            java.lang.String[] r11 = new java.lang.String[r1]
            r11[r4] = r9
            r11[r6] = r8
            r12[r4] = r11
            java.lang.String[] r9 = new java.lang.String[r1]
            r9[r4] = r7
            r9[r6] = r5
            r12[r6] = r9
            java.lang.String[] r5 = new java.lang.String[r1]
            r5[r4] = r17
            r5[r6] = r16
            r12[r1] = r5
            java.lang.String[] r5 = new java.lang.String[r1]
            r5[r4] = r8
            r5[r6] = r20
            r12[r2] = r5
            r3.<init>(r12)
            r10[r2] = r3
            r0.<init>(r10)
            org.apache.commons.lang3.StringEscapeUtils.UNESCAPE_JAVA = r0
            org.apache.commons.lang3.StringEscapeUtils.UNESCAPE_ECMASCRIPT = r0
            org.apache.commons.lang3.StringEscapeUtils.UNESCAPE_JSON = r0
            org.apache.commons.lang3.text.translate.AggregateTranslator r0 = new org.apache.commons.lang3.text.translate.AggregateTranslator
            org.apache.commons.lang3.text.translate.CharSequenceTranslator[] r3 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[r2]
            org.apache.commons.lang3.text.translate.LookupTranslator r5 = new org.apache.commons.lang3.text.translate.LookupTranslator
            java.lang.String[][] r7 = org.apache.commons.lang3.text.translate.EntityArrays.BASIC_UNESCAPE()
            r5.<init>(r7)
            r3[r4] = r5
            org.apache.commons.lang3.text.translate.LookupTranslator r5 = new org.apache.commons.lang3.text.translate.LookupTranslator
            java.lang.String[][] r7 = org.apache.commons.lang3.text.translate.EntityArrays.ISO8859_1_UNESCAPE()
            r5.<init>(r7)
            r3[r6] = r5
            org.apache.commons.lang3.text.translate.NumericEntityUnescaper r5 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper
            org.apache.commons.lang3.text.translate.NumericEntityUnescaper$OPTION[] r7 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[r4]
            r5.<init>(r7)
            r3[r1] = r5
            r0.<init>(r3)
            org.apache.commons.lang3.StringEscapeUtils.UNESCAPE_HTML3 = r0
            org.apache.commons.lang3.text.translate.AggregateTranslator r0 = new org.apache.commons.lang3.text.translate.AggregateTranslator
            r3 = 4
            org.apache.commons.lang3.text.translate.CharSequenceTranslator[] r3 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[r3]
            org.apache.commons.lang3.text.translate.LookupTranslator r5 = new org.apache.commons.lang3.text.translate.LookupTranslator
            java.lang.String[][] r7 = org.apache.commons.lang3.text.translate.EntityArrays.BASIC_UNESCAPE()
            r5.<init>(r7)
            r3[r4] = r5
            org.apache.commons.lang3.text.translate.LookupTranslator r5 = new org.apache.commons.lang3.text.translate.LookupTranslator
            java.lang.String[][] r7 = org.apache.commons.lang3.text.translate.EntityArrays.ISO8859_1_UNESCAPE()
            r5.<init>(r7)
            r3[r6] = r5
            org.apache.commons.lang3.text.translate.LookupTranslator r5 = new org.apache.commons.lang3.text.translate.LookupTranslator
            java.lang.String[][] r7 = org.apache.commons.lang3.text.translate.EntityArrays.HTML40_EXTENDED_UNESCAPE()
            r5.<init>(r7)
            r3[r1] = r5
            org.apache.commons.lang3.text.translate.NumericEntityUnescaper r5 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper
            org.apache.commons.lang3.text.translate.NumericEntityUnescaper$OPTION[] r7 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[r4]
            r5.<init>(r7)
            r3[r2] = r5
            r0.<init>(r3)
            org.apache.commons.lang3.StringEscapeUtils.UNESCAPE_HTML4 = r0
            org.apache.commons.lang3.text.translate.AggregateTranslator r0 = new org.apache.commons.lang3.text.translate.AggregateTranslator
            org.apache.commons.lang3.text.translate.CharSequenceTranslator[] r2 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[r2]
            org.apache.commons.lang3.text.translate.LookupTranslator r3 = new org.apache.commons.lang3.text.translate.LookupTranslator
            java.lang.String[][] r5 = org.apache.commons.lang3.text.translate.EntityArrays.BASIC_UNESCAPE()
            r3.<init>(r5)
            r2[r4] = r3
            org.apache.commons.lang3.text.translate.LookupTranslator r3 = new org.apache.commons.lang3.text.translate.LookupTranslator
            java.lang.String[][] r5 = org.apache.commons.lang3.text.translate.EntityArrays.APOS_UNESCAPE()
            r3.<init>(r5)
            r2[r6] = r3
            org.apache.commons.lang3.text.translate.NumericEntityUnescaper r3 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper
            org.apache.commons.lang3.text.translate.NumericEntityUnescaper$OPTION[] r4 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[r4]
            r3.<init>(r4)
            r2[r1] = r3
            r0.<init>(r2)
            org.apache.commons.lang3.StringEscapeUtils.UNESCAPE_XML = r0
            org.apache.commons.lang3.StringEscapeUtils$CsvUnescaper r0 = new org.apache.commons.lang3.StringEscapeUtils$CsvUnescaper
            r0.<init>()
            org.apache.commons.lang3.StringEscapeUtils.UNESCAPE_CSV = r0
            return
    }

    @java.lang.Deprecated
    public StringEscapeUtils() {
            r0 = this;
            r0.<init>()
            return
    }

    public static final java.lang.String escapeCsv(java.lang.String r1) {
            org.apache.commons.lang3.text.translate.CharSequenceTranslator r0 = org.apache.commons.lang3.StringEscapeUtils.ESCAPE_CSV
            java.lang.String r1 = r0.translate(r1)
            return r1
    }

    public static final java.lang.String escapeEcmaScript(java.lang.String r1) {
            org.apache.commons.lang3.text.translate.CharSequenceTranslator r0 = org.apache.commons.lang3.StringEscapeUtils.ESCAPE_ECMASCRIPT
            java.lang.String r1 = r0.translate(r1)
            return r1
    }

    public static final java.lang.String escapeHtml3(java.lang.String r1) {
            org.apache.commons.lang3.text.translate.CharSequenceTranslator r0 = org.apache.commons.lang3.StringEscapeUtils.ESCAPE_HTML3
            java.lang.String r1 = r0.translate(r1)
            return r1
    }

    public static final java.lang.String escapeHtml4(java.lang.String r1) {
            org.apache.commons.lang3.text.translate.CharSequenceTranslator r0 = org.apache.commons.lang3.StringEscapeUtils.ESCAPE_HTML4
            java.lang.String r1 = r0.translate(r1)
            return r1
    }

    public static final java.lang.String escapeJava(java.lang.String r1) {
            org.apache.commons.lang3.text.translate.CharSequenceTranslator r0 = org.apache.commons.lang3.StringEscapeUtils.ESCAPE_JAVA
            java.lang.String r1 = r0.translate(r1)
            return r1
    }

    public static final java.lang.String escapeJson(java.lang.String r1) {
            org.apache.commons.lang3.text.translate.CharSequenceTranslator r0 = org.apache.commons.lang3.StringEscapeUtils.ESCAPE_JSON
            java.lang.String r1 = r0.translate(r1)
            return r1
    }

    @java.lang.Deprecated
    public static final java.lang.String escapeXml(java.lang.String r1) {
            org.apache.commons.lang3.text.translate.CharSequenceTranslator r0 = org.apache.commons.lang3.StringEscapeUtils.ESCAPE_XML
            java.lang.String r1 = r0.translate(r1)
            return r1
    }

    public static java.lang.String escapeXml10(java.lang.String r1) {
            org.apache.commons.lang3.text.translate.CharSequenceTranslator r0 = org.apache.commons.lang3.StringEscapeUtils.ESCAPE_XML10
            java.lang.String r1 = r0.translate(r1)
            return r1
    }

    public static java.lang.String escapeXml11(java.lang.String r1) {
            org.apache.commons.lang3.text.translate.CharSequenceTranslator r0 = org.apache.commons.lang3.StringEscapeUtils.ESCAPE_XML11
            java.lang.String r1 = r0.translate(r1)
            return r1
    }

    public static final java.lang.String unescapeCsv(java.lang.String r1) {
            org.apache.commons.lang3.text.translate.CharSequenceTranslator r0 = org.apache.commons.lang3.StringEscapeUtils.UNESCAPE_CSV
            java.lang.String r1 = r0.translate(r1)
            return r1
    }

    public static final java.lang.String unescapeEcmaScript(java.lang.String r1) {
            org.apache.commons.lang3.text.translate.CharSequenceTranslator r0 = org.apache.commons.lang3.StringEscapeUtils.UNESCAPE_ECMASCRIPT
            java.lang.String r1 = r0.translate(r1)
            return r1
    }

    public static final java.lang.String unescapeHtml3(java.lang.String r1) {
            org.apache.commons.lang3.text.translate.CharSequenceTranslator r0 = org.apache.commons.lang3.StringEscapeUtils.UNESCAPE_HTML3
            java.lang.String r1 = r0.translate(r1)
            return r1
    }

    public static final java.lang.String unescapeHtml4(java.lang.String r1) {
            org.apache.commons.lang3.text.translate.CharSequenceTranslator r0 = org.apache.commons.lang3.StringEscapeUtils.UNESCAPE_HTML4
            java.lang.String r1 = r0.translate(r1)
            return r1
    }

    public static final java.lang.String unescapeJava(java.lang.String r1) {
            org.apache.commons.lang3.text.translate.CharSequenceTranslator r0 = org.apache.commons.lang3.StringEscapeUtils.UNESCAPE_JAVA
            java.lang.String r1 = r0.translate(r1)
            return r1
    }

    public static final java.lang.String unescapeJson(java.lang.String r1) {
            org.apache.commons.lang3.text.translate.CharSequenceTranslator r0 = org.apache.commons.lang3.StringEscapeUtils.UNESCAPE_JSON
            java.lang.String r1 = r0.translate(r1)
            return r1
    }

    public static final java.lang.String unescapeXml(java.lang.String r1) {
            org.apache.commons.lang3.text.translate.CharSequenceTranslator r0 = org.apache.commons.lang3.StringEscapeUtils.UNESCAPE_XML
            java.lang.String r1 = r0.translate(r1)
            return r1
    }
}
