package org.lwjgl.opengl;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/opengl/WGLARBBufferRegion.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/opengl/WGLARBBufferRegion.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/opengl/WGLARBBufferRegion.class */
public class WGLARBBufferRegion {
    public static final int WGL_FRONT_COLOR_BUFFER_BIT_ARB = 1;
    public static final int WGL_BACK_COLOR_BUFFER_BIT_ARB = 2;
    public static final int WGL_DEPTH_BUFFER_BIT_ARB = 4;
    public static final int WGL_STENCIL_BUFFER_BIT_ARB = 8;

    protected WGLARBBufferRegion() {
            r3 = this;
            r0 = r3
            r0.<init>()
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r1 = r0
            r1.<init>()
            throw r0
    }

    @org.lwjgl.system.NativeType("HANDLE")
    public static long wglCreateBufferRegionARB(@org.lwjgl.system.NativeType("HDC") long r7, int r9, @org.lwjgl.system.NativeType("UINT") int r10) {
            org.lwjgl.opengl.WGLCapabilities r0 = org.lwjgl.opengl.GL.getCapabilitiesWGL()
            long r0 = r0.wglCreateBufferRegionARB
            r11 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L19
            r0 = r11
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r7
            long r0 = org.lwjgl.system.Checks.check(r0)
        L19:
            r0 = r7
            r1 = r9
            r2 = r10
            r3 = r11
            long r0 = org.lwjgl.system.JNI.callPP(r0, r1, r2, r3)
            return r0
    }

    @org.lwjgl.system.NativeType("VOID")
    public static void wglDeleteBufferRegionARB(@org.lwjgl.system.NativeType("HANDLE") long r5) {
            org.lwjgl.opengl.WGLCapabilities r0 = org.lwjgl.opengl.GL.getCapabilitiesWGL()
            long r0 = r0.wglDeleteBufferRegionARB
            r7 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L17
            r0 = r7
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r5
            long r0 = org.lwjgl.system.Checks.check(r0)
        L17:
            r0 = r5
            r1 = r7
            org.lwjgl.system.JNI.callPV(r0, r1)
            return
    }

    @org.lwjgl.system.NativeType("BOOL")
    public static boolean wglSaveBufferRegionARB(@org.lwjgl.system.NativeType("HANDLE") long r9, int r11, int r12, int r13, int r14) {
            org.lwjgl.opengl.WGLCapabilities r0 = org.lwjgl.opengl.GL.getCapabilitiesWGL()
            long r0 = r0.wglSaveBufferRegionARB
            r15 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L19
            r0 = r15
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r9
            long r0 = org.lwjgl.system.Checks.check(r0)
        L19:
            r0 = r9
            r1 = r11
            r2 = r12
            r3 = r13
            r4 = r14
            r5 = r15
            int r0 = org.lwjgl.system.JNI.callPI(r0, r1, r2, r3, r4, r5)
            if (r0 == 0) goto L2c
            r0 = 1
            goto L2d
        L2c:
            r0 = 0
        L2d:
            return r0
    }

    @org.lwjgl.system.NativeType("BOOL")
    public static boolean wglRestoreBufferRegionARB(@org.lwjgl.system.NativeType("HANDLE") long r11, int r13, int r14, int r15, int r16, int r17, int r18) {
            org.lwjgl.opengl.WGLCapabilities r0 = org.lwjgl.opengl.GL.getCapabilitiesWGL()
            long r0 = r0.wglRestoreBufferRegionARB
            r19 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L19
            r0 = r19
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r11
            long r0 = org.lwjgl.system.Checks.check(r0)
        L19:
            r0 = r11
            r1 = r13
            r2 = r14
            r3 = r15
            r4 = r16
            r5 = r17
            r6 = r18
            r7 = r19
            int r0 = org.lwjgl.system.JNI.callPI(r0, r1, r2, r3, r4, r5, r6, r7)
            if (r0 == 0) goto L30
            r0 = 1
            goto L31
        L30:
            r0 = 0
        L31:
            return r0
    }
}
