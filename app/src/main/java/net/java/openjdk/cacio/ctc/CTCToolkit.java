package net.java.openjdk.cacio.ctc;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/caciocavallo.zip:caciocavallo/cacio-androidnw-1.10-SNAPSHOT.jar:net/java/openjdk/cacio/ctc/CTCToolkit.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/caciocavallo/cacio-androidnw-1.10-SNAPSHOT.jar:net/java/openjdk/cacio/ctc/CTCToolkit.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/caciocavallo.zip:caciocavallo/cacio-androidnw-1.10-SNAPSHOT.jar:net/java/openjdk/cacio/ctc/CTCToolkit.class */
public class CTCToolkit extends sun.awt.peer.cacio.CacioToolkit {
    private sun.awt.peer.cacio.PlatformWindowFactory platformWindowFactory;

    public CTCToolkit() {
            r3 = this;
            r0 = r3
            r0.<init>()
            r0 = r3
            r1 = 1
            r0.setDecorateWindows(r1)
            return
    }

    public static boolean isHeadless() {
            r0 = 0
            return r0
    }

    @Override // sun.awt.peer.cacio.CacioToolkit
    public sun.awt.peer.cacio.PlatformWindowFactory getPlatformWindowFactory() {
            r6 = this;
            r0 = r6
            sun.awt.peer.cacio.PlatformWindowFactory r0 = r0.platformWindowFactory
            if (r0 != 0) goto L1c
            net.java.openjdk.cacio.ctc.CTCScreen r0 = net.java.openjdk.cacio.ctc.CTCScreen.getInstance()
            r7 = r0
            net.java.openjdk.cacio.ctc.CTCEventSource r0 = net.java.openjdk.cacio.ctc.CTCEventSource.getInstance()
            r8 = r0
            r0 = r6
            sun.awt.peer.cacio.managed.FullScreenWindowFactory r1 = new sun.awt.peer.cacio.managed.FullScreenWindowFactory
            r2 = r1
            r3 = r7
            r4 = r8
            r2.<init>(r3, r4)
            r0.platformWindowFactory = r1
        L1c:
            r0 = r6
            sun.awt.peer.cacio.PlatformWindowFactory r0 = r0.platformWindowFactory
            return r0
    }

    public java.awt.im.spi.InputMethodDescriptor getInputMethodAdapterDescriptor() throws java.awt.AWTException {
            r2 = this;
            r0 = 0
            return r0
    }

    @Override // sun.awt.peer.cacio.CacioToolkit
    public java.awt.datatransfer.Clipboard getSystemClipboard() {
            r2 = this;
            net.java.openjdk.cacio.ctc.CTCClipboard r0 = net.java.openjdk.cacio.ctc.CTCClipboard.INSTANCE
            return r0
    }

    public java.awt.dnd.peer.DragSourceContextPeer createDragSourceContextPeer(java.awt.dnd.DragGestureEvent r3) throws java.awt.dnd.InvalidDnDOperationException {
            r2 = this;
            r0 = 0
            return r0
    }

    public java.awt.peer.TrayIconPeer createTrayIcon(java.awt.TrayIcon r3) throws java.awt.HeadlessException, java.awt.AWTException {
            r2 = this;
            r0 = 0
            return r0
    }

    public java.awt.peer.SystemTrayPeer createSystemTray(java.awt.SystemTray r3) {
            r2 = this;
            r0 = 0
            return r0
    }

    public boolean isTraySupported() {
            r2 = this;
            r0 = 0
            return r0
    }

    public java.awt.peer.FontPeer getFontPeer(java.lang.String r3, int r4) {
            r2 = this;
            r0 = 0
            return r0
    }

    public java.awt.peer.RobotPeer createRobot(java.awt.Robot r6, java.awt.GraphicsDevice r7) throws java.awt.AWTException {
            r5 = this;
            net.java.openjdk.cacio.ctc.CTCRobotPeer r0 = new net.java.openjdk.cacio.ctc.CTCRobotPeer
            r1 = r0
            java.lang.String r2 = "net.openjdk.cacio.ctc.CTCToolkit.enableInfdevMouseHandler"
            java.lang.String r3 = "true"
            java.lang.String r2 = java.lang.System.getProperty(r2, r3)
            boolean r2 = java.lang.Boolean.parseBoolean(r2)
            r1.<init>(r2)
            return r0
    }

    protected int getScreenWidth() {
            r2 = this;
            java.awt.Dimension r0 = sun.awt.peer.cacio.managed.FullScreenWindowFactory.getScreenDimension()
            int r0 = r0.width
            return r0
    }

    protected int getScreenHeight() {
            r2 = this;
            java.awt.Dimension r0 = sun.awt.peer.cacio.managed.FullScreenWindowFactory.getScreenDimension()
            int r0 = r0.height
            return r0
    }

    protected boolean syncNativeQueue(long r3) {
            r2 = this;
            r0 = 0
            return r0
    }

    public void grab(java.awt.Window r2) {
            r1 = this;
            return
    }

    public void ungrab(java.awt.Window r2) {
            r1 = this;
            return
    }

    public boolean isDesktopSupported() {
            r2 = this;
            r0 = 1
            return r0
    }

    protected java.awt.peer.DesktopPeer createDesktopPeer(java.awt.Desktop r4) throws java.awt.HeadlessException {
            r3 = this;
            net.java.openjdk.cacio.ctc.CTCDesktopPeer r0 = new net.java.openjdk.cacio.ctc.CTCDesktopPeer
            r1 = r0
            r1.<init>()
            return r0
    }

    public java.awt.image.ColorModel getColorModel() throws java.awt.HeadlessException {
            r2 = this;
            r0 = 0
            return r0
    }

    public void sync() {
            r1 = this;
            return
    }

    public java.awt.PrintJob getPrintJob(java.awt.Frame r3, java.lang.String r4, java.util.Properties r5) {
            r2 = this;
            r0 = 0
            return r0
    }

    public void beep() {
            r1 = this;
            return
    }

    public java.util.Map<java.awt.font.TextAttribute, ?> mapInputMethodHighlight(java.awt.im.InputMethodHighlight r3) throws java.awt.HeadlessException {
            r2 = this;
            r0 = 0
            return r0
    }

    @Override // sun.awt.peer.cacio.CacioToolkit
    public java.awt.peer.FramePeer createLightweightFrame(sun.awt.LightweightFrame r6) throws java.awt.HeadlessException {
            r5 = this;
            sun.awt.peer.cacio.CacioLightweightFramePeer r0 = new sun.awt.peer.cacio.CacioLightweightFramePeer
            r1 = r0
            r2 = r6
            r3 = r5
            sun.awt.peer.cacio.PlatformWindowFactory r3 = r3.platformWindowFactory
            r1.<init>(r2, r3)
            return r0
    }

    public sun.awt.datatransfer.DataTransferer getDataTransferer() {
            r2 = this;
            r0 = 0
            return r0
    }

    public boolean isWindowOpacitySupported() {
            r2 = this;
            r0 = 1
            return r0
    }

    public boolean isWindowShapingSupported() {
            r2 = this;
            r0 = 1
            return r0
    }

    public boolean isWindowTranslucencySupported() {
            r2 = this;
            r0 = 1
            return r0
    }

    public boolean isTranslucencyCapable(java.awt.GraphicsConfiguration r3) {
            r2 = this;
            r0 = 1
            return r0
    }

    public java.awt.Cursor createCustomCursor(java.awt.Image r5, java.awt.Point r6, java.lang.String r7) {
            r4 = this;
            java.io.PrintStream r0 = java.lang.System.out
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r2 = r1
            r2.<init>()
            java.lang.String r2 = "cursor="
            java.lang.StringBuilder r1 = r1.append(r2)
            r2 = r5
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = " hotspot="
            java.lang.StringBuilder r1 = r1.append(r2)
            r2 = r6
            java.lang.String r2 = r2.toString()
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = " name="
            java.lang.StringBuilder r1 = r1.append(r2)
            r2 = r7
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.println(r1)
            java.awt.Cursor r0 = new java.awt.Cursor
            r1 = r0
            r2 = 0
            r1.<init>(r2)
            return r0
    }

    static {
            java.lang.String r0 = "os.name"
            java.lang.String r0 = java.lang.System.getProperty(r0)
            java.lang.String r1 = "Linux"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L27
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = r0
            r1.<init>()
            java.lang.String r1 = "POJAV_NATIVEDIR"
            java.lang.String r1 = java.lang.System.getenv(r1)
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = "/libpojavexec_awt.so"
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.System.load(r0)
        L27:
            return
    }
}
