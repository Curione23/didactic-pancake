package org.lwjgl.vulkan;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VK11.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VK11.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VK11.class */
public class VK11 extends org.lwjgl.vulkan.VK10 {
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SUBGROUP_PROPERTIES = 1000094000;
    public static final int VK_STRUCTURE_TYPE_BIND_BUFFER_MEMORY_INFO = 1000157000;
    public static final int VK_STRUCTURE_TYPE_BIND_IMAGE_MEMORY_INFO = 1000157001;
    public static final int VK_IMAGE_CREATE_ALIAS_BIT = 1024;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_16BIT_STORAGE_FEATURES = 1000083000;
    public static final int VK_STRUCTURE_TYPE_MEMORY_DEDICATED_REQUIREMENTS = 1000127000;
    public static final int VK_STRUCTURE_TYPE_MEMORY_DEDICATED_ALLOCATE_INFO = 1000127001;
    public static final int VK_STRUCTURE_TYPE_MEMORY_ALLOCATE_FLAGS_INFO = 1000060000;
    public static final int VK_STRUCTURE_TYPE_DEVICE_GROUP_RENDER_PASS_BEGIN_INFO = 1000060003;
    public static final int VK_STRUCTURE_TYPE_DEVICE_GROUP_COMMAND_BUFFER_BEGIN_INFO = 1000060004;
    public static final int VK_STRUCTURE_TYPE_DEVICE_GROUP_SUBMIT_INFO = 1000060005;
    public static final int VK_STRUCTURE_TYPE_DEVICE_GROUP_BIND_SPARSE_INFO = 1000060006;
    public static final int VK_PIPELINE_CREATE_VIEW_INDEX_FROM_DEVICE_INDEX_BIT = 8;
    public static final int VK_PIPELINE_CREATE_DISPATCH_BASE_BIT = 16;
    public static final int VK_PIPELINE_CREATE_DISPATCH_BASE = 16;
    public static final int VK_DEPENDENCY_DEVICE_GROUP_BIT = 4;
    public static final int VK_STRUCTURE_TYPE_BIND_BUFFER_MEMORY_DEVICE_GROUP_INFO = 1000060013;
    public static final int VK_STRUCTURE_TYPE_BIND_IMAGE_MEMORY_DEVICE_GROUP_INFO = 1000060014;
    public static final int VK_IMAGE_CREATE_SPLIT_INSTANCE_BIND_REGIONS_BIT = 64;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_GROUP_PROPERTIES = 1000070000;
    public static final int VK_STRUCTURE_TYPE_DEVICE_GROUP_DEVICE_CREATE_INFO = 1000070001;
    public static final int VK_MEMORY_HEAP_MULTI_INSTANCE_BIT = 2;
    public static final int VK_STRUCTURE_TYPE_BUFFER_MEMORY_REQUIREMENTS_INFO_2 = 1000146000;
    public static final int VK_STRUCTURE_TYPE_IMAGE_MEMORY_REQUIREMENTS_INFO_2 = 1000146001;
    public static final int VK_STRUCTURE_TYPE_IMAGE_SPARSE_MEMORY_REQUIREMENTS_INFO_2 = 1000146002;
    public static final int VK_STRUCTURE_TYPE_MEMORY_REQUIREMENTS_2 = 1000146003;
    public static final int VK_STRUCTURE_TYPE_SPARSE_IMAGE_MEMORY_REQUIREMENTS_2 = 1000146004;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_FEATURES_2 = 1000059000;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_PROPERTIES_2 = 1000059001;
    public static final int VK_STRUCTURE_TYPE_FORMAT_PROPERTIES_2 = 1000059002;
    public static final int VK_STRUCTURE_TYPE_IMAGE_FORMAT_PROPERTIES_2 = 1000059003;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_IMAGE_FORMAT_INFO_2 = 1000059004;
    public static final int VK_STRUCTURE_TYPE_QUEUE_FAMILY_PROPERTIES_2 = 1000059005;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_MEMORY_PROPERTIES_2 = 1000059006;
    public static final int VK_STRUCTURE_TYPE_SPARSE_IMAGE_FORMAT_PROPERTIES_2 = 1000059007;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SPARSE_IMAGE_FORMAT_INFO_2 = 1000059008;
    public static final int VK_ERROR_OUT_OF_POOL_MEMORY = -1000069000;
    public static final int VK_FORMAT_FEATURE_TRANSFER_SRC_BIT = 16384;
    public static final int VK_FORMAT_FEATURE_TRANSFER_DST_BIT = 32768;
    public static final int VK_IMAGE_CREATE_2D_ARRAY_COMPATIBLE_BIT = 32;
    public static final int VK_IMAGE_CREATE_BLOCK_TEXEL_VIEW_COMPATIBLE_BIT = 128;
    public static final int VK_IMAGE_CREATE_EXTENDED_USAGE_BIT = 256;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_POINT_CLIPPING_PROPERTIES = 1000117000;
    public static final int VK_STRUCTURE_TYPE_RENDER_PASS_INPUT_ATTACHMENT_ASPECT_CREATE_INFO = 1000117001;
    public static final int VK_STRUCTURE_TYPE_IMAGE_VIEW_USAGE_CREATE_INFO = 1000117002;
    public static final int VK_STRUCTURE_TYPE_PIPELINE_TESSELLATION_DOMAIN_ORIGIN_STATE_CREATE_INFO = 1000117003;
    public static final int VK_IMAGE_LAYOUT_DEPTH_READ_ONLY_STENCIL_ATTACHMENT_OPTIMAL = 1000117000;
    public static final int VK_IMAGE_LAYOUT_DEPTH_ATTACHMENT_STENCIL_READ_ONLY_OPTIMAL = 1000117001;
    public static final int VK_STRUCTURE_TYPE_RENDER_PASS_MULTIVIEW_CREATE_INFO = 1000053000;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_MULTIVIEW_FEATURES = 1000053001;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_MULTIVIEW_PROPERTIES = 1000053002;
    public static final int VK_DEPENDENCY_VIEW_LOCAL_BIT = 2;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_VARIABLE_POINTERS_FEATURES = 1000120000;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_VARIABLE_POINTER_FEATURES = 1000120000;
    public static final int VK_STRUCTURE_TYPE_PROTECTED_SUBMIT_INFO = 1000145000;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_PROTECTED_MEMORY_FEATURES = 1000145001;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_PROTECTED_MEMORY_PROPERTIES = 1000145002;
    public static final int VK_STRUCTURE_TYPE_DEVICE_QUEUE_INFO_2 = 1000145003;
    public static final int VK_QUEUE_PROTECTED_BIT = 16;
    public static final int VK_DEVICE_QUEUE_CREATE_PROTECTED_BIT = 1;
    public static final int VK_MEMORY_PROPERTY_PROTECTED_BIT = 32;
    public static final int VK_BUFFER_CREATE_PROTECTED_BIT = 8;
    public static final int VK_IMAGE_CREATE_PROTECTED_BIT = 2048;
    public static final int VK_COMMAND_POOL_CREATE_PROTECTED_BIT = 4;
    public static final int VK_STRUCTURE_TYPE_SAMPLER_YCBCR_CONVERSION_CREATE_INFO = 1000156000;
    public static final int VK_STRUCTURE_TYPE_SAMPLER_YCBCR_CONVERSION_INFO = 1000156001;
    public static final int VK_STRUCTURE_TYPE_BIND_IMAGE_PLANE_MEMORY_INFO = 1000156002;
    public static final int VK_STRUCTURE_TYPE_IMAGE_PLANE_MEMORY_REQUIREMENTS_INFO = 1000156003;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SAMPLER_YCBCR_CONVERSION_FEATURES = 1000156004;
    public static final int VK_STRUCTURE_TYPE_SAMPLER_YCBCR_CONVERSION_IMAGE_FORMAT_PROPERTIES = 1000156005;
    public static final int VK_OBJECT_TYPE_SAMPLER_YCBCR_CONVERSION = 1000156000;
    public static final int VK_FORMAT_G8B8G8R8_422_UNORM = 1000156000;
    public static final int VK_FORMAT_B8G8R8G8_422_UNORM = 1000156001;
    public static final int VK_FORMAT_G8_B8_R8_3PLANE_420_UNORM = 1000156002;
    public static final int VK_FORMAT_G8_B8R8_2PLANE_420_UNORM = 1000156003;
    public static final int VK_FORMAT_G8_B8_R8_3PLANE_422_UNORM = 1000156004;
    public static final int VK_FORMAT_G8_B8R8_2PLANE_422_UNORM = 1000156005;
    public static final int VK_FORMAT_G8_B8_R8_3PLANE_444_UNORM = 1000156006;
    public static final int VK_FORMAT_R10X6_UNORM_PACK16 = 1000156007;
    public static final int VK_FORMAT_R10X6G10X6_UNORM_2PACK16 = 1000156008;
    public static final int VK_FORMAT_R10X6G10X6B10X6A10X6_UNORM_4PACK16 = 1000156009;
    public static final int VK_FORMAT_G10X6B10X6G10X6R10X6_422_UNORM_4PACK16 = 1000156010;
    public static final int VK_FORMAT_B10X6G10X6R10X6G10X6_422_UNORM_4PACK16 = 1000156011;
    public static final int VK_FORMAT_G10X6_B10X6_R10X6_3PLANE_420_UNORM_3PACK16 = 1000156012;
    public static final int VK_FORMAT_G10X6_B10X6R10X6_2PLANE_420_UNORM_3PACK16 = 1000156013;
    public static final int VK_FORMAT_G10X6_B10X6_R10X6_3PLANE_422_UNORM_3PACK16 = 1000156014;
    public static final int VK_FORMAT_G10X6_B10X6R10X6_2PLANE_422_UNORM_3PACK16 = 1000156015;
    public static final int VK_FORMAT_G10X6_B10X6_R10X6_3PLANE_444_UNORM_3PACK16 = 1000156016;
    public static final int VK_FORMAT_R12X4_UNORM_PACK16 = 1000156017;
    public static final int VK_FORMAT_R12X4G12X4_UNORM_2PACK16 = 1000156018;
    public static final int VK_FORMAT_R12X4G12X4B12X4A12X4_UNORM_4PACK16 = 1000156019;
    public static final int VK_FORMAT_G12X4B12X4G12X4R12X4_422_UNORM_4PACK16 = 1000156020;
    public static final int VK_FORMAT_B12X4G12X4R12X4G12X4_422_UNORM_4PACK16 = 1000156021;
    public static final int VK_FORMAT_G12X4_B12X4_R12X4_3PLANE_420_UNORM_3PACK16 = 1000156022;
    public static final int VK_FORMAT_G12X4_B12X4R12X4_2PLANE_420_UNORM_3PACK16 = 1000156023;
    public static final int VK_FORMAT_G12X4_B12X4_R12X4_3PLANE_422_UNORM_3PACK16 = 1000156024;
    public static final int VK_FORMAT_G12X4_B12X4R12X4_2PLANE_422_UNORM_3PACK16 = 1000156025;
    public static final int VK_FORMAT_G12X4_B12X4_R12X4_3PLANE_444_UNORM_3PACK16 = 1000156026;
    public static final int VK_FORMAT_G16B16G16R16_422_UNORM = 1000156027;
    public static final int VK_FORMAT_B16G16R16G16_422_UNORM = 1000156028;
    public static final int VK_FORMAT_G16_B16_R16_3PLANE_420_UNORM = 1000156029;
    public static final int VK_FORMAT_G16_B16R16_2PLANE_420_UNORM = 1000156030;
    public static final int VK_FORMAT_G16_B16_R16_3PLANE_422_UNORM = 1000156031;
    public static final int VK_FORMAT_G16_B16R16_2PLANE_422_UNORM = 1000156032;
    public static final int VK_FORMAT_G16_B16_R16_3PLANE_444_UNORM = 1000156033;
    public static final int VK_IMAGE_ASPECT_PLANE_0_BIT = 16;
    public static final int VK_IMAGE_ASPECT_PLANE_1_BIT = 32;
    public static final int VK_IMAGE_ASPECT_PLANE_2_BIT = 64;
    public static final int VK_IMAGE_CREATE_DISJOINT_BIT = 512;
    public static final int VK_FORMAT_FEATURE_MIDPOINT_CHROMA_SAMPLES_BIT = 131072;
    public static final int VK_FORMAT_FEATURE_SAMPLED_IMAGE_YCBCR_CONVERSION_LINEAR_FILTER_BIT = 262144;
    public static final int VK_FORMAT_FEATURE_SAMPLED_IMAGE_YCBCR_CONVERSION_SEPARATE_RECONSTRUCTION_FILTER_BIT = 524288;
    public static final int VK_FORMAT_FEATURE_SAMPLED_IMAGE_YCBCR_CONVERSION_CHROMA_RECONSTRUCTION_EXPLICIT_BIT = 1048576;
    public static final int VK_FORMAT_FEATURE_SAMPLED_IMAGE_YCBCR_CONVERSION_CHROMA_RECONSTRUCTION_EXPLICIT_FORCEABLE_BIT = 2097152;
    public static final int VK_FORMAT_FEATURE_DISJOINT_BIT = 4194304;
    public static final int VK_FORMAT_FEATURE_COSITED_CHROMA_SAMPLES_BIT = 8388608;
    public static final int VK_STRUCTURE_TYPE_DESCRIPTOR_UPDATE_TEMPLATE_CREATE_INFO = 1000085000;
    public static final int VK_OBJECT_TYPE_DESCRIPTOR_UPDATE_TEMPLATE = 1000085000;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_EXTERNAL_IMAGE_FORMAT_INFO = 1000071000;
    public static final int VK_STRUCTURE_TYPE_EXTERNAL_IMAGE_FORMAT_PROPERTIES = 1000071001;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_EXTERNAL_BUFFER_INFO = 1000071002;
    public static final int VK_STRUCTURE_TYPE_EXTERNAL_BUFFER_PROPERTIES = 1000071003;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_ID_PROPERTIES = 1000071004;
    public static final int VK_STRUCTURE_TYPE_EXTERNAL_MEMORY_BUFFER_CREATE_INFO = 1000072000;
    public static final int VK_STRUCTURE_TYPE_EXTERNAL_MEMORY_IMAGE_CREATE_INFO = 1000072001;
    public static final int VK_STRUCTURE_TYPE_EXPORT_MEMORY_ALLOCATE_INFO = 1000072002;
    public static final int VK_ERROR_INVALID_EXTERNAL_HANDLE = -1000072003;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_EXTERNAL_FENCE_INFO = 1000112000;
    public static final int VK_STRUCTURE_TYPE_EXTERNAL_FENCE_PROPERTIES = 1000112001;
    public static final int VK_STRUCTURE_TYPE_EXPORT_FENCE_CREATE_INFO = 1000113000;
    public static final int VK_STRUCTURE_TYPE_EXPORT_SEMAPHORE_CREATE_INFO = 1000077000;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_EXTERNAL_SEMAPHORE_INFO = 1000076000;
    public static final int VK_STRUCTURE_TYPE_EXTERNAL_SEMAPHORE_PROPERTIES = 1000076001;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_MAINTENANCE_3_PROPERTIES = 1000168000;
    public static final int VK_STRUCTURE_TYPE_DESCRIPTOR_SET_LAYOUT_SUPPORT = 1000168001;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_DRAW_PARAMETERS_FEATURES = 1000063000;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_DRAW_PARAMETER_FEATURES = 1000063000;
    public static final int VK_SUBGROUP_FEATURE_BASIC_BIT = 1;
    public static final int VK_SUBGROUP_FEATURE_VOTE_BIT = 2;
    public static final int VK_SUBGROUP_FEATURE_ARITHMETIC_BIT = 4;
    public static final int VK_SUBGROUP_FEATURE_BALLOT_BIT = 8;
    public static final int VK_SUBGROUP_FEATURE_SHUFFLE_BIT = 16;
    public static final int VK_SUBGROUP_FEATURE_SHUFFLE_RELATIVE_BIT = 32;
    public static final int VK_SUBGROUP_FEATURE_CLUSTERED_BIT = 64;
    public static final int VK_SUBGROUP_FEATURE_QUAD_BIT = 128;
    public static final int VK_PEER_MEMORY_FEATURE_COPY_SRC_BIT = 1;
    public static final int VK_PEER_MEMORY_FEATURE_COPY_DST_BIT = 2;
    public static final int VK_PEER_MEMORY_FEATURE_GENERIC_SRC_BIT = 4;
    public static final int VK_PEER_MEMORY_FEATURE_GENERIC_DST_BIT = 8;
    public static final int VK_MEMORY_ALLOCATE_DEVICE_MASK_BIT = 1;
    public static final int VK_POINT_CLIPPING_BEHAVIOR_ALL_CLIP_PLANES = 0;
    public static final int VK_POINT_CLIPPING_BEHAVIOR_USER_CLIP_PLANES_ONLY = 1;
    public static final int VK_TESSELLATION_DOMAIN_ORIGIN_UPPER_LEFT = 0;
    public static final int VK_TESSELLATION_DOMAIN_ORIGIN_LOWER_LEFT = 1;
    public static final int VK_SAMPLER_YCBCR_MODEL_CONVERSION_RGB_IDENTITY = 0;
    public static final int VK_SAMPLER_YCBCR_MODEL_CONVERSION_YCBCR_IDENTITY = 1;
    public static final int VK_SAMPLER_YCBCR_MODEL_CONVERSION_YCBCR_709 = 2;
    public static final int VK_SAMPLER_YCBCR_MODEL_CONVERSION_YCBCR_601 = 3;
    public static final int VK_SAMPLER_YCBCR_MODEL_CONVERSION_YCBCR_2020 = 4;
    public static final int VK_SAMPLER_YCBCR_RANGE_ITU_FULL = 0;
    public static final int VK_SAMPLER_YCBCR_RANGE_ITU_NARROW = 1;
    public static final int VK_CHROMA_LOCATION_COSITED_EVEN = 0;
    public static final int VK_CHROMA_LOCATION_MIDPOINT = 1;
    public static final int VK_DESCRIPTOR_UPDATE_TEMPLATE_TYPE_DESCRIPTOR_SET = 0;
    public static final int VK_EXTERNAL_MEMORY_HANDLE_TYPE_OPAQUE_FD_BIT = 1;
    public static final int VK_EXTERNAL_MEMORY_HANDLE_TYPE_OPAQUE_WIN32_BIT = 2;
    public static final int VK_EXTERNAL_MEMORY_HANDLE_TYPE_OPAQUE_WIN32_KMT_BIT = 4;
    public static final int VK_EXTERNAL_MEMORY_HANDLE_TYPE_D3D11_TEXTURE_BIT = 8;
    public static final int VK_EXTERNAL_MEMORY_HANDLE_TYPE_D3D11_TEXTURE_KMT_BIT = 16;
    public static final int VK_EXTERNAL_MEMORY_HANDLE_TYPE_D3D12_HEAP_BIT = 32;
    public static final int VK_EXTERNAL_MEMORY_HANDLE_TYPE_D3D12_RESOURCE_BIT = 64;
    public static final int VK_EXTERNAL_MEMORY_FEATURE_DEDICATED_ONLY_BIT = 1;
    public static final int VK_EXTERNAL_MEMORY_FEATURE_EXPORTABLE_BIT = 2;
    public static final int VK_EXTERNAL_MEMORY_FEATURE_IMPORTABLE_BIT = 4;
    public static final int VK_EXTERNAL_FENCE_HANDLE_TYPE_OPAQUE_FD_BIT = 1;
    public static final int VK_EXTERNAL_FENCE_HANDLE_TYPE_OPAQUE_WIN32_BIT = 2;
    public static final int VK_EXTERNAL_FENCE_HANDLE_TYPE_OPAQUE_WIN32_KMT_BIT = 4;
    public static final int VK_EXTERNAL_FENCE_HANDLE_TYPE_SYNC_FD_BIT = 8;
    public static final int VK_EXTERNAL_FENCE_FEATURE_EXPORTABLE_BIT = 1;
    public static final int VK_EXTERNAL_FENCE_FEATURE_IMPORTABLE_BIT = 2;
    public static final int VK_FENCE_IMPORT_TEMPORARY_BIT = 1;
    public static final int VK_SEMAPHORE_IMPORT_TEMPORARY_BIT = 1;
    public static final int VK_EXTERNAL_SEMAPHORE_HANDLE_TYPE_OPAQUE_FD_BIT = 1;
    public static final int VK_EXTERNAL_SEMAPHORE_HANDLE_TYPE_OPAQUE_WIN32_BIT = 2;
    public static final int VK_EXTERNAL_SEMAPHORE_HANDLE_TYPE_OPAQUE_WIN32_KMT_BIT = 4;
    public static final int VK_EXTERNAL_SEMAPHORE_HANDLE_TYPE_D3D12_FENCE_BIT = 8;
    public static final int VK_EXTERNAL_SEMAPHORE_HANDLE_TYPE_D3D11_FENCE_BIT = 8;
    public static final int VK_EXTERNAL_SEMAPHORE_HANDLE_TYPE_SYNC_FD_BIT = 16;
    public static final int VK_EXTERNAL_SEMAPHORE_FEATURE_EXPORTABLE_BIT = 1;
    public static final int VK_EXTERNAL_SEMAPHORE_FEATURE_IMPORTABLE_BIT = 2;
    public static final int VK_API_VERSION_1_1 = 0;

    protected VK11() {
            r3 = this;
            r0 = r3
            r0.<init>()
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r1 = r0
            r1.<init>()
            throw r0
    }

    public static int nvkEnumerateInstanceVersion(long r5) {
            org.lwjgl.vulkan.VK$GlobalCommands r0 = org.lwjgl.vulkan.VK.getGlobalCommands()
            long r0 = r0.vkEnumerateInstanceVersion
            r7 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L12
            r0 = r7
            long r0 = org.lwjgl.system.Checks.check(r0)
        L12:
            r0 = r5
            r1 = r7
            int r0 = org.lwjgl.system.JNI.callPI(r0, r1)
            return r0
    }

    @org.lwjgl.system.NativeType("VkResult")
    public static int vkEnumerateInstanceVersion(@org.lwjgl.system.NativeType("uint32_t *") java.nio.IntBuffer r3) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r3
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
        Lb:
            r0 = r3
            long r0 = org.lwjgl.system.MemoryUtil.memAddress(r0)
            int r0 = nvkEnumerateInstanceVersion(r0)
            return r0
    }

    public static int nvkBindBufferMemory2(org.lwjgl.vulkan.VkDevice r8, int r9, long r10) {
            r0 = r8
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkBindBufferMemory2
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
    public static int vkBindBufferMemory2(org.lwjgl.vulkan.VkDevice r5, @org.lwjgl.system.NativeType("VkBindBufferMemoryInfo const *") org.lwjgl.vulkan.VkBindBufferMemoryInfo.Buffer r6) {
            r0 = r5
            r1 = r6
            int r1 = r1.remaining()
            r2 = r6
            long r2 = r2.address()
            int r0 = nvkBindBufferMemory2(r0, r1, r2)
            return r0
    }

    public static int nvkBindImageMemory2(org.lwjgl.vulkan.VkDevice r8, int r9, long r10) {
            r0 = r8
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkBindImageMemory2
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
    public static int vkBindImageMemory2(org.lwjgl.vulkan.VkDevice r5, @org.lwjgl.system.NativeType("VkBindImageMemoryInfo const *") org.lwjgl.vulkan.VkBindImageMemoryInfo.Buffer r6) {
            r0 = r5
            r1 = r6
            int r1 = r1.remaining()
            r2 = r6
            long r2 = r2.address()
            int r0 = nvkBindImageMemory2(r0, r1, r2)
            return r0
    }

    public static void nvkGetDeviceGroupPeerMemoryFeatures(org.lwjgl.vulkan.VkDevice r10, int r11, int r12, int r13, long r14) {
            r0 = r10
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkGetDeviceGroupPeerMemoryFeatures
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
            r5 = r16
            org.lwjgl.system.JNI.callPPV(r0, r1, r2, r3, r4, r5)
            return
    }

    public static void vkGetDeviceGroupPeerMemoryFeatures(org.lwjgl.vulkan.VkDevice r7, @org.lwjgl.system.NativeType("uint32_t") int r8, @org.lwjgl.system.NativeType("uint32_t") int r9, @org.lwjgl.system.NativeType("uint32_t") int r10, @org.lwjgl.system.NativeType("VkPeerMemoryFeatureFlags *") java.nio.IntBuffer r11) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lc
            r0 = r11
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
        Lc:
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            long r4 = org.lwjgl.system.MemoryUtil.memAddress(r4)
            nvkGetDeviceGroupPeerMemoryFeatures(r0, r1, r2, r3, r4)
            return
    }

    public static void vkCmdSetDeviceMask(org.lwjgl.vulkan.VkCommandBuffer r6, @org.lwjgl.system.NativeType("uint32_t") int r7) {
            r0 = r6
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkCmdSetDeviceMask
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

    public static void vkCmdDispatchBase(org.lwjgl.vulkan.VkCommandBuffer r11, @org.lwjgl.system.NativeType("uint32_t") int r12, @org.lwjgl.system.NativeType("uint32_t") int r13, @org.lwjgl.system.NativeType("uint32_t") int r14, @org.lwjgl.system.NativeType("uint32_t") int r15, @org.lwjgl.system.NativeType("uint32_t") int r16, @org.lwjgl.system.NativeType("uint32_t") int r17) {
            r0 = r11
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkCmdDispatchBase
            r18 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L15
            r0 = r18
            long r0 = org.lwjgl.system.Checks.check(r0)
        L15:
            r0 = r11
            long r0 = r0.address()
            r1 = r12
            r2 = r13
            r3 = r14
            r4 = r15
            r5 = r16
            r6 = r17
            r7 = r18
            org.lwjgl.system.JNI.callPV(r0, r1, r2, r3, r4, r5, r6, r7)
            return
    }

    public static int nvkEnumeratePhysicalDeviceGroups(org.lwjgl.vulkan.VkInstance r9, long r10, long r12) {
            r0 = r9
            org.lwjgl.vulkan.VKCapabilitiesInstance r0 = r0.getCapabilities()
            long r0 = r0.vkEnumeratePhysicalDeviceGroups
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
    public static int vkEnumeratePhysicalDeviceGroups(org.lwjgl.vulkan.VkInstance r6, @org.lwjgl.system.NativeType("uint32_t *") java.nio.IntBuffer r7, @javax.annotation.Nullable @org.lwjgl.system.NativeType("VkPhysicalDeviceGroupProperties *") org.lwjgl.vulkan.VkPhysicalDeviceGroupProperties.Buffer r8) {
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
            int r0 = nvkEnumeratePhysicalDeviceGroups(r0, r1, r2)
            return r0
    }

    public static void nvkGetImageMemoryRequirements2(org.lwjgl.vulkan.VkDevice r9, long r10, long r12) {
            r0 = r9
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkGetImageMemoryRequirements2
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

    public static void vkGetImageMemoryRequirements2(org.lwjgl.vulkan.VkDevice r6, @org.lwjgl.system.NativeType("VkImageMemoryRequirementsInfo2 const *") org.lwjgl.vulkan.VkImageMemoryRequirementsInfo2 r7, @org.lwjgl.system.NativeType("VkMemoryRequirements2 *") org.lwjgl.vulkan.VkMemoryRequirements2 r8) {
            r0 = r6
            r1 = r7
            long r1 = r1.address()
            r2 = r8
            long r2 = r2.address()
            nvkGetImageMemoryRequirements2(r0, r1, r2)
            return
    }

    public static void nvkGetBufferMemoryRequirements2(org.lwjgl.vulkan.VkDevice r9, long r10, long r12) {
            r0 = r9
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkGetBufferMemoryRequirements2
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

    public static void vkGetBufferMemoryRequirements2(org.lwjgl.vulkan.VkDevice r6, @org.lwjgl.system.NativeType("VkBufferMemoryRequirementsInfo2 const *") org.lwjgl.vulkan.VkBufferMemoryRequirementsInfo2 r7, @org.lwjgl.system.NativeType("VkMemoryRequirements2 *") org.lwjgl.vulkan.VkMemoryRequirements2 r8) {
            r0 = r6
            r1 = r7
            long r1 = r1.address()
            r2 = r8
            long r2 = r2.address()
            nvkGetBufferMemoryRequirements2(r0, r1, r2)
            return
    }

    public static void nvkGetImageSparseMemoryRequirements2(org.lwjgl.vulkan.VkDevice r11, long r12, long r14, long r16) {
            r0 = r11
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkGetImageSparseMemoryRequirements2
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
            org.lwjgl.system.JNI.callPPPPV(r0, r1, r2, r3, r4)
            return
    }

    public static void vkGetImageSparseMemoryRequirements2(org.lwjgl.vulkan.VkDevice r8, @org.lwjgl.system.NativeType("VkImageSparseMemoryRequirementsInfo2 const *") org.lwjgl.vulkan.VkImageSparseMemoryRequirementsInfo2 r9, @org.lwjgl.system.NativeType("uint32_t *") java.nio.IntBuffer r10, @javax.annotation.Nullable @org.lwjgl.system.NativeType("VkSparseImageMemoryRequirements2 *") org.lwjgl.vulkan.VkSparseImageMemoryRequirements2.Buffer r11) {
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
            nvkGetImageSparseMemoryRequirements2(r0, r1, r2, r3)
            return
    }

    public static void nvkGetPhysicalDeviceFeatures2(org.lwjgl.vulkan.VkPhysicalDevice r7, long r8) {
            r0 = r7
            org.lwjgl.vulkan.VKCapabilitiesInstance r0 = r0.getCapabilities()
            long r0 = r0.vkGetPhysicalDeviceFeatures2
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

    public static void vkGetPhysicalDeviceFeatures2(org.lwjgl.vulkan.VkPhysicalDevice r4, @org.lwjgl.system.NativeType("VkPhysicalDeviceFeatures2 *") org.lwjgl.vulkan.VkPhysicalDeviceFeatures2 r5) {
            r0 = r4
            r1 = r5
            long r1 = r1.address()
            nvkGetPhysicalDeviceFeatures2(r0, r1)
            return
    }

    public static void nvkGetPhysicalDeviceProperties2(org.lwjgl.vulkan.VkPhysicalDevice r7, long r8) {
            r0 = r7
            org.lwjgl.vulkan.VKCapabilitiesInstance r0 = r0.getCapabilities()
            long r0 = r0.vkGetPhysicalDeviceProperties2
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

    public static void vkGetPhysicalDeviceProperties2(org.lwjgl.vulkan.VkPhysicalDevice r4, @org.lwjgl.system.NativeType("VkPhysicalDeviceProperties2 *") org.lwjgl.vulkan.VkPhysicalDeviceProperties2 r5) {
            r0 = r4
            r1 = r5
            long r1 = r1.address()
            nvkGetPhysicalDeviceProperties2(r0, r1)
            return
    }

    public static void nvkGetPhysicalDeviceFormatProperties2(org.lwjgl.vulkan.VkPhysicalDevice r8, int r9, long r10) {
            r0 = r8
            org.lwjgl.vulkan.VKCapabilitiesInstance r0 = r0.getCapabilities()
            long r0 = r0.vkGetPhysicalDeviceFormatProperties2
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

    public static void vkGetPhysicalDeviceFormatProperties2(org.lwjgl.vulkan.VkPhysicalDevice r5, @org.lwjgl.system.NativeType("VkFormat") int r6, @org.lwjgl.system.NativeType("VkFormatProperties2 *") org.lwjgl.vulkan.VkFormatProperties2 r7) {
            r0 = r5
            r1 = r6
            r2 = r7
            long r2 = r2.address()
            nvkGetPhysicalDeviceFormatProperties2(r0, r1, r2)
            return
    }

    public static int nvkGetPhysicalDeviceImageFormatProperties2(org.lwjgl.vulkan.VkPhysicalDevice r9, long r10, long r12) {
            r0 = r9
            org.lwjgl.vulkan.VKCapabilitiesInstance r0 = r0.getCapabilities()
            long r0 = r0.vkGetPhysicalDeviceImageFormatProperties2
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
    public static int vkGetPhysicalDeviceImageFormatProperties2(org.lwjgl.vulkan.VkPhysicalDevice r6, @org.lwjgl.system.NativeType("VkPhysicalDeviceImageFormatInfo2 const *") org.lwjgl.vulkan.VkPhysicalDeviceImageFormatInfo2 r7, @org.lwjgl.system.NativeType("VkImageFormatProperties2 *") org.lwjgl.vulkan.VkImageFormatProperties2 r8) {
            r0 = r6
            r1 = r7
            long r1 = r1.address()
            r2 = r8
            long r2 = r2.address()
            int r0 = nvkGetPhysicalDeviceImageFormatProperties2(r0, r1, r2)
            return r0
    }

    public static void nvkGetPhysicalDeviceQueueFamilyProperties2(org.lwjgl.vulkan.VkPhysicalDevice r9, long r10, long r12) {
            r0 = r9
            org.lwjgl.vulkan.VKCapabilitiesInstance r0 = r0.getCapabilities()
            long r0 = r0.vkGetPhysicalDeviceQueueFamilyProperties2
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

    public static void vkGetPhysicalDeviceQueueFamilyProperties2(org.lwjgl.vulkan.VkPhysicalDevice r6, @org.lwjgl.system.NativeType("uint32_t *") java.nio.IntBuffer r7, @javax.annotation.Nullable @org.lwjgl.system.NativeType("VkQueueFamilyProperties2 *") org.lwjgl.vulkan.VkQueueFamilyProperties2.Buffer r8) {
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
            nvkGetPhysicalDeviceQueueFamilyProperties2(r0, r1, r2)
            return
    }

    public static void nvkGetPhysicalDeviceMemoryProperties2(org.lwjgl.vulkan.VkPhysicalDevice r7, long r8) {
            r0 = r7
            org.lwjgl.vulkan.VKCapabilitiesInstance r0 = r0.getCapabilities()
            long r0 = r0.vkGetPhysicalDeviceMemoryProperties2
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

    public static void vkGetPhysicalDeviceMemoryProperties2(org.lwjgl.vulkan.VkPhysicalDevice r4, @org.lwjgl.system.NativeType("VkPhysicalDeviceMemoryProperties2 *") org.lwjgl.vulkan.VkPhysicalDeviceMemoryProperties2 r5) {
            r0 = r4
            r1 = r5
            long r1 = r1.address()
            nvkGetPhysicalDeviceMemoryProperties2(r0, r1)
            return
    }

    public static void nvkGetPhysicalDeviceSparseImageFormatProperties2(org.lwjgl.vulkan.VkPhysicalDevice r11, long r12, long r14, long r16) {
            r0 = r11
            org.lwjgl.vulkan.VKCapabilitiesInstance r0 = r0.getCapabilities()
            long r0 = r0.vkGetPhysicalDeviceSparseImageFormatProperties2
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
            org.lwjgl.system.JNI.callPPPPV(r0, r1, r2, r3, r4)
            return
    }

    public static void vkGetPhysicalDeviceSparseImageFormatProperties2(org.lwjgl.vulkan.VkPhysicalDevice r8, @org.lwjgl.system.NativeType("VkPhysicalDeviceSparseImageFormatInfo2 const *") org.lwjgl.vulkan.VkPhysicalDeviceSparseImageFormatInfo2 r9, @org.lwjgl.system.NativeType("uint32_t *") java.nio.IntBuffer r10, @javax.annotation.Nullable @org.lwjgl.system.NativeType("VkSparseImageFormatProperties2 *") org.lwjgl.vulkan.VkSparseImageFormatProperties2.Buffer r11) {
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
            nvkGetPhysicalDeviceSparseImageFormatProperties2(r0, r1, r2, r3)
            return
    }

    public static void vkTrimCommandPool(org.lwjgl.vulkan.VkDevice r8, @org.lwjgl.system.NativeType("VkCommandPool") long r9, @org.lwjgl.system.NativeType("VkCommandPoolTrimFlags") int r11) {
            r0 = r8
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkTrimCommandPool
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

    public static void nvkGetDeviceQueue2(org.lwjgl.vulkan.VkDevice r9, long r10, long r12) {
            r0 = r9
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkGetDeviceQueue2
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

    public static void vkGetDeviceQueue2(org.lwjgl.vulkan.VkDevice r6, @org.lwjgl.system.NativeType("VkDeviceQueueInfo2 const *") org.lwjgl.vulkan.VkDeviceQueueInfo2 r7, @org.lwjgl.system.NativeType("VkQueue *") org.lwjgl.PointerBuffer r8) {
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
            nvkGetDeviceQueue2(r0, r1, r2)
            return
    }

    public static int nvkCreateSamplerYcbcrConversion(org.lwjgl.vulkan.VkDevice r11, long r12, long r14, long r16) {
            r0 = r11
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkCreateSamplerYcbcrConversion
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
    public static int vkCreateSamplerYcbcrConversion(org.lwjgl.vulkan.VkDevice r8, @org.lwjgl.system.NativeType("VkSamplerYcbcrConversionCreateInfo const *") org.lwjgl.vulkan.VkSamplerYcbcrConversionCreateInfo r9, @javax.annotation.Nullable @org.lwjgl.system.NativeType("VkAllocationCallbacks const *") org.lwjgl.vulkan.VkAllocationCallbacks r10, @org.lwjgl.system.NativeType("VkSamplerYcbcrConversion *") java.nio.LongBuffer r11) {
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
            int r0 = nvkCreateSamplerYcbcrConversion(r0, r1, r2, r3)
            return r0
    }

    public static void nvkDestroySamplerYcbcrConversion(org.lwjgl.vulkan.VkDevice r9, long r10, long r12) {
            r0 = r9
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkDestroySamplerYcbcrConversion
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

    public static void vkDestroySamplerYcbcrConversion(org.lwjgl.vulkan.VkDevice r6, @org.lwjgl.system.NativeType("VkSamplerYcbcrConversion") long r7, @javax.annotation.Nullable @org.lwjgl.system.NativeType("VkAllocationCallbacks const *") org.lwjgl.vulkan.VkAllocationCallbacks r9) {
            r0 = r6
            r1 = r7
            r2 = r9
            long r2 = org.lwjgl.system.MemoryUtil.memAddressSafe(r2)
            nvkDestroySamplerYcbcrConversion(r0, r1, r2)
            return
    }

    public static int nvkCreateDescriptorUpdateTemplate(org.lwjgl.vulkan.VkDevice r11, long r12, long r14, long r16) {
            r0 = r11
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkCreateDescriptorUpdateTemplate
            r18 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L19
            r0 = r18
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r12
            org.lwjgl.vulkan.VkDescriptorUpdateTemplateCreateInfo.validate(r0)
        L19:
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
    public static int vkCreateDescriptorUpdateTemplate(org.lwjgl.vulkan.VkDevice r8, @org.lwjgl.system.NativeType("VkDescriptorUpdateTemplateCreateInfo const *") org.lwjgl.vulkan.VkDescriptorUpdateTemplateCreateInfo r9, @javax.annotation.Nullable @org.lwjgl.system.NativeType("VkAllocationCallbacks const *") org.lwjgl.vulkan.VkAllocationCallbacks r10, @org.lwjgl.system.NativeType("VkDescriptorUpdateTemplate *") java.nio.LongBuffer r11) {
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
            int r0 = nvkCreateDescriptorUpdateTemplate(r0, r1, r2, r3)
            return r0
    }

    public static void nvkDestroyDescriptorUpdateTemplate(org.lwjgl.vulkan.VkDevice r9, long r10, long r12) {
            r0 = r9
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkDestroyDescriptorUpdateTemplate
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

    public static void vkDestroyDescriptorUpdateTemplate(org.lwjgl.vulkan.VkDevice r6, @org.lwjgl.system.NativeType("VkDescriptorUpdateTemplate") long r7, @javax.annotation.Nullable @org.lwjgl.system.NativeType("VkAllocationCallbacks const *") org.lwjgl.vulkan.VkAllocationCallbacks r9) {
            r0 = r6
            r1 = r7
            r2 = r9
            long r2 = org.lwjgl.system.MemoryUtil.memAddressSafe(r2)
            nvkDestroyDescriptorUpdateTemplate(r0, r1, r2)
            return
    }

    public static void vkUpdateDescriptorSetWithTemplate(org.lwjgl.vulkan.VkDevice r11, @org.lwjgl.system.NativeType("VkDescriptorSet") long r12, @org.lwjgl.system.NativeType("VkDescriptorUpdateTemplate") long r14, @org.lwjgl.system.NativeType("void const *") long r16) {
            r0 = r11
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkUpdateDescriptorSetWithTemplate
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
            org.lwjgl.system.JNI.callPJJPV(r0, r1, r2, r3, r4)
            return
    }

    public static void nvkGetPhysicalDeviceExternalBufferProperties(org.lwjgl.vulkan.VkPhysicalDevice r9, long r10, long r12) {
            r0 = r9
            org.lwjgl.vulkan.VKCapabilitiesInstance r0 = r0.getCapabilities()
            long r0 = r0.vkGetPhysicalDeviceExternalBufferProperties
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

    public static void vkGetPhysicalDeviceExternalBufferProperties(org.lwjgl.vulkan.VkPhysicalDevice r6, @org.lwjgl.system.NativeType("VkPhysicalDeviceExternalBufferInfo const *") org.lwjgl.vulkan.VkPhysicalDeviceExternalBufferInfo r7, @org.lwjgl.system.NativeType("VkExternalBufferProperties *") org.lwjgl.vulkan.VkExternalBufferProperties r8) {
            r0 = r6
            r1 = r7
            long r1 = r1.address()
            r2 = r8
            long r2 = r2.address()
            nvkGetPhysicalDeviceExternalBufferProperties(r0, r1, r2)
            return
    }

    public static void nvkGetPhysicalDeviceExternalFenceProperties(org.lwjgl.vulkan.VkPhysicalDevice r9, long r10, long r12) {
            r0 = r9
            org.lwjgl.vulkan.VKCapabilitiesInstance r0 = r0.getCapabilities()
            long r0 = r0.vkGetPhysicalDeviceExternalFenceProperties
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

    public static void vkGetPhysicalDeviceExternalFenceProperties(org.lwjgl.vulkan.VkPhysicalDevice r6, @org.lwjgl.system.NativeType("VkPhysicalDeviceExternalFenceInfo const *") org.lwjgl.vulkan.VkPhysicalDeviceExternalFenceInfo r7, @org.lwjgl.system.NativeType("VkExternalFenceProperties *") org.lwjgl.vulkan.VkExternalFenceProperties r8) {
            r0 = r6
            r1 = r7
            long r1 = r1.address()
            r2 = r8
            long r2 = r2.address()
            nvkGetPhysicalDeviceExternalFenceProperties(r0, r1, r2)
            return
    }

    public static void nvkGetPhysicalDeviceExternalSemaphoreProperties(org.lwjgl.vulkan.VkPhysicalDevice r9, long r10, long r12) {
            r0 = r9
            org.lwjgl.vulkan.VKCapabilitiesInstance r0 = r0.getCapabilities()
            long r0 = r0.vkGetPhysicalDeviceExternalSemaphoreProperties
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

    public static void vkGetPhysicalDeviceExternalSemaphoreProperties(org.lwjgl.vulkan.VkPhysicalDevice r6, @org.lwjgl.system.NativeType("VkPhysicalDeviceExternalSemaphoreInfo const *") org.lwjgl.vulkan.VkPhysicalDeviceExternalSemaphoreInfo r7, @org.lwjgl.system.NativeType("VkExternalSemaphoreProperties *") org.lwjgl.vulkan.VkExternalSemaphoreProperties r8) {
            r0 = r6
            r1 = r7
            long r1 = r1.address()
            r2 = r8
            long r2 = r2.address()
            nvkGetPhysicalDeviceExternalSemaphoreProperties(r0, r1, r2)
            return
    }

    public static void nvkGetDescriptorSetLayoutSupport(org.lwjgl.vulkan.VkDevice r9, long r10, long r12) {
            r0 = r9
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkGetDescriptorSetLayoutSupport
            r14 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L19
            r0 = r14
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r10
            org.lwjgl.vulkan.VkDescriptorSetLayoutCreateInfo.validate(r0)
        L19:
            r0 = r9
            long r0 = r0.address()
            r1 = r10
            r2 = r12
            r3 = r14
            org.lwjgl.system.JNI.callPPPV(r0, r1, r2, r3)
            return
    }

    public static void vkGetDescriptorSetLayoutSupport(org.lwjgl.vulkan.VkDevice r6, @org.lwjgl.system.NativeType("VkDescriptorSetLayoutCreateInfo const *") org.lwjgl.vulkan.VkDescriptorSetLayoutCreateInfo r7, @org.lwjgl.system.NativeType("VkDescriptorSetLayoutSupport *") org.lwjgl.vulkan.VkDescriptorSetLayoutSupport r8) {
            r0 = r6
            r1 = r7
            long r1 = r1.address()
            r2 = r8
            long r2 = r2.address()
            nvkGetDescriptorSetLayoutSupport(r0, r1, r2)
            return
    }

    @org.lwjgl.system.NativeType("VkResult")
    public static int vkEnumerateInstanceVersion(@org.lwjgl.system.NativeType("uint32_t *") int[] r4) {
            org.lwjgl.vulkan.VK$GlobalCommands r0 = org.lwjgl.vulkan.VK.getGlobalCommands()
            long r0 = r0.vkEnumerateInstanceVersion
            r5 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L17
            r0 = r5
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r4
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
        L17:
            r0 = r4
            r1 = r5
            int r0 = org.lwjgl.system.JNI.callPI(r0, r1)
            return r0
    }

    public static void vkGetDeviceGroupPeerMemoryFeatures(org.lwjgl.vulkan.VkDevice r9, @org.lwjgl.system.NativeType("uint32_t") int r10, @org.lwjgl.system.NativeType("uint32_t") int r11, @org.lwjgl.system.NativeType("uint32_t") int r12, @org.lwjgl.system.NativeType("VkPeerMemoryFeatureFlags *") int[] r13) {
            r0 = r9
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkGetDeviceGroupPeerMemoryFeatures
            r14 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L1b
            r0 = r14
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r13
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
        L1b:
            r0 = r9
            long r0 = r0.address()
            r1 = r10
            r2 = r11
            r3 = r12
            r4 = r13
            r5 = r14
            org.lwjgl.system.JNI.callPPV(r0, r1, r2, r3, r4, r5)
            return
    }

    @org.lwjgl.system.NativeType("VkResult")
    public static int vkEnumeratePhysicalDeviceGroups(org.lwjgl.vulkan.VkInstance r8, @org.lwjgl.system.NativeType("uint32_t *") int[] r9, @javax.annotation.Nullable @org.lwjgl.system.NativeType("VkPhysicalDeviceGroupProperties *") org.lwjgl.vulkan.VkPhysicalDeviceGroupProperties.Buffer r10) {
            r0 = r8
            org.lwjgl.vulkan.VKCapabilitiesInstance r0 = r0.getCapabilities()
            long r0 = r0.vkEnumeratePhysicalDeviceGroups
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

    public static void vkGetImageSparseMemoryRequirements2(org.lwjgl.vulkan.VkDevice r10, @org.lwjgl.system.NativeType("VkImageSparseMemoryRequirementsInfo2 const *") org.lwjgl.vulkan.VkImageSparseMemoryRequirementsInfo2 r11, @org.lwjgl.system.NativeType("uint32_t *") int[] r12, @javax.annotation.Nullable @org.lwjgl.system.NativeType("VkSparseImageMemoryRequirements2 *") org.lwjgl.vulkan.VkSparseImageMemoryRequirements2.Buffer r13) {
            r0 = r10
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkGetImageSparseMemoryRequirements2
            r14 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L21
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
        L21:
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

    public static void vkGetPhysicalDeviceQueueFamilyProperties2(org.lwjgl.vulkan.VkPhysicalDevice r8, @org.lwjgl.system.NativeType("uint32_t *") int[] r9, @javax.annotation.Nullable @org.lwjgl.system.NativeType("VkQueueFamilyProperties2 *") org.lwjgl.vulkan.VkQueueFamilyProperties2.Buffer r10) {
            r0 = r8
            org.lwjgl.vulkan.VKCapabilitiesInstance r0 = r0.getCapabilities()
            long r0 = r0.vkGetPhysicalDeviceQueueFamilyProperties2
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
            org.lwjgl.system.JNI.callPPPV(r0, r1, r2, r3)
            return
    }

    public static void vkGetPhysicalDeviceSparseImageFormatProperties2(org.lwjgl.vulkan.VkPhysicalDevice r10, @org.lwjgl.system.NativeType("VkPhysicalDeviceSparseImageFormatInfo2 const *") org.lwjgl.vulkan.VkPhysicalDeviceSparseImageFormatInfo2 r11, @org.lwjgl.system.NativeType("uint32_t *") int[] r12, @javax.annotation.Nullable @org.lwjgl.system.NativeType("VkSparseImageFormatProperties2 *") org.lwjgl.vulkan.VkSparseImageFormatProperties2.Buffer r13) {
            r0 = r10
            org.lwjgl.vulkan.VKCapabilitiesInstance r0 = r0.getCapabilities()
            long r0 = r0.vkGetPhysicalDeviceSparseImageFormatProperties2
            r14 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L21
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
        L21:
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

    @org.lwjgl.system.NativeType("VkResult")
    public static int vkCreateSamplerYcbcrConversion(org.lwjgl.vulkan.VkDevice r10, @org.lwjgl.system.NativeType("VkSamplerYcbcrConversionCreateInfo const *") org.lwjgl.vulkan.VkSamplerYcbcrConversionCreateInfo r11, @javax.annotation.Nullable @org.lwjgl.system.NativeType("VkAllocationCallbacks const *") org.lwjgl.vulkan.VkAllocationCallbacks r12, @org.lwjgl.system.NativeType("VkSamplerYcbcrConversion *") long[] r13) {
            r0 = r10
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkCreateSamplerYcbcrConversion
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

    @org.lwjgl.system.NativeType("VkResult")
    public static int vkCreateDescriptorUpdateTemplate(org.lwjgl.vulkan.VkDevice r10, @org.lwjgl.system.NativeType("VkDescriptorUpdateTemplateCreateInfo const *") org.lwjgl.vulkan.VkDescriptorUpdateTemplateCreateInfo r11, @javax.annotation.Nullable @org.lwjgl.system.NativeType("VkAllocationCallbacks const *") org.lwjgl.vulkan.VkAllocationCallbacks r12, @org.lwjgl.system.NativeType("VkDescriptorUpdateTemplate *") long[] r13) {
            r0 = r10
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkCreateDescriptorUpdateTemplate
            r14 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L21
            r0 = r14
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r13
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
            r0 = r11
            long r0 = r0.address()
            org.lwjgl.vulkan.VkDescriptorUpdateTemplateCreateInfo.validate(r0)
        L21:
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

    static {
            r0 = 0
            r1 = 1
            r2 = 1
            r3 = 0
            int r0 = VK_MAKE_API_VERSION(r0, r1, r2, r3)
            org.lwjgl.vulkan.VK11.VK_API_VERSION_1_1 = r0
            return
    }
}
