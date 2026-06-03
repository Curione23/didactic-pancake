package org.lwjgl.opengl;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/opengl/NVAlphaToCoverageDitherControl.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/opengl/NVAlphaToCoverageDitherControl.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/opengl/NVAlphaToCoverageDitherControl.class */
public class NVAlphaToCoverageDitherControl {
    public static final int GL_ALPHA_TO_COVERAGE_DITHER_DEFAULT_NV = 37709;
    public static final int GL_ALPHA_TO_COVERAGE_DITHER_ENABLE_NV = 37710;
    public static final int GL_ALPHA_TO_COVERAGE_DITHER_DISABLE_NV = 37711;
    public static final int GL_ALPHA_TO_COVERAGE_DITHER_MODE_NV = 37567;

    protected NVAlphaToCoverageDitherControl() {
            r3 = this;
            r0 = r3
            r0.<init>()
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r1 = r0
            r1.<init>()
            throw r0
    }

    public static native void glAlphaToCoverageDitherControlNV(@org.lwjgl.system.NativeType("GLenum") int r0);

    static {
            org.lwjgl.opengl.GL.initialize()
            return
    }
}
