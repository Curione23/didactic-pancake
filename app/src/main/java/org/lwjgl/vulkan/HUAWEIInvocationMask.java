package org.lwjgl.vulkan;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/HUAWEIInvocationMask.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/HUAWEIInvocationMask.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/HUAWEIInvocationMask.class */
public class HUAWEIInvocationMask {
    public static final int VK_HUAWEI_INVOCATION_MASK_SPEC_VERSION = 1;
    public static final java.lang.String VK_HUAWEI_INVOCATION_MASK_EXTENSION_NAME = "VK_HUAWEI_invocation_mask";
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_INVOCATION_MASK_FEATURES_HUAWEI = 1000370000;
    public static final long VK_ACCESS_2_INVOCATION_MASK_READ_BIT_HUAWEI = 549755813888L;
    public static final int VK_IMAGE_USAGE_INVOCATION_MASK_BIT_HUAWEI = 262144;
    public static final long VK_PIPELINE_STAGE_2_INVOCATION_MASK_BIT_HUAWEI = 1099511627776L;

    protected HUAWEIInvocationMask() {
            r3 = this;
            r0 = r3
            r0.<init>()
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r1 = r0
            r1.<init>()
            throw r0
    }

    public static void vkCmdBindInvocationMaskHUAWEI(org.lwjgl.vulkan.VkCommandBuffer r8, @org.lwjgl.system.NativeType("VkImageView") long r9, @org.lwjgl.system.NativeType("VkImageLayout") int r11) {
            r0 = r8
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkCmdBindInvocationMaskHUAWEI
            r12 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L15
            r0 = r12
            long r0 = org.lwjgl.system.Checks.check(r0)
        L15:
            r0 = r8
            long r0 = r0.address()
            r1 = r9
            r2 = r11
            r3 = r12
            org.lwjgl.system.JNI.callPJV(r0, r1, r2, r3)
            return
    }
}
