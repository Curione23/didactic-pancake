package org.lwjgl.opengl;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/opengl/KHRBlendEquationAdvanced.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/opengl/KHRBlendEquationAdvanced.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/opengl/KHRBlendEquationAdvanced.class */
public class KHRBlendEquationAdvanced {
    public static final int GL_MULTIPLY_KHR = 37524;
    public static final int GL_SCREEN_KHR = 37525;
    public static final int GL_OVERLAY_KHR = 37526;
    public static final int GL_DARKEN_KHR = 37527;
    public static final int GL_LIGHTEN_KHR = 37528;
    public static final int GL_COLORDODGE_KHR = 37529;
    public static final int GL_COLORBURN_KHR = 37530;
    public static final int GL_HARDLIGHT_KHR = 37531;
    public static final int GL_SOFTLIGHT_KHR = 37532;
    public static final int GL_DIFFERENCE_KHR = 37534;
    public static final int GL_EXCLUSION_KHR = 37536;
    public static final int GL_HSL_HUE_KHR = 37549;
    public static final int GL_HSL_SATURATION_KHR = 37550;
    public static final int GL_HSL_COLOR_KHR = 37551;
    public static final int GL_HSL_LUMINOSITY_KHR = 37552;

    protected KHRBlendEquationAdvanced() {
            r3 = this;
            r0 = r3
            r0.<init>()
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r1 = r0
            r1.<init>()
            throw r0
    }

    public static native void glBlendBarrierKHR();

    static {
            org.lwjgl.opengl.GL.initialize()
            return
    }
}
