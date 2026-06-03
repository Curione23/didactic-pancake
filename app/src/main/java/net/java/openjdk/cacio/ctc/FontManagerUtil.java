package net.java.openjdk.cacio.ctc;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/caciocavallo.zip:caciocavallo/cacio-androidnw-1.10-SNAPSHOT.jar:net/java/openjdk/cacio/ctc/FontManagerUtil.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/caciocavallo/cacio-androidnw-1.10-SNAPSHOT.jar:net/java/openjdk/cacio/ctc/FontManagerUtil.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/caciocavallo.zip:caciocavallo/cacio-androidnw-1.10-SNAPSHOT.jar:net/java/openjdk/cacio/ctc/FontManagerUtil.class */
class FontManagerUtil {



    FontManagerUtil() {
            r2 = this;
            r0 = r2
            r0.<init>()
            return
    }

    static void setFontManager(java.lang.String r4) {
            net.java.openjdk.cacio.ctc.FontManagerUtil$1 r0 = new net.java.openjdk.cacio.ctc.FontManagerUtil$1
            r1 = r0
            r2 = r4
            r1.<init>(r2)
            java.lang.Object r0 = java.security.AccessController.doPrivileged(r0)
            return
    }

    static void setFontScaler(java.lang.String r4) {
            net.java.openjdk.cacio.ctc.FontManagerUtil$2 r0 = new net.java.openjdk.cacio.ctc.FontManagerUtil$2
            r1 = r0
            r2 = r4
            r1.<init>(r2)
            java.lang.Object r0 = java.security.AccessController.doPrivileged(r0)
            return
    }
}
