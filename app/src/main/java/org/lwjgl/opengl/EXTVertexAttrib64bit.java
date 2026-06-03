package org.lwjgl.opengl;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/opengl/EXTVertexAttrib64bit.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/opengl/EXTVertexAttrib64bit.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/opengl/EXTVertexAttrib64bit.class */
public class EXTVertexAttrib64bit {
    public static final int GL_DOUBLE_VEC2_EXT = 36860;
    public static final int GL_DOUBLE_VEC3_EXT = 36861;
    public static final int GL_DOUBLE_VEC4_EXT = 36862;
    public static final int GL_DOUBLE_MAT2_EXT = 36678;
    public static final int GL_DOUBLE_MAT3_EXT = 36679;
    public static final int GL_DOUBLE_MAT4_EXT = 36680;
    public static final int GL_DOUBLE_MAT2x3_EXT = 36681;
    public static final int GL_DOUBLE_MAT2x4_EXT = 36682;
    public static final int GL_DOUBLE_MAT3x2_EXT = 36683;
    public static final int GL_DOUBLE_MAT3x4_EXT = 36684;
    public static final int GL_DOUBLE_MAT4x2_EXT = 36685;
    public static final int GL_DOUBLE_MAT4x3_EXT = 36686;

    protected EXTVertexAttrib64bit() {
            r3 = this;
            r0 = r3
            r0.<init>()
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r1 = r0
            r1.<init>()
            throw r0
    }

    public static native void glVertexAttribL1dEXT(@org.lwjgl.system.NativeType("GLuint") int r0, @org.lwjgl.system.NativeType("GLdouble") double r1);

    public static native void glVertexAttribL2dEXT(@org.lwjgl.system.NativeType("GLuint") int r0, @org.lwjgl.system.NativeType("GLdouble") double r1, @org.lwjgl.system.NativeType("GLdouble") double r3);

    public static native void glVertexAttribL3dEXT(@org.lwjgl.system.NativeType("GLuint") int r0, @org.lwjgl.system.NativeType("GLdouble") double r1, @org.lwjgl.system.NativeType("GLdouble") double r3, @org.lwjgl.system.NativeType("GLdouble") double r5);

    public static native void glVertexAttribL4dEXT(@org.lwjgl.system.NativeType("GLuint") int r0, @org.lwjgl.system.NativeType("GLdouble") double r1, @org.lwjgl.system.NativeType("GLdouble") double r3, @org.lwjgl.system.NativeType("GLdouble") double r5, @org.lwjgl.system.NativeType("GLdouble") double r7);

    public static native void nglVertexAttribL1dvEXT(int r0, long r1);

    public static void glVertexAttribL1dvEXT(@org.lwjgl.system.NativeType("GLuint") int r4, @org.lwjgl.system.NativeType("GLdouble const *") java.nio.DoubleBuffer r5) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r5
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
        Lb:
            r0 = r4
            r1 = r5
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            nglVertexAttribL1dvEXT(r0, r1)
            return
    }

    public static native void nglVertexAttribL2dvEXT(int r0, long r1);

    public static void glVertexAttribL2dvEXT(@org.lwjgl.system.NativeType("GLuint") int r4, @org.lwjgl.system.NativeType("GLdouble const *") java.nio.DoubleBuffer r5) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r5
            r1 = 2
            org.lwjgl.system.Checks.check(r0, r1)
        Lb:
            r0 = r4
            r1 = r5
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            nglVertexAttribL2dvEXT(r0, r1)
            return
    }

    public static native void nglVertexAttribL3dvEXT(int r0, long r1);

    public static void glVertexAttribL3dvEXT(@org.lwjgl.system.NativeType("GLuint") int r4, @org.lwjgl.system.NativeType("GLdouble const *") java.nio.DoubleBuffer r5) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r5
            r1 = 3
            org.lwjgl.system.Checks.check(r0, r1)
        Lb:
            r0 = r4
            r1 = r5
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            nglVertexAttribL3dvEXT(r0, r1)
            return
    }

    public static native void nglVertexAttribL4dvEXT(int r0, long r1);

    public static void glVertexAttribL4dvEXT(@org.lwjgl.system.NativeType("GLuint") int r4, @org.lwjgl.system.NativeType("GLdouble const *") java.nio.DoubleBuffer r5) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r5
            r1 = 4
            org.lwjgl.system.Checks.check(r0, r1)
        Lb:
            r0 = r4
            r1 = r5
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            nglVertexAttribL4dvEXT(r0, r1)
            return
    }

    public static native void nglVertexAttribLPointerEXT(int r0, int r1, int r2, int r3, long r4);

    public static void glVertexAttribLPointerEXT(@org.lwjgl.system.NativeType("GLuint") int r7, @org.lwjgl.system.NativeType("GLint") int r8, @org.lwjgl.system.NativeType("GLenum") int r9, @org.lwjgl.system.NativeType("GLsizei") int r10, @org.lwjgl.system.NativeType("void const *") java.nio.ByteBuffer r11) {
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            long r4 = org.lwjgl.system.MemoryUtil.memAddress(r4)
            nglVertexAttribLPointerEXT(r0, r1, r2, r3, r4)
            return
    }

    public static void glVertexAttribLPointerEXT(@org.lwjgl.system.NativeType("GLuint") int r7, @org.lwjgl.system.NativeType("GLint") int r8, @org.lwjgl.system.NativeType("GLenum") int r9, @org.lwjgl.system.NativeType("GLsizei") int r10, @org.lwjgl.system.NativeType("void const *") long r11) {
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            nglVertexAttribLPointerEXT(r0, r1, r2, r3, r4)
            return
    }

    public static void glVertexAttribLPointerEXT(@org.lwjgl.system.NativeType("GLuint") int r7, @org.lwjgl.system.NativeType("GLint") int r8, @org.lwjgl.system.NativeType("GLsizei") int r9, @org.lwjgl.system.NativeType("void const *") java.nio.DoubleBuffer r10) {
            r0 = r7
            r1 = r8
            r2 = 5130(0x140a, float:7.189E-42)
            r3 = r9
            r4 = r10
            long r4 = org.lwjgl.system.MemoryUtil.memAddress(r4)
            nglVertexAttribLPointerEXT(r0, r1, r2, r3, r4)
            return
    }

    public static native void nglGetVertexAttribLdvEXT(int r0, int r1, long r2);

    public static void glGetVertexAttribLdvEXT(@org.lwjgl.system.NativeType("GLuint") int r5, @org.lwjgl.system.NativeType("GLenum") int r6, @org.lwjgl.system.NativeType("GLdouble *") java.nio.DoubleBuffer r7) {
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
            nglGetVertexAttribLdvEXT(r0, r1, r2)
            return
    }

    public static void glVertexArrayVertexAttribLOffsetEXT(@org.lwjgl.system.NativeType("GLuint") int r9, @org.lwjgl.system.NativeType("GLuint") int r10, @org.lwjgl.system.NativeType("GLuint") int r11, @org.lwjgl.system.NativeType("GLint") int r12, @org.lwjgl.system.NativeType("GLenum") int r13, @org.lwjgl.system.NativeType("GLsizei") int r14, @org.lwjgl.system.NativeType("GLintptr") long r15) {
            r0 = r9
            r1 = r10
            r2 = r11
            r3 = r12
            r4 = r13
            r5 = r14
            r6 = r15
            org.lwjgl.opengl.ARBVertexAttrib64Bit.glVertexArrayVertexAttribLOffsetEXT(r0, r1, r2, r3, r4, r5, r6)
            return
    }

    public static void glVertexAttribL1dvEXT(@org.lwjgl.system.NativeType("GLuint") int r5, @org.lwjgl.system.NativeType("GLdouble const *") double[] r6) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glVertexAttribL1dvEXT
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

    public static void glVertexAttribL2dvEXT(@org.lwjgl.system.NativeType("GLuint") int r5, @org.lwjgl.system.NativeType("GLdouble const *") double[] r6) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glVertexAttribL2dvEXT
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

    public static void glVertexAttribL3dvEXT(@org.lwjgl.system.NativeType("GLuint") int r5, @org.lwjgl.system.NativeType("GLdouble const *") double[] r6) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glVertexAttribL3dvEXT
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

    public static void glVertexAttribL4dvEXT(@org.lwjgl.system.NativeType("GLuint") int r5, @org.lwjgl.system.NativeType("GLdouble const *") double[] r6) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glVertexAttribL4dvEXT
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

    public static void glGetVertexAttribLdvEXT(@org.lwjgl.system.NativeType("GLuint") int r6, @org.lwjgl.system.NativeType("GLenum") int r7, @org.lwjgl.system.NativeType("GLdouble *") double[] r8) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glGetVertexAttribLdvEXT
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

    static {
            org.lwjgl.opengl.GL.initialize()
            return
    }
}
