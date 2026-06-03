package org.apache.commons.lang3;

/* JADX INFO: loaded from: classes2.dex */
public class RandomUtils {
    private static org.apache.commons.lang3.RandomUtils INSECURE;
    private static org.apache.commons.lang3.RandomUtils SECURE;
    private static final java.lang.ThreadLocal<java.security.SecureRandom> SECURE_RANDOM = null;
    private static final java.util.function.Supplier<java.util.Random> SECURE_SUPPLIER = null;
    private final java.util.function.Supplier<java.util.Random> random;

    public static /* synthetic */ java.util.concurrent.ThreadLocalRandom $r8$lambda$mPAG4QCbSGijbkS1PUbLTnkaZbE() {
            java.util.concurrent.ThreadLocalRandom r0 = java.util.concurrent.ThreadLocalRandom.current()
            return r0
    }

    static {
            org.apache.commons.lang3.RandomUtils r0 = new org.apache.commons.lang3.RandomUtils
            org.apache.commons.lang3.RandomUtils$$ExternalSyntheticLambda0 r1 = new org.apache.commons.lang3.RandomUtils$$ExternalSyntheticLambda0
            r1.<init>()
            r0.<init>(r1)
            org.apache.commons.lang3.RandomUtils.INSECURE = r0
            org.apache.commons.lang3.RandomUtils$$ExternalSyntheticLambda1 r0 = new org.apache.commons.lang3.RandomUtils$$ExternalSyntheticLambda1
            r0.<init>()
            org.apache.commons.lang3.RandomUtils.SECURE_SUPPLIER = r0
            org.apache.commons.lang3.RandomUtils r1 = new org.apache.commons.lang3.RandomUtils
            r1.<init>(r0)
            org.apache.commons.lang3.RandomUtils.SECURE = r1
            org.apache.commons.lang3.RandomUtils$$ExternalSyntheticLambda2 r0 = new org.apache.commons.lang3.RandomUtils$$ExternalSyntheticLambda2
            r0.<init>()
            java.lang.ThreadLocal r0 = java.lang.ThreadLocal.withInitial(r0)
            org.apache.commons.lang3.RandomUtils.SECURE_RANDOM = r0
            return
    }

    @java.lang.Deprecated
    public RandomUtils() {
            r1 = this;
            java.util.function.Supplier<java.util.Random> r0 = org.apache.commons.lang3.RandomUtils.SECURE_SUPPLIER
            r1.<init>(r0)
            return
    }

    private RandomUtils(java.util.function.Supplier<java.util.Random> r1) {
            r0 = this;
            r0.<init>()
            r0.random = r1
            return
    }

    static org.apache.commons.lang3.RandomUtils insecure() {
            org.apache.commons.lang3.RandomUtils r0 = org.apache.commons.lang3.RandomUtils.INSECURE
            return r0
    }

    static /* synthetic */ java.util.Random lambda$static$0() {
            java.lang.ThreadLocal<java.security.SecureRandom> r0 = org.apache.commons.lang3.RandomUtils.SECURE_RANDOM
            java.lang.Object r0 = r0.get()
            java.util.Random r0 = (java.util.Random) r0
            return r0
    }

    static /* synthetic */ java.security.SecureRandom lambda$static$1() {
            java.security.SecureRandom r0 = java.security.SecureRandom.getInstanceStrong()     // Catch: java.security.NoSuchAlgorithmException -> L5
            return r0
        L5:
            r0 = move-exception
            org.apache.commons.lang3.exception.UncheckedException r1 = new org.apache.commons.lang3.exception.UncheckedException
            r1.<init>(r0)
            throw r1
    }

    public static boolean nextBoolean() {
            org.apache.commons.lang3.RandomUtils r0 = secure()
            boolean r0 = r0.randomBoolean()
            return r0
    }

    public static byte[] nextBytes(int r1) {
            org.apache.commons.lang3.RandomUtils r0 = secure()
            byte[] r1 = r0.randomBytes(r1)
            return r1
    }

    public static double nextDouble() {
            org.apache.commons.lang3.RandomUtils r0 = secure()
            double r0 = r0.randomDouble()
            return r0
    }

    public static double nextDouble(double r1, double r3) {
            org.apache.commons.lang3.RandomUtils r0 = secure()
            double r1 = r0.randomDouble(r1, r3)
            return r1
    }

    public static float nextFloat() {
            org.apache.commons.lang3.RandomUtils r0 = secure()
            float r0 = r0.randomFloat()
            return r0
    }

    public static float nextFloat(float r1, float r2) {
            org.apache.commons.lang3.RandomUtils r0 = secure()
            float r1 = r0.randomFloat(r1, r2)
            return r1
    }

    public static int nextInt() {
            org.apache.commons.lang3.RandomUtils r0 = secure()
            int r0 = r0.randomInt()
            return r0
    }

    public static int nextInt(int r1, int r2) {
            org.apache.commons.lang3.RandomUtils r0 = secure()
            int r1 = r0.randomInt(r1, r2)
            return r1
    }

    public static long nextLong() {
            org.apache.commons.lang3.RandomUtils r0 = secure()
            long r0 = r0.randomLong()
            return r0
    }

    private static long nextLong(long r1) {
            org.apache.commons.lang3.RandomUtils r0 = secure()
            long r1 = r0.randomLong(r1)
            return r1
    }

    public static long nextLong(long r1, long r3) {
            org.apache.commons.lang3.RandomUtils r0 = secure()
            long r1 = r0.randomLong(r1, r3)
            return r1
    }

    private long randomLong(long r7) {
            r6 = this;
        L0:
            java.util.Random r0 = r6.random()
            long r0 = r0.nextLong()
            r2 = 1
            long r0 = r0 >>> r2
            long r2 = r0 % r7
            long r0 = r0 - r2
            long r0 = r0 + r7
            r4 = 1
            long r0 = r0 - r4
            r4 = 0
            int r0 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r0 < 0) goto L0
            return r2
    }

    public static org.apache.commons.lang3.RandomUtils secure() {
            org.apache.commons.lang3.RandomUtils r0 = org.apache.commons.lang3.RandomUtils.SECURE
            return r0
    }

    static java.security.SecureRandom secureRandom() {
            java.lang.ThreadLocal<java.security.SecureRandom> r0 = org.apache.commons.lang3.RandomUtils.SECURE_RANDOM
            java.lang.Object r0 = r0.get()
            java.security.SecureRandom r0 = (java.security.SecureRandom) r0
            return r0
    }

    java.util.Random random() {
            r1 = this;
            java.util.function.Supplier<java.util.Random> r0 = r1.random
            java.lang.Object r0 = r0.get()
            java.util.Random r0 = (java.util.Random) r0
            return r0
    }

    public boolean randomBoolean() {
            r1 = this;
            java.util.Random r0 = r1.random()
            boolean r0 = r0.nextBoolean()
            return r0
    }

    public byte[] randomBytes(int r4) {
            r3 = this;
            r0 = 0
            if (r4 < 0) goto L5
            r1 = 1
            goto L6
        L5:
            r1 = r0
        L6:
            java.lang.String r2 = "Count cannot be negative."
            java.lang.Object[] r0 = new java.lang.Object[r0]
            org.apache.commons.lang3.Validate.isTrue(r1, r2, r0)
            byte[] r4 = new byte[r4]
            java.util.Random r0 = r3.random()
            r0.nextBytes(r4)
            return r4
    }

    public double randomDouble() {
            r4 = this;
            r0 = 0
            r2 = 9218868437227405311(0x7fefffffffffffff, double:1.7976931348623157E308)
            double r0 = nextDouble(r0, r2)
            return r0
    }

    public double randomDouble(double r6, double r8) {
            r5 = this;
            int r0 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            r1 = 1
            r2 = 0
            if (r0 < 0) goto L8
            r0 = r1
            goto L9
        L8:
            r0 = r2
        L9:
            java.lang.String r3 = "Start value must be smaller or equal to end value."
            java.lang.Object[] r4 = new java.lang.Object[r2]
            org.apache.commons.lang3.Validate.isTrue(r0, r3, r4)
            r3 = 0
            int r0 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
            if (r0 < 0) goto L17
            goto L18
        L17:
            r1 = r2
        L18:
            java.lang.String r0 = "Both range values must be non-negative."
            java.lang.Object[] r2 = new java.lang.Object[r2]
            org.apache.commons.lang3.Validate.isTrue(r1, r0, r2)
            int r0 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r0 != 0) goto L24
            return r6
        L24:
            double r8 = r8 - r6
            java.util.Random r0 = r5.random()
            double r0 = r0.nextDouble()
            double r8 = r8 * r0
            double r6 = r6 + r8
            return r6
    }

    public float randomFloat() {
            r2 = this;
            r0 = 0
            r1 = 2139095039(0x7f7fffff, float:3.4028235E38)
            float r0 = nextFloat(r0, r1)
            return r0
    }

    public float randomFloat(float r6, float r7) {
            r5 = this;
            int r0 = (r7 > r6 ? 1 : (r7 == r6 ? 0 : -1))
            r1 = 1
            r2 = 0
            if (r0 < 0) goto L8
            r0 = r1
            goto L9
        L8:
            r0 = r2
        L9:
            java.lang.String r3 = "Start value must be smaller or equal to end value."
            java.lang.Object[] r4 = new java.lang.Object[r2]
            org.apache.commons.lang3.Validate.isTrue(r0, r3, r4)
            r0 = 0
            int r0 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r0 < 0) goto L16
            goto L17
        L16:
            r1 = r2
        L17:
            java.lang.String r0 = "Both range values must be non-negative."
            java.lang.Object[] r2 = new java.lang.Object[r2]
            org.apache.commons.lang3.Validate.isTrue(r1, r0, r2)
            int r0 = (r6 > r7 ? 1 : (r6 == r7 ? 0 : -1))
            if (r0 != 0) goto L23
            return r6
        L23:
            float r7 = r7 - r6
            java.util.Random r0 = r5.random()
            float r0 = r0.nextFloat()
            float r7 = r7 * r0
            float r6 = r6 + r7
            return r6
    }

    public int randomInt() {
            r2 = this;
            r0 = 0
            r1 = 2147483647(0x7fffffff, float:NaN)
            int r0 = nextInt(r0, r1)
            return r0
    }

    public int randomInt(int r6, int r7) {
            r5 = this;
            r0 = 1
            r1 = 0
            if (r7 < r6) goto L6
            r2 = r0
            goto L7
        L6:
            r2 = r1
        L7:
            java.lang.String r3 = "Start value must be smaller or equal to end value."
            java.lang.Object[] r4 = new java.lang.Object[r1]
            org.apache.commons.lang3.Validate.isTrue(r2, r3, r4)
            if (r6 < 0) goto L11
            goto L12
        L11:
            r0 = r1
        L12:
            java.lang.String r2 = "Both range values must be non-negative."
            java.lang.Object[] r1 = new java.lang.Object[r1]
            org.apache.commons.lang3.Validate.isTrue(r0, r2, r1)
            if (r6 != r7) goto L1c
            return r6
        L1c:
            java.util.Random r0 = r5.random()
            int r7 = r7 - r6
            int r7 = r0.nextInt(r7)
            int r6 = r6 + r7
            return r6
    }

    public long randomLong() {
            r2 = this;
            r0 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            long r0 = nextLong(r0)
            return r0
    }

    public long randomLong(long r6, long r8) {
            r5 = this;
            int r0 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            r1 = 1
            r2 = 0
            if (r0 < 0) goto L8
            r0 = r1
            goto L9
        L8:
            r0 = r2
        L9:
            java.lang.String r3 = "Start value must be smaller or equal to end value."
            java.lang.Object[] r4 = new java.lang.Object[r2]
            org.apache.commons.lang3.Validate.isTrue(r0, r3, r4)
            r3 = 0
            int r0 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
            if (r0 < 0) goto L17
            goto L18
        L17:
            r1 = r2
        L18:
            java.lang.String r0 = "Both range values must be non-negative."
            java.lang.Object[] r2 = new java.lang.Object[r2]
            org.apache.commons.lang3.Validate.isTrue(r1, r0, r2)
            int r0 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r0 != 0) goto L24
            return r6
        L24:
            long r8 = r8 - r6
            long r8 = nextLong(r8)
            long r6 = r6 + r8
            return r6
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "RandomUtils [random="
            r0.<init>(r1)
            java.util.Random r1 = r2.random()
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = "]"
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
