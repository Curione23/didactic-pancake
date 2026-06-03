package org.lwjgl.vulkan;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/HUAWEISubpassShading.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/HUAWEISubpassShading.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/HUAWEISubpassShading.class */
public class HUAWEISubpassShading {
    public static final int VK_HUAWEI_SUBPASS_SHADING_SPEC_VERSION = 3;
    public static final java.lang.String VK_HUAWEI_SUBPASS_SHADING_EXTENSION_NAME = "VK_HUAWEI_subpass_shading";
    public static final int VK_STRUCTURE_TYPE_SUBPASS_SHADING_PIPELINE_CREATE_INFO_HUAWEI = 1000369000;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SUBPASS_SHADING_FEATURES_HUAWEI = 1000369001;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SUBPASS_SHADING_PROPERTIES_HUAWEI = 1000369002;
    public static final int VK_PIPELINE_BIND_POINT_SUBPASS_SHADING_HUAWEI = 1000369003;
    public static final long VK_PIPELINE_STAGE_2_SUBPASS_SHADER_BIT_HUAWEI = 549755813888L;
    public static final long VK_PIPELINE_STAGE_2_SUBPASS_SHADING_BIT_HUAWEI = 549755813888L;
    public static final int VK_SHADER_STAGE_SUBPASS_SHADING_BIT_HUAWEI = 16384;

    protected HUAWEISubpassShading() {
            r3 = this;
            r0 = r3
            r0.<init>()
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r1 = r0
            r1.<init>()
            throw r0
    }

    public static int nvkGetDeviceSubpassShadingMaxWorkgroupSizeHUAWEI(org.lwjgl.vulkan.VkDevice r9, long r10, long r12) {
            r0 = r9
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkGetDeviceSubpassShadingMaxWorkgroupSizeHUAWEI
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
            int r0 = org.lwjgl.system.JNI.callPJPI(r0, r1, r2, r3)
            return r0
    }

    @org.lwjgl.system.NativeType("VkResult")
    public static int vkGetDeviceSubpassShadingMaxWorkgroupSizeHUAWEI(org.lwjgl.vulkan.VkDevice r6, @org.lwjgl.system.NativeType("VkRenderPass") long r7, @org.lwjgl.system.NativeType("VkExtent2D *") org.lwjgl.vulkan.VkExtent2D r9) {
            r0 = r6
            r1 = r7
            r2 = r9
            long r2 = r2.address()
            int r0 = nvkGetDeviceSubpassShadingMaxWorkgroupSizeHUAWEI(r0, r1, r2)
            return r0
    }

    public static void vkCmdSubpassShadingHUAWEI(org.lwjgl.vulkan.VkCommandBuffer r5) {
            r0 = r5
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkCmdSubpassShadingHUAWEI
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
