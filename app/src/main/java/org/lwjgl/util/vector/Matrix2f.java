package org.lwjgl.util.vector;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/util/vector/Matrix2f.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/util/vector/Matrix2f.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/util/vector/Matrix2f.class */
public class Matrix2f extends org.lwjgl.util.vector.Matrix implements java.io.Serializable {
    private static final long serialVersionUID = 1;
    public float m00;
    public float m01;
    public float m10;
    public float m11;

    public Matrix2f() {
            r2 = this;
            r0 = r2
            r0.<init>()
            r0 = r2
            org.lwjgl.util.vector.Matrix r0 = r0.setIdentity()
            return
    }

    public Matrix2f(org.lwjgl.util.vector.Matrix2f r4) {
            r3 = this;
            r0 = r3
            r0.<init>()
            r0 = r3
            r1 = r4
            org.lwjgl.util.vector.Matrix2f r0 = r0.load(r1)
            return
    }

    public org.lwjgl.util.vector.Matrix2f load(org.lwjgl.util.vector.Matrix2f r4) {
            r3 = this;
            r0 = r4
            r1 = r3
            org.lwjgl.util.vector.Matrix2f r0 = load(r0, r1)
            return r0
    }

    public static org.lwjgl.util.vector.Matrix2f load(org.lwjgl.util.vector.Matrix2f r3, org.lwjgl.util.vector.Matrix2f r4) {
            r0 = r4
            if (r0 != 0) goto Lc
            org.lwjgl.util.vector.Matrix2f r0 = new org.lwjgl.util.vector.Matrix2f
            r1 = r0
            r1.<init>()
            r4 = r0
        Lc:
            r0 = r4
            r1 = r3
            float r1 = r1.m00
            r0.m00 = r1
            r0 = r4
            r1 = r3
            float r1 = r1.m01
            r0.m01 = r1
            r0 = r4
            r1 = r3
            float r1 = r1.m10
            r0.m10 = r1
            r0 = r4
            r1 = r3
            float r1 = r1.m11
            r0.m11 = r1
            r0 = r4
            return r0
    }

    @Override // org.lwjgl.util.vector.Matrix
    public org.lwjgl.util.vector.Matrix load(java.nio.FloatBuffer r4) {
            r3 = this;
            r0 = r3
            r1 = r4
            float r1 = r1.get()
            r0.m00 = r1
            r0 = r3
            r1 = r4
            float r1 = r1.get()
            r0.m01 = r1
            r0 = r3
            r1 = r4
            float r1 = r1.get()
            r0.m10 = r1
            r0 = r3
            r1 = r4
            float r1 = r1.get()
            r0.m11 = r1
            r0 = r3
            return r0
    }

    @Override // org.lwjgl.util.vector.Matrix
    public org.lwjgl.util.vector.Matrix loadTranspose(java.nio.FloatBuffer r4) {
            r3 = this;
            r0 = r3
            r1 = r4
            float r1 = r1.get()
            r0.m00 = r1
            r0 = r3
            r1 = r4
            float r1 = r1.get()
            r0.m10 = r1
            r0 = r3
            r1 = r4
            float r1 = r1.get()
            r0.m01 = r1
            r0 = r3
            r1 = r4
            float r1 = r1.get()
            r0.m11 = r1
            r0 = r3
            return r0
    }

    @Override // org.lwjgl.util.vector.Matrix
    public org.lwjgl.util.vector.Matrix store(java.nio.FloatBuffer r4) {
            r3 = this;
            r0 = r4
            r1 = r3
            float r1 = r1.m00
            java.nio.FloatBuffer r0 = r0.put(r1)
            r0 = r4
            r1 = r3
            float r1 = r1.m01
            java.nio.FloatBuffer r0 = r0.put(r1)
            r0 = r4
            r1 = r3
            float r1 = r1.m10
            java.nio.FloatBuffer r0 = r0.put(r1)
            r0 = r4
            r1 = r3
            float r1 = r1.m11
            java.nio.FloatBuffer r0 = r0.put(r1)
            r0 = r3
            return r0
    }

    @Override // org.lwjgl.util.vector.Matrix
    public org.lwjgl.util.vector.Matrix storeTranspose(java.nio.FloatBuffer r4) {
            r3 = this;
            r0 = r4
            r1 = r3
            float r1 = r1.m00
            java.nio.FloatBuffer r0 = r0.put(r1)
            r0 = r4
            r1 = r3
            float r1 = r1.m10
            java.nio.FloatBuffer r0 = r0.put(r1)
            r0 = r4
            r1 = r3
            float r1 = r1.m01
            java.nio.FloatBuffer r0 = r0.put(r1)
            r0 = r4
            r1 = r3
            float r1 = r1.m11
            java.nio.FloatBuffer r0 = r0.put(r1)
            r0 = r3
            return r0
    }

    public static org.lwjgl.util.vector.Matrix2f add(org.lwjgl.util.vector.Matrix2f r4, org.lwjgl.util.vector.Matrix2f r5, org.lwjgl.util.vector.Matrix2f r6) {
            r0 = r6
            if (r0 != 0) goto Lc
            org.lwjgl.util.vector.Matrix2f r0 = new org.lwjgl.util.vector.Matrix2f
            r1 = r0
            r1.<init>()
            r6 = r0
        Lc:
            r0 = r6
            r1 = r4
            float r1 = r1.m00
            r2 = r5
            float r2 = r2.m00
            float r1 = r1 + r2
            r0.m00 = r1
            r0 = r6
            r1 = r4
            float r1 = r1.m01
            r2 = r5
            float r2 = r2.m01
            float r1 = r1 + r2
            r0.m01 = r1
            r0 = r6
            r1 = r4
            float r1 = r1.m10
            r2 = r5
            float r2 = r2.m10
            float r1 = r1 + r2
            r0.m10 = r1
            r0 = r6
            r1 = r4
            float r1 = r1.m11
            r2 = r5
            float r2 = r2.m11
            float r1 = r1 + r2
            r0.m11 = r1
            r0 = r6
            return r0
    }

    public static org.lwjgl.util.vector.Matrix2f sub(org.lwjgl.util.vector.Matrix2f r4, org.lwjgl.util.vector.Matrix2f r5, org.lwjgl.util.vector.Matrix2f r6) {
            r0 = r6
            if (r0 != 0) goto Lc
            org.lwjgl.util.vector.Matrix2f r0 = new org.lwjgl.util.vector.Matrix2f
            r1 = r0
            r1.<init>()
            r6 = r0
        Lc:
            r0 = r6
            r1 = r4
            float r1 = r1.m00
            r2 = r5
            float r2 = r2.m00
            float r1 = r1 - r2
            r0.m00 = r1
            r0 = r6
            r1 = r4
            float r1 = r1.m01
            r2 = r5
            float r2 = r2.m01
            float r1 = r1 - r2
            r0.m01 = r1
            r0 = r6
            r1 = r4
            float r1 = r1.m10
            r2 = r5
            float r2 = r2.m10
            float r1 = r1 - r2
            r0.m10 = r1
            r0 = r6
            r1 = r4
            float r1 = r1.m11
            r2 = r5
            float r2 = r2.m11
            float r1 = r1 - r2
            r0.m11 = r1
            r0 = r6
            return r0
    }

    public static org.lwjgl.util.vector.Matrix2f mul(org.lwjgl.util.vector.Matrix2f r4, org.lwjgl.util.vector.Matrix2f r5, org.lwjgl.util.vector.Matrix2f r6) {
            r0 = r6
            if (r0 != 0) goto Lc
            org.lwjgl.util.vector.Matrix2f r0 = new org.lwjgl.util.vector.Matrix2f
            r1 = r0
            r1.<init>()
            r6 = r0
        Lc:
            r0 = r4
            float r0 = r0.m00
            r1 = r5
            float r1 = r1.m00
            float r0 = r0 * r1
            r1 = r4
            float r1 = r1.m10
            r2 = r5
            float r2 = r2.m01
            float r1 = r1 * r2
            float r0 = r0 + r1
            r7 = r0
            r0 = r4
            float r0 = r0.m01
            r1 = r5
            float r1 = r1.m00
            float r0 = r0 * r1
            r1 = r4
            float r1 = r1.m11
            r2 = r5
            float r2 = r2.m01
            float r1 = r1 * r2
            float r0 = r0 + r1
            r8 = r0
            r0 = r4
            float r0 = r0.m00
            r1 = r5
            float r1 = r1.m10
            float r0 = r0 * r1
            r1 = r4
            float r1 = r1.m10
            r2 = r5
            float r2 = r2.m11
            float r1 = r1 * r2
            float r0 = r0 + r1
            r9 = r0
            r0 = r4
            float r0 = r0.m01
            r1 = r5
            float r1 = r1.m10
            float r0 = r0 * r1
            r1 = r4
            float r1 = r1.m11
            r2 = r5
            float r2 = r2.m11
            float r1 = r1 * r2
            float r0 = r0 + r1
            r10 = r0
            r0 = r6
            r1 = r7
            r0.m00 = r1
            r0 = r6
            r1 = r8
            r0.m01 = r1
            r0 = r6
            r1 = r9
            r0.m10 = r1
            r0 = r6
            r1 = r10
            r0.m11 = r1
            r0 = r6
            return r0
    }

    public static org.lwjgl.util.vector.Vector2f transform(org.lwjgl.util.vector.Matrix2f r4, org.lwjgl.util.vector.Vector2f r5, org.lwjgl.util.vector.Vector2f r6) {
            r0 = r6
            if (r0 != 0) goto Lc
            org.lwjgl.util.vector.Vector2f r0 = new org.lwjgl.util.vector.Vector2f
            r1 = r0
            r1.<init>()
            r6 = r0
        Lc:
            r0 = r4
            float r0 = r0.m00
            r1 = r5
            float r1 = r1.x
            float r0 = r0 * r1
            r1 = r4
            float r1 = r1.m10
            r2 = r5
            float r2 = r2.y
            float r1 = r1 * r2
            float r0 = r0 + r1
            r7 = r0
            r0 = r4
            float r0 = r0.m01
            r1 = r5
            float r1 = r1.x
            float r0 = r0 * r1
            r1 = r4
            float r1 = r1.m11
            r2 = r5
            float r2 = r2.y
            float r1 = r1 * r2
            float r0 = r0 + r1
            r8 = r0
            r0 = r6
            r1 = r7
            r0.x = r1
            r0 = r6
            r1 = r8
            r0.y = r1
            r0 = r6
            return r0
    }

    @Override // org.lwjgl.util.vector.Matrix
    public org.lwjgl.util.vector.Matrix transpose() {
            r3 = this;
            r0 = r3
            r1 = r3
            org.lwjgl.util.vector.Matrix2f r0 = r0.transpose(r1)
            return r0
    }

    public org.lwjgl.util.vector.Matrix2f transpose(org.lwjgl.util.vector.Matrix2f r4) {
            r3 = this;
            r0 = r3
            r1 = r4
            org.lwjgl.util.vector.Matrix2f r0 = transpose(r0, r1)
            return r0
    }

    public static org.lwjgl.util.vector.Matrix2f transpose(org.lwjgl.util.vector.Matrix2f r3, org.lwjgl.util.vector.Matrix2f r4) {
            r0 = r4
            if (r0 != 0) goto Lc
            org.lwjgl.util.vector.Matrix2f r0 = new org.lwjgl.util.vector.Matrix2f
            r1 = r0
            r1.<init>()
            r4 = r0
        Lc:
            r0 = r3
            float r0 = r0.m10
            r5 = r0
            r0 = r3
            float r0 = r0.m01
            r6 = r0
            r0 = r4
            r1 = r5
            r0.m01 = r1
            r0 = r4
            r1 = r6
            r0.m10 = r1
            r0 = r4
            return r0
    }

    @Override // org.lwjgl.util.vector.Matrix
    public org.lwjgl.util.vector.Matrix invert() {
            r3 = this;
            r0 = r3
            r1 = r3
            org.lwjgl.util.vector.Matrix2f r0 = invert(r0, r1)
            return r0
    }

    public static org.lwjgl.util.vector.Matrix2f invert(org.lwjgl.util.vector.Matrix2f r3, org.lwjgl.util.vector.Matrix2f r4) {
            r0 = r3
            float r0 = r0.determinant()
            r5 = r0
            r0 = r5
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto L57
            r0 = r4
            if (r0 != 0) goto L17
            org.lwjgl.util.vector.Matrix2f r0 = new org.lwjgl.util.vector.Matrix2f
            r1 = r0
            r1.<init>()
            r4 = r0
        L17:
            r0 = 1065353216(0x3f800000, float:1.0)
            r1 = r5
            float r0 = r0 / r1
            r6 = r0
            r0 = r3
            float r0 = r0.m11
            r1 = r6
            float r0 = r0 * r1
            r7 = r0
            r0 = r3
            float r0 = r0.m01
            float r0 = -r0
            r1 = r6
            float r0 = r0 * r1
            r8 = r0
            r0 = r3
            float r0 = r0.m00
            r1 = r6
            float r0 = r0 * r1
            r9 = r0
            r0 = r3
            float r0 = r0.m10
            float r0 = -r0
            r1 = r6
            float r0 = r0 * r1
            r10 = r0
            r0 = r4
            r1 = r7
            r0.m00 = r1
            r0 = r4
            r1 = r8
            r0.m01 = r1
            r0 = r4
            r1 = r10
            r0.m10 = r1
            r0 = r4
            r1 = r9
            r0.m11 = r1
            r0 = r4
            return r0
        L57:
            r0 = 0
            return r0
    }

    public java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = r0
            r1.<init>()
            r4 = r0
            r0 = r4
            r1 = r3
            float r1 = r1.m00
            java.lang.StringBuilder r0 = r0.append(r1)
            r1 = 32
            java.lang.StringBuilder r0 = r0.append(r1)
            r1 = r3
            float r1 = r1.m10
            java.lang.StringBuilder r0 = r0.append(r1)
            r1 = 32
            java.lang.StringBuilder r0 = r0.append(r1)
            r1 = 10
            java.lang.StringBuilder r0 = r0.append(r1)
            r0 = r4
            r1 = r3
            float r1 = r1.m01
            java.lang.StringBuilder r0 = r0.append(r1)
            r1 = 32
            java.lang.StringBuilder r0 = r0.append(r1)
            r1 = r3
            float r1 = r1.m11
            java.lang.StringBuilder r0 = r0.append(r1)
            r1 = 32
            java.lang.StringBuilder r0 = r0.append(r1)
            r1 = 10
            java.lang.StringBuilder r0 = r0.append(r1)
            r0 = r4
            java.lang.String r0 = r0.toString()
            return r0
    }

    @Override // org.lwjgl.util.vector.Matrix
    public org.lwjgl.util.vector.Matrix negate() {
            r3 = this;
            r0 = r3
            r1 = r3
            org.lwjgl.util.vector.Matrix2f r0 = r0.negate(r1)
            return r0
    }

    public org.lwjgl.util.vector.Matrix2f negate(org.lwjgl.util.vector.Matrix2f r4) {
            r3 = this;
            r0 = r3
            r1 = r4
            org.lwjgl.util.vector.Matrix2f r0 = negate(r0, r1)
            return r0
    }

    public static org.lwjgl.util.vector.Matrix2f negate(org.lwjgl.util.vector.Matrix2f r3, org.lwjgl.util.vector.Matrix2f r4) {
            r0 = r4
            if (r0 != 0) goto Lc
            org.lwjgl.util.vector.Matrix2f r0 = new org.lwjgl.util.vector.Matrix2f
            r1 = r0
            r1.<init>()
            r4 = r0
        Lc:
            r0 = r4
            r1 = r3
            float r1 = r1.m00
            float r1 = -r1
            r0.m00 = r1
            r0 = r4
            r1 = r3
            float r1 = r1.m01
            float r1 = -r1
            r0.m01 = r1
            r0 = r4
            r1 = r3
            float r1 = r1.m10
            float r1 = -r1
            r0.m10 = r1
            r0 = r4
            r1 = r3
            float r1 = r1.m11
            float r1 = -r1
            r0.m11 = r1
            r0 = r4
            return r0
    }

    @Override // org.lwjgl.util.vector.Matrix
    public org.lwjgl.util.vector.Matrix setIdentity() {
            r2 = this;
            r0 = r2
            org.lwjgl.util.vector.Matrix2f r0 = setIdentity(r0)
            return r0
    }

    public static org.lwjgl.util.vector.Matrix2f setIdentity(org.lwjgl.util.vector.Matrix2f r3) {
            r0 = r3
            r1 = 1065353216(0x3f800000, float:1.0)
            r0.m00 = r1
            r0 = r3
            r1 = 0
            r0.m01 = r1
            r0 = r3
            r1 = 0
            r0.m10 = r1
            r0 = r3
            r1 = 1065353216(0x3f800000, float:1.0)
            r0.m11 = r1
            r0 = r3
            return r0
    }

    @Override // org.lwjgl.util.vector.Matrix
    public org.lwjgl.util.vector.Matrix setZero() {
            r2 = this;
            r0 = r2
            org.lwjgl.util.vector.Matrix2f r0 = setZero(r0)
            return r0
    }

    public static org.lwjgl.util.vector.Matrix2f setZero(org.lwjgl.util.vector.Matrix2f r3) {
            r0 = r3
            r1 = 0
            r0.m00 = r1
            r0 = r3
            r1 = 0
            r0.m01 = r1
            r0 = r3
            r1 = 0
            r0.m10 = r1
            r0 = r3
            r1 = 0
            r0.m11 = r1
            r0 = r3
            return r0
    }

    @Override // org.lwjgl.util.vector.Matrix
    public float determinant() {
            r4 = this;
            r0 = r4
            float r0 = r0.m00
            r1 = r4
            float r1 = r1.m11
            float r0 = r0 * r1
            r1 = r4
            float r1 = r1.m01
            r2 = r4
            float r2 = r2.m10
            float r1 = r1 * r2
            float r0 = r0 - r1
            return r0
    }
}
