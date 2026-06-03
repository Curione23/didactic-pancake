package org.lwjgl.util.glu;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/util/glu/Util.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/util/glu/Util.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/util/glu/Util.class */
public class Util {
    public Util() {
            r2 = this;
            r0 = r2
            r0.<init>()
            return
    }

    protected static int ceil(int r3, int r4) {
            r0 = r3
            r1 = r4
            int r0 = r0 % r1
            if (r0 != 0) goto Lc
            r0 = r3
            r1 = r4
            int r0 = r0 / r1
            goto L11
        Lc:
            r0 = r3
            r1 = r4
            int r0 = r0 / r1
            r1 = 1
            int r0 = r0 + r1
        L11:
            return r0
    }

    protected static float[] normalize(float[] r5) {
            r0 = r5
            r1 = 0
            r0 = r0[r1]
            r1 = r5
            r2 = 0
            r1 = r1[r2]
            float r0 = r0 * r1
            r1 = r5
            r2 = 1
            r1 = r1[r2]
            r2 = r5
            r3 = 1
            r2 = r2[r3]
            float r1 = r1 * r2
            float r0 = r0 + r1
            r1 = r5
            r2 = 2
            r1 = r1[r2]
            r2 = r5
            r3 = 2
            r2 = r2[r3]
            float r1 = r1 * r2
            float r0 = r0 + r1
            double r0 = (double) r0
            double r0 = java.lang.Math.sqrt(r0)
            float r0 = (float) r0
            r6 = r0
            r0 = r6
            double r0 = (double) r0
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto L26
            r0 = r5
            return r0
        L26:
            r0 = 1065353216(0x3f800000, float:1.0)
            r1 = r6
            float r0 = r0 / r1
            r6 = r0
            r0 = r5
            r1 = 0
            r2 = r0; r3 = r1; 
            r2 = r2[r3]
            r3 = r6
            float r2 = r2 * r3
            r0[r1] = r2
            r0 = r5
            r1 = 1
            r2 = r0; r3 = r1; 
            r2 = r2[r3]
            r3 = r6
            float r2 = r2 * r3
            r0[r1] = r2
            r0 = r5
            r1 = 2
            r2 = r0; r3 = r1; 
            r2 = r2[r3]
            r3 = r6
            float r2 = r2 * r3
            r0[r1] = r2
            r0 = r5
            return r0
    }

    protected static void cross(float[] r7, float[] r8, float[] r9) {
            r0 = r9
            r1 = 0
            r2 = r7
            r3 = 1
            r2 = r2[r3]
            r3 = r8
            r4 = 2
            r3 = r3[r4]
            float r2 = r2 * r3
            r3 = r7
            r4 = 2
            r3 = r3[r4]
            r4 = r8
            r5 = 1
            r4 = r4[r5]
            float r3 = r3 * r4
            float r2 = r2 - r3
            r0[r1] = r2
            r0 = r9
            r1 = 1
            r2 = r7
            r3 = 2
            r2 = r2[r3]
            r3 = r8
            r4 = 0
            r3 = r3[r4]
            float r2 = r2 * r3
            r3 = r7
            r4 = 0
            r3 = r3[r4]
            r4 = r8
            r5 = 2
            r4 = r4[r5]
            float r3 = r3 * r4
            float r2 = r2 - r3
            r0[r1] = r2
            r0 = r9
            r1 = 2
            r2 = r7
            r3 = 0
            r2 = r2[r3]
            r3 = r8
            r4 = 1
            r3 = r3[r4]
            float r2 = r2 * r3
            r3 = r7
            r4 = 1
            r3 = r3[r4]
            r4 = r8
            r5 = 0
            r4 = r4[r5]
            float r3 = r3 * r4
            float r2 = r2 - r3
            r0[r1] = r2
            return
    }

    protected static int compPerPix(int r2) {
            r0 = r2
            switch(r0) {
                case 6400: goto L74;
                case 6401: goto L74;
                case 6402: goto L74;
                case 6403: goto L74;
                case 6404: goto L74;
                case 6405: goto L74;
                case 6406: goto L74;
                case 6407: goto L78;
                case 6408: goto L7a;
                case 6409: goto L74;
                case 6410: goto L76;
                case 32992: goto L78;
                case 32993: goto L7a;
                default: goto L7c;
            }
        L74:
            r0 = 1
            return r0
        L76:
            r0 = 2
            return r0
        L78:
            r0 = 3
            return r0
        L7a:
            r0 = 4
            return r0
        L7c:
            r0 = -1
            return r0
    }

    protected static int nearestPower(int r3) {
            r0 = 1
            r4 = r0
            r0 = r3
            if (r0 != 0) goto L8
            r0 = -1
            return r0
        L8:
            r0 = r3
            r1 = 1
            if (r0 != r1) goto Lf
            r0 = r4
            return r0
        Lf:
            r0 = r3
            r1 = 3
            if (r0 != r1) goto L18
            r0 = r4
            r1 = 2
            int r0 = r0 << r1
            return r0
        L18:
            r0 = r3
            r1 = 1
            int r0 = r0 >> r1
            r3 = r0
            r0 = r4
            r1 = 1
            int r0 = r0 << r1
            r4 = r0
            goto L8
    }

    protected static int bytesPerPixel(int r3, int r4) {
            r0 = r3
            switch(r0) {
                case 6400: goto L74;
                case 6401: goto L74;
                case 6402: goto L74;
                case 6403: goto L74;
                case 6404: goto L74;
                case 6405: goto L74;
                case 6406: goto L74;
                case 6407: goto L7e;
                case 6408: goto L83;
                case 6409: goto L74;
                case 6410: goto L79;
                case 32992: goto L7e;
                case 32993: goto L83;
                default: goto L88;
            }
        L74:
            r0 = 1
            r5 = r0
            goto L8a
        L79:
            r0 = 2
            r5 = r0
            goto L8a
        L7e:
            r0 = 3
            r5 = r0
            goto L8a
        L83:
            r0 = 4
            r5 = r0
            goto L8a
        L88:
            r0 = 0
            r5 = r0
        L8a:
            r0 = r4
            switch(r0) {
                case 5120: goto Ld9;
                case 5121: goto Ld4;
                case 5122: goto Le8;
                case 5123: goto Le3;
                case 5124: goto Lf2;
                case 5125: goto Led;
                case 5126: goto Lf7;
                case 6656: goto Lde;
                default: goto Lfc;
            }
        Ld4:
            r0 = 1
            r6 = r0
            goto Lfe
        Ld9:
            r0 = 1
            r6 = r0
            goto Lfe
        Lde:
            r0 = 1
            r6 = r0
            goto Lfe
        Le3:
            r0 = 2
            r6 = r0
            goto Lfe
        Le8:
            r0 = 2
            r6 = r0
            goto Lfe
        Led:
            r0 = 4
            r6 = r0
            goto Lfe
        Lf2:
            r0 = 4
            r6 = r0
            goto Lfe
        Lf7:
            r0 = 4
            r6 = r0
            goto Lfe
        Lfc:
            r0 = 0
            r6 = r0
        Lfe:
            r0 = r5
            r1 = r6
            int r0 = r0 * r1
            return r0
    }
}
