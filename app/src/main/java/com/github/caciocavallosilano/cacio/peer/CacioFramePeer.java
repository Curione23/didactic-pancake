package com.github.caciocavallosilano.cacio.peer;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/caciocavallo.zip:caciocavallo17/cacio-shared-1.19.1-SNAPSHOT.jar:com/github/caciocavallosilano/cacio/peer/CacioFramePeer.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/caciocavallo17/cacio-shared-1.19.1-SNAPSHOT.jar:com/github/caciocavallosilano/cacio/peer/CacioFramePeer.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/caciocavallo.zip:caciocavallo17/cacio-shared-1.19.1-SNAPSHOT.jar:com/github/caciocavallosilano/cacio/peer/CacioFramePeer.class */
class CacioFramePeer extends com.github.caciocavallosilano.cacio.peer.CacioWindowPeer implements java.awt.peer.FramePeer {
    static final /* synthetic */ boolean $assertionsDisabled = false;

    public CacioFramePeer(java.awt.Frame r5, com.github.caciocavallosilano.cacio.peer.PlatformWindowFactory r6) {
            r4 = this;
            r0 = r4
            r1 = r5
            r2 = r6
            r0.<init>(r1, r2)
            return
    }

    public int getState() {
            r2 = this;
            r0 = r2
            com.github.caciocavallosilano.cacio.peer.PlatformToplevelWindow r0 = r0.getToplevelWindow()
            int r0 = r0.getState()
            return r0
    }

    public void setState(int r4) {
            r3 = this;
            r0 = r3
            com.github.caciocavallosilano.cacio.peer.PlatformToplevelWindow r0 = r0.getToplevelWindow()
            r1 = r4
            r0.setState(r1)
            return
    }

    public void setMaximizedBounds(java.awt.Rectangle r4) {
            r3 = this;
            r0 = r3
            com.github.caciocavallosilano.cacio.peer.PlatformToplevelWindow r0 = r0.getToplevelWindow()
            r1 = r4
            r0.setMaximizedBounds(r1)
            return
    }

    public void setMenuBar(java.awt.MenuBar r4) {
            r3 = this;
            r0 = r4
            java.awt.peer.MenuComponentPeer r0 = com.github.caciocavallosilano.cacio.peer.CacioComponentPeer.getPeer(r0)
            java.awt.peer.MenuBarPeer r0 = (java.awt.peer.MenuBarPeer) r0
            r5 = r0
            r0 = r5
            if (r0 != 0) goto L18
            r0 = r4
            r0.addNotify()
            r0 = r4
            java.awt.peer.MenuComponentPeer r0 = com.github.caciocavallosilano.cacio.peer.CacioComponentPeer.getPeer(r0)
            java.awt.peer.MenuBarPeer r0 = (java.awt.peer.MenuBarPeer) r0
            r5 = r0
        L18:
            boolean r0 = com.github.caciocavallosilano.cacio.peer.CacioFramePeer.$assertionsDisabled
            if (r0 != 0) goto L2d
            r0 = r5
            boolean r0 = r0 instanceof com.github.caciocavallosilano.cacio.peer.CacioMenuBarPeer
            if (r0 != 0) goto L2d
            java.lang.AssertionError r0 = new java.lang.AssertionError
            r1 = r0
            r1.<init>()
            throw r0
        L2d:
            r0 = r5
            com.github.caciocavallosilano.cacio.peer.CacioMenuBarPeer r0 = (com.github.caciocavallosilano.cacio.peer.CacioMenuBarPeer) r0
            javax.swing.JComponent r0 = r0.getSwingMenu()
            javax.swing.JMenuBar r0 = (javax.swing.JMenuBar) r0
            r6 = r0
            r0 = r3
            javax.swing.JComponent r0 = r0.getSwingComponent()
            javax.swing.JRootPane r0 = (javax.swing.JRootPane) r0
            r7 = r0
            r0 = r7
            r1 = r6
            r0.setJMenuBar(r1)
            return
    }

    public void setResizable(boolean r4) {
            r3 = this;
            r0 = r3
            com.github.caciocavallosilano.cacio.peer.PlatformToplevelWindow r0 = r0.getToplevelWindow()
            r1 = r4
            r0.setResizable(r1)
            return
    }

    public void setTitle(java.lang.String r4) {
            r3 = this;
            r0 = r3
            com.github.caciocavallosilano.cacio.peer.PlatformToplevelWindow r0 = r0.getToplevelWindow()
            r1 = r4
            r0.setTitle(r1)
            return
    }

    public java.awt.Rectangle getBoundsPrivate() {
            r3 = this;
            java.io.PrintStream r0 = java.lang.System.out
            java.lang.String r1 = "IMPLEMENT ME: CacioFramePeer.getBoundsPrivate"
            r0.println(r1)
            r0 = 0
            return r0
    }

    public void setBoundsPrivate(int r4, int r5, int r6, int r7) {
            r3 = this;
            java.io.PrintStream r0 = java.lang.System.out
            java.lang.String r1 = "IMPLEMENT ME: CacioFramePeer.setBoundsPrivate"
            r0.println(r1)
            return
    }

    @Override // com.github.caciocavallosilano.cacio.peer.CacioWindowPeer
    protected int getRootPaneDecorationStyle() {
            r2 = this;
            boolean r0 = isDecorateWindows()
            if (r0 == 0) goto L13
            r0 = r2
            java.awt.Component r0 = r0.getAWTComponent()
            java.awt.Frame r0 = (java.awt.Frame) r0
            boolean r0 = r0.isUndecorated()
            if (r0 == 0) goto L15
        L13:
            r0 = 0
            return r0
        L15:
            r0 = 1
            return r0
    }

    public void emulateActivation(boolean r2) {
            r1 = this;
            return
    }

    static {
            java.lang.Class<com.github.caciocavallosilano.cacio.peer.CacioFramePeer> r0 = com.github.caciocavallosilano.cacio.peer.CacioFramePeer.class
            boolean r0 = r0.desiredAssertionStatus()
            if (r0 != 0) goto Lc
            r0 = 1
            goto Ld
        Lc:
            r0 = 0
        Ld:
            com.github.caciocavallosilano.cacio.peer.CacioFramePeer.$assertionsDisabled = r0
            return
    }
}
