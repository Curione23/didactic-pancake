package org.lwjgl.opengl;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/opengl/InputImplementation.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/opengl/InputImplementation.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/opengl/InputImplementation.class */
public interface InputImplementation {
    boolean hasWheel();

    int getButtonCount();

    void createMouse() throws org.lwjgl.LWJGLException;

    void destroyMouse();

    void pollMouse(java.nio.IntBuffer r1, java.nio.ByteBuffer r2);

    void readMouse(java.nio.ByteBuffer r1);

    void grabMouse(boolean r1);

    int getNativeCursorCapabilities();

    void setCursorPosition(int r1, int r2);

    void setNativeCursor(java.lang.Object r1) throws org.lwjgl.LWJGLException;

    int getMinCursorSize();

    int getMaxCursorSize();

    void createKeyboard() throws org.lwjgl.LWJGLException;

    void destroyKeyboard();

    void pollKeyboard(java.nio.ByteBuffer r1);

    void readKeyboard(java.nio.ByteBuffer r1);

    java.lang.Object createCursor(int r1, int r2, int r3, int r4, int r5, java.nio.IntBuffer r6, java.nio.IntBuffer r7) throws org.lwjgl.LWJGLException;

    void destroyCursor(java.lang.Object r1);

    int getWidth();

    int getHeight();

    boolean isInsideWindow();
}
