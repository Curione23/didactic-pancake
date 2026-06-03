package sun.awt.peer.cacio;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/caciocavallo.zip:caciocavallo/cacio-shared-1.10-SNAPSHOT.jar:sun/awt/peer/cacio/CacioScrollPanePeer.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/caciocavallo/cacio-shared-1.10-SNAPSHOT.jar:sun/awt/peer/cacio/CacioScrollPanePeer.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/caciocavallo.zip:caciocavallo/cacio-shared-1.10-SNAPSHOT.jar:sun/awt/peer/cacio/CacioScrollPanePeer.class */
class CacioScrollPanePeer extends sun.awt.peer.cacio.CacioContainerPeer<java.awt.ScrollPane, javax.swing.JPanel> implements java.awt.peer.ScrollPanePeer {
    private javax.swing.JScrollBar verticalSB;
    private javax.swing.JScrollBar horizontalSB;
    private int childWidth;
    private int childHeight;
    private int viewX;
    private int viewY;
    private int viewWidth;
    private int viewHeight;

    CacioScrollPanePeer(java.awt.ScrollPane r5, sun.awt.peer.cacio.PlatformWindowFactory r6) {
            r4 = this;
            r0 = r4
            r1 = r5
            r2 = r6
            r0.<init>(r1, r2)
            return
    }

    javax.swing.JPanel initSwingComponent() {
            r5 = this;
            javax.swing.JPanel r0 = new javax.swing.JPanel
            r1 = r0
            r1.<init>()
            r6 = r0
            r0 = r5
            javax.swing.JScrollBar r1 = new javax.swing.JScrollBar
            r2 = r1
            r3 = 1
            r2.<init>(r3)
            r0.verticalSB = r1
            r0 = r5
            javax.swing.JScrollBar r1 = new javax.swing.JScrollBar
            r2 = r1
            r3 = 0
            r2.<init>(r3)
            r0.horizontalSB = r1
            r0 = r6
            r1 = r5
            javax.swing.JScrollBar r1 = r1.verticalSB
            java.awt.Component r0 = r0.add(r1)
            r0 = r6
            r1 = r5
            javax.swing.JScrollBar r1 = r1.horizontalSB
            java.awt.Component r0 = r0.add(r1)
            r0 = r6
            r1 = 0
            r0.setLayout(r1)
            r0 = r6
            return r0
    }

    public int getHScrollbarHeight() {
            r2 = this;
            r0 = r2
            javax.swing.JScrollBar r0 = r0.horizontalSB
            int r0 = r0.getHeight()
            return r0
    }

    public int getVScrollbarWidth() {
            r2 = this;
            r0 = r2
            javax.swing.JScrollBar r0 = r0.verticalSB
            int r0 = r0.getWidth()
            return r0
    }

    public void setScrollPosition(int r4, int r5) {
            r3 = this;
            r0 = r3
            javax.swing.JScrollBar r0 = r0.verticalSB
            r1 = r5
            r0.setValue(r1)
            r0 = r3
            javax.swing.JScrollBar r0 = r0.horizontalSB
            r1 = r4
            r0.setValue(r1)
            return
    }

    public void childResized(int r4, int r5) {
            r3 = this;
            r0 = r3
            r1 = r4
            r0.childWidth = r1
            r0 = r3
            r1 = r5
            r0.childHeight = r1
            r0 = r3
            javax.swing.JScrollBar r0 = r0.verticalSB
            r1 = 0
            r0.setMinimum(r1)
            r0 = r3
            javax.swing.JScrollBar r0 = r0.verticalSB
            r1 = r4
            r0.setMaximum(r1)
            r0 = r3
            javax.swing.JScrollBar r0 = r0.horizontalSB
            r1 = 0
            r0.setMinimum(r1)
            r0 = r3
            javax.swing.JScrollBar r0 = r0.horizontalSB
            r1 = r5
            r0.setMaximum(r1)
            return
    }

    public void setUnitIncrement(java.awt.Adjustable r5, int r6) {
            r4 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r1 = r0
            java.lang.String r2 = "Not supported yet."
            r1.<init>(r2)
            throw r0
    }

    public void setValue(java.awt.Adjustable r5, int r6) {
            r4 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r1 = r0
            java.lang.String r2 = "Not supported yet."
            r1.<init>(r2)
            throw r0
    }

    @Override // sun.awt.peer.cacio.CacioComponentPeer
    public void layout() {
            r6 = this;
            r0 = r6
            r1 = r6
            int r1 = r1.layoutVerticalScrollbar()
            r0.viewWidth = r1
            r0 = r6
            r1 = r6
            int r1 = r1.layoutHorizontalScrollbar()
            r0.viewHeight = r1
            r0 = r6
            java.awt.Component r0 = r0.getAWTComponent()
            java.awt.ScrollPane r0 = (java.awt.ScrollPane) r0
            r7 = r0
            r0 = r7
            int r0 = r0.getComponentCount()
            if (r0 <= 0) goto L4c
            r0 = r7
            r1 = 0
            java.awt.Component r0 = r0.getComponent(r1)
            r8 = r0
            r0 = r8
            java.awt.peer.ComponentPeer r0 = sun.awt.peer.cacio.GetPeer.getComponent(r0)
            r9 = r0
            r0 = r9
            boolean r0 = r0 instanceof sun.awt.peer.cacio.CacioComponentPeer
            if (r0 == 0) goto L4c
            r0 = r9
            sun.awt.peer.cacio.CacioComponentPeer r0 = (sun.awt.peer.cacio.CacioComponentPeer) r0
            r10 = r0
            r0 = r10
            r1 = r6
            int r1 = r1.viewX
            r2 = r6
            int r2 = r2.viewY
            r3 = r6
            int r3 = r3.viewWidth
            r4 = r6
            int r4 = r4.viewHeight
            r0.setViewport(r1, r2, r3, r4)
        L4c:
            r0 = r6
            javax.swing.JComponent r0 = r0.getSwingComponent()
            javax.swing.JPanel r0 = (javax.swing.JPanel) r0
            r0.validate()
            return
    }

    @Override // sun.awt.peer.cacio.CacioComponentPeer
    public java.awt.Dimension getPreferredSize() {
            r2 = this;
            r0 = 0
            r3 = r0
            r0 = r2
            javax.swing.JComponent r0 = r0.getSwingComponent()
            javax.swing.JPanel r0 = (javax.swing.JPanel) r0
            r4 = r0
            r0 = r4
            if (r0 == 0) goto L1c
            r0 = r2
            javax.swing.JComponent r0 = r0.getSwingComponent()
            javax.swing.JPanel r0 = (javax.swing.JPanel) r0
            java.awt.Dimension r0 = r0.getSize()
            r3 = r0
            goto L21
        L1c:
            r0 = r2
            java.awt.Dimension r0 = super.getPreferredSize()
            r3 = r0
        L21:
            r0 = r3
            return r0
    }

    private int layoutVerticalScrollbar() {
            r6 = this;
            r0 = r6
            boolean r0 = r0.needVerticalScrollbar()
            if (r0 == 0) goto L48
            r0 = r6
            javax.swing.JScrollBar r0 = r0.verticalSB
            r1 = 1
            r0.setVisible(r1)
            r0 = r6
            javax.swing.JScrollBar r0 = r0.verticalSB
            java.awt.Dimension r0 = r0.getPreferredSize()
            r8 = r0
            r0 = r6
            java.awt.Component r0 = r0.getAWTComponent()
            java.awt.ScrollPane r0 = (java.awt.ScrollPane) r0
            java.awt.Dimension r0 = r0.getSize()
            r9 = r0
            r0 = r6
            javax.swing.JScrollBar r0 = r0.verticalSB
            r1 = r9
            int r1 = r1.width
            r2 = r8
            int r2 = r2.width
            int r1 = r1 - r2
            r2 = 0
            r3 = r8
            int r3 = r3.width
            r4 = r9
            int r4 = r4.height
            r0.setBounds(r1, r2, r3, r4)
            r0 = r9
            int r0 = r0.width
            r1 = r8
            int r1 = r1.width
            int r0 = r0 - r1
            r7 = r0
            goto L5b
        L48:
            r0 = r6
            javax.swing.JScrollBar r0 = r0.verticalSB
            r1 = 0
            r0.setVisible(r1)
            r0 = r6
            java.awt.Component r0 = r0.getAWTComponent()
            java.awt.ScrollPane r0 = (java.awt.ScrollPane) r0
            int r0 = r0.getWidth()
            r7 = r0
        L5b:
            r0 = r7
            return r0
    }

    private boolean needVerticalScrollbar() {
            r3 = this;
            r0 = r3
            java.awt.Component r0 = r0.getAWTComponent()
            java.awt.ScrollPane r0 = (java.awt.ScrollPane) r0
            int r0 = r0.getScrollbarDisplayPolicy()
            r4 = r0
            r0 = r4
            r1 = 1
            if (r0 == r1) goto L26
            r0 = r4
            r1 = 2
            if (r0 == r1) goto L2a
            r0 = r3
            int r0 = r0.childHeight
            r1 = r3
            java.awt.Component r1 = r1.getAWTComponent()
            java.awt.ScrollPane r1 = (java.awt.ScrollPane) r1
            int r1 = r1.getHeight()
            if (r0 <= r1) goto L2a
        L26:
            r0 = 1
            goto L2b
        L2a:
            r0 = 0
        L2b:
            return r0
    }

    private int layoutHorizontalScrollbar() {
            r6 = this;
            r0 = r6
            boolean r0 = r0.needHorizontalScrollbar()
            if (r0 == 0) goto L87
            r0 = r6
            javax.swing.JScrollBar r0 = r0.horizontalSB
            r1 = 1
            r0.setVisible(r1)
            r0 = r6
            javax.swing.JScrollBar r0 = r0.horizontalSB
            java.awt.Dimension r0 = r0.getPreferredSize()
            r8 = r0
            r0 = r6
            java.awt.Component r0 = r0.getAWTComponent()
            java.awt.ScrollPane r0 = (java.awt.ScrollPane) r0
            java.awt.Dimension r0 = r0.getSize()
            r9 = r0
            r0 = r6
            javax.swing.JScrollBar r0 = r0.verticalSB
            boolean r0 = r0.isVisible()
            if (r0 == 0) goto L61
            r0 = r9
            r1 = r0
            int r1 = r1.width
            r2 = r6
            javax.swing.JScrollBar r2 = r2.verticalSB
            int r2 = r2.getWidth()
            int r1 = r1 - r2
            r0.width = r1
            r0 = r6
            javax.swing.JScrollBar r0 = r0.verticalSB
            int r0 = r0.getHeight()
            r1 = r8
            int r1 = r1.height
            int r0 = r0 - r1
            r10 = r0
            r0 = r6
            javax.swing.JScrollBar r0 = r0.verticalSB
            java.awt.Dimension r1 = new java.awt.Dimension
            r2 = r1
            r3 = r6
            javax.swing.JScrollBar r3 = r3.verticalSB
            int r3 = r3.getWidth()
            r4 = r10
            r2.<init>(r3, r4)
            r0.setSize(r1)
        L61:
            r0 = r6
            javax.swing.JScrollBar r0 = r0.horizontalSB
            r1 = 0
            r2 = r9
            int r2 = r2.height
            r3 = r8
            int r3 = r3.height
            int r2 = r2 - r3
            r3 = r9
            int r3 = r3.width
            r4 = r8
            int r4 = r4.height
            r0.setBounds(r1, r2, r3, r4)
            r0 = r9
            int r0 = r0.height
            r1 = r8
            int r1 = r1.height
            int r0 = r0 - r1
            r7 = r0
            goto L9a
        L87:
            r0 = r6
            javax.swing.JScrollBar r0 = r0.verticalSB
            r1 = 0
            r0.setVisible(r1)
            r0 = r6
            java.awt.Component r0 = r0.getAWTComponent()
            java.awt.ScrollPane r0 = (java.awt.ScrollPane) r0
            int r0 = r0.getHeight()
            r7 = r0
        L9a:
            r0 = r7
            return r0
    }

    private boolean needHorizontalScrollbar() {
            r3 = this;
            r0 = r3
            java.awt.Component r0 = r0.getAWTComponent()
            java.awt.ScrollPane r0 = (java.awt.ScrollPane) r0
            int r0 = r0.getScrollbarDisplayPolicy()
            r4 = r0
            r0 = r4
            r1 = 1
            if (r0 == r1) goto L26
            r0 = r4
            r1 = 2
            if (r0 == r1) goto L2a
            r0 = r3
            int r0 = r0.childWidth
            r1 = r3
            java.awt.Component r1 = r1.getAWTComponent()
            java.awt.ScrollPane r1 = (java.awt.ScrollPane) r1
            int r1 = r1.getWidth()
            if (r0 <= r1) goto L2a
        L26:
            r0 = 1
            goto L2b
        L2a:
            r0 = 0
        L2b:
            return r0
    }

    @Override // sun.awt.peer.cacio.CacioComponentPeer
    /* JADX INFO: renamed from: initSwingComponent */
    /* bridge */ /* synthetic */ javax.swing.JComponent mo7633initSwingComponent() {
            r2 = this;
            r0 = r2
            javax.swing.JPanel r0 = r0.initSwingComponent()
            return r0
    }
}
