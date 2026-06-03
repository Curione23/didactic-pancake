package org.lwjgl.opengl;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/opengl/GLContext.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/opengl/GLContext.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/opengl/GLContext.class */
public class GLContext {
    private static java.lang.ThreadLocal<org.lwjgl.opengl.ContextCapabilities> contextCapabilities;

    public GLContext() {
            r2 = this;
            r0 = r2
            r0.<init>()
            return
    }

    public static org.lwjgl.opengl.GLContext createFromCurrent() {
            org.lwjgl.opengl.GLContext r0 = new org.lwjgl.opengl.GLContext
            r1 = r0
            r1.<init>()
            return r0
    }

    public static void initCapabilities() {
            java.lang.ThreadLocal<org.lwjgl.opengl.ContextCapabilities> r0 = org.lwjgl.opengl.GLContext.contextCapabilities
            java.lang.Object r0 = r0.get()
            if (r0 != 0) goto L1e
            java.io.PrintStream r0 = java.lang.System.out
            java.lang.String r1 = "LWJGLX: GL caps init"
            r0.println(r1)
            java.lang.ThreadLocal<org.lwjgl.opengl.ContextCapabilities> r0 = org.lwjgl.opengl.GLContext.contextCapabilities
            org.lwjgl.opengl.ContextCapabilities r1 = new org.lwjgl.opengl.ContextCapabilities
            r2 = r1
            r2.<init>()
            r0.set(r1)
        L1e:
            return
    }

    public static org.lwjgl.opengl.ContextCapabilities getCapabilities() {
            java.lang.ThreadLocal<org.lwjgl.opengl.ContextCapabilities> r0 = org.lwjgl.opengl.GLContext.contextCapabilities
            java.lang.Object r0 = r0.get()
            org.lwjgl.opengl.ContextCapabilities r0 = (org.lwjgl.opengl.ContextCapabilities) r0
            return r0
    }

    static {
            java.lang.ThreadLocal r0 = new java.lang.ThreadLocal
            r1 = r0
            r1.<init>()
            org.lwjgl.opengl.GLContext.contextCapabilities = r0
            return
    }
}
