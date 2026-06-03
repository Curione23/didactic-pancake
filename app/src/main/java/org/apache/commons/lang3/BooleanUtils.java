package org.apache.commons.lang3;

/* JADX INFO: loaded from: classes2.dex */
public class BooleanUtils {
    private static final java.util.List<java.lang.Boolean> BOOLEAN_LIST = null;
    public static final java.lang.String FALSE = "false";
    public static final java.lang.String NO = "no";
    public static final java.lang.String OFF = "off";
    public static final java.lang.String ON = "on";
    public static final java.lang.String TRUE = "true";
    public static final java.lang.String YES = "yes";

    static {
            r0 = 2
            java.lang.Boolean[] r0 = new java.lang.Boolean[r0]
            r1 = 0
            java.lang.Boolean r2 = java.lang.Boolean.FALSE
            r0[r1] = r2
            r1 = 1
            java.lang.Boolean r2 = java.lang.Boolean.TRUE
            r0[r1] = r2
            java.util.List r0 = java.util.Arrays.asList(r0)
            java.util.List r0 = java.util.Collections.unmodifiableList(r0)
            org.apache.commons.lang3.BooleanUtils.BOOLEAN_LIST = r0
            return
    }

    @java.lang.Deprecated
    public BooleanUtils() {
            r0 = this;
            r0.<init>()
            return
    }

    public static java.lang.Boolean and(java.lang.Boolean... r1) {
            java.lang.String r0 = "array"
            org.apache.commons.lang3.ObjectUtils.requireNonEmpty(r1, r0)
            boolean[] r1 = org.apache.commons.lang3.ArrayUtils.toPrimitive(r1)
            boolean r1 = and(r1)
            if (r1 == 0) goto L12
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            goto L14
        L12:
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
        L14:
            return r1
    }

    public static boolean and(boolean... r4) {
            java.lang.String r0 = "array"
            org.apache.commons.lang3.ObjectUtils.requireNonEmpty(r4, r0)
            int r0 = r4.length
            r1 = 0
            r2 = r1
        L8:
            if (r2 >= r0) goto L12
            boolean r3 = r4[r2]
            if (r3 != 0) goto Lf
            return r1
        Lf:
            int r2 = r2 + 1
            goto L8
        L12:
            r4 = 1
            return r4
    }

    public static java.lang.Boolean[] booleanValues() {
            r0 = 2
            java.lang.Boolean[] r0 = new java.lang.Boolean[r0]
            r1 = 0
            java.lang.Boolean r2 = java.lang.Boolean.FALSE
            r0[r1] = r2
            r1 = 1
            java.lang.Boolean r2 = java.lang.Boolean.TRUE
            r0[r1] = r2
            return r0
    }

    public static int compare(boolean r0, boolean r1) {
            if (r0 != r1) goto L4
            r0 = 0
            return r0
        L4:
            if (r0 == 0) goto L8
            r0 = 1
            goto L9
        L8:
            r0 = -1
        L9:
            return r0
    }

    public static void forEach(java.util.function.Consumer<java.lang.Boolean> r1) {
            java.util.List r0 = values()
            r0.forEach(r1)
            return
    }

    public static boolean isFalse(java.lang.Boolean r1) {
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            boolean r1 = r0.equals(r1)
            return r1
    }

    public static boolean isNotFalse(java.lang.Boolean r0) {
            boolean r0 = isFalse(r0)
            r0 = r0 ^ 1
            return r0
    }

    public static boolean isNotTrue(java.lang.Boolean r0) {
            boolean r0 = isTrue(r0)
            r0 = r0 ^ 1
            return r0
    }

    public static boolean isTrue(java.lang.Boolean r1) {
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            boolean r1 = r0.equals(r1)
            return r1
    }

    public static java.lang.Boolean negate(java.lang.Boolean r0) {
            if (r0 != 0) goto L4
            r0 = 0
            return r0
        L4:
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto Ld
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            goto Lf
        Ld:
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
        Lf:
            return r0
    }

    public static java.lang.Boolean oneHot(java.lang.Boolean... r0) {
            boolean[] r0 = org.apache.commons.lang3.ArrayUtils.toPrimitive(r0)
            boolean r0 = oneHot(r0)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            return r0
    }

    public static boolean oneHot(boolean... r5) {
            java.lang.String r0 = "array"
            org.apache.commons.lang3.ObjectUtils.requireNonEmpty(r5, r0)
            int r0 = r5.length
            r1 = 0
            r2 = r1
            r3 = r2
        L9:
            if (r2 >= r0) goto L16
            boolean r4 = r5[r2]
            if (r4 == 0) goto L13
            if (r3 == 0) goto L12
            return r1
        L12:
            r3 = 1
        L13:
            int r2 = r2 + 1
            goto L9
        L16:
            return r3
    }

    public static java.lang.Boolean or(java.lang.Boolean... r1) {
            java.lang.String r0 = "array"
            org.apache.commons.lang3.ObjectUtils.requireNonEmpty(r1, r0)
            boolean[] r1 = org.apache.commons.lang3.ArrayUtils.toPrimitive(r1)
            boolean r1 = or(r1)
            if (r1 == 0) goto L12
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            goto L14
        L12:
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
        L14:
            return r1
    }

    public static boolean or(boolean... r4) {
            java.lang.String r0 = "array"
            org.apache.commons.lang3.ObjectUtils.requireNonEmpty(r4, r0)
            int r0 = r4.length
            r1 = 0
            r2 = r1
        L8:
            if (r2 >= r0) goto L13
            boolean r3 = r4[r2]
            if (r3 == 0) goto L10
            r4 = 1
            return r4
        L10:
            int r2 = r2 + 1
            goto L8
        L13:
            return r1
    }

    public static boolean[] primitiveValues() {
            r0 = 2
            boolean[] r0 = new boolean[r0]
            r0 = {x0008: FILL_ARRAY_DATA , data: [0, 1} // fill-array
            return r0
    }

    public static boolean toBoolean(int r0) {
            if (r0 == 0) goto L4
            r0 = 1
            goto L5
        L4:
            r0 = 0
        L5:
            return r0
    }

    public static boolean toBoolean(int r0, int r1, int r2) {
            if (r0 != r1) goto L4
            r0 = 1
            return r0
        L4:
            if (r0 != r2) goto L8
            r0 = 0
            return r0
        L8:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "The Integer did not match either specified value"
            r0.<init>(r1)
            throw r0
    }

    public static boolean toBoolean(java.lang.Boolean r0) {
            if (r0 == 0) goto La
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto La
            r0 = 1
            goto Lb
        La:
            r0 = 0
        Lb:
            return r0
    }

    public static boolean toBoolean(java.lang.Integer r2, java.lang.Integer r3, java.lang.Integer r4) {
            r0 = 0
            r1 = 1
            if (r2 != 0) goto La
            if (r3 != 0) goto L7
            return r1
        L7:
            if (r4 != 0) goto L18
            return r0
        La:
            boolean r3 = r2.equals(r3)
            if (r3 == 0) goto L11
            return r1
        L11:
            boolean r2 = r2.equals(r4)
            if (r2 == 0) goto L18
            return r0
        L18:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r3 = "The Integer did not match either specified value"
            r2.<init>(r3)
            throw r2
    }

    public static boolean toBoolean(java.lang.String r1) {
            java.lang.Boolean r1 = toBooleanObject(r1)
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            if (r1 != r0) goto La
            r1 = 1
            goto Lb
        La:
            r1 = 0
        Lb:
            return r1
    }

    public static boolean toBoolean(java.lang.String r2, java.lang.String r3, java.lang.String r4) {
            r0 = 1
            if (r2 != r3) goto L4
            return r0
        L4:
            r1 = 0
            if (r2 != r4) goto L8
            return r1
        L8:
            if (r2 == 0) goto L18
            boolean r3 = r2.equals(r3)
            if (r3 == 0) goto L11
            return r0
        L11:
            boolean r2 = r2.equals(r4)
            if (r2 == 0) goto L18
            return r1
        L18:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r3 = "The String did not match either specified value"
            r2.<init>(r3)
            throw r2
    }

    public static boolean toBooleanDefaultIfNull(java.lang.Boolean r0, boolean r1) {
            if (r0 != 0) goto L3
            return r1
        L3:
            boolean r0 = r0.booleanValue()
            return r0
    }

    public static java.lang.Boolean toBooleanObject(int r0) {
            if (r0 != 0) goto L5
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            goto L7
        L5:
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
        L7:
            return r0
    }

    public static java.lang.Boolean toBooleanObject(int r0, int r1, int r2, int r3) {
            if (r0 != r1) goto L5
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            return r0
        L5:
            if (r0 != r2) goto La
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            return r0
        La:
            if (r0 != r3) goto Le
            r0 = 0
            return r0
        Le:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "The Integer did not match any specified value"
            r0.<init>(r1)
            throw r0
    }

    public static java.lang.Boolean toBooleanObject(java.lang.Integer r0) {
            if (r0 != 0) goto L4
            r0 = 0
            return r0
        L4:
            int r0 = r0.intValue()
            if (r0 != 0) goto Ld
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            goto Lf
        Ld:
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
        Lf:
            return r0
    }

    public static java.lang.Boolean toBooleanObject(java.lang.Integer r1, java.lang.Integer r2, java.lang.Integer r3, java.lang.Integer r4) {
            r0 = 0
            if (r1 != 0) goto L10
            if (r2 != 0) goto L8
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            return r1
        L8:
            if (r3 != 0) goto Ld
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            return r1
        Ld:
            if (r4 != 0) goto L29
            return r0
        L10:
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L19
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            return r1
        L19:
            boolean r2 = r1.equals(r3)
            if (r2 == 0) goto L22
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            return r1
        L22:
            boolean r1 = r1.equals(r4)
            if (r1 == 0) goto L29
            return r0
        L29:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "The Integer did not match any specified value"
            r1.<init>(r2)
            throw r1
    }

    public static java.lang.Boolean toBooleanObject(java.lang.String r16) {
            r0 = r16
            java.lang.String r1 = "true"
            if (r0 != r1) goto L9
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            return r0
        L9:
            r1 = 0
            if (r0 != 0) goto Ld
            return r1
        Ld:
            int r2 = r16.length()
            r3 = 84
            r4 = 89
            r5 = 116(0x74, float:1.63E-43)
            r6 = 121(0x79, float:1.7E-43)
            r7 = 78
            r8 = 110(0x6e, float:1.54E-43)
            r9 = 70
            r10 = 102(0x66, float:1.43E-43)
            r11 = 0
            r12 = 1
            if (r2 == r12) goto Lf2
            r15 = 2
            if (r2 == r15) goto Lcb
            r7 = 83
            r8 = 115(0x73, float:1.61E-43)
            r1 = 69
            r13 = 101(0x65, float:1.42E-43)
            r14 = 3
            if (r2 == r14) goto L9a
            r4 = 4
            if (r2 == r4) goto L6f
            r3 = 5
            if (r2 == r3) goto L3c
        L39:
            r0 = 0
            goto L110
        L3c:
            char r2 = r0.charAt(r11)
            char r3 = r0.charAt(r12)
            char r5 = r0.charAt(r15)
            char r6 = r0.charAt(r14)
            char r0 = r0.charAt(r4)
            if (r2 == r10) goto L54
            if (r2 != r9) goto L39
        L54:
            r2 = 97
            if (r3 == r2) goto L5c
            r2 = 65
            if (r3 != r2) goto L39
        L5c:
            r2 = 108(0x6c, float:1.51E-43)
            if (r5 == r2) goto L64
            r2 = 76
            if (r5 != r2) goto L39
        L64:
            if (r6 == r8) goto L68
            if (r6 != r7) goto L39
        L68:
            if (r0 == r13) goto L6c
            if (r0 != r1) goto L39
        L6c:
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            return r0
        L6f:
            char r2 = r0.charAt(r11)
            char r4 = r0.charAt(r12)
            char r6 = r0.charAt(r15)
            char r0 = r0.charAt(r14)
            if (r2 == r5) goto L83
            if (r2 != r3) goto L39
        L83:
            r2 = 114(0x72, float:1.6E-43)
            if (r4 == r2) goto L8b
            r2 = 82
            if (r4 != r2) goto L39
        L8b:
            r2 = 117(0x75, float:1.64E-43)
            if (r6 == r2) goto L93
            r2 = 85
            if (r6 != r2) goto L39
        L93:
            if (r0 == r13) goto L97
            if (r0 != r1) goto L39
        L97:
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            return r0
        L9a:
            char r2 = r0.charAt(r11)
            char r3 = r0.charAt(r12)
            char r0 = r0.charAt(r15)
            if (r2 == r6) goto Lae
            if (r2 != r4) goto Lab
            goto Lae
        Lab:
            r1 = 111(0x6f, float:1.56E-43)
            goto Lb7
        Lae:
            if (r3 == r13) goto Lb2
            if (r3 != r1) goto Lab
        Lb2:
            if (r0 == r8) goto Lc8
            if (r0 != r7) goto Lab
            goto Lc8
        Lb7:
            if (r2 == r1) goto Lbd
            r1 = 79
            if (r2 != r1) goto L39
        Lbd:
            if (r3 == r10) goto Lc1
            if (r3 != r9) goto L39
        Lc1:
            if (r0 == r10) goto Lc5
            if (r0 != r9) goto L39
        Lc5:
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            return r0
        Lc8:
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            return r0
        Lcb:
            char r1 = r0.charAt(r11)
            char r0 = r0.charAt(r12)
            r2 = 111(0x6f, float:1.56E-43)
            if (r1 == r2) goto Ldb
            r2 = 79
            if (r1 != r2) goto Le0
        Ldb:
            if (r0 == r8) goto Lef
            if (r0 != r7) goto Le0
            goto Lef
        Le0:
            if (r1 == r8) goto Le4
            if (r1 != r7) goto L39
        Le4:
            r1 = 111(0x6f, float:1.56E-43)
            if (r0 == r1) goto Lec
            r1 = 79
            if (r0 != r1) goto L39
        Lec:
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            return r0
        Lef:
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            return r0
        Lf2:
            char r0 = r0.charAt(r11)
            if (r0 == r6) goto L114
            if (r0 == r4) goto L114
            if (r0 == r5) goto L114
            if (r0 == r3) goto L114
            r1 = 49
            if (r0 != r1) goto L103
            goto L114
        L103:
            if (r0 == r8) goto L111
            if (r0 == r7) goto L111
            if (r0 == r10) goto L111
            if (r0 == r9) goto L111
            r1 = 48
            if (r0 != r1) goto L39
            goto L111
        L110:
            return r0
        L111:
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            return r0
        L114:
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            return r0
    }

    public static java.lang.Boolean toBooleanObject(java.lang.String r1, java.lang.String r2, java.lang.String r3, java.lang.String r4) {
            r0 = 0
            if (r1 != 0) goto L10
            if (r2 != 0) goto L8
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            return r1
        L8:
            if (r3 != 0) goto Ld
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            return r1
        Ld:
            if (r4 != 0) goto L29
            return r0
        L10:
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L19
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            return r1
        L19:
            boolean r2 = r1.equals(r3)
            if (r2 == 0) goto L22
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            return r1
        L22:
            boolean r1 = r1.equals(r4)
            if (r1 == 0) goto L29
            return r0
        L29:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "The String did not match any specified value"
            r1.<init>(r2)
            throw r1
    }

    public static int toInteger(java.lang.Boolean r0, int r1, int r2, int r3) {
            if (r0 != 0) goto L3
            return r3
        L3:
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto La
            goto Lb
        La:
            r1 = r2
        Lb:
            return r1
    }

    public static int toInteger(boolean r0) {
            return r0
    }

    public static int toInteger(boolean r0, int r1, int r2) {
            if (r0 == 0) goto L3
            goto L4
        L3:
            r1 = r2
        L4:
            return r1
    }

    public static java.lang.Integer toIntegerObject(java.lang.Boolean r0) {
            if (r0 != 0) goto L4
            r0 = 0
            return r0
        L4:
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto Ld
            java.lang.Integer r0 = org.apache.commons.lang3.math.NumberUtils.INTEGER_ONE
            goto Lf
        Ld:
            java.lang.Integer r0 = org.apache.commons.lang3.math.NumberUtils.INTEGER_ZERO
        Lf:
            return r0
    }

    public static java.lang.Integer toIntegerObject(java.lang.Boolean r0, java.lang.Integer r1, java.lang.Integer r2, java.lang.Integer r3) {
            if (r0 != 0) goto L3
            return r3
        L3:
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto La
            goto Lb
        La:
            r1 = r2
        Lb:
            return r1
    }

    public static java.lang.Integer toIntegerObject(boolean r0) {
            if (r0 == 0) goto L5
            java.lang.Integer r0 = org.apache.commons.lang3.math.NumberUtils.INTEGER_ONE
            goto L7
        L5:
            java.lang.Integer r0 = org.apache.commons.lang3.math.NumberUtils.INTEGER_ZERO
        L7:
            return r0
    }

    public static java.lang.Integer toIntegerObject(boolean r0, java.lang.Integer r1, java.lang.Integer r2) {
            if (r0 == 0) goto L3
            goto L4
        L3:
            r1 = r2
        L4:
            return r1
    }

    public static java.lang.String toString(java.lang.Boolean r0, java.lang.String r1, java.lang.String r2, java.lang.String r3) {
            if (r0 != 0) goto L3
            return r3
        L3:
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto La
            goto Lb
        La:
            r1 = r2
        Lb:
            return r1
    }

    public static java.lang.String toString(boolean r0, java.lang.String r1, java.lang.String r2) {
            if (r0 == 0) goto L3
            goto L4
        L3:
            r1 = r2
        L4:
            return r1
    }

    public static java.lang.String toStringOnOff(java.lang.Boolean r3) {
            java.lang.String r0 = "off"
            r1 = 0
            java.lang.String r2 = "on"
            java.lang.String r3 = toString(r3, r2, r0, r1)
            return r3
    }

    public static java.lang.String toStringOnOff(boolean r2) {
            java.lang.String r0 = "on"
            java.lang.String r1 = "off"
            java.lang.String r2 = toString(r2, r0, r1)
            return r2
    }

    public static java.lang.String toStringTrueFalse(java.lang.Boolean r3) {
            java.lang.String r0 = "false"
            r1 = 0
            java.lang.String r2 = "true"
            java.lang.String r3 = toString(r3, r2, r0, r1)
            return r3
    }

    public static java.lang.String toStringTrueFalse(boolean r2) {
            java.lang.String r0 = "true"
            java.lang.String r1 = "false"
            java.lang.String r2 = toString(r2, r0, r1)
            return r2
    }

    public static java.lang.String toStringYesNo(java.lang.Boolean r3) {
            java.lang.String r0 = "no"
            r1 = 0
            java.lang.String r2 = "yes"
            java.lang.String r3 = toString(r3, r2, r0, r1)
            return r3
    }

    public static java.lang.String toStringYesNo(boolean r2) {
            java.lang.String r0 = "yes"
            java.lang.String r1 = "no"
            java.lang.String r2 = toString(r2, r0, r1)
            return r2
    }

    public static java.util.List<java.lang.Boolean> values() {
            java.util.List<java.lang.Boolean> r0 = org.apache.commons.lang3.BooleanUtils.BOOLEAN_LIST
            return r0
    }

    public static java.lang.Boolean xor(java.lang.Boolean... r1) {
            java.lang.String r0 = "array"
            org.apache.commons.lang3.ObjectUtils.requireNonEmpty(r1, r0)
            boolean[] r1 = org.apache.commons.lang3.ArrayUtils.toPrimitive(r1)
            boolean r1 = xor(r1)
            if (r1 == 0) goto L12
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            goto L14
        L12:
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
        L14:
            return r1
    }

    public static boolean xor(boolean... r4) {
            java.lang.String r0 = "array"
            org.apache.commons.lang3.ObjectUtils.requireNonEmpty(r4, r0)
            int r0 = r4.length
            r1 = 0
            r2 = r1
        L8:
            if (r1 >= r0) goto L10
            boolean r3 = r4[r1]
            r2 = r2 ^ r3
            int r1 = r1 + 1
            goto L8
        L10:
            return r2
    }
}
