package org.lwjgl.vulkan;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkPhysicalDevice.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkPhysicalDevice.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkPhysicalDevice.class */
public class VkPhysicalDevice extends org.lwjgl.vulkan.DispatchableHandleInstance {
    private final org.lwjgl.vulkan.VkInstance instance;

    public VkPhysicalDevice(long r6, org.lwjgl.vulkan.VkInstance r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            org.lwjgl.vulkan.VKCapabilitiesInstance r2 = r2.getCapabilities()
            r0.<init>(r1, r2)
            r0 = r5
            r1 = r8
            r0.instance = r1
            return
    }

    public org.lwjgl.vulkan.VkInstance getInstance() {
            r2 = this;
            r0 = r2
            org.lwjgl.vulkan.VkInstance r0 = r0.instance
            return r0
    }

    @Override // org.lwjgl.vulkan.DispatchableHandleInstance
    public /* bridge */ /* synthetic */ org.lwjgl.vulkan.VKCapabilitiesInstance getCapabilities() {
            r2 = this;
            r0 = r2
            org.lwjgl.vulkan.VKCapabilitiesInstance r0 = super.getCapabilities()
            return r0
    }
}
