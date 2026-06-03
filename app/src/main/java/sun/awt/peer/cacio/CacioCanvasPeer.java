package sun.awt.peer.cacio;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/caciocavallo.zip:caciocavallo/cacio-shared-1.10-SNAPSHOT.jar:sun/awt/peer/cacio/CacioCanvasPeer.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/caciocavallo/cacio-shared-1.10-SNAPSHOT.jar:sun/awt/peer/cacio/CacioCanvasPeer.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/caciocavallo.zip:caciocavallo/cacio-shared-1.10-SNAPSHOT.jar:sun/awt/peer/cacio/CacioCanvasPeer.class */
class CacioCanvasPeer extends sun.awt.peer.cacio.CacioComponentPeer<java.awt.Canvas, javax.swing.JPanel> implements java.awt.peer.CanvasPeer {
    public CacioCanvasPeer(java.awt.Canvas r5, sun.awt.peer.cacio.PlatformWindowFactory r6) {
            r4 = this;
            r0 = r4
            r1 = r5
            r2 = r6
            r0.<init>(r1, r2)
            return
    }

    @Override // sun.awt.peer.cacio.CacioComponentPeer
    protected void peerPaint(java.awt.Graphics r2, boolean r3) {
            r1 = this;
            return
    }

    public java.awt.GraphicsConfiguration getAppropriateGraphicsConfiguration(java.awt.GraphicsConfiguration r3) {
            r2 = this;
            r0 = r3
            return r0
    }
}
