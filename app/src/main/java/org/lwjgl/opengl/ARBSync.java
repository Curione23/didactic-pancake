package org.lwjgl.opengl;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/opengl/ARBSync.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/opengl/ARBSync.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/opengl/ARBSync.class */
public class ARBSync {
    public static final int GL_MAX_SERVER_WAIT_TIMEOUT = 37137;
    public static final int GL_OBJECT_TYPE = 37138;
    public static final int GL_SYNC_CONDITION = 37139;
    public static final int GL_SYNC_STATUS = 37140;
    public static final int GL_SYNC_FLAGS = 37141;
    public static final int GL_SYNC_FENCE = 37142;
    public static final int GL_SYNC_GPU_COMMANDS_COMPLETE = 37143;
    public static final int GL_UNSIGNALED = 37144;
    public static final int GL_SIGNALED = 37145;
    public static final int GL_SYNC_FLUSH_COMMANDS_BIT = 1;
    public static final long GL_TIMEOUT_IGNORED = -1;
    public static final int GL_ALREADY_SIGNALED = 37146;
    public static final int GL_TIMEOUT_EXPIRED = 37147;
    public static final int GL_CONDITION_SATISFIED = 37148;
    public static final int GL_WAIT_FAILED = 37149;

    protected ARBSync() {
            r3 = this;
            r0 = r3
            r0.<init>()
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r1 = r0
            r1.<init>()
            throw r0
    }

    @org.lwjgl.system.NativeType("GLsync")
    public static long glFenceSync(@org.lwjgl.system.NativeType("GLenum") int r3, @org.lwjgl.system.NativeType("GLbitfield") int r4) {
            r0 = r3
            r1 = r4
            long r0 = org.lwjgl.opengl.GL32C.glFenceSync(r0, r1)
            return r0
    }

    public static boolean nglIsSync(long r3) {
            r0 = r3
            boolean r0 = org.lwjgl.opengl.GL32C.nglIsSync(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("GLboolean")
    public static boolean glIsSync(@org.lwjgl.system.NativeType("GLsync") long r3) {
            r0 = r3
            boolean r0 = org.lwjgl.opengl.GL32C.glIsSync(r0)
            return r0
    }

    public static void nglDeleteSync(long r3) {
            r0 = r3
            org.lwjgl.opengl.GL32C.nglDeleteSync(r0)
            return
    }

    public static void glDeleteSync(@org.lwjgl.system.NativeType("GLsync") long r3) {
            r0 = r3
            org.lwjgl.opengl.GL32C.glDeleteSync(r0)
            return
    }

    public static int nglClientWaitSync(long r6, int r8, long r9) {
            r0 = r6
            r1 = r8
            r2 = r9
            int r0 = org.lwjgl.opengl.GL32C.nglClientWaitSync(r0, r1, r2)
            return r0
    }

    @org.lwjgl.system.NativeType("GLenum")
    public static int glClientWaitSync(@org.lwjgl.system.NativeType("GLsync") long r6, @org.lwjgl.system.NativeType("GLbitfield") int r8, @org.lwjgl.system.NativeType("GLuint64") long r9) {
            r0 = r6
            r1 = r8
            r2 = r9
            int r0 = org.lwjgl.opengl.GL32C.glClientWaitSync(r0, r1, r2)
            return r0
    }

    public static void nglWaitSync(long r6, int r8, long r9) {
            r0 = r6
            r1 = r8
            r2 = r9
            org.lwjgl.opengl.GL32C.nglWaitSync(r0, r1, r2)
            return
    }

    public static void glWaitSync(@org.lwjgl.system.NativeType("GLsync") long r6, @org.lwjgl.system.NativeType("GLbitfield") int r8, @org.lwjgl.system.NativeType("GLuint64") long r9) {
            r0 = r6
            r1 = r8
            r2 = r9
            org.lwjgl.opengl.GL32C.glWaitSync(r0, r1, r2)
            return
    }

    public static void nglGetInteger64v(int r4, long r5) {
            r0 = r4
            r1 = r5
            org.lwjgl.opengl.GL32C.nglGetInteger64v(r0, r1)
            return
    }

    public static void glGetInteger64v(@org.lwjgl.system.NativeType("GLenum") int r3, @org.lwjgl.system.NativeType("GLint64 *") java.nio.LongBuffer r4) {
            r0 = r3
            r1 = r4
            org.lwjgl.opengl.GL32C.glGetInteger64v(r0, r1)
            return
    }

    @org.lwjgl.system.NativeType("void")
    public static long glGetInteger64(@org.lwjgl.system.NativeType("GLenum") int r3) {
            r0 = r3
            long r0 = org.lwjgl.opengl.GL32C.glGetInteger64(r0)
            return r0
    }

    public static void nglGetSynciv(long r9, int r11, int r12, long r13, long r15) {
            r0 = r9
            r1 = r11
            r2 = r12
            r3 = r13
            r4 = r15
            org.lwjgl.opengl.GL32C.nglGetSynciv(r0, r1, r2, r3, r4)
            return
    }

    public static void glGetSynciv(@org.lwjgl.system.NativeType("GLsync") long r6, @org.lwjgl.system.NativeType("GLenum") int r8, @javax.annotation.Nullable @org.lwjgl.system.NativeType("GLsizei *") java.nio.IntBuffer r9, @org.lwjgl.system.NativeType("GLint *") java.nio.IntBuffer r10) {
            r0 = r6
            r1 = r8
            r2 = r9
            r3 = r10
            org.lwjgl.opengl.GL32C.glGetSynciv(r0, r1, r2, r3)
            return
    }

    @org.lwjgl.system.NativeType("void")
    public static int glGetSynci(@org.lwjgl.system.NativeType("GLsync") long r5, @org.lwjgl.system.NativeType("GLenum") int r7, @javax.annotation.Nullable @org.lwjgl.system.NativeType("GLsizei *") java.nio.IntBuffer r8) {
            r0 = r5
            r1 = r7
            r2 = r8
            int r0 = org.lwjgl.opengl.GL32C.glGetSynci(r0, r1, r2)
            return r0
    }

    public static void glGetInteger64v(@org.lwjgl.system.NativeType("GLenum") int r3, @org.lwjgl.system.NativeType("GLint64 *") long[] r4) {
            r0 = r3
            r1 = r4
            org.lwjgl.opengl.GL32C.glGetInteger64v(r0, r1)
            return
    }

    public static void glGetSynciv(@org.lwjgl.system.NativeType("GLsync") long r6, @org.lwjgl.system.NativeType("GLenum") int r8, @javax.annotation.Nullable @org.lwjgl.system.NativeType("GLsizei *") int[] r9, @org.lwjgl.system.NativeType("GLint *") int[] r10) {
            r0 = r6
            r1 = r8
            r2 = r9
            r3 = r10
            org.lwjgl.opengl.GL32C.glGetSynciv(r0, r1, r2, r3)
            return
    }

    static {
            org.lwjgl.opengl.GL.initialize()
            return
    }
}
