package org.lwjgl.openal;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/openal/SOFTHRTF.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/openal/SOFTHRTF.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/openal/SOFTHRTF.class */
public class SOFTHRTF {
    public static final int ALC_HRTF_SOFT = 6546;
    public static final int ALC_HRTF_ID_SOFT = 6550;
    public static final int ALC_DONT_CARE_SOFT = 2;
    public static final int ALC_HRTF_STATUS_SOFT = 6547;
    public static final int ALC_NUM_HRTF_SPECIFIERS_SOFT = 6548;
    public static final int ALC_HRTF_SPECIFIER_SOFT = 6549;
    public static final int ALC_HRTF_DISABLED_SOFT = 0;
    public static final int ALC_HRTF_ENABLED_SOFT = 1;
    public static final int ALC_HRTF_DENIED_SOFT = 2;
    public static final int ALC_HRTF_REQUIRED_SOFT = 3;
    public static final int ALC_HRTF_HEADPHONES_DETECTED_SOFT = 4;
    public static final int ALC_HRTF_UNSUPPORTED_FORMAT_SOFT = 5;

    protected SOFTHRTF() {
            r3 = this;
            r0 = r3
            r0.<init>()
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r1 = r0
            r1.<init>()
            throw r0
    }

    public static long nalcGetStringiSOFT(long r7, int r9, int r10) {
            org.lwjgl.openal.ALCCapabilities r0 = org.lwjgl.openal.ALC.getICD()
            long r0 = r0.alcGetStringiSOFT
            r11 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L19
            r0 = r11
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r7
            long r0 = org.lwjgl.system.Checks.check(r0)
        L19:
            r0 = r7
            r1 = r9
            r2 = r10
            r3 = r11
            long r0 = org.lwjgl.system.JNI.invokePP(r0, r1, r2, r3)
            return r0
    }

    @javax.annotation.Nullable
    @org.lwjgl.system.NativeType("ALCchar const *")
    public static java.lang.String alcGetStringiSOFT(@org.lwjgl.system.NativeType("ALCdevice *") long r5, @org.lwjgl.system.NativeType("ALCenum") int r7, @org.lwjgl.system.NativeType("ALCsizei") int r8) {
            r0 = r5
            r1 = r7
            r2 = r8
            long r0 = nalcGetStringiSOFT(r0, r1, r2)
            r9 = r0
            r0 = r9
            java.lang.String r0 = org.lwjgl.system.MemoryUtil.memUTF8Safe(r0)
            return r0
    }

    public static boolean nalcResetDeviceSOFT(long r7, long r9) {
            org.lwjgl.openal.ALCCapabilities r0 = org.lwjgl.openal.ALC.getICD()
            long r0 = r0.alcResetDeviceSOFT
            r11 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L19
            r0 = r11
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r7
            long r0 = org.lwjgl.system.Checks.check(r0)
        L19:
            r0 = r7
            r1 = r9
            r2 = r11
            boolean r0 = org.lwjgl.system.JNI.invokePPZ(r0, r1, r2)
            return r0
    }

    @org.lwjgl.system.NativeType("ALCboolean")
    public static boolean alcResetDeviceSOFT(@org.lwjgl.system.NativeType("ALCdevice *") long r5, @javax.annotation.Nullable @org.lwjgl.system.NativeType("ALCint const *") java.nio.IntBuffer r7) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto La
            r0 = r7
            org.lwjgl.system.Checks.checkNTSafe(r0)
        La:
            r0 = r5
            r1 = r7
            long r1 = org.lwjgl.system.MemoryUtil.memAddressSafe(r1)
            boolean r0 = nalcResetDeviceSOFT(r0, r1)
            return r0
    }

    @org.lwjgl.system.NativeType("ALCboolean")
    public static boolean alcResetDeviceSOFT(@org.lwjgl.system.NativeType("ALCdevice *") long r6, @javax.annotation.Nullable @org.lwjgl.system.NativeType("ALCint const *") int[] r8) {
            org.lwjgl.openal.ALCCapabilities r0 = org.lwjgl.openal.ALC.getICD()
            long r0 = r0.alcResetDeviceSOFT
            r9 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L1b
            r0 = r9
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r6
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r8
            org.lwjgl.system.Checks.checkNTSafe(r0)
        L1b:
            r0 = r6
            r1 = r8
            r2 = r9
            boolean r0 = org.lwjgl.system.JNI.invokePPZ(r0, r1, r2)
            return r0
    }
}
