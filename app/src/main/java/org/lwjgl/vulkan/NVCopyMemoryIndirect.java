package org.lwjgl.vulkan;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/NVCopyMemoryIndirect.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/NVCopyMemoryIndirect.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/NVCopyMemoryIndirect.class */
public class NVCopyMemoryIndirect {
    public static final int VK_NV_COPY_MEMORY_INDIRECT_SPEC_VERSION = 1;
    public static final java.lang.String VK_NV_COPY_MEMORY_INDIRECT_EXTENSION_NAME = "VK_NV_copy_memory_indirect";
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_COPY_MEMORY_INDIRECT_FEATURES_NV = 1000426000;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_COPY_MEMORY_INDIRECT_PROPERTIES_NV = 1000426001;

    protected NVCopyMemoryIndirect() {
            r3 = this;
            r0 = r3
            r0.<init>()
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r1 = r0
            r1.<init>()
            throw r0
    }

    public static void vkCmdCopyMemoryIndirectNV(org.lwjgl.vulkan.VkCommandBuffer r9, @org.lwjgl.system.NativeType("VkDeviceAddress") long r10, @org.lwjgl.system.NativeType("uint32_t") int r12, @org.lwjgl.system.NativeType("uint32_t") int r13) {
            r0 = r9
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkCmdCopyMemoryIndirectNV
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
            org.lwjgl.system.JNI.callPJV(r0, r1, r2, r3, r4)
            return
    }

    public static void nvkCmdCopyMemoryToImageIndirectNV(org.lwjgl.vulkan.VkCommandBuffer r14, long r15, int r17, int r18, long r19, int r21, long r22) {
            r0 = r14
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkCmdCopyMemoryToImageIndirectNV
            r24 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L15
            r0 = r24
            long r0 = org.lwjgl.system.Checks.check(r0)
        L15:
            r0 = r14
            long r0 = r0.address()
            r1 = r15
            r2 = r17
            r3 = r18
            r4 = r19
            r5 = r21
            r6 = r22
            r7 = r24
            org.lwjgl.system.JNI.callPJJPV(r0, r1, r2, r3, r4, r5, r6, r7)
            return
    }

    public static void vkCmdCopyMemoryToImageIndirectNV(org.lwjgl.vulkan.VkCommandBuffer r11, @org.lwjgl.system.NativeType("VkDeviceAddress") long r12, @org.lwjgl.system.NativeType("uint32_t") int r14, @org.lwjgl.system.NativeType("VkImage") long r15, @org.lwjgl.system.NativeType("VkImageLayout") int r17, @org.lwjgl.system.NativeType("VkImageSubresourceLayers const *") org.lwjgl.vulkan.VkImageSubresourceLayers.Buffer r18) {
            r0 = r11
            r1 = r12
            r2 = r18
            int r2 = r2.remaining()
            r3 = r14
            r4 = r15
            r5 = r17
            r6 = r18
            long r6 = r6.address()
            nvkCmdCopyMemoryToImageIndirectNV(r0, r1, r2, r3, r4, r5, r6)
            return
    }
}
