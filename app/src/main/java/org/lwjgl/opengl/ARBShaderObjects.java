package org.lwjgl.opengl;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/opengl/ARBShaderObjects.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/opengl/ARBShaderObjects.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/opengl/ARBShaderObjects.class */
public class ARBShaderObjects {
    public static final int GL_PROGRAM_OBJECT_ARB = 35648;
    public static final int GL_OBJECT_TYPE_ARB = 35662;
    public static final int GL_OBJECT_SUBTYPE_ARB = 35663;
    public static final int GL_OBJECT_DELETE_STATUS_ARB = 35712;
    public static final int GL_OBJECT_COMPILE_STATUS_ARB = 35713;
    public static final int GL_OBJECT_LINK_STATUS_ARB = 35714;
    public static final int GL_OBJECT_VALIDATE_STATUS_ARB = 35715;
    public static final int GL_OBJECT_INFO_LOG_LENGTH_ARB = 35716;
    public static final int GL_OBJECT_ATTACHED_OBJECTS_ARB = 35717;
    public static final int GL_OBJECT_ACTIVE_UNIFORMS_ARB = 35718;
    public static final int GL_OBJECT_ACTIVE_UNIFORM_MAX_LENGTH_ARB = 35719;
    public static final int GL_OBJECT_SHADER_SOURCE_LENGTH_ARB = 35720;
    public static final int GL_SHADER_OBJECT_ARB = 35656;
    public static final int GL_FLOAT_VEC2_ARB = 35664;
    public static final int GL_FLOAT_VEC3_ARB = 35665;
    public static final int GL_FLOAT_VEC4_ARB = 35666;
    public static final int GL_INT_VEC2_ARB = 35667;
    public static final int GL_INT_VEC3_ARB = 35668;
    public static final int GL_INT_VEC4_ARB = 35669;
    public static final int GL_BOOL_ARB = 35670;
    public static final int GL_BOOL_VEC2_ARB = 35671;
    public static final int GL_BOOL_VEC3_ARB = 35672;
    public static final int GL_BOOL_VEC4_ARB = 35673;
    public static final int GL_FLOAT_MAT2_ARB = 35674;
    public static final int GL_FLOAT_MAT3_ARB = 35675;
    public static final int GL_FLOAT_MAT4_ARB = 35676;
    public static final int GL_SAMPLER_1D_ARB = 35677;
    public static final int GL_SAMPLER_2D_ARB = 35678;
    public static final int GL_SAMPLER_3D_ARB = 35679;
    public static final int GL_SAMPLER_CUBE_ARB = 35680;
    public static final int GL_SAMPLER_1D_SHADOW_ARB = 35681;
    public static final int GL_SAMPLER_2D_SHADOW_ARB = 35682;
    public static final int GL_SAMPLER_2D_RECT_ARB = 35683;
    public static final int GL_SAMPLER_2D_RECT_SHADOW_ARB = 35684;

    public static void glShaderSourceARB(int r5, java.nio.ByteBuffer r6) {
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
            glShaderSourceARB(r0, r1)
            return
    }

    public static void glUniform1ARB(@org.lwjgl.system.NativeType("GLint") int r3, @org.lwjgl.system.NativeType("GLfloat const *") java.nio.FloatBuffer r4) {
            r0 = r3
            r1 = r4
            glUniform1fvARB(r0, r1)
            return
    }

    public static void glUniform2ARB(@org.lwjgl.system.NativeType("GLint") int r3, @org.lwjgl.system.NativeType("GLfloat const *") java.nio.FloatBuffer r4) {
            r0 = r3
            r1 = r4
            glUniform2fvARB(r0, r1)
            return
    }

    public static void glUniform3ARB(@org.lwjgl.system.NativeType("GLint") int r3, @org.lwjgl.system.NativeType("GLfloat const *") java.nio.FloatBuffer r4) {
            r0 = r3
            r1 = r4
            glUniform3fvARB(r0, r1)
            return
    }

    public static void glUniform4ARB(@org.lwjgl.system.NativeType("GLint") int r3, @org.lwjgl.system.NativeType("GLfloat const *") java.nio.FloatBuffer r4) {
            r0 = r3
            r1 = r4
            glUniform4fvARB(r0, r1)
            return
    }

    public static void glUniform1ARB(@org.lwjgl.system.NativeType("GLint") int r3, @org.lwjgl.system.NativeType("GLint const *") java.nio.IntBuffer r4) {
            r0 = r3
            r1 = r4
            glUniform1ivARB(r0, r1)
            return
    }

    public static void glUniform2ARB(@org.lwjgl.system.NativeType("GLint") int r3, @org.lwjgl.system.NativeType("GLint const *") java.nio.IntBuffer r4) {
            r0 = r3
            r1 = r4
            glUniform2ivARB(r0, r1)
            return
    }

    public static void glUniform3ARB(@org.lwjgl.system.NativeType("GLint") int r3, @org.lwjgl.system.NativeType("GLint const *") java.nio.IntBuffer r4) {
            r0 = r3
            r1 = r4
            glUniform3ivARB(r0, r1)
            return
    }

    public static void glUniform4ARB(@org.lwjgl.system.NativeType("GLint") int r3, @org.lwjgl.system.NativeType("GLint const *") java.nio.IntBuffer r4) {
            r0 = r3
            r1 = r4
            glUniform4ivARB(r0, r1)
            return
    }

    public static void glUniformMatrix2ARB(@org.lwjgl.system.NativeType("GLint") int r4, @org.lwjgl.system.NativeType("GLboolean") boolean r5, @org.lwjgl.system.NativeType("GLfloat const *") java.nio.FloatBuffer r6) {
            r0 = r4
            r1 = r5
            r2 = r6
            glUniformMatrix2fvARB(r0, r1, r2)
            return
    }

    public static void glUniformMatrix3ARB(@org.lwjgl.system.NativeType("GLint") int r4, @org.lwjgl.system.NativeType("GLboolean") boolean r5, @org.lwjgl.system.NativeType("GLfloat const *") java.nio.FloatBuffer r6) {
            r0 = r4
            r1 = r5
            r2 = r6
            glUniformMatrix3fvARB(r0, r1, r2)
            return
    }

    public static void glUniformMatrix4ARB(@org.lwjgl.system.NativeType("GLint") int r4, @org.lwjgl.system.NativeType("GLboolean") boolean r5, @org.lwjgl.system.NativeType("GLfloat const *") java.nio.FloatBuffer r6) {
            r0 = r4
            r1 = r5
            r2 = r6
            glUniformMatrix4fvARB(r0, r1, r2)
            return
    }

    public static void glGetObjectParameterARB(@org.lwjgl.system.NativeType("GLhandleARB") int r4, @org.lwjgl.system.NativeType("GLenum") int r5, @org.lwjgl.system.NativeType("GLfloat *") java.nio.FloatBuffer r6) {
            r0 = r4
            r1 = r5
            r2 = r6
            glGetObjectParameterfvARB(r0, r1, r2)
            return
    }

    public static void glGetObjectParameterARB(@org.lwjgl.system.NativeType("GLhandleARB") int r4, @org.lwjgl.system.NativeType("GLenum") int r5, @org.lwjgl.system.NativeType("GLint *") java.nio.IntBuffer r6) {
            r0 = r4
            r1 = r5
            r2 = r6
            glGetObjectParameterivARB(r0, r1, r2)
            return
    }

    public static void glGetUniformARB(@org.lwjgl.system.NativeType("GLhandleARB") int r4, @org.lwjgl.system.NativeType("GLint") int r5, @org.lwjgl.system.NativeType("GLfloat *") java.nio.FloatBuffer r6) {
            r0 = r4
            r1 = r5
            r2 = r6
            glGetUniformfvARB(r0, r1, r2)
            return
    }

    public static void glGetUniformARB(@org.lwjgl.system.NativeType("GLhandleARB") int r4, @org.lwjgl.system.NativeType("GLint") int r5, @org.lwjgl.system.NativeType("GLint *") java.nio.IntBuffer r6) {
            r0 = r4
            r1 = r5
            r2 = r6
            glGetUniformivARB(r0, r1, r2)
            return
    }

    protected ARBShaderObjects() {
            r3 = this;
            r0 = r3
            r0.<init>()
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r1 = r0
            r1.<init>()
            throw r0
    }

    public static native void glDeleteObjectARB(@org.lwjgl.system.NativeType("GLhandleARB") int r0);

    @org.lwjgl.system.NativeType("GLhandleARB")
    public static native int glGetHandleARB(@org.lwjgl.system.NativeType("GLenum") int r0);

    public static native void glDetachObjectARB(@org.lwjgl.system.NativeType("GLhandleARB") int r0, @org.lwjgl.system.NativeType("GLhandleARB") int r1);

    @org.lwjgl.system.NativeType("GLhandleARB")
    public static native int glCreateShaderObjectARB(@org.lwjgl.system.NativeType("GLenum") int r0);

    public static native void nglShaderSourceARB(int r0, int r1, long r2, long r4);

    public static void glShaderSourceARB(@org.lwjgl.system.NativeType("GLhandleARB") int r7, @org.lwjgl.system.NativeType("GLcharARB const **") org.lwjgl.PointerBuffer r8, @javax.annotation.Nullable @org.lwjgl.system.NativeType("GLint const *") java.nio.IntBuffer r9) {
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
            nglShaderSourceARB(r0, r1, r2, r3)
            return
    }

    public static void glShaderSourceARB(@org.lwjgl.system.NativeType("GLhandleARB") int r9, @org.lwjgl.system.NativeType("GLcharARB const **") java.lang.CharSequence... r10) {
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
            nglShaderSourceARB(r0, r1, r2, r3)     // Catch: java.lang.Throwable -> L34
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

    public static void glShaderSourceARB(@org.lwjgl.system.NativeType("GLhandleARB") int r9, @org.lwjgl.system.NativeType("GLcharARB const **") java.lang.CharSequence r10) {
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
            nglShaderSourceARB(r0, r1, r2, r3)     // Catch: java.lang.Throwable -> L37
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

    public static native void glCompileShaderARB(@org.lwjgl.system.NativeType("GLhandleARB") int r0);

    @org.lwjgl.system.NativeType("GLhandleARB")
    public static native int glCreateProgramObjectARB();

    public static native void glAttachObjectARB(@org.lwjgl.system.NativeType("GLhandleARB") int r0, @org.lwjgl.system.NativeType("GLhandleARB") int r1);

    public static native void glLinkProgramARB(@org.lwjgl.system.NativeType("GLhandleARB") int r0);

    public static native void glUseProgramObjectARB(@org.lwjgl.system.NativeType("GLhandleARB") int r0);

    public static native void glValidateProgramARB(@org.lwjgl.system.NativeType("GLhandleARB") int r0);

    public static native void glUniform1fARB(@org.lwjgl.system.NativeType("GLint") int r0, @org.lwjgl.system.NativeType("GLfloat") float r1);

    public static native void glUniform2fARB(@org.lwjgl.system.NativeType("GLint") int r0, @org.lwjgl.system.NativeType("GLfloat") float r1, @org.lwjgl.system.NativeType("GLfloat") float r2);

    public static native void glUniform3fARB(@org.lwjgl.system.NativeType("GLint") int r0, @org.lwjgl.system.NativeType("GLfloat") float r1, @org.lwjgl.system.NativeType("GLfloat") float r2, @org.lwjgl.system.NativeType("GLfloat") float r3);

    public static native void glUniform4fARB(@org.lwjgl.system.NativeType("GLint") int r0, @org.lwjgl.system.NativeType("GLfloat") float r1, @org.lwjgl.system.NativeType("GLfloat") float r2, @org.lwjgl.system.NativeType("GLfloat") float r3, @org.lwjgl.system.NativeType("GLfloat") float r4);

    public static native void glUniform1iARB(@org.lwjgl.system.NativeType("GLint") int r0, @org.lwjgl.system.NativeType("GLint") int r1);

    public static native void glUniform2iARB(@org.lwjgl.system.NativeType("GLint") int r0, @org.lwjgl.system.NativeType("GLint") int r1, @org.lwjgl.system.NativeType("GLint") int r2);

    public static native void glUniform3iARB(@org.lwjgl.system.NativeType("GLint") int r0, @org.lwjgl.system.NativeType("GLint") int r1, @org.lwjgl.system.NativeType("GLint") int r2, @org.lwjgl.system.NativeType("GLint") int r3);

    public static native void glUniform4iARB(@org.lwjgl.system.NativeType("GLint") int r0, @org.lwjgl.system.NativeType("GLint") int r1, @org.lwjgl.system.NativeType("GLint") int r2, @org.lwjgl.system.NativeType("GLint") int r3, @org.lwjgl.system.NativeType("GLint") int r4);

    public static native void nglUniform1fvARB(int r0, int r1, long r2);

    public static void glUniform1fvARB(@org.lwjgl.system.NativeType("GLint") int r5, @org.lwjgl.system.NativeType("GLfloat const *") java.nio.FloatBuffer r6) {
            r0 = r5
            r1 = r6
            int r1 = r1.remaining()
            r2 = r6
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            nglUniform1fvARB(r0, r1, r2)
            return
    }

    public static native void nglUniform2fvARB(int r0, int r1, long r2);

    public static void glUniform2fvARB(@org.lwjgl.system.NativeType("GLint") int r5, @org.lwjgl.system.NativeType("GLfloat const *") java.nio.FloatBuffer r6) {
            r0 = r5
            r1 = r6
            int r1 = r1.remaining()
            r2 = 1
            int r1 = r1 >> r2
            r2 = r6
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            nglUniform2fvARB(r0, r1, r2)
            return
    }

    public static native void nglUniform3fvARB(int r0, int r1, long r2);

    public static void glUniform3fvARB(@org.lwjgl.system.NativeType("GLint") int r5, @org.lwjgl.system.NativeType("GLfloat const *") java.nio.FloatBuffer r6) {
            r0 = r5
            r1 = r6
            int r1 = r1.remaining()
            r2 = 3
            int r1 = r1 / r2
            r2 = r6
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            nglUniform3fvARB(r0, r1, r2)
            return
    }

    public static native void nglUniform4fvARB(int r0, int r1, long r2);

    public static void glUniform4fvARB(@org.lwjgl.system.NativeType("GLint") int r5, @org.lwjgl.system.NativeType("GLfloat const *") java.nio.FloatBuffer r6) {
            r0 = r5
            r1 = r6
            int r1 = r1.remaining()
            r2 = 2
            int r1 = r1 >> r2
            r2 = r6
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            nglUniform4fvARB(r0, r1, r2)
            return
    }

    public static native void nglUniform1ivARB(int r0, int r1, long r2);

    public static void glUniform1ivARB(@org.lwjgl.system.NativeType("GLint") int r5, @org.lwjgl.system.NativeType("GLint const *") java.nio.IntBuffer r6) {
            r0 = r5
            r1 = r6
            int r1 = r1.remaining()
            r2 = r6
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            nglUniform1ivARB(r0, r1, r2)
            return
    }

    public static native void nglUniform2ivARB(int r0, int r1, long r2);

    public static void glUniform2ivARB(@org.lwjgl.system.NativeType("GLint") int r5, @org.lwjgl.system.NativeType("GLint const *") java.nio.IntBuffer r6) {
            r0 = r5
            r1 = r6
            int r1 = r1.remaining()
            r2 = 1
            int r1 = r1 >> r2
            r2 = r6
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            nglUniform2ivARB(r0, r1, r2)
            return
    }

    public static native void nglUniform3ivARB(int r0, int r1, long r2);

    public static void glUniform3ivARB(@org.lwjgl.system.NativeType("GLint") int r5, @org.lwjgl.system.NativeType("GLint const *") java.nio.IntBuffer r6) {
            r0 = r5
            r1 = r6
            int r1 = r1.remaining()
            r2 = 3
            int r1 = r1 / r2
            r2 = r6
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            nglUniform3ivARB(r0, r1, r2)
            return
    }

    public static native void nglUniform4ivARB(int r0, int r1, long r2);

    public static void glUniform4ivARB(@org.lwjgl.system.NativeType("GLint") int r5, @org.lwjgl.system.NativeType("GLint const *") java.nio.IntBuffer r6) {
            r0 = r5
            r1 = r6
            int r1 = r1.remaining()
            r2 = 2
            int r1 = r1 >> r2
            r2 = r6
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            nglUniform4ivARB(r0, r1, r2)
            return
    }

    public static native void nglUniformMatrix2fvARB(int r0, int r1, boolean r2, long r3);

    public static void glUniformMatrix2fvARB(@org.lwjgl.system.NativeType("GLint") int r6, @org.lwjgl.system.NativeType("GLboolean") boolean r7, @org.lwjgl.system.NativeType("GLfloat const *") java.nio.FloatBuffer r8) {
            r0 = r6
            r1 = r8
            int r1 = r1.remaining()
            r2 = 2
            int r1 = r1 >> r2
            r2 = r7
            r3 = r8
            long r3 = org.lwjgl.system.MemoryUtil.memAddress(r3)
            nglUniformMatrix2fvARB(r0, r1, r2, r3)
            return
    }

    public static native void nglUniformMatrix3fvARB(int r0, int r1, boolean r2, long r3);

    public static void glUniformMatrix3fvARB(@org.lwjgl.system.NativeType("GLint") int r6, @org.lwjgl.system.NativeType("GLboolean") boolean r7, @org.lwjgl.system.NativeType("GLfloat const *") java.nio.FloatBuffer r8) {
            r0 = r6
            r1 = r8
            int r1 = r1.remaining()
            r2 = 9
            int r1 = r1 / r2
            r2 = r7
            r3 = r8
            long r3 = org.lwjgl.system.MemoryUtil.memAddress(r3)
            nglUniformMatrix3fvARB(r0, r1, r2, r3)
            return
    }

    public static native void nglUniformMatrix4fvARB(int r0, int r1, boolean r2, long r3);

    public static void glUniformMatrix4fvARB(@org.lwjgl.system.NativeType("GLint") int r6, @org.lwjgl.system.NativeType("GLboolean") boolean r7, @org.lwjgl.system.NativeType("GLfloat const *") java.nio.FloatBuffer r8) {
            r0 = r6
            r1 = r8
            int r1 = r1.remaining()
            r2 = 4
            int r1 = r1 >> r2
            r2 = r7
            r3 = r8
            long r3 = org.lwjgl.system.MemoryUtil.memAddress(r3)
            nglUniformMatrix4fvARB(r0, r1, r2, r3)
            return
    }

    public static native void nglGetObjectParameterfvARB(int r0, int r1, long r2);

    public static void glGetObjectParameterfvARB(@org.lwjgl.system.NativeType("GLhandleARB") int r5, @org.lwjgl.system.NativeType("GLenum") int r6, @org.lwjgl.system.NativeType("GLfloat *") java.nio.FloatBuffer r7) {
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
            nglGetObjectParameterfvARB(r0, r1, r2)
            return
    }

    public static native void nglGetObjectParameterivARB(int r0, int r1, long r2);

    public static void glGetObjectParameterivARB(@org.lwjgl.system.NativeType("GLhandleARB") int r5, @org.lwjgl.system.NativeType("GLenum") int r6, @org.lwjgl.system.NativeType("GLint *") java.nio.IntBuffer r7) {
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
            nglGetObjectParameterivARB(r0, r1, r2)
            return
    }

    @org.lwjgl.system.NativeType("void")
    public static int glGetObjectParameteriARB(@org.lwjgl.system.NativeType("GLhandleARB") int r5, @org.lwjgl.system.NativeType("GLenum") int r6) {
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
            nglGetObjectParameterivARB(r0, r1, r2)     // Catch: java.lang.Throwable -> L2a
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

    public static native void nglGetInfoLogARB(int r0, int r1, long r2, long r4);

    public static void glGetInfoLogARB(@org.lwjgl.system.NativeType("GLhandleARB") int r7, @javax.annotation.Nullable @org.lwjgl.system.NativeType("GLsizei *") java.nio.IntBuffer r8, @org.lwjgl.system.NativeType("GLcharARB *") java.nio.ByteBuffer r9) {
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
            nglGetInfoLogARB(r0, r1, r2, r3)
            return
    }

    @org.lwjgl.system.NativeType("void")
    public static java.lang.String glGetInfoLogARB(@org.lwjgl.system.NativeType("GLhandleARB") int r7, @org.lwjgl.system.NativeType("GLsizei") int r8) {
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
            nglGetInfoLogARB(r0, r1, r2, r3)     // Catch: java.lang.Throwable -> L3f
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
    public static java.lang.String glGetInfoLogARB(@org.lwjgl.system.NativeType("GLhandleARB") int r4) {
            r0 = r4
            r1 = r4
            r2 = 35716(0x8b84, float:5.0049E-41)
            int r1 = glGetObjectParameteriARB(r1, r2)
            java.lang.String r0 = glGetInfoLogARB(r0, r1)
            return r0
    }

    public static native void nglGetAttachedObjectsARB(int r0, int r1, long r2, long r4);

    public static void glGetAttachedObjectsARB(@org.lwjgl.system.NativeType("GLhandleARB") int r7, @javax.annotation.Nullable @org.lwjgl.system.NativeType("GLsizei *") java.nio.IntBuffer r8, @org.lwjgl.system.NativeType("GLhandleARB *") java.nio.IntBuffer r9) {
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
            nglGetAttachedObjectsARB(r0, r1, r2, r3)
            return
    }

    public static native int nglGetUniformLocationARB(int r0, long r1);

    @org.lwjgl.system.NativeType("GLint")
    public static int glGetUniformLocationARB(@org.lwjgl.system.NativeType("GLhandleARB") int r4, @org.lwjgl.system.NativeType("GLcharARB const *") java.nio.ByteBuffer r5) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto La
            r0 = r5
            org.lwjgl.system.Checks.checkNT1(r0)
        La:
            r0 = r4
            r1 = r5
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            int r0 = nglGetUniformLocationARB(r0, r1)
            return r0
    }

    @org.lwjgl.system.NativeType("GLint")
    public static int glGetUniformLocationARB(@org.lwjgl.system.NativeType("GLhandleARB") int r4, @org.lwjgl.system.NativeType("GLcharARB const *") java.lang.CharSequence r5) {
            org.lwjgl.system.MemoryStack r0 = org.lwjgl.system.MemoryStack.stackGet()
            r6 = r0
            r0 = r6
            int r0 = r0.getPointer()
            r7 = r0
            r0 = r6
            r1 = r5
            r2 = 1
            int r0 = r0.nUTF8(r1, r2)     // Catch: java.lang.Throwable -> L26
            r0 = r6
            long r0 = r0.getPointerAddress()     // Catch: java.lang.Throwable -> L26
            r8 = r0
            r0 = r4
            r1 = r8
            int r0 = nglGetUniformLocationARB(r0, r1)     // Catch: java.lang.Throwable -> L26
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

    public static native void nglGetActiveUniformARB(int r0, int r1, int r2, long r3, long r5, long r7, long r9);

    public static void glGetActiveUniformARB(@org.lwjgl.system.NativeType("GLhandleARB") int r12, @org.lwjgl.system.NativeType("GLuint") int r13, @javax.annotation.Nullable @org.lwjgl.system.NativeType("GLsizei *") java.nio.IntBuffer r14, @org.lwjgl.system.NativeType("GLint *") java.nio.IntBuffer r15, @org.lwjgl.system.NativeType("GLenum *") java.nio.IntBuffer r16, @org.lwjgl.system.NativeType("GLcharARB *") java.nio.ByteBuffer r17) {
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
            nglGetActiveUniformARB(r0, r1, r2, r3, r4, r5, r6)
            return
    }

    @org.lwjgl.system.NativeType("void")
    public static java.lang.String glGetActiveUniformARB(@org.lwjgl.system.NativeType("GLhandleARB") int r12, @org.lwjgl.system.NativeType("GLuint") int r13, @org.lwjgl.system.NativeType("GLsizei") int r14, @org.lwjgl.system.NativeType("GLint *") java.nio.IntBuffer r15, @org.lwjgl.system.NativeType("GLenum *") java.nio.IntBuffer r16) {
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
            nglGetActiveUniformARB(r0, r1, r2, r3, r4, r5, r6)     // Catch: java.lang.Throwable -> L5d
            r0 = r20
            r1 = r19
            r2 = 0
            int r1 = r1.get(r2)     // Catch: java.lang.Throwable -> L5d
            java.lang.String r0 = org.lwjgl.system.MemoryUtil.memUTF8(r0, r1)     // Catch: java.lang.Throwable -> L5d
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
    public static java.lang.String glGetActiveUniformARB(@org.lwjgl.system.NativeType("GLhandleARB") int r6, @org.lwjgl.system.NativeType("GLuint") int r7, @org.lwjgl.system.NativeType("GLint *") java.nio.IntBuffer r8, @org.lwjgl.system.NativeType("GLenum *") java.nio.IntBuffer r9) {
            r0 = r6
            r1 = r7
            r2 = r6
            r3 = 35719(0x8b87, float:5.0053E-41)
            int r2 = glGetObjectParameteriARB(r2, r3)
            r3 = r8
            r4 = r9
            java.lang.String r0 = glGetActiveUniformARB(r0, r1, r2, r3, r4)
            return r0
    }

    public static native void nglGetUniformfvARB(int r0, int r1, long r2);

    public static void glGetUniformfvARB(@org.lwjgl.system.NativeType("GLhandleARB") int r5, @org.lwjgl.system.NativeType("GLint") int r6, @org.lwjgl.system.NativeType("GLfloat *") java.nio.FloatBuffer r7) {
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
            nglGetUniformfvARB(r0, r1, r2)
            return
    }

    @org.lwjgl.system.NativeType("void")
    public static float glGetUniformfARB(@org.lwjgl.system.NativeType("GLhandleARB") int r5, @org.lwjgl.system.NativeType("GLint") int r6) {
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
            nglGetUniformfvARB(r0, r1, r2)     // Catch: java.lang.Throwable -> L2a
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

    public static native void nglGetUniformivARB(int r0, int r1, long r2);

    public static void glGetUniformivARB(@org.lwjgl.system.NativeType("GLhandleARB") int r5, @org.lwjgl.system.NativeType("GLint") int r6, @org.lwjgl.system.NativeType("GLint *") java.nio.IntBuffer r7) {
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
            nglGetUniformivARB(r0, r1, r2)
            return
    }

    @org.lwjgl.system.NativeType("void")
    public static int glGetUniformiARB(@org.lwjgl.system.NativeType("GLhandleARB") int r5, @org.lwjgl.system.NativeType("GLint") int r6) {
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
            nglGetUniformivARB(r0, r1, r2)     // Catch: java.lang.Throwable -> L2a
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

    public static native void nglGetShaderSourceARB(int r0, int r1, long r2, long r4);

    public static void glGetShaderSourceARB(@org.lwjgl.system.NativeType("GLhandleARB") int r7, @javax.annotation.Nullable @org.lwjgl.system.NativeType("GLsizei *") java.nio.IntBuffer r8, @org.lwjgl.system.NativeType("GLcharARB *") java.nio.ByteBuffer r9) {
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
            nglGetShaderSourceARB(r0, r1, r2, r3)
            return
    }

    @org.lwjgl.system.NativeType("void")
    public static java.lang.String glGetShaderSourceARB(@org.lwjgl.system.NativeType("GLhandleARB") int r7, @org.lwjgl.system.NativeType("GLsizei") int r8) {
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
            nglGetShaderSourceARB(r0, r1, r2, r3)     // Catch: java.lang.Throwable -> L3f
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
    public static java.lang.String glGetShaderSourceARB(@org.lwjgl.system.NativeType("GLhandleARB") int r4) {
            r0 = r4
            r1 = r4
            r2 = 35720(0x8b88, float:5.0054E-41)
            int r1 = glGetObjectParameteriARB(r1, r2)
            java.lang.String r0 = glGetShaderSourceARB(r0, r1)
            return r0
    }

    public static void glShaderSourceARB(@org.lwjgl.system.NativeType("GLhandleARB") int r8, @org.lwjgl.system.NativeType("GLcharARB const **") org.lwjgl.PointerBuffer r9, @javax.annotation.Nullable @org.lwjgl.system.NativeType("GLint const *") int[] r10) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glShaderSourceARB
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

    public static void glUniform1fvARB(@org.lwjgl.system.NativeType("GLint") int r6, @org.lwjgl.system.NativeType("GLfloat const *") float[] r7) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glUniform1fvARB
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

    public static void glUniform2fvARB(@org.lwjgl.system.NativeType("GLint") int r6, @org.lwjgl.system.NativeType("GLfloat const *") float[] r7) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glUniform2fvARB
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

    public static void glUniform3fvARB(@org.lwjgl.system.NativeType("GLint") int r6, @org.lwjgl.system.NativeType("GLfloat const *") float[] r7) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glUniform3fvARB
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

    public static void glUniform4fvARB(@org.lwjgl.system.NativeType("GLint") int r6, @org.lwjgl.system.NativeType("GLfloat const *") float[] r7) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glUniform4fvARB
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

    public static void glUniform1ivARB(@org.lwjgl.system.NativeType("GLint") int r6, @org.lwjgl.system.NativeType("GLint const *") int[] r7) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glUniform1ivARB
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

    public static void glUniform2ivARB(@org.lwjgl.system.NativeType("GLint") int r6, @org.lwjgl.system.NativeType("GLint const *") int[] r7) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glUniform2ivARB
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

    public static void glUniform3ivARB(@org.lwjgl.system.NativeType("GLint") int r6, @org.lwjgl.system.NativeType("GLint const *") int[] r7) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glUniform3ivARB
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

    public static void glUniform4ivARB(@org.lwjgl.system.NativeType("GLint") int r6, @org.lwjgl.system.NativeType("GLint const *") int[] r7) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glUniform4ivARB
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

    public static void glUniformMatrix2fvARB(@org.lwjgl.system.NativeType("GLint") int r7, @org.lwjgl.system.NativeType("GLboolean") boolean r8, @org.lwjgl.system.NativeType("GLfloat const *") float[] r9) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glUniformMatrix2fvARB
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

    public static void glUniformMatrix3fvARB(@org.lwjgl.system.NativeType("GLint") int r7, @org.lwjgl.system.NativeType("GLboolean") boolean r8, @org.lwjgl.system.NativeType("GLfloat const *") float[] r9) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glUniformMatrix3fvARB
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

    public static void glUniformMatrix4fvARB(@org.lwjgl.system.NativeType("GLint") int r7, @org.lwjgl.system.NativeType("GLboolean") boolean r8, @org.lwjgl.system.NativeType("GLfloat const *") float[] r9) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glUniformMatrix4fvARB
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

    public static void glGetObjectParameterfvARB(@org.lwjgl.system.NativeType("GLhandleARB") int r6, @org.lwjgl.system.NativeType("GLenum") int r7, @org.lwjgl.system.NativeType("GLfloat *") float[] r8) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glGetObjectParameterfvARB
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

    public static void glGetObjectParameterivARB(@org.lwjgl.system.NativeType("GLhandleARB") int r6, @org.lwjgl.system.NativeType("GLenum") int r7, @org.lwjgl.system.NativeType("GLint *") int[] r8) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glGetObjectParameterivARB
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

    public static void glGetInfoLogARB(@org.lwjgl.system.NativeType("GLhandleARB") int r8, @javax.annotation.Nullable @org.lwjgl.system.NativeType("GLsizei *") int[] r9, @org.lwjgl.system.NativeType("GLcharARB *") java.nio.ByteBuffer r10) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glGetInfoLogARB
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

    public static void glGetAttachedObjectsARB(@org.lwjgl.system.NativeType("GLhandleARB") int r7, @javax.annotation.Nullable @org.lwjgl.system.NativeType("GLsizei *") int[] r8, @org.lwjgl.system.NativeType("GLhandleARB *") int[] r9) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glGetAttachedObjectsARB
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

    public static void glGetActiveUniformARB(@org.lwjgl.system.NativeType("GLhandleARB") int r11, @org.lwjgl.system.NativeType("GLuint") int r12, @javax.annotation.Nullable @org.lwjgl.system.NativeType("GLsizei *") int[] r13, @org.lwjgl.system.NativeType("GLint *") int[] r14, @org.lwjgl.system.NativeType("GLenum *") int[] r15, @org.lwjgl.system.NativeType("GLcharARB *") java.nio.ByteBuffer r16) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glGetActiveUniformARB
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

    public static void glGetUniformfvARB(@org.lwjgl.system.NativeType("GLhandleARB") int r6, @org.lwjgl.system.NativeType("GLint") int r7, @org.lwjgl.system.NativeType("GLfloat *") float[] r8) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glGetUniformfvARB
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

    public static void glGetUniformivARB(@org.lwjgl.system.NativeType("GLhandleARB") int r6, @org.lwjgl.system.NativeType("GLint") int r7, @org.lwjgl.system.NativeType("GLint *") int[] r8) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glGetUniformivARB
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

    public static void glGetShaderSourceARB(@org.lwjgl.system.NativeType("GLhandleARB") int r8, @javax.annotation.Nullable @org.lwjgl.system.NativeType("GLsizei *") int[] r9, @org.lwjgl.system.NativeType("GLcharARB *") java.nio.ByteBuffer r10) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glGetShaderSourceARB
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

    static {
            org.lwjgl.opengl.GL.initialize()
            return
    }
}
