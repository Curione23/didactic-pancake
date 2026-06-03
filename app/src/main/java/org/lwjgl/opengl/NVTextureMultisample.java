package org.lwjgl.opengl;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/opengl/NVTextureMultisample.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/opengl/NVTextureMultisample.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/opengl/NVTextureMultisample.class */
public class NVTextureMultisample {
    public static final int GL_TEXTURE_COVERAGE_SAMPLES_NV = 36933;
    public static final int GL_TEXTURE_COLOR_SAMPLES_NV = 36934;

    protected NVTextureMultisample() {
            r3 = this;
            r0 = r3
            r0.<init>()
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r1 = r0
            r1.<init>()
            throw r0
    }

    public static native void glTexImage2DMultisampleCoverageNV(@org.lwjgl.system.NativeType("GLenum") int r0, @org.lwjgl.system.NativeType("GLsizei") int r1, @org.lwjgl.system.NativeType("GLsizei") int r2, @org.lwjgl.system.NativeType("GLint") int r3, @org.lwjgl.system.NativeType("GLsizei") int r4, @org.lwjgl.system.NativeType("GLsizei") int r5, @org.lwjgl.system.NativeType("GLboolean") boolean r6);

    public static native void glTexImage3DMultisampleCoverageNV(@org.lwjgl.system.NativeType("GLenum") int r0, @org.lwjgl.system.NativeType("GLsizei") int r1, @org.lwjgl.system.NativeType("GLsizei") int r2, @org.lwjgl.system.NativeType("GLint") int r3, @org.lwjgl.system.NativeType("GLsizei") int r4, @org.lwjgl.system.NativeType("GLsizei") int r5, @org.lwjgl.system.NativeType("GLsizei") int r6, @org.lwjgl.system.NativeType("GLboolean") boolean r7);

    public static native void glTextureImage2DMultisampleNV(@org.lwjgl.system.NativeType("GLuint") int r0, @org.lwjgl.system.NativeType("GLenum") int r1, @org.lwjgl.system.NativeType("GLsizei") int r2, @org.lwjgl.system.NativeType("GLint") int r3, @org.lwjgl.system.NativeType("GLsizei") int r4, @org.lwjgl.system.NativeType("GLsizei") int r5, @org.lwjgl.system.NativeType("GLboolean") boolean r6);

    public static native void glTextureImage3DMultisampleNV(@org.lwjgl.system.NativeType("GLuint") int r0, @org.lwjgl.system.NativeType("GLenum") int r1, @org.lwjgl.system.NativeType("GLsizei") int r2, @org.lwjgl.system.NativeType("GLint") int r3, @org.lwjgl.system.NativeType("GLsizei") int r4, @org.lwjgl.system.NativeType("GLsizei") int r5, @org.lwjgl.system.NativeType("GLsizei") int r6, @org.lwjgl.system.NativeType("GLboolean") boolean r7);

    public static native void glTextureImage2DMultisampleCoverageNV(@org.lwjgl.system.NativeType("GLuint") int r0, @org.lwjgl.system.NativeType("GLenum") int r1, @org.lwjgl.system.NativeType("GLsizei") int r2, @org.lwjgl.system.NativeType("GLsizei") int r3, @org.lwjgl.system.NativeType("GLint") int r4, @org.lwjgl.system.NativeType("GLsizei") int r5, @org.lwjgl.system.NativeType("GLsizei") int r6, @org.lwjgl.system.NativeType("GLboolean") boolean r7);

    public static native void glTextureImage3DMultisampleCoverageNV(@org.lwjgl.system.NativeType("GLuint") int r0, @org.lwjgl.system.NativeType("GLenum") int r1, @org.lwjgl.system.NativeType("GLsizei") int r2, @org.lwjgl.system.NativeType("GLsizei") int r3, @org.lwjgl.system.NativeType("GLint") int r4, @org.lwjgl.system.NativeType("GLsizei") int r5, @org.lwjgl.system.NativeType("GLsizei") int r6, @org.lwjgl.system.NativeType("GLsizei") int r7, @org.lwjgl.system.NativeType("GLboolean") boolean r8);

    static {
            org.lwjgl.opengl.GL.initialize()
            return
    }
}
