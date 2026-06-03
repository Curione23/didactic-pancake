package org.lwjgl.opengl;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/opengl/EXTMemoryObjectFD.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/opengl/EXTMemoryObjectFD.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/opengl/EXTMemoryObjectFD.class */
public class EXTMemoryObjectFD {
    public static final int GL_HANDLE_TYPE_OPAQUE_FD_EXT = 38278;

    protected EXTMemoryObjectFD() {
            r3 = this;
            r0 = r3
            r0.<init>()
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r1 = r0
            r1.<init>()
            throw r0
    }

    public static native void glImportMemoryFdEXT(@org.lwjgl.system.NativeType("GLuint") int r0, @org.lwjgl.system.NativeType("GLuint64") long r1, @org.lwjgl.system.NativeType("GLenum") int r3, @org.lwjgl.system.NativeType("GLint") int r4);

    static {
            org.lwjgl.opengl.GL.initialize()
            return
    }
}
