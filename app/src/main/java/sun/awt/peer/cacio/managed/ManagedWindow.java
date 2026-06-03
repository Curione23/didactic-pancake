package sun.awt.peer.cacio.managed;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/caciocavallo.zip:caciocavallo/cacio-shared-1.10-SNAPSHOT.jar:sun/awt/peer/cacio/managed/ManagedWindow.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/caciocavallo/cacio-shared-1.10-SNAPSHOT.jar:sun/awt/peer/cacio/managed/ManagedWindow.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/caciocavallo.zip:caciocavallo/cacio-shared-1.10-SNAPSHOT.jar:sun/awt/peer/cacio/managed/ManagedWindow.class */
class ManagedWindow extends sun.awt.peer.cacio.managed.AbstractManagedWindowContainer implements sun.awt.peer.cacio.PlatformToplevelWindow {
    private sun.awt.peer.cacio.managed.ManagedWindowContainer parent;
    private sun.awt.peer.cacio.CacioComponent cacioComponent;
    private int x;
    private int y;
    private int width;
    private int height;
    private java.awt.Color background;
    private java.awt.Color foreground;
    private java.awt.Font font;
    private boolean visible;

    ManagedWindow(sun.awt.peer.cacio.managed.ManagedWindowContainer r8, sun.awt.peer.cacio.CacioComponent r9) {
            r7 = this;
            r0 = r7
            r0.<init>()
            r0 = r7
            r1 = r8
            r0.parent = r1
            r0 = r7
            r1 = r9
            r0.cacioComponent = r1
            r0 = r7
            sun.awt.peer.cacio.managed.ManagedWindowContainer r0 = r0.parent
            r1 = r7
            r0.add(r1)
            r0 = r7
            sun.awt.peer.cacio.CacioComponent r0 = r0.cacioComponent
            java.awt.Component r0 = r0.getAWTComponent()
            r10 = r0
            r0 = r7
            r1 = r10
            int r1 = r1.getX()
            r2 = r10
            int r2 = r2.getY()
            r3 = r10
            int r3 = r3.getWidth()
            r4 = r10
            int r4 = r4.getHeight()
            r5 = 0
            r0.setBounds(r1, r2, r3, r4, r5)
            return
    }

    @Override // sun.awt.peer.cacio.managed.ManagedWindowContainer, sun.awt.peer.cacio.PlatformWindow
    public java.awt.image.ColorModel getColorModel() {
            r2 = this;
            r0 = r2
            sun.awt.peer.cacio.managed.ManagedWindowContainer r0 = r0.parent
            java.awt.image.ColorModel r0 = r0.getColorModel()
            return r0
    }

    @Override // sun.awt.peer.cacio.managed.ManagedWindowContainer
    public java.awt.Graphics2D getClippedGraphics(java.awt.Color r7, java.awt.Color r8, java.awt.Font r9, java.util.List<java.awt.Rectangle> r10) {
            r6 = this;
            r0 = r10
            if (r0 == 0) goto L43
            r0 = r10
            java.util.Iterator r0 = r0.iterator()
            r11 = r0
        Le:
            r0 = r11
            boolean r0 = r0.hasNext()
            if (r0 == 0) goto L43
            r0 = r11
            java.lang.Object r0 = r0.next()
            java.awt.Rectangle r0 = (java.awt.Rectangle) r0
            r12 = r0
            r0 = r12
            r1 = r0
            int r1 = r1.x
            r2 = r6
            int r2 = r2.x
            int r1 = r1 + r2
            r0.x = r1
            r0 = r12
            r1 = r0
            int r1 = r1.y
            r2 = r6
            int r2 = r2.y
            int r1 = r1 + r2
            r0.y = r1
            goto Le
        L43:
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            java.awt.Graphics2D r0 = r0.prepareClippedGraphics(r1, r2, r3, r4)
            return r0
    }

    @Override // sun.awt.peer.cacio.PlatformWindow
    public java.awt.Graphics2D getGraphics(java.awt.Color r7, java.awt.Color r8, java.awt.Font r9) {
            r6 = this;
            r0 = r6
            java.util.LinkedList r0 = r0.getChildren()
            r11 = r0
            r0 = r11
            if (r0 == 0) goto L52
            r0 = r11
            int r0 = r0.size()
            if (r0 <= 0) goto L52
            java.util.LinkedList r0 = new java.util.LinkedList
            r1 = r0
            r1.<init>()
            r10 = r0
            r0 = r11
            java.util.Iterator r0 = r0.iterator()
            r12 = r0
        L23:
            r0 = r12
            boolean r0 = r0.hasNext()
            if (r0 == 0) goto L4f
            r0 = r12
            java.lang.Object r0 = r0.next()
            sun.awt.peer.cacio.managed.ManagedWindow r0 = (sun.awt.peer.cacio.managed.ManagedWindow) r0
            r13 = r0
            r0 = r13
            boolean r0 = r0.isVisible()
            if (r0 == 0) goto L4c
            r0 = r10
            r1 = r13
            java.awt.Rectangle r1 = r1.getBounds()
            boolean r0 = r0.add(r1)
        L4c:
            goto L23
        L4f:
            goto L55
        L52:
            r0 = 0
            r10 = r0
        L55:
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            java.awt.Graphics2D r0 = r0.getClippedGraphics(r1, r2, r3, r4)
            r12 = r0
            r0 = r12
            return r0
    }

    private java.awt.Graphics2D prepareClippedGraphics(java.awt.Color r7, java.awt.Color r8, java.awt.Font r9, java.util.List<java.awt.Rectangle> r10) {
            r6 = this;
            r0 = r6
            r1 = r10
            java.util.List r0 = r0.addClipRects(r1)
            r10 = r0
            r0 = r6
            sun.awt.peer.cacio.managed.ManagedWindowContainer r0 = r0.parent
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            java.awt.Graphics2D r0 = r0.getClippedGraphics(r1, r2, r3, r4)
            r11 = r0
            r0 = r11
            boolean r0 = r0 instanceof sun.awt.ConstrainableGraphics
            if (r0 == 0) goto L3d
            r0 = r11
            sun.awt.ConstrainableGraphics r0 = (sun.awt.ConstrainableGraphics) r0
            r1 = r6
            int r1 = r1.x
            r2 = r6
            int r2 = r2.y
            r3 = r6
            int r3 = r3.width
            r4 = r6
            int r4 = r4.height
            r0.constrain(r1, r2, r3, r4)
            goto L57
        L3d:
            r0 = r11
            r1 = r6
            int r1 = r1.x
            r2 = r6
            int r2 = r2.y
            r3 = r6
            int r3 = r3.width
            r4 = r6
            int r4 = r4.height
            java.awt.Graphics r0 = r0.create(r1, r2, r3, r4)
            java.awt.Graphics2D r0 = (java.awt.Graphics2D) r0
            r11 = r0
        L57:
            r0 = r11
            return r0
    }

    private java.util.List<java.awt.Rectangle> addClipRects(java.util.List<java.awt.Rectangle> r4) {
            r3 = this;
            r0 = r3
            sun.awt.peer.cacio.managed.ManagedWindowContainer r0 = r0.parent
            java.util.Deque r0 = r0.getChildren()
            r5 = r0
            r0 = r5
            java.lang.Object r0 = r0.getLast()
            r1 = r3
            if (r0 == r1) goto L6f
            r0 = r4
            if (r0 != 0) goto L20
            java.util.LinkedList r0 = new java.util.LinkedList
            r1 = r0
            r1.<init>()
            r4 = r0
        L20:
            r0 = r5
            java.util.Iterator r0 = r0.descendingIterator()
            r6 = r0
            r0 = r3
            java.awt.Rectangle r0 = r0.getBounds()
            r7 = r0
        L2d:
            r0 = r6
            boolean r0 = r0.hasNext()
            if (r0 == 0) goto L6f
            r0 = r6
            java.lang.Object r0 = r0.next()
            sun.awt.peer.cacio.managed.ManagedWindow r0 = (sun.awt.peer.cacio.managed.ManagedWindow) r0
            r8 = r0
            r0 = r8
            r1 = r3
            if (r0 != r1) goto L4a
            goto L6f
        L4a:
            r0 = r8
            boolean r0 = r0.isVisible()
            if (r0 == 0) goto L6c
            r0 = r8
            java.awt.Rectangle r0 = r0.getBounds()
            r9 = r0
            r0 = r9
            r1 = r7
            boolean r0 = r0.intersects(r1)
            if (r0 == 0) goto L6c
            r0 = r4
            r1 = r9
            boolean r0 = r0.add(r1)
        L6c:
            goto L2d
        L6f:
            r0 = r4
            return r0
    }

    @Override // sun.awt.peer.cacio.managed.ManagedWindowContainer, sun.awt.peer.cacio.PlatformWindow
    public java.awt.GraphicsConfiguration getGraphicsConfiguration() {
            r2 = this;
            r0 = r2
            sun.awt.peer.cacio.managed.ManagedWindowContainer r0 = r0.parent
            java.awt.GraphicsConfiguration r0 = r0.getGraphicsConfiguration()
            return r0
    }

    @Override // sun.awt.peer.cacio.PlatformWindow
    public void dispose() {
            r3 = this;
            r0 = r3
            r1 = 0
            r0.setVisible(r1)
            r0 = r3
            sun.awt.peer.cacio.managed.ManagedWindowContainer r0 = r0.parent
            r1 = r3
            r0.remove(r1)
            return
    }

    @Override // sun.awt.peer.cacio.PlatformWindow
    public java.awt.Rectangle getBounds() {
            r7 = this;
            java.awt.Rectangle r0 = new java.awt.Rectangle
            r1 = r0
            r2 = r7
            int r2 = r2.x
            r3 = r7
            int r3 = r3.y
            r4 = r7
            int r4 = r4.width
            r5 = r7
            int r5 = r5.height
            r1.<init>(r2, r3, r4, r5)
            return r0
    }

    @Override // sun.awt.peer.cacio.PlatformWindow
    public void setBounds(int r7, int r8, int r9, int r10, int r11) {
            r6 = this;
            r0 = r6
            int r0 = r0.x
            r12 = r0
            r0 = r6
            int r0 = r0.y
            r13 = r0
            r0 = r6
            int r0 = r0.width
            r14 = r0
            r0 = r6
            int r0 = r0.height
            r15 = r0
            r0 = r6
            r1 = r7
            r0.x = r1
            r0 = r6
            r1 = r8
            r0.y = r1
            r0 = r6
            r1 = r9
            r0.width = r1
            r0 = r6
            r1 = r10
            r0.height = r1
            r0 = r6
            boolean r0 = r0.isVisible()
            if (r0 == 0) goto L53
            r0 = r6
            sun.awt.peer.cacio.managed.ManagedWindowContainer r0 = r0.parent
            r1 = r12
            r2 = r13
            r3 = r14
            r4 = r15
            r0.repaint(r1, r2, r3, r4)
            r0 = r6
            sun.awt.peer.cacio.managed.ManagedWindowContainer r0 = r0.parent
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            r0.repaint(r1, r2, r3, r4)
        L53:
            return
    }

    @Override // sun.awt.peer.cacio.PlatformWindow
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

    @Override // sun.awt.peer.cacio.managed.AbstractManagedWindowContainer, sun.awt.peer.cacio.managed.ManagedWindowContainer
    public java.awt.Point getLocationOnScreen() {
            r4 = this;
            r0 = r4
            sun.awt.peer.cacio.managed.ManagedWindowContainer r0 = r0.parent
            java.awt.Point r0 = r0.getLocationOnScreen()
            r5 = r0
            r0 = r5
            r1 = r0
            int r1 = r1.x
            r2 = r4
            int r2 = r2.x
            int r1 = r1 + r2
            r0.x = r1
            r0 = r5
            r1 = r0
            int r1 = r1.y
            r2 = r4
            int r2 = r2.y
            int r1 = r1 + r2
            r0.y = r1
            r0 = r5
            return r0
    }

    @Override // sun.awt.peer.cacio.PlatformWindow
    public boolean canDetermineObscurity() {
            r2 = this;
            r0 = 1
            return r0
    }

    @Override // sun.awt.peer.cacio.PlatformWindow
    public boolean isObscured() {
            r6 = this;
            r0 = r6
            r1 = 0
            r2 = 0
            r3 = r6
            int r3 = r3.width
            r4 = r6
            int r4 = r4.height
            boolean r0 = r0.isRegionObscured(r1, r2, r3, r4)
            return r0
    }

    private boolean isRegionObscured(int r7, int r8, int r9, int r10) {
            r6 = this;
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            boolean r0 = r0.isParentObscured(r1, r2, r3, r4)
            if (r0 != 0) goto L18
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            boolean r0 = r0.hasOverlappingSiblings(r1, r2, r3, r4)
            if (r0 == 0) goto L1c
        L18:
            r0 = 1
            goto L1d
        L1c:
            r0 = 0
        L1d:
            return r0
    }

    private boolean isParentObscured(int r7, int r8, int r9, int r10) {
            r6 = this;
            r0 = r6
            sun.awt.peer.cacio.managed.ManagedWindowContainer r0 = r0.getParent()
            r11 = r0
            r0 = r11
            boolean r0 = r0 instanceof sun.awt.peer.cacio.managed.ManagedWindow
            if (r0 == 0) goto L2e
            r0 = r11
            sun.awt.peer.cacio.managed.ManagedWindow r0 = (sun.awt.peer.cacio.managed.ManagedWindow) r0
            r13 = r0
            r0 = r13
            r1 = r7
            r2 = r6
            int r2 = r2.x
            int r1 = r1 + r2
            r2 = r8
            r3 = r6
            int r3 = r3.y
            int r2 = r2 + r3
            r3 = r9
            r4 = r10
            boolean r0 = r0.isRegionObscured(r1, r2, r3, r4)
            r12 = r0
            goto L31
        L2e:
            r0 = 0
            r12 = r0
        L31:
            r0 = r12
            return r0
    }

    private boolean hasOverlappingSiblings(int r8, int r9, int r10, int r11) {
            r7 = this;
            r0 = r7
            sun.awt.peer.cacio.managed.ManagedWindowContainer r0 = r0.getParent()
            java.util.Deque r0 = r0.getChildren()
            r12 = r0
            r0 = 0
            r13 = r0
            java.awt.Rectangle r0 = new java.awt.Rectangle
            r1 = r0
            r2 = r8
            r3 = r9
            r4 = r10
            r5 = r11
            r1.<init>(r2, r3, r4, r5)
            r14 = r0
            r0 = r12
            java.util.Iterator r0 = r0.descendingIterator()
            r15 = r0
        L25:
            r0 = r15
            boolean r0 = r0.hasNext()
            if (r0 == 0) goto L5c
            r0 = r13
            if (r0 != 0) goto L5c
            r0 = r15
            java.lang.Object r0 = r0.next()
            sun.awt.peer.cacio.managed.ManagedWindow r0 = (sun.awt.peer.cacio.managed.ManagedWindow) r0
            r16 = r0
            r0 = r16
            r1 = r7
            if (r0 != r1) goto L49
            goto L5c
        L49:
            r0 = r16
            java.awt.Rectangle r0 = r0.getBounds()
            r17 = r0
            r0 = r14
            r1 = r17
            boolean r0 = r0.intersects(r1)
            r13 = r0
            goto L25
        L5c:
            r0 = r13
            return r0
    }

    @Override // sun.awt.peer.cacio.PlatformWindow
    public void applyShape(sun.java2d.pipe.Region r2) {
            r1 = this;
            return
    }

    @Override // sun.awt.peer.cacio.PlatformWindow
    public boolean isReparentSuppored() {
            r2 = this;
            r0 = 0
            return r0
    }

    @Override // sun.awt.peer.cacio.PlatformWindow
    public void reparent(java.awt.peer.ContainerPeer r2) {
            r1 = this;
            return
    }

    @Override // sun.awt.peer.cacio.PlatformWindow
    public boolean isRestackSupported() {
            r2 = this;
            r0 = 0
            return r0
    }

    @Override // sun.awt.peer.cacio.PlatformWindow
    public void restack() {
            r1 = this;
            return
    }

    @Override // sun.awt.peer.cacio.PlatformWindow
    public void setVisible(boolean r6) {
            r5 = this;
            r0 = r6
            r1 = r5
            boolean r1 = r1.visible
            if (r0 == r1) goto L5e
            r0 = r5
            r1 = r6
            r0.visible = r1
            r0 = r5
            java.awt.Rectangle r0 = r0.getBounds()
            r7 = r0
            r0 = r7
            r1 = r7
            r2 = 0
            r3 = r2; r2 = r1; r1 = r3; 
            r2.y = r3
            r0.x = r1
            r0 = r5
            r1 = r7
            r0.triggerRepaint(r1)
            r0 = r5
            java.util.LinkedList r0 = r0.getChildren()
            java.util.Iterator r0 = r0.iterator()
            r8 = r0
        L29:
            r0 = r8
            boolean r0 = r0.hasNext()
            if (r0 == 0) goto L56
            r0 = r8
            java.lang.Object r0 = r0.next()
            sun.awt.peer.cacio.managed.ManagedWindow r0 = (sun.awt.peer.cacio.managed.ManagedWindow) r0
            r9 = r0
            r0 = r9
            sun.awt.peer.cacio.CacioComponent r0 = r0.getCacioComponent()
            java.awt.Component r0 = r0.getAWTComponent()
            boolean r0 = r0.isVisible()
            if (r0 == 0) goto L53
            r0 = r9
            r1 = r6
            r0.setVisible(r1)
        L53:
            goto L29
        L56:
            sun.awt.peer.cacio.managed.FocusManager r0 = sun.awt.peer.cacio.managed.FocusManager.getInstance()
            r1 = r5
            r2 = r6
            r0.setVisible(r1, r2)
        L5e:
            return
    }

    private void triggerRepaint(java.awt.Rectangle r7) {
            r6 = this;
            r0 = r6
            java.awt.Rectangle r0 = r0.getBounds()
            r8 = r0
            r0 = r8
            r1 = r8
            r2 = 0
            r3 = r2; r2 = r1; r1 = r3; 
            r2.y = r3
            r0.x = r1
            r0 = r6
            boolean r0 = r0.isVisible()
            if (r0 == 0) goto L4c
            r0 = r8
            r1 = r7
            boolean r0 = r0.contains(r1)
            if (r0 == 0) goto L4c
            r0 = r6
            r1 = r7
            int r1 = r1.x
            r2 = r7
            int r2 = r2.y
            r3 = r7
            int r3 = r3.width
            r4 = r7
            int r4 = r4.height
            boolean r0 = r0.isRegionObscured(r1, r2, r3, r4)
            if (r0 != 0) goto L4c
            r0 = r6
            r1 = r7
            int r1 = r1.x
            r2 = r7
            int r2 = r2.y
            r3 = r7
            int r3 = r3.width
            r4 = r7
            int r4 = r4.height
            r0.repaint(r1, r2, r3, r4)
            goto Lab
        L4c:
            r0 = r6
            sun.awt.peer.cacio.managed.ManagedWindowContainer r0 = r0.getParent()
            r9 = r0
            r0 = r9
            boolean r0 = r0 instanceof sun.awt.peer.cacio.managed.ManagedWindow
            if (r0 == 0) goto L8b
            r0 = r9
            sun.awt.peer.cacio.managed.ManagedWindow r0 = (sun.awt.peer.cacio.managed.ManagedWindow) r0
            r10 = r0
            r0 = r10
            boolean r0 = r0.isVisible()
            if (r0 == 0) goto L88
            r0 = r7
            r1 = r0
            int r1 = r1.x
            r2 = r6
            int r2 = r2.x
            int r1 = r1 + r2
            r0.x = r1
            r0 = r7
            r1 = r0
            int r1 = r1.y
            r2 = r6
            int r2 = r2.y
            int r1 = r1 + r2
            r0.y = r1
            r0 = r9
            sun.awt.peer.cacio.managed.ManagedWindow r0 = (sun.awt.peer.cacio.managed.ManagedWindow) r0
            r1 = r7
            r0.triggerRepaint(r1)
        L88:
            goto Lab
        L8b:
            r0 = r9
            r1 = r7
            int r1 = r1.x
            r2 = r6
            int r2 = r2.x
            int r1 = r1 + r2
            r2 = r7
            int r2 = r2.y
            r3 = r6
            int r3 = r3.y
            int r2 = r2 + r3
            r3 = r7
            int r3 = r3.width
            r4 = r7
            int r4 = r4.height
            r0.repaint(r1, r2, r3, r4)
        Lab:
            return
    }

    boolean isVisible() {
            r2 = this;
            r0 = r2
            boolean r0 = r0.visible
            return r0
    }

    @Override // sun.awt.peer.cacio.PlatformToplevelWindow
    public int getState() {
            r2 = this;
            r0 = 0
            return r0
    }

    @Override // sun.awt.peer.cacio.PlatformToplevelWindow
    public void setState(int r2) {
            r1 = this;
            return
    }

    @Override // sun.awt.peer.cacio.PlatformToplevelWindow
    public void setMaximizedBounds(java.awt.Rectangle r2) {
            r1 = this;
            return
    }

    @Override // sun.awt.peer.cacio.PlatformToplevelWindow
    public void setResizable(boolean r2) {
            r1 = this;
            return
    }

    @Override // sun.awt.peer.cacio.PlatformToplevelWindow
    public void setTitle(java.lang.String r2) {
            r1 = this;
            return
    }

    @Override // sun.awt.peer.cacio.PlatformToplevelWindow
    public void setBlocked(boolean r2) {
            r1 = this;
            return
    }

    @Override // sun.awt.peer.cacio.PlatformWindow
    public boolean requestFocus(java.awt.Component r4, boolean r5, boolean r6, long r7, sun.awt.CausedFocusEvent.Cause r9) {
            r3 = this;
            sun.awt.peer.cacio.managed.FocusManager r0 = sun.awt.peer.cacio.managed.FocusManager.getInstance()
            r10 = r0
            r0 = r10
            r1 = r3
            r0.setFocusedWindow(r1)
            r0 = 1
            return r0
    }

    sun.awt.peer.cacio.CacioComponent getCacioComponent() {
            r2 = this;
            r0 = r2
            sun.awt.peer.cacio.CacioComponent r0 = r0.cacioComponent
            return r0
    }

    public void dispatchEvent(java.awt.AWTEvent r4) {
            r3 = this;
            r0 = r3
            sun.awt.peer.cacio.CacioComponent r0 = r0.getCacioComponent()
            r1 = r4
            r0.handlePeerEvent(r1)
            return
    }

    @Override // sun.awt.peer.cacio.managed.AbstractManagedWindowContainer
    protected boolean dispatchEventImpl(sun.awt.peer.cacio.managed.EventData r4) {
            r3 = this;
            r0 = r3
            r1 = r4
            boolean r0 = super.dispatchEventImpl(r1)
            r5 = r0
            r0 = r5
            if (r0 != 0) goto L37
            r0 = r4
            r1 = r3
            sun.awt.peer.cacio.CacioComponent r1 = r1.cacioComponent
            java.awt.Component r1 = r1.getAWTComponent()
            r0.setSource(r1)
            r0 = r3
            sun.awt.peer.cacio.CacioComponent r0 = r0.cacioComponent
            r1 = r4
            java.awt.AWTEvent r1 = r1.createAWTEvent()
            r0.handlePeerEvent(r1)
            r0 = 1
            r5 = r0
            r0 = r4
            int r0 = r0.getId()
            r1 = 501(0x1f5, float:7.02E-43)
            if (r0 != r1) goto L37
            sun.awt.peer.cacio.managed.FocusManager r0 = sun.awt.peer.cacio.managed.FocusManager.getInstance()
            r1 = r3
            r0.mousePressed(r1)
        L37:
            r0 = r5
            return r0
    }

    void dispatchKeyEvent(sun.awt.peer.cacio.managed.EventData r4) {
            r3 = this;
            r0 = r4
            r1 = r3
            sun.awt.peer.cacio.CacioComponent r1 = r1.cacioComponent
            java.awt.Component r1 = r1.getAWTComponent()
            r0.setSource(r1)
            r0 = r3
            sun.awt.peer.cacio.CacioComponent r0 = r0.cacioComponent
            r1 = r4
            java.awt.AWTEvent r1 = r1.createAWTEvent()
            r0.handlePeerEvent(r1)
            return
    }

    @Override // sun.awt.peer.cacio.PlatformWindow
    public void createBuffers(int r5, java.awt.BufferCapabilities r6) throws java.awt.AWTException {
            r4 = this;
            java.awt.AWTException r0 = new java.awt.AWTException
            r1 = r0
            java.lang.String r2 = "Not yet supported."
            r1.<init>(r2)
            throw r0
    }

    @Override // sun.awt.peer.cacio.PlatformWindow
    public void destroyBuffers() {
            r1 = this;
            return
    }

    @Override // sun.awt.peer.cacio.PlatformWindow
    public void flip(int r2, int r3, int r4, int r5, java.awt.BufferCapabilities.FlipContents r6) {
            r1 = this;
            return
    }

    @Override // sun.awt.peer.cacio.PlatformWindow
    public java.awt.Image getBackBuffer() {
            r2 = this;
            r0 = 0
            return r0
    }

    sun.awt.peer.cacio.managed.ManagedWindowContainer getParent() {
            r2 = this;
            r0 = r2
            sun.awt.peer.cacio.managed.ManagedWindowContainer r0 = r0.parent
            return r0
    }

    @Override // sun.awt.peer.cacio.managed.AbstractManagedWindowContainer, sun.awt.peer.cacio.managed.ManagedWindowContainer
    public void repaint(int r8, int r9, int r10, int r11) {
            r7 = this;
            r0 = r7
            sun.awt.peer.cacio.CacioComponent r0 = r0.getCacioComponent()
            r12 = r0
            r0 = r12
            java.awt.Component r0 = r0.getAWTComponent()
            r13 = r0
            java.awt.Rectangle r0 = new java.awt.Rectangle
            r1 = r0
            r2 = r8
            r3 = r9
            r4 = r10
            r5 = r11
            r1.<init>(r2, r3, r4, r5)
            r14 = r0
            java.awt.event.PaintEvent r0 = new java.awt.event.PaintEvent
            r1 = r0
            r2 = r13
            r3 = 801(0x321, float:1.122E-42)
            r4 = r14
            r1.<init>(r2, r3, r4)
            r15 = r0
            r0 = r12
            r1 = r15
            r0.handlePeerEvent(r1)
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            super.repaint(r1, r2, r3, r4)
            return
    }

    @Override // sun.awt.peer.cacio.PlatformWindow
    public void requestFocus() {
            r3 = this;
            sun.awt.peer.cacio.managed.FocusManager r0 = sun.awt.peer.cacio.managed.FocusManager.getInstance()
            r1 = r3
            r0.setFocusedWindowNoEvent(r1)
            return
    }
}
