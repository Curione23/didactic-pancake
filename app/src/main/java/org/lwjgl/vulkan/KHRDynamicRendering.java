package org.lwjgl.vulkan;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/KHRDynamicRendering.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/KHRDynamicRendering.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/KHRDynamicRendering.class */
public class KHRDynamicRendering {
    public static final int VK_KHR_DYNAMIC_RENDERING_SPEC_VERSION = 1;
    public static final java.lang.String VK_KHR_DYNAMIC_RENDERING_EXTENSION_NAME = "VK_KHR_dynamic_rendering";
    public static final int VK_STRUCTURE_TYPE_RENDERING_INFO_KHR = 1000044000;
    public static final int VK_STRUCTURE_TYPE_RENDERING_ATTACHMENT_INFO_KHR = 1000044001;
    public static final int VK_STRUCTURE_TYPE_PIPELINE_RENDERING_CREATE_INFO_KHR = 1000044002;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_DYNAMIC_RENDERING_FEATURES_KHR = 1000044003;
    public static final int VK_STRUCTURE_TYPE_COMMAND_BUFFER_INHERITANCE_RENDERING_INFO_KHR = 1000044004;
    public static final int VK_ATTACHMENT_STORE_OP_NONE_KHR = 1000301000;
    public static final int VK_RENDERING_CONTENTS_SECONDARY_COMMAND_BUFFERS_BIT_KHR = 1;
    public static final int VK_RENDERING_SUSPENDING_BIT_KHR = 2;
    public static final int VK_RENDERING_RESUMING_BIT_KHR = 4;
    public static final int VK_PIPELINE_CREATE_RENDERING_FRAGMENT_SHADING_RATE_ATTACHMENT_BIT_KHR = 2097152;
    public static final int VK_PIPELINE_RASTERIZATION_STATE_CREATE_FRAGMENT_SHADING_RATE_ATTACHMENT_BIT_KHR = 2097152;
    public static final int VK_STRUCTURE_TYPE_RENDERING_FRAGMENT_SHADING_RATE_ATTACHMENT_INFO_KHR = 1000044006;
    public static final int VK_PIPELINE_CREATE_RENDERING_FRAGMENT_DENSITY_MAP_ATTACHMENT_BIT_EXT = 4194304;
    public static final int VK_PIPELINE_RASTERIZATION_STATE_CREATE_FRAGMENT_DENSITY_MAP_ATTACHMENT_BIT_EXT = 4194304;
    public static final int VK_STRUCTURE_TYPE_RENDERING_FRAGMENT_DENSITY_MAP_ATTACHMENT_INFO_EXT = 1000044007;
    public static final int VK_STRUCTURE_TYPE_ATTACHMENT_SAMPLE_COUNT_INFO_AMD = 1000044008;
    public static final int VK_STRUCTURE_TYPE_ATTACHMENT_SAMPLE_COUNT_INFO_NV = 1000044008;
    public static final int VK_STRUCTURE_TYPE_MULTIVIEW_PER_VIEW_ATTRIBUTES_INFO_NVX = 1000044009;

    protected KHRDynamicRendering() {
            r3 = this;
            r0 = r3
            r0.<init>()
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r1 = r0
            r1.<init>()
            throw r0
    }

    public static void nvkCmdBeginRenderingKHR(org.lwjgl.vulkan.VkCommandBuffer r7, long r8) {
            r0 = r7
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkCmdBeginRenderingKHR
            r10 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L17
            r0 = r10
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r8
            org.lwjgl.vulkan.VkRenderingInfo.validate(r0)
        L17:
            r0 = r7
            long r0 = r0.address()
            r1 = r8
            r2 = r10
            org.lwjgl.system.JNI.callPPV(r0, r1, r2)
            return
    }

    public static void vkCmdBeginRenderingKHR(org.lwjgl.vulkan.VkCommandBuffer r4, @org.lwjgl.system.NativeType("VkRenderingInfo const *") org.lwjgl.vulkan.VkRenderingInfo r5) {
            r0 = r4
            r1 = r5
            long r1 = r1.address()
            nvkCmdBeginRenderingKHR(r0, r1)
            return
    }

    public static void vkCmdEndRenderingKHR(org.lwjgl.vulkan.VkCommandBuffer r5) {
            r0 = r5
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkCmdEndRenderingKHR
            r6 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L13
            r0 = r6
            long r0 = org.lwjgl.system.Checks.check(r0)
        L13:
            r0 = r5
            long r0 = r0.address()
            r1 = r6
            org.lwjgl.system.JNI.callPV(r0, r1)
            return
    }
}
