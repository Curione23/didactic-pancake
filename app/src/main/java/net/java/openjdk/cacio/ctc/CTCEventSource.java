package net.java.openjdk.cacio.ctc;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/caciocavallo.zip:caciocavallo/cacio-androidnw-1.10-SNAPSHOT.jar:net/java/openjdk/cacio/ctc/CTCEventSource.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/caciocavallo/cacio-androidnw-1.10-SNAPSHOT.jar:net/java/openjdk/cacio/ctc/CTCEventSource.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/caciocavallo.zip:caciocavallo/cacio-androidnw-1.10-SNAPSHOT.jar:net/java/openjdk/cacio/ctc/CTCEventSource.class */
public class CTCEventSource implements sun.awt.peer.cacio.CacioEventSource {
    private static net.java.openjdk.cacio.ctc.CTCEventSource instance;
    private java.util.concurrent.BlockingQueue<sun.awt.peer.cacio.managed.EventData> queue;

    static net.java.openjdk.cacio.ctc.CTCEventSource getInstance() {
            net.java.openjdk.cacio.ctc.CTCEventSource r0 = net.java.openjdk.cacio.ctc.CTCEventSource.instance
            if (r0 != 0) goto L10
            net.java.openjdk.cacio.ctc.CTCEventSource r0 = new net.java.openjdk.cacio.ctc.CTCEventSource
            r1 = r0
            r1.<init>()
            net.java.openjdk.cacio.ctc.CTCEventSource.instance = r0
        L10:
            net.java.openjdk.cacio.ctc.CTCEventSource r0 = net.java.openjdk.cacio.ctc.CTCEventSource.instance
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

    @Override // sun.awt.peer.cacio.CacioEventSource
    public sun.awt.peer.cacio.managed.EventData getNextEvent() throws java.lang.InterruptedException {
            r2 = this;
            r0 = r2
            java.util.concurrent.BlockingQueue<sun.awt.peer.cacio.managed.EventData> r0 = r0.queue
            java.lang.Object r0 = r0.take()
            sun.awt.peer.cacio.managed.EventData r0 = (sun.awt.peer.cacio.managed.EventData) r0
            return r0
    }

    void postEvent(sun.awt.peer.cacio.managed.EventData r4) {
            r3 = this;
            r0 = r3
            java.util.concurrent.BlockingQueue<sun.awt.peer.cacio.managed.EventData> r0 = r0.queue
            r1 = r4
            boolean r0 = r0.offer(r1)
            return
    }
}
