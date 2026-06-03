package org.lwjgl.opengl;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/opengl/ARBDrawIndirect.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/opengl/ARBDrawIndirect.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/opengl/ARBDrawIndirect.class */
public class ARBDrawIndirect {
    public static final int GL_DRAW_INDIRECT_BUFFER = 36671;
    public static final int GL_DRAW_INDIRECT_BUFFER_BINDING = 36675;

    protected ARBDrawIndirect() {
            r3 = this;
            r0 = r3
            r0.<init>()
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r1 = r0
            r1.<init>()
            throw r0
    }

    public static void nglDrawArraysIndirect(int r4, long r5) {
            r0 = r4
            r1 = r5
            org.lwjgl.opengl.GL40C.nglDrawArraysIndirect(r0, r1)
            return
    }

    public static void glDrawArraysIndirect(@org.lwjgl.system.NativeType("GLenum") int r3, @org.lwjgl.system.NativeType("void const *") java.nio.ByteBuffer r4) {
            r0 = r3
            r1 = r4
            org.lwjgl.opengl.GL40C.glDrawArraysIndirect(r0, r1)
            return
    }

    public static void glDrawArraysIndirect(@org.lwjgl.system.NativeType("GLenum") int r4, @org.lwjgl.system.NativeType("void const *") long r5) {
            r0 = r4
            r1 = r5
            org.lwjgl.opengl.GL40C.glDrawArraysIndirect(r0, r1)
            return
    }

    public static void glDrawArraysIndirect(@org.lwjgl.system.NativeType("GLenum") int r3, @org.lwjgl.system.NativeType("void const *") java.nio.IntBuffer r4) {
            r0 = r3
            r1 = r4
            org.lwjgl.opengl.GL40C.glDrawArraysIndirect(r0, r1)
            return
    }

    public static void nglDrawElementsIndirect(int r5, int r6, long r7) {
            r0 = r5
            r1 = r6
            r2 = r7
            org.lwjgl.opengl.GL40C.nglDrawElementsIndirect(r0, r1, r2)
            return
    }

    public static void glDrawElementsIndirect(@org.lwjgl.system.NativeType("GLenum") int r4, @org.lwjgl.system.NativeType("GLenum") int r5, @org.lwjgl.system.NativeType("void const *") java.nio.ByteBuffer r6) {
            r0 = r4
            r1 = r5
            r2 = r6
            org.lwjgl.opengl.GL40C.glDrawElementsIndirect(r0, r1, r2)
            return
    }

    public static void glDrawElementsIndirect(@org.lwjgl.system.NativeType("GLenum") int r5, @org.lwjgl.system.NativeType("GLenum") int r6, @org.lwjgl.system.NativeType("void const *") long r7) {
            r0 = r5
            r1 = r6
            r2 = r7
            org.lwjgl.opengl.GL40C.glDrawElementsIndirect(r0, r1, r2)
            return
    }

    public static void glDrawElementsIndirect(@org.lwjgl.system.NativeType("GLenum") int r4, @org.lwjgl.system.NativeType("GLenum") int r5, @org.lwjgl.system.NativeType("void const *") java.nio.IntBuffer r6) {
            r0 = r4
            r1 = r5
            r2 = r6
            org.lwjgl.opengl.GL40C.glDrawElementsIndirect(r0, r1, r2)
            return
    }

    public static void glDrawArraysIndirect(@org.lwjgl.system.NativeType("GLenum") int r3, @org.lwjgl.system.NativeType("void const *") int[] r4) {
            r0 = r3
            r1 = r4
            org.lwjgl.opengl.GL40C.glDrawArraysIndirect(r0, r1)
            return
    }

    public static void glDrawElementsIndirect(@org.lwjgl.system.NativeType("GLenum") int r4, @org.lwjgl.system.NativeType("GLenum") int r5, @org.lwjgl.system.NativeType("void const *") int[] r6) {
            r0 = r4
            r1 = r5
            r2 = r6
            org.lwjgl.opengl.GL40C.glDrawElementsIndirect(r0, r1, r2)
            return
    }

    static {
            org.lwjgl.opengl.GL.initialize()
            return
    }
}
