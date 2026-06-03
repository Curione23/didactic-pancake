package com.github.caciocavallosilano.cacio.peer;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/caciocavallo.zip:caciocavallo17/cacio-shared-1.19.1-SNAPSHOT.jar:com/github/caciocavallosilano/cacio/peer/CacioMenuPeer.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/caciocavallo17/cacio-shared-1.19.1-SNAPSHOT.jar:com/github/caciocavallosilano/cacio/peer/CacioMenuPeer.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/caciocavallo.zip:caciocavallo17/cacio-shared-1.19.1-SNAPSHOT.jar:com/github/caciocavallosilano/cacio/peer/CacioMenuPeer.class */
class CacioMenuPeer extends com.github.caciocavallosilano.cacio.peer.CacioMenuItemPeer implements java.awt.peer.MenuPeer {
    static final /* synthetic */ boolean $assertionsDisabled = false;

    CacioMenuPeer(java.awt.Menu r6) {
            r5 = this;
            r0 = r5
            r1 = r6
            javax.swing.JMenu r2 = new javax.swing.JMenu
            r3 = r2
            r3.<init>()
            r0.<init>(r1, r2)
            return
    }

    @Override // com.github.caciocavallosilano.cacio.peer.CacioMenuItemPeer, com.github.caciocavallosilano.cacio.peer.CacioMenuComponentPeer
    void postInitSwingComponent() {
            r4 = this;
            r0 = r4
            super.postInitSwingComponent()
            r0 = r4
            java.awt.MenuComponent r0 = r0.getAWTMenu()
            java.awt.Menu r0 = (java.awt.Menu) r0
            r5 = r0
            r0 = r5
            int r0 = r0.getItemCount()
            r6 = r0
            r0 = 0
            r7 = r0
        L13:
            r0 = r7
            r1 = r6
            if (r0 >= r1) goto L27
            r0 = r4
            r1 = r5
            r2 = r7
            java.awt.MenuItem r1 = r1.getItem(r2)
            r0.addItem(r1)
            int r7 = r7 + 1
            goto L13
        L27:
            return
    }

    @Override // com.github.caciocavallosilano.cacio.peer.CacioMenuItemPeer
    boolean needActionProxy() {
            r2 = this;
            r0 = 0
            return r0
    }

    public void addSeparator() {
            r4 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r1 = r0
            java.lang.String r2 = "Not supported yet."
            r1.<init>(r2)
            throw r0
    }

    public void addItem(java.awt.MenuItem r4) {
            r3 = this;
            r0 = r4
            java.awt.peer.MenuComponentPeer r0 = com.github.caciocavallosilano.cacio.peer.CacioComponentPeer.getPeer(r0)
            java.awt.peer.MenuItemPeer r0 = (java.awt.peer.MenuItemPeer) r0
            r5 = r0
            r0 = r5
            if (r0 != 0) goto L18
            r0 = r4
            r0.addNotify()
            r0 = r4
            java.awt.peer.MenuComponentPeer r0 = com.github.caciocavallosilano.cacio.peer.CacioComponentPeer.getPeer(r0)
            java.awt.peer.MenuItemPeer r0 = (java.awt.peer.MenuItemPeer) r0
            r5 = r0
        L18:
            boolean r0 = com.github.caciocavallosilano.cacio.peer.CacioMenuPeer.$assertionsDisabled
            if (r0 != 0) goto L2d
            r0 = r5
            boolean r0 = r0 instanceof com.github.caciocavallosilano.cacio.peer.CacioMenuItemPeer
            if (r0 != 0) goto L2d
            java.lang.AssertionError r0 = new java.lang.AssertionError
            r1 = r0
            r1.<init>()
            throw r0
        L2d:
            r0 = r5
            com.github.caciocavallosilano.cacio.peer.CacioMenuItemPeer r0 = (com.github.caciocavallosilano.cacio.peer.CacioMenuItemPeer) r0
            javax.swing.JComponent r0 = r0.getSwingMenu()
            javax.swing.JMenuItem r0 = (javax.swing.JMenuItem) r0
            r6 = r0
            r0 = r3
            javax.swing.JComponent r0 = r0.getSwingMenu()
            javax.swing.JMenuItem r0 = (javax.swing.JMenuItem) r0
            r1 = r6
            java.awt.Component r0 = r0.add(r1)
            return
    }

    public void delItem(int r4) {
            r3 = this;
            r0 = r3
            javax.swing.JComponent r0 = r0.getSwingMenu()
            javax.swing.JMenuItem r0 = (javax.swing.JMenuItem) r0
            r1 = r4
            r0.remove(r1)
            return
    }

    static {
            java.lang.Class<com.github.caciocavallosilano.cacio.peer.CacioMenuPeer> r0 = com.github.caciocavallosilano.cacio.peer.CacioMenuPeer.class
            boolean r0 = r0.desiredAssertionStatus()
            if (r0 != 0) goto Lc
            r0 = 1
            goto Ld
        Lc:
            r0 = 0
        Ld:
            com.github.caciocavallosilano.cacio.peer.CacioMenuPeer.$assertionsDisabled = r0
            return
    }
}
