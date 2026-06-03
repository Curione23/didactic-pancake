package org.lwjgl.opengl;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/opengl/ARBSamplerObjects.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/opengl/ARBSamplerObjects.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/opengl/ARBSamplerObjects.class */
public class ARBSamplerObjects {
    public static final int GL_SAMPLER_BINDING = 35097;

    protected ARBSamplerObjects() {
            r3 = this;
            r0 = r3
            r0.<init>()
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r1 = r0
            r1.<init>()
            throw r0
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

    static {
            org.lwjgl.opengl.GL.initialize()
            return
    }
}
