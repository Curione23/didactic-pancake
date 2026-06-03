package org.lwjgl.vulkan;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/KHRCopyMemoryIndirect.class */
public class KHRCopyMemoryIndirect {
    public static final int VK_KHR_COPY_MEMORY_INDIRECT_SPEC_VERSION = 1;
    public static final java.lang.String VK_KHR_COPY_MEMORY_INDIRECT_EXTENSION_NAME = "VK_KHR_copy_memory_indirect";
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_COPY_MEMORY_INDIRECT_PROPERTIES_KHR = 1000426001;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_COPY_MEMORY_INDIRECT_FEATURES_KHR = 1000549000;
    public static final int VK_STRUCTURE_TYPE_COPY_MEMORY_INDIRECT_INFO_KHR = 1000549002;
    public static final int VK_STRUCTURE_TYPE_COPY_MEMORY_TO_IMAGE_INDIRECT_INFO_KHR = 1000549003;
    public static final long VK_PIPELINE_STAGE_2_COPY_INDIRECT_BIT_KHR = 70368744177664L;
    public static final long VK_FORMAT_FEATURE_2_COPY_IMAGE_INDIRECT_DST_BIT_KHR = 576460752303423488L;
    public static final int VK_ADDRESS_COPY_DEVICE_LOCAL_BIT_KHR = 1;
    public static final int VK_ADDRESS_COPY_SPARSE_BIT_KHR = 2;
    public static final int VK_ADDRESS_COPY_PROTECTED_BIT_KHR = 4;

    protected KHRCopyMemoryIndirect() {
            r3 = this;
            r0 = r3
            r0.<init>()
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r1 = r0
            r1.<init>()
            throw r0
    }

    public static void nvkCmdCopyMemoryIndirectKHR(org.lwjgl.vulkan.VkCommandBuffer r7, long r8) {
            r0 = r7
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkCmdCopyMemoryIndirectKHR
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

    public static void vkCmdCopyMemoryIndirectKHR(org.lwjgl.vulkan.VkCommandBuffer r4, @org.lwjgl.system.NativeType("VkCopyMemoryIndirectInfoKHR const *") org.lwjgl.vulkan.VkCopyMemoryIndirectInfoKHR r5) {
            r0 = r4
            r1 = r5
            long r1 = r1.address()
            nvkCmdCopyMemoryIndirectKHR(r0, r1)
            return
    }

    public static void nvkCmdCopyMemoryToImageIndirectKHR(org.lwjgl.vulkan.VkCommandBuffer r7, long r8) {
            r0 = r7
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkCmdCopyMemoryToImageIndirectKHR
            r10 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L17
            r0 = r10
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r8
            org.lwjgl.vulkan.VkCopyMemoryToImageIndirectInfoKHR.validate(r0)
        L17:
            r0 = r7
            long r0 = r0.address()
            r1 = r8
            r2 = r10
            org.lwjgl.system.JNI.callPPV(r0, r1, r2)
            return
    }

    public static void vkCmdCopyMemoryToImageIndirectKHR(org.lwjgl.vulkan.VkCommandBuffer r4, @org.lwjgl.system.NativeType("VkCopyMemoryToImageIndirectInfoKHR const *") org.lwjgl.vulkan.VkCopyMemoryToImageIndirectInfoKHR r5) {
            r0 = r4
            r1 = r5
            long r1 = r1.address()
            nvkCmdCopyMemoryToImageIndirectKHR(r0, r1)
            return
    }
}
