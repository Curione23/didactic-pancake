package org.lwjgl.openal;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/openal/SOFTSourceLatency.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/openal/SOFTSourceLatency.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/openal/SOFTSourceLatency.class */
public class SOFTSourceLatency {
    public static final int AL_SAMPLE_OFFSET_LATENCY_SOFT = 4608;
    public static final int AL_SEC_OFFSET_LATENCY_SOFT = 4609;

    protected SOFTSourceLatency() {
            r3 = this;
            r0 = r3
            r0.<init>()
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r1 = r0
            r1.<init>()
            throw r0
    }

    @org.lwjgl.system.NativeType("ALvoid")
    public static void alSourcedSOFT(@org.lwjgl.system.NativeType("ALuint") int r7, @org.lwjgl.system.NativeType("ALenum") int r8, @org.lwjgl.system.NativeType("ALdouble") double r9) {
            org.lwjgl.openal.ALCapabilities r0 = org.lwjgl.openal.AL.getICD()
            long r0 = r0.alSourcedSOFT
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
            org.lwjgl.system.JNI.invokeV(r0, r1, r2, r3)
            return
    }

    @org.lwjgl.system.NativeType("ALvoid")
    public static void alSource3dSOFT(@org.lwjgl.system.NativeType("ALuint") int r11, @org.lwjgl.system.NativeType("ALenum") int r12, @org.lwjgl.system.NativeType("ALdouble") double r13, @org.lwjgl.system.NativeType("ALdouble") double r15, @org.lwjgl.system.NativeType("ALdouble") double r17) {
            org.lwjgl.openal.ALCapabilities r0 = org.lwjgl.openal.AL.getICD()
            long r0 = r0.alSource3dSOFT
            r19 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L14
            r0 = r19
            long r0 = org.lwjgl.system.Checks.check(r0)
        L14:
            r0 = r11
            r1 = r12
            r2 = r13
            r3 = r15
            r4 = r17
            r5 = r19
            org.lwjgl.system.JNI.invokeV(r0, r1, r2, r3, r4, r5)
            return
    }

    public static void nalSourcedvSOFT(int r7, int r8, long r9) {
            org.lwjgl.openal.ALCapabilities r0 = org.lwjgl.openal.AL.getICD()
            long r0 = r0.alSourcedvSOFT
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
    public static void alSourcedvSOFT(@org.lwjgl.system.NativeType("ALuint") int r5, @org.lwjgl.system.NativeType("ALenum") int r6, @org.lwjgl.system.NativeType("ALdouble const *") java.nio.DoubleBuffer r7) {
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
            nalSourcedvSOFT(r0, r1, r2)
            return
    }

    public static void nalGetSourcedSOFT(int r7, int r8, long r9) {
            org.lwjgl.openal.ALCapabilities r0 = org.lwjgl.openal.AL.getICD()
            long r0 = r0.alGetSourcedSOFT
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
    public static void alGetSourcedSOFT(@org.lwjgl.system.NativeType("ALuint") int r5, @org.lwjgl.system.NativeType("ALenum") int r6, @org.lwjgl.system.NativeType("ALdouble *") java.nio.DoubleBuffer r7) {
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
            nalGetSourcedSOFT(r0, r1, r2)
            return
    }

    @org.lwjgl.system.NativeType("ALvoid")
    public static double alGetSourcedSOFT(@org.lwjgl.system.NativeType("ALuint") int r5, @org.lwjgl.system.NativeType("ALenum") int r6) {
            org.lwjgl.system.MemoryStack r0 = org.lwjgl.system.MemoryStack.stackGet()
            r7 = r0
            r0 = r7
            int r0 = r0.getPointer()
            r8 = r0
            r0 = r7
            r1 = 1
            java.nio.DoubleBuffer r0 = r0.callocDouble(r1)     // Catch: java.lang.Throwable -> L2a
            r9 = r0
            r0 = r5
            r1 = r6
            r2 = r9
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)     // Catch: java.lang.Throwable -> L2a
            nalGetSourcedSOFT(r0, r1, r2)     // Catch: java.lang.Throwable -> L2a
            r0 = r9
            r1 = 0
            double r0 = r0.get(r1)     // Catch: java.lang.Throwable -> L2a
            r10 = r0
            r0 = r7
            r1 = r8
            r0.setPointer(r1)
            r0 = r10
            return r0
        L2a:
            r12 = move-exception
            r0 = r7
            r1 = r8
            r0.setPointer(r1)
            r0 = r12
            throw r0
    }

    public static void nalGetSource3dSOFT(int r11, int r12, long r13, long r15, long r17) {
            org.lwjgl.openal.ALCapabilities r0 = org.lwjgl.openal.AL.getICD()
            long r0 = r0.alGetSource3dSOFT
            r19 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L14
            r0 = r19
            long r0 = org.lwjgl.system.Checks.check(r0)
        L14:
            r0 = r11
            r1 = r12
            r2 = r13
            r3 = r15
            r4 = r17
            r5 = r19
            org.lwjgl.system.JNI.invokePPPV(r0, r1, r2, r3, r4, r5)
            return
    }

    @org.lwjgl.system.NativeType("ALvoid")
    public static void alGetSource3dSOFT(@org.lwjgl.system.NativeType("ALuint") int r9, @org.lwjgl.system.NativeType("ALenum") int r10, @org.lwjgl.system.NativeType("ALdouble *") java.nio.DoubleBuffer r11, @org.lwjgl.system.NativeType("ALdouble *") java.nio.DoubleBuffer r12, @org.lwjgl.system.NativeType("ALdouble *") java.nio.DoubleBuffer r13) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L16
            r0 = r11
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
            r0 = r12
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
            r0 = r13
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
        L16:
            r0 = r9
            r1 = r10
            r2 = r11
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            r3 = r12
            long r3 = org.lwjgl.system.MemoryUtil.memAddress(r3)
            r4 = r13
            long r4 = org.lwjgl.system.MemoryUtil.memAddress(r4)
            nalGetSource3dSOFT(r0, r1, r2, r3, r4)
            return
    }

    public static void nalGetSourcedvSOFT(int r7, int r8, long r9) {
            org.lwjgl.openal.ALCapabilities r0 = org.lwjgl.openal.AL.getICD()
            long r0 = r0.alGetSourcedvSOFT
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
    public static void alGetSourcedvSOFT(@org.lwjgl.system.NativeType("ALuint") int r5, @org.lwjgl.system.NativeType("ALenum") int r6, @org.lwjgl.system.NativeType("ALdouble *") java.nio.DoubleBuffer r7) {
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
            nalGetSourcedvSOFT(r0, r1, r2)
            return
    }

    @org.lwjgl.system.NativeType("ALvoid")
    public static void alSourcei64SOFT(@org.lwjgl.system.NativeType("ALuint") int r7, @org.lwjgl.system.NativeType("ALenum") int r8, @org.lwjgl.system.NativeType("ALint64SOFT") long r9) {
            org.lwjgl.openal.ALCapabilities r0 = org.lwjgl.openal.AL.getICD()
            long r0 = r0.alSourcei64SOFT
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
            org.lwjgl.system.JNI.invokeJV(r0, r1, r2, r3)
            return
    }

    @org.lwjgl.system.NativeType("ALvoid")
    public static void alSource3i64SOFT(@org.lwjgl.system.NativeType("ALuint") int r11, @org.lwjgl.system.NativeType("ALenum") int r12, @org.lwjgl.system.NativeType("ALint64SOFT") long r13, @org.lwjgl.system.NativeType("ALint64SOFT") long r15, @org.lwjgl.system.NativeType("ALint64SOFT") long r17) {
            org.lwjgl.openal.ALCapabilities r0 = org.lwjgl.openal.AL.getICD()
            long r0 = r0.alSource3i64SOFT
            r19 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L14
            r0 = r19
            long r0 = org.lwjgl.system.Checks.check(r0)
        L14:
            r0 = r11
            r1 = r12
            r2 = r13
            r3 = r15
            r4 = r17
            r5 = r19
            org.lwjgl.system.JNI.invokeJJJV(r0, r1, r2, r3, r4, r5)
            return
    }

    public static void nalSourcei64vSOFT(int r7, int r8, long r9) {
            org.lwjgl.openal.ALCapabilities r0 = org.lwjgl.openal.AL.getICD()
            long r0 = r0.alSourcei64vSOFT
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
    public static void alSourcei64vSOFT(@org.lwjgl.system.NativeType("ALuint") int r5, @org.lwjgl.system.NativeType("ALenum") int r6, @org.lwjgl.system.NativeType("ALint64SOFT const *") java.nio.LongBuffer r7) {
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
            nalSourcei64vSOFT(r0, r1, r2)
            return
    }

    public static void nalGetSourcei64SOFT(int r7, int r8, long r9) {
            org.lwjgl.openal.ALCapabilities r0 = org.lwjgl.openal.AL.getICD()
            long r0 = r0.alGetSourcei64SOFT
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
    public static void alGetSourcei64SOFT(@org.lwjgl.system.NativeType("ALuint") int r5, @org.lwjgl.system.NativeType("ALenum") int r6, @org.lwjgl.system.NativeType("ALint64SOFT *") java.nio.LongBuffer r7) {
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
            nalGetSourcei64SOFT(r0, r1, r2)
            return
    }

    @org.lwjgl.system.NativeType("ALvoid")
    public static long alGetSourcei64SOFT(@org.lwjgl.system.NativeType("ALuint") int r5, @org.lwjgl.system.NativeType("ALenum") int r6) {
            org.lwjgl.system.MemoryStack r0 = org.lwjgl.system.MemoryStack.stackGet()
            r7 = r0
            r0 = r7
            int r0 = r0.getPointer()
            r8 = r0
            r0 = r7
            r1 = 1
            java.nio.LongBuffer r0 = r0.callocLong(r1)     // Catch: java.lang.Throwable -> L2a
            r9 = r0
            r0 = r5
            r1 = r6
            r2 = r9
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)     // Catch: java.lang.Throwable -> L2a
            nalGetSourcei64SOFT(r0, r1, r2)     // Catch: java.lang.Throwable -> L2a
            r0 = r9
            r1 = 0
            long r0 = r0.get(r1)     // Catch: java.lang.Throwable -> L2a
            r10 = r0
            r0 = r7
            r1 = r8
            r0.setPointer(r1)
            r0 = r10
            return r0
        L2a:
            r12 = move-exception
            r0 = r7
            r1 = r8
            r0.setPointer(r1)
            r0 = r12
            throw r0
    }

    public static void nalGetSource3i64SOFT(int r11, int r12, long r13, long r15, long r17) {
            org.lwjgl.openal.ALCapabilities r0 = org.lwjgl.openal.AL.getICD()
            long r0 = r0.alGetSource3i64SOFT
            r19 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L14
            r0 = r19
            long r0 = org.lwjgl.system.Checks.check(r0)
        L14:
            r0 = r11
            r1 = r12
            r2 = r13
            r3 = r15
            r4 = r17
            r5 = r19
            org.lwjgl.system.JNI.invokePPPV(r0, r1, r2, r3, r4, r5)
            return
    }

    @org.lwjgl.system.NativeType("ALvoid")
    public static void alGetSource3i64SOFT(@org.lwjgl.system.NativeType("ALuint") int r9, @org.lwjgl.system.NativeType("ALenum") int r10, @org.lwjgl.system.NativeType("ALint64SOFT *") java.nio.LongBuffer r11, @org.lwjgl.system.NativeType("ALint64SOFT *") java.nio.LongBuffer r12, @org.lwjgl.system.NativeType("ALint64SOFT *") java.nio.LongBuffer r13) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L16
            r0 = r11
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
            r0 = r12
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
            r0 = r13
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
        L16:
            r0 = r9
            r1 = r10
            r2 = r11
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            r3 = r12
            long r3 = org.lwjgl.system.MemoryUtil.memAddress(r3)
            r4 = r13
            long r4 = org.lwjgl.system.MemoryUtil.memAddress(r4)
            nalGetSource3i64SOFT(r0, r1, r2, r3, r4)
            return
    }

    public static void nalGetSourcei64vSOFT(int r7, int r8, long r9) {
            org.lwjgl.openal.ALCapabilities r0 = org.lwjgl.openal.AL.getICD()
            long r0 = r0.alGetSourcei64vSOFT
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
    public static void alGetSourcei64vSOFT(@org.lwjgl.system.NativeType("ALuint") int r5, @org.lwjgl.system.NativeType("ALenum") int r6, @org.lwjgl.system.NativeType("ALint64SOFT *") java.nio.LongBuffer r7) {
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
            nalGetSourcei64vSOFT(r0, r1, r2)
            return
    }

    @org.lwjgl.system.NativeType("ALvoid")
    public static void alSourcedvSOFT(@org.lwjgl.system.NativeType("ALuint") int r6, @org.lwjgl.system.NativeType("ALenum") int r7, @org.lwjgl.system.NativeType("ALdouble const *") double[] r8) {
            org.lwjgl.openal.ALCapabilities r0 = org.lwjgl.openal.AL.getICD()
            long r0 = r0.alSourcedvSOFT
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
    public static void alGetSourcedSOFT(@org.lwjgl.system.NativeType("ALuint") int r6, @org.lwjgl.system.NativeType("ALenum") int r7, @org.lwjgl.system.NativeType("ALdouble *") double[] r8) {
            org.lwjgl.openal.ALCapabilities r0 = org.lwjgl.openal.AL.getICD()
            long r0 = r0.alGetSourcedSOFT
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
    public static void alGetSource3dSOFT(@org.lwjgl.system.NativeType("ALuint") int r8, @org.lwjgl.system.NativeType("ALenum") int r9, @org.lwjgl.system.NativeType("ALdouble *") double[] r10, @org.lwjgl.system.NativeType("ALdouble *") double[] r11, @org.lwjgl.system.NativeType("ALdouble *") double[] r12) {
            org.lwjgl.openal.ALCapabilities r0 = org.lwjgl.openal.AL.getICD()
            long r0 = r0.alGetSource3dSOFT
            r13 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L24
            r0 = r13
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r10
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
            r0 = r11
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
            r0 = r12
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
        L24:
            r0 = r8
            r1 = r9
            r2 = r10
            r3 = r11
            r4 = r12
            r5 = r13
            org.lwjgl.system.JNI.invokePPPV(r0, r1, r2, r3, r4, r5)
            return
    }

    @org.lwjgl.system.NativeType("ALvoid")
    public static void alGetSourcedvSOFT(@org.lwjgl.system.NativeType("ALuint") int r6, @org.lwjgl.system.NativeType("ALenum") int r7, @org.lwjgl.system.NativeType("ALdouble *") double[] r8) {
            org.lwjgl.openal.ALCapabilities r0 = org.lwjgl.openal.AL.getICD()
            long r0 = r0.alGetSourcedvSOFT
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
    public static void alSourcei64vSOFT(@org.lwjgl.system.NativeType("ALuint") int r6, @org.lwjgl.system.NativeType("ALenum") int r7, @org.lwjgl.system.NativeType("ALint64SOFT const *") long[] r8) {
            org.lwjgl.openal.ALCapabilities r0 = org.lwjgl.openal.AL.getICD()
            long r0 = r0.alSourcei64vSOFT
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
    public static void alGetSourcei64SOFT(@org.lwjgl.system.NativeType("ALuint") int r6, @org.lwjgl.system.NativeType("ALenum") int r7, @org.lwjgl.system.NativeType("ALint64SOFT *") long[] r8) {
            org.lwjgl.openal.ALCapabilities r0 = org.lwjgl.openal.AL.getICD()
            long r0 = r0.alGetSourcei64SOFT
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
    public static void alGetSource3i64SOFT(@org.lwjgl.system.NativeType("ALuint") int r8, @org.lwjgl.system.NativeType("ALenum") int r9, @org.lwjgl.system.NativeType("ALint64SOFT *") long[] r10, @org.lwjgl.system.NativeType("ALint64SOFT *") long[] r11, @org.lwjgl.system.NativeType("ALint64SOFT *") long[] r12) {
            org.lwjgl.openal.ALCapabilities r0 = org.lwjgl.openal.AL.getICD()
            long r0 = r0.alGetSource3i64SOFT
            r13 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L24
            r0 = r13
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r10
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
            r0 = r11
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
            r0 = r12
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
        L24:
            r0 = r8
            r1 = r9
            r2 = r10
            r3 = r11
            r4 = r12
            r5 = r13
            org.lwjgl.system.JNI.invokePPPV(r0, r1, r2, r3, r4, r5)
            return
    }

    @org.lwjgl.system.NativeType("ALvoid")
    public static void alGetSourcei64vSOFT(@org.lwjgl.system.NativeType("ALuint") int r6, @org.lwjgl.system.NativeType("ALenum") int r7, @org.lwjgl.system.NativeType("ALint64SOFT *") long[] r8) {
            org.lwjgl.openal.ALCapabilities r0 = org.lwjgl.openal.AL.getICD()
            long r0 = r0.alGetSourcei64vSOFT
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
