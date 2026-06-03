package com.github.caciocavallosilano.cacio.peer;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/caciocavallo.zip:caciocavallo17/cacio-shared-1.19.1-SNAPSHOT.jar:com/github/caciocavallosilano/cacio/peer/CacioDialogPeer.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/caciocavallo17/cacio-shared-1.19.1-SNAPSHOT.jar:com/github/caciocavallosilano/cacio/peer/CacioDialogPeer.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/caciocavallo.zip:caciocavallo17/cacio-shared-1.19.1-SNAPSHOT.jar:com/github/caciocavallosilano/cacio/peer/CacioDialogPeer.class */
class CacioDialogPeer extends com.github.caciocavallosilano.cacio.peer.CacioWindowPeer implements java.awt.peer.DialogPeer {
    public CacioDialogPeer(java.awt.Dialog r5, com.github.caciocavallosilano.cacio.peer.PlatformWindowFactory r6) {
            r4 = this;
            r0 = r4
            r1 = r5
            r2 = r6
            r0.<init>(r1, r2)
            r0 = r4
            r1 = r5
            boolean r1 = r1.isResizable()
            r0.setResizable(r1)
            r0 = r4
            r1 = r5
            java.lang.String r1 = r1.getTitle()
            r0.setTitle(r1)
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

    public void blockWindows(java.util.List<java.awt.Window> r5) {
            r4 = this;
            r0 = r5
            java.util.Iterator r0 = r0.iterator()
            r6 = r0
        L7:
            r0 = r6
            boolean r0 = r0.hasNext()
            if (r0 == 0) goto L3f
            r0 = r6
            java.lang.Object r0 = r0.next()
            java.awt.Window r0 = (java.awt.Window) r0
            r7 = r0
            sun.awt.AWTAccessor$ComponentAccessor r0 = sun.awt.AWTAccessor.getComponentAccessor()
            r1 = r7
            java.awt.peer.ComponentPeer r0 = r0.getPeer(r1)
            java.awt.peer.WindowPeer r0 = (java.awt.peer.WindowPeer) r0
            r8 = r0
            r0 = r8
            if (r0 == 0) goto L3c
            r0 = r8
            r1 = r4
            java.awt.Component r1 = r1.getAWTComponent()
            java.awt.Dialog r1 = (java.awt.Dialog) r1
            r2 = 1
            r0.setModalBlocked(r1, r2)
        L3c:
            goto L7
        L3f:
            return
    }

    @Override // com.github.caciocavallosilano.cacio.peer.CacioWindowPeer
    protected int getRootPaneDecorationStyle() {
            r2 = this;
            boolean r0 = isDecorateDialogs()
            if (r0 == 0) goto L13
            r0 = r2
            java.awt.Component r0 = r0.getAWTComponent()
            java.awt.Dialog r0 = (java.awt.Dialog) r0
            boolean r0 = r0.isUndecorated()
            if (r0 == 0) goto L15
        L13:
            r0 = 0
            return r0
        L15:
            r0 = 2
            return r0
    }
}
