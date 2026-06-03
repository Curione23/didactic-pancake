package androidx.core.util;

/* JADX INFO: loaded from: classes.dex */
public final class Preconditions {
    private Preconditions() {
            r0 = this;
            r0.<init>()
            return
    }

    public static void checkArgument(boolean r0) {
            if (r0 == 0) goto L3
            return
        L3:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>()
            throw r0
    }

    public static void checkArgument(boolean r0, java.lang.Object r1) {
            if (r0 == 0) goto L3
            return
        L3:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = java.lang.String.valueOf(r1)
            r0.<init>(r1)
            throw r0
    }

    public static void checkArgument(boolean r0, java.lang.String r1, java.lang.Object... r2) {
            if (r0 == 0) goto L3
            return
        L3:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = java.lang.String.format(r1, r2)
            r0.<init>(r1)
            throw r0
    }

    public static float checkArgumentFinite(float r1, java.lang.String r2) {
            boolean r0 = java.lang.Float.isNaN(r1)
            if (r0 != 0) goto L26
            boolean r0 = java.lang.Float.isInfinite(r1)
            if (r0 != 0) goto Ld
            return r1
        Ld:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.StringBuilder r2 = r0.append(r2)
            java.lang.String r0 = " must not be infinite"
            java.lang.StringBuilder r2 = r2.append(r0)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        L26:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.StringBuilder r2 = r0.append(r2)
            java.lang.String r0 = " must not be NaN"
            java.lang.StringBuilder r2 = r2.append(r0)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
    }

    public static double checkArgumentInRange(double r1, double r3, double r5, java.lang.String r7) {
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 < 0) goto L23
            int r0 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r0 > 0) goto L9
            return r1
        L9:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.util.Locale r2 = java.util.Locale.US
            java.lang.Double r3 = java.lang.Double.valueOf(r3)
            java.lang.Double r4 = java.lang.Double.valueOf(r5)
            java.lang.Object[] r3 = new java.lang.Object[]{r7, r3, r4}
            java.lang.String r4 = "%s is out of range of [%f, %f] (too high)"
            java.lang.String r2 = java.lang.String.format(r2, r4, r3)
            r1.<init>(r2)
            throw r1
        L23:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.util.Locale r2 = java.util.Locale.US
            java.lang.Double r3 = java.lang.Double.valueOf(r3)
            java.lang.Double r4 = java.lang.Double.valueOf(r5)
            java.lang.Object[] r3 = new java.lang.Object[]{r7, r3, r4}
            java.lang.String r4 = "%s is out of range of [%f, %f] (too low)"
            java.lang.String r2 = java.lang.String.format(r2, r4, r3)
            r1.<init>(r2)
            throw r1
    }

    public static float checkArgumentInRange(float r1, float r2, float r3, java.lang.String r4) {
            int r0 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r0 < 0) goto L23
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 > 0) goto L9
            return r1
        L9:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.util.Locale r0 = java.util.Locale.US
            java.lang.Float r2 = java.lang.Float.valueOf(r2)
            java.lang.Float r3 = java.lang.Float.valueOf(r3)
            java.lang.Object[] r2 = new java.lang.Object[]{r4, r2, r3}
            java.lang.String r3 = "%s is out of range of [%f, %f] (too high)"
            java.lang.String r2 = java.lang.String.format(r0, r3, r2)
            r1.<init>(r2)
            throw r1
        L23:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.util.Locale r0 = java.util.Locale.US
            java.lang.Float r2 = java.lang.Float.valueOf(r2)
            java.lang.Float r3 = java.lang.Float.valueOf(r3)
            java.lang.Object[] r2 = new java.lang.Object[]{r4, r2, r3}
            java.lang.String r3 = "%s is out of range of [%f, %f] (too low)"
            java.lang.String r2 = java.lang.String.format(r0, r3, r2)
            r1.<init>(r2)
            throw r1
    }

    public static int checkArgumentInRange(int r1, int r2, int r3, java.lang.String r4) {
            if (r1 < r2) goto L1f
            if (r1 > r3) goto L5
            return r1
        L5:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.util.Locale r0 = java.util.Locale.US
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            java.lang.Object[] r2 = new java.lang.Object[]{r4, r2, r3}
            java.lang.String r3 = "%s is out of range of [%d, %d] (too high)"
            java.lang.String r2 = java.lang.String.format(r0, r3, r2)
            r1.<init>(r2)
            throw r1
        L1f:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.util.Locale r0 = java.util.Locale.US
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            java.lang.Object[] r2 = new java.lang.Object[]{r4, r2, r3}
            java.lang.String r3 = "%s is out of range of [%d, %d] (too low)"
            java.lang.String r2 = java.lang.String.format(r0, r3, r2)
            r1.<init>(r2)
            throw r1
    }

    public static long checkArgumentInRange(long r1, long r3, long r5, java.lang.String r7) {
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 < 0) goto L23
            int r0 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r0 > 0) goto L9
            return r1
        L9:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.util.Locale r2 = java.util.Locale.US
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            java.lang.Long r4 = java.lang.Long.valueOf(r5)
            java.lang.Object[] r3 = new java.lang.Object[]{r7, r3, r4}
            java.lang.String r4 = "%s is out of range of [%d, %d] (too high)"
            java.lang.String r2 = java.lang.String.format(r2, r4, r3)
            r1.<init>(r2)
            throw r1
        L23:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.util.Locale r2 = java.util.Locale.US
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            java.lang.Long r4 = java.lang.Long.valueOf(r5)
            java.lang.Object[] r3 = new java.lang.Object[]{r7, r3, r4}
            java.lang.String r4 = "%s is out of range of [%d, %d] (too low)"
            java.lang.String r2 = java.lang.String.format(r2, r4, r3)
            r1.<init>(r2)
            throw r1
    }

    public static int checkArgumentNonnegative(int r0) {
            if (r0 < 0) goto L3
            return r0
        L3:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>()
            throw r0
    }

    public static int checkArgumentNonnegative(int r0, java.lang.String r1) {
            if (r0 < 0) goto L3
            return r0
        L3:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1)
            throw r0
    }

    public static int checkFlagsArgument(int r3, int r4) {
            r0 = r3 & r4
            if (r0 != r3) goto L5
            return r3
        L5:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Requested flags 0x"
            r1.<init>(r2)
            java.lang.String r3 = java.lang.Integer.toHexString(r3)
            java.lang.StringBuilder r3 = r1.append(r3)
            java.lang.String r1 = ", but only 0x"
            java.lang.StringBuilder r3 = r3.append(r1)
            java.lang.String r4 = java.lang.Integer.toHexString(r4)
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.String r4 = " are allowed"
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.String r3 = r3.toString()
            r0.<init>(r3)
            throw r0
    }

    public static <T> T checkNotNull(T r0) {
            r0.getClass()
            return r0
    }

    public static <T> T checkNotNull(T r0, java.lang.Object r1) {
            if (r0 == 0) goto L3
            return r0
        L3:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = java.lang.String.valueOf(r1)
            r0.<init>(r1)
            throw r0
    }

    public static void checkState(boolean r1) {
            r0 = 0
            checkState(r1, r0)
            return
    }

    public static void checkState(boolean r0, java.lang.String r1) {
            if (r0 == 0) goto L3
            return
        L3:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
    }

    public static <T extends java.lang.CharSequence> T checkStringNotEmpty(T r1) {
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto L7
            return r1
        L7:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            r1.<init>()
            throw r1
    }

    public static <T extends java.lang.CharSequence> T checkStringNotEmpty(T r1, java.lang.Object r2) {
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto L7
            return r1
        L7:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = java.lang.String.valueOf(r2)
            r1.<init>(r2)
            throw r1
    }

    public static <T extends java.lang.CharSequence> T checkStringNotEmpty(T r1, java.lang.String r2, java.lang.Object... r3) {
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto L7
            return r1
        L7:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = java.lang.String.format(r2, r3)
            r1.<init>(r2)
            throw r1
    }
}
