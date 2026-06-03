package org.lwjgl.opengl;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/opengl/EXTCompiledVertexArray.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/opengl/EXTCompiledVertexArray.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/opengl/EXTCompiledVertexArray.class */
public class EXTCompiledVertexArray {
    public static final int GL_ARRAY_ELEMENT_LOCK_FIRST_EXT = 33192;
    public static final int GL_ARRAY_ELEMENT_LOCK_COUNT_EXT = 33193;

    protected EXTCompiledVertexArray() {
            r3 = this;
            r0 = r3
            r0.<init>()
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r1 = r0
            r1.<init>()
            throw r0
    }

    public static native void glLockArraysEXT(@org.lwjgl.system.NativeType("GLint") int r0, @org.lwjgl.system.NativeType("GLsizei") int r1);

    public static native void glUnlockArraysEXT();

    static {
            org.lwjgl.opengl.GL.initialize()
            return
    }
}
