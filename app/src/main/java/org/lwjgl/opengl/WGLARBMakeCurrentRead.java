package org.lwjgl.opengl;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/opengl/WGLARBMakeCurrentRead.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/opengl/WGLARBMakeCurrentRead.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/opengl/WGLARBMakeCurrentRead.class */
public class WGLARBMakeCurrentRead {
    public static final int ERROR_INVALID_PIXEL_TYPE_ARB = 8259;
    public static final int ERROR_INCOMPATIBLE_DEVICE_CONTEXTS_ARB = 8276;

    protected WGLARBMakeCurrentRead() {
            r3 = this;
            r0 = r3
            r0.<init>()
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r1 = r0
            r1.<init>()
            throw r0
    }

    @org.lwjgl.system.NativeType("BOOL")
    public static boolean wglMakeContextCurrentARB(@org.lwjgl.system.NativeType("HDC") long r9, @org.lwjgl.system.NativeType("HDC") long r11, @org.lwjgl.system.NativeType("HGLRC") long r13) {
            org.lwjgl.opengl.WGLCapabilities r0 = org.lwjgl.opengl.GL.getCapabilitiesWGL()
            long r0 = r0.wglMakeContextCurrentARB
            r15 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L24
            r0 = r15
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r9
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r11
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r13
            long r0 = org.lwjgl.system.Checks.check(r0)
        L24:
            r0 = r9
            r1 = r11
            r2 = r13
            r3 = r15
            int r0 = org.lwjgl.system.JNI.callPPPI(r0, r1, r2, r3)
            if (r0 == 0) goto L34
            r0 = 1
            goto L35
        L34:
            r0 = 0
        L35:
            return r0
    }

    @org.lwjgl.system.NativeType("HDC")
    public static long wglGetCurrentReadDCARB() {
            org.lwjgl.opengl.WGLCapabilities r0 = org.lwjgl.opengl.GL.getCapabilitiesWGL()
            long r0 = r0.wglGetCurrentReadDCARB
            r3 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L12
            r0 = r3
            long r0 = org.lwjgl.system.Checks.check(r0)
        L12:
            r0 = r3
            long r0 = org.lwjgl.system.JNI.callP(r0)
            return r0
    }
}
