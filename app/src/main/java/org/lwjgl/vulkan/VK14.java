package org.lwjgl.vulkan;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VK14.class */
public class VK14 extends org.lwjgl.vulkan.VK13 {
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_VULKAN_1_4_FEATURES = 55;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_VULKAN_1_4_PROPERTIES = 56;
    public static final int VK_STRUCTURE_TYPE_PIPELINE_ROBUSTNESS_CREATE_INFO = 1000068000;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_PIPELINE_ROBUSTNESS_FEATURES = 1000068001;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_PIPELINE_ROBUSTNESS_PROPERTIES = 1000068002;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_PUSH_DESCRIPTOR_PROPERTIES = 1000080000;
    public static final int VK_STRUCTURE_TYPE_DEVICE_QUEUE_GLOBAL_PRIORITY_CREATE_INFO = 1000174000;
    public static final int VK_STRUCTURE_TYPE_PIPELINE_VERTEX_INPUT_DIVISOR_STATE_CREATE_INFO = 1000190001;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_VERTEX_ATTRIBUTE_DIVISOR_FEATURES = 1000190002;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_DYNAMIC_RENDERING_LOCAL_READ_FEATURES = 1000232000;
    public static final int VK_STRUCTURE_TYPE_RENDERING_ATTACHMENT_LOCATION_INFO = 1000232001;
    public static final int VK_STRUCTURE_TYPE_RENDERING_INPUT_ATTACHMENT_INDEX_INFO = 1000232002;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_LINE_RASTERIZATION_FEATURES = 1000259000;
    public static final int VK_STRUCTURE_TYPE_PIPELINE_RASTERIZATION_LINE_STATE_CREATE_INFO = 1000259001;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_LINE_RASTERIZATION_PROPERTIES = 1000259002;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_INDEX_TYPE_UINT8_FEATURES = 1000265000;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_HOST_IMAGE_COPY_FEATURES = 1000270000;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_HOST_IMAGE_COPY_PROPERTIES = 1000270001;
    public static final int VK_STRUCTURE_TYPE_MEMORY_TO_IMAGE_COPY = 1000270002;
    public static final int VK_STRUCTURE_TYPE_IMAGE_TO_MEMORY_COPY = 1000270003;
    public static final int VK_STRUCTURE_TYPE_COPY_IMAGE_TO_MEMORY_INFO = 1000270004;
    public static final int VK_STRUCTURE_TYPE_COPY_MEMORY_TO_IMAGE_INFO = 1000270005;
    public static final int VK_STRUCTURE_TYPE_HOST_IMAGE_LAYOUT_TRANSITION_INFO = 1000270006;
    public static final int VK_STRUCTURE_TYPE_COPY_IMAGE_TO_IMAGE_INFO = 1000270007;
    public static final int VK_STRUCTURE_TYPE_SUBRESOURCE_HOST_MEMCPY_SIZE = 1000270008;
    public static final int VK_STRUCTURE_TYPE_HOST_IMAGE_COPY_DEVICE_PERFORMANCE_QUERY = 1000270009;
    public static final int VK_STRUCTURE_TYPE_MEMORY_MAP_INFO = 1000271000;
    public static final int VK_STRUCTURE_TYPE_MEMORY_UNMAP_INFO = 1000271001;
    public static final int VK_STRUCTURE_TYPE_SUBRESOURCE_LAYOUT_2 = 1000338002;
    public static final int VK_STRUCTURE_TYPE_IMAGE_SUBRESOURCE_2 = 1000338003;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_GLOBAL_PRIORITY_QUERY_FEATURES = 1000388000;
    public static final int VK_STRUCTURE_TYPE_QUEUE_FAMILY_GLOBAL_PRIORITY_PROPERTIES = 1000388001;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_SUBGROUP_ROTATE_FEATURES = 1000416000;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_PIPELINE_PROTECTED_ACCESS_FEATURES = 1000466000;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_MAINTENANCE_5_FEATURES = 1000470000;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_MAINTENANCE_5_PROPERTIES = 1000470001;
    public static final int VK_STRUCTURE_TYPE_RENDERING_AREA_INFO = 1000470003;
    public static final int VK_STRUCTURE_TYPE_DEVICE_IMAGE_SUBRESOURCE_INFO = 1000470004;
    public static final int VK_STRUCTURE_TYPE_PIPELINE_CREATE_FLAGS_2_CREATE_INFO = 1000470005;
    public static final int VK_STRUCTURE_TYPE_BUFFER_USAGE_FLAGS_2_CREATE_INFO = 1000470006;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_VERTEX_ATTRIBUTE_DIVISOR_PROPERTIES = 1000525000;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_FLOAT_CONTROLS_2_FEATURES = 1000528000;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_EXPECT_ASSUME_FEATURES = 1000544000;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_MAINTENANCE_6_FEATURES = 1000545000;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_MAINTENANCE_6_PROPERTIES = 1000545001;
    public static final int VK_STRUCTURE_TYPE_BIND_MEMORY_STATUS = 1000545002;
    public static final int VK_STRUCTURE_TYPE_BIND_DESCRIPTOR_SETS_INFO = 1000545003;
    public static final int VK_STRUCTURE_TYPE_PUSH_CONSTANTS_INFO = 1000545004;
    public static final int VK_STRUCTURE_TYPE_PUSH_DESCRIPTOR_SET_INFO = 1000545005;
    public static final int VK_STRUCTURE_TYPE_PUSH_DESCRIPTOR_SET_WITH_TEMPLATE_INFO = 1000545006;
    public static final int VK_ERROR_NOT_PERMITTED = -1000174001;
    public static final int VK_INDEX_TYPE_UINT8 = 1000265000;
    public static final int VK_FORMAT_A1B5G5R5_UNORM_PACK16 = 1000470000;
    public static final int VK_FORMAT_A8_UNORM = 1000470001;
    public static final long VK_BUFFER_USAGE_2_TRANSFER_SRC_BIT = 1;
    public static final long VK_BUFFER_USAGE_2_TRANSFER_DST_BIT = 2;
    public static final long VK_BUFFER_USAGE_2_UNIFORM_TEXEL_BUFFER_BIT = 4;
    public static final long VK_BUFFER_USAGE_2_STORAGE_TEXEL_BUFFER_BIT = 8;
    public static final long VK_BUFFER_USAGE_2_UNIFORM_BUFFER_BIT = 16;
    public static final long VK_BUFFER_USAGE_2_STORAGE_BUFFER_BIT = 32;
    public static final long VK_BUFFER_USAGE_2_INDEX_BUFFER_BIT = 64;
    public static final long VK_BUFFER_USAGE_2_VERTEX_BUFFER_BIT = 128;
    public static final long VK_BUFFER_USAGE_2_INDIRECT_BUFFER_BIT = 256;
    public static final long VK_BUFFER_USAGE_2_SHADER_DEVICE_ADDRESS_BIT = 131072;
    public static final int VK_IMAGE_USAGE_HOST_TRANSFER_BIT = 4194304;
    public static final long VK_FORMAT_FEATURE_2_HOST_IMAGE_TRANSFER_BIT = 70368744177664L;
    public static final int VK_SUBGROUP_FEATURE_ROTATE_BIT = 512;
    public static final int VK_SUBGROUP_FEATURE_ROTATE_CLUSTERED_BIT = 1024;
    public static final int VK_DESCRIPTOR_SET_LAYOUT_CREATE_PUSH_DESCRIPTOR_BIT = 1;
    public static final int VK_DESCRIPTOR_UPDATE_TEMPLATE_TYPE_PUSH_DESCRIPTORS = 1;
    public static final int VK_PIPELINE_CREATE_NO_PROTECTED_ACCESS_BIT = 134217728;
    public static final int VK_PIPELINE_CREATE_PROTECTED_ACCESS_ONLY_BIT = 1073741824;
    public static final int VK_ATTACHMENT_LOAD_OP_NONE = 1000400000;
    public static final int VK_DYNAMIC_STATE_LINE_STIPPLE = 1000259000;
    public static final int VK_IMAGE_LAYOUT_RENDERING_LOCAL_READ = 1000232000;
    public static final int VK_PIPELINE_ROBUSTNESS_BUFFER_BEHAVIOR_DEVICE_DEFAULT = 0;
    public static final int VK_PIPELINE_ROBUSTNESS_BUFFER_BEHAVIOR_DISABLED = 1;
    public static final int VK_PIPELINE_ROBUSTNESS_BUFFER_BEHAVIOR_ROBUST_BUFFER_ACCESS = 2;
    public static final int VK_PIPELINE_ROBUSTNESS_BUFFER_BEHAVIOR_ROBUST_BUFFER_ACCESS_2 = 3;
    public static final int VK_PIPELINE_ROBUSTNESS_IMAGE_BEHAVIOR_DEVICE_DEFAULT = 0;
    public static final int VK_PIPELINE_ROBUSTNESS_IMAGE_BEHAVIOR_DISABLED = 1;
    public static final int VK_PIPELINE_ROBUSTNESS_IMAGE_BEHAVIOR_ROBUST_IMAGE_ACCESS = 2;
    public static final int VK_PIPELINE_ROBUSTNESS_IMAGE_BEHAVIOR_ROBUST_IMAGE_ACCESS_2 = 3;
    public static final int VK_QUEUE_GLOBAL_PRIORITY_LOW = 128;
    public static final int VK_QUEUE_GLOBAL_PRIORITY_MEDIUM = 256;
    public static final int VK_QUEUE_GLOBAL_PRIORITY_HIGH = 512;
    public static final int VK_QUEUE_GLOBAL_PRIORITY_REALTIME = 1024;
    public static final int VK_HOST_IMAGE_COPY_MEMCPY_BIT = 1;
    public static final int VK_HOST_IMAGE_COPY_MEMCPY = 1;
    public static final long VK_PIPELINE_CREATE_2_DISABLE_OPTIMIZATION_BIT = 1;
    public static final long VK_PIPELINE_CREATE_2_ALLOW_DERIVATIVES_BIT = 2;
    public static final long VK_PIPELINE_CREATE_2_DERIVATIVE_BIT = 4;
    public static final long VK_PIPELINE_CREATE_2_VIEW_INDEX_FROM_DEVICE_INDEX_BIT = 8;
    public static final long VK_PIPELINE_CREATE_2_DISPATCH_BASE_BIT = 16;
    public static final long VK_PIPELINE_CREATE_2_FAIL_ON_PIPELINE_COMPILE_REQUIRED_BIT = 256;
    public static final long VK_PIPELINE_CREATE_2_EARLY_RETURN_ON_FAILURE_BIT = 512;
    public static final long VK_PIPELINE_CREATE_2_NO_PROTECTED_ACCESS_BIT = 134217728;
    public static final long VK_PIPELINE_CREATE_2_PROTECTED_ACCESS_ONLY_BIT = 1073741824;
    public static final int VK_LINE_RASTERIZATION_MODE_DEFAULT = 0;
    public static final int VK_LINE_RASTERIZATION_MODE_RECTANGULAR = 1;
    public static final int VK_LINE_RASTERIZATION_MODE_BRESENHAM = 2;
    public static final int VK_LINE_RASTERIZATION_MODE_RECTANGULAR_SMOOTH = 3;
    public static final int VK_API_VERSION_1_4 = 0;
    public static final int VK_MAX_GLOBAL_PRIORITY_SIZE = 16;

    protected VK14() {
            r3 = this;
            r0 = r3
            r0.<init>()
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r1 = r0
            r1.<init>()
            throw r0
    }

    public static int nvkMapMemory2(org.lwjgl.vulkan.VkDevice r9, long r10, long r12) {
            r0 = r9
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkMapMemory2
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
            int r0 = org.lwjgl.system.JNI.callPPPI(r0, r1, r2, r3)
            return r0
    }

    @org.lwjgl.system.NativeType("VkResult")
    public static int vkMapMemory2(org.lwjgl.vulkan.VkDevice r6, @org.lwjgl.system.NativeType("VkMemoryMapInfo const *") org.lwjgl.vulkan.VkMemoryMapInfo r7, @org.lwjgl.system.NativeType("void **") org.lwjgl.PointerBuffer r8) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r8
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
        Lb:
            r0 = r6
            r1 = r7
            long r1 = r1.address()
            r2 = r8
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            int r0 = nvkMapMemory2(r0, r1, r2)
            return r0
    }

    public static int nvkUnmapMemory2(org.lwjgl.vulkan.VkDevice r7, long r8) {
            r0 = r7
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkUnmapMemory2
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
            int r0 = org.lwjgl.system.JNI.callPPI(r0, r1, r2)
            return r0
    }

    @org.lwjgl.system.NativeType("VkResult")
    public static int vkUnmapMemory2(org.lwjgl.vulkan.VkDevice r4, @org.lwjgl.system.NativeType("VkMemoryUnmapInfo const *") org.lwjgl.vulkan.VkMemoryUnmapInfo r5) {
            r0 = r4
            r1 = r5
            long r1 = r1.address()
            int r0 = nvkUnmapMemory2(r0, r1)
            return r0
    }

    public static void nvkGetDeviceImageSubresourceLayout(org.lwjgl.vulkan.VkDevice r9, long r10, long r12) {
            r0 = r9
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkGetDeviceImageSubresourceLayout
            r14 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L19
            r0 = r14
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r10
            org.lwjgl.vulkan.VkDeviceImageSubresourceInfo.validate(r0)
        L19:
            r0 = r9
            long r0 = r0.address()
            r1 = r10
            r2 = r12
            r3 = r14
            org.lwjgl.system.JNI.callPPPV(r0, r1, r2, r3)
            return
    }

    public static void vkGetDeviceImageSubresourceLayout(org.lwjgl.vulkan.VkDevice r6, @org.lwjgl.system.NativeType("VkDeviceImageSubresourceInfo const *") org.lwjgl.vulkan.VkDeviceImageSubresourceInfo r7, @org.lwjgl.system.NativeType("VkSubresourceLayout2 *") org.lwjgl.vulkan.VkSubresourceLayout2 r8) {
            r0 = r6
            r1 = r7
            long r1 = r1.address()
            r2 = r8
            long r2 = r2.address()
            nvkGetDeviceImageSubresourceLayout(r0, r1, r2)
            return
    }

    public static void nvkGetImageSubresourceLayout2(org.lwjgl.vulkan.VkDevice r11, long r12, long r14, long r16) {
            r0 = r11
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkGetImageSubresourceLayout2
            r18 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L15
            r0 = r18
            long r0 = org.lwjgl.system.Checks.check(r0)
        L15:
            r0 = r11
            long r0 = r0.address()
            r1 = r12
            r2 = r14
            r3 = r16
            r4 = r18
            org.lwjgl.system.JNI.callPJPPV(r0, r1, r2, r3, r4)
            return
    }

    public static void vkGetImageSubresourceLayout2(org.lwjgl.vulkan.VkDevice r8, @org.lwjgl.system.NativeType("VkImage") long r9, @org.lwjgl.system.NativeType("VkImageSubresource2 const *") org.lwjgl.vulkan.VkImageSubresource2 r11, @org.lwjgl.system.NativeType("VkSubresourceLayout2 *") org.lwjgl.vulkan.VkSubresourceLayout2 r12) {
            r0 = r8
            r1 = r9
            r2 = r11
            long r2 = r2.address()
            r3 = r12
            long r3 = r3.address()
            nvkGetImageSubresourceLayout2(r0, r1, r2, r3)
            return
    }

    public static int nvkCopyMemoryToImage(org.lwjgl.vulkan.VkDevice r7, long r8) {
            r0 = r7
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkCopyMemoryToImage
            r10 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L17
            r0 = r10
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r8
            org.lwjgl.vulkan.VkCopyMemoryToImageInfo.validate(r0)
        L17:
            r0 = r7
            long r0 = r0.address()
            r1 = r8
            r2 = r10
            int r0 = org.lwjgl.system.JNI.callPPI(r0, r1, r2)
            return r0
    }

    @org.lwjgl.system.NativeType("VkResult")
    public static int vkCopyMemoryToImage(org.lwjgl.vulkan.VkDevice r4, @org.lwjgl.system.NativeType("VkCopyMemoryToImageInfo const *") org.lwjgl.vulkan.VkCopyMemoryToImageInfo r5) {
            r0 = r4
            r1 = r5
            long r1 = r1.address()
            int r0 = nvkCopyMemoryToImage(r0, r1)
            return r0
    }

    public static int nvkCopyImageToMemory(org.lwjgl.vulkan.VkDevice r7, long r8) {
            r0 = r7
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkCopyImageToMemory
            r10 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L17
            r0 = r10
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r8
            org.lwjgl.vulkan.VkCopyImageToMemoryInfo.validate(r0)
        L17:
            r0 = r7
            long r0 = r0.address()
            r1 = r8
            r2 = r10
            int r0 = org.lwjgl.system.JNI.callPPI(r0, r1, r2)
            return r0
    }

    @org.lwjgl.system.NativeType("VkResult")
    public static int vkCopyImageToMemory(org.lwjgl.vulkan.VkDevice r4, @org.lwjgl.system.NativeType("VkCopyImageToMemoryInfo const *") org.lwjgl.vulkan.VkCopyImageToMemoryInfo r5) {
            r0 = r4
            r1 = r5
            long r1 = r1.address()
            int r0 = nvkCopyImageToMemory(r0, r1)
            return r0
    }

    public static int nvkCopyImageToImage(org.lwjgl.vulkan.VkDevice r7, long r8) {
            r0 = r7
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkCopyImageToImage
            r10 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L17
            r0 = r10
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r8
            org.lwjgl.vulkan.VkCopyImageToImageInfo.validate(r0)
        L17:
            r0 = r7
            long r0 = r0.address()
            r1 = r8
            r2 = r10
            int r0 = org.lwjgl.system.JNI.callPPI(r0, r1, r2)
            return r0
    }

    @org.lwjgl.system.NativeType("VkResult")
    public static int vkCopyImageToImage(org.lwjgl.vulkan.VkDevice r4, @org.lwjgl.system.NativeType("VkCopyImageToImageInfo const *") org.lwjgl.vulkan.VkCopyImageToImageInfo r5) {
            r0 = r4
            r1 = r5
            long r1 = r1.address()
            int r0 = nvkCopyImageToImage(r0, r1)
            return r0
    }

    public static int nvkTransitionImageLayout(org.lwjgl.vulkan.VkDevice r8, int r9, long r10) {
            r0 = r8
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkTransitionImageLayout
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
            int r0 = org.lwjgl.system.JNI.callPPI(r0, r1, r2, r3)
            return r0
    }

    @org.lwjgl.system.NativeType("VkResult")
    public static int vkTransitionImageLayout(org.lwjgl.vulkan.VkDevice r5, @org.lwjgl.system.NativeType("VkHostImageLayoutTransitionInfo const *") org.lwjgl.vulkan.VkHostImageLayoutTransitionInfo.Buffer r6) {
            r0 = r5
            r1 = r6
            int r1 = r1.remaining()
            r2 = r6
            long r2 = r2.address()
            int r0 = nvkTransitionImageLayout(r0, r1, r2)
            return r0
    }

    public static void nvkCmdPushDescriptorSet(org.lwjgl.vulkan.VkCommandBuffer r12, int r13, long r14, int r16, int r17, long r18) {
            r0 = r12
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkCmdPushDescriptorSet
            r20 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L15
            r0 = r20
            long r0 = org.lwjgl.system.Checks.check(r0)
        L15:
            r0 = r12
            long r0 = r0.address()
            r1 = r13
            r2 = r14
            r3 = r16
            r4 = r17
            r5 = r18
            r6 = r20
            org.lwjgl.system.JNI.callPJPV(r0, r1, r2, r3, r4, r5, r6)
            return
    }

    public static void vkCmdPushDescriptorSet(org.lwjgl.vulkan.VkCommandBuffer r9, @org.lwjgl.system.NativeType("VkPipelineBindPoint") int r10, @org.lwjgl.system.NativeType("VkPipelineLayout") long r11, @org.lwjgl.system.NativeType("uint32_t") int r13, @org.lwjgl.system.NativeType("VkWriteDescriptorSet const *") org.lwjgl.vulkan.VkWriteDescriptorSet.Buffer r14) {
            r0 = r9
            r1 = r10
            r2 = r11
            r3 = r13
            r4 = r14
            int r4 = r4.remaining()
            r5 = r14
            long r5 = r5.address()
            nvkCmdPushDescriptorSet(r0, r1, r2, r3, r4, r5)
            return
    }

    public static void vkCmdPushDescriptorSetWithTemplate(org.lwjgl.vulkan.VkCommandBuffer r12, @org.lwjgl.system.NativeType("VkDescriptorUpdateTemplate") long r13, @org.lwjgl.system.NativeType("VkPipelineLayout") long r15, @org.lwjgl.system.NativeType("uint32_t") int r17, @org.lwjgl.system.NativeType("void const *") long r18) {
            r0 = r12
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkCmdPushDescriptorSetWithTemplate
            r20 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L15
            r0 = r20
            long r0 = org.lwjgl.system.Checks.check(r0)
        L15:
            r0 = r12
            long r0 = r0.address()
            r1 = r13
            r2 = r15
            r3 = r17
            r4 = r18
            r5 = r20
            org.lwjgl.system.JNI.callPJJPV(r0, r1, r2, r3, r4, r5)
            return
    }

    public static void nvkCmdBindDescriptorSets2(org.lwjgl.vulkan.VkCommandBuffer r7, long r8) {
            r0 = r7
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkCmdBindDescriptorSets2
            r10 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L17
            r0 = r10
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r8
            org.lwjgl.vulkan.VkBindDescriptorSetsInfo.validate(r0)
        L17:
            r0 = r7
            long r0 = r0.address()
            r1 = r8
            r2 = r10
            org.lwjgl.system.JNI.callPPV(r0, r1, r2)
            return
    }

    public static void vkCmdBindDescriptorSets2(org.lwjgl.vulkan.VkCommandBuffer r4, @org.lwjgl.system.NativeType("VkBindDescriptorSetsInfo const *") org.lwjgl.vulkan.VkBindDescriptorSetsInfo r5) {
            r0 = r4
            r1 = r5
            long r1 = r1.address()
            nvkCmdBindDescriptorSets2(r0, r1)
            return
    }

    public static void nvkCmdPushConstants2(org.lwjgl.vulkan.VkCommandBuffer r7, long r8) {
            r0 = r7
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkCmdPushConstants2
            r10 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L17
            r0 = r10
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r8
            org.lwjgl.vulkan.VkPushConstantsInfo.validate(r0)
        L17:
            r0 = r7
            long r0 = r0.address()
            r1 = r8
            r2 = r10
            org.lwjgl.system.JNI.callPPV(r0, r1, r2)
            return
    }

    public static void vkCmdPushConstants2(org.lwjgl.vulkan.VkCommandBuffer r4, @org.lwjgl.system.NativeType("VkPushConstantsInfo const *") org.lwjgl.vulkan.VkPushConstantsInfo r5) {
            r0 = r4
            r1 = r5
            long r1 = r1.address()
            nvkCmdPushConstants2(r0, r1)
            return
    }

    public static void nvkCmdPushDescriptorSet2(org.lwjgl.vulkan.VkCommandBuffer r7, long r8) {
            r0 = r7
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkCmdPushDescriptorSet2
            r10 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L17
            r0 = r10
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r8
            org.lwjgl.vulkan.VkPushDescriptorSetInfo.validate(r0)
        L17:
            r0 = r7
            long r0 = r0.address()
            r1 = r8
            r2 = r10
            org.lwjgl.system.JNI.callPPV(r0, r1, r2)
            return
    }

    public static void vkCmdPushDescriptorSet2(org.lwjgl.vulkan.VkCommandBuffer r4, @org.lwjgl.system.NativeType("VkPushDescriptorSetInfo const *") org.lwjgl.vulkan.VkPushDescriptorSetInfo r5) {
            r0 = r4
            r1 = r5
            long r1 = r1.address()
            nvkCmdPushDescriptorSet2(r0, r1)
            return
    }

    public static void nvkCmdPushDescriptorSetWithTemplate2(org.lwjgl.vulkan.VkCommandBuffer r7, long r8) {
            r0 = r7
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkCmdPushDescriptorSetWithTemplate2
            r10 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L17
            r0 = r10
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r8
            org.lwjgl.vulkan.VkPushDescriptorSetWithTemplateInfo.validate(r0)
        L17:
            r0 = r7
            long r0 = r0.address()
            r1 = r8
            r2 = r10
            org.lwjgl.system.JNI.callPPV(r0, r1, r2)
            return
    }

    public static void vkCmdPushDescriptorSetWithTemplate2(org.lwjgl.vulkan.VkCommandBuffer r4, @org.lwjgl.system.NativeType("VkPushDescriptorSetWithTemplateInfo const *") org.lwjgl.vulkan.VkPushDescriptorSetWithTemplateInfo r5) {
            r0 = r4
            r1 = r5
            long r1 = r1.address()
            nvkCmdPushDescriptorSetWithTemplate2(r0, r1)
            return
    }

    public static void vkCmdSetLineStipple(org.lwjgl.vulkan.VkCommandBuffer r7, @org.lwjgl.system.NativeType("uint32_t") int r8, @org.lwjgl.system.NativeType("uint16_t") short r9) {
            r0 = r7
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkCmdSetLineStipple
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
            org.lwjgl.system.JNI.callPCV(r0, r1, r2, r3)
            return
    }

    public static void vkCmdBindIndexBuffer2(org.lwjgl.vulkan.VkCommandBuffer r12, @org.lwjgl.system.NativeType("VkBuffer") long r13, @org.lwjgl.system.NativeType("VkDeviceSize") long r15, @org.lwjgl.system.NativeType("VkDeviceSize") long r17, @org.lwjgl.system.NativeType("VkIndexType") int r19) {
            r0 = r12
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkCmdBindIndexBuffer2
            r20 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L15
            r0 = r20
            long r0 = org.lwjgl.system.Checks.check(r0)
        L15:
            r0 = r12
            long r0 = r0.address()
            r1 = r13
            r2 = r15
            r3 = r17
            r4 = r19
            r5 = r20
            org.lwjgl.system.JNI.callPJJJV(r0, r1, r2, r3, r4, r5)
            return
    }

    public static void nvkGetRenderingAreaGranularity(org.lwjgl.vulkan.VkDevice r9, long r10, long r12) {
            r0 = r9
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkGetRenderingAreaGranularity
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
            org.lwjgl.system.JNI.callPPPV(r0, r1, r2, r3)
            return
    }

    public static void vkGetRenderingAreaGranularity(org.lwjgl.vulkan.VkDevice r6, @org.lwjgl.system.NativeType("VkRenderingAreaInfo const *") org.lwjgl.vulkan.VkRenderingAreaInfo r7, @org.lwjgl.system.NativeType("VkExtent2D *") org.lwjgl.vulkan.VkExtent2D r8) {
            r0 = r6
            r1 = r7
            long r1 = r1.address()
            r2 = r8
            long r2 = r2.address()
            nvkGetRenderingAreaGranularity(r0, r1, r2)
            return
    }

    public static void nvkCmdSetRenderingAttachmentLocations(org.lwjgl.vulkan.VkCommandBuffer r7, long r8) {
            r0 = r7
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkCmdSetRenderingAttachmentLocations
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

    public static void vkCmdSetRenderingAttachmentLocations(org.lwjgl.vulkan.VkCommandBuffer r4, @org.lwjgl.system.NativeType("VkRenderingAttachmentLocationInfo const *") org.lwjgl.vulkan.VkRenderingAttachmentLocationInfo r5) {
            r0 = r4
            r1 = r5
            long r1 = r1.address()
            nvkCmdSetRenderingAttachmentLocations(r0, r1)
            return
    }

    public static void nvkCmdSetRenderingInputAttachmentIndices(org.lwjgl.vulkan.VkCommandBuffer r7, long r8) {
            r0 = r7
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkCmdSetRenderingInputAttachmentIndices
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

    public static void vkCmdSetRenderingInputAttachmentIndices(org.lwjgl.vulkan.VkCommandBuffer r4, @org.lwjgl.system.NativeType("VkRenderingInputAttachmentIndexInfo const *") org.lwjgl.vulkan.VkRenderingInputAttachmentIndexInfo r5) {
            r0 = r4
            r1 = r5
            long r1 = r1.address()
            nvkCmdSetRenderingInputAttachmentIndices(r0, r1)
            return
    }

    static {
            r0 = 0
            r1 = 1
            r2 = 4
            r3 = 0
            int r0 = VK_MAKE_API_VERSION(r0, r1, r2, r3)
            org.lwjgl.vulkan.VK14.VK_API_VERSION_1_4 = r0
            return
    }
}
