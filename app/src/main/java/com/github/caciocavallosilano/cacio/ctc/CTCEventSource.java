package com.github.caciocavallosilano.cacio.ctc;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/caciocavallo.zip:caciocavallo17/cacio-tta-1.19.1-SNAPSHOT.jar:com/github/caciocavallosilano/cacio/ctc/CTCEventSource.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/caciocavallo17/cacio-tta-1.19.1-SNAPSHOT.jar:com/github/caciocavallosilano/cacio/ctc/CTCEventSource.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/caciocavallo.zip:caciocavallo17/cacio-tta-1.19.1-SNAPSHOT.jar:com/github/caciocavallosilano/cacio/ctc/CTCEventSource.class */
public class CTCEventSource implements com.github.caciocavallosilano.cacio.peer.CacioEventSource {
    private static com.github.caciocavallosilano.cacio.ctc.CTCEventSource instance;
    private java.util.concurrent.BlockingQueue<com.github.caciocavallosilano.cacio.peer.managed.EventData> queue;

    static com.github.caciocavallosilano.cacio.ctc.CTCEventSource getInstance() {
            com.github.caciocavallosilano.cacio.ctc.CTCEventSource r0 = com.github.caciocavallosilano.cacio.ctc.CTCEventSource.instance
            if (r0 != 0) goto L10
            com.github.caciocavallosilano.cacio.ctc.CTCEventSource r0 = new com.github.caciocavallosilano.cacio.ctc.CTCEventSource
            r1 = r0
            r1.<init>()
            com.github.caciocavallosilano.cacio.ctc.CTCEventSource.instance = r0
        L10:
            com.github.caciocavallosilano.cacio.ctc.CTCEventSource r0 = com.github.caciocavallosilano.cacio.ctc.CTCEventSource.instance
            return r0
    }

    private CTCEventSource() {
            r4 = this;
            r0 = r4
            r0.<init>()
            r0 = r4
            java.util.concurrent.LinkedBlockingQueue r1 = new java.util.concurrent.LinkedBlockingQueue
            r2 = r1
            r2.<init>()
            r0.queue = r1
            return
    }

    @Override // com.github.caciocavallosilano.cacio.peer.CacioEventSource
    public com.github.caciocavallosilano.cacio.peer.managed.EventData getNextEvent() throws java.lang.InterruptedException {
            r2 = this;
            r0 = r2
            java.util.concurrent.BlockingQueue<com.github.caciocavallosilano.cacio.peer.managed.EventData> r0 = r0.queue
            java.lang.Object r0 = r0.take()
            com.github.caciocavallosilano.cacio.peer.managed.EventData r0 = (com.github.caciocavallosilano.cacio.peer.managed.EventData) r0
            return r0
    }

    void postEvent(com.github.caciocavallosilano.cacio.peer.managed.EventData r4) {
            r3 = this;
            r0 = r3
            java.util.concurrent.BlockingQueue<com.github.caciocavallosilano.cacio.peer.managed.EventData> r0 = r0.queue
            r1 = r4
            boolean r0 = r0.offer(r1)
            return
    }
}
