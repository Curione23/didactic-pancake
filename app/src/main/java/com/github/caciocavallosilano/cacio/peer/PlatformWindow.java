package com.github.caciocavallosilano.cacio.peer;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/caciocavallo.zip:caciocavallo17/cacio-shared-1.19.1-SNAPSHOT.jar:com/github/caciocavallosilano/cacio/peer/PlatformWindow.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/caciocavallo17/cacio-shared-1.19.1-SNAPSHOT.jar:com/github/caciocavallosilano/cacio/peer/PlatformWindow.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/caciocavallo.zip:caciocavallo17/cacio-shared-1.19.1-SNAPSHOT.jar:com/github/caciocavallosilano/cacio/peer/PlatformWindow.class */
public interface PlatformWindow {
    java.awt.image.ColorModel getColorModel();

    java.awt.GraphicsConfiguration getGraphicsConfiguration();

    java.awt.Rectangle getBounds();

    void dispose();

    java.awt.Graphics2D getGraphics(java.awt.Color r1, java.awt.Color r2, java.awt.Font r3);

    void setBounds(int r1, int r2, int r3, int r4, int r5);

    java.awt.Insets getInsets();

    java.awt.Point getLocationOnScreen();

    boolean canDetermineObscurity();

    boolean isObscured();

    void applyShape(sun.java2d.pipe.Region r1);

    boolean isReparentSuppored();

    void reparent(java.awt.peer.ContainerPeer r1);

    boolean isRestackSupported();

    void restack();

    void setVisible(boolean r1);

    void createBuffers(int r1, java.awt.BufferCapabilities r2) throws java.awt.AWTException;

    void destroyBuffers();

    void flip(int r1, int r2, int r3, int r4, java.awt.BufferCapabilities.FlipContents r5);

    java.awt.Image getBackBuffer();

    void requestFocus();
}
