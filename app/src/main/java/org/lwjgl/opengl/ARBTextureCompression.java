package org.lwjgl.opengl;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/opengl/ARBTextureCompression.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/opengl/ARBTextureCompression.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/opengl/ARBTextureCompression.class */
public class ARBTextureCompression {
    public static final int GL_COMPRESSED_ALPHA_ARB = 34025;
    public static final int GL_COMPRESSED_LUMINANCE_ARB = 34026;
    public static final int GL_COMPRESSED_LUMINANCE_ALPHA_ARB = 34027;
    public static final int GL_COMPRESSED_INTENSITY_ARB = 34028;
    public static final int GL_COMPRESSED_RGB_ARB = 34029;
    public static final int GL_COMPRESSED_RGBA_ARB = 34030;
    public static final int GL_TEXTURE_COMPRESSION_HINT_ARB = 34031;
    public static final int GL_TEXTURE_COMPRESSED_IMAGE_SIZE_ARB = 34464;
    public static final int GL_TEXTURE_COMPRESSED_ARB = 34465;
    public static final int GL_NUM_COMPRESSED_TEXTURE_FORMATS_ARB = 34466;
    public static final int GL_COMPRESSED_TEXTURE_FORMATS_ARB = 34467;

    protected ARBTextureCompression() {
            r3 = this;
            r0 = r3
            r0.<init>()
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r1 = r0
            r1.<init>()
            throw r0
    }

    public static native void nglCompressedTexImage3DARB(int r0, int r1, int r2, int r3, int r4, int r5, int r6, int r7, long r8);

    public static void glCompressedTexImage3DARB(@org.lwjgl.system.NativeType("GLenum") int r11, @org.lwjgl.system.NativeType("GLint") int r12, @org.lwjgl.system.NativeType("GLenum") int r13, @org.lwjgl.system.NativeType("GLsizei") int r14, @org.lwjgl.system.NativeType("GLsizei") int r15, @org.lwjgl.system.NativeType("GLsizei") int r16, @org.lwjgl.system.NativeType("GLint") int r17, @org.lwjgl.system.NativeType("GLsizei") int r18, @org.lwjgl.system.NativeType("void const *") long r19) {
            r0 = r11
            r1 = r12
            r2 = r13
            r3 = r14
            r4 = r15
            r5 = r16
            r6 = r17
            r7 = r18
            r8 = r19
            nglCompressedTexImage3DARB(r0, r1, r2, r3, r4, r5, r6, r7, r8)
            return
    }

    public static void glCompressedTexImage3DARB(@org.lwjgl.system.NativeType("GLenum") int r11, @org.lwjgl.system.NativeType("GLint") int r12, @org.lwjgl.system.NativeType("GLenum") int r13, @org.lwjgl.system.NativeType("GLsizei") int r14, @org.lwjgl.system.NativeType("GLsizei") int r15, @org.lwjgl.system.NativeType("GLsizei") int r16, @org.lwjgl.system.NativeType("void const *") java.nio.ByteBuffer r17) {
            r0 = r11
            r1 = r12
            r2 = r13
            r3 = r14
            r4 = r15
            r5 = r16
            r6 = 0
            r7 = r17
            int r7 = r7.remaining()
            r8 = r17
            long r8 = org.lwjgl.system.MemoryUtil.memAddress(r8)
            nglCompressedTexImage3DARB(r0, r1, r2, r3, r4, r5, r6, r7, r8)
            return
    }

    public static native void nglCompressedTexImage2DARB(int r0, int r1, int r2, int r3, int r4, int r5, int r6, long r7);

    public static void glCompressedTexImage2DARB(@org.lwjgl.system.NativeType("GLenum") int r10, @org.lwjgl.system.NativeType("GLint") int r11, @org.lwjgl.system.NativeType("GLenum") int r12, @org.lwjgl.system.NativeType("GLsizei") int r13, @org.lwjgl.system.NativeType("GLsizei") int r14, @org.lwjgl.system.NativeType("GLint") int r15, @org.lwjgl.system.NativeType("GLsizei") int r16, @org.lwjgl.system.NativeType("void const *") long r17) {
            r0 = r10
            r1 = r11
            r2 = r12
            r3 = r13
            r4 = r14
            r5 = r15
            r6 = r16
            r7 = r17
            nglCompressedTexImage2DARB(r0, r1, r2, r3, r4, r5, r6, r7)
            return
    }

    public static void glCompressedTexImage2DARB(@org.lwjgl.system.NativeType("GLenum") int r10, @org.lwjgl.system.NativeType("GLint") int r11, @org.lwjgl.system.NativeType("GLenum") int r12, @org.lwjgl.system.NativeType("GLsizei") int r13, @org.lwjgl.system.NativeType("GLsizei") int r14, @org.lwjgl.system.NativeType("void const *") java.nio.ByteBuffer r15) {
            r0 = r10
            r1 = r11
            r2 = r12
            r3 = r13
            r4 = r14
            r5 = 0
            r6 = r15
            int r6 = r6.remaining()
            r7 = r15
            long r7 = org.lwjgl.system.MemoryUtil.memAddress(r7)
            nglCompressedTexImage2DARB(r0, r1, r2, r3, r4, r5, r6, r7)
            return
    }

    public static native void nglCompressedTexImage1DARB(int r0, int r1, int r2, int r3, int r4, int r5, long r6);

    public static void glCompressedTexImage1DARB(@org.lwjgl.system.NativeType("GLenum") int r9, @org.lwjgl.system.NativeType("GLint") int r10, @org.lwjgl.system.NativeType("GLenum") int r11, @org.lwjgl.system.NativeType("GLsizei") int r12, @org.lwjgl.system.NativeType("GLint") int r13, @org.lwjgl.system.NativeType("GLsizei") int r14, @org.lwjgl.system.NativeType("void const *") long r15) {
            r0 = r9
            r1 = r10
            r2 = r11
            r3 = r12
            r4 = r13
            r5 = r14
            r6 = r15
            nglCompressedTexImage1DARB(r0, r1, r2, r3, r4, r5, r6)
            return
    }

    public static void glCompressedTexImage1DARB(@org.lwjgl.system.NativeType("GLenum") int r9, @org.lwjgl.system.NativeType("GLint") int r10, @org.lwjgl.system.NativeType("GLenum") int r11, @org.lwjgl.system.NativeType("GLsizei") int r12, @org.lwjgl.system.NativeType("void const *") java.nio.ByteBuffer r13) {
            r0 = r9
            r1 = r10
            r2 = r11
            r3 = r12
            r4 = 0
            r5 = r13
            int r5 = r5.remaining()
            r6 = r13
            long r6 = org.lwjgl.system.MemoryUtil.memAddress(r6)
            nglCompressedTexImage1DARB(r0, r1, r2, r3, r4, r5, r6)
            return
    }

    public static native void nglCompressedTexSubImage3DARB(int r0, int r1, int r2, int r3, int r4, int r5, int r6, int r7, int r8, int r9, long r10);

    public static void glCompressedTexSubImage3DARB(@org.lwjgl.system.NativeType("GLenum") int r13, @org.lwjgl.system.NativeType("GLint") int r14, @org.lwjgl.system.NativeType("GLint") int r15, @org.lwjgl.system.NativeType("GLint") int r16, @org.lwjgl.system.NativeType("GLint") int r17, @org.lwjgl.system.NativeType("GLsizei") int r18, @org.lwjgl.system.NativeType("GLsizei") int r19, @org.lwjgl.system.NativeType("GLsizei") int r20, @org.lwjgl.system.NativeType("GLenum") int r21, @org.lwjgl.system.NativeType("GLsizei") int r22, @org.lwjgl.system.NativeType("void const *") long r23) {
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
            nglCompressedTexSubImage3DARB(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            return
    }

    public static void glCompressedTexSubImage3DARB(@org.lwjgl.system.NativeType("GLenum") int r13, @org.lwjgl.system.NativeType("GLint") int r14, @org.lwjgl.system.NativeType("GLint") int r15, @org.lwjgl.system.NativeType("GLint") int r16, @org.lwjgl.system.NativeType("GLint") int r17, @org.lwjgl.system.NativeType("GLsizei") int r18, @org.lwjgl.system.NativeType("GLsizei") int r19, @org.lwjgl.system.NativeType("GLsizei") int r20, @org.lwjgl.system.NativeType("GLenum") int r21, @org.lwjgl.system.NativeType("void const *") java.nio.ByteBuffer r22) {
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
            nglCompressedTexSubImage3DARB(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            return
    }

    public static native void nglCompressedTexSubImage2DARB(int r0, int r1, int r2, int r3, int r4, int r5, int r6, int r7, long r8);

    public static void glCompressedTexSubImage2DARB(@org.lwjgl.system.NativeType("GLenum") int r11, @org.lwjgl.system.NativeType("GLint") int r12, @org.lwjgl.system.NativeType("GLint") int r13, @org.lwjgl.system.NativeType("GLint") int r14, @org.lwjgl.system.NativeType("GLsizei") int r15, @org.lwjgl.system.NativeType("GLsizei") int r16, @org.lwjgl.system.NativeType("GLenum") int r17, @org.lwjgl.system.NativeType("GLsizei") int r18, @org.lwjgl.system.NativeType("void const *") long r19) {
            r0 = r11
            r1 = r12
            r2 = r13
            r3 = r14
            r4 = r15
            r5 = r16
            r6 = r17
            r7 = r18
            r8 = r19
            nglCompressedTexSubImage2DARB(r0, r1, r2, r3, r4, r5, r6, r7, r8)
            return
    }

    public static void glCompressedTexSubImage2DARB(@org.lwjgl.system.NativeType("GLenum") int r11, @org.lwjgl.system.NativeType("GLint") int r12, @org.lwjgl.system.NativeType("GLint") int r13, @org.lwjgl.system.NativeType("GLint") int r14, @org.lwjgl.system.NativeType("GLsizei") int r15, @org.lwjgl.system.NativeType("GLsizei") int r16, @org.lwjgl.system.NativeType("GLenum") int r17, @org.lwjgl.system.NativeType("void const *") java.nio.ByteBuffer r18) {
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
            nglCompressedTexSubImage2DARB(r0, r1, r2, r3, r4, r5, r6, r7, r8)
            return
    }

    public static native void nglCompressedTexSubImage1DARB(int r0, int r1, int r2, int r3, int r4, int r5, long r6);

    public static void glCompressedTexSubImage1DARB(@org.lwjgl.system.NativeType("GLenum") int r9, @org.lwjgl.system.NativeType("GLint") int r10, @org.lwjgl.system.NativeType("GLint") int r11, @org.lwjgl.system.NativeType("GLsizei") int r12, @org.lwjgl.system.NativeType("GLenum") int r13, @org.lwjgl.system.NativeType("GLsizei") int r14, @org.lwjgl.system.NativeType("void const *") long r15) {
            r0 = r9
            r1 = r10
            r2 = r11
            r3 = r12
            r4 = r13
            r5 = r14
            r6 = r15
            nglCompressedTexSubImage1DARB(r0, r1, r2, r3, r4, r5, r6)
            return
    }

    public static void glCompressedTexSubImage1DARB(@org.lwjgl.system.NativeType("GLenum") int r9, @org.lwjgl.system.NativeType("GLint") int r10, @org.lwjgl.system.NativeType("GLint") int r11, @org.lwjgl.system.NativeType("GLsizei") int r12, @org.lwjgl.system.NativeType("GLenum") int r13, @org.lwjgl.system.NativeType("void const *") java.nio.ByteBuffer r14) {
            r0 = r9
            r1 = r10
            r2 = r11
            r3 = r12
            r4 = r13
            r5 = r14
            int r5 = r5.remaining()
            r6 = r14
            long r6 = org.lwjgl.system.MemoryUtil.memAddress(r6)
            nglCompressedTexSubImage1DARB(r0, r1, r2, r3, r4, r5, r6)
            return
    }

    public static native void nglGetCompressedTexImageARB(int r0, int r1, long r2);

    public static void glGetCompressedTexImageARB(@org.lwjgl.system.NativeType("GLenum") int r5, @org.lwjgl.system.NativeType("GLint") int r6, @org.lwjgl.system.NativeType("void *") java.nio.ByteBuffer r7) {
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
            nglGetCompressedTexImageARB(r0, r1, r2)
            return
    }

    public static void glGetCompressedTexImageARB(@org.lwjgl.system.NativeType("GLenum") int r5, @org.lwjgl.system.NativeType("GLint") int r6, @org.lwjgl.system.NativeType("void *") long r7) {
            r0 = r5
            r1 = r6
            r2 = r7
            nglGetCompressedTexImageARB(r0, r1, r2)
            return
    }

    static {
            org.lwjgl.opengl.GL.initialize()
            return
    }
}
