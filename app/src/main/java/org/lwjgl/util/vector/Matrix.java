package org.lwjgl.util.vector;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/util/vector/Matrix.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/util/vector/Matrix.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/util/vector/Matrix.class */
public abstract class Matrix implements java.io.Serializable {
    protected Matrix() {
            r2 = this;
            r0 = r2
            r0.<init>()
            return
    }

    public abstract org.lwjgl.util.vector.Matrix setIdentity();

    public abstract org.lwjgl.util.vector.Matrix invert();

    public abstract org.lwjgl.util.vector.Matrix load(java.nio.FloatBuffer r1);

    public abstract org.lwjgl.util.vector.Matrix loadTranspose(java.nio.FloatBuffer r1);

    public abstract org.lwjgl.util.vector.Matrix negate();

    public abstract org.lwjgl.util.vector.Matrix store(java.nio.FloatBuffer r1);

    public abstract org.lwjgl.util.vector.Matrix storeTranspose(java.nio.FloatBuffer r1);

    public abstract org.lwjgl.util.vector.Matrix transpose();

    public abstract org.lwjgl.util.vector.Matrix setZero();

    public abstract float determinant();
}
