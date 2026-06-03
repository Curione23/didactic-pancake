package org.lwjgl.system;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/system/MathUtil.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/system/MathUtil.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/system/MathUtil.class */
public final class MathUtil {
    private MathUtil() {
            r2 = this;
            r0 = r2
            r0.<init>()
            return
    }

    public static boolean mathIsPoT(int r3) {
            r0 = r3
            int r0 = java.lang.Integer.bitCount(r0)
            r1 = 1
            if (r0 != r1) goto Lc
            r0 = 1
            goto Ld
        Lc:
            r0 = 0
        Ld:
            return r0
    }

    public static int mathRoundPoT(int r5) {
            r0 = 1
            r1 = 32
            r2 = r5
            r3 = 1
            int r2 = r2 - r3
            int r2 = java.lang.Integer.numberOfLeadingZeros(r2)
            int r1 = r1 - r2
            int r0 = r0 << r1
            return r0
    }

    public static boolean mathHasZeroByte(int r4) {
            r0 = r4
            r1 = 16843009(0x1010101, float:2.3694278E-38)
            int r0 = r0 - r1
            r1 = r4
            r2 = -1
            r1 = r1 ^ r2
            r0 = r0 & r1
            r1 = -2139062144(0xffffffff80808080, float:-1.180104E-38)
            r0 = r0 & r1
            if (r0 == 0) goto L12
            r0 = 1
            goto L13
        L12:
            r0 = 0
        L13:
            return r0
    }

    public static boolean mathHasZeroByte(long r7) {
            r0 = r7
            r1 = 72340172838076673(0x101010101010101, double:7.748604185489348E-304)
            long r0 = r0 - r1
            r1 = r7
            r2 = -1
            long r1 = r1 ^ r2
            long r0 = r0 & r1
            r1 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r0 = r0 & r1
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto L18
            r0 = 1
            goto L19
        L18:
            r0 = 0
        L19:
            return r0
    }

    public static boolean mathHasZeroShort(int r4) {
            r0 = r4
            r1 = 65537(0x10001, float:9.1837E-41)
            int r0 = r0 - r1
            r1 = r4
            r2 = -1
            r1 = r1 ^ r2
            r0 = r0 & r1
            r1 = -2147450880(0xffffffff80008000, float:-4.5918E-41)
            r0 = r0 & r1
            if (r0 == 0) goto L12
            r0 = 1
            goto L13
        L12:
            r0 = 0
        L13:
            return r0
    }

    public static boolean mathHasZeroShort(long r7) {
            r0 = r7
            r1 = 281479271743489(0x1000100010001, double:1.390692381848706E-309)
            long r0 = r0 - r1
            r1 = r7
            r2 = -1
            long r1 = r1 ^ r2
            long r0 = r0 & r1
            r1 = -9223231297218904064(0x8000800080008000, double:-6.9534619092435E-310)
            long r0 = r0 & r1
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto L18
            r0 = 1
            goto L19
        L18:
            r0 = 0
        L19:
            return r0
    }

    public static long mathMultiplyHighU64(long r9, long r11) {
            r0 = r9
            r1 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r0 = r0 & r1
            r13 = r0
            r0 = r9
            r1 = 32
            long r0 = r0 >>> r1
            r15 = r0
            r0 = r11
            r1 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r0 = r0 & r1
            r17 = r0
            r0 = r11
            r1 = 32
            long r0 = r0 >>> r1
            r19 = r0
            r0 = r15
            r1 = r17
            long r0 = r0 * r1
            r1 = r13
            r2 = r17
            long r1 = r1 * r2
            r2 = 32
            long r1 = r1 >>> r2
            long r0 = r0 + r1
            r21 = r0
            r0 = r15
            r1 = r19
            long r0 = r0 * r1
            r1 = r21
            r2 = 32
            long r1 = r1 >>> r2
            long r0 = r0 + r1
            r1 = r21
            r2 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r1 = r1 & r2
            r2 = r13
            r3 = r19
            long r2 = r2 * r3
            long r1 = r1 + r2
            r2 = 32
            long r1 = r1 >>> r2
            long r0 = r0 + r1
            return r0
    }

    public static long mathMultiplyHighS64(long r9, long r11) {
            r0 = r9
            r1 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r0 = r0 & r1
            r13 = r0
            r0 = r9
            r1 = 32
            long r0 = r0 >> r1
            r15 = r0
            r0 = r11
            r1 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r0 = r0 & r1
            r17 = r0
            r0 = r11
            r1 = 32
            long r0 = r0 >> r1
            r19 = r0
            r0 = r15
            r1 = r17
            long r0 = r0 * r1
            r1 = r13
            r2 = r17
            long r1 = r1 * r2
            r2 = 32
            long r1 = r1 >>> r2
            long r0 = r0 + r1
            r21 = r0
            r0 = r15
            r1 = r19
            long r0 = r0 * r1
            r1 = r21
            r2 = 32
            long r1 = r1 >> r2
            long r0 = r0 + r1
            r1 = r21
            r2 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r1 = r1 & r2
            r2 = r13
            r3 = r19
            long r2 = r2 * r3
            long r1 = r1 + r2
            r2 = 32
            long r1 = r1 >> r2
            long r0 = r0 + r1
            return r0
    }

    public static long mathDivideUnsigned(long r5, long r7) {
            r0 = 0
            r1 = r7
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 > 0) goto L18
            r0 = 0
            r1 = r5
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 > 0) goto L12
            r0 = r5
            r1 = r7
            long r0 = r0 / r1
            goto L17
        L12:
            r0 = r5
            r1 = r7
            long r0 = udivdi3(r0, r1)
        L17:
            return r0
        L18:
            r0 = r5
            r1 = r7
            int r0 = java.lang.Long.compareUnsigned(r0, r1)
            if (r0 >= 0) goto L24
            r0 = 0
            goto L25
        L24:
            r0 = 1
        L25:
            return r0
    }

    public static long mathRemainderUnsigned(long r9, long r11) {
            r0 = 0
            r1 = r9
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 >= 0) goto L10
            r0 = 0
            r1 = r11
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 >= 0) goto L10
            r0 = r9
            r1 = r11
            long r0 = r0 % r1
            return r0
        L10:
            r0 = r9
            r1 = r11
            int r0 = java.lang.Long.compareUnsigned(r0, r1)
            if (r0 >= 0) goto L1c
            r0 = r9
            goto L25
        L1c:
            r0 = r9
            r1 = r11
            r2 = r9
            r3 = r11
            long r2 = udivdi3(r2, r3)
            long r1 = r1 * r2
            long r0 = r0 - r1
        L25:
            return r0
    }

    private static long udivdi3(long r7, long r9) {
            r0 = r9
            r1 = 32
            long r0 = r0 >>> r1
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto L5e
            r0 = r7
            r1 = 32
            long r0 = r0 >>> r1
            r1 = r9
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 >= 0) goto L35
            r0 = r7
            r1 = 1
            long r0 = r0 >>> r1
            r1 = r9
            long r0 = r0 / r1
            r1 = r9
            int r1 = java.lang.Long.numberOfLeadingZeros(r1)
            long r0 = r0 << r1
            r1 = 31
            long r0 = r0 >>> r1
            r11 = r0
            r0 = r7
            r1 = r11
            r2 = r9
            long r1 = r1 * r2
            long r0 = r0 - r1
            r1 = r9
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 < 0) goto L32
            r0 = r11
            r1 = 1
            long r0 = r0 + r1
            r11 = r0
        L32:
            r0 = r11
            return r0
        L35:
            r0 = r7
            r1 = 32
            long r0 = r0 >>> r1
            r11 = r0
            r0 = r11
            r1 = r9
            long r0 = r0 / r1
            r13 = r0
            r0 = r11
            r1 = r13
            r2 = r9
            long r1 = r1 * r2
            long r0 = r0 - r1
            r1 = 32
            long r0 = r0 << r1
            r1 = r7
            r2 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r1 = r1 & r2
            long r0 = r0 | r1
            r1 = r9
            long r0 = r0 / r1
            r15 = r0
            r0 = r13
            r1 = 32
            long r0 = r0 << r1
            r1 = r15
            long r0 = r0 | r1
            return r0
        L5e:
            r0 = r9
            int r0 = java.lang.Long.numberOfLeadingZeros(r0)
            r11 = r0
            r0 = r7
            r1 = 1
            long r0 = r0 >>> r1
            r1 = r9
            r2 = r11
            long r1 = r1 << r2
            r2 = 32
            long r1 = r1 >>> r2
            long r0 = r0 / r1
            r1 = r11
            long r0 = r0 << r1
            r1 = 31
            long r0 = r0 >>> r1
            r12 = r0
            r0 = r12
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto L84
            r0 = r12
            r1 = 1
            long r0 = r0 - r1
            r12 = r0
        L84:
            r0 = r7
            r1 = r12
            r2 = r9
            long r1 = r1 * r2
            long r0 = r0 - r1
            r1 = r9
            int r0 = java.lang.Long.compareUnsigned(r0, r1)
            if (r0 < 0) goto L97
            r0 = r12
            r1 = 1
            long r0 = r0 + r1
            r12 = r0
        L97:
            r0 = r12
            return r0
    }
}
