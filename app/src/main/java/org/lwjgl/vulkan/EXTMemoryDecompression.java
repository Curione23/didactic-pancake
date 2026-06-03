package org.lwjgl.vulkan;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/EXTMemoryDecompression.class */
public class EXTMemoryDecompression {
    public static final int VK_EXT_MEMORY_DECOMPRESSION_SPEC_VERSION = 1;
    public static final java.lang.String VK_EXT_MEMORY_DECOMPRESSION_EXTENSION_NAME = "VK_EXT_memory_decompression";
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_MEMORY_DECOMPRESSION_FEATURES_EXT = 1000427000;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_MEMORY_DECOMPRESSION_PROPERTIES_EXT = 1000427001;
    public static final int VK_STRUCTURE_TYPE_DECOMPRESS_MEMORY_INFO_EXT = 1000550002;
    public static final long VK_PIPELINE_STAGE_2_MEMORY_DECOMPRESSION_BIT_EXT = 35184372088832L;
    public static final long VK_ACCESS_2_MEMORY_DECOMPRESSION_READ_BIT_EXT = 36028797018963968L;
    public static final long VK_ACCESS_2_MEMORY_DECOMPRESSION_WRITE_BIT_EXT = 72057594037927936L;
    public static final long VK_BUFFER_USAGE_2_MEMORY_DECOMPRESSION_BIT_EXT = 4294967296L;
    public static final long VK_MEMORY_DECOMPRESSION_METHOD_GDEFLATE_1_0_BIT_EXT = 1;
    public static final long VK_MEMORY_DECOMPRESSION_METHOD_GDEFLATE_1_0_BIT_NV = 1;

    protected EXTMemoryDecompression() {
            r3 = this;
            r0 = r3
            r0.<init>()
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r1 = r0
            r1.<init>()
            throw r0
    }

    public static void nvkCmdDecompressMemoryEXT(org.lwjgl.vulkan.VkCommandBuffer r7, long r8) {
            r0 = r7
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkCmdDecompressMemoryEXT
            r10 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L17
            r0 = r10
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r8
            org.lwjgl.vulkan.VkDecompressMemoryInfoEXT.validate(r0)
        L17:
            r0 = r7
            long r0 = r0.address()
            r1 = r8
            r2 = r10
            org.lwjgl.system.JNI.callPPV(r0, r1, r2)
            return
    }

    public static void vkCmdDecompressMemoryEXT(org.lwjgl.vulkan.VkCommandBuffer r4, @org.lwjgl.system.NativeType("VkDecompressMemoryInfoEXT const *") org.lwjgl.vulkan.VkDecompressMemoryInfoEXT r5) {
            r0 = r4
            r1 = r5
            long r1 = r1.address()
            nvkCmdDecompressMemoryEXT(r0, r1)
            return
    }

    public static void vkCmdDecompressMemoryIndirectCountEXT(org.lwjgl.vulkan.VkCommandBuffer r13, @org.lwjgl.system.NativeType("VkMemoryDecompressionMethodFlagsEXT") long r14, @org.lwjgl.system.NativeType("VkDeviceAddress") long r16, @org.lwjgl.system.NativeType("VkDeviceAddress") long r18, @org.lwjgl.system.NativeType("uint32_t") int r20, @org.lwjgl.system.NativeType("uint32_t") int r21) {
            r0 = r13
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkCmdDecompressMemoryIndirectCountEXT
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
            r3 = r18
            r4 = r20
            r5 = r21
            r6 = r22
            org.lwjgl.system.JNI.callPJJJV(r0, r1, r2, r3, r4, r5, r6)
            return
    }
}
