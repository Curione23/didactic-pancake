package org.lwjgl.vulkan;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/ARMPerformanceCountersByRegion.class */
public class ARMPerformanceCountersByRegion {
    public static final int VK_ARM_PERFORMANCE_COUNTERS_BY_REGION_SPEC_VERSION = 1;
    public static final java.lang.String VK_ARM_PERFORMANCE_COUNTERS_BY_REGION_EXTENSION_NAME = "VK_ARM_performance_counters_by_region";
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_PERFORMANCE_COUNTERS_BY_REGION_FEATURES_ARM = 1000605000;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_PERFORMANCE_COUNTERS_BY_REGION_PROPERTIES_ARM = 1000605001;
    public static final int VK_STRUCTURE_TYPE_PERFORMANCE_COUNTER_ARM = 1000605002;
    public static final int VK_STRUCTURE_TYPE_PERFORMANCE_COUNTER_DESCRIPTION_ARM = 1000605003;
    public static final int VK_STRUCTURE_TYPE_RENDER_PASS_PERFORMANCE_COUNTERS_BY_REGION_BEGIN_INFO_ARM = 1000605004;

    protected ARMPerformanceCountersByRegion() {
            r3 = this;
            r0 = r3
            r0.<init>()
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r1 = r0
            r1.<init>()
            throw r0
    }

    public static int nvkEnumeratePhysicalDeviceQueueFamilyPerformanceCountersByRegionARM(org.lwjgl.vulkan.VkPhysicalDevice r12, int r13, long r14, long r16, long r18) {
            r0 = r12
            org.lwjgl.vulkan.VKCapabilitiesInstance r0 = r0.getCapabilities()
            long r0 = r0.vkEnumeratePhysicalDeviceQueueFamilyPerformanceCountersByRegionARM
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
    public static int vkEnumeratePhysicalDeviceQueueFamilyPerformanceCountersByRegionARM(org.lwjgl.vulkan.VkPhysicalDevice r9, @org.lwjgl.system.NativeType("uint32_t") int r10, @org.lwjgl.system.NativeType("uint32_t *") java.nio.IntBuffer r11, @org.lwjgl.system.NativeType("VkPerformanceCounterARM *") org.lwjgl.vulkan.VkPerformanceCounterARM.Buffer r12, @org.lwjgl.system.NativeType("VkPerformanceCounterDescriptionARM *") org.lwjgl.vulkan.VkPerformanceCounterDescriptionARM.Buffer r13) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L24
            r0 = r11
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
            r0 = r12
            r1 = r11
            r2 = r11
            int r2 = r2.position()
            int r1 = r1.get(r2)
            org.lwjgl.system.Checks.checkSafe(r0, r1)
            r0 = r13
            r1 = r11
            r2 = r11
            int r2 = r2.position()
            int r1 = r1.get(r2)
            org.lwjgl.system.Checks.checkSafe(r0, r1)
        L24:
            r0 = r9
            r1 = r10
            r2 = r11
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            r3 = r12
            long r3 = org.lwjgl.system.MemoryUtil.memAddressSafe(r3)
            r4 = r13
            long r4 = org.lwjgl.system.MemoryUtil.memAddressSafe(r4)
            int r0 = nvkEnumeratePhysicalDeviceQueueFamilyPerformanceCountersByRegionARM(r0, r1, r2, r3, r4)
            return r0
    }

    @org.lwjgl.system.NativeType("VkResult")
    public static int vkEnumeratePhysicalDeviceQueueFamilyPerformanceCountersByRegionARM(org.lwjgl.vulkan.VkPhysicalDevice r11, @org.lwjgl.system.NativeType("uint32_t") int r12, @org.lwjgl.system.NativeType("uint32_t *") int[] r13, @org.lwjgl.system.NativeType("VkPerformanceCounterARM *") org.lwjgl.vulkan.VkPerformanceCounterARM.Buffer r14, @org.lwjgl.system.NativeType("VkPerformanceCounterDescriptionARM *") org.lwjgl.vulkan.VkPerformanceCounterDescriptionARM.Buffer r15) {
            r0 = r11
            org.lwjgl.vulkan.VKCapabilitiesInstance r0 = r0.getCapabilities()
            long r0 = r0.vkEnumeratePhysicalDeviceQueueFamilyPerformanceCountersByRegionARM
            r16 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L29
            r0 = r16
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r13
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
            r0 = r14
            r1 = r13
            r2 = 0
            r1 = r1[r2]
            org.lwjgl.system.Checks.checkSafe(r0, r1)
            r0 = r15
            r1 = r13
            r2 = 0
            r1 = r1[r2]
            org.lwjgl.system.Checks.checkSafe(r0, r1)
        L29:
            r0 = r11
            long r0 = r0.address()
            r1 = r12
            r2 = r13
            r3 = r14
            long r3 = org.lwjgl.system.MemoryUtil.memAddressSafe(r3)
            r4 = r15
            long r4 = org.lwjgl.system.MemoryUtil.memAddressSafe(r4)
            r5 = r16
            int r0 = org.lwjgl.system.JNI.callPPPPI(r0, r1, r2, r3, r4, r5)
            return r0
    }
}
