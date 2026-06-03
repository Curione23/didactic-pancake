package org.lwjgl.vulkan;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/KHRAccelerationStructure.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/KHRAccelerationStructure.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/KHRAccelerationStructure.class */
public class KHRAccelerationStructure {
    public static final int VK_KHR_ACCELERATION_STRUCTURE_SPEC_VERSION = 13;
    public static final java.lang.String VK_KHR_ACCELERATION_STRUCTURE_EXTENSION_NAME = "VK_KHR_acceleration_structure";
    public static final int VK_STRUCTURE_TYPE_WRITE_DESCRIPTOR_SET_ACCELERATION_STRUCTURE_KHR = 1000150007;
    public static final int VK_STRUCTURE_TYPE_ACCELERATION_STRUCTURE_BUILD_GEOMETRY_INFO_KHR = 1000150000;
    public static final int VK_STRUCTURE_TYPE_ACCELERATION_STRUCTURE_DEVICE_ADDRESS_INFO_KHR = 1000150002;
    public static final int VK_STRUCTURE_TYPE_ACCELERATION_STRUCTURE_GEOMETRY_AABBS_DATA_KHR = 1000150003;
    public static final int VK_STRUCTURE_TYPE_ACCELERATION_STRUCTURE_GEOMETRY_INSTANCES_DATA_KHR = 1000150004;
    public static final int VK_STRUCTURE_TYPE_ACCELERATION_STRUCTURE_GEOMETRY_TRIANGLES_DATA_KHR = 1000150005;
    public static final int VK_STRUCTURE_TYPE_ACCELERATION_STRUCTURE_GEOMETRY_KHR = 1000150006;
    public static final int VK_STRUCTURE_TYPE_ACCELERATION_STRUCTURE_VERSION_INFO_KHR = 1000150009;
    public static final int VK_STRUCTURE_TYPE_COPY_ACCELERATION_STRUCTURE_INFO_KHR = 1000150010;
    public static final int VK_STRUCTURE_TYPE_COPY_ACCELERATION_STRUCTURE_TO_MEMORY_INFO_KHR = 1000150011;
    public static final int VK_STRUCTURE_TYPE_COPY_MEMORY_TO_ACCELERATION_STRUCTURE_INFO_KHR = 1000150012;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_ACCELERATION_STRUCTURE_FEATURES_KHR = 1000150013;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_ACCELERATION_STRUCTURE_PROPERTIES_KHR = 1000150014;
    public static final int VK_STRUCTURE_TYPE_ACCELERATION_STRUCTURE_CREATE_INFO_KHR = 1000150017;
    public static final int VK_STRUCTURE_TYPE_ACCELERATION_STRUCTURE_BUILD_SIZES_INFO_KHR = 1000150020;
    public static final int VK_PIPELINE_STAGE_ACCELERATION_STRUCTURE_BUILD_BIT_KHR = 33554432;
    public static final int VK_DESCRIPTOR_TYPE_ACCELERATION_STRUCTURE_KHR = 1000150000;
    public static final int VK_ACCESS_ACCELERATION_STRUCTURE_READ_BIT_KHR = 2097152;
    public static final int VK_ACCESS_ACCELERATION_STRUCTURE_WRITE_BIT_KHR = 4194304;
    public static final int VK_QUERY_TYPE_ACCELERATION_STRUCTURE_COMPACTED_SIZE_KHR = 1000150000;
    public static final int VK_QUERY_TYPE_ACCELERATION_STRUCTURE_SERIALIZATION_SIZE_KHR = 1000150001;
    public static final int VK_OBJECT_TYPE_ACCELERATION_STRUCTURE_KHR = 1000150000;
    public static final int VK_INDEX_TYPE_NONE_KHR = 1000165000;
    public static final int VK_FORMAT_FEATURE_ACCELERATION_STRUCTURE_VERTEX_BUFFER_BIT_KHR = 536870912;
    public static final int VK_BUFFER_USAGE_ACCELERATION_STRUCTURE_BUILD_INPUT_READ_ONLY_BIT_KHR = 524288;
    public static final int VK_BUFFER_USAGE_ACCELERATION_STRUCTURE_STORAGE_BIT_KHR = 1048576;
    public static final long VK_FORMAT_FEATURE_2_ACCELERATION_STRUCTURE_VERTEX_BUFFER_BIT_KHR = 536870912;
    public static final int VK_DEBUG_REPORT_OBJECT_TYPE_ACCELERATION_STRUCTURE_KHR_EXT = 1000150000;
    public static final int VK_ACCELERATION_STRUCTURE_TYPE_TOP_LEVEL_KHR = 0;
    public static final int VK_ACCELERATION_STRUCTURE_TYPE_BOTTOM_LEVEL_KHR = 1;
    public static final int VK_ACCELERATION_STRUCTURE_TYPE_GENERIC_KHR = 2;
    public static final int VK_BUILD_ACCELERATION_STRUCTURE_ALLOW_UPDATE_BIT_KHR = 1;
    public static final int VK_BUILD_ACCELERATION_STRUCTURE_ALLOW_COMPACTION_BIT_KHR = 2;
    public static final int VK_BUILD_ACCELERATION_STRUCTURE_PREFER_FAST_TRACE_BIT_KHR = 4;
    public static final int VK_BUILD_ACCELERATION_STRUCTURE_PREFER_FAST_BUILD_BIT_KHR = 8;
    public static final int VK_BUILD_ACCELERATION_STRUCTURE_LOW_MEMORY_BIT_KHR = 16;
    public static final int VK_BUILD_ACCELERATION_STRUCTURE_MODE_BUILD_KHR = 0;
    public static final int VK_BUILD_ACCELERATION_STRUCTURE_MODE_UPDATE_KHR = 1;
    public static final int VK_GEOMETRY_TYPE_TRIANGLES_KHR = 0;
    public static final int VK_GEOMETRY_TYPE_AABBS_KHR = 1;
    public static final int VK_GEOMETRY_TYPE_INSTANCES_KHR = 2;
    public static final int VK_GEOMETRY_OPAQUE_BIT_KHR = 1;
    public static final int VK_GEOMETRY_NO_DUPLICATE_ANY_HIT_INVOCATION_BIT_KHR = 2;
    public static final int VK_ACCELERATION_STRUCTURE_BUILD_TYPE_HOST_KHR = 0;
    public static final int VK_ACCELERATION_STRUCTURE_BUILD_TYPE_DEVICE_KHR = 1;
    public static final int VK_ACCELERATION_STRUCTURE_BUILD_TYPE_HOST_OR_DEVICE_KHR = 2;
    public static final int VK_GEOMETRY_INSTANCE_TRIANGLE_FACING_CULL_DISABLE_BIT_KHR = 1;
    public static final int VK_GEOMETRY_INSTANCE_TRIANGLE_FLIP_FACING_BIT_KHR = 2;
    public static final int VK_GEOMETRY_INSTANCE_FORCE_OPAQUE_BIT_KHR = 4;
    public static final int VK_GEOMETRY_INSTANCE_FORCE_NO_OPAQUE_BIT_KHR = 8;
    public static final int VK_GEOMETRY_INSTANCE_TRIANGLE_FRONT_COUNTERCLOCKWISE_BIT_KHR = 2;
    public static final int VK_ACCELERATION_STRUCTURE_CREATE_DEVICE_ADDRESS_CAPTURE_REPLAY_BIT_KHR = 1;
    public static final int VK_COPY_ACCELERATION_STRUCTURE_MODE_CLONE_KHR = 0;
    public static final int VK_COPY_ACCELERATION_STRUCTURE_MODE_COMPACT_KHR = 1;
    public static final int VK_COPY_ACCELERATION_STRUCTURE_MODE_SERIALIZE_KHR = 2;
    public static final int VK_COPY_ACCELERATION_STRUCTURE_MODE_DESERIALIZE_KHR = 3;
    public static final int VK_ACCELERATION_STRUCTURE_COMPATIBILITY_COMPATIBLE_KHR = 0;
    public static final int VK_ACCELERATION_STRUCTURE_COMPATIBILITY_INCOMPATIBLE_KHR = 1;

    protected KHRAccelerationStructure() {
            r3 = this;
            r0 = r3
            r0.<init>()
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r1 = r0
            r1.<init>()
            throw r0
    }

    public static int nvkCreateAccelerationStructureKHR(org.lwjgl.vulkan.VkDevice r11, long r12, long r14, long r16) {
            r0 = r11
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkCreateAccelerationStructureKHR
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
    public static int vkCreateAccelerationStructureKHR(org.lwjgl.vulkan.VkDevice r8, @org.lwjgl.system.NativeType("VkAccelerationStructureCreateInfoKHR const *") org.lwjgl.vulkan.VkAccelerationStructureCreateInfoKHR r9, @javax.annotation.Nullable @org.lwjgl.system.NativeType("VkAllocationCallbacks const *") org.lwjgl.vulkan.VkAllocationCallbacks r10, @org.lwjgl.system.NativeType("VkAccelerationStructureKHR *") java.nio.LongBuffer r11) {
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
            int r0 = nvkCreateAccelerationStructureKHR(r0, r1, r2, r3)
            return r0
    }

    public static void nvkDestroyAccelerationStructureKHR(org.lwjgl.vulkan.VkDevice r9, long r10, long r12) {
            r0 = r9
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkDestroyAccelerationStructureKHR
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

    public static void vkDestroyAccelerationStructureKHR(org.lwjgl.vulkan.VkDevice r6, @org.lwjgl.system.NativeType("VkAccelerationStructureKHR") long r7, @javax.annotation.Nullable @org.lwjgl.system.NativeType("VkAllocationCallbacks const *") org.lwjgl.vulkan.VkAllocationCallbacks r9) {
            r0 = r6
            r1 = r7
            r2 = r9
            long r2 = org.lwjgl.system.MemoryUtil.memAddressSafe(r2)
            nvkDestroyAccelerationStructureKHR(r0, r1, r2)
            return
    }

    public static void nvkCmdBuildAccelerationStructuresKHR(org.lwjgl.vulkan.VkCommandBuffer r10, int r11, long r12, long r14) {
            r0 = r10
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkCmdBuildAccelerationStructuresKHR
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
            r3 = r14
            r4 = r16
            org.lwjgl.system.JNI.callPPPV(r0, r1, r2, r3, r4)
            return
    }

    public static void vkCmdBuildAccelerationStructuresKHR(org.lwjgl.vulkan.VkCommandBuffer r7, @org.lwjgl.system.NativeType("VkAccelerationStructureBuildGeometryInfoKHR const *") org.lwjgl.vulkan.VkAccelerationStructureBuildGeometryInfoKHR.Buffer r8, @org.lwjgl.system.NativeType("VkAccelerationStructureBuildRangeInfoKHR const * const *") org.lwjgl.PointerBuffer r9) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Le
            r0 = r9
            r1 = r8
            int r1 = r1.remaining()
            org.lwjgl.system.Checks.check(r0, r1)
        Le:
            r0 = r7
            r1 = r8
            int r1 = r1.remaining()
            r2 = r8
            long r2 = r2.address()
            r3 = r9
            long r3 = org.lwjgl.system.MemoryUtil.memAddress(r3)
            nvkCmdBuildAccelerationStructuresKHR(r0, r1, r2, r3)
            return
    }

    public static void nvkCmdBuildAccelerationStructuresIndirectKHR(org.lwjgl.vulkan.VkCommandBuffer r14, int r15, long r16, long r18, long r20, long r22) {
            r0 = r14
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkCmdBuildAccelerationStructuresIndirectKHR
            r24 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L15
            r0 = r24
            long r0 = org.lwjgl.system.Checks.check(r0)
        L15:
            r0 = r14
            long r0 = r0.address()
            r1 = r15
            r2 = r16
            r3 = r18
            r4 = r20
            r5 = r22
            r6 = r24
            org.lwjgl.system.JNI.callPPPPPV(r0, r1, r2, r3, r4, r5, r6)
            return
    }

    public static void vkCmdBuildAccelerationStructuresIndirectKHR(org.lwjgl.vulkan.VkCommandBuffer r11, @org.lwjgl.system.NativeType("VkAccelerationStructureBuildGeometryInfoKHR const *") org.lwjgl.vulkan.VkAccelerationStructureBuildGeometryInfoKHR.Buffer r12, @org.lwjgl.system.NativeType("VkDeviceAddress const *") java.nio.LongBuffer r13, @org.lwjgl.system.NativeType("uint32_t const *") java.nio.IntBuffer r14, @org.lwjgl.system.NativeType("uint32_t const * const *") org.lwjgl.PointerBuffer r15) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L1f
            r0 = r13
            r1 = r12
            int r1 = r1.remaining()
            org.lwjgl.system.Checks.check(r0, r1)
            r0 = r14
            r1 = r12
            int r1 = r1.remaining()
            org.lwjgl.system.Checks.check(r0, r1)
            r0 = r15
            r1 = r12
            int r1 = r1.remaining()
            org.lwjgl.system.Checks.check(r0, r1)
        L1f:
            r0 = r11
            r1 = r12
            int r1 = r1.remaining()
            r2 = r12
            long r2 = r2.address()
            r3 = r13
            long r3 = org.lwjgl.system.MemoryUtil.memAddress(r3)
            r4 = r14
            long r4 = org.lwjgl.system.MemoryUtil.memAddress(r4)
            r5 = r15
            long r5 = org.lwjgl.system.MemoryUtil.memAddress(r5)
            nvkCmdBuildAccelerationStructuresIndirectKHR(r0, r1, r2, r3, r4, r5)
            return
    }

    public static int nvkBuildAccelerationStructuresKHR(org.lwjgl.vulkan.VkDevice r12, long r13, int r15, long r16, long r18) {
            r0 = r12
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkBuildAccelerationStructuresKHR
            r20 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L15
            r0 = r20
            long r0 = org.lwjgl.system.Checks.check(r0)
        L15:
            r0 = r12
            long r0 = r0.address()
            r1 = r13
            r2 = r15
            r3 = r16
            r4 = r18
            r5 = r20
            int r0 = org.lwjgl.system.JNI.callPJPPI(r0, r1, r2, r3, r4, r5)
            return r0
    }

    @org.lwjgl.system.NativeType("VkResult")
    public static int vkBuildAccelerationStructuresKHR(org.lwjgl.vulkan.VkDevice r9, @org.lwjgl.system.NativeType("VkDeferredOperationKHR") long r10, @org.lwjgl.system.NativeType("VkAccelerationStructureBuildGeometryInfoKHR const *") org.lwjgl.vulkan.VkAccelerationStructureBuildGeometryInfoKHR.Buffer r12, @org.lwjgl.system.NativeType("VkAccelerationStructureBuildRangeInfoKHR const * const *") org.lwjgl.PointerBuffer r13) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lf
            r0 = r13
            r1 = r12
            int r1 = r1.remaining()
            org.lwjgl.system.Checks.check(r0, r1)
        Lf:
            r0 = r9
            r1 = r10
            r2 = r12
            int r2 = r2.remaining()
            r3 = r12
            long r3 = r3.address()
            r4 = r13
            long r4 = org.lwjgl.system.MemoryUtil.memAddress(r4)
            int r0 = nvkBuildAccelerationStructuresKHR(r0, r1, r2, r3, r4)
            return r0
    }

    public static int nvkCopyAccelerationStructureKHR(org.lwjgl.vulkan.VkDevice r9, long r10, long r12) {
            r0 = r9
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkCopyAccelerationStructureKHR
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
    public static int vkCopyAccelerationStructureKHR(org.lwjgl.vulkan.VkDevice r6, @org.lwjgl.system.NativeType("VkDeferredOperationKHR") long r7, @org.lwjgl.system.NativeType("VkCopyAccelerationStructureInfoKHR const *") org.lwjgl.vulkan.VkCopyAccelerationStructureInfoKHR r9) {
            r0 = r6
            r1 = r7
            r2 = r9
            long r2 = r2.address()
            int r0 = nvkCopyAccelerationStructureKHR(r0, r1, r2)
            return r0
    }

    public static int nvkCopyAccelerationStructureToMemoryKHR(org.lwjgl.vulkan.VkDevice r9, long r10, long r12) {
            r0 = r9
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkCopyAccelerationStructureToMemoryKHR
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
    public static int vkCopyAccelerationStructureToMemoryKHR(org.lwjgl.vulkan.VkDevice r6, @org.lwjgl.system.NativeType("VkDeferredOperationKHR") long r7, @org.lwjgl.system.NativeType("VkCopyAccelerationStructureToMemoryInfoKHR const *") org.lwjgl.vulkan.VkCopyAccelerationStructureToMemoryInfoKHR r9) {
            r0 = r6
            r1 = r7
            r2 = r9
            long r2 = r2.address()
            int r0 = nvkCopyAccelerationStructureToMemoryKHR(r0, r1, r2)
            return r0
    }

    public static int nvkCopyMemoryToAccelerationStructureKHR(org.lwjgl.vulkan.VkDevice r9, long r10, long r12) {
            r0 = r9
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkCopyMemoryToAccelerationStructureKHR
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
    public static int vkCopyMemoryToAccelerationStructureKHR(org.lwjgl.vulkan.VkDevice r6, @org.lwjgl.system.NativeType("VkDeferredOperationKHR") long r7, @org.lwjgl.system.NativeType("VkCopyMemoryToAccelerationStructureInfoKHR const *") org.lwjgl.vulkan.VkCopyMemoryToAccelerationStructureInfoKHR r9) {
            r0 = r6
            r1 = r7
            r2 = r9
            long r2 = r2.address()
            int r0 = nvkCopyMemoryToAccelerationStructureKHR(r0, r1, r2)
            return r0
    }

    public static int nvkWriteAccelerationStructuresPropertiesKHR(org.lwjgl.vulkan.VkDevice r15, int r16, long r17, int r19, long r20, long r22, long r24) {
            r0 = r15
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkWriteAccelerationStructuresPropertiesKHR
            r26 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L15
            r0 = r26
            long r0 = org.lwjgl.system.Checks.check(r0)
        L15:
            r0 = r15
            long r0 = r0.address()
            r1 = r16
            r2 = r17
            r3 = r19
            r4 = r20
            r5 = r22
            r6 = r24
            r7 = r26
            int r0 = org.lwjgl.system.JNI.callPPPPPI(r0, r1, r2, r3, r4, r5, r6, r7)
            return r0
    }

    @org.lwjgl.system.NativeType("VkResult")
    public static int vkWriteAccelerationStructuresPropertiesKHR(org.lwjgl.vulkan.VkDevice r12, @org.lwjgl.system.NativeType("VkAccelerationStructureKHR const *") java.nio.LongBuffer r13, @org.lwjgl.system.NativeType("VkQueryType") int r14, @org.lwjgl.system.NativeType("void *") java.nio.ByteBuffer r15, @org.lwjgl.system.NativeType("size_t") long r16) {
            r0 = r12
            r1 = r13
            int r1 = r1.remaining()
            r2 = r13
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            r3 = r14
            r4 = r15
            int r4 = r4.remaining()
            long r4 = (long) r4
            r5 = r15
            long r5 = org.lwjgl.system.MemoryUtil.memAddress(r5)
            r6 = r16
            int r0 = nvkWriteAccelerationStructuresPropertiesKHR(r0, r1, r2, r3, r4, r5, r6)
            return r0
    }

    public static void nvkCmdCopyAccelerationStructureKHR(org.lwjgl.vulkan.VkCommandBuffer r7, long r8) {
            r0 = r7
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkCmdCopyAccelerationStructureKHR
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
            org.lwjgl.system.JNI.callPPV(r0, r1, r2)
            return
    }

    public static void vkCmdCopyAccelerationStructureKHR(org.lwjgl.vulkan.VkCommandBuffer r4, @org.lwjgl.system.NativeType("VkCopyAccelerationStructureInfoKHR const *") org.lwjgl.vulkan.VkCopyAccelerationStructureInfoKHR r5) {
            r0 = r4
            r1 = r5
            long r1 = r1.address()
            nvkCmdCopyAccelerationStructureKHR(r0, r1)
            return
    }

    public static void nvkCmdCopyAccelerationStructureToMemoryKHR(org.lwjgl.vulkan.VkCommandBuffer r7, long r8) {
            r0 = r7
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkCmdCopyAccelerationStructureToMemoryKHR
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
            org.lwjgl.system.JNI.callPPV(r0, r1, r2)
            return
    }

    public static void vkCmdCopyAccelerationStructureToMemoryKHR(org.lwjgl.vulkan.VkCommandBuffer r4, @org.lwjgl.system.NativeType("VkCopyAccelerationStructureToMemoryInfoKHR const *") org.lwjgl.vulkan.VkCopyAccelerationStructureToMemoryInfoKHR r5) {
            r0 = r4
            r1 = r5
            long r1 = r1.address()
            nvkCmdCopyAccelerationStructureToMemoryKHR(r0, r1)
            return
    }

    public static void nvkCmdCopyMemoryToAccelerationStructureKHR(org.lwjgl.vulkan.VkCommandBuffer r7, long r8) {
            r0 = r7
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkCmdCopyMemoryToAccelerationStructureKHR
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
            org.lwjgl.system.JNI.callPPV(r0, r1, r2)
            return
    }

    public static void vkCmdCopyMemoryToAccelerationStructureKHR(org.lwjgl.vulkan.VkCommandBuffer r4, @org.lwjgl.system.NativeType("VkCopyMemoryToAccelerationStructureInfoKHR const *") org.lwjgl.vulkan.VkCopyMemoryToAccelerationStructureInfoKHR r5) {
            r0 = r4
            r1 = r5
            long r1 = r1.address()
            nvkCmdCopyMemoryToAccelerationStructureKHR(r0, r1)
            return
    }

    public static long nvkGetAccelerationStructureDeviceAddressKHR(org.lwjgl.vulkan.VkDevice r7, long r8) {
            r0 = r7
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkGetAccelerationStructureDeviceAddressKHR
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
            long r0 = org.lwjgl.system.JNI.callPPJ(r0, r1, r2)
            return r0
    }

    @org.lwjgl.system.NativeType("VkDeviceAddress")
    public static long vkGetAccelerationStructureDeviceAddressKHR(org.lwjgl.vulkan.VkDevice r4, @org.lwjgl.system.NativeType("VkAccelerationStructureDeviceAddressInfoKHR const *") org.lwjgl.vulkan.VkAccelerationStructureDeviceAddressInfoKHR r5) {
            r0 = r4
            r1 = r5
            long r1 = r1.address()
            long r0 = nvkGetAccelerationStructureDeviceAddressKHR(r0, r1)
            return r0
    }

    public static void nvkCmdWriteAccelerationStructuresPropertiesKHR(org.lwjgl.vulkan.VkCommandBuffer r12, int r13, long r14, int r16, long r17, int r19) {
            r0 = r12
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkCmdWriteAccelerationStructuresPropertiesKHR
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

    public static void vkCmdWriteAccelerationStructuresPropertiesKHR(org.lwjgl.vulkan.VkCommandBuffer r9, @org.lwjgl.system.NativeType("VkAccelerationStructureKHR const *") java.nio.LongBuffer r10, @org.lwjgl.system.NativeType("VkQueryType") int r11, @org.lwjgl.system.NativeType("VkQueryPool") long r12, @org.lwjgl.system.NativeType("uint32_t") int r14) {
            r0 = r9
            r1 = r10
            int r1 = r1.remaining()
            r2 = r10
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            r3 = r11
            r4 = r12
            r5 = r14
            nvkCmdWriteAccelerationStructuresPropertiesKHR(r0, r1, r2, r3, r4, r5)
            return
    }

    public static void nvkGetDeviceAccelerationStructureCompatibilityKHR(org.lwjgl.vulkan.VkDevice r9, long r10, long r12) {
            r0 = r9
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkGetDeviceAccelerationStructureCompatibilityKHR
            r14 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L19
            r0 = r14
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r10
            org.lwjgl.vulkan.VkAccelerationStructureVersionInfoKHR.validate(r0)
        L19:
            r0 = r9
            long r0 = r0.address()
            r1 = r10
            r2 = r12
            r3 = r14
            org.lwjgl.system.JNI.callPPPV(r0, r1, r2, r3)
            return
    }

    public static void vkGetDeviceAccelerationStructureCompatibilityKHR(org.lwjgl.vulkan.VkDevice r6, @org.lwjgl.system.NativeType("VkAccelerationStructureVersionInfoKHR const *") org.lwjgl.vulkan.VkAccelerationStructureVersionInfoKHR r7, @org.lwjgl.system.NativeType("VkAccelerationStructureCompatibilityKHR *") java.nio.IntBuffer r8) {
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
            nvkGetDeviceAccelerationStructureCompatibilityKHR(r0, r1, r2)
            return
    }

    public static void nvkGetAccelerationStructureBuildSizesKHR(org.lwjgl.vulkan.VkDevice r12, int r13, long r14, long r16, long r18) {
            r0 = r12
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkGetAccelerationStructureBuildSizesKHR
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
            org.lwjgl.system.JNI.callPPPPV(r0, r1, r2, r3, r4, r5)
            return
    }

    public static void vkGetAccelerationStructureBuildSizesKHR(org.lwjgl.vulkan.VkDevice r9, @org.lwjgl.system.NativeType("VkAccelerationStructureBuildTypeKHR") int r10, @org.lwjgl.system.NativeType("VkAccelerationStructureBuildGeometryInfoKHR const *") org.lwjgl.vulkan.VkAccelerationStructureBuildGeometryInfoKHR r11, @javax.annotation.Nullable @org.lwjgl.system.NativeType("uint32_t const *") java.nio.IntBuffer r12, @org.lwjgl.system.NativeType("VkAccelerationStructureBuildSizesInfoKHR *") org.lwjgl.vulkan.VkAccelerationStructureBuildSizesInfoKHR r13) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Le
            r0 = r12
            r1 = r11
            int r1 = r1.geometryCount()
            org.lwjgl.system.Checks.checkSafe(r0, r1)
        Le:
            r0 = r9
            r1 = r10
            r2 = r11
            long r2 = r2.address()
            r3 = r12
            long r3 = org.lwjgl.system.MemoryUtil.memAddressSafe(r3)
            r4 = r13
            long r4 = r4.address()
            nvkGetAccelerationStructureBuildSizesKHR(r0, r1, r2, r3, r4)
            return
    }

    @org.lwjgl.system.NativeType("VkResult")
    public static int vkCreateAccelerationStructureKHR(org.lwjgl.vulkan.VkDevice r10, @org.lwjgl.system.NativeType("VkAccelerationStructureCreateInfoKHR const *") org.lwjgl.vulkan.VkAccelerationStructureCreateInfoKHR r11, @javax.annotation.Nullable @org.lwjgl.system.NativeType("VkAllocationCallbacks const *") org.lwjgl.vulkan.VkAllocationCallbacks r12, @org.lwjgl.system.NativeType("VkAccelerationStructureKHR *") long[] r13) {
            r0 = r10
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkCreateAccelerationStructureKHR
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

    public static void vkCmdBuildAccelerationStructuresIndirectKHR(org.lwjgl.vulkan.VkCommandBuffer r12, @org.lwjgl.system.NativeType("VkAccelerationStructureBuildGeometryInfoKHR const *") org.lwjgl.vulkan.VkAccelerationStructureBuildGeometryInfoKHR.Buffer r13, @org.lwjgl.system.NativeType("VkDeviceAddress const *") long[] r14, @org.lwjgl.system.NativeType("uint32_t const *") int[] r15, @org.lwjgl.system.NativeType("uint32_t const * const *") org.lwjgl.PointerBuffer r16) {
            r0 = r12
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkCmdBuildAccelerationStructuresIndirectKHR
            r17 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L2e
            r0 = r17
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r14
            r1 = r13
            int r1 = r1.remaining()
            org.lwjgl.system.Checks.check(r0, r1)
            r0 = r15
            r1 = r13
            int r1 = r1.remaining()
            org.lwjgl.system.Checks.check(r0, r1)
            r0 = r16
            r1 = r13
            int r1 = r1.remaining()
            org.lwjgl.system.Checks.check(r0, r1)
        L2e:
            r0 = r12
            long r0 = r0.address()
            r1 = r13
            int r1 = r1.remaining()
            r2 = r13
            long r2 = r2.address()
            r3 = r14
            r4 = r15
            r5 = r16
            long r5 = org.lwjgl.system.MemoryUtil.memAddress(r5)
            r6 = r17
            org.lwjgl.system.JNI.callPPPPPV(r0, r1, r2, r3, r4, r5, r6)
            return
    }

    @org.lwjgl.system.NativeType("VkResult")
    public static int vkWriteAccelerationStructuresPropertiesKHR(org.lwjgl.vulkan.VkDevice r14, @org.lwjgl.system.NativeType("VkAccelerationStructureKHR const *") long[] r15, @org.lwjgl.system.NativeType("VkQueryType") int r16, @org.lwjgl.system.NativeType("void *") java.nio.ByteBuffer r17, @org.lwjgl.system.NativeType("size_t") long r18) {
            r0 = r14
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkWriteAccelerationStructuresPropertiesKHR
            r20 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L15
            r0 = r20
            long r0 = org.lwjgl.system.Checks.check(r0)
        L15:
            r0 = r14
            long r0 = r0.address()
            r1 = r15
            int r1 = r1.length
            r2 = r15
            r3 = r16
            r4 = r17
            int r4 = r4.remaining()
            long r4 = (long) r4
            r5 = r17
            long r5 = org.lwjgl.system.MemoryUtil.memAddress(r5)
            r6 = r18
            r7 = r20
            int r0 = org.lwjgl.system.JNI.callPPPPPI(r0, r1, r2, r3, r4, r5, r6, r7)
            return r0
    }

    public static void vkCmdWriteAccelerationStructuresPropertiesKHR(org.lwjgl.vulkan.VkCommandBuffer r11, @org.lwjgl.system.NativeType("VkAccelerationStructureKHR const *") long[] r12, @org.lwjgl.system.NativeType("VkQueryType") int r13, @org.lwjgl.system.NativeType("VkQueryPool") long r14, @org.lwjgl.system.NativeType("uint32_t") int r16) {
            r0 = r11
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkCmdWriteAccelerationStructuresPropertiesKHR
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

    public static void vkGetDeviceAccelerationStructureCompatibilityKHR(org.lwjgl.vulkan.VkDevice r8, @org.lwjgl.system.NativeType("VkAccelerationStructureVersionInfoKHR const *") org.lwjgl.vulkan.VkAccelerationStructureVersionInfoKHR r9, @org.lwjgl.system.NativeType("VkAccelerationStructureCompatibilityKHR *") int[] r10) {
            r0 = r8
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkGetDeviceAccelerationStructureCompatibilityKHR
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
            org.lwjgl.vulkan.VkAccelerationStructureVersionInfoKHR.validate(r0)
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

    public static void vkGetAccelerationStructureBuildSizesKHR(org.lwjgl.vulkan.VkDevice r11, @org.lwjgl.system.NativeType("VkAccelerationStructureBuildTypeKHR") int r12, @org.lwjgl.system.NativeType("VkAccelerationStructureBuildGeometryInfoKHR const *") org.lwjgl.vulkan.VkAccelerationStructureBuildGeometryInfoKHR r13, @javax.annotation.Nullable @org.lwjgl.system.NativeType("uint32_t const *") int[] r14, @org.lwjgl.system.NativeType("VkAccelerationStructureBuildSizesInfoKHR *") org.lwjgl.vulkan.VkAccelerationStructureBuildSizesInfoKHR r15) {
            r0 = r11
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkGetAccelerationStructureBuildSizesKHR
            r16 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L1d
            r0 = r16
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r14
            r1 = r13
            int r1 = r1.geometryCount()
            org.lwjgl.system.Checks.checkSafe(r0, r1)
        L1d:
            r0 = r11
            long r0 = r0.address()
            r1 = r12
            r2 = r13
            long r2 = r2.address()
            r3 = r14
            r4 = r15
            long r4 = r4.address()
            r5 = r16
            org.lwjgl.system.JNI.callPPPPV(r0, r1, r2, r3, r4, r5)
            return
    }
}
