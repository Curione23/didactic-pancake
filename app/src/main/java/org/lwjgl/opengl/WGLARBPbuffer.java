package org.lwjgl.opengl;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/opengl/WGLARBPbuffer.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/opengl/WGLARBPbuffer.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/opengl/WGLARBPbuffer.class */
public class WGLARBPbuffer {
    public static final int WGL_DRAW_TO_PBUFFER_ARB = 8237;
    public static final int WGL_MAX_PBUFFER_PIXELS_ARB = 8238;
    public static final int WGL_MAX_PBUFFER_WIDTH_ARB = 8239;
    public static final int WGL_MAX_PBUFFER_HEIGHT_ARB = 8240;
    public static final int WGL_PBUFFER_LARGEST_ARB = 8243;
    public static final int WGL_PBUFFER_WIDTH_ARB = 8244;
    public static final int WGL_PBUFFER_HEIGHT_ARB = 8245;
    public static final int WGL_PBUFFER_LOST_ARB = 8246;

    protected WGLARBPbuffer() {
            r3 = this;
            r0 = r3
            r0.<init>()
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r1 = r0
            r1.<init>()
            throw r0
    }

    public static long nwglCreatePbufferARB(long r10, int r12, int r13, int r14, long r15) {
            org.lwjgl.opengl.WGLCapabilities r0 = org.lwjgl.opengl.GL.getCapabilitiesWGL()
            long r0 = r0.wglCreatePbufferARB
            r17 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L19
            r0 = r17
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r10
            long r0 = org.lwjgl.system.Checks.check(r0)
        L19:
            r0 = r10
            r1 = r12
            r2 = r13
            r3 = r14
            r4 = r15
            r5 = r17
            long r0 = org.lwjgl.system.JNI.callPPP(r0, r1, r2, r3, r4, r5)
            return r0
    }

    @org.lwjgl.system.NativeType("HPBUFFERARB")
    public static long wglCreatePbufferARB(@org.lwjgl.system.NativeType("HDC") long r8, int r10, int r11, int r12, @javax.annotation.Nullable @org.lwjgl.system.NativeType("int const *") java.nio.IntBuffer r13) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r13
            org.lwjgl.system.Checks.checkNTSafe(r0)
        Lb:
            r0 = r8
            r1 = r10
            r2 = r11
            r3 = r12
            r4 = r13
            long r4 = org.lwjgl.system.MemoryUtil.memAddressSafe(r4)
            long r0 = nwglCreatePbufferARB(r0, r1, r2, r3, r4)
            return r0
    }

    @org.lwjgl.system.NativeType("HDC")
    public static long wglGetPbufferDCARB(@org.lwjgl.system.NativeType("HPBUFFERARB") long r5) {
            org.lwjgl.opengl.WGLCapabilities r0 = org.lwjgl.opengl.GL.getCapabilitiesWGL()
            long r0 = r0.wglGetPbufferDCARB
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
            long r0 = org.lwjgl.system.JNI.callPP(r0, r1)
            return r0
    }

    public static int wglReleasePbufferDCARB(@org.lwjgl.system.NativeType("HPBUFFERARB") long r7, @org.lwjgl.system.NativeType("HDC") long r9) {
            org.lwjgl.opengl.WGLCapabilities r0 = org.lwjgl.opengl.GL.getCapabilitiesWGL()
            long r0 = r0.wglReleasePbufferDCARB
            r11 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L1e
            r0 = r11
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r7
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r9
            long r0 = org.lwjgl.system.Checks.check(r0)
        L1e:
            r0 = r7
            r1 = r9
            r2 = r11
            int r0 = org.lwjgl.system.JNI.callPPI(r0, r1, r2)
            return r0
    }

    @org.lwjgl.system.NativeType("BOOL")
    public static boolean wglDestroyPbufferARB(@org.lwjgl.system.NativeType("HPBUFFERARB") long r5) {
            org.lwjgl.opengl.WGLCapabilities r0 = org.lwjgl.opengl.GL.getCapabilitiesWGL()
            long r0 = r0.wglDestroyPbufferARB
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
            int r0 = org.lwjgl.system.JNI.callPI(r0, r1)
            if (r0 == 0) goto L23
            r0 = 1
            goto L24
        L23:
            r0 = 0
        L24:
            return r0
    }

    public static int nwglQueryPbufferARB(long r8, int r10, long r11) {
            org.lwjgl.opengl.WGLCapabilities r0 = org.lwjgl.opengl.GL.getCapabilitiesWGL()
            long r0 = r0.wglQueryPbufferARB
            r13 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L19
            r0 = r13
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r8
            long r0 = org.lwjgl.system.Checks.check(r0)
        L19:
            r0 = r8
            r1 = r10
            r2 = r11
            r3 = r13
            int r0 = org.lwjgl.system.JNI.callPPI(r0, r1, r2, r3)
            return r0
    }

    @org.lwjgl.system.NativeType("BOOL")
    public static boolean wglQueryPbufferARB(@org.lwjgl.system.NativeType("HPBUFFERARB") long r6, int r8, @org.lwjgl.system.NativeType("int *") java.nio.IntBuffer r9) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r9
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
        Lb:
            r0 = r6
            r1 = r8
            r2 = r9
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            int r0 = nwglQueryPbufferARB(r0, r1, r2)
            if (r0 == 0) goto L1b
            r0 = 1
            goto L1c
        L1b:
            r0 = 0
        L1c:
            return r0
    }

    @org.lwjgl.system.NativeType("HPBUFFERARB")
    public static long wglCreatePbufferARB(@org.lwjgl.system.NativeType("HDC") long r9, int r11, int r12, int r13, @javax.annotation.Nullable @org.lwjgl.system.NativeType("int const *") int[] r14) {
            org.lwjgl.opengl.WGLCapabilities r0 = org.lwjgl.opengl.GL.getCapabilitiesWGL()
            long r0 = r0.wglCreatePbufferARB
            r15 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L1e
            r0 = r15
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r9
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r14
            org.lwjgl.system.Checks.checkNTSafe(r0)
        L1e:
            r0 = r9
            r1 = r11
            r2 = r12
            r3 = r13
            r4 = r14
            r5 = r15
            long r0 = org.lwjgl.system.JNI.callPPP(r0, r1, r2, r3, r4, r5)
            return r0
    }

    @org.lwjgl.system.NativeType("BOOL")
    public static boolean wglQueryPbufferARB(@org.lwjgl.system.NativeType("HPBUFFERARB") long r7, int r9, @org.lwjgl.system.NativeType("int *") int[] r10) {
            org.lwjgl.opengl.WGLCapabilities r0 = org.lwjgl.opengl.GL.getCapabilitiesWGL()
            long r0 = r0.wglQueryPbufferARB
            r11 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L1e
            r0 = r11
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r7
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r10
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
        L1e:
            r0 = r7
            r1 = r9
            r2 = r10
            r3 = r11
            int r0 = org.lwjgl.system.JNI.callPPI(r0, r1, r2, r3)
            if (r0 == 0) goto L2d
            r0 = 1
            goto L2e
        L2d:
            r0 = 0
        L2e:
            return r0
    }
}
