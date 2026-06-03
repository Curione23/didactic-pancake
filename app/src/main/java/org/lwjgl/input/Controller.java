package org.lwjgl.input;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/input/Controller.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/input/Controller.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/input/Controller.class */
public interface Controller {
    java.lang.String getName();

    int getIndex();

    int getButtonCount();

    java.lang.String getButtonName(int r1);

    boolean isButtonPressed(int r1);

    void poll();

    float getPovX();

    float getPovY();

    float getDeadZone(int r1);

    void setDeadZone(int r1, float r2);

    int getAxisCount();

    java.lang.String getAxisName(int r1);

    float getAxisValue(int r1);

    float getXAxisValue();

    float getXAxisDeadZone();

    void setXAxisDeadZone(float r1);

    float getYAxisValue();

    float getYAxisDeadZone();

    void setYAxisDeadZone(float r1);

    float getZAxisValue();

    float getZAxisDeadZone();

    void setZAxisDeadZone(float r1);

    float getRXAxisValue();

    float getRXAxisDeadZone();

    void setRXAxisDeadZone(float r1);

    float getRYAxisValue();

    float getRYAxisDeadZone();

    void setRYAxisDeadZone(float r1);

    float getRZAxisValue();

    float getRZAxisDeadZone();

    void setRZAxisDeadZone(float r1);

    int getRumblerCount();

    java.lang.String getRumblerName(int r1);

    void setRumblerStrength(int r1, float r2);
}
