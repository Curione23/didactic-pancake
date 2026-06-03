package org.lwjgl.vulkan;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/KHRDeviceGroup.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/KHRDeviceGroup.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/KHRDeviceGroup.class */
public class KHRDeviceGroup {
    public static final int VK_KHR_DEVICE_GROUP_SPEC_VERSION = 4;
    public static final java.lang.String VK_KHR_DEVICE_GROUP_EXTENSION_NAME = "VK_KHR_device_group";
    public static final int VK_STRUCTURE_TYPE_MEMORY_ALLOCATE_FLAGS_INFO_KHR = 1000060000;
    public static final int VK_STRUCTURE_TYPE_DEVICE_GROUP_RENDER_PASS_BEGIN_INFO_KHR = 1000060003;
    public static final int VK_STRUCTURE_TYPE_DEVICE_GROUP_COMMAND_BUFFER_BEGIN_INFO_KHR = 1000060004;
    public static final int VK_STRUCTURE_TYPE_DEVICE_GROUP_SUBMIT_INFO_KHR = 1000060005;
    public static final int VK_STRUCTURE_TYPE_DEVICE_GROUP_BIND_SPARSE_INFO_KHR = 1000060006;
    public static final int VK_PEER_MEMORY_FEATURE_COPY_SRC_BIT_KHR = 1;
    public static final int VK_PEER_MEMORY_FEATURE_COPY_DST_BIT_KHR = 2;
    public static final int VK_PEER_MEMORY_FEATURE_GENERIC_SRC_BIT_KHR = 4;
    public static final int VK_PEER_MEMORY_FEATURE_GENERIC_DST_BIT_KHR = 8;
    public static final int VK_MEMORY_ALLOCATE_DEVICE_MASK_BIT_KHR = 1;
    public static final int VK_PIPELINE_CREATE_VIEW_INDEX_FROM_DEVICE_INDEX_BIT_KHR = 8;
    public static final int VK_PIPELINE_CREATE_DISPATCH_BASE_KHR = 16;
    public static final int VK_DEPENDENCY_DEVICE_GROUP_BIT_KHR = 4;
    public static final int VK_STRUCTURE_TYPE_BIND_BUFFER_MEMORY_DEVICE_GROUP_INFO_KHR = 1000060013;
    public static final int VK_STRUCTURE_TYPE_BIND_IMAGE_MEMORY_DEVICE_GROUP_INFO_KHR = 1000060014;
    public static final int VK_IMAGE_CREATE_SPLIT_INSTANCE_BIND_REGIONS_BIT_KHR = 64;
    public static final int VK_STRUCTURE_TYPE_DEVICE_GROUP_PRESENT_CAPABILITIES_KHR = 1000060007;
    public static final int VK_STRUCTURE_TYPE_IMAGE_SWAPCHAIN_CREATE_INFO_KHR = 1000060008;
    public static final int VK_STRUCTURE_TYPE_BIND_IMAGE_MEMORY_SWAPCHAIN_INFO_KHR = 1000060009;
    public static final int VK_STRUCTURE_TYPE_ACQUIRE_NEXT_IMAGE_INFO_KHR = 1000060010;
    public static final int VK_STRUCTURE_TYPE_DEVICE_GROUP_PRESENT_INFO_KHR = 1000060011;
    public static final int VK_STRUCTURE_TYPE_DEVICE_GROUP_SWAPCHAIN_CREATE_INFO_KHR = 1000060012;
    public static final int VK_SWAPCHAIN_CREATE_SPLIT_INSTANCE_BIND_REGIONS_BIT_KHR = 1;

    protected KHRDeviceGroup() {
            r3 = this;
            r0 = r3
            r0.<init>()
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r1 = r0
            r1.<init>()
            throw r0
    }

    public static void nvkGetDeviceGroupPeerMemoryFeaturesKHR(org.lwjgl.vulkan.VkDevice r10, int r11, int r12, int r13, long r14) {
            r0 = r10
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkGetDeviceGroupPeerMemoryFeaturesKHR
            r16 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L15
            r0 = r16
            long r0 = org.lwjgl.system.Checks.check(r0)
        L15:
            r0 = r10
            long r0 = r0.address()
            r1 = r11
            r2 = r12
            r3 = r13
            r4 = r14
            r5 = r16
            org.lwjgl.system.JNI.callPPV(r0, r1, r2, r3, r4, r5)
            return
    }

    public static void vkGetDeviceGroupPeerMemoryFeaturesKHR(org.lwjgl.vulkan.VkDevice r7, @org.lwjgl.system.NativeType("uint32_t") int r8, @org.lwjgl.system.NativeType("uint32_t") int r9, @org.lwjgl.system.NativeType("uint32_t") int r10, @org.lwjgl.system.NativeType("VkPeerMemoryFeatureFlags *") java.nio.IntBuffer r11) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lc
            r0 = r11
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
        Lc:
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            long r4 = org.lwjgl.system.MemoryUtil.memAddress(r4)
            nvkGetDeviceGroupPeerMemoryFeaturesKHR(r0, r1, r2, r3, r4)
            return
    }

    public static void vkCmdSetDeviceMaskKHR(org.lwjgl.vulkan.VkCommandBuffer r6, @org.lwjgl.system.NativeType("uint32_t") int r7) {
            r0 = r6
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkCmdSetDeviceMaskKHR
            r8 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L13
            r0 = r8
            long r0 = org.lwjgl.system.Checks.check(r0)
        L13:
            r0 = r6
            long r0 = r0.address()
            r1 = r7
            r2 = r8
            org.lwjgl.system.JNI.callPV(r0, r1, r2)
            return
    }

    public static void vkCmdDispatchBaseKHR(org.lwjgl.vulkan.VkCommandBuffer r11, @org.lwjgl.system.NativeType("uint32_t") int r12, @org.lwjgl.system.NativeType("uint32_t") int r13, @org.lwjgl.system.NativeType("uint32_t") int r14, @org.lwjgl.system.NativeType("uint32_t") int r15, @org.lwjgl.system.NativeType("uint32_t") int r16, @org.lwjgl.system.NativeType("uint32_t") int r17) {
            r0 = r11
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkCmdDispatchBaseKHR
            r18 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L15
            r0 = r18
            long r0 = org.lwjgl.system.Checks.check(r0)
        L15:
            r0 = r11
            long r0 = r0.address()
            r1 = r12
            r2 = r13
            r3 = r14
            r4 = r15
            r5 = r16
            r6 = r17
            r7 = r18
            org.lwjgl.system.JNI.callPV(r0, r1, r2, r3, r4, r5, r6, r7)
            return
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
    public static int vkGetPhysicalDevicePresentRectanglesKHR(org.lwjgl.vulkan.VkPhysicalDevice r8, @org.lwjgl.system.NativeType("VkSurfaceKHR") long r9, @org.lwjgl.system.NativeType("uint32_t *") java.nio.IntBuffer r11, @javax.annotation.Nullable @org.lwjgl.system.NativeType("VkRect2D *") org.lwjgl.vulkan.VkRect2D.Buffer r12) {
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

    public static void vkGetDeviceGroupPeerMemoryFeaturesKHR(org.lwjgl.vulkan.VkDevice r9, @org.lwjgl.system.NativeType("uint32_t") int r10, @org.lwjgl.system.NativeType("uint32_t") int r11, @org.lwjgl.system.NativeType("uint32_t") int r12, @org.lwjgl.system.NativeType("VkPeerMemoryFeatureFlags *") int[] r13) {
            r0 = r9
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkGetDeviceGroupPeerMemoryFeaturesKHR
            r14 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L1b
            r0 = r14
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r13
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
        L1b:
            r0 = r9
            long r0 = r0.address()
            r1 = r10
            r2 = r11
            r3 = r12
            r4 = r13
            r5 = r14
            org.lwjgl.system.JNI.callPPV(r0, r1, r2, r3, r4, r5)
            return
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
    public static int vkGetPhysicalDevicePresentRectanglesKHR(org.lwjgl.vulkan.VkPhysicalDevice r10, @org.lwjgl.system.NativeType("VkSurfaceKHR") long r11, @org.lwjgl.system.NativeType("uint32_t *") int[] r13, @javax.annotation.Nullable @org.lwjgl.system.NativeType("VkRect2D *") org.lwjgl.vulkan.VkRect2D.Buffer r14) {
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
