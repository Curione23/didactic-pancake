package org.lwjgl.vulkan;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/NVCooperativeVector.class */
public class NVCooperativeVector {
    public static final int VK_NV_COOPERATIVE_VECTOR_SPEC_VERSION = 4;
    public static final java.lang.String VK_NV_COOPERATIVE_VECTOR_EXTENSION_NAME = "VK_NV_cooperative_vector";
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_COOPERATIVE_VECTOR_FEATURES_NV = 1000491000;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_COOPERATIVE_VECTOR_PROPERTIES_NV = 1000491001;
    public static final int VK_STRUCTURE_TYPE_COOPERATIVE_VECTOR_PROPERTIES_NV = 1000491002;
    public static final int VK_STRUCTURE_TYPE_CONVERT_COOPERATIVE_VECTOR_MATRIX_INFO_NV = 1000491004;
    public static final int VK_COMPONENT_TYPE_SINT8_PACKED_NV = 1000491000;
    public static final int VK_COMPONENT_TYPE_UINT8_PACKED_NV = 1000491001;
    public static final int VK_COMPONENT_TYPE_FLOAT_E4M3_NV = 1000491002;
    public static final int VK_COMPONENT_TYPE_FLOAT_E5M2_NV = 1000491003;
    public static final long VK_PIPELINE_STAGE_2_CONVERT_COOPERATIVE_VECTOR_MATRIX_BIT_NV = 17592186044416L;
    public static final int VK_COOPERATIVE_VECTOR_MATRIX_LAYOUT_ROW_MAJOR_NV = 0;
    public static final int VK_COOPERATIVE_VECTOR_MATRIX_LAYOUT_COLUMN_MAJOR_NV = 1;
    public static final int VK_COOPERATIVE_VECTOR_MATRIX_LAYOUT_INFERENCING_OPTIMAL_NV = 2;
    public static final int VK_COOPERATIVE_VECTOR_MATRIX_LAYOUT_TRAINING_OPTIMAL_NV = 3;

    protected NVCooperativeVector() {
            r3 = this;
            r0 = r3
            r0.<init>()
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r1 = r0
            r1.<init>()
            throw r0
    }

    public static int nvkGetPhysicalDeviceCooperativeVectorPropertiesNV(org.lwjgl.vulkan.VkPhysicalDevice r9, long r10, long r12) {
            r0 = r9
            org.lwjgl.vulkan.VKCapabilitiesInstance r0 = r0.getCapabilities()
            long r0 = r0.vkGetPhysicalDeviceCooperativeVectorPropertiesNV
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
    public static int vkGetPhysicalDeviceCooperativeVectorPropertiesNV(org.lwjgl.vulkan.VkPhysicalDevice r6, @org.lwjgl.system.NativeType("uint32_t *") java.nio.IntBuffer r7, @org.lwjgl.system.NativeType("VkCooperativeVectorPropertiesNV *") org.lwjgl.vulkan.VkCooperativeVectorPropertiesNV.Buffer r8) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L17
            r0 = r7
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
            r0 = r8
            r1 = r7
            r2 = r7
            int r2 = r2.position()
            int r1 = r1.get(r2)
            org.lwjgl.system.Checks.checkSafe(r0, r1)
        L17:
            r0 = r6
            r1 = r7
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            r2 = r8
            long r2 = org.lwjgl.system.MemoryUtil.memAddressSafe(r2)
            int r0 = nvkGetPhysicalDeviceCooperativeVectorPropertiesNV(r0, r1, r2)
            return r0
    }

    public static int nvkConvertCooperativeVectorMatrixNV(org.lwjgl.vulkan.VkDevice r7, long r8) {
            r0 = r7
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkConvertCooperativeVectorMatrixNV
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
    public static int vkConvertCooperativeVectorMatrixNV(org.lwjgl.vulkan.VkDevice r4, @org.lwjgl.system.NativeType("VkConvertCooperativeVectorMatrixInfoNV const *") org.lwjgl.vulkan.VkConvertCooperativeVectorMatrixInfoNV r5) {
            r0 = r4
            r1 = r5
            long r1 = r1.address()
            int r0 = nvkConvertCooperativeVectorMatrixNV(r0, r1)
            return r0
    }

    public static void nvkCmdConvertCooperativeVectorMatrixNV(org.lwjgl.vulkan.VkCommandBuffer r8, int r9, long r10) {
            r0 = r8
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkCmdConvertCooperativeVectorMatrixNV
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
            org.lwjgl.system.JNI.callPPV(r0, r1, r2, r3)
            return
    }

    public static void vkCmdConvertCooperativeVectorMatrixNV(org.lwjgl.vulkan.VkCommandBuffer r5, @org.lwjgl.system.NativeType("VkConvertCooperativeVectorMatrixInfoNV const *") org.lwjgl.vulkan.VkConvertCooperativeVectorMatrixInfoNV.Buffer r6) {
            r0 = r5
            r1 = r6
            int r1 = r1.remaining()
            r2 = r6
            long r2 = r2.address()
            nvkCmdConvertCooperativeVectorMatrixNV(r0, r1, r2)
            return
    }

    @org.lwjgl.system.NativeType("VkResult")
    public static int vkGetPhysicalDeviceCooperativeVectorPropertiesNV(org.lwjgl.vulkan.VkPhysicalDevice r8, @org.lwjgl.system.NativeType("uint32_t *") int[] r9, @org.lwjgl.system.NativeType("VkCooperativeVectorPropertiesNV *") org.lwjgl.vulkan.VkCooperativeVectorPropertiesNV.Buffer r10) {
            r0 = r8
            org.lwjgl.vulkan.VKCapabilitiesInstance r0 = r0.getCapabilities()
            long r0 = r0.vkGetPhysicalDeviceCooperativeVectorPropertiesNV
            r11 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L1f
            r0 = r11
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r9
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
            r0 = r10
            r1 = r9
            r2 = 0
            r1 = r1[r2]
            org.lwjgl.system.Checks.checkSafe(r0, r1)
        L1f:
            r0 = r8
            long r0 = r0.address()
            r1 = r9
            r2 = r10
            long r2 = org.lwjgl.system.MemoryUtil.memAddressSafe(r2)
            r3 = r11
            int r0 = org.lwjgl.system.JNI.callPPPI(r0, r1, r2, r3)
            return r0
    }
}
