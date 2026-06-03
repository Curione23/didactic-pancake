package org.lwjgl.input;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/input/InfdevMouse.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/input/InfdevMouse.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/input/InfdevMouse.class */
public class InfdevMouse implements net.java.openjdk.cacio.ctc.ExternalMouseReader, org.lwjgl.input.Mouse.EmptyCursorGrabListener {
    public InfdevMouse() {
            r2 = this;
            r0 = r2
            r0.<init>()
            return
    }

    @Override // net.java.openjdk.cacio.ctc.ExternalMouseReader
    public int getX() {
            r2 = this;
            int r0 = org.lwjgl.input.Mouse.getAbsoluteX()
            return r0
    }

    @Override // net.java.openjdk.cacio.ctc.ExternalMouseReader
    public int getY() {
            r2 = this;
            int r0 = org.lwjgl.input.Mouse.getAbsoluteY()
            return r0
    }

    @Override // org.lwjgl.input.Mouse.EmptyCursorGrabListener
    public void onGrab(boolean r3) {
            r2 = this;
            r0 = r3
            net.java.openjdk.cacio.ctc.InfdevGrabHandler.setGrabbed(r0)
            return
    }

    static {
            org.lwjgl.input.InfdevMouse r0 = new org.lwjgl.input.InfdevMouse
            r1 = r0
            r1.<init>()
            net.java.openjdk.cacio.ctc.InfdevGrabHandler.setMouseReader(r0)
            return
    }
}
