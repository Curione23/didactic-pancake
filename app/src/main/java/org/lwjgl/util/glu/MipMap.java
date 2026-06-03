package org.lwjgl.util.glu;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/util/glu/MipMap.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/util/glu/MipMap.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/util/glu/MipMap.class */
public class MipMap extends org.lwjgl.util.glu.Util {
    public MipMap() {
            r2 = this;
            r0 = r2
            r0.<init>()
            return
    }

    public static int gluBuild2DMipmaps(int r10, int r11, int r12, int r13, int r14, int r15, java.nio.ByteBuffer r16) {
            r0 = r12
            r1 = 1
            if (r0 < r1) goto La
            r0 = r13
            r1 = 1
            if (r0 >= r1) goto Ld
        La:
            r0 = 100901(0x18a25, float:1.41392E-40)
            return r0
        Ld:
            r0 = r14
            r1 = r15
            int r0 = bytesPerPixel(r0, r1)
            r17 = r0
            r0 = r17
            if (r0 != 0) goto L1e
            r0 = 100900(0x18a24, float:1.41391E-40)
            return r0
        L1e:
            r0 = 3379(0xd33, float:4.735E-42)
            int r0 = org.lwjgl.opengl.GL11.glGetInteger(r0)
            r18 = r0
            r0 = r12
            int r0 = nearestPower(r0)
            r19 = r0
            r0 = r19
            r1 = r18
            if (r0 <= r1) goto L37
            r0 = r18
            r19 = r0
        L37:
            r0 = r13
            int r0 = nearestPower(r0)
            r20 = r0
            r0 = r20
            r1 = r18
            if (r0 <= r1) goto L48
            r0 = r18
            r20 = r0
        L48:
            org.lwjgl.util.glu.PixelStoreState r0 = new org.lwjgl.util.glu.PixelStoreState
            r1 = r0
            r1.<init>()
            r21 = r0
            r0 = 3330(0xd02, float:4.666E-42)
            r1 = 0
            org.lwjgl.opengl.GL11.glPixelStorei(r0, r1)
            r0 = 3333(0xd05, float:4.67E-42)
            r1 = 1
            org.lwjgl.opengl.GL11.glPixelStorei(r0, r1)
            r0 = 3331(0xd03, float:4.668E-42)
            r1 = 0
            org.lwjgl.opengl.GL11.glPixelStorei(r0, r1)
            r0 = 3332(0xd04, float:4.669E-42)
            r1 = 0
            org.lwjgl.opengl.GL11.glPixelStorei(r0, r1)
            r0 = 0
            r23 = r0
            r0 = 0
            r24 = r0
            r0 = r19
            r1 = r12
            if (r0 != r1) goto L7f
            r0 = r20
            r1 = r13
            if (r0 == r1) goto Lce
        L7f:
            r0 = r19
            r1 = 4
            int r0 = r0 + r1
            r1 = r20
            int r0 = r0 * r1
            r1 = r17
            int r0 = r0 * r1
            java.nio.ByteBuffer r0 = org.lwjgl.BufferUtils.createByteBuffer(r0)
            r22 = r0
            r0 = r14
            r1 = r12
            r2 = r13
            r3 = r15
            r4 = r16
            r5 = r19
            r6 = r20
            r7 = r15
            r8 = r22
            int r0 = gluScaleImage(r0, r1, r2, r3, r4, r5, r6, r7, r8)
            r25 = r0
            r0 = r25
            if (r0 == 0) goto Laf
            r0 = r25
            r23 = r0
            r0 = 1
            r24 = r0
        Laf:
            r0 = 3314(0xcf2, float:4.644E-42)
            r1 = 0
            org.lwjgl.opengl.GL11.glPixelStorei(r0, r1)
            r0 = 3317(0xcf5, float:4.648E-42)
            r1 = 1
            org.lwjgl.opengl.GL11.glPixelStorei(r0, r1)
            r0 = 3315(0xcf3, float:4.645E-42)
            r1 = 0
            org.lwjgl.opengl.GL11.glPixelStorei(r0, r1)
            r0 = 3316(0xcf4, float:4.647E-42)
            r1 = 0
            org.lwjgl.opengl.GL11.glPixelStorei(r0, r1)
            goto Ld2
        Lce:
            r0 = r16
            r22 = r0
        Ld2:
            r0 = 0
            r25 = r0
            r0 = 0
            r26 = r0
            r0 = 0
            r27 = r0
        Ldb:
            r0 = r24
            if (r0 != 0) goto L1ba
            r0 = r22
            r1 = r16
            if (r0 == r1) goto L103
            r0 = 3314(0xcf2, float:4.644E-42)
            r1 = 0
            org.lwjgl.opengl.GL11.glPixelStorei(r0, r1)
            r0 = 3317(0xcf5, float:4.648E-42)
            r1 = 1
            org.lwjgl.opengl.GL11.glPixelStorei(r0, r1)
            r0 = 3315(0xcf3, float:4.645E-42)
            r1 = 0
            org.lwjgl.opengl.GL11.glPixelStorei(r0, r1)
            r0 = 3316(0xcf4, float:4.647E-42)
            r1 = 0
            org.lwjgl.opengl.GL11.glPixelStorei(r0, r1)
        L103:
            r0 = r10
            r1 = r27
            r2 = r11
            r3 = r19
            r4 = r20
            r5 = 0
            r6 = r14
            r7 = r15
            r8 = r22
            org.lwjgl.opengl.GL11.glTexImage2D(r0, r1, r2, r3, r4, r5, r6, r7, r8)
            r0 = r19
            r1 = 1
            if (r0 != r1) goto L124
            r0 = r20
            r1 = 1
            if (r0 != r1) goto L124
            goto L1ba
        L124:
            r0 = r19
            r1 = 2
            if (r0 >= r1) goto L12e
            r0 = 1
            goto L132
        L12e:
            r0 = r19
            r1 = 1
            int r0 = r0 >> r1
        L132:
            r28 = r0
            r0 = r20
            r1 = 2
            if (r0 >= r1) goto L13e
            r0 = 1
            goto L142
        L13e:
            r0 = r20
            r1 = 1
            int r0 = r0 >> r1
        L142:
            r29 = r0
            r0 = r25
            if (r0 != 0) goto L15e
            r0 = r28
            r1 = 4
            int r0 = r0 + r1
            r1 = r29
            int r0 = r0 * r1
            r1 = r17
            int r0 = r0 * r1
            java.nio.ByteBuffer r0 = org.lwjgl.BufferUtils.createByteBuffer(r0)
            r1 = r0
            r25 = r1
            r30 = r0
            goto L17c
        L15e:
            r0 = r26
            if (r0 != 0) goto L178
            r0 = r28
            r1 = 4
            int r0 = r0 + r1
            r1 = r29
            int r0 = r0 * r1
            r1 = r17
            int r0 = r0 * r1
            java.nio.ByteBuffer r0 = org.lwjgl.BufferUtils.createByteBuffer(r0)
            r1 = r0
            r26 = r1
            r30 = r0
            goto L17c
        L178:
            r0 = r26
            r30 = r0
        L17c:
            r0 = r14
            r1 = r19
            r2 = r20
            r3 = r15
            r4 = r22
            r5 = r28
            r6 = r29
            r7 = r15
            r8 = r30
            int r0 = gluScaleImage(r0, r1, r2, r3, r4, r5, r6, r7, r8)
            r31 = r0
            r0 = r31
            if (r0 == 0) goto L19f
            r0 = r31
            r23 = r0
            r0 = 1
            r24 = r0
        L19f:
            r0 = r30
            r22 = r0
            r0 = r26
            if (r0 == 0) goto L1ac
            r0 = r25
            r26 = r0
        L1ac:
            r0 = r28
            r19 = r0
            r0 = r29
            r20 = r0
            int r27 = r27 + 1
            goto Ldb
        L1ba:
            r0 = r21
            r0.save()
            r0 = r23
            return r0
    }

    public static int gluScaleImage(int r7, int r8, int r9, int r10, java.nio.ByteBuffer r11, int r12, int r13, int r14, java.nio.ByteBuffer r15) {
            r0 = r7
            int r0 = compPerPix(r0)
            r16 = r0
            r0 = r16
            r1 = -1
            if (r0 != r1) goto Lf
            r0 = 100900(0x18a24, float:1.41391E-40)
            return r0
        Lf:
            r0 = r8
            r1 = r9
            int r0 = r0 * r1
            r1 = r16
            int r0 = r0 * r1
            float[] r0 = new float[r0]
            r20 = r0
            r0 = r12
            r1 = r13
            int r0 = r0 * r1
            r1 = r16
            int r0 = r0 * r1
            float[] r0 = new float[r0]
            r21 = r0
            r0 = r10
            switch(r0) {
                case 5121: goto L40;
                case 5126: goto L46;
                default: goto L4c;
            }
        L40:
            r0 = 1
            r24 = r0
            goto L50
        L46:
            r0 = 4
            r24 = r0
            goto L50
        L4c:
            r0 = 1280(0x500, float:1.794E-42)
            return r0
        L50:
            r0 = r14
            switch(r0) {
                case 5121: goto L6c;
                case 5126: goto L72;
                default: goto L78;
            }
        L6c:
            r0 = 1
            r25 = r0
            goto L7c
        L72:
            r0 = 4
            r25 = r0
            goto L7c
        L78:
            r0 = 1280(0x500, float:1.794E-42)
            return r0
        L7c:
            org.lwjgl.util.glu.PixelStoreState r0 = new org.lwjgl.util.glu.PixelStoreState
            r1 = r0
            r1.<init>()
            r28 = r0
            r0 = r28
            int r0 = r0.unpackRowLength
            if (r0 <= 0) goto L97
            r0 = r28
            int r0 = r0.unpackRowLength
            r27 = r0
            goto L9a
        L97:
            r0 = r8
            r27 = r0
        L9a:
            r0 = r24
            r1 = r28
            int r1 = r1.unpackAlignment
            if (r0 < r1) goto Lae
            r0 = r16
            r1 = r27
            int r0 = r0 * r1
            r26 = r0
            goto Lc9
        Lae:
            r0 = r28
            int r0 = r0.unpackAlignment
            r1 = r24
            int r0 = r0 / r1
            r1 = r16
            r2 = r27
            int r1 = r1 * r2
            r2 = r24
            int r1 = r1 * r2
            r2 = r28
            int r2 = r2.unpackAlignment
            int r1 = ceil(r1, r2)
            int r0 = r0 * r1
            r26 = r0
        Lc9:
            r0 = r10
            switch(r0) {
                case 5121: goto Le4;
                case 5126: goto L13e;
                default: goto L195;
            }
        Le4:
            r0 = 0
            r19 = r0
            r0 = r11
            java.nio.Buffer r0 = r0.rewind()
            r0 = 0
            r17 = r0
        Lf0:
            r0 = r17
            r1 = r9
            if (r0 >= r1) goto L198
            r0 = r17
            r1 = r26
            int r0 = r0 * r1
            r1 = r28
            int r1 = r1.unpackSkipRows
            r2 = r26
            int r1 = r1 * r2
            int r0 = r0 + r1
            r1 = r28
            int r1 = r1.unpackSkipPixels
            r2 = r16
            int r1 = r1 * r2
            int r0 = r0 + r1
            r29 = r0
            r0 = 0
            r18 = r0
        L112:
            r0 = r18
            r1 = r8
            r2 = r16
            int r1 = r1 * r2
            if (r0 >= r1) goto L138
            r0 = r20
            r1 = r19
            int r19 = r19 + 1
            r2 = r11
            r3 = r29
            int r29 = r29 + 1
            byte r2 = r2.get(r3)
            r3 = 255(0xff, float:3.57E-43)
            r2 = r2 & r3
            float r2 = (float) r2
            r0[r1] = r2
            int r18 = r18 + 1
            goto L112
        L138:
            int r17 = r17 + 1
            goto Lf0
        L13e:
            r0 = 0
            r19 = r0
            r0 = r11
            java.nio.Buffer r0 = r0.rewind()
            r0 = 0
            r17 = r0
        L14a:
            r0 = r17
            r1 = r9
            if (r0 >= r1) goto L198
            r0 = 4
            r1 = r17
            r2 = r26
            int r1 = r1 * r2
            r2 = r28
            int r2 = r2.unpackSkipRows
            r3 = r26
            int r2 = r2 * r3
            int r1 = r1 + r2
            r2 = r28
            int r2 = r2.unpackSkipPixels
            r3 = r16
            int r2 = r2 * r3
            int r1 = r1 + r2
            int r0 = r0 * r1
            r29 = r0
            r0 = 0
            r18 = r0
        L16e:
            r0 = r18
            r1 = r8
            r2 = r16
            int r1 = r1 * r2
            if (r0 >= r1) goto L18f
            r0 = r20
            r1 = r19
            int r19 = r19 + 1
            r2 = r11
            r3 = r29
            float r2 = r2.getFloat(r3)
            r0[r1] = r2
            int r29 = r29 + 4
            int r18 = r18 + 1
            goto L16e
        L18f:
            int r17 = r17 + 1
            goto L14a
        L195:
            r0 = 100900(0x18a24, float:1.41391E-40)
            return r0
        L198:
            r0 = r8
            float r0 = (float) r0
            r1 = r12
            float r1 = (float) r1
            float r0 = r0 / r1
            r22 = r0
            r0 = r9
            float r0 = (float) r0
            r1 = r13
            float r1 = (float) r1
            float r0 = r0 / r1
            r23 = r0
            r0 = r16
            float[] r0 = new float[r0]
            r29 = r0
            r0 = 0
            r32 = r0
        L1b1:
            r0 = r32
            r1 = r13
            if (r0 >= r1) goto L2c2
            r0 = 0
            r33 = r0
        L1bb:
            r0 = r33
            r1 = r12
            if (r0 >= r1) goto L2bc
            r0 = r33
            float r0 = (float) r0
            r1 = r22
            float r0 = r0 * r1
            int r0 = (int) r0
            r34 = r0
            r0 = r33
            r1 = 1
            int r0 = r0 + r1
            float r0 = (float) r0
            r1 = r22
            float r0 = r0 * r1
            int r0 = (int) r0
            r35 = r0
            r0 = r32
            float r0 = (float) r0
            r1 = r23
            float r0 = r0 * r1
            int r0 = (int) r0
            r36 = r0
            r0 = r32
            r1 = 1
            int r0 = r0 + r1
            float r0 = (float) r0
            r1 = r23
            float r0 = r0 * r1
            int r0 = (int) r0
            r37 = r0
            r0 = 0
            r38 = r0
            r0 = 0
            r39 = r0
        L1f0:
            r0 = r39
            r1 = r16
            if (r0 >= r1) goto L203
            r0 = r29
            r1 = r39
            r2 = 0
            r0[r1] = r2
            int r39 = r39 + 1
            goto L1f0
        L203:
            r0 = r34
            r39 = r0
        L207:
            r0 = r39
            r1 = r35
            if (r0 >= r1) goto L254
            r0 = r36
            r40 = r0
        L212:
            r0 = r40
            r1 = r37
            if (r0 >= r1) goto L24e
            r0 = r40
            r1 = r8
            int r0 = r0 * r1
            r1 = r39
            int r0 = r0 + r1
            r1 = r16
            int r0 = r0 * r1
            r30 = r0
            r0 = 0
            r41 = r0
        L228:
            r0 = r41
            r1 = r16
            if (r0 >= r1) goto L245
            r0 = r29
            r1 = r41
            r2 = r0; r3 = r1; 
            r2 = r2[r3]
            r3 = r20
            r4 = r30
            r5 = r41
            int r4 = r4 + r5
            r3 = r3[r4]
            float r2 = r2 + r3
            r0[r1] = r2
            int r41 = r41 + 1
            goto L228
        L245:
            int r38 = r38 + 1
            int r40 = r40 + 1
            goto L212
        L24e:
            int r39 = r39 + 1
            goto L207
        L254:
            r0 = r32
            r1 = r12
            int r0 = r0 * r1
            r1 = r33
            int r0 = r0 + r1
            r1 = r16
            int r0 = r0 * r1
            r31 = r0
            r0 = r38
            if (r0 != 0) goto L295
            r0 = r36
            r1 = r8
            int r0 = r0 * r1
            r1 = r34
            int r0 = r0 + r1
            r1 = r16
            int r0 = r0 * r1
            r30 = r0
            r0 = 0
            r39 = r0
        L275:
            r0 = r39
            r1 = r16
            if (r0 >= r1) goto L292
            r0 = r21
            r1 = r31
            int r31 = r31 + 1
            r2 = r20
            r3 = r30
            r4 = r39
            int r3 = r3 + r4
            r2 = r2[r3]
            r0[r1] = r2
            int r39 = r39 + 1
            goto L275
        L292:
            goto L2b6
        L295:
            r0 = 0
            r19 = r0
        L298:
            r0 = r19
            r1 = r16
            if (r0 >= r1) goto L2b6
            r0 = r21
            r1 = r31
            int r31 = r31 + 1
            r2 = r29
            r3 = r19
            r2 = r2[r3]
            r3 = r38
            float r3 = (float) r3
            float r2 = r2 / r3
            r0[r1] = r2
            int r19 = r19 + 1
            goto L298
        L2b6:
            int r33 = r33 + 1
            goto L1bb
        L2bc:
            int r32 = r32 + 1
            goto L1b1
        L2c2:
            r0 = r28
            int r0 = r0.packRowLength
            if (r0 <= 0) goto L2d4
            r0 = r28
            int r0 = r0.packRowLength
            r27 = r0
            goto L2d8
        L2d4:
            r0 = r12
            r27 = r0
        L2d8:
            r0 = r25
            r1 = r28
            int r1 = r1.packAlignment
            if (r0 < r1) goto L2ec
            r0 = r16
            r1 = r27
            int r0 = r0 * r1
            r26 = r0
            goto L307
        L2ec:
            r0 = r28
            int r0 = r0.packAlignment
            r1 = r25
            int r0 = r0 / r1
            r1 = r16
            r2 = r27
            int r1 = r1 * r2
            r2 = r25
            int r1 = r1 * r2
            r2 = r28
            int r2 = r2.packAlignment
            int r1 = ceil(r1, r2)
            int r0 = r0 * r1
            r26 = r0
        L307:
            r0 = r14
            switch(r0) {
                case 5121: goto L324;
                case 5126: goto L378;
                default: goto L3cc;
            }
        L324:
            r0 = 0
            r19 = r0
            r0 = 0
            r17 = r0
        L32a:
            r0 = r17
            r1 = r13
            if (r0 >= r1) goto L3cf
            r0 = r17
            r1 = r26
            int r0 = r0 * r1
            r1 = r28
            int r1 = r1.packSkipRows
            r2 = r26
            int r1 = r1 * r2
            int r0 = r0 + r1
            r1 = r28
            int r1 = r1.packSkipPixels
            r2 = r16
            int r1 = r1 * r2
            int r0 = r0 + r1
            r32 = r0
            r0 = 0
            r18 = r0
        L34d:
            r0 = r18
            r1 = r12
            r2 = r16
            int r1 = r1 * r2
            if (r0 >= r1) goto L372
            r0 = r15
            r1 = r32
            int r32 = r32 + 1
            r2 = r21
            r3 = r19
            int r19 = r19 + 1
            r2 = r2[r3]
            int r2 = (int) r2
            byte r2 = (byte) r2
            java.nio.ByteBuffer r0 = r0.put(r1, r2)
            int r18 = r18 + 1
            goto L34d
        L372:
            int r17 = r17 + 1
            goto L32a
        L378:
            r0 = 0
            r19 = r0
            r0 = 0
            r17 = r0
        L37e:
            r0 = r17
            r1 = r13
            if (r0 >= r1) goto L3cf
            r0 = 4
            r1 = r17
            r2 = r26
            int r1 = r1 * r2
            r2 = r28
            int r2 = r2.unpackSkipRows
            r3 = r26
            int r2 = r2 * r3
            int r1 = r1 + r2
            r2 = r28
            int r2 = r2.unpackSkipPixels
            r3 = r16
            int r2 = r2 * r3
            int r1 = r1 + r2
            int r0 = r0 * r1
            r32 = r0
            r0 = 0
            r18 = r0
        L3a3:
            r0 = r18
            r1 = r12
            r2 = r16
            int r1 = r1 * r2
            if (r0 >= r1) goto L3c6
            r0 = r15
            r1 = r32
            r2 = r21
            r3 = r19
            int r19 = r19 + 1
            r2 = r2[r3]
            java.nio.ByteBuffer r0 = r0.putFloat(r1, r2)
            int r32 = r32 + 4
            int r18 = r18 + 1
            goto L3a3
        L3c6:
            int r17 = r17 + 1
            goto L37e
        L3cc:
            r0 = 100900(0x18a24, float:1.41391E-40)
            return r0
        L3cf:
            r0 = 0
            return r0
    }
}
