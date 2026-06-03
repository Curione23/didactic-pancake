package org.lwjgl.opengl;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/opengl/EXTGeometryShader4.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/opengl/EXTGeometryShader4.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/opengl/EXTGeometryShader4.class */
public class EXTGeometryShader4 {
    public static final int GL_GEOMETRY_SHADER_EXT = 36313;
    public static final int GL_GEOMETRY_VERTICES_OUT_EXT = 36314;
    public static final int GL_GEOMETRY_INPUT_TYPE_EXT = 36315;
    public static final int GL_GEOMETRY_OUTPUT_TYPE_EXT = 36316;
    public static final int GL_MAX_GEOMETRY_TEXTURE_IMAGE_UNITS_EXT = 35881;
    public static final int GL_MAX_GEOMETRY_VARYING_COMPONENTS_EXT = 36317;
    public static final int GL_MAX_VERTEX_VARYING_COMPONENTS_EXT = 36318;
    public static final int GL_MAX_VARYING_COMPONENTS_EXT = 35659;
    public static final int GL_MAX_GEOMETRY_UNIFORM_COMPONENTS_EXT = 36319;
    public static final int GL_MAX_GEOMETRY_OUTPUT_VERTICES_EXT = 36320;
    public static final int GL_MAX_GEOMETRY_TOTAL_OUTPUT_COMPONENTS_EXT = 36321;
    public static final int GL_LINES_ADJACENCY_EXT = 10;
    public static final int GL_LINE_STRIP_ADJACENCY_EXT = 11;
    public static final int GL_TRIANGLES_ADJACENCY_EXT = 12;
    public static final int GL_TRIANGLE_STRIP_ADJACENCY_EXT = 13;
    public static final int GL_FRAMEBUFFER_INCOMPLETE_LAYER_TARGETS_EXT = 36264;
    public static final int GL_FRAMEBUFFER_INCOMPLETE_LAYER_COUNT_EXT = 36265;
    public static final int GL_FRAMEBUFFER_ATTACHMENT_LAYERED_EXT = 36263;
    public static final int GL_FRAMEBUFFER_ATTACHMENT_TEXTURE_LAYER_EXT = 36052;
    public static final int GL_PROGRAM_POINT_SIZE_EXT = 34370;

    protected EXTGeometryShader4() {
            r3 = this;
            r0 = r3
            r0.<init>()
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r1 = r0
            r1.<init>()
            throw r0
    }

    public static native void glProgramParameteriEXT(@org.lwjgl.system.NativeType("GLuint") int r0, @org.lwjgl.system.NativeType("GLenum") int r1, @org.lwjgl.system.NativeType("GLint") int r2);

    public static native void glFramebufferTextureEXT(@org.lwjgl.system.NativeType("GLenum") int r0, @org.lwjgl.system.NativeType("GLenum") int r1, @org.lwjgl.system.NativeType("GLuint") int r2, @org.lwjgl.system.NativeType("GLint") int r3);

    public static void glFramebufferTextureLayerEXT(@org.lwjgl.system.NativeType("GLenum") int r6, @org.lwjgl.system.NativeType("GLenum") int r7, @org.lwjgl.system.NativeType("GLuint") int r8, @org.lwjgl.system.NativeType("GLint") int r9, @org.lwjgl.system.NativeType("GLint") int r10) {
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            org.lwjgl.opengl.EXTTextureArray.glFramebufferTextureLayerEXT(r0, r1, r2, r3, r4)
            return
    }

    public static native void glFramebufferTextureFaceEXT(@org.lwjgl.system.NativeType("GLenum") int r0, @org.lwjgl.system.NativeType("GLenum") int r1, @org.lwjgl.system.NativeType("GLuint") int r2, @org.lwjgl.system.NativeType("GLint") int r3, @org.lwjgl.system.NativeType("GLenum") int r4);

    static {
            org.lwjgl.opengl.GL.initialize()
            return
    }
}
