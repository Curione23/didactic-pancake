package org.lwjgl.util.vector;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/util/vector/Quaternion.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/util/vector/Quaternion.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/util/vector/Quaternion.class */
public class Quaternion extends org.lwjgl.util.vector.Vector implements org.lwjgl.util.vector.ReadableVector4f {
    private static final long serialVersionUID = 1;
    public float x;
    public float y;
    public float z;
    public float w;

    public Quaternion() {
            r2 = this;
            r0 = r2
            r0.<init>()
            r0 = r2
            org.lwjgl.util.vector.Quaternion r0 = r0.setIdentity()
            return
    }

    public Quaternion(org.lwjgl.util.vector.ReadableVector4f r4) {
            r3 = this;
            r0 = r3
            r0.<init>()
            r0 = r3
            r1 = r4
            org.lwjgl.util.vector.Quaternion r0 = r0.set(r1)
            return
    }

    public Quaternion(float r7, float r8, float r9, float r10) {
            r6 = this;
            r0 = r6
            r0.<init>()
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            r0.set(r1, r2, r3, r4)
            return
    }

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

    public void set(float r4, float r5, float r6, float r7) {
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
            r0 = r3
            r1 = r7
            r0.w = r1
            return
    }

    public org.lwjgl.util.vector.Quaternion set(org.lwjgl.util.vector.ReadableVector4f r4) {
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
            r1 = r4
            float r1 = r1.getW()
            r0.w = r1
            r0 = r3
            return r0
    }

    public org.lwjgl.util.vector.Quaternion setIdentity() {
            r2 = this;
            r0 = r2
            org.lwjgl.util.vector.Quaternion r0 = setIdentity(r0)
            return r0
    }

    public static org.lwjgl.util.vector.Quaternion setIdentity(org.lwjgl.util.vector.Quaternion r3) {
            r0 = r3
            r1 = 0
            r0.x = r1
            r0 = r3
            r1 = 0
            r0.y = r1
            r0 = r3
            r1 = 0
            r0.z = r1
            r0 = r3
            r1 = 1065353216(0x3f800000, float:1.0)
            r0.w = r1
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
            r1 = r4
            float r1 = r1.w
            r2 = r4
            float r2 = r2.w
            float r1 = r1 * r2
            float r0 = r0 + r1
            return r0
    }

    public static org.lwjgl.util.vector.Quaternion normalise(org.lwjgl.util.vector.Quaternion r7, org.lwjgl.util.vector.Quaternion r8) {
            r0 = 1065353216(0x3f800000, float:1.0)
            r1 = r7
            float r1 = r1.length()
            float r0 = r0 / r1
            r9 = r0
            r0 = r8
            if (r0 != 0) goto L13
            org.lwjgl.util.vector.Quaternion r0 = new org.lwjgl.util.vector.Quaternion
            r1 = r0
            r1.<init>()
            r8 = r0
        L13:
            r0 = r8
            r1 = r7
            float r1 = r1.x
            r2 = r9
            float r1 = r1 * r2
            r2 = r7
            float r2 = r2.y
            r3 = r9
            float r2 = r2 * r3
            r3 = r7
            float r3 = r3.z
            r4 = r9
            float r3 = r3 * r4
            r4 = r7
            float r4 = r4.w
            r5 = r9
            float r4 = r4 * r5
            r0.set(r1, r2, r3, r4)
            r0 = r8
            return r0
    }

    public org.lwjgl.util.vector.Quaternion normalise(org.lwjgl.util.vector.Quaternion r4) {
            r3 = this;
            r0 = r3
            r1 = r4
            org.lwjgl.util.vector.Quaternion r0 = normalise(r0, r1)
            return r0
    }

    public static float dot(org.lwjgl.util.vector.Quaternion r4, org.lwjgl.util.vector.Quaternion r5) {
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
            r1 = r4
            float r1 = r1.w
            r2 = r5
            float r2 = r2.w
            float r1 = r1 * r2
            float r0 = r0 + r1
            return r0
    }

    public org.lwjgl.util.vector.Quaternion negate(org.lwjgl.util.vector.Quaternion r4) {
            r3 = this;
            r0 = r3
            r1 = r4
            org.lwjgl.util.vector.Quaternion r0 = negate(r0, r1)
            return r0
    }

    public static org.lwjgl.util.vector.Quaternion negate(org.lwjgl.util.vector.Quaternion r3, org.lwjgl.util.vector.Quaternion r4) {
            r0 = r4
            if (r0 != 0) goto Lc
            org.lwjgl.util.vector.Quaternion r0 = new org.lwjgl.util.vector.Quaternion
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
            r1 = r3
            float r1 = r1.w
            r0.w = r1
            r0 = r4
            return r0
    }

    @Override // org.lwjgl.util.vector.Vector
    public org.lwjgl.util.vector.Vector negate() {
            r3 = this;
            r0 = r3
            r1 = r3
            org.lwjgl.util.vector.Quaternion r0 = negate(r0, r1)
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
            r1 = r4
            float r1 = r1.get()
            r0.w = r1
            r0 = r3
            return r0
    }

    @Override // org.lwjgl.util.vector.Vector
    public org.lwjgl.util.vector.Vector scale(float r5) {
            r4 = this;
            r0 = r5
            r1 = r4
            r2 = r4
            org.lwjgl.util.vector.Quaternion r0 = scale(r0, r1, r2)
            return r0
    }

    public static org.lwjgl.util.vector.Quaternion scale(float r4, org.lwjgl.util.vector.Quaternion r5, org.lwjgl.util.vector.Quaternion r6) {
            r0 = r6
            if (r0 != 0) goto Lc
            org.lwjgl.util.vector.Quaternion r0 = new org.lwjgl.util.vector.Quaternion
            r1 = r0
            r1.<init>()
            r6 = r0
        Lc:
            r0 = r6
            r1 = r5
            float r1 = r1.x
            r2 = r4
            float r1 = r1 * r2
            r0.x = r1
            r0 = r6
            r1 = r5
            float r1 = r1.y
            r2 = r4
            float r1 = r1 * r2
            r0.y = r1
            r0 = r6
            r1 = r5
            float r1 = r1.z
            r2 = r4
            float r1 = r1 * r2
            r0.z = r1
            r0 = r6
            r1 = r5
            float r1 = r1.w
            r2 = r4
            float r1 = r1 * r2
            r0.w = r1
            r0 = r6
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
            r0 = r4
            r1 = r3
            float r1 = r1.w
            java.nio.FloatBuffer r0 = r0.put(r1)
            r0 = r3
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

    public final void setX(float r4) {
            r3 = this;
            r0 = r3
            r1 = r4
            r0.x = r1
            return
    }

    public final void setY(float r4) {
            r3 = this;
            r0 = r3
            r1 = r4
            r0.y = r1
            return
    }

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

    public void setW(float r4) {
            r3 = this;
            r0 = r3
            r1 = r4
            r0.w = r1
            return
    }

    @Override // org.lwjgl.util.vector.ReadableVector4f
    public float getW() {
            r2 = this;
            r0 = r2
            float r0 = r0.w
            return r0
    }

    public java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = r0
            r1.<init>()
            java.lang.String r1 = "Quaternion: "
            java.lang.StringBuilder r0 = r0.append(r1)
            r1 = r3
            float r1 = r1.x
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = " "
            java.lang.StringBuilder r0 = r0.append(r1)
            r1 = r3
            float r1 = r1.y
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = " "
            java.lang.StringBuilder r0 = r0.append(r1)
            r1 = r3
            float r1 = r1.z
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = " "
            java.lang.StringBuilder r0 = r0.append(r1)
            r1 = r3
            float r1 = r1.w
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    public static org.lwjgl.util.vector.Quaternion mul(org.lwjgl.util.vector.Quaternion r8, org.lwjgl.util.vector.Quaternion r9, org.lwjgl.util.vector.Quaternion r10) {
            r0 = r10
            if (r0 != 0) goto Lc
            org.lwjgl.util.vector.Quaternion r0 = new org.lwjgl.util.vector.Quaternion
            r1 = r0
            r1.<init>()
            r10 = r0
        Lc:
            r0 = r10
            r1 = r8
            float r1 = r1.x
            r2 = r9
            float r2 = r2.w
            float r1 = r1 * r2
            r2 = r8
            float r2 = r2.w
            r3 = r9
            float r3 = r3.x
            float r2 = r2 * r3
            float r1 = r1 + r2
            r2 = r8
            float r2 = r2.y
            r3 = r9
            float r3 = r3.z
            float r2 = r2 * r3
            float r1 = r1 + r2
            r2 = r8
            float r2 = r2.z
            r3 = r9
            float r3 = r3.y
            float r2 = r2 * r3
            float r1 = r1 - r2
            r2 = r8
            float r2 = r2.y
            r3 = r9
            float r3 = r3.w
            float r2 = r2 * r3
            r3 = r8
            float r3 = r3.w
            r4 = r9
            float r4 = r4.y
            float r3 = r3 * r4
            float r2 = r2 + r3
            r3 = r8
            float r3 = r3.z
            r4 = r9
            float r4 = r4.x
            float r3 = r3 * r4
            float r2 = r2 + r3
            r3 = r8
            float r3 = r3.x
            r4 = r9
            float r4 = r4.z
            float r3 = r3 * r4
            float r2 = r2 - r3
            r3 = r8
            float r3 = r3.z
            r4 = r9
            float r4 = r4.w
            float r3 = r3 * r4
            r4 = r8
            float r4 = r4.w
            r5 = r9
            float r5 = r5.z
            float r4 = r4 * r5
            float r3 = r3 + r4
            r4 = r8
            float r4 = r4.x
            r5 = r9
            float r5 = r5.y
            float r4 = r4 * r5
            float r3 = r3 + r4
            r4 = r8
            float r4 = r4.y
            r5 = r9
            float r5 = r5.x
            float r4 = r4 * r5
            float r3 = r3 - r4
            r4 = r8
            float r4 = r4.w
            r5 = r9
            float r5 = r5.w
            float r4 = r4 * r5
            r5 = r8
            float r5 = r5.x
            r6 = r9
            float r6 = r6.x
            float r5 = r5 * r6
            float r4 = r4 - r5
            r5 = r8
            float r5 = r5.y
            r6 = r9
            float r6 = r6.y
            float r5 = r5 * r6
            float r4 = r4 - r5
            r5 = r8
            float r5 = r5.z
            r6 = r9
            float r6 = r6.z
            float r5 = r5 * r6
            float r4 = r4 - r5
            r0.set(r1, r2, r3, r4)
            r0 = r10
            return r0
    }

    public static org.lwjgl.util.vector.Quaternion mulInverse(org.lwjgl.util.vector.Quaternion r8, org.lwjgl.util.vector.Quaternion r9, org.lwjgl.util.vector.Quaternion r10) {
            r0 = r9
            float r0 = r0.lengthSquared()
            r11 = r0
            r0 = r11
            double r0 = (double) r0
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto L10
            r0 = r11
            goto L13
        L10:
            r0 = 1065353216(0x3f800000, float:1.0)
            r1 = r11
            float r0 = r0 / r1
        L13:
            r11 = r0
            r0 = r10
            if (r0 != 0) goto L20
            org.lwjgl.util.vector.Quaternion r0 = new org.lwjgl.util.vector.Quaternion
            r1 = r0
            r1.<init>()
            r10 = r0
        L20:
            r0 = r10
            r1 = r8
            float r1 = r1.x
            r2 = r9
            float r2 = r2.w
            float r1 = r1 * r2
            r2 = r8
            float r2 = r2.w
            r3 = r9
            float r3 = r3.x
            float r2 = r2 * r3
            float r1 = r1 - r2
            r2 = r8
            float r2 = r2.y
            r3 = r9
            float r3 = r3.z
            float r2 = r2 * r3
            float r1 = r1 - r2
            r2 = r8
            float r2 = r2.z
            r3 = r9
            float r3 = r3.y
            float r2 = r2 * r3
            float r1 = r1 + r2
            r2 = r11
            float r1 = r1 * r2
            r2 = r8
            float r2 = r2.y
            r3 = r9
            float r3 = r3.w
            float r2 = r2 * r3
            r3 = r8
            float r3 = r3.w
            r4 = r9
            float r4 = r4.y
            float r3 = r3 * r4
            float r2 = r2 - r3
            r3 = r8
            float r3 = r3.z
            r4 = r9
            float r4 = r4.x
            float r3 = r3 * r4
            float r2 = r2 - r3
            r3 = r8
            float r3 = r3.x
            r4 = r9
            float r4 = r4.z
            float r3 = r3 * r4
            float r2 = r2 + r3
            r3 = r11
            float r2 = r2 * r3
            r3 = r8
            float r3 = r3.z
            r4 = r9
            float r4 = r4.w
            float r3 = r3 * r4
            r4 = r8
            float r4 = r4.w
            r5 = r9
            float r5 = r5.z
            float r4 = r4 * r5
            float r3 = r3 - r4
            r4 = r8
            float r4 = r4.x
            r5 = r9
            float r5 = r5.y
            float r4 = r4 * r5
            float r3 = r3 - r4
            r4 = r8
            float r4 = r4.y
            r5 = r9
            float r5 = r5.x
            float r4 = r4 * r5
            float r3 = r3 + r4
            r4 = r11
            float r3 = r3 * r4
            r4 = r8
            float r4 = r4.w
            r5 = r9
            float r5 = r5.w
            float r4 = r4 * r5
            r5 = r8
            float r5 = r5.x
            r6 = r9
            float r6 = r6.x
            float r5 = r5 * r6
            float r4 = r4 + r5
            r5 = r8
            float r5 = r5.y
            r6 = r9
            float r6 = r6.y
            float r5 = r5 * r6
            float r4 = r4 + r5
            r5 = r8
            float r5 = r5.z
            r6 = r9
            float r6 = r6.z
            float r5 = r5 * r6
            float r4 = r4 + r5
            r5 = r11
            float r4 = r4 * r5
            r0.set(r1, r2, r3, r4)
            r0 = r10
            return r0
    }

    public final void setFromAxisAngle(org.lwjgl.util.vector.Vector4f r7) {
            r6 = this;
            r0 = r6
            r1 = r7
            float r1 = r1.x
            r0.x = r1
            r0 = r6
            r1 = r7
            float r1 = r1.y
            r0.y = r1
            r0 = r6
            r1 = r7
            float r1 = r1.z
            r0.z = r1
            r0 = r6
            float r0 = r0.x
            r1 = r6
            float r1 = r1.x
            float r0 = r0 * r1
            r1 = r6
            float r1 = r1.y
            r2 = r6
            float r2 = r2.y
            float r1 = r1 * r2
            float r0 = r0 + r1
            r1 = r6
            float r1 = r1.z
            r2 = r6
            float r2 = r2.z
            float r1 = r1 * r2
            float r0 = r0 + r1
            double r0 = (double) r0
            double r0 = java.lang.Math.sqrt(r0)
            float r0 = (float) r0
            r8 = r0
            r0 = 4602678819172646912(0x3fe0000000000000, double:0.5)
            r1 = r7
            float r1 = r1.w
            double r1 = (double) r1
            double r0 = r0 * r1
            double r0 = java.lang.Math.sin(r0)
            r1 = r8
            double r1 = (double) r1
            double r0 = r0 / r1
            float r0 = (float) r0
            r9 = r0
            r0 = r6
            r1 = r0
            float r1 = r1.x
            r2 = r9
            float r1 = r1 * r2
            r0.x = r1
            r0 = r6
            r1 = r0
            float r1 = r1.y
            r2 = r9
            float r1 = r1 * r2
            r0.y = r1
            r0 = r6
            r1 = r0
            float r1 = r1.z
            r2 = r9
            float r1 = r1 * r2
            r0.z = r1
            r0 = r6
            r1 = 4602678819172646912(0x3fe0000000000000, double:0.5)
            r2 = r7
            float r2 = r2.w
            double r2 = (double) r2
            double r1 = r1 * r2
            double r1 = java.lang.Math.cos(r1)
            float r1 = (float) r1
            r0.w = r1
            return
    }

    public final org.lwjgl.util.vector.Quaternion setFromMatrix(org.lwjgl.util.vector.Matrix4f r4) {
            r3 = this;
            r0 = r4
            r1 = r3
            org.lwjgl.util.vector.Quaternion r0 = setFromMatrix(r0, r1)
            return r0
    }

    public static org.lwjgl.util.vector.Quaternion setFromMatrix(org.lwjgl.util.vector.Matrix4f r11, org.lwjgl.util.vector.Quaternion r12) {
            r0 = r12
            r1 = r11
            float r1 = r1.m00
            r2 = r11
            float r2 = r2.m01
            r3 = r11
            float r3 = r3.m02
            r4 = r11
            float r4 = r4.m10
            r5 = r11
            float r5 = r5.m11
            r6 = r11
            float r6 = r6.m12
            r7 = r11
            float r7 = r7.m20
            r8 = r11
            float r8 = r8.m21
            r9 = r11
            float r9 = r9.m22
            org.lwjgl.util.vector.Quaternion r0 = r0.setFromMat(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            return r0
    }

    public final org.lwjgl.util.vector.Quaternion setFromMatrix(org.lwjgl.util.vector.Matrix3f r4) {
            r3 = this;
            r0 = r4
            r1 = r3
            org.lwjgl.util.vector.Quaternion r0 = setFromMatrix(r0, r1)
            return r0
    }

    public static org.lwjgl.util.vector.Quaternion setFromMatrix(org.lwjgl.util.vector.Matrix3f r11, org.lwjgl.util.vector.Quaternion r12) {
            r0 = r12
            r1 = r11
            float r1 = r1.m00
            r2 = r11
            float r2 = r2.m01
            r3 = r11
            float r3 = r3.m02
            r4 = r11
            float r4 = r4.m10
            r5 = r11
            float r5 = r5.m11
            r6 = r11
            float r6 = r6.m12
            r7 = r11
            float r7 = r7.m20
            r8 = r11
            float r8 = r8.m21
            r9 = r11
            float r9 = r9.m22
            org.lwjgl.util.vector.Quaternion r0 = r0.setFromMat(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            return r0
    }

    private org.lwjgl.util.vector.Quaternion setFromMat(float r6, float r7, float r8, float r9, float r10, float r11, float r12, float r13, float r14) {
            r5 = this;
            r0 = r6
            r1 = r10
            float r0 = r0 + r1
            r1 = r14
            float r0 = r0 + r1
            r16 = r0
            r0 = r16
            double r0 = (double) r0
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 < 0) goto L51
            r0 = r16
            double r0 = (double) r0
            r1 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            double r0 = r0 + r1
            double r0 = java.lang.Math.sqrt(r0)
            float r0 = (float) r0
            r15 = r0
            r0 = r5
            r1 = r15
            r2 = 1056964608(0x3f000000, float:0.5)
            float r1 = r1 * r2
            r0.w = r1
            r0 = 1056964608(0x3f000000, float:0.5)
            r1 = r15
            float r0 = r0 / r1
            r15 = r0
            r0 = r5
            r1 = r13
            r2 = r11
            float r1 = r1 - r2
            r2 = r15
            float r1 = r1 * r2
            r0.x = r1
            r0 = r5
            r1 = r8
            r2 = r12
            float r1 = r1 - r2
            r2 = r15
            float r1 = r1 * r2
            r0.y = r1
            r0 = r5
            r1 = r9
            r2 = r7
            float r1 = r1 - r2
            r2 = r15
            float r1 = r1 * r2
            r0.z = r1
            goto L139
        L51:
            r0 = r6
            r1 = r10
            float r0 = java.lang.Math.max(r0, r1)
            r1 = r14
            float r0 = java.lang.Math.max(r0, r1)
            r17 = r0
            r0 = r17
            r1 = r6
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto Laa
            r0 = r6
            r1 = r10
            r2 = r14
            float r1 = r1 + r2
            float r0 = r0 - r1
            double r0 = (double) r0
            r1 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            double r0 = r0 + r1
            double r0 = java.lang.Math.sqrt(r0)
            float r0 = (float) r0
            r15 = r0
            r0 = r5
            r1 = r15
            r2 = 1056964608(0x3f000000, float:0.5)
            float r1 = r1 * r2
            r0.x = r1
            r0 = 1056964608(0x3f000000, float:0.5)
            r1 = r15
            float r0 = r0 / r1
            r15 = r0
            r0 = r5
            r1 = r7
            r2 = r9
            float r1 = r1 + r2
            r2 = r15
            float r1 = r1 * r2
            r0.y = r1
            r0 = r5
            r1 = r12
            r2 = r8
            float r1 = r1 + r2
            r2 = r15
            float r1 = r1 * r2
            r0.z = r1
            r0 = r5
            r1 = r13
            r2 = r11
            float r1 = r1 - r2
            r2 = r15
            float r1 = r1 * r2
            r0.w = r1
            goto L139
        Laa:
            r0 = r17
            r1 = r10
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto Lf7
            r0 = r10
            r1 = r14
            r2 = r6
            float r1 = r1 + r2
            float r0 = r0 - r1
            double r0 = (double) r0
            r1 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            double r0 = r0 + r1
            double r0 = java.lang.Math.sqrt(r0)
            float r0 = (float) r0
            r15 = r0
            r0 = r5
            r1 = r15
            r2 = 1056964608(0x3f000000, float:0.5)
            float r1 = r1 * r2
            r0.y = r1
            r0 = 1056964608(0x3f000000, float:0.5)
            r1 = r15
            float r0 = r0 / r1
            r15 = r0
            r0 = r5
            r1 = r11
            r2 = r13
            float r1 = r1 + r2
            r2 = r15
            float r1 = r1 * r2
            r0.z = r1
            r0 = r5
            r1 = r7
            r2 = r9
            float r1 = r1 + r2
            r2 = r15
            float r1 = r1 * r2
            r0.x = r1
            r0 = r5
            r1 = r8
            r2 = r12
            float r1 = r1 - r2
            r2 = r15
            float r1 = r1 * r2
            r0.w = r1
            goto L139
        Lf7:
            r0 = r14
            r1 = r6
            r2 = r10
            float r1 = r1 + r2
            float r0 = r0 - r1
            double r0 = (double) r0
            r1 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            double r0 = r0 + r1
            double r0 = java.lang.Math.sqrt(r0)
            float r0 = (float) r0
            r15 = r0
            r0 = r5
            r1 = r15
            r2 = 1056964608(0x3f000000, float:0.5)
            float r1 = r1 * r2
            r0.z = r1
            r0 = 1056964608(0x3f000000, float:0.5)
            r1 = r15
            float r0 = r0 / r1
            r15 = r0
            r0 = r5
            r1 = r12
            r2 = r8
            float r1 = r1 + r2
            r2 = r15
            float r1 = r1 * r2
            r0.x = r1
            r0 = r5
            r1 = r11
            r2 = r13
            float r1 = r1 + r2
            r2 = r15
            float r1 = r1 * r2
            r0.y = r1
            r0 = r5
            r1 = r9
            r2 = r7
            float r1 = r1 - r2
            r2 = r15
            float r1 = r1 * r2
            r0.w = r1
        L139:
            r0 = r5
            return r0
    }
}
