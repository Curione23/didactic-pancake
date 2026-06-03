package org.lwjgl.opengl;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/opengl/WGLARBPixelFormat.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/opengl/WGLARBPixelFormat.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/opengl/WGLARBPixelFormat.class */
public class WGLARBPixelFormat {
    public static final int WGL_NUMBER_PIXEL_FORMATS_ARB = 8192;
    public static final int WGL_DRAW_TO_WINDOW_ARB = 8193;
    public static final int WGL_DRAW_TO_BITMAP_ARB = 8194;
    public static final int WGL_ACCELERATION_ARB = 8195;
    public static final int WGL_NEED_PALETTE_ARB = 8196;
    public static final int WGL_NEED_SYSTEM_PALETTE_ARB = 8197;
    public static final int WGL_SWAP_LAYER_BUFFERS_ARB = 8198;
    public static final int WGL_SWAP_METHOD_ARB = 8199;
    public static final int WGL_NUMBER_OVERLAYS_ARB = 8200;
    public static final int WGL_NUMBER_UNDERLAYS_ARB = 8201;
    public static final int WGL_TRANSPARENT_ARB = 8202;
    public static final int WGL_TRANSPARENT_RED_VALUE_ARB = 8247;
    public static final int WGL_TRANSPARENT_GREEN_VALUE_ARB = 8248;
    public static final int WGL_TRANSPARENT_BLUE_VALUE_ARB = 8249;
    public static final int WGL_TRANSPARENT_ALPHA_VALUE_ARB = 8250;
    public static final int WGL_TRANSPARENT_INDEX_VALUE_ARB = 8251;
    public static final int WGL_SHARE_DEPTH_ARB = 8204;
    public static final int WGL_SHARE_STENCIL_ARB = 8205;
    public static final int WGL_SHARE_ACCUM_ARB = 8206;
    public static final int WGL_SUPPORT_GDI_ARB = 8207;
    public static final int WGL_SUPPORT_OPENGL_ARB = 8208;
    public static final int WGL_DOUBLE_BUFFER_ARB = 8209;
    public static final int WGL_STEREO_ARB = 8210;
    public static final int WGL_PIXEL_TYPE_ARB = 8211;
    public static final int WGL_COLOR_BITS_ARB = 8212;
    public static final int WGL_RED_BITS_ARB = 8213;
    public static final int WGL_RED_SHIFT_ARB = 8214;
    public static final int WGL_GREEN_BITS_ARB = 8215;
    public static final int WGL_GREEN_SHIFT_ARB = 8216;
    public static final int WGL_BLUE_BITS_ARB = 8217;
    public static final int WGL_BLUE_SHIFT_ARB = 8218;
    public static final int WGL_ALPHA_BITS_ARB = 8219;
    public static final int WGL_ALPHA_SHIFT_ARB = 8220;
    public static final int WGL_ACCUM_BITS_ARB = 8221;
    public static final int WGL_ACCUM_RED_BITS_ARB = 8222;
    public static final int WGL_ACCUM_GREEN_BITS_ARB = 8223;
    public static final int WGL_ACCUM_BLUE_BITS_ARB = 8224;
    public static final int WGL_ACCUM_ALPHA_BITS_ARB = 8225;
    public static final int WGL_DEPTH_BITS_ARB = 8226;
    public static final int WGL_STENCIL_BITS_ARB = 8227;
    public static final int WGL_AUX_BUFFERS_ARB = 8228;
    public static final int WGL_NO_ACCELERATION_ARB = 8229;
    public static final int WGL_GENERIC_ACCELERATION_ARB = 8230;
    public static final int WGL_FULL_ACCELERATION_ARB = 8231;
    public static final int WGL_SWAP_EXCHANGE_ARB = 8232;
    public static final int WGL_SWAP_COPY_ARB = 8233;
    public static final int WGL_SWAP_UNDEFINED_ARB = 8234;
    public static final int WGL_TYPE_RGBA_ARB = 8235;
    public static final int WGL_TYPE_COLORINDEX_ARB = 8236;

    protected WGLARBPixelFormat() {
            r3 = this;
            r0 = r3
            r0.<init>()
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r1 = r0
            r1.<init>()
            throw r0
    }

    public static int nwglGetPixelFormatAttribivARB(long r12, int r14, int r15, int r16, long r17, long r19) {
            org.lwjgl.opengl.WGLCapabilities r0 = org.lwjgl.opengl.GL.getCapabilitiesWGL()
            long r0 = r0.wglGetPixelFormatAttribivARB
            r21 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L19
            r0 = r21
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r12
            long r0 = org.lwjgl.system.Checks.check(r0)
        L19:
            r0 = r12
            r1 = r14
            r2 = r15
            r3 = r16
            r4 = r17
            r5 = r19
            r6 = r21
            int r0 = org.lwjgl.system.JNI.callPPPI(r0, r1, r2, r3, r4, r5, r6)
            return r0
    }

    @org.lwjgl.system.NativeType("BOOL")
    public static boolean wglGetPixelFormatAttribivARB(@org.lwjgl.system.NativeType("HDC") long r10, int r12, int r13, @org.lwjgl.system.NativeType("int const *") java.nio.IntBuffer r14, @org.lwjgl.system.NativeType("int *") java.nio.IntBuffer r15) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L10
            r0 = r15
            r1 = r14
            int r1 = r1.remaining()
            org.lwjgl.system.Checks.check(r0, r1)
        L10:
            r0 = r10
            r1 = r12
            r2 = r13
            r3 = r14
            int r3 = r3.remaining()
            r4 = r14
            long r4 = org.lwjgl.system.MemoryUtil.memAddress(r4)
            r5 = r15
            long r5 = org.lwjgl.system.MemoryUtil.memAddress(r5)
            int r0 = nwglGetPixelFormatAttribivARB(r0, r1, r2, r3, r4, r5)
            if (r0 == 0) goto L2c
            r0 = 1
            goto L2d
        L2c:
            r0 = 0
        L2d:
            return r0
    }

    @org.lwjgl.system.NativeType("BOOL")
    public static boolean wglGetPixelFormatAttribiARB(@org.lwjgl.system.NativeType("HDC") long r10, int r12, int r13, @org.lwjgl.system.NativeType("int const *") int r14, @org.lwjgl.system.NativeType("int *") java.nio.IntBuffer r15) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lc
            r0 = r15
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
        Lc:
            org.lwjgl.system.MemoryStack r0 = org.lwjgl.system.MemoryStack.stackGet()
            r16 = r0
            r0 = r16
            int r0 = r0.getPointer()
            r17 = r0
            r0 = r16
            r1 = r14
            java.nio.IntBuffer r0 = r0.ints(r1)     // Catch: java.lang.Throwable -> L46
            r18 = r0
            r0 = r10
            r1 = r12
            r2 = r13
            r3 = 1
            r4 = r18
            long r4 = org.lwjgl.system.MemoryUtil.memAddress(r4)     // Catch: java.lang.Throwable -> L46
            r5 = r15
            long r5 = org.lwjgl.system.MemoryUtil.memAddress(r5)     // Catch: java.lang.Throwable -> L46
            int r0 = nwglGetPixelFormatAttribivARB(r0, r1, r2, r3, r4, r5)     // Catch: java.lang.Throwable -> L46
            if (r0 == 0) goto L39
            r0 = 1
            goto L3a
        L39:
            r0 = 0
        L3a:
            r19 = r0
            r0 = r16
            r1 = r17
            r0.setPointer(r1)
            r0 = r19
            return r0
        L46:
            r20 = move-exception
            r0 = r16
            r1 = r17
            r0.setPointer(r1)
            r0 = r20
            throw r0
    }

    public static int nwglGetPixelFormatAttribfvARB(long r12, int r14, int r15, int r16, long r17, long r19) {
            org.lwjgl.opengl.WGLCapabilities r0 = org.lwjgl.opengl.GL.getCapabilitiesWGL()
            long r0 = r0.wglGetPixelFormatAttribfvARB
            r21 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L19
            r0 = r21
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r12
            long r0 = org.lwjgl.system.Checks.check(r0)
        L19:
            r0 = r12
            r1 = r14
            r2 = r15
            r3 = r16
            r4 = r17
            r5 = r19
            r6 = r21
            int r0 = org.lwjgl.system.JNI.callPPPI(r0, r1, r2, r3, r4, r5, r6)
            return r0
    }

    @org.lwjgl.system.NativeType("BOOL")
    public static boolean wglGetPixelFormatAttribfvARB(@org.lwjgl.system.NativeType("HDC") long r10, int r12, int r13, @org.lwjgl.system.NativeType("int const *") java.nio.IntBuffer r14, @org.lwjgl.system.NativeType("FLOAT *") java.nio.FloatBuffer r15) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L10
            r0 = r15
            r1 = r14
            int r1 = r1.remaining()
            org.lwjgl.system.Checks.check(r0, r1)
        L10:
            r0 = r10
            r1 = r12
            r2 = r13
            r3 = r14
            int r3 = r3.remaining()
            r4 = r14
            long r4 = org.lwjgl.system.MemoryUtil.memAddress(r4)
            r5 = r15
            long r5 = org.lwjgl.system.MemoryUtil.memAddress(r5)
            int r0 = nwglGetPixelFormatAttribfvARB(r0, r1, r2, r3, r4, r5)
            if (r0 == 0) goto L2c
            r0 = 1
            goto L2d
        L2c:
            r0 = 0
        L2d:
            return r0
    }

    @org.lwjgl.system.NativeType("BOOL")
    public static boolean wglGetPixelFormatAttribfARB(@org.lwjgl.system.NativeType("HDC") long r10, int r12, int r13, @org.lwjgl.system.NativeType("int const *") int r14, @org.lwjgl.system.NativeType("FLOAT *") java.nio.FloatBuffer r15) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lc
            r0 = r15
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
        Lc:
            org.lwjgl.system.MemoryStack r0 = org.lwjgl.system.MemoryStack.stackGet()
            r16 = r0
            r0 = r16
            int r0 = r0.getPointer()
            r17 = r0
            r0 = r16
            r1 = r14
            java.nio.IntBuffer r0 = r0.ints(r1)     // Catch: java.lang.Throwable -> L46
            r18 = r0
            r0 = r10
            r1 = r12
            r2 = r13
            r3 = 1
            r4 = r18
            long r4 = org.lwjgl.system.MemoryUtil.memAddress(r4)     // Catch: java.lang.Throwable -> L46
            r5 = r15
            long r5 = org.lwjgl.system.MemoryUtil.memAddress(r5)     // Catch: java.lang.Throwable -> L46
            int r0 = nwglGetPixelFormatAttribfvARB(r0, r1, r2, r3, r4, r5)     // Catch: java.lang.Throwable -> L46
            if (r0 == 0) goto L39
            r0 = 1
            goto L3a
        L39:
            r0 = 0
        L3a:
            r19 = r0
            r0 = r16
            r1 = r17
            r0.setPointer(r1)
            r0 = r19
            return r0
        L46:
            r20 = move-exception
            r0 = r16
            r1 = r17
            r0.setPointer(r1)
            r0 = r20
            throw r0
    }

    public static int nwglChoosePixelFormatARB(long r14, long r16, long r18, int r20, long r21, long r23) {
            org.lwjgl.opengl.WGLCapabilities r0 = org.lwjgl.opengl.GL.getCapabilitiesWGL()
            long r0 = r0.wglChoosePixelFormatARB
            r25 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L19
            r0 = r25
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r14
            long r0 = org.lwjgl.system.Checks.check(r0)
        L19:
            r0 = r14
            r1 = r16
            r2 = r18
            r3 = r20
            r4 = r21
            r5 = r23
            r6 = r25
            int r0 = org.lwjgl.system.JNI.callPPPPPI(r0, r1, r2, r3, r4, r5, r6)
            return r0
    }

    @org.lwjgl.system.NativeType("BOOL")
    public static boolean wglChoosePixelFormatARB(@org.lwjgl.system.NativeType("HDC") long r12, @javax.annotation.Nullable @org.lwjgl.system.NativeType("int const *") java.nio.IntBuffer r14, @javax.annotation.Nullable @org.lwjgl.system.NativeType("FLOAT const *") java.nio.FloatBuffer r15, @org.lwjgl.system.NativeType("int *") java.nio.IntBuffer r16, @org.lwjgl.system.NativeType("UINT *") java.nio.IntBuffer r17) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L14
            r0 = r14
            org.lwjgl.system.Checks.checkNTSafe(r0)
            r0 = r15
            org.lwjgl.system.Checks.checkNTSafe(r0)
            r0 = r17
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
        L14:
            r0 = r12
            r1 = r14
            long r1 = org.lwjgl.system.MemoryUtil.memAddressSafe(r1)
            r2 = r15
            long r2 = org.lwjgl.system.MemoryUtil.memAddressSafe(r2)
            r3 = r16
            int r3 = r3.remaining()
            r4 = r16
            long r4 = org.lwjgl.system.MemoryUtil.memAddress(r4)
            r5 = r17
            long r5 = org.lwjgl.system.MemoryUtil.memAddress(r5)
            int r0 = nwglChoosePixelFormatARB(r0, r1, r2, r3, r4, r5)
            if (r0 == 0) goto L36
            r0 = 1
            goto L37
        L36:
            r0 = 0
        L37:
            return r0
    }

    @org.lwjgl.system.NativeType("BOOL")
    public static boolean wglGetPixelFormatAttribivARB(@org.lwjgl.system.NativeType("HDC") long r10, int r12, int r13, @org.lwjgl.system.NativeType("int const *") int[] r14, @org.lwjgl.system.NativeType("int *") int[] r15) {
            org.lwjgl.opengl.WGLCapabilities r0 = org.lwjgl.opengl.GL.getCapabilitiesWGL()
            long r0 = r0.wglGetPixelFormatAttribivARB
            r16 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L21
            r0 = r16
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r10
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r15
            r1 = r14
            int r1 = r1.length
            org.lwjgl.system.Checks.check(r0, r1)
        L21:
            r0 = r10
            r1 = r12
            r2 = r13
            r3 = r14
            int r3 = r3.length
            r4 = r14
            r5 = r15
            r6 = r16
            int r0 = org.lwjgl.system.JNI.callPPPI(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L37
            r0 = 1
            goto L38
        L37:
            r0 = 0
        L38:
            return r0
    }

    @org.lwjgl.system.NativeType("BOOL")
    public static boolean wglGetPixelFormatAttribfvARB(@org.lwjgl.system.NativeType("HDC") long r10, int r12, int r13, @org.lwjgl.system.NativeType("int const *") int[] r14, @org.lwjgl.system.NativeType("FLOAT *") float[] r15) {
            org.lwjgl.opengl.WGLCapabilities r0 = org.lwjgl.opengl.GL.getCapabilitiesWGL()
            long r0 = r0.wglGetPixelFormatAttribfvARB
            r16 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L21
            r0 = r16
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r10
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r15
            r1 = r14
            int r1 = r1.length
            org.lwjgl.system.Checks.check(r0, r1)
        L21:
            r0 = r10
            r1 = r12
            r2 = r13
            r3 = r14
            int r3 = r3.length
            r4 = r14
            r5 = r15
            r6 = r16
            int r0 = org.lwjgl.system.JNI.callPPPI(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L37
            r0 = 1
            goto L38
        L37:
            r0 = 0
        L38:
            return r0
    }

    @org.lwjgl.system.NativeType("BOOL")
    public static boolean wglChoosePixelFormatARB(@org.lwjgl.system.NativeType("HDC") long r10, @javax.annotation.Nullable @org.lwjgl.system.NativeType("int const *") int[] r12, @javax.annotation.Nullable @org.lwjgl.system.NativeType("FLOAT const *") float[] r13, @org.lwjgl.system.NativeType("int *") int[] r14, @org.lwjgl.system.NativeType("UINT *") int[] r15) {
            org.lwjgl.opengl.WGLCapabilities r0 = org.lwjgl.opengl.GL.getCapabilitiesWGL()
            long r0 = r0.wglChoosePixelFormatARB
            r16 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L27
            r0 = r16
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r10
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r12
            org.lwjgl.system.Checks.checkNTSafe(r0)
            r0 = r13
            org.lwjgl.system.Checks.checkNTSafe(r0)
            r0 = r15
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
        L27:
            r0 = r10
            r1 = r12
            r2 = r13
            r3 = r14
            int r3 = r3.length
            r4 = r14
            r5 = r15
            r6 = r16
            int r0 = org.lwjgl.system.JNI.callPPPPPI(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L3d
            r0 = 1
            goto L3e
        L3d:
            r0 = 0
        L3e:
            return r0
    }
}
