package org.lwjgl.openal;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/openal/SOFTEvents.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/openal/SOFTEvents.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/openal/SOFTEvents.class */
public class SOFTEvents {
    public static final int AL_EVENT_CALLBACK_FUNCTION_SOFT = 6562;
    public static final int AL_EVENT_CALLBACK_USER_PARAM_SOFT = 6563;
    public static final int AL_EVENT_TYPE_BUFFER_COMPLETED_SOFT = 6564;
    public static final int AL_EVENT_TYPE_SOURCE_STATE_CHANGED_SOFT = 6565;
    public static final int AL_EVENT_TYPE_DISCONNECTED_SOFT = 6566;

    protected SOFTEvents() {
            r3 = this;
            r0 = r3
            r0.<init>()
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r1 = r0
            r1.<init>()
            throw r0
    }

    public static void nalEventControlSOFT(int r7, long r8, boolean r10) {
            org.lwjgl.openal.ALCapabilities r0 = org.lwjgl.openal.AL.getICD()
            long r0 = r0.alEventControlSOFT
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
            org.lwjgl.system.JNI.invokePV(r0, r1, r2, r3)
            return
    }

    public static void alEventControlSOFT(@org.lwjgl.system.NativeType("ALenum const *") java.nio.IntBuffer r5, @org.lwjgl.system.NativeType("ALboolean") boolean r6) {
            r0 = r5
            int r0 = r0.remaining()
            r1 = r5
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            r2 = r6
            nalEventControlSOFT(r0, r1, r2)
            return
    }

    public static void nalEventCallbackSOFT(long r7, long r9) {
            org.lwjgl.openal.ALCapabilities r0 = org.lwjgl.openal.AL.getICD()
            long r0 = r0.alEventCallbackSOFT
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

    public static void alEventCallbackSOFT(@org.lwjgl.system.NativeType("ALEVENTPROCSOFT") org.lwjgl.openal.SOFTEventProcI r5, @javax.annotation.Nullable @org.lwjgl.system.NativeType("ALvoid *") java.nio.ByteBuffer r6) {
            r0 = r5
            long r0 = r0.address()
            r1 = r6
            long r1 = org.lwjgl.system.MemoryUtil.memAddressSafe(r1)
            nalEventCallbackSOFT(r0, r1)
            return
    }

    @org.lwjgl.system.NativeType("ALvoid *")
    public static long alGetPointerSOFT(@org.lwjgl.system.NativeType("ALenum") int r4) {
            org.lwjgl.openal.ALCapabilities r0 = org.lwjgl.openal.AL.getICD()
            long r0 = r0.alGetPointerSOFT
            r5 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L12
            r0 = r5
            long r0 = org.lwjgl.system.Checks.check(r0)
        L12:
            r0 = r4
            r1 = r5
            long r0 = org.lwjgl.system.JNI.invokeP(r0, r1)
            return r0
    }

    public static void nalGetPointervSOFT(int r6, long r7) {
            org.lwjgl.openal.ALCapabilities r0 = org.lwjgl.openal.AL.getICD()
            long r0 = r0.alGetPointervSOFT
            r9 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L12
            r0 = r9
            long r0 = org.lwjgl.system.Checks.check(r0)
        L12:
            r0 = r6
            r1 = r7
            r2 = r9
            org.lwjgl.system.JNI.invokePV(r0, r1, r2)
            return
    }

    public static void alGetPointervSOFT(@org.lwjgl.system.NativeType("ALenum") int r4, @org.lwjgl.system.NativeType("ALvoid **") org.lwjgl.PointerBuffer r5) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r5
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
        Lb:
            r0 = r4
            r1 = r5
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            nalGetPointervSOFT(r0, r1)
            return
    }

    public static void alEventControlSOFT(@org.lwjgl.system.NativeType("ALenum const *") int[] r6, @org.lwjgl.system.NativeType("ALboolean") boolean r7) {
            org.lwjgl.openal.ALCapabilities r0 = org.lwjgl.openal.AL.getICD()
            long r0 = r0.alEventControlSOFT
            r8 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L12
            r0 = r8
            long r0 = org.lwjgl.system.Checks.check(r0)
        L12:
            r0 = r6
            int r0 = r0.length
            r1 = r6
            r2 = r7
            r3 = r8
            org.lwjgl.system.JNI.invokePV(r0, r1, r2, r3)
            return
    }
}
