package sun.awt.peer.cacio;

import java.awt.Component;
import javax.swing.JComponent;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/caciocavallo.zip:caciocavallo/cacio-shared-1.10-SNAPSHOT.jar:sun/awt/peer/cacio/CacioComponentPeer.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/caciocavallo/cacio-shared-1.10-SNAPSHOT.jar:sun/awt/peer/cacio/CacioComponentPeer.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/caciocavallo.zip:caciocavallo/cacio-shared-1.10-SNAPSHOT.jar:sun/awt/peer/cacio/CacioComponentPeer.class */
class CacioComponentPeer<AWTComponentType extends java.awt.Component, SwingComponentType extends javax.swing.JComponent> implements java.awt.peer.ComponentPeer, sun.awt.peer.cacio.CacioComponent {
    private AWTComponentType awtComponent;
    private SwingComponentType swingComponent;
    private sun.awt.peer.cacio.ProxyWindow proxy;
    sun.awt.peer.cacio.PlatformWindow platformWindow;
    private sun.awt.RepaintArea paintArea;
    private java.awt.Rectangle viewRect;
    private boolean needsClearBackground;
    static final int SNFH_FAILURE = 0;
    static final int SNFH_SUCCESS_HANDLED = 1;
    static final int SNFH_SUCCESS_PROCEED = 2;



    CacioComponentPeer(AWTComponentType r8, sun.awt.peer.cacio.PlatformWindowFactory r9) {
            r7 = this;
            r0 = r7
            r0.<init>()
            r0 = r7
            r1 = 0
            r0.needsClearBackground = r1
            r0 = r7
            r1 = r8
            r0.awtComponent = r1
            r0 = r7
            r1 = r9
            r0.init(r1)
            r0 = r7
            r1 = r7
            javax.swing.JComponent r1 = r1.mo7633initSwingComponent()
            r0.swingComponent = r1
            r0 = r7
            r0.initProxy()
            r0 = r7
            r0.postInitSwingComponent()
            r0 = r7
            r1 = r8
            int r1 = r1.getX()
            r2 = r8
            int r2 = r2.getY()
            r3 = r8
            int r3 = r3.getWidth()
            r4 = r8
            int r4 = r4.getHeight()
            r5 = 2
            r0.setBounds(r1, r2, r3, r4, r5)
            r0 = r7
            sun.awt.peer.cacio.CacioComponentPeer$1 r1 = new sun.awt.peer.cacio.CacioComponentPeer$1
            r2 = r1
            r3 = r7
            r2.<init>(r3)
            r0.paintArea = r1
            return
    }

    void init(sun.awt.peer.cacio.PlatformWindowFactory r6) {
            r5 = this;
            r0 = 0
            r7 = r0
            r0 = r5
            AWTComponentType extends java.awt.Component r0 = r0.awtComponent
            java.awt.Container r0 = r0.getParent()
            r8 = r0
        La:
            r0 = r8
            if (r0 == 0) goto L33
            r0 = r7
            if (r0 != 0) goto L33
            r0 = r8
            boolean r0 = r0.isLightweight()
            if (r0 == 0) goto L21
            r0 = r8
            java.awt.Container r0 = r0.getParent()
            r8 = r0
            goto La
        L21:
            r0 = r8
            java.awt.peer.ComponentPeer r0 = sun.awt.peer.cacio.GetPeer.getComponent(r0)
            sun.awt.peer.cacio.CacioComponentPeer r0 = (sun.awt.peer.cacio.CacioComponentPeer) r0
            r9 = r0
            r0 = r9
            sun.awt.peer.cacio.PlatformWindow r0 = r0.platformWindow
            r7 = r0
            goto La
        L33:
            r0 = r5
            r1 = r6
            r2 = r5
            r3 = r7
            sun.awt.peer.cacio.PlatformWindow r1 = r1.createPlatformWindow(r2, r3)
            r0.platformWindow = r1
            return
    }

    private void initProxy() {
            r6 = this;
            r0 = r6
            SwingComponentType extends javax.swing.JComponent r0 = r0.swingComponent
            if (r0 == 0) goto L48
            r0 = r6
            sun.awt.peer.cacio.ProxyWindow r1 = new sun.awt.peer.cacio.ProxyWindow
            r2 = r1
            r3 = r6
            r4 = r6
            SwingComponentType extends javax.swing.JComponent r4 = r4.swingComponent
            r2.<init>(r3, r4)
            r0.proxy = r1
            r0 = r6
            sun.awt.peer.cacio.ProxyWindow r0 = r0.proxy
            r1 = r6
            AWTComponentType extends java.awt.Component r1 = r1.awtComponent
            int r1 = r1.getX()
            r2 = r6
            AWTComponentType extends java.awt.Component r2 = r2.awtComponent
            int r2 = r2.getY()
            r3 = r6
            AWTComponentType extends java.awt.Component r3 = r3.awtComponent
            int r3 = r3.getWidth()
            r4 = r6
            AWTComponentType extends java.awt.Component r4 = r4.awtComponent
            int r4 = r4.getHeight()
            r0.setBounds(r1, r2, r3, r4)
            r0 = r6
            sun.awt.peer.cacio.ProxyWindow r0 = r0.proxy
            r1 = r6
            AWTComponentType extends java.awt.Component r1 = r1.awtComponent
            boolean r1 = r1.isVisible()
            r0.setVisible(r1)
        L48:
            return
    }

    void postInitSwingComponent() {
            r3 = this;
            r0 = r3
            SwingComponentType extends javax.swing.JComponent r0 = r0.swingComponent
            r1 = 1
            r0.setOpaque(r1)
            r0 = r3
            AWTComponentType extends java.awt.Component r0 = r0.awtComponent
            java.awt.Color r0 = r0.getBackground()
            r4 = r0
            r0 = r4
            if (r0 == 0) goto L19
            r0 = r3
            r1 = r4
            r0.setBackground(r1)
        L19:
            r0 = r3
            AWTComponentType extends java.awt.Component r0 = r0.awtComponent
            java.awt.Color r0 = r0.getForeground()
            r5 = r0
            r0 = r5
            if (r0 == 0) goto L2a
            r0 = r3
            r1 = r5
            r0.setForeground(r1)
        L2a:
            r0 = r3
            AWTComponentType extends java.awt.Component r0 = r0.awtComponent
            java.awt.Font r0 = r0.getFont()
            r6 = r0
            r0 = r6
            if (r0 == 0) goto L3b
            r0 = r3
            r1 = r6
            r0.setFont(r1)
        L3b:
            sun.awt.AWTAccessor$ComponentAccessor r0 = sun.awt.AWTAccessor.getComponentAccessor()
            r1 = r3
            AWTComponentType extends java.awt.Component r1 = r1.awtComponent
            boolean r0 = r0.isEnabled(r1)
            r7 = r0
            r0 = r3
            r1 = r7
            r0.setEnabled(r1)
            return
    }

    /* JADX INFO: renamed from: initSwingComponent */
    SwingComponentType mo7633initSwingComponent() {
            r4 = this;
            sun.awt.peer.cacio.CacioComponentPeer$2 r0 = new sun.awt.peer.cacio.CacioComponentPeer$2
            r1 = r0
            r2 = r4
            r1.<init>(r2)
            return r0
    }

    public void dispose() {
            r3 = this;
            r0 = r3
            sun.awt.peer.cacio.PlatformWindow r0 = r0.platformWindow
            r0.dispose()
            r0 = r3
            sun.awt.peer.cacio.ProxyWindow r0 = r0.proxy
            if (r0 == 0) goto L17
            r0 = r3
            sun.awt.peer.cacio.ProxyWindow r0 = r0.proxy
            r0.dispose()
        L17:
            r0 = r3
            AWTComponentType extends java.awt.Component r0 = r0.awtComponent
            r1 = r3
            sun.awt.peer.cacio.CacioToolkit.disposePeer(r0, r1)
            return
    }

    public java.awt.image.ColorModel getColorModel() {
            r2 = this;
            r0 = r2
            sun.awt.peer.cacio.PlatformWindow r0 = r0.platformWindow
            java.awt.image.ColorModel r0 = r0.getColorModel()
            return r0
    }

    private java.awt.Graphics2D getGraphicsImpl() {
            r6 = this;
            r0 = r6
            java.awt.Color r0 = r0.getBackground()
            r7 = r0
            r0 = r6
            java.awt.Color r0 = r0.getForeground()
            r8 = r0
            r0 = r6
            java.awt.Font r0 = r0.getFont()
            r9 = r0
            r0 = r6
            sun.awt.peer.cacio.PlatformWindow r0 = r0.platformWindow
            r1 = r8
            r2 = r7
            r3 = r9
            java.awt.Graphics2D r0 = r0.getGraphics(r1, r2, r3)
            r10 = r0
            r0 = r6
            java.awt.Rectangle r0 = r0.viewRect
            if (r0 == 0) goto L58
            r0 = r10
            r1 = r6
            java.awt.Rectangle r1 = r1.viewRect
            int r1 = r1.x
            r2 = r6
            java.awt.Rectangle r2 = r2.viewRect
            int r2 = r2.y
            r3 = r6
            java.awt.Rectangle r3 = r3.viewRect
            int r3 = r3.width
            r4 = r6
            java.awt.Rectangle r4 = r4.viewRect
            int r4 = r4.height
            r0.clipRect(r1, r2, r3, r4)
            r0 = r10
            r1 = r6
            java.awt.Rectangle r1 = r1.viewRect
            int r1 = r1.x
            r2 = r6
            java.awt.Rectangle r2 = r2.viewRect
            int r2 = r2.y
            r0.translate(r1, r2)
        L58:
            r0 = r10
            return r0
    }

    public java.awt.Graphics getGraphics() {
            r7 = this;
            r0 = r7
            java.awt.Graphics2D r0 = r0.getGraphicsImpl()
            r8 = r0
            r0 = r7
            boolean r0 = r0.hasInsets()
            if (r0 == 0) goto L59
            r0 = r7
            java.awt.Insets r0 = r0.getInsets()
            r9 = r0
            r0 = r7
            java.awt.Component r0 = r0.getAWTComponent()
            r10 = r0
            r0 = r10
            int r0 = r0.getWidth()
            r11 = r0
            r0 = r10
            int r0 = r0.getHeight()
            r12 = r0
            r0 = r8
            sun.awt.ConstrainableGraphics r0 = (sun.awt.ConstrainableGraphics) r0
            r1 = r9
            int r1 = r1.left
            r2 = r9
            int r2 = r2.top
            r3 = r11
            r4 = r9
            int r4 = r4.left
            int r3 = r3 - r4
            r4 = r9
            int r4 = r4.right
            int r3 = r3 - r4
            r4 = r12
            r5 = r9
            int r5 = r5.top
            int r4 = r4 - r5
            r5 = r9
            int r5 = r5.bottom
            int r4 = r4 - r5
            r0.constrain(r1, r2, r3, r4)
            r0 = r8
            r1 = r9
            int r1 = r1.left
            int r1 = -r1
            r2 = r9
            int r2 = r2.top
            int r2 = -r2
            r0.translate(r1, r2)
        L59:
            r0 = r8
            return r0
    }

    boolean hasInsets() {
            r2 = this;
            r0 = 0
            return r0
    }

    public java.awt.GraphicsConfiguration getGraphicsConfiguration() {
            r2 = this;
            r0 = r2
            sun.awt.peer.cacio.PlatformWindow r0 = r0.platformWindow
            java.awt.GraphicsConfiguration r0 = r0.getGraphicsConfiguration()
            return r0
    }

    public java.awt.FontMetrics getFontMetrics(java.awt.Font r3) {
            r2 = this;
            r0 = r3
            sun.font.FontDesignMetrics r0 = sun.font.FontDesignMetrics.getMetrics(r0)
            return r0
    }

    public java.awt.Point getLocationOnScreen() {
            r2 = this;
            r0 = r2
            sun.awt.peer.cacio.PlatformWindow r0 = r0.platformWindow
            java.awt.Point r0 = r0.getLocationOnScreen()
            return r0
    }

    public java.awt.Dimension getMinimumSize() {
            r5 = this;
            r0 = r5
            SwingComponentType extends javax.swing.JComponent r0 = r0.swingComponent
            if (r0 == 0) goto L12
            r0 = r5
            SwingComponentType extends javax.swing.JComponent r0 = r0.swingComponent
            java.awt.Dimension r0 = r0.getMinimumSize()
            r6 = r0
            goto L1c
        L12:
            java.awt.Dimension r0 = new java.awt.Dimension
            r1 = r0
            r2 = 0
            r3 = 0
            r1.<init>(r2, r3)
            r6 = r0
        L1c:
            r0 = r6
            return r0
    }

    public java.awt.Dimension getPreferredSize() {
            r5 = this;
            r0 = r5
            SwingComponentType extends javax.swing.JComponent r0 = r0.swingComponent
            if (r0 == 0) goto L12
            r0 = r5
            SwingComponentType extends javax.swing.JComponent r0 = r0.swingComponent
            java.awt.Dimension r0 = r0.getPreferredSize()
            r6 = r0
            goto L1c
        L12:
            java.awt.Dimension r0 = new java.awt.Dimension
            r1 = r0
            r2 = 0
            r3 = 0
            r1.<init>(r2, r3)
            r6 = r0
        L1c:
            r0 = r6
            return r0
    }

    public java.awt.Toolkit getToolkit() {
            r2 = this;
            java.awt.Toolkit r0 = java.awt.Toolkit.getDefaultToolkit()
            return r0
    }

    public void handleEvent(java.awt.AWTEvent r5) {
            r4 = this;
            r0 = r5
            int r0 = r0.getID()
            switch(r0) {
                case 400: goto Lb6;
                case 401: goto Lb6;
                case 402: goto Lb6;
                case 500: goto La0;
                case 501: goto La0;
                case 502: goto La0;
                case 503: goto Lab;
                case 504: goto La0;
                case 505: goto La0;
                case 506: goto Lab;
                case 800: goto L80;
                case 801: goto L80;
                case 1004: goto Lc1;
                case 1005: goto Lc1;
                default: goto Lcc;
            }
        L80:
            r0 = r4
            boolean r0 = r0.isLayouting()
            if (r0 != 0) goto Lcc
            r0 = r4
            boolean r0 = r0.needsClearBackground
            r6 = r0
            r0 = r4
            r1 = 0
            r0.needsClearBackground = r1
            r0 = r4
            sun.awt.RepaintArea r0 = r0.paintArea
            r1 = r4
            java.awt.Component r1 = r1.getAWTComponent()
            r2 = r6
            r0.paint(r1, r2)
            goto Lcc
        La0:
            r0 = r4
            r1 = r5
            java.awt.event.MouseEvent r1 = (java.awt.event.MouseEvent) r1
            r0.handleMouseEvent(r1)
            goto Lcc
        Lab:
            r0 = r4
            r1 = r5
            java.awt.event.MouseEvent r1 = (java.awt.event.MouseEvent) r1
            r0.handleMouseMotionEvent(r1)
            goto Lcc
        Lb6:
            r0 = r4
            r1 = r5
            java.awt.event.KeyEvent r1 = (java.awt.event.KeyEvent) r1
            r0.handleKeyEvent(r1)
            goto Lcc
        Lc1:
            r0 = r4
            r1 = r5
            java.awt.event.FocusEvent r1 = (java.awt.event.FocusEvent) r1
            r0.handleFocusEvent(r1)
            goto Lcc
        Lcc:
            return
    }

    protected void handleMouseEvent(java.awt.event.MouseEvent r4) {
            r3 = this;
            r0 = r3
            sun.awt.peer.cacio.ProxyWindow r0 = r0.proxy
            if (r0 == 0) goto Lf
            r0 = r3
            sun.awt.peer.cacio.ProxyWindow r0 = r0.proxy
            r1 = r4
            r0.handleMouseEvent(r1)
        Lf:
            return
    }

    protected void handleMouseMotionEvent(java.awt.event.MouseEvent r4) {
            r3 = this;
            r0 = r3
            sun.awt.peer.cacio.ProxyWindow r0 = r0.proxy
            if (r0 == 0) goto Lf
            r0 = r3
            sun.awt.peer.cacio.ProxyWindow r0 = r0.proxy
            r1 = r4
            r0.handleMouseMotionEvent(r1)
        Lf:
            return
    }

    protected void handleKeyEvent(java.awt.event.KeyEvent r4) {
            r3 = this;
            r0 = r3
            sun.awt.peer.cacio.ProxyWindow r0 = r0.proxy
            if (r0 == 0) goto Lf
            r0 = r3
            sun.awt.peer.cacio.ProxyWindow r0 = r0.proxy
            r1 = r4
            r0.handleKeyEvent(r1)
        Lf:
            return
    }

    protected void handleFocusEvent(java.awt.event.FocusEvent r4) {
            r3 = this;
            r0 = r3
            sun.awt.peer.cacio.ProxyWindow r0 = r0.proxy
            if (r0 == 0) goto Lf
            r0 = r3
            sun.awt.peer.cacio.ProxyWindow r0 = r0.proxy
            r1 = r4
            r0.handleFocusEvent(r1)
        Lf:
            return
    }

    protected void peerPaint(java.awt.Graphics r4, boolean r5) {
            r3 = this;
            r0 = r4
            java.awt.Graphics r0 = r0.create()
            r6 = r0
            r0 = r3
            SwingComponentType extends javax.swing.JComponent r0 = r0.swingComponent     // Catch: java.lang.Throwable -> L1f
            if (r0 == 0) goto L18
            r0 = r3
            SwingComponentType extends javax.swing.JComponent r0 = r0.swingComponent     // Catch: java.lang.Throwable -> L1f
            r7 = r0
            r0 = r7
            r1 = r6
            r0.paint(r1)     // Catch: java.lang.Throwable -> L1f
        L18:
            r0 = r6
            r0.dispose()
            goto L28
        L1f:
            r8 = move-exception
            r0 = r6
            r0.dispose()
            r0 = r8
            throw r0
        L28:
            return
    }

    protected void peerRepaint(int r8, int r9, int r10, int r11) {
            r7 = this;
            boolean r0 = java.awt.EventQueue.isDispatchThread()
            if (r0 == 0) goto L35
            r0 = r7
            AWTComponentType extends java.awt.Component r0 = r0.awtComponent
            java.awt.Graphics r0 = r0.getGraphics()
            r12 = r0
            r0 = r12
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            r0.clipRect(r1, r2, r3, r4)     // Catch: java.lang.Throwable -> L28
            r0 = r7
            r1 = r12
            r2 = 0
            r0.peerPaint(r1, r2)     // Catch: java.lang.Throwable -> L28
            r0 = r12
            r0.dispose()
            goto L32
        L28:
            r13 = move-exception
            r0 = r12
            r0.dispose()
            r0 = r13
            throw r0
        L32:
            goto L60
        L35:
            sun.awt.PaintEventDispatcher r0 = sun.awt.PaintEventDispatcher.getPaintEventDispatcher()
            r1 = r7
            AWTComponentType extends java.awt.Component r1 = r1.awtComponent
            r2 = 0
            r3 = 0
            r4 = r7
            AWTComponentType extends java.awt.Component r4 = r4.awtComponent
            int r4 = r4.getWidth()
            r5 = r7
            AWTComponentType extends java.awt.Component r5 = r5.awtComponent
            int r5 = r5.getHeight()
            java.awt.event.PaintEvent r0 = r0.createPaintEvent(r1, r2, r3, r4, r5)
            r12 = r0
            r0 = r7
            AWTComponentType extends java.awt.Component r0 = r0.awtComponent
            java.awt.Toolkit r0 = r0.getToolkit()
            java.awt.EventQueue r0 = r0.getSystemEventQueue()
            r1 = r12
            r0.postEvent(r1)
        L60:
            return
    }

    public boolean handlesWheelScrolling() {
            r2 = this;
            r0 = 0
            return r0
    }

    @Override // sun.awt.peer.cacio.CacioComponent
    public boolean isFocusable() {
            r2 = this;
            r0 = r2
            SwingComponentType extends javax.swing.JComponent r0 = r0.swingComponent
            if (r0 == 0) goto L12
            r0 = r2
            SwingComponentType extends javax.swing.JComponent r0 = r0.swingComponent
            boolean r0 = r0.isFocusable()
            r3 = r0
            goto L14
        L12:
            r0 = 0
            r3 = r0
        L14:
            r0 = r3
            return r0
    }

    public boolean isReparentSupported() {
            r2 = this;
            r0 = r2
            sun.awt.peer.cacio.PlatformWindow r0 = r0.platformWindow
            boolean r0 = r0.isReparentSuppored()
            return r0
    }

    public void reparent(java.awt.peer.ContainerPeer r4) {
            r3 = this;
            r0 = r3
            sun.awt.peer.cacio.PlatformWindow r0 = r0.platformWindow
            r1 = r4
            r0.reparent(r1)
            return
    }

    public void layout() {
            r1 = this;
            return
    }

    public void paint(java.awt.Graphics r5) {
            r4 = this;
            r0 = r4
            r1 = r5
            r2 = 1
            r0.peerPaint(r1, r2)
            return
    }

    public void print(java.awt.Graphics r5) {
            r4 = this;
            r0 = r4
            r1 = r5
            r2 = 1
            r0.peerPaint(r1, r2)
            return
    }

    public boolean requestFocus(java.awt.Component r10, boolean r11, boolean r12, long r13, sun.awt.CausedFocusEvent.Cause r15) {
            r9 = this;
            r0 = r9
            java.awt.Component r0 = r0.getAWTComponent()
            r1 = r10
            r2 = r11
            r3 = r12
            r4 = r13
            boolean r0 = sun.awt.peer.cacio.KFMHelper.processSynchronousLightweightTransfer(r0, r1, r2, r3, r4)
            if (r0 == 0) goto L11
            r0 = 1
            return r0
        L11:
            r0 = r9
            java.awt.Component r0 = r0.getAWTComponent()
            r1 = r10
            r2 = r11
            r3 = r12
            r4 = r13
            r5 = r15
            int r0 = sun.awt.peer.cacio.KFMHelper.shouldNativelyFocusHeavyweight(r0, r1, r2, r3, r4, r5)
            r16 = r0
            r0 = r16
            switch(r0) {
                case 0: goto L3c;
                case 1: goto L5d;
                case 2: goto L3e;
                default: goto L5f;
            }
        L3c:
            r0 = 0
            return r0
        L3e:
            r0 = r9
            sun.awt.peer.cacio.PlatformWindow r0 = r0.getPlatformWindow()
            r17 = r0
            r0 = r17
            r0.requestFocus()
            sun.awt.peer.cacio.CacioKeyboardFocusManagerPeer r0 = sun.awt.peer.cacio.CacioKeyboardFocusManagerPeer.getInstance()
            r1 = r9
            java.awt.Component r1 = r1.getAWTComponent()
            r2 = r10
            r3 = r11
            r4 = r12
            r5 = r13
            r6 = r15
            boolean r0 = r0.requestFocus(r1, r2, r3, r4, r5, r6)
            return r0
        L5d:
            r0 = 1
            return r0
        L5f:
            r0 = 0
            return r0
    }

    public void setBackground(java.awt.Color r4) {
            r3 = this;
            r0 = r3
            SwingComponentType extends javax.swing.JComponent r0 = r0.swingComponent
            r1 = r4
            r0.setBackground(r1)
            return
    }

    java.awt.Color getBackground() {
            r2 = this;
            r0 = r2
            SwingComponentType extends javax.swing.JComponent r0 = r0.swingComponent
            java.awt.Color r0 = r0.getBackground()
            return r0
    }

    public void setFont(java.awt.Font r4) {
            r3 = this;
            r0 = r3
            SwingComponentType extends javax.swing.JComponent r0 = r0.swingComponent
            r1 = r4
            r0.setFont(r1)
            return
    }

    java.awt.Font getFont() {
            r2 = this;
            r0 = r2
            SwingComponentType extends javax.swing.JComponent r0 = r0.swingComponent
            java.awt.Font r0 = r0.getFont()
            return r0
    }

    public void setForeground(java.awt.Color r4) {
            r3 = this;
            r0 = r3
            SwingComponentType extends javax.swing.JComponent r0 = r0.swingComponent
            r1 = r4
            r0.setForeground(r1)
            return
    }

    java.awt.Color getForeground() {
            r2 = this;
            r0 = r2
            SwingComponentType extends javax.swing.JComponent r0 = r0.swingComponent
            java.awt.Color r0 = r0.getForeground()
            return r0
    }

    private void setBoundsImpl(int r8, int r9, int r10, int r11, int r12) {
            r7 = this;
            r0 = r7
            sun.awt.peer.cacio.PlatformWindow r0 = r0.platformWindow
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            r5 = r12
            r0.setBounds(r1, r2, r3, r4, r5)
            return
    }

    void setViewport(int r9, int r10, int r11, int r12) {
            r8 = this;
            r0 = r8
            r1 = r9
            r2 = r10
            r3 = r11
            r4 = r12
            r5 = 3
            r0.setBoundsImpl(r1, r2, r3, r4, r5)
            r0 = r8
            java.awt.Rectangle r1 = new java.awt.Rectangle
            r2 = r1
            r3 = r9
            r4 = r10
            r5 = r11
            r6 = r12
            r2.<init>(r3, r4, r5, r6)
            r0.viewRect = r1
            return
    }

    public void setBounds(int r8, int r9, int r10, int r11, int r12) {
            r7 = this;
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            r5 = r12
            r0.setBoundsImpl(r1, r2, r3, r4, r5)
            r0 = r7
            sun.awt.peer.cacio.ProxyWindow r0 = r0.proxy
            if (r0 == 0) goto L35
            r0 = r7
            sun.awt.peer.cacio.ProxyWindow r0 = r0.proxy
            r1 = r7
            AWTComponentType extends java.awt.Component r1 = r1.awtComponent
            int r1 = r1.getX()
            r2 = r7
            AWTComponentType extends java.awt.Component r2 = r2.awtComponent
            int r2 = r2.getY()
            r3 = r7
            AWTComponentType extends java.awt.Component r3 = r3.awtComponent
            int r3 = r3.getWidth()
            r4 = r7
            AWTComponentType extends java.awt.Component r4 = r4.awtComponent
            int r4 = r4.getHeight()
            r0.setBounds(r1, r2, r3, r4)
        L35:
            r0 = r7
            SwingComponentType extends javax.swing.JComponent r0 = r0.swingComponent
            if (r0 == 0) goto L4f
            r0 = r7
            SwingComponentType extends javax.swing.JComponent r0 = r0.swingComponent
            r1 = 0
            r2 = 0
            r3 = r10
            r4 = r11
            r0.setBounds(r1, r2, r3, r4)
            r0 = r7
            SwingComponentType extends javax.swing.JComponent r0 = r0.swingComponent
            r0.validate()
        L4f:
            return
    }

    public void setEnabled(boolean r4) {
            r3 = this;
            r0 = r3
            r1 = r4
            r0.setEnabledImpl(r1)
            return
    }

    void setEnabledImpl(boolean r4) {
            r3 = this;
            r0 = r3
            SwingComponentType extends javax.swing.JComponent r0 = r0.swingComponent
            if (r0 == 0) goto Lf
            r0 = r3
            SwingComponentType extends javax.swing.JComponent r0 = r0.swingComponent
            r1 = r4
            r0.setEnabled(r1)
        Lf:
            return
    }

    boolean isEnabled() {
            r2 = this;
            r0 = r2
            SwingComponentType extends javax.swing.JComponent r0 = r0.swingComponent
            boolean r0 = r0.isEnabled()
            return r0
    }

    boolean isParentsEnabled() {
            r2 = this;
            r0 = r2
            java.awt.Component r0 = r0.getAWTComponent()
            r3 = r0
            r0 = r3
            boolean r0 = r0.isEnabled()
            r4 = r0
            r0 = r4
            if (r0 == 0) goto L2e
            r0 = r3
            java.awt.Container r0 = r0.getParent()
            r5 = r0
            r0 = r5
            if (r0 == 0) goto L2e
            r0 = r5
            java.awt.peer.ComponentPeer r0 = sun.awt.peer.cacio.GetPeer.getComponent(r0)
            r6 = r0
            r0 = r6
            boolean r0 = r0 instanceof sun.awt.peer.cacio.CacioComponentPeer
            if (r0 == 0) goto L2e
            r0 = r6
            sun.awt.peer.cacio.CacioComponentPeer r0 = (sun.awt.peer.cacio.CacioComponentPeer) r0
            boolean r0 = r0.isParentsEnabled()
            r4 = r0
        L2e:
            r0 = r4
            return r0
    }

    public void setVisible(boolean r4) {
            r3 = this;
            r0 = r3
            r1 = r4
            r0.needsClearBackground = r1
            r0 = r3
            sun.awt.peer.cacio.ProxyWindow r0 = r0.proxy
            if (r0 == 0) goto L14
            r0 = r3
            sun.awt.peer.cacio.ProxyWindow r0 = r0.proxy
            r1 = r4
            r0.setVisible(r1)
        L14:
            r0 = r3
            sun.awt.peer.cacio.PlatformWindow r0 = r0.platformWindow
            r1 = r4
            r0.setVisible(r1)
            return
    }

    public void updateCursorImmediately() {
            r1 = this;
            return
    }

    public int checkImage(java.awt.Image r7, int r8, int r9, java.awt.image.ImageObserver r10) {
            r6 = this;
            java.awt.Toolkit r0 = java.awt.Toolkit.getDefaultToolkit()
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            int r0 = r0.checkImage(r1, r2, r3, r4)
            return r0
    }

    public boolean prepareImage(java.awt.Image r7, int r8, int r9, java.awt.image.ImageObserver r10) {
            r6 = this;
            java.awt.Toolkit r0 = java.awt.Toolkit.getDefaultToolkit()
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            boolean r0 = r0.prepareImage(r1, r2, r3, r4)
            return r0
    }

    public java.awt.Image createImage(java.awt.image.ImageProducer r4) {
            r3 = this;
            java.awt.Toolkit r0 = java.awt.Toolkit.getDefaultToolkit()
            r1 = r4
            java.awt.Image r0 = r0.createImage(r1)
            return r0
    }

    public java.awt.Image createImage(int r6, int r7) {
            r5 = this;
            java.awt.Toolkit r0 = java.awt.Toolkit.getDefaultToolkit()
            sun.awt.peer.cacio.CacioToolkit r0 = (sun.awt.peer.cacio.CacioToolkit) r0
            r1 = r5
            AWTComponentType extends java.awt.Component r1 = r1.awtComponent
            r2 = r6
            r3 = r7
            java.awt.Image r0 = r0.createOffScreenImage(r1, r2, r3)
            return r0
    }

    public java.awt.image.VolatileImage createVolatileImage(int r5, int r6) {
            r4 = this;
            r0 = r4
            java.awt.GraphicsConfiguration r0 = r0.getGraphicsConfiguration()
            r7 = r0
            r0 = r7
            r1 = r5
            r2 = r6
            java.awt.image.VolatileImage r0 = r0.createCompatibleVolatileImage(r1, r2)
            return r0
    }

    public void createBuffers(int r5, java.awt.BufferCapabilities r6) throws java.awt.AWTException {
            r4 = this;
            r0 = r4
            sun.awt.peer.cacio.PlatformWindow r0 = r0.platformWindow
            r1 = r5
            r2 = r6
            r0.createBuffers(r1, r2)
            return
    }

    public void destroyBuffers() {
            r2 = this;
            r0 = r2
            sun.awt.peer.cacio.PlatformWindow r0 = r0.platformWindow
            r0.destroyBuffers()
            return
    }

    public void flip(int r8, int r9, int r10, int r11, java.awt.BufferCapabilities.FlipContents r12) {
            r7 = this;
            r0 = r7
            sun.awt.peer.cacio.PlatformWindow r0 = r0.platformWindow
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            r5 = r12
            r0.flip(r1, r2, r3, r4, r5)
            return
    }

    public java.awt.Image getBackBuffer() {
            r2 = this;
            r0 = r2
            sun.awt.peer.cacio.PlatformWindow r0 = r0.platformWindow
            java.awt.Image r0 = r0.getBackBuffer()
            return r0
    }

    public void coalescePaintEvent(java.awt.event.PaintEvent r5) {
            r4 = this;
            r0 = r5
            boolean r0 = r0 instanceof sun.awt.event.IgnorePaintEvent
            if (r0 != 0) goto L16
            r0 = r4
            sun.awt.RepaintArea r0 = r0.paintArea
            r1 = r5
            java.awt.Rectangle r1 = r1.getUpdateRect()
            r2 = r5
            int r2 = r2.getID()
            r0.add(r1, r2)
        L16:
            return
    }

    public void applyShape(sun.java2d.pipe.Region r4) {
            r3 = this;
            r0 = r3
            sun.awt.peer.cacio.PlatformWindow r0 = r0.platformWindow
            r1 = r4
            r0.applyShape(r1)
            return
    }

    public boolean canDetermineObscurity() {
            r2 = this;
            r0 = r2
            sun.awt.peer.cacio.PlatformWindow r0 = r0.platformWindow
            boolean r0 = r0.canDetermineObscurity()
            return r0
    }

    public boolean isObscured() {
            r2 = this;
            r0 = r2
            sun.awt.peer.cacio.PlatformWindow r0 = r0.platformWindow
            boolean r0 = r0.isObscured()
            return r0
    }

    @Override // sun.awt.peer.cacio.CacioComponent
    public sun.awt.peer.cacio.PlatformWindow getPlatformWindow() {
            r2 = this;
            r0 = r2
            sun.awt.peer.cacio.PlatformWindow r0 = r0.platformWindow
            return r0
    }

    @Override // sun.awt.peer.cacio.CacioComponent
    public AWTComponentType getAWTComponent() {
            r2 = this;
            r0 = r2
            AWTComponentType extends java.awt.Component r0 = r0.awtComponent
            return r0
    }

    @Override // sun.awt.peer.cacio.CacioComponent
    public void handlePeerEvent(java.awt.AWTEvent r4) {
            r3 = this;
            r0 = r3
            r1 = r4
            r0.postEvent(r1)
            return
    }

    private void postEvent(java.awt.AWTEvent r4) {
            r3 = this;
            r0 = r4
            java.lang.Object r0 = r0.getSource()
            sun.awt.AppContext r0 = sun.awt.SunToolkit.targetToAppContext(r0)
            r1 = r4
            sun.awt.SunToolkit.postEvent(r0, r1)
            return
    }

    public java.awt.Insets getInsets() {
            r2 = this;
            r0 = r2
            sun.awt.peer.cacio.PlatformWindow r0 = r0.platformWindow
            java.awt.Insets r0 = r0.getInsets()
            java.lang.Object r0 = r0.clone()
            java.awt.Insets r0 = (java.awt.Insets) r0
            return r0
    }

    SwingComponentType getSwingComponent() {
            r2 = this;
            r0 = r2
            SwingComponentType extends javax.swing.JComponent r0 = r0.swingComponent
            return r0
    }

    sun.awt.peer.cacio.ProxyWindow getProxyWindow() {
            r2 = this;
            r0 = r2
            sun.awt.peer.cacio.ProxyWindow r0 = r0.proxy
            return r0
    }

    public void setZOrder(java.awt.peer.ComponentPeer r4) {
            r3 = this;
            java.io.PrintStream r0 = java.lang.System.err
            java.lang.String r1 = "CacioComponentPeer::setZOrder: NOT YET IMPLEMENTED"
            r0.println(r1)
            return
    }

    public boolean updateGraphicsData(java.awt.GraphicsConfiguration r4) {
            r3 = this;
            java.io.PrintStream r0 = java.lang.System.err
            java.lang.String r1 = "CacioComponentPeer::updateGraphicsData: NOT YET IMPLEMENTED"
            r0.println(r1)
            r0 = 0
            return r0
    }

    sun.awt.RepaintArea getPaintArea() {
            r2 = this;
            r0 = r2
            sun.awt.RepaintArea r0 = r0.paintArea
            return r0
    }

    boolean isLayouting() {
            r2 = this;
            r0 = 0
            return r0
    }

    public void clearBackground() {
            r3 = this;
            r0 = r3
            r1 = 1
            r0.needsClearBackground = r1
            return
    }

    static /* synthetic */ java.awt.Graphics2D access$000(sun.awt.peer.cacio.CacioComponentPeer r2) {
            r0 = r2
            java.awt.Graphics2D r0 = r0.getGraphicsImpl()
            return r0
    }
}
