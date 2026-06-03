package org.lwjgl.util.glu.tessellation;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/util/glu/tessellation/TessMono.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/util/glu/tessellation/TessMono.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/util/glu/tessellation/TessMono.class */
class TessMono {
    static final /* synthetic */ boolean $assertionsDisabled = false;

    TessMono() {
            r2 = this;
            r0 = r2
            r0.<init>()
            return
    }

    static boolean __gl_meshTessellateMonoRegion(org.lwjgl.util.glu.tessellation.GLUface r5) {
            r0 = r5
            org.lwjgl.util.glu.tessellation.GLUhalfEdge r0 = r0.anEdge
            r6 = r0
            boolean r0 = org.lwjgl.util.glu.tessellation.TessMono.$assertionsDisabled
            if (r0 != 0) goto L26
            r0 = r6
            org.lwjgl.util.glu.tessellation.GLUhalfEdge r0 = r0.Lnext
            r1 = r6
            if (r0 == r1) goto L1e
            r0 = r6
            org.lwjgl.util.glu.tessellation.GLUhalfEdge r0 = r0.Lnext
            org.lwjgl.util.glu.tessellation.GLUhalfEdge r0 = r0.Lnext
            r1 = r6
            if (r0 != r1) goto L26
        L1e:
            java.lang.AssertionError r0 = new java.lang.AssertionError
            r1 = r0
            r1.<init>()
            throw r0
        L26:
            r0 = r6
            org.lwjgl.util.glu.tessellation.GLUhalfEdge r0 = r0.Sym
            org.lwjgl.util.glu.tessellation.GLUvertex r0 = r0.Org
            r1 = r6
            org.lwjgl.util.glu.tessellation.GLUvertex r1 = r1.Org
            boolean r0 = org.lwjgl.util.glu.tessellation.Geom.VertLeq(r0, r1)
            if (r0 == 0) goto L42
            r0 = r6
            org.lwjgl.util.glu.tessellation.GLUhalfEdge r0 = r0.Onext
            org.lwjgl.util.glu.tessellation.GLUhalfEdge r0 = r0.Sym
            r6 = r0
            goto L26
        L42:
            r0 = r6
            org.lwjgl.util.glu.tessellation.GLUvertex r0 = r0.Org
            r1 = r6
            org.lwjgl.util.glu.tessellation.GLUhalfEdge r1 = r1.Sym
            org.lwjgl.util.glu.tessellation.GLUvertex r1 = r1.Org
            boolean r0 = org.lwjgl.util.glu.tessellation.Geom.VertLeq(r0, r1)
            if (r0 == 0) goto L5b
            r0 = r6
            org.lwjgl.util.glu.tessellation.GLUhalfEdge r0 = r0.Lnext
            r6 = r0
            goto L42
        L5b:
            r0 = r6
            org.lwjgl.util.glu.tessellation.GLUhalfEdge r0 = r0.Onext
            org.lwjgl.util.glu.tessellation.GLUhalfEdge r0 = r0.Sym
            r7 = r0
        L63:
            r0 = r6
            org.lwjgl.util.glu.tessellation.GLUhalfEdge r0 = r0.Lnext
            r1 = r7
            if (r0 == r1) goto L121
            r0 = r6
            org.lwjgl.util.glu.tessellation.GLUhalfEdge r0 = r0.Sym
            org.lwjgl.util.glu.tessellation.GLUvertex r0 = r0.Org
            r1 = r7
            org.lwjgl.util.glu.tessellation.GLUvertex r1 = r1.Org
            boolean r0 = org.lwjgl.util.glu.tessellation.Geom.VertLeq(r0, r1)
            if (r0 == 0) goto Lcd
        L7c:
            r0 = r7
            org.lwjgl.util.glu.tessellation.GLUhalfEdge r0 = r0.Lnext
            r1 = r6
            if (r0 == r1) goto Lc2
            r0 = r7
            org.lwjgl.util.glu.tessellation.GLUhalfEdge r0 = r0.Lnext
            boolean r0 = org.lwjgl.util.glu.tessellation.Geom.EdgeGoesLeft(r0)
            if (r0 != 0) goto Lab
            r0 = r7
            org.lwjgl.util.glu.tessellation.GLUvertex r0 = r0.Org
            r1 = r7
            org.lwjgl.util.glu.tessellation.GLUhalfEdge r1 = r1.Sym
            org.lwjgl.util.glu.tessellation.GLUvertex r1 = r1.Org
            r2 = r7
            org.lwjgl.util.glu.tessellation.GLUhalfEdge r2 = r2.Lnext
            org.lwjgl.util.glu.tessellation.GLUhalfEdge r2 = r2.Sym
            org.lwjgl.util.glu.tessellation.GLUvertex r2 = r2.Org
            double r0 = org.lwjgl.util.glu.tessellation.Geom.EdgeSign(r0, r1, r2)
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 > 0) goto Lc2
        Lab:
            r0 = r7
            org.lwjgl.util.glu.tessellation.GLUhalfEdge r0 = r0.Lnext
            r1 = r7
            org.lwjgl.util.glu.tessellation.GLUhalfEdge r0 = org.lwjgl.util.glu.tessellation.Mesh.__gl_meshConnect(r0, r1)
            r8 = r0
            r0 = r8
            if (r0 != 0) goto Lba
            r0 = 0
            return r0
        Lba:
            r0 = r8
            org.lwjgl.util.glu.tessellation.GLUhalfEdge r0 = r0.Sym
            r7 = r0
            goto L7c
        Lc2:
            r0 = r7
            org.lwjgl.util.glu.tessellation.GLUhalfEdge r0 = r0.Onext
            org.lwjgl.util.glu.tessellation.GLUhalfEdge r0 = r0.Sym
            r7 = r0
            goto L63
        Lcd:
            r0 = r7
            org.lwjgl.util.glu.tessellation.GLUhalfEdge r0 = r0.Lnext
            r1 = r6
            if (r0 == r1) goto L119
            r0 = r6
            org.lwjgl.util.glu.tessellation.GLUhalfEdge r0 = r0.Onext
            org.lwjgl.util.glu.tessellation.GLUhalfEdge r0 = r0.Sym
            boolean r0 = org.lwjgl.util.glu.tessellation.Geom.EdgeGoesRight(r0)
            if (r0 != 0) goto Lff
            r0 = r6
            org.lwjgl.util.glu.tessellation.GLUhalfEdge r0 = r0.Sym
            org.lwjgl.util.glu.tessellation.GLUvertex r0 = r0.Org
            r1 = r6
            org.lwjgl.util.glu.tessellation.GLUvertex r1 = r1.Org
            r2 = r6
            org.lwjgl.util.glu.tessellation.GLUhalfEdge r2 = r2.Onext
            org.lwjgl.util.glu.tessellation.GLUhalfEdge r2 = r2.Sym
            org.lwjgl.util.glu.tessellation.GLUvertex r2 = r2.Org
            double r0 = org.lwjgl.util.glu.tessellation.Geom.EdgeSign(r0, r1, r2)
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 < 0) goto L119
        Lff:
            r0 = r6
            r1 = r6
            org.lwjgl.util.glu.tessellation.GLUhalfEdge r1 = r1.Onext
            org.lwjgl.util.glu.tessellation.GLUhalfEdge r1 = r1.Sym
            org.lwjgl.util.glu.tessellation.GLUhalfEdge r0 = org.lwjgl.util.glu.tessellation.Mesh.__gl_meshConnect(r0, r1)
            r8 = r0
            r0 = r8
            if (r0 != 0) goto L111
            r0 = 0
            return r0
        L111:
            r0 = r8
            org.lwjgl.util.glu.tessellation.GLUhalfEdge r0 = r0.Sym
            r6 = r0
            goto Lcd
        L119:
            r0 = r6
            org.lwjgl.util.glu.tessellation.GLUhalfEdge r0 = r0.Lnext
            r6 = r0
            goto L63
        L121:
            boolean r0 = org.lwjgl.util.glu.tessellation.TessMono.$assertionsDisabled
            if (r0 != 0) goto L137
            r0 = r7
            org.lwjgl.util.glu.tessellation.GLUhalfEdge r0 = r0.Lnext
            r1 = r6
            if (r0 != r1) goto L137
            java.lang.AssertionError r0 = new java.lang.AssertionError
            r1 = r0
            r1.<init>()
            throw r0
        L137:
            r0 = r7
            org.lwjgl.util.glu.tessellation.GLUhalfEdge r0 = r0.Lnext
            org.lwjgl.util.glu.tessellation.GLUhalfEdge r0 = r0.Lnext
            r1 = r6
            if (r0 == r1) goto L159
            r0 = r7
            org.lwjgl.util.glu.tessellation.GLUhalfEdge r0 = r0.Lnext
            r1 = r7
            org.lwjgl.util.glu.tessellation.GLUhalfEdge r0 = org.lwjgl.util.glu.tessellation.Mesh.__gl_meshConnect(r0, r1)
            r8 = r0
            r0 = r8
            if (r0 != 0) goto L151
            r0 = 0
            return r0
        L151:
            r0 = r8
            org.lwjgl.util.glu.tessellation.GLUhalfEdge r0 = r0.Sym
            r7 = r0
            goto L137
        L159:
            r0 = 1
            return r0
    }

    public static boolean __gl_meshTessellateInterior(org.lwjgl.util.glu.tessellation.GLUmesh r3) {
            r0 = r3
            org.lwjgl.util.glu.tessellation.GLUface r0 = r0.fHead
            org.lwjgl.util.glu.tessellation.GLUface r0 = r0.next
            r4 = r0
        L8:
            r0 = r4
            r1 = r3
            org.lwjgl.util.glu.tessellation.GLUface r1 = r1.fHead
            if (r0 == r1) goto L2a
            r0 = r4
            org.lwjgl.util.glu.tessellation.GLUface r0 = r0.next
            r5 = r0
            r0 = r4
            boolean r0 = r0.inside
            if (r0 == 0) goto L25
            r0 = r4
            boolean r0 = __gl_meshTessellateMonoRegion(r0)
            if (r0 != 0) goto L25
            r0 = 0
            return r0
        L25:
            r0 = r5
            r4 = r0
            goto L8
        L2a:
            r0 = 1
            return r0
    }

    public static void __gl_meshDiscardExterior(org.lwjgl.util.glu.tessellation.GLUmesh r3) {
            r0 = r3
            org.lwjgl.util.glu.tessellation.GLUface r0 = r0.fHead
            org.lwjgl.util.glu.tessellation.GLUface r0 = r0.next
            r4 = r0
        L8:
            r0 = r4
            r1 = r3
            org.lwjgl.util.glu.tessellation.GLUface r1 = r1.fHead
            if (r0 == r1) goto L25
            r0 = r4
            org.lwjgl.util.glu.tessellation.GLUface r0 = r0.next
            r5 = r0
            r0 = r4
            boolean r0 = r0.inside
            if (r0 != 0) goto L20
            r0 = r4
            org.lwjgl.util.glu.tessellation.Mesh.__gl_meshZapFace(r0)
        L20:
            r0 = r5
            r4 = r0
            goto L8
        L25:
            return
    }

    public static boolean __gl_meshSetWindingNumber(org.lwjgl.util.glu.tessellation.GLUmesh r3, int r4, boolean r5) {
            r0 = r3
            org.lwjgl.util.glu.tessellation.GLUhalfEdge r0 = r0.eHead
            org.lwjgl.util.glu.tessellation.GLUhalfEdge r0 = r0.next
            r6 = r0
        L8:
            r0 = r6
            r1 = r3
            org.lwjgl.util.glu.tessellation.GLUhalfEdge r1 = r1.eHead
            if (r0 == r1) goto L5c
            r0 = r6
            org.lwjgl.util.glu.tessellation.GLUhalfEdge r0 = r0.next
            r7 = r0
            r0 = r6
            org.lwjgl.util.glu.tessellation.GLUhalfEdge r0 = r0.Sym
            org.lwjgl.util.glu.tessellation.GLUface r0 = r0.Lface
            boolean r0 = r0.inside
            r1 = r6
            org.lwjgl.util.glu.tessellation.GLUface r1 = r1.Lface
            boolean r1 = r1.inside
            if (r0 == r1) goto L41
            r0 = r6
            r1 = r6
            org.lwjgl.util.glu.tessellation.GLUface r1 = r1.Lface
            boolean r1 = r1.inside
            if (r1 == 0) goto L39
            r1 = r4
            goto L3b
        L39:
            r1 = r4
            int r1 = -r1
        L3b:
            r0.winding = r1
            goto L56
        L41:
            r0 = r5
            if (r0 != 0) goto L4d
            r0 = r6
            r1 = 0
            r0.winding = r1
            goto L56
        L4d:
            r0 = r6
            boolean r0 = org.lwjgl.util.glu.tessellation.Mesh.__gl_meshDelete(r0)
            if (r0 != 0) goto L56
            r0 = 0
            return r0
        L56:
            r0 = r7
            r6 = r0
            goto L8
        L5c:
            r0 = 1
            return r0
    }

    static {
            java.lang.Class<org.lwjgl.util.glu.tessellation.TessMono> r0 = org.lwjgl.util.glu.tessellation.TessMono.class
            boolean r0 = r0.desiredAssertionStatus()
            if (r0 != 0) goto Lc
            r0 = 1
            goto Ld
        Lc:
            r0 = 0
        Ld:
            org.lwjgl.util.glu.tessellation.TessMono.$assertionsDisabled = r0
            return
    }
}
