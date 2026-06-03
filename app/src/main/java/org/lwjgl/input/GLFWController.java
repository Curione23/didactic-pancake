package org.lwjgl.input;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/input/GLFWController.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/input/GLFWController.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/input/GLFWController.class */
public class GLFWController implements org.lwjgl.input.Controller {
    int jid;
    java.nio.FloatBuffer axisData;
    java.nio.ByteBuffer buttonData;

    public GLFWController() {
            r3 = this;
            r0 = r3
            r0.<init>()
            r0 = r3
            r1 = 8
            java.nio.FloatBuffer r1 = java.nio.FloatBuffer.allocate(r1)
            r0.axisData = r1
            r0 = r3
            r1 = 8
            java.nio.ByteBuffer r1 = java.nio.ByteBuffer.allocate(r1)
            r0.buttonData = r1
            return
    }

    @Override // org.lwjgl.input.Controller
    public java.lang.String getName() {
            r2 = this;
            r0 = r2
            int r0 = r0.jid
            java.lang.String r0 = org.lwjgl.glfw.GLFW.glfwGetJoystickName(r0)
            return r0
    }

    @Override // org.lwjgl.input.Controller
    public int getIndex() {
            r2 = this;
            r0 = r2
            int r0 = r0.jid
            return r0
    }

    @Override // org.lwjgl.input.Controller
    public int getButtonCount() {
            r2 = this;
            r0 = 8
            return r0
    }

    @Override // org.lwjgl.input.Controller
    public java.lang.String getButtonName(int r3) {
            r2 = this;
            r0 = r3
            switch(r0) {
                case 0: goto L30;
                case 1: goto L33;
                case 2: goto L36;
                case 3: goto L39;
                case 4: goto L3c;
                case 5: goto L3f;
                case 6: goto L42;
                case 7: goto L45;
                default: goto L48;
            }
        L30:
            java.lang.String r0 = "A"
            return r0
        L33:
            java.lang.String r0 = "B"
            return r0
        L36:
            java.lang.String r0 = "X"
            return r0
        L39:
            java.lang.String r0 = "Y"
            return r0
        L3c:
            java.lang.String r0 = "DPAD LEFT"
            return r0
        L3f:
            java.lang.String r0 = "DPAD RIGHT"
            return r0
        L42:
            java.lang.String r0 = "DPAD UP"
            return r0
        L45:
            java.lang.String r0 = "DPAD DOWN"
            return r0
        L48:
            r0 = 0
            return r0
    }

    @Override // org.lwjgl.input.Controller
    public boolean isButtonPressed(int r4) {
            r3 = this;
            r0 = r4
            r1 = 8
            if (r0 >= r1) goto L18
            r0 = r3
            java.nio.ByteBuffer r0 = r0.buttonData
            r1 = r4
            byte r0 = r0.get(r1)
            r1 = 1
            if (r0 != r1) goto L16
            r0 = 1
            goto L17
        L16:
            r0 = 0
        L17:
            return r0
        L18:
            r0 = 0
            return r0
    }

    @Override // org.lwjgl.input.Controller
    public void poll() {
            r1 = this;
            return
    }

    @Override // org.lwjgl.input.Controller
    public float getPovX() {
            r3 = this;
            r0 = r3
            java.nio.FloatBuffer r0 = r0.axisData
            r1 = 6
            float r0 = r0.get(r1)
            return r0
    }

    @Override // org.lwjgl.input.Controller
    public float getPovY() {
            r3 = this;
            r0 = r3
            java.nio.FloatBuffer r0 = r0.axisData
            r1 = 7
            float r0 = r0.get(r1)
            return r0
    }

    @Override // org.lwjgl.input.Controller
    public float getDeadZone(int r3) {
            r2 = this;
            r0 = 0
            return r0
    }

    @Override // org.lwjgl.input.Controller
    public void setDeadZone(int r2, float r3) {
            r1 = this;
            return
    }

    @Override // org.lwjgl.input.Controller
    public int getAxisCount() {
            r2 = this;
            r0 = 8
            return r0
    }

    @Override // org.lwjgl.input.Controller
    public java.lang.String getAxisName(int r3) {
            r2 = this;
            r0 = r3
            switch(r0) {
                case 0: goto L30;
                case 1: goto L33;
                case 2: goto L36;
                case 3: goto L39;
                case 4: goto L3c;
                case 5: goto L3f;
                case 6: goto L42;
                case 7: goto L45;
                default: goto L48;
            }
        L30:
            java.lang.String r0 = "AXIS X"
            return r0
        L33:
            java.lang.String r0 = "AXIS Y"
            return r0
        L36:
            java.lang.String r0 = "AXIS Z"
            return r0
        L39:
            java.lang.String r0 = "AXIS RX"
            return r0
        L3c:
            java.lang.String r0 = "AXIS RY"
            return r0
        L3f:
            java.lang.String r0 = "AXIS RZ"
            return r0
        L42:
            java.lang.String r0 = "HAT/POV X"
            return r0
        L45:
            java.lang.String r0 = "HAT/POV Y"
            return r0
        L48:
            r0 = 0
            return r0
    }

    @Override // org.lwjgl.input.Controller
    public float getAxisValue(int r4) {
            r3 = this;
            r0 = r3
            java.nio.FloatBuffer r0 = r0.axisData
            r1 = r4
            float r0 = r0.get(r1)
            return r0
    }

    @Override // org.lwjgl.input.Controller
    public float getXAxisValue() {
            r3 = this;
            r0 = r3
            java.nio.FloatBuffer r0 = r0.axisData
            r1 = 0
            float r0 = r0.get(r1)
            return r0
    }

    @Override // org.lwjgl.input.Controller
    public float getXAxisDeadZone() {
            r2 = this;
            r0 = 0
            return r0
    }

    @Override // org.lwjgl.input.Controller
    public void setXAxisDeadZone(float r2) {
            r1 = this;
            return
    }

    @Override // org.lwjgl.input.Controller
    public float getYAxisValue() {
            r3 = this;
            r0 = r3
            java.nio.FloatBuffer r0 = r0.axisData
            r1 = 1
            float r0 = r0.get(r1)
            return r0
    }

    @Override // org.lwjgl.input.Controller
    public float getYAxisDeadZone() {
            r2 = this;
            r0 = 0
            return r0
    }

    @Override // org.lwjgl.input.Controller
    public void setYAxisDeadZone(float r2) {
            r1 = this;
            return
    }

    @Override // org.lwjgl.input.Controller
    public float getZAxisValue() {
            r3 = this;
            r0 = r3
            java.nio.FloatBuffer r0 = r0.axisData
            r1 = 2
            float r0 = r0.get(r1)
            return r0
    }

    @Override // org.lwjgl.input.Controller
    public float getZAxisDeadZone() {
            r2 = this;
            r0 = 0
            return r0
    }

    @Override // org.lwjgl.input.Controller
    public void setZAxisDeadZone(float r2) {
            r1 = this;
            return
    }

    @Override // org.lwjgl.input.Controller
    public float getRXAxisValue() {
            r3 = this;
            r0 = r3
            java.nio.FloatBuffer r0 = r0.axisData
            r1 = 3
            float r0 = r0.get(r1)
            return r0
    }

    @Override // org.lwjgl.input.Controller
    public float getRXAxisDeadZone() {
            r2 = this;
            r0 = 0
            return r0
    }

    @Override // org.lwjgl.input.Controller
    public void setRXAxisDeadZone(float r2) {
            r1 = this;
            return
    }

    @Override // org.lwjgl.input.Controller
    public float getRYAxisValue() {
            r3 = this;
            r0 = r3
            java.nio.FloatBuffer r0 = r0.axisData
            r1 = 4
            float r0 = r0.get(r1)
            return r0
    }

    @Override // org.lwjgl.input.Controller
    public float getRYAxisDeadZone() {
            r2 = this;
            r0 = 0
            return r0
    }

    @Override // org.lwjgl.input.Controller
    public void setRYAxisDeadZone(float r2) {
            r1 = this;
            return
    }

    @Override // org.lwjgl.input.Controller
    public float getRZAxisValue() {
            r3 = this;
            r0 = r3
            java.nio.FloatBuffer r0 = r0.axisData
            r1 = 5
            float r0 = r0.get(r1)
            return r0
    }

    @Override // org.lwjgl.input.Controller
    public float getRZAxisDeadZone() {
            r2 = this;
            r0 = 0
            return r0
    }

    @Override // org.lwjgl.input.Controller
    public void setRZAxisDeadZone(float r2) {
            r1 = this;
            return
    }

    @Override // org.lwjgl.input.Controller
    public int getRumblerCount() {
            r2 = this;
            r0 = 0
            return r0
    }

    @Override // org.lwjgl.input.Controller
    public java.lang.String getRumblerName(int r3) {
            r2 = this;
            r0 = 0
            return r0
    }

    @Override // org.lwjgl.input.Controller
    public void setRumblerStrength(int r2, float r3) {
            r1 = this;
            return
    }
}
