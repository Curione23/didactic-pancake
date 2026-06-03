package org.lwjgl.util;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/util/Dimension.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/util/Dimension.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/util/Dimension.class */
public final class Dimension implements java.io.Serializable, org.lwjgl.util.ReadableDimension, org.lwjgl.util.WritableDimension {
    static final long serialVersionUID = 1;
    private int width;
    private int height;

    public Dimension() {
            r2 = this;
            r0 = r2
            r0.<init>()
            return
    }

    public Dimension(int r4, int r5) {
            r3 = this;
            r0 = r3
            r0.<init>()
            r0 = r3
            r1 = r4
            r0.width = r1
            r0 = r3
            r1 = r5
            r0.height = r1
            return
    }

    public Dimension(org.lwjgl.util.ReadableDimension r4) {
            r3 = this;
            r0 = r3
            r0.<init>()
            r0 = r3
            r1 = r4
            r0.setSize(r1)
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

    @Override // org.lwjgl.util.ReadableDimension
    public void getSize(org.lwjgl.util.WritableDimension r4) {
            r3 = this;
            r0 = r4
            r1 = r3
            r0.setSize(r1)
            return
    }

    public boolean equals(java.lang.Object r4) {
            r3 = this;
            r0 = r4
            boolean r0 = r0 instanceof org.lwjgl.util.ReadableDimension
            if (r0 == 0) goto L2c
            r0 = r4
            org.lwjgl.util.ReadableDimension r0 = (org.lwjgl.util.ReadableDimension) r0
            r5 = r0
            r0 = r3
            int r0 = r0.width
            r1 = r5
            int r1 = r1.getWidth()
            if (r0 != r1) goto L2a
            r0 = r3
            int r0 = r0.height
            r1 = r5
            int r1 = r1.getHeight()
            if (r0 != r1) goto L2a
            r0 = 1
            goto L2b
        L2a:
            r0 = 0
        L2b:
            return r0
        L2c:
            r0 = 0
            return r0
    }

    public int hashCode() {
            r4 = this;
            r0 = r4
            int r0 = r0.width
            r1 = r4
            int r1 = r1.height
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
            int r1 = r1.width
            int r0 = r0 + r1
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
            java.lang.String r1 = "[width="
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
}
