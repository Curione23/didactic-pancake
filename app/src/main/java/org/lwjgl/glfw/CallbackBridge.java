package org.lwjgl.glfw;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/glfw/CallbackBridge.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/glfw/CallbackBridge.class
  classes2.dex
 */
/* JADX INFO: loaded from: classes2.dex */
public class CallbackBridge {
    public static final int CLIPBOARD_COPY = 2000;
    public static final int CLIPBOARD_OPEN = 2002;
    public static final int CLIPBOARD_PASTE = 2001;
    private static final java.util.ArrayList<net.kdt.pojavlaunch.GrabListener> grabListeners = null;
    public static volatile boolean holdingAlt;
    public static volatile boolean holdingCapslock;
    public static volatile boolean holdingCtrl;
    public static volatile boolean holdingNumlock;
    public static volatile boolean holdingShift;
    private static boolean isGrabbing;
    public static float mouseX;
    public static float mouseY;
    public static volatile int physicalHeight;
    public static volatile int physicalWidth;
    private static android.content.Context sAppContext;
    public static final android.view.Choreographer sChoreographer = null;
    private static android.content.ClipboardManager sClipboard;
    private static java.lang.ref.WeakReference<java.lang.Object> sDirectGamepadEnableHandler;
    public static boolean sGamepadDirectInput;
    private static volatile boolean sInputReady;
    private static volatile boolean sUseInputStackQueue;
    public static volatile int windowHeight;
    public static volatile int windowWidth;

    static {
            android.view.Choreographer r0 = android.view.Choreographer.getInstance()
            org.lwjgl.glfw.CallbackBridge.sChoreographer = r0
            r0 = 0
            org.lwjgl.glfw.CallbackBridge.isGrabbing = r0
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            org.lwjgl.glfw.CallbackBridge.grabListeners = r1
            org.lwjgl.glfw.CallbackBridge.sGamepadDirectInput = r0
            java.lang.String r0 = "pojavexec"
            java.lang.System.loadLibrary(r0)
            return
    }

    public CallbackBridge() {
            r0 = this;
            r0.<init>()
            return
    }

    public static java.lang.String accessAndroidClipboard(int r2, java.lang.String r3) {
            r0 = 0
            switch(r2) {
                case 2000: goto L75;
                case 2001: goto L34;
                case 2002: goto L5;
                default: goto L4;
            }
        L4:
            return r0
        L5:
            android.content.Context r2 = org.lwjgl.glfw.CallbackBridge.sAppContext
            if (r2 == 0) goto L33
            if (r3 == 0) goto L33
            java.lang.String r2 = r3.trim()
            int r2 = r2.length()
            if (r2 <= 0) goto L33
            android.content.Intent r2 = new android.content.Intent     // Catch: java.lang.Throwable -> L2b
            java.lang.String r1 = "android.intent.action.VIEW"
            android.net.Uri r3 = android.net.Uri.parse(r3)     // Catch: java.lang.Throwable -> L2b
            r2.<init>(r1, r3)     // Catch: java.lang.Throwable -> L2b
            r3 = 268435456(0x10000000, float:2.524355E-29)
            r2.addFlags(r3)     // Catch: java.lang.Throwable -> L2b
            android.content.Context r3 = org.lwjgl.glfw.CallbackBridge.sAppContext     // Catch: java.lang.Throwable -> L2b
            r3.startActivity(r2)     // Catch: java.lang.Throwable -> L2b
            goto L33
        L2b:
            r2 = move-exception
            java.lang.String r3 = "CallbackBridge"
            java.lang.String r1 = "Failed to open link"
            android.util.Log.e(r3, r1, r2)
        L33:
            return r0
        L34:
            android.content.ClipboardManager r2 = org.lwjgl.glfw.CallbackBridge.sClipboard
            java.lang.String r3 = ""
            if (r2 == 0) goto L74
            boolean r2 = r2.hasPrimaryClip()
            if (r2 == 0) goto L74
            android.content.ClipboardManager r2 = org.lwjgl.glfw.CallbackBridge.sClipboard
            android.content.ClipDescription r2 = r2.getPrimaryClipDescription()
            if (r2 == 0) goto L74
            android.content.ClipboardManager r2 = org.lwjgl.glfw.CallbackBridge.sClipboard
            android.content.ClipDescription r2 = r2.getPrimaryClipDescription()
            java.lang.String r0 = "text/plain"
            boolean r2 = r2.hasMimeType(r0)
            if (r2 == 0) goto L74
            android.content.ClipboardManager r2 = org.lwjgl.glfw.CallbackBridge.sClipboard
            android.content.ClipData r2 = r2.getPrimaryClip()
            if (r2 == 0) goto L74
            int r0 = r2.getItemCount()
            if (r0 > 0) goto L65
            goto L74
        L65:
            r0 = 0
            android.content.ClipData$Item r2 = r2.getItemAt(r0)
            java.lang.CharSequence r2 = r2.getText()
            if (r2 == 0) goto L74
            java.lang.String r3 = r2.toString()
        L74:
            return r3
        L75:
            android.content.ClipboardManager r2 = org.lwjgl.glfw.CallbackBridge.sClipboard
            if (r2 == 0) goto L82
            java.lang.String r1 = "Copy"
            android.content.ClipData r3 = android.content.ClipData.newPlainText(r1, r3)
            r2.setPrimaryClip(r3)
        L82:
            return r0
    }

    public static void addGrabListener(net.kdt.pojavlaunch.GrabListener r2) {
            java.util.ArrayList<net.kdt.pojavlaunch.GrabListener> r0 = org.lwjgl.glfw.CallbackBridge.grabListeners
            monitor-enter(r0)
            boolean r1 = org.lwjgl.glfw.CallbackBridge.isGrabbing     // Catch: java.lang.Throwable -> Ld
            r2.onGrabState(r1)     // Catch: java.lang.Throwable -> Ld
            r0.add(r2)     // Catch: java.lang.Throwable -> Ld
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Ld
            return
        Ld:
            r2 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Ld
            throw r2
    }

    public static void clearInputFocus() {
            r0 = 131073(0x20001, float:1.83672E-40)
            r1 = 0
            nativeSetWindowAttrib(r0, r1)     // Catch: java.lang.Throwable -> Ld
            r0 = 131083(0x2000b, float:1.83686E-40)
            nativeSetWindowAttrib(r0, r1)     // Catch: java.lang.Throwable -> Ld
        Ld:
            return
    }

    public static void clickMouseButtonAtCurrentPosition(int r2) {
            ensureInputFocus()
            float r0 = org.lwjgl.glfw.CallbackBridge.mouseX
            float r1 = org.lwjgl.glfw.CallbackBridge.mouseY
            putMouseEventWithCoords(r2, r0, r1)
            return
    }

    public static void ensureInputFocus() {
            ensureNativeInputReady()
            r0 = 131076(0x20004, float:1.83677E-40)
            r1 = 1
            nativeSetWindowAttrib(r0, r1)     // Catch: java.lang.Throwable -> L16
            r0 = 131073(0x20001, float:1.83672E-40)
            nativeSetWindowAttrib(r0, r1)     // Catch: java.lang.Throwable -> L16
            r0 = 131083(0x2000b, float:1.83686E-40)
            nativeSetWindowAttrib(r0, r1)     // Catch: java.lang.Throwable -> L16
        L16:
            return
    }

    private static void ensureNativeInputReady() {
            boolean r0 = org.lwjgl.glfw.CallbackBridge.sInputReady
            if (r0 != 0) goto L8
            r0 = 1
            setInputReady(r0)
        L8:
            return
    }

    public static native int getCurrentFps();

    public static int getCurrentMods() {
            boolean r0 = org.lwjgl.glfw.CallbackBridge.holdingAlt
            if (r0 == 0) goto L6
            r0 = 4
            goto L7
        L6:
            r0 = 0
        L7:
            boolean r1 = org.lwjgl.glfw.CallbackBridge.holdingCapslock
            if (r1 == 0) goto Ld
            r0 = r0 | 16
        Ld:
            boolean r1 = org.lwjgl.glfw.CallbackBridge.holdingCtrl
            if (r1 == 0) goto L13
            r0 = r0 | 2
        L13:
            boolean r1 = org.lwjgl.glfw.CallbackBridge.holdingNumlock
            if (r1 == 0) goto L19
            r0 = r0 | 32
        L19:
            boolean r1 = org.lwjgl.glfw.CallbackBridge.holdingShift
            if (r1 == 0) goto L1f
            r0 = r0 | 1
        L1f:
            return r0
    }

    public static void init(android.content.Context r1) {
            android.content.Context r1 = r1.getApplicationContext()
            org.lwjgl.glfw.CallbackBridge.sAppContext = r1
            java.lang.String r0 = "clipboard"
            java.lang.Object r1 = r1.getSystemService(r0)
            android.content.ClipboardManager r1 = (android.content.ClipboardManager) r1
            org.lwjgl.glfw.CallbackBridge.sClipboard = r1
            return
    }

    public static boolean isGrabbing() {
            boolean r0 = org.lwjgl.glfw.CallbackBridge.isGrabbing
            return r0
    }

    public static boolean isUseInputStackQueue() {
            boolean r0 = org.lwjgl.glfw.CallbackBridge.sUseInputStackQueue
            return r0
    }

    static /* synthetic */ void lambda$onGrabStateChanged$1(boolean r1, long r2) {
            boolean r2 = org.lwjgl.glfw.CallbackBridge.isGrabbing
            if (r2 == r1) goto L5
            return
        L5:
            java.util.ArrayList<net.kdt.pojavlaunch.GrabListener> r2 = org.lwjgl.glfw.CallbackBridge.grabListeners
            monitor-enter(r2)
            java.util.Iterator r3 = r2.iterator()     // Catch: java.lang.Throwable -> L1e
        Lc:
            boolean r0 = r3.hasNext()     // Catch: java.lang.Throwable -> L1e
            if (r0 == 0) goto L1c
            java.lang.Object r0 = r3.next()     // Catch: java.lang.Throwable -> L1e
            net.kdt.pojavlaunch.GrabListener r0 = (net.kdt.pojavlaunch.GrabListener) r0     // Catch: java.lang.Throwable -> L1e
            r0.onGrabState(r1)     // Catch: java.lang.Throwable -> L1e
            goto Lc
        L1c:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L1e
            return
        L1e:
            r1 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L1e
            throw r1
    }

    static /* synthetic */ void lambda$putMouseEventWithCoords$0(int r0, float r1, float r2, long r3) {
            r3 = 0
            putMouseEventWithCoords(r0, r3, r1, r2)
            return
    }

    @dalvik.annotation.optimization.CriticalNative
    private static native boolean nativeSendChar(char r0);

    @dalvik.annotation.optimization.CriticalNative
    private static native boolean nativeSendCharMods(char r0, int r1);

    @dalvik.annotation.optimization.CriticalNative
    private static native void nativeSendCursorPos(float r0, float r1);

    @dalvik.annotation.optimization.CriticalNative
    private static native void nativeSendKey(int r0, int r1, int r2, int r3);

    @dalvik.annotation.optimization.CriticalNative
    private static native void nativeSendMouseButton(int r0, int r1, int r2);

    @dalvik.annotation.optimization.CriticalNative
    private static native void nativeSendScreenSize(int r0, int r1);

    @dalvik.annotation.optimization.CriticalNative
    private static native void nativeSendScroll(double r0, double r2);

    @dalvik.annotation.optimization.CriticalNative
    public static native void nativeSetCursorShape(int r0);

    public static native boolean nativeSetInputReady(boolean r0);

    @dalvik.annotation.optimization.CriticalNative
    public static native void nativeSetUseInputStackQueue(boolean r0);

    public static native void nativeSetWindowAttrib(int r0, int r1);

    private static void onDirectInputEnable() {
            r0 = 1
            org.lwjgl.glfw.CallbackBridge.sGamepadDirectInput = r0
            java.lang.ref.WeakReference<java.lang.Object> r0 = org.lwjgl.glfw.CallbackBridge.sDirectGamepadEnableHandler
            if (r0 == 0) goto Lc
            java.lang.Object r0 = r0.get()
            goto Ld
        Lc:
            r0 = 0
        Ld:
            boolean r1 = r0 instanceof java.lang.Runnable
            if (r1 == 0) goto L16
            java.lang.Runnable r0 = (java.lang.Runnable) r0
            r0.run()
        L16:
            return
    }

    private static void onGrabStateChanged(boolean r4) {
            org.lwjgl.glfw.CallbackBridge.isGrabbing = r4
            android.view.Choreographer r0 = org.lwjgl.glfw.CallbackBridge.sChoreographer
            org.lwjgl.glfw.CallbackBridge$$ExternalSyntheticLambda0 r1 = new org.lwjgl.glfw.CallbackBridge$$ExternalSyntheticLambda0
            r1.<init>(r4)
            r2 = 16
            r0.postFrameCallbackDelayed(r1, r2)
            return
    }

    public static void putMouseEventWithCoords(int r2, float r3, float r4) {
            r0 = 1
            putMouseEventWithCoords(r2, r0, r3, r4)
            android.view.Choreographer r0 = org.lwjgl.glfw.CallbackBridge.sChoreographer
            org.lwjgl.glfw.CallbackBridge$$ExternalSyntheticLambda1 r1 = new org.lwjgl.glfw.CallbackBridge$$ExternalSyntheticLambda1
            r1.<init>(r2, r3, r4)
            r2 = 33
            r0.postFrameCallbackDelayed(r1, r2)
            return
    }

    public static void putMouseEventWithCoords(int r0, boolean r1, float r2, float r3) {
            ensureInputFocus()
            sendCursorPos(r2, r3)
            int r2 = getCurrentMods()
            sendMouseKeycode(r0, r2, r1)
            return
    }

    public static void removeGrabListener(net.kdt.pojavlaunch.GrabListener r1) {
            java.util.ArrayList<net.kdt.pojavlaunch.GrabListener> r0 = org.lwjgl.glfw.CallbackBridge.grabListeners
            monitor-enter(r0)
            r0.remove(r1)     // Catch: java.lang.Throwable -> L8
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L8
            return
        L8:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L8
            throw r1
    }

    public static void sendChar(char r0, int r1) {
            ensureInputFocus()
            nativeSendCharMods(r0, r1)
            nativeSendChar(r0)
            return
    }

    public static void sendCursorPos(float r0, float r1) {
            ensureNativeInputReady()
            org.lwjgl.glfw.CallbackBridge.mouseX = r0
            org.lwjgl.glfw.CallbackBridge.mouseY = r1
            nativeSendCursorPos(r0, r1)
            return
    }

    public static void sendKeyPress(int r2) {
            int r0 = getCurrentMods()
            r1 = 1
            sendKeyPress(r2, r0, r1)
            int r0 = getCurrentMods()
            r1 = 0
            sendKeyPress(r2, r0, r1)
            return
    }

    public static void sendKeyPress(int r0, char r1, int r2, int r3, boolean r4) {
            sendKeycode(r0, r1, r2, r3, r4)
            return
    }

    public static void sendKeyPress(int r1, char r2, int r3, boolean r4) {
            r0 = 0
            sendKeyPress(r1, r2, r0, r3, r4)
            return
    }

    public static void sendKeyPress(int r1, int r2, boolean r3) {
            r0 = 0
            sendKeyPress(r1, r0, r0, r2, r3)
            return
    }

    public static void sendKeycode(int r0, char r1, int r2, int r3, boolean r4) {
            ensureInputFocus()
            if (r0 == 0) goto L8
            nativeSendKey(r0, r2, r4, r3)
        L8:
            if (r4 == 0) goto L18
            if (r1 == 0) goto L18
            boolean r0 = java.lang.Character.isISOControl(r1)
            if (r0 != 0) goto L18
            nativeSendCharMods(r1, r3)
            nativeSendChar(r1)
        L18:
            return
    }

    public static void sendMouseButton(int r1, boolean r2) {
            int r0 = getCurrentMods()
            sendMouseKeycode(r1, r0, r2)
            return
    }

    public static void sendMouseKeycode(int r0, int r1, boolean r2) {
            ensureInputFocus()
            nativeSendMouseButton(r0, r2, r1)
            return
    }

    public static void sendScroll(double r0, double r2) {
            ensureInputFocus()
            nativeSendScroll(r0, r2)
            return
    }

    public static void sendUpdateWindowSize(int r0, int r1) {
            nativeSendScreenSize(r0, r1)
            return
    }

    public static void setDirectGamepadEnableHandler(java.lang.Object r1) {
            java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference
            r0.<init>(r1)
            org.lwjgl.glfw.CallbackBridge.sDirectGamepadEnableHandler = r0
            return
    }

    public static boolean setInputReady(boolean r3) {
            org.lwjgl.glfw.CallbackBridge.sInputReady = r3
            boolean r0 = nativeSetInputReady(r3)     // Catch: java.lang.Throwable -> L9
            org.lwjgl.glfw.CallbackBridge.sUseInputStackQueue = r0     // Catch: java.lang.Throwable -> L9
            return r0
        L9:
            r0 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "nativeSetInputReady failed: "
            r1.<init>(r2)
            java.lang.StringBuilder r3 = r1.append(r3)
            java.lang.String r3 = r3.toString()
            java.lang.String r1 = "CallbackBridge"
            android.util.Log.e(r1, r3, r0)
            r3 = 0
            return r3
    }

    public static void setModifiers(int r1, boolean r2) {
            r0 = 280(0x118, float:3.92E-43)
            if (r1 == r0) goto L1b
            r0 = 282(0x11a, float:3.95E-43)
            if (r1 == r0) goto L18
            switch(r1) {
                case 340: goto L15;
                case 341: goto L12;
                case 342: goto Lf;
                default: goto Lb;
            }
        Lb:
            switch(r1) {
                case 344: goto L15;
                case 345: goto L12;
                case 346: goto Lf;
                default: goto Le;
            }
        Le:
            goto L1a
        Lf:
            org.lwjgl.glfw.CallbackBridge.holdingAlt = r2
            return
        L12:
            org.lwjgl.glfw.CallbackBridge.holdingCtrl = r2
            return
        L15:
            org.lwjgl.glfw.CallbackBridge.holdingShift = r2
            return
        L18:
            org.lwjgl.glfw.CallbackBridge.holdingNumlock = r2
        L1a:
            return
        L1b:
            org.lwjgl.glfw.CallbackBridge.holdingCapslock = r2
            return
    }

    public static void setUseInputStackQueue(boolean r4) {
            java.lang.String r0 = "CallbackBridge"
            java.lang.String r1 = "Input stack queue="
            org.lwjgl.glfw.CallbackBridge.sUseInputStackQueue = r4
            nativeSetUseInputStackQueue(r4)     // Catch: java.lang.Throwable -> L1a
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L1a
            r2.<init>(r1)     // Catch: java.lang.Throwable -> L1a
            java.lang.StringBuilder r1 = r2.append(r4)     // Catch: java.lang.Throwable -> L1a
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L1a
            android.util.Log.i(r0, r1)     // Catch: java.lang.Throwable -> L1a
            goto L2d
        L1a:
            r1 = move-exception
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "nativeSetUseInputStackQueue failed: "
            r2.<init>(r3)
            java.lang.StringBuilder r4 = r2.append(r4)
            java.lang.String r4 = r4.toString()
            android.util.Log.e(r0, r4, r1)
        L2d:
            return
    }
}
