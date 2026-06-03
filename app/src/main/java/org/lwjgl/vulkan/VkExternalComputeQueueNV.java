package org.lwjgl.vulkan;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkExternalComputeQueueNV.class */
public class VkExternalComputeQueueNV extends org.lwjgl.vulkan.DispatchableHandleDevice {
    private final org.lwjgl.vulkan.VkDevice device;

    public VkExternalComputeQueueNV(long r6, org.lwjgl.vulkan.VkDevice r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            org.lwjgl.vulkan.VKCapabilitiesDevice r2 = r2.getCapabilities()
            r0.<init>(r1, r2)
            r0 = r5
            r1 = r8
            r0.device = r1
            return
    }

    public org.lwjgl.vulkan.VkDevice getDevice() {
            r2 = this;
            r0 = r2
            org.lwjgl.vulkan.VkDevice r0 = r0.device
            return r0
    }

    @Override // org.lwjgl.vulkan.DispatchableHandleDevice
    public org.lwjgl.vulkan.VKCapabilitiesInstance getCapabilitiesInstance() {
            r2 = this;
            r0 = r2
            org.lwjgl.vulkan.VkDevice r0 = r0.getDevice()
            org.lwjgl.vulkan.VKCapabilitiesInstance r0 = r0.getCapabilitiesInstance()
            return r0
    }

    @Override // org.lwjgl.vulkan.DispatchableHandleDevice
    public /* bridge */ /* synthetic */ org.lwjgl.vulkan.VKCapabilitiesDevice getCapabilities() {
            r2 = this;
            r0 = r2
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = super.getCapabilities()
            return r0
    }
}
