package org.lwjgl.opengl;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/opengl/DisplayMode.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/opengl/DisplayMode.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/opengl/DisplayMode.class */
public final class DisplayMode {
    private final int width;
    private final int height;
    private final int bpp;
    private final int freq;
    private final boolean fullscreen;

    public DisplayMode(int r8, int r9) {
            r7 = this;
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = 0
            r4 = 0
            r5 = 0
            r0.<init>(r1, r2, r3, r4, r5)
            return
    }

    DisplayMode(int r8, int r9, int r10, int r11) {
            r7 = this;
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            r5 = 1
            r0.<init>(r1, r2, r3, r4, r5)
            return
    }

    private DisplayMode(int r4, int r5, int r6, int r7, boolean r8) {
            r3 = this;
            r0 = r3
            r0.<init>()
            r0 = r3
            r1 = r4
            r0.width = r1
            r0 = r3
            r1 = r5
            r0.height = r1
            r0 = r3
            r1 = r6
            r0.bpp = r1
            r0 = r3
            r1 = r7
            r0.freq = r1
            r0 = r3
            r1 = r8
            r0.fullscreen = r1
            return
    }

    public boolean isFullscreenCapable() {
            r2 = this;
            r0 = r2
            boolean r0 = r0.fullscreen
            return r0
    }

    public int getWidth() {
            r2 = this;
            r0 = r2
            int r0 = r0.width
            return r0
    }

    public int getHeight() {
            r2 = this;
            r0 = r2
            int r0 = r0.height
            return r0
    }

    public int getBitsPerPixel() {
            r2 = this;
            r0 = r2
            int r0 = r0.bpp
            return r0
    }

    public int getFrequency() {
            r2 = this;
            r0 = r2
            int r0 = r0.freq
            return r0
    }

    public boolean equals(java.lang.Object r4) {
            r3 = this;
            r0 = r4
            if (r0 == 0) goto Lb
            r0 = r4
            boolean r0 = r0 instanceof org.lwjgl.opengl.DisplayMode
            if (r0 != 0) goto Ld
        Lb:
            r0 = 0
            return r0
        Ld:
            r0 = r4
            org.lwjgl.opengl.DisplayMode r0 = (org.lwjgl.opengl.DisplayMode) r0
            r5 = r0
            r0 = r5
            int r0 = r0.width
            r1 = r3
            int r1 = r1.width
            if (r0 != r1) goto L42
            r0 = r5
            int r0 = r0.height
            r1 = r3
            int r1 = r1.height
            if (r0 != r1) goto L42
            r0 = r5
            int r0 = r0.bpp
            r1 = r3
            int r1 = r1.bpp
            if (r0 != r1) goto L42
            r0 = r5
            int r0 = r0.freq
            r1 = r3
            int r1 = r1.freq
            if (r0 != r1) goto L42
            r0 = 1
            goto L43
        L42:
            r0 = 0
        L43:
            return r0
    }

    public int hashCode() {
            r3 = this;
            r0 = r3
            int r0 = r0.width
            r1 = r3
            int r1 = r1.height
            r0 = r0 ^ r1
            r1 = r3
            int r1 = r1.freq
            r0 = r0 ^ r1
            r1 = r3
            int r1 = r1.bpp
            r0 = r0 ^ r1
            return r0
    }

    public java.lang.String toString() {
            r4 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = r0
            r2 = 32
            r1.<init>(r2)
            r5 = r0
            r0 = r5
            r1 = r4
            int r1 = r1.width
            java.lang.StringBuilder r0 = r0.append(r1)
            r0 = r5
            java.lang.String r1 = " x "
            java.lang.StringBuilder r0 = r0.append(r1)
            r0 = r5
            r1 = r4
            int r1 = r1.height
            java.lang.StringBuilder r0 = r0.append(r1)
            r0 = r5
            java.lang.String r1 = " x "
            java.lang.StringBuilder r0 = r0.append(r1)
            r0 = r5
            r1 = r4
            int r1 = r1.bpp
            java.lang.StringBuilder r0 = r0.append(r1)
            r0 = r5
            java.lang.String r1 = " @"
            java.lang.StringBuilder r0 = r0.append(r1)
            r0 = r5
            r1 = r4
            int r1 = r1.freq
            java.lang.StringBuilder r0 = r0.append(r1)
            r0 = r5
            java.lang.String r1 = "Hz"
            java.lang.StringBuilder r0 = r0.append(r1)
            r0 = r5
            java.lang.String r0 = r0.toString()
            return r0
    }
}
