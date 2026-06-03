package org.lwjgl.util.glu.tessellation;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/util/glu/tessellation/Render.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/util/glu/tessellation/Render.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/util/glu/tessellation/Render.class */
class Render {
    private static final boolean USE_OPTIMIZED_CODE_PATH = false;
    private static final org.lwjgl.util.glu.tessellation.Render.RenderFan renderFan = null;
    private static final org.lwjgl.util.glu.tessellation.Render.RenderStrip renderStrip = null;
    private static final org.lwjgl.util.glu.tessellation.Render.RenderTriangle renderTriangle = null;
    private static final int SIGN_INCONSISTENT = 2;
    static final /* synthetic */ boolean $assertionsDisabled = false;

    /* JADX WARN: Classes with same name are omitted, all sources:
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/util/glu/tessellation/Render$1.class
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/util/glu/tessellation/Render$1.class
     */
    /* JADX INFO: renamed from: org.lwjgl.util.glu.tessellation.Render$1, reason: invalid class name */
    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/util/glu/tessellation/Render$1.class */
    static /* synthetic */ class AnonymousClass1 {
    }

    /* JADX WARN: Classes with same name are omitted, all sources:
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/util/glu/tessellation/Render$FaceCount.class
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/util/glu/tessellation/Render$FaceCount.class
     */
    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/util/glu/tessellation/Render$FaceCount.class */
    private static class FaceCount {
        long size;
        org.lwjgl.util.glu.tessellation.GLUhalfEdge eStart;
        org.lwjgl.util.glu.tessellation.Render.renderCallBack render;

        private FaceCount() {
                r2 = this;
                r0 = r2
                r0.<init>()
                return
        }

        private FaceCount(long r5, org.lwjgl.util.glu.tessellation.GLUhalfEdge r7, org.lwjgl.util.glu.tessellation.Render.renderCallBack r8) {
                r4 = this;
                r0 = r4
                r0.<init>()
                r0 = r4
                r1 = r5
                r0.size = r1
                r0 = r4
                r1 = r7
                r0.eStart = r1
                r0 = r4
                r1 = r8
                r0.render = r1
                return
        }

        /* synthetic */ FaceCount(org.lwjgl.util.glu.tessellation.Render.AnonymousClass1 r3) {
                r2 = this;
                r0 = r2
                r0.<init>()
                return
        }

        /* synthetic */ FaceCount(long r7, org.lwjgl.util.glu.tessellation.GLUhalfEdge r9, org.lwjgl.util.glu.tessellation.Render.renderCallBack r10, org.lwjgl.util.glu.tessellation.Render.AnonymousClass1 r11) {
                r6 = this;
                r0 = r6
                r1 = r7
                r2 = r9
                r3 = r10
                r0.<init>(r1, r2, r3)
                return
        }
    }

    /* JADX WARN: Classes with same name are omitted, all sources:
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/util/glu/tessellation/Render$RenderFan.class
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/util/glu/tessellation/Render$RenderFan.class
     */
    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/util/glu/tessellation/Render$RenderFan.class */
    private static class RenderFan implements org.lwjgl.util.glu.tessellation.Render.renderCallBack {
        static final /* synthetic */ boolean $assertionsDisabled = false;

        private RenderFan() {
                r2 = this;
                r0 = r2
                r0.<init>()
                return
        }

        @Override // org.lwjgl.util.glu.tessellation.Render.renderCallBack
        public void render(org.lwjgl.util.glu.tessellation.GLUtessellatorImpl r6, org.lwjgl.util.glu.tessellation.GLUhalfEdge r7, long r8) {
                r5 = this;
                r0 = r6
                r1 = 6
                r0.callBeginOrBeginData(r1)
                r0 = r6
                r1 = r7
                org.lwjgl.util.glu.tessellation.GLUvertex r1 = r1.Org
                java.lang.Object r1 = r1.data
                r0.callVertexOrVertexData(r1)
                r0 = r6
                r1 = r7
                org.lwjgl.util.glu.tessellation.GLUhalfEdge r1 = r1.Sym
                org.lwjgl.util.glu.tessellation.GLUvertex r1 = r1.Org
                java.lang.Object r1 = r1.data
                r0.callVertexOrVertexData(r1)
            L1f:
                r0 = r7
                org.lwjgl.util.glu.tessellation.GLUface r0 = r0.Lface
                boolean r0 = org.lwjgl.util.glu.tessellation.Render.access$600(r0)
                if (r0 != 0) goto L4b
                r0 = r7
                org.lwjgl.util.glu.tessellation.GLUface r0 = r0.Lface
                r1 = 1
                r0.marked = r1
                r0 = r8
                r1 = 1
                long r0 = r0 - r1
                r8 = r0
                r0 = r7
                org.lwjgl.util.glu.tessellation.GLUhalfEdge r0 = r0.Onext
                r7 = r0
                r0 = r6
                r1 = r7
                org.lwjgl.util.glu.tessellation.GLUhalfEdge r1 = r1.Sym
                org.lwjgl.util.glu.tessellation.GLUvertex r1 = r1.Org
                java.lang.Object r1 = r1.data
                r0.callVertexOrVertexData(r1)
                goto L1f
            L4b:
                boolean r0 = org.lwjgl.util.glu.tessellation.Render.RenderFan.$assertionsDisabled
                if (r0 != 0) goto L5f
                r0 = r8
                r1 = 0
                int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
                if (r0 == 0) goto L5f
                java.lang.AssertionError r0 = new java.lang.AssertionError
                r1 = r0
                r1.<init>()
                throw r0
            L5f:
                r0 = r6
                r0.callEndOrEndData()
                return
        }

        /* synthetic */ RenderFan(org.lwjgl.util.glu.tessellation.Render.AnonymousClass1 r3) {
                r2 = this;
                r0 = r2
                r0.<init>()
                return
        }

        static {
                java.lang.Class<org.lwjgl.util.glu.tessellation.Render> r0 = org.lwjgl.util.glu.tessellation.Render.class
                boolean r0 = r0.desiredAssertionStatus()
                if (r0 != 0) goto Lc
                r0 = 1
                goto Ld
            Lc:
                r0 = 0
            Ld:
                org.lwjgl.util.glu.tessellation.Render.RenderFan.$assertionsDisabled = r0
                return
        }
    }

    /* JADX WARN: Classes with same name are omitted, all sources:
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/util/glu/tessellation/Render$RenderStrip.class
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/util/glu/tessellation/Render$RenderStrip.class
     */
    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/util/glu/tessellation/Render$RenderStrip.class */
    private static class RenderStrip implements org.lwjgl.util.glu.tessellation.Render.renderCallBack {
        static final /* synthetic */ boolean $assertionsDisabled = false;

        private RenderStrip() {
                r2 = this;
                r0 = r2
                r0.<init>()
                return
        }

        @Override // org.lwjgl.util.glu.tessellation.Render.renderCallBack
        public void render(org.lwjgl.util.glu.tessellation.GLUtessellatorImpl r6, org.lwjgl.util.glu.tessellation.GLUhalfEdge r7, long r8) {
                r5 = this;
                r0 = r6
                r1 = 5
                r0.callBeginOrBeginData(r1)
                r0 = r6
                r1 = r7
                org.lwjgl.util.glu.tessellation.GLUvertex r1 = r1.Org
                java.lang.Object r1 = r1.data
                r0.callVertexOrVertexData(r1)
                r0 = r6
                r1 = r7
                org.lwjgl.util.glu.tessellation.GLUhalfEdge r1 = r1.Sym
                org.lwjgl.util.glu.tessellation.GLUvertex r1 = r1.Org
                java.lang.Object r1 = r1.data
                r0.callVertexOrVertexData(r1)
            L1e:
                r0 = r7
                org.lwjgl.util.glu.tessellation.GLUface r0 = r0.Lface
                boolean r0 = org.lwjgl.util.glu.tessellation.Render.access$600(r0)
                if (r0 != 0) goto L76
                r0 = r7
                org.lwjgl.util.glu.tessellation.GLUface r0 = r0.Lface
                r1 = 1
                r0.marked = r1
                r0 = r8
                r1 = 1
                long r0 = r0 - r1
                r8 = r0
                r0 = r7
                org.lwjgl.util.glu.tessellation.GLUhalfEdge r0 = r0.Lnext
                org.lwjgl.util.glu.tessellation.GLUhalfEdge r0 = r0.Sym
                r7 = r0
                r0 = r6
                r1 = r7
                org.lwjgl.util.glu.tessellation.GLUvertex r1 = r1.Org
                java.lang.Object r1 = r1.data
                r0.callVertexOrVertexData(r1)
                r0 = r7
                org.lwjgl.util.glu.tessellation.GLUface r0 = r0.Lface
                boolean r0 = org.lwjgl.util.glu.tessellation.Render.access$600(r0)
                if (r0 == 0) goto L54
                goto L76
            L54:
                r0 = r7
                org.lwjgl.util.glu.tessellation.GLUface r0 = r0.Lface
                r1 = 1
                r0.marked = r1
                r0 = r8
                r1 = 1
                long r0 = r0 - r1
                r8 = r0
                r0 = r7
                org.lwjgl.util.glu.tessellation.GLUhalfEdge r0 = r0.Onext
                r7 = r0
                r0 = r6
                r1 = r7
                org.lwjgl.util.glu.tessellation.GLUhalfEdge r1 = r1.Sym
                org.lwjgl.util.glu.tessellation.GLUvertex r1 = r1.Org
                java.lang.Object r1 = r1.data
                r0.callVertexOrVertexData(r1)
                goto L1e
            L76:
                boolean r0 = org.lwjgl.util.glu.tessellation.Render.RenderStrip.$assertionsDisabled
                if (r0 != 0) goto L8a
                r0 = r8
                r1 = 0
                int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
                if (r0 == 0) goto L8a
                java.lang.AssertionError r0 = new java.lang.AssertionError
                r1 = r0
                r1.<init>()
                throw r0
            L8a:
                r0 = r6
                r0.callEndOrEndData()
                return
        }

        /* synthetic */ RenderStrip(org.lwjgl.util.glu.tessellation.Render.AnonymousClass1 r3) {
                r2 = this;
                r0 = r2
                r0.<init>()
                return
        }

        static {
                java.lang.Class<org.lwjgl.util.glu.tessellation.Render> r0 = org.lwjgl.util.glu.tessellation.Render.class
                boolean r0 = r0.desiredAssertionStatus()
                if (r0 != 0) goto Lc
                r0 = 1
                goto Ld
            Lc:
                r0 = 0
            Ld:
                org.lwjgl.util.glu.tessellation.Render.RenderStrip.$assertionsDisabled = r0
                return
        }
    }

    /* JADX WARN: Classes with same name are omitted, all sources:
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/util/glu/tessellation/Render$RenderTriangle.class
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/util/glu/tessellation/Render$RenderTriangle.class
     */
    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/util/glu/tessellation/Render$RenderTriangle.class */
    private static class RenderTriangle implements org.lwjgl.util.glu.tessellation.Render.renderCallBack {
        static final /* synthetic */ boolean $assertionsDisabled = false;

        private RenderTriangle() {
                r2 = this;
                r0 = r2
                r0.<init>()
                return
        }

        @Override // org.lwjgl.util.glu.tessellation.Render.renderCallBack
        public void render(org.lwjgl.util.glu.tessellation.GLUtessellatorImpl r6, org.lwjgl.util.glu.tessellation.GLUhalfEdge r7, long r8) {
                r5 = this;
                boolean r0 = org.lwjgl.util.glu.tessellation.Render.RenderTriangle.$assertionsDisabled
                if (r0 != 0) goto L14
                r0 = r8
                r1 = 1
                int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
                if (r0 == 0) goto L14
                java.lang.AssertionError r0 = new java.lang.AssertionError
                r1 = r0
                r1.<init>()
                throw r0
            L14:
                r0 = r6
                r1 = r7
                org.lwjgl.util.glu.tessellation.GLUface r1 = r1.Lface
                r2 = r6
                org.lwjgl.util.glu.tessellation.GLUface r2 = r2.lonelyTriList
                org.lwjgl.util.glu.tessellation.GLUface r1 = org.lwjgl.util.glu.tessellation.Render.access$500(r1, r2)
                r0.lonelyTriList = r1
                return
        }

        /* synthetic */ RenderTriangle(org.lwjgl.util.glu.tessellation.Render.AnonymousClass1 r3) {
                r2 = this;
                r0 = r2
                r0.<init>()
                return
        }

        static {
                java.lang.Class<org.lwjgl.util.glu.tessellation.Render> r0 = org.lwjgl.util.glu.tessellation.Render.class
                boolean r0 = r0.desiredAssertionStatus()
                if (r0 != 0) goto Lc
                r0 = 1
                goto Ld
            Lc:
                r0 = 0
            Ld:
                org.lwjgl.util.glu.tessellation.Render.RenderTriangle.$assertionsDisabled = r0
                return
        }
    }

    /* JADX WARN: Classes with same name are omitted, all sources:
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/util/glu/tessellation/Render$renderCallBack.class
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/util/glu/tessellation/Render$renderCallBack.class
     */
    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/util/glu/tessellation/Render$renderCallBack.class */
    private interface renderCallBack {
        void render(org.lwjgl.util.glu.tessellation.GLUtessellatorImpl r1, org.lwjgl.util.glu.tessellation.GLUhalfEdge r2, long r3);
    }

    private Render() {
            r2 = this;
            r0 = r2
            r0.<init>()
            return
    }

    public static void __gl_renderMesh(org.lwjgl.util.glu.tessellation.GLUtessellatorImpl r3, org.lwjgl.util.glu.tessellation.GLUmesh r4) {
            r0 = r3
            r1 = 0
            r0.lonelyTriList = r1
            r0 = r4
            org.lwjgl.util.glu.tessellation.GLUface r0 = r0.fHead
            org.lwjgl.util.glu.tessellation.GLUface r0 = r0.next
            r5 = r0
        Ld:
            r0 = r5
            r1 = r4
            org.lwjgl.util.glu.tessellation.GLUface r1 = r1.fHead
            if (r0 == r1) goto L22
            r0 = r5
            r1 = 0
            r0.marked = r1
            r0 = r5
            org.lwjgl.util.glu.tessellation.GLUface r0 = r0.next
            r5 = r0
            goto Ld
        L22:
            r0 = r4
            org.lwjgl.util.glu.tessellation.GLUface r0 = r0.fHead
            org.lwjgl.util.glu.tessellation.GLUface r0 = r0.next
            r5 = r0
        L2a:
            r0 = r5
            r1 = r4
            org.lwjgl.util.glu.tessellation.GLUface r1 = r1.fHead
            if (r0 == r1) goto L62
            r0 = r5
            boolean r0 = r0.inside
            if (r0 == 0) goto L5a
            r0 = r5
            boolean r0 = r0.marked
            if (r0 != 0) goto L5a
            r0 = r3
            r1 = r5
            RenderMaximumFaceGroup(r0, r1)
            boolean r0 = org.lwjgl.util.glu.tessellation.Render.$assertionsDisabled
            if (r0 != 0) goto L5a
            r0 = r5
            boolean r0 = r0.marked
            if (r0 != 0) goto L5a
            java.lang.AssertionError r0 = new java.lang.AssertionError
            r1 = r0
            r1.<init>()
            throw r0
        L5a:
            r0 = r5
            org.lwjgl.util.glu.tessellation.GLUface r0 = r0.next
            r5 = r0
            goto L2a
        L62:
            r0 = r3
            org.lwjgl.util.glu.tessellation.GLUface r0 = r0.lonelyTriList
            if (r0 == 0) goto L76
            r0 = r3
            r1 = r3
            org.lwjgl.util.glu.tessellation.GLUface r1 = r1.lonelyTriList
            RenderLonelyTriangles(r0, r1)
            r0 = r3
            r1 = 0
            r0.lonelyTriList = r1
        L76:
            return
    }

    static void RenderMaximumFaceGroup(org.lwjgl.util.glu.tessellation.GLUtessellatorImpl r6, org.lwjgl.util.glu.tessellation.GLUface r7) {
            r0 = r7
            org.lwjgl.util.glu.tessellation.GLUhalfEdge r0 = r0.anEdge
            r8 = r0
            org.lwjgl.util.glu.tessellation.Render$FaceCount r0 = new org.lwjgl.util.glu.tessellation.Render$FaceCount
            r1 = r0
            r2 = 0
            r1.<init>(r2)
            r9 = r0
            r0 = r9
            r1 = 1
            r0.size = r1
            r0 = r9
            r1 = r8
            r0.eStart = r1
            r0 = r9
            org.lwjgl.util.glu.tessellation.Render$RenderTriangle r1 = org.lwjgl.util.glu.tessellation.Render.renderTriangle
            r0.render = r1
            r0 = r6
            boolean r0 = r0.flagBoundary
            if (r0 != 0) goto Lbc
            r0 = r8
            org.lwjgl.util.glu.tessellation.Render$FaceCount r0 = MaximumFan(r0)
            r10 = r0
            r0 = r10
            long r0 = r0.size
            r1 = r9
            long r1 = r1.size
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 <= 0) goto L3c
            r0 = r10
            r9 = r0
        L3c:
            r0 = r8
            org.lwjgl.util.glu.tessellation.GLUhalfEdge r0 = r0.Lnext
            org.lwjgl.util.glu.tessellation.Render$FaceCount r0 = MaximumFan(r0)
            r10 = r0
            r0 = r10
            long r0 = r0.size
            r1 = r9
            long r1 = r1.size
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 <= 0) goto L55
            r0 = r10
            r9 = r0
        L55:
            r0 = r8
            org.lwjgl.util.glu.tessellation.GLUhalfEdge r0 = r0.Onext
            org.lwjgl.util.glu.tessellation.GLUhalfEdge r0 = r0.Sym
            org.lwjgl.util.glu.tessellation.Render$FaceCount r0 = MaximumFan(r0)
            r10 = r0
            r0 = r10
            long r0 = r0.size
            r1 = r9
            long r1 = r1.size
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 <= 0) goto L71
            r0 = r10
            r9 = r0
        L71:
            r0 = r8
            org.lwjgl.util.glu.tessellation.Render$FaceCount r0 = MaximumStrip(r0)
            r10 = r0
            r0 = r10
            long r0 = r0.size
            r1 = r9
            long r1 = r1.size
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 <= 0) goto L87
            r0 = r10
            r9 = r0
        L87:
            r0 = r8
            org.lwjgl.util.glu.tessellation.GLUhalfEdge r0 = r0.Lnext
            org.lwjgl.util.glu.tessellation.Render$FaceCount r0 = MaximumStrip(r0)
            r10 = r0
            r0 = r10
            long r0 = r0.size
            r1 = r9
            long r1 = r1.size
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 <= 0) goto La0
            r0 = r10
            r9 = r0
        La0:
            r0 = r8
            org.lwjgl.util.glu.tessellation.GLUhalfEdge r0 = r0.Onext
            org.lwjgl.util.glu.tessellation.GLUhalfEdge r0 = r0.Sym
            org.lwjgl.util.glu.tessellation.Render$FaceCount r0 = MaximumStrip(r0)
            r10 = r0
            r0 = r10
            long r0 = r0.size
            r1 = r9
            long r1 = r1.size
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 <= 0) goto Lbc
            r0 = r10
            r9 = r0
        Lbc:
            r0 = r9
            org.lwjgl.util.glu.tessellation.Render$renderCallBack r0 = r0.render
            r1 = r6
            r2 = r9
            org.lwjgl.util.glu.tessellation.GLUhalfEdge r2 = r2.eStart
            r3 = r9
            long r3 = r3.size
            r0.render(r1, r2, r3)
            return
    }

    private static boolean Marked(org.lwjgl.util.glu.tessellation.GLUface r2) {
            r0 = r2
            boolean r0 = r0.inside
            if (r0 == 0) goto Le
            r0 = r2
            boolean r0 = r0.marked
            if (r0 == 0) goto L12
        Le:
            r0 = 1
            goto L13
        L12:
            r0 = 0
        L13:
            return r0
    }

    private static org.lwjgl.util.glu.tessellation.GLUface AddToTrail(org.lwjgl.util.glu.tessellation.GLUface r3, org.lwjgl.util.glu.tessellation.GLUface r4) {
            r0 = r3
            r1 = r4
            r0.trail = r1
            r0 = r3
            r1 = 1
            r0.marked = r1
            r0 = r3
            return r0
    }

    private static void FreeTrail(org.lwjgl.util.glu.tessellation.GLUface r3) {
        L0:
            r0 = r3
            if (r0 == 0) goto L11
            r0 = r3
            r1 = 0
            r0.marked = r1
            r0 = r3
            org.lwjgl.util.glu.tessellation.GLUface r0 = r0.trail
            r3 = r0
            goto L0
        L11:
            return
    }

    static org.lwjgl.util.glu.tessellation.Render.FaceCount MaximumFan(org.lwjgl.util.glu.tessellation.GLUhalfEdge r8) {
            org.lwjgl.util.glu.tessellation.Render$FaceCount r0 = new org.lwjgl.util.glu.tessellation.Render$FaceCount
            r1 = r0
            r2 = 0
            r3 = 0
            org.lwjgl.util.glu.tessellation.Render$RenderFan r4 = org.lwjgl.util.glu.tessellation.Render.renderFan
            r5 = 0
            r1.<init>(r2, r3, r4, r5)
            r9 = r0
            r0 = 0
            r10 = r0
            r0 = r8
            r11 = r0
        L12:
            r0 = r11
            org.lwjgl.util.glu.tessellation.GLUface r0 = r0.Lface
            boolean r0 = Marked(r0)
            if (r0 != 0) goto L37
            r0 = r11
            org.lwjgl.util.glu.tessellation.GLUface r0 = r0.Lface
            r1 = r10
            org.lwjgl.util.glu.tessellation.GLUface r0 = AddToTrail(r0, r1)
            r10 = r0
            r0 = r9
            r1 = r0
            long r1 = r1.size
            r2 = 1
            long r1 = r1 + r2
            r0.size = r1
            r0 = r11
            org.lwjgl.util.glu.tessellation.GLUhalfEdge r0 = r0.Onext
            r11 = r0
            goto L12
        L37:
            r0 = r8
            r11 = r0
        L39:
            r0 = r11
            org.lwjgl.util.glu.tessellation.GLUhalfEdge r0 = r0.Sym
            org.lwjgl.util.glu.tessellation.GLUface r0 = r0.Lface
            boolean r0 = Marked(r0)
            if (r0 != 0) goto L67
            r0 = r11
            org.lwjgl.util.glu.tessellation.GLUhalfEdge r0 = r0.Sym
            org.lwjgl.util.glu.tessellation.GLUface r0 = r0.Lface
            r1 = r10
            org.lwjgl.util.glu.tessellation.GLUface r0 = AddToTrail(r0, r1)
            r10 = r0
            r0 = r9
            r1 = r0
            long r1 = r1.size
            r2 = 1
            long r1 = r1 + r2
            r0.size = r1
            r0 = r11
            org.lwjgl.util.glu.tessellation.GLUhalfEdge r0 = r0.Sym
            org.lwjgl.util.glu.tessellation.GLUhalfEdge r0 = r0.Lnext
            r11 = r0
            goto L39
        L67:
            r0 = r9
            r1 = r11
            r0.eStart = r1
            r0 = r10
            FreeTrail(r0)
            r0 = r9
            return r0
    }

    private static boolean IsEven(long r5) {
            r0 = r5
            r1 = 1
            long r0 = r0 & r1
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto Lc
            r0 = 1
            goto Ld
        Lc:
            r0 = 0
        Ld:
            return r0
    }

    static org.lwjgl.util.glu.tessellation.Render.FaceCount MaximumStrip(org.lwjgl.util.glu.tessellation.GLUhalfEdge r8) {
            org.lwjgl.util.glu.tessellation.Render$FaceCount r0 = new org.lwjgl.util.glu.tessellation.Render$FaceCount
            r1 = r0
            r2 = 0
            r3 = 0
            org.lwjgl.util.glu.tessellation.Render$RenderStrip r4 = org.lwjgl.util.glu.tessellation.Render.renderStrip
            r5 = 0
            r1.<init>(r2, r3, r4, r5)
            r9 = r0
            r0 = 0
            r10 = r0
            r0 = 0
            r12 = r0
            r0 = 0
            r14 = r0
            r0 = r8
            r15 = r0
        L19:
            r0 = r15
            org.lwjgl.util.glu.tessellation.GLUface r0 = r0.Lface
            boolean r0 = Marked(r0)
            if (r0 != 0) goto L6a
            r0 = r15
            org.lwjgl.util.glu.tessellation.GLUface r0 = r0.Lface
            r1 = r14
            org.lwjgl.util.glu.tessellation.GLUface r0 = AddToTrail(r0, r1)
            r14 = r0
            r0 = r12
            r1 = 1
            long r0 = r0 + r1
            r12 = r0
            r0 = r15
            org.lwjgl.util.glu.tessellation.GLUhalfEdge r0 = r0.Lnext
            org.lwjgl.util.glu.tessellation.GLUhalfEdge r0 = r0.Sym
            r15 = r0
            r0 = r15
            org.lwjgl.util.glu.tessellation.GLUface r0 = r0.Lface
            boolean r0 = Marked(r0)
            if (r0 == 0) goto L4e
            goto L6a
        L4e:
            r0 = r15
            org.lwjgl.util.glu.tessellation.GLUface r0 = r0.Lface
            r1 = r14
            org.lwjgl.util.glu.tessellation.GLUface r0 = AddToTrail(r0, r1)
            r14 = r0
            r0 = r12
            r1 = 1
            long r0 = r0 + r1
            r12 = r0
            r0 = r15
            org.lwjgl.util.glu.tessellation.GLUhalfEdge r0 = r0.Onext
            r15 = r0
            goto L19
        L6a:
            r0 = r15
            r16 = r0
            r0 = r8
            r15 = r0
        L71:
            r0 = r15
            org.lwjgl.util.glu.tessellation.GLUhalfEdge r0 = r0.Sym
            org.lwjgl.util.glu.tessellation.GLUface r0 = r0.Lface
            boolean r0 = Marked(r0)
            if (r0 != 0) goto Ld0
            r0 = r15
            org.lwjgl.util.glu.tessellation.GLUhalfEdge r0 = r0.Sym
            org.lwjgl.util.glu.tessellation.GLUface r0 = r0.Lface
            r1 = r14
            org.lwjgl.util.glu.tessellation.GLUface r0 = AddToTrail(r0, r1)
            r14 = r0
            r0 = r10
            r1 = 1
            long r0 = r0 + r1
            r10 = r0
            r0 = r15
            org.lwjgl.util.glu.tessellation.GLUhalfEdge r0 = r0.Sym
            org.lwjgl.util.glu.tessellation.GLUhalfEdge r0 = r0.Lnext
            r15 = r0
            r0 = r15
            org.lwjgl.util.glu.tessellation.GLUhalfEdge r0 = r0.Sym
            org.lwjgl.util.glu.tessellation.GLUface r0 = r0.Lface
            boolean r0 = Marked(r0)
            if (r0 == 0) goto Lad
            goto Ld0
        Lad:
            r0 = r15
            org.lwjgl.util.glu.tessellation.GLUhalfEdge r0 = r0.Sym
            org.lwjgl.util.glu.tessellation.GLUface r0 = r0.Lface
            r1 = r14
            org.lwjgl.util.glu.tessellation.GLUface r0 = AddToTrail(r0, r1)
            r14 = r0
            r0 = r10
            r1 = 1
            long r0 = r0 + r1
            r10 = r0
            r0 = r15
            org.lwjgl.util.glu.tessellation.GLUhalfEdge r0 = r0.Sym
            org.lwjgl.util.glu.tessellation.GLUhalfEdge r0 = r0.Onext
            org.lwjgl.util.glu.tessellation.GLUhalfEdge r0 = r0.Sym
            r15 = r0
            goto L71
        Ld0:
            r0 = r15
            r17 = r0
            r0 = r9
            r1 = r12
            r2 = r10
            long r1 = r1 + r2
            r0.size = r1
            r0 = r12
            boolean r0 = IsEven(r0)
            if (r0 == 0) goto Lf0
            r0 = r9
            r1 = r16
            org.lwjgl.util.glu.tessellation.GLUhalfEdge r1 = r1.Sym
            r0.eStart = r1
            goto L113
        Lf0:
            r0 = r10
            boolean r0 = IsEven(r0)
            if (r0 == 0) goto L100
            r0 = r9
            r1 = r17
            r0.eStart = r1
            goto L113
        L100:
            r0 = r9
            r1 = r0
            long r1 = r1.size
            r2 = 1
            long r1 = r1 - r2
            r0.size = r1
            r0 = r9
            r1 = r17
            org.lwjgl.util.glu.tessellation.GLUhalfEdge r1 = r1.Onext
            r0.eStart = r1
        L113:
            r0 = r14
            FreeTrail(r0)
            r0 = r9
            return r0
    }

    static void RenderLonelyTriangles(org.lwjgl.util.glu.tessellation.GLUtessellatorImpl r3, org.lwjgl.util.glu.tessellation.GLUface r4) {
            r0 = -1
            r7 = r0
            r0 = r3
            r1 = 4
            r0.callBeginOrBeginData(r1)
        L8:
            r0 = r4
            if (r0 == 0) goto L62
            r0 = r4
            org.lwjgl.util.glu.tessellation.GLUhalfEdge r0 = r0.anEdge
            r5 = r0
        L11:
            r0 = r3
            boolean r0 = r0.flagBoundary
            if (r0 == 0) goto L42
            r0 = r5
            org.lwjgl.util.glu.tessellation.GLUhalfEdge r0 = r0.Sym
            org.lwjgl.util.glu.tessellation.GLUface r0 = r0.Lface
            boolean r0 = r0.inside
            if (r0 != 0) goto L29
            r0 = 1
            goto L2a
        L29:
            r0 = 0
        L2a:
            r6 = r0
            r0 = r7
            r1 = r6
            if (r0 == r1) goto L42
            r0 = r6
            r7 = r0
            r0 = r3
            r1 = r7
            if (r1 == 0) goto L3e
            r1 = 1
            goto L3f
        L3e:
            r1 = 0
        L3f:
            r0.callEdgeFlagOrEdgeFlagData(r1)
        L42:
            r0 = r3
            r1 = r5
            org.lwjgl.util.glu.tessellation.GLUvertex r1 = r1.Org
            java.lang.Object r1 = r1.data
            r0.callVertexOrVertexData(r1)
            r0 = r5
            org.lwjgl.util.glu.tessellation.GLUhalfEdge r0 = r0.Lnext
            r5 = r0
            r0 = r5
            r1 = r4
            org.lwjgl.util.glu.tessellation.GLUhalfEdge r1 = r1.anEdge
            if (r0 != r1) goto L11
            r0 = r4
            org.lwjgl.util.glu.tessellation.GLUface r0 = r0.trail
            r4 = r0
            goto L8
        L62:
            r0 = r3
            r0.callEndOrEndData()
            return
    }

    public static void __gl_renderBoundary(org.lwjgl.util.glu.tessellation.GLUtessellatorImpl r3, org.lwjgl.util.glu.tessellation.GLUmesh r4) {
            r0 = r4
            org.lwjgl.util.glu.tessellation.GLUface r0 = r0.fHead
            org.lwjgl.util.glu.tessellation.GLUface r0 = r0.next
            r5 = r0
        L8:
            r0 = r5
            r1 = r4
            org.lwjgl.util.glu.tessellation.GLUface r1 = r1.fHead
            if (r0 == r1) goto L45
            r0 = r5
            boolean r0 = r0.inside
            if (r0 == 0) goto L3d
            r0 = r3
            r1 = 2
            r0.callBeginOrBeginData(r1)
            r0 = r5
            org.lwjgl.util.glu.tessellation.GLUhalfEdge r0 = r0.anEdge
            r6 = r0
        L21:
            r0 = r3
            r1 = r6
            org.lwjgl.util.glu.tessellation.GLUvertex r1 = r1.Org
            java.lang.Object r1 = r1.data
            r0.callVertexOrVertexData(r1)
            r0 = r6
            org.lwjgl.util.glu.tessellation.GLUhalfEdge r0 = r0.Lnext
            r6 = r0
            r0 = r6
            r1 = r5
            org.lwjgl.util.glu.tessellation.GLUhalfEdge r1 = r1.anEdge
            if (r0 != r1) goto L21
            r0 = r3
            r0.callEndOrEndData()
        L3d:
            r0 = r5
            org.lwjgl.util.glu.tessellation.GLUface r0 = r0.next
            r5 = r0
            goto L8
        L45:
            return
    }

    static int ComputeNormal(org.lwjgl.util.glu.tessellation.GLUtessellatorImpl r11, double[] r12, boolean r13) {
            r0 = r11
            org.lwjgl.util.glu.tessellation.CachedVertex[] r0 = r0.cache
            r14 = r0
            r0 = r11
            int r0 = r0.cacheCount
            r15 = r0
            r0 = 3
            double[] r0 = new double[r0]
            r31 = r0
            r0 = 0
            r32 = r0
            r0 = r13
            if (r0 != 0) goto L23
            r0 = r12
            r1 = 0
            r2 = r12
            r3 = 1
            r4 = r12
            r5 = 2
            r6 = 0
            r7 = r6; r6 = r5; r5 = r4; r4 = r7; 
            r5[r6] = r7
            r5 = r4; r4 = r3; r3 = r2; r2 = r5; 
            r3[r4] = r5
            r0[r1] = r2
        L23:
            r0 = 1
            r16 = r0
            r0 = r14
            r1 = r16
            r0 = r0[r1]
            double[] r0 = r0.coords
            r1 = 0
            r0 = r0[r1]
            r1 = r14
            r2 = 0
            r1 = r1[r2]
            double[] r1 = r1.coords
            r2 = 0
            r1 = r1[r2]
            double r0 = r0 - r1
            r19 = r0
            r0 = r14
            r1 = r16
            r0 = r0[r1]
            double[] r0 = r0.coords
            r1 = 1
            r0 = r0[r1]
            r1 = r14
            r2 = 0
            r1 = r1[r2]
            double[] r1 = r1.coords
            r2 = 1
            r1 = r1[r2]
            double r0 = r0 - r1
            r21 = r0
            r0 = r14
            r1 = r16
            r0 = r0[r1]
            double[] r0 = r0.coords
            r1 = 2
            r0 = r0[r1]
            r1 = r14
            r2 = 0
            r1 = r1[r2]
            double[] r1 = r1.coords
            r2 = 2
            r1 = r1[r2]
            double r0 = r0 - r1
            r23 = r0
        L62:
            int r16 = r16 + 1
            r0 = r16
            r1 = r15
            if (r0 >= r1) goto L172
            r0 = r19
            r25 = r0
            r0 = r21
            r27 = r0
            r0 = r23
            r29 = r0
            r0 = r14
            r1 = r16
            r0 = r0[r1]
            double[] r0 = r0.coords
            r1 = 0
            r0 = r0[r1]
            r1 = r14
            r2 = 0
            r1 = r1[r2]
            double[] r1 = r1.coords
            r2 = 0
            r1 = r1[r2]
            double r0 = r0 - r1
            r19 = r0
            r0 = r14
            r1 = r16
            r0 = r0[r1]
            double[] r0 = r0.coords
            r1 = 1
            r0 = r0[r1]
            r1 = r14
            r2 = 0
            r1 = r1[r2]
            double[] r1 = r1.coords
            r2 = 1
            r1 = r1[r2]
            double r0 = r0 - r1
            r21 = r0
            r0 = r14
            r1 = r16
            r0 = r0[r1]
            double[] r0 = r0.coords
            r1 = 2
            r0 = r0[r1]
            r1 = r14
            r2 = 0
            r1 = r1[r2]
            double[] r1 = r1.coords
            r2 = 2
            r1 = r1[r2]
            double r0 = r0 - r1
            r23 = r0
            r0 = r31
            r1 = 0
            r2 = r27
            r3 = r23
            double r2 = r2 * r3
            r3 = r29
            r4 = r21
            double r3 = r3 * r4
            double r2 = r2 - r3
            r0[r1] = r2
            r0 = r31
            r1 = 1
            r2 = r29
            r3 = r19
            double r2 = r2 * r3
            r3 = r25
            r4 = r23
            double r3 = r3 * r4
            double r2 = r2 - r3
            r0[r1] = r2
            r0 = r31
            r1 = 2
            r2 = r25
            r3 = r21
            double r2 = r2 * r3
            r3 = r27
            r4 = r19
            double r3 = r3 * r4
            double r2 = r2 - r3
            r0[r1] = r2
            r0 = r31
            r1 = 0
            r0 = r0[r1]
            r1 = r12
            r2 = 0
            r1 = r1[r2]
            double r0 = r0 * r1
            r1 = r31
            r2 = 1
            r1 = r1[r2]
            r2 = r12
            r3 = 1
            r2 = r2[r3]
            double r1 = r1 * r2
            double r0 = r0 + r1
            r1 = r31
            r2 = 2
            r1 = r1[r2]
            r2 = r12
            r3 = 2
            r2 = r2[r3]
            double r1 = r1 * r2
            double r0 = r0 + r1
            r17 = r0
            r0 = r13
            if (r0 != 0) goto L14a
            r0 = r17
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 < 0) goto L129
            r0 = r12
            r1 = 0
            r2 = r0; r3 = r1; 
            r2 = r2[r3]
            r3 = r31
            r4 = 0
            r3 = r3[r4]
            double r2 = r2 + r3
            r0[r1] = r2
            r0 = r12
            r1 = 1
            r2 = r0; r3 = r1; 
            r2 = r2[r3]
            r3 = r31
            r4 = 1
            r3 = r3[r4]
            double r2 = r2 + r3
            r0[r1] = r2
            r0 = r12
            r1 = 2
            r2 = r0; r3 = r1; 
            r2 = r2[r3]
            r3 = r31
            r4 = 2
            r3 = r3[r4]
            double r2 = r2 + r3
            r0[r1] = r2
            goto L62
        L129:
            r0 = r12
            r1 = 0
            r2 = r0; r3 = r1; 
            r2 = r2[r3]
            r3 = r31
            r4 = 0
            r3 = r3[r4]
            double r2 = r2 - r3
            r0[r1] = r2
            r0 = r12
            r1 = 1
            r2 = r0; r3 = r1; 
            r2 = r2[r3]
            r3 = r31
            r4 = 1
            r3 = r3[r4]
            double r2 = r2 - r3
            r0[r1] = r2
            r0 = r12
            r1 = 2
            r2 = r0; r3 = r1; 
            r2 = r2[r3]
            r3 = r31
            r4 = 2
            r3 = r3[r4]
            double r2 = r2 - r3
            r0[r1] = r2
            goto L62
        L14a:
            r0 = r17
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto L62
            r0 = r17
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 <= 0) goto L165
            r0 = r32
            if (r0 >= 0) goto L15f
            r0 = 2
            return r0
        L15f:
            r0 = 1
            r32 = r0
            goto L62
        L165:
            r0 = r32
            if (r0 <= 0) goto L16c
            r0 = 2
            return r0
        L16c:
            r0 = -1
            r32 = r0
            goto L62
        L172:
            r0 = r32
            return r0
    }

    public static boolean __gl_renderCache(org.lwjgl.util.glu.tessellation.GLUtessellatorImpl r5) {
            r0 = r5
            org.lwjgl.util.glu.tessellation.CachedVertex[] r0 = r0.cache
            r6 = r0
            r0 = r5
            int r0 = r0.cacheCount
            r7 = r0
            r0 = 3
            double[] r0 = new double[r0]
            r9 = r0
            r0 = r5
            int r0 = r0.cacheCount
            r1 = 3
            if (r0 >= r1) goto L19
            r0 = 1
            return r0
        L19:
            r0 = r9
            r1 = 0
            r2 = r5
            double[] r2 = r2.normal
            r3 = 0
            r2 = r2[r3]
            r0[r1] = r2
            r0 = r9
            r1 = 1
            r2 = r5
            double[] r2 = r2.normal
            r3 = 1
            r2 = r2[r3]
            r0[r1] = r2
            r0 = r9
            r1 = 2
            r2 = r5
            double[] r2 = r2.normal
            r3 = 2
            r2 = r2[r3]
            r0[r1] = r2
            r0 = r9
            r1 = 0
            r0 = r0[r1]
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto L5a
            r0 = r9
            r1 = 1
            r0 = r0[r1]
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto L5a
            r0 = r9
            r1 = 2
            r0 = r0[r1]
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto L5a
            r0 = r5
            r1 = r9
            r2 = 0
            int r0 = ComputeNormal(r0, r1, r2)
        L5a:
            r0 = r5
            r1 = r9
            r2 = 1
            int r0 = ComputeNormal(r0, r1, r2)
            r10 = r0
            r0 = r10
            r1 = 2
            if (r0 != r1) goto L6b
            r0 = 0
            return r0
        L6b:
            r0 = r10
            if (r0 != 0) goto L72
            r0 = 1
            return r0
        L72:
            r0 = 0
            return r0
    }

    static /* synthetic */ org.lwjgl.util.glu.tessellation.GLUface access$500(org.lwjgl.util.glu.tessellation.GLUface r3, org.lwjgl.util.glu.tessellation.GLUface r4) {
            r0 = r3
            r1 = r4
            org.lwjgl.util.glu.tessellation.GLUface r0 = AddToTrail(r0, r1)
            return r0
    }

    static /* synthetic */ boolean access$600(org.lwjgl.util.glu.tessellation.GLUface r2) {
            r0 = r2
            boolean r0 = Marked(r0)
            return r0
    }

    static {
            java.lang.Class<org.lwjgl.util.glu.tessellation.Render> r0 = org.lwjgl.util.glu.tessellation.Render.class
            boolean r0 = r0.desiredAssertionStatus()
            if (r0 != 0) goto Lc
            r0 = 1
            goto Ld
        Lc:
            r0 = 0
        Ld:
            org.lwjgl.util.glu.tessellation.Render.$assertionsDisabled = r0
            org.lwjgl.util.glu.tessellation.Render$RenderFan r0 = new org.lwjgl.util.glu.tessellation.Render$RenderFan
            r1 = r0
            r2 = 0
            r1.<init>(r2)
            org.lwjgl.util.glu.tessellation.Render.renderFan = r0
            org.lwjgl.util.glu.tessellation.Render$RenderStrip r0 = new org.lwjgl.util.glu.tessellation.Render$RenderStrip
            r1 = r0
            r2 = 0
            r1.<init>(r2)
            org.lwjgl.util.glu.tessellation.Render.renderStrip = r0
            org.lwjgl.util.glu.tessellation.Render$RenderTriangle r0 = new org.lwjgl.util.glu.tessellation.Render$RenderTriangle
            r1 = r0
            r2 = 0
            r1.<init>(r2)
            org.lwjgl.util.glu.tessellation.Render.renderTriangle = r0
            return
    }
}
