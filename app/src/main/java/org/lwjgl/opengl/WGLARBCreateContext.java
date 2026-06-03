package org.lwjgl.opengl;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/opengl/WGLARBCreateContext.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/opengl/WGLARBCreateContext.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/opengl/WGLARBCreateContext.class */
public class WGLARBCreateContext {
    public static final int WGL_CONTEXT_MAJOR_VERSION_ARB = 8337;
    public static final int WGL_CONTEXT_MINOR_VERSION_ARB = 8338;
    public static final int WGL_CONTEXT_LAYER_PLANE_ARB = 8339;
    public static final int WGL_CONTEXT_FLAGS_ARB = 8340;
    public static final int WGL_CONTEXT_DEBUG_BIT_ARB = 1;
    public static final int WGL_CONTEXT_FORWARD_COMPATIBLE_BIT_ARB = 2;
    public static final int ERROR_INVALID_VERSION_ARB = 8341;

    protected WGLARBCreateContext() {
            r3 = this;
            r0 = r3
            r0.<init>()
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r1 = r0
            r1.<init>()
            throw r0
    }

    public static long nwglCreateContextAttribsARB(long r9, long r11, long r13) {
            org.lwjgl.opengl.WGLCapabilities r0 = org.lwjgl.opengl.GL.getCapabilitiesWGL()
            long r0 = r0.wglCreateContextAttribsARB
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
            r2 = r13
            r3 = r15
            long r0 = org.lwjgl.system.JNI.callPPPP(r0, r1, r2, r3)
            return r0
    }

    @org.lwjgl.system.NativeType("HGLRC")
    public static long wglCreateContextAttribsARB(@org.lwjgl.system.NativeType("HDC") long r7, @org.lwjgl.system.NativeType("HGLRC") long r9, @javax.annotation.Nullable @org.lwjgl.system.NativeType("int const *") java.nio.IntBuffer r11) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r11
            org.lwjgl.system.Checks.checkNTSafe(r0)
        Lb:
            r0 = r7
            r1 = r9
            r2 = r11
            long r2 = org.lwjgl.system.MemoryUtil.memAddressSafe(r2)
            long r0 = nwglCreateContextAttribsARB(r0, r1, r2)
            return r0
    }

    @org.lwjgl.system.NativeType("HGLRC")
    public static long wglCreateContextAttribsARB(@org.lwjgl.system.NativeType("HDC") long r8, @org.lwjgl.system.NativeType("HGLRC") long r10, @javax.annotation.Nullable @org.lwjgl.system.NativeType("int const *") int[] r12) {
            org.lwjgl.opengl.WGLCapabilities r0 = org.lwjgl.opengl.GL.getCapabilitiesWGL()
            long r0 = r0.wglCreateContextAttribsARB
            r13 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L1e
            r0 = r13
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r8
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r12
            org.lwjgl.system.Checks.checkNTSafe(r0)
        L1e:
            r0 = r8
            r1 = r10
            r2 = r12
            r3 = r13
            long r0 = org.lwjgl.system.JNI.callPPPP(r0, r1, r2, r3)
            return r0
    }
}
