package org.apache.commons.lang3.text;

/* JADX INFO: loaded from: classes2.dex */
@java.lang.Deprecated
public class WordUtils {
    public WordUtils() {
            r0 = this;
            r0.<init>()
            return
    }

    public static java.lang.String capitalize(java.lang.String r1) {
            r0 = 0
            java.lang.String r1 = capitalize(r1, r0)
            return r1
    }

    public static java.lang.String capitalize(java.lang.String r6, char... r7) {
            if (r7 != 0) goto L4
            r0 = -1
            goto L5
        L4:
            int r0 = r7.length
        L5:
            boolean r1 = org.apache.commons.lang3.StringUtils.isEmpty(r6)
            if (r1 != 0) goto L35
            if (r0 != 0) goto Le
            goto L35
        Le:
            char[] r6 = r6.toCharArray()
            r0 = 0
            r1 = 1
            r2 = r0
            r3 = r1
        L16:
            int r4 = r6.length
            if (r2 >= r4) goto L2f
            char r4 = r6[r2]
            boolean r5 = isDelimiter(r4, r7)
            if (r5 == 0) goto L23
            r3 = r1
            goto L2c
        L23:
            if (r3 == 0) goto L2c
            char r3 = java.lang.Character.toTitleCase(r4)
            r6[r2] = r3
            r3 = r0
        L2c:
            int r2 = r2 + 1
            goto L16
        L2f:
            java.lang.String r7 = new java.lang.String
            r7.<init>(r6)
            return r7
        L35:
            return r6
    }

    public static java.lang.String capitalizeFully(java.lang.String r1) {
            r0 = 0
            java.lang.String r1 = capitalizeFully(r1, r0)
            return r1
    }

    public static java.lang.String capitalizeFully(java.lang.String r2, char... r3) {
            if (r3 != 0) goto L4
            r0 = -1
            goto L5
        L4:
            int r0 = r3.length
        L5:
            boolean r1 = org.apache.commons.lang3.StringUtils.isEmpty(r2)
            if (r1 != 0) goto L16
            if (r0 != 0) goto Le
            goto L16
        Le:
            java.lang.String r2 = r2.toLowerCase()
            java.lang.String r2 = capitalize(r2, r3)
        L16:
            return r2
    }

    public static boolean containsAllWords(java.lang.CharSequence r6, java.lang.CharSequence... r7) {
            boolean r0 = org.apache.commons.lang3.StringUtils.isEmpty(r6)
            r1 = 0
            if (r0 != 0) goto L44
            boolean r0 = org.apache.commons.lang3.ArrayUtils.isEmpty(r7)
            if (r0 == 0) goto Le
            goto L44
        Le:
            int r0 = r7.length
            r2 = r1
        L10:
            if (r2 >= r0) goto L42
            r3 = r7[r2]
            boolean r4 = org.apache.commons.lang3.StringUtils.isBlank(r3)
            if (r4 == 0) goto L1b
            return r1
        L1b:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = ".*\\b"
            r4.<init>(r5)
            java.lang.StringBuilder r3 = r4.append(r3)
            java.lang.String r4 = "\\b.*"
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.String r3 = r3.toString()
            java.util.regex.Pattern r3 = java.util.regex.Pattern.compile(r3)
            java.util.regex.Matcher r3 = r3.matcher(r6)
            boolean r3 = r3.matches()
            if (r3 != 0) goto L3f
            return r1
        L3f:
            int r2 = r2 + 1
            goto L10
        L42:
            r6 = 1
            return r6
        L44:
            return r1
    }

    public static java.lang.String initials(java.lang.String r1) {
            r0 = 0
            java.lang.String r1 = initials(r1, r0)
            return r1
    }

    public static java.lang.String initials(java.lang.String r9, char... r10) {
            boolean r0 = org.apache.commons.lang3.StringUtils.isEmpty(r9)
            if (r0 == 0) goto L7
            return r9
        L7:
            if (r10 == 0) goto Lf
            int r0 = r10.length
            if (r0 != 0) goto Lf
            java.lang.String r9 = ""
            return r9
        Lf:
            int r0 = r9.length()
            int r1 = r0 / 2
            r2 = 1
            int r1 = r1 + r2
            char[] r1 = new char[r1]
            r3 = 0
            r6 = r2
            r4 = r3
            r5 = r4
        L1d:
            if (r4 >= r0) goto L36
            char r7 = r9.charAt(r4)
            boolean r8 = isDelimiter(r7, r10)
            if (r8 == 0) goto L2b
            r6 = r2
            goto L33
        L2b:
            if (r6 == 0) goto L33
            int r6 = r5 + 1
            r1[r5] = r7
            r5 = r6
            r6 = r3
        L33:
            int r4 = r4 + 1
            goto L1d
        L36:
            java.lang.String r9 = new java.lang.String
            r9.<init>(r1, r3, r5)
            return r9
    }

    private static boolean isDelimiter(char r0, char[] r1) {
            if (r1 != 0) goto L7
            boolean r0 = java.lang.Character.isWhitespace(r0)
            goto Lb
        L7:
            boolean r0 = org.apache.commons.lang3.ArrayUtils.contains(r1, r0)
        Lb:
            return r0
    }

    public static java.lang.String swapCase(java.lang.String r5) {
            boolean r0 = org.apache.commons.lang3.StringUtils.isEmpty(r5)
            if (r0 == 0) goto L7
            return r5
        L7:
            char[] r5 = r5.toCharArray()
            r0 = 1
            r1 = 0
            r2 = r1
        Le:
            int r3 = r5.length
            if (r2 >= r3) goto L45
            char r3 = r5[r2]
            boolean r4 = java.lang.Character.isUpperCase(r3)
            if (r4 != 0) goto L3b
            boolean r4 = java.lang.Character.isTitleCase(r3)
            if (r4 == 0) goto L20
            goto L3b
        L20:
            boolean r4 = java.lang.Character.isLowerCase(r3)
            if (r4 == 0) goto L36
            if (r0 == 0) goto L2f
            char r0 = java.lang.Character.toTitleCase(r3)
            r5[r2] = r0
            goto L41
        L2f:
            char r3 = java.lang.Character.toUpperCase(r3)
            r5[r2] = r3
            goto L42
        L36:
            boolean r0 = java.lang.Character.isWhitespace(r3)
            goto L42
        L3b:
            char r0 = java.lang.Character.toLowerCase(r3)
            r5[r2] = r0
        L41:
            r0 = r1
        L42:
            int r2 = r2 + 1
            goto Le
        L45:
            java.lang.String r0 = new java.lang.String
            r0.<init>(r5)
            return r0
    }

    public static java.lang.String uncapitalize(java.lang.String r1) {
            r0 = 0
            java.lang.String r1 = uncapitalize(r1, r0)
            return r1
    }

    public static java.lang.String uncapitalize(java.lang.String r6, char... r7) {
            if (r7 != 0) goto L4
            r0 = -1
            goto L5
        L4:
            int r0 = r7.length
        L5:
            boolean r1 = org.apache.commons.lang3.StringUtils.isEmpty(r6)
            if (r1 != 0) goto L35
            if (r0 != 0) goto Le
            goto L35
        Le:
            char[] r6 = r6.toCharArray()
            r0 = 0
            r1 = 1
            r2 = r0
            r3 = r1
        L16:
            int r4 = r6.length
            if (r2 >= r4) goto L2f
            char r4 = r6[r2]
            boolean r5 = isDelimiter(r4, r7)
            if (r5 == 0) goto L23
            r3 = r1
            goto L2c
        L23:
            if (r3 == 0) goto L2c
            char r3 = java.lang.Character.toLowerCase(r4)
            r6[r2] = r3
            r3 = r0
        L2c:
            int r2 = r2 + 1
            goto L16
        L2f:
            java.lang.String r7 = new java.lang.String
            r7.<init>(r6)
            return r7
        L35:
            return r6
    }

    public static java.lang.String wrap(java.lang.String r2, int r3) {
            r0 = 0
            r1 = 0
            java.lang.String r2 = wrap(r2, r3, r0, r1)
            return r2
    }

    public static java.lang.String wrap(java.lang.String r1, int r2, java.lang.String r3, boolean r4) {
            java.lang.String r0 = " "
            java.lang.String r1 = wrap(r1, r2, r3, r4, r0)
            return r1
    }

    public static java.lang.String wrap(java.lang.String r8, int r9, java.lang.String r10, boolean r11, java.lang.String r12) {
            if (r8 != 0) goto L4
            r8 = 0
            return r8
        L4:
            if (r10 != 0) goto La
            java.lang.String r10 = java.lang.System.lineSeparator()
        La:
            r0 = 1
            if (r9 >= r0) goto Le
            r9 = r0
        Le:
            boolean r0 = org.apache.commons.lang3.StringUtils.isBlank(r12)
            if (r0 == 0) goto L16
            java.lang.String r12 = " "
        L16:
            java.util.regex.Pattern r12 = java.util.regex.Pattern.compile(r12)
            int r0 = r8.length()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            int r2 = r0 + 32
            r1.<init>(r2)
            r2 = 0
        L26:
            if (r2 >= r0) goto Laa
            int r3 = r2 + r9
            long r4 = (long) r3
            r6 = 1
            long r4 = r4 + r6
            r6 = 2147483647(0x7fffffff, double:1.060997895E-314)
            long r4 = java.lang.Math.min(r6, r4)
            int r4 = (int) r4
            int r4 = java.lang.Math.min(r4, r0)
            java.lang.String r4 = r8.substring(r2, r4)
            java.util.regex.Matcher r4 = r12.matcher(r4)
            boolean r5 = r4.find()
            if (r5 == 0) goto L5a
            int r5 = r4.start()
            if (r5 != 0) goto L54
            int r3 = r4.end()
            int r2 = r2 + r3
            goto L26
        L54:
            int r5 = r4.start()
            int r5 = r5 + r2
            goto L5b
        L5a:
            r5 = -1
        L5b:
            int r6 = r0 - r2
            if (r6 > r9) goto L60
            goto Laa
        L60:
            boolean r6 = r4.find()
            if (r6 == 0) goto L6c
            int r5 = r4.start()
            int r5 = r5 + r2
            goto L60
        L6c:
            if (r5 < r2) goto L78
            r1.append(r8, r2, r5)
            r1.append(r10)
        L74:
            int r5 = r5 + 1
            r2 = r5
            goto L26
        L78:
            if (r11 == 0) goto L82
            r1.append(r8, r2, r3)
            r1.append(r10)
            r2 = r3
            goto L26
        L82:
            java.lang.String r3 = r8.substring(r3)
            java.util.regex.Matcher r3 = r12.matcher(r3)
            boolean r4 = r3.find()
            if (r4 == 0) goto L97
            int r3 = r3.start()
            int r3 = r3 + r2
            int r5 = r3 + r9
        L97:
            if (r5 < 0) goto La0
            r1.append(r8, r2, r5)
            r1.append(r10)
            goto L74
        La0:
            int r3 = r8.length()
            r1.append(r8, r2, r3)
            r2 = r0
            goto L26
        Laa:
            int r9 = r8.length()
            r1.append(r8, r2, r9)
            java.lang.String r8 = r1.toString()
            return r8
    }
}
