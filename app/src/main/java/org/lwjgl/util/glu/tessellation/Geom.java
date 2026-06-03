package org.lwjgl.util.glu.tessellation;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/util/glu/tessellation/Geom.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/util/glu/tessellation/Geom.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/util/glu/tessellation/Geom.class */
class Geom {
    static final /* synthetic */ boolean $assertionsDisabled = false;

    private Geom() {
            r2 = this;
            r0 = r2
            r0.<init>()
            return
    }

    static double EdgeEval(org.lwjgl.util.glu.tessellation.GLUvertex r11, org.lwjgl.util.glu.tessellation.GLUvertex r12, org.lwjgl.util.glu.tessellation.GLUvertex r13) {
            boolean r0 = org.lwjgl.util.glu.tessellation.Geom.$assertionsDisabled
            if (r0 != 0) goto L1e
            r0 = r11
            r1 = r12
            boolean r0 = VertLeq(r0, r1)
            if (r0 == 0) goto L16
            r0 = r12
            r1 = r13
            boolean r0 = VertLeq(r0, r1)
            if (r0 != 0) goto L1e
        L16:
            java.lang.AssertionError r0 = new java.lang.AssertionError
            r1 = r0
            r1.<init>()
            throw r0
        L1e:
            r0 = r12
            double r0 = r0.s
            r1 = r11
            double r1 = r1.s
            double r0 = r0 - r1
            r14 = r0
            r0 = r13
            double r0 = r0.s
            r1 = r12
            double r1 = r1.s
            double r0 = r0 - r1
            r16 = r0
            r0 = r14
            r1 = r16
            double r0 = r0 + r1
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 <= 0) goto L7a
            r0 = r14
            r1 = r16
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 >= 0) goto L5e
            r0 = r12
            double r0 = r0.t
            r1 = r11
            double r1 = r1.t
            double r0 = r0 - r1
            r1 = r11
            double r1 = r1.t
            r2 = r13
            double r2 = r2.t
            double r1 = r1 - r2
            r2 = r14
            r3 = r14
            r4 = r16
            double r3 = r3 + r4
            double r2 = r2 / r3
            double r1 = r1 * r2
            double r0 = r0 + r1
            return r0
        L5e:
            r0 = r12
            double r0 = r0.t
            r1 = r13
            double r1 = r1.t
            double r0 = r0 - r1
            r1 = r13
            double r1 = r1.t
            r2 = r11
            double r2 = r2.t
            double r1 = r1 - r2
            r2 = r16
            r3 = r14
            r4 = r16
            double r3 = r3 + r4
            double r2 = r2 / r3
            double r1 = r1 * r2
            double r0 = r0 + r1
            return r0
        L7a:
            r0 = 0
            return r0
    }

    static double EdgeSign(org.lwjgl.util.glu.tessellation.GLUvertex r7, org.lwjgl.util.glu.tessellation.GLUvertex r8, org.lwjgl.util.glu.tessellation.GLUvertex r9) {
            boolean r0 = org.lwjgl.util.glu.tessellation.Geom.$assertionsDisabled
            if (r0 != 0) goto L1e
            r0 = r7
            r1 = r8
            boolean r0 = VertLeq(r0, r1)
            if (r0 == 0) goto L16
            r0 = r8
            r1 = r9
            boolean r0 = VertLeq(r0, r1)
            if (r0 != 0) goto L1e
        L16:
            java.lang.AssertionError r0 = new java.lang.AssertionError
            r1 = r0
            r1.<init>()
            throw r0
        L1e:
            r0 = r8
            double r0 = r0.s
            r1 = r7
            double r1 = r1.s
            double r0 = r0 - r1
            r10 = r0
            r0 = r9
            double r0 = r0.s
            r1 = r8
            double r1 = r1.s
            double r0 = r0 - r1
            r12 = r0
            r0 = r10
            r1 = r12
            double r0 = r0 + r1
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 <= 0) goto L55
            r0 = r8
            double r0 = r0.t
            r1 = r9
            double r1 = r1.t
            double r0 = r0 - r1
            r1 = r10
            double r0 = r0 * r1
            r1 = r8
            double r1 = r1.t
            r2 = r7
            double r2 = r2.t
            double r1 = r1 - r2
            r2 = r12
            double r1 = r1 * r2
            double r0 = r0 + r1
            return r0
        L55:
            r0 = 0
            return r0
    }

    static double TransEval(org.lwjgl.util.glu.tessellation.GLUvertex r11, org.lwjgl.util.glu.tessellation.GLUvertex r12, org.lwjgl.util.glu.tessellation.GLUvertex r13) {
            boolean r0 = org.lwjgl.util.glu.tessellation.Geom.$assertionsDisabled
            if (r0 != 0) goto L1e
            r0 = r11
            r1 = r12
            boolean r0 = TransLeq(r0, r1)
            if (r0 == 0) goto L16
            r0 = r12
            r1 = r13
            boolean r0 = TransLeq(r0, r1)
            if (r0 != 0) goto L1e
        L16:
            java.lang.AssertionError r0 = new java.lang.AssertionError
            r1 = r0
            r1.<init>()
            throw r0
        L1e:
            r0 = r12
            double r0 = r0.t
            r1 = r11
            double r1 = r1.t
            double r0 = r0 - r1
            r14 = r0
            r0 = r13
            double r0 = r0.t
            r1 = r12
            double r1 = r1.t
            double r0 = r0 - r1
            r16 = r0
            r0 = r14
            r1 = r16
            double r0 = r0 + r1
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 <= 0) goto L7a
            r0 = r14
            r1 = r16
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 >= 0) goto L5e
            r0 = r12
            double r0 = r0.s
            r1 = r11
            double r1 = r1.s
            double r0 = r0 - r1
            r1 = r11
            double r1 = r1.s
            r2 = r13
            double r2 = r2.s
            double r1 = r1 - r2
            r2 = r14
            r3 = r14
            r4 = r16
            double r3 = r3 + r4
            double r2 = r2 / r3
            double r1 = r1 * r2
            double r0 = r0 + r1
            return r0
        L5e:
            r0 = r12
            double r0 = r0.s
            r1 = r13
            double r1 = r1.s
            double r0 = r0 - r1
            r1 = r13
            double r1 = r1.s
            r2 = r11
            double r2 = r2.s
            double r1 = r1 - r2
            r2 = r16
            r3 = r14
            r4 = r16
            double r3 = r3 + r4
            double r2 = r2 / r3
            double r1 = r1 * r2
            double r0 = r0 + r1
            return r0
        L7a:
            r0 = 0
            return r0
    }

    static double TransSign(org.lwjgl.util.glu.tessellation.GLUvertex r7, org.lwjgl.util.glu.tessellation.GLUvertex r8, org.lwjgl.util.glu.tessellation.GLUvertex r9) {
            boolean r0 = org.lwjgl.util.glu.tessellation.Geom.$assertionsDisabled
            if (r0 != 0) goto L1e
            r0 = r7
            r1 = r8
            boolean r0 = TransLeq(r0, r1)
            if (r0 == 0) goto L16
            r0 = r8
            r1 = r9
            boolean r0 = TransLeq(r0, r1)
            if (r0 != 0) goto L1e
        L16:
            java.lang.AssertionError r0 = new java.lang.AssertionError
            r1 = r0
            r1.<init>()
            throw r0
        L1e:
            r0 = r8
            double r0 = r0.t
            r1 = r7
            double r1 = r1.t
            double r0 = r0 - r1
            r10 = r0
            r0 = r9
            double r0 = r0.t
            r1 = r8
            double r1 = r1.t
            double r0 = r0 - r1
            r12 = r0
            r0 = r10
            r1 = r12
            double r0 = r0 + r1
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 <= 0) goto L55
            r0 = r8
            double r0 = r0.s
            r1 = r9
            double r1 = r1.s
            double r0 = r0 - r1
            r1 = r10
            double r0 = r0 * r1
            r1 = r8
            double r1 = r1.s
            r2 = r7
            double r2 = r2.s
            double r1 = r1 - r2
            r2 = r12
            double r1 = r1 * r2
            double r0 = r0 + r1
            return r0
        L55:
            r0 = 0
            return r0
    }

    static boolean VertCCW(org.lwjgl.util.glu.tessellation.GLUvertex r9, org.lwjgl.util.glu.tessellation.GLUvertex r10, org.lwjgl.util.glu.tessellation.GLUvertex r11) {
            r0 = r9
            double r0 = r0.s
            r1 = r10
            double r1 = r1.t
            r2 = r11
            double r2 = r2.t
            double r1 = r1 - r2
            double r0 = r0 * r1
            r1 = r10
            double r1 = r1.s
            r2 = r11
            double r2 = r2.t
            r3 = r9
            double r3 = r3.t
            double r2 = r2 - r3
            double r1 = r1 * r2
            double r0 = r0 + r1
            r1 = r11
            double r1 = r1.s
            r2 = r9
            double r2 = r2.t
            r3 = r10
            double r3 = r3.t
            double r2 = r2 - r3
            double r1 = r1 * r2
            double r0 = r0 + r1
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 < 0) goto L35
            r0 = 1
            goto L36
        L35:
            r0 = 0
        L36:
            return r0
    }

    static double Interpolate(double r11, double r13, double r15, double r17) {
            r0 = r11
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 >= 0) goto La
            r0 = 0
            goto Lb
        La:
            r0 = r11
        Lb:
            r11 = r0
            r0 = r15
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 >= 0) goto L17
            r0 = 0
            goto L19
        L17:
            r0 = r15
        L19:
            r15 = r0
            r0 = r11
            r1 = r15
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 > 0) goto L40
            r0 = r15
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto L32
            r0 = r13
            r1 = r17
            double r0 = r0 + r1
            r1 = 4611686018427387904(0x4000000000000000, double:2.0)
            double r0 = r0 / r1
            return r0
        L32:
            r0 = r13
            r1 = r17
            r2 = r13
            double r1 = r1 - r2
            r2 = r11
            r3 = r11
            r4 = r15
            double r3 = r3 + r4
            double r2 = r2 / r3
            double r1 = r1 * r2
            double r0 = r0 + r1
            return r0
        L40:
            r0 = r17
            r1 = r13
            r2 = r17
            double r1 = r1 - r2
            r2 = r15
            r3 = r11
            r4 = r15
            double r3 = r3 + r4
            double r2 = r2 / r3
            double r1 = r1 * r2
            double r0 = r0 + r1
            return r0
    }

    static void EdgeIntersect(org.lwjgl.util.glu.tessellation.GLUvertex r10, org.lwjgl.util.glu.tessellation.GLUvertex r11, org.lwjgl.util.glu.tessellation.GLUvertex r12, org.lwjgl.util.glu.tessellation.GLUvertex r13, org.lwjgl.util.glu.tessellation.GLUvertex r14) {
            r0 = r10
            r1 = r11
            boolean r0 = VertLeq(r0, r1)
            if (r0 != 0) goto L10
            r0 = r10
            r19 = r0
            r0 = r11
            r10 = r0
            r0 = r19
            r11 = r0
        L10:
            r0 = r12
            r1 = r13
            boolean r0 = VertLeq(r0, r1)
            if (r0 != 0) goto L20
            r0 = r12
            r19 = r0
            r0 = r13
            r12 = r0
            r0 = r19
            r13 = r0
        L20:
            r0 = r10
            r1 = r12
            boolean r0 = VertLeq(r0, r1)
            if (r0 != 0) goto L38
            r0 = r10
            r19 = r0
            r0 = r12
            r10 = r0
            r0 = r19
            r12 = r0
            r0 = r11
            r19 = r0
            r0 = r13
            r11 = r0
            r0 = r19
            r13 = r0
        L38:
            r0 = r12
            r1 = r11
            boolean r0 = VertLeq(r0, r1)
            if (r0 != 0) goto L55
            r0 = r14
            r1 = r12
            double r1 = r1.s
            r2 = r11
            double r2 = r2.s
            double r1 = r1 + r2
            r2 = 4611686018427387904(0x4000000000000000, double:2.0)
            double r1 = r1 / r2
            r0.s = r1
            goto Ld1
        L55:
            r0 = r11
            r1 = r13
            boolean r0 = VertLeq(r0, r1)
            if (r0 == 0) goto L98
            r0 = r10
            r1 = r12
            r2 = r11
            double r0 = EdgeEval(r0, r1, r2)
            r15 = r0
            r0 = r12
            r1 = r11
            r2 = r13
            double r0 = EdgeEval(r0, r1, r2)
            r17 = r0
            r0 = r15
            r1 = r17
            double r0 = r0 + r1
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 >= 0) goto L81
            r0 = r15
            double r0 = -r0
            r15 = r0
            r0 = r17
            double r0 = -r0
            r17 = r0
        L81:
            r0 = r14
            r1 = r15
            r2 = r12
            double r2 = r2.s
            r3 = r17
            r4 = r11
            double r4 = r4.s
            double r1 = Interpolate(r1, r2, r3, r4)
            r0.s = r1
            goto Ld1
        L98:
            r0 = r10
            r1 = r12
            r2 = r11
            double r0 = EdgeSign(r0, r1, r2)
            r15 = r0
            r0 = r10
            r1 = r13
            r2 = r11
            double r0 = EdgeSign(r0, r1, r2)
            double r0 = -r0
            r17 = r0
            r0 = r15
            r1 = r17
            double r0 = r0 + r1
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 >= 0) goto Lbd
            r0 = r15
            double r0 = -r0
            r15 = r0
            r0 = r17
            double r0 = -r0
            r17 = r0
        Lbd:
            r0 = r14
            r1 = r15
            r2 = r12
            double r2 = r2.s
            r3 = r17
            r4 = r13
            double r4 = r4.s
            double r1 = Interpolate(r1, r2, r3, r4)
            r0.s = r1
        Ld1:
            r0 = r10
            r1 = r11
            boolean r0 = TransLeq(r0, r1)
            if (r0 != 0) goto Le1
            r0 = r10
            r19 = r0
            r0 = r11
            r10 = r0
            r0 = r19
            r11 = r0
        Le1:
            r0 = r12
            r1 = r13
            boolean r0 = TransLeq(r0, r1)
            if (r0 != 0) goto Lf1
            r0 = r12
            r19 = r0
            r0 = r13
            r12 = r0
            r0 = r19
            r13 = r0
        Lf1:
            r0 = r10
            r1 = r12
            boolean r0 = TransLeq(r0, r1)
            if (r0 != 0) goto L109
            r0 = r12
            r19 = r0
            r0 = r10
            r12 = r0
            r0 = r19
            r10 = r0
            r0 = r13
            r19 = r0
            r0 = r11
            r13 = r0
            r0 = r19
            r11 = r0
        L109:
            r0 = r12
            r1 = r11
            boolean r0 = TransLeq(r0, r1)
            if (r0 != 0) goto L126
            r0 = r14
            r1 = r12
            double r1 = r1.t
            r2 = r11
            double r2 = r2.t
            double r1 = r1 + r2
            r2 = 4611686018427387904(0x4000000000000000, double:2.0)
            double r1 = r1 / r2
            r0.t = r1
            goto L1a2
        L126:
            r0 = r11
            r1 = r13
            boolean r0 = TransLeq(r0, r1)
            if (r0 == 0) goto L169
            r0 = r10
            r1 = r12
            r2 = r11
            double r0 = TransEval(r0, r1, r2)
            r15 = r0
            r0 = r12
            r1 = r11
            r2 = r13
            double r0 = TransEval(r0, r1, r2)
            r17 = r0
            r0 = r15
            r1 = r17
            double r0 = r0 + r1
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 >= 0) goto L152
            r0 = r15
            double r0 = -r0
            r15 = r0
            r0 = r17
            double r0 = -r0
            r17 = r0
        L152:
            r0 = r14
            r1 = r15
            r2 = r12
            double r2 = r2.t
            r3 = r17
            r4 = r11
            double r4 = r4.t
            double r1 = Interpolate(r1, r2, r3, r4)
            r0.t = r1
            goto L1a2
        L169:
            r0 = r10
            r1 = r12
            r2 = r11
            double r0 = TransSign(r0, r1, r2)
            r15 = r0
            r0 = r10
            r1 = r13
            r2 = r11
            double r0 = TransSign(r0, r1, r2)
            double r0 = -r0
            r17 = r0
            r0 = r15
            r1 = r17
            double r0 = r0 + r1
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 >= 0) goto L18e
            r0 = r15
            double r0 = -r0
            r15 = r0
            r0 = r17
            double r0 = -r0
            r17 = r0
        L18e:
            r0 = r14
            r1 = r15
            r2 = r12
            double r2 = r2.t
            r3 = r17
            r4 = r13
            double r4 = r4.t
            double r1 = Interpolate(r1, r2, r3, r4)
            r0.t = r1
        L1a2:
            return
    }

    static boolean VertEq(org.lwjgl.util.glu.tessellation.GLUvertex r5, org.lwjgl.util.glu.tessellation.GLUvertex r6) {
            r0 = r5
            double r0 = r0.s
            r1 = r6
            double r1 = r1.s
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto L1c
            r0 = r5
            double r0 = r0.t
            r1 = r6
            double r1 = r1.t
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto L1c
            r0 = 1
            goto L1d
        L1c:
            r0 = 0
        L1d:
            return r0
    }

    static boolean VertLeq(org.lwjgl.util.glu.tessellation.GLUvertex r5, org.lwjgl.util.glu.tessellation.GLUvertex r6) {
            r0 = r5
            double r0 = r0.s
            r1 = r6
            double r1 = r1.s
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 < 0) goto L24
            r0 = r5
            double r0 = r0.s
            r1 = r6
            double r1 = r1.s
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto L28
            r0 = r5
            double r0 = r0.t
            r1 = r6
            double r1 = r1.t
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 > 0) goto L28
        L24:
            r0 = 1
            goto L29
        L28:
            r0 = 0
        L29:
            return r0
    }

    static boolean TransLeq(org.lwjgl.util.glu.tessellation.GLUvertex r5, org.lwjgl.util.glu.tessellation.GLUvertex r6) {
            r0 = r5
            double r0 = r0.t
            r1 = r6
            double r1 = r1.t
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 < 0) goto L24
            r0 = r5
            double r0 = r0.t
            r1 = r6
            double r1 = r1.t
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto L28
            r0 = r5
            double r0 = r0.s
            r1 = r6
            double r1 = r1.s
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 > 0) goto L28
        L24:
            r0 = 1
            goto L29
        L28:
            r0 = 0
        L29:
            return r0
    }

    static boolean EdgeGoesLeft(org.lwjgl.util.glu.tessellation.GLUhalfEdge r3) {
            r0 = r3
            org.lwjgl.util.glu.tessellation.GLUhalfEdge r0 = r0.Sym
            org.lwjgl.util.glu.tessellation.GLUvertex r0 = r0.Org
            r1 = r3
            org.lwjgl.util.glu.tessellation.GLUvertex r1 = r1.Org
            boolean r0 = VertLeq(r0, r1)
            return r0
    }

    static boolean EdgeGoesRight(org.lwjgl.util.glu.tessellation.GLUhalfEdge r3) {
            r0 = r3
            org.lwjgl.util.glu.tessellation.GLUvertex r0 = r0.Org
            r1 = r3
            org.lwjgl.util.glu.tessellation.GLUhalfEdge r1 = r1.Sym
            org.lwjgl.util.glu.tessellation.GLUvertex r1 = r1.Org
            boolean r0 = VertLeq(r0, r1)
            return r0
    }

    static double VertL1dist(org.lwjgl.util.glu.tessellation.GLUvertex r7, org.lwjgl.util.glu.tessellation.GLUvertex r8) {
            r0 = r7
            double r0 = r0.s
            r1 = r8
            double r1 = r1.s
            double r0 = r0 - r1
            double r0 = java.lang.Math.abs(r0)
            r1 = r7
            double r1 = r1.t
            r2 = r8
            double r2 = r2.t
            double r1 = r1 - r2
            double r1 = java.lang.Math.abs(r1)
            double r0 = r0 + r1
            return r0
    }

    static {
            java.lang.Class<org.lwjgl.util.glu.tessellation.Geom> r0 = org.lwjgl.util.glu.tessellation.Geom.class
            boolean r0 = r0.desiredAssertionStatus()
            if (r0 != 0) goto Lc
            r0 = 1
            goto Ld
        Lc:
            r0 = 0
        Ld:
            org.lwjgl.util.glu.tessellation.Geom.$assertionsDisabled = r0
            return
    }
}
