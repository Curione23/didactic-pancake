package org.lwjgl.opengl;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/opengl/ARBTimerQuery.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/opengl/ARBTimerQuery.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/opengl/ARBTimerQuery.class */
public class ARBTimerQuery {
    public static final int GL_TIME_ELAPSED = 35007;
    public static final int GL_TIMESTAMP = 36392;

    protected ARBTimerQuery() {
            r3 = this;
            r0 = r3
            r0.<init>()
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r1 = r0
            r1.<init>()
            throw r0
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

    static {
            org.lwjgl.opengl.GL.initialize()
            return
    }
}
