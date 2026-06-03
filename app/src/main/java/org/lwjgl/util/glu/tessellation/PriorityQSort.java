package org.lwjgl.util.glu.tessellation;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/util/glu/tessellation/PriorityQSort.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/util/glu/tessellation/PriorityQSort.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/util/glu/tessellation/PriorityQSort.class */
class PriorityQSort extends org.lwjgl.util.glu.tessellation.PriorityQ {
    org.lwjgl.util.glu.tessellation.PriorityQHeap heap;
    java.lang.Object[] keys;
    int[] order;
    int size;
    int max;
    boolean initialized;
    org.lwjgl.util.glu.tessellation.PriorityQ.Leq leq;
    static final /* synthetic */ boolean $assertionsDisabled = false;

    /* JADX WARN: Classes with same name are omitted, all sources:
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/util/glu/tessellation/PriorityQSort$1.class
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/util/glu/tessellation/PriorityQSort$1.class
     */
    /* JADX INFO: renamed from: org.lwjgl.util.glu.tessellation.PriorityQSort$1, reason: invalid class name */
    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/util/glu/tessellation/PriorityQSort$1.class */
    static /* synthetic */ class AnonymousClass1 {
    }

    /* JADX WARN: Classes with same name are omitted, all sources:
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/util/glu/tessellation/PriorityQSort$Stack.class
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/util/glu/tessellation/PriorityQSort$Stack.class
     */
    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/util/glu/tessellation/PriorityQSort$Stack.class */
    private static class Stack {
        int p;
        int r;

        private Stack() {
                r2 = this;
                r0 = r2
                r0.<init>()
                return
        }

        /* synthetic */ Stack(org.lwjgl.util.glu.tessellation.PriorityQSort.AnonymousClass1 r3) {
                r2 = this;
                r0 = r2
                r0.<init>()
                return
        }
    }

    PriorityQSort(org.lwjgl.util.glu.tessellation.PriorityQ.Leq r6) {
            r5 = this;
            r0 = r5
            r0.<init>()
            r0 = r5
            org.lwjgl.util.glu.tessellation.PriorityQHeap r1 = new org.lwjgl.util.glu.tessellation.PriorityQHeap
            r2 = r1
            r3 = r6
            r2.<init>(r3)
            r0.heap = r1
            r0 = r5
            r1 = 32
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r0.keys = r1
            r0 = r5
            r1 = 0
            r0.size = r1
            r0 = r5
            r1 = 32
            r0.max = r1
            r0 = r5
            r1 = 0
            r0.initialized = r1
            r0 = r5
            r1 = r6
            r0.leq = r1
            return
    }

    @Override // org.lwjgl.util.glu.tessellation.PriorityQ
    void pqDeletePriorityQ() {
            r3 = this;
            r0 = r3
            org.lwjgl.util.glu.tessellation.PriorityQHeap r0 = r0.heap
            if (r0 == 0) goto Le
            r0 = r3
            org.lwjgl.util.glu.tessellation.PriorityQHeap r0 = r0.heap
            r0.pqDeletePriorityQ()
        Le:
            r0 = r3
            r1 = 0
            r0.order = r1
            r0 = r3
            r1 = 0
            r0.keys = r1
            return
    }

    private static boolean LT(org.lwjgl.util.glu.tessellation.PriorityQ.Leq r4, java.lang.Object r5, java.lang.Object r6) {
            r0 = r4
            r1 = r6
            r2 = r5
            boolean r0 = org.lwjgl.util.glu.tessellation.PriorityQHeap.LEQ(r0, r1, r2)
            if (r0 != 0) goto Ld
            r0 = 1
            goto Le
        Ld:
            r0 = 0
        Le:
            return r0
    }

    private static boolean GT(org.lwjgl.util.glu.tessellation.PriorityQ.Leq r4, java.lang.Object r5, java.lang.Object r6) {
            r0 = r4
            r1 = r5
            r2 = r6
            boolean r0 = org.lwjgl.util.glu.tessellation.PriorityQHeap.LEQ(r0, r1, r2)
            if (r0 != 0) goto Ld
            r0 = 1
            goto Le
        Ld:
            r0 = 0
        Le:
            return r0
    }

    private static void Swap(int[] r5, int r6, int r7) {
            r0 = r5
            r1 = r6
            r0 = r0[r1]
            r8 = r0
            r0 = r5
            r1 = r6
            r2 = r5
            r3 = r7
            r2 = r2[r3]
            r0[r1] = r2
            r0 = r5
            r1 = r7
            r2 = r8
            r0[r1] = r2
            return
    }

    @Override // org.lwjgl.util.glu.tessellation.PriorityQ
    boolean pqInit() {
            r6 = this;
            r0 = 50
            org.lwjgl.util.glu.tessellation.PriorityQSort$Stack[] r0 = new org.lwjgl.util.glu.tessellation.PriorityQSort.Stack[r0]
            r12 = r0
            r0 = 0
            r13 = r0
        La:
            r0 = r13
            r1 = r12
            int r1 = r1.length
            if (r0 >= r1) goto L25
            r0 = r12
            r1 = r13
            org.lwjgl.util.glu.tessellation.PriorityQSort$Stack r2 = new org.lwjgl.util.glu.tessellation.PriorityQSort$Stack
            r3 = r2
            r4 = 0
            r3.<init>(r4)
            r0[r1] = r2
            int r13 = r13 + 1
            goto La
        L25:
            r0 = 0
            r13 = r0
            r0 = 2016473283(0x7830f0c3, float:1.4355117E34)
            r14 = r0
            r0 = r6
            r1 = r6
            int r1 = r1.size
            r2 = 1
            int r1 = r1 + r2
            int[] r1 = new int[r1]
            r0.order = r1
            r0 = 0
            r7 = r0
            r0 = r6
            int r0 = r0.size
            r1 = 1
            int r0 = r0 - r1
            r8 = r0
            r0 = 0
            r11 = r0
            r0 = r7
            r9 = r0
        L46:
            r0 = r9
            r1 = r8
            if (r0 > r1) goto L5c
            r0 = r6
            int[] r0 = r0.order
            r1 = r9
            r2 = r11
            r0[r1] = r2
            int r11 = r11 + 1
            int r9 = r9 + 1
            goto L46
        L5c:
            r0 = r12
            r1 = r13
            r0 = r0[r1]
            r1 = r7
            r0.p = r1
            r0 = r12
            r1 = r13
            r0 = r0[r1]
            r1 = r8
            r0.r = r1
            int r13 = r13 + 1
        L71:
            int r13 = r13 + (-1)
            r0 = r13
            if (r0 < 0) goto L1ce
            r0 = r12
            r1 = r13
            r0 = r0[r1]
            int r0 = r0.p
            r7 = r0
            r0 = r12
            r1 = r13
            r0 = r0[r1]
            int r0 = r0.r
            r8 = r0
        L8b:
            r0 = r8
            r1 = r7
            r2 = 10
            int r1 = r1 + r2
            if (r0 <= r1) goto L170
            r0 = r14
            r1 = 1539415821(0x5bc19f0d, float:1.089991E17)
            int r0 = r0 * r1
            r1 = 1
            int r0 = r0 + r1
            int r0 = java.lang.Math.abs(r0)
            r14 = r0
            r0 = r7
            r1 = r14
            r2 = r8
            r3 = r7
            int r2 = r2 - r3
            r3 = 1
            int r2 = r2 + r3
            int r1 = r1 % r2
            int r0 = r0 + r1
            r9 = r0
            r0 = r6
            int[] r0 = r0.order
            r1 = r9
            r0 = r0[r1]
            r11 = r0
            r0 = r6
            int[] r0 = r0.order
            r1 = r9
            r2 = r6
            int[] r2 = r2.order
            r3 = r7
            r2 = r2[r3]
            r0[r1] = r2
            r0 = r6
            int[] r0 = r0.order
            r1 = r7
            r2 = r11
            r0[r1] = r2
            r0 = r7
            r1 = 1
            int r0 = r0 - r1
            r9 = r0
            r0 = r8
            r1 = 1
            int r0 = r0 + r1
            r10 = r0
        Lcf:
            int r9 = r9 + 1
            r0 = r6
            org.lwjgl.util.glu.tessellation.PriorityQ$Leq r0 = r0.leq
            r1 = r6
            java.lang.Object[] r1 = r1.keys
            r2 = r6
            int[] r2 = r2.order
            r3 = r9
            r2 = r2[r3]
            r1 = r1[r2]
            r2 = r6
            java.lang.Object[] r2 = r2.keys
            r3 = r11
            r2 = r2[r3]
            boolean r0 = GT(r0, r1, r2)
            if (r0 != 0) goto Lcf
        Lee:
            int r10 = r10 + (-1)
            r0 = r6
            org.lwjgl.util.glu.tessellation.PriorityQ$Leq r0 = r0.leq
            r1 = r6
            java.lang.Object[] r1 = r1.keys
            r2 = r6
            int[] r2 = r2.order
            r3 = r10
            r2 = r2[r3]
            r1 = r1[r2]
            r2 = r6
            java.lang.Object[] r2 = r2.keys
            r3 = r11
            r2 = r2[r3]
            boolean r0 = LT(r0, r1, r2)
            if (r0 != 0) goto Lee
            r0 = r6
            int[] r0 = r0.order
            r1 = r9
            r2 = r10
            Swap(r0, r1, r2)
            r0 = r9
            r1 = r10
            if (r0 < r1) goto Lcf
            r0 = r6
            int[] r0 = r0.order
            r1 = r9
            r2 = r10
            Swap(r0, r1, r2)
            r0 = r9
            r1 = r7
            int r0 = r0 - r1
            r1 = r8
            r2 = r10
            int r1 = r1 - r2
            if (r0 >= r1) goto L151
            r0 = r12
            r1 = r13
            r0 = r0[r1]
            r1 = r10
            r2 = 1
            int r1 = r1 + r2
            r0.p = r1
            r0 = r12
            r1 = r13
            r0 = r0[r1]
            r1 = r8
            r0.r = r1
            int r13 = r13 + 1
            r0 = r9
            r1 = 1
            int r0 = r0 - r1
            r8 = r0
            goto L8b
        L151:
            r0 = r12
            r1 = r13
            r0 = r0[r1]
            r1 = r7
            r0.p = r1
            r0 = r12
            r1 = r13
            r0 = r0[r1]
            r1 = r9
            r2 = 1
            int r1 = r1 - r2
            r0.r = r1
            int r13 = r13 + 1
            r0 = r10
            r1 = 1
            int r0 = r0 + r1
            r7 = r0
            goto L8b
        L170:
            r0 = r7
            r1 = 1
            int r0 = r0 + r1
            r9 = r0
        L174:
            r0 = r9
            r1 = r8
            if (r0 > r1) goto L71
            r0 = r6
            int[] r0 = r0.order
            r1 = r9
            r0 = r0[r1]
            r11 = r0
            r0 = r9
            r10 = r0
        L184:
            r0 = r10
            r1 = r7
            if (r0 <= r1) goto L1bf
            r0 = r6
            org.lwjgl.util.glu.tessellation.PriorityQ$Leq r0 = r0.leq
            r1 = r6
            java.lang.Object[] r1 = r1.keys
            r2 = r6
            int[] r2 = r2.order
            r3 = r10
            r4 = 1
            int r3 = r3 - r4
            r2 = r2[r3]
            r1 = r1[r2]
            r2 = r6
            java.lang.Object[] r2 = r2.keys
            r3 = r11
            r2 = r2[r3]
            boolean r0 = LT(r0, r1, r2)
            if (r0 == 0) goto L1bf
            r0 = r6
            int[] r0 = r0.order
            r1 = r10
            r2 = r6
            int[] r2 = r2.order
            r3 = r10
            r4 = 1
            int r3 = r3 - r4
            r2 = r2[r3]
            r0[r1] = r2
            int r10 = r10 + (-1)
            goto L184
        L1bf:
            r0 = r6
            int[] r0 = r0.order
            r1 = r10
            r2 = r11
            r0[r1] = r2
            int r9 = r9 + 1
            goto L174
        L1ce:
            r0 = r6
            r1 = r6
            int r1 = r1.size
            r0.max = r1
            r0 = r6
            r1 = 1
            r0.initialized = r1
            r0 = r6
            org.lwjgl.util.glu.tessellation.PriorityQHeap r0 = r0.heap
            boolean r0 = r0.pqInit()
            r0 = 1
            return r0
    }

    @Override // org.lwjgl.util.glu.tessellation.PriorityQ
    int pqInsert(java.lang.Object r7) {
            r6 = this;
            r0 = r6
            boolean r0 = r0.initialized
            if (r0 == 0) goto L10
            r0 = r6
            org.lwjgl.util.glu.tessellation.PriorityQHeap r0 = r0.heap
            r1 = r7
            int r0 = r0.pqInsert(r1)
            return r0
        L10:
            r0 = r6
            int r0 = r0.size
            r8 = r0
            r0 = r6
            r1 = r0
            int r1 = r1.size
            r2 = 1
            int r1 = r1 + r2
            r2 = r1; r1 = r0; r0 = r2; 
            r1.size = r2
            r1 = r6
            int r1 = r1.max
            if (r0 < r1) goto L64
            r0 = r6
            java.lang.Object[] r0 = r0.keys
            r9 = r0
            r0 = r6
            r1 = r0
            int r1 = r1.max
            r2 = 1
            int r1 = r1 << r2
            r0.max = r1
            r0 = r6
            int r0 = r0.max
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r10 = r0
            r0 = r6
            java.lang.Object[] r0 = r0.keys
            r1 = 0
            r2 = r10
            r3 = 0
            r4 = r6
            java.lang.Object[] r4 = r4.keys
            int r4 = r4.length
            java.lang.System.arraycopy(r0, r1, r2, r3, r4)
            r0 = r6
            r1 = r10
            r0.keys = r1
            r0 = r6
            java.lang.Object[] r0 = r0.keys
            if (r0 != 0) goto L64
            r0 = r6
            r1 = r9
            r0.keys = r1
            r0 = 2147483647(0x7fffffff, float:NaN)
            return r0
        L64:
            boolean r0 = org.lwjgl.util.glu.tessellation.PriorityQSort.$assertionsDisabled
            if (r0 != 0) goto L78
            r0 = r8
            r1 = 2147483647(0x7fffffff, float:NaN)
            if (r0 != r1) goto L78
            java.lang.AssertionError r0 = new java.lang.AssertionError
            r1 = r0
            r1.<init>()
            throw r0
        L78:
            r0 = r6
            java.lang.Object[] r0 = r0.keys
            r1 = r8
            r2 = r7
            r0[r1] = r2
            r0 = r8
            r1 = 1
            int r0 = r0 + r1
            int r0 = -r0
            return r0
    }

    @Override // org.lwjgl.util.glu.tessellation.PriorityQ
    java.lang.Object pqExtractMin() {
            r5 = this;
            r0 = r5
            int r0 = r0.size
            if (r0 != 0) goto Lf
            r0 = r5
            org.lwjgl.util.glu.tessellation.PriorityQHeap r0 = r0.heap
            java.lang.Object r0 = r0.pqExtractMin()
            return r0
        Lf:
            r0 = r5
            java.lang.Object[] r0 = r0.keys
            r1 = r5
            int[] r1 = r1.order
            r2 = r5
            int r2 = r2.size
            r3 = 1
            int r2 = r2 - r3
            r1 = r1[r2]
            r0 = r0[r1]
            r6 = r0
            r0 = r5
            org.lwjgl.util.glu.tessellation.PriorityQHeap r0 = r0.heap
            boolean r0 = r0.pqIsEmpty()
            if (r0 != 0) goto L46
            r0 = r5
            org.lwjgl.util.glu.tessellation.PriorityQHeap r0 = r0.heap
            java.lang.Object r0 = r0.pqMinimum()
            r7 = r0
            r0 = r5
            org.lwjgl.util.glu.tessellation.PriorityQ$Leq r0 = r0.leq
            r1 = r7
            r2 = r6
            boolean r0 = LEQ(r0, r1, r2)
            if (r0 == 0) goto L46
            r0 = r5
            org.lwjgl.util.glu.tessellation.PriorityQHeap r0 = r0.heap
            java.lang.Object r0 = r0.pqExtractMin()
            return r0
        L46:
            r0 = r5
            r1 = r0
            int r1 = r1.size
            r2 = 1
            int r1 = r1 - r2
            r0.size = r1
            r0 = r5
            int r0 = r0.size
            if (r0 <= 0) goto L6a
            r0 = r5
            java.lang.Object[] r0 = r0.keys
            r1 = r5
            int[] r1 = r1.order
            r2 = r5
            int r2 = r2.size
            r3 = 1
            int r2 = r2 - r3
            r1 = r1[r2]
            r0 = r0[r1]
            if (r0 == 0) goto L46
        L6a:
            r0 = r6
            return r0
    }

    @Override // org.lwjgl.util.glu.tessellation.PriorityQ
    java.lang.Object pqMinimum() {
            r5 = this;
            r0 = r5
            int r0 = r0.size
            if (r0 != 0) goto Lf
            r0 = r5
            org.lwjgl.util.glu.tessellation.PriorityQHeap r0 = r0.heap
            java.lang.Object r0 = r0.pqMinimum()
            return r0
        Lf:
            r0 = r5
            java.lang.Object[] r0 = r0.keys
            r1 = r5
            int[] r1 = r1.order
            r2 = r5
            int r2 = r2.size
            r3 = 1
            int r2 = r2 - r3
            r1 = r1[r2]
            r0 = r0[r1]
            r6 = r0
            r0 = r5
            org.lwjgl.util.glu.tessellation.PriorityQHeap r0 = r0.heap
            boolean r0 = r0.pqIsEmpty()
            if (r0 != 0) goto L40
            r0 = r5
            org.lwjgl.util.glu.tessellation.PriorityQHeap r0 = r0.heap
            java.lang.Object r0 = r0.pqMinimum()
            r7 = r0
            r0 = r5
            org.lwjgl.util.glu.tessellation.PriorityQ$Leq r0 = r0.leq
            r1 = r7
            r2 = r6
            boolean r0 = org.lwjgl.util.glu.tessellation.PriorityQHeap.LEQ(r0, r1, r2)
            if (r0 == 0) goto L40
            r0 = r7
            return r0
        L40:
            r0 = r6
            return r0
    }

    @Override // org.lwjgl.util.glu.tessellation.PriorityQ
    boolean pqIsEmpty() {
            r2 = this;
            r0 = r2
            int r0 = r0.size
            if (r0 != 0) goto L15
            r0 = r2
            org.lwjgl.util.glu.tessellation.PriorityQHeap r0 = r0.heap
            boolean r0 = r0.pqIsEmpty()
            if (r0 == 0) goto L15
            r0 = 1
            goto L16
        L15:
            r0 = 0
        L16:
            return r0
    }

    @Override // org.lwjgl.util.glu.tessellation.PriorityQ
    void pqDelete(int r6) {
            r5 = this;
            r0 = r6
            if (r0 < 0) goto Ld
            r0 = r5
            org.lwjgl.util.glu.tessellation.PriorityQHeap r0 = r0.heap
            r1 = r6
            r0.pqDelete(r1)
            return
        Ld:
            r0 = r6
            r1 = 1
            int r0 = r0 + r1
            int r0 = -r0
            r6 = r0
            boolean r0 = org.lwjgl.util.glu.tessellation.PriorityQSort.$assertionsDisabled
            if (r0 != 0) goto L31
            r0 = r6
            r1 = r5
            int r1 = r1.max
            if (r0 >= r1) goto L29
            r0 = r5
            java.lang.Object[] r0 = r0.keys
            r1 = r6
            r0 = r0[r1]
            if (r0 != 0) goto L31
        L29:
            java.lang.AssertionError r0 = new java.lang.AssertionError
            r1 = r0
            r1.<init>()
            throw r0
        L31:
            r0 = r5
            java.lang.Object[] r0 = r0.keys
            r1 = r6
            r2 = 0
            r0[r1] = r2
        L38:
            r0 = r5
            int r0 = r0.size
            if (r0 <= 0) goto L5f
            r0 = r5
            java.lang.Object[] r0 = r0.keys
            r1 = r5
            int[] r1 = r1.order
            r2 = r5
            int r2 = r2.size
            r3 = 1
            int r2 = r2 - r3
            r1 = r1[r2]
            r0 = r0[r1]
            if (r0 != 0) goto L5f
            r0 = r5
            r1 = r0
            int r1 = r1.size
            r2 = 1
            int r1 = r1 - r2
            r0.size = r1
            goto L38
        L5f:
            return
    }

    static {
            java.lang.Class<org.lwjgl.util.glu.tessellation.PriorityQSort> r0 = org.lwjgl.util.glu.tessellation.PriorityQSort.class
            boolean r0 = r0.desiredAssertionStatus()
            if (r0 != 0) goto Lc
            r0 = 1
            goto Ld
        Lc:
            r0 = 0
        Ld:
            org.lwjgl.util.glu.tessellation.PriorityQSort.$assertionsDisabled = r0
            return
    }
}
