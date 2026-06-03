package sun.awt.peer.cacio.managed;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/caciocavallo.zip:caciocavallo/cacio-shared-1.10-SNAPSHOT.jar:sun/awt/peer/cacio/managed/FullScreenEventPump.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/caciocavallo/cacio-shared-1.10-SNAPSHOT.jar:sun/awt/peer/cacio/managed/FullScreenEventPump.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/caciocavallo.zip:caciocavallo/cacio-shared-1.10-SNAPSHOT.jar:sun/awt/peer/cacio/managed/FullScreenEventPump.class */
public class FullScreenEventPump extends sun.awt.peer.cacio.CacioEventPump<sun.awt.peer.cacio.managed.EventData> {
    private sun.awt.peer.cacio.CacioEventSource source;

    public FullScreenEventPump(sun.awt.peer.cacio.CacioEventSource r4) {
            r3 = this;
            r0 = r3
            r0.<init>()
            r0 = r3
            r1 = r4
            r0.source = r1
            return
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // sun.awt.peer.cacio.CacioEventPump
    protected sun.awt.peer.cacio.managed.EventData fetchNativeEvent() throws java.lang.InterruptedException {
            r2 = this;
            r0 = r2
            sun.awt.peer.cacio.CacioEventSource r0 = r0.source
            sun.awt.peer.cacio.managed.EventData r0 = r0.getNextEvent()
            return r0
    }

    /* JADX INFO: renamed from: dispatchNativeEvent, reason: avoid collision after fix types in other method */
    protected void dispatchNativeEvent2(sun.awt.peer.cacio.managed.EventData r4) {
            r3 = this;
            r0 = r4
            java.lang.Object r0 = r0.getSource()
            sun.awt.peer.cacio.managed.ManagedWindowContainer r0 = (sun.awt.peer.cacio.managed.ManagedWindowContainer) r0
            r5 = r0
            r0 = r5
            if (r0 == 0) goto L13
            r0 = r5
            r1 = r4
            r0.dispatchEvent(r1)
        L13:
            return
    }

    @Override // sun.awt.peer.cacio.CacioEventPump
    protected /* bridge */ /* synthetic */ void dispatchNativeEvent(sun.awt.peer.cacio.managed.EventData r4) {
            r3 = this;
            r0 = r3
            r1 = r4
            sun.awt.peer.cacio.managed.EventData r1 = (sun.awt.peer.cacio.managed.EventData) r1
            r0.dispatchNativeEvent2(r1)
            return
    }

    @Override // sun.awt.peer.cacio.CacioEventPump
    protected /* bridge */ /* synthetic */ sun.awt.peer.cacio.managed.EventData fetchNativeEvent() throws java.lang.InterruptedException {
            r2 = this;
            r0 = r2
            sun.awt.peer.cacio.managed.EventData r0 = r0.fetchNativeEvent()
            return r0
    }
}
