package org.lwjgl.opengl;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/opengl/EXTBlendMinmax.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/opengl/EXTBlendMinmax.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/opengl/EXTBlendMinmax.class */
public class EXTBlendMinmax {
    public static final int GL_FUNC_ADD_EXT = 32774;
    public static final int GL_MIN_EXT = 32775;
    public static final int GL_MAX_EXT = 32776;
    public static final int GL_BLEND_EQUATION_EXT = 32777;

    protected EXTBlendMinmax() {
            r3 = this;
            r0 = r3
            r0.<init>()
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r1 = r0
            r1.<init>()
            throw r0
    }

    public static native void glBlendEquationEXT(@org.lwjgl.system.NativeType("GLenum") int r0);

    static {
            org.lwjgl.opengl.GL.initialize()
            return
    }
}
