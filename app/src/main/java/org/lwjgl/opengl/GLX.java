package org.lwjgl.opengl;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/opengl/GLX.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/opengl/GLX.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/opengl/GLX.class */
public class GLX {
    public static final int GLXBadContext = 0;
    public static final int GLXBadContextState = 1;
    public static final int GLXBadDrawable = 2;
    public static final int GLXBadPixmap = 3;
    public static final int GLXBadContextTag = 4;
    public static final int GLXBadCurrentWindow = 5;
    public static final int GLXBadRenderRequest = 6;
    public static final int GLXBadLargeRequest = 7;
    public static final int GLXUnsupportedPrivateRequest = 8;
    public static final int GLXBadFBConfig = 9;
    public static final int GLXBadPbuffer = 10;
    public static final int GLXBadCurrentDrawable = 11;
    public static final int GLXBadWindow = 12;
    public static final int GLX_USE_GL = 1;
    public static final int GLX_BUFFER_SIZE = 2;
    public static final int GLX_LEVEL = 3;
    public static final int GLX_RGBA = 4;
    public static final int GLX_DOUBLEBUFFER = 5;
    public static final int GLX_STEREO = 6;
    public static final int GLX_AUX_BUFFERS = 7;
    public static final int GLX_RED_SIZE = 8;
    public static final int GLX_GREEN_SIZE = 9;
    public static final int GLX_BLUE_SIZE = 10;
    public static final int GLX_ALPHA_SIZE = 11;
    public static final int GLX_DEPTH_SIZE = 12;
    public static final int GLX_STENCIL_SIZE = 13;
    public static final int GLX_ACCUM_RED_SIZE = 14;
    public static final int GLX_ACCUM_GREEN_SIZE = 15;
    public static final int GLX_ACCUM_BLUE_SIZE = 16;
    public static final int GLX_ACCUM_ALPHA_SIZE = 17;
    public static final int GLX_BAD_SCREEN = 1;
    public static final int GLX_BAD_ATTRIBUTE = 2;
    public static final int GLX_NO_EXTENSION = 3;
    public static final int GLX_BAD_VISUAL = 4;
    public static final int GLX_BAD_CONTEXT = 5;
    public static final int GLX_BAD_VALUE = 6;
    public static final int GLX_BAD_ENUM = 7;

    /* JADX WARN: Classes with same name are omitted, all sources:
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/opengl/GLX$Functions.class
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/opengl/GLX$Functions.class
     */
    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/opengl/GLX$Functions.class */
    public static final class Functions {
        public static final long QueryExtension = 0;
        public static final long QueryVersion = 0;
        public static final long GetConfig = 0;
        public static final long ChooseVisual = 0;
        public static final long CreateContext = 0;
        public static final long MakeCurrent = 0;
        public static final long CopyContext = 0;
        public static final long IsDirect = 0;
        public static final long DestroyContext = 0;
        public static final long GetCurrentContext = 0;
        public static final long GetCurrentDrawable = 0;
        public static final long WaitGL = 0;
        public static final long WaitX = 0;
        public static final long SwapBuffers = 0;
        public static final long UseXFont = 0;
        public static final long CreateGLXPixmap = 0;
        public static final long DestroyGLXPixmap = 0;

        private Functions() {
                r2 = this;
                r0 = r2
                r0.<init>()
                return
        }

        static {
                org.lwjgl.system.FunctionProvider r0 = org.lwjgl.opengl.GL.getFunctionProvider()
                java.lang.String r1 = "glXQueryExtension"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.opengl.GLX.Functions.QueryExtension = r0
                org.lwjgl.system.FunctionProvider r0 = org.lwjgl.opengl.GL.getFunctionProvider()
                java.lang.String r1 = "glXQueryVersion"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.opengl.GLX.Functions.QueryVersion = r0
                org.lwjgl.system.FunctionProvider r0 = org.lwjgl.opengl.GL.getFunctionProvider()
                java.lang.String r1 = "glXGetConfig"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.opengl.GLX.Functions.GetConfig = r0
                org.lwjgl.system.FunctionProvider r0 = org.lwjgl.opengl.GL.getFunctionProvider()
                java.lang.String r1 = "glXChooseVisual"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.opengl.GLX.Functions.ChooseVisual = r0
                org.lwjgl.system.FunctionProvider r0 = org.lwjgl.opengl.GL.getFunctionProvider()
                java.lang.String r1 = "glXCreateContext"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.opengl.GLX.Functions.CreateContext = r0
                org.lwjgl.system.FunctionProvider r0 = org.lwjgl.opengl.GL.getFunctionProvider()
                java.lang.String r1 = "glXMakeCurrent"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.opengl.GLX.Functions.MakeCurrent = r0
                org.lwjgl.system.FunctionProvider r0 = org.lwjgl.opengl.GL.getFunctionProvider()
                java.lang.String r1 = "glXCopyContext"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.opengl.GLX.Functions.CopyContext = r0
                org.lwjgl.system.FunctionProvider r0 = org.lwjgl.opengl.GL.getFunctionProvider()
                java.lang.String r1 = "glXIsDirect"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.opengl.GLX.Functions.IsDirect = r0
                org.lwjgl.system.FunctionProvider r0 = org.lwjgl.opengl.GL.getFunctionProvider()
                java.lang.String r1 = "glXDestroyContext"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.opengl.GLX.Functions.DestroyContext = r0
                org.lwjgl.system.FunctionProvider r0 = org.lwjgl.opengl.GL.getFunctionProvider()
                java.lang.String r1 = "glXGetCurrentContext"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.opengl.GLX.Functions.GetCurrentContext = r0
                org.lwjgl.system.FunctionProvider r0 = org.lwjgl.opengl.GL.getFunctionProvider()
                java.lang.String r1 = "glXGetCurrentDrawable"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.opengl.GLX.Functions.GetCurrentDrawable = r0
                org.lwjgl.system.FunctionProvider r0 = org.lwjgl.opengl.GL.getFunctionProvider()
                java.lang.String r1 = "glXWaitGL"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.opengl.GLX.Functions.WaitGL = r0
                org.lwjgl.system.FunctionProvider r0 = org.lwjgl.opengl.GL.getFunctionProvider()
                java.lang.String r1 = "glXWaitX"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.opengl.GLX.Functions.WaitX = r0
                org.lwjgl.system.FunctionProvider r0 = org.lwjgl.opengl.GL.getFunctionProvider()
                java.lang.String r1 = "glXSwapBuffers"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.opengl.GLX.Functions.SwapBuffers = r0
                org.lwjgl.system.FunctionProvider r0 = org.lwjgl.opengl.GL.getFunctionProvider()
                java.lang.String r1 = "glXUseXFont"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.opengl.GLX.Functions.UseXFont = r0
                org.lwjgl.system.FunctionProvider r0 = org.lwjgl.opengl.GL.getFunctionProvider()
                java.lang.String r1 = "glXCreateGLXPixmap"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.opengl.GLX.Functions.CreateGLXPixmap = r0
                org.lwjgl.system.FunctionProvider r0 = org.lwjgl.opengl.GL.getFunctionProvider()
                java.lang.String r1 = "glXDestroyGLXPixmap"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.opengl.GLX.Functions.DestroyGLXPixmap = r0
                return
        }
    }

    protected GLX() {
            r3 = this;
            r0 = r3
            r0.<init>()
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r1 = r0
            r1.<init>()
            throw r0
    }

    public static int nglXQueryExtension(long r9, long r11, long r13) {
            long r0 = org.lwjgl.opengl.GLX.Functions.QueryExtension
            r15 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L10
            r0 = r9
            long r0 = org.lwjgl.system.Checks.check(r0)
        L10:
            r0 = r9
            r1 = r11
            r2 = r13
            r3 = r15
            int r0 = org.lwjgl.system.JNI.callPPPI(r0, r1, r2, r3)
            return r0
    }

    @org.lwjgl.system.NativeType("Bool")
    public static boolean glXQueryExtension(@org.lwjgl.system.NativeType("Display *") long r7, @org.lwjgl.system.NativeType("int *") java.nio.IntBuffer r9, @org.lwjgl.system.NativeType("int *") java.nio.IntBuffer r10) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L10
            r0 = r9
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
            r0 = r10
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
        L10:
            r0 = r7
            r1 = r9
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            r2 = r10
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            int r0 = nglXQueryExtension(r0, r1, r2)
            if (r0 == 0) goto L23
            r0 = 1
            goto L24
        L23:
            r0 = 0
        L24:
            return r0
    }

    public static int nglXQueryVersion(long r9, long r11, long r13) {
            long r0 = org.lwjgl.opengl.GLX.Functions.QueryVersion
            r15 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L10
            r0 = r9
            long r0 = org.lwjgl.system.Checks.check(r0)
        L10:
            r0 = r9
            r1 = r11
            r2 = r13
            r3 = r15
            int r0 = org.lwjgl.system.JNI.callPPPI(r0, r1, r2, r3)
            return r0
    }

    @org.lwjgl.system.NativeType("Bool")
    public static boolean glXQueryVersion(@org.lwjgl.system.NativeType("Display *") long r7, @org.lwjgl.system.NativeType("int *") java.nio.IntBuffer r9, @org.lwjgl.system.NativeType("int *") java.nio.IntBuffer r10) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L10
            r0 = r9
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
            r0 = r10
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
        L10:
            r0 = r7
            r1 = r9
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            r2 = r10
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            int r0 = nglXQueryVersion(r0, r1, r2)
            if (r0 == 0) goto L23
            r0 = 1
            goto L24
        L23:
            r0 = 0
        L24:
            return r0
    }

    public static int nglXGetConfig(long r10, long r12, int r14, long r15) {
            long r0 = org.lwjgl.opengl.GLX.Functions.GetConfig
            r17 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L14
            r0 = r10
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r12
            org.lwjgl.system.linux.XVisualInfo.validate(r0)
        L14:
            r0 = r10
            r1 = r12
            r2 = r14
            r3 = r15
            r4 = r17
            int r0 = org.lwjgl.system.JNI.callPPPI(r0, r1, r2, r3, r4)
            return r0
    }

    public static int glXGetConfig(@org.lwjgl.system.NativeType("Display *") long r8, @org.lwjgl.system.NativeType("XVisualInfo *") org.lwjgl.system.linux.XVisualInfo r10, int r11, @org.lwjgl.system.NativeType("int *") java.nio.IntBuffer r12) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lc
            r0 = r12
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
        Lc:
            r0 = r8
            r1 = r10
            long r1 = r1.address()
            r2 = r11
            r3 = r12
            long r3 = org.lwjgl.system.MemoryUtil.memAddress(r3)
            int r0 = nglXGetConfig(r0, r1, r2, r3)
            return r0
    }

    public static long nglXChooseVisual(long r8, int r10, long r11) {
            long r0 = org.lwjgl.opengl.GLX.Functions.ChooseVisual
            r13 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L10
            r0 = r8
            long r0 = org.lwjgl.system.Checks.check(r0)
        L10:
            r0 = r8
            r1 = r10
            r2 = r11
            r3 = r13
            long r0 = org.lwjgl.system.JNI.callPPP(r0, r1, r2, r3)
            return r0
    }

    @javax.annotation.Nullable
    @org.lwjgl.system.NativeType("XVisualInfo *")
    public static org.lwjgl.system.linux.XVisualInfo glXChooseVisual(@org.lwjgl.system.NativeType("Display *") long r6, int r8, @javax.annotation.Nullable @org.lwjgl.system.NativeType("int *") java.nio.IntBuffer r9) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto La
            r0 = r9
            org.lwjgl.system.Checks.checkNTSafe(r0)
        La:
            r0 = r6
            r1 = r8
            r2 = r9
            long r2 = org.lwjgl.system.MemoryUtil.memAddressSafe(r2)
            long r0 = nglXChooseVisual(r0, r1, r2)
            r10 = r0
            r0 = r10
            org.lwjgl.system.linux.XVisualInfo r0 = org.lwjgl.system.linux.XVisualInfo.createSafe(r0)
            return r0
    }

    public static long nglXCreateContext(long r10, long r12, long r14, int r16) {
            long r0 = org.lwjgl.opengl.GLX.Functions.CreateContext
            r17 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L14
            r0 = r10
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r12
            org.lwjgl.system.linux.XVisualInfo.validate(r0)
        L14:
            r0 = r10
            r1 = r12
            r2 = r14
            r3 = r16
            r4 = r17
            long r0 = org.lwjgl.system.JNI.callPPPP(r0, r1, r2, r3, r4)
            return r0
    }

    @org.lwjgl.system.NativeType("GLXContext")
    public static long glXCreateContext(@org.lwjgl.system.NativeType("Display *") long r8, @org.lwjgl.system.NativeType("XVisualInfo *") org.lwjgl.system.linux.XVisualInfo r10, @org.lwjgl.system.NativeType("GLXContext") long r11, @org.lwjgl.system.NativeType("Bool") boolean r13) {
            r0 = r8
            r1 = r10
            long r1 = r1.address()
            r2 = r11
            r3 = r13
            if (r3 == 0) goto Lf
            r3 = 1
            goto L10
        Lf:
            r3 = 0
        L10:
            long r0 = nglXCreateContext(r0, r1, r2, r3)
            return r0
    }

    @org.lwjgl.system.NativeType("Bool")
    public static boolean glXMakeCurrent(@org.lwjgl.system.NativeType("Display *") long r9, @org.lwjgl.system.NativeType("GLXDrawable") long r11, @org.lwjgl.system.NativeType("GLXContext") long r13) {
            long r0 = org.lwjgl.opengl.GLX.Functions.MakeCurrent
            r15 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L10
            r0 = r9
            long r0 = org.lwjgl.system.Checks.check(r0)
        L10:
            r0 = r9
            r1 = r11
            r2 = r13
            r3 = r15
            int r0 = org.lwjgl.system.JNI.callPPPI(r0, r1, r2, r3)
            if (r0 == 0) goto L20
            r0 = 1
            goto L21
        L20:
            r0 = 0
        L21:
            return r0
    }

    public static void glXCopyContext(@org.lwjgl.system.NativeType("Display *") long r11, @org.lwjgl.system.NativeType("GLXContext") long r13, @org.lwjgl.system.NativeType("GLXContext") long r15, @org.lwjgl.system.NativeType("unsigned long") long r17) {
            long r0 = org.lwjgl.opengl.GLX.Functions.CopyContext
            r19 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L1b
            r0 = r11
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r13
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r15
            long r0 = org.lwjgl.system.Checks.check(r0)
        L1b:
            r0 = r11
            r1 = r13
            r2 = r15
            r3 = r17
            r4 = r19
            org.lwjgl.system.JNI.callPPPNV(r0, r1, r2, r3, r4)
            return
    }

    @org.lwjgl.system.NativeType("Bool")
    public static boolean glXIsDirect(@org.lwjgl.system.NativeType("Display *") long r7, @org.lwjgl.system.NativeType("GLXContext") long r9) {
            long r0 = org.lwjgl.opengl.GLX.Functions.IsDirect
            r11 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L15
            r0 = r7
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r9
            long r0 = org.lwjgl.system.Checks.check(r0)
        L15:
            r0 = r7
            r1 = r9
            r2 = r11
            int r0 = org.lwjgl.system.JNI.callPPI(r0, r1, r2)
            if (r0 == 0) goto L23
            r0 = 1
            goto L24
        L23:
            r0 = 0
        L24:
            return r0
    }

    public static void glXDestroyContext(@org.lwjgl.system.NativeType("Display *") long r7, @org.lwjgl.system.NativeType("GLXContext") long r9) {
            long r0 = org.lwjgl.opengl.GLX.Functions.DestroyContext
            r11 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L15
            r0 = r7
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r9
            long r0 = org.lwjgl.system.Checks.check(r0)
        L15:
            r0 = r7
            r1 = r9
            r2 = r11
            org.lwjgl.system.JNI.callPPV(r0, r1, r2)
            return
    }

    @org.lwjgl.system.NativeType("GLXContext")
    public static long glXGetCurrentContext() {
            long r0 = org.lwjgl.opengl.GLX.Functions.GetCurrentContext
            r3 = r0
            r0 = r3
            long r0 = org.lwjgl.system.JNI.callP(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("GLXDrawable")
    public static long glXGetCurrentDrawable() {
            long r0 = org.lwjgl.opengl.GLX.Functions.GetCurrentDrawable
            r3 = r0
            r0 = r3
            long r0 = org.lwjgl.system.JNI.callP(r0)
            return r0
    }

    public static void glXWaitGL() {
            long r0 = org.lwjgl.opengl.GLX.Functions.WaitGL
            r3 = r0
            r0 = r3
            org.lwjgl.system.JNI.callV(r0)
            return
    }

    public static void glXWaitX() {
            long r0 = org.lwjgl.opengl.GLX.Functions.WaitX
            r3 = r0
            r0 = r3
            org.lwjgl.system.JNI.callV(r0)
            return
    }

    public static void glXSwapBuffers(@org.lwjgl.system.NativeType("Display *") long r7, @org.lwjgl.system.NativeType("GLXDrawable") long r9) {
            long r0 = org.lwjgl.opengl.GLX.Functions.SwapBuffers
            r11 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L15
            r0 = r7
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r9
            long r0 = org.lwjgl.system.Checks.check(r0)
        L15:
            r0 = r7
            r1 = r9
            r2 = r11
            org.lwjgl.system.JNI.callPPV(r0, r1, r2)
            return
    }

    public static void glXUseXFont(@org.lwjgl.system.NativeType("Font") long r8, int r10, int r11, int r12) {
            long r0 = org.lwjgl.opengl.GLX.Functions.UseXFont
            r13 = r0
            r0 = r8
            r1 = r10
            r2 = r11
            r3 = r12
            r4 = r13
            org.lwjgl.system.JNI.callNV(r0, r1, r2, r3, r4)
            return
    }

    public static long nglXCreateGLXPixmap(long r9, long r11, long r13) {
            long r0 = org.lwjgl.opengl.GLX.Functions.CreateGLXPixmap
            r15 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L14
            r0 = r9
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r11
            org.lwjgl.system.linux.XVisualInfo.validate(r0)
        L14:
            r0 = r9
            r1 = r11
            r2 = r13
            r3 = r15
            long r0 = org.lwjgl.system.JNI.callPPNP(r0, r1, r2, r3)
            return r0
    }

    @org.lwjgl.system.NativeType("GLXPixmap")
    public static long glXCreateGLXPixmap(@org.lwjgl.system.NativeType("Display *") long r7, @org.lwjgl.system.NativeType("XVisualInfo *") org.lwjgl.system.linux.XVisualInfo r9, @org.lwjgl.system.NativeType("Pixmap") long r10) {
            r0 = r7
            r1 = r9
            long r1 = r1.address()
            r2 = r10
            long r0 = nglXCreateGLXPixmap(r0, r1, r2)
            return r0
    }

    public static void glXDestroyGLXPixmap(@org.lwjgl.system.NativeType("Display *") long r7, @org.lwjgl.system.NativeType("GLXPixmap") long r9) {
            long r0 = org.lwjgl.opengl.GLX.Functions.DestroyGLXPixmap
            r11 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L15
            r0 = r7
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r9
            long r0 = org.lwjgl.system.Checks.check(r0)
        L15:
            r0 = r7
            r1 = r9
            r2 = r11
            org.lwjgl.system.JNI.callPPV(r0, r1, r2)
            return
    }

    @org.lwjgl.system.NativeType("Bool")
    public static boolean glXQueryExtension(@org.lwjgl.system.NativeType("Display *") long r7, @org.lwjgl.system.NativeType("int *") int[] r9, @org.lwjgl.system.NativeType("int *") int[] r10) {
            long r0 = org.lwjgl.opengl.GLX.Functions.QueryExtension
            r11 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L1a
            r0 = r7
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r9
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
            r0 = r10
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
        L1a:
            r0 = r7
            r1 = r9
            r2 = r10
            r3 = r11
            int r0 = org.lwjgl.system.JNI.callPPPI(r0, r1, r2, r3)
            if (r0 == 0) goto L29
            r0 = 1
            goto L2a
        L29:
            r0 = 0
        L2a:
            return r0
    }

    @org.lwjgl.system.NativeType("Bool")
    public static boolean glXQueryVersion(@org.lwjgl.system.NativeType("Display *") long r7, @org.lwjgl.system.NativeType("int *") int[] r9, @org.lwjgl.system.NativeType("int *") int[] r10) {
            long r0 = org.lwjgl.opengl.GLX.Functions.QueryVersion
            r11 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L1a
            r0 = r7
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r9
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
            r0 = r10
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
        L1a:
            r0 = r7
            r1 = r9
            r2 = r10
            r3 = r11
            int r0 = org.lwjgl.system.JNI.callPPPI(r0, r1, r2, r3)
            if (r0 == 0) goto L29
            r0 = 1
            goto L2a
        L29:
            r0 = 0
        L2a:
            return r0
    }

    public static int glXGetConfig(@org.lwjgl.system.NativeType("Display *") long r9, @org.lwjgl.system.NativeType("XVisualInfo *") org.lwjgl.system.linux.XVisualInfo r11, int r12, @org.lwjgl.system.NativeType("int *") int[] r13) {
            long r0 = org.lwjgl.opengl.GLX.Functions.GetConfig
            r14 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L1d
            r0 = r9
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r13
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
            r0 = r11
            long r0 = r0.address()
            org.lwjgl.system.linux.XVisualInfo.validate(r0)
        L1d:
            r0 = r9
            r1 = r11
            long r1 = r1.address()
            r2 = r12
            r3 = r13
            r4 = r14
            int r0 = org.lwjgl.system.JNI.callPPPI(r0, r1, r2, r3, r4)
            return r0
    }

    @javax.annotation.Nullable
    @org.lwjgl.system.NativeType("XVisualInfo *")
    public static org.lwjgl.system.linux.XVisualInfo glXChooseVisual(@org.lwjgl.system.NativeType("Display *") long r7, int r9, @javax.annotation.Nullable @org.lwjgl.system.NativeType("int *") int[] r10) {
            long r0 = org.lwjgl.opengl.GLX.Functions.ChooseVisual
            r11 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L14
            r0 = r7
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r10
            org.lwjgl.system.Checks.checkNTSafe(r0)
        L14:
            r0 = r7
            r1 = r9
            r2 = r10
            r3 = r11
            long r0 = org.lwjgl.system.JNI.callPPP(r0, r1, r2, r3)
            r13 = r0
            r0 = r13
            org.lwjgl.system.linux.XVisualInfo r0 = org.lwjgl.system.linux.XVisualInfo.createSafe(r0)
            return r0
    }
}
