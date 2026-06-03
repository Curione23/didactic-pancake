package com.github.caciocavallosilano.cacio.ctc;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/caciocavallo.zip:caciocavallo17/cacio-tta-1.19.1-SNAPSHOT.jar:com/github/caciocavallosilano/cacio/ctc/AbstractKeyStrokeMapping.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/caciocavallo17/cacio-tta-1.19.1-SNAPSHOT.jar:com/github/caciocavallosilano/cacio/ctc/AbstractKeyStrokeMapping.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/caciocavallo.zip:caciocavallo17/cacio-tta-1.19.1-SNAPSHOT.jar:com/github/caciocavallosilano/cacio/ctc/AbstractKeyStrokeMapping.class */
abstract class AbstractKeyStrokeMapping implements com.github.caciocavallosilano.cacio.ctc.KeyStrokeMapping {
    static final int NO_MASK = 0;

    AbstractKeyStrokeMapping() {
            r2 = this;
            r0 = r2
            r0.<init>()
            return
    }

    java.util.Map<java.awt.AWTKeyStroke, java.lang.Character> getDefaultMap() {
            r5 = this;
            java.util.HashMap r0 = new java.util.HashMap
            r1 = r0
            r1.<init>()
            r6 = r0
            r0 = r6
            r1 = r5
            r2 = 8
            r3 = 0
            java.awt.AWTKeyStroke r1 = r1.keyStroke(r2, r3)
            r2 = 8
            java.lang.Character r2 = java.lang.Character.valueOf(r2)
            java.lang.Object r0 = r0.put(r1, r2)
            r0 = r6
            r1 = r5
            r2 = 127(0x7f, float:1.78E-43)
            r3 = 0
            java.awt.AWTKeyStroke r1 = r1.keyStroke(r2, r3)
            r2 = 127(0x7f, float:1.78E-43)
            java.lang.Character r2 = java.lang.Character.valueOf(r2)
            java.lang.Object r0 = r0.put(r1, r2)
            r0 = r6
            r1 = r5
            r2 = 10
            r3 = 0
            java.awt.AWTKeyStroke r1 = r1.keyStroke(r2, r3)
            r2 = 10
            java.lang.Character r2 = java.lang.Character.valueOf(r2)
            java.lang.Object r0 = r0.put(r1, r2)
            boolean r0 = isWindows()
            if (r0 == 0) goto L5a
            r0 = r6
            r1 = r5
            r2 = 10
            r3 = 0
            java.awt.AWTKeyStroke r1 = r1.keyStroke(r2, r3)
            r2 = 13
            java.lang.Character r2 = java.lang.Character.valueOf(r2)
            java.lang.Object r0 = r0.put(r1, r2)
        L5a:
            r0 = r6
            r1 = r5
            r2 = 27
            r3 = 0
            java.awt.AWTKeyStroke r1 = r1.keyStroke(r2, r3)
            r2 = 27
            java.lang.Character r2 = java.lang.Character.valueOf(r2)
            java.lang.Object r0 = r0.put(r1, r2)
            r0 = r6
            r1 = r5
            r2 = 9
            r3 = 0
            java.awt.AWTKeyStroke r1 = r1.keyStroke(r2, r3)
            r2 = 9
            java.lang.Character r2 = java.lang.Character.valueOf(r2)
            java.lang.Object r0 = r0.put(r1, r2)
            r0 = r6
            return r0
    }

    java.awt.AWTKeyStroke keyStroke(int r4, int r5) {
            r3 = this;
            r0 = r4
            r1 = r5
            java.awt.AWTKeyStroke r0 = java.awt.AWTKeyStroke.getAWTKeyStroke(r0, r1)
            return r0
    }

    static boolean isWindows() {
            java.lang.String r0 = "os.name"
            java.lang.String r0 = java.lang.System.getProperty(r0)
            java.lang.String r0 = r0.toLowerCase()
            java.lang.String r1 = "windows"
            boolean r0 = r0.contains(r1)
            return r0
    }
}
