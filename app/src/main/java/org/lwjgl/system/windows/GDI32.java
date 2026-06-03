package org.lwjgl.system.windows;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/system/windows/GDI32.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/system/windows/GDI32.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/system/windows/GDI32.class */
public class GDI32 {
    private static final org.lwjgl.system.SharedLibrary GDI32 = null;
    public static final int DISPLAY_DEVICE_ATTACHED_TO_DESKTOP = 1;
    public static final int DISPLAY_DEVICE_MULTI_DRIVER = 2;
    public static final int DISPLAY_DEVICE_PRIMARY_DEVICE = 4;
    public static final int DISPLAY_DEVICE_MIRRORING_DRIVER = 8;
    public static final int DISPLAY_DEVICE_VGA_COMPATIBLE = 16;
    public static final int DISPLAY_DEVICE_REMOVABLE = 32;
    public static final int DISPLAY_DEVICE_MODESPRUNED = 134217728;
    public static final int DISPLAY_DEVICE_REMOTE = 67108864;
    public static final int DISPLAY_DEVICE_DISCONNECT = 33554432;
    public static final int DISPLAY_DEVICE_TS_COMPATIBLE = 2097152;
    public static final int DISPLAY_DEVICE_UNSAFE_MODES_ON = 524288;
    public static final int DISPLAY_DEVICE_ACTIVE = 1;
    public static final int DISPLAY_DEVICE_ATTACHED = 2;
    public static final int DM_SPECVERSION = 1025;
    public static final int DM_ORIENTATION = 1;
    public static final int DM_PAPERSIZE = 2;
    public static final int DM_PAPERLENGTH = 4;
    public static final int DM_PAPERWIDTH = 8;
    public static final int DM_SCALE = 16;
    public static final int DM_POSITION = 32;
    public static final int DM_NUP = 64;
    public static final int DM_DISPLAYORIENTATION = 128;
    public static final int DM_COPIES = 256;
    public static final int DM_DEFAULTSOURCE = 512;
    public static final int DM_PRINTQUALITY = 1024;
    public static final int DM_COLOR = 2048;
    public static final int DM_DUPLEX = 4096;
    public static final int DM_YRESOLUTION = 8192;
    public static final int DM_TTOPTION = 16384;
    public static final int DM_COLLATE = 32768;
    public static final int DM_FORMNAME = 65536;
    public static final int DM_LOGPIXELS = 131072;
    public static final int DM_BITSPERPEL = 262144;
    public static final int DM_PELSWIDTH = 524288;
    public static final int DM_PELSHEIGHT = 1048576;
    public static final int DM_DISPLAYFLAGS = 2097152;
    public static final int DM_DISPLAYFREQUENCY = 4194304;
    public static final int DM_ICMMETHOD = 8388608;
    public static final int DM_ICMINTENT = 16777216;
    public static final int DM_MEDIATYPE = 33554432;
    public static final int DM_DITHERTYPE = 67108864;
    public static final int DM_PANNINGWIDTH = 134217728;
    public static final int DM_PANNINGHEIGHT = 268435456;
    public static final int DM_DISPLAYFIXEDOUTPUT = 536870912;
    public static final int DMDO_DEFAULT = 0;
    public static final int DMDO_90 = 1;
    public static final int DMDO_180 = 2;
    public static final int DMDO_270 = 3;
    public static final int DMDFO_DEFAULT = 0;
    public static final int DMDFO_STRETCH = 1;
    public static final int DMDFO_CENTER = 2;
    public static final int DM_INTERLACED = 2;
    public static final int DMDISPLAYFLAGS_TEXTMODE = 4;
    public static final int PFD_DOUBLEBUFFER = 1;
    public static final int PFD_STEREO = 2;
    public static final int PFD_DRAW_TO_WINDOW = 4;
    public static final int PFD_DRAW_TO_BITMAP = 8;
    public static final int PFD_SUPPORT_GDI = 16;
    public static final int PFD_SUPPORT_OPENGL = 32;
    public static final int PFD_GENERIC_FORMAT = 64;
    public static final int PFD_NEED_PALETTE = 128;
    public static final int PFD_NEED_SYSTEM_PALETTE = 256;
    public static final int PFD_SWAP_EXCHANGE = 512;
    public static final int PFD_SWAP_COPY = 1024;
    public static final int PFD_SWAP_LAYER_BUFFERS = 2048;
    public static final int PFD_GENERIC_ACCELERATED = 4096;
    public static final int PFD_SUPPORT_DIRECTDRAW = 8192;
    public static final int PFD_DIRECT3D_ACCELERATED = 16384;
    public static final int PFD_SUPPORT_COMPOSITION = 32768;
    public static final int PFD_DEPTH_DONTCARE = 536870912;
    public static final int PFD_DOUBLEBUFFER_DONTCARE = 1073741824;
    public static final int PFD_STEREO_DONTCARE = Integer.MIN_VALUE;
    public static final byte PFD_TYPE_RGBA = 0;
    public static final byte PFD_TYPE_COLORINDEX = 1;
    public static final byte PFD_MAIN_PLANE = 0;
    public static final byte PFD_OVERLAY_PLANE = 1;
    public static final byte PFD_UNDERLAY_PLANE = -1;

    /* JADX WARN: Classes with same name are omitted, all sources:
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/system/windows/GDI32$Functions.class
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/system/windows/GDI32$Functions.class
     */
    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/system/windows/GDI32$Functions.class */
    public static final class Functions {
        public static final long ChoosePixelFormat = 0;
        public static final long DescribePixelFormat = 0;
        public static final long GetPixelFormat = 0;
        public static final long SetPixelFormat = 0;
        public static final long SwapBuffers = 0;

        private Functions() {
                r2 = this;
                r0 = r2
                r0.<init>()
                return
        }

        static {
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.system.windows.GDI32.access$000()
                java.lang.String r1 = "ChoosePixelFormat"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.system.windows.GDI32.Functions.ChoosePixelFormat = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.system.windows.GDI32.access$000()
                java.lang.String r1 = "DescribePixelFormat"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.system.windows.GDI32.Functions.DescribePixelFormat = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.system.windows.GDI32.access$000()
                java.lang.String r1 = "GetPixelFormat"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.system.windows.GDI32.Functions.GetPixelFormat = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.system.windows.GDI32.access$000()
                java.lang.String r1 = "SetPixelFormat"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.system.windows.GDI32.Functions.SetPixelFormat = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.system.windows.GDI32.access$000()
                java.lang.String r1 = "SwapBuffers"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.system.windows.GDI32.Functions.SwapBuffers = r0
                return
        }
    }

    public static org.lwjgl.system.SharedLibrary getLibrary() {
            org.lwjgl.system.SharedLibrary r0 = org.lwjgl.system.windows.GDI32.GDI32
            return r0
    }

    protected GDI32() {
            r3 = this;
            r0 = r3
            r0.<init>()
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r1 = r0
            r1.<init>()
            throw r0
    }

    public static native int nChoosePixelFormat(long r0, long r2, long r4);

    public static int nChoosePixelFormat(long r7, long r9) {
            long r0 = org.lwjgl.system.windows.GDI32.Functions.ChoosePixelFormat
            r11 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L10
            r0 = r7
            long r0 = org.lwjgl.system.Checks.check(r0)
        L10:
            r0 = r7
            r1 = r9
            r2 = r11
            int r0 = nChoosePixelFormat(r0, r1, r2)
            return r0
    }

    public static int ChoosePixelFormat(@org.lwjgl.system.NativeType("HDC") long r5, @org.lwjgl.system.NativeType("PIXELFORMATDESCRIPTOR const *") org.lwjgl.system.windows.PIXELFORMATDESCRIPTOR r7) {
            r0 = r5
            r1 = r7
            long r1 = r1.address()
            int r0 = nChoosePixelFormat(r0, r1)
            return r0
    }

    public static native int nDescribePixelFormat(long r0, int r2, int r3, long r4, long r6);

    public static int nDescribePixelFormat(long r9, int r11, int r12, long r13) {
            long r0 = org.lwjgl.system.windows.GDI32.Functions.DescribePixelFormat
            r15 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L10
            r0 = r9
            long r0 = org.lwjgl.system.Checks.check(r0)
        L10:
            r0 = r9
            r1 = r11
            r2 = r12
            r3 = r13
            r4 = r15
            int r0 = nDescribePixelFormat(r0, r1, r2, r3, r4)
            return r0
    }

    public static int DescribePixelFormat(@org.lwjgl.system.NativeType("HDC") long r7, int r9, @org.lwjgl.system.NativeType("UINT") int r10, @javax.annotation.Nullable @org.lwjgl.system.NativeType("LPPIXELFORMATDESCRIPTOR") org.lwjgl.system.windows.PIXELFORMATDESCRIPTOR r11) {
            r0 = r7
            r1 = r9
            r2 = r10
            r3 = r11
            long r3 = org.lwjgl.system.MemoryUtil.memAddressSafe(r3)
            int r0 = nDescribePixelFormat(r0, r1, r2, r3)
            return r0
    }

    public static int DescribePixelFormat(@org.lwjgl.system.NativeType("HDC") long r7, int r9, @javax.annotation.Nullable @org.lwjgl.system.NativeType("LPPIXELFORMATDESCRIPTOR") org.lwjgl.system.windows.PIXELFORMATDESCRIPTOR r10) {
            r0 = r7
            r1 = r9
            int r2 = org.lwjgl.system.windows.PIXELFORMATDESCRIPTOR.SIZEOF
            r3 = r10
            long r3 = org.lwjgl.system.MemoryUtil.memAddressSafe(r3)
            int r0 = nDescribePixelFormat(r0, r1, r2, r3)
            return r0
    }

    public static native int nGetPixelFormat(long r0, long r2);

    public static int GetPixelFormat(@org.lwjgl.system.NativeType("HDC") long r5) {
            long r0 = org.lwjgl.system.windows.GDI32.Functions.GetPixelFormat
            r7 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lf
            r0 = r5
            long r0 = org.lwjgl.system.Checks.check(r0)
        Lf:
            r0 = r5
            r1 = r7
            int r0 = nGetPixelFormat(r0, r1)
            return r0
    }

    public static native int nSetPixelFormat(long r0, int r2, long r3, long r5);

    public static int nSetPixelFormat(long r8, int r10, long r11) {
            long r0 = org.lwjgl.system.windows.GDI32.Functions.SetPixelFormat
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
            int r0 = nSetPixelFormat(r0, r1, r2, r3)
            return r0
    }

    @org.lwjgl.system.NativeType("BOOL")
    public static boolean SetPixelFormat(@org.lwjgl.system.NativeType("HDC") long r6, int r8, @javax.annotation.Nullable @org.lwjgl.system.NativeType("PIXELFORMATDESCRIPTOR const *") org.lwjgl.system.windows.PIXELFORMATDESCRIPTOR r9) {
            r0 = r6
            r1 = r8
            r2 = r9
            long r2 = org.lwjgl.system.MemoryUtil.memAddressSafe(r2)
            int r0 = nSetPixelFormat(r0, r1, r2)
            if (r0 == 0) goto L10
            r0 = 1
            goto L11
        L10:
            r0 = 0
        L11:
            return r0
    }

    public static native int nSwapBuffers(long r0, long r2);

    @org.lwjgl.system.NativeType("BOOL")
    public static boolean SwapBuffers(@org.lwjgl.system.NativeType("HDC") long r5) {
            long r0 = org.lwjgl.system.windows.GDI32.Functions.SwapBuffers
            r7 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lf
            r0 = r5
            long r0 = org.lwjgl.system.Checks.check(r0)
        Lf:
            r0 = r5
            r1 = r7
            int r0 = nSwapBuffers(r0, r1)
            if (r0 == 0) goto L1b
            r0 = 1
            goto L1c
        L1b:
            r0 = 0
        L1c:
            return r0
    }

    static /* synthetic */ org.lwjgl.system.SharedLibrary access$000() {
            org.lwjgl.system.SharedLibrary r0 = org.lwjgl.system.windows.GDI32.GDI32
            return r0
    }

    static {
            java.lang.Class<org.lwjgl.system.windows.GDI32> r0 = org.lwjgl.system.windows.GDI32.class
            java.lang.String r1 = "org.lwjgl"
            java.lang.String r2 = "gdi32"
            org.lwjgl.system.SharedLibrary r0 = org.lwjgl.system.Library.loadNative(r0, r1, r2)
            org.lwjgl.system.windows.GDI32.GDI32 = r0
            return
    }
}
