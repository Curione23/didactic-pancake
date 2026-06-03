package org.apache.commons.compress.archivers.zip;

/* JADX INFO: loaded from: classes2.dex */
public final class ZipEightByteInteger implements java.io.Serializable {
    private static final int BYTE_1 = 1;
    private static final int BYTE_1_MASK = 65280;
    private static final int BYTE_1_SHIFT = 8;
    private static final int BYTE_2 = 2;
    private static final int BYTE_2_MASK = 16711680;
    private static final int BYTE_2_SHIFT = 16;
    private static final int BYTE_3 = 3;
    private static final long BYTE_3_MASK = 4278190080L;
    private static final int BYTE_3_SHIFT = 24;
    private static final int BYTE_4 = 4;
    private static final long BYTE_4_MASK = 1095216660480L;
    private static final int BYTE_4_SHIFT = 32;
    private static final int BYTE_5 = 5;
    private static final long BYTE_5_MASK = 280375465082880L;
    private static final int BYTE_5_SHIFT = 40;
    private static final int BYTE_6 = 6;
    private static final long BYTE_6_MASK = 71776119061217280L;
    private static final int BYTE_6_SHIFT = 48;
    private static final int BYTE_7 = 7;
    private static final long BYTE_7_MASK = 9151314442816847872L;
    private static final int BYTE_7_SHIFT = 56;
    private static final byte LEFTMOST_BIT = -128;
    private static final int LEFTMOST_BIT_SHIFT = 63;
    public static final org.apache.commons.compress.archivers.zip.ZipEightByteInteger ZERO = null;
    private static final long serialVersionUID = 1;
    private final java.math.BigInteger value;

    static {
            org.apache.commons.compress.archivers.zip.ZipEightByteInteger r0 = new org.apache.commons.compress.archivers.zip.ZipEightByteInteger
            r1 = 0
            r0.<init>(r1)
            org.apache.commons.compress.archivers.zip.ZipEightByteInteger.ZERO = r0
            return
    }

    public ZipEightByteInteger(long r1) {
            r0 = this;
            java.math.BigInteger r1 = java.math.BigInteger.valueOf(r1)
            r0.<init>(r1)
            return
    }

    public ZipEightByteInteger(java.math.BigInteger r1) {
            r0 = this;
            r0.<init>()
            r0.value = r1
            return
    }

    public ZipEightByteInteger(byte[] r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0)
            return
    }

    public ZipEightByteInteger(byte[] r1, int r2) {
            r0 = this;
            r0.<init>()
            java.math.BigInteger r1 = getValue(r1, r2)
            r0.value = r1
            return
    }

    public static byte[] getBytes(long r0) {
            java.math.BigInteger r0 = java.math.BigInteger.valueOf(r0)
            byte[] r0 = getBytes(r0)
            return r0
    }

    public static byte[] getBytes(java.math.BigInteger r6) {
            r0 = 8
            byte[] r1 = new byte[r0]
            long r2 = r6.longValue()
            r4 = 255(0xff, double:1.26E-321)
            long r4 = r4 & r2
            int r4 = (int) r4
            byte r4 = (byte) r4
            r5 = 0
            r1[r5] = r4
            r4 = 65280(0xff00, double:3.22526E-319)
            long r4 = r4 & r2
            long r4 = r4 >> r0
            int r0 = (int) r4
            byte r0 = (byte) r0
            r4 = 1
            r1[r4] = r0
            r4 = 16711680(0xff0000, double:8.256667E-317)
            long r4 = r4 & r2
            r0 = 16
            long r4 = r4 >> r0
            int r0 = (int) r4
            byte r0 = (byte) r0
            r4 = 2
            r1[r4] = r0
            r4 = 4278190080(0xff000000, double:2.113706745E-314)
            long r4 = r4 & r2
            r0 = 24
            long r4 = r4 >> r0
            int r0 = (int) r4
            byte r0 = (byte) r0
            r4 = 3
            r1[r4] = r0
            r4 = 1095216660480(0xff00000000, double:5.41108926696E-312)
            long r4 = r4 & r2
            r0 = 32
            long r4 = r4 >> r0
            int r0 = (int) r4
            byte r0 = (byte) r0
            r4 = 4
            r1[r4] = r0
            r4 = 280375465082880(0xff0000000000, double:1.38523885234213E-309)
            long r4 = r4 & r2
            r0 = 40
            long r4 = r4 >> r0
            int r0 = (int) r4
            byte r0 = (byte) r0
            r4 = 5
            r1[r4] = r0
            r4 = 71776119061217280(0xff000000000000, double:7.06327445644526E-304)
            long r4 = r4 & r2
            r0 = 48
            long r4 = r4 >> r0
            int r0 = (int) r4
            byte r0 = (byte) r0
            r4 = 6
            r1[r4] = r0
            r4 = 9151314442816847872(0x7f00000000000000, double:5.486124068793689E303)
            long r2 = r2 & r4
            r0 = 56
            long r2 = r2 >> r0
            int r0 = (int) r2
            byte r0 = (byte) r0
            r2 = 7
            r1[r2] = r0
            r0 = 63
            boolean r6 = r6.testBit(r0)
            if (r6 == 0) goto L75
            r6 = r1[r2]
            r6 = r6 | (-128(0xffffffffffffff80, float:NaN))
            byte r6 = (byte) r6
            r1[r2] = r6
        L75:
            return r1
    }

    public static long getLongValue(byte[] r2) {
            r0 = 0
            long r0 = getLongValue(r2, r0)
            return r0
    }

    public static long getLongValue(byte[] r0, int r1) {
            java.math.BigInteger r0 = getValue(r0, r1)
            long r0 = r0.longValue()
            return r0
    }

    public static java.math.BigInteger getValue(byte[] r1) {
            r0 = 0
            java.math.BigInteger r1 = getValue(r1, r0)
            return r1
    }

    public static java.math.BigInteger getValue(byte[] r7, int r8) {
            int r0 = r8 + 7
            r1 = r7[r0]
            long r1 = (long) r1
            r3 = 56
            long r1 = r1 << r3
            r3 = 9151314442816847872(0x7f00000000000000, double:5.486124068793689E303)
            long r1 = r1 & r3
            int r3 = r8 + 6
            r3 = r7[r3]
            long r3 = (long) r3
            r5 = 48
            long r3 = r3 << r5
            r5 = 71776119061217280(0xff000000000000, double:7.06327445644526E-304)
            long r3 = r3 & r5
            long r1 = r1 + r3
            int r3 = r8 + 5
            r3 = r7[r3]
            long r3 = (long) r3
            r5 = 40
            long r3 = r3 << r5
            r5 = 280375465082880(0xff0000000000, double:1.38523885234213E-309)
            long r3 = r3 & r5
            long r1 = r1 + r3
            int r3 = r8 + 4
            r3 = r7[r3]
            long r3 = (long) r3
            r5 = 32
            long r3 = r3 << r5
            r5 = 1095216660480(0xff00000000, double:5.41108926696E-312)
            long r3 = r3 & r5
            long r1 = r1 + r3
            int r3 = r8 + 3
            r3 = r7[r3]
            long r3 = (long) r3
            r5 = 24
            long r3 = r3 << r5
            r5 = 4278190080(0xff000000, double:2.113706745E-314)
            long r3 = r3 & r5
            long r1 = r1 + r3
            int r3 = r8 + 2
            r3 = r7[r3]
            long r3 = (long) r3
            r5 = 16
            long r3 = r3 << r5
            r5 = 16711680(0xff0000, double:8.256667E-317)
            long r3 = r3 & r5
            long r1 = r1 + r3
            int r3 = r8 + 1
            r3 = r7[r3]
            long r3 = (long) r3
            r5 = 8
            long r3 = r3 << r5
            r5 = 65280(0xff00, double:3.22526E-319)
            long r3 = r3 & r5
            long r1 = r1 + r3
            r8 = r7[r8]
            long r3 = (long) r8
            r5 = 255(0xff, double:1.26E-321)
            long r3 = r3 & r5
            long r1 = r1 + r3
            java.math.BigInteger r8 = java.math.BigInteger.valueOf(r1)
            r7 = r7[r0]
            r0 = -128(0xffffffffffffff80, float:NaN)
            r7 = r7 & r0
            if (r7 != r0) goto L76
            r7 = 63
            java.math.BigInteger r8 = r8.setBit(r7)
        L76:
            return r8
    }

    public boolean equals(java.lang.Object r2) {
            r1 = this;
            boolean r0 = r2 instanceof org.apache.commons.compress.archivers.zip.ZipEightByteInteger
            if (r0 != 0) goto L6
            r2 = 0
            return r2
        L6:
            java.math.BigInteger r0 = r1.value
            org.apache.commons.compress.archivers.zip.ZipEightByteInteger r2 = (org.apache.commons.compress.archivers.zip.ZipEightByteInteger) r2
            java.math.BigInteger r2 = r2.getValue()
            boolean r2 = r0.equals(r2)
            return r2
    }

    public byte[] getBytes() {
            r1 = this;
            java.math.BigInteger r0 = r1.value
            byte[] r0 = getBytes(r0)
            return r0
    }

    public long getLongValue() {
            r2 = this;
            java.math.BigInteger r0 = r2.value
            long r0 = r0.longValue()
            return r0
    }

    public java.math.BigInteger getValue() {
            r1 = this;
            java.math.BigInteger r0 = r1.value
            return r0
    }

    public int hashCode() {
            r1 = this;
            java.math.BigInteger r0 = r1.value
            int r0 = r0.hashCode()
            return r0
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "ZipEightByteInteger value: "
            r0.<init>(r1)
            java.math.BigInteger r1 = r2.value
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
