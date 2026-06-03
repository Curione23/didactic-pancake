package org.lwjgl.util.glu.tessellation;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/util/glu/tessellation/Sweep.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/util/glu/tessellation/Sweep.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/util/glu/tessellation/Sweep.class */
class Sweep {
    private static final boolean TOLERANCE_NONZERO = false;
    private static final double SENTINEL_COORD = 4.0E150d;
    static final /* synthetic */ boolean $assertionsDisabled = false;



    private Sweep() {
            r2 = this;
            r0 = r2
            r0.<init>()
            return
    }

    private static void DebugEvent(org.lwjgl.util.glu.tessellation.GLUtessellatorImpl r1) {
            return
    }

    private static void AddWinding(org.lwjgl.util.glu.tessellation.GLUhalfEdge r4, org.lwjgl.util.glu.tessellation.GLUhalfEdge r5) {
            r0 = r4
            r1 = r0
            int r1 = r1.winding
            r2 = r5
            int r2 = r2.winding
            int r1 = r1 + r2
            r0.winding = r1
            r0 = r4
            org.lwjgl.util.glu.tessellation.GLUhalfEdge r0 = r0.Sym
            r1 = r0
            int r1 = r1.winding
            r2 = r5
            org.lwjgl.util.glu.tessellation.GLUhalfEdge r2 = r2.Sym
            int r2 = r2.winding
            int r1 = r1 + r2
            r0.winding = r1
            return
    }

    private static org.lwjgl.util.glu.tessellation.ActiveRegion RegionBelow(org.lwjgl.util.glu.tessellation.ActiveRegion r2) {
            r0 = r2
            org.lwjgl.util.glu.tessellation.DictNode r0 = r0.nodeUp
            org.lwjgl.util.glu.tessellation.DictNode r0 = org.lwjgl.util.glu.tessellation.Dict.dictPred(r0)
            java.lang.Object r0 = org.lwjgl.util.glu.tessellation.Dict.dictKey(r0)
            org.lwjgl.util.glu.tessellation.ActiveRegion r0 = (org.lwjgl.util.glu.tessellation.ActiveRegion) r0
            return r0
    }

    private static org.lwjgl.util.glu.tessellation.ActiveRegion RegionAbove(org.lwjgl.util.glu.tessellation.ActiveRegion r2) {
            r0 = r2
            org.lwjgl.util.glu.tessellation.DictNode r0 = r0.nodeUp
            org.lwjgl.util.glu.tessellation.DictNode r0 = org.lwjgl.util.glu.tessellation.Dict.dictSucc(r0)
            java.lang.Object r0 = org.lwjgl.util.glu.tessellation.Dict.dictKey(r0)
            org.lwjgl.util.glu.tessellation.ActiveRegion r0 = (org.lwjgl.util.glu.tessellation.ActiveRegion) r0
            return r0
    }

    static boolean EdgeLeq(org.lwjgl.util.glu.tessellation.GLUtessellatorImpl r5, org.lwjgl.util.glu.tessellation.ActiveRegion r6, org.lwjgl.util.glu.tessellation.ActiveRegion r7) {
            r0 = r5
            org.lwjgl.util.glu.tessellation.GLUvertex r0 = r0.event
            r8 = r0
            r0 = r6
            org.lwjgl.util.glu.tessellation.GLUhalfEdge r0 = r0.eUp
            r9 = r0
            r0 = r7
            org.lwjgl.util.glu.tessellation.GLUhalfEdge r0 = r0.eUp
            r10 = r0
            r0 = r9
            org.lwjgl.util.glu.tessellation.GLUhalfEdge r0 = r0.Sym
            org.lwjgl.util.glu.tessellation.GLUvertex r0 = r0.Org
            r1 = r8
            if (r0 != r1) goto L95
            r0 = r10
            org.lwjgl.util.glu.tessellation.GLUhalfEdge r0 = r0.Sym
            org.lwjgl.util.glu.tessellation.GLUvertex r0 = r0.Org
            r1 = r8
            if (r0 != r1) goto L79
            r0 = r9
            org.lwjgl.util.glu.tessellation.GLUvertex r0 = r0.Org
            r1 = r10
            org.lwjgl.util.glu.tessellation.GLUvertex r1 = r1.Org
            boolean r0 = org.lwjgl.util.glu.tessellation.Geom.VertLeq(r0, r1)
            if (r0 == 0) goto L59
            r0 = r10
            org.lwjgl.util.glu.tessellation.GLUhalfEdge r0 = r0.Sym
            org.lwjgl.util.glu.tessellation.GLUvertex r0 = r0.Org
            r1 = r9
            org.lwjgl.util.glu.tessellation.GLUvertex r1 = r1.Org
            r2 = r10
            org.lwjgl.util.glu.tessellation.GLUvertex r2 = r2.Org
            double r0 = org.lwjgl.util.glu.tessellation.Geom.EdgeSign(r0, r1, r2)
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 > 0) goto L57
            r0 = 1
            goto L58
        L57:
            r0 = 0
        L58:
            return r0
        L59:
            r0 = r9
            org.lwjgl.util.glu.tessellation.GLUhalfEdge r0 = r0.Sym
            org.lwjgl.util.glu.tessellation.GLUvertex r0 = r0.Org
            r1 = r10
            org.lwjgl.util.glu.tessellation.GLUvertex r1 = r1.Org
            r2 = r9
            org.lwjgl.util.glu.tessellation.GLUvertex r2 = r2.Org
            double r0 = org.lwjgl.util.glu.tessellation.Geom.EdgeSign(r0, r1, r2)
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 < 0) goto L77
            r0 = 1
            goto L78
        L77:
            r0 = 0
        L78:
            return r0
        L79:
            r0 = r10
            org.lwjgl.util.glu.tessellation.GLUhalfEdge r0 = r0.Sym
            org.lwjgl.util.glu.tessellation.GLUvertex r0 = r0.Org
            r1 = r8
            r2 = r10
            org.lwjgl.util.glu.tessellation.GLUvertex r2 = r2.Org
            double r0 = org.lwjgl.util.glu.tessellation.Geom.EdgeSign(r0, r1, r2)
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 > 0) goto L93
            r0 = 1
            goto L94
        L93:
            r0 = 0
        L94:
            return r0
        L95:
            r0 = r10
            org.lwjgl.util.glu.tessellation.GLUhalfEdge r0 = r0.Sym
            org.lwjgl.util.glu.tessellation.GLUvertex r0 = r0.Org
            r1 = r8
            if (r0 != r1) goto Lbd
            r0 = r9
            org.lwjgl.util.glu.tessellation.GLUhalfEdge r0 = r0.Sym
            org.lwjgl.util.glu.tessellation.GLUvertex r0 = r0.Org
            r1 = r8
            r2 = r9
            org.lwjgl.util.glu.tessellation.GLUvertex r2 = r2.Org
            double r0 = org.lwjgl.util.glu.tessellation.Geom.EdgeSign(r0, r1, r2)
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 < 0) goto Lbb
            r0 = 1
            goto Lbc
        Lbb:
            r0 = 0
        Lbc:
            return r0
        Lbd:
            r0 = r9
            org.lwjgl.util.glu.tessellation.GLUhalfEdge r0 = r0.Sym
            org.lwjgl.util.glu.tessellation.GLUvertex r0 = r0.Org
            r1 = r8
            r2 = r9
            org.lwjgl.util.glu.tessellation.GLUvertex r2 = r2.Org
            double r0 = org.lwjgl.util.glu.tessellation.Geom.EdgeEval(r0, r1, r2)
            r11 = r0
            r0 = r10
            org.lwjgl.util.glu.tessellation.GLUhalfEdge r0 = r0.Sym
            org.lwjgl.util.glu.tessellation.GLUvertex r0 = r0.Org
            r1 = r8
            r2 = r10
            org.lwjgl.util.glu.tessellation.GLUvertex r2 = r2.Org
            double r0 = org.lwjgl.util.glu.tessellation.Geom.EdgeEval(r0, r1, r2)
            r13 = r0
            r0 = r11
            r1 = r13
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 < 0) goto Lef
            r0 = 1
            goto Lf0
        Lef:
            r0 = 0
        Lf0:
            return r0
    }

    static void DeleteRegion(org.lwjgl.util.glu.tessellation.GLUtessellatorImpl r3, org.lwjgl.util.glu.tessellation.ActiveRegion r4) {
            r0 = r4
            boolean r0 = r0.fixUpperEdge
            if (r0 == 0) goto L1f
            boolean r0 = org.lwjgl.util.glu.tessellation.Sweep.$assertionsDisabled
            if (r0 != 0) goto L1f
            r0 = r4
            org.lwjgl.util.glu.tessellation.GLUhalfEdge r0 = r0.eUp
            int r0 = r0.winding
            if (r0 == 0) goto L1f
            java.lang.AssertionError r0 = new java.lang.AssertionError
            r1 = r0
            r1.<init>()
            throw r0
        L1f:
            r0 = r4
            org.lwjgl.util.glu.tessellation.GLUhalfEdge r0 = r0.eUp
            r1 = 0
            r0.activeRegion = r1
            r0 = r3
            org.lwjgl.util.glu.tessellation.Dict r0 = r0.dict
            r1 = r4
            org.lwjgl.util.glu.tessellation.DictNode r1 = r1.nodeUp
            org.lwjgl.util.glu.tessellation.Dict.dictDelete(r0, r1)
            return
    }

    static boolean FixUpperEdge(org.lwjgl.util.glu.tessellation.ActiveRegion r3, org.lwjgl.util.glu.tessellation.GLUhalfEdge r4) {
            boolean r0 = org.lwjgl.util.glu.tessellation.Sweep.$assertionsDisabled
            if (r0 != 0) goto L15
            r0 = r3
            boolean r0 = r0.fixUpperEdge
            if (r0 != 0) goto L15
            java.lang.AssertionError r0 = new java.lang.AssertionError
            r1 = r0
            r1.<init>()
            throw r0
        L15:
            r0 = r3
            org.lwjgl.util.glu.tessellation.GLUhalfEdge r0 = r0.eUp
            boolean r0 = org.lwjgl.util.glu.tessellation.Mesh.__gl_meshDelete(r0)
            if (r0 != 0) goto L21
            r0 = 0
            return r0
        L21:
            r0 = r3
            r1 = 0
            r0.fixUpperEdge = r1
            r0 = r3
            r1 = r4
            r0.eUp = r1
            r0 = r4
            r1 = r3
            r0.activeRegion = r1
            r0 = 1
            return r0
    }

    static org.lwjgl.util.glu.tessellation.ActiveRegion TopLeftRegion(org.lwjgl.util.glu.tessellation.ActiveRegion r3) {
            r0 = r3
            org.lwjgl.util.glu.tessellation.GLUhalfEdge r0 = r0.eUp
            org.lwjgl.util.glu.tessellation.GLUvertex r0 = r0.Org
            r4 = r0
        L8:
            r0 = r3
            org.lwjgl.util.glu.tessellation.ActiveRegion r0 = RegionAbove(r0)
            r3 = r0
            r0 = r3
            org.lwjgl.util.glu.tessellation.GLUhalfEdge r0 = r0.eUp
            org.lwjgl.util.glu.tessellation.GLUvertex r0 = r0.Org
            r1 = r4
            if (r0 == r1) goto L8
            r0 = r3
            boolean r0 = r0.fixUpperEdge
            if (r0 == 0) goto L49
            r0 = r3
            org.lwjgl.util.glu.tessellation.ActiveRegion r0 = RegionBelow(r0)
            org.lwjgl.util.glu.tessellation.GLUhalfEdge r0 = r0.eUp
            org.lwjgl.util.glu.tessellation.GLUhalfEdge r0 = r0.Sym
            r1 = r3
            org.lwjgl.util.glu.tessellation.GLUhalfEdge r1 = r1.eUp
            org.lwjgl.util.glu.tessellation.GLUhalfEdge r1 = r1.Lnext
            org.lwjgl.util.glu.tessellation.GLUhalfEdge r0 = org.lwjgl.util.glu.tessellation.Mesh.__gl_meshConnect(r0, r1)
            r5 = r0
            r0 = r5
            if (r0 != 0) goto L3a
            r0 = 0
            return r0
        L3a:
            r0 = r3
            r1 = r5
            boolean r0 = FixUpperEdge(r0, r1)
            if (r0 != 0) goto L44
            r0 = 0
            return r0
        L44:
            r0 = r3
            org.lwjgl.util.glu.tessellation.ActiveRegion r0 = RegionAbove(r0)
            r3 = r0
        L49:
            r0 = r3
            return r0
    }

    static org.lwjgl.util.glu.tessellation.ActiveRegion TopRightRegion(org.lwjgl.util.glu.tessellation.ActiveRegion r3) {
            r0 = r3
            org.lwjgl.util.glu.tessellation.GLUhalfEdge r0 = r0.eUp
            org.lwjgl.util.glu.tessellation.GLUhalfEdge r0 = r0.Sym
            org.lwjgl.util.glu.tessellation.GLUvertex r0 = r0.Org
            r4 = r0
        Lb:
            r0 = r3
            org.lwjgl.util.glu.tessellation.ActiveRegion r0 = RegionAbove(r0)
            r3 = r0
            r0 = r3
            org.lwjgl.util.glu.tessellation.GLUhalfEdge r0 = r0.eUp
            org.lwjgl.util.glu.tessellation.GLUhalfEdge r0 = r0.Sym
            org.lwjgl.util.glu.tessellation.GLUvertex r0 = r0.Org
            r1 = r4
            if (r0 == r1) goto Lb
            r0 = r3
            return r0
    }

    static org.lwjgl.util.glu.tessellation.ActiveRegion AddRegionBelow(org.lwjgl.util.glu.tessellation.GLUtessellatorImpl r5, org.lwjgl.util.glu.tessellation.ActiveRegion r6, org.lwjgl.util.glu.tessellation.GLUhalfEdge r7) {
            org.lwjgl.util.glu.tessellation.ActiveRegion r0 = new org.lwjgl.util.glu.tessellation.ActiveRegion
            r1 = r0
            r1.<init>()
            r8 = r0
            r0 = r8
            r1 = r7
            r0.eUp = r1
            r0 = r8
            r1 = r5
            org.lwjgl.util.glu.tessellation.Dict r1 = r1.dict
            r2 = r6
            org.lwjgl.util.glu.tessellation.DictNode r2 = r2.nodeUp
            r3 = r8
            org.lwjgl.util.glu.tessellation.DictNode r1 = org.lwjgl.util.glu.tessellation.Dict.dictInsertBefore(r1, r2, r3)
            r0.nodeUp = r1
            r0 = r8
            org.lwjgl.util.glu.tessellation.DictNode r0 = r0.nodeUp
            if (r0 != 0) goto L2c
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r1 = r0
            r1.<init>()
            throw r0
        L2c:
            r0 = r8
            r1 = 0
            r0.fixUpperEdge = r1
            r0 = r8
            r1 = 0
            r0.sentinel = r1
            r0 = r8
            r1 = 0
            r0.dirty = r1
            r0 = r7
            r1 = r8
            r0.activeRegion = r1
            r0 = r8
            return r0
    }

    static boolean IsWindingInside(org.lwjgl.util.glu.tessellation.GLUtessellatorImpl r3, int r4) {
            r0 = r3
            int r0 = r0.windingRule
            switch(r0) {
                case 100130: goto L28;
                case 100131: goto L34;
                case 100132: goto L3e;
                case 100133: goto L48;
                case 100134: goto L52;
                default: goto L63;
            }
        L28:
            r0 = r4
            r1 = 1
            r0 = r0 & r1
            if (r0 == 0) goto L32
            r0 = 1
            goto L33
        L32:
            r0 = 0
        L33:
            return r0
        L34:
            r0 = r4
            if (r0 == 0) goto L3c
            r0 = 1
            goto L3d
        L3c:
            r0 = 0
        L3d:
            return r0
        L3e:
            r0 = r4
            if (r0 <= 0) goto L46
            r0 = 1
            goto L47
        L46:
            r0 = 0
        L47:
            return r0
        L48:
            r0 = r4
            if (r0 >= 0) goto L50
            r0 = 1
            goto L51
        L50:
            r0 = 0
        L51:
            return r0
        L52:
            r0 = r4
            r1 = 2
            if (r0 >= r1) goto L5d
            r0 = r4
            r1 = -2
            if (r0 > r1) goto L61
        L5d:
            r0 = 1
            goto L62
        L61:
            r0 = 0
        L62:
            return r0
        L63:
            java.lang.InternalError r0 = new java.lang.InternalError
            r1 = r0
            r1.<init>()
            throw r0
    }

    static void ComputeWinding(org.lwjgl.util.glu.tessellation.GLUtessellatorImpl r4, org.lwjgl.util.glu.tessellation.ActiveRegion r5) {
            r0 = r5
            r1 = r5
            org.lwjgl.util.glu.tessellation.ActiveRegion r1 = RegionAbove(r1)
            int r1 = r1.windingNumber
            r2 = r5
            org.lwjgl.util.glu.tessellation.GLUhalfEdge r2 = r2.eUp
            int r2 = r2.winding
            int r1 = r1 + r2
            r0.windingNumber = r1
            r0 = r5
            r1 = r4
            r2 = r5
            int r2 = r2.windingNumber
            boolean r1 = IsWindingInside(r1, r2)
            r0.inside = r1
            return
    }

    static void FinishRegion(org.lwjgl.util.glu.tessellation.GLUtessellatorImpl r3, org.lwjgl.util.glu.tessellation.ActiveRegion r4) {
            r0 = r4
            org.lwjgl.util.glu.tessellation.GLUhalfEdge r0 = r0.eUp
            r5 = r0
            r0 = r5
            org.lwjgl.util.glu.tessellation.GLUface r0 = r0.Lface
            r6 = r0
            r0 = r6
            r1 = r4
            boolean r1 = r1.inside
            r0.inside = r1
            r0 = r6
            r1 = r5
            r0.anEdge = r1
            r0 = r3
            r1 = r4
            DeleteRegion(r0, r1)
            return
    }

    static org.lwjgl.util.glu.tessellation.GLUhalfEdge FinishLeftRegions(org.lwjgl.util.glu.tessellation.GLUtessellatorImpl r3, org.lwjgl.util.glu.tessellation.ActiveRegion r4, org.lwjgl.util.glu.tessellation.ActiveRegion r5) {
            r0 = r4
            r7 = r0
            r0 = r4
            org.lwjgl.util.glu.tessellation.GLUhalfEdge r0 = r0.eUp
            r9 = r0
        L9:
            r0 = r7
            r1 = r5
            if (r0 == r1) goto Lb4
            r0 = r7
            r1 = 0
            r0.fixUpperEdge = r1
            r0 = r7
            org.lwjgl.util.glu.tessellation.ActiveRegion r0 = RegionBelow(r0)
            r6 = r0
            r0 = r6
            org.lwjgl.util.glu.tessellation.GLUhalfEdge r0 = r0.eUp
            r8 = r0
            r0 = r8
            org.lwjgl.util.glu.tessellation.GLUvertex r0 = r0.Org
            r1 = r9
            org.lwjgl.util.glu.tessellation.GLUvertex r1 = r1.Org
            if (r0 == r1) goto L6e
            r0 = r6
            boolean r0 = r0.fixUpperEdge
            if (r0 != 0) goto L3e
            r0 = r3
            r1 = r7
            FinishRegion(r0, r1)
            goto Lb4
        L3e:
            r0 = r9
            org.lwjgl.util.glu.tessellation.GLUhalfEdge r0 = r0.Onext
            org.lwjgl.util.glu.tessellation.GLUhalfEdge r0 = r0.Sym
            r1 = r8
            org.lwjgl.util.glu.tessellation.GLUhalfEdge r1 = r1.Sym
            org.lwjgl.util.glu.tessellation.GLUhalfEdge r0 = org.lwjgl.util.glu.tessellation.Mesh.__gl_meshConnect(r0, r1)
            r8 = r0
            r0 = r8
            if (r0 != 0) goto L5d
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r1 = r0
            r1.<init>()
            throw r0
        L5d:
            r0 = r6
            r1 = r8
            boolean r0 = FixUpperEdge(r0, r1)
            if (r0 != 0) goto L6e
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r1 = r0
            r1.<init>()
            throw r0
        L6e:
            r0 = r9
            org.lwjgl.util.glu.tessellation.GLUhalfEdge r0 = r0.Onext
            r1 = r8
            if (r0 == r1) goto La2
            r0 = r8
            org.lwjgl.util.glu.tessellation.GLUhalfEdge r0 = r0.Sym
            org.lwjgl.util.glu.tessellation.GLUhalfEdge r0 = r0.Lnext
            r1 = r8
            boolean r0 = org.lwjgl.util.glu.tessellation.Mesh.__gl_meshSplice(r0, r1)
            if (r0 != 0) goto L90
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r1 = r0
            r1.<init>()
            throw r0
        L90:
            r0 = r9
            r1 = r8
            boolean r0 = org.lwjgl.util.glu.tessellation.Mesh.__gl_meshSplice(r0, r1)
            if (r0 != 0) goto La2
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r1 = r0
            r1.<init>()
            throw r0
        La2:
            r0 = r3
            r1 = r7
            FinishRegion(r0, r1)
            r0 = r6
            org.lwjgl.util.glu.tessellation.GLUhalfEdge r0 = r0.eUp
            r9 = r0
            r0 = r6
            r7 = r0
            goto L9
        Lb4:
            r0 = r9
            return r0
    }

    static void AddRightEdges(org.lwjgl.util.glu.tessellation.GLUtessellatorImpl r4, org.lwjgl.util.glu.tessellation.ActiveRegion r5, org.lwjgl.util.glu.tessellation.GLUhalfEdge r6, org.lwjgl.util.glu.tessellation.GLUhalfEdge r7, org.lwjgl.util.glu.tessellation.GLUhalfEdge r8, boolean r9) {
            r0 = 1
            r14 = r0
            r0 = r6
            r12 = r0
        L6:
            boolean r0 = org.lwjgl.util.glu.tessellation.Sweep.$assertionsDisabled
            if (r0 != 0) goto L27
            r0 = r12
            org.lwjgl.util.glu.tessellation.GLUvertex r0 = r0.Org
            r1 = r12
            org.lwjgl.util.glu.tessellation.GLUhalfEdge r1 = r1.Sym
            org.lwjgl.util.glu.tessellation.GLUvertex r1 = r1.Org
            boolean r0 = org.lwjgl.util.glu.tessellation.Geom.VertLeq(r0, r1)
            if (r0 != 0) goto L27
            java.lang.AssertionError r0 = new java.lang.AssertionError
            r1 = r0
            r1.<init>()
            throw r0
        L27:
            r0 = r4
            r1 = r5
            r2 = r12
            org.lwjgl.util.glu.tessellation.GLUhalfEdge r2 = r2.Sym
            org.lwjgl.util.glu.tessellation.ActiveRegion r0 = AddRegionBelow(r0, r1, r2)
            r0 = r12
            org.lwjgl.util.glu.tessellation.GLUhalfEdge r0 = r0.Onext
            r12 = r0
            r0 = r12
            r1 = r7
            if (r0 != r1) goto L6
            r0 = r8
            if (r0 != 0) goto L53
            r0 = r5
            org.lwjgl.util.glu.tessellation.ActiveRegion r0 = RegionBelow(r0)
            org.lwjgl.util.glu.tessellation.GLUhalfEdge r0 = r0.eUp
            org.lwjgl.util.glu.tessellation.GLUhalfEdge r0 = r0.Sym
            org.lwjgl.util.glu.tessellation.GLUhalfEdge r0 = r0.Onext
            r8 = r0
        L53:
            r0 = r5
            r11 = r0
            r0 = r8
            r13 = r0
        L5a:
            r0 = r11
            org.lwjgl.util.glu.tessellation.ActiveRegion r0 = RegionBelow(r0)
            r10 = r0
            r0 = r10
            org.lwjgl.util.glu.tessellation.GLUhalfEdge r0 = r0.eUp
            org.lwjgl.util.glu.tessellation.GLUhalfEdge r0 = r0.Sym
            r12 = r0
            r0 = r12
            org.lwjgl.util.glu.tessellation.GLUvertex r0 = r0.Org
            r1 = r13
            org.lwjgl.util.glu.tessellation.GLUvertex r1 = r1.Org
            if (r0 == r1) goto L7b
            goto L112
        L7b:
            r0 = r12
            org.lwjgl.util.glu.tessellation.GLUhalfEdge r0 = r0.Onext
            r1 = r13
            if (r0 == r1) goto Lb5
            r0 = r12
            org.lwjgl.util.glu.tessellation.GLUhalfEdge r0 = r0.Sym
            org.lwjgl.util.glu.tessellation.GLUhalfEdge r0 = r0.Lnext
            r1 = r12
            boolean r0 = org.lwjgl.util.glu.tessellation.Mesh.__gl_meshSplice(r0, r1)
            if (r0 != 0) goto L9d
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r1 = r0
            r1.<init>()
            throw r0
        L9d:
            r0 = r13
            org.lwjgl.util.glu.tessellation.GLUhalfEdge r0 = r0.Sym
            org.lwjgl.util.glu.tessellation.GLUhalfEdge r0 = r0.Lnext
            r1 = r12
            boolean r0 = org.lwjgl.util.glu.tessellation.Mesh.__gl_meshSplice(r0, r1)
            if (r0 != 0) goto Lb5
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r1 = r0
            r1.<init>()
            throw r0
        Lb5:
            r0 = r10
            r1 = r11
            int r1 = r1.windingNumber
            r2 = r12
            int r2 = r2.winding
            int r1 = r1 - r2
            r0.windingNumber = r1
            r0 = r10
            r1 = r4
            r2 = r10
            int r2 = r2.windingNumber
            boolean r1 = IsWindingInside(r1, r2)
            r0.inside = r1
            r0 = r11
            r1 = 1
            r0.dirty = r1
            r0 = r14
            if (r0 != 0) goto L104
            r0 = r4
            r1 = r11
            boolean r0 = CheckForRightSplice(r0, r1)
            if (r0 == 0) goto L104
            r0 = r12
            r1 = r13
            AddWinding(r0, r1)
            r0 = r4
            r1 = r11
            DeleteRegion(r0, r1)
            r0 = r13
            boolean r0 = org.lwjgl.util.glu.tessellation.Mesh.__gl_meshDelete(r0)
            if (r0 != 0) goto L104
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r1 = r0
            r1.<init>()
            throw r0
        L104:
            r0 = 0
            r14 = r0
            r0 = r10
            r11 = r0
            r0 = r12
            r13 = r0
            goto L5a
        L112:
            r0 = r11
            r1 = 1
            r0.dirty = r1
            boolean r0 = org.lwjgl.util.glu.tessellation.Sweep.$assertionsDisabled
            if (r0 != 0) goto L139
            r0 = r11
            int r0 = r0.windingNumber
            r1 = r12
            int r1 = r1.winding
            int r0 = r0 - r1
            r1 = r10
            int r1 = r1.windingNumber
            if (r0 == r1) goto L139
            java.lang.AssertionError r0 = new java.lang.AssertionError
            r1 = r0
            r1.<init>()
            throw r0
        L139:
            r0 = r9
            if (r0 == 0) goto L144
            r0 = r4
            r1 = r11
            WalkDirtyRegions(r0, r1)
        L144:
            return
    }

    static void CallCombine(org.lwjgl.util.glu.tessellation.GLUtessellatorImpl r6, org.lwjgl.util.glu.tessellation.GLUvertex r7, java.lang.Object[] r8, float[] r9, boolean r10) {
            r0 = 3
            double[] r0 = new double[r0]
            r11 = r0
            r0 = r11
            r1 = 0
            r2 = r7
            double[] r2 = r2.coords
            r3 = 0
            r2 = r2[r3]
            r0[r1] = r2
            r0 = r11
            r1 = 1
            r2 = r7
            double[] r2 = r2.coords
            r3 = 1
            r2 = r2[r3]
            r0[r1] = r2
            r0 = r11
            r1 = 2
            r2 = r7
            double[] r2 = r2.coords
            r3 = 2
            r2 = r2[r3]
            r0[r1] = r2
            r0 = 1
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r12 = r0
            r0 = r6
            r1 = r11
            r2 = r8
            r3 = r9
            r4 = r12
            r0.callCombineOrCombineData(r1, r2, r3, r4)
            r0 = r7
            r1 = r12
            r2 = 0
            r1 = r1[r2]
            r0.data = r1
            r0 = r7
            java.lang.Object r0 = r0.data
            if (r0 != 0) goto L63
            r0 = r10
            if (r0 != 0) goto L51
            r0 = r7
            r1 = r8
            r2 = 0
            r1 = r1[r2]
            r0.data = r1
            goto L63
        L51:
            r0 = r6
            boolean r0 = r0.fatalError
            if (r0 != 0) goto L63
            r0 = r6
            r1 = 100156(0x1873c, float:1.40348E-40)
            r0.callErrorOrErrorData(r1)
            r0 = r6
            r1 = 1
            r0.fatalError = r1
        L63:
            return
    }

    static void SpliceMergeVertices(org.lwjgl.util.glu.tessellation.GLUtessellatorImpl r6, org.lwjgl.util.glu.tessellation.GLUhalfEdge r7, org.lwjgl.util.glu.tessellation.GLUhalfEdge r8) {
            r0 = 4
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r9 = r0
            r0 = 4
            float[] r0 = new float[r0]
            r1 = r0
            r2 = 0
            r3 = 1056964608(0x3f000000, float:0.5)
            r1[r2] = r3
            r1 = r0
            r2 = 1
            r3 = 1056964608(0x3f000000, float:0.5)
            r1[r2] = r3
            r1 = r0
            r2 = 2
            r3 = 0
            r1[r2] = r3
            r1 = r0
            r2 = 3
            r3 = 0
            r1[r2] = r3
            r10 = r0
            r0 = r9
            r1 = 0
            r2 = r7
            org.lwjgl.util.glu.tessellation.GLUvertex r2 = r2.Org
            java.lang.Object r2 = r2.data
            r0[r1] = r2
            r0 = r9
            r1 = 1
            r2 = r8
            org.lwjgl.util.glu.tessellation.GLUvertex r2 = r2.Org
            java.lang.Object r2 = r2.data
            r0[r1] = r2
            r0 = r6
            r1 = r7
            org.lwjgl.util.glu.tessellation.GLUvertex r1 = r1.Org
            r2 = r9
            r3 = r10
            r4 = 0
            CallCombine(r0, r1, r2, r3, r4)
            r0 = r7
            r1 = r8
            boolean r0 = org.lwjgl.util.glu.tessellation.Mesh.__gl_meshSplice(r0, r1)
            if (r0 != 0) goto L4c
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r1 = r0
            r1.<init>()
            throw r0
        L4c:
            return
    }

    static void VertexWeights(org.lwjgl.util.glu.tessellation.GLUvertex r11, org.lwjgl.util.glu.tessellation.GLUvertex r12, org.lwjgl.util.glu.tessellation.GLUvertex r13, float[] r14) {
            r0 = r12
            r1 = r11
            double r0 = org.lwjgl.util.glu.tessellation.Geom.VertL1dist(r0, r1)
            r15 = r0
            r0 = r13
            r1 = r11
            double r0 = org.lwjgl.util.glu.tessellation.Geom.VertL1dist(r0, r1)
            r17 = r0
            r0 = r14
            r1 = 0
            r2 = 4602678819172646912(0x3fe0000000000000, double:0.5)
            r3 = r17
            double r2 = r2 * r3
            r3 = r15
            r4 = r17
            double r3 = r3 + r4
            double r2 = r2 / r3
            float r2 = (float) r2
            r0[r1] = r2
            r0 = r14
            r1 = 1
            r2 = 4602678819172646912(0x3fe0000000000000, double:0.5)
            r3 = r15
            double r2 = r2 * r3
            r3 = r15
            r4 = r17
            double r3 = r3 + r4
            double r2 = r2 / r3
            float r2 = (float) r2
            r0[r1] = r2
            r0 = r11
            double[] r0 = r0.coords
            r1 = 0
            r2 = r0; r3 = r1; 
            r2 = r2[r3]
            r3 = r14
            r4 = 0
            r3 = r3[r4]
            double r3 = (double) r3
            r4 = r12
            double[] r4 = r4.coords
            r5 = 0
            r4 = r4[r5]
            double r3 = r3 * r4
            r4 = r14
            r5 = 1
            r4 = r4[r5]
            double r4 = (double) r4
            r5 = r13
            double[] r5 = r5.coords
            r6 = 0
            r5 = r5[r6]
            double r4 = r4 * r5
            double r3 = r3 + r4
            double r2 = r2 + r3
            r0[r1] = r2
            r0 = r11
            double[] r0 = r0.coords
            r1 = 1
            r2 = r0; r3 = r1; 
            r2 = r2[r3]
            r3 = r14
            r4 = 0
            r3 = r3[r4]
            double r3 = (double) r3
            r4 = r12
            double[] r4 = r4.coords
            r5 = 1
            r4 = r4[r5]
            double r3 = r3 * r4
            r4 = r14
            r5 = 1
            r4 = r4[r5]
            double r4 = (double) r4
            r5 = r13
            double[] r5 = r5.coords
            r6 = 1
            r5 = r5[r6]
            double r4 = r4 * r5
            double r3 = r3 + r4
            double r2 = r2 + r3
            r0[r1] = r2
            r0 = r11
            double[] r0 = r0.coords
            r1 = 2
            r2 = r0; r3 = r1; 
            r2 = r2[r3]
            r3 = r14
            r4 = 0
            r3 = r3[r4]
            double r3 = (double) r3
            r4 = r12
            double[] r4 = r4.coords
            r5 = 2
            r4 = r4[r5]
            double r3 = r3 * r4
            r4 = r14
            r5 = 1
            r4 = r4[r5]
            double r4 = (double) r4
            r5 = r13
            double[] r5 = r5.coords
            r6 = 2
            r5 = r5[r6]
            double r4 = r4 * r5
            double r3 = r3 + r4
            double r2 = r2 + r3
            r0[r1] = r2
            return
    }

    static void GetIntersectData(org.lwjgl.util.glu.tessellation.GLUtessellatorImpl r11, org.lwjgl.util.glu.tessellation.GLUvertex r12, org.lwjgl.util.glu.tessellation.GLUvertex r13, org.lwjgl.util.glu.tessellation.GLUvertex r14, org.lwjgl.util.glu.tessellation.GLUvertex r15, org.lwjgl.util.glu.tessellation.GLUvertex r16) {
            r0 = 4
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r17 = r0
            r0 = 4
            float[] r0 = new float[r0]
            r18 = r0
            r0 = 2
            float[] r0 = new float[r0]
            r19 = r0
            r0 = 2
            float[] r0 = new float[r0]
            r20 = r0
            r0 = r17
            r1 = 0
            r2 = r13
            java.lang.Object r2 = r2.data
            r0[r1] = r2
            r0 = r17
            r1 = 1
            r2 = r14
            java.lang.Object r2 = r2.data
            r0[r1] = r2
            r0 = r17
            r1 = 2
            r2 = r15
            java.lang.Object r2 = r2.data
            r0[r1] = r2
            r0 = r17
            r1 = 3
            r2 = r16
            java.lang.Object r2 = r2.data
            r0[r1] = r2
            r0 = r12
            double[] r0 = r0.coords
            r1 = 0
            r2 = r12
            double[] r2 = r2.coords
            r3 = 1
            r4 = r12
            double[] r4 = r4.coords
            r5 = 2
            r6 = 0
            r7 = r6; r6 = r5; r5 = r4; r4 = r7; 
            r5[r6] = r7
            r5 = r4; r4 = r3; r3 = r2; r2 = r5; 
            r3[r4] = r5
            r0[r1] = r2
            r0 = r12
            r1 = r13
            r2 = r14
            r3 = r19
            VertexWeights(r0, r1, r2, r3)
            r0 = r12
            r1 = r15
            r2 = r16
            r3 = r20
            VertexWeights(r0, r1, r2, r3)
            r0 = r19
            r1 = 0
            r2 = r18
            r3 = 0
            r4 = 2
            java.lang.System.arraycopy(r0, r1, r2, r3, r4)
            r0 = r20
            r1 = 0
            r2 = r18
            r3 = 2
            r4 = 2
            java.lang.System.arraycopy(r0, r1, r2, r3, r4)
            r0 = r11
            r1 = r12
            r2 = r17
            r3 = r18
            r4 = 1
            CallCombine(r0, r1, r2, r3, r4)
            return
    }

    static boolean CheckForRightSplice(org.lwjgl.util.glu.tessellation.GLUtessellatorImpl r5, org.lwjgl.util.glu.tessellation.ActiveRegion r6) {
            r0 = r6
            org.lwjgl.util.glu.tessellation.ActiveRegion r0 = RegionBelow(r0)
            r7 = r0
            r0 = r6
            org.lwjgl.util.glu.tessellation.GLUhalfEdge r0 = r0.eUp
            r8 = r0
            r0 = r7
            org.lwjgl.util.glu.tessellation.GLUhalfEdge r0 = r0.eUp
            r9 = r0
            r0 = r8
            org.lwjgl.util.glu.tessellation.GLUvertex r0 = r0.Org
            r1 = r9
            org.lwjgl.util.glu.tessellation.GLUvertex r1 = r1.Org
            boolean r0 = org.lwjgl.util.glu.tessellation.Geom.VertLeq(r0, r1)
            if (r0 == 0) goto Laa
            r0 = r9
            org.lwjgl.util.glu.tessellation.GLUhalfEdge r0 = r0.Sym
            org.lwjgl.util.glu.tessellation.GLUvertex r0 = r0.Org
            r1 = r8
            org.lwjgl.util.glu.tessellation.GLUvertex r1 = r1.Org
            r2 = r9
            org.lwjgl.util.glu.tessellation.GLUvertex r2 = r2.Org
            double r0 = org.lwjgl.util.glu.tessellation.Geom.EdgeSign(r0, r1, r2)
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 <= 0) goto L3a
            r0 = 0
            return r0
        L3a:
            r0 = r8
            org.lwjgl.util.glu.tessellation.GLUvertex r0 = r0.Org
            r1 = r9
            org.lwjgl.util.glu.tessellation.GLUvertex r1 = r1.Org
            boolean r0 = org.lwjgl.util.glu.tessellation.Geom.VertEq(r0, r1)
            if (r0 != 0) goto L80
            r0 = r9
            org.lwjgl.util.glu.tessellation.GLUhalfEdge r0 = r0.Sym
            org.lwjgl.util.glu.tessellation.GLUhalfEdge r0 = org.lwjgl.util.glu.tessellation.Mesh.__gl_meshSplitEdge(r0)
            if (r0 != 0) goto L5c
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r1 = r0
            r1.<init>()
            throw r0
        L5c:
            r0 = r8
            r1 = r9
            org.lwjgl.util.glu.tessellation.GLUhalfEdge r1 = r1.Sym
            org.lwjgl.util.glu.tessellation.GLUhalfEdge r1 = r1.Lnext
            boolean r0 = org.lwjgl.util.glu.tessellation.Mesh.__gl_meshSplice(r0, r1)
            if (r0 != 0) goto L73
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r1 = r0
            r1.<init>()
            throw r0
        L73:
            r0 = r6
            r1 = r7
            r2 = 1
            r3 = r2; r2 = r1; r1 = r3; 
            r2.dirty = r3
            r0.dirty = r1
            goto Lfa
        L80:
            r0 = r8
            org.lwjgl.util.glu.tessellation.GLUvertex r0 = r0.Org
            r1 = r9
            org.lwjgl.util.glu.tessellation.GLUvertex r1 = r1.Org
            if (r0 == r1) goto Lfa
            r0 = r5
            org.lwjgl.util.glu.tessellation.PriorityQ r0 = r0.pq
            r1 = r8
            org.lwjgl.util.glu.tessellation.GLUvertex r1 = r1.Org
            int r1 = r1.pqHandle
            r0.pqDelete(r1)
            r0 = r5
            r1 = r9
            org.lwjgl.util.glu.tessellation.GLUhalfEdge r1 = r1.Sym
            org.lwjgl.util.glu.tessellation.GLUhalfEdge r1 = r1.Lnext
            r2 = r8
            SpliceMergeVertices(r0, r1, r2)
            goto Lfa
        Laa:
            r0 = r8
            org.lwjgl.util.glu.tessellation.GLUhalfEdge r0 = r0.Sym
            org.lwjgl.util.glu.tessellation.GLUvertex r0 = r0.Org
            r1 = r9
            org.lwjgl.util.glu.tessellation.GLUvertex r1 = r1.Org
            r2 = r8
            org.lwjgl.util.glu.tessellation.GLUvertex r2 = r2.Org
            double r0 = org.lwjgl.util.glu.tessellation.Geom.EdgeSign(r0, r1, r2)
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 >= 0) goto Lc4
            r0 = 0
            return r0
        Lc4:
            r0 = r6
            org.lwjgl.util.glu.tessellation.ActiveRegion r0 = RegionAbove(r0)
            r1 = r6
            r2 = 1
            r3 = r2; r2 = r1; r1 = r3; 
            r2.dirty = r3
            r0.dirty = r1
            r0 = r8
            org.lwjgl.util.glu.tessellation.GLUhalfEdge r0 = r0.Sym
            org.lwjgl.util.glu.tessellation.GLUhalfEdge r0 = org.lwjgl.util.glu.tessellation.Mesh.__gl_meshSplitEdge(r0)
            if (r0 != 0) goto Le3
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r1 = r0
            r1.<init>()
            throw r0
        Le3:
            r0 = r9
            org.lwjgl.util.glu.tessellation.GLUhalfEdge r0 = r0.Sym
            org.lwjgl.util.glu.tessellation.GLUhalfEdge r0 = r0.Lnext
            r1 = r8
            boolean r0 = org.lwjgl.util.glu.tessellation.Mesh.__gl_meshSplice(r0, r1)
            if (r0 != 0) goto Lfa
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r1 = r0
            r1.<init>()
            throw r0
        Lfa:
            r0 = 1
            return r0
    }

    static boolean CheckForLeftSplice(org.lwjgl.util.glu.tessellation.GLUtessellatorImpl r5, org.lwjgl.util.glu.tessellation.ActiveRegion r6) {
            r0 = r6
            org.lwjgl.util.glu.tessellation.ActiveRegion r0 = RegionBelow(r0)
            r7 = r0
            r0 = r6
            org.lwjgl.util.glu.tessellation.GLUhalfEdge r0 = r0.eUp
            r8 = r0
            r0 = r7
            org.lwjgl.util.glu.tessellation.GLUhalfEdge r0 = r0.eUp
            r9 = r0
            boolean r0 = org.lwjgl.util.glu.tessellation.Sweep.$assertionsDisabled
            if (r0 != 0) goto L33
            r0 = r8
            org.lwjgl.util.glu.tessellation.GLUhalfEdge r0 = r0.Sym
            org.lwjgl.util.glu.tessellation.GLUvertex r0 = r0.Org
            r1 = r9
            org.lwjgl.util.glu.tessellation.GLUhalfEdge r1 = r1.Sym
            org.lwjgl.util.glu.tessellation.GLUvertex r1 = r1.Org
            boolean r0 = org.lwjgl.util.glu.tessellation.Geom.VertEq(r0, r1)
            if (r0 == 0) goto L33
            java.lang.AssertionError r0 = new java.lang.AssertionError
            r1 = r0
            r1.<init>()
            throw r0
        L33:
            r0 = r8
            org.lwjgl.util.glu.tessellation.GLUhalfEdge r0 = r0.Sym
            org.lwjgl.util.glu.tessellation.GLUvertex r0 = r0.Org
            r1 = r9
            org.lwjgl.util.glu.tessellation.GLUhalfEdge r1 = r1.Sym
            org.lwjgl.util.glu.tessellation.GLUvertex r1 = r1.Org
            boolean r0 = org.lwjgl.util.glu.tessellation.Geom.VertLeq(r0, r1)
            if (r0 == 0) goto La9
            r0 = r8
            org.lwjgl.util.glu.tessellation.GLUhalfEdge r0 = r0.Sym
            org.lwjgl.util.glu.tessellation.GLUvertex r0 = r0.Org
            r1 = r9
            org.lwjgl.util.glu.tessellation.GLUhalfEdge r1 = r1.Sym
            org.lwjgl.util.glu.tessellation.GLUvertex r1 = r1.Org
            r2 = r8
            org.lwjgl.util.glu.tessellation.GLUvertex r2 = r2.Org
            double r0 = org.lwjgl.util.glu.tessellation.Geom.EdgeSign(r0, r1, r2)
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 >= 0) goto L65
            r0 = 0
            return r0
        L65:
            r0 = r6
            org.lwjgl.util.glu.tessellation.ActiveRegion r0 = RegionAbove(r0)
            r1 = r6
            r2 = 1
            r3 = r2; r2 = r1; r1 = r3; 
            r2.dirty = r3
            r0.dirty = r1
            r0 = r8
            org.lwjgl.util.glu.tessellation.GLUhalfEdge r0 = org.lwjgl.util.glu.tessellation.Mesh.__gl_meshSplitEdge(r0)
            r10 = r0
            r0 = r10
            if (r0 != 0) goto L85
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r1 = r0
            r1.<init>()
            throw r0
        L85:
            r0 = r9
            org.lwjgl.util.glu.tessellation.GLUhalfEdge r0 = r0.Sym
            r1 = r10
            boolean r0 = org.lwjgl.util.glu.tessellation.Mesh.__gl_meshSplice(r0, r1)
            if (r0 != 0) goto L9a
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r1 = r0
            r1.<init>()
            throw r0
        L9a:
            r0 = r10
            org.lwjgl.util.glu.tessellation.GLUface r0 = r0.Lface
            r1 = r6
            boolean r1 = r1.inside
            r0.inside = r1
            goto L10b
        La9:
            r0 = r9
            org.lwjgl.util.glu.tessellation.GLUhalfEdge r0 = r0.Sym
            org.lwjgl.util.glu.tessellation.GLUvertex r0 = r0.Org
            r1 = r8
            org.lwjgl.util.glu.tessellation.GLUhalfEdge r1 = r1.Sym
            org.lwjgl.util.glu.tessellation.GLUvertex r1 = r1.Org
            r2 = r9
            org.lwjgl.util.glu.tessellation.GLUvertex r2 = r2.Org
            double r0 = org.lwjgl.util.glu.tessellation.Geom.EdgeSign(r0, r1, r2)
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 <= 0) goto Lc7
            r0 = 0
            return r0
        Lc7:
            r0 = r6
            r1 = r7
            r2 = 1
            r3 = r2; r2 = r1; r1 = r3; 
            r2.dirty = r3
            r0.dirty = r1
            r0 = r9
            org.lwjgl.util.glu.tessellation.GLUhalfEdge r0 = org.lwjgl.util.glu.tessellation.Mesh.__gl_meshSplitEdge(r0)
            r10 = r0
            r0 = r10
            if (r0 != 0) goto Le5
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r1 = r0
            r1.<init>()
            throw r0
        Le5:
            r0 = r8
            org.lwjgl.util.glu.tessellation.GLUhalfEdge r0 = r0.Lnext
            r1 = r9
            org.lwjgl.util.glu.tessellation.GLUhalfEdge r1 = r1.Sym
            boolean r0 = org.lwjgl.util.glu.tessellation.Mesh.__gl_meshSplice(r0, r1)
            if (r0 != 0) goto Lfc
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r1 = r0
            r1.<init>()
            throw r0
        Lfc:
            r0 = r10
            org.lwjgl.util.glu.tessellation.GLUhalfEdge r0 = r0.Sym
            org.lwjgl.util.glu.tessellation.GLUface r0 = r0.Lface
            r1 = r6
            boolean r1 = r1.inside
            r0.inside = r1
        L10b:
            r0 = 1
            return r0
    }

    static boolean CheckForIntersect(org.lwjgl.util.glu.tessellation.GLUtessellatorImpl r7, org.lwjgl.util.glu.tessellation.ActiveRegion r8) {
            r0 = r8
            org.lwjgl.util.glu.tessellation.ActiveRegion r0 = RegionBelow(r0)
            r9 = r0
            r0 = r8
            org.lwjgl.util.glu.tessellation.GLUhalfEdge r0 = r0.eUp
            r10 = r0
            r0 = r9
            org.lwjgl.util.glu.tessellation.GLUhalfEdge r0 = r0.eUp
            r11 = r0
            r0 = r10
            org.lwjgl.util.glu.tessellation.GLUvertex r0 = r0.Org
            r12 = r0
            r0 = r11
            org.lwjgl.util.glu.tessellation.GLUvertex r0 = r0.Org
            r13 = r0
            r0 = r10
            org.lwjgl.util.glu.tessellation.GLUhalfEdge r0 = r0.Sym
            org.lwjgl.util.glu.tessellation.GLUvertex r0 = r0.Org
            r14 = r0
            r0 = r11
            org.lwjgl.util.glu.tessellation.GLUhalfEdge r0 = r0.Sym
            org.lwjgl.util.glu.tessellation.GLUvertex r0 = r0.Org
            r15 = r0
            org.lwjgl.util.glu.tessellation.GLUvertex r0 = new org.lwjgl.util.glu.tessellation.GLUvertex
            r1 = r0
            r1.<init>()
            r20 = r0
            boolean r0 = org.lwjgl.util.glu.tessellation.Sweep.$assertionsDisabled
            if (r0 != 0) goto L51
            r0 = r15
            r1 = r14
            boolean r0 = org.lwjgl.util.glu.tessellation.Geom.VertEq(r0, r1)
            if (r0 == 0) goto L51
            java.lang.AssertionError r0 = new java.lang.AssertionError
            r1 = r0
            r1.<init>()
            throw r0
        L51:
            boolean r0 = org.lwjgl.util.glu.tessellation.Sweep.$assertionsDisabled
            if (r0 != 0) goto L6f
            r0 = r14
            r1 = r7
            org.lwjgl.util.glu.tessellation.GLUvertex r1 = r1.event
            r2 = r12
            double r0 = org.lwjgl.util.glu.tessellation.Geom.EdgeSign(r0, r1, r2)
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 <= 0) goto L6f
            java.lang.AssertionError r0 = new java.lang.AssertionError
            r1 = r0
            r1.<init>()
            throw r0
        L6f:
            boolean r0 = org.lwjgl.util.glu.tessellation.Sweep.$assertionsDisabled
            if (r0 != 0) goto L8d
            r0 = r15
            r1 = r7
            org.lwjgl.util.glu.tessellation.GLUvertex r1 = r1.event
            r2 = r13
            double r0 = org.lwjgl.util.glu.tessellation.Geom.EdgeSign(r0, r1, r2)
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 >= 0) goto L8d
            java.lang.AssertionError r0 = new java.lang.AssertionError
            r1 = r0
            r1.<init>()
            throw r0
        L8d:
            boolean r0 = org.lwjgl.util.glu.tessellation.Sweep.$assertionsDisabled
            if (r0 != 0) goto Lad
            r0 = r12
            r1 = r7
            org.lwjgl.util.glu.tessellation.GLUvertex r1 = r1.event
            if (r0 == r1) goto La5
            r0 = r13
            r1 = r7
            org.lwjgl.util.glu.tessellation.GLUvertex r1 = r1.event
            if (r0 != r1) goto Lad
        La5:
            java.lang.AssertionError r0 = new java.lang.AssertionError
            r1 = r0
            r1.<init>()
            throw r0
        Lad:
            boolean r0 = org.lwjgl.util.glu.tessellation.Sweep.$assertionsDisabled
            if (r0 != 0) goto Lc9
            r0 = r8
            boolean r0 = r0.fixUpperEdge
            if (r0 != 0) goto Lc1
            r0 = r9
            boolean r0 = r0.fixUpperEdge
            if (r0 == 0) goto Lc9
        Lc1:
            java.lang.AssertionError r0 = new java.lang.AssertionError
            r1 = r0
            r1.<init>()
            throw r0
        Lc9:
            r0 = r12
            r1 = r13
            if (r0 != r1) goto Ld2
            r0 = 0
            return r0
        Ld2:
            r0 = r12
            double r0 = r0.t
            r1 = r14
            double r1 = r1.t
            double r0 = java.lang.Math.min(r0, r1)
            r16 = r0
            r0 = r13
            double r0 = r0.t
            r1 = r15
            double r1 = r1.t
            double r0 = java.lang.Math.max(r0, r1)
            r18 = r0
            r0 = r16
            r1 = r18
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 <= 0) goto Lfa
            r0 = 0
            return r0
        Lfa:
            r0 = r12
            r1 = r13
            boolean r0 = org.lwjgl.util.glu.tessellation.Geom.VertLeq(r0, r1)
            if (r0 == 0) goto L114
            r0 = r15
            r1 = r12
            r2 = r13
            double r0 = org.lwjgl.util.glu.tessellation.Geom.EdgeSign(r0, r1, r2)
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 <= 0) goto L124
            r0 = 0
            return r0
        L114:
            r0 = r14
            r1 = r13
            r2 = r12
            double r0 = org.lwjgl.util.glu.tessellation.Geom.EdgeSign(r0, r1, r2)
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 >= 0) goto L124
            r0 = 0
            return r0
        L124:
            r0 = r7
            DebugEvent(r0)
            r0 = r14
            r1 = r12
            r2 = r15
            r3 = r13
            r4 = r20
            org.lwjgl.util.glu.tessellation.Geom.EdgeIntersect(r0, r1, r2, r3, r4)
            boolean r0 = org.lwjgl.util.glu.tessellation.Sweep.$assertionsDisabled
            if (r0 != 0) goto L159
            r0 = r12
            double r0 = r0.t
            r1 = r14
            double r1 = r1.t
            double r0 = java.lang.Math.min(r0, r1)
            r1 = r20
            double r1 = r1.t
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 <= 0) goto L159
            java.lang.AssertionError r0 = new java.lang.AssertionError
            r1 = r0
            r1.<init>()
            throw r0
        L159:
            boolean r0 = org.lwjgl.util.glu.tessellation.Sweep.$assertionsDisabled
            if (r0 != 0) goto L17d
            r0 = r20
            double r0 = r0.t
            r1 = r13
            double r1 = r1.t
            r2 = r15
            double r2 = r2.t
            double r1 = java.lang.Math.max(r1, r2)
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 <= 0) goto L17d
            java.lang.AssertionError r0 = new java.lang.AssertionError
            r1 = r0
            r1.<init>()
            throw r0
        L17d:
            boolean r0 = org.lwjgl.util.glu.tessellation.Sweep.$assertionsDisabled
            if (r0 != 0) goto L1a1
            r0 = r15
            double r0 = r0.s
            r1 = r14
            double r1 = r1.s
            double r0 = java.lang.Math.min(r0, r1)
            r1 = r20
            double r1 = r1.s
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 <= 0) goto L1a1
            java.lang.AssertionError r0 = new java.lang.AssertionError
            r1 = r0
            r1.<init>()
            throw r0
        L1a1:
            boolean r0 = org.lwjgl.util.glu.tessellation.Sweep.$assertionsDisabled
            if (r0 != 0) goto L1c5
            r0 = r20
            double r0 = r0.s
            r1 = r13
            double r1 = r1.s
            r2 = r12
            double r2 = r2.s
            double r1 = java.lang.Math.max(r1, r2)
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 <= 0) goto L1c5
            java.lang.AssertionError r0 = new java.lang.AssertionError
            r1 = r0
            r1.<init>()
            throw r0
        L1c5:
            r0 = r20
            r1 = r7
            org.lwjgl.util.glu.tessellation.GLUvertex r1 = r1.event
            boolean r0 = org.lwjgl.util.glu.tessellation.Geom.VertLeq(r0, r1)
            if (r0 == 0) goto L1e9
            r0 = r20
            r1 = r7
            org.lwjgl.util.glu.tessellation.GLUvertex r1 = r1.event
            double r1 = r1.s
            r0.s = r1
            r0 = r20
            r1 = r7
            org.lwjgl.util.glu.tessellation.GLUvertex r1 = r1.event
            double r1 = r1.t
            r0.t = r1
        L1e9:
            r0 = r12
            r1 = r13
            boolean r0 = org.lwjgl.util.glu.tessellation.Geom.VertLeq(r0, r1)
            if (r0 == 0) goto L1f8
            r0 = r12
            goto L1fa
        L1f8:
            r0 = r13
        L1fa:
            r21 = r0
            r0 = r21
            r1 = r20
            boolean r0 = org.lwjgl.util.glu.tessellation.Geom.VertLeq(r0, r1)
            if (r0 == 0) goto L21a
            r0 = r20
            r1 = r21
            double r1 = r1.s
            r0.s = r1
            r0 = r20
            r1 = r21
            double r1 = r1.t
            r0.t = r1
        L21a:
            r0 = r20
            r1 = r12
            boolean r0 = org.lwjgl.util.glu.tessellation.Geom.VertEq(r0, r1)
            if (r0 != 0) goto L22e
            r0 = r20
            r1 = r13
            boolean r0 = org.lwjgl.util.glu.tessellation.Geom.VertEq(r0, r1)
            if (r0 == 0) goto L236
        L22e:
            r0 = r7
            r1 = r8
            boolean r0 = CheckForRightSplice(r0, r1)
            r0 = 0
            return r0
        L236:
            r0 = r14
            r1 = r7
            org.lwjgl.util.glu.tessellation.GLUvertex r1 = r1.event
            boolean r0 = org.lwjgl.util.glu.tessellation.Geom.VertEq(r0, r1)
            if (r0 != 0) goto L252
            r0 = r14
            r1 = r7
            org.lwjgl.util.glu.tessellation.GLUvertex r1 = r1.event
            r2 = r20
            double r0 = org.lwjgl.util.glu.tessellation.Geom.EdgeSign(r0, r1, r2)
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 >= 0) goto L26e
        L252:
            r0 = r15
            r1 = r7
            org.lwjgl.util.glu.tessellation.GLUvertex r1 = r1.event
            boolean r0 = org.lwjgl.util.glu.tessellation.Geom.VertEq(r0, r1)
            if (r0 != 0) goto L3df
            r0 = r15
            r1 = r7
            org.lwjgl.util.glu.tessellation.GLUvertex r1 = r1.event
            r2 = r20
            double r0 = org.lwjgl.util.glu.tessellation.Geom.EdgeSign(r0, r1, r2)
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 > 0) goto L3df
        L26e:
            r0 = r15
            r1 = r7
            org.lwjgl.util.glu.tessellation.GLUvertex r1 = r1.event
            if (r0 != r1) goto L2d1
            r0 = r10
            org.lwjgl.util.glu.tessellation.GLUhalfEdge r0 = r0.Sym
            org.lwjgl.util.glu.tessellation.GLUhalfEdge r0 = org.lwjgl.util.glu.tessellation.Mesh.__gl_meshSplitEdge(r0)
            if (r0 != 0) goto L289
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r1 = r0
            r1.<init>()
            throw r0
        L289:
            r0 = r11
            org.lwjgl.util.glu.tessellation.GLUhalfEdge r0 = r0.Sym
            r1 = r10
            boolean r0 = org.lwjgl.util.glu.tessellation.Mesh.__gl_meshSplice(r0, r1)
            if (r0 != 0) goto L29d
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r1 = r0
            r1.<init>()
            throw r0
        L29d:
            r0 = r8
            org.lwjgl.util.glu.tessellation.ActiveRegion r0 = TopLeftRegion(r0)
            r8 = r0
            r0 = r8
            if (r0 != 0) goto L2ae
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r1 = r0
            r1.<init>()
            throw r0
        L2ae:
            r0 = r8
            org.lwjgl.util.glu.tessellation.ActiveRegion r0 = RegionBelow(r0)
            org.lwjgl.util.glu.tessellation.GLUhalfEdge r0 = r0.eUp
            r10 = r0
            r0 = r7
            r1 = r8
            org.lwjgl.util.glu.tessellation.ActiveRegion r1 = RegionBelow(r1)
            r2 = r9
            org.lwjgl.util.glu.tessellation.GLUhalfEdge r0 = FinishLeftRegions(r0, r1, r2)
            r0 = r7
            r1 = r8
            r2 = r10
            org.lwjgl.util.glu.tessellation.GLUhalfEdge r2 = r2.Sym
            org.lwjgl.util.glu.tessellation.GLUhalfEdge r2 = r2.Lnext
            r3 = r10
            r4 = r10
            r5 = 1
            AddRightEdges(r0, r1, r2, r3, r4, r5)
            r0 = 1
            return r0
        L2d1:
            r0 = r14
            r1 = r7
            org.lwjgl.util.glu.tessellation.GLUvertex r1 = r1.event
            if (r0 != r1) goto L347
            r0 = r11
            org.lwjgl.util.glu.tessellation.GLUhalfEdge r0 = r0.Sym
            org.lwjgl.util.glu.tessellation.GLUhalfEdge r0 = org.lwjgl.util.glu.tessellation.Mesh.__gl_meshSplitEdge(r0)
            if (r0 != 0) goto L2ed
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r1 = r0
            r1.<init>()
            throw r0
        L2ed:
            r0 = r10
            org.lwjgl.util.glu.tessellation.GLUhalfEdge r0 = r0.Lnext
            r1 = r11
            org.lwjgl.util.glu.tessellation.GLUhalfEdge r1 = r1.Sym
            org.lwjgl.util.glu.tessellation.GLUhalfEdge r1 = r1.Lnext
            boolean r0 = org.lwjgl.util.glu.tessellation.Mesh.__gl_meshSplice(r0, r1)
            if (r0 != 0) goto L307
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r1 = r0
            r1.<init>()
            throw r0
        L307:
            r0 = r8
            r9 = r0
            r0 = r8
            org.lwjgl.util.glu.tessellation.ActiveRegion r0 = TopRightRegion(r0)
            r8 = r0
            r0 = r8
            org.lwjgl.util.glu.tessellation.ActiveRegion r0 = RegionBelow(r0)
            org.lwjgl.util.glu.tessellation.GLUhalfEdge r0 = r0.eUp
            org.lwjgl.util.glu.tessellation.GLUhalfEdge r0 = r0.Sym
            org.lwjgl.util.glu.tessellation.GLUhalfEdge r0 = r0.Onext
            r22 = r0
            r0 = r9
            r1 = r11
            org.lwjgl.util.glu.tessellation.GLUhalfEdge r1 = r1.Sym
            org.lwjgl.util.glu.tessellation.GLUhalfEdge r1 = r1.Lnext
            r0.eUp = r1
            r0 = r7
            r1 = r9
            r2 = 0
            org.lwjgl.util.glu.tessellation.GLUhalfEdge r0 = FinishLeftRegions(r0, r1, r2)
            r11 = r0
            r0 = r7
            r1 = r8
            r2 = r11
            org.lwjgl.util.glu.tessellation.GLUhalfEdge r2 = r2.Onext
            r3 = r10
            org.lwjgl.util.glu.tessellation.GLUhalfEdge r3 = r3.Sym
            org.lwjgl.util.glu.tessellation.GLUhalfEdge r3 = r3.Onext
            r4 = r22
            r5 = 1
            AddRightEdges(r0, r1, r2, r3, r4, r5)
            r0 = 1
            return r0
        L347:
            r0 = r14
            r1 = r7
            org.lwjgl.util.glu.tessellation.GLUvertex r1 = r1.event
            r2 = r20
            double r0 = org.lwjgl.util.glu.tessellation.Geom.EdgeSign(r0, r1, r2)
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 < 0) goto L392
            r0 = r8
            org.lwjgl.util.glu.tessellation.ActiveRegion r0 = RegionAbove(r0)
            r1 = r8
            r2 = 1
            r3 = r2; r2 = r1; r1 = r3; 
            r2.dirty = r3
            r0.dirty = r1
            r0 = r10
            org.lwjgl.util.glu.tessellation.GLUhalfEdge r0 = r0.Sym
            org.lwjgl.util.glu.tessellation.GLUhalfEdge r0 = org.lwjgl.util.glu.tessellation.Mesh.__gl_meshSplitEdge(r0)
            if (r0 != 0) goto L376
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r1 = r0
            r1.<init>()
            throw r0
        L376:
            r0 = r10
            org.lwjgl.util.glu.tessellation.GLUvertex r0 = r0.Org
            r1 = r7
            org.lwjgl.util.glu.tessellation.GLUvertex r1 = r1.event
            double r1 = r1.s
            r0.s = r1
            r0 = r10
            org.lwjgl.util.glu.tessellation.GLUvertex r0 = r0.Org
            r1 = r7
            org.lwjgl.util.glu.tessellation.GLUvertex r1 = r1.event
            double r1 = r1.t
            r0.t = r1
        L392:
            r0 = r15
            r1 = r7
            org.lwjgl.util.glu.tessellation.GLUvertex r1 = r1.event
            r2 = r20
            double r0 = org.lwjgl.util.glu.tessellation.Geom.EdgeSign(r0, r1, r2)
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 > 0) goto L3dd
            r0 = r8
            r1 = r9
            r2 = 1
            r3 = r2; r2 = r1; r1 = r3; 
            r2.dirty = r3
            r0.dirty = r1
            r0 = r11
            org.lwjgl.util.glu.tessellation.GLUhalfEdge r0 = r0.Sym
            org.lwjgl.util.glu.tessellation.GLUhalfEdge r0 = org.lwjgl.util.glu.tessellation.Mesh.__gl_meshSplitEdge(r0)
            if (r0 != 0) goto L3bf
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r1 = r0
            r1.<init>()
            throw r0
        L3bf:
            r0 = r11
            org.lwjgl.util.glu.tessellation.GLUvertex r0 = r0.Org
            r1 = r7
            org.lwjgl.util.glu.tessellation.GLUvertex r1 = r1.event
            double r1 = r1.s
            r0.s = r1
            r0 = r11
            org.lwjgl.util.glu.tessellation.GLUvertex r0 = r0.Org
            r1 = r7
            org.lwjgl.util.glu.tessellation.GLUvertex r1 = r1.event
            double r1 = r1.t
            r0.t = r1
        L3dd:
            r0 = 0
            return r0
        L3df:
            r0 = r10
            org.lwjgl.util.glu.tessellation.GLUhalfEdge r0 = r0.Sym
            org.lwjgl.util.glu.tessellation.GLUhalfEdge r0 = org.lwjgl.util.glu.tessellation.Mesh.__gl_meshSplitEdge(r0)
            if (r0 != 0) goto L3f1
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r1 = r0
            r1.<init>()
            throw r0
        L3f1:
            r0 = r11
            org.lwjgl.util.glu.tessellation.GLUhalfEdge r0 = r0.Sym
            org.lwjgl.util.glu.tessellation.GLUhalfEdge r0 = org.lwjgl.util.glu.tessellation.Mesh.__gl_meshSplitEdge(r0)
            if (r0 != 0) goto L404
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r1 = r0
            r1.<init>()
            throw r0
        L404:
            r0 = r11
            org.lwjgl.util.glu.tessellation.GLUhalfEdge r0 = r0.Sym
            org.lwjgl.util.glu.tessellation.GLUhalfEdge r0 = r0.Lnext
            r1 = r10
            boolean r0 = org.lwjgl.util.glu.tessellation.Mesh.__gl_meshSplice(r0, r1)
            if (r0 != 0) goto L41b
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r1 = r0
            r1.<init>()
            throw r0
        L41b:
            r0 = r10
            org.lwjgl.util.glu.tessellation.GLUvertex r0 = r0.Org
            r1 = r20
            double r1 = r1.s
            r0.s = r1
            r0 = r10
            org.lwjgl.util.glu.tessellation.GLUvertex r0 = r0.Org
            r1 = r20
            double r1 = r1.t
            r0.t = r1
            r0 = r10
            org.lwjgl.util.glu.tessellation.GLUvertex r0 = r0.Org
            r1 = r7
            org.lwjgl.util.glu.tessellation.PriorityQ r1 = r1.pq
            r2 = r10
            org.lwjgl.util.glu.tessellation.GLUvertex r2 = r2.Org
            int r1 = r1.pqInsert(r2)
            r0.pqHandle = r1
            r0 = r10
            org.lwjgl.util.glu.tessellation.GLUvertex r0 = r0.Org
            int r0 = r0.pqHandle
            long r0 = (long) r0
            r1 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto L468
            r0 = r7
            org.lwjgl.util.glu.tessellation.PriorityQ r0 = r0.pq
            r0.pqDeletePriorityQ()
            r0 = r7
            r1 = 0
            r0.pq = r1
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r1 = r0
            r1.<init>()
            throw r0
        L468:
            r0 = r7
            r1 = r10
            org.lwjgl.util.glu.tessellation.GLUvertex r1 = r1.Org
            r2 = r12
            r3 = r14
            r4 = r13
            r5 = r15
            GetIntersectData(r0, r1, r2, r3, r4, r5)
            r0 = r8
            org.lwjgl.util.glu.tessellation.ActiveRegion r0 = RegionAbove(r0)
            r1 = r8
            r2 = r9
            r3 = 1
            r4 = r3; r3 = r2; r2 = r4; 
            r3.dirty = r4
            r3 = r2; r2 = r1; r1 = r3; 
            r2.dirty = r3
            r0.dirty = r1
            r0 = 0
            return r0
    }

    static void WalkDirtyRegions(org.lwjgl.util.glu.tessellation.GLUtessellatorImpl r3, org.lwjgl.util.glu.tessellation.ActiveRegion r4) {
            r0 = r4
            org.lwjgl.util.glu.tessellation.ActiveRegion r0 = RegionBelow(r0)
            r5 = r0
        L5:
            r0 = r5
            boolean r0 = r0.dirty
            if (r0 == 0) goto L16
            r0 = r5
            r4 = r0
            r0 = r5
            org.lwjgl.util.glu.tessellation.ActiveRegion r0 = RegionBelow(r0)
            r5 = r0
            goto L5
        L16:
            r0 = r4
            boolean r0 = r0.dirty
            if (r0 != 0) goto L30
            r0 = r4
            r5 = r0
            r0 = r4
            org.lwjgl.util.glu.tessellation.ActiveRegion r0 = RegionAbove(r0)
            r4 = r0
            r0 = r4
            if (r0 == 0) goto L2f
            r0 = r4
            boolean r0 = r0.dirty
            if (r0 != 0) goto L30
        L2f:
            return
        L30:
            r0 = r4
            r1 = 0
            r0.dirty = r1
            r0 = r4
            org.lwjgl.util.glu.tessellation.GLUhalfEdge r0 = r0.eUp
            r6 = r0
            r0 = r5
            org.lwjgl.util.glu.tessellation.GLUhalfEdge r0 = r0.eUp
            r7 = r0
            r0 = r6
            org.lwjgl.util.glu.tessellation.GLUhalfEdge r0 = r0.Sym
            org.lwjgl.util.glu.tessellation.GLUvertex r0 = r0.Org
            r1 = r7
            org.lwjgl.util.glu.tessellation.GLUhalfEdge r1 = r1.Sym
            org.lwjgl.util.glu.tessellation.GLUvertex r1 = r1.Org
            if (r0 == r1) goto La9
            r0 = r3
            r1 = r4
            boolean r0 = CheckForLeftSplice(r0, r1)
            if (r0 == 0) goto La9
            r0 = r5
            boolean r0 = r0.fixUpperEdge
            if (r0 == 0) goto L84
            r0 = r3
            r1 = r5
            DeleteRegion(r0, r1)
            r0 = r7
            boolean r0 = org.lwjgl.util.glu.tessellation.Mesh.__gl_meshDelete(r0)
            if (r0 != 0) goto L76
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r1 = r0
            r1.<init>()
            throw r0
        L76:
            r0 = r4
            org.lwjgl.util.glu.tessellation.ActiveRegion r0 = RegionBelow(r0)
            r5 = r0
            r0 = r5
            org.lwjgl.util.glu.tessellation.GLUhalfEdge r0 = r0.eUp
            r7 = r0
            goto La9
        L84:
            r0 = r4
            boolean r0 = r0.fixUpperEdge
            if (r0 == 0) goto La9
            r0 = r3
            r1 = r4
            DeleteRegion(r0, r1)
            r0 = r6
            boolean r0 = org.lwjgl.util.glu.tessellation.Mesh.__gl_meshDelete(r0)
            if (r0 != 0) goto L9f
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r1 = r0
            r1.<init>()
            throw r0
        L9f:
            r0 = r5
            org.lwjgl.util.glu.tessellation.ActiveRegion r0 = RegionAbove(r0)
            r4 = r0
            r0 = r4
            org.lwjgl.util.glu.tessellation.GLUhalfEdge r0 = r0.eUp
            r6 = r0
        La9:
            r0 = r6
            org.lwjgl.util.glu.tessellation.GLUvertex r0 = r0.Org
            r1 = r7
            org.lwjgl.util.glu.tessellation.GLUvertex r1 = r1.Org
            if (r0 == r1) goto L101
            r0 = r6
            org.lwjgl.util.glu.tessellation.GLUhalfEdge r0 = r0.Sym
            org.lwjgl.util.glu.tessellation.GLUvertex r0 = r0.Org
            r1 = r7
            org.lwjgl.util.glu.tessellation.GLUhalfEdge r1 = r1.Sym
            org.lwjgl.util.glu.tessellation.GLUvertex r1 = r1.Org
            if (r0 == r1) goto Lfb
            r0 = r4
            boolean r0 = r0.fixUpperEdge
            if (r0 != 0) goto Lfb
            r0 = r5
            boolean r0 = r0.fixUpperEdge
            if (r0 != 0) goto Lfb
            r0 = r6
            org.lwjgl.util.glu.tessellation.GLUhalfEdge r0 = r0.Sym
            org.lwjgl.util.glu.tessellation.GLUvertex r0 = r0.Org
            r1 = r3
            org.lwjgl.util.glu.tessellation.GLUvertex r1 = r1.event
            if (r0 == r1) goto Lf2
            r0 = r7
            org.lwjgl.util.glu.tessellation.GLUhalfEdge r0 = r0.Sym
            org.lwjgl.util.glu.tessellation.GLUvertex r0 = r0.Org
            r1 = r3
            org.lwjgl.util.glu.tessellation.GLUvertex r1 = r1.event
            if (r0 != r1) goto Lfb
        Lf2:
            r0 = r3
            r1 = r4
            boolean r0 = CheckForIntersect(r0, r1)
            if (r0 == 0) goto L101
            return
        Lfb:
            r0 = r3
            r1 = r4
            boolean r0 = CheckForRightSplice(r0, r1)
        L101:
            r0 = r6
            org.lwjgl.util.glu.tessellation.GLUvertex r0 = r0.Org
            r1 = r7
            org.lwjgl.util.glu.tessellation.GLUvertex r1 = r1.Org
            if (r0 != r1) goto L5
            r0 = r6
            org.lwjgl.util.glu.tessellation.GLUhalfEdge r0 = r0.Sym
            org.lwjgl.util.glu.tessellation.GLUvertex r0 = r0.Org
            r1 = r7
            org.lwjgl.util.glu.tessellation.GLUhalfEdge r1 = r1.Sym
            org.lwjgl.util.glu.tessellation.GLUvertex r1 = r1.Org
            if (r0 != r1) goto L5
            r0 = r7
            r1 = r6
            AddWinding(r0, r1)
            r0 = r3
            r1 = r4
            DeleteRegion(r0, r1)
            r0 = r6
            boolean r0 = org.lwjgl.util.glu.tessellation.Mesh.__gl_meshDelete(r0)
            if (r0 != 0) goto L139
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r1 = r0
            r1.<init>()
            throw r0
        L139:
            r0 = r5
            org.lwjgl.util.glu.tessellation.ActiveRegion r0 = RegionAbove(r0)
            r4 = r0
            goto L5
    }

    static void ConnectRightVertex(org.lwjgl.util.glu.tessellation.GLUtessellatorImpl r7, org.lwjgl.util.glu.tessellation.ActiveRegion r8, org.lwjgl.util.glu.tessellation.GLUhalfEdge r9) {
            r0 = r9
            org.lwjgl.util.glu.tessellation.GLUhalfEdge r0 = r0.Onext
            r11 = r0
            r0 = r8
            org.lwjgl.util.glu.tessellation.ActiveRegion r0 = RegionBelow(r0)
            r12 = r0
            r0 = r8
            org.lwjgl.util.glu.tessellation.GLUhalfEdge r0 = r0.eUp
            r13 = r0
            r0 = r12
            org.lwjgl.util.glu.tessellation.GLUhalfEdge r0 = r0.eUp
            r14 = r0
            r0 = 0
            r15 = r0
            r0 = r13
            org.lwjgl.util.glu.tessellation.GLUhalfEdge r0 = r0.Sym
            org.lwjgl.util.glu.tessellation.GLUvertex r0 = r0.Org
            r1 = r14
            org.lwjgl.util.glu.tessellation.GLUhalfEdge r1 = r1.Sym
            org.lwjgl.util.glu.tessellation.GLUvertex r1 = r1.Org
            if (r0 == r1) goto L35
            r0 = r7
            r1 = r8
            boolean r0 = CheckForIntersect(r0, r1)
        L35:
            r0 = r13
            org.lwjgl.util.glu.tessellation.GLUvertex r0 = r0.Org
            r1 = r7
            org.lwjgl.util.glu.tessellation.GLUvertex r1 = r1.event
            boolean r0 = org.lwjgl.util.glu.tessellation.Geom.VertEq(r0, r1)
            if (r0 == 0) goto L84
            r0 = r11
            org.lwjgl.util.glu.tessellation.GLUhalfEdge r0 = r0.Sym
            org.lwjgl.util.glu.tessellation.GLUhalfEdge r0 = r0.Lnext
            r1 = r13
            boolean r0 = org.lwjgl.util.glu.tessellation.Mesh.__gl_meshSplice(r0, r1)
            if (r0 != 0) goto L5c
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r1 = r0
            r1.<init>()
            throw r0
        L5c:
            r0 = r8
            org.lwjgl.util.glu.tessellation.ActiveRegion r0 = TopLeftRegion(r0)
            r8 = r0
            r0 = r8
            if (r0 != 0) goto L6d
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r1 = r0
            r1.<init>()
            throw r0
        L6d:
            r0 = r8
            org.lwjgl.util.glu.tessellation.ActiveRegion r0 = RegionBelow(r0)
            org.lwjgl.util.glu.tessellation.GLUhalfEdge r0 = r0.eUp
            r11 = r0
            r0 = r7
            r1 = r8
            org.lwjgl.util.glu.tessellation.ActiveRegion r1 = RegionBelow(r1)
            r2 = r12
            org.lwjgl.util.glu.tessellation.GLUhalfEdge r0 = FinishLeftRegions(r0, r1, r2)
            r0 = 1
            r15 = r0
        L84:
            r0 = r14
            org.lwjgl.util.glu.tessellation.GLUvertex r0 = r0.Org
            r1 = r7
            org.lwjgl.util.glu.tessellation.GLUvertex r1 = r1.event
            boolean r0 = org.lwjgl.util.glu.tessellation.Geom.VertEq(r0, r1)
            if (r0 == 0) goto Lb5
            r0 = r9
            r1 = r14
            org.lwjgl.util.glu.tessellation.GLUhalfEdge r1 = r1.Sym
            org.lwjgl.util.glu.tessellation.GLUhalfEdge r1 = r1.Lnext
            boolean r0 = org.lwjgl.util.glu.tessellation.Mesh.__gl_meshSplice(r0, r1)
            if (r0 != 0) goto Laa
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r1 = r0
            r1.<init>()
            throw r0
        Laa:
            r0 = r7
            r1 = r12
            r2 = 0
            org.lwjgl.util.glu.tessellation.GLUhalfEdge r0 = FinishLeftRegions(r0, r1, r2)
            r9 = r0
            r0 = 1
            r15 = r0
        Lb5:
            r0 = r15
            if (r0 == 0) goto Lc9
            r0 = r7
            r1 = r8
            r2 = r9
            org.lwjgl.util.glu.tessellation.GLUhalfEdge r2 = r2.Onext
            r3 = r11
            r4 = r11
            r5 = 1
            AddRightEdges(r0, r1, r2, r3, r4, r5)
            return
        Lc9:
            r0 = r14
            org.lwjgl.util.glu.tessellation.GLUvertex r0 = r0.Org
            r1 = r13
            org.lwjgl.util.glu.tessellation.GLUvertex r1 = r1.Org
            boolean r0 = org.lwjgl.util.glu.tessellation.Geom.VertLeq(r0, r1)
            if (r0 == 0) goto Le5
            r0 = r14
            org.lwjgl.util.glu.tessellation.GLUhalfEdge r0 = r0.Sym
            org.lwjgl.util.glu.tessellation.GLUhalfEdge r0 = r0.Lnext
            r10 = r0
            goto Le8
        Le5:
            r0 = r13
            r10 = r0
        Le8:
            r0 = r9
            org.lwjgl.util.glu.tessellation.GLUhalfEdge r0 = r0.Onext
            org.lwjgl.util.glu.tessellation.GLUhalfEdge r0 = r0.Sym
            r1 = r10
            org.lwjgl.util.glu.tessellation.GLUhalfEdge r0 = org.lwjgl.util.glu.tessellation.Mesh.__gl_meshConnect(r0, r1)
            r10 = r0
            r0 = r10
            if (r0 != 0) goto L100
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r1 = r0
            r1.<init>()
            throw r0
        L100:
            r0 = r7
            r1 = r8
            r2 = r10
            r3 = r10
            org.lwjgl.util.glu.tessellation.GLUhalfEdge r3 = r3.Onext
            r4 = r10
            org.lwjgl.util.glu.tessellation.GLUhalfEdge r4 = r4.Onext
            r5 = 0
            AddRightEdges(r0, r1, r2, r3, r4, r5)
            r0 = r10
            org.lwjgl.util.glu.tessellation.GLUhalfEdge r0 = r0.Sym
            org.lwjgl.util.glu.tessellation.ActiveRegion r0 = r0.activeRegion
            r1 = 1
            r0.fixUpperEdge = r1
            r0 = r7
            r1 = r8
            WalkDirtyRegions(r0, r1)
            return
    }

    static void ConnectLeftDegenerate(org.lwjgl.util.glu.tessellation.GLUtessellatorImpl r7, org.lwjgl.util.glu.tessellation.ActiveRegion r8, org.lwjgl.util.glu.tessellation.GLUvertex r9) {
            r0 = r8
            org.lwjgl.util.glu.tessellation.GLUhalfEdge r0 = r0.eUp
            r10 = r0
            r0 = r10
            org.lwjgl.util.glu.tessellation.GLUvertex r0 = r0.Org
            r1 = r9
            boolean r0 = org.lwjgl.util.glu.tessellation.Geom.VertEq(r0, r1)
            if (r0 == 0) goto L28
            boolean r0 = org.lwjgl.util.glu.tessellation.Sweep.$assertionsDisabled
            if (r0 != 0) goto L1e
            java.lang.AssertionError r0 = new java.lang.AssertionError
            r1 = r0
            r1.<init>()
            throw r0
        L1e:
            r0 = r7
            r1 = r10
            r2 = r9
            org.lwjgl.util.glu.tessellation.GLUhalfEdge r2 = r2.anEdge
            SpliceMergeVertices(r0, r1, r2)
            return
        L28:
            r0 = r10
            org.lwjgl.util.glu.tessellation.GLUhalfEdge r0 = r0.Sym
            org.lwjgl.util.glu.tessellation.GLUvertex r0 = r0.Org
            r1 = r9
            boolean r0 = org.lwjgl.util.glu.tessellation.Geom.VertEq(r0, r1)
            if (r0 != 0) goto L7f
            r0 = r10
            org.lwjgl.util.glu.tessellation.GLUhalfEdge r0 = r0.Sym
            org.lwjgl.util.glu.tessellation.GLUhalfEdge r0 = org.lwjgl.util.glu.tessellation.Mesh.__gl_meshSplitEdge(r0)
            if (r0 != 0) goto L48
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r1 = r0
            r1.<init>()
            throw r0
        L48:
            r0 = r8
            boolean r0 = r0.fixUpperEdge
            if (r0 == 0) goto L66
            r0 = r10
            org.lwjgl.util.glu.tessellation.GLUhalfEdge r0 = r0.Onext
            boolean r0 = org.lwjgl.util.glu.tessellation.Mesh.__gl_meshDelete(r0)
            if (r0 != 0) goto L61
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r1 = r0
            r1.<init>()
            throw r0
        L61:
            r0 = r8
            r1 = 0
            r0.fixUpperEdge = r1
        L66:
            r0 = r9
            org.lwjgl.util.glu.tessellation.GLUhalfEdge r0 = r0.anEdge
            r1 = r10
            boolean r0 = org.lwjgl.util.glu.tessellation.Mesh.__gl_meshSplice(r0, r1)
            if (r0 != 0) goto L79
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r1 = r0
            r1.<init>()
            throw r0
        L79:
            r0 = r7
            r1 = r9
            SweepEvent(r0, r1)
            return
        L7f:
            boolean r0 = org.lwjgl.util.glu.tessellation.Sweep.$assertionsDisabled
            if (r0 != 0) goto L8d
            java.lang.AssertionError r0 = new java.lang.AssertionError
            r1 = r0
            r1.<init>()
            throw r0
        L8d:
            r0 = r8
            org.lwjgl.util.glu.tessellation.ActiveRegion r0 = TopRightRegion(r0)
            r8 = r0
            r0 = r8
            org.lwjgl.util.glu.tessellation.ActiveRegion r0 = RegionBelow(r0)
            r14 = r0
            r0 = r14
            org.lwjgl.util.glu.tessellation.GLUhalfEdge r0 = r0.eUp
            org.lwjgl.util.glu.tessellation.GLUhalfEdge r0 = r0.Sym
            r12 = r0
            r0 = r12
            org.lwjgl.util.glu.tessellation.GLUhalfEdge r0 = r0.Onext
            r1 = r0
            r13 = r1
            r11 = r0
            r0 = r14
            boolean r0 = r0.fixUpperEdge
            if (r0 == 0) goto Le9
            boolean r0 = org.lwjgl.util.glu.tessellation.Sweep.$assertionsDisabled
            if (r0 != 0) goto Lc9
            r0 = r11
            r1 = r12
            if (r0 != r1) goto Lc9
            java.lang.AssertionError r0 = new java.lang.AssertionError
            r1 = r0
            r1.<init>()
            throw r0
        Lc9:
            r0 = r7
            r1 = r14
            DeleteRegion(r0, r1)
            r0 = r12
            boolean r0 = org.lwjgl.util.glu.tessellation.Mesh.__gl_meshDelete(r0)
            if (r0 != 0) goto Ldf
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r1 = r0
            r1.<init>()
            throw r0
        Ldf:
            r0 = r11
            org.lwjgl.util.glu.tessellation.GLUhalfEdge r0 = r0.Sym
            org.lwjgl.util.glu.tessellation.GLUhalfEdge r0 = r0.Lnext
            r12 = r0
        Le9:
            r0 = r9
            org.lwjgl.util.glu.tessellation.GLUhalfEdge r0 = r0.anEdge
            r1 = r12
            boolean r0 = org.lwjgl.util.glu.tessellation.Mesh.__gl_meshSplice(r0, r1)
            if (r0 != 0) goto Lfd
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r1 = r0
            r1.<init>()
            throw r0
        Lfd:
            r0 = r11
            boolean r0 = org.lwjgl.util.glu.tessellation.Geom.EdgeGoesLeft(r0)
            if (r0 != 0) goto L108
            r0 = 0
            r11 = r0
        L108:
            r0 = r7
            r1 = r8
            r2 = r12
            org.lwjgl.util.glu.tessellation.GLUhalfEdge r2 = r2.Onext
            r3 = r13
            r4 = r11
            r5 = 1
            AddRightEdges(r0, r1, r2, r3, r4, r5)
            return
    }

    static void ConnectLeftVertex(org.lwjgl.util.glu.tessellation.GLUtessellatorImpl r7, org.lwjgl.util.glu.tessellation.GLUvertex r8) {
            org.lwjgl.util.glu.tessellation.ActiveRegion r0 = new org.lwjgl.util.glu.tessellation.ActiveRegion
            r1 = r0
            r1.<init>()
            r15 = r0
            r0 = r15
            r1 = r8
            org.lwjgl.util.glu.tessellation.GLUhalfEdge r1 = r1.anEdge
            org.lwjgl.util.glu.tessellation.GLUhalfEdge r1 = r1.Sym
            r0.eUp = r1
            r0 = r7
            org.lwjgl.util.glu.tessellation.Dict r0 = r0.dict
            r1 = r15
            org.lwjgl.util.glu.tessellation.DictNode r0 = org.lwjgl.util.glu.tessellation.Dict.dictSearch(r0, r1)
            java.lang.Object r0 = org.lwjgl.util.glu.tessellation.Dict.dictKey(r0)
            org.lwjgl.util.glu.tessellation.ActiveRegion r0 = (org.lwjgl.util.glu.tessellation.ActiveRegion) r0
            r9 = r0
            r0 = r9
            org.lwjgl.util.glu.tessellation.ActiveRegion r0 = RegionBelow(r0)
            r10 = r0
            r0 = r9
            org.lwjgl.util.glu.tessellation.GLUhalfEdge r0 = r0.eUp
            r12 = r0
            r0 = r10
            org.lwjgl.util.glu.tessellation.GLUhalfEdge r0 = r0.eUp
            r13 = r0
            r0 = r12
            org.lwjgl.util.glu.tessellation.GLUhalfEdge r0 = r0.Sym
            org.lwjgl.util.glu.tessellation.GLUvertex r0 = r0.Org
            r1 = r8
            r2 = r12
            org.lwjgl.util.glu.tessellation.GLUvertex r2 = r2.Org
            double r0 = org.lwjgl.util.glu.tessellation.Geom.EdgeSign(r0, r1, r2)
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto L53
            r0 = r7
            r1 = r9
            r2 = r8
            ConnectLeftDegenerate(r0, r1, r2)
            return
        L53:
            r0 = r13
            org.lwjgl.util.glu.tessellation.GLUhalfEdge r0 = r0.Sym
            org.lwjgl.util.glu.tessellation.GLUvertex r0 = r0.Org
            r1 = r12
            org.lwjgl.util.glu.tessellation.GLUhalfEdge r1 = r1.Sym
            org.lwjgl.util.glu.tessellation.GLUvertex r1 = r1.Org
            boolean r0 = org.lwjgl.util.glu.tessellation.Geom.VertLeq(r0, r1)
            if (r0 == 0) goto L6d
            r0 = r9
            goto L6e
        L6d:
            r0 = r10
        L6e:
            r11 = r0
            r0 = r9
            boolean r0 = r0.inside
            if (r0 != 0) goto L7f
            r0 = r11
            boolean r0 = r0.fixUpperEdge
            if (r0 == 0) goto Lf8
        L7f:
            r0 = r11
            r1 = r9
            if (r0 != r1) goto La3
            r0 = r8
            org.lwjgl.util.glu.tessellation.GLUhalfEdge r0 = r0.anEdge
            org.lwjgl.util.glu.tessellation.GLUhalfEdge r0 = r0.Sym
            r1 = r12
            org.lwjgl.util.glu.tessellation.GLUhalfEdge r1 = r1.Lnext
            org.lwjgl.util.glu.tessellation.GLUhalfEdge r0 = org.lwjgl.util.glu.tessellation.Mesh.__gl_meshConnect(r0, r1)
            r14 = r0
            r0 = r14
            if (r0 != 0) goto Lcb
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r1 = r0
            r1.<init>()
            throw r0
        La3:
            r0 = r13
            org.lwjgl.util.glu.tessellation.GLUhalfEdge r0 = r0.Sym
            org.lwjgl.util.glu.tessellation.GLUhalfEdge r0 = r0.Onext
            org.lwjgl.util.glu.tessellation.GLUhalfEdge r0 = r0.Sym
            r1 = r8
            org.lwjgl.util.glu.tessellation.GLUhalfEdge r1 = r1.anEdge
            org.lwjgl.util.glu.tessellation.GLUhalfEdge r0 = org.lwjgl.util.glu.tessellation.Mesh.__gl_meshConnect(r0, r1)
            r16 = r0
            r0 = r16
            if (r0 != 0) goto Lc4
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r1 = r0
            r1.<init>()
            throw r0
        Lc4:
            r0 = r16
            org.lwjgl.util.glu.tessellation.GLUhalfEdge r0 = r0.Sym
            r14 = r0
        Lcb:
            r0 = r11
            boolean r0 = r0.fixUpperEdge
            if (r0 == 0) goto Le5
            r0 = r11
            r1 = r14
            boolean r0 = FixUpperEdge(r0, r1)
            if (r0 != 0) goto Lf0
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r1 = r0
            r1.<init>()
            throw r0
        Le5:
            r0 = r7
            r1 = r7
            r2 = r9
            r3 = r14
            org.lwjgl.util.glu.tessellation.ActiveRegion r1 = AddRegionBelow(r1, r2, r3)
            ComputeWinding(r0, r1)
        Lf0:
            r0 = r7
            r1 = r8
            SweepEvent(r0, r1)
            goto L107
        Lf8:
            r0 = r7
            r1 = r9
            r2 = r8
            org.lwjgl.util.glu.tessellation.GLUhalfEdge r2 = r2.anEdge
            r3 = r8
            org.lwjgl.util.glu.tessellation.GLUhalfEdge r3 = r3.anEdge
            r4 = 0
            r5 = 1
            AddRightEdges(r0, r1, r2, r3, r4, r5)
        L107:
            return
    }

    static void SweepEvent(org.lwjgl.util.glu.tessellation.GLUtessellatorImpl r7, org.lwjgl.util.glu.tessellation.GLUvertex r8) {
            r0 = r7
            r1 = r8
            r0.event = r1
            r0 = r7
            DebugEvent(r0)
            r0 = r8
            org.lwjgl.util.glu.tessellation.GLUhalfEdge r0 = r0.anEdge
            r11 = r0
        Lf:
            r0 = r11
            org.lwjgl.util.glu.tessellation.ActiveRegion r0 = r0.activeRegion
            if (r0 != 0) goto L2d
            r0 = r11
            org.lwjgl.util.glu.tessellation.GLUhalfEdge r0 = r0.Onext
            r11 = r0
            r0 = r11
            r1 = r8
            org.lwjgl.util.glu.tessellation.GLUhalfEdge r1 = r1.anEdge
            if (r0 != r1) goto Lf
            r0 = r7
            r1 = r8
            ConnectLeftVertex(r0, r1)
            return
        L2d:
            r0 = r11
            org.lwjgl.util.glu.tessellation.ActiveRegion r0 = r0.activeRegion
            org.lwjgl.util.glu.tessellation.ActiveRegion r0 = TopLeftRegion(r0)
            r9 = r0
            r0 = r9
            if (r0 != 0) goto L42
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r1 = r0
            r1.<init>()
            throw r0
        L42:
            r0 = r9
            org.lwjgl.util.glu.tessellation.ActiveRegion r0 = RegionBelow(r0)
            r10 = r0
            r0 = r10
            org.lwjgl.util.glu.tessellation.GLUhalfEdge r0 = r0.eUp
            r12 = r0
            r0 = r7
            r1 = r10
            r2 = 0
            org.lwjgl.util.glu.tessellation.GLUhalfEdge r0 = FinishLeftRegions(r0, r1, r2)
            r13 = r0
            r0 = r13
            org.lwjgl.util.glu.tessellation.GLUhalfEdge r0 = r0.Onext
            r1 = r12
            if (r0 != r1) goto L69
            r0 = r7
            r1 = r9
            r2 = r13
            ConnectRightVertex(r0, r1, r2)
            goto L78
        L69:
            r0 = r7
            r1 = r9
            r2 = r13
            org.lwjgl.util.glu.tessellation.GLUhalfEdge r2 = r2.Onext
            r3 = r12
            r4 = r12
            r5 = 1
            AddRightEdges(r0, r1, r2, r3, r4, r5)
        L78:
            return
    }

    static void AddSentinel(org.lwjgl.util.glu.tessellation.GLUtessellatorImpl r4, double r5) {
            org.lwjgl.util.glu.tessellation.ActiveRegion r0 = new org.lwjgl.util.glu.tessellation.ActiveRegion
            r1 = r0
            r1.<init>()
            r8 = r0
            r0 = r4
            org.lwjgl.util.glu.tessellation.GLUmesh r0 = r0.mesh
            org.lwjgl.util.glu.tessellation.GLUhalfEdge r0 = org.lwjgl.util.glu.tessellation.Mesh.__gl_meshMakeEdge(r0)
            r7 = r0
            r0 = r7
            if (r0 != 0) goto L1d
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r1 = r0
            r1.<init>()
            throw r0
        L1d:
            r0 = r7
            org.lwjgl.util.glu.tessellation.GLUvertex r0 = r0.Org
            r1 = 6859981916965213871(0x5f338d352e5096af, double:4.0E150)
            r0.s = r1
            r0 = r7
            org.lwjgl.util.glu.tessellation.GLUvertex r0 = r0.Org
            r1 = r5
            r0.t = r1
            r0 = r7
            org.lwjgl.util.glu.tessellation.GLUhalfEdge r0 = r0.Sym
            org.lwjgl.util.glu.tessellation.GLUvertex r0 = r0.Org
            r1 = -2363390119889561937(0xdf338d352e5096af, double:-4.0E150)
            r0.s = r1
            r0 = r7
            org.lwjgl.util.glu.tessellation.GLUhalfEdge r0 = r0.Sym
            org.lwjgl.util.glu.tessellation.GLUvertex r0 = r0.Org
            r1 = r5
            r0.t = r1
            r0 = r4
            r1 = r7
            org.lwjgl.util.glu.tessellation.GLUhalfEdge r1 = r1.Sym
            org.lwjgl.util.glu.tessellation.GLUvertex r1 = r1.Org
            r0.event = r1
            r0 = r8
            r1 = r7
            r0.eUp = r1
            r0 = r8
            r1 = 0
            r0.windingNumber = r1
            r0 = r8
            r1 = 0
            r0.inside = r1
            r0 = r8
            r1 = 0
            r0.fixUpperEdge = r1
            r0 = r8
            r1 = 1
            r0.sentinel = r1
            r0 = r8
            r1 = 0
            r0.dirty = r1
            r0 = r8
            r1 = r4
            org.lwjgl.util.glu.tessellation.Dict r1 = r1.dict
            r2 = r8
            org.lwjgl.util.glu.tessellation.DictNode r1 = org.lwjgl.util.glu.tessellation.Dict.dictInsert(r1, r2)
            r0.nodeUp = r1
            r0 = r8
            org.lwjgl.util.glu.tessellation.DictNode r0 = r0.nodeUp
            if (r0 != 0) goto L94
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r1 = r0
            r1.<init>()
            throw r0
        L94:
            return
    }

    static void InitEdgeDict(org.lwjgl.util.glu.tessellation.GLUtessellatorImpl r6) {
            r0 = r6
            r1 = r6
            org.lwjgl.util.glu.tessellation.Sweep$1 r2 = new org.lwjgl.util.glu.tessellation.Sweep$1
            r3 = r2
            r4 = r6
            r3.<init>(r4)
            org.lwjgl.util.glu.tessellation.Dict r1 = org.lwjgl.util.glu.tessellation.Dict.dictNewDict(r1, r2)
            r0.dict = r1
            r0 = r6
            org.lwjgl.util.glu.tessellation.Dict r0 = r0.dict
            if (r0 != 0) goto L1f
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r1 = r0
            r1.<init>()
            throw r0
        L1f:
            r0 = r6
            r1 = -2363390119889561937(0xdf338d352e5096af, double:-4.0E150)
            AddSentinel(r0, r1)
            r0 = r6
            r1 = 6859981916965213871(0x5f338d352e5096af, double:4.0E150)
            AddSentinel(r0, r1)
            return
    }

    static void DoneEdgeDict(org.lwjgl.util.glu.tessellation.GLUtessellatorImpl r3) {
            r0 = 0
            r5 = r0
        L2:
            r0 = r3
            org.lwjgl.util.glu.tessellation.Dict r0 = r0.dict
            org.lwjgl.util.glu.tessellation.DictNode r0 = org.lwjgl.util.glu.tessellation.Dict.dictMin(r0)
            java.lang.Object r0 = org.lwjgl.util.glu.tessellation.Dict.dictKey(r0)
            org.lwjgl.util.glu.tessellation.ActiveRegion r0 = (org.lwjgl.util.glu.tessellation.ActiveRegion) r0
            r1 = r0
            r4 = r1
            if (r0 == 0) goto L63
            r0 = r4
            boolean r0 = r0.sentinel
            if (r0 != 0) goto L46
            boolean r0 = org.lwjgl.util.glu.tessellation.Sweep.$assertionsDisabled
            if (r0 != 0) goto L30
            r0 = r4
            boolean r0 = r0.fixUpperEdge
            if (r0 != 0) goto L30
            java.lang.AssertionError r0 = new java.lang.AssertionError
            r1 = r0
            r1.<init>()
            throw r0
        L30:
            boolean r0 = org.lwjgl.util.glu.tessellation.Sweep.$assertionsDisabled
            if (r0 != 0) goto L46
            int r5 = r5 + 1
            r0 = r5
            r1 = 1
            if (r0 == r1) goto L46
            java.lang.AssertionError r0 = new java.lang.AssertionError
            r1 = r0
            r1.<init>()
            throw r0
        L46:
            boolean r0 = org.lwjgl.util.glu.tessellation.Sweep.$assertionsDisabled
            if (r0 != 0) goto L5b
            r0 = r4
            int r0 = r0.windingNumber
            if (r0 == 0) goto L5b
            java.lang.AssertionError r0 = new java.lang.AssertionError
            r1 = r0
            r1.<init>()
            throw r0
        L5b:
            r0 = r3
            r1 = r4
            DeleteRegion(r0, r1)
            goto L2
        L63:
            r0 = r3
            org.lwjgl.util.glu.tessellation.Dict r0 = r0.dict
            org.lwjgl.util.glu.tessellation.Dict.dictDeleteDict(r0)
            return
    }

    static void RemoveDegenerateEdges(org.lwjgl.util.glu.tessellation.GLUtessellatorImpl r4) {
            r0 = r4
            org.lwjgl.util.glu.tessellation.GLUmesh r0 = r0.mesh
            org.lwjgl.util.glu.tessellation.GLUhalfEdge r0 = r0.eHead
            r8 = r0
            r0 = r8
            org.lwjgl.util.glu.tessellation.GLUhalfEdge r0 = r0.next
            r5 = r0
        Lf:
            r0 = r5
            r1 = r8
            if (r0 == r1) goto Lab
            r0 = r5
            org.lwjgl.util.glu.tessellation.GLUhalfEdge r0 = r0.next
            r6 = r0
            r0 = r5
            org.lwjgl.util.glu.tessellation.GLUhalfEdge r0 = r0.Lnext
            r7 = r0
            r0 = r5
            org.lwjgl.util.glu.tessellation.GLUvertex r0 = r0.Org
            r1 = r5
            org.lwjgl.util.glu.tessellation.GLUhalfEdge r1 = r1.Sym
            org.lwjgl.util.glu.tessellation.GLUvertex r1 = r1.Org
            boolean r0 = org.lwjgl.util.glu.tessellation.Geom.VertEq(r0, r1)
            if (r0 == 0) goto L57
            r0 = r5
            org.lwjgl.util.glu.tessellation.GLUhalfEdge r0 = r0.Lnext
            org.lwjgl.util.glu.tessellation.GLUhalfEdge r0 = r0.Lnext
            r1 = r5
            if (r0 == r1) goto L57
            r0 = r4
            r1 = r7
            r2 = r5
            SpliceMergeVertices(r0, r1, r2)
            r0 = r5
            boolean r0 = org.lwjgl.util.glu.tessellation.Mesh.__gl_meshDelete(r0)
            if (r0 != 0) goto L50
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r1 = r0
            r1.<init>()
            throw r0
        L50:
            r0 = r7
            r5 = r0
            r0 = r5
            org.lwjgl.util.glu.tessellation.GLUhalfEdge r0 = r0.Lnext
            r7 = r0
        L57:
            r0 = r7
            org.lwjgl.util.glu.tessellation.GLUhalfEdge r0 = r0.Lnext
            r1 = r5
            if (r0 != r1) goto La6
            r0 = r7
            r1 = r5
            if (r0 == r1) goto L85
            r0 = r7
            r1 = r6
            if (r0 == r1) goto L71
            r0 = r7
            r1 = r6
            org.lwjgl.util.glu.tessellation.GLUhalfEdge r1 = r1.Sym
            if (r0 != r1) goto L76
        L71:
            r0 = r6
            org.lwjgl.util.glu.tessellation.GLUhalfEdge r0 = r0.next
            r6 = r0
        L76:
            r0 = r7
            boolean r0 = org.lwjgl.util.glu.tessellation.Mesh.__gl_meshDelete(r0)
            if (r0 != 0) goto L85
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r1 = r0
            r1.<init>()
            throw r0
        L85:
            r0 = r5
            r1 = r6
            if (r0 == r1) goto L92
            r0 = r5
            r1 = r6
            org.lwjgl.util.glu.tessellation.GLUhalfEdge r1 = r1.Sym
            if (r0 != r1) goto L97
        L92:
            r0 = r6
            org.lwjgl.util.glu.tessellation.GLUhalfEdge r0 = r0.next
            r6 = r0
        L97:
            r0 = r5
            boolean r0 = org.lwjgl.util.glu.tessellation.Mesh.__gl_meshDelete(r0)
            if (r0 != 0) goto La6
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r1 = r0
            r1.<init>()
            throw r0
        La6:
            r0 = r6
            r5 = r0
            goto Lf
        Lab:
            return
    }

    static boolean InitPriorityQ(org.lwjgl.util.glu.tessellation.GLUtessellatorImpl r5) {
            r0 = r5
            org.lwjgl.util.glu.tessellation.Sweep$2 r1 = new org.lwjgl.util.glu.tessellation.Sweep$2
            r2 = r1
            r2.<init>()
            org.lwjgl.util.glu.tessellation.PriorityQ r1 = org.lwjgl.util.glu.tessellation.PriorityQ.pqNewPriorityQ(r1)
            r2 = r1; r1 = r0; r0 = r2; 
            r1.pq = r2
            r6 = r0
            r0 = r6
            if (r0 != 0) goto L16
            r0 = 0
            return r0
        L16:
            r0 = r5
            org.lwjgl.util.glu.tessellation.GLUmesh r0 = r0.mesh
            org.lwjgl.util.glu.tessellation.GLUvertex r0 = r0.vHead
            r8 = r0
            r0 = r8
            org.lwjgl.util.glu.tessellation.GLUvertex r0 = r0.next
            r7 = r0
        L23:
            r0 = r7
            r1 = r8
            if (r0 == r1) goto L48
            r0 = r7
            r1 = r6
            r2 = r7
            int r1 = r1.pqInsert(r2)
            r0.pqHandle = r1
            r0 = r7
            int r0 = r0.pqHandle
            long r0 = (long) r0
            r1 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto L40
            goto L48
        L40:
            r0 = r7
            org.lwjgl.util.glu.tessellation.GLUvertex r0 = r0.next
            r7 = r0
            goto L23
        L48:
            r0 = r7
            r1 = r8
            if (r0 != r1) goto L54
            r0 = r6
            boolean r0 = r0.pqInit()
            if (r0 != 0) goto L62
        L54:
            r0 = r5
            org.lwjgl.util.glu.tessellation.PriorityQ r0 = r0.pq
            r0.pqDeletePriorityQ()
            r0 = r5
            r1 = 0
            r0.pq = r1
            r0 = 0
            return r0
        L62:
            r0 = 1
            return r0
    }

    static void DonePriorityQ(org.lwjgl.util.glu.tessellation.GLUtessellatorImpl r2) {
            r0 = r2
            org.lwjgl.util.glu.tessellation.PriorityQ r0 = r0.pq
            r0.pqDeletePriorityQ()
            return
    }

    static boolean RemoveDegenerateFaces(org.lwjgl.util.glu.tessellation.GLUmesh r3) {
            r0 = r3
            org.lwjgl.util.glu.tessellation.GLUface r0 = r0.fHead
            org.lwjgl.util.glu.tessellation.GLUface r0 = r0.next
            r4 = r0
        L8:
            r0 = r4
            r1 = r3
            org.lwjgl.util.glu.tessellation.GLUface r1 = r1.fHead
            if (r0 == r1) goto L51
            r0 = r4
            org.lwjgl.util.glu.tessellation.GLUface r0 = r0.next
            r5 = r0
            r0 = r4
            org.lwjgl.util.glu.tessellation.GLUhalfEdge r0 = r0.anEdge
            r6 = r0
            boolean r0 = org.lwjgl.util.glu.tessellation.Sweep.$assertionsDisabled
            if (r0 != 0) goto L30
            r0 = r6
            org.lwjgl.util.glu.tessellation.GLUhalfEdge r0 = r0.Lnext
            r1 = r6
            if (r0 != r1) goto L30
            java.lang.AssertionError r0 = new java.lang.AssertionError
            r1 = r0
            r1.<init>()
            throw r0
        L30:
            r0 = r6
            org.lwjgl.util.glu.tessellation.GLUhalfEdge r0 = r0.Lnext
            org.lwjgl.util.glu.tessellation.GLUhalfEdge r0 = r0.Lnext
            r1 = r6
            if (r0 != r1) goto L4c
            r0 = r6
            org.lwjgl.util.glu.tessellation.GLUhalfEdge r0 = r0.Onext
            r1 = r6
            AddWinding(r0, r1)
            r0 = r6
            boolean r0 = org.lwjgl.util.glu.tessellation.Mesh.__gl_meshDelete(r0)
            if (r0 != 0) goto L4c
            r0 = 0
            return r0
        L4c:
            r0 = r5
            r4 = r0
            goto L8
        L51:
            r0 = 1
            return r0
    }

    public static boolean __gl_computeInterior(org.lwjgl.util.glu.tessellation.GLUtessellatorImpl r4) {
            r0 = r4
            r1 = 0
            r0.fatalError = r1
            r0 = r4
            RemoveDegenerateEdges(r0)
            r0 = r4
            boolean r0 = InitPriorityQ(r0)
            if (r0 != 0) goto L12
            r0 = 0
            return r0
        L12:
            r0 = r4
            InitEdgeDict(r0)
        L16:
            r0 = r4
            org.lwjgl.util.glu.tessellation.PriorityQ r0 = r0.pq
            java.lang.Object r0 = r0.pqExtractMin()
            org.lwjgl.util.glu.tessellation.GLUvertex r0 = (org.lwjgl.util.glu.tessellation.GLUvertex) r0
            r1 = r0
            r5 = r1
            if (r0 == 0) goto L61
        L25:
            r0 = r4
            org.lwjgl.util.glu.tessellation.PriorityQ r0 = r0.pq
            java.lang.Object r0 = r0.pqMinimum()
            org.lwjgl.util.glu.tessellation.GLUvertex r0 = (org.lwjgl.util.glu.tessellation.GLUvertex) r0
            r6 = r0
            r0 = r6
            if (r0 == 0) goto L59
            r0 = r6
            r1 = r5
            boolean r0 = org.lwjgl.util.glu.tessellation.Geom.VertEq(r0, r1)
            if (r0 != 0) goto L3f
            goto L59
        L3f:
            r0 = r4
            org.lwjgl.util.glu.tessellation.PriorityQ r0 = r0.pq
            java.lang.Object r0 = r0.pqExtractMin()
            org.lwjgl.util.glu.tessellation.GLUvertex r0 = (org.lwjgl.util.glu.tessellation.GLUvertex) r0
            r6 = r0
            r0 = r4
            r1 = r5
            org.lwjgl.util.glu.tessellation.GLUhalfEdge r1 = r1.anEdge
            r2 = r6
            org.lwjgl.util.glu.tessellation.GLUhalfEdge r2 = r2.anEdge
            SpliceMergeVertices(r0, r1, r2)
            goto L25
        L59:
            r0 = r4
            r1 = r5
            SweepEvent(r0, r1)
            goto L16
        L61:
            r0 = r4
            r1 = r4
            org.lwjgl.util.glu.tessellation.Dict r1 = r1.dict
            org.lwjgl.util.glu.tessellation.DictNode r1 = org.lwjgl.util.glu.tessellation.Dict.dictMin(r1)
            java.lang.Object r1 = org.lwjgl.util.glu.tessellation.Dict.dictKey(r1)
            org.lwjgl.util.glu.tessellation.ActiveRegion r1 = (org.lwjgl.util.glu.tessellation.ActiveRegion) r1
            org.lwjgl.util.glu.tessellation.GLUhalfEdge r1 = r1.eUp
            org.lwjgl.util.glu.tessellation.GLUvertex r1 = r1.Org
            r0.event = r1
            r0 = r4
            DebugEvent(r0)
            r0 = r4
            DoneEdgeDict(r0)
            r0 = r4
            DonePriorityQ(r0)
            r0 = r4
            org.lwjgl.util.glu.tessellation.GLUmesh r0 = r0.mesh
            boolean r0 = RemoveDegenerateFaces(r0)
            if (r0 != 0) goto L90
            r0 = 0
            return r0
        L90:
            r0 = r4
            org.lwjgl.util.glu.tessellation.GLUmesh r0 = r0.mesh
            org.lwjgl.util.glu.tessellation.Mesh.__gl_meshCheckMesh(r0)
            r0 = 1
            return r0
    }

    static {
            java.lang.Class<org.lwjgl.util.glu.tessellation.Sweep> r0 = org.lwjgl.util.glu.tessellation.Sweep.class
            boolean r0 = r0.desiredAssertionStatus()
            if (r0 != 0) goto Lc
            r0 = 1
            goto Ld
        Lc:
            r0 = 0
        Ld:
            org.lwjgl.util.glu.tessellation.Sweep.$assertionsDisabled = r0
            return
    }
}
