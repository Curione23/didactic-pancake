package org.libsdl.app;

/* JADX INFO: loaded from: classes2.dex */
public class SDLControllerManager {
    private static final java.lang.String TAG = "SDLControllerManager";
    protected static org.libsdl.app.SDLHapticHandler mHapticHandler;
    protected static org.libsdl.app.SDLJoystickHandler mJoystickHandler;

    public SDLControllerManager() {
            r0 = this;
            r0.<init>()
            return
    }

    public static boolean handleJoystickMotionEvent(android.view.MotionEvent r1) {
            org.libsdl.app.SDLJoystickHandler r0 = org.libsdl.app.SDLControllerManager.mJoystickHandler
            if (r0 != 0) goto L7
            initialize()
        L7:
            org.libsdl.app.SDLJoystickHandler r0 = org.libsdl.app.SDLControllerManager.mJoystickHandler
            if (r0 == 0) goto L13
            boolean r1 = r0.handleMotionEvent(r1)
            if (r1 == 0) goto L13
            r1 = 1
            goto L14
        L13:
            r1 = 0
        L14:
            return r1
    }

    public static void hapticRumble(int r1, float r2, float r3, int r4) {
            org.libsdl.app.SDLHapticHandler r0 = org.libsdl.app.SDLControllerManager.mHapticHandler
            r0.rumble(r1, r2, r3, r4)
            return
    }

    public static void hapticRun(int r1, float r2, int r3) {
            org.libsdl.app.SDLHapticHandler r0 = org.libsdl.app.SDLControllerManager.mHapticHandler
            r0.run(r1, r2, r3)
            return
    }

    public static void hapticStop(int r1) {
            org.libsdl.app.SDLHapticHandler r0 = org.libsdl.app.SDLControllerManager.mHapticHandler
            r0.stop(r1)
            return
    }

    public static void initialize() {
            org.libsdl.app.SDLJoystickHandler r0 = org.libsdl.app.SDLControllerManager.mJoystickHandler
            if (r0 != 0) goto Lb
            org.libsdl.app.SDLJoystickHandler_API19 r0 = new org.libsdl.app.SDLJoystickHandler_API19
            r0.<init>()
            org.libsdl.app.SDLControllerManager.mJoystickHandler = r0
        Lb:
            org.libsdl.app.SDLHapticHandler r0 = org.libsdl.app.SDLControllerManager.mHapticHandler
            if (r0 != 0) goto L24
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 31
            if (r0 < r1) goto L1d
            org.libsdl.app.SDLHapticHandler_API31 r0 = new org.libsdl.app.SDLHapticHandler_API31
            r0.<init>()
            org.libsdl.app.SDLControllerManager.mHapticHandler = r0
            goto L24
        L1d:
            org.libsdl.app.SDLHapticHandler_API26 r0 = new org.libsdl.app.SDLHapticHandler_API26
            r0.<init>()
            org.libsdl.app.SDLControllerManager.mHapticHandler = r0
        L24:
            return
    }

    public static boolean isDeviceSDLJoystick(int r3) {
            android.view.InputDevice r0 = android.view.InputDevice.getDevice(r3)
            r1 = 0
            if (r0 == 0) goto L1e
            if (r3 >= 0) goto La
            goto L1e
        La:
            int r3 = r0.getSources()
            r0 = r3 & 16
            if (r0 != 0) goto L1d
            r0 = r3 & 513(0x201, float:7.19E-43)
            r2 = 513(0x201, float:7.19E-43)
            if (r0 == r2) goto L1d
            r0 = 1025(0x401, float:1.436E-42)
            r3 = r3 & r0
            if (r3 != r0) goto L1e
        L1d:
            r1 = 1
        L1e:
            return r1
    }

    public static native void nativeAddHaptic(int r0, java.lang.String r1);

    public static native void nativeAddJoystick(int r0, java.lang.String r1, java.lang.String r2, int r3, int r4, int r5, int r6, int r7, int r8, boolean r9);

    public static native void nativeRemoveHaptic(int r0);

    public static native void nativeRemoveJoystick(int r0);

    public static native int nativeSetupJNI();

    public static native void onNativeHat(int r0, int r1, int r2, int r3);

    public static native void onNativeJoy(int r0, int r1, float r2);

    public static native boolean onNativePadDown(int r0, int r1);

    public static native boolean onNativePadUp(int r0, int r1);

    public static void pollHapticDevices() {
            org.libsdl.app.SDLHapticHandler r0 = org.libsdl.app.SDLControllerManager.mHapticHandler
            if (r0 != 0) goto L7
            initialize()
        L7:
            org.libsdl.app.SDLHapticHandler r0 = org.libsdl.app.SDLControllerManager.mHapticHandler
            if (r0 == 0) goto Le
            r0.pollHapticDevices()
        Le:
            return
    }

    public static void pollInputDevices() {
            org.libsdl.app.SDLJoystickHandler r0 = org.libsdl.app.SDLControllerManager.mJoystickHandler
            if (r0 != 0) goto L7
            initialize()
        L7:
            org.libsdl.app.SDLJoystickHandler r0 = org.libsdl.app.SDLControllerManager.mJoystickHandler
            if (r0 == 0) goto Le
            r0.pollInputDevices()
        Le:
            return
    }
}
