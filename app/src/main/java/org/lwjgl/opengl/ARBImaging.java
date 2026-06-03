package org.lwjgl.opengl;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/opengl/ARBImaging.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/opengl/ARBImaging.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/opengl/ARBImaging.class */
public class ARBImaging {
    public static final int GL_COLOR_TABLE = 32976;
    public static final int GL_POST_CONVOLUTION_COLOR_TABLE = 32977;
    public static final int GL_POST_COLOR_MATRIX_COLOR_TABLE = 32978;
    public static final int GL_PROXY_COLOR_TABLE = 32979;
    public static final int GL_PROXY_POST_CONVOLUTION_COLOR_TABLE = 32980;
    public static final int GL_PROXY_POST_COLOR_MATRIX_COLOR_TABLE = 32981;
    public static final int GL_COLOR_TABLE_SCALE = 32982;
    public static final int GL_COLOR_TABLE_BIAS = 32983;
    public static final int GL_COLOR_TABLE_FORMAT = 32984;
    public static final int GL_COLOR_TABLE_WIDTH = 32985;
    public static final int GL_COLOR_TABLE_RED_SIZE = 32986;
    public static final int GL_COLOR_TABLE_GREEN_SIZE = 32987;
    public static final int GL_COLOR_TABLE_BLUE_SIZE = 32988;
    public static final int GL_COLOR_TABLE_ALPHA_SIZE = 32989;
    public static final int GL_COLOR_TABLE_LUMINANCE_SIZE = 32990;
    public static final int GL_COLOR_TABLE_INTENSITY_SIZE = 32991;
    public static final int GL_TABLE_TOO_LARGE = 32817;
    public static final int GL_CONVOLUTION_1D = 32784;
    public static final int GL_CONVOLUTION_2D = 32785;
    public static final int GL_SEPARABLE_2D = 32786;
    public static final int GL_CONVOLUTION_BORDER_MODE = 32787;
    public static final int GL_CONVOLUTION_FILTER_SCALE = 32788;
    public static final int GL_CONVOLUTION_FILTER_BIAS = 32789;
    public static final int GL_REDUCE = 32790;
    public static final int GL_CONVOLUTION_FORMAT = 32791;
    public static final int GL_CONVOLUTION_WIDTH = 32792;
    public static final int GL_CONVOLUTION_HEIGHT = 32793;
    public static final int GL_MAX_CONVOLUTION_WIDTH = 32794;
    public static final int GL_MAX_CONVOLUTION_HEIGHT = 32795;
    public static final int GL_POST_CONVOLUTION_RED_SCALE = 32796;
    public static final int GL_POST_CONVOLUTION_GREEN_SCALE = 32797;
    public static final int GL_POST_CONVOLUTION_BLUE_SCALE = 32798;
    public static final int GL_POST_CONVOLUTION_ALPHA_SCALE = 32799;
    public static final int GL_POST_CONVOLUTION_RED_BIAS = 32800;
    public static final int GL_POST_CONVOLUTION_GREEN_BIAS = 32801;
    public static final int GL_POST_CONVOLUTION_BLUE_BIAS = 32802;
    public static final int GL_POST_CONVOLUTION_ALPHA_BIAS = 32803;
    public static final int GL_CONSTANT_BORDER = 33105;
    public static final int GL_REPLICATE_BORDER = 33107;
    public static final int GL_CONVOLUTION_BORDER_COLOR = 33108;
    public static final int GL_COLOR_MATRIX = 32945;
    public static final int GL_COLOR_MATRIX_STACK_DEPTH = 32946;
    public static final int GL_MAX_COLOR_MATRIX_STACK_DEPTH = 32947;
    public static final int GL_POST_COLOR_MATRIX_RED_SCALE = 32948;
    public static final int GL_POST_COLOR_MATRIX_GREEN_SCALE = 32949;
    public static final int GL_POST_COLOR_MATRIX_BLUE_SCALE = 32950;
    public static final int GL_POST_COLOR_MATRIX_ALPHA_SCALE = 32951;
    public static final int GL_POST_COLOR_MATRIX_RED_BIAS = 32952;
    public static final int GL_POST_COLOR_MATRIX_GREEN_BIAS = 32953;
    public static final int GL_POST_COLOR_MATRIX_BLUE_BIAS = 32954;
    public static final int GL_POST_COLOR_MATRIX_ALPHA_BIAS = 32955;
    public static final int GL_HISTOGRAM = 32804;
    public static final int GL_PROXY_HISTOGRAM = 32805;
    public static final int GL_HISTOGRAM_WIDTH = 32806;
    public static final int GL_HISTOGRAM_FORMAT = 32807;
    public static final int GL_HISTOGRAM_RED_SIZE = 32808;
    public static final int GL_HISTOGRAM_GREEN_SIZE = 32809;
    public static final int GL_HISTOGRAM_BLUE_SIZE = 32810;
    public static final int GL_HISTOGRAM_ALPHA_SIZE = 32811;
    public static final int GL_HISTOGRAM_LUMINANCE_SIZE = 32812;
    public static final int GL_HISTOGRAM_SINK = 32813;
    public static final int GL_MINMAX = 32814;
    public static final int GL_MINMAX_FORMAT = 32815;
    public static final int GL_MINMAX_SINK = 32816;
    public static final int GL_CONSTANT_COLOR = 32769;
    public static final int GL_ONE_MINUS_CONSTANT_COLOR = 32770;
    public static final int GL_CONSTANT_ALPHA = 32771;
    public static final int GL_ONE_MINUS_CONSTANT_ALPHA = 32772;
    public static final int GL_BLEND_COLOR = 32773;
    public static final int GL_FUNC_ADD = 32774;
    public static final int GL_MIN = 32775;
    public static final int GL_MAX = 32776;
    public static final int GL_BLEND_EQUATION = 32777;
    public static final int GL_FUNC_SUBTRACT = 32778;
    public static final int GL_FUNC_REVERSE_SUBTRACT = 32779;

    protected ARBImaging() {
            r3 = this;
            r0 = r3
            r0.<init>()
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r1 = r0
            r1.<init>()
            throw r0
    }

    public static native void nglColorTable(int r0, int r1, int r2, int r3, int r4, long r5);

    public static void glColorTable(@org.lwjgl.system.NativeType("GLenum") int r8, @org.lwjgl.system.NativeType("GLenum") int r9, @org.lwjgl.system.NativeType("GLsizei") int r10, @org.lwjgl.system.NativeType("GLenum") int r11, @org.lwjgl.system.NativeType("GLenum") int r12, @org.lwjgl.system.NativeType("void const *") java.nio.ByteBuffer r13) {
            r0 = r8
            r1 = r9
            r2 = r10
            r3 = r11
            r4 = r12
            r5 = r13
            long r5 = org.lwjgl.system.MemoryUtil.memAddress(r5)
            nglColorTable(r0, r1, r2, r3, r4, r5)
            return
    }

    public static void glColorTable(@org.lwjgl.system.NativeType("GLenum") int r8, @org.lwjgl.system.NativeType("GLenum") int r9, @org.lwjgl.system.NativeType("GLsizei") int r10, @org.lwjgl.system.NativeType("GLenum") int r11, @org.lwjgl.system.NativeType("GLenum") int r12, @org.lwjgl.system.NativeType("void const *") long r13) {
            r0 = r8
            r1 = r9
            r2 = r10
            r3 = r11
            r4 = r12
            r5 = r13
            nglColorTable(r0, r1, r2, r3, r4, r5)
            return
    }

    public static void glColorTable(@org.lwjgl.system.NativeType("GLenum") int r8, @org.lwjgl.system.NativeType("GLenum") int r9, @org.lwjgl.system.NativeType("GLsizei") int r10, @org.lwjgl.system.NativeType("GLenum") int r11, @org.lwjgl.system.NativeType("GLenum") int r12, @org.lwjgl.system.NativeType("void const *") java.nio.ShortBuffer r13) {
            r0 = r8
            r1 = r9
            r2 = r10
            r3 = r11
            r4 = r12
            r5 = r13
            long r5 = org.lwjgl.system.MemoryUtil.memAddress(r5)
            nglColorTable(r0, r1, r2, r3, r4, r5)
            return
    }

    public static void glColorTable(@org.lwjgl.system.NativeType("GLenum") int r8, @org.lwjgl.system.NativeType("GLenum") int r9, @org.lwjgl.system.NativeType("GLsizei") int r10, @org.lwjgl.system.NativeType("GLenum") int r11, @org.lwjgl.system.NativeType("GLenum") int r12, @org.lwjgl.system.NativeType("void const *") java.nio.IntBuffer r13) {
            r0 = r8
            r1 = r9
            r2 = r10
            r3 = r11
            r4 = r12
            r5 = r13
            long r5 = org.lwjgl.system.MemoryUtil.memAddress(r5)
            nglColorTable(r0, r1, r2, r3, r4, r5)
            return
    }

    public static void glColorTable(@org.lwjgl.system.NativeType("GLenum") int r8, @org.lwjgl.system.NativeType("GLenum") int r9, @org.lwjgl.system.NativeType("GLsizei") int r10, @org.lwjgl.system.NativeType("GLenum") int r11, @org.lwjgl.system.NativeType("GLenum") int r12, @org.lwjgl.system.NativeType("void const *") java.nio.FloatBuffer r13) {
            r0 = r8
            r1 = r9
            r2 = r10
            r3 = r11
            r4 = r12
            r5 = r13
            long r5 = org.lwjgl.system.MemoryUtil.memAddress(r5)
            nglColorTable(r0, r1, r2, r3, r4, r5)
            return
    }

    public static native void glCopyColorTable(@org.lwjgl.system.NativeType("GLenum") int r0, @org.lwjgl.system.NativeType("GLenum") int r1, @org.lwjgl.system.NativeType("GLint") int r2, @org.lwjgl.system.NativeType("GLint") int r3, @org.lwjgl.system.NativeType("GLsizei") int r4);

    public static native void nglColorTableParameteriv(int r0, int r1, long r2);

    public static void glColorTableParameteriv(@org.lwjgl.system.NativeType("GLenum") int r5, @org.lwjgl.system.NativeType("GLenum") int r6, @org.lwjgl.system.NativeType("GLint const *") java.nio.IntBuffer r7) {
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
            nglColorTableParameteriv(r0, r1, r2)
            return
    }

    public static native void nglColorTableParameterfv(int r0, int r1, long r2);

    public static void glColorTableParameterfv(@org.lwjgl.system.NativeType("GLenum") int r5, @org.lwjgl.system.NativeType("GLenum") int r6, @org.lwjgl.system.NativeType("GLfloat const *") java.nio.FloatBuffer r7) {
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
            nglColorTableParameterfv(r0, r1, r2)
            return
    }

    public static native void nglGetColorTable(int r0, int r1, int r2, long r3);

    public static void glGetColorTable(@org.lwjgl.system.NativeType("GLenum") int r6, @org.lwjgl.system.NativeType("GLenum") int r7, @org.lwjgl.system.NativeType("GLenum") int r8, @org.lwjgl.system.NativeType("void *") java.nio.ByteBuffer r9) {
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            long r3 = org.lwjgl.system.MemoryUtil.memAddress(r3)
            nglGetColorTable(r0, r1, r2, r3)
            return
    }

    public static void glGetColorTable(@org.lwjgl.system.NativeType("GLenum") int r6, @org.lwjgl.system.NativeType("GLenum") int r7, @org.lwjgl.system.NativeType("GLenum") int r8, @org.lwjgl.system.NativeType("void *") long r9) {
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            nglGetColorTable(r0, r1, r2, r3)
            return
    }

    public static void glGetColorTable(@org.lwjgl.system.NativeType("GLenum") int r6, @org.lwjgl.system.NativeType("GLenum") int r7, @org.lwjgl.system.NativeType("GLenum") int r8, @org.lwjgl.system.NativeType("void *") java.nio.ShortBuffer r9) {
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            long r3 = org.lwjgl.system.MemoryUtil.memAddress(r3)
            nglGetColorTable(r0, r1, r2, r3)
            return
    }

    public static void glGetColorTable(@org.lwjgl.system.NativeType("GLenum") int r6, @org.lwjgl.system.NativeType("GLenum") int r7, @org.lwjgl.system.NativeType("GLenum") int r8, @org.lwjgl.system.NativeType("void *") java.nio.IntBuffer r9) {
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            long r3 = org.lwjgl.system.MemoryUtil.memAddress(r3)
            nglGetColorTable(r0, r1, r2, r3)
            return
    }

    public static void glGetColorTable(@org.lwjgl.system.NativeType("GLenum") int r6, @org.lwjgl.system.NativeType("GLenum") int r7, @org.lwjgl.system.NativeType("GLenum") int r8, @org.lwjgl.system.NativeType("void *") java.nio.FloatBuffer r9) {
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            long r3 = org.lwjgl.system.MemoryUtil.memAddress(r3)
            nglGetColorTable(r0, r1, r2, r3)
            return
    }

    public static native void nglGetColorTableParameteriv(int r0, int r1, long r2);

    public static void glGetColorTableParameteriv(@org.lwjgl.system.NativeType("GLenum") int r5, @org.lwjgl.system.NativeType("GLenum") int r6, @org.lwjgl.system.NativeType("GLint *") java.nio.IntBuffer r7) {
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
            nglGetColorTableParameteriv(r0, r1, r2)
            return
    }

    @org.lwjgl.system.NativeType("void")
    public static int glGetColorTableParameteri(@org.lwjgl.system.NativeType("GLenum") int r5, @org.lwjgl.system.NativeType("GLenum") int r6) {
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
            nglGetColorTableParameteriv(r0, r1, r2)     // Catch: java.lang.Throwable -> L2a
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

    public static native void nglGetColorTableParameterfv(int r0, int r1, long r2);

    public static void glGetColorTableParameterfv(@org.lwjgl.system.NativeType("GLenum") int r5, @org.lwjgl.system.NativeType("GLenum") int r6, @org.lwjgl.system.NativeType("GLfloat *") java.nio.FloatBuffer r7) {
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
            nglGetColorTableParameterfv(r0, r1, r2)
            return
    }

    @org.lwjgl.system.NativeType("void")
    public static float glGetColorTableParameterf(@org.lwjgl.system.NativeType("GLenum") int r5, @org.lwjgl.system.NativeType("GLenum") int r6) {
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
            nglGetColorTableParameterfv(r0, r1, r2)     // Catch: java.lang.Throwable -> L2a
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

    public static native void nglColorSubTable(int r0, int r1, int r2, int r3, int r4, long r5);

    public static void glColorSubTable(@org.lwjgl.system.NativeType("GLenum") int r8, @org.lwjgl.system.NativeType("GLsizei") int r9, @org.lwjgl.system.NativeType("GLsizei") int r10, @org.lwjgl.system.NativeType("GLenum") int r11, @org.lwjgl.system.NativeType("GLenum") int r12, @org.lwjgl.system.NativeType("void const *") java.nio.ByteBuffer r13) {
            r0 = r8
            r1 = r9
            r2 = r10
            r3 = r11
            r4 = r12
            r5 = r13
            long r5 = org.lwjgl.system.MemoryUtil.memAddress(r5)
            nglColorSubTable(r0, r1, r2, r3, r4, r5)
            return
    }

    public static void glColorSubTable(@org.lwjgl.system.NativeType("GLenum") int r8, @org.lwjgl.system.NativeType("GLsizei") int r9, @org.lwjgl.system.NativeType("GLsizei") int r10, @org.lwjgl.system.NativeType("GLenum") int r11, @org.lwjgl.system.NativeType("GLenum") int r12, @org.lwjgl.system.NativeType("void const *") long r13) {
            r0 = r8
            r1 = r9
            r2 = r10
            r3 = r11
            r4 = r12
            r5 = r13
            nglColorSubTable(r0, r1, r2, r3, r4, r5)
            return
    }

    public static native void glCopyColorSubTable(@org.lwjgl.system.NativeType("GLenum") int r0, @org.lwjgl.system.NativeType("GLsizei") int r1, @org.lwjgl.system.NativeType("GLint") int r2, @org.lwjgl.system.NativeType("GLint") int r3, @org.lwjgl.system.NativeType("GLsizei") int r4);

    public static native void nglConvolutionFilter1D(int r0, int r1, int r2, int r3, int r4, long r5);

    public static void glConvolutionFilter1D(@org.lwjgl.system.NativeType("GLenum") int r8, @org.lwjgl.system.NativeType("GLenum") int r9, @org.lwjgl.system.NativeType("GLsizei") int r10, @org.lwjgl.system.NativeType("GLenum") int r11, @org.lwjgl.system.NativeType("GLenum") int r12, @org.lwjgl.system.NativeType("void const *") java.nio.ByteBuffer r13) {
            r0 = r8
            r1 = r9
            r2 = r10
            r3 = r11
            r4 = r12
            r5 = r13
            long r5 = org.lwjgl.system.MemoryUtil.memAddress(r5)
            nglConvolutionFilter1D(r0, r1, r2, r3, r4, r5)
            return
    }

    public static void glConvolutionFilter1D(@org.lwjgl.system.NativeType("GLenum") int r8, @org.lwjgl.system.NativeType("GLenum") int r9, @org.lwjgl.system.NativeType("GLsizei") int r10, @org.lwjgl.system.NativeType("GLenum") int r11, @org.lwjgl.system.NativeType("GLenum") int r12, @org.lwjgl.system.NativeType("void const *") long r13) {
            r0 = r8
            r1 = r9
            r2 = r10
            r3 = r11
            r4 = r12
            r5 = r13
            nglConvolutionFilter1D(r0, r1, r2, r3, r4, r5)
            return
    }

    public static native void nglConvolutionFilter2D(int r0, int r1, int r2, int r3, int r4, int r5, long r6);

    public static void glConvolutionFilter2D(@org.lwjgl.system.NativeType("GLenum") int r9, @org.lwjgl.system.NativeType("GLenum") int r10, @org.lwjgl.system.NativeType("GLsizei") int r11, @org.lwjgl.system.NativeType("GLsizei") int r12, @org.lwjgl.system.NativeType("GLenum") int r13, @org.lwjgl.system.NativeType("GLenum") int r14, @org.lwjgl.system.NativeType("void const *") java.nio.ByteBuffer r15) {
            r0 = r9
            r1 = r10
            r2 = r11
            r3 = r12
            r4 = r13
            r5 = r14
            r6 = r15
            long r6 = org.lwjgl.system.MemoryUtil.memAddress(r6)
            nglConvolutionFilter2D(r0, r1, r2, r3, r4, r5, r6)
            return
    }

    public static void glConvolutionFilter2D(@org.lwjgl.system.NativeType("GLenum") int r9, @org.lwjgl.system.NativeType("GLenum") int r10, @org.lwjgl.system.NativeType("GLsizei") int r11, @org.lwjgl.system.NativeType("GLsizei") int r12, @org.lwjgl.system.NativeType("GLenum") int r13, @org.lwjgl.system.NativeType("GLenum") int r14, @org.lwjgl.system.NativeType("void const *") long r15) {
            r0 = r9
            r1 = r10
            r2 = r11
            r3 = r12
            r4 = r13
            r5 = r14
            r6 = r15
            nglConvolutionFilter2D(r0, r1, r2, r3, r4, r5, r6)
            return
    }

    public static native void glCopyConvolutionFilter1D(@org.lwjgl.system.NativeType("GLenum") int r0, @org.lwjgl.system.NativeType("GLenum") int r1, @org.lwjgl.system.NativeType("GLint") int r2, @org.lwjgl.system.NativeType("GLint") int r3, @org.lwjgl.system.NativeType("GLsizei") int r4);

    public static native void glCopyConvolutionFilter2D(@org.lwjgl.system.NativeType("GLenum") int r0, @org.lwjgl.system.NativeType("GLenum") int r1, @org.lwjgl.system.NativeType("GLint") int r2, @org.lwjgl.system.NativeType("GLint") int r3, @org.lwjgl.system.NativeType("GLsizei") int r4, @org.lwjgl.system.NativeType("GLsizei") int r5);

    public static native void nglGetConvolutionFilter(int r0, int r1, int r2, long r3);

    public static void glGetConvolutionFilter(@org.lwjgl.system.NativeType("GLenum") int r6, @org.lwjgl.system.NativeType("GLenum") int r7, @org.lwjgl.system.NativeType("GLenum") int r8, @org.lwjgl.system.NativeType("void *") java.nio.ByteBuffer r9) {
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            long r3 = org.lwjgl.system.MemoryUtil.memAddress(r3)
            nglGetConvolutionFilter(r0, r1, r2, r3)
            return
    }

    public static void glGetConvolutionFilter(@org.lwjgl.system.NativeType("GLenum") int r6, @org.lwjgl.system.NativeType("GLenum") int r7, @org.lwjgl.system.NativeType("GLenum") int r8, @org.lwjgl.system.NativeType("void *") long r9) {
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            nglGetConvolutionFilter(r0, r1, r2, r3)
            return
    }

    public static native void nglSeparableFilter2D(int r0, int r1, int r2, int r3, int r4, int r5, long r6, long r8);

    public static void glSeparableFilter2D(@org.lwjgl.system.NativeType("GLenum") int r11, @org.lwjgl.system.NativeType("GLenum") int r12, @org.lwjgl.system.NativeType("GLsizei") int r13, @org.lwjgl.system.NativeType("GLsizei") int r14, @org.lwjgl.system.NativeType("GLenum") int r15, @org.lwjgl.system.NativeType("GLenum") int r16, @org.lwjgl.system.NativeType("void const *") java.nio.ByteBuffer r17, @org.lwjgl.system.NativeType("void const *") java.nio.ByteBuffer r18) {
            r0 = r11
            r1 = r12
            r2 = r13
            r3 = r14
            r4 = r15
            r5 = r16
            r6 = r17
            long r6 = org.lwjgl.system.MemoryUtil.memAddress(r6)
            r7 = r18
            long r7 = org.lwjgl.system.MemoryUtil.memAddress(r7)
            nglSeparableFilter2D(r0, r1, r2, r3, r4, r5, r6, r7)
            return
    }

    public static void glSeparableFilter2D(@org.lwjgl.system.NativeType("GLenum") int r11, @org.lwjgl.system.NativeType("GLenum") int r12, @org.lwjgl.system.NativeType("GLsizei") int r13, @org.lwjgl.system.NativeType("GLsizei") int r14, @org.lwjgl.system.NativeType("GLenum") int r15, @org.lwjgl.system.NativeType("GLenum") int r16, @org.lwjgl.system.NativeType("void const *") long r17, @org.lwjgl.system.NativeType("void const *") long r19) {
            r0 = r11
            r1 = r12
            r2 = r13
            r3 = r14
            r4 = r15
            r5 = r16
            r6 = r17
            r7 = r19
            nglSeparableFilter2D(r0, r1, r2, r3, r4, r5, r6, r7)
            return
    }

    public static native void nglGetSeparableFilter(int r0, int r1, int r2, long r3, long r5, long r7);

    public static void glGetSeparableFilter(@org.lwjgl.system.NativeType("GLenum") int r10, @org.lwjgl.system.NativeType("GLenum") int r11, @org.lwjgl.system.NativeType("GLenum") int r12, @org.lwjgl.system.NativeType("void *") java.nio.ByteBuffer r13, @org.lwjgl.system.NativeType("void *") java.nio.ByteBuffer r14, @javax.annotation.Nullable @org.lwjgl.system.NativeType("void *") java.nio.ByteBuffer r15) {
            r0 = r10
            r1 = r11
            r2 = r12
            r3 = r13
            long r3 = org.lwjgl.system.MemoryUtil.memAddress(r3)
            r4 = r14
            long r4 = org.lwjgl.system.MemoryUtil.memAddress(r4)
            r5 = r15
            long r5 = org.lwjgl.system.MemoryUtil.memAddressSafe(r5)
            nglGetSeparableFilter(r0, r1, r2, r3, r4, r5)
            return
    }

    public static void glGetSeparableFilter(@org.lwjgl.system.NativeType("GLenum") int r10, @org.lwjgl.system.NativeType("GLenum") int r11, @org.lwjgl.system.NativeType("GLenum") int r12, @org.lwjgl.system.NativeType("void *") long r13, @org.lwjgl.system.NativeType("void *") long r15, @javax.annotation.Nullable @org.lwjgl.system.NativeType("void *") java.nio.ByteBuffer r17) {
            r0 = r10
            r1 = r11
            r2 = r12
            r3 = r13
            r4 = r15
            r5 = r17
            long r5 = org.lwjgl.system.MemoryUtil.memAddressSafe(r5)
            nglGetSeparableFilter(r0, r1, r2, r3, r4, r5)
            return
    }

    public static native void glConvolutionParameteri(@org.lwjgl.system.NativeType("GLenum") int r0, @org.lwjgl.system.NativeType("GLenum") int r1, @org.lwjgl.system.NativeType("GLint") int r2);

    public static native void nglConvolutionParameteriv(int r0, int r1, long r2);

    public static void glConvolutionParameteriv(@org.lwjgl.system.NativeType("GLenum") int r5, @org.lwjgl.system.NativeType("GLenum") int r6, @org.lwjgl.system.NativeType("GLint const *") java.nio.IntBuffer r7) {
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
            nglConvolutionParameteriv(r0, r1, r2)
            return
    }

    public static native void glConvolutionParameterf(@org.lwjgl.system.NativeType("GLenum") int r0, @org.lwjgl.system.NativeType("GLenum") int r1, @org.lwjgl.system.NativeType("GLfloat") float r2);

    public static native void nglConvolutionParameterfv(int r0, int r1, long r2);

    public static void glConvolutionParameterfv(@org.lwjgl.system.NativeType("GLenum") int r5, @org.lwjgl.system.NativeType("GLenum") int r6, @org.lwjgl.system.NativeType("GLfloat const *") java.nio.FloatBuffer r7) {
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
            nglConvolutionParameterfv(r0, r1, r2)
            return
    }

    public static native void nglGetConvolutionParameteriv(int r0, int r1, long r2);

    public static void glGetConvolutionParameteriv(@org.lwjgl.system.NativeType("GLenum") int r5, @org.lwjgl.system.NativeType("GLenum") int r6, @org.lwjgl.system.NativeType("GLint *") java.nio.IntBuffer r7) {
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
            nglGetConvolutionParameteriv(r0, r1, r2)
            return
    }

    @org.lwjgl.system.NativeType("void")
    public static int glGetConvolutionParameteri(@org.lwjgl.system.NativeType("GLenum") int r5, @org.lwjgl.system.NativeType("GLenum") int r6) {
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
            nglGetConvolutionParameteriv(r0, r1, r2)     // Catch: java.lang.Throwable -> L2a
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

    public static native void nglGetConvolutionParameterfv(int r0, int r1, long r2);

    public static void glGetConvolutionParameterfv(@org.lwjgl.system.NativeType("GLenum") int r5, @org.lwjgl.system.NativeType("GLenum") int r6, @org.lwjgl.system.NativeType("GLfloat *") java.nio.FloatBuffer r7) {
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
            nglGetConvolutionParameterfv(r0, r1, r2)
            return
    }

    @org.lwjgl.system.NativeType("void")
    public static float glGetConvolutionParameterf(@org.lwjgl.system.NativeType("GLenum") int r5, @org.lwjgl.system.NativeType("GLenum") int r6) {
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
            nglGetConvolutionParameterfv(r0, r1, r2)     // Catch: java.lang.Throwable -> L2a
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

    public static native void glHistogram(@org.lwjgl.system.NativeType("GLenum") int r0, @org.lwjgl.system.NativeType("GLsizei") int r1, @org.lwjgl.system.NativeType("GLenum") int r2, @org.lwjgl.system.NativeType("GLboolean") boolean r3);

    public static native void glResetHistogram(@org.lwjgl.system.NativeType("GLenum") int r0);

    public static native void nglGetHistogram(int r0, boolean r1, int r2, int r3, long r4);

    public static void glGetHistogram(@org.lwjgl.system.NativeType("GLenum") int r7, @org.lwjgl.system.NativeType("GLboolean") boolean r8, @org.lwjgl.system.NativeType("GLenum") int r9, @org.lwjgl.system.NativeType("GLenum") int r10, @org.lwjgl.system.NativeType("void *") java.nio.ByteBuffer r11) {
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            long r4 = org.lwjgl.system.MemoryUtil.memAddress(r4)
            nglGetHistogram(r0, r1, r2, r3, r4)
            return
    }

    public static void glGetHistogram(@org.lwjgl.system.NativeType("GLenum") int r7, @org.lwjgl.system.NativeType("GLboolean") boolean r8, @org.lwjgl.system.NativeType("GLenum") int r9, @org.lwjgl.system.NativeType("GLenum") int r10, @org.lwjgl.system.NativeType("void *") long r11) {
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            nglGetHistogram(r0, r1, r2, r3, r4)
            return
    }

    public static native void nglGetHistogramParameteriv(int r0, int r1, long r2);

    public static void glGetHistogramParameteriv(@org.lwjgl.system.NativeType("GLenum") int r5, @org.lwjgl.system.NativeType("GLenum") int r6, @org.lwjgl.system.NativeType("GLint *") java.nio.IntBuffer r7) {
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
            nglGetHistogramParameteriv(r0, r1, r2)
            return
    }

    @org.lwjgl.system.NativeType("void")
    public static int glGetHistogramParameteri(@org.lwjgl.system.NativeType("GLenum") int r5, @org.lwjgl.system.NativeType("GLenum") int r6) {
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
            nglGetHistogramParameteriv(r0, r1, r2)     // Catch: java.lang.Throwable -> L2a
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

    public static native void nglGetHistogramParameterfv(int r0, int r1, long r2);

    public static void glGetHistogramParameterfv(@org.lwjgl.system.NativeType("GLenum") int r5, @org.lwjgl.system.NativeType("GLenum") int r6, @org.lwjgl.system.NativeType("GLfloat *") java.nio.FloatBuffer r7) {
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
            nglGetHistogramParameterfv(r0, r1, r2)
            return
    }

    @org.lwjgl.system.NativeType("void")
    public static float glGetHistogramParameterf(@org.lwjgl.system.NativeType("GLenum") int r5, @org.lwjgl.system.NativeType("GLenum") int r6) {
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
            nglGetHistogramParameterfv(r0, r1, r2)     // Catch: java.lang.Throwable -> L2a
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

    public static native void glMinmax(@org.lwjgl.system.NativeType("GLenum") int r0, @org.lwjgl.system.NativeType("GLenum") int r1, @org.lwjgl.system.NativeType("GLboolean") boolean r2);

    public static native void glResetMinmax(@org.lwjgl.system.NativeType("GLenum") int r0);

    public static native void nglGetMinmax(int r0, boolean r1, int r2, int r3, long r4);

    public static void glGetMinmax(@org.lwjgl.system.NativeType("GLenum") int r7, @org.lwjgl.system.NativeType("GLboolean") boolean r8, @org.lwjgl.system.NativeType("GLenum") int r9, @org.lwjgl.system.NativeType("GLenum") int r10, @org.lwjgl.system.NativeType("void *") java.nio.ByteBuffer r11) {
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            long r4 = org.lwjgl.system.MemoryUtil.memAddress(r4)
            nglGetMinmax(r0, r1, r2, r3, r4)
            return
    }

    public static void glGetMinmax(@org.lwjgl.system.NativeType("GLenum") int r7, @org.lwjgl.system.NativeType("GLboolean") boolean r8, @org.lwjgl.system.NativeType("GLenum") int r9, @org.lwjgl.system.NativeType("GLenum") int r10, @org.lwjgl.system.NativeType("void *") long r11) {
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            nglGetMinmax(r0, r1, r2, r3, r4)
            return
    }

    public static native void nglGetMinmaxParameteriv(int r0, int r1, long r2);

    public static void glGetMinmaxParameteriv(@org.lwjgl.system.NativeType("GLenum") int r5, @org.lwjgl.system.NativeType("GLenum") int r6, @org.lwjgl.system.NativeType("GLint *") java.nio.IntBuffer r7) {
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
            nglGetMinmaxParameteriv(r0, r1, r2)
            return
    }

    @org.lwjgl.system.NativeType("void")
    public static int glGetMinmaxParameteri(@org.lwjgl.system.NativeType("GLenum") int r5, @org.lwjgl.system.NativeType("GLenum") int r6) {
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
            nglGetMinmaxParameteriv(r0, r1, r2)     // Catch: java.lang.Throwable -> L2a
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

    public static native void nglGetMinmaxParameterfv(int r0, int r1, long r2);

    public static void glGetMinmaxParameterfv(@org.lwjgl.system.NativeType("GLenum") int r5, @org.lwjgl.system.NativeType("GLenum") int r6, @org.lwjgl.system.NativeType("GLfloat *") java.nio.FloatBuffer r7) {
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
            nglGetMinmaxParameterfv(r0, r1, r2)
            return
    }

    @org.lwjgl.system.NativeType("void")
    public static float glGetMinmaxParameterf(@org.lwjgl.system.NativeType("GLenum") int r5, @org.lwjgl.system.NativeType("GLenum") int r6) {
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
            nglGetMinmaxParameterfv(r0, r1, r2)     // Catch: java.lang.Throwable -> L2a
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

    public static void glBlendColor(@org.lwjgl.system.NativeType("GLfloat") float r5, @org.lwjgl.system.NativeType("GLfloat") float r6, @org.lwjgl.system.NativeType("GLfloat") float r7, @org.lwjgl.system.NativeType("GLfloat") float r8) {
            r0 = r5
            r1 = r6
            r2 = r7
            r3 = r8
            org.lwjgl.opengl.GL14C.glBlendColor(r0, r1, r2, r3)
            return
    }

    public static void glBlendEquation(@org.lwjgl.system.NativeType("GLenum") int r2) {
            r0 = r2
            org.lwjgl.opengl.GL14C.glBlendEquation(r0)
            return
    }

    public static void glColorTable(@org.lwjgl.system.NativeType("GLenum") int r9, @org.lwjgl.system.NativeType("GLenum") int r10, @org.lwjgl.system.NativeType("GLsizei") int r11, @org.lwjgl.system.NativeType("GLenum") int r12, @org.lwjgl.system.NativeType("GLenum") int r13, @org.lwjgl.system.NativeType("void const *") short[] r14) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glColorTable
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

    public static void glColorTable(@org.lwjgl.system.NativeType("GLenum") int r9, @org.lwjgl.system.NativeType("GLenum") int r10, @org.lwjgl.system.NativeType("GLsizei") int r11, @org.lwjgl.system.NativeType("GLenum") int r12, @org.lwjgl.system.NativeType("GLenum") int r13, @org.lwjgl.system.NativeType("void const *") int[] r14) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glColorTable
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

    public static void glColorTable(@org.lwjgl.system.NativeType("GLenum") int r9, @org.lwjgl.system.NativeType("GLenum") int r10, @org.lwjgl.system.NativeType("GLsizei") int r11, @org.lwjgl.system.NativeType("GLenum") int r12, @org.lwjgl.system.NativeType("GLenum") int r13, @org.lwjgl.system.NativeType("void const *") float[] r14) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glColorTable
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

    public static void glColorTableParameteriv(@org.lwjgl.system.NativeType("GLenum") int r6, @org.lwjgl.system.NativeType("GLenum") int r7, @org.lwjgl.system.NativeType("GLint const *") int[] r8) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glColorTableParameteriv
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

    public static void glColorTableParameterfv(@org.lwjgl.system.NativeType("GLenum") int r6, @org.lwjgl.system.NativeType("GLenum") int r7, @org.lwjgl.system.NativeType("GLfloat const *") float[] r8) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glColorTableParameterfv
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

    public static void glGetColorTable(@org.lwjgl.system.NativeType("GLenum") int r7, @org.lwjgl.system.NativeType("GLenum") int r8, @org.lwjgl.system.NativeType("GLenum") int r9, @org.lwjgl.system.NativeType("void *") short[] r10) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glGetColorTable
            r11 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L14
            r0 = r11
            long r0 = org.lwjgl.system.Checks.check(r0)
        L14:
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            org.lwjgl.system.JNI.callPV(r0, r1, r2, r3, r4)
            return
    }

    public static void glGetColorTable(@org.lwjgl.system.NativeType("GLenum") int r7, @org.lwjgl.system.NativeType("GLenum") int r8, @org.lwjgl.system.NativeType("GLenum") int r9, @org.lwjgl.system.NativeType("void *") int[] r10) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glGetColorTable
            r11 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L14
            r0 = r11
            long r0 = org.lwjgl.system.Checks.check(r0)
        L14:
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            org.lwjgl.system.JNI.callPV(r0, r1, r2, r3, r4)
            return
    }

    public static void glGetColorTable(@org.lwjgl.system.NativeType("GLenum") int r7, @org.lwjgl.system.NativeType("GLenum") int r8, @org.lwjgl.system.NativeType("GLenum") int r9, @org.lwjgl.system.NativeType("void *") float[] r10) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glGetColorTable
            r11 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L14
            r0 = r11
            long r0 = org.lwjgl.system.Checks.check(r0)
        L14:
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            org.lwjgl.system.JNI.callPV(r0, r1, r2, r3, r4)
            return
    }

    public static void glGetColorTableParameteriv(@org.lwjgl.system.NativeType("GLenum") int r6, @org.lwjgl.system.NativeType("GLenum") int r7, @org.lwjgl.system.NativeType("GLint *") int[] r8) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glGetColorTableParameteriv
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

    public static void glGetColorTableParameterfv(@org.lwjgl.system.NativeType("GLenum") int r6, @org.lwjgl.system.NativeType("GLenum") int r7, @org.lwjgl.system.NativeType("GLfloat *") float[] r8) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glGetColorTableParameterfv
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

    public static void glConvolutionParameteriv(@org.lwjgl.system.NativeType("GLenum") int r6, @org.lwjgl.system.NativeType("GLenum") int r7, @org.lwjgl.system.NativeType("GLint const *") int[] r8) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glConvolutionParameteriv
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

    public static void glConvolutionParameterfv(@org.lwjgl.system.NativeType("GLenum") int r6, @org.lwjgl.system.NativeType("GLenum") int r7, @org.lwjgl.system.NativeType("GLfloat const *") float[] r8) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glConvolutionParameterfv
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

    public static void glGetConvolutionParameteriv(@org.lwjgl.system.NativeType("GLenum") int r6, @org.lwjgl.system.NativeType("GLenum") int r7, @org.lwjgl.system.NativeType("GLint *") int[] r8) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glGetConvolutionParameteriv
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

    public static void glGetConvolutionParameterfv(@org.lwjgl.system.NativeType("GLenum") int r6, @org.lwjgl.system.NativeType("GLenum") int r7, @org.lwjgl.system.NativeType("GLfloat *") float[] r8) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glGetConvolutionParameterfv
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

    public static void glGetHistogramParameteriv(@org.lwjgl.system.NativeType("GLenum") int r6, @org.lwjgl.system.NativeType("GLenum") int r7, @org.lwjgl.system.NativeType("GLint *") int[] r8) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glGetHistogramParameteriv
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

    public static void glGetHistogramParameterfv(@org.lwjgl.system.NativeType("GLenum") int r6, @org.lwjgl.system.NativeType("GLenum") int r7, @org.lwjgl.system.NativeType("GLfloat *") float[] r8) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glGetHistogramParameterfv
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

    public static void glGetMinmaxParameteriv(@org.lwjgl.system.NativeType("GLenum") int r6, @org.lwjgl.system.NativeType("GLenum") int r7, @org.lwjgl.system.NativeType("GLint *") int[] r8) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glGetMinmaxParameteriv
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

    public static void glGetMinmaxParameterfv(@org.lwjgl.system.NativeType("GLenum") int r6, @org.lwjgl.system.NativeType("GLenum") int r7, @org.lwjgl.system.NativeType("GLfloat *") float[] r8) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glGetMinmaxParameterfv
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

    static {
            org.lwjgl.opengl.GL.initialize()
            return
    }
}
