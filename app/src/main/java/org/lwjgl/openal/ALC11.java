package org.lwjgl.openal;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/openal/ALC11.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/openal/ALC11.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/openal/ALC11.class */
public class ALC11 extends org.lwjgl.openal.ALC10 {
    public static final int ALC_MONO_SOURCES = 4112;
    public static final int ALC_STEREO_SOURCES = 4113;
    public static final int ALC_DEFAULT_ALL_DEVICES_SPECIFIER = 4114;
    public static final int ALC_ALL_DEVICES_SPECIFIER = 4115;
    public static final int ALC_CAPTURE_DEVICE_SPECIFIER = 784;
    public static final int ALC_CAPTURE_DEFAULT_DEVICE_SPECIFIER = 785;
    public static final int ALC_CAPTURE_SAMPLES = 786;

    protected ALC11() {
            r3 = this;
            r0 = r3
            r0.<init>()
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r1 = r0
            r1.<init>()
            throw r0
    }

    public static long nalcCaptureOpenDevice(long r8, int r10, int r11, int r12) {
            org.lwjgl.openal.ALCCapabilities r0 = org.lwjgl.openal.ALC.getICD()
            long r0 = r0.alcCaptureOpenDevice
            r13 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L14
            r0 = r13
            long r0 = org.lwjgl.system.Checks.check(r0)
        L14:
            r0 = r8
            r1 = r10
            r2 = r11
            r3 = r12
            r4 = r13
            long r0 = org.lwjgl.system.JNI.invokePP(r0, r1, r2, r3, r4)
            return r0
    }

    @org.lwjgl.system.NativeType("ALCdevice *")
    public static long alcCaptureOpenDevice(@javax.annotation.Nullable @org.lwjgl.system.NativeType("ALCchar const *") java.nio.ByteBuffer r6, @org.lwjgl.system.NativeType("ALCuint") int r7, @org.lwjgl.system.NativeType("ALCenum") int r8, @org.lwjgl.system.NativeType("ALCsizei") int r9) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto La
            r0 = r6
            org.lwjgl.system.Checks.checkNT1Safe(r0)
        La:
            r0 = r6
            long r0 = org.lwjgl.system.MemoryUtil.memAddressSafe(r0)
            r1 = r7
            r2 = r8
            r3 = r9
            long r0 = nalcCaptureOpenDevice(r0, r1, r2, r3)
            return r0
    }

    @org.lwjgl.system.NativeType("ALCdevice *")
    public static long alcCaptureOpenDevice(@javax.annotation.Nullable @org.lwjgl.system.NativeType("ALCchar const *") java.lang.CharSequence r6, @org.lwjgl.system.NativeType("ALCuint") int r7, @org.lwjgl.system.NativeType("ALCenum") int r8, @org.lwjgl.system.NativeType("ALCsizei") int r9) {
            org.lwjgl.system.MemoryStack r0 = org.lwjgl.system.MemoryStack.stackGet()
            r10 = r0
            r0 = r10
            int r0 = r0.getPointer()
            r11 = r0
            r0 = r10
            r1 = r6
            r2 = 1
            int r0 = r0.nUTF8Safe(r1, r2)     // Catch: java.lang.Throwable -> L37
            r0 = r6
            if (r0 != 0) goto L1c
            r0 = 0
            goto L21
        L1c:
            r0 = r10
            long r0 = r0.getPointerAddress()     // Catch: java.lang.Throwable -> L37
        L21:
            r12 = r0
            r0 = r12
            r1 = r7
            r2 = r8
            r3 = r9
            long r0 = nalcCaptureOpenDevice(r0, r1, r2, r3)     // Catch: java.lang.Throwable -> L37
            r14 = r0
            r0 = r10
            r1 = r11
            r0.setPointer(r1)
            r0 = r14
            return r0
        L37:
            r16 = move-exception
            r0 = r10
            r1 = r11
            r0.setPointer(r1)
            r0 = r16
            throw r0
    }

    @org.lwjgl.system.NativeType("ALCboolean")
    public static boolean alcCaptureCloseDevice(@org.lwjgl.system.NativeType("ALCdevice *") long r5) {
            org.lwjgl.openal.ALCCapabilities r0 = org.lwjgl.openal.ALC.getICD()
            long r0 = r0.alcCaptureCloseDevice
            r7 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L17
            r0 = r7
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r5
            long r0 = org.lwjgl.system.Checks.check(r0)
        L17:
            r0 = r5
            r1 = r7
            boolean r0 = org.lwjgl.system.JNI.invokePZ(r0, r1)
            return r0
    }

    @org.lwjgl.system.NativeType("ALCvoid")
    public static void alcCaptureStart(@org.lwjgl.system.NativeType("ALCdevice *") long r5) {
            org.lwjgl.openal.ALCCapabilities r0 = org.lwjgl.openal.ALC.getICD()
            long r0 = r0.alcCaptureStart
            r7 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L17
            r0 = r7
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r5
            long r0 = org.lwjgl.system.Checks.check(r0)
        L17:
            r0 = r5
            r1 = r7
            org.lwjgl.system.JNI.invokePV(r0, r1)
            return
    }

    @org.lwjgl.system.NativeType("ALCvoid")
    public static void alcCaptureStop(@org.lwjgl.system.NativeType("ALCdevice *") long r5) {
            org.lwjgl.openal.ALCCapabilities r0 = org.lwjgl.openal.ALC.getICD()
            long r0 = r0.alcCaptureStop
            r7 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L17
            r0 = r7
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r5
            long r0 = org.lwjgl.system.Checks.check(r0)
        L17:
            r0 = r5
            r1 = r7
            org.lwjgl.system.JNI.invokePV(r0, r1)
            return
    }

    public static void nalcCaptureSamples(long r8, long r10, int r12) {
            org.lwjgl.openal.ALCCapabilities r0 = org.lwjgl.openal.ALC.getICD()
            long r0 = r0.alcCaptureSamples
            r13 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L19
            r0 = r13
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r8
            long r0 = org.lwjgl.system.Checks.check(r0)
        L19:
            r0 = r8
            r1 = r10
            r2 = r12
            r3 = r13
            org.lwjgl.system.JNI.invokePPV(r0, r1, r2, r3)
            return
    }

    @org.lwjgl.system.NativeType("ALCvoid")
    public static void alcCaptureSamples(@org.lwjgl.system.NativeType("ALCdevice *") long r6, @org.lwjgl.system.NativeType("ALCvoid *") java.nio.ByteBuffer r8, @org.lwjgl.system.NativeType("ALCsizei") int r9) {
            r0 = r6
            r1 = r8
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            r2 = r9
            nalcCaptureSamples(r0, r1, r2)
            return
    }

    @org.lwjgl.system.NativeType("ALCvoid")
    public static void alcCaptureSamples(@org.lwjgl.system.NativeType("ALCdevice *") long r6, @org.lwjgl.system.NativeType("ALCvoid *") java.nio.ShortBuffer r8, @org.lwjgl.system.NativeType("ALCsizei") int r9) {
            r0 = r6
            r1 = r8
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            r2 = r9
            nalcCaptureSamples(r0, r1, r2)
            return
    }

    @org.lwjgl.system.NativeType("ALCvoid")
    public static void alcCaptureSamples(@org.lwjgl.system.NativeType("ALCdevice *") long r6, @org.lwjgl.system.NativeType("ALCvoid *") java.nio.IntBuffer r8, @org.lwjgl.system.NativeType("ALCsizei") int r9) {
            r0 = r6
            r1 = r8
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            r2 = r9
            nalcCaptureSamples(r0, r1, r2)
            return
    }

    @org.lwjgl.system.NativeType("ALCvoid")
    public static void alcCaptureSamples(@org.lwjgl.system.NativeType("ALCdevice *") long r6, @org.lwjgl.system.NativeType("ALCvoid *") java.nio.FloatBuffer r8, @org.lwjgl.system.NativeType("ALCsizei") int r9) {
            r0 = r6
            r1 = r8
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            r2 = r9
            nalcCaptureSamples(r0, r1, r2)
            return
    }

    @org.lwjgl.system.NativeType("ALCvoid")
    public static void alcCaptureSamples(@org.lwjgl.system.NativeType("ALCdevice *") long r7, @org.lwjgl.system.NativeType("ALCvoid *") short[] r9, @org.lwjgl.system.NativeType("ALCsizei") int r10) {
            org.lwjgl.openal.ALCCapabilities r0 = org.lwjgl.openal.ALC.getICD()
            long r0 = r0.alcCaptureSamples
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
            org.lwjgl.system.JNI.invokePPV(r0, r1, r2, r3)
            return
    }

    @org.lwjgl.system.NativeType("ALCvoid")
    public static void alcCaptureSamples(@org.lwjgl.system.NativeType("ALCdevice *") long r7, @org.lwjgl.system.NativeType("ALCvoid *") int[] r9, @org.lwjgl.system.NativeType("ALCsizei") int r10) {
            org.lwjgl.openal.ALCCapabilities r0 = org.lwjgl.openal.ALC.getICD()
            long r0 = r0.alcCaptureSamples
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
            org.lwjgl.system.JNI.invokePPV(r0, r1, r2, r3)
            return
    }

    @org.lwjgl.system.NativeType("ALCvoid")
    public static void alcCaptureSamples(@org.lwjgl.system.NativeType("ALCdevice *") long r7, @org.lwjgl.system.NativeType("ALCvoid *") float[] r9, @org.lwjgl.system.NativeType("ALCsizei") int r10) {
            org.lwjgl.openal.ALCCapabilities r0 = org.lwjgl.openal.ALC.getICD()
            long r0 = r0.alcCaptureSamples
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
            org.lwjgl.system.JNI.invokePPV(r0, r1, r2, r3)
            return
    }
}
