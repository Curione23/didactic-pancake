package org.lwjgl.util;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/util/WritableColor.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/util/WritableColor.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/util/WritableColor.class */
public interface WritableColor {
    void set(int r1, int r2, int r3, int r4);

    void set(byte r1, byte r2, byte r3, byte r4);

    void set(int r1, int r2, int r3);

    void set(byte r1, byte r2, byte r3);

    void setRed(int r1);

    void setGreen(int r1);

    void setBlue(int r1);

    void setAlpha(int r1);

    void setRed(byte r1);

    void setGreen(byte r1);

    void setBlue(byte r1);

    void setAlpha(byte r1);

    void readRGBA(java.nio.ByteBuffer r1);

    void readRGB(java.nio.ByteBuffer r1);

    void readARGB(java.nio.ByteBuffer r1);

    void readBGRA(java.nio.ByteBuffer r1);

    void readBGR(java.nio.ByteBuffer r1);

    void readABGR(java.nio.ByteBuffer r1);

    void setColor(org.lwjgl.util.ReadableColor r1);
}
