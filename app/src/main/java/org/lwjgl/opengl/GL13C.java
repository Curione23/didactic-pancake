package org.lwjgl.opengl;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/opengl/GL13C.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/opengl/GL13C.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/opengl/GL13C.class */
public class GL13C extends org.lwjgl.opengl.GL12C {
    public static final int GL_COMPRESSED_RGB = 34029;
    public static final int GL_COMPRESSED_RGBA = 34030;
    public static final int GL_TEXTURE_COMPRESSION_HINT = 34031;
    public static final int GL_TEXTURE_COMPRESSED_IMAGE_SIZE = 34464;
    public static final int GL_TEXTURE_COMPRESSED = 34465;
    public static final int GL_NUM_COMPRESSED_TEXTURE_FORMATS = 34466;
    public static final int GL_COMPRESSED_TEXTURE_FORMATS = 34467;
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
    public static final int GL_CLAMP_TO_BORDER = 33069;

    protected GL13C() {
            r3 = this;
            r0 = r3
            r0.<init>()
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r1 = r0
            r1.<init>()
            throw r0
    }

    public static native void nglCompressedTexImage3D(int r0, int r1, int r2, int r3, int r4, int r5, int r6, int r7, long r8);

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
            nglCompressedTexImage3D(r0, r1, r2, r3, r4, r5, r6, r7, r8)
            return
    }

    public static void glCompressedTexImage3D(@org.lwjgl.system.NativeType("GLenum") int r11, @org.lwjgl.system.NativeType("GLint") int r12, @org.lwjgl.system.NativeType("GLenum") int r13, @org.lwjgl.system.NativeType("GLsizei") int r14, @org.lwjgl.system.NativeType("GLsizei") int r15, @org.lwjgl.system.NativeType("GLsizei") int r16, @org.lwjgl.system.NativeType("GLint") int r17, @javax.annotation.Nullable @org.lwjgl.system.NativeType("void const *") java.nio.ByteBuffer r18) {
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
            nglCompressedTexImage3D(r0, r1, r2, r3, r4, r5, r6, r7, r8)
            return
    }

    public static native void nglCompressedTexImage2D(int r0, int r1, int r2, int r3, int r4, int r5, int r6, long r7);

    public static void glCompressedTexImage2D(@org.lwjgl.system.NativeType("GLenum") int r10, @org.lwjgl.system.NativeType("GLint") int r11, @org.lwjgl.system.NativeType("GLenum") int r12, @org.lwjgl.system.NativeType("GLsizei") int r13, @org.lwjgl.system.NativeType("GLsizei") int r14, @org.lwjgl.system.NativeType("GLint") int r15, @org.lwjgl.system.NativeType("GLsizei") int r16, @org.lwjgl.system.NativeType("void const *") long r17) {
            r0 = r10
            r1 = r11
            r2 = r12
            r3 = r13
            r4 = r14
            r5 = r15
            r6 = r16
            r7 = r17
            nglCompressedTexImage2D(r0, r1, r2, r3, r4, r5, r6, r7)
            return
    }

    public static void glCompressedTexImage2D(@org.lwjgl.system.NativeType("GLenum") int r10, @org.lwjgl.system.NativeType("GLint") int r11, @org.lwjgl.system.NativeType("GLenum") int r12, @org.lwjgl.system.NativeType("GLsizei") int r13, @org.lwjgl.system.NativeType("GLsizei") int r14, @org.lwjgl.system.NativeType("GLint") int r15, @javax.annotation.Nullable @org.lwjgl.system.NativeType("void const *") java.nio.ByteBuffer r16) {
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
            nglCompressedTexImage2D(r0, r1, r2, r3, r4, r5, r6, r7)
            return
    }

    public static native void nglCompressedTexImage1D(int r0, int r1, int r2, int r3, int r4, int r5, long r6);

    public static void glCompressedTexImage1D(@org.lwjgl.system.NativeType("GLenum") int r9, @org.lwjgl.system.NativeType("GLint") int r10, @org.lwjgl.system.NativeType("GLenum") int r11, @org.lwjgl.system.NativeType("GLsizei") int r12, @org.lwjgl.system.NativeType("GLint") int r13, @org.lwjgl.system.NativeType("GLsizei") int r14, @org.lwjgl.system.NativeType("void const *") long r15) {
            r0 = r9
            r1 = r10
            r2 = r11
            r3 = r12
            r4 = r13
            r5 = r14
            r6 = r15
            nglCompressedTexImage1D(r0, r1, r2, r3, r4, r5, r6)
            return
    }

    public static void glCompressedTexImage1D(@org.lwjgl.system.NativeType("GLenum") int r9, @org.lwjgl.system.NativeType("GLint") int r10, @org.lwjgl.system.NativeType("GLenum") int r11, @org.lwjgl.system.NativeType("GLsizei") int r12, @org.lwjgl.system.NativeType("GLint") int r13, @javax.annotation.Nullable @org.lwjgl.system.NativeType("void const *") java.nio.ByteBuffer r14) {
            r0 = r9
            r1 = r10
            r2 = r11
            r3 = r12
            r4 = r13
            r5 = r14
            int r5 = org.lwjgl.system.Checks.remainingSafe(r5)
            r6 = r14
            long r6 = org.lwjgl.system.MemoryUtil.memAddressSafe(r6)
            nglCompressedTexImage1D(r0, r1, r2, r3, r4, r5, r6)
            return
    }

    public static native void nglCompressedTexSubImage3D(int r0, int r1, int r2, int r3, int r4, int r5, int r6, int r7, int r8, int r9, long r10);

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
            nglCompressedTexSubImage3D(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            return
    }

    public static void glCompressedTexSubImage3D(@org.lwjgl.system.NativeType("GLenum") int r13, @org.lwjgl.system.NativeType("GLint") int r14, @org.lwjgl.system.NativeType("GLint") int r15, @org.lwjgl.system.NativeType("GLint") int r16, @org.lwjgl.system.NativeType("GLint") int r17, @org.lwjgl.system.NativeType("GLsizei") int r18, @org.lwjgl.system.NativeType("GLsizei") int r19, @org.lwjgl.system.NativeType("GLsizei") int r20, @org.lwjgl.system.NativeType("GLenum") int r21, @org.lwjgl.system.NativeType("void const *") java.nio.ByteBuffer r22) {
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
            int r9 = r9.remaining()
            r10 = r22
            long r10 = org.lwjgl.system.MemoryUtil.memAddress(r10)
            nglCompressedTexSubImage3D(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            return
    }

    public static native void nglCompressedTexSubImage2D(int r0, int r1, int r2, int r3, int r4, int r5, int r6, int r7, long r8);

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
            nglCompressedTexSubImage2D(r0, r1, r2, r3, r4, r5, r6, r7, r8)
            return
    }

    public static void glCompressedTexSubImage2D(@org.lwjgl.system.NativeType("GLenum") int r11, @org.lwjgl.system.NativeType("GLint") int r12, @org.lwjgl.system.NativeType("GLint") int r13, @org.lwjgl.system.NativeType("GLint") int r14, @org.lwjgl.system.NativeType("GLsizei") int r15, @org.lwjgl.system.NativeType("GLsizei") int r16, @org.lwjgl.system.NativeType("GLenum") int r17, @org.lwjgl.system.NativeType("void const *") java.nio.ByteBuffer r18) {
            r0 = r11
            r1 = r12
            r2 = r13
            r3 = r14
            r4 = r15
            r5 = r16
            r6 = r17
            r7 = r18
            int r7 = r7.remaining()
            r8 = r18
            long r8 = org.lwjgl.system.MemoryUtil.memAddress(r8)
            nglCompressedTexSubImage2D(r0, r1, r2, r3, r4, r5, r6, r7, r8)
            return
    }

    public static native void nglCompressedTexSubImage1D(int r0, int r1, int r2, int r3, int r4, int r5, long r6);

    public static void glCompressedTexSubImage1D(@org.lwjgl.system.NativeType("GLenum") int r9, @org.lwjgl.system.NativeType("GLint") int r10, @org.lwjgl.system.NativeType("GLint") int r11, @org.lwjgl.system.NativeType("GLsizei") int r12, @org.lwjgl.system.NativeType("GLenum") int r13, @org.lwjgl.system.NativeType("GLsizei") int r14, @org.lwjgl.system.NativeType("void const *") long r15) {
            r0 = r9
            r1 = r10
            r2 = r11
            r3 = r12
            r4 = r13
            r5 = r14
            r6 = r15
            nglCompressedTexSubImage1D(r0, r1, r2, r3, r4, r5, r6)
            return
    }

    public static void glCompressedTexSubImage1D(@org.lwjgl.system.NativeType("GLenum") int r9, @org.lwjgl.system.NativeType("GLint") int r10, @org.lwjgl.system.NativeType("GLint") int r11, @org.lwjgl.system.NativeType("GLsizei") int r12, @org.lwjgl.system.NativeType("GLenum") int r13, @org.lwjgl.system.NativeType("void const *") java.nio.ByteBuffer r14) {
            r0 = r9
            r1 = r10
            r2 = r11
            r3 = r12
            r4 = r13
            r5 = r14
            int r5 = r5.remaining()
            r6 = r14
            long r6 = org.lwjgl.system.MemoryUtil.memAddress(r6)
            nglCompressedTexSubImage1D(r0, r1, r2, r3, r4, r5, r6)
            return
    }

    public static native void nglGetCompressedTexImage(int r0, int r1, long r2);

    public static void glGetCompressedTexImage(@org.lwjgl.system.NativeType("GLenum") int r5, @org.lwjgl.system.NativeType("GLint") int r6, @org.lwjgl.system.NativeType("void *") java.nio.ByteBuffer r7) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L17
            boolean r0 = org.lwjgl.system.Checks.DEBUG
            if (r0 == 0) goto L17
            r0 = r7
            r1 = r5
            r2 = r6
            r3 = 34464(0x86a0, float:4.8294E-41)
            int r1 = org.lwjgl.opengl.GL11.glGetTexLevelParameteri(r1, r2, r3)
            org.lwjgl.system.Checks.check(r0, r1)
        L17:
            r0 = r5
            r1 = r6
            r2 = r7
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            nglGetCompressedTexImage(r0, r1, r2)
            return
    }

    public static void glGetCompressedTexImage(@org.lwjgl.system.NativeType("GLenum") int r5, @org.lwjgl.system.NativeType("GLint") int r6, @org.lwjgl.system.NativeType("void *") long r7) {
            r0 = r5
            r1 = r6
            r2 = r7
            nglGetCompressedTexImage(r0, r1, r2)
            return
    }

    public static native void glSampleCoverage(@org.lwjgl.system.NativeType("GLfloat") float r0, @org.lwjgl.system.NativeType("GLboolean") boolean r1);

    public static native void glActiveTexture(@org.lwjgl.system.NativeType("GLenum") int r0);

    static {
            org.lwjgl.opengl.GL.initialize()
            return
    }
}
