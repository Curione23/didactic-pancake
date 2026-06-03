package org.lwjgl.opengl;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/opengl/ARBViewportArray.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/opengl/ARBViewportArray.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/opengl/ARBViewportArray.class */
public class ARBViewportArray {
    public static final int GL_MAX_VIEWPORTS = 33371;
    public static final int GL_VIEWPORT_SUBPIXEL_BITS = 33372;
    public static final int GL_VIEWPORT_BOUNDS_RANGE = 33373;
    public static final int GL_LAYER_PROVOKING_VERTEX = 33374;
    public static final int GL_VIEWPORT_INDEX_PROVOKING_VERTEX = 33375;
    public static final int GL_UNDEFINED_VERTEX = 33376;

    protected ARBViewportArray() {
            r3 = this;
            r0 = r3
            r0.<init>()
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r1 = r0
            r1.<init>()
            throw r0
    }

    public static void nglViewportArrayv(int r5, int r6, long r7) {
            r0 = r5
            r1 = r6
            r2 = r7
            org.lwjgl.opengl.GL41C.nglViewportArrayv(r0, r1, r2)
            return
    }

    public static void glViewportArrayv(@org.lwjgl.system.NativeType("GLuint") int r3, @org.lwjgl.system.NativeType("GLfloat const *") java.nio.FloatBuffer r4) {
            r0 = r3
            r1 = r4
            org.lwjgl.opengl.GL41C.glViewportArrayv(r0, r1)
            return
    }

    public static void glViewportIndexedf(@org.lwjgl.system.NativeType("GLuint") int r6, @org.lwjgl.system.NativeType("GLfloat") float r7, @org.lwjgl.system.NativeType("GLfloat") float r8, @org.lwjgl.system.NativeType("GLfloat") float r9, @org.lwjgl.system.NativeType("GLfloat") float r10) {
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            org.lwjgl.opengl.GL41C.glViewportIndexedf(r0, r1, r2, r3, r4)
            return
    }

    public static void nglViewportIndexedfv(int r4, long r5) {
            r0 = r4
            r1 = r5
            org.lwjgl.opengl.GL41C.nglViewportIndexedfv(r0, r1)
            return
    }

    public static void glViewportIndexedfv(@org.lwjgl.system.NativeType("GLuint") int r3, @org.lwjgl.system.NativeType("GLfloat const *") java.nio.FloatBuffer r4) {
            r0 = r3
            r1 = r4
            org.lwjgl.opengl.GL41C.glViewportIndexedfv(r0, r1)
            return
    }

    public static void nglScissorArrayv(int r5, int r6, long r7) {
            r0 = r5
            r1 = r6
            r2 = r7
            org.lwjgl.opengl.GL41C.nglScissorArrayv(r0, r1, r2)
            return
    }

    public static void glScissorArrayv(@org.lwjgl.system.NativeType("GLuint") int r3, @org.lwjgl.system.NativeType("GLint const *") java.nio.IntBuffer r4) {
            r0 = r3
            r1 = r4
            org.lwjgl.opengl.GL41C.glScissorArrayv(r0, r1)
            return
    }

    public static void glScissorIndexed(@org.lwjgl.system.NativeType("GLuint") int r6, @org.lwjgl.system.NativeType("GLint") int r7, @org.lwjgl.system.NativeType("GLint") int r8, @org.lwjgl.system.NativeType("GLsizei") int r9, @org.lwjgl.system.NativeType("GLsizei") int r10) {
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            org.lwjgl.opengl.GL41C.glScissorIndexed(r0, r1, r2, r3, r4)
            return
    }

    public static void nglScissorIndexedv(int r4, long r5) {
            r0 = r4
            r1 = r5
            org.lwjgl.opengl.GL41C.nglScissorIndexedv(r0, r1)
            return
    }

    public static void glScissorIndexedv(@org.lwjgl.system.NativeType("GLuint") int r3, @org.lwjgl.system.NativeType("GLint const *") java.nio.IntBuffer r4) {
            r0 = r3
            r1 = r4
            org.lwjgl.opengl.GL41C.glScissorIndexedv(r0, r1)
            return
    }

    public static void nglDepthRangeArrayv(int r5, int r6, long r7) {
            r0 = r5
            r1 = r6
            r2 = r7
            org.lwjgl.opengl.GL41C.nglDepthRangeArrayv(r0, r1, r2)
            return
    }

    public static void glDepthRangeArrayv(@org.lwjgl.system.NativeType("GLuint") int r3, @org.lwjgl.system.NativeType("GLdouble const *") java.nio.DoubleBuffer r4) {
            r0 = r3
            r1 = r4
            org.lwjgl.opengl.GL41C.glDepthRangeArrayv(r0, r1)
            return
    }

    public static void glDepthRangeIndexed(@org.lwjgl.system.NativeType("GLuint") int r6, @org.lwjgl.system.NativeType("GLdouble") double r7, @org.lwjgl.system.NativeType("GLdouble") double r9) {
            r0 = r6
            r1 = r7
            r2 = r9
            org.lwjgl.opengl.GL41C.glDepthRangeIndexed(r0, r1, r2)
            return
    }

    public static void nglGetFloati_v(int r5, int r6, long r7) {
            r0 = r5
            r1 = r6
            r2 = r7
            org.lwjgl.opengl.GL41C.nglGetFloati_v(r0, r1, r2)
            return
    }

    public static void glGetFloati_v(@org.lwjgl.system.NativeType("GLenum") int r4, @org.lwjgl.system.NativeType("GLuint") int r5, @org.lwjgl.system.NativeType("GLfloat *") java.nio.FloatBuffer r6) {
            r0 = r4
            r1 = r5
            r2 = r6
            org.lwjgl.opengl.GL41C.glGetFloati_v(r0, r1, r2)
            return
    }

    @org.lwjgl.system.NativeType("void")
    public static float glGetFloati(@org.lwjgl.system.NativeType("GLenum") int r3, @org.lwjgl.system.NativeType("GLuint") int r4) {
            r0 = r3
            r1 = r4
            float r0 = org.lwjgl.opengl.GL41C.glGetFloati(r0, r1)
            return r0
    }

    public static void nglGetDoublei_v(int r5, int r6, long r7) {
            r0 = r5
            r1 = r6
            r2 = r7
            org.lwjgl.opengl.GL41C.nglGetDoublei_v(r0, r1, r2)
            return
    }

    public static void glGetDoublei_v(@org.lwjgl.system.NativeType("GLenum") int r4, @org.lwjgl.system.NativeType("GLuint") int r5, @org.lwjgl.system.NativeType("GLdouble *") java.nio.DoubleBuffer r6) {
            r0 = r4
            r1 = r5
            r2 = r6
            org.lwjgl.opengl.GL41C.glGetDoublei_v(r0, r1, r2)
            return
    }

    @org.lwjgl.system.NativeType("void")
    public static double glGetDoublei(@org.lwjgl.system.NativeType("GLenum") int r3, @org.lwjgl.system.NativeType("GLuint") int r4) {
            r0 = r3
            r1 = r4
            double r0 = org.lwjgl.opengl.GL41C.glGetDoublei(r0, r1)
            return r0
    }

    public static void glViewportArrayv(@org.lwjgl.system.NativeType("GLuint") int r3, @org.lwjgl.system.NativeType("GLfloat const *") float[] r4) {
            r0 = r3
            r1 = r4
            org.lwjgl.opengl.GL41C.glViewportArrayv(r0, r1)
            return
    }

    public static void glViewportIndexedfv(@org.lwjgl.system.NativeType("GLuint") int r3, @org.lwjgl.system.NativeType("GLfloat const *") float[] r4) {
            r0 = r3
            r1 = r4
            org.lwjgl.opengl.GL41C.glViewportIndexedfv(r0, r1)
            return
    }

    public static void glScissorArrayv(@org.lwjgl.system.NativeType("GLuint") int r3, @org.lwjgl.system.NativeType("GLint const *") int[] r4) {
            r0 = r3
            r1 = r4
            org.lwjgl.opengl.GL41C.glScissorArrayv(r0, r1)
            return
    }

    public static void glScissorIndexedv(@org.lwjgl.system.NativeType("GLuint") int r3, @org.lwjgl.system.NativeType("GLint const *") int[] r4) {
            r0 = r3
            r1 = r4
            org.lwjgl.opengl.GL41C.glScissorIndexedv(r0, r1)
            return
    }

    public static void glDepthRangeArrayv(@org.lwjgl.system.NativeType("GLuint") int r3, @org.lwjgl.system.NativeType("GLdouble const *") double[] r4) {
            r0 = r3
            r1 = r4
            org.lwjgl.opengl.GL41C.glDepthRangeArrayv(r0, r1)
            return
    }

    public static void glGetFloati_v(@org.lwjgl.system.NativeType("GLenum") int r4, @org.lwjgl.system.NativeType("GLuint") int r5, @org.lwjgl.system.NativeType("GLfloat *") float[] r6) {
            r0 = r4
            r1 = r5
            r2 = r6
            org.lwjgl.opengl.GL41C.glGetFloati_v(r0, r1, r2)
            return
    }

    public static void glGetDoublei_v(@org.lwjgl.system.NativeType("GLenum") int r4, @org.lwjgl.system.NativeType("GLuint") int r5, @org.lwjgl.system.NativeType("GLdouble *") double[] r6) {
            r0 = r4
            r1 = r5
            r2 = r6
            org.lwjgl.opengl.GL41C.glGetDoublei_v(r0, r1, r2)
            return
    }

    static {
            org.lwjgl.opengl.GL.initialize()
            return
    }
}
