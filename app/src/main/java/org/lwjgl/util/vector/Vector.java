package org.lwjgl.util.vector;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/util/vector/Vector.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/util/vector/Vector.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/util/vector/Vector.class */
public abstract class Vector implements java.io.Serializable, org.lwjgl.util.vector.ReadableVector {
    protected Vector() {
            r2 = this;
            r0 = r2
            r0.<init>()
            return
    }

    @Override // org.lwjgl.util.vector.ReadableVector
    public final float length() {
            r3 = this;
            r0 = r3
            float r0 = r0.lengthSquared()
            double r0 = (double) r0
            double r0 = java.lang.Math.sqrt(r0)
            float r0 = (float) r0
            return r0
    }

    public abstract float lengthSquared();

    public abstract org.lwjgl.util.vector.Vector load(java.nio.FloatBuffer r1);

    public abstract org.lwjgl.util.vector.Vector negate();

    public final org.lwjgl.util.vector.Vector normalise() {
            r4 = this;
            r0 = r4
            float r0 = r0.length()
            r5 = r0
            r0 = r5
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto L15
            r0 = 1065353216(0x3f800000, float:1.0)
            r1 = r5
            float r0 = r0 / r1
            r6 = r0
            r0 = r4
            r1 = r6
            org.lwjgl.util.vector.Vector r0 = r0.scale(r1)
            return r0
        L15:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r1 = r0
            java.lang.String r2 = "Zero length vector"
            r1.<init>(r2)
            throw r0
    }

    public abstract org.lwjgl.util.vector.Vector store(java.nio.FloatBuffer r1);

    public abstract org.lwjgl.util.vector.Vector scale(float r1);
}
