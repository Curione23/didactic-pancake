package org.lwjgl.util.glu.tessellation;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/util/glu/tessellation/GLUmesh.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/util/glu/tessellation/GLUmesh.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/util/glu/tessellation/GLUmesh.class */
class GLUmesh {
    org.lwjgl.util.glu.tessellation.GLUvertex vHead;
    org.lwjgl.util.glu.tessellation.GLUface fHead;
    org.lwjgl.util.glu.tessellation.GLUhalfEdge eHead;
    org.lwjgl.util.glu.tessellation.GLUhalfEdge eHeadSym;

    GLUmesh() {
            r5 = this;
            r0 = r5
            r0.<init>()
            r0 = r5
            org.lwjgl.util.glu.tessellation.GLUvertex r1 = new org.lwjgl.util.glu.tessellation.GLUvertex
            r2 = r1
            r2.<init>()
            r0.vHead = r1
            r0 = r5
            org.lwjgl.util.glu.tessellation.GLUface r1 = new org.lwjgl.util.glu.tessellation.GLUface
            r2 = r1
            r2.<init>()
            r0.fHead = r1
            r0 = r5
            org.lwjgl.util.glu.tessellation.GLUhalfEdge r1 = new org.lwjgl.util.glu.tessellation.GLUhalfEdge
            r2 = r1
            r3 = 1
            r2.<init>(r3)
            r0.eHead = r1
            r0 = r5
            org.lwjgl.util.glu.tessellation.GLUhalfEdge r1 = new org.lwjgl.util.glu.tessellation.GLUhalfEdge
            r2 = r1
            r3 = 0
            r2.<init>(r3)
            r0.eHeadSym = r1
            return
    }
}
