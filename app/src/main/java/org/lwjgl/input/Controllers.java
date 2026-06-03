package org.lwjgl.input;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/input/Controllers.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/input/Controllers.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/input/Controllers.class */
public class Controllers {
    static org.lwjgl.input.GLFWController ctrlr;

    public Controllers() {
            r2 = this;
            r0 = r2
            r0.<init>()
            return
    }

    public static void create() {
            org.lwjgl.input.GLFWController r0 = new org.lwjgl.input.GLFWController
            r1 = r0
            r1.<init>()
            org.lwjgl.input.Controllers.ctrlr = r0
            org.lwjgl.input.GLFWController r0 = org.lwjgl.input.Controllers.ctrlr
            r1 = 0
            r0.jid = r1
            return
    }

    public static org.lwjgl.input.Controller getController(int r2) {
            org.lwjgl.input.GLFWController r0 = org.lwjgl.input.Controllers.ctrlr
            return r0
    }

    public static int getControllerCount() {
            r0 = 1
            return r0
    }

    public static void poll() {
            org.lwjgl.input.GLFWController r0 = org.lwjgl.input.Controllers.ctrlr
            r0.poll()
            return
    }

    public static boolean next() {
            r0 = 0
            return r0
    }

    public static boolean isCreated() {
            r0 = 1
            return r0
    }

    public static void destroy() {
            return
    }

    public static void clearEvents() {
            return
    }

    public static org.lwjgl.input.Controller getEventSource() {
            org.lwjgl.input.GLFWController r0 = org.lwjgl.input.Controllers.ctrlr
            return r0
    }

    public static int getEventControlIndex() {
            r0 = 0
            return r0
    }

    public static boolean isEventButton() {
            r0 = 1
            return r0
    }

    public static boolean isEventAxis() {
            r0 = 1
            return r0
    }

    public static boolean isEventXAxis() {
            r0 = 1
            return r0
    }

    public static boolean isEventYAxis() {
            r0 = 1
            return r0
    }

    public static boolean isEventPovX() {
            r0 = 1
            return r0
    }

    public static boolean isEventPovY() {
            r0 = 1
            return r0
    }

    public static long getEventNanoseconds() {
            long r0 = org.lwjgl.Sys.getNanoTime()
            return r0
    }

    public static boolean getEventButtonState() {
            r0 = 1
            return r0
    }

    public static float getEventXAxisValue() {
            org.lwjgl.input.GLFWController r0 = org.lwjgl.input.Controllers.ctrlr
            float r0 = r0.getXAxisValue()
            return r0
    }

    public static float getEventYAxisValue() {
            org.lwjgl.input.GLFWController r0 = org.lwjgl.input.Controllers.ctrlr
            float r0 = r0.getYAxisValue()
            return r0
    }
}
