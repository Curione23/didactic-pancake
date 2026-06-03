package org.lwjgl.vulkan;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/NVClusterAccelerationStructure.class */
public class NVClusterAccelerationStructure {
    public static final int VK_NV_CLUSTER_ACCELERATION_STRUCTURE_SPEC_VERSION = 4;
    public static final java.lang.String VK_NV_CLUSTER_ACCELERATION_STRUCTURE_EXTENSION_NAME = "VK_NV_cluster_acceleration_structure";
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_CLUSTER_ACCELERATION_STRUCTURE_FEATURES_NV = 1000569000;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_CLUSTER_ACCELERATION_STRUCTURE_PROPERTIES_NV = 1000569001;
    public static final int VK_STRUCTURE_TYPE_CLUSTER_ACCELERATION_STRUCTURE_CLUSTERS_BOTTOM_LEVEL_INPUT_NV = 1000569002;
    public static final int VK_STRUCTURE_TYPE_CLUSTER_ACCELERATION_STRUCTURE_TRIANGLE_CLUSTER_INPUT_NV = 1000569003;
    public static final int VK_STRUCTURE_TYPE_CLUSTER_ACCELERATION_STRUCTURE_MOVE_OBJECTS_INPUT_NV = 1000569004;
    public static final int VK_STRUCTURE_TYPE_CLUSTER_ACCELERATION_STRUCTURE_INPUT_INFO_NV = 1000569005;
    public static final int VK_STRUCTURE_TYPE_CLUSTER_ACCELERATION_STRUCTURE_COMMANDS_INFO_NV = 1000569006;
    public static final int VK_STRUCTURE_TYPE_RAY_TRACING_PIPELINE_CLUSTER_ACCELERATION_STRUCTURE_CREATE_INFO_NV = 1000569007;
    public static final int VK_BUILD_ACCELERATION_STRUCTURE_ALLOW_CLUSTER_OPACITY_MICROMAPS_BIT_NV = 4096;
    public static final int VK_OPACITY_MICROMAP_SPECIAL_INDEX_CLUSTER_GEOMETRY_DISABLE_OPACITY_MICROMAP_NV = -5;
    public static final int VK_CLUSTER_ACCELERATION_STRUCTURE_TYPE_CLUSTERS_BOTTOM_LEVEL_NV = 0;
    public static final int VK_CLUSTER_ACCELERATION_STRUCTURE_TYPE_TRIANGLE_CLUSTER_NV = 1;
    public static final int VK_CLUSTER_ACCELERATION_STRUCTURE_TYPE_TRIANGLE_CLUSTER_TEMPLATE_NV = 2;
    public static final int VK_CLUSTER_ACCELERATION_STRUCTURE_OP_TYPE_MOVE_OBJECTS_NV = 0;
    public static final int VK_CLUSTER_ACCELERATION_STRUCTURE_OP_TYPE_BUILD_CLUSTERS_BOTTOM_LEVEL_NV = 1;
    public static final int VK_CLUSTER_ACCELERATION_STRUCTURE_OP_TYPE_BUILD_TRIANGLE_CLUSTER_NV = 2;
    public static final int VK_CLUSTER_ACCELERATION_STRUCTURE_OP_TYPE_BUILD_TRIANGLE_CLUSTER_TEMPLATE_NV = 3;
    public static final int VK_CLUSTER_ACCELERATION_STRUCTURE_OP_TYPE_INSTANTIATE_TRIANGLE_CLUSTER_NV = 4;
    public static final int VK_CLUSTER_ACCELERATION_STRUCTURE_OP_TYPE_GET_CLUSTER_TEMPLATE_INDICES_NV = 5;
    public static final int VK_CLUSTER_ACCELERATION_STRUCTURE_OP_MODE_IMPLICIT_DESTINATIONS_NV = 0;
    public static final int VK_CLUSTER_ACCELERATION_STRUCTURE_OP_MODE_EXPLICIT_DESTINATIONS_NV = 1;
    public static final int VK_CLUSTER_ACCELERATION_STRUCTURE_OP_MODE_COMPUTE_SIZES_NV = 2;
    public static final int VK_CLUSTER_ACCELERATION_STRUCTURE_ADDRESS_RESOLUTION_NONE_NV = 0;
    public static final int VK_CLUSTER_ACCELERATION_STRUCTURE_ADDRESS_RESOLUTION_INDIRECTED_DST_IMPLICIT_DATA_BIT_NV = 1;
    public static final int VK_CLUSTER_ACCELERATION_STRUCTURE_ADDRESS_RESOLUTION_INDIRECTED_SCRATCH_DATA_BIT_NV = 2;
    public static final int VK_CLUSTER_ACCELERATION_STRUCTURE_ADDRESS_RESOLUTION_INDIRECTED_DST_ADDRESS_ARRAY_BIT_NV = 4;
    public static final int VK_CLUSTER_ACCELERATION_STRUCTURE_ADDRESS_RESOLUTION_INDIRECTED_DST_SIZES_ARRAY_BIT_NV = 8;
    public static final int VK_CLUSTER_ACCELERATION_STRUCTURE_ADDRESS_RESOLUTION_INDIRECTED_SRC_INFOS_ARRAY_BIT_NV = 16;
    public static final int VK_CLUSTER_ACCELERATION_STRUCTURE_ADDRESS_RESOLUTION_INDIRECTED_SRC_INFOS_COUNT_BIT_NV = 32;
    public static final int VK_CLUSTER_ACCELERATION_STRUCTURE_CLUSTER_ALLOW_DISABLE_OPACITY_MICROMAPS_NV = 1;
    public static final int VK_CLUSTER_ACCELERATION_STRUCTURE_GEOMETRY_CULL_DISABLE_BIT_NV = 1;
    public static final int VK_CLUSTER_ACCELERATION_STRUCTURE_GEOMETRY_NO_DUPLICATE_ANYHIT_INVOCATION_BIT_NV = 2;
    public static final int VK_CLUSTER_ACCELERATION_STRUCTURE_GEOMETRY_OPAQUE_BIT_NV = 4;
    public static final int VK_CLUSTER_ACCELERATION_STRUCTURE_INDEX_FORMAT_8BIT_NV = 1;
    public static final int VK_CLUSTER_ACCELERATION_STRUCTURE_INDEX_FORMAT_16BIT_NV = 2;
    public static final int VK_CLUSTER_ACCELERATION_STRUCTURE_INDEX_FORMAT_32BIT_NV = 4;

    protected NVClusterAccelerationStructure() {
            r3 = this;
            r0 = r3
            r0.<init>()
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r1 = r0
            r1.<init>()
            throw r0
    }

    public static void nvkGetClusterAccelerationStructureBuildSizesNV(org.lwjgl.vulkan.VkDevice r9, long r10, long r12) {
            r0 = r9
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkGetClusterAccelerationStructureBuildSizesNV
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

    public static void vkGetClusterAccelerationStructureBuildSizesNV(org.lwjgl.vulkan.VkDevice r6, @org.lwjgl.system.NativeType("VkClusterAccelerationStructureInputInfoNV const *") org.lwjgl.vulkan.VkClusterAccelerationStructureInputInfoNV r7, @org.lwjgl.system.NativeType("VkAccelerationStructureBuildSizesInfoKHR *") org.lwjgl.vulkan.VkAccelerationStructureBuildSizesInfoKHR r8) {
            r0 = r6
            r1 = r7
            long r1 = r1.address()
            r2 = r8
            long r2 = r2.address()
            nvkGetClusterAccelerationStructureBuildSizesNV(r0, r1, r2)
            return
    }

    public static void nvkCmdBuildClusterAccelerationStructureIndirectNV(org.lwjgl.vulkan.VkCommandBuffer r7, long r8) {
            r0 = r7
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkCmdBuildClusterAccelerationStructureIndirectNV
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

    public static void vkCmdBuildClusterAccelerationStructureIndirectNV(org.lwjgl.vulkan.VkCommandBuffer r4, @org.lwjgl.system.NativeType("VkClusterAccelerationStructureCommandsInfoNV const *") org.lwjgl.vulkan.VkClusterAccelerationStructureCommandsInfoNV r5) {
            r0 = r4
            r1 = r5
            long r1 = r1.address()
            nvkCmdBuildClusterAccelerationStructureIndirectNV(r0, r1)
            return
    }
}
