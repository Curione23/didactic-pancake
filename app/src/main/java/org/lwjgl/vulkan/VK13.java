package org.lwjgl.vulkan;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VK13.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VK13.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VK13.class */
public class VK13 extends org.lwjgl.vulkan.VK12 {
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_VULKAN_1_3_FEATURES = 53;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_VULKAN_1_3_PROPERTIES = 54;
    public static final int VK_STRUCTURE_TYPE_PIPELINE_CREATION_FEEDBACK_CREATE_INFO = 1000192000;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_TERMINATE_INVOCATION_FEATURES = 1000215000;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_TOOL_PROPERTIES = 1000245000;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_DEMOTE_TO_HELPER_INVOCATION_FEATURES = 1000276000;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_PRIVATE_DATA_FEATURES = 1000295000;
    public static final int VK_STRUCTURE_TYPE_DEVICE_PRIVATE_DATA_CREATE_INFO = 1000295001;
    public static final int VK_STRUCTURE_TYPE_PRIVATE_DATA_SLOT_CREATE_INFO = 1000295002;
    public static final int VK_OBJECT_TYPE_PRIVATE_DATA_SLOT = 1000295000;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_PIPELINE_CREATION_CACHE_CONTROL_FEATURES = 1000297000;
    public static final int VK_PIPELINE_CREATE_FAIL_ON_PIPELINE_COMPILE_REQUIRED_BIT = 256;
    public static final int VK_PIPELINE_CREATE_EARLY_RETURN_ON_FAILURE_BIT = 512;
    public static final int VK_PIPELINE_COMPILE_REQUIRED = 1000297000;
    public static final int VK_PIPELINE_CACHE_CREATE_EXTERNALLY_SYNCHRONIZED_BIT = 1;
    public static final int VK_STRUCTURE_TYPE_MEMORY_BARRIER_2 = 1000314000;
    public static final int VK_STRUCTURE_TYPE_BUFFER_MEMORY_BARRIER_2 = 1000314001;
    public static final int VK_STRUCTURE_TYPE_IMAGE_MEMORY_BARRIER_2 = 1000314002;
    public static final int VK_STRUCTURE_TYPE_DEPENDENCY_INFO = 1000314003;
    public static final int VK_STRUCTURE_TYPE_SUBMIT_INFO_2 = 1000314004;
    public static final int VK_STRUCTURE_TYPE_SEMAPHORE_SUBMIT_INFO = 1000314005;
    public static final int VK_STRUCTURE_TYPE_COMMAND_BUFFER_SUBMIT_INFO = 1000314006;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SYNCHRONIZATION_2_FEATURES = 1000314007;
    public static final int VK_EVENT_CREATE_DEVICE_ONLY_BIT = 1;
    public static final int VK_IMAGE_LAYOUT_READ_ONLY_OPTIMAL = 1000314000;
    public static final int VK_IMAGE_LAYOUT_ATTACHMENT_OPTIMAL = 1000314001;
    public static final int VK_PIPELINE_STAGE_NONE = 0;
    public static final int VK_ACCESS_NONE = 0;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_ZERO_INITIALIZE_WORKGROUP_MEMORY_FEATURES = 1000325000;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_IMAGE_ROBUSTNESS_FEATURES = 1000335000;
    public static final int VK_STRUCTURE_TYPE_COPY_BUFFER_INFO_2 = 1000337000;
    public static final int VK_STRUCTURE_TYPE_COPY_IMAGE_INFO_2 = 1000337001;
    public static final int VK_STRUCTURE_TYPE_COPY_BUFFER_TO_IMAGE_INFO_2 = 1000337002;
    public static final int VK_STRUCTURE_TYPE_COPY_IMAGE_TO_BUFFER_INFO_2 = 1000337003;
    public static final int VK_STRUCTURE_TYPE_BLIT_IMAGE_INFO_2 = 1000337004;
    public static final int VK_STRUCTURE_TYPE_RESOLVE_IMAGE_INFO_2 = 1000337005;
    public static final int VK_STRUCTURE_TYPE_BUFFER_COPY_2 = 1000337006;
    public static final int VK_STRUCTURE_TYPE_IMAGE_COPY_2 = 1000337007;
    public static final int VK_STRUCTURE_TYPE_IMAGE_BLIT_2 = 1000337008;
    public static final int VK_STRUCTURE_TYPE_BUFFER_IMAGE_COPY_2 = 1000337009;
    public static final int VK_STRUCTURE_TYPE_IMAGE_RESOLVE_2 = 1000337010;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SUBGROUP_SIZE_CONTROL_PROPERTIES = 1000225000;
    public static final int VK_STRUCTURE_TYPE_PIPELINE_SHADER_STAGE_REQUIRED_SUBGROUP_SIZE_CREATE_INFO = 1000225001;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SUBGROUP_SIZE_CONTROL_FEATURES = 1000225002;
    public static final int VK_PIPELINE_SHADER_STAGE_CREATE_ALLOW_VARYING_SUBGROUP_SIZE_BIT = 1;
    public static final int VK_PIPELINE_SHADER_STAGE_CREATE_REQUIRE_FULL_SUBGROUPS_BIT = 2;
    public static final int VK_DESCRIPTOR_TYPE_INLINE_UNIFORM_BLOCK = 1000138000;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_INLINE_UNIFORM_BLOCK_FEATURES = 1000138000;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_INLINE_UNIFORM_BLOCK_PROPERTIES = 1000138001;
    public static final int VK_STRUCTURE_TYPE_WRITE_DESCRIPTOR_SET_INLINE_UNIFORM_BLOCK = 1000138002;
    public static final int VK_STRUCTURE_TYPE_DESCRIPTOR_POOL_INLINE_UNIFORM_BLOCK_CREATE_INFO = 1000138003;
    public static final int VK_FORMAT_G8_B8R8_2PLANE_444_UNORM = 1000330000;
    public static final int VK_FORMAT_G10X6_B10X6R10X6_2PLANE_444_UNORM_3PACK16 = 1000330001;
    public static final int VK_FORMAT_G12X4_B12X4R12X4_2PLANE_444_UNORM_3PACK16 = 1000330002;
    public static final int VK_FORMAT_G16_B16R16_2PLANE_444_UNORM = 1000330003;
    public static final int VK_FORMAT_A4R4G4B4_UNORM_PACK16 = 1000340000;
    public static final int VK_FORMAT_A4B4G4R4_UNORM_PACK16 = 1000340001;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_TEXTURE_COMPRESSION_ASTC_HDR_FEATURES = 1000066000;
    public static final int VK_FORMAT_ASTC_4x4_SFLOAT_BLOCK = 1000066000;
    public static final int VK_FORMAT_ASTC_5x4_SFLOAT_BLOCK = 1000066001;
    public static final int VK_FORMAT_ASTC_5x5_SFLOAT_BLOCK = 1000066002;
    public static final int VK_FORMAT_ASTC_6x5_SFLOAT_BLOCK = 1000066003;
    public static final int VK_FORMAT_ASTC_6x6_SFLOAT_BLOCK = 1000066004;
    public static final int VK_FORMAT_ASTC_8x5_SFLOAT_BLOCK = 1000066005;
    public static final int VK_FORMAT_ASTC_8x6_SFLOAT_BLOCK = 1000066006;
    public static final int VK_FORMAT_ASTC_8x8_SFLOAT_BLOCK = 1000066007;
    public static final int VK_FORMAT_ASTC_10x5_SFLOAT_BLOCK = 1000066008;
    public static final int VK_FORMAT_ASTC_10x6_SFLOAT_BLOCK = 1000066009;
    public static final int VK_FORMAT_ASTC_10x8_SFLOAT_BLOCK = 1000066010;
    public static final int VK_FORMAT_ASTC_10x10_SFLOAT_BLOCK = 1000066011;
    public static final int VK_FORMAT_ASTC_12x10_SFLOAT_BLOCK = 1000066012;
    public static final int VK_FORMAT_ASTC_12x12_SFLOAT_BLOCK = 1000066013;
    public static final int VK_STRUCTURE_TYPE_RENDERING_INFO = 1000044000;
    public static final int VK_STRUCTURE_TYPE_RENDERING_ATTACHMENT_INFO = 1000044001;
    public static final int VK_STRUCTURE_TYPE_PIPELINE_RENDERING_CREATE_INFO = 1000044002;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_DYNAMIC_RENDERING_FEATURES = 1000044003;
    public static final int VK_STRUCTURE_TYPE_COMMAND_BUFFER_INHERITANCE_RENDERING_INFO = 1000044004;
    public static final int VK_ATTACHMENT_STORE_OP_NONE = 1000301000;
    public static final int VK_DYNAMIC_STATE_CULL_MODE = 1000267000;
    public static final int VK_DYNAMIC_STATE_FRONT_FACE = 1000267001;
    public static final int VK_DYNAMIC_STATE_PRIMITIVE_TOPOLOGY = 1000267002;
    public static final int VK_DYNAMIC_STATE_VIEWPORT_WITH_COUNT = 1000267003;
    public static final int VK_DYNAMIC_STATE_SCISSOR_WITH_COUNT = 1000267004;
    public static final int VK_DYNAMIC_STATE_VERTEX_INPUT_BINDING_STRIDE = 1000267005;
    public static final int VK_DYNAMIC_STATE_DEPTH_TEST_ENABLE = 1000267006;
    public static final int VK_DYNAMIC_STATE_DEPTH_WRITE_ENABLE = 1000267007;
    public static final int VK_DYNAMIC_STATE_DEPTH_COMPARE_OP = 1000267008;
    public static final int VK_DYNAMIC_STATE_DEPTH_BOUNDS_TEST_ENABLE = 1000267009;
    public static final int VK_DYNAMIC_STATE_STENCIL_TEST_ENABLE = 1000267010;
    public static final int VK_DYNAMIC_STATE_STENCIL_OP = 1000267011;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_INTEGER_DOT_PRODUCT_FEATURES = 1000280000;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_INTEGER_DOT_PRODUCT_PROPERTIES = 1000280001;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_TEXEL_BUFFER_ALIGNMENT_PROPERTIES = 1000281001;
    public static final int VK_STRUCTURE_TYPE_FORMAT_PROPERTIES_3 = 1000360000;
    public static final int VK_DYNAMIC_STATE_RASTERIZER_DISCARD_ENABLE = 1000377001;
    public static final int VK_DYNAMIC_STATE_DEPTH_BIAS_ENABLE = 1000377002;
    public static final int VK_DYNAMIC_STATE_PRIMITIVE_RESTART_ENABLE = 1000377004;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_MAINTENANCE_4_FEATURES = 1000413000;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_MAINTENANCE_4_PROPERTIES = 1000413001;
    public static final int VK_STRUCTURE_TYPE_DEVICE_BUFFER_MEMORY_REQUIREMENTS = 1000413002;
    public static final int VK_STRUCTURE_TYPE_DEVICE_IMAGE_MEMORY_REQUIREMENTS = 1000413003;
    public static final int VK_IMAGE_ASPECT_NONE = 0;
    public static final int VK_PIPELINE_CREATION_FEEDBACK_VALID_BIT = 1;
    public static final int VK_PIPELINE_CREATION_FEEDBACK_APPLICATION_PIPELINE_CACHE_HIT_BIT = 2;
    public static final int VK_PIPELINE_CREATION_FEEDBACK_BASE_PIPELINE_ACCELERATION_BIT = 4;
    public static final int VK_TOOL_PURPOSE_VALIDATION_BIT = 1;
    public static final int VK_TOOL_PURPOSE_PROFILING_BIT = 2;
    public static final int VK_TOOL_PURPOSE_TRACING_BIT = 4;
    public static final int VK_TOOL_PURPOSE_ADDITIONAL_FEATURES_BIT = 8;
    public static final int VK_TOOL_PURPOSE_MODIFYING_FEATURES_BIT = 16;
    public static final long VK_PIPELINE_STAGE_2_NONE = 0;
    public static final long VK_PIPELINE_STAGE_2_TOP_OF_PIPE_BIT = 1;
    public static final long VK_PIPELINE_STAGE_2_DRAW_INDIRECT_BIT = 2;
    public static final long VK_PIPELINE_STAGE_2_VERTEX_INPUT_BIT = 4;
    public static final long VK_PIPELINE_STAGE_2_VERTEX_SHADER_BIT = 8;
    public static final long VK_PIPELINE_STAGE_2_TESSELLATION_CONTROL_SHADER_BIT = 16;
    public static final long VK_PIPELINE_STAGE_2_TESSELLATION_EVALUATION_SHADER_BIT = 32;
    public static final long VK_PIPELINE_STAGE_2_GEOMETRY_SHADER_BIT = 64;
    public static final long VK_PIPELINE_STAGE_2_FRAGMENT_SHADER_BIT = 128;
    public static final long VK_PIPELINE_STAGE_2_EARLY_FRAGMENT_TESTS_BIT = 256;
    public static final long VK_PIPELINE_STAGE_2_LATE_FRAGMENT_TESTS_BIT = 512;
    public static final long VK_PIPELINE_STAGE_2_COLOR_ATTACHMENT_OUTPUT_BIT = 1024;
    public static final long VK_PIPELINE_STAGE_2_COMPUTE_SHADER_BIT = 2048;
    public static final long VK_PIPELINE_STAGE_2_ALL_TRANSFER_BIT = 4096;
    public static final long VK_PIPELINE_STAGE_2_BOTTOM_OF_PIPE_BIT = 8192;
    public static final long VK_PIPELINE_STAGE_2_HOST_BIT = 16384;
    public static final long VK_PIPELINE_STAGE_2_ALL_GRAPHICS_BIT = 32768;
    public static final long VK_PIPELINE_STAGE_2_ALL_COMMANDS_BIT = 65536;
    public static final long VK_PIPELINE_STAGE_2_COPY_BIT = 4294967296L;
    public static final long VK_PIPELINE_STAGE_2_RESOLVE_BIT = 8589934592L;
    public static final long VK_PIPELINE_STAGE_2_BLIT_BIT = 17179869184L;
    public static final long VK_PIPELINE_STAGE_2_CLEAR_BIT = 34359738368L;
    public static final long VK_PIPELINE_STAGE_2_INDEX_INPUT_BIT = 68719476736L;
    public static final long VK_PIPELINE_STAGE_2_VERTEX_ATTRIBUTE_INPUT_BIT = 137438953472L;
    public static final long VK_PIPELINE_STAGE_2_PRE_RASTERIZATION_SHADERS_BIT = 274877906944L;
    public static final long VK_ACCESS_2_NONE = 0;
    public static final long VK_ACCESS_2_INDIRECT_COMMAND_READ_BIT = 1;
    public static final long VK_ACCESS_2_INDEX_READ_BIT = 2;
    public static final long VK_ACCESS_2_VERTEX_ATTRIBUTE_READ_BIT = 4;
    public static final long VK_ACCESS_2_UNIFORM_READ_BIT = 8;
    public static final long VK_ACCESS_2_INPUT_ATTACHMENT_READ_BIT = 16;
    public static final long VK_ACCESS_2_SHADER_READ_BIT = 32;
    public static final long VK_ACCESS_2_SHADER_WRITE_BIT = 64;
    public static final long VK_ACCESS_2_COLOR_ATTACHMENT_READ_BIT = 128;
    public static final long VK_ACCESS_2_COLOR_ATTACHMENT_WRITE_BIT = 256;
    public static final long VK_ACCESS_2_DEPTH_STENCIL_ATTACHMENT_READ_BIT = 512;
    public static final long VK_ACCESS_2_DEPTH_STENCIL_ATTACHMENT_WRITE_BIT = 1024;
    public static final long VK_ACCESS_2_TRANSFER_READ_BIT = 2048;
    public static final long VK_ACCESS_2_TRANSFER_WRITE_BIT = 4096;
    public static final long VK_ACCESS_2_HOST_READ_BIT = 8192;
    public static final long VK_ACCESS_2_HOST_WRITE_BIT = 16384;
    public static final long VK_ACCESS_2_MEMORY_READ_BIT = 32768;
    public static final long VK_ACCESS_2_MEMORY_WRITE_BIT = 65536;
    public static final long VK_ACCESS_2_SHADER_SAMPLED_READ_BIT = 4294967296L;
    public static final long VK_ACCESS_2_SHADER_STORAGE_READ_BIT = 8589934592L;
    public static final long VK_ACCESS_2_SHADER_STORAGE_WRITE_BIT = 17179869184L;
    public static final int VK_SUBMIT_PROTECTED_BIT = 1;
    public static final int VK_RENDERING_CONTENTS_SECONDARY_COMMAND_BUFFERS_BIT = 1;
    public static final int VK_RENDERING_SUSPENDING_BIT = 2;
    public static final int VK_RENDERING_RESUMING_BIT = 4;
    public static final long VK_FORMAT_FEATURE_2_SAMPLED_IMAGE_BIT = 1;
    public static final long VK_FORMAT_FEATURE_2_STORAGE_IMAGE_BIT = 2;
    public static final long VK_FORMAT_FEATURE_2_STORAGE_IMAGE_ATOMIC_BIT = 4;
    public static final long VK_FORMAT_FEATURE_2_UNIFORM_TEXEL_BUFFER_BIT = 8;
    public static final long VK_FORMAT_FEATURE_2_STORAGE_TEXEL_BUFFER_BIT = 16;
    public static final long VK_FORMAT_FEATURE_2_STORAGE_TEXEL_BUFFER_ATOMIC_BIT = 32;
    public static final long VK_FORMAT_FEATURE_2_VERTEX_BUFFER_BIT = 64;
    public static final long VK_FORMAT_FEATURE_2_COLOR_ATTACHMENT_BIT = 128;
    public static final long VK_FORMAT_FEATURE_2_COLOR_ATTACHMENT_BLEND_BIT = 256;
    public static final long VK_FORMAT_FEATURE_2_DEPTH_STENCIL_ATTACHMENT_BIT = 512;
    public static final long VK_FORMAT_FEATURE_2_BLIT_SRC_BIT = 1024;
    public static final long VK_FORMAT_FEATURE_2_BLIT_DST_BIT = 2048;
    public static final long VK_FORMAT_FEATURE_2_SAMPLED_IMAGE_FILTER_LINEAR_BIT = 4096;
    public static final long VK_FORMAT_FEATURE_2_SAMPLED_IMAGE_FILTER_CUBIC_BIT = 8192;
    public static final long VK_FORMAT_FEATURE_2_TRANSFER_SRC_BIT = 16384;
    public static final long VK_FORMAT_FEATURE_2_TRANSFER_DST_BIT = 32768;
    public static final long VK_FORMAT_FEATURE_2_SAMPLED_IMAGE_FILTER_MINMAX_BIT = 65536;
    public static final long VK_FORMAT_FEATURE_2_MIDPOINT_CHROMA_SAMPLES_BIT = 131072;
    public static final long VK_FORMAT_FEATURE_2_SAMPLED_IMAGE_YCBCR_CONVERSION_LINEAR_FILTER_BIT = 262144;
    public static final long VK_FORMAT_FEATURE_2_SAMPLED_IMAGE_YCBCR_CONVERSION_SEPARATE_RECONSTRUCTION_FILTER_BIT = 524288;
    public static final long VK_FORMAT_FEATURE_2_SAMPLED_IMAGE_YCBCR_CONVERSION_CHROMA_RECONSTRUCTION_EXPLICIT_BIT = 1048576;
    public static final long VK_FORMAT_FEATURE_2_SAMPLED_IMAGE_YCBCR_CONVERSION_CHROMA_RECONSTRUCTION_EXPLICIT_FORCEABLE_BIT = 2097152;
    public static final long VK_FORMAT_FEATURE_2_DISJOINT_BIT = 4194304;
    public static final long VK_FORMAT_FEATURE_2_COSITED_CHROMA_SAMPLES_BIT = 8388608;
    public static final long VK_FORMAT_FEATURE_2_STORAGE_READ_WITHOUT_FORMAT_BIT = 2147483648L;
    public static final long VK_FORMAT_FEATURE_2_STORAGE_WRITE_WITHOUT_FORMAT_BIT = 4294967296L;
    public static final long VK_FORMAT_FEATURE_2_SAMPLED_IMAGE_DEPTH_COMPARISON_BIT = 8589934592L;
    public static final int VK_API_VERSION_1_3 = 0;

    protected VK13() {
            r3 = this;
            r0 = r3
            r0.<init>()
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r1 = r0
            r1.<init>()
            throw r0
    }

    public static int nvkGetPhysicalDeviceToolProperties(org.lwjgl.vulkan.VkPhysicalDevice r9, long r10, long r12) {
            r0 = r9
            org.lwjgl.vulkan.VKCapabilitiesInstance r0 = r0.getCapabilities()
            long r0 = r0.vkGetPhysicalDeviceToolProperties
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
    public static int vkGetPhysicalDeviceToolProperties(org.lwjgl.vulkan.VkPhysicalDevice r6, @org.lwjgl.system.NativeType("uint32_t *") java.nio.IntBuffer r7, @javax.annotation.Nullable @org.lwjgl.system.NativeType("VkPhysicalDeviceToolProperties *") org.lwjgl.vulkan.VkPhysicalDeviceToolProperties.Buffer r8) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L17
            r0 = r7
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
            r0 = r8
            r1 = r7
            r2 = r7
            int r2 = r2.position()
            int r1 = r1.get(r2)
            org.lwjgl.system.Checks.checkSafe(r0, r1)
        L17:
            r0 = r6
            r1 = r7
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            r2 = r8
            long r2 = org.lwjgl.system.MemoryUtil.memAddressSafe(r2)
            int r0 = nvkGetPhysicalDeviceToolProperties(r0, r1, r2)
            return r0
    }

    public static int nvkCreatePrivateDataSlot(org.lwjgl.vulkan.VkDevice r11, long r12, long r14, long r16) {
            r0 = r11
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkCreatePrivateDataSlot
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
            int r0 = org.lwjgl.system.JNI.callPPPPI(r0, r1, r2, r3, r4)
            return r0
    }

    @org.lwjgl.system.NativeType("VkResult")
    public static int vkCreatePrivateDataSlot(org.lwjgl.vulkan.VkDevice r8, @org.lwjgl.system.NativeType("VkPrivateDataSlotCreateInfo const *") org.lwjgl.vulkan.VkPrivateDataSlotCreateInfo r9, @javax.annotation.Nullable @org.lwjgl.system.NativeType("VkAllocationCallbacks const *") org.lwjgl.vulkan.VkAllocationCallbacks r10, @org.lwjgl.system.NativeType("VkPrivateDataSlot *") java.nio.LongBuffer r11) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r11
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
        Lb:
            r0 = r8
            r1 = r9
            long r1 = r1.address()
            r2 = r10
            long r2 = org.lwjgl.system.MemoryUtil.memAddressSafe(r2)
            r3 = r11
            long r3 = org.lwjgl.system.MemoryUtil.memAddress(r3)
            int r0 = nvkCreatePrivateDataSlot(r0, r1, r2, r3)
            return r0
    }

    public static void nvkDestroyPrivateDataSlot(org.lwjgl.vulkan.VkDevice r9, long r10, long r12) {
            r0 = r9
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkDestroyPrivateDataSlot
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
            org.lwjgl.system.JNI.callPJPV(r0, r1, r2, r3)
            return
    }

    public static void vkDestroyPrivateDataSlot(org.lwjgl.vulkan.VkDevice r6, @org.lwjgl.system.NativeType("VkPrivateDataSlot") long r7, @javax.annotation.Nullable @org.lwjgl.system.NativeType("VkAllocationCallbacks const *") org.lwjgl.vulkan.VkAllocationCallbacks r9) {
            r0 = r6
            r1 = r7
            r2 = r9
            long r2 = org.lwjgl.system.MemoryUtil.memAddressSafe(r2)
            nvkDestroyPrivateDataSlot(r0, r1, r2)
            return
    }

    @org.lwjgl.system.NativeType("VkResult")
    public static int vkSetPrivateData(org.lwjgl.vulkan.VkDevice r12, @org.lwjgl.system.NativeType("VkObjectType") int r13, @org.lwjgl.system.NativeType("uint64_t") long r14, @org.lwjgl.system.NativeType("VkPrivateDataSlot") long r16, @org.lwjgl.system.NativeType("uint64_t") long r18) {
            r0 = r12
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkSetPrivateData
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
            r4 = r18
            r5 = r20
            int r0 = org.lwjgl.system.JNI.callPJJJI(r0, r1, r2, r3, r4, r5)
            return r0
    }

    public static void nvkGetPrivateData(org.lwjgl.vulkan.VkDevice r12, int r13, long r14, long r16, long r18) {
            r0 = r12
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkGetPrivateData
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
            r4 = r18
            r5 = r20
            org.lwjgl.system.JNI.callPJJPV(r0, r1, r2, r3, r4, r5)
            return
    }

    public static void vkGetPrivateData(org.lwjgl.vulkan.VkDevice r9, @org.lwjgl.system.NativeType("VkObjectType") int r10, @org.lwjgl.system.NativeType("uint64_t") long r11, @org.lwjgl.system.NativeType("VkPrivateDataSlot") long r13, @org.lwjgl.system.NativeType("uint64_t *") java.nio.LongBuffer r15) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lc
            r0 = r15
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
        Lc:
            r0 = r9
            r1 = r10
            r2 = r11
            r3 = r13
            r4 = r15
            long r4 = org.lwjgl.system.MemoryUtil.memAddress(r4)
            nvkGetPrivateData(r0, r1, r2, r3, r4)
            return
    }

    public static void nvkCmdSetEvent2(org.lwjgl.vulkan.VkCommandBuffer r9, long r10, long r12) {
            r0 = r9
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkCmdSetEvent2
            r14 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L19
            r0 = r14
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r12
            org.lwjgl.vulkan.VkDependencyInfo.validate(r0)
        L19:
            r0 = r9
            long r0 = r0.address()
            r1 = r10
            r2 = r12
            r3 = r14
            org.lwjgl.system.JNI.callPJPV(r0, r1, r2, r3)
            return
    }

    public static void vkCmdSetEvent2(org.lwjgl.vulkan.VkCommandBuffer r6, @org.lwjgl.system.NativeType("VkEvent") long r7, @org.lwjgl.system.NativeType("VkDependencyInfo const *") org.lwjgl.vulkan.VkDependencyInfo r9) {
            r0 = r6
            r1 = r7
            r2 = r9
            long r2 = r2.address()
            nvkCmdSetEvent2(r0, r1, r2)
            return
    }

    public static void vkCmdResetEvent2(org.lwjgl.vulkan.VkCommandBuffer r9, @org.lwjgl.system.NativeType("VkEvent") long r10, @org.lwjgl.system.NativeType("VkPipelineStageFlags2") long r12) {
            r0 = r9
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkCmdResetEvent2
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
            org.lwjgl.system.JNI.callPJJV(r0, r1, r2, r3)
            return
    }

    public static void nvkCmdWaitEvents2(org.lwjgl.vulkan.VkCommandBuffer r10, int r11, long r12, long r14) {
            r0 = r10
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkCmdWaitEvents2
            r16 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L23
            r0 = r16
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r14
            r1 = r11
            int r2 = org.lwjgl.vulkan.VkDependencyInfo.SIZEOF
            void r3 = org.lwjgl.vulkan.VkDependencyInfo::validate
            org.lwjgl.system.Struct.validate(r0, r1, r2, r3)
        L23:
            r0 = r10
            long r0 = r0.address()
            r1 = r11
            r2 = r12
            r3 = r14
            r4 = r16
            org.lwjgl.system.JNI.callPPPV(r0, r1, r2, r3, r4)
            return
    }

    public static void vkCmdWaitEvents2(org.lwjgl.vulkan.VkCommandBuffer r7, @org.lwjgl.system.NativeType("VkEvent const *") java.nio.LongBuffer r8, @org.lwjgl.system.NativeType("VkDependencyInfo const *") org.lwjgl.vulkan.VkDependencyInfo.Buffer r9) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Le
            r0 = r9
            r1 = r8
            int r1 = r1.remaining()
            org.lwjgl.system.Checks.check(r0, r1)
        Le:
            r0 = r7
            r1 = r8
            int r1 = r1.remaining()
            r2 = r8
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            r3 = r9
            long r3 = r3.address()
            nvkCmdWaitEvents2(r0, r1, r2, r3)
            return
    }

    public static void nvkCmdPipelineBarrier2(org.lwjgl.vulkan.VkCommandBuffer r7, long r8) {
            r0 = r7
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkCmdPipelineBarrier2
            r10 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L17
            r0 = r10
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r8
            org.lwjgl.vulkan.VkDependencyInfo.validate(r0)
        L17:
            r0 = r7
            long r0 = r0.address()
            r1 = r8
            r2 = r10
            org.lwjgl.system.JNI.callPPV(r0, r1, r2)
            return
    }

    public static void vkCmdPipelineBarrier2(org.lwjgl.vulkan.VkCommandBuffer r4, @org.lwjgl.system.NativeType("VkDependencyInfo const *") org.lwjgl.vulkan.VkDependencyInfo r5) {
            r0 = r4
            r1 = r5
            long r1 = r1.address()
            nvkCmdPipelineBarrier2(r0, r1)
            return
    }

    public static void vkCmdWriteTimestamp2(org.lwjgl.vulkan.VkCommandBuffer r10, @org.lwjgl.system.NativeType("VkPipelineStageFlags2") long r11, @org.lwjgl.system.NativeType("VkQueryPool") long r13, @org.lwjgl.system.NativeType("uint32_t") int r15) {
            r0 = r10
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkCmdWriteTimestamp2
            r16 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L15
            r0 = r16
            long r0 = org.lwjgl.system.Checks.check(r0)
        L15:
            r0 = r10
            long r0 = r0.address()
            r1 = r11
            r2 = r13
            r3 = r15
            r4 = r16
            org.lwjgl.system.JNI.callPJJV(r0, r1, r2, r3, r4)
            return
    }

    public static int nvkQueueSubmit2(org.lwjgl.vulkan.VkQueue r10, int r11, long r12, long r14) {
            r0 = r10
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkQueueSubmit2
            r16 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L28
            r0 = r16
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r12
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto L28
            r0 = r12
            r1 = r11
            int r2 = org.lwjgl.vulkan.VkSubmitInfo2.SIZEOF
            int r3 = org.lwjgl.vulkan.VkSubmitInfo2::validate
            org.lwjgl.system.Struct.validate(r0, r1, r2, r3)
        L28:
            r0 = r10
            long r0 = r0.address()
            r1 = r11
            r2 = r12
            r3 = r14
            r4 = r16
            int r0 = org.lwjgl.system.JNI.callPPJI(r0, r1, r2, r3, r4)
            return r0
    }

    @org.lwjgl.system.NativeType("VkResult")
    public static int vkQueueSubmit2(org.lwjgl.vulkan.VkQueue r7, @javax.annotation.Nullable @org.lwjgl.system.NativeType("VkSubmitInfo2 const *") org.lwjgl.vulkan.VkSubmitInfo2.Buffer r8, @org.lwjgl.system.NativeType("VkFence") long r9) {
            r0 = r7
            r1 = r8
            int r1 = org.lwjgl.system.Checks.remainingSafe(r1)
            r2 = r8
            long r2 = org.lwjgl.system.MemoryUtil.memAddressSafe(r2)
            r3 = r9
            int r0 = nvkQueueSubmit2(r0, r1, r2, r3)
            return r0
    }

    public static void nvkCmdCopyBuffer2(org.lwjgl.vulkan.VkCommandBuffer r7, long r8) {
            r0 = r7
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkCmdCopyBuffer2
            r10 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L17
            r0 = r10
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r8
            org.lwjgl.vulkan.VkCopyBufferInfo2.validate(r0)
        L17:
            r0 = r7
            long r0 = r0.address()
            r1 = r8
            r2 = r10
            org.lwjgl.system.JNI.callPPV(r0, r1, r2)
            return
    }

    public static void vkCmdCopyBuffer2(org.lwjgl.vulkan.VkCommandBuffer r4, @org.lwjgl.system.NativeType("VkCopyBufferInfo2 const *") org.lwjgl.vulkan.VkCopyBufferInfo2 r5) {
            r0 = r4
            r1 = r5
            long r1 = r1.address()
            nvkCmdCopyBuffer2(r0, r1)
            return
    }

    public static void nvkCmdCopyImage2(org.lwjgl.vulkan.VkCommandBuffer r7, long r8) {
            r0 = r7
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkCmdCopyImage2
            r10 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L17
            r0 = r10
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r8
            org.lwjgl.vulkan.VkCopyImageInfo2.validate(r0)
        L17:
            r0 = r7
            long r0 = r0.address()
            r1 = r8
            r2 = r10
            org.lwjgl.system.JNI.callPPV(r0, r1, r2)
            return
    }

    public static void vkCmdCopyImage2(org.lwjgl.vulkan.VkCommandBuffer r4, @org.lwjgl.system.NativeType("VkCopyImageInfo2 const *") org.lwjgl.vulkan.VkCopyImageInfo2 r5) {
            r0 = r4
            r1 = r5
            long r1 = r1.address()
            nvkCmdCopyImage2(r0, r1)
            return
    }

    public static void nvkCmdCopyBufferToImage2(org.lwjgl.vulkan.VkCommandBuffer r7, long r8) {
            r0 = r7
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkCmdCopyBufferToImage2
            r10 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L17
            r0 = r10
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r8
            org.lwjgl.vulkan.VkCopyBufferToImageInfo2.validate(r0)
        L17:
            r0 = r7
            long r0 = r0.address()
            r1 = r8
            r2 = r10
            org.lwjgl.system.JNI.callPPV(r0, r1, r2)
            return
    }

    public static void vkCmdCopyBufferToImage2(org.lwjgl.vulkan.VkCommandBuffer r4, @org.lwjgl.system.NativeType("VkCopyBufferToImageInfo2 const *") org.lwjgl.vulkan.VkCopyBufferToImageInfo2 r5) {
            r0 = r4
            r1 = r5
            long r1 = r1.address()
            nvkCmdCopyBufferToImage2(r0, r1)
            return
    }

    public static void nvkCmdCopyImageToBuffer2(org.lwjgl.vulkan.VkCommandBuffer r7, long r8) {
            r0 = r7
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkCmdCopyImageToBuffer2
            r10 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L17
            r0 = r10
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r8
            org.lwjgl.vulkan.VkCopyImageToBufferInfo2.validate(r0)
        L17:
            r0 = r7
            long r0 = r0.address()
            r1 = r8
            r2 = r10
            org.lwjgl.system.JNI.callPPV(r0, r1, r2)
            return
    }

    public static void vkCmdCopyImageToBuffer2(org.lwjgl.vulkan.VkCommandBuffer r4, @org.lwjgl.system.NativeType("VkCopyImageToBufferInfo2 const *") org.lwjgl.vulkan.VkCopyImageToBufferInfo2 r5) {
            r0 = r4
            r1 = r5
            long r1 = r1.address()
            nvkCmdCopyImageToBuffer2(r0, r1)
            return
    }

    public static void nvkCmdBlitImage2(org.lwjgl.vulkan.VkCommandBuffer r7, long r8) {
            r0 = r7
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkCmdBlitImage2
            r10 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L17
            r0 = r10
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r8
            org.lwjgl.vulkan.VkBlitImageInfo2.validate(r0)
        L17:
            r0 = r7
            long r0 = r0.address()
            r1 = r8
            r2 = r10
            org.lwjgl.system.JNI.callPPV(r0, r1, r2)
            return
    }

    public static void vkCmdBlitImage2(org.lwjgl.vulkan.VkCommandBuffer r4, @org.lwjgl.system.NativeType("VkBlitImageInfo2 const *") org.lwjgl.vulkan.VkBlitImageInfo2 r5) {
            r0 = r4
            r1 = r5
            long r1 = r1.address()
            nvkCmdBlitImage2(r0, r1)
            return
    }

    public static void nvkCmdResolveImage2(org.lwjgl.vulkan.VkCommandBuffer r7, long r8) {
            r0 = r7
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkCmdResolveImage2
            r10 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L17
            r0 = r10
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r8
            org.lwjgl.vulkan.VkResolveImageInfo2.validate(r0)
        L17:
            r0 = r7
            long r0 = r0.address()
            r1 = r8
            r2 = r10
            org.lwjgl.system.JNI.callPPV(r0, r1, r2)
            return
    }

    public static void vkCmdResolveImage2(org.lwjgl.vulkan.VkCommandBuffer r4, @org.lwjgl.system.NativeType("VkResolveImageInfo2 const *") org.lwjgl.vulkan.VkResolveImageInfo2 r5) {
            r0 = r4
            r1 = r5
            long r1 = r1.address()
            nvkCmdResolveImage2(r0, r1)
            return
    }

    public static void nvkCmdBeginRendering(org.lwjgl.vulkan.VkCommandBuffer r7, long r8) {
            r0 = r7
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkCmdBeginRendering
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

    public static void vkCmdBeginRendering(org.lwjgl.vulkan.VkCommandBuffer r4, @org.lwjgl.system.NativeType("VkRenderingInfo const *") org.lwjgl.vulkan.VkRenderingInfo r5) {
            r0 = r4
            r1 = r5
            long r1 = r1.address()
            nvkCmdBeginRendering(r0, r1)
            return
    }

    public static void vkCmdEndRendering(org.lwjgl.vulkan.VkCommandBuffer r5) {
            r0 = r5
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkCmdEndRendering
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

    public static void vkCmdSetCullMode(org.lwjgl.vulkan.VkCommandBuffer r6, @org.lwjgl.system.NativeType("VkCullModeFlags") int r7) {
            r0 = r6
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkCmdSetCullMode
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

    public static void vkCmdSetFrontFace(org.lwjgl.vulkan.VkCommandBuffer r6, @org.lwjgl.system.NativeType("VkFrontFace") int r7) {
            r0 = r6
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkCmdSetFrontFace
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

    public static void vkCmdSetPrimitiveTopology(org.lwjgl.vulkan.VkCommandBuffer r6, @org.lwjgl.system.NativeType("VkPrimitiveTopology") int r7) {
            r0 = r6
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkCmdSetPrimitiveTopology
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

    public static void nvkCmdSetViewportWithCount(org.lwjgl.vulkan.VkCommandBuffer r8, int r9, long r10) {
            r0 = r8
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkCmdSetViewportWithCount
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

    public static void vkCmdSetViewportWithCount(org.lwjgl.vulkan.VkCommandBuffer r5, @org.lwjgl.system.NativeType("VkViewport const *") org.lwjgl.vulkan.VkViewport.Buffer r6) {
            r0 = r5
            r1 = r6
            int r1 = r1.remaining()
            r2 = r6
            long r2 = r2.address()
            nvkCmdSetViewportWithCount(r0, r1, r2)
            return
    }

    public static void nvkCmdSetScissorWithCount(org.lwjgl.vulkan.VkCommandBuffer r8, int r9, long r10) {
            r0 = r8
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkCmdSetScissorWithCount
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

    public static void vkCmdSetScissorWithCount(org.lwjgl.vulkan.VkCommandBuffer r5, @org.lwjgl.system.NativeType("VkRect2D const *") org.lwjgl.vulkan.VkRect2D.Buffer r6) {
            r0 = r5
            r1 = r6
            int r1 = r1.remaining()
            r2 = r6
            long r2 = r2.address()
            nvkCmdSetScissorWithCount(r0, r1, r2)
            return
    }

    public static void nvkCmdBindVertexBuffers2(org.lwjgl.vulkan.VkCommandBuffer r15, int r16, int r17, long r18, long r20, long r22, long r24) {
            r0 = r15
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkCmdBindVertexBuffers2
            r26 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L15
            r0 = r26
            long r0 = org.lwjgl.system.Checks.check(r0)
        L15:
            r0 = r15
            long r0 = r0.address()
            r1 = r16
            r2 = r17
            r3 = r18
            r4 = r20
            r5 = r22
            r6 = r24
            r7 = r26
            org.lwjgl.system.JNI.callPPPPPV(r0, r1, r2, r3, r4, r5, r6, r7)
            return
    }

    public static void vkCmdBindVertexBuffers2(org.lwjgl.vulkan.VkCommandBuffer r12, @org.lwjgl.system.NativeType("uint32_t") int r13, @org.lwjgl.system.NativeType("VkBuffer const *") java.nio.LongBuffer r14, @org.lwjgl.system.NativeType("VkDeviceSize const *") java.nio.LongBuffer r15, @javax.annotation.Nullable @org.lwjgl.system.NativeType("VkDeviceSize const *") java.nio.LongBuffer r16, @javax.annotation.Nullable @org.lwjgl.system.NativeType("VkDeviceSize const *") java.nio.LongBuffer r17) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L20
            r0 = r15
            r1 = r14
            int r1 = r1.remaining()
            org.lwjgl.system.Checks.check(r0, r1)
            r0 = r16
            r1 = r14
            int r1 = r1.remaining()
            org.lwjgl.system.Checks.checkSafe(r0, r1)
            r0 = r17
            r1 = r14
            int r1 = r1.remaining()
            org.lwjgl.system.Checks.checkSafe(r0, r1)
        L20:
            r0 = r12
            r1 = r13
            r2 = r14
            int r2 = r2.remaining()
            r3 = r14
            long r3 = org.lwjgl.system.MemoryUtil.memAddress(r3)
            r4 = r15
            long r4 = org.lwjgl.system.MemoryUtil.memAddress(r4)
            r5 = r16
            long r5 = org.lwjgl.system.MemoryUtil.memAddressSafe(r5)
            r6 = r17
            long r6 = org.lwjgl.system.MemoryUtil.memAddressSafe(r6)
            nvkCmdBindVertexBuffers2(r0, r1, r2, r3, r4, r5, r6)
            return
    }

    public static void vkCmdSetDepthTestEnable(org.lwjgl.vulkan.VkCommandBuffer r6, @org.lwjgl.system.NativeType("VkBool32") boolean r7) {
            r0 = r6
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkCmdSetDepthTestEnable
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

    public static void vkCmdSetDepthWriteEnable(org.lwjgl.vulkan.VkCommandBuffer r6, @org.lwjgl.system.NativeType("VkBool32") boolean r7) {
            r0 = r6
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkCmdSetDepthWriteEnable
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

    public static void vkCmdSetDepthCompareOp(org.lwjgl.vulkan.VkCommandBuffer r6, @org.lwjgl.system.NativeType("VkCompareOp") int r7) {
            r0 = r6
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkCmdSetDepthCompareOp
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

    public static void vkCmdSetDepthBoundsTestEnable(org.lwjgl.vulkan.VkCommandBuffer r6, @org.lwjgl.system.NativeType("VkBool32") boolean r7) {
            r0 = r6
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkCmdSetDepthBoundsTestEnable
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

    public static void vkCmdSetStencilTestEnable(org.lwjgl.vulkan.VkCommandBuffer r6, @org.lwjgl.system.NativeType("VkBool32") boolean r7) {
            r0 = r6
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkCmdSetStencilTestEnable
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

    public static void vkCmdSetStencilOp(org.lwjgl.vulkan.VkCommandBuffer r10, @org.lwjgl.system.NativeType("VkStencilFaceFlags") int r11, @org.lwjgl.system.NativeType("VkStencilOp") int r12, @org.lwjgl.system.NativeType("VkStencilOp") int r13, @org.lwjgl.system.NativeType("VkStencilOp") int r14, @org.lwjgl.system.NativeType("VkCompareOp") int r15) {
            r0 = r10
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkCmdSetStencilOp
            r16 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L15
            r0 = r16
            long r0 = org.lwjgl.system.Checks.check(r0)
        L15:
            r0 = r10
            long r0 = r0.address()
            r1 = r11
            r2 = r12
            r3 = r13
            r4 = r14
            r5 = r15
            r6 = r16
            org.lwjgl.system.JNI.callPV(r0, r1, r2, r3, r4, r5, r6)
            return
    }

    public static void vkCmdSetRasterizerDiscardEnable(org.lwjgl.vulkan.VkCommandBuffer r6, @org.lwjgl.system.NativeType("VkBool32") boolean r7) {
            r0 = r6
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkCmdSetRasterizerDiscardEnable
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

    public static void vkCmdSetDepthBiasEnable(org.lwjgl.vulkan.VkCommandBuffer r6, @org.lwjgl.system.NativeType("VkBool32") boolean r7) {
            r0 = r6
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkCmdSetDepthBiasEnable
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

    public static void vkCmdSetPrimitiveRestartEnable(org.lwjgl.vulkan.VkCommandBuffer r6, @org.lwjgl.system.NativeType("VkBool32") boolean r7) {
            r0 = r6
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkCmdSetPrimitiveRestartEnable
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

    public static void nvkGetDeviceBufferMemoryRequirements(org.lwjgl.vulkan.VkDevice r9, long r10, long r12) {
            r0 = r9
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkGetDeviceBufferMemoryRequirements
            r14 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L19
            r0 = r14
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r10
            org.lwjgl.vulkan.VkDeviceBufferMemoryRequirements.validate(r0)
        L19:
            r0 = r9
            long r0 = r0.address()
            r1 = r10
            r2 = r12
            r3 = r14
            org.lwjgl.system.JNI.callPPPV(r0, r1, r2, r3)
            return
    }

    public static void vkGetDeviceBufferMemoryRequirements(org.lwjgl.vulkan.VkDevice r6, @org.lwjgl.system.NativeType("VkDeviceBufferMemoryRequirements const *") org.lwjgl.vulkan.VkDeviceBufferMemoryRequirements r7, @org.lwjgl.system.NativeType("VkMemoryRequirements2 *") org.lwjgl.vulkan.VkMemoryRequirements2 r8) {
            r0 = r6
            r1 = r7
            long r1 = r1.address()
            r2 = r8
            long r2 = r2.address()
            nvkGetDeviceBufferMemoryRequirements(r0, r1, r2)
            return
    }

    public static void nvkGetDeviceImageMemoryRequirements(org.lwjgl.vulkan.VkDevice r9, long r10, long r12) {
            r0 = r9
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkGetDeviceImageMemoryRequirements
            r14 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L19
            r0 = r14
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r10
            org.lwjgl.vulkan.VkDeviceImageMemoryRequirements.validate(r0)
        L19:
            r0 = r9
            long r0 = r0.address()
            r1 = r10
            r2 = r12
            r3 = r14
            org.lwjgl.system.JNI.callPPPV(r0, r1, r2, r3)
            return
    }

    public static void vkGetDeviceImageMemoryRequirements(org.lwjgl.vulkan.VkDevice r6, @org.lwjgl.system.NativeType("VkDeviceImageMemoryRequirements const *") org.lwjgl.vulkan.VkDeviceImageMemoryRequirements r7, @org.lwjgl.system.NativeType("VkMemoryRequirements2 *") org.lwjgl.vulkan.VkMemoryRequirements2 r8) {
            r0 = r6
            r1 = r7
            long r1 = r1.address()
            r2 = r8
            long r2 = r2.address()
            nvkGetDeviceImageMemoryRequirements(r0, r1, r2)
            return
    }

    public static void nvkGetDeviceImageSparseMemoryRequirements(org.lwjgl.vulkan.VkDevice r11, long r12, long r14, long r16) {
            r0 = r11
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkGetDeviceImageSparseMemoryRequirements
            r18 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L19
            r0 = r18
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r12
            org.lwjgl.vulkan.VkDeviceImageMemoryRequirements.validate(r0)
        L19:
            r0 = r11
            long r0 = r0.address()
            r1 = r12
            r2 = r14
            r3 = r16
            r4 = r18
            org.lwjgl.system.JNI.callPPPPV(r0, r1, r2, r3, r4)
            return
    }

    public static void vkGetDeviceImageSparseMemoryRequirements(org.lwjgl.vulkan.VkDevice r8, @org.lwjgl.system.NativeType("VkDeviceImageMemoryRequirements const *") org.lwjgl.vulkan.VkDeviceImageMemoryRequirements r9, @org.lwjgl.system.NativeType("uint32_t *") java.nio.IntBuffer r10, @javax.annotation.Nullable @org.lwjgl.system.NativeType("VkSparseImageMemoryRequirements2 *") org.lwjgl.vulkan.VkSparseImageMemoryRequirements2.Buffer r11) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L17
            r0 = r10
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
            r0 = r11
            r1 = r10
            r2 = r10
            int r2 = r2.position()
            int r1 = r1.get(r2)
            org.lwjgl.system.Checks.checkSafe(r0, r1)
        L17:
            r0 = r8
            r1 = r9
            long r1 = r1.address()
            r2 = r10
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            r3 = r11
            long r3 = org.lwjgl.system.MemoryUtil.memAddressSafe(r3)
            nvkGetDeviceImageSparseMemoryRequirements(r0, r1, r2, r3)
            return
    }

    @org.lwjgl.system.NativeType("VkResult")
    public static int vkGetPhysicalDeviceToolProperties(org.lwjgl.vulkan.VkPhysicalDevice r8, @org.lwjgl.system.NativeType("uint32_t *") int[] r9, @javax.annotation.Nullable @org.lwjgl.system.NativeType("VkPhysicalDeviceToolProperties *") org.lwjgl.vulkan.VkPhysicalDeviceToolProperties.Buffer r10) {
            r0 = r8
            org.lwjgl.vulkan.VKCapabilitiesInstance r0 = r0.getCapabilities()
            long r0 = r0.vkGetPhysicalDeviceToolProperties
            r11 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L1f
            r0 = r11
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r9
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
            r0 = r10
            r1 = r9
            r2 = 0
            r1 = r1[r2]
            org.lwjgl.system.Checks.checkSafe(r0, r1)
        L1f:
            r0 = r8
            long r0 = r0.address()
            r1 = r9
            r2 = r10
            long r2 = org.lwjgl.system.MemoryUtil.memAddressSafe(r2)
            r3 = r11
            int r0 = org.lwjgl.system.JNI.callPPPI(r0, r1, r2, r3)
            return r0
    }

    @org.lwjgl.system.NativeType("VkResult")
    public static int vkCreatePrivateDataSlot(org.lwjgl.vulkan.VkDevice r10, @org.lwjgl.system.NativeType("VkPrivateDataSlotCreateInfo const *") org.lwjgl.vulkan.VkPrivateDataSlotCreateInfo r11, @javax.annotation.Nullable @org.lwjgl.system.NativeType("VkAllocationCallbacks const *") org.lwjgl.vulkan.VkAllocationCallbacks r12, @org.lwjgl.system.NativeType("VkPrivateDataSlot *") long[] r13) {
            r0 = r10
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkCreatePrivateDataSlot
            r14 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L1a
            r0 = r14
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r13
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
        L1a:
            r0 = r10
            long r0 = r0.address()
            r1 = r11
            long r1 = r1.address()
            r2 = r12
            long r2 = org.lwjgl.system.MemoryUtil.memAddressSafe(r2)
            r3 = r13
            r4 = r14
            int r0 = org.lwjgl.system.JNI.callPPPPI(r0, r1, r2, r3, r4)
            return r0
    }

    public static void vkGetPrivateData(org.lwjgl.vulkan.VkDevice r11, @org.lwjgl.system.NativeType("VkObjectType") int r12, @org.lwjgl.system.NativeType("uint64_t") long r13, @org.lwjgl.system.NativeType("VkPrivateDataSlot") long r15, @org.lwjgl.system.NativeType("uint64_t *") long[] r17) {
            r0 = r11
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkGetPrivateData
            r18 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L1b
            r0 = r18
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r17
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
        L1b:
            r0 = r11
            long r0 = r0.address()
            r1 = r12
            r2 = r13
            r3 = r15
            r4 = r17
            r5 = r18
            org.lwjgl.system.JNI.callPJJPV(r0, r1, r2, r3, r4, r5)
            return
    }

    public static void vkCmdWaitEvents2(org.lwjgl.vulkan.VkCommandBuffer r9, @org.lwjgl.system.NativeType("VkEvent const *") long[] r10, @org.lwjgl.system.NativeType("VkDependencyInfo const *") org.lwjgl.vulkan.VkDependencyInfo.Buffer r11) {
            r0 = r9
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkCmdWaitEvents2
            r12 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L2a
            r0 = r12
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r11
            r1 = r10
            int r1 = r1.length
            org.lwjgl.system.Checks.check(r0, r1)
            r0 = r11
            long r0 = r0.address()
            r1 = r10
            int r1 = r1.length
            int r2 = org.lwjgl.vulkan.VkDependencyInfo.SIZEOF
            void r3 = org.lwjgl.vulkan.VkDependencyInfo::validate
            org.lwjgl.system.Struct.validate(r0, r1, r2, r3)
        L2a:
            r0 = r9
            long r0 = r0.address()
            r1 = r10
            int r1 = r1.length
            r2 = r10
            r3 = r11
            long r3 = r3.address()
            r4 = r12
            org.lwjgl.system.JNI.callPPPV(r0, r1, r2, r3, r4)
            return
    }

    public static void vkCmdBindVertexBuffers2(org.lwjgl.vulkan.VkCommandBuffer r11, @org.lwjgl.system.NativeType("uint32_t") int r12, @org.lwjgl.system.NativeType("VkBuffer const *") long[] r13, @org.lwjgl.system.NativeType("VkDeviceSize const *") long[] r14, @javax.annotation.Nullable @org.lwjgl.system.NativeType("VkDeviceSize const *") long[] r15, @javax.annotation.Nullable @org.lwjgl.system.NativeType("VkDeviceSize const *") long[] r16) {
            r0 = r11
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkCmdBindVertexBuffers2
            r17 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L29
            r0 = r17
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r14
            r1 = r13
            int r1 = r1.length
            org.lwjgl.system.Checks.check(r0, r1)
            r0 = r15
            r1 = r13
            int r1 = r1.length
            org.lwjgl.system.Checks.checkSafe(r0, r1)
            r0 = r16
            r1 = r13
            int r1 = r1.length
            org.lwjgl.system.Checks.checkSafe(r0, r1)
        L29:
            r0 = r11
            long r0 = r0.address()
            r1 = r12
            r2 = r13
            int r2 = r2.length
            r3 = r13
            r4 = r14
            r5 = r15
            r6 = r16
            r7 = r17
            org.lwjgl.system.JNI.callPPPPPV(r0, r1, r2, r3, r4, r5, r6, r7)
            return
    }

    public static void vkGetDeviceImageSparseMemoryRequirements(org.lwjgl.vulkan.VkDevice r10, @org.lwjgl.system.NativeType("VkDeviceImageMemoryRequirements const *") org.lwjgl.vulkan.VkDeviceImageMemoryRequirements r11, @org.lwjgl.system.NativeType("uint32_t *") int[] r12, @javax.annotation.Nullable @org.lwjgl.system.NativeType("VkSparseImageMemoryRequirements2 *") org.lwjgl.vulkan.VkSparseImageMemoryRequirements2.Buffer r13) {
            r0 = r10
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkGetDeviceImageSparseMemoryRequirements
            r14 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L28
            r0 = r14
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r12
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
            r0 = r13
            r1 = r12
            r2 = 0
            r1 = r1[r2]
            org.lwjgl.system.Checks.checkSafe(r0, r1)
            r0 = r11
            long r0 = r0.address()
            org.lwjgl.vulkan.VkDeviceImageMemoryRequirements.validate(r0)
        L28:
            r0 = r10
            long r0 = r0.address()
            r1 = r11
            long r1 = r1.address()
            r2 = r12
            r3 = r13
            long r3 = org.lwjgl.system.MemoryUtil.memAddressSafe(r3)
            r4 = r14
            org.lwjgl.system.JNI.callPPPPV(r0, r1, r2, r3, r4)
            return
    }

    static {
            r0 = 0
            r1 = 1
            r2 = 3
            r3 = 0
            int r0 = VK_MAKE_API_VERSION(r0, r1, r2, r3)
            org.lwjgl.vulkan.VK13.VK_API_VERSION_1_3 = r0
            return
    }
}
