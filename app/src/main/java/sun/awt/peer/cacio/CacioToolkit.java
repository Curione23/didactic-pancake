package sun.awt.peer.cacio;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/caciocavallo.zip:caciocavallo/cacio-shared-1.10-SNAPSHOT.jar:sun/awt/peer/cacio/CacioToolkit.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/caciocavallo/cacio-shared-1.10-SNAPSHOT.jar:sun/awt/peer/cacio/CacioToolkit.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/caciocavallo.zip:caciocavallo/cacio-shared-1.10-SNAPSHOT.jar:sun/awt/peer/cacio/CacioToolkit.class */
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
            sun.awt.peer.cacio.PlatformWindowFactory r0 = r0.getPlatformWindowFactory()
            sun.awt.peer.cacio.CacioEventPump r0 = r0.createEventPump()
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
            sun.awt.peer.cacio.CacioButtonPeer r0 = new sun.awt.peer.cacio.CacioButtonPeer
            r1 = r0
            r2 = r6
            r3 = r5
            sun.awt.peer.cacio.PlatformWindowFactory r3 = r3.getPlatformWindowFactory()
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
            sun.awt.peer.cacio.CacioCanvasPeer r0 = new sun.awt.peer.cacio.CacioCanvasPeer
            r1 = r0
            r2 = r6
            r3 = r5
            sun.awt.peer.cacio.PlatformWindowFactory r3 = r3.getPlatformWindowFactory()
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
            sun.awt.peer.cacio.CacioCheckboxPeer r0 = new sun.awt.peer.cacio.CacioCheckboxPeer
            r1 = r0
            r2 = r6
            r3 = r5
            sun.awt.peer.cacio.PlatformWindowFactory r3 = r3.getPlatformWindowFactory()
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
            sun.awt.peer.cacio.CacioCheckboxMenuItemPeer r0 = new sun.awt.peer.cacio.CacioCheckboxMenuItemPeer
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
            sun.awt.peer.cacio.CacioChoicePeer r0 = new sun.awt.peer.cacio.CacioChoicePeer
            r1 = r0
            r2 = r6
            r3 = r5
            sun.awt.peer.cacio.PlatformWindowFactory r3 = r3.getPlatformWindowFactory()
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
            sun.awt.peer.cacio.CacioDialogPeer r0 = new sun.awt.peer.cacio.CacioDialogPeer
            r1 = r0
            r2 = r6
            r3 = r5
            sun.awt.peer.cacio.PlatformWindowFactory r3 = r3.getPlatformWindowFactory()
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
            sun.awt.peer.cacio.CacioFileDialogPeer r0 = new sun.awt.peer.cacio.CacioFileDialogPeer
            r1 = r0
            r2 = r6
            r3 = r5
            sun.awt.peer.cacio.PlatformWindowFactory r3 = r3.getPlatformWindowFactory()
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
            sun.awt.peer.cacio.CacioFramePeer r0 = new sun.awt.peer.cacio.CacioFramePeer
            r1 = r0
            r2 = r6
            r3 = r5
            sun.awt.peer.cacio.PlatformWindowFactory r3 = r3.getPlatformWindowFactory()
            r1.<init>(r2, r3)
            r7 = r0
            r0 = r6
            r1 = r7
            sun.awt.SunToolkit.targetCreatedPeer(r0, r1)
            r0 = r7
            return r0
    }

    public java.awt.peer.FramePeer createLightweightFrame(sun.awt.LightweightFrame r6) throws java.awt.HeadlessException {
            r5 = this;
            sun.awt.peer.cacio.CacioLightweightFramePeer r0 = new sun.awt.peer.cacio.CacioLightweightFramePeer
            r1 = r0
            r2 = r6
            r3 = r5
            sun.awt.peer.cacio.PlatformWindowFactory r3 = r3.getPlatformWindowFactory()
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
            sun.awt.peer.cacio.CacioLabelPeer r0 = new sun.awt.peer.cacio.CacioLabelPeer
            r1 = r0
            r2 = r6
            r3 = r5
            sun.awt.peer.cacio.PlatformWindowFactory r3 = r3.getPlatformWindowFactory()
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
            sun.awt.peer.cacio.CacioListPeer r0 = new sun.awt.peer.cacio.CacioListPeer
            r1 = r0
            r2 = r6
            r3 = r5
            sun.awt.peer.cacio.PlatformWindowFactory r3 = r3.getPlatformWindowFactory()
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
            sun.awt.peer.cacio.CacioMenuPeer r0 = new sun.awt.peer.cacio.CacioMenuPeer
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
            sun.awt.peer.cacio.CacioMenuBarPeer r0 = new sun.awt.peer.cacio.CacioMenuBarPeer
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
            sun.awt.peer.cacio.CacioMenuItemPeer r0 = new sun.awt.peer.cacio.CacioMenuItemPeer
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
            sun.awt.peer.cacio.CacioPanelPeer r0 = new sun.awt.peer.cacio.CacioPanelPeer
            r1 = r0
            r2 = r6
            r3 = r5
            sun.awt.peer.cacio.PlatformWindowFactory r3 = r3.getPlatformWindowFactory()
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
            sun.awt.peer.cacio.CacioPopupMenuPeer r0 = new sun.awt.peer.cacio.CacioPopupMenuPeer
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
            sun.awt.peer.cacio.CacioScrollPanePeer r0 = new sun.awt.peer.cacio.CacioScrollPanePeer
            r1 = r0
            r2 = r6
            r3 = r5
            sun.awt.peer.cacio.PlatformWindowFactory r3 = r3.getPlatformWindowFactory()
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
            sun.awt.peer.cacio.CacioScrollBarPeer r0 = new sun.awt.peer.cacio.CacioScrollBarPeer
            r1 = r0
            r2 = r6
            r3 = r5
            sun.awt.peer.cacio.PlatformWindowFactory r3 = r3.getPlatformWindowFactory()
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
            sun.awt.peer.cacio.CacioTextAreaPeer r0 = new sun.awt.peer.cacio.CacioTextAreaPeer
            r1 = r0
            r2 = r6
            r3 = r5
            sun.awt.peer.cacio.PlatformWindowFactory r3 = r3.getPlatformWindowFactory()
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
            sun.awt.peer.cacio.CacioTextFieldPeer r0 = new sun.awt.peer.cacio.CacioTextFieldPeer
            r1 = r0
            r2 = r6
            r3 = r5
            sun.awt.peer.cacio.PlatformWindowFactory r3 = r3.getPlatformWindowFactory()
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
            boolean r0 = r0 instanceof sun.awt.peer.cacio.ProxyWindow
            if (r0 == 0) goto L16
            sun.awt.peer.cacio.ProxyWindowPeer r0 = new sun.awt.peer.cacio.ProxyWindowPeer
            r1 = r0
            r2 = r6
            sun.awt.peer.cacio.ProxyWindow r2 = (sun.awt.peer.cacio.ProxyWindow) r2
            r1.<init>(r2)
            r7 = r0
            goto L23
        L16:
            sun.awt.peer.cacio.CacioWindowPeer r0 = new sun.awt.peer.cacio.CacioWindowPeer
            r1 = r0
            r2 = r6
            r3 = r5
            sun.awt.peer.cacio.PlatformWindowFactory r3 = r3.getPlatformWindowFactory()
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
            sun.awt.peer.cacio.CacioKeyboardFocusManagerPeer r0 = sun.awt.peer.cacio.CacioKeyboardFocusManagerPeer.getInstance()
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
            sun.awt.peer.cacio.CacioWindowPeer.setDecorateWindows(r0)
            return
    }

    protected void setDecorateDialogs(boolean r3) {
            r2 = this;
            r0 = r3
            sun.awt.peer.cacio.CacioWindowPeer.setDecorateDialogs(r0)
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

    public abstract sun.awt.peer.cacio.PlatformWindowFactory getPlatformWindowFactory();

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
            int r0 = sun.awt.peer.cacio.CacioToolkit.screenResolution
            return r0
    }

    public java.awt.datatransfer.Clipboard getSystemClipboard() throws java.awt.HeadlessException {
            r2 = this;
            r0 = r2
            java.awt.datatransfer.Clipboard r0 = r0.clipboard
            return r0
    }

    protected java.awt.peer.MouseInfoPeer getMouseInfoPeer() {
            r2 = this;
            sun.awt.peer.cacio.CacioMouseInfoPeer r0 = sun.awt.peer.cacio.CacioMouseInfoPeer.getInstance()
            return r0
    }

    static {
            java.lang.String r0 = "cacio.screenResolution"
            java.lang.String r0 = java.lang.System.getProperty(r0)
            r2 = r0
            r0 = 96
            r3 = r0
            r0 = r2
            if (r0 == 0) goto L16
            r0 = r2
            int r0 = java.lang.Integer.parseInt(r0)     // Catch: java.lang.NumberFormatException -> L15
            r3 = r0
            goto L16
        L15:
            r4 = move-exception
        L16:
            r0 = r3
            sun.awt.peer.cacio.CacioToolkit.screenResolution = r0
            return
    }
}
