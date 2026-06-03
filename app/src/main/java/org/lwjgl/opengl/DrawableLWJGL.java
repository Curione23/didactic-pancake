package org.lwjgl.opengl;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/opengl/DrawableLWJGL.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/opengl/DrawableLWJGL.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/opengl/DrawableLWJGL.class */
interface DrawableLWJGL extends org.lwjgl.opengl.Drawable {
    void setPixelFormat(org.lwjgl.opengl.PixelFormatLWJGL r1) throws org.lwjgl.LWJGLException;

    void setPixelFormat(org.lwjgl.opengl.PixelFormatLWJGL r1, org.lwjgl.opengl.ContextAttribs r2) throws org.lwjgl.LWJGLException;

    org.lwjgl.opengl.PixelFormatLWJGL getPixelFormat();

    org.lwjgl.opengl.Context getContext();

    org.lwjgl.opengl.Context createSharedContext() throws org.lwjgl.LWJGLException;

    void checkGLError();

    void setSwapInterval(int r1);

    void swapBuffers() throws org.lwjgl.LWJGLException;

    void initContext(float r1, float r2, float r3);
}
