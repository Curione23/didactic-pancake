package org.lwjgl.util;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/util/WritableDimension.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/util/WritableDimension.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/util/WritableDimension.class */
public interface WritableDimension {
    void setSize(int r1, int r2);

    void setSize(org.lwjgl.util.ReadableDimension r1);

    void setHeight(int r1);

    void setWidth(int r1);
}
