package org.lwjgl.util;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/util/Point.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/util/Point.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/util/Point.class */
public final class Point implements org.lwjgl.util.ReadablePoint, org.lwjgl.util.WritablePoint, java.io.Serializable {
    static final long serialVersionUID = 1;
    private int x;
    private int y;

    public Point() {
            r2 = this;
            r0 = r2
            r0.<init>()
            return
    }

    public Point(int r5, int r6) {
            r4 = this;
            r0 = r4
            r0.<init>()
            r0 = r4
            r1 = r5
            r2 = r6
            r0.setLocation(r1, r2)
            return
    }

    public Point(org.lwjgl.util.ReadablePoint r4) {
            r3 = this;
            r0 = r3
            r0.<init>()
            r0 = r3
            r1 = r4
            r0.setLocation(r1)
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

    @Override // org.lwjgl.util.WritablePoint
    public void setX(int r4) {
            r3 = this;
            r0 = r3
            r1 = r4
            r0.x = r1
            return
    }

    @Override // org.lwjgl.util.WritablePoint
    public void setY(int r4) {
            r3 = this;
            r0 = r3
            r1 = r4
            r0.y = r1
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

    public boolean equals(java.lang.Object r4) {
            r3 = this;
            r0 = r4
            boolean r0 = r0 instanceof org.lwjgl.util.Point
            if (r0 == 0) goto L28
            r0 = r4
            org.lwjgl.util.Point r0 = (org.lwjgl.util.Point) r0
            r5 = r0
            r0 = r3
            int r0 = r0.x
            r1 = r5
            int r1 = r1.x
            if (r0 != r1) goto L26
            r0 = r3
            int r0 = r0.y
            r1 = r5
            int r1 = r1.y
            if (r0 != r1) goto L26
            r0 = 1
            goto L27
        L26:
            r0 = 0
        L27:
            return r0
        L28:
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
            java.lang.String r1 = "]"
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    public int hashCode() {
            r4 = this;
            r0 = r4
            int r0 = r0.x
            r1 = r4
            int r1 = r1.y
            int r0 = r0 + r1
            r5 = r0
            r0 = r5
            r1 = r5
            r2 = 1
            int r1 = r1 + r2
            int r0 = r0 * r1
            r1 = 2
            int r0 = r0 / r1
            r1 = r4
            int r1 = r1.x
            int r0 = r0 + r1
            return r0
    }

    @Override // org.lwjgl.util.ReadablePoint
    public int getX() {
            r2 = this;
            r0 = r2
            int r0 = r0.x
            return r0
    }

    @Override // org.lwjgl.util.ReadablePoint
    public int getY() {
            r2 = this;
            r0 = r2
            int r0 = r0.y
            return r0
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
}
