package org.tukaani.xz.common;

/* JADX INFO: loaded from: classes2.dex */
public final class ByteArrayView {
    public static final int ALIGN_INT = 0;
    public static final int ALIGN_LONG = 0;
    public static final int ALIGN_SHORT = 0;

    private ByteArrayView() {
            r0 = this;
            r0.<init>()
            return
    }

    public static int getIntBE(byte[] r2, int r3) {
            r0 = r2[r3]
            int r0 = r0 << 24
            int r1 = r3 + 1
            r1 = r2[r1]
            r1 = r1 & 255(0xff, float:3.57E-43)
            int r1 = r1 << 16
            r0 = r0 | r1
            int r1 = r3 + 2
            r1 = r2[r1]
            r1 = r1 & 255(0xff, float:3.57E-43)
            int r1 = r1 << 8
            r0 = r0 | r1
            int r3 = r3 + 3
            r2 = r2[r3]
            r2 = r2 & 255(0xff, float:3.57E-43)
            r2 = r2 | r0
            return r2
    }

    public static int getIntLE(byte[] r2, int r3) {
            r0 = r2[r3]
            r0 = r0 & 255(0xff, float:3.57E-43)
            int r1 = r3 + 1
            r1 = r2[r1]
            r1 = r1 & 255(0xff, float:3.57E-43)
            int r1 = r1 << 8
            r0 = r0 | r1
            int r1 = r3 + 2
            r1 = r2[r1]
            r1 = r1 & 255(0xff, float:3.57E-43)
            int r1 = r1 << 16
            r0 = r0 | r1
            int r3 = r3 + 3
            r2 = r2[r3]
            int r2 = r2 << 24
            r2 = r2 | r0
            return r2
    }

    public static long getLongBE(byte[] r5, int r6) {
            r0 = r5[r6]
            long r0 = (long) r0
            r2 = 56
            long r0 = r0 << r2
            int r2 = r6 + 1
            r2 = r5[r2]
            r2 = r2 & 255(0xff, float:3.57E-43)
            long r2 = (long) r2
            r4 = 48
            long r2 = r2 << r4
            long r0 = r0 | r2
            int r2 = r6 + 2
            r2 = r5[r2]
            r2 = r2 & 255(0xff, float:3.57E-43)
            long r2 = (long) r2
            r4 = 40
            long r2 = r2 << r4
            long r0 = r0 | r2
            int r2 = r6 + 3
            r2 = r5[r2]
            r2 = r2 & 255(0xff, float:3.57E-43)
            long r2 = (long) r2
            r4 = 32
            long r2 = r2 << r4
            long r0 = r0 | r2
            int r2 = r6 + 4
            r2 = r5[r2]
            r2 = r2 & 255(0xff, float:3.57E-43)
            long r2 = (long) r2
            r4 = 24
            long r2 = r2 << r4
            long r0 = r0 | r2
            int r2 = r6 + 5
            r2 = r5[r2]
            r2 = r2 & 255(0xff, float:3.57E-43)
            long r2 = (long) r2
            r4 = 16
            long r2 = r2 << r4
            long r0 = r0 | r2
            int r2 = r6 + 6
            r2 = r5[r2]
            r2 = r2 & 255(0xff, float:3.57E-43)
            long r2 = (long) r2
            r4 = 8
            long r2 = r2 << r4
            long r0 = r0 | r2
            int r6 = r6 + 7
            r5 = r5[r6]
            long r5 = (long) r5
            r2 = 255(0xff, double:1.26E-321)
            long r5 = r5 & r2
            long r5 = r5 | r0
            return r5
    }

    public static long getLongLE(byte[] r5, int r6) {
            r0 = r5[r6]
            long r0 = (long) r0
            r2 = 255(0xff, double:1.26E-321)
            long r0 = r0 & r2
            int r2 = r6 + 1
            r2 = r5[r2]
            r2 = r2 & 255(0xff, float:3.57E-43)
            long r2 = (long) r2
            r4 = 8
            long r2 = r2 << r4
            long r0 = r0 | r2
            int r2 = r6 + 2
            r2 = r5[r2]
            r2 = r2 & 255(0xff, float:3.57E-43)
            long r2 = (long) r2
            r4 = 16
            long r2 = r2 << r4
            long r0 = r0 | r2
            int r2 = r6 + 3
            r2 = r5[r2]
            r2 = r2 & 255(0xff, float:3.57E-43)
            long r2 = (long) r2
            r4 = 24
            long r2 = r2 << r4
            long r0 = r0 | r2
            int r2 = r6 + 4
            r2 = r5[r2]
            r2 = r2 & 255(0xff, float:3.57E-43)
            long r2 = (long) r2
            r4 = 32
            long r2 = r2 << r4
            long r0 = r0 | r2
            int r2 = r6 + 5
            r2 = r5[r2]
            r2 = r2 & 255(0xff, float:3.57E-43)
            long r2 = (long) r2
            r4 = 40
            long r2 = r2 << r4
            long r0 = r0 | r2
            int r2 = r6 + 6
            r2 = r5[r2]
            r2 = r2 & 255(0xff, float:3.57E-43)
            long r2 = (long) r2
            r4 = 48
            long r2 = r2 << r4
            long r0 = r0 | r2
            int r6 = r6 + 7
            r5 = r5[r6]
            long r5 = (long) r5
            r2 = 56
            long r5 = r5 << r2
            long r5 = r5 | r0
            return r5
    }

    public static short getShortBE(byte[] r1, int r2) {
            r0 = r1[r2]
            int r0 = r0 << 8
            int r2 = r2 + 1
            r1 = r1[r2]
            r1 = r1 & 255(0xff, float:3.57E-43)
            r1 = r1 | r0
            short r1 = (short) r1
            return r1
    }

    public static short getShortLE(byte[] r1, int r2) {
            r0 = r1[r2]
            r0 = r0 & 255(0xff, float:3.57E-43)
            int r2 = r2 + 1
            r1 = r1[r2]
            int r1 = r1 << 8
            r1 = r1 | r0
            short r1 = (short) r1
            return r1
    }

    public static void setIntBE(byte[] r2, int r3, int r4) {
            int r0 = r4 >>> 24
            byte r0 = (byte) r0
            r2[r3] = r0
            int r0 = r3 + 1
            int r1 = r4 >>> 16
            byte r1 = (byte) r1
            r2[r0] = r1
            int r0 = r3 + 2
            int r1 = r4 >>> 8
            byte r1 = (byte) r1
            r2[r0] = r1
            int r3 = r3 + 3
            byte r4 = (byte) r4
            r2[r3] = r4
            return
    }

    public static void setIntLE(byte[] r2, int r3, int r4) {
            byte r0 = (byte) r4
            r2[r3] = r0
            int r0 = r3 + 1
            int r1 = r4 >>> 8
            byte r1 = (byte) r1
            r2[r0] = r1
            int r0 = r3 + 2
            int r1 = r4 >>> 16
            byte r1 = (byte) r1
            r2[r0] = r1
            int r3 = r3 + 3
            int r4 = r4 >>> 24
            byte r4 = (byte) r4
            r2[r3] = r4
            return
    }

    public static void setLongBE(byte[] r3, int r4, long r5) {
            r0 = 56
            long r0 = r5 >>> r0
            int r0 = (int) r0
            byte r0 = (byte) r0
            r3[r4] = r0
            int r0 = r4 + 1
            r1 = 48
            long r1 = r5 >>> r1
            int r1 = (int) r1
            byte r1 = (byte) r1
            r3[r0] = r1
            int r0 = r4 + 2
            r1 = 40
            long r1 = r5 >>> r1
            int r1 = (int) r1
            byte r1 = (byte) r1
            r3[r0] = r1
            int r0 = r4 + 3
            r1 = 32
            long r1 = r5 >>> r1
            int r1 = (int) r1
            byte r1 = (byte) r1
            r3[r0] = r1
            int r0 = r4 + 4
            r1 = 24
            long r1 = r5 >>> r1
            int r1 = (int) r1
            byte r1 = (byte) r1
            r3[r0] = r1
            int r0 = r4 + 5
            r1 = 16
            long r1 = r5 >>> r1
            int r1 = (int) r1
            byte r1 = (byte) r1
            r3[r0] = r1
            int r0 = r4 + 6
            r1 = 8
            long r1 = r5 >>> r1
            int r1 = (int) r1
            byte r1 = (byte) r1
            r3[r0] = r1
            int r4 = r4 + 7
            int r5 = (int) r5
            byte r5 = (byte) r5
            r3[r4] = r5
            return
    }

    public static void setLongLE(byte[] r3, int r4, long r5) {
            int r0 = (int) r5
            byte r0 = (byte) r0
            r3[r4] = r0
            int r0 = r4 + 1
            r1 = 8
            long r1 = r5 >>> r1
            int r1 = (int) r1
            byte r1 = (byte) r1
            r3[r0] = r1
            int r0 = r4 + 2
            r1 = 16
            long r1 = r5 >>> r1
            int r1 = (int) r1
            byte r1 = (byte) r1
            r3[r0] = r1
            int r0 = r4 + 3
            r1 = 24
            long r1 = r5 >>> r1
            int r1 = (int) r1
            byte r1 = (byte) r1
            r3[r0] = r1
            int r0 = r4 + 4
            r1 = 32
            long r1 = r5 >>> r1
            int r1 = (int) r1
            byte r1 = (byte) r1
            r3[r0] = r1
            int r0 = r4 + 5
            r1 = 40
            long r1 = r5 >>> r1
            int r1 = (int) r1
            byte r1 = (byte) r1
            r3[r0] = r1
            int r0 = r4 + 6
            r1 = 48
            long r1 = r5 >>> r1
            int r1 = (int) r1
            byte r1 = (byte) r1
            r3[r0] = r1
            int r4 = r4 + 7
            r0 = 56
            long r5 = r5 >>> r0
            int r5 = (int) r5
            byte r5 = (byte) r5
            r3[r4] = r5
            return
    }

    public static void setShortBE(byte[] r1, int r2, short r3) {
            int r0 = r3 >>> 8
            byte r0 = (byte) r0
            r1[r2] = r0
            int r2 = r2 + 1
            byte r3 = (byte) r3
            r1[r2] = r3
            return
    }

    public static void setShortLE(byte[] r1, int r2, short r3) {
            byte r0 = (byte) r3
            r1[r2] = r0
            int r2 = r2 + 1
            int r3 = r3 >>> 8
            byte r3 = (byte) r3
            r1[r2] = r3
            return
    }
}
