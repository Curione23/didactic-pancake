package org.lwjgl.opengl;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/opengl/ARBUniformBufferObject.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/opengl/ARBUniformBufferObject.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/opengl/ARBUniformBufferObject.class */
public class ARBUniformBufferObject {
    public static final int GL_UNIFORM_BUFFER = 35345;
    public static final int GL_UNIFORM_BUFFER_BINDING = 35368;
    public static final int GL_UNIFORM_BUFFER_START = 35369;
    public static final int GL_UNIFORM_BUFFER_SIZE = 35370;
    public static final int GL_MAX_VERTEX_UNIFORM_BLOCKS = 35371;
    public static final int GL_MAX_GEOMETRY_UNIFORM_BLOCKS = 35372;
    public static final int GL_MAX_FRAGMENT_UNIFORM_BLOCKS = 35373;
    public static final int GL_MAX_COMBINED_UNIFORM_BLOCKS = 35374;
    public static final int GL_MAX_UNIFORM_BUFFER_BINDINGS = 35375;
    public static final int GL_MAX_UNIFORM_BLOCK_SIZE = 35376;
    public static final int GL_MAX_COMBINED_VERTEX_UNIFORM_COMPONENTS = 35377;
    public static final int GL_MAX_COMBINED_GEOMETRY_UNIFORM_COMPONENTS = 35378;
    public static final int GL_MAX_COMBINED_FRAGMENT_UNIFORM_COMPONENTS = 35379;
    public static final int GL_UNIFORM_BUFFER_OFFSET_ALIGNMENT = 35380;
    public static final int GL_ACTIVE_UNIFORM_BLOCK_MAX_NAME_LENGTH = 35381;
    public static final int GL_ACTIVE_UNIFORM_BLOCKS = 35382;
    public static final int GL_UNIFORM_TYPE = 35383;
    public static final int GL_UNIFORM_SIZE = 35384;
    public static final int GL_UNIFORM_NAME_LENGTH = 35385;
    public static final int GL_UNIFORM_BLOCK_INDEX = 35386;
    public static final int GL_UNIFORM_OFFSET = 35387;
    public static final int GL_UNIFORM_ARRAY_STRIDE = 35388;
    public static final int GL_UNIFORM_MATRIX_STRIDE = 35389;
    public static final int GL_UNIFORM_IS_ROW_MAJOR = 35390;
    public static final int GL_UNIFORM_BLOCK_BINDING = 35391;
    public static final int GL_UNIFORM_BLOCK_DATA_SIZE = 35392;
    public static final int GL_UNIFORM_BLOCK_NAME_LENGTH = 35393;
    public static final int GL_UNIFORM_BLOCK_ACTIVE_UNIFORMS = 35394;
    public static final int GL_UNIFORM_BLOCK_ACTIVE_UNIFORM_INDICES = 35395;
    public static final int GL_UNIFORM_BLOCK_REFERENCED_BY_VERTEX_SHADER = 35396;
    public static final int GL_UNIFORM_BLOCK_REFERENCED_BY_GEOMETRY_SHADER = 35397;
    public static final int GL_UNIFORM_BLOCK_REFERENCED_BY_FRAGMENT_SHADER = 35398;
    public static final int GL_INVALID_INDEX = -1;

    protected ARBUniformBufferObject() {
            r3 = this;
            r0 = r3
            r0.<init>()
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r1 = r0
            r1.<init>()
            throw r0
    }

    public static void nglGetUniformIndices(int r7, int r8, long r9, long r11) {
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = r11
            org.lwjgl.opengl.GL31C.nglGetUniformIndices(r0, r1, r2, r3)
            return
    }

    public static void glGetUniformIndices(@org.lwjgl.system.NativeType("GLuint") int r4, @org.lwjgl.system.NativeType("GLchar const * const *") org.lwjgl.PointerBuffer r5, @org.lwjgl.system.NativeType("GLuint *") java.nio.IntBuffer r6) {
            r0 = r4
            r1 = r5
            r2 = r6
            org.lwjgl.opengl.GL31C.glGetUniformIndices(r0, r1, r2)
            return
    }

    public static void glGetUniformIndices(@org.lwjgl.system.NativeType("GLuint") int r4, @org.lwjgl.system.NativeType("GLchar const * const *") java.lang.CharSequence[] r5, @org.lwjgl.system.NativeType("GLuint *") java.nio.IntBuffer r6) {
            r0 = r4
            r1 = r5
            r2 = r6
            org.lwjgl.opengl.GL31C.glGetUniformIndices(r0, r1, r2)
            return
    }

    @org.lwjgl.system.NativeType("void")
    public static int glGetUniformIndices(@org.lwjgl.system.NativeType("GLuint") int r3, @org.lwjgl.system.NativeType("GLchar const * const *") java.lang.CharSequence r4) {
            r0 = r3
            r1 = r4
            int r0 = org.lwjgl.opengl.GL31C.glGetUniformIndices(r0, r1)
            return r0
    }

    public static void nglGetActiveUniformsiv(int r8, int r9, long r10, int r12, long r13) {
            r0 = r8
            r1 = r9
            r2 = r10
            r3 = r12
            r4 = r13
            org.lwjgl.opengl.GL31C.nglGetActiveUniformsiv(r0, r1, r2, r3, r4)
            return
    }

    public static void glGetActiveUniformsiv(@org.lwjgl.system.NativeType("GLuint") int r5, @org.lwjgl.system.NativeType("GLuint const *") java.nio.IntBuffer r6, @org.lwjgl.system.NativeType("GLenum") int r7, @org.lwjgl.system.NativeType("GLint *") java.nio.IntBuffer r8) {
            r0 = r5
            r1 = r6
            r2 = r7
            r3 = r8
            org.lwjgl.opengl.GL31C.glGetActiveUniformsiv(r0, r1, r2, r3)
            return
    }

    @org.lwjgl.system.NativeType("void")
    public static int glGetActiveUniformsi(@org.lwjgl.system.NativeType("GLuint") int r4, @org.lwjgl.system.NativeType("GLuint const *") int r5, @org.lwjgl.system.NativeType("GLenum") int r6) {
            r0 = r4
            r1 = r5
            r2 = r6
            int r0 = org.lwjgl.opengl.GL31C.glGetActiveUniformsi(r0, r1, r2)
            return r0
    }

    public static void nglGetActiveUniformName(int r8, int r9, int r10, long r11, long r13) {
            r0 = r8
            r1 = r9
            r2 = r10
            r3 = r11
            r4 = r13
            org.lwjgl.opengl.GL31C.nglGetActiveUniformName(r0, r1, r2, r3, r4)
            return
    }

    public static void glGetActiveUniformName(@org.lwjgl.system.NativeType("GLuint") int r5, @org.lwjgl.system.NativeType("GLuint") int r6, @javax.annotation.Nullable @org.lwjgl.system.NativeType("GLsizei *") java.nio.IntBuffer r7, @org.lwjgl.system.NativeType("GLchar *") java.nio.ByteBuffer r8) {
            r0 = r5
            r1 = r6
            r2 = r7
            r3 = r8
            org.lwjgl.opengl.GL31C.glGetActiveUniformName(r0, r1, r2, r3)
            return
    }

    @org.lwjgl.system.NativeType("void")
    public static java.lang.String glGetActiveUniformName(@org.lwjgl.system.NativeType("GLuint") int r4, @org.lwjgl.system.NativeType("GLuint") int r5, @org.lwjgl.system.NativeType("GLsizei") int r6) {
            r0 = r4
            r1 = r5
            r2 = r6
            java.lang.String r0 = org.lwjgl.opengl.GL31C.glGetActiveUniformName(r0, r1, r2)
            return r0
    }

    @org.lwjgl.system.NativeType("void")
    public static java.lang.String glGetActiveUniformName(@org.lwjgl.system.NativeType("GLuint") int r6, @org.lwjgl.system.NativeType("GLuint") int r7) {
            r0 = r6
            r1 = r7
            r2 = r6
            r3 = r7
            r4 = 35385(0x8a39, float:4.9585E-41)
            int r2 = glGetActiveUniformsi(r2, r3, r4)
            java.lang.String r0 = glGetActiveUniformName(r0, r1, r2)
            return r0
    }

    public static int nglGetUniformBlockIndex(int r4, long r5) {
            r0 = r4
            r1 = r5
            int r0 = org.lwjgl.opengl.GL31C.nglGetUniformBlockIndex(r0, r1)
            return r0
    }

    @org.lwjgl.system.NativeType("GLuint")
    public static int glGetUniformBlockIndex(@org.lwjgl.system.NativeType("GLuint") int r3, @org.lwjgl.system.NativeType("GLchar const *") java.nio.ByteBuffer r4) {
            r0 = r3
            r1 = r4
            int r0 = org.lwjgl.opengl.GL31C.glGetUniformBlockIndex(r0, r1)
            return r0
    }

    @org.lwjgl.system.NativeType("GLuint")
    public static int glGetUniformBlockIndex(@org.lwjgl.system.NativeType("GLuint") int r3, @org.lwjgl.system.NativeType("GLchar const *") java.lang.CharSequence r4) {
            r0 = r3
            r1 = r4
            int r0 = org.lwjgl.opengl.GL31C.glGetUniformBlockIndex(r0, r1)
            return r0
    }

    public static void nglGetActiveUniformBlockiv(int r6, int r7, int r8, long r9) {
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            org.lwjgl.opengl.GL31C.nglGetActiveUniformBlockiv(r0, r1, r2, r3)
            return
    }

    public static void glGetActiveUniformBlockiv(@org.lwjgl.system.NativeType("GLuint") int r5, @org.lwjgl.system.NativeType("GLuint") int r6, @org.lwjgl.system.NativeType("GLenum") int r7, @org.lwjgl.system.NativeType("GLint *") java.nio.IntBuffer r8) {
            r0 = r5
            r1 = r6
            r2 = r7
            r3 = r8
            org.lwjgl.opengl.GL31C.glGetActiveUniformBlockiv(r0, r1, r2, r3)
            return
    }

    @org.lwjgl.system.NativeType("void")
    public static int glGetActiveUniformBlocki(@org.lwjgl.system.NativeType("GLuint") int r4, @org.lwjgl.system.NativeType("GLuint") int r5, @org.lwjgl.system.NativeType("GLenum") int r6) {
            r0 = r4
            r1 = r5
            r2 = r6
            int r0 = org.lwjgl.opengl.GL31C.glGetActiveUniformBlocki(r0, r1, r2)
            return r0
    }

    public static void nglGetActiveUniformBlockName(int r8, int r9, int r10, long r11, long r13) {
            r0 = r8
            r1 = r9
            r2 = r10
            r3 = r11
            r4 = r13
            org.lwjgl.opengl.GL31C.nglGetActiveUniformBlockName(r0, r1, r2, r3, r4)
            return
    }

    public static void glGetActiveUniformBlockName(@org.lwjgl.system.NativeType("GLuint") int r5, @org.lwjgl.system.NativeType("GLuint") int r6, @javax.annotation.Nullable @org.lwjgl.system.NativeType("GLsizei *") java.nio.IntBuffer r7, @org.lwjgl.system.NativeType("GLchar *") java.nio.ByteBuffer r8) {
            r0 = r5
            r1 = r6
            r2 = r7
            r3 = r8
            org.lwjgl.opengl.GL31C.glGetActiveUniformBlockName(r0, r1, r2, r3)
            return
    }

    @org.lwjgl.system.NativeType("void")
    public static java.lang.String glGetActiveUniformBlockName(@org.lwjgl.system.NativeType("GLuint") int r4, @org.lwjgl.system.NativeType("GLuint") int r5, @org.lwjgl.system.NativeType("GLsizei") int r6) {
            r0 = r4
            r1 = r5
            r2 = r6
            java.lang.String r0 = org.lwjgl.opengl.GL31C.glGetActiveUniformBlockName(r0, r1, r2)
            return r0
    }

    @org.lwjgl.system.NativeType("void")
    public static java.lang.String glGetActiveUniformBlockName(@org.lwjgl.system.NativeType("GLuint") int r6, @org.lwjgl.system.NativeType("GLuint") int r7) {
            r0 = r6
            r1 = r7
            r2 = r6
            r3 = r7
            r4 = 35393(0x8a41, float:4.9596E-41)
            int r2 = glGetActiveUniformBlocki(r2, r3, r4)
            java.lang.String r0 = glGetActiveUniformBlockName(r0, r1, r2)
            return r0
    }

    public static void glBindBufferRange(@org.lwjgl.system.NativeType("GLenum") int r8, @org.lwjgl.system.NativeType("GLuint") int r9, @org.lwjgl.system.NativeType("GLuint") int r10, @org.lwjgl.system.NativeType("GLintptr") long r11, @org.lwjgl.system.NativeType("GLsizeiptr") long r13) {
            r0 = r8
            r1 = r9
            r2 = r10
            r3 = r11
            r4 = r13
            org.lwjgl.opengl.GL30C.glBindBufferRange(r0, r1, r2, r3, r4)
            return
    }

    public static void glBindBufferBase(@org.lwjgl.system.NativeType("GLenum") int r4, @org.lwjgl.system.NativeType("GLuint") int r5, @org.lwjgl.system.NativeType("GLuint") int r6) {
            r0 = r4
            r1 = r5
            r2 = r6
            org.lwjgl.opengl.GL30C.glBindBufferBase(r0, r1, r2)
            return
    }

    public static void nglGetIntegeri_v(int r5, int r6, long r7) {
            r0 = r5
            r1 = r6
            r2 = r7
            org.lwjgl.opengl.GL30C.nglGetIntegeri_v(r0, r1, r2)
            return
    }

    public static void glGetIntegeri_v(@org.lwjgl.system.NativeType("GLenum") int r4, @org.lwjgl.system.NativeType("GLuint") int r5, @org.lwjgl.system.NativeType("GLint *") java.nio.IntBuffer r6) {
            r0 = r4
            r1 = r5
            r2 = r6
            org.lwjgl.opengl.GL30C.glGetIntegeri_v(r0, r1, r2)
            return
    }

    @org.lwjgl.system.NativeType("void")
    public static int glGetIntegeri(@org.lwjgl.system.NativeType("GLenum") int r3, @org.lwjgl.system.NativeType("GLuint") int r4) {
            r0 = r3
            r1 = r4
            int r0 = org.lwjgl.opengl.GL30C.glGetIntegeri(r0, r1)
            return r0
    }

    public static void glUniformBlockBinding(@org.lwjgl.system.NativeType("GLuint") int r4, @org.lwjgl.system.NativeType("GLuint") int r5, @org.lwjgl.system.NativeType("GLuint") int r6) {
            r0 = r4
            r1 = r5
            r2 = r6
            org.lwjgl.opengl.GL31C.glUniformBlockBinding(r0, r1, r2)
            return
    }

    public static void glGetUniformIndices(@org.lwjgl.system.NativeType("GLuint") int r4, @org.lwjgl.system.NativeType("GLchar const * const *") org.lwjgl.PointerBuffer r5, @org.lwjgl.system.NativeType("GLuint *") int[] r6) {
            r0 = r4
            r1 = r5
            r2 = r6
            org.lwjgl.opengl.GL31C.glGetUniformIndices(r0, r1, r2)
            return
    }

    public static void glGetActiveUniformsiv(@org.lwjgl.system.NativeType("GLuint") int r5, @org.lwjgl.system.NativeType("GLuint const *") int[] r6, @org.lwjgl.system.NativeType("GLenum") int r7, @org.lwjgl.system.NativeType("GLint *") int[] r8) {
            r0 = r5
            r1 = r6
            r2 = r7
            r3 = r8
            org.lwjgl.opengl.GL31C.glGetActiveUniformsiv(r0, r1, r2, r3)
            return
    }

    public static void glGetActiveUniformName(@org.lwjgl.system.NativeType("GLuint") int r5, @org.lwjgl.system.NativeType("GLuint") int r6, @javax.annotation.Nullable @org.lwjgl.system.NativeType("GLsizei *") int[] r7, @org.lwjgl.system.NativeType("GLchar *") java.nio.ByteBuffer r8) {
            r0 = r5
            r1 = r6
            r2 = r7
            r3 = r8
            org.lwjgl.opengl.GL31C.glGetActiveUniformName(r0, r1, r2, r3)
            return
    }

    public static void glGetActiveUniformBlockiv(@org.lwjgl.system.NativeType("GLuint") int r5, @org.lwjgl.system.NativeType("GLuint") int r6, @org.lwjgl.system.NativeType("GLenum") int r7, @org.lwjgl.system.NativeType("GLint *") int[] r8) {
            r0 = r5
            r1 = r6
            r2 = r7
            r3 = r8
            org.lwjgl.opengl.GL31C.glGetActiveUniformBlockiv(r0, r1, r2, r3)
            return
    }

    public static void glGetActiveUniformBlockName(@org.lwjgl.system.NativeType("GLuint") int r5, @org.lwjgl.system.NativeType("GLuint") int r6, @javax.annotation.Nullable @org.lwjgl.system.NativeType("GLsizei *") int[] r7, @org.lwjgl.system.NativeType("GLchar *") java.nio.ByteBuffer r8) {
            r0 = r5
            r1 = r6
            r2 = r7
            r3 = r8
            org.lwjgl.opengl.GL31C.glGetActiveUniformBlockName(r0, r1, r2, r3)
            return
    }

    public static void glGetIntegeri_v(@org.lwjgl.system.NativeType("GLenum") int r4, @org.lwjgl.system.NativeType("GLuint") int r5, @org.lwjgl.system.NativeType("GLint *") int[] r6) {
            r0 = r4
            r1 = r5
            r2 = r6
            org.lwjgl.opengl.GL30C.glGetIntegeri_v(r0, r1, r2)
            return
    }

    static {
            org.lwjgl.opengl.GL.initialize()
            return
    }
}
