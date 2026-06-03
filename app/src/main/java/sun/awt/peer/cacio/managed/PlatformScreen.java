package sun.awt.peer.cacio.managed;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/caciocavallo.zip:caciocavallo/cacio-shared-1.10-SNAPSHOT.jar:sun/awt/peer/cacio/managed/PlatformScreen.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/caciocavallo/cacio-shared-1.10-SNAPSHOT.jar:sun/awt/peer/cacio/managed/PlatformScreen.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/caciocavallo.zip:caciocavallo/cacio-shared-1.10-SNAPSHOT.jar:sun/awt/peer/cacio/managed/PlatformScreen.class */
public interface PlatformScreen {
    java.awt.image.ColorModel getColorModel();

    java.awt.GraphicsConfiguration getGraphicsConfiguration();

    java.awt.Rectangle getBounds();

    java.awt.Graphics2D getClippedGraphics(java.awt.Color r1, java.awt.Color r2, java.awt.Font r3, java.util.List<java.awt.Rectangle> r4);
}
