package org.lwjgl.vulkan;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/KHRSwapchainMaintenance1.class */
public class KHRSwapchainMaintenance1 {
    public static final int VK_KHR_SWAPCHAIN_MAINTENANCE_1_SPEC_VERSION = 1;
    public static final java.lang.String VK_KHR_SWAPCHAIN_MAINTENANCE_1_EXTENSION_NAME = "VK_KHR_swapchain_maintenance1";
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SWAPCHAIN_MAINTENANCE_1_FEATURES_KHR = 1000275000;
    public static final int VK_STRUCTURE_TYPE_SWAPCHAIN_PRESENT_FENCE_INFO_KHR = 1000275001;
    public static final int VK_STRUCTURE_TYPE_SWAPCHAIN_PRESENT_MODES_CREATE_INFO_KHR = 1000275002;
    public static final int VK_STRUCTURE_TYPE_SWAPCHAIN_PRESENT_MODE_INFO_KHR = 1000275003;
    public static final int VK_STRUCTURE_TYPE_SWAPCHAIN_PRESENT_SCALING_CREATE_INFO_KHR = 1000275004;
    public static final int VK_STRUCTURE_TYPE_RELEASE_SWAPCHAIN_IMAGES_INFO_KHR = 1000275005;
    public static final int VK_SWAPCHAIN_CREATE_DEFERRED_MEMORY_ALLOCATION_BIT_KHR = 8;

    protected KHRSwapchainMaintenance1() {
            r3 = this;
            r0 = r3
            r0.<init>()
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r1 = r0
            r1.<init>()
            throw r0
    }

    public static int nvkReleaseSwapchainImagesKHR(org.lwjgl.vulkan.VkDevice r7, long r8) {
            r0 = r7
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkReleaseSwapchainImagesKHR
            r10 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L17
            r0 = r10
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r8
            org.lwjgl.vulkan.VkReleaseSwapchainImagesInfoKHR.validate(r0)
        L17:
            r0 = r7
            long r0 = r0.address()
            r1 = r8
            r2 = r10
            int r0 = org.lwjgl.system.JNI.callPPI(r0, r1, r2)
            return r0
    }

    @org.lwjgl.system.NativeType("VkResult")
    public static int vkReleaseSwapchainImagesKHR(org.lwjgl.vulkan.VkDevice r4, @org.lwjgl.system.NativeType("VkReleaseSwapchainImagesInfoKHR const *") org.lwjgl.vulkan.VkReleaseSwapchainImagesInfoKHR r5) {
            r0 = r4
            r1 = r5
            long r1 = r1.address()
            int r0 = nvkReleaseSwapchainImagesKHR(r0, r1)
            return r0
    }
}
