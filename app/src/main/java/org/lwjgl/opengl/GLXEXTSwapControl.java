package org.lwjgl.opengl;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/opengl/GLXEXTSwapControl.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/opengl/GLXEXTSwapControl.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/opengl/GLXEXTSwapControl.class */
public class GLXEXTSwapControl {
    public static final int GLX_SWAP_INTERVAL_EXT = 8433;
    public static final int GLX_MAX_SWAP_INTERVAL_EXT = 8434;

    protected GLXEXTSwapControl() {
            r3 = this;
            r0 = r3
            r0.<init>()
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r1 = r0
            r1.<init>()
            throw r0
    }

    public static void glXSwapIntervalEXT(@org.lwjgl.system.NativeType("Display *") long r8, @org.lwjgl.system.NativeType("GLXDrawable") long r10, int r12) {
            org.lwjgl.opengl.GLXCapabilities r0 = org.lwjgl.opengl.GL.getCapabilitiesGLXClient()
            long r0 = r0.glXSwapIntervalEXT
            r13 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L1e
            r0 = r13
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r8
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r10
            long r0 = org.lwjgl.system.Checks.check(r0)
        L1e:
            r0 = r8
            r1 = r10
            r2 = r12
            r3 = r13
            org.lwjgl.system.JNI.callPPV(r0, r1, r2, r3)
            return
    }
}
