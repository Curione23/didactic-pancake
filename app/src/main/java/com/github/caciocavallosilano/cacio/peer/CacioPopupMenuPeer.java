package com.github.caciocavallosilano.cacio.peer;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/caciocavallo.zip:caciocavallo17/cacio-shared-1.19.1-SNAPSHOT.jar:com/github/caciocavallosilano/cacio/peer/CacioPopupMenuPeer.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/caciocavallo17/cacio-shared-1.19.1-SNAPSHOT.jar:com/github/caciocavallosilano/cacio/peer/CacioPopupMenuPeer.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/caciocavallo.zip:caciocavallo17/cacio-shared-1.19.1-SNAPSHOT.jar:com/github/caciocavallosilano/cacio/peer/CacioPopupMenuPeer.class */
class CacioPopupMenuPeer extends com.github.caciocavallosilano.cacio.peer.CacioMenuPeer implements java.awt.peer.PopupMenuPeer {
    CacioPopupMenuPeer(java.awt.PopupMenu r4) {
            r3 = this;
            r0 = r3
            r1 = r4
            r0.<init>(r1)
            return
    }

    public void show(java.awt.Event r5) {
            r4 = this;
            r0 = r4
            javax.swing.JComponent r0 = r0.getSwingMenu()
            javax.swing.JMenu r0 = (javax.swing.JMenu) r0
            r6 = r0
            r0 = r6
            javax.swing.JPopupMenu r0 = r0.getPopupMenu()
            r7 = r0
            r0 = r7
            java.awt.Dimension r0 = r0.getPreferredSize()
            r8 = r0
            r0 = r7
            r1 = r5
            int r1 = r1.x
            r2 = r5
            int r2 = r2.y
            r0.setLocation(r1, r2)
            r0 = r7
            r1 = r8
            int r1 = r1.width
            r2 = r8
            int r2 = r2.height
            r0.setSize(r1, r2)
            r0 = r7
            r1 = 1
            r0.setVisible(r1)
            return
    }
}
