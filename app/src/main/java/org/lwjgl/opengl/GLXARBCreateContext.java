package org.lwjgl.opengl;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/opengl/GLXARBCreateContext.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/opengl/GLXARBCreateContext.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/opengl/GLXARBCreateContext.class */
public class GLXARBCreateContext {
    public static final int GLX_CONTEXT_MAJOR_VERSION_ARB = 8337;
    public static final int GLX_CONTEXT_MINOR_VERSION_ARB = 8338;
    public static final int GLX_CONTEXT_FLAGS_ARB = 8340;
    public static final int GLX_CONTEXT_DEBUG_BIT_ARB = 1;
    public static final int GLX_CONTEXT_FORWARD_COMPATIBLE_BIT_ARB = 2;

    protected GLXARBCreateContext() {
            r3 = this;
            r0 = r3
            r0.<init>()
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r1 = r0
            r1.<init>()
            throw r0
    }

    public static long nglXCreateContextAttribsARB(long r12, long r14, long r16, int r18, long r19) {
            org.lwjgl.opengl.GLXCapabilities r0 = org.lwjgl.opengl.GL.getCapabilitiesGLXClient()
            long r0 = r0.glXCreateContextAttribsARB
            r21 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L1e
            r0 = r21
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r12
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r14
            long r0 = org.lwjgl.system.Checks.check(r0)
        L1e:
            r0 = r12
            r1 = r14
            r2 = r16
            r3 = r18
            r4 = r19
            r5 = r21
            long r0 = org.lwjgl.system.JNI.callPPPPP(r0, r1, r2, r3, r4, r5)
            return r0
    }

    @org.lwjgl.system.NativeType("GLXContext")
    public static long glXCreateContextAttribsARB(@org.lwjgl.system.NativeType("Display *") long r10, @org.lwjgl.system.NativeType("GLXFBConfig") long r12, @org.lwjgl.system.NativeType("GLXContext") long r14, @org.lwjgl.system.NativeType("Bool") boolean r16, @javax.annotation.Nullable @org.lwjgl.system.NativeType("int const *") java.nio.IntBuffer r17) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r17
            org.lwjgl.system.Checks.checkNTSafe(r0)
        Lb:
            r0 = r10
            r1 = r12
            r2 = r14
            r3 = r16
            if (r3 == 0) goto L18
            r3 = 1
            goto L19
        L18:
            r3 = 0
        L19:
            r4 = r17
            long r4 = org.lwjgl.system.MemoryUtil.memAddressSafe(r4)
            long r0 = nglXCreateContextAttribsARB(r0, r1, r2, r3, r4)
            return r0
    }

    @org.lwjgl.system.NativeType("GLXContext")
    public static long glXCreateContextAttribsARB(@org.lwjgl.system.NativeType("Display *") long r11, @org.lwjgl.system.NativeType("GLXFBConfig") long r13, @org.lwjgl.system.NativeType("GLXContext") long r15, @org.lwjgl.system.NativeType("Bool") boolean r17, @javax.annotation.Nullable @org.lwjgl.system.NativeType("int const *") int[] r18) {
            org.lwjgl.opengl.GLXCapabilities r0 = org.lwjgl.opengl.GL.getCapabilitiesGLXClient()
            long r0 = r0.glXCreateContextAttribsARB
            r19 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L23
            r0 = r19
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r11
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r13
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r18
            org.lwjgl.system.Checks.checkNTSafe(r0)
        L23:
            r0 = r11
            r1 = r13
            r2 = r15
            r3 = r17
            if (r3 == 0) goto L30
            r3 = 1
            goto L31
        L30:
            r3 = 0
        L31:
            r4 = r18
            r5 = r19
            long r0 = org.lwjgl.system.JNI.callPPPPP(r0, r1, r2, r3, r4, r5)
            return r0
    }
}
