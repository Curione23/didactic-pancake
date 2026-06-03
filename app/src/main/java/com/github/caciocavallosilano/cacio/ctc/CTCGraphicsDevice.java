package com.github.caciocavallosilano.cacio.ctc;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/caciocavallo.zip:caciocavallo17/cacio-tta-1.19.1-SNAPSHOT.jar:com/github/caciocavallosilano/cacio/ctc/CTCGraphicsDevice.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/caciocavallo17/cacio-tta-1.19.1-SNAPSHOT.jar:com/github/caciocavallosilano/cacio/ctc/CTCGraphicsDevice.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/caciocavallo.zip:caciocavallo17/cacio-tta-1.19.1-SNAPSHOT.jar:com/github/caciocavallosilano/cacio/ctc/CTCGraphicsDevice.class */
public class CTCGraphicsDevice extends java.awt.GraphicsDevice {
    private com.github.caciocavallosilano.cacio.ctc.CTCGraphicsConfiguration defaultConfig;

    public CTCGraphicsDevice() {
            r2 = this;
            r0 = r2
            r0.<init>()
            return
    }

    public int getType() {
            r2 = this;
            r0 = 0
            return r0
    }

    public java.lang.String getIDstring() {
            r2 = this;
            java.lang.String r0 = "CTCGraphicsDevice"
            return r0
    }

    public java.awt.GraphicsConfiguration[] getConfigurations() {
            r4 = this;
            r0 = 1
            java.awt.GraphicsConfiguration[] r0 = new java.awt.GraphicsConfiguration[r0]
            r5 = r0
            r0 = r5
            r1 = 0
            r2 = r4
            java.awt.GraphicsConfiguration r2 = r2.getDefaultConfiguration()
            r0[r1] = r2
            r0 = r5
            return r0
    }

    public java.awt.GraphicsConfiguration getDefaultConfiguration() {
            r5 = this;
            r0 = r5
            com.github.caciocavallosilano.cacio.ctc.CTCGraphicsConfiguration r0 = r0.defaultConfig
            if (r0 != 0) goto L13
            r0 = r5
            com.github.caciocavallosilano.cacio.ctc.CTCGraphicsConfiguration r1 = new com.github.caciocavallosilano.cacio.ctc.CTCGraphicsConfiguration
            r2 = r1
            r3 = r5
            r2.<init>(r3)
            r0.defaultConfig = r1
        L13:
            r0 = r5
            com.github.caciocavallosilano.cacio.ctc.CTCGraphicsConfiguration r0 = r0.defaultConfig
            return r0
    }
}
