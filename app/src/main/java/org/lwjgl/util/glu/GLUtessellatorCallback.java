package org.lwjgl.util.glu;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/util/glu/GLUtessellatorCallback.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/util/glu/GLUtessellatorCallback.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/util/glu/GLUtessellatorCallback.class */
public interface GLUtessellatorCallback {
    void begin(int r1);

    void beginData(int r1, java.lang.Object r2);

    void edgeFlag(boolean r1);

    void edgeFlagData(boolean r1, java.lang.Object r2);

    void vertex(java.lang.Object r1);

    void vertexData(java.lang.Object r1, java.lang.Object r2);

    void end();

    void endData(java.lang.Object r1);

    void combine(double[] r1, java.lang.Object[] r2, float[] r3, java.lang.Object[] r4);

    void combineData(double[] r1, java.lang.Object[] r2, float[] r3, java.lang.Object[] r4, java.lang.Object r5);

    void error(int r1);

    void errorData(int r1, java.lang.Object r2);
}
