package org.apache.commons.io;

/* JADX INFO: loaded from: classes2.dex */
public class EndianUtils {
    @java.lang.Deprecated
    public EndianUtils() {
            r0 = this;
            r0.<init>()
            return
    }

    private static int read(java.io.InputStream r1) throws java.io.IOException {
            int r1 = r1.read()
            r0 = -1
            if (r0 == r1) goto L8
            return r1
        L8:
            java.io.EOFException r1 = new java.io.EOFException
            java.lang.String r0 = "Unexpected EOF reached"
            r1.<init>(r0)
            throw r1
    }

    public static double readSwappedDouble(java.io.InputStream r2) throws java.io.IOException {
            long r0 = readSwappedLong(r2)
            double r0 = java.lang.Double.longBitsToDouble(r0)
            return r0
    }

    public static double readSwappedDouble(byte[] r0, int r1) {
            long r0 = readSwappedLong(r0, r1)
            double r0 = java.lang.Double.longBitsToDouble(r0)
            return r0
    }

    public static float readSwappedFloat(java.io.InputStream r0) throws java.io.IOException {
            int r0 = readSwappedInteger(r0)
            float r0 = java.lang.Float.intBitsToFloat(r0)
            return r0
    }

    public static float readSwappedFloat(byte[] r0, int r1) {
            int r0 = readSwappedInteger(r0, r1)
            float r0 = java.lang.Float.intBitsToFloat(r0)
            return r0
    }

    public static int readSwappedInteger(java.io.InputStream r3) throws java.io.IOException {
            int r0 = read(r3)
            int r1 = read(r3)
            int r2 = read(r3)
            int r3 = read(r3)
            r0 = r0 & 255(0xff, float:3.57E-43)
            r1 = r1 & 255(0xff, float:3.57E-43)
            int r1 = r1 << 8
            int r0 = r0 + r1
            r1 = r2 & 255(0xff, float:3.57E-43)
            int r1 = r1 << 16
            int r0 = r0 + r1
            r3 = r3 & 255(0xff, float:3.57E-43)
            int r3 = r3 << 24
            int r0 = r0 + r3
            return r0
    }

    public static int readSwappedInteger(byte[] r2, int r3) {
            r0 = 4
            validateByteArrayOffset(r2, r3, r0)
            r0 = r2[r3]
            r0 = r0 & 255(0xff, float:3.57E-43)
            int r1 = r3 + 1
            r1 = r2[r1]
            r1 = r1 & 255(0xff, float:3.57E-43)
            int r1 = r1 << 8
            int r0 = r0 + r1
            int r1 = r3 + 2
            r1 = r2[r1]
            r1 = r1 & 255(0xff, float:3.57E-43)
            int r1 = r1 << 16
            int r0 = r0 + r1
            int r3 = r3 + 3
            r2 = r2[r3]
            r2 = r2 & 255(0xff, float:3.57E-43)
            int r2 = r2 << 24
            int r0 = r0 + r2
            return r0
    }

    public static long readSwappedLong(java.io.InputStream r5) throws java.io.IOException {
            r0 = 8
            byte[] r1 = new byte[r0]
            r2 = 0
            r3 = r2
        L6:
            if (r3 >= r0) goto L12
            int r4 = read(r5)
            byte r4 = (byte) r4
            r1[r3] = r4
            int r3 = r3 + 1
            goto L6
        L12:
            long r0 = readSwappedLong(r1, r2)
            return r0
    }

    public static long readSwappedLong(byte[] r4, int r5) {
            r0 = 8
            validateByteArrayOffset(r4, r5, r0)
            int r0 = readSwappedInteger(r4, r5)
            long r0 = (long) r0
            int r5 = r5 + 4
            int r4 = readSwappedInteger(r4, r5)
            long r4 = (long) r4
            r2 = 32
            long r4 = r4 << r2
            r2 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r0 = r0 & r2
            long r4 = r4 + r0
            return r4
    }

    public static short readSwappedShort(java.io.InputStream r1) throws java.io.IOException {
            int r0 = read(r1)
            r0 = r0 & 255(0xff, float:3.57E-43)
            int r1 = read(r1)
            r1 = r1 & 255(0xff, float:3.57E-43)
            int r1 = r1 << 8
            int r0 = r0 + r1
            short r1 = (short) r0
            return r1
    }

    public static short readSwappedShort(byte[] r1, int r2) {
            r0 = 2
            validateByteArrayOffset(r1, r2, r0)
            r0 = r1[r2]
            r0 = r0 & 255(0xff, float:3.57E-43)
            int r2 = r2 + 1
            r1 = r1[r2]
            r1 = r1 & 255(0xff, float:3.57E-43)
            int r1 = r1 << 8
            int r0 = r0 + r1
            short r1 = (short) r0
            return r1
    }

    public static long readSwappedUnsignedInteger(java.io.InputStream r6) throws java.io.IOException {
            int r0 = read(r6)
            int r1 = read(r6)
            int r2 = read(r6)
            int r6 = read(r6)
            r0 = r0 & 255(0xff, float:3.57E-43)
            r1 = r1 & 255(0xff, float:3.57E-43)
            int r1 = r1 << 8
            int r0 = r0 + r1
            r1 = r2 & 255(0xff, float:3.57E-43)
            int r1 = r1 << 16
            int r0 = r0 + r1
            long r0 = (long) r0
            r6 = r6 & 255(0xff, float:3.57E-43)
            long r2 = (long) r6
            r6 = 24
            long r2 = r2 << r6
            r4 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r0 = r0 & r4
            long r2 = r2 + r0
            return r2
    }

    public static long readSwappedUnsignedInteger(byte[] r4, int r5) {
            r0 = 4
            validateByteArrayOffset(r4, r5, r0)
            r0 = r4[r5]
            r0 = r0 & 255(0xff, float:3.57E-43)
            int r1 = r5 + 1
            r1 = r4[r1]
            r1 = r1 & 255(0xff, float:3.57E-43)
            int r1 = r1 << 8
            int r0 = r0 + r1
            int r1 = r5 + 2
            r1 = r4[r1]
            r1 = r1 & 255(0xff, float:3.57E-43)
            int r1 = r1 << 16
            int r0 = r0 + r1
            long r0 = (long) r0
            int r5 = r5 + 3
            r4 = r4[r5]
            r4 = r4 & 255(0xff, float:3.57E-43)
            long r4 = (long) r4
            r2 = 24
            long r4 = r4 << r2
            r2 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r0 = r0 & r2
            long r4 = r4 + r0
            return r4
    }

    public static int readSwappedUnsignedShort(java.io.InputStream r1) throws java.io.IOException {
            int r0 = read(r1)
            int r1 = read(r1)
            r0 = r0 & 255(0xff, float:3.57E-43)
            r1 = r1 & 255(0xff, float:3.57E-43)
            int r1 = r1 << 8
            int r0 = r0 + r1
            return r0
    }

    public static int readSwappedUnsignedShort(byte[] r1, int r2) {
            r0 = 2
            validateByteArrayOffset(r1, r2, r0)
            r0 = r1[r2]
            r0 = r0 & 255(0xff, float:3.57E-43)
            int r2 = r2 + 1
            r1 = r1[r2]
            r1 = r1 & 255(0xff, float:3.57E-43)
            int r1 = r1 << 8
            int r0 = r0 + r1
            return r0
    }

    public static double swapDouble(double r0) {
            long r0 = java.lang.Double.doubleToLongBits(r0)
            long r0 = swapLong(r0)
            double r0 = java.lang.Double.longBitsToDouble(r0)
            return r0
    }

    public static float swapFloat(float r0) {
            int r0 = java.lang.Float.floatToIntBits(r0)
            int r0 = swapInteger(r0)
            float r0 = java.lang.Float.intBitsToFloat(r0)
            return r0
    }

    public static int swapInteger(int r2) {
            r0 = r2 & 255(0xff, float:3.57E-43)
            int r0 = r0 << 24
            int r1 = r2 >> 8
            r1 = r1 & 255(0xff, float:3.57E-43)
            int r1 = r1 << 16
            int r0 = r0 + r1
            int r1 = r2 >> 16
            r1 = r1 & 255(0xff, float:3.57E-43)
            int r1 = r1 << 8
            int r0 = r0 + r1
            int r2 = r2 >> 24
            r2 = r2 & 255(0xff, float:3.57E-43)
            int r0 = r0 + r2
            return r0
    }

    public static long swapLong(long r13) {
            r0 = 255(0xff, double:1.26E-321)
            long r2 = r13 & r0
            r4 = 56
            long r2 = r2 << r4
            r5 = 8
            long r6 = r13 >> r5
            long r6 = r6 & r0
            r8 = 48
            long r6 = r6 << r8
            long r2 = r2 + r6
            r6 = 16
            long r9 = r13 >> r6
            long r9 = r9 & r0
            r7 = 40
            long r9 = r9 << r7
            long r2 = r2 + r9
            r9 = 24
            long r10 = r13 >> r9
            long r10 = r10 & r0
            r12 = 32
            long r10 = r10 << r12
            long r2 = r2 + r10
            long r10 = r13 >> r12
            long r10 = r10 & r0
            long r9 = r10 << r9
            long r2 = r2 + r9
            long r9 = r13 >> r7
            long r9 = r9 & r0
            long r6 = r9 << r6
            long r2 = r2 + r6
            long r6 = r13 >> r8
            long r6 = r6 & r0
            long r5 = r6 << r5
            long r2 = r2 + r5
            long r13 = r13 >> r4
            long r13 = r13 & r0
            long r2 = r2 + r13
            return r2
    }

    public static short swapShort(short r1) {
            r0 = r1 & 255(0xff, float:3.57E-43)
            int r0 = r0 << 8
            int r1 = r1 >> 8
            r1 = r1 & 255(0xff, float:3.57E-43)
            int r0 = r0 + r1
            short r1 = (short) r0
            return r1
    }

    private static void validateByteArrayOffset(byte[] r2, int r3, int r4) {
            int r0 = r2.length
            int r3 = r3 + r4
            if (r0 < r3) goto L5
            return
        L5:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Data only has "
            r0.<init>(r1)
            int r2 = r2.length
            java.lang.StringBuilder r2 = r0.append(r2)
            java.lang.String r0 = "bytes, needed "
            java.lang.StringBuilder r2 = r2.append(r0)
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r3 = "bytes."
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            r4.<init>(r2)
            throw r4
    }

    public static void writeSwappedDouble(java.io.OutputStream r0, double r1) throws java.io.IOException {
            long r1 = java.lang.Double.doubleToLongBits(r1)
            writeSwappedLong(r0, r1)
            return
    }

    public static void writeSwappedDouble(byte[] r0, int r1, double r2) {
            long r2 = java.lang.Double.doubleToLongBits(r2)
            writeSwappedLong(r0, r1, r2)
            return
    }

    public static void writeSwappedFloat(java.io.OutputStream r0, float r1) throws java.io.IOException {
            int r1 = java.lang.Float.floatToIntBits(r1)
            writeSwappedInteger(r0, r1)
            return
    }

    public static void writeSwappedFloat(byte[] r0, int r1, float r2) {
            int r2 = java.lang.Float.floatToIntBits(r2)
            writeSwappedInteger(r0, r1, r2)
            return
    }

    public static void writeSwappedInteger(java.io.OutputStream r1, int r2) throws java.io.IOException {
            r0 = r2 & 255(0xff, float:3.57E-43)
            byte r0 = (byte) r0
            r1.write(r0)
            int r0 = r2 >> 8
            r0 = r0 & 255(0xff, float:3.57E-43)
            byte r0 = (byte) r0
            r1.write(r0)
            int r0 = r2 >> 16
            r0 = r0 & 255(0xff, float:3.57E-43)
            byte r0 = (byte) r0
            r1.write(r0)
            int r2 = r2 >> 24
            r2 = r2 & 255(0xff, float:3.57E-43)
            byte r2 = (byte) r2
            r1.write(r2)
            return
    }

    public static void writeSwappedInteger(byte[] r2, int r3, int r4) {
            r0 = 4
            validateByteArrayOffset(r2, r3, r0)
            r0 = r4 & 255(0xff, float:3.57E-43)
            byte r0 = (byte) r0
            r2[r3] = r0
            int r0 = r3 + 1
            int r1 = r4 >> 8
            r1 = r1 & 255(0xff, float:3.57E-43)
            byte r1 = (byte) r1
            r2[r0] = r1
            int r0 = r3 + 2
            int r1 = r4 >> 16
            r1 = r1 & 255(0xff, float:3.57E-43)
            byte r1 = (byte) r1
            r2[r0] = r1
            int r3 = r3 + 3
            int r4 = r4 >> 24
            r4 = r4 & 255(0xff, float:3.57E-43)
            byte r4 = (byte) r4
            r2[r3] = r4
            return
    }

    public static void writeSwappedLong(java.io.OutputStream r4, long r5) throws java.io.IOException {
            r0 = 255(0xff, double:1.26E-321)
            long r2 = r5 & r0
            int r2 = (int) r2
            byte r2 = (byte) r2
            r4.write(r2)
            r2 = 8
            long r2 = r5 >> r2
            long r2 = r2 & r0
            int r2 = (int) r2
            byte r2 = (byte) r2
            r4.write(r2)
            r2 = 16
            long r2 = r5 >> r2
            long r2 = r2 & r0
            int r2 = (int) r2
            byte r2 = (byte) r2
            r4.write(r2)
            r2 = 24
            long r2 = r5 >> r2
            long r2 = r2 & r0
            int r2 = (int) r2
            byte r2 = (byte) r2
            r4.write(r2)
            r2 = 32
            long r2 = r5 >> r2
            long r2 = r2 & r0
            int r2 = (int) r2
            byte r2 = (byte) r2
            r4.write(r2)
            r2 = 40
            long r2 = r5 >> r2
            long r2 = r2 & r0
            int r2 = (int) r2
            byte r2 = (byte) r2
            r4.write(r2)
            r2 = 48
            long r2 = r5 >> r2
            long r2 = r2 & r0
            int r2 = (int) r2
            byte r2 = (byte) r2
            r4.write(r2)
            r2 = 56
            long r5 = r5 >> r2
            long r5 = r5 & r0
            int r5 = (int) r5
            byte r5 = (byte) r5
            r4.write(r5)
            return
    }

    public static void writeSwappedLong(byte[] r6, int r7, long r8) {
            r0 = 8
            validateByteArrayOffset(r6, r7, r0)
            r1 = 255(0xff, double:1.26E-321)
            long r3 = r8 & r1
            int r3 = (int) r3
            byte r3 = (byte) r3
            r6[r7] = r3
            int r3 = r7 + 1
            long r4 = r8 >> r0
            long r4 = r4 & r1
            int r0 = (int) r4
            byte r0 = (byte) r0
            r6[r3] = r0
            int r0 = r7 + 2
            r3 = 16
            long r3 = r8 >> r3
            long r3 = r3 & r1
            int r3 = (int) r3
            byte r3 = (byte) r3
            r6[r0] = r3
            int r0 = r7 + 3
            r3 = 24
            long r3 = r8 >> r3
            long r3 = r3 & r1
            int r3 = (int) r3
            byte r3 = (byte) r3
            r6[r0] = r3
            int r0 = r7 + 4
            r3 = 32
            long r3 = r8 >> r3
            long r3 = r3 & r1
            int r3 = (int) r3
            byte r3 = (byte) r3
            r6[r0] = r3
            int r0 = r7 + 5
            r3 = 40
            long r3 = r8 >> r3
            long r3 = r3 & r1
            int r3 = (int) r3
            byte r3 = (byte) r3
            r6[r0] = r3
            int r0 = r7 + 6
            r3 = 48
            long r3 = r8 >> r3
            long r3 = r3 & r1
            int r3 = (int) r3
            byte r3 = (byte) r3
            r6[r0] = r3
            int r7 = r7 + 7
            r0 = 56
            long r8 = r8 >> r0
            long r8 = r8 & r1
            int r8 = (int) r8
            byte r8 = (byte) r8
            r6[r7] = r8
            return
    }

    public static void writeSwappedShort(java.io.OutputStream r1, short r2) throws java.io.IOException {
            r0 = r2 & 255(0xff, float:3.57E-43)
            byte r0 = (byte) r0
            r1.write(r0)
            int r2 = r2 >> 8
            r2 = r2 & 255(0xff, float:3.57E-43)
            byte r2 = (byte) r2
            r1.write(r2)
            return
    }

    public static void writeSwappedShort(byte[] r1, int r2, short r3) {
            r0 = 2
            validateByteArrayOffset(r1, r2, r0)
            r0 = r3 & 255(0xff, float:3.57E-43)
            byte r0 = (byte) r0
            r1[r2] = r0
            int r2 = r2 + 1
            int r3 = r3 >> 8
            r3 = r3 & 255(0xff, float:3.57E-43)
            byte r3 = (byte) r3
            r1[r2] = r3
            return
    }
}
