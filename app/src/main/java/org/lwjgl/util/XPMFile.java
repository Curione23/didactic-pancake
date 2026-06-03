package org.lwjgl.util;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/util/XPMFile.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/util/XPMFile.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/util/XPMFile.class */
public class XPMFile {
    private byte[] bytes;
    private static final int WIDTH = 0;
    private static final int HEIGHT = 1;
    private static final int NUMBER_OF_COLORS = 2;
    private static final int CHARACTERS_PER_PIXEL = 3;
    private static int[] format;

    private XPMFile() {
            r2 = this;
            r0 = r2
            r0.<init>()
            return
    }

    public static org.lwjgl.util.XPMFile load(java.lang.String r6) throws java.io.IOException {
            java.io.FileInputStream r0 = new java.io.FileInputStream
            r1 = r0
            java.io.File r2 = new java.io.File
            r3 = r2
            r4 = r6
            r3.<init>(r4)
            r1.<init>(r2)
            org.lwjgl.util.XPMFile r0 = load(r0)
            return r0
    }

    public static org.lwjgl.util.XPMFile load(java.io.InputStream r3) {
            org.lwjgl.util.XPMFile r0 = new org.lwjgl.util.XPMFile
            r1 = r0
            r1.<init>()
            r4 = r0
            r0 = r4
            r1 = r3
            r0.readImage(r1)
            r0 = r4
            return r0
    }

    public int getHeight() {
            r3 = this;
            int[] r0 = org.lwjgl.util.XPMFile.format
            r1 = 1
            r0 = r0[r1]
            return r0
    }

    public int getWidth() {
            r3 = this;
            int[] r0 = org.lwjgl.util.XPMFile.format
            r1 = 0
            r0 = r0[r1]
            return r0
    }

    public byte[] getBytes() {
            r2 = this;
            r0 = r2
            byte[] r0 = r0.bytes
            return r0
    }

    private void readImage(java.io.InputStream r7) {
            r6 = this;
            java.io.LineNumberReader r0 = new java.io.LineNumberReader     // Catch: java.lang.Exception -> L88
            r1 = r0
            java.io.InputStreamReader r2 = new java.io.InputStreamReader     // Catch: java.lang.Exception -> L88
            r3 = r2
            r4 = r7
            r3.<init>(r4)     // Catch: java.lang.Exception -> L88
            r1.<init>(r2)     // Catch: java.lang.Exception -> L88
            r8 = r0
            java.util.HashMap r0 = new java.util.HashMap     // Catch: java.lang.Exception -> L88
            r1 = r0
            r1.<init>()     // Catch: java.lang.Exception -> L88
            r9 = r0
            r0 = r8
            java.lang.String r0 = nextLineOfInterest(r0)     // Catch: java.lang.Exception -> L88
            int[] r0 = parseFormat(r0)     // Catch: java.lang.Exception -> L88
            org.lwjgl.util.XPMFile.format = r0     // Catch: java.lang.Exception -> L88
            r0 = 0
            r10 = r0
        L25:
            r0 = r10
            int[] r1 = org.lwjgl.util.XPMFile.format     // Catch: java.lang.Exception -> L88
            r2 = 2
            r1 = r1[r2]     // Catch: java.lang.Exception -> L88
            if (r0 >= r1) goto L51
            r0 = r8
            java.lang.String r0 = nextLineOfInterest(r0)     // Catch: java.lang.Exception -> L88
            java.lang.Object[] r0 = parseColor(r0)     // Catch: java.lang.Exception -> L88
            r11 = r0
            r0 = r9
            r1 = r11
            r2 = 0
            r1 = r1[r2]     // Catch: java.lang.Exception -> L88
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Exception -> L88
            r2 = r11
            r3 = 1
            r2 = r2[r3]     // Catch: java.lang.Exception -> L88
            java.lang.Integer r2 = (java.lang.Integer) r2     // Catch: java.lang.Exception -> L88
            java.lang.Object r0 = r0.put(r1, r2)     // Catch: java.lang.Exception -> L88
            int r10 = r10 + 1
            goto L25
        L51:
            r0 = r6
            int[] r1 = org.lwjgl.util.XPMFile.format     // Catch: java.lang.Exception -> L88
            r2 = 0
            r1 = r1[r2]     // Catch: java.lang.Exception -> L88
            int[] r2 = org.lwjgl.util.XPMFile.format     // Catch: java.lang.Exception -> L88
            r3 = 1
            r2 = r2[r3]     // Catch: java.lang.Exception -> L88
            int r1 = r1 * r2
            r2 = 4
            int r1 = r1 * r2
            byte[] r1 = new byte[r1]     // Catch: java.lang.Exception -> L88
            r0.bytes = r1     // Catch: java.lang.Exception -> L88
            r0 = 0
            r10 = r0
        L67:
            r0 = r10
            int[] r1 = org.lwjgl.util.XPMFile.format     // Catch: java.lang.Exception -> L88
            r2 = 1
            r1 = r1[r2]     // Catch: java.lang.Exception -> L88
            if (r0 >= r1) goto L85
            r0 = r6
            r1 = r8
            java.lang.String r1 = nextLineOfInterest(r1)     // Catch: java.lang.Exception -> L88
            int[] r2 = org.lwjgl.util.XPMFile.format     // Catch: java.lang.Exception -> L88
            r3 = r9
            r4 = r10
            r0.parseImageLine(r1, r2, r3, r4)     // Catch: java.lang.Exception -> L88
            int r10 = r10 + 1
            goto L67
        L85:
            goto L97
        L88:
            r8 = move-exception
            r0 = r8
            r0.printStackTrace()
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r1 = r0
            java.lang.String r2 = "Unable to parse XPM File"
            r1.<init>(r2)
            throw r0
        L97:
            return
    }

    private static java.lang.String nextLineOfInterest(java.io.LineNumberReader r5) throws java.io.IOException {
        L0:
            r0 = r5
            java.lang.String r0 = r0.readLine()
            r6 = r0
            r0 = r6
            java.lang.String r1 = "\""
            boolean r0 = r0.startsWith(r1)
            if (r0 == 0) goto L0
            r0 = r6
            r1 = 1
            r2 = r6
            r3 = 34
            int r2 = r2.lastIndexOf(r3)
            java.lang.String r0 = r0.substring(r1, r2)
            return r0
    }

    private static int[] parseFormat(java.lang.String r5) {
            java.util.StringTokenizer r0 = new java.util.StringTokenizer
            r1 = r0
            r2 = r5
            r1.<init>(r2)
            r6 = r0
            r0 = 4
            int[] r0 = new int[r0]
            r1 = r0
            r2 = 0
            r3 = r6
            java.lang.String r3 = r3.nextToken()
            int r3 = java.lang.Integer.parseInt(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 1
            r3 = r6
            java.lang.String r3 = r3.nextToken()
            int r3 = java.lang.Integer.parseInt(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 2
            r3 = r6
            java.lang.String r3 = r3.nextToken()
            int r3 = java.lang.Integer.parseInt(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 3
            r3 = r6
            java.lang.String r3 = r3.nextToken()
            int r3 = java.lang.Integer.parseInt(r3)
            r1[r2] = r3
            return r0
    }

    private static java.lang.Object[] parseColor(java.lang.String r6) {
            r0 = r6
            r1 = 0
            int[] r2 = org.lwjgl.util.XPMFile.format
            r3 = 3
            r2 = r2[r3]
            java.lang.String r0 = r0.substring(r1, r2)
            r7 = r0
            r0 = r6
            int[] r1 = org.lwjgl.util.XPMFile.format
            r2 = 3
            r1 = r1[r2]
            r2 = 4
            int r1 = r1 + r2
            java.lang.String r0 = r0.substring(r1)
            r8 = r0
            r0 = 2
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r1 = r0
            r2 = 0
            r3 = r7
            r1[r2] = r3
            r1 = r0
            r2 = 1
            r3 = r8
            r4 = 16
            int r3 = java.lang.Integer.parseInt(r3, r4)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r1[r2] = r3
            return r0
    }

    private void parseImageLine(java.lang.String r7, int[] r8, java.util.HashMap<java.lang.String, java.lang.Integer> r9, int r10) {
            r6 = this;
            r0 = r10
            r1 = 4
            int r0 = r0 * r1
            r1 = r8
            r2 = 0
            r1 = r1[r2]
            int r0 = r0 * r1
            r11 = r0
            r0 = 0
            r12 = r0
        Ld:
            r0 = r12
            r1 = r8
            r2 = 0
            r1 = r1[r2]
            if (r0 >= r1) goto L91
            r0 = r7
            r1 = r12
            r2 = r8
            r3 = 3
            r2 = r2[r3]
            int r1 = r1 * r2
            r2 = r12
            r3 = r8
            r4 = 3
            r3 = r3[r4]
            int r2 = r2 * r3
            r3 = r8
            r4 = 3
            r3 = r3[r4]
            int r2 = r2 + r3
            java.lang.String r0 = r0.substring(r1, r2)
            r13 = r0
            r0 = r9
            r1 = r13
            java.lang.Object r0 = r0.get(r1)
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            r14 = r0
            r0 = r6
            byte[] r0 = r0.bytes
            r1 = r11
            r2 = r12
            r3 = 4
            int r2 = r2 * r3
            int r1 = r1 + r2
            r2 = r14
            r3 = 16711680(0xff0000, float:2.3418052E-38)
            r2 = r2 & r3
            r3 = 16
            int r2 = r2 >> r3
            byte r2 = (byte) r2
            r0[r1] = r2
            r0 = r6
            byte[] r0 = r0.bytes
            r1 = r11
            r2 = r12
            r3 = 4
            int r2 = r2 * r3
            r3 = 1
            int r2 = r2 + r3
            int r1 = r1 + r2
            r2 = r14
            r3 = 65280(0xff00, float:9.1477E-41)
            r2 = r2 & r3
            r3 = 8
            int r2 = r2 >> r3
            byte r2 = (byte) r2
            r0[r1] = r2
            r0 = r6
            byte[] r0 = r0.bytes
            r1 = r11
            r2 = r12
            r3 = 4
            int r2 = r2 * r3
            r3 = 2
            int r2 = r2 + r3
            int r1 = r1 + r2
            r2 = r14
            r3 = 255(0xff, float:3.57E-43)
            r2 = r2 & r3
            r3 = 0
            int r2 = r2 >> r3
            byte r2 = (byte) r2
            r0[r1] = r2
            r0 = r6
            byte[] r0 = r0.bytes
            r1 = r11
            r2 = r12
            r3 = 4
            int r2 = r2 * r3
            r3 = 3
            int r2 = r2 + r3
            int r1 = r1 + r2
            r2 = -1
            r0[r1] = r2
            int r12 = r12 + 1
            goto Ld
        L91:
            return
    }

    public static void main(java.lang.String[] r8) {
            r0 = r8
            int r0 = r0.length
            r1 = 1
            if (r0 == r1) goto Le
            java.io.PrintStream r0 = java.lang.System.out
            java.lang.String r1 = "usage:\nXPMFile <file>"
            r0.println(r1)
        Le:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L5d
            r1 = r0
            r1.<init>()     // Catch: java.lang.Exception -> L5d
            r1 = r8
            r2 = 0
            r1 = r1[r2]     // Catch: java.lang.Exception -> L5d
            r2 = 0
            r3 = r8
            r4 = 0
            r3 = r3[r4]     // Catch: java.lang.Exception -> L5d
            java.lang.String r4 = "."
            int r3 = r3.indexOf(r4)     // Catch: java.lang.Exception -> L5d
            java.lang.String r1 = r1.substring(r2, r3)     // Catch: java.lang.Exception -> L5d
            java.lang.StringBuilder r0 = r0.append(r1)     // Catch: java.lang.Exception -> L5d
            java.lang.String r1 = ".raw"
            java.lang.StringBuilder r0 = r0.append(r1)     // Catch: java.lang.Exception -> L5d
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Exception -> L5d
            r9 = r0
            r0 = r8
            r1 = 0
            r0 = r0[r1]     // Catch: java.lang.Exception -> L5d
            org.lwjgl.util.XPMFile r0 = load(r0)     // Catch: java.lang.Exception -> L5d
            r10 = r0
            java.io.BufferedOutputStream r0 = new java.io.BufferedOutputStream     // Catch: java.lang.Exception -> L5d
            r1 = r0
            java.io.FileOutputStream r2 = new java.io.FileOutputStream     // Catch: java.lang.Exception -> L5d
            r3 = r2
            java.io.File r4 = new java.io.File     // Catch: java.lang.Exception -> L5d
            r5 = r4
            r6 = r9
            r5.<init>(r6)     // Catch: java.lang.Exception -> L5d
            r3.<init>(r4)     // Catch: java.lang.Exception -> L5d
            r1.<init>(r2)     // Catch: java.lang.Exception -> L5d
            r11 = r0
            r0 = r11
            r1 = r10
            byte[] r1 = r1.getBytes()     // Catch: java.lang.Exception -> L5d
            r0.write(r1)     // Catch: java.lang.Exception -> L5d
            r0 = r11
            r0.close()     // Catch: java.lang.Exception -> L5d
            goto L62
        L5d:
            r9 = move-exception
            r0 = r9
            r0.printStackTrace()
        L62:
            return
    }

    static {
            r0 = 4
            int[] r0 = new int[r0]
            org.lwjgl.util.XPMFile.format = r0
            return
    }
}
