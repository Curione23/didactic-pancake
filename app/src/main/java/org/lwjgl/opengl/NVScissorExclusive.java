package org.lwjgl.opengl;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/opengl/NVScissorExclusive.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/opengl/NVScissorExclusive.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/opengl/NVScissorExclusive.class */
public class NVScissorExclusive {
    public static final int GL_SCISSOR_TEST_EXCLUSIVE_NV = 38229;
    public static final int GL_SCISSOR_BOX_EXCLUSIVE_NV = 38230;

    protected NVScissorExclusive() {
            r3 = this;
            r0 = r3
            r0.<init>()
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r1 = r0
            r1.<init>()
            throw r0
    }

    public static native void nglScissorExclusiveArrayvNV(int r0, int r1, long r2);

    public static void glScissorExclusiveArrayvNV(@org.lwjgl.system.NativeType("GLuint") int r5, @org.lwjgl.system.NativeType("GLint const *") java.nio.IntBuffer r6) {
            r0 = r5
            r1 = r6
            int r1 = r1.remaining()
            r2 = 2
            int r1 = r1 >> r2
            r2 = r6
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            nglScissorExclusiveArrayvNV(r0, r1, r2)
            return
    }

    public static native void glScissorExclusiveNV(@org.lwjgl.system.NativeType("GLint") int r0, @org.lwjgl.system.NativeType("GLint") int r1, @org.lwjgl.system.NativeType("GLsizei") int r2, @org.lwjgl.system.NativeType("GLsizei") int r3);

    public static void glScissorExclusiveArrayvNV(@org.lwjgl.system.NativeType("GLuint") int r6, @org.lwjgl.system.NativeType("GLint const *") int[] r7) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glScissorExclusiveArrayvNV
            r8 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L12
            r0 = r8
            long r0 = org.lwjgl.system.Checks.check(r0)
        L12:
            r0 = r6
            r1 = r7
            int r1 = r1.length
            r2 = 2
            int r1 = r1 >> r2
            r2 = r7
            r3 = r8
            org.lwjgl.system.JNI.callPV(r0, r1, r2, r3)
            return
    }

    static {
            org.lwjgl.opengl.GL.initialize()
            return
    }
}
