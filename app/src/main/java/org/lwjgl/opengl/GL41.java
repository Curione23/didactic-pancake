package org.lwjgl.opengl;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/opengl/GL41.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/opengl/GL41.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/opengl/GL41.class */
public class GL41 extends org.lwjgl.opengl.GL40 {
    public static final int GL_SHADER_COMPILER = 36346;
    public static final int GL_SHADER_BINARY_FORMATS = 36344;
    public static final int GL_NUM_SHADER_BINARY_FORMATS = 36345;
    public static final int GL_MAX_VERTEX_UNIFORM_VECTORS = 36347;
    public static final int GL_MAX_VARYING_VECTORS = 36348;
    public static final int GL_MAX_FRAGMENT_UNIFORM_VECTORS = 36349;
    public static final int GL_IMPLEMENTATION_COLOR_READ_TYPE = 35738;
    public static final int GL_IMPLEMENTATION_COLOR_READ_FORMAT = 35739;
    public static final int GL_FIXED = 5132;
    public static final int GL_LOW_FLOAT = 36336;
    public static final int GL_MEDIUM_FLOAT = 36337;
    public static final int GL_HIGH_FLOAT = 36338;
    public static final int GL_LOW_INT = 36339;
    public static final int GL_MEDIUM_INT = 36340;
    public static final int GL_HIGH_INT = 36341;
    public static final int GL_RGB565 = 36194;
    public static final int GL_PROGRAM_BINARY_RETRIEVABLE_HINT = 33367;
    public static final int GL_PROGRAM_BINARY_LENGTH = 34625;
    public static final int GL_NUM_PROGRAM_BINARY_FORMATS = 34814;
    public static final int GL_PROGRAM_BINARY_FORMATS = 34815;
    public static final int GL_VERTEX_SHADER_BIT = 1;
    public static final int GL_FRAGMENT_SHADER_BIT = 2;
    public static final int GL_GEOMETRY_SHADER_BIT = 4;
    public static final int GL_TESS_CONTROL_SHADER_BIT = 8;
    public static final int GL_TESS_EVALUATION_SHADER_BIT = 16;
    public static final int GL_ALL_SHADER_BITS = -1;
    public static final int GL_PROGRAM_SEPARABLE = 33368;
    public static final int GL_ACTIVE_PROGRAM = 33369;
    public static final int GL_PROGRAM_PIPELINE_BINDING = 33370;
    public static final int GL_MAX_VIEWPORTS = 33371;
    public static final int GL_VIEWPORT_SUBPIXEL_BITS = 33372;
    public static final int GL_VIEWPORT_BOUNDS_RANGE = 33373;
    public static final int GL_LAYER_PROVOKING_VERTEX = 33374;
    public static final int GL_VIEWPORT_INDEX_PROVOKING_VERTEX = 33375;
    public static final int GL_UNDEFINED_VERTEX = 33376;

    protected GL41() {
            r3 = this;
            r0 = r3
            r0.<init>()
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r1 = r0
            r1.<init>()
            throw r0
    }

    public static void glReleaseShaderCompiler() {
            org.lwjgl.opengl.GL41C.glReleaseShaderCompiler()
            return
    }

    public static void nglShaderBinary(int r8, long r9, int r11, long r12, int r14) {
            r0 = r8
            r1 = r9
            r2 = r11
            r3 = r12
            r4 = r14
            org.lwjgl.opengl.GL41C.nglShaderBinary(r0, r1, r2, r3, r4)
            return
    }

    public static void glShaderBinary(@org.lwjgl.system.NativeType("GLuint const *") java.nio.IntBuffer r4, @org.lwjgl.system.NativeType("GLenum") int r5, @org.lwjgl.system.NativeType("void const *") java.nio.ByteBuffer r6) {
            r0 = r4
            r1 = r5
            r2 = r6
            org.lwjgl.opengl.GL41C.glShaderBinary(r0, r1, r2)
            return
    }

    public static void nglGetShaderPrecisionFormat(int r7, int r8, long r9, long r11) {
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = r11
            org.lwjgl.opengl.GL41C.nglGetShaderPrecisionFormat(r0, r1, r2, r3)
            return
    }

    public static void glGetShaderPrecisionFormat(@org.lwjgl.system.NativeType("GLenum") int r5, @org.lwjgl.system.NativeType("GLenum") int r6, @org.lwjgl.system.NativeType("GLint *") java.nio.IntBuffer r7, @org.lwjgl.system.NativeType("GLint *") java.nio.IntBuffer r8) {
            r0 = r5
            r1 = r6
            r2 = r7
            r3 = r8
            org.lwjgl.opengl.GL41C.glGetShaderPrecisionFormat(r0, r1, r2, r3)
            return
    }

    @org.lwjgl.system.NativeType("void")
    public static int glGetShaderPrecisionFormat(@org.lwjgl.system.NativeType("GLenum") int r4, @org.lwjgl.system.NativeType("GLenum") int r5, @org.lwjgl.system.NativeType("GLint *") java.nio.IntBuffer r6) {
            r0 = r4
            r1 = r5
            r2 = r6
            int r0 = org.lwjgl.opengl.GL41C.glGetShaderPrecisionFormat(r0, r1, r2)
            return r0
    }

    public static void glDepthRangef(@org.lwjgl.system.NativeType("GLfloat") float r3, @org.lwjgl.system.NativeType("GLfloat") float r4) {
            r0 = r3
            r1 = r4
            org.lwjgl.opengl.GL41C.glDepthRangef(r0, r1)
            return
    }

    public static void glClearDepthf(@org.lwjgl.system.NativeType("GLfloat") float r2) {
            r0 = r2
            org.lwjgl.opengl.GL41C.glClearDepthf(r0)
            return
    }

    public static void nglGetProgramBinary(int r9, int r10, long r11, long r13, long r15) {
            r0 = r9
            r1 = r10
            r2 = r11
            r3 = r13
            r4 = r15
            org.lwjgl.opengl.GL41C.nglGetProgramBinary(r0, r1, r2, r3, r4)
            return
    }

    public static void glGetProgramBinary(@org.lwjgl.system.NativeType("GLuint") int r5, @javax.annotation.Nullable @org.lwjgl.system.NativeType("GLsizei *") java.nio.IntBuffer r6, @org.lwjgl.system.NativeType("GLenum *") java.nio.IntBuffer r7, @org.lwjgl.system.NativeType("void *") java.nio.ByteBuffer r8) {
            r0 = r5
            r1 = r6
            r2 = r7
            r3 = r8
            org.lwjgl.opengl.GL41C.glGetProgramBinary(r0, r1, r2, r3)
            return
    }

    public static void nglProgramBinary(int r6, int r7, long r8, int r10) {
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r10
            org.lwjgl.opengl.GL41C.nglProgramBinary(r0, r1, r2, r3)
            return
    }

    public static void glProgramBinary(@org.lwjgl.system.NativeType("GLuint") int r4, @org.lwjgl.system.NativeType("GLenum") int r5, @org.lwjgl.system.NativeType("void const *") java.nio.ByteBuffer r6) {
            r0 = r4
            r1 = r5
            r2 = r6
            org.lwjgl.opengl.GL41C.glProgramBinary(r0, r1, r2)
            return
    }

    public static void glProgramParameteri(@org.lwjgl.system.NativeType("GLuint") int r4, @org.lwjgl.system.NativeType("GLenum") int r5, @org.lwjgl.system.NativeType("GLint") int r6) {
            r0 = r4
            r1 = r5
            r2 = r6
            org.lwjgl.opengl.GL41C.glProgramParameteri(r0, r1, r2)
            return
    }

    public static void glUseProgramStages(@org.lwjgl.system.NativeType("GLuint") int r4, @org.lwjgl.system.NativeType("GLbitfield") int r5, @org.lwjgl.system.NativeType("GLuint") int r6) {
            r0 = r4
            r1 = r5
            r2 = r6
            org.lwjgl.opengl.GL41C.glUseProgramStages(r0, r1, r2)
            return
    }

    public static void glActiveShaderProgram(@org.lwjgl.system.NativeType("GLuint") int r3, @org.lwjgl.system.NativeType("GLuint") int r4) {
            r0 = r3
            r1 = r4
            org.lwjgl.opengl.GL41C.glActiveShaderProgram(r0, r1)
            return
    }

    public static int nglCreateShaderProgramv(int r5, int r6, long r7) {
            r0 = r5
            r1 = r6
            r2 = r7
            int r0 = org.lwjgl.opengl.GL41C.nglCreateShaderProgramv(r0, r1, r2)
            return r0
    }

    @org.lwjgl.system.NativeType("GLuint")
    public static int glCreateShaderProgramv(@org.lwjgl.system.NativeType("GLenum") int r3, @org.lwjgl.system.NativeType("GLchar const * const *") org.lwjgl.PointerBuffer r4) {
            r0 = r3
            r1 = r4
            int r0 = org.lwjgl.opengl.GL41C.glCreateShaderProgramv(r0, r1)
            return r0
    }

    @org.lwjgl.system.NativeType("GLuint")
    public static int glCreateShaderProgramv(@org.lwjgl.system.NativeType("GLenum") int r3, @org.lwjgl.system.NativeType("GLchar const * const *") java.lang.CharSequence... r4) {
            r0 = r3
            r1 = r4
            int r0 = org.lwjgl.opengl.GL41C.glCreateShaderProgramv(r0, r1)
            return r0
    }

    @org.lwjgl.system.NativeType("GLuint")
    public static int glCreateShaderProgramv(@org.lwjgl.system.NativeType("GLenum") int r3, @org.lwjgl.system.NativeType("GLchar const * const *") java.lang.CharSequence r4) {
            r0 = r3
            r1 = r4
            int r0 = org.lwjgl.opengl.GL41C.glCreateShaderProgramv(r0, r1)
            return r0
    }

    public static void glBindProgramPipeline(@org.lwjgl.system.NativeType("GLuint") int r2) {
            r0 = r2
            org.lwjgl.opengl.GL41C.glBindProgramPipeline(r0)
            return
    }

    public static void nglDeleteProgramPipelines(int r4, long r5) {
            r0 = r4
            r1 = r5
            org.lwjgl.opengl.GL41C.nglDeleteProgramPipelines(r0, r1)
            return
    }

    public static void glDeleteProgramPipelines(@org.lwjgl.system.NativeType("GLuint const *") java.nio.IntBuffer r2) {
            r0 = r2
            org.lwjgl.opengl.GL41C.glDeleteProgramPipelines(r0)
            return
    }

    public static void glDeleteProgramPipelines(@org.lwjgl.system.NativeType("GLuint const *") int r2) {
            r0 = r2
            org.lwjgl.opengl.GL41C.glDeleteProgramPipelines(r0)
            return
    }

    public static void nglGenProgramPipelines(int r4, long r5) {
            r0 = r4
            r1 = r5
            org.lwjgl.opengl.GL41C.nglGenProgramPipelines(r0, r1)
            return
    }

    public static void glGenProgramPipelines(@org.lwjgl.system.NativeType("GLuint *") java.nio.IntBuffer r2) {
            r0 = r2
            org.lwjgl.opengl.GL41C.glGenProgramPipelines(r0)
            return
    }

    @org.lwjgl.system.NativeType("void")
    public static int glGenProgramPipelines() {
            int r0 = org.lwjgl.opengl.GL41C.glGenProgramPipelines()
            return r0
    }

    @org.lwjgl.system.NativeType("GLboolean")
    public static boolean glIsProgramPipeline(@org.lwjgl.system.NativeType("GLuint") int r2) {
            r0 = r2
            boolean r0 = org.lwjgl.opengl.GL41C.glIsProgramPipeline(r0)
            return r0
    }

    public static void nglGetProgramPipelineiv(int r5, int r6, long r7) {
            r0 = r5
            r1 = r6
            r2 = r7
            org.lwjgl.opengl.GL41C.nglGetProgramPipelineiv(r0, r1, r2)
            return
    }

    public static void glGetProgramPipelineiv(@org.lwjgl.system.NativeType("GLuint") int r4, @org.lwjgl.system.NativeType("GLenum") int r5, @org.lwjgl.system.NativeType("GLint *") java.nio.IntBuffer r6) {
            r0 = r4
            r1 = r5
            r2 = r6
            org.lwjgl.opengl.GL41C.glGetProgramPipelineiv(r0, r1, r2)
            return
    }

    @org.lwjgl.system.NativeType("void")
    public static int glGetProgramPipelinei(@org.lwjgl.system.NativeType("GLuint") int r3, @org.lwjgl.system.NativeType("GLenum") int r4) {
            r0 = r3
            r1 = r4
            int r0 = org.lwjgl.opengl.GL41C.glGetProgramPipelinei(r0, r1)
            return r0
    }

    public static void glProgramUniform1i(@org.lwjgl.system.NativeType("GLuint") int r4, @org.lwjgl.system.NativeType("GLint") int r5, @org.lwjgl.system.NativeType("GLint") int r6) {
            r0 = r4
            r1 = r5
            r2 = r6
            org.lwjgl.opengl.GL41C.glProgramUniform1i(r0, r1, r2)
            return
    }

    public static void glProgramUniform2i(@org.lwjgl.system.NativeType("GLuint") int r5, @org.lwjgl.system.NativeType("GLint") int r6, @org.lwjgl.system.NativeType("GLint") int r7, @org.lwjgl.system.NativeType("GLint") int r8) {
            r0 = r5
            r1 = r6
            r2 = r7
            r3 = r8
            org.lwjgl.opengl.GL41C.glProgramUniform2i(r0, r1, r2, r3)
            return
    }

    public static void glProgramUniform3i(@org.lwjgl.system.NativeType("GLuint") int r6, @org.lwjgl.system.NativeType("GLint") int r7, @org.lwjgl.system.NativeType("GLint") int r8, @org.lwjgl.system.NativeType("GLint") int r9, @org.lwjgl.system.NativeType("GLint") int r10) {
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            org.lwjgl.opengl.GL41C.glProgramUniform3i(r0, r1, r2, r3, r4)
            return
    }

    public static void glProgramUniform4i(@org.lwjgl.system.NativeType("GLuint") int r7, @org.lwjgl.system.NativeType("GLint") int r8, @org.lwjgl.system.NativeType("GLint") int r9, @org.lwjgl.system.NativeType("GLint") int r10, @org.lwjgl.system.NativeType("GLint") int r11, @org.lwjgl.system.NativeType("GLint") int r12) {
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            r5 = r12
            org.lwjgl.opengl.GL41C.glProgramUniform4i(r0, r1, r2, r3, r4, r5)
            return
    }

    public static void glProgramUniform1ui(@org.lwjgl.system.NativeType("GLuint") int r4, @org.lwjgl.system.NativeType("GLint") int r5, @org.lwjgl.system.NativeType("GLuint") int r6) {
            r0 = r4
            r1 = r5
            r2 = r6
            org.lwjgl.opengl.GL41C.glProgramUniform1ui(r0, r1, r2)
            return
    }

    public static void glProgramUniform2ui(@org.lwjgl.system.NativeType("GLuint") int r5, @org.lwjgl.system.NativeType("GLint") int r6, @org.lwjgl.system.NativeType("GLuint") int r7, @org.lwjgl.system.NativeType("GLuint") int r8) {
            r0 = r5
            r1 = r6
            r2 = r7
            r3 = r8
            org.lwjgl.opengl.GL41C.glProgramUniform2ui(r0, r1, r2, r3)
            return
    }

    public static void glProgramUniform3ui(@org.lwjgl.system.NativeType("GLuint") int r6, @org.lwjgl.system.NativeType("GLint") int r7, @org.lwjgl.system.NativeType("GLuint") int r8, @org.lwjgl.system.NativeType("GLuint") int r9, @org.lwjgl.system.NativeType("GLuint") int r10) {
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            org.lwjgl.opengl.GL41C.glProgramUniform3ui(r0, r1, r2, r3, r4)
            return
    }

    public static void glProgramUniform4ui(@org.lwjgl.system.NativeType("GLuint") int r7, @org.lwjgl.system.NativeType("GLint") int r8, @org.lwjgl.system.NativeType("GLuint") int r9, @org.lwjgl.system.NativeType("GLuint") int r10, @org.lwjgl.system.NativeType("GLuint") int r11, @org.lwjgl.system.NativeType("GLuint") int r12) {
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            r5 = r12
            org.lwjgl.opengl.GL41C.glProgramUniform4ui(r0, r1, r2, r3, r4, r5)
            return
    }

    public static void glProgramUniform1f(@org.lwjgl.system.NativeType("GLuint") int r4, @org.lwjgl.system.NativeType("GLint") int r5, @org.lwjgl.system.NativeType("GLfloat") float r6) {
            r0 = r4
            r1 = r5
            r2 = r6
            org.lwjgl.opengl.GL41C.glProgramUniform1f(r0, r1, r2)
            return
    }

    public static void glProgramUniform2f(@org.lwjgl.system.NativeType("GLuint") int r5, @org.lwjgl.system.NativeType("GLint") int r6, @org.lwjgl.system.NativeType("GLfloat") float r7, @org.lwjgl.system.NativeType("GLfloat") float r8) {
            r0 = r5
            r1 = r6
            r2 = r7
            r3 = r8
            org.lwjgl.opengl.GL41C.glProgramUniform2f(r0, r1, r2, r3)
            return
    }

    public static void glProgramUniform3f(@org.lwjgl.system.NativeType("GLuint") int r6, @org.lwjgl.system.NativeType("GLint") int r7, @org.lwjgl.system.NativeType("GLfloat") float r8, @org.lwjgl.system.NativeType("GLfloat") float r9, @org.lwjgl.system.NativeType("GLfloat") float r10) {
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            org.lwjgl.opengl.GL41C.glProgramUniform3f(r0, r1, r2, r3, r4)
            return
    }

    public static void glProgramUniform4f(@org.lwjgl.system.NativeType("GLuint") int r7, @org.lwjgl.system.NativeType("GLint") int r8, @org.lwjgl.system.NativeType("GLfloat") float r9, @org.lwjgl.system.NativeType("GLfloat") float r10, @org.lwjgl.system.NativeType("GLfloat") float r11, @org.lwjgl.system.NativeType("GLfloat") float r12) {
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            r5 = r12
            org.lwjgl.opengl.GL41C.glProgramUniform4f(r0, r1, r2, r3, r4, r5)
            return
    }

    public static void glProgramUniform1d(@org.lwjgl.system.NativeType("GLuint") int r5, @org.lwjgl.system.NativeType("GLint") int r6, @org.lwjgl.system.NativeType("GLdouble") double r7) {
            r0 = r5
            r1 = r6
            r2 = r7
            org.lwjgl.opengl.GL41C.glProgramUniform1d(r0, r1, r2)
            return
    }

    public static void glProgramUniform2d(@org.lwjgl.system.NativeType("GLuint") int r7, @org.lwjgl.system.NativeType("GLint") int r8, @org.lwjgl.system.NativeType("GLdouble") double r9, @org.lwjgl.system.NativeType("GLdouble") double r11) {
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = r11
            org.lwjgl.opengl.GL41C.glProgramUniform2d(r0, r1, r2, r3)
            return
    }

    public static void glProgramUniform3d(@org.lwjgl.system.NativeType("GLuint") int r9, @org.lwjgl.system.NativeType("GLint") int r10, @org.lwjgl.system.NativeType("GLdouble") double r11, @org.lwjgl.system.NativeType("GLdouble") double r13, @org.lwjgl.system.NativeType("GLdouble") double r15) {
            r0 = r9
            r1 = r10
            r2 = r11
            r3 = r13
            r4 = r15
            org.lwjgl.opengl.GL41C.glProgramUniform3d(r0, r1, r2, r3, r4)
            return
    }

    public static void glProgramUniform4d(@org.lwjgl.system.NativeType("GLuint") int r11, @org.lwjgl.system.NativeType("GLint") int r12, @org.lwjgl.system.NativeType("GLdouble") double r13, @org.lwjgl.system.NativeType("GLdouble") double r15, @org.lwjgl.system.NativeType("GLdouble") double r17, @org.lwjgl.system.NativeType("GLdouble") double r19) {
            r0 = r11
            r1 = r12
            r2 = r13
            r3 = r15
            r4 = r17
            r5 = r19
            org.lwjgl.opengl.GL41C.glProgramUniform4d(r0, r1, r2, r3, r4, r5)
            return
    }

    public static void nglProgramUniform1iv(int r6, int r7, int r8, long r9) {
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            org.lwjgl.opengl.GL41C.nglProgramUniform1iv(r0, r1, r2, r3)
            return
    }

    public static void glProgramUniform1iv(@org.lwjgl.system.NativeType("GLuint") int r4, @org.lwjgl.system.NativeType("GLint") int r5, @org.lwjgl.system.NativeType("GLint const *") java.nio.IntBuffer r6) {
            r0 = r4
            r1 = r5
            r2 = r6
            org.lwjgl.opengl.GL41C.glProgramUniform1iv(r0, r1, r2)
            return
    }

    public static void nglProgramUniform2iv(int r6, int r7, int r8, long r9) {
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            org.lwjgl.opengl.GL41C.nglProgramUniform2iv(r0, r1, r2, r3)
            return
    }

    public static void glProgramUniform2iv(@org.lwjgl.system.NativeType("GLuint") int r4, @org.lwjgl.system.NativeType("GLint") int r5, @org.lwjgl.system.NativeType("GLint const *") java.nio.IntBuffer r6) {
            r0 = r4
            r1 = r5
            r2 = r6
            org.lwjgl.opengl.GL41C.glProgramUniform2iv(r0, r1, r2)
            return
    }

    public static void nglProgramUniform3iv(int r6, int r7, int r8, long r9) {
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            org.lwjgl.opengl.GL41C.nglProgramUniform3iv(r0, r1, r2, r3)
            return
    }

    public static void glProgramUniform3iv(@org.lwjgl.system.NativeType("GLuint") int r4, @org.lwjgl.system.NativeType("GLint") int r5, @org.lwjgl.system.NativeType("GLint const *") java.nio.IntBuffer r6) {
            r0 = r4
            r1 = r5
            r2 = r6
            org.lwjgl.opengl.GL41C.glProgramUniform3iv(r0, r1, r2)
            return
    }

    public static void nglProgramUniform4iv(int r6, int r7, int r8, long r9) {
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            org.lwjgl.opengl.GL41C.nglProgramUniform4iv(r0, r1, r2, r3)
            return
    }

    public static void glProgramUniform4iv(@org.lwjgl.system.NativeType("GLuint") int r4, @org.lwjgl.system.NativeType("GLint") int r5, @org.lwjgl.system.NativeType("GLint const *") java.nio.IntBuffer r6) {
            r0 = r4
            r1 = r5
            r2 = r6
            org.lwjgl.opengl.GL41C.glProgramUniform4iv(r0, r1, r2)
            return
    }

    public static void nglProgramUniform1uiv(int r6, int r7, int r8, long r9) {
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            org.lwjgl.opengl.GL41C.nglProgramUniform1uiv(r0, r1, r2, r3)
            return
    }

    public static void glProgramUniform1uiv(@org.lwjgl.system.NativeType("GLuint") int r4, @org.lwjgl.system.NativeType("GLint") int r5, @org.lwjgl.system.NativeType("GLuint const *") java.nio.IntBuffer r6) {
            r0 = r4
            r1 = r5
            r2 = r6
            org.lwjgl.opengl.GL41C.glProgramUniform1uiv(r0, r1, r2)
            return
    }

    public static void nglProgramUniform2uiv(int r6, int r7, int r8, long r9) {
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            org.lwjgl.opengl.GL41C.nglProgramUniform2uiv(r0, r1, r2, r3)
            return
    }

    public static void glProgramUniform2uiv(@org.lwjgl.system.NativeType("GLuint") int r4, @org.lwjgl.system.NativeType("GLint") int r5, @org.lwjgl.system.NativeType("GLuint const *") java.nio.IntBuffer r6) {
            r0 = r4
            r1 = r5
            r2 = r6
            org.lwjgl.opengl.GL41C.glProgramUniform2uiv(r0, r1, r2)
            return
    }

    public static void nglProgramUniform3uiv(int r6, int r7, int r8, long r9) {
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            org.lwjgl.opengl.GL41C.nglProgramUniform3uiv(r0, r1, r2, r3)
            return
    }

    public static void glProgramUniform3uiv(@org.lwjgl.system.NativeType("GLuint") int r4, @org.lwjgl.system.NativeType("GLint") int r5, @org.lwjgl.system.NativeType("GLuint const *") java.nio.IntBuffer r6) {
            r0 = r4
            r1 = r5
            r2 = r6
            org.lwjgl.opengl.GL41C.glProgramUniform3uiv(r0, r1, r2)
            return
    }

    public static void nglProgramUniform4uiv(int r6, int r7, int r8, long r9) {
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            org.lwjgl.opengl.GL41C.nglProgramUniform4uiv(r0, r1, r2, r3)
            return
    }

    public static void glProgramUniform4uiv(@org.lwjgl.system.NativeType("GLuint") int r4, @org.lwjgl.system.NativeType("GLint") int r5, @org.lwjgl.system.NativeType("GLuint const *") java.nio.IntBuffer r6) {
            r0 = r4
            r1 = r5
            r2 = r6
            org.lwjgl.opengl.GL41C.glProgramUniform4uiv(r0, r1, r2)
            return
    }

    public static void nglProgramUniform1fv(int r6, int r7, int r8, long r9) {
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            org.lwjgl.opengl.GL41C.nglProgramUniform1fv(r0, r1, r2, r3)
            return
    }

    public static void glProgramUniform1fv(@org.lwjgl.system.NativeType("GLuint") int r4, @org.lwjgl.system.NativeType("GLint") int r5, @org.lwjgl.system.NativeType("GLfloat const *") java.nio.FloatBuffer r6) {
            r0 = r4
            r1 = r5
            r2 = r6
            org.lwjgl.opengl.GL41C.glProgramUniform1fv(r0, r1, r2)
            return
    }

    public static void nglProgramUniform2fv(int r6, int r7, int r8, long r9) {
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            org.lwjgl.opengl.GL41C.nglProgramUniform2fv(r0, r1, r2, r3)
            return
    }

    public static void glProgramUniform2fv(@org.lwjgl.system.NativeType("GLuint") int r4, @org.lwjgl.system.NativeType("GLint") int r5, @org.lwjgl.system.NativeType("GLfloat const *") java.nio.FloatBuffer r6) {
            r0 = r4
            r1 = r5
            r2 = r6
            org.lwjgl.opengl.GL41C.glProgramUniform2fv(r0, r1, r2)
            return
    }

    public static void nglProgramUniform3fv(int r6, int r7, int r8, long r9) {
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            org.lwjgl.opengl.GL41C.nglProgramUniform3fv(r0, r1, r2, r3)
            return
    }

    public static void glProgramUniform3fv(@org.lwjgl.system.NativeType("GLuint") int r4, @org.lwjgl.system.NativeType("GLint") int r5, @org.lwjgl.system.NativeType("GLfloat const *") java.nio.FloatBuffer r6) {
            r0 = r4
            r1 = r5
            r2 = r6
            org.lwjgl.opengl.GL41C.glProgramUniform3fv(r0, r1, r2)
            return
    }

    public static void nglProgramUniform4fv(int r6, int r7, int r8, long r9) {
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            org.lwjgl.opengl.GL41C.nglProgramUniform4fv(r0, r1, r2, r3)
            return
    }

    public static void glProgramUniform4fv(@org.lwjgl.system.NativeType("GLuint") int r4, @org.lwjgl.system.NativeType("GLint") int r5, @org.lwjgl.system.NativeType("GLfloat const *") java.nio.FloatBuffer r6) {
            r0 = r4
            r1 = r5
            r2 = r6
            org.lwjgl.opengl.GL41C.glProgramUniform4fv(r0, r1, r2)
            return
    }

    public static void nglProgramUniform1dv(int r6, int r7, int r8, long r9) {
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            org.lwjgl.opengl.GL41C.nglProgramUniform1dv(r0, r1, r2, r3)
            return
    }

    public static void glProgramUniform1dv(@org.lwjgl.system.NativeType("GLuint") int r4, @org.lwjgl.system.NativeType("GLint") int r5, @org.lwjgl.system.NativeType("GLdouble const *") java.nio.DoubleBuffer r6) {
            r0 = r4
            r1 = r5
            r2 = r6
            org.lwjgl.opengl.GL41C.glProgramUniform1dv(r0, r1, r2)
            return
    }

    public static void nglProgramUniform2dv(int r6, int r7, int r8, long r9) {
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            org.lwjgl.opengl.GL41C.nglProgramUniform2dv(r0, r1, r2, r3)
            return
    }

    public static void glProgramUniform2dv(@org.lwjgl.system.NativeType("GLuint") int r4, @org.lwjgl.system.NativeType("GLint") int r5, @org.lwjgl.system.NativeType("GLdouble const *") java.nio.DoubleBuffer r6) {
            r0 = r4
            r1 = r5
            r2 = r6
            org.lwjgl.opengl.GL41C.glProgramUniform2dv(r0, r1, r2)
            return
    }

    public static void nglProgramUniform3dv(int r6, int r7, int r8, long r9) {
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            org.lwjgl.opengl.GL41C.nglProgramUniform3dv(r0, r1, r2, r3)
            return
    }

    public static void glProgramUniform3dv(@org.lwjgl.system.NativeType("GLuint") int r4, @org.lwjgl.system.NativeType("GLint") int r5, @org.lwjgl.system.NativeType("GLdouble const *") java.nio.DoubleBuffer r6) {
            r0 = r4
            r1 = r5
            r2 = r6
            org.lwjgl.opengl.GL41C.glProgramUniform3dv(r0, r1, r2)
            return
    }

    public static void nglProgramUniform4dv(int r6, int r7, int r8, long r9) {
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            org.lwjgl.opengl.GL41C.nglProgramUniform4dv(r0, r1, r2, r3)
            return
    }

    public static void glProgramUniform4dv(@org.lwjgl.system.NativeType("GLuint") int r4, @org.lwjgl.system.NativeType("GLint") int r5, @org.lwjgl.system.NativeType("GLdouble const *") java.nio.DoubleBuffer r6) {
            r0 = r4
            r1 = r5
            r2 = r6
            org.lwjgl.opengl.GL41C.glProgramUniform4dv(r0, r1, r2)
            return
    }

    public static void nglProgramUniformMatrix2fv(int r7, int r8, int r9, boolean r10, long r11) {
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            org.lwjgl.opengl.GL41C.nglProgramUniformMatrix2fv(r0, r1, r2, r3, r4)
            return
    }

    public static void glProgramUniformMatrix2fv(@org.lwjgl.system.NativeType("GLuint") int r5, @org.lwjgl.system.NativeType("GLint") int r6, @org.lwjgl.system.NativeType("GLboolean") boolean r7, @org.lwjgl.system.NativeType("GLfloat const *") java.nio.FloatBuffer r8) {
            r0 = r5
            r1 = r6
            r2 = r7
            r3 = r8
            org.lwjgl.opengl.GL41C.glProgramUniformMatrix2fv(r0, r1, r2, r3)
            return
    }

    public static void nglProgramUniformMatrix3fv(int r7, int r8, int r9, boolean r10, long r11) {
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            org.lwjgl.opengl.GL41C.nglProgramUniformMatrix3fv(r0, r1, r2, r3, r4)
            return
    }

    public static void glProgramUniformMatrix3fv(@org.lwjgl.system.NativeType("GLuint") int r5, @org.lwjgl.system.NativeType("GLint") int r6, @org.lwjgl.system.NativeType("GLboolean") boolean r7, @org.lwjgl.system.NativeType("GLfloat const *") java.nio.FloatBuffer r8) {
            r0 = r5
            r1 = r6
            r2 = r7
            r3 = r8
            org.lwjgl.opengl.GL41C.glProgramUniformMatrix3fv(r0, r1, r2, r3)
            return
    }

    public static void nglProgramUniformMatrix4fv(int r7, int r8, int r9, boolean r10, long r11) {
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            org.lwjgl.opengl.GL41C.nglProgramUniformMatrix4fv(r0, r1, r2, r3, r4)
            return
    }

    public static void glProgramUniformMatrix4fv(@org.lwjgl.system.NativeType("GLuint") int r5, @org.lwjgl.system.NativeType("GLint") int r6, @org.lwjgl.system.NativeType("GLboolean") boolean r7, @org.lwjgl.system.NativeType("GLfloat const *") java.nio.FloatBuffer r8) {
            r0 = r5
            r1 = r6
            r2 = r7
            r3 = r8
            org.lwjgl.opengl.GL41C.glProgramUniformMatrix4fv(r0, r1, r2, r3)
            return
    }

    public static void nglProgramUniformMatrix2dv(int r7, int r8, int r9, boolean r10, long r11) {
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            org.lwjgl.opengl.GL41C.nglProgramUniformMatrix2dv(r0, r1, r2, r3, r4)
            return
    }

    public static void glProgramUniformMatrix2dv(@org.lwjgl.system.NativeType("GLuint") int r5, @org.lwjgl.system.NativeType("GLint") int r6, @org.lwjgl.system.NativeType("GLboolean") boolean r7, @org.lwjgl.system.NativeType("GLdouble const *") java.nio.DoubleBuffer r8) {
            r0 = r5
            r1 = r6
            r2 = r7
            r3 = r8
            org.lwjgl.opengl.GL41C.glProgramUniformMatrix2dv(r0, r1, r2, r3)
            return
    }

    public static void nglProgramUniformMatrix3dv(int r7, int r8, int r9, boolean r10, long r11) {
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            org.lwjgl.opengl.GL41C.nglProgramUniformMatrix3dv(r0, r1, r2, r3, r4)
            return
    }

    public static void glProgramUniformMatrix3dv(@org.lwjgl.system.NativeType("GLuint") int r5, @org.lwjgl.system.NativeType("GLint") int r6, @org.lwjgl.system.NativeType("GLboolean") boolean r7, @org.lwjgl.system.NativeType("GLdouble const *") java.nio.DoubleBuffer r8) {
            r0 = r5
            r1 = r6
            r2 = r7
            r3 = r8
            org.lwjgl.opengl.GL41C.glProgramUniformMatrix3dv(r0, r1, r2, r3)
            return
    }

    public static void nglProgramUniformMatrix4dv(int r7, int r8, int r9, boolean r10, long r11) {
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            org.lwjgl.opengl.GL41C.nglProgramUniformMatrix4dv(r0, r1, r2, r3, r4)
            return
    }

    public static void glProgramUniformMatrix4dv(@org.lwjgl.system.NativeType("GLuint") int r5, @org.lwjgl.system.NativeType("GLint") int r6, @org.lwjgl.system.NativeType("GLboolean") boolean r7, @org.lwjgl.system.NativeType("GLdouble const *") java.nio.DoubleBuffer r8) {
            r0 = r5
            r1 = r6
            r2 = r7
            r3 = r8
            org.lwjgl.opengl.GL41C.glProgramUniformMatrix4dv(r0, r1, r2, r3)
            return
    }

    public static void nglProgramUniformMatrix2x3fv(int r7, int r8, int r9, boolean r10, long r11) {
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            org.lwjgl.opengl.GL41C.nglProgramUniformMatrix2x3fv(r0, r1, r2, r3, r4)
            return
    }

    public static void glProgramUniformMatrix2x3fv(@org.lwjgl.system.NativeType("GLuint") int r5, @org.lwjgl.system.NativeType("GLint") int r6, @org.lwjgl.system.NativeType("GLboolean") boolean r7, @org.lwjgl.system.NativeType("GLfloat const *") java.nio.FloatBuffer r8) {
            r0 = r5
            r1 = r6
            r2 = r7
            r3 = r8
            org.lwjgl.opengl.GL41C.glProgramUniformMatrix2x3fv(r0, r1, r2, r3)
            return
    }

    public static void nglProgramUniformMatrix3x2fv(int r7, int r8, int r9, boolean r10, long r11) {
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            org.lwjgl.opengl.GL41C.nglProgramUniformMatrix3x2fv(r0, r1, r2, r3, r4)
            return
    }

    public static void glProgramUniformMatrix3x2fv(@org.lwjgl.system.NativeType("GLuint") int r5, @org.lwjgl.system.NativeType("GLint") int r6, @org.lwjgl.system.NativeType("GLboolean") boolean r7, @org.lwjgl.system.NativeType("GLfloat const *") java.nio.FloatBuffer r8) {
            r0 = r5
            r1 = r6
            r2 = r7
            r3 = r8
            org.lwjgl.opengl.GL41C.glProgramUniformMatrix3x2fv(r0, r1, r2, r3)
            return
    }

    public static void nglProgramUniformMatrix2x4fv(int r7, int r8, int r9, boolean r10, long r11) {
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            org.lwjgl.opengl.GL41C.nglProgramUniformMatrix2x4fv(r0, r1, r2, r3, r4)
            return
    }

    public static void glProgramUniformMatrix2x4fv(@org.lwjgl.system.NativeType("GLuint") int r5, @org.lwjgl.system.NativeType("GLint") int r6, @org.lwjgl.system.NativeType("GLboolean") boolean r7, @org.lwjgl.system.NativeType("GLfloat const *") java.nio.FloatBuffer r8) {
            r0 = r5
            r1 = r6
            r2 = r7
            r3 = r8
            org.lwjgl.opengl.GL41C.glProgramUniformMatrix2x4fv(r0, r1, r2, r3)
            return
    }

    public static void nglProgramUniformMatrix4x2fv(int r7, int r8, int r9, boolean r10, long r11) {
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            org.lwjgl.opengl.GL41C.nglProgramUniformMatrix4x2fv(r0, r1, r2, r3, r4)
            return
    }

    public static void glProgramUniformMatrix4x2fv(@org.lwjgl.system.NativeType("GLuint") int r5, @org.lwjgl.system.NativeType("GLint") int r6, @org.lwjgl.system.NativeType("GLboolean") boolean r7, @org.lwjgl.system.NativeType("GLfloat const *") java.nio.FloatBuffer r8) {
            r0 = r5
            r1 = r6
            r2 = r7
            r3 = r8
            org.lwjgl.opengl.GL41C.glProgramUniformMatrix4x2fv(r0, r1, r2, r3)
            return
    }

    public static void nglProgramUniformMatrix3x4fv(int r7, int r8, int r9, boolean r10, long r11) {
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            org.lwjgl.opengl.GL41C.nglProgramUniformMatrix3x4fv(r0, r1, r2, r3, r4)
            return
    }

    public static void glProgramUniformMatrix3x4fv(@org.lwjgl.system.NativeType("GLuint") int r5, @org.lwjgl.system.NativeType("GLint") int r6, @org.lwjgl.system.NativeType("GLboolean") boolean r7, @org.lwjgl.system.NativeType("GLfloat const *") java.nio.FloatBuffer r8) {
            r0 = r5
            r1 = r6
            r2 = r7
            r3 = r8
            org.lwjgl.opengl.GL41C.glProgramUniformMatrix3x4fv(r0, r1, r2, r3)
            return
    }

    public static void nglProgramUniformMatrix4x3fv(int r7, int r8, int r9, boolean r10, long r11) {
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            org.lwjgl.opengl.GL41C.nglProgramUniformMatrix4x3fv(r0, r1, r2, r3, r4)
            return
    }

    public static void glProgramUniformMatrix4x3fv(@org.lwjgl.system.NativeType("GLuint") int r5, @org.lwjgl.system.NativeType("GLint") int r6, @org.lwjgl.system.NativeType("GLboolean") boolean r7, @org.lwjgl.system.NativeType("GLfloat const *") java.nio.FloatBuffer r8) {
            r0 = r5
            r1 = r6
            r2 = r7
            r3 = r8
            org.lwjgl.opengl.GL41C.glProgramUniformMatrix4x3fv(r0, r1, r2, r3)
            return
    }

    public static void nglProgramUniformMatrix2x3dv(int r7, int r8, int r9, boolean r10, long r11) {
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            org.lwjgl.opengl.GL41C.nglProgramUniformMatrix2x3dv(r0, r1, r2, r3, r4)
            return
    }

    public static void glProgramUniformMatrix2x3dv(@org.lwjgl.system.NativeType("GLuint") int r5, @org.lwjgl.system.NativeType("GLint") int r6, @org.lwjgl.system.NativeType("GLboolean") boolean r7, @org.lwjgl.system.NativeType("GLdouble const *") java.nio.DoubleBuffer r8) {
            r0 = r5
            r1 = r6
            r2 = r7
            r3 = r8
            org.lwjgl.opengl.GL41C.glProgramUniformMatrix2x3dv(r0, r1, r2, r3)
            return
    }

    public static void nglProgramUniformMatrix3x2dv(int r7, int r8, int r9, boolean r10, long r11) {
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            org.lwjgl.opengl.GL41C.nglProgramUniformMatrix3x2dv(r0, r1, r2, r3, r4)
            return
    }

    public static void glProgramUniformMatrix3x2dv(@org.lwjgl.system.NativeType("GLuint") int r5, @org.lwjgl.system.NativeType("GLint") int r6, @org.lwjgl.system.NativeType("GLboolean") boolean r7, @org.lwjgl.system.NativeType("GLdouble const *") java.nio.DoubleBuffer r8) {
            r0 = r5
            r1 = r6
            r2 = r7
            r3 = r8
            org.lwjgl.opengl.GL41C.glProgramUniformMatrix3x2dv(r0, r1, r2, r3)
            return
    }

    public static void nglProgramUniformMatrix2x4dv(int r7, int r8, int r9, boolean r10, long r11) {
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            org.lwjgl.opengl.GL41C.nglProgramUniformMatrix2x4dv(r0, r1, r2, r3, r4)
            return
    }

    public static void glProgramUniformMatrix2x4dv(@org.lwjgl.system.NativeType("GLuint") int r5, @org.lwjgl.system.NativeType("GLint") int r6, @org.lwjgl.system.NativeType("GLboolean") boolean r7, @org.lwjgl.system.NativeType("GLdouble const *") java.nio.DoubleBuffer r8) {
            r0 = r5
            r1 = r6
            r2 = r7
            r3 = r8
            org.lwjgl.opengl.GL41C.glProgramUniformMatrix2x4dv(r0, r1, r2, r3)
            return
    }

    public static void nglProgramUniformMatrix4x2dv(int r7, int r8, int r9, boolean r10, long r11) {
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            org.lwjgl.opengl.GL41C.nglProgramUniformMatrix4x2dv(r0, r1, r2, r3, r4)
            return
    }

    public static void glProgramUniformMatrix4x2dv(@org.lwjgl.system.NativeType("GLuint") int r5, @org.lwjgl.system.NativeType("GLint") int r6, @org.lwjgl.system.NativeType("GLboolean") boolean r7, @org.lwjgl.system.NativeType("GLdouble const *") java.nio.DoubleBuffer r8) {
            r0 = r5
            r1 = r6
            r2 = r7
            r3 = r8
            org.lwjgl.opengl.GL41C.glProgramUniformMatrix4x2dv(r0, r1, r2, r3)
            return
    }

    public static void nglProgramUniformMatrix3x4dv(int r7, int r8, int r9, boolean r10, long r11) {
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            org.lwjgl.opengl.GL41C.nglProgramUniformMatrix3x4dv(r0, r1, r2, r3, r4)
            return
    }

    public static void glProgramUniformMatrix3x4dv(@org.lwjgl.system.NativeType("GLuint") int r5, @org.lwjgl.system.NativeType("GLint") int r6, @org.lwjgl.system.NativeType("GLboolean") boolean r7, @org.lwjgl.system.NativeType("GLdouble const *") java.nio.DoubleBuffer r8) {
            r0 = r5
            r1 = r6
            r2 = r7
            r3 = r8
            org.lwjgl.opengl.GL41C.glProgramUniformMatrix3x4dv(r0, r1, r2, r3)
            return
    }

    public static void nglProgramUniformMatrix4x3dv(int r7, int r8, int r9, boolean r10, long r11) {
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            org.lwjgl.opengl.GL41C.nglProgramUniformMatrix4x3dv(r0, r1, r2, r3, r4)
            return
    }

    public static void glProgramUniformMatrix4x3dv(@org.lwjgl.system.NativeType("GLuint") int r5, @org.lwjgl.system.NativeType("GLint") int r6, @org.lwjgl.system.NativeType("GLboolean") boolean r7, @org.lwjgl.system.NativeType("GLdouble const *") java.nio.DoubleBuffer r8) {
            r0 = r5
            r1 = r6
            r2 = r7
            r3 = r8
            org.lwjgl.opengl.GL41C.glProgramUniformMatrix4x3dv(r0, r1, r2, r3)
            return
    }

    public static void glValidateProgramPipeline(@org.lwjgl.system.NativeType("GLuint") int r2) {
            r0 = r2
            org.lwjgl.opengl.GL41C.glValidateProgramPipeline(r0)
            return
    }

    public static void nglGetProgramPipelineInfoLog(int r7, int r8, long r9, long r11) {
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = r11
            org.lwjgl.opengl.GL41C.nglGetProgramPipelineInfoLog(r0, r1, r2, r3)
            return
    }

    public static void glGetProgramPipelineInfoLog(@org.lwjgl.system.NativeType("GLuint") int r4, @javax.annotation.Nullable @org.lwjgl.system.NativeType("GLsizei *") java.nio.IntBuffer r5, @org.lwjgl.system.NativeType("GLchar *") java.nio.ByteBuffer r6) {
            r0 = r4
            r1 = r5
            r2 = r6
            org.lwjgl.opengl.GL41C.glGetProgramPipelineInfoLog(r0, r1, r2)
            return
    }

    @org.lwjgl.system.NativeType("void")
    public static java.lang.String glGetProgramPipelineInfoLog(@org.lwjgl.system.NativeType("GLuint") int r3, @org.lwjgl.system.NativeType("GLsizei") int r4) {
            r0 = r3
            r1 = r4
            java.lang.String r0 = org.lwjgl.opengl.GL41C.glGetProgramPipelineInfoLog(r0, r1)
            return r0
    }

    @org.lwjgl.system.NativeType("void")
    public static java.lang.String glGetProgramPipelineInfoLog(@org.lwjgl.system.NativeType("GLuint") int r4) {
            r0 = r4
            r1 = r4
            r2 = 35716(0x8b84, float:5.0049E-41)
            int r1 = glGetProgramPipelinei(r1, r2)
            java.lang.String r0 = glGetProgramPipelineInfoLog(r0, r1)
            return r0
    }

    public static void glVertexAttribL1d(@org.lwjgl.system.NativeType("GLuint") int r4, @org.lwjgl.system.NativeType("GLdouble") double r5) {
            r0 = r4
            r1 = r5
            org.lwjgl.opengl.GL41C.glVertexAttribL1d(r0, r1)
            return
    }

    public static void glVertexAttribL2d(@org.lwjgl.system.NativeType("GLuint") int r6, @org.lwjgl.system.NativeType("GLdouble") double r7, @org.lwjgl.system.NativeType("GLdouble") double r9) {
            r0 = r6
            r1 = r7
            r2 = r9
            org.lwjgl.opengl.GL41C.glVertexAttribL2d(r0, r1, r2)
            return
    }

    public static void glVertexAttribL3d(@org.lwjgl.system.NativeType("GLuint") int r8, @org.lwjgl.system.NativeType("GLdouble") double r9, @org.lwjgl.system.NativeType("GLdouble") double r11, @org.lwjgl.system.NativeType("GLdouble") double r13) {
            r0 = r8
            r1 = r9
            r2 = r11
            r3 = r13
            org.lwjgl.opengl.GL41C.glVertexAttribL3d(r0, r1, r2, r3)
            return
    }

    public static void glVertexAttribL4d(@org.lwjgl.system.NativeType("GLuint") int r10, @org.lwjgl.system.NativeType("GLdouble") double r11, @org.lwjgl.system.NativeType("GLdouble") double r13, @org.lwjgl.system.NativeType("GLdouble") double r15, @org.lwjgl.system.NativeType("GLdouble") double r17) {
            r0 = r10
            r1 = r11
            r2 = r13
            r3 = r15
            r4 = r17
            org.lwjgl.opengl.GL41C.glVertexAttribL4d(r0, r1, r2, r3, r4)
            return
    }

    public static void nglVertexAttribL1dv(int r4, long r5) {
            r0 = r4
            r1 = r5
            org.lwjgl.opengl.GL41C.nglVertexAttribL1dv(r0, r1)
            return
    }

    public static void glVertexAttribL1dv(@org.lwjgl.system.NativeType("GLuint") int r3, @org.lwjgl.system.NativeType("GLdouble const *") java.nio.DoubleBuffer r4) {
            r0 = r3
            r1 = r4
            org.lwjgl.opengl.GL41C.glVertexAttribL1dv(r0, r1)
            return
    }

    public static void nglVertexAttribL2dv(int r4, long r5) {
            r0 = r4
            r1 = r5
            org.lwjgl.opengl.GL41C.nglVertexAttribL2dv(r0, r1)
            return
    }

    public static void glVertexAttribL2dv(@org.lwjgl.system.NativeType("GLuint") int r3, @org.lwjgl.system.NativeType("GLdouble const *") java.nio.DoubleBuffer r4) {
            r0 = r3
            r1 = r4
            org.lwjgl.opengl.GL41C.glVertexAttribL2dv(r0, r1)
            return
    }

    public static void nglVertexAttribL3dv(int r4, long r5) {
            r0 = r4
            r1 = r5
            org.lwjgl.opengl.GL41C.nglVertexAttribL3dv(r0, r1)
            return
    }

    public static void glVertexAttribL3dv(@org.lwjgl.system.NativeType("GLuint") int r3, @org.lwjgl.system.NativeType("GLdouble const *") java.nio.DoubleBuffer r4) {
            r0 = r3
            r1 = r4
            org.lwjgl.opengl.GL41C.glVertexAttribL3dv(r0, r1)
            return
    }

    public static void nglVertexAttribL4dv(int r4, long r5) {
            r0 = r4
            r1 = r5
            org.lwjgl.opengl.GL41C.nglVertexAttribL4dv(r0, r1)
            return
    }

    public static void glVertexAttribL4dv(@org.lwjgl.system.NativeType("GLuint") int r3, @org.lwjgl.system.NativeType("GLdouble const *") java.nio.DoubleBuffer r4) {
            r0 = r3
            r1 = r4
            org.lwjgl.opengl.GL41C.glVertexAttribL4dv(r0, r1)
            return
    }

    public static void nglVertexAttribLPointer(int r7, int r8, int r9, int r10, long r11) {
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            org.lwjgl.opengl.GL41C.nglVertexAttribLPointer(r0, r1, r2, r3, r4)
            return
    }

    public static void glVertexAttribLPointer(@org.lwjgl.system.NativeType("GLuint") int r6, @org.lwjgl.system.NativeType("GLint") int r7, @org.lwjgl.system.NativeType("GLenum") int r8, @org.lwjgl.system.NativeType("GLsizei") int r9, @org.lwjgl.system.NativeType("void const *") java.nio.ByteBuffer r10) {
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            org.lwjgl.opengl.GL41C.glVertexAttribLPointer(r0, r1, r2, r3, r4)
            return
    }

    public static void glVertexAttribLPointer(@org.lwjgl.system.NativeType("GLuint") int r7, @org.lwjgl.system.NativeType("GLint") int r8, @org.lwjgl.system.NativeType("GLenum") int r9, @org.lwjgl.system.NativeType("GLsizei") int r10, @org.lwjgl.system.NativeType("void const *") long r11) {
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            org.lwjgl.opengl.GL41C.glVertexAttribLPointer(r0, r1, r2, r3, r4)
            return
    }

    public static void glVertexAttribLPointer(@org.lwjgl.system.NativeType("GLuint") int r5, @org.lwjgl.system.NativeType("GLint") int r6, @org.lwjgl.system.NativeType("GLsizei") int r7, @org.lwjgl.system.NativeType("void const *") java.nio.DoubleBuffer r8) {
            r0 = r5
            r1 = r6
            r2 = r7
            r3 = r8
            org.lwjgl.opengl.GL41C.glVertexAttribLPointer(r0, r1, r2, r3)
            return
    }

    public static void nglGetVertexAttribLdv(int r5, int r6, long r7) {
            r0 = r5
            r1 = r6
            r2 = r7
            org.lwjgl.opengl.GL41C.nglGetVertexAttribLdv(r0, r1, r2)
            return
    }

    public static void glGetVertexAttribLdv(@org.lwjgl.system.NativeType("GLuint") int r4, @org.lwjgl.system.NativeType("GLenum") int r5, @org.lwjgl.system.NativeType("GLdouble *") java.nio.DoubleBuffer r6) {
            r0 = r4
            r1 = r5
            r2 = r6
            org.lwjgl.opengl.GL41C.glGetVertexAttribLdv(r0, r1, r2)
            return
    }

    public static void nglViewportArrayv(int r5, int r6, long r7) {
            r0 = r5
            r1 = r6
            r2 = r7
            org.lwjgl.opengl.GL41C.nglViewportArrayv(r0, r1, r2)
            return
    }

    public static void glViewportArrayv(@org.lwjgl.system.NativeType("GLuint") int r3, @org.lwjgl.system.NativeType("GLfloat const *") java.nio.FloatBuffer r4) {
            r0 = r3
            r1 = r4
            org.lwjgl.opengl.GL41C.glViewportArrayv(r0, r1)
            return
    }

    public static void glViewportIndexedf(@org.lwjgl.system.NativeType("GLuint") int r6, @org.lwjgl.system.NativeType("GLfloat") float r7, @org.lwjgl.system.NativeType("GLfloat") float r8, @org.lwjgl.system.NativeType("GLfloat") float r9, @org.lwjgl.system.NativeType("GLfloat") float r10) {
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            org.lwjgl.opengl.GL41C.glViewportIndexedf(r0, r1, r2, r3, r4)
            return
    }

    public static void nglViewportIndexedfv(int r4, long r5) {
            r0 = r4
            r1 = r5
            org.lwjgl.opengl.GL41C.nglViewportIndexedfv(r0, r1)
            return
    }

    public static void glViewportIndexedfv(@org.lwjgl.system.NativeType("GLuint") int r3, @org.lwjgl.system.NativeType("GLfloat const *") java.nio.FloatBuffer r4) {
            r0 = r3
            r1 = r4
            org.lwjgl.opengl.GL41C.glViewportIndexedfv(r0, r1)
            return
    }

    public static void nglScissorArrayv(int r5, int r6, long r7) {
            r0 = r5
            r1 = r6
            r2 = r7
            org.lwjgl.opengl.GL41C.nglScissorArrayv(r0, r1, r2)
            return
    }

    public static void glScissorArrayv(@org.lwjgl.system.NativeType("GLuint") int r3, @org.lwjgl.system.NativeType("GLint const *") java.nio.IntBuffer r4) {
            r0 = r3
            r1 = r4
            org.lwjgl.opengl.GL41C.glScissorArrayv(r0, r1)
            return
    }

    public static void glScissorIndexed(@org.lwjgl.system.NativeType("GLuint") int r6, @org.lwjgl.system.NativeType("GLint") int r7, @org.lwjgl.system.NativeType("GLint") int r8, @org.lwjgl.system.NativeType("GLsizei") int r9, @org.lwjgl.system.NativeType("GLsizei") int r10) {
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            org.lwjgl.opengl.GL41C.glScissorIndexed(r0, r1, r2, r3, r4)
            return
    }

    public static void nglScissorIndexedv(int r4, long r5) {
            r0 = r4
            r1 = r5
            org.lwjgl.opengl.GL41C.nglScissorIndexedv(r0, r1)
            return
    }

    public static void glScissorIndexedv(@org.lwjgl.system.NativeType("GLuint") int r3, @org.lwjgl.system.NativeType("GLint const *") java.nio.IntBuffer r4) {
            r0 = r3
            r1 = r4
            org.lwjgl.opengl.GL41C.glScissorIndexedv(r0, r1)
            return
    }

    public static void nglDepthRangeArrayv(int r5, int r6, long r7) {
            r0 = r5
            r1 = r6
            r2 = r7
            org.lwjgl.opengl.GL41C.nglDepthRangeArrayv(r0, r1, r2)
            return
    }

    public static void glDepthRangeArrayv(@org.lwjgl.system.NativeType("GLuint") int r3, @org.lwjgl.system.NativeType("GLdouble const *") java.nio.DoubleBuffer r4) {
            r0 = r3
            r1 = r4
            org.lwjgl.opengl.GL41C.glDepthRangeArrayv(r0, r1)
            return
    }

    public static void glDepthRangeIndexed(@org.lwjgl.system.NativeType("GLuint") int r6, @org.lwjgl.system.NativeType("GLdouble") double r7, @org.lwjgl.system.NativeType("GLdouble") double r9) {
            r0 = r6
            r1 = r7
            r2 = r9
            org.lwjgl.opengl.GL41C.glDepthRangeIndexed(r0, r1, r2)
            return
    }

    public static void nglGetFloati_v(int r5, int r6, long r7) {
            r0 = r5
            r1 = r6
            r2 = r7
            org.lwjgl.opengl.GL41C.nglGetFloati_v(r0, r1, r2)
            return
    }

    public static void glGetFloati_v(@org.lwjgl.system.NativeType("GLenum") int r4, @org.lwjgl.system.NativeType("GLuint") int r5, @org.lwjgl.system.NativeType("GLfloat *") java.nio.FloatBuffer r6) {
            r0 = r4
            r1 = r5
            r2 = r6
            org.lwjgl.opengl.GL41C.glGetFloati_v(r0, r1, r2)
            return
    }

    @org.lwjgl.system.NativeType("void")
    public static float glGetFloati(@org.lwjgl.system.NativeType("GLenum") int r3, @org.lwjgl.system.NativeType("GLuint") int r4) {
            r0 = r3
            r1 = r4
            float r0 = org.lwjgl.opengl.GL41C.glGetFloati(r0, r1)
            return r0
    }

    public static void nglGetDoublei_v(int r5, int r6, long r7) {
            r0 = r5
            r1 = r6
            r2 = r7
            org.lwjgl.opengl.GL41C.nglGetDoublei_v(r0, r1, r2)
            return
    }

    public static void glGetDoublei_v(@org.lwjgl.system.NativeType("GLenum") int r4, @org.lwjgl.system.NativeType("GLuint") int r5, @org.lwjgl.system.NativeType("GLdouble *") java.nio.DoubleBuffer r6) {
            r0 = r4
            r1 = r5
            r2 = r6
            org.lwjgl.opengl.GL41C.glGetDoublei_v(r0, r1, r2)
            return
    }

    @org.lwjgl.system.NativeType("void")
    public static double glGetDoublei(@org.lwjgl.system.NativeType("GLenum") int r3, @org.lwjgl.system.NativeType("GLuint") int r4) {
            r0 = r3
            r1 = r4
            double r0 = org.lwjgl.opengl.GL41C.glGetDoublei(r0, r1)
            return r0
    }

    public static void glShaderBinary(@org.lwjgl.system.NativeType("GLuint const *") int[] r4, @org.lwjgl.system.NativeType("GLenum") int r5, @org.lwjgl.system.NativeType("void const *") java.nio.ByteBuffer r6) {
            r0 = r4
            r1 = r5
            r2 = r6
            org.lwjgl.opengl.GL41C.glShaderBinary(r0, r1, r2)
            return
    }

    public static void glGetShaderPrecisionFormat(@org.lwjgl.system.NativeType("GLenum") int r5, @org.lwjgl.system.NativeType("GLenum") int r6, @org.lwjgl.system.NativeType("GLint *") int[] r7, @org.lwjgl.system.NativeType("GLint *") int[] r8) {
            r0 = r5
            r1 = r6
            r2 = r7
            r3 = r8
            org.lwjgl.opengl.GL41C.glGetShaderPrecisionFormat(r0, r1, r2, r3)
            return
    }

    public static void glGetProgramBinary(@org.lwjgl.system.NativeType("GLuint") int r5, @javax.annotation.Nullable @org.lwjgl.system.NativeType("GLsizei *") int[] r6, @org.lwjgl.system.NativeType("GLenum *") int[] r7, @org.lwjgl.system.NativeType("void *") java.nio.ByteBuffer r8) {
            r0 = r5
            r1 = r6
            r2 = r7
            r3 = r8
            org.lwjgl.opengl.GL41C.glGetProgramBinary(r0, r1, r2, r3)
            return
    }

    public static void glDeleteProgramPipelines(@org.lwjgl.system.NativeType("GLuint const *") int[] r2) {
            r0 = r2
            org.lwjgl.opengl.GL41C.glDeleteProgramPipelines(r0)
            return
    }

    public static void glGenProgramPipelines(@org.lwjgl.system.NativeType("GLuint *") int[] r2) {
            r0 = r2
            org.lwjgl.opengl.GL41C.glGenProgramPipelines(r0)
            return
    }

    public static void glGetProgramPipelineiv(@org.lwjgl.system.NativeType("GLuint") int r4, @org.lwjgl.system.NativeType("GLenum") int r5, @org.lwjgl.system.NativeType("GLint *") int[] r6) {
            r0 = r4
            r1 = r5
            r2 = r6
            org.lwjgl.opengl.GL41C.glGetProgramPipelineiv(r0, r1, r2)
            return
    }

    public static void glProgramUniform1iv(@org.lwjgl.system.NativeType("GLuint") int r4, @org.lwjgl.system.NativeType("GLint") int r5, @org.lwjgl.system.NativeType("GLint const *") int[] r6) {
            r0 = r4
            r1 = r5
            r2 = r6
            org.lwjgl.opengl.GL41C.glProgramUniform1iv(r0, r1, r2)
            return
    }

    public static void glProgramUniform2iv(@org.lwjgl.system.NativeType("GLuint") int r4, @org.lwjgl.system.NativeType("GLint") int r5, @org.lwjgl.system.NativeType("GLint const *") int[] r6) {
            r0 = r4
            r1 = r5
            r2 = r6
            org.lwjgl.opengl.GL41C.glProgramUniform2iv(r0, r1, r2)
            return
    }

    public static void glProgramUniform3iv(@org.lwjgl.system.NativeType("GLuint") int r4, @org.lwjgl.system.NativeType("GLint") int r5, @org.lwjgl.system.NativeType("GLint const *") int[] r6) {
            r0 = r4
            r1 = r5
            r2 = r6
            org.lwjgl.opengl.GL41C.glProgramUniform3iv(r0, r1, r2)
            return
    }

    public static void glProgramUniform4iv(@org.lwjgl.system.NativeType("GLuint") int r4, @org.lwjgl.system.NativeType("GLint") int r5, @org.lwjgl.system.NativeType("GLint const *") int[] r6) {
            r0 = r4
            r1 = r5
            r2 = r6
            org.lwjgl.opengl.GL41C.glProgramUniform4iv(r0, r1, r2)
            return
    }

    public static void glProgramUniform1uiv(@org.lwjgl.system.NativeType("GLuint") int r4, @org.lwjgl.system.NativeType("GLint") int r5, @org.lwjgl.system.NativeType("GLuint const *") int[] r6) {
            r0 = r4
            r1 = r5
            r2 = r6
            org.lwjgl.opengl.GL41C.glProgramUniform1uiv(r0, r1, r2)
            return
    }

    public static void glProgramUniform2uiv(@org.lwjgl.system.NativeType("GLuint") int r4, @org.lwjgl.system.NativeType("GLint") int r5, @org.lwjgl.system.NativeType("GLuint const *") int[] r6) {
            r0 = r4
            r1 = r5
            r2 = r6
            org.lwjgl.opengl.GL41C.glProgramUniform2uiv(r0, r1, r2)
            return
    }

    public static void glProgramUniform3uiv(@org.lwjgl.system.NativeType("GLuint") int r4, @org.lwjgl.system.NativeType("GLint") int r5, @org.lwjgl.system.NativeType("GLuint const *") int[] r6) {
            r0 = r4
            r1 = r5
            r2 = r6
            org.lwjgl.opengl.GL41C.glProgramUniform3uiv(r0, r1, r2)
            return
    }

    public static void glProgramUniform4uiv(@org.lwjgl.system.NativeType("GLuint") int r4, @org.lwjgl.system.NativeType("GLint") int r5, @org.lwjgl.system.NativeType("GLuint const *") int[] r6) {
            r0 = r4
            r1 = r5
            r2 = r6
            org.lwjgl.opengl.GL41C.glProgramUniform4uiv(r0, r1, r2)
            return
    }

    public static void glProgramUniform1fv(@org.lwjgl.system.NativeType("GLuint") int r4, @org.lwjgl.system.NativeType("GLint") int r5, @org.lwjgl.system.NativeType("GLfloat const *") float[] r6) {
            r0 = r4
            r1 = r5
            r2 = r6
            org.lwjgl.opengl.GL41C.glProgramUniform1fv(r0, r1, r2)
            return
    }

    public static void glProgramUniform2fv(@org.lwjgl.system.NativeType("GLuint") int r4, @org.lwjgl.system.NativeType("GLint") int r5, @org.lwjgl.system.NativeType("GLfloat const *") float[] r6) {
            r0 = r4
            r1 = r5
            r2 = r6
            org.lwjgl.opengl.GL41C.glProgramUniform2fv(r0, r1, r2)
            return
    }

    public static void glProgramUniform3fv(@org.lwjgl.system.NativeType("GLuint") int r4, @org.lwjgl.system.NativeType("GLint") int r5, @org.lwjgl.system.NativeType("GLfloat const *") float[] r6) {
            r0 = r4
            r1 = r5
            r2 = r6
            org.lwjgl.opengl.GL41C.glProgramUniform3fv(r0, r1, r2)
            return
    }

    public static void glProgramUniform4fv(@org.lwjgl.system.NativeType("GLuint") int r4, @org.lwjgl.system.NativeType("GLint") int r5, @org.lwjgl.system.NativeType("GLfloat const *") float[] r6) {
            r0 = r4
            r1 = r5
            r2 = r6
            org.lwjgl.opengl.GL41C.glProgramUniform4fv(r0, r1, r2)
            return
    }

    public static void glProgramUniform1dv(@org.lwjgl.system.NativeType("GLuint") int r4, @org.lwjgl.system.NativeType("GLint") int r5, @org.lwjgl.system.NativeType("GLdouble const *") double[] r6) {
            r0 = r4
            r1 = r5
            r2 = r6
            org.lwjgl.opengl.GL41C.glProgramUniform1dv(r0, r1, r2)
            return
    }

    public static void glProgramUniform2dv(@org.lwjgl.system.NativeType("GLuint") int r4, @org.lwjgl.system.NativeType("GLint") int r5, @org.lwjgl.system.NativeType("GLdouble const *") double[] r6) {
            r0 = r4
            r1 = r5
            r2 = r6
            org.lwjgl.opengl.GL41C.glProgramUniform2dv(r0, r1, r2)
            return
    }

    public static void glProgramUniform3dv(@org.lwjgl.system.NativeType("GLuint") int r4, @org.lwjgl.system.NativeType("GLint") int r5, @org.lwjgl.system.NativeType("GLdouble const *") double[] r6) {
            r0 = r4
            r1 = r5
            r2 = r6
            org.lwjgl.opengl.GL41C.glProgramUniform3dv(r0, r1, r2)
            return
    }

    public static void glProgramUniform4dv(@org.lwjgl.system.NativeType("GLuint") int r4, @org.lwjgl.system.NativeType("GLint") int r5, @org.lwjgl.system.NativeType("GLdouble const *") double[] r6) {
            r0 = r4
            r1 = r5
            r2 = r6
            org.lwjgl.opengl.GL41C.glProgramUniform4dv(r0, r1, r2)
            return
    }

    public static void glProgramUniformMatrix2fv(@org.lwjgl.system.NativeType("GLuint") int r5, @org.lwjgl.system.NativeType("GLint") int r6, @org.lwjgl.system.NativeType("GLboolean") boolean r7, @org.lwjgl.system.NativeType("GLfloat const *") float[] r8) {
            r0 = r5
            r1 = r6
            r2 = r7
            r3 = r8
            org.lwjgl.opengl.GL41C.glProgramUniformMatrix2fv(r0, r1, r2, r3)
            return
    }

    public static void glProgramUniformMatrix3fv(@org.lwjgl.system.NativeType("GLuint") int r5, @org.lwjgl.system.NativeType("GLint") int r6, @org.lwjgl.system.NativeType("GLboolean") boolean r7, @org.lwjgl.system.NativeType("GLfloat const *") float[] r8) {
            r0 = r5
            r1 = r6
            r2 = r7
            r3 = r8
            org.lwjgl.opengl.GL41C.glProgramUniformMatrix3fv(r0, r1, r2, r3)
            return
    }

    public static void glProgramUniformMatrix4fv(@org.lwjgl.system.NativeType("GLuint") int r5, @org.lwjgl.system.NativeType("GLint") int r6, @org.lwjgl.system.NativeType("GLboolean") boolean r7, @org.lwjgl.system.NativeType("GLfloat const *") float[] r8) {
            r0 = r5
            r1 = r6
            r2 = r7
            r3 = r8
            org.lwjgl.opengl.GL41C.glProgramUniformMatrix4fv(r0, r1, r2, r3)
            return
    }

    public static void glProgramUniformMatrix2dv(@org.lwjgl.system.NativeType("GLuint") int r5, @org.lwjgl.system.NativeType("GLint") int r6, @org.lwjgl.system.NativeType("GLboolean") boolean r7, @org.lwjgl.system.NativeType("GLdouble const *") double[] r8) {
            r0 = r5
            r1 = r6
            r2 = r7
            r3 = r8
            org.lwjgl.opengl.GL41C.glProgramUniformMatrix2dv(r0, r1, r2, r3)
            return
    }

    public static void glProgramUniformMatrix3dv(@org.lwjgl.system.NativeType("GLuint") int r5, @org.lwjgl.system.NativeType("GLint") int r6, @org.lwjgl.system.NativeType("GLboolean") boolean r7, @org.lwjgl.system.NativeType("GLdouble const *") double[] r8) {
            r0 = r5
            r1 = r6
            r2 = r7
            r3 = r8
            org.lwjgl.opengl.GL41C.glProgramUniformMatrix3dv(r0, r1, r2, r3)
            return
    }

    public static void glProgramUniformMatrix4dv(@org.lwjgl.system.NativeType("GLuint") int r5, @org.lwjgl.system.NativeType("GLint") int r6, @org.lwjgl.system.NativeType("GLboolean") boolean r7, @org.lwjgl.system.NativeType("GLdouble const *") double[] r8) {
            r0 = r5
            r1 = r6
            r2 = r7
            r3 = r8
            org.lwjgl.opengl.GL41C.glProgramUniformMatrix4dv(r0, r1, r2, r3)
            return
    }

    public static void glProgramUniformMatrix2x3fv(@org.lwjgl.system.NativeType("GLuint") int r5, @org.lwjgl.system.NativeType("GLint") int r6, @org.lwjgl.system.NativeType("GLboolean") boolean r7, @org.lwjgl.system.NativeType("GLfloat const *") float[] r8) {
            r0 = r5
            r1 = r6
            r2 = r7
            r3 = r8
            org.lwjgl.opengl.GL41C.glProgramUniformMatrix2x3fv(r0, r1, r2, r3)
            return
    }

    public static void glProgramUniformMatrix3x2fv(@org.lwjgl.system.NativeType("GLuint") int r5, @org.lwjgl.system.NativeType("GLint") int r6, @org.lwjgl.system.NativeType("GLboolean") boolean r7, @org.lwjgl.system.NativeType("GLfloat const *") float[] r8) {
            r0 = r5
            r1 = r6
            r2 = r7
            r3 = r8
            org.lwjgl.opengl.GL41C.glProgramUniformMatrix3x2fv(r0, r1, r2, r3)
            return
    }

    public static void glProgramUniformMatrix2x4fv(@org.lwjgl.system.NativeType("GLuint") int r5, @org.lwjgl.system.NativeType("GLint") int r6, @org.lwjgl.system.NativeType("GLboolean") boolean r7, @org.lwjgl.system.NativeType("GLfloat const *") float[] r8) {
            r0 = r5
            r1 = r6
            r2 = r7
            r3 = r8
            org.lwjgl.opengl.GL41C.glProgramUniformMatrix2x4fv(r0, r1, r2, r3)
            return
    }

    public static void glProgramUniformMatrix4x2fv(@org.lwjgl.system.NativeType("GLuint") int r5, @org.lwjgl.system.NativeType("GLint") int r6, @org.lwjgl.system.NativeType("GLboolean") boolean r7, @org.lwjgl.system.NativeType("GLfloat const *") float[] r8) {
            r0 = r5
            r1 = r6
            r2 = r7
            r3 = r8
            org.lwjgl.opengl.GL41C.glProgramUniformMatrix4x2fv(r0, r1, r2, r3)
            return
    }

    public static void glProgramUniformMatrix3x4fv(@org.lwjgl.system.NativeType("GLuint") int r5, @org.lwjgl.system.NativeType("GLint") int r6, @org.lwjgl.system.NativeType("GLboolean") boolean r7, @org.lwjgl.system.NativeType("GLfloat const *") float[] r8) {
            r0 = r5
            r1 = r6
            r2 = r7
            r3 = r8
            org.lwjgl.opengl.GL41C.glProgramUniformMatrix3x4fv(r0, r1, r2, r3)
            return
    }

    public static void glProgramUniformMatrix4x3fv(@org.lwjgl.system.NativeType("GLuint") int r5, @org.lwjgl.system.NativeType("GLint") int r6, @org.lwjgl.system.NativeType("GLboolean") boolean r7, @org.lwjgl.system.NativeType("GLfloat const *") float[] r8) {
            r0 = r5
            r1 = r6
            r2 = r7
            r3 = r8
            org.lwjgl.opengl.GL41C.glProgramUniformMatrix4x3fv(r0, r1, r2, r3)
            return
    }

    public static void glProgramUniformMatrix2x3dv(@org.lwjgl.system.NativeType("GLuint") int r5, @org.lwjgl.system.NativeType("GLint") int r6, @org.lwjgl.system.NativeType("GLboolean") boolean r7, @org.lwjgl.system.NativeType("GLdouble const *") double[] r8) {
            r0 = r5
            r1 = r6
            r2 = r7
            r3 = r8
            org.lwjgl.opengl.GL41C.glProgramUniformMatrix2x3dv(r0, r1, r2, r3)
            return
    }

    public static void glProgramUniformMatrix3x2dv(@org.lwjgl.system.NativeType("GLuint") int r5, @org.lwjgl.system.NativeType("GLint") int r6, @org.lwjgl.system.NativeType("GLboolean") boolean r7, @org.lwjgl.system.NativeType("GLdouble const *") double[] r8) {
            r0 = r5
            r1 = r6
            r2 = r7
            r3 = r8
            org.lwjgl.opengl.GL41C.glProgramUniformMatrix3x2dv(r0, r1, r2, r3)
            return
    }

    public static void glProgramUniformMatrix2x4dv(@org.lwjgl.system.NativeType("GLuint") int r5, @org.lwjgl.system.NativeType("GLint") int r6, @org.lwjgl.system.NativeType("GLboolean") boolean r7, @org.lwjgl.system.NativeType("GLdouble const *") double[] r8) {
            r0 = r5
            r1 = r6
            r2 = r7
            r3 = r8
            org.lwjgl.opengl.GL41C.glProgramUniformMatrix2x4dv(r0, r1, r2, r3)
            return
    }

    public static void glProgramUniformMatrix4x2dv(@org.lwjgl.system.NativeType("GLuint") int r5, @org.lwjgl.system.NativeType("GLint") int r6, @org.lwjgl.system.NativeType("GLboolean") boolean r7, @org.lwjgl.system.NativeType("GLdouble const *") double[] r8) {
            r0 = r5
            r1 = r6
            r2 = r7
            r3 = r8
            org.lwjgl.opengl.GL41C.glProgramUniformMatrix4x2dv(r0, r1, r2, r3)
            return
    }

    public static void glProgramUniformMatrix3x4dv(@org.lwjgl.system.NativeType("GLuint") int r5, @org.lwjgl.system.NativeType("GLint") int r6, @org.lwjgl.system.NativeType("GLboolean") boolean r7, @org.lwjgl.system.NativeType("GLdouble const *") double[] r8) {
            r0 = r5
            r1 = r6
            r2 = r7
            r3 = r8
            org.lwjgl.opengl.GL41C.glProgramUniformMatrix3x4dv(r0, r1, r2, r3)
            return
    }

    public static void glProgramUniformMatrix4x3dv(@org.lwjgl.system.NativeType("GLuint") int r5, @org.lwjgl.system.NativeType("GLint") int r6, @org.lwjgl.system.NativeType("GLboolean") boolean r7, @org.lwjgl.system.NativeType("GLdouble const *") double[] r8) {
            r0 = r5
            r1 = r6
            r2 = r7
            r3 = r8
            org.lwjgl.opengl.GL41C.glProgramUniformMatrix4x3dv(r0, r1, r2, r3)
            return
    }

    public static void glGetProgramPipelineInfoLog(@org.lwjgl.system.NativeType("GLuint") int r4, @javax.annotation.Nullable @org.lwjgl.system.NativeType("GLsizei *") int[] r5, @org.lwjgl.system.NativeType("GLchar *") java.nio.ByteBuffer r6) {
            r0 = r4
            r1 = r5
            r2 = r6
            org.lwjgl.opengl.GL41C.glGetProgramPipelineInfoLog(r0, r1, r2)
            return
    }

    public static void glVertexAttribL1dv(@org.lwjgl.system.NativeType("GLuint") int r3, @org.lwjgl.system.NativeType("GLdouble const *") double[] r4) {
            r0 = r3
            r1 = r4
            org.lwjgl.opengl.GL41C.glVertexAttribL1dv(r0, r1)
            return
    }

    public static void glVertexAttribL2dv(@org.lwjgl.system.NativeType("GLuint") int r3, @org.lwjgl.system.NativeType("GLdouble const *") double[] r4) {
            r0 = r3
            r1 = r4
            org.lwjgl.opengl.GL41C.glVertexAttribL2dv(r0, r1)
            return
    }

    public static void glVertexAttribL3dv(@org.lwjgl.system.NativeType("GLuint") int r3, @org.lwjgl.system.NativeType("GLdouble const *") double[] r4) {
            r0 = r3
            r1 = r4
            org.lwjgl.opengl.GL41C.glVertexAttribL3dv(r0, r1)
            return
    }

    public static void glVertexAttribL4dv(@org.lwjgl.system.NativeType("GLuint") int r3, @org.lwjgl.system.NativeType("GLdouble const *") double[] r4) {
            r0 = r3
            r1 = r4
            org.lwjgl.opengl.GL41C.glVertexAttribL4dv(r0, r1)
            return
    }

    public static void glGetVertexAttribLdv(@org.lwjgl.system.NativeType("GLuint") int r4, @org.lwjgl.system.NativeType("GLenum") int r5, @org.lwjgl.system.NativeType("GLdouble *") double[] r6) {
            r0 = r4
            r1 = r5
            r2 = r6
            org.lwjgl.opengl.GL41C.glGetVertexAttribLdv(r0, r1, r2)
            return
    }

    public static void glViewportArrayv(@org.lwjgl.system.NativeType("GLuint") int r3, @org.lwjgl.system.NativeType("GLfloat const *") float[] r4) {
            r0 = r3
            r1 = r4
            org.lwjgl.opengl.GL41C.glViewportArrayv(r0, r1)
            return
    }

    public static void glViewportIndexedfv(@org.lwjgl.system.NativeType("GLuint") int r3, @org.lwjgl.system.NativeType("GLfloat const *") float[] r4) {
            r0 = r3
            r1 = r4
            org.lwjgl.opengl.GL41C.glViewportIndexedfv(r0, r1)
            return
    }

    public static void glScissorArrayv(@org.lwjgl.system.NativeType("GLuint") int r3, @org.lwjgl.system.NativeType("GLint const *") int[] r4) {
            r0 = r3
            r1 = r4
            org.lwjgl.opengl.GL41C.glScissorArrayv(r0, r1)
            return
    }

    public static void glScissorIndexedv(@org.lwjgl.system.NativeType("GLuint") int r3, @org.lwjgl.system.NativeType("GLint const *") int[] r4) {
            r0 = r3
            r1 = r4
            org.lwjgl.opengl.GL41C.glScissorIndexedv(r0, r1)
            return
    }

    public static void glDepthRangeArrayv(@org.lwjgl.system.NativeType("GLuint") int r3, @org.lwjgl.system.NativeType("GLdouble const *") double[] r4) {
            r0 = r3
            r1 = r4
            org.lwjgl.opengl.GL41C.glDepthRangeArrayv(r0, r1)
            return
    }

    public static void glGetFloati_v(@org.lwjgl.system.NativeType("GLenum") int r4, @org.lwjgl.system.NativeType("GLuint") int r5, @org.lwjgl.system.NativeType("GLfloat *") float[] r6) {
            r0 = r4
            r1 = r5
            r2 = r6
            org.lwjgl.opengl.GL41C.glGetFloati_v(r0, r1, r2)
            return
    }

    public static void glGetDoublei_v(@org.lwjgl.system.NativeType("GLenum") int r4, @org.lwjgl.system.NativeType("GLuint") int r5, @org.lwjgl.system.NativeType("GLdouble *") double[] r6) {
            r0 = r4
            r1 = r5
            r2 = r6
            org.lwjgl.opengl.GL41C.glGetDoublei_v(r0, r1, r2)
            return
    }

    static {
            org.lwjgl.opengl.GL.initialize()
            return
    }
}
