package org.apache.commons.lang3;

/* JADX INFO: loaded from: classes2.dex */
public class CharSequenceUtils {
    private static final int NOT_FOUND = -1;
    static final int TO_STRING_LIMIT = 16;

    @java.lang.Deprecated
    public CharSequenceUtils() {
            r0 = this;
            r0.<init>()
            return
    }

    private static boolean checkLaterThan1(java.lang.CharSequence r4, java.lang.CharSequence r5, int r6, int r7) {
            r0 = 1
            int r6 = r6 - r0
            r1 = r0
        L3:
            if (r1 > r6) goto L25
            int r2 = r7 + r1
            char r2 = r4.charAt(r2)
            char r3 = r5.charAt(r1)
            if (r2 != r3) goto L23
            int r2 = r7 + r6
            char r2 = r4.charAt(r2)
            char r3 = r5.charAt(r6)
            if (r2 == r3) goto L1e
            goto L23
        L1e:
            int r1 = r1 + 1
            int r6 = r6 + (-1)
            goto L3
        L23:
            r4 = 0
            return r4
        L25:
            return r0
    }

    static int indexOf(java.lang.CharSequence r8, int r9, int r10) {
            boolean r0 = r8 instanceof java.lang.String
            if (r0 == 0) goto Lb
            java.lang.String r8 = (java.lang.String) r8
            int r8 = r8.indexOf(r9, r10)
            return r8
        Lb:
            int r0 = r8.length()
            r1 = 0
            if (r10 >= 0) goto L13
            r10 = r1
        L13:
            r2 = 65536(0x10000, float:9.1835E-41)
            r3 = -1
            if (r9 >= r2) goto L25
        L18:
            if (r10 >= r0) goto L24
            char r1 = r8.charAt(r10)
            if (r1 != r9) goto L21
            return r10
        L21:
            int r10 = r10 + 1
            goto L18
        L24:
            return r3
        L25:
            r2 = 1114111(0x10ffff, float:1.561202E-39)
            if (r9 > r2) goto L48
            char[] r9 = java.lang.Character.toChars(r9)
        L2e:
            r2 = 1
            int r4 = r0 + (-1)
            if (r10 >= r4) goto L48
            char r4 = r8.charAt(r10)
            int r5 = r10 + 1
            char r6 = r8.charAt(r5)
            char r7 = r9[r1]
            if (r4 != r7) goto L46
            char r2 = r9[r2]
            if (r6 != r2) goto L46
            return r10
        L46:
            r10 = r5
            goto L2e
        L48:
            return r3
    }

    static int indexOf(java.lang.CharSequence r1, java.lang.CharSequence r2, int r3) {
            boolean r0 = r1 instanceof java.lang.String
            if (r0 == 0) goto Lf
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r2 = r2.toString()
            int r1 = r1.indexOf(r2, r3)
            return r1
        Lf:
            boolean r0 = r1 instanceof java.lang.StringBuilder
            if (r0 == 0) goto L1e
            java.lang.StringBuilder r1 = (java.lang.StringBuilder) r1
            java.lang.String r2 = r2.toString()
            int r1 = r1.indexOf(r2, r3)
            return r1
        L1e:
            boolean r0 = r1 instanceof java.lang.StringBuffer
            if (r0 == 0) goto L2d
            java.lang.StringBuffer r1 = (java.lang.StringBuffer) r1
            java.lang.String r2 = r2.toString()
            int r1 = r1.indexOf(r2, r3)
            return r1
        L2d:
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = r2.toString()
            int r1 = r1.indexOf(r2, r3)
            return r1
    }

    static int lastIndexOf(java.lang.CharSequence r5, int r6, int r7) {
            boolean r0 = r5 instanceof java.lang.String
            if (r0 == 0) goto Lb
            java.lang.String r5 = (java.lang.String) r5
            int r5 = r5.lastIndexOf(r6, r7)
            return r5
        Lb:
            int r0 = r5.length()
            r1 = -1
            if (r7 >= 0) goto L13
            return r1
        L13:
            if (r7 < r0) goto L17
            int r7 = r0 + (-1)
        L17:
            r2 = 65536(0x10000, float:9.1835E-41)
            if (r6 >= r2) goto L28
        L1b:
            if (r7 < 0) goto L27
            char r0 = r5.charAt(r7)
            if (r0 != r6) goto L24
            return r7
        L24:
            int r7 = r7 + (-1)
            goto L1b
        L27:
            return r1
        L28:
            r2 = 1114111(0x10ffff, float:1.561202E-39)
            if (r6 > r2) goto L4f
            char[] r6 = java.lang.Character.toChars(r6)
            r2 = 1
            int r0 = r0 - r2
            if (r7 != r0) goto L36
            return r1
        L36:
            if (r7 < 0) goto L4f
            char r0 = r5.charAt(r7)
            int r3 = r7 + 1
            char r3 = r5.charAt(r3)
            r4 = 0
            char r4 = r6[r4]
            if (r4 != r0) goto L4c
            char r0 = r6[r2]
            if (r0 != r3) goto L4c
            return r7
        L4c:
            int r7 = r7 + (-1)
            goto L36
        L4f:
            return r1
    }

    static int lastIndexOf(java.lang.CharSequence r4, java.lang.CharSequence r5, int r6) {
            r0 = -1
            if (r5 == 0) goto L97
            if (r4 != 0) goto L7
            goto L97
        L7:
            boolean r1 = r5 instanceof java.lang.String
            if (r1 == 0) goto L32
            boolean r1 = r4 instanceof java.lang.String
            if (r1 == 0) goto L18
            java.lang.String r4 = (java.lang.String) r4
            java.lang.String r5 = (java.lang.String) r5
            int r4 = r4.lastIndexOf(r5, r6)
            return r4
        L18:
            boolean r1 = r4 instanceof java.lang.StringBuilder
            if (r1 == 0) goto L25
            java.lang.StringBuilder r4 = (java.lang.StringBuilder) r4
            java.lang.String r5 = (java.lang.String) r5
            int r4 = r4.lastIndexOf(r5, r6)
            return r4
        L25:
            boolean r1 = r4 instanceof java.lang.StringBuffer
            if (r1 == 0) goto L32
            java.lang.StringBuffer r4 = (java.lang.StringBuffer) r4
            java.lang.String r5 = (java.lang.String) r5
            int r4 = r4.lastIndexOf(r5, r6)
            return r4
        L32:
            int r1 = r4.length()
            int r2 = r5.length()
            if (r6 <= r1) goto L3d
            r6 = r1
        L3d:
            if (r6 < 0) goto L97
            if (r2 <= r1) goto L42
            goto L97
        L42:
            if (r2 != 0) goto L45
            return r6
        L45:
            r3 = 16
            if (r2 > r3) goto L76
            boolean r3 = r4 instanceof java.lang.String
            if (r3 == 0) goto L58
            java.lang.String r4 = (java.lang.String) r4
            java.lang.String r5 = r5.toString()
            int r4 = r4.lastIndexOf(r5, r6)
            return r4
        L58:
            boolean r3 = r4 instanceof java.lang.StringBuilder
            if (r3 == 0) goto L67
            java.lang.StringBuilder r4 = (java.lang.StringBuilder) r4
            java.lang.String r5 = r5.toString()
            int r4 = r4.lastIndexOf(r5, r6)
            return r4
        L67:
            boolean r3 = r4 instanceof java.lang.StringBuffer
            if (r3 == 0) goto L76
            java.lang.StringBuffer r4 = (java.lang.StringBuffer) r4
            java.lang.String r5 = r5.toString()
            int r4 = r4.lastIndexOf(r5, r6)
            return r4
        L76:
            int r3 = r6 + r2
            if (r3 <= r1) goto L7c
            int r6 = r1 - r2
        L7c:
            r1 = 0
            char r1 = r5.charAt(r1)
        L81:
            char r3 = r4.charAt(r6)
            if (r3 == r1) goto L8c
            int r6 = r6 + (-1)
            if (r6 >= 0) goto L81
            return r0
        L8c:
            boolean r3 = checkLaterThan1(r4, r5, r2, r6)
            if (r3 == 0) goto L93
            return r6
        L93:
            int r6 = r6 + (-1)
            if (r6 >= 0) goto L81
        L97:
            return r0
    }

    static boolean regionMatches(java.lang.CharSequence r7, boolean r8, int r9, java.lang.CharSequence r10, int r11, int r12) {
            boolean r0 = r7 instanceof java.lang.String
            if (r0 == 0) goto L17
            boolean r0 = r10 instanceof java.lang.String
            if (r0 == 0) goto L17
            r1 = r7
            java.lang.String r1 = (java.lang.String) r1
            r4 = r10
            java.lang.String r4 = (java.lang.String) r4
            r2 = r8
            r3 = r9
            r5 = r11
            r6 = r12
            boolean r7 = r1.regionMatches(r2, r3, r4, r5, r6)
            return r7
        L17:
            int r0 = r7.length()
            int r0 = r0 - r9
            int r1 = r10.length()
            int r1 = r1 - r11
            r2 = 0
            if (r9 < 0) goto L5f
            if (r11 < 0) goto L5f
            if (r12 >= 0) goto L29
            goto L5f
        L29:
            if (r0 < r12) goto L5f
            if (r1 >= r12) goto L2e
            goto L5f
        L2e:
            int r0 = r12 + (-1)
            if (r12 <= 0) goto L5d
            int r12 = r9 + 1
            char r9 = r7.charAt(r9)
            int r1 = r11 + 1
            char r11 = r10.charAt(r11)
            if (r9 != r11) goto L41
            goto L59
        L41:
            if (r8 != 0) goto L44
            return r2
        L44:
            char r9 = java.lang.Character.toUpperCase(r9)
            char r11 = java.lang.Character.toUpperCase(r11)
            if (r9 == r11) goto L59
            char r9 = java.lang.Character.toLowerCase(r9)
            char r11 = java.lang.Character.toLowerCase(r11)
            if (r9 == r11) goto L59
            return r2
        L59:
            r9 = r12
            r12 = r0
            r11 = r1
            goto L2e
        L5d:
            r7 = 1
            return r7
        L5f:
            return r2
    }

    public static java.lang.CharSequence subSequence(java.lang.CharSequence r1, int r2) {
            if (r1 != 0) goto L4
            r1 = 0
            goto Lc
        L4:
            int r0 = r1.length()
            java.lang.CharSequence r1 = r1.subSequence(r2, r0)
        Lc:
            return r1
    }

    public static char[] toCharArray(java.lang.CharSequence r4) {
            int r0 = org.apache.commons.lang3.StringUtils.length(r4)
            if (r0 != 0) goto L9
            char[] r4 = org.apache.commons.lang3.ArrayUtils.EMPTY_CHAR_ARRAY
            return r4
        L9:
            boolean r1 = r4 instanceof java.lang.String
            if (r1 == 0) goto L14
            java.lang.String r4 = (java.lang.String) r4
            char[] r4 = r4.toCharArray()
            return r4
        L14:
            char[] r1 = new char[r0]
            r2 = 0
        L17:
            if (r2 >= r0) goto L22
            char r3 = r4.charAt(r2)
            r1[r2] = r3
            int r2 = r2 + 1
            goto L17
        L22:
            return r1
    }
}
