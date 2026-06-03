package org.lwjgl.opengl;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/opengl/AMDFramebufferMultisampleAdvanced.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/opengl/AMDFramebufferMultisampleAdvanced.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/opengl/AMDFramebufferMultisampleAdvanced.class */
public class AMDFramebufferMultisampleAdvanced {
    public static final int GL_RENDERBUFFER_STORAGE_SAMPLES_AMD = 37298;
    public static final int GL_MAX_COLOR_FRAMEBUFFER_SAMPLES_AMD = 37299;
    public static final int GL_MAX_COLOR_FRAMEBUFFER_STORAGE_SAMPLES_AMD = 37300;
    public static final int GL_MAX_DEPTH_STENCIL_FRAMEBUFFER_SAMPLES_AMD = 37301;
    public static final int GL_NUM_SUPPORTED_MULTISAMPLE_MODES_AMD = 37302;
    public static final int GL_SUPPORTED_MULTISAMPLE_MODES_AMD = 37303;

    protected AMDFramebufferMultisampleAdvanced() {
            r3 = this;
            r0 = r3
            r0.<init>()
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r1 = r0
            r1.<init>()
            throw r0
    }

    public static native void glRenderbufferStorageMultisampleAdvancedAMD(@org.lwjgl.system.NativeType("GLenum") int r0, @org.lwjgl.system.NativeType("GLsizei") int r1, @org.lwjgl.system.NativeType("GLsizei") int r2, @org.lwjgl.system.NativeType("GLenum") int r3, @org.lwjgl.system.NativeType("GLsizei") int r4, @org.lwjgl.system.NativeType("GLsizei") int r5);

    public static native void glNamedRenderbufferStorageMultisampleAdvancedAMD(@org.lwjgl.system.NativeType("GLuint") int r0, @org.lwjgl.system.NativeType("GLsizei") int r1, @org.lwjgl.system.NativeType("GLsizei") int r2, @org.lwjgl.system.NativeType("GLenum") int r3, @org.lwjgl.system.NativeType("GLsizei") int r4, @org.lwjgl.system.NativeType("GLsizei") int r5);

    static {
            org.lwjgl.opengl.GL.initialize()
            return
    }
}
