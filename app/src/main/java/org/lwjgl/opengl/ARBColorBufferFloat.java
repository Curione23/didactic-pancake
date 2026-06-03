package org.lwjgl.opengl;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/opengl/ARBColorBufferFloat.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/opengl/ARBColorBufferFloat.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/opengl/ARBColorBufferFloat.class */
public class ARBColorBufferFloat {
    public static final int GL_RGBA_FLOAT_MODE_ARB = 34848;
    public static final int GL_CLAMP_VERTEX_COLOR_ARB = 35098;
    public static final int GL_CLAMP_FRAGMENT_COLOR_ARB = 35099;
    public static final int GL_CLAMP_READ_COLOR_ARB = 35100;
    public static final int GL_FIXED_ONLY_ARB = 35101;

    protected ARBColorBufferFloat() {
            r3 = this;
            r0 = r3
            r0.<init>()
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r1 = r0
            r1.<init>()
            throw r0
    }

    public static native void glClampColorARB(@org.lwjgl.system.NativeType("GLenum") int r0, @org.lwjgl.system.NativeType("GLenum") int r1);

    static {
            org.lwjgl.opengl.GL.initialize()
            return
    }
}
