package org.lwjgl.opengl;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/opengl/ARBVertexArrayObject.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/opengl/ARBVertexArrayObject.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/opengl/ARBVertexArrayObject.class */
public class ARBVertexArrayObject {
    public static final int GL_VERTEX_ARRAY_BINDING = 34229;

    protected ARBVertexArrayObject() {
            r3 = this;
            r0 = r3
            r0.<init>()
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r1 = r0
            r1.<init>()
            throw r0
    }

    public static void glBindVertexArray(@org.lwjgl.system.NativeType("GLuint") int r2) {
            r0 = r2
            org.lwjgl.opengl.GL30C.glBindVertexArray(r0)
            return
    }

    public static void nglDeleteVertexArrays(int r4, long r5) {
            r0 = r4
            r1 = r5
            org.lwjgl.opengl.GL30C.nglDeleteVertexArrays(r0, r1)
            return
    }

    public static void glDeleteVertexArrays(@org.lwjgl.system.NativeType("GLuint const *") java.nio.IntBuffer r2) {
            r0 = r2
            org.lwjgl.opengl.GL30C.glDeleteVertexArrays(r0)
            return
    }

    public static void glDeleteVertexArrays(@org.lwjgl.system.NativeType("GLuint const *") int r2) {
            r0 = r2
            org.lwjgl.opengl.GL30C.glDeleteVertexArrays(r0)
            return
    }

    public static void nglGenVertexArrays(int r4, long r5) {
            r0 = r4
            r1 = r5
            org.lwjgl.opengl.GL30C.nglGenVertexArrays(r0, r1)
            return
    }

    public static void glGenVertexArrays(@org.lwjgl.system.NativeType("GLuint *") java.nio.IntBuffer r2) {
            r0 = r2
            org.lwjgl.opengl.GL30C.glGenVertexArrays(r0)
            return
    }

    @org.lwjgl.system.NativeType("void")
    public static int glGenVertexArrays() {
            int r0 = org.lwjgl.opengl.GL30C.glGenVertexArrays()
            return r0
    }

    @org.lwjgl.system.NativeType("GLboolean")
    public static boolean glIsVertexArray(@org.lwjgl.system.NativeType("GLuint") int r2) {
            r0 = r2
            boolean r0 = org.lwjgl.opengl.GL30C.glIsVertexArray(r0)
            return r0
    }

    public static void glDeleteVertexArrays(@org.lwjgl.system.NativeType("GLuint const *") int[] r2) {
            r0 = r2
            org.lwjgl.opengl.GL30C.glDeleteVertexArrays(r0)
            return
    }

    public static void glGenVertexArrays(@org.lwjgl.system.NativeType("GLuint *") int[] r2) {
            r0 = r2
            org.lwjgl.opengl.GL30C.glGenVertexArrays(r0)
            return
    }

    static {
            org.lwjgl.opengl.GL.initialize()
            return
    }
}
