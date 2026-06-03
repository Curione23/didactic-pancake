package sun.awt.peer.cacio.managed;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/caciocavallo.zip:caciocavallo/cacio-shared-1.10-SNAPSHOT.jar:sun/awt/peer/cacio/managed/ManagedWindowContainer.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/caciocavallo/cacio-shared-1.10-SNAPSHOT.jar:sun/awt/peer/cacio/managed/ManagedWindowContainer.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/caciocavallo.zip:caciocavallo/cacio-shared-1.10-SNAPSHOT.jar:sun/awt/peer/cacio/managed/ManagedWindowContainer.class */
interface ManagedWindowContainer {
    void add(sun.awt.peer.cacio.managed.ManagedWindow r1);

    void remove(sun.awt.peer.cacio.managed.ManagedWindow r1);

    java.util.Deque<sun.awt.peer.cacio.managed.ManagedWindow> getChildren();

    java.awt.Point getLocationOnScreen();

    void dispatchEvent(sun.awt.peer.cacio.managed.EventData r1);

    java.awt.Graphics2D getClippedGraphics(java.awt.Color r1, java.awt.Color r2, java.awt.Font r3, java.util.List<java.awt.Rectangle> r4);

    void repaint(int r1, int r2, int r3, int r4);

    java.awt.image.ColorModel getColorModel();

    java.awt.GraphicsConfiguration getGraphicsConfiguration();
}
