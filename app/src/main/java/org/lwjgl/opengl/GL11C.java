package org.lwjgl.opengl;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/opengl/GL11C.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/opengl/GL11C.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/opengl/GL11C.class */
public class GL11C {
    public static final int GL_NEVER = 512;
    public static final int GL_LESS = 513;
    public static final int GL_EQUAL = 514;
    public static final int GL_LEQUAL = 515;
    public static final int GL_GREATER = 516;
    public static final int GL_NOTEQUAL = 517;
    public static final int GL_GEQUAL = 518;
    public static final int GL_ALWAYS = 519;
    public static final int GL_DEPTH_BUFFER_BIT = 256;
    public static final int GL_STENCIL_BUFFER_BIT = 1024;
    public static final int GL_COLOR_BUFFER_BIT = 16384;
    public static final int GL_POINTS = 0;
    public static final int GL_LINES = 1;
    public static final int GL_LINE_LOOP = 2;
    public static final int GL_LINE_STRIP = 3;
    public static final int GL_TRIANGLES = 4;
    public static final int GL_TRIANGLE_STRIP = 5;
    public static final int GL_TRIANGLE_FAN = 6;
    public static final int GL_QUADS = 7;
    public static final int GL_ZERO = 0;
    public static final int GL_ONE = 1;
    public static final int GL_SRC_COLOR = 768;
    public static final int GL_ONE_MINUS_SRC_COLOR = 769;
    public static final int GL_SRC_ALPHA = 770;
    public static final int GL_ONE_MINUS_SRC_ALPHA = 771;
    public static final int GL_DST_ALPHA = 772;
    public static final int GL_ONE_MINUS_DST_ALPHA = 773;
    public static final int GL_DST_COLOR = 774;
    public static final int GL_ONE_MINUS_DST_COLOR = 775;
    public static final int GL_SRC_ALPHA_SATURATE = 776;
    public static final int GL_TRUE = 1;
    public static final int GL_FALSE = 0;
    public static final int GL_BYTE = 5120;
    public static final int GL_UNSIGNED_BYTE = 5121;
    public static final int GL_SHORT = 5122;
    public static final int GL_UNSIGNED_SHORT = 5123;
    public static final int GL_INT = 5124;
    public static final int GL_UNSIGNED_INT = 5125;
    public static final int GL_FLOAT = 5126;
    public static final int GL_DOUBLE = 5130;
    public static final int GL_NONE = 0;
    public static final int GL_FRONT_LEFT = 1024;
    public static final int GL_FRONT_RIGHT = 1025;
    public static final int GL_BACK_LEFT = 1026;
    public static final int GL_BACK_RIGHT = 1027;
    public static final int GL_FRONT = 1028;
    public static final int GL_BACK = 1029;
    public static final int GL_LEFT = 1030;
    public static final int GL_RIGHT = 1031;
    public static final int GL_FRONT_AND_BACK = 1032;
    public static final int GL_NO_ERROR = 0;
    public static final int GL_INVALID_ENUM = 1280;
    public static final int GL_INVALID_VALUE = 1281;
    public static final int GL_INVALID_OPERATION = 1282;
    public static final int GL_STACK_OVERFLOW = 1283;
    public static final int GL_STACK_UNDERFLOW = 1284;
    public static final int GL_OUT_OF_MEMORY = 1285;
    public static final int GL_CW = 2304;
    public static final int GL_CCW = 2305;
    public static final int GL_POINT_SIZE = 2833;
    public static final int GL_POINT_SIZE_RANGE = 2834;
    public static final int GL_POINT_SIZE_GRANULARITY = 2835;
    public static final int GL_LINE_SMOOTH = 2848;
    public static final int GL_LINE_WIDTH = 2849;
    public static final int GL_LINE_WIDTH_RANGE = 2850;
    public static final int GL_LINE_WIDTH_GRANULARITY = 2851;
    public static final int GL_POLYGON_MODE = 2880;
    public static final int GL_POLYGON_SMOOTH = 2881;
    public static final int GL_CULL_FACE = 2884;
    public static final int GL_CULL_FACE_MODE = 2885;
    public static final int GL_FRONT_FACE = 2886;
    public static final int GL_DEPTH_RANGE = 2928;
    public static final int GL_DEPTH_TEST = 2929;
    public static final int GL_DEPTH_WRITEMASK = 2930;
    public static final int GL_DEPTH_CLEAR_VALUE = 2931;
    public static final int GL_DEPTH_FUNC = 2932;
    public static final int GL_STENCIL_TEST = 2960;
    public static final int GL_STENCIL_CLEAR_VALUE = 2961;
    public static final int GL_STENCIL_FUNC = 2962;
    public static final int GL_STENCIL_VALUE_MASK = 2963;
    public static final int GL_STENCIL_FAIL = 2964;
    public static final int GL_STENCIL_PASS_DEPTH_FAIL = 2965;
    public static final int GL_STENCIL_PASS_DEPTH_PASS = 2966;
    public static final int GL_STENCIL_REF = 2967;
    public static final int GL_STENCIL_WRITEMASK = 2968;
    public static final int GL_VIEWPORT = 2978;
    public static final int GL_DITHER = 3024;
    public static final int GL_BLEND_DST = 3040;
    public static final int GL_BLEND_SRC = 3041;
    public static final int GL_BLEND = 3042;
    public static final int GL_LOGIC_OP_MODE = 3056;
    public static final int GL_COLOR_LOGIC_OP = 3058;
    public static final int GL_DRAW_BUFFER = 3073;
    public static final int GL_READ_BUFFER = 3074;
    public static final int GL_SCISSOR_BOX = 3088;
    public static final int GL_SCISSOR_TEST = 3089;
    public static final int GL_COLOR_CLEAR_VALUE = 3106;
    public static final int GL_COLOR_WRITEMASK = 3107;
    public static final int GL_DOUBLEBUFFER = 3122;
    public static final int GL_STEREO = 3123;
    public static final int GL_LINE_SMOOTH_HINT = 3154;
    public static final int GL_POLYGON_SMOOTH_HINT = 3155;
    public static final int GL_UNPACK_SWAP_BYTES = 3312;
    public static final int GL_UNPACK_LSB_FIRST = 3313;
    public static final int GL_UNPACK_ROW_LENGTH = 3314;
    public static final int GL_UNPACK_SKIP_ROWS = 3315;
    public static final int GL_UNPACK_SKIP_PIXELS = 3316;
    public static final int GL_UNPACK_ALIGNMENT = 3317;
    public static final int GL_PACK_SWAP_BYTES = 3328;
    public static final int GL_PACK_LSB_FIRST = 3329;
    public static final int GL_PACK_ROW_LENGTH = 3330;
    public static final int GL_PACK_SKIP_ROWS = 3331;
    public static final int GL_PACK_SKIP_PIXELS = 3332;
    public static final int GL_PACK_ALIGNMENT = 3333;
    public static final int GL_MAX_TEXTURE_SIZE = 3379;
    public static final int GL_MAX_VIEWPORT_DIMS = 3386;
    public static final int GL_SUBPIXEL_BITS = 3408;
    public static final int GL_TEXTURE_1D = 3552;
    public static final int GL_TEXTURE_2D = 3553;
    public static final int GL_TEXTURE_WIDTH = 4096;
    public static final int GL_TEXTURE_HEIGHT = 4097;
    public static final int GL_TEXTURE_INTERNAL_FORMAT = 4099;
    public static final int GL_TEXTURE_BORDER_COLOR = 4100;
    public static final int GL_DONT_CARE = 4352;
    public static final int GL_FASTEST = 4353;
    public static final int GL_NICEST = 4354;
    public static final int GL_CLEAR = 5376;
    public static final int GL_AND = 5377;
    public static final int GL_AND_REVERSE = 5378;
    public static final int GL_COPY = 5379;
    public static final int GL_AND_INVERTED = 5380;
    public static final int GL_NOOP = 5381;
    public static final int GL_XOR = 5382;
    public static final int GL_OR = 5383;
    public static final int GL_NOR = 5384;
    public static final int GL_EQUIV = 5385;
    public static final int GL_INVERT = 5386;
    public static final int GL_OR_REVERSE = 5387;
    public static final int GL_COPY_INVERTED = 5388;
    public static final int GL_OR_INVERTED = 5389;
    public static final int GL_NAND = 5390;
    public static final int GL_SET = 5391;
    public static final int GL_TEXTURE = 5890;
    public static final int GL_COLOR = 6144;
    public static final int GL_DEPTH = 6145;
    public static final int GL_STENCIL = 6146;
    public static final int GL_STENCIL_INDEX = 6401;
    public static final int GL_DEPTH_COMPONENT = 6402;
    public static final int GL_RED = 6403;
    public static final int GL_GREEN = 6404;
    public static final int GL_BLUE = 6405;
    public static final int GL_ALPHA = 6406;
    public static final int GL_RGB = 6407;
    public static final int GL_RGBA = 6408;
    public static final int GL_POINT = 6912;
    public static final int GL_LINE = 6913;
    public static final int GL_FILL = 6914;
    public static final int GL_KEEP = 7680;
    public static final int GL_REPLACE = 7681;
    public static final int GL_INCR = 7682;
    public static final int GL_DECR = 7683;
    public static final int GL_VENDOR = 7936;
    public static final int GL_RENDERER = 7937;
    public static final int GL_VERSION = 7938;
    public static final int GL_EXTENSIONS = 7939;
    public static final int GL_NEAREST = 9728;
    public static final int GL_LINEAR = 9729;
    public static final int GL_NEAREST_MIPMAP_NEAREST = 9984;
    public static final int GL_LINEAR_MIPMAP_NEAREST = 9985;
    public static final int GL_NEAREST_MIPMAP_LINEAR = 9986;
    public static final int GL_LINEAR_MIPMAP_LINEAR = 9987;
    public static final int GL_TEXTURE_MAG_FILTER = 10240;
    public static final int GL_TEXTURE_MIN_FILTER = 10241;
    public static final int GL_TEXTURE_WRAP_S = 10242;
    public static final int GL_TEXTURE_WRAP_T = 10243;
    public static final int GL_REPEAT = 10497;
    public static final int GL_POLYGON_OFFSET_FACTOR = 32824;
    public static final int GL_POLYGON_OFFSET_UNITS = 10752;
    public static final int GL_POLYGON_OFFSET_POINT = 10753;
    public static final int GL_POLYGON_OFFSET_LINE = 10754;
    public static final int GL_POLYGON_OFFSET_FILL = 32823;
    public static final int GL_R3_G3_B2 = 10768;
    public static final int GL_RGB4 = 32847;
    public static final int GL_RGB5 = 32848;
    public static final int GL_RGB8 = 32849;
    public static final int GL_RGB10 = 32850;
    public static final int GL_RGB12 = 32851;
    public static final int GL_RGB16 = 32852;
    public static final int GL_RGBA2 = 32853;
    public static final int GL_RGBA4 = 32854;
    public static final int GL_RGB5_A1 = 32855;
    public static final int GL_RGBA8 = 32856;
    public static final int GL_RGB10_A2 = 32857;
    public static final int GL_RGBA12 = 32858;
    public static final int GL_RGBA16 = 32859;
    public static final int GL_TEXTURE_RED_SIZE = 32860;
    public static final int GL_TEXTURE_GREEN_SIZE = 32861;
    public static final int GL_TEXTURE_BLUE_SIZE = 32862;
    public static final int GL_TEXTURE_ALPHA_SIZE = 32863;
    public static final int GL_PROXY_TEXTURE_1D = 32867;
    public static final int GL_PROXY_TEXTURE_2D = 32868;
    public static final int GL_TEXTURE_BINDING_1D = 32872;
    public static final int GL_TEXTURE_BINDING_2D = 32873;
    public static final int GL_VERTEX_ARRAY = 32884;

    protected GL11C() {
            r3 = this;
            r0 = r3
            r0.<init>()
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r1 = r0
            r1.<init>()
            throw r0
    }

    public static native void glEnable(@org.lwjgl.system.NativeType("GLenum") int r0);

    public static native void glDisable(@org.lwjgl.system.NativeType("GLenum") int r0);

    public static native void glBindTexture(@org.lwjgl.system.NativeType("GLenum") int r0, @org.lwjgl.system.NativeType("GLuint") int r1);

    public static native void glBlendFunc(@org.lwjgl.system.NativeType("GLenum") int r0, @org.lwjgl.system.NativeType("GLenum") int r1);

    public static native void glClear(@org.lwjgl.system.NativeType("GLbitfield") int r0);

    public static native void glClearColor(@org.lwjgl.system.NativeType("GLfloat") float r0, @org.lwjgl.system.NativeType("GLfloat") float r1, @org.lwjgl.system.NativeType("GLfloat") float r2, @org.lwjgl.system.NativeType("GLfloat") float r3);

    public static native void glClearDepth(@org.lwjgl.system.NativeType("GLdouble") double r0);

    public static native void glClearStencil(@org.lwjgl.system.NativeType("GLint") int r0);

    public static native void glColorMask(@org.lwjgl.system.NativeType("GLboolean") boolean r0, @org.lwjgl.system.NativeType("GLboolean") boolean r1, @org.lwjgl.system.NativeType("GLboolean") boolean r2, @org.lwjgl.system.NativeType("GLboolean") boolean r3);

    public static native void glCullFace(@org.lwjgl.system.NativeType("GLenum") int r0);

    public static native void glDepthFunc(@org.lwjgl.system.NativeType("GLenum") int r0);

    public static native void glDepthMask(@org.lwjgl.system.NativeType("GLboolean") boolean r0);

    public static native void glDepthRange(@org.lwjgl.system.NativeType("GLdouble") double r0, @org.lwjgl.system.NativeType("GLdouble") double r2);

    public static native void glDrawArrays(@org.lwjgl.system.NativeType("GLenum") int r0, @org.lwjgl.system.NativeType("GLint") int r1, @org.lwjgl.system.NativeType("GLsizei") int r2);

    public static native void glDrawBuffer(@org.lwjgl.system.NativeType("GLenum") int r0);

    public static native void nglDrawElements(int r0, int r1, int r2, long r3);

    public static void glDrawElements(@org.lwjgl.system.NativeType("GLenum") int r6, @org.lwjgl.system.NativeType("GLsizei") int r7, @org.lwjgl.system.NativeType("GLenum") int r8, @org.lwjgl.system.NativeType("void const *") long r9) {
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            nglDrawElements(r0, r1, r2, r3)
            return
    }

    public static void glDrawElements(@org.lwjgl.system.NativeType("GLenum") int r6, @org.lwjgl.system.NativeType("GLenum") int r7, @org.lwjgl.system.NativeType("void const *") java.nio.ByteBuffer r8) {
            r0 = r6
            r1 = r8
            int r1 = r1.remaining()
            r2 = r7
            int r2 = org.lwjgl.opengl.GLChecks.typeToByteShift(r2)
            int r1 = r1 >> r2
            r2 = r7
            r3 = r8
            long r3 = org.lwjgl.system.MemoryUtil.memAddress(r3)
            nglDrawElements(r0, r1, r2, r3)
            return
    }

    public static void glDrawElements(@org.lwjgl.system.NativeType("GLenum") int r6, @org.lwjgl.system.NativeType("void const *") java.nio.ByteBuffer r7) {
            r0 = r6
            r1 = r7
            int r1 = r1.remaining()
            r2 = 5121(0x1401, float:7.176E-42)
            r3 = r7
            long r3 = org.lwjgl.system.MemoryUtil.memAddress(r3)
            nglDrawElements(r0, r1, r2, r3)
            return
    }

    public static void glDrawElements(@org.lwjgl.system.NativeType("GLenum") int r6, @org.lwjgl.system.NativeType("void const *") java.nio.ShortBuffer r7) {
            r0 = r6
            r1 = r7
            int r1 = r1.remaining()
            r2 = 5123(0x1403, float:7.179E-42)
            r3 = r7
            long r3 = org.lwjgl.system.MemoryUtil.memAddress(r3)
            nglDrawElements(r0, r1, r2, r3)
            return
    }

    public static void glDrawElements(@org.lwjgl.system.NativeType("GLenum") int r6, @org.lwjgl.system.NativeType("void const *") java.nio.IntBuffer r7) {
            r0 = r6
            r1 = r7
            int r1 = r1.remaining()
            r2 = 5125(0x1405, float:7.182E-42)
            r3 = r7
            long r3 = org.lwjgl.system.MemoryUtil.memAddress(r3)
            nglDrawElements(r0, r1, r2, r3)
            return
    }

    public static native void glFinish();

    public static native void glFlush();

    public static native void glFrontFace(@org.lwjgl.system.NativeType("GLenum") int r0);

    public static native void nglGenTextures(int r0, long r1);

    public static void glGenTextures(@org.lwjgl.system.NativeType("GLuint *") java.nio.IntBuffer r4) {
            r0 = r4
            int r0 = r0.remaining()
            r1 = r4
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            nglGenTextures(r0, r1)
            return
    }

    @org.lwjgl.system.NativeType("void")
    public static int glGenTextures() {
            org.lwjgl.system.MemoryStack r0 = org.lwjgl.system.MemoryStack.stackGet()
            r4 = r0
            r0 = r4
            int r0 = r0.getPointer()
            r5 = r0
            r0 = r4
            r1 = 1
            java.nio.IntBuffer r0 = r0.callocInt(r1)     // Catch: java.lang.Throwable -> L24
            r6 = r0
            r0 = 1
            r1 = r6
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)     // Catch: java.lang.Throwable -> L24
            nglGenTextures(r0, r1)     // Catch: java.lang.Throwable -> L24
            r0 = r6
            r1 = 0
            int r0 = r0.get(r1)     // Catch: java.lang.Throwable -> L24
            r7 = r0
            r0 = r4
            r1 = r5
            r0.setPointer(r1)
            r0 = r7
            return r0
        L24:
            r8 = move-exception
            r0 = r4
            r1 = r5
            r0.setPointer(r1)
            r0 = r8
            throw r0
    }

    public static native void nglDeleteTextures(int r0, long r1);

    public static void glDeleteTextures(@org.lwjgl.system.NativeType("GLuint const *") java.nio.IntBuffer r4) {
            r0 = r4
            int r0 = r0.remaining()
            r1 = r4
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            nglDeleteTextures(r0, r1)
            return
    }

    public static void glDeleteTextures(@org.lwjgl.system.NativeType("GLuint const *") int r4) {
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
            nglDeleteTextures(r0, r1)     // Catch: java.lang.Throwable -> L1f
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

    public static native void nglGetBooleanv(int r0, long r1);

    public static void glGetBooleanv(@org.lwjgl.system.NativeType("GLenum") int r4, @org.lwjgl.system.NativeType("GLboolean *") java.nio.ByteBuffer r5) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r5
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
        Lb:
            r0 = r4
            r1 = r5
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            nglGetBooleanv(r0, r1)
            return
    }

    @org.lwjgl.system.NativeType("void")
    public static boolean glGetBoolean(@org.lwjgl.system.NativeType("GLenum") int r4) {
            org.lwjgl.system.MemoryStack r0 = org.lwjgl.system.MemoryStack.stackGet()
            r5 = r0
            r0 = r5
            int r0 = r0.getPointer()
            r6 = r0
            r0 = r5
            r1 = 1
            java.nio.ByteBuffer r0 = r0.calloc(r1)     // Catch: java.lang.Throwable -> L2e
            r7 = r0
            r0 = r4
            r1 = r7
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)     // Catch: java.lang.Throwable -> L2e
            nglGetBooleanv(r0, r1)     // Catch: java.lang.Throwable -> L2e
            r0 = r7
            r1 = 0
            byte r0 = r0.get(r1)     // Catch: java.lang.Throwable -> L2e
            if (r0 == 0) goto L23
            r0 = 1
            goto L24
        L23:
            r0 = 0
        L24:
            r8 = r0
            r0 = r5
            r1 = r6
            r0.setPointer(r1)
            r0 = r8
            return r0
        L2e:
            r9 = move-exception
            r0 = r5
            r1 = r6
            r0.setPointer(r1)
            r0 = r9
            throw r0
    }

    public static native void nglGetFloatv(int r0, long r1);

    public static void glGetFloatv(@org.lwjgl.system.NativeType("GLenum") int r4, @org.lwjgl.system.NativeType("GLfloat *") java.nio.FloatBuffer r5) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r5
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
        Lb:
            r0 = r4
            r1 = r5
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            nglGetFloatv(r0, r1)
            return
    }

    @org.lwjgl.system.NativeType("void")
    public static float glGetFloat(@org.lwjgl.system.NativeType("GLenum") int r4) {
            org.lwjgl.system.MemoryStack r0 = org.lwjgl.system.MemoryStack.stackGet()
            r5 = r0
            r0 = r5
            int r0 = r0.getPointer()
            r6 = r0
            r0 = r5
            r1 = 1
            java.nio.FloatBuffer r0 = r0.callocFloat(r1)     // Catch: java.lang.Throwable -> L26
            r7 = r0
            r0 = r4
            r1 = r7
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)     // Catch: java.lang.Throwable -> L26
            nglGetFloatv(r0, r1)     // Catch: java.lang.Throwable -> L26
            r0 = r7
            r1 = 0
            float r0 = r0.get(r1)     // Catch: java.lang.Throwable -> L26
            r8 = r0
            r0 = r5
            r1 = r6
            r0.setPointer(r1)
            r0 = r8
            return r0
        L26:
            r9 = move-exception
            r0 = r5
            r1 = r6
            r0.setPointer(r1)
            r0 = r9
            throw r0
    }

    public static native void nglGetIntegerv(int r0, long r1);

    public static void glGetIntegerv(@org.lwjgl.system.NativeType("GLenum") int r4, @org.lwjgl.system.NativeType("GLint *") java.nio.IntBuffer r5) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r5
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
        Lb:
            r0 = r4
            r1 = r5
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            nglGetIntegerv(r0, r1)
            return
    }

    @org.lwjgl.system.NativeType("void")
    public static int glGetInteger(@org.lwjgl.system.NativeType("GLenum") int r4) {
            org.lwjgl.system.MemoryStack r0 = org.lwjgl.system.MemoryStack.stackGet()
            r5 = r0
            r0 = r5
            int r0 = r0.getPointer()
            r6 = r0
            r0 = r5
            r1 = 1
            java.nio.IntBuffer r0 = r0.callocInt(r1)     // Catch: java.lang.Throwable -> L26
            r7 = r0
            r0 = r4
            r1 = r7
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)     // Catch: java.lang.Throwable -> L26
            nglGetIntegerv(r0, r1)     // Catch: java.lang.Throwable -> L26
            r0 = r7
            r1 = 0
            int r0 = r0.get(r1)     // Catch: java.lang.Throwable -> L26
            r8 = r0
            r0 = r5
            r1 = r6
            r0.setPointer(r1)
            r0 = r8
            return r0
        L26:
            r9 = move-exception
            r0 = r5
            r1 = r6
            r0.setPointer(r1)
            r0 = r9
            throw r0
    }

    public static native void nglGetDoublev(int r0, long r1);

    public static void glGetDoublev(@org.lwjgl.system.NativeType("GLenum") int r4, @org.lwjgl.system.NativeType("GLdouble *") java.nio.DoubleBuffer r5) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r5
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
        Lb:
            r0 = r4
            r1 = r5
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            nglGetDoublev(r0, r1)
            return
    }

    @org.lwjgl.system.NativeType("void")
    public static double glGetDouble(@org.lwjgl.system.NativeType("GLenum") int r4) {
            org.lwjgl.system.MemoryStack r0 = org.lwjgl.system.MemoryStack.stackGet()
            r5 = r0
            r0 = r5
            int r0 = r0.getPointer()
            r6 = r0
            r0 = r5
            r1 = 1
            java.nio.DoubleBuffer r0 = r0.callocDouble(r1)     // Catch: java.lang.Throwable -> L26
            r7 = r0
            r0 = r4
            r1 = r7
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)     // Catch: java.lang.Throwable -> L26
            nglGetDoublev(r0, r1)     // Catch: java.lang.Throwable -> L26
            r0 = r7
            r1 = 0
            double r0 = r0.get(r1)     // Catch: java.lang.Throwable -> L26
            r8 = r0
            r0 = r5
            r1 = r6
            r0.setPointer(r1)
            r0 = r8
            return r0
        L26:
            r10 = move-exception
            r0 = r5
            r1 = r6
            r0.setPointer(r1)
            r0 = r10
            throw r0
    }

    @org.lwjgl.system.NativeType("GLenum")
    public static native int glGetError();

    public static native void nglGetPointerv(int r0, long r1);

    public static void glGetPointerv(@org.lwjgl.system.NativeType("GLenum") int r4, @org.lwjgl.system.NativeType("void **") org.lwjgl.PointerBuffer r5) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r5
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
        Lb:
            r0 = r4
            r1 = r5
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            nglGetPointerv(r0, r1)
            return
    }

    @org.lwjgl.system.NativeType("void")
    public static long glGetPointer(@org.lwjgl.system.NativeType("GLenum") int r4) {
            org.lwjgl.system.MemoryStack r0 = org.lwjgl.system.MemoryStack.stackGet()
            r5 = r0
            r0 = r5
            int r0 = r0.getPointer()
            r6 = r0
            r0 = r5
            r1 = 1
            org.lwjgl.PointerBuffer r0 = r0.callocPointer(r1)     // Catch: java.lang.Throwable -> L26
            r7 = r0
            r0 = r4
            r1 = r7
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)     // Catch: java.lang.Throwable -> L26
            nglGetPointerv(r0, r1)     // Catch: java.lang.Throwable -> L26
            r0 = r7
            r1 = 0
            long r0 = r0.get(r1)     // Catch: java.lang.Throwable -> L26
            r8 = r0
            r0 = r5
            r1 = r6
            r0.setPointer(r1)
            r0 = r8
            return r0
        L26:
            r10 = move-exception
            r0 = r5
            r1 = r6
            r0.setPointer(r1)
            r0 = r10
            throw r0
    }

    public static native long nglGetString(int r0);

    @javax.annotation.Nullable
    @org.lwjgl.system.NativeType("GLubyte const *")
    public static java.lang.String glGetString(@org.lwjgl.system.NativeType("GLenum") int r3) {
            r0 = r3
            long r0 = nglGetString(r0)
            r4 = r0
            r0 = r4
            java.lang.String r0 = org.lwjgl.system.MemoryUtil.memUTF8Safe(r0)
            return r0
    }

    public static native void nglGetTexImage(int r0, int r1, int r2, int r3, long r4);

    public static void glGetTexImage(@org.lwjgl.system.NativeType("GLenum") int r7, @org.lwjgl.system.NativeType("GLint") int r8, @org.lwjgl.system.NativeType("GLenum") int r9, @org.lwjgl.system.NativeType("GLenum") int r10, @org.lwjgl.system.NativeType("void *") java.nio.ByteBuffer r11) {
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            long r4 = org.lwjgl.system.MemoryUtil.memAddress(r4)
            nglGetTexImage(r0, r1, r2, r3, r4)
            return
    }

    public static void glGetTexImage(@org.lwjgl.system.NativeType("GLenum") int r7, @org.lwjgl.system.NativeType("GLint") int r8, @org.lwjgl.system.NativeType("GLenum") int r9, @org.lwjgl.system.NativeType("GLenum") int r10, @org.lwjgl.system.NativeType("void *") long r11) {
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            nglGetTexImage(r0, r1, r2, r3, r4)
            return
    }

    public static void glGetTexImage(@org.lwjgl.system.NativeType("GLenum") int r7, @org.lwjgl.system.NativeType("GLint") int r8, @org.lwjgl.system.NativeType("GLenum") int r9, @org.lwjgl.system.NativeType("GLenum") int r10, @org.lwjgl.system.NativeType("void *") java.nio.ShortBuffer r11) {
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            long r4 = org.lwjgl.system.MemoryUtil.memAddress(r4)
            nglGetTexImage(r0, r1, r2, r3, r4)
            return
    }

    public static void glGetTexImage(@org.lwjgl.system.NativeType("GLenum") int r7, @org.lwjgl.system.NativeType("GLint") int r8, @org.lwjgl.system.NativeType("GLenum") int r9, @org.lwjgl.system.NativeType("GLenum") int r10, @org.lwjgl.system.NativeType("void *") java.nio.IntBuffer r11) {
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            long r4 = org.lwjgl.system.MemoryUtil.memAddress(r4)
            nglGetTexImage(r0, r1, r2, r3, r4)
            return
    }

    public static void glGetTexImage(@org.lwjgl.system.NativeType("GLenum") int r7, @org.lwjgl.system.NativeType("GLint") int r8, @org.lwjgl.system.NativeType("GLenum") int r9, @org.lwjgl.system.NativeType("GLenum") int r10, @org.lwjgl.system.NativeType("void *") java.nio.FloatBuffer r11) {
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            long r4 = org.lwjgl.system.MemoryUtil.memAddress(r4)
            nglGetTexImage(r0, r1, r2, r3, r4)
            return
    }

    public static void glGetTexImage(@org.lwjgl.system.NativeType("GLenum") int r7, @org.lwjgl.system.NativeType("GLint") int r8, @org.lwjgl.system.NativeType("GLenum") int r9, @org.lwjgl.system.NativeType("GLenum") int r10, @org.lwjgl.system.NativeType("void *") java.nio.DoubleBuffer r11) {
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            long r4 = org.lwjgl.system.MemoryUtil.memAddress(r4)
            nglGetTexImage(r0, r1, r2, r3, r4)
            return
    }

    public static native void nglGetTexLevelParameteriv(int r0, int r1, int r2, long r3);

    public static void glGetTexLevelParameteriv(@org.lwjgl.system.NativeType("GLenum") int r6, @org.lwjgl.system.NativeType("GLint") int r7, @org.lwjgl.system.NativeType("GLenum") int r8, @org.lwjgl.system.NativeType("GLint *") java.nio.IntBuffer r9) {
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
            nglGetTexLevelParameteriv(r0, r1, r2, r3)
            return
    }

    @org.lwjgl.system.NativeType("void")
    public static int glGetTexLevelParameteri(@org.lwjgl.system.NativeType("GLenum") int r6, @org.lwjgl.system.NativeType("GLint") int r7, @org.lwjgl.system.NativeType("GLenum") int r8) {
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
            nglGetTexLevelParameteriv(r0, r1, r2, r3)     // Catch: java.lang.Throwable -> L2d
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

    public static native void nglGetTexLevelParameterfv(int r0, int r1, int r2, long r3);

    public static void glGetTexLevelParameterfv(@org.lwjgl.system.NativeType("GLenum") int r6, @org.lwjgl.system.NativeType("GLint") int r7, @org.lwjgl.system.NativeType("GLenum") int r8, @org.lwjgl.system.NativeType("GLfloat *") java.nio.FloatBuffer r9) {
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
            nglGetTexLevelParameterfv(r0, r1, r2, r3)
            return
    }

    @org.lwjgl.system.NativeType("void")
    public static float glGetTexLevelParameterf(@org.lwjgl.system.NativeType("GLenum") int r6, @org.lwjgl.system.NativeType("GLint") int r7, @org.lwjgl.system.NativeType("GLenum") int r8) {
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
            nglGetTexLevelParameterfv(r0, r1, r2, r3)     // Catch: java.lang.Throwable -> L2d
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

    public static native void nglGetTexParameteriv(int r0, int r1, long r2);

    public static void glGetTexParameteriv(@org.lwjgl.system.NativeType("GLenum") int r5, @org.lwjgl.system.NativeType("GLenum") int r6, @org.lwjgl.system.NativeType("GLint *") java.nio.IntBuffer r7) {
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
            nglGetTexParameteriv(r0, r1, r2)
            return
    }

    @org.lwjgl.system.NativeType("void")
    public static int glGetTexParameteri(@org.lwjgl.system.NativeType("GLenum") int r5, @org.lwjgl.system.NativeType("GLenum") int r6) {
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
            nglGetTexParameteriv(r0, r1, r2)     // Catch: java.lang.Throwable -> L2a
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

    public static native void nglGetTexParameterfv(int r0, int r1, long r2);

    public static void glGetTexParameterfv(@org.lwjgl.system.NativeType("GLenum") int r5, @org.lwjgl.system.NativeType("GLenum") int r6, @org.lwjgl.system.NativeType("GLfloat *") java.nio.FloatBuffer r7) {
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
            nglGetTexParameterfv(r0, r1, r2)
            return
    }

    @org.lwjgl.system.NativeType("void")
    public static float glGetTexParameterf(@org.lwjgl.system.NativeType("GLenum") int r5, @org.lwjgl.system.NativeType("GLenum") int r6) {
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
            nglGetTexParameterfv(r0, r1, r2)     // Catch: java.lang.Throwable -> L2a
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

    public static native void glHint(@org.lwjgl.system.NativeType("GLenum") int r0, @org.lwjgl.system.NativeType("GLenum") int r1);

    @org.lwjgl.system.NativeType("GLboolean")
    public static native boolean glIsEnabled(@org.lwjgl.system.NativeType("GLenum") int r0);

    @org.lwjgl.system.NativeType("GLboolean")
    public static native boolean glIsTexture(@org.lwjgl.system.NativeType("GLuint") int r0);

    public static native void glLineWidth(@org.lwjgl.system.NativeType("GLfloat") float r0);

    public static native void glLogicOp(@org.lwjgl.system.NativeType("GLenum") int r0);

    public static native void glPixelStorei(@org.lwjgl.system.NativeType("GLenum") int r0, @org.lwjgl.system.NativeType("GLint") int r1);

    public static native void glPixelStoref(@org.lwjgl.system.NativeType("GLenum") int r0, @org.lwjgl.system.NativeType("GLfloat") float r1);

    public static native void glPointSize(@org.lwjgl.system.NativeType("GLfloat") float r0);

    public static native void glPolygonMode(@org.lwjgl.system.NativeType("GLenum") int r0, @org.lwjgl.system.NativeType("GLenum") int r1);

    public static native void glPolygonOffset(@org.lwjgl.system.NativeType("GLfloat") float r0, @org.lwjgl.system.NativeType("GLfloat") float r1);

    public static native void glReadBuffer(@org.lwjgl.system.NativeType("GLenum") int r0);

    public static native void nglReadPixels(int r0, int r1, int r2, int r3, int r4, int r5, long r6);

    public static void glReadPixels(@org.lwjgl.system.NativeType("GLint") int r9, @org.lwjgl.system.NativeType("GLint") int r10, @org.lwjgl.system.NativeType("GLsizei") int r11, @org.lwjgl.system.NativeType("GLsizei") int r12, @org.lwjgl.system.NativeType("GLenum") int r13, @org.lwjgl.system.NativeType("GLenum") int r14, @org.lwjgl.system.NativeType("void *") java.nio.ByteBuffer r15) {
            r0 = r9
            r1 = r10
            r2 = r11
            r3 = r12
            r4 = r13
            r5 = r14
            r6 = r15
            long r6 = org.lwjgl.system.MemoryUtil.memAddress(r6)
            nglReadPixels(r0, r1, r2, r3, r4, r5, r6)
            return
    }

    public static void glReadPixels(@org.lwjgl.system.NativeType("GLint") int r9, @org.lwjgl.system.NativeType("GLint") int r10, @org.lwjgl.system.NativeType("GLsizei") int r11, @org.lwjgl.system.NativeType("GLsizei") int r12, @org.lwjgl.system.NativeType("GLenum") int r13, @org.lwjgl.system.NativeType("GLenum") int r14, @org.lwjgl.system.NativeType("void *") long r15) {
            r0 = r9
            r1 = r10
            r2 = r11
            r3 = r12
            r4 = r13
            r5 = r14
            r6 = r15
            nglReadPixels(r0, r1, r2, r3, r4, r5, r6)
            return
    }

    public static void glReadPixels(@org.lwjgl.system.NativeType("GLint") int r9, @org.lwjgl.system.NativeType("GLint") int r10, @org.lwjgl.system.NativeType("GLsizei") int r11, @org.lwjgl.system.NativeType("GLsizei") int r12, @org.lwjgl.system.NativeType("GLenum") int r13, @org.lwjgl.system.NativeType("GLenum") int r14, @org.lwjgl.system.NativeType("void *") java.nio.ShortBuffer r15) {
            r0 = r9
            r1 = r10
            r2 = r11
            r3 = r12
            r4 = r13
            r5 = r14
            r6 = r15
            long r6 = org.lwjgl.system.MemoryUtil.memAddress(r6)
            nglReadPixels(r0, r1, r2, r3, r4, r5, r6)
            return
    }

    public static void glReadPixels(@org.lwjgl.system.NativeType("GLint") int r9, @org.lwjgl.system.NativeType("GLint") int r10, @org.lwjgl.system.NativeType("GLsizei") int r11, @org.lwjgl.system.NativeType("GLsizei") int r12, @org.lwjgl.system.NativeType("GLenum") int r13, @org.lwjgl.system.NativeType("GLenum") int r14, @org.lwjgl.system.NativeType("void *") java.nio.IntBuffer r15) {
            r0 = r9
            r1 = r10
            r2 = r11
            r3 = r12
            r4 = r13
            r5 = r14
            r6 = r15
            long r6 = org.lwjgl.system.MemoryUtil.memAddress(r6)
            nglReadPixels(r0, r1, r2, r3, r4, r5, r6)
            return
    }

    public static void glReadPixels(@org.lwjgl.system.NativeType("GLint") int r9, @org.lwjgl.system.NativeType("GLint") int r10, @org.lwjgl.system.NativeType("GLsizei") int r11, @org.lwjgl.system.NativeType("GLsizei") int r12, @org.lwjgl.system.NativeType("GLenum") int r13, @org.lwjgl.system.NativeType("GLenum") int r14, @org.lwjgl.system.NativeType("void *") java.nio.FloatBuffer r15) {
            r0 = r9
            r1 = r10
            r2 = r11
            r3 = r12
            r4 = r13
            r5 = r14
            r6 = r15
            long r6 = org.lwjgl.system.MemoryUtil.memAddress(r6)
            nglReadPixels(r0, r1, r2, r3, r4, r5, r6)
            return
    }

    public static native void glScissor(@org.lwjgl.system.NativeType("GLint") int r0, @org.lwjgl.system.NativeType("GLint") int r1, @org.lwjgl.system.NativeType("GLsizei") int r2, @org.lwjgl.system.NativeType("GLsizei") int r3);

    public static native void glStencilFunc(@org.lwjgl.system.NativeType("GLenum") int r0, @org.lwjgl.system.NativeType("GLint") int r1, @org.lwjgl.system.NativeType("GLuint") int r2);

    public static native void glStencilMask(@org.lwjgl.system.NativeType("GLuint") int r0);

    public static native void glStencilOp(@org.lwjgl.system.NativeType("GLenum") int r0, @org.lwjgl.system.NativeType("GLenum") int r1, @org.lwjgl.system.NativeType("GLenum") int r2);

    public static native void nglTexImage1D(int r0, int r1, int r2, int r3, int r4, int r5, int r6, long r7);

    public static void glTexImage1D(@org.lwjgl.system.NativeType("GLenum") int r10, @org.lwjgl.system.NativeType("GLint") int r11, @org.lwjgl.system.NativeType("GLint") int r12, @org.lwjgl.system.NativeType("GLsizei") int r13, @org.lwjgl.system.NativeType("GLint") int r14, @org.lwjgl.system.NativeType("GLenum") int r15, @org.lwjgl.system.NativeType("GLenum") int r16, @javax.annotation.Nullable @org.lwjgl.system.NativeType("void const *") java.nio.ByteBuffer r17) {
            r0 = r10
            r1 = r11
            r2 = r12
            r3 = r13
            r4 = r14
            r5 = r15
            r6 = r16
            r7 = r17
            long r7 = org.lwjgl.system.MemoryUtil.memAddressSafe(r7)
            nglTexImage1D(r0, r1, r2, r3, r4, r5, r6, r7)
            return
    }

    public static void glTexImage1D(@org.lwjgl.system.NativeType("GLenum") int r10, @org.lwjgl.system.NativeType("GLint") int r11, @org.lwjgl.system.NativeType("GLint") int r12, @org.lwjgl.system.NativeType("GLsizei") int r13, @org.lwjgl.system.NativeType("GLint") int r14, @org.lwjgl.system.NativeType("GLenum") int r15, @org.lwjgl.system.NativeType("GLenum") int r16, @org.lwjgl.system.NativeType("void const *") long r17) {
            r0 = r10
            r1 = r11
            r2 = r12
            r3 = r13
            r4 = r14
            r5 = r15
            r6 = r16
            r7 = r17
            nglTexImage1D(r0, r1, r2, r3, r4, r5, r6, r7)
            return
    }

    public static void glTexImage1D(@org.lwjgl.system.NativeType("GLenum") int r10, @org.lwjgl.system.NativeType("GLint") int r11, @org.lwjgl.system.NativeType("GLint") int r12, @org.lwjgl.system.NativeType("GLsizei") int r13, @org.lwjgl.system.NativeType("GLint") int r14, @org.lwjgl.system.NativeType("GLenum") int r15, @org.lwjgl.system.NativeType("GLenum") int r16, @javax.annotation.Nullable @org.lwjgl.system.NativeType("void const *") java.nio.ShortBuffer r17) {
            r0 = r10
            r1 = r11
            r2 = r12
            r3 = r13
            r4 = r14
            r5 = r15
            r6 = r16
            r7 = r17
            long r7 = org.lwjgl.system.MemoryUtil.memAddressSafe(r7)
            nglTexImage1D(r0, r1, r2, r3, r4, r5, r6, r7)
            return
    }

    public static void glTexImage1D(@org.lwjgl.system.NativeType("GLenum") int r10, @org.lwjgl.system.NativeType("GLint") int r11, @org.lwjgl.system.NativeType("GLint") int r12, @org.lwjgl.system.NativeType("GLsizei") int r13, @org.lwjgl.system.NativeType("GLint") int r14, @org.lwjgl.system.NativeType("GLenum") int r15, @org.lwjgl.system.NativeType("GLenum") int r16, @javax.annotation.Nullable @org.lwjgl.system.NativeType("void const *") java.nio.IntBuffer r17) {
            r0 = r10
            r1 = r11
            r2 = r12
            r3 = r13
            r4 = r14
            r5 = r15
            r6 = r16
            r7 = r17
            long r7 = org.lwjgl.system.MemoryUtil.memAddressSafe(r7)
            nglTexImage1D(r0, r1, r2, r3, r4, r5, r6, r7)
            return
    }

    public static void glTexImage1D(@org.lwjgl.system.NativeType("GLenum") int r10, @org.lwjgl.system.NativeType("GLint") int r11, @org.lwjgl.system.NativeType("GLint") int r12, @org.lwjgl.system.NativeType("GLsizei") int r13, @org.lwjgl.system.NativeType("GLint") int r14, @org.lwjgl.system.NativeType("GLenum") int r15, @org.lwjgl.system.NativeType("GLenum") int r16, @javax.annotation.Nullable @org.lwjgl.system.NativeType("void const *") java.nio.FloatBuffer r17) {
            r0 = r10
            r1 = r11
            r2 = r12
            r3 = r13
            r4 = r14
            r5 = r15
            r6 = r16
            r7 = r17
            long r7 = org.lwjgl.system.MemoryUtil.memAddressSafe(r7)
            nglTexImage1D(r0, r1, r2, r3, r4, r5, r6, r7)
            return
    }

    public static void glTexImage1D(@org.lwjgl.system.NativeType("GLenum") int r10, @org.lwjgl.system.NativeType("GLint") int r11, @org.lwjgl.system.NativeType("GLint") int r12, @org.lwjgl.system.NativeType("GLsizei") int r13, @org.lwjgl.system.NativeType("GLint") int r14, @org.lwjgl.system.NativeType("GLenum") int r15, @org.lwjgl.system.NativeType("GLenum") int r16, @javax.annotation.Nullable @org.lwjgl.system.NativeType("void const *") java.nio.DoubleBuffer r17) {
            r0 = r10
            r1 = r11
            r2 = r12
            r3 = r13
            r4 = r14
            r5 = r15
            r6 = r16
            r7 = r17
            long r7 = org.lwjgl.system.MemoryUtil.memAddressSafe(r7)
            nglTexImage1D(r0, r1, r2, r3, r4, r5, r6, r7)
            return
    }

    public static native void nglTexImage2D(int r0, int r1, int r2, int r3, int r4, int r5, int r6, int r7, long r8);

    public static void glTexImage2D(@org.lwjgl.system.NativeType("GLenum") int r11, @org.lwjgl.system.NativeType("GLint") int r12, @org.lwjgl.system.NativeType("GLint") int r13, @org.lwjgl.system.NativeType("GLsizei") int r14, @org.lwjgl.system.NativeType("GLsizei") int r15, @org.lwjgl.system.NativeType("GLint") int r16, @org.lwjgl.system.NativeType("GLenum") int r17, @org.lwjgl.system.NativeType("GLenum") int r18, @javax.annotation.Nullable @org.lwjgl.system.NativeType("void const *") java.nio.ByteBuffer r19) {
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
            nglTexImage2D(r0, r1, r2, r3, r4, r5, r6, r7, r8)
            return
    }

    public static void glTexImage2D(@org.lwjgl.system.NativeType("GLenum") int r11, @org.lwjgl.system.NativeType("GLint") int r12, @org.lwjgl.system.NativeType("GLint") int r13, @org.lwjgl.system.NativeType("GLsizei") int r14, @org.lwjgl.system.NativeType("GLsizei") int r15, @org.lwjgl.system.NativeType("GLint") int r16, @org.lwjgl.system.NativeType("GLenum") int r17, @org.lwjgl.system.NativeType("GLenum") int r18, @org.lwjgl.system.NativeType("void const *") long r19) {
            r0 = r11
            r1 = r12
            r2 = r13
            r3 = r14
            r4 = r15
            r5 = r16
            r6 = r17
            r7 = r18
            r8 = r19
            nglTexImage2D(r0, r1, r2, r3, r4, r5, r6, r7, r8)
            return
    }

    public static void glTexImage2D(@org.lwjgl.system.NativeType("GLenum") int r11, @org.lwjgl.system.NativeType("GLint") int r12, @org.lwjgl.system.NativeType("GLint") int r13, @org.lwjgl.system.NativeType("GLsizei") int r14, @org.lwjgl.system.NativeType("GLsizei") int r15, @org.lwjgl.system.NativeType("GLint") int r16, @org.lwjgl.system.NativeType("GLenum") int r17, @org.lwjgl.system.NativeType("GLenum") int r18, @javax.annotation.Nullable @org.lwjgl.system.NativeType("void const *") java.nio.ShortBuffer r19) {
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
            nglTexImage2D(r0, r1, r2, r3, r4, r5, r6, r7, r8)
            return
    }

    public static void glTexImage2D(@org.lwjgl.system.NativeType("GLenum") int r11, @org.lwjgl.system.NativeType("GLint") int r12, @org.lwjgl.system.NativeType("GLint") int r13, @org.lwjgl.system.NativeType("GLsizei") int r14, @org.lwjgl.system.NativeType("GLsizei") int r15, @org.lwjgl.system.NativeType("GLint") int r16, @org.lwjgl.system.NativeType("GLenum") int r17, @org.lwjgl.system.NativeType("GLenum") int r18, @javax.annotation.Nullable @org.lwjgl.system.NativeType("void const *") java.nio.IntBuffer r19) {
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
            nglTexImage2D(r0, r1, r2, r3, r4, r5, r6, r7, r8)
            return
    }

    public static void glTexImage2D(@org.lwjgl.system.NativeType("GLenum") int r11, @org.lwjgl.system.NativeType("GLint") int r12, @org.lwjgl.system.NativeType("GLint") int r13, @org.lwjgl.system.NativeType("GLsizei") int r14, @org.lwjgl.system.NativeType("GLsizei") int r15, @org.lwjgl.system.NativeType("GLint") int r16, @org.lwjgl.system.NativeType("GLenum") int r17, @org.lwjgl.system.NativeType("GLenum") int r18, @javax.annotation.Nullable @org.lwjgl.system.NativeType("void const *") java.nio.FloatBuffer r19) {
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
            nglTexImage2D(r0, r1, r2, r3, r4, r5, r6, r7, r8)
            return
    }

    public static void glTexImage2D(@org.lwjgl.system.NativeType("GLenum") int r11, @org.lwjgl.system.NativeType("GLint") int r12, @org.lwjgl.system.NativeType("GLint") int r13, @org.lwjgl.system.NativeType("GLsizei") int r14, @org.lwjgl.system.NativeType("GLsizei") int r15, @org.lwjgl.system.NativeType("GLint") int r16, @org.lwjgl.system.NativeType("GLenum") int r17, @org.lwjgl.system.NativeType("GLenum") int r18, @javax.annotation.Nullable @org.lwjgl.system.NativeType("void const *") java.nio.DoubleBuffer r19) {
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
            nglTexImage2D(r0, r1, r2, r3, r4, r5, r6, r7, r8)
            return
    }

    public static native void glCopyTexImage1D(@org.lwjgl.system.NativeType("GLenum") int r0, @org.lwjgl.system.NativeType("GLint") int r1, @org.lwjgl.system.NativeType("GLenum") int r2, @org.lwjgl.system.NativeType("GLint") int r3, @org.lwjgl.system.NativeType("GLint") int r4, @org.lwjgl.system.NativeType("GLsizei") int r5, @org.lwjgl.system.NativeType("GLint") int r6);

    public static native void glCopyTexImage2D(@org.lwjgl.system.NativeType("GLenum") int r0, @org.lwjgl.system.NativeType("GLint") int r1, @org.lwjgl.system.NativeType("GLenum") int r2, @org.lwjgl.system.NativeType("GLint") int r3, @org.lwjgl.system.NativeType("GLint") int r4, @org.lwjgl.system.NativeType("GLsizei") int r5, @org.lwjgl.system.NativeType("GLsizei") int r6, @org.lwjgl.system.NativeType("GLint") int r7);

    public static native void glCopyTexSubImage1D(@org.lwjgl.system.NativeType("GLenum") int r0, @org.lwjgl.system.NativeType("GLint") int r1, @org.lwjgl.system.NativeType("GLint") int r2, @org.lwjgl.system.NativeType("GLint") int r3, @org.lwjgl.system.NativeType("GLint") int r4, @org.lwjgl.system.NativeType("GLsizei") int r5);

    public static native void glCopyTexSubImage2D(@org.lwjgl.system.NativeType("GLenum") int r0, @org.lwjgl.system.NativeType("GLint") int r1, @org.lwjgl.system.NativeType("GLint") int r2, @org.lwjgl.system.NativeType("GLint") int r3, @org.lwjgl.system.NativeType("GLint") int r4, @org.lwjgl.system.NativeType("GLint") int r5, @org.lwjgl.system.NativeType("GLsizei") int r6, @org.lwjgl.system.NativeType("GLsizei") int r7);

    public static native void glTexParameteri(@org.lwjgl.system.NativeType("GLenum") int r0, @org.lwjgl.system.NativeType("GLenum") int r1, @org.lwjgl.system.NativeType("GLint") int r2);

    public static native void nglTexParameteriv(int r0, int r1, long r2);

    public static void glTexParameteriv(@org.lwjgl.system.NativeType("GLenum") int r5, @org.lwjgl.system.NativeType("GLenum") int r6, @org.lwjgl.system.NativeType("GLint const *") java.nio.IntBuffer r7) {
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
            nglTexParameteriv(r0, r1, r2)
            return
    }

    public static native void glTexParameterf(@org.lwjgl.system.NativeType("GLenum") int r0, @org.lwjgl.system.NativeType("GLenum") int r1, @org.lwjgl.system.NativeType("GLfloat") float r2);

    public static native void nglTexParameterfv(int r0, int r1, long r2);

    public static void glTexParameterfv(@org.lwjgl.system.NativeType("GLenum") int r5, @org.lwjgl.system.NativeType("GLenum") int r6, @org.lwjgl.system.NativeType("GLfloat const *") java.nio.FloatBuffer r7) {
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
            nglTexParameterfv(r0, r1, r2)
            return
    }

    public static native void nglTexSubImage1D(int r0, int r1, int r2, int r3, int r4, int r5, long r6);

    public static void glTexSubImage1D(@org.lwjgl.system.NativeType("GLenum") int r9, @org.lwjgl.system.NativeType("GLint") int r10, @org.lwjgl.system.NativeType("GLint") int r11, @org.lwjgl.system.NativeType("GLsizei") int r12, @org.lwjgl.system.NativeType("GLenum") int r13, @org.lwjgl.system.NativeType("GLenum") int r14, @org.lwjgl.system.NativeType("void const *") java.nio.ByteBuffer r15) {
            r0 = r9
            r1 = r10
            r2 = r11
            r3 = r12
            r4 = r13
            r5 = r14
            r6 = r15
            long r6 = org.lwjgl.system.MemoryUtil.memAddress(r6)
            nglTexSubImage1D(r0, r1, r2, r3, r4, r5, r6)
            return
    }

    public static void glTexSubImage1D(@org.lwjgl.system.NativeType("GLenum") int r9, @org.lwjgl.system.NativeType("GLint") int r10, @org.lwjgl.system.NativeType("GLint") int r11, @org.lwjgl.system.NativeType("GLsizei") int r12, @org.lwjgl.system.NativeType("GLenum") int r13, @org.lwjgl.system.NativeType("GLenum") int r14, @org.lwjgl.system.NativeType("void const *") long r15) {
            r0 = r9
            r1 = r10
            r2 = r11
            r3 = r12
            r4 = r13
            r5 = r14
            r6 = r15
            nglTexSubImage1D(r0, r1, r2, r3, r4, r5, r6)
            return
    }

    public static void glTexSubImage1D(@org.lwjgl.system.NativeType("GLenum") int r9, @org.lwjgl.system.NativeType("GLint") int r10, @org.lwjgl.system.NativeType("GLint") int r11, @org.lwjgl.system.NativeType("GLsizei") int r12, @org.lwjgl.system.NativeType("GLenum") int r13, @org.lwjgl.system.NativeType("GLenum") int r14, @org.lwjgl.system.NativeType("void const *") java.nio.ShortBuffer r15) {
            r0 = r9
            r1 = r10
            r2 = r11
            r3 = r12
            r4 = r13
            r5 = r14
            r6 = r15
            long r6 = org.lwjgl.system.MemoryUtil.memAddress(r6)
            nglTexSubImage1D(r0, r1, r2, r3, r4, r5, r6)
            return
    }

    public static void glTexSubImage1D(@org.lwjgl.system.NativeType("GLenum") int r9, @org.lwjgl.system.NativeType("GLint") int r10, @org.lwjgl.system.NativeType("GLint") int r11, @org.lwjgl.system.NativeType("GLsizei") int r12, @org.lwjgl.system.NativeType("GLenum") int r13, @org.lwjgl.system.NativeType("GLenum") int r14, @org.lwjgl.system.NativeType("void const *") java.nio.IntBuffer r15) {
            r0 = r9
            r1 = r10
            r2 = r11
            r3 = r12
            r4 = r13
            r5 = r14
            r6 = r15
            long r6 = org.lwjgl.system.MemoryUtil.memAddress(r6)
            nglTexSubImage1D(r0, r1, r2, r3, r4, r5, r6)
            return
    }

    public static void glTexSubImage1D(@org.lwjgl.system.NativeType("GLenum") int r9, @org.lwjgl.system.NativeType("GLint") int r10, @org.lwjgl.system.NativeType("GLint") int r11, @org.lwjgl.system.NativeType("GLsizei") int r12, @org.lwjgl.system.NativeType("GLenum") int r13, @org.lwjgl.system.NativeType("GLenum") int r14, @org.lwjgl.system.NativeType("void const *") java.nio.FloatBuffer r15) {
            r0 = r9
            r1 = r10
            r2 = r11
            r3 = r12
            r4 = r13
            r5 = r14
            r6 = r15
            long r6 = org.lwjgl.system.MemoryUtil.memAddress(r6)
            nglTexSubImage1D(r0, r1, r2, r3, r4, r5, r6)
            return
    }

    public static void glTexSubImage1D(@org.lwjgl.system.NativeType("GLenum") int r9, @org.lwjgl.system.NativeType("GLint") int r10, @org.lwjgl.system.NativeType("GLint") int r11, @org.lwjgl.system.NativeType("GLsizei") int r12, @org.lwjgl.system.NativeType("GLenum") int r13, @org.lwjgl.system.NativeType("GLenum") int r14, @org.lwjgl.system.NativeType("void const *") java.nio.DoubleBuffer r15) {
            r0 = r9
            r1 = r10
            r2 = r11
            r3 = r12
            r4 = r13
            r5 = r14
            r6 = r15
            long r6 = org.lwjgl.system.MemoryUtil.memAddress(r6)
            nglTexSubImage1D(r0, r1, r2, r3, r4, r5, r6)
            return
    }

    public static native void nglTexSubImage2D(int r0, int r1, int r2, int r3, int r4, int r5, int r6, int r7, long r8);

    public static void glTexSubImage2D(@org.lwjgl.system.NativeType("GLenum") int r11, @org.lwjgl.system.NativeType("GLint") int r12, @org.lwjgl.system.NativeType("GLint") int r13, @org.lwjgl.system.NativeType("GLint") int r14, @org.lwjgl.system.NativeType("GLsizei") int r15, @org.lwjgl.system.NativeType("GLsizei") int r16, @org.lwjgl.system.NativeType("GLenum") int r17, @org.lwjgl.system.NativeType("GLenum") int r18, @org.lwjgl.system.NativeType("void const *") java.nio.ByteBuffer r19) {
            r0 = r11
            r1 = r12
            r2 = r13
            r3 = r14
            r4 = r15
            r5 = r16
            r6 = r17
            r7 = r18
            r8 = r19
            long r8 = org.lwjgl.system.MemoryUtil.memAddress(r8)
            nglTexSubImage2D(r0, r1, r2, r3, r4, r5, r6, r7, r8)
            return
    }

    public static void glTexSubImage2D(@org.lwjgl.system.NativeType("GLenum") int r11, @org.lwjgl.system.NativeType("GLint") int r12, @org.lwjgl.system.NativeType("GLint") int r13, @org.lwjgl.system.NativeType("GLint") int r14, @org.lwjgl.system.NativeType("GLsizei") int r15, @org.lwjgl.system.NativeType("GLsizei") int r16, @org.lwjgl.system.NativeType("GLenum") int r17, @org.lwjgl.system.NativeType("GLenum") int r18, @org.lwjgl.system.NativeType("void const *") long r19) {
            r0 = r11
            r1 = r12
            r2 = r13
            r3 = r14
            r4 = r15
            r5 = r16
            r6 = r17
            r7 = r18
            r8 = r19
            nglTexSubImage2D(r0, r1, r2, r3, r4, r5, r6, r7, r8)
            return
    }

    public static void glTexSubImage2D(@org.lwjgl.system.NativeType("GLenum") int r11, @org.lwjgl.system.NativeType("GLint") int r12, @org.lwjgl.system.NativeType("GLint") int r13, @org.lwjgl.system.NativeType("GLint") int r14, @org.lwjgl.system.NativeType("GLsizei") int r15, @org.lwjgl.system.NativeType("GLsizei") int r16, @org.lwjgl.system.NativeType("GLenum") int r17, @org.lwjgl.system.NativeType("GLenum") int r18, @org.lwjgl.system.NativeType("void const *") java.nio.ShortBuffer r19) {
            r0 = r11
            r1 = r12
            r2 = r13
            r3 = r14
            r4 = r15
            r5 = r16
            r6 = r17
            r7 = r18
            r8 = r19
            long r8 = org.lwjgl.system.MemoryUtil.memAddress(r8)
            nglTexSubImage2D(r0, r1, r2, r3, r4, r5, r6, r7, r8)
            return
    }

    public static void glTexSubImage2D(@org.lwjgl.system.NativeType("GLenum") int r11, @org.lwjgl.system.NativeType("GLint") int r12, @org.lwjgl.system.NativeType("GLint") int r13, @org.lwjgl.system.NativeType("GLint") int r14, @org.lwjgl.system.NativeType("GLsizei") int r15, @org.lwjgl.system.NativeType("GLsizei") int r16, @org.lwjgl.system.NativeType("GLenum") int r17, @org.lwjgl.system.NativeType("GLenum") int r18, @org.lwjgl.system.NativeType("void const *") java.nio.IntBuffer r19) {
            r0 = r11
            r1 = r12
            r2 = r13
            r3 = r14
            r4 = r15
            r5 = r16
            r6 = r17
            r7 = r18
            r8 = r19
            long r8 = org.lwjgl.system.MemoryUtil.memAddress(r8)
            nglTexSubImage2D(r0, r1, r2, r3, r4, r5, r6, r7, r8)
            return
    }

    public static void glTexSubImage2D(@org.lwjgl.system.NativeType("GLenum") int r11, @org.lwjgl.system.NativeType("GLint") int r12, @org.lwjgl.system.NativeType("GLint") int r13, @org.lwjgl.system.NativeType("GLint") int r14, @org.lwjgl.system.NativeType("GLsizei") int r15, @org.lwjgl.system.NativeType("GLsizei") int r16, @org.lwjgl.system.NativeType("GLenum") int r17, @org.lwjgl.system.NativeType("GLenum") int r18, @org.lwjgl.system.NativeType("void const *") java.nio.FloatBuffer r19) {
            r0 = r11
            r1 = r12
            r2 = r13
            r3 = r14
            r4 = r15
            r5 = r16
            r6 = r17
            r7 = r18
            r8 = r19
            long r8 = org.lwjgl.system.MemoryUtil.memAddress(r8)
            nglTexSubImage2D(r0, r1, r2, r3, r4, r5, r6, r7, r8)
            return
    }

    public static void glTexSubImage2D(@org.lwjgl.system.NativeType("GLenum") int r11, @org.lwjgl.system.NativeType("GLint") int r12, @org.lwjgl.system.NativeType("GLint") int r13, @org.lwjgl.system.NativeType("GLint") int r14, @org.lwjgl.system.NativeType("GLsizei") int r15, @org.lwjgl.system.NativeType("GLsizei") int r16, @org.lwjgl.system.NativeType("GLenum") int r17, @org.lwjgl.system.NativeType("GLenum") int r18, @org.lwjgl.system.NativeType("void const *") java.nio.DoubleBuffer r19) {
            r0 = r11
            r1 = r12
            r2 = r13
            r3 = r14
            r4 = r15
            r5 = r16
            r6 = r17
            r7 = r18
            r8 = r19
            long r8 = org.lwjgl.system.MemoryUtil.memAddress(r8)
            nglTexSubImage2D(r0, r1, r2, r3, r4, r5, r6, r7, r8)
            return
    }

    public static native void glViewport(@org.lwjgl.system.NativeType("GLint") int r0, @org.lwjgl.system.NativeType("GLint") int r1, @org.lwjgl.system.NativeType("GLsizei") int r2, @org.lwjgl.system.NativeType("GLsizei") int r3);

    public static void glGenTextures(@org.lwjgl.system.NativeType("GLuint *") int[] r5) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glGenTextures
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

    public static void glDeleteTextures(@org.lwjgl.system.NativeType("GLuint const *") int[] r5) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glDeleteTextures
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

    public static void glGetFloatv(@org.lwjgl.system.NativeType("GLenum") int r5, @org.lwjgl.system.NativeType("GLfloat *") float[] r6) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glGetFloatv
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

    public static void glGetIntegerv(@org.lwjgl.system.NativeType("GLenum") int r5, @org.lwjgl.system.NativeType("GLint *") int[] r6) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glGetIntegerv
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

    public static void glGetDoublev(@org.lwjgl.system.NativeType("GLenum") int r5, @org.lwjgl.system.NativeType("GLdouble *") double[] r6) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glGetDoublev
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

    public static void glGetTexImage(@org.lwjgl.system.NativeType("GLenum") int r8, @org.lwjgl.system.NativeType("GLint") int r9, @org.lwjgl.system.NativeType("GLenum") int r10, @org.lwjgl.system.NativeType("GLenum") int r11, @org.lwjgl.system.NativeType("void *") short[] r12) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glGetTexImage
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

    public static void glGetTexImage(@org.lwjgl.system.NativeType("GLenum") int r8, @org.lwjgl.system.NativeType("GLint") int r9, @org.lwjgl.system.NativeType("GLenum") int r10, @org.lwjgl.system.NativeType("GLenum") int r11, @org.lwjgl.system.NativeType("void *") int[] r12) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glGetTexImage
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

    public static void glGetTexImage(@org.lwjgl.system.NativeType("GLenum") int r8, @org.lwjgl.system.NativeType("GLint") int r9, @org.lwjgl.system.NativeType("GLenum") int r10, @org.lwjgl.system.NativeType("GLenum") int r11, @org.lwjgl.system.NativeType("void *") float[] r12) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glGetTexImage
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

    public static void glGetTexImage(@org.lwjgl.system.NativeType("GLenum") int r8, @org.lwjgl.system.NativeType("GLint") int r9, @org.lwjgl.system.NativeType("GLenum") int r10, @org.lwjgl.system.NativeType("GLenum") int r11, @org.lwjgl.system.NativeType("void *") double[] r12) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glGetTexImage
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

    public static void glGetTexLevelParameteriv(@org.lwjgl.system.NativeType("GLenum") int r7, @org.lwjgl.system.NativeType("GLint") int r8, @org.lwjgl.system.NativeType("GLenum") int r9, @org.lwjgl.system.NativeType("GLint *") int[] r10) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glGetTexLevelParameteriv
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

    public static void glGetTexLevelParameterfv(@org.lwjgl.system.NativeType("GLenum") int r7, @org.lwjgl.system.NativeType("GLint") int r8, @org.lwjgl.system.NativeType("GLenum") int r9, @org.lwjgl.system.NativeType("GLfloat *") float[] r10) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glGetTexLevelParameterfv
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

    public static void glGetTexParameteriv(@org.lwjgl.system.NativeType("GLenum") int r6, @org.lwjgl.system.NativeType("GLenum") int r7, @org.lwjgl.system.NativeType("GLint *") int[] r8) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glGetTexParameteriv
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

    public static void glGetTexParameterfv(@org.lwjgl.system.NativeType("GLenum") int r6, @org.lwjgl.system.NativeType("GLenum") int r7, @org.lwjgl.system.NativeType("GLfloat *") float[] r8) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glGetTexParameterfv
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

    public static void glReadPixels(@org.lwjgl.system.NativeType("GLint") int r10, @org.lwjgl.system.NativeType("GLint") int r11, @org.lwjgl.system.NativeType("GLsizei") int r12, @org.lwjgl.system.NativeType("GLsizei") int r13, @org.lwjgl.system.NativeType("GLenum") int r14, @org.lwjgl.system.NativeType("GLenum") int r15, @org.lwjgl.system.NativeType("void *") short[] r16) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glReadPixels
            r17 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L14
            r0 = r17
            long r0 = org.lwjgl.system.Checks.check(r0)
        L14:
            r0 = r10
            r1 = r11
            r2 = r12
            r3 = r13
            r4 = r14
            r5 = r15
            r6 = r16
            r7 = r17
            org.lwjgl.system.JNI.callPV(r0, r1, r2, r3, r4, r5, r6, r7)
            return
    }

    public static void glReadPixels(@org.lwjgl.system.NativeType("GLint") int r10, @org.lwjgl.system.NativeType("GLint") int r11, @org.lwjgl.system.NativeType("GLsizei") int r12, @org.lwjgl.system.NativeType("GLsizei") int r13, @org.lwjgl.system.NativeType("GLenum") int r14, @org.lwjgl.system.NativeType("GLenum") int r15, @org.lwjgl.system.NativeType("void *") int[] r16) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glReadPixels
            r17 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L14
            r0 = r17
            long r0 = org.lwjgl.system.Checks.check(r0)
        L14:
            r0 = r10
            r1 = r11
            r2 = r12
            r3 = r13
            r4 = r14
            r5 = r15
            r6 = r16
            r7 = r17
            org.lwjgl.system.JNI.callPV(r0, r1, r2, r3, r4, r5, r6, r7)
            return
    }

    public static void glReadPixels(@org.lwjgl.system.NativeType("GLint") int r10, @org.lwjgl.system.NativeType("GLint") int r11, @org.lwjgl.system.NativeType("GLsizei") int r12, @org.lwjgl.system.NativeType("GLsizei") int r13, @org.lwjgl.system.NativeType("GLenum") int r14, @org.lwjgl.system.NativeType("GLenum") int r15, @org.lwjgl.system.NativeType("void *") float[] r16) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glReadPixels
            r17 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L14
            r0 = r17
            long r0 = org.lwjgl.system.Checks.check(r0)
        L14:
            r0 = r10
            r1 = r11
            r2 = r12
            r3 = r13
            r4 = r14
            r5 = r15
            r6 = r16
            r7 = r17
            org.lwjgl.system.JNI.callPV(r0, r1, r2, r3, r4, r5, r6, r7)
            return
    }

    public static void glTexImage1D(@org.lwjgl.system.NativeType("GLenum") int r11, @org.lwjgl.system.NativeType("GLint") int r12, @org.lwjgl.system.NativeType("GLint") int r13, @org.lwjgl.system.NativeType("GLsizei") int r14, @org.lwjgl.system.NativeType("GLint") int r15, @org.lwjgl.system.NativeType("GLenum") int r16, @org.lwjgl.system.NativeType("GLenum") int r17, @javax.annotation.Nullable @org.lwjgl.system.NativeType("void const *") short[] r18) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glTexImage1D
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

    public static void glTexImage1D(@org.lwjgl.system.NativeType("GLenum") int r11, @org.lwjgl.system.NativeType("GLint") int r12, @org.lwjgl.system.NativeType("GLint") int r13, @org.lwjgl.system.NativeType("GLsizei") int r14, @org.lwjgl.system.NativeType("GLint") int r15, @org.lwjgl.system.NativeType("GLenum") int r16, @org.lwjgl.system.NativeType("GLenum") int r17, @javax.annotation.Nullable @org.lwjgl.system.NativeType("void const *") int[] r18) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glTexImage1D
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

    public static void glTexImage1D(@org.lwjgl.system.NativeType("GLenum") int r11, @org.lwjgl.system.NativeType("GLint") int r12, @org.lwjgl.system.NativeType("GLint") int r13, @org.lwjgl.system.NativeType("GLsizei") int r14, @org.lwjgl.system.NativeType("GLint") int r15, @org.lwjgl.system.NativeType("GLenum") int r16, @org.lwjgl.system.NativeType("GLenum") int r17, @javax.annotation.Nullable @org.lwjgl.system.NativeType("void const *") float[] r18) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glTexImage1D
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

    public static void glTexImage1D(@org.lwjgl.system.NativeType("GLenum") int r11, @org.lwjgl.system.NativeType("GLint") int r12, @org.lwjgl.system.NativeType("GLint") int r13, @org.lwjgl.system.NativeType("GLsizei") int r14, @org.lwjgl.system.NativeType("GLint") int r15, @org.lwjgl.system.NativeType("GLenum") int r16, @org.lwjgl.system.NativeType("GLenum") int r17, @javax.annotation.Nullable @org.lwjgl.system.NativeType("void const *") double[] r18) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glTexImage1D
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

    public static void glTexImage2D(@org.lwjgl.system.NativeType("GLenum") int r12, @org.lwjgl.system.NativeType("GLint") int r13, @org.lwjgl.system.NativeType("GLint") int r14, @org.lwjgl.system.NativeType("GLsizei") int r15, @org.lwjgl.system.NativeType("GLsizei") int r16, @org.lwjgl.system.NativeType("GLint") int r17, @org.lwjgl.system.NativeType("GLenum") int r18, @org.lwjgl.system.NativeType("GLenum") int r19, @javax.annotation.Nullable @org.lwjgl.system.NativeType("void const *") short[] r20) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glTexImage2D
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

    public static void glTexImage2D(@org.lwjgl.system.NativeType("GLenum") int r12, @org.lwjgl.system.NativeType("GLint") int r13, @org.lwjgl.system.NativeType("GLint") int r14, @org.lwjgl.system.NativeType("GLsizei") int r15, @org.lwjgl.system.NativeType("GLsizei") int r16, @org.lwjgl.system.NativeType("GLint") int r17, @org.lwjgl.system.NativeType("GLenum") int r18, @org.lwjgl.system.NativeType("GLenum") int r19, @javax.annotation.Nullable @org.lwjgl.system.NativeType("void const *") int[] r20) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glTexImage2D
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

    public static void glTexImage2D(@org.lwjgl.system.NativeType("GLenum") int r12, @org.lwjgl.system.NativeType("GLint") int r13, @org.lwjgl.system.NativeType("GLint") int r14, @org.lwjgl.system.NativeType("GLsizei") int r15, @org.lwjgl.system.NativeType("GLsizei") int r16, @org.lwjgl.system.NativeType("GLint") int r17, @org.lwjgl.system.NativeType("GLenum") int r18, @org.lwjgl.system.NativeType("GLenum") int r19, @javax.annotation.Nullable @org.lwjgl.system.NativeType("void const *") float[] r20) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glTexImage2D
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

    public static void glTexImage2D(@org.lwjgl.system.NativeType("GLenum") int r12, @org.lwjgl.system.NativeType("GLint") int r13, @org.lwjgl.system.NativeType("GLint") int r14, @org.lwjgl.system.NativeType("GLsizei") int r15, @org.lwjgl.system.NativeType("GLsizei") int r16, @org.lwjgl.system.NativeType("GLint") int r17, @org.lwjgl.system.NativeType("GLenum") int r18, @org.lwjgl.system.NativeType("GLenum") int r19, @javax.annotation.Nullable @org.lwjgl.system.NativeType("void const *") double[] r20) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glTexImage2D
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

    public static void glTexParameteriv(@org.lwjgl.system.NativeType("GLenum") int r6, @org.lwjgl.system.NativeType("GLenum") int r7, @org.lwjgl.system.NativeType("GLint const *") int[] r8) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glTexParameteriv
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

    public static void glTexParameterfv(@org.lwjgl.system.NativeType("GLenum") int r6, @org.lwjgl.system.NativeType("GLenum") int r7, @org.lwjgl.system.NativeType("GLfloat const *") float[] r8) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glTexParameterfv
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

    public static void glTexSubImage1D(@org.lwjgl.system.NativeType("GLenum") int r10, @org.lwjgl.system.NativeType("GLint") int r11, @org.lwjgl.system.NativeType("GLint") int r12, @org.lwjgl.system.NativeType("GLsizei") int r13, @org.lwjgl.system.NativeType("GLenum") int r14, @org.lwjgl.system.NativeType("GLenum") int r15, @org.lwjgl.system.NativeType("void const *") short[] r16) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glTexSubImage1D
            r17 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L14
            r0 = r17
            long r0 = org.lwjgl.system.Checks.check(r0)
        L14:
            r0 = r10
            r1 = r11
            r2 = r12
            r3 = r13
            r4 = r14
            r5 = r15
            r6 = r16
            r7 = r17
            org.lwjgl.system.JNI.callPV(r0, r1, r2, r3, r4, r5, r6, r7)
            return
    }

    public static void glTexSubImage1D(@org.lwjgl.system.NativeType("GLenum") int r10, @org.lwjgl.system.NativeType("GLint") int r11, @org.lwjgl.system.NativeType("GLint") int r12, @org.lwjgl.system.NativeType("GLsizei") int r13, @org.lwjgl.system.NativeType("GLenum") int r14, @org.lwjgl.system.NativeType("GLenum") int r15, @org.lwjgl.system.NativeType("void const *") int[] r16) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glTexSubImage1D
            r17 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L14
            r0 = r17
            long r0 = org.lwjgl.system.Checks.check(r0)
        L14:
            r0 = r10
            r1 = r11
            r2 = r12
            r3 = r13
            r4 = r14
            r5 = r15
            r6 = r16
            r7 = r17
            org.lwjgl.system.JNI.callPV(r0, r1, r2, r3, r4, r5, r6, r7)
            return
    }

    public static void glTexSubImage1D(@org.lwjgl.system.NativeType("GLenum") int r10, @org.lwjgl.system.NativeType("GLint") int r11, @org.lwjgl.system.NativeType("GLint") int r12, @org.lwjgl.system.NativeType("GLsizei") int r13, @org.lwjgl.system.NativeType("GLenum") int r14, @org.lwjgl.system.NativeType("GLenum") int r15, @org.lwjgl.system.NativeType("void const *") float[] r16) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glTexSubImage1D
            r17 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L14
            r0 = r17
            long r0 = org.lwjgl.system.Checks.check(r0)
        L14:
            r0 = r10
            r1 = r11
            r2 = r12
            r3 = r13
            r4 = r14
            r5 = r15
            r6 = r16
            r7 = r17
            org.lwjgl.system.JNI.callPV(r0, r1, r2, r3, r4, r5, r6, r7)
            return
    }

    public static void glTexSubImage1D(@org.lwjgl.system.NativeType("GLenum") int r10, @org.lwjgl.system.NativeType("GLint") int r11, @org.lwjgl.system.NativeType("GLint") int r12, @org.lwjgl.system.NativeType("GLsizei") int r13, @org.lwjgl.system.NativeType("GLenum") int r14, @org.lwjgl.system.NativeType("GLenum") int r15, @org.lwjgl.system.NativeType("void const *") double[] r16) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glTexSubImage1D
            r17 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L14
            r0 = r17
            long r0 = org.lwjgl.system.Checks.check(r0)
        L14:
            r0 = r10
            r1 = r11
            r2 = r12
            r3 = r13
            r4 = r14
            r5 = r15
            r6 = r16
            r7 = r17
            org.lwjgl.system.JNI.callPV(r0, r1, r2, r3, r4, r5, r6, r7)
            return
    }

    public static void glTexSubImage2D(@org.lwjgl.system.NativeType("GLenum") int r12, @org.lwjgl.system.NativeType("GLint") int r13, @org.lwjgl.system.NativeType("GLint") int r14, @org.lwjgl.system.NativeType("GLint") int r15, @org.lwjgl.system.NativeType("GLsizei") int r16, @org.lwjgl.system.NativeType("GLsizei") int r17, @org.lwjgl.system.NativeType("GLenum") int r18, @org.lwjgl.system.NativeType("GLenum") int r19, @org.lwjgl.system.NativeType("void const *") short[] r20) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glTexSubImage2D
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

    public static void glTexSubImage2D(@org.lwjgl.system.NativeType("GLenum") int r12, @org.lwjgl.system.NativeType("GLint") int r13, @org.lwjgl.system.NativeType("GLint") int r14, @org.lwjgl.system.NativeType("GLint") int r15, @org.lwjgl.system.NativeType("GLsizei") int r16, @org.lwjgl.system.NativeType("GLsizei") int r17, @org.lwjgl.system.NativeType("GLenum") int r18, @org.lwjgl.system.NativeType("GLenum") int r19, @org.lwjgl.system.NativeType("void const *") int[] r20) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glTexSubImage2D
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

    public static void glTexSubImage2D(@org.lwjgl.system.NativeType("GLenum") int r12, @org.lwjgl.system.NativeType("GLint") int r13, @org.lwjgl.system.NativeType("GLint") int r14, @org.lwjgl.system.NativeType("GLint") int r15, @org.lwjgl.system.NativeType("GLsizei") int r16, @org.lwjgl.system.NativeType("GLsizei") int r17, @org.lwjgl.system.NativeType("GLenum") int r18, @org.lwjgl.system.NativeType("GLenum") int r19, @org.lwjgl.system.NativeType("void const *") float[] r20) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glTexSubImage2D
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

    public static void glTexSubImage2D(@org.lwjgl.system.NativeType("GLenum") int r12, @org.lwjgl.system.NativeType("GLint") int r13, @org.lwjgl.system.NativeType("GLint") int r14, @org.lwjgl.system.NativeType("GLint") int r15, @org.lwjgl.system.NativeType("GLsizei") int r16, @org.lwjgl.system.NativeType("GLsizei") int r17, @org.lwjgl.system.NativeType("GLenum") int r18, @org.lwjgl.system.NativeType("GLenum") int r19, @org.lwjgl.system.NativeType("void const *") double[] r20) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glTexSubImage2D
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

    static {
            org.lwjgl.opengl.GL.initialize()
            return
    }
}
