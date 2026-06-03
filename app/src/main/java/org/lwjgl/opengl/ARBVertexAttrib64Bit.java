package org.lwjgl.opengl;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/opengl/ARBVertexAttrib64Bit.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/opengl/ARBVertexAttrib64Bit.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/opengl/ARBVertexAttrib64Bit.class */
public class ARBVertexAttrib64Bit {
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

    protected ARBVertexAttrib64Bit() {
            r3 = this;
            r0 = r3
            r0.<init>()
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r1 = r0
            r1.<init>()
            throw r0
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

    public static native void glVertexArrayVertexAttribLOffsetEXT(@org.lwjgl.system.NativeType("GLuint") int r0, @org.lwjgl.system.NativeType("GLuint") int r1, @org.lwjgl.system.NativeType("GLuint") int r2, @org.lwjgl.system.NativeType("GLint") int r3, @org.lwjgl.system.NativeType("GLenum") int r4, @org.lwjgl.system.NativeType("GLsizei") int r5, @org.lwjgl.system.NativeType("GLintptr") long r6);

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

    static {
            org.lwjgl.opengl.GL.initialize()
            return
    }
}
