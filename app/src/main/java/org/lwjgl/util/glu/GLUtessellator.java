package org.lwjgl.util.glu;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/util/glu/GLUtessellator.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/util/glu/GLUtessellator.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/util/glu/GLUtessellator.class */
public interface GLUtessellator {
    void gluDeleteTess();

    void gluTessProperty(int r1, double r2);

    void gluGetTessProperty(int r1, double[] r2, int r3);

    void gluTessNormal(double r1, double r3, double r5);

    void gluTessCallback(int r1, org.lwjgl.util.glu.GLUtessellatorCallback r2);

    void gluTessVertex(double[] r1, int r2, java.lang.Object r3);

    void gluTessBeginPolygon(java.lang.Object r1);

    void gluTessBeginContour();

    void gluTessEndContour();

    void gluTessEndPolygon();

    void gluBeginPolygon();

    void gluNextContour(int r1);

    void gluEndPolygon();
}
