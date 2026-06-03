package org.lwjgl.openal;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/openal/SOFTSourceStartDelay.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/openal/SOFTSourceStartDelay.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/openal/SOFTSourceStartDelay.class */
public class SOFTSourceStartDelay {
    protected SOFTSourceStartDelay() {
            r3 = this;
            r0 = r3
            r0.<init>()
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r1 = r0
            r1.<init>()
            throw r0
    }

    @org.lwjgl.system.NativeType("ALvoid")
    public static void alSourcePlayAtTimeSOFT(@org.lwjgl.system.NativeType("ALuint") int r6, @org.lwjgl.system.NativeType("ALint64SOFT") long r7) {
            org.lwjgl.openal.ALCapabilities r0 = org.lwjgl.openal.AL.getICD()
            long r0 = r0.alSourcePlayAtTimeSOFT
            r9 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L12
            r0 = r9
            long r0 = org.lwjgl.system.Checks.check(r0)
        L12:
            r0 = r6
            r1 = r7
            r2 = r9
            org.lwjgl.system.JNI.invokeJV(r0, r1, r2)
            return
    }

    public static void nalSourcePlayAtTimevSOFT(int r8, long r9, long r11) {
            org.lwjgl.openal.ALCapabilities r0 = org.lwjgl.openal.AL.getICD()
            long r0 = r0.alSourcePlayAtTimevSOFT
            r13 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L14
            r0 = r13
            long r0 = org.lwjgl.system.Checks.check(r0)
        L14:
            r0 = r8
            r1 = r9
            r2 = r11
            r3 = r13
            org.lwjgl.system.JNI.invokePJV(r0, r1, r2, r3)
            return
    }

    @org.lwjgl.system.NativeType("ALvoid")
    public static void alSourcePlayAtTimevSOFT(@org.lwjgl.system.NativeType("ALuint const *") java.nio.IntBuffer r6, @org.lwjgl.system.NativeType("ALint64SOFT") long r7) {
            r0 = r6
            int r0 = r0.remaining()
            r1 = r6
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            r2 = r7
            nalSourcePlayAtTimevSOFT(r0, r1, r2)
            return
    }

    @org.lwjgl.system.NativeType("ALvoid")
    public static void alSourcePlayAtTimevSOFT(@org.lwjgl.system.NativeType("ALuint const *") int[] r7, @org.lwjgl.system.NativeType("ALint64SOFT") long r8) {
            org.lwjgl.openal.ALCapabilities r0 = org.lwjgl.openal.AL.getICD()
            long r0 = r0.alSourcePlayAtTimevSOFT
            r10 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L12
            r0 = r10
            long r0 = org.lwjgl.system.Checks.check(r0)
        L12:
            r0 = r7
            int r0 = r0.length
            r1 = r7
            r2 = r8
            r3 = r10
            org.lwjgl.system.JNI.invokePJV(r0, r1, r2, r3)
            return
    }
}
