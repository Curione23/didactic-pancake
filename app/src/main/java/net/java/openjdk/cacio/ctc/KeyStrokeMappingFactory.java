package net.java.openjdk.cacio.ctc;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/caciocavallo.zip:caciocavallo/cacio-androidnw-1.10-SNAPSHOT.jar:net/java/openjdk/cacio/ctc/KeyStrokeMappingFactory.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/caciocavallo/cacio-androidnw-1.10-SNAPSHOT.jar:net/java/openjdk/cacio/ctc/KeyStrokeMappingFactory.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/caciocavallo.zip:caciocavallo/cacio-androidnw-1.10-SNAPSHOT.jar:net/java/openjdk/cacio/ctc/KeyStrokeMappingFactory.class */
class KeyStrokeMappingFactory {
    private static net.java.openjdk.cacio.ctc.KeyStrokeMappingFactory instance;
    private java.util.Map<java.lang.String, net.java.openjdk.cacio.ctc.KeyStrokeMapping> maps;

    KeyStrokeMappingFactory() {
            r4 = this;
            r0 = r4
            r0.<init>()
            r0 = r4
            java.util.HashMap r1 = new java.util.HashMap
            r2 = r1
            r2.<init>()
            r0.maps = r1
            return
    }

    static net.java.openjdk.cacio.ctc.KeyStrokeMappingFactory getInstance() {
            net.java.openjdk.cacio.ctc.KeyStrokeMappingFactory r0 = net.java.openjdk.cacio.ctc.KeyStrokeMappingFactory.instance
            return r0
    }

    net.java.openjdk.cacio.ctc.KeyStrokeMapping getKeyStrokeMapping() {
            r4 = this;
            java.util.Locale r0 = java.util.Locale.getDefault()
            java.lang.String r0 = r0.getCountry()
            java.lang.String r0 = r0.toLowerCase()
            r5 = r0
            r0 = r4
            java.util.Map<java.lang.String, net.java.openjdk.cacio.ctc.KeyStrokeMapping> r0 = r0.maps
            r1 = r5
            java.lang.Object r0 = r0.get(r1)
            net.java.openjdk.cacio.ctc.KeyStrokeMapping r0 = (net.java.openjdk.cacio.ctc.KeyStrokeMapping) r0
            r6 = r0
            r0 = r6
            if (r0 != 0) goto L44
            r0 = r5
            java.lang.String r1 = "de"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L30
            net.java.openjdk.cacio.ctc.KeyStrokeMappingDE r0 = new net.java.openjdk.cacio.ctc.KeyStrokeMappingDE
            r1 = r0
            r1.<init>()
            r6 = r0
            goto L38
        L30:
            net.java.openjdk.cacio.ctc.KeyStrokeMappingEN r0 = new net.java.openjdk.cacio.ctc.KeyStrokeMappingEN
            r1 = r0
            r1.<init>()
            r6 = r0
        L38:
            r0 = r4
            java.util.Map<java.lang.String, net.java.openjdk.cacio.ctc.KeyStrokeMapping> r0 = r0.maps
            r1 = r5
            r2 = r6
            java.lang.Object r0 = r0.put(r1, r2)
        L44:
            r0 = r6
            return r0
    }

    static {
            net.java.openjdk.cacio.ctc.KeyStrokeMappingFactory r0 = new net.java.openjdk.cacio.ctc.KeyStrokeMappingFactory
            r1 = r0
            r1.<init>()
            net.java.openjdk.cacio.ctc.KeyStrokeMappingFactory.instance = r0
            return
    }
}
