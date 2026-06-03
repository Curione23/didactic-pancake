package org.lwjgl.openal;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/openal/SOFTLoopback.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/openal/SOFTLoopback.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/openal/SOFTLoopback.class */
public class SOFTLoopback {
    public static final int ALC_BYTE_SOFT = 5120;
    public static final int ALC_UNSIGNED_BYTE_SOFT = 5121;
    public static final int ALC_SHORT_SOFT = 5122;
    public static final int ALC_UNSIGNED_SHORT_SOFT = 5123;
    public static final int ALC_INT_SOFT = 5124;
    public static final int ALC_UNSIGNED_INT_SOFT = 5125;
    public static final int ALC_FLOAT_SOFT = 5126;
    public static final int ALC_MONO_SOFT = 5376;
    public static final int ALC_STEREO_SOFT = 5377;
    public static final int ALC_QUAD_SOFT = 5379;
    public static final int ALC_5POINT1_SOFT = 5380;
    public static final int ALC_6POINT1_SOFT = 5381;
    public static final int ALC_7POINT1_SOFT = 5382;
    public static final int ALC_FORMAT_CHANNELS_SOFT = 6544;
    public static final int ALC_FORMAT_TYPE_SOFT = 6545;

    protected SOFTLoopback() {
            r3 = this;
            r0 = r3
            r0.<init>()
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r1 = r0
            r1.<init>()
            throw r0
    }

    public static long nalcLoopbackOpenDeviceSOFT(long r5) {
            org.lwjgl.openal.ALCCapabilities r0 = org.lwjgl.openal.ALC.getICD()
            long r0 = r0.alcLoopbackOpenDeviceSOFT
            r7 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L12
            r0 = r7
            long r0 = org.lwjgl.system.Checks.check(r0)
        L12:
            r0 = r5
            r1 = r7
            long r0 = org.lwjgl.system.JNI.invokePP(r0, r1)
            return r0
    }

    @org.lwjgl.system.NativeType("ALCdevice *")
    public static long alcLoopbackOpenDeviceSOFT(@javax.annotation.Nullable @org.lwjgl.system.NativeType("ALCchar const *") java.nio.ByteBuffer r3) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto La
            r0 = r3
            org.lwjgl.system.Checks.checkNT1Safe(r0)
        La:
            r0 = r3
            long r0 = org.lwjgl.system.MemoryUtil.memAddressSafe(r0)
            long r0 = nalcLoopbackOpenDeviceSOFT(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("ALCdevice *")
    public static long alcLoopbackOpenDeviceSOFT(@javax.annotation.Nullable @org.lwjgl.system.NativeType("ALCchar const *") java.lang.CharSequence r4) {
            org.lwjgl.system.MemoryStack r0 = org.lwjgl.system.MemoryStack.stackGet()
            r5 = r0
            r0 = r5
            int r0 = r0.getPointer()
            r6 = r0
            r0 = r5
            r1 = r4
            r2 = 1
            int r0 = r0.nUTF8Safe(r1, r2)     // Catch: java.lang.Throwable -> L2b
            r0 = r4
            if (r0 != 0) goto L18
            r0 = 0
            goto L1c
        L18:
            r0 = r5
            long r0 = r0.getPointerAddress()     // Catch: java.lang.Throwable -> L2b
        L1c:
            r7 = r0
            r0 = r7
            long r0 = nalcLoopbackOpenDeviceSOFT(r0)     // Catch: java.lang.Throwable -> L2b
            r9 = r0
            r0 = r5
            r1 = r6
            r0.setPointer(r1)
            r0 = r9
            return r0
        L2b:
            r11 = move-exception
            r0 = r5
            r1 = r6
            r0.setPointer(r1)
            r0 = r11
            throw r0
    }

    @org.lwjgl.system.NativeType("ALCboolean")
    public static boolean alcIsRenderFormatSupportedSOFT(@org.lwjgl.system.NativeType("ALCdevice *") long r8, @org.lwjgl.system.NativeType("ALCsizei") int r10, @org.lwjgl.system.NativeType("ALCenum") int r11, @org.lwjgl.system.NativeType("ALCenum") int r12) {
            org.lwjgl.openal.ALCCapabilities r0 = org.lwjgl.openal.ALC.getICD()
            long r0 = r0.alcIsRenderFormatSupportedSOFT
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
            r2 = r11
            r3 = r12
            r4 = r13
            boolean r0 = org.lwjgl.system.JNI.invokePZ(r0, r1, r2, r3, r4)
            return r0
    }

    public static void nalcRenderSamplesSOFT(long r8, long r10, int r12) {
            org.lwjgl.openal.ALCCapabilities r0 = org.lwjgl.openal.ALC.getICD()
            long r0 = r0.alcRenderSamplesSOFT
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
    public static void alcRenderSamplesSOFT(@org.lwjgl.system.NativeType("ALCdevice *") long r6, @org.lwjgl.system.NativeType("ALCvoid *") java.nio.ByteBuffer r8, @org.lwjgl.system.NativeType("ALCsizei") int r9) {
            r0 = r6
            r1 = r8
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            r2 = r9
            nalcRenderSamplesSOFT(r0, r1, r2)
            return
    }

    @org.lwjgl.system.NativeType("ALCvoid")
    public static void alcRenderSamplesSOFT(@org.lwjgl.system.NativeType("ALCdevice *") long r6, @org.lwjgl.system.NativeType("ALCvoid *") java.nio.ShortBuffer r8, @org.lwjgl.system.NativeType("ALCsizei") int r9) {
            r0 = r6
            r1 = r8
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            r2 = r9
            nalcRenderSamplesSOFT(r0, r1, r2)
            return
    }

    @org.lwjgl.system.NativeType("ALCvoid")
    public static void alcRenderSamplesSOFT(@org.lwjgl.system.NativeType("ALCdevice *") long r6, @org.lwjgl.system.NativeType("ALCvoid *") java.nio.IntBuffer r8, @org.lwjgl.system.NativeType("ALCsizei") int r9) {
            r0 = r6
            r1 = r8
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            r2 = r9
            nalcRenderSamplesSOFT(r0, r1, r2)
            return
    }

    @org.lwjgl.system.NativeType("ALCvoid")
    public static void alcRenderSamplesSOFT(@org.lwjgl.system.NativeType("ALCdevice *") long r6, @org.lwjgl.system.NativeType("ALCvoid *") java.nio.FloatBuffer r8, @org.lwjgl.system.NativeType("ALCsizei") int r9) {
            r0 = r6
            r1 = r8
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            r2 = r9
            nalcRenderSamplesSOFT(r0, r1, r2)
            return
    }

    @org.lwjgl.system.NativeType("ALCvoid")
    public static void alcRenderSamplesSOFT(@org.lwjgl.system.NativeType("ALCdevice *") long r7, @org.lwjgl.system.NativeType("ALCvoid *") short[] r9, @org.lwjgl.system.NativeType("ALCsizei") int r10) {
            org.lwjgl.openal.ALCCapabilities r0 = org.lwjgl.openal.ALC.getICD()
            long r0 = r0.alcRenderSamplesSOFT
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
    public static void alcRenderSamplesSOFT(@org.lwjgl.system.NativeType("ALCdevice *") long r7, @org.lwjgl.system.NativeType("ALCvoid *") int[] r9, @org.lwjgl.system.NativeType("ALCsizei") int r10) {
            org.lwjgl.openal.ALCCapabilities r0 = org.lwjgl.openal.ALC.getICD()
            long r0 = r0.alcRenderSamplesSOFT
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
    public static void alcRenderSamplesSOFT(@org.lwjgl.system.NativeType("ALCdevice *") long r7, @org.lwjgl.system.NativeType("ALCvoid *") float[] r9, @org.lwjgl.system.NativeType("ALCsizei") int r10) {
            org.lwjgl.openal.ALCCapabilities r0 = org.lwjgl.openal.ALC.getICD()
            long r0 = r0.alcRenderSamplesSOFT
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
