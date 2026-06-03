package net.java.openjdk.cacio.ctc;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/caciocavallo.zip:caciocavallo/cacio-androidnw-1.10-SNAPSHOT.jar:net/java/openjdk/cacio/ctc/CTCVolatileSurfaceManager.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/caciocavallo/cacio-androidnw-1.10-SNAPSHOT.jar:net/java/openjdk/cacio/ctc/CTCVolatileSurfaceManager.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/caciocavallo.zip:caciocavallo/cacio-androidnw-1.10-SNAPSHOT.jar:net/java/openjdk/cacio/ctc/CTCVolatileSurfaceManager.class */
class CTCVolatileSurfaceManager extends sun.awt.image.VolatileSurfaceManager {
    protected CTCVolatileSurfaceManager(sun.awt.image.SunVolatileImage r5, java.lang.Object r6) {
            r4 = this;
            r0 = r4
            r1 = r5
            r2 = r6
            r0.<init>(r1, r2)
            r0 = r4
            r0.initContents()
            r0 = r4
            r1 = r4
            sun.java2d.SurfaceData r1 = r1.sdCurrent
            r0.sdBackup = r1
            return
    }

    protected boolean isAccelerationEnabled() {
            r2 = this;
            r0 = 0
            return r0
    }

    protected sun.java2d.SurfaceData initAcceleratedSurface() {
            r2 = this;
            r0 = 0
            return r0
    }
}
