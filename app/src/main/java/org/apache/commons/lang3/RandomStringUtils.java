package org.apache.commons.lang3;

/* JADX INFO: loaded from: classes2.dex */
public class RandomStringUtils {
    private static final char[] ALPHANUMERICAL_CHARS = null;
    private static org.apache.commons.lang3.RandomStringUtils INSECURE;
    private static org.apache.commons.lang3.RandomStringUtils SECURE;
    private static final java.util.function.Supplier<org.apache.commons.lang3.RandomUtils> SECURE_SUPPLIER = null;
    private final java.util.function.Supplier<org.apache.commons.lang3.RandomUtils> random;

    static {
            org.apache.commons.lang3.RandomStringUtils$$ExternalSyntheticLambda0 r0 = new org.apache.commons.lang3.RandomStringUtils$$ExternalSyntheticLambda0
            r0.<init>()
            org.apache.commons.lang3.RandomStringUtils.SECURE_SUPPLIER = r0
            org.apache.commons.lang3.RandomStringUtils r1 = new org.apache.commons.lang3.RandomStringUtils
            org.apache.commons.lang3.RandomStringUtils$$ExternalSyntheticLambda1 r2 = new org.apache.commons.lang3.RandomStringUtils$$ExternalSyntheticLambda1
            r2.<init>()
            r1.<init>(r2)
            org.apache.commons.lang3.RandomStringUtils.INSECURE = r1
            org.apache.commons.lang3.RandomStringUtils r1 = new org.apache.commons.lang3.RandomStringUtils
            r1.<init>(r0)
            org.apache.commons.lang3.RandomStringUtils.SECURE = r1
            r0 = 62
            char[] r0 = new char[r0]
            r0 = {x0024: FILL_ARRAY_DATA , data: [97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57} // fill-array
            org.apache.commons.lang3.RandomStringUtils.ALPHANUMERICAL_CHARS = r0
            return
    }

    @java.lang.Deprecated
    public RandomStringUtils() {
            r1 = this;
            java.util.function.Supplier<org.apache.commons.lang3.RandomUtils> r0 = org.apache.commons.lang3.RandomStringUtils.SECURE_SUPPLIER
            r1.<init>(r0)
            return
    }

    private RandomStringUtils(java.util.function.Supplier<org.apache.commons.lang3.RandomUtils> r1) {
            r0 = this;
            r0.<init>()
            r0.random = r1
            return
    }

    public static org.apache.commons.lang3.RandomStringUtils insecure() {
            org.apache.commons.lang3.RandomStringUtils r0 = org.apache.commons.lang3.RandomStringUtils.INSECURE
            return r0
    }

    public static java.lang.String random(int r1) {
            org.apache.commons.lang3.RandomStringUtils r0 = secure()
            java.lang.String r1 = r0.next(r1)
            return r1
    }

    public static java.lang.String random(int r6, int r7, int r8, boolean r9, boolean r10) {
            org.apache.commons.lang3.RandomStringUtils r0 = secure()
            r1 = r6
            r2 = r7
            r3 = r8
            r4 = r9
            r5 = r10
            java.lang.String r6 = r0.next(r1, r2, r3, r4, r5)
            return r6
    }

    public static java.lang.String random(int r7, int r8, int r9, boolean r10, boolean r11, char... r12) {
            org.apache.commons.lang3.RandomStringUtils r0 = secure()
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            r5 = r11
            r6 = r12
            java.lang.String r7 = r0.next(r1, r2, r3, r4, r5, r6)
            return r7
    }

    public static java.lang.String random(int r11, int r12, int r13, boolean r14, boolean r15, char[] r16, java.util.Random r17) {
            r0 = r11
            r1 = r12
            r2 = r13
            r3 = r16
            if (r0 != 0) goto La
            java.lang.String r0 = ""
            return r0
        La:
            if (r0 < 0) goto L137
            if (r3 == 0) goto L1a
            int r4 = r3.length
            if (r4 == 0) goto L12
            goto L1a
        L12:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "The chars array must not be empty"
            r0.<init>(r1)
            throw r0
        L1a:
            r4 = 32
            java.lang.String r5 = "Parameter end ("
            r6 = 1114111(0x10ffff, float:1.561202E-39)
            r7 = 123(0x7b, float:1.72E-43)
            if (r1 != 0) goto L34
            if (r2 != 0) goto L34
            if (r3 == 0) goto L2b
            int r2 = r3.length
            goto L3a
        L2b:
            if (r14 != 0) goto L31
            if (r15 != 0) goto L31
            r2 = r6
            goto L3a
        L31:
            r1 = r4
            r2 = r7
            goto L3a
        L34:
            if (r2 <= r1) goto L114
            if (r1 < 0) goto L10c
            if (r2 < 0) goto L10c
        L3a:
            if (r2 <= r6) goto L3d
            goto L3e
        L3d:
            r6 = r2
        L3e:
            r2 = 48
            if (r3 != 0) goto L58
            if (r14 == 0) goto L58
            if (r15 == 0) goto L58
            if (r1 > r2) goto L58
            if (r6 < r7) goto L58
            r4 = 0
            char[] r5 = org.apache.commons.lang3.RandomStringUtils.ALPHANUMERICAL_CHARS
            r1 = 0
            r2 = 0
            r3 = 0
            r0 = r11
            r6 = r17
            java.lang.String r0 = random(r0, r1, r2, r3, r4, r5, r6)
            return r0
        L58:
            r8 = 65
            if (r3 != 0) goto L80
            if (r14 == 0) goto L69
            if (r15 == 0) goto L69
            int r1 = java.lang.Math.max(r2, r1)
            int r6 = java.lang.Math.min(r7, r6)
            goto L80
        L69:
            if (r15 == 0) goto L76
            int r1 = java.lang.Math.max(r2, r1)
            r7 = 58
            int r6 = java.lang.Math.min(r7, r6)
            goto L80
        L76:
            if (r14 == 0) goto L80
            int r1 = java.lang.Math.max(r8, r1)
            int r6 = java.lang.Math.min(r7, r6)
        L80:
            if (r3 != 0) goto La4
            if (r15 == 0) goto L86
            if (r6 <= r2) goto L8b
        L86:
            if (r14 == 0) goto La4
            if (r6 <= r8) goto L8b
            goto La4
        L8b:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r5)
            java.lang.StringBuilder r1 = r1.append(r6)
            java.lang.String r2 = ") must be greater then (48) for generating digits or greater then (65) for generating letters."
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        La4:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r11)
            int r5 = r6 - r1
            int r5 = java.lang.Integer.numberOfLeadingZeros(r5)
            int r4 = r4 - r5
            org.apache.commons.lang3.CachedRandomBits r5 = new org.apache.commons.lang3.CachedRandomBits
            int r7 = r0 * r4
            int r7 = r7 + 3
            int r7 = r7 / 5
            int r7 = r7 + 10
            r8 = r17
            r5.<init>(r7, r8)
        Lbf:
            int r7 = r0 + (-1)
            if (r0 == 0) goto L107
            int r8 = r5.nextBits(r4)
            int r8 = r8 + r1
            if (r8 < r6) goto Lcb
            goto Lbf
        Lcb:
            if (r3 != 0) goto Ldc
            int r9 = java.lang.Character.getType(r8)
            if (r9 == 0) goto Lbf
            r10 = 18
            if (r9 == r10) goto Lbf
            r10 = 19
            if (r9 == r10) goto Lbf
            goto Lde
        Ldc:
            char r8 = r3[r8]
        Lde:
            int r9 = java.lang.Character.charCount(r8)
            if (r7 != 0) goto Le8
            r10 = 1
            if (r9 <= r10) goto Le8
            goto Lbf
        Le8:
            if (r14 == 0) goto Lf0
            boolean r10 = java.lang.Character.isLetter(r8)
            if (r10 != 0) goto Lfc
        Lf0:
            if (r15 == 0) goto Lf8
            boolean r10 = java.lang.Character.isDigit(r8)
            if (r10 != 0) goto Lfc
        Lf8:
            if (r14 != 0) goto Lbf
            if (r15 != 0) goto Lbf
        Lfc:
            r2.appendCodePoint(r8)
            r8 = 2
            if (r9 != r8) goto L105
            int r0 = r0 + (-2)
            goto Lbf
        L105:
            r0 = r7
            goto Lbf
        L107:
            java.lang.String r0 = r2.toString()
            return r0
        L10c:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Character positions MUST be >= 0"
            r0.<init>(r1)
            throw r0
        L114:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>(r5)
            java.lang.StringBuilder r2 = r3.append(r13)
            java.lang.String r3 = ") must be greater than start ("
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.StringBuilder r1 = r2.append(r12)
            java.lang.String r2 = ")"
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L137:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Requested random string length "
            r2.<init>(r3)
            java.lang.StringBuilder r0 = r2.append(r11)
            java.lang.String r2 = " is less than 0."
            java.lang.StringBuilder r0 = r0.append(r2)
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            throw r1
    }

    public static java.lang.String random(int r1, java.lang.String r2) {
            org.apache.commons.lang3.RandomStringUtils r0 = secure()
            java.lang.String r1 = r0.next(r1, r2)
            return r1
    }

    public static java.lang.String random(int r1, boolean r2, boolean r3) {
            org.apache.commons.lang3.RandomStringUtils r0 = secure()
            java.lang.String r1 = r0.next(r1, r2, r3)
            return r1
    }

    public static java.lang.String random(int r1, char... r2) {
            org.apache.commons.lang3.RandomStringUtils r0 = secure()
            java.lang.String r1 = r0.next(r1, r2)
            return r1
    }

    private java.util.Random random() {
            r1 = this;
            org.apache.commons.lang3.RandomUtils r0 = r1.randomUtils()
            java.util.Random r0 = r0.random()
            return r0
    }

    public static java.lang.String randomAlphabetic(int r1) {
            org.apache.commons.lang3.RandomStringUtils r0 = secure()
            java.lang.String r1 = r0.nextAlphabetic(r1)
            return r1
    }

    public static java.lang.String randomAlphabetic(int r1, int r2) {
            org.apache.commons.lang3.RandomStringUtils r0 = secure()
            java.lang.String r1 = r0.nextAlphabetic(r1, r2)
            return r1
    }

    public static java.lang.String randomAlphanumeric(int r1) {
            org.apache.commons.lang3.RandomStringUtils r0 = secure()
            java.lang.String r1 = r0.nextAlphanumeric(r1)
            return r1
    }

    public static java.lang.String randomAlphanumeric(int r1, int r2) {
            org.apache.commons.lang3.RandomStringUtils r0 = secure()
            java.lang.String r1 = r0.nextAlphanumeric(r1, r2)
            return r1
    }

    public static java.lang.String randomAscii(int r1) {
            org.apache.commons.lang3.RandomStringUtils r0 = secure()
            java.lang.String r1 = r0.nextAscii(r1)
            return r1
    }

    public static java.lang.String randomAscii(int r1, int r2) {
            org.apache.commons.lang3.RandomStringUtils r0 = secure()
            java.lang.String r1 = r0.nextAscii(r1, r2)
            return r1
    }

    public static java.lang.String randomGraph(int r1) {
            org.apache.commons.lang3.RandomStringUtils r0 = secure()
            java.lang.String r1 = r0.nextGraph(r1)
            return r1
    }

    public static java.lang.String randomGraph(int r1, int r2) {
            org.apache.commons.lang3.RandomStringUtils r0 = secure()
            java.lang.String r1 = r0.nextGraph(r1, r2)
            return r1
    }

    public static java.lang.String randomNumeric(int r1) {
            org.apache.commons.lang3.RandomStringUtils r0 = secure()
            java.lang.String r1 = r0.nextNumeric(r1)
            return r1
    }

    public static java.lang.String randomNumeric(int r1, int r2) {
            org.apache.commons.lang3.RandomStringUtils r0 = secure()
            java.lang.String r1 = r0.nextNumeric(r1, r2)
            return r1
    }

    public static java.lang.String randomPrint(int r1) {
            org.apache.commons.lang3.RandomStringUtils r0 = secure()
            java.lang.String r1 = r0.nextPrint(r1)
            return r1
    }

    public static java.lang.String randomPrint(int r1, int r2) {
            org.apache.commons.lang3.RandomStringUtils r0 = secure()
            java.lang.String r1 = r0.nextPrint(r1, r2)
            return r1
    }

    private org.apache.commons.lang3.RandomUtils randomUtils() {
            r1 = this;
            java.util.function.Supplier<org.apache.commons.lang3.RandomUtils> r0 = r1.random
            java.lang.Object r0 = r0.get()
            org.apache.commons.lang3.RandomUtils r0 = (org.apache.commons.lang3.RandomUtils) r0
            return r0
    }

    public static org.apache.commons.lang3.RandomStringUtils secure() {
            org.apache.commons.lang3.RandomStringUtils r0 = org.apache.commons.lang3.RandomStringUtils.SECURE
            return r0
    }

    public java.lang.String next(int r2) {
            r1 = this;
            r0 = 0
            java.lang.String r2 = random(r2, r0, r0)
            return r2
    }

    public java.lang.String next(int r8, int r9, int r10, boolean r11, boolean r12) {
            r7 = this;
            r5 = 0
            java.util.Random r6 = r7.random()
            r0 = r8
            r1 = r9
            r2 = r10
            r3 = r11
            r4 = r12
            java.lang.String r8 = random(r0, r1, r2, r3, r4, r5, r6)
            return r8
    }

    public java.lang.String next(int r8, int r9, int r10, boolean r11, boolean r12, char... r13) {
            r7 = this;
            java.util.Random r6 = r7.random()
            r0 = r8
            r1 = r9
            r2 = r10
            r3 = r11
            r4 = r12
            r5 = r13
            java.lang.String r8 = random(r0, r1, r2, r3, r4, r5, r6)
            return r8
    }

    public java.lang.String next(int r8, java.lang.String r9) {
            r7 = this;
            if (r9 != 0) goto L11
            r5 = 0
            java.util.Random r6 = r7.random()
            r1 = 0
            r2 = 0
            r3 = 0
            r4 = 0
            r0 = r8
            java.lang.String r8 = random(r0, r1, r2, r3, r4, r5, r6)
            return r8
        L11:
            char[] r9 = r9.toCharArray()
            java.lang.String r8 = random(r8, r9)
            return r8
    }

    public java.lang.String next(int r2, boolean r3, boolean r4) {
            r1 = this;
            r0 = 0
            java.lang.String r2 = random(r2, r0, r0, r3, r4)
            return r2
    }

    public java.lang.String next(int r8, char... r9) {
            r7 = this;
            if (r9 != 0) goto L11
            r5 = 0
            java.util.Random r6 = r7.random()
            r1 = 0
            r2 = 0
            r3 = 0
            r4 = 0
            r0 = r8
            java.lang.String r8 = random(r0, r1, r2, r3, r4, r5, r6)
            return r8
        L11:
            int r2 = r9.length
            r4 = 0
            java.util.Random r6 = r7.random()
            r1 = 0
            r3 = 0
            r0 = r8
            r5 = r9
            java.lang.String r8 = random(r0, r1, r2, r3, r4, r5, r6)
            return r8
    }

    public java.lang.String nextAlphabetic(int r3) {
            r2 = this;
            r0 = 1
            r1 = 0
            java.lang.String r3 = random(r3, r0, r1)
            return r3
    }

    public java.lang.String nextAlphabetic(int r2, int r3) {
            r1 = this;
            org.apache.commons.lang3.RandomUtils r0 = r1.randomUtils()
            int r2 = r0.randomInt(r2, r3)
            java.lang.String r2 = randomAlphabetic(r2)
            return r2
    }

    public java.lang.String nextAlphanumeric(int r2) {
            r1 = this;
            r0 = 1
            java.lang.String r2 = random(r2, r0, r0)
            return r2
    }

    public java.lang.String nextAlphanumeric(int r2, int r3) {
            r1 = this;
            org.apache.commons.lang3.RandomUtils r0 = r1.randomUtils()
            int r2 = r0.randomInt(r2, r3)
            java.lang.String r2 = randomAlphanumeric(r2)
            return r2
    }

    public java.lang.String nextAscii(int r4) {
            r3 = this;
            r0 = 127(0x7f, float:1.78E-43)
            r1 = 0
            r2 = 32
            java.lang.String r4 = random(r4, r2, r0, r1, r1)
            return r4
    }

    public java.lang.String nextAscii(int r2, int r3) {
            r1 = this;
            org.apache.commons.lang3.RandomUtils r0 = r1.randomUtils()
            int r2 = r0.randomInt(r2, r3)
            java.lang.String r2 = randomAscii(r2)
            return r2
    }

    public java.lang.String nextGraph(int r4) {
            r3 = this;
            r0 = 126(0x7e, float:1.77E-43)
            r1 = 0
            r2 = 33
            java.lang.String r4 = random(r4, r2, r0, r1, r1)
            return r4
    }

    public java.lang.String nextGraph(int r2, int r3) {
            r1 = this;
            org.apache.commons.lang3.RandomUtils r0 = r1.randomUtils()
            int r2 = r0.randomInt(r2, r3)
            java.lang.String r2 = randomGraph(r2)
            return r2
    }

    public java.lang.String nextNumeric(int r3) {
            r2 = this;
            r0 = 0
            r1 = 1
            java.lang.String r3 = random(r3, r0, r1)
            return r3
    }

    public java.lang.String nextNumeric(int r2, int r3) {
            r1 = this;
            org.apache.commons.lang3.RandomUtils r0 = r1.randomUtils()
            int r2 = r0.randomInt(r2, r3)
            java.lang.String r2 = randomNumeric(r2)
            return r2
    }

    public java.lang.String nextPrint(int r4) {
            r3 = this;
            r0 = 126(0x7e, float:1.77E-43)
            r1 = 0
            r2 = 32
            java.lang.String r4 = random(r4, r2, r0, r1, r1)
            return r4
    }

    public java.lang.String nextPrint(int r2, int r3) {
            r1 = this;
            org.apache.commons.lang3.RandomUtils r0 = r1.randomUtils()
            int r2 = r0.randomInt(r2, r3)
            java.lang.String r2 = randomPrint(r2)
            return r2
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "RandomStringUtils [random="
            r0.<init>(r1)
            java.util.Random r1 = r2.random()
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = "]"
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
