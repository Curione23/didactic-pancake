package org.lwjgl.util.glu.tessellation;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/util/glu/tessellation/GLUtessellatorImpl.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/util/glu/tessellation/GLUtessellatorImpl.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/util/glu/tessellation/GLUtessellatorImpl.class */
public class GLUtessellatorImpl implements org.lwjgl.util.glu.GLUtessellator {
    public static final int TESS_MAX_CACHE = 100;
    private int state;
    private org.lwjgl.util.glu.tessellation.GLUhalfEdge lastEdge;
    org.lwjgl.util.glu.tessellation.GLUmesh mesh;
    double[] normal;
    double[] sUnit;
    double[] tUnit;
    private double relTolerance;
    int windingRule;
    boolean fatalError;
    org.lwjgl.util.glu.tessellation.Dict dict;
    org.lwjgl.util.glu.tessellation.PriorityQ pq;
    org.lwjgl.util.glu.tessellation.GLUvertex event;
    boolean flagBoundary;
    boolean boundaryOnly;
    org.lwjgl.util.glu.tessellation.GLUface lonelyTriList;
    private boolean flushCacheOnNextVertex;
    int cacheCount;
    org.lwjgl.util.glu.tessellation.CachedVertex[] cache;
    private java.lang.Object polygonData;
    private org.lwjgl.util.glu.GLUtessellatorCallback callBegin;
    private org.lwjgl.util.glu.GLUtessellatorCallback callEdgeFlag;
    private org.lwjgl.util.glu.GLUtessellatorCallback callVertex;
    private org.lwjgl.util.glu.GLUtessellatorCallback callEnd;
    private org.lwjgl.util.glu.GLUtessellatorCallback callError;
    private org.lwjgl.util.glu.GLUtessellatorCallback callCombine;
    private org.lwjgl.util.glu.GLUtessellatorCallback callBeginData;
    private org.lwjgl.util.glu.GLUtessellatorCallback callEdgeFlagData;
    private org.lwjgl.util.glu.GLUtessellatorCallback callVertexData;
    private org.lwjgl.util.glu.GLUtessellatorCallback callEndData;
    private org.lwjgl.util.glu.GLUtessellatorCallback callErrorData;
    private org.lwjgl.util.glu.GLUtessellatorCallback callCombineData;
    private static final double GLU_TESS_DEFAULT_TOLERANCE = 0.0d;
    private static org.lwjgl.util.glu.GLUtessellatorCallback NULL_CB;
    static final /* synthetic */ boolean $assertionsDisabled = false;

    public GLUtessellatorImpl() {
            r5 = this;
            r0 = r5
            r0.<init>()
            r0 = r5
            r1 = 3
            double[] r1 = new double[r1]
            r0.normal = r1
            r0 = r5
            r1 = 3
            double[] r1 = new double[r1]
            r0.sUnit = r1
            r0 = r5
            r1 = 3
            double[] r1 = new double[r1]
            r0.tUnit = r1
            r0 = r5
            r1 = 100
            org.lwjgl.util.glu.tessellation.CachedVertex[] r1 = new org.lwjgl.util.glu.tessellation.CachedVertex[r1]
            r0.cache = r1
            r0 = r5
            r1 = 0
            r0.state = r1
            r0 = r5
            double[] r0 = r0.normal
            r1 = 0
            r2 = 0
            r0[r1] = r2
            r0 = r5
            double[] r0 = r0.normal
            r1 = 1
            r2 = 0
            r0[r1] = r2
            r0 = r5
            double[] r0 = r0.normal
            r1 = 2
            r2 = 0
            r0[r1] = r2
            r0 = r5
            r1 = 0
            r0.relTolerance = r1
            r0 = r5
            r1 = 100130(0x18722, float:1.40312E-40)
            r0.windingRule = r1
            r0 = r5
            r1 = 0
            r0.flagBoundary = r1
            r0 = r5
            r1 = 0
            r0.boundaryOnly = r1
            r0 = r5
            org.lwjgl.util.glu.GLUtessellatorCallback r1 = org.lwjgl.util.glu.tessellation.GLUtessellatorImpl.NULL_CB
            r0.callBegin = r1
            r0 = r5
            org.lwjgl.util.glu.GLUtessellatorCallback r1 = org.lwjgl.util.glu.tessellation.GLUtessellatorImpl.NULL_CB
            r0.callEdgeFlag = r1
            r0 = r5
            org.lwjgl.util.glu.GLUtessellatorCallback r1 = org.lwjgl.util.glu.tessellation.GLUtessellatorImpl.NULL_CB
            r0.callVertex = r1
            r0 = r5
            org.lwjgl.util.glu.GLUtessellatorCallback r1 = org.lwjgl.util.glu.tessellation.GLUtessellatorImpl.NULL_CB
            r0.callEnd = r1
            r0 = r5
            org.lwjgl.util.glu.GLUtessellatorCallback r1 = org.lwjgl.util.glu.tessellation.GLUtessellatorImpl.NULL_CB
            r0.callError = r1
            r0 = r5
            org.lwjgl.util.glu.GLUtessellatorCallback r1 = org.lwjgl.util.glu.tessellation.GLUtessellatorImpl.NULL_CB
            r0.callCombine = r1
            r0 = r5
            org.lwjgl.util.glu.GLUtessellatorCallback r1 = org.lwjgl.util.glu.tessellation.GLUtessellatorImpl.NULL_CB
            r0.callBeginData = r1
            r0 = r5
            org.lwjgl.util.glu.GLUtessellatorCallback r1 = org.lwjgl.util.glu.tessellation.GLUtessellatorImpl.NULL_CB
            r0.callEdgeFlagData = r1
            r0 = r5
            org.lwjgl.util.glu.GLUtessellatorCallback r1 = org.lwjgl.util.glu.tessellation.GLUtessellatorImpl.NULL_CB
            r0.callVertexData = r1
            r0 = r5
            org.lwjgl.util.glu.GLUtessellatorCallback r1 = org.lwjgl.util.glu.tessellation.GLUtessellatorImpl.NULL_CB
            r0.callEndData = r1
            r0 = r5
            org.lwjgl.util.glu.GLUtessellatorCallback r1 = org.lwjgl.util.glu.tessellation.GLUtessellatorImpl.NULL_CB
            r0.callErrorData = r1
            r0 = r5
            org.lwjgl.util.glu.GLUtessellatorCallback r1 = org.lwjgl.util.glu.tessellation.GLUtessellatorImpl.NULL_CB
            r0.callCombineData = r1
            r0 = r5
            r1 = 0
            r0.polygonData = r1
            r0 = 0
            r6 = r0
        Lac:
            r0 = r6
            r1 = r5
            org.lwjgl.util.glu.tessellation.CachedVertex[] r1 = r1.cache
            int r1 = r1.length
            if (r0 >= r1) goto Lc8
            r0 = r5
            org.lwjgl.util.glu.tessellation.CachedVertex[] r0 = r0.cache
            r1 = r6
            org.lwjgl.util.glu.tessellation.CachedVertex r2 = new org.lwjgl.util.glu.tessellation.CachedVertex
            r3 = r2
            r3.<init>()
            r0[r1] = r2
            int r6 = r6 + 1
            goto Lac
        Lc8:
            return
    }

    public static org.lwjgl.util.glu.GLUtessellator gluNewTess() {
            org.lwjgl.util.glu.tessellation.GLUtessellatorImpl r0 = new org.lwjgl.util.glu.tessellation.GLUtessellatorImpl
            r1 = r0
            r1.<init>()
            return r0
    }

    private void makeDormant() {
            r3 = this;
            r0 = r3
            org.lwjgl.util.glu.tessellation.GLUmesh r0 = r0.mesh
            if (r0 == 0) goto Le
            r0 = r3
            org.lwjgl.util.glu.tessellation.GLUmesh r0 = r0.mesh
            org.lwjgl.util.glu.tessellation.Mesh.__gl_meshDeleteMesh(r0)
        Le:
            r0 = r3
            r1 = 0
            r0.state = r1
            r0 = r3
            r1 = 0
            r0.lastEdge = r1
            r0 = r3
            r1 = 0
            r0.mesh = r1
            return
    }

    private void requireState(int r4) {
            r3 = this;
            r0 = r3
            int r0 = r0.state
            r1 = r4
            if (r0 == r1) goto Ld
            r0 = r3
            r1 = r4
            r0.gotoState(r1)
        Ld:
            return
    }

    private void gotoState(int r4) {
            r3 = this;
        L0:
            r0 = r3
            int r0 = r0.state
            r1 = r4
            if (r0 == r1) goto L64
            r0 = r3
            int r0 = r0.state
            r1 = r4
            if (r0 >= r1) goto L3a
            r0 = r3
            int r0 = r0.state
            if (r0 != 0) goto L25
            r0 = r3
            r1 = 100151(0x18737, float:1.40341E-40)
            r0.callErrorOrErrorData(r1)
            r0 = r3
            r1 = 0
            r0.gluTessBeginPolygon(r1)
            goto L0
        L25:
            r0 = r3
            int r0 = r0.state
            r1 = 1
            if (r0 != r1) goto L0
            r0 = r3
            r1 = 100152(0x18738, float:1.40343E-40)
            r0.callErrorOrErrorData(r1)
            r0 = r3
            r0.gluTessBeginContour()
            goto L0
        L3a:
            r0 = r3
            int r0 = r0.state
            r1 = 2
            if (r0 != r1) goto L4f
            r0 = r3
            r1 = 100154(0x1873a, float:1.40346E-40)
            r0.callErrorOrErrorData(r1)
            r0 = r3
            r0.gluTessEndContour()
            goto L0
        L4f:
            r0 = r3
            int r0 = r0.state
            r1 = 1
            if (r0 != r1) goto L0
            r0 = r3
            r1 = 100153(0x18739, float:1.40344E-40)
            r0.callErrorOrErrorData(r1)
            r0 = r3
            r0.makeDormant()
            goto L0
        L64:
            return
    }

    @Override // org.lwjgl.util.glu.GLUtessellator
    public void gluDeleteTess() {
            r3 = this;
            r0 = r3
            r1 = 0
            r0.requireState(r1)
            return
    }

    @Override // org.lwjgl.util.glu.GLUtessellator
    public void gluTessProperty(int r7, double r8) {
            r6 = this;
            r0 = r7
            switch(r0) {
                case 100140: goto L31;
                case 100141: goto L6b;
                case 100142: goto L1c;
                default: goto L7b;
            }
        L1c:
            r0 = r8
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 < 0) goto L82
            r0 = r8
            r1 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 <= 0) goto L2b
            goto L82
        L2b:
            r0 = r6
            r1 = r8
            r0.relTolerance = r1
            return
        L31:
            r0 = r8
            int r0 = (int) r0
            r10 = r0
            r0 = r10
            double r0 = (double) r0
            r1 = r8
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto L40
            goto L82
        L40:
            r0 = r10
            switch(r0) {
                case 100130: goto L64;
                case 100131: goto L64;
                case 100132: goto L64;
                case 100133: goto L64;
                case 100134: goto L64;
                default: goto L6b;
            }
        L64:
            r0 = r6
            r1 = r10
            r0.windingRule = r1
            return
        L6b:
            r0 = r6
            r1 = r8
            r2 = 0
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 == 0) goto L76
            r1 = 1
            goto L77
        L76:
            r1 = 0
        L77:
            r0.boundaryOnly = r1
            return
        L7b:
            r0 = r6
            r1 = 100900(0x18a24, float:1.41391E-40)
            r0.callErrorOrErrorData(r1)
            return
        L82:
            r0 = r6
            r1 = 100901(0x18a25, float:1.41392E-40)
            r0.callErrorOrErrorData(r1)
            return
    }

    @Override // org.lwjgl.util.glu.GLUtessellator
    public void gluGetTessProperty(int r6, double[] r7, int r8) {
            r5 = this;
            r0 = r6
            switch(r0) {
                case 100140: goto L46;
                case 100141: goto L8c;
                case 100142: goto L1c;
                default: goto Lbb;
            }
        L1c:
            boolean r0 = org.lwjgl.util.glu.tessellation.GLUtessellatorImpl.$assertionsDisabled
            if (r0 != 0) goto L3c
            r0 = 0
            r1 = r5
            double r1 = r1.relTolerance
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 > 0) goto L34
            r0 = r5
            double r0 = r0.relTolerance
            r1 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 <= 0) goto L3c
        L34:
            java.lang.AssertionError r0 = new java.lang.AssertionError
            r1 = r0
            r1.<init>()
            throw r0
        L3c:
            r0 = r7
            r1 = r8
            r2 = r5
            double r2 = r2.relTolerance
            r0[r1] = r2
            goto Lc5
        L46:
            boolean r0 = org.lwjgl.util.glu.tessellation.GLUtessellatorImpl.$assertionsDisabled
            if (r0 != 0) goto L81
            r0 = r5
            int r0 = r0.windingRule
            r1 = 100130(0x18722, float:1.40312E-40)
            if (r0 == r1) goto L81
            r0 = r5
            int r0 = r0.windingRule
            r1 = 100131(0x18723, float:1.40313E-40)
            if (r0 == r1) goto L81
            r0 = r5
            int r0 = r0.windingRule
            r1 = 100132(0x18724, float:1.40315E-40)
            if (r0 == r1) goto L81
            r0 = r5
            int r0 = r0.windingRule
            r1 = 100133(0x18725, float:1.40316E-40)
            if (r0 == r1) goto L81
            r0 = r5
            int r0 = r0.windingRule
            r1 = 100134(0x18726, float:1.40318E-40)
            if (r0 == r1) goto L81
            java.lang.AssertionError r0 = new java.lang.AssertionError
            r1 = r0
            r1.<init>()
            throw r0
        L81:
            r0 = r7
            r1 = r8
            r2 = r5
            int r2 = r2.windingRule
            double r2 = (double) r2
            r0[r1] = r2
            goto Lc5
        L8c:
            boolean r0 = org.lwjgl.util.glu.tessellation.GLUtessellatorImpl.$assertionsDisabled
            if (r0 != 0) goto La9
            r0 = r5
            boolean r0 = r0.boundaryOnly
            r1 = 1
            if (r0 == r1) goto La9
            r0 = r5
            boolean r0 = r0.boundaryOnly
            if (r0 == 0) goto La9
            java.lang.AssertionError r0 = new java.lang.AssertionError
            r1 = r0
            r1.<init>()
            throw r0
        La9:
            r0 = r7
            r1 = r8
            r2 = r5
            boolean r2 = r2.boundaryOnly
            if (r2 == 0) goto Lb6
            r2 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            goto Lb7
        Lb6:
            r2 = 0
        Lb7:
            r0[r1] = r2
            goto Lc5
        Lbb:
            r0 = r7
            r1 = r8
            r2 = 0
            r0[r1] = r2
            r0 = r5
            r1 = 100900(0x18a24, float:1.41391E-40)
            r0.callErrorOrErrorData(r1)
        Lc5:
            return
    }

    @Override // org.lwjgl.util.glu.GLUtessellator
    public void gluTessNormal(double r6, double r8, double r10) {
            r5 = this;
            r0 = r5
            double[] r0 = r0.normal
            r1 = 0
            r2 = r6
            r0[r1] = r2
            r0 = r5
            double[] r0 = r0.normal
            r1 = 1
            r2 = r8
            r0[r1] = r2
            r0 = r5
            double[] r0 = r0.normal
            r1 = 2
            r2 = r10
            r0[r1] = r2
            return
    }

    @Override // org.lwjgl.util.glu.GLUtessellator
    public void gluTessCallback(int r6, org.lwjgl.util.glu.GLUtessellatorCallback r7) {
            r5 = this;
            r0 = r6
            switch(r0) {
                case 100100: goto L40;
                case 100101: goto L9f;
                case 100102: goto Lbf;
                case 100103: goto Ldf;
                case 100104: goto L60;
                case 100105: goto Lff;
                case 100106: goto L50;
                case 100107: goto Laf;
                case 100108: goto Lcf;
                case 100109: goto Lef;
                case 100110: goto L7d;
                case 100111: goto L10f;
                default: goto L11f;
            }
        L40:
            r0 = r5
            r1 = r7
            if (r1 != 0) goto L4b
            org.lwjgl.util.glu.GLUtessellatorCallback r1 = org.lwjgl.util.glu.tessellation.GLUtessellatorImpl.NULL_CB
            goto L4c
        L4b:
            r1 = r7
        L4c:
            r0.callBegin = r1
            return
        L50:
            r0 = r5
            r1 = r7
            if (r1 != 0) goto L5b
            org.lwjgl.util.glu.GLUtessellatorCallback r1 = org.lwjgl.util.glu.tessellation.GLUtessellatorImpl.NULL_CB
            goto L5c
        L5b:
            r1 = r7
        L5c:
            r0.callBeginData = r1
            return
        L60:
            r0 = r5
            r1 = r7
            if (r1 != 0) goto L6b
            org.lwjgl.util.glu.GLUtessellatorCallback r1 = org.lwjgl.util.glu.tessellation.GLUtessellatorImpl.NULL_CB
            goto L6c
        L6b:
            r1 = r7
        L6c:
            r0.callEdgeFlag = r1
            r0 = r5
            r1 = r7
            if (r1 == 0) goto L78
            r1 = 1
            goto L79
        L78:
            r1 = 0
        L79:
            r0.flagBoundary = r1
            return
        L7d:
            r0 = r5
            r1 = r5
            r2 = r7
            if (r2 != 0) goto L89
            org.lwjgl.util.glu.GLUtessellatorCallback r2 = org.lwjgl.util.glu.tessellation.GLUtessellatorImpl.NULL_CB
            goto L8a
        L89:
            r2 = r7
        L8a:
            r3 = r2; r2 = r1; r1 = r3; 
            r2.callBegin = r3
            r0.callEdgeFlagData = r1
            r0 = r5
            r1 = r7
            if (r1 == 0) goto L9a
            r1 = 1
            goto L9b
        L9a:
            r1 = 0
        L9b:
            r0.flagBoundary = r1
            return
        L9f:
            r0 = r5
            r1 = r7
            if (r1 != 0) goto Laa
            org.lwjgl.util.glu.GLUtessellatorCallback r1 = org.lwjgl.util.glu.tessellation.GLUtessellatorImpl.NULL_CB
            goto Lab
        Laa:
            r1 = r7
        Lab:
            r0.callVertex = r1
            return
        Laf:
            r0 = r5
            r1 = r7
            if (r1 != 0) goto Lba
            org.lwjgl.util.glu.GLUtessellatorCallback r1 = org.lwjgl.util.glu.tessellation.GLUtessellatorImpl.NULL_CB
            goto Lbb
        Lba:
            r1 = r7
        Lbb:
            r0.callVertexData = r1
            return
        Lbf:
            r0 = r5
            r1 = r7
            if (r1 != 0) goto Lca
            org.lwjgl.util.glu.GLUtessellatorCallback r1 = org.lwjgl.util.glu.tessellation.GLUtessellatorImpl.NULL_CB
            goto Lcb
        Lca:
            r1 = r7
        Lcb:
            r0.callEnd = r1
            return
        Lcf:
            r0 = r5
            r1 = r7
            if (r1 != 0) goto Lda
            org.lwjgl.util.glu.GLUtessellatorCallback r1 = org.lwjgl.util.glu.tessellation.GLUtessellatorImpl.NULL_CB
            goto Ldb
        Lda:
            r1 = r7
        Ldb:
            r0.callEndData = r1
            return
        Ldf:
            r0 = r5
            r1 = r7
            if (r1 != 0) goto Lea
            org.lwjgl.util.glu.GLUtessellatorCallback r1 = org.lwjgl.util.glu.tessellation.GLUtessellatorImpl.NULL_CB
            goto Leb
        Lea:
            r1 = r7
        Leb:
            r0.callError = r1
            return
        Lef:
            r0 = r5
            r1 = r7
            if (r1 != 0) goto Lfa
            org.lwjgl.util.glu.GLUtessellatorCallback r1 = org.lwjgl.util.glu.tessellation.GLUtessellatorImpl.NULL_CB
            goto Lfb
        Lfa:
            r1 = r7
        Lfb:
            r0.callErrorData = r1
            return
        Lff:
            r0 = r5
            r1 = r7
            if (r1 != 0) goto L10a
            org.lwjgl.util.glu.GLUtessellatorCallback r1 = org.lwjgl.util.glu.tessellation.GLUtessellatorImpl.NULL_CB
            goto L10b
        L10a:
            r1 = r7
        L10b:
            r0.callCombine = r1
            return
        L10f:
            r0 = r5
            r1 = r7
            if (r1 != 0) goto L11a
            org.lwjgl.util.glu.GLUtessellatorCallback r1 = org.lwjgl.util.glu.tessellation.GLUtessellatorImpl.NULL_CB
            goto L11b
        L11a:
            r1 = r7
        L11b:
            r0.callCombineData = r1
            return
        L11f:
            r0 = r5
            r1 = 100900(0x18a24, float:1.41391E-40)
            r0.callErrorOrErrorData(r1)
            return
    }

    private boolean addVertex(double[] r6, java.lang.Object r7) {
            r5 = this;
            r0 = r5
            org.lwjgl.util.glu.tessellation.GLUhalfEdge r0 = r0.lastEdge
            r8 = r0
            r0 = r8
            if (r0 != 0) goto L24
            r0 = r5
            org.lwjgl.util.glu.tessellation.GLUmesh r0 = r0.mesh
            org.lwjgl.util.glu.tessellation.GLUhalfEdge r0 = org.lwjgl.util.glu.tessellation.Mesh.__gl_meshMakeEdge(r0)
            r8 = r0
            r0 = r8
            if (r0 != 0) goto L17
            r0 = 0
            return r0
        L17:
            r0 = r8
            r1 = r8
            org.lwjgl.util.glu.tessellation.GLUhalfEdge r1 = r1.Sym
            boolean r0 = org.lwjgl.util.glu.tessellation.Mesh.__gl_meshSplice(r0, r1)
            if (r0 != 0) goto L32
            r0 = 0
            return r0
        L24:
            r0 = r8
            org.lwjgl.util.glu.tessellation.GLUhalfEdge r0 = org.lwjgl.util.glu.tessellation.Mesh.__gl_meshSplitEdge(r0)
            if (r0 != 0) goto L2d
            r0 = 0
            return r0
        L2d:
            r0 = r8
            org.lwjgl.util.glu.tessellation.GLUhalfEdge r0 = r0.Lnext
            r8 = r0
        L32:
            r0 = r8
            org.lwjgl.util.glu.tessellation.GLUvertex r0 = r0.Org
            r1 = r7
            r0.data = r1
            r0 = r8
            org.lwjgl.util.glu.tessellation.GLUvertex r0 = r0.Org
            double[] r0 = r0.coords
            r1 = 0
            r2 = r6
            r3 = 0
            r2 = r2[r3]
            r0[r1] = r2
            r0 = r8
            org.lwjgl.util.glu.tessellation.GLUvertex r0 = r0.Org
            double[] r0 = r0.coords
            r1 = 1
            r2 = r6
            r3 = 1
            r2 = r2[r3]
            r0[r1] = r2
            r0 = r8
            org.lwjgl.util.glu.tessellation.GLUvertex r0 = r0.Org
            double[] r0 = r0.coords
            r1 = 2
            r2 = r6
            r3 = 2
            r2 = r2[r3]
            r0[r1] = r2
            r0 = r8
            r1 = 1
            r0.winding = r1
            r0 = r8
            org.lwjgl.util.glu.tessellation.GLUhalfEdge r0 = r0.Sym
            r1 = -1
            r0.winding = r1
            r0 = r5
            r1 = r8
            r0.lastEdge = r1
            r0 = 1
            return r0
    }

    private void cacheVertex(double[] r6, java.lang.Object r7) {
            r5 = this;
            r0 = r5
            org.lwjgl.util.glu.tessellation.CachedVertex[] r0 = r0.cache
            r1 = r5
            int r1 = r1.cacheCount
            r0 = r0[r1]
            if (r0 != 0) goto L1c
            r0 = r5
            org.lwjgl.util.glu.tessellation.CachedVertex[] r0 = r0.cache
            r1 = r5
            int r1 = r1.cacheCount
            org.lwjgl.util.glu.tessellation.CachedVertex r2 = new org.lwjgl.util.glu.tessellation.CachedVertex
            r3 = r2
            r3.<init>()
            r0[r1] = r2
        L1c:
            r0 = r5
            org.lwjgl.util.glu.tessellation.CachedVertex[] r0 = r0.cache
            r1 = r5
            int r1 = r1.cacheCount
            r0 = r0[r1]
            r8 = r0
            r0 = r8
            r1 = r7
            r0.data = r1
            r0 = r8
            double[] r0 = r0.coords
            r1 = 0
            r2 = r6
            r3 = 0
            r2 = r2[r3]
            r0[r1] = r2
            r0 = r8
            double[] r0 = r0.coords
            r1 = 1
            r2 = r6
            r3 = 1
            r2 = r2[r3]
            r0[r1] = r2
            r0 = r8
            double[] r0 = r0.coords
            r1 = 2
            r2 = r6
            r3 = 2
            r2 = r2[r3]
            r0[r1] = r2
            r0 = r5
            r1 = r0
            int r1 = r1.cacheCount
            r2 = 1
            int r1 = r1 + r2
            r0.cacheCount = r1
            return
    }

    private boolean flushCache() {
            r4 = this;
            r0 = r4
            org.lwjgl.util.glu.tessellation.CachedVertex[] r0 = r0.cache
            r5 = r0
            r0 = r4
            org.lwjgl.util.glu.tessellation.GLUmesh r1 = org.lwjgl.util.glu.tessellation.Mesh.__gl_meshNewMesh()
            r0.mesh = r1
            r0 = r4
            org.lwjgl.util.glu.tessellation.GLUmesh r0 = r0.mesh
            if (r0 != 0) goto L15
            r0 = 0
            return r0
        L15:
            r0 = 0
            r6 = r0
        L17:
            r0 = r6
            r1 = r4
            int r1 = r1.cacheCount
            if (r0 >= r1) goto L3a
            r0 = r5
            r1 = r6
            r0 = r0[r1]
            r7 = r0
            r0 = r4
            r1 = r7
            double[] r1 = r1.coords
            r2 = r7
            java.lang.Object r2 = r2.data
            boolean r0 = r0.addVertex(r1, r2)
            if (r0 != 0) goto L34
            r0 = 0
            return r0
        L34:
            int r6 = r6 + 1
            goto L17
        L3a:
            r0 = r4
            r1 = 0
            r0.cacheCount = r1
            r0 = r4
            r1 = 0
            r0.flushCacheOnNextVertex = r1
            r0 = 1
            return r0
    }

    @Override // org.lwjgl.util.glu.GLUtessellator
    public void gluTessVertex(double[] r6, int r7, java.lang.Object r8) {
            r5 = this;
            r0 = 0
            r10 = r0
            r0 = 3
            double[] r0 = new double[r0]
            r13 = r0
            r0 = r5
            r1 = 2
            r0.requireState(r1)
            r0 = r5
            boolean r0 = r0.flushCacheOnNextVertex
            if (r0 == 0) goto L27
            r0 = r5
            boolean r0 = r0.flushCache()
            if (r0 != 0) goto L22
            r0 = r5
            r1 = 100902(0x18a26, float:1.41394E-40)
            r0.callErrorOrErrorData(r1)
            return
        L22:
            r0 = r5
            r1 = 0
            r0.lastEdge = r1
        L27:
            r0 = 0
            r9 = r0
        L2a:
            r0 = r9
            r1 = 3
            if (r0 >= r1) goto L67
            r0 = r6
            r1 = r9
            r2 = r7
            int r1 = r1 + r2
            r0 = r0[r1]
            r11 = r0
            r0 = r11
            r1 = -2372397319144302929(0xdf138d352e5096af, double:-1.0E150)
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 >= 0) goto L49
            r0 = -2372397319144302929(0xdf138d352e5096af, double:-1.0E150)
            r11 = r0
            r0 = 1
            r10 = r0
        L49:
            r0 = r11
            r1 = 6850974717710472879(0x5f138d352e5096af, double:1.0E150)
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 <= 0) goto L5a
            r0 = 6850974717710472879(0x5f138d352e5096af, double:1.0E150)
            r11 = r0
            r0 = 1
            r10 = r0
        L5a:
            r0 = r13
            r1 = r9
            r2 = r11
            r0[r1] = r2
            int r9 = r9 + 1
            goto L2a
        L67:
            r0 = r10
            if (r0 == 0) goto L72
            r0 = r5
            r1 = 100155(0x1873b, float:1.40347E-40)
            r0.callErrorOrErrorData(r1)
        L72:
            r0 = r5
            org.lwjgl.util.glu.tessellation.GLUmesh r0 = r0.mesh
            if (r0 != 0) goto L98
            r0 = r5
            int r0 = r0.cacheCount
            r1 = 100
            if (r0 >= r1) goto L8a
            r0 = r5
            r1 = r13
            r2 = r8
            r0.cacheVertex(r1, r2)
            return
        L8a:
            r0 = r5
            boolean r0 = r0.flushCache()
            if (r0 != 0) goto L98
            r0 = r5
            r1 = 100902(0x18a26, float:1.41394E-40)
            r0.callErrorOrErrorData(r1)
            return
        L98:
            r0 = r5
            r1 = r13
            r2 = r8
            boolean r0 = r0.addVertex(r1, r2)
            if (r0 != 0) goto La8
            r0 = r5
            r1 = 100902(0x18a26, float:1.41394E-40)
            r0.callErrorOrErrorData(r1)
        La8:
            return
    }

    @Override // org.lwjgl.util.glu.GLUtessellator
    public void gluTessBeginPolygon(java.lang.Object r4) {
            r3 = this;
            r0 = r3
            r1 = 0
            r0.requireState(r1)
            r0 = r3
            r1 = 1
            r0.state = r1
            r0 = r3
            r1 = 0
            r0.cacheCount = r1
            r0 = r3
            r1 = 0
            r0.flushCacheOnNextVertex = r1
            r0 = r3
            r1 = 0
            r0.mesh = r1
            r0 = r3
            r1 = r4
            r0.polygonData = r1
            return
    }

    @Override // org.lwjgl.util.glu.GLUtessellator
    public void gluTessBeginContour() {
            r3 = this;
            r0 = r3
            r1 = 1
            r0.requireState(r1)
            r0 = r3
            r1 = 2
            r0.state = r1
            r0 = r3
            r1 = 0
            r0.lastEdge = r1
            r0 = r3
            int r0 = r0.cacheCount
            if (r0 <= 0) goto L1b
            r0 = r3
            r1 = 1
            r0.flushCacheOnNextVertex = r1
        L1b:
            return
    }

    @Override // org.lwjgl.util.glu.GLUtessellator
    public void gluTessEndContour() {
            r3 = this;
            r0 = r3
            r1 = 2
            r0.requireState(r1)
            r0 = r3
            r1 = 1
            r0.state = r1
            return
    }

    @Override // org.lwjgl.util.glu.GLUtessellator
    public void gluTessEndPolygon() {
            r4 = this;
            r0 = r4
            r1 = 1
            r0.requireState(r1)     // Catch: java.lang.Exception -> Led
            r0 = r4
            r1 = 0
            r0.state = r1     // Catch: java.lang.Exception -> Led
            r0 = r4
            org.lwjgl.util.glu.tessellation.GLUmesh r0 = r0.mesh     // Catch: java.lang.Exception -> Led
            if (r0 != 0) goto L34
            r0 = r4
            boolean r0 = r0.flagBoundary     // Catch: java.lang.Exception -> Led
            if (r0 != 0) goto L25
            r0 = r4
            boolean r0 = org.lwjgl.util.glu.tessellation.Render.__gl_renderCache(r0)     // Catch: java.lang.Exception -> Led
            if (r0 == 0) goto L25
            r0 = r4
            r1 = 0
            r0.polygonData = r1     // Catch: java.lang.Exception -> Led
            return
        L25:
            r0 = r4
            boolean r0 = r0.flushCache()     // Catch: java.lang.Exception -> Led
            if (r0 != 0) goto L34
            java.lang.RuntimeException r0 = new java.lang.RuntimeException     // Catch: java.lang.Exception -> Led
            r1 = r0
            r1.<init>()     // Catch: java.lang.Exception -> Led
            throw r0     // Catch: java.lang.Exception -> Led
        L34:
            r0 = r4
            org.lwjgl.util.glu.tessellation.Normal.__gl_projectPolygon(r0)     // Catch: java.lang.Exception -> Led
            r0 = r4
            boolean r0 = org.lwjgl.util.glu.tessellation.Sweep.__gl_computeInterior(r0)     // Catch: java.lang.Exception -> Led
            if (r0 != 0) goto L47
            java.lang.RuntimeException r0 = new java.lang.RuntimeException     // Catch: java.lang.Exception -> Led
            r1 = r0
            r1.<init>()     // Catch: java.lang.Exception -> Led
            throw r0     // Catch: java.lang.Exception -> Led
        L47:
            r0 = r4
            org.lwjgl.util.glu.tessellation.GLUmesh r0 = r0.mesh     // Catch: java.lang.Exception -> Led
            r5 = r0
            r0 = r4
            boolean r0 = r0.fatalError     // Catch: java.lang.Exception -> Led
            if (r0 != 0) goto Ldf
            r0 = 1
            r6 = r0
            r0 = r4
            boolean r0 = r0.boundaryOnly     // Catch: java.lang.Exception -> Led
            if (r0 == 0) goto L66
            r0 = r5
            r1 = 1
            r2 = 1
            boolean r0 = org.lwjgl.util.glu.tessellation.TessMono.__gl_meshSetWindingNumber(r0, r1, r2)     // Catch: java.lang.Exception -> Led
            r6 = r0
            goto L6b
        L66:
            r0 = r5
            boolean r0 = org.lwjgl.util.glu.tessellation.TessMono.__gl_meshTessellateInterior(r0)     // Catch: java.lang.Exception -> Led
            r6 = r0
        L6b:
            r0 = r6
            if (r0 != 0) goto L77
            java.lang.RuntimeException r0 = new java.lang.RuntimeException     // Catch: java.lang.Exception -> Led
            r1 = r0
            r1.<init>()     // Catch: java.lang.Exception -> Led
            throw r0     // Catch: java.lang.Exception -> Led
        L77:
            r0 = r5
            org.lwjgl.util.glu.tessellation.Mesh.__gl_meshCheckMesh(r0)     // Catch: java.lang.Exception -> Led
            r0 = r4
            org.lwjgl.util.glu.GLUtessellatorCallback r0 = r0.callBegin     // Catch: java.lang.Exception -> Led
            org.lwjgl.util.glu.GLUtessellatorCallback r1 = org.lwjgl.util.glu.tessellation.GLUtessellatorImpl.NULL_CB     // Catch: java.lang.Exception -> Led
            if (r0 != r1) goto Lcb
            r0 = r4
            org.lwjgl.util.glu.GLUtessellatorCallback r0 = r0.callEnd     // Catch: java.lang.Exception -> Led
            org.lwjgl.util.glu.GLUtessellatorCallback r1 = org.lwjgl.util.glu.tessellation.GLUtessellatorImpl.NULL_CB     // Catch: java.lang.Exception -> Led
            if (r0 != r1) goto Lcb
            r0 = r4
            org.lwjgl.util.glu.GLUtessellatorCallback r0 = r0.callVertex     // Catch: java.lang.Exception -> Led
            org.lwjgl.util.glu.GLUtessellatorCallback r1 = org.lwjgl.util.glu.tessellation.GLUtessellatorImpl.NULL_CB     // Catch: java.lang.Exception -> Led
            if (r0 != r1) goto Lcb
            r0 = r4
            org.lwjgl.util.glu.GLUtessellatorCallback r0 = r0.callEdgeFlag     // Catch: java.lang.Exception -> Led
            org.lwjgl.util.glu.GLUtessellatorCallback r1 = org.lwjgl.util.glu.tessellation.GLUtessellatorImpl.NULL_CB     // Catch: java.lang.Exception -> Led
            if (r0 != r1) goto Lcb
            r0 = r4
            org.lwjgl.util.glu.GLUtessellatorCallback r0 = r0.callBeginData     // Catch: java.lang.Exception -> Led
            org.lwjgl.util.glu.GLUtessellatorCallback r1 = org.lwjgl.util.glu.tessellation.GLUtessellatorImpl.NULL_CB     // Catch: java.lang.Exception -> Led
            if (r0 != r1) goto Lcb
            r0 = r4
            org.lwjgl.util.glu.GLUtessellatorCallback r0 = r0.callEndData     // Catch: java.lang.Exception -> Led
            org.lwjgl.util.glu.GLUtessellatorCallback r1 = org.lwjgl.util.glu.tessellation.GLUtessellatorImpl.NULL_CB     // Catch: java.lang.Exception -> Led
            if (r0 != r1) goto Lcb
            r0 = r4
            org.lwjgl.util.glu.GLUtessellatorCallback r0 = r0.callVertexData     // Catch: java.lang.Exception -> Led
            org.lwjgl.util.glu.GLUtessellatorCallback r1 = org.lwjgl.util.glu.tessellation.GLUtessellatorImpl.NULL_CB     // Catch: java.lang.Exception -> Led
            if (r0 != r1) goto Lcb
            r0 = r4
            org.lwjgl.util.glu.GLUtessellatorCallback r0 = r0.callEdgeFlagData     // Catch: java.lang.Exception -> Led
            org.lwjgl.util.glu.GLUtessellatorCallback r1 = org.lwjgl.util.glu.tessellation.GLUtessellatorImpl.NULL_CB     // Catch: java.lang.Exception -> Led
            if (r0 == r1) goto Ldf
        Lcb:
            r0 = r4
            boolean r0 = r0.boundaryOnly     // Catch: java.lang.Exception -> Led
            if (r0 == 0) goto Lda
            r0 = r4
            r1 = r5
            org.lwjgl.util.glu.tessellation.Render.__gl_renderBoundary(r0, r1)     // Catch: java.lang.Exception -> Led
            goto Ldf
        Lda:
            r0 = r4
            r1 = r5
            org.lwjgl.util.glu.tessellation.Render.__gl_renderMesh(r0, r1)     // Catch: java.lang.Exception -> Led
        Ldf:
            r0 = r5
            org.lwjgl.util.glu.tessellation.Mesh.__gl_meshDeleteMesh(r0)     // Catch: java.lang.Exception -> Led
            r0 = r4
            r1 = 0
            r0.polygonData = r1     // Catch: java.lang.Exception -> Led
            r0 = 0
            r5 = r0
            goto Lf8
        Led:
            r6 = move-exception
            r0 = r6
            r0.printStackTrace()
            r0 = r4
            r1 = 100902(0x18a26, float:1.41394E-40)
            r0.callErrorOrErrorData(r1)
        Lf8:
            return
    }

    @Override // org.lwjgl.util.glu.GLUtessellator
    public void gluBeginPolygon() {
            r3 = this;
            r0 = r3
            r1 = 0
            r0.gluTessBeginPolygon(r1)
            r0 = r3
            r0.gluTessBeginContour()
            return
    }

    @Override // org.lwjgl.util.glu.GLUtessellator
    public void gluNextContour(int r3) {
            r2 = this;
            r0 = r2
            r0.gluTessEndContour()
            r0 = r2
            r0.gluTessBeginContour()
            return
    }

    @Override // org.lwjgl.util.glu.GLUtessellator
    public void gluEndPolygon() {
            r2 = this;
            r0 = r2
            r0.gluTessEndContour()
            r0 = r2
            r0.gluTessEndPolygon()
            return
    }

    void callBeginOrBeginData(int r5) {
            r4 = this;
            r0 = r4
            org.lwjgl.util.glu.GLUtessellatorCallback r0 = r0.callBeginData
            org.lwjgl.util.glu.GLUtessellatorCallback r1 = org.lwjgl.util.glu.tessellation.GLUtessellatorImpl.NULL_CB
            if (r0 == r1) goto L1b
            r0 = r4
            org.lwjgl.util.glu.GLUtessellatorCallback r0 = r0.callBeginData
            r1 = r5
            r2 = r4
            java.lang.Object r2 = r2.polygonData
            r0.beginData(r1, r2)
            goto L25
        L1b:
            r0 = r4
            org.lwjgl.util.glu.GLUtessellatorCallback r0 = r0.callBegin
            r1 = r5
            r0.begin(r1)
        L25:
            return
    }

    void callVertexOrVertexData(java.lang.Object r5) {
            r4 = this;
            r0 = r4
            org.lwjgl.util.glu.GLUtessellatorCallback r0 = r0.callVertexData
            org.lwjgl.util.glu.GLUtessellatorCallback r1 = org.lwjgl.util.glu.tessellation.GLUtessellatorImpl.NULL_CB
            if (r0 == r1) goto L1b
            r0 = r4
            org.lwjgl.util.glu.GLUtessellatorCallback r0 = r0.callVertexData
            r1 = r5
            r2 = r4
            java.lang.Object r2 = r2.polygonData
            r0.vertexData(r1, r2)
            goto L25
        L1b:
            r0 = r4
            org.lwjgl.util.glu.GLUtessellatorCallback r0 = r0.callVertex
            r1 = r5
            r0.vertex(r1)
        L25:
            return
    }

    void callEdgeFlagOrEdgeFlagData(boolean r5) {
            r4 = this;
            r0 = r4
            org.lwjgl.util.glu.GLUtessellatorCallback r0 = r0.callEdgeFlagData
            org.lwjgl.util.glu.GLUtessellatorCallback r1 = org.lwjgl.util.glu.tessellation.GLUtessellatorImpl.NULL_CB
            if (r0 == r1) goto L1b
            r0 = r4
            org.lwjgl.util.glu.GLUtessellatorCallback r0 = r0.callEdgeFlagData
            r1 = r5
            r2 = r4
            java.lang.Object r2 = r2.polygonData
            r0.edgeFlagData(r1, r2)
            goto L25
        L1b:
            r0 = r4
            org.lwjgl.util.glu.GLUtessellatorCallback r0 = r0.callEdgeFlag
            r1 = r5
            r0.edgeFlag(r1)
        L25:
            return
    }

    void callEndOrEndData() {
            r3 = this;
            r0 = r3
            org.lwjgl.util.glu.GLUtessellatorCallback r0 = r0.callEndData
            org.lwjgl.util.glu.GLUtessellatorCallback r1 = org.lwjgl.util.glu.tessellation.GLUtessellatorImpl.NULL_CB
            if (r0 == r1) goto L1a
            r0 = r3
            org.lwjgl.util.glu.GLUtessellatorCallback r0 = r0.callEndData
            r1 = r3
            java.lang.Object r1 = r1.polygonData
            r0.endData(r1)
            goto L23
        L1a:
            r0 = r3
            org.lwjgl.util.glu.GLUtessellatorCallback r0 = r0.callEnd
            r0.end()
        L23:
            return
    }

    void callCombineOrCombineData(double[] r8, java.lang.Object[] r9, float[] r10, java.lang.Object[] r11) {
            r7 = this;
            r0 = r7
            org.lwjgl.util.glu.GLUtessellatorCallback r0 = r0.callCombineData
            org.lwjgl.util.glu.GLUtessellatorCallback r1 = org.lwjgl.util.glu.tessellation.GLUtessellatorImpl.NULL_CB
            if (r0 == r1) goto L1f
            r0 = r7
            org.lwjgl.util.glu.GLUtessellatorCallback r0 = r0.callCombineData
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            r5 = r7
            java.lang.Object r5 = r5.polygonData
            r0.combineData(r1, r2, r3, r4, r5)
            goto L2d
        L1f:
            r0 = r7
            org.lwjgl.util.glu.GLUtessellatorCallback r0 = r0.callCombine
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            r0.combine(r1, r2, r3, r4)
        L2d:
            return
    }

    void callErrorOrErrorData(int r5) {
            r4 = this;
            r0 = r4
            org.lwjgl.util.glu.GLUtessellatorCallback r0 = r0.callErrorData
            org.lwjgl.util.glu.GLUtessellatorCallback r1 = org.lwjgl.util.glu.tessellation.GLUtessellatorImpl.NULL_CB
            if (r0 == r1) goto L1b
            r0 = r4
            org.lwjgl.util.glu.GLUtessellatorCallback r0 = r0.callErrorData
            r1 = r5
            r2 = r4
            java.lang.Object r2 = r2.polygonData
            r0.errorData(r1, r2)
            goto L25
        L1b:
            r0 = r4
            org.lwjgl.util.glu.GLUtessellatorCallback r0 = r0.callError
            r1 = r5
            r0.error(r1)
        L25:
            return
    }

    static {
            java.lang.Class<org.lwjgl.util.glu.tessellation.GLUtessellatorImpl> r0 = org.lwjgl.util.glu.tessellation.GLUtessellatorImpl.class
            boolean r0 = r0.desiredAssertionStatus()
            if (r0 != 0) goto Lc
            r0 = 1
            goto Ld
        Lc:
            r0 = 0
        Ld:
            org.lwjgl.util.glu.tessellation.GLUtessellatorImpl.$assertionsDisabled = r0
            org.lwjgl.util.glu.GLUtessellatorCallbackAdapter r0 = new org.lwjgl.util.glu.GLUtessellatorCallbackAdapter
            r1 = r0
            r1.<init>()
            org.lwjgl.util.glu.tessellation.GLUtessellatorImpl.NULL_CB = r0
            return
    }
}
