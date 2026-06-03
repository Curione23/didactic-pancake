package org.lwjgl.openal;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/openal/AL11.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/openal/AL11.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/openal/AL11.class */
public class AL11 extends org.lwjgl.openal.AL10 {
    public static final int AL_SEC_OFFSET = 4132;
    public static final int AL_SAMPLE_OFFSET = 4133;
    public static final int AL_BYTE_OFFSET = 4134;
    public static final int AL_STATIC = 4136;
    public static final int AL_STREAMING = 4137;
    public static final int AL_UNDETERMINED = 4144;
    public static final int AL_ILLEGAL_COMMAND = 40964;
    public static final int AL_SPEED_OF_SOUND = 49155;
    public static final int AL_LINEAR_DISTANCE = 53251;
    public static final int AL_LINEAR_DISTANCE_CLAMPED = 53252;
    public static final int AL_EXPONENT_DISTANCE = 53253;
    public static final int AL_EXPONENT_DISTANCE_CLAMPED = 53254;

    protected AL11() {
            r3 = this;
            r0 = r3
            r0.<init>()
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r1 = r0
            r1.<init>()
            throw r0
    }

    @org.lwjgl.system.NativeType("ALvoid")
    public static void alListener3i(@org.lwjgl.system.NativeType("ALenum") int r7, @org.lwjgl.system.NativeType("ALint") int r8, @org.lwjgl.system.NativeType("ALint") int r9, @org.lwjgl.system.NativeType("ALint") int r10) {
            org.lwjgl.openal.ALCapabilities r0 = org.lwjgl.openal.AL.getICD()
            long r0 = r0.alListener3i
            r11 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L14
            r0 = r11
            long r0 = org.lwjgl.system.Checks.check(r0)
        L14:
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            org.lwjgl.system.JNI.invokeV(r0, r1, r2, r3, r4)
            return
    }

    public static void nalGetListeneriv(int r6, long r7) {
            org.lwjgl.openal.ALCapabilities r0 = org.lwjgl.openal.AL.getICD()
            long r0 = r0.alGetListeneriv
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

    @org.lwjgl.system.NativeType("ALvoid")
    public static void alGetListeneriv(@org.lwjgl.system.NativeType("ALenum") int r4, @org.lwjgl.system.NativeType("ALint *") java.nio.IntBuffer r5) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r5
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
        Lb:
            r0 = r4
            r1 = r5
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            nalGetListeneriv(r0, r1)
            return
    }

    @org.lwjgl.system.NativeType("ALvoid")
    public static void alSource3i(@org.lwjgl.system.NativeType("ALuint") int r8, @org.lwjgl.system.NativeType("ALenum") int r9, @org.lwjgl.system.NativeType("ALint") int r10, @org.lwjgl.system.NativeType("ALint") int r11, @org.lwjgl.system.NativeType("ALint") int r12) {
            org.lwjgl.openal.ALCapabilities r0 = org.lwjgl.openal.AL.getICD()
            long r0 = r0.alSource3i
            r13 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L14
            r0 = r13
            long r0 = org.lwjgl.system.Checks.check(r0)
        L14:
            r0 = r8
            r1 = r9
            r2 = r10
            r3 = r11
            r4 = r12
            r5 = r13
            org.lwjgl.system.JNI.invokeV(r0, r1, r2, r3, r4, r5)
            return
    }

    public static void nalListeneriv(int r6, long r7) {
            org.lwjgl.openal.ALCapabilities r0 = org.lwjgl.openal.AL.getICD()
            long r0 = r0.alListeneriv
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

    @org.lwjgl.system.NativeType("ALvoid")
    public static void alListeneriv(@org.lwjgl.system.NativeType("ALenum") int r4, @org.lwjgl.system.NativeType("ALint const *") java.nio.IntBuffer r5) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r5
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
        Lb:
            r0 = r4
            r1 = r5
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            nalListeneriv(r0, r1)
            return
    }

    public static void nalSourceiv(int r7, int r8, long r9) {
            org.lwjgl.openal.ALCapabilities r0 = org.lwjgl.openal.AL.getICD()
            long r0 = r0.alSourceiv
            r11 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L14
            r0 = r11
            long r0 = org.lwjgl.system.Checks.check(r0)
        L14:
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = r11
            org.lwjgl.system.JNI.invokePV(r0, r1, r2, r3)
            return
    }

    @org.lwjgl.system.NativeType("ALvoid")
    public static void alSourceiv(@org.lwjgl.system.NativeType("ALuint") int r5, @org.lwjgl.system.NativeType("ALenum") int r6, @org.lwjgl.system.NativeType("ALint const *") java.nio.IntBuffer r7) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r7
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
        Lb:
            r0 = r5
            r1 = r6
            r2 = r7
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            nalSourceiv(r0, r1, r2)
            return
    }

    @org.lwjgl.system.NativeType("ALvoid")
    public static void alBufferf(@org.lwjgl.system.NativeType("ALuint") int r6, @org.lwjgl.system.NativeType("ALenum") int r7, @org.lwjgl.system.NativeType("ALfloat") float r8) {
            org.lwjgl.openal.ALCapabilities r0 = org.lwjgl.openal.AL.getICD()
            long r0 = r0.alBufferf
            r9 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L12
            r0 = r9
            long r0 = org.lwjgl.system.Checks.check(r0)
        L12:
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            org.lwjgl.system.JNI.invokeV(r0, r1, r2, r3)
            return
    }

    @org.lwjgl.system.NativeType("ALvoid")
    public static void alBuffer3f(@org.lwjgl.system.NativeType("ALuint") int r8, @org.lwjgl.system.NativeType("ALenum") int r9, @org.lwjgl.system.NativeType("ALfloat") float r10, @org.lwjgl.system.NativeType("ALfloat") float r11, @org.lwjgl.system.NativeType("ALfloat") float r12) {
            org.lwjgl.openal.ALCapabilities r0 = org.lwjgl.openal.AL.getICD()
            long r0 = r0.alBuffer3f
            r13 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L14
            r0 = r13
            long r0 = org.lwjgl.system.Checks.check(r0)
        L14:
            r0 = r8
            r1 = r9
            r2 = r10
            r3 = r11
            r4 = r12
            r5 = r13
            org.lwjgl.system.JNI.invokeV(r0, r1, r2, r3, r4, r5)
            return
    }

    public static void nalBufferfv(int r7, int r8, long r9) {
            org.lwjgl.openal.ALCapabilities r0 = org.lwjgl.openal.AL.getICD()
            long r0 = r0.alBufferfv
            r11 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L14
            r0 = r11
            long r0 = org.lwjgl.system.Checks.check(r0)
        L14:
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = r11
            org.lwjgl.system.JNI.invokePV(r0, r1, r2, r3)
            return
    }

    @org.lwjgl.system.NativeType("ALvoid")
    public static void alBufferfv(@org.lwjgl.system.NativeType("ALuint") int r5, @org.lwjgl.system.NativeType("ALenum") int r6, @org.lwjgl.system.NativeType("ALfloat const *") java.nio.FloatBuffer r7) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r7
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
        Lb:
            r0 = r5
            r1 = r6
            r2 = r7
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            nalBufferfv(r0, r1, r2)
            return
    }

    @org.lwjgl.system.NativeType("ALvoid")
    public static void alBufferi(@org.lwjgl.system.NativeType("ALuint") int r6, @org.lwjgl.system.NativeType("ALenum") int r7, @org.lwjgl.system.NativeType("ALint") int r8) {
            org.lwjgl.openal.ALCapabilities r0 = org.lwjgl.openal.AL.getICD()
            long r0 = r0.alBufferi
            r9 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L12
            r0 = r9
            long r0 = org.lwjgl.system.Checks.check(r0)
        L12:
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            org.lwjgl.system.JNI.invokeV(r0, r1, r2, r3)
            return
    }

    @org.lwjgl.system.NativeType("ALvoid")
    public static void alBuffer3i(@org.lwjgl.system.NativeType("ALuint") int r8, @org.lwjgl.system.NativeType("ALenum") int r9, @org.lwjgl.system.NativeType("ALint") int r10, @org.lwjgl.system.NativeType("ALint") int r11, @org.lwjgl.system.NativeType("ALint") int r12) {
            org.lwjgl.openal.ALCapabilities r0 = org.lwjgl.openal.AL.getICD()
            long r0 = r0.alBuffer3i
            r13 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L14
            r0 = r13
            long r0 = org.lwjgl.system.Checks.check(r0)
        L14:
            r0 = r8
            r1 = r9
            r2 = r10
            r3 = r11
            r4 = r12
            r5 = r13
            org.lwjgl.system.JNI.invokeV(r0, r1, r2, r3, r4, r5)
            return
    }

    public static void nalBufferiv(int r7, int r8, long r9) {
            org.lwjgl.openal.ALCapabilities r0 = org.lwjgl.openal.AL.getICD()
            long r0 = r0.alBufferiv
            r11 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L14
            r0 = r11
            long r0 = org.lwjgl.system.Checks.check(r0)
        L14:
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = r11
            org.lwjgl.system.JNI.invokePV(r0, r1, r2, r3)
            return
    }

    @org.lwjgl.system.NativeType("ALvoid")
    public static void alBufferiv(@org.lwjgl.system.NativeType("ALuint") int r5, @org.lwjgl.system.NativeType("ALenum") int r6, @org.lwjgl.system.NativeType("ALint const *") java.nio.IntBuffer r7) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r7
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
        Lb:
            r0 = r5
            r1 = r6
            r2 = r7
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            nalBufferiv(r0, r1, r2)
            return
    }

    public static void nalGetBufferiv(int r7, int r8, long r9) {
            org.lwjgl.openal.ALCapabilities r0 = org.lwjgl.openal.AL.getICD()
            long r0 = r0.alGetBufferiv
            r11 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L14
            r0 = r11
            long r0 = org.lwjgl.system.Checks.check(r0)
        L14:
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = r11
            org.lwjgl.system.JNI.invokePV(r0, r1, r2, r3)
            return
    }

    @org.lwjgl.system.NativeType("ALvoid")
    public static void alGetBufferiv(@org.lwjgl.system.NativeType("ALuint") int r5, @org.lwjgl.system.NativeType("ALenum") int r6, @org.lwjgl.system.NativeType("ALint *") java.nio.IntBuffer r7) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r7
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
        Lb:
            r0 = r5
            r1 = r6
            r2 = r7
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            nalGetBufferiv(r0, r1, r2)
            return
    }

    public static void nalGetBufferfv(int r7, int r8, long r9) {
            org.lwjgl.openal.ALCapabilities r0 = org.lwjgl.openal.AL.getICD()
            long r0 = r0.alGetBufferfv
            r11 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L14
            r0 = r11
            long r0 = org.lwjgl.system.Checks.check(r0)
        L14:
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = r11
            org.lwjgl.system.JNI.invokePV(r0, r1, r2, r3)
            return
    }

    @org.lwjgl.system.NativeType("ALvoid")
    public static void alGetBufferfv(@org.lwjgl.system.NativeType("ALuint") int r5, @org.lwjgl.system.NativeType("ALenum") int r6, @org.lwjgl.system.NativeType("ALfloat *") java.nio.FloatBuffer r7) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r7
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
        Lb:
            r0 = r5
            r1 = r6
            r2 = r7
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            nalGetBufferfv(r0, r1, r2)
            return
    }

    @org.lwjgl.system.NativeType("ALvoid")
    public static void alSpeedOfSound(@org.lwjgl.system.NativeType("ALfloat") float r4) {
            org.lwjgl.openal.ALCapabilities r0 = org.lwjgl.openal.AL.getICD()
            long r0 = r0.alSpeedOfSound
            r5 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L12
            r0 = r5
            long r0 = org.lwjgl.system.Checks.check(r0)
        L12:
            r0 = r4
            r1 = r5
            org.lwjgl.system.JNI.invokeV(r0, r1)
            return
    }

    @org.lwjgl.system.NativeType("ALvoid")
    public static void alGetListeneriv(@org.lwjgl.system.NativeType("ALenum") int r5, @org.lwjgl.system.NativeType("ALint *") int[] r6) {
            org.lwjgl.openal.ALCapabilities r0 = org.lwjgl.openal.AL.getICD()
            long r0 = r0.alGetListeneriv
            r7 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L17
            r0 = r7
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r6
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
        L17:
            r0 = r5
            r1 = r6
            r2 = r7
            org.lwjgl.system.JNI.invokePV(r0, r1, r2)
            return
    }

    @org.lwjgl.system.NativeType("ALvoid")
    public static void alListeneriv(@org.lwjgl.system.NativeType("ALenum") int r5, @org.lwjgl.system.NativeType("ALint const *") int[] r6) {
            org.lwjgl.openal.ALCapabilities r0 = org.lwjgl.openal.AL.getICD()
            long r0 = r0.alListeneriv
            r7 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L17
            r0 = r7
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r6
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
        L17:
            r0 = r5
            r1 = r6
            r2 = r7
            org.lwjgl.system.JNI.invokePV(r0, r1, r2)
            return
    }

    @org.lwjgl.system.NativeType("ALvoid")
    public static void alSourceiv(@org.lwjgl.system.NativeType("ALuint") int r6, @org.lwjgl.system.NativeType("ALenum") int r7, @org.lwjgl.system.NativeType("ALint const *") int[] r8) {
            org.lwjgl.openal.ALCapabilities r0 = org.lwjgl.openal.AL.getICD()
            long r0 = r0.alSourceiv
            r9 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L17
            r0 = r9
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r8
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
        L17:
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            org.lwjgl.system.JNI.invokePV(r0, r1, r2, r3)
            return
    }

    @org.lwjgl.system.NativeType("ALvoid")
    public static void alBufferfv(@org.lwjgl.system.NativeType("ALuint") int r6, @org.lwjgl.system.NativeType("ALenum") int r7, @org.lwjgl.system.NativeType("ALfloat const *") float[] r8) {
            org.lwjgl.openal.ALCapabilities r0 = org.lwjgl.openal.AL.getICD()
            long r0 = r0.alBufferfv
            r9 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L17
            r0 = r9
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r8
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
        L17:
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            org.lwjgl.system.JNI.invokePV(r0, r1, r2, r3)
            return
    }

    @org.lwjgl.system.NativeType("ALvoid")
    public static void alBufferiv(@org.lwjgl.system.NativeType("ALuint") int r6, @org.lwjgl.system.NativeType("ALenum") int r7, @org.lwjgl.system.NativeType("ALint const *") int[] r8) {
            org.lwjgl.openal.ALCapabilities r0 = org.lwjgl.openal.AL.getICD()
            long r0 = r0.alBufferiv
            r9 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L17
            r0 = r9
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r8
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
        L17:
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            org.lwjgl.system.JNI.invokePV(r0, r1, r2, r3)
            return
    }

    @org.lwjgl.system.NativeType("ALvoid")
    public static void alGetBufferiv(@org.lwjgl.system.NativeType("ALuint") int r6, @org.lwjgl.system.NativeType("ALenum") int r7, @org.lwjgl.system.NativeType("ALint *") int[] r8) {
            org.lwjgl.openal.ALCapabilities r0 = org.lwjgl.openal.AL.getICD()
            long r0 = r0.alGetBufferiv
            r9 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L17
            r0 = r9
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r8
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
        L17:
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            org.lwjgl.system.JNI.invokePV(r0, r1, r2, r3)
            return
    }

    @org.lwjgl.system.NativeType("ALvoid")
    public static void alGetBufferfv(@org.lwjgl.system.NativeType("ALuint") int r6, @org.lwjgl.system.NativeType("ALenum") int r7, @org.lwjgl.system.NativeType("ALfloat *") float[] r8) {
            org.lwjgl.openal.ALCapabilities r0 = org.lwjgl.openal.AL.getICD()
            long r0 = r0.alGetBufferfv
            r9 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L17
            r0 = r9
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r8
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
        L17:
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            org.lwjgl.system.JNI.invokePV(r0, r1, r2, r3)
            return
    }
}
