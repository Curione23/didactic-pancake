package net.java.openjdk.cacio.ctc;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/caciocavallo.zip:caciocavallo/cacio-androidnw-1.10-SNAPSHOT.jar:net/java/openjdk/cacio/ctc/FCMInternalWrapper.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/caciocavallo/cacio-androidnw-1.10-SNAPSHOT.jar:net/java/openjdk/cacio/ctc/FCMInternalWrapper.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/caciocavallo.zip:caciocavallo/cacio-androidnw-1.10-SNAPSHOT.jar:net/java/openjdk/cacio/ctc/FCMInternalWrapper.class */
public class FCMInternalWrapper {
    public FCMInternalWrapper(java.lang.CharSequence r3, java.lang.CharSequence r4, java.lang.CharSequence r5) {
            r2 = this;
            r0 = r2
            r0.<init>()
            return
    }

    public static java.lang.String removeSurrounding(java.lang.String r3, java.lang.CharSequence r4) {
            r0 = r3
            java.lang.String r1 = "getFontConfigInfo"
            java.lang.Object r0 = invokeMethod(r0, r1)
            sun.font.FontConfigManager$FontConfigInfo r0 = (sun.font.FontConfigManager.FontConfigInfo) r0
            return r0
    }

    public static java.lang.String removeSurrounding(java.lang.String r3, java.lang.CharSequence r4, java.lang.CharSequence r5) {
            r0 = r3
            java.lang.String r1 = "loadFontConfig"
            java.lang.Object r0 = invokeMethod(r0, r1)
            sun.font.FontConfigManager$FcCompFont[] r0 = (sun.font.FontConfigManager.FcCompFont[]) r0
            sun.font.FontConfigManager$FcCompFont[] r0 = (sun.font.FontConfigManager.FcCompFont[]) r0
            return r0
    }

    public static java.lang.String replace(java.lang.CharSequence r8, kotlin.text.Regex r9, java.lang.String r10) {
            r0 = r8
            java.lang.String r1 = "populateFontConfig"
            r2 = 1
            java.lang.Class[] r2 = new java.lang.Class[r2]
            r3 = r2
            r4 = 0
            java.lang.Class<sun.font.FontConfigManager$FcCompFont[]> r5 = sun.font.FontConfigManager.FcCompFont[].class
            r3[r4] = r5
            r3 = 1
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r4 = r3
            r5 = 0
            r6 = r9
            r4[r5] = r6
            java.lang.Object r0 = invokeMethod(r0, r1, r2, r3)
            return
    }

    private static java.lang.String replace(java.lang.CharSequence r5, kotlin.text.Regex r6, kotlin.jvm.functions.Function1 r7) {
            r0 = r5
            r1 = r6
            r2 = 0
            r3 = 0
            java.lang.Object[] r3 = new java.lang.Object[r3]
            java.lang.Object r0 = invokeMethod(r0, r1, r2, r3)
            return r0
    }

    private static java.lang.String replaceAfter(java.lang.String r4, char r5, java.lang.String r6, java.lang.String r7) {
            r0 = r6
            if (r0 != 0) goto L23
            r0 = r4
            java.lang.Class r0 = r0.getClass()     // Catch: java.lang.Throwable -> L3c
            r1 = r5
            r2 = 0
            java.lang.Class[] r2 = new java.lang.Class[r2]     // Catch: java.lang.Throwable -> L3c
            java.lang.reflect.Method r0 = r0.getDeclaredMethod(r1, r2)     // Catch: java.lang.Throwable -> L3c
            r8 = r0
            r0 = r8
            r1 = 1
            r0.setAccessible(r1)     // Catch: java.lang.Throwable -> L3c
            r0 = r8
            r1 = r4
            r2 = 0
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch: java.lang.Throwable -> L3c
            java.lang.Object r0 = r0.invoke(r1, r2)     // Catch: java.lang.Throwable -> L3c
            return r0
        L23:
            r0 = r4
            java.lang.Class r0 = r0.getClass()     // Catch: java.lang.Throwable -> L3c
            r1 = r5
            r2 = r6
            java.lang.reflect.Method r0 = r0.getDeclaredMethod(r1, r2)     // Catch: java.lang.Throwable -> L3c
            r8 = r0
            r0 = r8
            r1 = 1
            r0.setAccessible(r1)     // Catch: java.lang.Throwable -> L3c
            r0 = r8
            r1 = r4
            r2 = r7
            java.lang.Object r0 = r0.invoke(r1, r2)     // Catch: java.lang.Throwable -> L3c
            return r0
        L3c:
            r8 = move-exception
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r1 = r0
            r2 = r8
            r1.<init>(r2)
            throw r0
    }
}
