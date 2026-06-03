package org.lwjgl.vulkan;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/QCOMTileMemoryHeap.class */
public class QCOMTileMemoryHeap {
    public static final int VK_QCOM_TILE_MEMORY_HEAP_SPEC_VERSION = 1;
    public static final java.lang.String VK_QCOM_TILE_MEMORY_HEAP_EXTENSION_NAME = "VK_QCOM_tile_memory_heap";
    public static final int VK_MEMORY_HEAP_TILE_MEMORY_BIT_QCOM = 8;
    public static final int VK_BUFFER_USAGE_TILE_MEMORY_BIT_QCOM = 134217728;
    public static final long VK_BUFFER_USAGE_2_TILE_MEMORY_BIT_QCOM = 134217728;
    public static final int VK_IMAGE_USAGE_TILE_MEMORY_BIT_QCOM = 134217728;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_TILE_MEMORY_HEAP_FEATURES_QCOM = 1000547000;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_TILE_MEMORY_HEAP_PROPERTIES_QCOM = 1000547001;
    public static final int VK_STRUCTURE_TYPE_TILE_MEMORY_REQUIREMENTS_QCOM = 1000547002;
    public static final int VK_STRUCTURE_TYPE_TILE_MEMORY_BIND_INFO_QCOM = 1000547003;
    public static final int VK_STRUCTURE_TYPE_TILE_MEMORY_SIZE_INFO_QCOM = 1000547004;

    protected QCOMTileMemoryHeap() {
            r3 = this;
            r0 = r3
            r0.<init>()
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r1 = r0
            r1.<init>()
            throw r0
    }

    public static void nvkCmdBindTileMemoryQCOM(org.lwjgl.vulkan.VkCommandBuffer r7, long r8) {
            r0 = r7
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkCmdBindTileMemoryQCOM
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

    public static void vkCmdBindTileMemoryQCOM(org.lwjgl.vulkan.VkCommandBuffer r4, @org.lwjgl.system.NativeType("VkTileMemoryBindInfoQCOM const *") org.lwjgl.vulkan.VkTileMemoryBindInfoQCOM r5) {
            r0 = r4
            r1 = r5
            long r1 = org.lwjgl.system.MemoryUtil.memAddressSafe(r1)
            nvkCmdBindTileMemoryQCOM(r0, r1)
            return
    }
}
