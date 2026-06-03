package com.github.caciocavallosilano.cacio.peer.managed;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/caciocavallo.zip:caciocavallo17/cacio-shared-1.19.1-SNAPSHOT.jar:com/github/caciocavallosilano/cacio/peer/managed/FullScreenEventPump.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/caciocavallo17/cacio-shared-1.19.1-SNAPSHOT.jar:com/github/caciocavallosilano/cacio/peer/managed/FullScreenEventPump.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/caciocavallo.zip:caciocavallo17/cacio-shared-1.19.1-SNAPSHOT.jar:com/github/caciocavallosilano/cacio/peer/managed/FullScreenEventPump.class */
public class FullScreenEventPump extends com.github.caciocavallosilano.cacio.peer.CacioEventPump<com.github.caciocavallosilano.cacio.peer.managed.EventData> {
    private com.github.caciocavallosilano.cacio.peer.CacioEventSource source;

    public FullScreenEventPump(com.github.caciocavallosilano.cacio.peer.CacioEventSource r4) {
            r3 = this;
            r0 = r3
            r0.<init>()
            r0 = r3
            r1 = r4
            r0.source = r1
            return
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.github.caciocavallosilano.cacio.peer.CacioEventPump
    protected com.github.caciocavallosilano.cacio.peer.managed.EventData fetchNativeEvent() throws java.lang.InterruptedException {
            r2 = this;
            r0 = r2
            com.github.caciocavallosilano.cacio.peer.CacioEventSource r0 = r0.source
            com.github.caciocavallosilano.cacio.peer.managed.EventData r0 = r0.getNextEvent()
            return r0
    }

    /* JADX INFO: renamed from: dispatchNativeEvent, reason: avoid collision after fix types in other method */
    protected void dispatchNativeEvent2(com.github.caciocavallosilano.cacio.peer.managed.EventData r4) {
            r3 = this;
            r0 = r4
            java.lang.Object r0 = r0.getSource()
            com.github.caciocavallosilano.cacio.peer.managed.ManagedWindowContainer r0 = (com.github.caciocavallosilano.cacio.peer.managed.ManagedWindowContainer) r0
            r5 = r0
            r0 = r5
            if (r0 == 0) goto L13
            r0 = r5
            r1 = r4
            r0.dispatchEvent(r1)
        L13:
            return
    }

    @Override // com.github.caciocavallosilano.cacio.peer.CacioEventPump
    protected /* bridge */ /* synthetic */ void dispatchNativeEvent(com.github.caciocavallosilano.cacio.peer.managed.EventData r4) {
            r3 = this;
            r0 = r3
            r1 = r4
            com.github.caciocavallosilano.cacio.peer.managed.EventData r1 = (com.github.caciocavallosilano.cacio.peer.managed.EventData) r1
            r0.dispatchNativeEvent2(r1)
            return
    }

    @Override // com.github.caciocavallosilano.cacio.peer.CacioEventPump
    protected /* bridge */ /* synthetic */ com.github.caciocavallosilano.cacio.peer.managed.EventData fetchNativeEvent() throws java.lang.InterruptedException {
            r2 = this;
            r0 = r2
            com.github.caciocavallosilano.cacio.peer.managed.EventData r0 = r0.fetchNativeEvent()
            return r0
    }
}
