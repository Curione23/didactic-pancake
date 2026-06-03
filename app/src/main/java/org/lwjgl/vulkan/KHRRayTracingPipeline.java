package org.lwjgl.vulkan;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/KHRRayTracingPipeline.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/KHRRayTracingPipeline.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/KHRRayTracingPipeline.class */
public class KHRRayTracingPipeline {
    public static final int VK_KHR_RAY_TRACING_PIPELINE_SPEC_VERSION = 1;
    public static final java.lang.String VK_KHR_RAY_TRACING_PIPELINE_EXTENSION_NAME = "VK_KHR_ray_tracing_pipeline";
    public static final int VK_SHADER_UNUSED_KHR = -1;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_RAY_TRACING_PIPELINE_FEATURES_KHR = 1000347000;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_RAY_TRACING_PIPELINE_PROPERTIES_KHR = 1000347001;
    public static final int VK_STRUCTURE_TYPE_RAY_TRACING_PIPELINE_CREATE_INFO_KHR = 1000150015;
    public static final int VK_STRUCTURE_TYPE_RAY_TRACING_SHADER_GROUP_CREATE_INFO_KHR = 1000150016;
    public static final int VK_STRUCTURE_TYPE_RAY_TRACING_PIPELINE_INTERFACE_CREATE_INFO_KHR = 1000150018;
    public static final int VK_SHADER_STAGE_RAYGEN_BIT_KHR = 256;
    public static final int VK_SHADER_STAGE_ANY_HIT_BIT_KHR = 512;
    public static final int VK_SHADER_STAGE_CLOSEST_HIT_BIT_KHR = 1024;
    public static final int VK_SHADER_STAGE_MISS_BIT_KHR = 2048;
    public static final int VK_SHADER_STAGE_INTERSECTION_BIT_KHR = 4096;
    public static final int VK_SHADER_STAGE_CALLABLE_BIT_KHR = 8192;
    public static final int VK_PIPELINE_STAGE_RAY_TRACING_SHADER_BIT_KHR = 2097152;
    public static final int VK_BUFFER_USAGE_SHADER_BINDING_TABLE_BIT_KHR = 1024;
    public static final int VK_PIPELINE_BIND_POINT_RAY_TRACING_KHR = 1000165000;
    public static final int VK_PIPELINE_CREATE_RAY_TRACING_NO_NULL_ANY_HIT_SHADERS_BIT_KHR = 16384;
    public static final int VK_PIPELINE_CREATE_RAY_TRACING_NO_NULL_CLOSEST_HIT_SHADERS_BIT_KHR = 32768;
    public static final int VK_PIPELINE_CREATE_RAY_TRACING_NO_NULL_MISS_SHADERS_BIT_KHR = 65536;
    public static final int VK_PIPELINE_CREATE_RAY_TRACING_NO_NULL_INTERSECTION_SHADERS_BIT_KHR = 131072;
    public static final int VK_PIPELINE_CREATE_RAY_TRACING_SKIP_TRIANGLES_BIT_KHR = 4096;
    public static final int VK_PIPELINE_CREATE_RAY_TRACING_SKIP_AABBS_BIT_KHR = 8192;
    public static final int VK_PIPELINE_CREATE_RAY_TRACING_SHADER_GROUP_HANDLE_CAPTURE_REPLAY_BIT_KHR = 524288;
    public static final int VK_DYNAMIC_STATE_RAY_TRACING_PIPELINE_STACK_SIZE_KHR = 1000347000;
    public static final int VK_RAY_TRACING_SHADER_GROUP_TYPE_GENERAL_KHR = 0;
    public static final int VK_RAY_TRACING_SHADER_GROUP_TYPE_TRIANGLES_HIT_GROUP_KHR = 1;
    public static final int VK_RAY_TRACING_SHADER_GROUP_TYPE_PROCEDURAL_HIT_GROUP_KHR = 2;
    public static final int VK_SHADER_GROUP_SHADER_GENERAL_KHR = 0;
    public static final int VK_SHADER_GROUP_SHADER_CLOSEST_HIT_KHR = 1;
    public static final int VK_SHADER_GROUP_SHADER_ANY_HIT_KHR = 2;
    public static final int VK_SHADER_GROUP_SHADER_INTERSECTION_KHR = 3;

    protected KHRRayTracingPipeline() {
            r3 = this;
            r0 = r3
            r0.<init>()
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r1 = r0
            r1.<init>()
            throw r0
    }

    public static void nvkCmdTraceRaysKHR(org.lwjgl.vulkan.VkCommandBuffer r16, long r17, long r19, long r21, long r23, int r25, int r26, int r27) {
            r0 = r16
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkCmdTraceRaysKHR
            r28 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L15
            r0 = r28
            long r0 = org.lwjgl.system.Checks.check(r0)
        L15:
            r0 = r16
            long r0 = r0.address()
            r1 = r17
            r2 = r19
            r3 = r21
            r4 = r23
            r5 = r25
            r6 = r26
            r7 = r27
            r8 = r28
            org.lwjgl.system.JNI.callPPPPPV(r0, r1, r2, r3, r4, r5, r6, r7, r8)
            return
    }

    public static void vkCmdTraceRaysKHR(org.lwjgl.vulkan.VkCommandBuffer r13, @org.lwjgl.system.NativeType("VkStridedDeviceAddressRegionKHR const *") org.lwjgl.vulkan.VkStridedDeviceAddressRegionKHR r14, @org.lwjgl.system.NativeType("VkStridedDeviceAddressRegionKHR const *") org.lwjgl.vulkan.VkStridedDeviceAddressRegionKHR r15, @org.lwjgl.system.NativeType("VkStridedDeviceAddressRegionKHR const *") org.lwjgl.vulkan.VkStridedDeviceAddressRegionKHR r16, @org.lwjgl.system.NativeType("VkStridedDeviceAddressRegionKHR const *") org.lwjgl.vulkan.VkStridedDeviceAddressRegionKHR r17, @org.lwjgl.system.NativeType("uint32_t") int r18, @org.lwjgl.system.NativeType("uint32_t") int r19, @org.lwjgl.system.NativeType("uint32_t") int r20) {
            r0 = r13
            r1 = r14
            long r1 = r1.address()
            r2 = r15
            long r2 = r2.address()
            r3 = r16
            long r3 = r3.address()
            r4 = r17
            long r4 = r4.address()
            r5 = r18
            r6 = r19
            r7 = r20
            nvkCmdTraceRaysKHR(r0, r1, r2, r3, r4, r5, r6, r7)
            return
    }

    public static int nvkCreateRayTracingPipelinesKHR(org.lwjgl.vulkan.VkDevice r16, long r17, long r19, int r21, long r22, long r24, long r26) {
            r0 = r16
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkCreateRayTracingPipelinesKHR
            r28 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L24
            r0 = r28
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r22
            r1 = r21
            int r2 = org.lwjgl.vulkan.VkRayTracingPipelineCreateInfoKHR.SIZEOF
            int r3 = org.lwjgl.vulkan.VkRayTracingPipelineCreateInfoKHR::validate
            org.lwjgl.system.Struct.validate(r0, r1, r2, r3)
        L24:
            r0 = r16
            long r0 = r0.address()
            r1 = r17
            r2 = r19
            r3 = r21
            r4 = r22
            r5 = r24
            r6 = r26
            r7 = r28
            int r0 = org.lwjgl.system.JNI.callPJJPPPI(r0, r1, r2, r3, r4, r5, r6, r7)
            return r0
    }

    @org.lwjgl.system.NativeType("VkResult")
    public static int vkCreateRayTracingPipelinesKHR(org.lwjgl.vulkan.VkDevice r13, @org.lwjgl.system.NativeType("VkDeferredOperationKHR") long r14, @org.lwjgl.system.NativeType("VkPipelineCache") long r16, @org.lwjgl.system.NativeType("VkRayTracingPipelineCreateInfoKHR const *") org.lwjgl.vulkan.VkRayTracingPipelineCreateInfoKHR.Buffer r18, @javax.annotation.Nullable @org.lwjgl.system.NativeType("VkAllocationCallbacks const *") org.lwjgl.vulkan.VkAllocationCallbacks r19, @org.lwjgl.system.NativeType("VkPipeline *") java.nio.LongBuffer r20) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L10
            r0 = r20
            r1 = r18
            int r1 = r1.remaining()
            org.lwjgl.system.Checks.check(r0, r1)
        L10:
            r0 = r13
            r1 = r14
            r2 = r16
            r3 = r18
            int r3 = r3.remaining()
            r4 = r18
            long r4 = r4.address()
            r5 = r19
            long r5 = org.lwjgl.system.MemoryUtil.memAddressSafe(r5)
            r6 = r20
            long r6 = org.lwjgl.system.MemoryUtil.memAddress(r6)
            int r0 = nvkCreateRayTracingPipelinesKHR(r0, r1, r2, r3, r4, r5, r6)
            return r0
    }

    public static int nvkGetRayTracingShaderGroupHandlesKHR(org.lwjgl.vulkan.VkDevice r13, long r14, int r16, int r17, long r18, long r20) {
            r0 = r13
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkGetRayTracingShaderGroupHandlesKHR
            r22 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L15
            r0 = r22
            long r0 = org.lwjgl.system.Checks.check(r0)
        L15:
            r0 = r13
            long r0 = r0.address()
            r1 = r14
            r2 = r16
            r3 = r17
            r4 = r18
            r5 = r20
            r6 = r22
            int r0 = org.lwjgl.system.JNI.callPJPPI(r0, r1, r2, r3, r4, r5, r6)
            return r0
    }

    @org.lwjgl.system.NativeType("VkResult")
    public static int vkGetRayTracingShaderGroupHandlesKHR(org.lwjgl.vulkan.VkDevice r10, @org.lwjgl.system.NativeType("VkPipeline") long r11, @org.lwjgl.system.NativeType("uint32_t") int r13, @org.lwjgl.system.NativeType("uint32_t") int r14, @org.lwjgl.system.NativeType("void *") java.nio.ByteBuffer r15) {
            r0 = r10
            r1 = r11
            r2 = r13
            r3 = r14
            r4 = r15
            int r4 = r4.remaining()
            long r4 = (long) r4
            r5 = r15
            long r5 = org.lwjgl.system.MemoryUtil.memAddress(r5)
            int r0 = nvkGetRayTracingShaderGroupHandlesKHR(r0, r1, r2, r3, r4, r5)
            return r0
    }

    public static int nvkGetRayTracingCaptureReplayShaderGroupHandlesKHR(org.lwjgl.vulkan.VkDevice r13, long r14, int r16, int r17, long r18, long r20) {
            r0 = r13
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkGetRayTracingCaptureReplayShaderGroupHandlesKHR
            r22 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L15
            r0 = r22
            long r0 = org.lwjgl.system.Checks.check(r0)
        L15:
            r0 = r13
            long r0 = r0.address()
            r1 = r14
            r2 = r16
            r3 = r17
            r4 = r18
            r5 = r20
            r6 = r22
            int r0 = org.lwjgl.system.JNI.callPJPPI(r0, r1, r2, r3, r4, r5, r6)
            return r0
    }

    @org.lwjgl.system.NativeType("VkResult")
    public static int vkGetRayTracingCaptureReplayShaderGroupHandlesKHR(org.lwjgl.vulkan.VkDevice r10, @org.lwjgl.system.NativeType("VkPipeline") long r11, @org.lwjgl.system.NativeType("uint32_t") int r13, @org.lwjgl.system.NativeType("uint32_t") int r14, @org.lwjgl.system.NativeType("void *") java.nio.ByteBuffer r15) {
            r0 = r10
            r1 = r11
            r2 = r13
            r3 = r14
            r4 = r15
            int r4 = r4.remaining()
            long r4 = (long) r4
            r5 = r15
            long r5 = org.lwjgl.system.MemoryUtil.memAddress(r5)
            int r0 = nvkGetRayTracingCaptureReplayShaderGroupHandlesKHR(r0, r1, r2, r3, r4, r5)
            return r0
    }

    public static void nvkCmdTraceRaysIndirectKHR(org.lwjgl.vulkan.VkCommandBuffer r15, long r16, long r18, long r20, long r22, long r24) {
            r0 = r15
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkCmdTraceRaysIndirectKHR
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
            org.lwjgl.system.JNI.callPPPPPJV(r0, r1, r2, r3, r4, r5, r6)
            return
    }

    public static void vkCmdTraceRaysIndirectKHR(org.lwjgl.vulkan.VkCommandBuffer r12, @org.lwjgl.system.NativeType("VkStridedDeviceAddressRegionKHR const *") org.lwjgl.vulkan.VkStridedDeviceAddressRegionKHR r13, @org.lwjgl.system.NativeType("VkStridedDeviceAddressRegionKHR const *") org.lwjgl.vulkan.VkStridedDeviceAddressRegionKHR r14, @org.lwjgl.system.NativeType("VkStridedDeviceAddressRegionKHR const *") org.lwjgl.vulkan.VkStridedDeviceAddressRegionKHR r15, @org.lwjgl.system.NativeType("VkStridedDeviceAddressRegionKHR const *") org.lwjgl.vulkan.VkStridedDeviceAddressRegionKHR r16, @org.lwjgl.system.NativeType("VkDeviceAddress") long r17) {
            r0 = r12
            r1 = r13
            long r1 = r1.address()
            r2 = r14
            long r2 = r2.address()
            r3 = r15
            long r3 = r3.address()
            r4 = r16
            long r4 = r4.address()
            r5 = r17
            nvkCmdTraceRaysIndirectKHR(r0, r1, r2, r3, r4, r5)
            return
    }

    @org.lwjgl.system.NativeType("VkDeviceSize")
    public static long vkGetRayTracingShaderGroupStackSizeKHR(org.lwjgl.vulkan.VkDevice r9, @org.lwjgl.system.NativeType("VkPipeline") long r10, @org.lwjgl.system.NativeType("uint32_t") int r12, @org.lwjgl.system.NativeType("VkShaderGroupShaderKHR") int r13) {
            r0 = r9
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkGetRayTracingShaderGroupStackSizeKHR
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
            r3 = r13
            r4 = r14
            long r0 = org.lwjgl.system.JNI.callPJJ(r0, r1, r2, r3, r4)
            return r0
    }

    public static void vkCmdSetRayTracingPipelineStackSizeKHR(org.lwjgl.vulkan.VkCommandBuffer r6, @org.lwjgl.system.NativeType("uint32_t") int r7) {
            r0 = r6
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkCmdSetRayTracingPipelineStackSizeKHR
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

    @org.lwjgl.system.NativeType("VkResult")
    public static int vkCreateRayTracingPipelinesKHR(org.lwjgl.vulkan.VkDevice r15, @org.lwjgl.system.NativeType("VkDeferredOperationKHR") long r16, @org.lwjgl.system.NativeType("VkPipelineCache") long r18, @org.lwjgl.system.NativeType("VkRayTracingPipelineCreateInfoKHR const *") org.lwjgl.vulkan.VkRayTracingPipelineCreateInfoKHR.Buffer r20, @javax.annotation.Nullable @org.lwjgl.system.NativeType("VkAllocationCallbacks const *") org.lwjgl.vulkan.VkAllocationCallbacks r21, @org.lwjgl.system.NativeType("VkPipeline *") long[] r22) {
            r0 = r15
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkCreateRayTracingPipelinesKHR
            r23 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L34
            r0 = r23
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r22
            r1 = r20
            int r1 = r1.remaining()
            org.lwjgl.system.Checks.check(r0, r1)
            r0 = r20
            long r0 = r0.address()
            r1 = r20
            int r1 = r1.remaining()
            int r2 = org.lwjgl.vulkan.VkRayTracingPipelineCreateInfoKHR.SIZEOF
            int r3 = org.lwjgl.vulkan.VkRayTracingPipelineCreateInfoKHR::validate
            org.lwjgl.system.Struct.validate(r0, r1, r2, r3)
        L34:
            r0 = r15
            long r0 = r0.address()
            r1 = r16
            r2 = r18
            r3 = r20
            int r3 = r3.remaining()
            r4 = r20
            long r4 = r4.address()
            r5 = r21
            long r5 = org.lwjgl.system.MemoryUtil.memAddressSafe(r5)
            r6 = r22
            r7 = r23
            int r0 = org.lwjgl.system.JNI.callPJJPPPI(r0, r1, r2, r3, r4, r5, r6, r7)
            return r0
    }
}
