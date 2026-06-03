package org.lwjgl.vulkan;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/DispatchableHandleInstance.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/DispatchableHandleInstance.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/DispatchableHandleInstance.class */
abstract class DispatchableHandleInstance extends org.lwjgl.system.Pointer.Default {
    private final org.lwjgl.vulkan.VKCapabilitiesInstance capabilities;

    DispatchableHandleInstance(long r5, org.lwjgl.vulkan.VKCapabilitiesInstance r7) {
            r4 = this;
            r0 = r4
            r1 = r5
            r0.<init>(r1)
            r0 = r4
            r1 = r7
            r0.capabilities = r1
            return
    }

    public org.lwjgl.vulkan.VKCapabilitiesInstance getCapabilities() {
            r2 = this;
            r0 = r2
            org.lwjgl.vulkan.VKCapabilitiesInstance r0 = r0.capabilities
            return r0
    }
}
