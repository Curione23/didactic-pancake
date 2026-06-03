package org.lwjgl.opengl;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/opengl/NVFramebufferMultisampleCoverage.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/opengl/NVFramebufferMultisampleCoverage.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/opengl/NVFramebufferMultisampleCoverage.class */
public class NVFramebufferMultisampleCoverage {
    public static final int GL_RENDERBUFFER_COVERAGE_SAMPLES_NV = 36011;
    public static final int GL_RENDERBUFFER_COLOR_SAMPLES_NV = 36368;
    public static final int GL_MAX_MULTISAMPLE_COVERAGE_MODES_NV = 36369;
    public static final int GL_MULTISAMPLE_COVERAGE_MODES_NV = 36370;

    protected NVFramebufferMultisampleCoverage() {
            r3 = this;
            r0 = r3
            r0.<init>()
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r1 = r0
            r1.<init>()
            throw r0
    }

    public static native void glRenderbufferStorageMultisampleCoverageNV(@org.lwjgl.system.NativeType("GLenum") int r0, @org.lwjgl.system.NativeType("GLsizei") int r1, @org.lwjgl.system.NativeType("GLsizei") int r2, @org.lwjgl.system.NativeType("GLenum") int r3, @org.lwjgl.system.NativeType("GLsizei") int r4, @org.lwjgl.system.NativeType("GLsizei") int r5);

    static {
            org.lwjgl.opengl.GL.initialize()
            return
    }
}
