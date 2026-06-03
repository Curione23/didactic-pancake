package org.lwjgl.vulkan;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/NVPartitionedAccelerationStructure.class */
public class NVPartitionedAccelerationStructure {
    public static final int VK_NV_PARTITIONED_ACCELERATION_STRUCTURE_SPEC_VERSION = 1;
    public static final java.lang.String VK_NV_PARTITIONED_ACCELERATION_STRUCTURE_EXTENSION_NAME = "VK_NV_partitioned_acceleration_structure";
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_PARTITIONED_ACCELERATION_STRUCTURE_FEATURES_NV = 1000570000;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_PARTITIONED_ACCELERATION_STRUCTURE_PROPERTIES_NV = 1000570001;
    public static final int VK_STRUCTURE_TYPE_WRITE_DESCRIPTOR_SET_PARTITIONED_ACCELERATION_STRUCTURE_NV = 1000570002;
    public static final int VK_STRUCTURE_TYPE_PARTITIONED_ACCELERATION_STRUCTURE_INSTANCES_INPUT_NV = 1000570003;
    public static final int VK_STRUCTURE_TYPE_BUILD_PARTITIONED_ACCELERATION_STRUCTURE_INFO_NV = 1000570004;
    public static final int VK_STRUCTURE_TYPE_PARTITIONED_ACCELERATION_STRUCTURE_FLAGS_NV = 1000570005;
    public static final int VK_DESCRIPTOR_TYPE_PARTITIONED_ACCELERATION_STRUCTURE_NV = 1000570000;
    public static final int VK_PARTITIONED_ACCELERATION_STRUCTURE_PARTITION_INDEX_GLOBAL_NV = -1;
    public static final int VK_PARTITIONED_ACCELERATION_STRUCTURE_OP_TYPE_WRITE_INSTANCE_NV = 0;
    public static final int VK_PARTITIONED_ACCELERATION_STRUCTURE_OP_TYPE_UPDATE_INSTANCE_NV = 1;
    public static final int VK_PARTITIONED_ACCELERATION_STRUCTURE_OP_TYPE_WRITE_PARTITION_TRANSLATION_NV = 2;
    public static final int VK_PARTITIONED_ACCELERATION_STRUCTURE_INSTANCE_FLAG_TRIANGLE_FACING_CULL_DISABLE_BIT_NV = 1;
    public static final int VK_PARTITIONED_ACCELERATION_STRUCTURE_INSTANCE_FLAG_TRIANGLE_FLIP_FACING_BIT_NV = 2;
    public static final int VK_PARTITIONED_ACCELERATION_STRUCTURE_INSTANCE_FLAG_FORCE_OPAQUE_BIT_NV = 4;
    public static final int VK_PARTITIONED_ACCELERATION_STRUCTURE_INSTANCE_FLAG_FORCE_NO_OPAQUE_BIT_NV = 8;
    public static final int VK_PARTITIONED_ACCELERATION_STRUCTURE_INSTANCE_FLAG_ENABLE_EXPLICIT_BOUNDING_BOX_NV = 16;

    protected NVPartitionedAccelerationStructure() {
            r3 = this;
            r0 = r3
            r0.<init>()
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r1 = r0
            r1.<init>()
            throw r0
    }

    public static void nvkGetPartitionedAccelerationStructuresBuildSizesNV(org.lwjgl.vulkan.VkDevice r9, long r10, long r12) {
            r0 = r9
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkGetPartitionedAccelerationStructuresBuildSizesNV
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

    public static void vkGetPartitionedAccelerationStructuresBuildSizesNV(org.lwjgl.vulkan.VkDevice r6, @org.lwjgl.system.NativeType("VkPartitionedAccelerationStructureInstancesInputNV const *") org.lwjgl.vulkan.VkPartitionedAccelerationStructureInstancesInputNV r7, @org.lwjgl.system.NativeType("VkAccelerationStructureBuildSizesInfoKHR *") org.lwjgl.vulkan.VkAccelerationStructureBuildSizesInfoKHR r8) {
            r0 = r6
            r1 = r7
            long r1 = r1.address()
            r2 = r8
            long r2 = r2.address()
            nvkGetPartitionedAccelerationStructuresBuildSizesNV(r0, r1, r2)
            return
    }

    public static void nvkCmdBuildPartitionedAccelerationStructuresNV(org.lwjgl.vulkan.VkCommandBuffer r7, long r8) {
            r0 = r7
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkCmdBuildPartitionedAccelerationStructuresNV
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

    public static void vkCmdBuildPartitionedAccelerationStructuresNV(org.lwjgl.vulkan.VkCommandBuffer r4, @org.lwjgl.system.NativeType("VkBuildPartitionedAccelerationStructureInfoNV const *") org.lwjgl.vulkan.VkBuildPartitionedAccelerationStructureInfoNV r5) {
            r0 = r4
            r1 = r5
            long r1 = r1.address()
            nvkCmdBuildPartitionedAccelerationStructuresNV(r0, r1)
            return
    }
}
