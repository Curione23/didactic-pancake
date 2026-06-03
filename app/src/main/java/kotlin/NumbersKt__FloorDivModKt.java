package kotlin;

/* JADX INFO: compiled from: FloorDivMod.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0010\b\n\u0002\u0010\u0005\n\u0000\n\u0002\u0010\t\n\u0002\u0010\n\n\u0000\n\u0002\u0010\u0006\n\u0002\u0010\u0007\n\u0000\u001a\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0087\b\u001a\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0001H\u0087\b\u001a\u0015\u0010\u0000\u001a\u00020\u0004*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0087\b\u001a\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0005H\u0087\b\u001a\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u0087\b\u001a\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0001H\u0087\b\u001a\u0015\u0010\u0000\u001a\u00020\u0004*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\u0087\b\u001a\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0005H\u0087\b\u001a\u0015\u0010\u0000\u001a\u00020\u0004*\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0087\b\u001a\u0015\u0010\u0000\u001a\u00020\u0004*\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0001H\u0087\b\u001a\u0015\u0010\u0000\u001a\u00020\u0004*\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0004H\u0087\b\u001a\u0015\u0010\u0000\u001a\u00020\u0004*\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0005H\u0087\b\u001a\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u0002H\u0087\b\u001a\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u0001H\u0087\b\u001a\u0015\u0010\u0000\u001a\u00020\u0004*\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u0004H\u0087\b\u001a\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u0005H\u0087\b\u001a\u0015\u0010\u0006\u001a\u00020\u0002*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0087\b\u001a\u0015\u0010\u0006\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0001H\u0087\b\u001a\u0015\u0010\u0006\u001a\u00020\u0004*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0087\b\u001a\u0015\u0010\u0006\u001a\u00020\u0005*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0005H\u0087\b\u001a\u0015\u0010\u0006\u001a\u00020\u0007*\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0007H\u0087\b\u001a\u0015\u0010\u0006\u001a\u00020\u0007*\u00020\u00072\u0006\u0010\u0003\u001a\u00020\bH\u0087\b\u001a\u0015\u0010\u0006\u001a\u00020\u0007*\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0007H\u0087\b\u001a\u0015\u0010\u0006\u001a\u00020\b*\u00020\b2\u0006\u0010\u0003\u001a\u00020\bH\u0087\b\u001a\u0015\u0010\u0006\u001a\u00020\u0002*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u0087\b\u001a\u0015\u0010\u0006\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0001H\u0087\b\u001a\u0015\u0010\u0006\u001a\u00020\u0004*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\u0087\b\u001a\u0015\u0010\u0006\u001a\u00020\u0005*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0005H\u0087\b\u001a\u0015\u0010\u0006\u001a\u00020\u0002*\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0087\b\u001a\u0015\u0010\u0006\u001a\u00020\u0001*\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0001H\u0087\b\u001a\u0015\u0010\u0006\u001a\u00020\u0004*\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0004H\u0087\b\u001a\u0015\u0010\u0006\u001a\u00020\u0005*\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0005H\u0087\b\u001a\u0015\u0010\u0006\u001a\u00020\u0002*\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u0002H\u0087\b\u001a\u0015\u0010\u0006\u001a\u00020\u0001*\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u0001H\u0087\b\u001a\u0015\u0010\u0006\u001a\u00020\u0004*\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u0004H\u0087\b\u001a\u0015\u0010\u0006\u001a\u00020\u0005*\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u0005H\u0087\b¨\u0006\t"}, d2 = {"floorDiv", "", "", "other", "", "", "mod", "", "", "kotlin-stdlib"}, k = 5, mv = {1, 9, 0}, xi = 49, xs = "kotlin/NumbersKt")
class NumbersKt__FloorDivModKt extends kotlin.NumbersKt__BigIntegersKt {
    public NumbersKt__FloorDivModKt() {
            r0 = this;
            r0.<init>()
            return
    }

    private static final int floorDiv(byte r2, byte r3) {
            int r0 = r2 / r3
            r1 = r2 ^ r3
            if (r1 >= 0) goto Lb
            int r3 = r3 * r0
            if (r3 == r2) goto Lb
            int r0 = r0 + (-1)
        Lb:
            return r0
    }

    private static final int floorDiv(byte r2, int r3) {
            int r0 = r2 / r3
            r1 = r2 ^ r3
            if (r1 >= 0) goto Lb
            int r3 = r3 * r0
            if (r3 == r2) goto Lb
            int r0 = r0 + (-1)
        Lb:
            return r0
    }

    private static final int floorDiv(byte r2, short r3) {
            int r0 = r2 / r3
            r1 = r2 ^ r3
            if (r1 >= 0) goto Lb
            int r3 = r3 * r0
            if (r3 == r2) goto Lb
            int r0 = r0 + (-1)
        Lb:
            return r0
    }

    private static final int floorDiv(int r2, byte r3) {
            int r0 = r2 / r3
            r1 = r2 ^ r3
            if (r1 >= 0) goto Lb
            int r3 = r3 * r0
            if (r3 == r2) goto Lb
            int r0 = r0 + (-1)
        Lb:
            return r0
    }

    private static final int floorDiv(int r2, int r3) {
            int r0 = r2 / r3
            r1 = r2 ^ r3
            if (r1 >= 0) goto Lb
            int r3 = r3 * r0
            if (r3 == r2) goto Lb
            int r0 = r0 + (-1)
        Lb:
            return r0
    }

    private static final int floorDiv(int r2, short r3) {
            int r0 = r2 / r3
            r1 = r2 ^ r3
            if (r1 >= 0) goto Lb
            int r3 = r3 * r0
            if (r3 == r2) goto Lb
            int r0 = r0 + (-1)
        Lb:
            return r0
    }

    private static final int floorDiv(short r2, byte r3) {
            int r0 = r2 / r3
            r1 = r2 ^ r3
            if (r1 >= 0) goto Lb
            int r3 = r3 * r0
            if (r3 == r2) goto Lb
            int r0 = r0 + (-1)
        Lb:
            return r0
    }

    private static final int floorDiv(short r2, int r3) {
            int r0 = r2 / r3
            r1 = r2 ^ r3
            if (r1 >= 0) goto Lb
            int r3 = r3 * r0
            if (r3 == r2) goto Lb
            int r0 = r0 + (-1)
        Lb:
            return r0
    }

    private static final int floorDiv(short r2, short r3) {
            int r0 = r2 / r3
            r1 = r2 ^ r3
            if (r1 >= 0) goto Lb
            int r3 = r3 * r0
            if (r3 == r2) goto Lb
            int r0 = r0 + (-1)
        Lb:
            return r0
    }

    private static final long floorDiv(byte r8, long r9) {
            long r0 = (long) r8
            long r2 = r0 / r9
            long r4 = r0 ^ r9
            r6 = 0
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 >= 0) goto L13
            long r9 = r9 * r2
            int r8 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r8 == 0) goto L13
            r8 = -1
            long r2 = r2 + r8
        L13:
            return r2
    }

    private static final long floorDiv(int r8, long r9) {
            long r0 = (long) r8
            long r2 = r0 / r9
            long r4 = r0 ^ r9
            r6 = 0
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 >= 0) goto L13
            long r9 = r9 * r2
            int r8 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r8 == 0) goto L13
            r8 = -1
            long r2 = r2 + r8
        L13:
            return r2
    }

    private static final long floorDiv(long r8, byte r10) {
            long r0 = (long) r10
            long r2 = r8 / r0
            long r4 = r8 ^ r0
            r6 = 0
            int r10 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r10 >= 0) goto L13
            long r0 = r0 * r2
            int r8 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            if (r8 == 0) goto L13
            r8 = -1
            long r2 = r2 + r8
        L13:
            return r2
    }

    private static final long floorDiv(long r8, int r10) {
            long r0 = (long) r10
            long r2 = r8 / r0
            long r4 = r8 ^ r0
            r6 = 0
            int r10 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r10 >= 0) goto L13
            long r0 = r0 * r2
            int r8 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            if (r8 == 0) goto L13
            r8 = -1
            long r2 = r2 + r8
        L13:
            return r2
    }

    private static final long floorDiv(long r6, long r8) {
            long r0 = r6 / r8
            long r2 = r6 ^ r8
            r4 = 0
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 >= 0) goto L12
            long r8 = r8 * r0
            int r6 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r6 == 0) goto L12
            r6 = -1
            long r0 = r0 + r6
        L12:
            return r0
    }

    private static final long floorDiv(long r8, short r10) {
            long r0 = (long) r10
            long r2 = r8 / r0
            long r4 = r8 ^ r0
            r6 = 0
            int r10 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r10 >= 0) goto L13
            long r0 = r0 * r2
            int r8 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            if (r8 == 0) goto L13
            r8 = -1
            long r2 = r2 + r8
        L13:
            return r2
    }

    private static final long floorDiv(short r8, long r9) {
            long r0 = (long) r8
            long r2 = r0 / r9
            long r4 = r0 ^ r9
            r6 = 0
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 >= 0) goto L13
            long r9 = r9 * r2
            int r8 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r8 == 0) goto L13
            r8 = -1
            long r2 = r2 + r8
        L13:
            return r2
    }

    private static final byte mod(byte r2, byte r3) {
            int r2 = r2 % r3
            r0 = r2 ^ r3
            int r1 = -r2
            r1 = r1 | r2
            r0 = r0 & r1
            int r0 = r0 >> 31
            r3 = r3 & r0
            int r2 = r2 + r3
            byte r2 = (byte) r2
            return r2
    }

    private static final byte mod(int r2, byte r3) {
            int r2 = r2 % r3
            r0 = r2 ^ r3
            int r1 = -r2
            r1 = r1 | r2
            r0 = r0 & r1
            int r0 = r0 >> 31
            r3 = r3 & r0
            int r2 = r2 + r3
            byte r2 = (byte) r2
            return r2
    }

    private static final byte mod(long r6, byte r8) {
            long r0 = (long) r8
            long r6 = r6 % r0
            long r2 = r6 ^ r0
            long r4 = -r6
            long r4 = r4 | r6
            long r2 = r2 & r4
            r8 = 63
            long r2 = r2 >> r8
            long r0 = r0 & r2
            long r6 = r6 + r0
            int r6 = (int) r6
            byte r6 = (byte) r6
            return r6
    }

    private static final byte mod(short r2, byte r3) {
            int r2 = r2 % r3
            r0 = r2 ^ r3
            int r1 = -r2
            r1 = r1 | r2
            r0 = r0 & r1
            int r0 = r0 >> 31
            r3 = r3 & r0
            int r2 = r2 + r3
            byte r2 = (byte) r2
            return r2
    }

    private static final double mod(double r4, double r6) {
            double r4 = r4 % r6
            r0 = 0
            int r0 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r0 != 0) goto L8
            goto L16
        L8:
            double r0 = java.lang.Math.signum(r4)
            double r2 = java.lang.Math.signum(r6)
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 != 0) goto L15
            goto L16
        L15:
            double r4 = r4 + r6
        L16:
            return r4
    }

    private static final double mod(double r6, float r8) {
            double r0 = (double) r8
            double r6 = r6 % r0
            r2 = 0
            int r8 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r8 != 0) goto L9
            goto L17
        L9:
            double r2 = java.lang.Math.signum(r6)
            double r4 = java.lang.Math.signum(r0)
            int r8 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r8 != 0) goto L16
            goto L17
        L16:
            double r6 = r6 + r0
        L17:
            return r6
    }

    private static final double mod(float r6, double r7) {
            double r0 = (double) r6
            double r0 = r0 % r7
            r2 = 0
            int r6 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r6 != 0) goto L9
            goto L17
        L9:
            double r2 = java.lang.Math.signum(r0)
            double r4 = java.lang.Math.signum(r7)
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 != 0) goto L16
            goto L17
        L16:
            double r0 = r0 + r7
        L17:
            return r0
    }

    private static final float mod(float r2, float r3) {
            float r2 = r2 % r3
            r0 = 0
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 != 0) goto L7
            goto L15
        L7:
            float r0 = java.lang.Math.signum(r2)
            float r1 = java.lang.Math.signum(r3)
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto L14
            goto L15
        L14:
            float r2 = r2 + r3
        L15:
            return r2
    }

    private static final int mod(byte r2, int r3) {
            int r2 = r2 % r3
            r0 = r2 ^ r3
            int r1 = -r2
            r1 = r1 | r2
            r0 = r0 & r1
            int r0 = r0 >> 31
            r3 = r3 & r0
            int r2 = r2 + r3
            return r2
    }

    private static final int mod(int r2, int r3) {
            int r2 = r2 % r3
            r0 = r2 ^ r3
            int r1 = -r2
            r1 = r1 | r2
            r0 = r0 & r1
            int r0 = r0 >> 31
            r3 = r3 & r0
            int r2 = r2 + r3
            return r2
    }

    private static final int mod(long r6, int r8) {
            long r0 = (long) r8
            long r6 = r6 % r0
            long r2 = r6 ^ r0
            long r4 = -r6
            long r4 = r4 | r6
            long r2 = r2 & r4
            r8 = 63
            long r2 = r2 >> r8
            long r0 = r0 & r2
            long r6 = r6 + r0
            int r6 = (int) r6
            return r6
    }

    private static final int mod(short r2, int r3) {
            int r2 = r2 % r3
            r0 = r2 ^ r3
            int r1 = -r2
            r1 = r1 | r2
            r0 = r0 & r1
            int r0 = r0 >> 31
            r3 = r3 & r0
            int r2 = r2 + r3
            return r2
    }

    private static final long mod(byte r6, long r7) {
            long r0 = (long) r6
            long r0 = r0 % r7
            long r2 = r0 ^ r7
            long r4 = -r0
            long r4 = r4 | r0
            long r2 = r2 & r4
            r6 = 63
            long r2 = r2 >> r6
            long r6 = r7 & r2
            long r0 = r0 + r6
            return r0
    }

    private static final long mod(int r6, long r7) {
            long r0 = (long) r6
            long r0 = r0 % r7
            long r2 = r0 ^ r7
            long r4 = -r0
            long r4 = r4 | r0
            long r2 = r2 & r4
            r6 = 63
            long r2 = r2 >> r6
            long r6 = r7 & r2
            long r0 = r0 + r6
            return r0
    }

    private static final long mod(long r4, long r6) {
            long r4 = r4 % r6
            long r0 = r4 ^ r6
            long r2 = -r4
            long r2 = r2 | r4
            long r0 = r0 & r2
            r2 = 63
            long r0 = r0 >> r2
            long r6 = r6 & r0
            long r4 = r4 + r6
            return r4
    }

    private static final long mod(short r6, long r7) {
            long r0 = (long) r6
            long r0 = r0 % r7
            long r2 = r0 ^ r7
            long r4 = -r0
            long r4 = r4 | r0
            long r2 = r2 & r4
            r6 = 63
            long r2 = r2 >> r6
            long r6 = r7 & r2
            long r0 = r0 + r6
            return r0
    }

    private static final short mod(byte r2, short r3) {
            int r2 = r2 % r3
            r0 = r2 ^ r3
            int r1 = -r2
            r1 = r1 | r2
            r0 = r0 & r1
            int r0 = r0 >> 31
            r3 = r3 & r0
            int r2 = r2 + r3
            short r2 = (short) r2
            return r2
    }

    private static final short mod(int r2, short r3) {
            int r2 = r2 % r3
            r0 = r2 ^ r3
            int r1 = -r2
            r1 = r1 | r2
            r0 = r0 & r1
            int r0 = r0 >> 31
            r3 = r3 & r0
            int r2 = r2 + r3
            short r2 = (short) r2
            return r2
    }

    private static final short mod(long r6, short r8) {
            long r0 = (long) r8
            long r6 = r6 % r0
            long r2 = r6 ^ r0
            long r4 = -r6
            long r4 = r4 | r6
            long r2 = r2 & r4
            r8 = 63
            long r2 = r2 >> r8
            long r0 = r0 & r2
            long r6 = r6 + r0
            int r6 = (int) r6
            short r6 = (short) r6
            return r6
    }

    private static final short mod(short r2, short r3) {
            int r2 = r2 % r3
            r0 = r2 ^ r3
            int r1 = -r2
            r1 = r1 | r2
            r0 = r0 & r1
            int r0 = r0 >> 31
            r3 = r3 & r0
            int r2 = r2 + r3
            short r2 = (short) r2
            return r2
    }
}
