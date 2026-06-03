package com.github.caciocavallosilano.cacio.peer;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/caciocavallo.zip:caciocavallo17/cacio-shared-1.19.1-SNAPSHOT.jar:com/github/caciocavallosilano/cacio/peer/CacioKeyboardFocusManagerPeer.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/caciocavallo17/cacio-shared-1.19.1-SNAPSHOT.jar:com/github/caciocavallosilano/cacio/peer/CacioKeyboardFocusManagerPeer.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/caciocavallo.zip:caciocavallo17/cacio-shared-1.19.1-SNAPSHOT.jar:com/github/caciocavallosilano/cacio/peer/CacioKeyboardFocusManagerPeer.class */
class CacioKeyboardFocusManagerPeer implements java.awt.peer.KeyboardFocusManagerPeer {
    private static com.github.caciocavallosilano.cacio.peer.CacioKeyboardFocusManagerPeer instance;
    private java.awt.Window currentFocusedWindow;
    private java.awt.Component currentFocusOwner;

    static com.github.caciocavallosilano.cacio.peer.CacioKeyboardFocusManagerPeer getInstance() {
            com.github.caciocavallosilano.cacio.peer.CacioKeyboardFocusManagerPeer r0 = com.github.caciocavallosilano.cacio.peer.CacioKeyboardFocusManagerPeer.instance
            if (r0 != 0) goto L10
            com.github.caciocavallosilano.cacio.peer.CacioKeyboardFocusManagerPeer r0 = new com.github.caciocavallosilano.cacio.peer.CacioKeyboardFocusManagerPeer
            r1 = r0
            r1.<init>()
            com.github.caciocavallosilano.cacio.peer.CacioKeyboardFocusManagerPeer.instance = r0
        L10:
            com.github.caciocavallosilano.cacio.peer.CacioKeyboardFocusManagerPeer r0 = com.github.caciocavallosilano.cacio.peer.CacioKeyboardFocusManagerPeer.instance
            return r0
    }

    private CacioKeyboardFocusManagerPeer() {
            r2 = this;
            r0 = r2
            r0.<init>()
            return
    }

    public java.awt.Window getCurrentFocusedWindow() {
            r2 = this;
            r0 = r2
            java.awt.Window r0 = r0.currentFocusedWindow
            return r0
    }

    public void setCurrentFocusOwner(java.awt.Component r4) {
            r3 = this;
            r0 = r3
            r1 = r4
            r0.currentFocusOwner = r1
            return
    }

    public java.awt.Component getCurrentFocusOwner() {
            r2 = this;
            r0 = r2
            java.awt.Component r0 = r0.currentFocusOwner
            return r0
    }

    public void clearGlobalFocusOwner(java.awt.Window r2) {
            r1 = this;
            return
    }

    public void setCurrentFocusedWindow(java.awt.Window r4) {
            r3 = this;
            r0 = r3
            r1 = r4
            r0.currentFocusedWindow = r1
            return
    }

    boolean requestFocus(java.awt.Component r9, java.awt.Component r10, boolean r11, boolean r12, long r13, java.awt.event.FocusEvent.Cause r15) {
            r8 = this;
            r0 = r10
            if (r0 != 0) goto L6
            r0 = r9
            r10 = r0
        L6:
            r0 = r8
            java.awt.Component r0 = r0.getCurrentFocusOwner()
            r16 = r0
            r0 = r16
            if (r0 == 0) goto L1c
            r0 = r16
            java.awt.peer.ComponentPeer r0 = com.github.caciocavallosilano.cacio.peer.CacioComponentPeer.getPeer(r0)
            if (r0 != 0) goto L1c
            r0 = 0
            r16 = r0
        L1c:
            java.awt.event.FocusEvent r0 = new java.awt.event.FocusEvent
            r1 = r0
            r2 = r10
            r3 = 1004(0x3ec, float:1.407E-42)
            r4 = 0
            r5 = r16
            r6 = r15
            r1.<init>(r2, r3, r4, r5, r6)
            r17 = r0
            r0 = 0
            r18 = r0
            r0 = r16
            if (r0 == 0) goto L48
            java.awt.event.FocusEvent r0 = new java.awt.event.FocusEvent
            r1 = r0
            r2 = r16
            r3 = 1005(0x3ed, float:1.408E-42)
            r4 = 0
            r5 = r10
            r6 = r15
            r1.<init>(r2, r3, r4, r5, r6)
            r18 = r0
        L48:
            r0 = r18
            if (r0 == 0) goto L53
            r0 = r8
            r1 = r18
            r0.postEvent(r1)
        L53:
            r0 = r8
            r1 = r17
            r0.postEvent(r1)
            r0 = 1
            return r0
    }

    private void postEvent(java.awt.AWTEvent r4) {
            r3 = this;
            sun.awt.AppContext r0 = sun.awt.AppContext.getAppContext()
            r1 = r4
            sun.awt.SunToolkit.postEvent(r0, r1)
            return
    }
}
