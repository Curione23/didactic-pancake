package org.lwjgl.vulkan;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VK10.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VK10.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VK10.class */
public class VK10 {
    public static final int VK_SUCCESS = 0;
    public static final int VK_NOT_READY = 1;
    public static final int VK_TIMEOUT = 2;
    public static final int VK_EVENT_SET = 3;
    public static final int VK_EVENT_RESET = 4;
    public static final int VK_INCOMPLETE = 5;
    public static final int VK_ERROR_OUT_OF_HOST_MEMORY = -1;
    public static final int VK_ERROR_OUT_OF_DEVICE_MEMORY = -2;
    public static final int VK_ERROR_INITIALIZATION_FAILED = -3;
    public static final int VK_ERROR_DEVICE_LOST = -4;
    public static final int VK_ERROR_MEMORY_MAP_FAILED = -5;
    public static final int VK_ERROR_LAYER_NOT_PRESENT = -6;
    public static final int VK_ERROR_EXTENSION_NOT_PRESENT = -7;
    public static final int VK_ERROR_FEATURE_NOT_PRESENT = -8;
    public static final int VK_ERROR_INCOMPATIBLE_DRIVER = -9;
    public static final int VK_ERROR_TOO_MANY_OBJECTS = -10;
    public static final int VK_ERROR_FORMAT_NOT_SUPPORTED = -11;
    public static final int VK_ERROR_FRAGMENTED_POOL = -12;
    public static final int VK_ERROR_UNKNOWN = -13;
    public static final int VK_STRUCTURE_TYPE_APPLICATION_INFO = 0;
    public static final int VK_STRUCTURE_TYPE_INSTANCE_CREATE_INFO = 1;
    public static final int VK_STRUCTURE_TYPE_DEVICE_QUEUE_CREATE_INFO = 2;
    public static final int VK_STRUCTURE_TYPE_DEVICE_CREATE_INFO = 3;
    public static final int VK_STRUCTURE_TYPE_SUBMIT_INFO = 4;
    public static final int VK_STRUCTURE_TYPE_MEMORY_ALLOCATE_INFO = 5;
    public static final int VK_STRUCTURE_TYPE_MAPPED_MEMORY_RANGE = 6;
    public static final int VK_STRUCTURE_TYPE_BIND_SPARSE_INFO = 7;
    public static final int VK_STRUCTURE_TYPE_FENCE_CREATE_INFO = 8;
    public static final int VK_STRUCTURE_TYPE_SEMAPHORE_CREATE_INFO = 9;
    public static final int VK_STRUCTURE_TYPE_EVENT_CREATE_INFO = 10;
    public static final int VK_STRUCTURE_TYPE_QUERY_POOL_CREATE_INFO = 11;
    public static final int VK_STRUCTURE_TYPE_BUFFER_CREATE_INFO = 12;
    public static final int VK_STRUCTURE_TYPE_BUFFER_VIEW_CREATE_INFO = 13;
    public static final int VK_STRUCTURE_TYPE_IMAGE_CREATE_INFO = 14;
    public static final int VK_STRUCTURE_TYPE_IMAGE_VIEW_CREATE_INFO = 15;
    public static final int VK_STRUCTURE_TYPE_SHADER_MODULE_CREATE_INFO = 16;
    public static final int VK_STRUCTURE_TYPE_PIPELINE_CACHE_CREATE_INFO = 17;
    public static final int VK_STRUCTURE_TYPE_PIPELINE_SHADER_STAGE_CREATE_INFO = 18;
    public static final int VK_STRUCTURE_TYPE_PIPELINE_VERTEX_INPUT_STATE_CREATE_INFO = 19;
    public static final int VK_STRUCTURE_TYPE_PIPELINE_INPUT_ASSEMBLY_STATE_CREATE_INFO = 20;
    public static final int VK_STRUCTURE_TYPE_PIPELINE_TESSELLATION_STATE_CREATE_INFO = 21;
    public static final int VK_STRUCTURE_TYPE_PIPELINE_VIEWPORT_STATE_CREATE_INFO = 22;
    public static final int VK_STRUCTURE_TYPE_PIPELINE_RASTERIZATION_STATE_CREATE_INFO = 23;
    public static final int VK_STRUCTURE_TYPE_PIPELINE_MULTISAMPLE_STATE_CREATE_INFO = 24;
    public static final int VK_STRUCTURE_TYPE_PIPELINE_DEPTH_STENCIL_STATE_CREATE_INFO = 25;
    public static final int VK_STRUCTURE_TYPE_PIPELINE_COLOR_BLEND_STATE_CREATE_INFO = 26;
    public static final int VK_STRUCTURE_TYPE_PIPELINE_DYNAMIC_STATE_CREATE_INFO = 27;
    public static final int VK_STRUCTURE_TYPE_GRAPHICS_PIPELINE_CREATE_INFO = 28;
    public static final int VK_STRUCTURE_TYPE_COMPUTE_PIPELINE_CREATE_INFO = 29;
    public static final int VK_STRUCTURE_TYPE_PIPELINE_LAYOUT_CREATE_INFO = 30;
    public static final int VK_STRUCTURE_TYPE_SAMPLER_CREATE_INFO = 31;
    public static final int VK_STRUCTURE_TYPE_DESCRIPTOR_SET_LAYOUT_CREATE_INFO = 32;
    public static final int VK_STRUCTURE_TYPE_DESCRIPTOR_POOL_CREATE_INFO = 33;
    public static final int VK_STRUCTURE_TYPE_DESCRIPTOR_SET_ALLOCATE_INFO = 34;
    public static final int VK_STRUCTURE_TYPE_WRITE_DESCRIPTOR_SET = 35;
    public static final int VK_STRUCTURE_TYPE_COPY_DESCRIPTOR_SET = 36;
    public static final int VK_STRUCTURE_TYPE_FRAMEBUFFER_CREATE_INFO = 37;
    public static final int VK_STRUCTURE_TYPE_RENDER_PASS_CREATE_INFO = 38;
    public static final int VK_STRUCTURE_TYPE_COMMAND_POOL_CREATE_INFO = 39;
    public static final int VK_STRUCTURE_TYPE_COMMAND_BUFFER_ALLOCATE_INFO = 40;
    public static final int VK_STRUCTURE_TYPE_COMMAND_BUFFER_INHERITANCE_INFO = 41;
    public static final int VK_STRUCTURE_TYPE_COMMAND_BUFFER_BEGIN_INFO = 42;
    public static final int VK_STRUCTURE_TYPE_RENDER_PASS_BEGIN_INFO = 43;
    public static final int VK_STRUCTURE_TYPE_BUFFER_MEMORY_BARRIER = 44;
    public static final int VK_STRUCTURE_TYPE_IMAGE_MEMORY_BARRIER = 45;
    public static final int VK_STRUCTURE_TYPE_MEMORY_BARRIER = 46;
    public static final int VK_STRUCTURE_TYPE_LOADER_INSTANCE_CREATE_INFO = 47;
    public static final int VK_STRUCTURE_TYPE_LOADER_DEVICE_CREATE_INFO = 48;
    public static final int VK_PIPELINE_CACHE_HEADER_VERSION_ONE = 1;
    public static final int VK_ACCESS_INDIRECT_COMMAND_READ_BIT = 1;
    public static final int VK_ACCESS_INDEX_READ_BIT = 2;
    public static final int VK_ACCESS_VERTEX_ATTRIBUTE_READ_BIT = 4;
    public static final int VK_ACCESS_UNIFORM_READ_BIT = 8;
    public static final int VK_ACCESS_INPUT_ATTACHMENT_READ_BIT = 16;
    public static final int VK_ACCESS_SHADER_READ_BIT = 32;
    public static final int VK_ACCESS_SHADER_WRITE_BIT = 64;
    public static final int VK_ACCESS_COLOR_ATTACHMENT_READ_BIT = 128;
    public static final int VK_ACCESS_COLOR_ATTACHMENT_WRITE_BIT = 256;
    public static final int VK_ACCESS_DEPTH_STENCIL_ATTACHMENT_READ_BIT = 512;
    public static final int VK_ACCESS_DEPTH_STENCIL_ATTACHMENT_WRITE_BIT = 1024;
    public static final int VK_ACCESS_TRANSFER_READ_BIT = 2048;
    public static final int VK_ACCESS_TRANSFER_WRITE_BIT = 4096;
    public static final int VK_ACCESS_HOST_READ_BIT = 8192;
    public static final int VK_ACCESS_HOST_WRITE_BIT = 16384;
    public static final int VK_ACCESS_MEMORY_READ_BIT = 32768;
    public static final int VK_ACCESS_MEMORY_WRITE_BIT = 65536;
    public static final int VK_IMAGE_LAYOUT_UNDEFINED = 0;
    public static final int VK_IMAGE_LAYOUT_GENERAL = 1;
    public static final int VK_IMAGE_LAYOUT_COLOR_ATTACHMENT_OPTIMAL = 2;
    public static final int VK_IMAGE_LAYOUT_DEPTH_STENCIL_ATTACHMENT_OPTIMAL = 3;
    public static final int VK_IMAGE_LAYOUT_DEPTH_STENCIL_READ_ONLY_OPTIMAL = 4;
    public static final int VK_IMAGE_LAYOUT_SHADER_READ_ONLY_OPTIMAL = 5;
    public static final int VK_IMAGE_LAYOUT_TRANSFER_SRC_OPTIMAL = 6;
    public static final int VK_IMAGE_LAYOUT_TRANSFER_DST_OPTIMAL = 7;
    public static final int VK_IMAGE_LAYOUT_PREINITIALIZED = 8;
    public static final int VK_IMAGE_ASPECT_COLOR_BIT = 1;
    public static final int VK_IMAGE_ASPECT_DEPTH_BIT = 2;
    public static final int VK_IMAGE_ASPECT_STENCIL_BIT = 4;
    public static final int VK_IMAGE_ASPECT_METADATA_BIT = 8;
    public static final int VK_OBJECT_TYPE_UNKNOWN = 0;
    public static final int VK_OBJECT_TYPE_INSTANCE = 1;
    public static final int VK_OBJECT_TYPE_PHYSICAL_DEVICE = 2;
    public static final int VK_OBJECT_TYPE_DEVICE = 3;
    public static final int VK_OBJECT_TYPE_QUEUE = 4;
    public static final int VK_OBJECT_TYPE_SEMAPHORE = 5;
    public static final int VK_OBJECT_TYPE_COMMAND_BUFFER = 6;
    public static final int VK_OBJECT_TYPE_FENCE = 7;
    public static final int VK_OBJECT_TYPE_DEVICE_MEMORY = 8;
    public static final int VK_OBJECT_TYPE_BUFFER = 9;
    public static final int VK_OBJECT_TYPE_IMAGE = 10;
    public static final int VK_OBJECT_TYPE_EVENT = 11;
    public static final int VK_OBJECT_TYPE_QUERY_POOL = 12;
    public static final int VK_OBJECT_TYPE_BUFFER_VIEW = 13;
    public static final int VK_OBJECT_TYPE_IMAGE_VIEW = 14;
    public static final int VK_OBJECT_TYPE_SHADER_MODULE = 15;
    public static final int VK_OBJECT_TYPE_PIPELINE_CACHE = 16;
    public static final int VK_OBJECT_TYPE_PIPELINE_LAYOUT = 17;
    public static final int VK_OBJECT_TYPE_RENDER_PASS = 18;
    public static final int VK_OBJECT_TYPE_PIPELINE = 19;
    public static final int VK_OBJECT_TYPE_DESCRIPTOR_SET_LAYOUT = 20;
    public static final int VK_OBJECT_TYPE_SAMPLER = 21;
    public static final int VK_OBJECT_TYPE_DESCRIPTOR_POOL = 22;
    public static final int VK_OBJECT_TYPE_DESCRIPTOR_SET = 23;
    public static final int VK_OBJECT_TYPE_FRAMEBUFFER = 24;
    public static final int VK_OBJECT_TYPE_COMMAND_POOL = 25;
    public static final int VK_VENDOR_ID_VIV = 65537;
    public static final int VK_VENDOR_ID_VSI = 65538;
    public static final int VK_VENDOR_ID_KAZAN = 65539;
    public static final int VK_VENDOR_ID_CODEPLAY = 65540;
    public static final int VK_VENDOR_ID_MESA = 65541;
    public static final int VK_VENDOR_ID_POCL = 65542;
    public static final int VK_VENDOR_ID_MOBILEYE = 65543;
    public static final int VK_SYSTEM_ALLOCATION_SCOPE_COMMAND = 0;
    public static final int VK_SYSTEM_ALLOCATION_SCOPE_OBJECT = 1;
    public static final int VK_SYSTEM_ALLOCATION_SCOPE_CACHE = 2;
    public static final int VK_SYSTEM_ALLOCATION_SCOPE_DEVICE = 3;
    public static final int VK_SYSTEM_ALLOCATION_SCOPE_INSTANCE = 4;
    public static final int VK_INTERNAL_ALLOCATION_TYPE_EXECUTABLE = 0;
    public static final int VK_FORMAT_UNDEFINED = 0;
    public static final int VK_FORMAT_R4G4_UNORM_PACK8 = 1;
    public static final int VK_FORMAT_R4G4B4A4_UNORM_PACK16 = 2;
    public static final int VK_FORMAT_B4G4R4A4_UNORM_PACK16 = 3;
    public static final int VK_FORMAT_R5G6B5_UNORM_PACK16 = 4;
    public static final int VK_FORMAT_B5G6R5_UNORM_PACK16 = 5;
    public static final int VK_FORMAT_R5G5B5A1_UNORM_PACK16 = 6;
    public static final int VK_FORMAT_B5G5R5A1_UNORM_PACK16 = 7;
    public static final int VK_FORMAT_A1R5G5B5_UNORM_PACK16 = 8;
    public static final int VK_FORMAT_R8_UNORM = 9;
    public static final int VK_FORMAT_R8_SNORM = 10;
    public static final int VK_FORMAT_R8_USCALED = 11;
    public static final int VK_FORMAT_R8_SSCALED = 12;
    public static final int VK_FORMAT_R8_UINT = 13;
    public static final int VK_FORMAT_R8_SINT = 14;
    public static final int VK_FORMAT_R8_SRGB = 15;
    public static final int VK_FORMAT_R8G8_UNORM = 16;
    public static final int VK_FORMAT_R8G8_SNORM = 17;
    public static final int VK_FORMAT_R8G8_USCALED = 18;
    public static final int VK_FORMAT_R8G8_SSCALED = 19;
    public static final int VK_FORMAT_R8G8_UINT = 20;
    public static final int VK_FORMAT_R8G8_SINT = 21;
    public static final int VK_FORMAT_R8G8_SRGB = 22;
    public static final int VK_FORMAT_R8G8B8_UNORM = 23;
    public static final int VK_FORMAT_R8G8B8_SNORM = 24;
    public static final int VK_FORMAT_R8G8B8_USCALED = 25;
    public static final int VK_FORMAT_R8G8B8_SSCALED = 26;
    public static final int VK_FORMAT_R8G8B8_UINT = 27;
    public static final int VK_FORMAT_R8G8B8_SINT = 28;
    public static final int VK_FORMAT_R8G8B8_SRGB = 29;
    public static final int VK_FORMAT_B8G8R8_UNORM = 30;
    public static final int VK_FORMAT_B8G8R8_SNORM = 31;
    public static final int VK_FORMAT_B8G8R8_USCALED = 32;
    public static final int VK_FORMAT_B8G8R8_SSCALED = 33;
    public static final int VK_FORMAT_B8G8R8_UINT = 34;
    public static final int VK_FORMAT_B8G8R8_SINT = 35;
    public static final int VK_FORMAT_B8G8R8_SRGB = 36;
    public static final int VK_FORMAT_R8G8B8A8_UNORM = 37;
    public static final int VK_FORMAT_R8G8B8A8_SNORM = 38;
    public static final int VK_FORMAT_R8G8B8A8_USCALED = 39;
    public static final int VK_FORMAT_R8G8B8A8_SSCALED = 40;
    public static final int VK_FORMAT_R8G8B8A8_UINT = 41;
    public static final int VK_FORMAT_R8G8B8A8_SINT = 42;
    public static final int VK_FORMAT_R8G8B8A8_SRGB = 43;
    public static final int VK_FORMAT_B8G8R8A8_UNORM = 44;
    public static final int VK_FORMAT_B8G8R8A8_SNORM = 45;
    public static final int VK_FORMAT_B8G8R8A8_USCALED = 46;
    public static final int VK_FORMAT_B8G8R8A8_SSCALED = 47;
    public static final int VK_FORMAT_B8G8R8A8_UINT = 48;
    public static final int VK_FORMAT_B8G8R8A8_SINT = 49;
    public static final int VK_FORMAT_B8G8R8A8_SRGB = 50;
    public static final int VK_FORMAT_A8B8G8R8_UNORM_PACK32 = 51;
    public static final int VK_FORMAT_A8B8G8R8_SNORM_PACK32 = 52;
    public static final int VK_FORMAT_A8B8G8R8_USCALED_PACK32 = 53;
    public static final int VK_FORMAT_A8B8G8R8_SSCALED_PACK32 = 54;
    public static final int VK_FORMAT_A8B8G8R8_UINT_PACK32 = 55;
    public static final int VK_FORMAT_A8B8G8R8_SINT_PACK32 = 56;
    public static final int VK_FORMAT_A8B8G8R8_SRGB_PACK32 = 57;
    public static final int VK_FORMAT_A2R10G10B10_UNORM_PACK32 = 58;
    public static final int VK_FORMAT_A2R10G10B10_SNORM_PACK32 = 59;
    public static final int VK_FORMAT_A2R10G10B10_USCALED_PACK32 = 60;
    public static final int VK_FORMAT_A2R10G10B10_SSCALED_PACK32 = 61;
    public static final int VK_FORMAT_A2R10G10B10_UINT_PACK32 = 62;
    public static final int VK_FORMAT_A2R10G10B10_SINT_PACK32 = 63;
    public static final int VK_FORMAT_A2B10G10R10_UNORM_PACK32 = 64;
    public static final int VK_FORMAT_A2B10G10R10_SNORM_PACK32 = 65;
    public static final int VK_FORMAT_A2B10G10R10_USCALED_PACK32 = 66;
    public static final int VK_FORMAT_A2B10G10R10_SSCALED_PACK32 = 67;
    public static final int VK_FORMAT_A2B10G10R10_UINT_PACK32 = 68;
    public static final int VK_FORMAT_A2B10G10R10_SINT_PACK32 = 69;
    public static final int VK_FORMAT_R16_UNORM = 70;
    public static final int VK_FORMAT_R16_SNORM = 71;
    public static final int VK_FORMAT_R16_USCALED = 72;
    public static final int VK_FORMAT_R16_SSCALED = 73;
    public static final int VK_FORMAT_R16_UINT = 74;
    public static final int VK_FORMAT_R16_SINT = 75;
    public static final int VK_FORMAT_R16_SFLOAT = 76;
    public static final int VK_FORMAT_R16G16_UNORM = 77;
    public static final int VK_FORMAT_R16G16_SNORM = 78;
    public static final int VK_FORMAT_R16G16_USCALED = 79;
    public static final int VK_FORMAT_R16G16_SSCALED = 80;
    public static final int VK_FORMAT_R16G16_UINT = 81;
    public static final int VK_FORMAT_R16G16_SINT = 82;
    public static final int VK_FORMAT_R16G16_SFLOAT = 83;
    public static final int VK_FORMAT_R16G16B16_UNORM = 84;
    public static final int VK_FORMAT_R16G16B16_SNORM = 85;
    public static final int VK_FORMAT_R16G16B16_USCALED = 86;
    public static final int VK_FORMAT_R16G16B16_SSCALED = 87;
    public static final int VK_FORMAT_R16G16B16_UINT = 88;
    public static final int VK_FORMAT_R16G16B16_SINT = 89;
    public static final int VK_FORMAT_R16G16B16_SFLOAT = 90;
    public static final int VK_FORMAT_R16G16B16A16_UNORM = 91;
    public static final int VK_FORMAT_R16G16B16A16_SNORM = 92;
    public static final int VK_FORMAT_R16G16B16A16_USCALED = 93;
    public static final int VK_FORMAT_R16G16B16A16_SSCALED = 94;
    public static final int VK_FORMAT_R16G16B16A16_UINT = 95;
    public static final int VK_FORMAT_R16G16B16A16_SINT = 96;
    public static final int VK_FORMAT_R16G16B16A16_SFLOAT = 97;
    public static final int VK_FORMAT_R32_UINT = 98;
    public static final int VK_FORMAT_R32_SINT = 99;
    public static final int VK_FORMAT_R32_SFLOAT = 100;
    public static final int VK_FORMAT_R32G32_UINT = 101;
    public static final int VK_FORMAT_R32G32_SINT = 102;
    public static final int VK_FORMAT_R32G32_SFLOAT = 103;
    public static final int VK_FORMAT_R32G32B32_UINT = 104;
    public static final int VK_FORMAT_R32G32B32_SINT = 105;
    public static final int VK_FORMAT_R32G32B32_SFLOAT = 106;
    public static final int VK_FORMAT_R32G32B32A32_UINT = 107;
    public static final int VK_FORMAT_R32G32B32A32_SINT = 108;
    public static final int VK_FORMAT_R32G32B32A32_SFLOAT = 109;
    public static final int VK_FORMAT_R64_UINT = 110;
    public static final int VK_FORMAT_R64_SINT = 111;
    public static final int VK_FORMAT_R64_SFLOAT = 112;
    public static final int VK_FORMAT_R64G64_UINT = 113;
    public static final int VK_FORMAT_R64G64_SINT = 114;
    public static final int VK_FORMAT_R64G64_SFLOAT = 115;
    public static final int VK_FORMAT_R64G64B64_UINT = 116;
    public static final int VK_FORMAT_R64G64B64_SINT = 117;
    public static final int VK_FORMAT_R64G64B64_SFLOAT = 118;
    public static final int VK_FORMAT_R64G64B64A64_UINT = 119;
    public static final int VK_FORMAT_R64G64B64A64_SINT = 120;
    public static final int VK_FORMAT_R64G64B64A64_SFLOAT = 121;
    public static final int VK_FORMAT_B10G11R11_UFLOAT_PACK32 = 122;
    public static final int VK_FORMAT_E5B9G9R9_UFLOAT_PACK32 = 123;
    public static final int VK_FORMAT_D16_UNORM = 124;
    public static final int VK_FORMAT_X8_D24_UNORM_PACK32 = 125;
    public static final int VK_FORMAT_D32_SFLOAT = 126;
    public static final int VK_FORMAT_S8_UINT = 127;
    public static final int VK_FORMAT_D16_UNORM_S8_UINT = 128;
    public static final int VK_FORMAT_D24_UNORM_S8_UINT = 129;
    public static final int VK_FORMAT_D32_SFLOAT_S8_UINT = 130;
    public static final int VK_FORMAT_BC1_RGB_UNORM_BLOCK = 131;
    public static final int VK_FORMAT_BC1_RGB_SRGB_BLOCK = 132;
    public static final int VK_FORMAT_BC1_RGBA_UNORM_BLOCK = 133;
    public static final int VK_FORMAT_BC1_RGBA_SRGB_BLOCK = 134;
    public static final int VK_FORMAT_BC2_UNORM_BLOCK = 135;
    public static final int VK_FORMAT_BC2_SRGB_BLOCK = 136;
    public static final int VK_FORMAT_BC3_UNORM_BLOCK = 137;
    public static final int VK_FORMAT_BC3_SRGB_BLOCK = 138;
    public static final int VK_FORMAT_BC4_UNORM_BLOCK = 139;
    public static final int VK_FORMAT_BC4_SNORM_BLOCK = 140;
    public static final int VK_FORMAT_BC5_UNORM_BLOCK = 141;
    public static final int VK_FORMAT_BC5_SNORM_BLOCK = 142;
    public static final int VK_FORMAT_BC6H_UFLOAT_BLOCK = 143;
    public static final int VK_FORMAT_BC6H_SFLOAT_BLOCK = 144;
    public static final int VK_FORMAT_BC7_UNORM_BLOCK = 145;
    public static final int VK_FORMAT_BC7_SRGB_BLOCK = 146;
    public static final int VK_FORMAT_ETC2_R8G8B8_UNORM_BLOCK = 147;
    public static final int VK_FORMAT_ETC2_R8G8B8_SRGB_BLOCK = 148;
    public static final int VK_FORMAT_ETC2_R8G8B8A1_UNORM_BLOCK = 149;
    public static final int VK_FORMAT_ETC2_R8G8B8A1_SRGB_BLOCK = 150;
    public static final int VK_FORMAT_ETC2_R8G8B8A8_UNORM_BLOCK = 151;
    public static final int VK_FORMAT_ETC2_R8G8B8A8_SRGB_BLOCK = 152;
    public static final int VK_FORMAT_EAC_R11_UNORM_BLOCK = 153;
    public static final int VK_FORMAT_EAC_R11_SNORM_BLOCK = 154;
    public static final int VK_FORMAT_EAC_R11G11_UNORM_BLOCK = 155;
    public static final int VK_FORMAT_EAC_R11G11_SNORM_BLOCK = 156;
    public static final int VK_FORMAT_ASTC_4x4_UNORM_BLOCK = 157;
    public static final int VK_FORMAT_ASTC_4x4_SRGB_BLOCK = 158;
    public static final int VK_FORMAT_ASTC_5x4_UNORM_BLOCK = 159;
    public static final int VK_FORMAT_ASTC_5x4_SRGB_BLOCK = 160;
    public static final int VK_FORMAT_ASTC_5x5_UNORM_BLOCK = 161;
    public static final int VK_FORMAT_ASTC_5x5_SRGB_BLOCK = 162;
    public static final int VK_FORMAT_ASTC_6x5_UNORM_BLOCK = 163;
    public static final int VK_FORMAT_ASTC_6x5_SRGB_BLOCK = 164;
    public static final int VK_FORMAT_ASTC_6x6_UNORM_BLOCK = 165;
    public static final int VK_FORMAT_ASTC_6x6_SRGB_BLOCK = 166;
    public static final int VK_FORMAT_ASTC_8x5_UNORM_BLOCK = 167;
    public static final int VK_FORMAT_ASTC_8x5_SRGB_BLOCK = 168;
    public static final int VK_FORMAT_ASTC_8x6_UNORM_BLOCK = 169;
    public static final int VK_FORMAT_ASTC_8x6_SRGB_BLOCK = 170;
    public static final int VK_FORMAT_ASTC_8x8_UNORM_BLOCK = 171;
    public static final int VK_FORMAT_ASTC_8x8_SRGB_BLOCK = 172;
    public static final int VK_FORMAT_ASTC_10x5_UNORM_BLOCK = 173;
    public static final int VK_FORMAT_ASTC_10x5_SRGB_BLOCK = 174;
    public static final int VK_FORMAT_ASTC_10x6_UNORM_BLOCK = 175;
    public static final int VK_FORMAT_ASTC_10x6_SRGB_BLOCK = 176;
    public static final int VK_FORMAT_ASTC_10x8_UNORM_BLOCK = 177;
    public static final int VK_FORMAT_ASTC_10x8_SRGB_BLOCK = 178;
    public static final int VK_FORMAT_ASTC_10x10_UNORM_BLOCK = 179;
    public static final int VK_FORMAT_ASTC_10x10_SRGB_BLOCK = 180;
    public static final int VK_FORMAT_ASTC_12x10_UNORM_BLOCK = 181;
    public static final int VK_FORMAT_ASTC_12x10_SRGB_BLOCK = 182;
    public static final int VK_FORMAT_ASTC_12x12_UNORM_BLOCK = 183;
    public static final int VK_FORMAT_ASTC_12x12_SRGB_BLOCK = 184;
    public static final int VK_FORMAT_FEATURE_SAMPLED_IMAGE_BIT = 1;
    public static final int VK_FORMAT_FEATURE_STORAGE_IMAGE_BIT = 2;
    public static final int VK_FORMAT_FEATURE_STORAGE_IMAGE_ATOMIC_BIT = 4;
    public static final int VK_FORMAT_FEATURE_UNIFORM_TEXEL_BUFFER_BIT = 8;
    public static final int VK_FORMAT_FEATURE_STORAGE_TEXEL_BUFFER_BIT = 16;
    public static final int VK_FORMAT_FEATURE_STORAGE_TEXEL_BUFFER_ATOMIC_BIT = 32;
    public static final int VK_FORMAT_FEATURE_VERTEX_BUFFER_BIT = 64;
    public static final int VK_FORMAT_FEATURE_COLOR_ATTACHMENT_BIT = 128;
    public static final int VK_FORMAT_FEATURE_COLOR_ATTACHMENT_BLEND_BIT = 256;
    public static final int VK_FORMAT_FEATURE_DEPTH_STENCIL_ATTACHMENT_BIT = 512;
    public static final int VK_FORMAT_FEATURE_BLIT_SRC_BIT = 1024;
    public static final int VK_FORMAT_FEATURE_BLIT_DST_BIT = 2048;
    public static final int VK_FORMAT_FEATURE_SAMPLED_IMAGE_FILTER_LINEAR_BIT = 4096;
    public static final int VK_IMAGE_CREATE_SPARSE_BINDING_BIT = 1;
    public static final int VK_IMAGE_CREATE_SPARSE_RESIDENCY_BIT = 2;
    public static final int VK_IMAGE_CREATE_SPARSE_ALIASED_BIT = 4;
    public static final int VK_IMAGE_CREATE_MUTABLE_FORMAT_BIT = 8;
    public static final int VK_IMAGE_CREATE_CUBE_COMPATIBLE_BIT = 16;
    public static final int VK_SAMPLE_COUNT_1_BIT = 1;
    public static final int VK_SAMPLE_COUNT_2_BIT = 2;
    public static final int VK_SAMPLE_COUNT_4_BIT = 4;
    public static final int VK_SAMPLE_COUNT_8_BIT = 8;
    public static final int VK_SAMPLE_COUNT_16_BIT = 16;
    public static final int VK_SAMPLE_COUNT_32_BIT = 32;
    public static final int VK_SAMPLE_COUNT_64_BIT = 64;
    public static final int VK_IMAGE_TILING_OPTIMAL = 0;
    public static final int VK_IMAGE_TILING_LINEAR = 1;
    public static final int VK_IMAGE_TYPE_1D = 0;
    public static final int VK_IMAGE_TYPE_2D = 1;
    public static final int VK_IMAGE_TYPE_3D = 2;
    public static final int VK_IMAGE_USAGE_TRANSFER_SRC_BIT = 1;
    public static final int VK_IMAGE_USAGE_TRANSFER_DST_BIT = 2;
    public static final int VK_IMAGE_USAGE_SAMPLED_BIT = 4;
    public static final int VK_IMAGE_USAGE_STORAGE_BIT = 8;
    public static final int VK_IMAGE_USAGE_COLOR_ATTACHMENT_BIT = 16;
    public static final int VK_IMAGE_USAGE_DEPTH_STENCIL_ATTACHMENT_BIT = 32;
    public static final int VK_IMAGE_USAGE_TRANSIENT_ATTACHMENT_BIT = 64;
    public static final int VK_IMAGE_USAGE_INPUT_ATTACHMENT_BIT = 128;
    public static final int VK_MEMORY_HEAP_DEVICE_LOCAL_BIT = 1;
    public static final int VK_MEMORY_PROPERTY_DEVICE_LOCAL_BIT = 1;
    public static final int VK_MEMORY_PROPERTY_HOST_VISIBLE_BIT = 2;
    public static final int VK_MEMORY_PROPERTY_HOST_COHERENT_BIT = 4;
    public static final int VK_MEMORY_PROPERTY_HOST_CACHED_BIT = 8;
    public static final int VK_MEMORY_PROPERTY_LAZILY_ALLOCATED_BIT = 16;
    public static final int VK_PHYSICAL_DEVICE_TYPE_OTHER = 0;
    public static final int VK_PHYSICAL_DEVICE_TYPE_INTEGRATED_GPU = 1;
    public static final int VK_PHYSICAL_DEVICE_TYPE_DISCRETE_GPU = 2;
    public static final int VK_PHYSICAL_DEVICE_TYPE_VIRTUAL_GPU = 3;
    public static final int VK_PHYSICAL_DEVICE_TYPE_CPU = 4;
    public static final int VK_QUEUE_GRAPHICS_BIT = 1;
    public static final int VK_QUEUE_COMPUTE_BIT = 2;
    public static final int VK_QUEUE_TRANSFER_BIT = 4;
    public static final int VK_QUEUE_SPARSE_BINDING_BIT = 8;
    public static final int VK_PIPELINE_STAGE_TOP_OF_PIPE_BIT = 1;
    public static final int VK_PIPELINE_STAGE_DRAW_INDIRECT_BIT = 2;
    public static final int VK_PIPELINE_STAGE_VERTEX_INPUT_BIT = 4;
    public static final int VK_PIPELINE_STAGE_VERTEX_SHADER_BIT = 8;
    public static final int VK_PIPELINE_STAGE_TESSELLATION_CONTROL_SHADER_BIT = 16;
    public static final int VK_PIPELINE_STAGE_TESSELLATION_EVALUATION_SHADER_BIT = 32;
    public static final int VK_PIPELINE_STAGE_GEOMETRY_SHADER_BIT = 64;
    public static final int VK_PIPELINE_STAGE_FRAGMENT_SHADER_BIT = 128;
    public static final int VK_PIPELINE_STAGE_EARLY_FRAGMENT_TESTS_BIT = 256;
    public static final int VK_PIPELINE_STAGE_LATE_FRAGMENT_TESTS_BIT = 512;
    public static final int VK_PIPELINE_STAGE_COLOR_ATTACHMENT_OUTPUT_BIT = 1024;
    public static final int VK_PIPELINE_STAGE_COMPUTE_SHADER_BIT = 2048;
    public static final int VK_PIPELINE_STAGE_TRANSFER_BIT = 4096;
    public static final int VK_PIPELINE_STAGE_BOTTOM_OF_PIPE_BIT = 8192;
    public static final int VK_PIPELINE_STAGE_HOST_BIT = 16384;
    public static final int VK_PIPELINE_STAGE_ALL_GRAPHICS_BIT = 32768;
    public static final int VK_PIPELINE_STAGE_ALL_COMMANDS_BIT = 65536;
    public static final int VK_SPARSE_MEMORY_BIND_METADATA_BIT = 1;
    public static final int VK_SPARSE_IMAGE_FORMAT_SINGLE_MIPTAIL_BIT = 1;
    public static final int VK_SPARSE_IMAGE_FORMAT_ALIGNED_MIP_SIZE_BIT = 2;
    public static final int VK_SPARSE_IMAGE_FORMAT_NONSTANDARD_BLOCK_SIZE_BIT = 4;
    public static final int VK_FENCE_CREATE_SIGNALED_BIT = 1;
    public static final int VK_QUERY_PIPELINE_STATISTIC_INPUT_ASSEMBLY_VERTICES_BIT = 1;
    public static final int VK_QUERY_PIPELINE_STATISTIC_INPUT_ASSEMBLY_PRIMITIVES_BIT = 2;
    public static final int VK_QUERY_PIPELINE_STATISTIC_VERTEX_SHADER_INVOCATIONS_BIT = 4;
    public static final int VK_QUERY_PIPELINE_STATISTIC_GEOMETRY_SHADER_INVOCATIONS_BIT = 8;
    public static final int VK_QUERY_PIPELINE_STATISTIC_GEOMETRY_SHADER_PRIMITIVES_BIT = 16;
    public static final int VK_QUERY_PIPELINE_STATISTIC_CLIPPING_INVOCATIONS_BIT = 32;
    public static final int VK_QUERY_PIPELINE_STATISTIC_CLIPPING_PRIMITIVES_BIT = 64;
    public static final int VK_QUERY_PIPELINE_STATISTIC_FRAGMENT_SHADER_INVOCATIONS_BIT = 128;
    public static final int VK_QUERY_PIPELINE_STATISTIC_TESSELLATION_CONTROL_SHADER_PATCHES_BIT = 256;
    public static final int VK_QUERY_PIPELINE_STATISTIC_TESSELLATION_EVALUATION_SHADER_INVOCATIONS_BIT = 512;
    public static final int VK_QUERY_PIPELINE_STATISTIC_COMPUTE_SHADER_INVOCATIONS_BIT = 1024;
    public static final int VK_QUERY_TYPE_OCCLUSION = 0;
    public static final int VK_QUERY_TYPE_PIPELINE_STATISTICS = 1;
    public static final int VK_QUERY_TYPE_TIMESTAMP = 2;
    public static final int VK_QUERY_RESULT_64_BIT = 1;
    public static final int VK_QUERY_RESULT_WAIT_BIT = 2;
    public static final int VK_QUERY_RESULT_WITH_AVAILABILITY_BIT = 4;
    public static final int VK_QUERY_RESULT_PARTIAL_BIT = 8;
    public static final int VK_BUFFER_CREATE_SPARSE_BINDING_BIT = 1;
    public static final int VK_BUFFER_CREATE_SPARSE_RESIDENCY_BIT = 2;
    public static final int VK_BUFFER_CREATE_SPARSE_ALIASED_BIT = 4;
    public static final int VK_BUFFER_USAGE_TRANSFER_SRC_BIT = 1;
    public static final int VK_BUFFER_USAGE_TRANSFER_DST_BIT = 2;
    public static final int VK_BUFFER_USAGE_UNIFORM_TEXEL_BUFFER_BIT = 4;
    public static final int VK_BUFFER_USAGE_STORAGE_TEXEL_BUFFER_BIT = 8;
    public static final int VK_BUFFER_USAGE_UNIFORM_BUFFER_BIT = 16;
    public static final int VK_BUFFER_USAGE_STORAGE_BUFFER_BIT = 32;
    public static final int VK_BUFFER_USAGE_INDEX_BUFFER_BIT = 64;
    public static final int VK_BUFFER_USAGE_VERTEX_BUFFER_BIT = 128;
    public static final int VK_BUFFER_USAGE_INDIRECT_BUFFER_BIT = 256;
    public static final int VK_SHARING_MODE_EXCLUSIVE = 0;
    public static final int VK_SHARING_MODE_CONCURRENT = 1;
    public static final int VK_COMPONENT_SWIZZLE_IDENTITY = 0;
    public static final int VK_COMPONENT_SWIZZLE_ZERO = 1;
    public static final int VK_COMPONENT_SWIZZLE_ONE = 2;
    public static final int VK_COMPONENT_SWIZZLE_R = 3;
    public static final int VK_COMPONENT_SWIZZLE_G = 4;
    public static final int VK_COMPONENT_SWIZZLE_B = 5;
    public static final int VK_COMPONENT_SWIZZLE_A = 6;
    public static final int VK_IMAGE_VIEW_TYPE_1D = 0;
    public static final int VK_IMAGE_VIEW_TYPE_2D = 1;
    public static final int VK_IMAGE_VIEW_TYPE_3D = 2;
    public static final int VK_IMAGE_VIEW_TYPE_CUBE = 3;
    public static final int VK_IMAGE_VIEW_TYPE_1D_ARRAY = 4;
    public static final int VK_IMAGE_VIEW_TYPE_2D_ARRAY = 5;
    public static final int VK_IMAGE_VIEW_TYPE_CUBE_ARRAY = 6;
    public static final int VK_BLEND_FACTOR_ZERO = 0;
    public static final int VK_BLEND_FACTOR_ONE = 1;
    public static final int VK_BLEND_FACTOR_SRC_COLOR = 2;
    public static final int VK_BLEND_FACTOR_ONE_MINUS_SRC_COLOR = 3;
    public static final int VK_BLEND_FACTOR_DST_COLOR = 4;
    public static final int VK_BLEND_FACTOR_ONE_MINUS_DST_COLOR = 5;
    public static final int VK_BLEND_FACTOR_SRC_ALPHA = 6;
    public static final int VK_BLEND_FACTOR_ONE_MINUS_SRC_ALPHA = 7;
    public static final int VK_BLEND_FACTOR_DST_ALPHA = 8;
    public static final int VK_BLEND_FACTOR_ONE_MINUS_DST_ALPHA = 9;
    public static final int VK_BLEND_FACTOR_CONSTANT_COLOR = 10;
    public static final int VK_BLEND_FACTOR_ONE_MINUS_CONSTANT_COLOR = 11;
    public static final int VK_BLEND_FACTOR_CONSTANT_ALPHA = 12;
    public static final int VK_BLEND_FACTOR_ONE_MINUS_CONSTANT_ALPHA = 13;
    public static final int VK_BLEND_FACTOR_SRC_ALPHA_SATURATE = 14;
    public static final int VK_BLEND_FACTOR_SRC1_COLOR = 15;
    public static final int VK_BLEND_FACTOR_ONE_MINUS_SRC1_COLOR = 16;
    public static final int VK_BLEND_FACTOR_SRC1_ALPHA = 17;
    public static final int VK_BLEND_FACTOR_ONE_MINUS_SRC1_ALPHA = 18;
    public static final int VK_BLEND_OP_ADD = 0;
    public static final int VK_BLEND_OP_SUBTRACT = 1;
    public static final int VK_BLEND_OP_REVERSE_SUBTRACT = 2;
    public static final int VK_BLEND_OP_MIN = 3;
    public static final int VK_BLEND_OP_MAX = 4;
    public static final int VK_COLOR_COMPONENT_R_BIT = 1;
    public static final int VK_COLOR_COMPONENT_G_BIT = 2;
    public static final int VK_COLOR_COMPONENT_B_BIT = 4;
    public static final int VK_COLOR_COMPONENT_A_BIT = 8;
    public static final int VK_COMPARE_OP_NEVER = 0;
    public static final int VK_COMPARE_OP_LESS = 1;
    public static final int VK_COMPARE_OP_EQUAL = 2;
    public static final int VK_COMPARE_OP_LESS_OR_EQUAL = 3;
    public static final int VK_COMPARE_OP_GREATER = 4;
    public static final int VK_COMPARE_OP_NOT_EQUAL = 5;
    public static final int VK_COMPARE_OP_GREATER_OR_EQUAL = 6;
    public static final int VK_COMPARE_OP_ALWAYS = 7;
    public static final int VK_PIPELINE_CREATE_DISABLE_OPTIMIZATION_BIT = 1;
    public static final int VK_PIPELINE_CREATE_ALLOW_DERIVATIVES_BIT = 2;
    public static final int VK_PIPELINE_CREATE_DERIVATIVE_BIT = 4;
    public static final int VK_SHADER_STAGE_VERTEX_BIT = 1;
    public static final int VK_SHADER_STAGE_TESSELLATION_CONTROL_BIT = 2;
    public static final int VK_SHADER_STAGE_TESSELLATION_EVALUATION_BIT = 4;
    public static final int VK_SHADER_STAGE_GEOMETRY_BIT = 8;
    public static final int VK_SHADER_STAGE_FRAGMENT_BIT = 16;
    public static final int VK_SHADER_STAGE_COMPUTE_BIT = 32;
    public static final int VK_SHADER_STAGE_ALL_GRAPHICS = 31;
    public static final int VK_SHADER_STAGE_ALL = Integer.MAX_VALUE;
    public static final int VK_CULL_MODE_NONE = 0;
    public static final int VK_CULL_MODE_FRONT_BIT = 1;
    public static final int VK_CULL_MODE_BACK_BIT = 2;
    public static final int VK_CULL_MODE_FRONT_AND_BACK = 3;
    public static final int VK_DYNAMIC_STATE_VIEWPORT = 0;
    public static final int VK_DYNAMIC_STATE_SCISSOR = 1;
    public static final int VK_DYNAMIC_STATE_LINE_WIDTH = 2;
    public static final int VK_DYNAMIC_STATE_DEPTH_BIAS = 3;
    public static final int VK_DYNAMIC_STATE_BLEND_CONSTANTS = 4;
    public static final int VK_DYNAMIC_STATE_DEPTH_BOUNDS = 5;
    public static final int VK_DYNAMIC_STATE_STENCIL_COMPARE_MASK = 6;
    public static final int VK_DYNAMIC_STATE_STENCIL_WRITE_MASK = 7;
    public static final int VK_DYNAMIC_STATE_STENCIL_REFERENCE = 8;
    public static final int VK_FRONT_FACE_COUNTER_CLOCKWISE = 0;
    public static final int VK_FRONT_FACE_CLOCKWISE = 1;
    public static final int VK_VERTEX_INPUT_RATE_VERTEX = 0;
    public static final int VK_VERTEX_INPUT_RATE_INSTANCE = 1;
    public static final int VK_PRIMITIVE_TOPOLOGY_POINT_LIST = 0;
    public static final int VK_PRIMITIVE_TOPOLOGY_LINE_LIST = 1;
    public static final int VK_PRIMITIVE_TOPOLOGY_LINE_STRIP = 2;
    public static final int VK_PRIMITIVE_TOPOLOGY_TRIANGLE_LIST = 3;
    public static final int VK_PRIMITIVE_TOPOLOGY_TRIANGLE_STRIP = 4;
    public static final int VK_PRIMITIVE_TOPOLOGY_TRIANGLE_FAN = 5;
    public static final int VK_PRIMITIVE_TOPOLOGY_LINE_LIST_WITH_ADJACENCY = 6;
    public static final int VK_PRIMITIVE_TOPOLOGY_LINE_STRIP_WITH_ADJACENCY = 7;
    public static final int VK_PRIMITIVE_TOPOLOGY_TRIANGLE_LIST_WITH_ADJACENCY = 8;
    public static final int VK_PRIMITIVE_TOPOLOGY_TRIANGLE_STRIP_WITH_ADJACENCY = 9;
    public static final int VK_PRIMITIVE_TOPOLOGY_PATCH_LIST = 10;
    public static final int VK_POLYGON_MODE_FILL = 0;
    public static final int VK_POLYGON_MODE_LINE = 1;
    public static final int VK_POLYGON_MODE_POINT = 2;
    public static final int VK_STENCIL_OP_KEEP = 0;
    public static final int VK_STENCIL_OP_ZERO = 1;
    public static final int VK_STENCIL_OP_REPLACE = 2;
    public static final int VK_STENCIL_OP_INCREMENT_AND_CLAMP = 3;
    public static final int VK_STENCIL_OP_DECREMENT_AND_CLAMP = 4;
    public static final int VK_STENCIL_OP_INVERT = 5;
    public static final int VK_STENCIL_OP_INCREMENT_AND_WRAP = 6;
    public static final int VK_STENCIL_OP_DECREMENT_AND_WRAP = 7;
    public static final int VK_LOGIC_OP_CLEAR = 0;
    public static final int VK_LOGIC_OP_AND = 1;
    public static final int VK_LOGIC_OP_AND_REVERSE = 2;
    public static final int VK_LOGIC_OP_COPY = 3;
    public static final int VK_LOGIC_OP_AND_INVERTED = 4;
    public static final int VK_LOGIC_OP_NO_OP = 5;
    public static final int VK_LOGIC_OP_XOR = 6;
    public static final int VK_LOGIC_OP_OR = 7;
    public static final int VK_LOGIC_OP_NOR = 8;
    public static final int VK_LOGIC_OP_EQUIVALENT = 9;
    public static final int VK_LOGIC_OP_INVERT = 10;
    public static final int VK_LOGIC_OP_OR_REVERSE = 11;
    public static final int VK_LOGIC_OP_COPY_INVERTED = 12;
    public static final int VK_LOGIC_OP_OR_INVERTED = 13;
    public static final int VK_LOGIC_OP_NAND = 14;
    public static final int VK_LOGIC_OP_SET = 15;
    public static final int VK_BORDER_COLOR_FLOAT_TRANSPARENT_BLACK = 0;
    public static final int VK_BORDER_COLOR_INT_TRANSPARENT_BLACK = 1;
    public static final int VK_BORDER_COLOR_FLOAT_OPAQUE_BLACK = 2;
    public static final int VK_BORDER_COLOR_INT_OPAQUE_BLACK = 3;
    public static final int VK_BORDER_COLOR_FLOAT_OPAQUE_WHITE = 4;
    public static final int VK_BORDER_COLOR_INT_OPAQUE_WHITE = 5;
    public static final int VK_FILTER_NEAREST = 0;
    public static final int VK_FILTER_LINEAR = 1;
    public static final int VK_SAMPLER_ADDRESS_MODE_REPEAT = 0;
    public static final int VK_SAMPLER_ADDRESS_MODE_MIRRORED_REPEAT = 1;
    public static final int VK_SAMPLER_ADDRESS_MODE_CLAMP_TO_EDGE = 2;
    public static final int VK_SAMPLER_ADDRESS_MODE_CLAMP_TO_BORDER = 3;
    public static final int VK_SAMPLER_MIPMAP_MODE_NEAREST = 0;
    public static final int VK_SAMPLER_MIPMAP_MODE_LINEAR = 1;
    public static final int VK_DESCRIPTOR_POOL_CREATE_FREE_DESCRIPTOR_SET_BIT = 1;
    public static final int VK_DESCRIPTOR_TYPE_SAMPLER = 0;
    public static final int VK_DESCRIPTOR_TYPE_COMBINED_IMAGE_SAMPLER = 1;
    public static final int VK_DESCRIPTOR_TYPE_SAMPLED_IMAGE = 2;
    public static final int VK_DESCRIPTOR_TYPE_STORAGE_IMAGE = 3;
    public static final int VK_DESCRIPTOR_TYPE_UNIFORM_TEXEL_BUFFER = 4;
    public static final int VK_DESCRIPTOR_TYPE_STORAGE_TEXEL_BUFFER = 5;
    public static final int VK_DESCRIPTOR_TYPE_UNIFORM_BUFFER = 6;
    public static final int VK_DESCRIPTOR_TYPE_STORAGE_BUFFER = 7;
    public static final int VK_DESCRIPTOR_TYPE_UNIFORM_BUFFER_DYNAMIC = 8;
    public static final int VK_DESCRIPTOR_TYPE_STORAGE_BUFFER_DYNAMIC = 9;
    public static final int VK_DESCRIPTOR_TYPE_INPUT_ATTACHMENT = 10;
    public static final int VK_ATTACHMENT_DESCRIPTION_MAY_ALIAS_BIT = 1;
    public static final int VK_ATTACHMENT_LOAD_OP_LOAD = 0;
    public static final int VK_ATTACHMENT_LOAD_OP_CLEAR = 1;
    public static final int VK_ATTACHMENT_LOAD_OP_DONT_CARE = 2;
    public static final int VK_ATTACHMENT_STORE_OP_STORE = 0;
    public static final int VK_ATTACHMENT_STORE_OP_DONT_CARE = 1;
    public static final int VK_DEPENDENCY_BY_REGION_BIT = 1;
    public static final int VK_PIPELINE_BIND_POINT_GRAPHICS = 0;
    public static final int VK_PIPELINE_BIND_POINT_COMPUTE = 1;
    public static final int VK_COMMAND_POOL_CREATE_TRANSIENT_BIT = 1;
    public static final int VK_COMMAND_POOL_CREATE_RESET_COMMAND_BUFFER_BIT = 2;
    public static final int VK_COMMAND_POOL_RESET_RELEASE_RESOURCES_BIT = 1;
    public static final int VK_COMMAND_BUFFER_LEVEL_PRIMARY = 0;
    public static final int VK_COMMAND_BUFFER_LEVEL_SECONDARY = 1;
    public static final int VK_COMMAND_BUFFER_USAGE_ONE_TIME_SUBMIT_BIT = 1;
    public static final int VK_COMMAND_BUFFER_USAGE_RENDER_PASS_CONTINUE_BIT = 2;
    public static final int VK_COMMAND_BUFFER_USAGE_SIMULTANEOUS_USE_BIT = 4;
    public static final int VK_QUERY_CONTROL_PRECISE_BIT = 1;
    public static final int VK_COMMAND_BUFFER_RESET_RELEASE_RESOURCES_BIT = 1;
    public static final int VK_INDEX_TYPE_UINT16 = 0;
    public static final int VK_INDEX_TYPE_UINT32 = 1;
    public static final int VK_STENCIL_FACE_FRONT_BIT = 1;
    public static final int VK_STENCIL_FACE_BACK_BIT = 2;
    public static final int VK_STENCIL_FACE_FRONT_AND_BACK = 3;
    public static final int VK_STENCIL_FRONT_AND_BACK = 3;
    public static final int VK_SUBPASS_CONTENTS_INLINE = 0;
    public static final int VK_SUBPASS_CONTENTS_SECONDARY_COMMAND_BUFFERS = 1;
    public static final int VK_API_VERSION_1_0 = 0;
    public static final int VK_HEADER_VERSION = 264;
    public static final long VK_NULL_HANDLE = 0;
    public static final int VK_MAX_PHYSICAL_DEVICE_NAME_SIZE = 256;
    public static final int VK_UUID_SIZE = 16;
    public static final int VK_LUID_SIZE = 8;
    public static final int VK_MAX_EXTENSION_NAME_SIZE = 256;
    public static final int VK_MAX_DESCRIPTION_SIZE = 256;
    public static final int VK_MAX_MEMORY_TYPES = 32;
    public static final int VK_MAX_MEMORY_HEAPS = 16;
    public static final int VK_REMAINING_MIP_LEVELS = -1;
    public static final int VK_REMAINING_ARRAY_LAYERS = -1;
    public static final int VK_ATTACHMENT_UNUSED = -1;
    public static final int VK_TRUE = 1;
    public static final int VK_FALSE = 0;
    public static final int VK_QUEUE_FAMILY_IGNORED = -1;
    public static final int VK_QUEUE_FAMILY_EXTERNAL = -2;
    public static final int VK_SUBPASS_EXTERNAL = -1;
    public static final int VK_MAX_DEVICE_GROUP_SIZE = 32;
    public static final int VK_MAX_DRIVER_NAME_SIZE = 256;
    public static final int VK_MAX_DRIVER_INFO_SIZE = 256;
    public static final float VK_LOD_CLAMP_NONE = 1000.0f;
    public static final long VK_WHOLE_SIZE = -1;

    protected VK10() {
            r3 = this;
            r0 = r3
            r0.<init>()
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r1 = r0
            r1.<init>()
            throw r0
    }

    public static int nvkCreateInstance(long r9, long r11, long r13) {
            org.lwjgl.vulkan.VK$GlobalCommands r0 = org.lwjgl.vulkan.VK.getGlobalCommands()
            long r0 = r0.vkCreateInstance
            r15 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L12
            r0 = r9
            org.lwjgl.vulkan.VkInstanceCreateInfo.validate(r0)
        L12:
            r0 = r9
            r1 = r11
            r2 = r13
            r3 = r15
            int r0 = org.lwjgl.system.JNI.callPPPI(r0, r1, r2, r3)
            return r0
    }

    @org.lwjgl.system.NativeType("VkResult")
    public static int vkCreateInstance(@org.lwjgl.system.NativeType("VkInstanceCreateInfo const *") org.lwjgl.vulkan.VkInstanceCreateInfo r7, @javax.annotation.Nullable @org.lwjgl.system.NativeType("VkAllocationCallbacks const *") org.lwjgl.vulkan.VkAllocationCallbacks r8, @org.lwjgl.system.NativeType("VkInstance *") org.lwjgl.PointerBuffer r9) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r9
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
        Lb:
            r0 = r7
            long r0 = r0.address()
            r1 = r8
            long r1 = org.lwjgl.system.MemoryUtil.memAddressSafe(r1)
            r2 = r9
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            int r0 = nvkCreateInstance(r0, r1, r2)
            return r0
    }

    public static void nvkDestroyInstance(org.lwjgl.vulkan.VkInstance r7, long r8) {
            r0 = r7
            org.lwjgl.vulkan.VKCapabilitiesInstance r0 = r0.getCapabilities()
            long r0 = r0.vkDestroyInstance
            r10 = r0
            r0 = r7
            long r0 = r0.address()
            r1 = r8
            r2 = r10
            org.lwjgl.system.JNI.callPPV(r0, r1, r2)
            return
    }

    public static void vkDestroyInstance(org.lwjgl.vulkan.VkInstance r4, @javax.annotation.Nullable @org.lwjgl.system.NativeType("VkAllocationCallbacks const *") org.lwjgl.vulkan.VkAllocationCallbacks r5) {
            r0 = r4
            r1 = r5
            long r1 = org.lwjgl.system.MemoryUtil.memAddressSafe(r1)
            nvkDestroyInstance(r0, r1)
            return
    }

    public static int nvkEnumeratePhysicalDevices(org.lwjgl.vulkan.VkInstance r9, long r10, long r12) {
            r0 = r9
            org.lwjgl.vulkan.VKCapabilitiesInstance r0 = r0.getCapabilities()
            long r0 = r0.vkEnumeratePhysicalDevices
            r14 = r0
            r0 = r9
            long r0 = r0.address()
            r1 = r10
            r2 = r12
            r3 = r14
            int r0 = org.lwjgl.system.JNI.callPPPI(r0, r1, r2, r3)
            return r0
    }

    @org.lwjgl.system.NativeType("VkResult")
    public static int vkEnumeratePhysicalDevices(org.lwjgl.vulkan.VkInstance r6, @org.lwjgl.system.NativeType("uint32_t *") java.nio.IntBuffer r7, @javax.annotation.Nullable @org.lwjgl.system.NativeType("VkPhysicalDevice *") org.lwjgl.PointerBuffer r8) {
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
            int r0 = nvkEnumeratePhysicalDevices(r0, r1, r2)
            return r0
    }

    public static void nvkGetPhysicalDeviceFeatures(org.lwjgl.vulkan.VkPhysicalDevice r7, long r8) {
            r0 = r7
            org.lwjgl.vulkan.VKCapabilitiesInstance r0 = r0.getCapabilities()
            long r0 = r0.vkGetPhysicalDeviceFeatures
            r10 = r0
            r0 = r7
            long r0 = r0.address()
            r1 = r8
            r2 = r10
            org.lwjgl.system.JNI.callPPV(r0, r1, r2)
            return
    }

    public static void vkGetPhysicalDeviceFeatures(org.lwjgl.vulkan.VkPhysicalDevice r4, @org.lwjgl.system.NativeType("VkPhysicalDeviceFeatures *") org.lwjgl.vulkan.VkPhysicalDeviceFeatures r5) {
            r0 = r4
            r1 = r5
            long r1 = r1.address()
            nvkGetPhysicalDeviceFeatures(r0, r1)
            return
    }

    public static void nvkGetPhysicalDeviceFormatProperties(org.lwjgl.vulkan.VkPhysicalDevice r8, int r9, long r10) {
            r0 = r8
            org.lwjgl.vulkan.VKCapabilitiesInstance r0 = r0.getCapabilities()
            long r0 = r0.vkGetPhysicalDeviceFormatProperties
            r12 = r0
            r0 = r8
            long r0 = r0.address()
            r1 = r9
            r2 = r10
            r3 = r12
            org.lwjgl.system.JNI.callPPV(r0, r1, r2, r3)
            return
    }

    public static void vkGetPhysicalDeviceFormatProperties(org.lwjgl.vulkan.VkPhysicalDevice r5, @org.lwjgl.system.NativeType("VkFormat") int r6, @org.lwjgl.system.NativeType("VkFormatProperties *") org.lwjgl.vulkan.VkFormatProperties r7) {
            r0 = r5
            r1 = r6
            r2 = r7
            long r2 = r2.address()
            nvkGetPhysicalDeviceFormatProperties(r0, r1, r2)
            return
    }

    public static int nvkGetPhysicalDeviceImageFormatProperties(org.lwjgl.vulkan.VkPhysicalDevice r12, int r13, int r14, int r15, int r16, int r17, long r18) {
            r0 = r12
            org.lwjgl.vulkan.VKCapabilitiesInstance r0 = r0.getCapabilities()
            long r0 = r0.vkGetPhysicalDeviceImageFormatProperties
            r20 = r0
            r0 = r12
            long r0 = r0.address()
            r1 = r13
            r2 = r14
            r3 = r15
            r4 = r16
            r5 = r17
            r6 = r18
            r7 = r20
            int r0 = org.lwjgl.system.JNI.callPPI(r0, r1, r2, r3, r4, r5, r6, r7)
            return r0
    }

    @org.lwjgl.system.NativeType("VkResult")
    public static int vkGetPhysicalDeviceImageFormatProperties(org.lwjgl.vulkan.VkPhysicalDevice r9, @org.lwjgl.system.NativeType("VkFormat") int r10, @org.lwjgl.system.NativeType("VkImageType") int r11, @org.lwjgl.system.NativeType("VkImageTiling") int r12, @org.lwjgl.system.NativeType("VkImageUsageFlags") int r13, @org.lwjgl.system.NativeType("VkImageCreateFlags") int r14, @org.lwjgl.system.NativeType("VkImageFormatProperties *") org.lwjgl.vulkan.VkImageFormatProperties r15) {
            r0 = r9
            r1 = r10
            r2 = r11
            r3 = r12
            r4 = r13
            r5 = r14
            r6 = r15
            long r6 = r6.address()
            int r0 = nvkGetPhysicalDeviceImageFormatProperties(r0, r1, r2, r3, r4, r5, r6)
            return r0
    }

    public static void nvkGetPhysicalDeviceProperties(org.lwjgl.vulkan.VkPhysicalDevice r7, long r8) {
            r0 = r7
            org.lwjgl.vulkan.VKCapabilitiesInstance r0 = r0.getCapabilities()
            long r0 = r0.vkGetPhysicalDeviceProperties
            r10 = r0
            r0 = r7
            long r0 = r0.address()
            r1 = r8
            r2 = r10
            org.lwjgl.system.JNI.callPPV(r0, r1, r2)
            return
    }

    public static void vkGetPhysicalDeviceProperties(org.lwjgl.vulkan.VkPhysicalDevice r4, @org.lwjgl.system.NativeType("VkPhysicalDeviceProperties *") org.lwjgl.vulkan.VkPhysicalDeviceProperties r5) {
            r0 = r4
            r1 = r5
            long r1 = r1.address()
            nvkGetPhysicalDeviceProperties(r0, r1)
            return
    }

    public static void nvkGetPhysicalDeviceQueueFamilyProperties(org.lwjgl.vulkan.VkPhysicalDevice r9, long r10, long r12) {
            r0 = r9
            org.lwjgl.vulkan.VKCapabilitiesInstance r0 = r0.getCapabilities()
            long r0 = r0.vkGetPhysicalDeviceQueueFamilyProperties
            r14 = r0
            r0 = r9
            long r0 = r0.address()
            r1 = r10
            r2 = r12
            r3 = r14
            org.lwjgl.system.JNI.callPPPV(r0, r1, r2, r3)
            return
    }

    public static void vkGetPhysicalDeviceQueueFamilyProperties(org.lwjgl.vulkan.VkPhysicalDevice r6, @org.lwjgl.system.NativeType("uint32_t *") java.nio.IntBuffer r7, @javax.annotation.Nullable @org.lwjgl.system.NativeType("VkQueueFamilyProperties *") org.lwjgl.vulkan.VkQueueFamilyProperties.Buffer r8) {
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
            nvkGetPhysicalDeviceQueueFamilyProperties(r0, r1, r2)
            return
    }

    public static void nvkGetPhysicalDeviceMemoryProperties(org.lwjgl.vulkan.VkPhysicalDevice r7, long r8) {
            r0 = r7
            org.lwjgl.vulkan.VKCapabilitiesInstance r0 = r0.getCapabilities()
            long r0 = r0.vkGetPhysicalDeviceMemoryProperties
            r10 = r0
            r0 = r7
            long r0 = r0.address()
            r1 = r8
            r2 = r10
            org.lwjgl.system.JNI.callPPV(r0, r1, r2)
            return
    }

    public static void vkGetPhysicalDeviceMemoryProperties(org.lwjgl.vulkan.VkPhysicalDevice r4, @org.lwjgl.system.NativeType("VkPhysicalDeviceMemoryProperties *") org.lwjgl.vulkan.VkPhysicalDeviceMemoryProperties r5) {
            r0 = r4
            r1 = r5
            long r1 = r1.address()
            nvkGetPhysicalDeviceMemoryProperties(r0, r1)
            return
    }

    public static long nvkGetInstanceProcAddr(long r7, long r9) {
            org.lwjgl.vulkan.VK$GlobalCommands r0 = org.lwjgl.vulkan.VK.getGlobalCommands()
            long r0 = r0.vkGetInstanceProcAddr
            r11 = r0
            r0 = r7
            r1 = r9
            r2 = r11
            long r0 = org.lwjgl.system.JNI.callPPP(r0, r1, r2)
            return r0
    }

    @org.lwjgl.system.NativeType("PFN_vkVoidFunction")
    public static long vkGetInstanceProcAddr(@javax.annotation.Nullable org.lwjgl.vulkan.VkInstance r5, @org.lwjgl.system.NativeType("char const *") java.nio.ByteBuffer r6) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto La
            r0 = r6
            org.lwjgl.system.Checks.checkNT1(r0)
        La:
            r0 = r5
            long r0 = org.lwjgl.system.MemoryUtil.memAddressSafe(r0)
            r1 = r6
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            long r0 = nvkGetInstanceProcAddr(r0, r1)
            return r0
    }

    @org.lwjgl.system.NativeType("PFN_vkVoidFunction")
    public static long vkGetInstanceProcAddr(@javax.annotation.Nullable org.lwjgl.vulkan.VkInstance r5, @org.lwjgl.system.NativeType("char const *") java.lang.CharSequence r6) {
            org.lwjgl.system.MemoryStack r0 = org.lwjgl.system.MemoryStack.stackGet()
            r7 = r0
            r0 = r7
            int r0 = r0.getPointer()
            r8 = r0
            r0 = r7
            r1 = r6
            r2 = 1
            int r0 = r0.nASCII(r1, r2)     // Catch: java.lang.Throwable -> L29
            r0 = r7
            long r0 = r0.getPointerAddress()     // Catch: java.lang.Throwable -> L29
            r9 = r0
            r0 = r5
            long r0 = org.lwjgl.system.MemoryUtil.memAddressSafe(r0)     // Catch: java.lang.Throwable -> L29
            r1 = r9
            long r0 = nvkGetInstanceProcAddr(r0, r1)     // Catch: java.lang.Throwable -> L29
            r11 = r0
            r0 = r7
            r1 = r8
            r0.setPointer(r1)
            r0 = r11
            return r0
        L29:
            r13 = move-exception
            r0 = r7
            r1 = r8
            r0.setPointer(r1)
            r0 = r13
            throw r0
    }

    public static long nvkGetDeviceProcAddr(org.lwjgl.vulkan.VkDevice r7, long r8) {
            r0 = r7
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkGetDeviceProcAddr
            r10 = r0
            r0 = r7
            long r0 = r0.address()
            r1 = r8
            r2 = r10
            long r0 = org.lwjgl.system.JNI.callPPP(r0, r1, r2)
            return r0
    }

    @org.lwjgl.system.NativeType("PFN_vkVoidFunction")
    public static long vkGetDeviceProcAddr(org.lwjgl.vulkan.VkDevice r4, @org.lwjgl.system.NativeType("char const *") java.nio.ByteBuffer r5) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto La
            r0 = r5
            org.lwjgl.system.Checks.checkNT1(r0)
        La:
            r0 = r4
            r1 = r5
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            long r0 = nvkGetDeviceProcAddr(r0, r1)
            return r0
    }

    @org.lwjgl.system.NativeType("PFN_vkVoidFunction")
    public static long vkGetDeviceProcAddr(org.lwjgl.vulkan.VkDevice r4, @org.lwjgl.system.NativeType("char const *") java.lang.CharSequence r5) {
            org.lwjgl.system.MemoryStack r0 = org.lwjgl.system.MemoryStack.stackGet()
            r6 = r0
            r0 = r6
            int r0 = r0.getPointer()
            r7 = r0
            r0 = r6
            r1 = r5
            r2 = 1
            int r0 = r0.nASCII(r1, r2)     // Catch: java.lang.Throwable -> L26
            r0 = r6
            long r0 = r0.getPointerAddress()     // Catch: java.lang.Throwable -> L26
            r8 = r0
            r0 = r4
            r1 = r8
            long r0 = nvkGetDeviceProcAddr(r0, r1)     // Catch: java.lang.Throwable -> L26
            r10 = r0
            r0 = r6
            r1 = r7
            r0.setPointer(r1)
            r0 = r10
            return r0
        L26:
            r12 = move-exception
            r0 = r6
            r1 = r7
            r0.setPointer(r1)
            r0 = r12
            throw r0
    }

    public static int nvkCreateDevice(org.lwjgl.vulkan.VkPhysicalDevice r11, long r12, long r14, long r16) {
            r0 = r11
            org.lwjgl.vulkan.VKCapabilitiesInstance r0 = r0.getCapabilities()
            long r0 = r0.vkCreateDevice
            r18 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L13
            r0 = r12
            org.lwjgl.vulkan.VkDeviceCreateInfo.validate(r0)
        L13:
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
    public static int vkCreateDevice(org.lwjgl.vulkan.VkPhysicalDevice r8, @org.lwjgl.system.NativeType("VkDeviceCreateInfo const *") org.lwjgl.vulkan.VkDeviceCreateInfo r9, @javax.annotation.Nullable @org.lwjgl.system.NativeType("VkAllocationCallbacks const *") org.lwjgl.vulkan.VkAllocationCallbacks r10, @org.lwjgl.system.NativeType("VkDevice *") org.lwjgl.PointerBuffer r11) {
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
            int r0 = nvkCreateDevice(r0, r1, r2, r3)
            return r0
    }

    public static void nvkDestroyDevice(org.lwjgl.vulkan.VkDevice r7, long r8) {
            r0 = r7
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkDestroyDevice
            r10 = r0
            r0 = r7
            long r0 = r0.address()
            r1 = r8
            r2 = r10
            org.lwjgl.system.JNI.callPPV(r0, r1, r2)
            return
    }

    public static void vkDestroyDevice(org.lwjgl.vulkan.VkDevice r4, @javax.annotation.Nullable @org.lwjgl.system.NativeType("VkAllocationCallbacks const *") org.lwjgl.vulkan.VkAllocationCallbacks r5) {
            r0 = r4
            r1 = r5
            long r1 = org.lwjgl.system.MemoryUtil.memAddressSafe(r1)
            nvkDestroyDevice(r0, r1)
            return
    }

    public static int nvkEnumerateInstanceExtensionProperties(long r9, long r11, long r13) {
            org.lwjgl.vulkan.VK$GlobalCommands r0 = org.lwjgl.vulkan.VK.getGlobalCommands()
            long r0 = r0.vkEnumerateInstanceExtensionProperties
            r15 = r0
            r0 = r9
            r1 = r11
            r2 = r13
            r3 = r15
            int r0 = org.lwjgl.system.JNI.callPPPI(r0, r1, r2, r3)
            return r0
    }

    @org.lwjgl.system.NativeType("VkResult")
    public static int vkEnumerateInstanceExtensionProperties(@javax.annotation.Nullable @org.lwjgl.system.NativeType("char const *") java.nio.ByteBuffer r7, @org.lwjgl.system.NativeType("uint32_t *") java.nio.IntBuffer r8, @javax.annotation.Nullable @org.lwjgl.system.NativeType("VkExtensionProperties *") org.lwjgl.vulkan.VkExtensionProperties.Buffer r9) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L1b
            r0 = r7
            org.lwjgl.system.Checks.checkNT1Safe(r0)
            r0 = r8
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
            r0 = r9
            r1 = r8
            r2 = r8
            int r2 = r2.position()
            int r1 = r1.get(r2)
            org.lwjgl.system.Checks.checkSafe(r0, r1)
        L1b:
            r0 = r7
            long r0 = org.lwjgl.system.MemoryUtil.memAddressSafe(r0)
            r1 = r8
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            r2 = r9
            long r2 = org.lwjgl.system.MemoryUtil.memAddressSafe(r2)
            int r0 = nvkEnumerateInstanceExtensionProperties(r0, r1, r2)
            return r0
    }

    @org.lwjgl.system.NativeType("VkResult")
    public static int vkEnumerateInstanceExtensionProperties(@javax.annotation.Nullable @org.lwjgl.system.NativeType("char const *") java.lang.CharSequence r7, @org.lwjgl.system.NativeType("uint32_t *") java.nio.IntBuffer r8, @javax.annotation.Nullable @org.lwjgl.system.NativeType("VkExtensionProperties *") org.lwjgl.vulkan.VkExtensionProperties.Buffer r9) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L17
            r0 = r8
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
            r0 = r9
            r1 = r8
            r2 = r8
            int r2 = r2.position()
            int r1 = r1.get(r2)
            org.lwjgl.system.Checks.checkSafe(r0, r1)
        L17:
            org.lwjgl.system.MemoryStack r0 = org.lwjgl.system.MemoryStack.stackGet()
            r10 = r0
            r0 = r10
            int r0 = r0.getPointer()
            r11 = r0
            r0 = r10
            r1 = r7
            r2 = 1
            int r0 = r0.nUTF8Safe(r1, r2)     // Catch: java.lang.Throwable -> L4e
            r0 = r7
            if (r0 != 0) goto L30
            r0 = 0
            goto L34
        L30:
            r0 = r10
            long r0 = r0.getPointerAddress()     // Catch: java.lang.Throwable -> L4e
        L34:
            r12 = r0
            r0 = r12
            r1 = r8
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)     // Catch: java.lang.Throwable -> L4e
            r2 = r9
            long r2 = org.lwjgl.system.MemoryUtil.memAddressSafe(r2)     // Catch: java.lang.Throwable -> L4e
            int r0 = nvkEnumerateInstanceExtensionProperties(r0, r1, r2)     // Catch: java.lang.Throwable -> L4e
            r14 = r0
            r0 = r10
            r1 = r11
            r0.setPointer(r1)
            r0 = r14
            return r0
        L4e:
            r15 = move-exception
            r0 = r10
            r1 = r11
            r0.setPointer(r1)
            r0 = r15
            throw r0
    }

    public static int nvkEnumerateDeviceExtensionProperties(org.lwjgl.vulkan.VkPhysicalDevice r11, long r12, long r14, long r16) {
            r0 = r11
            org.lwjgl.vulkan.VKCapabilitiesInstance r0 = r0.getCapabilities()
            long r0 = r0.vkEnumerateDeviceExtensionProperties
            r18 = r0
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
    public static int vkEnumerateDeviceExtensionProperties(org.lwjgl.vulkan.VkPhysicalDevice r8, @javax.annotation.Nullable @org.lwjgl.system.NativeType("char const *") java.nio.ByteBuffer r9, @org.lwjgl.system.NativeType("uint32_t *") java.nio.IntBuffer r10, @javax.annotation.Nullable @org.lwjgl.system.NativeType("VkExtensionProperties *") org.lwjgl.vulkan.VkExtensionProperties.Buffer r11) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L1b
            r0 = r9
            org.lwjgl.system.Checks.checkNT1Safe(r0)
            r0 = r10
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
            r0 = r11
            r1 = r10
            r2 = r10
            int r2 = r2.position()
            int r1 = r1.get(r2)
            org.lwjgl.system.Checks.checkSafe(r0, r1)
        L1b:
            r0 = r8
            r1 = r9
            long r1 = org.lwjgl.system.MemoryUtil.memAddressSafe(r1)
            r2 = r10
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            r3 = r11
            long r3 = org.lwjgl.system.MemoryUtil.memAddressSafe(r3)
            int r0 = nvkEnumerateDeviceExtensionProperties(r0, r1, r2, r3)
            return r0
    }

    @org.lwjgl.system.NativeType("VkResult")
    public static int vkEnumerateDeviceExtensionProperties(org.lwjgl.vulkan.VkPhysicalDevice r8, @javax.annotation.Nullable @org.lwjgl.system.NativeType("char const *") java.lang.CharSequence r9, @org.lwjgl.system.NativeType("uint32_t *") java.nio.IntBuffer r10, @javax.annotation.Nullable @org.lwjgl.system.NativeType("VkExtensionProperties *") org.lwjgl.vulkan.VkExtensionProperties.Buffer r11) {
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
            org.lwjgl.system.MemoryStack r0 = org.lwjgl.system.MemoryStack.stackGet()
            r12 = r0
            r0 = r12
            int r0 = r0.getPointer()
            r13 = r0
            r0 = r12
            r1 = r9
            r2 = 1
            int r0 = r0.nUTF8Safe(r1, r2)     // Catch: java.lang.Throwable -> L54
            r0 = r9
            if (r0 != 0) goto L33
            r0 = 0
            goto L38
        L33:
            r0 = r12
            long r0 = r0.getPointerAddress()     // Catch: java.lang.Throwable -> L54
        L38:
            r14 = r0
            r0 = r8
            r1 = r14
            r2 = r10
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)     // Catch: java.lang.Throwable -> L54
            r3 = r11
            long r3 = org.lwjgl.system.MemoryUtil.memAddressSafe(r3)     // Catch: java.lang.Throwable -> L54
            int r0 = nvkEnumerateDeviceExtensionProperties(r0, r1, r2, r3)     // Catch: java.lang.Throwable -> L54
            r16 = r0
            r0 = r12
            r1 = r13
            r0.setPointer(r1)
            r0 = r16
            return r0
        L54:
            r17 = move-exception
            r0 = r12
            r1 = r13
            r0.setPointer(r1)
            r0 = r17
            throw r0
    }

    public static int nvkEnumerateInstanceLayerProperties(long r7, long r9) {
            org.lwjgl.vulkan.VK$GlobalCommands r0 = org.lwjgl.vulkan.VK.getGlobalCommands()
            long r0 = r0.vkEnumerateInstanceLayerProperties
            r11 = r0
            r0 = r7
            r1 = r9
            r2 = r11
            int r0 = org.lwjgl.system.JNI.callPPI(r0, r1, r2)
            return r0
    }

    @org.lwjgl.system.NativeType("VkResult")
    public static int vkEnumerateInstanceLayerProperties(@org.lwjgl.system.NativeType("uint32_t *") java.nio.IntBuffer r5, @javax.annotation.Nullable @org.lwjgl.system.NativeType("VkLayerProperties *") org.lwjgl.vulkan.VkLayerProperties.Buffer r6) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L17
            r0 = r5
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
            r0 = r6
            r1 = r5
            r2 = r5
            int r2 = r2.position()
            int r1 = r1.get(r2)
            org.lwjgl.system.Checks.checkSafe(r0, r1)
        L17:
            r0 = r5
            long r0 = org.lwjgl.system.MemoryUtil.memAddress(r0)
            r1 = r6
            long r1 = org.lwjgl.system.MemoryUtil.memAddressSafe(r1)
            int r0 = nvkEnumerateInstanceLayerProperties(r0, r1)
            return r0
    }

    public static int nvkEnumerateDeviceLayerProperties(org.lwjgl.vulkan.VkPhysicalDevice r9, long r10, long r12) {
            r0 = r9
            org.lwjgl.vulkan.VKCapabilitiesInstance r0 = r0.getCapabilities()
            long r0 = r0.vkEnumerateDeviceLayerProperties
            r14 = r0
            r0 = r9
            long r0 = r0.address()
            r1 = r10
            r2 = r12
            r3 = r14
            int r0 = org.lwjgl.system.JNI.callPPPI(r0, r1, r2, r3)
            return r0
    }

    @org.lwjgl.system.NativeType("VkResult")
    public static int vkEnumerateDeviceLayerProperties(org.lwjgl.vulkan.VkPhysicalDevice r6, @org.lwjgl.system.NativeType("uint32_t *") java.nio.IntBuffer r7, @javax.annotation.Nullable @org.lwjgl.system.NativeType("VkLayerProperties *") org.lwjgl.vulkan.VkLayerProperties.Buffer r8) {
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
            int r0 = nvkEnumerateDeviceLayerProperties(r0, r1, r2)
            return r0
    }

    public static void nvkGetDeviceQueue(org.lwjgl.vulkan.VkDevice r9, int r10, int r11, long r12) {
            r0 = r9
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkGetDeviceQueue
            r14 = r0
            r0 = r9
            long r0 = r0.address()
            r1 = r10
            r2 = r11
            r3 = r12
            r4 = r14
            org.lwjgl.system.JNI.callPPV(r0, r1, r2, r3, r4)
            return
    }

    public static void vkGetDeviceQueue(org.lwjgl.vulkan.VkDevice r6, @org.lwjgl.system.NativeType("uint32_t") int r7, @org.lwjgl.system.NativeType("uint32_t") int r8, @org.lwjgl.system.NativeType("VkQueue *") org.lwjgl.PointerBuffer r9) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r9
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
        Lb:
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            long r3 = org.lwjgl.system.MemoryUtil.memAddress(r3)
            nvkGetDeviceQueue(r0, r1, r2, r3)
            return
    }

    public static int nvkQueueSubmit(org.lwjgl.vulkan.VkQueue r10, int r11, long r12, long r14) {
            r0 = r10
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkQueueSubmit
            r16 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L22
            r0 = r12
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto L22
            r0 = r12
            r1 = r11
            int r2 = org.lwjgl.vulkan.VkSubmitInfo.SIZEOF
            int r3 = org.lwjgl.vulkan.VkSubmitInfo::validate
            org.lwjgl.system.Struct.validate(r0, r1, r2, r3)
        L22:
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
    public static int vkQueueSubmit(org.lwjgl.vulkan.VkQueue r7, @javax.annotation.Nullable @org.lwjgl.system.NativeType("VkSubmitInfo const *") org.lwjgl.vulkan.VkSubmitInfo.Buffer r8, @org.lwjgl.system.NativeType("VkFence") long r9) {
            r0 = r7
            r1 = r8
            int r1 = org.lwjgl.system.Checks.remainingSafe(r1)
            r2 = r8
            long r2 = org.lwjgl.system.MemoryUtil.memAddressSafe(r2)
            r3 = r9
            int r0 = nvkQueueSubmit(r0, r1, r2, r3)
            return r0
    }

    @org.lwjgl.system.NativeType("VkResult")
    public static int vkQueueSubmit(org.lwjgl.vulkan.VkQueue r7, @org.lwjgl.system.NativeType("VkSubmitInfo const *") org.lwjgl.vulkan.VkSubmitInfo r8, @org.lwjgl.system.NativeType("VkFence") long r9) {
            r0 = r7
            r1 = 1
            r2 = r8
            long r2 = r2.address()
            r3 = r9
            int r0 = nvkQueueSubmit(r0, r1, r2, r3)
            return r0
    }

    @org.lwjgl.system.NativeType("VkResult")
    public static int vkQueueWaitIdle(org.lwjgl.vulkan.VkQueue r5) {
            r0 = r5
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkQueueWaitIdle
            r6 = r0
            r0 = r5
            long r0 = r0.address()
            r1 = r6
            int r0 = org.lwjgl.system.JNI.callPI(r0, r1)
            return r0
    }

    @org.lwjgl.system.NativeType("VkResult")
    public static int vkDeviceWaitIdle(org.lwjgl.vulkan.VkDevice r5) {
            r0 = r5
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkDeviceWaitIdle
            r6 = r0
            r0 = r5
            long r0 = r0.address()
            r1 = r6
            int r0 = org.lwjgl.system.JNI.callPI(r0, r1)
            return r0
    }

    public static int nvkAllocateMemory(org.lwjgl.vulkan.VkDevice r11, long r12, long r14, long r16) {
            r0 = r11
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkAllocateMemory
            r18 = r0
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
    public static int vkAllocateMemory(org.lwjgl.vulkan.VkDevice r8, @org.lwjgl.system.NativeType("VkMemoryAllocateInfo const *") org.lwjgl.vulkan.VkMemoryAllocateInfo r9, @javax.annotation.Nullable @org.lwjgl.system.NativeType("VkAllocationCallbacks const *") org.lwjgl.vulkan.VkAllocationCallbacks r10, @org.lwjgl.system.NativeType("VkDeviceMemory *") java.nio.LongBuffer r11) {
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
            int r0 = nvkAllocateMemory(r0, r1, r2, r3)
            return r0
    }

    public static void nvkFreeMemory(org.lwjgl.vulkan.VkDevice r9, long r10, long r12) {
            r0 = r9
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkFreeMemory
            r14 = r0
            r0 = r9
            long r0 = r0.address()
            r1 = r10
            r2 = r12
            r3 = r14
            org.lwjgl.system.JNI.callPJPV(r0, r1, r2, r3)
            return
    }

    public static void vkFreeMemory(org.lwjgl.vulkan.VkDevice r6, @org.lwjgl.system.NativeType("VkDeviceMemory") long r7, @javax.annotation.Nullable @org.lwjgl.system.NativeType("VkAllocationCallbacks const *") org.lwjgl.vulkan.VkAllocationCallbacks r9) {
            r0 = r6
            r1 = r7
            r2 = r9
            long r2 = org.lwjgl.system.MemoryUtil.memAddressSafe(r2)
            nvkFreeMemory(r0, r1, r2)
            return
    }

    public static int nvkMapMemory(org.lwjgl.vulkan.VkDevice r14, long r15, long r17, long r19, int r21, long r22) {
            r0 = r14
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkMapMemory
            r24 = r0
            r0 = r14
            long r0 = r0.address()
            r1 = r15
            r2 = r17
            r3 = r19
            r4 = r21
            r5 = r22
            r6 = r24
            int r0 = org.lwjgl.system.JNI.callPJJJPI(r0, r1, r2, r3, r4, r5, r6)
            return r0
    }

    @org.lwjgl.system.NativeType("VkResult")
    public static int vkMapMemory(org.lwjgl.vulkan.VkDevice r11, @org.lwjgl.system.NativeType("VkDeviceMemory") long r12, @org.lwjgl.system.NativeType("VkDeviceSize") long r14, @org.lwjgl.system.NativeType("VkDeviceSize") long r16, @org.lwjgl.system.NativeType("VkMemoryMapFlags") int r18, @org.lwjgl.system.NativeType("void **") org.lwjgl.PointerBuffer r19) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lc
            r0 = r19
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
        Lc:
            r0 = r11
            r1 = r12
            r2 = r14
            r3 = r16
            r4 = r18
            r5 = r19
            long r5 = org.lwjgl.system.MemoryUtil.memAddress(r5)
            int r0 = nvkMapMemory(r0, r1, r2, r3, r4, r5)
            return r0
    }

    public static void vkUnmapMemory(org.lwjgl.vulkan.VkDevice r7, @org.lwjgl.system.NativeType("VkDeviceMemory") long r8) {
            r0 = r7
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkUnmapMemory
            r10 = r0
            r0 = r7
            long r0 = r0.address()
            r1 = r8
            r2 = r10
            org.lwjgl.system.JNI.callPJV(r0, r1, r2)
            return
    }

    public static int nvkFlushMappedMemoryRanges(org.lwjgl.vulkan.VkDevice r8, int r9, long r10) {
            r0 = r8
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkFlushMappedMemoryRanges
            r12 = r0
            r0 = r8
            long r0 = r0.address()
            r1 = r9
            r2 = r10
            r3 = r12
            int r0 = org.lwjgl.system.JNI.callPPI(r0, r1, r2, r3)
            return r0
    }

    @org.lwjgl.system.NativeType("VkResult")
    public static int vkFlushMappedMemoryRanges(org.lwjgl.vulkan.VkDevice r5, @org.lwjgl.system.NativeType("VkMappedMemoryRange const *") org.lwjgl.vulkan.VkMappedMemoryRange.Buffer r6) {
            r0 = r5
            r1 = r6
            int r1 = r1.remaining()
            r2 = r6
            long r2 = r2.address()
            int r0 = nvkFlushMappedMemoryRanges(r0, r1, r2)
            return r0
    }

    @org.lwjgl.system.NativeType("VkResult")
    public static int vkFlushMappedMemoryRanges(org.lwjgl.vulkan.VkDevice r5, @org.lwjgl.system.NativeType("VkMappedMemoryRange const *") org.lwjgl.vulkan.VkMappedMemoryRange r6) {
            r0 = r5
            r1 = 1
            r2 = r6
            long r2 = r2.address()
            int r0 = nvkFlushMappedMemoryRanges(r0, r1, r2)
            return r0
    }

    public static int nvkInvalidateMappedMemoryRanges(org.lwjgl.vulkan.VkDevice r8, int r9, long r10) {
            r0 = r8
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkInvalidateMappedMemoryRanges
            r12 = r0
            r0 = r8
            long r0 = r0.address()
            r1 = r9
            r2 = r10
            r3 = r12
            int r0 = org.lwjgl.system.JNI.callPPI(r0, r1, r2, r3)
            return r0
    }

    @org.lwjgl.system.NativeType("VkResult")
    public static int vkInvalidateMappedMemoryRanges(org.lwjgl.vulkan.VkDevice r5, @org.lwjgl.system.NativeType("VkMappedMemoryRange const *") org.lwjgl.vulkan.VkMappedMemoryRange.Buffer r6) {
            r0 = r5
            r1 = r6
            int r1 = r1.remaining()
            r2 = r6
            long r2 = r2.address()
            int r0 = nvkInvalidateMappedMemoryRanges(r0, r1, r2)
            return r0
    }

    @org.lwjgl.system.NativeType("VkResult")
    public static int vkInvalidateMappedMemoryRanges(org.lwjgl.vulkan.VkDevice r5, @org.lwjgl.system.NativeType("VkMappedMemoryRange const *") org.lwjgl.vulkan.VkMappedMemoryRange r6) {
            r0 = r5
            r1 = 1
            r2 = r6
            long r2 = r2.address()
            int r0 = nvkInvalidateMappedMemoryRanges(r0, r1, r2)
            return r0
    }

    public static void nvkGetDeviceMemoryCommitment(org.lwjgl.vulkan.VkDevice r9, long r10, long r12) {
            r0 = r9
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkGetDeviceMemoryCommitment
            r14 = r0
            r0 = r9
            long r0 = r0.address()
            r1 = r10
            r2 = r12
            r3 = r14
            org.lwjgl.system.JNI.callPJPV(r0, r1, r2, r3)
            return
    }

    public static void vkGetDeviceMemoryCommitment(org.lwjgl.vulkan.VkDevice r6, @org.lwjgl.system.NativeType("VkDeviceMemory") long r7, @org.lwjgl.system.NativeType("VkDeviceSize *") java.nio.LongBuffer r9) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r9
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
        Lb:
            r0 = r6
            r1 = r7
            r2 = r9
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            nvkGetDeviceMemoryCommitment(r0, r1, r2)
            return
    }

    @org.lwjgl.system.NativeType("VkResult")
    public static int vkBindBufferMemory(org.lwjgl.vulkan.VkDevice r11, @org.lwjgl.system.NativeType("VkBuffer") long r12, @org.lwjgl.system.NativeType("VkDeviceMemory") long r14, @org.lwjgl.system.NativeType("VkDeviceSize") long r16) {
            r0 = r11
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkBindBufferMemory
            r18 = r0
            r0 = r11
            long r0 = r0.address()
            r1 = r12
            r2 = r14
            r3 = r16
            r4 = r18
            int r0 = org.lwjgl.system.JNI.callPJJJI(r0, r1, r2, r3, r4)
            return r0
    }

    @org.lwjgl.system.NativeType("VkResult")
    public static int vkBindImageMemory(org.lwjgl.vulkan.VkDevice r11, @org.lwjgl.system.NativeType("VkImage") long r12, @org.lwjgl.system.NativeType("VkDeviceMemory") long r14, @org.lwjgl.system.NativeType("VkDeviceSize") long r16) {
            r0 = r11
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkBindImageMemory
            r18 = r0
            r0 = r11
            long r0 = r0.address()
            r1 = r12
            r2 = r14
            r3 = r16
            r4 = r18
            int r0 = org.lwjgl.system.JNI.callPJJJI(r0, r1, r2, r3, r4)
            return r0
    }

    public static void nvkGetBufferMemoryRequirements(org.lwjgl.vulkan.VkDevice r9, long r10, long r12) {
            r0 = r9
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkGetBufferMemoryRequirements
            r14 = r0
            r0 = r9
            long r0 = r0.address()
            r1 = r10
            r2 = r12
            r3 = r14
            org.lwjgl.system.JNI.callPJPV(r0, r1, r2, r3)
            return
    }

    public static void vkGetBufferMemoryRequirements(org.lwjgl.vulkan.VkDevice r6, @org.lwjgl.system.NativeType("VkBuffer") long r7, @org.lwjgl.system.NativeType("VkMemoryRequirements *") org.lwjgl.vulkan.VkMemoryRequirements r9) {
            r0 = r6
            r1 = r7
            r2 = r9
            long r2 = r2.address()
            nvkGetBufferMemoryRequirements(r0, r1, r2)
            return
    }

    public static void nvkGetImageMemoryRequirements(org.lwjgl.vulkan.VkDevice r9, long r10, long r12) {
            r0 = r9
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkGetImageMemoryRequirements
            r14 = r0
            r0 = r9
            long r0 = r0.address()
            r1 = r10
            r2 = r12
            r3 = r14
            org.lwjgl.system.JNI.callPJPV(r0, r1, r2, r3)
            return
    }

    public static void vkGetImageMemoryRequirements(org.lwjgl.vulkan.VkDevice r6, @org.lwjgl.system.NativeType("VkImage") long r7, @org.lwjgl.system.NativeType("VkMemoryRequirements *") org.lwjgl.vulkan.VkMemoryRequirements r9) {
            r0 = r6
            r1 = r7
            r2 = r9
            long r2 = r2.address()
            nvkGetImageMemoryRequirements(r0, r1, r2)
            return
    }

    public static void nvkGetImageSparseMemoryRequirements(org.lwjgl.vulkan.VkDevice r11, long r12, long r14, long r16) {
            r0 = r11
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkGetImageSparseMemoryRequirements
            r18 = r0
            r0 = r11
            long r0 = r0.address()
            r1 = r12
            r2 = r14
            r3 = r16
            r4 = r18
            org.lwjgl.system.JNI.callPJPPV(r0, r1, r2, r3, r4)
            return
    }

    public static void vkGetImageSparseMemoryRequirements(org.lwjgl.vulkan.VkDevice r8, @org.lwjgl.system.NativeType("VkImage") long r9, @org.lwjgl.system.NativeType("uint32_t *") java.nio.IntBuffer r11, @javax.annotation.Nullable @org.lwjgl.system.NativeType("VkSparseImageMemoryRequirements *") org.lwjgl.vulkan.VkSparseImageMemoryRequirements.Buffer r12) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L18
            r0 = r11
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
            r0 = r12
            r1 = r11
            r2 = r11
            int r2 = r2.position()
            int r1 = r1.get(r2)
            org.lwjgl.system.Checks.checkSafe(r0, r1)
        L18:
            r0 = r8
            r1 = r9
            r2 = r11
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            r3 = r12
            long r3 = org.lwjgl.system.MemoryUtil.memAddressSafe(r3)
            nvkGetImageSparseMemoryRequirements(r0, r1, r2, r3)
            return
    }

    public static void nvkGetPhysicalDeviceSparseImageFormatProperties(org.lwjgl.vulkan.VkPhysicalDevice r14, int r15, int r16, int r17, int r18, int r19, long r20, long r22) {
            r0 = r14
            org.lwjgl.vulkan.VKCapabilitiesInstance r0 = r0.getCapabilities()
            long r0 = r0.vkGetPhysicalDeviceSparseImageFormatProperties
            r24 = r0
            r0 = r14
            long r0 = r0.address()
            r1 = r15
            r2 = r16
            r3 = r17
            r4 = r18
            r5 = r19
            r6 = r20
            r7 = r22
            r8 = r24
            org.lwjgl.system.JNI.callPPPV(r0, r1, r2, r3, r4, r5, r6, r7, r8)
            return
    }

    public static void vkGetPhysicalDeviceSparseImageFormatProperties(org.lwjgl.vulkan.VkPhysicalDevice r11, @org.lwjgl.system.NativeType("VkFormat") int r12, @org.lwjgl.system.NativeType("VkImageType") int r13, @org.lwjgl.system.NativeType("VkSampleCountFlagBits") int r14, @org.lwjgl.system.NativeType("VkImageUsageFlags") int r15, @org.lwjgl.system.NativeType("VkImageTiling") int r16, @org.lwjgl.system.NativeType("uint32_t *") java.nio.IntBuffer r17, @javax.annotation.Nullable @org.lwjgl.system.NativeType("VkSparseImageFormatProperties *") org.lwjgl.vulkan.VkSparseImageFormatProperties.Buffer r18) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L1b
            r0 = r17
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
            r0 = r18
            r1 = r17
            r2 = r17
            int r2 = r2.position()
            int r1 = r1.get(r2)
            org.lwjgl.system.Checks.checkSafe(r0, r1)
        L1b:
            r0 = r11
            r1 = r12
            r2 = r13
            r3 = r14
            r4 = r15
            r5 = r16
            r6 = r17
            long r6 = org.lwjgl.system.MemoryUtil.memAddress(r6)
            r7 = r18
            long r7 = org.lwjgl.system.MemoryUtil.memAddressSafe(r7)
            nvkGetPhysicalDeviceSparseImageFormatProperties(r0, r1, r2, r3, r4, r5, r6, r7)
            return
    }

    public static int nvkQueueBindSparse(org.lwjgl.vulkan.VkQueue r10, int r11, long r12, long r14) {
            r0 = r10
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkQueueBindSparse
            r16 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L22
            r0 = r12
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto L22
            r0 = r12
            r1 = r11
            int r2 = org.lwjgl.vulkan.VkBindSparseInfo.SIZEOF
            int r3 = org.lwjgl.vulkan.VkBindSparseInfo::validate
            org.lwjgl.system.Struct.validate(r0, r1, r2, r3)
        L22:
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
    public static int vkQueueBindSparse(org.lwjgl.vulkan.VkQueue r7, @javax.annotation.Nullable @org.lwjgl.system.NativeType("VkBindSparseInfo const *") org.lwjgl.vulkan.VkBindSparseInfo.Buffer r8, @org.lwjgl.system.NativeType("VkFence") long r9) {
            r0 = r7
            r1 = r8
            int r1 = org.lwjgl.system.Checks.remainingSafe(r1)
            r2 = r8
            long r2 = org.lwjgl.system.MemoryUtil.memAddressSafe(r2)
            r3 = r9
            int r0 = nvkQueueBindSparse(r0, r1, r2, r3)
            return r0
    }

    @org.lwjgl.system.NativeType("VkResult")
    public static int vkQueueBindSparse(org.lwjgl.vulkan.VkQueue r7, @org.lwjgl.system.NativeType("VkBindSparseInfo const *") org.lwjgl.vulkan.VkBindSparseInfo r8, @org.lwjgl.system.NativeType("VkFence") long r9) {
            r0 = r7
            r1 = 1
            r2 = r8
            long r2 = r2.address()
            r3 = r9
            int r0 = nvkQueueBindSparse(r0, r1, r2, r3)
            return r0
    }

    public static int nvkCreateFence(org.lwjgl.vulkan.VkDevice r11, long r12, long r14, long r16) {
            r0 = r11
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkCreateFence
            r18 = r0
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
    public static int vkCreateFence(org.lwjgl.vulkan.VkDevice r8, @org.lwjgl.system.NativeType("VkFenceCreateInfo const *") org.lwjgl.vulkan.VkFenceCreateInfo r9, @javax.annotation.Nullable @org.lwjgl.system.NativeType("VkAllocationCallbacks const *") org.lwjgl.vulkan.VkAllocationCallbacks r10, @org.lwjgl.system.NativeType("VkFence *") java.nio.LongBuffer r11) {
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
            int r0 = nvkCreateFence(r0, r1, r2, r3)
            return r0
    }

    public static void nvkDestroyFence(org.lwjgl.vulkan.VkDevice r9, long r10, long r12) {
            r0 = r9
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkDestroyFence
            r14 = r0
            r0 = r9
            long r0 = r0.address()
            r1 = r10
            r2 = r12
            r3 = r14
            org.lwjgl.system.JNI.callPJPV(r0, r1, r2, r3)
            return
    }

    public static void vkDestroyFence(org.lwjgl.vulkan.VkDevice r6, @org.lwjgl.system.NativeType("VkFence") long r7, @javax.annotation.Nullable @org.lwjgl.system.NativeType("VkAllocationCallbacks const *") org.lwjgl.vulkan.VkAllocationCallbacks r9) {
            r0 = r6
            r1 = r7
            r2 = r9
            long r2 = org.lwjgl.system.MemoryUtil.memAddressSafe(r2)
            nvkDestroyFence(r0, r1, r2)
            return
    }

    public static int nvkResetFences(org.lwjgl.vulkan.VkDevice r8, int r9, long r10) {
            r0 = r8
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkResetFences
            r12 = r0
            r0 = r8
            long r0 = r0.address()
            r1 = r9
            r2 = r10
            r3 = r12
            int r0 = org.lwjgl.system.JNI.callPPI(r0, r1, r2, r3)
            return r0
    }

    @org.lwjgl.system.NativeType("VkResult")
    public static int vkResetFences(org.lwjgl.vulkan.VkDevice r5, @org.lwjgl.system.NativeType("VkFence const *") java.nio.LongBuffer r6) {
            r0 = r5
            r1 = r6
            int r1 = r1.remaining()
            r2 = r6
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            int r0 = nvkResetFences(r0, r1, r2)
            return r0
    }

    @org.lwjgl.system.NativeType("VkResult")
    public static int vkResetFences(org.lwjgl.vulkan.VkDevice r5, @org.lwjgl.system.NativeType("VkFence const *") long r6) {
            org.lwjgl.system.MemoryStack r0 = org.lwjgl.system.MemoryStack.stackGet()
            r8 = r0
            r0 = r8
            int r0 = r0.getPointer()
            r9 = r0
            r0 = r8
            r1 = r6
            java.nio.LongBuffer r0 = r0.longs(r1)     // Catch: java.lang.Throwable -> L26
            r10 = r0
            r0 = r5
            r1 = 1
            r2 = r10
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)     // Catch: java.lang.Throwable -> L26
            int r0 = nvkResetFences(r0, r1, r2)     // Catch: java.lang.Throwable -> L26
            r11 = r0
            r0 = r8
            r1 = r9
            r0.setPointer(r1)
            r0 = r11
            return r0
        L26:
            r12 = move-exception
            r0 = r8
            r1 = r9
            r0.setPointer(r1)
            r0 = r12
            throw r0
    }

    @org.lwjgl.system.NativeType("VkResult")
    public static int vkGetFenceStatus(org.lwjgl.vulkan.VkDevice r7, @org.lwjgl.system.NativeType("VkFence") long r8) {
            r0 = r7
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkGetFenceStatus
            r10 = r0
            r0 = r7
            long r0 = r0.address()
            r1 = r8
            r2 = r10
            int r0 = org.lwjgl.system.JNI.callPJI(r0, r1, r2)
            return r0
    }

    public static int nvkWaitForFences(org.lwjgl.vulkan.VkDevice r11, int r12, long r13, int r15, long r16) {
            r0 = r11
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkWaitForFences
            r18 = r0
            r0 = r11
            long r0 = r0.address()
            r1 = r12
            r2 = r13
            r3 = r15
            r4 = r16
            r5 = r18
            int r0 = org.lwjgl.system.JNI.callPPJI(r0, r1, r2, r3, r4, r5)
            return r0
    }

    @org.lwjgl.system.NativeType("VkResult")
    public static int vkWaitForFences(org.lwjgl.vulkan.VkDevice r8, @org.lwjgl.system.NativeType("VkFence const *") java.nio.LongBuffer r9, @org.lwjgl.system.NativeType("VkBool32") boolean r10, @org.lwjgl.system.NativeType("uint64_t") long r11) {
            r0 = r8
            r1 = r9
            int r1 = r1.remaining()
            r2 = r9
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            r3 = r10
            if (r3 == 0) goto L11
            r3 = 1
            goto L12
        L11:
            r3 = 0
        L12:
            r4 = r11
            int r0 = nvkWaitForFences(r0, r1, r2, r3, r4)
            return r0
    }

    @org.lwjgl.system.NativeType("VkResult")
    public static int vkWaitForFences(org.lwjgl.vulkan.VkDevice r8, @org.lwjgl.system.NativeType("VkFence const *") long r9, @org.lwjgl.system.NativeType("VkBool32") boolean r11, @org.lwjgl.system.NativeType("uint64_t") long r12) {
            org.lwjgl.system.MemoryStack r0 = org.lwjgl.system.MemoryStack.stackGet()
            r14 = r0
            r0 = r14
            int r0 = r0.getPointer()
            r15 = r0
            r0 = r14
            r1 = r9
            java.nio.LongBuffer r0 = r0.longs(r1)     // Catch: java.lang.Throwable -> L35
            r16 = r0
            r0 = r8
            r1 = 1
            r2 = r16
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)     // Catch: java.lang.Throwable -> L35
            r3 = r11
            if (r3 == 0) goto L23
            r3 = 1
            goto L24
        L23:
            r3 = 0
        L24:
            r4 = r12
            int r0 = nvkWaitForFences(r0, r1, r2, r3, r4)     // Catch: java.lang.Throwable -> L35
            r17 = r0
            r0 = r14
            r1 = r15
            r0.setPointer(r1)
            r0 = r17
            return r0
        L35:
            r18 = move-exception
            r0 = r14
            r1 = r15
            r0.setPointer(r1)
            r0 = r18
            throw r0
    }

    public static int nvkCreateSemaphore(org.lwjgl.vulkan.VkDevice r11, long r12, long r14, long r16) {
            r0 = r11
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkCreateSemaphore
            r18 = r0
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
    public static int vkCreateSemaphore(org.lwjgl.vulkan.VkDevice r8, @org.lwjgl.system.NativeType("VkSemaphoreCreateInfo const *") org.lwjgl.vulkan.VkSemaphoreCreateInfo r9, @javax.annotation.Nullable @org.lwjgl.system.NativeType("VkAllocationCallbacks const *") org.lwjgl.vulkan.VkAllocationCallbacks r10, @org.lwjgl.system.NativeType("VkSemaphore *") java.nio.LongBuffer r11) {
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
            int r0 = nvkCreateSemaphore(r0, r1, r2, r3)
            return r0
    }

    public static void nvkDestroySemaphore(org.lwjgl.vulkan.VkDevice r9, long r10, long r12) {
            r0 = r9
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkDestroySemaphore
            r14 = r0
            r0 = r9
            long r0 = r0.address()
            r1 = r10
            r2 = r12
            r3 = r14
            org.lwjgl.system.JNI.callPJPV(r0, r1, r2, r3)
            return
    }

    public static void vkDestroySemaphore(org.lwjgl.vulkan.VkDevice r6, @org.lwjgl.system.NativeType("VkSemaphore") long r7, @javax.annotation.Nullable @org.lwjgl.system.NativeType("VkAllocationCallbacks const *") org.lwjgl.vulkan.VkAllocationCallbacks r9) {
            r0 = r6
            r1 = r7
            r2 = r9
            long r2 = org.lwjgl.system.MemoryUtil.memAddressSafe(r2)
            nvkDestroySemaphore(r0, r1, r2)
            return
    }

    public static int nvkCreateEvent(org.lwjgl.vulkan.VkDevice r11, long r12, long r14, long r16) {
            r0 = r11
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkCreateEvent
            r18 = r0
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
    public static int vkCreateEvent(org.lwjgl.vulkan.VkDevice r8, @org.lwjgl.system.NativeType("VkEventCreateInfo const *") org.lwjgl.vulkan.VkEventCreateInfo r9, @javax.annotation.Nullable @org.lwjgl.system.NativeType("VkAllocationCallbacks const *") org.lwjgl.vulkan.VkAllocationCallbacks r10, @org.lwjgl.system.NativeType("VkEvent *") java.nio.LongBuffer r11) {
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
            int r0 = nvkCreateEvent(r0, r1, r2, r3)
            return r0
    }

    public static void nvkDestroyEvent(org.lwjgl.vulkan.VkDevice r9, long r10, long r12) {
            r0 = r9
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkDestroyEvent
            r14 = r0
            r0 = r9
            long r0 = r0.address()
            r1 = r10
            r2 = r12
            r3 = r14
            org.lwjgl.system.JNI.callPJPV(r0, r1, r2, r3)
            return
    }

    public static void vkDestroyEvent(org.lwjgl.vulkan.VkDevice r6, @org.lwjgl.system.NativeType("VkEvent") long r7, @javax.annotation.Nullable @org.lwjgl.system.NativeType("VkAllocationCallbacks const *") org.lwjgl.vulkan.VkAllocationCallbacks r9) {
            r0 = r6
            r1 = r7
            r2 = r9
            long r2 = org.lwjgl.system.MemoryUtil.memAddressSafe(r2)
            nvkDestroyEvent(r0, r1, r2)
            return
    }

    @org.lwjgl.system.NativeType("VkResult")
    public static int vkGetEventStatus(org.lwjgl.vulkan.VkDevice r7, @org.lwjgl.system.NativeType("VkEvent") long r8) {
            r0 = r7
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkGetEventStatus
            r10 = r0
            r0 = r7
            long r0 = r0.address()
            r1 = r8
            r2 = r10
            int r0 = org.lwjgl.system.JNI.callPJI(r0, r1, r2)
            return r0
    }

    @org.lwjgl.system.NativeType("VkResult")
    public static int vkSetEvent(org.lwjgl.vulkan.VkDevice r7, @org.lwjgl.system.NativeType("VkEvent") long r8) {
            r0 = r7
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkSetEvent
            r10 = r0
            r0 = r7
            long r0 = r0.address()
            r1 = r8
            r2 = r10
            int r0 = org.lwjgl.system.JNI.callPJI(r0, r1, r2)
            return r0
    }

    @org.lwjgl.system.NativeType("VkResult")
    public static int vkResetEvent(org.lwjgl.vulkan.VkDevice r7, @org.lwjgl.system.NativeType("VkEvent") long r8) {
            r0 = r7
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkResetEvent
            r10 = r0
            r0 = r7
            long r0 = r0.address()
            r1 = r8
            r2 = r10
            int r0 = org.lwjgl.system.JNI.callPJI(r0, r1, r2)
            return r0
    }

    public static int nvkCreateQueryPool(org.lwjgl.vulkan.VkDevice r11, long r12, long r14, long r16) {
            r0 = r11
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkCreateQueryPool
            r18 = r0
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
    public static int vkCreateQueryPool(org.lwjgl.vulkan.VkDevice r8, @org.lwjgl.system.NativeType("VkQueryPoolCreateInfo const *") org.lwjgl.vulkan.VkQueryPoolCreateInfo r9, @javax.annotation.Nullable @org.lwjgl.system.NativeType("VkAllocationCallbacks const *") org.lwjgl.vulkan.VkAllocationCallbacks r10, @org.lwjgl.system.NativeType("VkQueryPool *") java.nio.LongBuffer r11) {
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
            int r0 = nvkCreateQueryPool(r0, r1, r2, r3)
            return r0
    }

    public static void nvkDestroyQueryPool(org.lwjgl.vulkan.VkDevice r9, long r10, long r12) {
            r0 = r9
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkDestroyQueryPool
            r14 = r0
            r0 = r9
            long r0 = r0.address()
            r1 = r10
            r2 = r12
            r3 = r14
            org.lwjgl.system.JNI.callPJPV(r0, r1, r2, r3)
            return
    }

    public static void vkDestroyQueryPool(org.lwjgl.vulkan.VkDevice r6, @org.lwjgl.system.NativeType("VkQueryPool") long r7, @javax.annotation.Nullable @org.lwjgl.system.NativeType("VkAllocationCallbacks const *") org.lwjgl.vulkan.VkAllocationCallbacks r9) {
            r0 = r6
            r1 = r7
            r2 = r9
            long r2 = org.lwjgl.system.MemoryUtil.memAddressSafe(r2)
            nvkDestroyQueryPool(r0, r1, r2)
            return
    }

    public static int nvkGetQueryPoolResults(org.lwjgl.vulkan.VkDevice r16, long r17, int r19, int r20, long r21, long r23, long r25, int r27) {
            r0 = r16
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkGetQueryPoolResults
            r28 = r0
            r0 = r16
            long r0 = r0.address()
            r1 = r17
            r2 = r19
            r3 = r20
            r4 = r21
            r5 = r23
            r6 = r25
            r7 = r27
            r8 = r28
            int r0 = org.lwjgl.system.JNI.callPJPPJI(r0, r1, r2, r3, r4, r5, r6, r7, r8)
            return r0
    }

    @org.lwjgl.system.NativeType("VkResult")
    public static int vkGetQueryPoolResults(org.lwjgl.vulkan.VkDevice r13, @org.lwjgl.system.NativeType("VkQueryPool") long r14, @org.lwjgl.system.NativeType("uint32_t") int r16, @org.lwjgl.system.NativeType("uint32_t") int r17, @org.lwjgl.system.NativeType("void *") java.nio.ByteBuffer r18, @org.lwjgl.system.NativeType("VkDeviceSize") long r19, @org.lwjgl.system.NativeType("VkQueryResultFlags") int r21) {
            r0 = r13
            r1 = r14
            r2 = r16
            r3 = r17
            r4 = r18
            int r4 = r4.remaining()
            long r4 = (long) r4
            r5 = r18
            long r5 = org.lwjgl.system.MemoryUtil.memAddress(r5)
            r6 = r19
            r7 = r21
            int r0 = nvkGetQueryPoolResults(r0, r1, r2, r3, r4, r5, r6, r7)
            return r0
    }

    @org.lwjgl.system.NativeType("VkResult")
    public static int vkGetQueryPoolResults(org.lwjgl.vulkan.VkDevice r13, @org.lwjgl.system.NativeType("VkQueryPool") long r14, @org.lwjgl.system.NativeType("uint32_t") int r16, @org.lwjgl.system.NativeType("uint32_t") int r17, @org.lwjgl.system.NativeType("void *") java.nio.IntBuffer r18, @org.lwjgl.system.NativeType("VkDeviceSize") long r19, @org.lwjgl.system.NativeType("VkQueryResultFlags") int r21) {
            r0 = r13
            r1 = r14
            r2 = r16
            r3 = r17
            r4 = r18
            int r4 = r4.remaining()
            long r4 = java.lang.Integer.toUnsignedLong(r4)
            r5 = 2
            long r4 = r4 << r5
            r5 = r18
            long r5 = org.lwjgl.system.MemoryUtil.memAddress(r5)
            r6 = r19
            r7 = r21
            int r0 = nvkGetQueryPoolResults(r0, r1, r2, r3, r4, r5, r6, r7)
            return r0
    }

    @org.lwjgl.system.NativeType("VkResult")
    public static int vkGetQueryPoolResults(org.lwjgl.vulkan.VkDevice r13, @org.lwjgl.system.NativeType("VkQueryPool") long r14, @org.lwjgl.system.NativeType("uint32_t") int r16, @org.lwjgl.system.NativeType("uint32_t") int r17, @org.lwjgl.system.NativeType("void *") java.nio.LongBuffer r18, @org.lwjgl.system.NativeType("VkDeviceSize") long r19, @org.lwjgl.system.NativeType("VkQueryResultFlags") int r21) {
            r0 = r13
            r1 = r14
            r2 = r16
            r3 = r17
            r4 = r18
            int r4 = r4.remaining()
            long r4 = java.lang.Integer.toUnsignedLong(r4)
            r5 = 3
            long r4 = r4 << r5
            r5 = r18
            long r5 = org.lwjgl.system.MemoryUtil.memAddress(r5)
            r6 = r19
            r7 = r21
            int r0 = nvkGetQueryPoolResults(r0, r1, r2, r3, r4, r5, r6, r7)
            return r0
    }

    public static int nvkCreateBuffer(org.lwjgl.vulkan.VkDevice r11, long r12, long r14, long r16) {
            r0 = r11
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkCreateBuffer
            r18 = r0
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
    public static int vkCreateBuffer(org.lwjgl.vulkan.VkDevice r8, @org.lwjgl.system.NativeType("VkBufferCreateInfo const *") org.lwjgl.vulkan.VkBufferCreateInfo r9, @javax.annotation.Nullable @org.lwjgl.system.NativeType("VkAllocationCallbacks const *") org.lwjgl.vulkan.VkAllocationCallbacks r10, @org.lwjgl.system.NativeType("VkBuffer *") java.nio.LongBuffer r11) {
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
            int r0 = nvkCreateBuffer(r0, r1, r2, r3)
            return r0
    }

    public static void nvkDestroyBuffer(org.lwjgl.vulkan.VkDevice r9, long r10, long r12) {
            r0 = r9
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkDestroyBuffer
            r14 = r0
            r0 = r9
            long r0 = r0.address()
            r1 = r10
            r2 = r12
            r3 = r14
            org.lwjgl.system.JNI.callPJPV(r0, r1, r2, r3)
            return
    }

    public static void vkDestroyBuffer(org.lwjgl.vulkan.VkDevice r6, @org.lwjgl.system.NativeType("VkBuffer") long r7, @javax.annotation.Nullable @org.lwjgl.system.NativeType("VkAllocationCallbacks const *") org.lwjgl.vulkan.VkAllocationCallbacks r9) {
            r0 = r6
            r1 = r7
            r2 = r9
            long r2 = org.lwjgl.system.MemoryUtil.memAddressSafe(r2)
            nvkDestroyBuffer(r0, r1, r2)
            return
    }

    public static int nvkCreateBufferView(org.lwjgl.vulkan.VkDevice r11, long r12, long r14, long r16) {
            r0 = r11
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkCreateBufferView
            r18 = r0
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
    public static int vkCreateBufferView(org.lwjgl.vulkan.VkDevice r8, @org.lwjgl.system.NativeType("VkBufferViewCreateInfo const *") org.lwjgl.vulkan.VkBufferViewCreateInfo r9, @javax.annotation.Nullable @org.lwjgl.system.NativeType("VkAllocationCallbacks const *") org.lwjgl.vulkan.VkAllocationCallbacks r10, @org.lwjgl.system.NativeType("VkBufferView *") java.nio.LongBuffer r11) {
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
            int r0 = nvkCreateBufferView(r0, r1, r2, r3)
            return r0
    }

    public static void nvkDestroyBufferView(org.lwjgl.vulkan.VkDevice r9, long r10, long r12) {
            r0 = r9
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkDestroyBufferView
            r14 = r0
            r0 = r9
            long r0 = r0.address()
            r1 = r10
            r2 = r12
            r3 = r14
            org.lwjgl.system.JNI.callPJPV(r0, r1, r2, r3)
            return
    }

    public static void vkDestroyBufferView(org.lwjgl.vulkan.VkDevice r6, @org.lwjgl.system.NativeType("VkBufferView") long r7, @javax.annotation.Nullable @org.lwjgl.system.NativeType("VkAllocationCallbacks const *") org.lwjgl.vulkan.VkAllocationCallbacks r9) {
            r0 = r6
            r1 = r7
            r2 = r9
            long r2 = org.lwjgl.system.MemoryUtil.memAddressSafe(r2)
            nvkDestroyBufferView(r0, r1, r2)
            return
    }

    public static int nvkCreateImage(org.lwjgl.vulkan.VkDevice r11, long r12, long r14, long r16) {
            r0 = r11
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkCreateImage
            r18 = r0
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
    public static int vkCreateImage(org.lwjgl.vulkan.VkDevice r8, @org.lwjgl.system.NativeType("VkImageCreateInfo const *") org.lwjgl.vulkan.VkImageCreateInfo r9, @javax.annotation.Nullable @org.lwjgl.system.NativeType("VkAllocationCallbacks const *") org.lwjgl.vulkan.VkAllocationCallbacks r10, @org.lwjgl.system.NativeType("VkImage *") java.nio.LongBuffer r11) {
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
            int r0 = nvkCreateImage(r0, r1, r2, r3)
            return r0
    }

    public static void nvkDestroyImage(org.lwjgl.vulkan.VkDevice r9, long r10, long r12) {
            r0 = r9
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkDestroyImage
            r14 = r0
            r0 = r9
            long r0 = r0.address()
            r1 = r10
            r2 = r12
            r3 = r14
            org.lwjgl.system.JNI.callPJPV(r0, r1, r2, r3)
            return
    }

    public static void vkDestroyImage(org.lwjgl.vulkan.VkDevice r6, @org.lwjgl.system.NativeType("VkImage") long r7, @javax.annotation.Nullable @org.lwjgl.system.NativeType("VkAllocationCallbacks const *") org.lwjgl.vulkan.VkAllocationCallbacks r9) {
            r0 = r6
            r1 = r7
            r2 = r9
            long r2 = org.lwjgl.system.MemoryUtil.memAddressSafe(r2)
            nvkDestroyImage(r0, r1, r2)
            return
    }

    public static void nvkGetImageSubresourceLayout(org.lwjgl.vulkan.VkDevice r11, long r12, long r14, long r16) {
            r0 = r11
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkGetImageSubresourceLayout
            r18 = r0
            r0 = r11
            long r0 = r0.address()
            r1 = r12
            r2 = r14
            r3 = r16
            r4 = r18
            org.lwjgl.system.JNI.callPJPPV(r0, r1, r2, r3, r4)
            return
    }

    public static void vkGetImageSubresourceLayout(org.lwjgl.vulkan.VkDevice r8, @org.lwjgl.system.NativeType("VkImage") long r9, @org.lwjgl.system.NativeType("VkImageSubresource const *") org.lwjgl.vulkan.VkImageSubresource r11, @org.lwjgl.system.NativeType("VkSubresourceLayout *") org.lwjgl.vulkan.VkSubresourceLayout r12) {
            r0 = r8
            r1 = r9
            r2 = r11
            long r2 = r2.address()
            r3 = r12
            long r3 = r3.address()
            nvkGetImageSubresourceLayout(r0, r1, r2, r3)
            return
    }

    public static int nvkCreateImageView(org.lwjgl.vulkan.VkDevice r11, long r12, long r14, long r16) {
            r0 = r11
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkCreateImageView
            r18 = r0
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
    public static int vkCreateImageView(org.lwjgl.vulkan.VkDevice r8, @org.lwjgl.system.NativeType("VkImageViewCreateInfo const *") org.lwjgl.vulkan.VkImageViewCreateInfo r9, @javax.annotation.Nullable @org.lwjgl.system.NativeType("VkAllocationCallbacks const *") org.lwjgl.vulkan.VkAllocationCallbacks r10, @org.lwjgl.system.NativeType("VkImageView *") java.nio.LongBuffer r11) {
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
            int r0 = nvkCreateImageView(r0, r1, r2, r3)
            return r0
    }

    public static void nvkDestroyImageView(org.lwjgl.vulkan.VkDevice r9, long r10, long r12) {
            r0 = r9
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkDestroyImageView
            r14 = r0
            r0 = r9
            long r0 = r0.address()
            r1 = r10
            r2 = r12
            r3 = r14
            org.lwjgl.system.JNI.callPJPV(r0, r1, r2, r3)
            return
    }

    public static void vkDestroyImageView(org.lwjgl.vulkan.VkDevice r6, @org.lwjgl.system.NativeType("VkImageView") long r7, @javax.annotation.Nullable @org.lwjgl.system.NativeType("VkAllocationCallbacks const *") org.lwjgl.vulkan.VkAllocationCallbacks r9) {
            r0 = r6
            r1 = r7
            r2 = r9
            long r2 = org.lwjgl.system.MemoryUtil.memAddressSafe(r2)
            nvkDestroyImageView(r0, r1, r2)
            return
    }

    public static int nvkCreateShaderModule(org.lwjgl.vulkan.VkDevice r11, long r12, long r14, long r16) {
            r0 = r11
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkCreateShaderModule
            r18 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L13
            r0 = r12
            org.lwjgl.vulkan.VkShaderModuleCreateInfo.validate(r0)
        L13:
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
    public static int vkCreateShaderModule(org.lwjgl.vulkan.VkDevice r8, @org.lwjgl.system.NativeType("VkShaderModuleCreateInfo const *") org.lwjgl.vulkan.VkShaderModuleCreateInfo r9, @javax.annotation.Nullable @org.lwjgl.system.NativeType("VkAllocationCallbacks const *") org.lwjgl.vulkan.VkAllocationCallbacks r10, @org.lwjgl.system.NativeType("VkShaderModule *") java.nio.LongBuffer r11) {
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
            int r0 = nvkCreateShaderModule(r0, r1, r2, r3)
            return r0
    }

    public static void nvkDestroyShaderModule(org.lwjgl.vulkan.VkDevice r9, long r10, long r12) {
            r0 = r9
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkDestroyShaderModule
            r14 = r0
            r0 = r9
            long r0 = r0.address()
            r1 = r10
            r2 = r12
            r3 = r14
            org.lwjgl.system.JNI.callPJPV(r0, r1, r2, r3)
            return
    }

    public static void vkDestroyShaderModule(org.lwjgl.vulkan.VkDevice r6, @org.lwjgl.system.NativeType("VkShaderModule") long r7, @javax.annotation.Nullable @org.lwjgl.system.NativeType("VkAllocationCallbacks const *") org.lwjgl.vulkan.VkAllocationCallbacks r9) {
            r0 = r6
            r1 = r7
            r2 = r9
            long r2 = org.lwjgl.system.MemoryUtil.memAddressSafe(r2)
            nvkDestroyShaderModule(r0, r1, r2)
            return
    }

    public static int nvkCreatePipelineCache(org.lwjgl.vulkan.VkDevice r11, long r12, long r14, long r16) {
            r0 = r11
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkCreatePipelineCache
            r18 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L13
            r0 = r12
            org.lwjgl.vulkan.VkPipelineCacheCreateInfo.validate(r0)
        L13:
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
    public static int vkCreatePipelineCache(org.lwjgl.vulkan.VkDevice r8, @org.lwjgl.system.NativeType("VkPipelineCacheCreateInfo const *") org.lwjgl.vulkan.VkPipelineCacheCreateInfo r9, @javax.annotation.Nullable @org.lwjgl.system.NativeType("VkAllocationCallbacks const *") org.lwjgl.vulkan.VkAllocationCallbacks r10, @org.lwjgl.system.NativeType("VkPipelineCache *") java.nio.LongBuffer r11) {
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
            int r0 = nvkCreatePipelineCache(r0, r1, r2, r3)
            return r0
    }

    public static void nvkDestroyPipelineCache(org.lwjgl.vulkan.VkDevice r9, long r10, long r12) {
            r0 = r9
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkDestroyPipelineCache
            r14 = r0
            r0 = r9
            long r0 = r0.address()
            r1 = r10
            r2 = r12
            r3 = r14
            org.lwjgl.system.JNI.callPJPV(r0, r1, r2, r3)
            return
    }

    public static void vkDestroyPipelineCache(org.lwjgl.vulkan.VkDevice r6, @org.lwjgl.system.NativeType("VkPipelineCache") long r7, @javax.annotation.Nullable @org.lwjgl.system.NativeType("VkAllocationCallbacks const *") org.lwjgl.vulkan.VkAllocationCallbacks r9) {
            r0 = r6
            r1 = r7
            r2 = r9
            long r2 = org.lwjgl.system.MemoryUtil.memAddressSafe(r2)
            nvkDestroyPipelineCache(r0, r1, r2)
            return
    }

    public static int nvkGetPipelineCacheData(org.lwjgl.vulkan.VkDevice r11, long r12, long r14, long r16) {
            r0 = r11
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkGetPipelineCacheData
            r18 = r0
            r0 = r11
            long r0 = r0.address()
            r1 = r12
            r2 = r14
            r3 = r16
            r4 = r18
            int r0 = org.lwjgl.system.JNI.callPJPPI(r0, r1, r2, r3, r4)
            return r0
    }

    @org.lwjgl.system.NativeType("VkResult")
    public static int vkGetPipelineCacheData(org.lwjgl.vulkan.VkDevice r8, @org.lwjgl.system.NativeType("VkPipelineCache") long r9, @org.lwjgl.system.NativeType("size_t *") org.lwjgl.PointerBuffer r11, @javax.annotation.Nullable @org.lwjgl.system.NativeType("void *") java.nio.ByteBuffer r12) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L18
            r0 = r11
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
            r0 = r12
            r1 = r11
            r2 = r11
            int r2 = r2.position()
            long r1 = r1.get(r2)
            org.lwjgl.system.Checks.checkSafe(r0, r1)
        L18:
            r0 = r8
            r1 = r9
            r2 = r11
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            r3 = r12
            long r3 = org.lwjgl.system.MemoryUtil.memAddressSafe(r3)
            int r0 = nvkGetPipelineCacheData(r0, r1, r2, r3)
            return r0
    }

    public static int nvkMergePipelineCaches(org.lwjgl.vulkan.VkDevice r10, long r11, int r13, long r14) {
            r0 = r10
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkMergePipelineCaches
            r16 = r0
            r0 = r10
            long r0 = r0.address()
            r1 = r11
            r2 = r13
            r3 = r14
            r4 = r16
            int r0 = org.lwjgl.system.JNI.callPJPI(r0, r1, r2, r3, r4)
            return r0
    }

    @org.lwjgl.system.NativeType("VkResult")
    public static int vkMergePipelineCaches(org.lwjgl.vulkan.VkDevice r7, @org.lwjgl.system.NativeType("VkPipelineCache") long r8, @org.lwjgl.system.NativeType("VkPipelineCache const *") java.nio.LongBuffer r10) {
            r0 = r7
            r1 = r8
            r2 = r10
            int r2 = r2.remaining()
            r3 = r10
            long r3 = org.lwjgl.system.MemoryUtil.memAddress(r3)
            int r0 = nvkMergePipelineCaches(r0, r1, r2, r3)
            return r0
    }

    public static int nvkCreateGraphicsPipelines(org.lwjgl.vulkan.VkDevice r14, long r15, int r17, long r18, long r20, long r22) {
            r0 = r14
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkCreateGraphicsPipelines
            r24 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L1d
            r0 = r18
            r1 = r17
            int r2 = org.lwjgl.vulkan.VkGraphicsPipelineCreateInfo.SIZEOF
            int r3 = org.lwjgl.vulkan.VkGraphicsPipelineCreateInfo::validate
            org.lwjgl.system.Struct.validate(r0, r1, r2, r3)
        L1d:
            r0 = r14
            long r0 = r0.address()
            r1 = r15
            r2 = r17
            r3 = r18
            r4 = r20
            r5 = r22
            r6 = r24
            int r0 = org.lwjgl.system.JNI.callPJPPPI(r0, r1, r2, r3, r4, r5, r6)
            return r0
    }

    @org.lwjgl.system.NativeType("VkResult")
    public static int vkCreateGraphicsPipelines(org.lwjgl.vulkan.VkDevice r11, @org.lwjgl.system.NativeType("VkPipelineCache") long r12, @org.lwjgl.system.NativeType("VkGraphicsPipelineCreateInfo const *") org.lwjgl.vulkan.VkGraphicsPipelineCreateInfo.Buffer r14, @javax.annotation.Nullable @org.lwjgl.system.NativeType("VkAllocationCallbacks const *") org.lwjgl.vulkan.VkAllocationCallbacks r15, @org.lwjgl.system.NativeType("VkPipeline *") java.nio.LongBuffer r16) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lf
            r0 = r16
            r1 = r14
            int r1 = r1.remaining()
            org.lwjgl.system.Checks.check(r0, r1)
        Lf:
            r0 = r11
            r1 = r12
            r2 = r14
            int r2 = r2.remaining()
            r3 = r14
            long r3 = r3.address()
            r4 = r15
            long r4 = org.lwjgl.system.MemoryUtil.memAddressSafe(r4)
            r5 = r16
            long r5 = org.lwjgl.system.MemoryUtil.memAddress(r5)
            int r0 = nvkCreateGraphicsPipelines(r0, r1, r2, r3, r4, r5)
            return r0
    }

    public static int nvkCreateComputePipelines(org.lwjgl.vulkan.VkDevice r14, long r15, int r17, long r18, long r20, long r22) {
            r0 = r14
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkCreateComputePipelines
            r24 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L1d
            r0 = r18
            r1 = r17
            int r2 = org.lwjgl.vulkan.VkComputePipelineCreateInfo.SIZEOF
            int r3 = org.lwjgl.vulkan.VkComputePipelineCreateInfo::validate
            org.lwjgl.system.Struct.validate(r0, r1, r2, r3)
        L1d:
            r0 = r14
            long r0 = r0.address()
            r1 = r15
            r2 = r17
            r3 = r18
            r4 = r20
            r5 = r22
            r6 = r24
            int r0 = org.lwjgl.system.JNI.callPJPPPI(r0, r1, r2, r3, r4, r5, r6)
            return r0
    }

    @org.lwjgl.system.NativeType("VkResult")
    public static int vkCreateComputePipelines(org.lwjgl.vulkan.VkDevice r11, @org.lwjgl.system.NativeType("VkPipelineCache") long r12, @org.lwjgl.system.NativeType("VkComputePipelineCreateInfo const *") org.lwjgl.vulkan.VkComputePipelineCreateInfo.Buffer r14, @javax.annotation.Nullable @org.lwjgl.system.NativeType("VkAllocationCallbacks const *") org.lwjgl.vulkan.VkAllocationCallbacks r15, @org.lwjgl.system.NativeType("VkPipeline *") java.nio.LongBuffer r16) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lf
            r0 = r16
            r1 = r14
            int r1 = r1.remaining()
            org.lwjgl.system.Checks.check(r0, r1)
        Lf:
            r0 = r11
            r1 = r12
            r2 = r14
            int r2 = r2.remaining()
            r3 = r14
            long r3 = r3.address()
            r4 = r15
            long r4 = org.lwjgl.system.MemoryUtil.memAddressSafe(r4)
            r5 = r16
            long r5 = org.lwjgl.system.MemoryUtil.memAddress(r5)
            int r0 = nvkCreateComputePipelines(r0, r1, r2, r3, r4, r5)
            return r0
    }

    public static void nvkDestroyPipeline(org.lwjgl.vulkan.VkDevice r9, long r10, long r12) {
            r0 = r9
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkDestroyPipeline
            r14 = r0
            r0 = r9
            long r0 = r0.address()
            r1 = r10
            r2 = r12
            r3 = r14
            org.lwjgl.system.JNI.callPJPV(r0, r1, r2, r3)
            return
    }

    public static void vkDestroyPipeline(org.lwjgl.vulkan.VkDevice r6, @org.lwjgl.system.NativeType("VkPipeline") long r7, @javax.annotation.Nullable @org.lwjgl.system.NativeType("VkAllocationCallbacks const *") org.lwjgl.vulkan.VkAllocationCallbacks r9) {
            r0 = r6
            r1 = r7
            r2 = r9
            long r2 = org.lwjgl.system.MemoryUtil.memAddressSafe(r2)
            nvkDestroyPipeline(r0, r1, r2)
            return
    }

    public static int nvkCreatePipelineLayout(org.lwjgl.vulkan.VkDevice r11, long r12, long r14, long r16) {
            r0 = r11
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkCreatePipelineLayout
            r18 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L13
            r0 = r12
            org.lwjgl.vulkan.VkPipelineLayoutCreateInfo.validate(r0)
        L13:
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
    public static int vkCreatePipelineLayout(org.lwjgl.vulkan.VkDevice r8, @org.lwjgl.system.NativeType("VkPipelineLayoutCreateInfo const *") org.lwjgl.vulkan.VkPipelineLayoutCreateInfo r9, @javax.annotation.Nullable @org.lwjgl.system.NativeType("VkAllocationCallbacks const *") org.lwjgl.vulkan.VkAllocationCallbacks r10, @org.lwjgl.system.NativeType("VkPipelineLayout *") java.nio.LongBuffer r11) {
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
            int r0 = nvkCreatePipelineLayout(r0, r1, r2, r3)
            return r0
    }

    public static void nvkDestroyPipelineLayout(org.lwjgl.vulkan.VkDevice r9, long r10, long r12) {
            r0 = r9
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkDestroyPipelineLayout
            r14 = r0
            r0 = r9
            long r0 = r0.address()
            r1 = r10
            r2 = r12
            r3 = r14
            org.lwjgl.system.JNI.callPJPV(r0, r1, r2, r3)
            return
    }

    public static void vkDestroyPipelineLayout(org.lwjgl.vulkan.VkDevice r6, @org.lwjgl.system.NativeType("VkPipelineLayout") long r7, @javax.annotation.Nullable @org.lwjgl.system.NativeType("VkAllocationCallbacks const *") org.lwjgl.vulkan.VkAllocationCallbacks r9) {
            r0 = r6
            r1 = r7
            r2 = r9
            long r2 = org.lwjgl.system.MemoryUtil.memAddressSafe(r2)
            nvkDestroyPipelineLayout(r0, r1, r2)
            return
    }

    public static int nvkCreateSampler(org.lwjgl.vulkan.VkDevice r11, long r12, long r14, long r16) {
            r0 = r11
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkCreateSampler
            r18 = r0
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
    public static int vkCreateSampler(org.lwjgl.vulkan.VkDevice r8, @org.lwjgl.system.NativeType("VkSamplerCreateInfo const *") org.lwjgl.vulkan.VkSamplerCreateInfo r9, @javax.annotation.Nullable @org.lwjgl.system.NativeType("VkAllocationCallbacks const *") org.lwjgl.vulkan.VkAllocationCallbacks r10, @org.lwjgl.system.NativeType("VkSampler *") java.nio.LongBuffer r11) {
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
            int r0 = nvkCreateSampler(r0, r1, r2, r3)
            return r0
    }

    public static void nvkDestroySampler(org.lwjgl.vulkan.VkDevice r9, long r10, long r12) {
            r0 = r9
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkDestroySampler
            r14 = r0
            r0 = r9
            long r0 = r0.address()
            r1 = r10
            r2 = r12
            r3 = r14
            org.lwjgl.system.JNI.callPJPV(r0, r1, r2, r3)
            return
    }

    public static void vkDestroySampler(org.lwjgl.vulkan.VkDevice r6, @org.lwjgl.system.NativeType("VkSampler") long r7, @javax.annotation.Nullable @org.lwjgl.system.NativeType("VkAllocationCallbacks const *") org.lwjgl.vulkan.VkAllocationCallbacks r9) {
            r0 = r6
            r1 = r7
            r2 = r9
            long r2 = org.lwjgl.system.MemoryUtil.memAddressSafe(r2)
            nvkDestroySampler(r0, r1, r2)
            return
    }

    public static int nvkCreateDescriptorSetLayout(org.lwjgl.vulkan.VkDevice r11, long r12, long r14, long r16) {
            r0 = r11
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkCreateDescriptorSetLayout
            r18 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L13
            r0 = r12
            org.lwjgl.vulkan.VkDescriptorSetLayoutCreateInfo.validate(r0)
        L13:
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
    public static int vkCreateDescriptorSetLayout(org.lwjgl.vulkan.VkDevice r8, @org.lwjgl.system.NativeType("VkDescriptorSetLayoutCreateInfo const *") org.lwjgl.vulkan.VkDescriptorSetLayoutCreateInfo r9, @javax.annotation.Nullable @org.lwjgl.system.NativeType("VkAllocationCallbacks const *") org.lwjgl.vulkan.VkAllocationCallbacks r10, @org.lwjgl.system.NativeType("VkDescriptorSetLayout *") java.nio.LongBuffer r11) {
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
            int r0 = nvkCreateDescriptorSetLayout(r0, r1, r2, r3)
            return r0
    }

    public static void nvkDestroyDescriptorSetLayout(org.lwjgl.vulkan.VkDevice r9, long r10, long r12) {
            r0 = r9
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkDestroyDescriptorSetLayout
            r14 = r0
            r0 = r9
            long r0 = r0.address()
            r1 = r10
            r2 = r12
            r3 = r14
            org.lwjgl.system.JNI.callPJPV(r0, r1, r2, r3)
            return
    }

    public static void vkDestroyDescriptorSetLayout(org.lwjgl.vulkan.VkDevice r6, @org.lwjgl.system.NativeType("VkDescriptorSetLayout") long r7, @javax.annotation.Nullable @org.lwjgl.system.NativeType("VkAllocationCallbacks const *") org.lwjgl.vulkan.VkAllocationCallbacks r9) {
            r0 = r6
            r1 = r7
            r2 = r9
            long r2 = org.lwjgl.system.MemoryUtil.memAddressSafe(r2)
            nvkDestroyDescriptorSetLayout(r0, r1, r2)
            return
    }

    public static int nvkCreateDescriptorPool(org.lwjgl.vulkan.VkDevice r11, long r12, long r14, long r16) {
            r0 = r11
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkCreateDescriptorPool
            r18 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L13
            r0 = r12
            org.lwjgl.vulkan.VkDescriptorPoolCreateInfo.validate(r0)
        L13:
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
    public static int vkCreateDescriptorPool(org.lwjgl.vulkan.VkDevice r8, @org.lwjgl.system.NativeType("VkDescriptorPoolCreateInfo const *") org.lwjgl.vulkan.VkDescriptorPoolCreateInfo r9, @javax.annotation.Nullable @org.lwjgl.system.NativeType("VkAllocationCallbacks const *") org.lwjgl.vulkan.VkAllocationCallbacks r10, @org.lwjgl.system.NativeType("VkDescriptorPool *") java.nio.LongBuffer r11) {
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
            int r0 = nvkCreateDescriptorPool(r0, r1, r2, r3)
            return r0
    }

    public static void nvkDestroyDescriptorPool(org.lwjgl.vulkan.VkDevice r9, long r10, long r12) {
            r0 = r9
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkDestroyDescriptorPool
            r14 = r0
            r0 = r9
            long r0 = r0.address()
            r1 = r10
            r2 = r12
            r3 = r14
            org.lwjgl.system.JNI.callPJPV(r0, r1, r2, r3)
            return
    }

    public static void vkDestroyDescriptorPool(org.lwjgl.vulkan.VkDevice r6, @org.lwjgl.system.NativeType("VkDescriptorPool") long r7, @javax.annotation.Nullable @org.lwjgl.system.NativeType("VkAllocationCallbacks const *") org.lwjgl.vulkan.VkAllocationCallbacks r9) {
            r0 = r6
            r1 = r7
            r2 = r9
            long r2 = org.lwjgl.system.MemoryUtil.memAddressSafe(r2)
            nvkDestroyDescriptorPool(r0, r1, r2)
            return
    }

    @org.lwjgl.system.NativeType("VkResult")
    public static int vkResetDescriptorPool(org.lwjgl.vulkan.VkDevice r8, @org.lwjgl.system.NativeType("VkDescriptorPool") long r9, @org.lwjgl.system.NativeType("VkDescriptorPoolResetFlags") int r11) {
            r0 = r8
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkResetDescriptorPool
            r12 = r0
            r0 = r8
            long r0 = r0.address()
            r1 = r9
            r2 = r11
            r3 = r12
            int r0 = org.lwjgl.system.JNI.callPJI(r0, r1, r2, r3)
            return r0
    }

    public static int nvkAllocateDescriptorSets(org.lwjgl.vulkan.VkDevice r9, long r10, long r12) {
            r0 = r9
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkAllocateDescriptorSets
            r14 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L13
            r0 = r10
            org.lwjgl.vulkan.VkDescriptorSetAllocateInfo.validate(r0)
        L13:
            r0 = r9
            long r0 = r0.address()
            r1 = r10
            r2 = r12
            r3 = r14
            int r0 = org.lwjgl.system.JNI.callPPPI(r0, r1, r2, r3)
            return r0
    }

    @org.lwjgl.system.NativeType("VkResult")
    public static int vkAllocateDescriptorSets(org.lwjgl.vulkan.VkDevice r6, @org.lwjgl.system.NativeType("VkDescriptorSetAllocateInfo const *") org.lwjgl.vulkan.VkDescriptorSetAllocateInfo r7, @org.lwjgl.system.NativeType("VkDescriptorSet *") java.nio.LongBuffer r8) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Le
            r0 = r8
            r1 = r7
            int r1 = r1.descriptorSetCount()
            org.lwjgl.system.Checks.check(r0, r1)
        Le:
            r0 = r6
            r1 = r7
            long r1 = r1.address()
            r2 = r8
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            int r0 = nvkAllocateDescriptorSets(r0, r1, r2)
            return r0
    }

    public static int nvkFreeDescriptorSets(org.lwjgl.vulkan.VkDevice r10, long r11, int r13, long r14) {
            r0 = r10
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkFreeDescriptorSets
            r16 = r0
            r0 = r10
            long r0 = r0.address()
            r1 = r11
            r2 = r13
            r3 = r14
            r4 = r16
            int r0 = org.lwjgl.system.JNI.callPJPI(r0, r1, r2, r3, r4)
            return r0
    }

    @org.lwjgl.system.NativeType("VkResult")
    public static int vkFreeDescriptorSets(org.lwjgl.vulkan.VkDevice r7, @org.lwjgl.system.NativeType("VkDescriptorPool") long r8, @javax.annotation.Nullable @org.lwjgl.system.NativeType("VkDescriptorSet const *") java.nio.LongBuffer r10) {
            r0 = r7
            r1 = r8
            r2 = r10
            int r2 = org.lwjgl.system.Checks.remainingSafe(r2)
            r3 = r10
            long r3 = org.lwjgl.system.MemoryUtil.memAddressSafe(r3)
            int r0 = nvkFreeDescriptorSets(r0, r1, r2, r3)
            return r0
    }

    @org.lwjgl.system.NativeType("VkResult")
    public static int vkFreeDescriptorSets(org.lwjgl.vulkan.VkDevice r7, @org.lwjgl.system.NativeType("VkDescriptorPool") long r8, @org.lwjgl.system.NativeType("VkDescriptorSet const *") long r10) {
            org.lwjgl.system.MemoryStack r0 = org.lwjgl.system.MemoryStack.stackGet()
            r12 = r0
            r0 = r12
            int r0 = r0.getPointer()
            r13 = r0
            r0 = r12
            r1 = r10
            java.nio.LongBuffer r0 = r0.longs(r1)     // Catch: java.lang.Throwable -> L2b
            r14 = r0
            r0 = r7
            r1 = r8
            r2 = 1
            r3 = r14
            long r3 = org.lwjgl.system.MemoryUtil.memAddress(r3)     // Catch: java.lang.Throwable -> L2b
            int r0 = nvkFreeDescriptorSets(r0, r1, r2, r3)     // Catch: java.lang.Throwable -> L2b
            r15 = r0
            r0 = r12
            r1 = r13
            r0.setPointer(r1)
            r0 = r15
            return r0
        L2b:
            r16 = move-exception
            r0 = r12
            r1 = r13
            r0.setPointer(r1)
            r0 = r16
            throw r0
    }

    public static void nvkUpdateDescriptorSets(org.lwjgl.vulkan.VkDevice r11, int r12, long r13, int r15, long r16) {
            r0 = r11
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkUpdateDescriptorSets
            r18 = r0
            r0 = r11
            long r0 = r0.address()
            r1 = r12
            r2 = r13
            r3 = r15
            r4 = r16
            r5 = r18
            org.lwjgl.system.JNI.callPPPV(r0, r1, r2, r3, r4, r5)
            return
    }

    public static void vkUpdateDescriptorSets(org.lwjgl.vulkan.VkDevice r8, @javax.annotation.Nullable @org.lwjgl.system.NativeType("VkWriteDescriptorSet const *") org.lwjgl.vulkan.VkWriteDescriptorSet.Buffer r9, @javax.annotation.Nullable @org.lwjgl.system.NativeType("VkCopyDescriptorSet const *") org.lwjgl.vulkan.VkCopyDescriptorSet.Buffer r10) {
            r0 = r8
            r1 = r9
            int r1 = org.lwjgl.system.Checks.remainingSafe(r1)
            r2 = r9
            long r2 = org.lwjgl.system.MemoryUtil.memAddressSafe(r2)
            r3 = r10
            int r3 = org.lwjgl.system.Checks.remainingSafe(r3)
            r4 = r10
            long r4 = org.lwjgl.system.MemoryUtil.memAddressSafe(r4)
            nvkUpdateDescriptorSets(r0, r1, r2, r3, r4)
            return
    }

    public static int nvkCreateFramebuffer(org.lwjgl.vulkan.VkDevice r11, long r12, long r14, long r16) {
            r0 = r11
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkCreateFramebuffer
            r18 = r0
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
    public static int vkCreateFramebuffer(org.lwjgl.vulkan.VkDevice r8, @org.lwjgl.system.NativeType("VkFramebufferCreateInfo const *") org.lwjgl.vulkan.VkFramebufferCreateInfo r9, @javax.annotation.Nullable @org.lwjgl.system.NativeType("VkAllocationCallbacks const *") org.lwjgl.vulkan.VkAllocationCallbacks r10, @org.lwjgl.system.NativeType("VkFramebuffer *") java.nio.LongBuffer r11) {
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
            int r0 = nvkCreateFramebuffer(r0, r1, r2, r3)
            return r0
    }

    public static void nvkDestroyFramebuffer(org.lwjgl.vulkan.VkDevice r9, long r10, long r12) {
            r0 = r9
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkDestroyFramebuffer
            r14 = r0
            r0 = r9
            long r0 = r0.address()
            r1 = r10
            r2 = r12
            r3 = r14
            org.lwjgl.system.JNI.callPJPV(r0, r1, r2, r3)
            return
    }

    public static void vkDestroyFramebuffer(org.lwjgl.vulkan.VkDevice r6, @org.lwjgl.system.NativeType("VkFramebuffer") long r7, @javax.annotation.Nullable @org.lwjgl.system.NativeType("VkAllocationCallbacks const *") org.lwjgl.vulkan.VkAllocationCallbacks r9) {
            r0 = r6
            r1 = r7
            r2 = r9
            long r2 = org.lwjgl.system.MemoryUtil.memAddressSafe(r2)
            nvkDestroyFramebuffer(r0, r1, r2)
            return
    }

    public static int nvkCreateRenderPass(org.lwjgl.vulkan.VkDevice r11, long r12, long r14, long r16) {
            r0 = r11
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkCreateRenderPass
            r18 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L13
            r0 = r12
            org.lwjgl.vulkan.VkRenderPassCreateInfo.validate(r0)
        L13:
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
    public static int vkCreateRenderPass(org.lwjgl.vulkan.VkDevice r8, @org.lwjgl.system.NativeType("VkRenderPassCreateInfo const *") org.lwjgl.vulkan.VkRenderPassCreateInfo r9, @javax.annotation.Nullable @org.lwjgl.system.NativeType("VkAllocationCallbacks const *") org.lwjgl.vulkan.VkAllocationCallbacks r10, @org.lwjgl.system.NativeType("VkRenderPass *") java.nio.LongBuffer r11) {
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
            int r0 = nvkCreateRenderPass(r0, r1, r2, r3)
            return r0
    }

    public static void nvkDestroyRenderPass(org.lwjgl.vulkan.VkDevice r9, long r10, long r12) {
            r0 = r9
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkDestroyRenderPass
            r14 = r0
            r0 = r9
            long r0 = r0.address()
            r1 = r10
            r2 = r12
            r3 = r14
            org.lwjgl.system.JNI.callPJPV(r0, r1, r2, r3)
            return
    }

    public static void vkDestroyRenderPass(org.lwjgl.vulkan.VkDevice r6, @org.lwjgl.system.NativeType("VkRenderPass") long r7, @javax.annotation.Nullable @org.lwjgl.system.NativeType("VkAllocationCallbacks const *") org.lwjgl.vulkan.VkAllocationCallbacks r9) {
            r0 = r6
            r1 = r7
            r2 = r9
            long r2 = org.lwjgl.system.MemoryUtil.memAddressSafe(r2)
            nvkDestroyRenderPass(r0, r1, r2)
            return
    }

    public static void nvkGetRenderAreaGranularity(org.lwjgl.vulkan.VkDevice r9, long r10, long r12) {
            r0 = r9
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkGetRenderAreaGranularity
            r14 = r0
            r0 = r9
            long r0 = r0.address()
            r1 = r10
            r2 = r12
            r3 = r14
            org.lwjgl.system.JNI.callPJPV(r0, r1, r2, r3)
            return
    }

    public static void vkGetRenderAreaGranularity(org.lwjgl.vulkan.VkDevice r6, @org.lwjgl.system.NativeType("VkRenderPass") long r7, @org.lwjgl.system.NativeType("VkExtent2D *") org.lwjgl.vulkan.VkExtent2D r9) {
            r0 = r6
            r1 = r7
            r2 = r9
            long r2 = r2.address()
            nvkGetRenderAreaGranularity(r0, r1, r2)
            return
    }

    public static int nvkCreateCommandPool(org.lwjgl.vulkan.VkDevice r11, long r12, long r14, long r16) {
            r0 = r11
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkCreateCommandPool
            r18 = r0
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
    public static int vkCreateCommandPool(org.lwjgl.vulkan.VkDevice r8, @org.lwjgl.system.NativeType("VkCommandPoolCreateInfo const *") org.lwjgl.vulkan.VkCommandPoolCreateInfo r9, @javax.annotation.Nullable @org.lwjgl.system.NativeType("VkAllocationCallbacks const *") org.lwjgl.vulkan.VkAllocationCallbacks r10, @org.lwjgl.system.NativeType("VkCommandPool *") java.nio.LongBuffer r11) {
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
            int r0 = nvkCreateCommandPool(r0, r1, r2, r3)
            return r0
    }

    public static void nvkDestroyCommandPool(org.lwjgl.vulkan.VkDevice r9, long r10, long r12) {
            r0 = r9
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkDestroyCommandPool
            r14 = r0
            r0 = r9
            long r0 = r0.address()
            r1 = r10
            r2 = r12
            r3 = r14
            org.lwjgl.system.JNI.callPJPV(r0, r1, r2, r3)
            return
    }

    public static void vkDestroyCommandPool(org.lwjgl.vulkan.VkDevice r6, @org.lwjgl.system.NativeType("VkCommandPool") long r7, @javax.annotation.Nullable @org.lwjgl.system.NativeType("VkAllocationCallbacks const *") org.lwjgl.vulkan.VkAllocationCallbacks r9) {
            r0 = r6
            r1 = r7
            r2 = r9
            long r2 = org.lwjgl.system.MemoryUtil.memAddressSafe(r2)
            nvkDestroyCommandPool(r0, r1, r2)
            return
    }

    @org.lwjgl.system.NativeType("VkResult")
    public static int vkResetCommandPool(org.lwjgl.vulkan.VkDevice r8, @org.lwjgl.system.NativeType("VkCommandPool") long r9, @org.lwjgl.system.NativeType("VkCommandPoolResetFlags") int r11) {
            r0 = r8
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkResetCommandPool
            r12 = r0
            r0 = r8
            long r0 = r0.address()
            r1 = r9
            r2 = r11
            r3 = r12
            int r0 = org.lwjgl.system.JNI.callPJI(r0, r1, r2, r3)
            return r0
    }

    public static int nvkAllocateCommandBuffers(org.lwjgl.vulkan.VkDevice r9, long r10, long r12) {
            r0 = r9
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkAllocateCommandBuffers
            r14 = r0
            r0 = r9
            long r0 = r0.address()
            r1 = r10
            r2 = r12
            r3 = r14
            int r0 = org.lwjgl.system.JNI.callPPPI(r0, r1, r2, r3)
            return r0
    }

    @org.lwjgl.system.NativeType("VkResult")
    public static int vkAllocateCommandBuffers(org.lwjgl.vulkan.VkDevice r6, @org.lwjgl.system.NativeType("VkCommandBufferAllocateInfo const *") org.lwjgl.vulkan.VkCommandBufferAllocateInfo r7, @org.lwjgl.system.NativeType("VkCommandBuffer *") org.lwjgl.PointerBuffer r8) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Le
            r0 = r8
            r1 = r7
            int r1 = r1.commandBufferCount()
            org.lwjgl.system.Checks.check(r0, r1)
        Le:
            r0 = r6
            r1 = r7
            long r1 = r1.address()
            r2 = r8
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            int r0 = nvkAllocateCommandBuffers(r0, r1, r2)
            return r0
    }

    public static void nvkFreeCommandBuffers(org.lwjgl.vulkan.VkDevice r10, long r11, int r13, long r14) {
            r0 = r10
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkFreeCommandBuffers
            r16 = r0
            r0 = r10
            long r0 = r0.address()
            r1 = r11
            r2 = r13
            r3 = r14
            r4 = r16
            org.lwjgl.system.JNI.callPJPV(r0, r1, r2, r3, r4)
            return
    }

    public static void vkFreeCommandBuffers(org.lwjgl.vulkan.VkDevice r7, @org.lwjgl.system.NativeType("VkCommandPool") long r8, @javax.annotation.Nullable @org.lwjgl.system.NativeType("VkCommandBuffer const *") org.lwjgl.PointerBuffer r10) {
            r0 = r7
            r1 = r8
            r2 = r10
            int r2 = org.lwjgl.system.Checks.remainingSafe(r2)
            r3 = r10
            long r3 = org.lwjgl.system.MemoryUtil.memAddressSafe(r3)
            nvkFreeCommandBuffers(r0, r1, r2, r3)
            return
    }

    public static void vkFreeCommandBuffers(org.lwjgl.vulkan.VkDevice r7, @org.lwjgl.system.NativeType("VkCommandPool") long r8, @org.lwjgl.system.NativeType("VkCommandBuffer const *") org.lwjgl.vulkan.VkCommandBuffer r10) {
            org.lwjgl.system.MemoryStack r0 = org.lwjgl.system.MemoryStack.stackGet()
            r11 = r0
            r0 = r11
            int r0 = r0.getPointer()
            r12 = r0
            r0 = r11
            r1 = r10
            org.lwjgl.PointerBuffer r0 = r0.pointers(r1)     // Catch: java.lang.Throwable -> L29
            r13 = r0
            r0 = r7
            r1 = r8
            r2 = 1
            r3 = r13
            long r3 = org.lwjgl.system.MemoryUtil.memAddress(r3)     // Catch: java.lang.Throwable -> L29
            nvkFreeCommandBuffers(r0, r1, r2, r3)     // Catch: java.lang.Throwable -> L29
            r0 = r11
            r1 = r12
            r0.setPointer(r1)
            goto L35
        L29:
            r14 = move-exception
            r0 = r11
            r1 = r12
            r0.setPointer(r1)
            r0 = r14
            throw r0
        L35:
            return
    }

    public static int nvkBeginCommandBuffer(org.lwjgl.vulkan.VkCommandBuffer r7, long r8) {
            r0 = r7
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkBeginCommandBuffer
            r10 = r0
            r0 = r7
            long r0 = r0.address()
            r1 = r8
            r2 = r10
            int r0 = org.lwjgl.system.JNI.callPPI(r0, r1, r2)
            return r0
    }

    @org.lwjgl.system.NativeType("VkResult")
    public static int vkBeginCommandBuffer(org.lwjgl.vulkan.VkCommandBuffer r4, @org.lwjgl.system.NativeType("VkCommandBufferBeginInfo const *") org.lwjgl.vulkan.VkCommandBufferBeginInfo r5) {
            r0 = r4
            r1 = r5
            long r1 = r1.address()
            int r0 = nvkBeginCommandBuffer(r0, r1)
            return r0
    }

    @org.lwjgl.system.NativeType("VkResult")
    public static int vkEndCommandBuffer(org.lwjgl.vulkan.VkCommandBuffer r5) {
            r0 = r5
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkEndCommandBuffer
            r6 = r0
            r0 = r5
            long r0 = r0.address()
            r1 = r6
            int r0 = org.lwjgl.system.JNI.callPI(r0, r1)
            return r0
    }

    @org.lwjgl.system.NativeType("VkResult")
    public static int vkResetCommandBuffer(org.lwjgl.vulkan.VkCommandBuffer r6, @org.lwjgl.system.NativeType("VkCommandBufferResetFlags") int r7) {
            r0 = r6
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkResetCommandBuffer
            r8 = r0
            r0 = r6
            long r0 = r0.address()
            r1 = r7
            r2 = r8
            int r0 = org.lwjgl.system.JNI.callPI(r0, r1, r2)
            return r0
    }

    public static void vkCmdBindPipeline(org.lwjgl.vulkan.VkCommandBuffer r8, @org.lwjgl.system.NativeType("VkPipelineBindPoint") int r9, @org.lwjgl.system.NativeType("VkPipeline") long r10) {
            r0 = r8
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkCmdBindPipeline
            r12 = r0
            r0 = r8
            long r0 = r0.address()
            r1 = r9
            r2 = r10
            r3 = r12
            org.lwjgl.system.JNI.callPJV(r0, r1, r2, r3)
            return
    }

    public static void nvkCmdSetViewport(org.lwjgl.vulkan.VkCommandBuffer r9, int r10, int r11, long r12) {
            r0 = r9
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkCmdSetViewport
            r14 = r0
            r0 = r9
            long r0 = r0.address()
            r1 = r10
            r2 = r11
            r3 = r12
            r4 = r14
            org.lwjgl.system.JNI.callPPV(r0, r1, r2, r3, r4)
            return
    }

    public static void vkCmdSetViewport(org.lwjgl.vulkan.VkCommandBuffer r6, @org.lwjgl.system.NativeType("uint32_t") int r7, @org.lwjgl.system.NativeType("VkViewport const *") org.lwjgl.vulkan.VkViewport.Buffer r8) {
            r0 = r6
            r1 = r7
            r2 = r8
            int r2 = r2.remaining()
            r3 = r8
            long r3 = r3.address()
            nvkCmdSetViewport(r0, r1, r2, r3)
            return
    }

    public static void nvkCmdSetScissor(org.lwjgl.vulkan.VkCommandBuffer r9, int r10, int r11, long r12) {
            r0 = r9
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkCmdSetScissor
            r14 = r0
            r0 = r9
            long r0 = r0.address()
            r1 = r10
            r2 = r11
            r3 = r12
            r4 = r14
            org.lwjgl.system.JNI.callPPV(r0, r1, r2, r3, r4)
            return
    }

    public static void vkCmdSetScissor(org.lwjgl.vulkan.VkCommandBuffer r6, @org.lwjgl.system.NativeType("uint32_t") int r7, @org.lwjgl.system.NativeType("VkRect2D const *") org.lwjgl.vulkan.VkRect2D.Buffer r8) {
            r0 = r6
            r1 = r7
            r2 = r8
            int r2 = r2.remaining()
            r3 = r8
            long r3 = r3.address()
            nvkCmdSetScissor(r0, r1, r2, r3)
            return
    }

    public static void vkCmdSetLineWidth(org.lwjgl.vulkan.VkCommandBuffer r6, float r7) {
            r0 = r6
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkCmdSetLineWidth
            r8 = r0
            r0 = r6
            long r0 = r0.address()
            r1 = r7
            r2 = r8
            org.lwjgl.system.JNI.callPV(r0, r1, r2)
            return
    }

    public static void vkCmdSetDepthBias(org.lwjgl.vulkan.VkCommandBuffer r8, float r9, float r10, float r11) {
            r0 = r8
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkCmdSetDepthBias
            r12 = r0
            r0 = r8
            long r0 = r0.address()
            r1 = r9
            r2 = r10
            r3 = r11
            r4 = r12
            org.lwjgl.system.JNI.callPV(r0, r1, r2, r3, r4)
            return
    }

    public static void nvkCmdSetBlendConstants(org.lwjgl.vulkan.VkCommandBuffer r7, long r8) {
            r0 = r7
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkCmdSetBlendConstants
            r10 = r0
            r0 = r7
            long r0 = r0.address()
            r1 = r8
            r2 = r10
            org.lwjgl.system.JNI.callPPV(r0, r1, r2)
            return
    }

    public static void vkCmdSetBlendConstants(org.lwjgl.vulkan.VkCommandBuffer r4, @org.lwjgl.system.NativeType("float const *") java.nio.FloatBuffer r5) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r5
            r1 = 4
            org.lwjgl.system.Checks.check(r0, r1)
        Lb:
            r0 = r4
            r1 = r5
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            nvkCmdSetBlendConstants(r0, r1)
            return
    }

    public static void vkCmdSetDepthBounds(org.lwjgl.vulkan.VkCommandBuffer r7, float r8, float r9) {
            r0 = r7
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkCmdSetDepthBounds
            r10 = r0
            r0 = r7
            long r0 = r0.address()
            r1 = r8
            r2 = r9
            r3 = r10
            org.lwjgl.system.JNI.callPV(r0, r1, r2, r3)
            return
    }

    public static void vkCmdSetStencilCompareMask(org.lwjgl.vulkan.VkCommandBuffer r7, @org.lwjgl.system.NativeType("VkStencilFaceFlags") int r8, @org.lwjgl.system.NativeType("uint32_t") int r9) {
            r0 = r7
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkCmdSetStencilCompareMask
            r10 = r0
            r0 = r7
            long r0 = r0.address()
            r1 = r8
            r2 = r9
            r3 = r10
            org.lwjgl.system.JNI.callPV(r0, r1, r2, r3)
            return
    }

    public static void vkCmdSetStencilWriteMask(org.lwjgl.vulkan.VkCommandBuffer r7, @org.lwjgl.system.NativeType("VkStencilFaceFlags") int r8, @org.lwjgl.system.NativeType("uint32_t") int r9) {
            r0 = r7
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkCmdSetStencilWriteMask
            r10 = r0
            r0 = r7
            long r0 = r0.address()
            r1 = r8
            r2 = r9
            r3 = r10
            org.lwjgl.system.JNI.callPV(r0, r1, r2, r3)
            return
    }

    public static void vkCmdSetStencilReference(org.lwjgl.vulkan.VkCommandBuffer r7, @org.lwjgl.system.NativeType("VkStencilFaceFlags") int r8, @org.lwjgl.system.NativeType("uint32_t") int r9) {
            r0 = r7
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkCmdSetStencilReference
            r10 = r0
            r0 = r7
            long r0 = r0.address()
            r1 = r8
            r2 = r9
            r3 = r10
            org.lwjgl.system.JNI.callPV(r0, r1, r2, r3)
            return
    }

    public static void nvkCmdBindDescriptorSets(org.lwjgl.vulkan.VkCommandBuffer r15, int r16, long r17, int r19, int r20, long r21, int r23, long r24) {
            r0 = r15
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkCmdBindDescriptorSets
            r26 = r0
            r0 = r15
            long r0 = r0.address()
            r1 = r16
            r2 = r17
            r3 = r19
            r4 = r20
            r5 = r21
            r6 = r23
            r7 = r24
            r8 = r26
            org.lwjgl.system.JNI.callPJPPV(r0, r1, r2, r3, r4, r5, r6, r7, r8)
            return
    }

    public static void vkCmdBindDescriptorSets(org.lwjgl.vulkan.VkCommandBuffer r12, @org.lwjgl.system.NativeType("VkPipelineBindPoint") int r13, @org.lwjgl.system.NativeType("VkPipelineLayout") long r14, @org.lwjgl.system.NativeType("uint32_t") int r16, @org.lwjgl.system.NativeType("VkDescriptorSet const *") java.nio.LongBuffer r17, @javax.annotation.Nullable @org.lwjgl.system.NativeType("uint32_t const *") java.nio.IntBuffer r18) {
            r0 = r12
            r1 = r13
            r2 = r14
            r3 = r16
            r4 = r17
            int r4 = r4.remaining()
            r5 = r17
            long r5 = org.lwjgl.system.MemoryUtil.memAddress(r5)
            r6 = r18
            int r6 = org.lwjgl.system.Checks.remainingSafe(r6)
            r7 = r18
            long r7 = org.lwjgl.system.MemoryUtil.memAddressSafe(r7)
            nvkCmdBindDescriptorSets(r0, r1, r2, r3, r4, r5, r6, r7)
            return
    }

    public static void vkCmdBindIndexBuffer(org.lwjgl.vulkan.VkCommandBuffer r10, @org.lwjgl.system.NativeType("VkBuffer") long r11, @org.lwjgl.system.NativeType("VkDeviceSize") long r13, @org.lwjgl.system.NativeType("VkIndexType") int r15) {
            r0 = r10
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkCmdBindIndexBuffer
            r16 = r0
            r0 = r10
            long r0 = r0.address()
            r1 = r11
            r2 = r13
            r3 = r15
            r4 = r16
            org.lwjgl.system.JNI.callPJJV(r0, r1, r2, r3, r4)
            return
    }

    public static void nvkCmdBindVertexBuffers(org.lwjgl.vulkan.VkCommandBuffer r11, int r12, int r13, long r14, long r16) {
            r0 = r11
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkCmdBindVertexBuffers
            r18 = r0
            r0 = r11
            long r0 = r0.address()
            r1 = r12
            r2 = r13
            r3 = r14
            r4 = r16
            r5 = r18
            org.lwjgl.system.JNI.callPPPV(r0, r1, r2, r3, r4, r5)
            return
    }

    public static void vkCmdBindVertexBuffers(org.lwjgl.vulkan.VkCommandBuffer r8, @org.lwjgl.system.NativeType("uint32_t") int r9, @org.lwjgl.system.NativeType("VkBuffer const *") java.nio.LongBuffer r10, @org.lwjgl.system.NativeType("VkDeviceSize const *") java.nio.LongBuffer r11) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Le
            r0 = r11
            r1 = r10
            int r1 = r1.remaining()
            org.lwjgl.system.Checks.check(r0, r1)
        Le:
            r0 = r8
            r1 = r9
            r2 = r10
            int r2 = r2.remaining()
            r3 = r10
            long r3 = org.lwjgl.system.MemoryUtil.memAddress(r3)
            r4 = r11
            long r4 = org.lwjgl.system.MemoryUtil.memAddress(r4)
            nvkCmdBindVertexBuffers(r0, r1, r2, r3, r4)
            return
    }

    public static void vkCmdDraw(org.lwjgl.vulkan.VkCommandBuffer r9, @org.lwjgl.system.NativeType("uint32_t") int r10, @org.lwjgl.system.NativeType("uint32_t") int r11, @org.lwjgl.system.NativeType("uint32_t") int r12, @org.lwjgl.system.NativeType("uint32_t") int r13) {
            r0 = r9
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkCmdDraw
            r14 = r0
            r0 = r9
            long r0 = r0.address()
            r1 = r10
            r2 = r11
            r3 = r12
            r4 = r13
            r5 = r14
            org.lwjgl.system.JNI.callPV(r0, r1, r2, r3, r4, r5)
            return
    }

    public static void vkCmdDrawIndexed(org.lwjgl.vulkan.VkCommandBuffer r10, @org.lwjgl.system.NativeType("uint32_t") int r11, @org.lwjgl.system.NativeType("uint32_t") int r12, @org.lwjgl.system.NativeType("uint32_t") int r13, @org.lwjgl.system.NativeType("int32_t") int r14, @org.lwjgl.system.NativeType("uint32_t") int r15) {
            r0 = r10
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkCmdDrawIndexed
            r16 = r0
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

    public static void vkCmdDrawIndirect(org.lwjgl.vulkan.VkCommandBuffer r11, @org.lwjgl.system.NativeType("VkBuffer") long r12, @org.lwjgl.system.NativeType("VkDeviceSize") long r14, @org.lwjgl.system.NativeType("uint32_t") int r16, @org.lwjgl.system.NativeType("uint32_t") int r17) {
            r0 = r11
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkCmdDrawIndirect
            r18 = r0
            r0 = r11
            long r0 = r0.address()
            r1 = r12
            r2 = r14
            r3 = r16
            r4 = r17
            r5 = r18
            org.lwjgl.system.JNI.callPJJV(r0, r1, r2, r3, r4, r5)
            return
    }

    public static void vkCmdDrawIndexedIndirect(org.lwjgl.vulkan.VkCommandBuffer r11, @org.lwjgl.system.NativeType("VkBuffer") long r12, @org.lwjgl.system.NativeType("VkDeviceSize") long r14, @org.lwjgl.system.NativeType("uint32_t") int r16, @org.lwjgl.system.NativeType("uint32_t") int r17) {
            r0 = r11
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkCmdDrawIndexedIndirect
            r18 = r0
            r0 = r11
            long r0 = r0.address()
            r1 = r12
            r2 = r14
            r3 = r16
            r4 = r17
            r5 = r18
            org.lwjgl.system.JNI.callPJJV(r0, r1, r2, r3, r4, r5)
            return
    }

    public static void vkCmdDispatch(org.lwjgl.vulkan.VkCommandBuffer r8, @org.lwjgl.system.NativeType("uint32_t") int r9, @org.lwjgl.system.NativeType("uint32_t") int r10, @org.lwjgl.system.NativeType("uint32_t") int r11) {
            r0 = r8
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkCmdDispatch
            r12 = r0
            r0 = r8
            long r0 = r0.address()
            r1 = r9
            r2 = r10
            r3 = r11
            r4 = r12
            org.lwjgl.system.JNI.callPV(r0, r1, r2, r3, r4)
            return
    }

    public static void vkCmdDispatchIndirect(org.lwjgl.vulkan.VkCommandBuffer r9, @org.lwjgl.system.NativeType("VkBuffer") long r10, @org.lwjgl.system.NativeType("VkDeviceSize") long r12) {
            r0 = r9
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkCmdDispatchIndirect
            r14 = r0
            r0 = r9
            long r0 = r0.address()
            r1 = r10
            r2 = r12
            r3 = r14
            org.lwjgl.system.JNI.callPJJV(r0, r1, r2, r3)
            return
    }

    public static void nvkCmdCopyBuffer(org.lwjgl.vulkan.VkCommandBuffer r12, long r13, long r15, int r17, long r18) {
            r0 = r12
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkCmdCopyBuffer
            r20 = r0
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

    public static void vkCmdCopyBuffer(org.lwjgl.vulkan.VkCommandBuffer r9, @org.lwjgl.system.NativeType("VkBuffer") long r10, @org.lwjgl.system.NativeType("VkBuffer") long r12, @org.lwjgl.system.NativeType("VkBufferCopy const *") org.lwjgl.vulkan.VkBufferCopy.Buffer r14) {
            r0 = r9
            r1 = r10
            r2 = r12
            r3 = r14
            int r3 = r3.remaining()
            r4 = r14
            long r4 = r4.address()
            nvkCmdCopyBuffer(r0, r1, r2, r3, r4)
            return
    }

    public static void nvkCmdCopyImage(org.lwjgl.vulkan.VkCommandBuffer r14, long r15, int r17, long r18, int r20, int r21, long r22) {
            r0 = r14
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkCmdCopyImage
            r24 = r0
            r0 = r14
            long r0 = r0.address()
            r1 = r15
            r2 = r17
            r3 = r18
            r4 = r20
            r5 = r21
            r6 = r22
            r7 = r24
            org.lwjgl.system.JNI.callPJJPV(r0, r1, r2, r3, r4, r5, r6, r7)
            return
    }

    public static void vkCmdCopyImage(org.lwjgl.vulkan.VkCommandBuffer r11, @org.lwjgl.system.NativeType("VkImage") long r12, @org.lwjgl.system.NativeType("VkImageLayout") int r14, @org.lwjgl.system.NativeType("VkImage") long r15, @org.lwjgl.system.NativeType("VkImageLayout") int r17, @org.lwjgl.system.NativeType("VkImageCopy const *") org.lwjgl.vulkan.VkImageCopy.Buffer r18) {
            r0 = r11
            r1 = r12
            r2 = r14
            r3 = r15
            r4 = r17
            r5 = r18
            int r5 = r5.remaining()
            r6 = r18
            long r6 = r6.address()
            nvkCmdCopyImage(r0, r1, r2, r3, r4, r5, r6)
            return
    }

    public static void nvkCmdBlitImage(org.lwjgl.vulkan.VkCommandBuffer r15, long r16, int r18, long r19, int r21, int r22, long r23, int r25) {
            r0 = r15
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkCmdBlitImage
            r26 = r0
            r0 = r15
            long r0 = r0.address()
            r1 = r16
            r2 = r18
            r3 = r19
            r4 = r21
            r5 = r22
            r6 = r23
            r7 = r25
            r8 = r26
            org.lwjgl.system.JNI.callPJJPV(r0, r1, r2, r3, r4, r5, r6, r7, r8)
            return
    }

    public static void vkCmdBlitImage(org.lwjgl.vulkan.VkCommandBuffer r12, @org.lwjgl.system.NativeType("VkImage") long r13, @org.lwjgl.system.NativeType("VkImageLayout") int r15, @org.lwjgl.system.NativeType("VkImage") long r16, @org.lwjgl.system.NativeType("VkImageLayout") int r18, @org.lwjgl.system.NativeType("VkImageBlit const *") org.lwjgl.vulkan.VkImageBlit.Buffer r19, @org.lwjgl.system.NativeType("VkFilter") int r20) {
            r0 = r12
            r1 = r13
            r2 = r15
            r3 = r16
            r4 = r18
            r5 = r19
            int r5 = r5.remaining()
            r6 = r19
            long r6 = r6.address()
            r7 = r20
            nvkCmdBlitImage(r0, r1, r2, r3, r4, r5, r6, r7)
            return
    }

    public static void nvkCmdCopyBufferToImage(org.lwjgl.vulkan.VkCommandBuffer r13, long r14, long r16, int r18, int r19, long r20) {
            r0 = r13
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkCmdCopyBufferToImage
            r22 = r0
            r0 = r13
            long r0 = r0.address()
            r1 = r14
            r2 = r16
            r3 = r18
            r4 = r19
            r5 = r20
            r6 = r22
            org.lwjgl.system.JNI.callPJJPV(r0, r1, r2, r3, r4, r5, r6)
            return
    }

    public static void vkCmdCopyBufferToImage(org.lwjgl.vulkan.VkCommandBuffer r10, @org.lwjgl.system.NativeType("VkBuffer") long r11, @org.lwjgl.system.NativeType("VkImage") long r13, @org.lwjgl.system.NativeType("VkImageLayout") int r15, @org.lwjgl.system.NativeType("VkBufferImageCopy const *") org.lwjgl.vulkan.VkBufferImageCopy.Buffer r16) {
            r0 = r10
            r1 = r11
            r2 = r13
            r3 = r15
            r4 = r16
            int r4 = r4.remaining()
            r5 = r16
            long r5 = r5.address()
            nvkCmdCopyBufferToImage(r0, r1, r2, r3, r4, r5)
            return
    }

    public static void nvkCmdCopyImageToBuffer(org.lwjgl.vulkan.VkCommandBuffer r13, long r14, int r16, long r17, int r19, long r20) {
            r0 = r13
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkCmdCopyImageToBuffer
            r22 = r0
            r0 = r13
            long r0 = r0.address()
            r1 = r14
            r2 = r16
            r3 = r17
            r4 = r19
            r5 = r20
            r6 = r22
            org.lwjgl.system.JNI.callPJJPV(r0, r1, r2, r3, r4, r5, r6)
            return
    }

    public static void vkCmdCopyImageToBuffer(org.lwjgl.vulkan.VkCommandBuffer r10, @org.lwjgl.system.NativeType("VkImage") long r11, @org.lwjgl.system.NativeType("VkImageLayout") int r13, @org.lwjgl.system.NativeType("VkBuffer") long r14, @org.lwjgl.system.NativeType("VkBufferImageCopy const *") org.lwjgl.vulkan.VkBufferImageCopy.Buffer r16) {
            r0 = r10
            r1 = r11
            r2 = r13
            r3 = r14
            r4 = r16
            int r4 = r4.remaining()
            r5 = r16
            long r5 = r5.address()
            nvkCmdCopyImageToBuffer(r0, r1, r2, r3, r4, r5)
            return
    }

    public static void nvkCmdUpdateBuffer(org.lwjgl.vulkan.VkCommandBuffer r13, long r14, long r16, long r18, long r20) {
            r0 = r13
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkCmdUpdateBuffer
            r22 = r0
            r0 = r13
            long r0 = r0.address()
            r1 = r14
            r2 = r16
            r3 = r18
            r4 = r20
            r5 = r22
            org.lwjgl.system.JNI.callPJJJPV(r0, r1, r2, r3, r4, r5)
            return
    }

    public static void vkCmdUpdateBuffer(org.lwjgl.vulkan.VkCommandBuffer r10, @org.lwjgl.system.NativeType("VkBuffer") long r11, @org.lwjgl.system.NativeType("VkDeviceSize") long r13, @org.lwjgl.system.NativeType("void const *") java.nio.ByteBuffer r15) {
            r0 = r10
            r1 = r11
            r2 = r13
            r3 = r15
            int r3 = r3.remaining()
            long r3 = (long) r3
            r4 = r15
            long r4 = org.lwjgl.system.MemoryUtil.memAddress(r4)
            nvkCmdUpdateBuffer(r0, r1, r2, r3, r4)
            return
    }

    public static void vkCmdUpdateBuffer(org.lwjgl.vulkan.VkCommandBuffer r10, @org.lwjgl.system.NativeType("VkBuffer") long r11, @org.lwjgl.system.NativeType("VkDeviceSize") long r13, @org.lwjgl.system.NativeType("void const *") java.nio.ShortBuffer r15) {
            r0 = r10
            r1 = r11
            r2 = r13
            r3 = r15
            int r3 = r3.remaining()
            long r3 = java.lang.Integer.toUnsignedLong(r3)
            r4 = 1
            long r3 = r3 << r4
            r4 = r15
            long r4 = org.lwjgl.system.MemoryUtil.memAddress(r4)
            nvkCmdUpdateBuffer(r0, r1, r2, r3, r4)
            return
    }

    public static void vkCmdUpdateBuffer(org.lwjgl.vulkan.VkCommandBuffer r10, @org.lwjgl.system.NativeType("VkBuffer") long r11, @org.lwjgl.system.NativeType("VkDeviceSize") long r13, @org.lwjgl.system.NativeType("void const *") java.nio.IntBuffer r15) {
            r0 = r10
            r1 = r11
            r2 = r13
            r3 = r15
            int r3 = r3.remaining()
            long r3 = java.lang.Integer.toUnsignedLong(r3)
            r4 = 2
            long r3 = r3 << r4
            r4 = r15
            long r4 = org.lwjgl.system.MemoryUtil.memAddress(r4)
            nvkCmdUpdateBuffer(r0, r1, r2, r3, r4)
            return
    }

    public static void vkCmdUpdateBuffer(org.lwjgl.vulkan.VkCommandBuffer r10, @org.lwjgl.system.NativeType("VkBuffer") long r11, @org.lwjgl.system.NativeType("VkDeviceSize") long r13, @org.lwjgl.system.NativeType("void const *") java.nio.LongBuffer r15) {
            r0 = r10
            r1 = r11
            r2 = r13
            r3 = r15
            int r3 = r3.remaining()
            long r3 = java.lang.Integer.toUnsignedLong(r3)
            r4 = 3
            long r3 = r3 << r4
            r4 = r15
            long r4 = org.lwjgl.system.MemoryUtil.memAddress(r4)
            nvkCmdUpdateBuffer(r0, r1, r2, r3, r4)
            return
    }

    public static void vkCmdUpdateBuffer(org.lwjgl.vulkan.VkCommandBuffer r10, @org.lwjgl.system.NativeType("VkBuffer") long r11, @org.lwjgl.system.NativeType("VkDeviceSize") long r13, @org.lwjgl.system.NativeType("void const *") java.nio.FloatBuffer r15) {
            r0 = r10
            r1 = r11
            r2 = r13
            r3 = r15
            int r3 = r3.remaining()
            long r3 = java.lang.Integer.toUnsignedLong(r3)
            r4 = 2
            long r3 = r3 << r4
            r4 = r15
            long r4 = org.lwjgl.system.MemoryUtil.memAddress(r4)
            nvkCmdUpdateBuffer(r0, r1, r2, r3, r4)
            return
    }

    public static void vkCmdUpdateBuffer(org.lwjgl.vulkan.VkCommandBuffer r10, @org.lwjgl.system.NativeType("VkBuffer") long r11, @org.lwjgl.system.NativeType("VkDeviceSize") long r13, @org.lwjgl.system.NativeType("void const *") java.nio.DoubleBuffer r15) {
            r0 = r10
            r1 = r11
            r2 = r13
            r3 = r15
            int r3 = r3.remaining()
            long r3 = java.lang.Integer.toUnsignedLong(r3)
            r4 = 3
            long r3 = r3 << r4
            r4 = r15
            long r4 = org.lwjgl.system.MemoryUtil.memAddress(r4)
            nvkCmdUpdateBuffer(r0, r1, r2, r3, r4)
            return
    }

    public static void vkCmdFillBuffer(org.lwjgl.vulkan.VkCommandBuffer r12, @org.lwjgl.system.NativeType("VkBuffer") long r13, @org.lwjgl.system.NativeType("VkDeviceSize") long r15, @org.lwjgl.system.NativeType("VkDeviceSize") long r17, @org.lwjgl.system.NativeType("uint32_t") int r19) {
            r0 = r12
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkCmdFillBuffer
            r20 = r0
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

    public static void nvkCmdClearColorImage(org.lwjgl.vulkan.VkCommandBuffer r13, long r14, int r16, long r17, int r19, long r20) {
            r0 = r13
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkCmdClearColorImage
            r22 = r0
            r0 = r13
            long r0 = r0.address()
            r1 = r14
            r2 = r16
            r3 = r17
            r4 = r19
            r5 = r20
            r6 = r22
            org.lwjgl.system.JNI.callPJPPV(r0, r1, r2, r3, r4, r5, r6)
            return
    }

    public static void vkCmdClearColorImage(org.lwjgl.vulkan.VkCommandBuffer r10, @org.lwjgl.system.NativeType("VkImage") long r11, @org.lwjgl.system.NativeType("VkImageLayout") int r13, @javax.annotation.Nullable @org.lwjgl.system.NativeType("VkClearColorValue const *") org.lwjgl.vulkan.VkClearColorValue r14, @org.lwjgl.system.NativeType("VkImageSubresourceRange const *") org.lwjgl.vulkan.VkImageSubresourceRange.Buffer r15) {
            r0 = r10
            r1 = r11
            r2 = r13
            r3 = r14
            long r3 = org.lwjgl.system.MemoryUtil.memAddressSafe(r3)
            r4 = r15
            int r4 = r4.remaining()
            r5 = r15
            long r5 = r5.address()
            nvkCmdClearColorImage(r0, r1, r2, r3, r4, r5)
            return
    }

    public static void vkCmdClearColorImage(org.lwjgl.vulkan.VkCommandBuffer r10, @org.lwjgl.system.NativeType("VkImage") long r11, @org.lwjgl.system.NativeType("VkImageLayout") int r13, @javax.annotation.Nullable @org.lwjgl.system.NativeType("VkClearColorValue const *") org.lwjgl.vulkan.VkClearColorValue r14, @org.lwjgl.system.NativeType("VkImageSubresourceRange const *") org.lwjgl.vulkan.VkImageSubresourceRange r15) {
            r0 = r10
            r1 = r11
            r2 = r13
            r3 = r14
            long r3 = org.lwjgl.system.MemoryUtil.memAddressSafe(r3)
            r4 = 1
            r5 = r15
            long r5 = r5.address()
            nvkCmdClearColorImage(r0, r1, r2, r3, r4, r5)
            return
    }

    public static void nvkCmdClearDepthStencilImage(org.lwjgl.vulkan.VkCommandBuffer r13, long r14, int r16, long r17, int r19, long r20) {
            r0 = r13
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkCmdClearDepthStencilImage
            r22 = r0
            r0 = r13
            long r0 = r0.address()
            r1 = r14
            r2 = r16
            r3 = r17
            r4 = r19
            r5 = r20
            r6 = r22
            org.lwjgl.system.JNI.callPJPPV(r0, r1, r2, r3, r4, r5, r6)
            return
    }

    public static void vkCmdClearDepthStencilImage(org.lwjgl.vulkan.VkCommandBuffer r10, @org.lwjgl.system.NativeType("VkImage") long r11, @org.lwjgl.system.NativeType("VkImageLayout") int r13, @org.lwjgl.system.NativeType("VkClearDepthStencilValue const *") org.lwjgl.vulkan.VkClearDepthStencilValue r14, @org.lwjgl.system.NativeType("VkImageSubresourceRange const *") org.lwjgl.vulkan.VkImageSubresourceRange.Buffer r15) {
            r0 = r10
            r1 = r11
            r2 = r13
            r3 = r14
            long r3 = r3.address()
            r4 = r15
            int r4 = r4.remaining()
            r5 = r15
            long r5 = r5.address()
            nvkCmdClearDepthStencilImage(r0, r1, r2, r3, r4, r5)
            return
    }

    public static void vkCmdClearDepthStencilImage(org.lwjgl.vulkan.VkCommandBuffer r10, @org.lwjgl.system.NativeType("VkImage") long r11, @org.lwjgl.system.NativeType("VkImageLayout") int r13, @org.lwjgl.system.NativeType("VkClearDepthStencilValue const *") org.lwjgl.vulkan.VkClearDepthStencilValue r14, @org.lwjgl.system.NativeType("VkImageSubresourceRange const *") org.lwjgl.vulkan.VkImageSubresourceRange r15) {
            r0 = r10
            r1 = r11
            r2 = r13
            r3 = r14
            long r3 = r3.address()
            r4 = 1
            r5 = r15
            long r5 = r5.address()
            nvkCmdClearDepthStencilImage(r0, r1, r2, r3, r4, r5)
            return
    }

    public static void nvkCmdClearAttachments(org.lwjgl.vulkan.VkCommandBuffer r11, int r12, long r13, int r15, long r16) {
            r0 = r11
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkCmdClearAttachments
            r18 = r0
            r0 = r11
            long r0 = r0.address()
            r1 = r12
            r2 = r13
            r3 = r15
            r4 = r16
            r5 = r18
            org.lwjgl.system.JNI.callPPPV(r0, r1, r2, r3, r4, r5)
            return
    }

    public static void vkCmdClearAttachments(org.lwjgl.vulkan.VkCommandBuffer r8, @org.lwjgl.system.NativeType("VkClearAttachment const *") org.lwjgl.vulkan.VkClearAttachment.Buffer r9, @org.lwjgl.system.NativeType("VkClearRect const *") org.lwjgl.vulkan.VkClearRect.Buffer r10) {
            r0 = r8
            r1 = r9
            int r1 = r1.remaining()
            r2 = r9
            long r2 = r2.address()
            r3 = r10
            int r3 = r3.remaining()
            r4 = r10
            long r4 = r4.address()
            nvkCmdClearAttachments(r0, r1, r2, r3, r4)
            return
    }

    public static void nvkCmdResolveImage(org.lwjgl.vulkan.VkCommandBuffer r14, long r15, int r17, long r18, int r20, int r21, long r22) {
            r0 = r14
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkCmdResolveImage
            r24 = r0
            r0 = r14
            long r0 = r0.address()
            r1 = r15
            r2 = r17
            r3 = r18
            r4 = r20
            r5 = r21
            r6 = r22
            r7 = r24
            org.lwjgl.system.JNI.callPJJPV(r0, r1, r2, r3, r4, r5, r6, r7)
            return
    }

    public static void vkCmdResolveImage(org.lwjgl.vulkan.VkCommandBuffer r11, @org.lwjgl.system.NativeType("VkImage") long r12, @org.lwjgl.system.NativeType("VkImageLayout") int r14, @org.lwjgl.system.NativeType("VkImage") long r15, @org.lwjgl.system.NativeType("VkImageLayout") int r17, @org.lwjgl.system.NativeType("VkImageResolve const *") org.lwjgl.vulkan.VkImageResolve.Buffer r18) {
            r0 = r11
            r1 = r12
            r2 = r14
            r3 = r15
            r4 = r17
            r5 = r18
            int r5 = r5.remaining()
            r6 = r18
            long r6 = r6.address()
            nvkCmdResolveImage(r0, r1, r2, r3, r4, r5, r6)
            return
    }

    public static void vkCmdResolveImage(org.lwjgl.vulkan.VkCommandBuffer r11, @org.lwjgl.system.NativeType("VkImage") long r12, @org.lwjgl.system.NativeType("VkImageLayout") int r14, @org.lwjgl.system.NativeType("VkImage") long r15, @org.lwjgl.system.NativeType("VkImageLayout") int r17, @org.lwjgl.system.NativeType("VkImageResolve const *") org.lwjgl.vulkan.VkImageResolve r18) {
            r0 = r11
            r1 = r12
            r2 = r14
            r3 = r15
            r4 = r17
            r5 = 1
            r6 = r18
            long r6 = r6.address()
            nvkCmdResolveImage(r0, r1, r2, r3, r4, r5, r6)
            return
    }

    public static void vkCmdSetEvent(org.lwjgl.vulkan.VkCommandBuffer r8, @org.lwjgl.system.NativeType("VkEvent") long r9, @org.lwjgl.system.NativeType("VkPipelineStageFlags") int r11) {
            r0 = r8
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkCmdSetEvent
            r12 = r0
            r0 = r8
            long r0 = r0.address()
            r1 = r9
            r2 = r11
            r3 = r12
            org.lwjgl.system.JNI.callPJV(r0, r1, r2, r3)
            return
    }

    public static void vkCmdResetEvent(org.lwjgl.vulkan.VkCommandBuffer r8, @org.lwjgl.system.NativeType("VkEvent") long r9, @org.lwjgl.system.NativeType("VkPipelineStageFlags") int r11) {
            r0 = r8
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkCmdResetEvent
            r12 = r0
            r0 = r8
            long r0 = r0.address()
            r1 = r9
            r2 = r11
            r3 = r12
            org.lwjgl.system.JNI.callPJV(r0, r1, r2, r3)
            return
    }

    public static void nvkCmdWaitEvents(org.lwjgl.vulkan.VkCommandBuffer r19, int r20, long r21, int r23, int r24, int r25, long r26, int r28, long r29, int r31, long r32) {
            r0 = r19
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkCmdWaitEvents
            r34 = r0
            r0 = r19
            long r0 = r0.address()
            r1 = r20
            r2 = r21
            r3 = r23
            r4 = r24
            r5 = r25
            r6 = r26
            r7 = r28
            r8 = r29
            r9 = r31
            r10 = r32
            r11 = r34
            org.lwjgl.system.JNI.callPPPPPV(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            return
    }

    public static void vkCmdWaitEvents(org.lwjgl.vulkan.VkCommandBuffer r16, @org.lwjgl.system.NativeType("VkEvent const *") java.nio.LongBuffer r17, @org.lwjgl.system.NativeType("VkPipelineStageFlags") int r18, @org.lwjgl.system.NativeType("VkPipelineStageFlags") int r19, @javax.annotation.Nullable @org.lwjgl.system.NativeType("VkMemoryBarrier const *") org.lwjgl.vulkan.VkMemoryBarrier.Buffer r20, @javax.annotation.Nullable @org.lwjgl.system.NativeType("VkBufferMemoryBarrier const *") org.lwjgl.vulkan.VkBufferMemoryBarrier.Buffer r21, @javax.annotation.Nullable @org.lwjgl.system.NativeType("VkImageMemoryBarrier const *") org.lwjgl.vulkan.VkImageMemoryBarrier.Buffer r22) {
            r0 = r16
            r1 = r17
            int r1 = r1.remaining()
            r2 = r17
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            r3 = r18
            r4 = r19
            r5 = r20
            int r5 = org.lwjgl.system.Checks.remainingSafe(r5)
            r6 = r20
            long r6 = org.lwjgl.system.MemoryUtil.memAddressSafe(r6)
            r7 = r21
            int r7 = org.lwjgl.system.Checks.remainingSafe(r7)
            r8 = r21
            long r8 = org.lwjgl.system.MemoryUtil.memAddressSafe(r8)
            r9 = r22
            int r9 = org.lwjgl.system.Checks.remainingSafe(r9)
            r10 = r22
            long r10 = org.lwjgl.system.MemoryUtil.memAddressSafe(r10)
            nvkCmdWaitEvents(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            return
    }

    public static void nvkCmdPipelineBarrier(org.lwjgl.vulkan.VkCommandBuffer r17, int r18, int r19, int r20, int r21, long r22, int r24, long r25, int r27, long r28) {
            r0 = r17
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkCmdPipelineBarrier
            r30 = r0
            r0 = r17
            long r0 = r0.address()
            r1 = r18
            r2 = r19
            r3 = r20
            r4 = r21
            r5 = r22
            r6 = r24
            r7 = r25
            r8 = r27
            r9 = r28
            r10 = r30
            org.lwjgl.system.JNI.callPPPPV(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            return
    }

    public static void vkCmdPipelineBarrier(org.lwjgl.vulkan.VkCommandBuffer r14, @org.lwjgl.system.NativeType("VkPipelineStageFlags") int r15, @org.lwjgl.system.NativeType("VkPipelineStageFlags") int r16, @org.lwjgl.system.NativeType("VkDependencyFlags") int r17, @javax.annotation.Nullable @org.lwjgl.system.NativeType("VkMemoryBarrier const *") org.lwjgl.vulkan.VkMemoryBarrier.Buffer r18, @javax.annotation.Nullable @org.lwjgl.system.NativeType("VkBufferMemoryBarrier const *") org.lwjgl.vulkan.VkBufferMemoryBarrier.Buffer r19, @javax.annotation.Nullable @org.lwjgl.system.NativeType("VkImageMemoryBarrier const *") org.lwjgl.vulkan.VkImageMemoryBarrier.Buffer r20) {
            r0 = r14
            r1 = r15
            r2 = r16
            r3 = r17
            r4 = r18
            int r4 = org.lwjgl.system.Checks.remainingSafe(r4)
            r5 = r18
            long r5 = org.lwjgl.system.MemoryUtil.memAddressSafe(r5)
            r6 = r19
            int r6 = org.lwjgl.system.Checks.remainingSafe(r6)
            r7 = r19
            long r7 = org.lwjgl.system.MemoryUtil.memAddressSafe(r7)
            r8 = r20
            int r8 = org.lwjgl.system.Checks.remainingSafe(r8)
            r9 = r20
            long r9 = org.lwjgl.system.MemoryUtil.memAddressSafe(r9)
            nvkCmdPipelineBarrier(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9)
            return
    }

    public static void vkCmdBeginQuery(org.lwjgl.vulkan.VkCommandBuffer r9, @org.lwjgl.system.NativeType("VkQueryPool") long r10, @org.lwjgl.system.NativeType("uint32_t") int r12, @org.lwjgl.system.NativeType("VkQueryControlFlags") int r13) {
            r0 = r9
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkCmdBeginQuery
            r14 = r0
            r0 = r9
            long r0 = r0.address()
            r1 = r10
            r2 = r12
            r3 = r13
            r4 = r14
            org.lwjgl.system.JNI.callPJV(r0, r1, r2, r3, r4)
            return
    }

    public static void vkCmdEndQuery(org.lwjgl.vulkan.VkCommandBuffer r8, @org.lwjgl.system.NativeType("VkQueryPool") long r9, @org.lwjgl.system.NativeType("uint32_t") int r11) {
            r0 = r8
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkCmdEndQuery
            r12 = r0
            r0 = r8
            long r0 = r0.address()
            r1 = r9
            r2 = r11
            r3 = r12
            org.lwjgl.system.JNI.callPJV(r0, r1, r2, r3)
            return
    }

    public static void vkCmdResetQueryPool(org.lwjgl.vulkan.VkCommandBuffer r9, @org.lwjgl.system.NativeType("VkQueryPool") long r10, @org.lwjgl.system.NativeType("uint32_t") int r12, @org.lwjgl.system.NativeType("uint32_t") int r13) {
            r0 = r9
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkCmdResetQueryPool
            r14 = r0
            r0 = r9
            long r0 = r0.address()
            r1 = r10
            r2 = r12
            r3 = r13
            r4 = r14
            org.lwjgl.system.JNI.callPJV(r0, r1, r2, r3, r4)
            return
    }

    public static void vkCmdWriteTimestamp(org.lwjgl.vulkan.VkCommandBuffer r9, @org.lwjgl.system.NativeType("VkPipelineStageFlagBits") int r10, @org.lwjgl.system.NativeType("VkQueryPool") long r11, @org.lwjgl.system.NativeType("uint32_t") int r13) {
            r0 = r9
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkCmdWriteTimestamp
            r14 = r0
            r0 = r9
            long r0 = r0.address()
            r1 = r10
            r2 = r11
            r3 = r13
            r4 = r14
            org.lwjgl.system.JNI.callPJV(r0, r1, r2, r3, r4)
            return
    }

    public static void vkCmdCopyQueryPoolResults(org.lwjgl.vulkan.VkCommandBuffer r16, @org.lwjgl.system.NativeType("VkQueryPool") long r17, @org.lwjgl.system.NativeType("uint32_t") int r19, @org.lwjgl.system.NativeType("uint32_t") int r20, @org.lwjgl.system.NativeType("VkBuffer") long r21, @org.lwjgl.system.NativeType("VkDeviceSize") long r23, @org.lwjgl.system.NativeType("VkDeviceSize") long r25, @org.lwjgl.system.NativeType("VkQueryResultFlags") int r27) {
            r0 = r16
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkCmdCopyQueryPoolResults
            r28 = r0
            r0 = r16
            long r0 = r0.address()
            r1 = r17
            r2 = r19
            r3 = r20
            r4 = r21
            r5 = r23
            r6 = r25
            r7 = r27
            r8 = r28
            org.lwjgl.system.JNI.callPJJJJV(r0, r1, r2, r3, r4, r5, r6, r7, r8)
            return
    }

    public static void nvkCmdPushConstants(org.lwjgl.vulkan.VkCommandBuffer r12, long r13, int r15, int r16, int r17, long r18) {
            r0 = r12
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkCmdPushConstants
            r20 = r0
            r0 = r12
            long r0 = r0.address()
            r1 = r13
            r2 = r15
            r3 = r16
            r4 = r17
            r5 = r18
            r6 = r20
            org.lwjgl.system.JNI.callPJPV(r0, r1, r2, r3, r4, r5, r6)
            return
    }

    public static void vkCmdPushConstants(org.lwjgl.vulkan.VkCommandBuffer r9, @org.lwjgl.system.NativeType("VkPipelineLayout") long r10, @org.lwjgl.system.NativeType("VkShaderStageFlags") int r12, @org.lwjgl.system.NativeType("uint32_t") int r13, @org.lwjgl.system.NativeType("void const *") java.nio.ByteBuffer r14) {
            r0 = r9
            r1 = r10
            r2 = r12
            r3 = r13
            r4 = r14
            int r4 = r4.remaining()
            r5 = r14
            long r5 = org.lwjgl.system.MemoryUtil.memAddress(r5)
            nvkCmdPushConstants(r0, r1, r2, r3, r4, r5)
            return
    }

    public static void vkCmdPushConstants(org.lwjgl.vulkan.VkCommandBuffer r9, @org.lwjgl.system.NativeType("VkPipelineLayout") long r10, @org.lwjgl.system.NativeType("VkShaderStageFlags") int r12, @org.lwjgl.system.NativeType("uint32_t") int r13, @org.lwjgl.system.NativeType("void const *") java.nio.ShortBuffer r14) {
            r0 = r9
            r1 = r10
            r2 = r12
            r3 = r13
            r4 = r14
            int r4 = r4.remaining()
            r5 = 1
            int r4 = r4 << r5
            r5 = r14
            long r5 = org.lwjgl.system.MemoryUtil.memAddress(r5)
            nvkCmdPushConstants(r0, r1, r2, r3, r4, r5)
            return
    }

    public static void vkCmdPushConstants(org.lwjgl.vulkan.VkCommandBuffer r9, @org.lwjgl.system.NativeType("VkPipelineLayout") long r10, @org.lwjgl.system.NativeType("VkShaderStageFlags") int r12, @org.lwjgl.system.NativeType("uint32_t") int r13, @org.lwjgl.system.NativeType("void const *") java.nio.IntBuffer r14) {
            r0 = r9
            r1 = r10
            r2 = r12
            r3 = r13
            r4 = r14
            int r4 = r4.remaining()
            r5 = 2
            int r4 = r4 << r5
            r5 = r14
            long r5 = org.lwjgl.system.MemoryUtil.memAddress(r5)
            nvkCmdPushConstants(r0, r1, r2, r3, r4, r5)
            return
    }

    public static void vkCmdPushConstants(org.lwjgl.vulkan.VkCommandBuffer r9, @org.lwjgl.system.NativeType("VkPipelineLayout") long r10, @org.lwjgl.system.NativeType("VkShaderStageFlags") int r12, @org.lwjgl.system.NativeType("uint32_t") int r13, @org.lwjgl.system.NativeType("void const *") java.nio.LongBuffer r14) {
            r0 = r9
            r1 = r10
            r2 = r12
            r3 = r13
            r4 = r14
            int r4 = r4.remaining()
            r5 = 3
            int r4 = r4 << r5
            r5 = r14
            long r5 = org.lwjgl.system.MemoryUtil.memAddress(r5)
            nvkCmdPushConstants(r0, r1, r2, r3, r4, r5)
            return
    }

    public static void vkCmdPushConstants(org.lwjgl.vulkan.VkCommandBuffer r9, @org.lwjgl.system.NativeType("VkPipelineLayout") long r10, @org.lwjgl.system.NativeType("VkShaderStageFlags") int r12, @org.lwjgl.system.NativeType("uint32_t") int r13, @org.lwjgl.system.NativeType("void const *") java.nio.FloatBuffer r14) {
            r0 = r9
            r1 = r10
            r2 = r12
            r3 = r13
            r4 = r14
            int r4 = r4.remaining()
            r5 = 2
            int r4 = r4 << r5
            r5 = r14
            long r5 = org.lwjgl.system.MemoryUtil.memAddress(r5)
            nvkCmdPushConstants(r0, r1, r2, r3, r4, r5)
            return
    }

    public static void vkCmdPushConstants(org.lwjgl.vulkan.VkCommandBuffer r9, @org.lwjgl.system.NativeType("VkPipelineLayout") long r10, @org.lwjgl.system.NativeType("VkShaderStageFlags") int r12, @org.lwjgl.system.NativeType("uint32_t") int r13, @org.lwjgl.system.NativeType("void const *") java.nio.DoubleBuffer r14) {
            r0 = r9
            r1 = r10
            r2 = r12
            r3 = r13
            r4 = r14
            int r4 = r4.remaining()
            r5 = 3
            int r4 = r4 << r5
            r5 = r14
            long r5 = org.lwjgl.system.MemoryUtil.memAddress(r5)
            nvkCmdPushConstants(r0, r1, r2, r3, r4, r5)
            return
    }

    public static void nvkCmdBeginRenderPass(org.lwjgl.vulkan.VkCommandBuffer r8, long r9, int r11) {
            r0 = r8
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkCmdBeginRenderPass
            r12 = r0
            r0 = r8
            long r0 = r0.address()
            r1 = r9
            r2 = r11
            r3 = r12
            org.lwjgl.system.JNI.callPPV(r0, r1, r2, r3)
            return
    }

    public static void vkCmdBeginRenderPass(org.lwjgl.vulkan.VkCommandBuffer r5, @org.lwjgl.system.NativeType("VkRenderPassBeginInfo const *") org.lwjgl.vulkan.VkRenderPassBeginInfo r6, @org.lwjgl.system.NativeType("VkSubpassContents") int r7) {
            r0 = r5
            r1 = r6
            long r1 = r1.address()
            r2 = r7
            nvkCmdBeginRenderPass(r0, r1, r2)
            return
    }

    public static void vkCmdNextSubpass(org.lwjgl.vulkan.VkCommandBuffer r6, @org.lwjgl.system.NativeType("VkSubpassContents") int r7) {
            r0 = r6
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkCmdNextSubpass
            r8 = r0
            r0 = r6
            long r0 = r0.address()
            r1 = r7
            r2 = r8
            org.lwjgl.system.JNI.callPV(r0, r1, r2)
            return
    }

    public static void vkCmdEndRenderPass(org.lwjgl.vulkan.VkCommandBuffer r5) {
            r0 = r5
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkCmdEndRenderPass
            r6 = r0
            r0 = r5
            long r0 = r0.address()
            r1 = r6
            org.lwjgl.system.JNI.callPV(r0, r1)
            return
    }

    public static void nvkCmdExecuteCommands(org.lwjgl.vulkan.VkCommandBuffer r8, int r9, long r10) {
            r0 = r8
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkCmdExecuteCommands
            r12 = r0
            r0 = r8
            long r0 = r0.address()
            r1 = r9
            r2 = r10
            r3 = r12
            org.lwjgl.system.JNI.callPPV(r0, r1, r2, r3)
            return
    }

    public static void vkCmdExecuteCommands(org.lwjgl.vulkan.VkCommandBuffer r5, @org.lwjgl.system.NativeType("VkCommandBuffer const *") org.lwjgl.PointerBuffer r6) {
            r0 = r5
            r1 = r6
            int r1 = r1.remaining()
            r2 = r6
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            nvkCmdExecuteCommands(r0, r1, r2)
            return
    }

    public static void vkCmdExecuteCommands(org.lwjgl.vulkan.VkCommandBuffer r5, @org.lwjgl.system.NativeType("VkCommandBuffer const *") org.lwjgl.vulkan.VkCommandBuffer r6) {
            org.lwjgl.system.MemoryStack r0 = org.lwjgl.system.MemoryStack.stackGet()
            r7 = r0
            r0 = r7
            int r0 = r0.getPointer()
            r8 = r0
            r0 = r7
            r1 = r6
            org.lwjgl.PointerBuffer r0 = r0.pointers(r1)     // Catch: java.lang.Throwable -> L22
            r9 = r0
            r0 = r5
            r1 = 1
            r2 = r9
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)     // Catch: java.lang.Throwable -> L22
            nvkCmdExecuteCommands(r0, r1, r2)     // Catch: java.lang.Throwable -> L22
            r0 = r7
            r1 = r8
            r0.setPointer(r1)
            goto L2c
        L22:
            r10 = move-exception
            r0 = r7
            r1 = r8
            r0.setPointer(r1)
            r0 = r10
            throw r0
        L2c:
            return
    }

    @org.lwjgl.system.NativeType("uint32_t")
    public static int VK_MAKE_API_VERSION(@org.lwjgl.system.NativeType("uint32_t") int r4, @org.lwjgl.system.NativeType("uint32_t") int r5, @org.lwjgl.system.NativeType("uint32_t") int r6, @org.lwjgl.system.NativeType("uint32_t") int r7) {
            r0 = r4
            r1 = 29
            int r0 = r0 << r1
            r1 = r5
            r2 = 22
            int r1 = r1 << r2
            r0 = r0 | r1
            r1 = r6
            r2 = 12
            int r1 = r1 << r2
            r0 = r0 | r1
            r1 = r7
            r0 = r0 | r1
            return r0
    }

    @org.lwjgl.system.NativeType("uint32_t")
    public static int VK_API_VERSION_VARIANT(@org.lwjgl.system.NativeType("uint32_t") int r3) {
            r0 = r3
            r1 = 29
            int r0 = r0 >>> r1
            return r0
    }

    @org.lwjgl.system.NativeType("uint32_t")
    public static int VK_API_VERSION_MAJOR(@org.lwjgl.system.NativeType("uint32_t") int r3) {
            r0 = r3
            r1 = 22
            int r0 = r0 >>> r1
            r1 = 127(0x7f, float:1.78E-43)
            r0 = r0 & r1
            return r0
    }

    @org.lwjgl.system.NativeType("uint32_t")
    public static int VK_API_VERSION_MINOR(@org.lwjgl.system.NativeType("uint32_t") int r3) {
            r0 = r3
            r1 = 12
            int r0 = r0 >>> r1
            r1 = 1023(0x3ff, float:1.434E-42)
            r0 = r0 & r1
            return r0
    }

    @org.lwjgl.system.NativeType("uint32_t")
    public static int VK_API_VERSION_PATCH(@org.lwjgl.system.NativeType("uint32_t") int r3) {
            r0 = r3
            r1 = 4095(0xfff, float:5.738E-42)
            r0 = r0 & r1
            return r0
    }

    @org.lwjgl.system.NativeType("uint32_t")
    public static int VK_MAKE_VERSION(@org.lwjgl.system.NativeType("uint32_t") int r4, @org.lwjgl.system.NativeType("uint32_t") int r5, @org.lwjgl.system.NativeType("uint32_t") int r6) {
            r0 = r4
            r1 = 22
            int r0 = r0 << r1
            r1 = r5
            r2 = 12
            int r1 = r1 << r2
            r0 = r0 | r1
            r1 = r6
            r0 = r0 | r1
            return r0
    }

    @org.lwjgl.system.NativeType("uint32_t")
    public static int VK_VERSION_MAJOR(@org.lwjgl.system.NativeType("uint32_t") int r3) {
            r0 = r3
            r1 = 22
            int r0 = r0 >>> r1
            return r0
    }

    @org.lwjgl.system.NativeType("uint32_t")
    public static int VK_VERSION_MINOR(@org.lwjgl.system.NativeType("uint32_t") int r3) {
            r0 = r3
            r1 = 12
            int r0 = r0 >>> r1
            r1 = 1023(0x3ff, float:1.434E-42)
            r0 = r0 & r1
            return r0
    }

    @org.lwjgl.system.NativeType("uint32_t")
    public static int VK_VERSION_PATCH(@org.lwjgl.system.NativeType("uint32_t") int r3) {
            r0 = r3
            r1 = 4095(0xfff, float:5.738E-42)
            r0 = r0 & r1
            return r0
    }

    @org.lwjgl.system.NativeType("VkResult")
    public static int vkEnumeratePhysicalDevices(org.lwjgl.vulkan.VkInstance r8, @org.lwjgl.system.NativeType("uint32_t *") int[] r9, @javax.annotation.Nullable @org.lwjgl.system.NativeType("VkPhysicalDevice *") org.lwjgl.PointerBuffer r10) {
            r0 = r8
            org.lwjgl.vulkan.VKCapabilitiesInstance r0 = r0.getCapabilities()
            long r0 = r0.vkEnumeratePhysicalDevices
            r11 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L1a
            r0 = r9
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
            r0 = r10
            r1 = r9
            r2 = 0
            r1 = r1[r2]
            org.lwjgl.system.Checks.checkSafe(r0, r1)
        L1a:
            r0 = r8
            long r0 = r0.address()
            r1 = r9
            r2 = r10
            long r2 = org.lwjgl.system.MemoryUtil.memAddressSafe(r2)
            r3 = r11
            int r0 = org.lwjgl.system.JNI.callPPPI(r0, r1, r2, r3)
            return r0
    }

    public static void vkGetPhysicalDeviceQueueFamilyProperties(org.lwjgl.vulkan.VkPhysicalDevice r8, @org.lwjgl.system.NativeType("uint32_t *") int[] r9, @javax.annotation.Nullable @org.lwjgl.system.NativeType("VkQueueFamilyProperties *") org.lwjgl.vulkan.VkQueueFamilyProperties.Buffer r10) {
            r0 = r8
            org.lwjgl.vulkan.VKCapabilitiesInstance r0 = r0.getCapabilities()
            long r0 = r0.vkGetPhysicalDeviceQueueFamilyProperties
            r11 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L1a
            r0 = r9
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
            r0 = r10
            r1 = r9
            r2 = 0
            r1 = r1[r2]
            org.lwjgl.system.Checks.checkSafe(r0, r1)
        L1a:
            r0 = r8
            long r0 = r0.address()
            r1 = r9
            r2 = r10
            long r2 = org.lwjgl.system.MemoryUtil.memAddressSafe(r2)
            r3 = r11
            org.lwjgl.system.JNI.callPPPV(r0, r1, r2, r3)
            return
    }

    @org.lwjgl.system.NativeType("VkResult")
    public static int vkEnumerateInstanceExtensionProperties(@javax.annotation.Nullable @org.lwjgl.system.NativeType("char const *") java.nio.ByteBuffer r8, @org.lwjgl.system.NativeType("uint32_t *") int[] r9, @javax.annotation.Nullable @org.lwjgl.system.NativeType("VkExtensionProperties *") org.lwjgl.vulkan.VkExtensionProperties.Buffer r10) {
            org.lwjgl.vulkan.VK$GlobalCommands r0 = org.lwjgl.vulkan.VK.getGlobalCommands()
            long r0 = r0.vkEnumerateInstanceExtensionProperties
            r11 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L1d
            r0 = r8
            org.lwjgl.system.Checks.checkNT1Safe(r0)
            r0 = r9
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
            r0 = r10
            r1 = r9
            r2 = 0
            r1 = r1[r2]
            org.lwjgl.system.Checks.checkSafe(r0, r1)
        L1d:
            r0 = r8
            long r0 = org.lwjgl.system.MemoryUtil.memAddressSafe(r0)
            r1 = r9
            r2 = r10
            long r2 = org.lwjgl.system.MemoryUtil.memAddressSafe(r2)
            r3 = r11
            int r0 = org.lwjgl.system.JNI.callPPPI(r0, r1, r2, r3)
            return r0
    }

    @org.lwjgl.system.NativeType("VkResult")
    public static int vkEnumerateInstanceExtensionProperties(@javax.annotation.Nullable @org.lwjgl.system.NativeType("char const *") java.lang.CharSequence r8, @org.lwjgl.system.NativeType("uint32_t *") int[] r9, @javax.annotation.Nullable @org.lwjgl.system.NativeType("VkExtensionProperties *") org.lwjgl.vulkan.VkExtensionProperties.Buffer r10) {
            org.lwjgl.vulkan.VK$GlobalCommands r0 = org.lwjgl.vulkan.VK.getGlobalCommands()
            long r0 = r0.vkEnumerateInstanceExtensionProperties
            r11 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L19
            r0 = r9
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
            r0 = r10
            r1 = r9
            r2 = 0
            r1 = r1[r2]
            org.lwjgl.system.Checks.checkSafe(r0, r1)
        L19:
            org.lwjgl.system.MemoryStack r0 = org.lwjgl.system.MemoryStack.stackGet()
            r13 = r0
            r0 = r13
            int r0 = r0.getPointer()
            r14 = r0
            r0 = r13
            r1 = r8
            r2 = 1
            int r0 = r0.nUTF8Safe(r1, r2)     // Catch: java.lang.Throwable -> L53
            r0 = r8
            if (r0 != 0) goto L35
            r0 = 0
            goto L3a
        L35:
            r0 = r13
            long r0 = r0.getPointerAddress()     // Catch: java.lang.Throwable -> L53
        L3a:
            r15 = r0
            r0 = r15
            r1 = r9
            r2 = r10
            long r2 = org.lwjgl.system.MemoryUtil.memAddressSafe(r2)     // Catch: java.lang.Throwable -> L53
            r3 = r11
            int r0 = org.lwjgl.system.JNI.callPPPI(r0, r1, r2, r3)     // Catch: java.lang.Throwable -> L53
            r17 = r0
            r0 = r13
            r1 = r14
            r0.setPointer(r1)
            r0 = r17
            return r0
        L53:
            r18 = move-exception
            r0 = r13
            r1 = r14
            r0.setPointer(r1)
            r0 = r18
            throw r0
    }

    @org.lwjgl.system.NativeType("VkResult")
    public static int vkEnumerateDeviceExtensionProperties(org.lwjgl.vulkan.VkPhysicalDevice r10, @javax.annotation.Nullable @org.lwjgl.system.NativeType("char const *") java.nio.ByteBuffer r11, @org.lwjgl.system.NativeType("uint32_t *") int[] r12, @javax.annotation.Nullable @org.lwjgl.system.NativeType("VkExtensionProperties *") org.lwjgl.vulkan.VkExtensionProperties.Buffer r13) {
            r0 = r10
            org.lwjgl.vulkan.VKCapabilitiesInstance r0 = r0.getCapabilities()
            long r0 = r0.vkEnumerateDeviceExtensionProperties
            r14 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L1f
            r0 = r11
            org.lwjgl.system.Checks.checkNT1Safe(r0)
            r0 = r12
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
            r0 = r13
            r1 = r12
            r2 = 0
            r1 = r1[r2]
            org.lwjgl.system.Checks.checkSafe(r0, r1)
        L1f:
            r0 = r10
            long r0 = r0.address()
            r1 = r11
            long r1 = org.lwjgl.system.MemoryUtil.memAddressSafe(r1)
            r2 = r12
            r3 = r13
            long r3 = org.lwjgl.system.MemoryUtil.memAddressSafe(r3)
            r4 = r14
            int r0 = org.lwjgl.system.JNI.callPPPPI(r0, r1, r2, r3, r4)
            return r0
    }

    @org.lwjgl.system.NativeType("VkResult")
    public static int vkEnumerateDeviceExtensionProperties(org.lwjgl.vulkan.VkPhysicalDevice r10, @javax.annotation.Nullable @org.lwjgl.system.NativeType("char const *") java.lang.CharSequence r11, @org.lwjgl.system.NativeType("uint32_t *") int[] r12, @javax.annotation.Nullable @org.lwjgl.system.NativeType("VkExtensionProperties *") org.lwjgl.vulkan.VkExtensionProperties.Buffer r13) {
            r0 = r10
            org.lwjgl.vulkan.VKCapabilitiesInstance r0 = r0.getCapabilities()
            long r0 = r0.vkEnumerateDeviceExtensionProperties
            r14 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L1b
            r0 = r12
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
            r0 = r13
            r1 = r12
            r2 = 0
            r1 = r1[r2]
            org.lwjgl.system.Checks.checkSafe(r0, r1)
        L1b:
            org.lwjgl.system.MemoryStack r0 = org.lwjgl.system.MemoryStack.stackGet()
            r16 = r0
            r0 = r16
            int r0 = r0.getPointer()
            r17 = r0
            r0 = r16
            r1 = r11
            r2 = 1
            int r0 = r0.nUTF8Safe(r1, r2)     // Catch: java.lang.Throwable -> L5a
            r0 = r11
            if (r0 != 0) goto L37
            r0 = 0
            goto L3c
        L37:
            r0 = r16
            long r0 = r0.getPointerAddress()     // Catch: java.lang.Throwable -> L5a
        L3c:
            r18 = r0
            r0 = r10
            long r0 = r0.address()     // Catch: java.lang.Throwable -> L5a
            r1 = r18
            r2 = r12
            r3 = r13
            long r3 = org.lwjgl.system.MemoryUtil.memAddressSafe(r3)     // Catch: java.lang.Throwable -> L5a
            r4 = r14
            int r0 = org.lwjgl.system.JNI.callPPPPI(r0, r1, r2, r3, r4)     // Catch: java.lang.Throwable -> L5a
            r20 = r0
            r0 = r16
            r1 = r17
            r0.setPointer(r1)
            r0 = r20
            return r0
        L5a:
            r21 = move-exception
            r0 = r16
            r1 = r17
            r0.setPointer(r1)
            r0 = r21
            throw r0
    }

    @org.lwjgl.system.NativeType("VkResult")
    public static int vkEnumerateInstanceLayerProperties(@org.lwjgl.system.NativeType("uint32_t *") int[] r6, @javax.annotation.Nullable @org.lwjgl.system.NativeType("VkLayerProperties *") org.lwjgl.vulkan.VkLayerProperties.Buffer r7) {
            org.lwjgl.vulkan.VK$GlobalCommands r0 = org.lwjgl.vulkan.VK.getGlobalCommands()
            long r0 = r0.vkEnumerateInstanceLayerProperties
            r8 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L19
            r0 = r6
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
            r0 = r7
            r1 = r6
            r2 = 0
            r1 = r1[r2]
            org.lwjgl.system.Checks.checkSafe(r0, r1)
        L19:
            r0 = r6
            r1 = r7
            long r1 = org.lwjgl.system.MemoryUtil.memAddressSafe(r1)
            r2 = r8
            int r0 = org.lwjgl.system.JNI.callPPI(r0, r1, r2)
            return r0
    }

    @org.lwjgl.system.NativeType("VkResult")
    public static int vkEnumerateDeviceLayerProperties(org.lwjgl.vulkan.VkPhysicalDevice r8, @org.lwjgl.system.NativeType("uint32_t *") int[] r9, @javax.annotation.Nullable @org.lwjgl.system.NativeType("VkLayerProperties *") org.lwjgl.vulkan.VkLayerProperties.Buffer r10) {
            r0 = r8
            org.lwjgl.vulkan.VKCapabilitiesInstance r0 = r0.getCapabilities()
            long r0 = r0.vkEnumerateDeviceLayerProperties
            r11 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L1a
            r0 = r9
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
            r0 = r10
            r1 = r9
            r2 = 0
            r1 = r1[r2]
            org.lwjgl.system.Checks.checkSafe(r0, r1)
        L1a:
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
    public static int vkAllocateMemory(org.lwjgl.vulkan.VkDevice r10, @org.lwjgl.system.NativeType("VkMemoryAllocateInfo const *") org.lwjgl.vulkan.VkMemoryAllocateInfo r11, @javax.annotation.Nullable @org.lwjgl.system.NativeType("VkAllocationCallbacks const *") org.lwjgl.vulkan.VkAllocationCallbacks r12, @org.lwjgl.system.NativeType("VkDeviceMemory *") long[] r13) {
            r0 = r10
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkAllocateMemory
            r14 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L14
            r0 = r13
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
        L14:
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

    public static void vkGetDeviceMemoryCommitment(org.lwjgl.vulkan.VkDevice r8, @org.lwjgl.system.NativeType("VkDeviceMemory") long r9, @org.lwjgl.system.NativeType("VkDeviceSize *") long[] r11) {
            r0 = r8
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkGetDeviceMemoryCommitment
            r12 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L14
            r0 = r11
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
        L14:
            r0 = r8
            long r0 = r0.address()
            r1 = r9
            r2 = r11
            r3 = r12
            org.lwjgl.system.JNI.callPJPV(r0, r1, r2, r3)
            return
    }

    public static void vkGetImageSparseMemoryRequirements(org.lwjgl.vulkan.VkDevice r10, @org.lwjgl.system.NativeType("VkImage") long r11, @org.lwjgl.system.NativeType("uint32_t *") int[] r13, @javax.annotation.Nullable @org.lwjgl.system.NativeType("VkSparseImageMemoryRequirements *") org.lwjgl.vulkan.VkSparseImageMemoryRequirements.Buffer r14) {
            r0 = r10
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkGetImageSparseMemoryRequirements
            r15 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L1c
            r0 = r13
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
            r0 = r14
            r1 = r13
            r2 = 0
            r1 = r1[r2]
            org.lwjgl.system.Checks.checkSafe(r0, r1)
        L1c:
            r0 = r10
            long r0 = r0.address()
            r1 = r11
            r2 = r13
            r3 = r14
            long r3 = org.lwjgl.system.MemoryUtil.memAddressSafe(r3)
            r4 = r15
            org.lwjgl.system.JNI.callPJPPV(r0, r1, r2, r3, r4)
            return
    }

    public static void vkGetPhysicalDeviceSparseImageFormatProperties(org.lwjgl.vulkan.VkPhysicalDevice r13, @org.lwjgl.system.NativeType("VkFormat") int r14, @org.lwjgl.system.NativeType("VkImageType") int r15, @org.lwjgl.system.NativeType("VkSampleCountFlagBits") int r16, @org.lwjgl.system.NativeType("VkImageUsageFlags") int r17, @org.lwjgl.system.NativeType("VkImageTiling") int r18, @org.lwjgl.system.NativeType("uint32_t *") int[] r19, @javax.annotation.Nullable @org.lwjgl.system.NativeType("VkSparseImageFormatProperties *") org.lwjgl.vulkan.VkSparseImageFormatProperties.Buffer r20) {
            r0 = r13
            org.lwjgl.vulkan.VKCapabilitiesInstance r0 = r0.getCapabilities()
            long r0 = r0.vkGetPhysicalDeviceSparseImageFormatProperties
            r21 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L1e
            r0 = r19
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
            r0 = r20
            r1 = r19
            r2 = 0
            r1 = r1[r2]
            org.lwjgl.system.Checks.checkSafe(r0, r1)
        L1e:
            r0 = r13
            long r0 = r0.address()
            r1 = r14
            r2 = r15
            r3 = r16
            r4 = r17
            r5 = r18
            r6 = r19
            r7 = r20
            long r7 = org.lwjgl.system.MemoryUtil.memAddressSafe(r7)
            r8 = r21
            org.lwjgl.system.JNI.callPPPV(r0, r1, r2, r3, r4, r5, r6, r7, r8)
            return
    }

    @org.lwjgl.system.NativeType("VkResult")
    public static int vkCreateFence(org.lwjgl.vulkan.VkDevice r10, @org.lwjgl.system.NativeType("VkFenceCreateInfo const *") org.lwjgl.vulkan.VkFenceCreateInfo r11, @javax.annotation.Nullable @org.lwjgl.system.NativeType("VkAllocationCallbacks const *") org.lwjgl.vulkan.VkAllocationCallbacks r12, @org.lwjgl.system.NativeType("VkFence *") long[] r13) {
            r0 = r10
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkCreateFence
            r14 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L14
            r0 = r13
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
        L14:
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
    public static int vkResetFences(org.lwjgl.vulkan.VkDevice r7, @org.lwjgl.system.NativeType("VkFence const *") long[] r8) {
            r0 = r7
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkResetFences
            r9 = r0
            r0 = r7
            long r0 = r0.address()
            r1 = r8
            int r1 = r1.length
            r2 = r8
            r3 = r9
            int r0 = org.lwjgl.system.JNI.callPPI(r0, r1, r2, r3)
            return r0
    }

    @org.lwjgl.system.NativeType("VkResult")
    public static int vkWaitForFences(org.lwjgl.vulkan.VkDevice r10, @org.lwjgl.system.NativeType("VkFence const *") long[] r11, @org.lwjgl.system.NativeType("VkBool32") boolean r12, @org.lwjgl.system.NativeType("uint64_t") long r13) {
            r0 = r10
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkWaitForFences
            r15 = r0
            r0 = r10
            long r0 = r0.address()
            r1 = r11
            int r1 = r1.length
            r2 = r11
            r3 = r12
            if (r3 == 0) goto L18
            r3 = 1
            goto L19
        L18:
            r3 = 0
        L19:
            r4 = r13
            r5 = r15
            int r0 = org.lwjgl.system.JNI.callPPJI(r0, r1, r2, r3, r4, r5)
            return r0
    }

    @org.lwjgl.system.NativeType("VkResult")
    public static int vkCreateSemaphore(org.lwjgl.vulkan.VkDevice r10, @org.lwjgl.system.NativeType("VkSemaphoreCreateInfo const *") org.lwjgl.vulkan.VkSemaphoreCreateInfo r11, @javax.annotation.Nullable @org.lwjgl.system.NativeType("VkAllocationCallbacks const *") org.lwjgl.vulkan.VkAllocationCallbacks r12, @org.lwjgl.system.NativeType("VkSemaphore *") long[] r13) {
            r0 = r10
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkCreateSemaphore
            r14 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L14
            r0 = r13
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
        L14:
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
    public static int vkCreateEvent(org.lwjgl.vulkan.VkDevice r10, @org.lwjgl.system.NativeType("VkEventCreateInfo const *") org.lwjgl.vulkan.VkEventCreateInfo r11, @javax.annotation.Nullable @org.lwjgl.system.NativeType("VkAllocationCallbacks const *") org.lwjgl.vulkan.VkAllocationCallbacks r12, @org.lwjgl.system.NativeType("VkEvent *") long[] r13) {
            r0 = r10
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkCreateEvent
            r14 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L14
            r0 = r13
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
        L14:
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
    public static int vkCreateQueryPool(org.lwjgl.vulkan.VkDevice r10, @org.lwjgl.system.NativeType("VkQueryPoolCreateInfo const *") org.lwjgl.vulkan.VkQueryPoolCreateInfo r11, @javax.annotation.Nullable @org.lwjgl.system.NativeType("VkAllocationCallbacks const *") org.lwjgl.vulkan.VkAllocationCallbacks r12, @org.lwjgl.system.NativeType("VkQueryPool *") long[] r13) {
            r0 = r10
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkCreateQueryPool
            r14 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L14
            r0 = r13
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
        L14:
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
    public static int vkGetQueryPoolResults(org.lwjgl.vulkan.VkDevice r15, @org.lwjgl.system.NativeType("VkQueryPool") long r16, @org.lwjgl.system.NativeType("uint32_t") int r18, @org.lwjgl.system.NativeType("uint32_t") int r19, @org.lwjgl.system.NativeType("void *") int[] r20, @org.lwjgl.system.NativeType("VkDeviceSize") long r21, @org.lwjgl.system.NativeType("VkQueryResultFlags") int r23) {
            r0 = r15
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkGetQueryPoolResults
            r24 = r0
            r0 = r15
            long r0 = r0.address()
            r1 = r16
            r2 = r18
            r3 = r19
            r4 = r20
            int r4 = r4.length
            long r4 = java.lang.Integer.toUnsignedLong(r4)
            r5 = 2
            long r4 = r4 << r5
            r5 = r20
            r6 = r21
            r7 = r23
            r8 = r24
            int r0 = org.lwjgl.system.JNI.callPJPPJI(r0, r1, r2, r3, r4, r5, r6, r7, r8)
            return r0
    }

    @org.lwjgl.system.NativeType("VkResult")
    public static int vkGetQueryPoolResults(org.lwjgl.vulkan.VkDevice r15, @org.lwjgl.system.NativeType("VkQueryPool") long r16, @org.lwjgl.system.NativeType("uint32_t") int r18, @org.lwjgl.system.NativeType("uint32_t") int r19, @org.lwjgl.system.NativeType("void *") long[] r20, @org.lwjgl.system.NativeType("VkDeviceSize") long r21, @org.lwjgl.system.NativeType("VkQueryResultFlags") int r23) {
            r0 = r15
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkGetQueryPoolResults
            r24 = r0
            r0 = r15
            long r0 = r0.address()
            r1 = r16
            r2 = r18
            r3 = r19
            r4 = r20
            int r4 = r4.length
            long r4 = java.lang.Integer.toUnsignedLong(r4)
            r5 = 3
            long r4 = r4 << r5
            r5 = r20
            r6 = r21
            r7 = r23
            r8 = r24
            int r0 = org.lwjgl.system.JNI.callPJPPJI(r0, r1, r2, r3, r4, r5, r6, r7, r8)
            return r0
    }

    @org.lwjgl.system.NativeType("VkResult")
    public static int vkCreateBuffer(org.lwjgl.vulkan.VkDevice r10, @org.lwjgl.system.NativeType("VkBufferCreateInfo const *") org.lwjgl.vulkan.VkBufferCreateInfo r11, @javax.annotation.Nullable @org.lwjgl.system.NativeType("VkAllocationCallbacks const *") org.lwjgl.vulkan.VkAllocationCallbacks r12, @org.lwjgl.system.NativeType("VkBuffer *") long[] r13) {
            r0 = r10
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkCreateBuffer
            r14 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L14
            r0 = r13
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
        L14:
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
    public static int vkCreateBufferView(org.lwjgl.vulkan.VkDevice r10, @org.lwjgl.system.NativeType("VkBufferViewCreateInfo const *") org.lwjgl.vulkan.VkBufferViewCreateInfo r11, @javax.annotation.Nullable @org.lwjgl.system.NativeType("VkAllocationCallbacks const *") org.lwjgl.vulkan.VkAllocationCallbacks r12, @org.lwjgl.system.NativeType("VkBufferView *") long[] r13) {
            r0 = r10
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkCreateBufferView
            r14 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L14
            r0 = r13
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
        L14:
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
    public static int vkCreateImage(org.lwjgl.vulkan.VkDevice r10, @org.lwjgl.system.NativeType("VkImageCreateInfo const *") org.lwjgl.vulkan.VkImageCreateInfo r11, @javax.annotation.Nullable @org.lwjgl.system.NativeType("VkAllocationCallbacks const *") org.lwjgl.vulkan.VkAllocationCallbacks r12, @org.lwjgl.system.NativeType("VkImage *") long[] r13) {
            r0 = r10
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkCreateImage
            r14 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L14
            r0 = r13
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
        L14:
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
    public static int vkCreateImageView(org.lwjgl.vulkan.VkDevice r10, @org.lwjgl.system.NativeType("VkImageViewCreateInfo const *") org.lwjgl.vulkan.VkImageViewCreateInfo r11, @javax.annotation.Nullable @org.lwjgl.system.NativeType("VkAllocationCallbacks const *") org.lwjgl.vulkan.VkAllocationCallbacks r12, @org.lwjgl.system.NativeType("VkImageView *") long[] r13) {
            r0 = r10
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkCreateImageView
            r14 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L14
            r0 = r13
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
        L14:
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
    public static int vkCreateShaderModule(org.lwjgl.vulkan.VkDevice r10, @org.lwjgl.system.NativeType("VkShaderModuleCreateInfo const *") org.lwjgl.vulkan.VkShaderModuleCreateInfo r11, @javax.annotation.Nullable @org.lwjgl.system.NativeType("VkAllocationCallbacks const *") org.lwjgl.vulkan.VkAllocationCallbacks r12, @org.lwjgl.system.NativeType("VkShaderModule *") long[] r13) {
            r0 = r10
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkCreateShaderModule
            r14 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L1b
            r0 = r13
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
            r0 = r11
            long r0 = r0.address()
            org.lwjgl.vulkan.VkShaderModuleCreateInfo.validate(r0)
        L1b:
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
    public static int vkCreatePipelineCache(org.lwjgl.vulkan.VkDevice r10, @org.lwjgl.system.NativeType("VkPipelineCacheCreateInfo const *") org.lwjgl.vulkan.VkPipelineCacheCreateInfo r11, @javax.annotation.Nullable @org.lwjgl.system.NativeType("VkAllocationCallbacks const *") org.lwjgl.vulkan.VkAllocationCallbacks r12, @org.lwjgl.system.NativeType("VkPipelineCache *") long[] r13) {
            r0 = r10
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkCreatePipelineCache
            r14 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L1b
            r0 = r13
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
            r0 = r11
            long r0 = r0.address()
            org.lwjgl.vulkan.VkPipelineCacheCreateInfo.validate(r0)
        L1b:
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
    public static int vkMergePipelineCaches(org.lwjgl.vulkan.VkDevice r9, @org.lwjgl.system.NativeType("VkPipelineCache") long r10, @org.lwjgl.system.NativeType("VkPipelineCache const *") long[] r12) {
            r0 = r9
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkMergePipelineCaches
            r13 = r0
            r0 = r9
            long r0 = r0.address()
            r1 = r10
            r2 = r12
            int r2 = r2.length
            r3 = r12
            r4 = r13
            int r0 = org.lwjgl.system.JNI.callPJPI(r0, r1, r2, r3, r4)
            return r0
    }

    @org.lwjgl.system.NativeType("VkResult")
    public static int vkCreateGraphicsPipelines(org.lwjgl.vulkan.VkDevice r13, @org.lwjgl.system.NativeType("VkPipelineCache") long r14, @org.lwjgl.system.NativeType("VkGraphicsPipelineCreateInfo const *") org.lwjgl.vulkan.VkGraphicsPipelineCreateInfo.Buffer r16, @javax.annotation.Nullable @org.lwjgl.system.NativeType("VkAllocationCallbacks const *") org.lwjgl.vulkan.VkAllocationCallbacks r17, @org.lwjgl.system.NativeType("VkPipeline *") long[] r18) {
            r0 = r13
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkCreateGraphicsPipelines
            r19 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L2b
            r0 = r18
            r1 = r16
            int r1 = r1.remaining()
            org.lwjgl.system.Checks.check(r0, r1)
            r0 = r16
            long r0 = r0.address()
            r1 = r16
            int r1 = r1.remaining()
            int r2 = org.lwjgl.vulkan.VkGraphicsPipelineCreateInfo.SIZEOF
            int r3 = org.lwjgl.vulkan.VkGraphicsPipelineCreateInfo::validate
            org.lwjgl.system.Struct.validate(r0, r1, r2, r3)
        L2b:
            r0 = r13
            long r0 = r0.address()
            r1 = r14
            r2 = r16
            int r2 = r2.remaining()
            r3 = r16
            long r3 = r3.address()
            r4 = r17
            long r4 = org.lwjgl.system.MemoryUtil.memAddressSafe(r4)
            r5 = r18
            r6 = r19
            int r0 = org.lwjgl.system.JNI.callPJPPPI(r0, r1, r2, r3, r4, r5, r6)
            return r0
    }

    @org.lwjgl.system.NativeType("VkResult")
    public static int vkCreateComputePipelines(org.lwjgl.vulkan.VkDevice r13, @org.lwjgl.system.NativeType("VkPipelineCache") long r14, @org.lwjgl.system.NativeType("VkComputePipelineCreateInfo const *") org.lwjgl.vulkan.VkComputePipelineCreateInfo.Buffer r16, @javax.annotation.Nullable @org.lwjgl.system.NativeType("VkAllocationCallbacks const *") org.lwjgl.vulkan.VkAllocationCallbacks r17, @org.lwjgl.system.NativeType("VkPipeline *") long[] r18) {
            r0 = r13
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkCreateComputePipelines
            r19 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L2b
            r0 = r18
            r1 = r16
            int r1 = r1.remaining()
            org.lwjgl.system.Checks.check(r0, r1)
            r0 = r16
            long r0 = r0.address()
            r1 = r16
            int r1 = r1.remaining()
            int r2 = org.lwjgl.vulkan.VkComputePipelineCreateInfo.SIZEOF
            int r3 = org.lwjgl.vulkan.VkComputePipelineCreateInfo::validate
            org.lwjgl.system.Struct.validate(r0, r1, r2, r3)
        L2b:
            r0 = r13
            long r0 = r0.address()
            r1 = r14
            r2 = r16
            int r2 = r2.remaining()
            r3 = r16
            long r3 = r3.address()
            r4 = r17
            long r4 = org.lwjgl.system.MemoryUtil.memAddressSafe(r4)
            r5 = r18
            r6 = r19
            int r0 = org.lwjgl.system.JNI.callPJPPPI(r0, r1, r2, r3, r4, r5, r6)
            return r0
    }

    @org.lwjgl.system.NativeType("VkResult")
    public static int vkCreatePipelineLayout(org.lwjgl.vulkan.VkDevice r10, @org.lwjgl.system.NativeType("VkPipelineLayoutCreateInfo const *") org.lwjgl.vulkan.VkPipelineLayoutCreateInfo r11, @javax.annotation.Nullable @org.lwjgl.system.NativeType("VkAllocationCallbacks const *") org.lwjgl.vulkan.VkAllocationCallbacks r12, @org.lwjgl.system.NativeType("VkPipelineLayout *") long[] r13) {
            r0 = r10
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkCreatePipelineLayout
            r14 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L1b
            r0 = r13
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
            r0 = r11
            long r0 = r0.address()
            org.lwjgl.vulkan.VkPipelineLayoutCreateInfo.validate(r0)
        L1b:
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
    public static int vkCreateSampler(org.lwjgl.vulkan.VkDevice r10, @org.lwjgl.system.NativeType("VkSamplerCreateInfo const *") org.lwjgl.vulkan.VkSamplerCreateInfo r11, @javax.annotation.Nullable @org.lwjgl.system.NativeType("VkAllocationCallbacks const *") org.lwjgl.vulkan.VkAllocationCallbacks r12, @org.lwjgl.system.NativeType("VkSampler *") long[] r13) {
            r0 = r10
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkCreateSampler
            r14 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L14
            r0 = r13
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
        L14:
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
    public static int vkCreateDescriptorSetLayout(org.lwjgl.vulkan.VkDevice r10, @org.lwjgl.system.NativeType("VkDescriptorSetLayoutCreateInfo const *") org.lwjgl.vulkan.VkDescriptorSetLayoutCreateInfo r11, @javax.annotation.Nullable @org.lwjgl.system.NativeType("VkAllocationCallbacks const *") org.lwjgl.vulkan.VkAllocationCallbacks r12, @org.lwjgl.system.NativeType("VkDescriptorSetLayout *") long[] r13) {
            r0 = r10
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkCreateDescriptorSetLayout
            r14 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L1b
            r0 = r13
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
            r0 = r11
            long r0 = r0.address()
            org.lwjgl.vulkan.VkDescriptorSetLayoutCreateInfo.validate(r0)
        L1b:
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
    public static int vkCreateDescriptorPool(org.lwjgl.vulkan.VkDevice r10, @org.lwjgl.system.NativeType("VkDescriptorPoolCreateInfo const *") org.lwjgl.vulkan.VkDescriptorPoolCreateInfo r11, @javax.annotation.Nullable @org.lwjgl.system.NativeType("VkAllocationCallbacks const *") org.lwjgl.vulkan.VkAllocationCallbacks r12, @org.lwjgl.system.NativeType("VkDescriptorPool *") long[] r13) {
            r0 = r10
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkCreateDescriptorPool
            r14 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L1b
            r0 = r13
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
            r0 = r11
            long r0 = r0.address()
            org.lwjgl.vulkan.VkDescriptorPoolCreateInfo.validate(r0)
        L1b:
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
    public static int vkAllocateDescriptorSets(org.lwjgl.vulkan.VkDevice r8, @org.lwjgl.system.NativeType("VkDescriptorSetAllocateInfo const *") org.lwjgl.vulkan.VkDescriptorSetAllocateInfo r9, @org.lwjgl.system.NativeType("VkDescriptorSet *") long[] r10) {
            r0 = r8
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkAllocateDescriptorSets
            r11 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L1d
            r0 = r10
            r1 = r9
            int r1 = r1.descriptorSetCount()
            org.lwjgl.system.Checks.check(r0, r1)
            r0 = r9
            long r0 = r0.address()
            org.lwjgl.vulkan.VkDescriptorSetAllocateInfo.validate(r0)
        L1d:
            r0 = r8
            long r0 = r0.address()
            r1 = r9
            long r1 = r1.address()
            r2 = r10
            r3 = r11
            int r0 = org.lwjgl.system.JNI.callPPPI(r0, r1, r2, r3)
            return r0
    }

    @org.lwjgl.system.NativeType("VkResult")
    public static int vkFreeDescriptorSets(org.lwjgl.vulkan.VkDevice r9, @org.lwjgl.system.NativeType("VkDescriptorPool") long r10, @javax.annotation.Nullable @org.lwjgl.system.NativeType("VkDescriptorSet const *") long[] r12) {
            r0 = r9
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkFreeDescriptorSets
            r13 = r0
            r0 = r9
            long r0 = r0.address()
            r1 = r10
            r2 = r12
            int r2 = org.lwjgl.system.Checks.lengthSafe(r2)
            r3 = r12
            r4 = r13
            int r0 = org.lwjgl.system.JNI.callPJPI(r0, r1, r2, r3, r4)
            return r0
    }

    @org.lwjgl.system.NativeType("VkResult")
    public static int vkCreateFramebuffer(org.lwjgl.vulkan.VkDevice r10, @org.lwjgl.system.NativeType("VkFramebufferCreateInfo const *") org.lwjgl.vulkan.VkFramebufferCreateInfo r11, @javax.annotation.Nullable @org.lwjgl.system.NativeType("VkAllocationCallbacks const *") org.lwjgl.vulkan.VkAllocationCallbacks r12, @org.lwjgl.system.NativeType("VkFramebuffer *") long[] r13) {
            r0 = r10
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkCreateFramebuffer
            r14 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L14
            r0 = r13
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
        L14:
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
    public static int vkCreateRenderPass(org.lwjgl.vulkan.VkDevice r10, @org.lwjgl.system.NativeType("VkRenderPassCreateInfo const *") org.lwjgl.vulkan.VkRenderPassCreateInfo r11, @javax.annotation.Nullable @org.lwjgl.system.NativeType("VkAllocationCallbacks const *") org.lwjgl.vulkan.VkAllocationCallbacks r12, @org.lwjgl.system.NativeType("VkRenderPass *") long[] r13) {
            r0 = r10
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkCreateRenderPass
            r14 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L1b
            r0 = r13
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
            r0 = r11
            long r0 = r0.address()
            org.lwjgl.vulkan.VkRenderPassCreateInfo.validate(r0)
        L1b:
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
    public static int vkCreateCommandPool(org.lwjgl.vulkan.VkDevice r10, @org.lwjgl.system.NativeType("VkCommandPoolCreateInfo const *") org.lwjgl.vulkan.VkCommandPoolCreateInfo r11, @javax.annotation.Nullable @org.lwjgl.system.NativeType("VkAllocationCallbacks const *") org.lwjgl.vulkan.VkAllocationCallbacks r12, @org.lwjgl.system.NativeType("VkCommandPool *") long[] r13) {
            r0 = r10
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkCreateCommandPool
            r14 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L14
            r0 = r13
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
        L14:
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

    public static void vkCmdSetBlendConstants(org.lwjgl.vulkan.VkCommandBuffer r6, @org.lwjgl.system.NativeType("float const *") float[] r7) {
            r0 = r6
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkCmdSetBlendConstants
            r8 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L13
            r0 = r7
            r1 = 4
            org.lwjgl.system.Checks.check(r0, r1)
        L13:
            r0 = r6
            long r0 = r0.address()
            r1 = r7
            r2 = r8
            org.lwjgl.system.JNI.callPPV(r0, r1, r2)
            return
    }

    public static void vkCmdBindDescriptorSets(org.lwjgl.vulkan.VkCommandBuffer r13, @org.lwjgl.system.NativeType("VkPipelineBindPoint") int r14, @org.lwjgl.system.NativeType("VkPipelineLayout") long r15, @org.lwjgl.system.NativeType("uint32_t") int r17, @org.lwjgl.system.NativeType("VkDescriptorSet const *") long[] r18, @javax.annotation.Nullable @org.lwjgl.system.NativeType("uint32_t const *") int[] r19) {
            r0 = r13
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkCmdBindDescriptorSets
            r20 = r0
            r0 = r13
            long r0 = r0.address()
            r1 = r14
            r2 = r15
            r3 = r17
            r4 = r18
            int r4 = r4.length
            r5 = r18
            r6 = r19
            int r6 = org.lwjgl.system.Checks.lengthSafe(r6)
            r7 = r19
            r8 = r20
            org.lwjgl.system.JNI.callPJPPV(r0, r1, r2, r3, r4, r5, r6, r7, r8)
            return
    }

    public static void vkCmdBindVertexBuffers(org.lwjgl.vulkan.VkCommandBuffer r9, @org.lwjgl.system.NativeType("uint32_t") int r10, @org.lwjgl.system.NativeType("VkBuffer const *") long[] r11, @org.lwjgl.system.NativeType("VkDeviceSize const *") long[] r12) {
            r0 = r9
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkCmdBindVertexBuffers
            r13 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L15
            r0 = r12
            r1 = r11
            int r1 = r1.length
            org.lwjgl.system.Checks.check(r0, r1)
        L15:
            r0 = r9
            long r0 = r0.address()
            r1 = r10
            r2 = r11
            int r2 = r2.length
            r3 = r11
            r4 = r12
            r5 = r13
            org.lwjgl.system.JNI.callPPPV(r0, r1, r2, r3, r4, r5)
            return
    }

    public static void vkCmdUpdateBuffer(org.lwjgl.vulkan.VkCommandBuffer r12, @org.lwjgl.system.NativeType("VkBuffer") long r13, @org.lwjgl.system.NativeType("VkDeviceSize") long r15, @org.lwjgl.system.NativeType("void const *") short[] r17) {
            r0 = r12
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkCmdUpdateBuffer
            r18 = r0
            r0 = r12
            long r0 = r0.address()
            r1 = r13
            r2 = r15
            r3 = r17
            int r3 = r3.length
            long r3 = java.lang.Integer.toUnsignedLong(r3)
            r4 = 1
            long r3 = r3 << r4
            r4 = r17
            r5 = r18
            org.lwjgl.system.JNI.callPJJJPV(r0, r1, r2, r3, r4, r5)
            return
    }

    public static void vkCmdUpdateBuffer(org.lwjgl.vulkan.VkCommandBuffer r12, @org.lwjgl.system.NativeType("VkBuffer") long r13, @org.lwjgl.system.NativeType("VkDeviceSize") long r15, @org.lwjgl.system.NativeType("void const *") int[] r17) {
            r0 = r12
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkCmdUpdateBuffer
            r18 = r0
            r0 = r12
            long r0 = r0.address()
            r1 = r13
            r2 = r15
            r3 = r17
            int r3 = r3.length
            long r3 = java.lang.Integer.toUnsignedLong(r3)
            r4 = 2
            long r3 = r3 << r4
            r4 = r17
            r5 = r18
            org.lwjgl.system.JNI.callPJJJPV(r0, r1, r2, r3, r4, r5)
            return
    }

    public static void vkCmdUpdateBuffer(org.lwjgl.vulkan.VkCommandBuffer r12, @org.lwjgl.system.NativeType("VkBuffer") long r13, @org.lwjgl.system.NativeType("VkDeviceSize") long r15, @org.lwjgl.system.NativeType("void const *") long[] r17) {
            r0 = r12
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkCmdUpdateBuffer
            r18 = r0
            r0 = r12
            long r0 = r0.address()
            r1 = r13
            r2 = r15
            r3 = r17
            int r3 = r3.length
            long r3 = java.lang.Integer.toUnsignedLong(r3)
            r4 = 3
            long r3 = r3 << r4
            r4 = r17
            r5 = r18
            org.lwjgl.system.JNI.callPJJJPV(r0, r1, r2, r3, r4, r5)
            return
    }

    public static void vkCmdUpdateBuffer(org.lwjgl.vulkan.VkCommandBuffer r12, @org.lwjgl.system.NativeType("VkBuffer") long r13, @org.lwjgl.system.NativeType("VkDeviceSize") long r15, @org.lwjgl.system.NativeType("void const *") float[] r17) {
            r0 = r12
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkCmdUpdateBuffer
            r18 = r0
            r0 = r12
            long r0 = r0.address()
            r1 = r13
            r2 = r15
            r3 = r17
            int r3 = r3.length
            long r3 = java.lang.Integer.toUnsignedLong(r3)
            r4 = 2
            long r3 = r3 << r4
            r4 = r17
            r5 = r18
            org.lwjgl.system.JNI.callPJJJPV(r0, r1, r2, r3, r4, r5)
            return
    }

    public static void vkCmdUpdateBuffer(org.lwjgl.vulkan.VkCommandBuffer r12, @org.lwjgl.system.NativeType("VkBuffer") long r13, @org.lwjgl.system.NativeType("VkDeviceSize") long r15, @org.lwjgl.system.NativeType("void const *") double[] r17) {
            r0 = r12
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkCmdUpdateBuffer
            r18 = r0
            r0 = r12
            long r0 = r0.address()
            r1 = r13
            r2 = r15
            r3 = r17
            int r3 = r3.length
            long r3 = java.lang.Integer.toUnsignedLong(r3)
            r4 = 3
            long r3 = r3 << r4
            r4 = r17
            r5 = r18
            org.lwjgl.system.JNI.callPJJJPV(r0, r1, r2, r3, r4, r5)
            return
    }

    public static void vkCmdWaitEvents(org.lwjgl.vulkan.VkCommandBuffer r18, @org.lwjgl.system.NativeType("VkEvent const *") long[] r19, @org.lwjgl.system.NativeType("VkPipelineStageFlags") int r20, @org.lwjgl.system.NativeType("VkPipelineStageFlags") int r21, @javax.annotation.Nullable @org.lwjgl.system.NativeType("VkMemoryBarrier const *") org.lwjgl.vulkan.VkMemoryBarrier.Buffer r22, @javax.annotation.Nullable @org.lwjgl.system.NativeType("VkBufferMemoryBarrier const *") org.lwjgl.vulkan.VkBufferMemoryBarrier.Buffer r23, @javax.annotation.Nullable @org.lwjgl.system.NativeType("VkImageMemoryBarrier const *") org.lwjgl.vulkan.VkImageMemoryBarrier.Buffer r24) {
            r0 = r18
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkCmdWaitEvents
            r25 = r0
            r0 = r18
            long r0 = r0.address()
            r1 = r19
            int r1 = r1.length
            r2 = r19
            r3 = r20
            r4 = r21
            r5 = r22
            int r5 = org.lwjgl.system.Checks.remainingSafe(r5)
            r6 = r22
            long r6 = org.lwjgl.system.MemoryUtil.memAddressSafe(r6)
            r7 = r23
            int r7 = org.lwjgl.system.Checks.remainingSafe(r7)
            r8 = r23
            long r8 = org.lwjgl.system.MemoryUtil.memAddressSafe(r8)
            r9 = r24
            int r9 = org.lwjgl.system.Checks.remainingSafe(r9)
            r10 = r24
            long r10 = org.lwjgl.system.MemoryUtil.memAddressSafe(r10)
            r11 = r25
            org.lwjgl.system.JNI.callPPPPPV(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            return
    }

    public static void vkCmdPushConstants(org.lwjgl.vulkan.VkCommandBuffer r11, @org.lwjgl.system.NativeType("VkPipelineLayout") long r12, @org.lwjgl.system.NativeType("VkShaderStageFlags") int r14, @org.lwjgl.system.NativeType("uint32_t") int r15, @org.lwjgl.system.NativeType("void const *") short[] r16) {
            r0 = r11
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkCmdPushConstants
            r17 = r0
            r0 = r11
            long r0 = r0.address()
            r1 = r12
            r2 = r14
            r3 = r15
            r4 = r16
            int r4 = r4.length
            r5 = 1
            int r4 = r4 << r5
            r5 = r16
            r6 = r17
            org.lwjgl.system.JNI.callPJPV(r0, r1, r2, r3, r4, r5, r6)
            return
    }

    public static void vkCmdPushConstants(org.lwjgl.vulkan.VkCommandBuffer r11, @org.lwjgl.system.NativeType("VkPipelineLayout") long r12, @org.lwjgl.system.NativeType("VkShaderStageFlags") int r14, @org.lwjgl.system.NativeType("uint32_t") int r15, @org.lwjgl.system.NativeType("void const *") int[] r16) {
            r0 = r11
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkCmdPushConstants
            r17 = r0
            r0 = r11
            long r0 = r0.address()
            r1 = r12
            r2 = r14
            r3 = r15
            r4 = r16
            int r4 = r4.length
            r5 = 2
            int r4 = r4 << r5
            r5 = r16
            r6 = r17
            org.lwjgl.system.JNI.callPJPV(r0, r1, r2, r3, r4, r5, r6)
            return
    }

    public static void vkCmdPushConstants(org.lwjgl.vulkan.VkCommandBuffer r11, @org.lwjgl.system.NativeType("VkPipelineLayout") long r12, @org.lwjgl.system.NativeType("VkShaderStageFlags") int r14, @org.lwjgl.system.NativeType("uint32_t") int r15, @org.lwjgl.system.NativeType("void const *") long[] r16) {
            r0 = r11
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkCmdPushConstants
            r17 = r0
            r0 = r11
            long r0 = r0.address()
            r1 = r12
            r2 = r14
            r3 = r15
            r4 = r16
            int r4 = r4.length
            r5 = 3
            int r4 = r4 << r5
            r5 = r16
            r6 = r17
            org.lwjgl.system.JNI.callPJPV(r0, r1, r2, r3, r4, r5, r6)
            return
    }

    public static void vkCmdPushConstants(org.lwjgl.vulkan.VkCommandBuffer r11, @org.lwjgl.system.NativeType("VkPipelineLayout") long r12, @org.lwjgl.system.NativeType("VkShaderStageFlags") int r14, @org.lwjgl.system.NativeType("uint32_t") int r15, @org.lwjgl.system.NativeType("void const *") float[] r16) {
            r0 = r11
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkCmdPushConstants
            r17 = r0
            r0 = r11
            long r0 = r0.address()
            r1 = r12
            r2 = r14
            r3 = r15
            r4 = r16
            int r4 = r4.length
            r5 = 2
            int r4 = r4 << r5
            r5 = r16
            r6 = r17
            org.lwjgl.system.JNI.callPJPV(r0, r1, r2, r3, r4, r5, r6)
            return
    }

    public static void vkCmdPushConstants(org.lwjgl.vulkan.VkCommandBuffer r11, @org.lwjgl.system.NativeType("VkPipelineLayout") long r12, @org.lwjgl.system.NativeType("VkShaderStageFlags") int r14, @org.lwjgl.system.NativeType("uint32_t") int r15, @org.lwjgl.system.NativeType("void const *") double[] r16) {
            r0 = r11
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkCmdPushConstants
            r17 = r0
            r0 = r11
            long r0 = r0.address()
            r1 = r12
            r2 = r14
            r3 = r15
            r4 = r16
            int r4 = r4.length
            r5 = 3
            int r4 = r4 << r5
            r5 = r16
            r6 = r17
            org.lwjgl.system.JNI.callPJPV(r0, r1, r2, r3, r4, r5, r6)
            return
    }

    static {
            r0 = 0
            r1 = 1
            r2 = 0
            r3 = 0
            int r0 = VK_MAKE_API_VERSION(r0, r1, r2, r3)
            org.lwjgl.vulkan.VK10.VK_API_VERSION_1_0 = r0
            return
    }
}
