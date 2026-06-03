package org.lwjgl.opengl;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/opengl/AMDVertexShaderTessellator.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/opengl/AMDVertexShaderTessellator.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/opengl/AMDVertexShaderTessellator.class */
public class AMDVertexShaderTessellator {
    public static final int GL_SAMPLER_BUFFER_AMD = 36865;
    public static final int GL_INT_SAMPLER_BUFFER_AMD = 36866;
    public static final int GL_UNSIGNED_INT_SAMPLER_BUFFER_AMD = 36867;
    public static final int GL_DISCRETE_AMD = 36870;
    public static final int GL_CONTINUOUS_AMD = 36871;
    public static final int GL_TESSELLATION_MODE_AMD = 36868;
    public static final int GL_TESSELLATION_FACTOR_AMD = 36869;

    protected AMDVertexShaderTessellator() {
            r3 = this;
            r0 = r3
            r0.<init>()
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r1 = r0
            r1.<init>()
            throw r0
    }

    public static native void glTessellationFactorAMD(@org.lwjgl.system.NativeType("GLfloat") float r0);

    public static native void glTessellationModeAMD(@org.lwjgl.system.NativeType("GLenum") int r0);

    static {
            org.lwjgl.opengl.GL.initialize()
            return
    }
}
