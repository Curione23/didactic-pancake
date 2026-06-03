package org.lwjgl.opengl;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/opengl/GL12C.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/opengl/GL12C.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/opengl/GL12C.class */
public class GL12C extends org.lwjgl.opengl.GL11C {
    public static final int GL_ALIASED_LINE_WIDTH_RANGE = 33902;
    public static final int GL_SMOOTH_POINT_SIZE_RANGE = 2834;
    public static final int GL_SMOOTH_POINT_SIZE_GRANULARITY = 2835;
    public static final int GL_SMOOTH_LINE_WIDTH_RANGE = 2850;
    public static final int GL_SMOOTH_LINE_WIDTH_GRANULARITY = 2851;
    public static final int GL_TEXTURE_BINDING_3D = 32874;
    public static final int GL_PACK_SKIP_IMAGES = 32875;
    public static final int GL_PACK_IMAGE_HEIGHT = 32876;
    public static final int GL_UNPACK_SKIP_IMAGES = 32877;
    public static final int GL_UNPACK_IMAGE_HEIGHT = 32878;
    public static final int GL_TEXTURE_3D = 32879;
    public static final int GL_PROXY_TEXTURE_3D = 32880;
    public static final int GL_TEXTURE_DEPTH = 32881;
    public static final int GL_TEXTURE_WRAP_R = 32882;
    public static final int GL_MAX_3D_TEXTURE_SIZE = 32883;
    public static final int GL_BGR = 32992;
    public static final int GL_BGRA = 32993;
    public static final int GL_UNSIGNED_BYTE_3_3_2 = 32818;
    public static final int GL_UNSIGNED_BYTE_2_3_3_REV = 33634;
    public static final int GL_UNSIGNED_SHORT_5_6_5 = 33635;
    public static final int GL_UNSIGNED_SHORT_5_6_5_REV = 33636;
    public static final int GL_UNSIGNED_SHORT_4_4_4_4 = 32819;
    public static final int GL_UNSIGNED_SHORT_4_4_4_4_REV = 33637;
    public static final int GL_UNSIGNED_SHORT_5_5_5_1 = 32820;
    public static final int GL_UNSIGNED_SHORT_1_5_5_5_REV = 33638;
    public static final int GL_UNSIGNED_INT_8_8_8_8 = 32821;
    public static final int GL_UNSIGNED_INT_8_8_8_8_REV = 33639;
    public static final int GL_UNSIGNED_INT_10_10_10_2 = 32822;
    public static final int GL_UNSIGNED_INT_2_10_10_10_REV = 33640;
    public static final int GL_CLAMP_TO_EDGE = 33071;
    public static final int GL_TEXTURE_MIN_LOD = 33082;
    public static final int GL_TEXTURE_MAX_LOD = 33083;
    public static final int GL_TEXTURE_BASE_LEVEL = 33084;
    public static final int GL_TEXTURE_MAX_LEVEL = 33085;
    public static final int GL_MAX_ELEMENTS_VERTICES = 33000;
    public static final int GL_MAX_ELEMENTS_INDICES = 33001;

    protected GL12C() {
            r3 = this;
            r0 = r3
            r0.<init>()
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r1 = r0
            r1.<init>()
            throw r0
    }

    public static native void nglTexImage3D(int r0, int r1, int r2, int r3, int r4, int r5, int r6, int r7, int r8, long r9);

    public static void glTexImage3D(@org.lwjgl.system.NativeType("GLenum") int r12, @org.lwjgl.system.NativeType("GLint") int r13, @org.lwjgl.system.NativeType("GLint") int r14, @org.lwjgl.system.NativeType("GLsizei") int r15, @org.lwjgl.system.NativeType("GLsizei") int r16, @org.lwjgl.system.NativeType("GLsizei") int r17, @org.lwjgl.system.NativeType("GLint") int r18, @org.lwjgl.system.NativeType("GLenum") int r19, @org.lwjgl.system.NativeType("GLenum") int r20, @javax.annotation.Nullable @org.lwjgl.system.NativeType("void const *") java.nio.ByteBuffer r21) {
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
            nglTexImage3D(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9)
            return
    }

    public static void glTexImage3D(@org.lwjgl.system.NativeType("GLenum") int r12, @org.lwjgl.system.NativeType("GLint") int r13, @org.lwjgl.system.NativeType("GLint") int r14, @org.lwjgl.system.NativeType("GLsizei") int r15, @org.lwjgl.system.NativeType("GLsizei") int r16, @org.lwjgl.system.NativeType("GLsizei") int r17, @org.lwjgl.system.NativeType("GLint") int r18, @org.lwjgl.system.NativeType("GLenum") int r19, @org.lwjgl.system.NativeType("GLenum") int r20, @org.lwjgl.system.NativeType("void const *") long r21) {
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
            nglTexImage3D(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9)
            return
    }

    public static void glTexImage3D(@org.lwjgl.system.NativeType("GLenum") int r12, @org.lwjgl.system.NativeType("GLint") int r13, @org.lwjgl.system.NativeType("GLint") int r14, @org.lwjgl.system.NativeType("GLsizei") int r15, @org.lwjgl.system.NativeType("GLsizei") int r16, @org.lwjgl.system.NativeType("GLsizei") int r17, @org.lwjgl.system.NativeType("GLint") int r18, @org.lwjgl.system.NativeType("GLenum") int r19, @org.lwjgl.system.NativeType("GLenum") int r20, @javax.annotation.Nullable @org.lwjgl.system.NativeType("void const *") java.nio.ShortBuffer r21) {
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
            nglTexImage3D(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9)
            return
    }

    public static void glTexImage3D(@org.lwjgl.system.NativeType("GLenum") int r12, @org.lwjgl.system.NativeType("GLint") int r13, @org.lwjgl.system.NativeType("GLint") int r14, @org.lwjgl.system.NativeType("GLsizei") int r15, @org.lwjgl.system.NativeType("GLsizei") int r16, @org.lwjgl.system.NativeType("GLsizei") int r17, @org.lwjgl.system.NativeType("GLint") int r18, @org.lwjgl.system.NativeType("GLenum") int r19, @org.lwjgl.system.NativeType("GLenum") int r20, @javax.annotation.Nullable @org.lwjgl.system.NativeType("void const *") java.nio.IntBuffer r21) {
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
            nglTexImage3D(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9)
            return
    }

    public static void glTexImage3D(@org.lwjgl.system.NativeType("GLenum") int r12, @org.lwjgl.system.NativeType("GLint") int r13, @org.lwjgl.system.NativeType("GLint") int r14, @org.lwjgl.system.NativeType("GLsizei") int r15, @org.lwjgl.system.NativeType("GLsizei") int r16, @org.lwjgl.system.NativeType("GLsizei") int r17, @org.lwjgl.system.NativeType("GLint") int r18, @org.lwjgl.system.NativeType("GLenum") int r19, @org.lwjgl.system.NativeType("GLenum") int r20, @javax.annotation.Nullable @org.lwjgl.system.NativeType("void const *") java.nio.FloatBuffer r21) {
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
            nglTexImage3D(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9)
            return
    }

    public static void glTexImage3D(@org.lwjgl.system.NativeType("GLenum") int r12, @org.lwjgl.system.NativeType("GLint") int r13, @org.lwjgl.system.NativeType("GLint") int r14, @org.lwjgl.system.NativeType("GLsizei") int r15, @org.lwjgl.system.NativeType("GLsizei") int r16, @org.lwjgl.system.NativeType("GLsizei") int r17, @org.lwjgl.system.NativeType("GLint") int r18, @org.lwjgl.system.NativeType("GLenum") int r19, @org.lwjgl.system.NativeType("GLenum") int r20, @javax.annotation.Nullable @org.lwjgl.system.NativeType("void const *") java.nio.DoubleBuffer r21) {
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
            nglTexImage3D(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9)
            return
    }

    public static native void nglTexSubImage3D(int r0, int r1, int r2, int r3, int r4, int r5, int r6, int r7, int r8, int r9, long r10);

    public static void glTexSubImage3D(@org.lwjgl.system.NativeType("GLenum") int r13, @org.lwjgl.system.NativeType("GLint") int r14, @org.lwjgl.system.NativeType("GLint") int r15, @org.lwjgl.system.NativeType("GLint") int r16, @org.lwjgl.system.NativeType("GLint") int r17, @org.lwjgl.system.NativeType("GLsizei") int r18, @org.lwjgl.system.NativeType("GLsizei") int r19, @org.lwjgl.system.NativeType("GLsizei") int r20, @org.lwjgl.system.NativeType("GLenum") int r21, @org.lwjgl.system.NativeType("GLenum") int r22, @org.lwjgl.system.NativeType("void const *") java.nio.ByteBuffer r23) {
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
            long r10 = org.lwjgl.system.MemoryUtil.memAddress(r10)
            nglTexSubImage3D(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            return
    }

    public static void glTexSubImage3D(@org.lwjgl.system.NativeType("GLenum") int r13, @org.lwjgl.system.NativeType("GLint") int r14, @org.lwjgl.system.NativeType("GLint") int r15, @org.lwjgl.system.NativeType("GLint") int r16, @org.lwjgl.system.NativeType("GLint") int r17, @org.lwjgl.system.NativeType("GLsizei") int r18, @org.lwjgl.system.NativeType("GLsizei") int r19, @org.lwjgl.system.NativeType("GLsizei") int r20, @org.lwjgl.system.NativeType("GLenum") int r21, @org.lwjgl.system.NativeType("GLenum") int r22, @org.lwjgl.system.NativeType("void const *") long r23) {
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
            nglTexSubImage3D(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            return
    }

    public static void glTexSubImage3D(@org.lwjgl.system.NativeType("GLenum") int r13, @org.lwjgl.system.NativeType("GLint") int r14, @org.lwjgl.system.NativeType("GLint") int r15, @org.lwjgl.system.NativeType("GLint") int r16, @org.lwjgl.system.NativeType("GLint") int r17, @org.lwjgl.system.NativeType("GLsizei") int r18, @org.lwjgl.system.NativeType("GLsizei") int r19, @org.lwjgl.system.NativeType("GLsizei") int r20, @org.lwjgl.system.NativeType("GLenum") int r21, @org.lwjgl.system.NativeType("GLenum") int r22, @org.lwjgl.system.NativeType("void const *") java.nio.ShortBuffer r23) {
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
            long r10 = org.lwjgl.system.MemoryUtil.memAddress(r10)
            nglTexSubImage3D(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            return
    }

    public static void glTexSubImage3D(@org.lwjgl.system.NativeType("GLenum") int r13, @org.lwjgl.system.NativeType("GLint") int r14, @org.lwjgl.system.NativeType("GLint") int r15, @org.lwjgl.system.NativeType("GLint") int r16, @org.lwjgl.system.NativeType("GLint") int r17, @org.lwjgl.system.NativeType("GLsizei") int r18, @org.lwjgl.system.NativeType("GLsizei") int r19, @org.lwjgl.system.NativeType("GLsizei") int r20, @org.lwjgl.system.NativeType("GLenum") int r21, @org.lwjgl.system.NativeType("GLenum") int r22, @org.lwjgl.system.NativeType("void const *") java.nio.IntBuffer r23) {
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
            long r10 = org.lwjgl.system.MemoryUtil.memAddress(r10)
            nglTexSubImage3D(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            return
    }

    public static void glTexSubImage3D(@org.lwjgl.system.NativeType("GLenum") int r13, @org.lwjgl.system.NativeType("GLint") int r14, @org.lwjgl.system.NativeType("GLint") int r15, @org.lwjgl.system.NativeType("GLint") int r16, @org.lwjgl.system.NativeType("GLint") int r17, @org.lwjgl.system.NativeType("GLsizei") int r18, @org.lwjgl.system.NativeType("GLsizei") int r19, @org.lwjgl.system.NativeType("GLsizei") int r20, @org.lwjgl.system.NativeType("GLenum") int r21, @org.lwjgl.system.NativeType("GLenum") int r22, @org.lwjgl.system.NativeType("void const *") java.nio.FloatBuffer r23) {
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
            long r10 = org.lwjgl.system.MemoryUtil.memAddress(r10)
            nglTexSubImage3D(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            return
    }

    public static void glTexSubImage3D(@org.lwjgl.system.NativeType("GLenum") int r13, @org.lwjgl.system.NativeType("GLint") int r14, @org.lwjgl.system.NativeType("GLint") int r15, @org.lwjgl.system.NativeType("GLint") int r16, @org.lwjgl.system.NativeType("GLint") int r17, @org.lwjgl.system.NativeType("GLsizei") int r18, @org.lwjgl.system.NativeType("GLsizei") int r19, @org.lwjgl.system.NativeType("GLsizei") int r20, @org.lwjgl.system.NativeType("GLenum") int r21, @org.lwjgl.system.NativeType("GLenum") int r22, @org.lwjgl.system.NativeType("void const *") java.nio.DoubleBuffer r23) {
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
            long r10 = org.lwjgl.system.MemoryUtil.memAddress(r10)
            nglTexSubImage3D(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            return
    }

    public static native void glCopyTexSubImage3D(@org.lwjgl.system.NativeType("GLenum") int r0, @org.lwjgl.system.NativeType("GLint") int r1, @org.lwjgl.system.NativeType("GLint") int r2, @org.lwjgl.system.NativeType("GLint") int r3, @org.lwjgl.system.NativeType("GLint") int r4, @org.lwjgl.system.NativeType("GLint") int r5, @org.lwjgl.system.NativeType("GLint") int r6, @org.lwjgl.system.NativeType("GLsizei") int r7, @org.lwjgl.system.NativeType("GLsizei") int r8);

    public static native void nglDrawRangeElements(int r0, int r1, int r2, int r3, int r4, long r5);

    public static void glDrawRangeElements(@org.lwjgl.system.NativeType("GLenum") int r8, @org.lwjgl.system.NativeType("GLuint") int r9, @org.lwjgl.system.NativeType("GLuint") int r10, @org.lwjgl.system.NativeType("GLsizei") int r11, @org.lwjgl.system.NativeType("GLenum") int r12, @org.lwjgl.system.NativeType("void const *") long r13) {
            r0 = r8
            r1 = r9
            r2 = r10
            r3 = r11
            r4 = r12
            r5 = r13
            nglDrawRangeElements(r0, r1, r2, r3, r4, r5)
            return
    }

    public static void glDrawRangeElements(@org.lwjgl.system.NativeType("GLenum") int r8, @org.lwjgl.system.NativeType("GLuint") int r9, @org.lwjgl.system.NativeType("GLuint") int r10, @org.lwjgl.system.NativeType("GLenum") int r11, @org.lwjgl.system.NativeType("void const *") java.nio.ByteBuffer r12) {
            r0 = r8
            r1 = r9
            r2 = r10
            r3 = r12
            int r3 = r3.remaining()
            r4 = r11
            int r4 = org.lwjgl.opengl.GLChecks.typeToByteShift(r4)
            int r3 = r3 >> r4
            r4 = r11
            r5 = r12
            long r5 = org.lwjgl.system.MemoryUtil.memAddress(r5)
            nglDrawRangeElements(r0, r1, r2, r3, r4, r5)
            return
    }

    public static void glDrawRangeElements(@org.lwjgl.system.NativeType("GLenum") int r8, @org.lwjgl.system.NativeType("GLuint") int r9, @org.lwjgl.system.NativeType("GLuint") int r10, @org.lwjgl.system.NativeType("void const *") java.nio.ByteBuffer r11) {
            r0 = r8
            r1 = r9
            r2 = r10
            r3 = r11
            int r3 = r3.remaining()
            r4 = 5121(0x1401, float:7.176E-42)
            r5 = r11
            long r5 = org.lwjgl.system.MemoryUtil.memAddress(r5)
            nglDrawRangeElements(r0, r1, r2, r3, r4, r5)
            return
    }

    public static void glDrawRangeElements(@org.lwjgl.system.NativeType("GLenum") int r8, @org.lwjgl.system.NativeType("GLuint") int r9, @org.lwjgl.system.NativeType("GLuint") int r10, @org.lwjgl.system.NativeType("void const *") java.nio.ShortBuffer r11) {
            r0 = r8
            r1 = r9
            r2 = r10
            r3 = r11
            int r3 = r3.remaining()
            r4 = 5123(0x1403, float:7.179E-42)
            r5 = r11
            long r5 = org.lwjgl.system.MemoryUtil.memAddress(r5)
            nglDrawRangeElements(r0, r1, r2, r3, r4, r5)
            return
    }

    public static void glDrawRangeElements(@org.lwjgl.system.NativeType("GLenum") int r8, @org.lwjgl.system.NativeType("GLuint") int r9, @org.lwjgl.system.NativeType("GLuint") int r10, @org.lwjgl.system.NativeType("void const *") java.nio.IntBuffer r11) {
            r0 = r8
            r1 = r9
            r2 = r10
            r3 = r11
            int r3 = r3.remaining()
            r4 = 5125(0x1405, float:7.182E-42)
            r5 = r11
            long r5 = org.lwjgl.system.MemoryUtil.memAddress(r5)
            nglDrawRangeElements(r0, r1, r2, r3, r4, r5)
            return
    }

    public static void glTexImage3D(@org.lwjgl.system.NativeType("GLenum") int r13, @org.lwjgl.system.NativeType("GLint") int r14, @org.lwjgl.system.NativeType("GLint") int r15, @org.lwjgl.system.NativeType("GLsizei") int r16, @org.lwjgl.system.NativeType("GLsizei") int r17, @org.lwjgl.system.NativeType("GLsizei") int r18, @org.lwjgl.system.NativeType("GLint") int r19, @org.lwjgl.system.NativeType("GLenum") int r20, @org.lwjgl.system.NativeType("GLenum") int r21, @javax.annotation.Nullable @org.lwjgl.system.NativeType("void const *") short[] r22) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glTexImage3D
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

    public static void glTexImage3D(@org.lwjgl.system.NativeType("GLenum") int r13, @org.lwjgl.system.NativeType("GLint") int r14, @org.lwjgl.system.NativeType("GLint") int r15, @org.lwjgl.system.NativeType("GLsizei") int r16, @org.lwjgl.system.NativeType("GLsizei") int r17, @org.lwjgl.system.NativeType("GLsizei") int r18, @org.lwjgl.system.NativeType("GLint") int r19, @org.lwjgl.system.NativeType("GLenum") int r20, @org.lwjgl.system.NativeType("GLenum") int r21, @javax.annotation.Nullable @org.lwjgl.system.NativeType("void const *") int[] r22) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glTexImage3D
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

    public static void glTexImage3D(@org.lwjgl.system.NativeType("GLenum") int r13, @org.lwjgl.system.NativeType("GLint") int r14, @org.lwjgl.system.NativeType("GLint") int r15, @org.lwjgl.system.NativeType("GLsizei") int r16, @org.lwjgl.system.NativeType("GLsizei") int r17, @org.lwjgl.system.NativeType("GLsizei") int r18, @org.lwjgl.system.NativeType("GLint") int r19, @org.lwjgl.system.NativeType("GLenum") int r20, @org.lwjgl.system.NativeType("GLenum") int r21, @javax.annotation.Nullable @org.lwjgl.system.NativeType("void const *") float[] r22) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glTexImage3D
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

    public static void glTexImage3D(@org.lwjgl.system.NativeType("GLenum") int r13, @org.lwjgl.system.NativeType("GLint") int r14, @org.lwjgl.system.NativeType("GLint") int r15, @org.lwjgl.system.NativeType("GLsizei") int r16, @org.lwjgl.system.NativeType("GLsizei") int r17, @org.lwjgl.system.NativeType("GLsizei") int r18, @org.lwjgl.system.NativeType("GLint") int r19, @org.lwjgl.system.NativeType("GLenum") int r20, @org.lwjgl.system.NativeType("GLenum") int r21, @javax.annotation.Nullable @org.lwjgl.system.NativeType("void const *") double[] r22) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glTexImage3D
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

    public static void glTexSubImage3D(@org.lwjgl.system.NativeType("GLenum") int r14, @org.lwjgl.system.NativeType("GLint") int r15, @org.lwjgl.system.NativeType("GLint") int r16, @org.lwjgl.system.NativeType("GLint") int r17, @org.lwjgl.system.NativeType("GLint") int r18, @org.lwjgl.system.NativeType("GLsizei") int r19, @org.lwjgl.system.NativeType("GLsizei") int r20, @org.lwjgl.system.NativeType("GLsizei") int r21, @org.lwjgl.system.NativeType("GLenum") int r22, @org.lwjgl.system.NativeType("GLenum") int r23, @org.lwjgl.system.NativeType("void const *") short[] r24) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glTexSubImage3D
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

    public static void glTexSubImage3D(@org.lwjgl.system.NativeType("GLenum") int r14, @org.lwjgl.system.NativeType("GLint") int r15, @org.lwjgl.system.NativeType("GLint") int r16, @org.lwjgl.system.NativeType("GLint") int r17, @org.lwjgl.system.NativeType("GLint") int r18, @org.lwjgl.system.NativeType("GLsizei") int r19, @org.lwjgl.system.NativeType("GLsizei") int r20, @org.lwjgl.system.NativeType("GLsizei") int r21, @org.lwjgl.system.NativeType("GLenum") int r22, @org.lwjgl.system.NativeType("GLenum") int r23, @org.lwjgl.system.NativeType("void const *") int[] r24) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glTexSubImage3D
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

    public static void glTexSubImage3D(@org.lwjgl.system.NativeType("GLenum") int r14, @org.lwjgl.system.NativeType("GLint") int r15, @org.lwjgl.system.NativeType("GLint") int r16, @org.lwjgl.system.NativeType("GLint") int r17, @org.lwjgl.system.NativeType("GLint") int r18, @org.lwjgl.system.NativeType("GLsizei") int r19, @org.lwjgl.system.NativeType("GLsizei") int r20, @org.lwjgl.system.NativeType("GLsizei") int r21, @org.lwjgl.system.NativeType("GLenum") int r22, @org.lwjgl.system.NativeType("GLenum") int r23, @org.lwjgl.system.NativeType("void const *") float[] r24) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glTexSubImage3D
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

    public static void glTexSubImage3D(@org.lwjgl.system.NativeType("GLenum") int r14, @org.lwjgl.system.NativeType("GLint") int r15, @org.lwjgl.system.NativeType("GLint") int r16, @org.lwjgl.system.NativeType("GLint") int r17, @org.lwjgl.system.NativeType("GLint") int r18, @org.lwjgl.system.NativeType("GLsizei") int r19, @org.lwjgl.system.NativeType("GLsizei") int r20, @org.lwjgl.system.NativeType("GLsizei") int r21, @org.lwjgl.system.NativeType("GLenum") int r22, @org.lwjgl.system.NativeType("GLenum") int r23, @org.lwjgl.system.NativeType("void const *") double[] r24) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glTexSubImage3D
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

    static {
            org.lwjgl.opengl.GL.initialize()
            return
    }
}
