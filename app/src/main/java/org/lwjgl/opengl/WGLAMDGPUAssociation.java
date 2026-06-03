package org.lwjgl.opengl;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/opengl/WGLAMDGPUAssociation.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/opengl/WGLAMDGPUAssociation.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/opengl/WGLAMDGPUAssociation.class */
public class WGLAMDGPUAssociation {
    public static final int WGL_GPU_VENDOR_AMD = 7936;
    public static final int WGL_GPU_RENDERER_STRING_AMD = 7937;
    public static final int WGL_GPU_OPENGL_VERSION_STRING_AMD = 7938;
    public static final int WGL_GPU_FASTEST_TARGET_GPUS_AMD = 8610;
    public static final int WGL_GPU_RAM_AMD = 8611;
    public static final int WGL_GPU_CLOCK_AMD = 8612;
    public static final int WGL_GPU_NUM_PIPES_AMD = 8613;
    public static final int WGL_GPU_NUM_SIMD_AMD = 8614;
    public static final int WGL_GPU_NUM_RB_AMD = 8615;
    public static final int WGL_GPU_NUM_SPI_AMD = 8616;

    protected WGLAMDGPUAssociation() {
            r3 = this;
            r0 = r3
            r0.<init>()
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r1 = r0
            r1.<init>()
            throw r0
    }

    public static int nwglGetGPUIDsAMD(int r6, long r7) {
            org.lwjgl.opengl.WGLCapabilities r0 = org.lwjgl.opengl.GL.getCapabilitiesWGL()
            long r0 = r0.wglGetGPUIDsAMD
            r9 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L12
            r0 = r9
            long r0 = org.lwjgl.system.Checks.check(r0)
        L12:
            r0 = r6
            r1 = r7
            r2 = r9
            int r0 = org.lwjgl.system.JNI.callPI(r0, r1, r2)
            return r0
    }

    @org.lwjgl.system.NativeType("UINT")
    public static int wglGetGPUIDsAMD(@javax.annotation.Nullable @org.lwjgl.system.NativeType("UINT *") java.nio.IntBuffer r4) {
            r0 = r4
            int r0 = org.lwjgl.system.Checks.remainingSafe(r0)
            r1 = r4
            long r1 = org.lwjgl.system.MemoryUtil.memAddressSafe(r1)
            int r0 = nwglGetGPUIDsAMD(r0, r1)
            return r0
    }

    public static int nwglGetGPUInfoAMD(int r9, int r10, int r11, int r12, long r13) {
            org.lwjgl.opengl.WGLCapabilities r0 = org.lwjgl.opengl.GL.getCapabilitiesWGL()
            long r0 = r0.wglGetGPUInfoAMD
            r15 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L14
            r0 = r15
            long r0 = org.lwjgl.system.Checks.check(r0)
        L14:
            r0 = r9
            r1 = r10
            r2 = r11
            r3 = r12
            r4 = r13
            r5 = r15
            int r0 = org.lwjgl.system.JNI.callPI(r0, r1, r2, r3, r4, r5)
            return r0
    }

    public static int wglGetGPUInfoAMD(@org.lwjgl.system.NativeType("UINT") int r7, int r8, @org.lwjgl.system.NativeType("GLenum") int r9, @org.lwjgl.system.NativeType("void *") java.nio.ByteBuffer r10) {
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = r10
            int r3 = r3.remaining()
            r4 = r9
            int r4 = org.lwjgl.opengl.GLChecks.typeToByteShift(r4)
            int r3 = r3 >> r4
            r4 = r10
            long r4 = org.lwjgl.system.MemoryUtil.memAddress(r4)
            int r0 = nwglGetGPUInfoAMD(r0, r1, r2, r3, r4)
            return r0
    }

    public static int wglGetGPUInfoAMD(@org.lwjgl.system.NativeType("UINT") int r7, int r8, @org.lwjgl.system.NativeType("GLenum") int r9, @org.lwjgl.system.NativeType("void *") java.nio.IntBuffer r10) {
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = r10
            int r3 = r3.remaining()
            long r3 = (long) r3
            r4 = 2
            long r3 = r3 << r4
            r4 = r9
            int r4 = org.lwjgl.opengl.GLChecks.typeToByteShift(r4)
            long r3 = r3 >> r4
            int r3 = (int) r3
            r4 = r10
            long r4 = org.lwjgl.system.MemoryUtil.memAddress(r4)
            int r0 = nwglGetGPUInfoAMD(r0, r1, r2, r3, r4)
            return r0
    }

    public static int wglGetGPUInfoAMD(@org.lwjgl.system.NativeType("UINT") int r7, int r8, @org.lwjgl.system.NativeType("GLenum") int r9, @org.lwjgl.system.NativeType("void *") java.nio.FloatBuffer r10) {
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = r10
            int r3 = r3.remaining()
            long r3 = (long) r3
            r4 = 2
            long r3 = r3 << r4
            r4 = r9
            int r4 = org.lwjgl.opengl.GLChecks.typeToByteShift(r4)
            long r3 = r3 >> r4
            int r3 = (int) r3
            r4 = r10
            long r4 = org.lwjgl.system.MemoryUtil.memAddress(r4)
            int r0 = nwglGetGPUInfoAMD(r0, r1, r2, r3, r4)
            return r0
    }

    @org.lwjgl.system.NativeType("UINT")
    public static int wglGetContextGPUIDAMD(@org.lwjgl.system.NativeType("HGLRC") long r5) {
            org.lwjgl.opengl.WGLCapabilities r0 = org.lwjgl.opengl.GL.getCapabilitiesWGL()
            long r0 = r0.wglGetContextGPUIDAMD
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
            return r0
    }

    @org.lwjgl.system.NativeType("HGLRC")
    public static long wglCreateAssociatedContextAMD(@org.lwjgl.system.NativeType("UINT") int r4) {
            org.lwjgl.opengl.WGLCapabilities r0 = org.lwjgl.opengl.GL.getCapabilitiesWGL()
            long r0 = r0.wglCreateAssociatedContextAMD
            r5 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L12
            r0 = r5
            long r0 = org.lwjgl.system.Checks.check(r0)
        L12:
            r0 = r4
            r1 = r5
            long r0 = org.lwjgl.system.JNI.callP(r0, r1)
            return r0
    }

    public static long nwglCreateAssociatedContextAttribsAMD(int r8, long r9, long r11) {
            org.lwjgl.opengl.WGLCapabilities r0 = org.lwjgl.opengl.GL.getCapabilitiesWGL()
            long r0 = r0.wglCreateAssociatedContextAttribsAMD
            r13 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L14
            r0 = r13
            long r0 = org.lwjgl.system.Checks.check(r0)
        L14:
            r0 = r8
            r1 = r9
            r2 = r11
            r3 = r13
            long r0 = org.lwjgl.system.JNI.callPPP(r0, r1, r2, r3)
            return r0
    }

    @org.lwjgl.system.NativeType("HGLRC")
    public static long wglCreateAssociatedContextAttribsAMD(@org.lwjgl.system.NativeType("UINT") int r6, @org.lwjgl.system.NativeType("HGLRC") long r7, @javax.annotation.Nullable @org.lwjgl.system.NativeType("int const *") java.nio.IntBuffer r9) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto La
            r0 = r9
            org.lwjgl.system.Checks.checkNTSafe(r0)
        La:
            r0 = r6
            r1 = r7
            r2 = r9
            long r2 = org.lwjgl.system.MemoryUtil.memAddressSafe(r2)
            long r0 = nwglCreateAssociatedContextAttribsAMD(r0, r1, r2)
            return r0
    }

    @org.lwjgl.system.NativeType("BOOL")
    public static boolean wglDeleteAssociatedContextAMD(@org.lwjgl.system.NativeType("HGLRC") long r5) {
            org.lwjgl.opengl.WGLCapabilities r0 = org.lwjgl.opengl.GL.getCapabilitiesWGL()
            long r0 = r0.wglDeleteAssociatedContextAMD
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

    @org.lwjgl.system.NativeType("BOOL")
    public static boolean wglMakeAssociatedContextCurrentAMD(@org.lwjgl.system.NativeType("HGLRC") long r5) {
            org.lwjgl.opengl.WGLCapabilities r0 = org.lwjgl.opengl.GL.getCapabilitiesWGL()
            long r0 = r0.wglMakeAssociatedContextCurrentAMD
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

    @org.lwjgl.system.NativeType("HGLRC")
    public static long wglGetCurrentAssociatedContextAMD() {
            org.lwjgl.opengl.WGLCapabilities r0 = org.lwjgl.opengl.GL.getCapabilitiesWGL()
            long r0 = r0.wglGetCurrentAssociatedContextAMD
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

    @org.lwjgl.system.NativeType("VOID")
    public static void wglBlitContextFramebufferAMD(@org.lwjgl.system.NativeType("HGLRC") long r15, @org.lwjgl.system.NativeType("GLint") int r17, @org.lwjgl.system.NativeType("GLint") int r18, @org.lwjgl.system.NativeType("GLint") int r19, @org.lwjgl.system.NativeType("GLint") int r20, @org.lwjgl.system.NativeType("GLint") int r21, @org.lwjgl.system.NativeType("GLint") int r22, @org.lwjgl.system.NativeType("GLint") int r23, @org.lwjgl.system.NativeType("GLint") int r24, @org.lwjgl.system.NativeType("GLbitfield") int r25, @org.lwjgl.system.NativeType("GLenum") int r26) {
            org.lwjgl.opengl.WGLCapabilities r0 = org.lwjgl.opengl.GL.getCapabilitiesWGL()
            long r0 = r0.wglBlitContextFramebufferAMD
            r27 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L19
            r0 = r27
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r15
            long r0 = org.lwjgl.system.Checks.check(r0)
        L19:
            r0 = r15
            r1 = r17
            r2 = r18
            r3 = r19
            r4 = r20
            r5 = r21
            r6 = r22
            r7 = r23
            r8 = r24
            r9 = r25
            r10 = r26
            r11 = r27
            org.lwjgl.system.JNI.callPV(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            return
    }

    @org.lwjgl.system.NativeType("UINT")
    public static int wglGetGPUIDsAMD(@javax.annotation.Nullable @org.lwjgl.system.NativeType("UINT *") int[] r5) {
            org.lwjgl.opengl.WGLCapabilities r0 = org.lwjgl.opengl.GL.getCapabilitiesWGL()
            long r0 = r0.wglGetGPUIDsAMD
            r6 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L12
            r0 = r6
            long r0 = org.lwjgl.system.Checks.check(r0)
        L12:
            r0 = r5
            int r0 = org.lwjgl.system.Checks.lengthSafe(r0)
            r1 = r5
            r2 = r6
            int r0 = org.lwjgl.system.JNI.callPI(r0, r1, r2)
            return r0
    }

    public static int wglGetGPUInfoAMD(@org.lwjgl.system.NativeType("UINT") int r8, int r9, @org.lwjgl.system.NativeType("GLenum") int r10, @org.lwjgl.system.NativeType("void *") int[] r11) {
            org.lwjgl.opengl.WGLCapabilities r0 = org.lwjgl.opengl.GL.getCapabilitiesWGL()
            long r0 = r0.wglGetGPUInfoAMD
            r12 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L14
            r0 = r12
            long r0 = org.lwjgl.system.Checks.check(r0)
        L14:
            r0 = r8
            r1 = r9
            r2 = r10
            r3 = r11
            int r3 = r3.length
            r4 = r11
            r5 = r12
            int r0 = org.lwjgl.system.JNI.callPI(r0, r1, r2, r3, r4, r5)
            return r0
    }

    public static int wglGetGPUInfoAMD(@org.lwjgl.system.NativeType("UINT") int r8, int r9, @org.lwjgl.system.NativeType("GLenum") int r10, @org.lwjgl.system.NativeType("void *") float[] r11) {
            org.lwjgl.opengl.WGLCapabilities r0 = org.lwjgl.opengl.GL.getCapabilitiesWGL()
            long r0 = r0.wglGetGPUInfoAMD
            r12 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L14
            r0 = r12
            long r0 = org.lwjgl.system.Checks.check(r0)
        L14:
            r0 = r8
            r1 = r9
            r2 = r10
            r3 = r11
            int r3 = r3.length
            r4 = r11
            r5 = r12
            int r0 = org.lwjgl.system.JNI.callPI(r0, r1, r2, r3, r4, r5)
            return r0
    }

    @org.lwjgl.system.NativeType("HGLRC")
    public static long wglCreateAssociatedContextAttribsAMD(@org.lwjgl.system.NativeType("UINT") int r7, @org.lwjgl.system.NativeType("HGLRC") long r8, @javax.annotation.Nullable @org.lwjgl.system.NativeType("int const *") int[] r10) {
            org.lwjgl.opengl.WGLCapabilities r0 = org.lwjgl.opengl.GL.getCapabilitiesWGL()
            long r0 = r0.wglCreateAssociatedContextAttribsAMD
            r11 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L18
            r0 = r11
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r10
            org.lwjgl.system.Checks.checkNTSafe(r0)
        L18:
            r0 = r7
            r1 = r8
            r2 = r10
            r3 = r11
            long r0 = org.lwjgl.system.JNI.callPPP(r0, r1, r2, r3)
            return r0
    }
}
