package org.lwjgl.opengl;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/opengl/ARBBlendFuncExtended.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/opengl/ARBBlendFuncExtended.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/opengl/ARBBlendFuncExtended.class */
public class ARBBlendFuncExtended {
    public static final int GL_SRC1_COLOR = 35065;
    public static final int GL_ONE_MINUS_SRC1_COLOR = 35066;
    public static final int GL_ONE_MINUS_SRC1_ALPHA = 35067;
    public static final int GL_MAX_DUAL_SOURCE_DRAW_BUFFERS = 35068;

    protected ARBBlendFuncExtended() {
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

    static {
            org.lwjgl.opengl.GL.initialize()
            return
    }
}
