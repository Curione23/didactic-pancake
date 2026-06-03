package sun.awt.peer.cacio;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/caciocavallo.zip:caciocavallo/cacio-shared-1.10-SNAPSHOT.jar:sun/awt/peer/cacio/CacioMenuBarPeer.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/caciocavallo/cacio-shared-1.10-SNAPSHOT.jar:sun/awt/peer/cacio/CacioMenuBarPeer.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/caciocavallo.zip:caciocavallo/cacio-shared-1.10-SNAPSHOT.jar:sun/awt/peer/cacio/CacioMenuBarPeer.class */
class CacioMenuBarPeer extends sun.awt.peer.cacio.CacioMenuComponentPeer<java.awt.MenuBar, javax.swing.JMenuBar> implements java.awt.peer.MenuBarPeer {
    private java.awt.Menu helpMenu;
    static final /* synthetic */ boolean $assertionsDisabled = false;

    CacioMenuBarPeer(java.awt.MenuBar r6) {
            r5 = this;
            r0 = r5
            r1 = r6
            javax.swing.JMenuBar r2 = new javax.swing.JMenuBar
            r3 = r2
            r3.<init>()
            r0.<init>(r1, r2)
            return
    }

    @Override // sun.awt.peer.cacio.CacioMenuComponentPeer
    void postInitSwingComponent() {
            r4 = this;
            r0 = r4
            java.awt.MenuComponent r0 = r0.getAWTMenu()
            java.awt.MenuBar r0 = (java.awt.MenuBar) r0
            r5 = r0
            r0 = r5
            int r0 = r0.getMenuCount()
            r6 = r0
            r0 = 0
            r7 = r0
        Lf:
            r0 = r7
            r1 = r6
            if (r0 >= r1) goto L2a
            r0 = r5
            r1 = r7
            java.awt.Menu r0 = r0.getMenu(r1)
            r8 = r0
            r0 = r4
            r1 = r5
            r2 = r7
            java.awt.Menu r1 = r1.getMenu(r2)
            r0.addMenu(r1)
            int r7 = r7 + 1
            goto Lf
        L2a:
            r0 = r5
            java.awt.Menu r0 = r0.getHelpMenu()
            r7 = r0
            r0 = r7
            if (r0 == 0) goto L38
            r0 = r4
            r1 = r7
            r0.addHelpMenu(r1)
        L38:
            return
    }

    public void addMenu(java.awt.Menu r6) {
            r5 = this;
            r0 = r5
            javax.swing.JComponent r0 = r0.getSwingMenu()
            javax.swing.JMenuBar r0 = (javax.swing.JMenuBar) r0
            r7 = r0
            r0 = r5
            java.awt.Menu r0 = r0.helpMenu
            if (r0 == 0) goto L22
            r0 = r7
            r1 = r5
            r2 = r6
            javax.swing.JMenu r1 = r1.getSwingMenu(r2)
            r2 = r7
            int r2 = r2.getComponentCount()
            r3 = 1
            int r2 = r2 - r3
            java.awt.Component r0 = r0.add(r1, r2)
            goto L2c
        L22:
            r0 = r7
            r1 = r5
            r2 = r6
            javax.swing.JMenu r1 = r1.getSwingMenu(r2)
            javax.swing.JMenu r0 = r0.add(r1)
        L2c:
            r0 = r7
            r0.revalidate()
            return
    }

    public void addHelpMenu(java.awt.Menu r5) {
            r4 = this;
            r0 = r4
            javax.swing.JComponent r0 = r0.getSwingMenu()
            javax.swing.JMenuBar r0 = (javax.swing.JMenuBar) r0
            r6 = r0
            r0 = r4
            java.awt.Menu r0 = r0.helpMenu
            if (r0 == 0) goto L1b
            r0 = r6
            r1 = r4
            r2 = r4
            java.awt.Menu r2 = r2.helpMenu
            javax.swing.JMenu r1 = r1.getSwingMenu(r2)
            r0.remove(r1)
        L1b:
            r0 = r4
            r1 = r5
            r0.helpMenu = r1
            r0 = r6
            r1 = r4
            r2 = r5
            javax.swing.JMenu r1 = r1.getSwingMenu(r2)
            javax.swing.JMenu r0 = r0.add(r1)
            r0 = r6
            r0.revalidate()
            return
    }

    private javax.swing.JMenu getSwingMenu(java.awt.Menu r4) {
            r3 = this;
            r0 = r4
            java.awt.peer.MenuComponentPeer r0 = sun.awt.peer.cacio.GetPeer.getMenuComponent(r0)
            java.awt.peer.MenuPeer r0 = (java.awt.peer.MenuPeer) r0
            r5 = r0
            r0 = r5
            if (r0 != 0) goto L18
            r0 = r4
            r0.addNotify()
            r0 = r4
            java.awt.peer.MenuComponentPeer r0 = sun.awt.peer.cacio.GetPeer.getMenuComponent(r0)
            java.awt.peer.MenuPeer r0 = (java.awt.peer.MenuPeer) r0
            r5 = r0
        L18:
            boolean r0 = sun.awt.peer.cacio.CacioMenuBarPeer.$assertionsDisabled
            if (r0 != 0) goto L2d
            r0 = r5
            boolean r0 = r0 instanceof sun.awt.peer.cacio.CacioMenuPeer
            if (r0 != 0) goto L2d
            java.lang.AssertionError r0 = new java.lang.AssertionError
            r1 = r0
            r1.<init>()
            throw r0
        L2d:
            r0 = r5
            sun.awt.peer.cacio.CacioMenuPeer r0 = (sun.awt.peer.cacio.CacioMenuPeer) r0
            javax.swing.JComponent r0 = r0.getSwingMenu()
            javax.swing.JMenu r0 = (javax.swing.JMenu) r0
            return r0
    }

    public void delMenu(int r4) {
            r3 = this;
            r0 = r3
            javax.swing.JComponent r0 = r0.getSwingMenu()
            javax.swing.JMenuBar r0 = (javax.swing.JMenuBar) r0
            r1 = r4
            r0.remove(r1)
            return
    }

    static {
            java.lang.Class<sun.awt.peer.cacio.CacioMenuBarPeer> r0 = sun.awt.peer.cacio.CacioMenuBarPeer.class
            boolean r0 = r0.desiredAssertionStatus()
            if (r0 != 0) goto Lc
            r0 = 1
            goto Ld
        Lc:
            r0 = 0
        Ld:
            sun.awt.peer.cacio.CacioMenuBarPeer.$assertionsDisabled = r0
            return
    }
}
