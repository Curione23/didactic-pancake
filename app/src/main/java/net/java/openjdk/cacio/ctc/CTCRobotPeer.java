package net.java.openjdk.cacio.ctc;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/caciocavallo.zip:caciocavallo/cacio-androidnw-1.10-SNAPSHOT.jar:net/java/openjdk/cacio/ctc/CTCRobotPeer.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/caciocavallo/cacio-androidnw-1.10-SNAPSHOT.jar:net/java/openjdk/cacio/ctc/CTCRobotPeer.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/caciocavallo.zip:caciocavallo/cacio-androidnw-1.10-SNAPSHOT.jar:net/java/openjdk/cacio/ctc/CTCRobotPeer.class */
public class CTCRobotPeer implements java.awt.peer.RobotPeer {
    private static final int BUTTON_MASK_CONVERSION_SHIFT = 6;
    private static final int BUTTON_MASKS = 28;
    private static final int BUTTON_DOWN_MASKS = 7168;
    private int currentModifiers;
    private int currentX;
    private int currentY;
    private boolean enableInfdevHandler;
    private net.java.openjdk.cacio.ctc.MouseClickSupport mouseClickSupport;

    public CTCRobotPeer() {
            r4 = this;
            r0 = r4
            r0.<init>()
            r0 = r4
            r1 = 0
            r0.currentModifiers = r1
            r0 = r4
            r1 = 0
            r0.currentX = r1
            r0 = r4
            r1 = 0
            r0.currentY = r1
            r0 = r4
            r1 = 0
            r0.enableInfdevHandler = r1
            r0 = r4
            net.java.openjdk.cacio.ctc.MouseClickSupport r1 = new net.java.openjdk.cacio.ctc.MouseClickSupport
            r2 = r1
            r2.<init>()
            r0.mouseClickSupport = r1
            return
    }

    public CTCRobotPeer(boolean r5) {
            r4 = this;
            r0 = r4
            r0.<init>()
            r0 = r4
            r1 = 0
            r0.currentModifiers = r1
            r0 = r4
            r1 = 0
            r0.currentX = r1
            r0 = r4
            r1 = 0
            r0.currentY = r1
            r0 = r4
            r1 = 0
            r0.enableInfdevHandler = r1
            r0 = r4
            net.java.openjdk.cacio.ctc.MouseClickSupport r1 = new net.java.openjdk.cacio.ctc.MouseClickSupport
            r2 = r1
            r2.<init>()
            r0.mouseClickSupport = r1
            r0 = r4
            r1 = r5
            r0.enableInfdevHandler = r1
            return
    }

    private sun.awt.peer.cacio.managed.EventData mouseEvent(int r5, int r6, boolean r7) {
            r4 = this;
            sun.awt.peer.cacio.managed.EventData r0 = new sun.awt.peer.cacio.managed.EventData
            r1 = r0
            r1.<init>()
            r8 = r0
            r0 = r8
            r1 = r5
            r0.setId(r1)
            r0 = r8
            net.java.openjdk.cacio.ctc.CTCScreen r1 = net.java.openjdk.cacio.ctc.CTCScreen.getInstance()
            r0.setSource(r1)
            r0 = r8
            long r1 = java.lang.System.currentTimeMillis()
            r0.setTime(r1)
            r0 = r8
            r1 = r4
            int r1 = r1.currentModifiers
            r0.setModifiers(r1)
            r0 = r8
            r1 = r4
            int r1 = r1.currentX
            r0.setX(r1)
            r0 = r8
            r1 = r4
            int r1 = r1.currentY
            r0.setY(r1)
            r0 = r8
            r1 = r6
            r0.setButton(r1)
            r0 = r8
            r1 = r7
            r0.setPopup(r1)
            r0 = r8
            r1 = r4
            net.java.openjdk.cacio.ctc.MouseClickSupport r1 = r1.mouseClickSupport
            int r1 = r1.getClickCount()
            r0.setClickCount(r1)
            r0 = r8
            return r0
    }

    public void mouseMove(int r6, int r7) {
            r5 = this;
            r0 = r5
            boolean r0 = r0.enableInfdevHandler
            if (r0 == 0) goto L11
            r0 = r5
            r1 = r6
            r2 = r7
            boolean r0 = net.java.openjdk.cacio.ctc.InfdevGrabHandler.robotMouseEvent(r0, r1, r2)
            if (r0 == 0) goto L11
            return
        L11:
            r0 = r5
            r1 = r6
            r0.currentX = r1
            r0 = r5
            r1 = r7
            r0.currentY = r1
            r0 = r5
            boolean r0 = r0.isButtonPressed()
            if (r0 == 0) goto L28
            r0 = 503(0x1f7, float:7.05E-43)
            goto L2b
        L28:
            r0 = 506(0x1fa, float:7.09E-43)
        L2b:
            r8 = r0
            r0 = r5
            r1 = r8
            r2 = 0
            r3 = 0
            sun.awt.peer.cacio.managed.EventData r0 = r0.mouseEvent(r1, r2, r3)
            r9 = r0
            net.java.openjdk.cacio.ctc.CTCEventSource r0 = net.java.openjdk.cacio.ctc.CTCEventSource.getInstance()
            r1 = r9
            r0.postEvent(r1)
            sun.awt.peer.cacio.CacioMouseInfoPeer r0 = sun.awt.peer.cacio.CacioMouseInfoPeer.getInstance()
            r1 = r6
            r2 = r7
            r0.setMouseScreenCoordinates(r1, r2)
            return
    }

    private boolean isButtonPressed() {
            r3 = this;
            r0 = r3
            int r0 = r0.currentModifiers
            r1 = 28
            r0 = r0 & r1
            if (r0 != 0) goto Le
            r0 = 1
            goto Lf
        Le:
            r0 = 0
        Lf:
            return r0
    }

    public void mousePress(int r6) {
            r5 = this;
            r0 = r5
            r1 = r6
            int r0 = r0.buttonDownToButtonMask(r1)
            r7 = r0
            r0 = r5
            r1 = r6
            int r0 = r0.buttonToButtonDownMask(r1)
            r8 = r0
            r0 = r8
            if (r0 == 0) goto L45
            r0 = r7
            if (r0 == 0) goto L45
            r0 = r5
            r1 = r0
            int r1 = r1.currentModifiers
            r2 = r7
            r1 = r1 | r2
            r0.currentModifiers = r1
            r0 = r5
            r1 = 501(0x1f5, float:7.02E-43)
            r2 = r8
            r3 = 0
            sun.awt.peer.cacio.managed.EventData r0 = r0.mouseEvent(r1, r2, r3)
            r9 = r0
            r0 = r5
            net.java.openjdk.cacio.ctc.MouseClickSupport r0 = r0.mouseClickSupport
            r1 = r9
            r0.mouseEvent(r1)
            r0 = r5
            r1 = 501(0x1f5, float:7.02E-43)
            r2 = r8
            r3 = 0
            sun.awt.peer.cacio.managed.EventData r0 = r0.mouseEvent(r1, r2, r3)
            r9 = r0
            net.java.openjdk.cacio.ctc.CTCEventSource r0 = net.java.openjdk.cacio.ctc.CTCEventSource.getInstance()
            r1 = r9
            r0.postEvent(r1)
        L45:
            return
    }

    public void mouseRelease(int r7) {
            r6 = this;
            r0 = r6
            r1 = r7
            int r0 = r0.buttonDownToButtonMask(r1)
            r8 = r0
            r0 = r6
            r1 = r7
            int r0 = r0.buttonToButtonDownMask(r1)
            r9 = r0
            r0 = r9
            if (r0 == 0) goto L51
            r0 = r8
            if (r0 == 0) goto L51
            r0 = r6
            r1 = 502(0x1f6, float:7.03E-43)
            r2 = r9
            r3 = r7
            r4 = 4
            r3 = r3 & r4
            if (r3 == 0) goto L23
            r3 = 1
            goto L24
        L23:
            r3 = 0
        L24:
            sun.awt.peer.cacio.managed.EventData r0 = r0.mouseEvent(r1, r2, r3)
            r10 = r0
            net.java.openjdk.cacio.ctc.CTCEventSource r0 = net.java.openjdk.cacio.ctc.CTCEventSource.getInstance()
            r1 = r10
            r0.postEvent(r1)
            r0 = r6
            r1 = 502(0x1f6, float:7.03E-43)
            r2 = r9
            r3 = 0
            sun.awt.peer.cacio.managed.EventData r0 = r0.mouseEvent(r1, r2, r3)
            r10 = r0
            r0 = r6
            net.java.openjdk.cacio.ctc.MouseClickSupport r0 = r0.mouseClickSupport
            r1 = r10
            r0.mouseEvent(r1)
            r0 = r6
            r1 = r0
            int r1 = r1.currentModifiers
            r2 = r8
            r3 = -1
            r2 = r2 ^ r3
            r1 = r1 & r2
            r0.currentModifiers = r1
        L51:
            return
    }

    private int buttonToButtonDownMask(int r5) {
            r4 = this;
            r0 = r5
            r1 = 7168(0x1c00, float:1.0045E-41)
            r0 = r0 & r1
            r6 = r0
            r0 = r6
            r1 = r5
            r2 = 28
            r1 = r1 & r2
            r2 = 6
            int r1 = r1 << r2
            r0 = r0 | r1
            r6 = r0
            r0 = r6
            return r0
    }

    private int buttonDownToButtonMask(int r5) {
            r4 = this;
            r0 = r5
            r1 = 28
            r0 = r0 & r1
            r6 = r0
            r0 = r6
            r1 = r5
            r2 = 7168(0x1c00, float:1.0045E-41)
            r1 = r1 & r2
            r2 = 6
            int r1 = r1 >> r2
            r0 = r0 | r1
            r6 = r0
            r0 = r6
            return r0
    }

    public void mouseWheel(int r2) {
            r1 = this;
            return
    }

    private void keyEvent(int r5, int r6) {
            r4 = this;
            sun.awt.peer.cacio.managed.EventData r0 = new sun.awt.peer.cacio.managed.EventData
            r1 = r0
            r1.<init>()
            r7 = r0
            r0 = r7
            net.java.openjdk.cacio.ctc.CTCScreen r1 = net.java.openjdk.cacio.ctc.CTCScreen.getInstance()
            r0.setSource(r1)
            r0 = r7
            r1 = r6
            r0.setId(r1)
            r0 = r7
            long r1 = java.lang.System.currentTimeMillis()
            r0.setTime(r1)
            r0 = r7
            r1 = r4
            int r1 = r1.currentModifiers
            r0.setModifiers(r1)
            r0 = r7
            r1 = r5
            r0.setKeyCode(r1)
            net.java.openjdk.cacio.ctc.CTCEventSource r0 = net.java.openjdk.cacio.ctc.CTCEventSource.getInstance()
            r1 = r7
            r0.postEvent(r1)
            return
    }

    public void keyPress(int r5) {
            r4 = this;
            r0 = r5
            r1 = 16
            if (r0 != r1) goto L10
            r0 = r4
            r1 = r0
            int r1 = r1.currentModifiers
            r2 = 1
            r1 = r1 | r2
            r0.currentModifiers = r1
        L10:
            r0 = r5
            r1 = 20
            if (r0 != r1) goto L38
            r0 = r4
            int r0 = r0.currentModifiers
            r1 = 1
            r0 = r0 & r1
            r1 = 1
            if (r0 != r1) goto L2e
            r0 = r4
            r1 = r0
            int r1 = r1.currentModifiers
            r2 = -2
            r1 = r1 & r2
            r0.currentModifiers = r1
            goto L38
        L2e:
            r0 = r4
            r1 = r0
            int r1 = r1.currentModifiers
            r2 = 1
            r1 = r1 | r2
            r0.currentModifiers = r1
        L38:
            r0 = r5
            r1 = 17
            if (r0 != r1) goto L48
            r0 = r4
            r1 = r0
            int r1 = r1.currentModifiers
            r2 = 2
            r1 = r1 | r2
            r0.currentModifiers = r1
        L48:
            r0 = r5
            r1 = 65406(0xff7e, float:9.1653E-41)
            if (r0 != r1) goto L59
            r0 = r4
            r1 = r0
            int r1 = r1.currentModifiers
            r2 = 32
            r1 = r1 | r2
            r0.currentModifiers = r1
        L59:
            r0 = r4
            r1 = r5
            r2 = 401(0x191, float:5.62E-43)
            r0.keyEvent(r1, r2)
            r0 = r4
            r1 = r5
            r2 = r4
            int r2 = r2.currentModifiers
            char r0 = r0.getKeyCharFromCodeAndMods(r1, r2)
            r6 = r0
            r0 = r6
            r1 = 65535(0xffff, float:9.1834E-41)
            if (r0 == r1) goto La2
            sun.awt.peer.cacio.managed.EventData r0 = new sun.awt.peer.cacio.managed.EventData
            r1 = r0
            r1.<init>()
            r7 = r0
            r0 = r7
            net.java.openjdk.cacio.ctc.CTCScreen r1 = net.java.openjdk.cacio.ctc.CTCScreen.getInstance()
            r0.setSource(r1)
            r0 = r7
            r1 = 400(0x190, float:5.6E-43)
            r0.setId(r1)
            r0 = r7
            long r1 = java.lang.System.currentTimeMillis()
            r0.setTime(r1)
            r0 = r7
            r1 = r4
            int r1 = r1.currentModifiers
            r0.setModifiers(r1)
            r0 = r7
            r1 = r6
            r0.setKeyChar(r1)
            net.java.openjdk.cacio.ctc.CTCEventSource r0 = net.java.openjdk.cacio.ctc.CTCEventSource.getInstance()
            r1 = r7
            r0.postEvent(r1)
        La2:
            return
    }

    public void keyPressUnchecked(char r5) {
            r4 = this;
            r0 = r5
            r1 = 65535(0xffff, float:9.1834E-41)
            if (r0 == r1) goto L37
            sun.awt.peer.cacio.managed.EventData r0 = new sun.awt.peer.cacio.managed.EventData
            r1 = r0
            r1.<init>()
            r6 = r0
            r0 = r6
            net.java.openjdk.cacio.ctc.CTCScreen r1 = net.java.openjdk.cacio.ctc.CTCScreen.getInstance()
            r0.setSource(r1)
            r0 = r6
            r1 = 400(0x190, float:5.6E-43)
            r0.setId(r1)
            r0 = r6
            long r1 = java.lang.System.currentTimeMillis()
            r0.setTime(r1)
            r0 = r6
            r1 = r4
            int r1 = r1.currentModifiers
            r0.setModifiers(r1)
            r0 = r6
            r1 = r5
            r0.setKeyChar(r1)
            net.java.openjdk.cacio.ctc.CTCEventSource r0 = net.java.openjdk.cacio.ctc.CTCEventSource.getInstance()
            r1 = r6
            r0.postEvent(r1)
        L37:
            return
    }

    private char getKeyCharFromCodeAndMods(int r5, int r6) {
            r4 = this;
            net.java.openjdk.cacio.ctc.KeyStrokeMappingFactory r0 = net.java.openjdk.cacio.ctc.KeyStrokeMappingFactory.getInstance()
            net.java.openjdk.cacio.ctc.KeyStrokeMapping r0 = r0.getKeyStrokeMapping()
            r1 = r5
            r2 = r6
            char r0 = r0.getKeyChar(r1, r2)
            return r0
    }

    public void keyRelease(int r5) {
            r4 = this;
            r0 = r5
            r1 = 16
            if (r0 != r1) goto L11
            r0 = r4
            r1 = r0
            int r1 = r1.currentModifiers
            r2 = -2
            r1 = r1 & r2
            r0.currentModifiers = r1
        L11:
            r0 = r5
            r1 = 17
            if (r0 != r1) goto L22
            r0 = r4
            r1 = r0
            int r1 = r1.currentModifiers
            r2 = -3
            r1 = r1 & r2
            r0.currentModifiers = r1
        L22:
            r0 = r5
            r1 = 65406(0xff7e, float:9.1653E-41)
            if (r0 != r1) goto L33
            r0 = r4
            r1 = r0
            int r1 = r1.currentModifiers
            r2 = -33
            r1 = r1 & r2
            r0.currentModifiers = r1
        L33:
            r0 = r4
            r1 = r5
            r2 = 402(0x192, float:5.63E-43)
            r0.keyEvent(r1, r2)
            return
    }

    public int getRGBPixel(int r5, int r6) {
            r4 = this;
            net.java.openjdk.cacio.ctc.CTCScreen r0 = net.java.openjdk.cacio.ctc.CTCScreen.getInstance()
            r1 = r5
            r2 = r6
            int r0 = r0.getRGBPixel(r1, r2)
            return r0
    }

    public int[] getRGBPixels(java.awt.Rectangle r4) {
            r3 = this;
            net.java.openjdk.cacio.ctc.CTCScreen r0 = net.java.openjdk.cacio.ctc.CTCScreen.getInstance()
            r1 = r4
            int[] r0 = r0.getRGBPixels(r1)
            return r0
    }

    public void dispose() {
            r1 = this;
            return
    }
}
