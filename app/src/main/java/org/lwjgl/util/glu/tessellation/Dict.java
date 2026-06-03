package org.lwjgl.util.glu.tessellation;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/util/glu/tessellation/Dict.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/util/glu/tessellation/Dict.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/util/glu/tessellation/Dict.class */
class Dict {
    org.lwjgl.util.glu.tessellation.DictNode head;
    java.lang.Object frame;
    org.lwjgl.util.glu.tessellation.Dict.DictLeq leq;

    /* JADX WARN: Classes with same name are omitted, all sources:
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/util/glu/tessellation/Dict$DictLeq.class
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/util/glu/tessellation/Dict$DictLeq.class
     */
    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/util/glu/tessellation/Dict$DictLeq.class */
    public interface DictLeq {
        boolean leq(java.lang.Object r1, java.lang.Object r2, java.lang.Object r3);
    }

    private Dict() {
            r2 = this;
            r0 = r2
            r0.<init>()
            return
    }

    static org.lwjgl.util.glu.tessellation.Dict dictNewDict(java.lang.Object r4, org.lwjgl.util.glu.tessellation.Dict.DictLeq r5) {
            org.lwjgl.util.glu.tessellation.Dict r0 = new org.lwjgl.util.glu.tessellation.Dict
            r1 = r0
            r1.<init>()
            r6 = r0
            r0 = r6
            org.lwjgl.util.glu.tessellation.DictNode r1 = new org.lwjgl.util.glu.tessellation.DictNode
            r2 = r1
            r2.<init>()
            r0.head = r1
            r0 = r6
            org.lwjgl.util.glu.tessellation.DictNode r0 = r0.head
            r1 = 0
            r0.key = r1
            r0 = r6
            org.lwjgl.util.glu.tessellation.DictNode r0 = r0.head
            r1 = r6
            org.lwjgl.util.glu.tessellation.DictNode r1 = r1.head
            r0.next = r1
            r0 = r6
            org.lwjgl.util.glu.tessellation.DictNode r0 = r0.head
            r1 = r6
            org.lwjgl.util.glu.tessellation.DictNode r1 = r1.head
            r0.prev = r1
            r0 = r6
            r1 = r4
            r0.frame = r1
            r0 = r6
            r1 = r5
            r0.leq = r1
            r0 = r6
            return r0
    }

    static void dictDeleteDict(org.lwjgl.util.glu.tessellation.Dict r3) {
            r0 = r3
            r1 = 0
            r0.head = r1
            r0 = r3
            r1 = 0
            r0.frame = r1
            r0 = r3
            r1 = 0
            r0.leq = r1
            return
    }

    static org.lwjgl.util.glu.tessellation.DictNode dictInsert(org.lwjgl.util.glu.tessellation.Dict r4, java.lang.Object r5) {
            r0 = r4
            r1 = r4
            org.lwjgl.util.glu.tessellation.DictNode r1 = r1.head
            r2 = r5
            org.lwjgl.util.glu.tessellation.DictNode r0 = dictInsertBefore(r0, r1, r2)
            return r0
    }

    static org.lwjgl.util.glu.tessellation.DictNode dictInsertBefore(org.lwjgl.util.glu.tessellation.Dict r5, org.lwjgl.util.glu.tessellation.DictNode r6, java.lang.Object r7) {
        L0:
            r0 = r6
            org.lwjgl.util.glu.tessellation.DictNode r0 = r0.prev
            r6 = r0
            r0 = r6
            java.lang.Object r0 = r0.key
            if (r0 == 0) goto L21
            r0 = r5
            org.lwjgl.util.glu.tessellation.Dict$DictLeq r0 = r0.leq
            r1 = r5
            java.lang.Object r1 = r1.frame
            r2 = r6
            java.lang.Object r2 = r2.key
            r3 = r7
            boolean r0 = r0.leq(r1, r2, r3)
            if (r0 == 0) goto L0
        L21:
            org.lwjgl.util.glu.tessellation.DictNode r0 = new org.lwjgl.util.glu.tessellation.DictNode
            r1 = r0
            r1.<init>()
            r8 = r0
            r0 = r8
            r1 = r7
            r0.key = r1
            r0 = r8
            r1 = r6
            org.lwjgl.util.glu.tessellation.DictNode r1 = r1.next
            r0.next = r1
            r0 = r6
            org.lwjgl.util.glu.tessellation.DictNode r0 = r0.next
            r1 = r8
            r0.prev = r1
            r0 = r8
            r1 = r6
            r0.prev = r1
            r0 = r6
            r1 = r8
            r0.next = r1
            r0 = r8
            return r0
    }

    static java.lang.Object dictKey(org.lwjgl.util.glu.tessellation.DictNode r2) {
            r0 = r2
            java.lang.Object r0 = r0.key
            return r0
    }

    static org.lwjgl.util.glu.tessellation.DictNode dictSucc(org.lwjgl.util.glu.tessellation.DictNode r2) {
            r0 = r2
            org.lwjgl.util.glu.tessellation.DictNode r0 = r0.next
            return r0
    }

    static org.lwjgl.util.glu.tessellation.DictNode dictPred(org.lwjgl.util.glu.tessellation.DictNode r2) {
            r0 = r2
            org.lwjgl.util.glu.tessellation.DictNode r0 = r0.prev
            return r0
    }

    static org.lwjgl.util.glu.tessellation.DictNode dictMin(org.lwjgl.util.glu.tessellation.Dict r2) {
            r0 = r2
            org.lwjgl.util.glu.tessellation.DictNode r0 = r0.head
            org.lwjgl.util.glu.tessellation.DictNode r0 = r0.next
            return r0
    }

    static org.lwjgl.util.glu.tessellation.DictNode dictMax(org.lwjgl.util.glu.tessellation.Dict r2) {
            r0 = r2
            org.lwjgl.util.glu.tessellation.DictNode r0 = r0.head
            org.lwjgl.util.glu.tessellation.DictNode r0 = r0.prev
            return r0
    }

    static void dictDelete(org.lwjgl.util.glu.tessellation.Dict r3, org.lwjgl.util.glu.tessellation.DictNode r4) {
            r0 = r4
            org.lwjgl.util.glu.tessellation.DictNode r0 = r0.next
            r1 = r4
            org.lwjgl.util.glu.tessellation.DictNode r1 = r1.prev
            r0.prev = r1
            r0 = r4
            org.lwjgl.util.glu.tessellation.DictNode r0 = r0.prev
            r1 = r4
            org.lwjgl.util.glu.tessellation.DictNode r1 = r1.next
            r0.next = r1
            return
    }

    static org.lwjgl.util.glu.tessellation.DictNode dictSearch(org.lwjgl.util.glu.tessellation.Dict r5, java.lang.Object r6) {
            r0 = r5
            org.lwjgl.util.glu.tessellation.DictNode r0 = r0.head
            r7 = r0
        L5:
            r0 = r7
            org.lwjgl.util.glu.tessellation.DictNode r0 = r0.next
            r7 = r0
            r0 = r7
            java.lang.Object r0 = r0.key
            if (r0 == 0) goto L26
            r0 = r5
            org.lwjgl.util.glu.tessellation.Dict$DictLeq r0 = r0.leq
            r1 = r5
            java.lang.Object r1 = r1.frame
            r2 = r6
            r3 = r7
            java.lang.Object r3 = r3.key
            boolean r0 = r0.leq(r1, r2, r3)
            if (r0 == 0) goto L5
        L26:
            r0 = r7
            return r0
    }
}
