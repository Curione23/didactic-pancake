package org.lwjgl.vulkan;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/NVRayTracing.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/NVRayTracing.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/NVRayTracing.class */
public class NVRayTracing {
    public static final int VK_NV_RAY_TRACING_SPEC_VERSION = 3;
    public static final java.lang.String VK_NV_RAY_TRACING_EXTENSION_NAME = "VK_NV_ray_tracing";
    public static final int VK_SHADER_UNUSED_NV = -1;
    public static final int VK_STRUCTURE_TYPE_RAY_TRACING_PIPELINE_CREATE_INFO_NV = 1000165000;
    public static final int VK_STRUCTURE_TYPE_ACCELERATION_STRUCTURE_CREATE_INFO_NV = 1000165001;
    public static final int VK_STRUCTURE_TYPE_GEOMETRY_NV = 1000165003;
    public static final int VK_STRUCTURE_TYPE_GEOMETRY_TRIANGLES_NV = 1000165004;
    public static final int VK_STRUCTURE_TYPE_GEOMETRY_AABB_NV = 1000165005;
    public static final int VK_STRUCTURE_TYPE_BIND_ACCELERATION_STRUCTURE_MEMORY_INFO_NV = 1000165006;
    public static final int VK_STRUCTURE_TYPE_WRITE_DESCRIPTOR_SET_ACCELERATION_STRUCTURE_NV = 1000165007;
    public static final int VK_STRUCTURE_TYPE_ACCELERATION_STRUCTURE_MEMORY_REQUIREMENTS_INFO_NV = 1000165008;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_RAY_TRACING_PROPERTIES_NV = 1000165009;
    public static final int VK_STRUCTURE_TYPE_RAY_TRACING_SHADER_GROUP_CREATE_INFO_NV = 1000165011;
    public static final int VK_STRUCTURE_TYPE_ACCELERATION_STRUCTURE_INFO_NV = 1000165012;
    public static final int VK_SHADER_STAGE_RAYGEN_BIT_NV = 256;
    public static final int VK_SHADER_STAGE_ANY_HIT_BIT_NV = 512;
    public static final int VK_SHADER_STAGE_CLOSEST_HIT_BIT_NV = 1024;
    public static final int VK_SHADER_STAGE_MISS_BIT_NV = 2048;
    public static final int VK_SHADER_STAGE_INTERSECTION_BIT_NV = 4096;
    public static final int VK_SHADER_STAGE_CALLABLE_BIT_NV = 8192;
    public static final int VK_PIPELINE_STAGE_RAY_TRACING_SHADER_BIT_NV = 2097152;
    public static final int VK_PIPELINE_STAGE_ACCELERATION_STRUCTURE_BUILD_BIT_NV = 33554432;
    public static final int VK_BUFFER_USAGE_RAY_TRACING_BIT_NV = 1024;
    public static final int VK_PIPELINE_BIND_POINT_RAY_TRACING_NV = 1000165000;
    public static final int VK_DESCRIPTOR_TYPE_ACCELERATION_STRUCTURE_NV = 1000165000;
    public static final int VK_ACCESS_ACCELERATION_STRUCTURE_READ_BIT_NV = 2097152;
    public static final int VK_ACCESS_ACCELERATION_STRUCTURE_WRITE_BIT_NV = 4194304;
    public static final int VK_QUERY_TYPE_ACCELERATION_STRUCTURE_COMPACTED_SIZE_NV = 1000165000;
    public static final int VK_PIPELINE_CREATE_DEFER_COMPILE_BIT_NV = 32;
    public static final int VK_OBJECT_TYPE_ACCELERATION_STRUCTURE_NV = 1000165000;
    public static final int VK_INDEX_TYPE_NONE_NV = 1000165000;
    public static final int VK_RAY_TRACING_SHADER_GROUP_TYPE_GENERAL_NV = 0;
    public static final int VK_RAY_TRACING_SHADER_GROUP_TYPE_TRIANGLES_HIT_GROUP_NV = 1;
    public static final int VK_RAY_TRACING_SHADER_GROUP_TYPE_PROCEDURAL_HIT_GROUP_NV = 2;
    public static final int VK_GEOMETRY_TYPE_TRIANGLES_NV = 0;
    public static final int VK_GEOMETRY_TYPE_AABBS_NV = 1;
    public static final int VK_ACCELERATION_STRUCTURE_TYPE_TOP_LEVEL_NV = 0;
    public static final int VK_ACCELERATION_STRUCTURE_TYPE_BOTTOM_LEVEL_NV = 1;
    public static final int VK_GEOMETRY_OPAQUE_BIT_NV = 1;
    public static final int VK_GEOMETRY_NO_DUPLICATE_ANY_HIT_INVOCATION_BIT_NV = 2;
    public static final int VK_GEOMETRY_INSTANCE_TRIANGLE_CULL_DISABLE_BIT_NV = 1;
    public static final int VK_GEOMETRY_INSTANCE_TRIANGLE_FRONT_COUNTERCLOCKWISE_BIT_NV = 2;
    public static final int VK_GEOMETRY_INSTANCE_FORCE_OPAQUE_BIT_NV = 4;
    public static final int VK_GEOMETRY_INSTANCE_FORCE_NO_OPAQUE_BIT_NV = 8;
    public static final int VK_BUILD_ACCELERATION_STRUCTURE_ALLOW_UPDATE_BIT_NV = 1;
    public static final int VK_BUILD_ACCELERATION_STRUCTURE_ALLOW_COMPACTION_BIT_NV = 2;
    public static final int VK_BUILD_ACCELERATION_STRUCTURE_PREFER_FAST_TRACE_BIT_NV = 4;
    public static final int VK_BUILD_ACCELERATION_STRUCTURE_PREFER_FAST_BUILD_BIT_NV = 8;
    public static final int VK_BUILD_ACCELERATION_STRUCTURE_LOW_MEMORY_BIT_NV = 16;
    public static final int VK_COPY_ACCELERATION_STRUCTURE_MODE_CLONE_NV = 0;
    public static final int VK_COPY_ACCELERATION_STRUCTURE_MODE_COMPACT_NV = 1;
    public static final int VK_DEBUG_REPORT_OBJECT_TYPE_ACCELERATION_STRUCTURE_NV_EXT = 1000165000;
    public static final int VK_ACCELERATION_STRUCTURE_MEMORY_REQUIREMENTS_TYPE_OBJECT_NV = 0;
    public static final int VK_ACCELERATION_STRUCTURE_MEMORY_REQUIREMENTS_TYPE_BUILD_SCRATCH_NV = 1;
    public static final int VK_ACCELERATION_STRUCTURE_MEMORY_REQUIREMENTS_TYPE_UPDATE_SCRATCH_NV = 2;

    protected NVRayTracing() {
            r3 = this;
            r0 = r3
            r0.<init>()
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r1 = r0
            r1.<init>()
            throw r0
    }

    public static int nvkCreateAccelerationStructureNV(org.lwjgl.vulkan.VkDevice r11, long r12, long r14, long r16) {
            r0 = r11
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkCreateAccelerationStructureNV
            r18 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L19
            r0 = r18
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r12
            org.lwjgl.vulkan.VkAccelerationStructureCreateInfoNV.validate(r0)
        L19:
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
    public static int vkCreateAccelerationStructureNV(org.lwjgl.vulkan.VkDevice r8, @org.lwjgl.system.NativeType("VkAccelerationStructureCreateInfoNV const *") org.lwjgl.vulkan.VkAccelerationStructureCreateInfoNV r9, @javax.annotation.Nullable @org.lwjgl.system.NativeType("VkAllocationCallbacks const *") org.lwjgl.vulkan.VkAllocationCallbacks r10, @org.lwjgl.system.NativeType("VkAccelerationStructureNV *") java.nio.LongBuffer r11) {
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
            int r0 = nvkCreateAccelerationStructureNV(r0, r1, r2, r3)
            return r0
    }

    public static void nvkDestroyAccelerationStructureNV(org.lwjgl.vulkan.VkDevice r9, long r10, long r12) {
            r0 = r9
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkDestroyAccelerationStructureNV
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

    public static void vkDestroyAccelerationStructureNV(org.lwjgl.vulkan.VkDevice r6, @org.lwjgl.system.NativeType("VkAccelerationStructureNV") long r7, @javax.annotation.Nullable @org.lwjgl.system.NativeType("VkAllocationCallbacks const *") org.lwjgl.vulkan.VkAllocationCallbacks r9) {
            r0 = r6
            r1 = r7
            r2 = r9
            long r2 = org.lwjgl.system.MemoryUtil.memAddressSafe(r2)
            nvkDestroyAccelerationStructureNV(r0, r1, r2)
            return
    }

    public static void nvkGetAccelerationStructureMemoryRequirementsNV(org.lwjgl.vulkan.VkDevice r9, long r10, long r12) {
            r0 = r9
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkGetAccelerationStructureMemoryRequirementsNV
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
            org.lwjgl.system.JNI.callPPPV(r0, r1, r2, r3)
            return
    }

    public static void vkGetAccelerationStructureMemoryRequirementsNV(org.lwjgl.vulkan.VkDevice r6, @org.lwjgl.system.NativeType("VkAccelerationStructureMemoryRequirementsInfoNV const *") org.lwjgl.vulkan.VkAccelerationStructureMemoryRequirementsInfoNV r7, @org.lwjgl.system.NativeType("VkMemoryRequirements2KHR *") org.lwjgl.vulkan.VkMemoryRequirements2KHR r8) {
            r0 = r6
            r1 = r7
            long r1 = r1.address()
            r2 = r8
            long r2 = r2.address()
            nvkGetAccelerationStructureMemoryRequirementsNV(r0, r1, r2)
            return
    }

    public static int nvkBindAccelerationStructureMemoryNV(org.lwjgl.vulkan.VkDevice r8, int r9, long r10) {
            r0 = r8
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkBindAccelerationStructureMemoryNV
            r12 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L22
            r0 = r12
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r10
            r1 = r9
            int r2 = org.lwjgl.vulkan.VkBindAccelerationStructureMemoryInfoNV.SIZEOF
            int r3 = org.lwjgl.vulkan.VkBindAccelerationStructureMemoryInfoNV::validate
            org.lwjgl.system.Struct.validate(r0, r1, r2, r3)
        L22:
            r0 = r8
            long r0 = r0.address()
            r1 = r9
            r2 = r10
            r3 = r12
            int r0 = org.lwjgl.system.JNI.callPPI(r0, r1, r2, r3)
            return r0
    }

    @org.lwjgl.system.NativeType("VkResult")
    public static int vkBindAccelerationStructureMemoryNV(org.lwjgl.vulkan.VkDevice r5, @org.lwjgl.system.NativeType("VkBindAccelerationStructureMemoryInfoNV const *") org.lwjgl.vulkan.VkBindAccelerationStructureMemoryInfoNV.Buffer r6) {
            r0 = r5
            r1 = r6
            int r1 = r1.remaining()
            r2 = r6
            long r2 = r2.address()
            int r0 = nvkBindAccelerationStructureMemoryNV(r0, r1, r2)
            return r0
    }

    public static void nvkCmdBuildAccelerationStructureNV(org.lwjgl.vulkan.VkCommandBuffer r20, long r21, long r23, long r25, int r27, long r28, long r30, long r32, long r34) {
            r0 = r20
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkCmdBuildAccelerationStructureNV
            r36 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L19
            r0 = r36
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r21
            org.lwjgl.vulkan.VkAccelerationStructureInfoNV.validate(r0)
        L19:
            r0 = r20
            long r0 = r0.address()
            r1 = r21
            r2 = r23
            r3 = r25
            r4 = r27
            r5 = r28
            r6 = r30
            r7 = r32
            r8 = r34
            r9 = r36
            org.lwjgl.system.JNI.callPPJJJJJJV(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9)
            return
    }

    public static void vkCmdBuildAccelerationStructureNV(org.lwjgl.vulkan.VkCommandBuffer r17, @org.lwjgl.system.NativeType("VkAccelerationStructureInfoNV const *") org.lwjgl.vulkan.VkAccelerationStructureInfoNV r18, @org.lwjgl.system.NativeType("VkBuffer") long r19, @org.lwjgl.system.NativeType("VkDeviceSize") long r21, @org.lwjgl.system.NativeType("VkBool32") boolean r23, @org.lwjgl.system.NativeType("VkAccelerationStructureNV") long r24, @org.lwjgl.system.NativeType("VkAccelerationStructureNV") long r26, @org.lwjgl.system.NativeType("VkBuffer") long r28, @org.lwjgl.system.NativeType("VkDeviceSize") long r30) {
            r0 = r17
            r1 = r18
            long r1 = r1.address()
            r2 = r19
            r3 = r21
            r4 = r23
            if (r4 == 0) goto L11
            r4 = 1
            goto L12
        L11:
            r4 = 0
        L12:
            r5 = r24
            r6 = r26
            r7 = r28
            r8 = r30
            nvkCmdBuildAccelerationStructureNV(r0, r1, r2, r3, r4, r5, r6, r7, r8)
            return
    }

    public static void vkCmdCopyAccelerationStructureNV(org.lwjgl.vulkan.VkCommandBuffer r10, @org.lwjgl.system.NativeType("VkAccelerationStructureNV") long r11, @org.lwjgl.system.NativeType("VkAccelerationStructureNV") long r13, @org.lwjgl.system.NativeType("VkCopyAccelerationStructureModeKHR") int r15) {
            r0 = r10
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkCmdCopyAccelerationStructureNV
            r16 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L15
            r0 = r16
            long r0 = org.lwjgl.system.Checks.check(r0)
        L15:
            r0 = r10
            long r0 = r0.address()
            r1 = r11
            r2 = r13
            r3 = r15
            r4 = r16
            org.lwjgl.system.JNI.callPJJV(r0, r1, r2, r3, r4)
            return
    }

    public static void vkCmdTraceRaysNV(org.lwjgl.vulkan.VkCommandBuffer r30, @org.lwjgl.system.NativeType("VkBuffer") long r31, @org.lwjgl.system.NativeType("VkDeviceSize") long r33, @org.lwjgl.system.NativeType("VkBuffer") long r35, @org.lwjgl.system.NativeType("VkDeviceSize") long r37, @org.lwjgl.system.NativeType("VkDeviceSize") long r39, @org.lwjgl.system.NativeType("VkBuffer") long r41, @org.lwjgl.system.NativeType("VkDeviceSize") long r43, @org.lwjgl.system.NativeType("VkDeviceSize") long r45, @org.lwjgl.system.NativeType("VkBuffer") long r47, @org.lwjgl.system.NativeType("VkDeviceSize") long r49, @org.lwjgl.system.NativeType("VkDeviceSize") long r51, @org.lwjgl.system.NativeType("uint32_t") int r53, @org.lwjgl.system.NativeType("uint32_t") int r54, @org.lwjgl.system.NativeType("uint32_t") int r55) {
            r0 = r30
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkCmdTraceRaysNV
            r56 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L15
            r0 = r56
            long r0 = org.lwjgl.system.Checks.check(r0)
        L15:
            r0 = r30
            long r0 = r0.address()
            r1 = r31
            r2 = r33
            r3 = r35
            r4 = r37
            r5 = r39
            r6 = r41
            r7 = r43
            r8 = r45
            r9 = r47
            r10 = r49
            r11 = r51
            r12 = r53
            r13 = r54
            r14 = r55
            r15 = r56
            org.lwjgl.system.JNI.callPJJJJJJJJJJJV(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            return
    }

    public static int nvkCreateRayTracingPipelinesNV(org.lwjgl.vulkan.VkDevice r14, long r15, int r17, long r18, long r20, long r22) {
            r0 = r14
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkCreateRayTracingPipelinesNV
            r24 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L23
            r0 = r24
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r18
            r1 = r17
            int r2 = org.lwjgl.vulkan.VkRayTracingPipelineCreateInfoNV.SIZEOF
            int r3 = org.lwjgl.vulkan.VkRayTracingPipelineCreateInfoNV::validate
            org.lwjgl.system.Struct.validate(r0, r1, r2, r3)
        L23:
            r0 = r14
            long r0 = r0.address()
            r1 = r15
            r2 = r17
            r3 = r18
            r4 = r20
            r5 = r22
            r6 = r24
            int r0 = org.lwjgl.system.JNI.callPJPPPI(r0, r1, r2, r3, r4, r5, r6)
            return r0
    }

    @org.lwjgl.system.NativeType("VkResult")
    public static int vkCreateRayTracingPipelinesNV(org.lwjgl.vulkan.VkDevice r11, @org.lwjgl.system.NativeType("VkPipelineCache") long r12, @org.lwjgl.system.NativeType("VkRayTracingPipelineCreateInfoNV const *") org.lwjgl.vulkan.VkRayTracingPipelineCreateInfoNV.Buffer r14, @javax.annotation.Nullable @org.lwjgl.system.NativeType("VkAllocationCallbacks const *") org.lwjgl.vulkan.VkAllocationCallbacks r15, @org.lwjgl.system.NativeType("VkPipeline *") java.nio.LongBuffer r16) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lf
            r0 = r16
            r1 = r14
            int r1 = r1.remaining()
            org.lwjgl.system.Checks.check(r0, r1)
        Lf:
            r0 = r11
            r1 = r12
            r2 = r14
            int r2 = r2.remaining()
            r3 = r14
            long r3 = r3.address()
            r4 = r15
            long r4 = org.lwjgl.system.MemoryUtil.memAddressSafe(r4)
            r5 = r16
            long r5 = org.lwjgl.system.MemoryUtil.memAddress(r5)
            int r0 = nvkCreateRayTracingPipelinesNV(r0, r1, r2, r3, r4, r5)
            return r0
    }

    public static int nvkGetRayTracingShaderGroupHandlesNV(org.lwjgl.vulkan.VkDevice r13, long r14, int r16, int r17, long r18, long r20) {
            r0 = r13
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkGetRayTracingShaderGroupHandlesNV
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
    public static int vkGetRayTracingShaderGroupHandlesNV(org.lwjgl.vulkan.VkDevice r10, @org.lwjgl.system.NativeType("VkPipeline") long r11, @org.lwjgl.system.NativeType("uint32_t") int r13, @org.lwjgl.system.NativeType("uint32_t") int r14, @org.lwjgl.system.NativeType("void *") java.nio.ByteBuffer r15) {
            r0 = r10
            r1 = r11
            r2 = r13
            r3 = r14
            r4 = r15
            int r4 = r4.remaining()
            long r4 = (long) r4
            r5 = r15
            long r5 = org.lwjgl.system.MemoryUtil.memAddress(r5)
            int r0 = nvkGetRayTracingShaderGroupHandlesNV(r0, r1, r2, r3, r4, r5)
            return r0
    }

    public static int nvkGetAccelerationStructureHandleNV(org.lwjgl.vulkan.VkDevice r11, long r12, long r14, long r16) {
            r0 = r11
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkGetAccelerationStructureHandleNV
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
    public static int vkGetAccelerationStructureHandleNV(org.lwjgl.vulkan.VkDevice r8, @org.lwjgl.system.NativeType("VkAccelerationStructureNV") long r9, @org.lwjgl.system.NativeType("void *") java.nio.ByteBuffer r11) {
            r0 = r8
            r1 = r9
            r2 = r11
            int r2 = r2.remaining()
            long r2 = (long) r2
            r3 = r11
            long r3 = org.lwjgl.system.MemoryUtil.memAddress(r3)
            int r0 = nvkGetAccelerationStructureHandleNV(r0, r1, r2, r3)
            return r0
    }

    @org.lwjgl.system.NativeType("VkResult")
    public static int vkGetAccelerationStructureHandleNV(org.lwjgl.vulkan.VkDevice r8, @org.lwjgl.system.NativeType("VkAccelerationStructureNV") long r9, @org.lwjgl.system.NativeType("void *") java.nio.LongBuffer r11) {
            r0 = r8
            r1 = r9
            r2 = r11
            int r2 = r2.remaining()
            long r2 = java.lang.Integer.toUnsignedLong(r2)
            r3 = 3
            long r2 = r2 << r3
            r3 = r11
            long r3 = org.lwjgl.system.MemoryUtil.memAddress(r3)
            int r0 = nvkGetAccelerationStructureHandleNV(r0, r1, r2, r3)
            return r0
    }

    public static void nvkCmdWriteAccelerationStructuresPropertiesNV(org.lwjgl.vulkan.VkCommandBuffer r12, int r13, long r14, int r16, long r17, int r19) {
            r0 = r12
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkCmdWriteAccelerationStructuresPropertiesNV
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
            r4 = r17
            r5 = r19
            r6 = r20
            org.lwjgl.system.JNI.callPPJV(r0, r1, r2, r3, r4, r5, r6)
            return
    }

    public static void vkCmdWriteAccelerationStructuresPropertiesNV(org.lwjgl.vulkan.VkCommandBuffer r9, @org.lwjgl.system.NativeType("VkAccelerationStructureNV const *") java.nio.LongBuffer r10, @org.lwjgl.system.NativeType("VkQueryType") int r11, @org.lwjgl.system.NativeType("VkQueryPool") long r12, @org.lwjgl.system.NativeType("uint32_t") int r14) {
            r0 = r9
            r1 = r10
            int r1 = r1.remaining()
            r2 = r10
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            r3 = r11
            r4 = r12
            r5 = r14
            nvkCmdWriteAccelerationStructuresPropertiesNV(r0, r1, r2, r3, r4, r5)
            return
    }

    @org.lwjgl.system.NativeType("VkResult")
    public static int vkCompileDeferredNV(org.lwjgl.vulkan.VkDevice r8, @org.lwjgl.system.NativeType("VkPipeline") long r9, @org.lwjgl.system.NativeType("uint32_t") int r11) {
            r0 = r8
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkCompileDeferredNV
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

    @org.lwjgl.system.NativeType("VkResult")
    public static int vkCreateAccelerationStructureNV(org.lwjgl.vulkan.VkDevice r10, @org.lwjgl.system.NativeType("VkAccelerationStructureCreateInfoNV const *") org.lwjgl.vulkan.VkAccelerationStructureCreateInfoNV r11, @javax.annotation.Nullable @org.lwjgl.system.NativeType("VkAllocationCallbacks const *") org.lwjgl.vulkan.VkAllocationCallbacks r12, @org.lwjgl.system.NativeType("VkAccelerationStructureNV *") long[] r13) {
            r0 = r10
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkCreateAccelerationStructureNV
            r14 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L21
            r0 = r14
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r13
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
            r0 = r11
            long r0 = r0.address()
            org.lwjgl.vulkan.VkAccelerationStructureCreateInfoNV.validate(r0)
        L21:
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
    public static int vkCreateRayTracingPipelinesNV(org.lwjgl.vulkan.VkDevice r13, @org.lwjgl.system.NativeType("VkPipelineCache") long r14, @org.lwjgl.system.NativeType("VkRayTracingPipelineCreateInfoNV const *") org.lwjgl.vulkan.VkRayTracingPipelineCreateInfoNV.Buffer r16, @javax.annotation.Nullable @org.lwjgl.system.NativeType("VkAllocationCallbacks const *") org.lwjgl.vulkan.VkAllocationCallbacks r17, @org.lwjgl.system.NativeType("VkPipeline *") long[] r18) {
            r0 = r13
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkCreateRayTracingPipelinesNV
            r19 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L31
            r0 = r19
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r18
            r1 = r16
            int r1 = r1.remaining()
            org.lwjgl.system.Checks.check(r0, r1)
            r0 = r16
            long r0 = r0.address()
            r1 = r16
            int r1 = r1.remaining()
            int r2 = org.lwjgl.vulkan.VkRayTracingPipelineCreateInfoNV.SIZEOF
            int r3 = org.lwjgl.vulkan.VkRayTracingPipelineCreateInfoNV::validate
            org.lwjgl.system.Struct.validate(r0, r1, r2, r3)
        L31:
            r0 = r13
            long r0 = r0.address()
            r1 = r14
            r2 = r16
            int r2 = r2.remaining()
            r3 = r16
            long r3 = r3.address()
            r4 = r17
            long r4 = org.lwjgl.system.MemoryUtil.memAddressSafe(r4)
            r5 = r18
            r6 = r19
            int r0 = org.lwjgl.system.JNI.callPJPPPI(r0, r1, r2, r3, r4, r5, r6)
            return r0
    }

    @org.lwjgl.system.NativeType("VkResult")
    public static int vkGetAccelerationStructureHandleNV(org.lwjgl.vulkan.VkDevice r10, @org.lwjgl.system.NativeType("VkAccelerationStructureNV") long r11, @org.lwjgl.system.NativeType("void *") long[] r13) {
            r0 = r10
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkGetAccelerationStructureHandleNV
            r14 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L15
            r0 = r14
            long r0 = org.lwjgl.system.Checks.check(r0)
        L15:
            r0 = r10
            long r0 = r0.address()
            r1 = r11
            r2 = r13
            int r2 = r2.length
            long r2 = java.lang.Integer.toUnsignedLong(r2)
            r3 = 3
            long r2 = r2 << r3
            r3 = r13
            r4 = r14
            int r0 = org.lwjgl.system.JNI.callPJPPI(r0, r1, r2, r3, r4)
            return r0
    }

    public static void vkCmdWriteAccelerationStructuresPropertiesNV(org.lwjgl.vulkan.VkCommandBuffer r11, @org.lwjgl.system.NativeType("VkAccelerationStructureNV const *") long[] r12, @org.lwjgl.system.NativeType("VkQueryType") int r13, @org.lwjgl.system.NativeType("VkQueryPool") long r14, @org.lwjgl.system.NativeType("uint32_t") int r16) {
            r0 = r11
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkCmdWriteAccelerationStructuresPropertiesNV
            r17 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L15
            r0 = r17
            long r0 = org.lwjgl.system.Checks.check(r0)
        L15:
            r0 = r11
            long r0 = r0.address()
            r1 = r12
            int r1 = r1.length
            r2 = r12
            r3 = r13
            r4 = r14
            r5 = r16
            r6 = r17
            org.lwjgl.system.JNI.callPPJV(r0, r1, r2, r3, r4, r5, r6)
            return
    }
}
