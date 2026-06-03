package org.lwjgl.vulkan;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/NVShadingRateImage.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/NVShadingRateImage.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/NVShadingRateImage.class */
public class NVShadingRateImage {
    public static final int VK_NV_SHADING_RATE_IMAGE_SPEC_VERSION = 3;
    public static final java.lang.String VK_NV_SHADING_RATE_IMAGE_EXTENSION_NAME = "VK_NV_shading_rate_image";
    public static final int VK_STRUCTURE_TYPE_PIPELINE_VIEWPORT_SHADING_RATE_IMAGE_STATE_CREATE_INFO_NV = 1000164000;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADING_RATE_IMAGE_FEATURES_NV = 1000164001;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADING_RATE_IMAGE_PROPERTIES_NV = 1000164002;
    public static final int VK_STRUCTURE_TYPE_PIPELINE_VIEWPORT_COARSE_SAMPLE_ORDER_STATE_CREATE_INFO_NV = 1000164005;
    public static final int VK_IMAGE_LAYOUT_SHADING_RATE_OPTIMAL_NV = 1000164003;
    public static final int VK_DYNAMIC_STATE_VIEWPORT_SHADING_RATE_PALETTE_NV = 1000164004;
    public static final int VK_DYNAMIC_STATE_VIEWPORT_COARSE_SAMPLE_ORDER_NV = 1000164006;
    public static final int VK_ACCESS_SHADING_RATE_IMAGE_READ_BIT_NV = 8388608;
    public static final int VK_IMAGE_USAGE_SHADING_RATE_IMAGE_BIT_NV = 256;
    public static final int VK_PIPELINE_STAGE_SHADING_RATE_IMAGE_BIT_NV = 4194304;
    public static final int VK_SHADING_RATE_PALETTE_ENTRY_NO_INVOCATIONS_NV = 0;
    public static final int VK_SHADING_RATE_PALETTE_ENTRY_16_INVOCATIONS_PER_PIXEL_NV = 1;
    public static final int VK_SHADING_RATE_PALETTE_ENTRY_8_INVOCATIONS_PER_PIXEL_NV = 2;
    public static final int VK_SHADING_RATE_PALETTE_ENTRY_4_INVOCATIONS_PER_PIXEL_NV = 3;
    public static final int VK_SHADING_RATE_PALETTE_ENTRY_2_INVOCATIONS_PER_PIXEL_NV = 4;
    public static final int VK_SHADING_RATE_PALETTE_ENTRY_1_INVOCATION_PER_PIXEL_NV = 5;
    public static final int VK_SHADING_RATE_PALETTE_ENTRY_1_INVOCATION_PER_2X1_PIXELS_NV = 6;
    public static final int VK_SHADING_RATE_PALETTE_ENTRY_1_INVOCATION_PER_1X2_PIXELS_NV = 7;
    public static final int VK_SHADING_RATE_PALETTE_ENTRY_1_INVOCATION_PER_2X2_PIXELS_NV = 8;
    public static final int VK_SHADING_RATE_PALETTE_ENTRY_1_INVOCATION_PER_4X2_PIXELS_NV = 9;
    public static final int VK_SHADING_RATE_PALETTE_ENTRY_1_INVOCATION_PER_2X4_PIXELS_NV = 10;
    public static final int VK_SHADING_RATE_PALETTE_ENTRY_1_INVOCATION_PER_4X4_PIXELS_NV = 11;
    public static final int VK_COARSE_SAMPLE_ORDER_TYPE_DEFAULT_NV = 0;
    public static final int VK_COARSE_SAMPLE_ORDER_TYPE_CUSTOM_NV = 1;
    public static final int VK_COARSE_SAMPLE_ORDER_TYPE_PIXEL_MAJOR_NV = 2;
    public static final int VK_COARSE_SAMPLE_ORDER_TYPE_SAMPLE_MAJOR_NV = 3;

    protected NVShadingRateImage() {
            r3 = this;
            r0 = r3
            r0.<init>()
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r1 = r0
            r1.<init>()
            throw r0
    }

    public static void vkCmdBindShadingRateImageNV(org.lwjgl.vulkan.VkCommandBuffer r8, @org.lwjgl.system.NativeType("VkImageView") long r9, @org.lwjgl.system.NativeType("VkImageLayout") int r11) {
            r0 = r8
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkCmdBindShadingRateImageNV
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

    public static void nvkCmdSetViewportShadingRatePaletteNV(org.lwjgl.vulkan.VkCommandBuffer r9, int r10, int r11, long r12) {
            r0 = r9
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkCmdSetViewportShadingRatePaletteNV
            r14 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L22
            r0 = r14
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r12
            r1 = r11
            int r2 = org.lwjgl.vulkan.VkShadingRatePaletteNV.SIZEOF
            void r3 = org.lwjgl.vulkan.VkShadingRatePaletteNV::validate
            org.lwjgl.system.Struct.validate(r0, r1, r2, r3)
        L22:
            r0 = r9
            long r0 = r0.address()
            r1 = r10
            r2 = r11
            r3 = r12
            r4 = r14
            org.lwjgl.system.JNI.callPPV(r0, r1, r2, r3, r4)
            return
    }

    public static void vkCmdSetViewportShadingRatePaletteNV(org.lwjgl.vulkan.VkCommandBuffer r6, @org.lwjgl.system.NativeType("uint32_t") int r7, @org.lwjgl.system.NativeType("VkShadingRatePaletteNV const *") org.lwjgl.vulkan.VkShadingRatePaletteNV.Buffer r8) {
            r0 = r6
            r1 = r7
            r2 = r8
            int r2 = r2.remaining()
            r3 = r8
            long r3 = r3.address()
            nvkCmdSetViewportShadingRatePaletteNV(r0, r1, r2, r3)
            return
    }

    public static void nvkCmdSetCoarseSampleOrderNV(org.lwjgl.vulkan.VkCommandBuffer r9, int r10, int r11, long r12) {
            r0 = r9
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkCmdSetCoarseSampleOrderNV
            r14 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L28
            r0 = r14
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r12
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto L28
            r0 = r12
            r1 = r11
            int r2 = org.lwjgl.vulkan.VkCoarseSampleOrderCustomNV.SIZEOF
            void r3 = org.lwjgl.vulkan.VkCoarseSampleOrderCustomNV::validate
            org.lwjgl.system.Struct.validate(r0, r1, r2, r3)
        L28:
            r0 = r9
            long r0 = r0.address()
            r1 = r10
            r2 = r11
            r3 = r12
            r4 = r14
            org.lwjgl.system.JNI.callPPV(r0, r1, r2, r3, r4)
            return
    }

    public static void vkCmdSetCoarseSampleOrderNV(org.lwjgl.vulkan.VkCommandBuffer r6, @org.lwjgl.system.NativeType("VkCoarseSampleOrderTypeNV") int r7, @javax.annotation.Nullable @org.lwjgl.system.NativeType("VkCoarseSampleOrderCustomNV const *") org.lwjgl.vulkan.VkCoarseSampleOrderCustomNV.Buffer r8) {
            r0 = r6
            r1 = r7
            r2 = r8
            int r2 = org.lwjgl.system.Checks.remainingSafe(r2)
            r3 = r8
            long r3 = org.lwjgl.system.MemoryUtil.memAddressSafe(r3)
            nvkCmdSetCoarseSampleOrderNV(r0, r1, r2, r3)
            return
    }
}
