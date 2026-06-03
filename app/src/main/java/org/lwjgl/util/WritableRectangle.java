package org.lwjgl.util;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/util/WritableRectangle.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/util/WritableRectangle.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/util/WritableRectangle.class */
public interface WritableRectangle extends org.lwjgl.util.WritablePoint, org.lwjgl.util.WritableDimension {
    void setBounds(int r1, int r2, int r3, int r4);

    void setBounds(org.lwjgl.util.ReadablePoint r1, org.lwjgl.util.ReadableDimension r2);

    void setBounds(org.lwjgl.util.ReadableRectangle r1);
}
