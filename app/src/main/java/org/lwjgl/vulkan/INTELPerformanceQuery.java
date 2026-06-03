package org.lwjgl.vulkan;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/INTELPerformanceQuery.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/INTELPerformanceQuery.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/INTELPerformanceQuery.class */
public class INTELPerformanceQuery {
    public static final int VK_INTEL_PERFORMANCE_QUERY_SPEC_VERSION = 2;
    public static final java.lang.String VK_INTEL_PERFORMANCE_QUERY_EXTENSION_NAME = "VK_INTEL_performance_query";
    public static final int VK_STRUCTURE_TYPE_QUERY_POOL_PERFORMANCE_QUERY_CREATE_INFO_INTEL = 1000210000;
    public static final int VK_STRUCTURE_TYPE_QUERY_POOL_CREATE_INFO_INTEL = 1000210000;
    public static final int VK_STRUCTURE_TYPE_INITIALIZE_PERFORMANCE_API_INFO_INTEL = 1000210001;
    public static final int VK_STRUCTURE_TYPE_PERFORMANCE_MARKER_INFO_INTEL = 1000210002;
    public static final int VK_STRUCTURE_TYPE_PERFORMANCE_STREAM_MARKER_INFO_INTEL = 1000210003;
    public static final int VK_STRUCTURE_TYPE_PERFORMANCE_OVERRIDE_INFO_INTEL = 1000210004;
    public static final int VK_STRUCTURE_TYPE_PERFORMANCE_CONFIGURATION_ACQUIRE_INFO_INTEL = 1000210005;
    public static final int VK_QUERY_TYPE_PERFORMANCE_QUERY_INTEL = 1000210000;
    public static final int VK_OBJECT_TYPE_PERFORMANCE_CONFIGURATION_INTEL = 1000210000;
    public static final int VK_PERFORMANCE_CONFIGURATION_TYPE_COMMAND_QUEUE_METRICS_DISCOVERY_ACTIVATED_INTEL = 0;
    public static final int VK_QUERY_POOL_SAMPLING_MODE_MANUAL_INTEL = 0;
    public static final int VK_PERFORMANCE_OVERRIDE_TYPE_NULL_HARDWARE_INTEL = 0;
    public static final int VK_PERFORMANCE_OVERRIDE_TYPE_FLUSH_GPU_CACHES_INTEL = 1;
    public static final int VK_PERFORMANCE_PARAMETER_TYPE_HW_COUNTERS_SUPPORTED_INTEL = 0;
    public static final int VK_PERFORMANCE_PARAMETER_TYPE_STREAM_MARKER_VALID_BITS_INTEL = 1;
    public static final int VK_PERFORMANCE_VALUE_TYPE_UINT32_INTEL = 0;
    public static final int VK_PERFORMANCE_VALUE_TYPE_UINT64_INTEL = 1;
    public static final int VK_PERFORMANCE_VALUE_TYPE_FLOAT_INTEL = 2;
    public static final int VK_PERFORMANCE_VALUE_TYPE_BOOL_INTEL = 3;
    public static final int VK_PERFORMANCE_VALUE_TYPE_STRING_INTEL = 4;

    protected INTELPerformanceQuery() {
            r3 = this;
            r0 = r3
            r0.<init>()
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r1 = r0
            r1.<init>()
            throw r0
    }

    public static int nvkInitializePerformanceApiINTEL(org.lwjgl.vulkan.VkDevice r7, long r8) {
            r0 = r7
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkInitializePerformanceApiINTEL
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
    public static int vkInitializePerformanceApiINTEL(org.lwjgl.vulkan.VkDevice r4, @org.lwjgl.system.NativeType("VkInitializePerformanceApiInfoINTEL const *") org.lwjgl.vulkan.VkInitializePerformanceApiInfoINTEL r5) {
            r0 = r4
            r1 = r5
            long r1 = r1.address()
            int r0 = nvkInitializePerformanceApiINTEL(r0, r1)
            return r0
    }

    public static void vkUninitializePerformanceApiINTEL(org.lwjgl.vulkan.VkDevice r5) {
            r0 = r5
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkUninitializePerformanceApiINTEL
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

    public static int nvkCmdSetPerformanceMarkerINTEL(org.lwjgl.vulkan.VkCommandBuffer r7, long r8) {
            r0 = r7
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkCmdSetPerformanceMarkerINTEL
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
    public static int vkCmdSetPerformanceMarkerINTEL(org.lwjgl.vulkan.VkCommandBuffer r4, @org.lwjgl.system.NativeType("VkPerformanceMarkerInfoINTEL const *") org.lwjgl.vulkan.VkPerformanceMarkerInfoINTEL r5) {
            r0 = r4
            r1 = r5
            long r1 = r1.address()
            int r0 = nvkCmdSetPerformanceMarkerINTEL(r0, r1)
            return r0
    }

    public static int nvkCmdSetPerformanceStreamMarkerINTEL(org.lwjgl.vulkan.VkCommandBuffer r7, long r8) {
            r0 = r7
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkCmdSetPerformanceStreamMarkerINTEL
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
    public static int vkCmdSetPerformanceStreamMarkerINTEL(org.lwjgl.vulkan.VkCommandBuffer r4, @org.lwjgl.system.NativeType("VkPerformanceStreamMarkerInfoINTEL const *") org.lwjgl.vulkan.VkPerformanceStreamMarkerInfoINTEL r5) {
            r0 = r4
            r1 = r5
            long r1 = r1.address()
            int r0 = nvkCmdSetPerformanceStreamMarkerINTEL(r0, r1)
            return r0
    }

    public static int nvkCmdSetPerformanceOverrideINTEL(org.lwjgl.vulkan.VkCommandBuffer r7, long r8) {
            r0 = r7
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkCmdSetPerformanceOverrideINTEL
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
    public static int vkCmdSetPerformanceOverrideINTEL(org.lwjgl.vulkan.VkCommandBuffer r4, @org.lwjgl.system.NativeType("VkPerformanceOverrideInfoINTEL const *") org.lwjgl.vulkan.VkPerformanceOverrideInfoINTEL r5) {
            r0 = r4
            r1 = r5
            long r1 = r1.address()
            int r0 = nvkCmdSetPerformanceOverrideINTEL(r0, r1)
            return r0
    }

    public static int nvkAcquirePerformanceConfigurationINTEL(org.lwjgl.vulkan.VkDevice r9, long r10, long r12) {
            r0 = r9
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkAcquirePerformanceConfigurationINTEL
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
    public static int vkAcquirePerformanceConfigurationINTEL(org.lwjgl.vulkan.VkDevice r6, @org.lwjgl.system.NativeType("VkPerformanceConfigurationAcquireInfoINTEL const *") org.lwjgl.vulkan.VkPerformanceConfigurationAcquireInfoINTEL r7, @org.lwjgl.system.NativeType("VkPerformanceConfigurationINTEL *") java.nio.LongBuffer r8) {
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
            int r0 = nvkAcquirePerformanceConfigurationINTEL(r0, r1, r2)
            return r0
    }

    @org.lwjgl.system.NativeType("VkResult")
    public static int vkReleasePerformanceConfigurationINTEL(org.lwjgl.vulkan.VkDevice r7, @org.lwjgl.system.NativeType("VkPerformanceConfigurationINTEL") long r8) {
            r0 = r7
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkReleasePerformanceConfigurationINTEL
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
            int r0 = org.lwjgl.system.JNI.callPJI(r0, r1, r2)
            return r0
    }

    @org.lwjgl.system.NativeType("VkResult")
    public static int vkQueueSetPerformanceConfigurationINTEL(org.lwjgl.vulkan.VkQueue r7, @org.lwjgl.system.NativeType("VkPerformanceConfigurationINTEL") long r8) {
            r0 = r7
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkQueueSetPerformanceConfigurationINTEL
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
            int r0 = org.lwjgl.system.JNI.callPJI(r0, r1, r2)
            return r0
    }

    public static int nvkGetPerformanceParameterINTEL(org.lwjgl.vulkan.VkDevice r8, int r9, long r10) {
            r0 = r8
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkGetPerformanceParameterINTEL
            r12 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L15
            r0 = r12
            long r0 = org.lwjgl.system.Checks.check(r0)
        L15:
            r0 = r8
            long r0 = r0.address()
            r1 = r9
            r2 = r10
            r3 = r12
            int r0 = org.lwjgl.system.JNI.callPPI(r0, r1, r2, r3)
            return r0
    }

    @org.lwjgl.system.NativeType("VkResult")
    public static int vkGetPerformanceParameterINTEL(org.lwjgl.vulkan.VkDevice r5, @org.lwjgl.system.NativeType("VkPerformanceParameterTypeINTEL") int r6, @org.lwjgl.system.NativeType("VkPerformanceValueINTEL *") org.lwjgl.vulkan.VkPerformanceValueINTEL r7) {
            r0 = r5
            r1 = r6
            r2 = r7
            long r2 = r2.address()
            int r0 = nvkGetPerformanceParameterINTEL(r0, r1, r2)
            return r0
    }

    @org.lwjgl.system.NativeType("VkResult")
    public static int vkAcquirePerformanceConfigurationINTEL(org.lwjgl.vulkan.VkDevice r8, @org.lwjgl.system.NativeType("VkPerformanceConfigurationAcquireInfoINTEL const *") org.lwjgl.vulkan.VkPerformanceConfigurationAcquireInfoINTEL r9, @org.lwjgl.system.NativeType("VkPerformanceConfigurationINTEL *") long[] r10) {
            r0 = r8
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkAcquirePerformanceConfigurationINTEL
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
