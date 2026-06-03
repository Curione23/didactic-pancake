package androidx.core.math;

/* JADX INFO: loaded from: classes.dex */
public class MathUtils {
    private MathUtils() {
            r0 = this;
            r0.<init>()
            return
    }

    public static int addExact(int r4, int r5) {
            int r0 = r4 + r5
            r1 = 1
            r2 = 0
            if (r4 < 0) goto L8
            r3 = r1
            goto L9
        L8:
            r3 = r2
        L9:
            if (r5 < 0) goto Ld
            r5 = r1
            goto Le
        Ld:
            r5 = r2
        Le:
            if (r3 != r5) goto L24
            if (r4 < 0) goto L14
            r4 = r1
            goto L15
        L14:
            r4 = r2
        L15:
            if (r0 < 0) goto L18
            goto L19
        L18:
            r1 = r2
        L19:
            if (r4 != r1) goto L1c
            goto L24
        L1c:
            java.lang.ArithmeticException r4 = new java.lang.ArithmeticException
            java.lang.String r5 = "integer overflow"
            r4.<init>(r5)
            throw r4
        L24:
            return r0
    }

    public static long addExact(long r6, long r8) {
            long r0 = r6 + r8
            r2 = 0
            int r6 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            r7 = 1
            r4 = 0
            if (r6 < 0) goto Lc
            r5 = r7
            goto Ld
        Lc:
            r5 = r4
        Ld:
            int r8 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r8 < 0) goto L13
            r8 = r7
            goto L14
        L13:
            r8 = r4
        L14:
            if (r5 != r8) goto L2c
            if (r6 < 0) goto L1a
            r6 = r7
            goto L1b
        L1a:
            r6 = r4
        L1b:
            int r8 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r8 < 0) goto L20
            goto L21
        L20:
            r7 = r4
        L21:
            if (r6 != r7) goto L24
            goto L2c
        L24:
            java.lang.ArithmeticException r6 = new java.lang.ArithmeticException
            java.lang.String r7 = "integer overflow"
            r6.<init>(r7)
            throw r6
        L2c:
            return r0
    }

    public static double clamp(double r1, double r3, double r5) {
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 >= 0) goto L5
            return r3
        L5:
            int r3 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r3 <= 0) goto La
            return r5
        La:
            return r1
    }

    public static float clamp(float r1, float r2, float r3) {
            int r0 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r0 >= 0) goto L5
            return r2
        L5:
            int r2 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r2 <= 0) goto La
            return r3
        La:
            return r1
    }

    public static int clamp(int r0, int r1, int r2) {
            if (r0 >= r1) goto L3
            return r1
        L3:
            if (r0 <= r2) goto L6
            return r2
        L6:
            return r0
    }

    public static long clamp(long r1, long r3, long r5) {
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 >= 0) goto L5
            return r3
        L5:
            int r3 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r3 <= 0) goto La
            return r5
        La:
            return r1
    }

    public static int decrementExact(int r1) {
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r1 == r0) goto L7
            int r1 = r1 + (-1)
            return r1
        L7:
            java.lang.ArithmeticException r1 = new java.lang.ArithmeticException
            java.lang.String r0 = "integer overflow"
            r1.<init>(r0)
            throw r1
    }

    public static long decrementExact(long r2) {
            r0 = -9223372036854775808
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 == 0) goto La
            r0 = 1
            long r2 = r2 - r0
            return r2
        La:
            java.lang.ArithmeticException r2 = new java.lang.ArithmeticException
            java.lang.String r3 = "integer overflow"
            r2.<init>(r3)
            throw r2
    }

    public static int incrementExact(int r1) {
            r0 = 2147483647(0x7fffffff, float:NaN)
            if (r1 == r0) goto L8
            int r1 = r1 + 1
            return r1
        L8:
            java.lang.ArithmeticException r1 = new java.lang.ArithmeticException
            java.lang.String r0 = "integer overflow"
            r1.<init>(r0)
            throw r1
    }

    public static long incrementExact(long r2) {
            r0 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 == 0) goto Ld
            r0 = 1
            long r2 = r2 + r0
            return r2
        Ld:
            java.lang.ArithmeticException r2 = new java.lang.ArithmeticException
            java.lang.String r3 = "integer overflow"
            r2.<init>(r3)
            throw r2
    }

    public static int multiplyExact(int r2, int r3) {
            int r0 = r2 * r3
            if (r2 == 0) goto L17
            if (r3 == 0) goto L17
            int r1 = r0 / r2
            if (r1 != r3) goto Lf
            int r3 = r0 / r3
            if (r3 != r2) goto Lf
            goto L17
        Lf:
            java.lang.ArithmeticException r2 = new java.lang.ArithmeticException
            java.lang.String r3 = "integer overflow"
            r2.<init>(r3)
            throw r2
        L17:
            return r0
    }

    public static long multiplyExact(long r5, long r7) {
            long r0 = r5 * r7
            r2 = 0
            int r4 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r4 == 0) goto L21
            int r2 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r2 == 0) goto L21
            long r2 = r0 / r5
            int r2 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
            if (r2 != 0) goto L19
            long r7 = r0 / r7
            int r5 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r5 != 0) goto L19
            goto L21
        L19:
            java.lang.ArithmeticException r5 = new java.lang.ArithmeticException
            java.lang.String r6 = "integer overflow"
            r5.<init>(r6)
            throw r5
        L21:
            return r0
    }

    public static int negateExact(int r1) {
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r1 == r0) goto L6
            int r1 = -r1
            return r1
        L6:
            java.lang.ArithmeticException r1 = new java.lang.ArithmeticException
            java.lang.String r0 = "integer overflow"
            r1.<init>(r0)
            throw r1
    }

    public static long negateExact(long r2) {
            r0 = -9223372036854775808
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 == 0) goto L8
            long r2 = -r2
            return r2
        L8:
            java.lang.ArithmeticException r2 = new java.lang.ArithmeticException
            java.lang.String r3 = "integer overflow"
            r2.<init>(r3)
            throw r2
    }

    public static int subtractExact(int r4, int r5) {
            int r0 = r4 - r5
            r1 = 1
            r2 = 0
            if (r4 >= 0) goto L8
            r3 = r1
            goto L9
        L8:
            r3 = r2
        L9:
            if (r5 >= 0) goto Ld
            r5 = r1
            goto Le
        Ld:
            r5 = r2
        Le:
            if (r3 == r5) goto L24
            if (r4 >= 0) goto L14
            r4 = r1
            goto L15
        L14:
            r4 = r2
        L15:
            if (r0 >= 0) goto L18
            goto L19
        L18:
            r1 = r2
        L19:
            if (r4 != r1) goto L1c
            goto L24
        L1c:
            java.lang.ArithmeticException r4 = new java.lang.ArithmeticException
            java.lang.String r5 = "integer overflow"
            r4.<init>(r5)
            throw r4
        L24:
            return r0
    }

    public static long subtractExact(long r6, long r8) {
            long r0 = r6 - r8
            r2 = 0
            int r6 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            r7 = 1
            r4 = 0
            if (r6 >= 0) goto Lc
            r5 = r7
            goto Ld
        Lc:
            r5 = r4
        Ld:
            int r8 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r8 >= 0) goto L13
            r8 = r7
            goto L14
        L13:
            r8 = r4
        L14:
            if (r5 == r8) goto L2c
            if (r6 >= 0) goto L1a
            r6 = r7
            goto L1b
        L1a:
            r6 = r4
        L1b:
            int r8 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r8 >= 0) goto L20
            goto L21
        L20:
            r7 = r4
        L21:
            if (r6 != r7) goto L24
            goto L2c
        L24:
            java.lang.ArithmeticException r6 = new java.lang.ArithmeticException
            java.lang.String r7 = "integer overflow"
            r6.<init>(r7)
            throw r6
        L2c:
            return r0
    }

    public static int toIntExact(long r2) {
            r0 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 > 0) goto L10
            r0 = -2147483648(0xffffffff80000000, double:NaN)
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 < 0) goto L10
            int r2 = (int) r2
            return r2
        L10:
            java.lang.ArithmeticException r2 = new java.lang.ArithmeticException
            java.lang.String r3 = "integer overflow"
            r2.<init>(r3)
            throw r2
    }
}
