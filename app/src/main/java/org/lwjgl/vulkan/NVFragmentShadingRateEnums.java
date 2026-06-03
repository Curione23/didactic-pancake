package org.lwjgl.vulkan;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/NVFragmentShadingRateEnums.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/NVFragmentShadingRateEnums.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/NVFragmentShadingRateEnums.class */
public class NVFragmentShadingRateEnums {
    public static final int VK_NV_FRAGMENT_SHADING_RATE_ENUMS_SPEC_VERSION = 1;
    public static final java.lang.String VK_NV_FRAGMENT_SHADING_RATE_ENUMS_EXTENSION_NAME = "VK_NV_fragment_shading_rate_enums";
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_FRAGMENT_SHADING_RATE_ENUMS_PROPERTIES_NV = 1000326000;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_FRAGMENT_SHADING_RATE_ENUMS_FEATURES_NV = 1000326001;
    public static final int VK_STRUCTURE_TYPE_PIPELINE_FRAGMENT_SHADING_RATE_ENUM_STATE_CREATE_INFO_NV = 1000326002;
    public static final int VK_FRAGMENT_SHADING_RATE_TYPE_FRAGMENT_SIZE_NV = 0;
    public static final int VK_FRAGMENT_SHADING_RATE_TYPE_ENUMS_NV = 1;
    public static final int VK_FRAGMENT_SHADING_RATE_1_INVOCATION_PER_PIXEL_NV = 0;
    public static final int VK_FRAGMENT_SHADING_RATE_1_INVOCATION_PER_1X2_PIXELS_NV = 1;
    public static final int VK_FRAGMENT_SHADING_RATE_1_INVOCATION_PER_2X1_PIXELS_NV = 4;
    public static final int VK_FRAGMENT_SHADING_RATE_1_INVOCATION_PER_2X2_PIXELS_NV = 5;
    public static final int VK_FRAGMENT_SHADING_RATE_1_INVOCATION_PER_2X4_PIXELS_NV = 6;
    public static final int VK_FRAGMENT_SHADING_RATE_1_INVOCATION_PER_4X2_PIXELS_NV = 9;
    public static final int VK_FRAGMENT_SHADING_RATE_1_INVOCATION_PER_4X4_PIXELS_NV = 10;
    public static final int VK_FRAGMENT_SHADING_RATE_2_INVOCATIONS_PER_PIXEL_NV = 11;
    public static final int VK_FRAGMENT_SHADING_RATE_4_INVOCATIONS_PER_PIXEL_NV = 12;
    public static final int VK_FRAGMENT_SHADING_RATE_8_INVOCATIONS_PER_PIXEL_NV = 13;
    public static final int VK_FRAGMENT_SHADING_RATE_16_INVOCATIONS_PER_PIXEL_NV = 14;
    public static final int VK_FRAGMENT_SHADING_RATE_NO_INVOCATIONS_NV = 15;

    protected NVFragmentShadingRateEnums() {
            r3 = this;
            r0 = r3
            r0.<init>()
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r1 = r0
            r1.<init>()
            throw r0
    }

    public static void nvkCmdSetFragmentShadingRateEnumNV(org.lwjgl.vulkan.VkCommandBuffer r8, int r9, long r10) {
            r0 = r8
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkCmdSetFragmentShadingRateEnumNV
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

    public static void vkCmdSetFragmentShadingRateEnumNV(org.lwjgl.vulkan.VkCommandBuffer r5, @org.lwjgl.system.NativeType("VkFragmentShadingRateNV") int r6, @org.lwjgl.system.NativeType("VkFragmentShadingRateCombinerOpKHR const *") java.nio.IntBuffer r7) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r7
            r1 = 2
            org.lwjgl.system.Checks.check(r0, r1)
        Lb:
            r0 = r5
            r1 = r6
            r2 = r7
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            nvkCmdSetFragmentShadingRateEnumNV(r0, r1, r2)
            return
    }

    public static void vkCmdSetFragmentShadingRateEnumNV(org.lwjgl.vulkan.VkCommandBuffer r7, @org.lwjgl.system.NativeType("VkFragmentShadingRateNV") int r8, @org.lwjgl.system.NativeType("VkFragmentShadingRateCombinerOpKHR const *") int[] r9) {
            r0 = r7
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkCmdSetFragmentShadingRateEnumNV
            r10 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L18
            r0 = r10
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r9
            r1 = 2
            org.lwjgl.system.Checks.check(r0, r1)
        L18:
            r0 = r7
            long r0 = r0.address()
            r1 = r8
            r2 = r9
            r3 = r10
            org.lwjgl.system.JNI.callPPV(r0, r1, r2, r3)
            return
    }
}
