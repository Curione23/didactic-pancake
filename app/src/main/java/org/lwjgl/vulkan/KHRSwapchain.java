package org.lwjgl.vulkan;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/KHRSwapchain.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/KHRSwapchain.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/KHRSwapchain.class */
public class KHRSwapchain {
    public static final int VK_KHR_SWAPCHAIN_SPEC_VERSION = 70;
    public static final java.lang.String VK_KHR_SWAPCHAIN_EXTENSION_NAME = "VK_KHR_swapchain";
    public static final int VK_STRUCTURE_TYPE_SWAPCHAIN_CREATE_INFO_KHR = 1000001000;
    public static final int VK_STRUCTURE_TYPE_PRESENT_INFO_KHR = 1000001001;
    public static final int VK_STRUCTURE_TYPE_DEVICE_GROUP_PRESENT_CAPABILITIES_KHR = 1000060007;
    public static final int VK_STRUCTURE_TYPE_IMAGE_SWAPCHAIN_CREATE_INFO_KHR = 1000060008;
    public static final int VK_STRUCTURE_TYPE_BIND_IMAGE_MEMORY_SWAPCHAIN_INFO_KHR = 1000060009;
    public static final int VK_STRUCTURE_TYPE_ACQUIRE_NEXT_IMAGE_INFO_KHR = 1000060010;
    public static final int VK_STRUCTURE_TYPE_DEVICE_GROUP_PRESENT_INFO_KHR = 1000060011;
    public static final int VK_STRUCTURE_TYPE_DEVICE_GROUP_SWAPCHAIN_CREATE_INFO_KHR = 1000060012;
    public static final int VK_IMAGE_LAYOUT_PRESENT_SRC_KHR = 1000001002;
    public static final int VK_SUBOPTIMAL_KHR = 1000001003;
    public static final int VK_ERROR_OUT_OF_DATE_KHR = -1000001004;
    public static final int VK_OBJECT_TYPE_SWAPCHAIN_KHR = 1000001000;
    public static final int VK_SWAPCHAIN_CREATE_SPLIT_INSTANCE_BIND_REGIONS_BIT_KHR = 1;
    public static final int VK_SWAPCHAIN_CREATE_PROTECTED_BIT_KHR = 2;
    public static final int VK_DEVICE_GROUP_PRESENT_MODE_LOCAL_BIT_KHR = 1;
    public static final int VK_DEVICE_GROUP_PRESENT_MODE_REMOTE_BIT_KHR = 2;
    public static final int VK_DEVICE_GROUP_PRESENT_MODE_SUM_BIT_KHR = 4;
    public static final int VK_DEVICE_GROUP_PRESENT_MODE_LOCAL_MULTI_DEVICE_BIT_KHR = 8;

    protected KHRSwapchain() {
            r3 = this;
            r0 = r3
            r0.<init>()
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r1 = r0
            r1.<init>()
            throw r0
    }

    public static int nvkCreateSwapchainKHR(org.lwjgl.vulkan.VkDevice r11, long r12, long r14, long r16) {
            r0 = r11
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkCreateSwapchainKHR
            r18 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L15
            r0 = r18
            long r0 = org.lwjgl.system.Checks.check(r0)
        L15:
            r0 = r11
            long r0 = r0.address()
            r1 = r12
            r2 = r14
            r3 = r16
            r4 = r18
            int r0 = org.lwjgl.system.JNI.callPPPPI(r0, r1, r2, r3, r4)
            return r0
    }

    @org.lwjgl.system.NativeType("VkResult")
    public static int vkCreateSwapchainKHR(org.lwjgl.vulkan.VkDevice r8, @org.lwjgl.system.NativeType("VkSwapchainCreateInfoKHR const *") org.lwjgl.vulkan.VkSwapchainCreateInfoKHR r9, @org.lwjgl.system.NativeType("VkAllocationCallbacks const *") org.lwjgl.vulkan.VkAllocationCallbacks r10, @org.lwjgl.system.NativeType("VkSwapchainKHR *") java.nio.LongBuffer r11) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r11
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
        Lb:
            r0 = r8
            r1 = r9
            long r1 = r1.address()
            r2 = r10
            long r2 = org.lwjgl.system.MemoryUtil.memAddressSafe(r2)
            r3 = r11
            long r3 = org.lwjgl.system.MemoryUtil.memAddress(r3)
            int r0 = nvkCreateSwapchainKHR(r0, r1, r2, r3)
            return r0
    }

    public static void nvkDestroySwapchainKHR(org.lwjgl.vulkan.VkDevice r9, long r10, long r12) {
            r0 = r9
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkDestroySwapchainKHR
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
            org.lwjgl.system.JNI.callPJPV(r0, r1, r2, r3)
            return
    }

    public static void vkDestroySwapchainKHR(org.lwjgl.vulkan.VkDevice r6, @org.lwjgl.system.NativeType("VkSwapchainKHR") long r7, @org.lwjgl.system.NativeType("VkAllocationCallbacks const *") org.lwjgl.vulkan.VkAllocationCallbacks r9) {
            r0 = r6
            r1 = r7
            r2 = r9
            long r2 = org.lwjgl.system.MemoryUtil.memAddressSafe(r2)
            nvkDestroySwapchainKHR(r0, r1, r2)
            return
    }

    public static int nvkGetSwapchainImagesKHR(org.lwjgl.vulkan.VkDevice r11, long r12, long r14, long r16) {
            r0 = r11
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkGetSwapchainImagesKHR
            r18 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L15
            r0 = r18
            long r0 = org.lwjgl.system.Checks.check(r0)
        L15:
            r0 = r11
            long r0 = r0.address()
            r1 = r12
            r2 = r14
            r3 = r16
            r4 = r18
            int r0 = org.lwjgl.system.JNI.callPJPPI(r0, r1, r2, r3, r4)
            return r0
    }

    @org.lwjgl.system.NativeType("VkResult")
    public static int vkGetSwapchainImagesKHR(org.lwjgl.vulkan.VkDevice r8, @org.lwjgl.system.NativeType("VkSwapchainKHR") long r9, @org.lwjgl.system.NativeType("uint32_t *") java.nio.IntBuffer r11, @org.lwjgl.system.NativeType("VkImage *") java.nio.LongBuffer r12) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L18
            r0 = r11
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
            r0 = r12
            r1 = r11
            r2 = r11
            int r2 = r2.position()
            int r1 = r1.get(r2)
            org.lwjgl.system.Checks.checkSafe(r0, r1)
        L18:
            r0 = r8
            r1 = r9
            r2 = r11
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            r3 = r12
            long r3 = org.lwjgl.system.MemoryUtil.memAddressSafe(r3)
            int r0 = nvkGetSwapchainImagesKHR(r0, r1, r2, r3)
            return r0
    }

    public static int nvkAcquireNextImageKHR(org.lwjgl.vulkan.VkDevice r15, long r16, long r18, long r20, long r22, long r24) {
            r0 = r15
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkAcquireNextImageKHR
            r26 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L15
            r0 = r26
            long r0 = org.lwjgl.system.Checks.check(r0)
        L15:
            r0 = r15
            long r0 = r0.address()
            r1 = r16
            r2 = r18
            r3 = r20
            r4 = r22
            r5 = r24
            r6 = r26
            int r0 = org.lwjgl.system.JNI.callPJJJJPI(r0, r1, r2, r3, r4, r5, r6)
            return r0
    }

    @org.lwjgl.system.NativeType("VkResult")
    public static int vkAcquireNextImageKHR(org.lwjgl.vulkan.VkDevice r12, @org.lwjgl.system.NativeType("VkSwapchainKHR") long r13, @org.lwjgl.system.NativeType("uint64_t") long r15, @org.lwjgl.system.NativeType("VkSemaphore") long r17, @org.lwjgl.system.NativeType("VkFence") long r19, @org.lwjgl.system.NativeType("uint32_t *") java.nio.IntBuffer r21) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lc
            r0 = r21
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
        Lc:
            r0 = r12
            r1 = r13
            r2 = r15
            r3 = r17
            r4 = r19
            r5 = r21
            long r5 = org.lwjgl.system.MemoryUtil.memAddress(r5)
            int r0 = nvkAcquireNextImageKHR(r0, r1, r2, r3, r4, r5)
            return r0
    }

    public static int nvkQueuePresentKHR(org.lwjgl.vulkan.VkQueue r7, long r8) {
            r0 = r7
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkQueuePresentKHR
            r10 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L17
            r0 = r10
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r8
            org.lwjgl.vulkan.VkPresentInfoKHR.validate(r0)
        L17:
            org.lwjgl.vulkan.VK.onVKFrame()
            r0 = r7
            long r0 = r0.address()
            r1 = r8
            r2 = r10
            int r0 = org.lwjgl.system.JNI.callPPI(r0, r1, r2)
            return r0
    }

    @org.lwjgl.system.NativeType("VkResult")
    public static int vkQueuePresentKHR(org.lwjgl.vulkan.VkQueue r4, @org.lwjgl.system.NativeType("VkPresentInfoKHR const *") org.lwjgl.vulkan.VkPresentInfoKHR r5) {
            r0 = r4
            r1 = r5
            long r1 = r1.address()
            int r0 = nvkQueuePresentKHR(r0, r1)
            return r0
    }

    public static int nvkGetDeviceGroupPresentCapabilitiesKHR(org.lwjgl.vulkan.VkDevice r7, long r8) {
            r0 = r7
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkGetDeviceGroupPresentCapabilitiesKHR
            r10 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L13
            r0 = r10
            long r0 = org.lwjgl.system.Checks.check(r0)
        L13:
            r0 = r7
            long r0 = r0.address()
            r1 = r8
            r2 = r10
            int r0 = org.lwjgl.system.JNI.callPPI(r0, r1, r2)
            return r0
    }

    @org.lwjgl.system.NativeType("VkResult")
    public static int vkGetDeviceGroupPresentCapabilitiesKHR(org.lwjgl.vulkan.VkDevice r4, @org.lwjgl.system.NativeType("VkDeviceGroupPresentCapabilitiesKHR *") org.lwjgl.vulkan.VkDeviceGroupPresentCapabilitiesKHR r5) {
            r0 = r4
            r1 = r5
            long r1 = r1.address()
            int r0 = nvkGetDeviceGroupPresentCapabilitiesKHR(r0, r1)
            return r0
    }

    public static int nvkGetDeviceGroupSurfacePresentModesKHR(org.lwjgl.vulkan.VkDevice r9, long r10, long r12) {
            r0 = r9
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkGetDeviceGroupSurfacePresentModesKHR
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
    public static int vkGetDeviceGroupSurfacePresentModesKHR(org.lwjgl.vulkan.VkDevice r6, @org.lwjgl.system.NativeType("VkSurfaceKHR") long r7, @org.lwjgl.system.NativeType("VkDeviceGroupPresentModeFlagsKHR *") java.nio.IntBuffer r9) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r9
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
        Lb:
            r0 = r6
            r1 = r7
            r2 = r9
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            int r0 = nvkGetDeviceGroupSurfacePresentModesKHR(r0, r1, r2)
            return r0
    }

    public static int nvkGetPhysicalDevicePresentRectanglesKHR(org.lwjgl.vulkan.VkPhysicalDevice r11, long r12, long r14, long r16) {
            r0 = r11
            org.lwjgl.vulkan.VKCapabilitiesInstance r0 = r0.getCapabilities()
            long r0 = r0.vkGetPhysicalDevicePresentRectanglesKHR
            r18 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L15
            r0 = r18
            long r0 = org.lwjgl.system.Checks.check(r0)
        L15:
            r0 = r11
            long r0 = r0.address()
            r1 = r12
            r2 = r14
            r3 = r16
            r4 = r18
            int r0 = org.lwjgl.system.JNI.callPJPPI(r0, r1, r2, r3, r4)
            return r0
    }

    @org.lwjgl.system.NativeType("VkResult")
    public static int vkGetPhysicalDevicePresentRectanglesKHR(org.lwjgl.vulkan.VkPhysicalDevice r8, @org.lwjgl.system.NativeType("VkSurfaceKHR") long r9, @org.lwjgl.system.NativeType("uint32_t *") java.nio.IntBuffer r11, @org.lwjgl.system.NativeType("VkRect2D *") org.lwjgl.vulkan.VkRect2D.Buffer r12) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L18
            r0 = r11
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
            r0 = r12
            r1 = r11
            r2 = r11
            int r2 = r2.position()
            int r1 = r1.get(r2)
            org.lwjgl.system.Checks.checkSafe(r0, r1)
        L18:
            r0 = r8
            r1 = r9
            r2 = r11
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            r3 = r12
            long r3 = org.lwjgl.system.MemoryUtil.memAddressSafe(r3)
            int r0 = nvkGetPhysicalDevicePresentRectanglesKHR(r0, r1, r2, r3)
            return r0
    }

    public static int nvkAcquireNextImage2KHR(org.lwjgl.vulkan.VkDevice r9, long r10, long r12) {
            r0 = r9
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkAcquireNextImage2KHR
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
            int r0 = org.lwjgl.system.JNI.callPPPI(r0, r1, r2, r3)
            return r0
    }

    @org.lwjgl.system.NativeType("VkResult")
    public static int vkAcquireNextImage2KHR(org.lwjgl.vulkan.VkDevice r6, @org.lwjgl.system.NativeType("VkAcquireNextImageInfoKHR const *") org.lwjgl.vulkan.VkAcquireNextImageInfoKHR r7, @org.lwjgl.system.NativeType("uint32_t *") java.nio.IntBuffer r8) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r8
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
        Lb:
            r0 = r6
            r1 = r7
            long r1 = r1.address()
            r2 = r8
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            int r0 = nvkAcquireNextImage2KHR(r0, r1, r2)
            return r0
    }

    @org.lwjgl.system.NativeType("VkResult")
    public static int vkCreateSwapchainKHR(org.lwjgl.vulkan.VkDevice r10, @org.lwjgl.system.NativeType("VkSwapchainCreateInfoKHR const *") org.lwjgl.vulkan.VkSwapchainCreateInfoKHR r11, @org.lwjgl.system.NativeType("VkAllocationCallbacks const *") org.lwjgl.vulkan.VkAllocationCallbacks r12, @org.lwjgl.system.NativeType("VkSwapchainKHR *") long[] r13) {
            r0 = r10
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkCreateSwapchainKHR
            r14 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L1a
            r0 = r14
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r13
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
        L1a:
            r0 = r10
            long r0 = r0.address()
            r1 = r11
            long r1 = r1.address()
            r2 = r12
            long r2 = org.lwjgl.system.MemoryUtil.memAddressSafe(r2)
            r3 = r13
            r4 = r14
            int r0 = org.lwjgl.system.JNI.callPPPPI(r0, r1, r2, r3, r4)
            return r0
    }

    @org.lwjgl.system.NativeType("VkResult")
    public static int vkGetSwapchainImagesKHR(org.lwjgl.vulkan.VkDevice r9, @org.lwjgl.system.NativeType("VkSwapchainKHR") long r10, @org.lwjgl.system.NativeType("uint32_t *") int[] r12, @org.lwjgl.system.NativeType("VkImage *") long[] r13) {
            r0 = r9
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkGetSwapchainImagesKHR
            r14 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L22
            r0 = r14
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r12
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
            r0 = r13
            r1 = r12
            r2 = 0
            r1 = r1[r2]
            org.lwjgl.system.Checks.checkSafe(r0, r1)
        L22:
            r0 = r9
            long r0 = r0.address()
            r1 = r10
            r2 = r12
            r3 = r13
            r4 = r14
            int r0 = org.lwjgl.system.JNI.callPJPPI(r0, r1, r2, r3, r4)
            return r0
    }

    @org.lwjgl.system.NativeType("VkResult")
    public static int vkAcquireNextImageKHR(org.lwjgl.vulkan.VkDevice r14, @org.lwjgl.system.NativeType("VkSwapchainKHR") long r15, @org.lwjgl.system.NativeType("uint64_t") long r17, @org.lwjgl.system.NativeType("VkSemaphore") long r19, @org.lwjgl.system.NativeType("VkFence") long r21, @org.lwjgl.system.NativeType("uint32_t *") int[] r23) {
            r0 = r14
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkAcquireNextImageKHR
            r24 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L1b
            r0 = r24
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r23
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
        L1b:
            r0 = r14
            long r0 = r0.address()
            r1 = r15
            r2 = r17
            r3 = r19
            r4 = r21
            r5 = r23
            r6 = r24
            int r0 = org.lwjgl.system.JNI.callPJJJJPI(r0, r1, r2, r3, r4, r5, r6)
            return r0
    }

    @org.lwjgl.system.NativeType("VkResult")
    public static int vkGetDeviceGroupSurfacePresentModesKHR(org.lwjgl.vulkan.VkDevice r8, @org.lwjgl.system.NativeType("VkSurfaceKHR") long r9, @org.lwjgl.system.NativeType("VkDeviceGroupPresentModeFlagsKHR *") int[] r11) {
            r0 = r8
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkGetDeviceGroupSurfacePresentModesKHR
            r12 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L1a
            r0 = r12
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r11
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
        L1a:
            r0 = r8
            long r0 = r0.address()
            r1 = r9
            r2 = r11
            r3 = r12
            int r0 = org.lwjgl.system.JNI.callPJPI(r0, r1, r2, r3)
            return r0
    }

    @org.lwjgl.system.NativeType("VkResult")
    public static int vkGetPhysicalDevicePresentRectanglesKHR(org.lwjgl.vulkan.VkPhysicalDevice r10, @org.lwjgl.system.NativeType("VkSurfaceKHR") long r11, @org.lwjgl.system.NativeType("uint32_t *") int[] r13, @org.lwjgl.system.NativeType("VkRect2D *") org.lwjgl.vulkan.VkRect2D.Buffer r14) {
            r0 = r10
            org.lwjgl.vulkan.VKCapabilitiesInstance r0 = r0.getCapabilities()
            long r0 = r0.vkGetPhysicalDevicePresentRectanglesKHR
            r15 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L22
            r0 = r15
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r13
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
            r0 = r14
            r1 = r13
            r2 = 0
            r1 = r1[r2]
            org.lwjgl.system.Checks.checkSafe(r0, r1)
        L22:
            r0 = r10
            long r0 = r0.address()
            r1 = r11
            r2 = r13
            r3 = r14
            long r3 = org.lwjgl.system.MemoryUtil.memAddressSafe(r3)
            r4 = r15
            int r0 = org.lwjgl.system.JNI.callPJPPI(r0, r1, r2, r3, r4)
            return r0
    }

    @org.lwjgl.system.NativeType("VkResult")
    public static int vkAcquireNextImage2KHR(org.lwjgl.vulkan.VkDevice r8, @org.lwjgl.system.NativeType("VkAcquireNextImageInfoKHR const *") org.lwjgl.vulkan.VkAcquireNextImageInfoKHR r9, @org.lwjgl.system.NativeType("uint32_t *") int[] r10) {
            r0 = r8
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkAcquireNextImage2KHR
            r11 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L18
            r0 = r11
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r10
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
        L18:
            r0 = r8
            long r0 = r0.address()
            r1 = r9
            long r1 = r1.address()
            r2 = r10
            r3 = r11
            int r0 = org.lwjgl.system.JNI.callPPPI(r0, r1, r2, r3)
            return r0
    }
}
