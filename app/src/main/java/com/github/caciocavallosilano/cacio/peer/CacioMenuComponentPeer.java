package com.github.caciocavallosilano.cacio.peer;

import java.awt.MenuComponent;
import javax.swing.JComponent;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/caciocavallo.zip:caciocavallo17/cacio-shared-1.19.1-SNAPSHOT.jar:com/github/caciocavallosilano/cacio/peer/CacioMenuComponentPeer.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/caciocavallo17/cacio-shared-1.19.1-SNAPSHOT.jar:com/github/caciocavallosilano/cacio/peer/CacioMenuComponentPeer.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/caciocavallo.zip:caciocavallo17/cacio-shared-1.19.1-SNAPSHOT.jar:com/github/caciocavallosilano/cacio/peer/CacioMenuComponentPeer.class */
class CacioMenuComponentPeer<AWTMenuComponentType extends java.awt.MenuComponent, SwingMenuComponentType extends javax.swing.JComponent> implements java.awt.peer.MenuComponentPeer {
    private AWTMenuComponentType awtMenu;
    private SwingMenuComponentType swingMenu;

    CacioMenuComponentPeer(AWTMenuComponentType r4, SwingMenuComponentType r5) {
            r3 = this;
            r0 = r3
            r0.<init>()
            r0 = r3
            r1 = r4
            r0.awtMenu = r1
            r0 = r3
            r1 = r5
            r0.swingMenu = r1
            r0 = r3
            r0.postInitSwingComponent()
            return
    }

    void postInitSwingComponent() {
            r1 = this;
            return
    }

    public void dispose() {
            r1 = this;
            return
    }

    public void setFont(java.awt.Font r4) {
            r3 = this;
            r0 = r3
            SwingMenuComponentType extends javax.swing.JComponent r0 = r0.swingMenu
            r1 = r4
            r0.setFont(r1)
            return
    }

    AWTMenuComponentType getAWTMenu() {
            r2 = this;
            r0 = r2
            AWTMenuComponentType extends java.awt.MenuComponent r0 = r0.awtMenu
            return r0
    }

    SwingMenuComponentType getSwingMenu() {
            r2 = this;
            r0 = r2
            SwingMenuComponentType extends javax.swing.JComponent r0 = r0.swingMenu
            return r0
    }
}
