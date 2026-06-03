package com.github.caciocavallosilano.cacio.peer.managed;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/caciocavallo.zip:caciocavallo17/cacio-shared-1.19.1-SNAPSHOT.jar:com/github/caciocavallosilano/cacio/peer/managed/ManagedWindowContainer.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/caciocavallo17/cacio-shared-1.19.1-SNAPSHOT.jar:com/github/caciocavallosilano/cacio/peer/managed/ManagedWindowContainer.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/caciocavallo.zip:caciocavallo17/cacio-shared-1.19.1-SNAPSHOT.jar:com/github/caciocavallosilano/cacio/peer/managed/ManagedWindowContainer.class */
interface ManagedWindowContainer {
    void add(com.github.caciocavallosilano.cacio.peer.managed.ManagedWindow r1);

    void remove(com.github.caciocavallosilano.cacio.peer.managed.ManagedWindow r1);

    java.util.Deque<com.github.caciocavallosilano.cacio.peer.managed.ManagedWindow> getChildren();

    java.awt.Point getLocationOnScreen();

    void dispatchEvent(com.github.caciocavallosilano.cacio.peer.managed.EventData r1);

    java.awt.Graphics2D getClippedGraphics(java.awt.Color r1, java.awt.Color r2, java.awt.Font r3, java.util.List<java.awt.Rectangle> r4);

    void repaint(int r1, int r2, int r3, int r4);

    java.awt.image.ColorModel getColorModel();

    java.awt.GraphicsConfiguration getGraphicsConfiguration();
}
