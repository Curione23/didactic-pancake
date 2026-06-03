package org.lwjgl.opengl;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/opengl/ARBSampleShading.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/opengl/ARBSampleShading.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/opengl/ARBSampleShading.class */
public class ARBSampleShading {
    public static final int GL_SAMPLE_SHADING_ARB = 35894;
    public static final int GL_MIN_SAMPLE_SHADING_VALUE_ARB = 35895;

    protected ARBSampleShading() {
            r3 = this;
            r0 = r3
            r0.<init>()
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r1 = r0
            r1.<init>()
            throw r0
    }

    public static native void glMinSampleShadingARB(@org.lwjgl.system.NativeType("GLfloat") float r0);

    static {
            org.lwjgl.opengl.GL.initialize()
            return
    }
}
