package com.github.caciocavallosilano.cacio.peer;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/caciocavallo.zip:caciocavallo17/cacio-shared-1.19.1-SNAPSHOT.jar:com/github/caciocavallosilano/cacio/peer/CacioEventPump.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/caciocavallo17/cacio-shared-1.19.1-SNAPSHOT.jar:com/github/caciocavallosilano/cacio/peer/CacioEventPump.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/caciocavallo.zip:caciocavallo17/cacio-shared-1.19.1-SNAPSHOT.jar:com/github/caciocavallosilano/cacio/peer/CacioEventPump.class */
public abstract class CacioEventPump<ET> implements java.lang.Runnable {
    private static final int BUTTON_DOWN_MASK = 7168;
    private int lastModifierState;

    protected CacioEventPump() {
            r2 = this;
            r0 = r2
            r0.<init>()
            return
    }

    protected void start() {
            r5 = this;
            java.lang.Thread r0 = new java.lang.Thread
            r1 = r0
            r2 = r5
            java.lang.String r3 = "CacioEventPump"
            r1.<init>(r2, r3)
            r6 = r0
            r0 = r6
            r1 = 1
            r0.setDaemon(r1)
            r0 = r6
            r0.start()
            return
    }

    @Override // java.lang.Runnable
    public final void run() {
            r3 = this;
            sun.awt.AWTAutoShutdown.notifyToolkitThreadBusy()
        L3:
            boolean r0 = java.lang.Thread.interrupted()
            if (r0 == 0) goto La
            return
        La:
            sun.awt.AWTAutoShutdown.notifyToolkitThreadFree()     // Catch: java.lang.Exception -> L1d
            r0 = r3
            java.lang.Object r0 = r0.fetchNativeEvent()     // Catch: java.lang.Exception -> L1d
            r4 = r0
            sun.awt.AWTAutoShutdown.notifyToolkitThreadBusy()     // Catch: java.lang.Exception -> L1d
            r0 = r3
            r1 = r4
            r0.dispatchNativeEvent(r1)     // Catch: java.lang.Exception -> L1d
            goto L3
        L1d:
            r4 = move-exception
            r0 = r4
            r0.printStackTrace()
            goto L3
    }

    protected abstract ET fetchNativeEvent() throws java.lang.InterruptedException;

    protected abstract void dispatchNativeEvent(ET r1);

    protected final void postMouseEvent(com.github.caciocavallosilano.cacio.peer.CacioComponent r14, int r15, long r16, int r18, int r19, int r20, int r21, boolean r22) {
            r13 = this;
            r0 = r15
            r1 = 506(0x1fa, float:7.09E-43)
            if (r0 != r1) goto L12
            r0 = r13
            r1 = r18
            int r0 = r0.getButton(r1)
            r23 = r0
            goto L29
        L12:
            r0 = r13
            int r0 = r0.lastModifierState
            r1 = r18
            r0 = r0 ^ r1
            r24 = r0
            r0 = r13
            r1 = r24
            int r0 = r0.getButton(r1)
            r23 = r0
            r0 = r13
            r1 = r18
            r0.lastModifierState = r1
        L29:
            java.awt.event.MouseEvent r0 = new java.awt.event.MouseEvent
            r1 = r0
            r2 = r14
            java.awt.Component r2 = r2.getAWTComponent()
            r3 = r15
            r4 = r16
            r5 = r18
            r6 = r19
            r7 = r20
            r8 = r21
            r9 = r22
            r10 = r23
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10)
            r24 = r0
            r0 = r13
            r1 = r14
            r2 = r24
            r0.postEvent(r1, r2)
            return
    }

    private int getButton(int r4) {
            r3 = this;
            r0 = r4
            r1 = 7168(0x1c00, float:1.0045E-41)
            r0 = r0 & r1
            switch(r0) {
                case 1024: goto L28;
                case 2048: goto L2a;
                case 4096: goto L2c;
                default: goto L2e;
            }
        L28:
            r0 = 1
            return r0
        L2a:
            r0 = 2
            return r0
        L2c:
            r0 = 3
            return r0
        L2e:
            r0 = 0
            return r0
    }

    protected final void postKeyEvent(com.github.caciocavallosilano.cacio.peer.CacioComponent r11, int r12, long r13, int r15, int r16) {
            r10 = this;
            java.awt.event.KeyEvent r0 = new java.awt.event.KeyEvent
            r1 = r0
            r2 = r11
            java.awt.Component r2 = r2.getAWTComponent()
            r3 = r12
            r4 = r13
            r5 = r15
            r6 = r16
            r7 = 65535(0xffff, float:9.1834E-41)
            r1.<init>(r2, r3, r4, r5, r6, r7)
            r17 = r0
            r0 = r10
            r1 = r11
            r2 = r17
            r0.postEvent(r1, r2)
            return
    }

    protected final void postKeyTypedEvent(com.github.caciocavallosilano.cacio.peer.CacioComponent r11, int r12, long r13, int r15, char r16) {
            r10 = this;
            java.awt.event.KeyEvent r0 = new java.awt.event.KeyEvent
            r1 = r0
            r2 = r11
            java.awt.Component r2 = r2.getAWTComponent()
            r3 = r12
            r4 = r13
            r5 = r15
            r6 = 0
            r7 = r16
            r1.<init>(r2, r3, r4, r5, r6, r7)
            r17 = r0
            r0 = r10
            r1 = r11
            r2 = r17
            r0.postEvent(r1, r2)
            return
    }

    protected final void postComponentEvent(com.github.caciocavallosilano.cacio.peer.CacioComponent r6, int r7) {
            r5 = this;
            java.awt.event.ComponentEvent r0 = new java.awt.event.ComponentEvent
            r1 = r0
            r2 = r6
            java.awt.Component r2 = r2.getAWTComponent()
            r3 = r7
            r1.<init>(r2, r3)
            r8 = r0
            r0 = r5
            r1 = r6
            r2 = r8
            r0.postEvent(r1, r2)
            return
    }

    protected final void postPaintEvent(com.github.caciocavallosilano.cacio.peer.CacioComponent r8, int r9, int r10, int r11, int r12, boolean r13) {
            r7 = this;
            r0 = r13
            if (r0 == 0) goto Lc
            r0 = r8
            com.github.caciocavallosilano.cacio.peer.CacioComponentPeer r0 = (com.github.caciocavallosilano.cacio.peer.CacioComponentPeer) r0
            r0.clearBackground()
        Lc:
            sun.awt.PaintEventDispatcher r0 = sun.awt.PaintEventDispatcher.getPaintEventDispatcher()
            r1 = r8
            java.awt.Component r1 = r1.getAWTComponent()
            r2 = r9
            r3 = r10
            r4 = r11
            r5 = r12
            java.awt.event.PaintEvent r0 = r0.createPaintEvent(r1, r2, r3, r4, r5)
            r14 = r0
            r0 = r7
            r1 = r8
            r2 = r14
            r0.postEvent(r1, r2)
            return
    }

    protected final void postPaintEvent(com.github.caciocavallosilano.cacio.peer.CacioComponent r9, int r10, int r11, int r12, int r13) {
            r8 = this;
            r0 = r8
            r1 = r9
            r2 = r10
            r3 = r11
            r4 = r12
            r5 = r13
            r6 = 0
            r0.postPaintEvent(r1, r2, r3, r4, r5, r6)
            return
    }

    protected final void postFocusEvent(com.github.caciocavallosilano.cacio.peer.CacioComponent r8, int r9, boolean r10, com.github.caciocavallosilano.cacio.peer.CacioComponent r11) {
            r7 = this;
            r0 = 0
            r12 = r0
            r0 = r11
            if (r0 == 0) goto L11
            r0 = r11
            java.awt.Component r0 = r0.getAWTComponent()
            r12 = r0
        L11:
            java.awt.event.FocusEvent r0 = new java.awt.event.FocusEvent
            r1 = r0
            r2 = r8
            java.awt.Component r2 = r2.getAWTComponent()
            r3 = r9
            r4 = r10
            r5 = r12
            r1.<init>(r2, r3, r4, r5)
            r13 = r0
            r0 = r7
            r1 = r8
            r2 = r13
            r0.postEvent(r1, r2)
            return
    }

    protected final void postWindwoEvent(com.github.caciocavallosilano.cacio.peer.CacioComponent r8, int r9, int r10, int r11) {
            r7 = this;
            r0 = r9
            r1 = 209(0xd1, float:2.93E-43)
            if (r0 != r1) goto L20
            java.awt.event.WindowEvent r0 = new java.awt.event.WindowEvent
            r1 = r0
            r2 = r8
            java.awt.Component r2 = r2.getAWTComponent()
            java.awt.Window r2 = (java.awt.Window) r2
            r3 = r9
            r4 = r10
            r5 = r11
            r1.<init>(r2, r3, r4, r5)
            r12 = r0
            goto L33
        L20:
            java.awt.event.WindowEvent r0 = new java.awt.event.WindowEvent
            r1 = r0
            r2 = r8
            java.awt.Component r2 = r2.getAWTComponent()
            java.awt.Window r2 = (java.awt.Window) r2
            r3 = r9
            r1.<init>(r2, r3)
            r12 = r0
        L33:
            r0 = r7
            r1 = r8
            r2 = r12
            r0.postEvent(r1, r2)
            return
    }

    private void postEvent(com.github.caciocavallosilano.cacio.peer.CacioComponent r4, java.awt.AWTEvent r5) {
            r3 = this;
            r0 = r4
            r1 = r5
            r0.handlePeerEvent(r1)
            return
    }
}
