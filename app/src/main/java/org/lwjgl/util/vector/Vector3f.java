package org.lwjgl.util.vector;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/util/vector/Vector3f.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/util/vector/Vector3f.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/util/vector/Vector3f.class */
public class Vector3f extends org.lwjgl.util.vector.Vector implements java.io.Serializable, org.lwjgl.util.vector.ReadableVector3f, org.lwjgl.util.vector.WritableVector3f {
    private static final long serialVersionUID = 1;
    public float x;
    public float y;
    public float z;

    public Vector3f() {
            r2 = this;
            r0 = r2
            r0.<init>()
            return
    }

    public Vector3f(org.lwjgl.util.vector.ReadableVector3f r4) {
            r3 = this;
            r0 = r3
            r0.<init>()
            r0 = r3
            r1 = r4
            org.lwjgl.util.vector.Vector3f r0 = r0.set(r1)
            return
    }

    public Vector3f(float r6, float r7, float r8) {
            r5 = this;
            r0 = r5
            r0.<init>()
            r0 = r5
            r1 = r6
            r2 = r7
            r3 = r8
            r0.set(r1, r2, r3)
            return
    }

    @Override // org.lwjgl.util.vector.WritableVector2f
    public void set(float r4, float r5) {
            r3 = this;
            r0 = r3
            r1 = r4
            r0.x = r1
            r0 = r3
            r1 = r5
            r0.y = r1
            return
    }

    @Override // org.lwjgl.util.vector.WritableVector3f
    public void set(float r4, float r5, float r6) {
            r3 = this;
            r0 = r3
            r1 = r4
            r0.x = r1
            r0 = r3
            r1 = r5
            r0.y = r1
            r0 = r3
            r1 = r6
            r0.z = r1
            return
    }

    public org.lwjgl.util.vector.Vector3f set(org.lwjgl.util.vector.ReadableVector3f r4) {
            r3 = this;
            r0 = r3
            r1 = r4
            float r1 = r1.getX()
            r0.x = r1
            r0 = r3
            r1 = r4
            float r1 = r1.getY()
            r0.y = r1
            r0 = r3
            r1 = r4
            float r1 = r1.getZ()
            r0.z = r1
            r0 = r3
            return r0
    }

    @Override // org.lwjgl.util.vector.Vector, org.lwjgl.util.vector.ReadableVector
    public float lengthSquared() {
            r4 = this;
            r0 = r4
            float r0 = r0.x
            r1 = r4
            float r1 = r1.x
            float r0 = r0 * r1
            r1 = r4
            float r1 = r1.y
            r2 = r4
            float r2 = r2.y
            float r1 = r1 * r2
            float r0 = r0 + r1
            r1 = r4
            float r1 = r1.z
            r2 = r4
            float r2 = r2.z
            float r1 = r1 * r2
            float r0 = r0 + r1
            return r0
    }

    public org.lwjgl.util.vector.Vector3f translate(float r5, float r6, float r7) {
            r4 = this;
            r0 = r4
            r1 = r0
            float r1 = r1.x
            r2 = r5
            float r1 = r1 + r2
            r0.x = r1
            r0 = r4
            r1 = r0
            float r1 = r1.y
            r2 = r6
            float r1 = r1 + r2
            r0.y = r1
            r0 = r4
            r1 = r0
            float r1 = r1.z
            r2 = r7
            float r1 = r1 + r2
            r0.z = r1
            r0 = r4
            return r0
    }

    public static org.lwjgl.util.vector.Vector3f add(org.lwjgl.util.vector.Vector3f r7, org.lwjgl.util.vector.Vector3f r8, org.lwjgl.util.vector.Vector3f r9) {
            r0 = r9
            if (r0 != 0) goto L27
            org.lwjgl.util.vector.Vector3f r0 = new org.lwjgl.util.vector.Vector3f
            r1 = r0
            r2 = r7
            float r2 = r2.x
            r3 = r8
            float r3 = r3.x
            float r2 = r2 + r3
            r3 = r7
            float r3 = r3.y
            r4 = r8
            float r4 = r4.y
            float r3 = r3 + r4
            r4 = r7
            float r4 = r4.z
            r5 = r8
            float r5 = r5.z
            float r4 = r4 + r5
            r1.<init>(r2, r3, r4)
            return r0
        L27:
            r0 = r9
            r1 = r7
            float r1 = r1.x
            r2 = r8
            float r2 = r2.x
            float r1 = r1 + r2
            r2 = r7
            float r2 = r2.y
            r3 = r8
            float r3 = r3.y
            float r2 = r2 + r3
            r3 = r7
            float r3 = r3.z
            r4 = r8
            float r4 = r4.z
            float r3 = r3 + r4
            r0.set(r1, r2, r3)
            r0 = r9
            return r0
    }

    public static org.lwjgl.util.vector.Vector3f sub(org.lwjgl.util.vector.Vector3f r7, org.lwjgl.util.vector.Vector3f r8, org.lwjgl.util.vector.Vector3f r9) {
            r0 = r9
            if (r0 != 0) goto L27
            org.lwjgl.util.vector.Vector3f r0 = new org.lwjgl.util.vector.Vector3f
            r1 = r0
            r2 = r7
            float r2 = r2.x
            r3 = r8
            float r3 = r3.x
            float r2 = r2 - r3
            r3 = r7
            float r3 = r3.y
            r4 = r8
            float r4 = r4.y
            float r3 = r3 - r4
            r4 = r7
            float r4 = r4.z
            r5 = r8
            float r5 = r5.z
            float r4 = r4 - r5
            r1.<init>(r2, r3, r4)
            return r0
        L27:
            r0 = r9
            r1 = r7
            float r1 = r1.x
            r2 = r8
            float r2 = r2.x
            float r1 = r1 - r2
            r2 = r7
            float r2 = r2.y
            r3 = r8
            float r3 = r3.y
            float r2 = r2 - r3
            r3 = r7
            float r3 = r3.z
            r4 = r8
            float r4 = r4.z
            float r3 = r3 - r4
            r0.set(r1, r2, r3)
            r0 = r9
            return r0
    }

    public static org.lwjgl.util.vector.Vector3f cross(org.lwjgl.util.vector.Vector3f r7, org.lwjgl.util.vector.Vector3f r8, org.lwjgl.util.vector.Vector3f r9) {
            r0 = r9
            if (r0 != 0) goto Lc
            org.lwjgl.util.vector.Vector3f r0 = new org.lwjgl.util.vector.Vector3f
            r1 = r0
            r1.<init>()
            r9 = r0
        Lc:
            r0 = r9
            r1 = r7
            float r1 = r1.y
            r2 = r8
            float r2 = r2.z
            float r1 = r1 * r2
            r2 = r7
            float r2 = r2.z
            r3 = r8
            float r3 = r3.y
            float r2 = r2 * r3
            float r1 = r1 - r2
            r2 = r8
            float r2 = r2.x
            r3 = r7
            float r3 = r3.z
            float r2 = r2 * r3
            r3 = r8
            float r3 = r3.z
            r4 = r7
            float r4 = r4.x
            float r3 = r3 * r4
            float r2 = r2 - r3
            r3 = r7
            float r3 = r3.x
            r4 = r8
            float r4 = r4.y
            float r3 = r3 * r4
            r4 = r7
            float r4 = r4.y
            r5 = r8
            float r5 = r5.x
            float r4 = r4 * r5
            float r3 = r3 - r4
            r0.set(r1, r2, r3)
            r0 = r9
            return r0
    }

    @Override // org.lwjgl.util.vector.Vector
    public org.lwjgl.util.vector.Vector negate() {
            r3 = this;
            r0 = r3
            r1 = r3
            float r1 = r1.x
            float r1 = -r1
            r0.x = r1
            r0 = r3
            r1 = r3
            float r1 = r1.y
            float r1 = -r1
            r0.y = r1
            r0 = r3
            r1 = r3
            float r1 = r1.z
            float r1 = -r1
            r0.z = r1
            r0 = r3
            return r0
    }

    public org.lwjgl.util.vector.Vector3f negate(org.lwjgl.util.vector.Vector3f r4) {
            r3 = this;
            r0 = r4
            if (r0 != 0) goto Lc
            org.lwjgl.util.vector.Vector3f r0 = new org.lwjgl.util.vector.Vector3f
            r1 = r0
            r1.<init>()
            r4 = r0
        Lc:
            r0 = r4
            r1 = r3
            float r1 = r1.x
            float r1 = -r1
            r0.x = r1
            r0 = r4
            r1 = r3
            float r1 = r1.y
            float r1 = -r1
            r0.y = r1
            r0 = r4
            r1 = r3
            float r1 = r1.z
            float r1 = -r1
            r0.z = r1
            r0 = r4
            return r0
    }

    public org.lwjgl.util.vector.Vector3f normalise(org.lwjgl.util.vector.Vector3f r8) {
            r7 = this;
            r0 = r7
            float r0 = r0.length()
            r9 = r0
            r0 = r8
            if (r0 != 0) goto L26
            org.lwjgl.util.vector.Vector3f r0 = new org.lwjgl.util.vector.Vector3f
            r1 = r0
            r2 = r7
            float r2 = r2.x
            r3 = r9
            float r2 = r2 / r3
            r3 = r7
            float r3 = r3.y
            r4 = r9
            float r3 = r3 / r4
            r4 = r7
            float r4 = r4.z
            r5 = r9
            float r4 = r4 / r5
            r1.<init>(r2, r3, r4)
            r8 = r0
            goto L3c
        L26:
            r0 = r8
            r1 = r7
            float r1 = r1.x
            r2 = r9
            float r1 = r1 / r2
            r2 = r7
            float r2 = r2.y
            r3 = r9
            float r2 = r2 / r3
            r3 = r7
            float r3 = r3.z
            r4 = r9
            float r3 = r3 / r4
            r0.set(r1, r2, r3)
        L3c:
            r0 = r8
            return r0
    }

    public static float dot(org.lwjgl.util.vector.Vector3f r4, org.lwjgl.util.vector.Vector3f r5) {
            r0 = r4
            float r0 = r0.x
            r1 = r5
            float r1 = r1.x
            float r0 = r0 * r1
            r1 = r4
            float r1 = r1.y
            r2 = r5
            float r2 = r2.y
            float r1 = r1 * r2
            float r0 = r0 + r1
            r1 = r4
            float r1 = r1.z
            r2 = r5
            float r2 = r2.z
            float r1 = r1 * r2
            float r0 = r0 + r1
            return r0
    }

    public static float angle(org.lwjgl.util.vector.Vector3f r4, org.lwjgl.util.vector.Vector3f r5) {
            r0 = r4
            r1 = r5
            float r0 = dot(r0, r1)
            r1 = r4
            float r1 = r1.length()
            r2 = r5
            float r2 = r2.length()
            float r1 = r1 * r2
            float r0 = r0 / r1
            r6 = r0
            r0 = r6
            r1 = -1082130432(0xffffffffbf800000, float:-1.0)
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 >= 0) goto L1d
            r0 = -1082130432(0xffffffffbf800000, float:-1.0)
            r6 = r0
            goto L25
        L1d:
            r0 = r6
            r1 = 1065353216(0x3f800000, float:1.0)
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 <= 0) goto L25
            r0 = 1065353216(0x3f800000, float:1.0)
            r6 = r0
        L25:
            r0 = r6
            double r0 = (double) r0
            double r0 = java.lang.Math.acos(r0)
            float r0 = (float) r0
            return r0
    }

    @Override // org.lwjgl.util.vector.Vector
    public org.lwjgl.util.vector.Vector load(java.nio.FloatBuffer r4) {
            r3 = this;
            r0 = r3
            r1 = r4
            float r1 = r1.get()
            r0.x = r1
            r0 = r3
            r1 = r4
            float r1 = r1.get()
            r0.y = r1
            r0 = r3
            r1 = r4
            float r1 = r1.get()
            r0.z = r1
            r0 = r3
            return r0
    }

    @Override // org.lwjgl.util.vector.Vector
    public org.lwjgl.util.vector.Vector scale(float r5) {
            r4 = this;
            r0 = r4
            r1 = r0
            float r1 = r1.x
            r2 = r5
            float r1 = r1 * r2
            r0.x = r1
            r0 = r4
            r1 = r0
            float r1 = r1.y
            r2 = r5
            float r1 = r1 * r2
            r0.y = r1
            r0 = r4
            r1 = r0
            float r1 = r1.z
            r2 = r5
            float r1 = r1 * r2
            r0.z = r1
            r0 = r4
            return r0
    }

    @Override // org.lwjgl.util.vector.Vector, org.lwjgl.util.vector.ReadableVector
    public org.lwjgl.util.vector.Vector store(java.nio.FloatBuffer r4) {
            r3 = this;
            r0 = r4
            r1 = r3
            float r1 = r1.x
            java.nio.FloatBuffer r0 = r0.put(r1)
            r0 = r4
            r1 = r3
            float r1 = r1.y
            java.nio.FloatBuffer r0 = r0.put(r1)
            r0 = r4
            r1 = r3
            float r1 = r1.z
            java.nio.FloatBuffer r0 = r0.put(r1)
            r0 = r3
            return r0
    }

    public java.lang.String toString() {
            r4 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = r0
            r2 = 64
            r1.<init>(r2)
            r5 = r0
            r0 = r5
            java.lang.String r1 = "Vector3f["
            java.lang.StringBuilder r0 = r0.append(r1)
            r0 = r5
            r1 = r4
            float r1 = r1.x
            java.lang.StringBuilder r0 = r0.append(r1)
            r0 = r5
            java.lang.String r1 = ", "
            java.lang.StringBuilder r0 = r0.append(r1)
            r0 = r5
            r1 = r4
            float r1 = r1.y
            java.lang.StringBuilder r0 = r0.append(r1)
            r0 = r5
            java.lang.String r1 = ", "
            java.lang.StringBuilder r0 = r0.append(r1)
            r0 = r5
            r1 = r4
            float r1 = r1.z
            java.lang.StringBuilder r0 = r0.append(r1)
            r0 = r5
            r1 = 93
            java.lang.StringBuilder r0 = r0.append(r1)
            r0 = r5
            java.lang.String r0 = r0.toString()
            return r0
    }

    @Override // org.lwjgl.util.vector.ReadableVector2f
    public final float getX() {
            r2 = this;
            r0 = r2
            float r0 = r0.x
            return r0
    }

    @Override // org.lwjgl.util.vector.ReadableVector2f
    public final float getY() {
            r2 = this;
            r0 = r2
            float r0 = r0.y
            return r0
    }

    @Override // org.lwjgl.util.vector.WritableVector2f
    public final void setX(float r4) {
            r3 = this;
            r0 = r3
            r1 = r4
            r0.x = r1
            return
    }

    @Override // org.lwjgl.util.vector.WritableVector2f
    public final void setY(float r4) {
            r3 = this;
            r0 = r3
            r1 = r4
            r0.y = r1
            return
    }

    @Override // org.lwjgl.util.vector.WritableVector3f
    public void setZ(float r4) {
            r3 = this;
            r0 = r3
            r1 = r4
            r0.z = r1
            return
    }

    @Override // org.lwjgl.util.vector.ReadableVector3f
    public float getZ() {
            r2 = this;
            r0 = r2
            float r0 = r0.z
            return r0
    }
}
