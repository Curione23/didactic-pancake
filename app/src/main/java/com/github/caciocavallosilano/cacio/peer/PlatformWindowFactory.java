package com.github.caciocavallosilano.cacio.peer;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/caciocavallo.zip:caciocavallo17/cacio-shared-1.19.1-SNAPSHOT.jar:com/github/caciocavallosilano/cacio/peer/PlatformWindowFactory.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/caciocavallo17/cacio-shared-1.19.1-SNAPSHOT.jar:com/github/caciocavallosilano/cacio/peer/PlatformWindowFactory.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/caciocavallo.zip:caciocavallo17/cacio-shared-1.19.1-SNAPSHOT.jar:com/github/caciocavallosilano/cacio/peer/PlatformWindowFactory.class */
public interface PlatformWindowFactory {
    com.github.caciocavallosilano.cacio.peer.PlatformWindow createPlatformWindow(com.github.caciocavallosilano.cacio.peer.CacioComponent r1, com.github.caciocavallosilano.cacio.peer.PlatformWindow r2);

    com.github.caciocavallosilano.cacio.peer.PlatformToplevelWindow createPlatformToplevelWindow(com.github.caciocavallosilano.cacio.peer.CacioComponent r1);

    com.github.caciocavallosilano.cacio.peer.CacioEventPump<?> createEventPump();

    com.github.caciocavallosilano.cacio.peer.PlatformWindow createPlatformToplevelWindow(com.github.caciocavallosilano.cacio.peer.CacioComponent r1, com.github.caciocavallosilano.cacio.peer.PlatformWindow r2);
}
