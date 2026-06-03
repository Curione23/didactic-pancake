package org.lwjgl.opengl;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/opengl/ARBShaderSubroutine.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/opengl/ARBShaderSubroutine.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/opengl/ARBShaderSubroutine.class */
public class ARBShaderSubroutine {
    public static final int GL_ACTIVE_SUBROUTINES = 36325;
    public static final int GL_ACTIVE_SUBROUTINE_UNIFORMS = 36326;
    public static final int GL_ACTIVE_SUBROUTINE_UNIFORM_LOCATIONS = 36423;
    public static final int GL_ACTIVE_SUBROUTINE_MAX_LENGTH = 36424;
    public static final int GL_ACTIVE_SUBROUTINE_UNIFORM_MAX_LENGTH = 36425;
    public static final int GL_MAX_SUBROUTINES = 36327;
    public static final int GL_MAX_SUBROUTINE_UNIFORM_LOCATIONS = 36328;
    public static final int GL_NUM_COMPATIBLE_SUBROUTINES = 36426;
    public static final int GL_COMPATIBLE_SUBROUTINES = 36427;

    protected ARBShaderSubroutine() {
            r3 = this;
            r0 = r3
            r0.<init>()
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r1 = r0
            r1.<init>()
            throw r0
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

    static {
            org.lwjgl.opengl.GL.initialize()
            return
    }
}
