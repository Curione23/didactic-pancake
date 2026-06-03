package org.lwjgl.opengl;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/opengl/WGL.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/opengl/WGL.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/opengl/WGL.class */
public class WGL {
    public static final int WGL_FONT_LINES = 0;
    public static final int WGL_FONT_POLYGONS = 1;
    public static final int WGL_SWAP_MAIN_PLANE = 1;
    public static final int WGL_SWAP_OVERLAY1 = 2;
    public static final int WGL_SWAP_OVERLAY2 = 4;
    public static final int WGL_SWAP_OVERLAY3 = 8;
    public static final int WGL_SWAP_OVERLAY4 = 16;
    public static final int WGL_SWAP_OVERLAY5 = 32;
    public static final int WGL_SWAP_OVERLAY6 = 64;
    public static final int WGL_SWAP_OVERLAY7 = 128;
    public static final int WGL_SWAP_OVERLAY8 = 256;
    public static final int WGL_SWAP_OVERLAY9 = 512;
    public static final int WGL_SWAP_OVERLAY10 = 1024;
    public static final int WGL_SWAP_OVERLAY11 = 2048;
    public static final int WGL_SWAP_OVERLAY12 = 4096;
    public static final int WGL_SWAP_OVERLAY13 = 8192;
    public static final int WGL_SWAP_OVERLAY14 = 16384;
    public static final int WGL_SWAP_OVERLAY15 = 32768;
    public static final int WGL_SWAP_UNDERLAY1 = 65536;
    public static final int WGL_SWAP_UNDERLAY2 = 131072;
    public static final int WGL_SWAP_UNDERLAY3 = 262144;
    public static final int WGL_SWAP_UNDERLAY4 = 524288;
    public static final int WGL_SWAP_UNDERLAY5 = 1048576;
    public static final int WGL_SWAP_UNDERLAY6 = 2097152;
    public static final int WGL_SWAP_UNDERLAY7 = 4194304;
    public static final int WGL_SWAP_UNDERLAY8 = 8388608;
    public static final int WGL_SWAP_UNDERLAY9 = 16777216;
    public static final int WGL_SWAP_UNDERLAY10 = 33554432;
    public static final int WGL_SWAP_UNDERLAY11 = 67108864;
    public static final int WGL_SWAP_UNDERLAY12 = 134217728;
    public static final int WGL_SWAP_UNDERLAY13 = 268435456;
    public static final int WGL_SWAP_UNDERLAY14 = 536870912;
    public static final int WGL_SWAP_UNDERLAY15 = 1073741824;

    /* JADX WARN: Classes with same name are omitted, all sources:
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/opengl/WGL$Functions.class
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/opengl/WGL$Functions.class
     */
    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/opengl/WGL$Functions.class */
    public static final class Functions {
        public static final long CreateContext = 0;
        public static final long CreateLayerContext = 0;
        public static final long CopyContext = 0;
        public static final long DeleteContext = 0;
        public static final long GetCurrentContext = 0;
        public static final long GetCurrentDC = 0;
        public static final long GetProcAddress = 0;
        public static final long MakeCurrent = 0;
        public static final long ShareLists = 0;

        private Functions() {
                r2 = this;
                r0 = r2
                r0.<init>()
                return
        }

        static {
                org.lwjgl.system.FunctionProvider r0 = org.lwjgl.opengl.GL.getFunctionProvider()
                java.lang.String r1 = "wglCreateContext"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.opengl.WGL.Functions.CreateContext = r0
                org.lwjgl.system.FunctionProvider r0 = org.lwjgl.opengl.GL.getFunctionProvider()
                java.lang.String r1 = "wglCreateLayerContext"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.opengl.WGL.Functions.CreateLayerContext = r0
                org.lwjgl.system.FunctionProvider r0 = org.lwjgl.opengl.GL.getFunctionProvider()
                java.lang.String r1 = "wglCopyContext"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.opengl.WGL.Functions.CopyContext = r0
                org.lwjgl.system.FunctionProvider r0 = org.lwjgl.opengl.GL.getFunctionProvider()
                java.lang.String r1 = "wglDeleteContext"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.opengl.WGL.Functions.DeleteContext = r0
                org.lwjgl.system.FunctionProvider r0 = org.lwjgl.opengl.GL.getFunctionProvider()
                java.lang.String r1 = "wglGetCurrentContext"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.opengl.WGL.Functions.GetCurrentContext = r0
                org.lwjgl.system.FunctionProvider r0 = org.lwjgl.opengl.GL.getFunctionProvider()
                java.lang.String r1 = "wglGetCurrentDC"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.opengl.WGL.Functions.GetCurrentDC = r0
                org.lwjgl.system.FunctionProvider r0 = org.lwjgl.opengl.GL.getFunctionProvider()
                java.lang.String r1 = "wglGetProcAddress"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.opengl.WGL.Functions.GetProcAddress = r0
                org.lwjgl.system.FunctionProvider r0 = org.lwjgl.opengl.GL.getFunctionProvider()
                java.lang.String r1 = "wglMakeCurrent"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.opengl.WGL.Functions.MakeCurrent = r0
                org.lwjgl.system.FunctionProvider r0 = org.lwjgl.opengl.GL.getFunctionProvider()
                java.lang.String r1 = "wglShareLists"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.opengl.WGL.Functions.ShareLists = r0
                return
        }
    }

    protected WGL() {
            r3 = this;
            r0 = r3
            r0.<init>()
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r1 = r0
            r1.<init>()
            throw r0
    }

    public static native long nwglCreateContext(long r0, long r2);

    @org.lwjgl.system.NativeType("HGLRC")
    public static long wglCreateContext(@org.lwjgl.system.NativeType("HDC") long r5) {
            long r0 = org.lwjgl.opengl.WGL.Functions.CreateContext
            r7 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lf
            r0 = r5
            long r0 = org.lwjgl.system.Checks.check(r0)
        Lf:
            r0 = r5
            r1 = r7
            long r0 = nwglCreateContext(r0, r1)
            return r0
    }

    public static native long nwglCreateLayerContext(long r0, int r2, long r3);

    @org.lwjgl.system.NativeType("HGLRC")
    public static long wglCreateLayerContext(@org.lwjgl.system.NativeType("HDC") long r6, int r8) {
            long r0 = org.lwjgl.opengl.WGL.Functions.CreateLayerContext
            r9 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lf
            r0 = r6
            long r0 = org.lwjgl.system.Checks.check(r0)
        Lf:
            r0 = r6
            r1 = r8
            r2 = r9
            long r0 = nwglCreateLayerContext(r0, r1, r2)
            return r0
    }

    public static native int nwglCopyContext(long r0, long r2, int r4, long r5);

    @org.lwjgl.system.NativeType("BOOL")
    public static boolean wglCopyContext(@org.lwjgl.system.NativeType("HGLRC") long r8, @org.lwjgl.system.NativeType("HGLRC") long r10, @org.lwjgl.system.NativeType("UINT") int r12) {
            long r0 = org.lwjgl.opengl.WGL.Functions.CopyContext
            r13 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L15
            r0 = r8
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r10
            long r0 = org.lwjgl.system.Checks.check(r0)
        L15:
            r0 = r8
            r1 = r10
            r2 = r12
            r3 = r13
            int r0 = nwglCopyContext(r0, r1, r2, r3)
            if (r0 == 0) goto L25
            r0 = 1
            goto L26
        L25:
            r0 = 0
        L26:
            return r0
    }

    public static native int nwglDeleteContext(long r0, long r2);

    @org.lwjgl.system.NativeType("BOOL")
    public static boolean wglDeleteContext(@org.lwjgl.system.NativeType("HGLRC") long r5) {
            long r0 = org.lwjgl.opengl.WGL.Functions.DeleteContext
            r7 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lf
            r0 = r5
            long r0 = org.lwjgl.system.Checks.check(r0)
        Lf:
            r0 = r5
            r1 = r7
            int r0 = nwglDeleteContext(r0, r1)
            if (r0 == 0) goto L1b
            r0 = 1
            goto L1c
        L1b:
            r0 = 0
        L1c:
            return r0
    }

    public static native long nwglGetCurrentContext(long r0);

    @org.lwjgl.system.NativeType("HGLRC")
    public static long wglGetCurrentContext() {
            long r0 = org.lwjgl.opengl.WGL.Functions.GetCurrentContext
            r3 = r0
            r0 = r3
            long r0 = nwglGetCurrentContext(r0)
            return r0
    }

    public static native long nwglGetCurrentDC(long r0);

    @org.lwjgl.system.NativeType("HDC")
    public static long wglGetCurrentDC() {
            long r0 = org.lwjgl.opengl.WGL.Functions.GetCurrentDC
            r3 = r0
            r0 = r3
            long r0 = nwglGetCurrentDC(r0)
            return r0
    }

    public static native long nwglGetProcAddress(long r0, long r2);

    public static long nwglGetProcAddress(long r5) {
            long r0 = org.lwjgl.opengl.WGL.Functions.GetProcAddress
            r7 = r0
            r0 = r5
            r1 = r7
            long r0 = nwglGetProcAddress(r0, r1)
            return r0
    }

    @org.lwjgl.system.NativeType("PROC")
    public static long wglGetProcAddress(@org.lwjgl.system.NativeType("LPCSTR") java.nio.ByteBuffer r3) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto La
            r0 = r3
            org.lwjgl.system.Checks.checkNT1(r0)
        La:
            r0 = r3
            long r0 = org.lwjgl.system.MemoryUtil.memAddress(r0)
            long r0 = nwglGetProcAddress(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("PROC")
    public static long wglGetProcAddress(@org.lwjgl.system.NativeType("LPCSTR") java.lang.CharSequence r4) {
            org.lwjgl.system.MemoryStack r0 = org.lwjgl.system.MemoryStack.stackGet()
            r5 = r0
            r0 = r5
            int r0 = r0.getPointer()
            r6 = r0
            r0 = r5
            r1 = r4
            r2 = 1
            int r0 = r0.nASCII(r1, r2)     // Catch: java.lang.Throwable -> L23
            r0 = r5
            long r0 = r0.getPointerAddress()     // Catch: java.lang.Throwable -> L23
            r7 = r0
            r0 = r7
            long r0 = nwglGetProcAddress(r0)     // Catch: java.lang.Throwable -> L23
            r9 = r0
            r0 = r5
            r1 = r6
            r0.setPointer(r1)
            r0 = r9
            return r0
        L23:
            r11 = move-exception
            r0 = r5
            r1 = r6
            r0.setPointer(r1)
            r0 = r11
            throw r0
    }

    public static native int nwglMakeCurrent(long r0, long r2, long r4);

    @org.lwjgl.system.NativeType("BOOL")
    public static boolean wglMakeCurrent(@org.lwjgl.system.NativeType("HDC") long r7, @org.lwjgl.system.NativeType("HGLRC") long r9) {
            long r0 = org.lwjgl.opengl.WGL.Functions.MakeCurrent
            r11 = r0
            r0 = r7
            r1 = r9
            r2 = r11
            int r0 = nwglMakeCurrent(r0, r1, r2)
            if (r0 == 0) goto L13
            r0 = 1
            goto L14
        L13:
            r0 = 0
        L14:
            return r0
    }

    public static native int nwglShareLists(long r0, long r2, long r4);

    @org.lwjgl.system.NativeType("BOOL")
    public static boolean wglShareLists(@org.lwjgl.system.NativeType("HGLRC") long r7, @org.lwjgl.system.NativeType("HGLRC") long r9) {
            long r0 = org.lwjgl.opengl.WGL.Functions.ShareLists
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
            int r0 = nwglShareLists(r0, r1, r2)
            if (r0 == 0) goto L23
            r0 = 1
            goto L24
        L23:
            r0 = 0
        L24:
            return r0
    }

    static {
            org.lwjgl.opengl.GL.initialize()
            return
    }
}
