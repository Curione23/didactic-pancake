package org.lwjgl.vulkan;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/NVComputeOccupancyPriority.class */
public class NVComputeOccupancyPriority {
    public static final int VK_NV_COMPUTE_OCCUPANCY_PRIORITY_SPEC_VERSION = 1;
    public static final java.lang.String VK_NV_COMPUTE_OCCUPANCY_PRIORITY_EXTENSION_NAME = "VK_NV_compute_occupancy_priority";
    public static final float VK_COMPUTE_OCCUPANCY_PRIORITY_LOW_NV = 0.25f;
    public static final float VK_COMPUTE_OCCUPANCY_PRIORITY_NORMAL_NV = 0.5f;
    public static final float VK_COMPUTE_OCCUPANCY_PRIORITY_HIGH_NV = 0.75f;
    public static final int VK_STRUCTURE_TYPE_COMPUTE_OCCUPANCY_PRIORITY_PARAMETERS_NV = 1000645000;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_COMPUTE_OCCUPANCY_PRIORITY_FEATURES_NV = 1000645001;

    protected NVComputeOccupancyPriority() {
            r3 = this;
            r0 = r3
            r0.<init>()
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r1 = r0
            r1.<init>()
            throw r0
    }

    public static void nvkCmdSetComputeOccupancyPriorityNV(org.lwjgl.vulkan.VkCommandBuffer r7, long r8) {
            r0 = r7
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkCmdSetComputeOccupancyPriorityNV
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

    public static void vkCmdSetComputeOccupancyPriorityNV(org.lwjgl.vulkan.VkCommandBuffer r4, @org.lwjgl.system.NativeType("VkComputeOccupancyPriorityParametersNV const *") org.lwjgl.vulkan.VkComputeOccupancyPriorityParametersNV r5) {
            r0 = r4
            r1 = r5
            long r1 = r1.address()
            nvkCmdSetComputeOccupancyPriorityNV(r0, r1)
            return
    }
}
