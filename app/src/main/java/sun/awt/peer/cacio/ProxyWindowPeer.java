package sun.awt.peer.cacio;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/caciocavallo.zip:caciocavallo/cacio-shared-1.10-SNAPSHOT.jar:sun/awt/peer/cacio/ProxyWindowPeer.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/caciocavallo/cacio-shared-1.10-SNAPSHOT.jar:sun/awt/peer/cacio/ProxyWindowPeer.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/caciocavallo.zip:caciocavallo/cacio-shared-1.10-SNAPSHOT.jar:sun/awt/peer/cacio/ProxyWindowPeer.class */
class ProxyWindowPeer implements java.awt.peer.WindowPeer {
    private sun.awt.peer.cacio.ProxyWindow proxyWindow;

    ProxyWindowPeer(sun.awt.peer.cacio.ProxyWindow r4) {
            r3 = this;
            r0 = r3
            r0.<init>()
            r0 = r3
            r1 = r4
            r0.proxyWindow = r1
            return
    }

    sun.awt.peer.cacio.CacioComponentPeer getTarget() {
            r2 = this;
            r0 = r2
            sun.awt.peer.cacio.ProxyWindow r0 = r0.proxyWindow
            sun.awt.peer.cacio.CacioComponentPeer r0 = r0.getTargetPeer()
            return r0
    }

    public void toFront() {
            r1 = this;
            return
    }

    public void toBack() {
            r1 = this;
            return
    }

    public void setAlwaysOnTop(boolean r2) {
            r1 = this;
            return
    }

    public void updateAlwaysOnTopState() {
            r1 = this;
            return
    }

    public void updateFocusableWindowState() {
            r4 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r1 = r0
            java.lang.String r2 = "Not supported yet."
            r1.<init>(r2)
            throw r0
    }

    public void setModalBlocked(java.awt.Dialog r2, boolean r3) {
            r1 = this;
            return
    }

    public void updateMinimumSize() {
            r4 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r1 = r0
            java.lang.String r2 = "Not supported yet."
            r1.<init>(r2)
            throw r0
    }

    public void updateIconImages() {
            r4 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r1 = r0
            java.lang.String r2 = "Not supported yet."
            r1.<init>(r2)
            throw r0
    }

    public java.awt.Insets getInsets() {
            r7 = this;
            java.awt.Insets r0 = new java.awt.Insets
            r1 = r0
            r2 = 0
            r3 = 0
            r4 = 0
            r5 = 0
            r1.<init>(r2, r3, r4, r5)
            return r0
    }

    public void beginValidate() {
            r1 = this;
            return
    }

    public void endValidate() {
            r1 = this;
            return
    }

    public void beginLayout() {
            r1 = this;
            return
    }

    public void endLayout() {
            r1 = this;
            return
    }

    public boolean isObscured() {
            r4 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r1 = r0
            java.lang.String r2 = "Not supported yet."
            r1.<init>(r2)
            throw r0
    }

    public boolean canDetermineObscurity() {
            r2 = this;
            r0 = 0
            return r0
    }

    public void setVisible(boolean r2) {
            r1 = this;
            return
    }

    public void setEnabled(boolean r2) {
            r1 = this;
            return
    }

    public void paint(java.awt.Graphics r5) {
            r4 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r1 = r0
            java.lang.String r2 = "Not supported yet."
            r1.<init>(r2)
            throw r0
    }

    public void print(java.awt.Graphics r5) {
            r4 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r1 = r0
            java.lang.String r2 = "Not supported yet."
            r1.<init>(r2)
            throw r0
    }

    public void setBounds(int r2, int r3, int r4, int r5, int r6) {
            r1 = this;
            return
    }

    public void handleEvent(java.awt.AWTEvent r4) {
            r3 = this;
            r0 = r4
            boolean r0 = r0 instanceof java.awt.event.WindowEvent
            if (r0 == 0) goto L12
            r0 = r3
            sun.awt.peer.cacio.CacioComponentPeer r0 = r0.getTarget()
            java.awt.Component r0 = r0.getAWTComponent()
            r1 = r4
            r0.dispatchEvent(r1)
        L12:
            return
    }

    public void coalescePaintEvent(java.awt.event.PaintEvent r2) {
            r1 = this;
            return
    }

    public java.awt.Point getLocationOnScreen() {
            r2 = this;
            r0 = r2
            sun.awt.peer.cacio.CacioComponentPeer r0 = r0.getTarget()
            java.awt.Point r0 = r0.getLocationOnScreen()
            return r0
    }

    public java.awt.Dimension getPreferredSize() {
            r4 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r1 = r0
            java.lang.String r2 = "Not supported yet."
            r1.<init>(r2)
            throw r0
    }

    public java.awt.Dimension getMinimumSize() {
            r4 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r1 = r0
            java.lang.String r2 = "Not supported yet."
            r1.<init>(r2)
            throw r0
    }

    public java.awt.image.ColorModel getColorModel() {
            r2 = this;
            r0 = r2
            sun.awt.peer.cacio.CacioComponentPeer r0 = r0.getTarget()
            java.awt.image.ColorModel r0 = r0.getColorModel()
            return r0
    }

    public java.awt.Toolkit getToolkit() {
            r2 = this;
            r0 = r2
            sun.awt.peer.cacio.CacioComponentPeer r0 = r0.getTarget()
            java.awt.Toolkit r0 = r0.getToolkit()
            return r0
    }

    public java.awt.Graphics getGraphics() {
            r2 = this;
            r0 = r2
            sun.awt.peer.cacio.CacioComponentPeer r0 = r0.getTarget()
            java.awt.Graphics r0 = r0.getGraphics()
            return r0
    }

    public java.awt.FontMetrics getFontMetrics(java.awt.Font r4) {
            r3 = this;
            r0 = r3
            sun.awt.peer.cacio.CacioComponentPeer r0 = r0.getTarget()
            r1 = r4
            java.awt.FontMetrics r0 = r0.getFontMetrics(r1)
            return r0
    }

    public void dispose() {
            r3 = this;
            r0 = r3
            sun.awt.peer.cacio.ProxyWindow r0 = r0.proxyWindow
            r1 = r3
            sun.awt.peer.cacio.CacioToolkit.disposePeer(r0, r1)
            return
    }

    public void setForeground(java.awt.Color r5) {
            r4 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r1 = r0
            java.lang.String r2 = "Not supported yet."
            r1.<init>(r2)
            throw r0
    }

    public void setBackground(java.awt.Color r5) {
            r4 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r1 = r0
            java.lang.String r2 = "Not supported yet."
            r1.<init>(r2)
            throw r0
    }

    public void setFont(java.awt.Font r5) {
            r4 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r1 = r0
            java.lang.String r2 = "Not supported yet."
            r1.<init>(r2)
            throw r0
    }

    public void updateCursorImmediately() {
            r2 = this;
            r0 = r2
            sun.awt.peer.cacio.CacioComponentPeer r0 = r0.getTarget()
            r0.updateCursorImmediately()
            return
    }

    public boolean requestFocus(java.awt.Component r9, boolean r10, boolean r11, long r12, sun.awt.CausedFocusEvent.Cause r14) {
            r8 = this;
            r0 = r8
            sun.awt.peer.cacio.CacioComponentPeer r0 = r0.getTarget()
            r1 = r9
            r2 = r10
            r3 = r11
            r4 = r12
            r5 = r14
            boolean r0 = r0.requestFocus(r1, r2, r3, r4, r5)
            return r0
    }

    public boolean isFocusable() {
            r2 = this;
            r0 = r2
            sun.awt.peer.cacio.CacioComponentPeer r0 = r0.getTarget()
            boolean r0 = r0.isFocusable()
            return r0
    }

    public java.awt.Image createImage(java.awt.image.ImageProducer r5) {
            r4 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r1 = r0
            java.lang.String r2 = "Not supported yet."
            r1.<init>(r2)
            throw r0
    }

    public java.awt.Image createImage(int r5, int r6) {
            r4 = this;
            r0 = r4
            sun.awt.peer.cacio.CacioComponentPeer r0 = r0.getTarget()
            r1 = r5
            r2 = r6
            java.awt.Image r0 = r0.createImage(r1, r2)
            return r0
    }

    public java.awt.image.VolatileImage createVolatileImage(int r5, int r6) {
            r4 = this;
            r0 = r4
            sun.awt.peer.cacio.CacioComponentPeer r0 = r0.getTarget()
            r1 = r5
            r2 = r6
            java.awt.image.VolatileImage r0 = r0.createVolatileImage(r1, r2)
            return r0
    }

    public boolean prepareImage(java.awt.Image r7, int r8, int r9, java.awt.image.ImageObserver r10) {
            r6 = this;
            r0 = r6
            sun.awt.peer.cacio.CacioComponentPeer r0 = r0.getTarget()
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            boolean r0 = r0.prepareImage(r1, r2, r3, r4)
            return r0
    }

    public int checkImage(java.awt.Image r7, int r8, int r9, java.awt.image.ImageObserver r10) {
            r6 = this;
            r0 = r6
            sun.awt.peer.cacio.CacioComponentPeer r0 = r0.getTarget()
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            int r0 = r0.checkImage(r1, r2, r3, r4)
            return r0
    }

    public java.awt.GraphicsConfiguration getGraphicsConfiguration() {
            r2 = this;
            r0 = r2
            sun.awt.peer.cacio.CacioComponentPeer r0 = r0.getTarget()
            java.awt.GraphicsConfiguration r0 = r0.getGraphicsConfiguration()
            return r0
    }

    public boolean handlesWheelScrolling() {
            r4 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r1 = r0
            java.lang.String r2 = "Not supported yet."
            r1.<init>(r2)
            throw r0
    }

    public void createBuffers(int r5, java.awt.BufferCapabilities r6) throws java.awt.AWTException {
            r4 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r1 = r0
            java.lang.String r2 = "Not supported yet."
            r1.<init>(r2)
            throw r0
    }

    public java.awt.Image getBackBuffer() {
            r4 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r1 = r0
            java.lang.String r2 = "Not supported yet."
            r1.<init>(r2)
            throw r0
    }

    public void flip(int r5, int r6, int r7, int r8, java.awt.BufferCapabilities.FlipContents r9) {
            r4 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r1 = r0
            java.lang.String r2 = "Not supported yet."
            r1.<init>(r2)
            throw r0
    }

    public void destroyBuffers() {
            r4 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r1 = r0
            java.lang.String r2 = "Not supported yet."
            r1.<init>(r2)
            throw r0
    }

    public void reparent(java.awt.peer.ContainerPeer r5) {
            r4 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r1 = r0
            java.lang.String r2 = "Not supported yet."
            r1.<init>(r2)
            throw r0
    }

    public boolean isReparentSupported() {
            r2 = this;
            r0 = 0
            return r0
    }

    public void layout() {
            r1 = this;
            return
    }

    public void applyShape(sun.java2d.pipe.Region r5) {
            r4 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r1 = r0
            java.lang.String r2 = "Not supported yet."
            r1.<init>(r2)
            throw r0
    }

    public void setOpacity(float r5) {
            r4 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r1 = r0
            java.lang.String r2 = "Not supported yet."
            r1.<init>(r2)
            throw r0
    }

    public void setOpaque(boolean r5) {
            r4 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r1 = r0
            java.lang.String r2 = "Not supported yet."
            r1.<init>(r2)
            throw r0
    }

    public void repositionSecurityWarning() {
            r4 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r1 = r0
            java.lang.String r2 = "Not supported yet."
            r1.<init>(r2)
            throw r0
    }

    public void setZOrder(java.awt.peer.ComponentPeer r5) {
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

    public boolean updateGraphicsData(java.awt.GraphicsConfiguration r5) {
            r4 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r1 = r0
            java.lang.String r2 = "Not supported yet."
            r1.<init>(r2)
            throw r0
    }
}
