package org.lwjgl.opengl;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/opengl/GL14.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/opengl/GL14.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/opengl/GL14.class */
public class GL14 extends org.lwjgl.opengl.GL13 {
    public static final int GL_GENERATE_MIPMAP = 33169;
    public static final int GL_GENERATE_MIPMAP_HINT = 33170;
    public static final int GL_CONSTANT_COLOR = 32769;
    public static final int GL_ONE_MINUS_CONSTANT_COLOR = 32770;
    public static final int GL_CONSTANT_ALPHA = 32771;
    public static final int GL_ONE_MINUS_CONSTANT_ALPHA = 32772;
    public static final int GL_FUNC_ADD = 32774;
    public static final int GL_MIN = 32775;
    public static final int GL_MAX = 32776;
    public static final int GL_FUNC_SUBTRACT = 32778;
    public static final int GL_FUNC_REVERSE_SUBTRACT = 32779;
    public static final int GL_DEPTH_COMPONENT16 = 33189;
    public static final int GL_DEPTH_COMPONENT24 = 33190;
    public static final int GL_DEPTH_COMPONENT32 = 33191;
    public static final int GL_TEXTURE_DEPTH_SIZE = 34890;
    public static final int GL_DEPTH_TEXTURE_MODE = 34891;
    public static final int GL_TEXTURE_COMPARE_MODE = 34892;
    public static final int GL_TEXTURE_COMPARE_FUNC = 34893;
    public static final int GL_COMPARE_R_TO_TEXTURE = 34894;
    public static final int GL_FOG_COORDINATE_SOURCE = 33872;
    public static final int GL_FOG_COORDINATE = 33873;
    public static final int GL_FRAGMENT_DEPTH = 33874;
    public static final int GL_CURRENT_FOG_COORDINATE = 33875;
    public static final int GL_FOG_COORDINATE_ARRAY_TYPE = 33876;
    public static final int GL_FOG_COORDINATE_ARRAY_STRIDE = 33877;
    public static final int GL_FOG_COORDINATE_ARRAY_POINTER = 33878;
    public static final int GL_FOG_COORDINATE_ARRAY = 33879;
    public static final int GL_POINT_SIZE_MIN = 33062;
    public static final int GL_POINT_SIZE_MAX = 33063;
    public static final int GL_POINT_FADE_THRESHOLD_SIZE = 33064;
    public static final int GL_POINT_DISTANCE_ATTENUATION = 33065;
    public static final int GL_COLOR_SUM = 33880;
    public static final int GL_CURRENT_SECONDARY_COLOR = 33881;
    public static final int GL_SECONDARY_COLOR_ARRAY_SIZE = 33882;
    public static final int GL_SECONDARY_COLOR_ARRAY_TYPE = 33883;
    public static final int GL_SECONDARY_COLOR_ARRAY_STRIDE = 33884;
    public static final int GL_SECONDARY_COLOR_ARRAY_POINTER = 33885;
    public static final int GL_SECONDARY_COLOR_ARRAY = 33886;
    public static final int GL_BLEND_DST_RGB = 32968;
    public static final int GL_BLEND_SRC_RGB = 32969;
    public static final int GL_BLEND_DST_ALPHA = 32970;
    public static final int GL_BLEND_SRC_ALPHA = 32971;
    public static final int GL_INCR_WRAP = 34055;
    public static final int GL_DECR_WRAP = 34056;
    public static final int GL_TEXTURE_FILTER_CONTROL = 34048;
    public static final int GL_TEXTURE_LOD_BIAS = 34049;
    public static final int GL_MAX_TEXTURE_LOD_BIAS = 34045;
    public static final int GL_MIRRORED_REPEAT = 33648;

    protected GL14() {
            r3 = this;
            r0 = r3
            r0.<init>()
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r1 = r0
            r1.<init>()
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

    public static native void glFogCoordf(@org.lwjgl.system.NativeType("GLfloat") float r0);

    public static native void glFogCoordd(@org.lwjgl.system.NativeType("GLdouble") double r0);

    public static native void nglFogCoordfv(long r0);

    public static void glFogCoordfv(@org.lwjgl.system.NativeType("GLfloat const *") java.nio.FloatBuffer r3) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r3
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
        Lb:
            r0 = r3
            long r0 = org.lwjgl.system.MemoryUtil.memAddress(r0)
            nglFogCoordfv(r0)
            return
    }

    public static native void nglFogCoorddv(long r0);

    public static void glFogCoorddv(@org.lwjgl.system.NativeType("GLdouble const *") java.nio.DoubleBuffer r3) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r3
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
        Lb:
            r0 = r3
            long r0 = org.lwjgl.system.MemoryUtil.memAddress(r0)
            nglFogCoorddv(r0)
            return
    }

    public static native void nglFogCoordPointer(int r0, int r1, long r2);

    public static void glFogCoordPointer(@org.lwjgl.system.NativeType("GLenum") int r5, @org.lwjgl.system.NativeType("GLsizei") int r6, @org.lwjgl.system.NativeType("void const *") java.nio.ByteBuffer r7) {
            r0 = r5
            r1 = r6
            r2 = r7
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            nglFogCoordPointer(r0, r1, r2)
            return
    }

    public static void glFogCoordPointer(@org.lwjgl.system.NativeType("GLenum") int r5, @org.lwjgl.system.NativeType("GLsizei") int r6, @org.lwjgl.system.NativeType("void const *") long r7) {
            r0 = r5
            r1 = r6
            r2 = r7
            nglFogCoordPointer(r0, r1, r2)
            return
    }

    public static void glFogCoordPointer(@org.lwjgl.system.NativeType("GLenum") int r5, @org.lwjgl.system.NativeType("GLsizei") int r6, @org.lwjgl.system.NativeType("void const *") java.nio.ShortBuffer r7) {
            r0 = r5
            r1 = r6
            r2 = r7
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            nglFogCoordPointer(r0, r1, r2)
            return
    }

    public static void glFogCoordPointer(@org.lwjgl.system.NativeType("GLenum") int r5, @org.lwjgl.system.NativeType("GLsizei") int r6, @org.lwjgl.system.NativeType("void const *") java.nio.FloatBuffer r7) {
            r0 = r5
            r1 = r6
            r2 = r7
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            nglFogCoordPointer(r0, r1, r2)
            return
    }

    public static void nglMultiDrawArrays(int r7, long r8, long r10, int r12) {
            r0 = r7
            r1 = r8
            r2 = r10
            r3 = r12
            org.lwjgl.opengl.GL14C.nglMultiDrawArrays(r0, r1, r2, r3)
            return
    }

    public static void glMultiDrawArrays(@org.lwjgl.system.NativeType("GLenum") int r4, @org.lwjgl.system.NativeType("GLint const *") java.nio.IntBuffer r5, @org.lwjgl.system.NativeType("GLsizei const *") java.nio.IntBuffer r6) {
            r0 = r4
            r1 = r5
            r2 = r6
            org.lwjgl.opengl.GL14C.glMultiDrawArrays(r0, r1, r2)
            return
    }

    public static void nglMultiDrawElements(int r8, long r9, int r11, long r12, int r14) {
            r0 = r8
            r1 = r9
            r2 = r11
            r3 = r12
            r4 = r14
            org.lwjgl.opengl.GL14C.nglMultiDrawElements(r0, r1, r2, r3, r4)
            return
    }

    public static void glMultiDrawElements(@org.lwjgl.system.NativeType("GLenum") int r5, @org.lwjgl.system.NativeType("GLsizei *") java.nio.IntBuffer r6, @org.lwjgl.system.NativeType("GLenum") int r7, @org.lwjgl.system.NativeType("void const **") org.lwjgl.PointerBuffer r8) {
            r0 = r5
            r1 = r6
            r2 = r7
            r3 = r8
            org.lwjgl.opengl.GL14C.glMultiDrawElements(r0, r1, r2, r3)
            return
    }

    public static void glPointParameterf(@org.lwjgl.system.NativeType("GLenum") int r3, @org.lwjgl.system.NativeType("GLfloat") float r4) {
            r0 = r3
            r1 = r4
            org.lwjgl.opengl.GL14C.glPointParameterf(r0, r1)
            return
    }

    public static void glPointParameteri(@org.lwjgl.system.NativeType("GLenum") int r3, @org.lwjgl.system.NativeType("GLint") int r4) {
            r0 = r3
            r1 = r4
            org.lwjgl.opengl.GL14C.glPointParameteri(r0, r1)
            return
    }

    public static void nglPointParameterfv(int r4, long r5) {
            r0 = r4
            r1 = r5
            org.lwjgl.opengl.GL14C.nglPointParameterfv(r0, r1)
            return
    }

    public static void glPointParameterfv(@org.lwjgl.system.NativeType("GLenum") int r3, @org.lwjgl.system.NativeType("GLfloat const *") java.nio.FloatBuffer r4) {
            r0 = r3
            r1 = r4
            org.lwjgl.opengl.GL14C.glPointParameterfv(r0, r1)
            return
    }

    public static void nglPointParameteriv(int r4, long r5) {
            r0 = r4
            r1 = r5
            org.lwjgl.opengl.GL14C.nglPointParameteriv(r0, r1)
            return
    }

    public static void glPointParameteriv(@org.lwjgl.system.NativeType("GLenum") int r3, @org.lwjgl.system.NativeType("GLint const *") java.nio.IntBuffer r4) {
            r0 = r3
            r1 = r4
            org.lwjgl.opengl.GL14C.glPointParameteriv(r0, r1)
            return
    }

    public static native void glSecondaryColor3b(@org.lwjgl.system.NativeType("GLbyte") byte r0, @org.lwjgl.system.NativeType("GLbyte") byte r1, @org.lwjgl.system.NativeType("GLbyte") byte r2);

    public static native void glSecondaryColor3s(@org.lwjgl.system.NativeType("GLshort") short r0, @org.lwjgl.system.NativeType("GLshort") short r1, @org.lwjgl.system.NativeType("GLshort") short r2);

    public static native void glSecondaryColor3i(@org.lwjgl.system.NativeType("GLint") int r0, @org.lwjgl.system.NativeType("GLint") int r1, @org.lwjgl.system.NativeType("GLint") int r2);

    public static native void glSecondaryColor3f(@org.lwjgl.system.NativeType("GLfloat") float r0, @org.lwjgl.system.NativeType("GLfloat") float r1, @org.lwjgl.system.NativeType("GLfloat") float r2);

    public static native void glSecondaryColor3d(@org.lwjgl.system.NativeType("GLdouble") double r0, @org.lwjgl.system.NativeType("GLdouble") double r2, @org.lwjgl.system.NativeType("GLdouble") double r4);

    public static native void glSecondaryColor3ub(@org.lwjgl.system.NativeType("GLubyte") byte r0, @org.lwjgl.system.NativeType("GLubyte") byte r1, @org.lwjgl.system.NativeType("GLubyte") byte r2);

    public static native void glSecondaryColor3us(@org.lwjgl.system.NativeType("GLushort") short r0, @org.lwjgl.system.NativeType("GLushort") short r1, @org.lwjgl.system.NativeType("GLushort") short r2);

    public static native void glSecondaryColor3ui(@org.lwjgl.system.NativeType("GLint") int r0, @org.lwjgl.system.NativeType("GLint") int r1, @org.lwjgl.system.NativeType("GLint") int r2);

    public static native void nglSecondaryColor3bv(long r0);

    public static void glSecondaryColor3bv(@org.lwjgl.system.NativeType("GLbyte const *") java.nio.ByteBuffer r3) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r3
            r1 = 3
            org.lwjgl.system.Checks.check(r0, r1)
        Lb:
            r0 = r3
            long r0 = org.lwjgl.system.MemoryUtil.memAddress(r0)
            nglSecondaryColor3bv(r0)
            return
    }

    public static native void nglSecondaryColor3sv(long r0);

    public static void glSecondaryColor3sv(@org.lwjgl.system.NativeType("GLshort const *") java.nio.ShortBuffer r3) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r3
            r1 = 3
            org.lwjgl.system.Checks.check(r0, r1)
        Lb:
            r0 = r3
            long r0 = org.lwjgl.system.MemoryUtil.memAddress(r0)
            nglSecondaryColor3sv(r0)
            return
    }

    public static native void nglSecondaryColor3iv(long r0);

    public static void glSecondaryColor3iv(@org.lwjgl.system.NativeType("GLint const *") java.nio.IntBuffer r3) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r3
            r1 = 3
            org.lwjgl.system.Checks.check(r0, r1)
        Lb:
            r0 = r3
            long r0 = org.lwjgl.system.MemoryUtil.memAddress(r0)
            nglSecondaryColor3iv(r0)
            return
    }

    public static native void nglSecondaryColor3fv(long r0);

    public static void glSecondaryColor3fv(@org.lwjgl.system.NativeType("GLfloat const *") java.nio.FloatBuffer r3) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r3
            r1 = 3
            org.lwjgl.system.Checks.check(r0, r1)
        Lb:
            r0 = r3
            long r0 = org.lwjgl.system.MemoryUtil.memAddress(r0)
            nglSecondaryColor3fv(r0)
            return
    }

    public static native void nglSecondaryColor3dv(long r0);

    public static void glSecondaryColor3dv(@org.lwjgl.system.NativeType("GLdouble const *") java.nio.DoubleBuffer r3) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r3
            r1 = 3
            org.lwjgl.system.Checks.check(r0, r1)
        Lb:
            r0 = r3
            long r0 = org.lwjgl.system.MemoryUtil.memAddress(r0)
            nglSecondaryColor3dv(r0)
            return
    }

    public static native void nglSecondaryColor3ubv(long r0);

    public static void glSecondaryColor3ubv(@org.lwjgl.system.NativeType("GLubyte const *") java.nio.ByteBuffer r3) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r3
            r1 = 3
            org.lwjgl.system.Checks.check(r0, r1)
        Lb:
            r0 = r3
            long r0 = org.lwjgl.system.MemoryUtil.memAddress(r0)
            nglSecondaryColor3ubv(r0)
            return
    }

    public static native void nglSecondaryColor3usv(long r0);

    public static void glSecondaryColor3usv(@org.lwjgl.system.NativeType("GLushort const *") java.nio.ShortBuffer r3) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r3
            r1 = 3
            org.lwjgl.system.Checks.check(r0, r1)
        Lb:
            r0 = r3
            long r0 = org.lwjgl.system.MemoryUtil.memAddress(r0)
            nglSecondaryColor3usv(r0)
            return
    }

    public static native void nglSecondaryColor3uiv(long r0);

    public static void glSecondaryColor3uiv(@org.lwjgl.system.NativeType("GLuint const *") java.nio.IntBuffer r3) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r3
            r1 = 3
            org.lwjgl.system.Checks.check(r0, r1)
        Lb:
            r0 = r3
            long r0 = org.lwjgl.system.MemoryUtil.memAddress(r0)
            nglSecondaryColor3uiv(r0)
            return
    }

    public static native void nglSecondaryColorPointer(int r0, int r1, int r2, long r3);

    public static void glSecondaryColorPointer(@org.lwjgl.system.NativeType("GLint") int r6, @org.lwjgl.system.NativeType("GLenum") int r7, @org.lwjgl.system.NativeType("GLsizei") int r8, @org.lwjgl.system.NativeType("void const *") java.nio.ByteBuffer r9) {
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            long r3 = org.lwjgl.system.MemoryUtil.memAddress(r3)
            nglSecondaryColorPointer(r0, r1, r2, r3)
            return
    }

    public static void glSecondaryColorPointer(@org.lwjgl.system.NativeType("GLint") int r6, @org.lwjgl.system.NativeType("GLenum") int r7, @org.lwjgl.system.NativeType("GLsizei") int r8, @org.lwjgl.system.NativeType("void const *") long r9) {
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            nglSecondaryColorPointer(r0, r1, r2, r3)
            return
    }

    public static void glSecondaryColorPointer(@org.lwjgl.system.NativeType("GLint") int r6, @org.lwjgl.system.NativeType("GLenum") int r7, @org.lwjgl.system.NativeType("GLsizei") int r8, @org.lwjgl.system.NativeType("void const *") java.nio.ShortBuffer r9) {
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            long r3 = org.lwjgl.system.MemoryUtil.memAddress(r3)
            nglSecondaryColorPointer(r0, r1, r2, r3)
            return
    }

    public static void glSecondaryColorPointer(@org.lwjgl.system.NativeType("GLint") int r6, @org.lwjgl.system.NativeType("GLenum") int r7, @org.lwjgl.system.NativeType("GLsizei") int r8, @org.lwjgl.system.NativeType("void const *") java.nio.IntBuffer r9) {
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            long r3 = org.lwjgl.system.MemoryUtil.memAddress(r3)
            nglSecondaryColorPointer(r0, r1, r2, r3)
            return
    }

    public static void glSecondaryColorPointer(@org.lwjgl.system.NativeType("GLint") int r6, @org.lwjgl.system.NativeType("GLenum") int r7, @org.lwjgl.system.NativeType("GLsizei") int r8, @org.lwjgl.system.NativeType("void const *") java.nio.FloatBuffer r9) {
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            long r3 = org.lwjgl.system.MemoryUtil.memAddress(r3)
            nglSecondaryColorPointer(r0, r1, r2, r3)
            return
    }

    public static void glBlendFuncSeparate(@org.lwjgl.system.NativeType("GLenum") int r5, @org.lwjgl.system.NativeType("GLenum") int r6, @org.lwjgl.system.NativeType("GLenum") int r7, @org.lwjgl.system.NativeType("GLenum") int r8) {
            r0 = r5
            r1 = r6
            r2 = r7
            r3 = r8
            org.lwjgl.opengl.GL14C.glBlendFuncSeparate(r0, r1, r2, r3)
            return
    }

    public static native void glWindowPos2i(@org.lwjgl.system.NativeType("GLint") int r0, @org.lwjgl.system.NativeType("GLint") int r1);

    public static native void glWindowPos2s(@org.lwjgl.system.NativeType("GLshort") short r0, @org.lwjgl.system.NativeType("GLshort") short r1);

    public static native void glWindowPos2f(@org.lwjgl.system.NativeType("GLfloat") float r0, @org.lwjgl.system.NativeType("GLfloat") float r1);

    public static native void glWindowPos2d(@org.lwjgl.system.NativeType("GLdouble") double r0, @org.lwjgl.system.NativeType("GLdouble") double r2);

    public static native void nglWindowPos2iv(long r0);

    public static void glWindowPos2iv(@org.lwjgl.system.NativeType("GLint const *") java.nio.IntBuffer r3) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r3
            r1 = 2
            org.lwjgl.system.Checks.check(r0, r1)
        Lb:
            r0 = r3
            long r0 = org.lwjgl.system.MemoryUtil.memAddress(r0)
            nglWindowPos2iv(r0)
            return
    }

    public static native void nglWindowPos2sv(long r0);

    public static void glWindowPos2sv(@org.lwjgl.system.NativeType("GLshort const *") java.nio.ShortBuffer r3) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r3
            r1 = 2
            org.lwjgl.system.Checks.check(r0, r1)
        Lb:
            r0 = r3
            long r0 = org.lwjgl.system.MemoryUtil.memAddress(r0)
            nglWindowPos2sv(r0)
            return
    }

    public static native void nglWindowPos2fv(long r0);

    public static void glWindowPos2fv(@org.lwjgl.system.NativeType("GLfloat const *") java.nio.FloatBuffer r3) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r3
            r1 = 2
            org.lwjgl.system.Checks.check(r0, r1)
        Lb:
            r0 = r3
            long r0 = org.lwjgl.system.MemoryUtil.memAddress(r0)
            nglWindowPos2fv(r0)
            return
    }

    public static native void nglWindowPos2dv(long r0);

    public static void glWindowPos2dv(@org.lwjgl.system.NativeType("GLdouble const *") java.nio.DoubleBuffer r3) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r3
            r1 = 2
            org.lwjgl.system.Checks.check(r0, r1)
        Lb:
            r0 = r3
            long r0 = org.lwjgl.system.MemoryUtil.memAddress(r0)
            nglWindowPos2dv(r0)
            return
    }

    public static native void glWindowPos3i(@org.lwjgl.system.NativeType("GLint") int r0, @org.lwjgl.system.NativeType("GLint") int r1, @org.lwjgl.system.NativeType("GLint") int r2);

    public static native void glWindowPos3s(@org.lwjgl.system.NativeType("GLshort") short r0, @org.lwjgl.system.NativeType("GLshort") short r1, @org.lwjgl.system.NativeType("GLshort") short r2);

    public static native void glWindowPos3f(@org.lwjgl.system.NativeType("GLfloat") float r0, @org.lwjgl.system.NativeType("GLfloat") float r1, @org.lwjgl.system.NativeType("GLfloat") float r2);

    public static native void glWindowPos3d(@org.lwjgl.system.NativeType("GLdouble") double r0, @org.lwjgl.system.NativeType("GLdouble") double r2, @org.lwjgl.system.NativeType("GLdouble") double r4);

    public static native void nglWindowPos3iv(long r0);

    public static void glWindowPos3iv(@org.lwjgl.system.NativeType("GLint const *") java.nio.IntBuffer r3) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r3
            r1 = 3
            org.lwjgl.system.Checks.check(r0, r1)
        Lb:
            r0 = r3
            long r0 = org.lwjgl.system.MemoryUtil.memAddress(r0)
            nglWindowPos3iv(r0)
            return
    }

    public static native void nglWindowPos3sv(long r0);

    public static void glWindowPos3sv(@org.lwjgl.system.NativeType("GLshort const *") java.nio.ShortBuffer r3) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r3
            r1 = 3
            org.lwjgl.system.Checks.check(r0, r1)
        Lb:
            r0 = r3
            long r0 = org.lwjgl.system.MemoryUtil.memAddress(r0)
            nglWindowPos3sv(r0)
            return
    }

    public static native void nglWindowPos3fv(long r0);

    public static void glWindowPos3fv(@org.lwjgl.system.NativeType("GLfloat const *") java.nio.FloatBuffer r3) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r3
            r1 = 3
            org.lwjgl.system.Checks.check(r0, r1)
        Lb:
            r0 = r3
            long r0 = org.lwjgl.system.MemoryUtil.memAddress(r0)
            nglWindowPos3fv(r0)
            return
    }

    public static native void nglWindowPos3dv(long r0);

    public static void glWindowPos3dv(@org.lwjgl.system.NativeType("GLdouble const *") java.nio.DoubleBuffer r3) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r3
            r1 = 3
            org.lwjgl.system.Checks.check(r0, r1)
        Lb:
            r0 = r3
            long r0 = org.lwjgl.system.MemoryUtil.memAddress(r0)
            nglWindowPos3dv(r0)
            return
    }

    public static void glFogCoordfv(@org.lwjgl.system.NativeType("GLfloat const *") float[] r4) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glFogCoordfv
            r5 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L17
            r0 = r5
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r4
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
        L17:
            r0 = r4
            r1 = r5
            org.lwjgl.system.JNI.callPV(r0, r1)
            return
    }

    public static void glFogCoorddv(@org.lwjgl.system.NativeType("GLdouble const *") double[] r4) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glFogCoorddv
            r5 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L17
            r0 = r5
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r4
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
        L17:
            r0 = r4
            r1 = r5
            org.lwjgl.system.JNI.callPV(r0, r1)
            return
    }

    public static void glMultiDrawArrays(@org.lwjgl.system.NativeType("GLenum") int r4, @org.lwjgl.system.NativeType("GLint const *") int[] r5, @org.lwjgl.system.NativeType("GLsizei const *") int[] r6) {
            r0 = r4
            r1 = r5
            r2 = r6
            org.lwjgl.opengl.GL14C.glMultiDrawArrays(r0, r1, r2)
            return
    }

    public static void glMultiDrawElements(@org.lwjgl.system.NativeType("GLenum") int r5, @org.lwjgl.system.NativeType("GLsizei *") int[] r6, @org.lwjgl.system.NativeType("GLenum") int r7, @org.lwjgl.system.NativeType("void const **") org.lwjgl.PointerBuffer r8) {
            r0 = r5
            r1 = r6
            r2 = r7
            r3 = r8
            org.lwjgl.opengl.GL14C.glMultiDrawElements(r0, r1, r2, r3)
            return
    }

    public static void glPointParameterfv(@org.lwjgl.system.NativeType("GLenum") int r3, @org.lwjgl.system.NativeType("GLfloat const *") float[] r4) {
            r0 = r3
            r1 = r4
            org.lwjgl.opengl.GL14C.glPointParameterfv(r0, r1)
            return
    }

    public static void glPointParameteriv(@org.lwjgl.system.NativeType("GLenum") int r3, @org.lwjgl.system.NativeType("GLint const *") int[] r4) {
            r0 = r3
            r1 = r4
            org.lwjgl.opengl.GL14C.glPointParameteriv(r0, r1)
            return
    }

    public static void glSecondaryColor3sv(@org.lwjgl.system.NativeType("GLshort const *") short[] r4) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glSecondaryColor3sv
            r5 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L17
            r0 = r5
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r4
            r1 = 3
            org.lwjgl.system.Checks.check(r0, r1)
        L17:
            r0 = r4
            r1 = r5
            org.lwjgl.system.JNI.callPV(r0, r1)
            return
    }

    public static void glSecondaryColor3iv(@org.lwjgl.system.NativeType("GLint const *") int[] r4) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glSecondaryColor3iv
            r5 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L17
            r0 = r5
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r4
            r1 = 3
            org.lwjgl.system.Checks.check(r0, r1)
        L17:
            r0 = r4
            r1 = r5
            org.lwjgl.system.JNI.callPV(r0, r1)
            return
    }

    public static void glSecondaryColor3fv(@org.lwjgl.system.NativeType("GLfloat const *") float[] r4) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glSecondaryColor3fv
            r5 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L17
            r0 = r5
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r4
            r1 = 3
            org.lwjgl.system.Checks.check(r0, r1)
        L17:
            r0 = r4
            r1 = r5
            org.lwjgl.system.JNI.callPV(r0, r1)
            return
    }

    public static void glSecondaryColor3dv(@org.lwjgl.system.NativeType("GLdouble const *") double[] r4) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glSecondaryColor3dv
            r5 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L17
            r0 = r5
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r4
            r1 = 3
            org.lwjgl.system.Checks.check(r0, r1)
        L17:
            r0 = r4
            r1 = r5
            org.lwjgl.system.JNI.callPV(r0, r1)
            return
    }

    public static void glSecondaryColor3usv(@org.lwjgl.system.NativeType("GLushort const *") short[] r4) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glSecondaryColor3usv
            r5 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L17
            r0 = r5
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r4
            r1 = 3
            org.lwjgl.system.Checks.check(r0, r1)
        L17:
            r0 = r4
            r1 = r5
            org.lwjgl.system.JNI.callPV(r0, r1)
            return
    }

    public static void glSecondaryColor3uiv(@org.lwjgl.system.NativeType("GLuint const *") int[] r4) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glSecondaryColor3uiv
            r5 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L17
            r0 = r5
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r4
            r1 = 3
            org.lwjgl.system.Checks.check(r0, r1)
        L17:
            r0 = r4
            r1 = r5
            org.lwjgl.system.JNI.callPV(r0, r1)
            return
    }

    public static void glWindowPos2iv(@org.lwjgl.system.NativeType("GLint const *") int[] r4) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glWindowPos2iv
            r5 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L17
            r0 = r5
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r4
            r1 = 2
            org.lwjgl.system.Checks.check(r0, r1)
        L17:
            r0 = r4
            r1 = r5
            org.lwjgl.system.JNI.callPV(r0, r1)
            return
    }

    public static void glWindowPos2sv(@org.lwjgl.system.NativeType("GLshort const *") short[] r4) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glWindowPos2sv
            r5 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L17
            r0 = r5
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r4
            r1 = 2
            org.lwjgl.system.Checks.check(r0, r1)
        L17:
            r0 = r4
            r1 = r5
            org.lwjgl.system.JNI.callPV(r0, r1)
            return
    }

    public static void glWindowPos2fv(@org.lwjgl.system.NativeType("GLfloat const *") float[] r4) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glWindowPos2fv
            r5 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L17
            r0 = r5
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r4
            r1 = 2
            org.lwjgl.system.Checks.check(r0, r1)
        L17:
            r0 = r4
            r1 = r5
            org.lwjgl.system.JNI.callPV(r0, r1)
            return
    }

    public static void glWindowPos2dv(@org.lwjgl.system.NativeType("GLdouble const *") double[] r4) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glWindowPos2dv
            r5 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L17
            r0 = r5
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r4
            r1 = 2
            org.lwjgl.system.Checks.check(r0, r1)
        L17:
            r0 = r4
            r1 = r5
            org.lwjgl.system.JNI.callPV(r0, r1)
            return
    }

    public static void glWindowPos3iv(@org.lwjgl.system.NativeType("GLint const *") int[] r4) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glWindowPos3iv
            r5 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L17
            r0 = r5
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r4
            r1 = 3
            org.lwjgl.system.Checks.check(r0, r1)
        L17:
            r0 = r4
            r1 = r5
            org.lwjgl.system.JNI.callPV(r0, r1)
            return
    }

    public static void glWindowPos3sv(@org.lwjgl.system.NativeType("GLshort const *") short[] r4) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glWindowPos3sv
            r5 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L17
            r0 = r5
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r4
            r1 = 3
            org.lwjgl.system.Checks.check(r0, r1)
        L17:
            r0 = r4
            r1 = r5
            org.lwjgl.system.JNI.callPV(r0, r1)
            return
    }

    public static void glWindowPos3fv(@org.lwjgl.system.NativeType("GLfloat const *") float[] r4) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glWindowPos3fv
            r5 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L17
            r0 = r5
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r4
            r1 = 3
            org.lwjgl.system.Checks.check(r0, r1)
        L17:
            r0 = r4
            r1 = r5
            org.lwjgl.system.JNI.callPV(r0, r1)
            return
    }

    public static void glWindowPos3dv(@org.lwjgl.system.NativeType("GLdouble const *") double[] r4) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glWindowPos3dv
            r5 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L17
            r0 = r5
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r4
            r1 = 3
            org.lwjgl.system.Checks.check(r0, r1)
        L17:
            r0 = r4
            r1 = r5
            org.lwjgl.system.JNI.callPV(r0, r1)
            return
    }

    static {
            org.lwjgl.opengl.GL.initialize()
            return
    }
}
