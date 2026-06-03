package org.lwjgl.openal;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/openal/SOFTDeferredUpdates.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/openal/SOFTDeferredUpdates.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/openal/SOFTDeferredUpdates.class */
public class SOFTDeferredUpdates {
    public static final int AL_DEFERRED_UPDATES_SOFT = 49154;

    protected SOFTDeferredUpdates() {
            r3 = this;
            r0 = r3
            r0.<init>()
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r1 = r0
            r1.<init>()
            throw r0
    }

    @org.lwjgl.system.NativeType("ALvoid")
    public static void alDeferUpdatesSOFT() {
            org.lwjgl.openal.ALCapabilities r0 = org.lwjgl.openal.AL.getICD()
            long r0 = r0.alDeferUpdatesSOFT
            r3 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L12
            r0 = r3
            long r0 = org.lwjgl.system.Checks.check(r0)
        L12:
            r0 = r3
            org.lwjgl.system.JNI.invokeV(r0)
            return
    }

    @org.lwjgl.system.NativeType("ALvoid")
    public static void alProcessUpdatesSOFT() {
            org.lwjgl.openal.ALCapabilities r0 = org.lwjgl.openal.AL.getICD()
            long r0 = r0.alProcessUpdatesSOFT
            r3 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L12
            r0 = r3
            long r0 = org.lwjgl.system.Checks.check(r0)
        L12:
            r0 = r3
            org.lwjgl.system.JNI.invokeV(r0)
            return
    }
}
