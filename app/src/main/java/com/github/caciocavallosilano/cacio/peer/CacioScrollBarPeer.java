package com.github.caciocavallosilano.cacio.peer;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/caciocavallo.zip:caciocavallo17/cacio-shared-1.19.1-SNAPSHOT.jar:com/github/caciocavallosilano/cacio/peer/CacioScrollBarPeer.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/caciocavallo17/cacio-shared-1.19.1-SNAPSHOT.jar:com/github/caciocavallosilano/cacio/peer/CacioScrollBarPeer.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/caciocavallo.zip:caciocavallo17/cacio-shared-1.19.1-SNAPSHOT.jar:com/github/caciocavallosilano/cacio/peer/CacioScrollBarPeer.class */
class CacioScrollBarPeer extends com.github.caciocavallosilano.cacio.peer.CacioComponentPeer<java.awt.Scrollbar, javax.swing.JScrollBar> implements java.awt.peer.ScrollbarPeer {
    static final /* synthetic */ boolean $assertionsDisabled = false;

    CacioScrollBarPeer(java.awt.Scrollbar r5, com.github.caciocavallosilano.cacio.peer.PlatformWindowFactory r6) {
            r4 = this;
            r0 = r4
            r1 = r5
            r2 = r6
            r0.<init>(r1, r2)
            return
    }

    javax.swing.JScrollBar initSwingComponent() {
            r4 = this;
            r0 = r4
            java.awt.Component r0 = r0.getAWTComponent()
            java.awt.Scrollbar r0 = (java.awt.Scrollbar) r0
            r5 = r0
            r0 = r5
            int r0 = r0.getOrientation()
            r6 = r0
            r0 = r6
            if (r0 != 0) goto L16
            r0 = 0
            r7 = r0
            goto L2b
        L16:
            boolean r0 = com.github.caciocavallosilano.cacio.peer.CacioScrollBarPeer.$assertionsDisabled
            if (r0 != 0) goto L29
            r0 = r6
            r1 = 1
            if (r0 == r1) goto L29
            java.lang.AssertionError r0 = new java.lang.AssertionError
            r1 = r0
            r1.<init>()
            throw r0
        L29:
            r0 = 1
            r7 = r0
        L2b:
            javax.swing.JScrollBar r0 = new javax.swing.JScrollBar
            r1 = r0
            r2 = r7
            r1.<init>(r2)
            return r0
    }

    @Override // com.github.caciocavallosilano.cacio.peer.CacioComponentPeer
    void postInitSwingComponent() {
            r6 = this;
            r0 = r6
            super.postInitSwingComponent()
            r0 = r6
            java.awt.Component r0 = r0.getAWTComponent()
            java.awt.Scrollbar r0 = (java.awt.Scrollbar) r0
            r7 = r0
            r0 = r6
            r1 = r7
            int r1 = r1.getValue()
            r2 = r7
            int r2 = r2.getVisibleAmount()
            r3 = r7
            int r3 = r3.getMinimum()
            r4 = r7
            int r4 = r4.getMaximum()
            r0.setValues(r1, r2, r3, r4)
            r0 = r6
            r1 = r7
            int r1 = r1.getUnitIncrement()
            r0.setLineIncrement(r1)
            r0 = r6
            r1 = r7
            int r1 = r1.getBlockIncrement()
            r0.setPageIncrement(r1)
            return
    }

    public void setValues(int r7, int r8, int r9, int r10) {
            r6 = this;
            r0 = r6
            javax.swing.JComponent r0 = r0.getSwingComponent()
            javax.swing.JScrollBar r0 = (javax.swing.JScrollBar) r0
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            r0.setValues(r1, r2, r3, r4)
            return
    }

    public void setLineIncrement(int r4) {
            r3 = this;
            r0 = r3
            javax.swing.JComponent r0 = r0.getSwingComponent()
            javax.swing.JScrollBar r0 = (javax.swing.JScrollBar) r0
            r1 = r4
            r0.setUnitIncrement(r1)
            return
    }

    public void setPageIncrement(int r4) {
            r3 = this;
            r0 = r3
            javax.swing.JComponent r0 = r0.getSwingComponent()
            javax.swing.JScrollBar r0 = (javax.swing.JScrollBar) r0
            r1 = r4
            r0.setBlockIncrement(r1)
            return
    }

    @Override // com.github.caciocavallosilano.cacio.peer.CacioComponentPeer
    /* JADX INFO: renamed from: initSwingComponent */
    /* bridge */ /* synthetic */ javax.swing.JComponent mo596initSwingComponent() {
            r2 = this;
            r0 = r2
            javax.swing.JScrollBar r0 = r0.initSwingComponent()
            return r0
    }

    static {
            java.lang.Class<com.github.caciocavallosilano.cacio.peer.CacioScrollBarPeer> r0 = com.github.caciocavallosilano.cacio.peer.CacioScrollBarPeer.class
            boolean r0 = r0.desiredAssertionStatus()
            if (r0 != 0) goto Lc
            r0 = 1
            goto Ld
        Lc:
            r0 = 0
        Ld:
            com.github.caciocavallosilano.cacio.peer.CacioScrollBarPeer.$assertionsDisabled = r0
            return
    }
}
