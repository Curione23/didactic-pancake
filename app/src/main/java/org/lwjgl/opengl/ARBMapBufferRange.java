package org.lwjgl.opengl;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/opengl/ARBMapBufferRange.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/opengl/ARBMapBufferRange.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/opengl/ARBMapBufferRange.class */
public class ARBMapBufferRange {
    public static final int GL_MAP_READ_BIT = 1;
    public static final int GL_MAP_WRITE_BIT = 2;
    public static final int GL_MAP_INVALIDATE_RANGE_BIT = 4;
    public static final int GL_MAP_INVALIDATE_BUFFER_BIT = 8;
    public static final int GL_MAP_FLUSH_EXPLICIT_BIT = 16;
    public static final int GL_MAP_UNSYNCHRONIZED_BIT = 32;

    protected ARBMapBufferRange() {
            r3 = this;
            r0 = r3
            r0.<init>()
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r1 = r0
            r1.<init>()
            throw r0
    }

    public static long nglMapBufferRange(int r7, long r8, long r10, int r12) {
            r0 = r7
            r1 = r8
            r2 = r10
            r3 = r12
            long r0 = org.lwjgl.opengl.GL30C.nglMapBufferRange(r0, r1, r2, r3)
            return r0
    }

    @javax.annotation.Nullable
    @org.lwjgl.system.NativeType("void *")
    public static java.nio.ByteBuffer glMapBufferRange(@org.lwjgl.system.NativeType("GLenum") int r7, @org.lwjgl.system.NativeType("GLintptr") long r8, @org.lwjgl.system.NativeType("GLsizeiptr") long r10, @org.lwjgl.system.NativeType("GLbitfield") int r12) {
            r0 = r7
            r1 = r8
            r2 = r10
            r3 = r12
            java.nio.ByteBuffer r0 = org.lwjgl.opengl.GL30C.glMapBufferRange(r0, r1, r2, r3)
            return r0
    }

    @javax.annotation.Nullable
    @org.lwjgl.system.NativeType("void *")
    public static java.nio.ByteBuffer glMapBufferRange(@org.lwjgl.system.NativeType("GLenum") int r8, @org.lwjgl.system.NativeType("GLintptr") long r9, @org.lwjgl.system.NativeType("GLsizeiptr") long r11, @org.lwjgl.system.NativeType("GLbitfield") int r13, @javax.annotation.Nullable java.nio.ByteBuffer r14) {
            r0 = r8
            r1 = r9
            r2 = r11
            r3 = r13
            r4 = r14
            java.nio.ByteBuffer r0 = org.lwjgl.opengl.GL30C.glMapBufferRange(r0, r1, r2, r3, r4)
            return r0
    }

    public static void glFlushMappedBufferRange(@org.lwjgl.system.NativeType("GLenum") int r6, @org.lwjgl.system.NativeType("GLintptr") long r7, @org.lwjgl.system.NativeType("GLsizeiptr") long r9) {
            r0 = r6
            r1 = r7
            r2 = r9
            org.lwjgl.opengl.GL30C.glFlushMappedBufferRange(r0, r1, r2)
            return
    }

    static {
            org.lwjgl.opengl.GL.initialize()
            return
    }
}
