package com.github.caciocavallosilano.cacio.peer;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/caciocavallo.zip:caciocavallo17/cacio-shared-1.19.1-SNAPSHOT.jar:com/github/caciocavallosilano/cacio/peer/CacioPanelPeer.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/caciocavallo17/cacio-shared-1.19.1-SNAPSHOT.jar:com/github/caciocavallosilano/cacio/peer/CacioPanelPeer.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/caciocavallo.zip:caciocavallo17/cacio-shared-1.19.1-SNAPSHOT.jar:com/github/caciocavallosilano/cacio/peer/CacioPanelPeer.class */
class CacioPanelPeer extends com.github.caciocavallosilano.cacio.peer.CacioContainerPeer<java.awt.Panel, javax.swing.JPanel> implements java.awt.peer.PanelPeer {
    public CacioPanelPeer(java.awt.Panel r5, com.github.caciocavallosilano.cacio.peer.PlatformWindowFactory r6) {
            r4 = this;
            r0 = r4
            r1 = r5
            r2 = r6
            r0.<init>(r1, r2)
            return
    }

    javax.swing.JPanel initSwingComponent() {
            r3 = this;
            javax.swing.JPanel r0 = new javax.swing.JPanel
            r1 = r0
            r1.<init>()
            return r0
    }

    @Override // com.github.caciocavallosilano.cacio.peer.CacioComponentPeer
    /* JADX INFO: renamed from: initSwingComponent */
    /* bridge */ /* synthetic */ javax.swing.JComponent mo596initSwingComponent() {
            r2 = this;
            r0 = r2
            javax.swing.JPanel r0 = r0.initSwingComponent()
            return r0
    }
}
