package org.lwjgl.system;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/system/Checks.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/system/Checks.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/system/Checks.class */
public final class Checks {
    public static final boolean CHECKS = false;
    public static final boolean DEBUG = false;
    public static final boolean DEBUG_FUNCTIONS = false;

    private Checks() {
            r2 = this;
            r0 = r2
            r0.<init>()
            return
    }

    public static int lengthSafe(@javax.annotation.Nullable short[] r2) {
            r0 = r2
            if (r0 != 0) goto L8
            r0 = 0
            goto La
        L8:
            r0 = r2
            int r0 = r0.length
        La:
            return r0
    }

    public static int lengthSafe(@javax.annotation.Nullable int[] r2) {
            r0 = r2
            if (r0 != 0) goto L8
            r0 = 0
            goto La
        L8:
            r0 = r2
            int r0 = r0.length
        La:
            return r0
    }

    public static int lengthSafe(@javax.annotation.Nullable long[] r2) {
            r0 = r2
            if (r0 != 0) goto L8
            r0 = 0
            goto La
        L8:
            r0 = r2
            int r0 = r0.length
        La:
            return r0
    }

    public static int lengthSafe(@javax.annotation.Nullable float[] r2) {
            r0 = r2
            if (r0 != 0) goto L8
            r0 = 0
            goto La
        L8:
            r0 = r2
            int r0 = r0.length
        La:
            return r0
    }

    public static int lengthSafe(@javax.annotation.Nullable double[] r2) {
            r0 = r2
            if (r0 != 0) goto L8
            r0 = 0
            goto La
        L8:
            r0 = r2
            int r0 = r0.length
        La:
            return r0
    }

    public static int remainingSafe(@javax.annotation.Nullable java.nio.Buffer r2) {
            r0 = r2
            if (r0 != 0) goto L8
            r0 = 0
            goto Lc
        L8:
            r0 = r2
            int r0 = r0.remaining()
        Lc:
            return r0
    }

    public static int remainingSafe(@javax.annotation.Nullable org.lwjgl.system.CustomBuffer<?> r2) {
            r0 = r2
            if (r0 != 0) goto L8
            r0 = 0
            goto Lc
        L8:
            r0 = r2
            int r0 = r0.remaining()
        Lc:
            return r0
    }

    public static boolean checkFunctions(long... r5) {
            r0 = r5
            r6 = r0
            r0 = r6
            int r0 = r0.length
            r7 = r0
            r0 = 0
            r8 = r0
        L7:
            r0 = r8
            r1 = r7
            if (r0 >= r1) goto L20
            r0 = r6
            r1 = r8
            r0 = r0[r1]
            r9 = r0
            r0 = r9
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto L1a
            r0 = 0
            return r0
        L1a:
            int r8 = r8 + 1
            goto L7
        L20:
            r0 = 1
            return r0
    }

    public static boolean checkFunctions(org.lwjgl.system.FunctionProvider r5, org.lwjgl.PointerBuffer r6, int[] r7, java.lang.String... r8) {
            r0 = 1
            r9 = r0
            r0 = 0
            r10 = r0
        L6:
            r0 = r10
            r1 = r7
            int r1 = r1.length
            if (r0 >= r1) goto L4e
            r0 = r7
            r1 = r10
            r0 = r0[r1]
            r11 = r0
            r0 = r11
            if (r0 < 0) goto L48
            r0 = r6
            r1 = r11
            long r0 = r0.get(r1)
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto L26
            goto L48
        L26:
            r0 = r5
            r1 = r8
            r2 = r10
            r1 = r1[r2]
            long r0 = r0.getFunctionAddress(r1)
            r12 = r0
            r0 = r12
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto L3f
            r0 = 0
            r9 = r0
            goto L48
        L3f:
            r0 = r6
            r1 = r11
            r2 = r12
            org.lwjgl.PointerBuffer r0 = r0.put(r1, r2)
        L48:
            int r10 = r10 + 1
            goto L6
        L4e:
            r0 = 1
            return r0
    }

    public static boolean checkFunctions(org.lwjgl.system.FunctionProviderLocal r6, long r7, org.lwjgl.PointerBuffer r9, int[] r10, java.lang.String... r11) {
            r0 = 1
            r12 = r0
            r0 = 0
            r13 = r0
        L6:
            r0 = r13
            r1 = r10
            int r1 = r1.length
            if (r0 >= r1) goto L52
            r0 = r10
            r1 = r13
            r0 = r0[r1]
            r14 = r0
            r0 = r14
            if (r0 < 0) goto L4c
            r0 = r9
            r1 = r14
            long r0 = r0.get(r1)
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto L28
            goto L4c
        L28:
            r0 = r6
            r1 = r7
            r2 = r11
            r3 = r13
            r2 = r2[r3]
            long r0 = r0.getFunctionAddress(r1, r2)
            r15 = r0
            r0 = r15
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto L49
            r0 = r9
            r1 = r14
            r2 = r15
            org.lwjgl.PointerBuffer r0 = r0.put(r1, r2)
            goto L4c
        L49:
            r0 = 0
            r12 = r0
        L4c:
            int r13 = r13 + 1
            goto L6
        L52:
            r0 = r12
            return r0
    }

    public static boolean checkFunctions(org.lwjgl.system.FunctionProvider r5, long[] r6, int[] r7, java.lang.String... r8) {
            r0 = 1
            r9 = r0
            r0 = 0
            r10 = r0
        L6:
            r0 = r10
            r1 = r7
            int r1 = r1.length
            if (r0 >= r1) goto L49
            r0 = r7
            r1 = r10
            r0 = r0[r1]
            r11 = r0
            r0 = r11
            if (r0 < 0) goto L43
            r0 = r6
            r1 = r11
            r0 = r0[r1]
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto L24
            goto L43
        L24:
            r0 = r5
            r1 = r8
            r2 = r10
            r1 = r1[r2]
            long r0 = r0.getFunctionAddress(r1)
            r12 = r0
            r0 = r12
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto L3d
            r0 = 0
            r9 = r0
            goto L43
        L3d:
            r0 = r6
            r1 = r11
            r2 = r12
            r0[r1] = r2
        L43:
            int r10 = r10 + 1
            goto L6
        L49:
            r0 = 1
            return r0
    }

    public static boolean reportMissing(java.lang.String r3, java.lang.String r4) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = r0
            r1.<init>()
            java.lang.String r1 = "["
            java.lang.StringBuilder r0 = r0.append(r1)
            r1 = r3
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = "] "
            java.lang.StringBuilder r0 = r0.append(r1)
            r1 = r4
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = " was reported as available but an entry point is missing."
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            org.lwjgl.system.APIUtil.apiLog(r0)
            r0 = 1
            return r0
    }

    public static long check(long r5) {
            r0 = r5
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto Le
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            r1 = r0
            r1.<init>()
            throw r0
        Le:
            r0 = r5
            return r0
    }

    private static void assertNT(boolean r4) {
            r0 = r4
            if (r0 != 0) goto Le
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r1 = r0
            java.lang.String r2 = "Missing termination"
            r1.<init>(r2)
            throw r0
        Le:
            return
    }

    public static void checkNT(int[] r4) {
            r0 = r4
            int r0 = r0.length
            r1 = 1
            checkBuffer(r0, r1)
            r0 = r4
            r1 = r4
            int r1 = r1.length
            r2 = 1
            int r1 = r1 - r2
            r0 = r0[r1]
            if (r0 != 0) goto L13
            r0 = 1
            goto L14
        L13:
            r0 = 0
        L14:
            assertNT(r0)
            return
    }

    public static void checkNT(int[] r4, int r5) {
            r0 = r4
            int r0 = r0.length
            r1 = 1
            checkBuffer(r0, r1)
            r0 = r4
            r1 = r4
            int r1 = r1.length
            r2 = 1
            int r1 = r1 - r2
            r0 = r0[r1]
            r1 = r5
            if (r0 != r1) goto L14
            r0 = 1
            goto L15
        L14:
            r0 = 0
        L15:
            assertNT(r0)
            return
    }

    public static void checkNT(long[] r5) {
            r0 = r5
            int r0 = r0.length
            r1 = 1
            checkBuffer(r0, r1)
            r0 = r5
            r1 = r5
            int r1 = r1.length
            r2 = 1
            int r1 = r1 - r2
            r0 = r0[r1]
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto L15
            r0 = 1
            goto L16
        L15:
            r0 = 0
        L16:
            assertNT(r0)
            return
    }

    public static void checkNT(float[] r4) {
            r0 = r4
            int r0 = r0.length
            r1 = 1
            checkBuffer(r0, r1)
            r0 = r4
            r1 = r4
            int r1 = r1.length
            r2 = 1
            int r1 = r1 - r2
            r0 = r0[r1]
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto L15
            r0 = 1
            goto L16
        L15:
            r0 = 0
        L16:
            assertNT(r0)
            return
    }

    public static void checkNT1(java.nio.ByteBuffer r4) {
            r0 = r4
            int r0 = r0.remaining()
            r1 = 1
            checkBuffer(r0, r1)
            r0 = r4
            r1 = r4
            int r1 = r1.limit()
            r2 = 1
            int r1 = r1 - r2
            byte r0 = r0.get(r1)
            if (r0 != 0) goto L19
            r0 = 1
            goto L1a
        L19:
            r0 = 0
        L1a:
            assertNT(r0)
            return
    }

    public static void checkNT2(java.nio.ByteBuffer r4) {
            r0 = r4
            int r0 = r0.remaining()
            r1 = 2
            checkBuffer(r0, r1)
            r0 = r4
            r1 = r4
            int r1 = r1.limit()
            r2 = 2
            int r1 = r1 - r2
            byte r0 = r0.get(r1)
            if (r0 != 0) goto L19
            r0 = 1
            goto L1a
        L19:
            r0 = 0
        L1a:
            assertNT(r0)
            return
    }

    public static void checkNT(java.nio.IntBuffer r4) {
            r0 = r4
            int r0 = r0.remaining()
            r1 = 1
            checkBuffer(r0, r1)
            r0 = r4
            r1 = r4
            int r1 = r1.limit()
            r2 = 1
            int r1 = r1 - r2
            int r0 = r0.get(r1)
            if (r0 != 0) goto L19
            r0 = 1
            goto L1a
        L19:
            r0 = 0
        L1a:
            assertNT(r0)
            return
    }

    public static void checkNT(java.nio.IntBuffer r4, int r5) {
            r0 = r4
            int r0 = r0.remaining()
            r1 = 1
            checkBuffer(r0, r1)
            r0 = r4
            r1 = r4
            int r1 = r1.limit()
            r2 = 1
            int r1 = r1 - r2
            int r0 = r0.get(r1)
            r1 = r5
            if (r0 != r1) goto L1a
            r0 = 1
            goto L1b
        L1a:
            r0 = 0
        L1b:
            assertNT(r0)
            return
    }

    public static void checkNT(java.nio.LongBuffer r5) {
            r0 = r5
            int r0 = r0.remaining()
            r1 = 1
            checkBuffer(r0, r1)
            r0 = r5
            r1 = r5
            int r1 = r1.limit()
            r2 = 1
            int r1 = r1 - r2
            long r0 = r0.get(r1)
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto L1b
            r0 = 1
            goto L1c
        L1b:
            r0 = 0
        L1c:
            assertNT(r0)
            return
    }

    public static void checkNT(java.nio.FloatBuffer r4) {
            r0 = r4
            int r0 = r0.remaining()
            r1 = 1
            checkBuffer(r0, r1)
            r0 = r4
            r1 = r4
            int r1 = r1.limit()
            r2 = 1
            int r1 = r1 - r2
            float r0 = r0.get(r1)
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto L1b
            r0 = 1
            goto L1c
        L1b:
            r0 = 0
        L1c:
            assertNT(r0)
            return
    }

    public static void checkNT(org.lwjgl.PointerBuffer r5) {
            r0 = r5
            int r0 = r0.remaining()
            r1 = 1
            checkBuffer(r0, r1)
            r0 = r5
            r1 = r5
            int r1 = r1.limit()
            r2 = 1
            int r1 = r1 - r2
            long r0 = r0.get(r1)
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto L1b
            r0 = 1
            goto L1c
        L1b:
            r0 = 0
        L1c:
            assertNT(r0)
            return
    }

    public static void checkNT(org.lwjgl.PointerBuffer r5, long r6) {
            r0 = r5
            int r0 = r0.remaining()
            r1 = 1
            checkBuffer(r0, r1)
            r0 = r5
            r1 = r5
            int r1 = r1.limit()
            r2 = 1
            int r1 = r1 - r2
            long r0 = r0.get(r1)
            r1 = r6
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto L1b
            r0 = 1
            goto L1c
        L1b:
            r0 = 0
        L1c:
            assertNT(r0)
            return
    }

    public static void checkNTSafe(@javax.annotation.Nullable int[] r4) {
            r0 = r4
            if (r0 == 0) goto L1b
            r0 = r4
            int r0 = r0.length
            r1 = 1
            checkBuffer(r0, r1)
            r0 = r4
            r1 = r4
            int r1 = r1.length
            r2 = 1
            int r1 = r1 - r2
            r0 = r0[r1]
            if (r0 != 0) goto L17
            r0 = 1
            goto L18
        L17:
            r0 = 0
        L18:
            assertNT(r0)
        L1b:
            return
    }

    public static void checkNTSafe(@javax.annotation.Nullable int[] r4, int r5) {
            r0 = r4
            if (r0 == 0) goto L1c
            r0 = r4
            int r0 = r0.length
            r1 = 1
            checkBuffer(r0, r1)
            r0 = r4
            r1 = r4
            int r1 = r1.length
            r2 = 1
            int r1 = r1 - r2
            r0 = r0[r1]
            r1 = r5
            if (r0 != r1) goto L18
            r0 = 1
            goto L19
        L18:
            r0 = 0
        L19:
            assertNT(r0)
        L1c:
            return
    }

    public static void checkNTSafe(@javax.annotation.Nullable long[] r5) {
            r0 = r5
            if (r0 == 0) goto L1d
            r0 = r5
            int r0 = r0.length
            r1 = 1
            checkBuffer(r0, r1)
            r0 = r5
            r1 = r5
            int r1 = r1.length
            r2 = 1
            int r1 = r1 - r2
            r0 = r0[r1]
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto L19
            r0 = 1
            goto L1a
        L19:
            r0 = 0
        L1a:
            assertNT(r0)
        L1d:
            return
    }

    public static void checkNTSafe(@javax.annotation.Nullable float[] r4) {
            r0 = r4
            if (r0 == 0) goto L1d
            r0 = r4
            int r0 = r0.length
            r1 = 1
            checkBuffer(r0, r1)
            r0 = r4
            r1 = r4
            int r1 = r1.length
            r2 = 1
            int r1 = r1 - r2
            r0 = r0[r1]
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto L19
            r0 = 1
            goto L1a
        L19:
            r0 = 0
        L1a:
            assertNT(r0)
        L1d:
            return
    }

    public static void checkNT1Safe(@javax.annotation.Nullable java.nio.ByteBuffer r4) {
            r0 = r4
            if (r0 == 0) goto L21
            r0 = r4
            int r0 = r0.remaining()
            r1 = 1
            checkBuffer(r0, r1)
            r0 = r4
            r1 = r4
            int r1 = r1.limit()
            r2 = 1
            int r1 = r1 - r2
            byte r0 = r0.get(r1)
            if (r0 != 0) goto L1d
            r0 = 1
            goto L1e
        L1d:
            r0 = 0
        L1e:
            assertNT(r0)
        L21:
            return
    }

    public static void checkNT2Safe(@javax.annotation.Nullable java.nio.ByteBuffer r4) {
            r0 = r4
            if (r0 == 0) goto L21
            r0 = r4
            int r0 = r0.remaining()
            r1 = 2
            checkBuffer(r0, r1)
            r0 = r4
            r1 = r4
            int r1 = r1.limit()
            r2 = 2
            int r1 = r1 - r2
            byte r0 = r0.get(r1)
            if (r0 != 0) goto L1d
            r0 = 1
            goto L1e
        L1d:
            r0 = 0
        L1e:
            assertNT(r0)
        L21:
            return
    }

    public static void checkNTSafe(@javax.annotation.Nullable java.nio.IntBuffer r4) {
            r0 = r4
            if (r0 == 0) goto L21
            r0 = r4
            int r0 = r0.remaining()
            r1 = 1
            checkBuffer(r0, r1)
            r0 = r4
            r1 = r4
            int r1 = r1.limit()
            r2 = 1
            int r1 = r1 - r2
            int r0 = r0.get(r1)
            if (r0 != 0) goto L1d
            r0 = 1
            goto L1e
        L1d:
            r0 = 0
        L1e:
            assertNT(r0)
        L21:
            return
    }

    public static void checkNTSafe(@javax.annotation.Nullable java.nio.IntBuffer r4, int r5) {
            r0 = r4
            if (r0 == 0) goto L22
            r0 = r4
            int r0 = r0.remaining()
            r1 = 1
            checkBuffer(r0, r1)
            r0 = r4
            r1 = r4
            int r1 = r1.limit()
            r2 = 1
            int r1 = r1 - r2
            int r0 = r0.get(r1)
            r1 = r5
            if (r0 != r1) goto L1e
            r0 = 1
            goto L1f
        L1e:
            r0 = 0
        L1f:
            assertNT(r0)
        L22:
            return
    }

    public static void checkNTSafe(@javax.annotation.Nullable java.nio.LongBuffer r5) {
            r0 = r5
            if (r0 == 0) goto L23
            r0 = r5
            int r0 = r0.remaining()
            r1 = 1
            checkBuffer(r0, r1)
            r0 = r5
            r1 = r5
            int r1 = r1.limit()
            r2 = 1
            int r1 = r1 - r2
            long r0 = r0.get(r1)
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto L1f
            r0 = 1
            goto L20
        L1f:
            r0 = 0
        L20:
            assertNT(r0)
        L23:
            return
    }

    public static void checkNTSafe(@javax.annotation.Nullable java.nio.FloatBuffer r4) {
            r0 = r4
            if (r0 == 0) goto L23
            r0 = r4
            int r0 = r0.remaining()
            r1 = 1
            checkBuffer(r0, r1)
            r0 = r4
            r1 = r4
            int r1 = r1.limit()
            r2 = 1
            int r1 = r1 - r2
            float r0 = r0.get(r1)
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto L1f
            r0 = 1
            goto L20
        L1f:
            r0 = 0
        L20:
            assertNT(r0)
        L23:
            return
    }

    public static void checkNTSafe(@javax.annotation.Nullable org.lwjgl.PointerBuffer r5) {
            r0 = r5
            if (r0 == 0) goto L23
            r0 = r5
            int r0 = r0.remaining()
            r1 = 1
            checkBuffer(r0, r1)
            r0 = r5
            r1 = r5
            int r1 = r1.limit()
            r2 = 1
            int r1 = r1 - r2
            long r0 = r0.get(r1)
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto L1f
            r0 = 1
            goto L20
        L1f:
            r0 = 0
        L20:
            assertNT(r0)
        L23:
            return
    }

    public static void checkNTSafe(@javax.annotation.Nullable org.lwjgl.PointerBuffer r5, long r6) {
            r0 = r5
            if (r0 == 0) goto L23
            r0 = r5
            int r0 = r0.remaining()
            r1 = 1
            checkBuffer(r0, r1)
            r0 = r5
            r1 = r5
            int r1 = r1.limit()
            r2 = 1
            int r1 = r1 - r2
            long r0 = r0.get(r1)
            r1 = r6
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto L1f
            r0 = 1
            goto L20
        L1f:
            r0 = 0
        L20:
            assertNT(r0)
        L23:
            return
    }

    private static void checkBuffer(int r3, int r4) {
            r0 = r3
            r1 = r4
            if (r0 >= r1) goto La
            r0 = r3
            r1 = r4
            throwIAE(r0, r1)
        La:
            return
    }

    public static void check(byte[] r3, int r4) {
            r0 = r3
            int r0 = r0.length
            r1 = r4
            checkBuffer(r0, r1)
            return
    }

    public static void check(short[] r3, int r4) {
            r0 = r3
            int r0 = r0.length
            r1 = r4
            checkBuffer(r0, r1)
            return
    }

    public static void check(int[] r3, int r4) {
            r0 = r3
            int r0 = r0.length
            r1 = r4
            checkBuffer(r0, r1)
            return
    }

    public static void check(long[] r3, int r4) {
            r0 = r3
            int r0 = r0.length
            r1 = r4
            checkBuffer(r0, r1)
            return
    }

    public static void check(float[] r3, int r4) {
            r0 = r3
            int r0 = r0.length
            r1 = r4
            checkBuffer(r0, r1)
            return
    }

    public static void check(double[] r3, int r4) {
            r0 = r3
            int r0 = r0.length
            r1 = r4
            checkBuffer(r0, r1)
            return
    }

    public static void check(java.lang.CharSequence r3, int r4) {
            r0 = r3
            int r0 = r0.length()
            r1 = r4
            checkBuffer(r0, r1)
            return
    }

    public static void check(java.nio.Buffer r3, int r4) {
            r0 = r3
            int r0 = r0.remaining()
            r1 = r4
            checkBuffer(r0, r1)
            return
    }

    public static void check(java.nio.Buffer r4, long r5) {
            r0 = r4
            int r0 = r0.remaining()
            r1 = r5
            int r1 = (int) r1
            checkBuffer(r0, r1)
            return
    }

    public static void check(org.lwjgl.system.CustomBuffer<?> r3, int r4) {
            r0 = r3
            int r0 = r0.remaining()
            r1 = r4
            checkBuffer(r0, r1)
            return
    }

    public static void check(org.lwjgl.system.CustomBuffer<?> r4, long r5) {
            r0 = r4
            int r0 = r0.remaining()
            r1 = r5
            int r1 = (int) r1
            checkBuffer(r0, r1)
            return
    }

    public static void checkSafe(@javax.annotation.Nullable short[] r3, int r4) {
            r0 = r3
            if (r0 == 0) goto La
            r0 = r3
            int r0 = r0.length
            r1 = r4
            checkBuffer(r0, r1)
        La:
            return
    }

    public static void checkSafe(@javax.annotation.Nullable int[] r3, int r4) {
            r0 = r3
            if (r0 == 0) goto La
            r0 = r3
            int r0 = r0.length
            r1 = r4
            checkBuffer(r0, r1)
        La:
            return
    }

    public static void checkSafe(@javax.annotation.Nullable long[] r3, int r4) {
            r0 = r3
            if (r0 == 0) goto La
            r0 = r3
            int r0 = r0.length
            r1 = r4
            checkBuffer(r0, r1)
        La:
            return
    }

    public static void checkSafe(@javax.annotation.Nullable float[] r3, int r4) {
            r0 = r3
            if (r0 == 0) goto La
            r0 = r3
            int r0 = r0.length
            r1 = r4
            checkBuffer(r0, r1)
        La:
            return
    }

    public static void checkSafe(@javax.annotation.Nullable double[] r3, int r4) {
            r0 = r3
            if (r0 == 0) goto La
            r0 = r3
            int r0 = r0.length
            r1 = r4
            checkBuffer(r0, r1)
        La:
            return
    }

    public static void checkSafe(@javax.annotation.Nullable java.nio.Buffer r3, int r4) {
            r0 = r3
            if (r0 == 0) goto Lc
            r0 = r3
            int r0 = r0.remaining()
            r1 = r4
            checkBuffer(r0, r1)
        Lc:
            return
    }

    public static void checkSafe(@javax.annotation.Nullable java.nio.Buffer r4, long r5) {
            r0 = r4
            if (r0 == 0) goto Ld
            r0 = r4
            int r0 = r0.remaining()
            r1 = r5
            int r1 = (int) r1
            checkBuffer(r0, r1)
        Ld:
            return
    }

    public static void checkSafe(@javax.annotation.Nullable org.lwjgl.system.CustomBuffer<?> r3, int r4) {
            r0 = r3
            if (r0 == 0) goto Lc
            r0 = r3
            int r0 = r0.remaining()
            r1 = r4
            checkBuffer(r0, r1)
        Lc:
            return
    }

    public static void checkSafe(@javax.annotation.Nullable org.lwjgl.system.CustomBuffer<?> r4, long r5) {
            r0 = r4
            if (r0 == 0) goto Ld
            r0 = r4
            int r0 = r0.remaining()
            r1 = r5
            int r1 = (int) r1
            checkBuffer(r0, r1)
        Ld:
            return
    }

    public static void check(java.lang.Object[] r3, int r4) {
            r0 = r3
            int r0 = r0.length
            r1 = r4
            checkBuffer(r0, r1)
            return
    }

    private static void checkBufferGT(int r3, int r4) {
            r0 = r4
            r1 = r3
            if (r0 >= r1) goto La
            r0 = r3
            r1 = r4
            throwIAEGT(r0, r1)
        La:
            return
    }

    public static void checkGT(java.nio.Buffer r3, int r4) {
            r0 = r3
            int r0 = r0.remaining()
            r1 = r4
            checkBufferGT(r0, r1)
            return
    }

    public static void checkGT(org.lwjgl.system.CustomBuffer<?> r3, int r4) {
            r0 = r3
            int r0 = r0.remaining()
            r1 = r4
            checkBufferGT(r0, r1)
            return
    }

    public static long check(int r3, int r4) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lc
            r0 = r3
            r1 = r4
            int r0 = org.lwjgl.system.CheckIntrinsics.checkIndex(r0, r1)
        Lc:
            r0 = r3
            long r0 = java.lang.Integer.toUnsignedLong(r0)
            return r0
    }

    private static void throwIAE(int r5, int r6) {
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r1 = r0
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r3 = r2
            r3.<init>()
            java.lang.String r3 = "Number of remaining elements is "
            java.lang.StringBuilder r2 = r2.append(r3)
            r3 = r5
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r3 = ", must be at least "
            java.lang.StringBuilder r2 = r2.append(r3)
            r3 = r6
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r0
    }

    private static void throwIAEGT(int r5, int r6) {
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r1 = r0
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r3 = r2
            r3.<init>()
            java.lang.String r3 = "Number of remaining buffer elements is "
            java.lang.StringBuilder r2 = r2.append(r3)
            r3 = r5
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r3 = ", must be at most "
            java.lang.StringBuilder r2 = r2.append(r3)
            r3 = r6
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r0
    }

    static {
            org.lwjgl.system.Configuration<java.lang.Boolean> r0 = org.lwjgl.system.Configuration.DISABLE_CHECKS
            r1 = 0
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            java.lang.Object r0 = r0.get(r1)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L17
            r0 = 1
            goto L18
        L17:
            r0 = 0
        L18:
            org.lwjgl.system.Checks.CHECKS = r0
            org.lwjgl.system.Configuration<java.lang.Boolean> r0 = org.lwjgl.system.Configuration.DEBUG
            r1 = 0
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            java.lang.Object r0 = r0.get(r1)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            org.lwjgl.system.Checks.DEBUG = r0
            org.lwjgl.system.Configuration<java.lang.Boolean> r0 = org.lwjgl.system.Configuration.DEBUG_FUNCTIONS
            r1 = 0
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            java.lang.Object r0 = r0.get(r1)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            org.lwjgl.system.Checks.DEBUG_FUNCTIONS = r0
            boolean r0 = org.lwjgl.system.Checks.DEBUG_FUNCTIONS
            if (r0 == 0) goto L55
            boolean r0 = org.lwjgl.system.Checks.DEBUG
            if (r0 != 0) goto L55
            java.io.PrintStream r0 = org.lwjgl.system.APIUtil.DEBUG_STREAM
            java.lang.String r1 = "[LWJGL] The DEBUG_FUNCTIONS option requires DEBUG to produce output."
            r0.println(r1)
        L55:
            return
    }
}
