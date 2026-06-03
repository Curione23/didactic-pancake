package org.lwjgl.system.linux;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/system/linux/X11.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/system/linux/X11.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/system/linux/X11.class */
public class X11 {
    private static final org.lwjgl.system.SharedLibrary X11 = null;
    public static final int True = 1;
    public static final int False = 0;
    public static final int None = 0;
    public static final int ParentRelative = 1;
    public static final int CopyFromParent = 0;
    public static final int PointerWindow = 0;
    public static final int InputFocus = 1;
    public static final int PointerRoot = 1;
    public static final int AnyPropertyType = 0;
    public static final int AnyKey = 0;
    public static final int AnyButton = 0;
    public static final int AllTemporary = 0;
    public static final int CurrentTime = 0;
    public static final int NoSymbol = 0;
    public static final int Success = 0;
    public static final int BadRequest = 1;
    public static final int BadValue = 2;
    public static final int BadWindow = 3;
    public static final int BadPixmap = 4;
    public static final int BadAtom = 5;
    public static final int BadCursor = 6;
    public static final int BadFont = 7;
    public static final int BadMatch = 8;
    public static final int BadDrawable = 9;
    public static final int BadAccess = 10;
    public static final int BadAlloc = 11;
    public static final int BadColor = 12;
    public static final int BadGC = 13;
    public static final int BadIDChoice = 14;
    public static final int BadName = 15;
    public static final int BadLength = 16;
    public static final int BadImplementation = 17;
    public static final int FirstExtensionError = 128;
    public static final int LastExtensionError = 255;
    public static final int CWBackPixmap = 1;
    public static final int CWBackPixel = 2;
    public static final int CWBorderPixmap = 4;
    public static final int CWBorderPixel = 8;
    public static final int CWBitGravity = 16;
    public static final int CWWinGravity = 32;
    public static final int CWBackingStore = 64;
    public static final int CWBackingPlanes = 128;
    public static final int CWBackingPixel = 256;
    public static final int CWOverrideRedirect = 512;
    public static final int CWSaveUnder = 1024;
    public static final int CWEventMask = 2048;
    public static final int CWDontPropagate = 4096;
    public static final int CWColormap = 8192;
    public static final int CWCursor = 16384;
    public static final int NoEventMask = 0;
    public static final int KeyPressMask = 1;
    public static final int KeyReleaseMask = 2;
    public static final int ButtonPressMask = 4;
    public static final int ButtonReleaseMask = 8;
    public static final int EnterWindowMask = 16;
    public static final int LeaveWindowMask = 32;
    public static final int PointerMotionMask = 64;
    public static final int PointerMotionHintMask = 128;
    public static final int Button1MotionMask = 256;
    public static final int Button2MotionMask = 512;
    public static final int Button3MotionMask = 1024;
    public static final int Button4MotionMask = 2048;
    public static final int Button5MotionMask = 4096;
    public static final int ButtonMotionMask = 8192;
    public static final int KeymapStateMask = 16384;
    public static final int ExposureMask = 32768;
    public static final int VisibilityChangeMask = 65536;
    public static final int StructureNotifyMask = 131072;
    public static final int ResizeRedirectMask = 262144;
    public static final int SubstructureNotifyMask = 524288;
    public static final int SubstructureRedirectMask = 1048576;
    public static final int FocusChangeMask = 2097152;
    public static final int PropertyChangeMask = 4194304;
    public static final int ColormapChangeMask = 8388608;
    public static final int OwnerGrabButtonMask = 16777216;
    public static final int KeyPress = 2;
    public static final int KeyRelease = 3;
    public static final int ButtonPress = 4;
    public static final int ButtonRelease = 5;
    public static final int MotionNotify = 6;
    public static final int EnterNotify = 7;
    public static final int LeaveNotify = 8;
    public static final int FocusIn = 9;
    public static final int FocusOut = 10;
    public static final int KeymapNotify = 11;
    public static final int Expose = 12;
    public static final int GraphicsExpose = 13;
    public static final int NoExpose = 14;
    public static final int VisibilityNotify = 15;
    public static final int CreateNotify = 16;
    public static final int DestroyNotify = 17;
    public static final int UnmapNotify = 18;
    public static final int MapNotify = 19;
    public static final int MapRequest = 20;
    public static final int ReparentNotify = 21;
    public static final int ConfigureNotify = 22;
    public static final int ConfigureRequest = 23;
    public static final int GravityNotify = 24;
    public static final int ResizeRequest = 25;
    public static final int CirculateNotify = 26;
    public static final int CirculateRequest = 27;
    public static final int PropertyNotify = 28;
    public static final int SelectionClear = 29;
    public static final int SelectionRequest = 30;
    public static final int SelectionNotify = 31;
    public static final int ColormapNotify = 32;
    public static final int ClientMessage = 33;
    public static final int MappingNotify = 34;
    public static final int GenericEvent = 35;
    public static final int LASTEvent = 36;
    public static final int ShiftMask = 1;
    public static final int LockMask = 2;
    public static final int ControlMask = 4;
    public static final int Mod1Mask = 8;
    public static final int Mod2Mask = 16;
    public static final int Mod3Mask = 32;
    public static final int Mod4Mask = 64;
    public static final int Mod5Mask = 128;
    public static final int ShiftMapIndex = 0;
    public static final int LockMapIndex = 1;
    public static final int ControlMapIndex = 2;
    public static final int Mod1MapIndex = 3;
    public static final int Mod2MapIndex = 4;
    public static final int Mod3MapIndex = 5;
    public static final int Mod4MapIndex = 6;
    public static final int Mod5MapIndex = 7;
    public static final int Button1Mask = 256;
    public static final int Button2Mask = 512;
    public static final int Button3Mask = 1024;
    public static final int Button4Mask = 2048;
    public static final int Button5Mask = 4096;
    public static final int AnyModifier = 32768;
    public static final int Button1 = 1;
    public static final int Button2 = 2;
    public static final int Button3 = 3;
    public static final int Button4 = 4;
    public static final int Button5 = 5;
    public static final int NotifyNormal = 0;
    public static final int NotifyGrab = 1;
    public static final int NotifyUngrab = 2;
    public static final int NotifyWhileGrabbed = 3;
    public static final int NotifyHint = 1;
    public static final int NotifyAncestor = 0;
    public static final int NotifyVirtual = 1;
    public static final int NotifyInferior = 2;
    public static final int NotifyNonlinear = 3;
    public static final int NotifyNonlinearVirtual = 4;
    public static final int NotifyPointer = 5;
    public static final int NotifyPointerRoot = 6;
    public static final int NotifyDetailNone = 7;
    public static final int VisibilityUnobscured = 0;
    public static final int VisibilityPartiallyObscured = 1;
    public static final int VisibilityFullyObscured = 2;
    public static final int PlaceOnTop = 0;
    public static final int PlaceOnBottom = 1;
    public static final int PropertyNewValue = 0;
    public static final int PropertyDelete = 1;
    public static final int ColormapUninstalled = 0;
    public static final int ColormapInstalled = 1;
    public static final int GrabModeSync = 0;
    public static final int GrabModeAsync = 1;
    public static final int GrabSuccess = 0;
    public static final int AlreadyGrabbed = 1;
    public static final int GrabInvalidTime = 2;
    public static final int GrabNotViewable = 3;
    public static final int GrabFrozen = 4;
    public static final int AsyncPointer = 0;
    public static final int SyncPointer = 1;
    public static final int ReplayPointer = 2;
    public static final int AsyncKeyboard = 3;
    public static final int SyncKeyboard = 4;
    public static final int ReplayKeyboard = 5;
    public static final int AsyncBoth = 6;
    public static final int SyncBoth = 7;
    public static final int AllocNone = 0;
    public static final int AllocAll = 1;
    public static final int RevertToNone = 0;
    public static final int RevertToPointerRoot = 1;
    public static final int RevertToParent = 2;
    public static final int InputOutput = 1;
    public static final int InputOnly = 2;
    public static final int DontPreferBlanking = 0;
    public static final int PreferBlanking = 1;
    public static final int DefaultBlanking = 2;
    public static final int DisableScreenSaver = 0;
    public static final int DisableScreenInterval = 0;
    public static final int DontAllowExposures = 0;
    public static final int AllowExposures = 1;
    public static final int DefaultExposures = 2;
    public static final int ScreenSaverReset = 0;
    public static final int ScreenSaverActive = 1;
    public static final int PropModeReplace = 0;
    public static final int PropModePrepend = 1;
    public static final int PropModeAppend = 2;
    public static final int GXclear = 0;
    public static final int GXand = 1;
    public static final int GXandReverse = 2;
    public static final int GXcopy = 3;
    public static final int GXandInverted = 4;
    public static final int GXnoop = 5;
    public static final int GXxor = 6;
    public static final int GXor = 7;
    public static final int GXnor = 8;
    public static final int GXequiv = 9;
    public static final int GXinvert = 10;
    public static final int GXorReverse = 11;
    public static final int GXcopyInverted = 12;
    public static final int GXorInverted = 13;
    public static final int GXnand = 14;
    public static final int GXset = 15;
    public static final int LineSolid = 0;
    public static final int LineOnOffDash = 1;
    public static final int LineDoubleDash = 2;
    public static final int CapNotLast = 0;
    public static final int CapButt = 1;
    public static final int CapRound = 2;
    public static final int CapProjecting = 3;
    public static final int JoinMiter = 0;
    public static final int JoinRound = 1;
    public static final int JoinBevel = 2;
    public static final int FillSolid = 0;
    public static final int FillTiled = 1;
    public static final int FillStippled = 2;
    public static final int FillOpaqueStippled = 3;
    public static final int EvenOddRule = 0;
    public static final int WindingRule = 1;
    public static final int ClipByChildren = 0;
    public static final int IncludeInferiors = 1;
    public static final int Unsorted = 0;
    public static final int YSorted = 1;
    public static final int YXSorted = 2;
    public static final int YXBanded = 3;
    public static final int CoordModeOrigin = 0;
    public static final int CoordModePrevious = 1;
    public static final int Complex = 0;
    public static final int Nonconvex = 1;
    public static final int Convex = 2;
    public static final int ArcChord = 0;
    public static final int ArcPieSlice = 1;
    public static final int GCFunction = 1;
    public static final int GCPlaneMask = 2;
    public static final int GCForeground = 4;
    public static final int GCBackground = 8;
    public static final int GCLineWidth = 16;
    public static final int GCLineStyle = 32;
    public static final int GCCapStyle = 64;
    public static final int GCJoinStyle = 128;
    public static final int GCFillStyle = 256;
    public static final int GCFillRule = 512;
    public static final int GCTile = 1024;
    public static final int GCStipple = 2048;
    public static final int GCTileStipXOrigin = 4096;
    public static final int GCTileStipYOrigin = 8192;
    public static final int GCFont = 16384;
    public static final int GCSubwindowMode = 32768;
    public static final int GCGraphicsExposures = 65536;
    public static final int GCClipXOrigin = 131072;
    public static final int GCClipYOrigin = 262144;
    public static final int GCClipMask = 524288;
    public static final int GCDashOffset = 1048576;
    public static final int GCDashList = 2097152;
    public static final int GCArcMode = 4194304;
    public static final int GCLastBit = 22;
    public static final int Above = 0;
    public static final int Below = 1;
    public static final int TopIf = 2;
    public static final int BottomIf = 3;
    public static final int Opposite = 4;
    public static final int MappingModifier = 0;
    public static final int MappingKeyboard = 1;
    public static final int MappingPointer = 2;

    /* JADX WARN: Classes with same name are omitted, all sources:
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/system/linux/X11$Functions.class
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/system/linux/X11$Functions.class
     */
    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/system/linux/X11$Functions.class */
    public static final class Functions {
        public static final long XOpenDisplay = 0;
        public static final long XCloseDisplay = 0;
        public static final long XDefaultScreen = 0;
        public static final long XRootWindow = 0;
        public static final long XCreateColormap = 0;
        public static final long XFreeColormap = 0;
        public static final long XCreateWindow = 0;
        public static final long XDestroyWindow = 0;
        public static final long XFree = 0;
        public static final long XSendEvent = 0;
        public static final long XDisplayMotionBufferSize = 0;
        public static final long XGetMotionEvents = 0;
        public static final long XTranslateCoordinates = 0;

        private Functions() {
                r2 = this;
                r0 = r2
                r0.<init>()
                return
        }

        static {
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.system.linux.X11.access$000()
                java.lang.String r1 = "XOpenDisplay"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.system.linux.X11.Functions.XOpenDisplay = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.system.linux.X11.access$000()
                java.lang.String r1 = "XCloseDisplay"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.system.linux.X11.Functions.XCloseDisplay = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.system.linux.X11.access$000()
                java.lang.String r1 = "XDefaultScreen"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.system.linux.X11.Functions.XDefaultScreen = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.system.linux.X11.access$000()
                java.lang.String r1 = "XRootWindow"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.system.linux.X11.Functions.XRootWindow = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.system.linux.X11.access$000()
                java.lang.String r1 = "XCreateColormap"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.system.linux.X11.Functions.XCreateColormap = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.system.linux.X11.access$000()
                java.lang.String r1 = "XFreeColormap"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.system.linux.X11.Functions.XFreeColormap = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.system.linux.X11.access$000()
                java.lang.String r1 = "XCreateWindow"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.system.linux.X11.Functions.XCreateWindow = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.system.linux.X11.access$000()
                java.lang.String r1 = "XDestroyWindow"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.system.linux.X11.Functions.XDestroyWindow = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.system.linux.X11.access$000()
                java.lang.String r1 = "XFree"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.system.linux.X11.Functions.XFree = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.system.linux.X11.access$000()
                java.lang.String r1 = "XSendEvent"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.system.linux.X11.Functions.XSendEvent = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.system.linux.X11.access$000()
                java.lang.String r1 = "XDisplayMotionBufferSize"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.system.linux.X11.Functions.XDisplayMotionBufferSize = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.system.linux.X11.access$000()
                java.lang.String r1 = "XGetMotionEvents"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.system.linux.X11.Functions.XGetMotionEvents = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.system.linux.X11.access$000()
                java.lang.String r1 = "XTranslateCoordinates"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.system.linux.X11.Functions.XTranslateCoordinates = r0
                return
        }
    }

    public static org.lwjgl.system.SharedLibrary getLibrary() {
            org.lwjgl.system.SharedLibrary r0 = org.lwjgl.system.linux.X11.X11
            return r0
    }

    protected X11() {
            r3 = this;
            r0 = r3
            r0.<init>()
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r1 = r0
            r1.<init>()
            throw r0
    }

    public static long nXOpenDisplay(long r5) {
            long r0 = org.lwjgl.system.linux.X11.Functions.XOpenDisplay
            r7 = r0
            r0 = r5
            r1 = r7
            long r0 = org.lwjgl.system.JNI.invokePP(r0, r1)
            return r0
    }

    @org.lwjgl.system.NativeType("Display *")
    public static long XOpenDisplay(@javax.annotation.Nullable @org.lwjgl.system.NativeType("char const *") java.nio.ByteBuffer r3) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto La
            r0 = r3
            org.lwjgl.system.Checks.checkNT1Safe(r0)
        La:
            r0 = r3
            long r0 = org.lwjgl.system.MemoryUtil.memAddressSafe(r0)
            long r0 = nXOpenDisplay(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("Display *")
    public static long XOpenDisplay(@javax.annotation.Nullable @org.lwjgl.system.NativeType("char const *") java.lang.CharSequence r4) {
            org.lwjgl.system.MemoryStack r0 = org.lwjgl.system.MemoryStack.stackGet()
            r5 = r0
            r0 = r5
            int r0 = r0.getPointer()
            r6 = r0
            r0 = r5
            r1 = r4
            r2 = 1
            int r0 = r0.nASCIISafe(r1, r2)     // Catch: java.lang.Throwable -> L2b
            r0 = r4
            if (r0 != 0) goto L18
            r0 = 0
            goto L1c
        L18:
            r0 = r5
            long r0 = r0.getPointerAddress()     // Catch: java.lang.Throwable -> L2b
        L1c:
            r7 = r0
            r0 = r7
            long r0 = nXOpenDisplay(r0)     // Catch: java.lang.Throwable -> L2b
            r9 = r0
            r0 = r5
            r1 = r6
            r0.setPointer(r1)
            r0 = r9
            return r0
        L2b:
            r11 = move-exception
            r0 = r5
            r1 = r6
            r0.setPointer(r1)
            r0 = r11
            throw r0
    }

    public static void XCloseDisplay(@org.lwjgl.system.NativeType("Display *") long r5) {
            long r0 = org.lwjgl.system.linux.X11.Functions.XCloseDisplay
            r7 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lf
            r0 = r5
            long r0 = org.lwjgl.system.Checks.check(r0)
        Lf:
            r0 = r5
            r1 = r7
            org.lwjgl.system.JNI.invokePV(r0, r1)
            return
    }

    public static int XDefaultScreen(@org.lwjgl.system.NativeType("Display *") long r5) {
            long r0 = org.lwjgl.system.linux.X11.Functions.XDefaultScreen
            r7 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lf
            r0 = r5
            long r0 = org.lwjgl.system.Checks.check(r0)
        Lf:
            r0 = r5
            r1 = r7
            int r0 = org.lwjgl.system.JNI.invokePI(r0, r1)
            return r0
    }

    @org.lwjgl.system.NativeType("Window")
    public static long XRootWindow(@org.lwjgl.system.NativeType("Display *") long r6, int r8) {
            long r0 = org.lwjgl.system.linux.X11.Functions.XRootWindow
            r9 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lf
            r0 = r6
            long r0 = org.lwjgl.system.Checks.check(r0)
        Lf:
            r0 = r6
            r1 = r8
            r2 = r9
            long r0 = org.lwjgl.system.JNI.invokePN(r0, r1, r2)
            return r0
    }

    public static long nXCreateColormap(long r10, long r12, long r14, int r16) {
            long r0 = org.lwjgl.system.linux.X11.Functions.XCreateColormap
            r17 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L10
            r0 = r10
            long r0 = org.lwjgl.system.Checks.check(r0)
        L10:
            r0 = r10
            r1 = r12
            r2 = r14
            r3 = r16
            r4 = r17
            long r0 = org.lwjgl.system.JNI.invokePNPN(r0, r1, r2, r3, r4)
            return r0
    }

    @org.lwjgl.system.NativeType("Colormap")
    public static long XCreateColormap(@org.lwjgl.system.NativeType("Display *") long r8, @org.lwjgl.system.NativeType("Window") long r10, @org.lwjgl.system.NativeType("Visual *") org.lwjgl.system.linux.Visual r12, int r13) {
            r0 = r8
            r1 = r10
            r2 = r12
            long r2 = r2.address()
            r3 = r13
            long r0 = nXCreateColormap(r0, r1, r2, r3)
            return r0
    }

    public static int XFreeColormap(@org.lwjgl.system.NativeType("Display *") long r7, @org.lwjgl.system.NativeType("Colormap") long r9) {
            long r0 = org.lwjgl.system.linux.X11.Functions.XFreeColormap
            r11 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L10
            r0 = r7
            long r0 = org.lwjgl.system.Checks.check(r0)
        L10:
            r0 = r7
            r1 = r9
            r2 = r11
            int r0 = org.lwjgl.system.JNI.invokePNI(r0, r1, r2)
            return r0
    }

    public static long nXCreateWindow(long r20, long r22, int r24, int r25, int r26, int r27, int r28, int r29, int r30, long r31, long r33, long r35) {
            long r0 = org.lwjgl.system.linux.X11.Functions.XCreateWindow
            r37 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L10
            r0 = r20
            long r0 = org.lwjgl.system.Checks.check(r0)
        L10:
            r0 = r20
            r1 = r22
            r2 = r24
            r3 = r25
            r4 = r26
            r5 = r27
            r6 = r28
            r7 = r29
            r8 = r30
            r9 = r31
            r10 = r33
            r11 = r35
            r12 = r37
            long r0 = org.lwjgl.system.JNI.invokePNPNPN(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            return r0
    }

    @org.lwjgl.system.NativeType("Window")
    public static long XCreateWindow(@org.lwjgl.system.NativeType("Display *") long r18, @org.lwjgl.system.NativeType("Window") long r20, int r22, int r23, @org.lwjgl.system.NativeType("unsigned int") int r24, @org.lwjgl.system.NativeType("unsigned int") int r25, @org.lwjgl.system.NativeType("unsigned int") int r26, int r27, @org.lwjgl.system.NativeType("unsigned int") int r28, @org.lwjgl.system.NativeType("Visual *") org.lwjgl.system.linux.Visual r29, @org.lwjgl.system.NativeType("unsigned long") long r30, @org.lwjgl.system.NativeType("XSetWindowAttributes *") org.lwjgl.system.linux.XSetWindowAttributes r32) {
            r0 = r18
            r1 = r20
            r2 = r22
            r3 = r23
            r4 = r24
            r5 = r25
            r6 = r26
            r7 = r27
            r8 = r28
            r9 = r29
            long r9 = r9.address()
            r10 = r30
            r11 = r32
            long r11 = r11.address()
            long r0 = nXCreateWindow(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            return r0
    }

    public static int XDestroyWindow(@org.lwjgl.system.NativeType("Display *") long r7, @org.lwjgl.system.NativeType("Window") long r9) {
            long r0 = org.lwjgl.system.linux.X11.Functions.XDestroyWindow
            r11 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L10
            r0 = r7
            long r0 = org.lwjgl.system.Checks.check(r0)
        L10:
            r0 = r7
            r1 = r9
            r2 = r11
            int r0 = org.lwjgl.system.JNI.invokePNI(r0, r1, r2)
            return r0
    }

    public static int nXFree(long r5) {
            long r0 = org.lwjgl.system.linux.X11.Functions.XFree
            r7 = r0
            r0 = r5
            r1 = r7
            int r0 = org.lwjgl.system.JNI.invokePI(r0, r1)
            return r0
    }

    public static int XFree(@org.lwjgl.system.NativeType("void *") java.nio.ByteBuffer r3) {
            r0 = r3
            long r0 = org.lwjgl.system.MemoryUtil.memAddress(r0)
            int r0 = nXFree(r0)
            return r0
    }

    public static int XFree(@org.lwjgl.system.NativeType("void *") org.lwjgl.PointerBuffer r3) {
            r0 = r3
            long r0 = org.lwjgl.system.MemoryUtil.memAddress(r0)
            int r0 = nXFree(r0)
            return r0
    }

    public static int nXSendEvent(long r12, long r14, int r16, long r17, long r19) {
            long r0 = org.lwjgl.system.linux.X11.Functions.XSendEvent
            r21 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L10
            r0 = r12
            long r0 = org.lwjgl.system.Checks.check(r0)
        L10:
            r0 = r12
            r1 = r14
            r2 = r16
            r3 = r17
            r4 = r19
            r5 = r21
            int r0 = org.lwjgl.system.JNI.invokePNNPI(r0, r1, r2, r3, r4, r5)
            return r0
    }

    @org.lwjgl.system.NativeType("Status")
    public static int XSendEvent(@org.lwjgl.system.NativeType("Display *") long r10, @org.lwjgl.system.NativeType("Window") long r12, @org.lwjgl.system.NativeType("Bool") boolean r14, long r15, @org.lwjgl.system.NativeType("XEvent *") org.lwjgl.system.linux.XEvent r17) {
            r0 = r10
            r1 = r12
            r2 = r14
            if (r2 == 0) goto Lb
            r2 = 1
            goto Lc
        Lb:
            r2 = 0
        Lc:
            r3 = r15
            r4 = r17
            long r4 = r4.address()
            int r0 = nXSendEvent(r0, r1, r2, r3, r4)
            return r0
    }

    @org.lwjgl.system.NativeType("unsigned long")
    public static long XDisplayMotionBufferSize(@org.lwjgl.system.NativeType("Display *") long r5) {
            long r0 = org.lwjgl.system.linux.X11.Functions.XDisplayMotionBufferSize
            r7 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lf
            r0 = r5
            long r0 = org.lwjgl.system.Checks.check(r0)
        Lf:
            r0 = r5
            r1 = r7
            long r0 = org.lwjgl.system.JNI.invokePN(r0, r1)
            return r0
    }

    public static long nXGetMotionEvents(long r13, long r15, long r17, long r19, long r21) {
            long r0 = org.lwjgl.system.linux.X11.Functions.XGetMotionEvents
            r23 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L10
            r0 = r13
            long r0 = org.lwjgl.system.Checks.check(r0)
        L10:
            r0 = r13
            r1 = r15
            r2 = r17
            r3 = r19
            r4 = r21
            r5 = r23
            long r0 = org.lwjgl.system.JNI.invokePNNNPP(r0, r1, r2, r3, r4, r5)
            return r0
    }

    @javax.annotation.Nullable
    @org.lwjgl.system.NativeType("XTimeCoord *")
    public static org.lwjgl.system.linux.XTimeCoord.Buffer XGetMotionEvents(@org.lwjgl.system.NativeType("Display *") long r11, @org.lwjgl.system.NativeType("Window") long r13, @org.lwjgl.system.NativeType("Time") long r15, @org.lwjgl.system.NativeType("Time") long r17) {
            org.lwjgl.system.MemoryStack r0 = org.lwjgl.system.MemoryStack.stackGet()
            r19 = r0
            r0 = r19
            int r0 = r0.getPointer()
            r20 = r0
            r0 = r19
            r1 = 1
            java.nio.IntBuffer r0 = r0.callocInt(r1)
            r21 = r0
            r0 = r11
            r1 = r13
            r2 = r15
            r3 = r17
            r4 = r21
            long r4 = org.lwjgl.system.MemoryUtil.memAddress(r4)     // Catch: java.lang.Throwable -> L3b
            long r0 = nXGetMotionEvents(r0, r1, r2, r3, r4)     // Catch: java.lang.Throwable -> L3b
            r22 = r0
            r0 = r22
            r1 = r21
            r2 = 0
            int r1 = r1.get(r2)     // Catch: java.lang.Throwable -> L3b
            org.lwjgl.system.linux.XTimeCoord$Buffer r0 = org.lwjgl.system.linux.XTimeCoord.createSafe(r0, r1)     // Catch: java.lang.Throwable -> L3b
            r24 = r0
            r0 = r19
            r1 = r20
            r0.setPointer(r1)
            r0 = r24
            return r0
        L3b:
            r25 = move-exception
            r0 = r19
            r1 = r20
            r0.setPointer(r1)
            r0 = r25
            throw r0
    }

    public static int nXTranslateCoordinates(long r17, long r19, long r21, int r23, int r24, long r25, long r27, long r29) {
            long r0 = org.lwjgl.system.linux.X11.Functions.XTranslateCoordinates
            r31 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L10
            r0 = r17
            long r0 = org.lwjgl.system.Checks.check(r0)
        L10:
            r0 = r17
            r1 = r19
            r2 = r21
            r3 = r23
            r4 = r24
            r5 = r25
            r6 = r27
            r7 = r29
            r8 = r31
            int r0 = org.lwjgl.system.JNI.invokePNNPPPI(r0, r1, r2, r3, r4, r5, r6, r7, r8)
            return r0
    }

    @org.lwjgl.system.NativeType("Bool")
    public static boolean XTranslateCoordinates(@org.lwjgl.system.NativeType("Display *") long r15, @org.lwjgl.system.NativeType("Window") long r17, @org.lwjgl.system.NativeType("Window") long r19, int r21, int r22, @org.lwjgl.system.NativeType("int *") java.nio.IntBuffer r23, @org.lwjgl.system.NativeType("int *") java.nio.IntBuffer r24, @org.lwjgl.system.NativeType("Window *") org.lwjgl.CLongBuffer r25) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L18
            r0 = r23
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
            r0 = r24
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
            r0 = r25
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
        L18:
            r0 = r15
            r1 = r17
            r2 = r19
            r3 = r21
            r4 = r22
            r5 = r23
            long r5 = org.lwjgl.system.MemoryUtil.memAddress(r5)
            r6 = r24
            long r6 = org.lwjgl.system.MemoryUtil.memAddress(r6)
            r7 = r25
            long r7 = org.lwjgl.system.MemoryUtil.memAddress(r7)
            int r0 = nXTranslateCoordinates(r0, r1, r2, r3, r4, r5, r6, r7)
            if (r0 == 0) goto L39
            r0 = 1
            goto L3a
        L39:
            r0 = 0
        L3a:
            return r0
    }

    @org.lwjgl.system.NativeType("Bool")
    public static boolean XTranslateCoordinates(@org.lwjgl.system.NativeType("Display *") long r15, @org.lwjgl.system.NativeType("Window") long r17, @org.lwjgl.system.NativeType("Window") long r19, int r21, int r22, @org.lwjgl.system.NativeType("int *") int[] r23, @org.lwjgl.system.NativeType("int *") int[] r24, @org.lwjgl.system.NativeType("Window *") org.lwjgl.CLongBuffer r25) {
            long r0 = org.lwjgl.system.linux.X11.Functions.XTranslateCoordinates
            r26 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L22
            r0 = r15
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r23
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
            r0 = r24
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
            r0 = r25
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
        L22:
            r0 = r15
            r1 = r17
            r2 = r19
            r3 = r21
            r4 = r22
            r5 = r23
            r6 = r24
            r7 = r25
            long r7 = org.lwjgl.system.MemoryUtil.memAddress(r7)
            r8 = r26
            int r0 = org.lwjgl.system.JNI.invokePNNPPPI(r0, r1, r2, r3, r4, r5, r6, r7, r8)
            if (r0 == 0) goto L3f
            r0 = 1
            goto L40
        L3f:
            r0 = 0
        L40:
            return r0
    }

    static /* synthetic */ org.lwjgl.system.SharedLibrary access$000() {
            org.lwjgl.system.SharedLibrary r0 = org.lwjgl.system.linux.X11.X11
            return r0
    }

    static {
            java.lang.Class<org.lwjgl.system.linux.X11> r0 = org.lwjgl.system.linux.X11.class
            java.lang.String r1 = "org.lwjgl"
            r2 = 0
            r3 = 2
            java.lang.String[] r3 = new java.lang.String[r3]
            r4 = r3
            r5 = 0
            java.lang.String r6 = "libX11.so.6"
            r4[r5] = r6
            r4 = r3
            r5 = 1
            java.lang.String r6 = "libX11.so"
            r4[r5] = r6
            org.lwjgl.system.SharedLibrary r0 = org.lwjgl.system.Library.loadNative(r0, r1, r2, r3)
            org.lwjgl.system.linux.X11.X11 = r0
            return
    }
}
