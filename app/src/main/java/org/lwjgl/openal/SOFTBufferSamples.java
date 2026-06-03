package org.lwjgl.openal;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/openal/SOFTBufferSamples.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/openal/SOFTBufferSamples.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/openal/SOFTBufferSamples.class */
public class SOFTBufferSamples {
    public static final int AL_MONO8_SOFT = 4352;
    public static final int AL_MONO16_SOFT = 4353;
    public static final int AL_MONO32F_SOFT = 65552;
    public static final int AL_STEREO8_SOFT = 4354;
    public static final int AL_STEREO16_SOFT = 4355;
    public static final int AL_STEREO32F_SOFT = 65553;
    public static final int AL_QUAD8_SOFT = 4612;
    public static final int AL_QUAD16_SOFT = 4613;
    public static final int AL_QUAD32F_SOFT = 4614;
    public static final int AL_REAR8_SOFT = 4615;
    public static final int AL_REAR16_SOFT = 4616;
    public static final int AL_REAR32F_SOFT = 4617;
    public static final int AL_5POINT1_8_SOFT = 4618;
    public static final int AL_5POINT1_16_SOFT = 4619;
    public static final int AL_5POINT1_32F_SOFT = 4620;
    public static final int AL_6POINT1_8_SOFT = 4621;
    public static final int AL_6POINT1_16_SOFT = 4622;
    public static final int AL_6POINT1_32F_SOFT = 4623;
    public static final int AL_7POINT1_8_SOFT = 4624;
    public static final int AL_7POINT1_16_SOFT = 4625;
    public static final int AL_7POINT1_32F_SOFT = 4626;
    public static final int AL_MONO_SOFT = 5376;
    public static final int AL_STEREO_SOFT = 5377;
    public static final int AL_QUAD_SOFT = 5378;
    public static final int AL_REAR_SOFT = 5379;
    public static final int AL_5POINT1_SOFT = 5380;
    public static final int AL_6POINT1_SOFT = 5381;
    public static final int AL_7POINT1_SOFT = 5382;
    public static final int AL_BYTE_SOFT = 5120;
    public static final int AL_UNSIGNED_BYTE_SOFT = 5121;
    public static final int AL_SHORT_SOFT = 5122;
    public static final int AL_UNSIGNED_SHORT_SOFT = 5123;
    public static final int AL_INT_SOFT = 5124;
    public static final int AL_UNSIGNED_INT_SOFT = 5125;
    public static final int AL_FLOAT_SOFT = 5126;
    public static final int AL_DOUBLE_SOFT = 5127;
    public static final int AL_BYTE3_SOFT = 5128;
    public static final int AL_UNSIGNED_BYTE3_SOFT = 5129;
    public static final int AL_INTERNAL_FORMAT_SOFT = 8200;
    public static final int AL_BYTE_LENGTH_SOFT = 8201;
    public static final int AL_SAMPLE_LENGTH_SOFT = 8202;
    public static final int AL_SEC_LENGTH_SOFT = 8203;
    public static final int AL_BYTE_RW_OFFSETS_SOFT = 4145;
    public static final int AL_SAMPLE_RW_OFFSETS_SOFT = 4146;

    protected SOFTBufferSamples() {
            r3 = this;
            r0 = r3
            r0.<init>()
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r1 = r0
            r1.<init>()
            throw r0
    }

    public static void nalBufferSamplesSOFT(int r11, int r12, int r13, int r14, int r15, int r16, long r17) {
            org.lwjgl.openal.ALCapabilities r0 = org.lwjgl.openal.AL.getICD()
            long r0 = r0.alBufferSamplesSOFT
            r19 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L14
            r0 = r19
            long r0 = org.lwjgl.system.Checks.check(r0)
        L14:
            r0 = r11
            r1 = r12
            r2 = r13
            r3 = r14
            r4 = r15
            r5 = r16
            r6 = r17
            r7 = r19
            org.lwjgl.system.JNI.invokePV(r0, r1, r2, r3, r4, r5, r6, r7)
            return
    }

    public static void alBufferSamplesSOFT(@org.lwjgl.system.NativeType("ALuint") int r9, @org.lwjgl.system.NativeType("ALuint") int r10, @org.lwjgl.system.NativeType("ALenum") int r11, @org.lwjgl.system.NativeType("ALsizei") int r12, @org.lwjgl.system.NativeType("ALenum") int r13, @org.lwjgl.system.NativeType("ALenum") int r14, @org.lwjgl.system.NativeType("ALvoid const *") java.nio.ByteBuffer r15) {
            r0 = r9
            r1 = r10
            r2 = r11
            r3 = r12
            r4 = r13
            r5 = r14
            r6 = r15
            long r6 = org.lwjgl.system.MemoryUtil.memAddress(r6)
            nalBufferSamplesSOFT(r0, r1, r2, r3, r4, r5, r6)
            return
    }

    public static void alBufferSamplesSOFT(@org.lwjgl.system.NativeType("ALuint") int r9, @org.lwjgl.system.NativeType("ALuint") int r10, @org.lwjgl.system.NativeType("ALenum") int r11, @org.lwjgl.system.NativeType("ALsizei") int r12, @org.lwjgl.system.NativeType("ALenum") int r13, @org.lwjgl.system.NativeType("ALenum") int r14, @org.lwjgl.system.NativeType("ALvoid const *") java.nio.ShortBuffer r15) {
            r0 = r9
            r1 = r10
            r2 = r11
            r3 = r12
            r4 = r13
            r5 = r14
            r6 = r15
            long r6 = org.lwjgl.system.MemoryUtil.memAddress(r6)
            nalBufferSamplesSOFT(r0, r1, r2, r3, r4, r5, r6)
            return
    }

    public static void alBufferSamplesSOFT(@org.lwjgl.system.NativeType("ALuint") int r9, @org.lwjgl.system.NativeType("ALuint") int r10, @org.lwjgl.system.NativeType("ALenum") int r11, @org.lwjgl.system.NativeType("ALsizei") int r12, @org.lwjgl.system.NativeType("ALenum") int r13, @org.lwjgl.system.NativeType("ALenum") int r14, @org.lwjgl.system.NativeType("ALvoid const *") java.nio.IntBuffer r15) {
            r0 = r9
            r1 = r10
            r2 = r11
            r3 = r12
            r4 = r13
            r5 = r14
            r6 = r15
            long r6 = org.lwjgl.system.MemoryUtil.memAddress(r6)
            nalBufferSamplesSOFT(r0, r1, r2, r3, r4, r5, r6)
            return
    }

    public static void alBufferSamplesSOFT(@org.lwjgl.system.NativeType("ALuint") int r9, @org.lwjgl.system.NativeType("ALuint") int r10, @org.lwjgl.system.NativeType("ALenum") int r11, @org.lwjgl.system.NativeType("ALsizei") int r12, @org.lwjgl.system.NativeType("ALenum") int r13, @org.lwjgl.system.NativeType("ALenum") int r14, @org.lwjgl.system.NativeType("ALvoid const *") java.nio.FloatBuffer r15) {
            r0 = r9
            r1 = r10
            r2 = r11
            r3 = r12
            r4 = r13
            r5 = r14
            r6 = r15
            long r6 = org.lwjgl.system.MemoryUtil.memAddress(r6)
            nalBufferSamplesSOFT(r0, r1, r2, r3, r4, r5, r6)
            return
    }

    public static void alBufferSamplesSOFT(@org.lwjgl.system.NativeType("ALuint") int r9, @org.lwjgl.system.NativeType("ALuint") int r10, @org.lwjgl.system.NativeType("ALenum") int r11, @org.lwjgl.system.NativeType("ALsizei") int r12, @org.lwjgl.system.NativeType("ALenum") int r13, @org.lwjgl.system.NativeType("ALenum") int r14, @org.lwjgl.system.NativeType("ALvoid const *") java.nio.DoubleBuffer r15) {
            r0 = r9
            r1 = r10
            r2 = r11
            r3 = r12
            r4 = r13
            r5 = r14
            r6 = r15
            long r6 = org.lwjgl.system.MemoryUtil.memAddress(r6)
            nalBufferSamplesSOFT(r0, r1, r2, r3, r4, r5, r6)
            return
    }

    public static void nalBufferSubSamplesSOFT(int r10, int r11, int r12, int r13, int r14, long r15) {
            org.lwjgl.openal.ALCapabilities r0 = org.lwjgl.openal.AL.getICD()
            long r0 = r0.alBufferSubSamplesSOFT
            r17 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L14
            r0 = r17
            long r0 = org.lwjgl.system.Checks.check(r0)
        L14:
            r0 = r10
            r1 = r11
            r2 = r12
            r3 = r13
            r4 = r14
            r5 = r15
            r6 = r17
            org.lwjgl.system.JNI.invokePV(r0, r1, r2, r3, r4, r5, r6)
            return
    }

    public static void alBufferSubSamplesSOFT(@org.lwjgl.system.NativeType("ALuint") int r8, @org.lwjgl.system.NativeType("ALsizei") int r9, @org.lwjgl.system.NativeType("ALsizei") int r10, @org.lwjgl.system.NativeType("ALenum") int r11, @org.lwjgl.system.NativeType("ALenum") int r12, @org.lwjgl.system.NativeType("ALvoid const *") java.nio.ByteBuffer r13) {
            r0 = r8
            r1 = r9
            r2 = r10
            r3 = r11
            r4 = r12
            r5 = r13
            long r5 = org.lwjgl.system.MemoryUtil.memAddress(r5)
            nalBufferSubSamplesSOFT(r0, r1, r2, r3, r4, r5)
            return
    }

    public static void alBufferSubSamplesSOFT(@org.lwjgl.system.NativeType("ALuint") int r8, @org.lwjgl.system.NativeType("ALsizei") int r9, @org.lwjgl.system.NativeType("ALsizei") int r10, @org.lwjgl.system.NativeType("ALenum") int r11, @org.lwjgl.system.NativeType("ALenum") int r12, @org.lwjgl.system.NativeType("ALvoid const *") java.nio.ShortBuffer r13) {
            r0 = r8
            r1 = r9
            r2 = r10
            r3 = r11
            r4 = r12
            r5 = r13
            long r5 = org.lwjgl.system.MemoryUtil.memAddress(r5)
            nalBufferSubSamplesSOFT(r0, r1, r2, r3, r4, r5)
            return
    }

    public static void alBufferSubSamplesSOFT(@org.lwjgl.system.NativeType("ALuint") int r8, @org.lwjgl.system.NativeType("ALsizei") int r9, @org.lwjgl.system.NativeType("ALsizei") int r10, @org.lwjgl.system.NativeType("ALenum") int r11, @org.lwjgl.system.NativeType("ALenum") int r12, @org.lwjgl.system.NativeType("ALvoid const *") java.nio.IntBuffer r13) {
            r0 = r8
            r1 = r9
            r2 = r10
            r3 = r11
            r4 = r12
            r5 = r13
            long r5 = org.lwjgl.system.MemoryUtil.memAddress(r5)
            nalBufferSubSamplesSOFT(r0, r1, r2, r3, r4, r5)
            return
    }

    public static void alBufferSubSamplesSOFT(@org.lwjgl.system.NativeType("ALuint") int r8, @org.lwjgl.system.NativeType("ALsizei") int r9, @org.lwjgl.system.NativeType("ALsizei") int r10, @org.lwjgl.system.NativeType("ALenum") int r11, @org.lwjgl.system.NativeType("ALenum") int r12, @org.lwjgl.system.NativeType("ALvoid const *") java.nio.FloatBuffer r13) {
            r0 = r8
            r1 = r9
            r2 = r10
            r3 = r11
            r4 = r12
            r5 = r13
            long r5 = org.lwjgl.system.MemoryUtil.memAddress(r5)
            nalBufferSubSamplesSOFT(r0, r1, r2, r3, r4, r5)
            return
    }

    public static void alBufferSubSamplesSOFT(@org.lwjgl.system.NativeType("ALuint") int r8, @org.lwjgl.system.NativeType("ALsizei") int r9, @org.lwjgl.system.NativeType("ALsizei") int r10, @org.lwjgl.system.NativeType("ALenum") int r11, @org.lwjgl.system.NativeType("ALenum") int r12, @org.lwjgl.system.NativeType("ALvoid const *") java.nio.DoubleBuffer r13) {
            r0 = r8
            r1 = r9
            r2 = r10
            r3 = r11
            r4 = r12
            r5 = r13
            long r5 = org.lwjgl.system.MemoryUtil.memAddress(r5)
            nalBufferSubSamplesSOFT(r0, r1, r2, r3, r4, r5)
            return
    }

    public static void nalGetBufferSamplesSOFT(int r10, int r11, int r12, int r13, int r14, long r15) {
            org.lwjgl.openal.ALCapabilities r0 = org.lwjgl.openal.AL.getICD()
            long r0 = r0.alGetBufferSamplesSOFT
            r17 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L14
            r0 = r17
            long r0 = org.lwjgl.system.Checks.check(r0)
        L14:
            r0 = r10
            r1 = r11
            r2 = r12
            r3 = r13
            r4 = r14
            r5 = r15
            r6 = r17
            org.lwjgl.system.JNI.invokePV(r0, r1, r2, r3, r4, r5, r6)
            return
    }

    public static void alGetBufferSamplesSOFT(@org.lwjgl.system.NativeType("ALuint") int r8, @org.lwjgl.system.NativeType("ALsizei") int r9, @org.lwjgl.system.NativeType("ALsizei") int r10, @org.lwjgl.system.NativeType("ALenum") int r11, @org.lwjgl.system.NativeType("ALenum") int r12, @org.lwjgl.system.NativeType("ALvoid *") java.nio.ByteBuffer r13) {
            r0 = r8
            r1 = r9
            r2 = r10
            r3 = r11
            r4 = r12
            r5 = r13
            long r5 = org.lwjgl.system.MemoryUtil.memAddress(r5)
            nalGetBufferSamplesSOFT(r0, r1, r2, r3, r4, r5)
            return
    }

    public static void alGetBufferSamplesSOFT(@org.lwjgl.system.NativeType("ALuint") int r8, @org.lwjgl.system.NativeType("ALsizei") int r9, @org.lwjgl.system.NativeType("ALsizei") int r10, @org.lwjgl.system.NativeType("ALenum") int r11, @org.lwjgl.system.NativeType("ALenum") int r12, @org.lwjgl.system.NativeType("ALvoid *") java.nio.ShortBuffer r13) {
            r0 = r8
            r1 = r9
            r2 = r10
            r3 = r11
            r4 = r12
            r5 = r13
            long r5 = org.lwjgl.system.MemoryUtil.memAddress(r5)
            nalGetBufferSamplesSOFT(r0, r1, r2, r3, r4, r5)
            return
    }

    public static void alGetBufferSamplesSOFT(@org.lwjgl.system.NativeType("ALuint") int r8, @org.lwjgl.system.NativeType("ALsizei") int r9, @org.lwjgl.system.NativeType("ALsizei") int r10, @org.lwjgl.system.NativeType("ALenum") int r11, @org.lwjgl.system.NativeType("ALenum") int r12, @org.lwjgl.system.NativeType("ALvoid *") java.nio.IntBuffer r13) {
            r0 = r8
            r1 = r9
            r2 = r10
            r3 = r11
            r4 = r12
            r5 = r13
            long r5 = org.lwjgl.system.MemoryUtil.memAddress(r5)
            nalGetBufferSamplesSOFT(r0, r1, r2, r3, r4, r5)
            return
    }

    public static void alGetBufferSamplesSOFT(@org.lwjgl.system.NativeType("ALuint") int r8, @org.lwjgl.system.NativeType("ALsizei") int r9, @org.lwjgl.system.NativeType("ALsizei") int r10, @org.lwjgl.system.NativeType("ALenum") int r11, @org.lwjgl.system.NativeType("ALenum") int r12, @org.lwjgl.system.NativeType("ALvoid *") java.nio.FloatBuffer r13) {
            r0 = r8
            r1 = r9
            r2 = r10
            r3 = r11
            r4 = r12
            r5 = r13
            long r5 = org.lwjgl.system.MemoryUtil.memAddress(r5)
            nalGetBufferSamplesSOFT(r0, r1, r2, r3, r4, r5)
            return
    }

    public static void alGetBufferSamplesSOFT(@org.lwjgl.system.NativeType("ALuint") int r8, @org.lwjgl.system.NativeType("ALsizei") int r9, @org.lwjgl.system.NativeType("ALsizei") int r10, @org.lwjgl.system.NativeType("ALenum") int r11, @org.lwjgl.system.NativeType("ALenum") int r12, @org.lwjgl.system.NativeType("ALvoid *") java.nio.DoubleBuffer r13) {
            r0 = r8
            r1 = r9
            r2 = r10
            r3 = r11
            r4 = r12
            r5 = r13
            long r5 = org.lwjgl.system.MemoryUtil.memAddress(r5)
            nalGetBufferSamplesSOFT(r0, r1, r2, r3, r4, r5)
            return
    }

    @org.lwjgl.system.NativeType("ALboolean")
    public static boolean alIsBufferFormatSupportedSOFT(@org.lwjgl.system.NativeType("ALenum") int r4) {
            org.lwjgl.openal.ALCapabilities r0 = org.lwjgl.openal.AL.getICD()
            long r0 = r0.alIsBufferFormatSupportedSOFT
            r5 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L12
            r0 = r5
            long r0 = org.lwjgl.system.Checks.check(r0)
        L12:
            r0 = r4
            r1 = r5
            boolean r0 = org.lwjgl.system.JNI.invokeZ(r0, r1)
            return r0
    }

    public static void alBufferSamplesSOFT(@org.lwjgl.system.NativeType("ALuint") int r10, @org.lwjgl.system.NativeType("ALuint") int r11, @org.lwjgl.system.NativeType("ALenum") int r12, @org.lwjgl.system.NativeType("ALsizei") int r13, @org.lwjgl.system.NativeType("ALenum") int r14, @org.lwjgl.system.NativeType("ALenum") int r15, @org.lwjgl.system.NativeType("ALvoid const *") short[] r16) {
            org.lwjgl.openal.ALCapabilities r0 = org.lwjgl.openal.AL.getICD()
            long r0 = r0.alBufferSamplesSOFT
            r17 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L14
            r0 = r17
            long r0 = org.lwjgl.system.Checks.check(r0)
        L14:
            r0 = r10
            r1 = r11
            r2 = r12
            r3 = r13
            r4 = r14
            r5 = r15
            r6 = r16
            r7 = r17
            org.lwjgl.system.JNI.invokePV(r0, r1, r2, r3, r4, r5, r6, r7)
            return
    }

    public static void alBufferSamplesSOFT(@org.lwjgl.system.NativeType("ALuint") int r10, @org.lwjgl.system.NativeType("ALuint") int r11, @org.lwjgl.system.NativeType("ALenum") int r12, @org.lwjgl.system.NativeType("ALsizei") int r13, @org.lwjgl.system.NativeType("ALenum") int r14, @org.lwjgl.system.NativeType("ALenum") int r15, @org.lwjgl.system.NativeType("ALvoid const *") int[] r16) {
            org.lwjgl.openal.ALCapabilities r0 = org.lwjgl.openal.AL.getICD()
            long r0 = r0.alBufferSamplesSOFT
            r17 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L14
            r0 = r17
            long r0 = org.lwjgl.system.Checks.check(r0)
        L14:
            r0 = r10
            r1 = r11
            r2 = r12
            r3 = r13
            r4 = r14
            r5 = r15
            r6 = r16
            r7 = r17
            org.lwjgl.system.JNI.invokePV(r0, r1, r2, r3, r4, r5, r6, r7)
            return
    }

    public static void alBufferSamplesSOFT(@org.lwjgl.system.NativeType("ALuint") int r10, @org.lwjgl.system.NativeType("ALuint") int r11, @org.lwjgl.system.NativeType("ALenum") int r12, @org.lwjgl.system.NativeType("ALsizei") int r13, @org.lwjgl.system.NativeType("ALenum") int r14, @org.lwjgl.system.NativeType("ALenum") int r15, @org.lwjgl.system.NativeType("ALvoid const *") float[] r16) {
            org.lwjgl.openal.ALCapabilities r0 = org.lwjgl.openal.AL.getICD()
            long r0 = r0.alBufferSamplesSOFT
            r17 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L14
            r0 = r17
            long r0 = org.lwjgl.system.Checks.check(r0)
        L14:
            r0 = r10
            r1 = r11
            r2 = r12
            r3 = r13
            r4 = r14
            r5 = r15
            r6 = r16
            r7 = r17
            org.lwjgl.system.JNI.invokePV(r0, r1, r2, r3, r4, r5, r6, r7)
            return
    }

    public static void alBufferSamplesSOFT(@org.lwjgl.system.NativeType("ALuint") int r10, @org.lwjgl.system.NativeType("ALuint") int r11, @org.lwjgl.system.NativeType("ALenum") int r12, @org.lwjgl.system.NativeType("ALsizei") int r13, @org.lwjgl.system.NativeType("ALenum") int r14, @org.lwjgl.system.NativeType("ALenum") int r15, @org.lwjgl.system.NativeType("ALvoid const *") double[] r16) {
            org.lwjgl.openal.ALCapabilities r0 = org.lwjgl.openal.AL.getICD()
            long r0 = r0.alBufferSamplesSOFT
            r17 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L14
            r0 = r17
            long r0 = org.lwjgl.system.Checks.check(r0)
        L14:
            r0 = r10
            r1 = r11
            r2 = r12
            r3 = r13
            r4 = r14
            r5 = r15
            r6 = r16
            r7 = r17
            org.lwjgl.system.JNI.invokePV(r0, r1, r2, r3, r4, r5, r6, r7)
            return
    }

    public static void alBufferSubSamplesSOFT(@org.lwjgl.system.NativeType("ALuint") int r9, @org.lwjgl.system.NativeType("ALsizei") int r10, @org.lwjgl.system.NativeType("ALsizei") int r11, @org.lwjgl.system.NativeType("ALenum") int r12, @org.lwjgl.system.NativeType("ALenum") int r13, @org.lwjgl.system.NativeType("ALvoid const *") short[] r14) {
            org.lwjgl.openal.ALCapabilities r0 = org.lwjgl.openal.AL.getICD()
            long r0 = r0.alBufferSubSamplesSOFT
            r15 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L14
            r0 = r15
            long r0 = org.lwjgl.system.Checks.check(r0)
        L14:
            r0 = r9
            r1 = r10
            r2 = r11
            r3 = r12
            r4 = r13
            r5 = r14
            r6 = r15
            org.lwjgl.system.JNI.invokePV(r0, r1, r2, r3, r4, r5, r6)
            return
    }

    public static void alBufferSubSamplesSOFT(@org.lwjgl.system.NativeType("ALuint") int r9, @org.lwjgl.system.NativeType("ALsizei") int r10, @org.lwjgl.system.NativeType("ALsizei") int r11, @org.lwjgl.system.NativeType("ALenum") int r12, @org.lwjgl.system.NativeType("ALenum") int r13, @org.lwjgl.system.NativeType("ALvoid const *") int[] r14) {
            org.lwjgl.openal.ALCapabilities r0 = org.lwjgl.openal.AL.getICD()
            long r0 = r0.alBufferSubSamplesSOFT
            r15 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L14
            r0 = r15
            long r0 = org.lwjgl.system.Checks.check(r0)
        L14:
            r0 = r9
            r1 = r10
            r2 = r11
            r3 = r12
            r4 = r13
            r5 = r14
            r6 = r15
            org.lwjgl.system.JNI.invokePV(r0, r1, r2, r3, r4, r5, r6)
            return
    }

    public static void alBufferSubSamplesSOFT(@org.lwjgl.system.NativeType("ALuint") int r9, @org.lwjgl.system.NativeType("ALsizei") int r10, @org.lwjgl.system.NativeType("ALsizei") int r11, @org.lwjgl.system.NativeType("ALenum") int r12, @org.lwjgl.system.NativeType("ALenum") int r13, @org.lwjgl.system.NativeType("ALvoid const *") float[] r14) {
            org.lwjgl.openal.ALCapabilities r0 = org.lwjgl.openal.AL.getICD()
            long r0 = r0.alBufferSubSamplesSOFT
            r15 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L14
            r0 = r15
            long r0 = org.lwjgl.system.Checks.check(r0)
        L14:
            r0 = r9
            r1 = r10
            r2 = r11
            r3 = r12
            r4 = r13
            r5 = r14
            r6 = r15
            org.lwjgl.system.JNI.invokePV(r0, r1, r2, r3, r4, r5, r6)
            return
    }

    public static void alBufferSubSamplesSOFT(@org.lwjgl.system.NativeType("ALuint") int r9, @org.lwjgl.system.NativeType("ALsizei") int r10, @org.lwjgl.system.NativeType("ALsizei") int r11, @org.lwjgl.system.NativeType("ALenum") int r12, @org.lwjgl.system.NativeType("ALenum") int r13, @org.lwjgl.system.NativeType("ALvoid const *") double[] r14) {
            org.lwjgl.openal.ALCapabilities r0 = org.lwjgl.openal.AL.getICD()
            long r0 = r0.alBufferSubSamplesSOFT
            r15 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L14
            r0 = r15
            long r0 = org.lwjgl.system.Checks.check(r0)
        L14:
            r0 = r9
            r1 = r10
            r2 = r11
            r3 = r12
            r4 = r13
            r5 = r14
            r6 = r15
            org.lwjgl.system.JNI.invokePV(r0, r1, r2, r3, r4, r5, r6)
            return
    }

    public static void alGetBufferSamplesSOFT(@org.lwjgl.system.NativeType("ALuint") int r9, @org.lwjgl.system.NativeType("ALsizei") int r10, @org.lwjgl.system.NativeType("ALsizei") int r11, @org.lwjgl.system.NativeType("ALenum") int r12, @org.lwjgl.system.NativeType("ALenum") int r13, @org.lwjgl.system.NativeType("ALvoid *") short[] r14) {
            org.lwjgl.openal.ALCapabilities r0 = org.lwjgl.openal.AL.getICD()
            long r0 = r0.alGetBufferSamplesSOFT
            r15 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L14
            r0 = r15
            long r0 = org.lwjgl.system.Checks.check(r0)
        L14:
            r0 = r9
            r1 = r10
            r2 = r11
            r3 = r12
            r4 = r13
            r5 = r14
            r6 = r15
            org.lwjgl.system.JNI.invokePV(r0, r1, r2, r3, r4, r5, r6)
            return
    }

    public static void alGetBufferSamplesSOFT(@org.lwjgl.system.NativeType("ALuint") int r9, @org.lwjgl.system.NativeType("ALsizei") int r10, @org.lwjgl.system.NativeType("ALsizei") int r11, @org.lwjgl.system.NativeType("ALenum") int r12, @org.lwjgl.system.NativeType("ALenum") int r13, @org.lwjgl.system.NativeType("ALvoid *") int[] r14) {
            org.lwjgl.openal.ALCapabilities r0 = org.lwjgl.openal.AL.getICD()
            long r0 = r0.alGetBufferSamplesSOFT
            r15 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L14
            r0 = r15
            long r0 = org.lwjgl.system.Checks.check(r0)
        L14:
            r0 = r9
            r1 = r10
            r2 = r11
            r3 = r12
            r4 = r13
            r5 = r14
            r6 = r15
            org.lwjgl.system.JNI.invokePV(r0, r1, r2, r3, r4, r5, r6)
            return
    }

    public static void alGetBufferSamplesSOFT(@org.lwjgl.system.NativeType("ALuint") int r9, @org.lwjgl.system.NativeType("ALsizei") int r10, @org.lwjgl.system.NativeType("ALsizei") int r11, @org.lwjgl.system.NativeType("ALenum") int r12, @org.lwjgl.system.NativeType("ALenum") int r13, @org.lwjgl.system.NativeType("ALvoid *") float[] r14) {
            org.lwjgl.openal.ALCapabilities r0 = org.lwjgl.openal.AL.getICD()
            long r0 = r0.alGetBufferSamplesSOFT
            r15 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L14
            r0 = r15
            long r0 = org.lwjgl.system.Checks.check(r0)
        L14:
            r0 = r9
            r1 = r10
            r2 = r11
            r3 = r12
            r4 = r13
            r5 = r14
            r6 = r15
            org.lwjgl.system.JNI.invokePV(r0, r1, r2, r3, r4, r5, r6)
            return
    }

    public static void alGetBufferSamplesSOFT(@org.lwjgl.system.NativeType("ALuint") int r9, @org.lwjgl.system.NativeType("ALsizei") int r10, @org.lwjgl.system.NativeType("ALsizei") int r11, @org.lwjgl.system.NativeType("ALenum") int r12, @org.lwjgl.system.NativeType("ALenum") int r13, @org.lwjgl.system.NativeType("ALvoid *") double[] r14) {
            org.lwjgl.openal.ALCapabilities r0 = org.lwjgl.openal.AL.getICD()
            long r0 = r0.alGetBufferSamplesSOFT
            r15 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L14
            r0 = r15
            long r0 = org.lwjgl.system.Checks.check(r0)
        L14:
            r0 = r9
            r1 = r10
            r2 = r11
            r3 = r12
            r4 = r13
            r5 = r14
            r6 = r15
            org.lwjgl.system.JNI.invokePV(r0, r1, r2, r3, r4, r5, r6)
            return
    }
}
