package org.lwjgl.openal;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/openal/SOFTDeviceClock.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/openal/SOFTDeviceClock.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/openal/SOFTDeviceClock.class */
public class SOFTDeviceClock {
    public static final int ALC_DEVICE_CLOCK_SOFT = 5632;
    public static final int ALC_DEVICE_LATENCY_SOFT = 5633;
    public static final int ALC_DEVICE_CLOCK_LATENCY_SOFT = 5634;
    public static final int AL_SAMPLE_OFFSET_CLOCK_SOFT = 4610;
    public static final int AL_SEC_OFFSET_CLOCK_SOFT = 4611;

    protected SOFTDeviceClock() {
            r3 = this;
            r0 = r3
            r0.<init>()
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r1 = r0
            r1.<init>()
            throw r0
    }

    public static void nalcGetInteger64vSOFT(long r9, int r11, int r12, long r13) {
            org.lwjgl.openal.ALCCapabilities r0 = org.lwjgl.openal.ALC.getICD()
            long r0 = r0.alcGetInteger64vSOFT
            r15 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L14
            r0 = r15
            long r0 = org.lwjgl.system.Checks.check(r0)
        L14:
            r0 = r9
            r1 = r11
            r2 = r12
            r3 = r13
            r4 = r15
            org.lwjgl.system.JNI.invokePPV(r0, r1, r2, r3, r4)
            return
    }

    @org.lwjgl.system.NativeType("ALCvoid")
    public static void alcGetInteger64vSOFT(@org.lwjgl.system.NativeType("ALCdevice *") long r7, @org.lwjgl.system.NativeType("ALCenum") int r9, @org.lwjgl.system.NativeType("ALCint64SOFT *") java.nio.LongBuffer r10) {
            r0 = r7
            r1 = r9
            r2 = r10
            int r2 = r2.remaining()
            r3 = r10
            long r3 = org.lwjgl.system.MemoryUtil.memAddress(r3)
            nalcGetInteger64vSOFT(r0, r1, r2, r3)
            return
    }

    @org.lwjgl.system.NativeType("ALCvoid")
    public static long alcGetInteger64vSOFT(@org.lwjgl.system.NativeType("ALCdevice *") long r7, @org.lwjgl.system.NativeType("ALCenum") int r9) {
            org.lwjgl.system.MemoryStack r0 = org.lwjgl.system.MemoryStack.stackGet()
            r10 = r0
            r0 = r10
            int r0 = r0.getPointer()
            r11 = r0
            r0 = r10
            r1 = 1
            java.nio.LongBuffer r0 = r0.callocLong(r1)     // Catch: java.lang.Throwable -> L2d
            r12 = r0
            r0 = r7
            r1 = r9
            r2 = 1
            r3 = r12
            long r3 = org.lwjgl.system.MemoryUtil.memAddress(r3)     // Catch: java.lang.Throwable -> L2d
            nalcGetInteger64vSOFT(r0, r1, r2, r3)     // Catch: java.lang.Throwable -> L2d
            r0 = r12
            r1 = 0
            long r0 = r0.get(r1)     // Catch: java.lang.Throwable -> L2d
            r13 = r0
            r0 = r10
            r1 = r11
            r0.setPointer(r1)
            r0 = r13
            return r0
        L2d:
            r15 = move-exception
            r0 = r10
            r1 = r11
            r0.setPointer(r1)
            r0 = r15
            throw r0
    }

    @org.lwjgl.system.NativeType("ALCvoid")
    public static void alcGetInteger64vSOFT(@org.lwjgl.system.NativeType("ALCdevice *") long r8, @org.lwjgl.system.NativeType("ALCenum") int r10, @org.lwjgl.system.NativeType("ALCint64SOFT *") long[] r11) {
            org.lwjgl.openal.ALCCapabilities r0 = org.lwjgl.openal.ALC.getICD()
            long r0 = r0.alcGetInteger64vSOFT
            r12 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L14
            r0 = r12
            long r0 = org.lwjgl.system.Checks.check(r0)
        L14:
            r0 = r8
            r1 = r10
            r2 = r11
            int r2 = r2.length
            r3 = r11
            r4 = r12
            org.lwjgl.system.JNI.invokePPV(r0, r1, r2, r3, r4)
            return
    }
}
