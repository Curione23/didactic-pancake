package org.lwjgl.util.glu.tessellation;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/util/glu/tessellation/PriorityQHeap.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/util/glu/tessellation/PriorityQHeap.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/util/glu/tessellation/PriorityQHeap.class */
class PriorityQHeap extends org.lwjgl.util.glu.tessellation.PriorityQ {
    org.lwjgl.util.glu.tessellation.PriorityQ.PQnode[] nodes;
    org.lwjgl.util.glu.tessellation.PriorityQ.PQhandleElem[] handles;
    int size;
    int max;
    int freeList;
    boolean initialized;
    org.lwjgl.util.glu.tessellation.PriorityQ.Leq leq;
    static final /* synthetic */ boolean $assertionsDisabled = false;

    PriorityQHeap(org.lwjgl.util.glu.tessellation.PriorityQ.Leq r6) {
            r5 = this;
            r0 = r5
            r0.<init>()
            r0 = r5
            r1 = 0
            r0.size = r1
            r0 = r5
            r1 = 32
            r0.max = r1
            r0 = r5
            r1 = 33
            org.lwjgl.util.glu.tessellation.PriorityQ$PQnode[] r1 = new org.lwjgl.util.glu.tessellation.PriorityQ.PQnode[r1]
            r0.nodes = r1
            r0 = 0
            r7 = r0
        L1a:
            r0 = r7
            r1 = r5
            org.lwjgl.util.glu.tessellation.PriorityQ$PQnode[] r1 = r1.nodes
            int r1 = r1.length
            if (r0 >= r1) goto L36
            r0 = r5
            org.lwjgl.util.glu.tessellation.PriorityQ$PQnode[] r0 = r0.nodes
            r1 = r7
            org.lwjgl.util.glu.tessellation.PriorityQ$PQnode r2 = new org.lwjgl.util.glu.tessellation.PriorityQ$PQnode
            r3 = r2
            r3.<init>()
            r0[r1] = r2
            int r7 = r7 + 1
            goto L1a
        L36:
            r0 = r5
            r1 = 33
            org.lwjgl.util.glu.tessellation.PriorityQ$PQhandleElem[] r1 = new org.lwjgl.util.glu.tessellation.PriorityQ.PQhandleElem[r1]
            r0.handles = r1
            r0 = 0
            r7 = r0
        L41:
            r0 = r7
            r1 = r5
            org.lwjgl.util.glu.tessellation.PriorityQ$PQhandleElem[] r1 = r1.handles
            int r1 = r1.length
            if (r0 >= r1) goto L5d
            r0 = r5
            org.lwjgl.util.glu.tessellation.PriorityQ$PQhandleElem[] r0 = r0.handles
            r1 = r7
            org.lwjgl.util.glu.tessellation.PriorityQ$PQhandleElem r2 = new org.lwjgl.util.glu.tessellation.PriorityQ$PQhandleElem
            r3 = r2
            r3.<init>()
            r0[r1] = r2
            int r7 = r7 + 1
            goto L41
        L5d:
            r0 = r5
            r1 = 0
            r0.initialized = r1
            r0 = r5
            r1 = 0
            r0.freeList = r1
            r0 = r5
            r1 = r6
            r0.leq = r1
            r0 = r5
            org.lwjgl.util.glu.tessellation.PriorityQ$PQnode[] r0 = r0.nodes
            r1 = 1
            r0 = r0[r1]
            r1 = 1
            r0.handle = r1
            r0 = r5
            org.lwjgl.util.glu.tessellation.PriorityQ$PQhandleElem[] r0 = r0.handles
            r1 = 1
            r0 = r0[r1]
            r1 = 0
            r0.key = r1
            return
    }

    @Override // org.lwjgl.util.glu.tessellation.PriorityQ
    void pqDeletePriorityQ() {
            r3 = this;
            r0 = r3
            r1 = 0
            r0.handles = r1
            r0 = r3
            r1 = 0
            r0.nodes = r1
            return
    }

    void FloatDown(int r7) {
            r6 = this;
            r0 = r6
            org.lwjgl.util.glu.tessellation.PriorityQ$PQnode[] r0 = r0.nodes
            r8 = r0
            r0 = r6
            org.lwjgl.util.glu.tessellation.PriorityQ$PQhandleElem[] r0 = r0.handles
            r9 = r0
            r0 = r8
            r1 = r7
            r0 = r0[r1]
            int r0 = r0.handle
            r10 = r0
        L12:
            r0 = r7
            r1 = 1
            int r0 = r0 << r1
            r12 = r0
            r0 = r12
            r1 = r6
            int r1 = r1.size
            if (r0 >= r1) goto L47
            r0 = r6
            org.lwjgl.util.glu.tessellation.PriorityQ$Leq r0 = r0.leq
            r1 = r9
            r2 = r8
            r3 = r12
            r4 = 1
            int r3 = r3 + r4
            r2 = r2[r3]
            int r2 = r2.handle
            r1 = r1[r2]
            java.lang.Object r1 = r1.key
            r2 = r9
            r3 = r8
            r4 = r12
            r3 = r3[r4]
            int r3 = r3.handle
            r2 = r2[r3]
            java.lang.Object r2 = r2.key
            boolean r0 = LEQ(r0, r1, r2)
            if (r0 == 0) goto L47
            int r12 = r12 + 1
        L47:
            boolean r0 = org.lwjgl.util.glu.tessellation.PriorityQHeap.$assertionsDisabled
            if (r0 != 0) goto L5e
            r0 = r12
            r1 = r6
            int r1 = r1.max
            if (r0 <= r1) goto L5e
            java.lang.AssertionError r0 = new java.lang.AssertionError
            r1 = r0
            r1.<init>()
            throw r0
        L5e:
            r0 = r8
            r1 = r12
            r0 = r0[r1]
            int r0 = r0.handle
            r11 = r0
            r0 = r12
            r1 = r6
            int r1 = r1.size
            if (r0 > r1) goto L88
            r0 = r6
            org.lwjgl.util.glu.tessellation.PriorityQ$Leq r0 = r0.leq
            r1 = r9
            r2 = r10
            r1 = r1[r2]
            java.lang.Object r1 = r1.key
            r2 = r9
            r3 = r11
            r2 = r2[r3]
            java.lang.Object r2 = r2.key
            boolean r0 = LEQ(r0, r1, r2)
            if (r0 == 0) goto L9b
        L88:
            r0 = r8
            r1 = r7
            r0 = r0[r1]
            r1 = r10
            r0.handle = r1
            r0 = r9
            r1 = r10
            r0 = r0[r1]
            r1 = r7
            r0.node = r1
            goto Lb1
        L9b:
            r0 = r8
            r1 = r7
            r0 = r0[r1]
            r1 = r11
            r0.handle = r1
            r0 = r9
            r1 = r11
            r0 = r0[r1]
            r1 = r7
            r0.node = r1
            r0 = r12
            r7 = r0
            goto L12
        Lb1:
            return
    }

    void FloatUp(int r6) {
            r5 = this;
            r0 = r5
            org.lwjgl.util.glu.tessellation.PriorityQ$PQnode[] r0 = r0.nodes
            r7 = r0
            r0 = r5
            org.lwjgl.util.glu.tessellation.PriorityQ$PQhandleElem[] r0 = r0.handles
            r8 = r0
            r0 = r7
            r1 = r6
            r0 = r0[r1]
            int r0 = r0.handle
            r9 = r0
        L12:
            r0 = r6
            r1 = 1
            int r0 = r0 >> r1
            r11 = r0
            r0 = r7
            r1 = r11
            r0 = r0[r1]
            int r0 = r0.handle
            r10 = r0
            r0 = r11
            if (r0 == 0) goto L3d
            r0 = r5
            org.lwjgl.util.glu.tessellation.PriorityQ$Leq r0 = r0.leq
            r1 = r8
            r2 = r10
            r1 = r1[r2]
            java.lang.Object r1 = r1.key
            r2 = r8
            r3 = r9
            r2 = r2[r3]
            java.lang.Object r2 = r2.key
            boolean r0 = LEQ(r0, r1, r2)
            if (r0 == 0) goto L50
        L3d:
            r0 = r7
            r1 = r6
            r0 = r0[r1]
            r1 = r9
            r0.handle = r1
            r0 = r8
            r1 = r9
            r0 = r0[r1]
            r1 = r6
            r0.node = r1
            goto L66
        L50:
            r0 = r7
            r1 = r6
            r0 = r0[r1]
            r1 = r10
            r0.handle = r1
            r0 = r8
            r1 = r10
            r0 = r0[r1]
            r1 = r6
            r0.node = r1
            r0 = r11
            r6 = r0
            goto L12
        L66:
            return
    }

    @Override // org.lwjgl.util.glu.tessellation.PriorityQ
    boolean pqInit() {
            r3 = this;
            r0 = r3
            int r0 = r0.size
            r4 = r0
        L5:
            r0 = r4
            r1 = 1
            if (r0 < r1) goto L15
            r0 = r3
            r1 = r4
            r0.FloatDown(r1)
            int r4 = r4 + (-1)
            goto L5
        L15:
            r0 = r3
            r1 = 1
            r0.initialized = r1
            r0 = 1
            return r0
    }

    @Override // org.lwjgl.util.glu.tessellation.PriorityQ
    int pqInsert(java.lang.Object r7) {
            r6 = this;
            r0 = r6
            r1 = r0
            int r1 = r1.size
            r2 = 1
            int r1 = r1 + r2
            r2 = r1; r1 = r0; r0 = r2; 
            r1.size = r2
            r8 = r0
            r0 = r8
            r1 = 2
            int r0 = r0 * r1
            r1 = r6
            int r1 = r1.max
            if (r0 <= r1) goto Ld0
            r0 = r6
            org.lwjgl.util.glu.tessellation.PriorityQ$PQnode[] r0 = r0.nodes
            r10 = r0
            r0 = r6
            org.lwjgl.util.glu.tessellation.PriorityQ$PQhandleElem[] r0 = r0.handles
            r11 = r0
            r0 = r6
            r1 = r0
            int r1 = r1.max
            r2 = 1
            int r1 = r1 << r2
            r0.max = r1
            r0 = r6
            int r0 = r0.max
            r1 = 1
            int r0 = r0 + r1
            org.lwjgl.util.glu.tessellation.PriorityQ$PQnode[] r0 = new org.lwjgl.util.glu.tessellation.PriorityQ.PQnode[r0]
            r12 = r0
            r0 = r6
            org.lwjgl.util.glu.tessellation.PriorityQ$PQnode[] r0 = r0.nodes
            r1 = 0
            r2 = r12
            r3 = 0
            r4 = r6
            org.lwjgl.util.glu.tessellation.PriorityQ$PQnode[] r4 = r4.nodes
            int r4 = r4.length
            java.lang.System.arraycopy(r0, r1, r2, r3, r4)
            r0 = r6
            org.lwjgl.util.glu.tessellation.PriorityQ$PQnode[] r0 = r0.nodes
            int r0 = r0.length
            r13 = r0
        L4e:
            r0 = r13
            r1 = r12
            int r1 = r1.length
            if (r0 >= r1) goto L68
            r0 = r12
            r1 = r13
            org.lwjgl.util.glu.tessellation.PriorityQ$PQnode r2 = new org.lwjgl.util.glu.tessellation.PriorityQ$PQnode
            r3 = r2
            r3.<init>()
            r0[r1] = r2
            int r13 = r13 + 1
            goto L4e
        L68:
            r0 = r6
            r1 = r12
            r0.nodes = r1
            r0 = r6
            org.lwjgl.util.glu.tessellation.PriorityQ$PQnode[] r0 = r0.nodes
            if (r0 != 0) goto L7e
            r0 = r6
            r1 = r10
            r0.nodes = r1
            r0 = 2147483647(0x7fffffff, float:NaN)
            return r0
        L7e:
            r0 = r6
            int r0 = r0.max
            r1 = 1
            int r0 = r0 + r1
            org.lwjgl.util.glu.tessellation.PriorityQ$PQhandleElem[] r0 = new org.lwjgl.util.glu.tessellation.PriorityQ.PQhandleElem[r0]
            r13 = r0
            r0 = r6
            org.lwjgl.util.glu.tessellation.PriorityQ$PQhandleElem[] r0 = r0.handles
            r1 = 0
            r2 = r13
            r3 = 0
            r4 = r6
            org.lwjgl.util.glu.tessellation.PriorityQ$PQhandleElem[] r4 = r4.handles
            int r4 = r4.length
            java.lang.System.arraycopy(r0, r1, r2, r3, r4)
            r0 = r6
            org.lwjgl.util.glu.tessellation.PriorityQ$PQhandleElem[] r0 = r0.handles
            int r0 = r0.length
            r14 = r0
        La0:
            r0 = r14
            r1 = r13
            int r1 = r1.length
            if (r0 >= r1) goto Lba
            r0 = r13
            r1 = r14
            org.lwjgl.util.glu.tessellation.PriorityQ$PQhandleElem r2 = new org.lwjgl.util.glu.tessellation.PriorityQ$PQhandleElem
            r3 = r2
            r3.<init>()
            r0[r1] = r2
            int r14 = r14 + 1
            goto La0
        Lba:
            r0 = r6
            r1 = r13
            r0.handles = r1
            r0 = r6
            org.lwjgl.util.glu.tessellation.PriorityQ$PQhandleElem[] r0 = r0.handles
            if (r0 != 0) goto Ld0
            r0 = r6
            r1 = r11
            r0.handles = r1
            r0 = 2147483647(0x7fffffff, float:NaN)
            return r0
        Ld0:
            r0 = r6
            int r0 = r0.freeList
            if (r0 != 0) goto Ldc
            r0 = r8
            r9 = r0
            goto Lee
        Ldc:
            r0 = r6
            int r0 = r0.freeList
            r9 = r0
            r0 = r6
            r1 = r6
            org.lwjgl.util.glu.tessellation.PriorityQ$PQhandleElem[] r1 = r1.handles
            r2 = r9
            r1 = r1[r2]
            int r1 = r1.node
            r0.freeList = r1
        Lee:
            r0 = r6
            org.lwjgl.util.glu.tessellation.PriorityQ$PQnode[] r0 = r0.nodes
            r1 = r8
            r0 = r0[r1]
            r1 = r9
            r0.handle = r1
            r0 = r6
            org.lwjgl.util.glu.tessellation.PriorityQ$PQhandleElem[] r0 = r0.handles
            r1 = r9
            r0 = r0[r1]
            r1 = r8
            r0.node = r1
            r0 = r6
            org.lwjgl.util.glu.tessellation.PriorityQ$PQhandleElem[] r0 = r0.handles
            r1 = r9
            r0 = r0[r1]
            r1 = r7
            r0.key = r1
            r0 = r6
            boolean r0 = r0.initialized
            if (r0 == 0) goto L118
            r0 = r6
            r1 = r8
            r0.FloatUp(r1)
        L118:
            boolean r0 = org.lwjgl.util.glu.tessellation.PriorityQHeap.$assertionsDisabled
            if (r0 != 0) goto L12c
            r0 = r9
            r1 = 2147483647(0x7fffffff, float:NaN)
            if (r0 != r1) goto L12c
            java.lang.AssertionError r0 = new java.lang.AssertionError
            r1 = r0
            r1.<init>()
            throw r0
        L12c:
            r0 = r9
            return r0
    }

    @Override // org.lwjgl.util.glu.tessellation.PriorityQ
    java.lang.Object pqExtractMin() {
            r4 = this;
            r0 = r4
            org.lwjgl.util.glu.tessellation.PriorityQ$PQnode[] r0 = r0.nodes
            r5 = r0
            r0 = r4
            org.lwjgl.util.glu.tessellation.PriorityQ$PQhandleElem[] r0 = r0.handles
            r6 = r0
            r0 = r5
            r1 = 1
            r0 = r0[r1]
            int r0 = r0.handle
            r7 = r0
            r0 = r6
            r1 = r7
            r0 = r0[r1]
            java.lang.Object r0 = r0.key
            r8 = r0
            r0 = r4
            int r0 = r0.size
            if (r0 <= 0) goto L64
            r0 = r5
            r1 = 1
            r0 = r0[r1]
            r1 = r5
            r2 = r4
            int r2 = r2.size
            r1 = r1[r2]
            int r1 = r1.handle
            r0.handle = r1
            r0 = r6
            r1 = r5
            r2 = 1
            r1 = r1[r2]
            int r1 = r1.handle
            r0 = r0[r1]
            r1 = 1
            r0.node = r1
            r0 = r6
            r1 = r7
            r0 = r0[r1]
            r1 = 0
            r0.key = r1
            r0 = r6
            r1 = r7
            r0 = r0[r1]
            r1 = r4
            int r1 = r1.freeList
            r0.node = r1
            r0 = r4
            r1 = r7
            r0.freeList = r1
            r0 = r4
            r1 = r0
            int r1 = r1.size
            r2 = 1
            int r1 = r1 - r2
            r2 = r1; r1 = r0; r0 = r2; 
            r1.size = r2
            if (r0 <= 0) goto L64
            r0 = r4
            r1 = 1
            r0.FloatDown(r1)
        L64:
            r0 = r8
            return r0
    }

    @Override // org.lwjgl.util.glu.tessellation.PriorityQ
    void pqDelete(int r7) {
            r6 = this;
            r0 = r6
            org.lwjgl.util.glu.tessellation.PriorityQ$PQnode[] r0 = r0.nodes
            r8 = r0
            r0 = r6
            org.lwjgl.util.glu.tessellation.PriorityQ$PQhandleElem[] r0 = r0.handles
            r9 = r0
            boolean r0 = org.lwjgl.util.glu.tessellation.PriorityQHeap.$assertionsDisabled
            if (r0 != 0) goto L2e
            r0 = r7
            r1 = 1
            if (r0 < r1) goto L26
            r0 = r7
            r1 = r6
            int r1 = r1.max
            if (r0 > r1) goto L26
            r0 = r9
            r1 = r7
            r0 = r0[r1]
            java.lang.Object r0 = r0.key
            if (r0 != 0) goto L2e
        L26:
            java.lang.AssertionError r0 = new java.lang.AssertionError
            r1 = r0
            r1.<init>()
            throw r0
        L2e:
            r0 = r9
            r1 = r7
            r0 = r0[r1]
            int r0 = r0.node
            r10 = r0
            r0 = r8
            r1 = r10
            r0 = r0[r1]
            r1 = r8
            r2 = r6
            int r2 = r2.size
            r1 = r1[r2]
            int r1 = r1.handle
            r0.handle = r1
            r0 = r9
            r1 = r8
            r2 = r10
            r1 = r1[r2]
            int r1 = r1.handle
            r0 = r0[r1]
            r1 = r10
            r0.node = r1
            r0 = r10
            r1 = r6
            r2 = r1
            int r2 = r2.size
            r3 = 1
            int r2 = r2 - r3
            r3 = r2; r2 = r1; r1 = r3; 
            r2.size = r3
            if (r0 > r1) goto L9d
            r0 = r10
            r1 = 1
            if (r0 <= r1) goto L8e
            r0 = r6
            org.lwjgl.util.glu.tessellation.PriorityQ$Leq r0 = r0.leq
            r1 = r9
            r2 = r8
            r3 = r10
            r4 = 1
            int r3 = r3 >> r4
            r2 = r2[r3]
            int r2 = r2.handle
            r1 = r1[r2]
            java.lang.Object r1 = r1.key
            r2 = r9
            r3 = r8
            r4 = r10
            r3 = r3[r4]
            int r3 = r3.handle
            r2 = r2[r3]
            java.lang.Object r2 = r2.key
            boolean r0 = LEQ(r0, r1, r2)
            if (r0 == 0) goto L97
        L8e:
            r0 = r6
            r1 = r10
            r0.FloatDown(r1)
            goto L9d
        L97:
            r0 = r6
            r1 = r10
            r0.FloatUp(r1)
        L9d:
            r0 = r9
            r1 = r7
            r0 = r0[r1]
            r1 = 0
            r0.key = r1
            r0 = r9
            r1 = r7
            r0 = r0[r1]
            r1 = r6
            int r1 = r1.freeList
            r0.node = r1
            r0 = r6
            r1 = r7
            r0.freeList = r1
            return
    }

    @Override // org.lwjgl.util.glu.tessellation.PriorityQ
    java.lang.Object pqMinimum() {
            r4 = this;
            r0 = r4
            org.lwjgl.util.glu.tessellation.PriorityQ$PQhandleElem[] r0 = r0.handles
            r1 = r4
            org.lwjgl.util.glu.tessellation.PriorityQ$PQnode[] r1 = r1.nodes
            r2 = 1
            r1 = r1[r2]
            int r1 = r1.handle
            r0 = r0[r1]
            java.lang.Object r0 = r0.key
            return r0
    }

    @Override // org.lwjgl.util.glu.tessellation.PriorityQ
    boolean pqIsEmpty() {
            r2 = this;
            r0 = r2
            int r0 = r0.size
            if (r0 != 0) goto Lb
            r0 = 1
            goto Lc
        Lb:
            r0 = 0
        Lc:
            return r0
    }

    static {
            java.lang.Class<org.lwjgl.util.glu.tessellation.PriorityQHeap> r0 = org.lwjgl.util.glu.tessellation.PriorityQHeap.class
            boolean r0 = r0.desiredAssertionStatus()
            if (r0 != 0) goto Lc
            r0 = 1
            goto Ld
        Lc:
            r0 = 0
        Ld:
            org.lwjgl.util.glu.tessellation.PriorityQHeap.$assertionsDisabled = r0
            return
    }
}
