package org.lwjgl.vulkan;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/KHRDynamicRenderingLocalRead.class */
public class KHRDynamicRenderingLocalRead {
    public static final int VK_KHR_DYNAMIC_RENDERING_LOCAL_READ_SPEC_VERSION = 1;
    public static final java.lang.String VK_KHR_DYNAMIC_RENDERING_LOCAL_READ_EXTENSION_NAME = "VK_KHR_dynamic_rendering_local_read";
    public static final int VK_IMAGE_LAYOUT_RENDERING_LOCAL_READ_KHR = 1000232000;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_DYNAMIC_RENDERING_LOCAL_READ_FEATURES_KHR = 1000232000;
    public static final int VK_STRUCTURE_TYPE_RENDERING_ATTACHMENT_LOCATION_INFO_KHR = 1000232001;
    public static final int VK_STRUCTURE_TYPE_RENDERING_INPUT_ATTACHMENT_INDEX_INFO_KHR = 1000232002;

    protected KHRDynamicRenderingLocalRead() {
            r3 = this;
            r0 = r3
            r0.<init>()
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r1 = r0
            r1.<init>()
            throw r0
    }

    public static void nvkCmdSetRenderingAttachmentLocationsKHR(org.lwjgl.vulkan.VkCommandBuffer r7, long r8) {
            r0 = r7
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkCmdSetRenderingAttachmentLocationsKHR
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

    public static void vkCmdSetRenderingAttachmentLocationsKHR(org.lwjgl.vulkan.VkCommandBuffer r4, @org.lwjgl.system.NativeType("VkRenderingAttachmentLocationInfo const *") org.lwjgl.vulkan.VkRenderingAttachmentLocationInfo r5) {
            r0 = r4
            r1 = r5
            long r1 = r1.address()
            nvkCmdSetRenderingAttachmentLocationsKHR(r0, r1)
            return
    }

    public static void nvkCmdSetRenderingInputAttachmentIndicesKHR(org.lwjgl.vulkan.VkCommandBuffer r7, long r8) {
            r0 = r7
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkCmdSetRenderingInputAttachmentIndicesKHR
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

    public static void vkCmdSetRenderingInputAttachmentIndicesKHR(org.lwjgl.vulkan.VkCommandBuffer r4, @org.lwjgl.system.NativeType("VkRenderingInputAttachmentIndexInfo const *") org.lwjgl.vulkan.VkRenderingInputAttachmentIndexInfo r5) {
            r0 = r4
            r1 = r5
            long r1 = r1.address()
            nvkCmdSetRenderingInputAttachmentIndicesKHR(r0, r1)
            return
    }
}
