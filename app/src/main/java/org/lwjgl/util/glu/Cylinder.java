package org.lwjgl.util.glu;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/util/glu/Cylinder.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/util/glu/Cylinder.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/util/glu/Cylinder.class */
public class Cylinder extends org.lwjgl.util.glu.Quadric {
    public Cylinder() {
            r2 = this;
            r0 = r2
            r0.<init>()
            return
    }

    public void draw(float r7, float r8, float r9, int r10, int r11) {
            r6 = this;
            r0 = r6
            int r0 = r0.orientation
            r1 = 100021(0x186b5, float:1.40159E-40)
            if (r0 != r1) goto L10
            r0 = -1082130432(0xffffffffbf800000, float:-1.0)
            r20 = r0
            goto L13
        L10:
            r0 = 1065353216(0x3f800000, float:1.0)
            r20 = r0
        L13:
            r0 = 1086918619(0x40c90fdb, float:6.2831855)
            r1 = r10
            float r1 = (float) r1
            float r0 = r0 / r1
            r12 = r0
            r0 = r8
            r1 = r7
            float r0 = r0 - r1
            r1 = r11
            float r1 = (float) r1
            float r0 = r0 / r1
            r14 = r0
            r0 = r9
            r1 = r11
            float r1 = (float) r1
            float r0 = r0 / r1
            r15 = r0
            r0 = r7
            r1 = r8
            float r0 = r0 - r1
            r1 = r9
            float r0 = r0 / r1
            r19 = r0
            r0 = r6
            int r0 = r0.drawStyle
            r1 = 100010(0x186aa, float:1.40144E-40)
            if (r0 != r1) goto Lb3
            r0 = 0
            org.lwjgl.opengl.GL11.glBegin(r0)
            r0 = 0
            r21 = r0
        L42:
            r0 = r21
            r1 = r10
            if (r0 >= r1) goto Lad
            r0 = r6
            r1 = r21
            float r1 = (float) r1
            r2 = r12
            float r1 = r1 * r2
            float r0 = r0.cos(r1)
            r16 = r0
            r0 = r6
            r1 = r21
            float r1 = (float) r1
            r2 = r12
            float r1 = r1 * r2
            float r0 = r0.sin(r1)
            r17 = r0
            r0 = r6
            r1 = r16
            r2 = r20
            float r1 = r1 * r2
            r2 = r17
            r3 = r20
            float r2 = r2 * r3
            r3 = r19
            r4 = r20
            float r3 = r3 * r4
            r0.normal3f(r1, r2, r3)
            r0 = 0
            r18 = r0
            r0 = r7
            r13 = r0
            r0 = 0
            r22 = r0
        L7d:
            r0 = r22
            r1 = r11
            if (r0 > r1) goto La7
            r0 = r16
            r1 = r13
            float r0 = r0 * r1
            r1 = r17
            r2 = r13
            float r1 = r1 * r2
            r2 = r18
            org.lwjgl.opengl.GL11.glVertex3f(r0, r1, r2)
            r0 = r18
            r1 = r15
            float r0 = r0 + r1
            r18 = r0
            r0 = r13
            r1 = r14
            float r0 = r0 + r1
            r13 = r0
            int r22 = r22 + 1
            goto L7d
        La7:
            int r21 = r21 + 1
            goto L42
        Lad:
            org.lwjgl.opengl.GL11.glEnd()
            goto L3a4
        Lb3:
            r0 = r6
            int r0 = r0.drawStyle
            r1 = 100011(0x186ab, float:1.40145E-40)
            if (r0 == r1) goto Lc5
            r0 = r6
            int r0 = r0.drawStyle
            r1 = 100013(0x186ad, float:1.40148E-40)
            if (r0 != r1) goto L243
        Lc5:
            r0 = r6
            int r0 = r0.drawStyle
            r1 = 100011(0x186ab, float:1.40145E-40)
            if (r0 != r1) goto L143
            r0 = 0
            r18 = r0
            r0 = r7
            r13 = r0
            r0 = 0
            r22 = r0
        Ld7:
            r0 = r22
            r1 = r11
            if (r0 > r1) goto L1e6
            r0 = 2
            org.lwjgl.opengl.GL11.glBegin(r0)
            r0 = 0
            r21 = r0
        Le5:
            r0 = r21
            r1 = r10
            if (r0 >= r1) goto L12c
            r0 = r6
            r1 = r21
            float r1 = (float) r1
            r2 = r12
            float r1 = r1 * r2
            float r0 = r0.cos(r1)
            r16 = r0
            r0 = r6
            r1 = r21
            float r1 = (float) r1
            r2 = r12
            float r1 = r1 * r2
            float r0 = r0.sin(r1)
            r17 = r0
            r0 = r6
            r1 = r16
            r2 = r20
            float r1 = r1 * r2
            r2 = r17
            r3 = r20
            float r2 = r2 * r3
            r3 = r19
            r4 = r20
            float r3 = r3 * r4
            r0.normal3f(r1, r2, r3)
            r0 = r16
            r1 = r13
            float r0 = r0 * r1
            r1 = r17
            r2 = r13
            float r1 = r1 * r2
            r2 = r18
            org.lwjgl.opengl.GL11.glVertex3f(r0, r1, r2)
            int r21 = r21 + 1
            goto Le5
        L12c:
            org.lwjgl.opengl.GL11.glEnd()
            r0 = r18
            r1 = r15
            float r0 = r0 + r1
            r18 = r0
            r0 = r13
            r1 = r14
            float r0 = r0 + r1
            r13 = r0
            int r22 = r22 + 1
            goto Ld7
        L143:
            r0 = r7
            double r0 = (double) r0
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto L1e6
            r0 = 2
            org.lwjgl.opengl.GL11.glBegin(r0)
            r0 = 0
            r21 = r0
        L151:
            r0 = r21
            r1 = r10
            if (r0 >= r1) goto L195
            r0 = r6
            r1 = r21
            float r1 = (float) r1
            r2 = r12
            float r1 = r1 * r2
            float r0 = r0.cos(r1)
            r16 = r0
            r0 = r6
            r1 = r21
            float r1 = (float) r1
            r2 = r12
            float r1 = r1 * r2
            float r0 = r0.sin(r1)
            r17 = r0
            r0 = r6
            r1 = r16
            r2 = r20
            float r1 = r1 * r2
            r2 = r17
            r3 = r20
            float r2 = r2 * r3
            r3 = r19
            r4 = r20
            float r3 = r3 * r4
            r0.normal3f(r1, r2, r3)
            r0 = r16
            r1 = r7
            float r0 = r0 * r1
            r1 = r17
            r2 = r7
            float r1 = r1 * r2
            r2 = 0
            org.lwjgl.opengl.GL11.glVertex3f(r0, r1, r2)
            int r21 = r21 + 1
            goto L151
        L195:
            org.lwjgl.opengl.GL11.glEnd()
            r0 = 2
            org.lwjgl.opengl.GL11.glBegin(r0)
            r0 = 0
            r21 = r0
        L19f:
            r0 = r21
            r1 = r10
            if (r0 >= r1) goto L1e3
            r0 = r6
            r1 = r21
            float r1 = (float) r1
            r2 = r12
            float r1 = r1 * r2
            float r0 = r0.cos(r1)
            r16 = r0
            r0 = r6
            r1 = r21
            float r1 = (float) r1
            r2 = r12
            float r1 = r1 * r2
            float r0 = r0.sin(r1)
            r17 = r0
            r0 = r6
            r1 = r16
            r2 = r20
            float r1 = r1 * r2
            r2 = r17
            r3 = r20
            float r2 = r2 * r3
            r3 = r19
            r4 = r20
            float r3 = r3 * r4
            r0.normal3f(r1, r2, r3)
            r0 = r16
            r1 = r8
            float r0 = r0 * r1
            r1 = r17
            r2 = r8
            float r1 = r1 * r2
            r2 = r9
            org.lwjgl.opengl.GL11.glVertex3f(r0, r1, r2)
            int r21 = r21 + 1
            goto L19f
        L1e3:
            org.lwjgl.opengl.GL11.glEnd()
        L1e6:
            r0 = 1
            org.lwjgl.opengl.GL11.glBegin(r0)
            r0 = 0
            r21 = r0
        L1ed:
            r0 = r21
            r1 = r10
            if (r0 >= r1) goto L23d
            r0 = r6
            r1 = r21
            float r1 = (float) r1
            r2 = r12
            float r1 = r1 * r2
            float r0 = r0.cos(r1)
            r16 = r0
            r0 = r6
            r1 = r21
            float r1 = (float) r1
            r2 = r12
            float r1 = r1 * r2
            float r0 = r0.sin(r1)
            r17 = r0
            r0 = r6
            r1 = r16
            r2 = r20
            float r1 = r1 * r2
            r2 = r17
            r3 = r20
            float r2 = r2 * r3
            r3 = r19
            r4 = r20
            float r3 = r3 * r4
            r0.normal3f(r1, r2, r3)
            r0 = r16
            r1 = r7
            float r0 = r0 * r1
            r1 = r17
            r2 = r7
            float r1 = r1 * r2
            r2 = 0
            org.lwjgl.opengl.GL11.glVertex3f(r0, r1, r2)
            r0 = r16
            r1 = r8
            float r0 = r0 * r1
            r1 = r17
            r2 = r8
            float r1 = r1 * r2
            r2 = r9
            org.lwjgl.opengl.GL11.glVertex3f(r0, r1, r2)
            int r21 = r21 + 1
            goto L1ed
        L23d:
            org.lwjgl.opengl.GL11.glEnd()
            goto L3a4
        L243:
            r0 = r6
            int r0 = r0.drawStyle
            r1 = 100012(0x186ac, float:1.40147E-40)
            if (r0 != r1) goto L3a4
            r0 = 1065353216(0x3f800000, float:1.0)
            r1 = r10
            float r1 = (float) r1
            float r0 = r0 / r1
            r23 = r0
            r0 = 1065353216(0x3f800000, float:1.0)
            r1 = r11
            float r1 = (float) r1
            float r0 = r0 / r1
            r24 = r0
            r0 = 0
            r25 = r0
            r0 = 0
            r18 = r0
            r0 = r7
            r13 = r0
            r0 = 0
            r22 = r0
        L266:
            r0 = r22
            r1 = r11
            if (r0 >= r1) goto L3a4
            r0 = 0
            r26 = r0
            r0 = 8
            org.lwjgl.opengl.GL11.glBegin(r0)
            r0 = 0
            r21 = r0
        L278:
            r0 = r21
            r1 = r10
            if (r0 > r1) goto L386
            r0 = r21
            r1 = r10
            if (r0 != r1) goto L297
            r0 = r6
            r1 = 0
            float r0 = r0.sin(r1)
            r16 = r0
            r0 = r6
            r1 = 0
            float r0 = r0.cos(r1)
            r17 = r0
            goto L2af
        L297:
            r0 = r6
            r1 = r21
            float r1 = (float) r1
            r2 = r12
            float r1 = r1 * r2
            float r0 = r0.sin(r1)
            r16 = r0
            r0 = r6
            r1 = r21
            float r1 = (float) r1
            r2 = r12
            float r1 = r1 * r2
            float r0 = r0.cos(r1)
            r17 = r0
        L2af:
            r0 = r20
            r1 = 1065353216(0x3f800000, float:1.0)
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto L319
            r0 = r6
            r1 = r16
            r2 = r20
            float r1 = r1 * r2
            r2 = r17
            r3 = r20
            float r2 = r2 * r3
            r3 = r19
            r4 = r20
            float r3 = r3 * r4
            r0.normal3f(r1, r2, r3)
            r0 = r6
            r1 = r26
            r2 = r25
            r0.TXTR_COORD(r1, r2)
            r0 = r16
            r1 = r13
            float r0 = r0 * r1
            r1 = r17
            r2 = r13
            float r1 = r1 * r2
            r2 = r18
            org.lwjgl.opengl.GL11.glVertex3f(r0, r1, r2)
            r0 = r6
            r1 = r16
            r2 = r20
            float r1 = r1 * r2
            r2 = r17
            r3 = r20
            float r2 = r2 * r3
            r3 = r19
            r4 = r20
            float r3 = r3 * r4
            r0.normal3f(r1, r2, r3)
            r0 = r6
            r1 = r26
            r2 = r25
            r3 = r24
            float r2 = r2 + r3
            r0.TXTR_COORD(r1, r2)
            r0 = r16
            r1 = r13
            r2 = r14
            float r1 = r1 + r2
            float r0 = r0 * r1
            r1 = r17
            r2 = r13
            r3 = r14
            float r2 = r2 + r3
            float r1 = r1 * r2
            r2 = r18
            r3 = r15
            float r2 = r2 + r3
            org.lwjgl.opengl.GL11.glVertex3f(r0, r1, r2)
            goto L379
        L319:
            r0 = r6
            r1 = r16
            r2 = r20
            float r1 = r1 * r2
            r2 = r17
            r3 = r20
            float r2 = r2 * r3
            r3 = r19
            r4 = r20
            float r3 = r3 * r4
            r0.normal3f(r1, r2, r3)
            r0 = r6
            r1 = r26
            r2 = r25
            r0.TXTR_COORD(r1, r2)
            r0 = r16
            r1 = r13
            float r0 = r0 * r1
            r1 = r17
            r2 = r13
            float r1 = r1 * r2
            r2 = r18
            org.lwjgl.opengl.GL11.glVertex3f(r0, r1, r2)
            r0 = r6
            r1 = r16
            r2 = r20
            float r1 = r1 * r2
            r2 = r17
            r3 = r20
            float r2 = r2 * r3
            r3 = r19
            r4 = r20
            float r3 = r3 * r4
            r0.normal3f(r1, r2, r3)
            r0 = r6
            r1 = r26
            r2 = r25
            r3 = r24
            float r2 = r2 + r3
            r0.TXTR_COORD(r1, r2)
            r0 = r16
            r1 = r13
            r2 = r14
            float r1 = r1 + r2
            float r0 = r0 * r1
            r1 = r17
            r2 = r13
            r3 = r14
            float r2 = r2 + r3
            float r1 = r1 * r2
            r2 = r18
            r3 = r15
            float r2 = r2 + r3
            org.lwjgl.opengl.GL11.glVertex3f(r0, r1, r2)
        L379:
            r0 = r26
            r1 = r23
            float r0 = r0 + r1
            r26 = r0
            int r21 = r21 + 1
            goto L278
        L386:
            org.lwjgl.opengl.GL11.glEnd()
            r0 = r13
            r1 = r14
            float r0 = r0 + r1
            r13 = r0
            r0 = r25
            r1 = r24
            float r0 = r0 + r1
            r25 = r0
            r0 = r18
            r1 = r15
            float r0 = r0 + r1
            r18 = r0
            int r22 = r22 + 1
            goto L266
        L3a4:
            return
    }
}
