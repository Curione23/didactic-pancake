package org.lwjgl.opengl;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/opengl/Drawable.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/opengl/Drawable.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/opengl/Drawable.class */
public interface Drawable {
    boolean isCurrent() throws org.lwjgl.LWJGLException;

    void makeCurrent() throws org.lwjgl.LWJGLException;

    void releaseContext() throws org.lwjgl.LWJGLException;

    void destroy();

    void setCLSharingProperties(org.lwjgl.PointerBuffer r1) throws org.lwjgl.LWJGLException;
}
