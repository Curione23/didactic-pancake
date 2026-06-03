package sun.awt.peer.cacio;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/caciocavallo.zip:caciocavallo/cacio-shared-1.10-SNAPSHOT.jar:sun/awt/peer/cacio/GetPeer.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/caciocavallo/cacio-shared-1.10-SNAPSHOT.jar:sun/awt/peer/cacio/GetPeer.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/caciocavallo.zip:caciocavallo/cacio-shared-1.10-SNAPSHOT.jar:sun/awt/peer/cacio/GetPeer.class */
class GetPeer {
    GetPeer() {
            r2 = this;
            r0 = r2
            r0.<init>()
            return
    }

    static java.awt.peer.ComponentPeer getComponent(java.awt.Component r3) {
            sun.awt.AWTAccessor$ComponentAccessor r0 = sun.awt.AWTAccessor.getComponentAccessor()
            r1 = r3
            java.awt.peer.ComponentPeer r0 = r0.getPeer(r1)
            return r0
    }

    static java.awt.peer.MenuComponentPeer getMenuComponent(java.awt.MenuComponent r3) {
            sun.awt.AWTAccessor$MenuComponentAccessor r0 = sun.awt.AWTAccessor.getMenuComponentAccessor()
            r1 = r3
            java.awt.peer.MenuComponentPeer r0 = r0.getPeer(r1)
            return r0
    }
}
