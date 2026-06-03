package org.lwjgl.opengl;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/opengl/ARBSparseBuffer.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/opengl/ARBSparseBuffer.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/opengl/ARBSparseBuffer.class */
public class ARBSparseBuffer {
    public static final int GL_SPARSE_STORAGE_BIT_ARB = 1024;
    public static final int GL_SPARSE_BUFFER_PAGE_SIZE_ARB = 33528;

    protected ARBSparseBuffer() {
            r3 = this;
            r0 = r3
            r0.<init>()
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r1 = r0
            r1.<init>()
            throw r0
    }

    public static native void glBufferPageCommitmentARB(@org.lwjgl.system.NativeType("GLenum") int r0, @org.lwjgl.system.NativeType("GLintptr") long r1, @org.lwjgl.system.NativeType("GLsizeiptr") long r3, @org.lwjgl.system.NativeType("GLboolean") boolean r5);

    public static native void glNamedBufferPageCommitmentEXT(@org.lwjgl.system.NativeType("GLuint") int r0, @org.lwjgl.system.NativeType("GLintptr") long r1, @org.lwjgl.system.NativeType("GLsizeiptr") long r3, @org.lwjgl.system.NativeType("GLboolean") boolean r5);

    public static native void glNamedBufferPageCommitmentARB(@org.lwjgl.system.NativeType("GLuint") int r0, @org.lwjgl.system.NativeType("GLintptr") long r1, @org.lwjgl.system.NativeType("GLsizeiptr") long r3, @org.lwjgl.system.NativeType("GLboolean") boolean r5);

    static {
            org.lwjgl.opengl.GL.initialize()
            return
    }
}
