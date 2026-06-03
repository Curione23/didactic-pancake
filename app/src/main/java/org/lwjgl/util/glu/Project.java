package org.lwjgl.util.glu;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/util/glu/Project.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/util/glu/Project.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/util/glu/Project.class */
public class Project extends org.lwjgl.util.glu.Util {
    private static final float[] IDENTITY_MATRIX = null;
    private static final java.nio.FloatBuffer matrix = null;
    private static final java.nio.FloatBuffer finalMatrix = null;
    private static final java.nio.FloatBuffer tempMatrix = null;
    private static final float[] in = null;
    private static final float[] out = null;
    private static final float[] forward = null;
    private static final float[] side = null;
    private static final float[] up = null;

    public Project() {
            r2 = this;
            r0 = r2
            r0.<init>()
            return
    }

    private static void __gluMakeIdentityf(java.nio.FloatBuffer r3) {
            r0 = r3
            int r0 = r0.position()
            r4 = r0
            r0 = r3
            float[] r1 = org.lwjgl.util.glu.Project.IDENTITY_MATRIX
            java.nio.FloatBuffer r0 = r0.put(r1)
            r0 = r3
            r1 = r4
            java.nio.Buffer r0 = r0.position(r1)
            return
    }

    private static void __gluMultMatrixVecf(java.nio.FloatBuffer r8, float[] r9, float[] r10) {
            r0 = 0
            r11 = r0
        L2:
            r0 = r11
            r1 = 4
            if (r0 >= r1) goto L55
            r0 = r10
            r1 = r11
            r2 = r9
            r3 = 0
            r2 = r2[r3]
            r3 = r8
            r4 = r8
            int r4 = r4.position()
            r5 = 0
            int r4 = r4 + r5
            r5 = r11
            int r4 = r4 + r5
            float r3 = r3.get(r4)
            float r2 = r2 * r3
            r3 = r9
            r4 = 1
            r3 = r3[r4]
            r4 = r8
            r5 = r8
            int r5 = r5.position()
            r6 = 4
            int r5 = r5 + r6
            r6 = r11
            int r5 = r5 + r6
            float r4 = r4.get(r5)
            float r3 = r3 * r4
            float r2 = r2 + r3
            r3 = r9
            r4 = 2
            r3 = r3[r4]
            r4 = r8
            r5 = r8
            int r5 = r5.position()
            r6 = 8
            int r5 = r5 + r6
            r6 = r11
            int r5 = r5 + r6
            float r4 = r4.get(r5)
            float r3 = r3 * r4
            float r2 = r2 + r3
            r3 = r9
            r4 = 3
            r3 = r3[r4]
            r4 = r8
            r5 = r8
            int r5 = r5.position()
            r6 = 12
            int r5 = r5 + r6
            r6 = r11
            int r5 = r5 + r6
            float r4 = r4.get(r5)
            float r3 = r3 * r4
            float r2 = r2 + r3
            r0[r1] = r2
            int r11 = r11 + 1
            goto L2
        L55:
            return
    }

    private static boolean __gluInvertMatrixf(java.nio.FloatBuffer r7, java.nio.FloatBuffer r8) {
            java.nio.FloatBuffer r0 = org.lwjgl.util.glu.Project.tempMatrix
            r14 = r0
            r0 = 0
            r9 = r0
        L7:
            r0 = r9
            r1 = 16
            if (r0 >= r1) goto L24
            r0 = r14
            r1 = r9
            r2 = r7
            r3 = r9
            r4 = r7
            int r4 = r4.position()
            int r3 = r3 + r4
            float r2 = r2.get(r3)
            java.nio.FloatBuffer r0 = r0.put(r1, r2)
            int r9 = r9 + 1
            goto L7
        L24:
            r0 = r8
            __gluMakeIdentityf(r0)
            r0 = 0
            r9 = r0
        L2a:
            r0 = r9
            r1 = 4
            if (r0 >= r1) goto L1b5
            r0 = r9
            r12 = r0
            r0 = r9
            r1 = 1
            int r0 = r0 + r1
            r10 = r0
        L36:
            r0 = r10
            r1 = 4
            if (r0 >= r1) goto L62
            r0 = r14
            r1 = r10
            r2 = 4
            int r1 = r1 * r2
            r2 = r9
            int r1 = r1 + r2
            float r0 = r0.get(r1)
            float r0 = java.lang.Math.abs(r0)
            r1 = r14
            r2 = r9
            r3 = 4
            int r2 = r2 * r3
            r3 = r9
            int r2 = r2 + r3
            float r1 = r1.get(r2)
            float r1 = java.lang.Math.abs(r1)
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 <= 0) goto L5c
            r0 = r10
            r12 = r0
        L5c:
            int r10 = r10 + 1
            goto L36
        L62:
            r0 = r12
            r1 = r9
            if (r0 == r1) goto Ldb
            r0 = 0
            r11 = r0
        L6b:
            r0 = r11
            r1 = 4
            if (r0 >= r1) goto Ldb
            r0 = r14
            r1 = r9
            r2 = 4
            int r1 = r1 * r2
            r2 = r11
            int r1 = r1 + r2
            float r0 = r0.get(r1)
            r13 = r0
            r0 = r14
            r1 = r9
            r2 = 4
            int r1 = r1 * r2
            r2 = r11
            int r1 = r1 + r2
            r2 = r14
            r3 = r12
            r4 = 4
            int r3 = r3 * r4
            r4 = r11
            int r3 = r3 + r4
            float r2 = r2.get(r3)
            java.nio.FloatBuffer r0 = r0.put(r1, r2)
            r0 = r14
            r1 = r12
            r2 = 4
            int r1 = r1 * r2
            r2 = r11
            int r1 = r1 + r2
            r2 = r13
            java.nio.FloatBuffer r0 = r0.put(r1, r2)
            r0 = r8
            r1 = r9
            r2 = 4
            int r1 = r1 * r2
            r2 = r11
            int r1 = r1 + r2
            float r0 = r0.get(r1)
            r13 = r0
            r0 = r8
            r1 = r9
            r2 = 4
            int r1 = r1 * r2
            r2 = r11
            int r1 = r1 + r2
            r2 = r8
            r3 = r12
            r4 = 4
            int r3 = r3 * r4
            r4 = r11
            int r3 = r3 + r4
            float r2 = r2.get(r3)
            java.nio.FloatBuffer r0 = r0.put(r1, r2)
            r0 = r8
            r1 = r12
            r2 = 4
            int r1 = r1 * r2
            r2 = r11
            int r1 = r1 + r2
            r2 = r13
            java.nio.FloatBuffer r0 = r0.put(r1, r2)
            int r11 = r11 + 1
            goto L6b
        Ldb:
            r0 = r14
            r1 = r9
            r2 = 4
            int r1 = r1 * r2
            r2 = r9
            int r1 = r1 + r2
            float r0 = r0.get(r1)
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto Lec
            r0 = 0
            return r0
        Lec:
            r0 = r14
            r1 = r9
            r2 = 4
            int r1 = r1 * r2
            r2 = r9
            int r1 = r1 + r2
            float r0 = r0.get(r1)
            r13 = r0
            r0 = 0
            r11 = r0
        Lfb:
            r0 = r11
            r1 = 4
            if (r0 >= r1) goto L139
            r0 = r14
            r1 = r9
            r2 = 4
            int r1 = r1 * r2
            r2 = r11
            int r1 = r1 + r2
            r2 = r14
            r3 = r9
            r4 = 4
            int r3 = r3 * r4
            r4 = r11
            int r3 = r3 + r4
            float r2 = r2.get(r3)
            r3 = r13
            float r2 = r2 / r3
            java.nio.FloatBuffer r0 = r0.put(r1, r2)
            r0 = r8
            r1 = r9
            r2 = 4
            int r1 = r1 * r2
            r2 = r11
            int r1 = r1 + r2
            r2 = r8
            r3 = r9
            r4 = 4
            int r3 = r3 * r4
            r4 = r11
            int r3 = r3 + r4
            float r2 = r2.get(r3)
            r3 = r13
            float r2 = r2 / r3
            java.nio.FloatBuffer r0 = r0.put(r1, r2)
            int r11 = r11 + 1
            goto Lfb
        L139:
            r0 = 0
            r10 = r0
        L13b:
            r0 = r10
            r1 = 4
            if (r0 >= r1) goto L1af
            r0 = r10
            r1 = r9
            if (r0 == r1) goto L1a9
            r0 = r14
            r1 = r10
            r2 = 4
            int r1 = r1 * r2
            r2 = r9
            int r1 = r1 + r2
            float r0 = r0.get(r1)
            r13 = r0
            r0 = 0
            r11 = r0
        L154:
            r0 = r11
            r1 = 4
            if (r0 >= r1) goto L1a9
            r0 = r14
            r1 = r10
            r2 = 4
            int r1 = r1 * r2
            r2 = r11
            int r1 = r1 + r2
            r2 = r14
            r3 = r10
            r4 = 4
            int r3 = r3 * r4
            r4 = r11
            int r3 = r3 + r4
            float r2 = r2.get(r3)
            r3 = r14
            r4 = r9
            r5 = 4
            int r4 = r4 * r5
            r5 = r11
            int r4 = r4 + r5
            float r3 = r3.get(r4)
            r4 = r13
            float r3 = r3 * r4
            float r2 = r2 - r3
            java.nio.FloatBuffer r0 = r0.put(r1, r2)
            r0 = r8
            r1 = r10
            r2 = 4
            int r1 = r1 * r2
            r2 = r11
            int r1 = r1 + r2
            r2 = r8
            r3 = r10
            r4 = 4
            int r3 = r3 * r4
            r4 = r11
            int r3 = r3 + r4
            float r2 = r2.get(r3)
            r3 = r8
            r4 = r9
            r5 = 4
            int r4 = r4 * r5
            r5 = r11
            int r4 = r4 + r5
            float r3 = r3.get(r4)
            r4 = r13
            float r3 = r3 * r4
            float r2 = r2 - r3
            java.nio.FloatBuffer r0 = r0.put(r1, r2)
            int r11 = r11 + 1
            goto L154
        L1a9:
            int r10 = r10 + 1
            goto L13b
        L1af:
            int r9 = r9 + 1
            goto L2a
        L1b5:
            r0 = 1
            return r0
    }

    private static void __gluMultMatricesf(java.nio.FloatBuffer r8, java.nio.FloatBuffer r9, java.nio.FloatBuffer r10) {
            r0 = 0
            r11 = r0
        L2:
            r0 = r11
            r1 = 4
            if (r0 >= r1) goto La1
            r0 = 0
            r12 = r0
        La:
            r0 = r12
            r1 = 4
            if (r0 >= r1) goto L9b
            r0 = r10
            r1 = r10
            int r1 = r1.position()
            r2 = r11
            r3 = 4
            int r2 = r2 * r3
            int r1 = r1 + r2
            r2 = r12
            int r1 = r1 + r2
            r2 = r8
            r3 = r8
            int r3 = r3.position()
            r4 = r11
            r5 = 4
            int r4 = r4 * r5
            int r3 = r3 + r4
            r4 = 0
            int r3 = r3 + r4
            float r2 = r2.get(r3)
            r3 = r9
            r4 = r9
            int r4 = r4.position()
            r5 = 0
            int r4 = r4 + r5
            r5 = r12
            int r4 = r4 + r5
            float r3 = r3.get(r4)
            float r2 = r2 * r3
            r3 = r8
            r4 = r8
            int r4 = r4.position()
            r5 = r11
            r6 = 4
            int r5 = r5 * r6
            int r4 = r4 + r5
            r5 = 1
            int r4 = r4 + r5
            float r3 = r3.get(r4)
            r4 = r9
            r5 = r9
            int r5 = r5.position()
            r6 = 4
            int r5 = r5 + r6
            r6 = r12
            int r5 = r5 + r6
            float r4 = r4.get(r5)
            float r3 = r3 * r4
            float r2 = r2 + r3
            r3 = r8
            r4 = r8
            int r4 = r4.position()
            r5 = r11
            r6 = 4
            int r5 = r5 * r6
            int r4 = r4 + r5
            r5 = 2
            int r4 = r4 + r5
            float r3 = r3.get(r4)
            r4 = r9
            r5 = r9
            int r5 = r5.position()
            r6 = 8
            int r5 = r5 + r6
            r6 = r12
            int r5 = r5 + r6
            float r4 = r4.get(r5)
            float r3 = r3 * r4
            float r2 = r2 + r3
            r3 = r8
            r4 = r8
            int r4 = r4.position()
            r5 = r11
            r6 = 4
            int r5 = r5 * r6
            int r4 = r4 + r5
            r5 = 3
            int r4 = r4 + r5
            float r3 = r3.get(r4)
            r4 = r9
            r5 = r9
            int r5 = r5.position()
            r6 = 12
            int r5 = r5 + r6
            r6 = r12
            int r5 = r5 + r6
            float r4 = r4.get(r5)
            float r3 = r3 * r4
            float r2 = r2 + r3
            java.nio.FloatBuffer r0 = r0.put(r1, r2)
            int r12 = r12 + 1
            goto La
        L9b:
            int r11 = r11 + 1
            goto L2
        La1:
            return
    }

    public static void gluPerspective(float r5, float r6, float r7, float r8) {
            r0 = r5
            r1 = 1073741824(0x40000000, float:2.0)
            float r0 = r0 / r1
            r1 = 1078530011(0x40490fdb, float:3.1415927)
            float r0 = r0 * r1
            r1 = 1127481344(0x43340000, float:180.0)
            float r0 = r0 / r1
            r12 = r0
            r0 = r8
            r1 = r7
            float r0 = r0 - r1
            r11 = r0
            r0 = r12
            double r0 = (double) r0
            double r0 = java.lang.Math.sin(r0)
            float r0 = (float) r0
            r9 = r0
            r0 = r11
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto L2d
            r0 = r9
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto L2d
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto L2e
        L2d:
            return
        L2e:
            r0 = r12
            double r0 = (double) r0
            double r0 = java.lang.Math.cos(r0)
            float r0 = (float) r0
            r1 = r9
            float r0 = r0 / r1
            r10 = r0
            java.nio.FloatBuffer r0 = org.lwjgl.util.glu.Project.matrix
            __gluMakeIdentityf(r0)
            java.nio.FloatBuffer r0 = org.lwjgl.util.glu.Project.matrix
            r1 = 0
            r2 = r10
            r3 = r6
            float r2 = r2 / r3
            java.nio.FloatBuffer r0 = r0.put(r1, r2)
            java.nio.FloatBuffer r0 = org.lwjgl.util.glu.Project.matrix
            r1 = 5
            r2 = r10
            java.nio.FloatBuffer r0 = r0.put(r1, r2)
            java.nio.FloatBuffer r0 = org.lwjgl.util.glu.Project.matrix
            r1 = 10
            r2 = r8
            r3 = r7
            float r2 = r2 + r3
            float r2 = -r2
            r3 = r11
            float r2 = r2 / r3
            java.nio.FloatBuffer r0 = r0.put(r1, r2)
            java.nio.FloatBuffer r0 = org.lwjgl.util.glu.Project.matrix
            r1 = 11
            r2 = -1082130432(0xffffffffbf800000, float:-1.0)
            java.nio.FloatBuffer r0 = r0.put(r1, r2)
            java.nio.FloatBuffer r0 = org.lwjgl.util.glu.Project.matrix
            r1 = 14
            r2 = -1073741824(0xffffffffc0000000, float:-2.0)
            r3 = r7
            float r2 = r2 * r3
            r3 = r8
            float r2 = r2 * r3
            r3 = r11
            float r2 = r2 / r3
            java.nio.FloatBuffer r0 = r0.put(r1, r2)
            java.nio.FloatBuffer r0 = org.lwjgl.util.glu.Project.matrix
            r1 = 15
            r2 = 0
            java.nio.FloatBuffer r0 = r0.put(r1, r2)
            java.nio.FloatBuffer r0 = org.lwjgl.util.glu.Project.matrix
            org.lwjgl.opengl.GL11.glMultMatrixf(r0)
            return
    }

    public static void gluLookAt(float r5, float r6, float r7, float r8, float r9, float r10, float r11, float r12, float r13) {
            float[] r0 = org.lwjgl.util.glu.Project.forward
            r14 = r0
            float[] r0 = org.lwjgl.util.glu.Project.side
            r15 = r0
            float[] r0 = org.lwjgl.util.glu.Project.up
            r16 = r0
            r0 = r14
            r1 = 0
            r2 = r8
            r3 = r5
            float r2 = r2 - r3
            r0[r1] = r2
            r0 = r14
            r1 = 1
            r2 = r9
            r3 = r6
            float r2 = r2 - r3
            r0[r1] = r2
            r0 = r14
            r1 = 2
            r2 = r10
            r3 = r7
            float r2 = r2 - r3
            r0[r1] = r2
            r0 = r16
            r1 = 0
            r2 = r11
            r0[r1] = r2
            r0 = r16
            r1 = 1
            r2 = r12
            r0[r1] = r2
            r0 = r16
            r1 = 2
            r2 = r13
            r0[r1] = r2
            r0 = r14
            float[] r0 = normalize(r0)
            r0 = r14
            r1 = r16
            r2 = r15
            cross(r0, r1, r2)
            r0 = r15
            float[] r0 = normalize(r0)
            r0 = r15
            r1 = r14
            r2 = r16
            cross(r0, r1, r2)
            java.nio.FloatBuffer r0 = org.lwjgl.util.glu.Project.matrix
            __gluMakeIdentityf(r0)
            java.nio.FloatBuffer r0 = org.lwjgl.util.glu.Project.matrix
            r1 = 0
            r2 = r15
            r3 = 0
            r2 = r2[r3]
            java.nio.FloatBuffer r0 = r0.put(r1, r2)
            java.nio.FloatBuffer r0 = org.lwjgl.util.glu.Project.matrix
            r1 = 4
            r2 = r15
            r3 = 1
            r2 = r2[r3]
            java.nio.FloatBuffer r0 = r0.put(r1, r2)
            java.nio.FloatBuffer r0 = org.lwjgl.util.glu.Project.matrix
            r1 = 8
            r2 = r15
            r3 = 2
            r2 = r2[r3]
            java.nio.FloatBuffer r0 = r0.put(r1, r2)
            java.nio.FloatBuffer r0 = org.lwjgl.util.glu.Project.matrix
            r1 = 1
            r2 = r16
            r3 = 0
            r2 = r2[r3]
            java.nio.FloatBuffer r0 = r0.put(r1, r2)
            java.nio.FloatBuffer r0 = org.lwjgl.util.glu.Project.matrix
            r1 = 5
            r2 = r16
            r3 = 1
            r2 = r2[r3]
            java.nio.FloatBuffer r0 = r0.put(r1, r2)
            java.nio.FloatBuffer r0 = org.lwjgl.util.glu.Project.matrix
            r1 = 9
            r2 = r16
            r3 = 2
            r2 = r2[r3]
            java.nio.FloatBuffer r0 = r0.put(r1, r2)
            java.nio.FloatBuffer r0 = org.lwjgl.util.glu.Project.matrix
            r1 = 2
            r2 = r14
            r3 = 0
            r2 = r2[r3]
            float r2 = -r2
            java.nio.FloatBuffer r0 = r0.put(r1, r2)
            java.nio.FloatBuffer r0 = org.lwjgl.util.glu.Project.matrix
            r1 = 6
            r2 = r14
            r3 = 1
            r2 = r2[r3]
            float r2 = -r2
            java.nio.FloatBuffer r0 = r0.put(r1, r2)
            java.nio.FloatBuffer r0 = org.lwjgl.util.glu.Project.matrix
            r1 = 10
            r2 = r14
            r3 = 2
            r2 = r2[r3]
            float r2 = -r2
            java.nio.FloatBuffer r0 = r0.put(r1, r2)
            java.nio.FloatBuffer r0 = org.lwjgl.util.glu.Project.matrix
            org.lwjgl.opengl.GL11.glMultMatrixf(r0)
            r0 = r5
            float r0 = -r0
            r1 = r6
            float r1 = -r1
            r2 = r7
            float r2 = -r2
            org.lwjgl.opengl.GL11.glTranslatef(r0, r1, r2)
            return
    }

    public static boolean gluProject(float r7, float r8, float r9, java.nio.FloatBuffer r10, java.nio.FloatBuffer r11, java.nio.IntBuffer r12, java.nio.FloatBuffer r13) {
            float[] r0 = org.lwjgl.util.glu.Project.in
            r14 = r0
            float[] r0 = org.lwjgl.util.glu.Project.out
            r15 = r0
            r0 = r14
            r1 = 0
            r2 = r7
            r0[r1] = r2
            r0 = r14
            r1 = 1
            r2 = r8
            r0[r1] = r2
            r0 = r14
            r1 = 2
            r2 = r9
            r0[r1] = r2
            r0 = r14
            r1 = 3
            r2 = 1065353216(0x3f800000, float:1.0)
            r0[r1] = r2
            r0 = r10
            r1 = r14
            r2 = r15
            __gluMultMatrixVecf(r0, r1, r2)
            r0 = r11
            r1 = r15
            r2 = r14
            __gluMultMatrixVecf(r0, r1, r2)
            r0 = r14
            r1 = 3
            r0 = r0[r1]
            double r0 = (double) r0
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto L3b
            r0 = 0
            return r0
        L3b:
            r0 = r14
            r1 = 3
            r2 = 1065353216(0x3f800000, float:1.0)
            r3 = r14
            r4 = 3
            r3 = r3[r4]
            float r2 = r2 / r3
            r3 = 1056964608(0x3f000000, float:0.5)
            float r2 = r2 * r3
            r0[r1] = r2
            r0 = r14
            r1 = 0
            r2 = r14
            r3 = 0
            r2 = r2[r3]
            r3 = r14
            r4 = 3
            r3 = r3[r4]
            float r2 = r2 * r3
            r3 = 1056964608(0x3f000000, float:0.5)
            float r2 = r2 + r3
            r0[r1] = r2
            r0 = r14
            r1 = 1
            r2 = r14
            r3 = 1
            r2 = r2[r3]
            r3 = r14
            r4 = 3
            r3 = r3[r4]
            float r2 = r2 * r3
            r3 = 1056964608(0x3f000000, float:0.5)
            float r2 = r2 + r3
            r0[r1] = r2
            r0 = r14
            r1 = 2
            r2 = r14
            r3 = 2
            r2 = r2[r3]
            r3 = r14
            r4 = 3
            r3 = r3[r4]
            float r2 = r2 * r3
            r3 = 1056964608(0x3f000000, float:0.5)
            float r2 = r2 + r3
            r0[r1] = r2
            r0 = r13
            r1 = 0
            r2 = r14
            r3 = 0
            r2 = r2[r3]
            r3 = r12
            r4 = r12
            int r4 = r4.position()
            r5 = 2
            int r4 = r4 + r5
            int r3 = r3.get(r4)
            float r3 = (float) r3
            float r2 = r2 * r3
            r3 = r12
            r4 = r12
            int r4 = r4.position()
            r5 = 0
            int r4 = r4 + r5
            int r3 = r3.get(r4)
            float r3 = (float) r3
            float r2 = r2 + r3
            java.nio.FloatBuffer r0 = r0.put(r1, r2)
            r0 = r13
            r1 = 1
            r2 = r14
            r3 = 1
            r2 = r2[r3]
            r3 = r12
            r4 = r12
            int r4 = r4.position()
            r5 = 3
            int r4 = r4 + r5
            int r3 = r3.get(r4)
            float r3 = (float) r3
            float r2 = r2 * r3
            r3 = r12
            r4 = r12
            int r4 = r4.position()
            r5 = 1
            int r4 = r4 + r5
            int r3 = r3.get(r4)
            float r3 = (float) r3
            float r2 = r2 + r3
            java.nio.FloatBuffer r0 = r0.put(r1, r2)
            r0 = r13
            r1 = 2
            r2 = r14
            r3 = 2
            r2 = r2[r3]
            java.nio.FloatBuffer r0 = r0.put(r1, r2)
            r0 = 1
            return r0
    }

    public static boolean gluUnProject(float r7, float r8, float r9, java.nio.FloatBuffer r10, java.nio.FloatBuffer r11, java.nio.IntBuffer r12, java.nio.FloatBuffer r13) {
            float[] r0 = org.lwjgl.util.glu.Project.in
            r14 = r0
            float[] r0 = org.lwjgl.util.glu.Project.out
            r15 = r0
            r0 = r10
            r1 = r11
            java.nio.FloatBuffer r2 = org.lwjgl.util.glu.Project.finalMatrix
            __gluMultMatricesf(r0, r1, r2)
            java.nio.FloatBuffer r0 = org.lwjgl.util.glu.Project.finalMatrix
            java.nio.FloatBuffer r1 = org.lwjgl.util.glu.Project.finalMatrix
            boolean r0 = __gluInvertMatrixf(r0, r1)
            if (r0 != 0) goto L21
            r0 = 0
            return r0
        L21:
            r0 = r14
            r1 = 0
            r2 = r7
            r0[r1] = r2
            r0 = r14
            r1 = 1
            r2 = r8
            r0[r1] = r2
            r0 = r14
            r1 = 2
            r2 = r9
            r0[r1] = r2
            r0 = r14
            r1 = 3
            r2 = 1065353216(0x3f800000, float:1.0)
            r0[r1] = r2
            r0 = r14
            r1 = 0
            r2 = r14
            r3 = 0
            r2 = r2[r3]
            r3 = r12
            r4 = r12
            int r4 = r4.position()
            r5 = 0
            int r4 = r4 + r5
            int r3 = r3.get(r4)
            float r3 = (float) r3
            float r2 = r2 - r3
            r3 = r12
            r4 = r12
            int r4 = r4.position()
            r5 = 2
            int r4 = r4 + r5
            int r3 = r3.get(r4)
            float r3 = (float) r3
            float r2 = r2 / r3
            r0[r1] = r2
            r0 = r14
            r1 = 1
            r2 = r14
            r3 = 1
            r2 = r2[r3]
            r3 = r12
            r4 = r12
            int r4 = r4.position()
            r5 = 1
            int r4 = r4 + r5
            int r3 = r3.get(r4)
            float r3 = (float) r3
            float r2 = r2 - r3
            r3 = r12
            r4 = r12
            int r4 = r4.position()
            r5 = 3
            int r4 = r4 + r5
            int r3 = r3.get(r4)
            float r3 = (float) r3
            float r2 = r2 / r3
            r0[r1] = r2
            r0 = r14
            r1 = 0
            r2 = r14
            r3 = 0
            r2 = r2[r3]
            r3 = 1073741824(0x40000000, float:2.0)
            float r2 = r2 * r3
            r3 = 1065353216(0x3f800000, float:1.0)
            float r2 = r2 - r3
            r0[r1] = r2
            r0 = r14
            r1 = 1
            r2 = r14
            r3 = 1
            r2 = r2[r3]
            r3 = 1073741824(0x40000000, float:2.0)
            float r2 = r2 * r3
            r3 = 1065353216(0x3f800000, float:1.0)
            float r2 = r2 - r3
            r0[r1] = r2
            r0 = r14
            r1 = 2
            r2 = r14
            r3 = 2
            r2 = r2[r3]
            r3 = 1073741824(0x40000000, float:2.0)
            float r2 = r2 * r3
            r3 = 1065353216(0x3f800000, float:1.0)
            float r2 = r2 - r3
            r0[r1] = r2
            java.nio.FloatBuffer r0 = org.lwjgl.util.glu.Project.finalMatrix
            r1 = r14
            r2 = r15
            __gluMultMatrixVecf(r0, r1, r2)
            r0 = r15
            r1 = 3
            r0 = r0[r1]
            double r0 = (double) r0
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto Lb7
            r0 = 0
            return r0
        Lb7:
            r0 = r15
            r1 = 3
            r2 = 1065353216(0x3f800000, float:1.0)
            r3 = r15
            r4 = 3
            r3 = r3[r4]
            float r2 = r2 / r3
            r0[r1] = r2
            r0 = r13
            r1 = r13
            int r1 = r1.position()
            r2 = 0
            int r1 = r1 + r2
            r2 = r15
            r3 = 0
            r2 = r2[r3]
            r3 = r15
            r4 = 3
            r3 = r3[r4]
            float r2 = r2 * r3
            java.nio.FloatBuffer r0 = r0.put(r1, r2)
            r0 = r13
            r1 = r13
            int r1 = r1.position()
            r2 = 1
            int r1 = r1 + r2
            r2 = r15
            r3 = 1
            r2 = r2[r3]
            r3 = r15
            r4 = 3
            r3 = r3[r4]
            float r2 = r2 * r3
            java.nio.FloatBuffer r0 = r0.put(r1, r2)
            r0 = r13
            r1 = r13
            int r1 = r1.position()
            r2 = 2
            int r1 = r1 + r2
            r2 = r15
            r3 = 2
            r2 = r2[r3]
            r3 = r15
            r4 = 3
            r3 = r3[r4]
            float r2 = r2 * r3
            java.nio.FloatBuffer r0 = r0.put(r1, r2)
            r0 = 1
            return r0
    }

    public static void gluPickMatrix(float r8, float r9, float r10, float r11, java.nio.IntBuffer r12) {
            r0 = r10
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 <= 0) goto Lc
            r0 = r11
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 > 0) goto Ld
        Lc:
            return
        Ld:
            r0 = r12
            r1 = r12
            int r1 = r1.position()
            r2 = 2
            int r1 = r1 + r2
            int r0 = r0.get(r1)
            float r0 = (float) r0
            r1 = 1073741824(0x40000000, float:2.0)
            r2 = r8
            r3 = r12
            r4 = r12
            int r4 = r4.position()
            r5 = 0
            int r4 = r4 + r5
            int r3 = r3.get(r4)
            float r3 = (float) r3
            float r2 = r2 - r3
            float r1 = r1 * r2
            float r0 = r0 - r1
            r1 = r10
            float r0 = r0 / r1
            r1 = r12
            r2 = r12
            int r2 = r2.position()
            r3 = 3
            int r2 = r2 + r3
            int r1 = r1.get(r2)
            float r1 = (float) r1
            r2 = 1073741824(0x40000000, float:2.0)
            r3 = r9
            r4 = r12
            r5 = r12
            int r5 = r5.position()
            r6 = 1
            int r5 = r5 + r6
            int r4 = r4.get(r5)
            float r4 = (float) r4
            float r3 = r3 - r4
            float r2 = r2 * r3
            float r1 = r1 - r2
            r2 = r11
            float r1 = r1 / r2
            r2 = 0
            org.lwjgl.opengl.GL11.glTranslatef(r0, r1, r2)
            r0 = r12
            r1 = r12
            int r1 = r1.position()
            r2 = 2
            int r1 = r1 + r2
            int r0 = r0.get(r1)
            float r0 = (float) r0
            r1 = r10
            float r0 = r0 / r1
            r1 = r12
            r2 = r12
            int r2 = r2.position()
            r3 = 3
            int r2 = r2 + r3
            int r1 = r1.get(r2)
            float r1 = (float) r1
            r2 = r11
            float r1 = r1 / r2
            r2 = 1065353216(0x3f800000, float:1.0)
            org.lwjgl.opengl.GL11.glScalef(r0, r1, r2)
            return
    }

    static {
            r0 = 16
            float[] r0 = new float[r0]
            r1 = r0
            r2 = 0
            r3 = 1065353216(0x3f800000, float:1.0)
            r1[r2] = r3
            r1 = r0
            r2 = 1
            r3 = 0
            r1[r2] = r3
            r1 = r0
            r2 = 2
            r3 = 0
            r1[r2] = r3
            r1 = r0
            r2 = 3
            r3 = 0
            r1[r2] = r3
            r1 = r0
            r2 = 4
            r3 = 0
            r1[r2] = r3
            r1 = r0
            r2 = 5
            r3 = 1065353216(0x3f800000, float:1.0)
            r1[r2] = r3
            r1 = r0
            r2 = 6
            r3 = 0
            r1[r2] = r3
            r1 = r0
            r2 = 7
            r3 = 0
            r1[r2] = r3
            r1 = r0
            r2 = 8
            r3 = 0
            r1[r2] = r3
            r1 = r0
            r2 = 9
            r3 = 0
            r1[r2] = r3
            r1 = r0
            r2 = 10
            r3 = 1065353216(0x3f800000, float:1.0)
            r1[r2] = r3
            r1 = r0
            r2 = 11
            r3 = 0
            r1[r2] = r3
            r1 = r0
            r2 = 12
            r3 = 0
            r1[r2] = r3
            r1 = r0
            r2 = 13
            r3 = 0
            r1[r2] = r3
            r1 = r0
            r2 = 14
            r3 = 0
            r1[r2] = r3
            r1 = r0
            r2 = 15
            r3 = 1065353216(0x3f800000, float:1.0)
            r1[r2] = r3
            org.lwjgl.util.glu.Project.IDENTITY_MATRIX = r0
            r0 = 16
            java.nio.FloatBuffer r0 = org.lwjgl.BufferUtils.createFloatBuffer(r0)
            org.lwjgl.util.glu.Project.matrix = r0
            r0 = 16
            java.nio.FloatBuffer r0 = org.lwjgl.BufferUtils.createFloatBuffer(r0)
            org.lwjgl.util.glu.Project.finalMatrix = r0
            r0 = 16
            java.nio.FloatBuffer r0 = org.lwjgl.BufferUtils.createFloatBuffer(r0)
            org.lwjgl.util.glu.Project.tempMatrix = r0
            r0 = 4
            float[] r0 = new float[r0]
            org.lwjgl.util.glu.Project.in = r0
            r0 = 4
            float[] r0 = new float[r0]
            org.lwjgl.util.glu.Project.out = r0
            r0 = 3
            float[] r0 = new float[r0]
            org.lwjgl.util.glu.Project.forward = r0
            r0 = 3
            float[] r0 = new float[r0]
            org.lwjgl.util.glu.Project.side = r0
            r0 = 3
            float[] r0 = new float[r0]
            org.lwjgl.util.glu.Project.up = r0
            return
    }
}
