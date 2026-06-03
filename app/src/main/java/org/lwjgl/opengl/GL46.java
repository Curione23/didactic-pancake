package org.lwjgl.opengl;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/opengl/GL46.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/opengl/GL46.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/opengl/GL46.class */
public class GL46 extends org.lwjgl.opengl.GL45 {
    public static final int GL_PARAMETER_BUFFER = 33006;
    public static final int GL_PARAMETER_BUFFER_BINDING = 33007;
    public static final int GL_VERTICES_SUBMITTED = 33518;
    public static final int GL_PRIMITIVES_SUBMITTED = 33519;
    public static final int GL_VERTEX_SHADER_INVOCATIONS = 33520;
    public static final int GL_TESS_CONTROL_SHADER_PATCHES = 33521;
    public static final int GL_TESS_EVALUATION_SHADER_INVOCATIONS = 33522;
    public static final int GL_GEOMETRY_SHADER_PRIMITIVES_EMITTED = 33523;
    public static final int GL_FRAGMENT_SHADER_INVOCATIONS = 33524;
    public static final int GL_COMPUTE_SHADER_INVOCATIONS = 33525;
    public static final int GL_CLIPPING_INPUT_PRIMITIVES = 33526;
    public static final int GL_CLIPPING_OUTPUT_PRIMITIVES = 33527;
    public static final int GL_POLYGON_OFFSET_CLAMP = 36379;
    public static final int GL_CONTEXT_FLAG_NO_ERROR_BIT = 8;
    public static final int GL_SHADER_BINARY_FORMAT_SPIR_V = 38225;
    public static final int GL_SPIR_V_BINARY = 38226;
    public static final int GL_SPIR_V_EXTENSIONS = 38227;
    public static final int GL_NUM_SPIR_V_EXTENSIONS = 38228;
    public static final int GL_TEXTURE_MAX_ANISOTROPY = 34046;
    public static final int GL_MAX_TEXTURE_MAX_ANISOTROPY = 34047;
    public static final int GL_TRANSFORM_FEEDBACK_OVERFLOW = 33516;
    public static final int GL_TRANSFORM_FEEDBACK_STREAM_OVERFLOW = 33517;

    protected GL46() {
            r3 = this;
            r0 = r3
            r0.<init>()
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r1 = r0
            r1.<init>()
            throw r0
    }

    public static void nglMultiDrawArraysIndirectCount(int r8, long r9, long r11, int r13, int r14) {
            r0 = r8
            r1 = r9
            r2 = r11
            r3 = r13
            r4 = r14
            org.lwjgl.opengl.GL46C.nglMultiDrawArraysIndirectCount(r0, r1, r2, r3, r4)
            return
    }

    public static void glMultiDrawArraysIndirectCount(@org.lwjgl.system.NativeType("GLenum") int r7, @org.lwjgl.system.NativeType("void const *") java.nio.ByteBuffer r8, @org.lwjgl.system.NativeType("GLintptr") long r9, @org.lwjgl.system.NativeType("GLsizei") int r11, @org.lwjgl.system.NativeType("GLsizei") int r12) {
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = r11
            r4 = r12
            org.lwjgl.opengl.GL46C.glMultiDrawArraysIndirectCount(r0, r1, r2, r3, r4)
            return
    }

    public static void glMultiDrawArraysIndirectCount(@org.lwjgl.system.NativeType("GLenum") int r8, @org.lwjgl.system.NativeType("void const *") long r9, @org.lwjgl.system.NativeType("GLintptr") long r11, @org.lwjgl.system.NativeType("GLsizei") int r13, @org.lwjgl.system.NativeType("GLsizei") int r14) {
            r0 = r8
            r1 = r9
            r2 = r11
            r3 = r13
            r4 = r14
            org.lwjgl.opengl.GL46C.glMultiDrawArraysIndirectCount(r0, r1, r2, r3, r4)
            return
    }

    public static void glMultiDrawArraysIndirectCount(@org.lwjgl.system.NativeType("GLenum") int r7, @org.lwjgl.system.NativeType("void const *") java.nio.IntBuffer r8, @org.lwjgl.system.NativeType("GLintptr") long r9, @org.lwjgl.system.NativeType("GLsizei") int r11, @org.lwjgl.system.NativeType("GLsizei") int r12) {
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = r11
            r4 = r12
            org.lwjgl.opengl.GL46C.glMultiDrawArraysIndirectCount(r0, r1, r2, r3, r4)
            return
    }

    public static void nglMultiDrawElementsIndirectCount(int r9, int r10, long r11, long r13, int r15, int r16) {
            r0 = r9
            r1 = r10
            r2 = r11
            r3 = r13
            r4 = r15
            r5 = r16
            org.lwjgl.opengl.GL46C.nglMultiDrawElementsIndirectCount(r0, r1, r2, r3, r4, r5)
            return
    }

    public static void glMultiDrawElementsIndirectCount(@org.lwjgl.system.NativeType("GLenum") int r8, @org.lwjgl.system.NativeType("GLenum") int r9, @org.lwjgl.system.NativeType("void const *") java.nio.ByteBuffer r10, @org.lwjgl.system.NativeType("GLintptr") long r11, @org.lwjgl.system.NativeType("GLsizei") int r13, @org.lwjgl.system.NativeType("GLsizei") int r14) {
            r0 = r8
            r1 = r9
            r2 = r10
            r3 = r11
            r4 = r13
            r5 = r14
            org.lwjgl.opengl.GL46C.glMultiDrawElementsIndirectCount(r0, r1, r2, r3, r4, r5)
            return
    }

    public static void glMultiDrawElementsIndirectCount(@org.lwjgl.system.NativeType("GLenum") int r9, @org.lwjgl.system.NativeType("GLenum") int r10, @org.lwjgl.system.NativeType("void const *") long r11, @org.lwjgl.system.NativeType("GLintptr") long r13, @org.lwjgl.system.NativeType("GLsizei") int r15, @org.lwjgl.system.NativeType("GLsizei") int r16) {
            r0 = r9
            r1 = r10
            r2 = r11
            r3 = r13
            r4 = r15
            r5 = r16
            org.lwjgl.opengl.GL46C.glMultiDrawElementsIndirectCount(r0, r1, r2, r3, r4, r5)
            return
    }

    public static void glMultiDrawElementsIndirectCount(@org.lwjgl.system.NativeType("GLenum") int r8, @org.lwjgl.system.NativeType("GLenum") int r9, @org.lwjgl.system.NativeType("void const *") java.nio.IntBuffer r10, @org.lwjgl.system.NativeType("GLintptr") long r11, @org.lwjgl.system.NativeType("GLsizei") int r13, @org.lwjgl.system.NativeType("GLsizei") int r14) {
            r0 = r8
            r1 = r9
            r2 = r10
            r3 = r11
            r4 = r13
            r5 = r14
            org.lwjgl.opengl.GL46C.glMultiDrawElementsIndirectCount(r0, r1, r2, r3, r4, r5)
            return
    }

    public static void glPolygonOffsetClamp(@org.lwjgl.system.NativeType("GLfloat") float r4, @org.lwjgl.system.NativeType("GLfloat") float r5, @org.lwjgl.system.NativeType("GLfloat") float r6) {
            r0 = r4
            r1 = r5
            r2 = r6
            org.lwjgl.opengl.GL46C.glPolygonOffsetClamp(r0, r1, r2)
            return
    }

    public static void nglSpecializeShader(int r9, long r10, int r12, long r13, long r15) {
            r0 = r9
            r1 = r10
            r2 = r12
            r3 = r13
            r4 = r15
            org.lwjgl.opengl.GL46C.nglSpecializeShader(r0, r1, r2, r3, r4)
            return
    }

    public static void glSpecializeShader(@org.lwjgl.system.NativeType("GLuint") int r5, @org.lwjgl.system.NativeType("GLchar const *") java.nio.ByteBuffer r6, @javax.annotation.Nullable @org.lwjgl.system.NativeType("GLuint const *") java.nio.IntBuffer r7, @javax.annotation.Nullable @org.lwjgl.system.NativeType("GLuint const *") java.nio.IntBuffer r8) {
            r0 = r5
            r1 = r6
            r2 = r7
            r3 = r8
            org.lwjgl.opengl.GL46C.glSpecializeShader(r0, r1, r2, r3)
            return
    }

    public static void glSpecializeShader(@org.lwjgl.system.NativeType("GLuint") int r5, @org.lwjgl.system.NativeType("GLchar const *") java.lang.CharSequence r6, @javax.annotation.Nullable @org.lwjgl.system.NativeType("GLuint const *") java.nio.IntBuffer r7, @javax.annotation.Nullable @org.lwjgl.system.NativeType("GLuint const *") java.nio.IntBuffer r8) {
            r0 = r5
            r1 = r6
            r2 = r7
            r3 = r8
            org.lwjgl.opengl.GL46C.glSpecializeShader(r0, r1, r2, r3)
            return
    }

    public static void glMultiDrawArraysIndirectCount(@org.lwjgl.system.NativeType("GLenum") int r7, @org.lwjgl.system.NativeType("void const *") int[] r8, @org.lwjgl.system.NativeType("GLintptr") long r9, @org.lwjgl.system.NativeType("GLsizei") int r11, @org.lwjgl.system.NativeType("GLsizei") int r12) {
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = r11
            r4 = r12
            org.lwjgl.opengl.GL46C.glMultiDrawArraysIndirectCount(r0, r1, r2, r3, r4)
            return
    }

    public static void glMultiDrawElementsIndirectCount(@org.lwjgl.system.NativeType("GLenum") int r8, @org.lwjgl.system.NativeType("GLenum") int r9, @org.lwjgl.system.NativeType("void const *") int[] r10, @org.lwjgl.system.NativeType("GLintptr") long r11, @org.lwjgl.system.NativeType("GLsizei") int r13, @org.lwjgl.system.NativeType("GLsizei") int r14) {
            r0 = r8
            r1 = r9
            r2 = r10
            r3 = r11
            r4 = r13
            r5 = r14
            org.lwjgl.opengl.GL46C.glMultiDrawElementsIndirectCount(r0, r1, r2, r3, r4, r5)
            return
    }

    public static void glSpecializeShader(@org.lwjgl.system.NativeType("GLuint") int r5, @org.lwjgl.system.NativeType("GLchar const *") java.nio.ByteBuffer r6, @javax.annotation.Nullable @org.lwjgl.system.NativeType("GLuint const *") int[] r7, @javax.annotation.Nullable @org.lwjgl.system.NativeType("GLuint const *") int[] r8) {
            r0 = r5
            r1 = r6
            r2 = r7
            r3 = r8
            org.lwjgl.opengl.GL46C.glSpecializeShader(r0, r1, r2, r3)
            return
    }

    public static void glSpecializeShader(@org.lwjgl.system.NativeType("GLuint") int r5, @org.lwjgl.system.NativeType("GLchar const *") java.lang.CharSequence r6, @javax.annotation.Nullable @org.lwjgl.system.NativeType("GLuint const *") int[] r7, @javax.annotation.Nullable @org.lwjgl.system.NativeType("GLuint const *") int[] r8) {
            r0 = r5
            r1 = r6
            r2 = r7
            r3 = r8
            org.lwjgl.opengl.GL46C.glSpecializeShader(r0, r1, r2, r3)
            return
    }

    static {
            org.lwjgl.opengl.GL.initialize()
            return
    }
}
