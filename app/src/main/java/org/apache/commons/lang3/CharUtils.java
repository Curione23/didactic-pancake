package org.apache.commons.lang3;

/* JADX INFO: loaded from: classes2.dex */
public class CharUtils {
    private static final java.lang.String[] CHAR_STRING_ARRAY = null;
    public static final char CR = '\r';
    private static final char[] HEX_DIGITS = null;
    public static final char LF = '\n';
    public static final char NUL = 0;

    static {
            r0 = 128(0x80, float:1.8E-43)
            java.lang.String[] r0 = new java.lang.String[r0]
            org.apache.commons.lang3.CharUtils.CHAR_STRING_ARRAY = r0
            r1 = 16
            char[] r1 = new char[r1]
            r1 = {x0018: FILL_ARRAY_DATA , data: [48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 97, 98, 99, 100, 101, 102} // fill-array
            org.apache.commons.lang3.CharUtils.HEX_DIGITS = r1
            org.apache.commons.lang3.CharUtils$$ExternalSyntheticLambda0 r1 = new org.apache.commons.lang3.CharUtils$$ExternalSyntheticLambda0
            r1.<init>()
            org.apache.commons.lang3.ArrayUtils.setAll(r0, r1)
            return
    }

    @java.lang.Deprecated
    public CharUtils() {
            r0 = this;
            r0.<init>()
            return
    }

    public static int compare(char r0, char r1) {
            int r0 = r0 - r1
            return r0
    }

    public static boolean isAscii(char r1) {
            r0 = 128(0x80, float:1.8E-43)
            if (r1 >= r0) goto L6
            r1 = 1
            goto L7
        L6:
            r1 = 0
        L7:
            return r1
    }

    public static boolean isAsciiAlpha(char r1) {
            boolean r0 = isAsciiAlphaUpper(r1)
            if (r0 != 0) goto Lf
            boolean r1 = isAsciiAlphaLower(r1)
            if (r1 == 0) goto Ld
            goto Lf
        Ld:
            r1 = 0
            goto L10
        Lf:
            r1 = 1
        L10:
            return r1
    }

    public static boolean isAsciiAlphaLower(char r1) {
            r0 = 97
            if (r1 < r0) goto La
            r0 = 122(0x7a, float:1.71E-43)
            if (r1 > r0) goto La
            r1 = 1
            goto Lb
        La:
            r1 = 0
        Lb:
            return r1
    }

    public static boolean isAsciiAlphaUpper(char r1) {
            r0 = 65
            if (r1 < r0) goto La
            r0 = 90
            if (r1 > r0) goto La
            r1 = 1
            goto Lb
        La:
            r1 = 0
        Lb:
            return r1
    }

    public static boolean isAsciiAlphanumeric(char r1) {
            boolean r0 = isAsciiAlpha(r1)
            if (r0 != 0) goto Lf
            boolean r1 = isAsciiNumeric(r1)
            if (r1 == 0) goto Ld
            goto Lf
        Ld:
            r1 = 0
            goto L10
        Lf:
            r1 = 1
        L10:
            return r1
    }

    public static boolean isAsciiControl(char r1) {
            r0 = 32
            if (r1 < r0) goto Lb
            r0 = 127(0x7f, float:1.78E-43)
            if (r1 != r0) goto L9
            goto Lb
        L9:
            r1 = 0
            goto Lc
        Lb:
            r1 = 1
        Lc:
            return r1
    }

    public static boolean isAsciiNumeric(char r1) {
            r0 = 48
            if (r1 < r0) goto La
            r0 = 57
            if (r1 > r0) goto La
            r1 = 1
            goto Lb
        La:
            r1 = 0
        Lb:
            return r1
    }

    public static boolean isAsciiPrintable(char r1) {
            r0 = 32
            if (r1 < r0) goto La
            r0 = 127(0x7f, float:1.78E-43)
            if (r1 >= r0) goto La
            r1 = 1
            goto Lb
        La:
            r1 = 0
        Lb:
            return r1
    }

    static /* synthetic */ java.lang.String lambda$static$0(int r0) {
            char r0 = (char) r0
            java.lang.String r0 = java.lang.String.valueOf(r0)
            return r0
    }

    public static char toChar(java.lang.Character r1) {
            java.lang.String r0 = "ch"
            java.lang.Object r1 = java.util.Objects.requireNonNull(r1, r0)
            java.lang.Character r1 = (java.lang.Character) r1
            char r1 = r1.charValue()
            return r1
    }

    public static char toChar(java.lang.Character r0, char r1) {
            if (r0 == 0) goto L6
            char r1 = r0.charValue()
        L6:
            return r1
    }

    public static char toChar(java.lang.String r3) {
            r0 = 0
            java.lang.Object[] r1 = new java.lang.Object[r0]
            java.lang.String r2 = "The String must not be empty"
            org.apache.commons.lang3.Validate.notEmpty(r3, r2, r1)
            char r3 = r3.charAt(r0)
            return r3
    }

    public static char toChar(java.lang.String r1, char r2) {
            boolean r0 = org.apache.commons.lang3.StringUtils.isEmpty(r1)
            if (r0 == 0) goto L7
            goto Lc
        L7:
            r2 = 0
            char r2 = r1.charAt(r2)
        Lc:
            return r2
    }

    @java.lang.Deprecated
    public static java.lang.Character toCharacterObject(char r0) {
            java.lang.Character r0 = java.lang.Character.valueOf(r0)
            return r0
    }

    public static java.lang.Character toCharacterObject(java.lang.String r1) {
            boolean r0 = org.apache.commons.lang3.StringUtils.isEmpty(r1)
            if (r0 == 0) goto L8
            r1 = 0
            goto L11
        L8:
            r0 = 0
            char r1 = r1.charAt(r0)
            java.lang.Character r1 = java.lang.Character.valueOf(r1)
        L11:
            return r1
    }

    public static int toIntValue(char r3) {
            boolean r0 = isAsciiNumeric(r3)
            if (r0 == 0) goto L9
            int r3 = r3 + (-48)
            return r3
        L9:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "The character "
            r1.<init>(r2)
            java.lang.StringBuilder r3 = r1.append(r3)
            java.lang.String r1 = " is not in the range '0' - '9'"
            java.lang.StringBuilder r3 = r3.append(r1)
            java.lang.String r3 = r3.toString()
            r0.<init>(r3)
            throw r0
    }

    public static int toIntValue(char r1, int r2) {
            boolean r0 = isAsciiNumeric(r1)
            if (r0 == 0) goto L8
            int r2 = r1 + (-48)
        L8:
            return r2
    }

    public static int toIntValue(java.lang.Character r0) {
            char r0 = toChar(r0)
            int r0 = toIntValue(r0)
            return r0
    }

    public static int toIntValue(java.lang.Character r0, int r1) {
            if (r0 == 0) goto La
            char r0 = r0.charValue()
            int r1 = toIntValue(r0, r1)
        La:
            return r1
    }

    public static java.lang.String toString(char r2) {
            java.lang.String[] r0 = org.apache.commons.lang3.CharUtils.CHAR_STRING_ARRAY
            int r1 = r0.length
            if (r2 >= r1) goto L8
            r2 = r0[r2]
            return r2
        L8:
            java.lang.String r2 = java.lang.String.valueOf(r2)
            return r2
    }

    public static java.lang.String toString(java.lang.Character r0) {
            if (r0 == 0) goto Lb
            char r0 = r0.charValue()
            java.lang.String r0 = toString(r0)
            goto Lc
        Lb:
            r0 = 0
        Lc:
            return r0
    }

    public static java.lang.String unicodeEscaped(char r3) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "\\u"
            r0.<init>(r1)
            char[] r1 = org.apache.commons.lang3.CharUtils.HEX_DIGITS
            int r2 = r3 >> 12
            r2 = r2 & 15
            char r2 = r1[r2]
            java.lang.StringBuilder r0 = r0.append(r2)
            int r2 = r3 >> 8
            r2 = r2 & 15
            char r2 = r1[r2]
            java.lang.StringBuilder r0 = r0.append(r2)
            int r2 = r3 >> 4
            r2 = r2 & 15
            char r2 = r1[r2]
            java.lang.StringBuilder r0 = r0.append(r2)
            r3 = r3 & 15
            char r3 = r1[r3]
            java.lang.StringBuilder r3 = r0.append(r3)
            java.lang.String r3 = r3.toString()
            return r3
    }

    public static java.lang.String unicodeEscaped(java.lang.Character r0) {
            if (r0 == 0) goto Lb
            char r0 = r0.charValue()
            java.lang.String r0 = unicodeEscaped(r0)
            goto Lc
        Lb:
            r0 = 0
        Lc:
            return r0
    }
}
