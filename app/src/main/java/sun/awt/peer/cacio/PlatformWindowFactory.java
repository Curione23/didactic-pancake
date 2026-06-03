package sun.awt.peer.cacio;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/caciocavallo.zip:caciocavallo/cacio-shared-1.10-SNAPSHOT.jar:sun/awt/peer/cacio/PlatformWindowFactory.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/caciocavallo/cacio-shared-1.10-SNAPSHOT.jar:sun/awt/peer/cacio/PlatformWindowFactory.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/caciocavallo.zip:caciocavallo/cacio-shared-1.10-SNAPSHOT.jar:sun/awt/peer/cacio/PlatformWindowFactory.class */
public interface PlatformWindowFactory {
    sun.awt.peer.cacio.PlatformWindow createPlatformWindow(sun.awt.peer.cacio.CacioComponent r1, sun.awt.peer.cacio.PlatformWindow r2);

    sun.awt.peer.cacio.PlatformToplevelWindow createPlatformToplevelWindow(sun.awt.peer.cacio.CacioComponent r1);

    sun.awt.peer.cacio.CacioEventPump<?> createEventPump();

    sun.awt.peer.cacio.PlatformWindow createPlatformToplevelWindow(sun.awt.peer.cacio.CacioComponent r1, sun.awt.peer.cacio.PlatformWindow r2);
}
