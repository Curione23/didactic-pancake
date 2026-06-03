package org.apache.commons.lang3.math;

/* JADX INFO: loaded from: classes2.dex */
public class NumberUtils {
    public static final java.lang.Byte BYTE_MINUS_ONE = null;
    public static final java.lang.Byte BYTE_ONE = null;
    public static final java.lang.Byte BYTE_ZERO = null;
    public static final java.lang.Double DOUBLE_MINUS_ONE = null;
    public static final java.lang.Double DOUBLE_ONE = null;
    public static final java.lang.Double DOUBLE_ZERO = null;
    public static final java.lang.Float FLOAT_MINUS_ONE = null;
    public static final java.lang.Float FLOAT_ONE = null;
    public static final java.lang.Float FLOAT_ZERO = null;
    public static final java.lang.Integer INTEGER_MINUS_ONE = null;
    public static final java.lang.Integer INTEGER_ONE = null;
    public static final java.lang.Integer INTEGER_TWO = null;
    public static final java.lang.Integer INTEGER_ZERO = null;
    public static final java.lang.Long LONG_INT_MAX_VALUE = null;
    public static final java.lang.Long LONG_INT_MIN_VALUE = null;
    public static final java.lang.Long LONG_MINUS_ONE = null;
    public static final java.lang.Long LONG_ONE = null;
    public static final java.lang.Long LONG_ZERO = null;
    public static final java.lang.Short SHORT_MINUS_ONE = null;
    public static final java.lang.Short SHORT_ONE = null;
    public static final java.lang.Short SHORT_ZERO = null;

    static {
            r0 = 0
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            org.apache.commons.lang3.math.NumberUtils.LONG_ZERO = r0
            r0 = 1
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            org.apache.commons.lang3.math.NumberUtils.LONG_ONE = r0
            r0 = -1
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            org.apache.commons.lang3.math.NumberUtils.LONG_MINUS_ONE = r0
            r0 = 0
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            org.apache.commons.lang3.math.NumberUtils.INTEGER_ZERO = r1
            r1 = 1
            java.lang.Integer r2 = java.lang.Integer.valueOf(r1)
            org.apache.commons.lang3.math.NumberUtils.INTEGER_ONE = r2
            r2 = 2
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            org.apache.commons.lang3.math.NumberUtils.INTEGER_TWO = r2
            r2 = -1
            java.lang.Integer r3 = java.lang.Integer.valueOf(r2)
            org.apache.commons.lang3.math.NumberUtils.INTEGER_MINUS_ONE = r3
            java.lang.Short r3 = java.lang.Short.valueOf(r0)
            org.apache.commons.lang3.math.NumberUtils.SHORT_ZERO = r3
            java.lang.Short r3 = java.lang.Short.valueOf(r1)
            org.apache.commons.lang3.math.NumberUtils.SHORT_ONE = r3
            java.lang.Short r3 = java.lang.Short.valueOf(r2)
            org.apache.commons.lang3.math.NumberUtils.SHORT_MINUS_ONE = r3
            java.lang.Byte r0 = java.lang.Byte.valueOf(r0)
            org.apache.commons.lang3.math.NumberUtils.BYTE_ZERO = r0
            java.lang.Byte r0 = java.lang.Byte.valueOf(r1)
            org.apache.commons.lang3.math.NumberUtils.BYTE_ONE = r0
            java.lang.Byte r0 = java.lang.Byte.valueOf(r2)
            org.apache.commons.lang3.math.NumberUtils.BYTE_MINUS_ONE = r0
            r0 = 0
            java.lang.Double r0 = java.lang.Double.valueOf(r0)
            org.apache.commons.lang3.math.NumberUtils.DOUBLE_ZERO = r0
            r0 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            java.lang.Double r0 = java.lang.Double.valueOf(r0)
            org.apache.commons.lang3.math.NumberUtils.DOUBLE_ONE = r0
            r0 = -4616189618054758400(0xbff0000000000000, double:-1.0)
            java.lang.Double r0 = java.lang.Double.valueOf(r0)
            org.apache.commons.lang3.math.NumberUtils.DOUBLE_MINUS_ONE = r0
            r0 = 0
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            org.apache.commons.lang3.math.NumberUtils.FLOAT_ZERO = r0
            r0 = 1065353216(0x3f800000, float:1.0)
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            org.apache.commons.lang3.math.NumberUtils.FLOAT_ONE = r0
            r0 = -1082130432(0xffffffffbf800000, float:-1.0)
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            org.apache.commons.lang3.math.NumberUtils.FLOAT_MINUS_ONE = r0
            r0 = 2147483647(0x7fffffff, double:1.060997895E-314)
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            org.apache.commons.lang3.math.NumberUtils.LONG_INT_MAX_VALUE = r0
            r0 = -2147483648(0xffffffff80000000, double:NaN)
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            org.apache.commons.lang3.math.NumberUtils.LONG_INT_MIN_VALUE = r0
            return
    }

    @java.lang.Deprecated
    public NumberUtils() {
            r0 = this;
            r0.<init>()
            return
    }

    public static int compare(byte r0, byte r1) {
            int r0 = r0 - r1
            return r0
    }

    public static int compare(int r0, int r1) {
            if (r0 != r1) goto L4
            r0 = 0
            return r0
        L4:
            if (r0 >= r1) goto L8
            r0 = -1
            goto L9
        L8:
            r0 = 1
        L9:
            return r0
    }

    public static int compare(long r0, long r2) {
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 != 0) goto L6
            r0 = 0
            return r0
        L6:
            if (r0 >= 0) goto La
            r0 = -1
            goto Lb
        La:
            r0 = 1
        Lb:
            return r0
    }

    public static int compare(short r0, short r1) {
            if (r0 != r1) goto L4
            r0 = 0
            return r0
        L4:
            if (r0 >= r1) goto L8
            r0 = -1
            goto L9
        L8:
            r0 = 1
        L9:
            return r0
    }

    public static java.math.BigDecimal createBigDecimal(java.lang.String r1) {
            if (r1 != 0) goto L4
            r1 = 0
            return r1
        L4:
            boolean r0 = org.apache.commons.lang3.StringUtils.isBlank(r1)
            if (r0 != 0) goto L10
            java.math.BigDecimal r0 = new java.math.BigDecimal
            r0.<init>(r1)
            return r0
        L10:
            java.lang.NumberFormatException r1 = new java.lang.NumberFormatException
            java.lang.String r0 = "A blank string is not a valid number"
            r1.<init>(r0)
            throw r1
    }

    public static java.math.BigInteger createBigInteger(java.lang.String r5) {
            if (r5 != 0) goto L4
            r5 = 0
            return r5
        L4:
            boolean r0 = r5.isEmpty()
            if (r0 != 0) goto L68
            r0 = 0
            char r1 = r5.charAt(r0)
            r2 = 45
            r3 = 1
            if (r1 != r2) goto L16
            r0 = r3
            goto L1f
        L16:
            r2 = 43
            if (r1 != r2) goto L1e
            r4 = r3
            r3 = r0
            r0 = r4
            goto L1f
        L1e:
            r3 = r0
        L1f:
            java.lang.String r1 = "0x"
            boolean r1 = r5.startsWith(r1, r0)
            r2 = 16
            if (r1 != 0) goto L56
            java.lang.String r1 = "0X"
            boolean r1 = r5.startsWith(r1, r0)
            if (r1 == 0) goto L32
            goto L56
        L32:
            java.lang.String r1 = "#"
            boolean r1 = r5.startsWith(r1, r0)
            if (r1 == 0) goto L3d
            int r0 = r0 + 1
            goto L58
        L3d:
            java.lang.String r1 = "0"
            boolean r1 = r5.startsWith(r1, r0)
            if (r1 == 0) goto L53
            int r1 = r5.length()
            int r2 = r0 + 1
            if (r1 <= r2) goto L53
            r0 = 8
            r4 = r2
            r2 = r0
            r0 = r4
            goto L58
        L53:
            r2 = 10
            goto L58
        L56:
            int r0 = r0 + 2
        L58:
            java.math.BigInteger r1 = new java.math.BigInteger
            java.lang.String r5 = r5.substring(r0)
            r1.<init>(r5, r2)
            if (r3 == 0) goto L67
            java.math.BigInteger r1 = r1.negate()
        L67:
            return r1
        L68:
            java.lang.NumberFormatException r5 = new java.lang.NumberFormatException
            java.lang.String r0 = "An empty string is not a valid number"
            r5.<init>(r0)
            throw r5
    }

    public static java.lang.Double createDouble(java.lang.String r0) {
            if (r0 != 0) goto L4
            r0 = 0
            return r0
        L4:
            java.lang.Double r0 = java.lang.Double.valueOf(r0)
            return r0
    }

    public static java.lang.Float createFloat(java.lang.String r0) {
            if (r0 != 0) goto L4
            r0 = 0
            return r0
        L4:
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            return r0
    }

    public static java.lang.Integer createInteger(java.lang.String r0) {
            if (r0 != 0) goto L4
            r0 = 0
            return r0
        L4:
            java.lang.Integer r0 = java.lang.Integer.decode(r0)
            return r0
    }

    public static java.lang.Long createLong(java.lang.String r0) {
            if (r0 != 0) goto L4
            r0 = 0
            return r0
        L4:
            java.lang.Long r0 = java.lang.Long.decode(r0)
            return r0
    }

    public static java.lang.Number createNumber(java.lang.String r18) {
            r0 = r18
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            boolean r2 = org.apache.commons.lang3.StringUtils.isBlank(r18)
            if (r2 != 0) goto L236
            r2 = 3
            java.lang.String[] r3 = new java.lang.String[r2]
            java.lang.String r4 = "0x"
            r5 = 0
            r3[r5] = r4
            java.lang.String r4 = "0X"
            r6 = 1
            r3[r6] = r4
            java.lang.String r4 = "#"
            r7 = 2
            r3[r7] = r4
            int r4 = r18.length()
            char r8 = r0.charAt(r5)
            r9 = 43
            r10 = 45
            if (r8 == r9) goto L35
            char r8 = r0.charAt(r5)
            if (r8 != r10) goto L33
            goto L35
        L33:
            r8 = r5
            goto L36
        L35:
            r8 = r6
        L36:
            r9 = r5
        L37:
            if (r9 >= r2) goto L4a
            r11 = r3[r9]
            boolean r12 = r0.startsWith(r11, r8)
            if (r12 == 0) goto L47
            int r2 = r11.length()
            int r2 = r2 + r8
            goto L4b
        L47:
            int r9 = r9 + 1
            goto L37
        L4a:
            r2 = r5
        L4b:
            if (r2 <= 0) goto L82
            r1 = r2
        L4e:
            if (r2 >= r4) goto L5e
            char r5 = r0.charAt(r2)
            r3 = 48
            if (r5 == r3) goto L59
            goto L5e
        L59:
            int r1 = r1 + 1
            int r2 = r2 + 1
            goto L4e
        L5e:
            int r4 = r4 - r1
            r1 = 16
            if (r4 > r1) goto L7d
            r2 = 55
            if (r4 != r1) goto L6a
            if (r5 <= r2) goto L6a
            goto L7d
        L6a:
            r1 = 8
            if (r4 > r1) goto L78
            if (r4 != r1) goto L73
            if (r5 <= r2) goto L73
            goto L78
        L73:
            java.lang.Integer r0 = createInteger(r18)
            return r0
        L78:
            java.lang.Long r0 = createLong(r18)
            return r0
        L7d:
            java.math.BigInteger r0 = createBigInteger(r18)
            return r0
        L82:
            int r2 = r4 + (-1)
            char r3 = r0.charAt(r2)
            r8 = 46
            int r9 = r0.indexOf(r8)
            r11 = 101(0x65, float:1.42E-43)
            int r11 = r0.indexOf(r11)
            r12 = 69
            int r12 = r0.indexOf(r12)
            int r11 = r11 + r12
            int r12 = r11 + 1
            boolean r13 = java.lang.Character.isDigit(r3)
            if (r13 != 0) goto La7
            if (r3 == r8) goto La7
            r8 = r6
            goto La8
        La7:
            r8 = r5
        La8:
            java.lang.String r13 = " is not a valid number."
            r14 = -1
            if (r9 <= r14) goto Ldf
            if (r12 <= r14) goto Ld1
            if (r12 <= r9) goto Lba
            if (r12 > r4) goto Lba
            int r4 = r9 + 1
            java.lang.String r4 = r0.substring(r4, r12)
            goto Lda
        Lba:
            java.lang.NumberFormatException r1 = new java.lang.NumberFormatException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.StringBuilder r0 = r2.append(r0)
            java.lang.StringBuilder r0 = r0.append(r13)
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            throw r1
        Ld1:
            int r15 = r9 + 1
            if (r8 == 0) goto Ld6
            r4 = r2
        Ld6:
            java.lang.String r4 = r0.substring(r15, r4)
        Lda:
            java.lang.String r9 = getMantissa(r0, r9)
            goto L109
        Ldf:
            if (r12 <= r14) goto L100
            if (r12 > r4) goto Le9
            java.lang.String r4 = getMantissa(r0, r12)
        Le7:
            r9 = r4
            goto L108
        Le9:
            java.lang.NumberFormatException r1 = new java.lang.NumberFormatException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.StringBuilder r0 = r2.append(r0)
            java.lang.StringBuilder r0 = r0.append(r13)
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            throw r1
        L100:
            if (r8 == 0) goto L103
            r4 = r2
        L103:
            java.lang.String r4 = getMantissa(r0, r4)
            goto Le7
        L108:
            r4 = r1
        L109:
            r15 = 0
            r16 = 0
            if (r8 == 0) goto L1c2
            if (r12 <= r14) goto L117
            if (r12 >= r2) goto L117
            int r11 = r11 + r7
            java.lang.String r1 = r0.substring(r11, r2)
        L117:
            java.lang.String r2 = r0.substring(r5, r2)
            r7 = 68
            if (r3 == r7) goto L18d
            r7 = 70
            if (r3 == r7) goto L174
            r7 = 76
            if (r3 == r7) goto L133
            r7 = 100
            if (r3 == r7) goto L18d
            r7 = 102(0x66, float:1.43E-43)
            if (r3 == r7) goto L174
            r7 = 108(0x6c, float:1.51E-43)
            if (r3 != r7) goto L1ab
        L133:
            if (r4 != 0) goto L15d
            if (r1 != 0) goto L15d
            boolean r1 = r2.isEmpty()
            if (r1 != 0) goto L14d
            char r1 = r2.charAt(r5)
            if (r1 != r10) goto L14d
            java.lang.String r1 = r2.substring(r6)
            boolean r1 = isDigits(r1)
            if (r1 != 0) goto L153
        L14d:
            boolean r1 = isDigits(r2)
            if (r1 == 0) goto L15d
        L153:
            java.lang.Long r0 = createLong(r2)     // Catch: java.lang.NumberFormatException -> L158
            return r0
        L158:
            java.math.BigInteger r0 = createBigInteger(r2)
            return r0
        L15d:
            java.lang.NumberFormatException r1 = new java.lang.NumberFormatException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.StringBuilder r0 = r2.append(r0)
            java.lang.StringBuilder r0 = r0.append(r13)
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            throw r1
        L174:
            java.lang.Float r1 = createFloat(r18)     // Catch: java.lang.NumberFormatException -> L18d
            boolean r3 = r1.isInfinite()     // Catch: java.lang.NumberFormatException -> L18d
            if (r3 != 0) goto L18d
            float r3 = r1.floatValue()     // Catch: java.lang.NumberFormatException -> L18d
            int r3 = (r3 > r15 ? 1 : (r3 == r15 ? 0 : -1))
            if (r3 != 0) goto L18c
            boolean r3 = isZero(r9, r4)     // Catch: java.lang.NumberFormatException -> L18d
            if (r3 == 0) goto L18d
        L18c:
            return r1
        L18d:
            java.lang.Double r1 = createDouble(r18)     // Catch: java.lang.NumberFormatException -> L1a6
            boolean r3 = r1.isInfinite()     // Catch: java.lang.NumberFormatException -> L1a6
            if (r3 != 0) goto L1a6
            double r5 = r1.doubleValue()     // Catch: java.lang.NumberFormatException -> L1a6
            int r3 = (r5 > r16 ? 1 : (r5 == r16 ? 0 : -1))
            if (r3 != 0) goto L1a5
            boolean r3 = isZero(r9, r4)     // Catch: java.lang.NumberFormatException -> L1a6
            if (r3 == 0) goto L1a6
        L1a5:
            return r1
        L1a6:
            java.math.BigDecimal r0 = createBigDecimal(r2)     // Catch: java.lang.NumberFormatException -> L1ab
            return r0
        L1ab:
            java.lang.NumberFormatException r1 = new java.lang.NumberFormatException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.StringBuilder r0 = r2.append(r0)
            java.lang.StringBuilder r0 = r0.append(r13)
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            throw r1
        L1c2:
            if (r12 <= r14) goto L1cb
            if (r12 >= r2) goto L1cb
            int r11 = r11 + r7
            java.lang.String r1 = r0.substring(r11)
        L1cb:
            if (r4 != 0) goto L1de
            if (r1 != 0) goto L1de
            java.lang.Integer r0 = createInteger(r18)     // Catch: java.lang.NumberFormatException -> L1d4
            return r0
        L1d4:
            java.lang.Long r0 = createLong(r18)     // Catch: java.lang.NumberFormatException -> L1d9
            return r0
        L1d9:
            java.math.BigInteger r0 = createBigInteger(r18)
            return r0
        L1de:
            java.lang.Float r1 = createFloat(r18)     // Catch: java.lang.NumberFormatException -> L231
            java.lang.Double r2 = createDouble(r18)     // Catch: java.lang.NumberFormatException -> L231
            boolean r3 = r1.isInfinite()     // Catch: java.lang.NumberFormatException -> L231
            if (r3 != 0) goto L209
            float r3 = r1.floatValue()     // Catch: java.lang.NumberFormatException -> L231
            int r3 = (r3 > r15 ? 1 : (r3 == r15 ? 0 : -1))
            if (r3 != 0) goto L1fa
            boolean r3 = isZero(r9, r4)     // Catch: java.lang.NumberFormatException -> L231
            if (r3 == 0) goto L209
        L1fa:
            java.lang.String r3 = r1.toString()     // Catch: java.lang.NumberFormatException -> L231
            java.lang.String r5 = r2.toString()     // Catch: java.lang.NumberFormatException -> L231
            boolean r3 = r3.equals(r5)     // Catch: java.lang.NumberFormatException -> L231
            if (r3 == 0) goto L209
            return r1
        L209:
            boolean r1 = r2.isInfinite()     // Catch: java.lang.NumberFormatException -> L231
            if (r1 != 0) goto L231
            double r5 = r2.doubleValue()     // Catch: java.lang.NumberFormatException -> L231
            int r1 = (r5 > r16 ? 1 : (r5 == r16 ? 0 : -1))
            if (r1 != 0) goto L21d
            boolean r1 = isZero(r9, r4)     // Catch: java.lang.NumberFormatException -> L231
            if (r1 == 0) goto L231
        L21d:
            java.math.BigDecimal r1 = createBigDecimal(r18)     // Catch: java.lang.NumberFormatException -> L231
            double r3 = r2.doubleValue()     // Catch: java.lang.NumberFormatException -> L231
            java.math.BigDecimal r3 = java.math.BigDecimal.valueOf(r3)     // Catch: java.lang.NumberFormatException -> L231
            int r0 = r1.compareTo(r3)     // Catch: java.lang.NumberFormatException -> L231
            if (r0 != 0) goto L230
            return r2
        L230:
            return r1
        L231:
            java.math.BigDecimal r0 = createBigDecimal(r18)
            return r0
        L236:
            java.lang.NumberFormatException r0 = new java.lang.NumberFormatException
            java.lang.String r1 = "A blank string is not a valid number"
            r0.<init>(r1)
            throw r0
    }

    private static java.lang.String getMantissa(java.lang.String r4, int r5) {
            r0 = 0
            char r1 = r4.charAt(r0)
            r2 = 45
            r3 = 1
            if (r1 == r2) goto L11
            r2 = 43
            if (r1 != r2) goto Lf
            goto L11
        Lf:
            r1 = r0
            goto L12
        L11:
            r1 = r3
        L12:
            int r2 = r4.length()
            if (r2 <= r1) goto L26
            if (r2 < r5) goto L26
            if (r1 == 0) goto L21
            java.lang.String r4 = r4.substring(r3, r5)
            goto L25
        L21:
            java.lang.String r4 = r4.substring(r0, r5)
        L25:
            return r4
        L26:
            java.lang.NumberFormatException r5 = new java.lang.NumberFormatException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.StringBuilder r4 = r0.append(r4)
            java.lang.String r0 = " is not a valid number."
            java.lang.StringBuilder r4 = r4.append(r0)
            java.lang.String r4 = r4.toString()
            r5.<init>(r4)
            throw r5
    }

    private static boolean isAllZeros(java.lang.String r4) {
            r0 = 1
            if (r4 != 0) goto L4
            return r0
        L4:
            int r1 = r4.length()
            int r1 = r1 - r0
        L9:
            if (r1 < 0) goto L18
            char r2 = r4.charAt(r1)
            r3 = 48
            if (r2 == r3) goto L15
            r4 = 0
            return r4
        L15:
            int r1 = r1 + (-1)
            goto L9
        L18:
            return r0
    }

    public static boolean isCreatable(java.lang.String r17) {
            boolean r0 = org.apache.commons.lang3.StringUtils.isEmpty(r17)
            r1 = 0
            if (r0 == 0) goto L8
            return r1
        L8:
            char[] r0 = r17.toCharArray()
            int r2 = r0.length
            char r3 = r0[r1]
            r4 = 43
            r5 = 45
            r6 = 1
            if (r3 == r5) goto L1b
            if (r3 != r4) goto L19
            goto L1b
        L19:
            r3 = r1
            goto L1c
        L1b:
            r3 = r6
        L1c:
            int r7 = r3 + 1
            r8 = 70
            r9 = 102(0x66, float:1.43E-43)
            r10 = 57
            r11 = 46
            r12 = 48
            if (r2 <= r7) goto L78
            char r13 = r0[r3]
            if (r13 != r12) goto L78
            r13 = r17
            boolean r13 = org.apache.commons.lang3.StringUtils.contains(r13, r11)
            if (r13 != 0) goto L78
            char r13 = r0[r7]
            r14 = 120(0x78, float:1.68E-43)
            if (r13 == r14) goto L58
            r14 = 88
            if (r13 != r14) goto L41
            goto L58
        L41:
            boolean r13 = java.lang.Character.isDigit(r13)
            if (r13 == 0) goto L78
        L47:
            int r2 = r0.length
            if (r7 >= r2) goto L57
            char r2 = r0[r7]
            if (r2 < r12) goto L56
            r3 = 55
            if (r2 <= r3) goto L53
            goto L56
        L53:
            int r7 = r7 + 1
            goto L47
        L56:
            return r1
        L57:
            return r6
        L58:
            int r3 = r3 + 2
            if (r3 != r2) goto L5d
            return r1
        L5d:
            int r2 = r0.length
            if (r3 >= r2) goto L77
            char r2 = r0[r3]
            if (r2 < r12) goto L66
            if (r2 <= r10) goto L73
        L66:
            r4 = 97
            if (r2 < r4) goto L6c
            if (r2 <= r9) goto L73
        L6c:
            r4 = 65
            if (r2 < r4) goto L76
            if (r2 <= r8) goto L73
            goto L76
        L73:
            int r3 = r3 + 1
            goto L5d
        L76:
            return r1
        L77:
            return r6
        L78:
            int r7 = r2 + (-1)
            r13 = r1
            r14 = r13
            r15 = r14
            r16 = r15
        L7f:
            r5 = 69
            r4 = 101(0x65, float:1.42E-43)
            if (r3 < r7) goto Lcb
            if (r3 >= r2) goto L8c
            if (r13 == 0) goto L8c
            if (r14 != 0) goto L8c
            goto Lcb
        L8c:
            int r2 = r0.length
            if (r3 >= r2) goto Lc5
            char r0 = r0[r3]
            if (r0 < r12) goto L96
            if (r0 > r10) goto L96
            return r6
        L96:
            if (r0 == r4) goto Lc4
            if (r0 != r5) goto L9b
            goto Lc4
        L9b:
            if (r0 != r11) goto La4
            if (r16 != 0) goto La3
            if (r15 == 0) goto La2
            goto La3
        La2:
            return r14
        La3:
            return r1
        La4:
            if (r13 != 0) goto Lb3
            r2 = 100
            if (r0 == r2) goto Lb2
            r2 = 68
            if (r0 == r2) goto Lb2
            if (r0 == r9) goto Lb2
            if (r0 != r8) goto Lb3
        Lb2:
            return r14
        Lb3:
            r2 = 108(0x6c, float:1.51E-43)
            if (r0 == r2) goto Lbd
            r2 = 76
            if (r0 != r2) goto Lbc
            goto Lbd
        Lbc:
            return r1
        Lbd:
            if (r14 == 0) goto Lc4
            if (r15 != 0) goto Lc4
            if (r16 != 0) goto Lc4
            r1 = r6
        Lc4:
            return r1
        Lc5:
            if (r13 != 0) goto Lca
            if (r14 == 0) goto Lca
            r1 = r6
        Lca:
            return r1
        Lcb:
            char r6 = r0[r3]
            if (r6 < r12) goto Ld8
            if (r6 > r10) goto Ld8
            r13 = r1
            r4 = 43
            r5 = 45
            r14 = 1
            goto L108
        Ld8:
            if (r6 != r11) goto Le7
            if (r16 != 0) goto Le6
            if (r15 == 0) goto Ldf
            goto Le6
        Ldf:
            r4 = 43
            r5 = 45
            r16 = 1
            goto L108
        Le6:
            return r1
        Le7:
            if (r6 == r4) goto Lfc
            if (r6 != r5) goto Lec
            goto Lfc
        Lec:
            r4 = 43
            r5 = 45
            if (r6 == r4) goto Lf6
            if (r6 != r5) goto Lf5
            goto Lf6
        Lf5:
            return r1
        Lf6:
            if (r13 != 0) goto Lf9
            return r1
        Lf9:
            r13 = r1
            r14 = r13
            goto L108
        Lfc:
            r4 = 43
            r5 = 45
            if (r15 == 0) goto L103
            return r1
        L103:
            if (r14 != 0) goto L106
            return r1
        L106:
            r13 = 1
            r15 = 1
        L108:
            int r3 = r3 + 1
            r6 = 1
            goto L7f
    }

    public static boolean isDigits(java.lang.String r0) {
            boolean r0 = org.apache.commons.lang3.StringUtils.isNumeric(r0)
            return r0
    }

    @java.lang.Deprecated
    public static boolean isNumber(java.lang.String r0) {
            boolean r0 = isCreatable(r0)
            return r0
    }

    public static boolean isParsable(java.lang.String r4) {
            boolean r0 = org.apache.commons.lang3.StringUtils.isEmpty(r4)
            r1 = 0
            if (r0 == 0) goto L8
            return r1
        L8:
            int r0 = r4.length()
            r2 = 1
            int r0 = r0 - r2
            char r0 = r4.charAt(r0)
            r3 = 46
            if (r0 != r3) goto L17
            return r1
        L17:
            char r0 = r4.charAt(r1)
            r3 = 45
            if (r0 != r3) goto L2b
            int r0 = r4.length()
            if (r0 != r2) goto L26
            return r1
        L26:
            boolean r4 = withDecimalsParsing(r4, r2)
            return r4
        L2b:
            boolean r4 = withDecimalsParsing(r4, r1)
            return r4
    }

    private static boolean isZero(java.lang.String r0, java.lang.String r1) {
            boolean r0 = isAllZeros(r0)
            if (r0 == 0) goto Le
            boolean r0 = isAllZeros(r1)
            if (r0 == 0) goto Le
            r0 = 1
            goto Lf
        Le:
            r0 = 0
        Lf:
            return r0
    }

    public static byte max(byte r0, byte r1, byte r2) {
            if (r1 <= r0) goto L3
            r0 = r1
        L3:
            if (r2 <= r0) goto L6
            goto L7
        L6:
            r2 = r0
        L7:
            return r2
    }

    public static byte max(byte... r3) {
            validateArray(r3)
            r0 = 0
            r0 = r3[r0]
            r1 = 1
        L7:
            int r2 = r3.length
            if (r1 >= r2) goto L12
            r2 = r3[r1]
            if (r2 <= r0) goto Lf
            r0 = r2
        Lf:
            int r1 = r1 + 1
            goto L7
        L12:
            return r0
    }

    public static double max(double r0, double r2, double r4) {
            double r0 = java.lang.Math.max(r0, r2)
            double r0 = java.lang.Math.max(r0, r4)
            return r0
    }

    public static double max(double... r6) {
            validateArray(r6)
            r0 = 0
            r0 = r6[r0]
            r2 = 1
        L7:
            int r3 = r6.length
            if (r2 >= r3) goto L1f
            r3 = r6[r2]
            boolean r3 = java.lang.Double.isNaN(r3)
            if (r3 == 0) goto L15
            r0 = 9221120237041090560(0x7ff8000000000000, double:NaN)
            return r0
        L15:
            r3 = r6[r2]
            int r5 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r5 <= 0) goto L1c
            r0 = r3
        L1c:
            int r2 = r2 + 1
            goto L7
        L1f:
            return r0
    }

    public static float max(float r0, float r1, float r2) {
            float r0 = java.lang.Math.max(r0, r1)
            float r0 = java.lang.Math.max(r0, r2)
            return r0
    }

    public static float max(float... r4) {
            validateArray(r4)
            r0 = 0
            r0 = r4[r0]
            r1 = 1
        L7:
            int r2 = r4.length
            if (r1 >= r2) goto L1f
            r2 = r4[r1]
            boolean r2 = java.lang.Float.isNaN(r2)
            if (r2 == 0) goto L15
            r4 = 2143289344(0x7fc00000, float:NaN)
            return r4
        L15:
            r2 = r4[r1]
            int r3 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r3 <= 0) goto L1c
            r0 = r2
        L1c:
            int r1 = r1 + 1
            goto L7
        L1f:
            return r0
    }

    public static int max(int r0, int r1, int r2) {
            if (r1 <= r0) goto L3
            r0 = r1
        L3:
            if (r2 <= r0) goto L6
            goto L7
        L6:
            r2 = r0
        L7:
            return r2
    }

    public static int max(int... r3) {
            validateArray(r3)
            r0 = 0
            r0 = r3[r0]
            r1 = 1
        L7:
            int r2 = r3.length
            if (r1 >= r2) goto L12
            r2 = r3[r1]
            if (r2 <= r0) goto Lf
            r0 = r2
        Lf:
            int r1 = r1 + 1
            goto L7
        L12:
            return r0
    }

    public static long max(long r1, long r3, long r5) {
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 <= 0) goto L5
            r1 = r3
        L5:
            int r3 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r3 <= 0) goto La
            goto Lb
        La:
            r5 = r1
        Lb:
            return r5
    }

    public static long max(long... r6) {
            validateArray(r6)
            r0 = 0
            r0 = r6[r0]
            r2 = 1
        L7:
            int r3 = r6.length
            if (r2 >= r3) goto L14
            r3 = r6[r2]
            int r5 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r5 <= 0) goto L11
            r0 = r3
        L11:
            int r2 = r2 + 1
            goto L7
        L14:
            return r0
    }

    public static short max(short r0, short r1, short r2) {
            if (r1 <= r0) goto L3
            r0 = r1
        L3:
            if (r2 <= r0) goto L6
            goto L7
        L6:
            r2 = r0
        L7:
            return r2
    }

    public static short max(short... r3) {
            validateArray(r3)
            r0 = 0
            short r0 = r3[r0]
            r1 = 1
        L7:
            int r2 = r3.length
            if (r1 >= r2) goto L12
            short r2 = r3[r1]
            if (r2 <= r0) goto Lf
            r0 = r2
        Lf:
            int r1 = r1 + 1
            goto L7
        L12:
            return r0
    }

    public static byte min(byte r0, byte r1, byte r2) {
            if (r1 >= r0) goto L3
            r0 = r1
        L3:
            if (r2 >= r0) goto L6
            goto L7
        L6:
            r2 = r0
        L7:
            return r2
    }

    public static byte min(byte... r3) {
            validateArray(r3)
            r0 = 0
            r0 = r3[r0]
            r1 = 1
        L7:
            int r2 = r3.length
            if (r1 >= r2) goto L12
            r2 = r3[r1]
            if (r2 >= r0) goto Lf
            r0 = r2
        Lf:
            int r1 = r1 + 1
            goto L7
        L12:
            return r0
    }

    public static double min(double r0, double r2, double r4) {
            double r0 = java.lang.Math.min(r0, r2)
            double r0 = java.lang.Math.min(r0, r4)
            return r0
    }

    public static double min(double... r6) {
            validateArray(r6)
            r0 = 0
            r0 = r6[r0]
            r2 = 1
        L7:
            int r3 = r6.length
            if (r2 >= r3) goto L1f
            r3 = r6[r2]
            boolean r3 = java.lang.Double.isNaN(r3)
            if (r3 == 0) goto L15
            r0 = 9221120237041090560(0x7ff8000000000000, double:NaN)
            return r0
        L15:
            r3 = r6[r2]
            int r5 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r5 >= 0) goto L1c
            r0 = r3
        L1c:
            int r2 = r2 + 1
            goto L7
        L1f:
            return r0
    }

    public static float min(float r0, float r1, float r2) {
            float r0 = java.lang.Math.min(r0, r1)
            float r0 = java.lang.Math.min(r0, r2)
            return r0
    }

    public static float min(float... r4) {
            validateArray(r4)
            r0 = 0
            r0 = r4[r0]
            r1 = 1
        L7:
            int r2 = r4.length
            if (r1 >= r2) goto L1f
            r2 = r4[r1]
            boolean r2 = java.lang.Float.isNaN(r2)
            if (r2 == 0) goto L15
            r4 = 2143289344(0x7fc00000, float:NaN)
            return r4
        L15:
            r2 = r4[r1]
            int r3 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r3 >= 0) goto L1c
            r0 = r2
        L1c:
            int r1 = r1 + 1
            goto L7
        L1f:
            return r0
    }

    public static int min(int r0, int r1, int r2) {
            if (r1 >= r0) goto L3
            r0 = r1
        L3:
            if (r2 >= r0) goto L6
            goto L7
        L6:
            r2 = r0
        L7:
            return r2
    }

    public static int min(int... r3) {
            validateArray(r3)
            r0 = 0
            r0 = r3[r0]
            r1 = 1
        L7:
            int r2 = r3.length
            if (r1 >= r2) goto L12
            r2 = r3[r1]
            if (r2 >= r0) goto Lf
            r0 = r2
        Lf:
            int r1 = r1 + 1
            goto L7
        L12:
            return r0
    }

    public static long min(long r1, long r3, long r5) {
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 >= 0) goto L5
            r1 = r3
        L5:
            int r3 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r3 >= 0) goto La
            goto Lb
        La:
            r5 = r1
        Lb:
            return r5
    }

    public static long min(long... r6) {
            validateArray(r6)
            r0 = 0
            r0 = r6[r0]
            r2 = 1
        L7:
            int r3 = r6.length
            if (r2 >= r3) goto L14
            r3 = r6[r2]
            int r5 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r5 >= 0) goto L11
            r0 = r3
        L11:
            int r2 = r2 + 1
            goto L7
        L14:
            return r0
    }

    public static short min(short r0, short r1, short r2) {
            if (r1 >= r0) goto L3
            r0 = r1
        L3:
            if (r2 >= r0) goto L6
            goto L7
        L6:
            r2 = r0
        L7:
            return r2
    }

    public static short min(short... r3) {
            validateArray(r3)
            r0 = 0
            short r0 = r3[r0]
            r1 = 1
        L7:
            int r2 = r3.length
            if (r1 >= r2) goto L12
            short r2 = r3[r1]
            if (r2 >= r0) goto Lf
            r0 = r2
        Lf:
            int r1 = r1 + 1
            goto L7
        L12:
            return r0
    }

    public static byte toByte(java.lang.String r1) {
            r0 = 0
            byte r1 = toByte(r1, r0)
            return r1
    }

    public static byte toByte(java.lang.String r0, byte r1) {
            if (r0 != 0) goto L3
            return r1
        L3:
            byte r0 = java.lang.Byte.parseByte(r0)     // Catch: java.lang.NumberFormatException -> L8
            return r0
        L8:
            return r1
    }

    public static double toDouble(java.lang.String r2) {
            r0 = 0
            double r0 = toDouble(r2, r0)
            return r0
    }

    public static double toDouble(java.lang.String r0, double r1) {
            if (r0 != 0) goto L3
            return r1
        L3:
            double r0 = java.lang.Double.parseDouble(r0)     // Catch: java.lang.NumberFormatException -> L8
            return r0
        L8:
            return r1
    }

    public static double toDouble(java.math.BigDecimal r2) {
            r0 = 0
            double r0 = toDouble(r2, r0)
            return r0
    }

    public static double toDouble(java.math.BigDecimal r0, double r1) {
            if (r0 != 0) goto L3
            goto L7
        L3:
            double r1 = r0.doubleValue()
        L7:
            return r1
    }

    public static float toFloat(java.lang.String r1) {
            r0 = 0
            float r1 = toFloat(r1, r0)
            return r1
    }

    public static float toFloat(java.lang.String r0, float r1) {
            if (r0 != 0) goto L3
            return r1
        L3:
            float r0 = java.lang.Float.parseFloat(r0)     // Catch: java.lang.NumberFormatException -> L8
            return r0
        L8:
            return r1
    }

    public static int toInt(java.lang.String r1) {
            r0 = 0
            int r1 = toInt(r1, r0)
            return r1
    }

    public static int toInt(java.lang.String r0, int r1) {
            if (r0 != 0) goto L3
            return r1
        L3:
            int r0 = java.lang.Integer.parseInt(r0)     // Catch: java.lang.NumberFormatException -> L8
            return r0
        L8:
            return r1
    }

    public static long toLong(java.lang.String r2) {
            r0 = 0
            long r0 = toLong(r2, r0)
            return r0
    }

    public static long toLong(java.lang.String r0, long r1) {
            if (r0 != 0) goto L3
            return r1
        L3:
            long r0 = java.lang.Long.parseLong(r0)     // Catch: java.lang.NumberFormatException -> L8
            return r0
        L8:
            return r1
    }

    public static java.math.BigDecimal toScaledBigDecimal(java.lang.Double r2) {
            java.lang.Integer r0 = org.apache.commons.lang3.math.NumberUtils.INTEGER_TWO
            int r0 = r0.intValue()
            java.math.RoundingMode r1 = java.math.RoundingMode.HALF_EVEN
            java.math.BigDecimal r2 = toScaledBigDecimal(r2, r0, r1)
            return r2
    }

    public static java.math.BigDecimal toScaledBigDecimal(java.lang.Double r2, int r3, java.math.RoundingMode r4) {
            if (r2 != 0) goto L5
            java.math.BigDecimal r2 = java.math.BigDecimal.ZERO
            return r2
        L5:
            double r0 = r2.doubleValue()
            java.math.BigDecimal r2 = java.math.BigDecimal.valueOf(r0)
            java.math.BigDecimal r2 = toScaledBigDecimal(r2, r3, r4)
            return r2
    }

    public static java.math.BigDecimal toScaledBigDecimal(java.lang.Float r2) {
            java.lang.Integer r0 = org.apache.commons.lang3.math.NumberUtils.INTEGER_TWO
            int r0 = r0.intValue()
            java.math.RoundingMode r1 = java.math.RoundingMode.HALF_EVEN
            java.math.BigDecimal r2 = toScaledBigDecimal(r2, r0, r1)
            return r2
    }

    public static java.math.BigDecimal toScaledBigDecimal(java.lang.Float r2, int r3, java.math.RoundingMode r4) {
            if (r2 != 0) goto L5
            java.math.BigDecimal r2 = java.math.BigDecimal.ZERO
            return r2
        L5:
            float r2 = r2.floatValue()
            double r0 = (double) r2
            java.math.BigDecimal r2 = java.math.BigDecimal.valueOf(r0)
            java.math.BigDecimal r2 = toScaledBigDecimal(r2, r3, r4)
            return r2
    }

    public static java.math.BigDecimal toScaledBigDecimal(java.lang.String r2) {
            java.lang.Integer r0 = org.apache.commons.lang3.math.NumberUtils.INTEGER_TWO
            int r0 = r0.intValue()
            java.math.RoundingMode r1 = java.math.RoundingMode.HALF_EVEN
            java.math.BigDecimal r2 = toScaledBigDecimal(r2, r0, r1)
            return r2
    }

    public static java.math.BigDecimal toScaledBigDecimal(java.lang.String r0, int r1, java.math.RoundingMode r2) {
            if (r0 != 0) goto L5
            java.math.BigDecimal r0 = java.math.BigDecimal.ZERO
            return r0
        L5:
            java.math.BigDecimal r0 = createBigDecimal(r0)
            java.math.BigDecimal r0 = toScaledBigDecimal(r0, r1, r2)
            return r0
    }

    public static java.math.BigDecimal toScaledBigDecimal(java.math.BigDecimal r2) {
            java.lang.Integer r0 = org.apache.commons.lang3.math.NumberUtils.INTEGER_TWO
            int r0 = r0.intValue()
            java.math.RoundingMode r1 = java.math.RoundingMode.HALF_EVEN
            java.math.BigDecimal r2 = toScaledBigDecimal(r2, r0, r1)
            return r2
    }

    public static java.math.BigDecimal toScaledBigDecimal(java.math.BigDecimal r0, int r1, java.math.RoundingMode r2) {
            if (r0 != 0) goto L5
            java.math.BigDecimal r0 = java.math.BigDecimal.ZERO
            return r0
        L5:
            if (r2 != 0) goto L9
            java.math.RoundingMode r2 = java.math.RoundingMode.HALF_EVEN
        L9:
            java.math.BigDecimal r0 = r0.setScale(r1, r2)
            return r0
    }

    public static short toShort(java.lang.String r1) {
            r0 = 0
            short r1 = toShort(r1, r0)
            return r1
    }

    public static short toShort(java.lang.String r0, short r1) {
            if (r0 != 0) goto L3
            return r1
        L3:
            short r0 = java.lang.Short.parseShort(r0)     // Catch: java.lang.NumberFormatException -> L8
            return r0
        L8:
            return r1
    }

    private static void validateArray(java.lang.Object r2) {
            java.lang.String r0 = "array"
            java.util.Objects.requireNonNull(r2, r0)
            int r2 = java.lang.reflect.Array.getLength(r2)
            r0 = 0
            if (r2 == 0) goto Le
            r2 = 1
            goto Lf
        Le:
            r2 = r0
        Lf:
            java.lang.String r1 = "Array cannot be empty."
            java.lang.Object[] r0 = new java.lang.Object[r0]
            org.apache.commons.lang3.Validate.isTrue(r2, r1, r0)
            return
    }

    private static boolean withDecimalsParsing(java.lang.String r5, int r6) {
            r0 = 0
            r1 = r0
        L2:
            int r2 = r5.length()
            r3 = 1
            if (r6 >= r2) goto L27
            char r2 = r5.charAt(r6)
            r4 = 46
            if (r2 != r4) goto L13
            r4 = r3
            goto L14
        L13:
            r4 = r0
        L14:
            if (r4 == 0) goto L18
            int r1 = r1 + 1
        L18:
            if (r1 <= r3) goto L1b
            return r0
        L1b:
            if (r4 != 0) goto L24
            boolean r2 = java.lang.Character.isDigit(r2)
            if (r2 != 0) goto L24
            return r0
        L24:
            int r6 = r6 + 1
            goto L2
        L27:
            return r3
    }
}
