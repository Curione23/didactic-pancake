package org.lwjgl.openal;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/openal/ALCCapabilities.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/openal/ALCCapabilities.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/openal/ALCCapabilities.class */
public final class ALCCapabilities {
    public final long alcOpenDevice;
    public final long alcCloseDevice;
    public final long alcCreateContext;
    public final long alcMakeContextCurrent;
    public final long alcProcessContext;
    public final long alcSuspendContext;
    public final long alcDestroyContext;
    public final long alcGetCurrentContext;
    public final long alcGetContextsDevice;
    public final long alcIsExtensionPresent;
    public final long alcGetProcAddress;
    public final long alcGetEnumValue;
    public final long alcGetError;
    public final long alcGetString;
    public final long alcGetIntegerv;
    public final long alcCaptureOpenDevice;
    public final long alcCaptureCloseDevice;
    public final long alcCaptureStart;
    public final long alcCaptureStop;
    public final long alcCaptureSamples;
    public final long alcSetThreadContext;
    public final long alcGetThreadContext;
    public final long alcGetInteger64vSOFT;
    public final long alcGetStringiSOFT;
    public final long alcResetDeviceSOFT;
    public final long alcLoopbackOpenDeviceSOFT;
    public final long alcIsRenderFormatSupportedSOFT;
    public final long alcRenderSamplesSOFT;
    public final long alcDevicePauseSOFT;
    public final long alcDeviceResumeSOFT;
    public final long alcReopenDeviceSOFT;
    public final boolean OpenALC10;
    public final boolean OpenALC11;
    public final boolean OpenALC_SOFT_loopback_bformat;
    public final boolean ALC_ENUMERATE_ALL_EXT;
    public final boolean ALC_ENUMERATION_EXT;
    public final boolean ALC_EXT_CAPTURE;
    public final boolean ALC_EXT_DEDICATED;
    public final boolean ALC_EXT_DEFAULT_FILTER_ORDER;
    public final boolean ALC_EXT_disconnect;
    public final boolean ALC_EXT_EFX;
    public final boolean ALC_EXT_thread_local_context;
    public final boolean ALC_LOKI_audio_channel;
    public final boolean ALC_SOFT_device_clock;
    public final boolean ALC_SOFT_HRTF;
    public final boolean ALC_SOFT_loopback;
    public final boolean ALC_SOFT_output_limiter;
    public final boolean ALC_SOFT_output_mode;
    public final boolean ALC_SOFT_pause_device;
    public final boolean ALC_SOFT_reopen_device;
    final long device;
    final org.lwjgl.PointerBuffer addresses;

    ALCCapabilities(org.lwjgl.system.FunctionProviderLocal r8, long r9, java.util.Set<java.lang.String> r11, java.util.function.IntFunction<org.lwjgl.PointerBuffer> r12) {
            r7 = this;
            r0 = r7
            r0.<init>()
            r0 = r7
            r1 = r9
            r0.device = r1
            r0 = r12
            r1 = 31
            java.lang.Object r0 = r0.apply(r1)
            org.lwjgl.PointerBuffer r0 = (org.lwjgl.PointerBuffer) r0
            r13 = r0
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = r13
            r4 = r11
            boolean r1 = check_ALC10(r1, r2, r3, r4)
            r0.OpenALC10 = r1
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = r13
            r4 = r11
            boolean r1 = check_ALC11(r1, r2, r3, r4)
            r0.OpenALC11 = r1
            r0 = r7
            r1 = r11
            java.lang.String r2 = "OpenALC_SOFT_loopback_bformat"
            boolean r1 = r1.contains(r2)
            r0.OpenALC_SOFT_loopback_bformat = r1
            r0 = r7
            r1 = r11
            java.lang.String r2 = "ALC_ENUMERATE_ALL_EXT"
            boolean r1 = r1.contains(r2)
            r0.ALC_ENUMERATE_ALL_EXT = r1
            r0 = r7
            r1 = r11
            java.lang.String r2 = "ALC_ENUMERATION_EXT"
            boolean r1 = r1.contains(r2)
            r0.ALC_ENUMERATION_EXT = r1
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = r13
            r4 = r11
            boolean r1 = check_EXT_CAPTURE(r1, r2, r3, r4)
            r0.ALC_EXT_CAPTURE = r1
            r0 = r7
            r1 = r11
            java.lang.String r2 = "ALC_EXT_DEDICATED"
            boolean r1 = r1.contains(r2)
            r0.ALC_EXT_DEDICATED = r1
            r0 = r7
            r1 = r11
            java.lang.String r2 = "ALC_EXT_DEFAULT_FILTER_ORDER"
            boolean r1 = r1.contains(r2)
            r0.ALC_EXT_DEFAULT_FILTER_ORDER = r1
            r0 = r7
            r1 = r11
            java.lang.String r2 = "ALC_EXT_disconnect"
            boolean r1 = r1.contains(r2)
            r0.ALC_EXT_disconnect = r1
            r0 = r7
            r1 = r11
            java.lang.String r2 = "ALC_EXT_EFX"
            boolean r1 = r1.contains(r2)
            r0.ALC_EXT_EFX = r1
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = r13
            r4 = r11
            boolean r1 = check_EXT_thread_local_context(r1, r2, r3, r4)
            r0.ALC_EXT_thread_local_context = r1
            r0 = r7
            r1 = r11
            java.lang.String r2 = "ALC_LOKI_audio_channel"
            boolean r1 = r1.contains(r2)
            r0.ALC_LOKI_audio_channel = r1
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = r13
            r4 = r11
            boolean r1 = check_SOFT_device_clock(r1, r2, r3, r4)
            r0.ALC_SOFT_device_clock = r1
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = r13
            r4 = r11
            boolean r1 = check_SOFT_HRTF(r1, r2, r3, r4)
            r0.ALC_SOFT_HRTF = r1
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = r13
            r4 = r11
            boolean r1 = check_SOFT_loopback(r1, r2, r3, r4)
            r0.ALC_SOFT_loopback = r1
            r0 = r7
            r1 = r11
            java.lang.String r2 = "ALC_SOFT_output_limiter"
            boolean r1 = r1.contains(r2)
            r0.ALC_SOFT_output_limiter = r1
            r0 = r7
            r1 = r11
            java.lang.String r2 = "ALC_SOFT_output_mode"
            boolean r1 = r1.contains(r2)
            r0.ALC_SOFT_output_mode = r1
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = r13
            r4 = r11
            boolean r1 = check_SOFT_pause_device(r1, r2, r3, r4)
            r0.ALC_SOFT_pause_device = r1
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = r13
            r4 = r11
            boolean r1 = check_SOFT_reopen_device(r1, r2, r3, r4)
            r0.ALC_SOFT_reopen_device = r1
            r0 = r7
            r1 = r13
            r2 = 0
            long r1 = r1.get(r2)
            r0.alcOpenDevice = r1
            r0 = r7
            r1 = r13
            r2 = 1
            long r1 = r1.get(r2)
            r0.alcCloseDevice = r1
            r0 = r7
            r1 = r13
            r2 = 2
            long r1 = r1.get(r2)
            r0.alcCreateContext = r1
            r0 = r7
            r1 = r13
            r2 = 3
            long r1 = r1.get(r2)
            r0.alcMakeContextCurrent = r1
            r0 = r7
            r1 = r13
            r2 = 4
            long r1 = r1.get(r2)
            r0.alcProcessContext = r1
            r0 = r7
            r1 = r13
            r2 = 5
            long r1 = r1.get(r2)
            r0.alcSuspendContext = r1
            r0 = r7
            r1 = r13
            r2 = 6
            long r1 = r1.get(r2)
            r0.alcDestroyContext = r1
            r0 = r7
            r1 = r13
            r2 = 7
            long r1 = r1.get(r2)
            r0.alcGetCurrentContext = r1
            r0 = r7
            r1 = r13
            r2 = 8
            long r1 = r1.get(r2)
            r0.alcGetContextsDevice = r1
            r0 = r7
            r1 = r13
            r2 = 9
            long r1 = r1.get(r2)
            r0.alcIsExtensionPresent = r1
            r0 = r7
            r1 = r13
            r2 = 10
            long r1 = r1.get(r2)
            r0.alcGetProcAddress = r1
            r0 = r7
            r1 = r13
            r2 = 11
            long r1 = r1.get(r2)
            r0.alcGetEnumValue = r1
            r0 = r7
            r1 = r13
            r2 = 12
            long r1 = r1.get(r2)
            r0.alcGetError = r1
            r0 = r7
            r1 = r13
            r2 = 13
            long r1 = r1.get(r2)
            r0.alcGetString = r1
            r0 = r7
            r1 = r13
            r2 = 14
            long r1 = r1.get(r2)
            r0.alcGetIntegerv = r1
            r0 = r7
            r1 = r13
            r2 = 15
            long r1 = r1.get(r2)
            r0.alcCaptureOpenDevice = r1
            r0 = r7
            r1 = r13
            r2 = 16
            long r1 = r1.get(r2)
            r0.alcCaptureCloseDevice = r1
            r0 = r7
            r1 = r13
            r2 = 17
            long r1 = r1.get(r2)
            r0.alcCaptureStart = r1
            r0 = r7
            r1 = r13
            r2 = 18
            long r1 = r1.get(r2)
            r0.alcCaptureStop = r1
            r0 = r7
            r1 = r13
            r2 = 19
            long r1 = r1.get(r2)
            r0.alcCaptureSamples = r1
            r0 = r7
            r1 = r13
            r2 = 20
            long r1 = r1.get(r2)
            r0.alcSetThreadContext = r1
            r0 = r7
            r1 = r13
            r2 = 21
            long r1 = r1.get(r2)
            r0.alcGetThreadContext = r1
            r0 = r7
            r1 = r13
            r2 = 22
            long r1 = r1.get(r2)
            r0.alcGetInteger64vSOFT = r1
            r0 = r7
            r1 = r13
            r2 = 23
            long r1 = r1.get(r2)
            r0.alcGetStringiSOFT = r1
            r0 = r7
            r1 = r13
            r2 = 24
            long r1 = r1.get(r2)
            r0.alcResetDeviceSOFT = r1
            r0 = r7
            r1 = r13
            r2 = 25
            long r1 = r1.get(r2)
            r0.alcLoopbackOpenDeviceSOFT = r1
            r0 = r7
            r1 = r13
            r2 = 26
            long r1 = r1.get(r2)
            r0.alcIsRenderFormatSupportedSOFT = r1
            r0 = r7
            r1 = r13
            r2 = 27
            long r1 = r1.get(r2)
            r0.alcRenderSamplesSOFT = r1
            r0 = r7
            r1 = r13
            r2 = 28
            long r1 = r1.get(r2)
            r0.alcDevicePauseSOFT = r1
            r0 = r7
            r1 = r13
            r2 = 29
            long r1 = r1.get(r2)
            r0.alcDeviceResumeSOFT = r1
            r0 = r7
            r1 = r13
            r2 = 30
            long r1 = r1.get(r2)
            r0.alcReopenDeviceSOFT = r1
            r0 = r7
            r1 = r13
            org.lwjgl.PointerBuffer r1 = org.lwjgl.system.ThreadLocalUtil.setupAddressBuffer(r1)
            r0.addresses = r1
            return
    }

    public org.lwjgl.PointerBuffer getAddressBuffer() {
            r2 = this;
            r0 = r2
            org.lwjgl.PointerBuffer r0 = r0.addresses
            return r0
    }

    private static boolean check_ALC10(org.lwjgl.system.FunctionProviderLocal r10, long r11, org.lwjgl.PointerBuffer r13, java.util.Set<java.lang.String> r14) {
            r0 = r14
            java.lang.String r1 = "OpenALC10"
            boolean r0 = r0.contains(r1)
            if (r0 != 0) goto Le
            r0 = 0
            return r0
        Le:
            r0 = r10
            r1 = r11
            r2 = r13
            r3 = 15
            int[] r3 = new int[r3]
            r4 = r3
            r5 = 0
            r6 = 0
            r4[r5] = r6
            r4 = r3
            r5 = 1
            r6 = 1
            r4[r5] = r6
            r4 = r3
            r5 = 2
            r6 = 2
            r4[r5] = r6
            r4 = r3
            r5 = 3
            r6 = 3
            r4[r5] = r6
            r4 = r3
            r5 = 4
            r6 = 4
            r4[r5] = r6
            r4 = r3
            r5 = 5
            r6 = 5
            r4[r5] = r6
            r4 = r3
            r5 = 6
            r6 = 6
            r4[r5] = r6
            r4 = r3
            r5 = 7
            r6 = 7
            r4[r5] = r6
            r4 = r3
            r5 = 8
            r6 = 8
            r4[r5] = r6
            r4 = r3
            r5 = 9
            r6 = 9
            r4[r5] = r6
            r4 = r3
            r5 = 10
            r6 = 10
            r4[r5] = r6
            r4 = r3
            r5 = 11
            r6 = 11
            r4[r5] = r6
            r4 = r3
            r5 = 12
            r6 = 12
            r4[r5] = r6
            r4 = r3
            r5 = 13
            r6 = 13
            r4[r5] = r6
            r4 = r3
            r5 = 14
            r6 = 14
            r4[r5] = r6
            r4 = 15
            java.lang.String[] r4 = new java.lang.String[r4]
            r5 = r4
            r6 = 0
            java.lang.String r7 = "alcOpenDevice"
            r5[r6] = r7
            r5 = r4
            r6 = 1
            java.lang.String r7 = "alcCloseDevice"
            r5[r6] = r7
            r5 = r4
            r6 = 2
            java.lang.String r7 = "alcCreateContext"
            r5[r6] = r7
            r5 = r4
            r6 = 3
            java.lang.String r7 = "alcMakeContextCurrent"
            r5[r6] = r7
            r5 = r4
            r6 = 4
            java.lang.String r7 = "alcProcessContext"
            r5[r6] = r7
            r5 = r4
            r6 = 5
            java.lang.String r7 = "alcSuspendContext"
            r5[r6] = r7
            r5 = r4
            r6 = 6
            java.lang.String r7 = "alcDestroyContext"
            r5[r6] = r7
            r5 = r4
            r6 = 7
            java.lang.String r7 = "alcGetCurrentContext"
            r5[r6] = r7
            r5 = r4
            r6 = 8
            java.lang.String r7 = "alcGetContextsDevice"
            r5[r6] = r7
            r5 = r4
            r6 = 9
            java.lang.String r7 = "alcIsExtensionPresent"
            r5[r6] = r7
            r5 = r4
            r6 = 10
            java.lang.String r7 = "alcGetProcAddress"
            r5[r6] = r7
            r5 = r4
            r6 = 11
            java.lang.String r7 = "alcGetEnumValue"
            r5[r6] = r7
            r5 = r4
            r6 = 12
            java.lang.String r7 = "alcGetError"
            r5[r6] = r7
            r5 = r4
            r6 = 13
            java.lang.String r7 = "alcGetString"
            r5[r6] = r7
            r5 = r4
            r6 = 14
            java.lang.String r7 = "alcGetIntegerv"
            r5[r6] = r7
            boolean r0 = org.lwjgl.system.Checks.checkFunctions(r0, r1, r2, r3, r4)
            if (r0 != 0) goto Lcc
            java.lang.String r0 = "ALC"
            java.lang.String r1 = "OpenALC10"
            boolean r0 = org.lwjgl.system.Checks.reportMissing(r0, r1)
            if (r0 == 0) goto Ld0
        Lcc:
            r0 = 1
            goto Ld1
        Ld0:
            r0 = 0
        Ld1:
            return r0
    }

    private static boolean check_ALC11(org.lwjgl.system.FunctionProviderLocal r10, long r11, org.lwjgl.PointerBuffer r13, java.util.Set<java.lang.String> r14) {
            r0 = r14
            java.lang.String r1 = "OpenALC11"
            boolean r0 = r0.contains(r1)
            if (r0 != 0) goto Le
            r0 = 0
            return r0
        Le:
            r0 = r10
            r1 = r11
            r2 = r13
            r3 = 5
            int[] r3 = new int[r3]
            r4 = r3
            r5 = 0
            r6 = 15
            r4[r5] = r6
            r4 = r3
            r5 = 1
            r6 = 16
            r4[r5] = r6
            r4 = r3
            r5 = 2
            r6 = 17
            r4[r5] = r6
            r4 = r3
            r5 = 3
            r6 = 18
            r4[r5] = r6
            r4 = r3
            r5 = 4
            r6 = 19
            r4[r5] = r6
            r4 = 5
            java.lang.String[] r4 = new java.lang.String[r4]
            r5 = r4
            r6 = 0
            java.lang.String r7 = "alcCaptureOpenDevice"
            r5[r6] = r7
            r5 = r4
            r6 = 1
            java.lang.String r7 = "alcCaptureCloseDevice"
            r5[r6] = r7
            r5 = r4
            r6 = 2
            java.lang.String r7 = "alcCaptureStart"
            r5[r6] = r7
            r5 = r4
            r6 = 3
            java.lang.String r7 = "alcCaptureStop"
            r5[r6] = r7
            r5 = r4
            r6 = 4
            java.lang.String r7 = "alcCaptureSamples"
            r5[r6] = r7
            boolean r0 = org.lwjgl.system.Checks.checkFunctions(r0, r1, r2, r3, r4)
            if (r0 != 0) goto L5a
            java.lang.String r0 = "ALC"
            java.lang.String r1 = "OpenALC11"
            boolean r0 = org.lwjgl.system.Checks.reportMissing(r0, r1)
            if (r0 == 0) goto L5e
        L5a:
            r0 = 1
            goto L5f
        L5e:
            r0 = 0
        L5f:
            return r0
    }

    private static boolean check_EXT_CAPTURE(org.lwjgl.system.FunctionProviderLocal r10, long r11, org.lwjgl.PointerBuffer r13, java.util.Set<java.lang.String> r14) {
            r0 = r14
            java.lang.String r1 = "ALC_EXT_CAPTURE"
            boolean r0 = r0.contains(r1)
            if (r0 != 0) goto Le
            r0 = 0
            return r0
        Le:
            r0 = r10
            r1 = r11
            r2 = r13
            r3 = 5
            int[] r3 = new int[r3]
            r4 = r3
            r5 = 0
            r6 = 15
            r4[r5] = r6
            r4 = r3
            r5 = 1
            r6 = 16
            r4[r5] = r6
            r4 = r3
            r5 = 2
            r6 = 17
            r4[r5] = r6
            r4 = r3
            r5 = 3
            r6 = 18
            r4[r5] = r6
            r4 = r3
            r5 = 4
            r6 = 19
            r4[r5] = r6
            r4 = 5
            java.lang.String[] r4 = new java.lang.String[r4]
            r5 = r4
            r6 = 0
            java.lang.String r7 = "alcCaptureOpenDevice"
            r5[r6] = r7
            r5 = r4
            r6 = 1
            java.lang.String r7 = "alcCaptureCloseDevice"
            r5[r6] = r7
            r5 = r4
            r6 = 2
            java.lang.String r7 = "alcCaptureStart"
            r5[r6] = r7
            r5 = r4
            r6 = 3
            java.lang.String r7 = "alcCaptureStop"
            r5[r6] = r7
            r5 = r4
            r6 = 4
            java.lang.String r7 = "alcCaptureSamples"
            r5[r6] = r7
            boolean r0 = org.lwjgl.system.Checks.checkFunctions(r0, r1, r2, r3, r4)
            if (r0 != 0) goto L5a
            java.lang.String r0 = "ALC"
            java.lang.String r1 = "ALC_EXT_CAPTURE"
            boolean r0 = org.lwjgl.system.Checks.reportMissing(r0, r1)
            if (r0 == 0) goto L5e
        L5a:
            r0 = 1
            goto L5f
        L5e:
            r0 = 0
        L5f:
            return r0
    }

    private static boolean check_EXT_thread_local_context(org.lwjgl.system.FunctionProviderLocal r10, long r11, org.lwjgl.PointerBuffer r13, java.util.Set<java.lang.String> r14) {
            r0 = r14
            java.lang.String r1 = "ALC_EXT_thread_local_context"
            boolean r0 = r0.contains(r1)
            if (r0 != 0) goto Le
            r0 = 0
            return r0
        Le:
            r0 = r10
            r1 = r11
            r2 = r13
            r3 = 2
            int[] r3 = new int[r3]
            r4 = r3
            r5 = 0
            r6 = 20
            r4[r5] = r6
            r4 = r3
            r5 = 1
            r6 = 21
            r4[r5] = r6
            r4 = 2
            java.lang.String[] r4 = new java.lang.String[r4]
            r5 = r4
            r6 = 0
            java.lang.String r7 = "alcSetThreadContext"
            r5[r6] = r7
            r5 = r4
            r6 = 1
            java.lang.String r7 = "alcGetThreadContext"
            r5[r6] = r7
            boolean r0 = org.lwjgl.system.Checks.checkFunctions(r0, r1, r2, r3, r4)
            if (r0 != 0) goto L3c
            java.lang.String r0 = "ALC"
            java.lang.String r1 = "ALC_EXT_thread_local_context"
            boolean r0 = org.lwjgl.system.Checks.reportMissing(r0, r1)
            if (r0 == 0) goto L40
        L3c:
            r0 = 1
            goto L41
        L40:
            r0 = 0
        L41:
            return r0
    }

    private static boolean check_SOFT_device_clock(org.lwjgl.system.FunctionProviderLocal r10, long r11, org.lwjgl.PointerBuffer r13, java.util.Set<java.lang.String> r14) {
            r0 = r14
            java.lang.String r1 = "ALC_SOFT_device_clock"
            boolean r0 = r0.contains(r1)
            if (r0 != 0) goto Le
            r0 = 0
            return r0
        Le:
            r0 = r10
            r1 = r11
            r2 = r13
            r3 = 1
            int[] r3 = new int[r3]
            r4 = r3
            r5 = 0
            r6 = 22
            r4[r5] = r6
            r4 = 1
            java.lang.String[] r4 = new java.lang.String[r4]
            r5 = r4
            r6 = 0
            java.lang.String r7 = "alcGetInteger64vSOFT"
            r5[r6] = r7
            boolean r0 = org.lwjgl.system.Checks.checkFunctions(r0, r1, r2, r3, r4)
            if (r0 != 0) goto L32
            java.lang.String r0 = "ALC"
            java.lang.String r1 = "ALC_SOFT_device_clock"
            boolean r0 = org.lwjgl.system.Checks.reportMissing(r0, r1)
            if (r0 == 0) goto L36
        L32:
            r0 = 1
            goto L37
        L36:
            r0 = 0
        L37:
            return r0
    }

    private static boolean check_SOFT_HRTF(org.lwjgl.system.FunctionProviderLocal r10, long r11, org.lwjgl.PointerBuffer r13, java.util.Set<java.lang.String> r14) {
            r0 = r14
            java.lang.String r1 = "ALC_SOFT_HRTF"
            boolean r0 = r0.contains(r1)
            if (r0 != 0) goto Le
            r0 = 0
            return r0
        Le:
            r0 = r10
            r1 = r11
            r2 = r13
            r3 = 2
            int[] r3 = new int[r3]
            r4 = r3
            r5 = 0
            r6 = 23
            r4[r5] = r6
            r4 = r3
            r5 = 1
            r6 = 24
            r4[r5] = r6
            r4 = 2
            java.lang.String[] r4 = new java.lang.String[r4]
            r5 = r4
            r6 = 0
            java.lang.String r7 = "alcGetStringiSOFT"
            r5[r6] = r7
            r5 = r4
            r6 = 1
            java.lang.String r7 = "alcResetDeviceSOFT"
            r5[r6] = r7
            boolean r0 = org.lwjgl.system.Checks.checkFunctions(r0, r1, r2, r3, r4)
            if (r0 != 0) goto L3c
            java.lang.String r0 = "ALC"
            java.lang.String r1 = "ALC_SOFT_HRTF"
            boolean r0 = org.lwjgl.system.Checks.reportMissing(r0, r1)
            if (r0 == 0) goto L40
        L3c:
            r0 = 1
            goto L41
        L40:
            r0 = 0
        L41:
            return r0
    }

    private static boolean check_SOFT_loopback(org.lwjgl.system.FunctionProviderLocal r10, long r11, org.lwjgl.PointerBuffer r13, java.util.Set<java.lang.String> r14) {
            r0 = r14
            java.lang.String r1 = "ALC_SOFT_loopback"
            boolean r0 = r0.contains(r1)
            if (r0 != 0) goto Le
            r0 = 0
            return r0
        Le:
            r0 = r10
            r1 = r11
            r2 = r13
            r3 = 3
            int[] r3 = new int[r3]
            r4 = r3
            r5 = 0
            r6 = 25
            r4[r5] = r6
            r4 = r3
            r5 = 1
            r6 = 26
            r4[r5] = r6
            r4 = r3
            r5 = 2
            r6 = 27
            r4[r5] = r6
            r4 = 3
            java.lang.String[] r4 = new java.lang.String[r4]
            r5 = r4
            r6 = 0
            java.lang.String r7 = "alcLoopbackOpenDeviceSOFT"
            r5[r6] = r7
            r5 = r4
            r6 = 1
            java.lang.String r7 = "alcIsRenderFormatSupportedSOFT"
            r5[r6] = r7
            r5 = r4
            r6 = 2
            java.lang.String r7 = "alcRenderSamplesSOFT"
            r5[r6] = r7
            boolean r0 = org.lwjgl.system.Checks.checkFunctions(r0, r1, r2, r3, r4)
            if (r0 != 0) goto L46
            java.lang.String r0 = "ALC"
            java.lang.String r1 = "ALC_SOFT_loopback"
            boolean r0 = org.lwjgl.system.Checks.reportMissing(r0, r1)
            if (r0 == 0) goto L4a
        L46:
            r0 = 1
            goto L4b
        L4a:
            r0 = 0
        L4b:
            return r0
    }

    private static boolean check_SOFT_pause_device(org.lwjgl.system.FunctionProviderLocal r10, long r11, org.lwjgl.PointerBuffer r13, java.util.Set<java.lang.String> r14) {
            r0 = r14
            java.lang.String r1 = "ALC_SOFT_pause_device"
            boolean r0 = r0.contains(r1)
            if (r0 != 0) goto Le
            r0 = 0
            return r0
        Le:
            r0 = r10
            r1 = r11
            r2 = r13
            r3 = 2
            int[] r3 = new int[r3]
            r4 = r3
            r5 = 0
            r6 = 28
            r4[r5] = r6
            r4 = r3
            r5 = 1
            r6 = 29
            r4[r5] = r6
            r4 = 2
            java.lang.String[] r4 = new java.lang.String[r4]
            r5 = r4
            r6 = 0
            java.lang.String r7 = "alcDevicePauseSOFT"
            r5[r6] = r7
            r5 = r4
            r6 = 1
            java.lang.String r7 = "alcDeviceResumeSOFT"
            r5[r6] = r7
            boolean r0 = org.lwjgl.system.Checks.checkFunctions(r0, r1, r2, r3, r4)
            if (r0 != 0) goto L3c
            java.lang.String r0 = "ALC"
            java.lang.String r1 = "ALC_SOFT_pause_device"
            boolean r0 = org.lwjgl.system.Checks.reportMissing(r0, r1)
            if (r0 == 0) goto L40
        L3c:
            r0 = 1
            goto L41
        L40:
            r0 = 0
        L41:
            return r0
    }

    private static boolean check_SOFT_reopen_device(org.lwjgl.system.FunctionProviderLocal r10, long r11, org.lwjgl.PointerBuffer r13, java.util.Set<java.lang.String> r14) {
            r0 = r14
            java.lang.String r1 = "ALC_SOFT_reopen_device"
            boolean r0 = r0.contains(r1)
            if (r0 != 0) goto Le
            r0 = 0
            return r0
        Le:
            r0 = r10
            r1 = r11
            r2 = r13
            r3 = 1
            int[] r3 = new int[r3]
            r4 = r3
            r5 = 0
            r6 = 30
            r4[r5] = r6
            r4 = 1
            java.lang.String[] r4 = new java.lang.String[r4]
            r5 = r4
            r6 = 0
            java.lang.String r7 = "alcReopenDeviceSOFT"
            r5[r6] = r7
            boolean r0 = org.lwjgl.system.Checks.checkFunctions(r0, r1, r2, r3, r4)
            if (r0 != 0) goto L32
            java.lang.String r0 = "ALC"
            java.lang.String r1 = "ALC_SOFT_reopen_device"
            boolean r0 = org.lwjgl.system.Checks.reportMissing(r0, r1)
            if (r0 == 0) goto L36
        L32:
            r0 = 1
            goto L37
        L36:
            r0 = 0
        L37:
            return r0
    }
}
