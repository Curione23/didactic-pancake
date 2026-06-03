package org.lwjgl.vulkan;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/KHRPresentWait2.class */
public class KHRPresentWait2 {
    public static final int VK_KHR_PRESENT_WAIT_2_SPEC_VERSION = 1;
    public static final java.lang.String VK_KHR_PRESENT_WAIT_2_EXTENSION_NAME = "VK_KHR_present_wait2";
    public static final int VK_SWAPCHAIN_CREATE_PRESENT_WAIT_2_BIT_KHR = 128;
    public static final int VK_STRUCTURE_TYPE_SURFACE_CAPABILITIES_PRESENT_WAIT_2_KHR = 1000480000;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_PRESENT_WAIT_2_FEATURES_KHR = 1000480001;
    public static final int VK_STRUCTURE_TYPE_PRESENT_WAIT_2_INFO_KHR = 1000480002;

    protected KHRPresentWait2() {
            r3 = this;
            r0 = r3
            r0.<init>()
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r1 = r0
            r1.<init>()
            throw r0
    }

    public static int nvkWaitForPresent2KHR(org.lwjgl.vulkan.VkDevice r9, long r10, long r12) {
            r0 = r9
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkWaitForPresent2KHR
            r14 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L15
            r0 = r14
            long r0 = org.lwjgl.system.Checks.check(r0)
        L15:
            r0 = r9
            long r0 = r0.address()
            r1 = r10
            r2 = r12
            r3 = r14
            int r0 = org.lwjgl.system.JNI.callPJPI(r0, r1, r2, r3)
            return r0
    }

    @org.lwjgl.system.NativeType("VkResult")
    public static int vkWaitForPresent2KHR(org.lwjgl.vulkan.VkDevice r6, @org.lwjgl.system.NativeType("VkSwapchainKHR") long r7, @org.lwjgl.system.NativeType("VkPresentWait2InfoKHR const *") org.lwjgl.vulkan.VkPresentWait2InfoKHR r9) {
            r0 = r6
            r1 = r7
            r2 = r9
            long r2 = r2.address()
            int r0 = nvkWaitForPresent2KHR(r0, r1, r2)
            return r0
    }
}
