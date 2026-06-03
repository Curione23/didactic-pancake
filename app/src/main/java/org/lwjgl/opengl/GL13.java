package org.lwjgl.opengl;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/opengl/GL13.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/opengl/GL13.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/opengl/GL13.class */
public class GL13 extends org.lwjgl.opengl.GL12 {
    public static final int GL_COMPRESSED_ALPHA = 34025;
    public static final int GL_COMPRESSED_LUMINANCE = 34026;
    public static final int GL_COMPRESSED_LUMINANCE_ALPHA = 34027;
    public static final int GL_COMPRESSED_INTENSITY = 34028;
    public static final int GL_COMPRESSED_RGB = 34029;
    public static final int GL_COMPRESSED_RGBA = 34030;
    public static final int GL_TEXTURE_COMPRESSION_HINT = 34031;
    public static final int GL_TEXTURE_COMPRESSED_IMAGE_SIZE = 34464;
    public static final int GL_TEXTURE_COMPRESSED = 34465;
    public static final int GL_NUM_COMPRESSED_TEXTURE_FORMATS = 34466;
    public static final int GL_COMPRESSED_TEXTURE_FORMATS = 34467;
    public static final int GL_NORMAL_MAP = 34065;
    public static final int GL_REFLECTION_MAP = 34066;
    public static final int GL_TEXTURE_CUBE_MAP = 34067;
    public static final int GL_TEXTURE_BINDING_CUBE_MAP = 34068;
    public static final int GL_TEXTURE_CUBE_MAP_POSITIVE_X = 34069;
    public static final int GL_TEXTURE_CUBE_MAP_NEGATIVE_X = 34070;
    public static final int GL_TEXTURE_CUBE_MAP_POSITIVE_Y = 34071;
    public static final int GL_TEXTURE_CUBE_MAP_NEGATIVE_Y = 34072;
    public static final int GL_TEXTURE_CUBE_MAP_POSITIVE_Z = 34073;
    public static final int GL_TEXTURE_CUBE_MAP_NEGATIVE_Z = 34074;
    public static final int GL_PROXY_TEXTURE_CUBE_MAP = 34075;
    public static final int GL_MAX_CUBE_MAP_TEXTURE_SIZE = 34076;
    public static final int GL_MULTISAMPLE = 32925;
    public static final int GL_SAMPLE_ALPHA_TO_COVERAGE = 32926;
    public static final int GL_SAMPLE_ALPHA_TO_ONE = 32927;
    public static final int GL_SAMPLE_COVERAGE = 32928;
    public static final int GL_MULTISAMPLE_BIT = 536870912;
    public static final int GL_SAMPLE_BUFFERS = 32936;
    public static final int GL_SAMPLES = 32937;
    public static final int GL_SAMPLE_COVERAGE_VALUE = 32938;
    public static final int GL_SAMPLE_COVERAGE_INVERT = 32939;
    public static final int GL_TEXTURE0 = 33984;
    public static final int GL_TEXTURE1 = 33985;
    public static final int GL_TEXTURE2 = 33986;
    public static final int GL_TEXTURE3 = 33987;
    public static final int GL_TEXTURE4 = 33988;
    public static final int GL_TEXTURE5 = 33989;
    public static final int GL_TEXTURE6 = 33990;
    public static final int GL_TEXTURE7 = 33991;
    public static final int GL_TEXTURE8 = 33992;
    public static final int GL_TEXTURE9 = 33993;
    public static final int GL_TEXTURE10 = 33994;
    public static final int GL_TEXTURE11 = 33995;
    public static final int GL_TEXTURE12 = 33996;
    public static final int GL_TEXTURE13 = 33997;
    public static final int GL_TEXTURE14 = 33998;
    public static final int GL_TEXTURE15 = 33999;
    public static final int GL_TEXTURE16 = 34000;
    public static final int GL_TEXTURE17 = 34001;
    public static final int GL_TEXTURE18 = 34002;
    public static final int GL_TEXTURE19 = 34003;
    public static final int GL_TEXTURE20 = 34004;
    public static final int GL_TEXTURE21 = 34005;
    public static final int GL_TEXTURE22 = 34006;
    public static final int GL_TEXTURE23 = 34007;
    public static final int GL_TEXTURE24 = 34008;
    public static final int GL_TEXTURE25 = 34009;
    public static final int GL_TEXTURE26 = 34010;
    public static final int GL_TEXTURE27 = 34011;
    public static final int GL_TEXTURE28 = 34012;
    public static final int GL_TEXTURE29 = 34013;
    public static final int GL_TEXTURE30 = 34014;
    public static final int GL_TEXTURE31 = 34015;
    public static final int GL_ACTIVE_TEXTURE = 34016;
    public static final int GL_CLIENT_ACTIVE_TEXTURE = 34017;
    public static final int GL_MAX_TEXTURE_UNITS = 34018;
    public static final int GL_COMBINE = 34160;
    public static final int GL_COMBINE_RGB = 34161;
    public static final int GL_COMBINE_ALPHA = 34162;
    public static final int GL_SOURCE0_RGB = 34176;
    public static final int GL_SOURCE1_RGB = 34177;
    public static final int GL_SOURCE2_RGB = 34178;
    public static final int GL_SOURCE0_ALPHA = 34184;
    public static final int GL_SOURCE1_ALPHA = 34185;
    public static final int GL_SOURCE2_ALPHA = 34186;
    public static final int GL_OPERAND0_RGB = 34192;
    public static final int GL_OPERAND1_RGB = 34193;
    public static final int GL_OPERAND2_RGB = 34194;
    public static final int GL_OPERAND0_ALPHA = 34200;
    public static final int GL_OPERAND1_ALPHA = 34201;
    public static final int GL_OPERAND2_ALPHA = 34202;
    public static final int GL_RGB_SCALE = 34163;
    public static final int GL_ADD_SIGNED = 34164;
    public static final int GL_INTERPOLATE = 34165;
    public static final int GL_SUBTRACT = 34023;
    public static final int GL_CONSTANT = 34166;
    public static final int GL_PRIMARY_COLOR = 34167;
    public static final int GL_PREVIOUS = 34168;
    public static final int GL_DOT3_RGB = 34478;
    public static final int GL_DOT3_RGBA = 34479;
    public static final int GL_CLAMP_TO_BORDER = 33069;
    public static final int GL_TRANSPOSE_MODELVIEW_MATRIX = 34019;
    public static final int GL_TRANSPOSE_PROJECTION_MATRIX = 34020;
    public static final int GL_TRANSPOSE_TEXTURE_MATRIX = 34021;
    public static final int GL_TRANSPOSE_COLOR_MATRIX = 34022;

    protected GL13() {
            r3 = this;
            r0 = r3
            r0.<init>()
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r1 = r0
            r1.<init>()
            throw r0
    }

    public static void nglCompressedTexImage3D(int r11, int r12, int r13, int r14, int r15, int r16, int r17, int r18, long r19) {
            r0 = r11
            r1 = r12
            r2 = r13
            r3 = r14
            r4 = r15
            r5 = r16
            r6 = r17
            r7 = r18
            r8 = r19
            org.lwjgl.opengl.GL13C.nglCompressedTexImage3D(r0, r1, r2, r3, r4, r5, r6, r7, r8)
            return
    }

    public static void glCompressedTexImage3D(@org.lwjgl.system.NativeType("GLenum") int r11, @org.lwjgl.system.NativeType("GLint") int r12, @org.lwjgl.system.NativeType("GLenum") int r13, @org.lwjgl.system.NativeType("GLsizei") int r14, @org.lwjgl.system.NativeType("GLsizei") int r15, @org.lwjgl.system.NativeType("GLsizei") int r16, @org.lwjgl.system.NativeType("GLint") int r17, @org.lwjgl.system.NativeType("GLsizei") int r18, @org.lwjgl.system.NativeType("void const *") long r19) {
            r0 = r11
            r1 = r12
            r2 = r13
            r3 = r14
            r4 = r15
            r5 = r16
            r6 = r17
            r7 = r18
            r8 = r19
            org.lwjgl.opengl.GL13C.glCompressedTexImage3D(r0, r1, r2, r3, r4, r5, r6, r7, r8)
            return
    }

    public static void glCompressedTexImage3D(@org.lwjgl.system.NativeType("GLenum") int r9, @org.lwjgl.system.NativeType("GLint") int r10, @org.lwjgl.system.NativeType("GLenum") int r11, @org.lwjgl.system.NativeType("GLsizei") int r12, @org.lwjgl.system.NativeType("GLsizei") int r13, @org.lwjgl.system.NativeType("GLsizei") int r14, @org.lwjgl.system.NativeType("GLint") int r15, @javax.annotation.Nullable @org.lwjgl.system.NativeType("void const *") java.nio.ByteBuffer r16) {
            r0 = r9
            r1 = r10
            r2 = r11
            r3 = r12
            r4 = r13
            r5 = r14
            r6 = r15
            r7 = r16
            org.lwjgl.opengl.GL13C.glCompressedTexImage3D(r0, r1, r2, r3, r4, r5, r6, r7)
            return
    }

    public static void nglCompressedTexImage2D(int r10, int r11, int r12, int r13, int r14, int r15, int r16, long r17) {
            r0 = r10
            r1 = r11
            r2 = r12
            r3 = r13
            r4 = r14
            r5 = r15
            r6 = r16
            r7 = r17
            org.lwjgl.opengl.GL13C.nglCompressedTexImage2D(r0, r1, r2, r3, r4, r5, r6, r7)
            return
    }

    public static void glCompressedTexImage2D(@org.lwjgl.system.NativeType("GLenum") int r10, @org.lwjgl.system.NativeType("GLint") int r11, @org.lwjgl.system.NativeType("GLenum") int r12, @org.lwjgl.system.NativeType("GLsizei") int r13, @org.lwjgl.system.NativeType("GLsizei") int r14, @org.lwjgl.system.NativeType("GLint") int r15, @org.lwjgl.system.NativeType("GLsizei") int r16, @org.lwjgl.system.NativeType("void const *") long r17) {
            r0 = r10
            r1 = r11
            r2 = r12
            r3 = r13
            r4 = r14
            r5 = r15
            r6 = r16
            r7 = r17
            org.lwjgl.opengl.GL13C.glCompressedTexImage2D(r0, r1, r2, r3, r4, r5, r6, r7)
            return
    }

    public static void glCompressedTexImage2D(@org.lwjgl.system.NativeType("GLenum") int r8, @org.lwjgl.system.NativeType("GLint") int r9, @org.lwjgl.system.NativeType("GLenum") int r10, @org.lwjgl.system.NativeType("GLsizei") int r11, @org.lwjgl.system.NativeType("GLsizei") int r12, @org.lwjgl.system.NativeType("GLint") int r13, @javax.annotation.Nullable @org.lwjgl.system.NativeType("void const *") java.nio.ByteBuffer r14) {
            r0 = r8
            r1 = r9
            r2 = r10
            r3 = r11
            r4 = r12
            r5 = r13
            r6 = r14
            org.lwjgl.opengl.GL13C.glCompressedTexImage2D(r0, r1, r2, r3, r4, r5, r6)
            return
    }

    public static void nglCompressedTexImage1D(int r9, int r10, int r11, int r12, int r13, int r14, long r15) {
            r0 = r9
            r1 = r10
            r2 = r11
            r3 = r12
            r4 = r13
            r5 = r14
            r6 = r15
            org.lwjgl.opengl.GL13C.nglCompressedTexImage1D(r0, r1, r2, r3, r4, r5, r6)
            return
    }

    public static void glCompressedTexImage1D(@org.lwjgl.system.NativeType("GLenum") int r9, @org.lwjgl.system.NativeType("GLint") int r10, @org.lwjgl.system.NativeType("GLenum") int r11, @org.lwjgl.system.NativeType("GLsizei") int r12, @org.lwjgl.system.NativeType("GLint") int r13, @org.lwjgl.system.NativeType("GLsizei") int r14, @org.lwjgl.system.NativeType("void const *") long r15) {
            r0 = r9
            r1 = r10
            r2 = r11
            r3 = r12
            r4 = r13
            r5 = r14
            r6 = r15
            org.lwjgl.opengl.GL13C.glCompressedTexImage1D(r0, r1, r2, r3, r4, r5, r6)
            return
    }

    public static void glCompressedTexImage1D(@org.lwjgl.system.NativeType("GLenum") int r7, @org.lwjgl.system.NativeType("GLint") int r8, @org.lwjgl.system.NativeType("GLenum") int r9, @org.lwjgl.system.NativeType("GLsizei") int r10, @org.lwjgl.system.NativeType("GLint") int r11, @javax.annotation.Nullable @org.lwjgl.system.NativeType("void const *") java.nio.ByteBuffer r12) {
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            r5 = r12
            org.lwjgl.opengl.GL13C.glCompressedTexImage1D(r0, r1, r2, r3, r4, r5)
            return
    }

    public static void nglCompressedTexSubImage3D(int r13, int r14, int r15, int r16, int r17, int r18, int r19, int r20, int r21, int r22, long r23) {
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
            org.lwjgl.opengl.GL13C.nglCompressedTexSubImage3D(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            return
    }

    public static void glCompressedTexSubImage3D(@org.lwjgl.system.NativeType("GLenum") int r13, @org.lwjgl.system.NativeType("GLint") int r14, @org.lwjgl.system.NativeType("GLint") int r15, @org.lwjgl.system.NativeType("GLint") int r16, @org.lwjgl.system.NativeType("GLint") int r17, @org.lwjgl.system.NativeType("GLsizei") int r18, @org.lwjgl.system.NativeType("GLsizei") int r19, @org.lwjgl.system.NativeType("GLsizei") int r20, @org.lwjgl.system.NativeType("GLenum") int r21, @org.lwjgl.system.NativeType("GLsizei") int r22, @org.lwjgl.system.NativeType("void const *") long r23) {
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
            org.lwjgl.opengl.GL13C.glCompressedTexSubImage3D(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            return
    }

    public static void glCompressedTexSubImage3D(@org.lwjgl.system.NativeType("GLenum") int r11, @org.lwjgl.system.NativeType("GLint") int r12, @org.lwjgl.system.NativeType("GLint") int r13, @org.lwjgl.system.NativeType("GLint") int r14, @org.lwjgl.system.NativeType("GLint") int r15, @org.lwjgl.system.NativeType("GLsizei") int r16, @org.lwjgl.system.NativeType("GLsizei") int r17, @org.lwjgl.system.NativeType("GLsizei") int r18, @org.lwjgl.system.NativeType("GLenum") int r19, @org.lwjgl.system.NativeType("void const *") java.nio.ByteBuffer r20) {
            r0 = r11
            r1 = r12
            r2 = r13
            r3 = r14
            r4 = r15
            r5 = r16
            r6 = r17
            r7 = r18
            r8 = r19
            r9 = r20
            org.lwjgl.opengl.GL13C.glCompressedTexSubImage3D(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9)
            return
    }

    public static void nglCompressedTexSubImage2D(int r11, int r12, int r13, int r14, int r15, int r16, int r17, int r18, long r19) {
            r0 = r11
            r1 = r12
            r2 = r13
            r3 = r14
            r4 = r15
            r5 = r16
            r6 = r17
            r7 = r18
            r8 = r19
            org.lwjgl.opengl.GL13C.nglCompressedTexSubImage2D(r0, r1, r2, r3, r4, r5, r6, r7, r8)
            return
    }

    public static void glCompressedTexSubImage2D(@org.lwjgl.system.NativeType("GLenum") int r11, @org.lwjgl.system.NativeType("GLint") int r12, @org.lwjgl.system.NativeType("GLint") int r13, @org.lwjgl.system.NativeType("GLint") int r14, @org.lwjgl.system.NativeType("GLsizei") int r15, @org.lwjgl.system.NativeType("GLsizei") int r16, @org.lwjgl.system.NativeType("GLenum") int r17, @org.lwjgl.system.NativeType("GLsizei") int r18, @org.lwjgl.system.NativeType("void const *") long r19) {
            r0 = r11
            r1 = r12
            r2 = r13
            r3 = r14
            r4 = r15
            r5 = r16
            r6 = r17
            r7 = r18
            r8 = r19
            org.lwjgl.opengl.GL13C.glCompressedTexSubImage2D(r0, r1, r2, r3, r4, r5, r6, r7, r8)
            return
    }

    public static void glCompressedTexSubImage2D(@org.lwjgl.system.NativeType("GLenum") int r9, @org.lwjgl.system.NativeType("GLint") int r10, @org.lwjgl.system.NativeType("GLint") int r11, @org.lwjgl.system.NativeType("GLint") int r12, @org.lwjgl.system.NativeType("GLsizei") int r13, @org.lwjgl.system.NativeType("GLsizei") int r14, @org.lwjgl.system.NativeType("GLenum") int r15, @org.lwjgl.system.NativeType("void const *") java.nio.ByteBuffer r16) {
            r0 = r9
            r1 = r10
            r2 = r11
            r3 = r12
            r4 = r13
            r5 = r14
            r6 = r15
            r7 = r16
            org.lwjgl.opengl.GL13C.glCompressedTexSubImage2D(r0, r1, r2, r3, r4, r5, r6, r7)
            return
    }

    public static void nglCompressedTexSubImage1D(int r9, int r10, int r11, int r12, int r13, int r14, long r15) {
            r0 = r9
            r1 = r10
            r2 = r11
            r3 = r12
            r4 = r13
            r5 = r14
            r6 = r15
            org.lwjgl.opengl.GL13C.nglCompressedTexSubImage1D(r0, r1, r2, r3, r4, r5, r6)
            return
    }

    public static void glCompressedTexSubImage1D(@org.lwjgl.system.NativeType("GLenum") int r9, @org.lwjgl.system.NativeType("GLint") int r10, @org.lwjgl.system.NativeType("GLint") int r11, @org.lwjgl.system.NativeType("GLsizei") int r12, @org.lwjgl.system.NativeType("GLenum") int r13, @org.lwjgl.system.NativeType("GLsizei") int r14, @org.lwjgl.system.NativeType("void const *") long r15) {
            r0 = r9
            r1 = r10
            r2 = r11
            r3 = r12
            r4 = r13
            r5 = r14
            r6 = r15
            org.lwjgl.opengl.GL13C.glCompressedTexSubImage1D(r0, r1, r2, r3, r4, r5, r6)
            return
    }

    public static void glCompressedTexSubImage1D(@org.lwjgl.system.NativeType("GLenum") int r7, @org.lwjgl.system.NativeType("GLint") int r8, @org.lwjgl.system.NativeType("GLint") int r9, @org.lwjgl.system.NativeType("GLsizei") int r10, @org.lwjgl.system.NativeType("GLenum") int r11, @org.lwjgl.system.NativeType("void const *") java.nio.ByteBuffer r12) {
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            r5 = r12
            org.lwjgl.opengl.GL13C.glCompressedTexSubImage1D(r0, r1, r2, r3, r4, r5)
            return
    }

    public static void nglGetCompressedTexImage(int r5, int r6, long r7) {
            r0 = r5
            r1 = r6
            r2 = r7
            org.lwjgl.opengl.GL13C.nglGetCompressedTexImage(r0, r1, r2)
            return
    }

    public static void glGetCompressedTexImage(@org.lwjgl.system.NativeType("GLenum") int r4, @org.lwjgl.system.NativeType("GLint") int r5, @org.lwjgl.system.NativeType("void *") java.nio.ByteBuffer r6) {
            r0 = r4
            r1 = r5
            r2 = r6
            org.lwjgl.opengl.GL13C.glGetCompressedTexImage(r0, r1, r2)
            return
    }

    public static void glGetCompressedTexImage(@org.lwjgl.system.NativeType("GLenum") int r5, @org.lwjgl.system.NativeType("GLint") int r6, @org.lwjgl.system.NativeType("void *") long r7) {
            r0 = r5
            r1 = r6
            r2 = r7
            org.lwjgl.opengl.GL13C.glGetCompressedTexImage(r0, r1, r2)
            return
    }

    public static void glSampleCoverage(@org.lwjgl.system.NativeType("GLfloat") float r3, @org.lwjgl.system.NativeType("GLboolean") boolean r4) {
            r0 = r3
            r1 = r4
            org.lwjgl.opengl.GL13C.glSampleCoverage(r0, r1)
            return
    }

    public static void glActiveTexture(@org.lwjgl.system.NativeType("GLenum") int r2) {
            r0 = r2
            org.lwjgl.opengl.GL13C.glActiveTexture(r0)
            return
    }

    public static native void glClientActiveTexture(@org.lwjgl.system.NativeType("GLenum") int r0);

    public static native void glMultiTexCoord1f(@org.lwjgl.system.NativeType("GLenum") int r0, @org.lwjgl.system.NativeType("GLfloat") float r1);

    public static native void glMultiTexCoord1s(@org.lwjgl.system.NativeType("GLenum") int r0, @org.lwjgl.system.NativeType("GLshort") short r1);

    public static native void glMultiTexCoord1i(@org.lwjgl.system.NativeType("GLenum") int r0, @org.lwjgl.system.NativeType("GLint") int r1);

    public static native void glMultiTexCoord1d(@org.lwjgl.system.NativeType("GLenum") int r0, @org.lwjgl.system.NativeType("GLdouble") double r1);

    public static native void nglMultiTexCoord1fv(int r0, long r1);

    public static void glMultiTexCoord1fv(@org.lwjgl.system.NativeType("GLenum") int r4, @org.lwjgl.system.NativeType("GLfloat const *") java.nio.FloatBuffer r5) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r5
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
        Lb:
            r0 = r4
            r1 = r5
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            nglMultiTexCoord1fv(r0, r1)
            return
    }

    public static native void nglMultiTexCoord1sv(int r0, long r1);

    public static void glMultiTexCoord1sv(@org.lwjgl.system.NativeType("GLenum") int r4, @org.lwjgl.system.NativeType("GLshort const *") java.nio.ShortBuffer r5) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r5
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
        Lb:
            r0 = r4
            r1 = r5
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            nglMultiTexCoord1sv(r0, r1)
            return
    }

    public static native void nglMultiTexCoord1iv(int r0, long r1);

    public static void glMultiTexCoord1iv(@org.lwjgl.system.NativeType("GLenum") int r4, @org.lwjgl.system.NativeType("GLint const *") java.nio.IntBuffer r5) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r5
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
        Lb:
            r0 = r4
            r1 = r5
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            nglMultiTexCoord1iv(r0, r1)
            return
    }

    public static native void nglMultiTexCoord1dv(int r0, long r1);

    public static void glMultiTexCoord1dv(@org.lwjgl.system.NativeType("GLenum") int r4, @org.lwjgl.system.NativeType("GLdouble const *") java.nio.DoubleBuffer r5) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r5
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
        Lb:
            r0 = r4
            r1 = r5
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            nglMultiTexCoord1dv(r0, r1)
            return
    }

    public static native void glMultiTexCoord2f(@org.lwjgl.system.NativeType("GLenum") int r0, @org.lwjgl.system.NativeType("GLfloat") float r1, @org.lwjgl.system.NativeType("GLfloat") float r2);

    public static native void glMultiTexCoord2s(@org.lwjgl.system.NativeType("GLenum") int r0, @org.lwjgl.system.NativeType("GLshort") short r1, @org.lwjgl.system.NativeType("GLshort") short r2);

    public static native void glMultiTexCoord2i(@org.lwjgl.system.NativeType("GLenum") int r0, @org.lwjgl.system.NativeType("GLint") int r1, @org.lwjgl.system.NativeType("GLint") int r2);

    public static native void glMultiTexCoord2d(@org.lwjgl.system.NativeType("GLenum") int r0, @org.lwjgl.system.NativeType("GLdouble") double r1, @org.lwjgl.system.NativeType("GLdouble") double r3);

    public static native void nglMultiTexCoord2fv(int r0, long r1);

    public static void glMultiTexCoord2fv(@org.lwjgl.system.NativeType("GLenum") int r4, @org.lwjgl.system.NativeType("GLfloat const *") java.nio.FloatBuffer r5) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r5
            r1 = 2
            org.lwjgl.system.Checks.check(r0, r1)
        Lb:
            r0 = r4
            r1 = r5
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            nglMultiTexCoord2fv(r0, r1)
            return
    }

    public static native void nglMultiTexCoord2sv(int r0, long r1);

    public static void glMultiTexCoord2sv(@org.lwjgl.system.NativeType("GLenum") int r4, @org.lwjgl.system.NativeType("GLshort const *") java.nio.ShortBuffer r5) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r5
            r1 = 2
            org.lwjgl.system.Checks.check(r0, r1)
        Lb:
            r0 = r4
            r1 = r5
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            nglMultiTexCoord2sv(r0, r1)
            return
    }

    public static native void nglMultiTexCoord2iv(int r0, long r1);

    public static void glMultiTexCoord2iv(@org.lwjgl.system.NativeType("GLenum") int r4, @org.lwjgl.system.NativeType("GLint const *") java.nio.IntBuffer r5) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r5
            r1 = 2
            org.lwjgl.system.Checks.check(r0, r1)
        Lb:
            r0 = r4
            r1 = r5
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            nglMultiTexCoord2iv(r0, r1)
            return
    }

    public static native void nglMultiTexCoord2dv(int r0, long r1);

    public static void glMultiTexCoord2dv(@org.lwjgl.system.NativeType("GLenum") int r4, @org.lwjgl.system.NativeType("GLdouble const *") java.nio.DoubleBuffer r5) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r5
            r1 = 2
            org.lwjgl.system.Checks.check(r0, r1)
        Lb:
            r0 = r4
            r1 = r5
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            nglMultiTexCoord2dv(r0, r1)
            return
    }

    public static native void glMultiTexCoord3f(@org.lwjgl.system.NativeType("GLenum") int r0, @org.lwjgl.system.NativeType("GLfloat") float r1, @org.lwjgl.system.NativeType("GLfloat") float r2, @org.lwjgl.system.NativeType("GLfloat") float r3);

    public static native void glMultiTexCoord3s(@org.lwjgl.system.NativeType("GLenum") int r0, @org.lwjgl.system.NativeType("GLshort") short r1, @org.lwjgl.system.NativeType("GLshort") short r2, @org.lwjgl.system.NativeType("GLshort") short r3);

    public static native void glMultiTexCoord3i(@org.lwjgl.system.NativeType("GLenum") int r0, @org.lwjgl.system.NativeType("GLint") int r1, @org.lwjgl.system.NativeType("GLint") int r2, @org.lwjgl.system.NativeType("GLint") int r3);

    public static native void glMultiTexCoord3d(@org.lwjgl.system.NativeType("GLenum") int r0, @org.lwjgl.system.NativeType("GLdouble") double r1, @org.lwjgl.system.NativeType("GLdouble") double r3, @org.lwjgl.system.NativeType("GLdouble") double r5);

    public static native void nglMultiTexCoord3fv(int r0, long r1);

    public static void glMultiTexCoord3fv(@org.lwjgl.system.NativeType("GLenum") int r4, @org.lwjgl.system.NativeType("GLfloat const *") java.nio.FloatBuffer r5) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r5
            r1 = 3
            org.lwjgl.system.Checks.check(r0, r1)
        Lb:
            r0 = r4
            r1 = r5
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            nglMultiTexCoord3fv(r0, r1)
            return
    }

    public static native void nglMultiTexCoord3sv(int r0, long r1);

    public static void glMultiTexCoord3sv(@org.lwjgl.system.NativeType("GLenum") int r4, @org.lwjgl.system.NativeType("GLshort const *") java.nio.ShortBuffer r5) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r5
            r1 = 3
            org.lwjgl.system.Checks.check(r0, r1)
        Lb:
            r0 = r4
            r1 = r5
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            nglMultiTexCoord3sv(r0, r1)
            return
    }

    public static native void nglMultiTexCoord3iv(int r0, long r1);

    public static void glMultiTexCoord3iv(@org.lwjgl.system.NativeType("GLenum") int r4, @org.lwjgl.system.NativeType("GLint const *") java.nio.IntBuffer r5) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r5
            r1 = 3
            org.lwjgl.system.Checks.check(r0, r1)
        Lb:
            r0 = r4
            r1 = r5
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            nglMultiTexCoord3iv(r0, r1)
            return
    }

    public static native void nglMultiTexCoord3dv(int r0, long r1);

    public static void glMultiTexCoord3dv(@org.lwjgl.system.NativeType("GLenum") int r4, @org.lwjgl.system.NativeType("GLdouble const *") java.nio.DoubleBuffer r5) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r5
            r1 = 3
            org.lwjgl.system.Checks.check(r0, r1)
        Lb:
            r0 = r4
            r1 = r5
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            nglMultiTexCoord3dv(r0, r1)
            return
    }

    public static native void glMultiTexCoord4f(@org.lwjgl.system.NativeType("GLenum") int r0, @org.lwjgl.system.NativeType("GLfloat") float r1, @org.lwjgl.system.NativeType("GLfloat") float r2, @org.lwjgl.system.NativeType("GLfloat") float r3, @org.lwjgl.system.NativeType("GLfloat") float r4);

    public static native void glMultiTexCoord4s(@org.lwjgl.system.NativeType("GLenum") int r0, @org.lwjgl.system.NativeType("GLshort") short r1, @org.lwjgl.system.NativeType("GLshort") short r2, @org.lwjgl.system.NativeType("GLshort") short r3, @org.lwjgl.system.NativeType("GLshort") short r4);

    public static native void glMultiTexCoord4i(@org.lwjgl.system.NativeType("GLenum") int r0, @org.lwjgl.system.NativeType("GLint") int r1, @org.lwjgl.system.NativeType("GLint") int r2, @org.lwjgl.system.NativeType("GLint") int r3, @org.lwjgl.system.NativeType("GLint") int r4);

    public static native void glMultiTexCoord4d(@org.lwjgl.system.NativeType("GLenum") int r0, @org.lwjgl.system.NativeType("GLdouble") double r1, @org.lwjgl.system.NativeType("GLdouble") double r3, @org.lwjgl.system.NativeType("GLdouble") double r5, @org.lwjgl.system.NativeType("GLdouble") double r7);

    public static native void nglMultiTexCoord4fv(int r0, long r1);

    public static void glMultiTexCoord4fv(@org.lwjgl.system.NativeType("GLenum") int r4, @org.lwjgl.system.NativeType("GLfloat const *") java.nio.FloatBuffer r5) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r5
            r1 = 4
            org.lwjgl.system.Checks.check(r0, r1)
        Lb:
            r0 = r4
            r1 = r5
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            nglMultiTexCoord4fv(r0, r1)
            return
    }

    public static native void nglMultiTexCoord4sv(int r0, long r1);

    public static void glMultiTexCoord4sv(@org.lwjgl.system.NativeType("GLenum") int r4, @org.lwjgl.system.NativeType("GLshort const *") java.nio.ShortBuffer r5) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r5
            r1 = 4
            org.lwjgl.system.Checks.check(r0, r1)
        Lb:
            r0 = r4
            r1 = r5
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            nglMultiTexCoord4sv(r0, r1)
            return
    }

    public static native void nglMultiTexCoord4iv(int r0, long r1);

    public static void glMultiTexCoord4iv(@org.lwjgl.system.NativeType("GLenum") int r4, @org.lwjgl.system.NativeType("GLint const *") java.nio.IntBuffer r5) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r5
            r1 = 4
            org.lwjgl.system.Checks.check(r0, r1)
        Lb:
            r0 = r4
            r1 = r5
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            nglMultiTexCoord4iv(r0, r1)
            return
    }

    public static native void nglMultiTexCoord4dv(int r0, long r1);

    public static void glMultiTexCoord4dv(@org.lwjgl.system.NativeType("GLenum") int r4, @org.lwjgl.system.NativeType("GLdouble const *") java.nio.DoubleBuffer r5) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r5
            r1 = 4
            org.lwjgl.system.Checks.check(r0, r1)
        Lb:
            r0 = r4
            r1 = r5
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            nglMultiTexCoord4dv(r0, r1)
            return
    }

    public static native void nglLoadTransposeMatrixf(long r0);

    public static void glLoadTransposeMatrixf(@org.lwjgl.system.NativeType("GLfloat const *") java.nio.FloatBuffer r3) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lc
            r0 = r3
            r1 = 16
            org.lwjgl.system.Checks.check(r0, r1)
        Lc:
            r0 = r3
            long r0 = org.lwjgl.system.MemoryUtil.memAddress(r0)
            nglLoadTransposeMatrixf(r0)
            return
    }

    public static native void nglLoadTransposeMatrixd(long r0);

    public static void glLoadTransposeMatrixd(@org.lwjgl.system.NativeType("GLdouble const *") java.nio.DoubleBuffer r3) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lc
            r0 = r3
            r1 = 16
            org.lwjgl.system.Checks.check(r0, r1)
        Lc:
            r0 = r3
            long r0 = org.lwjgl.system.MemoryUtil.memAddress(r0)
            nglLoadTransposeMatrixd(r0)
            return
    }

    public static native void nglMultTransposeMatrixf(long r0);

    public static void glMultTransposeMatrixf(@org.lwjgl.system.NativeType("GLfloat const *") java.nio.FloatBuffer r3) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lc
            r0 = r3
            r1 = 16
            org.lwjgl.system.Checks.check(r0, r1)
        Lc:
            r0 = r3
            long r0 = org.lwjgl.system.MemoryUtil.memAddress(r0)
            nglMultTransposeMatrixf(r0)
            return
    }

    public static native void nglMultTransposeMatrixd(long r0);

    public static void glMultTransposeMatrixd(@org.lwjgl.system.NativeType("GLdouble const *") java.nio.DoubleBuffer r3) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lc
            r0 = r3
            r1 = 16
            org.lwjgl.system.Checks.check(r0, r1)
        Lc:
            r0 = r3
            long r0 = org.lwjgl.system.MemoryUtil.memAddress(r0)
            nglMultTransposeMatrixd(r0)
            return
    }

    public static void glMultiTexCoord1fv(@org.lwjgl.system.NativeType("GLenum") int r5, @org.lwjgl.system.NativeType("GLfloat const *") float[] r6) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glMultiTexCoord1fv
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

    public static void glMultiTexCoord1sv(@org.lwjgl.system.NativeType("GLenum") int r5, @org.lwjgl.system.NativeType("GLshort const *") short[] r6) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glMultiTexCoord1sv
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

    public static void glMultiTexCoord1iv(@org.lwjgl.system.NativeType("GLenum") int r5, @org.lwjgl.system.NativeType("GLint const *") int[] r6) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glMultiTexCoord1iv
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

    public static void glMultiTexCoord1dv(@org.lwjgl.system.NativeType("GLenum") int r5, @org.lwjgl.system.NativeType("GLdouble const *") double[] r6) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glMultiTexCoord1dv
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

    public static void glMultiTexCoord2fv(@org.lwjgl.system.NativeType("GLenum") int r5, @org.lwjgl.system.NativeType("GLfloat const *") float[] r6) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glMultiTexCoord2fv
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

    public static void glMultiTexCoord2sv(@org.lwjgl.system.NativeType("GLenum") int r5, @org.lwjgl.system.NativeType("GLshort const *") short[] r6) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glMultiTexCoord2sv
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

    public static void glMultiTexCoord2iv(@org.lwjgl.system.NativeType("GLenum") int r5, @org.lwjgl.system.NativeType("GLint const *") int[] r6) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glMultiTexCoord2iv
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

    public static void glMultiTexCoord2dv(@org.lwjgl.system.NativeType("GLenum") int r5, @org.lwjgl.system.NativeType("GLdouble const *") double[] r6) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glMultiTexCoord2dv
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

    public static void glMultiTexCoord3fv(@org.lwjgl.system.NativeType("GLenum") int r5, @org.lwjgl.system.NativeType("GLfloat const *") float[] r6) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glMultiTexCoord3fv
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

    public static void glMultiTexCoord3sv(@org.lwjgl.system.NativeType("GLenum") int r5, @org.lwjgl.system.NativeType("GLshort const *") short[] r6) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glMultiTexCoord3sv
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

    public static void glMultiTexCoord3iv(@org.lwjgl.system.NativeType("GLenum") int r5, @org.lwjgl.system.NativeType("GLint const *") int[] r6) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glMultiTexCoord3iv
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

    public static void glMultiTexCoord3dv(@org.lwjgl.system.NativeType("GLenum") int r5, @org.lwjgl.system.NativeType("GLdouble const *") double[] r6) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glMultiTexCoord3dv
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

    public static void glMultiTexCoord4fv(@org.lwjgl.system.NativeType("GLenum") int r5, @org.lwjgl.system.NativeType("GLfloat const *") float[] r6) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glMultiTexCoord4fv
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

    public static void glMultiTexCoord4sv(@org.lwjgl.system.NativeType("GLenum") int r5, @org.lwjgl.system.NativeType("GLshort const *") short[] r6) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glMultiTexCoord4sv
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

    public static void glMultiTexCoord4iv(@org.lwjgl.system.NativeType("GLenum") int r5, @org.lwjgl.system.NativeType("GLint const *") int[] r6) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glMultiTexCoord4iv
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

    public static void glMultiTexCoord4dv(@org.lwjgl.system.NativeType("GLenum") int r5, @org.lwjgl.system.NativeType("GLdouble const *") double[] r6) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glMultiTexCoord4dv
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

    public static void glLoadTransposeMatrixf(@org.lwjgl.system.NativeType("GLfloat const *") float[] r4) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glLoadTransposeMatrixf
            r5 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L18
            r0 = r5
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r4
            r1 = 16
            org.lwjgl.system.Checks.check(r0, r1)
        L18:
            r0 = r4
            r1 = r5
            org.lwjgl.system.JNI.callPV(r0, r1)
            return
    }

    public static void glLoadTransposeMatrixd(@org.lwjgl.system.NativeType("GLdouble const *") double[] r4) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glLoadTransposeMatrixd
            r5 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L18
            r0 = r5
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r4
            r1 = 16
            org.lwjgl.system.Checks.check(r0, r1)
        L18:
            r0 = r4
            r1 = r5
            org.lwjgl.system.JNI.callPV(r0, r1)
            return
    }

    public static void glMultTransposeMatrixf(@org.lwjgl.system.NativeType("GLfloat const *") float[] r4) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glMultTransposeMatrixf
            r5 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L18
            r0 = r5
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r4
            r1 = 16
            org.lwjgl.system.Checks.check(r0, r1)
        L18:
            r0 = r4
            r1 = r5
            org.lwjgl.system.JNI.callPV(r0, r1)
            return
    }

    public static void glMultTransposeMatrixd(@org.lwjgl.system.NativeType("GLdouble const *") double[] r4) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glMultTransposeMatrixd
            r5 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L18
            r0 = r5
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r4
            r1 = 16
            org.lwjgl.system.Checks.check(r0, r1)
        L18:
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
