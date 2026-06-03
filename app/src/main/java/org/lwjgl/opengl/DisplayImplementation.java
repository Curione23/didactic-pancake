package org.lwjgl.opengl;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/opengl/DisplayImplementation.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/opengl/DisplayImplementation.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/opengl/DisplayImplementation.class */
interface DisplayImplementation extends org.lwjgl.opengl.InputImplementation {
    void createWindow(org.lwjgl.opengl.DrawableLWJGL r1, org.lwjgl.opengl.DisplayMode r2, java.awt.Canvas r3, int r4, int r5) throws org.lwjgl.LWJGLException;

    void destroyWindow();

    void switchDisplayMode(org.lwjgl.opengl.DisplayMode r1) throws org.lwjgl.LWJGLException;

    void resetDisplayMode();

    int getGammaRampLength();

    void setGammaRamp(java.nio.FloatBuffer r1) throws org.lwjgl.LWJGLException;

    java.lang.String getAdapter();

    java.lang.String getVersion();

    org.lwjgl.opengl.DisplayMode init() throws org.lwjgl.LWJGLException;

    void setTitle(java.lang.String r1);

    boolean isCloseRequested();

    boolean isVisible();

    boolean isActive();

    boolean isDirty();

    org.lwjgl.opengl.PeerInfo createPeerInfo(org.lwjgl.opengl.PixelFormat r1, org.lwjgl.opengl.ContextAttribs r2) throws org.lwjgl.LWJGLException;

    void update();

    void reshape(int r1, int r2, int r3, int r4);

    org.lwjgl.opengl.DisplayMode[] getAvailableDisplayModes() throws org.lwjgl.LWJGLException;

    int getPbufferCapabilities();

    boolean isBufferLost(org.lwjgl.opengl.PeerInfo r1);

    org.lwjgl.opengl.PeerInfo createPbuffer(int r1, int r2, org.lwjgl.opengl.PixelFormat r3, org.lwjgl.opengl.ContextAttribs r4, java.nio.IntBuffer r5, java.nio.IntBuffer r6) throws org.lwjgl.LWJGLException;

    void setPbufferAttrib(org.lwjgl.opengl.PeerInfo r1, int r2, int r3);

    void bindTexImageToPbuffer(org.lwjgl.opengl.PeerInfo r1, int r2);

    void releaseTexImageFromPbuffer(org.lwjgl.opengl.PeerInfo r1, int r2);

    int setIcon(java.nio.ByteBuffer[] r1);

    void setResizable(boolean r1);

    boolean wasResized();

    @Override // org.lwjgl.opengl.InputImplementation
    int getWidth();

    @Override // org.lwjgl.opengl.InputImplementation
    int getHeight();

    int getX();

    int getY();

    float getPixelScaleFactor();
}
