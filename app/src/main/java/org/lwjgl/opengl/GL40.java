package org.lwjgl.opengl;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/opengl/GL40.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/opengl/GL40.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/opengl/GL40.class */
public class GL40 extends org.lwjgl.opengl.GL33 {
    public static final int GL_DRAW_INDIRECT_BUFFER = 36671;
    public static final int GL_DRAW_INDIRECT_BUFFER_BINDING = 36675;
    public static final int GL_GEOMETRY_SHADER_INVOCATIONS = 34943;
    public static final int GL_MAX_GEOMETRY_SHADER_INVOCATIONS = 36442;
    public static final int GL_MIN_FRAGMENT_INTERPOLATION_OFFSET = 36443;
    public static final int GL_MAX_FRAGMENT_INTERPOLATION_OFFSET = 36444;
    public static final int GL_FRAGMENT_INTERPOLATION_OFFSET_BITS = 36445;
    public static final int GL_DOUBLE_VEC2 = 36860;
    public static final int GL_DOUBLE_VEC3 = 36861;
    public static final int GL_DOUBLE_VEC4 = 36862;
    public static final int GL_DOUBLE_MAT2 = 36678;
    public static final int GL_DOUBLE_MAT3 = 36679;
    public static final int GL_DOUBLE_MAT4 = 36680;
    public static final int GL_DOUBLE_MAT2x3 = 36681;
    public static final int GL_DOUBLE_MAT2x4 = 36682;
    public static final int GL_DOUBLE_MAT3x2 = 36683;
    public static final int GL_DOUBLE_MAT3x4 = 36684;
    public static final int GL_DOUBLE_MAT4x2 = 36685;
    public static final int GL_DOUBLE_MAT4x3 = 36686;
    public static final int GL_SAMPLE_SHADING = 35894;
    public static final int GL_MIN_SAMPLE_SHADING_VALUE = 35895;
    public static final int GL_ACTIVE_SUBROUTINES = 36325;
    public static final int GL_ACTIVE_SUBROUTINE_UNIFORMS = 36326;
    public static final int GL_ACTIVE_SUBROUTINE_UNIFORM_LOCATIONS = 36423;
    public static final int GL_ACTIVE_SUBROUTINE_MAX_LENGTH = 36424;
    public static final int GL_ACTIVE_SUBROUTINE_UNIFORM_MAX_LENGTH = 36425;
    public static final int GL_MAX_SUBROUTINES = 36327;
    public static final int GL_MAX_SUBROUTINE_UNIFORM_LOCATIONS = 36328;
    public static final int GL_NUM_COMPATIBLE_SUBROUTINES = 36426;
    public static final int GL_COMPATIBLE_SUBROUTINES = 36427;
    public static final int GL_PATCHES = 14;
    public static final int GL_PATCH_VERTICES = 36466;
    public static final int GL_PATCH_DEFAULT_INNER_LEVEL = 36467;
    public static final int GL_PATCH_DEFAULT_OUTER_LEVEL = 36468;
    public static final int GL_TESS_CONTROL_OUTPUT_VERTICES = 36469;
    public static final int GL_TESS_GEN_MODE = 36470;
    public static final int GL_TESS_GEN_SPACING = 36471;
    public static final int GL_TESS_GEN_VERTEX_ORDER = 36472;
    public static final int GL_TESS_GEN_POINT_MODE = 36473;
    public static final int GL_ISOLINES = 36474;
    public static final int GL_FRACTIONAL_ODD = 36475;
    public static final int GL_FRACTIONAL_EVEN = 36476;
    public static final int GL_MAX_PATCH_VERTICES = 36477;
    public static final int GL_MAX_TESS_GEN_LEVEL = 36478;
    public static final int GL_MAX_TESS_CONTROL_UNIFORM_COMPONENTS = 36479;
    public static final int GL_MAX_TESS_EVALUATION_UNIFORM_COMPONENTS = 36480;
    public static final int GL_MAX_TESS_CONTROL_TEXTURE_IMAGE_UNITS = 36481;
    public static final int GL_MAX_TESS_EVALUATION_TEXTURE_IMAGE_UNITS = 36482;
    public static final int GL_MAX_TESS_CONTROL_OUTPUT_COMPONENTS = 36483;
    public static final int GL_MAX_TESS_PATCH_COMPONENTS = 36484;
    public static final int GL_MAX_TESS_CONTROL_TOTAL_OUTPUT_COMPONENTS = 36485;
    public static final int GL_MAX_TESS_EVALUATION_OUTPUT_COMPONENTS = 36486;
    public static final int GL_MAX_TESS_CONTROL_UNIFORM_BLOCKS = 36489;
    public static final int GL_MAX_TESS_EVALUATION_UNIFORM_BLOCKS = 36490;
    public static final int GL_MAX_TESS_CONTROL_INPUT_COMPONENTS = 34924;
    public static final int GL_MAX_TESS_EVALUATION_INPUT_COMPONENTS = 34925;
    public static final int GL_MAX_COMBINED_TESS_CONTROL_UNIFORM_COMPONENTS = 36382;
    public static final int GL_MAX_COMBINED_TESS_EVALUATION_UNIFORM_COMPONENTS = 36383;
    public static final int GL_UNIFORM_BLOCK_REFERENCED_BY_TESS_CONTROL_SHADER = 34032;
    public static final int GL_UNIFORM_BLOCK_REFERENCED_BY_TESS_EVALUATION_SHADER = 34033;
    public static final int GL_TESS_EVALUATION_SHADER = 36487;
    public static final int GL_TESS_CONTROL_SHADER = 36488;
    public static final int GL_TEXTURE_CUBE_MAP_ARRAY = 36873;
    public static final int GL_TEXTURE_BINDING_CUBE_MAP_ARRAY = 36874;
    public static final int GL_PROXY_TEXTURE_CUBE_MAP_ARRAY = 36875;
    public static final int GL_SAMPLER_CUBE_MAP_ARRAY = 36876;
    public static final int GL_SAMPLER_CUBE_MAP_ARRAY_SHADOW = 36877;
    public static final int GL_INT_SAMPLER_CUBE_MAP_ARRAY = 36878;
    public static final int GL_UNSIGNED_INT_SAMPLER_CUBE_MAP_ARRAY = 36879;
    public static final int GL_MIN_PROGRAM_TEXTURE_GATHER_OFFSET = 36446;
    public static final int GL_MAX_PROGRAM_TEXTURE_GATHER_OFFSET = 36447;
    public static final int GL_TRANSFORM_FEEDBACK = 36386;
    public static final int GL_TRANSFORM_FEEDBACK_BUFFER_PAUSED = 36387;
    public static final int GL_TRANSFORM_FEEDBACK_BUFFER_ACTIVE = 36388;
    public static final int GL_TRANSFORM_FEEDBACK_BINDING = 36389;
    public static final int GL_MAX_TRANSFORM_FEEDBACK_BUFFERS = 36464;
    public static final int GL_MAX_VERTEX_STREAMS = 36465;

    protected GL40() {
            r3 = this;
            r0 = r3
            r0.<init>()
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r1 = r0
            r1.<init>()
            throw r0
    }

    public static void glBlendEquationi(@org.lwjgl.system.NativeType("GLuint") int r3, @org.lwjgl.system.NativeType("GLenum") int r4) {
            r0 = r3
            r1 = r4
            org.lwjgl.opengl.GL40C.glBlendEquationi(r0, r1)
            return
    }

    public static void glBlendEquationSeparatei(@org.lwjgl.system.NativeType("GLuint") int r4, @org.lwjgl.system.NativeType("GLenum") int r5, @org.lwjgl.system.NativeType("GLenum") int r6) {
            r0 = r4
            r1 = r5
            r2 = r6
            org.lwjgl.opengl.GL40C.glBlendEquationSeparatei(r0, r1, r2)
            return
    }

    public static void glBlendFunci(@org.lwjgl.system.NativeType("GLuint") int r4, @org.lwjgl.system.NativeType("GLenum") int r5, @org.lwjgl.system.NativeType("GLenum") int r6) {
            r0 = r4
            r1 = r5
            r2 = r6
            org.lwjgl.opengl.GL40C.glBlendFunci(r0, r1, r2)
            return
    }

    public static void glBlendFuncSeparatei(@org.lwjgl.system.NativeType("GLuint") int r6, @org.lwjgl.system.NativeType("GLenum") int r7, @org.lwjgl.system.NativeType("GLenum") int r8, @org.lwjgl.system.NativeType("GLenum") int r9, @org.lwjgl.system.NativeType("GLenum") int r10) {
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            org.lwjgl.opengl.GL40C.glBlendFuncSeparatei(r0, r1, r2, r3, r4)
            return
    }

    public static void nglDrawArraysIndirect(int r4, long r5) {
            r0 = r4
            r1 = r5
            org.lwjgl.opengl.GL40C.nglDrawArraysIndirect(r0, r1)
            return
    }

    public static void glDrawArraysIndirect(@org.lwjgl.system.NativeType("GLenum") int r3, @org.lwjgl.system.NativeType("void const *") java.nio.ByteBuffer r4) {
            r0 = r3
            r1 = r4
            org.lwjgl.opengl.GL40C.glDrawArraysIndirect(r0, r1)
            return
    }

    public static void glDrawArraysIndirect(@org.lwjgl.system.NativeType("GLenum") int r4, @org.lwjgl.system.NativeType("void const *") long r5) {
            r0 = r4
            r1 = r5
            org.lwjgl.opengl.GL40C.glDrawArraysIndirect(r0, r1)
            return
    }

    public static void glDrawArraysIndirect(@org.lwjgl.system.NativeType("GLenum") int r3, @org.lwjgl.system.NativeType("void const *") java.nio.IntBuffer r4) {
            r0 = r3
            r1 = r4
            org.lwjgl.opengl.GL40C.glDrawArraysIndirect(r0, r1)
            return
    }

    public static void nglDrawElementsIndirect(int r5, int r6, long r7) {
            r0 = r5
            r1 = r6
            r2 = r7
            org.lwjgl.opengl.GL40C.nglDrawElementsIndirect(r0, r1, r2)
            return
    }

    public static void glDrawElementsIndirect(@org.lwjgl.system.NativeType("GLenum") int r4, @org.lwjgl.system.NativeType("GLenum") int r5, @org.lwjgl.system.NativeType("void const *") java.nio.ByteBuffer r6) {
            r0 = r4
            r1 = r5
            r2 = r6
            org.lwjgl.opengl.GL40C.glDrawElementsIndirect(r0, r1, r2)
            return
    }

    public static void glDrawElementsIndirect(@org.lwjgl.system.NativeType("GLenum") int r5, @org.lwjgl.system.NativeType("GLenum") int r6, @org.lwjgl.system.NativeType("void const *") long r7) {
            r0 = r5
            r1 = r6
            r2 = r7
            org.lwjgl.opengl.GL40C.glDrawElementsIndirect(r0, r1, r2)
            return
    }

    public static void glDrawElementsIndirect(@org.lwjgl.system.NativeType("GLenum") int r4, @org.lwjgl.system.NativeType("GLenum") int r5, @org.lwjgl.system.NativeType("void const *") java.nio.IntBuffer r6) {
            r0 = r4
            r1 = r5
            r2 = r6
            org.lwjgl.opengl.GL40C.glDrawElementsIndirect(r0, r1, r2)
            return
    }

    public static void glUniform1d(@org.lwjgl.system.NativeType("GLint") int r4, @org.lwjgl.system.NativeType("GLdouble") double r5) {
            r0 = r4
            r1 = r5
            org.lwjgl.opengl.GL40C.glUniform1d(r0, r1)
            return
    }

    public static void glUniform2d(@org.lwjgl.system.NativeType("GLint") int r6, @org.lwjgl.system.NativeType("GLdouble") double r7, @org.lwjgl.system.NativeType("GLdouble") double r9) {
            r0 = r6
            r1 = r7
            r2 = r9
            org.lwjgl.opengl.GL40C.glUniform2d(r0, r1, r2)
            return
    }

    public static void glUniform3d(@org.lwjgl.system.NativeType("GLint") int r8, @org.lwjgl.system.NativeType("GLdouble") double r9, @org.lwjgl.system.NativeType("GLdouble") double r11, @org.lwjgl.system.NativeType("GLdouble") double r13) {
            r0 = r8
            r1 = r9
            r2 = r11
            r3 = r13
            org.lwjgl.opengl.GL40C.glUniform3d(r0, r1, r2, r3)
            return
    }

    public static void glUniform4d(@org.lwjgl.system.NativeType("GLint") int r10, @org.lwjgl.system.NativeType("GLdouble") double r11, @org.lwjgl.system.NativeType("GLdouble") double r13, @org.lwjgl.system.NativeType("GLdouble") double r15, @org.lwjgl.system.NativeType("GLdouble") double r17) {
            r0 = r10
            r1 = r11
            r2 = r13
            r3 = r15
            r4 = r17
            org.lwjgl.opengl.GL40C.glUniform4d(r0, r1, r2, r3, r4)
            return
    }

    public static void nglUniform1dv(int r5, int r6, long r7) {
            r0 = r5
            r1 = r6
            r2 = r7
            org.lwjgl.opengl.GL40C.nglUniform1dv(r0, r1, r2)
            return
    }

    public static void glUniform1dv(@org.lwjgl.system.NativeType("GLint") int r3, @org.lwjgl.system.NativeType("GLdouble const *") java.nio.DoubleBuffer r4) {
            r0 = r3
            r1 = r4
            org.lwjgl.opengl.GL40C.glUniform1dv(r0, r1)
            return
    }

    public static void nglUniform2dv(int r5, int r6, long r7) {
            r0 = r5
            r1 = r6
            r2 = r7
            org.lwjgl.opengl.GL40C.nglUniform2dv(r0, r1, r2)
            return
    }

    public static void glUniform2dv(@org.lwjgl.system.NativeType("GLint") int r3, @org.lwjgl.system.NativeType("GLdouble const *") java.nio.DoubleBuffer r4) {
            r0 = r3
            r1 = r4
            org.lwjgl.opengl.GL40C.glUniform2dv(r0, r1)
            return
    }

    public static void nglUniform3dv(int r5, int r6, long r7) {
            r0 = r5
            r1 = r6
            r2 = r7
            org.lwjgl.opengl.GL40C.nglUniform3dv(r0, r1, r2)
            return
    }

    public static void glUniform3dv(@org.lwjgl.system.NativeType("GLint") int r3, @org.lwjgl.system.NativeType("GLdouble const *") java.nio.DoubleBuffer r4) {
            r0 = r3
            r1 = r4
            org.lwjgl.opengl.GL40C.glUniform3dv(r0, r1)
            return
    }

    public static void nglUniform4dv(int r5, int r6, long r7) {
            r0 = r5
            r1 = r6
            r2 = r7
            org.lwjgl.opengl.GL40C.nglUniform4dv(r0, r1, r2)
            return
    }

    public static void glUniform4dv(@org.lwjgl.system.NativeType("GLint") int r3, @org.lwjgl.system.NativeType("GLdouble const *") java.nio.DoubleBuffer r4) {
            r0 = r3
            r1 = r4
            org.lwjgl.opengl.GL40C.glUniform4dv(r0, r1)
            return
    }

    public static void nglUniformMatrix2dv(int r6, int r7, boolean r8, long r9) {
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            org.lwjgl.opengl.GL40C.nglUniformMatrix2dv(r0, r1, r2, r3)
            return
    }

    public static void glUniformMatrix2dv(@org.lwjgl.system.NativeType("GLint") int r4, @org.lwjgl.system.NativeType("GLboolean") boolean r5, @org.lwjgl.system.NativeType("GLdouble const *") java.nio.DoubleBuffer r6) {
            r0 = r4
            r1 = r5
            r2 = r6
            org.lwjgl.opengl.GL40C.glUniformMatrix2dv(r0, r1, r2)
            return
    }

    public static void nglUniformMatrix3dv(int r6, int r7, boolean r8, long r9) {
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            org.lwjgl.opengl.GL40C.nglUniformMatrix3dv(r0, r1, r2, r3)
            return
    }

    public static void glUniformMatrix3dv(@org.lwjgl.system.NativeType("GLint") int r4, @org.lwjgl.system.NativeType("GLboolean") boolean r5, @org.lwjgl.system.NativeType("GLdouble const *") java.nio.DoubleBuffer r6) {
            r0 = r4
            r1 = r5
            r2 = r6
            org.lwjgl.opengl.GL40C.glUniformMatrix3dv(r0, r1, r2)
            return
    }

    public static void nglUniformMatrix4dv(int r6, int r7, boolean r8, long r9) {
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            org.lwjgl.opengl.GL40C.nglUniformMatrix4dv(r0, r1, r2, r3)
            return
    }

    public static void glUniformMatrix4dv(@org.lwjgl.system.NativeType("GLint") int r4, @org.lwjgl.system.NativeType("GLboolean") boolean r5, @org.lwjgl.system.NativeType("GLdouble const *") java.nio.DoubleBuffer r6) {
            r0 = r4
            r1 = r5
            r2 = r6
            org.lwjgl.opengl.GL40C.glUniformMatrix4dv(r0, r1, r2)
            return
    }

    public static void nglUniformMatrix2x3dv(int r6, int r7, boolean r8, long r9) {
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            org.lwjgl.opengl.GL40C.nglUniformMatrix2x3dv(r0, r1, r2, r3)
            return
    }

    public static void glUniformMatrix2x3dv(@org.lwjgl.system.NativeType("GLint") int r4, @org.lwjgl.system.NativeType("GLboolean") boolean r5, @org.lwjgl.system.NativeType("GLdouble const *") java.nio.DoubleBuffer r6) {
            r0 = r4
            r1 = r5
            r2 = r6
            org.lwjgl.opengl.GL40C.glUniformMatrix2x3dv(r0, r1, r2)
            return
    }

    public static void nglUniformMatrix2x4dv(int r6, int r7, boolean r8, long r9) {
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            org.lwjgl.opengl.GL40C.nglUniformMatrix2x4dv(r0, r1, r2, r3)
            return
    }

    public static void glUniformMatrix2x4dv(@org.lwjgl.system.NativeType("GLint") int r4, @org.lwjgl.system.NativeType("GLboolean") boolean r5, @org.lwjgl.system.NativeType("GLdouble const *") java.nio.DoubleBuffer r6) {
            r0 = r4
            r1 = r5
            r2 = r6
            org.lwjgl.opengl.GL40C.glUniformMatrix2x4dv(r0, r1, r2)
            return
    }

    public static void nglUniformMatrix3x2dv(int r6, int r7, boolean r8, long r9) {
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            org.lwjgl.opengl.GL40C.nglUniformMatrix3x2dv(r0, r1, r2, r3)
            return
    }

    public static void glUniformMatrix3x2dv(@org.lwjgl.system.NativeType("GLint") int r4, @org.lwjgl.system.NativeType("GLboolean") boolean r5, @org.lwjgl.system.NativeType("GLdouble const *") java.nio.DoubleBuffer r6) {
            r0 = r4
            r1 = r5
            r2 = r6
            org.lwjgl.opengl.GL40C.glUniformMatrix3x2dv(r0, r1, r2)
            return
    }

    public static void nglUniformMatrix3x4dv(int r6, int r7, boolean r8, long r9) {
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            org.lwjgl.opengl.GL40C.nglUniformMatrix3x4dv(r0, r1, r2, r3)
            return
    }

    public static void glUniformMatrix3x4dv(@org.lwjgl.system.NativeType("GLint") int r4, @org.lwjgl.system.NativeType("GLboolean") boolean r5, @org.lwjgl.system.NativeType("GLdouble const *") java.nio.DoubleBuffer r6) {
            r0 = r4
            r1 = r5
            r2 = r6
            org.lwjgl.opengl.GL40C.glUniformMatrix3x4dv(r0, r1, r2)
            return
    }

    public static void nglUniformMatrix4x2dv(int r6, int r7, boolean r8, long r9) {
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            org.lwjgl.opengl.GL40C.nglUniformMatrix4x2dv(r0, r1, r2, r3)
            return
    }

    public static void glUniformMatrix4x2dv(@org.lwjgl.system.NativeType("GLint") int r4, @org.lwjgl.system.NativeType("GLboolean") boolean r5, @org.lwjgl.system.NativeType("GLdouble const *") java.nio.DoubleBuffer r6) {
            r0 = r4
            r1 = r5
            r2 = r6
            org.lwjgl.opengl.GL40C.glUniformMatrix4x2dv(r0, r1, r2)
            return
    }

    public static void nglUniformMatrix4x3dv(int r6, int r7, boolean r8, long r9) {
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            org.lwjgl.opengl.GL40C.nglUniformMatrix4x3dv(r0, r1, r2, r3)
            return
    }

    public static void glUniformMatrix4x3dv(@org.lwjgl.system.NativeType("GLint") int r4, @org.lwjgl.system.NativeType("GLboolean") boolean r5, @org.lwjgl.system.NativeType("GLdouble const *") java.nio.DoubleBuffer r6) {
            r0 = r4
            r1 = r5
            r2 = r6
            org.lwjgl.opengl.GL40C.glUniformMatrix4x3dv(r0, r1, r2)
            return
    }

    public static void nglGetUniformdv(int r5, int r6, long r7) {
            r0 = r5
            r1 = r6
            r2 = r7
            org.lwjgl.opengl.GL40C.nglGetUniformdv(r0, r1, r2)
            return
    }

    public static void glGetUniformdv(@org.lwjgl.system.NativeType("GLuint") int r4, @org.lwjgl.system.NativeType("GLint") int r5, @org.lwjgl.system.NativeType("GLdouble *") java.nio.DoubleBuffer r6) {
            r0 = r4
            r1 = r5
            r2 = r6
            org.lwjgl.opengl.GL40C.glGetUniformdv(r0, r1, r2)
            return
    }

    @org.lwjgl.system.NativeType("void")
    public static double glGetUniformd(@org.lwjgl.system.NativeType("GLuint") int r3, @org.lwjgl.system.NativeType("GLint") int r4) {
            r0 = r3
            r1 = r4
            double r0 = org.lwjgl.opengl.GL40C.glGetUniformd(r0, r1)
            return r0
    }

    public static void glMinSampleShading(@org.lwjgl.system.NativeType("GLfloat") float r2) {
            r0 = r2
            org.lwjgl.opengl.GL40C.glMinSampleShading(r0)
            return
    }

    public static int nglGetSubroutineUniformLocation(int r5, int r6, long r7) {
            r0 = r5
            r1 = r6
            r2 = r7
            int r0 = org.lwjgl.opengl.GL40C.nglGetSubroutineUniformLocation(r0, r1, r2)
            return r0
    }

    @org.lwjgl.system.NativeType("GLint")
    public static int glGetSubroutineUniformLocation(@org.lwjgl.system.NativeType("GLuint") int r4, @org.lwjgl.system.NativeType("GLenum") int r5, @org.lwjgl.system.NativeType("GLchar const *") java.nio.ByteBuffer r6) {
            r0 = r4
            r1 = r5
            r2 = r6
            int r0 = org.lwjgl.opengl.GL40C.glGetSubroutineUniformLocation(r0, r1, r2)
            return r0
    }

    @org.lwjgl.system.NativeType("GLint")
    public static int glGetSubroutineUniformLocation(@org.lwjgl.system.NativeType("GLuint") int r4, @org.lwjgl.system.NativeType("GLenum") int r5, @org.lwjgl.system.NativeType("GLchar const *") java.lang.CharSequence r6) {
            r0 = r4
            r1 = r5
            r2 = r6
            int r0 = org.lwjgl.opengl.GL40C.glGetSubroutineUniformLocation(r0, r1, r2)
            return r0
    }

    public static int nglGetSubroutineIndex(int r5, int r6, long r7) {
            r0 = r5
            r1 = r6
            r2 = r7
            int r0 = org.lwjgl.opengl.GL40C.nglGetSubroutineIndex(r0, r1, r2)
            return r0
    }

    @org.lwjgl.system.NativeType("GLuint")
    public static int glGetSubroutineIndex(@org.lwjgl.system.NativeType("GLuint") int r4, @org.lwjgl.system.NativeType("GLenum") int r5, @org.lwjgl.system.NativeType("GLchar const *") java.nio.ByteBuffer r6) {
            r0 = r4
            r1 = r5
            r2 = r6
            int r0 = org.lwjgl.opengl.GL40C.glGetSubroutineIndex(r0, r1, r2)
            return r0
    }

    @org.lwjgl.system.NativeType("GLuint")
    public static int glGetSubroutineIndex(@org.lwjgl.system.NativeType("GLuint") int r4, @org.lwjgl.system.NativeType("GLenum") int r5, @org.lwjgl.system.NativeType("GLchar const *") java.lang.CharSequence r6) {
            r0 = r4
            r1 = r5
            r2 = r6
            int r0 = org.lwjgl.opengl.GL40C.glGetSubroutineIndex(r0, r1, r2)
            return r0
    }

    public static void nglGetActiveSubroutineUniformiv(int r7, int r8, int r9, int r10, long r11) {
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            org.lwjgl.opengl.GL40C.nglGetActiveSubroutineUniformiv(r0, r1, r2, r3, r4)
            return
    }

    public static void glGetActiveSubroutineUniformiv(@org.lwjgl.system.NativeType("GLuint") int r6, @org.lwjgl.system.NativeType("GLenum") int r7, @org.lwjgl.system.NativeType("GLuint") int r8, @org.lwjgl.system.NativeType("GLenum") int r9, @org.lwjgl.system.NativeType("GLint *") java.nio.IntBuffer r10) {
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            org.lwjgl.opengl.GL40C.glGetActiveSubroutineUniformiv(r0, r1, r2, r3, r4)
            return
    }

    @org.lwjgl.system.NativeType("void")
    public static int glGetActiveSubroutineUniformi(@org.lwjgl.system.NativeType("GLuint") int r5, @org.lwjgl.system.NativeType("GLenum") int r6, @org.lwjgl.system.NativeType("GLuint") int r7, @org.lwjgl.system.NativeType("GLenum") int r8) {
            r0 = r5
            r1 = r6
            r2 = r7
            r3 = r8
            int r0 = org.lwjgl.opengl.GL40C.glGetActiveSubroutineUniformi(r0, r1, r2, r3)
            return r0
    }

    public static void nglGetActiveSubroutineUniformName(int r9, int r10, int r11, int r12, long r13, long r15) {
            r0 = r9
            r1 = r10
            r2 = r11
            r3 = r12
            r4 = r13
            r5 = r15
            org.lwjgl.opengl.GL40C.nglGetActiveSubroutineUniformName(r0, r1, r2, r3, r4, r5)
            return
    }

    public static void glGetActiveSubroutineUniformName(@org.lwjgl.system.NativeType("GLuint") int r6, @org.lwjgl.system.NativeType("GLenum") int r7, @org.lwjgl.system.NativeType("GLuint") int r8, @javax.annotation.Nullable @org.lwjgl.system.NativeType("GLsizei *") java.nio.IntBuffer r9, @org.lwjgl.system.NativeType("GLchar *") java.nio.ByteBuffer r10) {
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            org.lwjgl.opengl.GL40C.glGetActiveSubroutineUniformName(r0, r1, r2, r3, r4)
            return
    }

    @org.lwjgl.system.NativeType("void")
    public static java.lang.String glGetActiveSubroutineUniformName(@org.lwjgl.system.NativeType("GLuint") int r5, @org.lwjgl.system.NativeType("GLenum") int r6, @org.lwjgl.system.NativeType("GLuint") int r7, @org.lwjgl.system.NativeType("GLsizei") int r8) {
            r0 = r5
            r1 = r6
            r2 = r7
            r3 = r8
            java.lang.String r0 = org.lwjgl.opengl.GL40C.glGetActiveSubroutineUniformName(r0, r1, r2, r3)
            return r0
    }

    @org.lwjgl.system.NativeType("void")
    public static java.lang.String glGetActiveSubroutineUniformName(@org.lwjgl.system.NativeType("GLuint") int r8, @org.lwjgl.system.NativeType("GLenum") int r9, @org.lwjgl.system.NativeType("GLuint") int r10) {
            r0 = r8
            r1 = r9
            r2 = r10
            r3 = r8
            r4 = r9
            r5 = r10
            r6 = 35385(0x8a39, float:4.9585E-41)
            int r3 = glGetActiveSubroutineUniformi(r3, r4, r5, r6)
            java.lang.String r0 = glGetActiveSubroutineUniformName(r0, r1, r2, r3)
            return r0
    }

    public static void nglGetActiveSubroutineName(int r9, int r10, int r11, int r12, long r13, long r15) {
            r0 = r9
            r1 = r10
            r2 = r11
            r3 = r12
            r4 = r13
            r5 = r15
            org.lwjgl.opengl.GL40C.nglGetActiveSubroutineName(r0, r1, r2, r3, r4, r5)
            return
    }

    public static void glGetActiveSubroutineName(@org.lwjgl.system.NativeType("GLuint") int r6, @org.lwjgl.system.NativeType("GLenum") int r7, @org.lwjgl.system.NativeType("GLuint") int r8, @javax.annotation.Nullable @org.lwjgl.system.NativeType("GLsizei *") java.nio.IntBuffer r9, @org.lwjgl.system.NativeType("GLchar *") java.nio.ByteBuffer r10) {
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            org.lwjgl.opengl.GL40C.glGetActiveSubroutineName(r0, r1, r2, r3, r4)
            return
    }

    @org.lwjgl.system.NativeType("void")
    public static java.lang.String glGetActiveSubroutineName(@org.lwjgl.system.NativeType("GLuint") int r5, @org.lwjgl.system.NativeType("GLenum") int r6, @org.lwjgl.system.NativeType("GLuint") int r7, @org.lwjgl.system.NativeType("GLsizei") int r8) {
            r0 = r5
            r1 = r6
            r2 = r7
            r3 = r8
            java.lang.String r0 = org.lwjgl.opengl.GL40C.glGetActiveSubroutineName(r0, r1, r2, r3)
            return r0
    }

    @org.lwjgl.system.NativeType("void")
    public static java.lang.String glGetActiveSubroutineName(@org.lwjgl.system.NativeType("GLuint") int r7, @org.lwjgl.system.NativeType("GLenum") int r8, @org.lwjgl.system.NativeType("GLuint") int r9) {
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = r7
            r4 = r8
            r5 = 36424(0x8e48, float:5.1041E-41)
            int r3 = glGetProgramStagei(r3, r4, r5)
            java.lang.String r0 = glGetActiveSubroutineName(r0, r1, r2, r3)
            return r0
    }

    public static void nglUniformSubroutinesuiv(int r5, int r6, long r7) {
            r0 = r5
            r1 = r6
            r2 = r7
            org.lwjgl.opengl.GL40C.nglUniformSubroutinesuiv(r0, r1, r2)
            return
    }

    public static void glUniformSubroutinesuiv(@org.lwjgl.system.NativeType("GLenum") int r3, @org.lwjgl.system.NativeType("GLuint const *") java.nio.IntBuffer r4) {
            r0 = r3
            r1 = r4
            org.lwjgl.opengl.GL40C.glUniformSubroutinesuiv(r0, r1)
            return
    }

    public static void glUniformSubroutinesui(@org.lwjgl.system.NativeType("GLenum") int r3, @org.lwjgl.system.NativeType("GLuint const *") int r4) {
            r0 = r3
            r1 = r4
            org.lwjgl.opengl.GL40C.glUniformSubroutinesui(r0, r1)
            return
    }

    public static void nglGetUniformSubroutineuiv(int r5, int r6, long r7) {
            r0 = r5
            r1 = r6
            r2 = r7
            org.lwjgl.opengl.GL40C.nglGetUniformSubroutineuiv(r0, r1, r2)
            return
    }

    public static void glGetUniformSubroutineuiv(@org.lwjgl.system.NativeType("GLenum") int r4, @org.lwjgl.system.NativeType("GLint") int r5, @org.lwjgl.system.NativeType("GLuint *") java.nio.IntBuffer r6) {
            r0 = r4
            r1 = r5
            r2 = r6
            org.lwjgl.opengl.GL40C.glGetUniformSubroutineuiv(r0, r1, r2)
            return
    }

    @org.lwjgl.system.NativeType("void")
    public static int glGetUniformSubroutineui(@org.lwjgl.system.NativeType("GLenum") int r3, @org.lwjgl.system.NativeType("GLint") int r4) {
            r0 = r3
            r1 = r4
            int r0 = org.lwjgl.opengl.GL40C.glGetUniformSubroutineui(r0, r1)
            return r0
    }

    public static void nglGetProgramStageiv(int r6, int r7, int r8, long r9) {
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            org.lwjgl.opengl.GL40C.nglGetProgramStageiv(r0, r1, r2, r3)
            return
    }

    public static void glGetProgramStageiv(@org.lwjgl.system.NativeType("GLuint") int r5, @org.lwjgl.system.NativeType("GLenum") int r6, @org.lwjgl.system.NativeType("GLenum") int r7, @org.lwjgl.system.NativeType("GLint *") java.nio.IntBuffer r8) {
            r0 = r5
            r1 = r6
            r2 = r7
            r3 = r8
            org.lwjgl.opengl.GL40C.glGetProgramStageiv(r0, r1, r2, r3)
            return
    }

    @org.lwjgl.system.NativeType("void")
    public static int glGetProgramStagei(@org.lwjgl.system.NativeType("GLuint") int r4, @org.lwjgl.system.NativeType("GLenum") int r5, @org.lwjgl.system.NativeType("GLenum") int r6) {
            r0 = r4
            r1 = r5
            r2 = r6
            int r0 = org.lwjgl.opengl.GL40C.glGetProgramStagei(r0, r1, r2)
            return r0
    }

    public static void glPatchParameteri(@org.lwjgl.system.NativeType("GLenum") int r3, @org.lwjgl.system.NativeType("GLint") int r4) {
            r0 = r3
            r1 = r4
            org.lwjgl.opengl.GL40C.glPatchParameteri(r0, r1)
            return
    }

    public static void nglPatchParameterfv(int r4, long r5) {
            r0 = r4
            r1 = r5
            org.lwjgl.opengl.GL40C.nglPatchParameterfv(r0, r1)
            return
    }

    public static void glPatchParameterfv(@org.lwjgl.system.NativeType("GLenum") int r3, @org.lwjgl.system.NativeType("GLfloat const *") java.nio.FloatBuffer r4) {
            r0 = r3
            r1 = r4
            org.lwjgl.opengl.GL40C.glPatchParameterfv(r0, r1)
            return
    }

    public static void glBindTransformFeedback(@org.lwjgl.system.NativeType("GLenum") int r3, @org.lwjgl.system.NativeType("GLuint") int r4) {
            r0 = r3
            r1 = r4
            org.lwjgl.opengl.GL40C.glBindTransformFeedback(r0, r1)
            return
    }

    public static void nglDeleteTransformFeedbacks(int r4, long r5) {
            r0 = r4
            r1 = r5
            org.lwjgl.opengl.GL40C.nglDeleteTransformFeedbacks(r0, r1)
            return
    }

    public static void glDeleteTransformFeedbacks(@org.lwjgl.system.NativeType("GLuint const *") java.nio.IntBuffer r2) {
            r0 = r2
            org.lwjgl.opengl.GL40C.glDeleteTransformFeedbacks(r0)
            return
    }

    public static void glDeleteTransformFeedbacks(@org.lwjgl.system.NativeType("GLuint const *") int r2) {
            r0 = r2
            org.lwjgl.opengl.GL40C.glDeleteTransformFeedbacks(r0)
            return
    }

    public static void nglGenTransformFeedbacks(int r4, long r5) {
            r0 = r4
            r1 = r5
            org.lwjgl.opengl.GL40C.nglGenTransformFeedbacks(r0, r1)
            return
    }

    public static void glGenTransformFeedbacks(@org.lwjgl.system.NativeType("GLuint *") java.nio.IntBuffer r2) {
            r0 = r2
            org.lwjgl.opengl.GL40C.glGenTransformFeedbacks(r0)
            return
    }

    @org.lwjgl.system.NativeType("void")
    public static int glGenTransformFeedbacks() {
            int r0 = org.lwjgl.opengl.GL40C.glGenTransformFeedbacks()
            return r0
    }

    @org.lwjgl.system.NativeType("GLboolean")
    public static boolean glIsTransformFeedback(@org.lwjgl.system.NativeType("GLuint") int r2) {
            r0 = r2
            boolean r0 = org.lwjgl.opengl.GL40C.glIsTransformFeedback(r0)
            return r0
    }

    public static void glPauseTransformFeedback() {
            org.lwjgl.opengl.GL40C.glPauseTransformFeedback()
            return
    }

    public static void glResumeTransformFeedback() {
            org.lwjgl.opengl.GL40C.glResumeTransformFeedback()
            return
    }

    public static void glDrawTransformFeedback(@org.lwjgl.system.NativeType("GLenum") int r3, @org.lwjgl.system.NativeType("GLuint") int r4) {
            r0 = r3
            r1 = r4
            org.lwjgl.opengl.GL40C.glDrawTransformFeedback(r0, r1)
            return
    }

    public static void glDrawTransformFeedbackStream(@org.lwjgl.system.NativeType("GLenum") int r4, @org.lwjgl.system.NativeType("GLuint") int r5, @org.lwjgl.system.NativeType("GLuint") int r6) {
            r0 = r4
            r1 = r5
            r2 = r6
            org.lwjgl.opengl.GL40C.glDrawTransformFeedbackStream(r0, r1, r2)
            return
    }

    public static void glBeginQueryIndexed(@org.lwjgl.system.NativeType("GLenum") int r4, @org.lwjgl.system.NativeType("GLuint") int r5, @org.lwjgl.system.NativeType("GLuint") int r6) {
            r0 = r4
            r1 = r5
            r2 = r6
            org.lwjgl.opengl.GL40C.glBeginQueryIndexed(r0, r1, r2)
            return
    }

    public static void glEndQueryIndexed(@org.lwjgl.system.NativeType("GLenum") int r3, @org.lwjgl.system.NativeType("GLuint") int r4) {
            r0 = r3
            r1 = r4
            org.lwjgl.opengl.GL40C.glEndQueryIndexed(r0, r1)
            return
    }

    public static void nglGetQueryIndexediv(int r6, int r7, int r8, long r9) {
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            org.lwjgl.opengl.GL40C.nglGetQueryIndexediv(r0, r1, r2, r3)
            return
    }

    public static void glGetQueryIndexediv(@org.lwjgl.system.NativeType("GLenum") int r5, @org.lwjgl.system.NativeType("GLuint") int r6, @org.lwjgl.system.NativeType("GLenum") int r7, @org.lwjgl.system.NativeType("GLint *") java.nio.IntBuffer r8) {
            r0 = r5
            r1 = r6
            r2 = r7
            r3 = r8
            org.lwjgl.opengl.GL40C.glGetQueryIndexediv(r0, r1, r2, r3)
            return
    }

    @org.lwjgl.system.NativeType("void")
    public static int glGetQueryIndexedi(@org.lwjgl.system.NativeType("GLenum") int r4, @org.lwjgl.system.NativeType("GLuint") int r5, @org.lwjgl.system.NativeType("GLenum") int r6) {
            r0 = r4
            r1 = r5
            r2 = r6
            int r0 = org.lwjgl.opengl.GL40C.glGetQueryIndexedi(r0, r1, r2)
            return r0
    }

    public static void glDrawArraysIndirect(@org.lwjgl.system.NativeType("GLenum") int r3, @org.lwjgl.system.NativeType("void const *") int[] r4) {
            r0 = r3
            r1 = r4
            org.lwjgl.opengl.GL40C.glDrawArraysIndirect(r0, r1)
            return
    }

    public static void glDrawElementsIndirect(@org.lwjgl.system.NativeType("GLenum") int r4, @org.lwjgl.system.NativeType("GLenum") int r5, @org.lwjgl.system.NativeType("void const *") int[] r6) {
            r0 = r4
            r1 = r5
            r2 = r6
            org.lwjgl.opengl.GL40C.glDrawElementsIndirect(r0, r1, r2)
            return
    }

    public static void glUniform1dv(@org.lwjgl.system.NativeType("GLint") int r3, @org.lwjgl.system.NativeType("GLdouble const *") double[] r4) {
            r0 = r3
            r1 = r4
            org.lwjgl.opengl.GL40C.glUniform1dv(r0, r1)
            return
    }

    public static void glUniform2dv(@org.lwjgl.system.NativeType("GLint") int r3, @org.lwjgl.system.NativeType("GLdouble const *") double[] r4) {
            r0 = r3
            r1 = r4
            org.lwjgl.opengl.GL40C.glUniform2dv(r0, r1)
            return
    }

    public static void glUniform3dv(@org.lwjgl.system.NativeType("GLint") int r3, @org.lwjgl.system.NativeType("GLdouble const *") double[] r4) {
            r0 = r3
            r1 = r4
            org.lwjgl.opengl.GL40C.glUniform3dv(r0, r1)
            return
    }

    public static void glUniform4dv(@org.lwjgl.system.NativeType("GLint") int r3, @org.lwjgl.system.NativeType("GLdouble const *") double[] r4) {
            r0 = r3
            r1 = r4
            org.lwjgl.opengl.GL40C.glUniform4dv(r0, r1)
            return
    }

    public static void glUniformMatrix2dv(@org.lwjgl.system.NativeType("GLint") int r4, @org.lwjgl.system.NativeType("GLboolean") boolean r5, @org.lwjgl.system.NativeType("GLdouble const *") double[] r6) {
            r0 = r4
            r1 = r5
            r2 = r6
            org.lwjgl.opengl.GL40C.glUniformMatrix2dv(r0, r1, r2)
            return
    }

    public static void glUniformMatrix3dv(@org.lwjgl.system.NativeType("GLint") int r4, @org.lwjgl.system.NativeType("GLboolean") boolean r5, @org.lwjgl.system.NativeType("GLdouble const *") double[] r6) {
            r0 = r4
            r1 = r5
            r2 = r6
            org.lwjgl.opengl.GL40C.glUniformMatrix3dv(r0, r1, r2)
            return
    }

    public static void glUniformMatrix4dv(@org.lwjgl.system.NativeType("GLint") int r4, @org.lwjgl.system.NativeType("GLboolean") boolean r5, @org.lwjgl.system.NativeType("GLdouble const *") double[] r6) {
            r0 = r4
            r1 = r5
            r2 = r6
            org.lwjgl.opengl.GL40C.glUniformMatrix4dv(r0, r1, r2)
            return
    }

    public static void glUniformMatrix2x3dv(@org.lwjgl.system.NativeType("GLint") int r4, @org.lwjgl.system.NativeType("GLboolean") boolean r5, @org.lwjgl.system.NativeType("GLdouble const *") double[] r6) {
            r0 = r4
            r1 = r5
            r2 = r6
            org.lwjgl.opengl.GL40C.glUniformMatrix2x3dv(r0, r1, r2)
            return
    }

    public static void glUniformMatrix2x4dv(@org.lwjgl.system.NativeType("GLint") int r4, @org.lwjgl.system.NativeType("GLboolean") boolean r5, @org.lwjgl.system.NativeType("GLdouble const *") double[] r6) {
            r0 = r4
            r1 = r5
            r2 = r6
            org.lwjgl.opengl.GL40C.glUniformMatrix2x4dv(r0, r1, r2)
            return
    }

    public static void glUniformMatrix3x2dv(@org.lwjgl.system.NativeType("GLint") int r4, @org.lwjgl.system.NativeType("GLboolean") boolean r5, @org.lwjgl.system.NativeType("GLdouble const *") double[] r6) {
            r0 = r4
            r1 = r5
            r2 = r6
            org.lwjgl.opengl.GL40C.glUniformMatrix3x2dv(r0, r1, r2)
            return
    }

    public static void glUniformMatrix3x4dv(@org.lwjgl.system.NativeType("GLint") int r4, @org.lwjgl.system.NativeType("GLboolean") boolean r5, @org.lwjgl.system.NativeType("GLdouble const *") double[] r6) {
            r0 = r4
            r1 = r5
            r2 = r6
            org.lwjgl.opengl.GL40C.glUniformMatrix3x4dv(r0, r1, r2)
            return
    }

    public static void glUniformMatrix4x2dv(@org.lwjgl.system.NativeType("GLint") int r4, @org.lwjgl.system.NativeType("GLboolean") boolean r5, @org.lwjgl.system.NativeType("GLdouble const *") double[] r6) {
            r0 = r4
            r1 = r5
            r2 = r6
            org.lwjgl.opengl.GL40C.glUniformMatrix4x2dv(r0, r1, r2)
            return
    }

    public static void glUniformMatrix4x3dv(@org.lwjgl.system.NativeType("GLint") int r4, @org.lwjgl.system.NativeType("GLboolean") boolean r5, @org.lwjgl.system.NativeType("GLdouble const *") double[] r6) {
            r0 = r4
            r1 = r5
            r2 = r6
            org.lwjgl.opengl.GL40C.glUniformMatrix4x3dv(r0, r1, r2)
            return
    }

    public static void glGetUniformdv(@org.lwjgl.system.NativeType("GLuint") int r4, @org.lwjgl.system.NativeType("GLint") int r5, @org.lwjgl.system.NativeType("GLdouble *") double[] r6) {
            r0 = r4
            r1 = r5
            r2 = r6
            org.lwjgl.opengl.GL40C.glGetUniformdv(r0, r1, r2)
            return
    }

    public static void glGetActiveSubroutineUniformiv(@org.lwjgl.system.NativeType("GLuint") int r6, @org.lwjgl.system.NativeType("GLenum") int r7, @org.lwjgl.system.NativeType("GLuint") int r8, @org.lwjgl.system.NativeType("GLenum") int r9, @org.lwjgl.system.NativeType("GLint *") int[] r10) {
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            org.lwjgl.opengl.GL40C.glGetActiveSubroutineUniformiv(r0, r1, r2, r3, r4)
            return
    }

    public static void glGetActiveSubroutineUniformName(@org.lwjgl.system.NativeType("GLuint") int r6, @org.lwjgl.system.NativeType("GLenum") int r7, @org.lwjgl.system.NativeType("GLuint") int r8, @javax.annotation.Nullable @org.lwjgl.system.NativeType("GLsizei *") int[] r9, @org.lwjgl.system.NativeType("GLchar *") java.nio.ByteBuffer r10) {
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            org.lwjgl.opengl.GL40C.glGetActiveSubroutineUniformName(r0, r1, r2, r3, r4)
            return
    }

    public static void glGetActiveSubroutineName(@org.lwjgl.system.NativeType("GLuint") int r6, @org.lwjgl.system.NativeType("GLenum") int r7, @org.lwjgl.system.NativeType("GLuint") int r8, @javax.annotation.Nullable @org.lwjgl.system.NativeType("GLsizei *") int[] r9, @org.lwjgl.system.NativeType("GLchar *") java.nio.ByteBuffer r10) {
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            org.lwjgl.opengl.GL40C.glGetActiveSubroutineName(r0, r1, r2, r3, r4)
            return
    }

    public static void glUniformSubroutinesuiv(@org.lwjgl.system.NativeType("GLenum") int r3, @org.lwjgl.system.NativeType("GLuint const *") int[] r4) {
            r0 = r3
            r1 = r4
            org.lwjgl.opengl.GL40C.glUniformSubroutinesuiv(r0, r1)
            return
    }

    public static void glGetUniformSubroutineuiv(@org.lwjgl.system.NativeType("GLenum") int r4, @org.lwjgl.system.NativeType("GLint") int r5, @org.lwjgl.system.NativeType("GLuint *") int[] r6) {
            r0 = r4
            r1 = r5
            r2 = r6
            org.lwjgl.opengl.GL40C.glGetUniformSubroutineuiv(r0, r1, r2)
            return
    }

    public static void glGetProgramStageiv(@org.lwjgl.system.NativeType("GLuint") int r5, @org.lwjgl.system.NativeType("GLenum") int r6, @org.lwjgl.system.NativeType("GLenum") int r7, @org.lwjgl.system.NativeType("GLint *") int[] r8) {
            r0 = r5
            r1 = r6
            r2 = r7
            r3 = r8
            org.lwjgl.opengl.GL40C.glGetProgramStageiv(r0, r1, r2, r3)
            return
    }

    public static void glPatchParameterfv(@org.lwjgl.system.NativeType("GLenum") int r3, @org.lwjgl.system.NativeType("GLfloat const *") float[] r4) {
            r0 = r3
            r1 = r4
            org.lwjgl.opengl.GL40C.glPatchParameterfv(r0, r1)
            return
    }

    public static void glDeleteTransformFeedbacks(@org.lwjgl.system.NativeType("GLuint const *") int[] r2) {
            r0 = r2
            org.lwjgl.opengl.GL40C.glDeleteTransformFeedbacks(r0)
            return
    }

    public static void glGenTransformFeedbacks(@org.lwjgl.system.NativeType("GLuint *") int[] r2) {
            r0 = r2
            org.lwjgl.opengl.GL40C.glGenTransformFeedbacks(r0)
            return
    }

    public static void glGetQueryIndexediv(@org.lwjgl.system.NativeType("GLenum") int r5, @org.lwjgl.system.NativeType("GLuint") int r6, @org.lwjgl.system.NativeType("GLenum") int r7, @org.lwjgl.system.NativeType("GLint *") int[] r8) {
            r0 = r5
            r1 = r6
            r2 = r7
            r3 = r8
            org.lwjgl.opengl.GL40C.glGetQueryIndexediv(r0, r1, r2, r3)
            return
    }

    static {
            org.lwjgl.opengl.GL.initialize()
            return
    }
}
