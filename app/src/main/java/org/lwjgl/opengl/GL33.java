package org.lwjgl.opengl;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/opengl/GL33.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/opengl/GL33.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/opengl/GL33.class */
public class GL33 extends org.lwjgl.opengl.GL32 {
    public static final int GL_SRC1_COLOR = 35065;
    public static final int GL_ONE_MINUS_SRC1_COLOR = 35066;
    public static final int GL_ONE_MINUS_SRC1_ALPHA = 35067;
    public static final int GL_MAX_DUAL_SOURCE_DRAW_BUFFERS = 35068;
    public static final int GL_ANY_SAMPLES_PASSED = 35887;
    public static final int GL_SAMPLER_BINDING = 35097;
    public static final int GL_RGB10_A2UI = 36975;
    public static final int GL_TEXTURE_SWIZZLE_R = 36418;
    public static final int GL_TEXTURE_SWIZZLE_G = 36419;
    public static final int GL_TEXTURE_SWIZZLE_B = 36420;
    public static final int GL_TEXTURE_SWIZZLE_A = 36421;
    public static final int GL_TEXTURE_SWIZZLE_RGBA = 36422;
    public static final int GL_TIME_ELAPSED = 35007;
    public static final int GL_TIMESTAMP = 36392;
    public static final int GL_VERTEX_ATTRIB_ARRAY_DIVISOR = 35070;
    public static final int GL_INT_2_10_10_10_REV = 36255;

    protected GL33() {
            r3 = this;
            r0 = r3
            r0.<init>()
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r1 = r0
            r1.<init>()
            throw r0
    }

    public static void nglBindFragDataLocationIndexed(int r6, int r7, int r8, long r9) {
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            org.lwjgl.opengl.GL33C.nglBindFragDataLocationIndexed(r0, r1, r2, r3)
            return
    }

    public static void glBindFragDataLocationIndexed(@org.lwjgl.system.NativeType("GLuint") int r5, @org.lwjgl.system.NativeType("GLuint") int r6, @org.lwjgl.system.NativeType("GLuint") int r7, @org.lwjgl.system.NativeType("GLchar const *") java.nio.ByteBuffer r8) {
            r0 = r5
            r1 = r6
            r2 = r7
            r3 = r8
            org.lwjgl.opengl.GL33C.glBindFragDataLocationIndexed(r0, r1, r2, r3)
            return
    }

    public static void glBindFragDataLocationIndexed(@org.lwjgl.system.NativeType("GLuint") int r5, @org.lwjgl.system.NativeType("GLuint") int r6, @org.lwjgl.system.NativeType("GLuint") int r7, @org.lwjgl.system.NativeType("GLchar const *") java.lang.CharSequence r8) {
            r0 = r5
            r1 = r6
            r2 = r7
            r3 = r8
            org.lwjgl.opengl.GL33C.glBindFragDataLocationIndexed(r0, r1, r2, r3)
            return
    }

    public static int nglGetFragDataIndex(int r4, long r5) {
            r0 = r4
            r1 = r5
            int r0 = org.lwjgl.opengl.GL33C.nglGetFragDataIndex(r0, r1)
            return r0
    }

    @org.lwjgl.system.NativeType("GLint")
    public static int glGetFragDataIndex(@org.lwjgl.system.NativeType("GLuint") int r3, @org.lwjgl.system.NativeType("GLchar const *") java.nio.ByteBuffer r4) {
            r0 = r3
            r1 = r4
            int r0 = org.lwjgl.opengl.GL33C.glGetFragDataIndex(r0, r1)
            return r0
    }

    @org.lwjgl.system.NativeType("GLint")
    public static int glGetFragDataIndex(@org.lwjgl.system.NativeType("GLuint") int r3, @org.lwjgl.system.NativeType("GLchar const *") java.lang.CharSequence r4) {
            r0 = r3
            r1 = r4
            int r0 = org.lwjgl.opengl.GL33C.glGetFragDataIndex(r0, r1)
            return r0
    }

    public static void nglGenSamplers(int r4, long r5) {
            r0 = r4
            r1 = r5
            org.lwjgl.opengl.GL33C.nglGenSamplers(r0, r1)
            return
    }

    public static void glGenSamplers(@org.lwjgl.system.NativeType("GLuint *") java.nio.IntBuffer r2) {
            r0 = r2
            org.lwjgl.opengl.GL33C.glGenSamplers(r0)
            return
    }

    @org.lwjgl.system.NativeType("void")
    public static int glGenSamplers() {
            int r0 = org.lwjgl.opengl.GL33C.glGenSamplers()
            return r0
    }

    public static void nglDeleteSamplers(int r4, long r5) {
            r0 = r4
            r1 = r5
            org.lwjgl.opengl.GL33C.nglDeleteSamplers(r0, r1)
            return
    }

    public static void glDeleteSamplers(@org.lwjgl.system.NativeType("GLuint const *") java.nio.IntBuffer r2) {
            r0 = r2
            org.lwjgl.opengl.GL33C.glDeleteSamplers(r0)
            return
    }

    public static void glDeleteSamplers(@org.lwjgl.system.NativeType("GLuint const *") int r2) {
            r0 = r2
            org.lwjgl.opengl.GL33C.glDeleteSamplers(r0)
            return
    }

    @org.lwjgl.system.NativeType("GLboolean")
    public static boolean glIsSampler(@org.lwjgl.system.NativeType("GLuint") int r2) {
            r0 = r2
            boolean r0 = org.lwjgl.opengl.GL33C.glIsSampler(r0)
            return r0
    }

    public static void glBindSampler(@org.lwjgl.system.NativeType("GLuint") int r3, @org.lwjgl.system.NativeType("GLuint") int r4) {
            r0 = r3
            r1 = r4
            org.lwjgl.opengl.GL33C.glBindSampler(r0, r1)
            return
    }

    public static void glSamplerParameteri(@org.lwjgl.system.NativeType("GLuint") int r4, @org.lwjgl.system.NativeType("GLenum") int r5, @org.lwjgl.system.NativeType("GLint") int r6) {
            r0 = r4
            r1 = r5
            r2 = r6
            org.lwjgl.opengl.GL33C.glSamplerParameteri(r0, r1, r2)
            return
    }

    public static void glSamplerParameterf(@org.lwjgl.system.NativeType("GLuint") int r4, @org.lwjgl.system.NativeType("GLenum") int r5, @org.lwjgl.system.NativeType("GLfloat") float r6) {
            r0 = r4
            r1 = r5
            r2 = r6
            org.lwjgl.opengl.GL33C.glSamplerParameterf(r0, r1, r2)
            return
    }

    public static void nglSamplerParameteriv(int r5, int r6, long r7) {
            r0 = r5
            r1 = r6
            r2 = r7
            org.lwjgl.opengl.GL33C.nglSamplerParameteriv(r0, r1, r2)
            return
    }

    public static void glSamplerParameteriv(@org.lwjgl.system.NativeType("GLuint") int r4, @org.lwjgl.system.NativeType("GLenum") int r5, @org.lwjgl.system.NativeType("GLint const *") java.nio.IntBuffer r6) {
            r0 = r4
            r1 = r5
            r2 = r6
            org.lwjgl.opengl.GL33C.glSamplerParameteriv(r0, r1, r2)
            return
    }

    public static void nglSamplerParameterfv(int r5, int r6, long r7) {
            r0 = r5
            r1 = r6
            r2 = r7
            org.lwjgl.opengl.GL33C.nglSamplerParameterfv(r0, r1, r2)
            return
    }

    public static void glSamplerParameterfv(@org.lwjgl.system.NativeType("GLuint") int r4, @org.lwjgl.system.NativeType("GLenum") int r5, @org.lwjgl.system.NativeType("GLfloat const *") java.nio.FloatBuffer r6) {
            r0 = r4
            r1 = r5
            r2 = r6
            org.lwjgl.opengl.GL33C.glSamplerParameterfv(r0, r1, r2)
            return
    }

    public static void nglSamplerParameterIiv(int r5, int r6, long r7) {
            r0 = r5
            r1 = r6
            r2 = r7
            org.lwjgl.opengl.GL33C.nglSamplerParameterIiv(r0, r1, r2)
            return
    }

    public static void glSamplerParameterIiv(@org.lwjgl.system.NativeType("GLuint") int r4, @org.lwjgl.system.NativeType("GLenum") int r5, @org.lwjgl.system.NativeType("GLint const *") java.nio.IntBuffer r6) {
            r0 = r4
            r1 = r5
            r2 = r6
            org.lwjgl.opengl.GL33C.glSamplerParameterIiv(r0, r1, r2)
            return
    }

    public static void nglSamplerParameterIuiv(int r5, int r6, long r7) {
            r0 = r5
            r1 = r6
            r2 = r7
            org.lwjgl.opengl.GL33C.nglSamplerParameterIuiv(r0, r1, r2)
            return
    }

    public static void glSamplerParameterIuiv(@org.lwjgl.system.NativeType("GLuint") int r4, @org.lwjgl.system.NativeType("GLenum") int r5, @org.lwjgl.system.NativeType("GLuint const *") java.nio.IntBuffer r6) {
            r0 = r4
            r1 = r5
            r2 = r6
            org.lwjgl.opengl.GL33C.glSamplerParameterIuiv(r0, r1, r2)
            return
    }

    public static void nglGetSamplerParameteriv(int r5, int r6, long r7) {
            r0 = r5
            r1 = r6
            r2 = r7
            org.lwjgl.opengl.GL33C.nglGetSamplerParameteriv(r0, r1, r2)
            return
    }

    public static void glGetSamplerParameteriv(@org.lwjgl.system.NativeType("GLuint") int r4, @org.lwjgl.system.NativeType("GLenum") int r5, @org.lwjgl.system.NativeType("GLint *") java.nio.IntBuffer r6) {
            r0 = r4
            r1 = r5
            r2 = r6
            org.lwjgl.opengl.GL33C.glGetSamplerParameteriv(r0, r1, r2)
            return
    }

    @org.lwjgl.system.NativeType("void")
    public static int glGetSamplerParameteri(@org.lwjgl.system.NativeType("GLuint") int r3, @org.lwjgl.system.NativeType("GLenum") int r4) {
            r0 = r3
            r1 = r4
            int r0 = org.lwjgl.opengl.GL33C.glGetSamplerParameteri(r0, r1)
            return r0
    }

    public static void nglGetSamplerParameterfv(int r5, int r6, long r7) {
            r0 = r5
            r1 = r6
            r2 = r7
            org.lwjgl.opengl.GL33C.nglGetSamplerParameterfv(r0, r1, r2)
            return
    }

    public static void glGetSamplerParameterfv(@org.lwjgl.system.NativeType("GLuint") int r4, @org.lwjgl.system.NativeType("GLenum") int r5, @org.lwjgl.system.NativeType("GLfloat *") java.nio.FloatBuffer r6) {
            r0 = r4
            r1 = r5
            r2 = r6
            org.lwjgl.opengl.GL33C.glGetSamplerParameterfv(r0, r1, r2)
            return
    }

    @org.lwjgl.system.NativeType("void")
    public static float glGetSamplerParameterf(@org.lwjgl.system.NativeType("GLuint") int r3, @org.lwjgl.system.NativeType("GLenum") int r4) {
            r0 = r3
            r1 = r4
            float r0 = org.lwjgl.opengl.GL33C.glGetSamplerParameterf(r0, r1)
            return r0
    }

    public static void nglGetSamplerParameterIiv(int r5, int r6, long r7) {
            r0 = r5
            r1 = r6
            r2 = r7
            org.lwjgl.opengl.GL33C.nglGetSamplerParameterIiv(r0, r1, r2)
            return
    }

    public static void glGetSamplerParameterIiv(@org.lwjgl.system.NativeType("GLuint") int r4, @org.lwjgl.system.NativeType("GLenum") int r5, @org.lwjgl.system.NativeType("GLint *") java.nio.IntBuffer r6) {
            r0 = r4
            r1 = r5
            r2 = r6
            org.lwjgl.opengl.GL33C.glGetSamplerParameterIiv(r0, r1, r2)
            return
    }

    @org.lwjgl.system.NativeType("void")
    public static int glGetSamplerParameterIi(@org.lwjgl.system.NativeType("GLuint") int r3, @org.lwjgl.system.NativeType("GLenum") int r4) {
            r0 = r3
            r1 = r4
            int r0 = org.lwjgl.opengl.GL33C.glGetSamplerParameterIi(r0, r1)
            return r0
    }

    public static void nglGetSamplerParameterIuiv(int r5, int r6, long r7) {
            r0 = r5
            r1 = r6
            r2 = r7
            org.lwjgl.opengl.GL33C.nglGetSamplerParameterIuiv(r0, r1, r2)
            return
    }

    public static void glGetSamplerParameterIuiv(@org.lwjgl.system.NativeType("GLuint") int r4, @org.lwjgl.system.NativeType("GLenum") int r5, @org.lwjgl.system.NativeType("GLuint *") java.nio.IntBuffer r6) {
            r0 = r4
            r1 = r5
            r2 = r6
            org.lwjgl.opengl.GL33C.glGetSamplerParameterIuiv(r0, r1, r2)
            return
    }

    @org.lwjgl.system.NativeType("void")
    public static int glGetSamplerParameterIui(@org.lwjgl.system.NativeType("GLuint") int r3, @org.lwjgl.system.NativeType("GLenum") int r4) {
            r0 = r3
            r1 = r4
            int r0 = org.lwjgl.opengl.GL33C.glGetSamplerParameterIui(r0, r1)
            return r0
    }

    public static void glQueryCounter(@org.lwjgl.system.NativeType("GLuint") int r3, @org.lwjgl.system.NativeType("GLenum") int r4) {
            r0 = r3
            r1 = r4
            org.lwjgl.opengl.GL33C.glQueryCounter(r0, r1)
            return
    }

    public static void nglGetQueryObjecti64v(int r5, int r6, long r7) {
            r0 = r5
            r1 = r6
            r2 = r7
            org.lwjgl.opengl.GL33C.nglGetQueryObjecti64v(r0, r1, r2)
            return
    }

    public static void glGetQueryObjecti64v(@org.lwjgl.system.NativeType("GLuint") int r4, @org.lwjgl.system.NativeType("GLenum") int r5, @org.lwjgl.system.NativeType("GLint64 *") java.nio.LongBuffer r6) {
            r0 = r4
            r1 = r5
            r2 = r6
            org.lwjgl.opengl.GL33C.glGetQueryObjecti64v(r0, r1, r2)
            return
    }

    public static void glGetQueryObjecti64v(@org.lwjgl.system.NativeType("GLuint") int r5, @org.lwjgl.system.NativeType("GLenum") int r6, @org.lwjgl.system.NativeType("GLint64 *") long r7) {
            r0 = r5
            r1 = r6
            r2 = r7
            org.lwjgl.opengl.GL33C.glGetQueryObjecti64v(r0, r1, r2)
            return
    }

    @org.lwjgl.system.NativeType("void")
    public static long glGetQueryObjecti64(@org.lwjgl.system.NativeType("GLuint") int r3, @org.lwjgl.system.NativeType("GLenum") int r4) {
            r0 = r3
            r1 = r4
            long r0 = org.lwjgl.opengl.GL33C.glGetQueryObjecti64(r0, r1)
            return r0
    }

    public static void nglGetQueryObjectui64v(int r5, int r6, long r7) {
            r0 = r5
            r1 = r6
            r2 = r7
            org.lwjgl.opengl.GL33C.nglGetQueryObjectui64v(r0, r1, r2)
            return
    }

    public static void glGetQueryObjectui64v(@org.lwjgl.system.NativeType("GLuint") int r4, @org.lwjgl.system.NativeType("GLenum") int r5, @org.lwjgl.system.NativeType("GLuint64 *") java.nio.LongBuffer r6) {
            r0 = r4
            r1 = r5
            r2 = r6
            org.lwjgl.opengl.GL33C.glGetQueryObjectui64v(r0, r1, r2)
            return
    }

    public static void glGetQueryObjectui64v(@org.lwjgl.system.NativeType("GLuint") int r5, @org.lwjgl.system.NativeType("GLenum") int r6, @org.lwjgl.system.NativeType("GLuint64 *") long r7) {
            r0 = r5
            r1 = r6
            r2 = r7
            org.lwjgl.opengl.GL33C.glGetQueryObjectui64v(r0, r1, r2)
            return
    }

    @org.lwjgl.system.NativeType("void")
    public static long glGetQueryObjectui64(@org.lwjgl.system.NativeType("GLuint") int r3, @org.lwjgl.system.NativeType("GLenum") int r4) {
            r0 = r3
            r1 = r4
            long r0 = org.lwjgl.opengl.GL33C.glGetQueryObjectui64(r0, r1)
            return r0
    }

    public static void glVertexAttribDivisor(@org.lwjgl.system.NativeType("GLuint") int r3, @org.lwjgl.system.NativeType("GLuint") int r4) {
            r0 = r3
            r1 = r4
            org.lwjgl.opengl.GL33C.glVertexAttribDivisor(r0, r1)
            return
    }

    public static native void glVertexP2ui(@org.lwjgl.system.NativeType("GLenum") int r0, @org.lwjgl.system.NativeType("GLuint") int r1);

    public static native void glVertexP3ui(@org.lwjgl.system.NativeType("GLenum") int r0, @org.lwjgl.system.NativeType("GLuint") int r1);

    public static native void glVertexP4ui(@org.lwjgl.system.NativeType("GLenum") int r0, @org.lwjgl.system.NativeType("GLuint") int r1);

    public static native void nglVertexP2uiv(int r0, long r1);

    public static void glVertexP2uiv(@org.lwjgl.system.NativeType("GLenum") int r4, @org.lwjgl.system.NativeType("GLuint const *") java.nio.IntBuffer r5) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r5
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
        Lb:
            r0 = r4
            r1 = r5
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            nglVertexP2uiv(r0, r1)
            return
    }

    public static native void nglVertexP3uiv(int r0, long r1);

    public static void glVertexP3uiv(@org.lwjgl.system.NativeType("GLenum") int r4, @org.lwjgl.system.NativeType("GLuint const *") java.nio.IntBuffer r5) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r5
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
        Lb:
            r0 = r4
            r1 = r5
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            nglVertexP3uiv(r0, r1)
            return
    }

    public static native void nglVertexP4uiv(int r0, long r1);

    public static void glVertexP4uiv(@org.lwjgl.system.NativeType("GLenum") int r4, @org.lwjgl.system.NativeType("GLuint const *") java.nio.IntBuffer r5) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r5
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
        Lb:
            r0 = r4
            r1 = r5
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            nglVertexP4uiv(r0, r1)
            return
    }

    public static native void glTexCoordP1ui(@org.lwjgl.system.NativeType("GLenum") int r0, @org.lwjgl.system.NativeType("GLuint") int r1);

    public static native void glTexCoordP2ui(@org.lwjgl.system.NativeType("GLenum") int r0, @org.lwjgl.system.NativeType("GLuint") int r1);

    public static native void glTexCoordP3ui(@org.lwjgl.system.NativeType("GLenum") int r0, @org.lwjgl.system.NativeType("GLuint") int r1);

    public static native void glTexCoordP4ui(@org.lwjgl.system.NativeType("GLenum") int r0, @org.lwjgl.system.NativeType("GLuint") int r1);

    public static native void nglTexCoordP1uiv(int r0, long r1);

    public static void glTexCoordP1uiv(@org.lwjgl.system.NativeType("GLenum") int r4, @org.lwjgl.system.NativeType("GLuint const *") java.nio.IntBuffer r5) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r5
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
        Lb:
            r0 = r4
            r1 = r5
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            nglTexCoordP1uiv(r0, r1)
            return
    }

    public static native void nglTexCoordP2uiv(int r0, long r1);

    public static void glTexCoordP2uiv(@org.lwjgl.system.NativeType("GLenum") int r4, @org.lwjgl.system.NativeType("GLuint const *") java.nio.IntBuffer r5) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r5
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
        Lb:
            r0 = r4
            r1 = r5
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            nglTexCoordP2uiv(r0, r1)
            return
    }

    public static native void nglTexCoordP3uiv(int r0, long r1);

    public static void glTexCoordP3uiv(@org.lwjgl.system.NativeType("GLenum") int r4, @org.lwjgl.system.NativeType("GLuint const *") java.nio.IntBuffer r5) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r5
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
        Lb:
            r0 = r4
            r1 = r5
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            nglTexCoordP3uiv(r0, r1)
            return
    }

    public static native void nglTexCoordP4uiv(int r0, long r1);

    public static void glTexCoordP4uiv(@org.lwjgl.system.NativeType("GLenum") int r4, @org.lwjgl.system.NativeType("GLuint const *") java.nio.IntBuffer r5) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r5
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
        Lb:
            r0 = r4
            r1 = r5
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            nglTexCoordP4uiv(r0, r1)
            return
    }

    public static native void glMultiTexCoordP1ui(@org.lwjgl.system.NativeType("GLenum") int r0, @org.lwjgl.system.NativeType("GLenum") int r1, @org.lwjgl.system.NativeType("GLuint") int r2);

    public static native void glMultiTexCoordP2ui(@org.lwjgl.system.NativeType("GLenum") int r0, @org.lwjgl.system.NativeType("GLenum") int r1, @org.lwjgl.system.NativeType("GLuint") int r2);

    public static native void glMultiTexCoordP3ui(@org.lwjgl.system.NativeType("GLenum") int r0, @org.lwjgl.system.NativeType("GLenum") int r1, @org.lwjgl.system.NativeType("GLuint") int r2);

    public static native void glMultiTexCoordP4ui(@org.lwjgl.system.NativeType("GLenum") int r0, @org.lwjgl.system.NativeType("GLenum") int r1, @org.lwjgl.system.NativeType("GLuint") int r2);

    public static native void nglMultiTexCoordP1uiv(int r0, int r1, long r2);

    public static void glMultiTexCoordP1uiv(@org.lwjgl.system.NativeType("GLenum") int r5, @org.lwjgl.system.NativeType("GLenum") int r6, @org.lwjgl.system.NativeType("GLuint const *") java.nio.IntBuffer r7) {
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
            nglMultiTexCoordP1uiv(r0, r1, r2)
            return
    }

    public static native void nglMultiTexCoordP2uiv(int r0, int r1, long r2);

    public static void glMultiTexCoordP2uiv(@org.lwjgl.system.NativeType("GLenum") int r5, @org.lwjgl.system.NativeType("GLenum") int r6, @org.lwjgl.system.NativeType("GLuint const *") java.nio.IntBuffer r7) {
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
            nglMultiTexCoordP2uiv(r0, r1, r2)
            return
    }

    public static native void nglMultiTexCoordP3uiv(int r0, int r1, long r2);

    public static void glMultiTexCoordP3uiv(@org.lwjgl.system.NativeType("GLenum") int r5, @org.lwjgl.system.NativeType("GLenum") int r6, @org.lwjgl.system.NativeType("GLuint const *") java.nio.IntBuffer r7) {
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
            nglMultiTexCoordP3uiv(r0, r1, r2)
            return
    }

    public static native void nglMultiTexCoordP4uiv(int r0, int r1, long r2);

    public static void glMultiTexCoordP4uiv(@org.lwjgl.system.NativeType("GLenum") int r5, @org.lwjgl.system.NativeType("GLenum") int r6, @org.lwjgl.system.NativeType("GLuint const *") java.nio.IntBuffer r7) {
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
            nglMultiTexCoordP4uiv(r0, r1, r2)
            return
    }

    public static native void glNormalP3ui(@org.lwjgl.system.NativeType("GLenum") int r0, @org.lwjgl.system.NativeType("GLuint") int r1);

    public static native void nglNormalP3uiv(int r0, long r1);

    public static void glNormalP3uiv(@org.lwjgl.system.NativeType("GLenum") int r4, @org.lwjgl.system.NativeType("GLuint const *") java.nio.IntBuffer r5) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r5
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
        Lb:
            r0 = r4
            r1 = r5
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            nglNormalP3uiv(r0, r1)
            return
    }

    public static native void glColorP3ui(@org.lwjgl.system.NativeType("GLenum") int r0, @org.lwjgl.system.NativeType("GLuint") int r1);

    public static native void glColorP4ui(@org.lwjgl.system.NativeType("GLenum") int r0, @org.lwjgl.system.NativeType("GLuint") int r1);

    public static native void nglColorP3uiv(int r0, long r1);

    public static void glColorP3uiv(@org.lwjgl.system.NativeType("GLenum") int r4, @org.lwjgl.system.NativeType("GLuint const *") java.nio.IntBuffer r5) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r5
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
        Lb:
            r0 = r4
            r1 = r5
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            nglColorP3uiv(r0, r1)
            return
    }

    public static native void nglColorP4uiv(int r0, long r1);

    public static void glColorP4uiv(@org.lwjgl.system.NativeType("GLenum") int r4, @org.lwjgl.system.NativeType("GLuint const *") java.nio.IntBuffer r5) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r5
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
        Lb:
            r0 = r4
            r1 = r5
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            nglColorP4uiv(r0, r1)
            return
    }

    public static native void glSecondaryColorP3ui(@org.lwjgl.system.NativeType("GLenum") int r0, @org.lwjgl.system.NativeType("GLuint") int r1);

    public static native void nglSecondaryColorP3uiv(int r0, long r1);

    public static void glSecondaryColorP3uiv(@org.lwjgl.system.NativeType("GLenum") int r4, @org.lwjgl.system.NativeType("GLuint const *") java.nio.IntBuffer r5) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r5
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
        Lb:
            r0 = r4
            r1 = r5
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            nglSecondaryColorP3uiv(r0, r1)
            return
    }

    public static void glVertexAttribP1ui(@org.lwjgl.system.NativeType("GLuint") int r5, @org.lwjgl.system.NativeType("GLenum") int r6, @org.lwjgl.system.NativeType("GLboolean") boolean r7, @org.lwjgl.system.NativeType("GLuint") int r8) {
            r0 = r5
            r1 = r6
            r2 = r7
            r3 = r8
            org.lwjgl.opengl.GL33C.glVertexAttribP1ui(r0, r1, r2, r3)
            return
    }

    public static void glVertexAttribP2ui(@org.lwjgl.system.NativeType("GLuint") int r5, @org.lwjgl.system.NativeType("GLenum") int r6, @org.lwjgl.system.NativeType("GLboolean") boolean r7, @org.lwjgl.system.NativeType("GLuint") int r8) {
            r0 = r5
            r1 = r6
            r2 = r7
            r3 = r8
            org.lwjgl.opengl.GL33C.glVertexAttribP2ui(r0, r1, r2, r3)
            return
    }

    public static void glVertexAttribP3ui(@org.lwjgl.system.NativeType("GLuint") int r5, @org.lwjgl.system.NativeType("GLenum") int r6, @org.lwjgl.system.NativeType("GLboolean") boolean r7, @org.lwjgl.system.NativeType("GLuint") int r8) {
            r0 = r5
            r1 = r6
            r2 = r7
            r3 = r8
            org.lwjgl.opengl.GL33C.glVertexAttribP3ui(r0, r1, r2, r3)
            return
    }

    public static void glVertexAttribP4ui(@org.lwjgl.system.NativeType("GLuint") int r5, @org.lwjgl.system.NativeType("GLenum") int r6, @org.lwjgl.system.NativeType("GLboolean") boolean r7, @org.lwjgl.system.NativeType("GLuint") int r8) {
            r0 = r5
            r1 = r6
            r2 = r7
            r3 = r8
            org.lwjgl.opengl.GL33C.glVertexAttribP4ui(r0, r1, r2, r3)
            return
    }

    public static void nglVertexAttribP1uiv(int r6, int r7, boolean r8, long r9) {
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            org.lwjgl.opengl.GL33C.nglVertexAttribP1uiv(r0, r1, r2, r3)
            return
    }

    public static void glVertexAttribP1uiv(@org.lwjgl.system.NativeType("GLuint") int r5, @org.lwjgl.system.NativeType("GLenum") int r6, @org.lwjgl.system.NativeType("GLboolean") boolean r7, @org.lwjgl.system.NativeType("GLuint const *") java.nio.IntBuffer r8) {
            r0 = r5
            r1 = r6
            r2 = r7
            r3 = r8
            org.lwjgl.opengl.GL33C.glVertexAttribP1uiv(r0, r1, r2, r3)
            return
    }

    public static void nglVertexAttribP2uiv(int r6, int r7, boolean r8, long r9) {
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            org.lwjgl.opengl.GL33C.nglVertexAttribP2uiv(r0, r1, r2, r3)
            return
    }

    public static void glVertexAttribP2uiv(@org.lwjgl.system.NativeType("GLuint") int r5, @org.lwjgl.system.NativeType("GLenum") int r6, @org.lwjgl.system.NativeType("GLboolean") boolean r7, @org.lwjgl.system.NativeType("GLuint const *") java.nio.IntBuffer r8) {
            r0 = r5
            r1 = r6
            r2 = r7
            r3 = r8
            org.lwjgl.opengl.GL33C.glVertexAttribP2uiv(r0, r1, r2, r3)
            return
    }

    public static void nglVertexAttribP3uiv(int r6, int r7, boolean r8, long r9) {
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            org.lwjgl.opengl.GL33C.nglVertexAttribP3uiv(r0, r1, r2, r3)
            return
    }

    public static void glVertexAttribP3uiv(@org.lwjgl.system.NativeType("GLuint") int r5, @org.lwjgl.system.NativeType("GLenum") int r6, @org.lwjgl.system.NativeType("GLboolean") boolean r7, @org.lwjgl.system.NativeType("GLuint const *") java.nio.IntBuffer r8) {
            r0 = r5
            r1 = r6
            r2 = r7
            r3 = r8
            org.lwjgl.opengl.GL33C.glVertexAttribP3uiv(r0, r1, r2, r3)
            return
    }

    public static void nglVertexAttribP4uiv(int r6, int r7, boolean r8, long r9) {
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            org.lwjgl.opengl.GL33C.nglVertexAttribP4uiv(r0, r1, r2, r3)
            return
    }

    public static void glVertexAttribP4uiv(@org.lwjgl.system.NativeType("GLuint") int r5, @org.lwjgl.system.NativeType("GLenum") int r6, @org.lwjgl.system.NativeType("GLboolean") boolean r7, @org.lwjgl.system.NativeType("GLuint const *") java.nio.IntBuffer r8) {
            r0 = r5
            r1 = r6
            r2 = r7
            r3 = r8
            org.lwjgl.opengl.GL33C.glVertexAttribP4uiv(r0, r1, r2, r3)
            return
    }

    public static void glGenSamplers(@org.lwjgl.system.NativeType("GLuint *") int[] r2) {
            r0 = r2
            org.lwjgl.opengl.GL33C.glGenSamplers(r0)
            return
    }

    public static void glDeleteSamplers(@org.lwjgl.system.NativeType("GLuint const *") int[] r2) {
            r0 = r2
            org.lwjgl.opengl.GL33C.glDeleteSamplers(r0)
            return
    }

    public static void glSamplerParameteriv(@org.lwjgl.system.NativeType("GLuint") int r4, @org.lwjgl.system.NativeType("GLenum") int r5, @org.lwjgl.system.NativeType("GLint const *") int[] r6) {
            r0 = r4
            r1 = r5
            r2 = r6
            org.lwjgl.opengl.GL33C.glSamplerParameteriv(r0, r1, r2)
            return
    }

    public static void glSamplerParameterfv(@org.lwjgl.system.NativeType("GLuint") int r4, @org.lwjgl.system.NativeType("GLenum") int r5, @org.lwjgl.system.NativeType("GLfloat const *") float[] r6) {
            r0 = r4
            r1 = r5
            r2 = r6
            org.lwjgl.opengl.GL33C.glSamplerParameterfv(r0, r1, r2)
            return
    }

    public static void glSamplerParameterIiv(@org.lwjgl.system.NativeType("GLuint") int r4, @org.lwjgl.system.NativeType("GLenum") int r5, @org.lwjgl.system.NativeType("GLint const *") int[] r6) {
            r0 = r4
            r1 = r5
            r2 = r6
            org.lwjgl.opengl.GL33C.glSamplerParameterIiv(r0, r1, r2)
            return
    }

    public static void glSamplerParameterIuiv(@org.lwjgl.system.NativeType("GLuint") int r4, @org.lwjgl.system.NativeType("GLenum") int r5, @org.lwjgl.system.NativeType("GLuint const *") int[] r6) {
            r0 = r4
            r1 = r5
            r2 = r6
            org.lwjgl.opengl.GL33C.glSamplerParameterIuiv(r0, r1, r2)
            return
    }

    public static void glGetSamplerParameteriv(@org.lwjgl.system.NativeType("GLuint") int r4, @org.lwjgl.system.NativeType("GLenum") int r5, @org.lwjgl.system.NativeType("GLint *") int[] r6) {
            r0 = r4
            r1 = r5
            r2 = r6
            org.lwjgl.opengl.GL33C.glGetSamplerParameteriv(r0, r1, r2)
            return
    }

    public static void glGetSamplerParameterfv(@org.lwjgl.system.NativeType("GLuint") int r4, @org.lwjgl.system.NativeType("GLenum") int r5, @org.lwjgl.system.NativeType("GLfloat *") float[] r6) {
            r0 = r4
            r1 = r5
            r2 = r6
            org.lwjgl.opengl.GL33C.glGetSamplerParameterfv(r0, r1, r2)
            return
    }

    public static void glGetSamplerParameterIiv(@org.lwjgl.system.NativeType("GLuint") int r4, @org.lwjgl.system.NativeType("GLenum") int r5, @org.lwjgl.system.NativeType("GLint *") int[] r6) {
            r0 = r4
            r1 = r5
            r2 = r6
            org.lwjgl.opengl.GL33C.glGetSamplerParameterIiv(r0, r1, r2)
            return
    }

    public static void glGetSamplerParameterIuiv(@org.lwjgl.system.NativeType("GLuint") int r4, @org.lwjgl.system.NativeType("GLenum") int r5, @org.lwjgl.system.NativeType("GLuint *") int[] r6) {
            r0 = r4
            r1 = r5
            r2 = r6
            org.lwjgl.opengl.GL33C.glGetSamplerParameterIuiv(r0, r1, r2)
            return
    }

    public static void glGetQueryObjecti64v(@org.lwjgl.system.NativeType("GLuint") int r4, @org.lwjgl.system.NativeType("GLenum") int r5, @org.lwjgl.system.NativeType("GLint64 *") long[] r6) {
            r0 = r4
            r1 = r5
            r2 = r6
            org.lwjgl.opengl.GL33C.glGetQueryObjecti64v(r0, r1, r2)
            return
    }

    public static void glGetQueryObjectui64v(@org.lwjgl.system.NativeType("GLuint") int r4, @org.lwjgl.system.NativeType("GLenum") int r5, @org.lwjgl.system.NativeType("GLuint64 *") long[] r6) {
            r0 = r4
            r1 = r5
            r2 = r6
            org.lwjgl.opengl.GL33C.glGetQueryObjectui64v(r0, r1, r2)
            return
    }

    public static void glVertexP2uiv(@org.lwjgl.system.NativeType("GLenum") int r5, @org.lwjgl.system.NativeType("GLuint const *") int[] r6) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glVertexP2uiv
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

    public static void glVertexP3uiv(@org.lwjgl.system.NativeType("GLenum") int r5, @org.lwjgl.system.NativeType("GLuint const *") int[] r6) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glVertexP3uiv
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

    public static void glVertexP4uiv(@org.lwjgl.system.NativeType("GLenum") int r5, @org.lwjgl.system.NativeType("GLuint const *") int[] r6) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glVertexP4uiv
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

    public static void glTexCoordP1uiv(@org.lwjgl.system.NativeType("GLenum") int r5, @org.lwjgl.system.NativeType("GLuint const *") int[] r6) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glTexCoordP1uiv
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

    public static void glTexCoordP2uiv(@org.lwjgl.system.NativeType("GLenum") int r5, @org.lwjgl.system.NativeType("GLuint const *") int[] r6) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glTexCoordP2uiv
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

    public static void glTexCoordP3uiv(@org.lwjgl.system.NativeType("GLenum") int r5, @org.lwjgl.system.NativeType("GLuint const *") int[] r6) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glTexCoordP3uiv
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

    public static void glTexCoordP4uiv(@org.lwjgl.system.NativeType("GLenum") int r5, @org.lwjgl.system.NativeType("GLuint const *") int[] r6) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glTexCoordP4uiv
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

    public static void glMultiTexCoordP1uiv(@org.lwjgl.system.NativeType("GLenum") int r6, @org.lwjgl.system.NativeType("GLenum") int r7, @org.lwjgl.system.NativeType("GLuint const *") int[] r8) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glMultiTexCoordP1uiv
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

    public static void glMultiTexCoordP2uiv(@org.lwjgl.system.NativeType("GLenum") int r6, @org.lwjgl.system.NativeType("GLenum") int r7, @org.lwjgl.system.NativeType("GLuint const *") int[] r8) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glMultiTexCoordP2uiv
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

    public static void glMultiTexCoordP3uiv(@org.lwjgl.system.NativeType("GLenum") int r6, @org.lwjgl.system.NativeType("GLenum") int r7, @org.lwjgl.system.NativeType("GLuint const *") int[] r8) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glMultiTexCoordP3uiv
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

    public static void glMultiTexCoordP4uiv(@org.lwjgl.system.NativeType("GLenum") int r6, @org.lwjgl.system.NativeType("GLenum") int r7, @org.lwjgl.system.NativeType("GLuint const *") int[] r8) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glMultiTexCoordP4uiv
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

    public static void glNormalP3uiv(@org.lwjgl.system.NativeType("GLenum") int r5, @org.lwjgl.system.NativeType("GLuint const *") int[] r6) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glNormalP3uiv
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

    public static void glColorP3uiv(@org.lwjgl.system.NativeType("GLenum") int r5, @org.lwjgl.system.NativeType("GLuint const *") int[] r6) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glColorP3uiv
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

    public static void glColorP4uiv(@org.lwjgl.system.NativeType("GLenum") int r5, @org.lwjgl.system.NativeType("GLuint const *") int[] r6) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glColorP4uiv
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

    public static void glSecondaryColorP3uiv(@org.lwjgl.system.NativeType("GLenum") int r5, @org.lwjgl.system.NativeType("GLuint const *") int[] r6) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glSecondaryColorP3uiv
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

    public static void glVertexAttribP1uiv(@org.lwjgl.system.NativeType("GLuint") int r5, @org.lwjgl.system.NativeType("GLenum") int r6, @org.lwjgl.system.NativeType("GLboolean") boolean r7, @org.lwjgl.system.NativeType("GLuint const *") int[] r8) {
            r0 = r5
            r1 = r6
            r2 = r7
            r3 = r8
            org.lwjgl.opengl.GL33C.glVertexAttribP1uiv(r0, r1, r2, r3)
            return
    }

    public static void glVertexAttribP2uiv(@org.lwjgl.system.NativeType("GLuint") int r5, @org.lwjgl.system.NativeType("GLenum") int r6, @org.lwjgl.system.NativeType("GLboolean") boolean r7, @org.lwjgl.system.NativeType("GLuint const *") int[] r8) {
            r0 = r5
            r1 = r6
            r2 = r7
            r3 = r8
            org.lwjgl.opengl.GL33C.glVertexAttribP2uiv(r0, r1, r2, r3)
            return
    }

    public static void glVertexAttribP3uiv(@org.lwjgl.system.NativeType("GLuint") int r5, @org.lwjgl.system.NativeType("GLenum") int r6, @org.lwjgl.system.NativeType("GLboolean") boolean r7, @org.lwjgl.system.NativeType("GLuint const *") int[] r8) {
            r0 = r5
            r1 = r6
            r2 = r7
            r3 = r8
            org.lwjgl.opengl.GL33C.glVertexAttribP3uiv(r0, r1, r2, r3)
            return
    }

    public static void glVertexAttribP4uiv(@org.lwjgl.system.NativeType("GLuint") int r5, @org.lwjgl.system.NativeType("GLenum") int r6, @org.lwjgl.system.NativeType("GLboolean") boolean r7, @org.lwjgl.system.NativeType("GLuint const *") int[] r8) {
            r0 = r5
            r1 = r6
            r2 = r7
            r3 = r8
            org.lwjgl.opengl.GL33C.glVertexAttribP4uiv(r0, r1, r2, r3)
            return
    }

    static {
            org.lwjgl.opengl.GL.initialize()
            return
    }
}
