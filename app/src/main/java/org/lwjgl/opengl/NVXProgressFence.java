package org.lwjgl.opengl;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/opengl/NVXProgressFence.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/opengl/NVXProgressFence.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/opengl/NVXProgressFence.class */
public class NVXProgressFence {
    protected NVXProgressFence() {
            r3 = this;
            r0 = r3
            r0.<init>()
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r1 = r0
            r1.<init>()
            throw r0
    }

    @org.lwjgl.system.NativeType("GLuint")
    public static native int glCreateProgressFenceNVX();

    public static native void nglSignalSemaphoreui64NVX(int r0, int r1, long r2, long r4);

    public static void glSignalSemaphoreui64NVX(@org.lwjgl.system.NativeType("GLuint") int r7, @org.lwjgl.system.NativeType("GLuint const *") java.nio.IntBuffer r8, @org.lwjgl.system.NativeType("GLuint64 const *") java.nio.LongBuffer r9) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Le
            r0 = r9
            r1 = r8
            int r1 = r1.remaining()
            org.lwjgl.system.Checks.check(r0, r1)
        Le:
            r0 = r7
            r1 = r8
            int r1 = r1.remaining()
            r2 = r8
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            r3 = r9
            long r3 = org.lwjgl.system.MemoryUtil.memAddress(r3)
            nglSignalSemaphoreui64NVX(r0, r1, r2, r3)
            return
    }

    public static native void nglWaitSemaphoreui64NVX(int r0, int r1, long r2, long r4);

    public static void glWaitSemaphoreui64NVX(@org.lwjgl.system.NativeType("GLuint") int r7, @org.lwjgl.system.NativeType("GLuint const *") java.nio.IntBuffer r8, @org.lwjgl.system.NativeType("GLuint64 const *") java.nio.LongBuffer r9) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Le
            r0 = r9
            r1 = r8
            int r1 = r1.remaining()
            org.lwjgl.system.Checks.check(r0, r1)
        Le:
            r0 = r7
            r1 = r8
            int r1 = r1.remaining()
            r2 = r8
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            r3 = r9
            long r3 = org.lwjgl.system.MemoryUtil.memAddress(r3)
            nglWaitSemaphoreui64NVX(r0, r1, r2, r3)
            return
    }

    public static native void nglClientWaitSemaphoreui64NVX(int r0, long r1, long r3);

    public static void glClientWaitSemaphoreui64NVX(@org.lwjgl.system.NativeType("GLuint const *") java.nio.IntBuffer r6, @org.lwjgl.system.NativeType("GLuint64 const *") java.nio.LongBuffer r7) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Le
            r0 = r7
            r1 = r6
            int r1 = r1.remaining()
            org.lwjgl.system.Checks.check(r0, r1)
        Le:
            r0 = r6
            int r0 = r0.remaining()
            r1 = r6
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            r2 = r7
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            nglClientWaitSemaphoreui64NVX(r0, r1, r2)
            return
    }

    public static void glSignalSemaphoreui64NVX(@org.lwjgl.system.NativeType("GLuint") int r7, @org.lwjgl.system.NativeType("GLuint const *") int[] r8, @org.lwjgl.system.NativeType("GLuint64 const *") long[] r9) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glSignalSemaphoreui64NVX
            r10 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L18
            r0 = r10
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r9
            r1 = r8
            int r1 = r1.length
            org.lwjgl.system.Checks.check(r0, r1)
        L18:
            r0 = r7
            r1 = r8
            int r1 = r1.length
            r2 = r8
            r3 = r9
            r4 = r10
            org.lwjgl.system.JNI.callPPV(r0, r1, r2, r3, r4)
            return
    }

    public static void glWaitSemaphoreui64NVX(@org.lwjgl.system.NativeType("GLuint") int r7, @org.lwjgl.system.NativeType("GLuint const *") int[] r8, @org.lwjgl.system.NativeType("GLuint64 const *") long[] r9) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glWaitSemaphoreui64NVX
            r10 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L18
            r0 = r10
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r9
            r1 = r8
            int r1 = r1.length
            org.lwjgl.system.Checks.check(r0, r1)
        L18:
            r0 = r7
            r1 = r8
            int r1 = r1.length
            r2 = r8
            r3 = r9
            r4 = r10
            org.lwjgl.system.JNI.callPPV(r0, r1, r2, r3, r4)
            return
    }

    public static void glClientWaitSemaphoreui64NVX(@org.lwjgl.system.NativeType("GLuint const *") int[] r6, @org.lwjgl.system.NativeType("GLuint64 const *") long[] r7) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glClientWaitSemaphoreui64NVX
            r8 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L18
            r0 = r8
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r7
            r1 = r6
            int r1 = r1.length
            org.lwjgl.system.Checks.check(r0, r1)
        L18:
            r0 = r6
            int r0 = r0.length
            r1 = r6
            r2 = r7
            r3 = r8
            org.lwjgl.system.JNI.callPPV(r0, r1, r2, r3)
            return
    }

    static {
            org.lwjgl.opengl.GL.initialize()
            return
    }
}
