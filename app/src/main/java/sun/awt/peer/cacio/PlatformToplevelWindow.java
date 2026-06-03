package sun.awt.peer.cacio;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/caciocavallo.zip:caciocavallo/cacio-shared-1.10-SNAPSHOT.jar:sun/awt/peer/cacio/PlatformToplevelWindow.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/caciocavallo/cacio-shared-1.10-SNAPSHOT.jar:sun/awt/peer/cacio/PlatformToplevelWindow.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/caciocavallo.zip:caciocavallo/cacio-shared-1.10-SNAPSHOT.jar:sun/awt/peer/cacio/PlatformToplevelWindow.class */
public interface PlatformToplevelWindow extends sun.awt.peer.cacio.PlatformWindow {
    int getState();

    void setState(int r1);

    void setMaximizedBounds(java.awt.Rectangle r1);

    void setResizable(boolean r1);

    void setTitle(java.lang.String r1);

    void setBlocked(boolean r1);
}
