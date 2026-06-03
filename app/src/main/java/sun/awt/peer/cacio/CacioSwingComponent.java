package sun.awt.peer.cacio;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/caciocavallo.zip:caciocavallo/cacio-shared-1.10-SNAPSHOT.jar:sun/awt/peer/cacio/CacioSwingComponent.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/caciocavallo/cacio-shared-1.10-SNAPSHOT.jar:sun/awt/peer/cacio/CacioSwingComponent.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/caciocavallo.zip:caciocavallo/cacio-shared-1.10-SNAPSHOT.jar:sun/awt/peer/cacio/CacioSwingComponent.class */
interface CacioSwingComponent {
    javax.swing.JComponent getJComponent();

    void handleMouseEvent(java.awt.event.MouseEvent r1);

    void handleMouseMotionEvent(java.awt.event.MouseEvent r1);

    void handleKeyEvent(java.awt.event.KeyEvent r1);

    void handleFocusEvent(java.awt.event.FocusEvent r1);
}
