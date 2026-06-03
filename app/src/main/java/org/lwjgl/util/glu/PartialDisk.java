package org.lwjgl.util.glu;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/util/glu/PartialDisk.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/util/glu/PartialDisk.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/util/glu/PartialDisk.class */
public class PartialDisk extends org.lwjgl.util.glu.Quadric {
    private static final int CACHE_SIZE = 240;

    public PartialDisk() {
            r2 = this;
            r0 = r2
            r0.<init>()
            return
    }

    public void draw(float r6, float r7, int r8, int r9, float r10, float r11) {
            r5 = this;
            r0 = 240(0xf0, float:3.36E-43)
            float[] r0 = new float[r0]
            r14 = r0
            r0 = 240(0xf0, float:3.36E-43)
            float[] r0 = new float[r0]
            r15 = r0
            r0 = 0
            r22 = r0
            r0 = 0
            r23 = r0
            r0 = r8
            r1 = 240(0xf0, float:3.36E-43)
            if (r0 < r1) goto L1f
            r0 = 239(0xef, float:3.35E-43)
            r8 = r0
        L1f:
            r0 = r8
            r1 = 2
            if (r0 < r1) goto L3c
            r0 = r9
            r1 = 1
            if (r0 < r1) goto L3c
            r0 = r7
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 <= 0) goto L3c
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 < 0) goto L3c
            r0 = r6
            r1 = r7
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 <= 0) goto L45
        L3c:
            java.io.PrintStream r0 = java.lang.System.err
            java.lang.String r1 = "PartialDisk: GLU_INVALID_VALUE"
            r0.println(r1)
            return
        L45:
            r0 = r11
            r1 = -1011613696(0xffffffffc3b40000, float:-360.0)
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 >= 0) goto L51
            r0 = 1135869952(0x43b40000, float:360.0)
            r11 = r0
        L51:
            r0 = r11
            r1 = 1135869952(0x43b40000, float:360.0)
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 <= 0) goto L5d
            r0 = 1135869952(0x43b40000, float:360.0)
            r11 = r0
        L5d:
            r0 = r11
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 >= 0) goto L70
            r0 = r10
            r1 = r11
            float r0 = r0 + r1
            r10 = r0
            r0 = r11
            float r0 = -r0
            r11 = r0
        L70:
            r0 = r11
            r1 = 1135869952(0x43b40000, float:360.0)
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto L7e
            r0 = r8
            r25 = r0
            goto L83
        L7e:
            r0 = r8
            r1 = 1
            int r0 = r0 + r1
            r25 = r0
        L83:
            r0 = r7
            r1 = r6
            float r0 = r0 - r1
            r19 = r0
            r0 = r10
            r1 = 1127481344(0x43340000, float:180.0)
            float r0 = r0 / r1
            r1 = 1078530011(0x40490fdb, float:3.1415927)
            float r0 = r0 * r1
            r24 = r0
            r0 = 0
            r12 = r0
        L95:
            r0 = r12
            r1 = r8
            if (r0 > r1) goto Lcb
            r0 = r24
            r1 = 1078530011(0x40490fdb, float:3.1415927)
            r2 = r11
            float r1 = r1 * r2
            r2 = 1127481344(0x43340000, float:180.0)
            float r1 = r1 / r2
            r2 = r12
            float r2 = (float) r2
            float r1 = r1 * r2
            r2 = r8
            float r2 = (float) r2
            float r1 = r1 / r2
            float r0 = r0 + r1
            r16 = r0
            r0 = r14
            r1 = r12
            r2 = r5
            r3 = r16
            float r2 = r2.sin(r3)
            r0[r1] = r2
            r0 = r15
            r1 = r12
            r2 = r5
            r3 = r16
            float r2 = r2.cos(r3)
            r0[r1] = r2
            int r12 = r12 + 1
            goto L95
        Lcb:
            r0 = r11
            r1 = 1135869952(0x43b40000, float:360.0)
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto Le3
            r0 = r14
            r1 = r8
            r2 = r14
            r3 = 0
            r2 = r2[r3]
            r0[r1] = r2
            r0 = r15
            r1 = r8
            r2 = r15
            r3 = 0
            r2 = r2[r3]
            r0[r1] = r2
        Le3:
            r0 = r5
            int r0 = r0.normals
            switch(r0) {
                case 100000: goto L100;
                case 100001: goto L100;
                case 100002: goto L11c;
                default: goto L11c;
            }
        L100:
            r0 = r5
            int r0 = r0.orientation
            r1 = 100020(0x186b4, float:1.40158E-40)
            if (r0 != r1) goto L112
            r0 = 0
            r1 = 0
            r2 = 1065353216(0x3f800000, float:1.0)
            org.lwjgl.opengl.GL11.glNormal3f(r0, r1, r2)
            goto L11c
        L112:
            r0 = 0
            r1 = 0
            r2 = -1082130432(0xffffffffbf800000, float:-1.0)
            org.lwjgl.opengl.GL11.glNormal3f(r0, r1, r2)
            goto L11c
        L11c:
            r0 = r5
            int r0 = r0.drawStyle
            switch(r0) {
                case 100010: goto L354;
                case 100011: goto L3d0;
                case 100012: goto L140;
                case 100013: goto L516;
                default: goto L61d;
            }
        L140:
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto L218
            r0 = r9
            r1 = 1
            int r0 = r0 - r1
            r26 = r0
            r0 = 6
            org.lwjgl.opengl.GL11.glBegin(r0)
            r0 = r5
            boolean r0 = r0.textureFlag
            if (r0 == 0) goto L15f
            r0 = 1056964608(0x3f000000, float:0.5)
            r1 = 1056964608(0x3f000000, float:0.5)
            org.lwjgl.opengl.GL11.glTexCoord2f(r0, r1)
        L15f:
            r0 = 0
            r1 = 0
            r2 = 0
            org.lwjgl.opengl.GL11.glVertex3f(r0, r1, r2)
            r0 = r7
            r1 = r19
            r2 = r9
            r3 = 1
            int r2 = r2 - r3
            float r2 = (float) r2
            r3 = r9
            float r3 = (float) r3
            float r2 = r2 / r3
            float r1 = r1 * r2
            float r0 = r0 - r1
            r20 = r0
            r0 = r5
            boolean r0 = r0.textureFlag
            if (r0 == 0) goto L184
            r0 = r20
            r1 = r7
            float r0 = r0 / r1
            r1 = 1073741824(0x40000000, float:2.0)
            float r0 = r0 / r1
            r22 = r0
        L184:
            r0 = r5
            int r0 = r0.orientation
            r1 = 100020(0x186b4, float:1.40158E-40)
            if (r0 != r1) goto L1cf
            r0 = r8
            r12 = r0
        L190:
            r0 = r12
            if (r0 < 0) goto L212
            r0 = r5
            boolean r0 = r0.textureFlag
            if (r0 == 0) goto L1b5
            r0 = r22
            r1 = r14
            r2 = r12
            r1 = r1[r2]
            float r0 = r0 * r1
            r1 = 1056964608(0x3f000000, float:0.5)
            float r0 = r0 + r1
            r1 = r22
            r2 = r15
            r3 = r12
            r2 = r2[r3]
            float r1 = r1 * r2
            r2 = 1056964608(0x3f000000, float:0.5)
            float r1 = r1 + r2
            org.lwjgl.opengl.GL11.glTexCoord2f(r0, r1)
        L1b5:
            r0 = r20
            r1 = r14
            r2 = r12
            r1 = r1[r2]
            float r0 = r0 * r1
            r1 = r20
            r2 = r15
            r3 = r12
            r2 = r2[r3]
            float r1 = r1 * r2
            r2 = 0
            org.lwjgl.opengl.GL11.glVertex3f(r0, r1, r2)
            int r12 = r12 + (-1)
            goto L190
        L1cf:
            r0 = 0
            r12 = r0
        L1d2:
            r0 = r12
            r1 = r8
            if (r0 > r1) goto L212
            r0 = r5
            boolean r0 = r0.textureFlag
            if (r0 == 0) goto L1f8
            r0 = r22
            r1 = r14
            r2 = r12
            r1 = r1[r2]
            float r0 = r0 * r1
            r1 = 1056964608(0x3f000000, float:0.5)
            float r0 = r0 + r1
            r1 = r22
            r2 = r15
            r3 = r12
            r2 = r2[r3]
            float r1 = r1 * r2
            r2 = 1056964608(0x3f000000, float:0.5)
            float r1 = r1 + r2
            org.lwjgl.opengl.GL11.glTexCoord2f(r0, r1)
        L1f8:
            r0 = r20
            r1 = r14
            r2 = r12
            r1 = r1[r2]
            float r0 = r0 * r1
            r1 = r20
            r2 = r15
            r3 = r12
            r2 = r2[r3]
            float r1 = r1 * r2
            r2 = 0
            org.lwjgl.opengl.GL11.glVertex3f(r0, r1, r2)
            int r12 = r12 + 1
            goto L1d2
        L212:
            org.lwjgl.opengl.GL11.glEnd()
            goto L21c
        L218:
            r0 = r9
            r26 = r0
        L21c:
            r0 = 0
            r13 = r0
        L21f:
            r0 = r13
            r1 = r26
            if (r0 >= r1) goto L61d
            r0 = r7
            r1 = r19
            r2 = r13
            float r2 = (float) r2
            r3 = r9
            float r3 = (float) r3
            float r2 = r2 / r3
            float r1 = r1 * r2
            float r0 = r0 - r1
            r20 = r0
            r0 = r7
            r1 = r19
            r2 = r13
            r3 = 1
            int r2 = r2 + r3
            float r2 = (float) r2
            r3 = r9
            float r3 = (float) r3
            float r2 = r2 / r3
            float r1 = r1 * r2
            float r0 = r0 - r1
            r21 = r0
            r0 = r5
            boolean r0 = r0.textureFlag
            if (r0 == 0) goto L25b
            r0 = r20
            r1 = r7
            float r0 = r0 / r1
            r1 = 1073741824(0x40000000, float:2.0)
            float r0 = r0 / r1
            r22 = r0
            r0 = r21
            r1 = r7
            float r0 = r0 / r1
            r1 = 1073741824(0x40000000, float:2.0)
            float r0 = r0 / r1
            r23 = r0
        L25b:
            r0 = 8
            org.lwjgl.opengl.GL11.glBegin(r0)
            r0 = 0
            r12 = r0
        L263:
            r0 = r12
            r1 = r8
            if (r0 > r1) goto L34b
            r0 = r5
            int r0 = r0.orientation
            r1 = 100020(0x186b4, float:1.40158E-40)
            if (r0 != r1) goto L2dd
            r0 = r5
            boolean r0 = r0.textureFlag
            if (r0 == 0) goto L292
            r0 = r22
            r1 = r14
            r2 = r12
            r1 = r1[r2]
            float r0 = r0 * r1
            r1 = 1056964608(0x3f000000, float:0.5)
            float r0 = r0 + r1
            r1 = r22
            r2 = r15
            r3 = r12
            r2 = r2[r3]
            float r1 = r1 * r2
            r2 = 1056964608(0x3f000000, float:0.5)
            float r1 = r1 + r2
            org.lwjgl.opengl.GL11.glTexCoord2f(r0, r1)
        L292:
            r0 = r20
            r1 = r14
            r2 = r12
            r1 = r1[r2]
            float r0 = r0 * r1
            r1 = r20
            r2 = r15
            r3 = r12
            r2 = r2[r3]
            float r1 = r1 * r2
            r2 = 0
            org.lwjgl.opengl.GL11.glVertex3f(r0, r1, r2)
            r0 = r5
            boolean r0 = r0.textureFlag
            if (r0 == 0) goto L2c6
            r0 = r23
            r1 = r14
            r2 = r12
            r1 = r1[r2]
            float r0 = r0 * r1
            r1 = 1056964608(0x3f000000, float:0.5)
            float r0 = r0 + r1
            r1 = r23
            r2 = r15
            r3 = r12
            r2 = r2[r3]
            float r1 = r1 * r2
            r2 = 1056964608(0x3f000000, float:0.5)
            float r1 = r1 + r2
            org.lwjgl.opengl.GL11.glTexCoord2f(r0, r1)
        L2c6:
            r0 = r21
            r1 = r14
            r2 = r12
            r1 = r1[r2]
            float r0 = r0 * r1
            r1 = r21
            r2 = r15
            r3 = r12
            r2 = r2[r3]
            float r1 = r1 * r2
            r2 = 0
            org.lwjgl.opengl.GL11.glVertex3f(r0, r1, r2)
            goto L345
        L2dd:
            r0 = r5
            boolean r0 = r0.textureFlag
            if (r0 == 0) goto L2fd
            r0 = r23
            r1 = r14
            r2 = r12
            r1 = r1[r2]
            float r0 = r0 * r1
            r1 = 1056964608(0x3f000000, float:0.5)
            float r0 = r0 + r1
            r1 = r23
            r2 = r15
            r3 = r12
            r2 = r2[r3]
            float r1 = r1 * r2
            r2 = 1056964608(0x3f000000, float:0.5)
            float r1 = r1 + r2
            org.lwjgl.opengl.GL11.glTexCoord2f(r0, r1)
        L2fd:
            r0 = r21
            r1 = r14
            r2 = r12
            r1 = r1[r2]
            float r0 = r0 * r1
            r1 = r21
            r2 = r15
            r3 = r12
            r2 = r2[r3]
            float r1 = r1 * r2
            r2 = 0
            org.lwjgl.opengl.GL11.glVertex3f(r0, r1, r2)
            r0 = r5
            boolean r0 = r0.textureFlag
            if (r0 == 0) goto L331
            r0 = r22
            r1 = r14
            r2 = r12
            r1 = r1[r2]
            float r0 = r0 * r1
            r1 = 1056964608(0x3f000000, float:0.5)
            float r0 = r0 + r1
            r1 = r22
            r2 = r15
            r3 = r12
            r2 = r2[r3]
            float r1 = r1 * r2
            r2 = 1056964608(0x3f000000, float:0.5)
            float r1 = r1 + r2
            org.lwjgl.opengl.GL11.glTexCoord2f(r0, r1)
        L331:
            r0 = r20
            r1 = r14
            r2 = r12
            r1 = r1[r2]
            float r0 = r0 * r1
            r1 = r20
            r2 = r15
            r3 = r12
            r2 = r2[r3]
            float r1 = r1 * r2
            r2 = 0
            org.lwjgl.opengl.GL11.glVertex3f(r0, r1, r2)
        L345:
            int r12 = r12 + 1
            goto L263
        L34b:
            org.lwjgl.opengl.GL11.glEnd()
            int r13 = r13 + 1
            goto L21f
        L354:
            r0 = 0
            org.lwjgl.opengl.GL11.glBegin(r0)
            r0 = 0
            r12 = r0
        L35b:
            r0 = r12
            r1 = r25
            if (r0 >= r1) goto L3ca
            r0 = r14
            r1 = r12
            r0 = r0[r1]
            r17 = r0
            r0 = r15
            r1 = r12
            r0 = r0[r1]
            r18 = r0
            r0 = 0
            r13 = r0
        L373:
            r0 = r13
            r1 = r9
            if (r0 > r1) goto L3c4
            r0 = r7
            r1 = r19
            r2 = r13
            float r2 = (float) r2
            r3 = r9
            float r3 = (float) r3
            float r2 = r2 / r3
            float r1 = r1 * r2
            float r0 = r0 - r1
            r20 = r0
            r0 = r5
            boolean r0 = r0.textureFlag
            if (r0 == 0) goto L3b0
            r0 = r20
            r1 = r7
            float r0 = r0 / r1
            r1 = 1073741824(0x40000000, float:2.0)
            float r0 = r0 / r1
            r22 = r0
            r0 = r22
            r1 = r14
            r2 = r12
            r1 = r1[r2]
            float r0 = r0 * r1
            r1 = 1056964608(0x3f000000, float:0.5)
            float r0 = r0 + r1
            r1 = r22
            r2 = r15
            r3 = r12
            r2 = r2[r3]
            float r1 = r1 * r2
            r2 = 1056964608(0x3f000000, float:0.5)
            float r1 = r1 + r2
            org.lwjgl.opengl.GL11.glTexCoord2f(r0, r1)
        L3b0:
            r0 = r20
            r1 = r17
            float r0 = r0 * r1
            r1 = r20
            r2 = r18
            float r1 = r1 * r2
            r2 = 0
            org.lwjgl.opengl.GL11.glVertex3f(r0, r1, r2)
            int r13 = r13 + 1
            goto L373
        L3c4:
            int r12 = r12 + 1
            goto L35b
        L3ca:
            org.lwjgl.opengl.GL11.glEnd()
            goto L61d
        L3d0:
            r0 = r6
            r1 = r7
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto L41f
            r0 = 3
            org.lwjgl.opengl.GL11.glBegin(r0)
            r0 = 0
            r12 = r0
        L3dd:
            r0 = r12
            r1 = r8
            if (r0 > r1) goto L419
            r0 = r5
            boolean r0 = r0.textureFlag
            if (r0 == 0) goto L401
            r0 = r14
            r1 = r12
            r0 = r0[r1]
            r1 = 1073741824(0x40000000, float:2.0)
            float r0 = r0 / r1
            r1 = 1056964608(0x3f000000, float:0.5)
            float r0 = r0 + r1
            r1 = r15
            r2 = r12
            r1 = r1[r2]
            r2 = 1073741824(0x40000000, float:2.0)
            float r1 = r1 / r2
            r2 = 1056964608(0x3f000000, float:0.5)
            float r1 = r1 + r2
            org.lwjgl.opengl.GL11.glTexCoord2f(r0, r1)
        L401:
            r0 = r6
            r1 = r14
            r2 = r12
            r1 = r1[r2]
            float r0 = r0 * r1
            r1 = r6
            r2 = r15
            r3 = r12
            r2 = r2[r3]
            float r1 = r1 * r2
            r2 = 0
            org.lwjgl.opengl.GL11.glVertex3f(r0, r1, r2)
            int r12 = r12 + 1
            goto L3dd
        L419:
            org.lwjgl.opengl.GL11.glEnd()
            goto L61d
        L41f:
            r0 = 0
            r13 = r0
        L422:
            r0 = r13
            r1 = r9
            if (r0 > r1) goto L496
            r0 = r7
            r1 = r19
            r2 = r13
            float r2 = (float) r2
            r3 = r9
            float r3 = (float) r3
            float r2 = r2 / r3
            float r1 = r1 * r2
            float r0 = r0 - r1
            r20 = r0
            r0 = r5
            boolean r0 = r0.textureFlag
            if (r0 == 0) goto L446
            r0 = r20
            r1 = r7
            float r0 = r0 / r1
            r1 = 1073741824(0x40000000, float:2.0)
            float r0 = r0 / r1
            r22 = r0
        L446:
            r0 = 3
            org.lwjgl.opengl.GL11.glBegin(r0)
            r0 = 0
            r12 = r0
        L44d:
            r0 = r12
            r1 = r8
            if (r0 > r1) goto L48d
            r0 = r5
            boolean r0 = r0.textureFlag
            if (r0 == 0) goto L473
            r0 = r22
            r1 = r14
            r2 = r12
            r1 = r1[r2]
            float r0 = r0 * r1
            r1 = 1056964608(0x3f000000, float:0.5)
            float r0 = r0 + r1
            r1 = r22
            r2 = r15
            r3 = r12
            r2 = r2[r3]
            float r1 = r1 * r2
            r2 = 1056964608(0x3f000000, float:0.5)
            float r1 = r1 + r2
            org.lwjgl.opengl.GL11.glTexCoord2f(r0, r1)
        L473:
            r0 = r20
            r1 = r14
            r2 = r12
            r1 = r1[r2]
            float r0 = r0 * r1
            r1 = r20
            r2 = r15
            r3 = r12
            r2 = r2[r3]
            float r1 = r1 * r2
            r2 = 0
            org.lwjgl.opengl.GL11.glVertex3f(r0, r1, r2)
            int r12 = r12 + 1
            goto L44d
        L48d:
            org.lwjgl.opengl.GL11.glEnd()
            int r13 = r13 + 1
            goto L422
        L496:
            r0 = 0
            r12 = r0
        L499:
            r0 = r12
            r1 = r25
            if (r0 >= r1) goto L61d
            r0 = r14
            r1 = r12
            r0 = r0[r1]
            r17 = r0
            r0 = r15
            r1 = r12
            r0 = r0[r1]
            r18 = r0
            r0 = 3
            org.lwjgl.opengl.GL11.glBegin(r0)
            r0 = 0
            r13 = r0
        L4b5:
            r0 = r13
            r1 = r9
            if (r0 > r1) goto L50d
            r0 = r7
            r1 = r19
            r2 = r13
            float r2 = (float) r2
            r3 = r9
            float r3 = (float) r3
            float r2 = r2 / r3
            float r1 = r1 * r2
            float r0 = r0 - r1
            r20 = r0
            r0 = r5
            boolean r0 = r0.textureFlag
            if (r0 == 0) goto L4d9
            r0 = r20
            r1 = r7
            float r0 = r0 / r1
            r1 = 1073741824(0x40000000, float:2.0)
            float r0 = r0 / r1
            r22 = r0
        L4d9:
            r0 = r5
            boolean r0 = r0.textureFlag
            if (r0 == 0) goto L4f9
            r0 = r22
            r1 = r14
            r2 = r12
            r1 = r1[r2]
            float r0 = r0 * r1
            r1 = 1056964608(0x3f000000, float:0.5)
            float r0 = r0 + r1
            r1 = r22
            r2 = r15
            r3 = r12
            r2 = r2[r3]
            float r1 = r1 * r2
            r2 = 1056964608(0x3f000000, float:0.5)
            float r1 = r1 + r2
            org.lwjgl.opengl.GL11.glTexCoord2f(r0, r1)
        L4f9:
            r0 = r20
            r1 = r17
            float r0 = r0 * r1
            r1 = r20
            r2 = r18
            float r1 = r1 * r2
            r2 = 0
            org.lwjgl.opengl.GL11.glVertex3f(r0, r1, r2)
            int r13 = r13 + 1
            goto L4b5
        L50d:
            org.lwjgl.opengl.GL11.glEnd()
            int r12 = r12 + 1
            goto L499
        L516:
            r0 = r11
            r1 = 1135869952(0x43b40000, float:360.0)
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 >= 0) goto L599
            r0 = 0
            r12 = r0
        L521:
            r0 = r12
            r1 = r8
            if (r0 > r1) goto L599
            r0 = r14
            r1 = r12
            r0 = r0[r1]
            r17 = r0
            r0 = r15
            r1 = r12
            r0 = r0[r1]
            r18 = r0
            r0 = 3
            org.lwjgl.opengl.GL11.glBegin(r0)
            r0 = 0
            r13 = r0
        L53c:
            r0 = r13
            r1 = r9
            if (r0 > r1) goto L58d
            r0 = r7
            r1 = r19
            r2 = r13
            float r2 = (float) r2
            r3 = r9
            float r3 = (float) r3
            float r2 = r2 / r3
            float r1 = r1 * r2
            float r0 = r0 - r1
            r20 = r0
            r0 = r5
            boolean r0 = r0.textureFlag
            if (r0 == 0) goto L579
            r0 = r20
            r1 = r7
            float r0 = r0 / r1
            r1 = 1073741824(0x40000000, float:2.0)
            float r0 = r0 / r1
            r22 = r0
            r0 = r22
            r1 = r14
            r2 = r12
            r1 = r1[r2]
            float r0 = r0 * r1
            r1 = 1056964608(0x3f000000, float:0.5)
            float r0 = r0 + r1
            r1 = r22
            r2 = r15
            r3 = r12
            r2 = r2[r3]
            float r1 = r1 * r2
            r2 = 1056964608(0x3f000000, float:0.5)
            float r1 = r1 + r2
            org.lwjgl.opengl.GL11.glTexCoord2f(r0, r1)
        L579:
            r0 = r20
            r1 = r17
            float r0 = r0 * r1
            r1 = r20
            r2 = r18
            float r1 = r1 * r2
            r2 = 0
            org.lwjgl.opengl.GL11.glVertex3f(r0, r1, r2)
            int r13 = r13 + 1
            goto L53c
        L58d:
            org.lwjgl.opengl.GL11.glEnd()
            r0 = r12
            r1 = r8
            int r0 = r0 + r1
            r12 = r0
            goto L521
        L599:
            r0 = 0
            r13 = r0
        L59c:
            r0 = r13
            r1 = r9
            if (r0 > r1) goto L61d
            r0 = r7
            r1 = r19
            r2 = r13
            float r2 = (float) r2
            r3 = r9
            float r3 = (float) r3
            float r2 = r2 / r3
            float r1 = r1 * r2
            float r0 = r0 - r1
            r20 = r0
            r0 = r5
            boolean r0 = r0.textureFlag
            if (r0 == 0) goto L5c0
            r0 = r20
            r1 = r7
            float r0 = r0 / r1
            r1 = 1073741824(0x40000000, float:2.0)
            float r0 = r0 / r1
            r22 = r0
        L5c0:
            r0 = 3
            org.lwjgl.opengl.GL11.glBegin(r0)
            r0 = 0
            r12 = r0
        L5c7:
            r0 = r12
            r1 = r8
            if (r0 > r1) goto L607
            r0 = r5
            boolean r0 = r0.textureFlag
            if (r0 == 0) goto L5ed
            r0 = r22
            r1 = r14
            r2 = r12
            r1 = r1[r2]
            float r0 = r0 * r1
            r1 = 1056964608(0x3f000000, float:0.5)
            float r0 = r0 + r1
            r1 = r22
            r2 = r15
            r3 = r12
            r2 = r2[r3]
            float r1 = r1 * r2
            r2 = 1056964608(0x3f000000, float:0.5)
            float r1 = r1 + r2
            org.lwjgl.opengl.GL11.glTexCoord2f(r0, r1)
        L5ed:
            r0 = r20
            r1 = r14
            r2 = r12
            r1 = r1[r2]
            float r0 = r0 * r1
            r1 = r20
            r2 = r15
            r3 = r12
            r2 = r2[r3]
            float r1 = r1 * r2
            r2 = 0
            org.lwjgl.opengl.GL11.glVertex3f(r0, r1, r2)
            int r12 = r12 + 1
            goto L5c7
        L607:
            org.lwjgl.opengl.GL11.glEnd()
            r0 = r6
            r1 = r7
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto L613
            goto L61d
        L613:
            r0 = r13
            r1 = r9
            int r0 = r0 + r1
            r13 = r0
            goto L59c
        L61d:
            return
    }
}
