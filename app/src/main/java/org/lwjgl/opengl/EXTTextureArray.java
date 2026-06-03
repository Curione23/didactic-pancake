package org.lwjgl.opengl;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/opengl/EXTTextureArray.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/opengl/EXTTextureArray.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/opengl/EXTTextureArray.class */
public class EXTTextureArray {
    public static final int GL_TEXTURE_1D_ARRAY_EXT = 35864;
    public static final int GL_TEXTURE_2D_ARRAY_EXT = 35866;
    public static final int GL_PROXY_TEXTURE_2D_ARRAY_EXT = 35867;
    public static final int GL_PROXY_TEXTURE_1D_ARRAY_EXT = 35865;
    public static final int GL_TEXTURE_BINDING_1D_ARRAY_EXT = 35868;
    public static final int GL_TEXTURE_BINDING_2D_ARRAY_EXT = 35869;
    public static final int GL_MAX_ARRAY_TEXTURE_LAYERS_EXT = 35071;
    public static final int GL_COMPARE_REF_DEPTH_TO_TEXTURE_EXT = 34894;
    public static final int GL_FRAMEBUFFER_ATTACHMENT_TEXTURE_LAYER_EXT = 36052;
    public static final int GL_SAMPLER_1D_ARRAY_EXT = 36288;
    public static final int GL_SAMPLER_2D_ARRAY_EXT = 36289;
    public static final int GL_SAMPLER_1D_ARRAY_SHADOW_EXT = 36291;
    public static final int GL_SAMPLER_2D_ARRAY_SHADOW_EXT = 36292;

    protected EXTTextureArray() {
            r3 = this;
            r0 = r3
            r0.<init>()
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r1 = r0
            r1.<init>()
            throw r0
    }

    public static native void glFramebufferTextureLayerEXT(@org.lwjgl.system.NativeType("GLenum") int r0, @org.lwjgl.system.NativeType("GLenum") int r1, @org.lwjgl.system.NativeType("GLuint") int r2, @org.lwjgl.system.NativeType("GLint") int r3, @org.lwjgl.system.NativeType("GLint") int r4);

    static {
            org.lwjgl.opengl.GL.initialize()
            return
    }
}
