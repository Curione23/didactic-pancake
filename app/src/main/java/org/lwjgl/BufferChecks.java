package org.lwjgl;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/BufferChecks.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/BufferChecks.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/BufferChecks.class */
public class BufferChecks {
    private BufferChecks() {
            r2 = this;
            r0 = r2
            r0.<init>()
            return
    }

    public static void checkFunctionAddress(long r5) {
            boolean r0 = org.lwjgl.LWJGLUtil.CHECKS
            if (r0 == 0) goto L16
            r0 = r5
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto L16
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r1 = r0
            java.lang.String r2 = "Function is not supported"
            r1.<init>(r2)
            throw r0
        L16:
            return
    }

    public static void checkNullTerminated(java.nio.ByteBuffer r4) {
            boolean r0 = org.lwjgl.LWJGLUtil.CHECKS
            if (r0 == 0) goto L1d
            r0 = r4
            r1 = r4
            int r1 = r1.limit()
            r2 = 1
            int r1 = r1 - r2
            byte r0 = r0.get(r1)
            if (r0 == 0) goto L1d
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r1 = r0
            java.lang.String r2 = "Missing null termination"
            r1.<init>(r2)
            throw r0
        L1d:
            return
    }

    public static void checkNullTerminated(java.nio.ByteBuffer r4, int r5) {
            boolean r0 = org.lwjgl.LWJGLUtil.CHECKS
            if (r0 == 0) goto L35
            r0 = 0
            r6 = r0
            r0 = r4
            int r0 = r0.position()
            r7 = r0
        Ld:
            r0 = r7
            r1 = r4
            int r1 = r1.limit()
            if (r0 >= r1) goto L26
            r0 = r4
            r1 = r7
            byte r0 = r0.get(r1)
            if (r0 != 0) goto L20
            int r6 = r6 + 1
        L20:
            int r7 = r7 + 1
            goto Ld
        L26:
            r0 = r6
            r1 = r5
            if (r0 >= r1) goto L35
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r1 = r0
            java.lang.String r2 = "Missing null termination"
            r1.<init>(r2)
            throw r0
        L35:
            return
    }

    public static void checkNullTerminated(java.nio.IntBuffer r4) {
            boolean r0 = org.lwjgl.LWJGLUtil.CHECKS
            if (r0 == 0) goto L1d
            r0 = r4
            r1 = r4
            int r1 = r1.limit()
            r2 = 1
            int r1 = r1 - r2
            int r0 = r0.get(r1)
            if (r0 == 0) goto L1d
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r1 = r0
            java.lang.String r2 = "Missing null termination"
            r1.<init>(r2)
            throw r0
        L1d:
            return
    }

    public static void checkNullTerminated(java.nio.LongBuffer r5) {
            boolean r0 = org.lwjgl.LWJGLUtil.CHECKS
            if (r0 == 0) goto L1f
            r0 = r5
            r1 = r5
            int r1 = r1.limit()
            r2 = 1
            int r1 = r1 - r2
            long r0 = r0.get(r1)
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto L1f
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r1 = r0
            java.lang.String r2 = "Missing null termination"
            r1.<init>(r2)
            throw r0
        L1f:
            return
    }

    public static void checkNullTerminated(org.lwjgl.PointerBuffer r5) {
            boolean r0 = org.lwjgl.LWJGLUtil.CHECKS
            if (r0 == 0) goto L1f
            r0 = r5
            r1 = r5
            int r1 = r1.limit()
            r2 = 1
            int r1 = r1 - r2
            long r0 = r0.get(r1)
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto L1f
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r1 = r0
            java.lang.String r2 = "Missing null termination"
            r1.<init>(r2)
            throw r0
        L1f:
            return
    }

    public static void checkNotNull(java.lang.Object r4) {
            boolean r0 = org.lwjgl.LWJGLUtil.CHECKS
            if (r0 == 0) goto L14
            r0 = r4
            if (r0 != 0) goto L14
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r1 = r0
            java.lang.String r2 = "Null argument"
            r1.<init>(r2)
            throw r0
        L14:
            return
    }

    public static void checkDirect(java.nio.ByteBuffer r4) {
            boolean r0 = org.lwjgl.LWJGLUtil.CHECKS
            if (r0 == 0) goto L17
            r0 = r4
            boolean r0 = r0.isDirect()
            if (r0 != 0) goto L17
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r1 = r0
            java.lang.String r2 = "ByteBuffer is not direct"
            r1.<init>(r2)
            throw r0
        L17:
            return
    }

    public static void checkDirect(java.nio.ShortBuffer r4) {
            boolean r0 = org.lwjgl.LWJGLUtil.CHECKS
            if (r0 == 0) goto L17
            r0 = r4
            boolean r0 = r0.isDirect()
            if (r0 != 0) goto L17
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r1 = r0
            java.lang.String r2 = "ShortBuffer is not direct"
            r1.<init>(r2)
            throw r0
        L17:
            return
    }

    public static void checkDirect(java.nio.IntBuffer r4) {
            boolean r0 = org.lwjgl.LWJGLUtil.CHECKS
            if (r0 == 0) goto L17
            r0 = r4
            boolean r0 = r0.isDirect()
            if (r0 != 0) goto L17
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r1 = r0
            java.lang.String r2 = "IntBuffer is not direct"
            r1.<init>(r2)
            throw r0
        L17:
            return
    }

    public static void checkDirect(java.nio.LongBuffer r4) {
            boolean r0 = org.lwjgl.LWJGLUtil.CHECKS
            if (r0 == 0) goto L17
            r0 = r4
            boolean r0 = r0.isDirect()
            if (r0 != 0) goto L17
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r1 = r0
            java.lang.String r2 = "LongBuffer is not direct"
            r1.<init>(r2)
            throw r0
        L17:
            return
    }

    public static void checkDirect(java.nio.FloatBuffer r4) {
            boolean r0 = org.lwjgl.LWJGLUtil.CHECKS
            if (r0 == 0) goto L17
            r0 = r4
            boolean r0 = r0.isDirect()
            if (r0 != 0) goto L17
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r1 = r0
            java.lang.String r2 = "FloatBuffer is not direct"
            r1.<init>(r2)
            throw r0
        L17:
            return
    }

    public static void checkDirect(java.nio.DoubleBuffer r4) {
            boolean r0 = org.lwjgl.LWJGLUtil.CHECKS
            if (r0 == 0) goto L17
            r0 = r4
            boolean r0 = r0.isDirect()
            if (r0 != 0) goto L17
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r1 = r0
            java.lang.String r2 = "DoubleBuffer is not direct"
            r1.<init>(r2)
            throw r0
        L17:
            return
    }

    public static void checkDirect(org.lwjgl.PointerBuffer r1) {
            return
    }

    public static void checkArray(java.lang.Object[] r4) {
            boolean r0 = org.lwjgl.LWJGLUtil.CHECKS
            if (r0 == 0) goto L19
            r0 = r4
            if (r0 == 0) goto Lf
            r0 = r4
            int r0 = r0.length
            if (r0 != 0) goto L19
        Lf:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r1 = r0
            java.lang.String r2 = "Invalid array"
            r1.<init>(r2)
            throw r0
        L19:
            return
    }

    private static void throwBufferSizeException(java.nio.Buffer r5, int r6) {
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r1 = r0
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r3 = r2
            r3.<init>()
            java.lang.String r3 = "Number of remaining buffer elements is "
            java.lang.StringBuilder r2 = r2.append(r3)
            r3 = r5
            int r3 = r3.remaining()
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r3 = ", must be at least "
            java.lang.StringBuilder r2 = r2.append(r3)
            r3 = r6
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r3 = ". Because at most "
            java.lang.StringBuilder r2 = r2.append(r3)
            r3 = r6
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r3 = " elements can be returned, a buffer with at least "
            java.lang.StringBuilder r2 = r2.append(r3)
            r3 = r6
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r3 = " elements is required, regardless of actual returned element count"
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r0
    }

    private static void throwBufferSizeException(org.lwjgl.PointerBuffer r5, int r6) {
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r1 = r0
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r3 = r2
            r3.<init>()
            java.lang.String r3 = "Number of remaining pointer buffer elements is "
            java.lang.StringBuilder r2 = r2.append(r3)
            r3 = r5
            int r3 = r3.remaining()
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r3 = ", must be at least "
            java.lang.StringBuilder r2 = r2.append(r3)
            r3 = r6
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r0
    }

    private static void throwArraySizeException(java.lang.Object[] r5, int r6) {
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r1 = r0
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r3 = r2
            r3.<init>()
            java.lang.String r3 = "Number of array elements is "
            java.lang.StringBuilder r2 = r2.append(r3)
            r3 = r5
            int r3 = r3.length
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r3 = ", must be at least "
            java.lang.StringBuilder r2 = r2.append(r3)
            r3 = r6
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r0
    }

    private static void throwArraySizeException(long[] r5, int r6) {
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r1 = r0
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r3 = r2
            r3.<init>()
            java.lang.String r3 = "Number of array elements is "
            java.lang.StringBuilder r2 = r2.append(r3)
            r3 = r5
            int r3 = r3.length
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r3 = ", must be at least "
            java.lang.StringBuilder r2 = r2.append(r3)
            r3 = r6
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r0
    }

    public static void checkBufferSize(java.nio.Buffer r3, int r4) {
            boolean r0 = org.lwjgl.LWJGLUtil.CHECKS
            if (r0 == 0) goto L13
            r0 = r3
            int r0 = r0.remaining()
            r1 = r4
            if (r0 >= r1) goto L13
            r0 = r3
            r1 = r4
            throwBufferSizeException(r0, r1)
        L13:
            return
    }

    public static int checkBuffer(java.nio.Buffer r5, int r6) {
            r0 = r5
            boolean r0 = r0 instanceof java.nio.ByteBuffer
            if (r0 == 0) goto L14
            r0 = r5
            java.nio.ByteBuffer r0 = (java.nio.ByteBuffer) r0
            r1 = r6
            checkBuffer(r0, r1)
            r0 = 0
            r7 = r0
            goto L96
        L14:
            r0 = r5
            boolean r0 = r0 instanceof java.nio.ShortBuffer
            if (r0 == 0) goto L28
            r0 = r5
            java.nio.ShortBuffer r0 = (java.nio.ShortBuffer) r0
            r1 = r6
            checkBuffer(r0, r1)
            r0 = 1
            r7 = r0
            goto L96
        L28:
            r0 = r5
            boolean r0 = r0 instanceof java.nio.IntBuffer
            if (r0 == 0) goto L3c
            r0 = r5
            java.nio.IntBuffer r0 = (java.nio.IntBuffer) r0
            r1 = r6
            checkBuffer(r0, r1)
            r0 = 2
            r7 = r0
            goto L96
        L3c:
            r0 = r5
            boolean r0 = r0 instanceof java.nio.LongBuffer
            if (r0 == 0) goto L50
            r0 = r5
            java.nio.LongBuffer r0 = (java.nio.LongBuffer) r0
            r1 = r6
            checkBuffer(r0, r1)
            r0 = 4
            r7 = r0
            goto L96
        L50:
            r0 = r5
            boolean r0 = r0 instanceof java.nio.FloatBuffer
            if (r0 == 0) goto L64
            r0 = r5
            java.nio.FloatBuffer r0 = (java.nio.FloatBuffer) r0
            r1 = r6
            checkBuffer(r0, r1)
            r0 = 2
            r7 = r0
            goto L96
        L64:
            r0 = r5
            boolean r0 = r0 instanceof java.nio.DoubleBuffer
            if (r0 == 0) goto L78
            r0 = r5
            java.nio.DoubleBuffer r0 = (java.nio.DoubleBuffer) r0
            r1 = r6
            checkBuffer(r0, r1)
            r0 = 4
            r7 = r0
            goto L96
        L78:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r1 = r0
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r3 = r2
            r3.<init>()
            java.lang.String r3 = "Unsupported Buffer type specified: "
            java.lang.StringBuilder r2 = r2.append(r3)
            r3 = r5
            java.lang.Class r3 = r3.getClass()
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r0
        L96:
            r0 = r5
            int r0 = r0.position()
            r1 = r7
            int r0 = r0 << r1
            return r0
    }

    public static void checkBuffer(java.nio.ByteBuffer r3, int r4) {
            boolean r0 = org.lwjgl.LWJGLUtil.CHECKS
            if (r0 == 0) goto Lf
            r0 = r3
            r1 = r4
            checkBufferSize(r0, r1)
            r0 = r3
            checkDirect(r0)
        Lf:
            return
    }

    public static void checkBuffer(java.nio.ShortBuffer r3, int r4) {
            boolean r0 = org.lwjgl.LWJGLUtil.CHECKS
            if (r0 == 0) goto Lf
            r0 = r3
            r1 = r4
            checkBufferSize(r0, r1)
            r0 = r3
            checkDirect(r0)
        Lf:
            return
    }

    public static void checkBuffer(java.nio.IntBuffer r3, int r4) {
            boolean r0 = org.lwjgl.LWJGLUtil.CHECKS
            if (r0 == 0) goto Lf
            r0 = r3
            r1 = r4
            checkBufferSize(r0, r1)
            r0 = r3
            checkDirect(r0)
        Lf:
            return
    }

    public static void checkBuffer(java.nio.LongBuffer r3, int r4) {
            boolean r0 = org.lwjgl.LWJGLUtil.CHECKS
            if (r0 == 0) goto Lf
            r0 = r3
            r1 = r4
            checkBufferSize(r0, r1)
            r0 = r3
            checkDirect(r0)
        Lf:
            return
    }

    public static void checkBuffer(java.nio.FloatBuffer r3, int r4) {
            boolean r0 = org.lwjgl.LWJGLUtil.CHECKS
            if (r0 == 0) goto Lf
            r0 = r3
            r1 = r4
            checkBufferSize(r0, r1)
            r0 = r3
            checkDirect(r0)
        Lf:
            return
    }

    public static void checkBuffer(java.nio.DoubleBuffer r3, int r4) {
            boolean r0 = org.lwjgl.LWJGLUtil.CHECKS
            if (r0 == 0) goto Lf
            r0 = r3
            r1 = r4
            checkBufferSize(r0, r1)
            r0 = r3
            checkDirect(r0)
        Lf:
            return
    }

    public static void checkBuffer(org.lwjgl.PointerBuffer r3, int r4) {
            boolean r0 = org.lwjgl.LWJGLUtil.CHECKS
            if (r0 == 0) goto L13
            r0 = r3
            int r0 = r0.remaining()
            r1 = r4
            if (r0 >= r1) goto L13
            r0 = r3
            r1 = r4
            throwBufferSizeException(r0, r1)
        L13:
            return
    }

    public static void checkArray(java.lang.Object[] r3, int r4) {
            boolean r0 = org.lwjgl.LWJGLUtil.CHECKS
            if (r0 == 0) goto L11
            r0 = r3
            int r0 = r0.length
            r1 = r4
            if (r0 >= r1) goto L11
            r0 = r3
            r1 = r4
            throwArraySizeException(r0, r1)
        L11:
            return
    }

    public static void checkArray(long[] r3, int r4) {
            boolean r0 = org.lwjgl.LWJGLUtil.CHECKS
            if (r0 == 0) goto L11
            r0 = r3
            int r0 = r0.length
            r1 = r4
            if (r0 >= r1) goto L11
            r0 = r3
            r1 = r4
            throwArraySizeException(r0, r1)
        L11:
            return
    }
}
