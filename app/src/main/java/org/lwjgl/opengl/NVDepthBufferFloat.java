package org.lwjgl.opengl;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/opengl/NVDepthBufferFloat.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/opengl/NVDepthBufferFloat.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/opengl/NVDepthBufferFloat.class */
public class NVDepthBufferFloat {
    public static final int GL_DEPTH_COMPONENT32F_NV = 36267;
    public static final int GL_DEPTH32F_STENCIL8_NV = 36268;
    public static final int GL_FLOAT_32_UNSIGNED_INT_24_8_REV_NV = 36269;
    public static final int GL_DEPTH_BUFFER_FLOAT_MODE_NV = 36271;

    protected NVDepthBufferFloat() {
            r3 = this;
            r0 = r3
            r0.<init>()
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r1 = r0
            r1.<init>()
            throw r0
    }

    public static native void glDepthRangedNV(@org.lwjgl.system.NativeType("GLdouble") double r0, @org.lwjgl.system.NativeType("GLdouble") double r2);

    public static native void glClearDepthdNV(@org.lwjgl.system.NativeType("GLdouble") double r0);

    public static native void glDepthBoundsdNV(@org.lwjgl.system.NativeType("GLdouble") double r0, @org.lwjgl.system.NativeType("GLdouble") double r2);

    static {
            org.lwjgl.opengl.GL.initialize()
            return
    }
}
