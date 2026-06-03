package org.lwjgl.opengl;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/opengl/NVInternalformatSampleQuery.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/opengl/NVInternalformatSampleQuery.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/opengl/NVInternalformatSampleQuery.class */
public class NVInternalformatSampleQuery {
    public static final int GL_MULTISAMPLES_NV = 37745;
    public static final int GL_SUPERSAMPLE_SCALE_X_NV = 37746;
    public static final int GL_SUPERSAMPLE_SCALE_Y_NV = 37747;
    public static final int GL_CONFORMANT_NV = 37748;

    protected NVInternalformatSampleQuery() {
            r3 = this;
            r0 = r3
            r0.<init>()
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r1 = r0
            r1.<init>()
            throw r0
    }

    public static native void nglGetInternalformatSampleivNV(int r0, int r1, int r2, int r3, int r4, long r5);

    public static void glGetInternalformatSampleivNV(@org.lwjgl.system.NativeType("GLenum") int r8, @org.lwjgl.system.NativeType("GLenum") int r9, @org.lwjgl.system.NativeType("GLsizei") int r10, @org.lwjgl.system.NativeType("GLenum") int r11, @org.lwjgl.system.NativeType("GLint *") java.nio.IntBuffer r12) {
            r0 = r8
            r1 = r9
            r2 = r10
            r3 = r11
            r4 = r12
            int r4 = r4.remaining()
            r5 = r12
            long r5 = org.lwjgl.system.MemoryUtil.memAddress(r5)
            nglGetInternalformatSampleivNV(r0, r1, r2, r3, r4, r5)
            return
    }

    public static void glGetInternalformatSampleivNV(@org.lwjgl.system.NativeType("GLenum") int r9, @org.lwjgl.system.NativeType("GLenum") int r10, @org.lwjgl.system.NativeType("GLsizei") int r11, @org.lwjgl.system.NativeType("GLenum") int r12, @org.lwjgl.system.NativeType("GLint *") int[] r13) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glGetInternalformatSampleivNV
            r14 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L14
            r0 = r14
            long r0 = org.lwjgl.system.Checks.check(r0)
        L14:
            r0 = r9
            r1 = r10
            r2 = r11
            r3 = r12
            r4 = r13
            int r4 = r4.length
            r5 = r13
            r6 = r14
            org.lwjgl.system.JNI.callPV(r0, r1, r2, r3, r4, r5, r6)
            return
    }

    static {
            org.lwjgl.opengl.GL.initialize()
            return
    }
}
