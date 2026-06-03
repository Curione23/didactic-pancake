package org.lwjgl.openal;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/openal/SOFTSystemEvents.class */
public class SOFTSystemEvents {
    public static final int ALC_EVENT_TYPE_DEFAULT_DEVICE_CHANGED_SOFT = 6614;
    public static final int ALC_EVENT_TYPE_DEVICE_ADDED_SOFT = 6615;
    public static final int ALC_EVENT_TYPE_DEVICE_REMOVED_SOFT = 6616;
    public static final int ALC_PLAYBACK_DEVICE_SOFT = 6612;
    public static final int ALC_CAPTURE_DEVICE_SOFT = 6613;
    public static final int ALC_EVENT_SUPPORTED_SOFT = 6617;
    public static final int ALC_EVENT_NOT_SUPPORTED_SOFT = 6618;

    protected SOFTSystemEvents() {
            r3 = this;
            r0 = r3
            r0.<init>()
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r1 = r0
            r1.<init>()
            throw r0
    }

    @org.lwjgl.system.NativeType("ALCenum")
    public static int alcEventIsSupportedSOFT(@org.lwjgl.system.NativeType("ALCenum") int r5, @org.lwjgl.system.NativeType("ALCenum") int r6) {
            org.lwjgl.openal.ALCCapabilities r0 = org.lwjgl.openal.ALC.getICD()
            long r0 = r0.alcEventIsSupportedSOFT
            r7 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L12
            r0 = r7
            long r0 = org.lwjgl.system.Checks.check(r0)
        L12:
            r0 = r5
            r1 = r6
            r2 = r7
            int r0 = org.lwjgl.system.JNI.invokeI(r0, r1, r2)
            return r0
    }

    public static boolean nalcEventControlSOFT(int r7, long r8, boolean r10) {
            org.lwjgl.openal.ALCCapabilities r0 = org.lwjgl.openal.ALC.getICD()
            long r0 = r0.alcEventControlSOFT
            r11 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L14
            r0 = r11
            long r0 = org.lwjgl.system.Checks.check(r0)
        L14:
            r0 = r7
            r1 = r8
            r2 = r10
            r3 = r11
            boolean r0 = org.lwjgl.system.JNI.invokePZ(r0, r1, r2, r3)
            return r0
    }

    @org.lwjgl.system.NativeType("ALCboolean")
    public static boolean alcEventControlSOFT(@org.lwjgl.system.NativeType("ALCenum const *") java.nio.IntBuffer r5, @org.lwjgl.system.NativeType("ALCboolean") boolean r6) {
            r0 = r5
            int r0 = org.lwjgl.system.Checks.remainingSafe(r0)
            r1 = r5
            long r1 = org.lwjgl.system.MemoryUtil.memAddressSafe(r1)
            r2 = r6
            boolean r0 = nalcEventControlSOFT(r0, r1, r2)
            return r0
    }

    public static void nalcEventCallbackSOFT(long r7, long r9) {
            org.lwjgl.openal.ALCCapabilities r0 = org.lwjgl.openal.ALC.getICD()
            long r0 = r0.alcEventCallbackSOFT
            r11 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L14
            r0 = r11
            long r0 = org.lwjgl.system.Checks.check(r0)
        L14:
            r0 = r7
            r1 = r9
            r2 = r11
            org.lwjgl.system.JNI.invokePPV(r0, r1, r2)
            return
    }

    @org.lwjgl.system.NativeType("ALCvoid")
    public static void alcEventCallbackSOFT(@org.lwjgl.system.NativeType("ALCEVENTPROCTYPESOFT") org.lwjgl.openal.SOFTSystemEventProcI r5, @org.lwjgl.system.NativeType("ALCvoid *") long r6) {
            r0 = r5
            long r0 = org.lwjgl.system.MemoryUtil.memAddressSafe(r0)
            r1 = r6
            nalcEventCallbackSOFT(r0, r1)
            return
    }

    @org.lwjgl.system.NativeType("ALCboolean")
    public static boolean alcEventControlSOFT(@org.lwjgl.system.NativeType("ALCenum const *") int[] r6, @org.lwjgl.system.NativeType("ALCboolean") boolean r7) {
            org.lwjgl.openal.ALCCapabilities r0 = org.lwjgl.openal.ALC.getICD()
            long r0 = r0.alcEventControlSOFT
            r8 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L12
            r0 = r8
            long r0 = org.lwjgl.system.Checks.check(r0)
        L12:
            r0 = r6
            int r0 = org.lwjgl.system.Checks.lengthSafe(r0)
            r1 = r6
            r2 = r7
            r3 = r8
            boolean r0 = org.lwjgl.system.JNI.invokePZ(r0, r1, r2, r3)
            return r0
    }
}
