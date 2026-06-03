package com.github.caciocavallosilano.cacio.peer.managed;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/caciocavallo.zip:caciocavallo17/cacio-shared-1.19.1-SNAPSHOT.jar:com/github/caciocavallosilano/cacio/peer/managed/PlatformScreen.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/caciocavallo17/cacio-shared-1.19.1-SNAPSHOT.jar:com/github/caciocavallosilano/cacio/peer/managed/PlatformScreen.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/caciocavallo.zip:caciocavallo17/cacio-shared-1.19.1-SNAPSHOT.jar:com/github/caciocavallosilano/cacio/peer/managed/PlatformScreen.class */
public interface PlatformScreen {
    java.awt.image.ColorModel getColorModel();

    java.awt.GraphicsConfiguration getGraphicsConfiguration();

    java.awt.Rectangle getBounds();

    java.awt.Graphics2D getClippedGraphics(java.awt.Color r1, java.awt.Color r2, java.awt.Font r3, java.util.List<java.awt.Rectangle> r4);
}
