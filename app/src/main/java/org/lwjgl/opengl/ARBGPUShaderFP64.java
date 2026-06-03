package org.lwjgl.opengl;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/opengl/ARBGPUShaderFP64.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/opengl/ARBGPUShaderFP64.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/opengl/ARBGPUShaderFP64.class */
public class ARBGPUShaderFP64 {
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

    protected ARBGPUShaderFP64() {
            r3 = this;
            r0 = r3
            r0.<init>()
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r1 = r0
            r1.<init>()
            throw r0
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

    public static native void glProgramUniform1dEXT(@org.lwjgl.system.NativeType("GLuint") int r0, @org.lwjgl.system.NativeType("GLint") int r1, @org.lwjgl.system.NativeType("GLdouble") double r2);

    public static native void glProgramUniform2dEXT(@org.lwjgl.system.NativeType("GLuint") int r0, @org.lwjgl.system.NativeType("GLint") int r1, @org.lwjgl.system.NativeType("GLdouble") double r2, @org.lwjgl.system.NativeType("GLdouble") double r4);

    public static native void glProgramUniform3dEXT(@org.lwjgl.system.NativeType("GLuint") int r0, @org.lwjgl.system.NativeType("GLint") int r1, @org.lwjgl.system.NativeType("GLdouble") double r2, @org.lwjgl.system.NativeType("GLdouble") double r4, @org.lwjgl.system.NativeType("GLdouble") double r6);

    public static native void glProgramUniform4dEXT(@org.lwjgl.system.NativeType("GLuint") int r0, @org.lwjgl.system.NativeType("GLint") int r1, @org.lwjgl.system.NativeType("GLdouble") double r2, @org.lwjgl.system.NativeType("GLdouble") double r4, @org.lwjgl.system.NativeType("GLdouble") double r6, @org.lwjgl.system.NativeType("GLdouble") double r8);

    public static native void nglProgramUniform1dvEXT(int r0, int r1, int r2, long r3);

    public static void glProgramUniform1dvEXT(@org.lwjgl.system.NativeType("GLuint") int r6, @org.lwjgl.system.NativeType("GLint") int r7, @org.lwjgl.system.NativeType("GLdouble const *") java.nio.DoubleBuffer r8) {
            r0 = r6
            r1 = r7
            r2 = r8
            int r2 = r2.remaining()
            r3 = r8
            long r3 = org.lwjgl.system.MemoryUtil.memAddress(r3)
            nglProgramUniform1dvEXT(r0, r1, r2, r3)
            return
    }

    public static native void nglProgramUniform2dvEXT(int r0, int r1, int r2, long r3);

    public static void glProgramUniform2dvEXT(@org.lwjgl.system.NativeType("GLuint") int r6, @org.lwjgl.system.NativeType("GLint") int r7, @org.lwjgl.system.NativeType("GLdouble const *") java.nio.DoubleBuffer r8) {
            r0 = r6
            r1 = r7
            r2 = r8
            int r2 = r2.remaining()
            r3 = 1
            int r2 = r2 >> r3
            r3 = r8
            long r3 = org.lwjgl.system.MemoryUtil.memAddress(r3)
            nglProgramUniform2dvEXT(r0, r1, r2, r3)
            return
    }

    public static native void nglProgramUniform3dvEXT(int r0, int r1, int r2, long r3);

    public static void glProgramUniform3dvEXT(@org.lwjgl.system.NativeType("GLuint") int r6, @org.lwjgl.system.NativeType("GLint") int r7, @org.lwjgl.system.NativeType("GLdouble const *") java.nio.DoubleBuffer r8) {
            r0 = r6
            r1 = r7
            r2 = r8
            int r2 = r2.remaining()
            r3 = 3
            int r2 = r2 / r3
            r3 = r8
            long r3 = org.lwjgl.system.MemoryUtil.memAddress(r3)
            nglProgramUniform3dvEXT(r0, r1, r2, r3)
            return
    }

    public static native void nglProgramUniform4dvEXT(int r0, int r1, int r2, long r3);

    public static void glProgramUniform4dvEXT(@org.lwjgl.system.NativeType("GLuint") int r6, @org.lwjgl.system.NativeType("GLint") int r7, @org.lwjgl.system.NativeType("GLdouble const *") java.nio.DoubleBuffer r8) {
            r0 = r6
            r1 = r7
            r2 = r8
            int r2 = r2.remaining()
            r3 = 2
            int r2 = r2 >> r3
            r3 = r8
            long r3 = org.lwjgl.system.MemoryUtil.memAddress(r3)
            nglProgramUniform4dvEXT(r0, r1, r2, r3)
            return
    }

    public static native void nglProgramUniformMatrix2dvEXT(int r0, int r1, int r2, boolean r3, long r4);

    public static void glProgramUniformMatrix2dvEXT(@org.lwjgl.system.NativeType("GLuint") int r7, @org.lwjgl.system.NativeType("GLint") int r8, @org.lwjgl.system.NativeType("GLboolean") boolean r9, @org.lwjgl.system.NativeType("GLdouble const *") java.nio.DoubleBuffer r10) {
            r0 = r7
            r1 = r8
            r2 = r10
            int r2 = r2.remaining()
            r3 = 2
            int r2 = r2 >> r3
            r3 = r9
            r4 = r10
            long r4 = org.lwjgl.system.MemoryUtil.memAddress(r4)
            nglProgramUniformMatrix2dvEXT(r0, r1, r2, r3, r4)
            return
    }

    public static native void nglProgramUniformMatrix3dvEXT(int r0, int r1, int r2, boolean r3, long r4);

    public static void glProgramUniformMatrix3dvEXT(@org.lwjgl.system.NativeType("GLuint") int r7, @org.lwjgl.system.NativeType("GLint") int r8, @org.lwjgl.system.NativeType("GLboolean") boolean r9, @org.lwjgl.system.NativeType("GLdouble const *") java.nio.DoubleBuffer r10) {
            r0 = r7
            r1 = r8
            r2 = r10
            int r2 = r2.remaining()
            r3 = 9
            int r2 = r2 / r3
            r3 = r9
            r4 = r10
            long r4 = org.lwjgl.system.MemoryUtil.memAddress(r4)
            nglProgramUniformMatrix3dvEXT(r0, r1, r2, r3, r4)
            return
    }

    public static native void nglProgramUniformMatrix4dvEXT(int r0, int r1, int r2, boolean r3, long r4);

    public static void glProgramUniformMatrix4dvEXT(@org.lwjgl.system.NativeType("GLuint") int r7, @org.lwjgl.system.NativeType("GLint") int r8, @org.lwjgl.system.NativeType("GLboolean") boolean r9, @org.lwjgl.system.NativeType("GLdouble const *") java.nio.DoubleBuffer r10) {
            r0 = r7
            r1 = r8
            r2 = r10
            int r2 = r2.remaining()
            r3 = 4
            int r2 = r2 >> r3
            r3 = r9
            r4 = r10
            long r4 = org.lwjgl.system.MemoryUtil.memAddress(r4)
            nglProgramUniformMatrix4dvEXT(r0, r1, r2, r3, r4)
            return
    }

    public static native void nglProgramUniformMatrix2x3dvEXT(int r0, int r1, int r2, boolean r3, long r4);

    public static void glProgramUniformMatrix2x3dvEXT(@org.lwjgl.system.NativeType("GLuint") int r7, @org.lwjgl.system.NativeType("GLint") int r8, @org.lwjgl.system.NativeType("GLboolean") boolean r9, @org.lwjgl.system.NativeType("GLdouble const *") java.nio.DoubleBuffer r10) {
            r0 = r7
            r1 = r8
            r2 = r10
            int r2 = r2.remaining()
            r3 = 6
            int r2 = r2 / r3
            r3 = r9
            r4 = r10
            long r4 = org.lwjgl.system.MemoryUtil.memAddress(r4)
            nglProgramUniformMatrix2x3dvEXT(r0, r1, r2, r3, r4)
            return
    }

    public static native void nglProgramUniformMatrix2x4dvEXT(int r0, int r1, int r2, boolean r3, long r4);

    public static void glProgramUniformMatrix2x4dvEXT(@org.lwjgl.system.NativeType("GLuint") int r7, @org.lwjgl.system.NativeType("GLint") int r8, @org.lwjgl.system.NativeType("GLboolean") boolean r9, @org.lwjgl.system.NativeType("GLdouble const *") java.nio.DoubleBuffer r10) {
            r0 = r7
            r1 = r8
            r2 = r10
            int r2 = r2.remaining()
            r3 = 3
            int r2 = r2 >> r3
            r3 = r9
            r4 = r10
            long r4 = org.lwjgl.system.MemoryUtil.memAddress(r4)
            nglProgramUniformMatrix2x4dvEXT(r0, r1, r2, r3, r4)
            return
    }

    public static native void nglProgramUniformMatrix3x2dvEXT(int r0, int r1, int r2, boolean r3, long r4);

    public static void glProgramUniformMatrix3x2dvEXT(@org.lwjgl.system.NativeType("GLuint") int r7, @org.lwjgl.system.NativeType("GLint") int r8, @org.lwjgl.system.NativeType("GLboolean") boolean r9, @org.lwjgl.system.NativeType("GLdouble const *") java.nio.DoubleBuffer r10) {
            r0 = r7
            r1 = r8
            r2 = r10
            int r2 = r2.remaining()
            r3 = 6
            int r2 = r2 / r3
            r3 = r9
            r4 = r10
            long r4 = org.lwjgl.system.MemoryUtil.memAddress(r4)
            nglProgramUniformMatrix3x2dvEXT(r0, r1, r2, r3, r4)
            return
    }

    public static native void nglProgramUniformMatrix3x4dvEXT(int r0, int r1, int r2, boolean r3, long r4);

    public static void glProgramUniformMatrix3x4dvEXT(@org.lwjgl.system.NativeType("GLuint") int r7, @org.lwjgl.system.NativeType("GLint") int r8, @org.lwjgl.system.NativeType("GLboolean") boolean r9, @org.lwjgl.system.NativeType("GLdouble const *") java.nio.DoubleBuffer r10) {
            r0 = r7
            r1 = r8
            r2 = r10
            int r2 = r2.remaining()
            r3 = 12
            int r2 = r2 / r3
            r3 = r9
            r4 = r10
            long r4 = org.lwjgl.system.MemoryUtil.memAddress(r4)
            nglProgramUniformMatrix3x4dvEXT(r0, r1, r2, r3, r4)
            return
    }

    public static native void nglProgramUniformMatrix4x2dvEXT(int r0, int r1, int r2, boolean r3, long r4);

    public static void glProgramUniformMatrix4x2dvEXT(@org.lwjgl.system.NativeType("GLuint") int r7, @org.lwjgl.system.NativeType("GLint") int r8, @org.lwjgl.system.NativeType("GLboolean") boolean r9, @org.lwjgl.system.NativeType("GLdouble const *") java.nio.DoubleBuffer r10) {
            r0 = r7
            r1 = r8
            r2 = r10
            int r2 = r2.remaining()
            r3 = 3
            int r2 = r2 >> r3
            r3 = r9
            r4 = r10
            long r4 = org.lwjgl.system.MemoryUtil.memAddress(r4)
            nglProgramUniformMatrix4x2dvEXT(r0, r1, r2, r3, r4)
            return
    }

    public static native void nglProgramUniformMatrix4x3dvEXT(int r0, int r1, int r2, boolean r3, long r4);

    public static void glProgramUniformMatrix4x3dvEXT(@org.lwjgl.system.NativeType("GLuint") int r7, @org.lwjgl.system.NativeType("GLint") int r8, @org.lwjgl.system.NativeType("GLboolean") boolean r9, @org.lwjgl.system.NativeType("GLdouble const *") java.nio.DoubleBuffer r10) {
            r0 = r7
            r1 = r8
            r2 = r10
            int r2 = r2.remaining()
            r3 = 12
            int r2 = r2 / r3
            r3 = r9
            r4 = r10
            long r4 = org.lwjgl.system.MemoryUtil.memAddress(r4)
            nglProgramUniformMatrix4x3dvEXT(r0, r1, r2, r3, r4)
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

    public static void glProgramUniform1dvEXT(@org.lwjgl.system.NativeType("GLuint") int r7, @org.lwjgl.system.NativeType("GLint") int r8, @org.lwjgl.system.NativeType("GLdouble const *") double[] r9) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glProgramUniform1dvEXT
            r10 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L12
            r0 = r10
            long r0 = org.lwjgl.system.Checks.check(r0)
        L12:
            r0 = r7
            r1 = r8
            r2 = r9
            int r2 = r2.length
            r3 = r9
            r4 = r10
            org.lwjgl.system.JNI.callPV(r0, r1, r2, r3, r4)
            return
    }

    public static void glProgramUniform2dvEXT(@org.lwjgl.system.NativeType("GLuint") int r7, @org.lwjgl.system.NativeType("GLint") int r8, @org.lwjgl.system.NativeType("GLdouble const *") double[] r9) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glProgramUniform2dvEXT
            r10 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L12
            r0 = r10
            long r0 = org.lwjgl.system.Checks.check(r0)
        L12:
            r0 = r7
            r1 = r8
            r2 = r9
            int r2 = r2.length
            r3 = 1
            int r2 = r2 >> r3
            r3 = r9
            r4 = r10
            org.lwjgl.system.JNI.callPV(r0, r1, r2, r3, r4)
            return
    }

    public static void glProgramUniform3dvEXT(@org.lwjgl.system.NativeType("GLuint") int r7, @org.lwjgl.system.NativeType("GLint") int r8, @org.lwjgl.system.NativeType("GLdouble const *") double[] r9) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glProgramUniform3dvEXT
            r10 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L12
            r0 = r10
            long r0 = org.lwjgl.system.Checks.check(r0)
        L12:
            r0 = r7
            r1 = r8
            r2 = r9
            int r2 = r2.length
            r3 = 3
            int r2 = r2 / r3
            r3 = r9
            r4 = r10
            org.lwjgl.system.JNI.callPV(r0, r1, r2, r3, r4)
            return
    }

    public static void glProgramUniform4dvEXT(@org.lwjgl.system.NativeType("GLuint") int r7, @org.lwjgl.system.NativeType("GLint") int r8, @org.lwjgl.system.NativeType("GLdouble const *") double[] r9) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glProgramUniform4dvEXT
            r10 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L12
            r0 = r10
            long r0 = org.lwjgl.system.Checks.check(r0)
        L12:
            r0 = r7
            r1 = r8
            r2 = r9
            int r2 = r2.length
            r3 = 2
            int r2 = r2 >> r3
            r3 = r9
            r4 = r10
            org.lwjgl.system.JNI.callPV(r0, r1, r2, r3, r4)
            return
    }

    public static void glProgramUniformMatrix2dvEXT(@org.lwjgl.system.NativeType("GLuint") int r8, @org.lwjgl.system.NativeType("GLint") int r9, @org.lwjgl.system.NativeType("GLboolean") boolean r10, @org.lwjgl.system.NativeType("GLdouble const *") double[] r11) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glProgramUniformMatrix2dvEXT
            r12 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L14
            r0 = r12
            long r0 = org.lwjgl.system.Checks.check(r0)
        L14:
            r0 = r8
            r1 = r9
            r2 = r11
            int r2 = r2.length
            r3 = 2
            int r2 = r2 >> r3
            r3 = r10
            r4 = r11
            r5 = r12
            org.lwjgl.system.JNI.callPV(r0, r1, r2, r3, r4, r5)
            return
    }

    public static void glProgramUniformMatrix3dvEXT(@org.lwjgl.system.NativeType("GLuint") int r8, @org.lwjgl.system.NativeType("GLint") int r9, @org.lwjgl.system.NativeType("GLboolean") boolean r10, @org.lwjgl.system.NativeType("GLdouble const *") double[] r11) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glProgramUniformMatrix3dvEXT
            r12 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L14
            r0 = r12
            long r0 = org.lwjgl.system.Checks.check(r0)
        L14:
            r0 = r8
            r1 = r9
            r2 = r11
            int r2 = r2.length
            r3 = 9
            int r2 = r2 / r3
            r3 = r10
            r4 = r11
            r5 = r12
            org.lwjgl.system.JNI.callPV(r0, r1, r2, r3, r4, r5)
            return
    }

    public static void glProgramUniformMatrix4dvEXT(@org.lwjgl.system.NativeType("GLuint") int r8, @org.lwjgl.system.NativeType("GLint") int r9, @org.lwjgl.system.NativeType("GLboolean") boolean r10, @org.lwjgl.system.NativeType("GLdouble const *") double[] r11) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glProgramUniformMatrix4dvEXT
            r12 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L14
            r0 = r12
            long r0 = org.lwjgl.system.Checks.check(r0)
        L14:
            r0 = r8
            r1 = r9
            r2 = r11
            int r2 = r2.length
            r3 = 4
            int r2 = r2 >> r3
            r3 = r10
            r4 = r11
            r5 = r12
            org.lwjgl.system.JNI.callPV(r0, r1, r2, r3, r4, r5)
            return
    }

    public static void glProgramUniformMatrix2x3dvEXT(@org.lwjgl.system.NativeType("GLuint") int r8, @org.lwjgl.system.NativeType("GLint") int r9, @org.lwjgl.system.NativeType("GLboolean") boolean r10, @org.lwjgl.system.NativeType("GLdouble const *") double[] r11) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glProgramUniformMatrix2x3dvEXT
            r12 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L14
            r0 = r12
            long r0 = org.lwjgl.system.Checks.check(r0)
        L14:
            r0 = r8
            r1 = r9
            r2 = r11
            int r2 = r2.length
            r3 = 6
            int r2 = r2 / r3
            r3 = r10
            r4 = r11
            r5 = r12
            org.lwjgl.system.JNI.callPV(r0, r1, r2, r3, r4, r5)
            return
    }

    public static void glProgramUniformMatrix2x4dvEXT(@org.lwjgl.system.NativeType("GLuint") int r8, @org.lwjgl.system.NativeType("GLint") int r9, @org.lwjgl.system.NativeType("GLboolean") boolean r10, @org.lwjgl.system.NativeType("GLdouble const *") double[] r11) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glProgramUniformMatrix2x4dvEXT
            r12 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L14
            r0 = r12
            long r0 = org.lwjgl.system.Checks.check(r0)
        L14:
            r0 = r8
            r1 = r9
            r2 = r11
            int r2 = r2.length
            r3 = 3
            int r2 = r2 >> r3
            r3 = r10
            r4 = r11
            r5 = r12
            org.lwjgl.system.JNI.callPV(r0, r1, r2, r3, r4, r5)
            return
    }

    public static void glProgramUniformMatrix3x2dvEXT(@org.lwjgl.system.NativeType("GLuint") int r8, @org.lwjgl.system.NativeType("GLint") int r9, @org.lwjgl.system.NativeType("GLboolean") boolean r10, @org.lwjgl.system.NativeType("GLdouble const *") double[] r11) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glProgramUniformMatrix3x2dvEXT
            r12 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L14
            r0 = r12
            long r0 = org.lwjgl.system.Checks.check(r0)
        L14:
            r0 = r8
            r1 = r9
            r2 = r11
            int r2 = r2.length
            r3 = 6
            int r2 = r2 / r3
            r3 = r10
            r4 = r11
            r5 = r12
            org.lwjgl.system.JNI.callPV(r0, r1, r2, r3, r4, r5)
            return
    }

    public static void glProgramUniformMatrix3x4dvEXT(@org.lwjgl.system.NativeType("GLuint") int r8, @org.lwjgl.system.NativeType("GLint") int r9, @org.lwjgl.system.NativeType("GLboolean") boolean r10, @org.lwjgl.system.NativeType("GLdouble const *") double[] r11) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glProgramUniformMatrix3x4dvEXT
            r12 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L14
            r0 = r12
            long r0 = org.lwjgl.system.Checks.check(r0)
        L14:
            r0 = r8
            r1 = r9
            r2 = r11
            int r2 = r2.length
            r3 = 12
            int r2 = r2 / r3
            r3 = r10
            r4 = r11
            r5 = r12
            org.lwjgl.system.JNI.callPV(r0, r1, r2, r3, r4, r5)
            return
    }

    public static void glProgramUniformMatrix4x2dvEXT(@org.lwjgl.system.NativeType("GLuint") int r8, @org.lwjgl.system.NativeType("GLint") int r9, @org.lwjgl.system.NativeType("GLboolean") boolean r10, @org.lwjgl.system.NativeType("GLdouble const *") double[] r11) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glProgramUniformMatrix4x2dvEXT
            r12 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L14
            r0 = r12
            long r0 = org.lwjgl.system.Checks.check(r0)
        L14:
            r0 = r8
            r1 = r9
            r2 = r11
            int r2 = r2.length
            r3 = 3
            int r2 = r2 >> r3
            r3 = r10
            r4 = r11
            r5 = r12
            org.lwjgl.system.JNI.callPV(r0, r1, r2, r3, r4, r5)
            return
    }

    public static void glProgramUniformMatrix4x3dvEXT(@org.lwjgl.system.NativeType("GLuint") int r8, @org.lwjgl.system.NativeType("GLint") int r9, @org.lwjgl.system.NativeType("GLboolean") boolean r10, @org.lwjgl.system.NativeType("GLdouble const *") double[] r11) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glProgramUniformMatrix4x3dvEXT
            r12 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L14
            r0 = r12
            long r0 = org.lwjgl.system.Checks.check(r0)
        L14:
            r0 = r8
            r1 = r9
            r2 = r11
            int r2 = r2.length
            r3 = 12
            int r2 = r2 / r3
            r3 = r10
            r4 = r11
            r5 = r12
            org.lwjgl.system.JNI.callPV(r0, r1, r2, r3, r4, r5)
            return
    }

    static {
            org.lwjgl.opengl.GL.initialize()
            return
    }
}
