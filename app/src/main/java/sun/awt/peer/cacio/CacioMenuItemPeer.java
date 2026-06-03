package sun.awt.peer.cacio;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/caciocavallo.zip:caciocavallo/cacio-shared-1.10-SNAPSHOT.jar:sun/awt/peer/cacio/CacioMenuItemPeer.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/caciocavallo/cacio-shared-1.10-SNAPSHOT.jar:sun/awt/peer/cacio/CacioMenuItemPeer.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/caciocavallo.zip:caciocavallo/cacio-shared-1.10-SNAPSHOT.jar:sun/awt/peer/cacio/CacioMenuItemPeer.class */
class CacioMenuItemPeer extends sun.awt.peer.cacio.CacioMenuComponentPeer<java.awt.MenuItem, javax.swing.JMenuItem> implements java.awt.peer.MenuItemPeer {

    /* JADX WARN: Classes with same name are omitted, all sources:
      DroidBridge.Launcher-v0.3.9.apk:assets/components/caciocavallo.zip:caciocavallo/cacio-shared-1.10-SNAPSHOT.jar:sun/awt/peer/cacio/CacioMenuItemPeer$1.class
      DroidBridge.Launcher-v0.3.9.apk:assets/components/caciocavallo/cacio-shared-1.10-SNAPSHOT.jar:sun/awt/peer/cacio/CacioMenuItemPeer$1.class
     */
    /* JADX INFO: renamed from: sun.awt.peer.cacio.CacioMenuItemPeer$1, reason: invalid class name */
    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/caciocavallo.zip:caciocavallo/cacio-shared-1.10-SNAPSHOT.jar:sun/awt/peer/cacio/CacioMenuItemPeer$1.class */
    static /* synthetic */ class AnonymousClass1 {
    }

    /* JADX WARN: Classes with same name are omitted, all sources:
      DroidBridge.Launcher-v0.3.9.apk:assets/components/caciocavallo.zip:caciocavallo/cacio-shared-1.10-SNAPSHOT.jar:sun/awt/peer/cacio/CacioMenuItemPeer$ProxyListener.class
      DroidBridge.Launcher-v0.3.9.apk:assets/components/caciocavallo/cacio-shared-1.10-SNAPSHOT.jar:sun/awt/peer/cacio/CacioMenuItemPeer$ProxyListener.class
     */
    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/caciocavallo.zip:caciocavallo/cacio-shared-1.10-SNAPSHOT.jar:sun/awt/peer/cacio/CacioMenuItemPeer$ProxyListener.class */
    private class ProxyListener implements java.awt.event.ActionListener {
        final /* synthetic */ sun.awt.peer.cacio.CacioMenuItemPeer this$0;

        private ProxyListener(sun.awt.peer.cacio.CacioMenuItemPeer r4) {
                r3 = this;
                r0 = r3
                r1 = r4
                r0.this$0 = r1
                r0 = r3
                r0.<init>()
                return
        }

        public void actionPerformed(java.awt.event.ActionEvent r7) {
                r6 = this;
                r0 = r6
                sun.awt.peer.cacio.CacioMenuItemPeer r0 = r0.this$0
                java.awt.MenuComponent r0 = r0.getAWTMenu()
                java.awt.MenuItem r0 = (java.awt.MenuItem) r0
                java.awt.event.ActionListener[] r0 = r0.getActionListeners()
                r8 = r0
                r0 = r8
                if (r0 == 0) goto L4d
                r0 = r8
                int r0 = r0.length
                if (r0 <= 0) goto L4d
                r0 = r6
                sun.awt.peer.cacio.CacioMenuItemPeer r0 = r0.this$0
                java.awt.MenuComponent r0 = r0.getAWTMenu()
                java.awt.MenuItem r0 = (java.awt.MenuItem) r0
                r9 = r0
                r0 = 0
                r10 = r0
            L25:
                r0 = r10
                r1 = r8
                int r1 = r1.length
                if (r0 >= r1) goto L4d
                java.awt.event.ActionEvent r0 = new java.awt.event.ActionEvent
                r1 = r0
                r2 = r9
                r3 = r10
                r4 = r7
                java.lang.String r4 = r4.getActionCommand()
                r1.<init>(r2, r3, r4)
                r11 = r0
                r0 = r8
                r1 = r10
                r0 = r0[r1]
                r1 = r11
                r0.actionPerformed(r1)
                int r10 = r10 + 1
                goto L25
            L4d:
                return
        }

        /* synthetic */ ProxyListener(sun.awt.peer.cacio.CacioMenuItemPeer r4, sun.awt.peer.cacio.CacioMenuItemPeer.AnonymousClass1 r5) {
                r3 = this;
                r0 = r3
                r1 = r4
                r0.<init>(r1)
                return
        }
    }

    CacioMenuItemPeer(java.awt.MenuItem r6) {
            r5 = this;
            r0 = r5
            r1 = r6
            javax.swing.JMenuItem r2 = new javax.swing.JMenuItem
            r3 = r2
            r3.<init>()
            r0.<init>(r1, r2)
            return
    }

    CacioMenuItemPeer(java.awt.MenuItem r5, javax.swing.JMenuItem r6) {
            r4 = this;
            r0 = r4
            r1 = r5
            r2 = r6
            r0.<init>(r1, r2)
            return
    }

    @Override // sun.awt.peer.cacio.CacioMenuComponentPeer
    void postInitSwingComponent() {
            r6 = this;
            r0 = r6
            r1 = r6
            java.awt.MenuComponent r1 = r1.getAWTMenu()
            java.awt.MenuItem r1 = (java.awt.MenuItem) r1
            java.lang.String r1 = r1.getLabel()
            r0.setLabel(r1)
            r0 = r6
            r1 = r6
            java.awt.MenuComponent r1 = r1.getAWTMenu()
            java.awt.MenuItem r1 = (java.awt.MenuItem) r1
            boolean r1 = r1.isEnabled()
            r0.setEnabled(r1)
            r0 = r6
            boolean r0 = r0.needActionProxy()
            if (r0 == 0) goto L36
            r0 = r6
            javax.swing.JComponent r0 = r0.getSwingMenu()
            javax.swing.JMenuItem r0 = (javax.swing.JMenuItem) r0
            sun.awt.peer.cacio.CacioMenuItemPeer$ProxyListener r1 = new sun.awt.peer.cacio.CacioMenuItemPeer$ProxyListener
            r2 = r1
            r3 = r6
            r4 = 0
            r2.<init>(r3, r4)
            r0.addActionListener(r1)
        L36:
            return
    }

    boolean needActionProxy() {
            r2 = this;
            r0 = 1
            return r0
    }

    public void setLabel(java.lang.String r4) {
            r3 = this;
            r0 = r3
            javax.swing.JComponent r0 = r0.getSwingMenu()
            javax.swing.JMenuItem r0 = (javax.swing.JMenuItem) r0
            r1 = r4
            r0.setText(r1)
            return
    }

    public void setEnabled(boolean r4) {
            r3 = this;
            r0 = r3
            javax.swing.JComponent r0 = r0.getSwingMenu()
            javax.swing.JMenuItem r0 = (javax.swing.JMenuItem) r0
            r1 = r4
            r0.setEnabled(r1)
            return
    }
}
