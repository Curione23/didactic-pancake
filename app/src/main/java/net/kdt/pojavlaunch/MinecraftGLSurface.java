package net.kdt.pojavlaunch;

/* JADX INFO: loaded from: classes2.dex */
public class MinecraftGLSurface extends android.widget.FrameLayout implements net.kdt.pojavlaunch.GrabListener {
    private static final long HARDWARE_POINTER_KEEPALIVE_NANOS = 3000000000L;
    private static final float HARDWARE_TOP_LEFT_EPSILON = 1.0f;
    private static final long POINTER_REGRAB_RELATIVE_SUPPRESS_NANOS = 220000000;
    private static final long TOUCH_POINTER_MODE_RESET_NANOS = 650000000;
    public static volatile boolean sdlEnabled = false;
    private volatile boolean bridgeWindowAttached;
    private volatile boolean grabbed;
    private final java.util.Set<java.lang.Integer> hardwareKeysDown;
    private final java.util.Set<java.lang.Integer> hardwareMouseButtonsDown;
    private boolean hasLastHardwareMousePosition;
    private float inputScaleX;
    private float inputScaleY;
    private float lastHardwareMouseX;
    private float lastHardwareMouseY;
    private long lastHardwarePointerEventNanos;
    private int lastLoggedRenderHeight;
    private int lastLoggedRenderWidth;
    private int lastLoggedScalePercent;
    private int lastLoggedViewHeight;
    private int lastLoggedViewWidth;
    private int lastSentWindowHeight;
    private int lastSentWindowWidth;
    private float lastTouchX;
    private float lastTouchY;
    private android.view.SurfaceView nativeSurfaceView;
    private int renderHeight;
    private android.view.View renderView;
    private int renderWidth;
    private boolean renderingStarted;
    private net.kdt.pojavlaunch.MinecraftGLSurface.OnRenderingStartedListener renderingStartedListener;
    private long suppressRelativeCursorUntilNanos;
    private long suppressSuspiciousHardwareAbsoluteUntilNanos;
    private net.kdt.pojavlaunch.MinecraftGLSurface.SurfaceReadyListener surfaceReadyListener;
    private android.view.Surface textureSurface;
    private android.view.TextureView textureView;
    private float touchDownX;
    private float touchDownY;
    private final android.os.Handler touchHandler;
    private boolean touchLongPressAttackActive;
    private java.lang.Runnable touchLongPressRunnable;
    private boolean touchMovedPastSlop;
    private final int touchSlop;
    private boolean touchUiTapCandidate;
    private boolean trackingTouch;
    private int viewHeight;
    private int viewWidth;



    public interface OnRenderingStartedListener {
        void isStarted();
    }

    private static final class RelativeMouseDelta {
        static final net.kdt.pojavlaunch.MinecraftGLSurface.RelativeMouseDelta NONE = null;
        final float dx;
        final float dy;
        final boolean hasMovement;

        static {
                net.kdt.pojavlaunch.MinecraftGLSurface$RelativeMouseDelta r0 = new net.kdt.pojavlaunch.MinecraftGLSurface$RelativeMouseDelta
                r1 = 0
                r2 = 0
                r0.<init>(r1, r1, r2)
                net.kdt.pojavlaunch.MinecraftGLSurface.RelativeMouseDelta.NONE = r0
                return
        }

        RelativeMouseDelta(float r1, float r2, boolean r3) {
                r0 = this;
                r0.<init>()
                r0.dx = r1
                r0.dy = r2
                r0.hasMovement = r3
                return
        }
    }

    private static final class RenderSize {
        final int renderHeight;
        final int renderWidth;
        final int viewHeight;
        final int viewWidth;

        RenderSize(int r2, int r3, int r4, int r5) {
                r1 = this;
                r1.<init>()
                r0 = 1
                int r2 = java.lang.Math.max(r0, r2)
                r1.viewWidth = r2
                int r2 = java.lang.Math.max(r0, r3)
                r1.viewHeight = r2
                int r2 = java.lang.Math.max(r0, r4)
                r1.renderWidth = r2
                int r2 = java.lang.Math.max(r0, r5)
                r1.renderHeight = r2
                return
        }
    }

    public interface SurfaceReadyListener {
        void isReady();
    }

    public static /* synthetic */ void $r8$lambda$3DKMRMzOD1DiPVnCGunzezNAGt4(net.kdt.pojavlaunch.MinecraftGLSurface r0) {
            r0.lambda$scheduleSurfaceResizeRefreshes$3()
            return
    }

    public static /* synthetic */ void $r8$lambda$7_IUfZcxrb9yNPpwIXzxwlXjFUk(net.kdt.pojavlaunch.MinecraftGLSurface r0) {
            r0.lambda$scheduleSurfaceResizeRefreshes$0()
            return
    }

    public static /* synthetic */ void $r8$lambda$AywHrHpoWVNbSjDxeo7OGVenatA(net.kdt.pojavlaunch.MinecraftGLSurface r0, boolean r1) {
            r0.lambda$onGrabState$7(r1)
            return
    }

    public static /* synthetic */ void $r8$lambda$G3WQ81xes9ztnGKUgvAR5Zg0qQA(net.kdt.pojavlaunch.MinecraftGLSurface r0) {
            r0.lambda$scheduleSurfaceResizeRefreshes$5()
            return
    }

    public static /* synthetic */ boolean $r8$lambda$LhwK2vIP2fCL1HJrPLa64ERpA10(net.kdt.pojavlaunch.MinecraftGLSurface r0, android.view.View r1, android.view.MotionEvent r2) {
            boolean r0 = r0.handleCapturedPointer(r1, r2)
            return r0
    }

    public static /* synthetic */ void $r8$lambda$VmRnzdfpvr0RnjBt97qQ3NyBJqA(net.kdt.pojavlaunch.MinecraftGLSurface r0) {
            r0.lambda$scheduleSurfaceResizeRefreshes$2()
            return
    }

    public static /* synthetic */ void $r8$lambda$WdHGLyz2Yl6IvkQUbxYhHy9Obe8(net.kdt.pojavlaunch.MinecraftGLSurface r0) {
            r0.lambda$scheduleSurfaceResizeRefreshes$4()
            return
    }

    public static /* synthetic */ void $r8$lambda$hW54IA_MCYGn_9T3xXqNyZdOMxE(net.kdt.pojavlaunch.MinecraftGLSurface r0) {
            r0.lambda$scheduleTouchLongPressAttack$6()
            return
    }

    public static /* synthetic */ void $r8$lambda$ljyGIDc17agrCWs_fs_JLsRteS0(net.kdt.pojavlaunch.MinecraftGLSurface r0) {
            r0.notifyRenderingStartedOnce()
            return
    }

    /* JADX INFO: renamed from: $r8$lambda$v-62-QPGtZRxLozoxG5hE_yUPEE, reason: not valid java name */
    public static /* synthetic */ void m2362$r8$lambda$v62QPGtZRxLozoxG5hE_yUPEE(net.kdt.pojavlaunch.MinecraftGLSurface r0) {
            r0.lambda$scheduleSurfaceResizeRefreshes$1()
            return
    }

    /* JADX INFO: renamed from: -$$Nest$fgetnativeSurfaceView, reason: not valid java name */
    static /* bridge */ /* synthetic */ android.view.SurfaceView m2363$$Nest$fgetnativeSurfaceView(net.kdt.pojavlaunch.MinecraftGLSurface r0) {
            android.view.SurfaceView r0 = r0.nativeSurfaceView
            return r0
    }

    /* JADX INFO: renamed from: -$$Nest$fgettextureSurface, reason: not valid java name */
    static /* bridge */ /* synthetic */ android.view.Surface m2364$$Nest$fgettextureSurface(net.kdt.pojavlaunch.MinecraftGLSurface r0) {
            android.view.Surface r0 = r0.textureSurface
            return r0
    }

    /* JADX INFO: renamed from: -$$Nest$fputbridgeWindowAttached, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m2365$$Nest$fputbridgeWindowAttached(net.kdt.pojavlaunch.MinecraftGLSurface r0, boolean r1) {
            r0.bridgeWindowAttached = r1
            return
    }

    /* JADX INFO: renamed from: -$$Nest$fputtextureSurface, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m2366$$Nest$fputtextureSurface(net.kdt.pojavlaunch.MinecraftGLSurface r0, android.view.Surface r1) {
            r0.textureSurface = r1
            return
    }

    /* JADX INFO: renamed from: -$$Nest$mapplyNativeSurfaceBufferSize, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m2367$$Nest$mapplyNativeSurfaceBufferSize(net.kdt.pojavlaunch.MinecraftGLSurface r0, android.view.SurfaceHolder r1, net.kdt.pojavlaunch.MinecraftGLSurface.RenderSize r2) {
            r0.applyNativeSurfaceBufferSize(r1, r2)
            return
    }

    /* JADX INFO: renamed from: -$$Nest$mattachBridgeWindow, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m2368$$Nest$mattachBridgeWindow(net.kdt.pojavlaunch.MinecraftGLSurface r0, android.view.Surface r1, net.kdt.pojavlaunch.MinecraftGLSurface.RenderSize r2) {
            r0.attachBridgeWindow(r1, r2)
            return
    }

    /* JADX INFO: renamed from: -$$Nest$mnotifyRenderingStartedOnce, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m2369$$Nest$mnotifyRenderingStartedOnce(net.kdt.pojavlaunch.MinecraftGLSurface r0) {
            r0.notifyRenderingStartedOnce()
            return
    }

    /* JADX INFO: renamed from: -$$Nest$mnotifyRenderingStartedSoon, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m2370$$Nest$mnotifyRenderingStartedSoon(net.kdt.pojavlaunch.MinecraftGLSurface r0) {
            r0.notifyRenderingStartedSoon()
            return
    }

    /* JADX INFO: renamed from: -$$Nest$mrealStart, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m2371$$Nest$mrealStart(net.kdt.pojavlaunch.MinecraftGLSurface r0, android.view.Surface r1, net.kdt.pojavlaunch.MinecraftGLSurface.RenderSize r2, boolean r3) {
            r0.realStart(r1, r2, r3)
            return
    }

    /* JADX INFO: renamed from: -$$Nest$mrefreshSize, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m2372$$Nest$mrefreshSize(net.kdt.pojavlaunch.MinecraftGLSurface r0, net.kdt.pojavlaunch.MinecraftGLSurface.RenderSize r1) {
            r0.refreshSize(r1)
            return
    }

    /* JADX INFO: renamed from: -$$Nest$mreleaseTextureSurface, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m2373$$Nest$mreleaseTextureSurface(net.kdt.pojavlaunch.MinecraftGLSurface r0) {
            r0.releaseTextureSurface()
            return
    }

    /* JADX INFO: renamed from: -$$Nest$mresetSentWindowSize, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m2374$$Nest$mresetSentWindowSize(net.kdt.pojavlaunch.MinecraftGLSurface r0) {
            r0.resetSentWindowSize()
            return
    }

    /* JADX INFO: renamed from: -$$Nest$mscheduleSurfaceResizeRefreshes, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m2375$$Nest$mscheduleSurfaceResizeRefreshes(net.kdt.pojavlaunch.MinecraftGLSurface r0) {
            r0.scheduleSurfaceResizeRefreshes()
            return
    }

    /* JADX INFO: renamed from: -$$Nest$msendWindowSizeIfChanged, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m2376$$Nest$msendWindowSizeIfChanged(net.kdt.pojavlaunch.MinecraftGLSurface r0, net.kdt.pojavlaunch.MinecraftGLSurface.RenderSize r1, java.lang.String r2) {
            r0.sendWindowSizeIfChanged(r1, r2)
            return
    }

    /* JADX INFO: renamed from: -$$Nest$mupdateScaledSizeFromView, reason: not valid java name */
    static /* bridge */ /* synthetic */ net.kdt.pojavlaunch.MinecraftGLSurface.RenderSize m2377$$Nest$mupdateScaledSizeFromView(net.kdt.pojavlaunch.MinecraftGLSurface r0, int r1, int r2) {
            net.kdt.pojavlaunch.MinecraftGLSurface$RenderSize r0 = r0.updateScaledSizeFromView(r1, r2)
            return r0
    }

    /* JADX INFO: renamed from: -$$Nest$mupdateSizeFields, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m2378$$Nest$mupdateSizeFields(net.kdt.pojavlaunch.MinecraftGLSurface r0, net.kdt.pojavlaunch.MinecraftGLSurface.RenderSize r1) {
            r0.updateSizeFields(r1)
            return
    }

    static {
            return
    }

    public MinecraftGLSurface(android.content.Context r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0)
            return
    }

    public MinecraftGLSurface(android.content.Context r3, android.util.AttributeSet r4) {
            r2 = this;
            r2.<init>(r3, r4)
            r4 = 1
            r2.viewWidth = r4
            r2.viewHeight = r4
            r2.renderWidth = r4
            r2.renderHeight = r4
            r0 = 1065353216(0x3f800000, float:1.0)
            r2.inputScaleX = r0
            r2.inputScaleY = r0
            r0 = -1
            r2.lastSentWindowWidth = r0
            r2.lastSentWindowHeight = r0
            r2.lastLoggedScalePercent = r0
            r2.lastLoggedViewWidth = r0
            r2.lastLoggedViewHeight = r0
            r2.lastLoggedRenderWidth = r0
            r2.lastLoggedRenderHeight = r0
            r0 = 0
            r2.renderingStarted = r0
            r2.bridgeWindowAttached = r0
            r2.grabbed = r0
            android.os.Handler r0 = new android.os.Handler
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            r0.<init>(r1)
            r2.touchHandler = r0
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            r2.hardwareKeysDown = r0
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            r2.hardwareMouseButtonsDown = r0
            android.view.ViewConfiguration r0 = android.view.ViewConfiguration.get(r3)
            int r0 = r0.getScaledTouchSlop()
            r2.touchSlop = r0
            r2.setFocusable(r4)
            r2.setFocusableInTouchMode(r4)
            org.lwjgl.glfw.CallbackBridge.init(r3)
            org.lwjgl.glfw.CallbackBridge.addGrabListener(r2)
            net.kdt.pojavlaunch.MinecraftGLSurface$$ExternalSyntheticLambda9 r3 = new net.kdt.pojavlaunch.MinecraftGLSurface$$ExternalSyntheticLambda9
            r3.<init>(r2)
            r2.setOnCapturedPointerListener(r3)
            r2.setFocusable(r4)
            r2.setFocusableInTouchMode(r4)
            r2.requestFocus()
            return
    }

    private void addRenderView(android.view.View r3) {
            r2 = this;
            android.widget.FrameLayout$LayoutParams r0 = new android.widget.FrameLayout$LayoutParams
            r1 = -1
            r0.<init>(r1, r1)
            r2.addView(r3, r0)
            r3.requestLayout()
            return
    }

    private static int androidKeyCodeToGlfw(int r2) {
            r0 = 29
            if (r2 < r0) goto Lb
            r0 = 54
            if (r2 > r0) goto Lb
            int r2 = r2 + 36
            return r2
        Lb:
            r0 = 7
            if (r2 < r0) goto L15
            r0 = 16
            if (r2 > r0) goto L15
            int r2 = r2 + 41
            return r2
        L15:
            r0 = 131(0x83, float:1.84E-43)
            if (r2 < r0) goto L20
            r0 = 142(0x8e, float:1.99E-43)
            if (r2 > r0) goto L20
            int r2 = r2 + 159
            return r2
        L20:
            r0 = 144(0x90, float:2.02E-43)
            if (r2 < r0) goto L2b
            r0 = 153(0x99, float:2.14E-43)
            if (r2 > r0) goto L2b
            int r2 = r2 + 176
            return r2
        L2b:
            r0 = 82
            if (r2 == r0) goto Ldb
            r0 = 143(0x8f, float:2.0E-43)
            if (r2 == r0) goto Ld8
            r0 = 92
            if (r2 == r0) goto Ld5
            r1 = 93
            if (r2 == r1) goto Ld2
            switch(r2) {
                case 19: goto Lcf;
                case 20: goto Lcc;
                case 21: goto Lc9;
                case 22: goto Lc6;
                default: goto L3e;
            }
        L3e:
            switch(r2) {
                case 55: goto Lc3;
                case 56: goto Lc0;
                case 57: goto Lbd;
                case 58: goto Lba;
                case 59: goto Lb7;
                case 60: goto Lb4;
                case 61: goto Lb1;
                case 62: goto Lae;
                default: goto L41;
            }
        L41:
            switch(r2) {
                case 66: goto Lab;
                case 67: goto La8;
                case 68: goto La5;
                case 69: goto La2;
                case 70: goto L9f;
                case 71: goto L9c;
                case 72: goto L9b;
                case 73: goto L9a;
                case 74: goto L97;
                case 75: goto L94;
                case 76: goto L91;
                default: goto L44;
            }
        L44:
            switch(r2) {
                case 111: goto L8e;
                case 112: goto L8b;
                case 113: goto L88;
                case 114: goto L85;
                case 115: goto L82;
                case 116: goto L7f;
                case 117: goto L7c;
                case 118: goto L79;
                default: goto L47;
            }
        L47:
            switch(r2) {
                case 120: goto L76;
                case 121: goto L73;
                case 122: goto L70;
                case 123: goto L6d;
                case 124: goto L6a;
                default: goto L4a;
            }
        L4a:
            switch(r2) {
                case 154: goto L67;
                case 155: goto L64;
                case 156: goto L61;
                case 157: goto L5e;
                case 158: goto L5b;
                default: goto L4d;
            }
        L4d:
            switch(r2) {
                case 160: goto Lab;
                case 161: goto L58;
                case 162: goto L55;
                case 163: goto L52;
                default: goto L50;
            }
        L50:
            r2 = -1
            return r2
        L52:
            r2 = 321(0x141, float:4.5E-43)
            return r2
        L55:
            r2 = 320(0x140, float:4.48E-43)
            return r2
        L58:
            r2 = 336(0x150, float:4.71E-43)
            return r2
        L5b:
            r2 = 330(0x14a, float:4.62E-43)
            return r2
        L5e:
            r2 = 334(0x14e, float:4.68E-43)
            return r2
        L61:
            r2 = 333(0x14d, float:4.67E-43)
            return r2
        L64:
            r2 = 332(0x14c, float:4.65E-43)
            return r2
        L67:
            r2 = 331(0x14b, float:4.64E-43)
            return r2
        L6a:
            r2 = 260(0x104, float:3.64E-43)
            return r2
        L6d:
            r2 = 269(0x10d, float:3.77E-43)
            return r2
        L70:
            r2 = 268(0x10c, float:3.76E-43)
            return r2
        L73:
            r2 = 284(0x11c, float:3.98E-43)
            return r2
        L76:
            r2 = 283(0x11b, float:3.97E-43)
            return r2
        L79:
            r2 = 347(0x15b, float:4.86E-43)
            return r2
        L7c:
            r2 = 343(0x157, float:4.8E-43)
            return r2
        L7f:
            r2 = 281(0x119, float:3.94E-43)
            return r2
        L82:
            r2 = 280(0x118, float:3.92E-43)
            return r2
        L85:
            r2 = 345(0x159, float:4.83E-43)
            return r2
        L88:
            r2 = 341(0x155, float:4.78E-43)
            return r2
        L8b:
            r2 = 261(0x105, float:3.66E-43)
            return r2
        L8e:
            r2 = 256(0x100, float:3.59E-43)
            return r2
        L91:
            r2 = 47
            return r2
        L94:
            r2 = 39
            return r2
        L97:
            r2 = 59
            return r2
        L9a:
            return r0
        L9b:
            return r1
        L9c:
            r2 = 91
            return r2
        L9f:
            r2 = 61
            return r2
        La2:
            r2 = 45
            return r2
        La5:
            r2 = 96
            return r2
        La8:
            r2 = 259(0x103, float:3.63E-43)
            return r2
        Lab:
            r2 = 257(0x101, float:3.6E-43)
            return r2
        Lae:
            r2 = 32
            return r2
        Lb1:
            r2 = 258(0x102, float:3.62E-43)
            return r2
        Lb4:
            r2 = 344(0x158, float:4.82E-43)
            return r2
        Lb7:
            r2 = 340(0x154, float:4.76E-43)
            return r2
        Lba:
            r2 = 346(0x15a, float:4.85E-43)
            return r2
        Lbd:
            r2 = 342(0x156, float:4.79E-43)
            return r2
        Lc0:
            r2 = 46
            return r2
        Lc3:
            r2 = 44
            return r2
        Lc6:
            r2 = 262(0x106, float:3.67E-43)
            return r2
        Lc9:
            r2 = 263(0x107, float:3.69E-43)
            return r2
        Lcc:
            r2 = 264(0x108, float:3.7E-43)
            return r2
        Lcf:
            r2 = 265(0x109, float:3.71E-43)
            return r2
        Ld2:
            r2 = 267(0x10b, float:3.74E-43)
            return r2
        Ld5:
            r2 = 266(0x10a, float:3.73E-43)
            return r2
        Ld8:
            r2 = 282(0x11a, float:3.95E-43)
            return r2
        Ldb:
            r2 = 348(0x15c, float:4.88E-43)
            return r2
    }

    private static int androidMouseButtonToGlfw(int r2) {
            r0 = 1
            if (r2 == r0) goto Ld
            r1 = 2
            if (r2 == r1) goto Lc
            r0 = 4
            if (r2 == r0) goto Lb
            r2 = -1
            return r2
        Lb:
            return r1
        Lc:
            return r0
        Ld:
            r2 = 0
            return r2
    }

    private void applyNativeSurfaceBufferSize(android.view.SurfaceHolder r3, net.kdt.pojavlaunch.MinecraftGLSurface.RenderSize r4) {
            r2 = this;
            int r0 = r4.renderWidth     // Catch: java.lang.Throwable -> L17
            int r1 = r4.viewWidth     // Catch: java.lang.Throwable -> L17
            if (r0 != r1) goto L10
            int r0 = r4.renderHeight     // Catch: java.lang.Throwable -> L17
            int r1 = r4.viewHeight     // Catch: java.lang.Throwable -> L17
            if (r0 != r1) goto L10
            r3.setSizeFromLayout()     // Catch: java.lang.Throwable -> L17
            goto L17
        L10:
            int r0 = r4.renderWidth     // Catch: java.lang.Throwable -> L17
            int r4 = r4.renderHeight     // Catch: java.lang.Throwable -> L17
            r3.setFixedSize(r0, r4)     // Catch: java.lang.Throwable -> L17
        L17:
            return
    }

    private void attachBridgeWindow(android.view.Surface r2, net.kdt.pojavlaunch.MinecraftGLSurface.RenderSize r3) {
            r1 = this;
            net.kdt.pojavlaunch.utils.JREUtils.setupBridgeWindow(r2)
            r2 = 1
            r1.bridgeWindowAttached = r2
            r1.updateSizeFields(r3)
            int r2 = r3.renderWidth
            float r2 = (float) r2
            r0 = 1073741824(0x40000000, float:2.0)
            float r2 = r2 / r0
            org.lwjgl.glfw.CallbackBridge.mouseX = r2
            int r2 = r3.renderHeight
            float r2 = (float) r2
            float r2 = r2 / r0
            org.lwjgl.glfw.CallbackBridge.mouseY = r2
            r1.resetSentWindowSize()
            java.lang.String r2 = "attachBridgeWindow"
            r1.sendWindowSizeIfChanged(r3, r2)
            float r2 = org.lwjgl.glfw.CallbackBridge.mouseX
            float r3 = org.lwjgl.glfw.CallbackBridge.mouseY
            org.lwjgl.glfw.CallbackBridge.sendCursorPos(r2, r3)
            r1.scheduleSurfaceResizeRefreshes()
            return
    }

    private void cancelTouchLongPressAttack(boolean r3) {
            r2 = this;
            java.lang.Runnable r0 = r2.touchLongPressRunnable
            if (r0 == 0) goto Lc
            android.os.Handler r1 = r2.touchHandler
            r1.removeCallbacks(r0)
            r0 = 0
            r2.touchLongPressRunnable = r0
        Lc:
            if (r3 == 0) goto L18
            boolean r3 = r2.touchLongPressAttackActive
            if (r3 == 0) goto L18
            r3 = 0
            sendMouseButton(r3, r3)
            r2.touchLongPressAttackActive = r3
        L18:
            return
    }

    private static float clamp(float r0, float r1, float r2) {
            float r0 = java.lang.Math.min(r2, r0)
            float r0 = java.lang.Math.max(r1, r0)
            return r0
    }

    private int clampResolutionScalePercent(int r2) {
            r1 = this;
            r0 = 1
            if (r2 >= r0) goto L4
            return r0
        L4:
            r0 = 100
            if (r2 <= r0) goto L9
            return r0
        L9:
            return r2
    }

    private static net.kdt.pojavlaunch.MinecraftGLSurface.RelativeMouseDelta collectRelativeMouseDelta(android.view.MotionEvent r4, int r5, boolean r6) {
            int r5 = safePointerIndex(r4, r5)
            r0 = 27
            float r0 = sumRelativeAxis(r4, r0, r5)
            r1 = 28
            float r1 = sumRelativeAxis(r4, r1, r5)
            boolean r2 = hasRelativeMovement(r0, r1)
            r3 = 1
            if (r2 == 0) goto L1d
            net.kdt.pojavlaunch.MinecraftGLSurface$RelativeMouseDelta r4 = new net.kdt.pojavlaunch.MinecraftGLSurface$RelativeMouseDelta
            r4.<init>(r0, r1, r3)
            return r4
        L1d:
            if (r6 != 0) goto L25
            boolean r6 = isRelativeMouseSource(r4)
            if (r6 == 0) goto L3a
        L25:
            float r6 = sumCapturedPointerCoordinate(r4, r5, r3)
            r0 = 0
            float r4 = sumCapturedPointerCoordinate(r4, r5, r0)
            boolean r5 = hasRelativeMovement(r6, r4)
            if (r5 == 0) goto L3a
            net.kdt.pojavlaunch.MinecraftGLSurface$RelativeMouseDelta r5 = new net.kdt.pojavlaunch.MinecraftGLSurface$RelativeMouseDelta
            r5.<init>(r6, r4, r3)
            return r5
        L3a:
            net.kdt.pojavlaunch.MinecraftGLSurface$RelativeMouseDelta r4 = net.kdt.pojavlaunch.MinecraftGLSurface.RelativeMouseDelta.NONE
            return r4
    }

    private static boolean envContains(java.lang.String r2, java.lang.String r3) {
            r0 = 0
            java.lang.String r2 = java.lang.System.getenv(r2)     // Catch: java.lang.Throwable -> L14
            if (r2 == 0) goto L14
            java.util.Locale r1 = java.util.Locale.ROOT     // Catch: java.lang.Throwable -> L14
            java.lang.String r2 = r2.toLowerCase(r1)     // Catch: java.lang.Throwable -> L14
            boolean r2 = r2.contains(r3)     // Catch: java.lang.Throwable -> L14
            if (r2 == 0) goto L14
            r0 = 1
        L14:
            return r0
    }

    private static boolean envEquals(java.lang.String r0, java.lang.String r1) {
            java.lang.String r0 = java.lang.System.getenv(r0)     // Catch: java.lang.Throwable -> L9
            boolean r0 = r1.equals(r0)     // Catch: java.lang.Throwable -> L9
            return r0
        L9:
            r0 = 0
            return r0
    }

    private static int findMousePointerIndex(android.view.MotionEvent r4) {
            r0 = 0
            r1 = r0
        L2:
            int r2 = r4.getPointerCount()
            if (r1 >= r2) goto L17
            int r2 = r4.getToolType(r1)
            r3 = 3
            if (r2 == r3) goto L16
            r3 = 2
            if (r2 != r3) goto L13
            goto L16
        L13:
            int r1 = r1 + 1
            goto L2
        L16:
            return r1
        L17:
            int r4 = r4.getSource()
            r1 = r4 & 8194(0x2002, float:1.1482E-41)
            r2 = 8194(0x2002, float:1.1482E-41)
            if (r1 == r2) goto L31
            r1 = 131076(0x20004, float:1.83677E-40)
            r2 = r4 & r1
            if (r2 == r1) goto L31
            r1 = 1048584(0x100008, float:1.469379E-39)
            r4 = r4 & r1
            if (r4 != r1) goto L2f
            goto L31
        L2f:
            r4 = -1
            return r4
        L31:
            return r0
    }

    private void forceRefreshSize(java.lang.String r2) {
            r1 = this;
            r0 = 1
            r1.refreshSize(r0, r2)
            return
    }

    private boolean handleCapturedPointer(android.view.View r5, android.view.MotionEvent r6) {
            r4 = this;
            r4.requestFocusIfNeeded()
            r4.markHardwarePointerInputMode()
            int r5 = r6.getActionMasked()
            r0 = 2
            r1 = 1
            r2 = 0
            if (r5 == r0) goto L6f
            r0 = 7
            if (r5 == r0) goto L6f
            r0 = 8
            if (r5 == r0) goto L5d
            r0 = 11
            if (r5 == r0) goto L3e
            r0 = 12
            if (r5 == r0) goto L1f
            return r2
        L1f:
            boolean r5 = r4.grabbed
            if (r5 != 0) goto L2e
            float r5 = r6.getX()
            float r0 = r6.getY()
            r4.sendHardwareAbsoluteCursor(r6, r5, r0)
        L2e:
            float r5 = r6.getX()
            float r0 = r6.getY()
            r4.updateHardwareMousePositionIfUsable(r6, r5, r0)
            boolean r5 = r4.sendMouseButtonUnconvertedTracked(r6, r2, r2)
            return r5
        L3e:
            boolean r5 = r4.grabbed
            if (r5 != 0) goto L4d
            float r5 = r6.getX()
            float r0 = r6.getY()
            r4.sendHardwareAbsoluteCursor(r6, r5, r0)
        L4d:
            float r5 = r6.getX()
            float r0 = r6.getY()
            r4.updateHardwareMousePositionIfUsable(r6, r5, r0)
            boolean r5 = r4.sendMouseButtonUnconvertedTracked(r6, r1, r2)
            return r5
        L5d:
            r5 = 10
            float r5 = r6.getAxisValue(r5)
            double r2 = (double) r5
            r5 = 9
            float r5 = r6.getAxisValue(r5)
            double r5 = (double) r5
            org.lwjgl.glfw.CallbackBridge.sendScroll(r2, r5)
            return r1
        L6f:
            net.kdt.pojavlaunch.MinecraftGLSurface$RelativeMouseDelta r5 = collectRelativeMouseDelta(r6, r2, r1)
            boolean r6 = r5.hasMovement
            if (r6 != 0) goto L78
            return r1
        L78:
            float r6 = r5.dx
            float r5 = r5.dy
            r4.sendHardwareRelativeCursor(r6, r5)
            return r1
    }

    private boolean handleHardwareMouseTouchEvent(android.view.MotionEvent r8) {
            r7 = this;
            int r0 = findMousePointerIndex(r8)
            r1 = 0
            if (r0 >= 0) goto L8
            r0 = r1
        L8:
            r7.requestFocusIfNeeded()
            r7.markHardwarePointerInputMode()
            float r2 = safeEventX(r8, r0)
            float r3 = safeEventY(r8, r0)
            int r4 = r8.getActionMasked()
            if (r4 == 0) goto L97
            r5 = 1
            if (r4 == r5) goto L89
            r6 = 2
            if (r4 == r6) goto L56
            r6 = 3
            if (r4 == r6) goto L4f
            r6 = 7
            if (r4 == r6) goto L56
            r6 = 11
            if (r4 == r6) goto L40
            r5 = 12
            if (r4 == r5) goto L31
            return r1
        L31:
            boolean r4 = r7.grabbed
            if (r4 != 0) goto L38
            r7.sendHardwareAbsoluteCursor(r8, r2, r3)
        L38:
            r7.updateHardwareMousePositionIfUsable(r8, r2, r3)
            boolean r8 = r7.sendMouseButtonUnconvertedTracked(r8, r1, r0)
            return r8
        L40:
            boolean r1 = r7.grabbed
            if (r1 != 0) goto L47
            r7.sendHardwareAbsoluteCursor(r8, r2, r3)
        L47:
            r7.updateHardwareMousePositionIfUsable(r8, r2, r3)
            boolean r8 = r7.sendMouseButtonUnconvertedTracked(r8, r5, r0)
            return r8
        L4f:
            r7.releaseAllHardwareMouseButtons()
            r7.resetHardwarePointerTracking(r1)
            return r5
        L56:
            boolean r4 = r7.grabbed
            if (r4 == 0) goto L82
            net.kdt.pojavlaunch.MinecraftGLSurface$RelativeMouseDelta r0 = collectRelativeMouseDelta(r8, r0, r1)
            float r1 = r0.dx
            float r4 = r0.dy
            boolean r0 = r0.hasMovement
            if (r0 != 0) goto L7e
            boolean r0 = r7.hasLastHardwareMousePosition
            if (r0 == 0) goto L7a
            boolean r0 = r7.isUsableHardwareAbsoluteCoordinate(r8, r2, r3)
            if (r0 != 0) goto L71
            goto L7a
        L71:
            float r0 = r7.lastHardwareMouseX
            float r1 = r2 - r0
            float r0 = r7.lastHardwareMouseY
            float r4 = r3 - r0
            goto L7e
        L7a:
            r7.updateHardwareMousePositionIfUsable(r8, r2, r3)
            return r5
        L7e:
            r7.sendHardwareRelativeCursor(r1, r4)
            goto L85
        L82:
            r7.sendHardwareAbsoluteCursor(r8, r2, r3)
        L85:
            r7.updateHardwareMousePositionIfUsable(r8, r2, r3)
            return r5
        L89:
            boolean r0 = r7.grabbed
            if (r0 != 0) goto L90
            r7.sendHardwareAbsoluteCursor(r8, r2, r3)
        L90:
            r7.releaseMouseButtonsForEvent(r8)
            r7.updateHardwareMousePositionIfUsable(r8, r2, r3)
            return r5
        L97:
            r7.updateHardwareMousePositionIfUsable(r8, r2, r3)
            boolean r0 = r7.grabbed
            if (r0 != 0) goto La1
            r7.sendHardwareAbsoluteCursor(r8, r2, r3)
        La1:
            boolean r8 = r7.sendPrimaryMouseDownIfNeeded(r8)
            return r8
    }

    private boolean handlePhysicalKeyboardEvent(android.view.KeyEvent r12) {
            r11 = this;
            boolean r0 = r11.isPhysicalKeyboardEvent(r12)
            r1 = 0
            if (r0 != 0) goto L8
            return r1
        L8:
            int r0 = r12.getAction()
            r2 = 1
            if (r0 == 0) goto L12
            if (r0 == r2) goto L12
            return r1
        L12:
            int r3 = r12.getKeyCode()
            int r3 = androidKeyCodeToGlfw(r3)
            if (r3 >= 0) goto L1d
            return r1
        L1d:
            if (r0 != 0) goto L26
            int r4 = r12.getRepeatCount()
            if (r4 <= 0) goto L26
            return r2
        L26:
            if (r0 != 0) goto L2a
            r0 = r2
            goto L2b
        L2a:
            r0 = r1
        L2b:
            org.lwjgl.glfw.CallbackBridge.setInputReady(r2)     // Catch: java.lang.Throwable -> L70
            if (r0 == 0) goto L33
            org.lwjgl.glfw.CallbackBridge.setModifiers(r3, r2)     // Catch: java.lang.Throwable -> L70
        L33:
            int r10 = org.lwjgl.glfw.CallbackBridge.getCurrentMods()     // Catch: java.lang.Throwable -> L70
            boolean r4 = r11.grabbed     // Catch: java.lang.Throwable -> L70
            if (r4 != 0) goto L4f
            int r4 = r12.getKeyCode()     // Catch: java.lang.Throwable -> L70
            char r6 = resolveKeyChar(r12)     // Catch: java.lang.Throwable -> L70
            int r7 = safeScanCode(r12)     // Catch: java.lang.Throwable -> L70
            r5 = r3
            r8 = r10
            r9 = r0
            boolean r12 = sendPhysicalKeyByReflection(r4, r5, r6, r7, r8, r9)     // Catch: java.lang.Throwable -> L70
            goto L50
        L4f:
            r12 = r1
        L50:
            if (r12 != 0) goto L55
            org.lwjgl.glfw.CallbackBridge.sendKeyPress(r3, r10, r0)     // Catch: java.lang.Throwable -> L70
        L55:
            if (r0 != 0) goto L5a
            org.lwjgl.glfw.CallbackBridge.setModifiers(r3, r1)     // Catch: java.lang.Throwable -> L70
        L5a:
            if (r0 == 0) goto L66
            java.util.Set<java.lang.Integer> r12 = r11.hardwareKeysDown     // Catch: java.lang.Throwable -> L70
            java.lang.Integer r0 = java.lang.Integer.valueOf(r3)     // Catch: java.lang.Throwable -> L70
            r12.add(r0)     // Catch: java.lang.Throwable -> L70
            goto L6f
        L66:
            java.util.Set<java.lang.Integer> r12 = r11.hardwareKeysDown     // Catch: java.lang.Throwable -> L70
            java.lang.Integer r0 = java.lang.Integer.valueOf(r3)     // Catch: java.lang.Throwable -> L70
            r12.remove(r0)     // Catch: java.lang.Throwable -> L70
        L6f:
            return r2
        L70:
            return r1
    }

    private boolean handleTouchEventInternal(android.view.MotionEvent r6) {
            r5 = this;
            boolean r0 = isHardwareMouseLikeEvent(r6)
            if (r0 == 0) goto Lb
            boolean r6 = r5.handleHardwareMouseTouchEvent(r6)
            return r6
        Lb:
            r5.requestFocusIfNeeded()
            r5.markTouchInputMode()
            int r0 = r6.getActionMasked()
            float r1 = r6.getX()
            float r6 = r6.getY()
            r2 = 0
            r3 = 1
            if (r0 == 0) goto Le1
            if (r0 == r3) goto La3
            r4 = 2
            if (r0 == r4) goto L39
            r6 = 3
            if (r0 == r6) goto L2a
            return r3
        L2a:
            boolean r6 = r5.grabbed
            if (r6 == 0) goto L32
            r5.cancelTouchLongPressAttack(r3)
            goto L35
        L32:
            sendMouseButton(r2, r2)
        L35:
            r5.resetTouchTracking()
            return r3
        L39:
            boolean r0 = r5.trackingTouch
            if (r0 != 0) goto L6b
            r5.trackingTouch = r3
            r5.touchMovedPastSlop = r2
            r5.touchLongPressAttackActive = r2
            r5.touchDownX = r1
            r5.touchDownY = r6
            r5.lastTouchX = r1
            r5.lastTouchY = r6
            boolean r0 = r5.isLikelyHotbarTap(r1, r6)
            r5.touchUiTapCandidate = r0
            boolean r0 = r5.grabbed
            if (r0 == 0) goto L67
            boolean r6 = r5.touchUiTapCandidate
            if (r6 != 0) goto L6a
            android.content.Context r6 = r5.getContext()
            boolean r6 = ca.dnamobile.javalauncher.controls.ControlsPreferences.isMinecraftTouchGesturesEnabled(r6)
            if (r6 == 0) goto L6a
            r5.scheduleTouchLongPressAttack()
            goto L6a
        L67:
            r5.sendAbsoluteCursor(r1, r6)
        L6a:
            return r3
        L6b:
            boolean r0 = r5.grabbed
            if (r0 == 0) goto L9b
            float r0 = r5.touchDownX
            float r0 = r1 - r0
            float r2 = r5.touchDownY
            float r2 = r6 - r2
            boolean r4 = r5.touchMovedPastSlop
            if (r4 != 0) goto L8b
            float r0 = r0 * r0
            float r2 = r2 * r2
            float r0 = r0 + r2
            int r2 = r5.touchSlop
            int r2 = r2 * r2
            float r2 = (float) r2
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 <= 0) goto L8b
            r5.touchMovedPastSlop = r3
            r5.cancelTouchLongPressAttack(r3)
        L8b:
            boolean r0 = r5.touchMovedPastSlop
            if (r0 == 0) goto L9e
            float r0 = r5.lastTouchX
            float r0 = r1 - r0
            float r2 = r5.lastTouchY
            float r2 = r6 - r2
            r5.sendRelativeCursor(r0, r2)
            goto L9e
        L9b:
            r5.sendAbsoluteCursor(r1, r6)
        L9e:
            r5.lastTouchX = r1
            r5.lastTouchY = r6
            return r3
        La3:
            boolean r0 = r5.grabbed
            if (r0 == 0) goto Ld7
            r5.cancelTouchLongPressAttack(r2)
            boolean r0 = r5.touchLongPressAttackActive
            if (r0 == 0) goto Lb2
            sendMouseButton(r2, r2)
            goto Ldd
        Lb2:
            boolean r0 = r5.trackingTouch
            if (r0 == 0) goto Ldd
            boolean r0 = r5.touchMovedPastSlop
            if (r0 != 0) goto Ldd
            boolean r0 = r5.touchUiTapCandidate
            if (r0 != 0) goto Ld3
            boolean r0 = r5.isLikelyHotbarTap(r1, r6)
            if (r0 == 0) goto Lc5
            goto Ld3
        Lc5:
            android.content.Context r6 = r5.getContext()
            boolean r6 = ca.dnamobile.javalauncher.controls.ControlsPreferences.isMinecraftTouchGesturesEnabled(r6)
            if (r6 == 0) goto Ldd
            r5.sendUseTap()
            goto Ldd
        Ld3:
            r5.sendHotbarSlotIfNeeded(r1, r6)
            goto Ldd
        Ld7:
            r5.sendAbsoluteCursor(r1, r6)
            sendMouseButton(r2, r2)
        Ldd:
            r5.resetTouchTracking()
            return r3
        Le1:
            r5.trackingTouch = r3
            r5.touchMovedPastSlop = r2
            r5.touchLongPressAttackActive = r2
            r5.touchDownX = r1
            r5.touchDownY = r6
            r5.lastTouchX = r1
            r5.lastTouchY = r6
            boolean r0 = r5.isLikelyHotbarTap(r1, r6)
            r5.touchUiTapCandidate = r0
            boolean r0 = r5.grabbed
            if (r0 == 0) goto L10b
            boolean r6 = r5.touchUiTapCandidate
            if (r6 != 0) goto L111
            android.content.Context r6 = r5.getContext()
            boolean r6 = ca.dnamobile.javalauncher.controls.ControlsPreferences.isMinecraftTouchGesturesEnabled(r6)
            if (r6 == 0) goto L111
            r5.scheduleTouchLongPressAttack()
            goto L111
        L10b:
            r5.sendAbsoluteCursor(r1, r6)
            sendMouseButton(r2, r3)
        L111:
            return r3
    }

    private static boolean hasRealExternalPointerDevice() {
            r0 = 0
            int[] r1 = android.view.InputDevice.getDeviceIds()     // Catch: java.lang.Throwable -> L1a
            int r2 = r1.length     // Catch: java.lang.Throwable -> L1a
            r3 = r0
        L7:
            if (r3 >= r2) goto L1a
            r4 = r1[r3]     // Catch: java.lang.Throwable -> L1a
            android.view.InputDevice r4 = android.view.InputDevice.getDevice(r4)     // Catch: java.lang.Throwable -> L1a
            boolean r4 = isRealExternalPointerDevice(r4)     // Catch: java.lang.Throwable -> L1a
            if (r4 == 0) goto L17
            r0 = 1
            return r0
        L17:
            int r3 = r3 + 1
            goto L7
        L1a:
            return r0
    }

    private boolean hasRecentlySeenHardwarePointer() {
            r4 = this;
            long r0 = r4.lastHardwarePointerEventNanos
            r2 = 0
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 <= 0) goto L18
            long r2 = java.lang.System.nanoTime()
            long r2 = r2 - r0
            r0 = 3000000000(0xb2d05e00, double:1.4821969375E-314)
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 >= 0) goto L18
            r0 = 1
            goto L19
        L18:
            r0 = 0
        L19:
            return r0
    }

    private static boolean hasRelativeMovement(float r1, float r2) {
            r0 = 0
            int r1 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r1 != 0) goto Lc
            int r1 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r1 == 0) goto La
            goto Lc
        La:
            r1 = 0
            goto Ld
        Lc:
            r1 = 1
        Ld:
            return r1
    }

    private int hotbarSlotForTouch(float r8, float r9) {
            r7 = this;
            android.content.Context r0 = r7.getContext()
            int r1 = r7.getWidth()
            float r1 = (float) r1
            int r2 = r7.getHeight()
            float r2 = (float) r2
            int r3 = org.lwjgl.glfw.CallbackBridge.physicalWidth
            float r3 = (float) r3
            int r4 = org.lwjgl.glfw.CallbackBridge.physicalHeight
            float r4 = (float) r4
            r5 = r8
            r6 = r9
            int r8 = ca.dnamobile.javalauncher.controls.TouchHotbarHitbox.slotForTouch(r0, r1, r2, r3, r4, r5, r6)
            return r8
    }

    private static boolean isControllerLikeKeyCode(int r2) {
            r0 = 96
            r1 = 1
            if (r2 < r0) goto La
            r0 = 110(0x6e, float:1.54E-43)
            if (r2 > r0) goto La
            return r1
        La:
            r0 = 23
            if (r2 != r0) goto Lf
            goto L10
        Lf:
            r1 = 0
        L10:
            return r1
    }

    private static boolean isFiniteCoordinate(float r1) {
            boolean r0 = java.lang.Float.isNaN(r1)
            if (r0 != 0) goto Le
            boolean r1 = java.lang.Float.isInfinite(r1)
            if (r1 != 0) goto Le
            r1 = 1
            goto Lf
        Le:
            r1 = 0
        Lf:
            return r1
    }

    private static boolean isGameControllerDevice(android.view.InputDevice r3) {
            if (r3 != 0) goto L4
            r3 = 0
            return r3
        L4:
            int r0 = r3.getSources()
            r1 = r0 & 1025(0x401, float:1.436E-42)
            r2 = 1025(0x401, float:1.436E-42)
            if (r1 == r2) goto L22
            r1 = 16777232(0x1000010, float:2.3509932E-38)
            r0 = r0 & r1
            if (r0 != r1) goto L15
            goto L22
        L15:
            java.lang.String r3 = r3.getName()
            java.lang.String r3 = safeLower(r3)
            boolean r3 = looksLikeControllerName(r3)
            return r3
        L22:
            r3 = 1
            return r3
    }

    private static boolean isGamepadMotionEvent(android.view.MotionEvent r2) {
            int r2 = r2.getSource()
            r0 = 16777232(0x1000010, float:2.3509932E-38)
            r1 = r2 & r0
            if (r1 == r0) goto L13
            r0 = 1025(0x401, float:1.436E-42)
            r2 = r2 & r0
            if (r2 != r0) goto L11
            goto L13
        L11:
            r2 = 0
            goto L14
        L13:
            r2 = 1
        L14:
            return r2
    }

    private static boolean isHardwareMouseLikeEvent(android.view.MotionEvent r5) {
            int r0 = r5.getSource()
            r1 = r0 & 8194(0x2002, float:1.1482E-41)
            r2 = 1
            r3 = 8194(0x2002, float:1.1482E-41)
            if (r1 == r3) goto L2d
            r1 = 131076(0x20004, float:1.83677E-40)
            r3 = r0 & r1
            if (r3 == r1) goto L2d
            r1 = 1048584(0x100008, float:1.469379E-39)
            r0 = r0 & r1
            if (r0 != r1) goto L19
            goto L2d
        L19:
            r0 = 0
            r1 = r0
        L1b:
            int r3 = r5.getPointerCount()
            if (r1 >= r3) goto L2c
            int r3 = r5.getToolType(r1)
            r4 = 3
            if (r3 != r4) goto L29
            return r2
        L29:
            int r1 = r1 + 1
            goto L1b
        L2c:
            return r0
        L2d:
            return r2
    }

    private static boolean isKeyboardLikeKeyCode(int r2) {
            r0 = 29
            r1 = 1
            if (r2 < r0) goto La
            r0 = 54
            if (r2 > r0) goto La
            return r1
        La:
            r0 = 7
            if (r2 < r0) goto L12
            r0 = 16
            if (r2 > r0) goto L12
            return r1
        L12:
            r0 = 131(0x83, float:1.84E-43)
            if (r2 < r0) goto L1b
            r0 = 142(0x8e, float:1.99E-43)
            if (r2 > r0) goto L1b
            return r1
        L1b:
            r0 = 144(0x90, float:2.02E-43)
            if (r2 < r0) goto L24
            r0 = 153(0x99, float:2.14E-43)
            if (r2 > r0) goto L24
            return r1
        L24:
            r0 = 82
            if (r2 == r0) goto L4b
            r0 = 143(0x8f, float:2.0E-43)
            if (r2 == r0) goto L4b
            r0 = 92
            if (r2 == r0) goto L4b
            r0 = 93
            if (r2 == r0) goto L4b
            switch(r2) {
                case 19: goto L4b;
                case 20: goto L4b;
                case 21: goto L4b;
                case 22: goto L4b;
                default: goto L37;
            }
        L37:
            switch(r2) {
                case 55: goto L4b;
                case 56: goto L4b;
                case 57: goto L4b;
                case 58: goto L4b;
                case 59: goto L4b;
                case 60: goto L4b;
                case 61: goto L4b;
                case 62: goto L4b;
                default: goto L3a;
            }
        L3a:
            switch(r2) {
                case 66: goto L4b;
                case 67: goto L4b;
                case 68: goto L4b;
                case 69: goto L4b;
                case 70: goto L4b;
                case 71: goto L4b;
                case 72: goto L4b;
                case 73: goto L4b;
                case 74: goto L4b;
                case 75: goto L4b;
                case 76: goto L4b;
                default: goto L3d;
            }
        L3d:
            switch(r2) {
                case 111: goto L4b;
                case 112: goto L4b;
                case 113: goto L4b;
                case 114: goto L4b;
                case 115: goto L4b;
                case 116: goto L4b;
                case 117: goto L4b;
                case 118: goto L4b;
                default: goto L40;
            }
        L40:
            switch(r2) {
                case 120: goto L4b;
                case 121: goto L4b;
                case 122: goto L4b;
                case 123: goto L4b;
                case 124: goto L4b;
                default: goto L43;
            }
        L43:
            switch(r2) {
                case 154: goto L4b;
                case 155: goto L4b;
                case 156: goto L4b;
                case 157: goto L4b;
                case 158: goto L4b;
                default: goto L46;
            }
        L46:
            switch(r2) {
                case 160: goto L4b;
                case 161: goto L4b;
                case 162: goto L4b;
                case 163: goto L4b;
                default: goto L49;
            }
        L49:
            r2 = 0
            return r2
        L4b:
            return r1
    }

    private boolean isLikelyHotbarTap(float r1, float r2) {
            r0 = this;
            int r1 = r0.hotbarSlotForTouch(r1, r2)
            if (r1 < 0) goto L8
            r1 = 1
            goto L9
        L8:
            r1 = 0
        L9:
            return r1
    }

    public static boolean isPhysicalKeyboardBackAsEsc(android.view.KeyEvent r0) {
            r0 = 0
            return r0
    }

    private boolean isPhysicalKeyboardEvent(android.view.KeyEvent r10) {
            r9 = this;
            int r0 = r10.getKeyCode()
            r1 = 4
            r2 = 0
            if (r0 != r1) goto L9
            return r2
        L9:
            boolean r0 = isSoftKeyboardGeneratedEvent(r10)
            if (r0 == 0) goto L10
            return r2
        L10:
            int r0 = r10.getKeyCode()
            boolean r0 = isControllerLikeKeyCode(r0)
            if (r0 == 0) goto L1b
            return r2
        L1b:
            int r0 = r10.getSource()
            android.view.InputDevice r1 = r10.getDevice()
            r3 = r0 & 257(0x101, float:3.6E-43)
            r4 = 257(0x101, float:3.6E-43)
            r5 = 1
            if (r3 != r4) goto L2c
            r3 = r5
            goto L2d
        L2c:
            r3 = r2
        L2d:
            r4 = 513(0x201, float:7.19E-43)
            r0 = r0 & r4
            if (r0 != r4) goto L34
            r0 = r5
            goto L35
        L34:
            r0 = r2
        L35:
            if (r1 == 0) goto L3f
            int r4 = r1.getKeyboardType()
            if (r4 == 0) goto L3f
            r4 = r5
            goto L40
        L3f:
            r4 = r2
        L40:
            int r6 = safeScanCode(r10)
            if (r6 == 0) goto L48
            r6 = r5
            goto L49
        L48:
            r6 = r2
        L49:
            char r7 = resolveKeyChar(r10)
            if (r7 == 0) goto L51
            r7 = r5
            goto L52
        L51:
            r7 = r2
        L52:
            int r8 = r10.getKeyCode()
            boolean r8 = isKeyboardLikeKeyCode(r8)
            if (r3 != 0) goto L68
            if (r4 != 0) goto L68
            if (r8 == 0) goto L67
            if (r0 != 0) goto L68
            if (r6 != 0) goto L68
            if (r7 == 0) goto L67
            goto L68
        L67:
            return r2
        L68:
            boolean r0 = isGameControllerDevice(r1)
            if (r0 == 0) goto L77
            if (r3 != 0) goto L77
            if (r4 != 0) goto L77
            if (r7 != 0) goto L77
            if (r8 != 0) goto L77
            return r2
        L77:
            int r10 = r10.getKeyCode()
            r0 = 3
            if (r10 == r0) goto L86
            r0 = 164(0xa4, float:2.3E-43)
            if (r10 == r0) goto L86
            switch(r10) {
                case 24: goto L86;
                case 25: goto L86;
                case 26: goto L86;
                default: goto L85;
            }
        L85:
            return r5
        L86:
            return r2
    }

    private static boolean isRealExternalPointerDevice(android.view.InputDevice r5) {
            r0 = 0
            if (r5 != 0) goto L4
            return r0
        L4:
            boolean r1 = isGameControllerDevice(r5)
            if (r1 == 0) goto Lb
            return r0
        Lb:
            int r1 = r5.getSources()
            r2 = r1 & 8194(0x2002, float:1.1482E-41)
            r3 = 8194(0x2002, float:1.1482E-41)
            if (r2 == r3) goto L36
            r2 = 131076(0x20004, float:1.83677E-40)
            r4 = r1 & r2
            if (r4 == r2) goto L36
            r4 = 1048584(0x100008, float:1.469379E-39)
            r1 = r1 & r4
            if (r1 == r4) goto L36
            boolean r1 = r5.supportsSource(r3)
            if (r1 != 0) goto L36
            boolean r1 = r5.supportsSource(r2)
            if (r1 != 0) goto L36
            boolean r1 = r5.supportsSource(r4)
            if (r1 == 0) goto L35
            goto L36
        L35:
            return r0
        L36:
            java.lang.String r5 = r5.getName()
            java.lang.String r5 = safeLower(r5)
            boolean r1 = looksLikeControllerName(r5)
            if (r1 != 0) goto L4d
            boolean r5 = looksLikeVirtualTouchName(r5)
            if (r5 == 0) goto L4b
            goto L4d
        L4b:
            r5 = 1
            return r5
        L4d:
            return r0
    }

    private static boolean isRelativeMouseSource(android.view.MotionEvent r1) {
            int r1 = r1.getSource()
            r0 = 131076(0x20004, float:1.83677E-40)
            r1 = r1 & r0
            if (r1 != r0) goto Lc
            r1 = 1
            goto Ld
        Lc:
            r1 = 0
        Ld:
            return r1
    }

    private static boolean isSoftKeyboardGeneratedEvent(android.view.KeyEvent r0) {
            int r0 = r0.getFlags()
            r0 = r0 & 2
            if (r0 == 0) goto La
            r0 = 1
            goto Lb
        La:
            r0 = 0
        Lb:
            return r0
    }

    private boolean isSuspiciousHardwareTopLeftCoordinate(android.view.MotionEvent r5, float r6, float r7) {
            r4 = this;
            r0 = 1065353216(0x3f800000, float:1.0)
            int r6 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            r1 = 0
            if (r6 > 0) goto L26
            int r6 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r6 <= 0) goto Lc
            goto L26
        Lc:
            int r5 = r5.getButtonState()
            r5 = r5 & 7
            if (r5 == 0) goto L15
            return r1
        L15:
            long r5 = r4.suppressSuspiciousHardwareAbsoluteUntilNanos
            r2 = 0
            int r7 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r7 <= 0) goto L26
            long r2 = java.lang.System.nanoTime()
            int r5 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r5 >= 0) goto L26
            r1 = 1
        L26:
            return r1
    }

    private boolean isUsableHardwareAbsoluteCoordinate(android.view.MotionEvent r2, float r3, float r4) {
            r1 = this;
            boolean r0 = isFiniteCoordinate(r3)
            if (r0 == 0) goto L14
            boolean r0 = isFiniteCoordinate(r4)
            if (r0 == 0) goto L14
            boolean r2 = r1.isSuspiciousHardwareTopLeftCoordinate(r2, r3, r4)
            if (r2 != 0) goto L14
            r2 = 1
            goto L15
        L14:
            r2 = 0
        L15:
            return r2
    }

    private /* synthetic */ void lambda$onGrabState$7(boolean r6) {
            r5 = this;
            r0 = 1
            if (r6 == 0) goto L2b
            long r1 = java.lang.System.nanoTime()
            r3 = 220000000(0xd1cef00, double:1.08694442E-315)
            long r1 = r1 + r3
            r5.suppressRelativeCursorUntilNanos = r1
            r5.cancelTouchLongPressAttack(r0)
            r5.resetTouchTracking()
            r5.resetHardwarePointerTracking(r0)
            r5.releaseAllHardwareMouseButtons()
            r6 = 0
            r5.recenterMouse(r6)
            boolean r6 = r5.shouldUsePointerCapture()
            if (r6 == 0) goto L27
            r5.safeRequestPointerCapture()
            goto L35
        L27:
            r5.safeReleasePointerCapture()
            goto L35
        L2b:
            r1 = 0
            r5.suppressRelativeCursorUntilNanos = r1
            r5.safeReleasePointerCapture()
            r5.recenterMouse(r0)
        L35:
            return
    }

    private /* synthetic */ void lambda$scheduleSurfaceResizeRefreshes$0() {
            r1 = this;
            java.lang.String r0 = "startup-resync-750"
            r1.forceRefreshSize(r0)
            return
    }

    private /* synthetic */ void lambda$scheduleSurfaceResizeRefreshes$1() {
            r1 = this;
            java.lang.String r0 = "startup-resync-1500"
            r1.forceRefreshSize(r0)
            return
    }

    private /* synthetic */ void lambda$scheduleSurfaceResizeRefreshes$2() {
            r1 = this;
            java.lang.String r0 = "startup-resync-3000"
            r1.forceRefreshSize(r0)
            return
    }

    private /* synthetic */ void lambda$scheduleSurfaceResizeRefreshes$3() {
            r1 = this;
            java.lang.String r0 = "startup-resync-6000"
            r1.forceRefreshSize(r0)
            return
    }

    private /* synthetic */ void lambda$scheduleSurfaceResizeRefreshes$4() {
            r1 = this;
            java.lang.String r0 = "startup-resync-10000"
            r1.forceRefreshSize(r0)
            return
    }

    private /* synthetic */ void lambda$scheduleSurfaceResizeRefreshes$5() {
            r1 = this;
            java.lang.String r0 = "startup-resync-14000"
            r1.forceRefreshSize(r0)
            return
    }

    private /* synthetic */ void lambda$scheduleTouchLongPressAttack$6() {
            r2 = this;
            boolean r0 = r2.trackingTouch
            if (r0 == 0) goto L18
            boolean r0 = r2.touchMovedPastSlop
            if (r0 != 0) goto L18
            boolean r0 = r2.touchUiTapCandidate
            if (r0 != 0) goto L18
            boolean r0 = r2.touchLongPressAttackActive
            if (r0 == 0) goto L11
            goto L18
        L11:
            r0 = 1
            r2.touchLongPressAttackActive = r0
            r1 = 0
            sendMouseButton(r1, r0)
        L18:
            return
    }

    private void logResolutionScaleIfChanged(int r3, int r4, int r5, int r6, int r7) {
            r2 = this;
            int r0 = r2.lastLoggedScalePercent
            if (r0 != r5) goto L15
            int r0 = r2.lastLoggedViewWidth
            if (r0 != r3) goto L15
            int r0 = r2.lastLoggedViewHeight
            if (r0 != r4) goto L15
            int r0 = r2.lastLoggedRenderWidth
            if (r0 != r6) goto L15
            int r0 = r2.lastLoggedRenderHeight
            if (r0 != r7) goto L15
            return
        L15:
            r2.lastLoggedScalePercent = r5
            r2.lastLoggedViewWidth = r3
            r2.lastLoggedViewHeight = r4
            r2.lastLoggedRenderWidth = r6
            r2.lastLoggedRenderHeight = r7
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "view="
            r0.<init>(r1)
            java.lang.StringBuilder r3 = r0.append(r3)
            java.lang.String r0 = "x"
            java.lang.StringBuilder r3 = r3.append(r0)
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.String r4 = " percent="
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.StringBuilder r3 = r3.append(r5)
            java.lang.String r4 = " render="
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.StringBuilder r3 = r3.append(r6)
            java.lang.StringBuilder r3 = r3.append(r0)
            java.lang.StringBuilder r3 = r3.append(r7)
            java.lang.String r4 = " texture="
            java.lang.StringBuilder r3 = r3.append(r4)
            android.view.TextureView r4 = r2.textureView
            r5 = 1
            r6 = 0
            if (r4 == 0) goto L5e
            r4 = r5
            goto L5f
        L5e:
            r4 = r6
        L5f:
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.String r4 = " nativeSurface="
            java.lang.StringBuilder r3 = r3.append(r4)
            android.view.SurfaceView r4 = r2.nativeSurfaceView
            if (r4 == 0) goto L6e
            goto L6f
        L6e:
            r5 = r6
        L6f:
            java.lang.StringBuilder r3 = r3.append(r5)
            java.lang.String r3 = r3.toString()
            java.lang.String r4 = "ResolutionScale"
            android.util.Log.i(r4, r3)
            return
    }

    private static boolean looksLikeControllerName(java.lang.String r1) {
            java.lang.String r0 = "controller"
            boolean r0 = r1.contains(r0)
            if (r0 != 0) goto Lab
            java.lang.String r0 = "gamepad"
            boolean r0 = r1.contains(r0)
            if (r0 != 0) goto Lab
            java.lang.String r0 = "joystick"
            boolean r0 = r1.contains(r0)
            if (r0 != 0) goto Lab
            java.lang.String r0 = "xbox"
            boolean r0 = r1.contains(r0)
            if (r0 != 0) goto Lab
            java.lang.String r0 = "dualshock"
            boolean r0 = r1.contains(r0)
            if (r0 != 0) goto Lab
            java.lang.String r0 = "dualsense"
            boolean r0 = r1.contains(r0)
            if (r0 != 0) goto Lab
            java.lang.String r0 = "playstation"
            boolean r0 = r1.contains(r0)
            if (r0 != 0) goto Lab
            java.lang.String r0 = "8bitdo"
            boolean r0 = r1.contains(r0)
            if (r0 != 0) goto Lab
            java.lang.String r0 = "gamesir"
            boolean r0 = r1.contains(r0)
            if (r0 != 0) goto Lab
            java.lang.String r0 = "ipega"
            boolean r0 = r1.contains(r0)
            if (r0 != 0) goto Lab
            java.lang.String r0 = "backbone"
            boolean r0 = r1.contains(r0)
            if (r0 != 0) goto Lab
            java.lang.String r0 = "kishi"
            boolean r0 = r1.contains(r0)
            if (r0 != 0) goto Lab
            java.lang.String r0 = "odin"
            boolean r0 = r1.contains(r0)
            if (r0 != 0) goto Lab
            java.lang.String r0 = "retroid"
            boolean r0 = r1.contains(r0)
            if (r0 != 0) goto Lab
            java.lang.String r0 = "anbernic"
            boolean r0 = r1.contains(r0)
            if (r0 != 0) goto Lab
            java.lang.String r0 = "aya"
            boolean r0 = r1.contains(r0)
            if (r0 != 0) goto Lab
            java.lang.String r0 = "gpd"
            boolean r0 = r1.contains(r0)
            if (r0 != 0) goto Lab
            java.lang.String r0 = "legion go"
            boolean r0 = r1.contains(r0)
            if (r0 != 0) goto Lab
            java.lang.String r0 = "steam deck"
            boolean r0 = r1.contains(r0)
            if (r0 != 0) goto Lab
            java.lang.String r0 = "razer raiju"
            boolean r0 = r1.contains(r0)
            if (r0 != 0) goto Lab
            java.lang.String r0 = "moga"
            boolean r1 = r1.contains(r0)
            if (r1 == 0) goto La9
            goto Lab
        La9:
            r1 = 0
            goto Lac
        Lab:
            r1 = 1
        Lac:
            return r1
    }

    private static boolean looksLikeMouseName(java.lang.String r1) {
            java.lang.String r0 = "mouse"
            boolean r0 = r1.contains(r0)
            if (r0 != 0) goto L43
            java.lang.String r0 = "trackball"
            boolean r0 = r1.contains(r0)
            if (r0 != 0) goto L43
            java.lang.String r0 = "trackpad"
            boolean r0 = r1.contains(r0)
            if (r0 != 0) goto L43
            java.lang.String r0 = "receiver"
            boolean r0 = r1.contains(r0)
            if (r0 != 0) goto L43
            java.lang.String r0 = "logitech"
            boolean r0 = r1.contains(r0)
            if (r0 != 0) goto L43
            java.lang.String r0 = "razer"
            boolean r0 = r1.contains(r0)
            if (r0 != 0) goto L43
            java.lang.String r0 = "microsoft"
            boolean r0 = r1.contains(r0)
            if (r0 != 0) goto L43
            java.lang.String r0 = "hid-compliant"
            boolean r1 = r1.contains(r0)
            if (r1 == 0) goto L41
            goto L43
        L41:
            r1 = 0
            goto L44
        L43:
            r1 = 1
        L44:
            return r1
    }

    private static boolean looksLikeVirtualTouchName(java.lang.String r1) {
            java.lang.String r0 = "virtual"
            boolean r0 = r1.contains(r0)
            if (r0 != 0) goto L3b
            java.lang.String r0 = "touchscreen"
            boolean r0 = r1.contains(r0)
            if (r0 != 0) goto L3b
            java.lang.String r0 = "touch mapping"
            boolean r0 = r1.contains(r0)
            if (r0 != 0) goto L3b
            java.lang.String r0 = "touchmapping"
            boolean r0 = r1.contains(r0)
            if (r0 != 0) goto L3b
            java.lang.String r0 = "uinput"
            boolean r0 = r1.contains(r0)
            if (r0 != 0) goto L3b
            java.lang.String r0 = "gpio"
            boolean r0 = r1.contains(r0)
            if (r0 != 0) goto L3b
            java.lang.String r0 = "keypad"
            boolean r1 = r1.contains(r0)
            if (r1 == 0) goto L39
            goto L3b
        L39:
            r1 = 0
            goto L3c
        L3b:
            r1 = 1
        L3c:
            return r1
    }

    private static float mapViewCoordinateToCursorCoordinate(float r2, float r3, float r4) {
            r0 = 1065353216(0x3f800000, float:1.0)
            float r3 = r3 - r0
            r1 = 0
            float r3 = java.lang.Math.max(r1, r3)
            float r4 = r4 - r0
            float r4 = java.lang.Math.max(r1, r4)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 <= 0) goto L21
            int r0 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r0 > 0) goto L16
            goto L21
        L16:
            float r2 = clamp(r2, r1, r3)
            float r2 = r2 * r4
            float r2 = r2 / r3
            float r2 = clamp(r2, r1, r4)
            return r2
        L21:
            return r1
    }

    private float mapViewXToCursorX(float r4) {
            r3 = this;
            int r0 = r3.viewWidth
            float r0 = (float) r0
            r1 = 1065353216(0x3f800000, float:1.0)
            float r0 = java.lang.Math.max(r1, r0)
            int r2 = org.lwjgl.glfw.CallbackBridge.windowWidth
            float r2 = (float) r2
            float r1 = java.lang.Math.max(r1, r2)
            float r4 = mapViewCoordinateToCursorCoordinate(r4, r0, r1)
            return r4
    }

    private float mapViewYToCursorY(float r4) {
            r3 = this;
            int r0 = r3.viewHeight
            float r0 = (float) r0
            r1 = 1065353216(0x3f800000, float:1.0)
            float r0 = java.lang.Math.max(r1, r0)
            int r2 = org.lwjgl.glfw.CallbackBridge.windowHeight
            float r2 = (float) r2
            float r1 = java.lang.Math.max(r1, r2)
            float r4 = mapViewCoordinateToCursorCoordinate(r4, r0, r1)
            return r4
    }

    private void markHardwarePointerInputMode() {
            r2 = this;
            long r0 = java.lang.System.nanoTime()
            r2.lastHardwarePointerEventNanos = r0
            boolean r0 = r2.grabbed
            if (r0 == 0) goto Ld
            r2.safeRequestPointerCapture()
        Ld:
            return
    }

    private void markTouchInputMode() {
            r1 = this;
            r0 = 1
            r1.resetHardwarePointerTracking(r0)
            r1.releaseAllHardwareMouseButtons()
            r1.safeReleasePointerCapture()
            return
    }

    private void notifyRenderingStartedOnce() {
            r1 = this;
            boolean r0 = r1.renderingStarted
            if (r0 == 0) goto L5
            return
        L5:
            r0 = 1
            r1.renderingStarted = r0
            r1.scheduleSurfaceResizeRefreshes()
            net.kdt.pojavlaunch.MinecraftGLSurface$OnRenderingStartedListener r0 = r1.renderingStartedListener
            if (r0 == 0) goto L12
            r0.isStarted()
        L12:
            return
    }

    private void notifyRenderingStartedSoon() {
            r3 = this;
            net.kdt.pojavlaunch.MinecraftGLSurface$$ExternalSyntheticLambda10 r0 = new net.kdt.pojavlaunch.MinecraftGLSurface$$ExternalSyntheticLambda10
            r0.<init>(r3)
            r1 = 100
            r3.postDelayed(r0, r1)
            return
    }

    private void realStart(android.view.Surface r1, net.kdt.pojavlaunch.MinecraftGLSurface.RenderSize r2, boolean r3) {
            r0 = this;
            r0.attachBridgeWindow(r1, r2)
            r0.scheduleSurfaceResizeRefreshes()
            if (r3 == 0) goto Lb
            r0.notifyRenderingStartedSoon()
        Lb:
            net.kdt.pojavlaunch.MinecraftGLSurface$SurfaceReadyListener r1 = r0.surfaceReadyListener
            if (r1 == 0) goto L23
            java.lang.Thread r1 = new java.lang.Thread
            net.kdt.pojavlaunch.MinecraftGLSurface$SurfaceReadyListener r2 = r0.surfaceReadyListener
            java.util.Objects.requireNonNull(r2)
            net.kdt.pojavlaunch.MinecraftGLSurface$$ExternalSyntheticLambda2 r3 = new net.kdt.pojavlaunch.MinecraftGLSurface$$ExternalSyntheticLambda2
            r3.<init>(r2)
            java.lang.String r2 = "JVM Main thread"
            r1.<init>(r3, r2)
            r1.start()
        L23:
            return
    }

    private void recenterMouse(boolean r4) {
            r3 = this;
            r0 = 1
            org.lwjgl.glfw.CallbackBridge.setInputReady(r0)
            int r1 = org.lwjgl.glfw.CallbackBridge.windowWidth
            int r1 = java.lang.Math.max(r0, r1)
            float r1 = (float) r1
            r2 = 1073741824(0x40000000, float:2.0)
            float r1 = r1 / r2
            org.lwjgl.glfw.CallbackBridge.mouseX = r1
            int r1 = org.lwjgl.glfw.CallbackBridge.windowHeight
            int r0 = java.lang.Math.max(r0, r1)
            float r0 = (float) r0
            float r0 = r0 / r2
            org.lwjgl.glfw.CallbackBridge.mouseY = r0
            if (r4 == 0) goto L23
            float r4 = org.lwjgl.glfw.CallbackBridge.mouseX
            float r0 = org.lwjgl.glfw.CallbackBridge.mouseY
            org.lwjgl.glfw.CallbackBridge.sendCursorPos(r4, r0)
        L23:
            return
    }

    private void refreshSize(net.kdt.pojavlaunch.MinecraftGLSurface.RenderSize r3) {
            r2 = this;
            r0 = 0
            java.lang.String r1 = "refreshSize"
            r2.refreshSize(r3, r0, r1)
            return
    }

    private void refreshSize(net.kdt.pojavlaunch.MinecraftGLSurface.RenderSize r4, boolean r5, java.lang.String r6) {
            r3 = this;
            r3.updateSizeFields(r4)
            android.view.TextureView r0 = r3.textureView
            if (r0 == 0) goto L1a
            android.graphics.SurfaceTexture r0 = r0.getSurfaceTexture()
            if (r0 == 0) goto L1a
            android.view.TextureView r0 = r3.textureView
            android.graphics.SurfaceTexture r0 = r0.getSurfaceTexture()
            int r1 = r4.renderWidth
            int r2 = r4.renderHeight
            r0.setDefaultBufferSize(r1, r2)
        L1a:
            android.view.SurfaceView r0 = r3.nativeSurfaceView
            if (r0 == 0) goto L25
            android.view.SurfaceHolder r0 = r0.getHolder()
            r3.applyNativeSurfaceBufferSize(r0, r4)
        L25:
            boolean r0 = r3.bridgeWindowAttached
            if (r0 == 0) goto L31
            if (r5 == 0) goto L2e
            r3.resetSentWindowSize()
        L2e:
            r3.sendWindowSizeIfChanged(r4, r6)
        L31:
            return
    }

    private void refreshSize(boolean r5, java.lang.String r6) {
            r4 = this;
            int r0 = r4.getWidth()
            int r0 = r4.safeWidth(r0)
            int r1 = r4.getHeight()
            int r1 = r4.safeHeight(r1)
            r2 = 1
            if (r0 > r2) goto L1f
            android.view.View r3 = r4.renderView
            if (r3 == 0) goto L1f
            int r0 = r3.getWidth()
            int r0 = r4.safeWidth(r0)
        L1f:
            if (r1 > r2) goto L2d
            android.view.View r2 = r4.renderView
            if (r2 == 0) goto L2d
            int r1 = r2.getHeight()
            int r1 = r4.safeHeight(r1)
        L2d:
            net.kdt.pojavlaunch.MinecraftGLSurface$RenderSize r0 = r4.updateScaledSizeFromView(r0, r1)
            r4.refreshSize(r0, r5, r6)
            return
    }

    private void releaseActiveHardwareInput() {
            r5 = this;
            r5.releaseAllHardwareMouseButtons()
            java.util.Set<java.lang.Integer> r0 = r5.hardwareKeysDown
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L42
            java.util.HashSet r0 = new java.util.HashSet
            java.util.Set<java.lang.Integer> r1 = r5.hardwareKeysDown
            r0.<init>(r1)
            java.util.Iterator r0 = r0.iterator()
        L16:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L3d
            java.lang.Object r1 = r0.next()
            java.lang.Integer r1 = (java.lang.Integer) r1
            if (r1 != 0) goto L25
            goto L16
        L25:
            r2 = 1
            org.lwjgl.glfw.CallbackBridge.setInputReady(r2)
            int r2 = r1.intValue()
            int r3 = org.lwjgl.glfw.CallbackBridge.getCurrentMods()
            r4 = 0
            org.lwjgl.glfw.CallbackBridge.sendKeyPress(r2, r3, r4)
            int r1 = r1.intValue()
            org.lwjgl.glfw.CallbackBridge.setModifiers(r1, r4)
            goto L16
        L3d:
            java.util.Set<java.lang.Integer> r0 = r5.hardwareKeysDown
            r0.clear()
        L42:
            return
    }

    private void releaseAllHardwareMouseButtons() {
            r3 = this;
            java.util.Set<java.lang.Integer> r0 = r3.hardwareMouseButtonsDown
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L9
            return
        L9:
            java.util.HashSet r0 = new java.util.HashSet
            java.util.Set<java.lang.Integer> r1 = r3.hardwareMouseButtonsDown
            r0.<init>(r1)
            java.util.Iterator r0 = r0.iterator()
        L14:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L2b
            java.lang.Object r1 = r0.next()
            java.lang.Integer r1 = (java.lang.Integer) r1
            if (r1 == 0) goto L14
            int r1 = r1.intValue()
            r2 = 0
            sendMouseButton(r1, r2)
            goto L14
        L2b:
            java.util.Set<java.lang.Integer> r0 = r3.hardwareMouseButtonsDown
            r0.clear()
            return
    }

    private void releaseMouseButtonsForEvent(android.view.MotionEvent r2) {
            r1 = this;
            int r2 = r2.getActionButton()
            int r2 = androidMouseButtonToGlfw(r2)
            if (r2 < 0) goto Lf
            r0 = 0
            r1.sendHardwareMouseButtonTracked(r2, r0)
            return
        Lf:
            r1.releaseAllHardwareMouseButtons()
            return
    }

    private void releaseTextureSurface() {
            r1 = this;
            android.view.Surface r0 = r1.textureSurface
            if (r0 == 0) goto La
            r0.release()
            r0 = 0
            r1.textureSurface = r0
        La:
            return
    }

    private void requestFocusIfNeeded() {
            r1 = this;
            boolean r0 = r1.hasFocus()
            if (r0 != 0) goto L9
            r1.requestFocus()
        L9:
            return
    }

    private void resetHardwarePointerTracking(boolean r5) {
            r4 = this;
            r0 = 0
            r4.hasLastHardwareMousePosition = r0
            r0 = 0
            r4.lastHardwareMouseX = r0
            r4.lastHardwareMouseY = r0
            r0 = 0
            r4.lastHardwarePointerEventNanos = r0
            if (r5 == 0) goto L18
            long r0 = java.lang.System.nanoTime()
            r2 = 650000000(0x26be3680, double:3.2114267E-315)
            long r0 = r0 + r2
            r4.suppressSuspiciousHardwareAbsoluteUntilNanos = r0
        L18:
            return
    }

    private void resetSentWindowSize() {
            r1 = this;
            r0 = -1
            r1.lastSentWindowWidth = r0
            r1.lastSentWindowHeight = r0
            return
    }

    private void resetTouchTracking() {
            r1 = this;
            r0 = 0
            r1.trackingTouch = r0
            r1.touchMovedPastSlop = r0
            r1.touchUiTapCandidate = r0
            r1.touchLongPressAttackActive = r0
            r0 = 0
            r1.touchDownX = r0
            r1.touchDownY = r0
            r1.lastTouchX = r0
            r1.lastTouchY = r0
            return
    }

    private static char resolveKeyChar(android.view.KeyEvent r1) {
            int r0 = r1.getMetaState()     // Catch: java.lang.Throwable -> Lc
            int r0 = r1.getUnicodeChar(r0)     // Catch: java.lang.Throwable -> Lc
            if (r0 == 0) goto Lc
            char r1 = (char) r0
            return r1
        Lc:
            int r1 = r1.getUnicodeChar()     // Catch: java.lang.Throwable -> L14
            if (r1 == 0) goto L14
            char r1 = (char) r1
            return r1
        L14:
            r1 = 0
            return r1
    }

    private static float safeEventX(android.view.MotionEvent r1, int r2) {
            if (r2 < 0) goto Ld
            int r0 = r1.getPointerCount()     // Catch: java.lang.Throwable -> Ld
            if (r2 >= r0) goto Ld
            float r1 = r1.getX(r2)     // Catch: java.lang.Throwable -> Ld
            return r1
        Ld:
            float r1 = r1.getX()
            return r1
    }

    private static float safeEventY(android.view.MotionEvent r1, int r2) {
            if (r2 < 0) goto Ld
            int r0 = r1.getPointerCount()     // Catch: java.lang.Throwable -> Ld
            if (r2 >= r0) goto Ld
            float r1 = r1.getY(r2)     // Catch: java.lang.Throwable -> Ld
            return r1
        Ld:
            float r1 = r1.getY()
            return r1
    }

    private int safeHeight(int r2) {
            r1 = this;
            if (r2 <= 0) goto L3
            goto L7
        L3:
            int r2 = r1.getHeight()
        L7:
            r0 = 1
            int r2 = java.lang.Math.max(r0, r2)
            return r2
    }

    private static java.lang.String safeLower(java.lang.String r1) {
            if (r1 != 0) goto L5
            java.lang.String r1 = ""
            goto Lb
        L5:
            java.util.Locale r0 = java.util.Locale.US
            java.lang.String r1 = r1.toLowerCase(r0)
        Lb:
            return r1
    }

    private static int safePointerIndex(android.view.MotionEvent r0, int r1) {
            if (r1 < 0) goto L9
            int r0 = r0.getPointerCount()
            if (r1 >= r0) goto L9
            return r1
        L9:
            r0 = 0
            return r0
    }

    private void safeReleasePointerCapture() {
            r0 = this;
            r0.releasePointerCapture()     // Catch: java.lang.Throwable -> L3
        L3:
            return
    }

    private void safeRequestPointerCapture() {
            r1 = this;
            boolean r0 = r1.hasWindowFocus()
            if (r0 == 0) goto L17
            boolean r0 = r1.isShown()
            if (r0 != 0) goto Ld
            goto L17
        Ld:
            boolean r0 = r1.shouldUsePointerCapture()
            if (r0 != 0) goto L14
            return
        L14:
            r1.requestPointerCapture()     // Catch: java.lang.Throwable -> L17
        L17:
            return
    }

    private static int safeScanCode(android.view.KeyEvent r0) {
            int r0 = r0.getScanCode()     // Catch: java.lang.Throwable -> L5
            return r0
        L5:
            r0 = 0
            return r0
    }

    private int safeWidth(int r2) {
            r1 = this;
            if (r2 <= 0) goto L3
            goto L7
        L3:
            int r2 = r1.getWidth()
        L7:
            r0 = 1
            int r2 = java.lang.Math.max(r0, r2)
            return r2
    }

    private float scaleDeltaX(float r2) {
            r1 = this;
            float r0 = r1.inputScaleX
            float r2 = r2 * r0
            return r2
    }

    private float scaleDeltaY(float r2) {
            r1 = this;
            float r0 = r1.inputScaleY
            float r2 = r2 * r0
            return r2
    }

    private float scaleInputX(float r2) {
            r1 = this;
            float r0 = r1.inputScaleX
            float r2 = r2 * r0
            return r2
    }

    private float scaleInputY(float r2) {
            r1 = this;
            float r0 = r1.inputScaleY
            float r2 = r2 * r0
            return r2
    }

    private void scheduleSurfaceResizeRefreshes() {
            r3 = this;
            net.kdt.pojavlaunch.MinecraftGLSurface$$ExternalSyntheticLambda0 r0 = new net.kdt.pojavlaunch.MinecraftGLSurface$$ExternalSyntheticLambda0
            r0.<init>(r3)
            r3.post(r0)
            net.kdt.pojavlaunch.MinecraftGLSurface$$ExternalSyntheticLambda0 r0 = new net.kdt.pojavlaunch.MinecraftGLSurface$$ExternalSyntheticLambda0
            r0.<init>(r3)
            r1 = 120(0x78, double:5.93E-322)
            r3.postDelayed(r0, r1)
            net.kdt.pojavlaunch.MinecraftGLSurface$$ExternalSyntheticLambda0 r0 = new net.kdt.pojavlaunch.MinecraftGLSurface$$ExternalSyntheticLambda0
            r0.<init>(r3)
            r1 = 350(0x15e, double:1.73E-321)
            r3.postDelayed(r0, r1)
            net.kdt.pojavlaunch.MinecraftGLSurface$$ExternalSyntheticLambda3 r0 = new net.kdt.pojavlaunch.MinecraftGLSurface$$ExternalSyntheticLambda3
            r0.<init>(r3)
            r1 = 750(0x2ee, double:3.705E-321)
            r3.postDelayed(r0, r1)
            net.kdt.pojavlaunch.MinecraftGLSurface$$ExternalSyntheticLambda4 r0 = new net.kdt.pojavlaunch.MinecraftGLSurface$$ExternalSyntheticLambda4
            r0.<init>(r3)
            r1 = 1500(0x5dc, double:7.41E-321)
            r3.postDelayed(r0, r1)
            net.kdt.pojavlaunch.MinecraftGLSurface$$ExternalSyntheticLambda5 r0 = new net.kdt.pojavlaunch.MinecraftGLSurface$$ExternalSyntheticLambda5
            r0.<init>(r3)
            r1 = 3000(0xbb8, double:1.482E-320)
            r3.postDelayed(r0, r1)
            net.kdt.pojavlaunch.MinecraftGLSurface$$ExternalSyntheticLambda6 r0 = new net.kdt.pojavlaunch.MinecraftGLSurface$$ExternalSyntheticLambda6
            r0.<init>(r3)
            r1 = 6000(0x1770, double:2.9644E-320)
            r3.postDelayed(r0, r1)
            net.kdt.pojavlaunch.MinecraftGLSurface$$ExternalSyntheticLambda7 r0 = new net.kdt.pojavlaunch.MinecraftGLSurface$$ExternalSyntheticLambda7
            r0.<init>(r3)
            r1 = 10000(0x2710, double:4.9407E-320)
            r3.postDelayed(r0, r1)
            net.kdt.pojavlaunch.MinecraftGLSurface$$ExternalSyntheticLambda8 r0 = new net.kdt.pojavlaunch.MinecraftGLSurface$$ExternalSyntheticLambda8
            r0.<init>(r3)
            r1 = 14000(0x36b0, double:6.917E-320)
            r3.postDelayed(r0, r1)
            return
    }

    private void scheduleTouchLongPressAttack() {
            r4 = this;
            r0 = 0
            r4.cancelTouchLongPressAttack(r0)
            net.kdt.pojavlaunch.MinecraftGLSurface$$ExternalSyntheticLambda1 r0 = new net.kdt.pojavlaunch.MinecraftGLSurface$$ExternalSyntheticLambda1
            r0.<init>(r4)
            r4.touchLongPressRunnable = r0
            android.os.Handler r1 = r4.touchHandler
            int r2 = android.view.ViewConfiguration.getLongPressTimeout()
            long r2 = (long) r2
            r1.postDelayed(r0, r2)
            return
    }

    private void sendAbsoluteCursor(float r2, float r3) {
            r1 = this;
            r0 = 1
            org.lwjgl.glfw.CallbackBridge.setInputReady(r0)
            float r2 = r1.mapViewXToCursorX(r2)
            org.lwjgl.glfw.CallbackBridge.mouseX = r2
            float r2 = r1.mapViewYToCursorY(r3)
            org.lwjgl.glfw.CallbackBridge.mouseY = r2
            float r2 = org.lwjgl.glfw.CallbackBridge.mouseX
            float r3 = org.lwjgl.glfw.CallbackBridge.mouseY
            org.lwjgl.glfw.CallbackBridge.sendCursorPos(r2, r3)
            return
    }

    private void sendHardwareAbsoluteCursor(android.view.MotionEvent r1, float r2, float r3) {
            r0 = this;
            boolean r1 = r0.isUsableHardwareAbsoluteCoordinate(r1, r2, r3)
            if (r1 != 0) goto L7
            return
        L7:
            r0.sendAbsoluteCursor(r2, r3)
            return
    }

    private boolean sendHardwareMouseButtonTracked(int r4, boolean r5) {
            r3 = this;
            if (r4 >= 0) goto L4
            r4 = 0
            return r4
        L4:
            r0 = 1
            if (r5 == 0) goto L14
            java.util.Set<java.lang.Integer> r1 = r3.hardwareMouseButtonsDown
            java.lang.Integer r2 = java.lang.Integer.valueOf(r4)
            boolean r1 = r1.add(r2)
            if (r1 != 0) goto L21
            return r0
        L14:
            java.util.Set<java.lang.Integer> r1 = r3.hardwareMouseButtonsDown
            java.lang.Integer r2 = java.lang.Integer.valueOf(r4)
            boolean r1 = r1.remove(r2)
            if (r1 != 0) goto L21
            return r0
        L21:
            sendMouseButton(r4, r5)
            return r0
    }

    private void sendHardwareRelativeCursor(float r2, float r3) {
            r1 = this;
            android.content.Context r0 = r1.getContext()
            ca.dnamobile.javalauncher.input.GamepadMappingStore r0 = ca.dnamobile.javalauncher.input.GamepadMappingStore.get(r0)
            float r0 = r0.getHardwareMouseDpiScaleMultiplier()
            float r2 = r2 * r0
            float r3 = r3 * r0
            r1.sendUnscaledRelativeCursor(r2, r3)
            return
    }

    private boolean sendHotbarSlotIfNeeded(float r1, float r2) {
            r0 = this;
            int r1 = r0.hotbarSlotForTouch(r1, r2)
            if (r1 >= 0) goto L8
            r1 = 0
            return r1
        L8:
            int r1 = r1 + 49
            r0.sendKeyTap(r1)
            r1 = 1
            return r1
    }

    private void sendKeyTap(int r3) {
            r2 = this;
            r0 = 1
            org.lwjgl.glfw.CallbackBridge.setInputReady(r0)
            org.lwjgl.glfw.CallbackBridge.setModifiers(r3, r0)
            int r1 = org.lwjgl.glfw.CallbackBridge.getCurrentMods()
            org.lwjgl.glfw.CallbackBridge.sendKeyPress(r3, r1, r0)
            int r0 = org.lwjgl.glfw.CallbackBridge.getCurrentMods()
            r1 = 0
            org.lwjgl.glfw.CallbackBridge.sendKeyPress(r3, r0, r1)
            org.lwjgl.glfw.CallbackBridge.setModifiers(r3, r1)
            return
    }

    public static void sendMouseButton(int r1, boolean r2) {
            r0 = 1
            org.lwjgl.glfw.CallbackBridge.setInputReady(r0)
            org.lwjgl.glfw.CallbackBridge.sendMouseButton(r1, r2)
            return
    }

    public static boolean sendMouseButtonUnconverted(int r0, boolean r1) {
            int r0 = androidMouseButtonToGlfw(r0)
            if (r0 >= 0) goto L8
            r0 = 0
            return r0
        L8:
            sendMouseButton(r0, r1)
            r0 = 1
            return r0
    }

    private boolean sendMouseButtonUnconvertedTracked(android.view.MotionEvent r4, boolean r5, int r6) {
            r3 = this;
            int r6 = r4.getActionButton()
            int r6 = androidMouseButtonToGlfw(r6)
            r0 = 1
            r1 = 0
            if (r6 >= 0) goto L23
            if (r5 == 0) goto L23
            int r4 = r4.getButtonState()
            r2 = r4 & 1
            if (r2 == 0) goto L18
            r6 = r1
            goto L23
        L18:
            r2 = r4 & 2
            if (r2 == 0) goto L1e
            r6 = r0
            goto L23
        L1e:
            r4 = r4 & 4
            if (r4 == 0) goto L23
            r6 = 2
        L23:
            if (r6 >= 0) goto L56
            if (r5 != 0) goto L56
            java.util.Set<java.lang.Integer> r4 = r3.hardwareMouseButtonsDown
            int r4 = r4.size()
            if (r4 != r0) goto L49
            java.util.Set<java.lang.Integer> r4 = r3.hardwareMouseButtonsDown
            java.util.Iterator r4 = r4.iterator()
        L35:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L56
            java.lang.Object r0 = r4.next()
            java.lang.Integer r0 = (java.lang.Integer) r0
            if (r0 == 0) goto L35
            int r4 = r0.intValue()
            r6 = r4
            goto L56
        L49:
            java.util.Set<java.lang.Integer> r4 = r3.hardwareMouseButtonsDown
            java.lang.Short r0 = java.lang.Short.valueOf(r1)
            boolean r4 = r4.contains(r0)
            if (r4 == 0) goto L56
            r6 = r1
        L56:
            if (r6 >= 0) goto L59
            return r1
        L59:
            boolean r4 = r3.sendHardwareMouseButtonTracked(r6, r5)
            return r4
    }

    private static boolean sendPhysicalKeyByReflection(int r15, int r16, char r17, int r18, int r19, boolean r20) {
            java.lang.Class<org.lwjgl.glfw.CallbackBridge> r0 = org.lwjgl.glfw.CallbackBridge.class
            r1 = 5
            java.lang.Object[][] r2 = new java.lang.Object[r1][]
            java.lang.Class[] r3 = new java.lang.Class[r1]
            java.lang.Class r4 = java.lang.Integer.TYPE
            r5 = 0
            r3[r5] = r4
            java.lang.Class r4 = java.lang.Character.TYPE
            r6 = 1
            r3[r6] = r4
            java.lang.Class r4 = java.lang.Integer.TYPE
            r7 = 2
            r3[r7] = r4
            java.lang.Class r4 = java.lang.Integer.TYPE
            r8 = 3
            r3[r8] = r4
            java.lang.Class r4 = java.lang.Boolean.TYPE
            r9 = 4
            r3[r9] = r4
            java.lang.Integer r4 = java.lang.Integer.valueOf(r16)
            java.lang.Character r10 = java.lang.Character.valueOf(r17)
            java.lang.Integer r11 = java.lang.Integer.valueOf(r18)
            java.lang.Integer r12 = java.lang.Integer.valueOf(r19)
            java.lang.Boolean r13 = java.lang.Boolean.valueOf(r20)
            java.lang.Object[] r4 = new java.lang.Object[]{r4, r10, r11, r12, r13}
            java.lang.String r10 = "sendKeycode"
            java.lang.Object[] r3 = new java.lang.Object[]{r10, r3, r4}
            r2[r5] = r3
            java.lang.Class[] r3 = new java.lang.Class[r1]
            java.lang.Class r4 = java.lang.Integer.TYPE
            r3[r5] = r4
            java.lang.Class r4 = java.lang.Character.TYPE
            r3[r6] = r4
            java.lang.Class r4 = java.lang.Integer.TYPE
            r3[r7] = r4
            java.lang.Class r4 = java.lang.Integer.TYPE
            r3[r8] = r4
            java.lang.Class r4 = java.lang.Boolean.TYPE
            r3[r9] = r4
            java.lang.Integer r4 = java.lang.Integer.valueOf(r15)
            java.lang.Character r11 = java.lang.Character.valueOf(r17)
            java.lang.Integer r12 = java.lang.Integer.valueOf(r18)
            java.lang.Integer r13 = java.lang.Integer.valueOf(r19)
            java.lang.Boolean r14 = java.lang.Boolean.valueOf(r20)
            java.lang.Object[] r4 = new java.lang.Object[]{r4, r11, r12, r13, r14}
            java.lang.Object[] r3 = new java.lang.Object[]{r10, r3, r4}
            r2[r6] = r3
            java.lang.Class[] r3 = new java.lang.Class[r1]
            java.lang.Class r4 = java.lang.Integer.TYPE
            r3[r5] = r4
            java.lang.Class r4 = java.lang.Character.TYPE
            r3[r6] = r4
            java.lang.Class r4 = java.lang.Integer.TYPE
            r3[r7] = r4
            java.lang.Class r4 = java.lang.Integer.TYPE
            r3[r8] = r4
            java.lang.Class r4 = java.lang.Boolean.TYPE
            r3[r9] = r4
            java.lang.Integer r4 = java.lang.Integer.valueOf(r16)
            java.lang.Character r11 = java.lang.Character.valueOf(r17)
            java.lang.Integer r12 = java.lang.Integer.valueOf(r18)
            java.lang.Integer r13 = java.lang.Integer.valueOf(r19)
            java.lang.Boolean r14 = java.lang.Boolean.valueOf(r20)
            java.lang.Object[] r4 = new java.lang.Object[]{r4, r11, r12, r13, r14}
            java.lang.String r11 = "sendKeyCode"
            java.lang.Object[] r3 = new java.lang.Object[]{r11, r3, r4}
            r2[r7] = r3
            java.lang.Class[] r3 = new java.lang.Class[r1]
            java.lang.Class r4 = java.lang.Integer.TYPE
            r3[r5] = r4
            java.lang.Class r4 = java.lang.Character.TYPE
            r3[r6] = r4
            java.lang.Class r4 = java.lang.Integer.TYPE
            r3[r7] = r4
            java.lang.Class r4 = java.lang.Integer.TYPE
            r3[r8] = r4
            java.lang.Class r4 = java.lang.Boolean.TYPE
            r3[r9] = r4
            java.lang.Integer r4 = java.lang.Integer.valueOf(r16)
            java.lang.Character r11 = java.lang.Character.valueOf(r17)
            java.lang.Integer r12 = java.lang.Integer.valueOf(r18)
            java.lang.Integer r13 = java.lang.Integer.valueOf(r19)
            java.lang.Boolean r14 = java.lang.Boolean.valueOf(r20)
            java.lang.Object[] r4 = new java.lang.Object[]{r4, r11, r12, r13, r14}
            java.lang.String r11 = "putKeyboardEvent"
            java.lang.Object[] r3 = new java.lang.Object[]{r11, r3, r4}
            r2[r8] = r3
            java.lang.Class[] r3 = new java.lang.Class[r8]
            java.lang.Class r4 = java.lang.Integer.TYPE
            r3[r5] = r4
            java.lang.Class r4 = java.lang.Integer.TYPE
            r3[r6] = r4
            java.lang.Class r4 = java.lang.Boolean.TYPE
            r3[r7] = r4
            java.lang.Integer r4 = java.lang.Integer.valueOf(r16)
            java.lang.Integer r8 = java.lang.Integer.valueOf(r19)
            java.lang.Boolean r11 = java.lang.Boolean.valueOf(r20)
            java.lang.Object[] r4 = new java.lang.Object[]{r4, r8, r11}
            java.lang.Object[] r3 = new java.lang.Object[]{r10, r3, r4}
            r2[r9] = r3
            r3 = r5
        L105:
            if (r3 >= r1) goto L121
            r4 = r2[r3]
            r8 = r4[r5]     // Catch: java.lang.Throwable -> L11e
            java.lang.String r8 = (java.lang.String) r8     // Catch: java.lang.Throwable -> L11e
            r9 = r4[r6]     // Catch: java.lang.Throwable -> L11e
            java.lang.Class[] r9 = (java.lang.Class[]) r9     // Catch: java.lang.Throwable -> L11e
            java.lang.reflect.Method r8 = r0.getMethod(r8, r9)     // Catch: java.lang.Throwable -> L11e
            r4 = r4[r7]     // Catch: java.lang.Throwable -> L11e
            java.lang.Object[] r4 = (java.lang.Object[]) r4     // Catch: java.lang.Throwable -> L11e
            r9 = 0
            r8.invoke(r9, r4)     // Catch: java.lang.Throwable -> L11e
            return r6
        L11e:
            int r3 = r3 + 1
            goto L105
        L121:
            return r5
    }

    private boolean sendPrimaryMouseDownIfNeeded(android.view.MotionEvent r4) {
            r3 = this;
            int r0 = r4.getButtonState()
            r1 = 1
            r0 = r0 & r1
            r2 = 0
            if (r0 != 0) goto L11
            int r4 = r4.getActionMasked()
            if (r4 != 0) goto L10
            goto L11
        L10:
            return r2
        L11:
            boolean r4 = r3.sendHardwareMouseButtonTracked(r2, r1)
            return r4
    }

    private void sendRelativeCursor(float r1, float r2) {
            r0 = this;
            r0.sendScaledRelativeCursor(r1, r2)
            return
    }

    private void sendRelativeCursorInternal(float r2, float r3) {
            r1 = this;
            boolean r0 = r1.shouldSuppressRelativeCursor()
            if (r0 == 0) goto L7
            return
        L7:
            r0 = 1
            org.lwjgl.glfw.CallbackBridge.setInputReady(r0)
            float r0 = org.lwjgl.glfw.CallbackBridge.mouseX
            float r0 = r0 + r2
            org.lwjgl.glfw.CallbackBridge.mouseX = r0
            float r2 = org.lwjgl.glfw.CallbackBridge.mouseY
            float r2 = r2 + r3
            org.lwjgl.glfw.CallbackBridge.mouseY = r2
            float r2 = org.lwjgl.glfw.CallbackBridge.mouseX
            float r3 = org.lwjgl.glfw.CallbackBridge.mouseY
            org.lwjgl.glfw.CallbackBridge.sendCursorPos(r2, r3)
            return
    }

    private void sendScaledRelativeCursor(float r1, float r2) {
            r0 = this;
            float r1 = r0.scaleDeltaX(r1)
            float r2 = r0.scaleDeltaY(r2)
            r0.sendRelativeCursorInternal(r1, r2)
            return
    }

    private void sendTapClickAt(float r2, float r3) {
            r1 = this;
            r0 = 1
            org.lwjgl.glfw.CallbackBridge.setInputReady(r0)
            float r2 = r1.mapViewXToCursorX(r2)
            float r3 = r1.mapViewYToCursorY(r3)
            r0 = 0
            org.lwjgl.glfw.CallbackBridge.putMouseEventWithCoords(r0, r2, r3)
            return
    }

    private void sendUnscaledRelativeCursor(float r1, float r2) {
            r0 = this;
            r0.sendRelativeCursorInternal(r1, r2)
            return
    }

    private void sendUseTap() {
            r2 = this;
            r0 = 1
            sendMouseButton(r0, r0)
            r1 = 0
            sendMouseButton(r0, r1)
            return
    }

    private void sendWindowSizeIfChanged(net.kdt.pojavlaunch.MinecraftGLSurface.RenderSize r5, java.lang.String r6) {
            r4 = this;
            int r0 = r5.renderWidth
            r1 = 1
            int r0 = java.lang.Math.max(r1, r0)
            int r2 = r5.renderHeight
            int r1 = java.lang.Math.max(r1, r2)
            int r2 = r4.lastSentWindowWidth
            if (r0 != r2) goto L16
            int r2 = r4.lastSentWindowHeight
            if (r1 != r2) goto L16
            return
        L16:
            r4.lastSentWindowWidth = r0
            r4.lastSentWindowHeight = r1
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "sendWindowSize reason="
            r2.<init>(r3)
            java.lang.StringBuilder r6 = r2.append(r6)
            java.lang.String r2 = " view="
            java.lang.StringBuilder r6 = r6.append(r2)
            int r2 = r5.viewWidth
            java.lang.StringBuilder r6 = r6.append(r2)
            java.lang.String r2 = "x"
            java.lang.StringBuilder r6 = r6.append(r2)
            int r5 = r5.viewHeight
            java.lang.StringBuilder r5 = r6.append(r5)
            java.lang.String r6 = " render="
            java.lang.StringBuilder r5 = r5.append(r6)
            java.lang.StringBuilder r5 = r5.append(r0)
            java.lang.StringBuilder r5 = r5.append(r2)
            java.lang.StringBuilder r5 = r5.append(r1)
            java.lang.String r6 = " scale="
            java.lang.StringBuilder r5 = r5.append(r6)
            android.content.Context r6 = r4.getContext()
            int r6 = ca.dnamobile.javalauncher.settings.LauncherPreferences.getGameResolutionScalePercent(r6)
            int r6 = r4.clampResolutionScalePercent(r6)
            java.lang.StringBuilder r5 = r5.append(r6)
            java.lang.String r6 = "%"
            java.lang.StringBuilder r5 = r5.append(r6)
            java.lang.String r5 = r5.toString()
            java.lang.String r6 = "ResolutionScale"
            android.util.Log.i(r6, r5)
            org.lwjgl.glfw.CallbackBridge.sendUpdateWindowSize(r0, r1)
            return
    }

    private boolean shouldForceDirectFreedrenoNativeSurface() {
            r2 = this;
            java.lang.String r0 = "DROIDBRIDGE_DIRECT_FREEDRENO_NATIVE_SURFACE_V69"
            java.lang.String r1 = "1"
            boolean r0 = envEquals(r0, r1)
            if (r0 == 0) goto L14
            java.lang.String r0 = "DROIDBRIDGE_DIRECT_FREEDRENO_TEXTUREVIEW_V70"
            boolean r0 = envEquals(r0, r1)
            if (r0 != 0) goto L14
            r0 = 1
            goto L15
        L14:
            r0 = 0
        L15:
            return r0
    }

    private boolean shouldForceDirectFreedrenoOpaqueRgbx8888() {
            r2 = this;
            java.lang.String r0 = "DROIDBRIDGE_DIRECT_FREEDRENO_OPAQUE_RGBX8888"
            java.lang.String r1 = "1"
            boolean r0 = envEquals(r0, r1)
            if (r0 != 0) goto L15
            java.lang.String r0 = "DROIDBRIDGE_EGL_FORCE_RGBX8888"
            boolean r0 = envEquals(r0, r1)
            if (r0 == 0) goto L13
            goto L15
        L13:
            r0 = 0
            goto L16
        L15:
            r0 = 1
        L16:
            return r0
    }

    private boolean shouldForceZinkNativeSurfaceRgba8888() {
            r3 = this;
            boolean r0 = ca.dnamobile.javalauncher.renderer.DroidBridgeMesaSupport.shouldForceNativeSurfaceRgba8888()
            r1 = 1
            if (r0 == 0) goto L8
            return r1
        L8:
            java.lang.String r0 = "POJAV_RENDERER"
            java.lang.String r2 = "vulkan_zink"
            boolean r0 = envContains(r0, r2)
            if (r0 != 0) goto L40
            java.lang.String r0 = "LIB_MESA_NAME"
            java.lang.String r2 = "libosmesa_8.so"
            boolean r0 = envContains(r0, r2)
            if (r0 != 0) goto L40
            java.lang.String r0 = "POJAVEXEC_EGL"
            boolean r0 = envContains(r0, r2)
            if (r0 != 0) goto L40
            java.lang.String r0 = "DROIDBRIDGE_ADRENO740_SURFACE_RGBA8888"
            java.lang.String r2 = "1"
            boolean r0 = envEquals(r0, r2)
            if (r0 != 0) goto L40
            java.lang.String r0 = "DROIDBRIDGE_ZINK_V57_FORCE_OSMESA_EGL"
            boolean r0 = envEquals(r0, r2)
            if (r0 != 0) goto L40
            java.lang.String r0 = "DROIDBRIDGE_FREEDRENO_V57_PURE_ZINK_ALIAS"
            boolean r0 = envEquals(r0, r2)
            if (r0 == 0) goto L3f
            goto L40
        L3f:
            r1 = 0
        L40:
            return r1
    }

    public static boolean shouldRouteBackKeyToMinecraft(android.view.KeyEvent r1) {
            if (r1 == 0) goto Lc
            int r1 = r1.getKeyCode()
            r0 = 111(0x6f, float:1.56E-43)
            if (r1 != r0) goto Lc
            r1 = 1
            goto Ld
        Lc:
            r1 = 0
        Ld:
            return r1
    }

    private boolean shouldSuppressRelativeCursor() {
            r4 = this;
            long r0 = r4.suppressRelativeCursorUntilNanos
            boolean r2 = r4.grabbed
            if (r2 == 0) goto L16
            r2 = 0
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 <= 0) goto L16
            long r2 = java.lang.System.nanoTime()
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 >= 0) goto L16
            r0 = 1
            goto L17
        L16:
            r0 = 0
        L17:
            return r0
    }

    private boolean shouldUsePointerCapture() {
            r1 = this;
            boolean r0 = r1.hasRecentlySeenHardwarePointer()
            if (r0 != 0) goto Lf
            boolean r0 = hasRealExternalPointerDevice()
            if (r0 == 0) goto Ld
            goto Lf
        Ld:
            r0 = 0
            goto L10
        Lf:
            r0 = 1
        L10:
            return r0
    }

    private void startNativeSurfaceView(boolean r4) {
            r3 = this;
            android.view.SurfaceView r0 = new android.view.SurfaceView
            android.content.Context r1 = r3.getContext()
            r0.<init>(r1)
            r3.nativeSurfaceView = r0
            r3.renderView = r0
            boolean r0 = r3.shouldForceDirectFreedrenoOpaqueRgbx8888()     // Catch: java.lang.Throwable -> L3a
            java.lang.String r1 = "ResolutionScale"
            if (r0 == 0) goto L25
            android.view.SurfaceView r0 = r3.nativeSurfaceView     // Catch: java.lang.Throwable -> L3a
            android.view.SurfaceHolder r0 = r0.getHolder()     // Catch: java.lang.Throwable -> L3a
            r2 = 2
            r0.setFormat(r2)     // Catch: java.lang.Throwable -> L3a
            java.lang.String r0 = "v69 SurfaceView holder format forced to RGBX_8888/opaque by explicit debug flag"
            android.util.Log.i(r1, r0)     // Catch: java.lang.Throwable -> L3a
            goto L3a
        L25:
            boolean r0 = r3.shouldForceZinkNativeSurfaceRgba8888()     // Catch: java.lang.Throwable -> L3a
            if (r0 == 0) goto L3a
            android.view.SurfaceView r0 = r3.nativeSurfaceView     // Catch: java.lang.Throwable -> L3a
            android.view.SurfaceHolder r0 = r0.getHolder()     // Catch: java.lang.Throwable -> L3a
            r2 = 1
            r0.setFormat(r2)     // Catch: java.lang.Throwable -> L3a
            java.lang.String r0 = "v59 SurfaceView holder format forced to RGBA_8888 for Vulkan Zink / legacy Freedreno alias"
            android.util.Log.i(r1, r0)     // Catch: java.lang.Throwable -> L3a
        L3a:
            android.view.SurfaceView r0 = r3.nativeSurfaceView
            r1 = 0
            r0.setFocusable(r1)
            android.view.SurfaceView r0 = r3.nativeSurfaceView
            r0.setZOrderOnTop(r1)
            android.view.SurfaceView r0 = r3.nativeSurfaceView
            r0.setZOrderMediaOverlay(r1)
            android.view.SurfaceView r0 = r3.nativeSurfaceView
            android.view.SurfaceHolder r0 = r0.getHolder()
            net.kdt.pojavlaunch.MinecraftGLSurface$2 r1 = new net.kdt.pojavlaunch.MinecraftGLSurface$2
            r1.<init>(r3, r4)
            r0.addCallback(r1)
            android.view.SurfaceView r4 = r3.nativeSurfaceView
            r3.addRenderView(r4)
            return
    }

    private void startTextureView(boolean r3) {
            r2 = this;
            android.view.TextureView r0 = new android.view.TextureView
            android.content.Context r1 = r2.getContext()
            r0.<init>(r1)
            r2.textureView = r0
            r2.renderView = r0
            r1 = 1
            r0.setOpaque(r1)
            android.view.TextureView r0 = r2.textureView
            r1 = 1065353216(0x3f800000, float:1.0)
            r0.setAlpha(r1)
            android.view.TextureView r0 = r2.textureView
            r1 = 0
            r0.setFocusable(r1)
            android.view.TextureView r0 = r2.textureView
            net.kdt.pojavlaunch.MinecraftGLSurface$1 r1 = new net.kdt.pojavlaunch.MinecraftGLSurface$1
            r1.<init>(r2, r3)
            r0.setSurfaceTextureListener(r1)
            android.view.TextureView r3 = r2.textureView
            r2.addRenderView(r3)
            return
    }

    private static float sumCapturedPointerCoordinate(android.view.MotionEvent r4, int r5, boolean r6) {
            int r5 = safePointerIndex(r4, r5)
            int r0 = r4.getHistorySize()
            r1 = 0
            r2 = 0
        La:
            if (r2 >= r0) goto L28
            if (r6 == 0) goto L13
            float r3 = r4.getHistoricalX(r5, r2)     // Catch: java.lang.Throwable -> L19
            goto L17
        L13:
            float r3 = r4.getHistoricalY(r5, r2)     // Catch: java.lang.Throwable -> L19
        L17:
            float r1 = r1 + r3
            goto L25
        L19:
            if (r6 == 0) goto L20
            float r3 = r4.getHistoricalX(r2)
            goto L17
        L20:
            float r3 = r4.getHistoricalY(r2)
            goto L17
        L25:
            int r2 = r2 + 1
            goto La
        L28:
            if (r6 == 0) goto L2f
            float r4 = safeEventX(r4, r5)
            goto L33
        L2f:
            float r4 = safeEventY(r4, r5)
        L33:
            float r1 = r1 + r4
            return r1
    }

    private static float sumRelativeAxis(android.view.MotionEvent r4, int r5, int r6) {
            int r6 = safePointerIndex(r4, r6)
            int r0 = r4.getHistorySize()
            r1 = 0
            r2 = 0
        La:
            if (r2 >= r0) goto L1a
            float r3 = r4.getHistoricalAxisValue(r5, r6, r2)     // Catch: java.lang.Throwable -> L12
        L10:
            float r1 = r1 + r3
            goto L17
        L12:
            float r3 = r4.getHistoricalAxisValue(r5, r2)
            goto L10
        L17:
            int r2 = r2 + 1
            goto La
        L1a:
            float r4 = r4.getAxisValue(r5, r6)     // Catch: java.lang.Throwable -> L20
        L1e:
            float r1 = r1 + r4
            goto L25
        L20:
            float r4 = r4.getAxisValue(r5)
            goto L1e
        L25:
            return r1
    }

    private void updateHardwareMousePositionIfUsable(android.view.MotionEvent r2, float r3, float r4) {
            r1 = this;
            boolean r0 = isFiniteCoordinate(r3)
            if (r0 == 0) goto L1b
            boolean r0 = isFiniteCoordinate(r4)
            if (r0 != 0) goto Ld
            goto L1b
        Ld:
            boolean r2 = r1.isSuspiciousHardwareTopLeftCoordinate(r2, r3, r4)
            if (r2 == 0) goto L14
            return
        L14:
            r1.lastHardwareMouseX = r3
            r1.lastHardwareMouseY = r4
            r2 = 1
            r1.hasLastHardwareMousePosition = r2
        L1b:
            return
    }

    private net.kdt.pojavlaunch.MinecraftGLSurface.RenderSize updateScaledSizeFromView(int r10, int r11) {
            r9 = this;
            int r10 = r9.safeWidth(r10)
            int r11 = r9.safeHeight(r11)
            android.content.Context r0 = r9.getContext()
            int r0 = ca.dnamobile.javalauncher.settings.LauncherPreferences.getGameResolutionScalePercent(r0)
            int r3 = r9.clampResolutionScalePercent(r0)
            float r0 = (float) r10
            float r1 = (float) r3
            r2 = 1120403456(0x42c80000, float:100.0)
            float r1 = r1 / r2
            float r0 = r0 * r1
            int r0 = java.lang.Math.round(r0)
            r6 = 1
            int r7 = java.lang.Math.max(r6, r0)
            float r0 = (float) r11
            float r0 = r0 * r1
            int r0 = java.lang.Math.round(r0)
            int r8 = java.lang.Math.max(r6, r0)
            r0 = r9
            r1 = r10
            r2 = r11
            r4 = r7
            r5 = r8
            r0.logResolutionScaleIfChanged(r1, r2, r3, r4, r5)
            r9.viewWidth = r10
            r9.viewHeight = r11
            r9.renderWidth = r7
            r9.renderHeight = r8
            float r11 = (float) r7
            int r10 = java.lang.Math.max(r6, r10)
            float r10 = (float) r10
            float r11 = r11 / r10
            r9.inputScaleX = r11
            int r10 = r9.renderHeight
            float r10 = (float) r10
            int r11 = r9.viewHeight
            int r11 = java.lang.Math.max(r6, r11)
            float r11 = (float) r11
            float r10 = r10 / r11
            r9.inputScaleY = r10
            net.kdt.pojavlaunch.MinecraftGLSurface$RenderSize r10 = new net.kdt.pojavlaunch.MinecraftGLSurface$RenderSize
            int r11 = r9.viewWidth
            int r0 = r9.viewHeight
            int r1 = r9.renderWidth
            int r2 = r9.renderHeight
            r10.<init>(r11, r0, r1, r2)
            r9.updateSizeFields(r10)
            return r10
    }

    private void updateSizeFields(net.kdt.pojavlaunch.MinecraftGLSurface.RenderSize r3) {
            r2 = this;
            int r0 = r3.renderWidth
            r1 = 1
            int r0 = java.lang.Math.max(r1, r0)
            org.lwjgl.glfw.CallbackBridge.windowWidth = r0
            int r3 = r3.renderHeight
            int r3 = java.lang.Math.max(r1, r3)
            org.lwjgl.glfw.CallbackBridge.windowHeight = r3
            int r3 = org.lwjgl.glfw.CallbackBridge.windowWidth
            org.lwjgl.glfw.CallbackBridge.physicalWidth = r3
            int r3 = org.lwjgl.glfw.CallbackBridge.windowHeight
            org.lwjgl.glfw.CallbackBridge.physicalHeight = r3
            return
    }

    @Override // android.view.View
    public boolean dispatchGenericMotionEvent(android.view.MotionEvent r7) {
            r6 = this;
            boolean r0 = isGamepadMotionEvent(r7)
            r1 = 1
            if (r0 == 0) goto L17
            boolean r0 = net.kdt.pojavlaunch.MinecraftGLSurface.sdlEnabled
            if (r0 == 0) goto L12
            boolean r0 = org.libsdl.app.SDLControllerManager.handleJoystickMotionEvent(r7)
            if (r0 == 0) goto L12
            return r1
        L12:
            boolean r7 = super.dispatchGenericMotionEvent(r7)
            return r7
        L17:
            int r0 = findMousePointerIndex(r7)
            if (r0 >= 0) goto L22
            boolean r7 = super.dispatchGenericMotionEvent(r7)
            return r7
        L22:
            r6.requestFocusIfNeeded()
            r6.markHardwarePointerInputMode()
            int r2 = r7.getActionMasked()
            r3 = 2
            r4 = 0
            if (r2 == r3) goto L94
            r3 = 7
            if (r2 == r3) goto L94
            r3 = 8
            if (r2 == r3) goto L82
            r3 = 11
            if (r2 == r3) goto L63
            r1 = 12
            if (r2 == r1) goto L44
            boolean r7 = super.dispatchGenericMotionEvent(r7)
            return r7
        L44:
            boolean r1 = r6.grabbed
            if (r1 != 0) goto L53
            float r1 = safeEventX(r7, r0)
            float r2 = safeEventY(r7, r0)
            r6.sendHardwareAbsoluteCursor(r7, r1, r2)
        L53:
            float r1 = safeEventX(r7, r0)
            float r2 = safeEventY(r7, r0)
            r6.updateHardwareMousePositionIfUsable(r7, r1, r2)
            boolean r7 = r6.sendMouseButtonUnconvertedTracked(r7, r4, r0)
            return r7
        L63:
            boolean r2 = r6.grabbed
            if (r2 != 0) goto L72
            float r2 = safeEventX(r7, r0)
            float r3 = safeEventY(r7, r0)
            r6.sendHardwareAbsoluteCursor(r7, r2, r3)
        L72:
            float r2 = safeEventX(r7, r0)
            float r3 = safeEventY(r7, r0)
            r6.updateHardwareMousePositionIfUsable(r7, r2, r3)
            boolean r7 = r6.sendMouseButtonUnconvertedTracked(r7, r1, r0)
            return r7
        L82:
            r0 = 10
            float r0 = r7.getAxisValue(r0)
            double r2 = (double) r0
            r0 = 9
            float r7 = r7.getAxisValue(r0)
            double r4 = (double) r7
            org.lwjgl.glfw.CallbackBridge.sendScroll(r2, r4)
            return r1
        L94:
            float r2 = safeEventX(r7, r0)
            float r3 = safeEventY(r7, r0)
            boolean r5 = r6.grabbed
            if (r5 == 0) goto Lcb
            net.kdt.pojavlaunch.MinecraftGLSurface$RelativeMouseDelta r0 = collectRelativeMouseDelta(r7, r0, r4)
            float r4 = r0.dx
            float r5 = r0.dy
            boolean r0 = r0.hasMovement
            if (r0 != 0) goto Lc4
            boolean r0 = r6.hasLastHardwareMousePosition
            if (r0 == 0) goto Lc0
            boolean r0 = r6.isUsableHardwareAbsoluteCoordinate(r7, r2, r3)
            if (r0 != 0) goto Lb7
            goto Lc0
        Lb7:
            float r0 = r6.lastHardwareMouseX
            float r4 = r2 - r0
            float r0 = r6.lastHardwareMouseY
            float r5 = r3 - r0
            goto Lc4
        Lc0:
            r6.updateHardwareMousePositionIfUsable(r7, r2, r3)
            return r1
        Lc4:
            r6.sendHardwareRelativeCursor(r4, r5)
            r6.updateHardwareMousePositionIfUsable(r7, r2, r3)
            goto Ld1
        Lcb:
            r6.sendHardwareAbsoluteCursor(r7, r2, r3)
            r6.updateHardwareMousePositionIfUsable(r7, r2, r3)
        Ld1:
            return r1
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(android.view.KeyEvent r2) {
            r1 = this;
            boolean r0 = r1.handlePhysicalKeyboardEvent(r2)
            if (r0 == 0) goto L8
            r2 = 1
            return r2
        L8:
            boolean r2 = super.dispatchKeyEvent(r2)
            return r2
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(android.view.MotionEvent r2) {
            r1 = this;
            boolean r0 = isHardwareMouseLikeEvent(r2)
            if (r0 == 0) goto Le
            boolean r0 = r1.handleHardwareMouseTouchEvent(r2)
            if (r0 == 0) goto Le
            r2 = 1
            return r2
        Le:
            boolean r2 = super.dispatchTouchEvent(r2)
            return r2
    }

    public boolean handleKeyEventFromActivity(android.view.KeyEvent r1) {
            r0 = this;
            boolean r1 = r0.handlePhysicalKeyboardEvent(r1)
            return r1
    }

    public boolean handleTouchFromOverlay(android.view.MotionEvent r1) {
            r0 = this;
            boolean r1 = r0.handleTouchEventInternal(r1)
            return r1
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
            r1 = this;
            super.onAttachedToWindow()
            boolean r0 = r1.grabbed
            if (r0 == 0) goto L10
            boolean r0 = r1.shouldUsePointerCapture()
            if (r0 == 0) goto L10
            r1.safeRequestPointerCapture()
        L10:
            return
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
            r1 = this;
            r0 = 1
            r1.cancelTouchLongPressAttack(r0)
            r1.releaseActiveHardwareInput()
            r1.safeReleasePointerCapture()
            org.lwjgl.glfw.CallbackBridge.removeGrabListener(r1)
            r0 = 0
            r1.bridgeWindowAttached = r0
            net.kdt.pojavlaunch.utils.JREUtils.releaseBridgeWindow()
            r1.resetSentWindowSize()
            r1.releaseTextureSurface()
            super.onDetachedFromWindow()
            return
    }

    @Override // android.view.View
    public boolean onGenericMotionEvent(android.view.MotionEvent r3) {
            r2 = this;
            boolean r0 = net.kdt.pojavlaunch.MinecraftGLSurface.sdlEnabled
            if (r0 == 0) goto L16
            int r0 = r3.getSource()
            r1 = 16777232(0x1000010, float:2.3509932E-38)
            r0 = r0 & r1
            if (r0 != r1) goto L16
            boolean r0 = org.libsdl.app.SDLControllerManager.handleJoystickMotionEvent(r3)
            if (r0 == 0) goto L16
            r3 = 1
            return r3
        L16:
            boolean r3 = super.onGenericMotionEvent(r3)
            return r3
    }

    @Override // net.kdt.pojavlaunch.GrabListener
    public void onGrabState(boolean r2) {
            r1 = this;
            r1.grabbed = r2
            net.kdt.pojavlaunch.MinecraftGLSurface$$ExternalSyntheticLambda11 r0 = new net.kdt.pojavlaunch.MinecraftGLSurface$$ExternalSyntheticLambda11
            r0.<init>(r1, r2)
            r1.post(r0)
            return
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyDown(int r3, android.view.KeyEvent r4) {
            r2 = this;
            int r0 = r4.getDeviceId()
            boolean r1 = net.kdt.pojavlaunch.MinecraftGLSurface.sdlEnabled
            if (r1 == 0) goto L16
            boolean r1 = org.libsdl.app.SDLControllerManager.isDeviceSDLJoystick(r0)
            if (r1 == 0) goto L16
            boolean r0 = org.libsdl.app.SDLControllerManager.onNativePadDown(r0, r3)
            if (r0 == 0) goto L16
            r3 = 1
            return r3
        L16:
            boolean r3 = super.onKeyDown(r3, r4)
            return r3
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyUp(int r3, android.view.KeyEvent r4) {
            r2 = this;
            int r0 = r4.getDeviceId()
            boolean r1 = net.kdt.pojavlaunch.MinecraftGLSurface.sdlEnabled
            if (r1 == 0) goto L16
            boolean r1 = org.libsdl.app.SDLControllerManager.isDeviceSDLJoystick(r0)
            if (r1 == 0) goto L16
            boolean r0 = org.libsdl.app.SDLControllerManager.onNativePadUp(r0, r3)
            if (r0 == 0) goto L16
            r3 = 1
            return r3
        L16:
            boolean r3 = super.onKeyUp(r3, r4)
            return r3
    }

    @Override // android.view.View
    protected void onSizeChanged(int r1, int r2, int r3, int r4) {
            r0 = this;
            super.onSizeChanged(r1, r2, r3, r4)
            if (r1 <= 0) goto L29
            if (r2 > 0) goto L8
            goto L29
        L8:
            if (r1 != r3) goto Ld
            if (r2 != r4) goto Ld
            return
        Ld:
            net.kdt.pojavlaunch.MinecraftGLSurface$$ExternalSyntheticLambda0 r1 = new net.kdt.pojavlaunch.MinecraftGLSurface$$ExternalSyntheticLambda0
            r1.<init>(r0)
            r0.post(r1)
            net.kdt.pojavlaunch.MinecraftGLSurface$$ExternalSyntheticLambda0 r1 = new net.kdt.pojavlaunch.MinecraftGLSurface$$ExternalSyntheticLambda0
            r1.<init>(r0)
            r2 = 120(0x78, double:5.93E-322)
            r0.postDelayed(r1, r2)
            net.kdt.pojavlaunch.MinecraftGLSurface$$ExternalSyntheticLambda0 r1 = new net.kdt.pojavlaunch.MinecraftGLSurface$$ExternalSyntheticLambda0
            r1.<init>(r0)
            r2 = 350(0x15e, double:1.73E-321)
            r0.postDelayed(r1, r2)
        L29:
            return
    }

    @Override // android.view.View
    public boolean onTouchEvent(android.view.MotionEvent r1) {
            r0 = this;
            boolean r1 = r0.handleTouchEventInternal(r1)
            return r1
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean r2) {
            r1 = this;
            super.onWindowFocusChanged(r2)
            if (r2 == 0) goto L13
            boolean r0 = r1.grabbed
            if (r0 == 0) goto L13
            boolean r0 = r1.shouldUsePointerCapture()
            if (r0 == 0) goto L13
            r1.safeRequestPointerCapture()
            goto L1e
        L13:
            if (r2 == 0) goto L1b
            boolean r2 = r1.shouldUsePointerCapture()
            if (r2 != 0) goto L1e
        L1b:
            r1.safeReleasePointerCapture()
        L1e:
            return
    }

    public void refreshSize() {
            r2 = this;
            r0 = 0
            java.lang.String r1 = "refreshSize"
            r2.refreshSize(r0, r1)
            return
    }

    public void setOnRenderingStartedListener(net.kdt.pojavlaunch.MinecraftGLSurface.OnRenderingStartedListener r1) {
            r0 = this;
            r0.renderingStartedListener = r1
            return
    }

    public void setSurfaceReadyListener(net.kdt.pojavlaunch.MinecraftGLSurface.SurfaceReadyListener r1) {
            r0 = this;
            r0.surfaceReadyListener = r1
            return
    }

    public void start(boolean r5) {
            r4 = this;
            android.view.View r0 = r4.renderView
            if (r0 == 0) goto L5
            return
        L5:
            r0 = 0
            r4.renderingStarted = r0
            android.content.Context r0 = r4.getContext()
            boolean r0 = ca.dnamobile.javalauncher.settings.LauncherPreferences.isUseNativeSurfaceView(r0)
            boolean r1 = r4.shouldForceDirectFreedrenoOpaqueRgbx8888()
            r2 = 1
            java.lang.String r3 = "ResolutionScale"
            if (r1 == 0) goto L20
            java.lang.String r0 = "v69 forcing native SurfaceView RGBX_8888/opaque for explicit direct Freedreno debug flag"
            android.util.Log.i(r3, r0)
        L1e:
            r0 = r2
            goto L38
        L20:
            boolean r1 = r4.shouldForceDirectFreedrenoNativeSurface()
            if (r1 == 0) goto L2c
            java.lang.String r0 = "v69 forcing native SurfaceView for direct Freedreno Mojo KGSL path without forcing holder pixel format"
            android.util.Log.i(r3, r0)
            goto L1e
        L2c:
            boolean r1 = r4.shouldForceZinkNativeSurfaceRgba8888()
            if (r1 == 0) goto L38
            java.lang.String r0 = "v59 forcing native SurfaceView RGBA_8888 for Vulkan Zink / legacy Freedreno alias"
            android.util.Log.i(r3, r0)
            goto L1e
        L38:
            if (r0 == 0) goto L3e
            r4.startNativeSurfaceView(r5)
            goto L50
        L3e:
            java.lang.String r0 = "DROIDBRIDGE_DIRECT_FREEDRENO_TEXTUREVIEW_V70"
            java.lang.String r1 = "1"
            boolean r0 = envEquals(r0, r1)
            if (r0 == 0) goto L4d
            java.lang.String r0 = "v70 using TextureView path for direct Freedreno Mojo KGSL visual test"
            android.util.Log.i(r3, r0)
        L4d:
            r4.startTextureView(r5)
        L50:
            return
    }
}
