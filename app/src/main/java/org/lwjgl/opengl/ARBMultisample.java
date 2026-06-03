package org.lwjgl.opengl;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/opengl/ARBMultisample.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/opengl/ARBMultisample.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/opengl/ARBMultisample.class */
public class ARBMultisample {
    public static final int GL_MULTISAMPLE_ARB = 32925;
    public static final int GL_SAMPLE_ALPHA_TO_COVERAGE_ARB = 32926;
    public static final int GL_SAMPLE_ALPHA_TO_ONE_ARB = 32927;
    public static final int GL_SAMPLE_COVERAGE_ARB = 32928;
    public static final int GL_MULTISAMPLE_BIT_ARB = 536870912;
    public static final int GL_SAMPLE_BUFFERS_ARB = 32936;
    public static final int GL_SAMPLES_ARB = 32937;
    public static final int GL_SAMPLE_COVERAGE_VALUE_ARB = 32938;
    public static final int GL_SAMPLE_COVERAGE_INVERT_ARB = 32939;

    protected ARBMultisample() {
            r3 = this;
            r0 = r3
            r0.<init>()
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r1 = r0
            r1.<init>()
            throw r0
    }

    public static native void glSampleCoverageARB(@org.lwjgl.system.NativeType("GLfloat") float r0, @org.lwjgl.system.NativeType("GLboolean") boolean r1);

    static {
            org.lwjgl.opengl.GL.initialize()
            return
    }
}
