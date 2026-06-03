package com.github.caciocavallosilano.cacio.peer.managed;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/caciocavallo.zip:caciocavallo17/cacio-shared-1.19.1-SNAPSHOT.jar:com/github/caciocavallosilano/cacio/peer/managed/AbstractManagedWindowContainer.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/caciocavallo17/cacio-shared-1.19.1-SNAPSHOT.jar:com/github/caciocavallosilano/cacio/peer/managed/AbstractManagedWindowContainer.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/caciocavallo.zip:caciocavallo17/cacio-shared-1.19.1-SNAPSHOT.jar:com/github/caciocavallosilano/cacio/peer/managed/AbstractManagedWindowContainer.class */
abstract class AbstractManagedWindowContainer implements com.github.caciocavallosilano.cacio.peer.managed.ManagedWindowContainer {
    private java.util.LinkedList<com.github.caciocavallosilano.cacio.peer.managed.ManagedWindow> children;

    protected AbstractManagedWindowContainer() {
            r4 = this;
            r0 = r4
            r0.<init>()
            r0 = r4
            java.util.LinkedList r1 = new java.util.LinkedList
            r2 = r1
            r2.<init>()
            r0.children = r1
            return
    }

    @Override // com.github.caciocavallosilano.cacio.peer.managed.ManagedWindowContainer
    public final void add(com.github.caciocavallosilano.cacio.peer.managed.ManagedWindow r4) {
            r3 = this;
            r0 = r3
            java.util.LinkedList<com.github.caciocavallosilano.cacio.peer.managed.ManagedWindow> r0 = r0.children
            r1 = r4
            boolean r0 = r0.add(r1)
            r0 = r3
            java.util.LinkedList<com.github.caciocavallosilano.cacio.peer.managed.ManagedWindow> r0 = r0.children
            java.util.Iterator r0 = r0.descendingIterator()
            r5 = r0
        L11:
            r0 = r5
            boolean r0 = r0.hasNext()
            if (r0 == 0) goto L3e
            r0 = r5
            java.lang.Object r0 = r0.next()
            com.github.caciocavallosilano.cacio.peer.managed.ManagedWindow r0 = (com.github.caciocavallosilano.cacio.peer.managed.ManagedWindow) r0
            r6 = r0
            r0 = r6
            boolean r0 = r0.isVisible()
            if (r0 == 0) goto L3b
            r0 = r6
            com.github.caciocavallosilano.cacio.peer.CacioComponent r0 = r0.getCacioComponent()
            r7 = r0
            r0 = r7
            java.awt.Component r0 = r0.getAWTComponent()
            r0.repaint()
        L3b:
            goto L11
        L3e:
            return
    }

    @Override // com.github.caciocavallosilano.cacio.peer.managed.ManagedWindowContainer
    public final void remove(com.github.caciocavallosilano.cacio.peer.managed.ManagedWindow r4) {
            r3 = this;
            r0 = r3
            java.util.LinkedList<com.github.caciocavallosilano.cacio.peer.managed.ManagedWindow> r0 = r0.children
            r1 = r4
            boolean r0 = r0.remove(r1)
            r0 = r3
            java.util.LinkedList<com.github.caciocavallosilano.cacio.peer.managed.ManagedWindow> r0 = r0.children
            java.util.Iterator r0 = r0.descendingIterator()
            r5 = r0
        L11:
            r0 = r5
            boolean r0 = r0.hasNext()
            if (r0 == 0) goto L3e
            r0 = r5
            java.lang.Object r0 = r0.next()
            com.github.caciocavallosilano.cacio.peer.managed.ManagedWindow r0 = (com.github.caciocavallosilano.cacio.peer.managed.ManagedWindow) r0
            r6 = r0
            r0 = r6
            boolean r0 = r0.isVisible()
            if (r0 == 0) goto L3b
            r0 = r6
            com.github.caciocavallosilano.cacio.peer.CacioComponent r0 = r0.getCacioComponent()
            r7 = r0
            r0 = r7
            java.awt.Component r0 = r0.getAWTComponent()
            r0.repaint()
        L3b:
            goto L11
        L3e:
            return
    }

    @Override // com.github.caciocavallosilano.cacio.peer.managed.ManagedWindowContainer
    public final java.util.LinkedList<com.github.caciocavallosilano.cacio.peer.managed.ManagedWindow> getChildren() {
            r2 = this;
            r0 = r2
            java.util.LinkedList<com.github.caciocavallosilano.cacio.peer.managed.ManagedWindow> r0 = r0.children
            return r0
    }

    @Override // com.github.caciocavallosilano.cacio.peer.managed.ManagedWindowContainer
    public java.awt.Point getLocationOnScreen() {
            r5 = this;
            java.awt.Point r0 = new java.awt.Point
            r1 = r0
            r2 = 0
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    @Override // com.github.caciocavallosilano.cacio.peer.managed.ManagedWindowContainer
    public final void dispatchEvent(com.github.caciocavallosilano.cacio.peer.managed.EventData r4) {
            r3 = this;
            r0 = r3
            r1 = r4
            boolean r0 = r0.dispatchEventImpl(r1)
            return
    }

    boolean dispatchEventImpl(com.github.caciocavallosilano.cacio.peer.managed.EventData r5) {
            r4 = this;
            r0 = r5
            int r0 = r0.getId()
            r6 = r0
            r0 = r6
            r1 = 500(0x1f4, float:7.0E-43)
            if (r0 < r1) goto L68
            r0 = r6
            r1 = 507(0x1fb, float:7.1E-43)
            if (r0 > r1) goto L68
            r0 = r4
            r1 = r5
            int r1 = r1.getX()
            r2 = r5
            int r2 = r2.getY()
            com.github.caciocavallosilano.cacio.peer.managed.ManagedWindow r0 = r0.findWindowAt(r1, r2)
            r7 = r0
            r0 = r7
            if (r0 == 0) goto L66
            r0 = r5
            r1 = r7
            r0.setSource(r1)
            r0 = r7
            java.awt.Rectangle r0 = r0.getBounds()
            r8 = r0
            r0 = r5
            r1 = r5
            int r1 = r1.getX()
            r2 = r8
            int r2 = r2.x
            int r1 = r1 - r2
            r0.setX(r1)
            r0 = r5
            r1 = r5
            int r1 = r1.getY()
            r2 = r8
            int r2 = r2.y
            int r1 = r1 - r2
            r0.setY(r1)
            r0 = r6
            r1 = 500(0x1f4, float:7.0E-43)
            if (r0 == r1) goto L59
            r0 = r6
            r1 = 501(0x1f5, float:7.02E-43)
            if (r0 != r1) goto L60
        L59:
            com.github.caciocavallosilano.cacio.peer.managed.FocusManager r0 = com.github.caciocavallosilano.cacio.peer.managed.FocusManager.getInstance()
            r1 = r7
            r0.setFocusedWindowNoEvent(r1)
        L60:
            r0 = r7
            r1 = r5
            boolean r0 = r0.dispatchEventImpl(r1)
            return r0
        L66:
            r0 = 0
            return r0
        L68:
            r0 = r6
            r1 = 400(0x190, float:5.6E-43)
            if (r0 < r1) goto L8d
            r0 = r6
            r1 = 402(0x192, float:5.63E-43)
            if (r0 > r1) goto L8d
            com.github.caciocavallosilano.cacio.peer.managed.FocusManager r0 = com.github.caciocavallosilano.cacio.peer.managed.FocusManager.getInstance()
            r7 = r0
            r0 = r7
            com.github.caciocavallosilano.cacio.peer.managed.ManagedWindow r0 = r0.getFocusedWindow()
            r8 = r0
            r0 = r8
            if (r0 == 0) goto L8b
            r0 = r8
            r1 = r5
            r0.dispatchKeyEvent(r1)
        L8b:
            r0 = 1
            return r0
        L8d:
            r0 = 0
            return r0
    }

    com.github.caciocavallosilano.cacio.peer.managed.ManagedWindow findWindowAt(int r5, int r6) {
            r4 = this;
            r0 = r4
            java.util.LinkedList<com.github.caciocavallosilano.cacio.peer.managed.ManagedWindow> r0 = r0.children
            java.util.Iterator r0 = r0.descendingIterator()
            r7 = r0
        L8:
            r0 = r7
            boolean r0 = r0.hasNext()
            if (r0 == 0) goto L61
            r0 = r7
            java.lang.Object r0 = r0.next()
            com.github.caciocavallosilano.cacio.peer.managed.ManagedWindow r0 = (com.github.caciocavallosilano.cacio.peer.managed.ManagedWindow) r0
            r8 = r0
            r0 = r8
            boolean r0 = r0.isVisible()
            if (r0 == 0) goto L5e
            r0 = r8
            java.awt.Rectangle r0 = r0.getBounds()
            r9 = r0
            r0 = r5
            r1 = r9
            int r1 = r1.x
            if (r0 < r1) goto L5e
            r0 = r6
            r1 = r9
            int r1 = r1.y
            if (r0 < r1) goto L5e
            r0 = r5
            r1 = r9
            int r1 = r1.x
            r2 = r9
            int r2 = r2.width
            int r1 = r1 + r2
            if (r0 >= r1) goto L5e
            r0 = r6
            r1 = r9
            int r1 = r1.y
            r2 = r9
            int r2 = r2.height
            int r1 = r1 + r2
            if (r0 >= r1) goto L5e
            r0 = r8
            return r0
        L5e:
            goto L8
        L61:
            r0 = 0
            return r0
    }

    @Override // com.github.caciocavallosilano.cacio.peer.managed.ManagedWindowContainer
    public void repaint(int r8, int r9, int r10, int r11) {
            r7 = this;
            r0 = r7
            boolean r0 = r0 instanceof com.github.caciocavallosilano.cacio.peer.managed.ManagedWindow
            if (r0 != 0) goto L10
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            r0.repaintSelf(r1, r2, r3, r4)
        L10:
            r0 = r7
            java.util.LinkedList<com.github.caciocavallosilano.cacio.peer.managed.ManagedWindow> r0 = r0.children
            java.util.Iterator r0 = r0.descendingIterator()
            r12 = r0
            java.awt.Rectangle r0 = new java.awt.Rectangle
            r1 = r0
            r2 = r8
            r3 = r9
            r4 = r10
            r5 = r11
            r1.<init>(r2, r3, r4, r5)
            r13 = r0
            java.awt.Rectangle r0 = new java.awt.Rectangle
            r1 = r0
            r1.<init>()
            r14 = r0
        L30:
            r0 = r12
            boolean r0 = r0.hasNext()
            if (r0 == 0) goto Lab
            r0 = r12
            java.lang.Object r0 = r0.next()
            com.github.caciocavallosilano.cacio.peer.managed.ManagedWindow r0 = (com.github.caciocavallosilano.cacio.peer.managed.ManagedWindow) r0
            r15 = r0
            r0 = r15
            boolean r0 = r0.isVisible()
            if (r0 == 0) goto La8
            r0 = r15
            java.awt.Rectangle r0 = r0.getBounds()
            r16 = r0
            r0 = r16
            r1 = r13
            r2 = r14
            java.awt.geom.Rectangle2D.intersect(r0, r1, r2)
            r0 = r14
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto La8
            java.awt.Rectangle r0 = new java.awt.Rectangle
            r1 = r0
            r2 = r14
            r1.<init>(r2)
            r17 = r0
            r0 = r17
            r1 = r0
            int r1 = r1.x
            r2 = r16
            int r2 = r2.x
            int r1 = r1 - r2
            r0.x = r1
            r0 = r17
            r1 = r0
            int r1 = r1.y
            r2 = r16
            int r2 = r2.y
            int r1 = r1 - r2
            r0.y = r1
            r0 = r15
            r1 = r17
            int r1 = r1.x
            r2 = r17
            int r2 = r2.y
            r3 = r17
            int r3 = r3.width
            r4 = r17
            int r4 = r4.height
            r0.repaint(r1, r2, r3, r4)
        La8:
            goto L30
        Lab:
            return
    }

    private void repaintSelf(int r10, int r11, int r12, int r13) {
            r9 = this;
            java.awt.Rectangle r0 = new java.awt.Rectangle
            r1 = r0
            r2 = r10
            r3 = r11
            r4 = r12
            r5 = r13
            r1.<init>(r2, r3, r4, r5)
            r14 = r0
            java.util.LinkedList r0 = new java.util.LinkedList
            r1 = r0
            r1.<init>()
            r15 = r0
            r0 = r9
            java.util.LinkedList<com.github.caciocavallosilano.cacio.peer.managed.ManagedWindow> r0 = r0.children
            java.util.Iterator r0 = r0.iterator()
            r16 = r0
        L20:
            r0 = r16
            boolean r0 = r0.hasNext()
            if (r0 == 0) goto L5a
            r0 = r16
            java.lang.Object r0 = r0.next()
            com.github.caciocavallosilano.cacio.peer.managed.ManagedWindow r0 = (com.github.caciocavallosilano.cacio.peer.managed.ManagedWindow) r0
            r17 = r0
            r0 = r17
            boolean r0 = r0.isVisible()
            if (r0 == 0) goto L57
            r0 = r17
            java.awt.Rectangle r0 = r0.getBounds()
            r18 = r0
            r0 = r18
            r1 = r14
            boolean r0 = r0.intersects(r1)
            if (r0 == 0) goto L57
            r0 = r15
            r1 = r18
            boolean r0 = r0.add(r1)
        L57:
            goto L20
        L5a:
            r0 = r9
            java.awt.Color r1 = java.awt.Color.WHITE
            java.awt.Color r2 = java.awt.Color.WHITE
            java.awt.Font r3 = new java.awt.Font
            r4 = r3
            java.lang.String r5 = "Dialog"
            r6 = 1
            r7 = 12
            r4.<init>(r5, r6, r7)
            r4 = r15
            java.awt.Graphics2D r0 = r0.getClippedGraphics(r1, r2, r3, r4)
            r16 = r0
            r0 = r16
            r1 = r10
            r2 = r11
            r3 = r12
            r4 = r13
            r0.clearRect(r1, r2, r3, r4)
            return
    }

    @Override // com.github.caciocavallosilano.cacio.peer.managed.ManagedWindowContainer
    public /* bridge */ /* synthetic */ java.util.Deque getChildren() {
            r2 = this;
            r0 = r2
            java.util.LinkedList r0 = r0.getChildren()
            return r0
    }
}
