package sun.awt.peer.cacio;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/caciocavallo.zip:caciocavallo/cacio-shared-1.10-SNAPSHOT.jar:sun/awt/peer/cacio/CacioCheckboxMenuItemPeer.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/caciocavallo/cacio-shared-1.10-SNAPSHOT.jar:sun/awt/peer/cacio/CacioCheckboxMenuItemPeer.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/caciocavallo.zip:caciocavallo/cacio-shared-1.10-SNAPSHOT.jar:sun/awt/peer/cacio/CacioCheckboxMenuItemPeer.class */
class CacioCheckboxMenuItemPeer extends sun.awt.peer.cacio.CacioMenuItemPeer implements java.awt.peer.CheckboxMenuItemPeer {

    /* JADX WARN: Classes with same name are omitted, all sources:
      DroidBridge.Launcher-v0.3.9.apk:assets/components/caciocavallo.zip:caciocavallo/cacio-shared-1.10-SNAPSHOT.jar:sun/awt/peer/cacio/CacioCheckboxMenuItemPeer$1.class
      DroidBridge.Launcher-v0.3.9.apk:assets/components/caciocavallo/cacio-shared-1.10-SNAPSHOT.jar:sun/awt/peer/cacio/CacioCheckboxMenuItemPeer$1.class
     */
    /* JADX INFO: renamed from: sun.awt.peer.cacio.CacioCheckboxMenuItemPeer$1, reason: invalid class name */
    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/caciocavallo.zip:caciocavallo/cacio-shared-1.10-SNAPSHOT.jar:sun/awt/peer/cacio/CacioCheckboxMenuItemPeer$1.class */
    static /* synthetic */ class AnonymousClass1 {
    }

    /* JADX WARN: Classes with same name are omitted, all sources:
      DroidBridge.Launcher-v0.3.9.apk:assets/components/caciocavallo.zip:caciocavallo/cacio-shared-1.10-SNAPSHOT.jar:sun/awt/peer/cacio/CacioCheckboxMenuItemPeer$ProxyListener.class
      DroidBridge.Launcher-v0.3.9.apk:assets/components/caciocavallo/cacio-shared-1.10-SNAPSHOT.jar:sun/awt/peer/cacio/CacioCheckboxMenuItemPeer$ProxyListener.class
     */
    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/caciocavallo.zip:caciocavallo/cacio-shared-1.10-SNAPSHOT.jar:sun/awt/peer/cacio/CacioCheckboxMenuItemPeer$ProxyListener.class */
    private class ProxyListener implements java.awt.event.ItemListener {
        final /* synthetic */ sun.awt.peer.cacio.CacioCheckboxMenuItemPeer this$0;

        private ProxyListener(sun.awt.peer.cacio.CacioCheckboxMenuItemPeer r4) {
                r3 = this;
                r0 = r3
                r1 = r4
                r0.this$0 = r1
                r0 = r3
                r0.<init>()
                return
        }

        public void itemStateChanged(java.awt.event.ItemEvent r8) {
                r7 = this;
                r0 = r7
                sun.awt.peer.cacio.CacioCheckboxMenuItemPeer r0 = r0.this$0
                java.awt.MenuComponent r0 = r0.getAWTMenu()
                java.awt.CheckboxMenuItem r0 = (java.awt.CheckboxMenuItem) r0
                r1 = r8
                int r1 = r1.getStateChange()
                r2 = 1
                if (r1 != r2) goto L16
                r1 = 1
                goto L17
            L16:
                r1 = 0
            L17:
                r0.setState(r1)
                r0 = r7
                sun.awt.peer.cacio.CacioCheckboxMenuItemPeer r0 = r0.this$0
                java.awt.MenuComponent r0 = r0.getAWTMenu()
                java.awt.CheckboxMenuItem r0 = (java.awt.CheckboxMenuItem) r0
                r9 = r0
                r0 = r9
                java.awt.event.ItemListener[] r0 = r0.getItemListeners()
                r10 = r0
                r0 = r10
                if (r0 == 0) goto L61
                r0 = r10
                int r0 = r0.length
                if (r0 <= 0) goto L61
                r0 = 0
                r11 = r0
            L36:
                r0 = r11
                r1 = r10
                int r1 = r1.length
                if (r0 >= r1) goto L61
                java.awt.event.ItemEvent r0 = new java.awt.event.ItemEvent
                r1 = r0
                r2 = r9
                r3 = r8
                int r3 = r3.getID()
                r4 = r9
                r5 = r8
                int r5 = r5.getStateChange()
                r1.<init>(r2, r3, r4, r5)
                r12 = r0
                r0 = r10
                r1 = r11
                r0 = r0[r1]
                r1 = r12
                r0.itemStateChanged(r1)
                int r11 = r11 + 1
                goto L36
            L61:
                return
        }

        /* synthetic */ ProxyListener(sun.awt.peer.cacio.CacioCheckboxMenuItemPeer r4, sun.awt.peer.cacio.CacioCheckboxMenuItemPeer.AnonymousClass1 r5) {
                r3 = this;
                r0 = r3
                r1 = r4
                r0.<init>(r1)
                return
        }
    }

    CacioCheckboxMenuItemPeer(java.awt.MenuItem r6) {
            r5 = this;
            r0 = r5
            r1 = r6
            javax.swing.JCheckBoxMenuItem r2 = new javax.swing.JCheckBoxMenuItem
            r3 = r2
            r3.<init>()
            r0.<init>(r1, r2)
            return
    }

    @Override // sun.awt.peer.cacio.CacioMenuItemPeer, sun.awt.peer.cacio.CacioMenuComponentPeer
    void postInitSwingComponent() {
            r5 = this;
            r0 = r5
            super.postInitSwingComponent()
            r0 = r5
            r1 = r5
            java.awt.MenuComponent r1 = r1.getAWTMenu()
            java.awt.CheckboxMenuItem r1 = (java.awt.CheckboxMenuItem) r1
            boolean r1 = r1.getState()
            r0.setState(r1)
            sun.awt.peer.cacio.CacioCheckboxMenuItemPeer$ProxyListener r0 = new sun.awt.peer.cacio.CacioCheckboxMenuItemPeer$ProxyListener
            r1 = r0
            r2 = r5
            r3 = 0
            r1.<init>(r2, r3)
            r6 = r0
            r0 = r5
            javax.swing.JComponent r0 = r0.getSwingMenu()
            javax.swing.JMenuItem r0 = (javax.swing.JMenuItem) r0
            r1 = r6
            r0.addItemListener(r1)
            return
    }

    @Override // sun.awt.peer.cacio.CacioMenuItemPeer
    boolean needActionProxy() {
            r2 = this;
            r0 = 0
            return r0
    }

    public void setState(boolean r4) {
            r3 = this;
            r0 = r3
            javax.swing.JComponent r0 = r0.getSwingMenu()
            javax.swing.JCheckBoxMenuItem r0 = (javax.swing.JCheckBoxMenuItem) r0
            r1 = r4
            r0.setState(r1)
            return
    }
}
