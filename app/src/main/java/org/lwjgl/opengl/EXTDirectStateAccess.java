package org.lwjgl.opengl;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/opengl/EXTDirectStateAccess.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/opengl/EXTDirectStateAccess.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/opengl/EXTDirectStateAccess.class */
public class EXTDirectStateAccess {
    public static final int GL_PROGRAM_MATRIX_EXT = 36397;
    public static final int GL_TRANSPOSE_PROGRAM_MATRIX_EXT = 36398;
    public static final int GL_PROGRAM_MATRIX_STACK_DEPTH_EXT = 36399;

    protected EXTDirectStateAccess() {
            r3 = this;
            r0 = r3
            r0.<init>()
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r1 = r0
            r1.<init>()
            throw r0
    }

    public static native void glClientAttribDefaultEXT(@org.lwjgl.system.NativeType("GLbitfield") int r0);

    public static native void glPushClientAttribDefaultEXT(@org.lwjgl.system.NativeType("GLbitfield") int r0);

    public static native void nglMatrixLoadfEXT(int r0, long r1);

    public static void glMatrixLoadfEXT(@org.lwjgl.system.NativeType("GLenum") int r4, @org.lwjgl.system.NativeType("GLfloat const *") java.nio.FloatBuffer r5) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lc
            r0 = r5
            r1 = 16
            org.lwjgl.system.Checks.check(r0, r1)
        Lc:
            r0 = r4
            r1 = r5
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            nglMatrixLoadfEXT(r0, r1)
            return
    }

    public static native void nglMatrixLoaddEXT(int r0, long r1);

    public static void glMatrixLoaddEXT(@org.lwjgl.system.NativeType("GLenum") int r4, @org.lwjgl.system.NativeType("GLdouble const *") java.nio.DoubleBuffer r5) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lc
            r0 = r5
            r1 = 16
            org.lwjgl.system.Checks.check(r0, r1)
        Lc:
            r0 = r4
            r1 = r5
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            nglMatrixLoaddEXT(r0, r1)
            return
    }

    public static native void nglMatrixMultfEXT(int r0, long r1);

    public static void glMatrixMultfEXT(@org.lwjgl.system.NativeType("GLenum") int r4, @org.lwjgl.system.NativeType("GLfloat const *") java.nio.FloatBuffer r5) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lc
            r0 = r5
            r1 = 16
            org.lwjgl.system.Checks.check(r0, r1)
        Lc:
            r0 = r4
            r1 = r5
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            nglMatrixMultfEXT(r0, r1)
            return
    }

    public static native void nglMatrixMultdEXT(int r0, long r1);

    public static void glMatrixMultdEXT(@org.lwjgl.system.NativeType("GLenum") int r4, @org.lwjgl.system.NativeType("GLdouble const *") java.nio.DoubleBuffer r5) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lc
            r0 = r5
            r1 = 16
            org.lwjgl.system.Checks.check(r0, r1)
        Lc:
            r0 = r4
            r1 = r5
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            nglMatrixMultdEXT(r0, r1)
            return
    }

    public static native void glMatrixLoadIdentityEXT(@org.lwjgl.system.NativeType("GLenum") int r0);

    public static native void glMatrixRotatefEXT(@org.lwjgl.system.NativeType("GLenum") int r0, @org.lwjgl.system.NativeType("GLfloat") float r1, @org.lwjgl.system.NativeType("GLfloat") float r2, @org.lwjgl.system.NativeType("GLfloat") float r3, @org.lwjgl.system.NativeType("GLfloat") float r4);

    public static native void glMatrixRotatedEXT(@org.lwjgl.system.NativeType("GLenum") int r0, @org.lwjgl.system.NativeType("GLdouble") double r1, @org.lwjgl.system.NativeType("GLdouble") double r3, @org.lwjgl.system.NativeType("GLdouble") double r5, @org.lwjgl.system.NativeType("GLdouble") double r7);

    public static native void glMatrixScalefEXT(@org.lwjgl.system.NativeType("GLenum") int r0, @org.lwjgl.system.NativeType("GLfloat") float r1, @org.lwjgl.system.NativeType("GLfloat") float r2, @org.lwjgl.system.NativeType("GLfloat") float r3);

    public static native void glMatrixScaledEXT(@org.lwjgl.system.NativeType("GLenum") int r0, @org.lwjgl.system.NativeType("GLdouble") double r1, @org.lwjgl.system.NativeType("GLdouble") double r3, @org.lwjgl.system.NativeType("GLdouble") double r5);

    public static native void glMatrixTranslatefEXT(@org.lwjgl.system.NativeType("GLenum") int r0, @org.lwjgl.system.NativeType("GLfloat") float r1, @org.lwjgl.system.NativeType("GLfloat") float r2, @org.lwjgl.system.NativeType("GLfloat") float r3);

    public static native void glMatrixTranslatedEXT(@org.lwjgl.system.NativeType("GLenum") int r0, @org.lwjgl.system.NativeType("GLdouble") double r1, @org.lwjgl.system.NativeType("GLdouble") double r3, @org.lwjgl.system.NativeType("GLdouble") double r5);

    public static native void glMatrixOrthoEXT(@org.lwjgl.system.NativeType("GLenum") int r0, @org.lwjgl.system.NativeType("GLdouble") double r1, @org.lwjgl.system.NativeType("GLdouble") double r3, @org.lwjgl.system.NativeType("GLdouble") double r5, @org.lwjgl.system.NativeType("GLdouble") double r7, @org.lwjgl.system.NativeType("GLdouble") double r9, @org.lwjgl.system.NativeType("GLdouble") double r11);

    public static native void glMatrixFrustumEXT(@org.lwjgl.system.NativeType("GLenum") int r0, @org.lwjgl.system.NativeType("GLdouble") double r1, @org.lwjgl.system.NativeType("GLdouble") double r3, @org.lwjgl.system.NativeType("GLdouble") double r5, @org.lwjgl.system.NativeType("GLdouble") double r7, @org.lwjgl.system.NativeType("GLdouble") double r9, @org.lwjgl.system.NativeType("GLdouble") double r11);

    public static native void glMatrixPushEXT(@org.lwjgl.system.NativeType("GLenum") int r0);

    public static native void glMatrixPopEXT(@org.lwjgl.system.NativeType("GLenum") int r0);

    public static native void glTextureParameteriEXT(@org.lwjgl.system.NativeType("GLuint") int r0, @org.lwjgl.system.NativeType("GLenum") int r1, @org.lwjgl.system.NativeType("GLenum") int r2, @org.lwjgl.system.NativeType("GLint") int r3);

    public static native void nglTextureParameterivEXT(int r0, int r1, int r2, long r3);

    public static void glTextureParameterivEXT(@org.lwjgl.system.NativeType("GLuint") int r6, @org.lwjgl.system.NativeType("GLenum") int r7, @org.lwjgl.system.NativeType("GLenum") int r8, @org.lwjgl.system.NativeType("GLint const *") java.nio.IntBuffer r9) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r9
            r1 = 4
            org.lwjgl.system.Checks.check(r0, r1)
        Lb:
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            long r3 = org.lwjgl.system.MemoryUtil.memAddress(r3)
            nglTextureParameterivEXT(r0, r1, r2, r3)
            return
    }

    public static native void glTextureParameterfEXT(@org.lwjgl.system.NativeType("GLuint") int r0, @org.lwjgl.system.NativeType("GLenum") int r1, @org.lwjgl.system.NativeType("GLenum") int r2, @org.lwjgl.system.NativeType("GLfloat") float r3);

    public static native void nglTextureParameterfvEXT(int r0, int r1, int r2, long r3);

    public static void glTextureParameterfvEXT(@org.lwjgl.system.NativeType("GLuint") int r6, @org.lwjgl.system.NativeType("GLenum") int r7, @org.lwjgl.system.NativeType("GLenum") int r8, @org.lwjgl.system.NativeType("GLfloat const *") java.nio.FloatBuffer r9) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r9
            r1 = 4
            org.lwjgl.system.Checks.check(r0, r1)
        Lb:
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            long r3 = org.lwjgl.system.MemoryUtil.memAddress(r3)
            nglTextureParameterfvEXT(r0, r1, r2, r3)
            return
    }

    public static native void nglTextureImage1DEXT(int r0, int r1, int r2, int r3, int r4, int r5, int r6, int r7, long r8);

    public static void glTextureImage1DEXT(@org.lwjgl.system.NativeType("GLuint") int r11, @org.lwjgl.system.NativeType("GLenum") int r12, @org.lwjgl.system.NativeType("GLint") int r13, @org.lwjgl.system.NativeType("GLint") int r14, @org.lwjgl.system.NativeType("GLsizei") int r15, @org.lwjgl.system.NativeType("GLint") int r16, @org.lwjgl.system.NativeType("GLenum") int r17, @org.lwjgl.system.NativeType("GLenum") int r18, @javax.annotation.Nullable @org.lwjgl.system.NativeType("void const *") java.nio.ByteBuffer r19) {
            r0 = r11
            r1 = r12
            r2 = r13
            r3 = r14
            r4 = r15
            r5 = r16
            r6 = r17
            r7 = r18
            r8 = r19
            long r8 = org.lwjgl.system.MemoryUtil.memAddressSafe(r8)
            nglTextureImage1DEXT(r0, r1, r2, r3, r4, r5, r6, r7, r8)
            return
    }

    public static void glTextureImage1DEXT(@org.lwjgl.system.NativeType("GLuint") int r11, @org.lwjgl.system.NativeType("GLenum") int r12, @org.lwjgl.system.NativeType("GLint") int r13, @org.lwjgl.system.NativeType("GLint") int r14, @org.lwjgl.system.NativeType("GLsizei") int r15, @org.lwjgl.system.NativeType("GLint") int r16, @org.lwjgl.system.NativeType("GLenum") int r17, @org.lwjgl.system.NativeType("GLenum") int r18, @org.lwjgl.system.NativeType("void const *") long r19) {
            r0 = r11
            r1 = r12
            r2 = r13
            r3 = r14
            r4 = r15
            r5 = r16
            r6 = r17
            r7 = r18
            r8 = r19
            nglTextureImage1DEXT(r0, r1, r2, r3, r4, r5, r6, r7, r8)
            return
    }

    public static void glTextureImage1DEXT(@org.lwjgl.system.NativeType("GLuint") int r11, @org.lwjgl.system.NativeType("GLenum") int r12, @org.lwjgl.system.NativeType("GLint") int r13, @org.lwjgl.system.NativeType("GLint") int r14, @org.lwjgl.system.NativeType("GLsizei") int r15, @org.lwjgl.system.NativeType("GLint") int r16, @org.lwjgl.system.NativeType("GLenum") int r17, @org.lwjgl.system.NativeType("GLenum") int r18, @javax.annotation.Nullable @org.lwjgl.system.NativeType("void const *") java.nio.ShortBuffer r19) {
            r0 = r11
            r1 = r12
            r2 = r13
            r3 = r14
            r4 = r15
            r5 = r16
            r6 = r17
            r7 = r18
            r8 = r19
            long r8 = org.lwjgl.system.MemoryUtil.memAddressSafe(r8)
            nglTextureImage1DEXT(r0, r1, r2, r3, r4, r5, r6, r7, r8)
            return
    }

    public static void glTextureImage1DEXT(@org.lwjgl.system.NativeType("GLuint") int r11, @org.lwjgl.system.NativeType("GLenum") int r12, @org.lwjgl.system.NativeType("GLint") int r13, @org.lwjgl.system.NativeType("GLint") int r14, @org.lwjgl.system.NativeType("GLsizei") int r15, @org.lwjgl.system.NativeType("GLint") int r16, @org.lwjgl.system.NativeType("GLenum") int r17, @org.lwjgl.system.NativeType("GLenum") int r18, @javax.annotation.Nullable @org.lwjgl.system.NativeType("void const *") java.nio.IntBuffer r19) {
            r0 = r11
            r1 = r12
            r2 = r13
            r3 = r14
            r4 = r15
            r5 = r16
            r6 = r17
            r7 = r18
            r8 = r19
            long r8 = org.lwjgl.system.MemoryUtil.memAddressSafe(r8)
            nglTextureImage1DEXT(r0, r1, r2, r3, r4, r5, r6, r7, r8)
            return
    }

    public static void glTextureImage1DEXT(@org.lwjgl.system.NativeType("GLuint") int r11, @org.lwjgl.system.NativeType("GLenum") int r12, @org.lwjgl.system.NativeType("GLint") int r13, @org.lwjgl.system.NativeType("GLint") int r14, @org.lwjgl.system.NativeType("GLsizei") int r15, @org.lwjgl.system.NativeType("GLint") int r16, @org.lwjgl.system.NativeType("GLenum") int r17, @org.lwjgl.system.NativeType("GLenum") int r18, @javax.annotation.Nullable @org.lwjgl.system.NativeType("void const *") java.nio.FloatBuffer r19) {
            r0 = r11
            r1 = r12
            r2 = r13
            r3 = r14
            r4 = r15
            r5 = r16
            r6 = r17
            r7 = r18
            r8 = r19
            long r8 = org.lwjgl.system.MemoryUtil.memAddressSafe(r8)
            nglTextureImage1DEXT(r0, r1, r2, r3, r4, r5, r6, r7, r8)
            return
    }

    public static void glTextureImage1DEXT(@org.lwjgl.system.NativeType("GLuint") int r11, @org.lwjgl.system.NativeType("GLenum") int r12, @org.lwjgl.system.NativeType("GLint") int r13, @org.lwjgl.system.NativeType("GLint") int r14, @org.lwjgl.system.NativeType("GLsizei") int r15, @org.lwjgl.system.NativeType("GLint") int r16, @org.lwjgl.system.NativeType("GLenum") int r17, @org.lwjgl.system.NativeType("GLenum") int r18, @javax.annotation.Nullable @org.lwjgl.system.NativeType("void const *") java.nio.DoubleBuffer r19) {
            r0 = r11
            r1 = r12
            r2 = r13
            r3 = r14
            r4 = r15
            r5 = r16
            r6 = r17
            r7 = r18
            r8 = r19
            long r8 = org.lwjgl.system.MemoryUtil.memAddressSafe(r8)
            nglTextureImage1DEXT(r0, r1, r2, r3, r4, r5, r6, r7, r8)
            return
    }

    public static native void nglTextureImage2DEXT(int r0, int r1, int r2, int r3, int r4, int r5, int r6, int r7, int r8, long r9);

    public static void glTextureImage2DEXT(@org.lwjgl.system.NativeType("GLuint") int r12, @org.lwjgl.system.NativeType("GLenum") int r13, @org.lwjgl.system.NativeType("GLint") int r14, @org.lwjgl.system.NativeType("GLint") int r15, @org.lwjgl.system.NativeType("GLsizei") int r16, @org.lwjgl.system.NativeType("GLsizei") int r17, @org.lwjgl.system.NativeType("GLint") int r18, @org.lwjgl.system.NativeType("GLenum") int r19, @org.lwjgl.system.NativeType("GLenum") int r20, @javax.annotation.Nullable @org.lwjgl.system.NativeType("void const *") java.nio.ByteBuffer r21) {
            r0 = r12
            r1 = r13
            r2 = r14
            r3 = r15
            r4 = r16
            r5 = r17
            r6 = r18
            r7 = r19
            r8 = r20
            r9 = r21
            long r9 = org.lwjgl.system.MemoryUtil.memAddressSafe(r9)
            nglTextureImage2DEXT(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9)
            return
    }

    public static void glTextureImage2DEXT(@org.lwjgl.system.NativeType("GLuint") int r12, @org.lwjgl.system.NativeType("GLenum") int r13, @org.lwjgl.system.NativeType("GLint") int r14, @org.lwjgl.system.NativeType("GLint") int r15, @org.lwjgl.system.NativeType("GLsizei") int r16, @org.lwjgl.system.NativeType("GLsizei") int r17, @org.lwjgl.system.NativeType("GLint") int r18, @org.lwjgl.system.NativeType("GLenum") int r19, @org.lwjgl.system.NativeType("GLenum") int r20, @org.lwjgl.system.NativeType("void const *") long r21) {
            r0 = r12
            r1 = r13
            r2 = r14
            r3 = r15
            r4 = r16
            r5 = r17
            r6 = r18
            r7 = r19
            r8 = r20
            r9 = r21
            nglTextureImage2DEXT(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9)
            return
    }

    public static void glTextureImage2DEXT(@org.lwjgl.system.NativeType("GLuint") int r12, @org.lwjgl.system.NativeType("GLenum") int r13, @org.lwjgl.system.NativeType("GLint") int r14, @org.lwjgl.system.NativeType("GLint") int r15, @org.lwjgl.system.NativeType("GLsizei") int r16, @org.lwjgl.system.NativeType("GLsizei") int r17, @org.lwjgl.system.NativeType("GLint") int r18, @org.lwjgl.system.NativeType("GLenum") int r19, @org.lwjgl.system.NativeType("GLenum") int r20, @javax.annotation.Nullable @org.lwjgl.system.NativeType("void const *") java.nio.ShortBuffer r21) {
            r0 = r12
            r1 = r13
            r2 = r14
            r3 = r15
            r4 = r16
            r5 = r17
            r6 = r18
            r7 = r19
            r8 = r20
            r9 = r21
            long r9 = org.lwjgl.system.MemoryUtil.memAddressSafe(r9)
            nglTextureImage2DEXT(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9)
            return
    }

    public static void glTextureImage2DEXT(@org.lwjgl.system.NativeType("GLuint") int r12, @org.lwjgl.system.NativeType("GLenum") int r13, @org.lwjgl.system.NativeType("GLint") int r14, @org.lwjgl.system.NativeType("GLint") int r15, @org.lwjgl.system.NativeType("GLsizei") int r16, @org.lwjgl.system.NativeType("GLsizei") int r17, @org.lwjgl.system.NativeType("GLint") int r18, @org.lwjgl.system.NativeType("GLenum") int r19, @org.lwjgl.system.NativeType("GLenum") int r20, @javax.annotation.Nullable @org.lwjgl.system.NativeType("void const *") java.nio.IntBuffer r21) {
            r0 = r12
            r1 = r13
            r2 = r14
            r3 = r15
            r4 = r16
            r5 = r17
            r6 = r18
            r7 = r19
            r8 = r20
            r9 = r21
            long r9 = org.lwjgl.system.MemoryUtil.memAddressSafe(r9)
            nglTextureImage2DEXT(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9)
            return
    }

    public static void glTextureImage2DEXT(@org.lwjgl.system.NativeType("GLuint") int r12, @org.lwjgl.system.NativeType("GLenum") int r13, @org.lwjgl.system.NativeType("GLint") int r14, @org.lwjgl.system.NativeType("GLint") int r15, @org.lwjgl.system.NativeType("GLsizei") int r16, @org.lwjgl.system.NativeType("GLsizei") int r17, @org.lwjgl.system.NativeType("GLint") int r18, @org.lwjgl.system.NativeType("GLenum") int r19, @org.lwjgl.system.NativeType("GLenum") int r20, @javax.annotation.Nullable @org.lwjgl.system.NativeType("void const *") java.nio.FloatBuffer r21) {
            r0 = r12
            r1 = r13
            r2 = r14
            r3 = r15
            r4 = r16
            r5 = r17
            r6 = r18
            r7 = r19
            r8 = r20
            r9 = r21
            long r9 = org.lwjgl.system.MemoryUtil.memAddressSafe(r9)
            nglTextureImage2DEXT(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9)
            return
    }

    public static void glTextureImage2DEXT(@org.lwjgl.system.NativeType("GLuint") int r12, @org.lwjgl.system.NativeType("GLenum") int r13, @org.lwjgl.system.NativeType("GLint") int r14, @org.lwjgl.system.NativeType("GLint") int r15, @org.lwjgl.system.NativeType("GLsizei") int r16, @org.lwjgl.system.NativeType("GLsizei") int r17, @org.lwjgl.system.NativeType("GLint") int r18, @org.lwjgl.system.NativeType("GLenum") int r19, @org.lwjgl.system.NativeType("GLenum") int r20, @javax.annotation.Nullable @org.lwjgl.system.NativeType("void const *") java.nio.DoubleBuffer r21) {
            r0 = r12
            r1 = r13
            r2 = r14
            r3 = r15
            r4 = r16
            r5 = r17
            r6 = r18
            r7 = r19
            r8 = r20
            r9 = r21
            long r9 = org.lwjgl.system.MemoryUtil.memAddressSafe(r9)
            nglTextureImage2DEXT(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9)
            return
    }

    public static native void nglTextureSubImage1DEXT(int r0, int r1, int r2, int r3, int r4, int r5, int r6, long r7);

    public static void glTextureSubImage1DEXT(@org.lwjgl.system.NativeType("GLuint") int r10, @org.lwjgl.system.NativeType("GLenum") int r11, @org.lwjgl.system.NativeType("GLint") int r12, @org.lwjgl.system.NativeType("GLint") int r13, @org.lwjgl.system.NativeType("GLsizei") int r14, @org.lwjgl.system.NativeType("GLenum") int r15, @org.lwjgl.system.NativeType("GLenum") int r16, @org.lwjgl.system.NativeType("void const *") java.nio.ByteBuffer r17) {
            r0 = r10
            r1 = r11
            r2 = r12
            r3 = r13
            r4 = r14
            r5 = r15
            r6 = r16
            r7 = r17
            long r7 = org.lwjgl.system.MemoryUtil.memAddress(r7)
            nglTextureSubImage1DEXT(r0, r1, r2, r3, r4, r5, r6, r7)
            return
    }

    public static void glTextureSubImage1DEXT(@org.lwjgl.system.NativeType("GLuint") int r10, @org.lwjgl.system.NativeType("GLenum") int r11, @org.lwjgl.system.NativeType("GLint") int r12, @org.lwjgl.system.NativeType("GLint") int r13, @org.lwjgl.system.NativeType("GLsizei") int r14, @org.lwjgl.system.NativeType("GLenum") int r15, @org.lwjgl.system.NativeType("GLenum") int r16, @org.lwjgl.system.NativeType("void const *") long r17) {
            r0 = r10
            r1 = r11
            r2 = r12
            r3 = r13
            r4 = r14
            r5 = r15
            r6 = r16
            r7 = r17
            nglTextureSubImage1DEXT(r0, r1, r2, r3, r4, r5, r6, r7)
            return
    }

    public static void glTextureSubImage1DEXT(@org.lwjgl.system.NativeType("GLuint") int r10, @org.lwjgl.system.NativeType("GLenum") int r11, @org.lwjgl.system.NativeType("GLint") int r12, @org.lwjgl.system.NativeType("GLint") int r13, @org.lwjgl.system.NativeType("GLsizei") int r14, @org.lwjgl.system.NativeType("GLenum") int r15, @org.lwjgl.system.NativeType("GLenum") int r16, @org.lwjgl.system.NativeType("void const *") java.nio.ShortBuffer r17) {
            r0 = r10
            r1 = r11
            r2 = r12
            r3 = r13
            r4 = r14
            r5 = r15
            r6 = r16
            r7 = r17
            long r7 = org.lwjgl.system.MemoryUtil.memAddress(r7)
            nglTextureSubImage1DEXT(r0, r1, r2, r3, r4, r5, r6, r7)
            return
    }

    public static void glTextureSubImage1DEXT(@org.lwjgl.system.NativeType("GLuint") int r10, @org.lwjgl.system.NativeType("GLenum") int r11, @org.lwjgl.system.NativeType("GLint") int r12, @org.lwjgl.system.NativeType("GLint") int r13, @org.lwjgl.system.NativeType("GLsizei") int r14, @org.lwjgl.system.NativeType("GLenum") int r15, @org.lwjgl.system.NativeType("GLenum") int r16, @org.lwjgl.system.NativeType("void const *") java.nio.IntBuffer r17) {
            r0 = r10
            r1 = r11
            r2 = r12
            r3 = r13
            r4 = r14
            r5 = r15
            r6 = r16
            r7 = r17
            long r7 = org.lwjgl.system.MemoryUtil.memAddress(r7)
            nglTextureSubImage1DEXT(r0, r1, r2, r3, r4, r5, r6, r7)
            return
    }

    public static void glTextureSubImage1DEXT(@org.lwjgl.system.NativeType("GLuint") int r10, @org.lwjgl.system.NativeType("GLenum") int r11, @org.lwjgl.system.NativeType("GLint") int r12, @org.lwjgl.system.NativeType("GLint") int r13, @org.lwjgl.system.NativeType("GLsizei") int r14, @org.lwjgl.system.NativeType("GLenum") int r15, @org.lwjgl.system.NativeType("GLenum") int r16, @org.lwjgl.system.NativeType("void const *") java.nio.FloatBuffer r17) {
            r0 = r10
            r1 = r11
            r2 = r12
            r3 = r13
            r4 = r14
            r5 = r15
            r6 = r16
            r7 = r17
            long r7 = org.lwjgl.system.MemoryUtil.memAddress(r7)
            nglTextureSubImage1DEXT(r0, r1, r2, r3, r4, r5, r6, r7)
            return
    }

    public static void glTextureSubImage1DEXT(@org.lwjgl.system.NativeType("GLuint") int r10, @org.lwjgl.system.NativeType("GLenum") int r11, @org.lwjgl.system.NativeType("GLint") int r12, @org.lwjgl.system.NativeType("GLint") int r13, @org.lwjgl.system.NativeType("GLsizei") int r14, @org.lwjgl.system.NativeType("GLenum") int r15, @org.lwjgl.system.NativeType("GLenum") int r16, @org.lwjgl.system.NativeType("void const *") java.nio.DoubleBuffer r17) {
            r0 = r10
            r1 = r11
            r2 = r12
            r3 = r13
            r4 = r14
            r5 = r15
            r6 = r16
            r7 = r17
            long r7 = org.lwjgl.system.MemoryUtil.memAddress(r7)
            nglTextureSubImage1DEXT(r0, r1, r2, r3, r4, r5, r6, r7)
            return
    }

    public static native void nglTextureSubImage2DEXT(int r0, int r1, int r2, int r3, int r4, int r5, int r6, int r7, int r8, long r9);

    public static void glTextureSubImage2DEXT(@org.lwjgl.system.NativeType("GLuint") int r12, @org.lwjgl.system.NativeType("GLenum") int r13, @org.lwjgl.system.NativeType("GLint") int r14, @org.lwjgl.system.NativeType("GLint") int r15, @org.lwjgl.system.NativeType("GLint") int r16, @org.lwjgl.system.NativeType("GLsizei") int r17, @org.lwjgl.system.NativeType("GLsizei") int r18, @org.lwjgl.system.NativeType("GLenum") int r19, @org.lwjgl.system.NativeType("GLenum") int r20, @org.lwjgl.system.NativeType("void const *") java.nio.ByteBuffer r21) {
            r0 = r12
            r1 = r13
            r2 = r14
            r3 = r15
            r4 = r16
            r5 = r17
            r6 = r18
            r7 = r19
            r8 = r20
            r9 = r21
            long r9 = org.lwjgl.system.MemoryUtil.memAddress(r9)
            nglTextureSubImage2DEXT(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9)
            return
    }

    public static void glTextureSubImage2DEXT(@org.lwjgl.system.NativeType("GLuint") int r12, @org.lwjgl.system.NativeType("GLenum") int r13, @org.lwjgl.system.NativeType("GLint") int r14, @org.lwjgl.system.NativeType("GLint") int r15, @org.lwjgl.system.NativeType("GLint") int r16, @org.lwjgl.system.NativeType("GLsizei") int r17, @org.lwjgl.system.NativeType("GLsizei") int r18, @org.lwjgl.system.NativeType("GLenum") int r19, @org.lwjgl.system.NativeType("GLenum") int r20, @org.lwjgl.system.NativeType("void const *") long r21) {
            r0 = r12
            r1 = r13
            r2 = r14
            r3 = r15
            r4 = r16
            r5 = r17
            r6 = r18
            r7 = r19
            r8 = r20
            r9 = r21
            nglTextureSubImage2DEXT(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9)
            return
    }

    public static void glTextureSubImage2DEXT(@org.lwjgl.system.NativeType("GLuint") int r12, @org.lwjgl.system.NativeType("GLenum") int r13, @org.lwjgl.system.NativeType("GLint") int r14, @org.lwjgl.system.NativeType("GLint") int r15, @org.lwjgl.system.NativeType("GLint") int r16, @org.lwjgl.system.NativeType("GLsizei") int r17, @org.lwjgl.system.NativeType("GLsizei") int r18, @org.lwjgl.system.NativeType("GLenum") int r19, @org.lwjgl.system.NativeType("GLenum") int r20, @org.lwjgl.system.NativeType("void const *") java.nio.ShortBuffer r21) {
            r0 = r12
            r1 = r13
            r2 = r14
            r3 = r15
            r4 = r16
            r5 = r17
            r6 = r18
            r7 = r19
            r8 = r20
            r9 = r21
            long r9 = org.lwjgl.system.MemoryUtil.memAddress(r9)
            nglTextureSubImage2DEXT(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9)
            return
    }

    public static void glTextureSubImage2DEXT(@org.lwjgl.system.NativeType("GLuint") int r12, @org.lwjgl.system.NativeType("GLenum") int r13, @org.lwjgl.system.NativeType("GLint") int r14, @org.lwjgl.system.NativeType("GLint") int r15, @org.lwjgl.system.NativeType("GLint") int r16, @org.lwjgl.system.NativeType("GLsizei") int r17, @org.lwjgl.system.NativeType("GLsizei") int r18, @org.lwjgl.system.NativeType("GLenum") int r19, @org.lwjgl.system.NativeType("GLenum") int r20, @org.lwjgl.system.NativeType("void const *") java.nio.IntBuffer r21) {
            r0 = r12
            r1 = r13
            r2 = r14
            r3 = r15
            r4 = r16
            r5 = r17
            r6 = r18
            r7 = r19
            r8 = r20
            r9 = r21
            long r9 = org.lwjgl.system.MemoryUtil.memAddress(r9)
            nglTextureSubImage2DEXT(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9)
            return
    }

    public static void glTextureSubImage2DEXT(@org.lwjgl.system.NativeType("GLuint") int r12, @org.lwjgl.system.NativeType("GLenum") int r13, @org.lwjgl.system.NativeType("GLint") int r14, @org.lwjgl.system.NativeType("GLint") int r15, @org.lwjgl.system.NativeType("GLint") int r16, @org.lwjgl.system.NativeType("GLsizei") int r17, @org.lwjgl.system.NativeType("GLsizei") int r18, @org.lwjgl.system.NativeType("GLenum") int r19, @org.lwjgl.system.NativeType("GLenum") int r20, @org.lwjgl.system.NativeType("void const *") java.nio.FloatBuffer r21) {
            r0 = r12
            r1 = r13
            r2 = r14
            r3 = r15
            r4 = r16
            r5 = r17
            r6 = r18
            r7 = r19
            r8 = r20
            r9 = r21
            long r9 = org.lwjgl.system.MemoryUtil.memAddress(r9)
            nglTextureSubImage2DEXT(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9)
            return
    }

    public static void glTextureSubImage2DEXT(@org.lwjgl.system.NativeType("GLuint") int r12, @org.lwjgl.system.NativeType("GLenum") int r13, @org.lwjgl.system.NativeType("GLint") int r14, @org.lwjgl.system.NativeType("GLint") int r15, @org.lwjgl.system.NativeType("GLint") int r16, @org.lwjgl.system.NativeType("GLsizei") int r17, @org.lwjgl.system.NativeType("GLsizei") int r18, @org.lwjgl.system.NativeType("GLenum") int r19, @org.lwjgl.system.NativeType("GLenum") int r20, @org.lwjgl.system.NativeType("void const *") java.nio.DoubleBuffer r21) {
            r0 = r12
            r1 = r13
            r2 = r14
            r3 = r15
            r4 = r16
            r5 = r17
            r6 = r18
            r7 = r19
            r8 = r20
            r9 = r21
            long r9 = org.lwjgl.system.MemoryUtil.memAddress(r9)
            nglTextureSubImage2DEXT(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9)
            return
    }

    public static native void glCopyTextureImage1DEXT(@org.lwjgl.system.NativeType("GLuint") int r0, @org.lwjgl.system.NativeType("GLenum") int r1, @org.lwjgl.system.NativeType("GLint") int r2, @org.lwjgl.system.NativeType("GLenum") int r3, @org.lwjgl.system.NativeType("GLint") int r4, @org.lwjgl.system.NativeType("GLint") int r5, @org.lwjgl.system.NativeType("GLsizei") int r6, @org.lwjgl.system.NativeType("GLint") int r7);

    public static native void glCopyTextureImage2DEXT(@org.lwjgl.system.NativeType("GLuint") int r0, @org.lwjgl.system.NativeType("GLenum") int r1, @org.lwjgl.system.NativeType("GLint") int r2, @org.lwjgl.system.NativeType("GLenum") int r3, @org.lwjgl.system.NativeType("GLint") int r4, @org.lwjgl.system.NativeType("GLint") int r5, @org.lwjgl.system.NativeType("GLsizei") int r6, @org.lwjgl.system.NativeType("GLsizei") int r7, @org.lwjgl.system.NativeType("GLint") int r8);

    public static native void glCopyTextureSubImage1DEXT(@org.lwjgl.system.NativeType("GLuint") int r0, @org.lwjgl.system.NativeType("GLenum") int r1, @org.lwjgl.system.NativeType("GLint") int r2, @org.lwjgl.system.NativeType("GLint") int r3, @org.lwjgl.system.NativeType("GLint") int r4, @org.lwjgl.system.NativeType("GLint") int r5, @org.lwjgl.system.NativeType("GLsizei") int r6);

    public static native void glCopyTextureSubImage2DEXT(@org.lwjgl.system.NativeType("GLuint") int r0, @org.lwjgl.system.NativeType("GLenum") int r1, @org.lwjgl.system.NativeType("GLint") int r2, @org.lwjgl.system.NativeType("GLint") int r3, @org.lwjgl.system.NativeType("GLint") int r4, @org.lwjgl.system.NativeType("GLint") int r5, @org.lwjgl.system.NativeType("GLint") int r6, @org.lwjgl.system.NativeType("GLsizei") int r7, @org.lwjgl.system.NativeType("GLsizei") int r8);

    public static native void nglGetTextureImageEXT(int r0, int r1, int r2, int r3, int r4, long r5);

    public static void glGetTextureImageEXT(@org.lwjgl.system.NativeType("GLuint") int r8, @org.lwjgl.system.NativeType("GLenum") int r9, @org.lwjgl.system.NativeType("GLint") int r10, @org.lwjgl.system.NativeType("GLenum") int r11, @org.lwjgl.system.NativeType("GLenum") int r12, @org.lwjgl.system.NativeType("void *") java.nio.ByteBuffer r13) {
            r0 = r8
            r1 = r9
            r2 = r10
            r3 = r11
            r4 = r12
            r5 = r13
            long r5 = org.lwjgl.system.MemoryUtil.memAddress(r5)
            nglGetTextureImageEXT(r0, r1, r2, r3, r4, r5)
            return
    }

    public static void glGetTextureImageEXT(@org.lwjgl.system.NativeType("GLuint") int r8, @org.lwjgl.system.NativeType("GLenum") int r9, @org.lwjgl.system.NativeType("GLint") int r10, @org.lwjgl.system.NativeType("GLenum") int r11, @org.lwjgl.system.NativeType("GLenum") int r12, @org.lwjgl.system.NativeType("void *") long r13) {
            r0 = r8
            r1 = r9
            r2 = r10
            r3 = r11
            r4 = r12
            r5 = r13
            nglGetTextureImageEXT(r0, r1, r2, r3, r4, r5)
            return
    }

    public static void glGetTextureImageEXT(@org.lwjgl.system.NativeType("GLuint") int r8, @org.lwjgl.system.NativeType("GLenum") int r9, @org.lwjgl.system.NativeType("GLint") int r10, @org.lwjgl.system.NativeType("GLenum") int r11, @org.lwjgl.system.NativeType("GLenum") int r12, @org.lwjgl.system.NativeType("void *") java.nio.ShortBuffer r13) {
            r0 = r8
            r1 = r9
            r2 = r10
            r3 = r11
            r4 = r12
            r5 = r13
            long r5 = org.lwjgl.system.MemoryUtil.memAddress(r5)
            nglGetTextureImageEXT(r0, r1, r2, r3, r4, r5)
            return
    }

    public static void glGetTextureImageEXT(@org.lwjgl.system.NativeType("GLuint") int r8, @org.lwjgl.system.NativeType("GLenum") int r9, @org.lwjgl.system.NativeType("GLint") int r10, @org.lwjgl.system.NativeType("GLenum") int r11, @org.lwjgl.system.NativeType("GLenum") int r12, @org.lwjgl.system.NativeType("void *") java.nio.IntBuffer r13) {
            r0 = r8
            r1 = r9
            r2 = r10
            r3 = r11
            r4 = r12
            r5 = r13
            long r5 = org.lwjgl.system.MemoryUtil.memAddress(r5)
            nglGetTextureImageEXT(r0, r1, r2, r3, r4, r5)
            return
    }

    public static void glGetTextureImageEXT(@org.lwjgl.system.NativeType("GLuint") int r8, @org.lwjgl.system.NativeType("GLenum") int r9, @org.lwjgl.system.NativeType("GLint") int r10, @org.lwjgl.system.NativeType("GLenum") int r11, @org.lwjgl.system.NativeType("GLenum") int r12, @org.lwjgl.system.NativeType("void *") java.nio.FloatBuffer r13) {
            r0 = r8
            r1 = r9
            r2 = r10
            r3 = r11
            r4 = r12
            r5 = r13
            long r5 = org.lwjgl.system.MemoryUtil.memAddress(r5)
            nglGetTextureImageEXT(r0, r1, r2, r3, r4, r5)
            return
    }

    public static void glGetTextureImageEXT(@org.lwjgl.system.NativeType("GLuint") int r8, @org.lwjgl.system.NativeType("GLenum") int r9, @org.lwjgl.system.NativeType("GLint") int r10, @org.lwjgl.system.NativeType("GLenum") int r11, @org.lwjgl.system.NativeType("GLenum") int r12, @org.lwjgl.system.NativeType("void *") java.nio.DoubleBuffer r13) {
            r0 = r8
            r1 = r9
            r2 = r10
            r3 = r11
            r4 = r12
            r5 = r13
            long r5 = org.lwjgl.system.MemoryUtil.memAddress(r5)
            nglGetTextureImageEXT(r0, r1, r2, r3, r4, r5)
            return
    }

    public static native void nglGetTextureParameterfvEXT(int r0, int r1, int r2, long r3);

    public static void glGetTextureParameterfvEXT(@org.lwjgl.system.NativeType("GLuint") int r6, @org.lwjgl.system.NativeType("GLenum") int r7, @org.lwjgl.system.NativeType("GLenum") int r8, @org.lwjgl.system.NativeType("GLfloat *") java.nio.FloatBuffer r9) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r9
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
        Lb:
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            long r3 = org.lwjgl.system.MemoryUtil.memAddress(r3)
            nglGetTextureParameterfvEXT(r0, r1, r2, r3)
            return
    }

    @org.lwjgl.system.NativeType("void")
    public static float glGetTextureParameterfEXT(@org.lwjgl.system.NativeType("GLuint") int r6, @org.lwjgl.system.NativeType("GLenum") int r7, @org.lwjgl.system.NativeType("GLenum") int r8) {
            org.lwjgl.system.MemoryStack r0 = org.lwjgl.system.MemoryStack.stackGet()
            r9 = r0
            r0 = r9
            int r0 = r0.getPointer()
            r10 = r0
            r0 = r9
            r1 = 1
            java.nio.FloatBuffer r0 = r0.callocFloat(r1)     // Catch: java.lang.Throwable -> L2d
            r11 = r0
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r11
            long r3 = org.lwjgl.system.MemoryUtil.memAddress(r3)     // Catch: java.lang.Throwable -> L2d
            nglGetTextureParameterfvEXT(r0, r1, r2, r3)     // Catch: java.lang.Throwable -> L2d
            r0 = r11
            r1 = 0
            float r0 = r0.get(r1)     // Catch: java.lang.Throwable -> L2d
            r12 = r0
            r0 = r9
            r1 = r10
            r0.setPointer(r1)
            r0 = r12
            return r0
        L2d:
            r13 = move-exception
            r0 = r9
            r1 = r10
            r0.setPointer(r1)
            r0 = r13
            throw r0
    }

    public static native void nglGetTextureParameterivEXT(int r0, int r1, int r2, long r3);

    public static void glGetTextureParameterivEXT(@org.lwjgl.system.NativeType("GLuint") int r6, @org.lwjgl.system.NativeType("GLenum") int r7, @org.lwjgl.system.NativeType("GLenum") int r8, @org.lwjgl.system.NativeType("GLint *") java.nio.IntBuffer r9) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r9
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
        Lb:
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            long r3 = org.lwjgl.system.MemoryUtil.memAddress(r3)
            nglGetTextureParameterivEXT(r0, r1, r2, r3)
            return
    }

    @org.lwjgl.system.NativeType("void")
    public static int glGetTextureParameteriEXT(@org.lwjgl.system.NativeType("GLuint") int r6, @org.lwjgl.system.NativeType("GLenum") int r7, @org.lwjgl.system.NativeType("GLenum") int r8) {
            org.lwjgl.system.MemoryStack r0 = org.lwjgl.system.MemoryStack.stackGet()
            r9 = r0
            r0 = r9
            int r0 = r0.getPointer()
            r10 = r0
            r0 = r9
            r1 = 1
            java.nio.IntBuffer r0 = r0.callocInt(r1)     // Catch: java.lang.Throwable -> L2d
            r11 = r0
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r11
            long r3 = org.lwjgl.system.MemoryUtil.memAddress(r3)     // Catch: java.lang.Throwable -> L2d
            nglGetTextureParameterivEXT(r0, r1, r2, r3)     // Catch: java.lang.Throwable -> L2d
            r0 = r11
            r1 = 0
            int r0 = r0.get(r1)     // Catch: java.lang.Throwable -> L2d
            r12 = r0
            r0 = r9
            r1 = r10
            r0.setPointer(r1)
            r0 = r12
            return r0
        L2d:
            r13 = move-exception
            r0 = r9
            r1 = r10
            r0.setPointer(r1)
            r0 = r13
            throw r0
    }

    public static native void nglGetTextureLevelParameterfvEXT(int r0, int r1, int r2, int r3, long r4);

    public static void glGetTextureLevelParameterfvEXT(@org.lwjgl.system.NativeType("GLuint") int r7, @org.lwjgl.system.NativeType("GLenum") int r8, @org.lwjgl.system.NativeType("GLint") int r9, @org.lwjgl.system.NativeType("GLenum") int r10, @org.lwjgl.system.NativeType("GLfloat *") java.nio.FloatBuffer r11) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lc
            r0 = r11
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
        Lc:
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            long r4 = org.lwjgl.system.MemoryUtil.memAddress(r4)
            nglGetTextureLevelParameterfvEXT(r0, r1, r2, r3, r4)
            return
    }

    @org.lwjgl.system.NativeType("void")
    public static float glGetTextureLevelParameterfEXT(@org.lwjgl.system.NativeType("GLuint") int r7, @org.lwjgl.system.NativeType("GLenum") int r8, @org.lwjgl.system.NativeType("GLint") int r9, @org.lwjgl.system.NativeType("GLenum") int r10) {
            org.lwjgl.system.MemoryStack r0 = org.lwjgl.system.MemoryStack.stackGet()
            r11 = r0
            r0 = r11
            int r0 = r0.getPointer()
            r12 = r0
            r0 = r11
            r1 = 1
            java.nio.FloatBuffer r0 = r0.callocFloat(r1)     // Catch: java.lang.Throwable -> L32
            r13 = r0
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r13
            long r4 = org.lwjgl.system.MemoryUtil.memAddress(r4)     // Catch: java.lang.Throwable -> L32
            nglGetTextureLevelParameterfvEXT(r0, r1, r2, r3, r4)     // Catch: java.lang.Throwable -> L32
            r0 = r13
            r1 = 0
            float r0 = r0.get(r1)     // Catch: java.lang.Throwable -> L32
            r14 = r0
            r0 = r11
            r1 = r12
            r0.setPointer(r1)
            r0 = r14
            return r0
        L32:
            r15 = move-exception
            r0 = r11
            r1 = r12
            r0.setPointer(r1)
            r0 = r15
            throw r0
    }

    public static native void nglGetTextureLevelParameterivEXT(int r0, int r1, int r2, int r3, long r4);

    public static void glGetTextureLevelParameterivEXT(@org.lwjgl.system.NativeType("GLuint") int r7, @org.lwjgl.system.NativeType("GLenum") int r8, @org.lwjgl.system.NativeType("GLint") int r9, @org.lwjgl.system.NativeType("GLenum") int r10, @org.lwjgl.system.NativeType("GLint *") java.nio.IntBuffer r11) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lc
            r0 = r11
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
        Lc:
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            long r4 = org.lwjgl.system.MemoryUtil.memAddress(r4)
            nglGetTextureLevelParameterivEXT(r0, r1, r2, r3, r4)
            return
    }

    @org.lwjgl.system.NativeType("void")
    public static int glGetTextureLevelParameteriEXT(@org.lwjgl.system.NativeType("GLuint") int r7, @org.lwjgl.system.NativeType("GLenum") int r8, @org.lwjgl.system.NativeType("GLint") int r9, @org.lwjgl.system.NativeType("GLenum") int r10) {
            org.lwjgl.system.MemoryStack r0 = org.lwjgl.system.MemoryStack.stackGet()
            r11 = r0
            r0 = r11
            int r0 = r0.getPointer()
            r12 = r0
            r0 = r11
            r1 = 1
            java.nio.IntBuffer r0 = r0.callocInt(r1)     // Catch: java.lang.Throwable -> L32
            r13 = r0
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r13
            long r4 = org.lwjgl.system.MemoryUtil.memAddress(r4)     // Catch: java.lang.Throwable -> L32
            nglGetTextureLevelParameterivEXT(r0, r1, r2, r3, r4)     // Catch: java.lang.Throwable -> L32
            r0 = r13
            r1 = 0
            int r0 = r0.get(r1)     // Catch: java.lang.Throwable -> L32
            r14 = r0
            r0 = r11
            r1 = r12
            r0.setPointer(r1)
            r0 = r14
            return r0
        L32:
            r15 = move-exception
            r0 = r11
            r1 = r12
            r0.setPointer(r1)
            r0 = r15
            throw r0
    }

    public static native void nglTextureImage3DEXT(int r0, int r1, int r2, int r3, int r4, int r5, int r6, int r7, int r8, int r9, long r10);

    public static void glTextureImage3DEXT(@org.lwjgl.system.NativeType("GLuint") int r13, @org.lwjgl.system.NativeType("GLenum") int r14, @org.lwjgl.system.NativeType("GLint") int r15, @org.lwjgl.system.NativeType("GLint") int r16, @org.lwjgl.system.NativeType("GLsizei") int r17, @org.lwjgl.system.NativeType("GLsizei") int r18, @org.lwjgl.system.NativeType("GLsizei") int r19, @org.lwjgl.system.NativeType("GLint") int r20, @org.lwjgl.system.NativeType("GLenum") int r21, @org.lwjgl.system.NativeType("GLenum") int r22, @javax.annotation.Nullable @org.lwjgl.system.NativeType("void const *") java.nio.ByteBuffer r23) {
            r0 = r13
            r1 = r14
            r2 = r15
            r3 = r16
            r4 = r17
            r5 = r18
            r6 = r19
            r7 = r20
            r8 = r21
            r9 = r22
            r10 = r23
            long r10 = org.lwjgl.system.MemoryUtil.memAddressSafe(r10)
            nglTextureImage3DEXT(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            return
    }

    public static void glTextureImage3DEXT(@org.lwjgl.system.NativeType("GLuint") int r13, @org.lwjgl.system.NativeType("GLenum") int r14, @org.lwjgl.system.NativeType("GLint") int r15, @org.lwjgl.system.NativeType("GLint") int r16, @org.lwjgl.system.NativeType("GLsizei") int r17, @org.lwjgl.system.NativeType("GLsizei") int r18, @org.lwjgl.system.NativeType("GLsizei") int r19, @org.lwjgl.system.NativeType("GLint") int r20, @org.lwjgl.system.NativeType("GLenum") int r21, @org.lwjgl.system.NativeType("GLenum") int r22, @org.lwjgl.system.NativeType("void const *") long r23) {
            r0 = r13
            r1 = r14
            r2 = r15
            r3 = r16
            r4 = r17
            r5 = r18
            r6 = r19
            r7 = r20
            r8 = r21
            r9 = r22
            r10 = r23
            nglTextureImage3DEXT(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            return
    }

    public static void glTextureImage3DEXT(@org.lwjgl.system.NativeType("GLuint") int r13, @org.lwjgl.system.NativeType("GLenum") int r14, @org.lwjgl.system.NativeType("GLint") int r15, @org.lwjgl.system.NativeType("GLint") int r16, @org.lwjgl.system.NativeType("GLsizei") int r17, @org.lwjgl.system.NativeType("GLsizei") int r18, @org.lwjgl.system.NativeType("GLsizei") int r19, @org.lwjgl.system.NativeType("GLint") int r20, @org.lwjgl.system.NativeType("GLenum") int r21, @org.lwjgl.system.NativeType("GLenum") int r22, @javax.annotation.Nullable @org.lwjgl.system.NativeType("void const *") java.nio.ShortBuffer r23) {
            r0 = r13
            r1 = r14
            r2 = r15
            r3 = r16
            r4 = r17
            r5 = r18
            r6 = r19
            r7 = r20
            r8 = r21
            r9 = r22
            r10 = r23
            long r10 = org.lwjgl.system.MemoryUtil.memAddressSafe(r10)
            nglTextureImage3DEXT(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            return
    }

    public static void glTextureImage3DEXT(@org.lwjgl.system.NativeType("GLuint") int r13, @org.lwjgl.system.NativeType("GLenum") int r14, @org.lwjgl.system.NativeType("GLint") int r15, @org.lwjgl.system.NativeType("GLint") int r16, @org.lwjgl.system.NativeType("GLsizei") int r17, @org.lwjgl.system.NativeType("GLsizei") int r18, @org.lwjgl.system.NativeType("GLsizei") int r19, @org.lwjgl.system.NativeType("GLint") int r20, @org.lwjgl.system.NativeType("GLenum") int r21, @org.lwjgl.system.NativeType("GLenum") int r22, @javax.annotation.Nullable @org.lwjgl.system.NativeType("void const *") java.nio.IntBuffer r23) {
            r0 = r13
            r1 = r14
            r2 = r15
            r3 = r16
            r4 = r17
            r5 = r18
            r6 = r19
            r7 = r20
            r8 = r21
            r9 = r22
            r10 = r23
            long r10 = org.lwjgl.system.MemoryUtil.memAddressSafe(r10)
            nglTextureImage3DEXT(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            return
    }

    public static void glTextureImage3DEXT(@org.lwjgl.system.NativeType("GLuint") int r13, @org.lwjgl.system.NativeType("GLenum") int r14, @org.lwjgl.system.NativeType("GLint") int r15, @org.lwjgl.system.NativeType("GLint") int r16, @org.lwjgl.system.NativeType("GLsizei") int r17, @org.lwjgl.system.NativeType("GLsizei") int r18, @org.lwjgl.system.NativeType("GLsizei") int r19, @org.lwjgl.system.NativeType("GLint") int r20, @org.lwjgl.system.NativeType("GLenum") int r21, @org.lwjgl.system.NativeType("GLenum") int r22, @javax.annotation.Nullable @org.lwjgl.system.NativeType("void const *") java.nio.FloatBuffer r23) {
            r0 = r13
            r1 = r14
            r2 = r15
            r3 = r16
            r4 = r17
            r5 = r18
            r6 = r19
            r7 = r20
            r8 = r21
            r9 = r22
            r10 = r23
            long r10 = org.lwjgl.system.MemoryUtil.memAddressSafe(r10)
            nglTextureImage3DEXT(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            return
    }

    public static void glTextureImage3DEXT(@org.lwjgl.system.NativeType("GLuint") int r13, @org.lwjgl.system.NativeType("GLenum") int r14, @org.lwjgl.system.NativeType("GLint") int r15, @org.lwjgl.system.NativeType("GLint") int r16, @org.lwjgl.system.NativeType("GLsizei") int r17, @org.lwjgl.system.NativeType("GLsizei") int r18, @org.lwjgl.system.NativeType("GLsizei") int r19, @org.lwjgl.system.NativeType("GLint") int r20, @org.lwjgl.system.NativeType("GLenum") int r21, @org.lwjgl.system.NativeType("GLenum") int r22, @javax.annotation.Nullable @org.lwjgl.system.NativeType("void const *") java.nio.DoubleBuffer r23) {
            r0 = r13
            r1 = r14
            r2 = r15
            r3 = r16
            r4 = r17
            r5 = r18
            r6 = r19
            r7 = r20
            r8 = r21
            r9 = r22
            r10 = r23
            long r10 = org.lwjgl.system.MemoryUtil.memAddressSafe(r10)
            nglTextureImage3DEXT(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            return
    }

    public static native void nglTextureSubImage3DEXT(int r0, int r1, int r2, int r3, int r4, int r5, int r6, int r7, int r8, int r9, int r10, long r11);

    public static void glTextureSubImage3DEXT(@org.lwjgl.system.NativeType("GLuint") int r14, @org.lwjgl.system.NativeType("GLenum") int r15, @org.lwjgl.system.NativeType("GLint") int r16, @org.lwjgl.system.NativeType("GLint") int r17, @org.lwjgl.system.NativeType("GLint") int r18, @org.lwjgl.system.NativeType("GLint") int r19, @org.lwjgl.system.NativeType("GLsizei") int r20, @org.lwjgl.system.NativeType("GLsizei") int r21, @org.lwjgl.system.NativeType("GLsizei") int r22, @org.lwjgl.system.NativeType("GLenum") int r23, @org.lwjgl.system.NativeType("GLenum") int r24, @org.lwjgl.system.NativeType("void const *") java.nio.ByteBuffer r25) {
            r0 = r14
            r1 = r15
            r2 = r16
            r3 = r17
            r4 = r18
            r5 = r19
            r6 = r20
            r7 = r21
            r8 = r22
            r9 = r23
            r10 = r24
            r11 = r25
            long r11 = org.lwjgl.system.MemoryUtil.memAddress(r11)
            nglTextureSubImage3DEXT(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            return
    }

    public static void glTextureSubImage3DEXT(@org.lwjgl.system.NativeType("GLuint") int r14, @org.lwjgl.system.NativeType("GLenum") int r15, @org.lwjgl.system.NativeType("GLint") int r16, @org.lwjgl.system.NativeType("GLint") int r17, @org.lwjgl.system.NativeType("GLint") int r18, @org.lwjgl.system.NativeType("GLint") int r19, @org.lwjgl.system.NativeType("GLsizei") int r20, @org.lwjgl.system.NativeType("GLsizei") int r21, @org.lwjgl.system.NativeType("GLsizei") int r22, @org.lwjgl.system.NativeType("GLenum") int r23, @org.lwjgl.system.NativeType("GLenum") int r24, @org.lwjgl.system.NativeType("void const *") long r25) {
            r0 = r14
            r1 = r15
            r2 = r16
            r3 = r17
            r4 = r18
            r5 = r19
            r6 = r20
            r7 = r21
            r8 = r22
            r9 = r23
            r10 = r24
            r11 = r25
            nglTextureSubImage3DEXT(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            return
    }

    public static void glTextureSubImage3DEXT(@org.lwjgl.system.NativeType("GLuint") int r14, @org.lwjgl.system.NativeType("GLenum") int r15, @org.lwjgl.system.NativeType("GLint") int r16, @org.lwjgl.system.NativeType("GLint") int r17, @org.lwjgl.system.NativeType("GLint") int r18, @org.lwjgl.system.NativeType("GLint") int r19, @org.lwjgl.system.NativeType("GLsizei") int r20, @org.lwjgl.system.NativeType("GLsizei") int r21, @org.lwjgl.system.NativeType("GLsizei") int r22, @org.lwjgl.system.NativeType("GLenum") int r23, @org.lwjgl.system.NativeType("GLenum") int r24, @org.lwjgl.system.NativeType("void const *") java.nio.ShortBuffer r25) {
            r0 = r14
            r1 = r15
            r2 = r16
            r3 = r17
            r4 = r18
            r5 = r19
            r6 = r20
            r7 = r21
            r8 = r22
            r9 = r23
            r10 = r24
            r11 = r25
            long r11 = org.lwjgl.system.MemoryUtil.memAddress(r11)
            nglTextureSubImage3DEXT(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            return
    }

    public static void glTextureSubImage3DEXT(@org.lwjgl.system.NativeType("GLuint") int r14, @org.lwjgl.system.NativeType("GLenum") int r15, @org.lwjgl.system.NativeType("GLint") int r16, @org.lwjgl.system.NativeType("GLint") int r17, @org.lwjgl.system.NativeType("GLint") int r18, @org.lwjgl.system.NativeType("GLint") int r19, @org.lwjgl.system.NativeType("GLsizei") int r20, @org.lwjgl.system.NativeType("GLsizei") int r21, @org.lwjgl.system.NativeType("GLsizei") int r22, @org.lwjgl.system.NativeType("GLenum") int r23, @org.lwjgl.system.NativeType("GLenum") int r24, @org.lwjgl.system.NativeType("void const *") java.nio.IntBuffer r25) {
            r0 = r14
            r1 = r15
            r2 = r16
            r3 = r17
            r4 = r18
            r5 = r19
            r6 = r20
            r7 = r21
            r8 = r22
            r9 = r23
            r10 = r24
            r11 = r25
            long r11 = org.lwjgl.system.MemoryUtil.memAddress(r11)
            nglTextureSubImage3DEXT(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            return
    }

    public static void glTextureSubImage3DEXT(@org.lwjgl.system.NativeType("GLuint") int r14, @org.lwjgl.system.NativeType("GLenum") int r15, @org.lwjgl.system.NativeType("GLint") int r16, @org.lwjgl.system.NativeType("GLint") int r17, @org.lwjgl.system.NativeType("GLint") int r18, @org.lwjgl.system.NativeType("GLint") int r19, @org.lwjgl.system.NativeType("GLsizei") int r20, @org.lwjgl.system.NativeType("GLsizei") int r21, @org.lwjgl.system.NativeType("GLsizei") int r22, @org.lwjgl.system.NativeType("GLenum") int r23, @org.lwjgl.system.NativeType("GLenum") int r24, @org.lwjgl.system.NativeType("void const *") java.nio.FloatBuffer r25) {
            r0 = r14
            r1 = r15
            r2 = r16
            r3 = r17
            r4 = r18
            r5 = r19
            r6 = r20
            r7 = r21
            r8 = r22
            r9 = r23
            r10 = r24
            r11 = r25
            long r11 = org.lwjgl.system.MemoryUtil.memAddress(r11)
            nglTextureSubImage3DEXT(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            return
    }

    public static void glTextureSubImage3DEXT(@org.lwjgl.system.NativeType("GLuint") int r14, @org.lwjgl.system.NativeType("GLenum") int r15, @org.lwjgl.system.NativeType("GLint") int r16, @org.lwjgl.system.NativeType("GLint") int r17, @org.lwjgl.system.NativeType("GLint") int r18, @org.lwjgl.system.NativeType("GLint") int r19, @org.lwjgl.system.NativeType("GLsizei") int r20, @org.lwjgl.system.NativeType("GLsizei") int r21, @org.lwjgl.system.NativeType("GLsizei") int r22, @org.lwjgl.system.NativeType("GLenum") int r23, @org.lwjgl.system.NativeType("GLenum") int r24, @org.lwjgl.system.NativeType("void const *") java.nio.DoubleBuffer r25) {
            r0 = r14
            r1 = r15
            r2 = r16
            r3 = r17
            r4 = r18
            r5 = r19
            r6 = r20
            r7 = r21
            r8 = r22
            r9 = r23
            r10 = r24
            r11 = r25
            long r11 = org.lwjgl.system.MemoryUtil.memAddress(r11)
            nglTextureSubImage3DEXT(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            return
    }

    public static native void glCopyTextureSubImage3DEXT(@org.lwjgl.system.NativeType("GLuint") int r0, @org.lwjgl.system.NativeType("GLenum") int r1, @org.lwjgl.system.NativeType("GLint") int r2, @org.lwjgl.system.NativeType("GLint") int r3, @org.lwjgl.system.NativeType("GLint") int r4, @org.lwjgl.system.NativeType("GLint") int r5, @org.lwjgl.system.NativeType("GLint") int r6, @org.lwjgl.system.NativeType("GLint") int r7, @org.lwjgl.system.NativeType("GLsizei") int r8, @org.lwjgl.system.NativeType("GLsizei") int r9);

    public static native void glBindMultiTextureEXT(@org.lwjgl.system.NativeType("GLenum") int r0, @org.lwjgl.system.NativeType("GLenum") int r1, @org.lwjgl.system.NativeType("GLuint") int r2);

    public static native void nglMultiTexCoordPointerEXT(int r0, int r1, int r2, int r3, long r4);

    public static void glMultiTexCoordPointerEXT(@org.lwjgl.system.NativeType("GLenum") int r7, @org.lwjgl.system.NativeType("GLint") int r8, @org.lwjgl.system.NativeType("GLenum") int r9, @org.lwjgl.system.NativeType("GLsizei") int r10, @org.lwjgl.system.NativeType("void const *") java.nio.ByteBuffer r11) {
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            long r4 = org.lwjgl.system.MemoryUtil.memAddress(r4)
            nglMultiTexCoordPointerEXT(r0, r1, r2, r3, r4)
            return
    }

    public static void glMultiTexCoordPointerEXT(@org.lwjgl.system.NativeType("GLenum") int r7, @org.lwjgl.system.NativeType("GLint") int r8, @org.lwjgl.system.NativeType("GLenum") int r9, @org.lwjgl.system.NativeType("GLsizei") int r10, @org.lwjgl.system.NativeType("void const *") long r11) {
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            nglMultiTexCoordPointerEXT(r0, r1, r2, r3, r4)
            return
    }

    public static void glMultiTexCoordPointerEXT(@org.lwjgl.system.NativeType("GLenum") int r7, @org.lwjgl.system.NativeType("GLint") int r8, @org.lwjgl.system.NativeType("GLenum") int r9, @org.lwjgl.system.NativeType("GLsizei") int r10, @org.lwjgl.system.NativeType("void const *") java.nio.ShortBuffer r11) {
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            long r4 = org.lwjgl.system.MemoryUtil.memAddress(r4)
            nglMultiTexCoordPointerEXT(r0, r1, r2, r3, r4)
            return
    }

    public static void glMultiTexCoordPointerEXT(@org.lwjgl.system.NativeType("GLenum") int r7, @org.lwjgl.system.NativeType("GLint") int r8, @org.lwjgl.system.NativeType("GLenum") int r9, @org.lwjgl.system.NativeType("GLsizei") int r10, @org.lwjgl.system.NativeType("void const *") java.nio.IntBuffer r11) {
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            long r4 = org.lwjgl.system.MemoryUtil.memAddress(r4)
            nglMultiTexCoordPointerEXT(r0, r1, r2, r3, r4)
            return
    }

    public static void glMultiTexCoordPointerEXT(@org.lwjgl.system.NativeType("GLenum") int r7, @org.lwjgl.system.NativeType("GLint") int r8, @org.lwjgl.system.NativeType("GLenum") int r9, @org.lwjgl.system.NativeType("GLsizei") int r10, @org.lwjgl.system.NativeType("void const *") java.nio.FloatBuffer r11) {
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            long r4 = org.lwjgl.system.MemoryUtil.memAddress(r4)
            nglMultiTexCoordPointerEXT(r0, r1, r2, r3, r4)
            return
    }

    public static native void glMultiTexEnvfEXT(@org.lwjgl.system.NativeType("GLenum") int r0, @org.lwjgl.system.NativeType("GLenum") int r1, @org.lwjgl.system.NativeType("GLenum") int r2, @org.lwjgl.system.NativeType("GLfloat") float r3);

    public static native void nglMultiTexEnvfvEXT(int r0, int r1, int r2, long r3);

    public static void glMultiTexEnvfvEXT(@org.lwjgl.system.NativeType("GLenum") int r6, @org.lwjgl.system.NativeType("GLenum") int r7, @org.lwjgl.system.NativeType("GLenum") int r8, @org.lwjgl.system.NativeType("GLfloat const *") java.nio.FloatBuffer r9) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r9
            r1 = 4
            org.lwjgl.system.Checks.check(r0, r1)
        Lb:
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            long r3 = org.lwjgl.system.MemoryUtil.memAddress(r3)
            nglMultiTexEnvfvEXT(r0, r1, r2, r3)
            return
    }

    public static native void glMultiTexEnviEXT(@org.lwjgl.system.NativeType("GLenum") int r0, @org.lwjgl.system.NativeType("GLenum") int r1, @org.lwjgl.system.NativeType("GLenum") int r2, @org.lwjgl.system.NativeType("GLint") int r3);

    public static native void nglMultiTexEnvivEXT(int r0, int r1, int r2, long r3);

    public static void glMultiTexEnvivEXT(@org.lwjgl.system.NativeType("GLenum") int r6, @org.lwjgl.system.NativeType("GLenum") int r7, @org.lwjgl.system.NativeType("GLenum") int r8, @org.lwjgl.system.NativeType("GLint const *") java.nio.IntBuffer r9) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r9
            r1 = 4
            org.lwjgl.system.Checks.check(r0, r1)
        Lb:
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            long r3 = org.lwjgl.system.MemoryUtil.memAddress(r3)
            nglMultiTexEnvivEXT(r0, r1, r2, r3)
            return
    }

    public static native void glMultiTexGendEXT(@org.lwjgl.system.NativeType("GLenum") int r0, @org.lwjgl.system.NativeType("GLenum") int r1, @org.lwjgl.system.NativeType("GLenum") int r2, @org.lwjgl.system.NativeType("GLdouble") double r3);

    public static native void nglMultiTexGendvEXT(int r0, int r1, int r2, long r3);

    public static void glMultiTexGendvEXT(@org.lwjgl.system.NativeType("GLenum") int r6, @org.lwjgl.system.NativeType("GLenum") int r7, @org.lwjgl.system.NativeType("GLenum") int r8, @org.lwjgl.system.NativeType("GLdouble const *") java.nio.DoubleBuffer r9) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r9
            r1 = 4
            org.lwjgl.system.Checks.check(r0, r1)
        Lb:
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            long r3 = org.lwjgl.system.MemoryUtil.memAddress(r3)
            nglMultiTexGendvEXT(r0, r1, r2, r3)
            return
    }

    public static native void glMultiTexGenfEXT(@org.lwjgl.system.NativeType("GLenum") int r0, @org.lwjgl.system.NativeType("GLenum") int r1, @org.lwjgl.system.NativeType("GLenum") int r2, @org.lwjgl.system.NativeType("GLfloat") float r3);

    public static native void nglMultiTexGenfvEXT(int r0, int r1, int r2, long r3);

    public static void glMultiTexGenfvEXT(@org.lwjgl.system.NativeType("GLenum") int r6, @org.lwjgl.system.NativeType("GLenum") int r7, @org.lwjgl.system.NativeType("GLenum") int r8, @org.lwjgl.system.NativeType("GLfloat const *") java.nio.FloatBuffer r9) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r9
            r1 = 4
            org.lwjgl.system.Checks.check(r0, r1)
        Lb:
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            long r3 = org.lwjgl.system.MemoryUtil.memAddress(r3)
            nglMultiTexGenfvEXT(r0, r1, r2, r3)
            return
    }

    public static native void glMultiTexGeniEXT(@org.lwjgl.system.NativeType("GLenum") int r0, @org.lwjgl.system.NativeType("GLenum") int r1, @org.lwjgl.system.NativeType("GLenum") int r2, @org.lwjgl.system.NativeType("GLint") int r3);

    public static native void nglMultiTexGenivEXT(int r0, int r1, int r2, long r3);

    public static void glMultiTexGenivEXT(@org.lwjgl.system.NativeType("GLenum") int r6, @org.lwjgl.system.NativeType("GLenum") int r7, @org.lwjgl.system.NativeType("GLenum") int r8, @org.lwjgl.system.NativeType("GLint const *") java.nio.IntBuffer r9) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r9
            r1 = 4
            org.lwjgl.system.Checks.check(r0, r1)
        Lb:
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            long r3 = org.lwjgl.system.MemoryUtil.memAddress(r3)
            nglMultiTexGenivEXT(r0, r1, r2, r3)
            return
    }

    public static native void nglGetMultiTexEnvfvEXT(int r0, int r1, int r2, long r3);

    public static void glGetMultiTexEnvfvEXT(@org.lwjgl.system.NativeType("GLenum") int r6, @org.lwjgl.system.NativeType("GLenum") int r7, @org.lwjgl.system.NativeType("GLenum") int r8, @org.lwjgl.system.NativeType("GLfloat *") java.nio.FloatBuffer r9) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r9
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
        Lb:
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            long r3 = org.lwjgl.system.MemoryUtil.memAddress(r3)
            nglGetMultiTexEnvfvEXT(r0, r1, r2, r3)
            return
    }

    @org.lwjgl.system.NativeType("void")
    public static float glGetMultiTexEnvfEXT(@org.lwjgl.system.NativeType("GLenum") int r6, @org.lwjgl.system.NativeType("GLenum") int r7, @org.lwjgl.system.NativeType("GLenum") int r8) {
            org.lwjgl.system.MemoryStack r0 = org.lwjgl.system.MemoryStack.stackGet()
            r9 = r0
            r0 = r9
            int r0 = r0.getPointer()
            r10 = r0
            r0 = r9
            r1 = 1
            java.nio.FloatBuffer r0 = r0.callocFloat(r1)     // Catch: java.lang.Throwable -> L2d
            r11 = r0
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r11
            long r3 = org.lwjgl.system.MemoryUtil.memAddress(r3)     // Catch: java.lang.Throwable -> L2d
            nglGetMultiTexEnvfvEXT(r0, r1, r2, r3)     // Catch: java.lang.Throwable -> L2d
            r0 = r11
            r1 = 0
            float r0 = r0.get(r1)     // Catch: java.lang.Throwable -> L2d
            r12 = r0
            r0 = r9
            r1 = r10
            r0.setPointer(r1)
            r0 = r12
            return r0
        L2d:
            r13 = move-exception
            r0 = r9
            r1 = r10
            r0.setPointer(r1)
            r0 = r13
            throw r0
    }

    public static native void nglGetMultiTexEnvivEXT(int r0, int r1, int r2, long r3);

    public static void glGetMultiTexEnvivEXT(@org.lwjgl.system.NativeType("GLenum") int r6, @org.lwjgl.system.NativeType("GLenum") int r7, @org.lwjgl.system.NativeType("GLenum") int r8, @org.lwjgl.system.NativeType("GLint *") java.nio.IntBuffer r9) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r9
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
        Lb:
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            long r3 = org.lwjgl.system.MemoryUtil.memAddress(r3)
            nglGetMultiTexEnvivEXT(r0, r1, r2, r3)
            return
    }

    @org.lwjgl.system.NativeType("void")
    public static int glGetMultiTexEnviEXT(@org.lwjgl.system.NativeType("GLenum") int r6, @org.lwjgl.system.NativeType("GLenum") int r7, @org.lwjgl.system.NativeType("GLenum") int r8) {
            org.lwjgl.system.MemoryStack r0 = org.lwjgl.system.MemoryStack.stackGet()
            r9 = r0
            r0 = r9
            int r0 = r0.getPointer()
            r10 = r0
            r0 = r9
            r1 = 1
            java.nio.IntBuffer r0 = r0.callocInt(r1)     // Catch: java.lang.Throwable -> L2d
            r11 = r0
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r11
            long r3 = org.lwjgl.system.MemoryUtil.memAddress(r3)     // Catch: java.lang.Throwable -> L2d
            nglGetMultiTexEnvivEXT(r0, r1, r2, r3)     // Catch: java.lang.Throwable -> L2d
            r0 = r11
            r1 = 0
            int r0 = r0.get(r1)     // Catch: java.lang.Throwable -> L2d
            r12 = r0
            r0 = r9
            r1 = r10
            r0.setPointer(r1)
            r0 = r12
            return r0
        L2d:
            r13 = move-exception
            r0 = r9
            r1 = r10
            r0.setPointer(r1)
            r0 = r13
            throw r0
    }

    public static native void nglGetMultiTexGendvEXT(int r0, int r1, int r2, long r3);

    public static void glGetMultiTexGendvEXT(@org.lwjgl.system.NativeType("GLenum") int r6, @org.lwjgl.system.NativeType("GLenum") int r7, @org.lwjgl.system.NativeType("GLenum") int r8, @org.lwjgl.system.NativeType("GLdouble *") java.nio.DoubleBuffer r9) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r9
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
        Lb:
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            long r3 = org.lwjgl.system.MemoryUtil.memAddress(r3)
            nglGetMultiTexGendvEXT(r0, r1, r2, r3)
            return
    }

    @org.lwjgl.system.NativeType("void")
    public static double glGetMultiTexGendEXT(@org.lwjgl.system.NativeType("GLenum") int r6, @org.lwjgl.system.NativeType("GLenum") int r7, @org.lwjgl.system.NativeType("GLenum") int r8) {
            org.lwjgl.system.MemoryStack r0 = org.lwjgl.system.MemoryStack.stackGet()
            r9 = r0
            r0 = r9
            int r0 = r0.getPointer()
            r10 = r0
            r0 = r9
            r1 = 1
            java.nio.DoubleBuffer r0 = r0.callocDouble(r1)     // Catch: java.lang.Throwable -> L2d
            r11 = r0
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r11
            long r3 = org.lwjgl.system.MemoryUtil.memAddress(r3)     // Catch: java.lang.Throwable -> L2d
            nglGetMultiTexGendvEXT(r0, r1, r2, r3)     // Catch: java.lang.Throwable -> L2d
            r0 = r11
            r1 = 0
            double r0 = r0.get(r1)     // Catch: java.lang.Throwable -> L2d
            r12 = r0
            r0 = r9
            r1 = r10
            r0.setPointer(r1)
            r0 = r12
            return r0
        L2d:
            r14 = move-exception
            r0 = r9
            r1 = r10
            r0.setPointer(r1)
            r0 = r14
            throw r0
    }

    public static native void nglGetMultiTexGenfvEXT(int r0, int r1, int r2, long r3);

    public static void glGetMultiTexGenfvEXT(@org.lwjgl.system.NativeType("GLenum") int r6, @org.lwjgl.system.NativeType("GLenum") int r7, @org.lwjgl.system.NativeType("GLenum") int r8, @org.lwjgl.system.NativeType("GLfloat *") java.nio.FloatBuffer r9) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r9
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
        Lb:
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            long r3 = org.lwjgl.system.MemoryUtil.memAddress(r3)
            nglGetMultiTexGenfvEXT(r0, r1, r2, r3)
            return
    }

    @org.lwjgl.system.NativeType("void")
    public static float glGetMultiTexGenfEXT(@org.lwjgl.system.NativeType("GLenum") int r6, @org.lwjgl.system.NativeType("GLenum") int r7, @org.lwjgl.system.NativeType("GLenum") int r8) {
            org.lwjgl.system.MemoryStack r0 = org.lwjgl.system.MemoryStack.stackGet()
            r9 = r0
            r0 = r9
            int r0 = r0.getPointer()
            r10 = r0
            r0 = r9
            r1 = 1
            java.nio.FloatBuffer r0 = r0.callocFloat(r1)     // Catch: java.lang.Throwable -> L2d
            r11 = r0
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r11
            long r3 = org.lwjgl.system.MemoryUtil.memAddress(r3)     // Catch: java.lang.Throwable -> L2d
            nglGetMultiTexGenfvEXT(r0, r1, r2, r3)     // Catch: java.lang.Throwable -> L2d
            r0 = r11
            r1 = 0
            float r0 = r0.get(r1)     // Catch: java.lang.Throwable -> L2d
            r12 = r0
            r0 = r9
            r1 = r10
            r0.setPointer(r1)
            r0 = r12
            return r0
        L2d:
            r13 = move-exception
            r0 = r9
            r1 = r10
            r0.setPointer(r1)
            r0 = r13
            throw r0
    }

    public static native void nglGetMultiTexGenivEXT(int r0, int r1, int r2, long r3);

    public static void glGetMultiTexGenivEXT(@org.lwjgl.system.NativeType("GLenum") int r6, @org.lwjgl.system.NativeType("GLenum") int r7, @org.lwjgl.system.NativeType("GLenum") int r8, @org.lwjgl.system.NativeType("GLint *") java.nio.IntBuffer r9) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r9
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
        Lb:
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            long r3 = org.lwjgl.system.MemoryUtil.memAddress(r3)
            nglGetMultiTexGenivEXT(r0, r1, r2, r3)
            return
    }

    @org.lwjgl.system.NativeType("void")
    public static int glGetMultiTexGeniEXT(@org.lwjgl.system.NativeType("GLenum") int r6, @org.lwjgl.system.NativeType("GLenum") int r7, @org.lwjgl.system.NativeType("GLenum") int r8) {
            org.lwjgl.system.MemoryStack r0 = org.lwjgl.system.MemoryStack.stackGet()
            r9 = r0
            r0 = r9
            int r0 = r0.getPointer()
            r10 = r0
            r0 = r9
            r1 = 1
            java.nio.IntBuffer r0 = r0.callocInt(r1)     // Catch: java.lang.Throwable -> L2d
            r11 = r0
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r11
            long r3 = org.lwjgl.system.MemoryUtil.memAddress(r3)     // Catch: java.lang.Throwable -> L2d
            nglGetMultiTexGenivEXT(r0, r1, r2, r3)     // Catch: java.lang.Throwable -> L2d
            r0 = r11
            r1 = 0
            int r0 = r0.get(r1)     // Catch: java.lang.Throwable -> L2d
            r12 = r0
            r0 = r9
            r1 = r10
            r0.setPointer(r1)
            r0 = r12
            return r0
        L2d:
            r13 = move-exception
            r0 = r9
            r1 = r10
            r0.setPointer(r1)
            r0 = r13
            throw r0
    }

    public static native void glMultiTexParameteriEXT(@org.lwjgl.system.NativeType("GLenum") int r0, @org.lwjgl.system.NativeType("GLenum") int r1, @org.lwjgl.system.NativeType("GLenum") int r2, @org.lwjgl.system.NativeType("GLint") int r3);

    public static native void nglMultiTexParameterivEXT(int r0, int r1, int r2, long r3);

    public static void glMultiTexParameterivEXT(@org.lwjgl.system.NativeType("GLenum") int r6, @org.lwjgl.system.NativeType("GLenum") int r7, @org.lwjgl.system.NativeType("GLenum") int r8, @org.lwjgl.system.NativeType("GLint const *") java.nio.IntBuffer r9) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r9
            r1 = 4
            org.lwjgl.system.Checks.check(r0, r1)
        Lb:
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            long r3 = org.lwjgl.system.MemoryUtil.memAddress(r3)
            nglMultiTexParameterivEXT(r0, r1, r2, r3)
            return
    }

    public static native void glMultiTexParameterfEXT(@org.lwjgl.system.NativeType("GLenum") int r0, @org.lwjgl.system.NativeType("GLenum") int r1, @org.lwjgl.system.NativeType("GLenum") int r2, @org.lwjgl.system.NativeType("GLfloat") float r3);

    public static native void nglMultiTexParameterfvEXT(int r0, int r1, int r2, long r3);

    public static void glMultiTexParameterfvEXT(@org.lwjgl.system.NativeType("GLenum") int r6, @org.lwjgl.system.NativeType("GLenum") int r7, @org.lwjgl.system.NativeType("GLenum") int r8, @org.lwjgl.system.NativeType("GLfloat const *") java.nio.FloatBuffer r9) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r9
            r1 = 4
            org.lwjgl.system.Checks.check(r0, r1)
        Lb:
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            long r3 = org.lwjgl.system.MemoryUtil.memAddress(r3)
            nglMultiTexParameterfvEXT(r0, r1, r2, r3)
            return
    }

    public static native void nglMultiTexImage1DEXT(int r0, int r1, int r2, int r3, int r4, int r5, int r6, int r7, long r8);

    public static void glMultiTexImage1DEXT(@org.lwjgl.system.NativeType("GLenum") int r11, @org.lwjgl.system.NativeType("GLenum") int r12, @org.lwjgl.system.NativeType("GLint") int r13, @org.lwjgl.system.NativeType("GLint") int r14, @org.lwjgl.system.NativeType("GLsizei") int r15, @org.lwjgl.system.NativeType("GLint") int r16, @org.lwjgl.system.NativeType("GLenum") int r17, @org.lwjgl.system.NativeType("GLenum") int r18, @javax.annotation.Nullable @org.lwjgl.system.NativeType("void const *") java.nio.ByteBuffer r19) {
            r0 = r11
            r1 = r12
            r2 = r13
            r3 = r14
            r4 = r15
            r5 = r16
            r6 = r17
            r7 = r18
            r8 = r19
            long r8 = org.lwjgl.system.MemoryUtil.memAddressSafe(r8)
            nglMultiTexImage1DEXT(r0, r1, r2, r3, r4, r5, r6, r7, r8)
            return
    }

    public static void glMultiTexImage1DEXT(@org.lwjgl.system.NativeType("GLenum") int r11, @org.lwjgl.system.NativeType("GLenum") int r12, @org.lwjgl.system.NativeType("GLint") int r13, @org.lwjgl.system.NativeType("GLint") int r14, @org.lwjgl.system.NativeType("GLsizei") int r15, @org.lwjgl.system.NativeType("GLint") int r16, @org.lwjgl.system.NativeType("GLenum") int r17, @org.lwjgl.system.NativeType("GLenum") int r18, @org.lwjgl.system.NativeType("void const *") long r19) {
            r0 = r11
            r1 = r12
            r2 = r13
            r3 = r14
            r4 = r15
            r5 = r16
            r6 = r17
            r7 = r18
            r8 = r19
            nglMultiTexImage1DEXT(r0, r1, r2, r3, r4, r5, r6, r7, r8)
            return
    }

    public static void glMultiTexImage1DEXT(@org.lwjgl.system.NativeType("GLenum") int r11, @org.lwjgl.system.NativeType("GLenum") int r12, @org.lwjgl.system.NativeType("GLint") int r13, @org.lwjgl.system.NativeType("GLint") int r14, @org.lwjgl.system.NativeType("GLsizei") int r15, @org.lwjgl.system.NativeType("GLint") int r16, @org.lwjgl.system.NativeType("GLenum") int r17, @org.lwjgl.system.NativeType("GLenum") int r18, @javax.annotation.Nullable @org.lwjgl.system.NativeType("void const *") java.nio.ShortBuffer r19) {
            r0 = r11
            r1 = r12
            r2 = r13
            r3 = r14
            r4 = r15
            r5 = r16
            r6 = r17
            r7 = r18
            r8 = r19
            long r8 = org.lwjgl.system.MemoryUtil.memAddressSafe(r8)
            nglMultiTexImage1DEXT(r0, r1, r2, r3, r4, r5, r6, r7, r8)
            return
    }

    public static void glMultiTexImage1DEXT(@org.lwjgl.system.NativeType("GLenum") int r11, @org.lwjgl.system.NativeType("GLenum") int r12, @org.lwjgl.system.NativeType("GLint") int r13, @org.lwjgl.system.NativeType("GLint") int r14, @org.lwjgl.system.NativeType("GLsizei") int r15, @org.lwjgl.system.NativeType("GLint") int r16, @org.lwjgl.system.NativeType("GLenum") int r17, @org.lwjgl.system.NativeType("GLenum") int r18, @javax.annotation.Nullable @org.lwjgl.system.NativeType("void const *") java.nio.IntBuffer r19) {
            r0 = r11
            r1 = r12
            r2 = r13
            r3 = r14
            r4 = r15
            r5 = r16
            r6 = r17
            r7 = r18
            r8 = r19
            long r8 = org.lwjgl.system.MemoryUtil.memAddressSafe(r8)
            nglMultiTexImage1DEXT(r0, r1, r2, r3, r4, r5, r6, r7, r8)
            return
    }

    public static void glMultiTexImage1DEXT(@org.lwjgl.system.NativeType("GLenum") int r11, @org.lwjgl.system.NativeType("GLenum") int r12, @org.lwjgl.system.NativeType("GLint") int r13, @org.lwjgl.system.NativeType("GLint") int r14, @org.lwjgl.system.NativeType("GLsizei") int r15, @org.lwjgl.system.NativeType("GLint") int r16, @org.lwjgl.system.NativeType("GLenum") int r17, @org.lwjgl.system.NativeType("GLenum") int r18, @javax.annotation.Nullable @org.lwjgl.system.NativeType("void const *") java.nio.FloatBuffer r19) {
            r0 = r11
            r1 = r12
            r2 = r13
            r3 = r14
            r4 = r15
            r5 = r16
            r6 = r17
            r7 = r18
            r8 = r19
            long r8 = org.lwjgl.system.MemoryUtil.memAddressSafe(r8)
            nglMultiTexImage1DEXT(r0, r1, r2, r3, r4, r5, r6, r7, r8)
            return
    }

    public static void glMultiTexImage1DEXT(@org.lwjgl.system.NativeType("GLenum") int r11, @org.lwjgl.system.NativeType("GLenum") int r12, @org.lwjgl.system.NativeType("GLint") int r13, @org.lwjgl.system.NativeType("GLint") int r14, @org.lwjgl.system.NativeType("GLsizei") int r15, @org.lwjgl.system.NativeType("GLint") int r16, @org.lwjgl.system.NativeType("GLenum") int r17, @org.lwjgl.system.NativeType("GLenum") int r18, @javax.annotation.Nullable @org.lwjgl.system.NativeType("void const *") java.nio.DoubleBuffer r19) {
            r0 = r11
            r1 = r12
            r2 = r13
            r3 = r14
            r4 = r15
            r5 = r16
            r6 = r17
            r7 = r18
            r8 = r19
            long r8 = org.lwjgl.system.MemoryUtil.memAddressSafe(r8)
            nglMultiTexImage1DEXT(r0, r1, r2, r3, r4, r5, r6, r7, r8)
            return
    }

    public static native void nglMultiTexImage2DEXT(int r0, int r1, int r2, int r3, int r4, int r5, int r6, int r7, int r8, long r9);

    public static void glMultiTexImage2DEXT(@org.lwjgl.system.NativeType("GLenum") int r12, @org.lwjgl.system.NativeType("GLenum") int r13, @org.lwjgl.system.NativeType("GLint") int r14, @org.lwjgl.system.NativeType("GLint") int r15, @org.lwjgl.system.NativeType("GLsizei") int r16, @org.lwjgl.system.NativeType("GLsizei") int r17, @org.lwjgl.system.NativeType("GLint") int r18, @org.lwjgl.system.NativeType("GLenum") int r19, @org.lwjgl.system.NativeType("GLenum") int r20, @javax.annotation.Nullable @org.lwjgl.system.NativeType("void const *") java.nio.ByteBuffer r21) {
            r0 = r12
            r1 = r13
            r2 = r14
            r3 = r15
            r4 = r16
            r5 = r17
            r6 = r18
            r7 = r19
            r8 = r20
            r9 = r21
            long r9 = org.lwjgl.system.MemoryUtil.memAddressSafe(r9)
            nglMultiTexImage2DEXT(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9)
            return
    }

    public static void glMultiTexImage2DEXT(@org.lwjgl.system.NativeType("GLenum") int r12, @org.lwjgl.system.NativeType("GLenum") int r13, @org.lwjgl.system.NativeType("GLint") int r14, @org.lwjgl.system.NativeType("GLint") int r15, @org.lwjgl.system.NativeType("GLsizei") int r16, @org.lwjgl.system.NativeType("GLsizei") int r17, @org.lwjgl.system.NativeType("GLint") int r18, @org.lwjgl.system.NativeType("GLenum") int r19, @org.lwjgl.system.NativeType("GLenum") int r20, @org.lwjgl.system.NativeType("void const *") long r21) {
            r0 = r12
            r1 = r13
            r2 = r14
            r3 = r15
            r4 = r16
            r5 = r17
            r6 = r18
            r7 = r19
            r8 = r20
            r9 = r21
            nglMultiTexImage2DEXT(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9)
            return
    }

    public static void glMultiTexImage2DEXT(@org.lwjgl.system.NativeType("GLenum") int r12, @org.lwjgl.system.NativeType("GLenum") int r13, @org.lwjgl.system.NativeType("GLint") int r14, @org.lwjgl.system.NativeType("GLint") int r15, @org.lwjgl.system.NativeType("GLsizei") int r16, @org.lwjgl.system.NativeType("GLsizei") int r17, @org.lwjgl.system.NativeType("GLint") int r18, @org.lwjgl.system.NativeType("GLenum") int r19, @org.lwjgl.system.NativeType("GLenum") int r20, @javax.annotation.Nullable @org.lwjgl.system.NativeType("void const *") java.nio.ShortBuffer r21) {
            r0 = r12
            r1 = r13
            r2 = r14
            r3 = r15
            r4 = r16
            r5 = r17
            r6 = r18
            r7 = r19
            r8 = r20
            r9 = r21
            long r9 = org.lwjgl.system.MemoryUtil.memAddressSafe(r9)
            nglMultiTexImage2DEXT(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9)
            return
    }

    public static void glMultiTexImage2DEXT(@org.lwjgl.system.NativeType("GLenum") int r12, @org.lwjgl.system.NativeType("GLenum") int r13, @org.lwjgl.system.NativeType("GLint") int r14, @org.lwjgl.system.NativeType("GLint") int r15, @org.lwjgl.system.NativeType("GLsizei") int r16, @org.lwjgl.system.NativeType("GLsizei") int r17, @org.lwjgl.system.NativeType("GLint") int r18, @org.lwjgl.system.NativeType("GLenum") int r19, @org.lwjgl.system.NativeType("GLenum") int r20, @javax.annotation.Nullable @org.lwjgl.system.NativeType("void const *") java.nio.IntBuffer r21) {
            r0 = r12
            r1 = r13
            r2 = r14
            r3 = r15
            r4 = r16
            r5 = r17
            r6 = r18
            r7 = r19
            r8 = r20
            r9 = r21
            long r9 = org.lwjgl.system.MemoryUtil.memAddressSafe(r9)
            nglMultiTexImage2DEXT(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9)
            return
    }

    public static void glMultiTexImage2DEXT(@org.lwjgl.system.NativeType("GLenum") int r12, @org.lwjgl.system.NativeType("GLenum") int r13, @org.lwjgl.system.NativeType("GLint") int r14, @org.lwjgl.system.NativeType("GLint") int r15, @org.lwjgl.system.NativeType("GLsizei") int r16, @org.lwjgl.system.NativeType("GLsizei") int r17, @org.lwjgl.system.NativeType("GLint") int r18, @org.lwjgl.system.NativeType("GLenum") int r19, @org.lwjgl.system.NativeType("GLenum") int r20, @javax.annotation.Nullable @org.lwjgl.system.NativeType("void const *") java.nio.FloatBuffer r21) {
            r0 = r12
            r1 = r13
            r2 = r14
            r3 = r15
            r4 = r16
            r5 = r17
            r6 = r18
            r7 = r19
            r8 = r20
            r9 = r21
            long r9 = org.lwjgl.system.MemoryUtil.memAddressSafe(r9)
            nglMultiTexImage2DEXT(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9)
            return
    }

    public static void glMultiTexImage2DEXT(@org.lwjgl.system.NativeType("GLenum") int r12, @org.lwjgl.system.NativeType("GLenum") int r13, @org.lwjgl.system.NativeType("GLint") int r14, @org.lwjgl.system.NativeType("GLint") int r15, @org.lwjgl.system.NativeType("GLsizei") int r16, @org.lwjgl.system.NativeType("GLsizei") int r17, @org.lwjgl.system.NativeType("GLint") int r18, @org.lwjgl.system.NativeType("GLenum") int r19, @org.lwjgl.system.NativeType("GLenum") int r20, @javax.annotation.Nullable @org.lwjgl.system.NativeType("void const *") java.nio.DoubleBuffer r21) {
            r0 = r12
            r1 = r13
            r2 = r14
            r3 = r15
            r4 = r16
            r5 = r17
            r6 = r18
            r7 = r19
            r8 = r20
            r9 = r21
            long r9 = org.lwjgl.system.MemoryUtil.memAddressSafe(r9)
            nglMultiTexImage2DEXT(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9)
            return
    }

    public static native void nglMultiTexSubImage1DEXT(int r0, int r1, int r2, int r3, int r4, int r5, int r6, long r7);

    public static void glMultiTexSubImage1DEXT(@org.lwjgl.system.NativeType("GLenum") int r10, @org.lwjgl.system.NativeType("GLenum") int r11, @org.lwjgl.system.NativeType("GLint") int r12, @org.lwjgl.system.NativeType("GLint") int r13, @org.lwjgl.system.NativeType("GLsizei") int r14, @org.lwjgl.system.NativeType("GLenum") int r15, @org.lwjgl.system.NativeType("GLenum") int r16, @org.lwjgl.system.NativeType("void const *") java.nio.ByteBuffer r17) {
            r0 = r10
            r1 = r11
            r2 = r12
            r3 = r13
            r4 = r14
            r5 = r15
            r6 = r16
            r7 = r17
            long r7 = org.lwjgl.system.MemoryUtil.memAddress(r7)
            nglMultiTexSubImage1DEXT(r0, r1, r2, r3, r4, r5, r6, r7)
            return
    }

    public static void glMultiTexSubImage1DEXT(@org.lwjgl.system.NativeType("GLenum") int r10, @org.lwjgl.system.NativeType("GLenum") int r11, @org.lwjgl.system.NativeType("GLint") int r12, @org.lwjgl.system.NativeType("GLint") int r13, @org.lwjgl.system.NativeType("GLsizei") int r14, @org.lwjgl.system.NativeType("GLenum") int r15, @org.lwjgl.system.NativeType("GLenum") int r16, @org.lwjgl.system.NativeType("void const *") long r17) {
            r0 = r10
            r1 = r11
            r2 = r12
            r3 = r13
            r4 = r14
            r5 = r15
            r6 = r16
            r7 = r17
            nglMultiTexSubImage1DEXT(r0, r1, r2, r3, r4, r5, r6, r7)
            return
    }

    public static void glMultiTexSubImage1DEXT(@org.lwjgl.system.NativeType("GLenum") int r10, @org.lwjgl.system.NativeType("GLenum") int r11, @org.lwjgl.system.NativeType("GLint") int r12, @org.lwjgl.system.NativeType("GLint") int r13, @org.lwjgl.system.NativeType("GLsizei") int r14, @org.lwjgl.system.NativeType("GLenum") int r15, @org.lwjgl.system.NativeType("GLenum") int r16, @org.lwjgl.system.NativeType("void const *") java.nio.ShortBuffer r17) {
            r0 = r10
            r1 = r11
            r2 = r12
            r3 = r13
            r4 = r14
            r5 = r15
            r6 = r16
            r7 = r17
            long r7 = org.lwjgl.system.MemoryUtil.memAddress(r7)
            nglMultiTexSubImage1DEXT(r0, r1, r2, r3, r4, r5, r6, r7)
            return
    }

    public static void glMultiTexSubImage1DEXT(@org.lwjgl.system.NativeType("GLenum") int r10, @org.lwjgl.system.NativeType("GLenum") int r11, @org.lwjgl.system.NativeType("GLint") int r12, @org.lwjgl.system.NativeType("GLint") int r13, @org.lwjgl.system.NativeType("GLsizei") int r14, @org.lwjgl.system.NativeType("GLenum") int r15, @org.lwjgl.system.NativeType("GLenum") int r16, @org.lwjgl.system.NativeType("void const *") java.nio.IntBuffer r17) {
            r0 = r10
            r1 = r11
            r2 = r12
            r3 = r13
            r4 = r14
            r5 = r15
            r6 = r16
            r7 = r17
            long r7 = org.lwjgl.system.MemoryUtil.memAddress(r7)
            nglMultiTexSubImage1DEXT(r0, r1, r2, r3, r4, r5, r6, r7)
            return
    }

    public static void glMultiTexSubImage1DEXT(@org.lwjgl.system.NativeType("GLenum") int r10, @org.lwjgl.system.NativeType("GLenum") int r11, @org.lwjgl.system.NativeType("GLint") int r12, @org.lwjgl.system.NativeType("GLint") int r13, @org.lwjgl.system.NativeType("GLsizei") int r14, @org.lwjgl.system.NativeType("GLenum") int r15, @org.lwjgl.system.NativeType("GLenum") int r16, @org.lwjgl.system.NativeType("void const *") java.nio.FloatBuffer r17) {
            r0 = r10
            r1 = r11
            r2 = r12
            r3 = r13
            r4 = r14
            r5 = r15
            r6 = r16
            r7 = r17
            long r7 = org.lwjgl.system.MemoryUtil.memAddress(r7)
            nglMultiTexSubImage1DEXT(r0, r1, r2, r3, r4, r5, r6, r7)
            return
    }

    public static void glMultiTexSubImage1DEXT(@org.lwjgl.system.NativeType("GLenum") int r10, @org.lwjgl.system.NativeType("GLenum") int r11, @org.lwjgl.system.NativeType("GLint") int r12, @org.lwjgl.system.NativeType("GLint") int r13, @org.lwjgl.system.NativeType("GLsizei") int r14, @org.lwjgl.system.NativeType("GLenum") int r15, @org.lwjgl.system.NativeType("GLenum") int r16, @org.lwjgl.system.NativeType("void const *") java.nio.DoubleBuffer r17) {
            r0 = r10
            r1 = r11
            r2 = r12
            r3 = r13
            r4 = r14
            r5 = r15
            r6 = r16
            r7 = r17
            long r7 = org.lwjgl.system.MemoryUtil.memAddress(r7)
            nglMultiTexSubImage1DEXT(r0, r1, r2, r3, r4, r5, r6, r7)
            return
    }

    public static native void nglMultiTexSubImage2DEXT(int r0, int r1, int r2, int r3, int r4, int r5, int r6, int r7, int r8, long r9);

    public static void glMultiTexSubImage2DEXT(@org.lwjgl.system.NativeType("GLenum") int r12, @org.lwjgl.system.NativeType("GLenum") int r13, @org.lwjgl.system.NativeType("GLint") int r14, @org.lwjgl.system.NativeType("GLint") int r15, @org.lwjgl.system.NativeType("GLint") int r16, @org.lwjgl.system.NativeType("GLsizei") int r17, @org.lwjgl.system.NativeType("GLsizei") int r18, @org.lwjgl.system.NativeType("GLenum") int r19, @org.lwjgl.system.NativeType("GLenum") int r20, @org.lwjgl.system.NativeType("void const *") java.nio.ByteBuffer r21) {
            r0 = r12
            r1 = r13
            r2 = r14
            r3 = r15
            r4 = r16
            r5 = r17
            r6 = r18
            r7 = r19
            r8 = r20
            r9 = r21
            long r9 = org.lwjgl.system.MemoryUtil.memAddress(r9)
            nglMultiTexSubImage2DEXT(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9)
            return
    }

    public static void glMultiTexSubImage2DEXT(@org.lwjgl.system.NativeType("GLenum") int r12, @org.lwjgl.system.NativeType("GLenum") int r13, @org.lwjgl.system.NativeType("GLint") int r14, @org.lwjgl.system.NativeType("GLint") int r15, @org.lwjgl.system.NativeType("GLint") int r16, @org.lwjgl.system.NativeType("GLsizei") int r17, @org.lwjgl.system.NativeType("GLsizei") int r18, @org.lwjgl.system.NativeType("GLenum") int r19, @org.lwjgl.system.NativeType("GLenum") int r20, @org.lwjgl.system.NativeType("void const *") long r21) {
            r0 = r12
            r1 = r13
            r2 = r14
            r3 = r15
            r4 = r16
            r5 = r17
            r6 = r18
            r7 = r19
            r8 = r20
            r9 = r21
            nglMultiTexSubImage2DEXT(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9)
            return
    }

    public static void glMultiTexSubImage2DEXT(@org.lwjgl.system.NativeType("GLenum") int r12, @org.lwjgl.system.NativeType("GLenum") int r13, @org.lwjgl.system.NativeType("GLint") int r14, @org.lwjgl.system.NativeType("GLint") int r15, @org.lwjgl.system.NativeType("GLint") int r16, @org.lwjgl.system.NativeType("GLsizei") int r17, @org.lwjgl.system.NativeType("GLsizei") int r18, @org.lwjgl.system.NativeType("GLenum") int r19, @org.lwjgl.system.NativeType("GLenum") int r20, @org.lwjgl.system.NativeType("void const *") java.nio.ShortBuffer r21) {
            r0 = r12
            r1 = r13
            r2 = r14
            r3 = r15
            r4 = r16
            r5 = r17
            r6 = r18
            r7 = r19
            r8 = r20
            r9 = r21
            long r9 = org.lwjgl.system.MemoryUtil.memAddress(r9)
            nglMultiTexSubImage2DEXT(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9)
            return
    }

    public static void glMultiTexSubImage2DEXT(@org.lwjgl.system.NativeType("GLenum") int r12, @org.lwjgl.system.NativeType("GLenum") int r13, @org.lwjgl.system.NativeType("GLint") int r14, @org.lwjgl.system.NativeType("GLint") int r15, @org.lwjgl.system.NativeType("GLint") int r16, @org.lwjgl.system.NativeType("GLsizei") int r17, @org.lwjgl.system.NativeType("GLsizei") int r18, @org.lwjgl.system.NativeType("GLenum") int r19, @org.lwjgl.system.NativeType("GLenum") int r20, @org.lwjgl.system.NativeType("void const *") java.nio.IntBuffer r21) {
            r0 = r12
            r1 = r13
            r2 = r14
            r3 = r15
            r4 = r16
            r5 = r17
            r6 = r18
            r7 = r19
            r8 = r20
            r9 = r21
            long r9 = org.lwjgl.system.MemoryUtil.memAddress(r9)
            nglMultiTexSubImage2DEXT(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9)
            return
    }

    public static void glMultiTexSubImage2DEXT(@org.lwjgl.system.NativeType("GLenum") int r12, @org.lwjgl.system.NativeType("GLenum") int r13, @org.lwjgl.system.NativeType("GLint") int r14, @org.lwjgl.system.NativeType("GLint") int r15, @org.lwjgl.system.NativeType("GLint") int r16, @org.lwjgl.system.NativeType("GLsizei") int r17, @org.lwjgl.system.NativeType("GLsizei") int r18, @org.lwjgl.system.NativeType("GLenum") int r19, @org.lwjgl.system.NativeType("GLenum") int r20, @org.lwjgl.system.NativeType("void const *") java.nio.FloatBuffer r21) {
            r0 = r12
            r1 = r13
            r2 = r14
            r3 = r15
            r4 = r16
            r5 = r17
            r6 = r18
            r7 = r19
            r8 = r20
            r9 = r21
            long r9 = org.lwjgl.system.MemoryUtil.memAddress(r9)
            nglMultiTexSubImage2DEXT(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9)
            return
    }

    public static void glMultiTexSubImage2DEXT(@org.lwjgl.system.NativeType("GLenum") int r12, @org.lwjgl.system.NativeType("GLenum") int r13, @org.lwjgl.system.NativeType("GLint") int r14, @org.lwjgl.system.NativeType("GLint") int r15, @org.lwjgl.system.NativeType("GLint") int r16, @org.lwjgl.system.NativeType("GLsizei") int r17, @org.lwjgl.system.NativeType("GLsizei") int r18, @org.lwjgl.system.NativeType("GLenum") int r19, @org.lwjgl.system.NativeType("GLenum") int r20, @org.lwjgl.system.NativeType("void const *") java.nio.DoubleBuffer r21) {
            r0 = r12
            r1 = r13
            r2 = r14
            r3 = r15
            r4 = r16
            r5 = r17
            r6 = r18
            r7 = r19
            r8 = r20
            r9 = r21
            long r9 = org.lwjgl.system.MemoryUtil.memAddress(r9)
            nglMultiTexSubImage2DEXT(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9)
            return
    }

    public static native void glCopyMultiTexImage1DEXT(@org.lwjgl.system.NativeType("GLenum") int r0, @org.lwjgl.system.NativeType("GLenum") int r1, @org.lwjgl.system.NativeType("GLint") int r2, @org.lwjgl.system.NativeType("GLenum") int r3, @org.lwjgl.system.NativeType("GLint") int r4, @org.lwjgl.system.NativeType("GLint") int r5, @org.lwjgl.system.NativeType("GLsizei") int r6, @org.lwjgl.system.NativeType("GLint") int r7);

    public static native void glCopyMultiTexImage2DEXT(@org.lwjgl.system.NativeType("GLenum") int r0, @org.lwjgl.system.NativeType("GLenum") int r1, @org.lwjgl.system.NativeType("GLint") int r2, @org.lwjgl.system.NativeType("GLenum") int r3, @org.lwjgl.system.NativeType("GLint") int r4, @org.lwjgl.system.NativeType("GLint") int r5, @org.lwjgl.system.NativeType("GLsizei") int r6, @org.lwjgl.system.NativeType("GLsizei") int r7, @org.lwjgl.system.NativeType("GLint") int r8);

    public static native void glCopyMultiTexSubImage1DEXT(@org.lwjgl.system.NativeType("GLenum") int r0, @org.lwjgl.system.NativeType("GLenum") int r1, @org.lwjgl.system.NativeType("GLint") int r2, @org.lwjgl.system.NativeType("GLint") int r3, @org.lwjgl.system.NativeType("GLint") int r4, @org.lwjgl.system.NativeType("GLint") int r5, @org.lwjgl.system.NativeType("GLsizei") int r6);

    public static native void glCopyMultiTexSubImage2DEXT(@org.lwjgl.system.NativeType("GLenum") int r0, @org.lwjgl.system.NativeType("GLenum") int r1, @org.lwjgl.system.NativeType("GLint") int r2, @org.lwjgl.system.NativeType("GLint") int r3, @org.lwjgl.system.NativeType("GLint") int r4, @org.lwjgl.system.NativeType("GLint") int r5, @org.lwjgl.system.NativeType("GLint") int r6, @org.lwjgl.system.NativeType("GLsizei") int r7, @org.lwjgl.system.NativeType("GLsizei") int r8);

    public static native void nglGetMultiTexImageEXT(int r0, int r1, int r2, int r3, int r4, long r5);

    public static void glGetMultiTexImageEXT(@org.lwjgl.system.NativeType("GLenum") int r8, @org.lwjgl.system.NativeType("GLenum") int r9, @org.lwjgl.system.NativeType("GLint") int r10, @org.lwjgl.system.NativeType("GLenum") int r11, @org.lwjgl.system.NativeType("GLenum") int r12, @org.lwjgl.system.NativeType("void *") java.nio.ByteBuffer r13) {
            r0 = r8
            r1 = r9
            r2 = r10
            r3 = r11
            r4 = r12
            r5 = r13
            long r5 = org.lwjgl.system.MemoryUtil.memAddress(r5)
            nglGetMultiTexImageEXT(r0, r1, r2, r3, r4, r5)
            return
    }

    public static void glGetMultiTexImageEXT(@org.lwjgl.system.NativeType("GLenum") int r8, @org.lwjgl.system.NativeType("GLenum") int r9, @org.lwjgl.system.NativeType("GLint") int r10, @org.lwjgl.system.NativeType("GLenum") int r11, @org.lwjgl.system.NativeType("GLenum") int r12, @org.lwjgl.system.NativeType("void *") long r13) {
            r0 = r8
            r1 = r9
            r2 = r10
            r3 = r11
            r4 = r12
            r5 = r13
            nglGetMultiTexImageEXT(r0, r1, r2, r3, r4, r5)
            return
    }

    public static void glGetMultiTexImageEXT(@org.lwjgl.system.NativeType("GLenum") int r8, @org.lwjgl.system.NativeType("GLenum") int r9, @org.lwjgl.system.NativeType("GLint") int r10, @org.lwjgl.system.NativeType("GLenum") int r11, @org.lwjgl.system.NativeType("GLenum") int r12, @org.lwjgl.system.NativeType("void *") java.nio.ShortBuffer r13) {
            r0 = r8
            r1 = r9
            r2 = r10
            r3 = r11
            r4 = r12
            r5 = r13
            long r5 = org.lwjgl.system.MemoryUtil.memAddress(r5)
            nglGetMultiTexImageEXT(r0, r1, r2, r3, r4, r5)
            return
    }

    public static void glGetMultiTexImageEXT(@org.lwjgl.system.NativeType("GLenum") int r8, @org.lwjgl.system.NativeType("GLenum") int r9, @org.lwjgl.system.NativeType("GLint") int r10, @org.lwjgl.system.NativeType("GLenum") int r11, @org.lwjgl.system.NativeType("GLenum") int r12, @org.lwjgl.system.NativeType("void *") java.nio.IntBuffer r13) {
            r0 = r8
            r1 = r9
            r2 = r10
            r3 = r11
            r4 = r12
            r5 = r13
            long r5 = org.lwjgl.system.MemoryUtil.memAddress(r5)
            nglGetMultiTexImageEXT(r0, r1, r2, r3, r4, r5)
            return
    }

    public static void glGetMultiTexImageEXT(@org.lwjgl.system.NativeType("GLenum") int r8, @org.lwjgl.system.NativeType("GLenum") int r9, @org.lwjgl.system.NativeType("GLint") int r10, @org.lwjgl.system.NativeType("GLenum") int r11, @org.lwjgl.system.NativeType("GLenum") int r12, @org.lwjgl.system.NativeType("void *") java.nio.FloatBuffer r13) {
            r0 = r8
            r1 = r9
            r2 = r10
            r3 = r11
            r4 = r12
            r5 = r13
            long r5 = org.lwjgl.system.MemoryUtil.memAddress(r5)
            nglGetMultiTexImageEXT(r0, r1, r2, r3, r4, r5)
            return
    }

    public static void glGetMultiTexImageEXT(@org.lwjgl.system.NativeType("GLenum") int r8, @org.lwjgl.system.NativeType("GLenum") int r9, @org.lwjgl.system.NativeType("GLint") int r10, @org.lwjgl.system.NativeType("GLenum") int r11, @org.lwjgl.system.NativeType("GLenum") int r12, @org.lwjgl.system.NativeType("void *") java.nio.DoubleBuffer r13) {
            r0 = r8
            r1 = r9
            r2 = r10
            r3 = r11
            r4 = r12
            r5 = r13
            long r5 = org.lwjgl.system.MemoryUtil.memAddress(r5)
            nglGetMultiTexImageEXT(r0, r1, r2, r3, r4, r5)
            return
    }

    public static native void nglGetMultiTexParameterfvEXT(int r0, int r1, int r2, long r3);

    public static void glGetMultiTexParameterfvEXT(@org.lwjgl.system.NativeType("GLenum") int r6, @org.lwjgl.system.NativeType("GLenum") int r7, @org.lwjgl.system.NativeType("GLenum") int r8, @org.lwjgl.system.NativeType("GLfloat *") java.nio.FloatBuffer r9) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r9
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
        Lb:
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            long r3 = org.lwjgl.system.MemoryUtil.memAddress(r3)
            nglGetMultiTexParameterfvEXT(r0, r1, r2, r3)
            return
    }

    @org.lwjgl.system.NativeType("void")
    public static float glGetMultiTexParameterfEXT(@org.lwjgl.system.NativeType("GLenum") int r6, @org.lwjgl.system.NativeType("GLenum") int r7, @org.lwjgl.system.NativeType("GLenum") int r8) {
            org.lwjgl.system.MemoryStack r0 = org.lwjgl.system.MemoryStack.stackGet()
            r9 = r0
            r0 = r9
            int r0 = r0.getPointer()
            r10 = r0
            r0 = r9
            r1 = 1
            java.nio.FloatBuffer r0 = r0.callocFloat(r1)     // Catch: java.lang.Throwable -> L2d
            r11 = r0
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r11
            long r3 = org.lwjgl.system.MemoryUtil.memAddress(r3)     // Catch: java.lang.Throwable -> L2d
            nglGetMultiTexParameterfvEXT(r0, r1, r2, r3)     // Catch: java.lang.Throwable -> L2d
            r0 = r11
            r1 = 0
            float r0 = r0.get(r1)     // Catch: java.lang.Throwable -> L2d
            r12 = r0
            r0 = r9
            r1 = r10
            r0.setPointer(r1)
            r0 = r12
            return r0
        L2d:
            r13 = move-exception
            r0 = r9
            r1 = r10
            r0.setPointer(r1)
            r0 = r13
            throw r0
    }

    public static native void nglGetMultiTexParameterivEXT(int r0, int r1, int r2, long r3);

    public static void glGetMultiTexParameterivEXT(@org.lwjgl.system.NativeType("GLenum") int r6, @org.lwjgl.system.NativeType("GLenum") int r7, @org.lwjgl.system.NativeType("GLenum") int r8, @org.lwjgl.system.NativeType("GLint *") java.nio.IntBuffer r9) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r9
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
        Lb:
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            long r3 = org.lwjgl.system.MemoryUtil.memAddress(r3)
            nglGetMultiTexParameterivEXT(r0, r1, r2, r3)
            return
    }

    @org.lwjgl.system.NativeType("void")
    public static int glGetMultiTexParameteriEXT(@org.lwjgl.system.NativeType("GLenum") int r6, @org.lwjgl.system.NativeType("GLenum") int r7, @org.lwjgl.system.NativeType("GLenum") int r8) {
            org.lwjgl.system.MemoryStack r0 = org.lwjgl.system.MemoryStack.stackGet()
            r9 = r0
            r0 = r9
            int r0 = r0.getPointer()
            r10 = r0
            r0 = r9
            r1 = 1
            java.nio.IntBuffer r0 = r0.callocInt(r1)     // Catch: java.lang.Throwable -> L2d
            r11 = r0
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r11
            long r3 = org.lwjgl.system.MemoryUtil.memAddress(r3)     // Catch: java.lang.Throwable -> L2d
            nglGetMultiTexParameterivEXT(r0, r1, r2, r3)     // Catch: java.lang.Throwable -> L2d
            r0 = r11
            r1 = 0
            int r0 = r0.get(r1)     // Catch: java.lang.Throwable -> L2d
            r12 = r0
            r0 = r9
            r1 = r10
            r0.setPointer(r1)
            r0 = r12
            return r0
        L2d:
            r13 = move-exception
            r0 = r9
            r1 = r10
            r0.setPointer(r1)
            r0 = r13
            throw r0
    }

    public static native void nglGetMultiTexLevelParameterfvEXT(int r0, int r1, int r2, int r3, long r4);

    public static void glGetMultiTexLevelParameterfvEXT(@org.lwjgl.system.NativeType("GLenum") int r7, @org.lwjgl.system.NativeType("GLenum") int r8, @org.lwjgl.system.NativeType("GLint") int r9, @org.lwjgl.system.NativeType("GLenum") int r10, @org.lwjgl.system.NativeType("GLfloat *") java.nio.FloatBuffer r11) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lc
            r0 = r11
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
        Lc:
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            long r4 = org.lwjgl.system.MemoryUtil.memAddress(r4)
            nglGetMultiTexLevelParameterfvEXT(r0, r1, r2, r3, r4)
            return
    }

    @org.lwjgl.system.NativeType("void")
    public static float glGetMultiTexLevelParameterfEXT(@org.lwjgl.system.NativeType("GLenum") int r7, @org.lwjgl.system.NativeType("GLenum") int r8, @org.lwjgl.system.NativeType("GLint") int r9, @org.lwjgl.system.NativeType("GLenum") int r10) {
            org.lwjgl.system.MemoryStack r0 = org.lwjgl.system.MemoryStack.stackGet()
            r11 = r0
            r0 = r11
            int r0 = r0.getPointer()
            r12 = r0
            r0 = r11
            r1 = 1
            java.nio.FloatBuffer r0 = r0.callocFloat(r1)     // Catch: java.lang.Throwable -> L32
            r13 = r0
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r13
            long r4 = org.lwjgl.system.MemoryUtil.memAddress(r4)     // Catch: java.lang.Throwable -> L32
            nglGetMultiTexLevelParameterfvEXT(r0, r1, r2, r3, r4)     // Catch: java.lang.Throwable -> L32
            r0 = r13
            r1 = 0
            float r0 = r0.get(r1)     // Catch: java.lang.Throwable -> L32
            r14 = r0
            r0 = r11
            r1 = r12
            r0.setPointer(r1)
            r0 = r14
            return r0
        L32:
            r15 = move-exception
            r0 = r11
            r1 = r12
            r0.setPointer(r1)
            r0 = r15
            throw r0
    }

    public static native void nglGetMultiTexLevelParameterivEXT(int r0, int r1, int r2, int r3, long r4);

    public static void glGetMultiTexLevelParameterivEXT(@org.lwjgl.system.NativeType("GLenum") int r7, @org.lwjgl.system.NativeType("GLenum") int r8, @org.lwjgl.system.NativeType("GLint") int r9, @org.lwjgl.system.NativeType("GLenum") int r10, @org.lwjgl.system.NativeType("GLint *") java.nio.IntBuffer r11) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lc
            r0 = r11
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
        Lc:
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            long r4 = org.lwjgl.system.MemoryUtil.memAddress(r4)
            nglGetMultiTexLevelParameterivEXT(r0, r1, r2, r3, r4)
            return
    }

    @org.lwjgl.system.NativeType("void")
    public static int glGetMultiTexLevelParameteriEXT(@org.lwjgl.system.NativeType("GLenum") int r7, @org.lwjgl.system.NativeType("GLenum") int r8, @org.lwjgl.system.NativeType("GLint") int r9, @org.lwjgl.system.NativeType("GLenum") int r10) {
            org.lwjgl.system.MemoryStack r0 = org.lwjgl.system.MemoryStack.stackGet()
            r11 = r0
            r0 = r11
            int r0 = r0.getPointer()
            r12 = r0
            r0 = r11
            r1 = 1
            java.nio.IntBuffer r0 = r0.callocInt(r1)     // Catch: java.lang.Throwable -> L32
            r13 = r0
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r13
            long r4 = org.lwjgl.system.MemoryUtil.memAddress(r4)     // Catch: java.lang.Throwable -> L32
            nglGetMultiTexLevelParameterivEXT(r0, r1, r2, r3, r4)     // Catch: java.lang.Throwable -> L32
            r0 = r13
            r1 = 0
            int r0 = r0.get(r1)     // Catch: java.lang.Throwable -> L32
            r14 = r0
            r0 = r11
            r1 = r12
            r0.setPointer(r1)
            r0 = r14
            return r0
        L32:
            r15 = move-exception
            r0 = r11
            r1 = r12
            r0.setPointer(r1)
            r0 = r15
            throw r0
    }

    public static native void nglMultiTexImage3DEXT(int r0, int r1, int r2, int r3, int r4, int r5, int r6, int r7, int r8, int r9, long r10);

    public static void glMultiTexImage3DEXT(@org.lwjgl.system.NativeType("GLenum") int r13, @org.lwjgl.system.NativeType("GLenum") int r14, @org.lwjgl.system.NativeType("GLint") int r15, @org.lwjgl.system.NativeType("GLint") int r16, @org.lwjgl.system.NativeType("GLsizei") int r17, @org.lwjgl.system.NativeType("GLsizei") int r18, @org.lwjgl.system.NativeType("GLsizei") int r19, @org.lwjgl.system.NativeType("GLint") int r20, @org.lwjgl.system.NativeType("GLenum") int r21, @org.lwjgl.system.NativeType("GLenum") int r22, @javax.annotation.Nullable @org.lwjgl.system.NativeType("void const *") java.nio.ByteBuffer r23) {
            r0 = r13
            r1 = r14
            r2 = r15
            r3 = r16
            r4 = r17
            r5 = r18
            r6 = r19
            r7 = r20
            r8 = r21
            r9 = r22
            r10 = r23
            long r10 = org.lwjgl.system.MemoryUtil.memAddressSafe(r10)
            nglMultiTexImage3DEXT(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            return
    }

    public static void glMultiTexImage3DEXT(@org.lwjgl.system.NativeType("GLenum") int r13, @org.lwjgl.system.NativeType("GLenum") int r14, @org.lwjgl.system.NativeType("GLint") int r15, @org.lwjgl.system.NativeType("GLint") int r16, @org.lwjgl.system.NativeType("GLsizei") int r17, @org.lwjgl.system.NativeType("GLsizei") int r18, @org.lwjgl.system.NativeType("GLsizei") int r19, @org.lwjgl.system.NativeType("GLint") int r20, @org.lwjgl.system.NativeType("GLenum") int r21, @org.lwjgl.system.NativeType("GLenum") int r22, @org.lwjgl.system.NativeType("void const *") long r23) {
            r0 = r13
            r1 = r14
            r2 = r15
            r3 = r16
            r4 = r17
            r5 = r18
            r6 = r19
            r7 = r20
            r8 = r21
            r9 = r22
            r10 = r23
            nglMultiTexImage3DEXT(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            return
    }

    public static void glMultiTexImage3DEXT(@org.lwjgl.system.NativeType("GLenum") int r13, @org.lwjgl.system.NativeType("GLenum") int r14, @org.lwjgl.system.NativeType("GLint") int r15, @org.lwjgl.system.NativeType("GLint") int r16, @org.lwjgl.system.NativeType("GLsizei") int r17, @org.lwjgl.system.NativeType("GLsizei") int r18, @org.lwjgl.system.NativeType("GLsizei") int r19, @org.lwjgl.system.NativeType("GLint") int r20, @org.lwjgl.system.NativeType("GLenum") int r21, @org.lwjgl.system.NativeType("GLenum") int r22, @javax.annotation.Nullable @org.lwjgl.system.NativeType("void const *") java.nio.ShortBuffer r23) {
            r0 = r13
            r1 = r14
            r2 = r15
            r3 = r16
            r4 = r17
            r5 = r18
            r6 = r19
            r7 = r20
            r8 = r21
            r9 = r22
            r10 = r23
            long r10 = org.lwjgl.system.MemoryUtil.memAddressSafe(r10)
            nglMultiTexImage3DEXT(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            return
    }

    public static void glMultiTexImage3DEXT(@org.lwjgl.system.NativeType("GLenum") int r13, @org.lwjgl.system.NativeType("GLenum") int r14, @org.lwjgl.system.NativeType("GLint") int r15, @org.lwjgl.system.NativeType("GLint") int r16, @org.lwjgl.system.NativeType("GLsizei") int r17, @org.lwjgl.system.NativeType("GLsizei") int r18, @org.lwjgl.system.NativeType("GLsizei") int r19, @org.lwjgl.system.NativeType("GLint") int r20, @org.lwjgl.system.NativeType("GLenum") int r21, @org.lwjgl.system.NativeType("GLenum") int r22, @javax.annotation.Nullable @org.lwjgl.system.NativeType("void const *") java.nio.IntBuffer r23) {
            r0 = r13
            r1 = r14
            r2 = r15
            r3 = r16
            r4 = r17
            r5 = r18
            r6 = r19
            r7 = r20
            r8 = r21
            r9 = r22
            r10 = r23
            long r10 = org.lwjgl.system.MemoryUtil.memAddressSafe(r10)
            nglMultiTexImage3DEXT(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            return
    }

    public static void glMultiTexImage3DEXT(@org.lwjgl.system.NativeType("GLenum") int r13, @org.lwjgl.system.NativeType("GLenum") int r14, @org.lwjgl.system.NativeType("GLint") int r15, @org.lwjgl.system.NativeType("GLint") int r16, @org.lwjgl.system.NativeType("GLsizei") int r17, @org.lwjgl.system.NativeType("GLsizei") int r18, @org.lwjgl.system.NativeType("GLsizei") int r19, @org.lwjgl.system.NativeType("GLint") int r20, @org.lwjgl.system.NativeType("GLenum") int r21, @org.lwjgl.system.NativeType("GLenum") int r22, @javax.annotation.Nullable @org.lwjgl.system.NativeType("void const *") java.nio.FloatBuffer r23) {
            r0 = r13
            r1 = r14
            r2 = r15
            r3 = r16
            r4 = r17
            r5 = r18
            r6 = r19
            r7 = r20
            r8 = r21
            r9 = r22
            r10 = r23
            long r10 = org.lwjgl.system.MemoryUtil.memAddressSafe(r10)
            nglMultiTexImage3DEXT(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            return
    }

    public static void glMultiTexImage3DEXT(@org.lwjgl.system.NativeType("GLenum") int r13, @org.lwjgl.system.NativeType("GLenum") int r14, @org.lwjgl.system.NativeType("GLint") int r15, @org.lwjgl.system.NativeType("GLint") int r16, @org.lwjgl.system.NativeType("GLsizei") int r17, @org.lwjgl.system.NativeType("GLsizei") int r18, @org.lwjgl.system.NativeType("GLsizei") int r19, @org.lwjgl.system.NativeType("GLint") int r20, @org.lwjgl.system.NativeType("GLenum") int r21, @org.lwjgl.system.NativeType("GLenum") int r22, @javax.annotation.Nullable @org.lwjgl.system.NativeType("void const *") java.nio.DoubleBuffer r23) {
            r0 = r13
            r1 = r14
            r2 = r15
            r3 = r16
            r4 = r17
            r5 = r18
            r6 = r19
            r7 = r20
            r8 = r21
            r9 = r22
            r10 = r23
            long r10 = org.lwjgl.system.MemoryUtil.memAddressSafe(r10)
            nglMultiTexImage3DEXT(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            return
    }

    public static native void nglMultiTexSubImage3DEXT(int r0, int r1, int r2, int r3, int r4, int r5, int r6, int r7, int r8, int r9, int r10, long r11);

    public static void glMultiTexSubImage3DEXT(@org.lwjgl.system.NativeType("GLenum") int r14, @org.lwjgl.system.NativeType("GLenum") int r15, @org.lwjgl.system.NativeType("GLint") int r16, @org.lwjgl.system.NativeType("GLint") int r17, @org.lwjgl.system.NativeType("GLint") int r18, @org.lwjgl.system.NativeType("GLint") int r19, @org.lwjgl.system.NativeType("GLsizei") int r20, @org.lwjgl.system.NativeType("GLsizei") int r21, @org.lwjgl.system.NativeType("GLsizei") int r22, @org.lwjgl.system.NativeType("GLenum") int r23, @org.lwjgl.system.NativeType("GLenum") int r24, @org.lwjgl.system.NativeType("void const *") java.nio.ByteBuffer r25) {
            r0 = r14
            r1 = r15
            r2 = r16
            r3 = r17
            r4 = r18
            r5 = r19
            r6 = r20
            r7 = r21
            r8 = r22
            r9 = r23
            r10 = r24
            r11 = r25
            long r11 = org.lwjgl.system.MemoryUtil.memAddress(r11)
            nglMultiTexSubImage3DEXT(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            return
    }

    public static void glMultiTexSubImage3DEXT(@org.lwjgl.system.NativeType("GLenum") int r14, @org.lwjgl.system.NativeType("GLenum") int r15, @org.lwjgl.system.NativeType("GLint") int r16, @org.lwjgl.system.NativeType("GLint") int r17, @org.lwjgl.system.NativeType("GLint") int r18, @org.lwjgl.system.NativeType("GLint") int r19, @org.lwjgl.system.NativeType("GLsizei") int r20, @org.lwjgl.system.NativeType("GLsizei") int r21, @org.lwjgl.system.NativeType("GLsizei") int r22, @org.lwjgl.system.NativeType("GLenum") int r23, @org.lwjgl.system.NativeType("GLenum") int r24, @org.lwjgl.system.NativeType("void const *") long r25) {
            r0 = r14
            r1 = r15
            r2 = r16
            r3 = r17
            r4 = r18
            r5 = r19
            r6 = r20
            r7 = r21
            r8 = r22
            r9 = r23
            r10 = r24
            r11 = r25
            nglMultiTexSubImage3DEXT(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            return
    }

    public static void glMultiTexSubImage3DEXT(@org.lwjgl.system.NativeType("GLenum") int r14, @org.lwjgl.system.NativeType("GLenum") int r15, @org.lwjgl.system.NativeType("GLint") int r16, @org.lwjgl.system.NativeType("GLint") int r17, @org.lwjgl.system.NativeType("GLint") int r18, @org.lwjgl.system.NativeType("GLint") int r19, @org.lwjgl.system.NativeType("GLsizei") int r20, @org.lwjgl.system.NativeType("GLsizei") int r21, @org.lwjgl.system.NativeType("GLsizei") int r22, @org.lwjgl.system.NativeType("GLenum") int r23, @org.lwjgl.system.NativeType("GLenum") int r24, @org.lwjgl.system.NativeType("void const *") java.nio.ShortBuffer r25) {
            r0 = r14
            r1 = r15
            r2 = r16
            r3 = r17
            r4 = r18
            r5 = r19
            r6 = r20
            r7 = r21
            r8 = r22
            r9 = r23
            r10 = r24
            r11 = r25
            long r11 = org.lwjgl.system.MemoryUtil.memAddress(r11)
            nglMultiTexSubImage3DEXT(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            return
    }

    public static void glMultiTexSubImage3DEXT(@org.lwjgl.system.NativeType("GLenum") int r14, @org.lwjgl.system.NativeType("GLenum") int r15, @org.lwjgl.system.NativeType("GLint") int r16, @org.lwjgl.system.NativeType("GLint") int r17, @org.lwjgl.system.NativeType("GLint") int r18, @org.lwjgl.system.NativeType("GLint") int r19, @org.lwjgl.system.NativeType("GLsizei") int r20, @org.lwjgl.system.NativeType("GLsizei") int r21, @org.lwjgl.system.NativeType("GLsizei") int r22, @org.lwjgl.system.NativeType("GLenum") int r23, @org.lwjgl.system.NativeType("GLenum") int r24, @org.lwjgl.system.NativeType("void const *") java.nio.IntBuffer r25) {
            r0 = r14
            r1 = r15
            r2 = r16
            r3 = r17
            r4 = r18
            r5 = r19
            r6 = r20
            r7 = r21
            r8 = r22
            r9 = r23
            r10 = r24
            r11 = r25
            long r11 = org.lwjgl.system.MemoryUtil.memAddress(r11)
            nglMultiTexSubImage3DEXT(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            return
    }

    public static void glMultiTexSubImage3DEXT(@org.lwjgl.system.NativeType("GLenum") int r14, @org.lwjgl.system.NativeType("GLenum") int r15, @org.lwjgl.system.NativeType("GLint") int r16, @org.lwjgl.system.NativeType("GLint") int r17, @org.lwjgl.system.NativeType("GLint") int r18, @org.lwjgl.system.NativeType("GLint") int r19, @org.lwjgl.system.NativeType("GLsizei") int r20, @org.lwjgl.system.NativeType("GLsizei") int r21, @org.lwjgl.system.NativeType("GLsizei") int r22, @org.lwjgl.system.NativeType("GLenum") int r23, @org.lwjgl.system.NativeType("GLenum") int r24, @org.lwjgl.system.NativeType("void const *") java.nio.FloatBuffer r25) {
            r0 = r14
            r1 = r15
            r2 = r16
            r3 = r17
            r4 = r18
            r5 = r19
            r6 = r20
            r7 = r21
            r8 = r22
            r9 = r23
            r10 = r24
            r11 = r25
            long r11 = org.lwjgl.system.MemoryUtil.memAddress(r11)
            nglMultiTexSubImage3DEXT(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            return
    }

    public static void glMultiTexSubImage3DEXT(@org.lwjgl.system.NativeType("GLenum") int r14, @org.lwjgl.system.NativeType("GLenum") int r15, @org.lwjgl.system.NativeType("GLint") int r16, @org.lwjgl.system.NativeType("GLint") int r17, @org.lwjgl.system.NativeType("GLint") int r18, @org.lwjgl.system.NativeType("GLint") int r19, @org.lwjgl.system.NativeType("GLsizei") int r20, @org.lwjgl.system.NativeType("GLsizei") int r21, @org.lwjgl.system.NativeType("GLsizei") int r22, @org.lwjgl.system.NativeType("GLenum") int r23, @org.lwjgl.system.NativeType("GLenum") int r24, @org.lwjgl.system.NativeType("void const *") java.nio.DoubleBuffer r25) {
            r0 = r14
            r1 = r15
            r2 = r16
            r3 = r17
            r4 = r18
            r5 = r19
            r6 = r20
            r7 = r21
            r8 = r22
            r9 = r23
            r10 = r24
            r11 = r25
            long r11 = org.lwjgl.system.MemoryUtil.memAddress(r11)
            nglMultiTexSubImage3DEXT(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            return
    }

    public static native void glCopyMultiTexSubImage3DEXT(@org.lwjgl.system.NativeType("GLenum") int r0, @org.lwjgl.system.NativeType("GLenum") int r1, @org.lwjgl.system.NativeType("GLint") int r2, @org.lwjgl.system.NativeType("GLint") int r3, @org.lwjgl.system.NativeType("GLint") int r4, @org.lwjgl.system.NativeType("GLint") int r5, @org.lwjgl.system.NativeType("GLint") int r6, @org.lwjgl.system.NativeType("GLint") int r7, @org.lwjgl.system.NativeType("GLsizei") int r8, @org.lwjgl.system.NativeType("GLsizei") int r9);

    public static native void glEnableClientStateIndexedEXT(@org.lwjgl.system.NativeType("GLenum") int r0, @org.lwjgl.system.NativeType("GLuint") int r1);

    public static native void glDisableClientStateIndexedEXT(@org.lwjgl.system.NativeType("GLenum") int r0, @org.lwjgl.system.NativeType("GLuint") int r1);

    public static native void glEnableClientStateiEXT(@org.lwjgl.system.NativeType("GLenum") int r0, @org.lwjgl.system.NativeType("GLuint") int r1);

    public static native void glDisableClientStateiEXT(@org.lwjgl.system.NativeType("GLenum") int r0, @org.lwjgl.system.NativeType("GLuint") int r1);

    public static native void nglGetFloatIndexedvEXT(int r0, int r1, long r2);

    public static void glGetFloatIndexedvEXT(@org.lwjgl.system.NativeType("GLenum") int r5, @org.lwjgl.system.NativeType("GLuint") int r6, @org.lwjgl.system.NativeType("GLfloat *") java.nio.FloatBuffer r7) {
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
            nglGetFloatIndexedvEXT(r0, r1, r2)
            return
    }

    @org.lwjgl.system.NativeType("void")
    public static float glGetFloatIndexedEXT(@org.lwjgl.system.NativeType("GLenum") int r5, @org.lwjgl.system.NativeType("GLuint") int r6) {
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
            nglGetFloatIndexedvEXT(r0, r1, r2)     // Catch: java.lang.Throwable -> L2a
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

    public static native void nglGetDoubleIndexedvEXT(int r0, int r1, long r2);

    public static void glGetDoubleIndexedvEXT(@org.lwjgl.system.NativeType("GLenum") int r5, @org.lwjgl.system.NativeType("GLuint") int r6, @org.lwjgl.system.NativeType("GLdouble *") java.nio.DoubleBuffer r7) {
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
            nglGetDoubleIndexedvEXT(r0, r1, r2)
            return
    }

    @org.lwjgl.system.NativeType("void")
    public static double glGetDoubleIndexedEXT(@org.lwjgl.system.NativeType("GLenum") int r5, @org.lwjgl.system.NativeType("GLuint") int r6) {
            org.lwjgl.system.MemoryStack r0 = org.lwjgl.system.MemoryStack.stackGet()
            r7 = r0
            r0 = r7
            int r0 = r0.getPointer()
            r8 = r0
            r0 = r7
            r1 = 1
            java.nio.DoubleBuffer r0 = r0.callocDouble(r1)     // Catch: java.lang.Throwable -> L2a
            r9 = r0
            r0 = r5
            r1 = r6
            r2 = r9
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)     // Catch: java.lang.Throwable -> L2a
            nglGetDoubleIndexedvEXT(r0, r1, r2)     // Catch: java.lang.Throwable -> L2a
            r0 = r9
            r1 = 0
            double r0 = r0.get(r1)     // Catch: java.lang.Throwable -> L2a
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

    public static native void nglGetPointerIndexedvEXT(int r0, int r1, long r2);

    public static void glGetPointerIndexedvEXT(@org.lwjgl.system.NativeType("GLenum") int r5, @org.lwjgl.system.NativeType("GLuint") int r6, @org.lwjgl.system.NativeType("void **") org.lwjgl.PointerBuffer r7) {
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
            nglGetPointerIndexedvEXT(r0, r1, r2)
            return
    }

    @org.lwjgl.system.NativeType("void")
    public static long glGetPointerIndexedEXT(@org.lwjgl.system.NativeType("GLenum") int r5, @org.lwjgl.system.NativeType("GLuint") int r6) {
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
            nglGetPointerIndexedvEXT(r0, r1, r2)     // Catch: java.lang.Throwable -> L2a
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

    public static native void nglGetFloati_vEXT(int r0, int r1, long r2);

    public static void glGetFloati_vEXT(@org.lwjgl.system.NativeType("GLenum") int r5, @org.lwjgl.system.NativeType("GLuint") int r6, @org.lwjgl.system.NativeType("GLfloat *") java.nio.FloatBuffer r7) {
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
            nglGetFloati_vEXT(r0, r1, r2)
            return
    }

    @org.lwjgl.system.NativeType("void")
    public static float glGetFloatiEXT(@org.lwjgl.system.NativeType("GLenum") int r5, @org.lwjgl.system.NativeType("GLuint") int r6) {
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
            nglGetFloati_vEXT(r0, r1, r2)     // Catch: java.lang.Throwable -> L2a
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

    public static native void nglGetDoublei_vEXT(int r0, int r1, long r2);

    public static void glGetDoublei_vEXT(@org.lwjgl.system.NativeType("GLenum") int r5, @org.lwjgl.system.NativeType("GLuint") int r6, @org.lwjgl.system.NativeType("GLdouble *") java.nio.DoubleBuffer r7) {
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
            nglGetDoublei_vEXT(r0, r1, r2)
            return
    }

    @org.lwjgl.system.NativeType("void")
    public static double glGetDoubleiEXT(@org.lwjgl.system.NativeType("GLenum") int r5, @org.lwjgl.system.NativeType("GLuint") int r6) {
            org.lwjgl.system.MemoryStack r0 = org.lwjgl.system.MemoryStack.stackGet()
            r7 = r0
            r0 = r7
            int r0 = r0.getPointer()
            r8 = r0
            r0 = r7
            r1 = 1
            java.nio.DoubleBuffer r0 = r0.callocDouble(r1)     // Catch: java.lang.Throwable -> L2a
            r9 = r0
            r0 = r5
            r1 = r6
            r2 = r9
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)     // Catch: java.lang.Throwable -> L2a
            nglGetDoublei_vEXT(r0, r1, r2)     // Catch: java.lang.Throwable -> L2a
            r0 = r9
            r1 = 0
            double r0 = r0.get(r1)     // Catch: java.lang.Throwable -> L2a
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

    public static native void nglGetPointeri_vEXT(int r0, int r1, long r2);

    public static void glGetPointeri_vEXT(@org.lwjgl.system.NativeType("GLenum") int r5, @org.lwjgl.system.NativeType("GLuint") int r6, @org.lwjgl.system.NativeType("void **") org.lwjgl.PointerBuffer r7) {
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
            nglGetPointeri_vEXT(r0, r1, r2)
            return
    }

    @org.lwjgl.system.NativeType("void")
    public static long glGetPointeriEXT(@org.lwjgl.system.NativeType("GLenum") int r5, @org.lwjgl.system.NativeType("GLuint") int r6) {
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
            nglGetPointeri_vEXT(r0, r1, r2)     // Catch: java.lang.Throwable -> L2a
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

    public static void glEnableIndexedEXT(@org.lwjgl.system.NativeType("GLenum") int r3, @org.lwjgl.system.NativeType("GLuint") int r4) {
            r0 = r3
            r1 = r4
            org.lwjgl.opengl.EXTDrawBuffers2.glEnableIndexedEXT(r0, r1)
            return
    }

    public static void glDisableIndexedEXT(@org.lwjgl.system.NativeType("GLenum") int r3, @org.lwjgl.system.NativeType("GLuint") int r4) {
            r0 = r3
            r1 = r4
            org.lwjgl.opengl.EXTDrawBuffers2.glDisableIndexedEXT(r0, r1)
            return
    }

    @org.lwjgl.system.NativeType("GLboolean")
    public static boolean glIsEnabledIndexedEXT(@org.lwjgl.system.NativeType("GLenum") int r3, @org.lwjgl.system.NativeType("GLuint") int r4) {
            r0 = r3
            r1 = r4
            boolean r0 = org.lwjgl.opengl.EXTDrawBuffers2.glIsEnabledIndexedEXT(r0, r1)
            return r0
    }

    public static void nglGetIntegerIndexedvEXT(int r5, int r6, long r7) {
            r0 = r5
            r1 = r6
            r2 = r7
            org.lwjgl.opengl.EXTDrawBuffers2.nglGetIntegerIndexedvEXT(r0, r1, r2)
            return
    }

    public static void glGetIntegerIndexedvEXT(@org.lwjgl.system.NativeType("GLenum") int r4, @org.lwjgl.system.NativeType("GLuint") int r5, @org.lwjgl.system.NativeType("GLint *") java.nio.IntBuffer r6) {
            r0 = r4
            r1 = r5
            r2 = r6
            org.lwjgl.opengl.EXTDrawBuffers2.glGetIntegerIndexedvEXT(r0, r1, r2)
            return
    }

    @org.lwjgl.system.NativeType("void")
    public static int glGetIntegerIndexedEXT(@org.lwjgl.system.NativeType("GLenum") int r3, @org.lwjgl.system.NativeType("GLuint") int r4) {
            r0 = r3
            r1 = r4
            int r0 = org.lwjgl.opengl.EXTDrawBuffers2.glGetIntegerIndexedEXT(r0, r1)
            return r0
    }

    public static void nglGetBooleanIndexedvEXT(int r5, int r6, long r7) {
            r0 = r5
            r1 = r6
            r2 = r7
            org.lwjgl.opengl.EXTDrawBuffers2.nglGetBooleanIndexedvEXT(r0, r1, r2)
            return
    }

    public static void glGetBooleanIndexedvEXT(@org.lwjgl.system.NativeType("GLenum") int r4, @org.lwjgl.system.NativeType("GLuint") int r5, @org.lwjgl.system.NativeType("GLboolean *") java.nio.ByteBuffer r6) {
            r0 = r4
            r1 = r5
            r2 = r6
            org.lwjgl.opengl.EXTDrawBuffers2.glGetBooleanIndexedvEXT(r0, r1, r2)
            return
    }

    @org.lwjgl.system.NativeType("void")
    public static boolean glGetBooleanIndexedEXT(@org.lwjgl.system.NativeType("GLenum") int r3, @org.lwjgl.system.NativeType("GLuint") int r4) {
            r0 = r3
            r1 = r4
            boolean r0 = org.lwjgl.opengl.EXTDrawBuffers2.glGetBooleanIndexedEXT(r0, r1)
            return r0
    }

    public static native void nglNamedProgramStringEXT(int r0, int r1, int r2, int r3, long r4);

    public static void glNamedProgramStringEXT(@org.lwjgl.system.NativeType("GLuint") int r7, @org.lwjgl.system.NativeType("GLenum") int r8, @org.lwjgl.system.NativeType("GLenum") int r9, @org.lwjgl.system.NativeType("void const *") java.nio.ByteBuffer r10) {
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = r10
            int r3 = r3.remaining()
            r4 = r10
            long r4 = org.lwjgl.system.MemoryUtil.memAddress(r4)
            nglNamedProgramStringEXT(r0, r1, r2, r3, r4)
            return
    }

    public static native void glNamedProgramLocalParameter4dEXT(@org.lwjgl.system.NativeType("GLuint") int r0, @org.lwjgl.system.NativeType("GLenum") int r1, @org.lwjgl.system.NativeType("GLuint") int r2, @org.lwjgl.system.NativeType("GLdouble") double r3, @org.lwjgl.system.NativeType("GLdouble") double r5, @org.lwjgl.system.NativeType("GLdouble") double r7, @org.lwjgl.system.NativeType("GLdouble") double r9);

    public static native void nglNamedProgramLocalParameter4dvEXT(int r0, int r1, int r2, long r3);

    public static void glNamedProgramLocalParameter4dvEXT(@org.lwjgl.system.NativeType("GLuint") int r6, @org.lwjgl.system.NativeType("GLenum") int r7, @org.lwjgl.system.NativeType("GLuint") int r8, @org.lwjgl.system.NativeType("GLdouble const *") java.nio.DoubleBuffer r9) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r9
            r1 = 4
            org.lwjgl.system.Checks.check(r0, r1)
        Lb:
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            long r3 = org.lwjgl.system.MemoryUtil.memAddress(r3)
            nglNamedProgramLocalParameter4dvEXT(r0, r1, r2, r3)
            return
    }

    public static native void glNamedProgramLocalParameter4fEXT(@org.lwjgl.system.NativeType("GLuint") int r0, @org.lwjgl.system.NativeType("GLenum") int r1, @org.lwjgl.system.NativeType("GLuint") int r2, @org.lwjgl.system.NativeType("GLfloat") float r3, @org.lwjgl.system.NativeType("GLfloat") float r4, @org.lwjgl.system.NativeType("GLfloat") float r5, @org.lwjgl.system.NativeType("GLfloat") float r6);

    public static native void nglNamedProgramLocalParameter4fvEXT(int r0, int r1, int r2, long r3);

    public static void glNamedProgramLocalParameter4fvEXT(@org.lwjgl.system.NativeType("GLuint") int r6, @org.lwjgl.system.NativeType("GLenum") int r7, @org.lwjgl.system.NativeType("GLuint") int r8, @org.lwjgl.system.NativeType("GLfloat const *") java.nio.FloatBuffer r9) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r9
            r1 = 4
            org.lwjgl.system.Checks.check(r0, r1)
        Lb:
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            long r3 = org.lwjgl.system.MemoryUtil.memAddress(r3)
            nglNamedProgramLocalParameter4fvEXT(r0, r1, r2, r3)
            return
    }

    public static native void nglGetNamedProgramLocalParameterdvEXT(int r0, int r1, int r2, long r3);

    public static void glGetNamedProgramLocalParameterdvEXT(@org.lwjgl.system.NativeType("GLuint") int r6, @org.lwjgl.system.NativeType("GLenum") int r7, @org.lwjgl.system.NativeType("GLuint") int r8, @org.lwjgl.system.NativeType("GLdouble *") java.nio.DoubleBuffer r9) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r9
            r1 = 4
            org.lwjgl.system.Checks.check(r0, r1)
        Lb:
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            long r3 = org.lwjgl.system.MemoryUtil.memAddress(r3)
            nglGetNamedProgramLocalParameterdvEXT(r0, r1, r2, r3)
            return
    }

    public static native void nglGetNamedProgramLocalParameterfvEXT(int r0, int r1, int r2, long r3);

    public static void glGetNamedProgramLocalParameterfvEXT(@org.lwjgl.system.NativeType("GLuint") int r6, @org.lwjgl.system.NativeType("GLenum") int r7, @org.lwjgl.system.NativeType("GLuint") int r8, @org.lwjgl.system.NativeType("GLfloat *") java.nio.FloatBuffer r9) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r9
            r1 = 4
            org.lwjgl.system.Checks.check(r0, r1)
        Lb:
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            long r3 = org.lwjgl.system.MemoryUtil.memAddress(r3)
            nglGetNamedProgramLocalParameterfvEXT(r0, r1, r2, r3)
            return
    }

    public static native void nglGetNamedProgramivEXT(int r0, int r1, int r2, long r3);

    public static void glGetNamedProgramivEXT(@org.lwjgl.system.NativeType("GLuint") int r6, @org.lwjgl.system.NativeType("GLenum") int r7, @org.lwjgl.system.NativeType("GLenum") int r8, @org.lwjgl.system.NativeType("GLint *") java.nio.IntBuffer r9) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r9
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
        Lb:
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            long r3 = org.lwjgl.system.MemoryUtil.memAddress(r3)
            nglGetNamedProgramivEXT(r0, r1, r2, r3)
            return
    }

    @org.lwjgl.system.NativeType("void")
    public static int glGetNamedProgramiEXT(@org.lwjgl.system.NativeType("GLuint") int r6, @org.lwjgl.system.NativeType("GLenum") int r7, @org.lwjgl.system.NativeType("GLenum") int r8) {
            org.lwjgl.system.MemoryStack r0 = org.lwjgl.system.MemoryStack.stackGet()
            r9 = r0
            r0 = r9
            int r0 = r0.getPointer()
            r10 = r0
            r0 = r9
            r1 = 1
            java.nio.IntBuffer r0 = r0.callocInt(r1)     // Catch: java.lang.Throwable -> L2d
            r11 = r0
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r11
            long r3 = org.lwjgl.system.MemoryUtil.memAddress(r3)     // Catch: java.lang.Throwable -> L2d
            nglGetNamedProgramivEXT(r0, r1, r2, r3)     // Catch: java.lang.Throwable -> L2d
            r0 = r11
            r1 = 0
            int r0 = r0.get(r1)     // Catch: java.lang.Throwable -> L2d
            r12 = r0
            r0 = r9
            r1 = r10
            r0.setPointer(r1)
            r0 = r12
            return r0
        L2d:
            r13 = move-exception
            r0 = r9
            r1 = r10
            r0.setPointer(r1)
            r0 = r13
            throw r0
    }

    public static native void nglGetNamedProgramStringEXT(int r0, int r1, int r2, long r3);

    public static void glGetNamedProgramStringEXT(@org.lwjgl.system.NativeType("GLuint") int r6, @org.lwjgl.system.NativeType("GLenum") int r7, @org.lwjgl.system.NativeType("GLenum") int r8, @org.lwjgl.system.NativeType("void *") java.nio.ByteBuffer r9) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L17
            boolean r0 = org.lwjgl.system.Checks.DEBUG
            if (r0 == 0) goto L17
            r0 = r9
            r1 = r6
            r2 = r7
            r3 = 34343(0x8627, float:4.8125E-41)
            int r1 = glGetNamedProgramiEXT(r1, r2, r3)
            org.lwjgl.system.Checks.check(r0, r1)
        L17:
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            long r3 = org.lwjgl.system.MemoryUtil.memAddress(r3)
            nglGetNamedProgramStringEXT(r0, r1, r2, r3)
            return
    }

    public static native void nglCompressedTextureImage3DEXT(int r0, int r1, int r2, int r3, int r4, int r5, int r6, int r7, int r8, long r9);

    public static void glCompressedTextureImage3DEXT(@org.lwjgl.system.NativeType("GLuint") int r12, @org.lwjgl.system.NativeType("GLenum") int r13, @org.lwjgl.system.NativeType("GLint") int r14, @org.lwjgl.system.NativeType("GLenum") int r15, @org.lwjgl.system.NativeType("GLsizei") int r16, @org.lwjgl.system.NativeType("GLsizei") int r17, @org.lwjgl.system.NativeType("GLsizei") int r18, @org.lwjgl.system.NativeType("GLint") int r19, @org.lwjgl.system.NativeType("GLsizei") int r20, @org.lwjgl.system.NativeType("void const *") long r21) {
            r0 = r12
            r1 = r13
            r2 = r14
            r3 = r15
            r4 = r16
            r5 = r17
            r6 = r18
            r7 = r19
            r8 = r20
            r9 = r21
            nglCompressedTextureImage3DEXT(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9)
            return
    }

    public static void glCompressedTextureImage3DEXT(@org.lwjgl.system.NativeType("GLuint") int r12, @org.lwjgl.system.NativeType("GLenum") int r13, @org.lwjgl.system.NativeType("GLint") int r14, @org.lwjgl.system.NativeType("GLenum") int r15, @org.lwjgl.system.NativeType("GLsizei") int r16, @org.lwjgl.system.NativeType("GLsizei") int r17, @org.lwjgl.system.NativeType("GLsizei") int r18, @org.lwjgl.system.NativeType("GLint") int r19, @javax.annotation.Nullable @org.lwjgl.system.NativeType("void const *") java.nio.ByteBuffer r20) {
            r0 = r12
            r1 = r13
            r2 = r14
            r3 = r15
            r4 = r16
            r5 = r17
            r6 = r18
            r7 = r19
            r8 = r20
            int r8 = org.lwjgl.system.Checks.remainingSafe(r8)
            r9 = r20
            long r9 = org.lwjgl.system.MemoryUtil.memAddressSafe(r9)
            nglCompressedTextureImage3DEXT(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9)
            return
    }

    public static native void nglCompressedTextureImage2DEXT(int r0, int r1, int r2, int r3, int r4, int r5, int r6, int r7, long r8);

    public static void glCompressedTextureImage2DEXT(@org.lwjgl.system.NativeType("GLuint") int r11, @org.lwjgl.system.NativeType("GLenum") int r12, @org.lwjgl.system.NativeType("GLint") int r13, @org.lwjgl.system.NativeType("GLenum") int r14, @org.lwjgl.system.NativeType("GLsizei") int r15, @org.lwjgl.system.NativeType("GLsizei") int r16, @org.lwjgl.system.NativeType("GLint") int r17, @org.lwjgl.system.NativeType("GLsizei") int r18, @org.lwjgl.system.NativeType("void const *") long r19) {
            r0 = r11
            r1 = r12
            r2 = r13
            r3 = r14
            r4 = r15
            r5 = r16
            r6 = r17
            r7 = r18
            r8 = r19
            nglCompressedTextureImage2DEXT(r0, r1, r2, r3, r4, r5, r6, r7, r8)
            return
    }

    public static void glCompressedTextureImage2DEXT(@org.lwjgl.system.NativeType("GLuint") int r11, @org.lwjgl.system.NativeType("GLenum") int r12, @org.lwjgl.system.NativeType("GLint") int r13, @org.lwjgl.system.NativeType("GLenum") int r14, @org.lwjgl.system.NativeType("GLsizei") int r15, @org.lwjgl.system.NativeType("GLsizei") int r16, @org.lwjgl.system.NativeType("GLint") int r17, @javax.annotation.Nullable @org.lwjgl.system.NativeType("void const *") java.nio.ByteBuffer r18) {
            r0 = r11
            r1 = r12
            r2 = r13
            r3 = r14
            r4 = r15
            r5 = r16
            r6 = r17
            r7 = r18
            int r7 = org.lwjgl.system.Checks.remainingSafe(r7)
            r8 = r18
            long r8 = org.lwjgl.system.MemoryUtil.memAddressSafe(r8)
            nglCompressedTextureImage2DEXT(r0, r1, r2, r3, r4, r5, r6, r7, r8)
            return
    }

    public static native void nglCompressedTextureImage1DEXT(int r0, int r1, int r2, int r3, int r4, int r5, int r6, long r7);

    public static void glCompressedTextureImage1DEXT(@org.lwjgl.system.NativeType("GLuint") int r10, @org.lwjgl.system.NativeType("GLenum") int r11, @org.lwjgl.system.NativeType("GLint") int r12, @org.lwjgl.system.NativeType("GLenum") int r13, @org.lwjgl.system.NativeType("GLsizei") int r14, @org.lwjgl.system.NativeType("GLint") int r15, @org.lwjgl.system.NativeType("GLsizei") int r16, @org.lwjgl.system.NativeType("void const *") long r17) {
            r0 = r10
            r1 = r11
            r2 = r12
            r3 = r13
            r4 = r14
            r5 = r15
            r6 = r16
            r7 = r17
            nglCompressedTextureImage1DEXT(r0, r1, r2, r3, r4, r5, r6, r7)
            return
    }

    public static void glCompressedTextureImage1DEXT(@org.lwjgl.system.NativeType("GLuint") int r10, @org.lwjgl.system.NativeType("GLenum") int r11, @org.lwjgl.system.NativeType("GLint") int r12, @org.lwjgl.system.NativeType("GLenum") int r13, @org.lwjgl.system.NativeType("GLsizei") int r14, @org.lwjgl.system.NativeType("GLint") int r15, @javax.annotation.Nullable @org.lwjgl.system.NativeType("void const *") java.nio.ByteBuffer r16) {
            r0 = r10
            r1 = r11
            r2 = r12
            r3 = r13
            r4 = r14
            r5 = r15
            r6 = r16
            int r6 = org.lwjgl.system.Checks.remainingSafe(r6)
            r7 = r16
            long r7 = org.lwjgl.system.MemoryUtil.memAddressSafe(r7)
            nglCompressedTextureImage1DEXT(r0, r1, r2, r3, r4, r5, r6, r7)
            return
    }

    public static native void nglCompressedTextureSubImage3DEXT(int r0, int r1, int r2, int r3, int r4, int r5, int r6, int r7, int r8, int r9, int r10, long r11);

    public static void glCompressedTextureSubImage3DEXT(@org.lwjgl.system.NativeType("GLuint") int r14, @org.lwjgl.system.NativeType("GLenum") int r15, @org.lwjgl.system.NativeType("GLint") int r16, @org.lwjgl.system.NativeType("GLint") int r17, @org.lwjgl.system.NativeType("GLint") int r18, @org.lwjgl.system.NativeType("GLint") int r19, @org.lwjgl.system.NativeType("GLsizei") int r20, @org.lwjgl.system.NativeType("GLsizei") int r21, @org.lwjgl.system.NativeType("GLsizei") int r22, @org.lwjgl.system.NativeType("GLenum") int r23, @org.lwjgl.system.NativeType("GLsizei") int r24, @org.lwjgl.system.NativeType("void const *") long r25) {
            r0 = r14
            r1 = r15
            r2 = r16
            r3 = r17
            r4 = r18
            r5 = r19
            r6 = r20
            r7 = r21
            r8 = r22
            r9 = r23
            r10 = r24
            r11 = r25
            nglCompressedTextureSubImage3DEXT(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            return
    }

    public static void glCompressedTextureSubImage3DEXT(@org.lwjgl.system.NativeType("GLuint") int r14, @org.lwjgl.system.NativeType("GLenum") int r15, @org.lwjgl.system.NativeType("GLint") int r16, @org.lwjgl.system.NativeType("GLint") int r17, @org.lwjgl.system.NativeType("GLint") int r18, @org.lwjgl.system.NativeType("GLint") int r19, @org.lwjgl.system.NativeType("GLsizei") int r20, @org.lwjgl.system.NativeType("GLsizei") int r21, @org.lwjgl.system.NativeType("GLsizei") int r22, @org.lwjgl.system.NativeType("GLenum") int r23, @org.lwjgl.system.NativeType("void const *") java.nio.ByteBuffer r24) {
            r0 = r14
            r1 = r15
            r2 = r16
            r3 = r17
            r4 = r18
            r5 = r19
            r6 = r20
            r7 = r21
            r8 = r22
            r9 = r23
            r10 = r24
            int r10 = r10.remaining()
            r11 = r24
            long r11 = org.lwjgl.system.MemoryUtil.memAddress(r11)
            nglCompressedTextureSubImage3DEXT(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            return
    }

    public static native void nglCompressedTextureSubImage2DEXT(int r0, int r1, int r2, int r3, int r4, int r5, int r6, int r7, int r8, long r9);

    public static void glCompressedTextureSubImage2DEXT(@org.lwjgl.system.NativeType("GLuint") int r12, @org.lwjgl.system.NativeType("GLenum") int r13, @org.lwjgl.system.NativeType("GLint") int r14, @org.lwjgl.system.NativeType("GLint") int r15, @org.lwjgl.system.NativeType("GLint") int r16, @org.lwjgl.system.NativeType("GLsizei") int r17, @org.lwjgl.system.NativeType("GLsizei") int r18, @org.lwjgl.system.NativeType("GLenum") int r19, @org.lwjgl.system.NativeType("GLsizei") int r20, @org.lwjgl.system.NativeType("void const *") long r21) {
            r0 = r12
            r1 = r13
            r2 = r14
            r3 = r15
            r4 = r16
            r5 = r17
            r6 = r18
            r7 = r19
            r8 = r20
            r9 = r21
            nglCompressedTextureSubImage2DEXT(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9)
            return
    }

    public static void glCompressedTextureSubImage2DEXT(@org.lwjgl.system.NativeType("GLuint") int r12, @org.lwjgl.system.NativeType("GLenum") int r13, @org.lwjgl.system.NativeType("GLint") int r14, @org.lwjgl.system.NativeType("GLint") int r15, @org.lwjgl.system.NativeType("GLint") int r16, @org.lwjgl.system.NativeType("GLsizei") int r17, @org.lwjgl.system.NativeType("GLsizei") int r18, @org.lwjgl.system.NativeType("GLenum") int r19, @org.lwjgl.system.NativeType("void const *") java.nio.ByteBuffer r20) {
            r0 = r12
            r1 = r13
            r2 = r14
            r3 = r15
            r4 = r16
            r5 = r17
            r6 = r18
            r7 = r19
            r8 = r20
            int r8 = r8.remaining()
            r9 = r20
            long r9 = org.lwjgl.system.MemoryUtil.memAddress(r9)
            nglCompressedTextureSubImage2DEXT(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9)
            return
    }

    public static native void nglCompressedTextureSubImage1DEXT(int r0, int r1, int r2, int r3, int r4, int r5, int r6, long r7);

    public static void glCompressedTextureSubImage1DEXT(@org.lwjgl.system.NativeType("GLuint") int r10, @org.lwjgl.system.NativeType("GLenum") int r11, @org.lwjgl.system.NativeType("GLint") int r12, @org.lwjgl.system.NativeType("GLint") int r13, @org.lwjgl.system.NativeType("GLsizei") int r14, @org.lwjgl.system.NativeType("GLenum") int r15, @org.lwjgl.system.NativeType("GLsizei") int r16, @org.lwjgl.system.NativeType("void const *") long r17) {
            r0 = r10
            r1 = r11
            r2 = r12
            r3 = r13
            r4 = r14
            r5 = r15
            r6 = r16
            r7 = r17
            nglCompressedTextureSubImage1DEXT(r0, r1, r2, r3, r4, r5, r6, r7)
            return
    }

    public static void glCompressedTextureSubImage1DEXT(@org.lwjgl.system.NativeType("GLuint") int r10, @org.lwjgl.system.NativeType("GLenum") int r11, @org.lwjgl.system.NativeType("GLint") int r12, @org.lwjgl.system.NativeType("GLint") int r13, @org.lwjgl.system.NativeType("GLsizei") int r14, @org.lwjgl.system.NativeType("GLenum") int r15, @org.lwjgl.system.NativeType("void const *") java.nio.ByteBuffer r16) {
            r0 = r10
            r1 = r11
            r2 = r12
            r3 = r13
            r4 = r14
            r5 = r15
            r6 = r16
            int r6 = r6.remaining()
            r7 = r16
            long r7 = org.lwjgl.system.MemoryUtil.memAddress(r7)
            nglCompressedTextureSubImage1DEXT(r0, r1, r2, r3, r4, r5, r6, r7)
            return
    }

    public static native void nglGetCompressedTextureImageEXT(int r0, int r1, int r2, long r3);

    public static void glGetCompressedTextureImageEXT(@org.lwjgl.system.NativeType("GLuint") int r6, @org.lwjgl.system.NativeType("GLenum") int r7, @org.lwjgl.system.NativeType("GLint") int r8, @org.lwjgl.system.NativeType("void *") java.nio.ByteBuffer r9) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L18
            boolean r0 = org.lwjgl.system.Checks.DEBUG
            if (r0 == 0) goto L18
            r0 = r9
            r1 = r6
            r2 = r7
            r3 = r8
            r4 = 34464(0x86a0, float:4.8294E-41)
            int r1 = glGetTextureLevelParameteriEXT(r1, r2, r3, r4)
            org.lwjgl.system.Checks.check(r0, r1)
        L18:
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            long r3 = org.lwjgl.system.MemoryUtil.memAddress(r3)
            nglGetCompressedTextureImageEXT(r0, r1, r2, r3)
            return
    }

    public static void glGetCompressedTextureImageEXT(@org.lwjgl.system.NativeType("GLuint") int r6, @org.lwjgl.system.NativeType("GLenum") int r7, @org.lwjgl.system.NativeType("GLint") int r8, @org.lwjgl.system.NativeType("void *") long r9) {
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            nglGetCompressedTextureImageEXT(r0, r1, r2, r3)
            return
    }

    public static native void nglCompressedMultiTexImage3DEXT(int r0, int r1, int r2, int r3, int r4, int r5, int r6, int r7, int r8, long r9);

    public static void glCompressedMultiTexImage3DEXT(@org.lwjgl.system.NativeType("GLenum") int r12, @org.lwjgl.system.NativeType("GLenum") int r13, @org.lwjgl.system.NativeType("GLint") int r14, @org.lwjgl.system.NativeType("GLenum") int r15, @org.lwjgl.system.NativeType("GLsizei") int r16, @org.lwjgl.system.NativeType("GLsizei") int r17, @org.lwjgl.system.NativeType("GLsizei") int r18, @org.lwjgl.system.NativeType("GLint") int r19, @org.lwjgl.system.NativeType("GLsizei") int r20, @org.lwjgl.system.NativeType("void const *") long r21) {
            r0 = r12
            r1 = r13
            r2 = r14
            r3 = r15
            r4 = r16
            r5 = r17
            r6 = r18
            r7 = r19
            r8 = r20
            r9 = r21
            nglCompressedMultiTexImage3DEXT(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9)
            return
    }

    public static void glCompressedMultiTexImage3DEXT(@org.lwjgl.system.NativeType("GLenum") int r12, @org.lwjgl.system.NativeType("GLenum") int r13, @org.lwjgl.system.NativeType("GLint") int r14, @org.lwjgl.system.NativeType("GLenum") int r15, @org.lwjgl.system.NativeType("GLsizei") int r16, @org.lwjgl.system.NativeType("GLsizei") int r17, @org.lwjgl.system.NativeType("GLsizei") int r18, @org.lwjgl.system.NativeType("GLint") int r19, @javax.annotation.Nullable @org.lwjgl.system.NativeType("void const *") java.nio.ByteBuffer r20) {
            r0 = r12
            r1 = r13
            r2 = r14
            r3 = r15
            r4 = r16
            r5 = r17
            r6 = r18
            r7 = r19
            r8 = r20
            int r8 = org.lwjgl.system.Checks.remainingSafe(r8)
            r9 = r20
            long r9 = org.lwjgl.system.MemoryUtil.memAddressSafe(r9)
            nglCompressedMultiTexImage3DEXT(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9)
            return
    }

    public static native void nglCompressedMultiTexImage2DEXT(int r0, int r1, int r2, int r3, int r4, int r5, int r6, int r7, long r8);

    public static void glCompressedMultiTexImage2DEXT(@org.lwjgl.system.NativeType("GLenum") int r11, @org.lwjgl.system.NativeType("GLenum") int r12, @org.lwjgl.system.NativeType("GLint") int r13, @org.lwjgl.system.NativeType("GLenum") int r14, @org.lwjgl.system.NativeType("GLsizei") int r15, @org.lwjgl.system.NativeType("GLsizei") int r16, @org.lwjgl.system.NativeType("GLint") int r17, @org.lwjgl.system.NativeType("GLsizei") int r18, @org.lwjgl.system.NativeType("void const *") long r19) {
            r0 = r11
            r1 = r12
            r2 = r13
            r3 = r14
            r4 = r15
            r5 = r16
            r6 = r17
            r7 = r18
            r8 = r19
            nglCompressedMultiTexImage2DEXT(r0, r1, r2, r3, r4, r5, r6, r7, r8)
            return
    }

    public static void glCompressedMultiTexImage2DEXT(@org.lwjgl.system.NativeType("GLenum") int r11, @org.lwjgl.system.NativeType("GLenum") int r12, @org.lwjgl.system.NativeType("GLint") int r13, @org.lwjgl.system.NativeType("GLenum") int r14, @org.lwjgl.system.NativeType("GLsizei") int r15, @org.lwjgl.system.NativeType("GLsizei") int r16, @org.lwjgl.system.NativeType("GLint") int r17, @javax.annotation.Nullable @org.lwjgl.system.NativeType("void const *") java.nio.ByteBuffer r18) {
            r0 = r11
            r1 = r12
            r2 = r13
            r3 = r14
            r4 = r15
            r5 = r16
            r6 = r17
            r7 = r18
            int r7 = org.lwjgl.system.Checks.remainingSafe(r7)
            r8 = r18
            long r8 = org.lwjgl.system.MemoryUtil.memAddressSafe(r8)
            nglCompressedMultiTexImage2DEXT(r0, r1, r2, r3, r4, r5, r6, r7, r8)
            return
    }

    public static native void nglCompressedMultiTexImage1DEXT(int r0, int r1, int r2, int r3, int r4, int r5, int r6, long r7);

    public static void glCompressedMultiTexImage1DEXT(@org.lwjgl.system.NativeType("GLenum") int r10, @org.lwjgl.system.NativeType("GLenum") int r11, @org.lwjgl.system.NativeType("GLint") int r12, @org.lwjgl.system.NativeType("GLenum") int r13, @org.lwjgl.system.NativeType("GLsizei") int r14, @org.lwjgl.system.NativeType("GLint") int r15, @org.lwjgl.system.NativeType("GLsizei") int r16, @org.lwjgl.system.NativeType("void const *") long r17) {
            r0 = r10
            r1 = r11
            r2 = r12
            r3 = r13
            r4 = r14
            r5 = r15
            r6 = r16
            r7 = r17
            nglCompressedMultiTexImage1DEXT(r0, r1, r2, r3, r4, r5, r6, r7)
            return
    }

    public static void glCompressedMultiTexImage1DEXT(@org.lwjgl.system.NativeType("GLenum") int r10, @org.lwjgl.system.NativeType("GLenum") int r11, @org.lwjgl.system.NativeType("GLint") int r12, @org.lwjgl.system.NativeType("GLenum") int r13, @org.lwjgl.system.NativeType("GLsizei") int r14, @org.lwjgl.system.NativeType("GLint") int r15, @javax.annotation.Nullable @org.lwjgl.system.NativeType("void const *") java.nio.ByteBuffer r16) {
            r0 = r10
            r1 = r11
            r2 = r12
            r3 = r13
            r4 = r14
            r5 = r15
            r6 = r16
            int r6 = org.lwjgl.system.Checks.remainingSafe(r6)
            r7 = r16
            long r7 = org.lwjgl.system.MemoryUtil.memAddressSafe(r7)
            nglCompressedMultiTexImage1DEXT(r0, r1, r2, r3, r4, r5, r6, r7)
            return
    }

    public static native void nglCompressedMultiTexSubImage3DEXT(int r0, int r1, int r2, int r3, int r4, int r5, int r6, int r7, int r8, int r9, int r10, long r11);

    public static void glCompressedMultiTexSubImage3DEXT(@org.lwjgl.system.NativeType("GLenum") int r14, @org.lwjgl.system.NativeType("GLenum") int r15, @org.lwjgl.system.NativeType("GLint") int r16, @org.lwjgl.system.NativeType("GLint") int r17, @org.lwjgl.system.NativeType("GLint") int r18, @org.lwjgl.system.NativeType("GLint") int r19, @org.lwjgl.system.NativeType("GLsizei") int r20, @org.lwjgl.system.NativeType("GLsizei") int r21, @org.lwjgl.system.NativeType("GLsizei") int r22, @org.lwjgl.system.NativeType("GLenum") int r23, @org.lwjgl.system.NativeType("GLsizei") int r24, @org.lwjgl.system.NativeType("void const *") long r25) {
            r0 = r14
            r1 = r15
            r2 = r16
            r3 = r17
            r4 = r18
            r5 = r19
            r6 = r20
            r7 = r21
            r8 = r22
            r9 = r23
            r10 = r24
            r11 = r25
            nglCompressedMultiTexSubImage3DEXT(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            return
    }

    public static void glCompressedMultiTexSubImage3DEXT(@org.lwjgl.system.NativeType("GLenum") int r14, @org.lwjgl.system.NativeType("GLenum") int r15, @org.lwjgl.system.NativeType("GLint") int r16, @org.lwjgl.system.NativeType("GLint") int r17, @org.lwjgl.system.NativeType("GLint") int r18, @org.lwjgl.system.NativeType("GLint") int r19, @org.lwjgl.system.NativeType("GLsizei") int r20, @org.lwjgl.system.NativeType("GLsizei") int r21, @org.lwjgl.system.NativeType("GLsizei") int r22, @org.lwjgl.system.NativeType("GLenum") int r23, @org.lwjgl.system.NativeType("void const *") java.nio.ByteBuffer r24) {
            r0 = r14
            r1 = r15
            r2 = r16
            r3 = r17
            r4 = r18
            r5 = r19
            r6 = r20
            r7 = r21
            r8 = r22
            r9 = r23
            r10 = r24
            int r10 = r10.remaining()
            r11 = r24
            long r11 = org.lwjgl.system.MemoryUtil.memAddress(r11)
            nglCompressedMultiTexSubImage3DEXT(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            return
    }

    public static native void nglCompressedMultiTexSubImage2DEXT(int r0, int r1, int r2, int r3, int r4, int r5, int r6, int r7, int r8, long r9);

    public static void glCompressedMultiTexSubImage2DEXT(@org.lwjgl.system.NativeType("GLenum") int r12, @org.lwjgl.system.NativeType("GLenum") int r13, @org.lwjgl.system.NativeType("GLint") int r14, @org.lwjgl.system.NativeType("GLint") int r15, @org.lwjgl.system.NativeType("GLint") int r16, @org.lwjgl.system.NativeType("GLsizei") int r17, @org.lwjgl.system.NativeType("GLsizei") int r18, @org.lwjgl.system.NativeType("GLenum") int r19, @org.lwjgl.system.NativeType("GLsizei") int r20, @org.lwjgl.system.NativeType("void const *") long r21) {
            r0 = r12
            r1 = r13
            r2 = r14
            r3 = r15
            r4 = r16
            r5 = r17
            r6 = r18
            r7 = r19
            r8 = r20
            r9 = r21
            nglCompressedMultiTexSubImage2DEXT(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9)
            return
    }

    public static void glCompressedMultiTexSubImage2DEXT(@org.lwjgl.system.NativeType("GLenum") int r12, @org.lwjgl.system.NativeType("GLenum") int r13, @org.lwjgl.system.NativeType("GLint") int r14, @org.lwjgl.system.NativeType("GLint") int r15, @org.lwjgl.system.NativeType("GLint") int r16, @org.lwjgl.system.NativeType("GLsizei") int r17, @org.lwjgl.system.NativeType("GLsizei") int r18, @org.lwjgl.system.NativeType("GLenum") int r19, @org.lwjgl.system.NativeType("void const *") java.nio.ByteBuffer r20) {
            r0 = r12
            r1 = r13
            r2 = r14
            r3 = r15
            r4 = r16
            r5 = r17
            r6 = r18
            r7 = r19
            r8 = r20
            int r8 = r8.remaining()
            r9 = r20
            long r9 = org.lwjgl.system.MemoryUtil.memAddress(r9)
            nglCompressedMultiTexSubImage2DEXT(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9)
            return
    }

    public static native void nglCompressedMultiTexSubImage1DEXT(int r0, int r1, int r2, int r3, int r4, int r5, int r6, long r7);

    public static void glCompressedMultiTexSubImage1DEXT(@org.lwjgl.system.NativeType("GLenum") int r10, @org.lwjgl.system.NativeType("GLenum") int r11, @org.lwjgl.system.NativeType("GLint") int r12, @org.lwjgl.system.NativeType("GLint") int r13, @org.lwjgl.system.NativeType("GLsizei") int r14, @org.lwjgl.system.NativeType("GLenum") int r15, @org.lwjgl.system.NativeType("GLsizei") int r16, @org.lwjgl.system.NativeType("void const *") long r17) {
            r0 = r10
            r1 = r11
            r2 = r12
            r3 = r13
            r4 = r14
            r5 = r15
            r6 = r16
            r7 = r17
            nglCompressedMultiTexSubImage1DEXT(r0, r1, r2, r3, r4, r5, r6, r7)
            return
    }

    public static void glCompressedMultiTexSubImage1DEXT(@org.lwjgl.system.NativeType("GLenum") int r10, @org.lwjgl.system.NativeType("GLenum") int r11, @org.lwjgl.system.NativeType("GLint") int r12, @org.lwjgl.system.NativeType("GLint") int r13, @org.lwjgl.system.NativeType("GLsizei") int r14, @org.lwjgl.system.NativeType("GLenum") int r15, @org.lwjgl.system.NativeType("void const *") java.nio.ByteBuffer r16) {
            r0 = r10
            r1 = r11
            r2 = r12
            r3 = r13
            r4 = r14
            r5 = r15
            r6 = r16
            int r6 = r6.remaining()
            r7 = r16
            long r7 = org.lwjgl.system.MemoryUtil.memAddress(r7)
            nglCompressedMultiTexSubImage1DEXT(r0, r1, r2, r3, r4, r5, r6, r7)
            return
    }

    public static native void nglGetCompressedMultiTexImageEXT(int r0, int r1, int r2, long r3);

    public static void glGetCompressedMultiTexImageEXT(@org.lwjgl.system.NativeType("GLenum") int r6, @org.lwjgl.system.NativeType("GLenum") int r7, @org.lwjgl.system.NativeType("GLint") int r8, @org.lwjgl.system.NativeType("void *") java.nio.ByteBuffer r9) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L18
            boolean r0 = org.lwjgl.system.Checks.DEBUG
            if (r0 == 0) goto L18
            r0 = r9
            r1 = r6
            r2 = r7
            r3 = r8
            r4 = 34464(0x86a0, float:4.8294E-41)
            int r1 = glGetMultiTexLevelParameteriEXT(r1, r2, r3, r4)
            org.lwjgl.system.Checks.check(r0, r1)
        L18:
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            long r3 = org.lwjgl.system.MemoryUtil.memAddress(r3)
            nglGetCompressedMultiTexImageEXT(r0, r1, r2, r3)
            return
    }

    public static void glGetCompressedMultiTexImageEXT(@org.lwjgl.system.NativeType("GLenum") int r6, @org.lwjgl.system.NativeType("GLenum") int r7, @org.lwjgl.system.NativeType("GLint") int r8, @org.lwjgl.system.NativeType("void *") long r9) {
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            nglGetCompressedMultiTexImageEXT(r0, r1, r2, r3)
            return
    }

    public static native void nglMatrixLoadTransposefEXT(int r0, long r1);

    public static void glMatrixLoadTransposefEXT(@org.lwjgl.system.NativeType("GLenum") int r4, @org.lwjgl.system.NativeType("GLfloat const *") java.nio.FloatBuffer r5) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lc
            r0 = r5
            r1 = 16
            org.lwjgl.system.Checks.check(r0, r1)
        Lc:
            r0 = r4
            r1 = r5
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            nglMatrixLoadTransposefEXT(r0, r1)
            return
    }

    public static native void nglMatrixLoadTransposedEXT(int r0, long r1);

    public static void glMatrixLoadTransposedEXT(@org.lwjgl.system.NativeType("GLenum") int r4, @org.lwjgl.system.NativeType("GLdouble const *") java.nio.DoubleBuffer r5) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lc
            r0 = r5
            r1 = 16
            org.lwjgl.system.Checks.check(r0, r1)
        Lc:
            r0 = r4
            r1 = r5
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            nglMatrixLoadTransposedEXT(r0, r1)
            return
    }

    public static native void nglMatrixMultTransposefEXT(int r0, long r1);

    public static void glMatrixMultTransposefEXT(@org.lwjgl.system.NativeType("GLenum") int r4, @org.lwjgl.system.NativeType("GLfloat const *") java.nio.FloatBuffer r5) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lc
            r0 = r5
            r1 = 16
            org.lwjgl.system.Checks.check(r0, r1)
        Lc:
            r0 = r4
            r1 = r5
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            nglMatrixMultTransposefEXT(r0, r1)
            return
    }

    public static native void nglMatrixMultTransposedEXT(int r0, long r1);

    public static void glMatrixMultTransposedEXT(@org.lwjgl.system.NativeType("GLenum") int r4, @org.lwjgl.system.NativeType("GLdouble const *") java.nio.DoubleBuffer r5) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lc
            r0 = r5
            r1 = 16
            org.lwjgl.system.Checks.check(r0, r1)
        Lc:
            r0 = r4
            r1 = r5
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            nglMatrixMultTransposedEXT(r0, r1)
            return
    }

    public static native void nglNamedBufferDataEXT(int r0, long r1, long r3, int r5);

    public static void glNamedBufferDataEXT(@org.lwjgl.system.NativeType("GLuint") int r7, @org.lwjgl.system.NativeType("GLsizeiptr") long r8, @org.lwjgl.system.NativeType("GLenum") int r10) {
            r0 = r7
            r1 = r8
            r2 = 0
            r3 = r10
            nglNamedBufferDataEXT(r0, r1, r2, r3)
            return
    }

    public static void glNamedBufferDataEXT(@org.lwjgl.system.NativeType("GLuint") int r7, @org.lwjgl.system.NativeType("void const *") java.nio.ByteBuffer r8, @org.lwjgl.system.NativeType("GLenum") int r9) {
            r0 = r7
            r1 = r8
            int r1 = r1.remaining()
            long r1 = (long) r1
            r2 = r8
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            r3 = r9
            nglNamedBufferDataEXT(r0, r1, r2, r3)
            return
    }

    public static void glNamedBufferDataEXT(@org.lwjgl.system.NativeType("GLuint") int r7, @org.lwjgl.system.NativeType("void const *") java.nio.ShortBuffer r8, @org.lwjgl.system.NativeType("GLenum") int r9) {
            r0 = r7
            r1 = r8
            int r1 = r1.remaining()
            long r1 = java.lang.Integer.toUnsignedLong(r1)
            r2 = 1
            long r1 = r1 << r2
            r2 = r8
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            r3 = r9
            nglNamedBufferDataEXT(r0, r1, r2, r3)
            return
    }

    public static void glNamedBufferDataEXT(@org.lwjgl.system.NativeType("GLuint") int r7, @org.lwjgl.system.NativeType("void const *") java.nio.IntBuffer r8, @org.lwjgl.system.NativeType("GLenum") int r9) {
            r0 = r7
            r1 = r8
            int r1 = r1.remaining()
            long r1 = java.lang.Integer.toUnsignedLong(r1)
            r2 = 2
            long r1 = r1 << r2
            r2 = r8
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            r3 = r9
            nglNamedBufferDataEXT(r0, r1, r2, r3)
            return
    }

    public static void glNamedBufferDataEXT(@org.lwjgl.system.NativeType("GLuint") int r7, @org.lwjgl.system.NativeType("void const *") java.nio.FloatBuffer r8, @org.lwjgl.system.NativeType("GLenum") int r9) {
            r0 = r7
            r1 = r8
            int r1 = r1.remaining()
            long r1 = java.lang.Integer.toUnsignedLong(r1)
            r2 = 2
            long r1 = r1 << r2
            r2 = r8
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            r3 = r9
            nglNamedBufferDataEXT(r0, r1, r2, r3)
            return
    }

    public static void glNamedBufferDataEXT(@org.lwjgl.system.NativeType("GLuint") int r7, @org.lwjgl.system.NativeType("void const *") java.nio.DoubleBuffer r8, @org.lwjgl.system.NativeType("GLenum") int r9) {
            r0 = r7
            r1 = r8
            int r1 = r1.remaining()
            long r1 = java.lang.Integer.toUnsignedLong(r1)
            r2 = 3
            long r1 = r1 << r2
            r2 = r8
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            r3 = r9
            nglNamedBufferDataEXT(r0, r1, r2, r3)
            return
    }

    public static native void nglNamedBufferSubDataEXT(int r0, long r1, long r3, long r5);

    public static void glNamedBufferSubDataEXT(@org.lwjgl.system.NativeType("GLuint") int r8, @org.lwjgl.system.NativeType("GLintptr") long r9, @org.lwjgl.system.NativeType("void const *") java.nio.ByteBuffer r11) {
            r0 = r8
            r1 = r9
            r2 = r11
            int r2 = r2.remaining()
            long r2 = (long) r2
            r3 = r11
            long r3 = org.lwjgl.system.MemoryUtil.memAddress(r3)
            nglNamedBufferSubDataEXT(r0, r1, r2, r3)
            return
    }

    public static void glNamedBufferSubDataEXT(@org.lwjgl.system.NativeType("GLuint") int r8, @org.lwjgl.system.NativeType("GLintptr") long r9, @org.lwjgl.system.NativeType("void const *") java.nio.ShortBuffer r11) {
            r0 = r8
            r1 = r9
            r2 = r11
            int r2 = r2.remaining()
            long r2 = java.lang.Integer.toUnsignedLong(r2)
            r3 = 1
            long r2 = r2 << r3
            r3 = r11
            long r3 = org.lwjgl.system.MemoryUtil.memAddress(r3)
            nglNamedBufferSubDataEXT(r0, r1, r2, r3)
            return
    }

    public static void glNamedBufferSubDataEXT(@org.lwjgl.system.NativeType("GLuint") int r8, @org.lwjgl.system.NativeType("GLintptr") long r9, @org.lwjgl.system.NativeType("void const *") java.nio.IntBuffer r11) {
            r0 = r8
            r1 = r9
            r2 = r11
            int r2 = r2.remaining()
            long r2 = java.lang.Integer.toUnsignedLong(r2)
            r3 = 2
            long r2 = r2 << r3
            r3 = r11
            long r3 = org.lwjgl.system.MemoryUtil.memAddress(r3)
            nglNamedBufferSubDataEXT(r0, r1, r2, r3)
            return
    }

    public static void glNamedBufferSubDataEXT(@org.lwjgl.system.NativeType("GLuint") int r8, @org.lwjgl.system.NativeType("GLintptr") long r9, @org.lwjgl.system.NativeType("void const *") java.nio.FloatBuffer r11) {
            r0 = r8
            r1 = r9
            r2 = r11
            int r2 = r2.remaining()
            long r2 = java.lang.Integer.toUnsignedLong(r2)
            r3 = 2
            long r2 = r2 << r3
            r3 = r11
            long r3 = org.lwjgl.system.MemoryUtil.memAddress(r3)
            nglNamedBufferSubDataEXT(r0, r1, r2, r3)
            return
    }

    public static void glNamedBufferSubDataEXT(@org.lwjgl.system.NativeType("GLuint") int r8, @org.lwjgl.system.NativeType("GLintptr") long r9, @org.lwjgl.system.NativeType("void const *") java.nio.DoubleBuffer r11) {
            r0 = r8
            r1 = r9
            r2 = r11
            int r2 = r2.remaining()
            long r2 = java.lang.Integer.toUnsignedLong(r2)
            r3 = 3
            long r2 = r2 << r3
            r3 = r11
            long r3 = org.lwjgl.system.MemoryUtil.memAddress(r3)
            nglNamedBufferSubDataEXT(r0, r1, r2, r3)
            return
    }

    public static native long nglMapNamedBufferEXT(int r0, int r1);

    @javax.annotation.Nullable
    @org.lwjgl.system.NativeType("void *")
    public static java.nio.ByteBuffer glMapNamedBufferEXT(@org.lwjgl.system.NativeType("GLuint") int r5, @org.lwjgl.system.NativeType("GLenum") int r6) {
            r0 = r5
            r1 = r6
            long r0 = nglMapNamedBufferEXT(r0, r1)
            r7 = r0
            r0 = r7
            r1 = r5
            r2 = 34660(0x8764, float:4.8569E-41)
            int r1 = glGetNamedBufferParameteriEXT(r1, r2)
            java.nio.ByteBuffer r0 = org.lwjgl.system.MemoryUtil.memByteBufferSafe(r0, r1)
            return r0
    }

    @javax.annotation.Nullable
    @org.lwjgl.system.NativeType("void *")
    public static java.nio.ByteBuffer glMapNamedBufferEXT(@org.lwjgl.system.NativeType("GLuint") int r5, @org.lwjgl.system.NativeType("GLenum") int r6, @javax.annotation.Nullable java.nio.ByteBuffer r7) {
            r0 = r5
            r1 = r6
            long r0 = nglMapNamedBufferEXT(r0, r1)
            r8 = r0
            r0 = r5
            r1 = 34660(0x8764, float:4.8569E-41)
            int r0 = glGetNamedBufferParameteriEXT(r0, r1)
            r10 = r0
            r0 = r7
            r1 = r8
            r2 = r10
            java.nio.ByteBuffer r0 = org.lwjgl.system.APIUtil.apiGetMappedBuffer(r0, r1, r2)
            return r0
    }

    @javax.annotation.Nullable
    @org.lwjgl.system.NativeType("void *")
    public static java.nio.ByteBuffer glMapNamedBufferEXT(@org.lwjgl.system.NativeType("GLuint") int r6, @org.lwjgl.system.NativeType("GLenum") int r7, long r8, @javax.annotation.Nullable java.nio.ByteBuffer r10) {
            r0 = r6
            r1 = r7
            long r0 = nglMapNamedBufferEXT(r0, r1)
            r11 = r0
            r0 = r10
            r1 = r11
            r2 = r8
            int r2 = (int) r2
            java.nio.ByteBuffer r0 = org.lwjgl.system.APIUtil.apiGetMappedBuffer(r0, r1, r2)
            return r0
    }

    @org.lwjgl.system.NativeType("GLboolean")
    public static native boolean glUnmapNamedBufferEXT(@org.lwjgl.system.NativeType("GLuint") int r0);

    public static native void nglGetNamedBufferParameterivEXT(int r0, int r1, long r2);

    public static void glGetNamedBufferParameterivEXT(@org.lwjgl.system.NativeType("GLuint") int r5, @org.lwjgl.system.NativeType("GLenum") int r6, @org.lwjgl.system.NativeType("GLint *") java.nio.IntBuffer r7) {
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
            nglGetNamedBufferParameterivEXT(r0, r1, r2)
            return
    }

    @org.lwjgl.system.NativeType("void")
    public static int glGetNamedBufferParameteriEXT(@org.lwjgl.system.NativeType("GLuint") int r5, @org.lwjgl.system.NativeType("GLenum") int r6) {
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
            nglGetNamedBufferParameterivEXT(r0, r1, r2)     // Catch: java.lang.Throwable -> L2a
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

    public static native void nglGetNamedBufferSubDataEXT(int r0, long r1, long r3, long r5);

    public static void glGetNamedBufferSubDataEXT(@org.lwjgl.system.NativeType("GLuint") int r8, @org.lwjgl.system.NativeType("GLintptr") long r9, @org.lwjgl.system.NativeType("void *") java.nio.ByteBuffer r11) {
            r0 = r8
            r1 = r9
            r2 = r11
            int r2 = r2.remaining()
            long r2 = (long) r2
            r3 = r11
            long r3 = org.lwjgl.system.MemoryUtil.memAddress(r3)
            nglGetNamedBufferSubDataEXT(r0, r1, r2, r3)
            return
    }

    public static void glGetNamedBufferSubDataEXT(@org.lwjgl.system.NativeType("GLuint") int r8, @org.lwjgl.system.NativeType("GLintptr") long r9, @org.lwjgl.system.NativeType("void *") java.nio.ShortBuffer r11) {
            r0 = r8
            r1 = r9
            r2 = r11
            int r2 = r2.remaining()
            long r2 = java.lang.Integer.toUnsignedLong(r2)
            r3 = 1
            long r2 = r2 << r3
            r3 = r11
            long r3 = org.lwjgl.system.MemoryUtil.memAddress(r3)
            nglGetNamedBufferSubDataEXT(r0, r1, r2, r3)
            return
    }

    public static void glGetNamedBufferSubDataEXT(@org.lwjgl.system.NativeType("GLuint") int r8, @org.lwjgl.system.NativeType("GLintptr") long r9, @org.lwjgl.system.NativeType("void *") java.nio.IntBuffer r11) {
            r0 = r8
            r1 = r9
            r2 = r11
            int r2 = r2.remaining()
            long r2 = java.lang.Integer.toUnsignedLong(r2)
            r3 = 2
            long r2 = r2 << r3
            r3 = r11
            long r3 = org.lwjgl.system.MemoryUtil.memAddress(r3)
            nglGetNamedBufferSubDataEXT(r0, r1, r2, r3)
            return
    }

    public static void glGetNamedBufferSubDataEXT(@org.lwjgl.system.NativeType("GLuint") int r8, @org.lwjgl.system.NativeType("GLintptr") long r9, @org.lwjgl.system.NativeType("void *") java.nio.FloatBuffer r11) {
            r0 = r8
            r1 = r9
            r2 = r11
            int r2 = r2.remaining()
            long r2 = java.lang.Integer.toUnsignedLong(r2)
            r3 = 2
            long r2 = r2 << r3
            r3 = r11
            long r3 = org.lwjgl.system.MemoryUtil.memAddress(r3)
            nglGetNamedBufferSubDataEXT(r0, r1, r2, r3)
            return
    }

    public static void glGetNamedBufferSubDataEXT(@org.lwjgl.system.NativeType("GLuint") int r8, @org.lwjgl.system.NativeType("GLintptr") long r9, @org.lwjgl.system.NativeType("void *") java.nio.DoubleBuffer r11) {
            r0 = r8
            r1 = r9
            r2 = r11
            int r2 = r2.remaining()
            long r2 = java.lang.Integer.toUnsignedLong(r2)
            r3 = 3
            long r2 = r2 << r3
            r3 = r11
            long r3 = org.lwjgl.system.MemoryUtil.memAddress(r3)
            nglGetNamedBufferSubDataEXT(r0, r1, r2, r3)
            return
    }

    public static native void glProgramUniform1fEXT(@org.lwjgl.system.NativeType("GLuint") int r0, @org.lwjgl.system.NativeType("GLint") int r1, @org.lwjgl.system.NativeType("GLfloat") float r2);

    public static native void glProgramUniform2fEXT(@org.lwjgl.system.NativeType("GLuint") int r0, @org.lwjgl.system.NativeType("GLint") int r1, @org.lwjgl.system.NativeType("GLfloat") float r2, @org.lwjgl.system.NativeType("GLfloat") float r3);

    public static native void glProgramUniform3fEXT(@org.lwjgl.system.NativeType("GLuint") int r0, @org.lwjgl.system.NativeType("GLint") int r1, @org.lwjgl.system.NativeType("GLfloat") float r2, @org.lwjgl.system.NativeType("GLfloat") float r3, @org.lwjgl.system.NativeType("GLfloat") float r4);

    public static native void glProgramUniform4fEXT(@org.lwjgl.system.NativeType("GLuint") int r0, @org.lwjgl.system.NativeType("GLint") int r1, @org.lwjgl.system.NativeType("GLfloat") float r2, @org.lwjgl.system.NativeType("GLfloat") float r3, @org.lwjgl.system.NativeType("GLfloat") float r4, @org.lwjgl.system.NativeType("GLfloat") float r5);

    public static native void glProgramUniform1iEXT(@org.lwjgl.system.NativeType("GLuint") int r0, @org.lwjgl.system.NativeType("GLint") int r1, @org.lwjgl.system.NativeType("GLint") int r2);

    public static native void glProgramUniform2iEXT(@org.lwjgl.system.NativeType("GLuint") int r0, @org.lwjgl.system.NativeType("GLint") int r1, @org.lwjgl.system.NativeType("GLint") int r2, @org.lwjgl.system.NativeType("GLint") int r3);

    public static native void glProgramUniform3iEXT(@org.lwjgl.system.NativeType("GLuint") int r0, @org.lwjgl.system.NativeType("GLint") int r1, @org.lwjgl.system.NativeType("GLint") int r2, @org.lwjgl.system.NativeType("GLint") int r3, @org.lwjgl.system.NativeType("GLint") int r4);

    public static native void glProgramUniform4iEXT(@org.lwjgl.system.NativeType("GLuint") int r0, @org.lwjgl.system.NativeType("GLint") int r1, @org.lwjgl.system.NativeType("GLint") int r2, @org.lwjgl.system.NativeType("GLint") int r3, @org.lwjgl.system.NativeType("GLint") int r4, @org.lwjgl.system.NativeType("GLint") int r5);

    public static native void nglProgramUniform1fvEXT(int r0, int r1, int r2, long r3);

    public static void glProgramUniform1fvEXT(@org.lwjgl.system.NativeType("GLuint") int r6, @org.lwjgl.system.NativeType("GLint") int r7, @org.lwjgl.system.NativeType("GLfloat const *") java.nio.FloatBuffer r8) {
            r0 = r6
            r1 = r7
            r2 = r8
            int r2 = r2.remaining()
            r3 = r8
            long r3 = org.lwjgl.system.MemoryUtil.memAddress(r3)
            nglProgramUniform1fvEXT(r0, r1, r2, r3)
            return
    }

    public static native void nglProgramUniform2fvEXT(int r0, int r1, int r2, long r3);

    public static void glProgramUniform2fvEXT(@org.lwjgl.system.NativeType("GLuint") int r6, @org.lwjgl.system.NativeType("GLint") int r7, @org.lwjgl.system.NativeType("GLfloat const *") java.nio.FloatBuffer r8) {
            r0 = r6
            r1 = r7
            r2 = r8
            int r2 = r2.remaining()
            r3 = 1
            int r2 = r2 >> r3
            r3 = r8
            long r3 = org.lwjgl.system.MemoryUtil.memAddress(r3)
            nglProgramUniform2fvEXT(r0, r1, r2, r3)
            return
    }

    public static native void nglProgramUniform3fvEXT(int r0, int r1, int r2, long r3);

    public static void glProgramUniform3fvEXT(@org.lwjgl.system.NativeType("GLuint") int r6, @org.lwjgl.system.NativeType("GLint") int r7, @org.lwjgl.system.NativeType("GLfloat const *") java.nio.FloatBuffer r8) {
            r0 = r6
            r1 = r7
            r2 = r8
            int r2 = r2.remaining()
            r3 = 3
            int r2 = r2 / r3
            r3 = r8
            long r3 = org.lwjgl.system.MemoryUtil.memAddress(r3)
            nglProgramUniform3fvEXT(r0, r1, r2, r3)
            return
    }

    public static native void nglProgramUniform4fvEXT(int r0, int r1, int r2, long r3);

    public static void glProgramUniform4fvEXT(@org.lwjgl.system.NativeType("GLuint") int r6, @org.lwjgl.system.NativeType("GLint") int r7, @org.lwjgl.system.NativeType("GLfloat const *") java.nio.FloatBuffer r8) {
            r0 = r6
            r1 = r7
            r2 = r8
            int r2 = r2.remaining()
            r3 = 2
            int r2 = r2 >> r3
            r3 = r8
            long r3 = org.lwjgl.system.MemoryUtil.memAddress(r3)
            nglProgramUniform4fvEXT(r0, r1, r2, r3)
            return
    }

    public static native void nglProgramUniform1ivEXT(int r0, int r1, int r2, long r3);

    public static void glProgramUniform1ivEXT(@org.lwjgl.system.NativeType("GLuint") int r6, @org.lwjgl.system.NativeType("GLint") int r7, @org.lwjgl.system.NativeType("GLint const *") java.nio.IntBuffer r8) {
            r0 = r6
            r1 = r7
            r2 = r8
            int r2 = r2.remaining()
            r3 = r8
            long r3 = org.lwjgl.system.MemoryUtil.memAddress(r3)
            nglProgramUniform1ivEXT(r0, r1, r2, r3)
            return
    }

    public static native void nglProgramUniform2ivEXT(int r0, int r1, int r2, long r3);

    public static void glProgramUniform2ivEXT(@org.lwjgl.system.NativeType("GLuint") int r6, @org.lwjgl.system.NativeType("GLint") int r7, @org.lwjgl.system.NativeType("GLint const *") java.nio.IntBuffer r8) {
            r0 = r6
            r1 = r7
            r2 = r8
            int r2 = r2.remaining()
            r3 = 1
            int r2 = r2 >> r3
            r3 = r8
            long r3 = org.lwjgl.system.MemoryUtil.memAddress(r3)
            nglProgramUniform2ivEXT(r0, r1, r2, r3)
            return
    }

    public static native void nglProgramUniform3ivEXT(int r0, int r1, int r2, long r3);

    public static void glProgramUniform3ivEXT(@org.lwjgl.system.NativeType("GLuint") int r6, @org.lwjgl.system.NativeType("GLint") int r7, @org.lwjgl.system.NativeType("GLint const *") java.nio.IntBuffer r8) {
            r0 = r6
            r1 = r7
            r2 = r8
            int r2 = r2.remaining()
            r3 = 3
            int r2 = r2 / r3
            r3 = r8
            long r3 = org.lwjgl.system.MemoryUtil.memAddress(r3)
            nglProgramUniform3ivEXT(r0, r1, r2, r3)
            return
    }

    public static native void nglProgramUniform4ivEXT(int r0, int r1, int r2, long r3);

    public static void glProgramUniform4ivEXT(@org.lwjgl.system.NativeType("GLuint") int r6, @org.lwjgl.system.NativeType("GLint") int r7, @org.lwjgl.system.NativeType("GLint const *") java.nio.IntBuffer r8) {
            r0 = r6
            r1 = r7
            r2 = r8
            int r2 = r2.remaining()
            r3 = 2
            int r2 = r2 >> r3
            r3 = r8
            long r3 = org.lwjgl.system.MemoryUtil.memAddress(r3)
            nglProgramUniform4ivEXT(r0, r1, r2, r3)
            return
    }

    public static native void nglProgramUniformMatrix2fvEXT(int r0, int r1, int r2, boolean r3, long r4);

    public static void glProgramUniformMatrix2fvEXT(@org.lwjgl.system.NativeType("GLuint") int r7, @org.lwjgl.system.NativeType("GLint") int r8, @org.lwjgl.system.NativeType("GLboolean") boolean r9, @org.lwjgl.system.NativeType("GLfloat const *") java.nio.FloatBuffer r10) {
            r0 = r7
            r1 = r8
            r2 = r10
            int r2 = r2.remaining()
            r3 = 2
            int r2 = r2 >> r3
            r3 = r9
            r4 = r10
            long r4 = org.lwjgl.system.MemoryUtil.memAddress(r4)
            nglProgramUniformMatrix2fvEXT(r0, r1, r2, r3, r4)
            return
    }

    public static native void nglProgramUniformMatrix3fvEXT(int r0, int r1, int r2, boolean r3, long r4);

    public static void glProgramUniformMatrix3fvEXT(@org.lwjgl.system.NativeType("GLuint") int r7, @org.lwjgl.system.NativeType("GLint") int r8, @org.lwjgl.system.NativeType("GLboolean") boolean r9, @org.lwjgl.system.NativeType("GLfloat const *") java.nio.FloatBuffer r10) {
            r0 = r7
            r1 = r8
            r2 = r10
            int r2 = r2.remaining()
            r3 = 9
            int r2 = r2 / r3
            r3 = r9
            r4 = r10
            long r4 = org.lwjgl.system.MemoryUtil.memAddress(r4)
            nglProgramUniformMatrix3fvEXT(r0, r1, r2, r3, r4)
            return
    }

    public static native void nglProgramUniformMatrix4fvEXT(int r0, int r1, int r2, boolean r3, long r4);

    public static void glProgramUniformMatrix4fvEXT(@org.lwjgl.system.NativeType("GLuint") int r7, @org.lwjgl.system.NativeType("GLint") int r8, @org.lwjgl.system.NativeType("GLboolean") boolean r9, @org.lwjgl.system.NativeType("GLfloat const *") java.nio.FloatBuffer r10) {
            r0 = r7
            r1 = r8
            r2 = r10
            int r2 = r2.remaining()
            r3 = 4
            int r2 = r2 >> r3
            r3 = r9
            r4 = r10
            long r4 = org.lwjgl.system.MemoryUtil.memAddress(r4)
            nglProgramUniformMatrix4fvEXT(r0, r1, r2, r3, r4)
            return
    }

    public static native void nglProgramUniformMatrix2x3fvEXT(int r0, int r1, int r2, boolean r3, long r4);

    public static void glProgramUniformMatrix2x3fvEXT(@org.lwjgl.system.NativeType("GLuint") int r7, @org.lwjgl.system.NativeType("GLint") int r8, @org.lwjgl.system.NativeType("GLboolean") boolean r9, @org.lwjgl.system.NativeType("GLfloat const *") java.nio.FloatBuffer r10) {
            r0 = r7
            r1 = r8
            r2 = r10
            int r2 = r2.remaining()
            r3 = 6
            int r2 = r2 / r3
            r3 = r9
            r4 = r10
            long r4 = org.lwjgl.system.MemoryUtil.memAddress(r4)
            nglProgramUniformMatrix2x3fvEXT(r0, r1, r2, r3, r4)
            return
    }

    public static native void nglProgramUniformMatrix3x2fvEXT(int r0, int r1, int r2, boolean r3, long r4);

    public static void glProgramUniformMatrix3x2fvEXT(@org.lwjgl.system.NativeType("GLuint") int r7, @org.lwjgl.system.NativeType("GLint") int r8, @org.lwjgl.system.NativeType("GLboolean") boolean r9, @org.lwjgl.system.NativeType("GLfloat const *") java.nio.FloatBuffer r10) {
            r0 = r7
            r1 = r8
            r2 = r10
            int r2 = r2.remaining()
            r3 = 6
            int r2 = r2 / r3
            r3 = r9
            r4 = r10
            long r4 = org.lwjgl.system.MemoryUtil.memAddress(r4)
            nglProgramUniformMatrix3x2fvEXT(r0, r1, r2, r3, r4)
            return
    }

    public static native void nglProgramUniformMatrix2x4fvEXT(int r0, int r1, int r2, boolean r3, long r4);

    public static void glProgramUniformMatrix2x4fvEXT(@org.lwjgl.system.NativeType("GLuint") int r7, @org.lwjgl.system.NativeType("GLint") int r8, @org.lwjgl.system.NativeType("GLboolean") boolean r9, @org.lwjgl.system.NativeType("GLfloat const *") java.nio.FloatBuffer r10) {
            r0 = r7
            r1 = r8
            r2 = r10
            int r2 = r2.remaining()
            r3 = 3
            int r2 = r2 >> r3
            r3 = r9
            r4 = r10
            long r4 = org.lwjgl.system.MemoryUtil.memAddress(r4)
            nglProgramUniformMatrix2x4fvEXT(r0, r1, r2, r3, r4)
            return
    }

    public static native void nglProgramUniformMatrix4x2fvEXT(int r0, int r1, int r2, boolean r3, long r4);

    public static void glProgramUniformMatrix4x2fvEXT(@org.lwjgl.system.NativeType("GLuint") int r7, @org.lwjgl.system.NativeType("GLint") int r8, @org.lwjgl.system.NativeType("GLboolean") boolean r9, @org.lwjgl.system.NativeType("GLfloat const *") java.nio.FloatBuffer r10) {
            r0 = r7
            r1 = r8
            r2 = r10
            int r2 = r2.remaining()
            r3 = 3
            int r2 = r2 >> r3
            r3 = r9
            r4 = r10
            long r4 = org.lwjgl.system.MemoryUtil.memAddress(r4)
            nglProgramUniformMatrix4x2fvEXT(r0, r1, r2, r3, r4)
            return
    }

    public static native void nglProgramUniformMatrix3x4fvEXT(int r0, int r1, int r2, boolean r3, long r4);

    public static void glProgramUniformMatrix3x4fvEXT(@org.lwjgl.system.NativeType("GLuint") int r7, @org.lwjgl.system.NativeType("GLint") int r8, @org.lwjgl.system.NativeType("GLboolean") boolean r9, @org.lwjgl.system.NativeType("GLfloat const *") java.nio.FloatBuffer r10) {
            r0 = r7
            r1 = r8
            r2 = r10
            int r2 = r2.remaining()
            r3 = 12
            int r2 = r2 / r3
            r3 = r9
            r4 = r10
            long r4 = org.lwjgl.system.MemoryUtil.memAddress(r4)
            nglProgramUniformMatrix3x4fvEXT(r0, r1, r2, r3, r4)
            return
    }

    public static native void nglProgramUniformMatrix4x3fvEXT(int r0, int r1, int r2, boolean r3, long r4);

    public static void glProgramUniformMatrix4x3fvEXT(@org.lwjgl.system.NativeType("GLuint") int r7, @org.lwjgl.system.NativeType("GLint") int r8, @org.lwjgl.system.NativeType("GLboolean") boolean r9, @org.lwjgl.system.NativeType("GLfloat const *") java.nio.FloatBuffer r10) {
            r0 = r7
            r1 = r8
            r2 = r10
            int r2 = r2.remaining()
            r3 = 12
            int r2 = r2 / r3
            r3 = r9
            r4 = r10
            long r4 = org.lwjgl.system.MemoryUtil.memAddress(r4)
            nglProgramUniformMatrix4x3fvEXT(r0, r1, r2, r3, r4)
            return
    }

    public static native void glTextureBufferEXT(@org.lwjgl.system.NativeType("GLuint") int r0, @org.lwjgl.system.NativeType("GLenum") int r1, @org.lwjgl.system.NativeType("GLenum") int r2, @org.lwjgl.system.NativeType("GLuint") int r3);

    public static native void glMultiTexBufferEXT(@org.lwjgl.system.NativeType("GLenum") int r0, @org.lwjgl.system.NativeType("GLenum") int r1, @org.lwjgl.system.NativeType("GLenum") int r2, @org.lwjgl.system.NativeType("GLuint") int r3);

    public static native void nglTextureParameterIivEXT(int r0, int r1, int r2, long r3);

    public static void glTextureParameterIivEXT(@org.lwjgl.system.NativeType("GLuint") int r6, @org.lwjgl.system.NativeType("GLenum") int r7, @org.lwjgl.system.NativeType("GLenum") int r8, @org.lwjgl.system.NativeType("GLint const *") java.nio.IntBuffer r9) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r9
            r1 = 4
            org.lwjgl.system.Checks.check(r0, r1)
        Lb:
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            long r3 = org.lwjgl.system.MemoryUtil.memAddress(r3)
            nglTextureParameterIivEXT(r0, r1, r2, r3)
            return
    }

    public static native void nglTextureParameterIuivEXT(int r0, int r1, int r2, long r3);

    public static void glTextureParameterIuivEXT(@org.lwjgl.system.NativeType("GLuint") int r6, @org.lwjgl.system.NativeType("GLenum") int r7, @org.lwjgl.system.NativeType("GLenum") int r8, @org.lwjgl.system.NativeType("GLuint const *") java.nio.IntBuffer r9) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r9
            r1 = 4
            org.lwjgl.system.Checks.check(r0, r1)
        Lb:
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            long r3 = org.lwjgl.system.MemoryUtil.memAddress(r3)
            nglTextureParameterIuivEXT(r0, r1, r2, r3)
            return
    }

    public static native void nglGetTextureParameterIivEXT(int r0, int r1, int r2, long r3);

    public static void glGetTextureParameterIivEXT(@org.lwjgl.system.NativeType("GLuint") int r6, @org.lwjgl.system.NativeType("GLenum") int r7, @org.lwjgl.system.NativeType("GLenum") int r8, @org.lwjgl.system.NativeType("GLint *") java.nio.IntBuffer r9) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r9
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
        Lb:
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            long r3 = org.lwjgl.system.MemoryUtil.memAddress(r3)
            nglGetTextureParameterIivEXT(r0, r1, r2, r3)
            return
    }

    @org.lwjgl.system.NativeType("void")
    public static int glGetTextureParameterIiEXT(@org.lwjgl.system.NativeType("GLuint") int r6, @org.lwjgl.system.NativeType("GLenum") int r7, @org.lwjgl.system.NativeType("GLenum") int r8) {
            org.lwjgl.system.MemoryStack r0 = org.lwjgl.system.MemoryStack.stackGet()
            r9 = r0
            r0 = r9
            int r0 = r0.getPointer()
            r10 = r0
            r0 = r9
            r1 = 1
            java.nio.IntBuffer r0 = r0.callocInt(r1)     // Catch: java.lang.Throwable -> L2d
            r11 = r0
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r11
            long r3 = org.lwjgl.system.MemoryUtil.memAddress(r3)     // Catch: java.lang.Throwable -> L2d
            nglGetTextureParameterIivEXT(r0, r1, r2, r3)     // Catch: java.lang.Throwable -> L2d
            r0 = r11
            r1 = 0
            int r0 = r0.get(r1)     // Catch: java.lang.Throwable -> L2d
            r12 = r0
            r0 = r9
            r1 = r10
            r0.setPointer(r1)
            r0 = r12
            return r0
        L2d:
            r13 = move-exception
            r0 = r9
            r1 = r10
            r0.setPointer(r1)
            r0 = r13
            throw r0
    }

    public static native void nglGetTextureParameterIuivEXT(int r0, int r1, int r2, long r3);

    public static void glGetTextureParameterIuivEXT(@org.lwjgl.system.NativeType("GLuint") int r6, @org.lwjgl.system.NativeType("GLenum") int r7, @org.lwjgl.system.NativeType("GLenum") int r8, @org.lwjgl.system.NativeType("GLuint *") java.nio.IntBuffer r9) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r9
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
        Lb:
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            long r3 = org.lwjgl.system.MemoryUtil.memAddress(r3)
            nglGetTextureParameterIuivEXT(r0, r1, r2, r3)
            return
    }

    @org.lwjgl.system.NativeType("void")
    public static int glGetTextureParameterIuiEXT(@org.lwjgl.system.NativeType("GLuint") int r6, @org.lwjgl.system.NativeType("GLenum") int r7, @org.lwjgl.system.NativeType("GLenum") int r8) {
            org.lwjgl.system.MemoryStack r0 = org.lwjgl.system.MemoryStack.stackGet()
            r9 = r0
            r0 = r9
            int r0 = r0.getPointer()
            r10 = r0
            r0 = r9
            r1 = 1
            java.nio.IntBuffer r0 = r0.callocInt(r1)     // Catch: java.lang.Throwable -> L2d
            r11 = r0
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r11
            long r3 = org.lwjgl.system.MemoryUtil.memAddress(r3)     // Catch: java.lang.Throwable -> L2d
            nglGetTextureParameterIuivEXT(r0, r1, r2, r3)     // Catch: java.lang.Throwable -> L2d
            r0 = r11
            r1 = 0
            int r0 = r0.get(r1)     // Catch: java.lang.Throwable -> L2d
            r12 = r0
            r0 = r9
            r1 = r10
            r0.setPointer(r1)
            r0 = r12
            return r0
        L2d:
            r13 = move-exception
            r0 = r9
            r1 = r10
            r0.setPointer(r1)
            r0 = r13
            throw r0
    }

    public static native void nglMultiTexParameterIivEXT(int r0, int r1, int r2, long r3);

    public static void glMultiTexParameterIivEXT(@org.lwjgl.system.NativeType("GLenum") int r6, @org.lwjgl.system.NativeType("GLenum") int r7, @org.lwjgl.system.NativeType("GLenum") int r8, @org.lwjgl.system.NativeType("GLint const *") java.nio.IntBuffer r9) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r9
            r1 = 4
            org.lwjgl.system.Checks.check(r0, r1)
        Lb:
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            long r3 = org.lwjgl.system.MemoryUtil.memAddress(r3)
            nglMultiTexParameterIivEXT(r0, r1, r2, r3)
            return
    }

    public static native void nglMultiTexParameterIuivEXT(int r0, int r1, int r2, long r3);

    public static void glMultiTexParameterIuivEXT(@org.lwjgl.system.NativeType("GLenum") int r6, @org.lwjgl.system.NativeType("GLenum") int r7, @org.lwjgl.system.NativeType("GLenum") int r8, @org.lwjgl.system.NativeType("GLuint const *") java.nio.IntBuffer r9) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r9
            r1 = 4
            org.lwjgl.system.Checks.check(r0, r1)
        Lb:
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            long r3 = org.lwjgl.system.MemoryUtil.memAddress(r3)
            nglMultiTexParameterIuivEXT(r0, r1, r2, r3)
            return
    }

    public static native void nglGetMultiTexParameterIivEXT(int r0, int r1, int r2, long r3);

    public static void glGetMultiTexParameterIivEXT(@org.lwjgl.system.NativeType("GLenum") int r6, @org.lwjgl.system.NativeType("GLenum") int r7, @org.lwjgl.system.NativeType("GLenum") int r8, @org.lwjgl.system.NativeType("GLint *") java.nio.IntBuffer r9) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r9
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
        Lb:
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            long r3 = org.lwjgl.system.MemoryUtil.memAddress(r3)
            nglGetMultiTexParameterIivEXT(r0, r1, r2, r3)
            return
    }

    @org.lwjgl.system.NativeType("void")
    public static int glGetMultiTexParameterIiEXT(@org.lwjgl.system.NativeType("GLenum") int r6, @org.lwjgl.system.NativeType("GLenum") int r7, @org.lwjgl.system.NativeType("GLenum") int r8) {
            org.lwjgl.system.MemoryStack r0 = org.lwjgl.system.MemoryStack.stackGet()
            r9 = r0
            r0 = r9
            int r0 = r0.getPointer()
            r10 = r0
            r0 = r9
            r1 = 1
            java.nio.IntBuffer r0 = r0.callocInt(r1)     // Catch: java.lang.Throwable -> L2d
            r11 = r0
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r11
            long r3 = org.lwjgl.system.MemoryUtil.memAddress(r3)     // Catch: java.lang.Throwable -> L2d
            nglGetMultiTexParameterIivEXT(r0, r1, r2, r3)     // Catch: java.lang.Throwable -> L2d
            r0 = r11
            r1 = 0
            int r0 = r0.get(r1)     // Catch: java.lang.Throwable -> L2d
            r12 = r0
            r0 = r9
            r1 = r10
            r0.setPointer(r1)
            r0 = r12
            return r0
        L2d:
            r13 = move-exception
            r0 = r9
            r1 = r10
            r0.setPointer(r1)
            r0 = r13
            throw r0
    }

    public static native void nglGetMultiTexParameterIuivEXT(int r0, int r1, int r2, long r3);

    public static void glGetMultiTexParameterIuivEXT(@org.lwjgl.system.NativeType("GLenum") int r6, @org.lwjgl.system.NativeType("GLenum") int r7, @org.lwjgl.system.NativeType("GLenum") int r8, @org.lwjgl.system.NativeType("GLuint *") java.nio.IntBuffer r9) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r9
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
        Lb:
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            long r3 = org.lwjgl.system.MemoryUtil.memAddress(r3)
            nglGetMultiTexParameterIuivEXT(r0, r1, r2, r3)
            return
    }

    @org.lwjgl.system.NativeType("void")
    public static int glGetMultiTexParameterIuiEXT(@org.lwjgl.system.NativeType("GLenum") int r6, @org.lwjgl.system.NativeType("GLenum") int r7, @org.lwjgl.system.NativeType("GLenum") int r8) {
            org.lwjgl.system.MemoryStack r0 = org.lwjgl.system.MemoryStack.stackGet()
            r9 = r0
            r0 = r9
            int r0 = r0.getPointer()
            r10 = r0
            r0 = r9
            r1 = 1
            java.nio.IntBuffer r0 = r0.callocInt(r1)     // Catch: java.lang.Throwable -> L2d
            r11 = r0
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r11
            long r3 = org.lwjgl.system.MemoryUtil.memAddress(r3)     // Catch: java.lang.Throwable -> L2d
            nglGetMultiTexParameterIuivEXT(r0, r1, r2, r3)     // Catch: java.lang.Throwable -> L2d
            r0 = r11
            r1 = 0
            int r0 = r0.get(r1)     // Catch: java.lang.Throwable -> L2d
            r12 = r0
            r0 = r9
            r1 = r10
            r0.setPointer(r1)
            r0 = r12
            return r0
        L2d:
            r13 = move-exception
            r0 = r9
            r1 = r10
            r0.setPointer(r1)
            r0 = r13
            throw r0
    }

    public static native void glProgramUniform1uiEXT(@org.lwjgl.system.NativeType("GLuint") int r0, @org.lwjgl.system.NativeType("GLint") int r1, @org.lwjgl.system.NativeType("GLuint") int r2);

    public static native void glProgramUniform2uiEXT(@org.lwjgl.system.NativeType("GLuint") int r0, @org.lwjgl.system.NativeType("GLint") int r1, @org.lwjgl.system.NativeType("GLuint") int r2, @org.lwjgl.system.NativeType("GLuint") int r3);

    public static native void glProgramUniform3uiEXT(@org.lwjgl.system.NativeType("GLuint") int r0, @org.lwjgl.system.NativeType("GLint") int r1, @org.lwjgl.system.NativeType("GLuint") int r2, @org.lwjgl.system.NativeType("GLuint") int r3, @org.lwjgl.system.NativeType("GLuint") int r4);

    public static native void glProgramUniform4uiEXT(@org.lwjgl.system.NativeType("GLuint") int r0, @org.lwjgl.system.NativeType("GLint") int r1, @org.lwjgl.system.NativeType("GLuint") int r2, @org.lwjgl.system.NativeType("GLuint") int r3, @org.lwjgl.system.NativeType("GLuint") int r4, @org.lwjgl.system.NativeType("GLuint") int r5);

    public static native void nglProgramUniform1uivEXT(int r0, int r1, int r2, long r3);

    public static void glProgramUniform1uivEXT(@org.lwjgl.system.NativeType("GLuint") int r6, @org.lwjgl.system.NativeType("GLint") int r7, @org.lwjgl.system.NativeType("GLuint const *") java.nio.IntBuffer r8) {
            r0 = r6
            r1 = r7
            r2 = r8
            int r2 = r2.remaining()
            r3 = r8
            long r3 = org.lwjgl.system.MemoryUtil.memAddress(r3)
            nglProgramUniform1uivEXT(r0, r1, r2, r3)
            return
    }

    public static native void nglProgramUniform2uivEXT(int r0, int r1, int r2, long r3);

    public static void glProgramUniform2uivEXT(@org.lwjgl.system.NativeType("GLuint") int r6, @org.lwjgl.system.NativeType("GLint") int r7, @org.lwjgl.system.NativeType("GLuint const *") java.nio.IntBuffer r8) {
            r0 = r6
            r1 = r7
            r2 = r8
            int r2 = r2.remaining()
            r3 = 1
            int r2 = r2 >> r3
            r3 = r8
            long r3 = org.lwjgl.system.MemoryUtil.memAddress(r3)
            nglProgramUniform2uivEXT(r0, r1, r2, r3)
            return
    }

    public static native void nglProgramUniform3uivEXT(int r0, int r1, int r2, long r3);

    public static void glProgramUniform3uivEXT(@org.lwjgl.system.NativeType("GLuint") int r6, @org.lwjgl.system.NativeType("GLint") int r7, @org.lwjgl.system.NativeType("GLuint const *") java.nio.IntBuffer r8) {
            r0 = r6
            r1 = r7
            r2 = r8
            int r2 = r2.remaining()
            r3 = 3
            int r2 = r2 / r3
            r3 = r8
            long r3 = org.lwjgl.system.MemoryUtil.memAddress(r3)
            nglProgramUniform3uivEXT(r0, r1, r2, r3)
            return
    }

    public static native void nglProgramUniform4uivEXT(int r0, int r1, int r2, long r3);

    public static void glProgramUniform4uivEXT(@org.lwjgl.system.NativeType("GLuint") int r6, @org.lwjgl.system.NativeType("GLint") int r7, @org.lwjgl.system.NativeType("GLuint const *") java.nio.IntBuffer r8) {
            r0 = r6
            r1 = r7
            r2 = r8
            int r2 = r2.remaining()
            r3 = 2
            int r2 = r2 >> r3
            r3 = r8
            long r3 = org.lwjgl.system.MemoryUtil.memAddress(r3)
            nglProgramUniform4uivEXT(r0, r1, r2, r3)
            return
    }

    public static native void nglNamedProgramLocalParameters4fvEXT(int r0, int r1, int r2, int r3, long r4);

    public static void glNamedProgramLocalParameters4fvEXT(@org.lwjgl.system.NativeType("GLuint") int r7, @org.lwjgl.system.NativeType("GLenum") int r8, @org.lwjgl.system.NativeType("GLuint") int r9, @org.lwjgl.system.NativeType("GLfloat const *") java.nio.FloatBuffer r10) {
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = r10
            int r3 = r3.remaining()
            r4 = 2
            int r3 = r3 >> r4
            r4 = r10
            long r4 = org.lwjgl.system.MemoryUtil.memAddress(r4)
            nglNamedProgramLocalParameters4fvEXT(r0, r1, r2, r3, r4)
            return
    }

    public static native void glNamedProgramLocalParameterI4iEXT(@org.lwjgl.system.NativeType("GLuint") int r0, @org.lwjgl.system.NativeType("GLenum") int r1, @org.lwjgl.system.NativeType("GLuint") int r2, @org.lwjgl.system.NativeType("GLint") int r3, @org.lwjgl.system.NativeType("GLint") int r4, @org.lwjgl.system.NativeType("GLint") int r5, @org.lwjgl.system.NativeType("GLint") int r6);

    public static native void nglNamedProgramLocalParameterI4ivEXT(int r0, int r1, int r2, long r3);

    public static void glNamedProgramLocalParameterI4ivEXT(@org.lwjgl.system.NativeType("GLuint") int r6, @org.lwjgl.system.NativeType("GLenum") int r7, @org.lwjgl.system.NativeType("GLuint") int r8, @org.lwjgl.system.NativeType("GLint const *") java.nio.IntBuffer r9) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r9
            r1 = 4
            org.lwjgl.system.Checks.check(r0, r1)
        Lb:
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            long r3 = org.lwjgl.system.MemoryUtil.memAddress(r3)
            nglNamedProgramLocalParameterI4ivEXT(r0, r1, r2, r3)
            return
    }

    public static native void nglNamedProgramLocalParametersI4ivEXT(int r0, int r1, int r2, int r3, long r4);

    public static void glNamedProgramLocalParametersI4ivEXT(@org.lwjgl.system.NativeType("GLuint") int r7, @org.lwjgl.system.NativeType("GLenum") int r8, @org.lwjgl.system.NativeType("GLuint") int r9, @org.lwjgl.system.NativeType("GLint const *") java.nio.IntBuffer r10) {
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = r10
            int r3 = r3.remaining()
            r4 = 2
            int r3 = r3 >> r4
            r4 = r10
            long r4 = org.lwjgl.system.MemoryUtil.memAddress(r4)
            nglNamedProgramLocalParametersI4ivEXT(r0, r1, r2, r3, r4)
            return
    }

    public static native void glNamedProgramLocalParameterI4uiEXT(@org.lwjgl.system.NativeType("GLuint") int r0, @org.lwjgl.system.NativeType("GLenum") int r1, @org.lwjgl.system.NativeType("GLuint") int r2, @org.lwjgl.system.NativeType("GLuint") int r3, @org.lwjgl.system.NativeType("GLuint") int r4, @org.lwjgl.system.NativeType("GLuint") int r5, @org.lwjgl.system.NativeType("GLuint") int r6);

    public static native void nglNamedProgramLocalParameterI4uivEXT(int r0, int r1, int r2, long r3);

    public static void glNamedProgramLocalParameterI4uivEXT(@org.lwjgl.system.NativeType("GLuint") int r6, @org.lwjgl.system.NativeType("GLenum") int r7, @org.lwjgl.system.NativeType("GLuint") int r8, @org.lwjgl.system.NativeType("GLuint const *") java.nio.IntBuffer r9) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r9
            r1 = 4
            org.lwjgl.system.Checks.check(r0, r1)
        Lb:
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            long r3 = org.lwjgl.system.MemoryUtil.memAddress(r3)
            nglNamedProgramLocalParameterI4uivEXT(r0, r1, r2, r3)
            return
    }

    public static native void nglNamedProgramLocalParametersI4uivEXT(int r0, int r1, int r2, int r3, long r4);

    public static void glNamedProgramLocalParametersI4uivEXT(@org.lwjgl.system.NativeType("GLuint") int r7, @org.lwjgl.system.NativeType("GLenum") int r8, @org.lwjgl.system.NativeType("GLuint") int r9, @org.lwjgl.system.NativeType("GLuint const *") java.nio.IntBuffer r10) {
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = r10
            int r3 = r3.remaining()
            r4 = 2
            int r3 = r3 >> r4
            r4 = r10
            long r4 = org.lwjgl.system.MemoryUtil.memAddress(r4)
            nglNamedProgramLocalParametersI4uivEXT(r0, r1, r2, r3, r4)
            return
    }

    public static native void nglGetNamedProgramLocalParameterIivEXT(int r0, int r1, int r2, long r3);

    public static void glGetNamedProgramLocalParameterIivEXT(@org.lwjgl.system.NativeType("GLuint") int r6, @org.lwjgl.system.NativeType("GLenum") int r7, @org.lwjgl.system.NativeType("GLuint") int r8, @org.lwjgl.system.NativeType("GLint *") java.nio.IntBuffer r9) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r9
            r1 = 4
            org.lwjgl.system.Checks.check(r0, r1)
        Lb:
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            long r3 = org.lwjgl.system.MemoryUtil.memAddress(r3)
            nglGetNamedProgramLocalParameterIivEXT(r0, r1, r2, r3)
            return
    }

    public static native void nglGetNamedProgramLocalParameterIuivEXT(int r0, int r1, int r2, long r3);

    public static void glGetNamedProgramLocalParameterIuivEXT(@org.lwjgl.system.NativeType("GLuint") int r6, @org.lwjgl.system.NativeType("GLenum") int r7, @org.lwjgl.system.NativeType("GLuint") int r8, @org.lwjgl.system.NativeType("GLuint *") java.nio.IntBuffer r9) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r9
            r1 = 4
            org.lwjgl.system.Checks.check(r0, r1)
        Lb:
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            long r3 = org.lwjgl.system.MemoryUtil.memAddress(r3)
            nglGetNamedProgramLocalParameterIuivEXT(r0, r1, r2, r3)
            return
    }

    public static native void glNamedRenderbufferStorageEXT(@org.lwjgl.system.NativeType("GLuint") int r0, @org.lwjgl.system.NativeType("GLenum") int r1, @org.lwjgl.system.NativeType("GLsizei") int r2, @org.lwjgl.system.NativeType("GLsizei") int r3);

    public static native void nglGetNamedRenderbufferParameterivEXT(int r0, int r1, long r2);

    public static void glGetNamedRenderbufferParameterivEXT(@org.lwjgl.system.NativeType("GLuint") int r5, @org.lwjgl.system.NativeType("GLenum") int r6, @org.lwjgl.system.NativeType("GLint *") java.nio.IntBuffer r7) {
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
            nglGetNamedRenderbufferParameterivEXT(r0, r1, r2)
            return
    }

    @org.lwjgl.system.NativeType("void")
    public static int glGetNamedRenderbufferParameteriEXT(@org.lwjgl.system.NativeType("GLuint") int r5, @org.lwjgl.system.NativeType("GLenum") int r6) {
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
            nglGetNamedRenderbufferParameterivEXT(r0, r1, r2)     // Catch: java.lang.Throwable -> L2a
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

    public static native void glNamedRenderbufferStorageMultisampleEXT(@org.lwjgl.system.NativeType("GLuint") int r0, @org.lwjgl.system.NativeType("GLsizei") int r1, @org.lwjgl.system.NativeType("GLenum") int r2, @org.lwjgl.system.NativeType("GLsizei") int r3, @org.lwjgl.system.NativeType("GLsizei") int r4);

    public static native void glNamedRenderbufferStorageMultisampleCoverageEXT(@org.lwjgl.system.NativeType("GLuint") int r0, @org.lwjgl.system.NativeType("GLsizei") int r1, @org.lwjgl.system.NativeType("GLsizei") int r2, @org.lwjgl.system.NativeType("GLenum") int r3, @org.lwjgl.system.NativeType("GLsizei") int r4, @org.lwjgl.system.NativeType("GLsizei") int r5);

    @org.lwjgl.system.NativeType("GLenum")
    public static native int glCheckNamedFramebufferStatusEXT(@org.lwjgl.system.NativeType("GLuint") int r0, @org.lwjgl.system.NativeType("GLenum") int r1);

    public static native void glNamedFramebufferTexture1DEXT(@org.lwjgl.system.NativeType("GLuint") int r0, @org.lwjgl.system.NativeType("GLenum") int r1, @org.lwjgl.system.NativeType("GLenum") int r2, @org.lwjgl.system.NativeType("GLuint") int r3, @org.lwjgl.system.NativeType("GLint") int r4);

    public static native void glNamedFramebufferTexture2DEXT(@org.lwjgl.system.NativeType("GLuint") int r0, @org.lwjgl.system.NativeType("GLenum") int r1, @org.lwjgl.system.NativeType("GLenum") int r2, @org.lwjgl.system.NativeType("GLuint") int r3, @org.lwjgl.system.NativeType("GLint") int r4);

    public static native void glNamedFramebufferTexture3DEXT(@org.lwjgl.system.NativeType("GLuint") int r0, @org.lwjgl.system.NativeType("GLenum") int r1, @org.lwjgl.system.NativeType("GLenum") int r2, @org.lwjgl.system.NativeType("GLuint") int r3, @org.lwjgl.system.NativeType("GLint") int r4, @org.lwjgl.system.NativeType("GLint") int r5);

    public static native void glNamedFramebufferRenderbufferEXT(@org.lwjgl.system.NativeType("GLuint") int r0, @org.lwjgl.system.NativeType("GLenum") int r1, @org.lwjgl.system.NativeType("GLenum") int r2, @org.lwjgl.system.NativeType("GLuint") int r3);

    public static native void nglGetNamedFramebufferAttachmentParameterivEXT(int r0, int r1, int r2, long r3);

    public static void glGetNamedFramebufferAttachmentParameterivEXT(@org.lwjgl.system.NativeType("GLuint") int r6, @org.lwjgl.system.NativeType("GLenum") int r7, @org.lwjgl.system.NativeType("GLenum") int r8, @org.lwjgl.system.NativeType("GLint *") java.nio.IntBuffer r9) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r9
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
        Lb:
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            long r3 = org.lwjgl.system.MemoryUtil.memAddress(r3)
            nglGetNamedFramebufferAttachmentParameterivEXT(r0, r1, r2, r3)
            return
    }

    @org.lwjgl.system.NativeType("void")
    public static int glGetNamedFramebufferAttachmentParameteriEXT(@org.lwjgl.system.NativeType("GLuint") int r6, @org.lwjgl.system.NativeType("GLenum") int r7, @org.lwjgl.system.NativeType("GLenum") int r8) {
            org.lwjgl.system.MemoryStack r0 = org.lwjgl.system.MemoryStack.stackGet()
            r9 = r0
            r0 = r9
            int r0 = r0.getPointer()
            r10 = r0
            r0 = r9
            r1 = 1
            java.nio.IntBuffer r0 = r0.callocInt(r1)     // Catch: java.lang.Throwable -> L2d
            r11 = r0
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r11
            long r3 = org.lwjgl.system.MemoryUtil.memAddress(r3)     // Catch: java.lang.Throwable -> L2d
            nglGetNamedFramebufferAttachmentParameterivEXT(r0, r1, r2, r3)     // Catch: java.lang.Throwable -> L2d
            r0 = r11
            r1 = 0
            int r0 = r0.get(r1)     // Catch: java.lang.Throwable -> L2d
            r12 = r0
            r0 = r9
            r1 = r10
            r0.setPointer(r1)
            r0 = r12
            return r0
        L2d:
            r13 = move-exception
            r0 = r9
            r1 = r10
            r0.setPointer(r1)
            r0 = r13
            throw r0
    }

    public static native void glGenerateTextureMipmapEXT(@org.lwjgl.system.NativeType("GLuint") int r0, @org.lwjgl.system.NativeType("GLenum") int r1);

    public static native void glGenerateMultiTexMipmapEXT(@org.lwjgl.system.NativeType("GLenum") int r0, @org.lwjgl.system.NativeType("GLenum") int r1);

    public static native void glFramebufferDrawBufferEXT(@org.lwjgl.system.NativeType("GLuint") int r0, @org.lwjgl.system.NativeType("GLenum") int r1);

    public static native void nglFramebufferDrawBuffersEXT(int r0, int r1, long r2);

    public static void glFramebufferDrawBuffersEXT(@org.lwjgl.system.NativeType("GLuint") int r5, @org.lwjgl.system.NativeType("GLenum const *") java.nio.IntBuffer r6) {
            r0 = r5
            r1 = r6
            int r1 = r1.remaining()
            r2 = r6
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            nglFramebufferDrawBuffersEXT(r0, r1, r2)
            return
    }

    public static native void glFramebufferReadBufferEXT(@org.lwjgl.system.NativeType("GLuint") int r0, @org.lwjgl.system.NativeType("GLenum") int r1);

    public static native void nglGetFramebufferParameterivEXT(int r0, int r1, long r2);

    public static void glGetFramebufferParameterivEXT(@org.lwjgl.system.NativeType("GLuint") int r5, @org.lwjgl.system.NativeType("GLenum") int r6, @org.lwjgl.system.NativeType("GLint *") java.nio.IntBuffer r7) {
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
            nglGetFramebufferParameterivEXT(r0, r1, r2)
            return
    }

    @org.lwjgl.system.NativeType("void")
    public static int glGetFramebufferParameteriEXT(@org.lwjgl.system.NativeType("GLuint") int r5, @org.lwjgl.system.NativeType("GLenum") int r6) {
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
            nglGetFramebufferParameterivEXT(r0, r1, r2)     // Catch: java.lang.Throwable -> L2a
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

    public static native void glNamedCopyBufferSubDataEXT(@org.lwjgl.system.NativeType("GLuint") int r0, @org.lwjgl.system.NativeType("GLuint") int r1, @org.lwjgl.system.NativeType("GLintptr") long r2, @org.lwjgl.system.NativeType("GLintptr") long r4, @org.lwjgl.system.NativeType("GLsizeiptr") long r6);

    public static native void glNamedFramebufferTextureEXT(@org.lwjgl.system.NativeType("GLuint") int r0, @org.lwjgl.system.NativeType("GLenum") int r1, @org.lwjgl.system.NativeType("GLuint") int r2, @org.lwjgl.system.NativeType("GLint") int r3);

    public static native void glNamedFramebufferTextureLayerEXT(@org.lwjgl.system.NativeType("GLuint") int r0, @org.lwjgl.system.NativeType("GLenum") int r1, @org.lwjgl.system.NativeType("GLuint") int r2, @org.lwjgl.system.NativeType("GLint") int r3, @org.lwjgl.system.NativeType("GLint") int r4);

    public static native void glNamedFramebufferTextureFaceEXT(@org.lwjgl.system.NativeType("GLuint") int r0, @org.lwjgl.system.NativeType("GLenum") int r1, @org.lwjgl.system.NativeType("GLuint") int r2, @org.lwjgl.system.NativeType("GLint") int r3, @org.lwjgl.system.NativeType("GLenum") int r4);

    public static native void glTextureRenderbufferEXT(@org.lwjgl.system.NativeType("GLuint") int r0, @org.lwjgl.system.NativeType("GLenum") int r1, @org.lwjgl.system.NativeType("GLuint") int r2);

    public static native void glMultiTexRenderbufferEXT(@org.lwjgl.system.NativeType("GLenum") int r0, @org.lwjgl.system.NativeType("GLenum") int r1, @org.lwjgl.system.NativeType("GLuint") int r2);

    public static native void glVertexArrayVertexOffsetEXT(@org.lwjgl.system.NativeType("GLuint") int r0, @org.lwjgl.system.NativeType("GLuint") int r1, @org.lwjgl.system.NativeType("GLint") int r2, @org.lwjgl.system.NativeType("GLenum") int r3, @org.lwjgl.system.NativeType("GLsizei") int r4, @org.lwjgl.system.NativeType("GLintptr") long r5);

    public static native void glVertexArrayColorOffsetEXT(@org.lwjgl.system.NativeType("GLuint") int r0, @org.lwjgl.system.NativeType("GLuint") int r1, @org.lwjgl.system.NativeType("GLint") int r2, @org.lwjgl.system.NativeType("GLenum") int r3, @org.lwjgl.system.NativeType("GLsizei") int r4, @org.lwjgl.system.NativeType("GLintptr") long r5);

    public static native void glVertexArrayEdgeFlagOffsetEXT(@org.lwjgl.system.NativeType("GLuint") int r0, @org.lwjgl.system.NativeType("GLuint") int r1, @org.lwjgl.system.NativeType("GLsizei") int r2, @org.lwjgl.system.NativeType("GLintptr") long r3);

    public static native void glVertexArrayIndexOffsetEXT(@org.lwjgl.system.NativeType("GLuint") int r0, @org.lwjgl.system.NativeType("GLuint") int r1, @org.lwjgl.system.NativeType("GLenum") int r2, @org.lwjgl.system.NativeType("GLsizei") int r3, @org.lwjgl.system.NativeType("GLintptr") long r4);

    public static native void glVertexArrayNormalOffsetEXT(@org.lwjgl.system.NativeType("GLuint") int r0, @org.lwjgl.system.NativeType("GLuint") int r1, @org.lwjgl.system.NativeType("GLenum") int r2, @org.lwjgl.system.NativeType("GLsizei") int r3, @org.lwjgl.system.NativeType("GLintptr") long r4);

    public static native void glVertexArrayTexCoordOffsetEXT(@org.lwjgl.system.NativeType("GLuint") int r0, @org.lwjgl.system.NativeType("GLuint") int r1, @org.lwjgl.system.NativeType("GLint") int r2, @org.lwjgl.system.NativeType("GLenum") int r3, @org.lwjgl.system.NativeType("GLsizei") int r4, @org.lwjgl.system.NativeType("GLintptr") long r5);

    public static native void glVertexArrayMultiTexCoordOffsetEXT(@org.lwjgl.system.NativeType("GLuint") int r0, @org.lwjgl.system.NativeType("GLuint") int r1, @org.lwjgl.system.NativeType("GLenum") int r2, @org.lwjgl.system.NativeType("GLint") int r3, @org.lwjgl.system.NativeType("GLenum") int r4, @org.lwjgl.system.NativeType("GLsizei") int r5, @org.lwjgl.system.NativeType("GLintptr") long r6);

    public static native void glVertexArrayFogCoordOffsetEXT(@org.lwjgl.system.NativeType("GLuint") int r0, @org.lwjgl.system.NativeType("GLuint") int r1, @org.lwjgl.system.NativeType("GLenum") int r2, @org.lwjgl.system.NativeType("GLsizei") int r3, @org.lwjgl.system.NativeType("GLintptr") long r4);

    public static native void glVertexArraySecondaryColorOffsetEXT(@org.lwjgl.system.NativeType("GLuint") int r0, @org.lwjgl.system.NativeType("GLuint") int r1, @org.lwjgl.system.NativeType("GLint") int r2, @org.lwjgl.system.NativeType("GLenum") int r3, @org.lwjgl.system.NativeType("GLsizei") int r4, @org.lwjgl.system.NativeType("GLintptr") long r5);

    public static native void glVertexArrayVertexAttribOffsetEXT(@org.lwjgl.system.NativeType("GLuint") int r0, @org.lwjgl.system.NativeType("GLuint") int r1, @org.lwjgl.system.NativeType("GLuint") int r2, @org.lwjgl.system.NativeType("GLint") int r3, @org.lwjgl.system.NativeType("GLenum") int r4, @org.lwjgl.system.NativeType("GLboolean") boolean r5, @org.lwjgl.system.NativeType("GLsizei") int r6, @org.lwjgl.system.NativeType("GLintptr") long r7);

    public static native void glVertexArrayVertexAttribIOffsetEXT(@org.lwjgl.system.NativeType("GLuint") int r0, @org.lwjgl.system.NativeType("GLuint") int r1, @org.lwjgl.system.NativeType("GLuint") int r2, @org.lwjgl.system.NativeType("GLint") int r3, @org.lwjgl.system.NativeType("GLenum") int r4, @org.lwjgl.system.NativeType("GLsizei") int r5, @org.lwjgl.system.NativeType("GLintptr") long r6);

    public static native void glEnableVertexArrayEXT(@org.lwjgl.system.NativeType("GLuint") int r0, @org.lwjgl.system.NativeType("GLenum") int r1);

    public static native void glDisableVertexArrayEXT(@org.lwjgl.system.NativeType("GLuint") int r0, @org.lwjgl.system.NativeType("GLenum") int r1);

    public static native void glEnableVertexArrayAttribEXT(@org.lwjgl.system.NativeType("GLuint") int r0, @org.lwjgl.system.NativeType("GLuint") int r1);

    public static native void glDisableVertexArrayAttribEXT(@org.lwjgl.system.NativeType("GLuint") int r0, @org.lwjgl.system.NativeType("GLuint") int r1);

    public static native void nglGetVertexArrayIntegervEXT(int r0, int r1, long r2);

    public static void glGetVertexArrayIntegervEXT(@org.lwjgl.system.NativeType("GLuint") int r5, @org.lwjgl.system.NativeType("GLenum") int r6, @org.lwjgl.system.NativeType("GLint *") java.nio.IntBuffer r7) {
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
            nglGetVertexArrayIntegervEXT(r0, r1, r2)
            return
    }

    @org.lwjgl.system.NativeType("void")
    public static int glGetVertexArrayIntegerEXT(@org.lwjgl.system.NativeType("GLuint") int r5, @org.lwjgl.system.NativeType("GLenum") int r6) {
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
            nglGetVertexArrayIntegervEXT(r0, r1, r2)     // Catch: java.lang.Throwable -> L2a
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

    public static native void nglGetVertexArrayPointervEXT(int r0, int r1, long r2);

    public static void glGetVertexArrayPointervEXT(@org.lwjgl.system.NativeType("GLuint") int r5, @org.lwjgl.system.NativeType("GLenum") int r6, @org.lwjgl.system.NativeType("void **") org.lwjgl.PointerBuffer r7) {
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
            nglGetVertexArrayPointervEXT(r0, r1, r2)
            return
    }

    @org.lwjgl.system.NativeType("void")
    public static long glGetVertexArrayPointerEXT(@org.lwjgl.system.NativeType("GLuint") int r5, @org.lwjgl.system.NativeType("GLenum") int r6) {
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
            nglGetVertexArrayPointervEXT(r0, r1, r2)     // Catch: java.lang.Throwable -> L2a
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

    public static native void nglGetVertexArrayIntegeri_vEXT(int r0, int r1, int r2, long r3);

    public static void glGetVertexArrayIntegeri_vEXT(@org.lwjgl.system.NativeType("GLuint") int r6, @org.lwjgl.system.NativeType("GLuint") int r7, @org.lwjgl.system.NativeType("GLenum") int r8, @org.lwjgl.system.NativeType("GLint *") java.nio.IntBuffer r9) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r9
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
        Lb:
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            long r3 = org.lwjgl.system.MemoryUtil.memAddress(r3)
            nglGetVertexArrayIntegeri_vEXT(r0, r1, r2, r3)
            return
    }

    @org.lwjgl.system.NativeType("void")
    public static int glGetVertexArrayIntegeriEXT(@org.lwjgl.system.NativeType("GLuint") int r6, @org.lwjgl.system.NativeType("GLuint") int r7, @org.lwjgl.system.NativeType("GLenum") int r8) {
            org.lwjgl.system.MemoryStack r0 = org.lwjgl.system.MemoryStack.stackGet()
            r9 = r0
            r0 = r9
            int r0 = r0.getPointer()
            r10 = r0
            r0 = r9
            r1 = 1
            java.nio.IntBuffer r0 = r0.callocInt(r1)     // Catch: java.lang.Throwable -> L2d
            r11 = r0
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r11
            long r3 = org.lwjgl.system.MemoryUtil.memAddress(r3)     // Catch: java.lang.Throwable -> L2d
            nglGetVertexArrayIntegeri_vEXT(r0, r1, r2, r3)     // Catch: java.lang.Throwable -> L2d
            r0 = r11
            r1 = 0
            int r0 = r0.get(r1)     // Catch: java.lang.Throwable -> L2d
            r12 = r0
            r0 = r9
            r1 = r10
            r0.setPointer(r1)
            r0 = r12
            return r0
        L2d:
            r13 = move-exception
            r0 = r9
            r1 = r10
            r0.setPointer(r1)
            r0 = r13
            throw r0
    }

    public static native void nglGetVertexArrayPointeri_vEXT(int r0, int r1, int r2, long r3);

    public static void glGetVertexArrayPointeri_vEXT(@org.lwjgl.system.NativeType("GLuint") int r6, @org.lwjgl.system.NativeType("GLuint") int r7, @org.lwjgl.system.NativeType("GLenum") int r8, @org.lwjgl.system.NativeType("void **") org.lwjgl.PointerBuffer r9) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r9
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
        Lb:
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            long r3 = org.lwjgl.system.MemoryUtil.memAddress(r3)
            nglGetVertexArrayPointeri_vEXT(r0, r1, r2, r3)
            return
    }

    @org.lwjgl.system.NativeType("void")
    public static long glGetVertexArrayPointeriEXT(@org.lwjgl.system.NativeType("GLuint") int r6, @org.lwjgl.system.NativeType("GLuint") int r7, @org.lwjgl.system.NativeType("GLenum") int r8) {
            org.lwjgl.system.MemoryStack r0 = org.lwjgl.system.MemoryStack.stackGet()
            r9 = r0
            r0 = r9
            int r0 = r0.getPointer()
            r10 = r0
            r0 = r9
            r1 = 1
            org.lwjgl.PointerBuffer r0 = r0.callocPointer(r1)     // Catch: java.lang.Throwable -> L2d
            r11 = r0
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r11
            long r3 = org.lwjgl.system.MemoryUtil.memAddress(r3)     // Catch: java.lang.Throwable -> L2d
            nglGetVertexArrayPointeri_vEXT(r0, r1, r2, r3)     // Catch: java.lang.Throwable -> L2d
            r0 = r11
            r1 = 0
            long r0 = r0.get(r1)     // Catch: java.lang.Throwable -> L2d
            r12 = r0
            r0 = r9
            r1 = r10
            r0.setPointer(r1)
            r0 = r12
            return r0
        L2d:
            r14 = move-exception
            r0 = r9
            r1 = r10
            r0.setPointer(r1)
            r0 = r14
            throw r0
    }

    public static native long nglMapNamedBufferRangeEXT(int r0, long r1, long r3, int r5);

    @javax.annotation.Nullable
    @org.lwjgl.system.NativeType("void *")
    public static java.nio.ByteBuffer glMapNamedBufferRangeEXT(@org.lwjgl.system.NativeType("GLuint") int r7, @org.lwjgl.system.NativeType("GLintptr") long r8, @org.lwjgl.system.NativeType("GLsizeiptr") long r10, @org.lwjgl.system.NativeType("GLbitfield") int r12) {
            r0 = r7
            r1 = r8
            r2 = r10
            r3 = r12
            long r0 = nglMapNamedBufferRangeEXT(r0, r1, r2, r3)
            r13 = r0
            r0 = r13
            r1 = r10
            int r1 = (int) r1
            java.nio.ByteBuffer r0 = org.lwjgl.system.MemoryUtil.memByteBufferSafe(r0, r1)
            return r0
    }

    @javax.annotation.Nullable
    @org.lwjgl.system.NativeType("void *")
    public static java.nio.ByteBuffer glMapNamedBufferRangeEXT(@org.lwjgl.system.NativeType("GLuint") int r7, @org.lwjgl.system.NativeType("GLintptr") long r8, @org.lwjgl.system.NativeType("GLsizeiptr") long r10, @org.lwjgl.system.NativeType("GLbitfield") int r12, @javax.annotation.Nullable java.nio.ByteBuffer r13) {
            r0 = r7
            r1 = r8
            r2 = r10
            r3 = r12
            long r0 = nglMapNamedBufferRangeEXT(r0, r1, r2, r3)
            r14 = r0
            r0 = r13
            r1 = r14
            r2 = r10
            int r2 = (int) r2
            java.nio.ByteBuffer r0 = org.lwjgl.system.APIUtil.apiGetMappedBuffer(r0, r1, r2)
            return r0
    }

    public static native void glFlushMappedNamedBufferRangeEXT(@org.lwjgl.system.NativeType("GLuint") int r0, @org.lwjgl.system.NativeType("GLintptr") long r1, @org.lwjgl.system.NativeType("GLsizeiptr") long r3);

    public static void glMatrixLoadfEXT(@org.lwjgl.system.NativeType("GLenum") int r5, @org.lwjgl.system.NativeType("GLfloat const *") float[] r6) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glMatrixLoadfEXT
            r7 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L18
            r0 = r7
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r6
            r1 = 16
            org.lwjgl.system.Checks.check(r0, r1)
        L18:
            r0 = r5
            r1 = r6
            r2 = r7
            org.lwjgl.system.JNI.callPV(r0, r1, r2)
            return
    }

    public static void glMatrixLoaddEXT(@org.lwjgl.system.NativeType("GLenum") int r5, @org.lwjgl.system.NativeType("GLdouble const *") double[] r6) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glMatrixLoaddEXT
            r7 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L18
            r0 = r7
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r6
            r1 = 16
            org.lwjgl.system.Checks.check(r0, r1)
        L18:
            r0 = r5
            r1 = r6
            r2 = r7
            org.lwjgl.system.JNI.callPV(r0, r1, r2)
            return
    }

    public static void glMatrixMultfEXT(@org.lwjgl.system.NativeType("GLenum") int r5, @org.lwjgl.system.NativeType("GLfloat const *") float[] r6) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glMatrixMultfEXT
            r7 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L18
            r0 = r7
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r6
            r1 = 16
            org.lwjgl.system.Checks.check(r0, r1)
        L18:
            r0 = r5
            r1 = r6
            r2 = r7
            org.lwjgl.system.JNI.callPV(r0, r1, r2)
            return
    }

    public static void glMatrixMultdEXT(@org.lwjgl.system.NativeType("GLenum") int r5, @org.lwjgl.system.NativeType("GLdouble const *") double[] r6) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glMatrixMultdEXT
            r7 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L18
            r0 = r7
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r6
            r1 = 16
            org.lwjgl.system.Checks.check(r0, r1)
        L18:
            r0 = r5
            r1 = r6
            r2 = r7
            org.lwjgl.system.JNI.callPV(r0, r1, r2)
            return
    }

    public static void glTextureParameterivEXT(@org.lwjgl.system.NativeType("GLuint") int r7, @org.lwjgl.system.NativeType("GLenum") int r8, @org.lwjgl.system.NativeType("GLenum") int r9, @org.lwjgl.system.NativeType("GLint const *") int[] r10) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glTextureParameterivEXT
            r11 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L19
            r0 = r11
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r10
            r1 = 4
            org.lwjgl.system.Checks.check(r0, r1)
        L19:
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            org.lwjgl.system.JNI.callPV(r0, r1, r2, r3, r4)
            return
    }

    public static void glTextureParameterfvEXT(@org.lwjgl.system.NativeType("GLuint") int r7, @org.lwjgl.system.NativeType("GLenum") int r8, @org.lwjgl.system.NativeType("GLenum") int r9, @org.lwjgl.system.NativeType("GLfloat const *") float[] r10) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glTextureParameterfvEXT
            r11 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L19
            r0 = r11
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r10
            r1 = 4
            org.lwjgl.system.Checks.check(r0, r1)
        L19:
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            org.lwjgl.system.JNI.callPV(r0, r1, r2, r3, r4)
            return
    }

    public static void glTextureImage1DEXT(@org.lwjgl.system.NativeType("GLuint") int r12, @org.lwjgl.system.NativeType("GLenum") int r13, @org.lwjgl.system.NativeType("GLint") int r14, @org.lwjgl.system.NativeType("GLint") int r15, @org.lwjgl.system.NativeType("GLsizei") int r16, @org.lwjgl.system.NativeType("GLint") int r17, @org.lwjgl.system.NativeType("GLenum") int r18, @org.lwjgl.system.NativeType("GLenum") int r19, @javax.annotation.Nullable @org.lwjgl.system.NativeType("void const *") short[] r20) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glTextureImage1DEXT
            r21 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L14
            r0 = r21
            long r0 = org.lwjgl.system.Checks.check(r0)
        L14:
            r0 = r12
            r1 = r13
            r2 = r14
            r3 = r15
            r4 = r16
            r5 = r17
            r6 = r18
            r7 = r19
            r8 = r20
            r9 = r21
            org.lwjgl.system.JNI.callPV(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9)
            return
    }

    public static void glTextureImage1DEXT(@org.lwjgl.system.NativeType("GLuint") int r12, @org.lwjgl.system.NativeType("GLenum") int r13, @org.lwjgl.system.NativeType("GLint") int r14, @org.lwjgl.system.NativeType("GLint") int r15, @org.lwjgl.system.NativeType("GLsizei") int r16, @org.lwjgl.system.NativeType("GLint") int r17, @org.lwjgl.system.NativeType("GLenum") int r18, @org.lwjgl.system.NativeType("GLenum") int r19, @javax.annotation.Nullable @org.lwjgl.system.NativeType("void const *") int[] r20) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glTextureImage1DEXT
            r21 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L14
            r0 = r21
            long r0 = org.lwjgl.system.Checks.check(r0)
        L14:
            r0 = r12
            r1 = r13
            r2 = r14
            r3 = r15
            r4 = r16
            r5 = r17
            r6 = r18
            r7 = r19
            r8 = r20
            r9 = r21
            org.lwjgl.system.JNI.callPV(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9)
            return
    }

    public static void glTextureImage1DEXT(@org.lwjgl.system.NativeType("GLuint") int r12, @org.lwjgl.system.NativeType("GLenum") int r13, @org.lwjgl.system.NativeType("GLint") int r14, @org.lwjgl.system.NativeType("GLint") int r15, @org.lwjgl.system.NativeType("GLsizei") int r16, @org.lwjgl.system.NativeType("GLint") int r17, @org.lwjgl.system.NativeType("GLenum") int r18, @org.lwjgl.system.NativeType("GLenum") int r19, @javax.annotation.Nullable @org.lwjgl.system.NativeType("void const *") float[] r20) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glTextureImage1DEXT
            r21 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L14
            r0 = r21
            long r0 = org.lwjgl.system.Checks.check(r0)
        L14:
            r0 = r12
            r1 = r13
            r2 = r14
            r3 = r15
            r4 = r16
            r5 = r17
            r6 = r18
            r7 = r19
            r8 = r20
            r9 = r21
            org.lwjgl.system.JNI.callPV(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9)
            return
    }

    public static void glTextureImage1DEXT(@org.lwjgl.system.NativeType("GLuint") int r12, @org.lwjgl.system.NativeType("GLenum") int r13, @org.lwjgl.system.NativeType("GLint") int r14, @org.lwjgl.system.NativeType("GLint") int r15, @org.lwjgl.system.NativeType("GLsizei") int r16, @org.lwjgl.system.NativeType("GLint") int r17, @org.lwjgl.system.NativeType("GLenum") int r18, @org.lwjgl.system.NativeType("GLenum") int r19, @javax.annotation.Nullable @org.lwjgl.system.NativeType("void const *") double[] r20) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glTextureImage1DEXT
            r21 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L14
            r0 = r21
            long r0 = org.lwjgl.system.Checks.check(r0)
        L14:
            r0 = r12
            r1 = r13
            r2 = r14
            r3 = r15
            r4 = r16
            r5 = r17
            r6 = r18
            r7 = r19
            r8 = r20
            r9 = r21
            org.lwjgl.system.JNI.callPV(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9)
            return
    }

    public static void glTextureImage2DEXT(@org.lwjgl.system.NativeType("GLuint") int r13, @org.lwjgl.system.NativeType("GLenum") int r14, @org.lwjgl.system.NativeType("GLint") int r15, @org.lwjgl.system.NativeType("GLint") int r16, @org.lwjgl.system.NativeType("GLsizei") int r17, @org.lwjgl.system.NativeType("GLsizei") int r18, @org.lwjgl.system.NativeType("GLint") int r19, @org.lwjgl.system.NativeType("GLenum") int r20, @org.lwjgl.system.NativeType("GLenum") int r21, @javax.annotation.Nullable @org.lwjgl.system.NativeType("void const *") short[] r22) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glTextureImage2DEXT
            r23 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L14
            r0 = r23
            long r0 = org.lwjgl.system.Checks.check(r0)
        L14:
            r0 = r13
            r1 = r14
            r2 = r15
            r3 = r16
            r4 = r17
            r5 = r18
            r6 = r19
            r7 = r20
            r8 = r21
            r9 = r22
            r10 = r23
            org.lwjgl.system.JNI.callPV(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            return
    }

    public static void glTextureImage2DEXT(@org.lwjgl.system.NativeType("GLuint") int r13, @org.lwjgl.system.NativeType("GLenum") int r14, @org.lwjgl.system.NativeType("GLint") int r15, @org.lwjgl.system.NativeType("GLint") int r16, @org.lwjgl.system.NativeType("GLsizei") int r17, @org.lwjgl.system.NativeType("GLsizei") int r18, @org.lwjgl.system.NativeType("GLint") int r19, @org.lwjgl.system.NativeType("GLenum") int r20, @org.lwjgl.system.NativeType("GLenum") int r21, @javax.annotation.Nullable @org.lwjgl.system.NativeType("void const *") int[] r22) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glTextureImage2DEXT
            r23 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L14
            r0 = r23
            long r0 = org.lwjgl.system.Checks.check(r0)
        L14:
            r0 = r13
            r1 = r14
            r2 = r15
            r3 = r16
            r4 = r17
            r5 = r18
            r6 = r19
            r7 = r20
            r8 = r21
            r9 = r22
            r10 = r23
            org.lwjgl.system.JNI.callPV(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            return
    }

    public static void glTextureImage2DEXT(@org.lwjgl.system.NativeType("GLuint") int r13, @org.lwjgl.system.NativeType("GLenum") int r14, @org.lwjgl.system.NativeType("GLint") int r15, @org.lwjgl.system.NativeType("GLint") int r16, @org.lwjgl.system.NativeType("GLsizei") int r17, @org.lwjgl.system.NativeType("GLsizei") int r18, @org.lwjgl.system.NativeType("GLint") int r19, @org.lwjgl.system.NativeType("GLenum") int r20, @org.lwjgl.system.NativeType("GLenum") int r21, @javax.annotation.Nullable @org.lwjgl.system.NativeType("void const *") float[] r22) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glTextureImage2DEXT
            r23 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L14
            r0 = r23
            long r0 = org.lwjgl.system.Checks.check(r0)
        L14:
            r0 = r13
            r1 = r14
            r2 = r15
            r3 = r16
            r4 = r17
            r5 = r18
            r6 = r19
            r7 = r20
            r8 = r21
            r9 = r22
            r10 = r23
            org.lwjgl.system.JNI.callPV(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            return
    }

    public static void glTextureImage2DEXT(@org.lwjgl.system.NativeType("GLuint") int r13, @org.lwjgl.system.NativeType("GLenum") int r14, @org.lwjgl.system.NativeType("GLint") int r15, @org.lwjgl.system.NativeType("GLint") int r16, @org.lwjgl.system.NativeType("GLsizei") int r17, @org.lwjgl.system.NativeType("GLsizei") int r18, @org.lwjgl.system.NativeType("GLint") int r19, @org.lwjgl.system.NativeType("GLenum") int r20, @org.lwjgl.system.NativeType("GLenum") int r21, @javax.annotation.Nullable @org.lwjgl.system.NativeType("void const *") double[] r22) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glTextureImage2DEXT
            r23 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L14
            r0 = r23
            long r0 = org.lwjgl.system.Checks.check(r0)
        L14:
            r0 = r13
            r1 = r14
            r2 = r15
            r3 = r16
            r4 = r17
            r5 = r18
            r6 = r19
            r7 = r20
            r8 = r21
            r9 = r22
            r10 = r23
            org.lwjgl.system.JNI.callPV(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            return
    }

    public static void glTextureSubImage1DEXT(@org.lwjgl.system.NativeType("GLuint") int r11, @org.lwjgl.system.NativeType("GLenum") int r12, @org.lwjgl.system.NativeType("GLint") int r13, @org.lwjgl.system.NativeType("GLint") int r14, @org.lwjgl.system.NativeType("GLsizei") int r15, @org.lwjgl.system.NativeType("GLenum") int r16, @org.lwjgl.system.NativeType("GLenum") int r17, @org.lwjgl.system.NativeType("void const *") short[] r18) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glTextureSubImage1DEXT
            r19 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L14
            r0 = r19
            long r0 = org.lwjgl.system.Checks.check(r0)
        L14:
            r0 = r11
            r1 = r12
            r2 = r13
            r3 = r14
            r4 = r15
            r5 = r16
            r6 = r17
            r7 = r18
            r8 = r19
            org.lwjgl.system.JNI.callPV(r0, r1, r2, r3, r4, r5, r6, r7, r8)
            return
    }

    public static void glTextureSubImage1DEXT(@org.lwjgl.system.NativeType("GLuint") int r11, @org.lwjgl.system.NativeType("GLenum") int r12, @org.lwjgl.system.NativeType("GLint") int r13, @org.lwjgl.system.NativeType("GLint") int r14, @org.lwjgl.system.NativeType("GLsizei") int r15, @org.lwjgl.system.NativeType("GLenum") int r16, @org.lwjgl.system.NativeType("GLenum") int r17, @org.lwjgl.system.NativeType("void const *") int[] r18) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glTextureSubImage1DEXT
            r19 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L14
            r0 = r19
            long r0 = org.lwjgl.system.Checks.check(r0)
        L14:
            r0 = r11
            r1 = r12
            r2 = r13
            r3 = r14
            r4 = r15
            r5 = r16
            r6 = r17
            r7 = r18
            r8 = r19
            org.lwjgl.system.JNI.callPV(r0, r1, r2, r3, r4, r5, r6, r7, r8)
            return
    }

    public static void glTextureSubImage1DEXT(@org.lwjgl.system.NativeType("GLuint") int r11, @org.lwjgl.system.NativeType("GLenum") int r12, @org.lwjgl.system.NativeType("GLint") int r13, @org.lwjgl.system.NativeType("GLint") int r14, @org.lwjgl.system.NativeType("GLsizei") int r15, @org.lwjgl.system.NativeType("GLenum") int r16, @org.lwjgl.system.NativeType("GLenum") int r17, @org.lwjgl.system.NativeType("void const *") float[] r18) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glTextureSubImage1DEXT
            r19 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L14
            r0 = r19
            long r0 = org.lwjgl.system.Checks.check(r0)
        L14:
            r0 = r11
            r1 = r12
            r2 = r13
            r3 = r14
            r4 = r15
            r5 = r16
            r6 = r17
            r7 = r18
            r8 = r19
            org.lwjgl.system.JNI.callPV(r0, r1, r2, r3, r4, r5, r6, r7, r8)
            return
    }

    public static void glTextureSubImage1DEXT(@org.lwjgl.system.NativeType("GLuint") int r11, @org.lwjgl.system.NativeType("GLenum") int r12, @org.lwjgl.system.NativeType("GLint") int r13, @org.lwjgl.system.NativeType("GLint") int r14, @org.lwjgl.system.NativeType("GLsizei") int r15, @org.lwjgl.system.NativeType("GLenum") int r16, @org.lwjgl.system.NativeType("GLenum") int r17, @org.lwjgl.system.NativeType("void const *") double[] r18) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glTextureSubImage1DEXT
            r19 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L14
            r0 = r19
            long r0 = org.lwjgl.system.Checks.check(r0)
        L14:
            r0 = r11
            r1 = r12
            r2 = r13
            r3 = r14
            r4 = r15
            r5 = r16
            r6 = r17
            r7 = r18
            r8 = r19
            org.lwjgl.system.JNI.callPV(r0, r1, r2, r3, r4, r5, r6, r7, r8)
            return
    }

    public static void glTextureSubImage2DEXT(@org.lwjgl.system.NativeType("GLuint") int r13, @org.lwjgl.system.NativeType("GLenum") int r14, @org.lwjgl.system.NativeType("GLint") int r15, @org.lwjgl.system.NativeType("GLint") int r16, @org.lwjgl.system.NativeType("GLint") int r17, @org.lwjgl.system.NativeType("GLsizei") int r18, @org.lwjgl.system.NativeType("GLsizei") int r19, @org.lwjgl.system.NativeType("GLenum") int r20, @org.lwjgl.system.NativeType("GLenum") int r21, @org.lwjgl.system.NativeType("void const *") short[] r22) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glTextureSubImage2DEXT
            r23 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L14
            r0 = r23
            long r0 = org.lwjgl.system.Checks.check(r0)
        L14:
            r0 = r13
            r1 = r14
            r2 = r15
            r3 = r16
            r4 = r17
            r5 = r18
            r6 = r19
            r7 = r20
            r8 = r21
            r9 = r22
            r10 = r23
            org.lwjgl.system.JNI.callPV(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            return
    }

    public static void glTextureSubImage2DEXT(@org.lwjgl.system.NativeType("GLuint") int r13, @org.lwjgl.system.NativeType("GLenum") int r14, @org.lwjgl.system.NativeType("GLint") int r15, @org.lwjgl.system.NativeType("GLint") int r16, @org.lwjgl.system.NativeType("GLint") int r17, @org.lwjgl.system.NativeType("GLsizei") int r18, @org.lwjgl.system.NativeType("GLsizei") int r19, @org.lwjgl.system.NativeType("GLenum") int r20, @org.lwjgl.system.NativeType("GLenum") int r21, @org.lwjgl.system.NativeType("void const *") int[] r22) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glTextureSubImage2DEXT
            r23 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L14
            r0 = r23
            long r0 = org.lwjgl.system.Checks.check(r0)
        L14:
            r0 = r13
            r1 = r14
            r2 = r15
            r3 = r16
            r4 = r17
            r5 = r18
            r6 = r19
            r7 = r20
            r8 = r21
            r9 = r22
            r10 = r23
            org.lwjgl.system.JNI.callPV(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            return
    }

    public static void glTextureSubImage2DEXT(@org.lwjgl.system.NativeType("GLuint") int r13, @org.lwjgl.system.NativeType("GLenum") int r14, @org.lwjgl.system.NativeType("GLint") int r15, @org.lwjgl.system.NativeType("GLint") int r16, @org.lwjgl.system.NativeType("GLint") int r17, @org.lwjgl.system.NativeType("GLsizei") int r18, @org.lwjgl.system.NativeType("GLsizei") int r19, @org.lwjgl.system.NativeType("GLenum") int r20, @org.lwjgl.system.NativeType("GLenum") int r21, @org.lwjgl.system.NativeType("void const *") float[] r22) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glTextureSubImage2DEXT
            r23 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L14
            r0 = r23
            long r0 = org.lwjgl.system.Checks.check(r0)
        L14:
            r0 = r13
            r1 = r14
            r2 = r15
            r3 = r16
            r4 = r17
            r5 = r18
            r6 = r19
            r7 = r20
            r8 = r21
            r9 = r22
            r10 = r23
            org.lwjgl.system.JNI.callPV(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            return
    }

    public static void glTextureSubImage2DEXT(@org.lwjgl.system.NativeType("GLuint") int r13, @org.lwjgl.system.NativeType("GLenum") int r14, @org.lwjgl.system.NativeType("GLint") int r15, @org.lwjgl.system.NativeType("GLint") int r16, @org.lwjgl.system.NativeType("GLint") int r17, @org.lwjgl.system.NativeType("GLsizei") int r18, @org.lwjgl.system.NativeType("GLsizei") int r19, @org.lwjgl.system.NativeType("GLenum") int r20, @org.lwjgl.system.NativeType("GLenum") int r21, @org.lwjgl.system.NativeType("void const *") double[] r22) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glTextureSubImage2DEXT
            r23 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L14
            r0 = r23
            long r0 = org.lwjgl.system.Checks.check(r0)
        L14:
            r0 = r13
            r1 = r14
            r2 = r15
            r3 = r16
            r4 = r17
            r5 = r18
            r6 = r19
            r7 = r20
            r8 = r21
            r9 = r22
            r10 = r23
            org.lwjgl.system.JNI.callPV(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            return
    }

    public static void glGetTextureImageEXT(@org.lwjgl.system.NativeType("GLuint") int r9, @org.lwjgl.system.NativeType("GLenum") int r10, @org.lwjgl.system.NativeType("GLint") int r11, @org.lwjgl.system.NativeType("GLenum") int r12, @org.lwjgl.system.NativeType("GLenum") int r13, @org.lwjgl.system.NativeType("void *") short[] r14) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glGetTextureImageEXT
            r15 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L14
            r0 = r15
            long r0 = org.lwjgl.system.Checks.check(r0)
        L14:
            r0 = r9
            r1 = r10
            r2 = r11
            r3 = r12
            r4 = r13
            r5 = r14
            r6 = r15
            org.lwjgl.system.JNI.callPV(r0, r1, r2, r3, r4, r5, r6)
            return
    }

    public static void glGetTextureImageEXT(@org.lwjgl.system.NativeType("GLuint") int r9, @org.lwjgl.system.NativeType("GLenum") int r10, @org.lwjgl.system.NativeType("GLint") int r11, @org.lwjgl.system.NativeType("GLenum") int r12, @org.lwjgl.system.NativeType("GLenum") int r13, @org.lwjgl.system.NativeType("void *") int[] r14) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glGetTextureImageEXT
            r15 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L14
            r0 = r15
            long r0 = org.lwjgl.system.Checks.check(r0)
        L14:
            r0 = r9
            r1 = r10
            r2 = r11
            r3 = r12
            r4 = r13
            r5 = r14
            r6 = r15
            org.lwjgl.system.JNI.callPV(r0, r1, r2, r3, r4, r5, r6)
            return
    }

    public static void glGetTextureImageEXT(@org.lwjgl.system.NativeType("GLuint") int r9, @org.lwjgl.system.NativeType("GLenum") int r10, @org.lwjgl.system.NativeType("GLint") int r11, @org.lwjgl.system.NativeType("GLenum") int r12, @org.lwjgl.system.NativeType("GLenum") int r13, @org.lwjgl.system.NativeType("void *") float[] r14) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glGetTextureImageEXT
            r15 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L14
            r0 = r15
            long r0 = org.lwjgl.system.Checks.check(r0)
        L14:
            r0 = r9
            r1 = r10
            r2 = r11
            r3 = r12
            r4 = r13
            r5 = r14
            r6 = r15
            org.lwjgl.system.JNI.callPV(r0, r1, r2, r3, r4, r5, r6)
            return
    }

    public static void glGetTextureImageEXT(@org.lwjgl.system.NativeType("GLuint") int r9, @org.lwjgl.system.NativeType("GLenum") int r10, @org.lwjgl.system.NativeType("GLint") int r11, @org.lwjgl.system.NativeType("GLenum") int r12, @org.lwjgl.system.NativeType("GLenum") int r13, @org.lwjgl.system.NativeType("void *") double[] r14) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glGetTextureImageEXT
            r15 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L14
            r0 = r15
            long r0 = org.lwjgl.system.Checks.check(r0)
        L14:
            r0 = r9
            r1 = r10
            r2 = r11
            r3 = r12
            r4 = r13
            r5 = r14
            r6 = r15
            org.lwjgl.system.JNI.callPV(r0, r1, r2, r3, r4, r5, r6)
            return
    }

    public static void glGetTextureParameterfvEXT(@org.lwjgl.system.NativeType("GLuint") int r7, @org.lwjgl.system.NativeType("GLenum") int r8, @org.lwjgl.system.NativeType("GLenum") int r9, @org.lwjgl.system.NativeType("GLfloat *") float[] r10) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glGetTextureParameterfvEXT
            r11 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L19
            r0 = r11
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r10
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
        L19:
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            org.lwjgl.system.JNI.callPV(r0, r1, r2, r3, r4)
            return
    }

    public static void glGetTextureParameterivEXT(@org.lwjgl.system.NativeType("GLuint") int r7, @org.lwjgl.system.NativeType("GLenum") int r8, @org.lwjgl.system.NativeType("GLenum") int r9, @org.lwjgl.system.NativeType("GLint *") int[] r10) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glGetTextureParameterivEXT
            r11 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L19
            r0 = r11
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r10
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
        L19:
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            org.lwjgl.system.JNI.callPV(r0, r1, r2, r3, r4)
            return
    }

    public static void glGetTextureLevelParameterfvEXT(@org.lwjgl.system.NativeType("GLuint") int r8, @org.lwjgl.system.NativeType("GLenum") int r9, @org.lwjgl.system.NativeType("GLint") int r10, @org.lwjgl.system.NativeType("GLenum") int r11, @org.lwjgl.system.NativeType("GLfloat *") float[] r12) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glGetTextureLevelParameterfvEXT
            r13 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L1a
            r0 = r13
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r12
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
        L1a:
            r0 = r8
            r1 = r9
            r2 = r10
            r3 = r11
            r4 = r12
            r5 = r13
            org.lwjgl.system.JNI.callPV(r0, r1, r2, r3, r4, r5)
            return
    }

    public static void glGetTextureLevelParameterivEXT(@org.lwjgl.system.NativeType("GLuint") int r8, @org.lwjgl.system.NativeType("GLenum") int r9, @org.lwjgl.system.NativeType("GLint") int r10, @org.lwjgl.system.NativeType("GLenum") int r11, @org.lwjgl.system.NativeType("GLint *") int[] r12) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glGetTextureLevelParameterivEXT
            r13 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L1a
            r0 = r13
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r12
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
        L1a:
            r0 = r8
            r1 = r9
            r2 = r10
            r3 = r11
            r4 = r12
            r5 = r13
            org.lwjgl.system.JNI.callPV(r0, r1, r2, r3, r4, r5)
            return
    }

    public static void glTextureImage3DEXT(@org.lwjgl.system.NativeType("GLuint") int r14, @org.lwjgl.system.NativeType("GLenum") int r15, @org.lwjgl.system.NativeType("GLint") int r16, @org.lwjgl.system.NativeType("GLint") int r17, @org.lwjgl.system.NativeType("GLsizei") int r18, @org.lwjgl.system.NativeType("GLsizei") int r19, @org.lwjgl.system.NativeType("GLsizei") int r20, @org.lwjgl.system.NativeType("GLint") int r21, @org.lwjgl.system.NativeType("GLenum") int r22, @org.lwjgl.system.NativeType("GLenum") int r23, @javax.annotation.Nullable @org.lwjgl.system.NativeType("void const *") short[] r24) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glTextureImage3DEXT
            r25 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L14
            r0 = r25
            long r0 = org.lwjgl.system.Checks.check(r0)
        L14:
            r0 = r14
            r1 = r15
            r2 = r16
            r3 = r17
            r4 = r18
            r5 = r19
            r6 = r20
            r7 = r21
            r8 = r22
            r9 = r23
            r10 = r24
            r11 = r25
            org.lwjgl.system.JNI.callPV(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            return
    }

    public static void glTextureImage3DEXT(@org.lwjgl.system.NativeType("GLuint") int r14, @org.lwjgl.system.NativeType("GLenum") int r15, @org.lwjgl.system.NativeType("GLint") int r16, @org.lwjgl.system.NativeType("GLint") int r17, @org.lwjgl.system.NativeType("GLsizei") int r18, @org.lwjgl.system.NativeType("GLsizei") int r19, @org.lwjgl.system.NativeType("GLsizei") int r20, @org.lwjgl.system.NativeType("GLint") int r21, @org.lwjgl.system.NativeType("GLenum") int r22, @org.lwjgl.system.NativeType("GLenum") int r23, @javax.annotation.Nullable @org.lwjgl.system.NativeType("void const *") int[] r24) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glTextureImage3DEXT
            r25 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L14
            r0 = r25
            long r0 = org.lwjgl.system.Checks.check(r0)
        L14:
            r0 = r14
            r1 = r15
            r2 = r16
            r3 = r17
            r4 = r18
            r5 = r19
            r6 = r20
            r7 = r21
            r8 = r22
            r9 = r23
            r10 = r24
            r11 = r25
            org.lwjgl.system.JNI.callPV(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            return
    }

    public static void glTextureImage3DEXT(@org.lwjgl.system.NativeType("GLuint") int r14, @org.lwjgl.system.NativeType("GLenum") int r15, @org.lwjgl.system.NativeType("GLint") int r16, @org.lwjgl.system.NativeType("GLint") int r17, @org.lwjgl.system.NativeType("GLsizei") int r18, @org.lwjgl.system.NativeType("GLsizei") int r19, @org.lwjgl.system.NativeType("GLsizei") int r20, @org.lwjgl.system.NativeType("GLint") int r21, @org.lwjgl.system.NativeType("GLenum") int r22, @org.lwjgl.system.NativeType("GLenum") int r23, @javax.annotation.Nullable @org.lwjgl.system.NativeType("void const *") float[] r24) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glTextureImage3DEXT
            r25 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L14
            r0 = r25
            long r0 = org.lwjgl.system.Checks.check(r0)
        L14:
            r0 = r14
            r1 = r15
            r2 = r16
            r3 = r17
            r4 = r18
            r5 = r19
            r6 = r20
            r7 = r21
            r8 = r22
            r9 = r23
            r10 = r24
            r11 = r25
            org.lwjgl.system.JNI.callPV(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            return
    }

    public static void glTextureImage3DEXT(@org.lwjgl.system.NativeType("GLuint") int r14, @org.lwjgl.system.NativeType("GLenum") int r15, @org.lwjgl.system.NativeType("GLint") int r16, @org.lwjgl.system.NativeType("GLint") int r17, @org.lwjgl.system.NativeType("GLsizei") int r18, @org.lwjgl.system.NativeType("GLsizei") int r19, @org.lwjgl.system.NativeType("GLsizei") int r20, @org.lwjgl.system.NativeType("GLint") int r21, @org.lwjgl.system.NativeType("GLenum") int r22, @org.lwjgl.system.NativeType("GLenum") int r23, @javax.annotation.Nullable @org.lwjgl.system.NativeType("void const *") double[] r24) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glTextureImage3DEXT
            r25 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L14
            r0 = r25
            long r0 = org.lwjgl.system.Checks.check(r0)
        L14:
            r0 = r14
            r1 = r15
            r2 = r16
            r3 = r17
            r4 = r18
            r5 = r19
            r6 = r20
            r7 = r21
            r8 = r22
            r9 = r23
            r10 = r24
            r11 = r25
            org.lwjgl.system.JNI.callPV(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            return
    }

    public static void glTextureSubImage3DEXT(@org.lwjgl.system.NativeType("GLuint") int r15, @org.lwjgl.system.NativeType("GLenum") int r16, @org.lwjgl.system.NativeType("GLint") int r17, @org.lwjgl.system.NativeType("GLint") int r18, @org.lwjgl.system.NativeType("GLint") int r19, @org.lwjgl.system.NativeType("GLint") int r20, @org.lwjgl.system.NativeType("GLsizei") int r21, @org.lwjgl.system.NativeType("GLsizei") int r22, @org.lwjgl.system.NativeType("GLsizei") int r23, @org.lwjgl.system.NativeType("GLenum") int r24, @org.lwjgl.system.NativeType("GLenum") int r25, @org.lwjgl.system.NativeType("void const *") short[] r26) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glTextureSubImage3DEXT
            r27 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L14
            r0 = r27
            long r0 = org.lwjgl.system.Checks.check(r0)
        L14:
            r0 = r15
            r1 = r16
            r2 = r17
            r3 = r18
            r4 = r19
            r5 = r20
            r6 = r21
            r7 = r22
            r8 = r23
            r9 = r24
            r10 = r25
            r11 = r26
            r12 = r27
            org.lwjgl.system.JNI.callPV(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            return
    }

    public static void glTextureSubImage3DEXT(@org.lwjgl.system.NativeType("GLuint") int r15, @org.lwjgl.system.NativeType("GLenum") int r16, @org.lwjgl.system.NativeType("GLint") int r17, @org.lwjgl.system.NativeType("GLint") int r18, @org.lwjgl.system.NativeType("GLint") int r19, @org.lwjgl.system.NativeType("GLint") int r20, @org.lwjgl.system.NativeType("GLsizei") int r21, @org.lwjgl.system.NativeType("GLsizei") int r22, @org.lwjgl.system.NativeType("GLsizei") int r23, @org.lwjgl.system.NativeType("GLenum") int r24, @org.lwjgl.system.NativeType("GLenum") int r25, @org.lwjgl.system.NativeType("void const *") int[] r26) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glTextureSubImage3DEXT
            r27 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L14
            r0 = r27
            long r0 = org.lwjgl.system.Checks.check(r0)
        L14:
            r0 = r15
            r1 = r16
            r2 = r17
            r3 = r18
            r4 = r19
            r5 = r20
            r6 = r21
            r7 = r22
            r8 = r23
            r9 = r24
            r10 = r25
            r11 = r26
            r12 = r27
            org.lwjgl.system.JNI.callPV(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            return
    }

    public static void glTextureSubImage3DEXT(@org.lwjgl.system.NativeType("GLuint") int r15, @org.lwjgl.system.NativeType("GLenum") int r16, @org.lwjgl.system.NativeType("GLint") int r17, @org.lwjgl.system.NativeType("GLint") int r18, @org.lwjgl.system.NativeType("GLint") int r19, @org.lwjgl.system.NativeType("GLint") int r20, @org.lwjgl.system.NativeType("GLsizei") int r21, @org.lwjgl.system.NativeType("GLsizei") int r22, @org.lwjgl.system.NativeType("GLsizei") int r23, @org.lwjgl.system.NativeType("GLenum") int r24, @org.lwjgl.system.NativeType("GLenum") int r25, @org.lwjgl.system.NativeType("void const *") float[] r26) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glTextureSubImage3DEXT
            r27 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L14
            r0 = r27
            long r0 = org.lwjgl.system.Checks.check(r0)
        L14:
            r0 = r15
            r1 = r16
            r2 = r17
            r3 = r18
            r4 = r19
            r5 = r20
            r6 = r21
            r7 = r22
            r8 = r23
            r9 = r24
            r10 = r25
            r11 = r26
            r12 = r27
            org.lwjgl.system.JNI.callPV(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            return
    }

    public static void glTextureSubImage3DEXT(@org.lwjgl.system.NativeType("GLuint") int r15, @org.lwjgl.system.NativeType("GLenum") int r16, @org.lwjgl.system.NativeType("GLint") int r17, @org.lwjgl.system.NativeType("GLint") int r18, @org.lwjgl.system.NativeType("GLint") int r19, @org.lwjgl.system.NativeType("GLint") int r20, @org.lwjgl.system.NativeType("GLsizei") int r21, @org.lwjgl.system.NativeType("GLsizei") int r22, @org.lwjgl.system.NativeType("GLsizei") int r23, @org.lwjgl.system.NativeType("GLenum") int r24, @org.lwjgl.system.NativeType("GLenum") int r25, @org.lwjgl.system.NativeType("void const *") double[] r26) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glTextureSubImage3DEXT
            r27 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L14
            r0 = r27
            long r0 = org.lwjgl.system.Checks.check(r0)
        L14:
            r0 = r15
            r1 = r16
            r2 = r17
            r3 = r18
            r4 = r19
            r5 = r20
            r6 = r21
            r7 = r22
            r8 = r23
            r9 = r24
            r10 = r25
            r11 = r26
            r12 = r27
            org.lwjgl.system.JNI.callPV(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            return
    }

    public static void glMultiTexCoordPointerEXT(@org.lwjgl.system.NativeType("GLenum") int r8, @org.lwjgl.system.NativeType("GLint") int r9, @org.lwjgl.system.NativeType("GLenum") int r10, @org.lwjgl.system.NativeType("GLsizei") int r11, @org.lwjgl.system.NativeType("void const *") short[] r12) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glMultiTexCoordPointerEXT
            r13 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L14
            r0 = r13
            long r0 = org.lwjgl.system.Checks.check(r0)
        L14:
            r0 = r8
            r1 = r9
            r2 = r10
            r3 = r11
            r4 = r12
            r5 = r13
            org.lwjgl.system.JNI.callPV(r0, r1, r2, r3, r4, r5)
            return
    }

    public static void glMultiTexCoordPointerEXT(@org.lwjgl.system.NativeType("GLenum") int r8, @org.lwjgl.system.NativeType("GLint") int r9, @org.lwjgl.system.NativeType("GLenum") int r10, @org.lwjgl.system.NativeType("GLsizei") int r11, @org.lwjgl.system.NativeType("void const *") int[] r12) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glMultiTexCoordPointerEXT
            r13 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L14
            r0 = r13
            long r0 = org.lwjgl.system.Checks.check(r0)
        L14:
            r0 = r8
            r1 = r9
            r2 = r10
            r3 = r11
            r4 = r12
            r5 = r13
            org.lwjgl.system.JNI.callPV(r0, r1, r2, r3, r4, r5)
            return
    }

    public static void glMultiTexCoordPointerEXT(@org.lwjgl.system.NativeType("GLenum") int r8, @org.lwjgl.system.NativeType("GLint") int r9, @org.lwjgl.system.NativeType("GLenum") int r10, @org.lwjgl.system.NativeType("GLsizei") int r11, @org.lwjgl.system.NativeType("void const *") float[] r12) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glMultiTexCoordPointerEXT
            r13 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L14
            r0 = r13
            long r0 = org.lwjgl.system.Checks.check(r0)
        L14:
            r0 = r8
            r1 = r9
            r2 = r10
            r3 = r11
            r4 = r12
            r5 = r13
            org.lwjgl.system.JNI.callPV(r0, r1, r2, r3, r4, r5)
            return
    }

    public static void glMultiTexEnvfvEXT(@org.lwjgl.system.NativeType("GLenum") int r7, @org.lwjgl.system.NativeType("GLenum") int r8, @org.lwjgl.system.NativeType("GLenum") int r9, @org.lwjgl.system.NativeType("GLfloat const *") float[] r10) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glMultiTexEnvfvEXT
            r11 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L19
            r0 = r11
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r10
            r1 = 4
            org.lwjgl.system.Checks.check(r0, r1)
        L19:
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            org.lwjgl.system.JNI.callPV(r0, r1, r2, r3, r4)
            return
    }

    public static void glMultiTexEnvivEXT(@org.lwjgl.system.NativeType("GLenum") int r7, @org.lwjgl.system.NativeType("GLenum") int r8, @org.lwjgl.system.NativeType("GLenum") int r9, @org.lwjgl.system.NativeType("GLint const *") int[] r10) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glMultiTexEnvivEXT
            r11 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L19
            r0 = r11
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r10
            r1 = 4
            org.lwjgl.system.Checks.check(r0, r1)
        L19:
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            org.lwjgl.system.JNI.callPV(r0, r1, r2, r3, r4)
            return
    }

    public static void glMultiTexGendvEXT(@org.lwjgl.system.NativeType("GLenum") int r7, @org.lwjgl.system.NativeType("GLenum") int r8, @org.lwjgl.system.NativeType("GLenum") int r9, @org.lwjgl.system.NativeType("GLdouble const *") double[] r10) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glMultiTexGendvEXT
            r11 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L19
            r0 = r11
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r10
            r1 = 4
            org.lwjgl.system.Checks.check(r0, r1)
        L19:
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            org.lwjgl.system.JNI.callPV(r0, r1, r2, r3, r4)
            return
    }

    public static void glMultiTexGenfvEXT(@org.lwjgl.system.NativeType("GLenum") int r7, @org.lwjgl.system.NativeType("GLenum") int r8, @org.lwjgl.system.NativeType("GLenum") int r9, @org.lwjgl.system.NativeType("GLfloat const *") float[] r10) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glMultiTexGenfvEXT
            r11 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L19
            r0 = r11
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r10
            r1 = 4
            org.lwjgl.system.Checks.check(r0, r1)
        L19:
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            org.lwjgl.system.JNI.callPV(r0, r1, r2, r3, r4)
            return
    }

    public static void glMultiTexGenivEXT(@org.lwjgl.system.NativeType("GLenum") int r7, @org.lwjgl.system.NativeType("GLenum") int r8, @org.lwjgl.system.NativeType("GLenum") int r9, @org.lwjgl.system.NativeType("GLint const *") int[] r10) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glMultiTexGenivEXT
            r11 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L19
            r0 = r11
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r10
            r1 = 4
            org.lwjgl.system.Checks.check(r0, r1)
        L19:
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            org.lwjgl.system.JNI.callPV(r0, r1, r2, r3, r4)
            return
    }

    public static void glGetMultiTexEnvfvEXT(@org.lwjgl.system.NativeType("GLenum") int r7, @org.lwjgl.system.NativeType("GLenum") int r8, @org.lwjgl.system.NativeType("GLenum") int r9, @org.lwjgl.system.NativeType("GLfloat *") float[] r10) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glGetMultiTexEnvfvEXT
            r11 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L19
            r0 = r11
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r10
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
        L19:
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            org.lwjgl.system.JNI.callPV(r0, r1, r2, r3, r4)
            return
    }

    public static void glGetMultiTexEnvivEXT(@org.lwjgl.system.NativeType("GLenum") int r7, @org.lwjgl.system.NativeType("GLenum") int r8, @org.lwjgl.system.NativeType("GLenum") int r9, @org.lwjgl.system.NativeType("GLint *") int[] r10) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glGetMultiTexEnvivEXT
            r11 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L19
            r0 = r11
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r10
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
        L19:
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            org.lwjgl.system.JNI.callPV(r0, r1, r2, r3, r4)
            return
    }

    public static void glGetMultiTexGendvEXT(@org.lwjgl.system.NativeType("GLenum") int r7, @org.lwjgl.system.NativeType("GLenum") int r8, @org.lwjgl.system.NativeType("GLenum") int r9, @org.lwjgl.system.NativeType("GLdouble *") double[] r10) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glGetMultiTexGendvEXT
            r11 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L19
            r0 = r11
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r10
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
        L19:
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            org.lwjgl.system.JNI.callPV(r0, r1, r2, r3, r4)
            return
    }

    public static void glGetMultiTexGenfvEXT(@org.lwjgl.system.NativeType("GLenum") int r7, @org.lwjgl.system.NativeType("GLenum") int r8, @org.lwjgl.system.NativeType("GLenum") int r9, @org.lwjgl.system.NativeType("GLfloat *") float[] r10) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glGetMultiTexGenfvEXT
            r11 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L19
            r0 = r11
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r10
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
        L19:
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            org.lwjgl.system.JNI.callPV(r0, r1, r2, r3, r4)
            return
    }

    public static void glGetMultiTexGenivEXT(@org.lwjgl.system.NativeType("GLenum") int r7, @org.lwjgl.system.NativeType("GLenum") int r8, @org.lwjgl.system.NativeType("GLenum") int r9, @org.lwjgl.system.NativeType("GLint *") int[] r10) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glGetMultiTexGenivEXT
            r11 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L19
            r0 = r11
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r10
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
        L19:
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            org.lwjgl.system.JNI.callPV(r0, r1, r2, r3, r4)
            return
    }

    public static void glMultiTexParameterivEXT(@org.lwjgl.system.NativeType("GLenum") int r7, @org.lwjgl.system.NativeType("GLenum") int r8, @org.lwjgl.system.NativeType("GLenum") int r9, @org.lwjgl.system.NativeType("GLint const *") int[] r10) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glMultiTexParameterivEXT
            r11 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L19
            r0 = r11
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r10
            r1 = 4
            org.lwjgl.system.Checks.check(r0, r1)
        L19:
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            org.lwjgl.system.JNI.callPV(r0, r1, r2, r3, r4)
            return
    }

    public static void glMultiTexParameterfvEXT(@org.lwjgl.system.NativeType("GLenum") int r7, @org.lwjgl.system.NativeType("GLenum") int r8, @org.lwjgl.system.NativeType("GLenum") int r9, @org.lwjgl.system.NativeType("GLfloat const *") float[] r10) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glMultiTexParameterfvEXT
            r11 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L19
            r0 = r11
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r10
            r1 = 4
            org.lwjgl.system.Checks.check(r0, r1)
        L19:
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            org.lwjgl.system.JNI.callPV(r0, r1, r2, r3, r4)
            return
    }

    public static void glMultiTexImage1DEXT(@org.lwjgl.system.NativeType("GLenum") int r12, @org.lwjgl.system.NativeType("GLenum") int r13, @org.lwjgl.system.NativeType("GLint") int r14, @org.lwjgl.system.NativeType("GLint") int r15, @org.lwjgl.system.NativeType("GLsizei") int r16, @org.lwjgl.system.NativeType("GLint") int r17, @org.lwjgl.system.NativeType("GLenum") int r18, @org.lwjgl.system.NativeType("GLenum") int r19, @javax.annotation.Nullable @org.lwjgl.system.NativeType("void const *") short[] r20) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glMultiTexImage1DEXT
            r21 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L14
            r0 = r21
            long r0 = org.lwjgl.system.Checks.check(r0)
        L14:
            r0 = r12
            r1 = r13
            r2 = r14
            r3 = r15
            r4 = r16
            r5 = r17
            r6 = r18
            r7 = r19
            r8 = r20
            r9 = r21
            org.lwjgl.system.JNI.callPV(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9)
            return
    }

    public static void glMultiTexImage1DEXT(@org.lwjgl.system.NativeType("GLenum") int r12, @org.lwjgl.system.NativeType("GLenum") int r13, @org.lwjgl.system.NativeType("GLint") int r14, @org.lwjgl.system.NativeType("GLint") int r15, @org.lwjgl.system.NativeType("GLsizei") int r16, @org.lwjgl.system.NativeType("GLint") int r17, @org.lwjgl.system.NativeType("GLenum") int r18, @org.lwjgl.system.NativeType("GLenum") int r19, @javax.annotation.Nullable @org.lwjgl.system.NativeType("void const *") int[] r20) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glMultiTexImage1DEXT
            r21 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L14
            r0 = r21
            long r0 = org.lwjgl.system.Checks.check(r0)
        L14:
            r0 = r12
            r1 = r13
            r2 = r14
            r3 = r15
            r4 = r16
            r5 = r17
            r6 = r18
            r7 = r19
            r8 = r20
            r9 = r21
            org.lwjgl.system.JNI.callPV(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9)
            return
    }

    public static void glMultiTexImage1DEXT(@org.lwjgl.system.NativeType("GLenum") int r12, @org.lwjgl.system.NativeType("GLenum") int r13, @org.lwjgl.system.NativeType("GLint") int r14, @org.lwjgl.system.NativeType("GLint") int r15, @org.lwjgl.system.NativeType("GLsizei") int r16, @org.lwjgl.system.NativeType("GLint") int r17, @org.lwjgl.system.NativeType("GLenum") int r18, @org.lwjgl.system.NativeType("GLenum") int r19, @javax.annotation.Nullable @org.lwjgl.system.NativeType("void const *") float[] r20) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glMultiTexImage1DEXT
            r21 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L14
            r0 = r21
            long r0 = org.lwjgl.system.Checks.check(r0)
        L14:
            r0 = r12
            r1 = r13
            r2 = r14
            r3 = r15
            r4 = r16
            r5 = r17
            r6 = r18
            r7 = r19
            r8 = r20
            r9 = r21
            org.lwjgl.system.JNI.callPV(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9)
            return
    }

    public static void glMultiTexImage1DEXT(@org.lwjgl.system.NativeType("GLenum") int r12, @org.lwjgl.system.NativeType("GLenum") int r13, @org.lwjgl.system.NativeType("GLint") int r14, @org.lwjgl.system.NativeType("GLint") int r15, @org.lwjgl.system.NativeType("GLsizei") int r16, @org.lwjgl.system.NativeType("GLint") int r17, @org.lwjgl.system.NativeType("GLenum") int r18, @org.lwjgl.system.NativeType("GLenum") int r19, @javax.annotation.Nullable @org.lwjgl.system.NativeType("void const *") double[] r20) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glMultiTexImage1DEXT
            r21 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L14
            r0 = r21
            long r0 = org.lwjgl.system.Checks.check(r0)
        L14:
            r0 = r12
            r1 = r13
            r2 = r14
            r3 = r15
            r4 = r16
            r5 = r17
            r6 = r18
            r7 = r19
            r8 = r20
            r9 = r21
            org.lwjgl.system.JNI.callPV(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9)
            return
    }

    public static void glMultiTexImage2DEXT(@org.lwjgl.system.NativeType("GLenum") int r13, @org.lwjgl.system.NativeType("GLenum") int r14, @org.lwjgl.system.NativeType("GLint") int r15, @org.lwjgl.system.NativeType("GLint") int r16, @org.lwjgl.system.NativeType("GLsizei") int r17, @org.lwjgl.system.NativeType("GLsizei") int r18, @org.lwjgl.system.NativeType("GLint") int r19, @org.lwjgl.system.NativeType("GLenum") int r20, @org.lwjgl.system.NativeType("GLenum") int r21, @javax.annotation.Nullable @org.lwjgl.system.NativeType("void const *") short[] r22) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glMultiTexImage2DEXT
            r23 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L14
            r0 = r23
            long r0 = org.lwjgl.system.Checks.check(r0)
        L14:
            r0 = r13
            r1 = r14
            r2 = r15
            r3 = r16
            r4 = r17
            r5 = r18
            r6 = r19
            r7 = r20
            r8 = r21
            r9 = r22
            r10 = r23
            org.lwjgl.system.JNI.callPV(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            return
    }

    public static void glMultiTexImage2DEXT(@org.lwjgl.system.NativeType("GLenum") int r13, @org.lwjgl.system.NativeType("GLenum") int r14, @org.lwjgl.system.NativeType("GLint") int r15, @org.lwjgl.system.NativeType("GLint") int r16, @org.lwjgl.system.NativeType("GLsizei") int r17, @org.lwjgl.system.NativeType("GLsizei") int r18, @org.lwjgl.system.NativeType("GLint") int r19, @org.lwjgl.system.NativeType("GLenum") int r20, @org.lwjgl.system.NativeType("GLenum") int r21, @javax.annotation.Nullable @org.lwjgl.system.NativeType("void const *") int[] r22) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glMultiTexImage2DEXT
            r23 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L14
            r0 = r23
            long r0 = org.lwjgl.system.Checks.check(r0)
        L14:
            r0 = r13
            r1 = r14
            r2 = r15
            r3 = r16
            r4 = r17
            r5 = r18
            r6 = r19
            r7 = r20
            r8 = r21
            r9 = r22
            r10 = r23
            org.lwjgl.system.JNI.callPV(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            return
    }

    public static void glMultiTexImage2DEXT(@org.lwjgl.system.NativeType("GLenum") int r13, @org.lwjgl.system.NativeType("GLenum") int r14, @org.lwjgl.system.NativeType("GLint") int r15, @org.lwjgl.system.NativeType("GLint") int r16, @org.lwjgl.system.NativeType("GLsizei") int r17, @org.lwjgl.system.NativeType("GLsizei") int r18, @org.lwjgl.system.NativeType("GLint") int r19, @org.lwjgl.system.NativeType("GLenum") int r20, @org.lwjgl.system.NativeType("GLenum") int r21, @javax.annotation.Nullable @org.lwjgl.system.NativeType("void const *") float[] r22) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glMultiTexImage2DEXT
            r23 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L14
            r0 = r23
            long r0 = org.lwjgl.system.Checks.check(r0)
        L14:
            r0 = r13
            r1 = r14
            r2 = r15
            r3 = r16
            r4 = r17
            r5 = r18
            r6 = r19
            r7 = r20
            r8 = r21
            r9 = r22
            r10 = r23
            org.lwjgl.system.JNI.callPV(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            return
    }

    public static void glMultiTexImage2DEXT(@org.lwjgl.system.NativeType("GLenum") int r13, @org.lwjgl.system.NativeType("GLenum") int r14, @org.lwjgl.system.NativeType("GLint") int r15, @org.lwjgl.system.NativeType("GLint") int r16, @org.lwjgl.system.NativeType("GLsizei") int r17, @org.lwjgl.system.NativeType("GLsizei") int r18, @org.lwjgl.system.NativeType("GLint") int r19, @org.lwjgl.system.NativeType("GLenum") int r20, @org.lwjgl.system.NativeType("GLenum") int r21, @javax.annotation.Nullable @org.lwjgl.system.NativeType("void const *") double[] r22) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glMultiTexImage2DEXT
            r23 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L14
            r0 = r23
            long r0 = org.lwjgl.system.Checks.check(r0)
        L14:
            r0 = r13
            r1 = r14
            r2 = r15
            r3 = r16
            r4 = r17
            r5 = r18
            r6 = r19
            r7 = r20
            r8 = r21
            r9 = r22
            r10 = r23
            org.lwjgl.system.JNI.callPV(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            return
    }

    public static void glMultiTexSubImage1DEXT(@org.lwjgl.system.NativeType("GLenum") int r11, @org.lwjgl.system.NativeType("GLenum") int r12, @org.lwjgl.system.NativeType("GLint") int r13, @org.lwjgl.system.NativeType("GLint") int r14, @org.lwjgl.system.NativeType("GLsizei") int r15, @org.lwjgl.system.NativeType("GLenum") int r16, @org.lwjgl.system.NativeType("GLenum") int r17, @org.lwjgl.system.NativeType("void const *") short[] r18) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glMultiTexSubImage1DEXT
            r19 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L14
            r0 = r19
            long r0 = org.lwjgl.system.Checks.check(r0)
        L14:
            r0 = r11
            r1 = r12
            r2 = r13
            r3 = r14
            r4 = r15
            r5 = r16
            r6 = r17
            r7 = r18
            r8 = r19
            org.lwjgl.system.JNI.callPV(r0, r1, r2, r3, r4, r5, r6, r7, r8)
            return
    }

    public static void glMultiTexSubImage1DEXT(@org.lwjgl.system.NativeType("GLenum") int r11, @org.lwjgl.system.NativeType("GLenum") int r12, @org.lwjgl.system.NativeType("GLint") int r13, @org.lwjgl.system.NativeType("GLint") int r14, @org.lwjgl.system.NativeType("GLsizei") int r15, @org.lwjgl.system.NativeType("GLenum") int r16, @org.lwjgl.system.NativeType("GLenum") int r17, @org.lwjgl.system.NativeType("void const *") int[] r18) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glMultiTexSubImage1DEXT
            r19 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L14
            r0 = r19
            long r0 = org.lwjgl.system.Checks.check(r0)
        L14:
            r0 = r11
            r1 = r12
            r2 = r13
            r3 = r14
            r4 = r15
            r5 = r16
            r6 = r17
            r7 = r18
            r8 = r19
            org.lwjgl.system.JNI.callPV(r0, r1, r2, r3, r4, r5, r6, r7, r8)
            return
    }

    public static void glMultiTexSubImage1DEXT(@org.lwjgl.system.NativeType("GLenum") int r11, @org.lwjgl.system.NativeType("GLenum") int r12, @org.lwjgl.system.NativeType("GLint") int r13, @org.lwjgl.system.NativeType("GLint") int r14, @org.lwjgl.system.NativeType("GLsizei") int r15, @org.lwjgl.system.NativeType("GLenum") int r16, @org.lwjgl.system.NativeType("GLenum") int r17, @org.lwjgl.system.NativeType("void const *") float[] r18) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glMultiTexSubImage1DEXT
            r19 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L14
            r0 = r19
            long r0 = org.lwjgl.system.Checks.check(r0)
        L14:
            r0 = r11
            r1 = r12
            r2 = r13
            r3 = r14
            r4 = r15
            r5 = r16
            r6 = r17
            r7 = r18
            r8 = r19
            org.lwjgl.system.JNI.callPV(r0, r1, r2, r3, r4, r5, r6, r7, r8)
            return
    }

    public static void glMultiTexSubImage1DEXT(@org.lwjgl.system.NativeType("GLenum") int r11, @org.lwjgl.system.NativeType("GLenum") int r12, @org.lwjgl.system.NativeType("GLint") int r13, @org.lwjgl.system.NativeType("GLint") int r14, @org.lwjgl.system.NativeType("GLsizei") int r15, @org.lwjgl.system.NativeType("GLenum") int r16, @org.lwjgl.system.NativeType("GLenum") int r17, @org.lwjgl.system.NativeType("void const *") double[] r18) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glMultiTexSubImage1DEXT
            r19 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L14
            r0 = r19
            long r0 = org.lwjgl.system.Checks.check(r0)
        L14:
            r0 = r11
            r1 = r12
            r2 = r13
            r3 = r14
            r4 = r15
            r5 = r16
            r6 = r17
            r7 = r18
            r8 = r19
            org.lwjgl.system.JNI.callPV(r0, r1, r2, r3, r4, r5, r6, r7, r8)
            return
    }

    public static void glMultiTexSubImage2DEXT(@org.lwjgl.system.NativeType("GLenum") int r13, @org.lwjgl.system.NativeType("GLenum") int r14, @org.lwjgl.system.NativeType("GLint") int r15, @org.lwjgl.system.NativeType("GLint") int r16, @org.lwjgl.system.NativeType("GLint") int r17, @org.lwjgl.system.NativeType("GLsizei") int r18, @org.lwjgl.system.NativeType("GLsizei") int r19, @org.lwjgl.system.NativeType("GLenum") int r20, @org.lwjgl.system.NativeType("GLenum") int r21, @org.lwjgl.system.NativeType("void const *") short[] r22) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glMultiTexSubImage2DEXT
            r23 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L14
            r0 = r23
            long r0 = org.lwjgl.system.Checks.check(r0)
        L14:
            r0 = r13
            r1 = r14
            r2 = r15
            r3 = r16
            r4 = r17
            r5 = r18
            r6 = r19
            r7 = r20
            r8 = r21
            r9 = r22
            r10 = r23
            org.lwjgl.system.JNI.callPV(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            return
    }

    public static void glMultiTexSubImage2DEXT(@org.lwjgl.system.NativeType("GLenum") int r13, @org.lwjgl.system.NativeType("GLenum") int r14, @org.lwjgl.system.NativeType("GLint") int r15, @org.lwjgl.system.NativeType("GLint") int r16, @org.lwjgl.system.NativeType("GLint") int r17, @org.lwjgl.system.NativeType("GLsizei") int r18, @org.lwjgl.system.NativeType("GLsizei") int r19, @org.lwjgl.system.NativeType("GLenum") int r20, @org.lwjgl.system.NativeType("GLenum") int r21, @org.lwjgl.system.NativeType("void const *") int[] r22) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glMultiTexSubImage2DEXT
            r23 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L14
            r0 = r23
            long r0 = org.lwjgl.system.Checks.check(r0)
        L14:
            r0 = r13
            r1 = r14
            r2 = r15
            r3 = r16
            r4 = r17
            r5 = r18
            r6 = r19
            r7 = r20
            r8 = r21
            r9 = r22
            r10 = r23
            org.lwjgl.system.JNI.callPV(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            return
    }

    public static void glMultiTexSubImage2DEXT(@org.lwjgl.system.NativeType("GLenum") int r13, @org.lwjgl.system.NativeType("GLenum") int r14, @org.lwjgl.system.NativeType("GLint") int r15, @org.lwjgl.system.NativeType("GLint") int r16, @org.lwjgl.system.NativeType("GLint") int r17, @org.lwjgl.system.NativeType("GLsizei") int r18, @org.lwjgl.system.NativeType("GLsizei") int r19, @org.lwjgl.system.NativeType("GLenum") int r20, @org.lwjgl.system.NativeType("GLenum") int r21, @org.lwjgl.system.NativeType("void const *") float[] r22) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glMultiTexSubImage2DEXT
            r23 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L14
            r0 = r23
            long r0 = org.lwjgl.system.Checks.check(r0)
        L14:
            r0 = r13
            r1 = r14
            r2 = r15
            r3 = r16
            r4 = r17
            r5 = r18
            r6 = r19
            r7 = r20
            r8 = r21
            r9 = r22
            r10 = r23
            org.lwjgl.system.JNI.callPV(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            return
    }

    public static void glMultiTexSubImage2DEXT(@org.lwjgl.system.NativeType("GLenum") int r13, @org.lwjgl.system.NativeType("GLenum") int r14, @org.lwjgl.system.NativeType("GLint") int r15, @org.lwjgl.system.NativeType("GLint") int r16, @org.lwjgl.system.NativeType("GLint") int r17, @org.lwjgl.system.NativeType("GLsizei") int r18, @org.lwjgl.system.NativeType("GLsizei") int r19, @org.lwjgl.system.NativeType("GLenum") int r20, @org.lwjgl.system.NativeType("GLenum") int r21, @org.lwjgl.system.NativeType("void const *") double[] r22) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glMultiTexSubImage2DEXT
            r23 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L14
            r0 = r23
            long r0 = org.lwjgl.system.Checks.check(r0)
        L14:
            r0 = r13
            r1 = r14
            r2 = r15
            r3 = r16
            r4 = r17
            r5 = r18
            r6 = r19
            r7 = r20
            r8 = r21
            r9 = r22
            r10 = r23
            org.lwjgl.system.JNI.callPV(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            return
    }

    public static void glGetMultiTexImageEXT(@org.lwjgl.system.NativeType("GLenum") int r9, @org.lwjgl.system.NativeType("GLenum") int r10, @org.lwjgl.system.NativeType("GLint") int r11, @org.lwjgl.system.NativeType("GLenum") int r12, @org.lwjgl.system.NativeType("GLenum") int r13, @org.lwjgl.system.NativeType("void *") short[] r14) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glGetMultiTexImageEXT
            r15 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L14
            r0 = r15
            long r0 = org.lwjgl.system.Checks.check(r0)
        L14:
            r0 = r9
            r1 = r10
            r2 = r11
            r3 = r12
            r4 = r13
            r5 = r14
            r6 = r15
            org.lwjgl.system.JNI.callPV(r0, r1, r2, r3, r4, r5, r6)
            return
    }

    public static void glGetMultiTexImageEXT(@org.lwjgl.system.NativeType("GLenum") int r9, @org.lwjgl.system.NativeType("GLenum") int r10, @org.lwjgl.system.NativeType("GLint") int r11, @org.lwjgl.system.NativeType("GLenum") int r12, @org.lwjgl.system.NativeType("GLenum") int r13, @org.lwjgl.system.NativeType("void *") int[] r14) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glGetMultiTexImageEXT
            r15 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L14
            r0 = r15
            long r0 = org.lwjgl.system.Checks.check(r0)
        L14:
            r0 = r9
            r1 = r10
            r2 = r11
            r3 = r12
            r4 = r13
            r5 = r14
            r6 = r15
            org.lwjgl.system.JNI.callPV(r0, r1, r2, r3, r4, r5, r6)
            return
    }

    public static void glGetMultiTexImageEXT(@org.lwjgl.system.NativeType("GLenum") int r9, @org.lwjgl.system.NativeType("GLenum") int r10, @org.lwjgl.system.NativeType("GLint") int r11, @org.lwjgl.system.NativeType("GLenum") int r12, @org.lwjgl.system.NativeType("GLenum") int r13, @org.lwjgl.system.NativeType("void *") float[] r14) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glGetMultiTexImageEXT
            r15 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L14
            r0 = r15
            long r0 = org.lwjgl.system.Checks.check(r0)
        L14:
            r0 = r9
            r1 = r10
            r2 = r11
            r3 = r12
            r4 = r13
            r5 = r14
            r6 = r15
            org.lwjgl.system.JNI.callPV(r0, r1, r2, r3, r4, r5, r6)
            return
    }

    public static void glGetMultiTexImageEXT(@org.lwjgl.system.NativeType("GLenum") int r9, @org.lwjgl.system.NativeType("GLenum") int r10, @org.lwjgl.system.NativeType("GLint") int r11, @org.lwjgl.system.NativeType("GLenum") int r12, @org.lwjgl.system.NativeType("GLenum") int r13, @org.lwjgl.system.NativeType("void *") double[] r14) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glGetMultiTexImageEXT
            r15 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L14
            r0 = r15
            long r0 = org.lwjgl.system.Checks.check(r0)
        L14:
            r0 = r9
            r1 = r10
            r2 = r11
            r3 = r12
            r4 = r13
            r5 = r14
            r6 = r15
            org.lwjgl.system.JNI.callPV(r0, r1, r2, r3, r4, r5, r6)
            return
    }

    public static void glGetMultiTexParameterfvEXT(@org.lwjgl.system.NativeType("GLenum") int r7, @org.lwjgl.system.NativeType("GLenum") int r8, @org.lwjgl.system.NativeType("GLenum") int r9, @org.lwjgl.system.NativeType("GLfloat *") float[] r10) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glGetMultiTexParameterfvEXT
            r11 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L19
            r0 = r11
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r10
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
        L19:
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            org.lwjgl.system.JNI.callPV(r0, r1, r2, r3, r4)
            return
    }

    public static void glGetMultiTexParameterivEXT(@org.lwjgl.system.NativeType("GLenum") int r7, @org.lwjgl.system.NativeType("GLenum") int r8, @org.lwjgl.system.NativeType("GLenum") int r9, @org.lwjgl.system.NativeType("GLint *") int[] r10) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glGetMultiTexParameterivEXT
            r11 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L19
            r0 = r11
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r10
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
        L19:
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            org.lwjgl.system.JNI.callPV(r0, r1, r2, r3, r4)
            return
    }

    public static void glGetMultiTexLevelParameterfvEXT(@org.lwjgl.system.NativeType("GLenum") int r8, @org.lwjgl.system.NativeType("GLenum") int r9, @org.lwjgl.system.NativeType("GLint") int r10, @org.lwjgl.system.NativeType("GLenum") int r11, @org.lwjgl.system.NativeType("GLfloat *") float[] r12) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glGetMultiTexLevelParameterfvEXT
            r13 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L1a
            r0 = r13
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r12
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
        L1a:
            r0 = r8
            r1 = r9
            r2 = r10
            r3 = r11
            r4 = r12
            r5 = r13
            org.lwjgl.system.JNI.callPV(r0, r1, r2, r3, r4, r5)
            return
    }

    public static void glGetMultiTexLevelParameterivEXT(@org.lwjgl.system.NativeType("GLenum") int r8, @org.lwjgl.system.NativeType("GLenum") int r9, @org.lwjgl.system.NativeType("GLint") int r10, @org.lwjgl.system.NativeType("GLenum") int r11, @org.lwjgl.system.NativeType("GLint *") int[] r12) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glGetMultiTexLevelParameterivEXT
            r13 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L1a
            r0 = r13
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r12
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
        L1a:
            r0 = r8
            r1 = r9
            r2 = r10
            r3 = r11
            r4 = r12
            r5 = r13
            org.lwjgl.system.JNI.callPV(r0, r1, r2, r3, r4, r5)
            return
    }

    public static void glMultiTexImage3DEXT(@org.lwjgl.system.NativeType("GLenum") int r14, @org.lwjgl.system.NativeType("GLenum") int r15, @org.lwjgl.system.NativeType("GLint") int r16, @org.lwjgl.system.NativeType("GLint") int r17, @org.lwjgl.system.NativeType("GLsizei") int r18, @org.lwjgl.system.NativeType("GLsizei") int r19, @org.lwjgl.system.NativeType("GLsizei") int r20, @org.lwjgl.system.NativeType("GLint") int r21, @org.lwjgl.system.NativeType("GLenum") int r22, @org.lwjgl.system.NativeType("GLenum") int r23, @javax.annotation.Nullable @org.lwjgl.system.NativeType("void const *") short[] r24) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glMultiTexImage3DEXT
            r25 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L14
            r0 = r25
            long r0 = org.lwjgl.system.Checks.check(r0)
        L14:
            r0 = r14
            r1 = r15
            r2 = r16
            r3 = r17
            r4 = r18
            r5 = r19
            r6 = r20
            r7 = r21
            r8 = r22
            r9 = r23
            r10 = r24
            r11 = r25
            org.lwjgl.system.JNI.callPV(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            return
    }

    public static void glMultiTexImage3DEXT(@org.lwjgl.system.NativeType("GLenum") int r14, @org.lwjgl.system.NativeType("GLenum") int r15, @org.lwjgl.system.NativeType("GLint") int r16, @org.lwjgl.system.NativeType("GLint") int r17, @org.lwjgl.system.NativeType("GLsizei") int r18, @org.lwjgl.system.NativeType("GLsizei") int r19, @org.lwjgl.system.NativeType("GLsizei") int r20, @org.lwjgl.system.NativeType("GLint") int r21, @org.lwjgl.system.NativeType("GLenum") int r22, @org.lwjgl.system.NativeType("GLenum") int r23, @javax.annotation.Nullable @org.lwjgl.system.NativeType("void const *") int[] r24) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glMultiTexImage3DEXT
            r25 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L14
            r0 = r25
            long r0 = org.lwjgl.system.Checks.check(r0)
        L14:
            r0 = r14
            r1 = r15
            r2 = r16
            r3 = r17
            r4 = r18
            r5 = r19
            r6 = r20
            r7 = r21
            r8 = r22
            r9 = r23
            r10 = r24
            r11 = r25
            org.lwjgl.system.JNI.callPV(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            return
    }

    public static void glMultiTexImage3DEXT(@org.lwjgl.system.NativeType("GLenum") int r14, @org.lwjgl.system.NativeType("GLenum") int r15, @org.lwjgl.system.NativeType("GLint") int r16, @org.lwjgl.system.NativeType("GLint") int r17, @org.lwjgl.system.NativeType("GLsizei") int r18, @org.lwjgl.system.NativeType("GLsizei") int r19, @org.lwjgl.system.NativeType("GLsizei") int r20, @org.lwjgl.system.NativeType("GLint") int r21, @org.lwjgl.system.NativeType("GLenum") int r22, @org.lwjgl.system.NativeType("GLenum") int r23, @javax.annotation.Nullable @org.lwjgl.system.NativeType("void const *") float[] r24) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glMultiTexImage3DEXT
            r25 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L14
            r0 = r25
            long r0 = org.lwjgl.system.Checks.check(r0)
        L14:
            r0 = r14
            r1 = r15
            r2 = r16
            r3 = r17
            r4 = r18
            r5 = r19
            r6 = r20
            r7 = r21
            r8 = r22
            r9 = r23
            r10 = r24
            r11 = r25
            org.lwjgl.system.JNI.callPV(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            return
    }

    public static void glMultiTexImage3DEXT(@org.lwjgl.system.NativeType("GLenum") int r14, @org.lwjgl.system.NativeType("GLenum") int r15, @org.lwjgl.system.NativeType("GLint") int r16, @org.lwjgl.system.NativeType("GLint") int r17, @org.lwjgl.system.NativeType("GLsizei") int r18, @org.lwjgl.system.NativeType("GLsizei") int r19, @org.lwjgl.system.NativeType("GLsizei") int r20, @org.lwjgl.system.NativeType("GLint") int r21, @org.lwjgl.system.NativeType("GLenum") int r22, @org.lwjgl.system.NativeType("GLenum") int r23, @javax.annotation.Nullable @org.lwjgl.system.NativeType("void const *") double[] r24) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glMultiTexImage3DEXT
            r25 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L14
            r0 = r25
            long r0 = org.lwjgl.system.Checks.check(r0)
        L14:
            r0 = r14
            r1 = r15
            r2 = r16
            r3 = r17
            r4 = r18
            r5 = r19
            r6 = r20
            r7 = r21
            r8 = r22
            r9 = r23
            r10 = r24
            r11 = r25
            org.lwjgl.system.JNI.callPV(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            return
    }

    public static void glMultiTexSubImage3DEXT(@org.lwjgl.system.NativeType("GLenum") int r15, @org.lwjgl.system.NativeType("GLenum") int r16, @org.lwjgl.system.NativeType("GLint") int r17, @org.lwjgl.system.NativeType("GLint") int r18, @org.lwjgl.system.NativeType("GLint") int r19, @org.lwjgl.system.NativeType("GLint") int r20, @org.lwjgl.system.NativeType("GLsizei") int r21, @org.lwjgl.system.NativeType("GLsizei") int r22, @org.lwjgl.system.NativeType("GLsizei") int r23, @org.lwjgl.system.NativeType("GLenum") int r24, @org.lwjgl.system.NativeType("GLenum") int r25, @org.lwjgl.system.NativeType("void const *") short[] r26) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glMultiTexSubImage3DEXT
            r27 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L14
            r0 = r27
            long r0 = org.lwjgl.system.Checks.check(r0)
        L14:
            r0 = r15
            r1 = r16
            r2 = r17
            r3 = r18
            r4 = r19
            r5 = r20
            r6 = r21
            r7 = r22
            r8 = r23
            r9 = r24
            r10 = r25
            r11 = r26
            r12 = r27
            org.lwjgl.system.JNI.callPV(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            return
    }

    public static void glMultiTexSubImage3DEXT(@org.lwjgl.system.NativeType("GLenum") int r15, @org.lwjgl.system.NativeType("GLenum") int r16, @org.lwjgl.system.NativeType("GLint") int r17, @org.lwjgl.system.NativeType("GLint") int r18, @org.lwjgl.system.NativeType("GLint") int r19, @org.lwjgl.system.NativeType("GLint") int r20, @org.lwjgl.system.NativeType("GLsizei") int r21, @org.lwjgl.system.NativeType("GLsizei") int r22, @org.lwjgl.system.NativeType("GLsizei") int r23, @org.lwjgl.system.NativeType("GLenum") int r24, @org.lwjgl.system.NativeType("GLenum") int r25, @org.lwjgl.system.NativeType("void const *") int[] r26) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glMultiTexSubImage3DEXT
            r27 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L14
            r0 = r27
            long r0 = org.lwjgl.system.Checks.check(r0)
        L14:
            r0 = r15
            r1 = r16
            r2 = r17
            r3 = r18
            r4 = r19
            r5 = r20
            r6 = r21
            r7 = r22
            r8 = r23
            r9 = r24
            r10 = r25
            r11 = r26
            r12 = r27
            org.lwjgl.system.JNI.callPV(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            return
    }

    public static void glMultiTexSubImage3DEXT(@org.lwjgl.system.NativeType("GLenum") int r15, @org.lwjgl.system.NativeType("GLenum") int r16, @org.lwjgl.system.NativeType("GLint") int r17, @org.lwjgl.system.NativeType("GLint") int r18, @org.lwjgl.system.NativeType("GLint") int r19, @org.lwjgl.system.NativeType("GLint") int r20, @org.lwjgl.system.NativeType("GLsizei") int r21, @org.lwjgl.system.NativeType("GLsizei") int r22, @org.lwjgl.system.NativeType("GLsizei") int r23, @org.lwjgl.system.NativeType("GLenum") int r24, @org.lwjgl.system.NativeType("GLenum") int r25, @org.lwjgl.system.NativeType("void const *") float[] r26) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glMultiTexSubImage3DEXT
            r27 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L14
            r0 = r27
            long r0 = org.lwjgl.system.Checks.check(r0)
        L14:
            r0 = r15
            r1 = r16
            r2 = r17
            r3 = r18
            r4 = r19
            r5 = r20
            r6 = r21
            r7 = r22
            r8 = r23
            r9 = r24
            r10 = r25
            r11 = r26
            r12 = r27
            org.lwjgl.system.JNI.callPV(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            return
    }

    public static void glMultiTexSubImage3DEXT(@org.lwjgl.system.NativeType("GLenum") int r15, @org.lwjgl.system.NativeType("GLenum") int r16, @org.lwjgl.system.NativeType("GLint") int r17, @org.lwjgl.system.NativeType("GLint") int r18, @org.lwjgl.system.NativeType("GLint") int r19, @org.lwjgl.system.NativeType("GLint") int r20, @org.lwjgl.system.NativeType("GLsizei") int r21, @org.lwjgl.system.NativeType("GLsizei") int r22, @org.lwjgl.system.NativeType("GLsizei") int r23, @org.lwjgl.system.NativeType("GLenum") int r24, @org.lwjgl.system.NativeType("GLenum") int r25, @org.lwjgl.system.NativeType("void const *") double[] r26) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glMultiTexSubImage3DEXT
            r27 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L14
            r0 = r27
            long r0 = org.lwjgl.system.Checks.check(r0)
        L14:
            r0 = r15
            r1 = r16
            r2 = r17
            r3 = r18
            r4 = r19
            r5 = r20
            r6 = r21
            r7 = r22
            r8 = r23
            r9 = r24
            r10 = r25
            r11 = r26
            r12 = r27
            org.lwjgl.system.JNI.callPV(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            return
    }

    public static void glGetFloatIndexedvEXT(@org.lwjgl.system.NativeType("GLenum") int r6, @org.lwjgl.system.NativeType("GLuint") int r7, @org.lwjgl.system.NativeType("GLfloat *") float[] r8) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glGetFloatIndexedvEXT
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

    public static void glGetDoubleIndexedvEXT(@org.lwjgl.system.NativeType("GLenum") int r6, @org.lwjgl.system.NativeType("GLuint") int r7, @org.lwjgl.system.NativeType("GLdouble *") double[] r8) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glGetDoubleIndexedvEXT
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

    public static void glGetFloati_vEXT(@org.lwjgl.system.NativeType("GLenum") int r6, @org.lwjgl.system.NativeType("GLuint") int r7, @org.lwjgl.system.NativeType("GLfloat *") float[] r8) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glGetFloati_vEXT
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

    public static void glGetDoublei_vEXT(@org.lwjgl.system.NativeType("GLenum") int r6, @org.lwjgl.system.NativeType("GLuint") int r7, @org.lwjgl.system.NativeType("GLdouble *") double[] r8) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glGetDoublei_vEXT
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

    public static void glGetIntegerIndexedvEXT(@org.lwjgl.system.NativeType("GLenum") int r4, @org.lwjgl.system.NativeType("GLuint") int r5, @org.lwjgl.system.NativeType("GLint *") int[] r6) {
            r0 = r4
            r1 = r5
            r2 = r6
            org.lwjgl.opengl.EXTDrawBuffers2.glGetIntegerIndexedvEXT(r0, r1, r2)
            return
    }

    public static void glNamedProgramLocalParameter4dvEXT(@org.lwjgl.system.NativeType("GLuint") int r7, @org.lwjgl.system.NativeType("GLenum") int r8, @org.lwjgl.system.NativeType("GLuint") int r9, @org.lwjgl.system.NativeType("GLdouble const *") double[] r10) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glNamedProgramLocalParameter4dvEXT
            r11 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L19
            r0 = r11
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r10
            r1 = 4
            org.lwjgl.system.Checks.check(r0, r1)
        L19:
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            org.lwjgl.system.JNI.callPV(r0, r1, r2, r3, r4)
            return
    }

    public static void glNamedProgramLocalParameter4fvEXT(@org.lwjgl.system.NativeType("GLuint") int r7, @org.lwjgl.system.NativeType("GLenum") int r8, @org.lwjgl.system.NativeType("GLuint") int r9, @org.lwjgl.system.NativeType("GLfloat const *") float[] r10) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glNamedProgramLocalParameter4fvEXT
            r11 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L19
            r0 = r11
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r10
            r1 = 4
            org.lwjgl.system.Checks.check(r0, r1)
        L19:
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            org.lwjgl.system.JNI.callPV(r0, r1, r2, r3, r4)
            return
    }

    public static void glGetNamedProgramLocalParameterdvEXT(@org.lwjgl.system.NativeType("GLuint") int r7, @org.lwjgl.system.NativeType("GLenum") int r8, @org.lwjgl.system.NativeType("GLuint") int r9, @org.lwjgl.system.NativeType("GLdouble *") double[] r10) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glGetNamedProgramLocalParameterdvEXT
            r11 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L19
            r0 = r11
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r10
            r1 = 4
            org.lwjgl.system.Checks.check(r0, r1)
        L19:
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            org.lwjgl.system.JNI.callPV(r0, r1, r2, r3, r4)
            return
    }

    public static void glGetNamedProgramLocalParameterfvEXT(@org.lwjgl.system.NativeType("GLuint") int r7, @org.lwjgl.system.NativeType("GLenum") int r8, @org.lwjgl.system.NativeType("GLuint") int r9, @org.lwjgl.system.NativeType("GLfloat *") float[] r10) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glGetNamedProgramLocalParameterfvEXT
            r11 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L19
            r0 = r11
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r10
            r1 = 4
            org.lwjgl.system.Checks.check(r0, r1)
        L19:
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            org.lwjgl.system.JNI.callPV(r0, r1, r2, r3, r4)
            return
    }

    public static void glGetNamedProgramivEXT(@org.lwjgl.system.NativeType("GLuint") int r7, @org.lwjgl.system.NativeType("GLenum") int r8, @org.lwjgl.system.NativeType("GLenum") int r9, @org.lwjgl.system.NativeType("GLint *") int[] r10) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glGetNamedProgramivEXT
            r11 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L19
            r0 = r11
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r10
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
        L19:
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            org.lwjgl.system.JNI.callPV(r0, r1, r2, r3, r4)
            return
    }

    public static void glMatrixLoadTransposefEXT(@org.lwjgl.system.NativeType("GLenum") int r5, @org.lwjgl.system.NativeType("GLfloat const *") float[] r6) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glMatrixLoadTransposefEXT
            r7 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L18
            r0 = r7
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r6
            r1 = 16
            org.lwjgl.system.Checks.check(r0, r1)
        L18:
            r0 = r5
            r1 = r6
            r2 = r7
            org.lwjgl.system.JNI.callPV(r0, r1, r2)
            return
    }

    public static void glMatrixLoadTransposedEXT(@org.lwjgl.system.NativeType("GLenum") int r5, @org.lwjgl.system.NativeType("GLdouble const *") double[] r6) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glMatrixLoadTransposedEXT
            r7 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L18
            r0 = r7
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r6
            r1 = 16
            org.lwjgl.system.Checks.check(r0, r1)
        L18:
            r0 = r5
            r1 = r6
            r2 = r7
            org.lwjgl.system.JNI.callPV(r0, r1, r2)
            return
    }

    public static void glMatrixMultTransposefEXT(@org.lwjgl.system.NativeType("GLenum") int r5, @org.lwjgl.system.NativeType("GLfloat const *") float[] r6) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glMatrixMultTransposefEXT
            r7 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L18
            r0 = r7
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r6
            r1 = 16
            org.lwjgl.system.Checks.check(r0, r1)
        L18:
            r0 = r5
            r1 = r6
            r2 = r7
            org.lwjgl.system.JNI.callPV(r0, r1, r2)
            return
    }

    public static void glMatrixMultTransposedEXT(@org.lwjgl.system.NativeType("GLenum") int r5, @org.lwjgl.system.NativeType("GLdouble const *") double[] r6) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glMatrixMultTransposedEXT
            r7 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L18
            r0 = r7
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r6
            r1 = 16
            org.lwjgl.system.Checks.check(r0, r1)
        L18:
            r0 = r5
            r1 = r6
            r2 = r7
            org.lwjgl.system.JNI.callPV(r0, r1, r2)
            return
    }

    public static void glNamedBufferDataEXT(@org.lwjgl.system.NativeType("GLuint") int r8, @org.lwjgl.system.NativeType("void const *") short[] r9, @org.lwjgl.system.NativeType("GLenum") int r10) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glNamedBufferDataEXT
            r11 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L12
            r0 = r11
            long r0 = org.lwjgl.system.Checks.check(r0)
        L12:
            r0 = r8
            r1 = r9
            int r1 = r1.length
            long r1 = java.lang.Integer.toUnsignedLong(r1)
            r2 = 1
            long r1 = r1 << r2
            r2 = r9
            r3 = r10
            r4 = r11
            org.lwjgl.system.JNI.callPPV(r0, r1, r2, r3, r4)
            return
    }

    public static void glNamedBufferDataEXT(@org.lwjgl.system.NativeType("GLuint") int r8, @org.lwjgl.system.NativeType("void const *") int[] r9, @org.lwjgl.system.NativeType("GLenum") int r10) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glNamedBufferDataEXT
            r11 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L12
            r0 = r11
            long r0 = org.lwjgl.system.Checks.check(r0)
        L12:
            r0 = r8
            r1 = r9
            int r1 = r1.length
            long r1 = java.lang.Integer.toUnsignedLong(r1)
            r2 = 2
            long r1 = r1 << r2
            r2 = r9
            r3 = r10
            r4 = r11
            org.lwjgl.system.JNI.callPPV(r0, r1, r2, r3, r4)
            return
    }

    public static void glNamedBufferDataEXT(@org.lwjgl.system.NativeType("GLuint") int r8, @org.lwjgl.system.NativeType("void const *") float[] r9, @org.lwjgl.system.NativeType("GLenum") int r10) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glNamedBufferDataEXT
            r11 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L12
            r0 = r11
            long r0 = org.lwjgl.system.Checks.check(r0)
        L12:
            r0 = r8
            r1 = r9
            int r1 = r1.length
            long r1 = java.lang.Integer.toUnsignedLong(r1)
            r2 = 2
            long r1 = r1 << r2
            r2 = r9
            r3 = r10
            r4 = r11
            org.lwjgl.system.JNI.callPPV(r0, r1, r2, r3, r4)
            return
    }

    public static void glNamedBufferDataEXT(@org.lwjgl.system.NativeType("GLuint") int r8, @org.lwjgl.system.NativeType("void const *") double[] r9, @org.lwjgl.system.NativeType("GLenum") int r10) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glNamedBufferDataEXT
            r11 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L12
            r0 = r11
            long r0 = org.lwjgl.system.Checks.check(r0)
        L12:
            r0 = r8
            r1 = r9
            int r1 = r1.length
            long r1 = java.lang.Integer.toUnsignedLong(r1)
            r2 = 3
            long r1 = r1 << r2
            r2 = r9
            r3 = r10
            r4 = r11
            org.lwjgl.system.JNI.callPPV(r0, r1, r2, r3, r4)
            return
    }

    public static void glNamedBufferSubDataEXT(@org.lwjgl.system.NativeType("GLuint") int r9, @org.lwjgl.system.NativeType("GLintptr") long r10, @org.lwjgl.system.NativeType("void const *") short[] r12) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glNamedBufferSubDataEXT
            r13 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L14
            r0 = r13
            long r0 = org.lwjgl.system.Checks.check(r0)
        L14:
            r0 = r9
            r1 = r10
            r2 = r12
            int r2 = r2.length
            long r2 = java.lang.Integer.toUnsignedLong(r2)
            r3 = 1
            long r2 = r2 << r3
            r3 = r12
            r4 = r13
            org.lwjgl.system.JNI.callPPPV(r0, r1, r2, r3, r4)
            return
    }

    public static void glNamedBufferSubDataEXT(@org.lwjgl.system.NativeType("GLuint") int r9, @org.lwjgl.system.NativeType("GLintptr") long r10, @org.lwjgl.system.NativeType("void const *") int[] r12) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glNamedBufferSubDataEXT
            r13 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L14
            r0 = r13
            long r0 = org.lwjgl.system.Checks.check(r0)
        L14:
            r0 = r9
            r1 = r10
            r2 = r12
            int r2 = r2.length
            long r2 = java.lang.Integer.toUnsignedLong(r2)
            r3 = 2
            long r2 = r2 << r3
            r3 = r12
            r4 = r13
            org.lwjgl.system.JNI.callPPPV(r0, r1, r2, r3, r4)
            return
    }

    public static void glNamedBufferSubDataEXT(@org.lwjgl.system.NativeType("GLuint") int r9, @org.lwjgl.system.NativeType("GLintptr") long r10, @org.lwjgl.system.NativeType("void const *") float[] r12) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glNamedBufferSubDataEXT
            r13 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L14
            r0 = r13
            long r0 = org.lwjgl.system.Checks.check(r0)
        L14:
            r0 = r9
            r1 = r10
            r2 = r12
            int r2 = r2.length
            long r2 = java.lang.Integer.toUnsignedLong(r2)
            r3 = 2
            long r2 = r2 << r3
            r3 = r12
            r4 = r13
            org.lwjgl.system.JNI.callPPPV(r0, r1, r2, r3, r4)
            return
    }

    public static void glNamedBufferSubDataEXT(@org.lwjgl.system.NativeType("GLuint") int r9, @org.lwjgl.system.NativeType("GLintptr") long r10, @org.lwjgl.system.NativeType("void const *") double[] r12) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glNamedBufferSubDataEXT
            r13 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L14
            r0 = r13
            long r0 = org.lwjgl.system.Checks.check(r0)
        L14:
            r0 = r9
            r1 = r10
            r2 = r12
            int r2 = r2.length
            long r2 = java.lang.Integer.toUnsignedLong(r2)
            r3 = 3
            long r2 = r2 << r3
            r3 = r12
            r4 = r13
            org.lwjgl.system.JNI.callPPPV(r0, r1, r2, r3, r4)
            return
    }

    public static void glGetNamedBufferParameterivEXT(@org.lwjgl.system.NativeType("GLuint") int r6, @org.lwjgl.system.NativeType("GLenum") int r7, @org.lwjgl.system.NativeType("GLint *") int[] r8) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glGetNamedBufferParameterivEXT
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

    public static void glGetNamedBufferSubDataEXT(@org.lwjgl.system.NativeType("GLuint") int r9, @org.lwjgl.system.NativeType("GLintptr") long r10, @org.lwjgl.system.NativeType("void *") short[] r12) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glGetNamedBufferSubDataEXT
            r13 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L14
            r0 = r13
            long r0 = org.lwjgl.system.Checks.check(r0)
        L14:
            r0 = r9
            r1 = r10
            r2 = r12
            int r2 = r2.length
            long r2 = java.lang.Integer.toUnsignedLong(r2)
            r3 = 1
            long r2 = r2 << r3
            r3 = r12
            r4 = r13
            org.lwjgl.system.JNI.callPPPV(r0, r1, r2, r3, r4)
            return
    }

    public static void glGetNamedBufferSubDataEXT(@org.lwjgl.system.NativeType("GLuint") int r9, @org.lwjgl.system.NativeType("GLintptr") long r10, @org.lwjgl.system.NativeType("void *") int[] r12) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glGetNamedBufferSubDataEXT
            r13 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L14
            r0 = r13
            long r0 = org.lwjgl.system.Checks.check(r0)
        L14:
            r0 = r9
            r1 = r10
            r2 = r12
            int r2 = r2.length
            long r2 = java.lang.Integer.toUnsignedLong(r2)
            r3 = 2
            long r2 = r2 << r3
            r3 = r12
            r4 = r13
            org.lwjgl.system.JNI.callPPPV(r0, r1, r2, r3, r4)
            return
    }

    public static void glGetNamedBufferSubDataEXT(@org.lwjgl.system.NativeType("GLuint") int r9, @org.lwjgl.system.NativeType("GLintptr") long r10, @org.lwjgl.system.NativeType("void *") float[] r12) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glGetNamedBufferSubDataEXT
            r13 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L14
            r0 = r13
            long r0 = org.lwjgl.system.Checks.check(r0)
        L14:
            r0 = r9
            r1 = r10
            r2 = r12
            int r2 = r2.length
            long r2 = java.lang.Integer.toUnsignedLong(r2)
            r3 = 2
            long r2 = r2 << r3
            r3 = r12
            r4 = r13
            org.lwjgl.system.JNI.callPPPV(r0, r1, r2, r3, r4)
            return
    }

    public static void glGetNamedBufferSubDataEXT(@org.lwjgl.system.NativeType("GLuint") int r9, @org.lwjgl.system.NativeType("GLintptr") long r10, @org.lwjgl.system.NativeType("void *") double[] r12) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glGetNamedBufferSubDataEXT
            r13 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L14
            r0 = r13
            long r0 = org.lwjgl.system.Checks.check(r0)
        L14:
            r0 = r9
            r1 = r10
            r2 = r12
            int r2 = r2.length
            long r2 = java.lang.Integer.toUnsignedLong(r2)
            r3 = 3
            long r2 = r2 << r3
            r3 = r12
            r4 = r13
            org.lwjgl.system.JNI.callPPPV(r0, r1, r2, r3, r4)
            return
    }

    public static void glProgramUniform1fvEXT(@org.lwjgl.system.NativeType("GLuint") int r7, @org.lwjgl.system.NativeType("GLint") int r8, @org.lwjgl.system.NativeType("GLfloat const *") float[] r9) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glProgramUniform1fvEXT
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

    public static void glProgramUniform2fvEXT(@org.lwjgl.system.NativeType("GLuint") int r7, @org.lwjgl.system.NativeType("GLint") int r8, @org.lwjgl.system.NativeType("GLfloat const *") float[] r9) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glProgramUniform2fvEXT
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

    public static void glProgramUniform3fvEXT(@org.lwjgl.system.NativeType("GLuint") int r7, @org.lwjgl.system.NativeType("GLint") int r8, @org.lwjgl.system.NativeType("GLfloat const *") float[] r9) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glProgramUniform3fvEXT
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

    public static void glProgramUniform4fvEXT(@org.lwjgl.system.NativeType("GLuint") int r7, @org.lwjgl.system.NativeType("GLint") int r8, @org.lwjgl.system.NativeType("GLfloat const *") float[] r9) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glProgramUniform4fvEXT
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

    public static void glProgramUniform1ivEXT(@org.lwjgl.system.NativeType("GLuint") int r7, @org.lwjgl.system.NativeType("GLint") int r8, @org.lwjgl.system.NativeType("GLint const *") int[] r9) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glProgramUniform1ivEXT
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

    public static void glProgramUniform2ivEXT(@org.lwjgl.system.NativeType("GLuint") int r7, @org.lwjgl.system.NativeType("GLint") int r8, @org.lwjgl.system.NativeType("GLint const *") int[] r9) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glProgramUniform2ivEXT
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

    public static void glProgramUniform3ivEXT(@org.lwjgl.system.NativeType("GLuint") int r7, @org.lwjgl.system.NativeType("GLint") int r8, @org.lwjgl.system.NativeType("GLint const *") int[] r9) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glProgramUniform3ivEXT
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

    public static void glProgramUniform4ivEXT(@org.lwjgl.system.NativeType("GLuint") int r7, @org.lwjgl.system.NativeType("GLint") int r8, @org.lwjgl.system.NativeType("GLint const *") int[] r9) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glProgramUniform4ivEXT
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

    public static void glProgramUniformMatrix2fvEXT(@org.lwjgl.system.NativeType("GLuint") int r8, @org.lwjgl.system.NativeType("GLint") int r9, @org.lwjgl.system.NativeType("GLboolean") boolean r10, @org.lwjgl.system.NativeType("GLfloat const *") float[] r11) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glProgramUniformMatrix2fvEXT
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

    public static void glProgramUniformMatrix3fvEXT(@org.lwjgl.system.NativeType("GLuint") int r8, @org.lwjgl.system.NativeType("GLint") int r9, @org.lwjgl.system.NativeType("GLboolean") boolean r10, @org.lwjgl.system.NativeType("GLfloat const *") float[] r11) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glProgramUniformMatrix3fvEXT
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

    public static void glProgramUniformMatrix4fvEXT(@org.lwjgl.system.NativeType("GLuint") int r8, @org.lwjgl.system.NativeType("GLint") int r9, @org.lwjgl.system.NativeType("GLboolean") boolean r10, @org.lwjgl.system.NativeType("GLfloat const *") float[] r11) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glProgramUniformMatrix4fvEXT
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

    public static void glProgramUniformMatrix2x3fvEXT(@org.lwjgl.system.NativeType("GLuint") int r8, @org.lwjgl.system.NativeType("GLint") int r9, @org.lwjgl.system.NativeType("GLboolean") boolean r10, @org.lwjgl.system.NativeType("GLfloat const *") float[] r11) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glProgramUniformMatrix2x3fvEXT
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

    public static void glProgramUniformMatrix3x2fvEXT(@org.lwjgl.system.NativeType("GLuint") int r8, @org.lwjgl.system.NativeType("GLint") int r9, @org.lwjgl.system.NativeType("GLboolean") boolean r10, @org.lwjgl.system.NativeType("GLfloat const *") float[] r11) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glProgramUniformMatrix3x2fvEXT
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

    public static void glProgramUniformMatrix2x4fvEXT(@org.lwjgl.system.NativeType("GLuint") int r8, @org.lwjgl.system.NativeType("GLint") int r9, @org.lwjgl.system.NativeType("GLboolean") boolean r10, @org.lwjgl.system.NativeType("GLfloat const *") float[] r11) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glProgramUniformMatrix2x4fvEXT
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

    public static void glProgramUniformMatrix4x2fvEXT(@org.lwjgl.system.NativeType("GLuint") int r8, @org.lwjgl.system.NativeType("GLint") int r9, @org.lwjgl.system.NativeType("GLboolean") boolean r10, @org.lwjgl.system.NativeType("GLfloat const *") float[] r11) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glProgramUniformMatrix4x2fvEXT
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

    public static void glProgramUniformMatrix3x4fvEXT(@org.lwjgl.system.NativeType("GLuint") int r8, @org.lwjgl.system.NativeType("GLint") int r9, @org.lwjgl.system.NativeType("GLboolean") boolean r10, @org.lwjgl.system.NativeType("GLfloat const *") float[] r11) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glProgramUniformMatrix3x4fvEXT
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

    public static void glProgramUniformMatrix4x3fvEXT(@org.lwjgl.system.NativeType("GLuint") int r8, @org.lwjgl.system.NativeType("GLint") int r9, @org.lwjgl.system.NativeType("GLboolean") boolean r10, @org.lwjgl.system.NativeType("GLfloat const *") float[] r11) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glProgramUniformMatrix4x3fvEXT
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

    public static void glTextureParameterIivEXT(@org.lwjgl.system.NativeType("GLuint") int r7, @org.lwjgl.system.NativeType("GLenum") int r8, @org.lwjgl.system.NativeType("GLenum") int r9, @org.lwjgl.system.NativeType("GLint const *") int[] r10) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glTextureParameterIivEXT
            r11 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L19
            r0 = r11
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r10
            r1 = 4
            org.lwjgl.system.Checks.check(r0, r1)
        L19:
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            org.lwjgl.system.JNI.callPV(r0, r1, r2, r3, r4)
            return
    }

    public static void glTextureParameterIuivEXT(@org.lwjgl.system.NativeType("GLuint") int r7, @org.lwjgl.system.NativeType("GLenum") int r8, @org.lwjgl.system.NativeType("GLenum") int r9, @org.lwjgl.system.NativeType("GLuint const *") int[] r10) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glTextureParameterIuivEXT
            r11 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L19
            r0 = r11
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r10
            r1 = 4
            org.lwjgl.system.Checks.check(r0, r1)
        L19:
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            org.lwjgl.system.JNI.callPV(r0, r1, r2, r3, r4)
            return
    }

    public static void glGetTextureParameterIivEXT(@org.lwjgl.system.NativeType("GLuint") int r7, @org.lwjgl.system.NativeType("GLenum") int r8, @org.lwjgl.system.NativeType("GLenum") int r9, @org.lwjgl.system.NativeType("GLint *") int[] r10) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glGetTextureParameterIivEXT
            r11 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L19
            r0 = r11
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r10
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
        L19:
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            org.lwjgl.system.JNI.callPV(r0, r1, r2, r3, r4)
            return
    }

    public static void glGetTextureParameterIuivEXT(@org.lwjgl.system.NativeType("GLuint") int r7, @org.lwjgl.system.NativeType("GLenum") int r8, @org.lwjgl.system.NativeType("GLenum") int r9, @org.lwjgl.system.NativeType("GLuint *") int[] r10) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glGetTextureParameterIuivEXT
            r11 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L19
            r0 = r11
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r10
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
        L19:
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            org.lwjgl.system.JNI.callPV(r0, r1, r2, r3, r4)
            return
    }

    public static void glMultiTexParameterIivEXT(@org.lwjgl.system.NativeType("GLenum") int r7, @org.lwjgl.system.NativeType("GLenum") int r8, @org.lwjgl.system.NativeType("GLenum") int r9, @org.lwjgl.system.NativeType("GLint const *") int[] r10) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glMultiTexParameterIivEXT
            r11 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L19
            r0 = r11
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r10
            r1 = 4
            org.lwjgl.system.Checks.check(r0, r1)
        L19:
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            org.lwjgl.system.JNI.callPV(r0, r1, r2, r3, r4)
            return
    }

    public static void glMultiTexParameterIuivEXT(@org.lwjgl.system.NativeType("GLenum") int r7, @org.lwjgl.system.NativeType("GLenum") int r8, @org.lwjgl.system.NativeType("GLenum") int r9, @org.lwjgl.system.NativeType("GLuint const *") int[] r10) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glMultiTexParameterIuivEXT
            r11 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L19
            r0 = r11
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r10
            r1 = 4
            org.lwjgl.system.Checks.check(r0, r1)
        L19:
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            org.lwjgl.system.JNI.callPV(r0, r1, r2, r3, r4)
            return
    }

    public static void glGetMultiTexParameterIivEXT(@org.lwjgl.system.NativeType("GLenum") int r7, @org.lwjgl.system.NativeType("GLenum") int r8, @org.lwjgl.system.NativeType("GLenum") int r9, @org.lwjgl.system.NativeType("GLint *") int[] r10) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glGetMultiTexParameterIivEXT
            r11 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L19
            r0 = r11
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r10
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
        L19:
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            org.lwjgl.system.JNI.callPV(r0, r1, r2, r3, r4)
            return
    }

    public static void glGetMultiTexParameterIuivEXT(@org.lwjgl.system.NativeType("GLenum") int r7, @org.lwjgl.system.NativeType("GLenum") int r8, @org.lwjgl.system.NativeType("GLenum") int r9, @org.lwjgl.system.NativeType("GLuint *") int[] r10) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glGetMultiTexParameterIuivEXT
            r11 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L19
            r0 = r11
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r10
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
        L19:
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            org.lwjgl.system.JNI.callPV(r0, r1, r2, r3, r4)
            return
    }

    public static void glProgramUniform1uivEXT(@org.lwjgl.system.NativeType("GLuint") int r7, @org.lwjgl.system.NativeType("GLint") int r8, @org.lwjgl.system.NativeType("GLuint const *") int[] r9) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glProgramUniform1uivEXT
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

    public static void glProgramUniform2uivEXT(@org.lwjgl.system.NativeType("GLuint") int r7, @org.lwjgl.system.NativeType("GLint") int r8, @org.lwjgl.system.NativeType("GLuint const *") int[] r9) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glProgramUniform2uivEXT
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

    public static void glProgramUniform3uivEXT(@org.lwjgl.system.NativeType("GLuint") int r7, @org.lwjgl.system.NativeType("GLint") int r8, @org.lwjgl.system.NativeType("GLuint const *") int[] r9) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glProgramUniform3uivEXT
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

    public static void glProgramUniform4uivEXT(@org.lwjgl.system.NativeType("GLuint") int r7, @org.lwjgl.system.NativeType("GLint") int r8, @org.lwjgl.system.NativeType("GLuint const *") int[] r9) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glProgramUniform4uivEXT
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

    public static void glNamedProgramLocalParameters4fvEXT(@org.lwjgl.system.NativeType("GLuint") int r8, @org.lwjgl.system.NativeType("GLenum") int r9, @org.lwjgl.system.NativeType("GLuint") int r10, @org.lwjgl.system.NativeType("GLfloat const *") float[] r11) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glNamedProgramLocalParameters4fvEXT
            r12 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L14
            r0 = r12
            long r0 = org.lwjgl.system.Checks.check(r0)
        L14:
            r0 = r8
            r1 = r9
            r2 = r10
            r3 = r11
            int r3 = r3.length
            r4 = 2
            int r3 = r3 >> r4
            r4 = r11
            r5 = r12
            org.lwjgl.system.JNI.callPV(r0, r1, r2, r3, r4, r5)
            return
    }

    public static void glNamedProgramLocalParameterI4ivEXT(@org.lwjgl.system.NativeType("GLuint") int r7, @org.lwjgl.system.NativeType("GLenum") int r8, @org.lwjgl.system.NativeType("GLuint") int r9, @org.lwjgl.system.NativeType("GLint const *") int[] r10) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glNamedProgramLocalParameterI4ivEXT
            r11 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L19
            r0 = r11
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r10
            r1 = 4
            org.lwjgl.system.Checks.check(r0, r1)
        L19:
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            org.lwjgl.system.JNI.callPV(r0, r1, r2, r3, r4)
            return
    }

    public static void glNamedProgramLocalParametersI4ivEXT(@org.lwjgl.system.NativeType("GLuint") int r8, @org.lwjgl.system.NativeType("GLenum") int r9, @org.lwjgl.system.NativeType("GLuint") int r10, @org.lwjgl.system.NativeType("GLint const *") int[] r11) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glNamedProgramLocalParametersI4ivEXT
            r12 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L14
            r0 = r12
            long r0 = org.lwjgl.system.Checks.check(r0)
        L14:
            r0 = r8
            r1 = r9
            r2 = r10
            r3 = r11
            int r3 = r3.length
            r4 = 2
            int r3 = r3 >> r4
            r4 = r11
            r5 = r12
            org.lwjgl.system.JNI.callPV(r0, r1, r2, r3, r4, r5)
            return
    }

    public static void glNamedProgramLocalParameterI4uivEXT(@org.lwjgl.system.NativeType("GLuint") int r7, @org.lwjgl.system.NativeType("GLenum") int r8, @org.lwjgl.system.NativeType("GLuint") int r9, @org.lwjgl.system.NativeType("GLuint const *") int[] r10) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glNamedProgramLocalParameterI4uivEXT
            r11 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L19
            r0 = r11
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r10
            r1 = 4
            org.lwjgl.system.Checks.check(r0, r1)
        L19:
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            org.lwjgl.system.JNI.callPV(r0, r1, r2, r3, r4)
            return
    }

    public static void glNamedProgramLocalParametersI4uivEXT(@org.lwjgl.system.NativeType("GLuint") int r8, @org.lwjgl.system.NativeType("GLenum") int r9, @org.lwjgl.system.NativeType("GLuint") int r10, @org.lwjgl.system.NativeType("GLuint const *") int[] r11) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glNamedProgramLocalParametersI4uivEXT
            r12 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L14
            r0 = r12
            long r0 = org.lwjgl.system.Checks.check(r0)
        L14:
            r0 = r8
            r1 = r9
            r2 = r10
            r3 = r11
            int r3 = r3.length
            r4 = 2
            int r3 = r3 >> r4
            r4 = r11
            r5 = r12
            org.lwjgl.system.JNI.callPV(r0, r1, r2, r3, r4, r5)
            return
    }

    public static void glGetNamedProgramLocalParameterIivEXT(@org.lwjgl.system.NativeType("GLuint") int r7, @org.lwjgl.system.NativeType("GLenum") int r8, @org.lwjgl.system.NativeType("GLuint") int r9, @org.lwjgl.system.NativeType("GLint *") int[] r10) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glGetNamedProgramLocalParameterIivEXT
            r11 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L19
            r0 = r11
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r10
            r1 = 4
            org.lwjgl.system.Checks.check(r0, r1)
        L19:
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            org.lwjgl.system.JNI.callPV(r0, r1, r2, r3, r4)
            return
    }

    public static void glGetNamedProgramLocalParameterIuivEXT(@org.lwjgl.system.NativeType("GLuint") int r7, @org.lwjgl.system.NativeType("GLenum") int r8, @org.lwjgl.system.NativeType("GLuint") int r9, @org.lwjgl.system.NativeType("GLuint *") int[] r10) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glGetNamedProgramLocalParameterIuivEXT
            r11 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L19
            r0 = r11
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r10
            r1 = 4
            org.lwjgl.system.Checks.check(r0, r1)
        L19:
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            org.lwjgl.system.JNI.callPV(r0, r1, r2, r3, r4)
            return
    }

    public static void glGetNamedRenderbufferParameterivEXT(@org.lwjgl.system.NativeType("GLuint") int r6, @org.lwjgl.system.NativeType("GLenum") int r7, @org.lwjgl.system.NativeType("GLint *") int[] r8) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glGetNamedRenderbufferParameterivEXT
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

    public static void glGetNamedFramebufferAttachmentParameterivEXT(@org.lwjgl.system.NativeType("GLuint") int r7, @org.lwjgl.system.NativeType("GLenum") int r8, @org.lwjgl.system.NativeType("GLenum") int r9, @org.lwjgl.system.NativeType("GLint *") int[] r10) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glGetNamedFramebufferAttachmentParameterivEXT
            r11 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L19
            r0 = r11
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r10
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
        L19:
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            org.lwjgl.system.JNI.callPV(r0, r1, r2, r3, r4)
            return
    }

    public static void glFramebufferDrawBuffersEXT(@org.lwjgl.system.NativeType("GLuint") int r6, @org.lwjgl.system.NativeType("GLenum const *") int[] r7) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glFramebufferDrawBuffersEXT
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

    public static void glGetFramebufferParameterivEXT(@org.lwjgl.system.NativeType("GLuint") int r6, @org.lwjgl.system.NativeType("GLenum") int r7, @org.lwjgl.system.NativeType("GLint *") int[] r8) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glGetFramebufferParameterivEXT
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

    public static void glGetVertexArrayIntegervEXT(@org.lwjgl.system.NativeType("GLuint") int r6, @org.lwjgl.system.NativeType("GLenum") int r7, @org.lwjgl.system.NativeType("GLint *") int[] r8) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glGetVertexArrayIntegervEXT
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

    public static void glGetVertexArrayIntegeri_vEXT(@org.lwjgl.system.NativeType("GLuint") int r7, @org.lwjgl.system.NativeType("GLuint") int r8, @org.lwjgl.system.NativeType("GLenum") int r9, @org.lwjgl.system.NativeType("GLint *") int[] r10) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glGetVertexArrayIntegeri_vEXT
            r11 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L19
            r0 = r11
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r10
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
        L19:
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            org.lwjgl.system.JNI.callPV(r0, r1, r2, r3, r4)
            return
    }

    static {
            org.lwjgl.opengl.GL.initialize()
            return
    }
}
