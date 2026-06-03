package org.lwjgl.glfw;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/glfw/GLFWWindowProperties.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/glfw/GLFWWindowProperties.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/glfw/GLFWWindowProperties.class */
public class GLFWWindowProperties {
    public int width;
    public int height;
    public int x;
    public int y;
    public java.lang.CharSequence title;
    public boolean shouldClose;
    public boolean isInitialSizeCalled;
    public boolean isCursorEntered;
    public java.util.Map<java.lang.Integer, java.lang.Integer> inputModes;
    public java.util.Map<java.lang.Integer, java.lang.Integer> windowAttribs;

    public GLFWWindowProperties() {
            r4 = this;
            r0 = r4
            r0.<init>()
            r0 = r4
            int r1 = org.lwjgl.glfw.GLFW.mGLFWWindowWidth
            r0.width = r1
            r0 = r4
            int r1 = org.lwjgl.glfw.GLFW.mGLFWWindowHeight
            r0.height = r1
            r0 = r4
            java.util.HashMap r1 = new java.util.HashMap
            r2 = r1
            r2.<init>()
            r0.inputModes = r1
            r0 = r4
            java.util.HashMap r1 = new java.util.HashMap
            r2 = r1
            r2.<init>()
            r0.windowAttribs = r1
            return
    }
}
