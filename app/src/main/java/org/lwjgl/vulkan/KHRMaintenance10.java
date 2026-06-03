package org.lwjgl.vulkan;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/KHRMaintenance10.class */
public class KHRMaintenance10 {
    public static final int VK_KHR_MAINTENANCE_10_SPEC_VERSION = 1;
    public static final java.lang.String VK_KHR_MAINTENANCE_10_EXTENSION_NAME = "VK_KHR_maintenance10";
    public static final int VK_STRUCTURE_TYPE_RENDERING_END_INFO_KHR = 1000619003;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_MAINTENANCE_10_FEATURES_KHR = 1000630000;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_MAINTENANCE_10_PROPERTIES_KHR = 1000630001;
    public static final int VK_STRUCTURE_TYPE_RENDERING_ATTACHMENT_FLAGS_INFO_KHR = 1000630002;
    public static final int VK_STRUCTURE_TYPE_RESOLVE_IMAGE_MODE_INFO_KHR = 1000630004;
    public static final int VK_ATTACHMENT_DESCRIPTION_RESOLVE_SKIP_TRANSFER_FUNCTION_BIT_KHR = 2;
    public static final int VK_ATTACHMENT_DESCRIPTION_RESOLVE_ENABLE_TRANSFER_FUNCTION_BIT_KHR = 4;
    public static final int VK_RENDERING_LOCAL_READ_CONCURRENT_ACCESS_CONTROL_BIT_KHR = 256;
    public static final int VK_RENDERING_ATTACHMENT_INPUT_ATTACHMENT_FEEDBACK_BIT_KHR = 1;
    public static final int VK_RENDERING_ATTACHMENT_RESOLVE_SKIP_TRANSFER_FUNCTION_BIT_KHR = 2;
    public static final int VK_RENDERING_ATTACHMENT_RESOLVE_ENABLE_TRANSFER_FUNCTION_BIT_KHR = 4;
    public static final long VK_FORMAT_FEATURE_2_DEPTH_COPY_ON_COMPUTE_QUEUE_BIT_KHR = 4503599627370496L;
    public static final long VK_FORMAT_FEATURE_2_DEPTH_COPY_ON_TRANSFER_QUEUE_BIT_KHR = 9007199254740992L;
    public static final long VK_FORMAT_FEATURE_2_STENCIL_COPY_ON_COMPUTE_QUEUE_BIT_KHR = 18014398509481984L;
    public static final long VK_FORMAT_FEATURE_2_STENCIL_COPY_ON_TRANSFER_QUEUE_BIT_KHR = 36028797018963968L;
    public static final int VK_RESOLVE_IMAGE_SKIP_TRANSFER_FUNCTION_BIT_KHR = 1;
    public static final int VK_RESOLVE_IMAGE_ENABLE_TRANSFER_FUNCTION_BIT_KHR = 2;

    protected KHRMaintenance10() {
            r3 = this;
            r0 = r3
            r0.<init>()
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r1 = r0
            r1.<init>()
            throw r0
    }

    public static void nvkCmdEndRendering2KHR(org.lwjgl.vulkan.VkCommandBuffer r7, long r8) {
            r0 = r7
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkCmdEndRendering2KHR
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

    public static void vkCmdEndRendering2KHR(org.lwjgl.vulkan.VkCommandBuffer r4, @org.lwjgl.system.NativeType("VkRenderingEndInfoKHR const *") org.lwjgl.vulkan.VkRenderingEndInfoKHR r5) {
            r0 = r4
            r1 = r5
            long r1 = org.lwjgl.system.MemoryUtil.memAddressSafe(r1)
            nvkCmdEndRendering2KHR(r0, r1)
            return
    }
}
