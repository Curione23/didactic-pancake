package org.lwjgl.util.glu.tessellation;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/util/glu/tessellation/Normal.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/util/glu/tessellation/Normal.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/util/glu/tessellation/Normal.class */
class Normal {
    static boolean SLANTED_SWEEP;
    static double S_UNIT_X;
    static double S_UNIT_Y;
    private static final boolean TRUE_PROJECT = false;
    static final /* synthetic */ boolean $assertionsDisabled = false;

    private Normal() {
            r2 = this;
            r0 = r2
            r0.<init>()
            return
    }

    private static double Dot(double[] r7, double[] r8) {
            r0 = r7
            r1 = 0
            r0 = r0[r1]
            r1 = r8
            r2 = 0
            r1 = r1[r2]
            double r0 = r0 * r1
            r1 = r7
            r2 = 1
            r1 = r1[r2]
            r2 = r8
            r3 = 1
            r2 = r2[r3]
            double r1 = r1 * r2
            double r0 = r0 + r1
            r1 = r7
            r2 = 2
            r1 = r1[r2]
            r2 = r8
            r3 = 2
            r2 = r2[r3]
            double r1 = r1 * r2
            double r0 = r0 + r1
            return r0
    }

    static void Normalize(double[] r7) {
            r0 = r7
            r1 = 0
            r0 = r0[r1]
            r1 = r7
            r2 = 0
            r1 = r1[r2]
            double r0 = r0 * r1
            r1 = r7
            r2 = 1
            r1 = r1[r2]
            r2 = r7
            r3 = 1
            r2 = r2[r3]
            double r1 = r1 * r2
            double r0 = r0 + r1
            r1 = r7
            r2 = 2
            r1 = r1[r2]
            r2 = r7
            r3 = 2
            r2 = r2[r3]
            double r1 = r1 * r2
            double r0 = r0 + r1
            r8 = r0
            boolean r0 = org.lwjgl.util.glu.tessellation.Normal.$assertionsDisabled
            if (r0 != 0) goto L2c
            r0 = r8
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 > 0) goto L2c
            java.lang.AssertionError r0 = new java.lang.AssertionError
            r1 = r0
            r1.<init>()
            throw r0
        L2c:
            r0 = r8
            double r0 = java.lang.Math.sqrt(r0)
            r8 = r0
            r0 = r7
            r1 = 0
            r2 = r0; r3 = r1; 
            r2 = r2[r3]
            r3 = r8
            double r2 = r2 / r3
            r0[r1] = r2
            r0 = r7
            r1 = 1
            r2 = r0; r3 = r1; 
            r2 = r2[r3]
            r3 = r8
            double r2 = r2 / r3
            r0[r1] = r2
            r0 = r7
            r1 = 2
            r2 = r0; r3 = r1; 
            r2 = r2[r3]
            r3 = r8
            double r2 = r2 / r3
            r0[r1] = r2
            return
    }

    static int LongAxis(double[] r5) {
            r0 = 0
            r6 = r0
            r0 = r5
            r1 = 1
            r0 = r0[r1]
            double r0 = java.lang.Math.abs(r0)
            r1 = r5
            r2 = 0
            r1 = r1[r2]
            double r1 = java.lang.Math.abs(r1)
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 <= 0) goto L14
            r0 = 1
            r6 = r0
        L14:
            r0 = r5
            r1 = 2
            r0 = r0[r1]
            double r0 = java.lang.Math.abs(r0)
            r1 = r5
            r2 = r6
            r1 = r1[r2]
            double r1 = java.lang.Math.abs(r1)
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 <= 0) goto L26
            r0 = 2
            r6 = r0
        L26:
            r0 = r6
            return r0
    }

    static void ComputeNormal(org.lwjgl.util.glu.tessellation.GLUtessellatorImpl r11, double[] r12) {
            r0 = r11
            org.lwjgl.util.glu.tessellation.GLUmesh r0 = r0.mesh
            org.lwjgl.util.glu.tessellation.GLUvertex r0 = r0.vHead
            r29 = r0
            r0 = 3
            double[] r0 = new double[r0]
            r22 = r0
            r0 = 3
            double[] r0 = new double[r0]
            r23 = r0
            r0 = 3
            org.lwjgl.util.glu.tessellation.GLUvertex[] r0 = new org.lwjgl.util.glu.tessellation.GLUvertex[r0]
            r28 = r0
            r0 = 3
            org.lwjgl.util.glu.tessellation.GLUvertex[] r0 = new org.lwjgl.util.glu.tessellation.GLUvertex[r0]
            r27 = r0
            r0 = 3
            double[] r0 = new double[r0]
            r24 = r0
            r0 = 3
            double[] r0 = new double[r0]
            r25 = r0
            r0 = 3
            double[] r0 = new double[r0]
            r26 = r0
            r0 = r22
            r1 = 0
            r2 = r22
            r3 = 1
            r4 = r22
            r5 = 2
            r6 = -2367893719516932433(0xdf238d352e5096af, double:-2.0E150)
            r7 = r6; r6 = r5; r5 = r4; r4 = r7; 
            r5[r6] = r7
            r5 = r4; r4 = r3; r3 = r2; r2 = r5; 
            r3[r4] = r5
            r0[r1] = r2
            r0 = r23
            r1 = 0
            r2 = r23
            r3 = 1
            r4 = r23
            r5 = 2
            r6 = 6855478317337843375(0x5f238d352e5096af, double:2.0E150)
            r7 = r6; r6 = r5; r5 = r4; r4 = r7; 
            r5[r6] = r7
            r5 = r4; r4 = r3; r3 = r2; r2 = r5; 
            r3[r4] = r5
            r0[r1] = r2
            r0 = r29
            org.lwjgl.util.glu.tessellation.GLUvertex r0 = r0.next
            r13 = r0
        L56:
            r0 = r13
            r1 = r29
            if (r0 == r1) goto Lac
            r0 = 0
            r30 = r0
        L5f:
            r0 = r30
            r1 = 3
            if (r0 >= r1) goto La4
            r0 = r13
            double[] r0 = r0.coords
            r1 = r30
            r0 = r0[r1]
            r16 = r0
            r0 = r16
            r1 = r23
            r2 = r30
            r1 = r1[r2]
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 >= 0) goto L86
            r0 = r23
            r1 = r30
            r2 = r16
            r0[r1] = r2
            r0 = r28
            r1 = r30
            r2 = r13
            r0[r1] = r2
        L86:
            r0 = r16
            r1 = r22
            r2 = r30
            r1 = r1[r2]
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 <= 0) goto L9e
            r0 = r22
            r1 = r30
            r2 = r16
            r0[r1] = r2
            r0 = r27
            r1 = r30
            r2 = r13
            r0[r1] = r2
        L9e:
            int r30 = r30 + 1
            goto L5f
        La4:
            r0 = r13
            org.lwjgl.util.glu.tessellation.GLUvertex r0 = r0.next
            r13 = r0
            goto L56
        Lac:
            r0 = 0
            r30 = r0
            r0 = r22
            r1 = 1
            r0 = r0[r1]
            r1 = r23
            r2 = 1
            r1 = r1[r2]
            double r0 = r0 - r1
            r1 = r22
            r2 = 0
            r1 = r1[r2]
            r2 = r23
            r3 = 0
            r2 = r2[r3]
            double r1 = r1 - r2
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 <= 0) goto Lc8
            r0 = 1
            r30 = r0
        Lc8:
            r0 = r22
            r1 = 2
            r0 = r0[r1]
            r1 = r23
            r2 = 2
            r1 = r1[r2]
            double r0 = r0 - r1
            r1 = r22
            r2 = r30
            r1 = r1[r2]
            r2 = r23
            r3 = r30
            r2 = r2[r3]
            double r1 = r1 - r2
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 <= 0) goto Le3
            r0 = 2
            r30 = r0
        Le3:
            r0 = r23
            r1 = r30
            r0 = r0[r1]
            r1 = r22
            r2 = r30
            r1 = r1[r2]
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 < 0) goto Lfe
            r0 = r12
            r1 = 0
            r2 = 0
            r0[r1] = r2
            r0 = r12
            r1 = 1
            r2 = 0
            r0[r1] = r2
            r0 = r12
            r1 = 2
            r2 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            r0[r1] = r2
            return
        Lfe:
            r0 = 0
            r20 = r0
            r0 = r28
            r1 = r30
            r0 = r0[r1]
            r14 = r0
            r0 = r27
            r1 = r30
            r0 = r0[r1]
            r15 = r0
            r0 = r24
            r1 = 0
            r2 = r14
            double[] r2 = r2.coords
            r3 = 0
            r2 = r2[r3]
            r3 = r15
            double[] r3 = r3.coords
            r4 = 0
            r3 = r3[r4]
            double r2 = r2 - r3
            r0[r1] = r2
            r0 = r24
            r1 = 1
            r2 = r14
            double[] r2 = r2.coords
            r3 = 1
            r2 = r2[r3]
            r3 = r15
            double[] r3 = r3.coords
            r4 = 1
            r3 = r3[r4]
            double r2 = r2 - r3
            r0[r1] = r2
            r0 = r24
            r1 = 2
            r2 = r14
            double[] r2 = r2.coords
            r3 = 2
            r2 = r2[r3]
            r3 = r15
            double[] r3 = r3.coords
            r4 = 2
            r3 = r3[r4]
            double r2 = r2 - r3
            r0[r1] = r2
            r0 = r29
            org.lwjgl.util.glu.tessellation.GLUvertex r0 = r0.next
            r13 = r0
        L14a:
            r0 = r13
            r1 = r29
            if (r0 == r1) goto L213
            r0 = r25
            r1 = 0
            r2 = r13
            double[] r2 = r2.coords
            r3 = 0
            r2 = r2[r3]
            r3 = r15
            double[] r3 = r3.coords
            r4 = 0
            r3 = r3[r4]
            double r2 = r2 - r3
            r0[r1] = r2
            r0 = r25
            r1 = 1
            r2 = r13
            double[] r2 = r2.coords
            r3 = 1
            r2 = r2[r3]
            r3 = r15
            double[] r3 = r3.coords
            r4 = 1
            r3 = r3[r4]
            double r2 = r2 - r3
            r0[r1] = r2
            r0 = r25
            r1 = 2
            r2 = r13
            double[] r2 = r2.coords
            r3 = 2
            r2 = r2[r3]
            r3 = r15
            double[] r3 = r3.coords
            r4 = 2
            r3 = r3[r4]
            double r2 = r2 - r3
            r0[r1] = r2
            r0 = r26
            r1 = 0
            r2 = r24
            r3 = 1
            r2 = r2[r3]
            r3 = r25
            r4 = 2
            r3 = r3[r4]
            double r2 = r2 * r3
            r3 = r24
            r4 = 2
            r3 = r3[r4]
            r4 = r25
            r5 = 1
            r4 = r4[r5]
            double r3 = r3 * r4
            double r2 = r2 - r3
            r0[r1] = r2
            r0 = r26
            r1 = 1
            r2 = r24
            r3 = 2
            r2 = r2[r3]
            r3 = r25
            r4 = 0
            r3 = r3[r4]
            double r2 = r2 * r3
            r3 = r24
            r4 = 0
            r3 = r3[r4]
            r4 = r25
            r5 = 2
            r4 = r4[r5]
            double r3 = r3 * r4
            double r2 = r2 - r3
            r0[r1] = r2
            r0 = r26
            r1 = 2
            r2 = r24
            r3 = 0
            r2 = r2[r3]
            r3 = r25
            r4 = 1
            r3 = r3[r4]
            double r2 = r2 * r3
            r3 = r24
            r4 = 1
            r3 = r3[r4]
            r4 = r25
            r5 = 0
            r4 = r4[r5]
            double r3 = r3 * r4
            double r2 = r2 - r3
            r0[r1] = r2
            r0 = r26
            r1 = 0
            r0 = r0[r1]
            r1 = r26
            r2 = 0
            r1 = r1[r2]
            double r0 = r0 * r1
            r1 = r26
            r2 = 1
            r1 = r1[r2]
            r2 = r26
            r3 = 1
            r2 = r2[r3]
            double r1 = r1 * r2
            double r0 = r0 + r1
            r1 = r26
            r2 = 2
            r1 = r1[r2]
            r2 = r26
            r3 = 2
            r2 = r2[r3]
            double r1 = r1 * r2
            double r0 = r0 + r1
            r18 = r0
            r0 = r18
            r1 = r20
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 <= 0) goto L20b
            r0 = r18
            r20 = r0
            r0 = r12
            r1 = 0
            r2 = r26
            r3 = 0
            r2 = r2[r3]
            r0[r1] = r2
            r0 = r12
            r1 = 1
            r2 = r26
            r3 = 1
            r2 = r2[r3]
            r0[r1] = r2
            r0 = r12
            r1 = 2
            r2 = r26
            r3 = 2
            r2 = r2[r3]
            r0[r1] = r2
        L20b:
            r0 = r13
            org.lwjgl.util.glu.tessellation.GLUvertex r0 = r0.next
            r13 = r0
            goto L14a
        L213:
            r0 = r20
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 > 0) goto L22e
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
            r0 = r12
            r1 = r24
            int r1 = LongAxis(r1)
            r2 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            r0[r1] = r2
        L22e:
            return
    }

    static void CheckOrientation(org.lwjgl.util.glu.tessellation.GLUtessellatorImpl r9) {
            r0 = r9
            org.lwjgl.util.glu.tessellation.GLUmesh r0 = r0.mesh
            org.lwjgl.util.glu.tessellation.GLUface r0 = r0.fHead
            r13 = r0
            r0 = r9
            org.lwjgl.util.glu.tessellation.GLUmesh r0 = r0.mesh
            org.lwjgl.util.glu.tessellation.GLUvertex r0 = r0.vHead
            r15 = r0
            r0 = 0
            r10 = r0
            r0 = r13
            org.lwjgl.util.glu.tessellation.GLUface r0 = r0.next
            r12 = r0
        L1a:
            r0 = r12
            r1 = r13
            if (r0 == r1) goto L75
            r0 = r12
            org.lwjgl.util.glu.tessellation.GLUhalfEdge r0 = r0.anEdge
            r16 = r0
            r0 = r16
            int r0 = r0.winding
            if (r0 > 0) goto L31
            goto L6d
        L31:
            r0 = r10
            r1 = r16
            org.lwjgl.util.glu.tessellation.GLUvertex r1 = r1.Org
            double r1 = r1.s
            r2 = r16
            org.lwjgl.util.glu.tessellation.GLUhalfEdge r2 = r2.Sym
            org.lwjgl.util.glu.tessellation.GLUvertex r2 = r2.Org
            double r2 = r2.s
            double r1 = r1 - r2
            r2 = r16
            org.lwjgl.util.glu.tessellation.GLUvertex r2 = r2.Org
            double r2 = r2.t
            r3 = r16
            org.lwjgl.util.glu.tessellation.GLUhalfEdge r3 = r3.Sym
            org.lwjgl.util.glu.tessellation.GLUvertex r3 = r3.Org
            double r3 = r3.t
            double r2 = r2 + r3
            double r1 = r1 * r2
            double r0 = r0 + r1
            r10 = r0
            r0 = r16
            org.lwjgl.util.glu.tessellation.GLUhalfEdge r0 = r0.Lnext
            r16 = r0
            r0 = r16
            r1 = r12
            org.lwjgl.util.glu.tessellation.GLUhalfEdge r1 = r1.anEdge
            if (r0 != r1) goto L31
        L6d:
            r0 = r12
            org.lwjgl.util.glu.tessellation.GLUface r0 = r0.next
            r12 = r0
            goto L1a
        L75:
            r0 = r10
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 >= 0) goto Lc5
            r0 = r15
            org.lwjgl.util.glu.tessellation.GLUvertex r0 = r0.next
            r14 = r0
        L82:
            r0 = r14
            r1 = r15
            if (r0 == r1) goto L9e
            r0 = r14
            r1 = r14
            double r1 = r1.t
            double r1 = -r1
            r0.t = r1
            r0 = r14
            org.lwjgl.util.glu.tessellation.GLUvertex r0 = r0.next
            r14 = r0
            goto L82
        L9e:
            r0 = r9
            double[] r0 = r0.tUnit
            r1 = 0
            r2 = r9
            double[] r2 = r2.tUnit
            r3 = 0
            r2 = r2[r3]
            double r2 = -r2
            r0[r1] = r2
            r0 = r9
            double[] r0 = r0.tUnit
            r1 = 1
            r2 = r9
            double[] r2 = r2.tUnit
            r3 = 1
            r2 = r2[r3]
            double r2 = -r2
            r0[r1] = r2
            r0 = r9
            double[] r0 = r0.tUnit
            r1 = 2
            r2 = r9
            double[] r2 = r2.tUnit
            r3 = 2
            r2 = r2[r3]
            double r2 = -r2
            r0[r1] = r2
        Lc5:
            return
    }

    public static void __gl_projectPolygon(org.lwjgl.util.glu.tessellation.GLUtessellatorImpl r7) {
            r0 = r7
            org.lwjgl.util.glu.tessellation.GLUmesh r0 = r0.mesh
            org.lwjgl.util.glu.tessellation.GLUvertex r0 = r0.vHead
            r9 = r0
            r0 = 3
            double[] r0 = new double[r0]
            r12 = r0
            r0 = 0
            r16 = r0
            r0 = r12
            r1 = 0
            r2 = r7
            double[] r2 = r2.normal
            r3 = 0
            r2 = r2[r3]
            r0[r1] = r2
            r0 = r12
            r1 = 1
            r2 = r7
            double[] r2 = r2.normal
            r3 = 1
            r2 = r2[r3]
            r0[r1] = r2
            r0 = r12
            r1 = 2
            r2 = r7
            double[] r2 = r2.normal
            r3 = 2
            r2 = r2[r3]
            r0[r1] = r2
            r0 = r12
            r1 = 0
            r0 = r0[r1]
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto L52
            r0 = r12
            r1 = 1
            r0 = r0[r1]
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto L52
            r0 = r12
            r1 = 2
            r0 = r0[r1]
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto L52
            r0 = r7
            r1 = r12
            ComputeNormal(r0, r1)
            r0 = 1
            r16 = r0
        L52:
            r0 = r7
            double[] r0 = r0.sUnit
            r13 = r0
            r0 = r7
            double[] r0 = r0.tUnit
            r14 = r0
            r0 = r12
            int r0 = LongAxis(r0)
            r15 = r0
            r0 = r13
            r1 = r15
            r2 = 0
            r0[r1] = r2
            r0 = r13
            r1 = r15
            r2 = 1
            int r1 = r1 + r2
            r2 = 3
            int r1 = r1 % r2
            double r2 = org.lwjgl.util.glu.tessellation.Normal.S_UNIT_X
            r0[r1] = r2
            r0 = r13
            r1 = r15
            r2 = 2
            int r1 = r1 + r2
            r2 = 3
            int r1 = r1 % r2
            double r2 = org.lwjgl.util.glu.tessellation.Normal.S_UNIT_Y
            r0[r1] = r2
            r0 = r14
            r1 = r15
            r2 = 0
            r0[r1] = r2
            r0 = r14
            r1 = r15
            r2 = 1
            int r1 = r1 + r2
            r2 = 3
            int r1 = r1 % r2
            r2 = r12
            r3 = r15
            r2 = r2[r3]
            r3 = 0
            int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r2 <= 0) goto La2
            double r2 = org.lwjgl.util.glu.tessellation.Normal.S_UNIT_Y
            double r2 = -r2
            goto La5
        La2:
            double r2 = org.lwjgl.util.glu.tessellation.Normal.S_UNIT_Y
        La5:
            r0[r1] = r2
            r0 = r14
            r1 = r15
            r2 = 2
            int r1 = r1 + r2
            r2 = 3
            int r1 = r1 % r2
            r2 = r12
            r3 = r15
            r2 = r2[r3]
            r3 = 0
            int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r2 <= 0) goto Lbe
            double r2 = org.lwjgl.util.glu.tessellation.Normal.S_UNIT_X
            goto Lc2
        Lbe:
            double r2 = org.lwjgl.util.glu.tessellation.Normal.S_UNIT_X
            double r2 = -r2
        Lc2:
            r0[r1] = r2
            r0 = r9
            org.lwjgl.util.glu.tessellation.GLUvertex r0 = r0.next
            r8 = r0
        Lc8:
            r0 = r8
            r1 = r9
            if (r0 == r1) goto Lef
            r0 = r8
            r1 = r8
            double[] r1 = r1.coords
            r2 = r13
            double r1 = Dot(r1, r2)
            r0.s = r1
            r0 = r8
            r1 = r8
            double[] r1 = r1.coords
            r2 = r14
            double r1 = Dot(r1, r2)
            r0.t = r1
            r0 = r8
            org.lwjgl.util.glu.tessellation.GLUvertex r0 = r0.next
            r8 = r0
            goto Lc8
        Lef:
            r0 = r16
            if (r0 == 0) goto Lf8
            r0 = r7
            CheckOrientation(r0)
        Lf8:
            return
    }

    static {
            java.lang.Class<org.lwjgl.util.glu.tessellation.Normal> r0 = org.lwjgl.util.glu.tessellation.Normal.class
            boolean r0 = r0.desiredAssertionStatus()
            if (r0 != 0) goto Lc
            r0 = 1
            goto Ld
        Lc:
            r0 = 0
        Ld:
            org.lwjgl.util.glu.tessellation.Normal.$assertionsDisabled = r0
            boolean r0 = org.lwjgl.util.glu.tessellation.Normal.SLANTED_SWEEP
            if (r0 == 0) goto L25
            r0 = 4602763625517324665(0x3fe04d21840c9979, double:0.5094153956495538)
            org.lwjgl.util.glu.tessellation.Normal.S_UNIT_X = r0
            r0 = 4605926101369319320(0x3feb8962cdd16f98, double:0.8605207462201063)
            org.lwjgl.util.glu.tessellation.Normal.S_UNIT_Y = r0
            goto L2d
        L25:
            r0 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            org.lwjgl.util.glu.tessellation.Normal.S_UNIT_X = r0
            r0 = 0
            org.lwjgl.util.glu.tessellation.Normal.S_UNIT_Y = r0
        L2d:
            return
    }
}
