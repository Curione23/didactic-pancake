package net.java.openjdk.cacio.ctc;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/caciocavallo.zip:caciocavallo/cacio-androidnw-1.10-SNAPSHOT.jar:net/java/openjdk/cacio/ctc/CTCAndroidInput.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/caciocavallo/cacio-androidnw-1.10-SNAPSHOT.jar:net/java/openjdk/cacio/ctc/CTCAndroidInput.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/caciocavallo.zip:caciocavallo/cacio-androidnw-1.10-SNAPSHOT.jar:net/java/openjdk/cacio/ctc/CTCAndroidInput.class */
public class CTCAndroidInput {
    public static final int EVENT_TYPE_CHAR = 1000;
    public static final int EVENT_TYPE_CURSOR_POS = 1003;
    public static final int EVENT_TYPE_KEY = 1005;
    public static final int EVENT_TYPE_MOUSE_BUTTON = 1006;
    public static final int EVENT_TYPE_SCROLL = 1007;
    public static net.java.openjdk.cacio.ctc.CTCRobotPeer mRobotPeer;

    public CTCAndroidInput() {
            r2 = this;
            r0 = r2
            r0.<init>()
            return
    }

    public static void receiveData(int r4, int r5, int r6, int r7, int r8) {
            r0 = r4
            switch(r0) {
                case 1000: goto L50;
                case 1001: goto L71;
                case 1002: goto L71;
                case 1003: goto L2c;
                case 1004: goto L71;
                case 1005: goto L37;
                case 1006: goto L5b;
                default: goto L71;
            }
        L2c:
            net.java.openjdk.cacio.ctc.CTCRobotPeer r0 = net.java.openjdk.cacio.ctc.CTCAndroidInput.mRobotPeer
            r1 = r5
            r2 = r6
            r0.mouseMove(r1, r2)
            goto L71
        L37:
            r0 = r7
            r1 = 1
            if (r0 != r1) goto L46
            net.java.openjdk.cacio.ctc.CTCRobotPeer r0 = net.java.openjdk.cacio.ctc.CTCAndroidInput.mRobotPeer
            r1 = r6
            r0.keyPress(r1)
            goto L71
        L46:
            net.java.openjdk.cacio.ctc.CTCRobotPeer r0 = net.java.openjdk.cacio.ctc.CTCAndroidInput.mRobotPeer
            r1 = r6
            r0.keyRelease(r1)
            goto L71
        L50:
            net.java.openjdk.cacio.ctc.CTCRobotPeer r0 = net.java.openjdk.cacio.ctc.CTCAndroidInput.mRobotPeer
            r1 = r5
            char r1 = (char) r1
            r0.keyPressUnchecked(r1)
            goto L71
        L5b:
            r0 = r6
            r1 = 1
            if (r0 != r1) goto L6a
            net.java.openjdk.cacio.ctc.CTCRobotPeer r0 = net.java.openjdk.cacio.ctc.CTCAndroidInput.mRobotPeer
            r1 = r5
            r0.mousePress(r1)
            goto L71
        L6a:
            net.java.openjdk.cacio.ctc.CTCRobotPeer r0 = net.java.openjdk.cacio.ctc.CTCAndroidInput.mRobotPeer
            r1 = r5
            r0.mouseRelease(r1)
        L71:
            return
    }

    static {
            net.java.openjdk.cacio.ctc.CTCRobotPeer r0 = new net.java.openjdk.cacio.ctc.CTCRobotPeer
            r1 = r0
            r1.<init>()
            net.java.openjdk.cacio.ctc.CTCAndroidInput.mRobotPeer = r0
            return
    }
}
