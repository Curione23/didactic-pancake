package sun.awt.peer.cacio;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/caciocavallo.zip:caciocavallo/cacio-shared-1.10-SNAPSHOT.jar:sun/awt/peer/cacio/CacioWindowPeer.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/caciocavallo/cacio-shared-1.10-SNAPSHOT.jar:sun/awt/peer/cacio/CacioWindowPeer.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/caciocavallo.zip:caciocavallo/cacio-shared-1.10-SNAPSHOT.jar:sun/awt/peer/cacio/CacioWindowPeer.class */
class CacioWindowPeer extends sun.awt.peer.cacio.CacioContainerPeer<java.awt.Window, javax.swing.JRootPane> implements java.awt.peer.WindowPeer {
    private static boolean decorateWindows;
    private static boolean decorateDialogs;
    private static final java.awt.Font defaultFont = null;
    protected boolean blocked;

    static void setDecorateWindows(boolean r2) {
            r0 = r2
            sun.awt.peer.cacio.CacioWindowPeer.decorateWindows = r0
            r0 = r2
            sun.awt.peer.cacio.CacioWindowPeer.decorateDialogs = r0
            return
    }

    static boolean isDecorateWindows() {
            boolean r0 = sun.awt.peer.cacio.CacioWindowPeer.decorateWindows
            return r0
    }

    static void setDecorateDialogs(boolean r2) {
            r0 = r2
            sun.awt.peer.cacio.CacioWindowPeer.decorateDialogs = r0
            return
    }

    static boolean isDecorateDialogs() {
            boolean r0 = sun.awt.peer.cacio.CacioWindowPeer.decorateDialogs
            return r0
    }

    CacioWindowPeer(java.awt.Window r5, sun.awt.peer.cacio.PlatformWindowFactory r6) {
            r4 = this;
            r0 = r4
            r1 = r5
            r2 = r6
            r0.<init>(r1, r2)
            return
    }

    @Override // sun.awt.peer.cacio.CacioComponentPeer
    void init(sun.awt.peer.cacio.PlatformWindowFactory r6) {
            r5 = this;
            r0 = r5
            java.awt.Component r0 = r0.getAWTComponent()
            java.awt.Window r0 = (java.awt.Window) r0
            r7 = r0
            r0 = r7
            java.awt.Container r0 = r0.getParent()
            r8 = r0
            r0 = r8
            if (r0 == 0) goto L77
            r0 = 0
            r9 = r0
            r0 = r8
            java.awt.peer.ComponentPeer r0 = sun.awt.peer.cacio.GetPeer.getComponent(r0)
            r10 = r0
            r0 = r10
            boolean r0 = r0 instanceof sun.awt.peer.cacio.CacioComponentPeer
            if (r0 == 0) goto L2c
            r0 = r10
            sun.awt.peer.cacio.CacioComponentPeer r0 = (sun.awt.peer.cacio.CacioComponentPeer) r0
            r9 = r0
            goto L60
        L2c:
            r0 = r10
            boolean r0 = r0 instanceof sun.awt.peer.cacio.ProxyWindowPeer
            if (r0 == 0) goto L41
            r0 = r10
            sun.awt.peer.cacio.ProxyWindowPeer r0 = (sun.awt.peer.cacio.ProxyWindowPeer) r0
            sun.awt.peer.cacio.CacioComponentPeer r0 = r0.getTarget()
            r9 = r0
            goto L60
        L41:
            java.lang.InternalError r0 = new java.lang.InternalError
            r1 = r0
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r3 = r2
            r3.<init>()
            java.lang.String r3 = "Invalid component type: "
            java.lang.StringBuilder r2 = r2.append(r3)
            r3 = r10
            java.lang.Class r3 = r3.getClass()
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r0
        L60:
            r0 = r9
            sun.awt.peer.cacio.PlatformWindow r0 = r0.platformWindow
            r11 = r0
            r0 = r5
            r1 = r6
            r2 = r5
            r3 = r11
            sun.awt.peer.cacio.PlatformWindow r1 = r1.createPlatformToplevelWindow(r2, r3)
            r0.platformWindow = r1
            goto L82
        L77:
            r0 = r5
            r1 = r6
            r2 = r5
            sun.awt.peer.cacio.PlatformToplevelWindow r1 = r1.createPlatformToplevelWindow(r2)
            r0.platformWindow = r1
        L82:
            r0 = r7
            boolean r0 = r0.isForegroundSet()
            if (r0 != 0) goto L92
            r0 = r7
            java.lang.String r1 = "windowText"
            java.awt.Color r1 = javax.swing.UIManager.getColor(r1)
            r0.setForeground(r1)
        L92:
            r0 = r7
            boolean r0 = r0.isBackgroundSet()
            if (r0 != 0) goto Lb2
            java.lang.String r0 = "window"
            java.awt.Color r0 = javax.swing.UIManager.getColor(r0)
            r9 = r0
            r0 = r9
            if (r0 == 0) goto Lac
            java.lang.String r0 = "Panel.background"
            java.awt.Color r0 = javax.swing.UIManager.getColor(r0)
            r9 = r0
        Lac:
            r0 = r7
            r1 = r9
            r0.setBackground(r1)
        Lb2:
            r0 = r7
            boolean r0 = r0.isFontSet()
            if (r0 != 0) goto Lc0
            r0 = r7
            java.awt.Font r1 = sun.awt.peer.cacio.CacioWindowPeer.defaultFont
            r0.setFont(r1)
        Lc0:
            return
    }

    javax.swing.JRootPane initSwingComponent() {
            r3 = this;
            r0 = r3
            java.awt.Component r0 = r0.getAWTComponent()
            java.awt.Window r0 = (java.awt.Window) r0
            r4 = r0
            javax.swing.JRootPane r0 = new javax.swing.JRootPane
            r1 = r0
            r1.<init>()
            r5 = r0
            r0 = r5
            r1 = 0
            r0.setDoubleBuffered(r1)
            r0 = r5
            return r0
    }

    @Override // sun.awt.peer.cacio.CacioComponentPeer
    void postInitSwingComponent() {
            r3 = this;
            r0 = r3
            super.postInitSwingComponent()
            r0 = r3
            javax.swing.JComponent r0 = r0.getSwingComponent()
            javax.swing.JRootPane r0 = (javax.swing.JRootPane) r0
            r4 = r0
            r0 = r4
            if (r0 == 0) goto L1a
            r0 = r3
            int r0 = r0.getRootPaneDecorationStyle()
            r5 = r0
            r0 = r4
            r1 = r5
            r0.setWindowDecorationStyle(r1)
        L1a:
            return
    }

    protected int getRootPaneDecorationStyle() {
            r2 = this;
            r0 = 0
            return r0
    }

    public void setAlwaysOnTop(boolean r2) {
            r1 = this;
            return
    }

    public void setModalBlocked(java.awt.Dialog r5, boolean r6) {
            r4 = this;
            r0 = r4
            boolean r0 = r0.blocked
            r1 = r6
            if (r0 != r1) goto L9
            return
        L9:
            r0 = r5
            if (r0 == 0) goto L27
            r0 = r5
            java.awt.peer.ComponentPeer r0 = sun.awt.peer.cacio.GetPeer.getComponent(r0)
            sun.awt.peer.cacio.CacioDialogPeer r0 = (sun.awt.peer.cacio.CacioDialogPeer) r0
            r7 = r0
            r0 = r7
            if (r0 == 0) goto L27
            r0 = r7
            r1 = 0
            r2 = r6
            if (r2 != 0) goto L23
            r2 = 1
            goto L24
        L23:
            r2 = 0
        L24:
            r0.setModalBlocked(r1, r2)
        L27:
            r0 = r4
            sun.awt.peer.cacio.PlatformToplevelWindow r0 = r0.getToplevelWindow()
            r1 = r6
            r0.setBlocked(r1)
            r0 = r4
            r1 = r6
            r0.blocked = r1
            return
    }

    public void toBack() {
            r1 = this;
            return
    }

    public void toFront() {
            r1 = this;
            return
    }

    public void updateFocusableWindowState() {
            r1 = this;
            return
    }

    public void updateIconImages() {
            r1 = this;
            return
    }

    public void updateMinimumSize() {
            r1 = this;
            return
    }

    @Override // sun.awt.peer.cacio.CacioComponentPeer, sun.awt.peer.cacio.CacioComponent
    public void handlePeerEvent(java.awt.AWTEvent r7) {
            r6 = this;
            r0 = r6
            java.awt.Component r0 = r0.getAWTComponent()
            java.awt.Window r0 = (java.awt.Window) r0
            r8 = r0
            r0 = r7
            int r0 = r0.getID()
            switch(r0) {
                case 1004: goto L28;
                case 1005: goto L4f;
                default: goto L76;
            }
        L28:
            sun.awt.peer.cacio.CacioKeyboardFocusManagerPeer r0 = sun.awt.peer.cacio.CacioKeyboardFocusManagerPeer.getInstance()
            r1 = r8
            r0.setCurrentFocusedWindow(r1)
            r0 = r6
            r1 = r7
            java.awt.event.FocusEvent r1 = (java.awt.event.FocusEvent) r1
            java.awt.Window r0 = r0.getOppositeWindow(r1)
            r9 = r0
            java.awt.event.WindowEvent r0 = new java.awt.event.WindowEvent
            r1 = r0
            r2 = r8
            r3 = 207(0xcf, float:2.9E-43)
            r4 = r9
            r1.<init>(r2, r3, r4)
            r10 = r0
            r0 = r6
            r1 = r10
            super.handlePeerEvent(r1)
            goto L7b
        L4f:
            sun.awt.peer.cacio.CacioKeyboardFocusManagerPeer r0 = sun.awt.peer.cacio.CacioKeyboardFocusManagerPeer.getInstance()
            r1 = 0
            r0.setCurrentFocusedWindow(r1)
            r0 = r6
            r1 = r7
            java.awt.event.FocusEvent r1 = (java.awt.event.FocusEvent) r1
            java.awt.Window r0 = r0.getOppositeWindow(r1)
            r9 = r0
            java.awt.event.WindowEvent r0 = new java.awt.event.WindowEvent
            r1 = r0
            r2 = r8
            r3 = 208(0xd0, float:2.91E-43)
            r4 = r9
            r1.<init>(r2, r3, r4)
            r10 = r0
            r0 = r6
            r1 = r10
            super.handlePeerEvent(r1)
            goto L7b
        L76:
            r0 = r6
            r1 = r7
            super.handlePeerEvent(r1)
        L7b:
            return
    }

    private java.awt.Window getOppositeWindow(java.awt.event.FocusEvent r3) {
            r2 = this;
            r0 = r3
            java.awt.Component r0 = r0.getOppositeComponent()
            r4 = r0
            r0 = r4
            boolean r0 = r0 instanceof java.awt.Window
            if (r0 == 0) goto L11
            r0 = r4
            java.awt.Window r0 = (java.awt.Window) r0
            return r0
        L11:
            r0 = 0
            return r0
    }

    protected sun.awt.peer.cacio.PlatformToplevelWindow getToplevelWindow() {
            r2 = this;
            r0 = r2
            sun.awt.peer.cacio.PlatformWindow r0 = r0.platformWindow
            sun.awt.peer.cacio.PlatformToplevelWindow r0 = (sun.awt.peer.cacio.PlatformToplevelWindow) r0
            return r0
    }

    @Override // sun.awt.peer.cacio.CacioComponentPeer
    boolean hasInsets() {
            r2 = this;
            r0 = 1
            return r0
    }

    protected boolean shouldDecorate() {
            r2 = this;
            boolean r0 = isDecorateWindows()
            if (r0 != 0) goto L13
            r0 = r2
            boolean r0 = r0 instanceof sun.awt.peer.cacio.CacioDialogPeer
            if (r0 == 0) goto L17
            boolean r0 = isDecorateDialogs()
            if (r0 == 0) goto L17
        L13:
            r0 = 1
            goto L18
        L17:
            r0 = 0
        L18:
            return r0
    }

    @Override // sun.awt.peer.cacio.CacioContainerPeer, sun.awt.peer.cacio.CacioComponentPeer
    public java.awt.Insets getInsets() {
            r7 = this;
            r0 = r7
            boolean r0 = r0.shouldDecorate()
            if (r0 == 0) goto La3
            r0 = r7
            javax.swing.JComponent r0 = r0.getSwingComponent()
            javax.swing.JRootPane r0 = (javax.swing.JRootPane) r0
            r9 = r0
            r0 = r9
            if (r0 != 0) goto L1f
            java.awt.Insets r0 = new java.awt.Insets
            r1 = r0
            r2 = 0
            r3 = 0
            r4 = 0
            r5 = 0
            r1.<init>(r2, r3, r4, r5)
            return r0
        L1f:
            r0 = r7
            sun.awt.peer.cacio.ProxyWindow r0 = r0.getProxyWindow()
            r10 = r0
            r0 = r10
            boolean r0 = r0.isVisible()
            if (r0 != 0) goto L30
            r0 = r10
            r1 = 1
            r0.setVisible(r1)
        L30:
            r0 = r9
            java.awt.Container r0 = r0.getContentPane()
            r11 = r0
            r0 = r11
            java.awt.Rectangle r0 = r0.getBounds()
            r12 = r0
            r0 = r9
            javax.swing.JLayeredPane r0 = r0.getLayeredPane()
            r13 = r0
            r0 = r13
            java.awt.Point r0 = r0.getLocation()
            r14 = r0
            r0 = r12
            int r0 = r0.y
            r1 = r14
            int r1 = r1.y
            int r0 = r0 + r1
            r15 = r0
            r0 = r12
            int r0 = r0.x
            r1 = r14
            int r1 = r1.x
            int r0 = r0 + r1
            r16 = r0
            r0 = r9
            javax.swing.border.Border r0 = r0.getBorder()
            r17 = r0
            r0 = r17
            if (r0 == 0) goto L8a
            r0 = r17
            r1 = r9
            java.awt.Insets r0 = r0.getBorderInsets(r1)
            r20 = r0
            r0 = r20
            int r0 = r0.bottom
            r18 = r0
            r0 = r20
            int r0 = r0.right
            r19 = r0
            goto L90
        L8a:
            r0 = 0
            r18 = r0
            r0 = 0
            r19 = r0
        L90:
            java.awt.Insets r0 = new java.awt.Insets
            r1 = r0
            r2 = r15
            r3 = r16
            r4 = r18
            r5 = r19
            r1.<init>(r2, r3, r4, r5)
            r8 = r0
            goto Ld2
        La3:
            r0 = r7
            sun.awt.peer.cacio.PlatformWindow r0 = r0.platformWindow
            java.awt.Insets r0 = r0.getInsets()
            java.lang.Object r0 = r0.clone()
            java.awt.Insets r0 = (java.awt.Insets) r0
            r8 = r0
            r0 = r7
            javax.swing.JComponent r0 = r0.getSwingComponent()
            javax.swing.JRootPane r0 = (javax.swing.JRootPane) r0
            javax.swing.JMenuBar r0 = r0.getJMenuBar()
            r9 = r0
            r0 = r9
            if (r0 == 0) goto Ld2
            r0 = r8
            r1 = r0
            int r1 = r1.top
            r2 = r9
            java.awt.Dimension r2 = r2.getPreferredSize()
            int r2 = r2.height
            int r1 = r1 + r2
            r0.top = r1
        Ld2:
            r0 = r8
            return r0
    }

    public void setOpacity(float r5) {
            r4 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r1 = r0
            java.lang.String r2 = "Not supported yet."
            r1.<init>(r2)
            throw r0
    }

    public void setOpaque(boolean r2) {
            r1 = this;
            return
    }

    public void repositionSecurityWarning() {
            r4 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r1 = r0
            java.lang.String r2 = "Not supported yet."
            r1.<init>(r2)
            throw r0
    }

    public void updateWindow() {
            r4 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r1 = r0
            java.lang.String r2 = "Not supported yet."
            r1.<init>(r2)
            throw r0
    }

    @Override // sun.awt.peer.cacio.CacioContainerPeer, sun.awt.peer.cacio.CacioComponentPeer
    protected void peerPaint(java.awt.Graphics r9, boolean r10) {
            r8 = this;
            r0 = r8
            boolean r0 = r0.shouldDecorate()
            if (r0 != 0) goto L14
            r0 = r8
            javax.swing.JComponent r0 = r0.getSwingComponent()
            javax.swing.JRootPane r0 = (javax.swing.JRootPane) r0
            javax.swing.JMenuBar r0 = r0.getJMenuBar()
            if (r0 == 0) goto L98
        L14:
            r0 = r8
            javax.swing.JComponent r0 = r0.getSwingComponent()
            r11 = r0
            r0 = r11
            if (r0 == 0) goto L98
            r0 = r8
            java.awt.Insets r0 = r0.getInsets()
            r12 = r0
            java.awt.geom.Area r0 = new java.awt.geom.Area
            r1 = r0
            r2 = r11
            java.awt.Rectangle r2 = r2.getBounds()
            r1.<init>(r2)
            r13 = r0
            java.awt.Rectangle r0 = new java.awt.Rectangle
            r1 = r0
            r2 = r12
            int r2 = r2.left
            r3 = r12
            int r3 = r3.top
            r4 = r11
            int r4 = r4.getWidth()
            r5 = r12
            int r5 = r5.left
            int r4 = r4 - r5
            r5 = r12
            int r5 = r5.right
            int r4 = r4 - r5
            r5 = r11
            int r5 = r5.getHeight()
            r6 = r12
            int r6 = r6.bottom
            int r5 = r5 - r6
            r6 = r12
            int r6 = r6.top
            int r5 = r5 - r6
            r1.<init>(r2, r3, r4, r5)
            r14 = r0
            r0 = r13
            java.awt.geom.Area r1 = new java.awt.geom.Area
            r2 = r1
            r3 = r14
            r2.<init>(r3)
            r0.subtract(r1)
            sun.awt.peer.cacio.WindowClippedGraphics r0 = new sun.awt.peer.cacio.WindowClippedGraphics
            r1 = r0
            r2 = r9
            java.awt.Graphics2D r2 = (java.awt.Graphics2D) r2
            r3 = r13
            r1.<init>(r2, r3)
            r15 = r0
            r0 = r11
            r1 = r15
            r0.paint(r1)     // Catch: java.lang.Throwable -> L8e
            r0 = r15
            r0.dispose()
            goto L98
        L8e:
            r16 = move-exception
            r0 = r15
            r0.dispose()
            r0 = r16
            throw r0
        L98:
            return
    }

    public void updateAlwaysOnTopState() {
            r1 = this;
            return
    }

    @Override // sun.awt.peer.cacio.CacioComponentPeer, sun.awt.peer.cacio.CacioComponent
    public boolean isFocusable() {
            r2 = this;
            r0 = r2
            boolean r0 = super.isFocusable()
            r3 = r0
            r0 = r3
            if (r0 == 0) goto L29
            r0 = r2
            java.awt.Component r0 = r0.getAWTComponent()
            java.awt.Window r0 = (java.awt.Window) r0
            boolean r0 = r0.isFocusable()
            if (r0 == 0) goto L27
            r0 = r2
            java.awt.Component r0 = r0.getAWTComponent()
            java.awt.Window r0 = (java.awt.Window) r0
            boolean r0 = r0.getFocusableWindowState()
            if (r0 == 0) goto L27
            r0 = 1
            goto L28
        L27:
            r0 = 0
        L28:
            r3 = r0
        L29:
            r0 = r3
            return r0
    }

    @Override // sun.awt.peer.cacio.CacioComponentPeer
    /* JADX INFO: renamed from: initSwingComponent */
    /* bridge */ /* synthetic */ javax.swing.JComponent mo7633initSwingComponent() {
            r2 = this;
            r0 = r2
            javax.swing.JRootPane r0 = r0.initSwingComponent()
            return r0
    }

    static {
            r0 = 0
            sun.awt.peer.cacio.CacioWindowPeer.decorateWindows = r0
            r0 = 0
            sun.awt.peer.cacio.CacioWindowPeer.decorateDialogs = r0
            java.awt.Font r0 = new java.awt.Font
            r1 = r0
            java.lang.String r2 = "Dialog"
            r3 = 0
            r4 = 12
            r1.<init>(r2, r3, r4)
            sun.awt.peer.cacio.CacioWindowPeer.defaultFont = r0
            return
    }
}
