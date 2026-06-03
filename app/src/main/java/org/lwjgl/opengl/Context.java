package org.lwjgl.opengl;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/opengl/Context.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/opengl/Context.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/opengl/Context.class */
interface Context {
    boolean isCurrent() throws org.lwjgl.LWJGLException;

    void makeCurrent() throws org.lwjgl.LWJGLException;

    void releaseCurrent() throws org.lwjgl.LWJGLException;

    void releaseDrawable() throws org.lwjgl.LWJGLException;
}
