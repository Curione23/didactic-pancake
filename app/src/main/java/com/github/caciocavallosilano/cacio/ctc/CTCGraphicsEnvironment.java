package com.github.caciocavallosilano.cacio.ctc;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/caciocavallo.zip:caciocavallo17/cacio-tta-1.19.1-SNAPSHOT.jar:com/github/caciocavallosilano/cacio/ctc/CTCGraphicsEnvironment.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/caciocavallo17/cacio-tta-1.19.1-SNAPSHOT.jar:com/github/caciocavallosilano/cacio/ctc/CTCGraphicsEnvironment.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/caciocavallo.zip:caciocavallo17/cacio-tta-1.19.1-SNAPSHOT.jar:com/github/caciocavallosilano/cacio/ctc/CTCGraphicsEnvironment.class */
public class CTCGraphicsEnvironment extends sun.java2d.SunGraphicsEnvironment {
    public CTCGraphicsEnvironment() {
            r3 = this;
            r0 = r3
            r0.<init>()
            com.github.caciocavallosilano.cacio.ctc.CTCSurfaceManagerFactory r0 = new com.github.caciocavallosilano.cacio.ctc.CTCSurfaceManagerFactory
            r1 = r0
            r1.<init>()
            sun.java2d.SurfaceManagerFactory.setInstance(r0)
            return
    }

    protected int getNumScreens() {
            r2 = this;
            r0 = 1
            return r0
    }

    protected java.awt.GraphicsDevice makeScreenDevice(int r4) {
            r3 = this;
            com.github.caciocavallosilano.cacio.ctc.CTCGraphicsDevice r0 = new com.github.caciocavallosilano.cacio.ctc.CTCGraphicsDevice
            r1 = r0
            r1.<init>()
            return r0
    }

    public boolean isDisplayLocal() {
            r2 = this;
            r0 = 1
            return r0
    }
}
