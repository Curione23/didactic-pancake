package org.lwjgl.system;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/system/MemoryUtilTunables.class */
final class MemoryUtilTunables {
    private static final int FILL_PATTERN_32 = 0;
    private static final long FILL_PATTERN_64 = 0;
    private static final long BASE_OFFSET_BYTE = 0;
    private static final long BASE_OFFSET_SHORT = 0;
    private static final long BASE_OFFSET_INT = 0;
    private static final long BASE_OFFSET_LONG = 0;
    private static final long BASE_OFFSET_FLOAT = 0;
    private static final long BASE_OFFSET_DOUBLE = 0;

    private MemoryUtilTunables() {
            r2 = this;
            r0 = r2
            r0.<init>()
            return
    }

    static void memset(long r6, int r8, long r9) {
            r0 = r9
            r1 = 256(0x100, double:1.265E-321)
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 >= 0) goto L30
            r0 = r6
            int r0 = (int) r0
            r11 = r0
            boolean r0 = org.lwjgl.system.Pointer.BITS64
            if (r0 == 0) goto L21
            r0 = r11
            r1 = 7
            r0 = r0 & r1
            if (r0 != 0) goto L30
            r0 = r6
            r1 = r8
            r2 = r9
            memset64(r0, r1, r2)
            return
        L21:
            r0 = r11
            r1 = 3
            r0 = r0 & r1
            if (r0 != 0) goto L30
            r0 = r11
            r1 = r8
            r2 = r9
            memset32(r0, r1, r2)
            return
        L30:
            r0 = r6
            r1 = r8
            r2 = r9
            long r0 = org.lwjgl.system.libc.LibCString.nmemset(r0, r1, r2)
            return
    }

    private static void memset64(long r7, int r9, long r10) {
            r0 = r10
            int r0 = (int) r0
            r1 = 255(0xff, float:3.57E-43)
            r0 = r0 & r1
            r12 = r0
            r0 = r9
            r1 = 255(0xff, float:3.57E-43)
            r0 = r0 & r1
            long r0 = (long) r0
            long r1 = org.lwjgl.system.MemoryUtilTunables.FILL_PATTERN_64
            long r0 = r0 * r1
            r13 = r0
            r0 = 0
            r15 = r0
            r0 = r12
            r1 = -8
            r0 = r0 & r1
            r16 = r0
        L1e:
            r0 = r15
            r1 = r16
            if (r0 >= r1) goto L39
            sun.misc.Unsafe r0 = org.lwjgl.system.MemoryUtil.UNSAFE
            r1 = 0
            r2 = r7
            r3 = r15
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r13
            r0.putLong(r1, r2, r3)
            int r15 = r15 + 8
            goto L1e
        L39:
            r0 = r15
            r1 = r12
            r2 = -4
            r1 = r1 & r2
            if (r0 >= r1) goto L55
            sun.misc.Unsafe r0 = org.lwjgl.system.MemoryUtil.UNSAFE
            r1 = 0
            r2 = r7
            r3 = r15
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r13
            int r3 = (int) r3
            r0.putInt(r1, r2, r3)
            int r15 = r15 + 4
        L55:
            r0 = r15
            r1 = r12
            r2 = -2
            r1 = r1 & r2
            if (r0 >= r1) goto L72
            sun.misc.Unsafe r0 = org.lwjgl.system.MemoryUtil.UNSAFE
            r1 = 0
            r2 = r7
            r3 = r15
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r13
            int r3 = (int) r3
            short r3 = (short) r3
            r0.putShort(r1, r2, r3)
            int r15 = r15 + 2
        L72:
            r0 = r15
            r1 = r12
            if (r0 >= r1) goto L89
            sun.misc.Unsafe r0 = org.lwjgl.system.MemoryUtil.UNSAFE
            r1 = 0
            r2 = r7
            r3 = r15
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r13
            int r3 = (int) r3
            byte r3 = (byte) r3
            r0.putByte(r1, r2, r3)
        L89:
            return
    }

    private static void memset32(int r6, int r7, long r8) {
            r0 = r8
            int r0 = (int) r0
            r1 = 255(0xff, float:3.57E-43)
            r0 = r0 & r1
            r10 = r0
            r0 = r7
            r1 = 255(0xff, float:3.57E-43)
            r0 = r0 & r1
            int r1 = org.lwjgl.system.MemoryUtilTunables.FILL_PATTERN_32
            int r0 = r0 * r1
            r11 = r0
            r0 = 0
            r12 = r0
            r0 = r10
            r1 = -4
            r0 = r0 & r1
            r13 = r0
        L1d:
            r0 = r12
            r1 = r13
            if (r0 >= r1) goto L3a
            sun.misc.Unsafe r0 = org.lwjgl.system.MemoryUtil.UNSAFE
            r1 = 0
            r2 = r6
            r3 = r12
            int r2 = r2 + r3
            long r2 = java.lang.Integer.toUnsignedLong(r2)
            r3 = r11
            r0.putInt(r1, r2, r3)
            int r12 = r12 + 4
            goto L1d
        L3a:
            r0 = r12
            r1 = r10
            r2 = -2
            r1 = r1 & r2
            if (r0 >= r1) goto L58
            sun.misc.Unsafe r0 = org.lwjgl.system.MemoryUtil.UNSAFE
            r1 = 0
            r2 = r6
            r3 = r12
            int r2 = r2 + r3
            long r2 = java.lang.Integer.toUnsignedLong(r2)
            r3 = r11
            short r3 = (short) r3
            r0.putShort(r1, r2, r3)
            int r12 = r12 + 2
        L58:
            r0 = r12
            r1 = r10
            if (r0 >= r1) goto L70
            sun.misc.Unsafe r0 = org.lwjgl.system.MemoryUtil.UNSAFE
            r1 = 0
            r2 = r6
            r3 = r12
            int r2 = r2 + r3
            long r2 = java.lang.Integer.toUnsignedLong(r2)
            r3 = r11
            byte r3 = (byte) r3
            r0.putByte(r1, r2, r3)
        L70:
            return
    }

    static void memcpy(long r7, long r9, long r11) {
            boolean r0 = org.lwjgl.system.Pointer.BITS64
            if (r0 == 0) goto L23
            r0 = r11
            r1 = 160(0xa0, double:7.9E-322)
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 > 0) goto L23
            r0 = r7
            r1 = r9
            long r0 = r0 | r1
            r1 = 7
            long r0 = r0 & r1
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto L23
            r0 = r7
            r1 = r9
            r2 = r11
            memcpyAligned64(r0, r1, r2)
            return
        L23:
            r0 = r9
            r1 = r7
            r2 = r11
            long r0 = org.lwjgl.system.libc.LibCString.nmemcpy(r0, r1, r2)
            return
    }

    private static void memcpyAligned64(long r11, long r13, long r15) {
            r0 = r15
            int r0 = (int) r0
            r1 = 255(0xff, float:3.57E-43)
            r0 = r0 & r1
            r17 = r0
            r0 = 0
            r18 = r0
            r0 = r17
            r1 = -8
            r0 = r0 & r1
            r19 = r0
        L13:
            r0 = r18
            r1 = r19
            if (r0 >= r1) goto L38
            sun.misc.Unsafe r0 = org.lwjgl.system.MemoryUtil.UNSAFE
            r1 = 0
            r2 = r13
            r3 = r18
            long r3 = (long) r3
            long r2 = r2 + r3
            sun.misc.Unsafe r3 = org.lwjgl.system.MemoryUtil.UNSAFE
            r4 = 0
            r5 = r11
            r6 = r18
            long r6 = (long) r6
            long r5 = r5 + r6
            long r3 = r3.getLong(r4, r5)
            r0.putLong(r1, r2, r3)
            int r18 = r18 + 8
            goto L13
        L38:
            r0 = r18
            r1 = r17
            r2 = -4
            r1 = r1 & r2
            if (r0 >= r1) goto L5d
            sun.misc.Unsafe r0 = org.lwjgl.system.MemoryUtil.UNSAFE
            r1 = 0
            r2 = r13
            r3 = r18
            long r3 = (long) r3
            long r2 = r2 + r3
            sun.misc.Unsafe r3 = org.lwjgl.system.MemoryUtil.UNSAFE
            r4 = 0
            r5 = r11
            r6 = r18
            long r6 = (long) r6
            long r5 = r5 + r6
            int r3 = r3.getInt(r4, r5)
            r0.putInt(r1, r2, r3)
            int r18 = r18 + 4
        L5d:
            r0 = r18
            r1 = r17
            r2 = -2
            r1 = r1 & r2
            if (r0 >= r1) goto L82
            sun.misc.Unsafe r0 = org.lwjgl.system.MemoryUtil.UNSAFE
            r1 = 0
            r2 = r13
            r3 = r18
            long r3 = (long) r3
            long r2 = r2 + r3
            sun.misc.Unsafe r3 = org.lwjgl.system.MemoryUtil.UNSAFE
            r4 = 0
            r5 = r11
            r6 = r18
            long r6 = (long) r6
            long r5 = r5 + r6
            short r3 = r3.getShort(r4, r5)
            r0.putShort(r1, r2, r3)
            int r18 = r18 + 2
        L82:
            r0 = r18
            r1 = r17
            if (r0 >= r1) goto La1
            sun.misc.Unsafe r0 = org.lwjgl.system.MemoryUtil.UNSAFE
            r1 = 0
            r2 = r13
            r3 = r18
            long r3 = (long) r3
            long r2 = r2 + r3
            sun.misc.Unsafe r3 = org.lwjgl.system.MemoryUtil.UNSAFE
            r4 = 0
            r5 = r11
            r6 = r18
            long r6 = (long) r6
            long r5 = r5 + r6
            byte r3 = r3.getByte(r4, r5)
            r0.putByte(r1, r2, r3)
        La1:
            return
    }

    static void memcpy(byte[] r10, long r11, int r13, int r14) {
            r0 = r11
            r1 = r13
            r2 = r14
            r3 = r10
            int r3 = r3.length
            org.lwjgl.system.Checks.checkMemcpy(r0, r1, r2, r3)
            sun.misc.Unsafe r0 = org.lwjgl.system.MemoryUtil.UNSAFE
            r1 = r10
            long r2 = org.lwjgl.system.MemoryUtilTunables.BASE_OFFSET_BYTE
            r3 = r13
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = 0
            r4 = r11
            r5 = r14
            long r5 = (long) r5
            r0.copyMemory(r1, r2, r3, r4, r5)
            return
    }

    static void memcpy(short[] r10, long r11, int r13, int r14) {
            r0 = r11
            r1 = r13
            r2 = r14
            r3 = r10
            int r3 = r3.length
            org.lwjgl.system.Checks.checkMemcpy(r0, r1, r2, r3)
            sun.misc.Unsafe r0 = org.lwjgl.system.MemoryUtil.UNSAFE
            r1 = r10
            long r2 = org.lwjgl.system.MemoryUtilTunables.BASE_OFFSET_SHORT
            r3 = r13
            r4 = 1
            long r3 = org.lwjgl.system.APIUtil.apiGetBytes(r3, r4)
            long r2 = r2 + r3
            r3 = 0
            r4 = r11
            r5 = r14
            r6 = 1
            long r5 = org.lwjgl.system.APIUtil.apiGetBytes(r5, r6)
            r0.copyMemory(r1, r2, r3, r4, r5)
            return
    }

    static void memcpy(int[] r10, long r11, int r13, int r14) {
            r0 = r11
            r1 = r13
            r2 = r14
            r3 = r10
            int r3 = r3.length
            org.lwjgl.system.Checks.checkMemcpy(r0, r1, r2, r3)
            sun.misc.Unsafe r0 = org.lwjgl.system.MemoryUtil.UNSAFE
            r1 = r10
            long r2 = org.lwjgl.system.MemoryUtilTunables.BASE_OFFSET_INT
            r3 = r13
            r4 = 2
            long r3 = org.lwjgl.system.APIUtil.apiGetBytes(r3, r4)
            long r2 = r2 + r3
            r3 = 0
            r4 = r11
            r5 = r14
            r6 = 2
            long r5 = org.lwjgl.system.APIUtil.apiGetBytes(r5, r6)
            r0.copyMemory(r1, r2, r3, r4, r5)
            return
    }

    static void memcpy(long[] r10, long r11, int r13, int r14) {
            r0 = r11
            r1 = r13
            r2 = r14
            r3 = r10
            int r3 = r3.length
            org.lwjgl.system.Checks.checkMemcpy(r0, r1, r2, r3)
            sun.misc.Unsafe r0 = org.lwjgl.system.MemoryUtil.UNSAFE
            r1 = r10
            long r2 = org.lwjgl.system.MemoryUtilTunables.BASE_OFFSET_LONG
            r3 = r13
            r4 = 3
            long r3 = org.lwjgl.system.APIUtil.apiGetBytes(r3, r4)
            long r2 = r2 + r3
            r3 = 0
            r4 = r11
            r5 = r14
            r6 = 3
            long r5 = org.lwjgl.system.APIUtil.apiGetBytes(r5, r6)
            r0.copyMemory(r1, r2, r3, r4, r5)
            return
    }

    static void memcpy(float[] r10, long r11, int r13, int r14) {
            r0 = r11
            r1 = r13
            r2 = r14
            r3 = r10
            int r3 = r3.length
            org.lwjgl.system.Checks.checkMemcpy(r0, r1, r2, r3)
            sun.misc.Unsafe r0 = org.lwjgl.system.MemoryUtil.UNSAFE
            r1 = r10
            long r2 = org.lwjgl.system.MemoryUtilTunables.BASE_OFFSET_FLOAT
            r3 = r13
            r4 = 2
            long r3 = org.lwjgl.system.APIUtil.apiGetBytes(r3, r4)
            long r2 = r2 + r3
            r3 = 0
            r4 = r11
            r5 = r14
            r6 = 2
            long r5 = org.lwjgl.system.APIUtil.apiGetBytes(r5, r6)
            r0.copyMemory(r1, r2, r3, r4, r5)
            return
    }

    static void memcpy(double[] r10, long r11, int r13, int r14) {
            r0 = r11
            r1 = r13
            r2 = r14
            r3 = r10
            int r3 = r3.length
            org.lwjgl.system.Checks.checkMemcpy(r0, r1, r2, r3)
            sun.misc.Unsafe r0 = org.lwjgl.system.MemoryUtil.UNSAFE
            r1 = r10
            long r2 = org.lwjgl.system.MemoryUtilTunables.BASE_OFFSET_DOUBLE
            r3 = r13
            r4 = 3
            long r3 = org.lwjgl.system.APIUtil.apiGetBytes(r3, r4)
            long r2 = r2 + r3
            r3 = 0
            r4 = r11
            r5 = r14
            r6 = 3
            long r5 = org.lwjgl.system.APIUtil.apiGetBytes(r5, r6)
            r0.copyMemory(r1, r2, r3, r4, r5)
            return
    }

    static void memcpy(long r10, byte[] r12, int r13, int r14) {
            r0 = r10
            r1 = r13
            r2 = r14
            r3 = r12
            int r3 = r3.length
            org.lwjgl.system.Checks.checkMemcpy(r0, r1, r2, r3)
            sun.misc.Unsafe r0 = org.lwjgl.system.MemoryUtil.UNSAFE
            r1 = 0
            r2 = r10
            r3 = r12
            long r4 = org.lwjgl.system.MemoryUtilTunables.BASE_OFFSET_BYTE
            r5 = r13
            long r5 = (long) r5
            long r4 = r4 + r5
            r5 = r14
            long r5 = (long) r5
            r0.copyMemory(r1, r2, r3, r4, r5)
            return
    }

    static void memcpy(long r10, short[] r12, int r13, int r14) {
            r0 = r10
            r1 = r13
            r2 = r14
            r3 = r12
            int r3 = r3.length
            org.lwjgl.system.Checks.checkMemcpy(r0, r1, r2, r3)
            sun.misc.Unsafe r0 = org.lwjgl.system.MemoryUtil.UNSAFE
            r1 = 0
            r2 = r10
            r3 = r12
            long r4 = org.lwjgl.system.MemoryUtilTunables.BASE_OFFSET_SHORT
            r5 = r13
            r6 = 1
            long r5 = org.lwjgl.system.APIUtil.apiGetBytes(r5, r6)
            long r4 = r4 + r5
            r5 = r14
            r6 = 1
            long r5 = org.lwjgl.system.APIUtil.apiGetBytes(r5, r6)
            r0.copyMemory(r1, r2, r3, r4, r5)
            return
    }

    static void memcpy(long r10, int[] r12, int r13, int r14) {
            r0 = r10
            r1 = r13
            r2 = r14
            r3 = r12
            int r3 = r3.length
            org.lwjgl.system.Checks.checkMemcpy(r0, r1, r2, r3)
            sun.misc.Unsafe r0 = org.lwjgl.system.MemoryUtil.UNSAFE
            r1 = 0
            r2 = r10
            r3 = r12
            long r4 = org.lwjgl.system.MemoryUtilTunables.BASE_OFFSET_INT
            r5 = r13
            r6 = 2
            long r5 = org.lwjgl.system.APIUtil.apiGetBytes(r5, r6)
            long r4 = r4 + r5
            r5 = r14
            r6 = 2
            long r5 = org.lwjgl.system.APIUtil.apiGetBytes(r5, r6)
            r0.copyMemory(r1, r2, r3, r4, r5)
            return
    }

    static void memcpy(long r10, long[] r12, int r13, int r14) {
            r0 = r10
            r1 = r13
            r2 = r14
            r3 = r12
            int r3 = r3.length
            org.lwjgl.system.Checks.checkMemcpy(r0, r1, r2, r3)
            sun.misc.Unsafe r0 = org.lwjgl.system.MemoryUtil.UNSAFE
            r1 = 0
            r2 = r10
            r3 = r12
            long r4 = org.lwjgl.system.MemoryUtilTunables.BASE_OFFSET_LONG
            r5 = r13
            r6 = 3
            long r5 = org.lwjgl.system.APIUtil.apiGetBytes(r5, r6)
            long r4 = r4 + r5
            r5 = r14
            r6 = 3
            long r5 = org.lwjgl.system.APIUtil.apiGetBytes(r5, r6)
            r0.copyMemory(r1, r2, r3, r4, r5)
            return
    }

    static void memcpy(long r10, float[] r12, int r13, int r14) {
            r0 = r10
            r1 = r13
            r2 = r14
            r3 = r12
            int r3 = r3.length
            org.lwjgl.system.Checks.checkMemcpy(r0, r1, r2, r3)
            sun.misc.Unsafe r0 = org.lwjgl.system.MemoryUtil.UNSAFE
            r1 = 0
            r2 = r10
            r3 = r12
            long r4 = org.lwjgl.system.MemoryUtilTunables.BASE_OFFSET_FLOAT
            r5 = r13
            r6 = 2
            long r5 = org.lwjgl.system.APIUtil.apiGetBytes(r5, r6)
            long r4 = r4 + r5
            r5 = r14
            r6 = 2
            long r5 = org.lwjgl.system.APIUtil.apiGetBytes(r5, r6)
            r0.copyMemory(r1, r2, r3, r4, r5)
            return
    }

    static void memcpy(long r10, double[] r12, int r13, int r14) {
            r0 = r10
            r1 = r13
            r2 = r14
            r3 = r12
            int r3 = r3.length
            org.lwjgl.system.Checks.checkMemcpy(r0, r1, r2, r3)
            sun.misc.Unsafe r0 = org.lwjgl.system.MemoryUtil.UNSAFE
            r1 = 0
            r2 = r10
            r3 = r12
            long r4 = org.lwjgl.system.MemoryUtilTunables.BASE_OFFSET_DOUBLE
            r5 = r13
            r6 = 3
            long r5 = org.lwjgl.system.APIUtil.apiGetBytes(r5, r6)
            long r4 = r4 + r5
            r5 = r14
            r6 = 3
            long r5 = org.lwjgl.system.APIUtil.apiGetBytes(r5, r6)
            r0.copyMemory(r1, r2, r3, r4, r5)
            return
    }

    static {
            r0 = -1
            r1 = 255(0xff, float:3.57E-43)
            int r0 = java.lang.Integer.divideUnsigned(r0, r1)
            org.lwjgl.system.MemoryUtilTunables.FILL_PATTERN_32 = r0
            r0 = -1
            r1 = 255(0xff, double:1.26E-321)
            long r0 = java.lang.Long.divideUnsigned(r0, r1)
            org.lwjgl.system.MemoryUtilTunables.FILL_PATTERN_64 = r0
            int r0 = sun.misc.Unsafe.ARRAY_BYTE_BASE_OFFSET
            long r0 = java.lang.Integer.toUnsignedLong(r0)
            org.lwjgl.system.MemoryUtilTunables.BASE_OFFSET_BYTE = r0
            int r0 = sun.misc.Unsafe.ARRAY_SHORT_BASE_OFFSET
            long r0 = java.lang.Integer.toUnsignedLong(r0)
            org.lwjgl.system.MemoryUtilTunables.BASE_OFFSET_SHORT = r0
            int r0 = sun.misc.Unsafe.ARRAY_INT_BASE_OFFSET
            long r0 = java.lang.Integer.toUnsignedLong(r0)
            org.lwjgl.system.MemoryUtilTunables.BASE_OFFSET_INT = r0
            int r0 = sun.misc.Unsafe.ARRAY_LONG_BASE_OFFSET
            long r0 = java.lang.Integer.toUnsignedLong(r0)
            org.lwjgl.system.MemoryUtilTunables.BASE_OFFSET_LONG = r0
            int r0 = sun.misc.Unsafe.ARRAY_FLOAT_BASE_OFFSET
            long r0 = java.lang.Integer.toUnsignedLong(r0)
            org.lwjgl.system.MemoryUtilTunables.BASE_OFFSET_FLOAT = r0
            int r0 = sun.misc.Unsafe.ARRAY_DOUBLE_BASE_OFFSET
            long r0 = java.lang.Integer.toUnsignedLong(r0)
            org.lwjgl.system.MemoryUtilTunables.BASE_OFFSET_DOUBLE = r0
            return
    }
}
