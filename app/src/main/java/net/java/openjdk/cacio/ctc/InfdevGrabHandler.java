package net.java.openjdk.cacio.ctc;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/caciocavallo.zip:caciocavallo/cacio-androidnw-1.10-SNAPSHOT.jar:net/java/openjdk/cacio/ctc/InfdevGrabHandler.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/caciocavallo/cacio-androidnw-1.10-SNAPSHOT.jar:net/java/openjdk/cacio/ctc/InfdevGrabHandler.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:net/java/openjdk/cacio/ctc/InfdevGrabHandler.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:net/java/openjdk/cacio/ctc/InfdevGrabHandler.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/caciocavallo.zip:caciocavallo/cacio-androidnw-1.10-SNAPSHOT.jar:net/java/openjdk/cacio/ctc/InfdevGrabHandler.class */
public class InfdevGrabHandler {
    private static boolean eventSelfSubmitted;
    private static net.java.openjdk.cacio.ctc.ExternalMouseReader externalMouseReader;
    private static boolean isGrabbing;
    private static int lx;
    private static int ly;

    public InfdevGrabHandler() {
            r2 = this;
            r0 = r2
            r0.<init>()
            return
    }

    public static boolean robotMouseEvent(net.java.openjdk.cacio.ctc.CTCRobotPeer r5, int r6, int r7) {
            boolean r0 = net.java.openjdk.cacio.ctc.InfdevGrabHandler.isGrabbing
            if (r0 != 0) goto L8
            r0 = 0
            return r0
        L8:
            boolean r0 = net.java.openjdk.cacio.ctc.InfdevGrabHandler.eventSelfSubmitted
            if (r0 == 0) goto L14
            r0 = 0
            net.java.openjdk.cacio.ctc.InfdevGrabHandler.eventSelfSubmitted = r0
            r0 = 0
            return r0
        L14:
            net.java.openjdk.cacio.ctc.ExternalMouseReader r0 = net.java.openjdk.cacio.ctc.InfdevGrabHandler.externalMouseReader
            if (r0 == 0) goto L4d
            r0 = 1
            net.java.openjdk.cacio.ctc.InfdevGrabHandler.eventSelfSubmitted = r0
            net.java.openjdk.cacio.ctc.ExternalMouseReader r0 = net.java.openjdk.cacio.ctc.InfdevGrabHandler.externalMouseReader
            int r0 = r0.getX()
            r8 = r0
            net.java.openjdk.cacio.ctc.ExternalMouseReader r0 = net.java.openjdk.cacio.ctc.InfdevGrabHandler.externalMouseReader
            int r0 = r0.getY()
            r9 = r0
            r0 = r5
            r1 = r6
            r2 = r8
            int r1 = r1 + r2
            int r2 = net.java.openjdk.cacio.ctc.InfdevGrabHandler.lx
            int r1 = r1 - r2
            r2 = r7
            int r3 = net.java.openjdk.cacio.ctc.InfdevGrabHandler.ly
            int r2 = r2 + r3
            r3 = r9
            int r2 = r2 - r3
            r0.mouseMove(r1, r2)
            r0 = r8
            net.java.openjdk.cacio.ctc.InfdevGrabHandler.lx = r0
            r0 = r9
            net.java.openjdk.cacio.ctc.InfdevGrabHandler.ly = r0
        L4d:
            r0 = 1
            return r0
    }

    public static void setMouseReader(net.java.openjdk.cacio.ctc.ExternalMouseReader r2) {
            r0 = r2
            net.java.openjdk.cacio.ctc.InfdevGrabHandler.externalMouseReader = r0
            return
    }

    public static void setGrabbed(boolean r2) {
            r0 = r2
            net.java.openjdk.cacio.ctc.InfdevGrabHandler.isGrabbing = r0
            boolean r0 = net.java.openjdk.cacio.ctc.InfdevGrabHandler.isGrabbing
            if (r0 == 0) goto L20
            net.java.openjdk.cacio.ctc.ExternalMouseReader r0 = net.java.openjdk.cacio.ctc.InfdevGrabHandler.externalMouseReader
            int r0 = r0.getX()
            net.java.openjdk.cacio.ctc.InfdevGrabHandler.lx = r0
            net.java.openjdk.cacio.ctc.ExternalMouseReader r0 = net.java.openjdk.cacio.ctc.InfdevGrabHandler.externalMouseReader
            int r0 = r0.getY()
            net.java.openjdk.cacio.ctc.InfdevGrabHandler.ly = r0
        L20:
            return
    }
}
