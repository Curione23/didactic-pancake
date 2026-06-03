package com.github.caciocavallosilano.cacio.ctc;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/caciocavallo.zip:caciocavallo17/cacio-tta-1.19.1-SNAPSHOT.jar:com/github/caciocavallosilano/cacio/ctc/CTCSurfaceManagerFactory.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/caciocavallo17/cacio-tta-1.19.1-SNAPSHOT.jar:com/github/caciocavallosilano/cacio/ctc/CTCSurfaceManagerFactory.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/caciocavallo.zip:caciocavallo17/cacio-tta-1.19.1-SNAPSHOT.jar:com/github/caciocavallosilano/cacio/ctc/CTCSurfaceManagerFactory.class */
class CTCSurfaceManagerFactory extends sun.java2d.SurfaceManagerFactory {
    CTCSurfaceManagerFactory() {
            r2 = this;
            r0 = r2
            r0.<init>()
            return
    }

    public sun.awt.image.VolatileSurfaceManager createVolatileManager(sun.awt.image.SunVolatileImage r6, java.lang.Object r7) {
            r5 = this;
            com.github.caciocavallosilano.cacio.ctc.CTCVolatileSurfaceManager r0 = new com.github.caciocavallosilano.cacio.ctc.CTCVolatileSurfaceManager
            r1 = r0
            r2 = r6
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }
}
