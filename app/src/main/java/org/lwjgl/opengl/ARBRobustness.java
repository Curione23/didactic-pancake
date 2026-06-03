package org.lwjgl.opengl;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/opengl/ARBRobustness.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/opengl/ARBRobustness.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/opengl/ARBRobustness.class */
public class ARBRobustness {
    public static final int GL_GUILTY_CONTEXT_RESET_ARB = 33363;
    public static final int GL_INNOCENT_CONTEXT_RESET_ARB = 33364;
    public static final int GL_UNKNOWN_CONTEXT_RESET_ARB = 33365;
    public static final int GL_RESET_NOTIFICATION_STRATEGY_ARB = 33366;
    public static final int GL_LOSE_CONTEXT_ON_RESET_ARB = 33362;
    public static final int GL_NO_RESET_NOTIFICATION_ARB = 33377;
    public static final int GL_CONTEXT_FLAG_ROBUST_ACCESS_BIT_ARB = 4;

    protected ARBRobustness() {
            r3 = this;
            r0 = r3
            r0.<init>()
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r1 = r0
            r1.<init>()
            throw r0
    }

    @org.lwjgl.system.NativeType("GLenum")
    public static native int glGetGraphicsResetStatusARB();

    public static native void nglGetnMapdvARB(int r0, int r1, int r2, long r3);

    public static void glGetnMapdvARB(@org.lwjgl.system.NativeType("GLenum") int r6, @org.lwjgl.system.NativeType("GLenum") int r7, @org.lwjgl.system.NativeType("GLdouble *") java.nio.DoubleBuffer r8) {
            r0 = r6
            r1 = r7
            r2 = r8
            int r2 = r2.remaining()
            r3 = r8
            long r3 = org.lwjgl.system.MemoryUtil.memAddress(r3)
            nglGetnMapdvARB(r0, r1, r2, r3)
            return
    }

    @org.lwjgl.system.NativeType("void")
    public static double glGetnMapdARB(@org.lwjgl.system.NativeType("GLenum") int r6, @org.lwjgl.system.NativeType("GLenum") int r7) {
            org.lwjgl.system.MemoryStack r0 = org.lwjgl.system.MemoryStack.stackGet()
            r8 = r0
            r0 = r8
            int r0 = r0.getPointer()
            r9 = r0
            r0 = r8
            r1 = 1
            java.nio.DoubleBuffer r0 = r0.callocDouble(r1)     // Catch: java.lang.Throwable -> L2b
            r10 = r0
            r0 = r6
            r1 = r7
            r2 = 1
            r3 = r10
            long r3 = org.lwjgl.system.MemoryUtil.memAddress(r3)     // Catch: java.lang.Throwable -> L2b
            nglGetnMapdvARB(r0, r1, r2, r3)     // Catch: java.lang.Throwable -> L2b
            r0 = r10
            r1 = 0
            double r0 = r0.get(r1)     // Catch: java.lang.Throwable -> L2b
            r11 = r0
            r0 = r8
            r1 = r9
            r0.setPointer(r1)
            r0 = r11
            return r0
        L2b:
            r13 = move-exception
            r0 = r8
            r1 = r9
            r0.setPointer(r1)
            r0 = r13
            throw r0
    }

    public static native void nglGetnMapfvARB(int r0, int r1, int r2, long r3);

    public static void glGetnMapfvARB(@org.lwjgl.system.NativeType("GLenum") int r6, @org.lwjgl.system.NativeType("GLenum") int r7, @org.lwjgl.system.NativeType("GLfloat *") java.nio.FloatBuffer r8) {
            r0 = r6
            r1 = r7
            r2 = r8
            int r2 = r2.remaining()
            r3 = r8
            long r3 = org.lwjgl.system.MemoryUtil.memAddress(r3)
            nglGetnMapfvARB(r0, r1, r2, r3)
            return
    }

    @org.lwjgl.system.NativeType("void")
    public static float glGetnMapfARB(@org.lwjgl.system.NativeType("GLenum") int r6, @org.lwjgl.system.NativeType("GLenum") int r7) {
            org.lwjgl.system.MemoryStack r0 = org.lwjgl.system.MemoryStack.stackGet()
            r8 = r0
            r0 = r8
            int r0 = r0.getPointer()
            r9 = r0
            r0 = r8
            r1 = 1
            java.nio.FloatBuffer r0 = r0.callocFloat(r1)     // Catch: java.lang.Throwable -> L2b
            r10 = r0
            r0 = r6
            r1 = r7
            r2 = 1
            r3 = r10
            long r3 = org.lwjgl.system.MemoryUtil.memAddress(r3)     // Catch: java.lang.Throwable -> L2b
            nglGetnMapfvARB(r0, r1, r2, r3)     // Catch: java.lang.Throwable -> L2b
            r0 = r10
            r1 = 0
            float r0 = r0.get(r1)     // Catch: java.lang.Throwable -> L2b
            r11 = r0
            r0 = r8
            r1 = r9
            r0.setPointer(r1)
            r0 = r11
            return r0
        L2b:
            r12 = move-exception
            r0 = r8
            r1 = r9
            r0.setPointer(r1)
            r0 = r12
            throw r0
    }

    public static native void nglGetnMapivARB(int r0, int r1, int r2, long r3);

    public static void glGetnMapivARB(@org.lwjgl.system.NativeType("GLenum") int r6, @org.lwjgl.system.NativeType("GLenum") int r7, @org.lwjgl.system.NativeType("GLint *") java.nio.IntBuffer r8) {
            r0 = r6
            r1 = r7
            r2 = r8
            int r2 = r2.remaining()
            r3 = r8
            long r3 = org.lwjgl.system.MemoryUtil.memAddress(r3)
            nglGetnMapivARB(r0, r1, r2, r3)
            return
    }

    @org.lwjgl.system.NativeType("void")
    public static int glGetnMapiARB(@org.lwjgl.system.NativeType("GLenum") int r6, @org.lwjgl.system.NativeType("GLenum") int r7) {
            org.lwjgl.system.MemoryStack r0 = org.lwjgl.system.MemoryStack.stackGet()
            r8 = r0
            r0 = r8
            int r0 = r0.getPointer()
            r9 = r0
            r0 = r8
            r1 = 1
            java.nio.IntBuffer r0 = r0.callocInt(r1)     // Catch: java.lang.Throwable -> L2b
            r10 = r0
            r0 = r6
            r1 = r7
            r2 = 1
            r3 = r10
            long r3 = org.lwjgl.system.MemoryUtil.memAddress(r3)     // Catch: java.lang.Throwable -> L2b
            nglGetnMapivARB(r0, r1, r2, r3)     // Catch: java.lang.Throwable -> L2b
            r0 = r10
            r1 = 0
            int r0 = r0.get(r1)     // Catch: java.lang.Throwable -> L2b
            r11 = r0
            r0 = r8
            r1 = r9
            r0.setPointer(r1)
            r0 = r11
            return r0
        L2b:
            r12 = move-exception
            r0 = r8
            r1 = r9
            r0.setPointer(r1)
            r0 = r12
            throw r0
    }

    public static native void nglGetnPixelMapfvARB(int r0, int r1, long r2);

    public static void glGetnPixelMapfvARB(@org.lwjgl.system.NativeType("GLenum") int r5, @org.lwjgl.system.NativeType("GLfloat *") java.nio.FloatBuffer r6) {
            r0 = r5
            r1 = r6
            int r1 = r1.remaining()
            r2 = r6
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            nglGetnPixelMapfvARB(r0, r1, r2)
            return
    }

    public static native void nglGetnPixelMapuivARB(int r0, int r1, long r2);

    public static void glGetnPixelMapuivARB(@org.lwjgl.system.NativeType("GLenum") int r5, @org.lwjgl.system.NativeType("GLuint *") java.nio.IntBuffer r6) {
            r0 = r5
            r1 = r6
            int r1 = r1.remaining()
            r2 = r6
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            nglGetnPixelMapuivARB(r0, r1, r2)
            return
    }

    public static native void nglGetnPixelMapusvARB(int r0, int r1, long r2);

    public static void glGetnPixelMapusvARB(@org.lwjgl.system.NativeType("GLenum") int r5, @org.lwjgl.system.NativeType("GLushort *") java.nio.ShortBuffer r6) {
            r0 = r5
            r1 = r6
            int r1 = r1.remaining()
            r2 = r6
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            nglGetnPixelMapusvARB(r0, r1, r2)
            return
    }

    public static native void nglGetnPolygonStippleARB(int r0, long r1);

    public static void glGetnPolygonStippleARB(@org.lwjgl.system.NativeType("GLsizei") int r4, @org.lwjgl.system.NativeType("GLubyte *") long r5) {
            r0 = r4
            r1 = r5
            nglGetnPolygonStippleARB(r0, r1)
            return
    }

    public static void glGetnPolygonStippleARB(@org.lwjgl.system.NativeType("GLubyte *") java.nio.ByteBuffer r4) {
            r0 = r4
            int r0 = r0.remaining()
            r1 = r4
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            nglGetnPolygonStippleARB(r0, r1)
            return
    }

    public static native void nglGetnTexImageARB(int r0, int r1, int r2, int r3, int r4, long r5);

    public static void glGetnTexImageARB(@org.lwjgl.system.NativeType("GLenum") int r8, @org.lwjgl.system.NativeType("GLint") int r9, @org.lwjgl.system.NativeType("GLenum") int r10, @org.lwjgl.system.NativeType("GLenum") int r11, @org.lwjgl.system.NativeType("GLsizei") int r12, @org.lwjgl.system.NativeType("void *") long r13) {
            r0 = r8
            r1 = r9
            r2 = r10
            r3 = r11
            r4 = r12
            r5 = r13
            nglGetnTexImageARB(r0, r1, r2, r3, r4, r5)
            return
    }

    public static void glGetnTexImageARB(@org.lwjgl.system.NativeType("GLenum") int r8, @org.lwjgl.system.NativeType("GLint") int r9, @org.lwjgl.system.NativeType("GLenum") int r10, @org.lwjgl.system.NativeType("GLenum") int r11, @org.lwjgl.system.NativeType("void *") java.nio.ByteBuffer r12) {
            r0 = r8
            r1 = r9
            r2 = r10
            r3 = r11
            r4 = r12
            int r4 = r4.remaining()
            r5 = r12
            long r5 = org.lwjgl.system.MemoryUtil.memAddress(r5)
            nglGetnTexImageARB(r0, r1, r2, r3, r4, r5)
            return
    }

    public static void glGetnTexImageARB(@org.lwjgl.system.NativeType("GLenum") int r8, @org.lwjgl.system.NativeType("GLint") int r9, @org.lwjgl.system.NativeType("GLenum") int r10, @org.lwjgl.system.NativeType("GLenum") int r11, @org.lwjgl.system.NativeType("void *") java.nio.ShortBuffer r12) {
            r0 = r8
            r1 = r9
            r2 = r10
            r3 = r11
            r4 = r12
            int r4 = r4.remaining()
            r5 = 1
            int r4 = r4 << r5
            r5 = r12
            long r5 = org.lwjgl.system.MemoryUtil.memAddress(r5)
            nglGetnTexImageARB(r0, r1, r2, r3, r4, r5)
            return
    }

    public static void glGetnTexImageARB(@org.lwjgl.system.NativeType("GLenum") int r8, @org.lwjgl.system.NativeType("GLint") int r9, @org.lwjgl.system.NativeType("GLenum") int r10, @org.lwjgl.system.NativeType("GLenum") int r11, @org.lwjgl.system.NativeType("void *") java.nio.IntBuffer r12) {
            r0 = r8
            r1 = r9
            r2 = r10
            r3 = r11
            r4 = r12
            int r4 = r4.remaining()
            r5 = 2
            int r4 = r4 << r5
            r5 = r12
            long r5 = org.lwjgl.system.MemoryUtil.memAddress(r5)
            nglGetnTexImageARB(r0, r1, r2, r3, r4, r5)
            return
    }

    public static void glGetnTexImageARB(@org.lwjgl.system.NativeType("GLenum") int r8, @org.lwjgl.system.NativeType("GLint") int r9, @org.lwjgl.system.NativeType("GLenum") int r10, @org.lwjgl.system.NativeType("GLenum") int r11, @org.lwjgl.system.NativeType("void *") java.nio.FloatBuffer r12) {
            r0 = r8
            r1 = r9
            r2 = r10
            r3 = r11
            r4 = r12
            int r4 = r4.remaining()
            r5 = 2
            int r4 = r4 << r5
            r5 = r12
            long r5 = org.lwjgl.system.MemoryUtil.memAddress(r5)
            nglGetnTexImageARB(r0, r1, r2, r3, r4, r5)
            return
    }

    public static void glGetnTexImageARB(@org.lwjgl.system.NativeType("GLenum") int r8, @org.lwjgl.system.NativeType("GLint") int r9, @org.lwjgl.system.NativeType("GLenum") int r10, @org.lwjgl.system.NativeType("GLenum") int r11, @org.lwjgl.system.NativeType("void *") java.nio.DoubleBuffer r12) {
            r0 = r8
            r1 = r9
            r2 = r10
            r3 = r11
            r4 = r12
            int r4 = r4.remaining()
            r5 = 3
            int r4 = r4 << r5
            r5 = r12
            long r5 = org.lwjgl.system.MemoryUtil.memAddress(r5)
            nglGetnTexImageARB(r0, r1, r2, r3, r4, r5)
            return
    }

    public static native void nglReadnPixelsARB(int r0, int r1, int r2, int r3, int r4, int r5, int r6, long r7);

    public static void glReadnPixelsARB(@org.lwjgl.system.NativeType("GLint") int r10, @org.lwjgl.system.NativeType("GLint") int r11, @org.lwjgl.system.NativeType("GLsizei") int r12, @org.lwjgl.system.NativeType("GLsizei") int r13, @org.lwjgl.system.NativeType("GLenum") int r14, @org.lwjgl.system.NativeType("GLenum") int r15, @org.lwjgl.system.NativeType("GLsizei") int r16, @org.lwjgl.system.NativeType("void *") long r17) {
            r0 = r10
            r1 = r11
            r2 = r12
            r3 = r13
            r4 = r14
            r5 = r15
            r6 = r16
            r7 = r17
            nglReadnPixelsARB(r0, r1, r2, r3, r4, r5, r6, r7)
            return
    }

    public static void glReadnPixelsARB(@org.lwjgl.system.NativeType("GLint") int r10, @org.lwjgl.system.NativeType("GLint") int r11, @org.lwjgl.system.NativeType("GLsizei") int r12, @org.lwjgl.system.NativeType("GLsizei") int r13, @org.lwjgl.system.NativeType("GLenum") int r14, @org.lwjgl.system.NativeType("GLenum") int r15, @org.lwjgl.system.NativeType("void *") java.nio.ByteBuffer r16) {
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
            nglReadnPixelsARB(r0, r1, r2, r3, r4, r5, r6, r7)
            return
    }

    public static void glReadnPixelsARB(@org.lwjgl.system.NativeType("GLint") int r10, @org.lwjgl.system.NativeType("GLint") int r11, @org.lwjgl.system.NativeType("GLsizei") int r12, @org.lwjgl.system.NativeType("GLsizei") int r13, @org.lwjgl.system.NativeType("GLenum") int r14, @org.lwjgl.system.NativeType("GLenum") int r15, @org.lwjgl.system.NativeType("void *") java.nio.ShortBuffer r16) {
            r0 = r10
            r1 = r11
            r2 = r12
            r3 = r13
            r4 = r14
            r5 = r15
            r6 = r16
            int r6 = r6.remaining()
            r7 = 1
            int r6 = r6 << r7
            r7 = r16
            long r7 = org.lwjgl.system.MemoryUtil.memAddress(r7)
            nglReadnPixelsARB(r0, r1, r2, r3, r4, r5, r6, r7)
            return
    }

    public static void glReadnPixelsARB(@org.lwjgl.system.NativeType("GLint") int r10, @org.lwjgl.system.NativeType("GLint") int r11, @org.lwjgl.system.NativeType("GLsizei") int r12, @org.lwjgl.system.NativeType("GLsizei") int r13, @org.lwjgl.system.NativeType("GLenum") int r14, @org.lwjgl.system.NativeType("GLenum") int r15, @org.lwjgl.system.NativeType("void *") java.nio.IntBuffer r16) {
            r0 = r10
            r1 = r11
            r2 = r12
            r3 = r13
            r4 = r14
            r5 = r15
            r6 = r16
            int r6 = r6.remaining()
            r7 = 2
            int r6 = r6 << r7
            r7 = r16
            long r7 = org.lwjgl.system.MemoryUtil.memAddress(r7)
            nglReadnPixelsARB(r0, r1, r2, r3, r4, r5, r6, r7)
            return
    }

    public static void glReadnPixelsARB(@org.lwjgl.system.NativeType("GLint") int r10, @org.lwjgl.system.NativeType("GLint") int r11, @org.lwjgl.system.NativeType("GLsizei") int r12, @org.lwjgl.system.NativeType("GLsizei") int r13, @org.lwjgl.system.NativeType("GLenum") int r14, @org.lwjgl.system.NativeType("GLenum") int r15, @org.lwjgl.system.NativeType("void *") java.nio.FloatBuffer r16) {
            r0 = r10
            r1 = r11
            r2 = r12
            r3 = r13
            r4 = r14
            r5 = r15
            r6 = r16
            int r6 = r6.remaining()
            r7 = 2
            int r6 = r6 << r7
            r7 = r16
            long r7 = org.lwjgl.system.MemoryUtil.memAddress(r7)
            nglReadnPixelsARB(r0, r1, r2, r3, r4, r5, r6, r7)
            return
    }

    public static native void nglGetnColorTableARB(int r0, int r1, int r2, int r3, long r4);

    public static void glGetnColorTableARB(@org.lwjgl.system.NativeType("GLenum") int r7, @org.lwjgl.system.NativeType("GLenum") int r8, @org.lwjgl.system.NativeType("GLenum") int r9, @org.lwjgl.system.NativeType("GLsizei") int r10, @org.lwjgl.system.NativeType("void *") long r11) {
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            nglGetnColorTableARB(r0, r1, r2, r3, r4)
            return
    }

    public static void glGetnColorTableARB(@org.lwjgl.system.NativeType("GLenum") int r7, @org.lwjgl.system.NativeType("GLenum") int r8, @org.lwjgl.system.NativeType("GLenum") int r9, @org.lwjgl.system.NativeType("void *") java.nio.ByteBuffer r10) {
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = r10
            int r3 = r3.remaining()
            r4 = r10
            long r4 = org.lwjgl.system.MemoryUtil.memAddress(r4)
            nglGetnColorTableARB(r0, r1, r2, r3, r4)
            return
    }

    public static void glGetnColorTableARB(@org.lwjgl.system.NativeType("GLenum") int r7, @org.lwjgl.system.NativeType("GLenum") int r8, @org.lwjgl.system.NativeType("GLenum") int r9, @org.lwjgl.system.NativeType("void *") java.nio.ShortBuffer r10) {
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = r10
            int r3 = r3.remaining()
            r4 = 1
            int r3 = r3 << r4
            r4 = r10
            long r4 = org.lwjgl.system.MemoryUtil.memAddress(r4)
            nglGetnColorTableARB(r0, r1, r2, r3, r4)
            return
    }

    public static void glGetnColorTableARB(@org.lwjgl.system.NativeType("GLenum") int r7, @org.lwjgl.system.NativeType("GLenum") int r8, @org.lwjgl.system.NativeType("GLenum") int r9, @org.lwjgl.system.NativeType("void *") java.nio.IntBuffer r10) {
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = r10
            int r3 = r3.remaining()
            r4 = 2
            int r3 = r3 << r4
            r4 = r10
            long r4 = org.lwjgl.system.MemoryUtil.memAddress(r4)
            nglGetnColorTableARB(r0, r1, r2, r3, r4)
            return
    }

    public static void glGetnColorTableARB(@org.lwjgl.system.NativeType("GLenum") int r7, @org.lwjgl.system.NativeType("GLenum") int r8, @org.lwjgl.system.NativeType("GLenum") int r9, @org.lwjgl.system.NativeType("void *") java.nio.FloatBuffer r10) {
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = r10
            int r3 = r3.remaining()
            r4 = 2
            int r3 = r3 << r4
            r4 = r10
            long r4 = org.lwjgl.system.MemoryUtil.memAddress(r4)
            nglGetnColorTableARB(r0, r1, r2, r3, r4)
            return
    }

    public static native void nglGetnConvolutionFilterARB(int r0, int r1, int r2, int r3, long r4);

    public static void glGetnConvolutionFilterARB(@org.lwjgl.system.NativeType("GLenum") int r7, @org.lwjgl.system.NativeType("GLenum") int r8, @org.lwjgl.system.NativeType("GLenum") int r9, @org.lwjgl.system.NativeType("GLsizei") int r10, @org.lwjgl.system.NativeType("void *") long r11) {
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            nglGetnConvolutionFilterARB(r0, r1, r2, r3, r4)
            return
    }

    public static void glGetnConvolutionFilterARB(@org.lwjgl.system.NativeType("GLenum") int r7, @org.lwjgl.system.NativeType("GLenum") int r8, @org.lwjgl.system.NativeType("GLenum") int r9, @org.lwjgl.system.NativeType("void *") java.nio.ByteBuffer r10) {
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = r10
            int r3 = r3.remaining()
            r4 = r10
            long r4 = org.lwjgl.system.MemoryUtil.memAddress(r4)
            nglGetnConvolutionFilterARB(r0, r1, r2, r3, r4)
            return
    }

    public static native void nglGetnSeparableFilterARB(int r0, int r1, int r2, int r3, long r4, int r6, long r7, long r9);

    public static void glGetnSeparableFilterARB(@org.lwjgl.system.NativeType("GLenum") int r12, @org.lwjgl.system.NativeType("GLenum") int r13, @org.lwjgl.system.NativeType("GLenum") int r14, @org.lwjgl.system.NativeType("GLsizei") int r15, @org.lwjgl.system.NativeType("void *") long r16, @org.lwjgl.system.NativeType("GLsizei") int r18, @org.lwjgl.system.NativeType("void *") long r19, @javax.annotation.Nullable @org.lwjgl.system.NativeType("void *") java.nio.ByteBuffer r21) {
            r0 = r12
            r1 = r13
            r2 = r14
            r3 = r15
            r4 = r16
            r5 = r18
            r6 = r19
            r7 = r21
            long r7 = org.lwjgl.system.MemoryUtil.memAddressSafe(r7)
            nglGetnSeparableFilterARB(r0, r1, r2, r3, r4, r5, r6, r7)
            return
    }

    public static void glGetnSeparableFilterARB(@org.lwjgl.system.NativeType("GLenum") int r12, @org.lwjgl.system.NativeType("GLenum") int r13, @org.lwjgl.system.NativeType("GLenum") int r14, @org.lwjgl.system.NativeType("void *") java.nio.ByteBuffer r15, @org.lwjgl.system.NativeType("void *") java.nio.ByteBuffer r16, @javax.annotation.Nullable @org.lwjgl.system.NativeType("void *") java.nio.ByteBuffer r17) {
            r0 = r12
            r1 = r13
            r2 = r14
            r3 = r15
            int r3 = r3.remaining()
            r4 = r15
            long r4 = org.lwjgl.system.MemoryUtil.memAddress(r4)
            r5 = r16
            int r5 = r5.remaining()
            r6 = r16
            long r6 = org.lwjgl.system.MemoryUtil.memAddress(r6)
            r7 = r17
            long r7 = org.lwjgl.system.MemoryUtil.memAddressSafe(r7)
            nglGetnSeparableFilterARB(r0, r1, r2, r3, r4, r5, r6, r7)
            return
    }

    public static native void nglGetnHistogramARB(int r0, boolean r1, int r2, int r3, int r4, long r5);

    public static void glGetnHistogramARB(@org.lwjgl.system.NativeType("GLenum") int r8, @org.lwjgl.system.NativeType("GLboolean") boolean r9, @org.lwjgl.system.NativeType("GLenum") int r10, @org.lwjgl.system.NativeType("GLenum") int r11, @org.lwjgl.system.NativeType("GLsizei") int r12, @org.lwjgl.system.NativeType("void *") long r13) {
            r0 = r8
            r1 = r9
            r2 = r10
            r3 = r11
            r4 = r12
            r5 = r13
            nglGetnHistogramARB(r0, r1, r2, r3, r4, r5)
            return
    }

    public static void glGetnHistogramARB(@org.lwjgl.system.NativeType("GLenum") int r8, @org.lwjgl.system.NativeType("GLboolean") boolean r9, @org.lwjgl.system.NativeType("GLenum") int r10, @org.lwjgl.system.NativeType("GLenum") int r11, @org.lwjgl.system.NativeType("void *") java.nio.ByteBuffer r12) {
            r0 = r8
            r1 = r9
            r2 = r10
            r3 = r11
            r4 = r12
            int r4 = r4.remaining()
            r5 = r12
            long r5 = org.lwjgl.system.MemoryUtil.memAddress(r5)
            nglGetnHistogramARB(r0, r1, r2, r3, r4, r5)
            return
    }

    public static native void nglGetnMinmaxARB(int r0, boolean r1, int r2, int r3, int r4, long r5);

    public static void glGetnMinmaxARB(@org.lwjgl.system.NativeType("GLenum") int r8, @org.lwjgl.system.NativeType("GLboolean") boolean r9, @org.lwjgl.system.NativeType("GLenum") int r10, @org.lwjgl.system.NativeType("GLenum") int r11, @org.lwjgl.system.NativeType("GLsizei") int r12, @org.lwjgl.system.NativeType("void *") long r13) {
            r0 = r8
            r1 = r9
            r2 = r10
            r3 = r11
            r4 = r12
            r5 = r13
            nglGetnMinmaxARB(r0, r1, r2, r3, r4, r5)
            return
    }

    public static void glGetnMinmaxARB(@org.lwjgl.system.NativeType("GLenum") int r8, @org.lwjgl.system.NativeType("GLboolean") boolean r9, @org.lwjgl.system.NativeType("GLenum") int r10, @org.lwjgl.system.NativeType("GLenum") int r11, @org.lwjgl.system.NativeType("void *") java.nio.ByteBuffer r12) {
            r0 = r8
            r1 = r9
            r2 = r10
            r3 = r11
            r4 = r12
            int r4 = r4.remaining()
            r5 = r12
            long r5 = org.lwjgl.system.MemoryUtil.memAddress(r5)
            nglGetnMinmaxARB(r0, r1, r2, r3, r4, r5)
            return
    }

    public static native void nglGetnCompressedTexImageARB(int r0, int r1, int r2, long r3);

    public static void glGetnCompressedTexImageARB(@org.lwjgl.system.NativeType("GLenum") int r6, @org.lwjgl.system.NativeType("GLint") int r7, @org.lwjgl.system.NativeType("GLsizei") int r8, @org.lwjgl.system.NativeType("void *") long r9) {
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            nglGetnCompressedTexImageARB(r0, r1, r2, r3)
            return
    }

    public static void glGetnCompressedTexImageARB(@org.lwjgl.system.NativeType("GLenum") int r6, @org.lwjgl.system.NativeType("GLint") int r7, @org.lwjgl.system.NativeType("void *") java.nio.ByteBuffer r8) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L17
            boolean r0 = org.lwjgl.system.Checks.DEBUG
            if (r0 == 0) goto L17
            r0 = r8
            r1 = r6
            r2 = r7
            r3 = 34464(0x86a0, float:4.8294E-41)
            int r1 = org.lwjgl.opengl.GL11.glGetTexLevelParameteri(r1, r2, r3)
            org.lwjgl.system.Checks.check(r0, r1)
        L17:
            r0 = r6
            r1 = r7
            r2 = r8
            int r2 = r2.remaining()
            r3 = r8
            long r3 = org.lwjgl.system.MemoryUtil.memAddress(r3)
            nglGetnCompressedTexImageARB(r0, r1, r2, r3)
            return
    }

    public static native void nglGetnUniformfvARB(int r0, int r1, int r2, long r3);

    public static void glGetnUniformfvARB(@org.lwjgl.system.NativeType("GLuint") int r6, @org.lwjgl.system.NativeType("GLint") int r7, @org.lwjgl.system.NativeType("GLfloat *") java.nio.FloatBuffer r8) {
            r0 = r6
            r1 = r7
            r2 = r8
            int r2 = r2.remaining()
            r3 = r8
            long r3 = org.lwjgl.system.MemoryUtil.memAddress(r3)
            nglGetnUniformfvARB(r0, r1, r2, r3)
            return
    }

    @org.lwjgl.system.NativeType("void")
    public static float glGetnUniformfARB(@org.lwjgl.system.NativeType("GLuint") int r6, @org.lwjgl.system.NativeType("GLint") int r7) {
            org.lwjgl.system.MemoryStack r0 = org.lwjgl.system.MemoryStack.stackGet()
            r8 = r0
            r0 = r8
            int r0 = r0.getPointer()
            r9 = r0
            r0 = r8
            r1 = 1
            java.nio.FloatBuffer r0 = r0.callocFloat(r1)     // Catch: java.lang.Throwable -> L2b
            r10 = r0
            r0 = r6
            r1 = r7
            r2 = 1
            r3 = r10
            long r3 = org.lwjgl.system.MemoryUtil.memAddress(r3)     // Catch: java.lang.Throwable -> L2b
            nglGetnUniformfvARB(r0, r1, r2, r3)     // Catch: java.lang.Throwable -> L2b
            r0 = r10
            r1 = 0
            float r0 = r0.get(r1)     // Catch: java.lang.Throwable -> L2b
            r11 = r0
            r0 = r8
            r1 = r9
            r0.setPointer(r1)
            r0 = r11
            return r0
        L2b:
            r12 = move-exception
            r0 = r8
            r1 = r9
            r0.setPointer(r1)
            r0 = r12
            throw r0
    }

    public static native void nglGetnUniformivARB(int r0, int r1, int r2, long r3);

    public static void glGetnUniformivARB(@org.lwjgl.system.NativeType("GLuint") int r6, @org.lwjgl.system.NativeType("GLint") int r7, @org.lwjgl.system.NativeType("GLint *") java.nio.IntBuffer r8) {
            r0 = r6
            r1 = r7
            r2 = r8
            int r2 = r2.remaining()
            r3 = r8
            long r3 = org.lwjgl.system.MemoryUtil.memAddress(r3)
            nglGetnUniformivARB(r0, r1, r2, r3)
            return
    }

    @org.lwjgl.system.NativeType("void")
    public static int glGetnUniformiARB(@org.lwjgl.system.NativeType("GLuint") int r6, @org.lwjgl.system.NativeType("GLint") int r7) {
            org.lwjgl.system.MemoryStack r0 = org.lwjgl.system.MemoryStack.stackGet()
            r8 = r0
            r0 = r8
            int r0 = r0.getPointer()
            r9 = r0
            r0 = r8
            r1 = 1
            java.nio.IntBuffer r0 = r0.callocInt(r1)     // Catch: java.lang.Throwable -> L2b
            r10 = r0
            r0 = r6
            r1 = r7
            r2 = 1
            r3 = r10
            long r3 = org.lwjgl.system.MemoryUtil.memAddress(r3)     // Catch: java.lang.Throwable -> L2b
            nglGetnUniformivARB(r0, r1, r2, r3)     // Catch: java.lang.Throwable -> L2b
            r0 = r10
            r1 = 0
            int r0 = r0.get(r1)     // Catch: java.lang.Throwable -> L2b
            r11 = r0
            r0 = r8
            r1 = r9
            r0.setPointer(r1)
            r0 = r11
            return r0
        L2b:
            r12 = move-exception
            r0 = r8
            r1 = r9
            r0.setPointer(r1)
            r0 = r12
            throw r0
    }

    public static native void nglGetnUniformuivARB(int r0, int r1, int r2, long r3);

    public static void glGetnUniformuivARB(@org.lwjgl.system.NativeType("GLuint") int r6, @org.lwjgl.system.NativeType("GLint") int r7, @org.lwjgl.system.NativeType("GLuint *") java.nio.IntBuffer r8) {
            r0 = r6
            r1 = r7
            r2 = r8
            int r2 = r2.remaining()
            r3 = r8
            long r3 = org.lwjgl.system.MemoryUtil.memAddress(r3)
            nglGetnUniformuivARB(r0, r1, r2, r3)
            return
    }

    @org.lwjgl.system.NativeType("void")
    public static int glGetnUniformuiARB(@org.lwjgl.system.NativeType("GLuint") int r6, @org.lwjgl.system.NativeType("GLint") int r7) {
            org.lwjgl.system.MemoryStack r0 = org.lwjgl.system.MemoryStack.stackGet()
            r8 = r0
            r0 = r8
            int r0 = r0.getPointer()
            r9 = r0
            r0 = r8
            r1 = 1
            java.nio.IntBuffer r0 = r0.callocInt(r1)     // Catch: java.lang.Throwable -> L2b
            r10 = r0
            r0 = r6
            r1 = r7
            r2 = 1
            r3 = r10
            long r3 = org.lwjgl.system.MemoryUtil.memAddress(r3)     // Catch: java.lang.Throwable -> L2b
            nglGetnUniformuivARB(r0, r1, r2, r3)     // Catch: java.lang.Throwable -> L2b
            r0 = r10
            r1 = 0
            int r0 = r0.get(r1)     // Catch: java.lang.Throwable -> L2b
            r11 = r0
            r0 = r8
            r1 = r9
            r0.setPointer(r1)
            r0 = r11
            return r0
        L2b:
            r12 = move-exception
            r0 = r8
            r1 = r9
            r0.setPointer(r1)
            r0 = r12
            throw r0
    }

    public static native void nglGetnUniformdvARB(int r0, int r1, int r2, long r3);

    public static void glGetnUniformdvARB(@org.lwjgl.system.NativeType("GLuint") int r6, @org.lwjgl.system.NativeType("GLint") int r7, @org.lwjgl.system.NativeType("GLdouble *") java.nio.DoubleBuffer r8) {
            r0 = r6
            r1 = r7
            r2 = r8
            int r2 = r2.remaining()
            r3 = r8
            long r3 = org.lwjgl.system.MemoryUtil.memAddress(r3)
            nglGetnUniformdvARB(r0, r1, r2, r3)
            return
    }

    @org.lwjgl.system.NativeType("void")
    public static double glGetnUniformdARB(@org.lwjgl.system.NativeType("GLuint") int r6, @org.lwjgl.system.NativeType("GLint") int r7) {
            org.lwjgl.system.MemoryStack r0 = org.lwjgl.system.MemoryStack.stackGet()
            r8 = r0
            r0 = r8
            int r0 = r0.getPointer()
            r9 = r0
            r0 = r8
            r1 = 1
            java.nio.DoubleBuffer r0 = r0.callocDouble(r1)     // Catch: java.lang.Throwable -> L2b
            r10 = r0
            r0 = r6
            r1 = r7
            r2 = 1
            r3 = r10
            long r3 = org.lwjgl.system.MemoryUtil.memAddress(r3)     // Catch: java.lang.Throwable -> L2b
            nglGetnUniformdvARB(r0, r1, r2, r3)     // Catch: java.lang.Throwable -> L2b
            r0 = r10
            r1 = 0
            double r0 = r0.get(r1)     // Catch: java.lang.Throwable -> L2b
            r11 = r0
            r0 = r8
            r1 = r9
            r0.setPointer(r1)
            r0 = r11
            return r0
        L2b:
            r13 = move-exception
            r0 = r8
            r1 = r9
            r0.setPointer(r1)
            r0 = r13
            throw r0
    }

    public static void glGetnMapdvARB(@org.lwjgl.system.NativeType("GLenum") int r7, @org.lwjgl.system.NativeType("GLenum") int r8, @org.lwjgl.system.NativeType("GLdouble *") double[] r9) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glGetnMapdvARB
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

    public static void glGetnMapfvARB(@org.lwjgl.system.NativeType("GLenum") int r7, @org.lwjgl.system.NativeType("GLenum") int r8, @org.lwjgl.system.NativeType("GLfloat *") float[] r9) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glGetnMapfvARB
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

    public static void glGetnMapivARB(@org.lwjgl.system.NativeType("GLenum") int r7, @org.lwjgl.system.NativeType("GLenum") int r8, @org.lwjgl.system.NativeType("GLint *") int[] r9) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glGetnMapivARB
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

    public static void glGetnPixelMapfvARB(@org.lwjgl.system.NativeType("GLenum") int r6, @org.lwjgl.system.NativeType("GLfloat *") float[] r7) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glGetnPixelMapfvARB
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

    public static void glGetnPixelMapuivARB(@org.lwjgl.system.NativeType("GLenum") int r6, @org.lwjgl.system.NativeType("GLuint *") int[] r7) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glGetnPixelMapuivARB
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

    public static void glGetnPixelMapusvARB(@org.lwjgl.system.NativeType("GLenum") int r6, @org.lwjgl.system.NativeType("GLushort *") short[] r7) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glGetnPixelMapusvARB
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

    public static void glGetnTexImageARB(@org.lwjgl.system.NativeType("GLenum") int r9, @org.lwjgl.system.NativeType("GLint") int r10, @org.lwjgl.system.NativeType("GLenum") int r11, @org.lwjgl.system.NativeType("GLenum") int r12, @org.lwjgl.system.NativeType("void *") short[] r13) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glGetnTexImageARB
            r14 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L14
            r0 = r14
            long r0 = org.lwjgl.system.Checks.check(r0)
        L14:
            r0 = r9
            r1 = r10
            r2 = r11
            r3 = r12
            r4 = r13
            int r4 = r4.length
            r5 = 1
            int r4 = r4 << r5
            r5 = r13
            r6 = r14
            org.lwjgl.system.JNI.callPV(r0, r1, r2, r3, r4, r5, r6)
            return
    }

    public static void glGetnTexImageARB(@org.lwjgl.system.NativeType("GLenum") int r9, @org.lwjgl.system.NativeType("GLint") int r10, @org.lwjgl.system.NativeType("GLenum") int r11, @org.lwjgl.system.NativeType("GLenum") int r12, @org.lwjgl.system.NativeType("void *") int[] r13) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glGetnTexImageARB
            r14 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L14
            r0 = r14
            long r0 = org.lwjgl.system.Checks.check(r0)
        L14:
            r0 = r9
            r1 = r10
            r2 = r11
            r3 = r12
            r4 = r13
            int r4 = r4.length
            r5 = 2
            int r4 = r4 << r5
            r5 = r13
            r6 = r14
            org.lwjgl.system.JNI.callPV(r0, r1, r2, r3, r4, r5, r6)
            return
    }

    public static void glGetnTexImageARB(@org.lwjgl.system.NativeType("GLenum") int r9, @org.lwjgl.system.NativeType("GLint") int r10, @org.lwjgl.system.NativeType("GLenum") int r11, @org.lwjgl.system.NativeType("GLenum") int r12, @org.lwjgl.system.NativeType("void *") float[] r13) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glGetnTexImageARB
            r14 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L14
            r0 = r14
            long r0 = org.lwjgl.system.Checks.check(r0)
        L14:
            r0 = r9
            r1 = r10
            r2 = r11
            r3 = r12
            r4 = r13
            int r4 = r4.length
            r5 = 2
            int r4 = r4 << r5
            r5 = r13
            r6 = r14
            org.lwjgl.system.JNI.callPV(r0, r1, r2, r3, r4, r5, r6)
            return
    }

    public static void glGetnTexImageARB(@org.lwjgl.system.NativeType("GLenum") int r9, @org.lwjgl.system.NativeType("GLint") int r10, @org.lwjgl.system.NativeType("GLenum") int r11, @org.lwjgl.system.NativeType("GLenum") int r12, @org.lwjgl.system.NativeType("void *") double[] r13) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glGetnTexImageARB
            r14 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L14
            r0 = r14
            long r0 = org.lwjgl.system.Checks.check(r0)
        L14:
            r0 = r9
            r1 = r10
            r2 = r11
            r3 = r12
            r4 = r13
            int r4 = r4.length
            r5 = 3
            int r4 = r4 << r5
            r5 = r13
            r6 = r14
            org.lwjgl.system.JNI.callPV(r0, r1, r2, r3, r4, r5, r6)
            return
    }

    public static void glReadnPixelsARB(@org.lwjgl.system.NativeType("GLint") int r11, @org.lwjgl.system.NativeType("GLint") int r12, @org.lwjgl.system.NativeType("GLsizei") int r13, @org.lwjgl.system.NativeType("GLsizei") int r14, @org.lwjgl.system.NativeType("GLenum") int r15, @org.lwjgl.system.NativeType("GLenum") int r16, @org.lwjgl.system.NativeType("void *") short[] r17) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glReadnPixelsARB
            r18 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L14
            r0 = r18
            long r0 = org.lwjgl.system.Checks.check(r0)
        L14:
            r0 = r11
            r1 = r12
            r2 = r13
            r3 = r14
            r4 = r15
            r5 = r16
            r6 = r17
            int r6 = r6.length
            r7 = 1
            int r6 = r6 << r7
            r7 = r17
            r8 = r18
            org.lwjgl.system.JNI.callPV(r0, r1, r2, r3, r4, r5, r6, r7, r8)
            return
    }

    public static void glReadnPixelsARB(@org.lwjgl.system.NativeType("GLint") int r11, @org.lwjgl.system.NativeType("GLint") int r12, @org.lwjgl.system.NativeType("GLsizei") int r13, @org.lwjgl.system.NativeType("GLsizei") int r14, @org.lwjgl.system.NativeType("GLenum") int r15, @org.lwjgl.system.NativeType("GLenum") int r16, @org.lwjgl.system.NativeType("void *") int[] r17) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glReadnPixelsARB
            r18 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L14
            r0 = r18
            long r0 = org.lwjgl.system.Checks.check(r0)
        L14:
            r0 = r11
            r1 = r12
            r2 = r13
            r3 = r14
            r4 = r15
            r5 = r16
            r6 = r17
            int r6 = r6.length
            r7 = 2
            int r6 = r6 << r7
            r7 = r17
            r8 = r18
            org.lwjgl.system.JNI.callPV(r0, r1, r2, r3, r4, r5, r6, r7, r8)
            return
    }

    public static void glReadnPixelsARB(@org.lwjgl.system.NativeType("GLint") int r11, @org.lwjgl.system.NativeType("GLint") int r12, @org.lwjgl.system.NativeType("GLsizei") int r13, @org.lwjgl.system.NativeType("GLsizei") int r14, @org.lwjgl.system.NativeType("GLenum") int r15, @org.lwjgl.system.NativeType("GLenum") int r16, @org.lwjgl.system.NativeType("void *") float[] r17) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glReadnPixelsARB
            r18 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L14
            r0 = r18
            long r0 = org.lwjgl.system.Checks.check(r0)
        L14:
            r0 = r11
            r1 = r12
            r2 = r13
            r3 = r14
            r4 = r15
            r5 = r16
            r6 = r17
            int r6 = r6.length
            r7 = 2
            int r6 = r6 << r7
            r7 = r17
            r8 = r18
            org.lwjgl.system.JNI.callPV(r0, r1, r2, r3, r4, r5, r6, r7, r8)
            return
    }

    public static void glGetnColorTableARB(@org.lwjgl.system.NativeType("GLenum") int r8, @org.lwjgl.system.NativeType("GLenum") int r9, @org.lwjgl.system.NativeType("GLenum") int r10, @org.lwjgl.system.NativeType("void *") short[] r11) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glGetnColorTableARB
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
            r4 = 1
            int r3 = r3 << r4
            r4 = r11
            r5 = r12
            org.lwjgl.system.JNI.callPV(r0, r1, r2, r3, r4, r5)
            return
    }

    public static void glGetnColorTableARB(@org.lwjgl.system.NativeType("GLenum") int r8, @org.lwjgl.system.NativeType("GLenum") int r9, @org.lwjgl.system.NativeType("GLenum") int r10, @org.lwjgl.system.NativeType("void *") int[] r11) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glGetnColorTableARB
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
            int r3 = r3 << r4
            r4 = r11
            r5 = r12
            org.lwjgl.system.JNI.callPV(r0, r1, r2, r3, r4, r5)
            return
    }

    public static void glGetnColorTableARB(@org.lwjgl.system.NativeType("GLenum") int r8, @org.lwjgl.system.NativeType("GLenum") int r9, @org.lwjgl.system.NativeType("GLenum") int r10, @org.lwjgl.system.NativeType("void *") float[] r11) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glGetnColorTableARB
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
            int r3 = r3 << r4
            r4 = r11
            r5 = r12
            org.lwjgl.system.JNI.callPV(r0, r1, r2, r3, r4, r5)
            return
    }

    public static void glGetnUniformfvARB(@org.lwjgl.system.NativeType("GLuint") int r7, @org.lwjgl.system.NativeType("GLint") int r8, @org.lwjgl.system.NativeType("GLfloat *") float[] r9) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glGetnUniformfvARB
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

    public static void glGetnUniformivARB(@org.lwjgl.system.NativeType("GLuint") int r7, @org.lwjgl.system.NativeType("GLint") int r8, @org.lwjgl.system.NativeType("GLint *") int[] r9) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glGetnUniformivARB
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

    public static void glGetnUniformuivARB(@org.lwjgl.system.NativeType("GLuint") int r7, @org.lwjgl.system.NativeType("GLint") int r8, @org.lwjgl.system.NativeType("GLuint *") int[] r9) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glGetnUniformuivARB
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

    public static void glGetnUniformdvARB(@org.lwjgl.system.NativeType("GLuint") int r7, @org.lwjgl.system.NativeType("GLint") int r8, @org.lwjgl.system.NativeType("GLdouble *") double[] r9) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glGetnUniformdvARB
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

    static {
            org.lwjgl.opengl.GL.initialize()
            return
    }
}
