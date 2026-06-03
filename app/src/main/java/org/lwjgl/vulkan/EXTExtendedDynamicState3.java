package org.lwjgl.vulkan;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/EXTExtendedDynamicState3.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/EXTExtendedDynamicState3.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/EXTExtendedDynamicState3.class */
public class EXTExtendedDynamicState3 {
    public static final int VK_EXT_EXTENDED_DYNAMIC_STATE_3_SPEC_VERSION = 2;
    public static final java.lang.String VK_EXT_EXTENDED_DYNAMIC_STATE_3_EXTENSION_NAME = "VK_EXT_extended_dynamic_state3";
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_EXTENDED_DYNAMIC_STATE_3_FEATURES_EXT = 1000455000;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_EXTENDED_DYNAMIC_STATE_3_PROPERTIES_EXT = 1000455001;
    public static final int VK_DYNAMIC_STATE_TESSELLATION_DOMAIN_ORIGIN_EXT = 1000455002;
    public static final int VK_DYNAMIC_STATE_DEPTH_CLAMP_ENABLE_EXT = 1000455003;
    public static final int VK_DYNAMIC_STATE_POLYGON_MODE_EXT = 1000455004;
    public static final int VK_DYNAMIC_STATE_RASTERIZATION_SAMPLES_EXT = 1000455005;
    public static final int VK_DYNAMIC_STATE_SAMPLE_MASK_EXT = 1000455006;
    public static final int VK_DYNAMIC_STATE_ALPHA_TO_COVERAGE_ENABLE_EXT = 1000455007;
    public static final int VK_DYNAMIC_STATE_ALPHA_TO_ONE_ENABLE_EXT = 1000455008;
    public static final int VK_DYNAMIC_STATE_LOGIC_OP_ENABLE_EXT = 1000455009;
    public static final int VK_DYNAMIC_STATE_COLOR_BLEND_ENABLE_EXT = 1000455010;
    public static final int VK_DYNAMIC_STATE_COLOR_BLEND_EQUATION_EXT = 1000455011;
    public static final int VK_DYNAMIC_STATE_COLOR_WRITE_MASK_EXT = 1000455012;
    public static final int VK_DYNAMIC_STATE_RASTERIZATION_STREAM_EXT = 1000455013;
    public static final int VK_DYNAMIC_STATE_CONSERVATIVE_RASTERIZATION_MODE_EXT = 1000455014;
    public static final int VK_DYNAMIC_STATE_EXTRA_PRIMITIVE_OVERESTIMATION_SIZE_EXT = 1000455015;
    public static final int VK_DYNAMIC_STATE_DEPTH_CLIP_ENABLE_EXT = 1000455016;
    public static final int VK_DYNAMIC_STATE_SAMPLE_LOCATIONS_ENABLE_EXT = 1000455017;
    public static final int VK_DYNAMIC_STATE_COLOR_BLEND_ADVANCED_EXT = 1000455018;
    public static final int VK_DYNAMIC_STATE_PROVOKING_VERTEX_MODE_EXT = 1000455019;
    public static final int VK_DYNAMIC_STATE_LINE_RASTERIZATION_MODE_EXT = 1000455020;
    public static final int VK_DYNAMIC_STATE_LINE_STIPPLE_ENABLE_EXT = 1000455021;
    public static final int VK_DYNAMIC_STATE_DEPTH_CLIP_NEGATIVE_ONE_TO_ONE_EXT = 1000455022;
    public static final int VK_DYNAMIC_STATE_VIEWPORT_W_SCALING_ENABLE_NV = 1000455023;
    public static final int VK_DYNAMIC_STATE_VIEWPORT_SWIZZLE_NV = 1000455024;
    public static final int VK_DYNAMIC_STATE_COVERAGE_TO_COLOR_ENABLE_NV = 1000455025;
    public static final int VK_DYNAMIC_STATE_COVERAGE_TO_COLOR_LOCATION_NV = 1000455026;
    public static final int VK_DYNAMIC_STATE_COVERAGE_MODULATION_MODE_NV = 1000455027;
    public static final int VK_DYNAMIC_STATE_COVERAGE_MODULATION_TABLE_ENABLE_NV = 1000455028;
    public static final int VK_DYNAMIC_STATE_COVERAGE_MODULATION_TABLE_NV = 1000455029;
    public static final int VK_DYNAMIC_STATE_SHADING_RATE_IMAGE_ENABLE_NV = 1000455030;
    public static final int VK_DYNAMIC_STATE_REPRESENTATIVE_FRAGMENT_TEST_ENABLE_NV = 1000455031;
    public static final int VK_DYNAMIC_STATE_COVERAGE_REDUCTION_MODE_NV = 1000455032;

    protected EXTExtendedDynamicState3() {
            r3 = this;
            r0 = r3
            r0.<init>()
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r1 = r0
            r1.<init>()
            throw r0
    }

    public static void vkCmdSetTessellationDomainOriginEXT(org.lwjgl.vulkan.VkCommandBuffer r6, @org.lwjgl.system.NativeType("VkTessellationDomainOrigin") int r7) {
            r0 = r6
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkCmdSetTessellationDomainOriginEXT
            r8 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L13
            r0 = r8
            long r0 = org.lwjgl.system.Checks.check(r0)
        L13:
            r0 = r6
            long r0 = r0.address()
            r1 = r7
            r2 = r8
            org.lwjgl.system.JNI.callPV(r0, r1, r2)
            return
    }

    public static void vkCmdSetDepthClampEnableEXT(org.lwjgl.vulkan.VkCommandBuffer r6, @org.lwjgl.system.NativeType("VkBool32") boolean r7) {
            r0 = r6
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkCmdSetDepthClampEnableEXT
            r8 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L13
            r0 = r8
            long r0 = org.lwjgl.system.Checks.check(r0)
        L13:
            r0 = r6
            long r0 = r0.address()
            r1 = r7
            if (r1 == 0) goto L1f
            r1 = 1
            goto L20
        L1f:
            r1 = 0
        L20:
            r2 = r8
            org.lwjgl.system.JNI.callPV(r0, r1, r2)
            return
    }

    public static void vkCmdSetPolygonModeEXT(org.lwjgl.vulkan.VkCommandBuffer r6, @org.lwjgl.system.NativeType("VkPolygonMode") int r7) {
            r0 = r6
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkCmdSetPolygonModeEXT
            r8 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L13
            r0 = r8
            long r0 = org.lwjgl.system.Checks.check(r0)
        L13:
            r0 = r6
            long r0 = r0.address()
            r1 = r7
            r2 = r8
            org.lwjgl.system.JNI.callPV(r0, r1, r2)
            return
    }

    public static void vkCmdSetRasterizationSamplesEXT(org.lwjgl.vulkan.VkCommandBuffer r6, @org.lwjgl.system.NativeType("VkSampleCountFlagBits") int r7) {
            r0 = r6
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkCmdSetRasterizationSamplesEXT
            r8 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L13
            r0 = r8
            long r0 = org.lwjgl.system.Checks.check(r0)
        L13:
            r0 = r6
            long r0 = r0.address()
            r1 = r7
            r2 = r8
            org.lwjgl.system.JNI.callPV(r0, r1, r2)
            return
    }

    public static void nvkCmdSetSampleMaskEXT(org.lwjgl.vulkan.VkCommandBuffer r8, int r9, long r10) {
            r0 = r8
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkCmdSetSampleMaskEXT
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

    public static void vkCmdSetSampleMaskEXT(org.lwjgl.vulkan.VkCommandBuffer r5, @org.lwjgl.system.NativeType("VkSampleCountFlagBits") int r6, @org.lwjgl.system.NativeType("VkSampleMask const *") java.nio.IntBuffer r7) {
            r0 = r5
            r1 = r6
            r2 = r7
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            nvkCmdSetSampleMaskEXT(r0, r1, r2)
            return
    }

    public static void vkCmdSetAlphaToCoverageEnableEXT(org.lwjgl.vulkan.VkCommandBuffer r6, @org.lwjgl.system.NativeType("VkBool32") boolean r7) {
            r0 = r6
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkCmdSetAlphaToCoverageEnableEXT
            r8 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L13
            r0 = r8
            long r0 = org.lwjgl.system.Checks.check(r0)
        L13:
            r0 = r6
            long r0 = r0.address()
            r1 = r7
            if (r1 == 0) goto L1f
            r1 = 1
            goto L20
        L1f:
            r1 = 0
        L20:
            r2 = r8
            org.lwjgl.system.JNI.callPV(r0, r1, r2)
            return
    }

    public static void vkCmdSetAlphaToOneEnableEXT(org.lwjgl.vulkan.VkCommandBuffer r6, @org.lwjgl.system.NativeType("VkBool32") boolean r7) {
            r0 = r6
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkCmdSetAlphaToOneEnableEXT
            r8 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L13
            r0 = r8
            long r0 = org.lwjgl.system.Checks.check(r0)
        L13:
            r0 = r6
            long r0 = r0.address()
            r1 = r7
            if (r1 == 0) goto L1f
            r1 = 1
            goto L20
        L1f:
            r1 = 0
        L20:
            r2 = r8
            org.lwjgl.system.JNI.callPV(r0, r1, r2)
            return
    }

    public static void vkCmdSetLogicOpEnableEXT(org.lwjgl.vulkan.VkCommandBuffer r6, @org.lwjgl.system.NativeType("VkBool32") boolean r7) {
            r0 = r6
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkCmdSetLogicOpEnableEXT
            r8 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L13
            r0 = r8
            long r0 = org.lwjgl.system.Checks.check(r0)
        L13:
            r0 = r6
            long r0 = r0.address()
            r1 = r7
            if (r1 == 0) goto L1f
            r1 = 1
            goto L20
        L1f:
            r1 = 0
        L20:
            r2 = r8
            org.lwjgl.system.JNI.callPV(r0, r1, r2)
            return
    }

    public static void nvkCmdSetColorBlendEnableEXT(org.lwjgl.vulkan.VkCommandBuffer r9, int r10, int r11, long r12) {
            r0 = r9
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkCmdSetColorBlendEnableEXT
            r14 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L15
            r0 = r14
            long r0 = org.lwjgl.system.Checks.check(r0)
        L15:
            r0 = r9
            long r0 = r0.address()
            r1 = r10
            r2 = r11
            r3 = r12
            r4 = r14
            org.lwjgl.system.JNI.callPPV(r0, r1, r2, r3, r4)
            return
    }

    public static void vkCmdSetColorBlendEnableEXT(org.lwjgl.vulkan.VkCommandBuffer r6, @org.lwjgl.system.NativeType("uint32_t") int r7, @org.lwjgl.system.NativeType("VkBool32 const *") java.nio.IntBuffer r8) {
            r0 = r6
            r1 = r7
            r2 = r8
            int r2 = r2.remaining()
            r3 = r8
            long r3 = org.lwjgl.system.MemoryUtil.memAddress(r3)
            nvkCmdSetColorBlendEnableEXT(r0, r1, r2, r3)
            return
    }

    public static void nvkCmdSetColorBlendEquationEXT(org.lwjgl.vulkan.VkCommandBuffer r9, int r10, int r11, long r12) {
            r0 = r9
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkCmdSetColorBlendEquationEXT
            r14 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L15
            r0 = r14
            long r0 = org.lwjgl.system.Checks.check(r0)
        L15:
            r0 = r9
            long r0 = r0.address()
            r1 = r10
            r2 = r11
            r3 = r12
            r4 = r14
            org.lwjgl.system.JNI.callPPV(r0, r1, r2, r3, r4)
            return
    }

    public static void vkCmdSetColorBlendEquationEXT(org.lwjgl.vulkan.VkCommandBuffer r6, @org.lwjgl.system.NativeType("uint32_t") int r7, @org.lwjgl.system.NativeType("VkColorBlendEquationEXT const *") org.lwjgl.vulkan.VkColorBlendEquationEXT.Buffer r8) {
            r0 = r6
            r1 = r7
            r2 = r8
            int r2 = r2.remaining()
            r3 = r8
            long r3 = r3.address()
            nvkCmdSetColorBlendEquationEXT(r0, r1, r2, r3)
            return
    }

    public static void nvkCmdSetColorWriteMaskEXT(org.lwjgl.vulkan.VkCommandBuffer r9, int r10, int r11, long r12) {
            r0 = r9
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkCmdSetColorWriteMaskEXT
            r14 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L15
            r0 = r14
            long r0 = org.lwjgl.system.Checks.check(r0)
        L15:
            r0 = r9
            long r0 = r0.address()
            r1 = r10
            r2 = r11
            r3 = r12
            r4 = r14
            org.lwjgl.system.JNI.callPPV(r0, r1, r2, r3, r4)
            return
    }

    public static void vkCmdSetColorWriteMaskEXT(org.lwjgl.vulkan.VkCommandBuffer r6, @org.lwjgl.system.NativeType("uint32_t") int r7, @org.lwjgl.system.NativeType("VkColorComponentFlags const *") java.nio.IntBuffer r8) {
            r0 = r6
            r1 = r7
            r2 = r8
            int r2 = r2.remaining()
            r3 = r8
            long r3 = org.lwjgl.system.MemoryUtil.memAddress(r3)
            nvkCmdSetColorWriteMaskEXT(r0, r1, r2, r3)
            return
    }

    public static void vkCmdSetRasterizationStreamEXT(org.lwjgl.vulkan.VkCommandBuffer r6, @org.lwjgl.system.NativeType("uint32_t") int r7) {
            r0 = r6
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkCmdSetRasterizationStreamEXT
            r8 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L13
            r0 = r8
            long r0 = org.lwjgl.system.Checks.check(r0)
        L13:
            r0 = r6
            long r0 = r0.address()
            r1 = r7
            r2 = r8
            org.lwjgl.system.JNI.callPV(r0, r1, r2)
            return
    }

    public static void vkCmdSetConservativeRasterizationModeEXT(org.lwjgl.vulkan.VkCommandBuffer r6, @org.lwjgl.system.NativeType("VkConservativeRasterizationModeEXT") int r7) {
            r0 = r6
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkCmdSetConservativeRasterizationModeEXT
            r8 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L13
            r0 = r8
            long r0 = org.lwjgl.system.Checks.check(r0)
        L13:
            r0 = r6
            long r0 = r0.address()
            r1 = r7
            r2 = r8
            org.lwjgl.system.JNI.callPV(r0, r1, r2)
            return
    }

    public static void vkCmdSetExtraPrimitiveOverestimationSizeEXT(org.lwjgl.vulkan.VkCommandBuffer r6, float r7) {
            r0 = r6
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkCmdSetExtraPrimitiveOverestimationSizeEXT
            r8 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L13
            r0 = r8
            long r0 = org.lwjgl.system.Checks.check(r0)
        L13:
            r0 = r6
            long r0 = r0.address()
            r1 = r7
            r2 = r8
            org.lwjgl.system.JNI.callPV(r0, r1, r2)
            return
    }

    public static void vkCmdSetDepthClipEnableEXT(org.lwjgl.vulkan.VkCommandBuffer r6, @org.lwjgl.system.NativeType("VkBool32") boolean r7) {
            r0 = r6
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkCmdSetDepthClipEnableEXT
            r8 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L13
            r0 = r8
            long r0 = org.lwjgl.system.Checks.check(r0)
        L13:
            r0 = r6
            long r0 = r0.address()
            r1 = r7
            if (r1 == 0) goto L1f
            r1 = 1
            goto L20
        L1f:
            r1 = 0
        L20:
            r2 = r8
            org.lwjgl.system.JNI.callPV(r0, r1, r2)
            return
    }

    public static void vkCmdSetSampleLocationsEnableEXT(org.lwjgl.vulkan.VkCommandBuffer r6, @org.lwjgl.system.NativeType("VkBool32") boolean r7) {
            r0 = r6
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkCmdSetSampleLocationsEnableEXT
            r8 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L13
            r0 = r8
            long r0 = org.lwjgl.system.Checks.check(r0)
        L13:
            r0 = r6
            long r0 = r0.address()
            r1 = r7
            if (r1 == 0) goto L1f
            r1 = 1
            goto L20
        L1f:
            r1 = 0
        L20:
            r2 = r8
            org.lwjgl.system.JNI.callPV(r0, r1, r2)
            return
    }

    public static void nvkCmdSetColorBlendAdvancedEXT(org.lwjgl.vulkan.VkCommandBuffer r9, int r10, int r11, long r12) {
            r0 = r9
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkCmdSetColorBlendAdvancedEXT
            r14 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L15
            r0 = r14
            long r0 = org.lwjgl.system.Checks.check(r0)
        L15:
            r0 = r9
            long r0 = r0.address()
            r1 = r10
            r2 = r11
            r3 = r12
            r4 = r14
            org.lwjgl.system.JNI.callPPV(r0, r1, r2, r3, r4)
            return
    }

    public static void vkCmdSetColorBlendAdvancedEXT(org.lwjgl.vulkan.VkCommandBuffer r6, @org.lwjgl.system.NativeType("uint32_t") int r7, @org.lwjgl.system.NativeType("VkColorBlendAdvancedEXT const *") org.lwjgl.vulkan.VkColorBlendAdvancedEXT.Buffer r8) {
            r0 = r6
            r1 = r7
            r2 = r8
            int r2 = r2.remaining()
            r3 = r8
            long r3 = r3.address()
            nvkCmdSetColorBlendAdvancedEXT(r0, r1, r2, r3)
            return
    }

    public static void vkCmdSetProvokingVertexModeEXT(org.lwjgl.vulkan.VkCommandBuffer r6, @org.lwjgl.system.NativeType("VkProvokingVertexModeEXT") int r7) {
            r0 = r6
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkCmdSetProvokingVertexModeEXT
            r8 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L13
            r0 = r8
            long r0 = org.lwjgl.system.Checks.check(r0)
        L13:
            r0 = r6
            long r0 = r0.address()
            r1 = r7
            r2 = r8
            org.lwjgl.system.JNI.callPV(r0, r1, r2)
            return
    }

    public static void vkCmdSetLineRasterizationModeEXT(org.lwjgl.vulkan.VkCommandBuffer r6, @org.lwjgl.system.NativeType("VkLineRasterizationModeEXT") int r7) {
            r0 = r6
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkCmdSetLineRasterizationModeEXT
            r8 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L13
            r0 = r8
            long r0 = org.lwjgl.system.Checks.check(r0)
        L13:
            r0 = r6
            long r0 = r0.address()
            r1 = r7
            r2 = r8
            org.lwjgl.system.JNI.callPV(r0, r1, r2)
            return
    }

    public static void vkCmdSetLineStippleEnableEXT(org.lwjgl.vulkan.VkCommandBuffer r6, @org.lwjgl.system.NativeType("VkBool32") boolean r7) {
            r0 = r6
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkCmdSetLineStippleEnableEXT
            r8 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L13
            r0 = r8
            long r0 = org.lwjgl.system.Checks.check(r0)
        L13:
            r0 = r6
            long r0 = r0.address()
            r1 = r7
            if (r1 == 0) goto L1f
            r1 = 1
            goto L20
        L1f:
            r1 = 0
        L20:
            r2 = r8
            org.lwjgl.system.JNI.callPV(r0, r1, r2)
            return
    }

    public static void vkCmdSetDepthClipNegativeOneToOneEXT(org.lwjgl.vulkan.VkCommandBuffer r6, @org.lwjgl.system.NativeType("VkBool32") boolean r7) {
            r0 = r6
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkCmdSetDepthClipNegativeOneToOneEXT
            r8 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L13
            r0 = r8
            long r0 = org.lwjgl.system.Checks.check(r0)
        L13:
            r0 = r6
            long r0 = r0.address()
            r1 = r7
            if (r1 == 0) goto L1f
            r1 = 1
            goto L20
        L1f:
            r1 = 0
        L20:
            r2 = r8
            org.lwjgl.system.JNI.callPV(r0, r1, r2)
            return
    }

    public static void vkCmdSetViewportWScalingEnableNV(org.lwjgl.vulkan.VkCommandBuffer r6, @org.lwjgl.system.NativeType("VkBool32") boolean r7) {
            r0 = r6
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkCmdSetViewportWScalingEnableNV
            r8 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L13
            r0 = r8
            long r0 = org.lwjgl.system.Checks.check(r0)
        L13:
            r0 = r6
            long r0 = r0.address()
            r1 = r7
            if (r1 == 0) goto L1f
            r1 = 1
            goto L20
        L1f:
            r1 = 0
        L20:
            r2 = r8
            org.lwjgl.system.JNI.callPV(r0, r1, r2)
            return
    }

    public static void nvkCmdSetViewportSwizzleNV(org.lwjgl.vulkan.VkCommandBuffer r9, int r10, int r11, long r12) {
            r0 = r9
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkCmdSetViewportSwizzleNV
            r14 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L15
            r0 = r14
            long r0 = org.lwjgl.system.Checks.check(r0)
        L15:
            r0 = r9
            long r0 = r0.address()
            r1 = r10
            r2 = r11
            r3 = r12
            r4 = r14
            org.lwjgl.system.JNI.callPPV(r0, r1, r2, r3, r4)
            return
    }

    public static void vkCmdSetViewportSwizzleNV(org.lwjgl.vulkan.VkCommandBuffer r6, @org.lwjgl.system.NativeType("uint32_t") int r7, @org.lwjgl.system.NativeType("VkViewportSwizzleNV const *") org.lwjgl.vulkan.VkViewportSwizzleNV.Buffer r8) {
            r0 = r6
            r1 = r7
            r2 = r8
            int r2 = r2.remaining()
            r3 = r8
            long r3 = r3.address()
            nvkCmdSetViewportSwizzleNV(r0, r1, r2, r3)
            return
    }

    public static void vkCmdSetCoverageToColorEnableNV(org.lwjgl.vulkan.VkCommandBuffer r6, @org.lwjgl.system.NativeType("VkBool32") boolean r7) {
            r0 = r6
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkCmdSetCoverageToColorEnableNV
            r8 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L13
            r0 = r8
            long r0 = org.lwjgl.system.Checks.check(r0)
        L13:
            r0 = r6
            long r0 = r0.address()
            r1 = r7
            if (r1 == 0) goto L1f
            r1 = 1
            goto L20
        L1f:
            r1 = 0
        L20:
            r2 = r8
            org.lwjgl.system.JNI.callPV(r0, r1, r2)
            return
    }

    public static void vkCmdSetCoverageToColorLocationNV(org.lwjgl.vulkan.VkCommandBuffer r6, @org.lwjgl.system.NativeType("uint32_t") int r7) {
            r0 = r6
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkCmdSetCoverageToColorLocationNV
            r8 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L13
            r0 = r8
            long r0 = org.lwjgl.system.Checks.check(r0)
        L13:
            r0 = r6
            long r0 = r0.address()
            r1 = r7
            r2 = r8
            org.lwjgl.system.JNI.callPV(r0, r1, r2)
            return
    }

    public static void vkCmdSetCoverageModulationModeNV(org.lwjgl.vulkan.VkCommandBuffer r6, @org.lwjgl.system.NativeType("VkCoverageModulationModeNV") int r7) {
            r0 = r6
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkCmdSetCoverageModulationModeNV
            r8 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L13
            r0 = r8
            long r0 = org.lwjgl.system.Checks.check(r0)
        L13:
            r0 = r6
            long r0 = r0.address()
            r1 = r7
            r2 = r8
            org.lwjgl.system.JNI.callPV(r0, r1, r2)
            return
    }

    public static void vkCmdSetCoverageModulationTableEnableNV(org.lwjgl.vulkan.VkCommandBuffer r6, @org.lwjgl.system.NativeType("VkBool32") boolean r7) {
            r0 = r6
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkCmdSetCoverageModulationTableEnableNV
            r8 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L13
            r0 = r8
            long r0 = org.lwjgl.system.Checks.check(r0)
        L13:
            r0 = r6
            long r0 = r0.address()
            r1 = r7
            if (r1 == 0) goto L1f
            r1 = 1
            goto L20
        L1f:
            r1 = 0
        L20:
            r2 = r8
            org.lwjgl.system.JNI.callPV(r0, r1, r2)
            return
    }

    public static void nvkCmdSetCoverageModulationTableNV(org.lwjgl.vulkan.VkCommandBuffer r8, int r9, long r10) {
            r0 = r8
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkCmdSetCoverageModulationTableNV
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

    public static void vkCmdSetCoverageModulationTableNV(org.lwjgl.vulkan.VkCommandBuffer r5, @org.lwjgl.system.NativeType("float const *") java.nio.FloatBuffer r6) {
            r0 = r5
            r1 = r6
            int r1 = r1.remaining()
            r2 = r6
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            nvkCmdSetCoverageModulationTableNV(r0, r1, r2)
            return
    }

    public static void vkCmdSetShadingRateImageEnableNV(org.lwjgl.vulkan.VkCommandBuffer r6, @org.lwjgl.system.NativeType("VkBool32") boolean r7) {
            r0 = r6
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkCmdSetShadingRateImageEnableNV
            r8 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L13
            r0 = r8
            long r0 = org.lwjgl.system.Checks.check(r0)
        L13:
            r0 = r6
            long r0 = r0.address()
            r1 = r7
            if (r1 == 0) goto L1f
            r1 = 1
            goto L20
        L1f:
            r1 = 0
        L20:
            r2 = r8
            org.lwjgl.system.JNI.callPV(r0, r1, r2)
            return
    }

    public static void vkCmdSetRepresentativeFragmentTestEnableNV(org.lwjgl.vulkan.VkCommandBuffer r6, @org.lwjgl.system.NativeType("VkBool32") boolean r7) {
            r0 = r6
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkCmdSetRepresentativeFragmentTestEnableNV
            r8 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L13
            r0 = r8
            long r0 = org.lwjgl.system.Checks.check(r0)
        L13:
            r0 = r6
            long r0 = r0.address()
            r1 = r7
            if (r1 == 0) goto L1f
            r1 = 1
            goto L20
        L1f:
            r1 = 0
        L20:
            r2 = r8
            org.lwjgl.system.JNI.callPV(r0, r1, r2)
            return
    }

    public static void vkCmdSetCoverageReductionModeNV(org.lwjgl.vulkan.VkCommandBuffer r6, @org.lwjgl.system.NativeType("VkCoverageReductionModeNV") int r7) {
            r0 = r6
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkCmdSetCoverageReductionModeNV
            r8 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L13
            r0 = r8
            long r0 = org.lwjgl.system.Checks.check(r0)
        L13:
            r0 = r6
            long r0 = r0.address()
            r1 = r7
            r2 = r8
            org.lwjgl.system.JNI.callPV(r0, r1, r2)
            return
    }

    public static void vkCmdSetSampleMaskEXT(org.lwjgl.vulkan.VkCommandBuffer r7, @org.lwjgl.system.NativeType("VkSampleCountFlagBits") int r8, @org.lwjgl.system.NativeType("VkSampleMask const *") int[] r9) {
            r0 = r7
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkCmdSetSampleMaskEXT
            r10 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L13
            r0 = r10
            long r0 = org.lwjgl.system.Checks.check(r0)
        L13:
            r0 = r7
            long r0 = r0.address()
            r1 = r8
            r2 = r9
            r3 = r10
            org.lwjgl.system.JNI.callPPV(r0, r1, r2, r3)
            return
    }

    public static void vkCmdSetColorBlendEnableEXT(org.lwjgl.vulkan.VkCommandBuffer r8, @org.lwjgl.system.NativeType("uint32_t") int r9, @org.lwjgl.system.NativeType("VkBool32 const *") int[] r10) {
            r0 = r8
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkCmdSetColorBlendEnableEXT
            r11 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L13
            r0 = r11
            long r0 = org.lwjgl.system.Checks.check(r0)
        L13:
            r0 = r8
            long r0 = r0.address()
            r1 = r9
            r2 = r10
            int r2 = r2.length
            r3 = r10
            r4 = r11
            org.lwjgl.system.JNI.callPPV(r0, r1, r2, r3, r4)
            return
    }

    public static void vkCmdSetColorWriteMaskEXT(org.lwjgl.vulkan.VkCommandBuffer r8, @org.lwjgl.system.NativeType("uint32_t") int r9, @org.lwjgl.system.NativeType("VkColorComponentFlags const *") int[] r10) {
            r0 = r8
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkCmdSetColorWriteMaskEXT
            r11 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L13
            r0 = r11
            long r0 = org.lwjgl.system.Checks.check(r0)
        L13:
            r0 = r8
            long r0 = r0.address()
            r1 = r9
            r2 = r10
            int r2 = r2.length
            r3 = r10
            r4 = r11
            org.lwjgl.system.JNI.callPPV(r0, r1, r2, r3, r4)
            return
    }

    public static void vkCmdSetCoverageModulationTableNV(org.lwjgl.vulkan.VkCommandBuffer r7, @org.lwjgl.system.NativeType("float const *") float[] r8) {
            r0 = r7
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkCmdSetCoverageModulationTableNV
            r9 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L13
            r0 = r9
            long r0 = org.lwjgl.system.Checks.check(r0)
        L13:
            r0 = r7
            long r0 = r0.address()
            r1 = r8
            int r1 = r1.length
            r2 = r8
            r3 = r9
            org.lwjgl.system.JNI.callPPV(r0, r1, r2, r3)
            return
    }
}
