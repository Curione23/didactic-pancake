package org.lwjgl.util.glu.tessellation;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/util/glu/tessellation/Mesh.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/util/glu/tessellation/Mesh.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/util/glu/tessellation/Mesh.class */
class Mesh {
    static final /* synthetic */ boolean $assertionsDisabled = false;

    private Mesh() {
            r2 = this;
            r0 = r2
            r0.<init>()
            return
    }

    static org.lwjgl.util.glu.tessellation.GLUhalfEdge MakeEdge(org.lwjgl.util.glu.tessellation.GLUhalfEdge r4) {
            org.lwjgl.util.glu.tessellation.GLUhalfEdge r0 = new org.lwjgl.util.glu.tessellation.GLUhalfEdge
            r1 = r0
            r2 = 1
            r1.<init>(r2)
            r5 = r0
            org.lwjgl.util.glu.tessellation.GLUhalfEdge r0 = new org.lwjgl.util.glu.tessellation.GLUhalfEdge
            r1 = r0
            r2 = 0
            r1.<init>(r2)
            r6 = r0
            r0 = r4
            boolean r0 = r0.first
            if (r0 != 0) goto L1e
            r0 = r4
            org.lwjgl.util.glu.tessellation.GLUhalfEdge r0 = r0.Sym
            r4 = r0
        L1e:
            r0 = r4
            org.lwjgl.util.glu.tessellation.GLUhalfEdge r0 = r0.Sym
            org.lwjgl.util.glu.tessellation.GLUhalfEdge r0 = r0.next
            r7 = r0
            r0 = r6
            r1 = r7
            r0.next = r1
            r0 = r7
            org.lwjgl.util.glu.tessellation.GLUhalfEdge r0 = r0.Sym
            r1 = r5
            r0.next = r1
            r0 = r5
            r1 = r4
            r0.next = r1
            r0 = r4
            org.lwjgl.util.glu.tessellation.GLUhalfEdge r0 = r0.Sym
            r1 = r6
            r0.next = r1
            r0 = r5
            r1 = r6
            r0.Sym = r1
            r0 = r5
            r1 = r5
            r0.Onext = r1
            r0 = r5
            r1 = r6
            r0.Lnext = r1
            r0 = r5
            r1 = 0
            r0.Org = r1
            r0 = r5
            r1 = 0
            r0.Lface = r1
            r0 = r5
            r1 = 0
            r0.winding = r1
            r0 = r5
            r1 = 0
            r0.activeRegion = r1
            r0 = r6
            r1 = r5
            r0.Sym = r1
            r0 = r6
            r1 = r6
            r0.Onext = r1
            r0 = r6
            r1 = r5
            r0.Lnext = r1
            r0 = r6
            r1 = 0
            r0.Org = r1
            r0 = r6
            r1 = 0
            r0.Lface = r1
            r0 = r6
            r1 = 0
            r0.winding = r1
            r0 = r6
            r1 = 0
            r0.activeRegion = r1
            r0 = r5
            return r0
    }

    static void Splice(org.lwjgl.util.glu.tessellation.GLUhalfEdge r3, org.lwjgl.util.glu.tessellation.GLUhalfEdge r4) {
            r0 = r3
            org.lwjgl.util.glu.tessellation.GLUhalfEdge r0 = r0.Onext
            r5 = r0
            r0 = r4
            org.lwjgl.util.glu.tessellation.GLUhalfEdge r0 = r0.Onext
            r6 = r0
            r0 = r5
            org.lwjgl.util.glu.tessellation.GLUhalfEdge r0 = r0.Sym
            r1 = r4
            r0.Lnext = r1
            r0 = r6
            org.lwjgl.util.glu.tessellation.GLUhalfEdge r0 = r0.Sym
            r1 = r3
            r0.Lnext = r1
            r0 = r3
            r1 = r6
            r0.Onext = r1
            r0 = r4
            r1 = r5
            r0.Onext = r1
            return
    }

    static void MakeVertex(org.lwjgl.util.glu.tessellation.GLUvertex r3, org.lwjgl.util.glu.tessellation.GLUhalfEdge r4, org.lwjgl.util.glu.tessellation.GLUvertex r5) {
            r0 = r3
            r8 = r0
            boolean r0 = org.lwjgl.util.glu.tessellation.Mesh.$assertionsDisabled
            if (r0 != 0) goto L16
            r0 = r8
            if (r0 != 0) goto L16
            java.lang.AssertionError r0 = new java.lang.AssertionError
            r1 = r0
            r1.<init>()
            throw r0
        L16:
            r0 = r5
            org.lwjgl.util.glu.tessellation.GLUvertex r0 = r0.prev
            r7 = r0
            r0 = r8
            r1 = r7
            r0.prev = r1
            r0 = r7
            r1 = r8
            r0.next = r1
            r0 = r8
            r1 = r5
            r0.next = r1
            r0 = r5
            r1 = r8
            r0.prev = r1
            r0 = r8
            r1 = r4
            r0.anEdge = r1
            r0 = r8
            r1 = 0
            r0.data = r1
            r0 = r4
            r6 = r0
        L44:
            r0 = r6
            r1 = r8
            r0.Org = r1
            r0 = r6
            org.lwjgl.util.glu.tessellation.GLUhalfEdge r0 = r0.Onext
            r6 = r0
            r0 = r6
            r1 = r4
            if (r0 != r1) goto L44
            return
    }

    static void MakeFace(org.lwjgl.util.glu.tessellation.GLUface r3, org.lwjgl.util.glu.tessellation.GLUhalfEdge r4, org.lwjgl.util.glu.tessellation.GLUface r5) {
            r0 = r3
            r8 = r0
            boolean r0 = org.lwjgl.util.glu.tessellation.Mesh.$assertionsDisabled
            if (r0 != 0) goto L16
            r0 = r8
            if (r0 != 0) goto L16
            java.lang.AssertionError r0 = new java.lang.AssertionError
            r1 = r0
            r1.<init>()
            throw r0
        L16:
            r0 = r5
            org.lwjgl.util.glu.tessellation.GLUface r0 = r0.prev
            r7 = r0
            r0 = r8
            r1 = r7
            r0.prev = r1
            r0 = r7
            r1 = r8
            r0.next = r1
            r0 = r8
            r1 = r5
            r0.next = r1
            r0 = r5
            r1 = r8
            r0.prev = r1
            r0 = r8
            r1 = r4
            r0.anEdge = r1
            r0 = r8
            r1 = 0
            r0.data = r1
            r0 = r8
            r1 = 0
            r0.trail = r1
            r0 = r8
            r1 = 0
            r0.marked = r1
            r0 = r8
            r1 = r5
            boolean r1 = r1.inside
            r0.inside = r1
            r0 = r4
            r6 = r0
        L59:
            r0 = r6
            r1 = r8
            r0.Lface = r1
            r0 = r6
            org.lwjgl.util.glu.tessellation.GLUhalfEdge r0 = r0.Lnext
            r6 = r0
            r0 = r6
            r1 = r4
            if (r0 != r1) goto L59
            return
    }

    static void KillEdge(org.lwjgl.util.glu.tessellation.GLUhalfEdge r3) {
            r0 = r3
            boolean r0 = r0.first
            if (r0 != 0) goto Lc
            r0 = r3
            org.lwjgl.util.glu.tessellation.GLUhalfEdge r0 = r0.Sym
            r3 = r0
        Lc:
            r0 = r3
            org.lwjgl.util.glu.tessellation.GLUhalfEdge r0 = r0.next
            r5 = r0
            r0 = r3
            org.lwjgl.util.glu.tessellation.GLUhalfEdge r0 = r0.Sym
            org.lwjgl.util.glu.tessellation.GLUhalfEdge r0 = r0.next
            r4 = r0
            r0 = r5
            org.lwjgl.util.glu.tessellation.GLUhalfEdge r0 = r0.Sym
            r1 = r4
            r0.next = r1
            r0 = r4
            org.lwjgl.util.glu.tessellation.GLUhalfEdge r0 = r0.Sym
            r1 = r5
            r0.next = r1
            return
    }

    static void KillVertex(org.lwjgl.util.glu.tessellation.GLUvertex r3, org.lwjgl.util.glu.tessellation.GLUvertex r4) {
            r0 = r3
            org.lwjgl.util.glu.tessellation.GLUhalfEdge r0 = r0.anEdge
            r6 = r0
            r0 = r6
            r5 = r0
        L7:
            r0 = r5
            r1 = r4
            r0.Org = r1
            r0 = r5
            org.lwjgl.util.glu.tessellation.GLUhalfEdge r0 = r0.Onext
            r5 = r0
            r0 = r5
            r1 = r6
            if (r0 != r1) goto L7
            r0 = r3
            org.lwjgl.util.glu.tessellation.GLUvertex r0 = r0.prev
            r7 = r0
            r0 = r3
            org.lwjgl.util.glu.tessellation.GLUvertex r0 = r0.next
            r8 = r0
            r0 = r8
            r1 = r7
            r0.prev = r1
            r0 = r7
            r1 = r8
            r0.next = r1
            return
    }

    static void KillFace(org.lwjgl.util.glu.tessellation.GLUface r3, org.lwjgl.util.glu.tessellation.GLUface r4) {
            r0 = r3
            org.lwjgl.util.glu.tessellation.GLUhalfEdge r0 = r0.anEdge
            r6 = r0
            r0 = r6
            r5 = r0
        L7:
            r0 = r5
            r1 = r4
            r0.Lface = r1
            r0 = r5
            org.lwjgl.util.glu.tessellation.GLUhalfEdge r0 = r0.Lnext
            r5 = r0
            r0 = r5
            r1 = r6
            if (r0 != r1) goto L7
            r0 = r3
            org.lwjgl.util.glu.tessellation.GLUface r0 = r0.prev
            r7 = r0
            r0 = r3
            org.lwjgl.util.glu.tessellation.GLUface r0 = r0.next
            r8 = r0
            r0 = r8
            r1 = r7
            r0.prev = r1
            r0 = r7
            r1 = r8
            r0.next = r1
            return
    }

    public static org.lwjgl.util.glu.tessellation.GLUhalfEdge __gl_meshMakeEdge(org.lwjgl.util.glu.tessellation.GLUmesh r4) {
            org.lwjgl.util.glu.tessellation.GLUvertex r0 = new org.lwjgl.util.glu.tessellation.GLUvertex
            r1 = r0
            r1.<init>()
            r5 = r0
            org.lwjgl.util.glu.tessellation.GLUvertex r0 = new org.lwjgl.util.glu.tessellation.GLUvertex
            r1 = r0
            r1.<init>()
            r6 = r0
            org.lwjgl.util.glu.tessellation.GLUface r0 = new org.lwjgl.util.glu.tessellation.GLUface
            r1 = r0
            r1.<init>()
            r7 = r0
            r0 = r4
            org.lwjgl.util.glu.tessellation.GLUhalfEdge r0 = r0.eHead
            org.lwjgl.util.glu.tessellation.GLUhalfEdge r0 = MakeEdge(r0)
            r8 = r0
            r0 = r8
            if (r0 != 0) goto L28
            r0 = 0
            return r0
        L28:
            r0 = r5
            r1 = r8
            r2 = r4
            org.lwjgl.util.glu.tessellation.GLUvertex r2 = r2.vHead
            MakeVertex(r0, r1, r2)
            r0 = r6
            r1 = r8
            org.lwjgl.util.glu.tessellation.GLUhalfEdge r1 = r1.Sym
            r2 = r4
            org.lwjgl.util.glu.tessellation.GLUvertex r2 = r2.vHead
            MakeVertex(r0, r1, r2)
            r0 = r7
            r1 = r8
            r2 = r4
            org.lwjgl.util.glu.tessellation.GLUface r2 = r2.fHead
            MakeFace(r0, r1, r2)
            r0 = r8
            return r0
    }

    public static boolean __gl_meshSplice(org.lwjgl.util.glu.tessellation.GLUhalfEdge r4, org.lwjgl.util.glu.tessellation.GLUhalfEdge r5) {
            r0 = 0
            r6 = r0
            r0 = 0
            r7 = r0
            r0 = r4
            r1 = r5
            if (r0 != r1) goto Lb
            r0 = 1
            return r0
        Lb:
            r0 = r5
            org.lwjgl.util.glu.tessellation.GLUvertex r0 = r0.Org
            r1 = r4
            org.lwjgl.util.glu.tessellation.GLUvertex r1 = r1.Org
            if (r0 == r1) goto L23
            r0 = 1
            r7 = r0
            r0 = r5
            org.lwjgl.util.glu.tessellation.GLUvertex r0 = r0.Org
            r1 = r4
            org.lwjgl.util.glu.tessellation.GLUvertex r1 = r1.Org
            KillVertex(r0, r1)
        L23:
            r0 = r5
            org.lwjgl.util.glu.tessellation.GLUface r0 = r0.Lface
            r1 = r4
            org.lwjgl.util.glu.tessellation.GLUface r1 = r1.Lface
            if (r0 == r1) goto L3b
            r0 = 1
            r6 = r0
            r0 = r5
            org.lwjgl.util.glu.tessellation.GLUface r0 = r0.Lface
            r1 = r4
            org.lwjgl.util.glu.tessellation.GLUface r1 = r1.Lface
            KillFace(r0, r1)
        L3b:
            r0 = r5
            r1 = r4
            Splice(r0, r1)
            r0 = r7
            if (r0 != 0) goto L5f
            org.lwjgl.util.glu.tessellation.GLUvertex r0 = new org.lwjgl.util.glu.tessellation.GLUvertex
            r1 = r0
            r1.<init>()
            r8 = r0
            r0 = r8
            r1 = r5
            r2 = r4
            org.lwjgl.util.glu.tessellation.GLUvertex r2 = r2.Org
            MakeVertex(r0, r1, r2)
            r0 = r4
            org.lwjgl.util.glu.tessellation.GLUvertex r0 = r0.Org
            r1 = r4
            r0.anEdge = r1
        L5f:
            r0 = r6
            if (r0 != 0) goto L7e
            org.lwjgl.util.glu.tessellation.GLUface r0 = new org.lwjgl.util.glu.tessellation.GLUface
            r1 = r0
            r1.<init>()
            r8 = r0
            r0 = r8
            r1 = r5
            r2 = r4
            org.lwjgl.util.glu.tessellation.GLUface r2 = r2.Lface
            MakeFace(r0, r1, r2)
            r0 = r4
            org.lwjgl.util.glu.tessellation.GLUface r0 = r0.Lface
            r1 = r4
            r0.anEdge = r1
        L7e:
            r0 = 1
            return r0
    }

    static boolean __gl_meshDelete(org.lwjgl.util.glu.tessellation.GLUhalfEdge r4) {
            r0 = r4
            org.lwjgl.util.glu.tessellation.GLUhalfEdge r0 = r0.Sym
            r5 = r0
            r0 = 0
            r6 = r0
            r0 = r4
            org.lwjgl.util.glu.tessellation.GLUface r0 = r0.Lface
            r1 = r4
            org.lwjgl.util.glu.tessellation.GLUhalfEdge r1 = r1.Sym
            org.lwjgl.util.glu.tessellation.GLUface r1 = r1.Lface
            if (r0 == r1) goto L25
            r0 = 1
            r6 = r0
            r0 = r4
            org.lwjgl.util.glu.tessellation.GLUface r0 = r0.Lface
            r1 = r4
            org.lwjgl.util.glu.tessellation.GLUhalfEdge r1 = r1.Sym
            org.lwjgl.util.glu.tessellation.GLUface r1 = r1.Lface
            KillFace(r0, r1)
        L25:
            r0 = r4
            org.lwjgl.util.glu.tessellation.GLUhalfEdge r0 = r0.Onext
            r1 = r4
            if (r0 != r1) goto L38
            r0 = r4
            org.lwjgl.util.glu.tessellation.GLUvertex r0 = r0.Org
            r1 = 0
            KillVertex(r0, r1)
            goto L74
        L38:
            r0 = r4
            org.lwjgl.util.glu.tessellation.GLUhalfEdge r0 = r0.Sym
            org.lwjgl.util.glu.tessellation.GLUface r0 = r0.Lface
            r1 = r4
            org.lwjgl.util.glu.tessellation.GLUhalfEdge r1 = r1.Sym
            org.lwjgl.util.glu.tessellation.GLUhalfEdge r1 = r1.Lnext
            r0.anEdge = r1
            r0 = r4
            org.lwjgl.util.glu.tessellation.GLUvertex r0 = r0.Org
            r1 = r4
            org.lwjgl.util.glu.tessellation.GLUhalfEdge r1 = r1.Onext
            r0.anEdge = r1
            r0 = r4
            r1 = r4
            org.lwjgl.util.glu.tessellation.GLUhalfEdge r1 = r1.Sym
            org.lwjgl.util.glu.tessellation.GLUhalfEdge r1 = r1.Lnext
            Splice(r0, r1)
            r0 = r6
            if (r0 != 0) goto L74
            org.lwjgl.util.glu.tessellation.GLUface r0 = new org.lwjgl.util.glu.tessellation.GLUface
            r1 = r0
            r1.<init>()
            r7 = r0
            r0 = r7
            r1 = r4
            r2 = r4
            org.lwjgl.util.glu.tessellation.GLUface r2 = r2.Lface
            MakeFace(r0, r1, r2)
        L74:
            r0 = r5
            org.lwjgl.util.glu.tessellation.GLUhalfEdge r0 = r0.Onext
            r1 = r5
            if (r0 != r1) goto L8f
            r0 = r5
            org.lwjgl.util.glu.tessellation.GLUvertex r0 = r0.Org
            r1 = 0
            KillVertex(r0, r1)
            r0 = r5
            org.lwjgl.util.glu.tessellation.GLUface r0 = r0.Lface
            r1 = 0
            KillFace(r0, r1)
            goto Lb3
        L8f:
            r0 = r4
            org.lwjgl.util.glu.tessellation.GLUface r0 = r0.Lface
            r1 = r5
            org.lwjgl.util.glu.tessellation.GLUhalfEdge r1 = r1.Sym
            org.lwjgl.util.glu.tessellation.GLUhalfEdge r1 = r1.Lnext
            r0.anEdge = r1
            r0 = r5
            org.lwjgl.util.glu.tessellation.GLUvertex r0 = r0.Org
            r1 = r5
            org.lwjgl.util.glu.tessellation.GLUhalfEdge r1 = r1.Onext
            r0.anEdge = r1
            r0 = r5
            r1 = r5
            org.lwjgl.util.glu.tessellation.GLUhalfEdge r1 = r1.Sym
            org.lwjgl.util.glu.tessellation.GLUhalfEdge r1 = r1.Lnext
            Splice(r0, r1)
        Lb3:
            r0 = r4
            KillEdge(r0)
            r0 = 1
            return r0
    }

    static org.lwjgl.util.glu.tessellation.GLUhalfEdge __gl_meshAddEdgeVertex(org.lwjgl.util.glu.tessellation.GLUhalfEdge r5) {
            r0 = r5
            org.lwjgl.util.glu.tessellation.GLUhalfEdge r0 = MakeEdge(r0)
            r7 = r0
            r0 = r7
            org.lwjgl.util.glu.tessellation.GLUhalfEdge r0 = r0.Sym
            r6 = r0
            r0 = r7
            r1 = r5
            org.lwjgl.util.glu.tessellation.GLUhalfEdge r1 = r1.Lnext
            Splice(r0, r1)
            r0 = r7
            r1 = r5
            org.lwjgl.util.glu.tessellation.GLUhalfEdge r1 = r1.Sym
            org.lwjgl.util.glu.tessellation.GLUvertex r1 = r1.Org
            r0.Org = r1
            org.lwjgl.util.glu.tessellation.GLUvertex r0 = new org.lwjgl.util.glu.tessellation.GLUvertex
            r1 = r0
            r1.<init>()
            r8 = r0
            r0 = r8
            r1 = r6
            r2 = r7
            org.lwjgl.util.glu.tessellation.GLUvertex r2 = r2.Org
            MakeVertex(r0, r1, r2)
            r0 = r7
            r1 = r6
            r2 = r5
            org.lwjgl.util.glu.tessellation.GLUface r2 = r2.Lface
            r3 = r2; r2 = r1; r1 = r3; 
            r2.Lface = r3
            r0.Lface = r1
            r0 = r7
            return r0
    }

    public static org.lwjgl.util.glu.tessellation.GLUhalfEdge __gl_meshSplitEdge(org.lwjgl.util.glu.tessellation.GLUhalfEdge r3) {
            r0 = r3
            org.lwjgl.util.glu.tessellation.GLUhalfEdge r0 = __gl_meshAddEdgeVertex(r0)
            r5 = r0
            r0 = r5
            org.lwjgl.util.glu.tessellation.GLUhalfEdge r0 = r0.Sym
            r4 = r0
            r0 = r3
            org.lwjgl.util.glu.tessellation.GLUhalfEdge r0 = r0.Sym
            r1 = r3
            org.lwjgl.util.glu.tessellation.GLUhalfEdge r1 = r1.Sym
            org.lwjgl.util.glu.tessellation.GLUhalfEdge r1 = r1.Sym
            org.lwjgl.util.glu.tessellation.GLUhalfEdge r1 = r1.Lnext
            Splice(r0, r1)
            r0 = r3
            org.lwjgl.util.glu.tessellation.GLUhalfEdge r0 = r0.Sym
            r1 = r4
            Splice(r0, r1)
            r0 = r3
            org.lwjgl.util.glu.tessellation.GLUhalfEdge r0 = r0.Sym
            r1 = r4
            org.lwjgl.util.glu.tessellation.GLUvertex r1 = r1.Org
            r0.Org = r1
            r0 = r4
            org.lwjgl.util.glu.tessellation.GLUhalfEdge r0 = r0.Sym
            org.lwjgl.util.glu.tessellation.GLUvertex r0 = r0.Org
            r1 = r4
            org.lwjgl.util.glu.tessellation.GLUhalfEdge r1 = r1.Sym
            r0.anEdge = r1
            r0 = r4
            org.lwjgl.util.glu.tessellation.GLUhalfEdge r0 = r0.Sym
            r1 = r3
            org.lwjgl.util.glu.tessellation.GLUhalfEdge r1 = r1.Sym
            org.lwjgl.util.glu.tessellation.GLUface r1 = r1.Lface
            r0.Lface = r1
            r0 = r4
            r1 = r3
            int r1 = r1.winding
            r0.winding = r1
            r0 = r4
            org.lwjgl.util.glu.tessellation.GLUhalfEdge r0 = r0.Sym
            r1 = r3
            org.lwjgl.util.glu.tessellation.GLUhalfEdge r1 = r1.Sym
            int r1 = r1.winding
            r0.winding = r1
            r0 = r4
            return r0
    }

    static org.lwjgl.util.glu.tessellation.GLUhalfEdge __gl_meshConnect(org.lwjgl.util.glu.tessellation.GLUhalfEdge r5, org.lwjgl.util.glu.tessellation.GLUhalfEdge r6) {
            r0 = 0
            r8 = r0
            r0 = r5
            org.lwjgl.util.glu.tessellation.GLUhalfEdge r0 = MakeEdge(r0)
            r9 = r0
            r0 = r9
            org.lwjgl.util.glu.tessellation.GLUhalfEdge r0 = r0.Sym
            r7 = r0
            r0 = r6
            org.lwjgl.util.glu.tessellation.GLUface r0 = r0.Lface
            r1 = r5
            org.lwjgl.util.glu.tessellation.GLUface r1 = r1.Lface
            if (r0 == r1) goto L26
            r0 = 1
            r8 = r0
            r0 = r6
            org.lwjgl.util.glu.tessellation.GLUface r0 = r0.Lface
            r1 = r5
            org.lwjgl.util.glu.tessellation.GLUface r1 = r1.Lface
            KillFace(r0, r1)
        L26:
            r0 = r9
            r1 = r5
            org.lwjgl.util.glu.tessellation.GLUhalfEdge r1 = r1.Lnext
            Splice(r0, r1)
            r0 = r7
            r1 = r6
            Splice(r0, r1)
            r0 = r9
            r1 = r5
            org.lwjgl.util.glu.tessellation.GLUhalfEdge r1 = r1.Sym
            org.lwjgl.util.glu.tessellation.GLUvertex r1 = r1.Org
            r0.Org = r1
            r0 = r7
            r1 = r6
            org.lwjgl.util.glu.tessellation.GLUvertex r1 = r1.Org
            r0.Org = r1
            r0 = r9
            r1 = r7
            r2 = r5
            org.lwjgl.util.glu.tessellation.GLUface r2 = r2.Lface
            r3 = r2; r2 = r1; r1 = r3; 
            r2.Lface = r3
            r0.Lface = r1
            r0 = r5
            org.lwjgl.util.glu.tessellation.GLUface r0 = r0.Lface
            r1 = r7
            r0.anEdge = r1
            r0 = r8
            if (r0 != 0) goto L76
            org.lwjgl.util.glu.tessellation.GLUface r0 = new org.lwjgl.util.glu.tessellation.GLUface
            r1 = r0
            r1.<init>()
            r10 = r0
            r0 = r10
            r1 = r9
            r2 = r5
            org.lwjgl.util.glu.tessellation.GLUface r2 = r2.Lface
            MakeFace(r0, r1, r2)
        L76:
            r0 = r9
            return r0
    }

    static void __gl_meshZapFace(org.lwjgl.util.glu.tessellation.GLUface r3) {
            r0 = r3
            org.lwjgl.util.glu.tessellation.GLUhalfEdge r0 = r0.anEdge
            r4 = r0
            r0 = r4
            org.lwjgl.util.glu.tessellation.GLUhalfEdge r0 = r0.Lnext
            r6 = r0
        La:
            r0 = r6
            r5 = r0
            r0 = r5
            org.lwjgl.util.glu.tessellation.GLUhalfEdge r0 = r0.Lnext
            r6 = r0
            r0 = r5
            r1 = 0
            r0.Lface = r1
            r0 = r5
            org.lwjgl.util.glu.tessellation.GLUhalfEdge r0 = r0.Sym
            org.lwjgl.util.glu.tessellation.GLUface r0 = r0.Lface
            if (r0 != 0) goto L83
            r0 = r5
            org.lwjgl.util.glu.tessellation.GLUhalfEdge r0 = r0.Onext
            r1 = r5
            if (r0 != r1) goto L33
            r0 = r5
            org.lwjgl.util.glu.tessellation.GLUvertex r0 = r0.Org
            r1 = 0
            KillVertex(r0, r1)
            goto L49
        L33:
            r0 = r5
            org.lwjgl.util.glu.tessellation.GLUvertex r0 = r0.Org
            r1 = r5
            org.lwjgl.util.glu.tessellation.GLUhalfEdge r1 = r1.Onext
            r0.anEdge = r1
            r0 = r5
            r1 = r5
            org.lwjgl.util.glu.tessellation.GLUhalfEdge r1 = r1.Sym
            org.lwjgl.util.glu.tessellation.GLUhalfEdge r1 = r1.Lnext
            Splice(r0, r1)
        L49:
            r0 = r5
            org.lwjgl.util.glu.tessellation.GLUhalfEdge r0 = r0.Sym
            r7 = r0
            r0 = r7
            org.lwjgl.util.glu.tessellation.GLUhalfEdge r0 = r0.Onext
            r1 = r7
            if (r0 != r1) goto L65
            r0 = r7
            org.lwjgl.util.glu.tessellation.GLUvertex r0 = r0.Org
            r1 = 0
            KillVertex(r0, r1)
            goto L7f
        L65:
            r0 = r7
            org.lwjgl.util.glu.tessellation.GLUvertex r0 = r0.Org
            r1 = r7
            org.lwjgl.util.glu.tessellation.GLUhalfEdge r1 = r1.Onext
            r0.anEdge = r1
            r0 = r7
            r1 = r7
            org.lwjgl.util.glu.tessellation.GLUhalfEdge r1 = r1.Sym
            org.lwjgl.util.glu.tessellation.GLUhalfEdge r1 = r1.Lnext
            Splice(r0, r1)
        L7f:
            r0 = r5
            KillEdge(r0)
        L83:
            r0 = r5
            r1 = r4
            if (r0 != r1) goto La
            r0 = r3
            org.lwjgl.util.glu.tessellation.GLUface r0 = r0.prev
            r8 = r0
            r0 = r3
            org.lwjgl.util.glu.tessellation.GLUface r0 = r0.next
            r9 = r0
            r0 = r9
            r1 = r8
            r0.prev = r1
            r0 = r8
            r1 = r9
            r0.next = r1
            return
    }

    public static org.lwjgl.util.glu.tessellation.GLUmesh __gl_meshNewMesh() {
            org.lwjgl.util.glu.tessellation.GLUmesh r0 = new org.lwjgl.util.glu.tessellation.GLUmesh
            r1 = r0
            r1.<init>()
            r9 = r0
            r0 = r9
            org.lwjgl.util.glu.tessellation.GLUvertex r0 = r0.vHead
            r5 = r0
            r0 = r9
            org.lwjgl.util.glu.tessellation.GLUface r0 = r0.fHead
            r6 = r0
            r0 = r9
            org.lwjgl.util.glu.tessellation.GLUhalfEdge r0 = r0.eHead
            r7 = r0
            r0 = r9
            org.lwjgl.util.glu.tessellation.GLUhalfEdge r0 = r0.eHeadSym
            r8 = r0
            r0 = r5
            r1 = r5
            r2 = r5
            r3 = r2; r2 = r1; r1 = r3; 
            r2.prev = r3
            r0.next = r1
            r0 = r5
            r1 = 0
            r0.anEdge = r1
            r0 = r5
            r1 = 0
            r0.data = r1
            r0 = r6
            r1 = r6
            r2 = r6
            r3 = r2; r2 = r1; r1 = r3; 
            r2.prev = r3
            r0.next = r1
            r0 = r6
            r1 = 0
            r0.anEdge = r1
            r0 = r6
            r1 = 0
            r0.data = r1
            r0 = r6
            r1 = 0
            r0.trail = r1
            r0 = r6
            r1 = 0
            r0.marked = r1
            r0 = r6
            r1 = 0
            r0.inside = r1
            r0 = r7
            r1 = r7
            r0.next = r1
            r0 = r7
            r1 = r8
            r0.Sym = r1
            r0 = r7
            r1 = 0
            r0.Onext = r1
            r0 = r7
            r1 = 0
            r0.Lnext = r1
            r0 = r7
            r1 = 0
            r0.Org = r1
            r0 = r7
            r1 = 0
            r0.Lface = r1
            r0 = r7
            r1 = 0
            r0.winding = r1
            r0 = r7
            r1 = 0
            r0.activeRegion = r1
            r0 = r8
            r1 = r8
            r0.next = r1
            r0 = r8
            r1 = r7
            r0.Sym = r1
            r0 = r8
            r1 = 0
            r0.Onext = r1
            r0 = r8
            r1 = 0
            r0.Lnext = r1
            r0 = r8
            r1 = 0
            r0.Org = r1
            r0 = r8
            r1 = 0
            r0.Lface = r1
            r0 = r8
            r1 = 0
            r0.winding = r1
            r0 = r8
            r1 = 0
            r0.activeRegion = r1
            r0 = r9
            return r0
    }

    static org.lwjgl.util.glu.tessellation.GLUmesh __gl_meshUnion(org.lwjgl.util.glu.tessellation.GLUmesh r3, org.lwjgl.util.glu.tessellation.GLUmesh r4) {
            r0 = r3
            org.lwjgl.util.glu.tessellation.GLUface r0 = r0.fHead
            r5 = r0
            r0 = r3
            org.lwjgl.util.glu.tessellation.GLUvertex r0 = r0.vHead
            r6 = r0
            r0 = r3
            org.lwjgl.util.glu.tessellation.GLUhalfEdge r0 = r0.eHead
            r7 = r0
            r0 = r4
            org.lwjgl.util.glu.tessellation.GLUface r0 = r0.fHead
            r8 = r0
            r0 = r4
            org.lwjgl.util.glu.tessellation.GLUvertex r0 = r0.vHead
            r9 = r0
            r0 = r4
            org.lwjgl.util.glu.tessellation.GLUhalfEdge r0 = r0.eHead
            r10 = r0
            r0 = r8
            org.lwjgl.util.glu.tessellation.GLUface r0 = r0.next
            r1 = r8
            if (r0 == r1) goto L56
            r0 = r5
            org.lwjgl.util.glu.tessellation.GLUface r0 = r0.prev
            r1 = r8
            org.lwjgl.util.glu.tessellation.GLUface r1 = r1.next
            r0.next = r1
            r0 = r8
            org.lwjgl.util.glu.tessellation.GLUface r0 = r0.next
            r1 = r5
            org.lwjgl.util.glu.tessellation.GLUface r1 = r1.prev
            r0.prev = r1
            r0 = r8
            org.lwjgl.util.glu.tessellation.GLUface r0 = r0.prev
            r1 = r5
            r0.next = r1
            r0 = r5
            r1 = r8
            org.lwjgl.util.glu.tessellation.GLUface r1 = r1.prev
            r0.prev = r1
        L56:
            r0 = r9
            org.lwjgl.util.glu.tessellation.GLUvertex r0 = r0.next
            r1 = r9
            if (r0 == r1) goto L8a
            r0 = r6
            org.lwjgl.util.glu.tessellation.GLUvertex r0 = r0.prev
            r1 = r9
            org.lwjgl.util.glu.tessellation.GLUvertex r1 = r1.next
            r0.next = r1
            r0 = r9
            org.lwjgl.util.glu.tessellation.GLUvertex r0 = r0.next
            r1 = r6
            org.lwjgl.util.glu.tessellation.GLUvertex r1 = r1.prev
            r0.prev = r1
            r0 = r9
            org.lwjgl.util.glu.tessellation.GLUvertex r0 = r0.prev
            r1 = r6
            r0.next = r1
            r0 = r6
            r1 = r9
            org.lwjgl.util.glu.tessellation.GLUvertex r1 = r1.prev
            r0.prev = r1
        L8a:
            r0 = r10
            org.lwjgl.util.glu.tessellation.GLUhalfEdge r0 = r0.next
            r1 = r10
            if (r0 == r1) goto Lda
            r0 = r7
            org.lwjgl.util.glu.tessellation.GLUhalfEdge r0 = r0.Sym
            org.lwjgl.util.glu.tessellation.GLUhalfEdge r0 = r0.next
            org.lwjgl.util.glu.tessellation.GLUhalfEdge r0 = r0.Sym
            r1 = r10
            org.lwjgl.util.glu.tessellation.GLUhalfEdge r1 = r1.next
            r0.next = r1
            r0 = r10
            org.lwjgl.util.glu.tessellation.GLUhalfEdge r0 = r0.next
            org.lwjgl.util.glu.tessellation.GLUhalfEdge r0 = r0.Sym
            r1 = r7
            org.lwjgl.util.glu.tessellation.GLUhalfEdge r1 = r1.Sym
            org.lwjgl.util.glu.tessellation.GLUhalfEdge r1 = r1.next
            r0.next = r1
            r0 = r10
            org.lwjgl.util.glu.tessellation.GLUhalfEdge r0 = r0.Sym
            org.lwjgl.util.glu.tessellation.GLUhalfEdge r0 = r0.next
            org.lwjgl.util.glu.tessellation.GLUhalfEdge r0 = r0.Sym
            r1 = r7
            r0.next = r1
            r0 = r7
            org.lwjgl.util.glu.tessellation.GLUhalfEdge r0 = r0.Sym
            r1 = r10
            org.lwjgl.util.glu.tessellation.GLUhalfEdge r1 = r1.Sym
            org.lwjgl.util.glu.tessellation.GLUhalfEdge r1 = r1.next
            r0.next = r1
        Lda:
            r0 = r3
            return r0
    }

    static void __gl_meshDeleteMeshZap(org.lwjgl.util.glu.tessellation.GLUmesh r3) {
            r0 = r3
            org.lwjgl.util.glu.tessellation.GLUface r0 = r0.fHead
            r4 = r0
        L5:
            r0 = r4
            org.lwjgl.util.glu.tessellation.GLUface r0 = r0.next
            r1 = r4
            if (r0 == r1) goto L17
            r0 = r4
            org.lwjgl.util.glu.tessellation.GLUface r0 = r0.next
            __gl_meshZapFace(r0)
            goto L5
        L17:
            boolean r0 = org.lwjgl.util.glu.tessellation.Mesh.$assertionsDisabled
            if (r0 != 0) goto L33
            r0 = r3
            org.lwjgl.util.glu.tessellation.GLUvertex r0 = r0.vHead
            org.lwjgl.util.glu.tessellation.GLUvertex r0 = r0.next
            r1 = r3
            org.lwjgl.util.glu.tessellation.GLUvertex r1 = r1.vHead
            if (r0 == r1) goto L33
            java.lang.AssertionError r0 = new java.lang.AssertionError
            r1 = r0
            r1.<init>()
            throw r0
        L33:
            return
    }

    public static void __gl_meshDeleteMesh(org.lwjgl.util.glu.tessellation.GLUmesh r3) {
            r0 = r3
            org.lwjgl.util.glu.tessellation.GLUface r0 = r0.fHead
            org.lwjgl.util.glu.tessellation.GLUface r0 = r0.next
            r4 = r0
        L8:
            r0 = r4
            r1 = r3
            org.lwjgl.util.glu.tessellation.GLUface r1 = r1.fHead
            if (r0 == r1) goto L1a
            r0 = r4
            org.lwjgl.util.glu.tessellation.GLUface r0 = r0.next
            r5 = r0
            r0 = r5
            r4 = r0
            goto L8
        L1a:
            r0 = r3
            org.lwjgl.util.glu.tessellation.GLUvertex r0 = r0.vHead
            org.lwjgl.util.glu.tessellation.GLUvertex r0 = r0.next
            r6 = r0
        L22:
            r0 = r6
            r1 = r3
            org.lwjgl.util.glu.tessellation.GLUvertex r1 = r1.vHead
            if (r0 == r1) goto L36
            r0 = r6
            org.lwjgl.util.glu.tessellation.GLUvertex r0 = r0.next
            r7 = r0
            r0 = r7
            r6 = r0
            goto L22
        L36:
            r0 = r3
            org.lwjgl.util.glu.tessellation.GLUhalfEdge r0 = r0.eHead
            org.lwjgl.util.glu.tessellation.GLUhalfEdge r0 = r0.next
            r8 = r0
        L3f:
            r0 = r8
            r1 = r3
            org.lwjgl.util.glu.tessellation.GLUhalfEdge r1 = r1.eHead
            if (r0 == r1) goto L56
            r0 = r8
            org.lwjgl.util.glu.tessellation.GLUhalfEdge r0 = r0.next
            r9 = r0
            r0 = r9
            r8 = r0
            goto L3f
        L56:
            return
    }

    public static void __gl_meshCheckMesh(org.lwjgl.util.glu.tessellation.GLUmesh r3) {
            r0 = r3
            org.lwjgl.util.glu.tessellation.GLUface r0 = r0.fHead
            r4 = r0
            r0 = r3
            org.lwjgl.util.glu.tessellation.GLUvertex r0 = r0.vHead
            r5 = r0
            r0 = r3
            org.lwjgl.util.glu.tessellation.GLUhalfEdge r0 = r0.eHead
            r6 = r0
            r0 = r4
            r8 = r0
            r0 = r4
            r8 = r0
        L15:
            r0 = r8
            org.lwjgl.util.glu.tessellation.GLUface r0 = r0.next
            r1 = r0
            r7 = r1
            r1 = r4
            if (r0 == r1) goto Ldf
            boolean r0 = org.lwjgl.util.glu.tessellation.Mesh.$assertionsDisabled
            if (r0 != 0) goto L39
            r0 = r7
            org.lwjgl.util.glu.tessellation.GLUface r0 = r0.prev
            r1 = r8
            if (r0 == r1) goto L39
            java.lang.AssertionError r0 = new java.lang.AssertionError
            r1 = r0
            r1.<init>()
            throw r0
        L39:
            r0 = r7
            org.lwjgl.util.glu.tessellation.GLUhalfEdge r0 = r0.anEdge
            r11 = r0
        L40:
            boolean r0 = org.lwjgl.util.glu.tessellation.Mesh.$assertionsDisabled
            if (r0 != 0) goto L58
            r0 = r11
            org.lwjgl.util.glu.tessellation.GLUhalfEdge r0 = r0.Sym
            r1 = r11
            if (r0 != r1) goto L58
            java.lang.AssertionError r0 = new java.lang.AssertionError
            r1 = r0
            r1.<init>()
            throw r0
        L58:
            boolean r0 = org.lwjgl.util.glu.tessellation.Mesh.$assertionsDisabled
            if (r0 != 0) goto L73
            r0 = r11
            org.lwjgl.util.glu.tessellation.GLUhalfEdge r0 = r0.Sym
            org.lwjgl.util.glu.tessellation.GLUhalfEdge r0 = r0.Sym
            r1 = r11
            if (r0 == r1) goto L73
            java.lang.AssertionError r0 = new java.lang.AssertionError
            r1 = r0
            r1.<init>()
            throw r0
        L73:
            boolean r0 = org.lwjgl.util.glu.tessellation.Mesh.$assertionsDisabled
            if (r0 != 0) goto L91
            r0 = r11
            org.lwjgl.util.glu.tessellation.GLUhalfEdge r0 = r0.Lnext
            org.lwjgl.util.glu.tessellation.GLUhalfEdge r0 = r0.Onext
            org.lwjgl.util.glu.tessellation.GLUhalfEdge r0 = r0.Sym
            r1 = r11
            if (r0 == r1) goto L91
            java.lang.AssertionError r0 = new java.lang.AssertionError
            r1 = r0
            r1.<init>()
            throw r0
        L91:
            boolean r0 = org.lwjgl.util.glu.tessellation.Mesh.$assertionsDisabled
            if (r0 != 0) goto Laf
            r0 = r11
            org.lwjgl.util.glu.tessellation.GLUhalfEdge r0 = r0.Onext
            org.lwjgl.util.glu.tessellation.GLUhalfEdge r0 = r0.Sym
            org.lwjgl.util.glu.tessellation.GLUhalfEdge r0 = r0.Lnext
            r1 = r11
            if (r0 == r1) goto Laf
            java.lang.AssertionError r0 = new java.lang.AssertionError
            r1 = r0
            r1.<init>()
            throw r0
        Laf:
            boolean r0 = org.lwjgl.util.glu.tessellation.Mesh.$assertionsDisabled
            if (r0 != 0) goto Lc7
            r0 = r11
            org.lwjgl.util.glu.tessellation.GLUface r0 = r0.Lface
            r1 = r7
            if (r0 == r1) goto Lc7
            java.lang.AssertionError r0 = new java.lang.AssertionError
            r1 = r0
            r1.<init>()
            throw r0
        Lc7:
            r0 = r11
            org.lwjgl.util.glu.tessellation.GLUhalfEdge r0 = r0.Lnext
            r11 = r0
            r0 = r11
            r1 = r7
            org.lwjgl.util.glu.tessellation.GLUhalfEdge r1 = r1.anEdge
            if (r0 != r1) goto L40
            r0 = r7
            r8 = r0
            goto L15
        Ldf:
            boolean r0 = org.lwjgl.util.glu.tessellation.Mesh.$assertionsDisabled
            if (r0 != 0) goto L107
            r0 = r7
            org.lwjgl.util.glu.tessellation.GLUface r0 = r0.prev
            r1 = r8
            if (r0 != r1) goto Lff
            r0 = r7
            org.lwjgl.util.glu.tessellation.GLUhalfEdge r0 = r0.anEdge
            if (r0 != 0) goto Lff
            r0 = r7
            java.lang.Object r0 = r0.data
            if (r0 == 0) goto L107
        Lff:
            java.lang.AssertionError r0 = new java.lang.AssertionError
            r1 = r0
            r1.<init>()
            throw r0
        L107:
            r0 = r5
            r10 = r0
            r0 = r5
            r10 = r0
        L10d:
            r0 = r10
            org.lwjgl.util.glu.tessellation.GLUvertex r0 = r0.next
            r1 = r0
            r9 = r1
            r1 = r5
            if (r0 == r1) goto L1d7
            boolean r0 = org.lwjgl.util.glu.tessellation.Mesh.$assertionsDisabled
            if (r0 != 0) goto L131
            r0 = r9
            org.lwjgl.util.glu.tessellation.GLUvertex r0 = r0.prev
            r1 = r10
            if (r0 == r1) goto L131
            java.lang.AssertionError r0 = new java.lang.AssertionError
            r1 = r0
            r1.<init>()
            throw r0
        L131:
            r0 = r9
            org.lwjgl.util.glu.tessellation.GLUhalfEdge r0 = r0.anEdge
            r11 = r0
        L138:
            boolean r0 = org.lwjgl.util.glu.tessellation.Mesh.$assertionsDisabled
            if (r0 != 0) goto L150
            r0 = r11
            org.lwjgl.util.glu.tessellation.GLUhalfEdge r0 = r0.Sym
            r1 = r11
            if (r0 != r1) goto L150
            java.lang.AssertionError r0 = new java.lang.AssertionError
            r1 = r0
            r1.<init>()
            throw r0
        L150:
            boolean r0 = org.lwjgl.util.glu.tessellation.Mesh.$assertionsDisabled
            if (r0 != 0) goto L16b
            r0 = r11
            org.lwjgl.util.glu.tessellation.GLUhalfEdge r0 = r0.Sym
            org.lwjgl.util.glu.tessellation.GLUhalfEdge r0 = r0.Sym
            r1 = r11
            if (r0 == r1) goto L16b
            java.lang.AssertionError r0 = new java.lang.AssertionError
            r1 = r0
            r1.<init>()
            throw r0
        L16b:
            boolean r0 = org.lwjgl.util.glu.tessellation.Mesh.$assertionsDisabled
            if (r0 != 0) goto L189
            r0 = r11
            org.lwjgl.util.glu.tessellation.GLUhalfEdge r0 = r0.Lnext
            org.lwjgl.util.glu.tessellation.GLUhalfEdge r0 = r0.Onext
            org.lwjgl.util.glu.tessellation.GLUhalfEdge r0 = r0.Sym
            r1 = r11
            if (r0 == r1) goto L189
            java.lang.AssertionError r0 = new java.lang.AssertionError
            r1 = r0
            r1.<init>()
            throw r0
        L189:
            boolean r0 = org.lwjgl.util.glu.tessellation.Mesh.$assertionsDisabled
            if (r0 != 0) goto L1a7
            r0 = r11
            org.lwjgl.util.glu.tessellation.GLUhalfEdge r0 = r0.Onext
            org.lwjgl.util.glu.tessellation.GLUhalfEdge r0 = r0.Sym
            org.lwjgl.util.glu.tessellation.GLUhalfEdge r0 = r0.Lnext
            r1 = r11
            if (r0 == r1) goto L1a7
            java.lang.AssertionError r0 = new java.lang.AssertionError
            r1 = r0
            r1.<init>()
            throw r0
        L1a7:
            boolean r0 = org.lwjgl.util.glu.tessellation.Mesh.$assertionsDisabled
            if (r0 != 0) goto L1bf
            r0 = r11
            org.lwjgl.util.glu.tessellation.GLUvertex r0 = r0.Org
            r1 = r9
            if (r0 == r1) goto L1bf
            java.lang.AssertionError r0 = new java.lang.AssertionError
            r1 = r0
            r1.<init>()
            throw r0
        L1bf:
            r0 = r11
            org.lwjgl.util.glu.tessellation.GLUhalfEdge r0 = r0.Onext
            r11 = r0
            r0 = r11
            r1 = r9
            org.lwjgl.util.glu.tessellation.GLUhalfEdge r1 = r1.anEdge
            if (r0 != r1) goto L138
            r0 = r9
            r10 = r0
            goto L10d
        L1d7:
            boolean r0 = org.lwjgl.util.glu.tessellation.Mesh.$assertionsDisabled
            if (r0 != 0) goto L1ff
            r0 = r9
            org.lwjgl.util.glu.tessellation.GLUvertex r0 = r0.prev
            r1 = r10
            if (r0 != r1) goto L1f7
            r0 = r9
            org.lwjgl.util.glu.tessellation.GLUhalfEdge r0 = r0.anEdge
            if (r0 != 0) goto L1f7
            r0 = r9
            java.lang.Object r0 = r0.data
            if (r0 == 0) goto L1ff
        L1f7:
            java.lang.AssertionError r0 = new java.lang.AssertionError
            r1 = r0
            r1.<init>()
            throw r0
        L1ff:
            r0 = r6
            r12 = r0
            r0 = r6
            r12 = r0
        L205:
            r0 = r12
            org.lwjgl.util.glu.tessellation.GLUhalfEdge r0 = r0.next
            r1 = r0
            r11 = r1
            r1 = r6
            if (r0 == r1) goto L2d4
            boolean r0 = org.lwjgl.util.glu.tessellation.Mesh.$assertionsDisabled
            if (r0 != 0) goto L22f
            r0 = r11
            org.lwjgl.util.glu.tessellation.GLUhalfEdge r0 = r0.Sym
            org.lwjgl.util.glu.tessellation.GLUhalfEdge r0 = r0.next
            r1 = r12
            org.lwjgl.util.glu.tessellation.GLUhalfEdge r1 = r1.Sym
            if (r0 == r1) goto L22f
            java.lang.AssertionError r0 = new java.lang.AssertionError
            r1 = r0
            r1.<init>()
            throw r0
        L22f:
            boolean r0 = org.lwjgl.util.glu.tessellation.Mesh.$assertionsDisabled
            if (r0 != 0) goto L247
            r0 = r11
            org.lwjgl.util.glu.tessellation.GLUhalfEdge r0 = r0.Sym
            r1 = r11
            if (r0 != r1) goto L247
            java.lang.AssertionError r0 = new java.lang.AssertionError
            r1 = r0
            r1.<init>()
            throw r0
        L247:
            boolean r0 = org.lwjgl.util.glu.tessellation.Mesh.$assertionsDisabled
            if (r0 != 0) goto L262
            r0 = r11
            org.lwjgl.util.glu.tessellation.GLUhalfEdge r0 = r0.Sym
            org.lwjgl.util.glu.tessellation.GLUhalfEdge r0 = r0.Sym
            r1 = r11
            if (r0 == r1) goto L262
            java.lang.AssertionError r0 = new java.lang.AssertionError
            r1 = r0
            r1.<init>()
            throw r0
        L262:
            boolean r0 = org.lwjgl.util.glu.tessellation.Mesh.$assertionsDisabled
            if (r0 != 0) goto L278
            r0 = r11
            org.lwjgl.util.glu.tessellation.GLUvertex r0 = r0.Org
            if (r0 != 0) goto L278
            java.lang.AssertionError r0 = new java.lang.AssertionError
            r1 = r0
            r1.<init>()
            throw r0
        L278:
            boolean r0 = org.lwjgl.util.glu.tessellation.Mesh.$assertionsDisabled
            if (r0 != 0) goto L291
            r0 = r11
            org.lwjgl.util.glu.tessellation.GLUhalfEdge r0 = r0.Sym
            org.lwjgl.util.glu.tessellation.GLUvertex r0 = r0.Org
            if (r0 != 0) goto L291
            java.lang.AssertionError r0 = new java.lang.AssertionError
            r1 = r0
            r1.<init>()
            throw r0
        L291:
            boolean r0 = org.lwjgl.util.glu.tessellation.Mesh.$assertionsDisabled
            if (r0 != 0) goto L2af
            r0 = r11
            org.lwjgl.util.glu.tessellation.GLUhalfEdge r0 = r0.Lnext
            org.lwjgl.util.glu.tessellation.GLUhalfEdge r0 = r0.Onext
            org.lwjgl.util.glu.tessellation.GLUhalfEdge r0 = r0.Sym
            r1 = r11
            if (r0 == r1) goto L2af
            java.lang.AssertionError r0 = new java.lang.AssertionError
            r1 = r0
            r1.<init>()
            throw r0
        L2af:
            boolean r0 = org.lwjgl.util.glu.tessellation.Mesh.$assertionsDisabled
            if (r0 != 0) goto L2cd
            r0 = r11
            org.lwjgl.util.glu.tessellation.GLUhalfEdge r0 = r0.Onext
            org.lwjgl.util.glu.tessellation.GLUhalfEdge r0 = r0.Sym
            org.lwjgl.util.glu.tessellation.GLUhalfEdge r0 = r0.Lnext
            r1 = r11
            if (r0 == r1) goto L2cd
            java.lang.AssertionError r0 = new java.lang.AssertionError
            r1 = r0
            r1.<init>()
            throw r0
        L2cd:
            r0 = r11
            r12 = r0
            goto L205
        L2d4:
            boolean r0 = org.lwjgl.util.glu.tessellation.Mesh.$assertionsDisabled
            if (r0 != 0) goto L331
            r0 = r11
            org.lwjgl.util.glu.tessellation.GLUhalfEdge r0 = r0.Sym
            org.lwjgl.util.glu.tessellation.GLUhalfEdge r0 = r0.next
            r1 = r12
            org.lwjgl.util.glu.tessellation.GLUhalfEdge r1 = r1.Sym
            if (r0 != r1) goto L329
            r0 = r11
            org.lwjgl.util.glu.tessellation.GLUhalfEdge r0 = r0.Sym
            r1 = r3
            org.lwjgl.util.glu.tessellation.GLUhalfEdge r1 = r1.eHeadSym
            if (r0 != r1) goto L329
            r0 = r11
            org.lwjgl.util.glu.tessellation.GLUhalfEdge r0 = r0.Sym
            org.lwjgl.util.glu.tessellation.GLUhalfEdge r0 = r0.Sym
            r1 = r11
            if (r0 != r1) goto L329
            r0 = r11
            org.lwjgl.util.glu.tessellation.GLUvertex r0 = r0.Org
            if (r0 != 0) goto L329
            r0 = r11
            org.lwjgl.util.glu.tessellation.GLUhalfEdge r0 = r0.Sym
            org.lwjgl.util.glu.tessellation.GLUvertex r0 = r0.Org
            if (r0 != 0) goto L329
            r0 = r11
            org.lwjgl.util.glu.tessellation.GLUface r0 = r0.Lface
            if (r0 != 0) goto L329
            r0 = r11
            org.lwjgl.util.glu.tessellation.GLUhalfEdge r0 = r0.Sym
            org.lwjgl.util.glu.tessellation.GLUface r0 = r0.Lface
            if (r0 == 0) goto L331
        L329:
            java.lang.AssertionError r0 = new java.lang.AssertionError
            r1 = r0
            r1.<init>()
            throw r0
        L331:
            return
    }

    static {
            java.lang.Class<org.lwjgl.util.glu.tessellation.Mesh> r0 = org.lwjgl.util.glu.tessellation.Mesh.class
            boolean r0 = r0.desiredAssertionStatus()
            if (r0 != 0) goto Lc
            r0 = 1
            goto Ld
        Lc:
            r0 = 0
        Ld:
            org.lwjgl.util.glu.tessellation.Mesh.$assertionsDisabled = r0
            return
    }
}
