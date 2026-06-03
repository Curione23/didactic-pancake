package sun.awt.peer.cacio;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/caciocavallo.zip:caciocavallo/cacio-shared-1.10-SNAPSHOT.jar:sun/awt/peer/cacio/CacioFramePeer.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/caciocavallo/cacio-shared-1.10-SNAPSHOT.jar:sun/awt/peer/cacio/CacioFramePeer.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/caciocavallo.zip:caciocavallo/cacio-shared-1.10-SNAPSHOT.jar:sun/awt/peer/cacio/CacioFramePeer.class */
class CacioFramePeer extends sun.awt.peer.cacio.CacioWindowPeer implements java.awt.peer.FramePeer {
    private java.awt.Rectangle mBoundsPrivate;
    static final /* synthetic */ boolean $assertionsDisabled = false;

    public CacioFramePeer(java.awt.Frame r5, sun.awt.peer.cacio.PlatformWindowFactory r6) {
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
            sun.awt.peer.cacio.PlatformToplevelWindow r0 = r0.getToplevelWindow()
            int r0 = r0.getState()
            return r0
    }

    public void setState(int r4) {
            r3 = this;
            r0 = r3
            sun.awt.peer.cacio.PlatformToplevelWindow r0 = r0.getToplevelWindow()
            r1 = r4
            r0.setState(r1)
            return
    }

    public void setMaximizedBounds(java.awt.Rectangle r4) {
            r3 = this;
            r0 = r3
            sun.awt.peer.cacio.PlatformToplevelWindow r0 = r0.getToplevelWindow()
            r1 = r4
            r0.setMaximizedBounds(r1)
            return
    }

    public void setMenuBar(java.awt.MenuBar r4) {
            r3 = this;
            r0 = r4
            java.awt.peer.MenuComponentPeer r0 = sun.awt.peer.cacio.GetPeer.getMenuComponent(r0)
            java.awt.peer.MenuBarPeer r0 = (java.awt.peer.MenuBarPeer) r0
            r5 = r0
            r0 = r5
            if (r0 != 0) goto L18
            r0 = r4
            r0.addNotify()
            r0 = r4
            java.awt.peer.MenuComponentPeer r0 = sun.awt.peer.cacio.GetPeer.getMenuComponent(r0)
            java.awt.peer.MenuBarPeer r0 = (java.awt.peer.MenuBarPeer) r0
            r5 = r0
        L18:
            boolean r0 = sun.awt.peer.cacio.CacioFramePeer.$assertionsDisabled
            if (r0 != 0) goto L2d
            r0 = r5
            boolean r0 = r0 instanceof sun.awt.peer.cacio.CacioMenuBarPeer
            if (r0 != 0) goto L2d
            java.lang.AssertionError r0 = new java.lang.AssertionError
            r1 = r0
            r1.<init>()
            throw r0
        L2d:
            r0 = r5
            sun.awt.peer.cacio.CacioMenuBarPeer r0 = (sun.awt.peer.cacio.CacioMenuBarPeer) r0
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
            sun.awt.peer.cacio.PlatformToplevelWindow r0 = r0.getToplevelWindow()
            r1 = r4
            r0.setResizable(r1)
            return
    }

    public void setTitle(java.lang.String r4) {
            r3 = this;
            r0 = r3
            sun.awt.peer.cacio.PlatformToplevelWindow r0 = r0.getToplevelWindow()
            r1 = r4
            r0.setTitle(r1)
            return
    }

    public java.awt.Rectangle getBoundsPrivate() {
            r2 = this;
            r0 = r2
            java.awt.Rectangle r0 = r0.mBoundsPrivate
            return r0
    }

    public void setBoundsPrivate(int r9, int r10, int r11, int r12) {
            r8 = this;
            r0 = r8
            java.awt.Rectangle r1 = new java.awt.Rectangle
            r2 = r1
            r3 = r9
            r4 = r10
            r5 = r11
            r6 = r12
            r2.<init>(r3, r4, r5, r6)
            r0.mBoundsPrivate = r1
            return
    }

    @Override // sun.awt.peer.cacio.CacioWindowPeer
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

    @Override // sun.awt.peer.cacio.CacioWindowPeer
    public void updateAlwaysOnTopState() {
            r1 = this;
            return
    }

    public void emulateActivation(boolean r2) {
            r1 = this;
            return
    }

    static {
            java.lang.Class<sun.awt.peer.cacio.CacioFramePeer> r0 = sun.awt.peer.cacio.CacioFramePeer.class
            boolean r0 = r0.desiredAssertionStatus()
            if (r0 != 0) goto Lc
            r0 = 1
            goto Ld
        Lc:
            r0 = 0
        Ld:
            sun.awt.peer.cacio.CacioFramePeer.$assertionsDisabled = r0
            return
    }
}
