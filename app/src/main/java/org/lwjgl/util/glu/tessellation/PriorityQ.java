package org.lwjgl.util.glu.tessellation;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/util/glu/tessellation/PriorityQ.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/util/glu/tessellation/PriorityQ.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/util/glu/tessellation/PriorityQ.class */
abstract class PriorityQ {
    public static final int INIT_SIZE = 32;

    /* JADX WARN: Classes with same name are omitted, all sources:
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/util/glu/tessellation/PriorityQ$Leq.class
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/util/glu/tessellation/PriorityQ$Leq.class
     */
    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/util/glu/tessellation/PriorityQ$Leq.class */
    public interface Leq {
        boolean leq(java.lang.Object r1, java.lang.Object r2);
    }

    /* JADX WARN: Classes with same name are omitted, all sources:
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/util/glu/tessellation/PriorityQ$PQhandleElem.class
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/util/glu/tessellation/PriorityQ$PQhandleElem.class
     */
    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/util/glu/tessellation/PriorityQ$PQhandleElem.class */
    public static class PQhandleElem {
        java.lang.Object key;
        int node;

        public PQhandleElem() {
                r2 = this;
                r0 = r2
                r0.<init>()
                return
        }
    }

    /* JADX WARN: Classes with same name are omitted, all sources:
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/util/glu/tessellation/PriorityQ$PQnode.class
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/util/glu/tessellation/PriorityQ$PQnode.class
     */
    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/util/glu/tessellation/PriorityQ$PQnode.class */
    public static class PQnode {
        int handle;

        public PQnode() {
                r2 = this;
                r0 = r2
                r0.<init>()
                return
        }
    }

    PriorityQ() {
            r2 = this;
            r0 = r2
            r0.<init>()
            return
    }

    public static boolean LEQ(org.lwjgl.util.glu.tessellation.PriorityQ.Leq r3, java.lang.Object r4, java.lang.Object r5) {
            r0 = r4
            org.lwjgl.util.glu.tessellation.GLUvertex r0 = (org.lwjgl.util.glu.tessellation.GLUvertex) r0
            r1 = r5
            org.lwjgl.util.glu.tessellation.GLUvertex r1 = (org.lwjgl.util.glu.tessellation.GLUvertex) r1
            boolean r0 = org.lwjgl.util.glu.tessellation.Geom.VertLeq(r0, r1)
            return r0
    }

    static org.lwjgl.util.glu.tessellation.PriorityQ pqNewPriorityQ(org.lwjgl.util.glu.tessellation.PriorityQ.Leq r4) {
            org.lwjgl.util.glu.tessellation.PriorityQSort r0 = new org.lwjgl.util.glu.tessellation.PriorityQSort
            r1 = r0
            r2 = r4
            r1.<init>(r2)
            return r0
    }

    abstract void pqDeletePriorityQ();

    abstract boolean pqInit();

    abstract int pqInsert(java.lang.Object r1);

    abstract java.lang.Object pqExtractMin();

    abstract void pqDelete(int r1);

    abstract java.lang.Object pqMinimum();

    abstract boolean pqIsEmpty();
}
