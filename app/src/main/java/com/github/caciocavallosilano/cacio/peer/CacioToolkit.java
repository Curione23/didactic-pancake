package com.github.caciocavallosilano.cacio.peer;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/caciocavallo.zip:caciocavallo17/cacio-shared-1.19.1-SNAPSHOT.jar:com/github/caciocavallosilano/cacio/peer/CacioToolkit.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/caciocavallo17/cacio-shared-1.19.1-SNAPSHOT.jar:com/github/caciocavallosilano/cacio/peer/CacioToolkit.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/caciocavallo.zip:caciocavallo17/cacio-shared-1.19.1-SNAPSHOT.jar:com/github/caciocavallosilano/cacio/peer/CacioToolkit.class */
public abstract class CacioToolkit extends sun.awt.SunToolkit {
    private static final int DEFAULT_SCREEN_RESOLUTION = 96;
    private static final int screenResolution = 0;
    private java.awt.datatransfer.Clipboard clipboard;

    private static boolean isLinux() {
            java.lang.String r0 = "Linux"
            java.lang.String r1 = "os.name"
            java.lang.String r1 = java.lang.System.getProperty(r1)
            boolean r0 = r0.equals(r1)
            return r0
    }

    public CacioToolkit() {
            r5 = this;
            r0 = r5
            r0.<init>()
            r0 = r5
            com.github.caciocavallosilano.cacio.peer.PlatformWindowFactory r0 = r0.getPlatformWindowFactory()
            com.github.caciocavallosilano.cacio.peer.CacioEventPump r0 = r0.createEventPump()
            r6 = r0
            r0 = r6
            r0.start()
            r0 = r5
            java.awt.datatransfer.Clipboard r1 = new java.awt.datatransfer.Clipboard
            r2 = r1
            java.lang.String r3 = "Cacio system clipboard"
            r2.<init>(r3)
            r0.clipboard = r1
            return
    }

    public java.awt.peer.ButtonPeer createButton(java.awt.Button r6) throws java.awt.HeadlessException {
            r5 = this;
            com.github.caciocavallosilano.cacio.peer.CacioButtonPeer r0 = new com.github.caciocavallosilano.cacio.peer.CacioButtonPeer
            r1 = r0
            r2 = r6
            r3 = r5
            com.github.caciocavallosilano.cacio.peer.PlatformWindowFactory r3 = r3.getPlatformWindowFactory()
            r1.<init>(r2, r3)
            r7 = r0
            r0 = r6
            r1 = r7
            sun.awt.SunToolkit.targetCreatedPeer(r0, r1)
            r0 = r7
            return r0
    }

    public java.awt.peer.CanvasPeer createCanvas(java.awt.Canvas r6) {
            r5 = this;
            com.github.caciocavallosilano.cacio.peer.CacioCanvasPeer r0 = new com.github.caciocavallosilano.cacio.peer.CacioCanvasPeer
            r1 = r0
            r2 = r6
            r3 = r5
            com.github.caciocavallosilano.cacio.peer.PlatformWindowFactory r3 = r3.getPlatformWindowFactory()
            r1.<init>(r2, r3)
            r7 = r0
            r0 = r6
            r1 = r7
            sun.awt.SunToolkit.targetCreatedPeer(r0, r1)
            r0 = r7
            return r0
    }

    public java.awt.peer.CheckboxPeer createCheckbox(java.awt.Checkbox r6) throws java.awt.HeadlessException {
            r5 = this;
            com.github.caciocavallosilano.cacio.peer.CacioCheckboxPeer r0 = new com.github.caciocavallosilano.cacio.peer.CacioCheckboxPeer
            r1 = r0
            r2 = r6
            r3 = r5
            com.github.caciocavallosilano.cacio.peer.PlatformWindowFactory r3 = r3.getPlatformWindowFactory()
            r1.<init>(r2, r3)
            r7 = r0
            r0 = r6
            r1 = r7
            sun.awt.SunToolkit.targetCreatedPeer(r0, r1)
            r0 = r7
            return r0
    }

    public java.awt.peer.CheckboxMenuItemPeer createCheckboxMenuItem(java.awt.CheckboxMenuItem r5) throws java.awt.HeadlessException {
            r4 = this;
            com.github.caciocavallosilano.cacio.peer.CacioCheckboxMenuItemPeer r0 = new com.github.caciocavallosilano.cacio.peer.CacioCheckboxMenuItemPeer
            r1 = r0
            r2 = r5
            r1.<init>(r2)
            r6 = r0
            r0 = r5
            r1 = r6
            sun.awt.SunToolkit.targetCreatedPeer(r0, r1)
            r0 = r6
            return r0
    }

    public java.awt.peer.ChoicePeer createChoice(java.awt.Choice r6) throws java.awt.HeadlessException {
            r5 = this;
            com.github.caciocavallosilano.cacio.peer.CacioChoicePeer r0 = new com.github.caciocavallosilano.cacio.peer.CacioChoicePeer
            r1 = r0
            r2 = r6
            r3 = r5
            com.github.caciocavallosilano.cacio.peer.PlatformWindowFactory r3 = r3.getPlatformWindowFactory()
            r1.<init>(r2, r3)
            r7 = r0
            r0 = r6
            r1 = r7
            sun.awt.SunToolkit.targetCreatedPeer(r0, r1)
            r0 = r7
            return r0
    }

    public java.awt.peer.DialogPeer createDialog(java.awt.Dialog r6) throws java.awt.HeadlessException {
            r5 = this;
            com.github.caciocavallosilano.cacio.peer.CacioDialogPeer r0 = new com.github.caciocavallosilano.cacio.peer.CacioDialogPeer
            r1 = r0
            r2 = r6
            r3 = r5
            com.github.caciocavallosilano.cacio.peer.PlatformWindowFactory r3 = r3.getPlatformWindowFactory()
            r1.<init>(r2, r3)
            r7 = r0
            r0 = r6
            r1 = r7
            sun.awt.SunToolkit.targetCreatedPeer(r0, r1)
            r0 = r7
            return r0
    }

    public java.awt.peer.FileDialogPeer createFileDialog(java.awt.FileDialog r6) throws java.awt.HeadlessException {
            r5 = this;
            com.github.caciocavallosilano.cacio.peer.CacioFileDialogPeer r0 = new com.github.caciocavallosilano.cacio.peer.CacioFileDialogPeer
            r1 = r0
            r2 = r6
            r3 = r5
            com.github.caciocavallosilano.cacio.peer.PlatformWindowFactory r3 = r3.getPlatformWindowFactory()
            r1.<init>(r2, r3)
            r7 = r0
            r0 = r6
            r1 = r7
            sun.awt.SunToolkit.targetCreatedPeer(r0, r1)
            r0 = r7
            return r0
    }

    public java.awt.peer.FramePeer createFrame(java.awt.Frame r6) throws java.awt.HeadlessException {
            r5 = this;
            com.github.caciocavallosilano.cacio.peer.CacioFramePeer r0 = new com.github.caciocavallosilano.cacio.peer.CacioFramePeer
            r1 = r0
            r2 = r6
            r3 = r5
            com.github.caciocavallosilano.cacio.peer.PlatformWindowFactory r3 = r3.getPlatformWindowFactory()
            r1.<init>(r2, r3)
            r7 = r0
            r0 = r6
            r1 = r7
            sun.awt.SunToolkit.targetCreatedPeer(r0, r1)
            r0 = r7
            return r0
    }

    public java.awt.peer.LabelPeer createLabel(java.awt.Label r6) throws java.awt.HeadlessException {
            r5 = this;
            com.github.caciocavallosilano.cacio.peer.CacioLabelPeer r0 = new com.github.caciocavallosilano.cacio.peer.CacioLabelPeer
            r1 = r0
            r2 = r6
            r3 = r5
            com.github.caciocavallosilano.cacio.peer.PlatformWindowFactory r3 = r3.getPlatformWindowFactory()
            r1.<init>(r2, r3)
            r7 = r0
            r0 = r6
            r1 = r7
            sun.awt.SunToolkit.targetCreatedPeer(r0, r1)
            r0 = r7
            return r0
    }

    public java.awt.peer.ListPeer createList(java.awt.List r6) throws java.awt.HeadlessException {
            r5 = this;
            com.github.caciocavallosilano.cacio.peer.CacioListPeer r0 = new com.github.caciocavallosilano.cacio.peer.CacioListPeer
            r1 = r0
            r2 = r6
            r3 = r5
            com.github.caciocavallosilano.cacio.peer.PlatformWindowFactory r3 = r3.getPlatformWindowFactory()
            r1.<init>(r2, r3)
            r7 = r0
            r0 = r6
            r1 = r7
            sun.awt.SunToolkit.targetCreatedPeer(r0, r1)
            r0 = r7
            return r0
    }

    public java.awt.peer.MenuPeer createMenu(java.awt.Menu r5) throws java.awt.HeadlessException {
            r4 = this;
            com.github.caciocavallosilano.cacio.peer.CacioMenuPeer r0 = new com.github.caciocavallosilano.cacio.peer.CacioMenuPeer
            r1 = r0
            r2 = r5
            r1.<init>(r2)
            r6 = r0
            r0 = r5
            r1 = r6
            sun.awt.SunToolkit.targetCreatedPeer(r0, r1)
            r0 = r6
            return r0
    }

    public java.awt.peer.MenuBarPeer createMenuBar(java.awt.MenuBar r5) throws java.awt.HeadlessException {
            r4 = this;
            com.github.caciocavallosilano.cacio.peer.CacioMenuBarPeer r0 = new com.github.caciocavallosilano.cacio.peer.CacioMenuBarPeer
            r1 = r0
            r2 = r5
            r1.<init>(r2)
            r6 = r0
            r0 = r5
            r1 = r6
            sun.awt.SunToolkit.targetCreatedPeer(r0, r1)
            r0 = r6
            return r0
    }

    public java.awt.peer.MenuItemPeer createMenuItem(java.awt.MenuItem r5) throws java.awt.HeadlessException {
            r4 = this;
            com.github.caciocavallosilano.cacio.peer.CacioMenuItemPeer r0 = new com.github.caciocavallosilano.cacio.peer.CacioMenuItemPeer
            r1 = r0
            r2 = r5
            r1.<init>(r2)
            r6 = r0
            r0 = r5
            r1 = r6
            sun.awt.SunToolkit.targetCreatedPeer(r0, r1)
            r0 = r6
            return r0
    }

    public java.awt.peer.PanelPeer createPanel(java.awt.Panel r6) {
            r5 = this;
            com.github.caciocavallosilano.cacio.peer.CacioPanelPeer r0 = new com.github.caciocavallosilano.cacio.peer.CacioPanelPeer
            r1 = r0
            r2 = r6
            r3 = r5
            com.github.caciocavallosilano.cacio.peer.PlatformWindowFactory r3 = r3.getPlatformWindowFactory()
            r1.<init>(r2, r3)
            r7 = r0
            r0 = r6
            r1 = r7
            sun.awt.SunToolkit.targetCreatedPeer(r0, r1)
            r0 = r7
            return r0
    }

    public java.awt.peer.PopupMenuPeer createPopupMenu(java.awt.PopupMenu r5) throws java.awt.HeadlessException {
            r4 = this;
            com.github.caciocavallosilano.cacio.peer.CacioPopupMenuPeer r0 = new com.github.caciocavallosilano.cacio.peer.CacioPopupMenuPeer
            r1 = r0
            r2 = r5
            r1.<init>(r2)
            r6 = r0
            r0 = r5
            r1 = r6
            sun.awt.SunToolkit.targetCreatedPeer(r0, r1)
            r0 = r6
            return r0
    }

    public java.awt.peer.ScrollPanePeer createScrollPane(java.awt.ScrollPane r6) {
            r5 = this;
            com.github.caciocavallosilano.cacio.peer.CacioScrollPanePeer r0 = new com.github.caciocavallosilano.cacio.peer.CacioScrollPanePeer
            r1 = r0
            r2 = r6
            r3 = r5
            com.github.caciocavallosilano.cacio.peer.PlatformWindowFactory r3 = r3.getPlatformWindowFactory()
            r1.<init>(r2, r3)
            r7 = r0
            r0 = r6
            r1 = r7
            sun.awt.SunToolkit.targetCreatedPeer(r0, r1)
            r0 = r7
            return r0
    }

    public java.awt.peer.ScrollbarPeer createScrollbar(java.awt.Scrollbar r6) throws java.awt.HeadlessException {
            r5 = this;
            com.github.caciocavallosilano.cacio.peer.CacioScrollBarPeer r0 = new com.github.caciocavallosilano.cacio.peer.CacioScrollBarPeer
            r1 = r0
            r2 = r6
            r3 = r5
            com.github.caciocavallosilano.cacio.peer.PlatformWindowFactory r3 = r3.getPlatformWindowFactory()
            r1.<init>(r2, r3)
            r7 = r0
            r0 = r6
            r1 = r7
            sun.awt.SunToolkit.targetCreatedPeer(r0, r1)
            r0 = r7
            return r0
    }

    public java.awt.peer.TextAreaPeer createTextArea(java.awt.TextArea r6) throws java.awt.HeadlessException {
            r5 = this;
            com.github.caciocavallosilano.cacio.peer.CacioTextAreaPeer r0 = new com.github.caciocavallosilano.cacio.peer.CacioTextAreaPeer
            r1 = r0
            r2 = r6
            r3 = r5
            com.github.caciocavallosilano.cacio.peer.PlatformWindowFactory r3 = r3.getPlatformWindowFactory()
            r1.<init>(r2, r3)
            r7 = r0
            r0 = r6
            r1 = r7
            sun.awt.SunToolkit.targetCreatedPeer(r0, r1)
            r0 = r7
            return r0
    }

    public java.awt.peer.TextFieldPeer createTextField(java.awt.TextField r6) throws java.awt.HeadlessException {
            r5 = this;
            com.github.caciocavallosilano.cacio.peer.CacioTextFieldPeer r0 = new com.github.caciocavallosilano.cacio.peer.CacioTextFieldPeer
            r1 = r0
            r2 = r6
            r3 = r5
            com.github.caciocavallosilano.cacio.peer.PlatformWindowFactory r3 = r3.getPlatformWindowFactory()
            r1.<init>(r2, r3)
            r7 = r0
            r0 = r6
            r1 = r7
            sun.awt.SunToolkit.targetCreatedPeer(r0, r1)
            r0 = r7
            return r0
    }

    public java.awt.peer.WindowPeer createWindow(java.awt.Window r6) throws java.awt.HeadlessException {
            r5 = this;
            r0 = r6
            boolean r0 = r0 instanceof com.github.caciocavallosilano.cacio.peer.ProxyWindow
            if (r0 == 0) goto L16
            com.github.caciocavallosilano.cacio.peer.ProxyWindowPeer r0 = new com.github.caciocavallosilano.cacio.peer.ProxyWindowPeer
            r1 = r0
            r2 = r6
            com.github.caciocavallosilano.cacio.peer.ProxyWindow r2 = (com.github.caciocavallosilano.cacio.peer.ProxyWindow) r2
            r1.<init>(r2)
            r7 = r0
            goto L23
        L16:
            com.github.caciocavallosilano.cacio.peer.CacioWindowPeer r0 = new com.github.caciocavallosilano.cacio.peer.CacioWindowPeer
            r1 = r0
            r2 = r6
            r3 = r5
            com.github.caciocavallosilano.cacio.peer.PlatformWindowFactory r3 = r3.getPlatformWindowFactory()
            r1.<init>(r2, r3)
            r7 = r0
        L23:
            r0 = r6
            r1 = r7
            sun.awt.SunToolkit.targetCreatedPeer(r0, r1)
            r0 = r7
            return r0
    }

    public java.awt.peer.KeyboardFocusManagerPeer createKeyboardFocusManagerPeer(java.awt.KeyboardFocusManager r3) throws java.awt.HeadlessException {
            r2 = this;
            r0 = r2
            java.awt.peer.KeyboardFocusManagerPeer r0 = r0.getKeyboardFocusManagerPeer()
            return r0
    }

    public java.awt.peer.KeyboardFocusManagerPeer getKeyboardFocusManagerPeer() throws java.awt.HeadlessException {
            r2 = this;
            com.github.caciocavallosilano.cacio.peer.CacioKeyboardFocusManagerPeer r0 = com.github.caciocavallosilano.cacio.peer.CacioKeyboardFocusManagerPeer.getInstance()
            return r0
    }

    static void disposePeer(java.lang.Object r3, java.lang.Object r4) {
            r0 = r3
            r1 = r4
            sun.awt.SunToolkit.targetDisposedPeer(r0, r1)
            return
    }

    protected static boolean useManagedWindows() {
            java.lang.String r0 = "cacio.usemanaged"
            boolean r0 = java.lang.Boolean.getBoolean(r0)
            return r0
    }

    protected void setDecorateWindows(boolean r3) {
            r2 = this;
            r0 = r3
            com.github.caciocavallosilano.cacio.peer.CacioWindowPeer.setDecorateWindows(r0)
            return
    }

    protected void setDecorateDialogs(boolean r3) {
            r2 = this;
            r0 = r3
            com.github.caciocavallosilano.cacio.peer.CacioWindowPeer.setDecorateDialogs(r0)
            return
    }

    protected java.lang.Object lazilyLoadDesktopProperty(java.lang.String r5) {
            r4 = this;
            r0 = r5
            java.lang.String r1 = "awt.font.desktophints"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L26
            r0 = r4
            java.util.Map r0 = r0.desktopProperties
            java.lang.String r1 = "awt.font.desktophints"
            java.lang.Object r0 = r0.get(r1)
            if (r0 != 0) goto L26
            r0 = r4
            java.util.Map r0 = r0.desktopProperties
            java.lang.String r1 = "awt.font.desktophints"
            java.awt.RenderingHints r2 = sun.awt.SunToolkit.getDesktopFontHints()
            java.lang.Object r0 = r0.put(r1, r2)
        L26:
            r0 = r4
            java.util.Map r0 = r0.desktopProperties
            r1 = r5
            java.lang.Object r0 = r0.get(r1)
            return r0
    }

    public abstract com.github.caciocavallosilano.cacio.peer.PlatformWindowFactory getPlatformWindowFactory();

    public java.awt.Image createOffScreenImage(java.awt.Component r8, int r9, int r10) {
            r7 = this;
            r0 = r8
            java.awt.GraphicsConfiguration r0 = r0.getGraphicsConfiguration()
            r11 = r0
            r0 = r11
            r1 = 1
            java.awt.image.ColorModel r0 = r0.getColorModel(r1)
            r12 = r0
            r0 = r12
            r1 = r9
            r2 = r10
            java.awt.image.WritableRaster r0 = r0.createCompatibleWritableRaster(r1, r2)
            r13 = r0
            sun.awt.image.OffScreenImage r0 = new sun.awt.image.OffScreenImage
            r1 = r0
            r2 = r8
            r3 = r12
            r4 = r13
            r5 = r12
            boolean r5 = r5.isAlphaPremultiplied()
            r1.<init>(r2, r3, r4, r5)
            return r0
    }

    public boolean areExtraMouseButtonsEnabled() {
            r2 = this;
            r0 = 0
            return r0
    }

    public int getScreenResolution() throws java.awt.HeadlessException {
            r2 = this;
            int r0 = com.github.caciocavallosilano.cacio.peer.CacioToolkit.screenResolution
            return r0
    }

    public java.awt.datatransfer.Clipboard getSystemClipboard() throws java.awt.HeadlessException {
            r2 = this;
            r0 = r2
            java.awt.datatransfer.Clipboard r0 = r0.clipboard
            return r0
    }

    public java.awt.peer.MouseInfoPeer getMouseInfoPeer() {
            r2 = this;
            com.github.caciocavallosilano.cacio.peer.CacioMouseInfoPeer r0 = com.github.caciocavallosilano.cacio.peer.CacioMouseInfoPeer.getInstance()
            return r0
    }

    static {
            boolean r0 = isLinux()
            if (r0 == 0) goto Le
            java.lang.String r0 = "sun.font.fontmanager"
            java.lang.String r1 = "sun.awt.FcFontManager"
            java.lang.String r0 = java.lang.System.setProperty(r0, r1)
        Le:
            java.lang.String r0 = "cacio.screenResolution"
            java.lang.String r0 = java.lang.System.getProperty(r0)
            r3 = r0
            r0 = 96
            r4 = r0
            r0 = r3
            if (r0 == 0) goto L25
            r0 = r3
            int r0 = java.lang.Integer.parseInt(r0)     // Catch: java.lang.NumberFormatException -> L24
            r4 = r0
            goto L25
        L24:
            r5 = move-exception
        L25:
            r0 = r4
            com.github.caciocavallosilano.cacio.peer.CacioToolkit.screenResolution = r0
            return
    }
}
