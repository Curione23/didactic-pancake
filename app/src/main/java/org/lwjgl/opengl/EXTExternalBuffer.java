package org.lwjgl.opengl;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/opengl/EXTExternalBuffer.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/opengl/EXTExternalBuffer.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/opengl/EXTExternalBuffer.class */
public class EXTExternalBuffer {
    protected EXTExternalBuffer() {
            r3 = this;
            r0 = r3
            r0.<init>()
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r1 = r0
            r1.<init>()
            throw r0
    }

    public static native void nglBufferStorageExternalEXT(int r0, long r1, long r3, long r5, int r7);

    public static void glBufferStorageExternalEXT(@org.lwjgl.system.NativeType("GLenum") int r9, @org.lwjgl.system.NativeType("GLintptr") long r10, @org.lwjgl.system.NativeType("GLsizeiptr") long r12, @org.lwjgl.system.NativeType("GLeglClientBufferEXT") long r14, @org.lwjgl.system.NativeType("GLbitfield") int r16) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lc
            r0 = r14
            long r0 = org.lwjgl.system.Checks.check(r0)
        Lc:
            r0 = r9
            r1 = r10
            r2 = r12
            r3 = r14
            r4 = r16
            nglBufferStorageExternalEXT(r0, r1, r2, r3, r4)
            return
    }

    public static native void nglNamedBufferStorageExternalEXT(int r0, long r1, long r3, long r5, int r7);

    public static void glNamedBufferStorageExternalEXT(@org.lwjgl.system.NativeType("GLuint") int r9, @org.lwjgl.system.NativeType("GLintptr") long r10, @org.lwjgl.system.NativeType("GLsizeiptr") long r12, @org.lwjgl.system.NativeType("GLeglClientBufferEXT") long r14, @org.lwjgl.system.NativeType("GLbitfield") int r16) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lc
            r0 = r14
            long r0 = org.lwjgl.system.Checks.check(r0)
        Lc:
            r0 = r9
            r1 = r10
            r2 = r12
            r3 = r14
            r4 = r16
            nglNamedBufferStorageExternalEXT(r0, r1, r2, r3, r4)
            return
    }

    static {
            org.lwjgl.opengl.GL.initialize()
            return
    }
}
