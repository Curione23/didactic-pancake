package com.github.caciocavallosilano.cacio.peer;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/caciocavallo.zip:caciocavallo17/cacio-shared-1.19.1-SNAPSHOT.jar:com/github/caciocavallosilano/cacio/peer/PlatformToplevelWindow.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/caciocavallo17/cacio-shared-1.19.1-SNAPSHOT.jar:com/github/caciocavallosilano/cacio/peer/PlatformToplevelWindow.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/caciocavallo.zip:caciocavallo17/cacio-shared-1.19.1-SNAPSHOT.jar:com/github/caciocavallosilano/cacio/peer/PlatformToplevelWindow.class */
public interface PlatformToplevelWindow extends com.github.caciocavallosilano.cacio.peer.PlatformWindow {
    int getState();

    void setState(int r1);

    void setMaximizedBounds(java.awt.Rectangle r1);

    void setResizable(boolean r1);

    void setTitle(java.lang.String r1);

    void setBlocked(boolean r1);
}
