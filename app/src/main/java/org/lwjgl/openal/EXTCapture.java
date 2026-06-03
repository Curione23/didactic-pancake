package org.lwjgl.openal;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/openal/EXTCapture.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/openal/EXTCapture.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/openal/EXTCapture.class */
public class EXTCapture {
    public static final int ALC_CAPTURE_DEVICE_SPECIFIER = 784;
    public static final int ALC_CAPTURE_DEFAULT_DEVICE_SPECIFIER = 785;
    public static final int ALC_CAPTURE_SAMPLES = 786;

    protected EXTCapture() {
            r3 = this;
            r0 = r3
            r0.<init>()
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r1 = r0
            r1.<init>()
            throw r0
    }

    public static long nalcCaptureOpenDevice(long r6, int r8, int r9, int r10) {
            r0 = r6
            r1 = r8
            r2 = r9
            r3 = r10
            long r0 = org.lwjgl.openal.ALC11.nalcCaptureOpenDevice(r0, r1, r2, r3)
            return r0
    }

    @org.lwjgl.system.NativeType("ALCdevice *")
    public static long alcCaptureOpenDevice(@javax.annotation.Nullable @org.lwjgl.system.NativeType("ALCchar const *") java.nio.ByteBuffer r5, @org.lwjgl.system.NativeType("ALCuint") int r6, @org.lwjgl.system.NativeType("ALCenum") int r7, @org.lwjgl.system.NativeType("ALCsizei") int r8) {
            r0 = r5
            r1 = r6
            r2 = r7
            r3 = r8
            long r0 = org.lwjgl.openal.ALC11.alcCaptureOpenDevice(r0, r1, r2, r3)
            return r0
    }

    @org.lwjgl.system.NativeType("ALCdevice *")
    public static long alcCaptureOpenDevice(@javax.annotation.Nullable @org.lwjgl.system.NativeType("ALCchar const *") java.lang.CharSequence r5, @org.lwjgl.system.NativeType("ALCuint") int r6, @org.lwjgl.system.NativeType("ALCenum") int r7, @org.lwjgl.system.NativeType("ALCsizei") int r8) {
            r0 = r5
            r1 = r6
            r2 = r7
            r3 = r8
            long r0 = org.lwjgl.openal.ALC11.alcCaptureOpenDevice(r0, r1, r2, r3)
            return r0
    }

    @org.lwjgl.system.NativeType("ALCboolean")
    public static boolean alcCaptureCloseDevice(@org.lwjgl.system.NativeType("ALCdevice *") long r3) {
            r0 = r3
            boolean r0 = org.lwjgl.openal.ALC11.alcCaptureCloseDevice(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("ALCvoid")
    public static void alcCaptureStart(@org.lwjgl.system.NativeType("ALCdevice *") long r3) {
            r0 = r3
            org.lwjgl.openal.ALC11.alcCaptureStart(r0)
            return
    }

    @org.lwjgl.system.NativeType("ALCvoid")
    public static void alcCaptureStop(@org.lwjgl.system.NativeType("ALCdevice *") long r3) {
            r0 = r3
            org.lwjgl.openal.ALC11.alcCaptureStop(r0)
            return
    }

    public static void nalcCaptureSamples(long r6, long r8, int r10) {
            r0 = r6
            r1 = r8
            r2 = r10
            org.lwjgl.openal.ALC11.nalcCaptureSamples(r0, r1, r2)
            return
    }

    @org.lwjgl.system.NativeType("ALCvoid")
    public static void alcCaptureSamples(@org.lwjgl.system.NativeType("ALCdevice *") long r5, @org.lwjgl.system.NativeType("ALCvoid *") java.nio.ByteBuffer r7, @org.lwjgl.system.NativeType("ALCsizei") int r8) {
            r0 = r5
            r1 = r7
            r2 = r8
            org.lwjgl.openal.ALC11.alcCaptureSamples(r0, r1, r2)
            return
    }

    @org.lwjgl.system.NativeType("ALCvoid")
    public static void alcCaptureSamples(@org.lwjgl.system.NativeType("ALCdevice *") long r5, @org.lwjgl.system.NativeType("ALCvoid *") java.nio.ShortBuffer r7, @org.lwjgl.system.NativeType("ALCsizei") int r8) {
            r0 = r5
            r1 = r7
            r2 = r8
            org.lwjgl.openal.ALC11.alcCaptureSamples(r0, r1, r2)
            return
    }

    @org.lwjgl.system.NativeType("ALCvoid")
    public static void alcCaptureSamples(@org.lwjgl.system.NativeType("ALCdevice *") long r5, @org.lwjgl.system.NativeType("ALCvoid *") java.nio.IntBuffer r7, @org.lwjgl.system.NativeType("ALCsizei") int r8) {
            r0 = r5
            r1 = r7
            r2 = r8
            org.lwjgl.openal.ALC11.alcCaptureSamples(r0, r1, r2)
            return
    }

    @org.lwjgl.system.NativeType("ALCvoid")
    public static void alcCaptureSamples(@org.lwjgl.system.NativeType("ALCdevice *") long r5, @org.lwjgl.system.NativeType("ALCvoid *") java.nio.FloatBuffer r7, @org.lwjgl.system.NativeType("ALCsizei") int r8) {
            r0 = r5
            r1 = r7
            r2 = r8
            org.lwjgl.openal.ALC11.alcCaptureSamples(r0, r1, r2)
            return
    }

    @org.lwjgl.system.NativeType("ALCvoid")
    public static void alcCaptureSamples(@org.lwjgl.system.NativeType("ALCdevice *") long r5, @org.lwjgl.system.NativeType("ALCvoid *") short[] r7, @org.lwjgl.system.NativeType("ALCsizei") int r8) {
            r0 = r5
            r1 = r7
            r2 = r8
            org.lwjgl.openal.ALC11.alcCaptureSamples(r0, r1, r2)
            return
    }

    @org.lwjgl.system.NativeType("ALCvoid")
    public static void alcCaptureSamples(@org.lwjgl.system.NativeType("ALCdevice *") long r5, @org.lwjgl.system.NativeType("ALCvoid *") int[] r7, @org.lwjgl.system.NativeType("ALCsizei") int r8) {
            r0 = r5
            r1 = r7
            r2 = r8
            org.lwjgl.openal.ALC11.alcCaptureSamples(r0, r1, r2)
            return
    }

    @org.lwjgl.system.NativeType("ALCvoid")
    public static void alcCaptureSamples(@org.lwjgl.system.NativeType("ALCdevice *") long r5, @org.lwjgl.system.NativeType("ALCvoid *") float[] r7, @org.lwjgl.system.NativeType("ALCsizei") int r8) {
            r0 = r5
            r1 = r7
            r2 = r8
            org.lwjgl.openal.ALC11.alcCaptureSamples(r0, r1, r2)
            return
    }
}
