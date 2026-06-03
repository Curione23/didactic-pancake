package org.lwjgl.vulkan;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/NVMemoryDecompression.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/NVMemoryDecompression.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/NVMemoryDecompression.class */
public class NVMemoryDecompression {
    public static final int VK_NV_MEMORY_DECOMPRESSION_SPEC_VERSION = 1;
    public static final java.lang.String VK_NV_MEMORY_DECOMPRESSION_EXTENSION_NAME = "VK_NV_memory_decompression";
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_MEMORY_DECOMPRESSION_FEATURES_NV = 1000427000;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_MEMORY_DECOMPRESSION_PROPERTIES_NV = 1000427001;
    public static final long VK_MEMORY_DECOMPRESSION_METHOD_GDEFLATE_1_0_BIT_NV = 1;

    protected NVMemoryDecompression() {
            r3 = this;
            r0 = r3
            r0.<init>()
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r1 = r0
            r1.<init>()
            throw r0
    }

    public static void nvkCmdDecompressMemoryNV(org.lwjgl.vulkan.VkCommandBuffer r8, int r9, long r10) {
            r0 = r8
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkCmdDecompressMemoryNV
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

    public static void vkCmdDecompressMemoryNV(org.lwjgl.vulkan.VkCommandBuffer r5, @org.lwjgl.system.NativeType("VkDecompressMemoryRegionNV const *") org.lwjgl.vulkan.VkDecompressMemoryRegionNV.Buffer r6) {
            r0 = r5
            r1 = r6
            int r1 = r1.remaining()
            r2 = r6
            long r2 = r2.address()
            nvkCmdDecompressMemoryNV(r0, r1, r2)
            return
    }

    public static void vkCmdDecompressMemoryIndirectCountNV(org.lwjgl.vulkan.VkCommandBuffer r10, @org.lwjgl.system.NativeType("VkDeviceAddress") long r11, @org.lwjgl.system.NativeType("VkDeviceAddress") long r13, @org.lwjgl.system.NativeType("uint32_t") int r15) {
            r0 = r10
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkCmdDecompressMemoryIndirectCountNV
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
}
