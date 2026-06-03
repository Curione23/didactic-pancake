package org.lwjgl.vulkan;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/EXTPresentTiming.class */
public class EXTPresentTiming {
    public static final int VK_EXT_PRESENT_TIMING_SPEC_VERSION = 3;
    public static final java.lang.String VK_EXT_PRESENT_TIMING_EXTENSION_NAME = "VK_EXT_present_timing";
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_PRESENT_TIMING_FEATURES_EXT = 1000208000;
    public static final int VK_STRUCTURE_TYPE_SWAPCHAIN_TIMING_PROPERTIES_EXT = 1000208001;
    public static final int VK_STRUCTURE_TYPE_SWAPCHAIN_TIME_DOMAIN_PROPERTIES_EXT = 1000208002;
    public static final int VK_STRUCTURE_TYPE_PRESENT_TIMINGS_INFO_EXT = 1000208003;
    public static final int VK_STRUCTURE_TYPE_PRESENT_TIMING_INFO_EXT = 1000208004;
    public static final int VK_STRUCTURE_TYPE_PAST_PRESENTATION_TIMING_INFO_EXT = 1000208005;
    public static final int VK_STRUCTURE_TYPE_PAST_PRESENTATION_TIMING_PROPERTIES_EXT = 1000208006;
    public static final int VK_STRUCTURE_TYPE_PAST_PRESENTATION_TIMING_EXT = 1000208007;
    public static final int VK_STRUCTURE_TYPE_PRESENT_TIMING_SURFACE_CAPABILITIES_EXT = 1000208008;
    public static final int VK_STRUCTURE_TYPE_SWAPCHAIN_CALIBRATED_TIMESTAMP_INFO_EXT = 1000208009;
    public static final int VK_TIME_DOMAIN_PRESENT_STAGE_LOCAL_EXT = 1000208000;
    public static final int VK_TIME_DOMAIN_SWAPCHAIN_LOCAL_EXT = 1000208001;
    public static final int VK_ERROR_PRESENT_TIMING_QUEUE_FULL_EXT = -1000208000;
    public static final int VK_SWAPCHAIN_CREATE_PRESENT_TIMING_BIT_EXT = 512;
    public static final int VK_PRESENT_STAGE_QUEUE_OPERATIONS_END_BIT_EXT = 1;
    public static final int VK_PRESENT_STAGE_REQUEST_DEQUEUED_BIT_EXT = 2;
    public static final int VK_PRESENT_STAGE_IMAGE_FIRST_PIXEL_OUT_BIT_EXT = 4;
    public static final int VK_PRESENT_STAGE_IMAGE_FIRST_PIXEL_VISIBLE_BIT_EXT = 8;
    public static final int VK_PAST_PRESENTATION_TIMING_ALLOW_PARTIAL_RESULTS_BIT_EXT = 1;
    public static final int VK_PAST_PRESENTATION_TIMING_ALLOW_OUT_OF_ORDER_RESULTS_BIT_EXT = 2;
    public static final int VK_PRESENT_TIMING_INFO_PRESENT_AT_RELATIVE_TIME_BIT_EXT = 1;
    public static final int VK_PRESENT_TIMING_INFO_PRESENT_AT_NEAREST_REFRESH_CYCLE_BIT_EXT = 2;

    protected EXTPresentTiming() {
            r3 = this;
            r0 = r3
            r0.<init>()
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r1 = r0
            r1.<init>()
            throw r0
    }

    @org.lwjgl.system.NativeType("VkResult")
    public static int vkSetSwapchainPresentTimingQueueSizeEXT(org.lwjgl.vulkan.VkDevice r8, @org.lwjgl.system.NativeType("VkSwapchainKHR") long r9, @org.lwjgl.system.NativeType("uint32_t") int r11) {
            r0 = r8
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkSetSwapchainPresentTimingQueueSizeEXT
            r12 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L15
            r0 = r12
            long r0 = org.lwjgl.system.Checks.check(r0)
        L15:
            r0 = r8
            long r0 = r0.address()
            r1 = r9
            r2 = r11
            r3 = r12
            int r0 = org.lwjgl.system.JNI.callPJI(r0, r1, r2, r3)
            return r0
    }

    public static int nvkGetSwapchainTimingPropertiesEXT(org.lwjgl.vulkan.VkDevice r11, long r12, long r14, long r16) {
            r0 = r11
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkGetSwapchainTimingPropertiesEXT
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
    public static int vkGetSwapchainTimingPropertiesEXT(org.lwjgl.vulkan.VkDevice r8, @org.lwjgl.system.NativeType("VkSwapchainKHR") long r9, @org.lwjgl.system.NativeType("VkSwapchainTimingPropertiesEXT *") org.lwjgl.vulkan.VkSwapchainTimingPropertiesEXT r11, @org.lwjgl.system.NativeType("uint64_t *") java.nio.LongBuffer r12) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lc
            r0 = r12
            r1 = 1
            org.lwjgl.system.Checks.checkSafe(r0, r1)
        Lc:
            r0 = r8
            r1 = r9
            r2 = r11
            long r2 = r2.address()
            r3 = r12
            long r3 = org.lwjgl.system.MemoryUtil.memAddressSafe(r3)
            int r0 = nvkGetSwapchainTimingPropertiesEXT(r0, r1, r2, r3)
            return r0
    }

    public static int nvkGetSwapchainTimeDomainPropertiesEXT(org.lwjgl.vulkan.VkDevice r11, long r12, long r14, long r16) {
            r0 = r11
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkGetSwapchainTimeDomainPropertiesEXT
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
    public static int vkGetSwapchainTimeDomainPropertiesEXT(org.lwjgl.vulkan.VkDevice r8, @org.lwjgl.system.NativeType("VkSwapchainKHR") long r9, @org.lwjgl.system.NativeType("VkSwapchainTimeDomainPropertiesEXT *") org.lwjgl.vulkan.VkSwapchainTimeDomainPropertiesEXT r11, @org.lwjgl.system.NativeType("uint64_t *") java.nio.LongBuffer r12) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lc
            r0 = r12
            r1 = 1
            org.lwjgl.system.Checks.checkSafe(r0, r1)
        Lc:
            r0 = r8
            r1 = r9
            r2 = r11
            long r2 = r2.address()
            r3 = r12
            long r3 = org.lwjgl.system.MemoryUtil.memAddressSafe(r3)
            int r0 = nvkGetSwapchainTimeDomainPropertiesEXT(r0, r1, r2, r3)
            return r0
    }

    public static int nvkGetPastPresentationTimingEXT(org.lwjgl.vulkan.VkDevice r9, long r10, long r12) {
            r0 = r9
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkGetPastPresentationTimingEXT
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
    public static int vkGetPastPresentationTimingEXT(org.lwjgl.vulkan.VkDevice r6, @org.lwjgl.system.NativeType("VkPastPresentationTimingInfoEXT const *") org.lwjgl.vulkan.VkPastPresentationTimingInfoEXT r7, @org.lwjgl.system.NativeType("VkPastPresentationTimingPropertiesEXT *") org.lwjgl.vulkan.VkPastPresentationTimingPropertiesEXT r8) {
            r0 = r6
            r1 = r7
            long r1 = r1.address()
            r2 = r8
            long r2 = r2.address()
            int r0 = nvkGetPastPresentationTimingEXT(r0, r1, r2)
            return r0
    }

    @org.lwjgl.system.NativeType("VkResult")
    public static int vkGetSwapchainTimingPropertiesEXT(org.lwjgl.vulkan.VkDevice r10, @org.lwjgl.system.NativeType("VkSwapchainKHR") long r11, @org.lwjgl.system.NativeType("VkSwapchainTimingPropertiesEXT *") org.lwjgl.vulkan.VkSwapchainTimingPropertiesEXT r13, @org.lwjgl.system.NativeType("uint64_t *") long[] r14) {
            r0 = r10
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkGetSwapchainTimingPropertiesEXT
            r15 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L1b
            r0 = r15
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r14
            r1 = 1
            org.lwjgl.system.Checks.checkSafe(r0, r1)
        L1b:
            r0 = r10
            long r0 = r0.address()
            r1 = r11
            r2 = r13
            long r2 = r2.address()
            r3 = r14
            r4 = r15
            int r0 = org.lwjgl.system.JNI.callPJPPI(r0, r1, r2, r3, r4)
            return r0
    }

    @org.lwjgl.system.NativeType("VkResult")
    public static int vkGetSwapchainTimeDomainPropertiesEXT(org.lwjgl.vulkan.VkDevice r10, @org.lwjgl.system.NativeType("VkSwapchainKHR") long r11, @org.lwjgl.system.NativeType("VkSwapchainTimeDomainPropertiesEXT *") org.lwjgl.vulkan.VkSwapchainTimeDomainPropertiesEXT r13, @org.lwjgl.system.NativeType("uint64_t *") long[] r14) {
            r0 = r10
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkGetSwapchainTimeDomainPropertiesEXT
            r15 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L1b
            r0 = r15
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r14
            r1 = 1
            org.lwjgl.system.Checks.checkSafe(r0, r1)
        L1b:
            r0 = r10
            long r0 = r0.address()
            r1 = r11
            r2 = r13
            long r2 = r2.address()
            r3 = r14
            r4 = r15
            int r0 = org.lwjgl.system.JNI.callPJPPI(r0, r1, r2, r3, r4)
            return r0
    }
}
