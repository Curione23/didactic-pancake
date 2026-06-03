package org.lwjgl.opengl;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/opengl/ARBDrawInstanced.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/opengl/ARBDrawInstanced.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/opengl/ARBDrawInstanced.class */
public class ARBDrawInstanced {
    protected ARBDrawInstanced() {
            r3 = this;
            r0 = r3
            r0.<init>()
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r1 = r0
            r1.<init>()
            throw r0
    }

    public static native void glDrawArraysInstancedARB(@org.lwjgl.system.NativeType("GLenum") int r0, @org.lwjgl.system.NativeType("GLint") int r1, @org.lwjgl.system.NativeType("GLsizei") int r2, @org.lwjgl.system.NativeType("GLsizei") int r3);

    public static native void nglDrawElementsInstancedARB(int r0, int r1, int r2, long r3, int r5);

    public static void glDrawElementsInstancedARB(@org.lwjgl.system.NativeType("GLenum") int r7, @org.lwjgl.system.NativeType("GLsizei") int r8, @org.lwjgl.system.NativeType("GLenum") int r9, @org.lwjgl.system.NativeType("void const *") long r10, @org.lwjgl.system.NativeType("GLsizei") int r12) {
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r12
            nglDrawElementsInstancedARB(r0, r1, r2, r3, r4)
            return
    }

    public static void glDrawElementsInstancedARB(@org.lwjgl.system.NativeType("GLenum") int r7, @org.lwjgl.system.NativeType("GLenum") int r8, @org.lwjgl.system.NativeType("void const *") java.nio.ByteBuffer r9, @org.lwjgl.system.NativeType("GLsizei") int r10) {
            r0 = r7
            r1 = r9
            int r1 = r1.remaining()
            r2 = r8
            int r2 = org.lwjgl.opengl.GLChecks.typeToByteShift(r2)
            int r1 = r1 >> r2
            r2 = r8
            r3 = r9
            long r3 = org.lwjgl.system.MemoryUtil.memAddress(r3)
            r4 = r10
            nglDrawElementsInstancedARB(r0, r1, r2, r3, r4)
            return
    }

    public static void glDrawElementsInstancedARB(@org.lwjgl.system.NativeType("GLenum") int r7, @org.lwjgl.system.NativeType("void const *") java.nio.ByteBuffer r8, @org.lwjgl.system.NativeType("GLsizei") int r9) {
            r0 = r7
            r1 = r8
            int r1 = r1.remaining()
            r2 = 5121(0x1401, float:7.176E-42)
            r3 = r8
            long r3 = org.lwjgl.system.MemoryUtil.memAddress(r3)
            r4 = r9
            nglDrawElementsInstancedARB(r0, r1, r2, r3, r4)
            return
    }

    public static void glDrawElementsInstancedARB(@org.lwjgl.system.NativeType("GLenum") int r7, @org.lwjgl.system.NativeType("void const *") java.nio.ShortBuffer r8, @org.lwjgl.system.NativeType("GLsizei") int r9) {
            r0 = r7
            r1 = r8
            int r1 = r1.remaining()
            r2 = 5123(0x1403, float:7.179E-42)
            r3 = r8
            long r3 = org.lwjgl.system.MemoryUtil.memAddress(r3)
            r4 = r9
            nglDrawElementsInstancedARB(r0, r1, r2, r3, r4)
            return
    }

    public static void glDrawElementsInstancedARB(@org.lwjgl.system.NativeType("GLenum") int r7, @org.lwjgl.system.NativeType("void const *") java.nio.IntBuffer r8, @org.lwjgl.system.NativeType("GLsizei") int r9) {
            r0 = r7
            r1 = r8
            int r1 = r1.remaining()
            r2 = 5125(0x1405, float:7.182E-42)
            r3 = r8
            long r3 = org.lwjgl.system.MemoryUtil.memAddress(r3)
            r4 = r9
            nglDrawElementsInstancedARB(r0, r1, r2, r3, r4)
            return
    }

    static {
            org.lwjgl.opengl.GL.initialize()
            return
    }
}
