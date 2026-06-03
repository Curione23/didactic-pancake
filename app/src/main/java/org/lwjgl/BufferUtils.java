package org.lwjgl;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/BufferUtils.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/BufferUtils.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/BufferUtils.class */
public final class BufferUtils {
    public static int getElementSizeExponent(java.nio.Buffer r5) {
            r0 = r5
            boolean r0 = r0 instanceof java.nio.ByteBuffer
            if (r0 == 0) goto L9
            r0 = 0
            return r0
        L9:
            r0 = r5
            boolean r0 = r0 instanceof java.nio.ShortBuffer
            if (r0 != 0) goto L17
            r0 = r5
            boolean r0 = r0 instanceof java.nio.CharBuffer
            if (r0 == 0) goto L19
        L17:
            r0 = 1
            return r0
        L19:
            r0 = r5
            boolean r0 = r0 instanceof java.nio.FloatBuffer
            if (r0 != 0) goto L27
            r0 = r5
            boolean r0 = r0 instanceof java.nio.IntBuffer
            if (r0 == 0) goto L29
        L27:
            r0 = 2
            return r0
        L29:
            r0 = r5
            boolean r0 = r0 instanceof java.nio.LongBuffer
            if (r0 != 0) goto L37
            r0 = r5
            boolean r0 = r0 instanceof java.nio.DoubleBuffer
            if (r0 == 0) goto L39
        L37:
            r0 = 3
            return r0
        L39:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r1 = r0
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r3 = r2
            r3.<init>()
            java.lang.String r3 = "Unsupported buffer type: "
            java.lang.StringBuilder r2 = r2.append(r3)
            r3 = r5
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r0
    }

    public static int getOffset(java.nio.Buffer r3) {
            r0 = r3
            int r0 = r0.position()
            r1 = r3
            int r1 = getElementSizeExponent(r1)
            int r0 = r0 << r1
            return r0
    }

    static long getBufferAddress(java.nio.Buffer r3) {
            r0 = r3
            long r0 = org.lwjgl.system.MemoryUtil.memAddress(r0)
            return r0
    }

    private BufferUtils() {
            r2 = this;
            r0 = r2
            r0.<init>()
            return
    }

    public static java.nio.ByteBuffer createByteBuffer(int r3) {
            r0 = r3
            java.nio.ByteBuffer r0 = java.nio.ByteBuffer.allocateDirect(r0)
            java.nio.ByteOrder r1 = java.nio.ByteOrder.nativeOrder()
            java.nio.ByteBuffer r0 = r0.order(r1)
            return r0
    }

    static int getAllocationSize(int r6, int r7) {
            r0 = r6
            r1 = r6
            r2 = r7
            long r1 = org.lwjgl.system.APIUtil.apiGetBytes(r1, r2)
            r2 = 2147483647(0x7fffffff, double:1.060997895E-314)
            long r0 = org.lwjgl.system.APIUtil.apiCheckAllocation(r0, r1, r2)
            r0 = r6
            r1 = r7
            int r0 = r0 << r1
            return r0
    }

    public static java.nio.ShortBuffer createShortBuffer(int r3) {
            r0 = r3
            r1 = 1
            int r0 = getAllocationSize(r0, r1)
            java.nio.ByteBuffer r0 = createByteBuffer(r0)
            java.nio.ShortBuffer r0 = r0.asShortBuffer()
            return r0
    }

    public static java.nio.CharBuffer createCharBuffer(int r3) {
            r0 = r3
            r1 = 1
            int r0 = getAllocationSize(r0, r1)
            java.nio.ByteBuffer r0 = createByteBuffer(r0)
            java.nio.CharBuffer r0 = r0.asCharBuffer()
            return r0
    }

    public static java.nio.IntBuffer createIntBuffer(int r3) {
            r0 = r3
            r1 = 2
            int r0 = getAllocationSize(r0, r1)
            java.nio.ByteBuffer r0 = createByteBuffer(r0)
            java.nio.IntBuffer r0 = r0.asIntBuffer()
            return r0
    }

    public static java.nio.LongBuffer createLongBuffer(int r3) {
            r0 = r3
            r1 = 3
            int r0 = getAllocationSize(r0, r1)
            java.nio.ByteBuffer r0 = createByteBuffer(r0)
            java.nio.LongBuffer r0 = r0.asLongBuffer()
            return r0
    }

    public static org.lwjgl.CLongBuffer createCLongBuffer(int r2) {
            r0 = r2
            org.lwjgl.CLongBuffer r0 = org.lwjgl.CLongBuffer.allocateDirect(r0)
            return r0
    }

    public static java.nio.FloatBuffer createFloatBuffer(int r3) {
            r0 = r3
            r1 = 2
            int r0 = getAllocationSize(r0, r1)
            java.nio.ByteBuffer r0 = createByteBuffer(r0)
            java.nio.FloatBuffer r0 = r0.asFloatBuffer()
            return r0
    }

    public static java.nio.DoubleBuffer createDoubleBuffer(int r3) {
            r0 = r3
            r1 = 3
            int r0 = getAllocationSize(r0, r1)
            java.nio.ByteBuffer r0 = createByteBuffer(r0)
            java.nio.DoubleBuffer r0 = r0.asDoubleBuffer()
            return r0
    }

    public static org.lwjgl.PointerBuffer createPointerBuffer(int r2) {
            r0 = r2
            org.lwjgl.PointerBuffer r0 = org.lwjgl.PointerBuffer.allocateDirect(r0)
            return r0
    }

    public static void zeroBuffer(java.nio.ByteBuffer r3) {
            r0 = r3
            r1 = 0
            org.lwjgl.system.MemoryUtil.memSet(r0, r1)
            return
    }

    public static void zeroBuffer(java.nio.ShortBuffer r3) {
            r0 = r3
            r1 = 0
            org.lwjgl.system.MemoryUtil.memSet(r0, r1)
            return
    }

    public static void zeroBuffer(java.nio.CharBuffer r3) {
            r0 = r3
            r1 = 0
            org.lwjgl.system.MemoryUtil.memSet(r0, r1)
            return
    }

    public static void zeroBuffer(java.nio.IntBuffer r3) {
            r0 = r3
            r1 = 0
            org.lwjgl.system.MemoryUtil.memSet(r0, r1)
            return
    }

    public static void zeroBuffer(java.nio.FloatBuffer r3) {
            r0 = r3
            r1 = 0
            org.lwjgl.system.MemoryUtil.memSet(r0, r1)
            return
    }

    public static void zeroBuffer(java.nio.LongBuffer r3) {
            r0 = r3
            r1 = 0
            org.lwjgl.system.MemoryUtil.memSet(r0, r1)
            return
    }

    public static void zeroBuffer(java.nio.DoubleBuffer r3) {
            r0 = r3
            r1 = 0
            org.lwjgl.system.MemoryUtil.memSet(r0, r1)
            return
    }

    public static <T extends org.lwjgl.system.CustomBuffer<T>> void zeroBuffer(T r3) {
            r0 = r3
            r1 = 0
            org.lwjgl.system.MemoryUtil.memSet(r0, r1)
            return
    }
}
