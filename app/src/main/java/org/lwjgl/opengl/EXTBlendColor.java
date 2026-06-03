package org.lwjgl.opengl;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/opengl/EXTBlendColor.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/opengl/EXTBlendColor.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/opengl/EXTBlendColor.class */
public class EXTBlendColor {
    public static final int GL_CONSTANT_COLOR_EXT = 32769;
    public static final int GL_ONE_MINUS_CONSTANT_COLOR_EXT = 32770;
    public static final int GL_CONSTANT_ALPHA_EXT = 32771;
    public static final int GL_ONE_MINUS_CONSTANT_ALPHA_EXT = 32772;
    public static final int GL_BLEND_COLOR_EXT = 32773;

    protected EXTBlendColor() {
            r3 = this;
            r0 = r3
            r0.<init>()
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r1 = r0
            r1.<init>()
            throw r0
    }

    public static native void glBlendColorEXT(@org.lwjgl.system.NativeType("GLfloat") float r0, @org.lwjgl.system.NativeType("GLfloat") float r1, @org.lwjgl.system.NativeType("GLfloat") float r2, @org.lwjgl.system.NativeType("GLfloat") float r3);

    static {
            org.lwjgl.opengl.GL.initialize()
            return
    }
}
