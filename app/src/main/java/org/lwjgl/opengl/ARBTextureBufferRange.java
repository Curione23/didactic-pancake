package org.lwjgl.opengl;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/opengl/ARBTextureBufferRange.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/opengl/ARBTextureBufferRange.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/opengl/ARBTextureBufferRange.class */
public class ARBTextureBufferRange {
    public static final int GL_TEXTURE_BUFFER_OFFSET = 37277;
    public static final int GL_TEXTURE_BUFFER_SIZE = 37278;
    public static final int GL_TEXTURE_BUFFER_OFFSET_ALIGNMENT = 37279;

    protected ARBTextureBufferRange() {
            r3 = this;
            r0 = r3
            r0.<init>()
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r1 = r0
            r1.<init>()
            throw r0
    }

    public static void glTexBufferRange(@org.lwjgl.system.NativeType("GLenum") int r8, @org.lwjgl.system.NativeType("GLenum") int r9, @org.lwjgl.system.NativeType("GLuint") int r10, @org.lwjgl.system.NativeType("GLintptr") long r11, @org.lwjgl.system.NativeType("GLsizeiptr") long r13) {
            r0 = r8
            r1 = r9
            r2 = r10
            r3 = r11
            r4 = r13
            org.lwjgl.opengl.GL43C.glTexBufferRange(r0, r1, r2, r3, r4)
            return
    }

    public static native void glTextureBufferRangeEXT(@org.lwjgl.system.NativeType("GLuint") int r0, @org.lwjgl.system.NativeType("GLenum") int r1, @org.lwjgl.system.NativeType("GLenum") int r2, @org.lwjgl.system.NativeType("GLuint") int r3, @org.lwjgl.system.NativeType("GLintptr") long r4, @org.lwjgl.system.NativeType("GLsizeiptr") long r6);

    static {
            org.lwjgl.opengl.GL.initialize()
            return
    }
}
