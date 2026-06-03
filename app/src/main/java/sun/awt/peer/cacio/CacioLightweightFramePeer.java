package sun.awt.peer.cacio;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/caciocavallo.zip:caciocavallo/cacio-shared-1.10-SNAPSHOT.jar:sun/awt/peer/cacio/CacioLightweightFramePeer.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/caciocavallo/cacio-shared-1.10-SNAPSHOT.jar:sun/awt/peer/cacio/CacioLightweightFramePeer.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/caciocavallo.zip:caciocavallo/cacio-shared-1.10-SNAPSHOT.jar:sun/awt/peer/cacio/CacioLightweightFramePeer.class */
public class CacioLightweightFramePeer extends sun.awt.peer.cacio.CacioFramePeer {
    public CacioLightweightFramePeer(sun.awt.LightweightFrame r5, sun.awt.peer.cacio.PlatformWindowFactory r6) {
            r4 = this;
            r0 = r4
            r1 = r5
            r2 = r6
            r0.<init>(r1, r2)
            return
    }

    private sun.awt.LightweightFrame getLwTarget() {
            r2 = this;
            r0 = r2
            java.awt.Component r0 = r0.getAWTComponent()
            sun.awt.LightweightFrame r0 = (sun.awt.LightweightFrame) r0
            return r0
    }

    @Override // sun.awt.peer.cacio.CacioComponentPeer
    public java.awt.Graphics getGraphics() {
            r2 = this;
            r0 = r2
            sun.awt.LightweightFrame r0 = r0.getLwTarget()
            java.awt.Graphics r0 = r0.getGraphics()
            return r0
    }

    @Override // sun.awt.peer.cacio.CacioComponentPeer
    public void handleEvent(java.awt.AWTEvent r4) {
            r3 = this;
            r0 = r4
            int r0 = r0.getID()
            r1 = 501(0x1f5, float:7.02E-43)
            if (r0 != r1) goto Lf
            r0 = r3
            r1 = 1
            r0.emulateActivation(r1)
        Lf:
            r0 = r3
            r1 = r4
            super.handleEvent(r1)
            return
    }

    public boolean isLightweightFramePeer() {
            r2 = this;
            r0 = 1
            return r0
    }

    @Override // sun.awt.peer.cacio.CacioFramePeer
    public /* bridge */ /* synthetic */ void emulateActivation(boolean r4) {
            r3 = this;
            r0 = r3
            r1 = r4
            super.emulateActivation(r1)
            return
    }

    @Override // sun.awt.peer.cacio.CacioFramePeer, sun.awt.peer.cacio.CacioWindowPeer
    public /* bridge */ /* synthetic */ void updateAlwaysOnTopState() {
            r2 = this;
            r0 = r2
            super.updateAlwaysOnTopState()
            return
    }

    @Override // sun.awt.peer.cacio.CacioFramePeer
    public /* bridge */ /* synthetic */ void setBoundsPrivate(int r7, int r8, int r9, int r10) {
            r6 = this;
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            super.setBoundsPrivate(r1, r2, r3, r4)
            return
    }

    @Override // sun.awt.peer.cacio.CacioFramePeer
    public /* bridge */ /* synthetic */ java.awt.Rectangle getBoundsPrivate() {
            r2 = this;
            r0 = r2
            java.awt.Rectangle r0 = super.getBoundsPrivate()
            return r0
    }

    @Override // sun.awt.peer.cacio.CacioFramePeer
    public /* bridge */ /* synthetic */ void setTitle(java.lang.String r4) {
            r3 = this;
            r0 = r3
            r1 = r4
            super.setTitle(r1)
            return
    }

    @Override // sun.awt.peer.cacio.CacioFramePeer
    public /* bridge */ /* synthetic */ void setResizable(boolean r4) {
            r3 = this;
            r0 = r3
            r1 = r4
            super.setResizable(r1)
            return
    }

    @Override // sun.awt.peer.cacio.CacioFramePeer
    public /* bridge */ /* synthetic */ void setMenuBar(java.awt.MenuBar r4) {
            r3 = this;
            r0 = r3
            r1 = r4
            super.setMenuBar(r1)
            return
    }

    @Override // sun.awt.peer.cacio.CacioFramePeer
    public /* bridge */ /* synthetic */ void setMaximizedBounds(java.awt.Rectangle r4) {
            r3 = this;
            r0 = r3
            r1 = r4
            super.setMaximizedBounds(r1)
            return
    }

    @Override // sun.awt.peer.cacio.CacioFramePeer
    public /* bridge */ /* synthetic */ void setState(int r4) {
            r3 = this;
            r0 = r3
            r1 = r4
            super.setState(r1)
            return
    }

    @Override // sun.awt.peer.cacio.CacioFramePeer
    public /* bridge */ /* synthetic */ int getState() {
            r2 = this;
            r0 = r2
            int r0 = super.getState()
            return r0
    }

    @Override // sun.awt.peer.cacio.CacioWindowPeer, sun.awt.peer.cacio.CacioComponentPeer, sun.awt.peer.cacio.CacioComponent
    public /* bridge */ /* synthetic */ boolean isFocusable() {
            r2 = this;
            r0 = r2
            boolean r0 = super.isFocusable()
            return r0
    }

    @Override // sun.awt.peer.cacio.CacioWindowPeer
    public /* bridge */ /* synthetic */ void updateWindow() {
            r2 = this;
            r0 = r2
            super.updateWindow()
            return
    }

    @Override // sun.awt.peer.cacio.CacioWindowPeer
    public /* bridge */ /* synthetic */ void repositionSecurityWarning() {
            r2 = this;
            r0 = r2
            super.repositionSecurityWarning()
            return
    }

    @Override // sun.awt.peer.cacio.CacioWindowPeer
    public /* bridge */ /* synthetic */ void setOpaque(boolean r4) {
            r3 = this;
            r0 = r3
            r1 = r4
            super.setOpaque(r1)
            return
    }

    @Override // sun.awt.peer.cacio.CacioWindowPeer
    public /* bridge */ /* synthetic */ void setOpacity(float r4) {
            r3 = this;
            r0 = r3
            r1 = r4
            super.setOpacity(r1)
            return
    }

    @Override // sun.awt.peer.cacio.CacioWindowPeer, sun.awt.peer.cacio.CacioContainerPeer, sun.awt.peer.cacio.CacioComponentPeer
    public /* bridge */ /* synthetic */ java.awt.Insets getInsets() {
            r2 = this;
            r0 = r2
            java.awt.Insets r0 = super.getInsets()
            return r0
    }

    @Override // sun.awt.peer.cacio.CacioWindowPeer, sun.awt.peer.cacio.CacioComponentPeer, sun.awt.peer.cacio.CacioComponent
    public /* bridge */ /* synthetic */ void handlePeerEvent(java.awt.AWTEvent r4) {
            r3 = this;
            r0 = r3
            r1 = r4
            super.handlePeerEvent(r1)
            return
    }

    @Override // sun.awt.peer.cacio.CacioWindowPeer
    public /* bridge */ /* synthetic */ void updateMinimumSize() {
            r2 = this;
            r0 = r2
            super.updateMinimumSize()
            return
    }

    @Override // sun.awt.peer.cacio.CacioWindowPeer
    public /* bridge */ /* synthetic */ void updateIconImages() {
            r2 = this;
            r0 = r2
            super.updateIconImages()
            return
    }

    @Override // sun.awt.peer.cacio.CacioWindowPeer
    public /* bridge */ /* synthetic */ void updateFocusableWindowState() {
            r2 = this;
            r0 = r2
            super.updateFocusableWindowState()
            return
    }

    @Override // sun.awt.peer.cacio.CacioWindowPeer
    public /* bridge */ /* synthetic */ void toFront() {
            r2 = this;
            r0 = r2
            super.toFront()
            return
    }

    @Override // sun.awt.peer.cacio.CacioWindowPeer
    public /* bridge */ /* synthetic */ void toBack() {
            r2 = this;
            r0 = r2
            super.toBack()
            return
    }

    @Override // sun.awt.peer.cacio.CacioWindowPeer
    public /* bridge */ /* synthetic */ void setModalBlocked(java.awt.Dialog r5, boolean r6) {
            r4 = this;
            r0 = r4
            r1 = r5
            r2 = r6
            super.setModalBlocked(r1, r2)
            return
    }

    @Override // sun.awt.peer.cacio.CacioWindowPeer
    public /* bridge */ /* synthetic */ void setAlwaysOnTop(boolean r4) {
            r3 = this;
            r0 = r3
            r1 = r4
            super.setAlwaysOnTop(r1)
            return
    }

    @Override // sun.awt.peer.cacio.CacioContainerPeer, sun.awt.peer.cacio.CacioComponentPeer
    public /* bridge */ /* synthetic */ void setEnabled(boolean r4) {
            r3 = this;
            r0 = r3
            r1 = r4
            super.setEnabled(r1)
            return
    }

    @Override // sun.awt.peer.cacio.CacioContainerPeer, sun.awt.peer.cacio.CacioComponentPeer
    public /* bridge */ /* synthetic */ void setBackground(java.awt.Color r4) {
            r3 = this;
            r0 = r3
            r1 = r4
            super.setBackground(r1)
            return
    }

    @Override // sun.awt.peer.cacio.CacioContainerPeer, sun.awt.peer.cacio.CacioComponentPeer
    public /* bridge */ /* synthetic */ void setForeground(java.awt.Color r4) {
            r3 = this;
            r0 = r3
            r1 = r4
            super.setForeground(r1)
            return
    }

    @Override // sun.awt.peer.cacio.CacioContainerPeer, sun.awt.peer.cacio.CacioComponentPeer
    public /* bridge */ /* synthetic */ void setFont(java.awt.Font r4) {
            r3 = this;
            r0 = r3
            r1 = r4
            super.setFont(r1)
            return
    }

    @Override // sun.awt.peer.cacio.CacioContainerPeer
    public /* bridge */ /* synthetic */ void restack() {
            r2 = this;
            r0 = r2
            super.restack()
            return
    }

    @Override // sun.awt.peer.cacio.CacioContainerPeer
    public /* bridge */ /* synthetic */ boolean isRestackSupported() {
            r2 = this;
            r0 = r2
            boolean r0 = super.isRestackSupported()
            return r0
    }

    @Override // sun.awt.peer.cacio.CacioContainerPeer
    public /* bridge */ /* synthetic */ void endValidate() {
            r2 = this;
            r0 = r2
            super.endValidate()
            return
    }

    @Override // sun.awt.peer.cacio.CacioContainerPeer
    public /* bridge */ /* synthetic */ void beginValidate() {
            r2 = this;
            r0 = r2
            super.beginValidate()
            return
    }

    @Override // sun.awt.peer.cacio.CacioContainerPeer
    public /* bridge */ /* synthetic */ void endLayout() {
            r2 = this;
            r0 = r2
            super.endLayout()
            return
    }

    @Override // sun.awt.peer.cacio.CacioContainerPeer
    public /* bridge */ /* synthetic */ void beginLayout() {
            r2 = this;
            r0 = r2
            super.beginLayout()
            return
    }

    @Override // sun.awt.peer.cacio.CacioComponentPeer
    public /* bridge */ /* synthetic */ void clearBackground() {
            r2 = this;
            r0 = r2
            super.clearBackground()
            return
    }

    @Override // sun.awt.peer.cacio.CacioComponentPeer
    public /* bridge */ /* synthetic */ boolean updateGraphicsData(java.awt.GraphicsConfiguration r4) {
            r3 = this;
            r0 = r3
            r1 = r4
            boolean r0 = super.updateGraphicsData(r1)
            return r0
    }

    @Override // sun.awt.peer.cacio.CacioComponentPeer
    public /* bridge */ /* synthetic */ void setZOrder(java.awt.peer.ComponentPeer r4) {
            r3 = this;
            r0 = r3
            r1 = r4
            super.setZOrder(r1)
            return
    }

    @Override // sun.awt.peer.cacio.CacioComponentPeer, sun.awt.peer.cacio.CacioComponent
    public /* bridge */ /* synthetic */ sun.awt.peer.cacio.PlatformWindow getPlatformWindow() {
            r2 = this;
            r0 = r2
            sun.awt.peer.cacio.PlatformWindow r0 = super.getPlatformWindow()
            return r0
    }

    @Override // sun.awt.peer.cacio.CacioComponentPeer
    public /* bridge */ /* synthetic */ boolean isObscured() {
            r2 = this;
            r0 = r2
            boolean r0 = super.isObscured()
            return r0
    }

    @Override // sun.awt.peer.cacio.CacioComponentPeer
    public /* bridge */ /* synthetic */ boolean canDetermineObscurity() {
            r2 = this;
            r0 = r2
            boolean r0 = super.canDetermineObscurity()
            return r0
    }

    @Override // sun.awt.peer.cacio.CacioComponentPeer
    public /* bridge */ /* synthetic */ void applyShape(sun.java2d.pipe.Region r4) {
            r3 = this;
            r0 = r3
            r1 = r4
            super.applyShape(r1)
            return
    }

    @Override // sun.awt.peer.cacio.CacioComponentPeer
    public /* bridge */ /* synthetic */ void coalescePaintEvent(java.awt.event.PaintEvent r4) {
            r3 = this;
            r0 = r3
            r1 = r4
            super.coalescePaintEvent(r1)
            return
    }

    @Override // sun.awt.peer.cacio.CacioComponentPeer
    public /* bridge */ /* synthetic */ java.awt.Image getBackBuffer() {
            r2 = this;
            r0 = r2
            java.awt.Image r0 = super.getBackBuffer()
            return r0
    }

    @Override // sun.awt.peer.cacio.CacioComponentPeer
    public /* bridge */ /* synthetic */ void flip(int r8, int r9, int r10, int r11, java.awt.BufferCapabilities.FlipContents r12) {
            r7 = this;
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            r5 = r12
            super.flip(r1, r2, r3, r4, r5)
            return
    }

    @Override // sun.awt.peer.cacio.CacioComponentPeer
    public /* bridge */ /* synthetic */ void destroyBuffers() {
            r2 = this;
            r0 = r2
            super.destroyBuffers()
            return
    }

    @Override // sun.awt.peer.cacio.CacioComponentPeer
    public /* bridge */ /* synthetic */ void createBuffers(int r5, java.awt.BufferCapabilities r6) throws java.awt.AWTException {
            r4 = this;
            r0 = r4
            r1 = r5
            r2 = r6
            super.createBuffers(r1, r2)
            return
    }

    @Override // sun.awt.peer.cacio.CacioComponentPeer
    public /* bridge */ /* synthetic */ java.awt.image.VolatileImage createVolatileImage(int r5, int r6) {
            r4 = this;
            r0 = r4
            r1 = r5
            r2 = r6
            java.awt.image.VolatileImage r0 = super.createVolatileImage(r1, r2)
            return r0
    }

    @Override // sun.awt.peer.cacio.CacioComponentPeer
    public /* bridge */ /* synthetic */ java.awt.Image createImage(int r5, int r6) {
            r4 = this;
            r0 = r4
            r1 = r5
            r2 = r6
            java.awt.Image r0 = super.createImage(r1, r2)
            return r0
    }

    @Override // sun.awt.peer.cacio.CacioComponentPeer
    public /* bridge */ /* synthetic */ java.awt.Image createImage(java.awt.image.ImageProducer r4) {
            r3 = this;
            r0 = r3
            r1 = r4
            java.awt.Image r0 = super.createImage(r1)
            return r0
    }

    @Override // sun.awt.peer.cacio.CacioComponentPeer
    public /* bridge */ /* synthetic */ boolean prepareImage(java.awt.Image r7, int r8, int r9, java.awt.image.ImageObserver r10) {
            r6 = this;
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            boolean r0 = super.prepareImage(r1, r2, r3, r4)
            return r0
    }

    @Override // sun.awt.peer.cacio.CacioComponentPeer
    public /* bridge */ /* synthetic */ int checkImage(java.awt.Image r7, int r8, int r9, java.awt.image.ImageObserver r10) {
            r6 = this;
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            int r0 = super.checkImage(r1, r2, r3, r4)
            return r0
    }

    @Override // sun.awt.peer.cacio.CacioComponentPeer
    public /* bridge */ /* synthetic */ void updateCursorImmediately() {
            r2 = this;
            r0 = r2
            super.updateCursorImmediately()
            return
    }

    @Override // sun.awt.peer.cacio.CacioComponentPeer
    public /* bridge */ /* synthetic */ void setVisible(boolean r4) {
            r3 = this;
            r0 = r3
            r1 = r4
            super.setVisible(r1)
            return
    }

    @Override // sun.awt.peer.cacio.CacioComponentPeer
    public /* bridge */ /* synthetic */ void setBounds(int r8, int r9, int r10, int r11, int r12) {
            r7 = this;
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            r5 = r12
            super.setBounds(r1, r2, r3, r4, r5)
            return
    }

    @Override // sun.awt.peer.cacio.CacioComponentPeer
    public /* bridge */ /* synthetic */ boolean requestFocus(java.awt.Component r9, boolean r10, boolean r11, long r12, sun.awt.CausedFocusEvent.Cause r14) {
            r8 = this;
            r0 = r8
            r1 = r9
            r2 = r10
            r3 = r11
            r4 = r12
            r5 = r14
            boolean r0 = super.requestFocus(r1, r2, r3, r4, r5)
            return r0
    }

    @Override // sun.awt.peer.cacio.CacioComponentPeer
    public /* bridge */ /* synthetic */ void print(java.awt.Graphics r4) {
            r3 = this;
            r0 = r3
            r1 = r4
            super.print(r1)
            return
    }

    @Override // sun.awt.peer.cacio.CacioComponentPeer
    public /* bridge */ /* synthetic */ void paint(java.awt.Graphics r4) {
            r3 = this;
            r0 = r3
            r1 = r4
            super.paint(r1)
            return
    }

    @Override // sun.awt.peer.cacio.CacioComponentPeer
    public /* bridge */ /* synthetic */ void layout() {
            r2 = this;
            r0 = r2
            super.layout()
            return
    }

    @Override // sun.awt.peer.cacio.CacioComponentPeer
    public /* bridge */ /* synthetic */ void reparent(java.awt.peer.ContainerPeer r4) {
            r3 = this;
            r0 = r3
            r1 = r4
            super.reparent(r1)
            return
    }

    @Override // sun.awt.peer.cacio.CacioComponentPeer
    public /* bridge */ /* synthetic */ boolean isReparentSupported() {
            r2 = this;
            r0 = r2
            boolean r0 = super.isReparentSupported()
            return r0
    }

    @Override // sun.awt.peer.cacio.CacioComponentPeer
    public /* bridge */ /* synthetic */ boolean handlesWheelScrolling() {
            r2 = this;
            r0 = r2
            boolean r0 = super.handlesWheelScrolling()
            return r0
    }

    @Override // sun.awt.peer.cacio.CacioComponentPeer
    public /* bridge */ /* synthetic */ java.awt.Toolkit getToolkit() {
            r2 = this;
            r0 = r2
            java.awt.Toolkit r0 = super.getToolkit()
            return r0
    }

    @Override // sun.awt.peer.cacio.CacioComponentPeer
    public /* bridge */ /* synthetic */ java.awt.Dimension getPreferredSize() {
            r2 = this;
            r0 = r2
            java.awt.Dimension r0 = super.getPreferredSize()
            return r0
    }

    @Override // sun.awt.peer.cacio.CacioComponentPeer
    public /* bridge */ /* synthetic */ java.awt.Dimension getMinimumSize() {
            r2 = this;
            r0 = r2
            java.awt.Dimension r0 = super.getMinimumSize()
            return r0
    }

    @Override // sun.awt.peer.cacio.CacioComponentPeer
    public /* bridge */ /* synthetic */ java.awt.Point getLocationOnScreen() {
            r2 = this;
            r0 = r2
            java.awt.Point r0 = super.getLocationOnScreen()
            return r0
    }

    @Override // sun.awt.peer.cacio.CacioComponentPeer
    public /* bridge */ /* synthetic */ java.awt.FontMetrics getFontMetrics(java.awt.Font r4) {
            r3 = this;
            r0 = r3
            r1 = r4
            java.awt.FontMetrics r0 = super.getFontMetrics(r1)
            return r0
    }

    @Override // sun.awt.peer.cacio.CacioComponentPeer
    public /* bridge */ /* synthetic */ java.awt.GraphicsConfiguration getGraphicsConfiguration() {
            r2 = this;
            r0 = r2
            java.awt.GraphicsConfiguration r0 = super.getGraphicsConfiguration()
            return r0
    }

    @Override // sun.awt.peer.cacio.CacioComponentPeer
    public /* bridge */ /* synthetic */ java.awt.image.ColorModel getColorModel() {
            r2 = this;
            r0 = r2
            java.awt.image.ColorModel r0 = super.getColorModel()
            return r0
    }

    @Override // sun.awt.peer.cacio.CacioComponentPeer
    public /* bridge */ /* synthetic */ void dispose() {
            r2 = this;
            r0 = r2
            super.dispose()
            return
    }
}
