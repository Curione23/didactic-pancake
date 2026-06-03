package sun.awt.peer.cacio;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/caciocavallo.zip:caciocavallo/cacio-shared-1.10-SNAPSHOT.jar:sun/awt/peer/cacio/WindowClippedGraphics.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/caciocavallo/cacio-shared-1.10-SNAPSHOT.jar:sun/awt/peer/cacio/WindowClippedGraphics.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/caciocavallo.zip:caciocavallo/cacio-shared-1.10-SNAPSHOT.jar:sun/awt/peer/cacio/WindowClippedGraphics.class */
public class WindowClippedGraphics extends java.awt.Graphics2D implements sun.awt.ConstrainableGraphics {
    private java.awt.Graphics2D wrapped;
    private java.awt.Shape baseClip;
    private java.awt.Shape userClip;
    static final /* synthetic */ boolean $assertionsDisabled = false;

    public WindowClippedGraphics(java.awt.Graphics2D r4, java.awt.Shape r5) {
            r3 = this;
            r0 = r3
            r0.<init>()
            r0 = r3
            r1 = r4
            r0.wrapped = r1
            r0 = r3
            r1 = r5
            r0.baseClip = r1
            r0 = r3
            r1 = 0
            r0.userClip = r1
            r0 = r3
            java.awt.Graphics2D r0 = r0.wrapped
            r1 = r3
            java.awt.Shape r1 = r1.baseClip
            r0.setClip(r1)
            return
    }

    public void clipRect(int r11, int r12, int r13, int r14) {
            r10 = this;
            r0 = r10
            java.awt.Shape r0 = r0.userClip
            if (r0 != 0) goto L1a
            r0 = r10
            java.awt.Rectangle r1 = new java.awt.Rectangle
            r2 = r1
            r3 = r11
            r4 = r12
            r5 = r13
            r6 = r14
            r2.<init>(r3, r4, r5, r6)
            r0.userClip = r1
            goto L84
        L1a:
            r0 = r10
            java.awt.Shape r0 = r0.userClip
            boolean r0 = r0 instanceof java.awt.Rectangle
            if (r0 == 0) goto L43
            r0 = r10
            java.awt.Shape r0 = r0.userClip
            java.awt.Rectangle r0 = (java.awt.Rectangle) r0
            r15 = r0
            r0 = r15
            java.awt.Rectangle r1 = new java.awt.Rectangle
            r2 = r1
            r3 = r11
            r4 = r12
            r5 = r13
            r6 = r14
            r2.<init>(r3, r4, r5, r6)
            r2 = r15
            java.awt.geom.Rectangle2D.intersect(r0, r1, r2)
            goto L84
        L43:
            r0 = r10
            java.awt.Shape r0 = r0.userClip
            boolean r0 = r0 instanceof java.awt.geom.Area
            if (r0 == 0) goto L59
            r0 = r10
            java.awt.Shape r0 = r0.userClip
            java.awt.geom.Area r0 = (java.awt.geom.Area) r0
            r15 = r0
            goto L66
        L59:
            java.awt.geom.Area r0 = new java.awt.geom.Area
            r1 = r0
            r2 = r10
            java.awt.Shape r2 = r2.userClip
            r1.<init>(r2)
            r15 = r0
        L66:
            r0 = r15
            java.awt.geom.Area r1 = new java.awt.geom.Area
            r2 = r1
            java.awt.Rectangle r3 = new java.awt.Rectangle
            r4 = r3
            r5 = r11
            r6 = r12
            r7 = r13
            r8 = r14
            r4.<init>(r5, r6, r7, r8)
            r2.<init>(r3)
            r0.intersect(r1)
            r0 = r10
            r1 = r15
            r0.userClip = r1
        L84:
            r0 = r10
            java.awt.Graphics2D r0 = r0.wrapped
            r1 = r11
            r2 = r12
            r3 = r13
            r4 = r14
            r0.clipRect(r1, r2, r3, r4)
            return
    }

    public void clip(java.awt.Shape r6) {
            r5 = this;
            r0 = r5
            java.awt.Shape r0 = r0.userClip
            if (r0 != 0) goto Lf
            r0 = r5
            r1 = r6
            r0.userClip = r1
            goto L68
        Lf:
            r0 = r5
            java.awt.Shape r0 = r0.userClip
            boolean r0 = r0 instanceof java.awt.Rectangle
            if (r0 == 0) goto L36
            r0 = r6
            boolean r0 = r0 instanceof java.awt.Rectangle
            if (r0 == 0) goto L36
            r0 = r5
            java.awt.Shape r0 = r0.userClip
            java.awt.Rectangle r0 = (java.awt.Rectangle) r0
            r7 = r0
            r0 = r6
            java.awt.Rectangle r0 = (java.awt.Rectangle) r0
            r8 = r0
            r0 = r7
            r1 = r8
            r2 = r7
            java.awt.geom.Rectangle2D.intersect(r0, r1, r2)
            goto L68
        L36:
            r0 = r5
            java.awt.Shape r0 = r0.userClip
            boolean r0 = r0 instanceof java.awt.geom.Area
            if (r0 == 0) goto L4b
            r0 = r5
            java.awt.Shape r0 = r0.userClip
            java.awt.geom.Area r0 = (java.awt.geom.Area) r0
            r7 = r0
            goto L57
        L4b:
            java.awt.geom.Area r0 = new java.awt.geom.Area
            r1 = r0
            r2 = r5
            java.awt.Shape r2 = r2.userClip
            r1.<init>(r2)
            r7 = r0
        L57:
            r0 = r7
            java.awt.geom.Area r1 = new java.awt.geom.Area
            r2 = r1
            r3 = r6
            r2.<init>(r3)
            r0.intersect(r1)
            r0 = r5
            r1 = r7
            r0.userClip = r1
        L68:
            r0 = r5
            java.awt.Graphics2D r0 = r0.wrapped
            r1 = r6
            r0.clip(r1)
            return
    }

    public java.awt.Shape getClip() {
            r2 = this;
            r0 = r2
            java.awt.Shape r0 = r0.userClip
            return r0
    }

    public java.awt.Rectangle getClipBounds() {
            r2 = this;
            r0 = r2
            java.awt.Shape r0 = r0.userClip
            if (r0 != 0) goto Lc
            r0 = 0
            r3 = r0
            goto L16
        Lc:
            r0 = r2
            java.awt.Shape r0 = r0.userClip
            java.awt.Rectangle r0 = r0.getBounds()
            r3 = r0
        L16:
            r0 = r3
            return r0
    }

    public java.awt.Rectangle getClipBounds(java.awt.Rectangle r4) {
            r3 = this;
            r0 = r4
            if (r0 != 0) goto Le
            r0 = r3
            java.awt.Shape r0 = r0.userClip
            java.awt.Rectangle r0 = r0.getBounds()
            return r0
        Le:
            r0 = r4
            r1 = r3
            java.awt.Shape r1 = r1.userClip
            java.awt.Rectangle r1 = r1.getBounds()
            r0.setBounds(r1)
            r0 = r4
            return r0
    }

    public java.awt.Rectangle getClipRect() {
            r2 = this;
            r0 = r2
            java.awt.Shape r0 = r0.userClip
            java.awt.Rectangle r0 = r0.getBounds()
            return r0
    }

    public void setClip(int r9, int r10, int r11, int r12) {
            r8 = this;
            r0 = r8
            java.awt.Rectangle r1 = new java.awt.Rectangle
            r2 = r1
            r3 = r9
            r4 = r10
            r5 = r11
            r6 = r12
            r2.<init>(r3, r4, r5, r6)
            r0.setClip(r1)
            return
    }

    public void setClip(java.awt.Shape r5) {
            r4 = this;
            r0 = r4
            r1 = r5
            r0.userClip = r1
            r0 = r5
            if (r0 != 0) goto L11
            r0 = r4
            java.awt.Shape r0 = r0.baseClip
            r6 = r0
            goto L45
        L11:
            r0 = r4
            java.awt.Shape r0 = r0.baseClip
            boolean r0 = r0 instanceof java.awt.geom.Area
            if (r0 == 0) goto L26
            r0 = r4
            java.awt.Shape r0 = r0.baseClip
            java.awt.geom.Area r0 = (java.awt.geom.Area) r0
            r7 = r0
            goto L32
        L26:
            java.awt.geom.Area r0 = new java.awt.geom.Area
            r1 = r0
            r2 = r4
            java.awt.Shape r2 = r2.baseClip
            r1.<init>(r2)
            r7 = r0
        L32:
            java.awt.geom.Area r0 = new java.awt.geom.Area
            r1 = r0
            r2 = r5
            r1.<init>(r2)
            r8 = r0
            r0 = r8
            r1 = r7
            r0.intersect(r1)
            r0 = r8
            r6 = r0
        L45:
            r0 = r4
            java.awt.Graphics2D r0 = r0.wrapped
            r1 = r6
            r0.setClip(r1)
            return
    }

    private java.awt.Shape transformShape(java.awt.Shape r5, java.awt.geom.AffineTransform r6) {
            r4 = this;
            r0 = r5
            if (r0 != 0) goto L9
            r0 = 0
            r7 = r0
            goto L2a
        L9:
            r0 = r5
            boolean r0 = r0 instanceof java.awt.geom.Area
            if (r0 == 0) goto L19
            r0 = r5
            java.awt.geom.Area r0 = (java.awt.geom.Area) r0
            r8 = r0
            goto L23
        L19:
            java.awt.geom.Area r0 = new java.awt.geom.Area
            r1 = r0
            r2 = r5
            r1.<init>(r2)
            r8 = r0
        L23:
            r0 = r8
            r1 = r6
            java.awt.geom.Area r0 = r0.createTransformedArea(r1)
            r7 = r0
        L2a:
            r0 = r7
            return r0
    }

    public void rotate(double r6) {
            r5 = this;
            r0 = r6
            java.awt.geom.AffineTransform r0 = java.awt.geom.AffineTransform.getRotateInstance(r0)
            r8 = r0
            r0 = r8
            java.awt.geom.AffineTransform r0 = r0.createInverse()     // Catch: java.awt.geom.NoninvertibleTransformException -> L2a
            r9 = r0
            r0 = r5
            r1 = r5
            r2 = r5
            java.awt.Shape r2 = r2.baseClip     // Catch: java.awt.geom.NoninvertibleTransformException -> L2a
            r3 = r9
            java.awt.Shape r1 = r1.transformShape(r2, r3)     // Catch: java.awt.geom.NoninvertibleTransformException -> L2a
            r0.baseClip = r1     // Catch: java.awt.geom.NoninvertibleTransformException -> L2a
            r0 = r5
            r1 = r5
            r2 = r5
            java.awt.Shape r2 = r2.userClip     // Catch: java.awt.geom.NoninvertibleTransformException -> L2a
            r3 = r9
            java.awt.Shape r1 = r1.transformShape(r2, r3)     // Catch: java.awt.geom.NoninvertibleTransformException -> L2a
            r0.userClip = r1     // Catch: java.awt.geom.NoninvertibleTransformException -> L2a
            goto L3a
        L2a:
            r9 = move-exception
            boolean r0 = sun.awt.peer.cacio.WindowClippedGraphics.$assertionsDisabled
            if (r0 != 0) goto L3a
            java.lang.AssertionError r0 = new java.lang.AssertionError
            r1 = r0
            r1.<init>()
            throw r0
        L3a:
            r0 = r5
            java.awt.Graphics2D r0 = r0.wrapped
            r1 = r6
            r0.rotate(r1)
            return
    }

    public void rotate(double r9, double r11, double r13) {
            r8 = this;
            r0 = r9
            r1 = r11
            r2 = r13
            java.awt.geom.AffineTransform r0 = java.awt.geom.AffineTransform.getRotateInstance(r0, r1, r2)
            r15 = r0
            r0 = r15
            java.awt.geom.AffineTransform r0 = r0.createInverse()     // Catch: java.awt.geom.NoninvertibleTransformException -> L2f
            r16 = r0
            r0 = r8
            r1 = r8
            r2 = r8
            java.awt.Shape r2 = r2.baseClip     // Catch: java.awt.geom.NoninvertibleTransformException -> L2f
            r3 = r16
            java.awt.Shape r1 = r1.transformShape(r2, r3)     // Catch: java.awt.geom.NoninvertibleTransformException -> L2f
            r0.baseClip = r1     // Catch: java.awt.geom.NoninvertibleTransformException -> L2f
            r0 = r8
            r1 = r8
            r2 = r8
            java.awt.Shape r2 = r2.userClip     // Catch: java.awt.geom.NoninvertibleTransformException -> L2f
            r3 = r16
            java.awt.Shape r1 = r1.transformShape(r2, r3)     // Catch: java.awt.geom.NoninvertibleTransformException -> L2f
            r0.userClip = r1     // Catch: java.awt.geom.NoninvertibleTransformException -> L2f
            goto L3f
        L2f:
            r16 = move-exception
            boolean r0 = sun.awt.peer.cacio.WindowClippedGraphics.$assertionsDisabled
            if (r0 != 0) goto L3f
            java.lang.AssertionError r0 = new java.lang.AssertionError
            r1 = r0
            r1.<init>()
            throw r0
        L3f:
            r0 = r8
            java.awt.Graphics2D r0 = r0.wrapped
            r1 = r9
            r2 = r11
            r3 = r13
            r0.rotate(r1, r2, r3)
            return
    }

    public void scale(double r7, double r9) {
            r6 = this;
            r0 = r7
            r1 = r9
            java.awt.geom.AffineTransform r0 = java.awt.geom.AffineTransform.getScaleInstance(r0, r1)
            r11 = r0
            r0 = r11
            java.awt.geom.AffineTransform r0 = r0.createInverse()     // Catch: java.awt.geom.NoninvertibleTransformException -> L2d
            r12 = r0
            r0 = r6
            r1 = r6
            r2 = r6
            java.awt.Shape r2 = r2.baseClip     // Catch: java.awt.geom.NoninvertibleTransformException -> L2d
            r3 = r12
            java.awt.Shape r1 = r1.transformShape(r2, r3)     // Catch: java.awt.geom.NoninvertibleTransformException -> L2d
            r0.baseClip = r1     // Catch: java.awt.geom.NoninvertibleTransformException -> L2d
            r0 = r6
            r1 = r6
            r2 = r6
            java.awt.Shape r2 = r2.userClip     // Catch: java.awt.geom.NoninvertibleTransformException -> L2d
            r3 = r12
            java.awt.Shape r1 = r1.transformShape(r2, r3)     // Catch: java.awt.geom.NoninvertibleTransformException -> L2d
            r0.userClip = r1     // Catch: java.awt.geom.NoninvertibleTransformException -> L2d
            goto L3d
        L2d:
            r12 = move-exception
            boolean r0 = sun.awt.peer.cacio.WindowClippedGraphics.$assertionsDisabled
            if (r0 != 0) goto L3d
            java.lang.AssertionError r0 = new java.lang.AssertionError
            r1 = r0
            r1.<init>()
            throw r0
        L3d:
            r0 = r6
            java.awt.Graphics2D r0 = r0.wrapped
            r1 = r7
            r2 = r9
            r0.scale(r1, r2)
            return
    }

    public void setTransform(java.awt.geom.AffineTransform r6) {
            r5 = this;
            r0 = r5
            java.awt.geom.AffineTransform r0 = r0.getTransform()
            r7 = r0
            r0 = r5
            r1 = r5
            r2 = r5
            java.awt.Shape r2 = r2.baseClip
            r3 = r7
            java.awt.Shape r1 = r1.transformShape(r2, r3)
            r0.baseClip = r1
            r0 = r5
            r1 = r5
            r2 = r5
            java.awt.Shape r2 = r2.userClip
            r3 = r7
            java.awt.Shape r1 = r1.transformShape(r2, r3)
            r0.userClip = r1
            r0 = r6
            java.awt.geom.AffineTransform r0 = r0.createInverse()     // Catch: java.awt.geom.NoninvertibleTransformException -> L41
            r8 = r0
            r0 = r5
            r1 = r5
            r2 = r5
            java.awt.Shape r2 = r2.baseClip     // Catch: java.awt.geom.NoninvertibleTransformException -> L41
            r3 = r8
            java.awt.Shape r1 = r1.transformShape(r2, r3)     // Catch: java.awt.geom.NoninvertibleTransformException -> L41
            r0.baseClip = r1     // Catch: java.awt.geom.NoninvertibleTransformException -> L41
            r0 = r5
            r1 = r5
            r2 = r5
            java.awt.Shape r2 = r2.userClip     // Catch: java.awt.geom.NoninvertibleTransformException -> L41
            r3 = r8
            java.awt.Shape r1 = r1.transformShape(r2, r3)     // Catch: java.awt.geom.NoninvertibleTransformException -> L41
            r0.userClip = r1     // Catch: java.awt.geom.NoninvertibleTransformException -> L41
            goto L50
        L41:
            r8 = move-exception
            boolean r0 = sun.awt.peer.cacio.WindowClippedGraphics.$assertionsDisabled
            if (r0 != 0) goto L50
            java.lang.AssertionError r0 = new java.lang.AssertionError
            r1 = r0
            r1.<init>()
            throw r0
        L50:
            r0 = r5
            java.awt.Graphics2D r0 = r0.wrapped
            r1 = r6
            r0.setTransform(r1)
            return
    }

    public void shear(double r7, double r9) {
            r6 = this;
            r0 = r7
            r1 = r9
            java.awt.geom.AffineTransform r0 = java.awt.geom.AffineTransform.getShearInstance(r0, r1)
            r11 = r0
            r0 = r11
            java.awt.geom.AffineTransform r0 = r0.createInverse()     // Catch: java.awt.geom.NoninvertibleTransformException -> L2d
            r12 = r0
            r0 = r6
            r1 = r6
            r2 = r6
            java.awt.Shape r2 = r2.baseClip     // Catch: java.awt.geom.NoninvertibleTransformException -> L2d
            r3 = r12
            java.awt.Shape r1 = r1.transformShape(r2, r3)     // Catch: java.awt.geom.NoninvertibleTransformException -> L2d
            r0.baseClip = r1     // Catch: java.awt.geom.NoninvertibleTransformException -> L2d
            r0 = r6
            r1 = r6
            r2 = r6
            java.awt.Shape r2 = r2.userClip     // Catch: java.awt.geom.NoninvertibleTransformException -> L2d
            r3 = r12
            java.awt.Shape r1 = r1.transformShape(r2, r3)     // Catch: java.awt.geom.NoninvertibleTransformException -> L2d
            r0.userClip = r1     // Catch: java.awt.geom.NoninvertibleTransformException -> L2d
            goto L3d
        L2d:
            r12 = move-exception
            boolean r0 = sun.awt.peer.cacio.WindowClippedGraphics.$assertionsDisabled
            if (r0 != 0) goto L3d
            java.lang.AssertionError r0 = new java.lang.AssertionError
            r1 = r0
            r1.<init>()
            throw r0
        L3d:
            r0 = r6
            java.awt.Graphics2D r0 = r0.wrapped
            r1 = r7
            r2 = r9
            r0.shear(r1, r2)
            return
    }

    public void transform(java.awt.geom.AffineTransform r6) {
            r5 = this;
            r0 = r6
            java.awt.geom.AffineTransform r0 = r0.createInverse()     // Catch: java.awt.geom.NoninvertibleTransformException -> L22
            r7 = r0
            r0 = r5
            r1 = r5
            r2 = r5
            java.awt.Shape r2 = r2.baseClip     // Catch: java.awt.geom.NoninvertibleTransformException -> L22
            r3 = r7
            java.awt.Shape r1 = r1.transformShape(r2, r3)     // Catch: java.awt.geom.NoninvertibleTransformException -> L22
            r0.baseClip = r1     // Catch: java.awt.geom.NoninvertibleTransformException -> L22
            r0 = r5
            r1 = r5
            r2 = r5
            java.awt.Shape r2 = r2.userClip     // Catch: java.awt.geom.NoninvertibleTransformException -> L22
            r3 = r7
            java.awt.Shape r1 = r1.transformShape(r2, r3)     // Catch: java.awt.geom.NoninvertibleTransformException -> L22
            r0.userClip = r1     // Catch: java.awt.geom.NoninvertibleTransformException -> L22
            goto L31
        L22:
            r7 = move-exception
            boolean r0 = sun.awt.peer.cacio.WindowClippedGraphics.$assertionsDisabled
            if (r0 != 0) goto L31
            java.lang.AssertionError r0 = new java.lang.AssertionError
            r1 = r0
            r1.<init>()
            throw r0
        L31:
            r0 = r5
            java.awt.Graphics2D r0 = r0.wrapped
            r1 = r6
            r0.transform(r1)
            return
    }

    public void translate(int r6, int r7) {
            r5 = this;
            r0 = r6
            int r0 = -r0
            double r0 = (double) r0
            r1 = r7
            int r1 = -r1
            double r1 = (double) r1
            java.awt.geom.AffineTransform r0 = java.awt.geom.AffineTransform.getTranslateInstance(r0, r1)
            r8 = r0
            r0 = r5
            java.awt.Shape r0 = r0.userClip
            if (r0 == 0) goto L3d
            r0 = r5
            java.awt.Shape r0 = r0.userClip
            boolean r0 = r0 instanceof java.awt.Rectangle
            if (r0 == 0) goto L3d
            r0 = r5
            java.awt.Shape r0 = r0.userClip
            java.awt.Rectangle r0 = (java.awt.Rectangle) r0
            r9 = r0
            r0 = r9
            r1 = r0
            int r1 = r1.x
            r2 = r6
            int r1 = r1 - r2
            r0.x = r1
            r0 = r9
            r1 = r0
            int r1 = r1.y
            r2 = r7
            int r1 = r1 - r2
            r0.y = r1
            goto L4a
        L3d:
            r0 = r5
            r1 = r5
            r2 = r5
            java.awt.Shape r2 = r2.userClip
            r3 = r8
            java.awt.Shape r1 = r1.transformShape(r2, r3)
            r0.userClip = r1
        L4a:
            r0 = r5
            r1 = r5
            r2 = r5
            java.awt.Shape r2 = r2.baseClip
            r3 = r8
            java.awt.Shape r1 = r1.transformShape(r2, r3)
            r0.baseClip = r1
            r0 = r5
            java.awt.Graphics2D r0 = r0.wrapped
            r1 = r6
            r2 = r7
            r0.translate(r1, r2)
            return
    }

    public void translate(double r7, double r9) {
            r6 = this;
            r0 = r7
            r1 = r9
            java.awt.geom.AffineTransform r0 = java.awt.geom.AffineTransform.getTranslateInstance(r0, r1)
            r11 = r0
            r0 = r11
            java.awt.geom.AffineTransform r0 = r0.createInverse()     // Catch: java.awt.geom.NoninvertibleTransformException -> L2d
            r12 = r0
            r0 = r6
            r1 = r6
            r2 = r6
            java.awt.Shape r2 = r2.baseClip     // Catch: java.awt.geom.NoninvertibleTransformException -> L2d
            r3 = r12
            java.awt.Shape r1 = r1.transformShape(r2, r3)     // Catch: java.awt.geom.NoninvertibleTransformException -> L2d
            r0.baseClip = r1     // Catch: java.awt.geom.NoninvertibleTransformException -> L2d
            r0 = r6
            r1 = r6
            r2 = r6
            java.awt.Shape r2 = r2.userClip     // Catch: java.awt.geom.NoninvertibleTransformException -> L2d
            r3 = r12
            java.awt.Shape r1 = r1.transformShape(r2, r3)     // Catch: java.awt.geom.NoninvertibleTransformException -> L2d
            r0.userClip = r1     // Catch: java.awt.geom.NoninvertibleTransformException -> L2d
            goto L3d
        L2d:
            r12 = move-exception
            boolean r0 = sun.awt.peer.cacio.WindowClippedGraphics.$assertionsDisabled
            if (r0 != 0) goto L3d
            java.lang.AssertionError r0 = new java.lang.AssertionError
            r1 = r0
            r1.<init>()
            throw r0
        L3d:
            r0 = r6
            java.awt.Graphics2D r0 = r0.wrapped
            r1 = r7
            r2 = r9
            r0.translate(r1, r2)
            return
    }

    public java.awt.Graphics create() {
            r5 = this;
            r0 = r5
            java.awt.Graphics2D r0 = r0.wrapped
            java.awt.Graphics r0 = r0.create()
            java.awt.Graphics2D r0 = (java.awt.Graphics2D) r0
            r6 = r0
            sun.awt.peer.cacio.WindowClippedGraphics r0 = new sun.awt.peer.cacio.WindowClippedGraphics
            r1 = r0
            r2 = r6
            r3 = r5
            java.awt.Shape r3 = r3.baseClip
            r1.<init>(r2, r3)
            r7 = r0
            r0 = r7
            r1 = r5
            java.awt.Shape r1 = r1.userClip
            r0.userClip = r1
            r0 = r7
            return r0
    }

    public java.awt.Graphics create(int r7, int r8, int r9, int r10) {
            r6 = this;
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            java.awt.Graphics r0 = super.create(r1, r2, r3, r4)
            r11 = r0
            r0 = r11
            boolean r0 = r0 instanceof java.awt.Graphics2D
            if (r0 == 0) goto L40
            r0 = r6
            java.awt.Shape r0 = r0.baseClip
            if (r0 == 0) goto L40
            r0 = r7
            int r0 = -r0
            double r0 = (double) r0
            r1 = r8
            int r1 = -r1
            double r1 = (double) r1
            java.awt.geom.AffineTransform r0 = java.awt.geom.AffineTransform.getTranslateInstance(r0, r1)
            r12 = r0
            r0 = r6
            r1 = r6
            java.awt.Shape r1 = r1.baseClip
            r2 = r12
            java.awt.Shape r0 = r0.transformShape(r1, r2)
            r13 = r0
            sun.awt.peer.cacio.WindowClippedGraphics r0 = new sun.awt.peer.cacio.WindowClippedGraphics
            r1 = r0
            r2 = r11
            java.awt.Graphics2D r2 = (java.awt.Graphics2D) r2
            r3 = r13
            r1.<init>(r2, r3)
            return r0
        L40:
            r0 = r11
            return r0
    }

    public void addRenderingHints(java.util.Map<?, ?> r4) {
            r3 = this;
            r0 = r3
            java.awt.Graphics2D r0 = r0.wrapped
            r1 = r4
            r0.addRenderingHints(r1)
            return
    }

    public void draw(java.awt.Shape r4) {
            r3 = this;
            r0 = r3
            java.awt.Graphics2D r0 = r0.wrapped
            r1 = r4
            r0.draw(r1)
            return
    }

    public void drawGlyphVector(java.awt.font.GlyphVector r6, float r7, float r8) {
            r5 = this;
            r0 = r5
            java.awt.Graphics2D r0 = r0.wrapped
            r1 = r6
            r2 = r7
            r3 = r8
            r0.drawGlyphVector(r1, r2, r3)
            return
    }

    public boolean drawImage(java.awt.Image r6, java.awt.geom.AffineTransform r7, java.awt.image.ImageObserver r8) {
            r5 = this;
            r0 = r5
            java.awt.Graphics2D r0 = r0.wrapped
            r1 = r6
            r2 = r7
            r3 = r8
            boolean r0 = r0.drawImage(r1, r2, r3)
            return r0
    }

    public void drawImage(java.awt.image.BufferedImage r7, java.awt.image.BufferedImageOp r8, int r9, int r10) {
            r6 = this;
            r0 = r6
            java.awt.Graphics2D r0 = r0.wrapped
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            r0.drawImage(r1, r2, r3, r4)
            return
    }

    public void drawRenderableImage(java.awt.image.renderable.RenderableImage r5, java.awt.geom.AffineTransform r6) {
            r4 = this;
            r0 = r4
            java.awt.Graphics2D r0 = r0.wrapped
            r1 = r5
            r2 = r6
            r0.drawRenderableImage(r1, r2)
            return
    }

    public void drawRenderedImage(java.awt.image.RenderedImage r5, java.awt.geom.AffineTransform r6) {
            r4 = this;
            r0 = r4
            java.awt.Graphics2D r0 = r0.wrapped
            r1 = r5
            r2 = r6
            r0.drawRenderedImage(r1, r2)
            return
    }

    public void drawString(java.lang.String r6, int r7, int r8) {
            r5 = this;
            r0 = r5
            java.awt.Graphics2D r0 = r0.wrapped
            r1 = r6
            r2 = r7
            r3 = r8
            r0.drawString(r1, r2, r3)
            return
    }

    public void drawChars(char[] r8, int r9, int r10, int r11, int r12) {
            r7 = this;
            r0 = r7
            java.awt.Graphics2D r0 = r0.wrapped
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            r5 = r12
            r0.drawChars(r1, r2, r3, r4, r5)
            return
    }

    public void drawBytes(byte[] r8, int r9, int r10, int r11, int r12) {
            r7 = this;
            r0 = r7
            java.awt.Graphics2D r0 = r0.wrapped
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            r5 = r12
            r0.drawBytes(r1, r2, r3, r4, r5)
            return
    }

    public void drawString(java.lang.String r6, float r7, float r8) {
            r5 = this;
            r0 = r5
            java.awt.Graphics2D r0 = r0.wrapped
            r1 = r6
            r2 = r7
            r3 = r8
            r0.drawString(r1, r2, r3)
            return
    }

    public void drawString(java.text.AttributedCharacterIterator r6, int r7, int r8) {
            r5 = this;
            r0 = r5
            java.awt.Graphics2D r0 = r0.wrapped
            r1 = r6
            r2 = r7
            r3 = r8
            r0.drawString(r1, r2, r3)
            return
    }

    public void drawString(java.text.AttributedCharacterIterator r6, float r7, float r8) {
            r5 = this;
            r0 = r5
            java.awt.Graphics2D r0 = r0.wrapped
            r1 = r6
            r2 = r7
            r3 = r8
            r0.drawString(r1, r2, r3)
            return
    }

    public void fill(java.awt.Shape r4) {
            r3 = this;
            r0 = r3
            java.awt.Graphics2D r0 = r0.wrapped
            r1 = r4
            r0.fill(r1)
            return
    }

    public java.awt.Color getBackground() {
            r2 = this;
            r0 = r2
            java.awt.Graphics2D r0 = r0.wrapped
            java.awt.Color r0 = r0.getBackground()
            return r0
    }

    public java.awt.Composite getComposite() {
            r2 = this;
            r0 = r2
            java.awt.Graphics2D r0 = r0.wrapped
            java.awt.Composite r0 = r0.getComposite()
            return r0
    }

    public java.awt.GraphicsConfiguration getDeviceConfiguration() {
            r2 = this;
            r0 = r2
            java.awt.Graphics2D r0 = r0.wrapped
            java.awt.GraphicsConfiguration r0 = r0.getDeviceConfiguration()
            return r0
    }

    public java.awt.font.FontRenderContext getFontRenderContext() {
            r2 = this;
            r0 = r2
            java.awt.Graphics2D r0 = r0.wrapped
            java.awt.font.FontRenderContext r0 = r0.getFontRenderContext()
            return r0
    }

    public java.awt.Paint getPaint() {
            r2 = this;
            r0 = r2
            java.awt.Graphics2D r0 = r0.wrapped
            java.awt.Paint r0 = r0.getPaint()
            return r0
    }

    public java.lang.Object getRenderingHint(java.awt.RenderingHints.Key r4) {
            r3 = this;
            r0 = r3
            java.awt.Graphics2D r0 = r0.wrapped
            r1 = r4
            java.lang.Object r0 = r0.getRenderingHint(r1)
            return r0
    }

    public java.awt.RenderingHints getRenderingHints() {
            r2 = this;
            r0 = r2
            java.awt.Graphics2D r0 = r0.wrapped
            java.awt.RenderingHints r0 = r0.getRenderingHints()
            return r0
    }

    public java.awt.Stroke getStroke() {
            r2 = this;
            r0 = r2
            java.awt.Graphics2D r0 = r0.wrapped
            java.awt.Stroke r0 = r0.getStroke()
            return r0
    }

    public java.awt.geom.AffineTransform getTransform() {
            r2 = this;
            r0 = r2
            java.awt.Graphics2D r0 = r0.wrapped
            java.awt.geom.AffineTransform r0 = r0.getTransform()
            return r0
    }

    public boolean hit(java.awt.Rectangle r6, java.awt.Shape r7, boolean r8) {
            r5 = this;
            r0 = r5
            java.awt.Graphics2D r0 = r0.wrapped
            r1 = r6
            r2 = r7
            r3 = r8
            boolean r0 = r0.hit(r1, r2, r3)
            return r0
    }

    public boolean hitClip(int r7, int r8, int r9, int r10) {
            r6 = this;
            r0 = r6
            java.awt.Graphics2D r0 = r0.wrapped
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            boolean r0 = r0.hitClip(r1, r2, r3, r4)
            return r0
    }

    public void setBackground(java.awt.Color r4) {
            r3 = this;
            r0 = r3
            java.awt.Graphics2D r0 = r0.wrapped
            r1 = r4
            r0.setBackground(r1)
            return
    }

    public void setComposite(java.awt.Composite r4) {
            r3 = this;
            r0 = r3
            java.awt.Graphics2D r0 = r0.wrapped
            r1 = r4
            r0.setComposite(r1)
            return
    }

    public void setPaint(java.awt.Paint r4) {
            r3 = this;
            r0 = r3
            java.awt.Graphics2D r0 = r0.wrapped
            r1 = r4
            r0.setPaint(r1)
            return
    }

    public void setRenderingHint(java.awt.RenderingHints.Key r5, java.lang.Object r6) {
            r4 = this;
            r0 = r4
            java.awt.Graphics2D r0 = r0.wrapped
            r1 = r5
            r2 = r6
            r0.setRenderingHint(r1, r2)
            return
    }

    public void setRenderingHints(java.util.Map<?, ?> r4) {
            r3 = this;
            r0 = r3
            java.awt.Graphics2D r0 = r0.wrapped
            r1 = r4
            r0.setRenderingHints(r1)
            return
    }

    public void setStroke(java.awt.Stroke r4) {
            r3 = this;
            r0 = r3
            java.awt.Graphics2D r0 = r0.wrapped
            r1 = r4
            r0.setStroke(r1)
            return
    }

    public void clearRect(int r7, int r8, int r9, int r10) {
            r6 = this;
            r0 = r6
            java.awt.Graphics2D r0 = r0.wrapped
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            r0.clearRect(r1, r2, r3, r4)
            return
    }

    public void copyArea(int r9, int r10, int r11, int r12, int r13, int r14) {
            r8 = this;
            r0 = r8
            java.awt.Graphics2D r0 = r0.wrapped
            r1 = r9
            r2 = r10
            r3 = r11
            r4 = r12
            r5 = r13
            r6 = r14
            r0.copyArea(r1, r2, r3, r4, r5, r6)
            return
    }

    public void dispose() {
            r2 = this;
            r0 = r2
            java.awt.Graphics2D r0 = r0.wrapped
            r0.dispose()
            return
    }

    public void drawArc(int r9, int r10, int r11, int r12, int r13, int r14) {
            r8 = this;
            r0 = r8
            java.awt.Graphics2D r0 = r0.wrapped
            r1 = r9
            r2 = r10
            r3 = r11
            r4 = r12
            r5 = r13
            r6 = r14
            r0.drawArc(r1, r2, r3, r4, r5, r6)
            return
    }

    public boolean drawImage(java.awt.Image r7, int r8, int r9, java.awt.image.ImageObserver r10) {
            r6 = this;
            r0 = r6
            java.awt.Graphics2D r0 = r0.wrapped
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            boolean r0 = r0.drawImage(r1, r2, r3, r4)
            return r0
    }

    public boolean drawImage(java.awt.Image r9, int r10, int r11, int r12, int r13, java.awt.image.ImageObserver r14) {
            r8 = this;
            r0 = r8
            java.awt.Graphics2D r0 = r0.wrapped
            r1 = r9
            r2 = r10
            r3 = r11
            r4 = r12
            r5 = r13
            r6 = r14
            boolean r0 = r0.drawImage(r1, r2, r3, r4, r5, r6)
            return r0
    }

    public boolean drawImage(java.awt.Image r8, int r9, int r10, java.awt.Color r11, java.awt.image.ImageObserver r12) {
            r7 = this;
            r0 = r7
            java.awt.Graphics2D r0 = r0.wrapped
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            r5 = r12
            boolean r0 = r0.drawImage(r1, r2, r3, r4, r5)
            return r0
    }

    public boolean drawImage(java.awt.Image r10, int r11, int r12, int r13, int r14, java.awt.Color r15, java.awt.image.ImageObserver r16) {
            r9 = this;
            r0 = r9
            java.awt.Graphics2D r0 = r0.wrapped
            r1 = r10
            r2 = r11
            r3 = r12
            r4 = r13
            r5 = r14
            r6 = r15
            r7 = r16
            boolean r0 = r0.drawImage(r1, r2, r3, r4, r5, r6, r7)
            return r0
    }

    public boolean drawImage(java.awt.Image r13, int r14, int r15, int r16, int r17, int r18, int r19, int r20, int r21, java.awt.image.ImageObserver r22) {
            r12 = this;
            r0 = r12
            java.awt.Graphics2D r0 = r0.wrapped
            r1 = r13
            r2 = r14
            r3 = r15
            r4 = r16
            r5 = r17
            r6 = r18
            r7 = r19
            r8 = r20
            r9 = r21
            r10 = r22
            boolean r0 = r0.drawImage(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            return r0
    }

    public boolean drawImage(java.awt.Image r14, int r15, int r16, int r17, int r18, int r19, int r20, int r21, int r22, java.awt.Color r23, java.awt.image.ImageObserver r24) {
            r13 = this;
            r0 = r13
            java.awt.Graphics2D r0 = r0.wrapped
            r1 = r14
            r2 = r15
            r3 = r16
            r4 = r17
            r5 = r18
            r6 = r19
            r7 = r20
            r8 = r21
            r9 = r22
            r10 = r23
            r11 = r24
            boolean r0 = r0.drawImage(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            return r0
    }

    public void drawLine(int r7, int r8, int r9, int r10) {
            r6 = this;
            r0 = r6
            java.awt.Graphics2D r0 = r0.wrapped
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            r0.drawLine(r1, r2, r3, r4)
            return
    }

    public void drawOval(int r7, int r8, int r9, int r10) {
            r6 = this;
            r0 = r6
            java.awt.Graphics2D r0 = r0.wrapped
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            r0.drawOval(r1, r2, r3, r4)
            return
    }

    public void drawPolygon(int[] r6, int[] r7, int r8) {
            r5 = this;
            r0 = r5
            java.awt.Graphics2D r0 = r0.wrapped
            r1 = r6
            r2 = r7
            r3 = r8
            r0.drawPolygon(r1, r2, r3)
            return
    }

    public void drawPolygon(java.awt.Polygon r4) {
            r3 = this;
            r0 = r3
            java.awt.Graphics2D r0 = r0.wrapped
            r1 = r4
            r0.drawPolygon(r1)
            return
    }

    public void fillPolygon(java.awt.Polygon r4) {
            r3 = this;
            r0 = r3
            java.awt.Graphics2D r0 = r0.wrapped
            r1 = r4
            r0.fillPolygon(r1)
            return
    }

    public void drawPolyline(int[] r6, int[] r7, int r8) {
            r5 = this;
            r0 = r5
            java.awt.Graphics2D r0 = r0.wrapped
            r1 = r6
            r2 = r7
            r3 = r8
            r0.drawPolyline(r1, r2, r3)
            return
    }

    public void drawRoundRect(int r9, int r10, int r11, int r12, int r13, int r14) {
            r8 = this;
            r0 = r8
            java.awt.Graphics2D r0 = r0.wrapped
            r1 = r9
            r2 = r10
            r3 = r11
            r4 = r12
            r5 = r13
            r6 = r14
            r0.drawRoundRect(r1, r2, r3, r4, r5, r6)
            return
    }

    public void fillArc(int r9, int r10, int r11, int r12, int r13, int r14) {
            r8 = this;
            r0 = r8
            java.awt.Graphics2D r0 = r0.wrapped
            r1 = r9
            r2 = r10
            r3 = r11
            r4 = r12
            r5 = r13
            r6 = r14
            r0.fillArc(r1, r2, r3, r4, r5, r6)
            return
    }

    public void fillOval(int r7, int r8, int r9, int r10) {
            r6 = this;
            r0 = r6
            java.awt.Graphics2D r0 = r0.wrapped
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            r0.fillOval(r1, r2, r3, r4)
            return
    }

    public void fillPolygon(int[] r6, int[] r7, int r8) {
            r5 = this;
            r0 = r5
            java.awt.Graphics2D r0 = r0.wrapped
            r1 = r6
            r2 = r7
            r3 = r8
            r0.fillPolygon(r1, r2, r3)
            return
    }

    public void fillRect(int r7, int r8, int r9, int r10) {
            r6 = this;
            r0 = r6
            java.awt.Graphics2D r0 = r0.wrapped
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            r0.fillRect(r1, r2, r3, r4)
            return
    }

    public void drawRect(int r7, int r8, int r9, int r10) {
            r6 = this;
            r0 = r6
            java.awt.Graphics2D r0 = r0.wrapped
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            r0.drawRect(r1, r2, r3, r4)
            return
    }

    public void draw3DRect(int r8, int r9, int r10, int r11, boolean r12) {
            r7 = this;
            r0 = r7
            java.awt.Graphics2D r0 = r0.wrapped
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            r5 = r12
            r0.draw3DRect(r1, r2, r3, r4, r5)
            return
    }

    public void fill3DRect(int r8, int r9, int r10, int r11, boolean r12) {
            r7 = this;
            r0 = r7
            java.awt.Graphics2D r0 = r0.wrapped
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            r5 = r12
            r0.fill3DRect(r1, r2, r3, r4, r5)
            return
    }

    public void fillRoundRect(int r9, int r10, int r11, int r12, int r13, int r14) {
            r8 = this;
            r0 = r8
            java.awt.Graphics2D r0 = r0.wrapped
            r1 = r9
            r2 = r10
            r3 = r11
            r4 = r12
            r5 = r13
            r6 = r14
            r0.fillRoundRect(r1, r2, r3, r4, r5, r6)
            return
    }

    public java.awt.Color getColor() {
            r2 = this;
            r0 = r2
            java.awt.Graphics2D r0 = r0.wrapped
            java.awt.Color r0 = r0.getColor()
            return r0
    }

    public java.awt.Font getFont() {
            r2 = this;
            r0 = r2
            java.awt.Graphics2D r0 = r0.wrapped
            java.awt.Font r0 = r0.getFont()
            return r0
    }

    public java.awt.FontMetrics getFontMetrics(java.awt.Font r4) {
            r3 = this;
            r0 = r3
            java.awt.Graphics2D r0 = r0.wrapped
            r1 = r4
            java.awt.FontMetrics r0 = r0.getFontMetrics(r1)
            return r0
    }

    public java.awt.FontMetrics getFontMetrics() {
            r2 = this;
            r0 = r2
            java.awt.Graphics2D r0 = r0.wrapped
            java.awt.FontMetrics r0 = r0.getFontMetrics()
            return r0
    }

    public void setColor(java.awt.Color r4) {
            r3 = this;
            r0 = r3
            java.awt.Graphics2D r0 = r0.wrapped
            r1 = r4
            r0.setColor(r1)
            return
    }

    public void setFont(java.awt.Font r4) {
            r3 = this;
            r0 = r3
            java.awt.Graphics2D r0 = r0.wrapped
            r1 = r4
            r0.setFont(r1)
            return
    }

    public void setPaintMode() {
            r2 = this;
            r0 = r2
            java.awt.Graphics2D r0 = r0.wrapped
            r0.setPaintMode()
            return
    }

    public void setXORMode(java.awt.Color r4) {
            r3 = this;
            r0 = r3
            java.awt.Graphics2D r0 = r0.wrapped
            r1 = r4
            r0.setXORMode(r1)
            return
    }

    public void constrain(int r11, int r12, int r13, int r14) {
            r10 = this;
            r0 = r10
            java.awt.Graphics2D r0 = r0.wrapped
            boolean r0 = r0 instanceof sun.awt.ConstrainableGraphics
            if (r0 == 0) goto La7
            r0 = r11
            int r0 = -r0
            double r0 = (double) r0
            r1 = r12
            int r1 = -r1
            double r1 = (double) r1
            java.awt.geom.AffineTransform r0 = java.awt.geom.AffineTransform.getTranslateInstance(r0, r1)
            r15 = r0
            r0 = r10
            java.awt.Shape r0 = r0.userClip
            if (r0 == 0) goto L48
            r0 = r10
            java.awt.Shape r0 = r0.userClip
            boolean r0 = r0 instanceof java.awt.Rectangle
            if (r0 == 0) goto L48
            r0 = r10
            java.awt.Shape r0 = r0.userClip
            java.awt.Rectangle r0 = (java.awt.Rectangle) r0
            r16 = r0
            r0 = r16
            r1 = r0
            int r1 = r1.x
            r2 = r11
            int r1 = r1 - r2
            r0.x = r1
            r0 = r16
            r1 = r0
            int r1 = r1.y
            r2 = r12
            int r1 = r1 - r2
            r0.y = r1
            goto L56
        L48:
            r0 = r10
            r1 = r10
            r2 = r10
            java.awt.Shape r2 = r2.userClip
            r3 = r15
            java.awt.Shape r1 = r1.transformShape(r2, r3)
            r0.userClip = r1
        L56:
            r0 = r10
            r1 = r10
            r2 = r10
            java.awt.Shape r2 = r2.baseClip
            r3 = r15
            java.awt.Shape r1 = r1.transformShape(r2, r3)
            r0.baseClip = r1
            java.awt.geom.Area r0 = new java.awt.geom.Area
            r1 = r0
            r2 = r10
            java.awt.Shape r2 = r2.baseClip
            r1.<init>(r2)
            r16 = r0
            r0 = r16
            java.awt.geom.Area r1 = new java.awt.geom.Area
            r2 = r1
            java.awt.Rectangle r3 = new java.awt.Rectangle
            r4 = r3
            r5 = 0
            r6 = 0
            r7 = r13
            r8 = r14
            r4.<init>(r5, r6, r7, r8)
            r2.<init>(r3)
            r0.intersect(r1)
            r0 = r10
            r1 = r16
            r0.baseClip = r1
            r0 = r10
            java.awt.Graphics2D r0 = r0.wrapped
            sun.awt.ConstrainableGraphics r0 = (sun.awt.ConstrainableGraphics) r0
            r17 = r0
            r0 = r17
            r1 = r11
            r2 = r12
            r3 = r13
            r4 = r14
            r0.constrain(r1, r2, r3, r4)
            goto Laf
        La7:
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r1 = r0
            r1.<init>()
            throw r0
        Laf:
            return
    }

    static {
            java.lang.Class<sun.awt.peer.cacio.WindowClippedGraphics> r0 = sun.awt.peer.cacio.WindowClippedGraphics.class
            boolean r0 = r0.desiredAssertionStatus()
            if (r0 != 0) goto Lc
            r0 = 1
            goto Ld
        Lc:
            r0 = 0
        Ld:
            sun.awt.peer.cacio.WindowClippedGraphics.$assertionsDisabled = r0
            return
    }
}
