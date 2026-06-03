package org.lwjgl.util.glu;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/util/glu/Sphere.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/util/glu/Sphere.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/util/glu/Sphere.class */
public class Sphere extends org.lwjgl.util.glu.Quadric {
    public Sphere() {
            r2 = this;
            r0 = r2
            r0.<init>()
            return
    }

    public void draw(float r6, int r7, int r8) {
            r5 = this;
            r0 = r5
            int r0 = r0.normals
            r1 = 100002(0x186a2, float:1.40133E-40)
            if (r0 == r1) goto Ld
            r0 = 1
            goto Le
        Ld:
            r0 = 0
        Le:
            r24 = r0
            r0 = r5
            int r0 = r0.orientation
            r1 = 100021(0x186b5, float:1.40159E-40)
            if (r0 != r1) goto L20
            r0 = -1082130432(0xffffffffbf800000, float:-1.0)
            r25 = r0
            goto L23
        L20:
            r0 = 1065353216(0x3f800000, float:1.0)
            r25 = r0
        L23:
            r0 = 1078530011(0x40490fdb, float:3.1415927)
            r1 = r8
            float r1 = (float) r1
            float r0 = r0 / r1
            r10 = r0
            r0 = 1086918619(0x40c90fdb, float:6.2831855)
            r1 = r7
            float r1 = (float) r1
            float r0 = r0 / r1
            r12 = r0
            r0 = r5
            int r0 = r0.drawStyle
            r1 = 100012(0x186ac, float:1.40147E-40)
            if (r0 != r1) goto L2a3
            r0 = r5
            boolean r0 = r0.textureFlag
            if (r0 != 0) goto Lc9
            r0 = 6
            org.lwjgl.opengl.GL11.glBegin(r0)
            r0 = 0
            r1 = 0
            r2 = 1065353216(0x3f800000, float:1.0)
            org.lwjgl.opengl.GL11.glNormal3f(r0, r1, r2)
            r0 = 0
            r1 = 0
            r2 = r25
            r3 = r6
            float r2 = r2 * r3
            org.lwjgl.opengl.GL11.glVertex3f(r0, r1, r2)
            r0 = 0
            r21 = r0
        L58:
            r0 = r21
            r1 = r7
            if (r0 > r1) goto Lc6
            r0 = r21
            r1 = r7
            if (r0 != r1) goto L68
            r0 = 0
            goto L6e
        L68:
            r0 = r21
            float r0 = (float) r0
            r1 = r12
            float r0 = r0 * r1
        L6e:
            r11 = r0
            r0 = r5
            r1 = r11
            float r0 = r0.sin(r1)
            float r0 = -r0
            r1 = r5
            r2 = r10
            float r1 = r1.sin(r2)
            float r0 = r0 * r1
            r13 = r0
            r0 = r5
            r1 = r11
            float r0 = r0.cos(r1)
            r1 = r5
            r2 = r10
            float r1 = r1.sin(r2)
            float r0 = r0 * r1
            r14 = r0
            r0 = r25
            r1 = r5
            r2 = r10
            float r1 = r1.cos(r2)
            float r0 = r0 * r1
            r15 = r0
            r0 = r24
            if (r0 == 0) goto Lb1
            r0 = r13
            r1 = r25
            float r0 = r0 * r1
            r1 = r14
            r2 = r25
            float r1 = r1 * r2
            r2 = r15
            r3 = r25
            float r2 = r2 * r3
            org.lwjgl.opengl.GL11.glNormal3f(r0, r1, r2)
        Lb1:
            r0 = r13
            r1 = r6
            float r0 = r0 * r1
            r1 = r14
            r2 = r6
            float r1 = r1 * r2
            r2 = r15
            r3 = r6
            float r2 = r2 * r3
            org.lwjgl.opengl.GL11.glVertex3f(r0, r1, r2)
            int r21 = r21 + 1
            goto L58
        Lc6:
            org.lwjgl.opengl.GL11.glEnd()
        Lc9:
            r0 = 1065353216(0x3f800000, float:1.0)
            r1 = r7
            float r1 = (float) r1
            float r0 = r0 / r1
            r18 = r0
            r0 = 1065353216(0x3f800000, float:1.0)
            r1 = r8
            float r1 = (float) r1
            float r0 = r0 / r1
            r19 = r0
            r0 = 1065353216(0x3f800000, float:1.0)
            r17 = r0
            r0 = r5
            boolean r0 = r0.textureFlag
            if (r0 == 0) goto Le8
            r0 = 0
            r22 = r0
            r0 = r8
            r23 = r0
            goto Lf0
        Le8:
            r0 = 1
            r22 = r0
            r0 = r8
            r1 = 1
            int r0 = r0 - r1
            r23 = r0
        Lf0:
            r0 = r22
            r20 = r0
        Lf4:
            r0 = r20
            r1 = r23
            if (r0 >= r1) goto L1ff
            r0 = r20
            float r0 = (float) r0
            r1 = r10
            float r0 = r0 * r1
            r9 = r0
            r0 = 8
            org.lwjgl.opengl.GL11.glBegin(r0)
            r0 = 0
            r16 = r0
            r0 = 0
            r21 = r0
        L10e:
            r0 = r21
            r1 = r7
            if (r0 > r1) goto L1ef
            r0 = r21
            r1 = r7
            if (r0 != r1) goto L11e
            r0 = 0
            goto L124
        L11e:
            r0 = r21
            float r0 = (float) r0
            r1 = r12
            float r0 = r0 * r1
        L124:
            r11 = r0
            r0 = r5
            r1 = r11
            float r0 = r0.sin(r1)
            float r0 = -r0
            r1 = r5
            r2 = r9
            float r1 = r1.sin(r2)
            float r0 = r0 * r1
            r13 = r0
            r0 = r5
            r1 = r11
            float r0 = r0.cos(r1)
            r1 = r5
            r2 = r9
            float r1 = r1.sin(r2)
            float r0 = r0 * r1
            r14 = r0
            r0 = r25
            r1 = r5
            r2 = r9
            float r1 = r1.cos(r2)
            float r0 = r0 * r1
            r15 = r0
            r0 = r24
            if (r0 == 0) goto L167
            r0 = r13
            r1 = r25
            float r0 = r0 * r1
            r1 = r14
            r2 = r25
            float r1 = r1 * r2
            r2 = r15
            r3 = r25
            float r2 = r2 * r3
            org.lwjgl.opengl.GL11.glNormal3f(r0, r1, r2)
        L167:
            r0 = r5
            r1 = r16
            r2 = r17
            r0.TXTR_COORD(r1, r2)
            r0 = r13
            r1 = r6
            float r0 = r0 * r1
            r1 = r14
            r2 = r6
            float r1 = r1 * r2
            r2 = r15
            r3 = r6
            float r2 = r2 * r3
            org.lwjgl.opengl.GL11.glVertex3f(r0, r1, r2)
            r0 = r5
            r1 = r11
            float r0 = r0.sin(r1)
            float r0 = -r0
            r1 = r5
            r2 = r9
            r3 = r10
            float r2 = r2 + r3
            float r1 = r1.sin(r2)
            float r0 = r0 * r1
            r13 = r0
            r0 = r5
            r1 = r11
            float r0 = r0.cos(r1)
            r1 = r5
            r2 = r9
            r3 = r10
            float r2 = r2 + r3
            float r1 = r1.sin(r2)
            float r0 = r0 * r1
            r14 = r0
            r0 = r25
            r1 = r5
            r2 = r9
            r3 = r10
            float r2 = r2 + r3
            float r1 = r1.cos(r2)
            float r0 = r0 * r1
            r15 = r0
            r0 = r24
            if (r0 == 0) goto L1c8
            r0 = r13
            r1 = r25
            float r0 = r0 * r1
            r1 = r14
            r2 = r25
            float r1 = r1 * r2
            r2 = r15
            r3 = r25
            float r2 = r2 * r3
            org.lwjgl.opengl.GL11.glNormal3f(r0, r1, r2)
        L1c8:
            r0 = r5
            r1 = r16
            r2 = r17
            r3 = r19
            float r2 = r2 - r3
            r0.TXTR_COORD(r1, r2)
            r0 = r16
            r1 = r18
            float r0 = r0 + r1
            r16 = r0
            r0 = r13
            r1 = r6
            float r0 = r0 * r1
            r1 = r14
            r2 = r6
            float r1 = r1 * r2
            r2 = r15
            r3 = r6
            float r2 = r2 * r3
            org.lwjgl.opengl.GL11.glVertex3f(r0, r1, r2)
            int r21 = r21 + 1
            goto L10e
        L1ef:
            org.lwjgl.opengl.GL11.glEnd()
            r0 = r17
            r1 = r19
            float r0 = r0 - r1
            r17 = r0
            int r20 = r20 + 1
            goto Lf4
        L1ff:
            r0 = r5
            boolean r0 = r0.textureFlag
            if (r0 != 0) goto L469
            r0 = 6
            org.lwjgl.opengl.GL11.glBegin(r0)
            r0 = 0
            r1 = 0
            r2 = -1082130432(0xffffffffbf800000, float:-1.0)
            org.lwjgl.opengl.GL11.glNormal3f(r0, r1, r2)
            r0 = 0
            r1 = 0
            r2 = r6
            float r2 = -r2
            r3 = r25
            float r2 = r2 * r3
            org.lwjgl.opengl.GL11.glVertex3f(r0, r1, r2)
            r0 = 1078530011(0x40490fdb, float:3.1415927)
            r1 = r10
            float r0 = r0 - r1
            r9 = r0
            r0 = 1065353216(0x3f800000, float:1.0)
            r16 = r0
            r0 = r7
            r21 = r0
        L229:
            r0 = r21
            if (r0 < 0) goto L29d
            r0 = r21
            r1 = r7
            if (r0 != r1) goto L238
            r0 = 0
            goto L23e
        L238:
            r0 = r21
            float r0 = (float) r0
            r1 = r12
            float r0 = r0 * r1
        L23e:
            r11 = r0
            r0 = r5
            r1 = r11
            float r0 = r0.sin(r1)
            float r0 = -r0
            r1 = r5
            r2 = r9
            float r1 = r1.sin(r2)
            float r0 = r0 * r1
            r13 = r0
            r0 = r5
            r1 = r11
            float r0 = r0.cos(r1)
            r1 = r5
            r2 = r9
            float r1 = r1.sin(r2)
            float r0 = r0 * r1
            r14 = r0
            r0 = r25
            r1 = r5
            r2 = r9
            float r1 = r1.cos(r2)
            float r0 = r0 * r1
            r15 = r0
            r0 = r24
            if (r0 == 0) goto L281
            r0 = r13
            r1 = r25
            float r0 = r0 * r1
            r1 = r14
            r2 = r25
            float r1 = r1 * r2
            r2 = r15
            r3 = r25
            float r2 = r2 * r3
            org.lwjgl.opengl.GL11.glNormal3f(r0, r1, r2)
        L281:
            r0 = r16
            r1 = r18
            float r0 = r0 - r1
            r16 = r0
            r0 = r13
            r1 = r6
            float r0 = r0 * r1
            r1 = r14
            r2 = r6
            float r1 = r1 * r2
            r2 = r15
            r3 = r6
            float r2 = r2 * r3
            org.lwjgl.opengl.GL11.glVertex3f(r0, r1, r2)
            int r21 = r21 + (-1)
            goto L229
        L29d:
            org.lwjgl.opengl.GL11.glEnd()
            goto L469
        L2a3:
            r0 = r5
            int r0 = r0.drawStyle
            r1 = 100011(0x186ab, float:1.40145E-40)
            if (r0 == r1) goto L2b5
            r0 = r5
            int r0 = r0.drawStyle
            r1 = 100013(0x186ad, float:1.40148E-40)
            if (r0 != r1) goto L3b7
        L2b5:
            r0 = 1
            r20 = r0
        L2b8:
            r0 = r20
            r1 = r8
            if (r0 >= r1) goto L336
            r0 = r20
            float r0 = (float) r0
            r1 = r10
            float r0 = r0 * r1
            r9 = r0
            r0 = 2
            org.lwjgl.opengl.GL11.glBegin(r0)
            r0 = 0
            r21 = r0
        L2cd:
            r0 = r21
            r1 = r7
            if (r0 >= r1) goto L32d
            r0 = r21
            float r0 = (float) r0
            r1 = r12
            float r0 = r0 * r1
            r11 = r0
            r0 = r5
            r1 = r11
            float r0 = r0.cos(r1)
            r1 = r5
            r2 = r9
            float r1 = r1.sin(r2)
            float r0 = r0 * r1
            r13 = r0
            r0 = r5
            r1 = r11
            float r0 = r0.sin(r1)
            r1 = r5
            r2 = r9
            float r1 = r1.sin(r2)
            float r0 = r0 * r1
            r14 = r0
            r0 = r5
            r1 = r9
            float r0 = r0.cos(r1)
            r15 = r0
            r0 = r24
            if (r0 == 0) goto L318
            r0 = r13
            r1 = r25
            float r0 = r0 * r1
            r1 = r14
            r2 = r25
            float r1 = r1 * r2
            r2 = r15
            r3 = r25
            float r2 = r2 * r3
            org.lwjgl.opengl.GL11.glNormal3f(r0, r1, r2)
        L318:
            r0 = r13
            r1 = r6
            float r0 = r0 * r1
            r1 = r14
            r2 = r6
            float r1 = r1 * r2
            r2 = r15
            r3 = r6
            float r2 = r2 * r3
            org.lwjgl.opengl.GL11.glVertex3f(r0, r1, r2)
            int r21 = r21 + 1
            goto L2cd
        L32d:
            org.lwjgl.opengl.GL11.glEnd()
            int r20 = r20 + 1
            goto L2b8
        L336:
            r0 = 0
            r21 = r0
        L339:
            r0 = r21
            r1 = r7
            if (r0 >= r1) goto L469
            r0 = r21
            float r0 = (float) r0
            r1 = r12
            float r0 = r0 * r1
            r11 = r0
            r0 = 3
            org.lwjgl.opengl.GL11.glBegin(r0)
            r0 = 0
            r20 = r0
        L34e:
            r0 = r20
            r1 = r8
            if (r0 > r1) goto L3ae
            r0 = r20
            float r0 = (float) r0
            r1 = r10
            float r0 = r0 * r1
            r9 = r0
            r0 = r5
            r1 = r11
            float r0 = r0.cos(r1)
            r1 = r5
            r2 = r9
            float r1 = r1.sin(r2)
            float r0 = r0 * r1
            r13 = r0
            r0 = r5
            r1 = r11
            float r0 = r0.sin(r1)
            r1 = r5
            r2 = r9
            float r1 = r1.sin(r2)
            float r0 = r0 * r1
            r14 = r0
            r0 = r5
            r1 = r9
            float r0 = r0.cos(r1)
            r15 = r0
            r0 = r24
            if (r0 == 0) goto L399
            r0 = r13
            r1 = r25
            float r0 = r0 * r1
            r1 = r14
            r2 = r25
            float r1 = r1 * r2
            r2 = r15
            r3 = r25
            float r2 = r2 * r3
            org.lwjgl.opengl.GL11.glNormal3f(r0, r1, r2)
        L399:
            r0 = r13
            r1 = r6
            float r0 = r0 * r1
            r1 = r14
            r2 = r6
            float r1 = r1 * r2
            r2 = r15
            r3 = r6
            float r2 = r2 * r3
            org.lwjgl.opengl.GL11.glVertex3f(r0, r1, r2)
            int r20 = r20 + 1
            goto L34e
        L3ae:
            org.lwjgl.opengl.GL11.glEnd()
            int r21 = r21 + 1
            goto L339
        L3b7:
            r0 = r5
            int r0 = r0.drawStyle
            r1 = 100010(0x186aa, float:1.40144E-40)
            if (r0 != r1) goto L469
            r0 = 0
            org.lwjgl.opengl.GL11.glBegin(r0)
            r0 = r24
            if (r0 == 0) goto L3d0
            r0 = 0
            r1 = 0
            r2 = r25
            org.lwjgl.opengl.GL11.glNormal3f(r0, r1, r2)
        L3d0:
            r0 = 0
            r1 = 0
            r2 = r6
            org.lwjgl.opengl.GL11.glVertex3f(r0, r1, r2)
            r0 = r24
            if (r0 == 0) goto L3e3
            r0 = 0
            r1 = 0
            r2 = r25
            float r2 = -r2
            org.lwjgl.opengl.GL11.glNormal3f(r0, r1, r2)
        L3e3:
            r0 = 0
            r1 = 0
            r2 = r6
            float r2 = -r2
            org.lwjgl.opengl.GL11.glVertex3f(r0, r1, r2)
            r0 = 1
            r20 = r0
        L3ed:
            r0 = r20
            r1 = r8
            r2 = 1
            int r1 = r1 - r2
            if (r0 >= r1) goto L466
            r0 = r20
            float r0 = (float) r0
            r1 = r10
            float r0 = r0 * r1
            r9 = r0
            r0 = 0
            r21 = r0
        L400:
            r0 = r21
            r1 = r7
            if (r0 >= r1) goto L460
            r0 = r21
            float r0 = (float) r0
            r1 = r12
            float r0 = r0 * r1
            r11 = r0
            r0 = r5
            r1 = r11
            float r0 = r0.cos(r1)
            r1 = r5
            r2 = r9
            float r1 = r1.sin(r2)
            float r0 = r0 * r1
            r13 = r0
            r0 = r5
            r1 = r11
            float r0 = r0.sin(r1)
            r1 = r5
            r2 = r9
            float r1 = r1.sin(r2)
            float r0 = r0 * r1
            r14 = r0
            r0 = r5
            r1 = r9
            float r0 = r0.cos(r1)
            r15 = r0
            r0 = r24
            if (r0 == 0) goto L44b
            r0 = r13
            r1 = r25
            float r0 = r0 * r1
            r1 = r14
            r2 = r25
            float r1 = r1 * r2
            r2 = r15
            r3 = r25
            float r2 = r2 * r3
            org.lwjgl.opengl.GL11.glNormal3f(r0, r1, r2)
        L44b:
            r0 = r13
            r1 = r6
            float r0 = r0 * r1
            r1 = r14
            r2 = r6
            float r1 = r1 * r2
            r2 = r15
            r3 = r6
            float r2 = r2 * r3
            org.lwjgl.opengl.GL11.glVertex3f(r0, r1, r2)
            int r21 = r21 + 1
            goto L400
        L460:
            int r20 = r20 + 1
            goto L3ed
        L466:
            org.lwjgl.opengl.GL11.glEnd()
        L469:
            return
    }
}
