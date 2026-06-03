package com.github.caciocavallosilano.cacio.ctc;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/caciocavallo.zip:caciocavallo17/cacio-tta-1.19.1-SNAPSHOT.jar:com/github/caciocavallosilano/cacio/ctc/CTCToolkit.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/caciocavallo17/cacio-tta-1.19.1-SNAPSHOT.jar:com/github/caciocavallosilano/cacio/ctc/CTCToolkit.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/caciocavallo.zip:caciocavallo17/cacio-tta-1.19.1-SNAPSHOT.jar:com/github/caciocavallosilano/cacio/ctc/CTCToolkit.class */
public class CTCToolkit extends com.github.caciocavallosilano.cacio.peer.CacioToolkit {
    private com.github.caciocavallosilano.cacio.peer.PlatformWindowFactory platformWindowFactory;

    public CTCToolkit() {
            r3 = this;
            r0 = r3
            r0.<init>()
            r0 = r3
            r1 = 1
            r0.setDecorateWindows(r1)
            java.lang.String r0 = "swing.defaultlaf"
            java.lang.String r1 = "javax.swing.plaf.nimbus.NimbusLookAndFeel"
            java.lang.String r0 = java.lang.System.setProperty(r0, r1)
            return
    }

    @Override // com.github.caciocavallosilano.cacio.peer.CacioToolkit
    public com.github.caciocavallosilano.cacio.peer.PlatformWindowFactory getPlatformWindowFactory() {
            r6 = this;
            r0 = r6
            com.github.caciocavallosilano.cacio.peer.PlatformWindowFactory r0 = r0.platformWindowFactory
            if (r0 != 0) goto L1c
            com.github.caciocavallosilano.cacio.ctc.CTCScreen r0 = com.github.caciocavallosilano.cacio.ctc.CTCScreen.getInstance()
            r7 = r0
            com.github.caciocavallosilano.cacio.ctc.CTCEventSource r0 = com.github.caciocavallosilano.cacio.ctc.CTCEventSource.getInstance()
            r8 = r0
            r0 = r6
            com.github.caciocavallosilano.cacio.peer.managed.FullScreenWindowFactory r1 = new com.github.caciocavallosilano.cacio.peer.managed.FullScreenWindowFactory
            r2 = r1
            r3 = r7
            r4 = r8
            r2.<init>(r3, r4)
            r0.platformWindowFactory = r1
        L1c:
            r0 = r6
            com.github.caciocavallosilano.cacio.peer.PlatformWindowFactory r0 = r0.platformWindowFactory
            return r0
    }

    public java.awt.im.spi.InputMethodDescriptor getInputMethodAdapterDescriptor() throws java.awt.AWTException {
            r2 = this;
            r0 = 0
            return r0
    }

    @Override // com.github.caciocavallosilano.cacio.peer.CacioToolkit
    public java.awt.datatransfer.Clipboard getSystemClipboard() {
            r2 = this;
            com.github.caciocavallosilano.cacio.ctc.CTCClipboard r0 = com.github.caciocavallosilano.cacio.ctc.CTCClipboard.INSTANCE
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

    public java.awt.peer.RobotPeer createRobot(java.awt.GraphicsDevice r4) throws java.awt.AWTException {
            r3 = this;
            com.github.caciocavallosilano.cacio.ctc.CTCRobotPeer r0 = new com.github.caciocavallosilano.cacio.ctc.CTCRobotPeer
            r1 = r0
            r1.<init>()
            return r0
    }

    protected int getScreenWidth() {
            r2 = this;
            java.awt.Dimension r0 = com.github.caciocavallosilano.cacio.peer.managed.FullScreenWindowFactory.getScreenDimension()
            int r0 = r0.width
            return r0
    }

    protected int getScreenHeight() {
            r2 = this;
            java.awt.Dimension r0 = com.github.caciocavallosilano.cacio.peer.managed.FullScreenWindowFactory.getScreenDimension()
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

    public java.awt.peer.DesktopPeer createDesktopPeer(java.awt.Desktop r4) throws java.awt.HeadlessException {
            r3 = this;
            com.github.caciocavallosilano.cacio.ctc.CTCDesktopPeer r0 = new com.github.caciocavallosilano.cacio.ctc.CTCDesktopPeer
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

    public java.awt.peer.FramePeer createLightweightFrame(sun.awt.LightweightFrame r3) throws java.awt.HeadlessException {
            r2 = this;
            r0 = 0
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

    public boolean isTaskbarSupported() {
            r2 = this;
            r0 = 0
            return r0
    }
}
