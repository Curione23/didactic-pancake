package org.lwjgl.util;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/util/Rectangle.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/util/Rectangle.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/util/Rectangle.class */
public final class Rectangle implements org.lwjgl.util.ReadableRectangle, org.lwjgl.util.WritableRectangle, java.io.Serializable {
    static final long serialVersionUID = 1;
    private int x;
    private int y;
    private int width;
    private int height;

    public Rectangle() {
            r2 = this;
            r0 = r2
            r0.<init>()
            return
    }

    public Rectangle(int r4, int r5, int r6, int r7) {
            r3 = this;
            r0 = r3
            r0.<init>()
            r0 = r3
            r1 = r4
            r0.x = r1
            r0 = r3
            r1 = r5
            r0.y = r1
            r0 = r3
            r1 = r6
            r0.width = r1
            r0 = r3
            r1 = r7
            r0.height = r1
            return
    }

    public Rectangle(org.lwjgl.util.ReadablePoint r4, org.lwjgl.util.ReadableDimension r5) {
            r3 = this;
            r0 = r3
            r0.<init>()
            r0 = r3
            r1 = r4
            int r1 = r1.getX()
            r0.x = r1
            r0 = r3
            r1 = r4
            int r1 = r1.getY()
            r0.y = r1
            r0 = r3
            r1 = r5
            int r1 = r1.getWidth()
            r0.width = r1
            r0 = r3
            r1 = r5
            int r1 = r1.getHeight()
            r0.height = r1
            return
    }

    public Rectangle(org.lwjgl.util.ReadableRectangle r4) {
            r3 = this;
            r0 = r3
            r0.<init>()
            r0 = r3
            r1 = r4
            int r1 = r1.getX()
            r0.x = r1
            r0 = r3
            r1 = r4
            int r1 = r1.getY()
            r0.y = r1
            r0 = r3
            r1 = r4
            int r1 = r1.getWidth()
            r0.width = r1
            r0 = r3
            r1 = r4
            int r1 = r1.getHeight()
            r0.height = r1
            return
    }

    @Override // org.lwjgl.util.WritablePoint
    public void setLocation(int r4, int r5) {
            r3 = this;
            r0 = r3
            r1 = r4
            r0.x = r1
            r0 = r3
            r1 = r5
            r0.y = r1
            return
    }

    @Override // org.lwjgl.util.WritablePoint
    public void setLocation(org.lwjgl.util.ReadablePoint r4) {
            r3 = this;
            r0 = r3
            r1 = r4
            int r1 = r1.getX()
            r0.x = r1
            r0 = r3
            r1 = r4
            int r1 = r1.getY()
            r0.y = r1
            return
    }

    @Override // org.lwjgl.util.WritableDimension
    public void setSize(int r4, int r5) {
            r3 = this;
            r0 = r3
            r1 = r4
            r0.width = r1
            r0 = r3
            r1 = r5
            r0.height = r1
            return
    }

    @Override // org.lwjgl.util.WritableDimension
    public void setSize(org.lwjgl.util.ReadableDimension r4) {
            r3 = this;
            r0 = r3
            r1 = r4
            int r1 = r1.getWidth()
            r0.width = r1
            r0 = r3
            r1 = r4
            int r1 = r1.getHeight()
            r0.height = r1
            return
    }

    @Override // org.lwjgl.util.WritableRectangle
    public void setBounds(int r4, int r5, int r6, int r7) {
            r3 = this;
            r0 = r3
            r1 = r4
            r0.x = r1
            r0 = r3
            r1 = r5
            r0.y = r1
            r0 = r3
            r1 = r6
            r0.width = r1
            r0 = r3
            r1 = r7
            r0.height = r1
            return
    }

    @Override // org.lwjgl.util.WritableRectangle
    public void setBounds(org.lwjgl.util.ReadablePoint r4, org.lwjgl.util.ReadableDimension r5) {
            r3 = this;
            r0 = r3
            r1 = r4
            int r1 = r1.getX()
            r0.x = r1
            r0 = r3
            r1 = r4
            int r1 = r1.getY()
            r0.y = r1
            r0 = r3
            r1 = r5
            int r1 = r1.getWidth()
            r0.width = r1
            r0 = r3
            r1 = r5
            int r1 = r1.getHeight()
            r0.height = r1
            return
    }

    @Override // org.lwjgl.util.WritableRectangle
    public void setBounds(org.lwjgl.util.ReadableRectangle r4) {
            r3 = this;
            r0 = r3
            r1 = r4
            int r1 = r1.getX()
            r0.x = r1
            r0 = r3
            r1 = r4
            int r1 = r1.getY()
            r0.y = r1
            r0 = r3
            r1 = r4
            int r1 = r1.getWidth()
            r0.width = r1
            r0 = r3
            r1 = r4
            int r1 = r1.getHeight()
            r0.height = r1
            return
    }

    @Override // org.lwjgl.util.ReadableRectangle
    public void getBounds(org.lwjgl.util.WritableRectangle r7) {
            r6 = this;
            r0 = r7
            r1 = r6
            int r1 = r1.x
            r2 = r6
            int r2 = r2.y
            r3 = r6
            int r3 = r3.width
            r4 = r6
            int r4 = r4.height
            r0.setBounds(r1, r2, r3, r4)
            return
    }

    @Override // org.lwjgl.util.ReadablePoint
    public void getLocation(org.lwjgl.util.WritablePoint r5) {
            r4 = this;
            r0 = r5
            r1 = r4
            int r1 = r1.x
            r2 = r4
            int r2 = r2.y
            r0.setLocation(r1, r2)
            return
    }

    @Override // org.lwjgl.util.ReadableDimension
    public void getSize(org.lwjgl.util.WritableDimension r5) {
            r4 = this;
            r0 = r5
            r1 = r4
            int r1 = r1.width
            r2 = r4
            int r2 = r2.height
            r0.setSize(r1, r2)
            return
    }

    public void translate(int r5, int r6) {
            r4 = this;
            r0 = r4
            r1 = r0
            int r1 = r1.x
            r2 = r5
            int r1 = r1 + r2
            r0.x = r1
            r0 = r4
            r1 = r0
            int r1 = r1.y
            r2 = r6
            int r1 = r1 + r2
            r0.y = r1
            return
    }

    public void translate(org.lwjgl.util.ReadablePoint r5) {
            r4 = this;
            r0 = r4
            r1 = r0
            int r1 = r1.x
            r2 = r5
            int r2 = r2.getX()
            int r1 = r1 + r2
            r0.x = r1
            r0 = r4
            r1 = r0
            int r1 = r1.y
            r2 = r5
            int r2 = r2.getY()
            int r1 = r1 + r2
            r0.y = r1
            return
    }

    public void untranslate(org.lwjgl.util.ReadablePoint r5) {
            r4 = this;
            r0 = r4
            r1 = r0
            int r1 = r1.x
            r2 = r5
            int r2 = r2.getX()
            int r1 = r1 - r2
            r0.x = r1
            r0 = r4
            r1 = r0
            int r1 = r1.y
            r2 = r5
            int r2 = r2.getY()
            int r1 = r1 - r2
            r0.y = r1
            return
    }

    public boolean contains(org.lwjgl.util.ReadablePoint r5) {
            r4 = this;
            r0 = r4
            r1 = r5
            int r1 = r1.getX()
            r2 = r5
            int r2 = r2.getY()
            boolean r0 = r0.contains(r1, r2)
            return r0
    }

    public boolean contains(int r4, int r5) {
            r3 = this;
            r0 = r3
            int r0 = r0.width
            r6 = r0
            r0 = r3
            int r0 = r0.height
            r7 = r0
            r0 = r6
            r1 = r7
            r0 = r0 | r1
            if (r0 >= 0) goto L14
            r0 = 0
            return r0
        L14:
            r0 = r3
            int r0 = r0.x
            r8 = r0
            r0 = r3
            int r0 = r0.y
            r9 = r0
            r0 = r4
            r1 = r8
            if (r0 < r1) goto L2c
            r0 = r5
            r1 = r9
            if (r0 >= r1) goto L2e
        L2c:
            r0 = 0
            return r0
        L2e:
            r0 = r6
            r1 = r8
            int r0 = r0 + r1
            r6 = r0
            r0 = r7
            r1 = r9
            int r0 = r0 + r1
            r7 = r0
            r0 = r6
            r1 = r8
            if (r0 < r1) goto L45
            r0 = r6
            r1 = r4
            if (r0 <= r1) goto L56
        L45:
            r0 = r7
            r1 = r9
            if (r0 < r1) goto L52
            r0 = r7
            r1 = r5
            if (r0 <= r1) goto L56
        L52:
            r0 = 1
            goto L57
        L56:
            r0 = 0
        L57:
            return r0
    }

    public boolean contains(org.lwjgl.util.ReadableRectangle r7) {
            r6 = this;
            r0 = r6
            r1 = r7
            int r1 = r1.getX()
            r2 = r7
            int r2 = r2.getY()
            r3 = r7
            int r3 = r3.getWidth()
            r4 = r7
            int r4 = r4.getHeight()
            boolean r0 = r0.contains(r1, r2, r3, r4)
            return r0
    }

    public boolean contains(int r4, int r5, int r6, int r7) {
            r3 = this;
            r0 = r3
            int r0 = r0.width
            r8 = r0
            r0 = r3
            int r0 = r0.height
            r9 = r0
            r0 = r8
            r1 = r9
            r0 = r0 | r1
            r1 = r6
            r0 = r0 | r1
            r1 = r7
            r0 = r0 | r1
            if (r0 >= 0) goto L1b
            r0 = 0
            return r0
        L1b:
            r0 = r3
            int r0 = r0.x
            r10 = r0
            r0 = r3
            int r0 = r0.y
            r11 = r0
            r0 = r4
            r1 = r10
            if (r0 < r1) goto L33
            r0 = r5
            r1 = r11
            if (r0 >= r1) goto L35
        L33:
            r0 = 0
            return r0
        L35:
            r0 = r8
            r1 = r10
            int r0 = r0 + r1
            r8 = r0
            r0 = r6
            r1 = r4
            int r0 = r0 + r1
            r6 = r0
            r0 = r6
            r1 = r4
            if (r0 > r1) goto L54
            r0 = r8
            r1 = r10
            if (r0 >= r1) goto L52
            r0 = r6
            r1 = r8
            if (r0 <= r1) goto L63
        L52:
            r0 = 0
            return r0
        L54:
            r0 = r8
            r1 = r10
            if (r0 < r1) goto L63
            r0 = r6
            r1 = r8
            if (r0 <= r1) goto L63
            r0 = 0
            return r0
        L63:
            r0 = r9
            r1 = r11
            int r0 = r0 + r1
            r9 = r0
            r0 = r7
            r1 = r5
            int r0 = r0 + r1
            r7 = r0
            r0 = r7
            r1 = r5
            if (r0 > r1) goto L86
            r0 = r9
            r1 = r11
            if (r0 >= r1) goto L84
            r0 = r7
            r1 = r9
            if (r0 <= r1) goto L96
        L84:
            r0 = 0
            return r0
        L86:
            r0 = r9
            r1 = r11
            if (r0 < r1) goto L96
            r0 = r7
            r1 = r9
            if (r0 <= r1) goto L96
            r0 = 0
            return r0
        L96:
            r0 = 1
            return r0
    }

    public boolean intersects(org.lwjgl.util.ReadableRectangle r4) {
            r3 = this;
            r0 = r3
            int r0 = r0.width
            r5 = r0
            r0 = r3
            int r0 = r0.height
            r6 = r0
            r0 = r4
            int r0 = r0.getWidth()
            r7 = r0
            r0 = r4
            int r0 = r0.getHeight()
            r8 = r0
            r0 = r7
            if (r0 <= 0) goto L2c
            r0 = r8
            if (r0 <= 0) goto L2c
            r0 = r5
            if (r0 <= 0) goto L2c
            r0 = r6
            if (r0 > 0) goto L2e
        L2c:
            r0 = 0
            return r0
        L2e:
            r0 = r3
            int r0 = r0.x
            r9 = r0
            r0 = r3
            int r0 = r0.y
            r10 = r0
            r0 = r4
            int r0 = r0.getX()
            r11 = r0
            r0 = r4
            int r0 = r0.getY()
            r12 = r0
            r0 = r7
            r1 = r11
            int r0 = r0 + r1
            r7 = r0
            r0 = r8
            r1 = r12
            int r0 = r0 + r1
            r8 = r0
            r0 = r5
            r1 = r9
            int r0 = r0 + r1
            r5 = r0
            r0 = r6
            r1 = r10
            int r0 = r0 + r1
            r6 = r0
            r0 = r7
            r1 = r11
            if (r0 < r1) goto L70
            r0 = r7
            r1 = r9
            if (r0 <= r1) goto L9a
        L70:
            r0 = r8
            r1 = r12
            if (r0 < r1) goto L7e
            r0 = r8
            r1 = r10
            if (r0 <= r1) goto L9a
        L7e:
            r0 = r5
            r1 = r9
            if (r0 < r1) goto L8a
            r0 = r5
            r1 = r11
            if (r0 <= r1) goto L9a
        L8a:
            r0 = r6
            r1 = r10
            if (r0 < r1) goto L96
            r0 = r6
            r1 = r12
            if (r0 <= r1) goto L9a
        L96:
            r0 = 1
            goto L9b
        L9a:
            r0 = 0
        L9b:
            return r0
    }

    public org.lwjgl.util.Rectangle intersection(org.lwjgl.util.ReadableRectangle r9, org.lwjgl.util.Rectangle r10) {
            r8 = this;
            r0 = r8
            int r0 = r0.x
            r11 = r0
            r0 = r8
            int r0 = r0.y
            r12 = r0
            r0 = r9
            int r0 = r0.getX()
            r13 = r0
            r0 = r9
            int r0 = r0.getY()
            r14 = r0
            r0 = r11
            long r0 = (long) r0
            r15 = r0
            r0 = r15
            r1 = r8
            int r1 = r1.width
            long r1 = (long) r1
            long r0 = r0 + r1
            r15 = r0
            r0 = r12
            long r0 = (long) r0
            r17 = r0
            r0 = r17
            r1 = r8
            int r1 = r1.height
            long r1 = (long) r1
            long r0 = r0 + r1
            r17 = r0
            r0 = r13
            long r0 = (long) r0
            r19 = r0
            r0 = r19
            r1 = r9
            int r1 = r1.getWidth()
            long r1 = (long) r1
            long r0 = r0 + r1
            r19 = r0
            r0 = r14
            long r0 = (long) r0
            r21 = r0
            r0 = r21
            r1 = r9
            int r1 = r1.getHeight()
            long r1 = (long) r1
            long r0 = r0 + r1
            r21 = r0
            r0 = r11
            r1 = r13
            if (r0 >= r1) goto L63
            r0 = r13
            r11 = r0
        L63:
            r0 = r12
            r1 = r14
            if (r0 >= r1) goto L6e
            r0 = r14
            r12 = r0
        L6e:
            r0 = r15
            r1 = r19
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 <= 0) goto L7a
            r0 = r19
            r15 = r0
        L7a:
            r0 = r17
            r1 = r21
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 <= 0) goto L86
            r0 = r21
            r17 = r0
        L86:
            r0 = r15
            r1 = r11
            long r1 = (long) r1
            long r0 = r0 - r1
            r15 = r0
            r0 = r17
            r1 = r12
            long r1 = (long) r1
            long r0 = r0 - r1
            r17 = r0
            r0 = r15
            r1 = -2147483648(0xffffffff80000000, double:NaN)
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 >= 0) goto La3
            r0 = -2147483648(0xffffffff80000000, double:NaN)
            r15 = r0
        La3:
            r0 = r17
            r1 = -2147483648(0xffffffff80000000, double:NaN)
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 >= 0) goto Lb1
            r0 = -2147483648(0xffffffff80000000, double:NaN)
            r17 = r0
        Lb1:
            r0 = r10
            if (r0 != 0) goto Lc9
            org.lwjgl.util.Rectangle r0 = new org.lwjgl.util.Rectangle
            r1 = r0
            r2 = r11
            r3 = r12
            r4 = r15
            int r4 = (int) r4
            r5 = r17
            int r5 = (int) r5
            r1.<init>(r2, r3, r4, r5)
            r10 = r0
            goto Ld6
        Lc9:
            r0 = r10
            r1 = r11
            r2 = r12
            r3 = r15
            int r3 = (int) r3
            r4 = r17
            int r4 = (int) r4
            r0.setBounds(r1, r2, r3, r4)
        Ld6:
            r0 = r10
            return r0
    }

    public org.lwjgl.util.WritableRectangle union(org.lwjgl.util.ReadableRectangle r8, org.lwjgl.util.WritableRectangle r9) {
            r7 = this;
            r0 = r7
            int r0 = r0.x
            r1 = r8
            int r1 = r1.getX()
            int r0 = java.lang.Math.min(r0, r1)
            r10 = r0
            r0 = r7
            int r0 = r0.x
            r1 = r7
            int r1 = r1.width
            int r0 = r0 + r1
            r1 = r8
            int r1 = r1.getX()
            r2 = r8
            int r2 = r2.getWidth()
            int r1 = r1 + r2
            int r0 = java.lang.Math.max(r0, r1)
            r11 = r0
            r0 = r7
            int r0 = r0.y
            r1 = r8
            int r1 = r1.getY()
            int r0 = java.lang.Math.min(r0, r1)
            r12 = r0
            r0 = r7
            int r0 = r0.y
            r1 = r7
            int r1 = r1.height
            int r0 = r0 + r1
            r1 = r8
            int r1 = r1.getY()
            r2 = r8
            int r2 = r2.getHeight()
            int r1 = r1 + r2
            int r0 = java.lang.Math.max(r0, r1)
            r13 = r0
            r0 = r9
            r1 = r10
            r2 = r12
            r3 = r11
            r4 = r10
            int r3 = r3 - r4
            r4 = r13
            r5 = r12
            int r4 = r4 - r5
            r0.setBounds(r1, r2, r3, r4)
            r0 = r9
            return r0
    }

    public void add(int r5, int r6) {
            r4 = this;
            r0 = r4
            int r0 = r0.x
            r1 = r5
            int r0 = java.lang.Math.min(r0, r1)
            r7 = r0
            r0 = r4
            int r0 = r0.x
            r1 = r4
            int r1 = r1.width
            int r0 = r0 + r1
            r1 = r5
            int r0 = java.lang.Math.max(r0, r1)
            r8 = r0
            r0 = r4
            int r0 = r0.y
            r1 = r6
            int r0 = java.lang.Math.min(r0, r1)
            r9 = r0
            r0 = r4
            int r0 = r0.y
            r1 = r4
            int r1 = r1.height
            int r0 = r0 + r1
            r1 = r6
            int r0 = java.lang.Math.max(r0, r1)
            r10 = r0
            r0 = r4
            r1 = r7
            r0.x = r1
            r0 = r4
            r1 = r9
            r0.y = r1
            r0 = r4
            r1 = r8
            r2 = r7
            int r1 = r1 - r2
            r0.width = r1
            r0 = r4
            r1 = r10
            r2 = r9
            int r1 = r1 - r2
            r0.height = r1
            return
    }

    public void add(org.lwjgl.util.ReadablePoint r5) {
            r4 = this;
            r0 = r4
            r1 = r5
            int r1 = r1.getX()
            r2 = r5
            int r2 = r2.getY()
            r0.add(r1, r2)
            return
    }

    public void add(org.lwjgl.util.ReadableRectangle r5) {
            r4 = this;
            r0 = r4
            int r0 = r0.x
            r1 = r5
            int r1 = r1.getX()
            int r0 = java.lang.Math.min(r0, r1)
            r6 = r0
            r0 = r4
            int r0 = r0.x
            r1 = r4
            int r1 = r1.width
            int r0 = r0 + r1
            r1 = r5
            int r1 = r1.getX()
            r2 = r5
            int r2 = r2.getWidth()
            int r1 = r1 + r2
            int r0 = java.lang.Math.max(r0, r1)
            r7 = r0
            r0 = r4
            int r0 = r0.y
            r1 = r5
            int r1 = r1.getY()
            int r0 = java.lang.Math.min(r0, r1)
            r8 = r0
            r0 = r4
            int r0 = r0.y
            r1 = r4
            int r1 = r1.height
            int r0 = r0 + r1
            r1 = r5
            int r1 = r1.getY()
            r2 = r5
            int r2 = r2.getHeight()
            int r1 = r1 + r2
            int r0 = java.lang.Math.max(r0, r1)
            r9 = r0
            r0 = r4
            r1 = r6
            r0.x = r1
            r0 = r4
            r1 = r8
            r0.y = r1
            r0 = r4
            r1 = r7
            r2 = r6
            int r1 = r1 - r2
            r0.width = r1
            r0 = r4
            r1 = r9
            r2 = r8
            int r1 = r1 - r2
            r0.height = r1
            return
    }

    public void grow(int r6, int r7) {
            r5 = this;
            r0 = r5
            r1 = r0
            int r1 = r1.x
            r2 = r6
            int r1 = r1 - r2
            r0.x = r1
            r0 = r5
            r1 = r0
            int r1 = r1.y
            r2 = r7
            int r1 = r1 - r2
            r0.y = r1
            r0 = r5
            r1 = r0
            int r1 = r1.width
            r2 = r6
            r3 = 2
            int r2 = r2 * r3
            int r1 = r1 + r2
            r0.width = r1
            r0 = r5
            r1 = r0
            int r1 = r1.height
            r2 = r7
            r3 = 2
            int r2 = r2 * r3
            int r1 = r1 + r2
            r0.height = r1
            return
    }

    public boolean isEmpty() {
            r2 = this;
            r0 = r2
            int r0 = r0.width
            if (r0 <= 0) goto Le
            r0 = r2
            int r0 = r0.height
            if (r0 > 0) goto L12
        Le:
            r0 = 1
            goto L13
        L12:
            r0 = 0
        L13:
            return r0
    }

    public boolean equals(java.lang.Object r4) {
            r3 = this;
            r0 = r4
            boolean r0 = r0 instanceof org.lwjgl.util.Rectangle
            if (r0 == 0) goto L3e
            r0 = r4
            org.lwjgl.util.Rectangle r0 = (org.lwjgl.util.Rectangle) r0
            r5 = r0
            r0 = r3
            int r0 = r0.x
            r1 = r5
            int r1 = r1.x
            if (r0 != r1) goto L3c
            r0 = r3
            int r0 = r0.y
            r1 = r5
            int r1 = r1.y
            if (r0 != r1) goto L3c
            r0 = r3
            int r0 = r0.width
            r1 = r5
            int r1 = r1.width
            if (r0 != r1) goto L3c
            r0 = r3
            int r0 = r0.height
            r1 = r5
            int r1 = r1.height
            if (r0 != r1) goto L3c
            r0 = 1
            goto L3d
        L3c:
            r0 = 0
        L3d:
            return r0
        L3e:
            r0 = r3
            r1 = r4
            boolean r0 = super.equals(r1)
            return r0
    }

    public java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = r0
            r1.<init>()
            r1 = r3
            java.lang.Class r1 = r1.getClass()
            java.lang.String r1 = r1.getName()
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = "[x="
            java.lang.StringBuilder r0 = r0.append(r1)
            r1 = r3
            int r1 = r1.x
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = ",y="
            java.lang.StringBuilder r0 = r0.append(r1)
            r1 = r3
            int r1 = r1.y
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = ",width="
            java.lang.StringBuilder r0 = r0.append(r1)
            r1 = r3
            int r1 = r1.width
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = ",height="
            java.lang.StringBuilder r0 = r0.append(r1)
            r1 = r3
            int r1 = r1.height
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = "]"
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    @Override // org.lwjgl.util.ReadableDimension
    public int getHeight() {
            r2 = this;
            r0 = r2
            int r0 = r0.height
            return r0
    }

    @Override // org.lwjgl.util.WritableDimension
    public void setHeight(int r4) {
            r3 = this;
            r0 = r3
            r1 = r4
            r0.height = r1
            return
    }

    @Override // org.lwjgl.util.ReadableDimension
    public int getWidth() {
            r2 = this;
            r0 = r2
            int r0 = r0.width
            return r0
    }

    @Override // org.lwjgl.util.WritableDimension
    public void setWidth(int r4) {
            r3 = this;
            r0 = r3
            r1 = r4
            r0.width = r1
            return
    }

    @Override // org.lwjgl.util.ReadablePoint
    public int getX() {
            r2 = this;
            r0 = r2
            int r0 = r0.x
            return r0
    }

    @Override // org.lwjgl.util.WritablePoint
    public void setX(int r4) {
            r3 = this;
            r0 = r3
            r1 = r4
            r0.x = r1
            return
    }

    @Override // org.lwjgl.util.ReadablePoint
    public int getY() {
            r2 = this;
            r0 = r2
            int r0 = r0.y
            return r0
    }

    @Override // org.lwjgl.util.WritablePoint
    public void setY(int r4) {
            r3 = this;
            r0 = r3
            r1 = r4
            r0.y = r1
            return
    }
}
