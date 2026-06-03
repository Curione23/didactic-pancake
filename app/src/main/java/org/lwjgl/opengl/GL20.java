package org.lwjgl.opengl;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/opengl/GL20.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/opengl/GL20.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/opengl/GL20.class */
public class GL20 extends org.lwjgl.opengl.GL15 {
    public static final int GL_SHADING_LANGUAGE_VERSION = 35724;
    public static final int GL_CURRENT_PROGRAM = 35725;
    public static final int GL_SHADER_TYPE = 35663;
    public static final int GL_DELETE_STATUS = 35712;
    public static final int GL_COMPILE_STATUS = 35713;
    public static final int GL_LINK_STATUS = 35714;
    public static final int GL_VALIDATE_STATUS = 35715;
    public static final int GL_INFO_LOG_LENGTH = 35716;
    public static final int GL_ATTACHED_SHADERS = 35717;
    public static final int GL_ACTIVE_UNIFORMS = 35718;
    public static final int GL_ACTIVE_UNIFORM_MAX_LENGTH = 35719;
    public static final int GL_ACTIVE_ATTRIBUTES = 35721;
    public static final int GL_ACTIVE_ATTRIBUTE_MAX_LENGTH = 35722;
    public static final int GL_SHADER_SOURCE_LENGTH = 35720;
    public static final int GL_FLOAT_VEC2 = 35664;
    public static final int GL_FLOAT_VEC3 = 35665;
    public static final int GL_FLOAT_VEC4 = 35666;
    public static final int GL_INT_VEC2 = 35667;
    public static final int GL_INT_VEC3 = 35668;
    public static final int GL_INT_VEC4 = 35669;
    public static final int GL_BOOL = 35670;
    public static final int GL_BOOL_VEC2 = 35671;
    public static final int GL_BOOL_VEC3 = 35672;
    public static final int GL_BOOL_VEC4 = 35673;
    public static final int GL_FLOAT_MAT2 = 35674;
    public static final int GL_FLOAT_MAT3 = 35675;
    public static final int GL_FLOAT_MAT4 = 35676;
    public static final int GL_SAMPLER_1D = 35677;
    public static final int GL_SAMPLER_2D = 35678;
    public static final int GL_SAMPLER_3D = 35679;
    public static final int GL_SAMPLER_CUBE = 35680;
    public static final int GL_SAMPLER_1D_SHADOW = 35681;
    public static final int GL_SAMPLER_2D_SHADOW = 35682;
    public static final int GL_VERTEX_SHADER = 35633;
    public static final int GL_MAX_VERTEX_UNIFORM_COMPONENTS = 35658;
    public static final int GL_MAX_VARYING_FLOATS = 35659;
    public static final int GL_MAX_VERTEX_ATTRIBS = 34921;
    public static final int GL_MAX_TEXTURE_IMAGE_UNITS = 34930;
    public static final int GL_MAX_VERTEX_TEXTURE_IMAGE_UNITS = 35660;
    public static final int GL_MAX_COMBINED_TEXTURE_IMAGE_UNITS = 35661;
    public static final int GL_MAX_TEXTURE_COORDS = 34929;
    public static final int GL_VERTEX_PROGRAM_POINT_SIZE = 34370;
    public static final int GL_VERTEX_PROGRAM_TWO_SIDE = 34371;
    public static final int GL_VERTEX_ATTRIB_ARRAY_ENABLED = 34338;
    public static final int GL_VERTEX_ATTRIB_ARRAY_SIZE = 34339;
    public static final int GL_VERTEX_ATTRIB_ARRAY_STRIDE = 34340;
    public static final int GL_VERTEX_ATTRIB_ARRAY_TYPE = 34341;
    public static final int GL_VERTEX_ATTRIB_ARRAY_NORMALIZED = 34922;
    public static final int GL_CURRENT_VERTEX_ATTRIB = 34342;
    public static final int GL_VERTEX_ATTRIB_ARRAY_POINTER = 34373;
    public static final int GL_FRAGMENT_SHADER = 35632;
    public static final int GL_MAX_FRAGMENT_UNIFORM_COMPONENTS = 35657;
    public static final int GL_FRAGMENT_SHADER_DERIVATIVE_HINT = 35723;
    public static final int GL_MAX_DRAW_BUFFERS = 34852;
    public static final int GL_DRAW_BUFFER0 = 34853;
    public static final int GL_DRAW_BUFFER1 = 34854;
    public static final int GL_DRAW_BUFFER2 = 34855;
    public static final int GL_DRAW_BUFFER3 = 34856;
    public static final int GL_DRAW_BUFFER4 = 34857;
    public static final int GL_DRAW_BUFFER5 = 34858;
    public static final int GL_DRAW_BUFFER6 = 34859;
    public static final int GL_DRAW_BUFFER7 = 34860;
    public static final int GL_DRAW_BUFFER8 = 34861;
    public static final int GL_DRAW_BUFFER9 = 34862;
    public static final int GL_DRAW_BUFFER10 = 34863;
    public static final int GL_DRAW_BUFFER11 = 34864;
    public static final int GL_DRAW_BUFFER12 = 34865;
    public static final int GL_DRAW_BUFFER13 = 34866;
    public static final int GL_DRAW_BUFFER14 = 34867;
    public static final int GL_DRAW_BUFFER15 = 34868;
    public static final int GL_POINT_SPRITE = 34913;
    public static final int GL_COORD_REPLACE = 34914;
    public static final int GL_POINT_SPRITE_COORD_ORIGIN = 36000;
    public static final int GL_LOWER_LEFT = 36001;
    public static final int GL_UPPER_LEFT = 36002;
    public static final int GL_BLEND_EQUATION_RGB = 32777;
    public static final int GL_BLEND_EQUATION_ALPHA = 34877;
    public static final int GL_STENCIL_BACK_FUNC = 34816;
    public static final int GL_STENCIL_BACK_FAIL = 34817;
    public static final int GL_STENCIL_BACK_PASS_DEPTH_FAIL = 34818;
    public static final int GL_STENCIL_BACK_PASS_DEPTH_PASS = 34819;
    public static final int GL_STENCIL_BACK_REF = 36003;
    public static final int GL_STENCIL_BACK_VALUE_MASK = 36004;
    public static final int GL_STENCIL_BACK_WRITEMASK = 36005;

    public static void glVertexAttribPointer(int r7, int r8, boolean r9, boolean r10, int r11, java.nio.ByteBuffer r12) {
            r0 = r9
            if (r0 == 0) goto La
            r0 = 5121(0x1401, float:7.176E-42)
            goto Ld
        La:
            r0 = 5120(0x1400, float:7.175E-42)
        Ld:
            r13 = r0
            r0 = r7
            r1 = r8
            r2 = r13
            r3 = r10
            r4 = r11
            r5 = r12
            glVertexAttribPointer(r0, r1, r2, r3, r4, r5)
            return
    }

    public static void glVertexAttribPointer(int r8, int r9, boolean r10, boolean r11, int r12, java.nio.ShortBuffer r13) {
            r0 = r8
            r1 = r9
            r2 = r10
            if (r2 == 0) goto Lc
            r2 = 5123(0x1403, float:7.179E-42)
            goto Lf
        Lc:
            r2 = 5122(0x1402, float:7.177E-42)
        Lf:
            r3 = r11
            r4 = r12
            r5 = r13
            long r5 = org.lwjgl.system.MemoryUtil.memAddress(r5)
            nglVertexAttribPointer(r0, r1, r2, r3, r4, r5)
            return
    }

    public static void glVertexAttribPointer(int r8, int r9, boolean r10, boolean r11, int r12, java.nio.IntBuffer r13) {
            r0 = r8
            r1 = r9
            r2 = r10
            if (r2 == 0) goto Lc
            r2 = 5125(0x1405, float:7.182E-42)
            goto Lf
        Lc:
            r2 = 5124(0x1404, float:7.18E-42)
        Lf:
            r3 = r11
            r4 = r12
            r5 = r13
            long r5 = org.lwjgl.system.MemoryUtil.memAddress(r5)
            nglVertexAttribPointer(r0, r1, r2, r3, r4, r5)
            return
    }

    public static java.lang.String glGetActiveAttrib(int r6, int r7, int r8, java.nio.IntBuffer r9) {
            r0 = 1
            java.nio.IntBuffer r0 = org.lwjgl.BufferUtils.createIntBuffer(r0)
            r10 = r0
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            java.lang.String r0 = glGetActiveAttrib(r0, r1, r2, r3, r4)
            r11 = r0
            r0 = r9
            r1 = r10
            r2 = 0
            int r1 = r1.get(r2)
            java.nio.IntBuffer r0 = r0.put(r1)
            r0 = r11
            return r0
    }

    public static java.lang.String glGetActiveUniform(int r6, int r7, int r8, java.nio.IntBuffer r9) {
            r0 = 1
            java.nio.IntBuffer r0 = org.lwjgl.BufferUtils.createIntBuffer(r0)
            r10 = r0
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            java.lang.String r0 = glGetActiveUniform(r0, r1, r2, r3, r4)
            r11 = r0
            r0 = r9
            r1 = r10
            r2 = 0
            int r1 = r1.get(r2)
            java.nio.IntBuffer r0 = r0.put(r1)
            r0 = r11
            return r0
    }

    public static void glShaderSource(int r5, java.nio.ByteBuffer r6) {
            r0 = r6
            int r0 = r0.remaining()
            byte[] r0 = new byte[r0]
            r7 = r0
            r0 = r6
            r1 = r7
            java.nio.ByteBuffer r0 = r0.get(r1)
            r0 = r5
            java.lang.String r1 = new java.lang.String
            r2 = r1
            r3 = r7
            r2.<init>(r3)
            glShaderSource(r0, r1)
            return
    }

    @java.lang.Deprecated
    public static int glGetProgram(int r3, int r4) {
            r0 = r3
            r1 = r4
            int r0 = glGetProgrami(r0, r1)
            return r0
    }

    public static void glGetProgram(int r4, int r5, java.nio.IntBuffer r6) {
            r0 = r4
            r1 = r5
            r2 = r6
            glGetProgramiv(r0, r1, r2)
            return
    }

    @java.lang.Deprecated
    public static int glGetShader(int r3, int r4) {
            r0 = r3
            r1 = r4
            int r0 = glGetShaderi(r0, r1)
            return r0
    }

    public static void glGetShader(int r4, int r5, java.nio.IntBuffer r6) {
            r0 = r4
            r1 = r5
            r2 = r6
            glGetShaderiv(r0, r1, r2)
            return
    }

    public static void glGetUniform(int r4, int r5, java.nio.FloatBuffer r6) {
            r0 = r4
            r1 = r5
            r2 = r6
            glGetUniformfv(r0, r1, r2)
            return
    }

    public static void glGetUniform(int r4, int r5, java.nio.IntBuffer r6) {
            r0 = r4
            r1 = r5
            r2 = r6
            glGetUniformiv(r0, r1, r2)
            return
    }

    public static void glGetVertexAttrib(int r4, int r5, java.nio.DoubleBuffer r6) {
            r0 = r4
            r1 = r5
            r2 = r6
            glGetVertexAttribdv(r0, r1, r2)
            return
    }

    public static void glGetVertexAttrib(int r4, int r5, java.nio.FloatBuffer r6) {
            r0 = r4
            r1 = r5
            r2 = r6
            glGetVertexAttribfv(r0, r1, r2)
            return
    }

    public static void glGetVertexAttrib(int r4, int r5, java.nio.IntBuffer r6) {
            r0 = r4
            r1 = r5
            r2 = r6
            glGetVertexAttribiv(r0, r1, r2)
            return
    }

    public static void glUniform1(int r3, java.nio.FloatBuffer r4) {
            r0 = r3
            r1 = r4
            glUniform1fv(r0, r1)
            return
    }

    public static void glUniform1(int r3, java.nio.IntBuffer r4) {
            r0 = r3
            r1 = r4
            glUniform1iv(r0, r1)
            return
    }

    public static void glUniform2(int r3, java.nio.FloatBuffer r4) {
            r0 = r3
            r1 = r4
            glUniform2fv(r0, r1)
            return
    }

    public static void glUniform2(int r3, java.nio.IntBuffer r4) {
            r0 = r3
            r1 = r4
            glUniform2iv(r0, r1)
            return
    }

    public static void glUniform3(int r3, java.nio.FloatBuffer r4) {
            r0 = r3
            r1 = r4
            glUniform3fv(r0, r1)
            return
    }

    public static void glUniform3(int r3, java.nio.IntBuffer r4) {
            r0 = r3
            r1 = r4
            glUniform3iv(r0, r1)
            return
    }

    public static void glUniform4(int r3, java.nio.FloatBuffer r4) {
            r0 = r3
            r1 = r4
            glUniform4fv(r0, r1)
            return
    }

    public static void glUniform4(int r3, java.nio.IntBuffer r4) {
            r0 = r3
            r1 = r4
            glUniform4iv(r0, r1)
            return
    }

    public static void glUniformMatrix2(int r4, boolean r5, java.nio.FloatBuffer r6) {
            r0 = r4
            r1 = r5
            r2 = r6
            glUniformMatrix2fv(r0, r1, r2)
            return
    }

    public static void glUniformMatrix3(int r4, boolean r5, java.nio.FloatBuffer r6) {
            r0 = r4
            r1 = r5
            r2 = r6
            glUniformMatrix3fv(r0, r1, r2)
            return
    }

    public static void glUniformMatrix4(int r4, boolean r5, java.nio.FloatBuffer r6) {
            r0 = r4
            r1 = r5
            r2 = r6
            glUniformMatrix4fv(r0, r1, r2)
            return
    }

    public static void glVertexAttribPointer(int r7, int r8, boolean r9, int r10, java.nio.FloatBuffer r11) {
            r0 = r7
            r1 = r8
            r2 = 5126(0x1406, float:7.183E-42)
            r3 = r9
            r4 = r10
            r5 = r11
            glVertexAttribPointer(r0, r1, r2, r3, r4, r5)
            return
    }

    protected GL20() {
            r3 = this;
            r0 = r3
            r0.<init>()
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r1 = r0
            r1.<init>()
            throw r0
    }

    @org.lwjgl.system.NativeType("GLuint")
    public static int glCreateProgram() {
            int r0 = org.lwjgl.opengl.GL20C.glCreateProgram()
            return r0
    }

    public static void glDeleteProgram(@org.lwjgl.system.NativeType("GLuint") int r2) {
            r0 = r2
            org.lwjgl.opengl.GL20C.glDeleteProgram(r0)
            return
    }

    @org.lwjgl.system.NativeType("GLboolean")
    public static boolean glIsProgram(@org.lwjgl.system.NativeType("GLuint") int r2) {
            r0 = r2
            boolean r0 = org.lwjgl.opengl.GL20C.glIsProgram(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("GLuint")
    public static int glCreateShader(@org.lwjgl.system.NativeType("GLenum") int r2) {
            r0 = r2
            int r0 = org.lwjgl.opengl.GL20C.glCreateShader(r0)
            return r0
    }

    public static void glDeleteShader(@org.lwjgl.system.NativeType("GLuint") int r2) {
            r0 = r2
            org.lwjgl.opengl.GL20C.glDeleteShader(r0)
            return
    }

    @org.lwjgl.system.NativeType("GLboolean")
    public static boolean glIsShader(@org.lwjgl.system.NativeType("GLuint") int r2) {
            r0 = r2
            boolean r0 = org.lwjgl.opengl.GL20C.glIsShader(r0)
            return r0
    }

    public static void glAttachShader(@org.lwjgl.system.NativeType("GLuint") int r3, @org.lwjgl.system.NativeType("GLuint") int r4) {
            r0 = r3
            r1 = r4
            org.lwjgl.opengl.GL20C.glAttachShader(r0, r1)
            return
    }

    public static void glDetachShader(@org.lwjgl.system.NativeType("GLuint") int r3, @org.lwjgl.system.NativeType("GLuint") int r4) {
            r0 = r3
            r1 = r4
            org.lwjgl.opengl.GL20C.glDetachShader(r0, r1)
            return
    }

    public static void nglShaderSource(int r7, int r8, long r9, long r11) {
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = r11
            org.lwjgl.opengl.GL20C.nglShaderSource(r0, r1, r2, r3)
            return
    }

    public static void glShaderSource(@org.lwjgl.system.NativeType("GLuint") int r4, @org.lwjgl.system.NativeType("GLchar const * const *") org.lwjgl.PointerBuffer r5, @javax.annotation.Nullable @org.lwjgl.system.NativeType("GLint const *") java.nio.IntBuffer r6) {
            r0 = r4
            r1 = r5
            r2 = r6
            org.lwjgl.opengl.GL20C.glShaderSource(r0, r1, r2)
            return
    }

    public static void glShaderSource(@org.lwjgl.system.NativeType("GLuint") int r3, @org.lwjgl.system.NativeType("GLchar const * const *") java.lang.CharSequence... r4) {
            r0 = r3
            r1 = r4
            org.lwjgl.opengl.GL20C.glShaderSource(r0, r1)
            return
    }

    public static void glShaderSource(@org.lwjgl.system.NativeType("GLuint") int r3, @org.lwjgl.system.NativeType("GLchar const * const *") java.lang.CharSequence r4) {
            r0 = r3
            r1 = r4
            org.lwjgl.opengl.GL20C.glShaderSource(r0, r1)
            return
    }

    public static void glCompileShader(@org.lwjgl.system.NativeType("GLuint") int r2) {
            r0 = r2
            org.lwjgl.opengl.GL20C.glCompileShader(r0)
            return
    }

    public static void glLinkProgram(@org.lwjgl.system.NativeType("GLuint") int r2) {
            r0 = r2
            org.lwjgl.opengl.GL20C.glLinkProgram(r0)
            return
    }

    public static void glUseProgram(@org.lwjgl.system.NativeType("GLuint") int r2) {
            r0 = r2
            org.lwjgl.opengl.GL20C.glUseProgram(r0)
            return
    }

    public static void glValidateProgram(@org.lwjgl.system.NativeType("GLuint") int r2) {
            r0 = r2
            org.lwjgl.opengl.GL20C.glValidateProgram(r0)
            return
    }

    public static void glUniform1f(@org.lwjgl.system.NativeType("GLint") int r3, @org.lwjgl.system.NativeType("GLfloat") float r4) {
            r0 = r3
            r1 = r4
            org.lwjgl.opengl.GL20C.glUniform1f(r0, r1)
            return
    }

    public static void glUniform2f(@org.lwjgl.system.NativeType("GLint") int r4, @org.lwjgl.system.NativeType("GLfloat") float r5, @org.lwjgl.system.NativeType("GLfloat") float r6) {
            r0 = r4
            r1 = r5
            r2 = r6
            org.lwjgl.opengl.GL20C.glUniform2f(r0, r1, r2)
            return
    }

    public static void glUniform3f(@org.lwjgl.system.NativeType("GLint") int r5, @org.lwjgl.system.NativeType("GLfloat") float r6, @org.lwjgl.system.NativeType("GLfloat") float r7, @org.lwjgl.system.NativeType("GLfloat") float r8) {
            r0 = r5
            r1 = r6
            r2 = r7
            r3 = r8
            org.lwjgl.opengl.GL20C.glUniform3f(r0, r1, r2, r3)
            return
    }

    public static void glUniform4f(@org.lwjgl.system.NativeType("GLint") int r6, @org.lwjgl.system.NativeType("GLfloat") float r7, @org.lwjgl.system.NativeType("GLfloat") float r8, @org.lwjgl.system.NativeType("GLfloat") float r9, @org.lwjgl.system.NativeType("GLfloat") float r10) {
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            org.lwjgl.opengl.GL20C.glUniform4f(r0, r1, r2, r3, r4)
            return
    }

    public static void glUniform1i(@org.lwjgl.system.NativeType("GLint") int r3, @org.lwjgl.system.NativeType("GLint") int r4) {
            r0 = r3
            r1 = r4
            org.lwjgl.opengl.GL20C.glUniform1i(r0, r1)
            return
    }

    public static void glUniform2i(@org.lwjgl.system.NativeType("GLint") int r4, @org.lwjgl.system.NativeType("GLint") int r5, @org.lwjgl.system.NativeType("GLint") int r6) {
            r0 = r4
            r1 = r5
            r2 = r6
            org.lwjgl.opengl.GL20C.glUniform2i(r0, r1, r2)
            return
    }

    public static void glUniform3i(@org.lwjgl.system.NativeType("GLint") int r5, @org.lwjgl.system.NativeType("GLint") int r6, @org.lwjgl.system.NativeType("GLint") int r7, @org.lwjgl.system.NativeType("GLint") int r8) {
            r0 = r5
            r1 = r6
            r2 = r7
            r3 = r8
            org.lwjgl.opengl.GL20C.glUniform3i(r0, r1, r2, r3)
            return
    }

    public static void glUniform4i(@org.lwjgl.system.NativeType("GLint") int r6, @org.lwjgl.system.NativeType("GLint") int r7, @org.lwjgl.system.NativeType("GLint") int r8, @org.lwjgl.system.NativeType("GLint") int r9, @org.lwjgl.system.NativeType("GLint") int r10) {
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            org.lwjgl.opengl.GL20C.glUniform4i(r0, r1, r2, r3, r4)
            return
    }

    public static void nglUniform1fv(int r5, int r6, long r7) {
            r0 = r5
            r1 = r6
            r2 = r7
            org.lwjgl.opengl.GL20C.nglUniform1fv(r0, r1, r2)
            return
    }

    public static void glUniform1fv(@org.lwjgl.system.NativeType("GLint") int r3, @org.lwjgl.system.NativeType("GLfloat const *") java.nio.FloatBuffer r4) {
            r0 = r3
            r1 = r4
            org.lwjgl.opengl.GL20C.glUniform1fv(r0, r1)
            return
    }

    public static void nglUniform2fv(int r5, int r6, long r7) {
            r0 = r5
            r1 = r6
            r2 = r7
            org.lwjgl.opengl.GL20C.nglUniform2fv(r0, r1, r2)
            return
    }

    public static void glUniform2fv(@org.lwjgl.system.NativeType("GLint") int r3, @org.lwjgl.system.NativeType("GLfloat const *") java.nio.FloatBuffer r4) {
            r0 = r3
            r1 = r4
            org.lwjgl.opengl.GL20C.glUniform2fv(r0, r1)
            return
    }

    public static void nglUniform3fv(int r5, int r6, long r7) {
            r0 = r5
            r1 = r6
            r2 = r7
            org.lwjgl.opengl.GL20C.nglUniform3fv(r0, r1, r2)
            return
    }

    public static void glUniform3fv(@org.lwjgl.system.NativeType("GLint") int r3, @org.lwjgl.system.NativeType("GLfloat const *") java.nio.FloatBuffer r4) {
            r0 = r3
            r1 = r4
            org.lwjgl.opengl.GL20C.glUniform3fv(r0, r1)
            return
    }

    public static void nglUniform4fv(int r5, int r6, long r7) {
            r0 = r5
            r1 = r6
            r2 = r7
            org.lwjgl.opengl.GL20C.nglUniform4fv(r0, r1, r2)
            return
    }

    public static void glUniform4fv(@org.lwjgl.system.NativeType("GLint") int r3, @org.lwjgl.system.NativeType("GLfloat const *") java.nio.FloatBuffer r4) {
            r0 = r3
            r1 = r4
            org.lwjgl.opengl.GL20C.glUniform4fv(r0, r1)
            return
    }

    public static void nglUniform1iv(int r5, int r6, long r7) {
            r0 = r5
            r1 = r6
            r2 = r7
            org.lwjgl.opengl.GL20C.nglUniform1iv(r0, r1, r2)
            return
    }

    public static void glUniform1iv(@org.lwjgl.system.NativeType("GLint") int r3, @org.lwjgl.system.NativeType("GLint const *") java.nio.IntBuffer r4) {
            r0 = r3
            r1 = r4
            org.lwjgl.opengl.GL20C.glUniform1iv(r0, r1)
            return
    }

    public static void nglUniform2iv(int r5, int r6, long r7) {
            r0 = r5
            r1 = r6
            r2 = r7
            org.lwjgl.opengl.GL20C.nglUniform2iv(r0, r1, r2)
            return
    }

    public static void glUniform2iv(@org.lwjgl.system.NativeType("GLint") int r3, @org.lwjgl.system.NativeType("GLint const *") java.nio.IntBuffer r4) {
            r0 = r3
            r1 = r4
            org.lwjgl.opengl.GL20C.glUniform2iv(r0, r1)
            return
    }

    public static void nglUniform3iv(int r5, int r6, long r7) {
            r0 = r5
            r1 = r6
            r2 = r7
            org.lwjgl.opengl.GL20C.nglUniform3iv(r0, r1, r2)
            return
    }

    public static void glUniform3iv(@org.lwjgl.system.NativeType("GLint") int r3, @org.lwjgl.system.NativeType("GLint const *") java.nio.IntBuffer r4) {
            r0 = r3
            r1 = r4
            org.lwjgl.opengl.GL20C.glUniform3iv(r0, r1)
            return
    }

    public static void nglUniform4iv(int r5, int r6, long r7) {
            r0 = r5
            r1 = r6
            r2 = r7
            org.lwjgl.opengl.GL20C.nglUniform4iv(r0, r1, r2)
            return
    }

    public static void glUniform4iv(@org.lwjgl.system.NativeType("GLint") int r3, @org.lwjgl.system.NativeType("GLint const *") java.nio.IntBuffer r4) {
            r0 = r3
            r1 = r4
            org.lwjgl.opengl.GL20C.glUniform4iv(r0, r1)
            return
    }

    public static void nglUniformMatrix2fv(int r6, int r7, boolean r8, long r9) {
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            org.lwjgl.opengl.GL20C.nglUniformMatrix2fv(r0, r1, r2, r3)
            return
    }

    public static void glUniformMatrix2fv(@org.lwjgl.system.NativeType("GLint") int r4, @org.lwjgl.system.NativeType("GLboolean") boolean r5, @org.lwjgl.system.NativeType("GLfloat const *") java.nio.FloatBuffer r6) {
            r0 = r4
            r1 = r5
            r2 = r6
            org.lwjgl.opengl.GL20C.glUniformMatrix2fv(r0, r1, r2)
            return
    }

    public static void nglUniformMatrix3fv(int r6, int r7, boolean r8, long r9) {
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            org.lwjgl.opengl.GL20C.nglUniformMatrix3fv(r0, r1, r2, r3)
            return
    }

    public static void glUniformMatrix3fv(@org.lwjgl.system.NativeType("GLint") int r4, @org.lwjgl.system.NativeType("GLboolean") boolean r5, @org.lwjgl.system.NativeType("GLfloat const *") java.nio.FloatBuffer r6) {
            r0 = r4
            r1 = r5
            r2 = r6
            org.lwjgl.opengl.GL20C.glUniformMatrix3fv(r0, r1, r2)
            return
    }

    public static void nglUniformMatrix4fv(int r6, int r7, boolean r8, long r9) {
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            org.lwjgl.opengl.GL20C.nglUniformMatrix4fv(r0, r1, r2, r3)
            return
    }

    public static void glUniformMatrix4fv(@org.lwjgl.system.NativeType("GLint") int r4, @org.lwjgl.system.NativeType("GLboolean") boolean r5, @org.lwjgl.system.NativeType("GLfloat const *") java.nio.FloatBuffer r6) {
            r0 = r4
            r1 = r5
            r2 = r6
            org.lwjgl.opengl.GL20C.glUniformMatrix4fv(r0, r1, r2)
            return
    }

    public static void nglGetShaderiv(int r5, int r6, long r7) {
            r0 = r5
            r1 = r6
            r2 = r7
            org.lwjgl.opengl.GL20C.nglGetShaderiv(r0, r1, r2)
            return
    }

    public static void glGetShaderiv(@org.lwjgl.system.NativeType("GLuint") int r4, @org.lwjgl.system.NativeType("GLenum") int r5, @org.lwjgl.system.NativeType("GLint *") java.nio.IntBuffer r6) {
            r0 = r4
            r1 = r5
            r2 = r6
            org.lwjgl.opengl.GL20C.glGetShaderiv(r0, r1, r2)
            return
    }

    @org.lwjgl.system.NativeType("void")
    public static int glGetShaderi(@org.lwjgl.system.NativeType("GLuint") int r3, @org.lwjgl.system.NativeType("GLenum") int r4) {
            r0 = r3
            r1 = r4
            int r0 = org.lwjgl.opengl.GL20C.glGetShaderi(r0, r1)
            return r0
    }

    public static void nglGetProgramiv(int r5, int r6, long r7) {
            r0 = r5
            r1 = r6
            r2 = r7
            org.lwjgl.opengl.GL20C.nglGetProgramiv(r0, r1, r2)
            return
    }

    public static void glGetProgramiv(@org.lwjgl.system.NativeType("GLuint") int r4, @org.lwjgl.system.NativeType("GLenum") int r5, @org.lwjgl.system.NativeType("GLint *") java.nio.IntBuffer r6) {
            r0 = r4
            r1 = r5
            r2 = r6
            org.lwjgl.opengl.GL20C.glGetProgramiv(r0, r1, r2)
            return
    }

    @org.lwjgl.system.NativeType("void")
    public static int glGetProgrami(@org.lwjgl.system.NativeType("GLuint") int r3, @org.lwjgl.system.NativeType("GLenum") int r4) {
            r0 = r3
            r1 = r4
            int r0 = org.lwjgl.opengl.GL20C.glGetProgrami(r0, r1)
            return r0
    }

    public static void nglGetShaderInfoLog(int r7, int r8, long r9, long r11) {
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = r11
            org.lwjgl.opengl.GL20C.nglGetShaderInfoLog(r0, r1, r2, r3)
            return
    }

    public static void glGetShaderInfoLog(@org.lwjgl.system.NativeType("GLuint") int r4, @javax.annotation.Nullable @org.lwjgl.system.NativeType("GLsizei *") java.nio.IntBuffer r5, @org.lwjgl.system.NativeType("GLchar *") java.nio.ByteBuffer r6) {
            r0 = r4
            r1 = r5
            r2 = r6
            org.lwjgl.opengl.GL20C.glGetShaderInfoLog(r0, r1, r2)
            return
    }

    @org.lwjgl.system.NativeType("void")
    public static java.lang.String glGetShaderInfoLog(@org.lwjgl.system.NativeType("GLuint") int r3, @org.lwjgl.system.NativeType("GLsizei") int r4) {
            r0 = r3
            r1 = r4
            java.lang.String r0 = org.lwjgl.opengl.GL20C.glGetShaderInfoLog(r0, r1)
            return r0
    }

    @org.lwjgl.system.NativeType("void")
    public static java.lang.String glGetShaderInfoLog(@org.lwjgl.system.NativeType("GLuint") int r4) {
            r0 = r4
            r1 = r4
            r2 = 35716(0x8b84, float:5.0049E-41)
            int r1 = glGetShaderi(r1, r2)
            java.lang.String r0 = glGetShaderInfoLog(r0, r1)
            return r0
    }

    public static void nglGetProgramInfoLog(int r7, int r8, long r9, long r11) {
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = r11
            org.lwjgl.opengl.GL20C.nglGetProgramInfoLog(r0, r1, r2, r3)
            return
    }

    public static void glGetProgramInfoLog(@org.lwjgl.system.NativeType("GLuint") int r4, @javax.annotation.Nullable @org.lwjgl.system.NativeType("GLsizei *") java.nio.IntBuffer r5, @org.lwjgl.system.NativeType("GLchar *") java.nio.ByteBuffer r6) {
            r0 = r4
            r1 = r5
            r2 = r6
            org.lwjgl.opengl.GL20C.glGetProgramInfoLog(r0, r1, r2)
            return
    }

    @org.lwjgl.system.NativeType("void")
    public static java.lang.String glGetProgramInfoLog(@org.lwjgl.system.NativeType("GLuint") int r3, @org.lwjgl.system.NativeType("GLsizei") int r4) {
            r0 = r3
            r1 = r4
            java.lang.String r0 = org.lwjgl.opengl.GL20C.glGetProgramInfoLog(r0, r1)
            return r0
    }

    @org.lwjgl.system.NativeType("void")
    public static java.lang.String glGetProgramInfoLog(@org.lwjgl.system.NativeType("GLuint") int r4) {
            r0 = r4
            r1 = r4
            r2 = 35716(0x8b84, float:5.0049E-41)
            int r1 = glGetProgrami(r1, r2)
            java.lang.String r0 = glGetProgramInfoLog(r0, r1)
            return r0
    }

    public static void nglGetAttachedShaders(int r7, int r8, long r9, long r11) {
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = r11
            org.lwjgl.opengl.GL20C.nglGetAttachedShaders(r0, r1, r2, r3)
            return
    }

    public static void glGetAttachedShaders(@org.lwjgl.system.NativeType("GLuint") int r4, @javax.annotation.Nullable @org.lwjgl.system.NativeType("GLsizei *") java.nio.IntBuffer r5, @org.lwjgl.system.NativeType("GLuint *") java.nio.IntBuffer r6) {
            r0 = r4
            r1 = r5
            r2 = r6
            org.lwjgl.opengl.GL20C.glGetAttachedShaders(r0, r1, r2)
            return
    }

    public static int nglGetUniformLocation(int r4, long r5) {
            r0 = r4
            r1 = r5
            int r0 = org.lwjgl.opengl.GL20C.nglGetUniformLocation(r0, r1)
            return r0
    }

    @org.lwjgl.system.NativeType("GLint")
    public static int glGetUniformLocation(@org.lwjgl.system.NativeType("GLuint") int r3, @org.lwjgl.system.NativeType("GLchar const *") java.nio.ByteBuffer r4) {
            r0 = r3
            r1 = r4
            int r0 = org.lwjgl.opengl.GL20C.glGetUniformLocation(r0, r1)
            return r0
    }

    @org.lwjgl.system.NativeType("GLint")
    public static int glGetUniformLocation(@org.lwjgl.system.NativeType("GLuint") int r3, @org.lwjgl.system.NativeType("GLchar const *") java.lang.CharSequence r4) {
            r0 = r3
            r1 = r4
            int r0 = org.lwjgl.opengl.GL20C.glGetUniformLocation(r0, r1)
            return r0
    }

    public static void nglGetActiveUniform(int r12, int r13, int r14, long r15, long r17, long r19, long r21) {
            r0 = r12
            r1 = r13
            r2 = r14
            r3 = r15
            r4 = r17
            r5 = r19
            r6 = r21
            org.lwjgl.opengl.GL20C.nglGetActiveUniform(r0, r1, r2, r3, r4, r5, r6)
            return
    }

    public static void glGetActiveUniform(@org.lwjgl.system.NativeType("GLuint") int r7, @org.lwjgl.system.NativeType("GLuint") int r8, @javax.annotation.Nullable @org.lwjgl.system.NativeType("GLsizei *") java.nio.IntBuffer r9, @org.lwjgl.system.NativeType("GLint *") java.nio.IntBuffer r10, @org.lwjgl.system.NativeType("GLenum *") java.nio.IntBuffer r11, @org.lwjgl.system.NativeType("GLchar *") java.nio.ByteBuffer r12) {
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            r5 = r12
            org.lwjgl.opengl.GL20C.glGetActiveUniform(r0, r1, r2, r3, r4, r5)
            return
    }

    @org.lwjgl.system.NativeType("void")
    public static java.lang.String glGetActiveUniform(@org.lwjgl.system.NativeType("GLuint") int r6, @org.lwjgl.system.NativeType("GLuint") int r7, @org.lwjgl.system.NativeType("GLsizei") int r8, @org.lwjgl.system.NativeType("GLint *") java.nio.IntBuffer r9, @org.lwjgl.system.NativeType("GLenum *") java.nio.IntBuffer r10) {
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            java.lang.String r0 = org.lwjgl.opengl.GL20C.glGetActiveUniform(r0, r1, r2, r3, r4)
            return r0
    }

    @org.lwjgl.system.NativeType("void")
    public static java.lang.String glGetActiveUniform(@org.lwjgl.system.NativeType("GLuint") int r6, @org.lwjgl.system.NativeType("GLuint") int r7, @org.lwjgl.system.NativeType("GLint *") java.nio.IntBuffer r8, @org.lwjgl.system.NativeType("GLenum *") java.nio.IntBuffer r9) {
            r0 = r6
            r1 = r7
            r2 = r6
            r3 = 35719(0x8b87, float:5.0053E-41)
            int r2 = glGetProgrami(r2, r3)
            r3 = r8
            r4 = r9
            java.lang.String r0 = glGetActiveUniform(r0, r1, r2, r3, r4)
            return r0
    }

    public static void nglGetUniformfv(int r5, int r6, long r7) {
            r0 = r5
            r1 = r6
            r2 = r7
            org.lwjgl.opengl.GL20C.nglGetUniformfv(r0, r1, r2)
            return
    }

    public static void glGetUniformfv(@org.lwjgl.system.NativeType("GLuint") int r4, @org.lwjgl.system.NativeType("GLint") int r5, @org.lwjgl.system.NativeType("GLfloat *") java.nio.FloatBuffer r6) {
            r0 = r4
            r1 = r5
            r2 = r6
            org.lwjgl.opengl.GL20C.glGetUniformfv(r0, r1, r2)
            return
    }

    @org.lwjgl.system.NativeType("void")
    public static float glGetUniformf(@org.lwjgl.system.NativeType("GLuint") int r3, @org.lwjgl.system.NativeType("GLint") int r4) {
            r0 = r3
            r1 = r4
            float r0 = org.lwjgl.opengl.GL20C.glGetUniformf(r0, r1)
            return r0
    }

    public static void nglGetUniformiv(int r5, int r6, long r7) {
            r0 = r5
            r1 = r6
            r2 = r7
            org.lwjgl.opengl.GL20C.nglGetUniformiv(r0, r1, r2)
            return
    }

    public static void glGetUniformiv(@org.lwjgl.system.NativeType("GLuint") int r4, @org.lwjgl.system.NativeType("GLint") int r5, @org.lwjgl.system.NativeType("GLint *") java.nio.IntBuffer r6) {
            r0 = r4
            r1 = r5
            r2 = r6
            org.lwjgl.opengl.GL20C.glGetUniformiv(r0, r1, r2)
            return
    }

    @org.lwjgl.system.NativeType("void")
    public static int glGetUniformi(@org.lwjgl.system.NativeType("GLuint") int r3, @org.lwjgl.system.NativeType("GLint") int r4) {
            r0 = r3
            r1 = r4
            int r0 = org.lwjgl.opengl.GL20C.glGetUniformi(r0, r1)
            return r0
    }

    public static void nglGetShaderSource(int r7, int r8, long r9, long r11) {
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = r11
            org.lwjgl.opengl.GL20C.nglGetShaderSource(r0, r1, r2, r3)
            return
    }

    public static void glGetShaderSource(@org.lwjgl.system.NativeType("GLuint") int r4, @javax.annotation.Nullable @org.lwjgl.system.NativeType("GLsizei *") java.nio.IntBuffer r5, @org.lwjgl.system.NativeType("GLchar *") java.nio.ByteBuffer r6) {
            r0 = r4
            r1 = r5
            r2 = r6
            org.lwjgl.opengl.GL20C.glGetShaderSource(r0, r1, r2)
            return
    }

    @org.lwjgl.system.NativeType("void")
    public static java.lang.String glGetShaderSource(@org.lwjgl.system.NativeType("GLuint") int r3, @org.lwjgl.system.NativeType("GLsizei") int r4) {
            r0 = r3
            r1 = r4
            java.lang.String r0 = org.lwjgl.opengl.GL20C.glGetShaderSource(r0, r1)
            return r0
    }

    @org.lwjgl.system.NativeType("void")
    public static java.lang.String glGetShaderSource(@org.lwjgl.system.NativeType("GLuint") int r4) {
            r0 = r4
            r1 = r4
            r2 = 35720(0x8b88, float:5.0054E-41)
            int r1 = glGetShaderi(r1, r2)
            java.lang.String r0 = glGetShaderSource(r0, r1)
            return r0
    }

    public static void glVertexAttrib1f(@org.lwjgl.system.NativeType("GLuint") int r3, @org.lwjgl.system.NativeType("GLfloat") float r4) {
            r0 = r3
            r1 = r4
            org.lwjgl.opengl.GL20C.glVertexAttrib1f(r0, r1)
            return
    }

    public static void glVertexAttrib1s(@org.lwjgl.system.NativeType("GLuint") int r3, @org.lwjgl.system.NativeType("GLshort") short r4) {
            r0 = r3
            r1 = r4
            org.lwjgl.opengl.GL20C.glVertexAttrib1s(r0, r1)
            return
    }

    public static void glVertexAttrib1d(@org.lwjgl.system.NativeType("GLuint") int r4, @org.lwjgl.system.NativeType("GLdouble") double r5) {
            r0 = r4
            r1 = r5
            org.lwjgl.opengl.GL20C.glVertexAttrib1d(r0, r1)
            return
    }

    public static void glVertexAttrib2f(@org.lwjgl.system.NativeType("GLuint") int r4, @org.lwjgl.system.NativeType("GLfloat") float r5, @org.lwjgl.system.NativeType("GLfloat") float r6) {
            r0 = r4
            r1 = r5
            r2 = r6
            org.lwjgl.opengl.GL20C.glVertexAttrib2f(r0, r1, r2)
            return
    }

    public static void glVertexAttrib2s(@org.lwjgl.system.NativeType("GLuint") int r4, @org.lwjgl.system.NativeType("GLshort") short r5, @org.lwjgl.system.NativeType("GLshort") short r6) {
            r0 = r4
            r1 = r5
            r2 = r6
            org.lwjgl.opengl.GL20C.glVertexAttrib2s(r0, r1, r2)
            return
    }

    public static void glVertexAttrib2d(@org.lwjgl.system.NativeType("GLuint") int r6, @org.lwjgl.system.NativeType("GLdouble") double r7, @org.lwjgl.system.NativeType("GLdouble") double r9) {
            r0 = r6
            r1 = r7
            r2 = r9
            org.lwjgl.opengl.GL20C.glVertexAttrib2d(r0, r1, r2)
            return
    }

    public static void glVertexAttrib3f(@org.lwjgl.system.NativeType("GLuint") int r5, @org.lwjgl.system.NativeType("GLfloat") float r6, @org.lwjgl.system.NativeType("GLfloat") float r7, @org.lwjgl.system.NativeType("GLfloat") float r8) {
            r0 = r5
            r1 = r6
            r2 = r7
            r3 = r8
            org.lwjgl.opengl.GL20C.glVertexAttrib3f(r0, r1, r2, r3)
            return
    }

    public static void glVertexAttrib3s(@org.lwjgl.system.NativeType("GLuint") int r5, @org.lwjgl.system.NativeType("GLshort") short r6, @org.lwjgl.system.NativeType("GLshort") short r7, @org.lwjgl.system.NativeType("GLshort") short r8) {
            r0 = r5
            r1 = r6
            r2 = r7
            r3 = r8
            org.lwjgl.opengl.GL20C.glVertexAttrib3s(r0, r1, r2, r3)
            return
    }

    public static void glVertexAttrib3d(@org.lwjgl.system.NativeType("GLuint") int r8, @org.lwjgl.system.NativeType("GLdouble") double r9, @org.lwjgl.system.NativeType("GLdouble") double r11, @org.lwjgl.system.NativeType("GLdouble") double r13) {
            r0 = r8
            r1 = r9
            r2 = r11
            r3 = r13
            org.lwjgl.opengl.GL20C.glVertexAttrib3d(r0, r1, r2, r3)
            return
    }

    public static void glVertexAttrib4f(@org.lwjgl.system.NativeType("GLuint") int r6, @org.lwjgl.system.NativeType("GLfloat") float r7, @org.lwjgl.system.NativeType("GLfloat") float r8, @org.lwjgl.system.NativeType("GLfloat") float r9, @org.lwjgl.system.NativeType("GLfloat") float r10) {
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            org.lwjgl.opengl.GL20C.glVertexAttrib4f(r0, r1, r2, r3, r4)
            return
    }

    public static void glVertexAttrib4s(@org.lwjgl.system.NativeType("GLuint") int r6, @org.lwjgl.system.NativeType("GLshort") short r7, @org.lwjgl.system.NativeType("GLshort") short r8, @org.lwjgl.system.NativeType("GLshort") short r9, @org.lwjgl.system.NativeType("GLshort") short r10) {
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            org.lwjgl.opengl.GL20C.glVertexAttrib4s(r0, r1, r2, r3, r4)
            return
    }

    public static void glVertexAttrib4d(@org.lwjgl.system.NativeType("GLuint") int r10, @org.lwjgl.system.NativeType("GLdouble") double r11, @org.lwjgl.system.NativeType("GLdouble") double r13, @org.lwjgl.system.NativeType("GLdouble") double r15, @org.lwjgl.system.NativeType("GLdouble") double r17) {
            r0 = r10
            r1 = r11
            r2 = r13
            r3 = r15
            r4 = r17
            org.lwjgl.opengl.GL20C.glVertexAttrib4d(r0, r1, r2, r3, r4)
            return
    }

    public static void glVertexAttrib4Nub(@org.lwjgl.system.NativeType("GLuint") int r6, @org.lwjgl.system.NativeType("GLubyte") byte r7, @org.lwjgl.system.NativeType("GLubyte") byte r8, @org.lwjgl.system.NativeType("GLubyte") byte r9, @org.lwjgl.system.NativeType("GLubyte") byte r10) {
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            org.lwjgl.opengl.GL20C.glVertexAttrib4Nub(r0, r1, r2, r3, r4)
            return
    }

    public static void nglVertexAttrib1fv(int r4, long r5) {
            r0 = r4
            r1 = r5
            org.lwjgl.opengl.GL20C.nglVertexAttrib1fv(r0, r1)
            return
    }

    public static void glVertexAttrib1fv(@org.lwjgl.system.NativeType("GLuint") int r3, @org.lwjgl.system.NativeType("GLfloat const *") java.nio.FloatBuffer r4) {
            r0 = r3
            r1 = r4
            org.lwjgl.opengl.GL20C.glVertexAttrib1fv(r0, r1)
            return
    }

    public static void nglVertexAttrib1sv(int r4, long r5) {
            r0 = r4
            r1 = r5
            org.lwjgl.opengl.GL20C.nglVertexAttrib1sv(r0, r1)
            return
    }

    public static void glVertexAttrib1sv(@org.lwjgl.system.NativeType("GLuint") int r3, @org.lwjgl.system.NativeType("GLshort const *") java.nio.ShortBuffer r4) {
            r0 = r3
            r1 = r4
            org.lwjgl.opengl.GL20C.glVertexAttrib1sv(r0, r1)
            return
    }

    public static void nglVertexAttrib1dv(int r4, long r5) {
            r0 = r4
            r1 = r5
            org.lwjgl.opengl.GL20C.nglVertexAttrib1dv(r0, r1)
            return
    }

    public static void glVertexAttrib1dv(@org.lwjgl.system.NativeType("GLuint") int r3, @org.lwjgl.system.NativeType("GLdouble const *") java.nio.DoubleBuffer r4) {
            r0 = r3
            r1 = r4
            org.lwjgl.opengl.GL20C.glVertexAttrib1dv(r0, r1)
            return
    }

    public static void nglVertexAttrib2fv(int r4, long r5) {
            r0 = r4
            r1 = r5
            org.lwjgl.opengl.GL20C.nglVertexAttrib2fv(r0, r1)
            return
    }

    public static void glVertexAttrib2fv(@org.lwjgl.system.NativeType("GLuint") int r3, @org.lwjgl.system.NativeType("GLfloat const *") java.nio.FloatBuffer r4) {
            r0 = r3
            r1 = r4
            org.lwjgl.opengl.GL20C.glVertexAttrib2fv(r0, r1)
            return
    }

    public static void nglVertexAttrib2sv(int r4, long r5) {
            r0 = r4
            r1 = r5
            org.lwjgl.opengl.GL20C.nglVertexAttrib2sv(r0, r1)
            return
    }

    public static void glVertexAttrib2sv(@org.lwjgl.system.NativeType("GLuint") int r3, @org.lwjgl.system.NativeType("GLshort const *") java.nio.ShortBuffer r4) {
            r0 = r3
            r1 = r4
            org.lwjgl.opengl.GL20C.glVertexAttrib2sv(r0, r1)
            return
    }

    public static void nglVertexAttrib2dv(int r4, long r5) {
            r0 = r4
            r1 = r5
            org.lwjgl.opengl.GL20C.nglVertexAttrib2dv(r0, r1)
            return
    }

    public static void glVertexAttrib2dv(@org.lwjgl.system.NativeType("GLuint") int r3, @org.lwjgl.system.NativeType("GLdouble const *") java.nio.DoubleBuffer r4) {
            r0 = r3
            r1 = r4
            org.lwjgl.opengl.GL20C.glVertexAttrib2dv(r0, r1)
            return
    }

    public static void nglVertexAttrib3fv(int r4, long r5) {
            r0 = r4
            r1 = r5
            org.lwjgl.opengl.GL20C.nglVertexAttrib3fv(r0, r1)
            return
    }

    public static void glVertexAttrib3fv(@org.lwjgl.system.NativeType("GLuint") int r3, @org.lwjgl.system.NativeType("GLfloat const *") java.nio.FloatBuffer r4) {
            r0 = r3
            r1 = r4
            org.lwjgl.opengl.GL20C.glVertexAttrib3fv(r0, r1)
            return
    }

    public static void nglVertexAttrib3sv(int r4, long r5) {
            r0 = r4
            r1 = r5
            org.lwjgl.opengl.GL20C.nglVertexAttrib3sv(r0, r1)
            return
    }

    public static void glVertexAttrib3sv(@org.lwjgl.system.NativeType("GLuint") int r3, @org.lwjgl.system.NativeType("GLshort const *") java.nio.ShortBuffer r4) {
            r0 = r3
            r1 = r4
            org.lwjgl.opengl.GL20C.glVertexAttrib3sv(r0, r1)
            return
    }

    public static void nglVertexAttrib3dv(int r4, long r5) {
            r0 = r4
            r1 = r5
            org.lwjgl.opengl.GL20C.nglVertexAttrib3dv(r0, r1)
            return
    }

    public static void glVertexAttrib3dv(@org.lwjgl.system.NativeType("GLuint") int r3, @org.lwjgl.system.NativeType("GLdouble const *") java.nio.DoubleBuffer r4) {
            r0 = r3
            r1 = r4
            org.lwjgl.opengl.GL20C.glVertexAttrib3dv(r0, r1)
            return
    }

    public static void nglVertexAttrib4fv(int r4, long r5) {
            r0 = r4
            r1 = r5
            org.lwjgl.opengl.GL20C.nglVertexAttrib4fv(r0, r1)
            return
    }

    public static void glVertexAttrib4fv(@org.lwjgl.system.NativeType("GLuint") int r3, @org.lwjgl.system.NativeType("GLfloat const *") java.nio.FloatBuffer r4) {
            r0 = r3
            r1 = r4
            org.lwjgl.opengl.GL20C.glVertexAttrib4fv(r0, r1)
            return
    }

    public static void nglVertexAttrib4sv(int r4, long r5) {
            r0 = r4
            r1 = r5
            org.lwjgl.opengl.GL20C.nglVertexAttrib4sv(r0, r1)
            return
    }

    public static void glVertexAttrib4sv(@org.lwjgl.system.NativeType("GLuint") int r3, @org.lwjgl.system.NativeType("GLshort const *") java.nio.ShortBuffer r4) {
            r0 = r3
            r1 = r4
            org.lwjgl.opengl.GL20C.glVertexAttrib4sv(r0, r1)
            return
    }

    public static void nglVertexAttrib4dv(int r4, long r5) {
            r0 = r4
            r1 = r5
            org.lwjgl.opengl.GL20C.nglVertexAttrib4dv(r0, r1)
            return
    }

    public static void glVertexAttrib4dv(@org.lwjgl.system.NativeType("GLuint") int r3, @org.lwjgl.system.NativeType("GLdouble const *") java.nio.DoubleBuffer r4) {
            r0 = r3
            r1 = r4
            org.lwjgl.opengl.GL20C.glVertexAttrib4dv(r0, r1)
            return
    }

    public static void nglVertexAttrib4iv(int r4, long r5) {
            r0 = r4
            r1 = r5
            org.lwjgl.opengl.GL20C.nglVertexAttrib4iv(r0, r1)
            return
    }

    public static void glVertexAttrib4iv(@org.lwjgl.system.NativeType("GLuint") int r3, @org.lwjgl.system.NativeType("GLint const *") java.nio.IntBuffer r4) {
            r0 = r3
            r1 = r4
            org.lwjgl.opengl.GL20C.glVertexAttrib4iv(r0, r1)
            return
    }

    public static void nglVertexAttrib4bv(int r4, long r5) {
            r0 = r4
            r1 = r5
            org.lwjgl.opengl.GL20C.nglVertexAttrib4bv(r0, r1)
            return
    }

    public static void glVertexAttrib4bv(@org.lwjgl.system.NativeType("GLuint") int r3, @org.lwjgl.system.NativeType("GLbyte const *") java.nio.ByteBuffer r4) {
            r0 = r3
            r1 = r4
            org.lwjgl.opengl.GL20C.glVertexAttrib4bv(r0, r1)
            return
    }

    public static void nglVertexAttrib4ubv(int r4, long r5) {
            r0 = r4
            r1 = r5
            org.lwjgl.opengl.GL20C.nglVertexAttrib4ubv(r0, r1)
            return
    }

    public static void glVertexAttrib4ubv(@org.lwjgl.system.NativeType("GLuint") int r3, @org.lwjgl.system.NativeType("GLubyte const *") java.nio.ByteBuffer r4) {
            r0 = r3
            r1 = r4
            org.lwjgl.opengl.GL20C.glVertexAttrib4ubv(r0, r1)
            return
    }

    public static void nglVertexAttrib4usv(int r4, long r5) {
            r0 = r4
            r1 = r5
            org.lwjgl.opengl.GL20C.nglVertexAttrib4usv(r0, r1)
            return
    }

    public static void glVertexAttrib4usv(@org.lwjgl.system.NativeType("GLuint") int r3, @org.lwjgl.system.NativeType("GLushort const *") java.nio.ShortBuffer r4) {
            r0 = r3
            r1 = r4
            org.lwjgl.opengl.GL20C.glVertexAttrib4usv(r0, r1)
            return
    }

    public static void nglVertexAttrib4uiv(int r4, long r5) {
            r0 = r4
            r1 = r5
            org.lwjgl.opengl.GL20C.nglVertexAttrib4uiv(r0, r1)
            return
    }

    public static void glVertexAttrib4uiv(@org.lwjgl.system.NativeType("GLuint") int r3, @org.lwjgl.system.NativeType("GLuint const *") java.nio.IntBuffer r4) {
            r0 = r3
            r1 = r4
            org.lwjgl.opengl.GL20C.glVertexAttrib4uiv(r0, r1)
            return
    }

    public static void nglVertexAttrib4Nbv(int r4, long r5) {
            r0 = r4
            r1 = r5
            org.lwjgl.opengl.GL20C.nglVertexAttrib4Nbv(r0, r1)
            return
    }

    public static void glVertexAttrib4Nbv(@org.lwjgl.system.NativeType("GLuint") int r3, @org.lwjgl.system.NativeType("GLbyte const *") java.nio.ByteBuffer r4) {
            r0 = r3
            r1 = r4
            org.lwjgl.opengl.GL20C.glVertexAttrib4Nbv(r0, r1)
            return
    }

    public static void nglVertexAttrib4Nsv(int r4, long r5) {
            r0 = r4
            r1 = r5
            org.lwjgl.opengl.GL20C.nglVertexAttrib4Nsv(r0, r1)
            return
    }

    public static void glVertexAttrib4Nsv(@org.lwjgl.system.NativeType("GLuint") int r3, @org.lwjgl.system.NativeType("GLshort const *") java.nio.ShortBuffer r4) {
            r0 = r3
            r1 = r4
            org.lwjgl.opengl.GL20C.glVertexAttrib4Nsv(r0, r1)
            return
    }

    public static void nglVertexAttrib4Niv(int r4, long r5) {
            r0 = r4
            r1 = r5
            org.lwjgl.opengl.GL20C.nglVertexAttrib4Niv(r0, r1)
            return
    }

    public static void glVertexAttrib4Niv(@org.lwjgl.system.NativeType("GLuint") int r3, @org.lwjgl.system.NativeType("GLint const *") java.nio.IntBuffer r4) {
            r0 = r3
            r1 = r4
            org.lwjgl.opengl.GL20C.glVertexAttrib4Niv(r0, r1)
            return
    }

    public static void nglVertexAttrib4Nubv(int r4, long r5) {
            r0 = r4
            r1 = r5
            org.lwjgl.opengl.GL20C.nglVertexAttrib4Nubv(r0, r1)
            return
    }

    public static void glVertexAttrib4Nubv(@org.lwjgl.system.NativeType("GLuint") int r3, @org.lwjgl.system.NativeType("GLubyte const *") java.nio.ByteBuffer r4) {
            r0 = r3
            r1 = r4
            org.lwjgl.opengl.GL20C.glVertexAttrib4Nubv(r0, r1)
            return
    }

    public static void nglVertexAttrib4Nusv(int r4, long r5) {
            r0 = r4
            r1 = r5
            org.lwjgl.opengl.GL20C.nglVertexAttrib4Nusv(r0, r1)
            return
    }

    public static void glVertexAttrib4Nusv(@org.lwjgl.system.NativeType("GLuint") int r3, @org.lwjgl.system.NativeType("GLushort const *") java.nio.ShortBuffer r4) {
            r0 = r3
            r1 = r4
            org.lwjgl.opengl.GL20C.glVertexAttrib4Nusv(r0, r1)
            return
    }

    public static void nglVertexAttrib4Nuiv(int r4, long r5) {
            r0 = r4
            r1 = r5
            org.lwjgl.opengl.GL20C.nglVertexAttrib4Nuiv(r0, r1)
            return
    }

    public static void glVertexAttrib4Nuiv(@org.lwjgl.system.NativeType("GLuint") int r3, @org.lwjgl.system.NativeType("GLuint const *") java.nio.IntBuffer r4) {
            r0 = r3
            r1 = r4
            org.lwjgl.opengl.GL20C.glVertexAttrib4Nuiv(r0, r1)
            return
    }

    public static void nglVertexAttribPointer(int r8, int r9, int r10, boolean r11, int r12, long r13) {
            r0 = r8
            r1 = r9
            r2 = r10
            r3 = r11
            r4 = r12
            r5 = r13
            org.lwjgl.opengl.GL20C.nglVertexAttribPointer(r0, r1, r2, r3, r4, r5)
            return
    }

    public static void glVertexAttribPointer(@org.lwjgl.system.NativeType("GLuint") int r7, @org.lwjgl.system.NativeType("GLint") int r8, @org.lwjgl.system.NativeType("GLenum") int r9, @org.lwjgl.system.NativeType("GLboolean") boolean r10, @org.lwjgl.system.NativeType("GLsizei") int r11, @org.lwjgl.system.NativeType("void const *") java.nio.ByteBuffer r12) {
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            r5 = r12
            org.lwjgl.opengl.GL20C.glVertexAttribPointer(r0, r1, r2, r3, r4, r5)
            return
    }

    public static void glVertexAttribPointer(@org.lwjgl.system.NativeType("GLuint") int r8, @org.lwjgl.system.NativeType("GLint") int r9, @org.lwjgl.system.NativeType("GLenum") int r10, @org.lwjgl.system.NativeType("GLboolean") boolean r11, @org.lwjgl.system.NativeType("GLsizei") int r12, @org.lwjgl.system.NativeType("void const *") long r13) {
            r0 = r8
            r1 = r9
            r2 = r10
            r3 = r11
            r4 = r12
            r5 = r13
            org.lwjgl.opengl.GL20C.glVertexAttribPointer(r0, r1, r2, r3, r4, r5)
            return
    }

    public static void glVertexAttribPointer(@org.lwjgl.system.NativeType("GLuint") int r7, @org.lwjgl.system.NativeType("GLint") int r8, @org.lwjgl.system.NativeType("GLenum") int r9, @org.lwjgl.system.NativeType("GLboolean") boolean r10, @org.lwjgl.system.NativeType("GLsizei") int r11, @org.lwjgl.system.NativeType("void const *") java.nio.ShortBuffer r12) {
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            r5 = r12
            org.lwjgl.opengl.GL20C.glVertexAttribPointer(r0, r1, r2, r3, r4, r5)
            return
    }

    public static void glVertexAttribPointer(@org.lwjgl.system.NativeType("GLuint") int r7, @org.lwjgl.system.NativeType("GLint") int r8, @org.lwjgl.system.NativeType("GLenum") int r9, @org.lwjgl.system.NativeType("GLboolean") boolean r10, @org.lwjgl.system.NativeType("GLsizei") int r11, @org.lwjgl.system.NativeType("void const *") java.nio.IntBuffer r12) {
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            r5 = r12
            org.lwjgl.opengl.GL20C.glVertexAttribPointer(r0, r1, r2, r3, r4, r5)
            return
    }

    public static void glVertexAttribPointer(@org.lwjgl.system.NativeType("GLuint") int r7, @org.lwjgl.system.NativeType("GLint") int r8, @org.lwjgl.system.NativeType("GLenum") int r9, @org.lwjgl.system.NativeType("GLboolean") boolean r10, @org.lwjgl.system.NativeType("GLsizei") int r11, @org.lwjgl.system.NativeType("void const *") java.nio.FloatBuffer r12) {
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            r5 = r12
            org.lwjgl.opengl.GL20C.glVertexAttribPointer(r0, r1, r2, r3, r4, r5)
            return
    }

    public static void glEnableVertexAttribArray(@org.lwjgl.system.NativeType("GLuint") int r2) {
            r0 = r2
            org.lwjgl.opengl.GL20C.glEnableVertexAttribArray(r0)
            return
    }

    public static void glDisableVertexAttribArray(@org.lwjgl.system.NativeType("GLuint") int r2) {
            r0 = r2
            org.lwjgl.opengl.GL20C.glDisableVertexAttribArray(r0)
            return
    }

    public static void nglBindAttribLocation(int r5, int r6, long r7) {
            r0 = r5
            r1 = r6
            r2 = r7
            org.lwjgl.opengl.GL20C.nglBindAttribLocation(r0, r1, r2)
            return
    }

    public static void glBindAttribLocation(@org.lwjgl.system.NativeType("GLuint") int r4, @org.lwjgl.system.NativeType("GLuint") int r5, @org.lwjgl.system.NativeType("GLchar const *") java.nio.ByteBuffer r6) {
            r0 = r4
            r1 = r5
            r2 = r6
            org.lwjgl.opengl.GL20C.glBindAttribLocation(r0, r1, r2)
            return
    }

    public static void glBindAttribLocation(@org.lwjgl.system.NativeType("GLuint") int r4, @org.lwjgl.system.NativeType("GLuint") int r5, @org.lwjgl.system.NativeType("GLchar const *") java.lang.CharSequence r6) {
            r0 = r4
            r1 = r5
            r2 = r6
            org.lwjgl.opengl.GL20C.glBindAttribLocation(r0, r1, r2)
            return
    }

    public static void nglGetActiveAttrib(int r12, int r13, int r14, long r15, long r17, long r19, long r21) {
            r0 = r12
            r1 = r13
            r2 = r14
            r3 = r15
            r4 = r17
            r5 = r19
            r6 = r21
            org.lwjgl.opengl.GL20C.nglGetActiveAttrib(r0, r1, r2, r3, r4, r5, r6)
            return
    }

    public static void glGetActiveAttrib(@org.lwjgl.system.NativeType("GLuint") int r7, @org.lwjgl.system.NativeType("GLuint") int r8, @javax.annotation.Nullable @org.lwjgl.system.NativeType("GLsizei *") java.nio.IntBuffer r9, @org.lwjgl.system.NativeType("GLint *") java.nio.IntBuffer r10, @org.lwjgl.system.NativeType("GLenum *") java.nio.IntBuffer r11, @org.lwjgl.system.NativeType("GLchar *") java.nio.ByteBuffer r12) {
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            r5 = r12
            org.lwjgl.opengl.GL20C.glGetActiveAttrib(r0, r1, r2, r3, r4, r5)
            return
    }

    @org.lwjgl.system.NativeType("void")
    public static java.lang.String glGetActiveAttrib(@org.lwjgl.system.NativeType("GLuint") int r6, @org.lwjgl.system.NativeType("GLuint") int r7, @org.lwjgl.system.NativeType("GLsizei") int r8, @org.lwjgl.system.NativeType("GLint *") java.nio.IntBuffer r9, @org.lwjgl.system.NativeType("GLenum *") java.nio.IntBuffer r10) {
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            java.lang.String r0 = org.lwjgl.opengl.GL20C.glGetActiveAttrib(r0, r1, r2, r3, r4)
            return r0
    }

    @org.lwjgl.system.NativeType("void")
    public static java.lang.String glGetActiveAttrib(@org.lwjgl.system.NativeType("GLuint") int r6, @org.lwjgl.system.NativeType("GLuint") int r7, @org.lwjgl.system.NativeType("GLint *") java.nio.IntBuffer r8, @org.lwjgl.system.NativeType("GLenum *") java.nio.IntBuffer r9) {
            r0 = r6
            r1 = r7
            r2 = r6
            r3 = 35722(0x8b8a, float:5.0057E-41)
            int r2 = glGetProgrami(r2, r3)
            r3 = r8
            r4 = r9
            java.lang.String r0 = glGetActiveAttrib(r0, r1, r2, r3, r4)
            return r0
    }

    public static int nglGetAttribLocation(int r4, long r5) {
            r0 = r4
            r1 = r5
            int r0 = org.lwjgl.opengl.GL20C.nglGetAttribLocation(r0, r1)
            return r0
    }

    @org.lwjgl.system.NativeType("GLint")
    public static int glGetAttribLocation(@org.lwjgl.system.NativeType("GLuint") int r3, @org.lwjgl.system.NativeType("GLchar const *") java.nio.ByteBuffer r4) {
            r0 = r3
            r1 = r4
            int r0 = org.lwjgl.opengl.GL20C.glGetAttribLocation(r0, r1)
            return r0
    }

    @org.lwjgl.system.NativeType("GLint")
    public static int glGetAttribLocation(@org.lwjgl.system.NativeType("GLuint") int r3, @org.lwjgl.system.NativeType("GLchar const *") java.lang.CharSequence r4) {
            r0 = r3
            r1 = r4
            int r0 = org.lwjgl.opengl.GL20C.glGetAttribLocation(r0, r1)
            return r0
    }

    public static void nglGetVertexAttribiv(int r5, int r6, long r7) {
            r0 = r5
            r1 = r6
            r2 = r7
            org.lwjgl.opengl.GL20C.nglGetVertexAttribiv(r0, r1, r2)
            return
    }

    public static void glGetVertexAttribiv(@org.lwjgl.system.NativeType("GLuint") int r4, @org.lwjgl.system.NativeType("GLenum") int r5, @org.lwjgl.system.NativeType("GLint *") java.nio.IntBuffer r6) {
            r0 = r4
            r1 = r5
            r2 = r6
            org.lwjgl.opengl.GL20C.glGetVertexAttribiv(r0, r1, r2)
            return
    }

    @org.lwjgl.system.NativeType("void")
    public static int glGetVertexAttribi(@org.lwjgl.system.NativeType("GLuint") int r3, @org.lwjgl.system.NativeType("GLenum") int r4) {
            r0 = r3
            r1 = r4
            int r0 = org.lwjgl.opengl.GL20C.glGetVertexAttribi(r0, r1)
            return r0
    }

    public static void nglGetVertexAttribfv(int r5, int r6, long r7) {
            r0 = r5
            r1 = r6
            r2 = r7
            org.lwjgl.opengl.GL20C.nglGetVertexAttribfv(r0, r1, r2)
            return
    }

    public static void glGetVertexAttribfv(@org.lwjgl.system.NativeType("GLuint") int r4, @org.lwjgl.system.NativeType("GLenum") int r5, @org.lwjgl.system.NativeType("GLfloat *") java.nio.FloatBuffer r6) {
            r0 = r4
            r1 = r5
            r2 = r6
            org.lwjgl.opengl.GL20C.glGetVertexAttribfv(r0, r1, r2)
            return
    }

    public static void nglGetVertexAttribdv(int r5, int r6, long r7) {
            r0 = r5
            r1 = r6
            r2 = r7
            org.lwjgl.opengl.GL20C.nglGetVertexAttribdv(r0, r1, r2)
            return
    }

    public static void glGetVertexAttribdv(@org.lwjgl.system.NativeType("GLuint") int r4, @org.lwjgl.system.NativeType("GLenum") int r5, @org.lwjgl.system.NativeType("GLdouble *") java.nio.DoubleBuffer r6) {
            r0 = r4
            r1 = r5
            r2 = r6
            org.lwjgl.opengl.GL20C.glGetVertexAttribdv(r0, r1, r2)
            return
    }

    public static void nglGetVertexAttribPointerv(int r5, int r6, long r7) {
            r0 = r5
            r1 = r6
            r2 = r7
            org.lwjgl.opengl.GL20C.nglGetVertexAttribPointerv(r0, r1, r2)
            return
    }

    public static void glGetVertexAttribPointerv(@org.lwjgl.system.NativeType("GLuint") int r4, @org.lwjgl.system.NativeType("GLenum") int r5, @org.lwjgl.system.NativeType("void **") org.lwjgl.PointerBuffer r6) {
            r0 = r4
            r1 = r5
            r2 = r6
            org.lwjgl.opengl.GL20C.glGetVertexAttribPointerv(r0, r1, r2)
            return
    }

    @org.lwjgl.system.NativeType("void")
    public static long glGetVertexAttribPointer(@org.lwjgl.system.NativeType("GLuint") int r3, @org.lwjgl.system.NativeType("GLenum") int r4) {
            r0 = r3
            r1 = r4
            long r0 = org.lwjgl.opengl.GL20C.glGetVertexAttribPointer(r0, r1)
            return r0
    }

    public static void nglDrawBuffers(int r4, long r5) {
            r0 = r4
            r1 = r5
            org.lwjgl.opengl.GL20C.nglDrawBuffers(r0, r1)
            return
    }

    public static void glDrawBuffers(@org.lwjgl.system.NativeType("GLenum const *") java.nio.IntBuffer r2) {
            r0 = r2
            org.lwjgl.opengl.GL20C.glDrawBuffers(r0)
            return
    }

    public static void glDrawBuffers(@org.lwjgl.system.NativeType("GLenum const *") int r2) {
            r0 = r2
            org.lwjgl.opengl.GL20C.glDrawBuffers(r0)
            return
    }

    public static void glBlendEquationSeparate(@org.lwjgl.system.NativeType("GLenum") int r3, @org.lwjgl.system.NativeType("GLenum") int r4) {
            r0 = r3
            r1 = r4
            org.lwjgl.opengl.GL20C.glBlendEquationSeparate(r0, r1)
            return
    }

    public static void glStencilOpSeparate(@org.lwjgl.system.NativeType("GLenum") int r5, @org.lwjgl.system.NativeType("GLenum") int r6, @org.lwjgl.system.NativeType("GLenum") int r7, @org.lwjgl.system.NativeType("GLenum") int r8) {
            r0 = r5
            r1 = r6
            r2 = r7
            r3 = r8
            org.lwjgl.opengl.GL20C.glStencilOpSeparate(r0, r1, r2, r3)
            return
    }

    public static void glStencilFuncSeparate(@org.lwjgl.system.NativeType("GLenum") int r5, @org.lwjgl.system.NativeType("GLenum") int r6, @org.lwjgl.system.NativeType("GLint") int r7, @org.lwjgl.system.NativeType("GLuint") int r8) {
            r0 = r5
            r1 = r6
            r2 = r7
            r3 = r8
            org.lwjgl.opengl.GL20C.glStencilFuncSeparate(r0, r1, r2, r3)
            return
    }

    public static void glStencilMaskSeparate(@org.lwjgl.system.NativeType("GLenum") int r3, @org.lwjgl.system.NativeType("GLuint") int r4) {
            r0 = r3
            r1 = r4
            org.lwjgl.opengl.GL20C.glStencilMaskSeparate(r0, r1)
            return
    }

    public static void glShaderSource(@org.lwjgl.system.NativeType("GLuint") int r4, @org.lwjgl.system.NativeType("GLchar const * const *") org.lwjgl.PointerBuffer r5, @javax.annotation.Nullable @org.lwjgl.system.NativeType("GLint const *") int[] r6) {
            r0 = r4
            r1 = r5
            r2 = r6
            org.lwjgl.opengl.GL20C.glShaderSource(r0, r1, r2)
            return
    }

    public static void glUniform1fv(@org.lwjgl.system.NativeType("GLint") int r3, @org.lwjgl.system.NativeType("GLfloat const *") float[] r4) {
            r0 = r3
            r1 = r4
            org.lwjgl.opengl.GL20C.glUniform1fv(r0, r1)
            return
    }

    public static void glUniform2fv(@org.lwjgl.system.NativeType("GLint") int r3, @org.lwjgl.system.NativeType("GLfloat const *") float[] r4) {
            r0 = r3
            r1 = r4
            org.lwjgl.opengl.GL20C.glUniform2fv(r0, r1)
            return
    }

    public static void glUniform3fv(@org.lwjgl.system.NativeType("GLint") int r3, @org.lwjgl.system.NativeType("GLfloat const *") float[] r4) {
            r0 = r3
            r1 = r4
            org.lwjgl.opengl.GL20C.glUniform3fv(r0, r1)
            return
    }

    public static void glUniform4fv(@org.lwjgl.system.NativeType("GLint") int r3, @org.lwjgl.system.NativeType("GLfloat const *") float[] r4) {
            r0 = r3
            r1 = r4
            org.lwjgl.opengl.GL20C.glUniform4fv(r0, r1)
            return
    }

    public static void glUniform1iv(@org.lwjgl.system.NativeType("GLint") int r3, @org.lwjgl.system.NativeType("GLint const *") int[] r4) {
            r0 = r3
            r1 = r4
            org.lwjgl.opengl.GL20C.glUniform1iv(r0, r1)
            return
    }

    public static void glUniform2iv(@org.lwjgl.system.NativeType("GLint") int r3, @org.lwjgl.system.NativeType("GLint const *") int[] r4) {
            r0 = r3
            r1 = r4
            org.lwjgl.opengl.GL20C.glUniform2iv(r0, r1)
            return
    }

    public static void glUniform3iv(@org.lwjgl.system.NativeType("GLint") int r3, @org.lwjgl.system.NativeType("GLint const *") int[] r4) {
            r0 = r3
            r1 = r4
            org.lwjgl.opengl.GL20C.glUniform3iv(r0, r1)
            return
    }

    public static void glUniform4iv(@org.lwjgl.system.NativeType("GLint") int r3, @org.lwjgl.system.NativeType("GLint const *") int[] r4) {
            r0 = r3
            r1 = r4
            org.lwjgl.opengl.GL20C.glUniform4iv(r0, r1)
            return
    }

    public static void glUniformMatrix2fv(@org.lwjgl.system.NativeType("GLint") int r4, @org.lwjgl.system.NativeType("GLboolean") boolean r5, @org.lwjgl.system.NativeType("GLfloat const *") float[] r6) {
            r0 = r4
            r1 = r5
            r2 = r6
            org.lwjgl.opengl.GL20C.glUniformMatrix2fv(r0, r1, r2)
            return
    }

    public static void glUniformMatrix3fv(@org.lwjgl.system.NativeType("GLint") int r4, @org.lwjgl.system.NativeType("GLboolean") boolean r5, @org.lwjgl.system.NativeType("GLfloat const *") float[] r6) {
            r0 = r4
            r1 = r5
            r2 = r6
            org.lwjgl.opengl.GL20C.glUniformMatrix3fv(r0, r1, r2)
            return
    }

    public static void glUniformMatrix4fv(@org.lwjgl.system.NativeType("GLint") int r4, @org.lwjgl.system.NativeType("GLboolean") boolean r5, @org.lwjgl.system.NativeType("GLfloat const *") float[] r6) {
            r0 = r4
            r1 = r5
            r2 = r6
            org.lwjgl.opengl.GL20C.glUniformMatrix4fv(r0, r1, r2)
            return
    }

    public static void glGetShaderiv(@org.lwjgl.system.NativeType("GLuint") int r4, @org.lwjgl.system.NativeType("GLenum") int r5, @org.lwjgl.system.NativeType("GLint *") int[] r6) {
            r0 = r4
            r1 = r5
            r2 = r6
            org.lwjgl.opengl.GL20C.glGetShaderiv(r0, r1, r2)
            return
    }

    public static void glGetProgramiv(@org.lwjgl.system.NativeType("GLuint") int r4, @org.lwjgl.system.NativeType("GLenum") int r5, @org.lwjgl.system.NativeType("GLint *") int[] r6) {
            r0 = r4
            r1 = r5
            r2 = r6
            org.lwjgl.opengl.GL20C.glGetProgramiv(r0, r1, r2)
            return
    }

    public static void glGetShaderInfoLog(@org.lwjgl.system.NativeType("GLuint") int r4, @javax.annotation.Nullable @org.lwjgl.system.NativeType("GLsizei *") int[] r5, @org.lwjgl.system.NativeType("GLchar *") java.nio.ByteBuffer r6) {
            r0 = r4
            r1 = r5
            r2 = r6
            org.lwjgl.opengl.GL20C.glGetShaderInfoLog(r0, r1, r2)
            return
    }

    public static void glGetProgramInfoLog(@org.lwjgl.system.NativeType("GLuint") int r4, @javax.annotation.Nullable @org.lwjgl.system.NativeType("GLsizei *") int[] r5, @org.lwjgl.system.NativeType("GLchar *") java.nio.ByteBuffer r6) {
            r0 = r4
            r1 = r5
            r2 = r6
            org.lwjgl.opengl.GL20C.glGetProgramInfoLog(r0, r1, r2)
            return
    }

    public static void glGetAttachedShaders(@org.lwjgl.system.NativeType("GLuint") int r4, @javax.annotation.Nullable @org.lwjgl.system.NativeType("GLsizei *") int[] r5, @org.lwjgl.system.NativeType("GLuint *") int[] r6) {
            r0 = r4
            r1 = r5
            r2 = r6
            org.lwjgl.opengl.GL20C.glGetAttachedShaders(r0, r1, r2)
            return
    }

    public static void glGetActiveUniform(@org.lwjgl.system.NativeType("GLuint") int r7, @org.lwjgl.system.NativeType("GLuint") int r8, @javax.annotation.Nullable @org.lwjgl.system.NativeType("GLsizei *") int[] r9, @org.lwjgl.system.NativeType("GLint *") int[] r10, @org.lwjgl.system.NativeType("GLenum *") int[] r11, @org.lwjgl.system.NativeType("GLchar *") java.nio.ByteBuffer r12) {
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            r5 = r12
            org.lwjgl.opengl.GL20C.glGetActiveUniform(r0, r1, r2, r3, r4, r5)
            return
    }

    public static void glGetUniformfv(@org.lwjgl.system.NativeType("GLuint") int r4, @org.lwjgl.system.NativeType("GLint") int r5, @org.lwjgl.system.NativeType("GLfloat *") float[] r6) {
            r0 = r4
            r1 = r5
            r2 = r6
            org.lwjgl.opengl.GL20C.glGetUniformfv(r0, r1, r2)
            return
    }

    public static void glGetUniformiv(@org.lwjgl.system.NativeType("GLuint") int r4, @org.lwjgl.system.NativeType("GLint") int r5, @org.lwjgl.system.NativeType("GLint *") int[] r6) {
            r0 = r4
            r1 = r5
            r2 = r6
            org.lwjgl.opengl.GL20C.glGetUniformiv(r0, r1, r2)
            return
    }

    public static void glGetShaderSource(@org.lwjgl.system.NativeType("GLuint") int r4, @javax.annotation.Nullable @org.lwjgl.system.NativeType("GLsizei *") int[] r5, @org.lwjgl.system.NativeType("GLchar *") java.nio.ByteBuffer r6) {
            r0 = r4
            r1 = r5
            r2 = r6
            org.lwjgl.opengl.GL20C.glGetShaderSource(r0, r1, r2)
            return
    }

    public static void glVertexAttrib1fv(@org.lwjgl.system.NativeType("GLuint") int r3, @org.lwjgl.system.NativeType("GLfloat const *") float[] r4) {
            r0 = r3
            r1 = r4
            org.lwjgl.opengl.GL20C.glVertexAttrib1fv(r0, r1)
            return
    }

    public static void glVertexAttrib1sv(@org.lwjgl.system.NativeType("GLuint") int r3, @org.lwjgl.system.NativeType("GLshort const *") short[] r4) {
            r0 = r3
            r1 = r4
            org.lwjgl.opengl.GL20C.glVertexAttrib1sv(r0, r1)
            return
    }

    public static void glVertexAttrib1dv(@org.lwjgl.system.NativeType("GLuint") int r3, @org.lwjgl.system.NativeType("GLdouble const *") double[] r4) {
            r0 = r3
            r1 = r4
            org.lwjgl.opengl.GL20C.glVertexAttrib1dv(r0, r1)
            return
    }

    public static void glVertexAttrib2fv(@org.lwjgl.system.NativeType("GLuint") int r3, @org.lwjgl.system.NativeType("GLfloat const *") float[] r4) {
            r0 = r3
            r1 = r4
            org.lwjgl.opengl.GL20C.glVertexAttrib2fv(r0, r1)
            return
    }

    public static void glVertexAttrib2sv(@org.lwjgl.system.NativeType("GLuint") int r3, @org.lwjgl.system.NativeType("GLshort const *") short[] r4) {
            r0 = r3
            r1 = r4
            org.lwjgl.opengl.GL20C.glVertexAttrib2sv(r0, r1)
            return
    }

    public static void glVertexAttrib2dv(@org.lwjgl.system.NativeType("GLuint") int r3, @org.lwjgl.system.NativeType("GLdouble const *") double[] r4) {
            r0 = r3
            r1 = r4
            org.lwjgl.opengl.GL20C.glVertexAttrib2dv(r0, r1)
            return
    }

    public static void glVertexAttrib3fv(@org.lwjgl.system.NativeType("GLuint") int r3, @org.lwjgl.system.NativeType("GLfloat const *") float[] r4) {
            r0 = r3
            r1 = r4
            org.lwjgl.opengl.GL20C.glVertexAttrib3fv(r0, r1)
            return
    }

    public static void glVertexAttrib3sv(@org.lwjgl.system.NativeType("GLuint") int r3, @org.lwjgl.system.NativeType("GLshort const *") short[] r4) {
            r0 = r3
            r1 = r4
            org.lwjgl.opengl.GL20C.glVertexAttrib3sv(r0, r1)
            return
    }

    public static void glVertexAttrib3dv(@org.lwjgl.system.NativeType("GLuint") int r3, @org.lwjgl.system.NativeType("GLdouble const *") double[] r4) {
            r0 = r3
            r1 = r4
            org.lwjgl.opengl.GL20C.glVertexAttrib3dv(r0, r1)
            return
    }

    public static void glVertexAttrib4fv(@org.lwjgl.system.NativeType("GLuint") int r3, @org.lwjgl.system.NativeType("GLfloat const *") float[] r4) {
            r0 = r3
            r1 = r4
            org.lwjgl.opengl.GL20C.glVertexAttrib4fv(r0, r1)
            return
    }

    public static void glVertexAttrib4sv(@org.lwjgl.system.NativeType("GLuint") int r3, @org.lwjgl.system.NativeType("GLshort const *") short[] r4) {
            r0 = r3
            r1 = r4
            org.lwjgl.opengl.GL20C.glVertexAttrib4sv(r0, r1)
            return
    }

    public static void glVertexAttrib4dv(@org.lwjgl.system.NativeType("GLuint") int r3, @org.lwjgl.system.NativeType("GLdouble const *") double[] r4) {
            r0 = r3
            r1 = r4
            org.lwjgl.opengl.GL20C.glVertexAttrib4dv(r0, r1)
            return
    }

    public static void glVertexAttrib4iv(@org.lwjgl.system.NativeType("GLuint") int r3, @org.lwjgl.system.NativeType("GLint const *") int[] r4) {
            r0 = r3
            r1 = r4
            org.lwjgl.opengl.GL20C.glVertexAttrib4iv(r0, r1)
            return
    }

    public static void glVertexAttrib4usv(@org.lwjgl.system.NativeType("GLuint") int r3, @org.lwjgl.system.NativeType("GLushort const *") short[] r4) {
            r0 = r3
            r1 = r4
            org.lwjgl.opengl.GL20C.glVertexAttrib4usv(r0, r1)
            return
    }

    public static void glVertexAttrib4uiv(@org.lwjgl.system.NativeType("GLuint") int r3, @org.lwjgl.system.NativeType("GLuint const *") int[] r4) {
            r0 = r3
            r1 = r4
            org.lwjgl.opengl.GL20C.glVertexAttrib4uiv(r0, r1)
            return
    }

    public static void glVertexAttrib4Nsv(@org.lwjgl.system.NativeType("GLuint") int r3, @org.lwjgl.system.NativeType("GLshort const *") short[] r4) {
            r0 = r3
            r1 = r4
            org.lwjgl.opengl.GL20C.glVertexAttrib4Nsv(r0, r1)
            return
    }

    public static void glVertexAttrib4Niv(@org.lwjgl.system.NativeType("GLuint") int r3, @org.lwjgl.system.NativeType("GLint const *") int[] r4) {
            r0 = r3
            r1 = r4
            org.lwjgl.opengl.GL20C.glVertexAttrib4Niv(r0, r1)
            return
    }

    public static void glVertexAttrib4Nusv(@org.lwjgl.system.NativeType("GLuint") int r3, @org.lwjgl.system.NativeType("GLushort const *") short[] r4) {
            r0 = r3
            r1 = r4
            org.lwjgl.opengl.GL20C.glVertexAttrib4Nusv(r0, r1)
            return
    }

    public static void glVertexAttrib4Nuiv(@org.lwjgl.system.NativeType("GLuint") int r3, @org.lwjgl.system.NativeType("GLuint const *") int[] r4) {
            r0 = r3
            r1 = r4
            org.lwjgl.opengl.GL20C.glVertexAttrib4Nuiv(r0, r1)
            return
    }

    public static void glGetActiveAttrib(@org.lwjgl.system.NativeType("GLuint") int r7, @org.lwjgl.system.NativeType("GLuint") int r8, @javax.annotation.Nullable @org.lwjgl.system.NativeType("GLsizei *") int[] r9, @org.lwjgl.system.NativeType("GLint *") int[] r10, @org.lwjgl.system.NativeType("GLenum *") int[] r11, @org.lwjgl.system.NativeType("GLchar *") java.nio.ByteBuffer r12) {
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            r5 = r12
            org.lwjgl.opengl.GL20C.glGetActiveAttrib(r0, r1, r2, r3, r4, r5)
            return
    }

    public static void glGetVertexAttribiv(@org.lwjgl.system.NativeType("GLuint") int r4, @org.lwjgl.system.NativeType("GLenum") int r5, @org.lwjgl.system.NativeType("GLint *") int[] r6) {
            r0 = r4
            r1 = r5
            r2 = r6
            org.lwjgl.opengl.GL20C.glGetVertexAttribiv(r0, r1, r2)
            return
    }

    public static void glGetVertexAttribfv(@org.lwjgl.system.NativeType("GLuint") int r4, @org.lwjgl.system.NativeType("GLenum") int r5, @org.lwjgl.system.NativeType("GLfloat *") float[] r6) {
            r0 = r4
            r1 = r5
            r2 = r6
            org.lwjgl.opengl.GL20C.glGetVertexAttribfv(r0, r1, r2)
            return
    }

    public static void glGetVertexAttribdv(@org.lwjgl.system.NativeType("GLuint") int r4, @org.lwjgl.system.NativeType("GLenum") int r5, @org.lwjgl.system.NativeType("GLdouble *") double[] r6) {
            r0 = r4
            r1 = r5
            r2 = r6
            org.lwjgl.opengl.GL20C.glGetVertexAttribdv(r0, r1, r2)
            return
    }

    public static void glDrawBuffers(@org.lwjgl.system.NativeType("GLenum const *") int[] r2) {
            r0 = r2
            org.lwjgl.opengl.GL20C.glDrawBuffers(r0)
            return
    }

    static {
            org.lwjgl.opengl.GL.initialize()
            return
    }
}
