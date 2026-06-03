package org.lwjgl.vulkan;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/KHRPerformanceQuery.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/KHRPerformanceQuery.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/KHRPerformanceQuery.class */
public class KHRPerformanceQuery {
    public static final int VK_KHR_PERFORMANCE_QUERY_SPEC_VERSION = 1;
    public static final java.lang.String VK_KHR_PERFORMANCE_QUERY_EXTENSION_NAME = "VK_KHR_performance_query";
    public static final int VK_QUERY_TYPE_PERFORMANCE_QUERY_KHR = 1000116000;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_PERFORMANCE_QUERY_FEATURES_KHR = 1000116000;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_PERFORMANCE_QUERY_PROPERTIES_KHR = 1000116001;
    public static final int VK_STRUCTURE_TYPE_QUERY_POOL_PERFORMANCE_CREATE_INFO_KHR = 1000116002;
    public static final int VK_STRUCTURE_TYPE_PERFORMANCE_QUERY_SUBMIT_INFO_KHR = 1000116003;
    public static final int VK_STRUCTURE_TYPE_ACQUIRE_PROFILING_LOCK_INFO_KHR = 1000116004;
    public static final int VK_STRUCTURE_TYPE_PERFORMANCE_COUNTER_KHR = 1000116005;
    public static final int VK_STRUCTURE_TYPE_PERFORMANCE_COUNTER_DESCRIPTION_KHR = 1000116006;
    public static final int VK_PERFORMANCE_COUNTER_UNIT_GENERIC_KHR = 0;
    public static final int VK_PERFORMANCE_COUNTER_UNIT_PERCENTAGE_KHR = 1;
    public static final int VK_PERFORMANCE_COUNTER_UNIT_NANOSECONDS_KHR = 2;
    public static final int VK_PERFORMANCE_COUNTER_UNIT_BYTES_KHR = 3;
    public static final int VK_PERFORMANCE_COUNTER_UNIT_BYTES_PER_SECOND_KHR = 4;
    public static final int VK_PERFORMANCE_COUNTER_UNIT_KELVIN_KHR = 5;
    public static final int VK_PERFORMANCE_COUNTER_UNIT_WATTS_KHR = 6;
    public static final int VK_PERFORMANCE_COUNTER_UNIT_VOLTS_KHR = 7;
    public static final int VK_PERFORMANCE_COUNTER_UNIT_AMPS_KHR = 8;
    public static final int VK_PERFORMANCE_COUNTER_UNIT_HERTZ_KHR = 9;
    public static final int VK_PERFORMANCE_COUNTER_UNIT_CYCLES_KHR = 10;
    public static final int VK_PERFORMANCE_COUNTER_SCOPE_COMMAND_BUFFER_KHR = 0;
    public static final int VK_PERFORMANCE_COUNTER_SCOPE_RENDER_PASS_KHR = 1;
    public static final int VK_PERFORMANCE_COUNTER_SCOPE_COMMAND_KHR = 2;
    public static final int VK_QUERY_SCOPE_COMMAND_BUFFER_KHR = 0;
    public static final int VK_QUERY_SCOPE_RENDER_PASS_KHR = 1;
    public static final int VK_QUERY_SCOPE_COMMAND_KHR = 2;
    public static final int VK_PERFORMANCE_COUNTER_STORAGE_INT32_KHR = 0;
    public static final int VK_PERFORMANCE_COUNTER_STORAGE_INT64_KHR = 1;
    public static final int VK_PERFORMANCE_COUNTER_STORAGE_UINT32_KHR = 2;
    public static final int VK_PERFORMANCE_COUNTER_STORAGE_UINT64_KHR = 3;
    public static final int VK_PERFORMANCE_COUNTER_STORAGE_FLOAT32_KHR = 4;
    public static final int VK_PERFORMANCE_COUNTER_STORAGE_FLOAT64_KHR = 5;
    public static final int VK_PERFORMANCE_COUNTER_DESCRIPTION_PERFORMANCE_IMPACTING_BIT_KHR = 1;
    public static final int VK_PERFORMANCE_COUNTER_DESCRIPTION_PERFORMANCE_IMPACTING_KHR = 1;
    public static final int VK_PERFORMANCE_COUNTER_DESCRIPTION_CONCURRENTLY_IMPACTED_BIT_KHR = 2;
    public static final int VK_PERFORMANCE_COUNTER_DESCRIPTION_CONCURRENTLY_IMPACTED_KHR = 2;

    protected KHRPerformanceQuery() {
            r3 = this;
            r0 = r3
            r0.<init>()
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r1 = r0
            r1.<init>()
            throw r0
    }

    public static int nvkEnumeratePhysicalDeviceQueueFamilyPerformanceQueryCountersKHR(org.lwjgl.vulkan.VkPhysicalDevice r12, int r13, long r14, long r16, long r18) {
            r0 = r12
            org.lwjgl.vulkan.VKCapabilitiesInstance r0 = r0.getCapabilities()
            long r0 = r0.vkEnumeratePhysicalDeviceQueueFamilyPerformanceQueryCountersKHR
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
    public static int vkEnumeratePhysicalDeviceQueueFamilyPerformanceQueryCountersKHR(org.lwjgl.vulkan.VkPhysicalDevice r9, @org.lwjgl.system.NativeType("uint32_t") int r10, @org.lwjgl.system.NativeType("uint32_t *") java.nio.IntBuffer r11, @javax.annotation.Nullable @org.lwjgl.system.NativeType("VkPerformanceCounterKHR *") org.lwjgl.vulkan.VkPerformanceCounterKHR.Buffer r12, @javax.annotation.Nullable @org.lwjgl.system.NativeType("VkPerformanceCounterDescriptionKHR *") org.lwjgl.vulkan.VkPerformanceCounterDescriptionKHR.Buffer r13) {
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
            int r0 = nvkEnumeratePhysicalDeviceQueueFamilyPerformanceQueryCountersKHR(r0, r1, r2, r3, r4)
            return r0
    }

    public static void nvkGetPhysicalDeviceQueueFamilyPerformanceQueryPassesKHR(org.lwjgl.vulkan.VkPhysicalDevice r9, long r10, long r12) {
            r0 = r9
            org.lwjgl.vulkan.VKCapabilitiesInstance r0 = r0.getCapabilities()
            long r0 = r0.vkGetPhysicalDeviceQueueFamilyPerformanceQueryPassesKHR
            r14 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L19
            r0 = r14
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r10
            org.lwjgl.vulkan.VkQueryPoolPerformanceCreateInfoKHR.validate(r0)
        L19:
            r0 = r9
            long r0 = r0.address()
            r1 = r10
            r2 = r12
            r3 = r14
            org.lwjgl.system.JNI.callPPPV(r0, r1, r2, r3)
            return
    }

    public static void vkGetPhysicalDeviceQueueFamilyPerformanceQueryPassesKHR(org.lwjgl.vulkan.VkPhysicalDevice r6, @org.lwjgl.system.NativeType("VkQueryPoolPerformanceCreateInfoKHR const *") org.lwjgl.vulkan.VkQueryPoolPerformanceCreateInfoKHR r7, @org.lwjgl.system.NativeType("uint32_t *") java.nio.IntBuffer r8) {
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
            nvkGetPhysicalDeviceQueueFamilyPerformanceQueryPassesKHR(r0, r1, r2)
            return
    }

    public static int nvkAcquireProfilingLockKHR(org.lwjgl.vulkan.VkDevice r7, long r8) {
            r0 = r7
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkAcquireProfilingLockKHR
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
    public static int vkAcquireProfilingLockKHR(org.lwjgl.vulkan.VkDevice r4, @org.lwjgl.system.NativeType("VkAcquireProfilingLockInfoKHR const *") org.lwjgl.vulkan.VkAcquireProfilingLockInfoKHR r5) {
            r0 = r4
            r1 = r5
            long r1 = r1.address()
            int r0 = nvkAcquireProfilingLockKHR(r0, r1)
            return r0
    }

    public static void vkReleaseProfilingLockKHR(org.lwjgl.vulkan.VkDevice r5) {
            r0 = r5
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkReleaseProfilingLockKHR
            r6 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L13
            r0 = r6
            long r0 = org.lwjgl.system.Checks.check(r0)
        L13:
            r0 = r5
            long r0 = r0.address()
            r1 = r6
            org.lwjgl.system.JNI.callPV(r0, r1)
            return
    }

    @org.lwjgl.system.NativeType("VkResult")
    public static int vkEnumeratePhysicalDeviceQueueFamilyPerformanceQueryCountersKHR(org.lwjgl.vulkan.VkPhysicalDevice r11, @org.lwjgl.system.NativeType("uint32_t") int r12, @org.lwjgl.system.NativeType("uint32_t *") int[] r13, @javax.annotation.Nullable @org.lwjgl.system.NativeType("VkPerformanceCounterKHR *") org.lwjgl.vulkan.VkPerformanceCounterKHR.Buffer r14, @javax.annotation.Nullable @org.lwjgl.system.NativeType("VkPerformanceCounterDescriptionKHR *") org.lwjgl.vulkan.VkPerformanceCounterDescriptionKHR.Buffer r15) {
            r0 = r11
            org.lwjgl.vulkan.VKCapabilitiesInstance r0 = r0.getCapabilities()
            long r0 = r0.vkEnumeratePhysicalDeviceQueueFamilyPerformanceQueryCountersKHR
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

    public static void vkGetPhysicalDeviceQueueFamilyPerformanceQueryPassesKHR(org.lwjgl.vulkan.VkPhysicalDevice r8, @org.lwjgl.system.NativeType("VkQueryPoolPerformanceCreateInfoKHR const *") org.lwjgl.vulkan.VkQueryPoolPerformanceCreateInfoKHR r9, @org.lwjgl.system.NativeType("uint32_t *") int[] r10) {
            r0 = r8
            org.lwjgl.vulkan.VKCapabilitiesInstance r0 = r0.getCapabilities()
            long r0 = r0.vkGetPhysicalDeviceQueueFamilyPerformanceQueryPassesKHR
            r11 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L1f
            r0 = r11
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r10
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
            r0 = r9
            long r0 = r0.address()
            org.lwjgl.vulkan.VkQueryPoolPerformanceCreateInfoKHR.validate(r0)
        L1f:
            r0 = r8
            long r0 = r0.address()
            r1 = r9
            long r1 = r1.address()
            r2 = r10
            r3 = r11
            org.lwjgl.system.JNI.callPPPV(r0, r1, r2, r3)
            return
    }
}
