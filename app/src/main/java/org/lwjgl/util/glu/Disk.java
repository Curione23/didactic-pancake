package org.lwjgl.util.glu;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/util/glu/Disk.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/util/glu/Disk.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/util/glu/Disk.class */
public class Disk extends org.lwjgl.util.glu.Quadric {
    public Disk() {
            r2 = this;
            r0 = r2
            r0.<init>()
            return
    }

    public void draw(float r7, float r8, int r9, int r10) {
            r6 = this;
            r0 = r6
            int r0 = r0.normals
            r1 = 100002(0x186a2, float:1.40133E-40)
            if (r0 == r1) goto L22
            r0 = r6
            int r0 = r0.orientation
            r1 = 100020(0x186b4, float:1.40158E-40)
            if (r0 != r1) goto L1b
            r0 = 0
            r1 = 0
            r2 = 1065353216(0x3f800000, float:1.0)
            org.lwjgl.opengl.GL11.glNormal3f(r0, r1, r2)
            goto L22
        L1b:
            r0 = 0
            r1 = 0
            r2 = -1082130432(0xffffffffbf800000, float:-1.0)
            org.lwjgl.opengl.GL11.glNormal3f(r0, r1, r2)
        L22:
            r0 = 1086918619(0x40c90fdb, float:6.2831855)
            r1 = r9
            float r1 = (float) r1
            float r0 = r0 / r1
            r11 = r0
            r0 = r8
            r1 = r7
            float r0 = r0 - r1
            r1 = r10
            float r1 = (float) r1
            float r0 = r0 / r1
            r12 = r0
            r0 = r6
            int r0 = r0.drawStyle
            switch(r0) {
                case 100010: goto L236;
                case 100011: goto L194;
                case 100012: goto L54;
                case 100013: goto L28e;
                default: goto L308;
            }
        L54:
            r0 = 1073741824(0x40000000, float:2.0)
            r1 = r8
            float r0 = r0 * r1
            r13 = r0
            r0 = r7
            r16 = r0
            r0 = 0
            r17 = r0
        L5f:
            r0 = r17
            r1 = r10
            if (r0 >= r1) goto L309
            r0 = r16
            r1 = r12
            float r0 = r0 + r1
            r18 = r0
            r0 = r6
            int r0 = r0.orientation
            r1 = 100020(0x186b4, float:1.40158E-40)
            if (r0 != r1) goto L102
            r0 = 8
            org.lwjgl.opengl.GL11.glBegin(r0)
            r0 = 0
            r19 = r0
        L7e:
            r0 = r19
            r1 = r9
            if (r0 > r1) goto Lfc
            r0 = r19
            r1 = r9
            if (r0 != r1) goto L90
            r0 = 0
            r20 = r0
            goto L98
        L90:
            r0 = r19
            float r0 = (float) r0
            r1 = r11
            float r0 = r0 * r1
            r20 = r0
        L98:
            r0 = r6
            r1 = r20
            float r0 = r0.sin(r1)
            r14 = r0
            r0 = r6
            r1 = r20
            float r0 = r0.cos(r1)
            r15 = r0
            r0 = r6
            r1 = 1056964608(0x3f000000, float:0.5)
            r2 = r14
            r3 = r18
            float r2 = r2 * r3
            r3 = r13
            float r2 = r2 / r3
            float r1 = r1 + r2
            r2 = 1056964608(0x3f000000, float:0.5)
            r3 = r15
            r4 = r18
            float r3 = r3 * r4
            r4 = r13
            float r3 = r3 / r4
            float r2 = r2 + r3
            r0.TXTR_COORD(r1, r2)
            r0 = r18
            r1 = r14
            float r0 = r0 * r1
            r1 = r18
            r2 = r15
            float r1 = r1 * r2
            org.lwjgl.opengl.GL11.glVertex2f(r0, r1)
            r0 = r6
            r1 = 1056964608(0x3f000000, float:0.5)
            r2 = r14
            r3 = r16
            float r2 = r2 * r3
            r3 = r13
            float r2 = r2 / r3
            float r1 = r1 + r2
            r2 = 1056964608(0x3f000000, float:0.5)
            r3 = r15
            r4 = r16
            float r3 = r3 * r4
            r4 = r13
            float r3 = r3 / r4
            float r2 = r2 + r3
            r0.TXTR_COORD(r1, r2)
            r0 = r16
            r1 = r14
            float r0 = r0 * r1
            r1 = r16
            r2 = r15
            float r1 = r1 * r2
            org.lwjgl.opengl.GL11.glVertex2f(r0, r1)
            int r19 = r19 + 1
            goto L7e
        Lfc:
            org.lwjgl.opengl.GL11.glEnd()
            goto L18a
        L102:
            r0 = 8
            org.lwjgl.opengl.GL11.glBegin(r0)
            r0 = r9
            r19 = r0
        L10a:
            r0 = r19
            if (r0 < 0) goto L187
            r0 = r19
            r1 = r9
            if (r0 != r1) goto L11b
            r0 = 0
            r20 = r0
            goto L123
        L11b:
            r0 = r19
            float r0 = (float) r0
            r1 = r11
            float r0 = r0 * r1
            r20 = r0
        L123:
            r0 = r6
            r1 = r20
            float r0 = r0.sin(r1)
            r14 = r0
            r0 = r6
            r1 = r20
            float r0 = r0.cos(r1)
            r15 = r0
            r0 = r6
            r1 = 1056964608(0x3f000000, float:0.5)
            r2 = r14
            r3 = r18
            float r2 = r2 * r3
            r3 = r13
            float r2 = r2 / r3
            float r1 = r1 - r2
            r2 = 1056964608(0x3f000000, float:0.5)
            r3 = r15
            r4 = r18
            float r3 = r3 * r4
            r4 = r13
            float r3 = r3 / r4
            float r2 = r2 + r3
            r0.TXTR_COORD(r1, r2)
            r0 = r18
            r1 = r14
            float r0 = r0 * r1
            r1 = r18
            r2 = r15
            float r1 = r1 * r2
            org.lwjgl.opengl.GL11.glVertex2f(r0, r1)
            r0 = r6
            r1 = 1056964608(0x3f000000, float:0.5)
            r2 = r14
            r3 = r16
            float r2 = r2 * r3
            r3 = r13
            float r2 = r2 / r3
            float r1 = r1 - r2
            r2 = 1056964608(0x3f000000, float:0.5)
            r3 = r15
            r4 = r16
            float r3 = r3 * r4
            r4 = r13
            float r3 = r3 / r4
            float r2 = r2 + r3
            r0.TXTR_COORD(r1, r2)
            r0 = r16
            r1 = r14
            float r0 = r0 * r1
            r1 = r16
            r2 = r15
            float r1 = r1 * r2
            org.lwjgl.opengl.GL11.glVertex2f(r0, r1)
            int r19 = r19 + (-1)
            goto L10a
        L187:
            org.lwjgl.opengl.GL11.glEnd()
        L18a:
            r0 = r18
            r16 = r0
            int r17 = r17 + 1
            goto L5f
        L194:
            r0 = 0
            r13 = r0
        L197:
            r0 = r13
            r1 = r10
            if (r0 > r1) goto L1e1
            r0 = r7
            r1 = r13
            float r1 = (float) r1
            r2 = r12
            float r1 = r1 * r2
            float r0 = r0 + r1
            r15 = r0
            r0 = 2
            org.lwjgl.opengl.GL11.glBegin(r0)
            r0 = 0
            r14 = r0
        L1af:
            r0 = r14
            r1 = r9
            if (r0 >= r1) goto L1d8
            r0 = r14
            float r0 = (float) r0
            r1 = r11
            float r0 = r0 * r1
            r16 = r0
            r0 = r15
            r1 = r6
            r2 = r16
            float r1 = r1.sin(r2)
            float r0 = r0 * r1
            r1 = r15
            r2 = r6
            r3 = r16
            float r2 = r2.cos(r3)
            float r1 = r1 * r2
            org.lwjgl.opengl.GL11.glVertex2f(r0, r1)
            int r14 = r14 + 1
            goto L1af
        L1d8:
            org.lwjgl.opengl.GL11.glEnd()
            int r13 = r13 + 1
            goto L197
        L1e1:
            r0 = 0
            r14 = r0
        L1e4:
            r0 = r14
            r1 = r9
            if (r0 >= r1) goto L309
            r0 = r14
            float r0 = (float) r0
            r1 = r11
            float r0 = r0 * r1
            r15 = r0
            r0 = r6
            r1 = r15
            float r0 = r0.sin(r1)
            r16 = r0
            r0 = r6
            r1 = r15
            float r0 = r0.cos(r1)
            r17 = r0
            r0 = 3
            org.lwjgl.opengl.GL11.glBegin(r0)
            r0 = 0
            r13 = r0
        L209:
            r0 = r13
            r1 = r10
            if (r0 > r1) goto L22d
            r0 = r7
            r1 = r13
            float r1 = (float) r1
            r2 = r12
            float r1 = r1 * r2
            float r0 = r0 + r1
            r18 = r0
            r0 = r18
            r1 = r16
            float r0 = r0 * r1
            r1 = r18
            r2 = r17
            float r1 = r1 * r2
            org.lwjgl.opengl.GL11.glVertex2f(r0, r1)
            int r13 = r13 + 1
            goto L209
        L22d:
            org.lwjgl.opengl.GL11.glEnd()
            int r14 = r14 + 1
            goto L1e4
        L236:
            r0 = 0
            org.lwjgl.opengl.GL11.glBegin(r0)
            r0 = 0
            r13 = r0
        L23d:
            r0 = r13
            r1 = r9
            if (r0 >= r1) goto L288
            r0 = r13
            float r0 = (float) r0
            r1 = r11
            float r0 = r0 * r1
            r14 = r0
            r0 = r6
            r1 = r14
            float r0 = r0.sin(r1)
            r15 = r0
            r0 = r6
            r1 = r14
            float r0 = r0.cos(r1)
            r16 = r0
            r0 = 0
            r17 = r0
        L25e:
            r0 = r17
            r1 = r10
            if (r0 > r1) goto L282
            r0 = r7
            r1 = r17
            float r1 = (float) r1
            float r0 = r0 * r1
            r1 = r12
            float r0 = r0 * r1
            r18 = r0
            r0 = r18
            r1 = r15
            float r0 = r0 * r1
            r1 = r18
            r2 = r16
            float r1 = r1 * r2
            org.lwjgl.opengl.GL11.glVertex2f(r0, r1)
            int r17 = r17 + 1
            goto L25e
        L282:
            int r13 = r13 + 1
            goto L23d
        L288:
            org.lwjgl.opengl.GL11.glEnd()
            goto L309
        L28e:
            r0 = r7
            double r0 = (double) r0
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto L2ce
            r0 = 2
            org.lwjgl.opengl.GL11.glBegin(r0)
            r0 = 0
            r13 = r0
        L29c:
            r0 = r13
            double r0 = (double) r0
            r1 = 4618760256376274944(0x401921fb60000000, double:6.2831854820251465)
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 >= 0) goto L2cb
            r0 = r7
            r1 = r6
            r2 = r13
            float r1 = r1.sin(r2)
            float r0 = r0 * r1
            r14 = r0
            r0 = r7
            r1 = r6
            r2 = r13
            float r1 = r1.cos(r2)
            float r0 = r0 * r1
            r15 = r0
            r0 = r14
            r1 = r15
            org.lwjgl.opengl.GL11.glVertex2f(r0, r1)
            r0 = r13
            r1 = r11
            float r0 = r0 + r1
            r13 = r0
            goto L29c
        L2cb:
            org.lwjgl.opengl.GL11.glEnd()
        L2ce:
            r0 = 2
            org.lwjgl.opengl.GL11.glBegin(r0)
            r0 = 0
            r13 = r0
        L2d5:
            r0 = r13
            r1 = 1086918619(0x40c90fdb, float:6.2831855)
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 >= 0) goto L302
            r0 = r8
            r1 = r6
            r2 = r13
            float r1 = r1.sin(r2)
            float r0 = r0 * r1
            r14 = r0
            r0 = r8
            r1 = r6
            r2 = r13
            float r1 = r1.cos(r2)
            float r0 = r0 * r1
            r15 = r0
            r0 = r14
            r1 = r15
            org.lwjgl.opengl.GL11.glVertex2f(r0, r1)
            r0 = r13
            r1 = r11
            float r0 = r0 + r1
            r13 = r0
            goto L2d5
        L302:
            org.lwjgl.opengl.GL11.glEnd()
            goto L309
        L308:
            return
        L309:
            return
    }
}
