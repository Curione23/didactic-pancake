package com.github.caciocavallosilano.cacio.ctc;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/caciocavallo.zip:caciocavallo17/cacio-tta-1.19.1-SNAPSHOT.jar:com/github/caciocavallosilano/cacio/ctc/MouseClickSupport.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/caciocavallo17/cacio-tta-1.19.1-SNAPSHOT.jar:com/github/caciocavallosilano/cacio/ctc/MouseClickSupport.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/caciocavallo.zip:caciocavallo17/cacio-tta-1.19.1-SNAPSHOT.jar:com/github/caciocavallosilano/cacio/ctc/MouseClickSupport.class */
class MouseClickSupport {
    private static final long MULTI_CLICK_THRESHOLD = 400;
    private com.github.caciocavallosilano.cacio.peer.managed.EventData lastPress;
    private int clickCount;

    MouseClickSupport() {
            r2 = this;
            r0 = r2
            r0.<init>()
            return
    }

    void mouseEvent(com.github.caciocavallosilano.cacio.peer.managed.EventData r4) {
            r3 = this;
            r0 = r4
            int r0 = r0.getId()
            switch(r0) {
                case 501: goto L20;
                case 502: goto L28;
                default: goto L30;
            }
        L20:
            r0 = r3
            r1 = r4
            r0.handlePress(r1)
            goto L30
        L28:
            r0 = r3
            r1 = r4
            r0.handleRelease(r1)
            goto L30
        L30:
            return
    }

    private void handlePress(com.github.caciocavallosilano.cacio.peer.managed.EventData r5) {
            r4 = this;
            r0 = r4
            r1 = r5
            boolean r0 = r0.isInMultiClickThreshold(r1)
            if (r0 == 0) goto L1d
            r0 = r4
            r1 = r5
            boolean r0 = r0.isClick(r1)
            if (r0 == 0) goto L1d
            r0 = r4
            r1 = r0
            int r1 = r1.clickCount
            r2 = 1
            int r1 = r1 + r2
            r0.clickCount = r1
            goto L22
        L1d:
            r0 = r4
            r1 = 1
            r0.clickCount = r1
        L22:
            r0 = r4
            r1 = r5
            r0.lastPress = r1
            return
    }

    private boolean isInMultiClickThreshold(com.github.caciocavallosilano.cacio.peer.managed.EventData r6) {
            r5 = this;
            r0 = r5
            com.github.caciocavallosilano.cacio.peer.managed.EventData r0 = r0.lastPress
            if (r0 == 0) goto L1e
            r0 = r6
            long r0 = r0.getTime()
            r1 = r5
            com.github.caciocavallosilano.cacio.peer.managed.EventData r1 = r1.lastPress
            long r1 = r1.getTime()
            long r0 = r0 - r1
            r1 = 400(0x190, double:1.976E-321)
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 >= 0) goto L1e
            r0 = 1
            goto L1f
        L1e:
            r0 = 0
        L1f:
            return r0
    }

    private void handleRelease(com.github.caciocavallosilano.cacio.peer.managed.EventData r4) {
            r3 = this;
            r0 = r3
            r1 = r4
            boolean r0 = r0.isClick(r1)
            if (r0 == 0) goto Ld
            r0 = r3
            r1 = r4
            r0.generateClick(r1)
        Ld:
            return
    }

    private void generateClick(com.github.caciocavallosilano.cacio.peer.managed.EventData r5) {
            r4 = this;
            r0 = r5
            r1 = 500(0x1f4, float:7.0E-43)
            r0.setId(r1)
            r0 = r5
            com.github.caciocavallosilano.cacio.ctc.CTCScreen r1 = com.github.caciocavallosilano.cacio.ctc.CTCScreen.getInstance()
            r0.setSource(r1)
            r0 = r5
            long r1 = java.lang.System.currentTimeMillis()
            r0.setTime(r1)
            r0 = r5
            r1 = r4
            int r1 = r1.clickCount
            r0.setClickCount(r1)
            r0 = r5
            r1 = 0
            r0.setPopup(r1)
            com.github.caciocavallosilano.cacio.ctc.CTCEventSource r0 = com.github.caciocavallosilano.cacio.ctc.CTCEventSource.getInstance()
            r1 = r5
            r0.postEvent(r1)
            return
    }

    private boolean isClick(com.github.caciocavallosilano.cacio.peer.managed.EventData r4) {
            r3 = this;
            r0 = r3
            com.github.caciocavallosilano.cacio.peer.managed.EventData r0 = r0.lastPress
            int r0 = r0.getButton()
            r1 = r4
            int r1 = r1.getButton()
            if (r0 != r1) goto L2e
            r0 = r3
            com.github.caciocavallosilano.cacio.peer.managed.EventData r0 = r0.lastPress
            int r0 = r0.getX()
            r1 = r4
            int r1 = r1.getX()
            if (r0 != r1) goto L2e
            r0 = r3
            com.github.caciocavallosilano.cacio.peer.managed.EventData r0 = r0.lastPress
            int r0 = r0.getY()
            r1 = r4
            int r1 = r1.getY()
            if (r0 != r1) goto L2e
            r0 = 1
            goto L2f
        L2e:
            r0 = 0
        L2f:
            return r0
    }

    int getClickCount() {
            r2 = this;
            r0 = r2
            int r0 = r0.clickCount
            return r0
    }
}
