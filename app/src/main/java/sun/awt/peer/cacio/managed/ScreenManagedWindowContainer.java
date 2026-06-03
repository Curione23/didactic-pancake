package sun.awt.peer.cacio.managed;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/caciocavallo.zip:caciocavallo/cacio-shared-1.10-SNAPSHOT.jar:sun/awt/peer/cacio/managed/ScreenManagedWindowContainer.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/caciocavallo/cacio-shared-1.10-SNAPSHOT.jar:sun/awt/peer/cacio/managed/ScreenManagedWindowContainer.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/caciocavallo.zip:caciocavallo/cacio-shared-1.10-SNAPSHOT.jar:sun/awt/peer/cacio/managed/ScreenManagedWindowContainer.class */
public class ScreenManagedWindowContainer extends sun.awt.peer.cacio.managed.AbstractManagedWindowContainer {
    private sun.awt.peer.cacio.managed.PlatformScreen screen;

    ScreenManagedWindowContainer(sun.awt.peer.cacio.managed.PlatformScreen r4) {
            r3 = this;
            r0 = r3
            r0.<init>()
            r0 = r3
            r1 = r4
            r0.screen = r1
            return
    }

    @Override // sun.awt.peer.cacio.managed.ManagedWindowContainer
    public java.awt.Graphics2D getClippedGraphics(java.awt.Color r7, java.awt.Color r8, java.awt.Font r9, java.util.List<java.awt.Rectangle> r10) {
            r6 = this;
            r0 = r6
            sun.awt.peer.cacio.managed.PlatformScreen r0 = r0.screen
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            java.awt.Graphics2D r0 = r0.getClippedGraphics(r1, r2, r3, r4)
            return r0
    }

    @Override // sun.awt.peer.cacio.managed.ManagedWindowContainer, sun.awt.peer.cacio.PlatformWindow
    public java.awt.image.ColorModel getColorModel() {
            r2 = this;
            r0 = r2
            sun.awt.peer.cacio.managed.PlatformScreen r0 = r0.screen
            java.awt.image.ColorModel r0 = r0.getColorModel()
            return r0
    }

    @Override // sun.awt.peer.cacio.managed.ManagedWindowContainer, sun.awt.peer.cacio.PlatformWindow
    public java.awt.GraphicsConfiguration getGraphicsConfiguration() {
            r2 = this;
            r0 = r2
            sun.awt.peer.cacio.managed.PlatformScreen r0 = r0.screen
            java.awt.GraphicsConfiguration r0 = r0.getGraphicsConfiguration()
            return r0
    }

    @Override // sun.awt.peer.cacio.managed.AbstractManagedWindowContainer, sun.awt.peer.cacio.managed.ManagedWindowContainer
    public /* bridge */ /* synthetic */ void repaint(int r7, int r8, int r9, int r10) {
            r6 = this;
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            super.repaint(r1, r2, r3, r4)
            return
    }

    @Override // sun.awt.peer.cacio.managed.AbstractManagedWindowContainer, sun.awt.peer.cacio.managed.ManagedWindowContainer
    public /* bridge */ /* synthetic */ java.awt.Point getLocationOnScreen() {
            r2 = this;
            r0 = r2
            java.awt.Point r0 = super.getLocationOnScreen()
            return r0
    }
}
