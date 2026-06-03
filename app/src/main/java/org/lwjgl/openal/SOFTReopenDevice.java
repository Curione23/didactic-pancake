package org.lwjgl.openal;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/openal/SOFTReopenDevice.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/openal/SOFTReopenDevice.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/openal/SOFTReopenDevice.class */
public class SOFTReopenDevice {
    protected SOFTReopenDevice() {
            r3 = this;
            r0 = r3
            r0.<init>()
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r1 = r0
            r1.<init>()
            throw r0
    }

    public static boolean nalcReopenDeviceSOFT(long r9, long r11, long r13) {
            org.lwjgl.openal.ALCCapabilities r0 = org.lwjgl.openal.ALC.getICD()
            long r0 = r0.alcReopenDeviceSOFT
            r15 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L19
            r0 = r15
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r9
            long r0 = org.lwjgl.system.Checks.check(r0)
        L19:
            r0 = r9
            r1 = r11
            r2 = r13
            r3 = r15
            boolean r0 = org.lwjgl.system.JNI.invokePPPZ(r0, r1, r2, r3)
            return r0
    }

    @org.lwjgl.system.NativeType("ALCboolean")
    public static boolean alcReopenDeviceSOFT(@org.lwjgl.system.NativeType("ALCdevice *") long r7, @javax.annotation.Nullable @org.lwjgl.system.NativeType("ALCchar const *") java.nio.ByteBuffer r9, @javax.annotation.Nullable @org.lwjgl.system.NativeType("ALCint const *") java.nio.IntBuffer r10) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Le
            r0 = r9
            org.lwjgl.system.Checks.checkNT1Safe(r0)
            r0 = r10
            org.lwjgl.system.Checks.checkNTSafe(r0)
        Le:
            r0 = r7
            r1 = r9
            long r1 = org.lwjgl.system.MemoryUtil.memAddressSafe(r1)
            r2 = r10
            long r2 = org.lwjgl.system.MemoryUtil.memAddressSafe(r2)
            boolean r0 = nalcReopenDeviceSOFT(r0, r1, r2)
            return r0
    }

    @org.lwjgl.system.NativeType("ALCboolean")
    public static boolean alcReopenDeviceSOFT(@org.lwjgl.system.NativeType("ALCdevice *") long r7, @javax.annotation.Nullable @org.lwjgl.system.NativeType("ALCchar const *") java.lang.CharSequence r9, @javax.annotation.Nullable @org.lwjgl.system.NativeType("ALCint const *") java.nio.IntBuffer r10) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto La
            r0 = r10
            org.lwjgl.system.Checks.checkNTSafe(r0)
        La:
            org.lwjgl.system.MemoryStack r0 = org.lwjgl.system.MemoryStack.stackGet()
            r11 = r0
            r0 = r11
            int r0 = r0.getPointer()
            r12 = r0
            r0 = r11
            r1 = r9
            r2 = 1
            int r0 = r0.nUTF8Safe(r1, r2)     // Catch: java.lang.Throwable -> L43
            r0 = r9
            if (r0 != 0) goto L26
            r0 = 0
            goto L2b
        L26:
            r0 = r11
            long r0 = r0.getPointerAddress()     // Catch: java.lang.Throwable -> L43
        L2b:
            r13 = r0
            r0 = r7
            r1 = r13
            r2 = r10
            long r2 = org.lwjgl.system.MemoryUtil.memAddressSafe(r2)     // Catch: java.lang.Throwable -> L43
            boolean r0 = nalcReopenDeviceSOFT(r0, r1, r2)     // Catch: java.lang.Throwable -> L43
            r15 = r0
            r0 = r11
            r1 = r12
            r0.setPointer(r1)
            r0 = r15
            return r0
        L43:
            r16 = move-exception
            r0 = r11
            r1 = r12
            r0.setPointer(r1)
            r0 = r16
            throw r0
    }

    @org.lwjgl.system.NativeType("ALCboolean")
    public static boolean alcReopenDeviceSOFT(@org.lwjgl.system.NativeType("ALCdevice *") long r8, @javax.annotation.Nullable @org.lwjgl.system.NativeType("ALCchar const *") java.nio.ByteBuffer r10, @javax.annotation.Nullable @org.lwjgl.system.NativeType("ALCint const *") int[] r11) {
            org.lwjgl.openal.ALCCapabilities r0 = org.lwjgl.openal.ALC.getICD()
            long r0 = r0.alcReopenDeviceSOFT
            r12 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L21
            r0 = r12
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r8
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r10
            org.lwjgl.system.Checks.checkNT1Safe(r0)
            r0 = r11
            org.lwjgl.system.Checks.checkNTSafe(r0)
        L21:
            r0 = r8
            r1 = r10
            long r1 = org.lwjgl.system.MemoryUtil.memAddressSafe(r1)
            r2 = r11
            r3 = r12
            boolean r0 = org.lwjgl.system.JNI.invokePPPZ(r0, r1, r2, r3)
            return r0
    }

    @org.lwjgl.system.NativeType("ALCboolean")
    public static boolean alcReopenDeviceSOFT(@org.lwjgl.system.NativeType("ALCdevice *") long r8, @javax.annotation.Nullable @org.lwjgl.system.NativeType("ALCchar const *") java.lang.CharSequence r10, @javax.annotation.Nullable @org.lwjgl.system.NativeType("ALCint const *") int[] r11) {
            org.lwjgl.openal.ALCCapabilities r0 = org.lwjgl.openal.ALC.getICD()
            long r0 = r0.alcReopenDeviceSOFT
            r12 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L1d
            r0 = r12
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r8
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r11
            org.lwjgl.system.Checks.checkNTSafe(r0)
        L1d:
            org.lwjgl.system.MemoryStack r0 = org.lwjgl.system.MemoryStack.stackGet()
            r14 = r0
            r0 = r14
            int r0 = r0.getPointer()
            r15 = r0
            r0 = r14
            r1 = r10
            r2 = 1
            int r0 = r0.nUTF8Safe(r1, r2)     // Catch: java.lang.Throwable -> L55
            r0 = r10
            if (r0 != 0) goto L39
            r0 = 0
            goto L3e
        L39:
            r0 = r14
            long r0 = r0.getPointerAddress()     // Catch: java.lang.Throwable -> L55
        L3e:
            r16 = r0
            r0 = r8
            r1 = r16
            r2 = r11
            r3 = r12
            boolean r0 = org.lwjgl.system.JNI.invokePPPZ(r0, r1, r2, r3)     // Catch: java.lang.Throwable -> L55
            r18 = r0
            r0 = r14
            r1 = r15
            r0.setPointer(r1)
            r0 = r18
            return r0
        L55:
            r19 = move-exception
            r0 = r14
            r1 = r15
            r0.setPointer(r1)
            r0 = r19
            throw r0
    }
}
