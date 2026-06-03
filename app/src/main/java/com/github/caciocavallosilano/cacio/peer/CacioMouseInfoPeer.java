package com.github.caciocavallosilano.cacio.peer;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/caciocavallo.zip:caciocavallo17/cacio-shared-1.19.1-SNAPSHOT.jar:com/github/caciocavallosilano/cacio/peer/CacioMouseInfoPeer.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/caciocavallo17/cacio-shared-1.19.1-SNAPSHOT.jar:com/github/caciocavallosilano/cacio/peer/CacioMouseInfoPeer.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/caciocavallo.zip:caciocavallo17/cacio-shared-1.19.1-SNAPSHOT.jar:com/github/caciocavallosilano/cacio/peer/CacioMouseInfoPeer.class */
public class CacioMouseInfoPeer implements java.awt.peer.MouseInfoPeer {
    private static com.github.caciocavallosilano.cacio.peer.CacioMouseInfoPeer instance;
    private int x;
    private int y;

    public CacioMouseInfoPeer() {
            r2 = this;
            r0 = r2
            r0.<init>()
            return
    }

    public static com.github.caciocavallosilano.cacio.peer.CacioMouseInfoPeer getInstance() {
            com.github.caciocavallosilano.cacio.peer.CacioMouseInfoPeer r0 = com.github.caciocavallosilano.cacio.peer.CacioMouseInfoPeer.instance
            return r0
    }

    public int fillPointWithCoords(java.awt.Point r4) {
            r3 = this;
            r0 = r4
            r1 = r3
            int r1 = r1.x
            r0.x = r1
            r0 = r4
            r1 = r3
            int r1 = r1.y
            r0.y = r1
            r0 = 0
            return r0
    }

    public void setMouseScreenCoordinates(int r4, int r5) {
            r3 = this;
            r0 = r3
            r1 = r4
            r0.x = r1
            r0 = r3
            r1 = r5
            r0.y = r1
            return
    }

    public boolean isWindowUnderMouse(java.awt.Window r4) {
            r3 = this;
            java.awt.Window[] r0 = java.awt.Window.getWindows()
            r5 = r0
            r0 = 0
            r6 = r0
            r0 = r5
            r7 = r0
            r0 = r7
            int r0 = r0.length
            r8 = r0
            r0 = 0
            r9 = r0
        L11:
            r0 = r9
            r1 = r8
            if (r0 >= r1) goto L3b
            r0 = r7
            r1 = r9
            r0 = r0[r1]
            r10 = r0
            r0 = r10
            boolean r0 = r0.isVisible()
            if (r0 == 0) goto L35
            r0 = r3
            r1 = r4
            boolean r0 = r0.isMouseInWindowRegion(r1)
            if (r0 == 0) goto L35
            r0 = r10
            r6 = r0
            goto L3b
        L35:
            int r9 = r9 + 1
            goto L11
        L3b:
            r0 = r6
            r1 = r4
            if (r0 != r1) goto L44
            r0 = 1
            goto L45
        L44:
            r0 = 0
        L45:
            return r0
    }

    private boolean isMouseInWindowRegion(java.awt.Window r5) {
            r4 = this;
            r0 = r5
            java.awt.Point r0 = r0.getLocationOnScreen()
            r6 = r0
            r0 = r5
            java.awt.Dimension r0 = r0.getSize()
            r7 = r0
            r0 = r6
            int r0 = r0.x
            r1 = r4
            int r1 = r1.x
            if (r0 > r1) goto L44
            r0 = r4
            int r0 = r0.x
            r1 = r6
            int r1 = r1.x
            r2 = r7
            int r2 = r2.width
            int r1 = r1 + r2
            if (r0 >= r1) goto L44
            r0 = r6
            int r0 = r0.y
            r1 = r4
            int r1 = r1.y
            if (r0 > r1) goto L44
            r0 = r4
            int r0 = r0.y
            r1 = r6
            int r1 = r1.y
            r2 = r7
            int r2 = r2.height
            int r1 = r1 + r2
            if (r0 >= r1) goto L44
            r0 = 1
            goto L45
        L44:
            r0 = 0
        L45:
            return r0
    }

    static {
            com.github.caciocavallosilano.cacio.peer.CacioMouseInfoPeer r0 = new com.github.caciocavallosilano.cacio.peer.CacioMouseInfoPeer
            r1 = r0
            r1.<init>()
            com.github.caciocavallosilano.cacio.peer.CacioMouseInfoPeer.instance = r0
            return
    }
}
