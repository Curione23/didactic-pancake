package org.lwjgl.vulkan;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/DispatchableHandleDevice.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/DispatchableHandleDevice.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/DispatchableHandleDevice.class */
abstract class DispatchableHandleDevice extends org.lwjgl.system.Pointer.Default {
    private final org.lwjgl.vulkan.VKCapabilitiesDevice capabilities;

    DispatchableHandleDevice(long r5, org.lwjgl.vulkan.VKCapabilitiesDevice r7) {
            r4 = this;
            r0 = r4
            r1 = r5
            r0.<init>(r1)
            r0 = r4
            r1 = r7
            r0.capabilities = r1
            return
    }

    public org.lwjgl.vulkan.VKCapabilitiesDevice getCapabilities() {
            r2 = this;
            r0 = r2
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.capabilities
            return r0
    }

    public abstract org.lwjgl.vulkan.VKCapabilitiesInstance getCapabilitiesInstance();
}
