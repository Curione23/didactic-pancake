package org.lwjgl.openal;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/openal/SOFTSourceResampler.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/openal/SOFTSourceResampler.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/openal/SOFTSourceResampler.class */
public class SOFTSourceResampler {
    public static final int AL_NUM_RESAMPLERS_SOFT = 4624;
    public static final int AL_DEFAULT_RESAMPLER_SOFT = 4625;
    public static final int AL_SOURCE_RESAMPLER_SOFT = 4626;
    public static final int AL_RESAMPLER_NAME_SOFT = 4627;

    protected SOFTSourceResampler() {
            r3 = this;
            r0 = r3
            r0.<init>()
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r1 = r0
            r1.<init>()
            throw r0
    }

    public static long nalGetStringiSOFT(int r5, int r6) {
            org.lwjgl.openal.ALCapabilities r0 = org.lwjgl.openal.AL.getICD()
            long r0 = r0.alGetStringiSOFT
            r7 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L12
            r0 = r7
            long r0 = org.lwjgl.system.Checks.check(r0)
        L12:
            r0 = r5
            r1 = r6
            r2 = r7
            long r0 = org.lwjgl.system.JNI.invokeP(r0, r1, r2)
            return r0
    }

    @javax.annotation.Nullable
    @org.lwjgl.system.NativeType("ALchar const *")
    public static java.lang.String alGetStringiSOFT(@org.lwjgl.system.NativeType("ALenum") int r3, @org.lwjgl.system.NativeType("ALsizei") int r4) {
            r0 = r3
            r1 = r4
            long r0 = nalGetStringiSOFT(r0, r1)
            r5 = r0
            r0 = r5
            java.lang.String r0 = org.lwjgl.system.MemoryUtil.memUTF8Safe(r0)
            return r0
    }
}
