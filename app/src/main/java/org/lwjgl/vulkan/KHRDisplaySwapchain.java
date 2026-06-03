package org.lwjgl.vulkan;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/KHRDisplaySwapchain.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/KHRDisplaySwapchain.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/KHRDisplaySwapchain.class */
public class KHRDisplaySwapchain {
    public static final int VK_KHR_DISPLAY_SWAPCHAIN_SPEC_VERSION = 10;
    public static final java.lang.String VK_KHR_DISPLAY_SWAPCHAIN_EXTENSION_NAME = "VK_KHR_display_swapchain";
    public static final int VK_STRUCTURE_TYPE_DISPLAY_PRESENT_INFO_KHR = 1000003000;
    public static final int VK_ERROR_INCOMPATIBLE_DISPLAY_KHR = -1000003001;

    protected KHRDisplaySwapchain() {
            r3 = this;
            r0 = r3
            r0.<init>()
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r1 = r0
            r1.<init>()
            throw r0
    }

    public static int nvkCreateSharedSwapchainsKHR(org.lwjgl.vulkan.VkDevice r12, int r13, long r14, long r16, long r18) {
            r0 = r12
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkCreateSharedSwapchainsKHR
            r20 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L15
            r0 = r20
            long r0 = org.lwjgl.system.Checks.check(r0)
        L15:
            r0 = r12
            long r0 = r0.address()
            r1 = r13
            r2 = r14
            r3 = r16
            r4 = r18
            r5 = r20
            int r0 = org.lwjgl.system.JNI.callPPPPI(r0, r1, r2, r3, r4, r5)
            return r0
    }

    @org.lwjgl.system.NativeType("VkResult")
    public static int vkCreateSharedSwapchainsKHR(org.lwjgl.vulkan.VkDevice r9, @org.lwjgl.system.NativeType("VkSwapchainCreateInfoKHR const *") org.lwjgl.vulkan.VkSwapchainCreateInfoKHR.Buffer r10, @javax.annotation.Nullable @org.lwjgl.system.NativeType("VkAllocationCallbacks const *") org.lwjgl.vulkan.VkAllocationCallbacks r11, @org.lwjgl.system.NativeType("VkSwapchainKHR *") java.nio.LongBuffer r12) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Le
            r0 = r12
            r1 = r10
            int r1 = r1.remaining()
            org.lwjgl.system.Checks.check(r0, r1)
        Le:
            r0 = r9
            r1 = r10
            int r1 = r1.remaining()
            r2 = r10
            long r2 = r2.address()
            r3 = r11
            long r3 = org.lwjgl.system.MemoryUtil.memAddressSafe(r3)
            r4 = r12
            long r4 = org.lwjgl.system.MemoryUtil.memAddress(r4)
            int r0 = nvkCreateSharedSwapchainsKHR(r0, r1, r2, r3, r4)
            return r0
    }

    @org.lwjgl.system.NativeType("VkResult")
    public static int vkCreateSharedSwapchainsKHR(org.lwjgl.vulkan.VkDevice r11, @org.lwjgl.system.NativeType("VkSwapchainCreateInfoKHR const *") org.lwjgl.vulkan.VkSwapchainCreateInfoKHR.Buffer r12, @javax.annotation.Nullable @org.lwjgl.system.NativeType("VkAllocationCallbacks const *") org.lwjgl.vulkan.VkAllocationCallbacks r13, @org.lwjgl.system.NativeType("VkSwapchainKHR *") long[] r14) {
            r0 = r11
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkCreateSharedSwapchainsKHR
            r15 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L1d
            r0 = r15
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r14
            r1 = r12
            int r1 = r1.remaining()
            org.lwjgl.system.Checks.check(r0, r1)
        L1d:
            r0 = r11
            long r0 = r0.address()
            r1 = r12
            int r1 = r1.remaining()
            r2 = r12
            long r2 = r2.address()
            r3 = r13
            long r3 = org.lwjgl.system.MemoryUtil.memAddressSafe(r3)
            r4 = r14
            r5 = r15
            int r0 = org.lwjgl.system.JNI.callPPPPI(r0, r1, r2, r3, r4, r5)
            return r0
    }
}
