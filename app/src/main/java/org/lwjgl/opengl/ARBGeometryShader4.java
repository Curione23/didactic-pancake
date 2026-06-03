package org.lwjgl.opengl;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/opengl/ARBGeometryShader4.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/opengl/ARBGeometryShader4.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/opengl/ARBGeometryShader4.class */
public class ARBGeometryShader4 {
    public static final int GL_GEOMETRY_SHADER_ARB = 36313;
    public static final int GL_GEOMETRY_VERTICES_OUT_ARB = 36314;
    public static final int GL_GEOMETRY_INPUT_TYPE_ARB = 36315;
    public static final int GL_GEOMETRY_OUTPUT_TYPE_ARB = 36316;
    public static final int GL_MAX_GEOMETRY_TEXTURE_IMAGE_UNITS_ARB = 35881;
    public static final int GL_MAX_GEOMETRY_VARYING_COMPONENTS_ARB = 36317;
    public static final int GL_MAX_VERTEX_VARYING_COMPONENTS_ARB = 36318;
    public static final int GL_MAX_GEOMETRY_UNIFORM_COMPONENTS_ARB = 36319;
    public static final int GL_MAX_GEOMETRY_OUTPUT_VERTICES_ARB = 36320;
    public static final int GL_MAX_GEOMETRY_TOTAL_OUTPUT_COMPONENTS_ARB = 36321;
    public static final int GL_LINES_ADJACENCY_ARB = 10;
    public static final int GL_LINE_STRIP_ADJACENCY_ARB = 11;
    public static final int GL_TRIANGLES_ADJACENCY_ARB = 12;
    public static final int GL_TRIANGLE_STRIP_ADJACENCY_ARB = 13;
    public static final int GL_FRAMEBUFFER_INCOMPLETE_LAYER_TARGETS_ARB = 36264;
    public static final int GL_FRAMEBUFFER_INCOMPLETE_LAYER_COUNT_ARB = 36265;
    public static final int GL_FRAMEBUFFER_ATTACHMENT_LAYERED_ARB = 36263;
    public static final int GL_FRAMEBUFFER_ATTACHMENT_TEXTURE_LAYER = 36052;
    public static final int GL_PROGRAM_POINT_SIZE_ARB = 34370;

    protected ARBGeometryShader4() {
            r3 = this;
            r0 = r3
            r0.<init>()
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r1 = r0
            r1.<init>()
            throw r0
    }

    public static native void glProgramParameteriARB(@org.lwjgl.system.NativeType("GLuint") int r0, @org.lwjgl.system.NativeType("GLenum") int r1, @org.lwjgl.system.NativeType("GLint") int r2);

    public static native void glFramebufferTextureARB(@org.lwjgl.system.NativeType("GLenum") int r0, @org.lwjgl.system.NativeType("GLenum") int r1, @org.lwjgl.system.NativeType("GLuint") int r2, @org.lwjgl.system.NativeType("GLint") int r3);

    public static native void glFramebufferTextureLayerARB(@org.lwjgl.system.NativeType("GLenum") int r0, @org.lwjgl.system.NativeType("GLenum") int r1, @org.lwjgl.system.NativeType("GLuint") int r2, @org.lwjgl.system.NativeType("GLint") int r3, @org.lwjgl.system.NativeType("GLint") int r4);

    public static native void glFramebufferTextureFaceARB(@org.lwjgl.system.NativeType("GLenum") int r0, @org.lwjgl.system.NativeType("GLenum") int r1, @org.lwjgl.system.NativeType("GLuint") int r2, @org.lwjgl.system.NativeType("GLint") int r3, @org.lwjgl.system.NativeType("GLenum") int r4);

    static {
            org.lwjgl.opengl.GL.initialize()
            return
    }
}
