package org.lwjgl.util;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/util/ReadableColor.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/util/ReadableColor.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/util/ReadableColor.class */
public interface ReadableColor {
    public static final org.lwjgl.util.ReadableColor RED = null;
    public static final org.lwjgl.util.ReadableColor ORANGE = null;
    public static final org.lwjgl.util.ReadableColor YELLOW = null;
    public static final org.lwjgl.util.ReadableColor GREEN = null;
    public static final org.lwjgl.util.ReadableColor CYAN = null;
    public static final org.lwjgl.util.ReadableColor BLUE = null;
    public static final org.lwjgl.util.ReadableColor PURPLE = null;
    public static final org.lwjgl.util.ReadableColor WHITE = null;
    public static final org.lwjgl.util.ReadableColor BLACK = null;
    public static final org.lwjgl.util.ReadableColor LTGREY = null;
    public static final org.lwjgl.util.ReadableColor DKGREY = null;
    public static final org.lwjgl.util.ReadableColor GREY = null;

    int getRed();

    int getGreen();

    int getBlue();

    int getAlpha();

    byte getRedByte();

    byte getGreenByte();

    byte getBlueByte();

    byte getAlphaByte();

    void writeRGBA(java.nio.ByteBuffer r1);

    void writeRGB(java.nio.ByteBuffer r1);

    void writeABGR(java.nio.ByteBuffer r1);

    void writeBGR(java.nio.ByteBuffer r1);

    void writeBGRA(java.nio.ByteBuffer r1);

    void writeARGB(java.nio.ByteBuffer r1);

    static {
            org.lwjgl.util.Color r0 = new org.lwjgl.util.Color
            r1 = r0
            r2 = 255(0xff, float:3.57E-43)
            r3 = 0
            r4 = 0
            r1.<init>(r2, r3, r4)
            org.lwjgl.util.ReadableColor.RED = r0
            org.lwjgl.util.Color r0 = new org.lwjgl.util.Color
            r1 = r0
            r2 = 255(0xff, float:3.57E-43)
            r3 = 128(0x80, float:1.8E-43)
            r4 = 0
            r1.<init>(r2, r3, r4)
            org.lwjgl.util.ReadableColor.ORANGE = r0
            org.lwjgl.util.Color r0 = new org.lwjgl.util.Color
            r1 = r0
            r2 = 255(0xff, float:3.57E-43)
            r3 = 255(0xff, float:3.57E-43)
            r4 = 0
            r1.<init>(r2, r3, r4)
            org.lwjgl.util.ReadableColor.YELLOW = r0
            org.lwjgl.util.Color r0 = new org.lwjgl.util.Color
            r1 = r0
            r2 = 0
            r3 = 255(0xff, float:3.57E-43)
            r4 = 0
            r1.<init>(r2, r3, r4)
            org.lwjgl.util.ReadableColor.GREEN = r0
            org.lwjgl.util.Color r0 = new org.lwjgl.util.Color
            r1 = r0
            r2 = 0
            r3 = 255(0xff, float:3.57E-43)
            r4 = 255(0xff, float:3.57E-43)
            r1.<init>(r2, r3, r4)
            org.lwjgl.util.ReadableColor.CYAN = r0
            org.lwjgl.util.Color r0 = new org.lwjgl.util.Color
            r1 = r0
            r2 = 0
            r3 = 0
            r4 = 255(0xff, float:3.57E-43)
            r1.<init>(r2, r3, r4)
            org.lwjgl.util.ReadableColor.BLUE = r0
            org.lwjgl.util.Color r0 = new org.lwjgl.util.Color
            r1 = r0
            r2 = 255(0xff, float:3.57E-43)
            r3 = 0
            r4 = 255(0xff, float:3.57E-43)
            r1.<init>(r2, r3, r4)
            org.lwjgl.util.ReadableColor.PURPLE = r0
            org.lwjgl.util.Color r0 = new org.lwjgl.util.Color
            r1 = r0
            r2 = 255(0xff, float:3.57E-43)
            r3 = 255(0xff, float:3.57E-43)
            r4 = 255(0xff, float:3.57E-43)
            r1.<init>(r2, r3, r4)
            org.lwjgl.util.ReadableColor.WHITE = r0
            org.lwjgl.util.Color r0 = new org.lwjgl.util.Color
            r1 = r0
            r2 = 0
            r3 = 0
            r4 = 0
            r1.<init>(r2, r3, r4)
            org.lwjgl.util.ReadableColor.BLACK = r0
            org.lwjgl.util.Color r0 = new org.lwjgl.util.Color
            r1 = r0
            r2 = 192(0xc0, float:2.69E-43)
            r3 = 192(0xc0, float:2.69E-43)
            r4 = 192(0xc0, float:2.69E-43)
            r1.<init>(r2, r3, r4)
            org.lwjgl.util.ReadableColor.LTGREY = r0
            org.lwjgl.util.Color r0 = new org.lwjgl.util.Color
            r1 = r0
            r2 = 64
            r3 = 64
            r4 = 64
            r1.<init>(r2, r3, r4)
            org.lwjgl.util.ReadableColor.DKGREY = r0
            org.lwjgl.util.Color r0 = new org.lwjgl.util.Color
            r1 = r0
            r2 = 128(0x80, float:1.8E-43)
            r3 = 128(0x80, float:1.8E-43)
            r4 = 128(0x80, float:1.8E-43)
            r1.<init>(r2, r3, r4)
            org.lwjgl.util.ReadableColor.GREY = r0
            return
    }
}
