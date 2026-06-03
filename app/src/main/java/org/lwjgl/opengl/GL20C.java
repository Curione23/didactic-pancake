package org.lwjgl.opengl;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/opengl/GL20C.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/opengl/GL20C.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/opengl/GL20C.class */
public class GL20C extends org.lwjgl.opengl.GL15C {
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
    public static final int GL_VERTEX_PROGRAM_POINT_SIZE = 34370;
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

    protected GL20C() {
            r3 = this;
            r0 = r3
            r0.<init>()
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r1 = r0
            r1.<init>()
            throw r0
    }

    @org.lwjgl.system.NativeType("GLuint")
    public static native int glCreateProgram();

    public static native void glDeleteProgram(@org.lwjgl.system.NativeType("GLuint") int r0);

    @org.lwjgl.system.NativeType("GLboolean")
    public static native boolean glIsProgram(@org.lwjgl.system.NativeType("GLuint") int r0);

    @org.lwjgl.system.NativeType("GLuint")
    public static native int glCreateShader(@org.lwjgl.system.NativeType("GLenum") int r0);

    public static native void glDeleteShader(@org.lwjgl.system.NativeType("GLuint") int r0);

    @org.lwjgl.system.NativeType("GLboolean")
    public static native boolean glIsShader(@org.lwjgl.system.NativeType("GLuint") int r0);

    public static native void glAttachShader(@org.lwjgl.system.NativeType("GLuint") int r0, @org.lwjgl.system.NativeType("GLuint") int r1);

    public static native void glDetachShader(@org.lwjgl.system.NativeType("GLuint") int r0, @org.lwjgl.system.NativeType("GLuint") int r1);

    public static native void nglShaderSource(int r0, int r1, long r2, long r4);

    public static void glShaderSource(@org.lwjgl.system.NativeType("GLuint") int r7, @org.lwjgl.system.NativeType("GLchar const * const *") org.lwjgl.PointerBuffer r8, @javax.annotation.Nullable @org.lwjgl.system.NativeType("GLint const *") java.nio.IntBuffer r9) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Le
            r0 = r9
            r1 = r8
            int r1 = r1.remaining()
            org.lwjgl.system.Checks.checkSafe(r0, r1)
        Le:
            r0 = r7
            r1 = r8
            int r1 = r1.remaining()
            r2 = r8
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            r3 = r9
            long r3 = org.lwjgl.system.MemoryUtil.memAddressSafe(r3)
            nglShaderSource(r0, r1, r2, r3)
            return
    }

    public static void glShaderSource(@org.lwjgl.system.NativeType("GLuint") int r9, @org.lwjgl.system.NativeType("GLchar const * const *") java.lang.CharSequence... r10) {
            org.lwjgl.system.MemoryStack r0 = org.lwjgl.system.MemoryStack.stackGet()
            r11 = r0
            r0 = r11
            int r0 = r0.getPointer()
            r12 = r0
            r0 = r11
            void r1 = org.lwjgl.system.MemoryUtil::memUTF8     // Catch: java.lang.Throwable -> L34
            r2 = r10
            long r0 = org.lwjgl.system.APIUtil.apiArrayi(r0, r1, r2)     // Catch: java.lang.Throwable -> L34
            r13 = r0
            r0 = r9
            r1 = r10
            int r1 = r1.length     // Catch: java.lang.Throwable -> L34
            r2 = r13
            r3 = r13
            r4 = r10
            int r4 = r4.length     // Catch: java.lang.Throwable -> L34
            r5 = 2
            int r4 = r4 << r5
            long r4 = (long) r4     // Catch: java.lang.Throwable -> L34
            long r3 = r3 - r4
            nglShaderSource(r0, r1, r2, r3)     // Catch: java.lang.Throwable -> L34
            r0 = r13
            r1 = r10
            int r1 = r1.length     // Catch: java.lang.Throwable -> L34
            org.lwjgl.system.APIUtil.apiArrayFree(r0, r1)     // Catch: java.lang.Throwable -> L34
            r0 = r11
            r1 = r12
            r0.setPointer(r1)
            goto L3e
        L34:
            r15 = move-exception
            r0 = r11
            r1 = r12
            r0.setPointer(r1)
            r0 = r15
            throw r0
        L3e:
            return
    }

    public static void glShaderSource(@org.lwjgl.system.NativeType("GLuint") int r9, @org.lwjgl.system.NativeType("GLchar const * const *") java.lang.CharSequence r10) {
            org.lwjgl.system.MemoryStack r0 = org.lwjgl.system.MemoryStack.stackGet()
            r11 = r0
            r0 = r11
            int r0 = r0.getPointer()
            r12 = r0
            r0 = r11
            void r1 = org.lwjgl.system.MemoryUtil::memUTF8     // Catch: java.lang.Throwable -> L37
            r2 = 1
            java.lang.CharSequence[] r2 = new java.lang.CharSequence[r2]     // Catch: java.lang.Throwable -> L37
            r3 = r2
            r4 = 0
            r5 = r10
            r3[r4] = r5     // Catch: java.lang.Throwable -> L37
            long r0 = org.lwjgl.system.APIUtil.apiArrayi(r0, r1, r2)     // Catch: java.lang.Throwable -> L37
            r13 = r0
            r0 = r9
            r1 = 1
            r2 = r13
            r3 = r13
            r4 = 4
            long r3 = r3 - r4
            nglShaderSource(r0, r1, r2, r3)     // Catch: java.lang.Throwable -> L37
            r0 = r13
            r1 = 1
            org.lwjgl.system.APIUtil.apiArrayFree(r0, r1)     // Catch: java.lang.Throwable -> L37
            r0 = r11
            r1 = r12
            r0.setPointer(r1)
            goto L41
        L37:
            r15 = move-exception
            r0 = r11
            r1 = r12
            r0.setPointer(r1)
            r0 = r15
            throw r0
        L41:
            return
    }

    public static native void glCompileShader(@org.lwjgl.system.NativeType("GLuint") int r0);

    public static native void glLinkProgram(@org.lwjgl.system.NativeType("GLuint") int r0);

    public static native void glUseProgram(@org.lwjgl.system.NativeType("GLuint") int r0);

    public static native void glValidateProgram(@org.lwjgl.system.NativeType("GLuint") int r0);

    public static native void glUniform1f(@org.lwjgl.system.NativeType("GLint") int r0, @org.lwjgl.system.NativeType("GLfloat") float r1);

    public static native void glUniform2f(@org.lwjgl.system.NativeType("GLint") int r0, @org.lwjgl.system.NativeType("GLfloat") float r1, @org.lwjgl.system.NativeType("GLfloat") float r2);

    public static native void glUniform3f(@org.lwjgl.system.NativeType("GLint") int r0, @org.lwjgl.system.NativeType("GLfloat") float r1, @org.lwjgl.system.NativeType("GLfloat") float r2, @org.lwjgl.system.NativeType("GLfloat") float r3);

    public static native void glUniform4f(@org.lwjgl.system.NativeType("GLint") int r0, @org.lwjgl.system.NativeType("GLfloat") float r1, @org.lwjgl.system.NativeType("GLfloat") float r2, @org.lwjgl.system.NativeType("GLfloat") float r3, @org.lwjgl.system.NativeType("GLfloat") float r4);

    public static native void glUniform1i(@org.lwjgl.system.NativeType("GLint") int r0, @org.lwjgl.system.NativeType("GLint") int r1);

    public static native void glUniform2i(@org.lwjgl.system.NativeType("GLint") int r0, @org.lwjgl.system.NativeType("GLint") int r1, @org.lwjgl.system.NativeType("GLint") int r2);

    public static native void glUniform3i(@org.lwjgl.system.NativeType("GLint") int r0, @org.lwjgl.system.NativeType("GLint") int r1, @org.lwjgl.system.NativeType("GLint") int r2, @org.lwjgl.system.NativeType("GLint") int r3);

    public static native void glUniform4i(@org.lwjgl.system.NativeType("GLint") int r0, @org.lwjgl.system.NativeType("GLint") int r1, @org.lwjgl.system.NativeType("GLint") int r2, @org.lwjgl.system.NativeType("GLint") int r3, @org.lwjgl.system.NativeType("GLint") int r4);

    public static native void nglUniform1fv(int r0, int r1, long r2);

    public static void glUniform1fv(@org.lwjgl.system.NativeType("GLint") int r5, @org.lwjgl.system.NativeType("GLfloat const *") java.nio.FloatBuffer r6) {
            r0 = r5
            r1 = r6
            int r1 = r1.remaining()
            r2 = r6
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            nglUniform1fv(r0, r1, r2)
            return
    }

    public static native void nglUniform2fv(int r0, int r1, long r2);

    public static void glUniform2fv(@org.lwjgl.system.NativeType("GLint") int r5, @org.lwjgl.system.NativeType("GLfloat const *") java.nio.FloatBuffer r6) {
            r0 = r5
            r1 = r6
            int r1 = r1.remaining()
            r2 = 1
            int r1 = r1 >> r2
            r2 = r6
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            nglUniform2fv(r0, r1, r2)
            return
    }

    public static native void nglUniform3fv(int r0, int r1, long r2);

    public static void glUniform3fv(@org.lwjgl.system.NativeType("GLint") int r5, @org.lwjgl.system.NativeType("GLfloat const *") java.nio.FloatBuffer r6) {
            r0 = r5
            r1 = r6
            int r1 = r1.remaining()
            r2 = 3
            int r1 = r1 / r2
            r2 = r6
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            nglUniform3fv(r0, r1, r2)
            return
    }

    public static native void nglUniform4fv(int r0, int r1, long r2);

    public static void glUniform4fv(@org.lwjgl.system.NativeType("GLint") int r5, @org.lwjgl.system.NativeType("GLfloat const *") java.nio.FloatBuffer r6) {
            r0 = r5
            r1 = r6
            int r1 = r1.remaining()
            r2 = 2
            int r1 = r1 >> r2
            r2 = r6
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            nglUniform4fv(r0, r1, r2)
            return
    }

    public static native void nglUniform1iv(int r0, int r1, long r2);

    public static void glUniform1iv(@org.lwjgl.system.NativeType("GLint") int r5, @org.lwjgl.system.NativeType("GLint const *") java.nio.IntBuffer r6) {
            r0 = r5
            r1 = r6
            int r1 = r1.remaining()
            r2 = r6
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            nglUniform1iv(r0, r1, r2)
            return
    }

    public static native void nglUniform2iv(int r0, int r1, long r2);

    public static void glUniform2iv(@org.lwjgl.system.NativeType("GLint") int r5, @org.lwjgl.system.NativeType("GLint const *") java.nio.IntBuffer r6) {
            r0 = r5
            r1 = r6
            int r1 = r1.remaining()
            r2 = 1
            int r1 = r1 >> r2
            r2 = r6
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            nglUniform2iv(r0, r1, r2)
            return
    }

    public static native void nglUniform3iv(int r0, int r1, long r2);

    public static void glUniform3iv(@org.lwjgl.system.NativeType("GLint") int r5, @org.lwjgl.system.NativeType("GLint const *") java.nio.IntBuffer r6) {
            r0 = r5
            r1 = r6
            int r1 = r1.remaining()
            r2 = 3
            int r1 = r1 / r2
            r2 = r6
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            nglUniform3iv(r0, r1, r2)
            return
    }

    public static native void nglUniform4iv(int r0, int r1, long r2);

    public static void glUniform4iv(@org.lwjgl.system.NativeType("GLint") int r5, @org.lwjgl.system.NativeType("GLint const *") java.nio.IntBuffer r6) {
            r0 = r5
            r1 = r6
            int r1 = r1.remaining()
            r2 = 2
            int r1 = r1 >> r2
            r2 = r6
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            nglUniform4iv(r0, r1, r2)
            return
    }

    public static native void nglUniformMatrix2fv(int r0, int r1, boolean r2, long r3);

    public static void glUniformMatrix2fv(@org.lwjgl.system.NativeType("GLint") int r6, @org.lwjgl.system.NativeType("GLboolean") boolean r7, @org.lwjgl.system.NativeType("GLfloat const *") java.nio.FloatBuffer r8) {
            r0 = r6
            r1 = r8
            int r1 = r1.remaining()
            r2 = 2
            int r1 = r1 >> r2
            r2 = r7
            r3 = r8
            long r3 = org.lwjgl.system.MemoryUtil.memAddress(r3)
            nglUniformMatrix2fv(r0, r1, r2, r3)
            return
    }

    public static native void nglUniformMatrix3fv(int r0, int r1, boolean r2, long r3);

    public static void glUniformMatrix3fv(@org.lwjgl.system.NativeType("GLint") int r6, @org.lwjgl.system.NativeType("GLboolean") boolean r7, @org.lwjgl.system.NativeType("GLfloat const *") java.nio.FloatBuffer r8) {
            r0 = r6
            r1 = r8
            int r1 = r1.remaining()
            r2 = 9
            int r1 = r1 / r2
            r2 = r7
            r3 = r8
            long r3 = org.lwjgl.system.MemoryUtil.memAddress(r3)
            nglUniformMatrix3fv(r0, r1, r2, r3)
            return
    }

    public static native void nglUniformMatrix4fv(int r0, int r1, boolean r2, long r3);

    public static void glUniformMatrix4fv(@org.lwjgl.system.NativeType("GLint") int r6, @org.lwjgl.system.NativeType("GLboolean") boolean r7, @org.lwjgl.system.NativeType("GLfloat const *") java.nio.FloatBuffer r8) {
            r0 = r6
            r1 = r8
            int r1 = r1.remaining()
            r2 = 4
            int r1 = r1 >> r2
            r2 = r7
            r3 = r8
            long r3 = org.lwjgl.system.MemoryUtil.memAddress(r3)
            nglUniformMatrix4fv(r0, r1, r2, r3)
            return
    }

    public static native void nglGetShaderiv(int r0, int r1, long r2);

    public static void glGetShaderiv(@org.lwjgl.system.NativeType("GLuint") int r5, @org.lwjgl.system.NativeType("GLenum") int r6, @org.lwjgl.system.NativeType("GLint *") java.nio.IntBuffer r7) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r7
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
        Lb:
            r0 = r5
            r1 = r6
            r2 = r7
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            nglGetShaderiv(r0, r1, r2)
            return
    }

    @org.lwjgl.system.NativeType("void")
    public static int glGetShaderi(@org.lwjgl.system.NativeType("GLuint") int r5, @org.lwjgl.system.NativeType("GLenum") int r6) {
            org.lwjgl.system.MemoryStack r0 = org.lwjgl.system.MemoryStack.stackGet()
            r7 = r0
            r0 = r7
            int r0 = r0.getPointer()
            r8 = r0
            r0 = r7
            r1 = 1
            java.nio.IntBuffer r0 = r0.callocInt(r1)     // Catch: java.lang.Throwable -> L2a
            r9 = r0
            r0 = r5
            r1 = r6
            r2 = r9
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)     // Catch: java.lang.Throwable -> L2a
            nglGetShaderiv(r0, r1, r2)     // Catch: java.lang.Throwable -> L2a
            r0 = r9
            r1 = 0
            int r0 = r0.get(r1)     // Catch: java.lang.Throwable -> L2a
            r10 = r0
            r0 = r7
            r1 = r8
            r0.setPointer(r1)
            r0 = r10
            return r0
        L2a:
            r11 = move-exception
            r0 = r7
            r1 = r8
            r0.setPointer(r1)
            r0 = r11
            throw r0
    }

    public static native void nglGetProgramiv(int r0, int r1, long r2);

    public static void glGetProgramiv(@org.lwjgl.system.NativeType("GLuint") int r5, @org.lwjgl.system.NativeType("GLenum") int r6, @org.lwjgl.system.NativeType("GLint *") java.nio.IntBuffer r7) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r7
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
        Lb:
            r0 = r5
            r1 = r6
            r2 = r7
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            nglGetProgramiv(r0, r1, r2)
            return
    }

    @org.lwjgl.system.NativeType("void")
    public static int glGetProgrami(@org.lwjgl.system.NativeType("GLuint") int r5, @org.lwjgl.system.NativeType("GLenum") int r6) {
            org.lwjgl.system.MemoryStack r0 = org.lwjgl.system.MemoryStack.stackGet()
            r7 = r0
            r0 = r7
            int r0 = r0.getPointer()
            r8 = r0
            r0 = r7
            r1 = 1
            java.nio.IntBuffer r0 = r0.callocInt(r1)     // Catch: java.lang.Throwable -> L2a
            r9 = r0
            r0 = r5
            r1 = r6
            r2 = r9
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)     // Catch: java.lang.Throwable -> L2a
            nglGetProgramiv(r0, r1, r2)     // Catch: java.lang.Throwable -> L2a
            r0 = r9
            r1 = 0
            int r0 = r0.get(r1)     // Catch: java.lang.Throwable -> L2a
            r10 = r0
            r0 = r7
            r1 = r8
            r0.setPointer(r1)
            r0 = r10
            return r0
        L2a:
            r11 = move-exception
            r0 = r7
            r1 = r8
            r0.setPointer(r1)
            r0 = r11
            throw r0
    }

    public static native void nglGetShaderInfoLog(int r0, int r1, long r2, long r4);

    public static void glGetShaderInfoLog(@org.lwjgl.system.NativeType("GLuint") int r7, @javax.annotation.Nullable @org.lwjgl.system.NativeType("GLsizei *") java.nio.IntBuffer r8, @org.lwjgl.system.NativeType("GLchar *") java.nio.ByteBuffer r9) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r8
            r1 = 1
            org.lwjgl.system.Checks.checkSafe(r0, r1)
        Lb:
            r0 = r7
            r1 = r9
            int r1 = r1.remaining()
            r2 = r8
            long r2 = org.lwjgl.system.MemoryUtil.memAddressSafe(r2)
            r3 = r9
            long r3 = org.lwjgl.system.MemoryUtil.memAddress(r3)
            nglGetShaderInfoLog(r0, r1, r2, r3)
            return
    }

    @org.lwjgl.system.NativeType("void")
    public static java.lang.String glGetShaderInfoLog(@org.lwjgl.system.NativeType("GLuint") int r7, @org.lwjgl.system.NativeType("GLsizei") int r8) {
            org.lwjgl.system.MemoryStack r0 = org.lwjgl.system.MemoryStack.stackGet()
            r9 = r0
            r0 = r9
            int r0 = r0.getPointer()
            r10 = r0
            r0 = r8
            java.nio.ByteBuffer r0 = org.lwjgl.system.MemoryUtil.memAlloc(r0)
            r11 = r0
            r0 = r9
            r1 = 0
            java.nio.IntBuffer r0 = r0.ints(r1)     // Catch: java.lang.Throwable -> L3f
            r12 = r0
            r0 = r7
            r1 = r8
            r2 = r12
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)     // Catch: java.lang.Throwable -> L3f
            r3 = r11
            long r3 = org.lwjgl.system.MemoryUtil.memAddress(r3)     // Catch: java.lang.Throwable -> L3f
            nglGetShaderInfoLog(r0, r1, r2, r3)     // Catch: java.lang.Throwable -> L3f
            r0 = r11
            r1 = r12
            r2 = 0
            int r1 = r1.get(r2)     // Catch: java.lang.Throwable -> L3f
            java.lang.String r0 = org.lwjgl.system.MemoryUtil.memUTF8(r0, r1)     // Catch: java.lang.Throwable -> L3f
            r13 = r0
            r0 = r11
            org.lwjgl.system.MemoryUtil.memFree(r0)
            r0 = r9
            r1 = r10
            r0.setPointer(r1)
            r0 = r13
            return r0
        L3f:
            r14 = move-exception
            r0 = r11
            org.lwjgl.system.MemoryUtil.memFree(r0)
            r0 = r9
            r1 = r10
            r0.setPointer(r1)
            r0 = r14
            throw r0
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

    public static native void nglGetProgramInfoLog(int r0, int r1, long r2, long r4);

    public static void glGetProgramInfoLog(@org.lwjgl.system.NativeType("GLuint") int r7, @javax.annotation.Nullable @org.lwjgl.system.NativeType("GLsizei *") java.nio.IntBuffer r8, @org.lwjgl.system.NativeType("GLchar *") java.nio.ByteBuffer r9) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r8
            r1 = 1
            org.lwjgl.system.Checks.checkSafe(r0, r1)
        Lb:
            r0 = r7
            r1 = r9
            int r1 = r1.remaining()
            r2 = r8
            long r2 = org.lwjgl.system.MemoryUtil.memAddressSafe(r2)
            r3 = r9
            long r3 = org.lwjgl.system.MemoryUtil.memAddress(r3)
            nglGetProgramInfoLog(r0, r1, r2, r3)
            return
    }

    @org.lwjgl.system.NativeType("void")
    public static java.lang.String glGetProgramInfoLog(@org.lwjgl.system.NativeType("GLuint") int r7, @org.lwjgl.system.NativeType("GLsizei") int r8) {
            org.lwjgl.system.MemoryStack r0 = org.lwjgl.system.MemoryStack.stackGet()
            r9 = r0
            r0 = r9
            int r0 = r0.getPointer()
            r10 = r0
            r0 = r8
            java.nio.ByteBuffer r0 = org.lwjgl.system.MemoryUtil.memAlloc(r0)
            r11 = r0
            r0 = r9
            r1 = 0
            java.nio.IntBuffer r0 = r0.ints(r1)     // Catch: java.lang.Throwable -> L3f
            r12 = r0
            r0 = r7
            r1 = r8
            r2 = r12
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)     // Catch: java.lang.Throwable -> L3f
            r3 = r11
            long r3 = org.lwjgl.system.MemoryUtil.memAddress(r3)     // Catch: java.lang.Throwable -> L3f
            nglGetProgramInfoLog(r0, r1, r2, r3)     // Catch: java.lang.Throwable -> L3f
            r0 = r11
            r1 = r12
            r2 = 0
            int r1 = r1.get(r2)     // Catch: java.lang.Throwable -> L3f
            java.lang.String r0 = org.lwjgl.system.MemoryUtil.memUTF8(r0, r1)     // Catch: java.lang.Throwable -> L3f
            r13 = r0
            r0 = r11
            org.lwjgl.system.MemoryUtil.memFree(r0)
            r0 = r9
            r1 = r10
            r0.setPointer(r1)
            r0 = r13
            return r0
        L3f:
            r14 = move-exception
            r0 = r11
            org.lwjgl.system.MemoryUtil.memFree(r0)
            r0 = r9
            r1 = r10
            r0.setPointer(r1)
            r0 = r14
            throw r0
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

    public static native void nglGetAttachedShaders(int r0, int r1, long r2, long r4);

    public static void glGetAttachedShaders(@org.lwjgl.system.NativeType("GLuint") int r7, @javax.annotation.Nullable @org.lwjgl.system.NativeType("GLsizei *") java.nio.IntBuffer r8, @org.lwjgl.system.NativeType("GLuint *") java.nio.IntBuffer r9) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r8
            r1 = 1
            org.lwjgl.system.Checks.checkSafe(r0, r1)
        Lb:
            r0 = r7
            r1 = r9
            int r1 = r1.remaining()
            r2 = r8
            long r2 = org.lwjgl.system.MemoryUtil.memAddressSafe(r2)
            r3 = r9
            long r3 = org.lwjgl.system.MemoryUtil.memAddress(r3)
            nglGetAttachedShaders(r0, r1, r2, r3)
            return
    }

    public static native int nglGetUniformLocation(int r0, long r1);

    @org.lwjgl.system.NativeType("GLint")
    public static int glGetUniformLocation(@org.lwjgl.system.NativeType("GLuint") int r4, @org.lwjgl.system.NativeType("GLchar const *") java.nio.ByteBuffer r5) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto La
            r0 = r5
            org.lwjgl.system.Checks.checkNT1(r0)
        La:
            r0 = r4
            r1 = r5
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            int r0 = nglGetUniformLocation(r0, r1)
            return r0
    }

    @org.lwjgl.system.NativeType("GLint")
    public static int glGetUniformLocation(@org.lwjgl.system.NativeType("GLuint") int r4, @org.lwjgl.system.NativeType("GLchar const *") java.lang.CharSequence r5) {
            org.lwjgl.system.MemoryStack r0 = org.lwjgl.system.MemoryStack.stackGet()
            r6 = r0
            r0 = r6
            int r0 = r0.getPointer()
            r7 = r0
            r0 = r6
            r1 = r5
            r2 = 1
            int r0 = r0.nASCII(r1, r2)     // Catch: java.lang.Throwable -> L26
            r0 = r6
            long r0 = r0.getPointerAddress()     // Catch: java.lang.Throwable -> L26
            r8 = r0
            r0 = r4
            r1 = r8
            int r0 = nglGetUniformLocation(r0, r1)     // Catch: java.lang.Throwable -> L26
            r10 = r0
            r0 = r6
            r1 = r7
            r0.setPointer(r1)
            r0 = r10
            return r0
        L26:
            r11 = move-exception
            r0 = r6
            r1 = r7
            r0.setPointer(r1)
            r0 = r11
            throw r0
    }

    public static native void nglGetActiveUniform(int r0, int r1, int r2, long r3, long r5, long r7, long r9);

    public static void glGetActiveUniform(@org.lwjgl.system.NativeType("GLuint") int r12, @org.lwjgl.system.NativeType("GLuint") int r13, @javax.annotation.Nullable @org.lwjgl.system.NativeType("GLsizei *") java.nio.IntBuffer r14, @org.lwjgl.system.NativeType("GLint *") java.nio.IntBuffer r15, @org.lwjgl.system.NativeType("GLenum *") java.nio.IntBuffer r16, @org.lwjgl.system.NativeType("GLchar *") java.nio.ByteBuffer r17) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L16
            r0 = r14
            r1 = 1
            org.lwjgl.system.Checks.checkSafe(r0, r1)
            r0 = r15
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
            r0 = r16
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
        L16:
            r0 = r12
            r1 = r13
            r2 = r17
            int r2 = r2.remaining()
            r3 = r14
            long r3 = org.lwjgl.system.MemoryUtil.memAddressSafe(r3)
            r4 = r15
            long r4 = org.lwjgl.system.MemoryUtil.memAddress(r4)
            r5 = r16
            long r5 = org.lwjgl.system.MemoryUtil.memAddress(r5)
            r6 = r17
            long r6 = org.lwjgl.system.MemoryUtil.memAddress(r6)
            nglGetActiveUniform(r0, r1, r2, r3, r4, r5, r6)
            return
    }

    @org.lwjgl.system.NativeType("void")
    public static java.lang.String glGetActiveUniform(@org.lwjgl.system.NativeType("GLuint") int r12, @org.lwjgl.system.NativeType("GLuint") int r13, @org.lwjgl.system.NativeType("GLsizei") int r14, @org.lwjgl.system.NativeType("GLint *") java.nio.IntBuffer r15, @org.lwjgl.system.NativeType("GLenum *") java.nio.IntBuffer r16) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L11
            r0 = r15
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
            r0 = r16
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
        L11:
            org.lwjgl.system.MemoryStack r0 = org.lwjgl.system.MemoryStack.stackGet()
            r17 = r0
            r0 = r17
            int r0 = r0.getPointer()
            r18 = r0
            r0 = r17
            r1 = 0
            java.nio.IntBuffer r0 = r0.ints(r1)     // Catch: java.lang.Throwable -> L5d
            r19 = r0
            r0 = r17
            r1 = r14
            java.nio.ByteBuffer r0 = r0.malloc(r1)     // Catch: java.lang.Throwable -> L5d
            r20 = r0
            r0 = r12
            r1 = r13
            r2 = r14
            r3 = r19
            long r3 = org.lwjgl.system.MemoryUtil.memAddress(r3)     // Catch: java.lang.Throwable -> L5d
            r4 = r15
            long r4 = org.lwjgl.system.MemoryUtil.memAddress(r4)     // Catch: java.lang.Throwable -> L5d
            r5 = r16
            long r5 = org.lwjgl.system.MemoryUtil.memAddress(r5)     // Catch: java.lang.Throwable -> L5d
            r6 = r20
            long r6 = org.lwjgl.system.MemoryUtil.memAddress(r6)     // Catch: java.lang.Throwable -> L5d
            nglGetActiveUniform(r0, r1, r2, r3, r4, r5, r6)     // Catch: java.lang.Throwable -> L5d
            r0 = r20
            r1 = r19
            r2 = 0
            int r1 = r1.get(r2)     // Catch: java.lang.Throwable -> L5d
            java.lang.String r0 = org.lwjgl.system.MemoryUtil.memASCII(r0, r1)     // Catch: java.lang.Throwable -> L5d
            r21 = r0
            r0 = r17
            r1 = r18
            r0.setPointer(r1)
            r0 = r21
            return r0
        L5d:
            r22 = move-exception
            r0 = r17
            r1 = r18
            r0.setPointer(r1)
            r0 = r22
            throw r0
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

    public static native void nglGetUniformfv(int r0, int r1, long r2);

    public static void glGetUniformfv(@org.lwjgl.system.NativeType("GLuint") int r5, @org.lwjgl.system.NativeType("GLint") int r6, @org.lwjgl.system.NativeType("GLfloat *") java.nio.FloatBuffer r7) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r7
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
        Lb:
            r0 = r5
            r1 = r6
            r2 = r7
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            nglGetUniformfv(r0, r1, r2)
            return
    }

    @org.lwjgl.system.NativeType("void")
    public static float glGetUniformf(@org.lwjgl.system.NativeType("GLuint") int r5, @org.lwjgl.system.NativeType("GLint") int r6) {
            org.lwjgl.system.MemoryStack r0 = org.lwjgl.system.MemoryStack.stackGet()
            r7 = r0
            r0 = r7
            int r0 = r0.getPointer()
            r8 = r0
            r0 = r7
            r1 = 1
            java.nio.FloatBuffer r0 = r0.callocFloat(r1)     // Catch: java.lang.Throwable -> L2a
            r9 = r0
            r0 = r5
            r1 = r6
            r2 = r9
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)     // Catch: java.lang.Throwable -> L2a
            nglGetUniformfv(r0, r1, r2)     // Catch: java.lang.Throwable -> L2a
            r0 = r9
            r1 = 0
            float r0 = r0.get(r1)     // Catch: java.lang.Throwable -> L2a
            r10 = r0
            r0 = r7
            r1 = r8
            r0.setPointer(r1)
            r0 = r10
            return r0
        L2a:
            r11 = move-exception
            r0 = r7
            r1 = r8
            r0.setPointer(r1)
            r0 = r11
            throw r0
    }

    public static native void nglGetUniformiv(int r0, int r1, long r2);

    public static void glGetUniformiv(@org.lwjgl.system.NativeType("GLuint") int r5, @org.lwjgl.system.NativeType("GLint") int r6, @org.lwjgl.system.NativeType("GLint *") java.nio.IntBuffer r7) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r7
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
        Lb:
            r0 = r5
            r1 = r6
            r2 = r7
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            nglGetUniformiv(r0, r1, r2)
            return
    }

    @org.lwjgl.system.NativeType("void")
    public static int glGetUniformi(@org.lwjgl.system.NativeType("GLuint") int r5, @org.lwjgl.system.NativeType("GLint") int r6) {
            org.lwjgl.system.MemoryStack r0 = org.lwjgl.system.MemoryStack.stackGet()
            r7 = r0
            r0 = r7
            int r0 = r0.getPointer()
            r8 = r0
            r0 = r7
            r1 = 1
            java.nio.IntBuffer r0 = r0.callocInt(r1)     // Catch: java.lang.Throwable -> L2a
            r9 = r0
            r0 = r5
            r1 = r6
            r2 = r9
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)     // Catch: java.lang.Throwable -> L2a
            nglGetUniformiv(r0, r1, r2)     // Catch: java.lang.Throwable -> L2a
            r0 = r9
            r1 = 0
            int r0 = r0.get(r1)     // Catch: java.lang.Throwable -> L2a
            r10 = r0
            r0 = r7
            r1 = r8
            r0.setPointer(r1)
            r0 = r10
            return r0
        L2a:
            r11 = move-exception
            r0 = r7
            r1 = r8
            r0.setPointer(r1)
            r0 = r11
            throw r0
    }

    public static native void nglGetShaderSource(int r0, int r1, long r2, long r4);

    public static void glGetShaderSource(@org.lwjgl.system.NativeType("GLuint") int r7, @javax.annotation.Nullable @org.lwjgl.system.NativeType("GLsizei *") java.nio.IntBuffer r8, @org.lwjgl.system.NativeType("GLchar *") java.nio.ByteBuffer r9) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r8
            r1 = 1
            org.lwjgl.system.Checks.checkSafe(r0, r1)
        Lb:
            r0 = r7
            r1 = r9
            int r1 = r1.remaining()
            r2 = r8
            long r2 = org.lwjgl.system.MemoryUtil.memAddressSafe(r2)
            r3 = r9
            long r3 = org.lwjgl.system.MemoryUtil.memAddress(r3)
            nglGetShaderSource(r0, r1, r2, r3)
            return
    }

    @org.lwjgl.system.NativeType("void")
    public static java.lang.String glGetShaderSource(@org.lwjgl.system.NativeType("GLuint") int r7, @org.lwjgl.system.NativeType("GLsizei") int r8) {
            org.lwjgl.system.MemoryStack r0 = org.lwjgl.system.MemoryStack.stackGet()
            r9 = r0
            r0 = r9
            int r0 = r0.getPointer()
            r10 = r0
            r0 = r8
            java.nio.ByteBuffer r0 = org.lwjgl.system.MemoryUtil.memAlloc(r0)
            r11 = r0
            r0 = r9
            r1 = 0
            java.nio.IntBuffer r0 = r0.ints(r1)     // Catch: java.lang.Throwable -> L3f
            r12 = r0
            r0 = r7
            r1 = r8
            r2 = r12
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)     // Catch: java.lang.Throwable -> L3f
            r3 = r11
            long r3 = org.lwjgl.system.MemoryUtil.memAddress(r3)     // Catch: java.lang.Throwable -> L3f
            nglGetShaderSource(r0, r1, r2, r3)     // Catch: java.lang.Throwable -> L3f
            r0 = r11
            r1 = r12
            r2 = 0
            int r1 = r1.get(r2)     // Catch: java.lang.Throwable -> L3f
            java.lang.String r0 = org.lwjgl.system.MemoryUtil.memUTF8(r0, r1)     // Catch: java.lang.Throwable -> L3f
            r13 = r0
            r0 = r11
            org.lwjgl.system.MemoryUtil.memFree(r0)
            r0 = r9
            r1 = r10
            r0.setPointer(r1)
            r0 = r13
            return r0
        L3f:
            r14 = move-exception
            r0 = r11
            org.lwjgl.system.MemoryUtil.memFree(r0)
            r0 = r9
            r1 = r10
            r0.setPointer(r1)
            r0 = r14
            throw r0
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

    public static native void glVertexAttrib1f(@org.lwjgl.system.NativeType("GLuint") int r0, @org.lwjgl.system.NativeType("GLfloat") float r1);

    public static native void glVertexAttrib1s(@org.lwjgl.system.NativeType("GLuint") int r0, @org.lwjgl.system.NativeType("GLshort") short r1);

    public static native void glVertexAttrib1d(@org.lwjgl.system.NativeType("GLuint") int r0, @org.lwjgl.system.NativeType("GLdouble") double r1);

    public static native void glVertexAttrib2f(@org.lwjgl.system.NativeType("GLuint") int r0, @org.lwjgl.system.NativeType("GLfloat") float r1, @org.lwjgl.system.NativeType("GLfloat") float r2);

    public static native void glVertexAttrib2s(@org.lwjgl.system.NativeType("GLuint") int r0, @org.lwjgl.system.NativeType("GLshort") short r1, @org.lwjgl.system.NativeType("GLshort") short r2);

    public static native void glVertexAttrib2d(@org.lwjgl.system.NativeType("GLuint") int r0, @org.lwjgl.system.NativeType("GLdouble") double r1, @org.lwjgl.system.NativeType("GLdouble") double r3);

    public static native void glVertexAttrib3f(@org.lwjgl.system.NativeType("GLuint") int r0, @org.lwjgl.system.NativeType("GLfloat") float r1, @org.lwjgl.system.NativeType("GLfloat") float r2, @org.lwjgl.system.NativeType("GLfloat") float r3);

    public static native void glVertexAttrib3s(@org.lwjgl.system.NativeType("GLuint") int r0, @org.lwjgl.system.NativeType("GLshort") short r1, @org.lwjgl.system.NativeType("GLshort") short r2, @org.lwjgl.system.NativeType("GLshort") short r3);

    public static native void glVertexAttrib3d(@org.lwjgl.system.NativeType("GLuint") int r0, @org.lwjgl.system.NativeType("GLdouble") double r1, @org.lwjgl.system.NativeType("GLdouble") double r3, @org.lwjgl.system.NativeType("GLdouble") double r5);

    public static native void glVertexAttrib4f(@org.lwjgl.system.NativeType("GLuint") int r0, @org.lwjgl.system.NativeType("GLfloat") float r1, @org.lwjgl.system.NativeType("GLfloat") float r2, @org.lwjgl.system.NativeType("GLfloat") float r3, @org.lwjgl.system.NativeType("GLfloat") float r4);

    public static native void glVertexAttrib4s(@org.lwjgl.system.NativeType("GLuint") int r0, @org.lwjgl.system.NativeType("GLshort") short r1, @org.lwjgl.system.NativeType("GLshort") short r2, @org.lwjgl.system.NativeType("GLshort") short r3, @org.lwjgl.system.NativeType("GLshort") short r4);

    public static native void glVertexAttrib4d(@org.lwjgl.system.NativeType("GLuint") int r0, @org.lwjgl.system.NativeType("GLdouble") double r1, @org.lwjgl.system.NativeType("GLdouble") double r3, @org.lwjgl.system.NativeType("GLdouble") double r5, @org.lwjgl.system.NativeType("GLdouble") double r7);

    public static native void glVertexAttrib4Nub(@org.lwjgl.system.NativeType("GLuint") int r0, @org.lwjgl.system.NativeType("GLubyte") byte r1, @org.lwjgl.system.NativeType("GLubyte") byte r2, @org.lwjgl.system.NativeType("GLubyte") byte r3, @org.lwjgl.system.NativeType("GLubyte") byte r4);

    public static native void nglVertexAttrib1fv(int r0, long r1);

    public static void glVertexAttrib1fv(@org.lwjgl.system.NativeType("GLuint") int r4, @org.lwjgl.system.NativeType("GLfloat const *") java.nio.FloatBuffer r5) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r5
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
        Lb:
            r0 = r4
            r1 = r5
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            nglVertexAttrib1fv(r0, r1)
            return
    }

    public static native void nglVertexAttrib1sv(int r0, long r1);

    public static void glVertexAttrib1sv(@org.lwjgl.system.NativeType("GLuint") int r4, @org.lwjgl.system.NativeType("GLshort const *") java.nio.ShortBuffer r5) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r5
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
        Lb:
            r0 = r4
            r1 = r5
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            nglVertexAttrib1sv(r0, r1)
            return
    }

    public static native void nglVertexAttrib1dv(int r0, long r1);

    public static void glVertexAttrib1dv(@org.lwjgl.system.NativeType("GLuint") int r4, @org.lwjgl.system.NativeType("GLdouble const *") java.nio.DoubleBuffer r5) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r5
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
        Lb:
            r0 = r4
            r1 = r5
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            nglVertexAttrib1dv(r0, r1)
            return
    }

    public static native void nglVertexAttrib2fv(int r0, long r1);

    public static void glVertexAttrib2fv(@org.lwjgl.system.NativeType("GLuint") int r4, @org.lwjgl.system.NativeType("GLfloat const *") java.nio.FloatBuffer r5) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r5
            r1 = 2
            org.lwjgl.system.Checks.check(r0, r1)
        Lb:
            r0 = r4
            r1 = r5
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            nglVertexAttrib2fv(r0, r1)
            return
    }

    public static native void nglVertexAttrib2sv(int r0, long r1);

    public static void glVertexAttrib2sv(@org.lwjgl.system.NativeType("GLuint") int r4, @org.lwjgl.system.NativeType("GLshort const *") java.nio.ShortBuffer r5) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r5
            r1 = 2
            org.lwjgl.system.Checks.check(r0, r1)
        Lb:
            r0 = r4
            r1 = r5
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            nglVertexAttrib2sv(r0, r1)
            return
    }

    public static native void nglVertexAttrib2dv(int r0, long r1);

    public static void glVertexAttrib2dv(@org.lwjgl.system.NativeType("GLuint") int r4, @org.lwjgl.system.NativeType("GLdouble const *") java.nio.DoubleBuffer r5) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r5
            r1 = 2
            org.lwjgl.system.Checks.check(r0, r1)
        Lb:
            r0 = r4
            r1 = r5
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            nglVertexAttrib2dv(r0, r1)
            return
    }

    public static native void nglVertexAttrib3fv(int r0, long r1);

    public static void glVertexAttrib3fv(@org.lwjgl.system.NativeType("GLuint") int r4, @org.lwjgl.system.NativeType("GLfloat const *") java.nio.FloatBuffer r5) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r5
            r1 = 3
            org.lwjgl.system.Checks.check(r0, r1)
        Lb:
            r0 = r4
            r1 = r5
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            nglVertexAttrib3fv(r0, r1)
            return
    }

    public static native void nglVertexAttrib3sv(int r0, long r1);

    public static void glVertexAttrib3sv(@org.lwjgl.system.NativeType("GLuint") int r4, @org.lwjgl.system.NativeType("GLshort const *") java.nio.ShortBuffer r5) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r5
            r1 = 3
            org.lwjgl.system.Checks.check(r0, r1)
        Lb:
            r0 = r4
            r1 = r5
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            nglVertexAttrib3sv(r0, r1)
            return
    }

    public static native void nglVertexAttrib3dv(int r0, long r1);

    public static void glVertexAttrib3dv(@org.lwjgl.system.NativeType("GLuint") int r4, @org.lwjgl.system.NativeType("GLdouble const *") java.nio.DoubleBuffer r5) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r5
            r1 = 3
            org.lwjgl.system.Checks.check(r0, r1)
        Lb:
            r0 = r4
            r1 = r5
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            nglVertexAttrib3dv(r0, r1)
            return
    }

    public static native void nglVertexAttrib4fv(int r0, long r1);

    public static void glVertexAttrib4fv(@org.lwjgl.system.NativeType("GLuint") int r4, @org.lwjgl.system.NativeType("GLfloat const *") java.nio.FloatBuffer r5) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r5
            r1 = 4
            org.lwjgl.system.Checks.check(r0, r1)
        Lb:
            r0 = r4
            r1 = r5
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            nglVertexAttrib4fv(r0, r1)
            return
    }

    public static native void nglVertexAttrib4sv(int r0, long r1);

    public static void glVertexAttrib4sv(@org.lwjgl.system.NativeType("GLuint") int r4, @org.lwjgl.system.NativeType("GLshort const *") java.nio.ShortBuffer r5) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r5
            r1 = 4
            org.lwjgl.system.Checks.check(r0, r1)
        Lb:
            r0 = r4
            r1 = r5
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            nglVertexAttrib4sv(r0, r1)
            return
    }

    public static native void nglVertexAttrib4dv(int r0, long r1);

    public static void glVertexAttrib4dv(@org.lwjgl.system.NativeType("GLuint") int r4, @org.lwjgl.system.NativeType("GLdouble const *") java.nio.DoubleBuffer r5) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r5
            r1 = 4
            org.lwjgl.system.Checks.check(r0, r1)
        Lb:
            r0 = r4
            r1 = r5
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            nglVertexAttrib4dv(r0, r1)
            return
    }

    public static native void nglVertexAttrib4iv(int r0, long r1);

    public static void glVertexAttrib4iv(@org.lwjgl.system.NativeType("GLuint") int r4, @org.lwjgl.system.NativeType("GLint const *") java.nio.IntBuffer r5) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r5
            r1 = 4
            org.lwjgl.system.Checks.check(r0, r1)
        Lb:
            r0 = r4
            r1 = r5
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            nglVertexAttrib4iv(r0, r1)
            return
    }

    public static native void nglVertexAttrib4bv(int r0, long r1);

    public static void glVertexAttrib4bv(@org.lwjgl.system.NativeType("GLuint") int r4, @org.lwjgl.system.NativeType("GLbyte const *") java.nio.ByteBuffer r5) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r5
            r1 = 4
            org.lwjgl.system.Checks.check(r0, r1)
        Lb:
            r0 = r4
            r1 = r5
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            nglVertexAttrib4bv(r0, r1)
            return
    }

    public static native void nglVertexAttrib4ubv(int r0, long r1);

    public static void glVertexAttrib4ubv(@org.lwjgl.system.NativeType("GLuint") int r4, @org.lwjgl.system.NativeType("GLubyte const *") java.nio.ByteBuffer r5) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r5
            r1 = 4
            org.lwjgl.system.Checks.check(r0, r1)
        Lb:
            r0 = r4
            r1 = r5
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            nglVertexAttrib4ubv(r0, r1)
            return
    }

    public static native void nglVertexAttrib4usv(int r0, long r1);

    public static void glVertexAttrib4usv(@org.lwjgl.system.NativeType("GLuint") int r4, @org.lwjgl.system.NativeType("GLushort const *") java.nio.ShortBuffer r5) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r5
            r1 = 4
            org.lwjgl.system.Checks.check(r0, r1)
        Lb:
            r0 = r4
            r1 = r5
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            nglVertexAttrib4usv(r0, r1)
            return
    }

    public static native void nglVertexAttrib4uiv(int r0, long r1);

    public static void glVertexAttrib4uiv(@org.lwjgl.system.NativeType("GLuint") int r4, @org.lwjgl.system.NativeType("GLuint const *") java.nio.IntBuffer r5) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r5
            r1 = 4
            org.lwjgl.system.Checks.check(r0, r1)
        Lb:
            r0 = r4
            r1 = r5
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            nglVertexAttrib4uiv(r0, r1)
            return
    }

    public static native void nglVertexAttrib4Nbv(int r0, long r1);

    public static void glVertexAttrib4Nbv(@org.lwjgl.system.NativeType("GLuint") int r4, @org.lwjgl.system.NativeType("GLbyte const *") java.nio.ByteBuffer r5) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r5
            r1 = 4
            org.lwjgl.system.Checks.check(r0, r1)
        Lb:
            r0 = r4
            r1 = r5
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            nglVertexAttrib4Nbv(r0, r1)
            return
    }

    public static native void nglVertexAttrib4Nsv(int r0, long r1);

    public static void glVertexAttrib4Nsv(@org.lwjgl.system.NativeType("GLuint") int r4, @org.lwjgl.system.NativeType("GLshort const *") java.nio.ShortBuffer r5) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r5
            r1 = 4
            org.lwjgl.system.Checks.check(r0, r1)
        Lb:
            r0 = r4
            r1 = r5
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            nglVertexAttrib4Nsv(r0, r1)
            return
    }

    public static native void nglVertexAttrib4Niv(int r0, long r1);

    public static void glVertexAttrib4Niv(@org.lwjgl.system.NativeType("GLuint") int r4, @org.lwjgl.system.NativeType("GLint const *") java.nio.IntBuffer r5) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r5
            r1 = 4
            org.lwjgl.system.Checks.check(r0, r1)
        Lb:
            r0 = r4
            r1 = r5
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            nglVertexAttrib4Niv(r0, r1)
            return
    }

    public static native void nglVertexAttrib4Nubv(int r0, long r1);

    public static void glVertexAttrib4Nubv(@org.lwjgl.system.NativeType("GLuint") int r4, @org.lwjgl.system.NativeType("GLubyte const *") java.nio.ByteBuffer r5) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r5
            r1 = 4
            org.lwjgl.system.Checks.check(r0, r1)
        Lb:
            r0 = r4
            r1 = r5
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            nglVertexAttrib4Nubv(r0, r1)
            return
    }

    public static native void nglVertexAttrib4Nusv(int r0, long r1);

    public static void glVertexAttrib4Nusv(@org.lwjgl.system.NativeType("GLuint") int r4, @org.lwjgl.system.NativeType("GLushort const *") java.nio.ShortBuffer r5) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r5
            r1 = 4
            org.lwjgl.system.Checks.check(r0, r1)
        Lb:
            r0 = r4
            r1 = r5
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            nglVertexAttrib4Nusv(r0, r1)
            return
    }

    public static native void nglVertexAttrib4Nuiv(int r0, long r1);

    public static void glVertexAttrib4Nuiv(@org.lwjgl.system.NativeType("GLuint") int r4, @org.lwjgl.system.NativeType("GLuint const *") java.nio.IntBuffer r5) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r5
            r1 = 4
            org.lwjgl.system.Checks.check(r0, r1)
        Lb:
            r0 = r4
            r1 = r5
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            nglVertexAttrib4Nuiv(r0, r1)
            return
    }

    public static native void nglVertexAttribPointer(int r0, int r1, int r2, boolean r3, int r4, long r5);

    public static void glVertexAttribPointer(@org.lwjgl.system.NativeType("GLuint") int r8, @org.lwjgl.system.NativeType("GLint") int r9, @org.lwjgl.system.NativeType("GLenum") int r10, @org.lwjgl.system.NativeType("GLboolean") boolean r11, @org.lwjgl.system.NativeType("GLsizei") int r12, @org.lwjgl.system.NativeType("void const *") java.nio.ByteBuffer r13) {
            r0 = r8
            r1 = r9
            r2 = r10
            r3 = r11
            r4 = r12
            r5 = r13
            long r5 = org.lwjgl.system.MemoryUtil.memAddress(r5)
            nglVertexAttribPointer(r0, r1, r2, r3, r4, r5)
            return
    }

    public static void glVertexAttribPointer(@org.lwjgl.system.NativeType("GLuint") int r8, @org.lwjgl.system.NativeType("GLint") int r9, @org.lwjgl.system.NativeType("GLenum") int r10, @org.lwjgl.system.NativeType("GLboolean") boolean r11, @org.lwjgl.system.NativeType("GLsizei") int r12, @org.lwjgl.system.NativeType("void const *") long r13) {
            r0 = r8
            r1 = r9
            r2 = r10
            r3 = r11
            r4 = r12
            r5 = r13
            nglVertexAttribPointer(r0, r1, r2, r3, r4, r5)
            return
    }

    public static void glVertexAttribPointer(@org.lwjgl.system.NativeType("GLuint") int r8, @org.lwjgl.system.NativeType("GLint") int r9, @org.lwjgl.system.NativeType("GLenum") int r10, @org.lwjgl.system.NativeType("GLboolean") boolean r11, @org.lwjgl.system.NativeType("GLsizei") int r12, @org.lwjgl.system.NativeType("void const *") java.nio.ShortBuffer r13) {
            r0 = r8
            r1 = r9
            r2 = r10
            r3 = r11
            r4 = r12
            r5 = r13
            long r5 = org.lwjgl.system.MemoryUtil.memAddress(r5)
            nglVertexAttribPointer(r0, r1, r2, r3, r4, r5)
            return
    }

    public static void glVertexAttribPointer(@org.lwjgl.system.NativeType("GLuint") int r8, @org.lwjgl.system.NativeType("GLint") int r9, @org.lwjgl.system.NativeType("GLenum") int r10, @org.lwjgl.system.NativeType("GLboolean") boolean r11, @org.lwjgl.system.NativeType("GLsizei") int r12, @org.lwjgl.system.NativeType("void const *") java.nio.IntBuffer r13) {
            r0 = r8
            r1 = r9
            r2 = r10
            r3 = r11
            r4 = r12
            r5 = r13
            long r5 = org.lwjgl.system.MemoryUtil.memAddress(r5)
            nglVertexAttribPointer(r0, r1, r2, r3, r4, r5)
            return
    }

    public static void glVertexAttribPointer(@org.lwjgl.system.NativeType("GLuint") int r8, @org.lwjgl.system.NativeType("GLint") int r9, @org.lwjgl.system.NativeType("GLenum") int r10, @org.lwjgl.system.NativeType("GLboolean") boolean r11, @org.lwjgl.system.NativeType("GLsizei") int r12, @org.lwjgl.system.NativeType("void const *") java.nio.FloatBuffer r13) {
            r0 = r8
            r1 = r9
            r2 = r10
            r3 = r11
            r4 = r12
            r5 = r13
            long r5 = org.lwjgl.system.MemoryUtil.memAddress(r5)
            nglVertexAttribPointer(r0, r1, r2, r3, r4, r5)
            return
    }

    public static native void glEnableVertexAttribArray(@org.lwjgl.system.NativeType("GLuint") int r0);

    public static native void glDisableVertexAttribArray(@org.lwjgl.system.NativeType("GLuint") int r0);

    public static native void nglBindAttribLocation(int r0, int r1, long r2);

    public static void glBindAttribLocation(@org.lwjgl.system.NativeType("GLuint") int r5, @org.lwjgl.system.NativeType("GLuint") int r6, @org.lwjgl.system.NativeType("GLchar const *") java.nio.ByteBuffer r7) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto La
            r0 = r7
            org.lwjgl.system.Checks.checkNT1(r0)
        La:
            r0 = r5
            r1 = r6
            r2 = r7
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            nglBindAttribLocation(r0, r1, r2)
            return
    }

    public static void glBindAttribLocation(@org.lwjgl.system.NativeType("GLuint") int r5, @org.lwjgl.system.NativeType("GLuint") int r6, @org.lwjgl.system.NativeType("GLchar const *") java.lang.CharSequence r7) {
            org.lwjgl.system.MemoryStack r0 = org.lwjgl.system.MemoryStack.stackGet()
            r8 = r0
            r0 = r8
            int r0 = r0.getPointer()
            r9 = r0
            r0 = r8
            r1 = r7
            r2 = 1
            int r0 = r0.nASCII(r1, r2)     // Catch: java.lang.Throwable -> L27
            r0 = r8
            long r0 = r0.getPointerAddress()     // Catch: java.lang.Throwable -> L27
            r10 = r0
            r0 = r5
            r1 = r6
            r2 = r10
            nglBindAttribLocation(r0, r1, r2)     // Catch: java.lang.Throwable -> L27
            r0 = r8
            r1 = r9
            r0.setPointer(r1)
            goto L32
        L27:
            r12 = move-exception
            r0 = r8
            r1 = r9
            r0.setPointer(r1)
            r0 = r12
            throw r0
        L32:
            return
    }

    public static native void nglGetActiveAttrib(int r0, int r1, int r2, long r3, long r5, long r7, long r9);

    public static void glGetActiveAttrib(@org.lwjgl.system.NativeType("GLuint") int r12, @org.lwjgl.system.NativeType("GLuint") int r13, @javax.annotation.Nullable @org.lwjgl.system.NativeType("GLsizei *") java.nio.IntBuffer r14, @org.lwjgl.system.NativeType("GLint *") java.nio.IntBuffer r15, @org.lwjgl.system.NativeType("GLenum *") java.nio.IntBuffer r16, @org.lwjgl.system.NativeType("GLchar *") java.nio.ByteBuffer r17) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L16
            r0 = r14
            r1 = 1
            org.lwjgl.system.Checks.checkSafe(r0, r1)
            r0 = r15
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
            r0 = r16
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
        L16:
            r0 = r12
            r1 = r13
            r2 = r17
            int r2 = r2.remaining()
            r3 = r14
            long r3 = org.lwjgl.system.MemoryUtil.memAddressSafe(r3)
            r4 = r15
            long r4 = org.lwjgl.system.MemoryUtil.memAddress(r4)
            r5 = r16
            long r5 = org.lwjgl.system.MemoryUtil.memAddress(r5)
            r6 = r17
            long r6 = org.lwjgl.system.MemoryUtil.memAddress(r6)
            nglGetActiveAttrib(r0, r1, r2, r3, r4, r5, r6)
            return
    }

    @org.lwjgl.system.NativeType("void")
    public static java.lang.String glGetActiveAttrib(@org.lwjgl.system.NativeType("GLuint") int r12, @org.lwjgl.system.NativeType("GLuint") int r13, @org.lwjgl.system.NativeType("GLsizei") int r14, @org.lwjgl.system.NativeType("GLint *") java.nio.IntBuffer r15, @org.lwjgl.system.NativeType("GLenum *") java.nio.IntBuffer r16) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L11
            r0 = r15
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
            r0 = r16
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
        L11:
            org.lwjgl.system.MemoryStack r0 = org.lwjgl.system.MemoryStack.stackGet()
            r17 = r0
            r0 = r17
            int r0 = r0.getPointer()
            r18 = r0
            r0 = r17
            r1 = 0
            java.nio.IntBuffer r0 = r0.ints(r1)     // Catch: java.lang.Throwable -> L5d
            r19 = r0
            r0 = r17
            r1 = r14
            java.nio.ByteBuffer r0 = r0.malloc(r1)     // Catch: java.lang.Throwable -> L5d
            r20 = r0
            r0 = r12
            r1 = r13
            r2 = r14
            r3 = r19
            long r3 = org.lwjgl.system.MemoryUtil.memAddress(r3)     // Catch: java.lang.Throwable -> L5d
            r4 = r15
            long r4 = org.lwjgl.system.MemoryUtil.memAddress(r4)     // Catch: java.lang.Throwable -> L5d
            r5 = r16
            long r5 = org.lwjgl.system.MemoryUtil.memAddress(r5)     // Catch: java.lang.Throwable -> L5d
            r6 = r20
            long r6 = org.lwjgl.system.MemoryUtil.memAddress(r6)     // Catch: java.lang.Throwable -> L5d
            nglGetActiveAttrib(r0, r1, r2, r3, r4, r5, r6)     // Catch: java.lang.Throwable -> L5d
            r0 = r20
            r1 = r19
            r2 = 0
            int r1 = r1.get(r2)     // Catch: java.lang.Throwable -> L5d
            java.lang.String r0 = org.lwjgl.system.MemoryUtil.memASCII(r0, r1)     // Catch: java.lang.Throwable -> L5d
            r21 = r0
            r0 = r17
            r1 = r18
            r0.setPointer(r1)
            r0 = r21
            return r0
        L5d:
            r22 = move-exception
            r0 = r17
            r1 = r18
            r0.setPointer(r1)
            r0 = r22
            throw r0
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

    public static native int nglGetAttribLocation(int r0, long r1);

    @org.lwjgl.system.NativeType("GLint")
    public static int glGetAttribLocation(@org.lwjgl.system.NativeType("GLuint") int r4, @org.lwjgl.system.NativeType("GLchar const *") java.nio.ByteBuffer r5) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto La
            r0 = r5
            org.lwjgl.system.Checks.checkNT1(r0)
        La:
            r0 = r4
            r1 = r5
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            int r0 = nglGetAttribLocation(r0, r1)
            return r0
    }

    @org.lwjgl.system.NativeType("GLint")
    public static int glGetAttribLocation(@org.lwjgl.system.NativeType("GLuint") int r4, @org.lwjgl.system.NativeType("GLchar const *") java.lang.CharSequence r5) {
            org.lwjgl.system.MemoryStack r0 = org.lwjgl.system.MemoryStack.stackGet()
            r6 = r0
            r0 = r6
            int r0 = r0.getPointer()
            r7 = r0
            r0 = r6
            r1 = r5
            r2 = 1
            int r0 = r0.nASCII(r1, r2)     // Catch: java.lang.Throwable -> L26
            r0 = r6
            long r0 = r0.getPointerAddress()     // Catch: java.lang.Throwable -> L26
            r8 = r0
            r0 = r4
            r1 = r8
            int r0 = nglGetAttribLocation(r0, r1)     // Catch: java.lang.Throwable -> L26
            r10 = r0
            r0 = r6
            r1 = r7
            r0.setPointer(r1)
            r0 = r10
            return r0
        L26:
            r11 = move-exception
            r0 = r6
            r1 = r7
            r0.setPointer(r1)
            r0 = r11
            throw r0
    }

    public static native void nglGetVertexAttribiv(int r0, int r1, long r2);

    public static void glGetVertexAttribiv(@org.lwjgl.system.NativeType("GLuint") int r5, @org.lwjgl.system.NativeType("GLenum") int r6, @org.lwjgl.system.NativeType("GLint *") java.nio.IntBuffer r7) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r7
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
        Lb:
            r0 = r5
            r1 = r6
            r2 = r7
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            nglGetVertexAttribiv(r0, r1, r2)
            return
    }

    @org.lwjgl.system.NativeType("void")
    public static int glGetVertexAttribi(@org.lwjgl.system.NativeType("GLuint") int r5, @org.lwjgl.system.NativeType("GLenum") int r6) {
            org.lwjgl.system.MemoryStack r0 = org.lwjgl.system.MemoryStack.stackGet()
            r7 = r0
            r0 = r7
            int r0 = r0.getPointer()
            r8 = r0
            r0 = r7
            r1 = 1
            java.nio.IntBuffer r0 = r0.callocInt(r1)     // Catch: java.lang.Throwable -> L2a
            r9 = r0
            r0 = r5
            r1 = r6
            r2 = r9
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)     // Catch: java.lang.Throwable -> L2a
            nglGetVertexAttribiv(r0, r1, r2)     // Catch: java.lang.Throwable -> L2a
            r0 = r9
            r1 = 0
            int r0 = r0.get(r1)     // Catch: java.lang.Throwable -> L2a
            r10 = r0
            r0 = r7
            r1 = r8
            r0.setPointer(r1)
            r0 = r10
            return r0
        L2a:
            r11 = move-exception
            r0 = r7
            r1 = r8
            r0.setPointer(r1)
            r0 = r11
            throw r0
    }

    public static native void nglGetVertexAttribfv(int r0, int r1, long r2);

    public static void glGetVertexAttribfv(@org.lwjgl.system.NativeType("GLuint") int r5, @org.lwjgl.system.NativeType("GLenum") int r6, @org.lwjgl.system.NativeType("GLfloat *") java.nio.FloatBuffer r7) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r7
            r1 = 4
            org.lwjgl.system.Checks.check(r0, r1)
        Lb:
            r0 = r5
            r1 = r6
            r2 = r7
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            nglGetVertexAttribfv(r0, r1, r2)
            return
    }

    public static native void nglGetVertexAttribdv(int r0, int r1, long r2);

    public static void glGetVertexAttribdv(@org.lwjgl.system.NativeType("GLuint") int r5, @org.lwjgl.system.NativeType("GLenum") int r6, @org.lwjgl.system.NativeType("GLdouble *") java.nio.DoubleBuffer r7) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r7
            r1 = 4
            org.lwjgl.system.Checks.check(r0, r1)
        Lb:
            r0 = r5
            r1 = r6
            r2 = r7
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            nglGetVertexAttribdv(r0, r1, r2)
            return
    }

    public static native void nglGetVertexAttribPointerv(int r0, int r1, long r2);

    public static void glGetVertexAttribPointerv(@org.lwjgl.system.NativeType("GLuint") int r5, @org.lwjgl.system.NativeType("GLenum") int r6, @org.lwjgl.system.NativeType("void **") org.lwjgl.PointerBuffer r7) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r7
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
        Lb:
            r0 = r5
            r1 = r6
            r2 = r7
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            nglGetVertexAttribPointerv(r0, r1, r2)
            return
    }

    @org.lwjgl.system.NativeType("void")
    public static long glGetVertexAttribPointer(@org.lwjgl.system.NativeType("GLuint") int r5, @org.lwjgl.system.NativeType("GLenum") int r6) {
            org.lwjgl.system.MemoryStack r0 = org.lwjgl.system.MemoryStack.stackGet()
            r7 = r0
            r0 = r7
            int r0 = r0.getPointer()
            r8 = r0
            r0 = r7
            r1 = 1
            org.lwjgl.PointerBuffer r0 = r0.callocPointer(r1)     // Catch: java.lang.Throwable -> L2a
            r9 = r0
            r0 = r5
            r1 = r6
            r2 = r9
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)     // Catch: java.lang.Throwable -> L2a
            nglGetVertexAttribPointerv(r0, r1, r2)     // Catch: java.lang.Throwable -> L2a
            r0 = r9
            r1 = 0
            long r0 = r0.get(r1)     // Catch: java.lang.Throwable -> L2a
            r10 = r0
            r0 = r7
            r1 = r8
            r0.setPointer(r1)
            r0 = r10
            return r0
        L2a:
            r12 = move-exception
            r0 = r7
            r1 = r8
            r0.setPointer(r1)
            r0 = r12
            throw r0
    }

    public static native void nglDrawBuffers(int r0, long r1);

    public static void glDrawBuffers(@org.lwjgl.system.NativeType("GLenum const *") java.nio.IntBuffer r4) {
            r0 = r4
            int r0 = r0.remaining()
            r1 = r4
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            nglDrawBuffers(r0, r1)
            return
    }

    public static void glDrawBuffers(@org.lwjgl.system.NativeType("GLenum const *") int r4) {
            org.lwjgl.system.MemoryStack r0 = org.lwjgl.system.MemoryStack.stackGet()
            r5 = r0
            r0 = r5
            int r0 = r0.getPointer()
            r6 = r0
            r0 = r5
            r1 = r4
            java.nio.IntBuffer r0 = r0.ints(r1)     // Catch: java.lang.Throwable -> L1f
            r7 = r0
            r0 = 1
            r1 = r7
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)     // Catch: java.lang.Throwable -> L1f
            nglDrawBuffers(r0, r1)     // Catch: java.lang.Throwable -> L1f
            r0 = r5
            r1 = r6
            r0.setPointer(r1)
            goto L29
        L1f:
            r8 = move-exception
            r0 = r5
            r1 = r6
            r0.setPointer(r1)
            r0 = r8
            throw r0
        L29:
            return
    }

    public static native void glBlendEquationSeparate(@org.lwjgl.system.NativeType("GLenum") int r0, @org.lwjgl.system.NativeType("GLenum") int r1);

    public static native void glStencilOpSeparate(@org.lwjgl.system.NativeType("GLenum") int r0, @org.lwjgl.system.NativeType("GLenum") int r1, @org.lwjgl.system.NativeType("GLenum") int r2, @org.lwjgl.system.NativeType("GLenum") int r3);

    public static native void glStencilFuncSeparate(@org.lwjgl.system.NativeType("GLenum") int r0, @org.lwjgl.system.NativeType("GLenum") int r1, @org.lwjgl.system.NativeType("GLint") int r2, @org.lwjgl.system.NativeType("GLuint") int r3);

    public static native void glStencilMaskSeparate(@org.lwjgl.system.NativeType("GLenum") int r0, @org.lwjgl.system.NativeType("GLuint") int r1);

    public static void glShaderSource(@org.lwjgl.system.NativeType("GLuint") int r8, @org.lwjgl.system.NativeType("GLchar const * const *") org.lwjgl.PointerBuffer r9, @javax.annotation.Nullable @org.lwjgl.system.NativeType("GLint const *") int[] r10) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glShaderSource
            r11 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L1a
            r0 = r11
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r10
            r1 = r9
            int r1 = r1.remaining()
            org.lwjgl.system.Checks.checkSafe(r0, r1)
        L1a:
            r0 = r8
            r1 = r9
            int r1 = r1.remaining()
            r2 = r9
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            r3 = r10
            r4 = r11
            org.lwjgl.system.JNI.callPPV(r0, r1, r2, r3, r4)
            return
    }

    public static void glUniform1fv(@org.lwjgl.system.NativeType("GLint") int r6, @org.lwjgl.system.NativeType("GLfloat const *") float[] r7) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glUniform1fv
            r8 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L12
            r0 = r8
            long r0 = org.lwjgl.system.Checks.check(r0)
        L12:
            r0 = r6
            r1 = r7
            int r1 = r1.length
            r2 = r7
            r3 = r8
            org.lwjgl.system.JNI.callPV(r0, r1, r2, r3)
            return
    }

    public static void glUniform2fv(@org.lwjgl.system.NativeType("GLint") int r6, @org.lwjgl.system.NativeType("GLfloat const *") float[] r7) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glUniform2fv
            r8 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L12
            r0 = r8
            long r0 = org.lwjgl.system.Checks.check(r0)
        L12:
            r0 = r6
            r1 = r7
            int r1 = r1.length
            r2 = 1
            int r1 = r1 >> r2
            r2 = r7
            r3 = r8
            org.lwjgl.system.JNI.callPV(r0, r1, r2, r3)
            return
    }

    public static void glUniform3fv(@org.lwjgl.system.NativeType("GLint") int r6, @org.lwjgl.system.NativeType("GLfloat const *") float[] r7) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glUniform3fv
            r8 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L12
            r0 = r8
            long r0 = org.lwjgl.system.Checks.check(r0)
        L12:
            r0 = r6
            r1 = r7
            int r1 = r1.length
            r2 = 3
            int r1 = r1 / r2
            r2 = r7
            r3 = r8
            org.lwjgl.system.JNI.callPV(r0, r1, r2, r3)
            return
    }

    public static void glUniform4fv(@org.lwjgl.system.NativeType("GLint") int r6, @org.lwjgl.system.NativeType("GLfloat const *") float[] r7) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glUniform4fv
            r8 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L12
            r0 = r8
            long r0 = org.lwjgl.system.Checks.check(r0)
        L12:
            r0 = r6
            r1 = r7
            int r1 = r1.length
            r2 = 2
            int r1 = r1 >> r2
            r2 = r7
            r3 = r8
            org.lwjgl.system.JNI.callPV(r0, r1, r2, r3)
            return
    }

    public static void glUniform1iv(@org.lwjgl.system.NativeType("GLint") int r6, @org.lwjgl.system.NativeType("GLint const *") int[] r7) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glUniform1iv
            r8 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L12
            r0 = r8
            long r0 = org.lwjgl.system.Checks.check(r0)
        L12:
            r0 = r6
            r1 = r7
            int r1 = r1.length
            r2 = r7
            r3 = r8
            org.lwjgl.system.JNI.callPV(r0, r1, r2, r3)
            return
    }

    public static void glUniform2iv(@org.lwjgl.system.NativeType("GLint") int r6, @org.lwjgl.system.NativeType("GLint const *") int[] r7) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glUniform2iv
            r8 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L12
            r0 = r8
            long r0 = org.lwjgl.system.Checks.check(r0)
        L12:
            r0 = r6
            r1 = r7
            int r1 = r1.length
            r2 = 1
            int r1 = r1 >> r2
            r2 = r7
            r3 = r8
            org.lwjgl.system.JNI.callPV(r0, r1, r2, r3)
            return
    }

    public static void glUniform3iv(@org.lwjgl.system.NativeType("GLint") int r6, @org.lwjgl.system.NativeType("GLint const *") int[] r7) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glUniform3iv
            r8 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L12
            r0 = r8
            long r0 = org.lwjgl.system.Checks.check(r0)
        L12:
            r0 = r6
            r1 = r7
            int r1 = r1.length
            r2 = 3
            int r1 = r1 / r2
            r2 = r7
            r3 = r8
            org.lwjgl.system.JNI.callPV(r0, r1, r2, r3)
            return
    }

    public static void glUniform4iv(@org.lwjgl.system.NativeType("GLint") int r6, @org.lwjgl.system.NativeType("GLint const *") int[] r7) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glUniform4iv
            r8 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L12
            r0 = r8
            long r0 = org.lwjgl.system.Checks.check(r0)
        L12:
            r0 = r6
            r1 = r7
            int r1 = r1.length
            r2 = 2
            int r1 = r1 >> r2
            r2 = r7
            r3 = r8
            org.lwjgl.system.JNI.callPV(r0, r1, r2, r3)
            return
    }

    public static void glUniformMatrix2fv(@org.lwjgl.system.NativeType("GLint") int r7, @org.lwjgl.system.NativeType("GLboolean") boolean r8, @org.lwjgl.system.NativeType("GLfloat const *") float[] r9) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glUniformMatrix2fv
            r10 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L12
            r0 = r10
            long r0 = org.lwjgl.system.Checks.check(r0)
        L12:
            r0 = r7
            r1 = r9
            int r1 = r1.length
            r2 = 2
            int r1 = r1 >> r2
            r2 = r8
            r3 = r9
            r4 = r10
            org.lwjgl.system.JNI.callPV(r0, r1, r2, r3, r4)
            return
    }

    public static void glUniformMatrix3fv(@org.lwjgl.system.NativeType("GLint") int r7, @org.lwjgl.system.NativeType("GLboolean") boolean r8, @org.lwjgl.system.NativeType("GLfloat const *") float[] r9) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glUniformMatrix3fv
            r10 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L12
            r0 = r10
            long r0 = org.lwjgl.system.Checks.check(r0)
        L12:
            r0 = r7
            r1 = r9
            int r1 = r1.length
            r2 = 9
            int r1 = r1 / r2
            r2 = r8
            r3 = r9
            r4 = r10
            org.lwjgl.system.JNI.callPV(r0, r1, r2, r3, r4)
            return
    }

    public static void glUniformMatrix4fv(@org.lwjgl.system.NativeType("GLint") int r7, @org.lwjgl.system.NativeType("GLboolean") boolean r8, @org.lwjgl.system.NativeType("GLfloat const *") float[] r9) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glUniformMatrix4fv
            r10 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L12
            r0 = r10
            long r0 = org.lwjgl.system.Checks.check(r0)
        L12:
            r0 = r7
            r1 = r9
            int r1 = r1.length
            r2 = 4
            int r1 = r1 >> r2
            r2 = r8
            r3 = r9
            r4 = r10
            org.lwjgl.system.JNI.callPV(r0, r1, r2, r3, r4)
            return
    }

    public static void glGetShaderiv(@org.lwjgl.system.NativeType("GLuint") int r6, @org.lwjgl.system.NativeType("GLenum") int r7, @org.lwjgl.system.NativeType("GLint *") int[] r8) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glGetShaderiv
            r9 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L17
            r0 = r9
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r8
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
        L17:
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            org.lwjgl.system.JNI.callPV(r0, r1, r2, r3)
            return
    }

    public static void glGetProgramiv(@org.lwjgl.system.NativeType("GLuint") int r6, @org.lwjgl.system.NativeType("GLenum") int r7, @org.lwjgl.system.NativeType("GLint *") int[] r8) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glGetProgramiv
            r9 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L17
            r0 = r9
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r8
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
        L17:
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            org.lwjgl.system.JNI.callPV(r0, r1, r2, r3)
            return
    }

    public static void glGetShaderInfoLog(@org.lwjgl.system.NativeType("GLuint") int r8, @javax.annotation.Nullable @org.lwjgl.system.NativeType("GLsizei *") int[] r9, @org.lwjgl.system.NativeType("GLchar *") java.nio.ByteBuffer r10) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glGetShaderInfoLog
            r11 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L17
            r0 = r11
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r9
            r1 = 1
            org.lwjgl.system.Checks.checkSafe(r0, r1)
        L17:
            r0 = r8
            r1 = r10
            int r1 = r1.remaining()
            r2 = r9
            r3 = r10
            long r3 = org.lwjgl.system.MemoryUtil.memAddress(r3)
            r4 = r11
            org.lwjgl.system.JNI.callPPV(r0, r1, r2, r3, r4)
            return
    }

    public static void glGetProgramInfoLog(@org.lwjgl.system.NativeType("GLuint") int r8, @javax.annotation.Nullable @org.lwjgl.system.NativeType("GLsizei *") int[] r9, @org.lwjgl.system.NativeType("GLchar *") java.nio.ByteBuffer r10) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glGetProgramInfoLog
            r11 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L17
            r0 = r11
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r9
            r1 = 1
            org.lwjgl.system.Checks.checkSafe(r0, r1)
        L17:
            r0 = r8
            r1 = r10
            int r1 = r1.remaining()
            r2 = r9
            r3 = r10
            long r3 = org.lwjgl.system.MemoryUtil.memAddress(r3)
            r4 = r11
            org.lwjgl.system.JNI.callPPV(r0, r1, r2, r3, r4)
            return
    }

    public static void glGetAttachedShaders(@org.lwjgl.system.NativeType("GLuint") int r7, @javax.annotation.Nullable @org.lwjgl.system.NativeType("GLsizei *") int[] r8, @org.lwjgl.system.NativeType("GLuint *") int[] r9) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glGetAttachedShaders
            r10 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L17
            r0 = r10
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r8
            r1 = 1
            org.lwjgl.system.Checks.checkSafe(r0, r1)
        L17:
            r0 = r7
            r1 = r9
            int r1 = r1.length
            r2 = r8
            r3 = r9
            r4 = r10
            org.lwjgl.system.JNI.callPPV(r0, r1, r2, r3, r4)
            return
    }

    public static void glGetActiveUniform(@org.lwjgl.system.NativeType("GLuint") int r11, @org.lwjgl.system.NativeType("GLuint") int r12, @javax.annotation.Nullable @org.lwjgl.system.NativeType("GLsizei *") int[] r13, @org.lwjgl.system.NativeType("GLint *") int[] r14, @org.lwjgl.system.NativeType("GLenum *") int[] r15, @org.lwjgl.system.NativeType("GLchar *") java.nio.ByteBuffer r16) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glGetActiveUniform
            r17 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L24
            r0 = r17
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r13
            r1 = 1
            org.lwjgl.system.Checks.checkSafe(r0, r1)
            r0 = r14
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
            r0 = r15
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
        L24:
            r0 = r11
            r1 = r12
            r2 = r16
            int r2 = r2.remaining()
            r3 = r13
            r4 = r14
            r5 = r15
            r6 = r16
            long r6 = org.lwjgl.system.MemoryUtil.memAddress(r6)
            r7 = r17
            org.lwjgl.system.JNI.callPPPPV(r0, r1, r2, r3, r4, r5, r6, r7)
            return
    }

    public static void glGetUniformfv(@org.lwjgl.system.NativeType("GLuint") int r6, @org.lwjgl.system.NativeType("GLint") int r7, @org.lwjgl.system.NativeType("GLfloat *") float[] r8) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glGetUniformfv
            r9 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L17
            r0 = r9
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r8
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
        L17:
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            org.lwjgl.system.JNI.callPV(r0, r1, r2, r3)
            return
    }

    public static void glGetUniformiv(@org.lwjgl.system.NativeType("GLuint") int r6, @org.lwjgl.system.NativeType("GLint") int r7, @org.lwjgl.system.NativeType("GLint *") int[] r8) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glGetUniformiv
            r9 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L17
            r0 = r9
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r8
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
        L17:
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            org.lwjgl.system.JNI.callPV(r0, r1, r2, r3)
            return
    }

    public static void glGetShaderSource(@org.lwjgl.system.NativeType("GLuint") int r8, @javax.annotation.Nullable @org.lwjgl.system.NativeType("GLsizei *") int[] r9, @org.lwjgl.system.NativeType("GLchar *") java.nio.ByteBuffer r10) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glGetShaderSource
            r11 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L17
            r0 = r11
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r9
            r1 = 1
            org.lwjgl.system.Checks.checkSafe(r0, r1)
        L17:
            r0 = r8
            r1 = r10
            int r1 = r1.remaining()
            r2 = r9
            r3 = r10
            long r3 = org.lwjgl.system.MemoryUtil.memAddress(r3)
            r4 = r11
            org.lwjgl.system.JNI.callPPV(r0, r1, r2, r3, r4)
            return
    }

    public static void glVertexAttrib1fv(@org.lwjgl.system.NativeType("GLuint") int r5, @org.lwjgl.system.NativeType("GLfloat const *") float[] r6) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glVertexAttrib1fv
            r7 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L17
            r0 = r7
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r6
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
        L17:
            r0 = r5
            r1 = r6
            r2 = r7
            org.lwjgl.system.JNI.callPV(r0, r1, r2)
            return
    }

    public static void glVertexAttrib1sv(@org.lwjgl.system.NativeType("GLuint") int r5, @org.lwjgl.system.NativeType("GLshort const *") short[] r6) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glVertexAttrib1sv
            r7 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L17
            r0 = r7
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r6
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
        L17:
            r0 = r5
            r1 = r6
            r2 = r7
            org.lwjgl.system.JNI.callPV(r0, r1, r2)
            return
    }

    public static void glVertexAttrib1dv(@org.lwjgl.system.NativeType("GLuint") int r5, @org.lwjgl.system.NativeType("GLdouble const *") double[] r6) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glVertexAttrib1dv
            r7 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L17
            r0 = r7
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r6
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
        L17:
            r0 = r5
            r1 = r6
            r2 = r7
            org.lwjgl.system.JNI.callPV(r0, r1, r2)
            return
    }

    public static void glVertexAttrib2fv(@org.lwjgl.system.NativeType("GLuint") int r5, @org.lwjgl.system.NativeType("GLfloat const *") float[] r6) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glVertexAttrib2fv
            r7 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L17
            r0 = r7
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r6
            r1 = 2
            org.lwjgl.system.Checks.check(r0, r1)
        L17:
            r0 = r5
            r1 = r6
            r2 = r7
            org.lwjgl.system.JNI.callPV(r0, r1, r2)
            return
    }

    public static void glVertexAttrib2sv(@org.lwjgl.system.NativeType("GLuint") int r5, @org.lwjgl.system.NativeType("GLshort const *") short[] r6) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glVertexAttrib2sv
            r7 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L17
            r0 = r7
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r6
            r1 = 2
            org.lwjgl.system.Checks.check(r0, r1)
        L17:
            r0 = r5
            r1 = r6
            r2 = r7
            org.lwjgl.system.JNI.callPV(r0, r1, r2)
            return
    }

    public static void glVertexAttrib2dv(@org.lwjgl.system.NativeType("GLuint") int r5, @org.lwjgl.system.NativeType("GLdouble const *") double[] r6) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glVertexAttrib2dv
            r7 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L17
            r0 = r7
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r6
            r1 = 2
            org.lwjgl.system.Checks.check(r0, r1)
        L17:
            r0 = r5
            r1 = r6
            r2 = r7
            org.lwjgl.system.JNI.callPV(r0, r1, r2)
            return
    }

    public static void glVertexAttrib3fv(@org.lwjgl.system.NativeType("GLuint") int r5, @org.lwjgl.system.NativeType("GLfloat const *") float[] r6) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glVertexAttrib3fv
            r7 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L17
            r0 = r7
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r6
            r1 = 3
            org.lwjgl.system.Checks.check(r0, r1)
        L17:
            r0 = r5
            r1 = r6
            r2 = r7
            org.lwjgl.system.JNI.callPV(r0, r1, r2)
            return
    }

    public static void glVertexAttrib3sv(@org.lwjgl.system.NativeType("GLuint") int r5, @org.lwjgl.system.NativeType("GLshort const *") short[] r6) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glVertexAttrib3sv
            r7 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L17
            r0 = r7
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r6
            r1 = 3
            org.lwjgl.system.Checks.check(r0, r1)
        L17:
            r0 = r5
            r1 = r6
            r2 = r7
            org.lwjgl.system.JNI.callPV(r0, r1, r2)
            return
    }

    public static void glVertexAttrib3dv(@org.lwjgl.system.NativeType("GLuint") int r5, @org.lwjgl.system.NativeType("GLdouble const *") double[] r6) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glVertexAttrib3dv
            r7 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L17
            r0 = r7
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r6
            r1 = 3
            org.lwjgl.system.Checks.check(r0, r1)
        L17:
            r0 = r5
            r1 = r6
            r2 = r7
            org.lwjgl.system.JNI.callPV(r0, r1, r2)
            return
    }

    public static void glVertexAttrib4fv(@org.lwjgl.system.NativeType("GLuint") int r5, @org.lwjgl.system.NativeType("GLfloat const *") float[] r6) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glVertexAttrib4fv
            r7 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L17
            r0 = r7
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r6
            r1 = 4
            org.lwjgl.system.Checks.check(r0, r1)
        L17:
            r0 = r5
            r1 = r6
            r2 = r7
            org.lwjgl.system.JNI.callPV(r0, r1, r2)
            return
    }

    public static void glVertexAttrib4sv(@org.lwjgl.system.NativeType("GLuint") int r5, @org.lwjgl.system.NativeType("GLshort const *") short[] r6) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glVertexAttrib4sv
            r7 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L17
            r0 = r7
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r6
            r1 = 4
            org.lwjgl.system.Checks.check(r0, r1)
        L17:
            r0 = r5
            r1 = r6
            r2 = r7
            org.lwjgl.system.JNI.callPV(r0, r1, r2)
            return
    }

    public static void glVertexAttrib4dv(@org.lwjgl.system.NativeType("GLuint") int r5, @org.lwjgl.system.NativeType("GLdouble const *") double[] r6) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glVertexAttrib4dv
            r7 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L17
            r0 = r7
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r6
            r1 = 4
            org.lwjgl.system.Checks.check(r0, r1)
        L17:
            r0 = r5
            r1 = r6
            r2 = r7
            org.lwjgl.system.JNI.callPV(r0, r1, r2)
            return
    }

    public static void glVertexAttrib4iv(@org.lwjgl.system.NativeType("GLuint") int r5, @org.lwjgl.system.NativeType("GLint const *") int[] r6) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glVertexAttrib4iv
            r7 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L17
            r0 = r7
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r6
            r1 = 4
            org.lwjgl.system.Checks.check(r0, r1)
        L17:
            r0 = r5
            r1 = r6
            r2 = r7
            org.lwjgl.system.JNI.callPV(r0, r1, r2)
            return
    }

    public static void glVertexAttrib4usv(@org.lwjgl.system.NativeType("GLuint") int r5, @org.lwjgl.system.NativeType("GLushort const *") short[] r6) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glVertexAttrib4usv
            r7 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L17
            r0 = r7
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r6
            r1 = 4
            org.lwjgl.system.Checks.check(r0, r1)
        L17:
            r0 = r5
            r1 = r6
            r2 = r7
            org.lwjgl.system.JNI.callPV(r0, r1, r2)
            return
    }

    public static void glVertexAttrib4uiv(@org.lwjgl.system.NativeType("GLuint") int r5, @org.lwjgl.system.NativeType("GLuint const *") int[] r6) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glVertexAttrib4uiv
            r7 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L17
            r0 = r7
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r6
            r1 = 4
            org.lwjgl.system.Checks.check(r0, r1)
        L17:
            r0 = r5
            r1 = r6
            r2 = r7
            org.lwjgl.system.JNI.callPV(r0, r1, r2)
            return
    }

    public static void glVertexAttrib4Nsv(@org.lwjgl.system.NativeType("GLuint") int r5, @org.lwjgl.system.NativeType("GLshort const *") short[] r6) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glVertexAttrib4Nsv
            r7 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L17
            r0 = r7
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r6
            r1 = 4
            org.lwjgl.system.Checks.check(r0, r1)
        L17:
            r0 = r5
            r1 = r6
            r2 = r7
            org.lwjgl.system.JNI.callPV(r0, r1, r2)
            return
    }

    public static void glVertexAttrib4Niv(@org.lwjgl.system.NativeType("GLuint") int r5, @org.lwjgl.system.NativeType("GLint const *") int[] r6) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glVertexAttrib4Niv
            r7 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L17
            r0 = r7
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r6
            r1 = 4
            org.lwjgl.system.Checks.check(r0, r1)
        L17:
            r0 = r5
            r1 = r6
            r2 = r7
            org.lwjgl.system.JNI.callPV(r0, r1, r2)
            return
    }

    public static void glVertexAttrib4Nusv(@org.lwjgl.system.NativeType("GLuint") int r5, @org.lwjgl.system.NativeType("GLushort const *") short[] r6) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glVertexAttrib4Nusv
            r7 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L17
            r0 = r7
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r6
            r1 = 4
            org.lwjgl.system.Checks.check(r0, r1)
        L17:
            r0 = r5
            r1 = r6
            r2 = r7
            org.lwjgl.system.JNI.callPV(r0, r1, r2)
            return
    }

    public static void glVertexAttrib4Nuiv(@org.lwjgl.system.NativeType("GLuint") int r5, @org.lwjgl.system.NativeType("GLuint const *") int[] r6) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glVertexAttrib4Nuiv
            r7 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L17
            r0 = r7
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r6
            r1 = 4
            org.lwjgl.system.Checks.check(r0, r1)
        L17:
            r0 = r5
            r1 = r6
            r2 = r7
            org.lwjgl.system.JNI.callPV(r0, r1, r2)
            return
    }

    public static void glGetActiveAttrib(@org.lwjgl.system.NativeType("GLuint") int r11, @org.lwjgl.system.NativeType("GLuint") int r12, @javax.annotation.Nullable @org.lwjgl.system.NativeType("GLsizei *") int[] r13, @org.lwjgl.system.NativeType("GLint *") int[] r14, @org.lwjgl.system.NativeType("GLenum *") int[] r15, @org.lwjgl.system.NativeType("GLchar *") java.nio.ByteBuffer r16) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glGetActiveAttrib
            r17 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L24
            r0 = r17
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r13
            r1 = 1
            org.lwjgl.system.Checks.checkSafe(r0, r1)
            r0 = r14
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
            r0 = r15
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
        L24:
            r0 = r11
            r1 = r12
            r2 = r16
            int r2 = r2.remaining()
            r3 = r13
            r4 = r14
            r5 = r15
            r6 = r16
            long r6 = org.lwjgl.system.MemoryUtil.memAddress(r6)
            r7 = r17
            org.lwjgl.system.JNI.callPPPPV(r0, r1, r2, r3, r4, r5, r6, r7)
            return
    }

    public static void glGetVertexAttribiv(@org.lwjgl.system.NativeType("GLuint") int r6, @org.lwjgl.system.NativeType("GLenum") int r7, @org.lwjgl.system.NativeType("GLint *") int[] r8) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glGetVertexAttribiv
            r9 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L17
            r0 = r9
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r8
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
        L17:
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            org.lwjgl.system.JNI.callPV(r0, r1, r2, r3)
            return
    }

    public static void glGetVertexAttribfv(@org.lwjgl.system.NativeType("GLuint") int r6, @org.lwjgl.system.NativeType("GLenum") int r7, @org.lwjgl.system.NativeType("GLfloat *") float[] r8) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glGetVertexAttribfv
            r9 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L17
            r0 = r9
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r8
            r1 = 4
            org.lwjgl.system.Checks.check(r0, r1)
        L17:
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            org.lwjgl.system.JNI.callPV(r0, r1, r2, r3)
            return
    }

    public static void glGetVertexAttribdv(@org.lwjgl.system.NativeType("GLuint") int r6, @org.lwjgl.system.NativeType("GLenum") int r7, @org.lwjgl.system.NativeType("GLdouble *") double[] r8) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glGetVertexAttribdv
            r9 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L17
            r0 = r9
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r8
            r1 = 4
            org.lwjgl.system.Checks.check(r0, r1)
        L17:
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            org.lwjgl.system.JNI.callPV(r0, r1, r2, r3)
            return
    }

    public static void glDrawBuffers(@org.lwjgl.system.NativeType("GLenum const *") int[] r5) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glDrawBuffers
            r6 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L12
            r0 = r6
            long r0 = org.lwjgl.system.Checks.check(r0)
        L12:
            r0 = r5
            int r0 = r0.length
            r1 = r5
            r2 = r6
            org.lwjgl.system.JNI.callPV(r0, r1, r2)
            return
    }

    static {
            org.lwjgl.opengl.GL.initialize()
            return
    }
}
