package org.lwjgl.util.spvc;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/util/spvc/Spvc.class */
public class Spvc {
    private static final org.lwjgl.system.SharedLibrary SPVC = null;
    public static final int SPVC_C_API_VERSION_MAJOR = 0;
    public static final int SPVC_C_API_VERSION_MINOR = 68;
    public static final int SPVC_C_API_VERSION_PATCH = 0;
    public static final int SPVC_COMPILER_OPTION_COMMON_BIT = 16777216;
    public static final int SPVC_COMPILER_OPTION_GLSL_BIT = 33554432;
    public static final int SPVC_COMPILER_OPTION_HLSL_BIT = 67108864;
    public static final int SPVC_COMPILER_OPTION_MSL_BIT = 134217728;
    public static final int SPVC_COMPILER_OPTION_LANG_BITS = 251658240;
    public static final int SPVC_COMPILER_OPTION_ENUM_BITS = 16777215;
    public static final int SPVC_MSL_PUSH_CONSTANT_DESC_SET = -1;
    public static final int SPVC_MSL_PUSH_CONSTANT_BINDING = 0;
    public static final int SPVC_MSL_SWIZZLE_BUFFER_BINDING = -2;
    public static final int SPVC_MSL_BUFFER_SIZE_BUFFER_BINDING = -3;
    public static final int SPVC_MSL_ARGUMENT_BUFFER_BINDING = -4;
    public static final int SPVC_MSL_AUX_BUFFER_STRUCT_VERSION = 1;
    public static final int SPVC_SUCCESS = 0;
    public static final int SPVC_ERROR_INVALID_SPIRV = -1;
    public static final int SPVC_ERROR_UNSUPPORTED_SPIRV = -2;
    public static final int SPVC_ERROR_OUT_OF_MEMORY = -3;
    public static final int SPVC_ERROR_INVALID_ARGUMENT = -4;
    public static final int SPVC_CAPTURE_MODE_COPY = 0;
    public static final int SPVC_CAPTURE_MODE_TAKE_OWNERSHIP = 1;
    public static final int SPVC_BACKEND_NONE = 0;
    public static final int SPVC_BACKEND_GLSL = 1;
    public static final int SPVC_BACKEND_HLSL = 2;
    public static final int SPVC_BACKEND_MSL = 3;
    public static final int SPVC_BACKEND_CPP = 4;
    public static final int SPVC_BACKEND_JSON = 5;
    public static final int SPVC_RESOURCE_TYPE_UNKNOWN = 0;
    public static final int SPVC_RESOURCE_TYPE_UNIFORM_BUFFER = 1;
    public static final int SPVC_RESOURCE_TYPE_STORAGE_BUFFER = 2;
    public static final int SPVC_RESOURCE_TYPE_STAGE_INPUT = 3;
    public static final int SPVC_RESOURCE_TYPE_STAGE_OUTPUT = 4;
    public static final int SPVC_RESOURCE_TYPE_SUBPASS_INPUT = 5;
    public static final int SPVC_RESOURCE_TYPE_STORAGE_IMAGE = 6;
    public static final int SPVC_RESOURCE_TYPE_SAMPLED_IMAGE = 7;
    public static final int SPVC_RESOURCE_TYPE_ATOMIC_COUNTER = 8;
    public static final int SPVC_RESOURCE_TYPE_PUSH_CONSTANT = 9;
    public static final int SPVC_RESOURCE_TYPE_SEPARATE_IMAGE = 10;
    public static final int SPVC_RESOURCE_TYPE_SEPARATE_SAMPLERS = 11;
    public static final int SPVC_RESOURCE_TYPE_ACCELERATION_STRUCTURE = 12;
    public static final int SPVC_RESOURCE_TYPE_RAY_QUERY = 13;
    public static final int SPVC_RESOURCE_TYPE_SHADER_RECORD_BUFFER = 14;
    public static final int SPVC_RESOURCE_TYPE_GL_PLAIN_UNIFORM = 15;
    public static final int SPVC_RESOURCE_TYPE_TENSOR = 16;
    public static final int SPVC_BUILTIN_RESOURCE_TYPE_UNKNOWN = 0;
    public static final int SPVC_BUILTIN_RESOURCE_TYPE_STAGE_INPUT = 1;
    public static final int SPVC_BUILTIN_RESOURCE_TYPE_STAGE_OUTPUT = 2;
    public static final int SPVC_BASETYPE_UNKNOWN = 0;
    public static final int SPVC_BASETYPE_VOID = 1;
    public static final int SPVC_BASETYPE_BOOLEAN = 2;
    public static final int SPVC_BASETYPE_INT8 = 3;
    public static final int SPVC_BASETYPE_UINT8 = 4;
    public static final int SPVC_BASETYPE_INT16 = 5;
    public static final int SPVC_BASETYPE_UINT16 = 6;
    public static final int SPVC_BASETYPE_INT32 = 7;
    public static final int SPVC_BASETYPE_UINT32 = 8;
    public static final int SPVC_BASETYPE_INT64 = 9;
    public static final int SPVC_BASETYPE_UINT64 = 10;
    public static final int SPVC_BASETYPE_ATOMIC_COUNTER = 11;
    public static final int SPVC_BASETYPE_FP16 = 12;
    public static final int SPVC_BASETYPE_FP32 = 13;
    public static final int SPVC_BASETYPE_FP64 = 14;
    public static final int SPVC_BASETYPE_STRUCT = 15;
    public static final int SPVC_BASETYPE_IMAGE = 16;
    public static final int SPVC_BASETYPE_SAMPLED_IMAGE = 17;
    public static final int SPVC_BASETYPE_SAMPLER = 18;
    public static final int SPVC_BASETYPE_ACCELERATION_STRUCTURE = 19;
    public static final int SPVC_MSL_PLATFORM_IOS = 0;
    public static final int SPVC_MSL_PLATFORM_MACOS = 1;
    public static final int SPVC_MSL_INDEX_TYPE_NONE = 0;
    public static final int SPVC_MSL_INDEX_TYPE_UINT16 = 1;
    public static final int SPVC_MSL_INDEX_TYPE_UINT32 = 2;
    public static final int SPVC_MSL_SHADER_VARIABLE_FORMAT_OTHER = 0;
    public static final int SPVC_MSL_SHADER_VARIABLE_FORMAT_UINT8 = 1;
    public static final int SPVC_MSL_SHADER_VARIABLE_FORMAT_UINT16 = 2;
    public static final int SPVC_MSL_SHADER_VARIABLE_FORMAT_ANY16 = 3;
    public static final int SPVC_MSL_SHADER_VARIABLE_FORMAT_ANY32 = 4;
    public static final int SPVC_MSL_VERTEX_FORMAT_OTHER = 0;
    public static final int SPVC_MSL_VERTEX_FORMAT_UINT8 = 1;
    public static final int SPVC_MSL_VERTEX_FORMAT_UINT16 = 2;
    public static final int SPVC_MSL_SHADER_INPUT_FORMAT_OTHER = 0;
    public static final int SPVC_MSL_SHADER_INPUT_FORMAT_UINT8 = 1;
    public static final int SPVC_MSL_SHADER_INPUT_FORMAT_UINT16 = 2;
    public static final int SPVC_MSL_SHADER_INPUT_FORMAT_ANY16 = 3;
    public static final int SPVC_MSL_SHADER_INPUT_FORMAT_ANY32 = 4;
    public static final int SPVC_MSL_SHADER_VARIABLE_RATE_PER_VERTEX = 0;
    public static final int SPVC_MSL_SHADER_VARIABLE_RATE_PER_PRIMITIVE = 1;
    public static final int SPVC_MSL_SHADER_VARIABLE_RATE_PER_PATCH = 2;
    public static final int SPVC_MSL_SAMPLER_COORD_NORMALIZED = 0;
    public static final int SPVC_MSL_SAMPLER_COORD_PIXEL = 1;
    public static final int SPVC_MSL_SAMPLER_FILTER_NEAREST = 0;
    public static final int SPVC_MSL_SAMPLER_FILTER_LINEAR = 1;
    public static final int SPVC_MSL_SAMPLER_MIP_FILTER_NONE = 0;
    public static final int SPVC_MSL_SAMPLER_MIP_FILTER_NEAREST = 1;
    public static final int SPVC_MSL_SAMPLER_MIP_FILTER_LINEAR = 2;
    public static final int SPVC_MSL_SAMPLER_ADDRESS_CLAMP_TO_ZERO = 0;
    public static final int SPVC_MSL_SAMPLER_ADDRESS_CLAMP_TO_EDGE = 1;
    public static final int SPVC_MSL_SAMPLER_ADDRESS_CLAMP_TO_BORDER = 2;
    public static final int SPVC_MSL_SAMPLER_ADDRESS_REPEAT = 3;
    public static final int SPVC_MSL_SAMPLER_ADDRESS_MIRRORED_REPEAT = 4;
    public static final int SPVC_MSL_SAMPLER_COMPARE_FUNC_NEVER = 0;
    public static final int SPVC_MSL_SAMPLER_COMPARE_FUNC_LESS = 1;
    public static final int SPVC_MSL_SAMPLER_COMPARE_FUNC_LESS_EQUAL = 2;
    public static final int SPVC_MSL_SAMPLER_COMPARE_FUNC_GREATER = 3;
    public static final int SPVC_MSL_SAMPLER_COMPARE_FUNC_GREATER_EQUAL = 4;
    public static final int SPVC_MSL_SAMPLER_COMPARE_FUNC_EQUAL = 5;
    public static final int SPVC_MSL_SAMPLER_COMPARE_FUNC_NOT_EQUAL = 6;
    public static final int SPVC_MSL_SAMPLER_COMPARE_FUNC_ALWAYS = 7;
    public static final int SPVC_MSL_SAMPLER_BORDER_COLOR_TRANSPARENT_BLACK = 0;
    public static final int SPVC_MSL_SAMPLER_BORDER_COLOR_OPAQUE_BLACK = 1;
    public static final int SPVC_MSL_SAMPLER_BORDER_COLOR_OPAQUE_WHITE = 2;
    public static final int SPVC_MSL_FORMAT_RESOLUTION_444 = 0;
    public static final int SPVC_MSL_FORMAT_RESOLUTION_422 = 1;
    public static final int SPVC_MSL_FORMAT_RESOLUTION_420 = 2;
    public static final int SPVC_MSL_CHROMA_LOCATION_COSITED_EVEN = 0;
    public static final int SPVC_MSL_CHROMA_LOCATION_MIDPOINT = 1;
    public static final int SPVC_MSL_COMPONENT_SWIZZLE_IDENTITY = 0;
    public static final int SPVC_MSL_COMPONENT_SWIZZLE_ZERO = 1;
    public static final int SPVC_MSL_COMPONENT_SWIZZLE_ONE = 2;
    public static final int SPVC_MSL_COMPONENT_SWIZZLE_R = 3;
    public static final int SPVC_MSL_COMPONENT_SWIZZLE_G = 4;
    public static final int SPVC_MSL_COMPONENT_SWIZZLE_B = 5;
    public static final int SPVC_MSL_COMPONENT_SWIZZLE_A = 6;
    public static final int SPVC_MSL_SAMPLER_YCBCR_MODEL_CONVERSION_RGB_IDENTITY = 0;
    public static final int SPVC_MSL_SAMPLER_YCBCR_MODEL_CONVERSION_YCBCR_IDENTITY = 1;
    public static final int SPVC_MSL_SAMPLER_YCBCR_MODEL_CONVERSION_YCBCR_BT_709 = 2;
    public static final int SPVC_MSL_SAMPLER_YCBCR_MODEL_CONVERSION_YCBCR_BT_601 = 3;
    public static final int SPVC_MSL_SAMPLER_YCBCR_MODEL_CONVERSION_YCBCR_BT_2020 = 4;
    public static final int SPVC_MSL_SAMPLER_YCBCR_RANGE_ITU_FULL = 0;
    public static final int SPVC_MSL_SAMPLER_YCBCR_RANGE_ITU_NARROW = 1;
    public static final int SPVC_HLSL_BINDING_AUTO_NONE_BIT = 0;
    public static final int SPVC_HLSL_BINDING_AUTO_PUSH_CONSTANT_BIT = 1;
    public static final int SPVC_HLSL_BINDING_AUTO_CBV_BIT = 2;
    public static final int SPVC_HLSL_BINDING_AUTO_SRV_BIT = 4;
    public static final int SPVC_HLSL_BINDING_AUTO_UAV_BIT = 8;
    public static final int SPVC_HLSL_BINDING_AUTO_SAMPLER_BIT = 16;
    public static final int SPVC_HLSL_BINDING_AUTO_ALL = Integer.MAX_VALUE;
    public static final int SPVC_HLSL_PUSH_CONSTANT_DESC_SET = -1;
    public static final int SPVC_HLSL_PUSH_CONSTANT_BINDING = 0;
    public static final int SPVC_COMPILER_OPTION_UNKNOWN = 0;
    public static final int SPVC_COMPILER_OPTION_FORCE_TEMPORARY = 16777217;
    public static final int SPVC_COMPILER_OPTION_FLATTEN_MULTIDIMENSIONAL_ARRAYS = 16777218;
    public static final int SPVC_COMPILER_OPTION_FIXUP_DEPTH_CONVENTION = 16777219;
    public static final int SPVC_COMPILER_OPTION_FLIP_VERTEX_Y = 16777220;
    public static final int SPVC_COMPILER_OPTION_GLSL_SUPPORT_NONZERO_BASE_INSTANCE = 33554437;
    public static final int SPVC_COMPILER_OPTION_GLSL_SEPARATE_SHADER_OBJECTS = 33554438;
    public static final int SPVC_COMPILER_OPTION_GLSL_ENABLE_420PACK_EXTENSION = 33554439;
    public static final int SPVC_COMPILER_OPTION_GLSL_VERSION = 33554440;
    public static final int SPVC_COMPILER_OPTION_GLSL_ES = 33554441;
    public static final int SPVC_COMPILER_OPTION_GLSL_VULKAN_SEMANTICS = 33554442;
    public static final int SPVC_COMPILER_OPTION_GLSL_ES_DEFAULT_FLOAT_PRECISION_HIGHP = 33554443;
    public static final int SPVC_COMPILER_OPTION_GLSL_ES_DEFAULT_INT_PRECISION_HIGHP = 33554444;
    public static final int SPVC_COMPILER_OPTION_HLSL_SHADER_MODEL = 67108877;
    public static final int SPVC_COMPILER_OPTION_HLSL_POINT_SIZE_COMPAT = 67108878;
    public static final int SPVC_COMPILER_OPTION_HLSL_POINT_COORD_COMPAT = 67108879;
    public static final int SPVC_COMPILER_OPTION_HLSL_SUPPORT_NONZERO_BASE_VERTEX_BASE_INSTANCE = 67108880;
    public static final int SPVC_COMPILER_OPTION_MSL_VERSION = 134217745;
    public static final int SPVC_COMPILER_OPTION_MSL_TEXEL_BUFFER_TEXTURE_WIDTH = 134217746;
    public static final int SPVC_COMPILER_OPTION_MSL_AUX_BUFFER_INDEX = 134217747;
    public static final int SPVC_COMPILER_OPTION_MSL_SWIZZLE_BUFFER_INDEX = 134217747;
    public static final int SPVC_COMPILER_OPTION_MSL_INDIRECT_PARAMS_BUFFER_INDEX = 134217748;
    public static final int SPVC_COMPILER_OPTION_MSL_SHADER_OUTPUT_BUFFER_INDEX = 134217749;
    public static final int SPVC_COMPILER_OPTION_MSL_SHADER_PATCH_OUTPUT_BUFFER_INDEX = 134217750;
    public static final int SPVC_COMPILER_OPTION_MSL_SHADER_TESS_FACTOR_OUTPUT_BUFFER_INDEX = 134217751;
    public static final int SPVC_COMPILER_OPTION_MSL_SHADER_INPUT_WORKGROUP_INDEX = 134217752;
    public static final int SPVC_COMPILER_OPTION_MSL_ENABLE_POINT_SIZE_BUILTIN = 134217753;
    public static final int SPVC_COMPILER_OPTION_MSL_DISABLE_RASTERIZATION = 134217754;
    public static final int SPVC_COMPILER_OPTION_MSL_CAPTURE_OUTPUT_TO_BUFFER = 134217755;
    public static final int SPVC_COMPILER_OPTION_MSL_SWIZZLE_TEXTURE_SAMPLES = 134217756;
    public static final int SPVC_COMPILER_OPTION_MSL_PAD_FRAGMENT_OUTPUT_COMPONENTS = 134217757;
    public static final int SPVC_COMPILER_OPTION_MSL_TESS_DOMAIN_ORIGIN_LOWER_LEFT = 134217758;
    public static final int SPVC_COMPILER_OPTION_MSL_PLATFORM = 134217759;
    public static final int SPVC_COMPILER_OPTION_MSL_ARGUMENT_BUFFERS = 134217760;
    public static final int SPVC_COMPILER_OPTION_GLSL_EMIT_PUSH_CONSTANT_AS_UNIFORM_BUFFER = 33554465;
    public static final int SPVC_COMPILER_OPTION_MSL_TEXTURE_BUFFER_NATIVE = 134217762;
    public static final int SPVC_COMPILER_OPTION_GLSL_EMIT_UNIFORM_BUFFER_AS_PLAIN_UNIFORMS = 33554467;
    public static final int SPVC_COMPILER_OPTION_MSL_BUFFER_SIZE_BUFFER_INDEX = 134217764;
    public static final int SPVC_COMPILER_OPTION_EMIT_LINE_DIRECTIVES = 16777253;
    public static final int SPVC_COMPILER_OPTION_MSL_MULTIVIEW = 134217766;
    public static final int SPVC_COMPILER_OPTION_MSL_VIEW_MASK_BUFFER_INDEX = 134217767;
    public static final int SPVC_COMPILER_OPTION_MSL_DEVICE_INDEX = 134217768;
    public static final int SPVC_COMPILER_OPTION_MSL_VIEW_INDEX_FROM_DEVICE_INDEX = 134217769;
    public static final int SPVC_COMPILER_OPTION_MSL_DISPATCH_BASE = 134217770;
    public static final int SPVC_COMPILER_OPTION_MSL_DYNAMIC_OFFSETS_BUFFER_INDEX = 134217771;
    public static final int SPVC_COMPILER_OPTION_MSL_TEXTURE_1D_AS_2D = 134217772;
    public static final int SPVC_COMPILER_OPTION_MSL_ENABLE_BASE_INDEX_ZERO = 134217773;
    public static final int SPVC_COMPILER_OPTION_MSL_IOS_FRAMEBUFFER_FETCH_SUBPASS = 134217774;
    public static final int SPVC_COMPILER_OPTION_MSL_FRAMEBUFFER_FETCH_SUBPASS = 134217774;
    public static final int SPVC_COMPILER_OPTION_MSL_INVARIANT_FP_MATH = 134217775;
    public static final int SPVC_COMPILER_OPTION_MSL_EMULATE_CUBEMAP_ARRAY = 134217776;
    public static final int SPVC_COMPILER_OPTION_MSL_ENABLE_DECORATION_BINDING = 134217777;
    public static final int SPVC_COMPILER_OPTION_MSL_FORCE_ACTIVE_ARGUMENT_BUFFER_RESOURCES = 134217778;
    public static final int SPVC_COMPILER_OPTION_MSL_FORCE_NATIVE_ARRAYS = 134217779;
    public static final int SPVC_COMPILER_OPTION_ENABLE_STORAGE_IMAGE_QUALIFIER_DEDUCTION = 16777268;
    public static final int SPVC_COMPILER_OPTION_HLSL_FORCE_STORAGE_BUFFER_AS_UAV = 67108917;
    public static final int SPVC_COMPILER_OPTION_FORCE_ZERO_INITIALIZED_VARIABLES = 16777270;
    public static final int SPVC_COMPILER_OPTION_HLSL_NONWRITABLE_UAV_TEXTURE_AS_SRV = 67108919;
    public static final int SPVC_COMPILER_OPTION_MSL_ENABLE_FRAG_OUTPUT_MASK = 134217784;
    public static final int SPVC_COMPILER_OPTION_MSL_ENABLE_FRAG_DEPTH_BUILTIN = 134217785;
    public static final int SPVC_COMPILER_OPTION_MSL_ENABLE_FRAG_STENCIL_REF_BUILTIN = 134217786;
    public static final int SPVC_COMPILER_OPTION_MSL_ENABLE_CLIP_DISTANCE_USER_VARYING = 134217787;
    public static final int SPVC_COMPILER_OPTION_HLSL_ENABLE_16BIT_TYPES = 67108924;
    public static final int SPVC_COMPILER_OPTION_MSL_MULTI_PATCH_WORKGROUP = 134217789;
    public static final int SPVC_COMPILER_OPTION_MSL_SHADER_INPUT_BUFFER_INDEX = 134217790;
    public static final int SPVC_COMPILER_OPTION_MSL_SHADER_INDEX_BUFFER_INDEX = 134217791;
    public static final int SPVC_COMPILER_OPTION_MSL_VERTEX_FOR_TESSELLATION = 134217792;
    public static final int SPVC_COMPILER_OPTION_MSL_VERTEX_INDEX_TYPE = 134217793;
    public static final int SPVC_COMPILER_OPTION_GLSL_FORCE_FLATTENED_IO_BLOCKS = 33554498;
    public static final int SPVC_COMPILER_OPTION_MSL_MULTIVIEW_LAYERED_RENDERING = 134217795;
    public static final int SPVC_COMPILER_OPTION_MSL_ARRAYED_SUBPASS_INPUT = 134217796;
    public static final int SPVC_COMPILER_OPTION_MSL_R32UI_LINEAR_TEXTURE_ALIGNMENT = 134217797;
    public static final int SPVC_COMPILER_OPTION_MSL_R32UI_ALIGNMENT_CONSTANT_ID = 134217798;
    public static final int SPVC_COMPILER_OPTION_HLSL_FLATTEN_MATRIX_VERTEX_INPUT_SEMANTICS = 67108935;
    public static final int SPVC_COMPILER_OPTION_MSL_IOS_USE_SIMDGROUP_FUNCTIONS = 134217800;
    public static final int SPVC_COMPILER_OPTION_MSL_EMULATE_SUBGROUPS = 134217801;
    public static final int SPVC_COMPILER_OPTION_MSL_FIXED_SUBGROUP_SIZE = 134217802;
    public static final int SPVC_COMPILER_OPTION_MSL_FORCE_SAMPLE_RATE_SHADING = 134217803;
    public static final int SPVC_COMPILER_OPTION_MSL_IOS_SUPPORT_BASE_VERTEX_INSTANCE = 134217804;
    public static final int SPVC_COMPILER_OPTION_GLSL_OVR_MULTIVIEW_VIEW_COUNT = 33554509;
    public static final int SPVC_COMPILER_OPTION_RELAX_NAN_CHECKS = 16777294;
    public static final int SPVC_COMPILER_OPTION_MSL_RAW_BUFFER_TESE_INPUT = 134217807;
    public static final int SPVC_COMPILER_OPTION_MSL_SHADER_PATCH_INPUT_BUFFER_INDEX = 134217808;
    public static final int SPVC_COMPILER_OPTION_MSL_MANUAL_HELPER_INVOCATION_UPDATES = 134217809;
    public static final int SPVC_COMPILER_OPTION_MSL_CHECK_DISCARDED_FRAG_STORES = 134217810;
    public static final int SPVC_COMPILER_OPTION_GLSL_ENABLE_ROW_MAJOR_LOAD_WORKAROUND = 33554515;
    public static final int SPVC_COMPILER_OPTION_MSL_ARGUMENT_BUFFERS_TIER = 134217812;
    public static final int SPVC_COMPILER_OPTION_MSL_SAMPLE_DREF_LOD_ARRAY_AS_GRAD = 134217813;
    public static final int SPVC_COMPILER_OPTION_MSL_READWRITE_TEXTURE_FENCES = 134217814;
    public static final int SPVC_COMPILER_OPTION_MSL_REPLACE_RECURSIVE_INPUTS = 134217815;
    public static final int SPVC_COMPILER_OPTION_MSL_AGX_MANUAL_CUBE_GRAD_FIXUP = 134217816;
    public static final int SPVC_COMPILER_OPTION_MSL_FORCE_FRAGMENT_WITH_SIDE_EFFECTS_EXECUTION = 134217817;
    public static final int SPVC_COMPILER_OPTION_HLSL_USE_ENTRY_POINT_NAME = 67108954;
    public static final int SPVC_COMPILER_OPTION_HLSL_PRESERVE_STRUCTURED_BUFFERS = 67108955;
    public static final int SPVC_COMPILER_OPTION_MSL_AUTO_DISABLE_RASTERIZATION = 134217820;
    public static final int SPVC_COMPILER_OPTION_MSL_ENABLE_POINT_SIZE_DEFAULT = 134217821;
    public static final int SPVC_COMPILER_OPTION_HLSL_USER_SEMANTIC = 67108958;

    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/util/spvc/Spvc$Functions.class */
    public static final class Functions {
        public static final long get_version = 0;
        public static final long get_commit_revision_and_timestamp = 0;
        public static final long msl_vertex_attribute_init = 0;
        public static final long msl_shader_interface_var_init = 0;
        public static final long msl_shader_input_init = 0;
        public static final long msl_shader_interface_var_init_2 = 0;
        public static final long msl_resource_binding_init = 0;
        public static final long msl_resource_binding_init_2 = 0;
        public static final long msl_get_aux_buffer_struct_version = 0;
        public static final long msl_constexpr_sampler_init = 0;
        public static final long msl_sampler_ycbcr_conversion_init = 0;
        public static final long hlsl_resource_binding_init = 0;
        public static final long context_create = 0;
        public static final long context_destroy = 0;
        public static final long context_release_allocations = 0;
        public static final long context_get_last_error_string = 0;
        public static final long context_set_error_callback = 0;
        public static final long context_parse_spirv = 0;
        public static final long context_create_compiler = 0;
        public static final long compiler_get_current_id_bound = 0;
        public static final long compiler_create_compiler_options = 0;
        public static final long compiler_options_set_bool = 0;
        public static final long compiler_options_set_uint = 0;
        public static final long compiler_install_compiler_options = 0;
        public static final long compiler_compile = 0;
        public static final long compiler_add_header_line = 0;
        public static final long compiler_require_extension = 0;
        public static final long compiler_get_num_required_extensions = 0;
        public static final long compiler_get_required_extension = 0;
        public static final long compiler_flatten_buffer_block = 0;
        public static final long compiler_variable_is_depth_or_compare = 0;
        public static final long compiler_mask_stage_output_by_location = 0;
        public static final long compiler_mask_stage_output_by_builtin = 0;
        public static final long compiler_hlsl_set_root_constants_layout = 0;
        public static final long compiler_hlsl_add_vertex_attribute_remap = 0;
        public static final long compiler_hlsl_remap_num_workgroups_builtin = 0;
        public static final long compiler_hlsl_set_resource_binding_flags = 0;
        public static final long compiler_hlsl_add_resource_binding = 0;
        public static final long compiler_hlsl_is_resource_used = 0;
        public static final long compiler_msl_is_rasterization_disabled = 0;
        public static final long compiler_msl_needs_swizzle_buffer = 0;
        public static final long compiler_msl_needs_buffer_size_buffer = 0;
        public static final long compiler_msl_needs_output_buffer = 0;
        public static final long compiler_msl_needs_patch_output_buffer = 0;
        public static final long compiler_msl_needs_input_threadgroup_mem = 0;
        public static final long compiler_msl_add_vertex_attribute = 0;
        public static final long compiler_msl_add_resource_binding = 0;
        public static final long compiler_msl_add_resource_binding_2 = 0;
        public static final long compiler_msl_add_shader_input = 0;
        public static final long compiler_msl_add_shader_input_2 = 0;
        public static final long compiler_msl_add_shader_output = 0;
        public static final long compiler_msl_add_shader_output_2 = 0;
        public static final long compiler_msl_add_discrete_descriptor_set = 0;
        public static final long compiler_msl_set_argument_buffer_device_address_space = 0;
        public static final long compiler_msl_is_vertex_attribute_used = 0;
        public static final long compiler_msl_is_shader_input_used = 0;
        public static final long compiler_msl_is_shader_output_used = 0;
        public static final long compiler_msl_is_resource_used = 0;
        public static final long compiler_msl_remap_constexpr_sampler = 0;
        public static final long compiler_msl_remap_constexpr_sampler_by_binding = 0;
        public static final long compiler_msl_remap_constexpr_sampler_ycbcr = 0;
        public static final long compiler_msl_remap_constexpr_sampler_by_binding_ycbcr = 0;
        public static final long compiler_msl_set_fragment_output_components = 0;
        public static final long compiler_msl_get_automatic_resource_binding = 0;
        public static final long compiler_msl_get_automatic_resource_binding_secondary = 0;
        public static final long compiler_msl_add_dynamic_buffer = 0;
        public static final long compiler_msl_add_inline_uniform_block = 0;
        public static final long compiler_msl_set_combined_sampler_suffix = 0;
        public static final long compiler_msl_get_combined_sampler_suffix = 0;
        public static final long compiler_get_active_interface_variables = 0;
        public static final long compiler_set_enabled_interface_variables = 0;
        public static final long compiler_create_shader_resources = 0;
        public static final long compiler_create_shader_resources_for_active_variables = 0;
        public static final long resources_get_resource_list_for_type = 0;
        public static final long resources_get_builtin_resource_list_for_type = 0;
        public static final long compiler_set_decoration = 0;
        public static final long compiler_set_decoration_string = 0;
        public static final long compiler_set_name = 0;
        public static final long compiler_set_member_decoration = 0;
        public static final long compiler_set_member_decoration_string = 0;
        public static final long compiler_set_member_name = 0;
        public static final long compiler_unset_decoration = 0;
        public static final long compiler_unset_member_decoration = 0;
        public static final long compiler_has_decoration = 0;
        public static final long compiler_has_member_decoration = 0;
        public static final long compiler_get_name = 0;
        public static final long compiler_get_decoration = 0;
        public static final long compiler_get_decoration_string = 0;
        public static final long compiler_get_member_decoration = 0;
        public static final long compiler_get_member_decoration_string = 0;
        public static final long compiler_get_member_name = 0;
        public static final long compiler_get_entry_points = 0;
        public static final long compiler_set_entry_point = 0;
        public static final long compiler_rename_entry_point = 0;
        public static final long compiler_get_cleansed_entry_point_name = 0;
        public static final long compiler_set_execution_mode = 0;
        public static final long compiler_unset_execution_mode = 0;
        public static final long compiler_set_execution_mode_with_arguments = 0;
        public static final long compiler_get_execution_modes = 0;
        public static final long compiler_get_execution_mode_argument = 0;
        public static final long compiler_get_execution_mode_argument_by_index = 0;
        public static final long compiler_get_execution_model = 0;
        public static final long compiler_update_active_builtins = 0;
        public static final long compiler_has_active_builtin = 0;
        public static final long compiler_get_type_handle = 0;
        public static final long type_get_base_type_id = 0;
        public static final long type_get_basetype = 0;
        public static final long type_get_bit_width = 0;
        public static final long type_get_vector_size = 0;
        public static final long type_get_columns = 0;
        public static final long type_get_num_array_dimensions = 0;
        public static final long type_array_dimension_is_literal = 0;
        public static final long type_get_array_dimension = 0;
        public static final long type_get_num_member_types = 0;
        public static final long type_get_member_type = 0;
        public static final long type_get_storage_class = 0;
        public static final long type_get_image_sampled_type = 0;
        public static final long type_get_image_dimension = 0;
        public static final long type_get_image_is_depth = 0;
        public static final long type_get_image_arrayed = 0;
        public static final long type_get_image_multisampled = 0;
        public static final long type_get_image_is_storage = 0;
        public static final long type_get_image_storage_format = 0;
        public static final long type_get_image_access_qualifier = 0;
        public static final long compiler_get_declared_struct_size = 0;
        public static final long compiler_get_declared_struct_size_runtime_array = 0;
        public static final long compiler_get_declared_struct_member_size = 0;
        public static final long compiler_type_struct_member_offset = 0;
        public static final long compiler_type_struct_member_array_stride = 0;
        public static final long compiler_type_struct_member_matrix_stride = 0;
        public static final long compiler_build_dummy_sampler_for_combined_images = 0;
        public static final long compiler_build_combined_image_samplers = 0;
        public static final long compiler_get_combined_image_samplers = 0;
        public static final long compiler_get_specialization_constants = 0;
        public static final long compiler_get_constant_handle = 0;
        public static final long compiler_get_work_group_size_specialization_constants = 0;
        public static final long compiler_get_active_buffer_ranges = 0;
        public static final long constant_get_scalar_fp16 = 0;
        public static final long constant_get_scalar_fp32 = 0;
        public static final long constant_get_scalar_fp64 = 0;
        public static final long constant_get_scalar_u32 = 0;
        public static final long constant_get_scalar_i32 = 0;
        public static final long constant_get_scalar_u16 = 0;
        public static final long constant_get_scalar_i16 = 0;
        public static final long constant_get_scalar_u8 = 0;
        public static final long constant_get_scalar_i8 = 0;
        public static final long constant_get_subconstants = 0;
        public static final long constant_get_scalar_u64 = 0;
        public static final long constant_get_scalar_i64 = 0;
        public static final long constant_get_type = 0;
        public static final long constant_set_scalar_fp16 = 0;
        public static final long constant_set_scalar_fp32 = 0;
        public static final long constant_set_scalar_fp64 = 0;
        public static final long constant_set_scalar_u32 = 0;
        public static final long constant_set_scalar_i32 = 0;
        public static final long constant_set_scalar_u64 = 0;
        public static final long constant_set_scalar_i64 = 0;
        public static final long constant_set_scalar_u16 = 0;
        public static final long constant_set_scalar_i16 = 0;
        public static final long constant_set_scalar_u8 = 0;
        public static final long constant_set_scalar_i8 = 0;
        public static final long compiler_get_binary_offset_for_decoration = 0;
        public static final long compiler_buffer_is_hlsl_counter_buffer = 0;
        public static final long compiler_buffer_get_hlsl_counter_buffer = 0;
        public static final long compiler_get_declared_capabilities = 0;
        public static final long compiler_get_declared_extensions = 0;
        public static final long compiler_get_remapped_declared_block_name = 0;
        public static final long compiler_get_buffer_block_decorations = 0;

        private Functions() {
                r2 = this;
                r0 = r2
                r0.<init>()
                return
        }

        static {
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.util.spvc.Spvc.access$000()
                java.lang.String r1 = "spvc_get_version"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.util.spvc.Spvc.Functions.get_version = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.util.spvc.Spvc.access$000()
                java.lang.String r1 = "spvc_get_commit_revision_and_timestamp"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.util.spvc.Spvc.Functions.get_commit_revision_and_timestamp = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.util.spvc.Spvc.access$000()
                java.lang.String r1 = "spvc_msl_vertex_attribute_init"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.util.spvc.Spvc.Functions.msl_vertex_attribute_init = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.util.spvc.Spvc.access$000()
                java.lang.String r1 = "spvc_msl_shader_interface_var_init"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.util.spvc.Spvc.Functions.msl_shader_interface_var_init = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.util.spvc.Spvc.access$000()
                java.lang.String r1 = "spvc_msl_shader_input_init"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.util.spvc.Spvc.Functions.msl_shader_input_init = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.util.spvc.Spvc.access$000()
                java.lang.String r1 = "spvc_msl_shader_interface_var_init_2"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.util.spvc.Spvc.Functions.msl_shader_interface_var_init_2 = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.util.spvc.Spvc.access$000()
                java.lang.String r1 = "spvc_msl_resource_binding_init"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.util.spvc.Spvc.Functions.msl_resource_binding_init = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.util.spvc.Spvc.access$000()
                java.lang.String r1 = "spvc_msl_resource_binding_init_2"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.util.spvc.Spvc.Functions.msl_resource_binding_init_2 = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.util.spvc.Spvc.access$000()
                java.lang.String r1 = "spvc_msl_get_aux_buffer_struct_version"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.util.spvc.Spvc.Functions.msl_get_aux_buffer_struct_version = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.util.spvc.Spvc.access$000()
                java.lang.String r1 = "spvc_msl_constexpr_sampler_init"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.util.spvc.Spvc.Functions.msl_constexpr_sampler_init = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.util.spvc.Spvc.access$000()
                java.lang.String r1 = "spvc_msl_sampler_ycbcr_conversion_init"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.util.spvc.Spvc.Functions.msl_sampler_ycbcr_conversion_init = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.util.spvc.Spvc.access$000()
                java.lang.String r1 = "spvc_hlsl_resource_binding_init"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.util.spvc.Spvc.Functions.hlsl_resource_binding_init = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.util.spvc.Spvc.access$000()
                java.lang.String r1 = "spvc_context_create"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.util.spvc.Spvc.Functions.context_create = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.util.spvc.Spvc.access$000()
                java.lang.String r1 = "spvc_context_destroy"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.util.spvc.Spvc.Functions.context_destroy = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.util.spvc.Spvc.access$000()
                java.lang.String r1 = "spvc_context_release_allocations"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.util.spvc.Spvc.Functions.context_release_allocations = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.util.spvc.Spvc.access$000()
                java.lang.String r1 = "spvc_context_get_last_error_string"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.util.spvc.Spvc.Functions.context_get_last_error_string = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.util.spvc.Spvc.access$000()
                java.lang.String r1 = "spvc_context_set_error_callback"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.util.spvc.Spvc.Functions.context_set_error_callback = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.util.spvc.Spvc.access$000()
                java.lang.String r1 = "spvc_context_parse_spirv"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.util.spvc.Spvc.Functions.context_parse_spirv = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.util.spvc.Spvc.access$000()
                java.lang.String r1 = "spvc_context_create_compiler"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.util.spvc.Spvc.Functions.context_create_compiler = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.util.spvc.Spvc.access$000()
                java.lang.String r1 = "spvc_compiler_get_current_id_bound"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.util.spvc.Spvc.Functions.compiler_get_current_id_bound = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.util.spvc.Spvc.access$000()
                java.lang.String r1 = "spvc_compiler_create_compiler_options"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.util.spvc.Spvc.Functions.compiler_create_compiler_options = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.util.spvc.Spvc.access$000()
                java.lang.String r1 = "spvc_compiler_options_set_bool"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.util.spvc.Spvc.Functions.compiler_options_set_bool = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.util.spvc.Spvc.access$000()
                java.lang.String r1 = "spvc_compiler_options_set_uint"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.util.spvc.Spvc.Functions.compiler_options_set_uint = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.util.spvc.Spvc.access$000()
                java.lang.String r1 = "spvc_compiler_install_compiler_options"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.util.spvc.Spvc.Functions.compiler_install_compiler_options = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.util.spvc.Spvc.access$000()
                java.lang.String r1 = "spvc_compiler_compile"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.util.spvc.Spvc.Functions.compiler_compile = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.util.spvc.Spvc.access$000()
                java.lang.String r1 = "spvc_compiler_add_header_line"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.util.spvc.Spvc.Functions.compiler_add_header_line = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.util.spvc.Spvc.access$000()
                java.lang.String r1 = "spvc_compiler_require_extension"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.util.spvc.Spvc.Functions.compiler_require_extension = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.util.spvc.Spvc.access$000()
                java.lang.String r1 = "spvc_compiler_get_num_required_extensions"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.util.spvc.Spvc.Functions.compiler_get_num_required_extensions = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.util.spvc.Spvc.access$000()
                java.lang.String r1 = "spvc_compiler_get_required_extension"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.util.spvc.Spvc.Functions.compiler_get_required_extension = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.util.spvc.Spvc.access$000()
                java.lang.String r1 = "spvc_compiler_flatten_buffer_block"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.util.spvc.Spvc.Functions.compiler_flatten_buffer_block = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.util.spvc.Spvc.access$000()
                java.lang.String r1 = "spvc_compiler_variable_is_depth_or_compare"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.util.spvc.Spvc.Functions.compiler_variable_is_depth_or_compare = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.util.spvc.Spvc.access$000()
                java.lang.String r1 = "spvc_compiler_mask_stage_output_by_location"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.util.spvc.Spvc.Functions.compiler_mask_stage_output_by_location = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.util.spvc.Spvc.access$000()
                java.lang.String r1 = "spvc_compiler_mask_stage_output_by_builtin"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.util.spvc.Spvc.Functions.compiler_mask_stage_output_by_builtin = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.util.spvc.Spvc.access$000()
                java.lang.String r1 = "spvc_compiler_hlsl_set_root_constants_layout"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.util.spvc.Spvc.Functions.compiler_hlsl_set_root_constants_layout = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.util.spvc.Spvc.access$000()
                java.lang.String r1 = "spvc_compiler_hlsl_add_vertex_attribute_remap"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.util.spvc.Spvc.Functions.compiler_hlsl_add_vertex_attribute_remap = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.util.spvc.Spvc.access$000()
                java.lang.String r1 = "spvc_compiler_hlsl_remap_num_workgroups_builtin"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.util.spvc.Spvc.Functions.compiler_hlsl_remap_num_workgroups_builtin = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.util.spvc.Spvc.access$000()
                java.lang.String r1 = "spvc_compiler_hlsl_set_resource_binding_flags"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.util.spvc.Spvc.Functions.compiler_hlsl_set_resource_binding_flags = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.util.spvc.Spvc.access$000()
                java.lang.String r1 = "spvc_compiler_hlsl_add_resource_binding"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.util.spvc.Spvc.Functions.compiler_hlsl_add_resource_binding = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.util.spvc.Spvc.access$000()
                java.lang.String r1 = "spvc_compiler_hlsl_is_resource_used"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.util.spvc.Spvc.Functions.compiler_hlsl_is_resource_used = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.util.spvc.Spvc.access$000()
                java.lang.String r1 = "spvc_compiler_msl_is_rasterization_disabled"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.util.spvc.Spvc.Functions.compiler_msl_is_rasterization_disabled = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.util.spvc.Spvc.access$000()
                java.lang.String r1 = "spvc_compiler_msl_needs_swizzle_buffer"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.util.spvc.Spvc.Functions.compiler_msl_needs_swizzle_buffer = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.util.spvc.Spvc.access$000()
                java.lang.String r1 = "spvc_compiler_msl_needs_buffer_size_buffer"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.util.spvc.Spvc.Functions.compiler_msl_needs_buffer_size_buffer = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.util.spvc.Spvc.access$000()
                java.lang.String r1 = "spvc_compiler_msl_needs_output_buffer"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.util.spvc.Spvc.Functions.compiler_msl_needs_output_buffer = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.util.spvc.Spvc.access$000()
                java.lang.String r1 = "spvc_compiler_msl_needs_patch_output_buffer"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.util.spvc.Spvc.Functions.compiler_msl_needs_patch_output_buffer = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.util.spvc.Spvc.access$000()
                java.lang.String r1 = "spvc_compiler_msl_needs_input_threadgroup_mem"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.util.spvc.Spvc.Functions.compiler_msl_needs_input_threadgroup_mem = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.util.spvc.Spvc.access$000()
                java.lang.String r1 = "spvc_compiler_msl_add_vertex_attribute"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.util.spvc.Spvc.Functions.compiler_msl_add_vertex_attribute = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.util.spvc.Spvc.access$000()
                java.lang.String r1 = "spvc_compiler_msl_add_resource_binding"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.util.spvc.Spvc.Functions.compiler_msl_add_resource_binding = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.util.spvc.Spvc.access$000()
                java.lang.String r1 = "spvc_compiler_msl_add_resource_binding_2"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.util.spvc.Spvc.Functions.compiler_msl_add_resource_binding_2 = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.util.spvc.Spvc.access$000()
                java.lang.String r1 = "spvc_compiler_msl_add_shader_input"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.util.spvc.Spvc.Functions.compiler_msl_add_shader_input = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.util.spvc.Spvc.access$000()
                java.lang.String r1 = "spvc_compiler_msl_add_shader_input_2"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.util.spvc.Spvc.Functions.compiler_msl_add_shader_input_2 = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.util.spvc.Spvc.access$000()
                java.lang.String r1 = "spvc_compiler_msl_add_shader_output"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.util.spvc.Spvc.Functions.compiler_msl_add_shader_output = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.util.spvc.Spvc.access$000()
                java.lang.String r1 = "spvc_compiler_msl_add_shader_output_2"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.util.spvc.Spvc.Functions.compiler_msl_add_shader_output_2 = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.util.spvc.Spvc.access$000()
                java.lang.String r1 = "spvc_compiler_msl_add_discrete_descriptor_set"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.util.spvc.Spvc.Functions.compiler_msl_add_discrete_descriptor_set = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.util.spvc.Spvc.access$000()
                java.lang.String r1 = "spvc_compiler_msl_set_argument_buffer_device_address_space"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.util.spvc.Spvc.Functions.compiler_msl_set_argument_buffer_device_address_space = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.util.spvc.Spvc.access$000()
                java.lang.String r1 = "spvc_compiler_msl_is_vertex_attribute_used"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.util.spvc.Spvc.Functions.compiler_msl_is_vertex_attribute_used = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.util.spvc.Spvc.access$000()
                java.lang.String r1 = "spvc_compiler_msl_is_shader_input_used"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.util.spvc.Spvc.Functions.compiler_msl_is_shader_input_used = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.util.spvc.Spvc.access$000()
                java.lang.String r1 = "spvc_compiler_msl_is_shader_output_used"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.util.spvc.Spvc.Functions.compiler_msl_is_shader_output_used = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.util.spvc.Spvc.access$000()
                java.lang.String r1 = "spvc_compiler_msl_is_resource_used"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.util.spvc.Spvc.Functions.compiler_msl_is_resource_used = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.util.spvc.Spvc.access$000()
                java.lang.String r1 = "spvc_compiler_msl_remap_constexpr_sampler"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.util.spvc.Spvc.Functions.compiler_msl_remap_constexpr_sampler = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.util.spvc.Spvc.access$000()
                java.lang.String r1 = "spvc_compiler_msl_remap_constexpr_sampler_by_binding"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.util.spvc.Spvc.Functions.compiler_msl_remap_constexpr_sampler_by_binding = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.util.spvc.Spvc.access$000()
                java.lang.String r1 = "spvc_compiler_msl_remap_constexpr_sampler_ycbcr"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.util.spvc.Spvc.Functions.compiler_msl_remap_constexpr_sampler_ycbcr = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.util.spvc.Spvc.access$000()
                java.lang.String r1 = "spvc_compiler_msl_remap_constexpr_sampler_by_binding_ycbcr"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.util.spvc.Spvc.Functions.compiler_msl_remap_constexpr_sampler_by_binding_ycbcr = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.util.spvc.Spvc.access$000()
                java.lang.String r1 = "spvc_compiler_msl_set_fragment_output_components"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.util.spvc.Spvc.Functions.compiler_msl_set_fragment_output_components = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.util.spvc.Spvc.access$000()
                java.lang.String r1 = "spvc_compiler_msl_get_automatic_resource_binding"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.util.spvc.Spvc.Functions.compiler_msl_get_automatic_resource_binding = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.util.spvc.Spvc.access$000()
                java.lang.String r1 = "spvc_compiler_msl_get_automatic_resource_binding_secondary"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.util.spvc.Spvc.Functions.compiler_msl_get_automatic_resource_binding_secondary = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.util.spvc.Spvc.access$000()
                java.lang.String r1 = "spvc_compiler_msl_add_dynamic_buffer"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.util.spvc.Spvc.Functions.compiler_msl_add_dynamic_buffer = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.util.spvc.Spvc.access$000()
                java.lang.String r1 = "spvc_compiler_msl_add_inline_uniform_block"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.util.spvc.Spvc.Functions.compiler_msl_add_inline_uniform_block = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.util.spvc.Spvc.access$000()
                java.lang.String r1 = "spvc_compiler_msl_set_combined_sampler_suffix"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.util.spvc.Spvc.Functions.compiler_msl_set_combined_sampler_suffix = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.util.spvc.Spvc.access$000()
                java.lang.String r1 = "spvc_compiler_msl_get_combined_sampler_suffix"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.util.spvc.Spvc.Functions.compiler_msl_get_combined_sampler_suffix = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.util.spvc.Spvc.access$000()
                java.lang.String r1 = "spvc_compiler_get_active_interface_variables"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.util.spvc.Spvc.Functions.compiler_get_active_interface_variables = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.util.spvc.Spvc.access$000()
                java.lang.String r1 = "spvc_compiler_set_enabled_interface_variables"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.util.spvc.Spvc.Functions.compiler_set_enabled_interface_variables = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.util.spvc.Spvc.access$000()
                java.lang.String r1 = "spvc_compiler_create_shader_resources"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.util.spvc.Spvc.Functions.compiler_create_shader_resources = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.util.spvc.Spvc.access$000()
                java.lang.String r1 = "spvc_compiler_create_shader_resources_for_active_variables"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.util.spvc.Spvc.Functions.compiler_create_shader_resources_for_active_variables = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.util.spvc.Spvc.access$000()
                java.lang.String r1 = "spvc_resources_get_resource_list_for_type"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.util.spvc.Spvc.Functions.resources_get_resource_list_for_type = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.util.spvc.Spvc.access$000()
                java.lang.String r1 = "spvc_resources_get_builtin_resource_list_for_type"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.util.spvc.Spvc.Functions.resources_get_builtin_resource_list_for_type = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.util.spvc.Spvc.access$000()
                java.lang.String r1 = "spvc_compiler_set_decoration"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.util.spvc.Spvc.Functions.compiler_set_decoration = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.util.spvc.Spvc.access$000()
                java.lang.String r1 = "spvc_compiler_set_decoration_string"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.util.spvc.Spvc.Functions.compiler_set_decoration_string = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.util.spvc.Spvc.access$000()
                java.lang.String r1 = "spvc_compiler_set_name"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.util.spvc.Spvc.Functions.compiler_set_name = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.util.spvc.Spvc.access$000()
                java.lang.String r1 = "spvc_compiler_set_member_decoration"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.util.spvc.Spvc.Functions.compiler_set_member_decoration = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.util.spvc.Spvc.access$000()
                java.lang.String r1 = "spvc_compiler_set_member_decoration_string"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.util.spvc.Spvc.Functions.compiler_set_member_decoration_string = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.util.spvc.Spvc.access$000()
                java.lang.String r1 = "spvc_compiler_set_member_name"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.util.spvc.Spvc.Functions.compiler_set_member_name = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.util.spvc.Spvc.access$000()
                java.lang.String r1 = "spvc_compiler_unset_decoration"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.util.spvc.Spvc.Functions.compiler_unset_decoration = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.util.spvc.Spvc.access$000()
                java.lang.String r1 = "spvc_compiler_unset_member_decoration"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.util.spvc.Spvc.Functions.compiler_unset_member_decoration = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.util.spvc.Spvc.access$000()
                java.lang.String r1 = "spvc_compiler_has_decoration"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.util.spvc.Spvc.Functions.compiler_has_decoration = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.util.spvc.Spvc.access$000()
                java.lang.String r1 = "spvc_compiler_has_member_decoration"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.util.spvc.Spvc.Functions.compiler_has_member_decoration = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.util.spvc.Spvc.access$000()
                java.lang.String r1 = "spvc_compiler_get_name"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.util.spvc.Spvc.Functions.compiler_get_name = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.util.spvc.Spvc.access$000()
                java.lang.String r1 = "spvc_compiler_get_decoration"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.util.spvc.Spvc.Functions.compiler_get_decoration = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.util.spvc.Spvc.access$000()
                java.lang.String r1 = "spvc_compiler_get_decoration_string"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.util.spvc.Spvc.Functions.compiler_get_decoration_string = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.util.spvc.Spvc.access$000()
                java.lang.String r1 = "spvc_compiler_get_member_decoration"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.util.spvc.Spvc.Functions.compiler_get_member_decoration = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.util.spvc.Spvc.access$000()
                java.lang.String r1 = "spvc_compiler_get_member_decoration_string"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.util.spvc.Spvc.Functions.compiler_get_member_decoration_string = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.util.spvc.Spvc.access$000()
                java.lang.String r1 = "spvc_compiler_get_member_name"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.util.spvc.Spvc.Functions.compiler_get_member_name = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.util.spvc.Spvc.access$000()
                java.lang.String r1 = "spvc_compiler_get_entry_points"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.util.spvc.Spvc.Functions.compiler_get_entry_points = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.util.spvc.Spvc.access$000()
                java.lang.String r1 = "spvc_compiler_set_entry_point"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.util.spvc.Spvc.Functions.compiler_set_entry_point = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.util.spvc.Spvc.access$000()
                java.lang.String r1 = "spvc_compiler_rename_entry_point"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.util.spvc.Spvc.Functions.compiler_rename_entry_point = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.util.spvc.Spvc.access$000()
                java.lang.String r1 = "spvc_compiler_get_cleansed_entry_point_name"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.util.spvc.Spvc.Functions.compiler_get_cleansed_entry_point_name = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.util.spvc.Spvc.access$000()
                java.lang.String r1 = "spvc_compiler_set_execution_mode"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.util.spvc.Spvc.Functions.compiler_set_execution_mode = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.util.spvc.Spvc.access$000()
                java.lang.String r1 = "spvc_compiler_unset_execution_mode"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.util.spvc.Spvc.Functions.compiler_unset_execution_mode = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.util.spvc.Spvc.access$000()
                java.lang.String r1 = "spvc_compiler_set_execution_mode_with_arguments"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.util.spvc.Spvc.Functions.compiler_set_execution_mode_with_arguments = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.util.spvc.Spvc.access$000()
                java.lang.String r1 = "spvc_compiler_get_execution_modes"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.util.spvc.Spvc.Functions.compiler_get_execution_modes = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.util.spvc.Spvc.access$000()
                java.lang.String r1 = "spvc_compiler_get_execution_mode_argument"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.util.spvc.Spvc.Functions.compiler_get_execution_mode_argument = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.util.spvc.Spvc.access$000()
                java.lang.String r1 = "spvc_compiler_get_execution_mode_argument_by_index"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.util.spvc.Spvc.Functions.compiler_get_execution_mode_argument_by_index = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.util.spvc.Spvc.access$000()
                java.lang.String r1 = "spvc_compiler_get_execution_model"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.util.spvc.Spvc.Functions.compiler_get_execution_model = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.util.spvc.Spvc.access$000()
                java.lang.String r1 = "spvc_compiler_update_active_builtins"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.util.spvc.Spvc.Functions.compiler_update_active_builtins = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.util.spvc.Spvc.access$000()
                java.lang.String r1 = "spvc_compiler_has_active_builtin"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.util.spvc.Spvc.Functions.compiler_has_active_builtin = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.util.spvc.Spvc.access$000()
                java.lang.String r1 = "spvc_compiler_get_type_handle"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.util.spvc.Spvc.Functions.compiler_get_type_handle = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.util.spvc.Spvc.access$000()
                java.lang.String r1 = "spvc_type_get_base_type_id"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.util.spvc.Spvc.Functions.type_get_base_type_id = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.util.spvc.Spvc.access$000()
                java.lang.String r1 = "spvc_type_get_basetype"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.util.spvc.Spvc.Functions.type_get_basetype = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.util.spvc.Spvc.access$000()
                java.lang.String r1 = "spvc_type_get_bit_width"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.util.spvc.Spvc.Functions.type_get_bit_width = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.util.spvc.Spvc.access$000()
                java.lang.String r1 = "spvc_type_get_vector_size"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.util.spvc.Spvc.Functions.type_get_vector_size = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.util.spvc.Spvc.access$000()
                java.lang.String r1 = "spvc_type_get_columns"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.util.spvc.Spvc.Functions.type_get_columns = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.util.spvc.Spvc.access$000()
                java.lang.String r1 = "spvc_type_get_num_array_dimensions"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.util.spvc.Spvc.Functions.type_get_num_array_dimensions = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.util.spvc.Spvc.access$000()
                java.lang.String r1 = "spvc_type_array_dimension_is_literal"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.util.spvc.Spvc.Functions.type_array_dimension_is_literal = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.util.spvc.Spvc.access$000()
                java.lang.String r1 = "spvc_type_get_array_dimension"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.util.spvc.Spvc.Functions.type_get_array_dimension = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.util.spvc.Spvc.access$000()
                java.lang.String r1 = "spvc_type_get_num_member_types"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.util.spvc.Spvc.Functions.type_get_num_member_types = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.util.spvc.Spvc.access$000()
                java.lang.String r1 = "spvc_type_get_member_type"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.util.spvc.Spvc.Functions.type_get_member_type = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.util.spvc.Spvc.access$000()
                java.lang.String r1 = "spvc_type_get_storage_class"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.util.spvc.Spvc.Functions.type_get_storage_class = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.util.spvc.Spvc.access$000()
                java.lang.String r1 = "spvc_type_get_image_sampled_type"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.util.spvc.Spvc.Functions.type_get_image_sampled_type = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.util.spvc.Spvc.access$000()
                java.lang.String r1 = "spvc_type_get_image_dimension"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.util.spvc.Spvc.Functions.type_get_image_dimension = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.util.spvc.Spvc.access$000()
                java.lang.String r1 = "spvc_type_get_image_is_depth"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.util.spvc.Spvc.Functions.type_get_image_is_depth = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.util.spvc.Spvc.access$000()
                java.lang.String r1 = "spvc_type_get_image_arrayed"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.util.spvc.Spvc.Functions.type_get_image_arrayed = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.util.spvc.Spvc.access$000()
                java.lang.String r1 = "spvc_type_get_image_multisampled"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.util.spvc.Spvc.Functions.type_get_image_multisampled = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.util.spvc.Spvc.access$000()
                java.lang.String r1 = "spvc_type_get_image_is_storage"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.util.spvc.Spvc.Functions.type_get_image_is_storage = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.util.spvc.Spvc.access$000()
                java.lang.String r1 = "spvc_type_get_image_storage_format"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.util.spvc.Spvc.Functions.type_get_image_storage_format = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.util.spvc.Spvc.access$000()
                java.lang.String r1 = "spvc_type_get_image_access_qualifier"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.util.spvc.Spvc.Functions.type_get_image_access_qualifier = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.util.spvc.Spvc.access$000()
                java.lang.String r1 = "spvc_compiler_get_declared_struct_size"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.util.spvc.Spvc.Functions.compiler_get_declared_struct_size = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.util.spvc.Spvc.access$000()
                java.lang.String r1 = "spvc_compiler_get_declared_struct_size_runtime_array"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.util.spvc.Spvc.Functions.compiler_get_declared_struct_size_runtime_array = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.util.spvc.Spvc.access$000()
                java.lang.String r1 = "spvc_compiler_get_declared_struct_member_size"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.util.spvc.Spvc.Functions.compiler_get_declared_struct_member_size = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.util.spvc.Spvc.access$000()
                java.lang.String r1 = "spvc_compiler_type_struct_member_offset"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.util.spvc.Spvc.Functions.compiler_type_struct_member_offset = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.util.spvc.Spvc.access$000()
                java.lang.String r1 = "spvc_compiler_type_struct_member_array_stride"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.util.spvc.Spvc.Functions.compiler_type_struct_member_array_stride = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.util.spvc.Spvc.access$000()
                java.lang.String r1 = "spvc_compiler_type_struct_member_matrix_stride"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.util.spvc.Spvc.Functions.compiler_type_struct_member_matrix_stride = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.util.spvc.Spvc.access$000()
                java.lang.String r1 = "spvc_compiler_build_dummy_sampler_for_combined_images"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.util.spvc.Spvc.Functions.compiler_build_dummy_sampler_for_combined_images = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.util.spvc.Spvc.access$000()
                java.lang.String r1 = "spvc_compiler_build_combined_image_samplers"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.util.spvc.Spvc.Functions.compiler_build_combined_image_samplers = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.util.spvc.Spvc.access$000()
                java.lang.String r1 = "spvc_compiler_get_combined_image_samplers"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.util.spvc.Spvc.Functions.compiler_get_combined_image_samplers = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.util.spvc.Spvc.access$000()
                java.lang.String r1 = "spvc_compiler_get_specialization_constants"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.util.spvc.Spvc.Functions.compiler_get_specialization_constants = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.util.spvc.Spvc.access$000()
                java.lang.String r1 = "spvc_compiler_get_constant_handle"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.util.spvc.Spvc.Functions.compiler_get_constant_handle = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.util.spvc.Spvc.access$000()
                java.lang.String r1 = "spvc_compiler_get_work_group_size_specialization_constants"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.util.spvc.Spvc.Functions.compiler_get_work_group_size_specialization_constants = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.util.spvc.Spvc.access$000()
                java.lang.String r1 = "spvc_compiler_get_active_buffer_ranges"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.util.spvc.Spvc.Functions.compiler_get_active_buffer_ranges = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.util.spvc.Spvc.access$000()
                java.lang.String r1 = "spvc_constant_get_scalar_fp16"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.util.spvc.Spvc.Functions.constant_get_scalar_fp16 = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.util.spvc.Spvc.access$000()
                java.lang.String r1 = "spvc_constant_get_scalar_fp32"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.util.spvc.Spvc.Functions.constant_get_scalar_fp32 = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.util.spvc.Spvc.access$000()
                java.lang.String r1 = "spvc_constant_get_scalar_fp64"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.util.spvc.Spvc.Functions.constant_get_scalar_fp64 = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.util.spvc.Spvc.access$000()
                java.lang.String r1 = "spvc_constant_get_scalar_u32"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.util.spvc.Spvc.Functions.constant_get_scalar_u32 = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.util.spvc.Spvc.access$000()
                java.lang.String r1 = "spvc_constant_get_scalar_i32"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.util.spvc.Spvc.Functions.constant_get_scalar_i32 = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.util.spvc.Spvc.access$000()
                java.lang.String r1 = "spvc_constant_get_scalar_u16"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.util.spvc.Spvc.Functions.constant_get_scalar_u16 = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.util.spvc.Spvc.access$000()
                java.lang.String r1 = "spvc_constant_get_scalar_i16"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.util.spvc.Spvc.Functions.constant_get_scalar_i16 = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.util.spvc.Spvc.access$000()
                java.lang.String r1 = "spvc_constant_get_scalar_u8"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.util.spvc.Spvc.Functions.constant_get_scalar_u8 = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.util.spvc.Spvc.access$000()
                java.lang.String r1 = "spvc_constant_get_scalar_i8"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.util.spvc.Spvc.Functions.constant_get_scalar_i8 = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.util.spvc.Spvc.access$000()
                java.lang.String r1 = "spvc_constant_get_subconstants"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.util.spvc.Spvc.Functions.constant_get_subconstants = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.util.spvc.Spvc.access$000()
                java.lang.String r1 = "spvc_constant_get_scalar_u64"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.util.spvc.Spvc.Functions.constant_get_scalar_u64 = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.util.spvc.Spvc.access$000()
                java.lang.String r1 = "spvc_constant_get_scalar_i64"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.util.spvc.Spvc.Functions.constant_get_scalar_i64 = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.util.spvc.Spvc.access$000()
                java.lang.String r1 = "spvc_constant_get_type"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.util.spvc.Spvc.Functions.constant_get_type = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.util.spvc.Spvc.access$000()
                java.lang.String r1 = "spvc_constant_set_scalar_fp16"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.util.spvc.Spvc.Functions.constant_set_scalar_fp16 = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.util.spvc.Spvc.access$000()
                java.lang.String r1 = "spvc_constant_set_scalar_fp32"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.util.spvc.Spvc.Functions.constant_set_scalar_fp32 = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.util.spvc.Spvc.access$000()
                java.lang.String r1 = "spvc_constant_set_scalar_fp64"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.util.spvc.Spvc.Functions.constant_set_scalar_fp64 = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.util.spvc.Spvc.access$000()
                java.lang.String r1 = "spvc_constant_set_scalar_u32"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.util.spvc.Spvc.Functions.constant_set_scalar_u32 = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.util.spvc.Spvc.access$000()
                java.lang.String r1 = "spvc_constant_set_scalar_i32"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.util.spvc.Spvc.Functions.constant_set_scalar_i32 = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.util.spvc.Spvc.access$000()
                java.lang.String r1 = "spvc_constant_set_scalar_u64"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.util.spvc.Spvc.Functions.constant_set_scalar_u64 = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.util.spvc.Spvc.access$000()
                java.lang.String r1 = "spvc_constant_set_scalar_i64"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.util.spvc.Spvc.Functions.constant_set_scalar_i64 = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.util.spvc.Spvc.access$000()
                java.lang.String r1 = "spvc_constant_set_scalar_u16"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.util.spvc.Spvc.Functions.constant_set_scalar_u16 = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.util.spvc.Spvc.access$000()
                java.lang.String r1 = "spvc_constant_set_scalar_i16"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.util.spvc.Spvc.Functions.constant_set_scalar_i16 = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.util.spvc.Spvc.access$000()
                java.lang.String r1 = "spvc_constant_set_scalar_u8"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.util.spvc.Spvc.Functions.constant_set_scalar_u8 = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.util.spvc.Spvc.access$000()
                java.lang.String r1 = "spvc_constant_set_scalar_i8"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.util.spvc.Spvc.Functions.constant_set_scalar_i8 = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.util.spvc.Spvc.access$000()
                java.lang.String r1 = "spvc_compiler_get_binary_offset_for_decoration"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.util.spvc.Spvc.Functions.compiler_get_binary_offset_for_decoration = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.util.spvc.Spvc.access$000()
                java.lang.String r1 = "spvc_compiler_buffer_is_hlsl_counter_buffer"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.util.spvc.Spvc.Functions.compiler_buffer_is_hlsl_counter_buffer = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.util.spvc.Spvc.access$000()
                java.lang.String r1 = "spvc_compiler_buffer_get_hlsl_counter_buffer"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.util.spvc.Spvc.Functions.compiler_buffer_get_hlsl_counter_buffer = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.util.spvc.Spvc.access$000()
                java.lang.String r1 = "spvc_compiler_get_declared_capabilities"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.util.spvc.Spvc.Functions.compiler_get_declared_capabilities = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.util.spvc.Spvc.access$000()
                java.lang.String r1 = "spvc_compiler_get_declared_extensions"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.util.spvc.Spvc.Functions.compiler_get_declared_extensions = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.util.spvc.Spvc.access$000()
                java.lang.String r1 = "spvc_compiler_get_remapped_declared_block_name"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.util.spvc.Spvc.Functions.compiler_get_remapped_declared_block_name = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.util.spvc.Spvc.access$000()
                java.lang.String r1 = "spvc_compiler_get_buffer_block_decorations"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.util.spvc.Spvc.Functions.compiler_get_buffer_block_decorations = r0
                return
        }
    }

    public static org.lwjgl.system.SharedLibrary getLibrary() {
            org.lwjgl.system.SharedLibrary r0 = org.lwjgl.util.spvc.Spvc.SPVC
            return r0
    }

    protected Spvc() {
            r3 = this;
            r0 = r3
            r0.<init>()
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r1 = r0
            r1.<init>()
            throw r0
    }

    public static void nspvc_get_version(long r9, long r11, long r13) {
            long r0 = org.lwjgl.util.spvc.Spvc.Functions.get_version
            r15 = r0
            r0 = r9
            r1 = r11
            r2 = r13
            r3 = r15
            org.lwjgl.system.JNI.invokePPPV(r0, r1, r2, r3)
            return
    }

    public static void spvc_get_version(@org.lwjgl.system.NativeType("unsigned int *") java.nio.IntBuffer r7, @org.lwjgl.system.NativeType("unsigned int *") java.nio.IntBuffer r8, @org.lwjgl.system.NativeType("unsigned int *") java.nio.IntBuffer r9) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L15
            r0 = r7
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
            r0 = r8
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
            r0 = r9
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
        L15:
            r0 = r7
            long r0 = org.lwjgl.system.MemoryUtil.memAddress(r0)
            r1 = r8
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            r2 = r9
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            nspvc_get_version(r0, r1, r2)
            return
    }

    public static long nspvc_get_commit_revision_and_timestamp() {
            long r0 = org.lwjgl.util.spvc.Spvc.Functions.get_commit_revision_and_timestamp
            r3 = r0
            r0 = r3
            long r0 = org.lwjgl.system.JNI.invokeP(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("char const *")
    public static java.lang.String spvc_get_commit_revision_and_timestamp() {
            long r0 = nspvc_get_commit_revision_and_timestamp()
            r3 = r0
            r0 = r3
            java.lang.String r0 = org.lwjgl.system.MemoryUtil.memUTF8Safe(r0)
            return r0
    }

    public static void nspvc_msl_vertex_attribute_init(long r5) {
            long r0 = org.lwjgl.util.spvc.Spvc.Functions.msl_vertex_attribute_init
            r7 = r0
            r0 = r5
            r1 = r7
            org.lwjgl.system.JNI.invokePV(r0, r1)
            return
    }

    public static void spvc_msl_vertex_attribute_init(@org.lwjgl.system.NativeType("spvc_msl_vertex_attribute *") org.lwjgl.util.spvc.SpvcMslVertexAttribute r3) {
            r0 = r3
            long r0 = r0.address()
            nspvc_msl_vertex_attribute_init(r0)
            return
    }

    public static void nspvc_msl_shader_interface_var_init(long r5) {
            long r0 = org.lwjgl.util.spvc.Spvc.Functions.msl_shader_interface_var_init
            r7 = r0
            r0 = r5
            r1 = r7
            org.lwjgl.system.JNI.invokePV(r0, r1)
            return
    }

    public static void spvc_msl_shader_interface_var_init(@org.lwjgl.system.NativeType("spvc_msl_shader_interface_var *") org.lwjgl.util.spvc.SpvcMslShaderInterfaceVar r3) {
            r0 = r3
            long r0 = r0.address()
            nspvc_msl_shader_interface_var_init(r0)
            return
    }

    public static void nspvc_msl_shader_input_init(long r5) {
            long r0 = org.lwjgl.util.spvc.Spvc.Functions.msl_shader_input_init
            r7 = r0
            r0 = r5
            r1 = r7
            org.lwjgl.system.JNI.invokePV(r0, r1)
            return
    }

    public static void spvc_msl_shader_input_init(@org.lwjgl.system.NativeType("spvc_msl_shader_input *") org.lwjgl.util.spvc.SpvcMslShaderInput r3) {
            r0 = r3
            long r0 = r0.address()
            nspvc_msl_shader_input_init(r0)
            return
    }

    public static void nspvc_msl_shader_interface_var_init_2(long r5) {
            long r0 = org.lwjgl.util.spvc.Spvc.Functions.msl_shader_interface_var_init_2
            r7 = r0
            r0 = r5
            r1 = r7
            org.lwjgl.system.JNI.invokePV(r0, r1)
            return
    }

    public static void spvc_msl_shader_interface_var_init_2(@org.lwjgl.system.NativeType("spvc_msl_shader_interface_var_2 *") org.lwjgl.util.spvc.SpvcMslShaderInterfaceVar2 r3) {
            r0 = r3
            long r0 = r0.address()
            nspvc_msl_shader_interface_var_init_2(r0)
            return
    }

    public static void nspvc_msl_resource_binding_init(long r5) {
            long r0 = org.lwjgl.util.spvc.Spvc.Functions.msl_resource_binding_init
            r7 = r0
            r0 = r5
            r1 = r7
            org.lwjgl.system.JNI.invokePV(r0, r1)
            return
    }

    public static void spvc_msl_resource_binding_init(@org.lwjgl.system.NativeType("spvc_msl_resource_binding *") org.lwjgl.util.spvc.SpvcMslResourceBinding r3) {
            r0 = r3
            long r0 = r0.address()
            nspvc_msl_resource_binding_init(r0)
            return
    }

    public static void nspvc_msl_resource_binding_init_2(long r5) {
            long r0 = org.lwjgl.util.spvc.Spvc.Functions.msl_resource_binding_init_2
            r7 = r0
            r0 = r5
            r1 = r7
            org.lwjgl.system.JNI.invokePV(r0, r1)
            return
    }

    public static void spvc_msl_resource_binding_init_2(@org.lwjgl.system.NativeType("spvc_msl_resource_binding_2 *") org.lwjgl.util.spvc.SpvcMslResourceBinding2 r3) {
            r0 = r3
            long r0 = r0.address()
            nspvc_msl_resource_binding_init_2(r0)
            return
    }

    @org.lwjgl.system.NativeType("unsigned int")
    public static int spvc_msl_get_aux_buffer_struct_version() {
            long r0 = org.lwjgl.util.spvc.Spvc.Functions.msl_get_aux_buffer_struct_version
            r3 = r0
            r0 = r3
            int r0 = org.lwjgl.system.JNI.invokeI(r0)
            return r0
    }

    public static void nspvc_msl_constexpr_sampler_init(long r5) {
            long r0 = org.lwjgl.util.spvc.Spvc.Functions.msl_constexpr_sampler_init
            r7 = r0
            r0 = r5
            r1 = r7
            org.lwjgl.system.JNI.invokePV(r0, r1)
            return
    }

    public static void spvc_msl_constexpr_sampler_init(@org.lwjgl.system.NativeType("spvc_msl_constexpr_sampler *") org.lwjgl.util.spvc.SpvcMslConstexprSampler r3) {
            r0 = r3
            long r0 = r0.address()
            nspvc_msl_constexpr_sampler_init(r0)
            return
    }

    public static void nspvc_msl_sampler_ycbcr_conversion_init(long r5) {
            long r0 = org.lwjgl.util.spvc.Spvc.Functions.msl_sampler_ycbcr_conversion_init
            r7 = r0
            r0 = r5
            r1 = r7
            org.lwjgl.system.JNI.invokePV(r0, r1)
            return
    }

    public static void spvc_msl_sampler_ycbcr_conversion_init(@org.lwjgl.system.NativeType("spvc_msl_sampler_ycbcr_conversion *") org.lwjgl.util.spvc.SpvcMslSamplerYcbcrConversion r3) {
            r0 = r3
            long r0 = r0.address()
            nspvc_msl_sampler_ycbcr_conversion_init(r0)
            return
    }

    public static void nspvc_hlsl_resource_binding_init(long r5) {
            long r0 = org.lwjgl.util.spvc.Spvc.Functions.hlsl_resource_binding_init
            r7 = r0
            r0 = r5
            r1 = r7
            org.lwjgl.system.JNI.invokePV(r0, r1)
            return
    }

    public static void spvc_hlsl_resource_binding_init(@org.lwjgl.system.NativeType("spvc_hlsl_resource_binding *") org.lwjgl.util.spvc.SpvcHLSLResourceBinding r3) {
            r0 = r3
            long r0 = r0.address()
            nspvc_hlsl_resource_binding_init(r0)
            return
    }

    public static int nspvc_context_create(long r5) {
            long r0 = org.lwjgl.util.spvc.Spvc.Functions.context_create
            r7 = r0
            r0 = r5
            r1 = r7
            int r0 = org.lwjgl.system.JNI.invokePI(r0, r1)
            return r0
    }

    @org.lwjgl.system.NativeType("spvc_result")
    public static int spvc_context_create(@org.lwjgl.system.NativeType("spvc_context *") org.lwjgl.PointerBuffer r3) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r3
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
        Lb:
            r0 = r3
            long r0 = org.lwjgl.system.MemoryUtil.memAddress(r0)
            int r0 = nspvc_context_create(r0)
            return r0
    }

    public static void spvc_context_destroy(@org.lwjgl.system.NativeType("spvc_context") long r5) {
            long r0 = org.lwjgl.util.spvc.Spvc.Functions.context_destroy
            r7 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lf
            r0 = r5
            long r0 = org.lwjgl.system.Checks.check(r0)
        Lf:
            r0 = r5
            r1 = r7
            org.lwjgl.system.JNI.invokePV(r0, r1)
            return
    }

    public static void spvc_context_release_allocations(@org.lwjgl.system.NativeType("spvc_context") long r5) {
            long r0 = org.lwjgl.util.spvc.Spvc.Functions.context_release_allocations
            r7 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lf
            r0 = r5
            long r0 = org.lwjgl.system.Checks.check(r0)
        Lf:
            r0 = r5
            r1 = r7
            org.lwjgl.system.JNI.invokePV(r0, r1)
            return
    }

    public static long nspvc_context_get_last_error_string(long r5) {
            long r0 = org.lwjgl.util.spvc.Spvc.Functions.context_get_last_error_string
            r7 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lf
            r0 = r5
            long r0 = org.lwjgl.system.Checks.check(r0)
        Lf:
            r0 = r5
            r1 = r7
            long r0 = org.lwjgl.system.JNI.invokePP(r0, r1)
            return r0
    }

    @org.lwjgl.system.NativeType("char const *")
    public static java.lang.String spvc_context_get_last_error_string(@org.lwjgl.system.NativeType("spvc_context") long r3) {
            r0 = r3
            long r0 = nspvc_context_get_last_error_string(r0)
            r5 = r0
            r0 = r5
            java.lang.String r0 = org.lwjgl.system.MemoryUtil.memUTF8Safe(r0)
            return r0
    }

    public static void nspvc_context_set_error_callback(long r9, long r11, long r13) {
            long r0 = org.lwjgl.util.spvc.Spvc.Functions.context_set_error_callback
            r15 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L10
            r0 = r9
            long r0 = org.lwjgl.system.Checks.check(r0)
        L10:
            r0 = r9
            r1 = r11
            r2 = r13
            r3 = r15
            org.lwjgl.system.JNI.invokePPPV(r0, r1, r2, r3)
            return
    }

    public static void spvc_context_set_error_callback(@org.lwjgl.system.NativeType("spvc_context") long r7, @org.lwjgl.system.NativeType("spvc_error_callback") org.lwjgl.util.spvc.SpvcErrorCallbackI r9, @org.lwjgl.system.NativeType("void *") long r10) {
            r0 = r7
            r1 = r9
            long r1 = r1.address()
            r2 = r10
            nspvc_context_set_error_callback(r0, r1, r2)
            return
    }

    public static int nspvc_context_parse_spirv(long r11, long r13, long r15, long r17) {
            long r0 = org.lwjgl.util.spvc.Spvc.Functions.context_parse_spirv
            r19 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L10
            r0 = r11
            long r0 = org.lwjgl.system.Checks.check(r0)
        L10:
            r0 = r11
            r1 = r13
            r2 = r15
            r3 = r17
            r4 = r19
            int r0 = org.lwjgl.system.JNI.invokePPPPI(r0, r1, r2, r3, r4)
            return r0
    }

    @org.lwjgl.system.NativeType("spvc_result")
    public static int spvc_context_parse_spirv(@org.lwjgl.system.NativeType("spvc_context") long r9, @org.lwjgl.system.NativeType("SpvId const *") java.nio.IntBuffer r11, @org.lwjgl.system.NativeType("size_t") long r12, @org.lwjgl.system.NativeType("spvc_parsed_ir *") org.lwjgl.PointerBuffer r14) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L11
            r0 = r11
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
            r0 = r14
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
        L11:
            r0 = r9
            r1 = r11
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            r2 = r12
            r3 = r14
            long r3 = org.lwjgl.system.MemoryUtil.memAddress(r3)
            int r0 = nspvc_context_parse_spirv(r0, r1, r2, r3)
            return r0
    }

    public static int nspvc_context_create_compiler(long r11, int r13, long r14, int r16, long r17) {
            long r0 = org.lwjgl.util.spvc.Spvc.Functions.context_create_compiler
            r19 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L15
            r0 = r11
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r14
            long r0 = org.lwjgl.system.Checks.check(r0)
        L15:
            r0 = r11
            r1 = r13
            r2 = r14
            r3 = r16
            r4 = r17
            r5 = r19
            int r0 = org.lwjgl.system.JNI.invokePPPI(r0, r1, r2, r3, r4, r5)
            return r0
    }

    @org.lwjgl.system.NativeType("spvc_result")
    public static int spvc_context_create_compiler(@org.lwjgl.system.NativeType("spvc_context") long r9, @org.lwjgl.system.NativeType("spvc_backend") int r11, @org.lwjgl.system.NativeType("spvc_parsed_ir") long r12, @org.lwjgl.system.NativeType("spvc_capture_mode") int r14, @org.lwjgl.system.NativeType("spvc_compiler *") org.lwjgl.PointerBuffer r15) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lc
            r0 = r15
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
        Lc:
            r0 = r9
            r1 = r11
            r2 = r12
            r3 = r14
            r4 = r15
            long r4 = org.lwjgl.system.MemoryUtil.memAddress(r4)
            int r0 = nspvc_context_create_compiler(r0, r1, r2, r3, r4)
            return r0
    }

    @org.lwjgl.system.NativeType("unsigned int")
    public static int spvc_compiler_get_current_id_bound(@org.lwjgl.system.NativeType("spvc_compiler") long r5) {
            long r0 = org.lwjgl.util.spvc.Spvc.Functions.compiler_get_current_id_bound
            r7 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lf
            r0 = r5
            long r0 = org.lwjgl.system.Checks.check(r0)
        Lf:
            r0 = r5
            r1 = r7
            int r0 = org.lwjgl.system.JNI.invokePI(r0, r1)
            return r0
    }

    public static int nspvc_compiler_create_compiler_options(long r7, long r9) {
            long r0 = org.lwjgl.util.spvc.Spvc.Functions.compiler_create_compiler_options
            r11 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L10
            r0 = r7
            long r0 = org.lwjgl.system.Checks.check(r0)
        L10:
            r0 = r7
            r1 = r9
            r2 = r11
            int r0 = org.lwjgl.system.JNI.invokePPI(r0, r1, r2)
            return r0
    }

    @org.lwjgl.system.NativeType("spvc_result")
    public static int spvc_compiler_create_compiler_options(@org.lwjgl.system.NativeType("spvc_compiler") long r5, @org.lwjgl.system.NativeType("spvc_compiler_options *") org.lwjgl.PointerBuffer r7) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r7
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
        Lb:
            r0 = r5
            r1 = r7
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            int r0 = nspvc_compiler_create_compiler_options(r0, r1)
            return r0
    }

    @org.lwjgl.system.NativeType("spvc_result")
    public static int spvc_compiler_options_set_bool(@org.lwjgl.system.NativeType("spvc_compiler_options") long r7, @org.lwjgl.system.NativeType("spvc_compiler_option") int r9, @org.lwjgl.system.NativeType("spvc_bool") boolean r10) {
            long r0 = org.lwjgl.util.spvc.Spvc.Functions.compiler_options_set_bool
            r11 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L10
            r0 = r7
            long r0 = org.lwjgl.system.Checks.check(r0)
        L10:
            r0 = r7
            r1 = r9
            r2 = r10
            r3 = r11
            int r0 = org.lwjgl.system.JNI.invokePI(r0, r1, r2, r3)
            return r0
    }

    @org.lwjgl.system.NativeType("spvc_result")
    public static int spvc_compiler_options_set_uint(@org.lwjgl.system.NativeType("spvc_compiler_options") long r7, @org.lwjgl.system.NativeType("spvc_compiler_option") int r9, @org.lwjgl.system.NativeType("unsigned int") int r10) {
            long r0 = org.lwjgl.util.spvc.Spvc.Functions.compiler_options_set_uint
            r11 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L10
            r0 = r7
            long r0 = org.lwjgl.system.Checks.check(r0)
        L10:
            r0 = r7
            r1 = r9
            r2 = r10
            r3 = r11
            int r0 = org.lwjgl.system.JNI.invokePI(r0, r1, r2, r3)
            return r0
    }

    @org.lwjgl.system.NativeType("spvc_result")
    public static int spvc_compiler_install_compiler_options(@org.lwjgl.system.NativeType("spvc_compiler") long r7, @org.lwjgl.system.NativeType("spvc_compiler_options") long r9) {
            long r0 = org.lwjgl.util.spvc.Spvc.Functions.compiler_install_compiler_options
            r11 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L15
            r0 = r7
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r9
            long r0 = org.lwjgl.system.Checks.check(r0)
        L15:
            r0 = r7
            r1 = r9
            r2 = r11
            int r0 = org.lwjgl.system.JNI.invokePPI(r0, r1, r2)
            return r0
    }

    public static int nspvc_compiler_compile(long r7, long r9) {
            long r0 = org.lwjgl.util.spvc.Spvc.Functions.compiler_compile
            r11 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L10
            r0 = r7
            long r0 = org.lwjgl.system.Checks.check(r0)
        L10:
            r0 = r7
            r1 = r9
            r2 = r11
            int r0 = org.lwjgl.system.JNI.invokePPI(r0, r1, r2)
            return r0
    }

    @org.lwjgl.system.NativeType("spvc_result")
    public static int spvc_compiler_compile(@org.lwjgl.system.NativeType("spvc_compiler") long r5, @org.lwjgl.system.NativeType("char const **") org.lwjgl.PointerBuffer r7) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r7
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
        Lb:
            r0 = r5
            r1 = r7
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            int r0 = nspvc_compiler_compile(r0, r1)
            return r0
    }

    public static int nspvc_compiler_add_header_line(long r7, long r9) {
            long r0 = org.lwjgl.util.spvc.Spvc.Functions.compiler_add_header_line
            r11 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L10
            r0 = r7
            long r0 = org.lwjgl.system.Checks.check(r0)
        L10:
            r0 = r7
            r1 = r9
            r2 = r11
            int r0 = org.lwjgl.system.JNI.invokePPI(r0, r1, r2)
            return r0
    }

    @org.lwjgl.system.NativeType("spvc_result")
    public static int spvc_compiler_add_header_line(@org.lwjgl.system.NativeType("spvc_compiler") long r5, @org.lwjgl.system.NativeType("char const *") java.nio.ByteBuffer r7) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto La
            r0 = r7
            org.lwjgl.system.Checks.checkNT1(r0)
        La:
            r0 = r5
            r1 = r7
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            int r0 = nspvc_compiler_add_header_line(r0, r1)
            return r0
    }

    @org.lwjgl.system.NativeType("spvc_result")
    public static int spvc_compiler_add_header_line(@org.lwjgl.system.NativeType("spvc_compiler") long r5, @org.lwjgl.system.NativeType("char const *") java.lang.CharSequence r7) {
            org.lwjgl.system.MemoryStack r0 = org.lwjgl.system.MemoryStack.stackGet()
            r8 = r0
            r0 = r8
            int r0 = r0.getPointer()
            r9 = r0
            r0 = r8
            r1 = r7
            r2 = 1
            int r0 = r0.nUTF8(r1, r2)     // Catch: java.lang.Throwable -> L28
            r0 = r8
            long r0 = r0.getPointerAddress()     // Catch: java.lang.Throwable -> L28
            r10 = r0
            r0 = r5
            r1 = r10
            int r0 = nspvc_compiler_add_header_line(r0, r1)     // Catch: java.lang.Throwable -> L28
            r12 = r0
            r0 = r8
            r1 = r9
            r0.setPointer(r1)
            r0 = r12
            return r0
        L28:
            r13 = move-exception
            r0 = r8
            r1 = r9
            r0.setPointer(r1)
            r0 = r13
            throw r0
    }

    public static int nspvc_compiler_require_extension(long r7, long r9) {
            long r0 = org.lwjgl.util.spvc.Spvc.Functions.compiler_require_extension
            r11 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L10
            r0 = r7
            long r0 = org.lwjgl.system.Checks.check(r0)
        L10:
            r0 = r7
            r1 = r9
            r2 = r11
            int r0 = org.lwjgl.system.JNI.invokePPI(r0, r1, r2)
            return r0
    }

    @org.lwjgl.system.NativeType("spvc_result")
    public static int spvc_compiler_require_extension(@org.lwjgl.system.NativeType("spvc_compiler") long r5, @org.lwjgl.system.NativeType("char const *") java.nio.ByteBuffer r7) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto La
            r0 = r7
            org.lwjgl.system.Checks.checkNT1(r0)
        La:
            r0 = r5
            r1 = r7
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            int r0 = nspvc_compiler_require_extension(r0, r1)
            return r0
    }

    @org.lwjgl.system.NativeType("spvc_result")
    public static int spvc_compiler_require_extension(@org.lwjgl.system.NativeType("spvc_compiler") long r5, @org.lwjgl.system.NativeType("char const *") java.lang.CharSequence r7) {
            org.lwjgl.system.MemoryStack r0 = org.lwjgl.system.MemoryStack.stackGet()
            r8 = r0
            r0 = r8
            int r0 = r0.getPointer()
            r9 = r0
            r0 = r8
            r1 = r7
            r2 = 1
            int r0 = r0.nUTF8(r1, r2)     // Catch: java.lang.Throwable -> L28
            r0 = r8
            long r0 = r0.getPointerAddress()     // Catch: java.lang.Throwable -> L28
            r10 = r0
            r0 = r5
            r1 = r10
            int r0 = nspvc_compiler_require_extension(r0, r1)     // Catch: java.lang.Throwable -> L28
            r12 = r0
            r0 = r8
            r1 = r9
            r0.setPointer(r1)
            r0 = r12
            return r0
        L28:
            r13 = move-exception
            r0 = r8
            r1 = r9
            r0.setPointer(r1)
            r0 = r13
            throw r0
    }

    @org.lwjgl.system.NativeType("size_t")
    public static long spvc_compiler_get_num_required_extensions(@org.lwjgl.system.NativeType("spvc_compiler") long r5) {
            long r0 = org.lwjgl.util.spvc.Spvc.Functions.compiler_get_num_required_extensions
            r7 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lf
            r0 = r5
            long r0 = org.lwjgl.system.Checks.check(r0)
        Lf:
            r0 = r5
            r1 = r7
            long r0 = org.lwjgl.system.JNI.invokePP(r0, r1)
            return r0
    }

    public static long nspvc_compiler_get_required_extension(long r7, long r9) {
            long r0 = org.lwjgl.util.spvc.Spvc.Functions.compiler_get_required_extension
            r11 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L10
            r0 = r7
            long r0 = org.lwjgl.system.Checks.check(r0)
        L10:
            r0 = r7
            r1 = r9
            r2 = r11
            long r0 = org.lwjgl.system.JNI.invokePPP(r0, r1, r2)
            return r0
    }

    @org.lwjgl.system.NativeType("char const *")
    public static java.lang.String spvc_compiler_get_required_extension(@org.lwjgl.system.NativeType("spvc_compiler") long r5, @org.lwjgl.system.NativeType("size_t") long r7) {
            r0 = r5
            r1 = r7
            long r0 = nspvc_compiler_get_required_extension(r0, r1)
            r9 = r0
            r0 = r9
            java.lang.String r0 = org.lwjgl.system.MemoryUtil.memUTF8Safe(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("spvc_result")
    public static int spvc_compiler_flatten_buffer_block(@org.lwjgl.system.NativeType("spvc_compiler") long r6, @org.lwjgl.system.NativeType("spvc_variable_id") int r8) {
            long r0 = org.lwjgl.util.spvc.Spvc.Functions.compiler_flatten_buffer_block
            r9 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lf
            r0 = r6
            long r0 = org.lwjgl.system.Checks.check(r0)
        Lf:
            r0 = r6
            r1 = r8
            r2 = r9
            int r0 = org.lwjgl.system.JNI.invokePI(r0, r1, r2)
            return r0
    }

    @org.lwjgl.system.NativeType("spvc_bool")
    public static boolean spvc_compiler_variable_is_depth_or_compare(@org.lwjgl.system.NativeType("spvc_compiler") long r6, @org.lwjgl.system.NativeType("spvc_variable_id") int r8) {
            long r0 = org.lwjgl.util.spvc.Spvc.Functions.compiler_variable_is_depth_or_compare
            r9 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lf
            r0 = r6
            long r0 = org.lwjgl.system.Checks.check(r0)
        Lf:
            r0 = r6
            r1 = r8
            r2 = r9
            boolean r0 = org.lwjgl.system.JNI.invokePZ(r0, r1, r2)
            return r0
    }

    @org.lwjgl.system.NativeType("spvc_result")
    public static int spvc_compiler_mask_stage_output_by_location(@org.lwjgl.system.NativeType("spvc_compiler") long r7, @org.lwjgl.system.NativeType("unsigned") int r9, @org.lwjgl.system.NativeType("unsigned") int r10) {
            long r0 = org.lwjgl.util.spvc.Spvc.Functions.compiler_mask_stage_output_by_location
            r11 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L10
            r0 = r7
            long r0 = org.lwjgl.system.Checks.check(r0)
        L10:
            r0 = r7
            r1 = r9
            r2 = r10
            r3 = r11
            int r0 = org.lwjgl.system.JNI.invokePI(r0, r1, r2, r3)
            return r0
    }

    @org.lwjgl.system.NativeType("spvc_result")
    public static int spvc_compiler_mask_stage_output_by_builtin(@org.lwjgl.system.NativeType("spvc_compiler") long r6, @org.lwjgl.system.NativeType("SpvBuiltIn") int r8) {
            long r0 = org.lwjgl.util.spvc.Spvc.Functions.compiler_mask_stage_output_by_builtin
            r9 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lf
            r0 = r6
            long r0 = org.lwjgl.system.Checks.check(r0)
        Lf:
            r0 = r6
            r1 = r8
            r2 = r9
            int r0 = org.lwjgl.system.JNI.invokePI(r0, r1, r2)
            return r0
    }

    public static int nspvc_compiler_hlsl_set_root_constants_layout(long r9, long r11, long r13) {
            long r0 = org.lwjgl.util.spvc.Spvc.Functions.compiler_hlsl_set_root_constants_layout
            r15 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L10
            r0 = r9
            long r0 = org.lwjgl.system.Checks.check(r0)
        L10:
            r0 = r9
            r1 = r11
            r2 = r13
            r3 = r15
            int r0 = org.lwjgl.system.JNI.invokePPPI(r0, r1, r2, r3)
            return r0
    }

    @org.lwjgl.system.NativeType("spvc_result")
    public static int spvc_compiler_hlsl_set_root_constants_layout(@org.lwjgl.system.NativeType("spvc_compiler") long r7, @org.lwjgl.system.NativeType("spvc_hlsl_root_constants const *") org.lwjgl.util.spvc.SpvcHlslRootConstants r9, @org.lwjgl.system.NativeType("size_t") long r10) {
            r0 = r7
            r1 = r9
            long r1 = r1.address()
            r2 = r10
            int r0 = nspvc_compiler_hlsl_set_root_constants_layout(r0, r1, r2)
            return r0
    }

    public static int nspvc_compiler_hlsl_add_vertex_attribute_remap(long r9, long r11, long r13) {
            long r0 = org.lwjgl.util.spvc.Spvc.Functions.compiler_hlsl_add_vertex_attribute_remap
            r15 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L14
            r0 = r9
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r11
            org.lwjgl.util.spvc.SpvcHlslVertexAttributeRemap.validate(r0)
        L14:
            r0 = r9
            r1 = r11
            r2 = r13
            r3 = r15
            int r0 = org.lwjgl.system.JNI.invokePPPI(r0, r1, r2, r3)
            return r0
    }

    @org.lwjgl.system.NativeType("spvc_result")
    public static int spvc_compiler_hlsl_add_vertex_attribute_remap(@org.lwjgl.system.NativeType("spvc_compiler") long r7, @org.lwjgl.system.NativeType("spvc_hlsl_vertex_attribute_remap const *") org.lwjgl.util.spvc.SpvcHlslVertexAttributeRemap r9, @org.lwjgl.system.NativeType("size_t") long r10) {
            r0 = r7
            r1 = r9
            long r1 = r1.address()
            r2 = r10
            int r0 = nspvc_compiler_hlsl_add_vertex_attribute_remap(r0, r1, r2)
            return r0
    }

    @org.lwjgl.system.NativeType("spvc_variable_id")
    public static int spvc_compiler_hlsl_remap_num_workgroups_builtin(@org.lwjgl.system.NativeType("spvc_compiler") long r5) {
            long r0 = org.lwjgl.util.spvc.Spvc.Functions.compiler_hlsl_remap_num_workgroups_builtin
            r7 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lf
            r0 = r5
            long r0 = org.lwjgl.system.Checks.check(r0)
        Lf:
            r0 = r5
            r1 = r7
            int r0 = org.lwjgl.system.JNI.invokePI(r0, r1)
            return r0
    }

    @org.lwjgl.system.NativeType("spvc_result")
    public static int spvc_compiler_hlsl_set_resource_binding_flags(@org.lwjgl.system.NativeType("spvc_compiler") long r6, @org.lwjgl.system.NativeType("spvc_hlsl_binding_flags") int r8) {
            long r0 = org.lwjgl.util.spvc.Spvc.Functions.compiler_hlsl_set_resource_binding_flags
            r9 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lf
            r0 = r6
            long r0 = org.lwjgl.system.Checks.check(r0)
        Lf:
            r0 = r6
            r1 = r8
            r2 = r9
            int r0 = org.lwjgl.system.JNI.invokePI(r0, r1, r2)
            return r0
    }

    public static int nspvc_compiler_hlsl_add_resource_binding(long r7, long r9) {
            long r0 = org.lwjgl.util.spvc.Spvc.Functions.compiler_hlsl_add_resource_binding
            r11 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L10
            r0 = r7
            long r0 = org.lwjgl.system.Checks.check(r0)
        L10:
            r0 = r7
            r1 = r9
            r2 = r11
            int r0 = org.lwjgl.system.JNI.invokePPI(r0, r1, r2)
            return r0
    }

    @org.lwjgl.system.NativeType("spvc_result")
    public static int spvc_compiler_hlsl_add_resource_binding(@org.lwjgl.system.NativeType("spvc_compiler") long r5, @org.lwjgl.system.NativeType("spvc_hlsl_resource_binding const *") org.lwjgl.util.spvc.SpvcHLSLResourceBinding r7) {
            r0 = r5
            r1 = r7
            long r1 = r1.address()
            int r0 = nspvc_compiler_hlsl_add_resource_binding(r0, r1)
            return r0
    }

    @org.lwjgl.system.NativeType("spvc_bool")
    public static boolean spvc_compiler_hlsl_is_resource_used(@org.lwjgl.system.NativeType("spvc_compiler") long r8, @org.lwjgl.system.NativeType("SpvExecutionModel") int r10, @org.lwjgl.system.NativeType("unsigned") int r11, @org.lwjgl.system.NativeType("unsigned") int r12) {
            long r0 = org.lwjgl.util.spvc.Spvc.Functions.compiler_hlsl_is_resource_used
            r13 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L10
            r0 = r8
            long r0 = org.lwjgl.system.Checks.check(r0)
        L10:
            r0 = r8
            r1 = r10
            r2 = r11
            r3 = r12
            r4 = r13
            boolean r0 = org.lwjgl.system.JNI.invokePZ(r0, r1, r2, r3, r4)
            return r0
    }

    @org.lwjgl.system.NativeType("spvc_bool")
    public static boolean spvc_compiler_msl_is_rasterization_disabled(@org.lwjgl.system.NativeType("spvc_compiler") long r5) {
            long r0 = org.lwjgl.util.spvc.Spvc.Functions.compiler_msl_is_rasterization_disabled
            r7 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lf
            r0 = r5
            long r0 = org.lwjgl.system.Checks.check(r0)
        Lf:
            r0 = r5
            r1 = r7
            boolean r0 = org.lwjgl.system.JNI.invokePZ(r0, r1)
            return r0
    }

    @org.lwjgl.system.NativeType("spvc_bool")
    public static boolean spvc_compiler_msl_needs_swizzle_buffer(@org.lwjgl.system.NativeType("spvc_compiler") long r5) {
            long r0 = org.lwjgl.util.spvc.Spvc.Functions.compiler_msl_needs_swizzle_buffer
            r7 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lf
            r0 = r5
            long r0 = org.lwjgl.system.Checks.check(r0)
        Lf:
            r0 = r5
            r1 = r7
            boolean r0 = org.lwjgl.system.JNI.invokePZ(r0, r1)
            return r0
    }

    @org.lwjgl.system.NativeType("spvc_bool")
    public static boolean spvc_compiler_msl_needs_buffer_size_buffer(@org.lwjgl.system.NativeType("spvc_compiler") long r5) {
            long r0 = org.lwjgl.util.spvc.Spvc.Functions.compiler_msl_needs_buffer_size_buffer
            r7 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lf
            r0 = r5
            long r0 = org.lwjgl.system.Checks.check(r0)
        Lf:
            r0 = r5
            r1 = r7
            boolean r0 = org.lwjgl.system.JNI.invokePZ(r0, r1)
            return r0
    }

    @org.lwjgl.system.NativeType("spvc_bool")
    public static boolean spvc_compiler_msl_needs_output_buffer(@org.lwjgl.system.NativeType("spvc_compiler") long r5) {
            long r0 = org.lwjgl.util.spvc.Spvc.Functions.compiler_msl_needs_output_buffer
            r7 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lf
            r0 = r5
            long r0 = org.lwjgl.system.Checks.check(r0)
        Lf:
            r0 = r5
            r1 = r7
            boolean r0 = org.lwjgl.system.JNI.invokePZ(r0, r1)
            return r0
    }

    @org.lwjgl.system.NativeType("spvc_bool")
    public static boolean spvc_compiler_msl_needs_patch_output_buffer(@org.lwjgl.system.NativeType("spvc_compiler") long r5) {
            long r0 = org.lwjgl.util.spvc.Spvc.Functions.compiler_msl_needs_patch_output_buffer
            r7 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lf
            r0 = r5
            long r0 = org.lwjgl.system.Checks.check(r0)
        Lf:
            r0 = r5
            r1 = r7
            boolean r0 = org.lwjgl.system.JNI.invokePZ(r0, r1)
            return r0
    }

    @org.lwjgl.system.NativeType("spvc_bool")
    public static boolean spvc_compiler_msl_needs_input_threadgroup_mem(@org.lwjgl.system.NativeType("spvc_compiler") long r5) {
            long r0 = org.lwjgl.util.spvc.Spvc.Functions.compiler_msl_needs_input_threadgroup_mem
            r7 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lf
            r0 = r5
            long r0 = org.lwjgl.system.Checks.check(r0)
        Lf:
            r0 = r5
            r1 = r7
            boolean r0 = org.lwjgl.system.JNI.invokePZ(r0, r1)
            return r0
    }

    public static int nspvc_compiler_msl_add_vertex_attribute(long r7, long r9) {
            long r0 = org.lwjgl.util.spvc.Spvc.Functions.compiler_msl_add_vertex_attribute
            r11 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L10
            r0 = r7
            long r0 = org.lwjgl.system.Checks.check(r0)
        L10:
            r0 = r7
            r1 = r9
            r2 = r11
            int r0 = org.lwjgl.system.JNI.invokePPI(r0, r1, r2)
            return r0
    }

    @org.lwjgl.system.NativeType("spvc_result")
    public static int spvc_compiler_msl_add_vertex_attribute(@org.lwjgl.system.NativeType("spvc_compiler") long r5, @org.lwjgl.system.NativeType("spvc_msl_vertex_attribute const *") org.lwjgl.util.spvc.SpvcMslVertexAttribute r7) {
            r0 = r5
            r1 = r7
            long r1 = r1.address()
            int r0 = nspvc_compiler_msl_add_vertex_attribute(r0, r1)
            return r0
    }

    public static int nspvc_compiler_msl_add_resource_binding(long r7, long r9) {
            long r0 = org.lwjgl.util.spvc.Spvc.Functions.compiler_msl_add_resource_binding
            r11 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L10
            r0 = r7
            long r0 = org.lwjgl.system.Checks.check(r0)
        L10:
            r0 = r7
            r1 = r9
            r2 = r11
            int r0 = org.lwjgl.system.JNI.invokePPI(r0, r1, r2)
            return r0
    }

    @org.lwjgl.system.NativeType("spvc_result")
    public static int spvc_compiler_msl_add_resource_binding(@org.lwjgl.system.NativeType("spvc_compiler") long r5, @org.lwjgl.system.NativeType("spvc_msl_resource_binding const *") org.lwjgl.util.spvc.SpvcMslResourceBinding r7) {
            r0 = r5
            r1 = r7
            long r1 = r1.address()
            int r0 = nspvc_compiler_msl_add_resource_binding(r0, r1)
            return r0
    }

    public static int nspvc_compiler_msl_add_resource_binding_2(long r7, long r9) {
            long r0 = org.lwjgl.util.spvc.Spvc.Functions.compiler_msl_add_resource_binding_2
            r11 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L10
            r0 = r7
            long r0 = org.lwjgl.system.Checks.check(r0)
        L10:
            r0 = r7
            r1 = r9
            r2 = r11
            int r0 = org.lwjgl.system.JNI.invokePPI(r0, r1, r2)
            return r0
    }

    @org.lwjgl.system.NativeType("spvc_result")
    public static int spvc_compiler_msl_add_resource_binding_2(@org.lwjgl.system.NativeType("spvc_compiler") long r5, @org.lwjgl.system.NativeType("spvc_msl_resource_binding_2 const *") org.lwjgl.util.spvc.SpvcMslResourceBinding2 r7) {
            r0 = r5
            r1 = r7
            long r1 = r1.address()
            int r0 = nspvc_compiler_msl_add_resource_binding_2(r0, r1)
            return r0
    }

    public static int nspvc_compiler_msl_add_shader_input(long r7, long r9) {
            long r0 = org.lwjgl.util.spvc.Spvc.Functions.compiler_msl_add_shader_input
            r11 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L10
            r0 = r7
            long r0 = org.lwjgl.system.Checks.check(r0)
        L10:
            r0 = r7
            r1 = r9
            r2 = r11
            int r0 = org.lwjgl.system.JNI.invokePPI(r0, r1, r2)
            return r0
    }

    @org.lwjgl.system.NativeType("spvc_result")
    public static int spvc_compiler_msl_add_shader_input(@org.lwjgl.system.NativeType("spvc_compiler") long r5, @org.lwjgl.system.NativeType("spvc_msl_shader_interface_var const *") org.lwjgl.util.spvc.SpvcMslShaderInterfaceVar r7) {
            r0 = r5
            r1 = r7
            long r1 = r1.address()
            int r0 = nspvc_compiler_msl_add_shader_input(r0, r1)
            return r0
    }

    public static int nspvc_compiler_msl_add_shader_input_2(long r7, long r9) {
            long r0 = org.lwjgl.util.spvc.Spvc.Functions.compiler_msl_add_shader_input_2
            r11 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L10
            r0 = r7
            long r0 = org.lwjgl.system.Checks.check(r0)
        L10:
            r0 = r7
            r1 = r9
            r2 = r11
            int r0 = org.lwjgl.system.JNI.invokePPI(r0, r1, r2)
            return r0
    }

    @org.lwjgl.system.NativeType("spvc_result")
    public static int spvc_compiler_msl_add_shader_input_2(@org.lwjgl.system.NativeType("spvc_compiler") long r5, @org.lwjgl.system.NativeType("spvc_msl_shader_interface_var_2 const *") org.lwjgl.util.spvc.SpvcMslShaderInterfaceVar2 r7) {
            r0 = r5
            r1 = r7
            long r1 = r1.address()
            int r0 = nspvc_compiler_msl_add_shader_input_2(r0, r1)
            return r0
    }

    public static int nspvc_compiler_msl_add_shader_output(long r7, long r9) {
            long r0 = org.lwjgl.util.spvc.Spvc.Functions.compiler_msl_add_shader_output
            r11 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L10
            r0 = r7
            long r0 = org.lwjgl.system.Checks.check(r0)
        L10:
            r0 = r7
            r1 = r9
            r2 = r11
            int r0 = org.lwjgl.system.JNI.invokePPI(r0, r1, r2)
            return r0
    }

    @org.lwjgl.system.NativeType("spvc_result")
    public static int spvc_compiler_msl_add_shader_output(@org.lwjgl.system.NativeType("spvc_compiler") long r5, @org.lwjgl.system.NativeType("spvc_msl_shader_interface_var const *") org.lwjgl.util.spvc.SpvcMslShaderInterfaceVar r7) {
            r0 = r5
            r1 = r7
            long r1 = r1.address()
            int r0 = nspvc_compiler_msl_add_shader_output(r0, r1)
            return r0
    }

    public static int nspvc_compiler_msl_add_shader_output_2(long r7, long r9) {
            long r0 = org.lwjgl.util.spvc.Spvc.Functions.compiler_msl_add_shader_output_2
            r11 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L10
            r0 = r7
            long r0 = org.lwjgl.system.Checks.check(r0)
        L10:
            r0 = r7
            r1 = r9
            r2 = r11
            int r0 = org.lwjgl.system.JNI.invokePPI(r0, r1, r2)
            return r0
    }

    @org.lwjgl.system.NativeType("spvc_result")
    public static int spvc_compiler_msl_add_shader_output_2(@org.lwjgl.system.NativeType("spvc_compiler") long r5, @org.lwjgl.system.NativeType("spvc_msl_shader_interface_var_2 const *") org.lwjgl.util.spvc.SpvcMslShaderInterfaceVar2 r7) {
            r0 = r5
            r1 = r7
            long r1 = r1.address()
            int r0 = nspvc_compiler_msl_add_shader_output_2(r0, r1)
            return r0
    }

    @org.lwjgl.system.NativeType("spvc_result")
    public static int spvc_compiler_msl_add_discrete_descriptor_set(@org.lwjgl.system.NativeType("spvc_compiler") long r6, @org.lwjgl.system.NativeType("unsigned int") int r8) {
            long r0 = org.lwjgl.util.spvc.Spvc.Functions.compiler_msl_add_discrete_descriptor_set
            r9 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lf
            r0 = r6
            long r0 = org.lwjgl.system.Checks.check(r0)
        Lf:
            r0 = r6
            r1 = r8
            r2 = r9
            int r0 = org.lwjgl.system.JNI.invokePI(r0, r1, r2)
            return r0
    }

    @org.lwjgl.system.NativeType("spvc_result")
    public static int spvc_compiler_msl_set_argument_buffer_device_address_space(@org.lwjgl.system.NativeType("spvc_compiler") long r7, @org.lwjgl.system.NativeType("unsigned") int r9, @org.lwjgl.system.NativeType("spvc_bool") boolean r10) {
            long r0 = org.lwjgl.util.spvc.Spvc.Functions.compiler_msl_set_argument_buffer_device_address_space
            r11 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L10
            r0 = r7
            long r0 = org.lwjgl.system.Checks.check(r0)
        L10:
            r0 = r7
            r1 = r9
            r2 = r10
            r3 = r11
            int r0 = org.lwjgl.system.JNI.invokePI(r0, r1, r2, r3)
            return r0
    }

    @org.lwjgl.system.NativeType("spvc_bool")
    public static boolean spvc_compiler_msl_is_vertex_attribute_used(@org.lwjgl.system.NativeType("spvc_compiler") long r6, @org.lwjgl.system.NativeType("unsigned int") int r8) {
            long r0 = org.lwjgl.util.spvc.Spvc.Functions.compiler_msl_is_vertex_attribute_used
            r9 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lf
            r0 = r6
            long r0 = org.lwjgl.system.Checks.check(r0)
        Lf:
            r0 = r6
            r1 = r8
            r2 = r9
            boolean r0 = org.lwjgl.system.JNI.invokePZ(r0, r1, r2)
            return r0
    }

    @org.lwjgl.system.NativeType("spvc_bool")
    public static boolean spvc_compiler_msl_is_shader_input_used(@org.lwjgl.system.NativeType("spvc_compiler") long r6, @org.lwjgl.system.NativeType("unsigned") int r8) {
            long r0 = org.lwjgl.util.spvc.Spvc.Functions.compiler_msl_is_shader_input_used
            r9 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lf
            r0 = r6
            long r0 = org.lwjgl.system.Checks.check(r0)
        Lf:
            r0 = r6
            r1 = r8
            r2 = r9
            boolean r0 = org.lwjgl.system.JNI.invokePZ(r0, r1, r2)
            return r0
    }

    @org.lwjgl.system.NativeType("spvc_bool")
    public static boolean spvc_compiler_msl_is_shader_output_used(@org.lwjgl.system.NativeType("spvc_compiler") long r6, @org.lwjgl.system.NativeType("unsigned") int r8) {
            long r0 = org.lwjgl.util.spvc.Spvc.Functions.compiler_msl_is_shader_output_used
            r9 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lf
            r0 = r6
            long r0 = org.lwjgl.system.Checks.check(r0)
        Lf:
            r0 = r6
            r1 = r8
            r2 = r9
            boolean r0 = org.lwjgl.system.JNI.invokePZ(r0, r1, r2)
            return r0
    }

    @org.lwjgl.system.NativeType("spvc_bool")
    public static boolean spvc_compiler_msl_is_resource_used(@org.lwjgl.system.NativeType("spvc_compiler") long r8, @org.lwjgl.system.NativeType("SpvExecutionModel") int r10, @org.lwjgl.system.NativeType("unsigned int") int r11, @org.lwjgl.system.NativeType("unsigned int") int r12) {
            long r0 = org.lwjgl.util.spvc.Spvc.Functions.compiler_msl_is_resource_used
            r13 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L10
            r0 = r8
            long r0 = org.lwjgl.system.Checks.check(r0)
        L10:
            r0 = r8
            r1 = r10
            r2 = r11
            r3 = r12
            r4 = r13
            boolean r0 = org.lwjgl.system.JNI.invokePZ(r0, r1, r2, r3, r4)
            return r0
    }

    public static int nspvc_compiler_msl_remap_constexpr_sampler(long r8, int r10, long r11) {
            long r0 = org.lwjgl.util.spvc.Spvc.Functions.compiler_msl_remap_constexpr_sampler
            r13 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L10
            r0 = r8
            long r0 = org.lwjgl.system.Checks.check(r0)
        L10:
            r0 = r8
            r1 = r10
            r2 = r11
            r3 = r13
            int r0 = org.lwjgl.system.JNI.invokePPI(r0, r1, r2, r3)
            return r0
    }

    @org.lwjgl.system.NativeType("spvc_result")
    public static int spvc_compiler_msl_remap_constexpr_sampler(@org.lwjgl.system.NativeType("spvc_compiler") long r6, @org.lwjgl.system.NativeType("spvc_variable_id") int r8, @org.lwjgl.system.NativeType("spvc_msl_constexpr_sampler const *") org.lwjgl.util.spvc.SpvcMslConstexprSampler r9) {
            r0 = r6
            r1 = r8
            r2 = r9
            long r2 = r2.address()
            int r0 = nspvc_compiler_msl_remap_constexpr_sampler(r0, r1, r2)
            return r0
    }

    public static int nspvc_compiler_msl_remap_constexpr_sampler_by_binding(long r9, int r11, int r12, long r13) {
            long r0 = org.lwjgl.util.spvc.Spvc.Functions.compiler_msl_remap_constexpr_sampler_by_binding
            r15 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L10
            r0 = r9
            long r0 = org.lwjgl.system.Checks.check(r0)
        L10:
            r0 = r9
            r1 = r11
            r2 = r12
            r3 = r13
            r4 = r15
            int r0 = org.lwjgl.system.JNI.invokePPI(r0, r1, r2, r3, r4)
            return r0
    }

    @org.lwjgl.system.NativeType("spvc_result")
    public static int spvc_compiler_msl_remap_constexpr_sampler_by_binding(@org.lwjgl.system.NativeType("spvc_compiler") long r7, @org.lwjgl.system.NativeType("unsigned int") int r9, @org.lwjgl.system.NativeType("unsigned int") int r10, @org.lwjgl.system.NativeType("spvc_msl_constexpr_sampler const *") org.lwjgl.util.spvc.SpvcMslConstexprSampler r11) {
            r0 = r7
            r1 = r9
            r2 = r10
            r3 = r11
            long r3 = r3.address()
            int r0 = nspvc_compiler_msl_remap_constexpr_sampler_by_binding(r0, r1, r2, r3)
            return r0
    }

    public static int nspvc_compiler_msl_remap_constexpr_sampler_ycbcr(long r10, int r12, long r13, long r15) {
            long r0 = org.lwjgl.util.spvc.Spvc.Functions.compiler_msl_remap_constexpr_sampler_ycbcr
            r17 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L10
            r0 = r10
            long r0 = org.lwjgl.system.Checks.check(r0)
        L10:
            r0 = r10
            r1 = r12
            r2 = r13
            r3 = r15
            r4 = r17
            int r0 = org.lwjgl.system.JNI.invokePPPI(r0, r1, r2, r3, r4)
            return r0
    }

    @org.lwjgl.system.NativeType("spvc_result")
    public static int spvc_compiler_msl_remap_constexpr_sampler_ycbcr(@org.lwjgl.system.NativeType("spvc_compiler") long r8, @org.lwjgl.system.NativeType("spvc_variable_id") int r10, @org.lwjgl.system.NativeType("spvc_msl_constexpr_sampler const *") org.lwjgl.util.spvc.SpvcMslConstexprSampler r11, @org.lwjgl.system.NativeType("spvc_msl_sampler_ycbcr_conversion const *") org.lwjgl.util.spvc.SpvcMslSamplerYcbcrConversion r12) {
            r0 = r8
            r1 = r10
            r2 = r11
            long r2 = r2.address()
            r3 = r12
            long r3 = r3.address()
            int r0 = nspvc_compiler_msl_remap_constexpr_sampler_ycbcr(r0, r1, r2, r3)
            return r0
    }

    public static int nspvc_compiler_msl_remap_constexpr_sampler_by_binding_ycbcr(long r11, int r13, int r14, long r15, long r17) {
            long r0 = org.lwjgl.util.spvc.Spvc.Functions.compiler_msl_remap_constexpr_sampler_by_binding_ycbcr
            r19 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L10
            r0 = r11
            long r0 = org.lwjgl.system.Checks.check(r0)
        L10:
            r0 = r11
            r1 = r13
            r2 = r14
            r3 = r15
            r4 = r17
            r5 = r19
            int r0 = org.lwjgl.system.JNI.invokePPPI(r0, r1, r2, r3, r4, r5)
            return r0
    }

    @org.lwjgl.system.NativeType("spvc_result")
    public static int spvc_compiler_msl_remap_constexpr_sampler_by_binding_ycbcr(@org.lwjgl.system.NativeType("spvc_compiler") long r9, @org.lwjgl.system.NativeType("unsigned int") int r11, @org.lwjgl.system.NativeType("unsigned int") int r12, @org.lwjgl.system.NativeType("spvc_msl_constexpr_sampler const *") org.lwjgl.util.spvc.SpvcMslConstexprSampler r13, @org.lwjgl.system.NativeType("spvc_msl_sampler_ycbcr_conversion const *") org.lwjgl.util.spvc.SpvcMslSamplerYcbcrConversion r14) {
            r0 = r9
            r1 = r11
            r2 = r12
            r3 = r13
            long r3 = r3.address()
            r4 = r14
            long r4 = r4.address()
            int r0 = nspvc_compiler_msl_remap_constexpr_sampler_by_binding_ycbcr(r0, r1, r2, r3, r4)
            return r0
    }

    @org.lwjgl.system.NativeType("spvc_result")
    public static int spvc_compiler_msl_set_fragment_output_components(@org.lwjgl.system.NativeType("spvc_compiler") long r7, @org.lwjgl.system.NativeType("unsigned int") int r9, @org.lwjgl.system.NativeType("unsigned int") int r10) {
            long r0 = org.lwjgl.util.spvc.Spvc.Functions.compiler_msl_set_fragment_output_components
            r11 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L10
            r0 = r7
            long r0 = org.lwjgl.system.Checks.check(r0)
        L10:
            r0 = r7
            r1 = r9
            r2 = r10
            r3 = r11
            int r0 = org.lwjgl.system.JNI.invokePI(r0, r1, r2, r3)
            return r0
    }

    @org.lwjgl.system.NativeType("unsigned int")
    public static int spvc_compiler_msl_get_automatic_resource_binding(@org.lwjgl.system.NativeType("spvc_compiler") long r6, @org.lwjgl.system.NativeType("spvc_variable_id") int r8) {
            long r0 = org.lwjgl.util.spvc.Spvc.Functions.compiler_msl_get_automatic_resource_binding
            r9 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lf
            r0 = r6
            long r0 = org.lwjgl.system.Checks.check(r0)
        Lf:
            r0 = r6
            r1 = r8
            r2 = r9
            int r0 = org.lwjgl.system.JNI.invokePI(r0, r1, r2)
            return r0
    }

    @org.lwjgl.system.NativeType("unsigned int")
    public static int spvc_compiler_msl_get_automatic_resource_binding_secondary(@org.lwjgl.system.NativeType("spvc_compiler") long r6, @org.lwjgl.system.NativeType("spvc_variable_id") int r8) {
            long r0 = org.lwjgl.util.spvc.Spvc.Functions.compiler_msl_get_automatic_resource_binding_secondary
            r9 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lf
            r0 = r6
            long r0 = org.lwjgl.system.Checks.check(r0)
        Lf:
            r0 = r6
            r1 = r8
            r2 = r9
            int r0 = org.lwjgl.system.JNI.invokePI(r0, r1, r2)
            return r0
    }

    @org.lwjgl.system.NativeType("spvc_result")
    public static int spvc_compiler_msl_add_dynamic_buffer(@org.lwjgl.system.NativeType("spvc_compiler") long r8, @org.lwjgl.system.NativeType("unsigned int") int r10, @org.lwjgl.system.NativeType("unsigned int") int r11, @org.lwjgl.system.NativeType("unsigned int") int r12) {
            long r0 = org.lwjgl.util.spvc.Spvc.Functions.compiler_msl_add_dynamic_buffer
            r13 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L10
            r0 = r8
            long r0 = org.lwjgl.system.Checks.check(r0)
        L10:
            r0 = r8
            r1 = r10
            r2 = r11
            r3 = r12
            r4 = r13
            int r0 = org.lwjgl.system.JNI.invokePI(r0, r1, r2, r3, r4)
            return r0
    }

    @org.lwjgl.system.NativeType("spvc_result")
    public static int spvc_compiler_msl_add_inline_uniform_block(@org.lwjgl.system.NativeType("spvc_compiler") long r7, @org.lwjgl.system.NativeType("unsigned int") int r9, @org.lwjgl.system.NativeType("unsigned int") int r10) {
            long r0 = org.lwjgl.util.spvc.Spvc.Functions.compiler_msl_add_inline_uniform_block
            r11 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L10
            r0 = r7
            long r0 = org.lwjgl.system.Checks.check(r0)
        L10:
            r0 = r7
            r1 = r9
            r2 = r10
            r3 = r11
            int r0 = org.lwjgl.system.JNI.invokePI(r0, r1, r2, r3)
            return r0
    }

    public static int nspvc_compiler_msl_set_combined_sampler_suffix(long r7, long r9) {
            long r0 = org.lwjgl.util.spvc.Spvc.Functions.compiler_msl_set_combined_sampler_suffix
            r11 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L10
            r0 = r7
            long r0 = org.lwjgl.system.Checks.check(r0)
        L10:
            r0 = r7
            r1 = r9
            r2 = r11
            int r0 = org.lwjgl.system.JNI.invokePPI(r0, r1, r2)
            return r0
    }

    @org.lwjgl.system.NativeType("spvc_result")
    public static int spvc_compiler_msl_set_combined_sampler_suffix(@org.lwjgl.system.NativeType("spvc_compiler") long r5, @org.lwjgl.system.NativeType("char const *") java.nio.ByteBuffer r7) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto La
            r0 = r7
            org.lwjgl.system.Checks.checkNT1(r0)
        La:
            r0 = r5
            r1 = r7
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            int r0 = nspvc_compiler_msl_set_combined_sampler_suffix(r0, r1)
            return r0
    }

    @org.lwjgl.system.NativeType("spvc_result")
    public static int spvc_compiler_msl_set_combined_sampler_suffix(@org.lwjgl.system.NativeType("spvc_compiler") long r5, @org.lwjgl.system.NativeType("char const *") java.lang.CharSequence r7) {
            org.lwjgl.system.MemoryStack r0 = org.lwjgl.system.MemoryStack.stackGet()
            r8 = r0
            r0 = r8
            int r0 = r0.getPointer()
            r9 = r0
            r0 = r8
            r1 = r7
            r2 = 1
            int r0 = r0.nUTF8(r1, r2)     // Catch: java.lang.Throwable -> L28
            r0 = r8
            long r0 = r0.getPointerAddress()     // Catch: java.lang.Throwable -> L28
            r10 = r0
            r0 = r5
            r1 = r10
            int r0 = nspvc_compiler_msl_set_combined_sampler_suffix(r0, r1)     // Catch: java.lang.Throwable -> L28
            r12 = r0
            r0 = r8
            r1 = r9
            r0.setPointer(r1)
            r0 = r12
            return r0
        L28:
            r13 = move-exception
            r0 = r8
            r1 = r9
            r0.setPointer(r1)
            r0 = r13
            throw r0
    }

    public static long nspvc_compiler_msl_get_combined_sampler_suffix(long r5) {
            long r0 = org.lwjgl.util.spvc.Spvc.Functions.compiler_msl_get_combined_sampler_suffix
            r7 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lf
            r0 = r5
            long r0 = org.lwjgl.system.Checks.check(r0)
        Lf:
            r0 = r5
            r1 = r7
            long r0 = org.lwjgl.system.JNI.invokePP(r0, r1)
            return r0
    }

    @org.lwjgl.system.NativeType("char const *")
    public static java.lang.String spvc_compiler_msl_get_combined_sampler_suffix(@org.lwjgl.system.NativeType("spvc_compiler") long r3) {
            r0 = r3
            long r0 = nspvc_compiler_msl_get_combined_sampler_suffix(r0)
            r5 = r0
            r0 = r5
            java.lang.String r0 = org.lwjgl.system.MemoryUtil.memUTF8Safe(r0)
            return r0
    }

    public static int nspvc_compiler_get_active_interface_variables(long r7, long r9) {
            long r0 = org.lwjgl.util.spvc.Spvc.Functions.compiler_get_active_interface_variables
            r11 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L10
            r0 = r7
            long r0 = org.lwjgl.system.Checks.check(r0)
        L10:
            r0 = r7
            r1 = r9
            r2 = r11
            int r0 = org.lwjgl.system.JNI.invokePPI(r0, r1, r2)
            return r0
    }

    @org.lwjgl.system.NativeType("spvc_result")
    public static int spvc_compiler_get_active_interface_variables(@org.lwjgl.system.NativeType("spvc_compiler") long r5, @org.lwjgl.system.NativeType("spvc_set *") org.lwjgl.PointerBuffer r7) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r7
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
        Lb:
            r0 = r5
            r1 = r7
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            int r0 = nspvc_compiler_get_active_interface_variables(r0, r1)
            return r0
    }

    @org.lwjgl.system.NativeType("spvc_result")
    public static int spvc_compiler_set_enabled_interface_variables(@org.lwjgl.system.NativeType("spvc_compiler") long r7, @org.lwjgl.system.NativeType("spvc_set") long r9) {
            long r0 = org.lwjgl.util.spvc.Spvc.Functions.compiler_set_enabled_interface_variables
            r11 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L15
            r0 = r7
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r9
            long r0 = org.lwjgl.system.Checks.check(r0)
        L15:
            r0 = r7
            r1 = r9
            r2 = r11
            int r0 = org.lwjgl.system.JNI.invokePPI(r0, r1, r2)
            return r0
    }

    public static int nspvc_compiler_create_shader_resources(long r7, long r9) {
            long r0 = org.lwjgl.util.spvc.Spvc.Functions.compiler_create_shader_resources
            r11 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L10
            r0 = r7
            long r0 = org.lwjgl.system.Checks.check(r0)
        L10:
            r0 = r7
            r1 = r9
            r2 = r11
            int r0 = org.lwjgl.system.JNI.invokePPI(r0, r1, r2)
            return r0
    }

    @org.lwjgl.system.NativeType("spvc_result")
    public static int spvc_compiler_create_shader_resources(@org.lwjgl.system.NativeType("spvc_compiler") long r5, @org.lwjgl.system.NativeType("spvc_resources *") org.lwjgl.PointerBuffer r7) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r7
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
        Lb:
            r0 = r5
            r1 = r7
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            int r0 = nspvc_compiler_create_shader_resources(r0, r1)
            return r0
    }

    public static int nspvc_compiler_create_shader_resources_for_active_variables(long r9, long r11, long r13) {
            long r0 = org.lwjgl.util.spvc.Spvc.Functions.compiler_create_shader_resources_for_active_variables
            r15 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L16
            r0 = r9
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r13
            long r0 = org.lwjgl.system.Checks.check(r0)
        L16:
            r0 = r9
            r1 = r11
            r2 = r13
            r3 = r15
            int r0 = org.lwjgl.system.JNI.invokePPPI(r0, r1, r2, r3)
            return r0
    }

    @org.lwjgl.system.NativeType("spvc_result")
    public static int spvc_compiler_create_shader_resources_for_active_variables(@org.lwjgl.system.NativeType("spvc_compiler") long r7, @org.lwjgl.system.NativeType("spvc_resources *") org.lwjgl.PointerBuffer r9, @org.lwjgl.system.NativeType("spvc_set") long r10) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r9
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
        Lb:
            r0 = r7
            r1 = r9
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            r2 = r10
            int r0 = nspvc_compiler_create_shader_resources_for_active_variables(r0, r1, r2)
            return r0
    }

    public static int nspvc_resources_get_resource_list_for_type(long r10, int r12, long r13, long r15) {
            long r0 = org.lwjgl.util.spvc.Spvc.Functions.resources_get_resource_list_for_type
            r17 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L10
            r0 = r10
            long r0 = org.lwjgl.system.Checks.check(r0)
        L10:
            r0 = r10
            r1 = r12
            r2 = r13
            r3 = r15
            r4 = r17
            int r0 = org.lwjgl.system.JNI.invokePPPI(r0, r1, r2, r3, r4)
            return r0
    }

    @org.lwjgl.system.NativeType("spvc_result")
    public static int spvc_resources_get_resource_list_for_type(@org.lwjgl.system.NativeType("spvc_resources") long r8, @org.lwjgl.system.NativeType("spvc_resource_type") int r10, @org.lwjgl.system.NativeType("spvc_reflected_resource const **") org.lwjgl.PointerBuffer r11, @org.lwjgl.system.NativeType("size_t *") org.lwjgl.PointerBuffer r12) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L11
            r0 = r11
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
            r0 = r12
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
        L11:
            r0 = r8
            r1 = r10
            r2 = r11
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            r3 = r12
            long r3 = org.lwjgl.system.MemoryUtil.memAddress(r3)
            int r0 = nspvc_resources_get_resource_list_for_type(r0, r1, r2, r3)
            return r0
    }

    public static int nspvc_resources_get_builtin_resource_list_for_type(long r10, int r12, long r13, long r15) {
            long r0 = org.lwjgl.util.spvc.Spvc.Functions.resources_get_builtin_resource_list_for_type
            r17 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L10
            r0 = r10
            long r0 = org.lwjgl.system.Checks.check(r0)
        L10:
            r0 = r10
            r1 = r12
            r2 = r13
            r3 = r15
            r4 = r17
            int r0 = org.lwjgl.system.JNI.invokePPPI(r0, r1, r2, r3, r4)
            return r0
    }

    @org.lwjgl.system.NativeType("spvc_result")
    public static int spvc_resources_get_builtin_resource_list_for_type(@org.lwjgl.system.NativeType("spvc_resources") long r8, @org.lwjgl.system.NativeType("spvc_builtin_resource_type") int r10, @org.lwjgl.system.NativeType("spvc_reflected_builtin_resource const **") org.lwjgl.PointerBuffer r11, @org.lwjgl.system.NativeType("size_t *") org.lwjgl.PointerBuffer r12) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L11
            r0 = r11
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
            r0 = r12
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
        L11:
            r0 = r8
            r1 = r10
            r2 = r11
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            r3 = r12
            long r3 = org.lwjgl.system.MemoryUtil.memAddress(r3)
            int r0 = nspvc_resources_get_builtin_resource_list_for_type(r0, r1, r2, r3)
            return r0
    }

    public static void spvc_compiler_set_decoration(@org.lwjgl.system.NativeType("spvc_compiler") long r8, @org.lwjgl.system.NativeType("SpvId") int r10, @org.lwjgl.system.NativeType("SpvDecoration") int r11, @org.lwjgl.system.NativeType("unsigned int") int r12) {
            long r0 = org.lwjgl.util.spvc.Spvc.Functions.compiler_set_decoration
            r13 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L10
            r0 = r8
            long r0 = org.lwjgl.system.Checks.check(r0)
        L10:
            r0 = r8
            r1 = r10
            r2 = r11
            r3 = r12
            r4 = r13
            org.lwjgl.system.JNI.invokePV(r0, r1, r2, r3, r4)
            return
    }

    public static void nspvc_compiler_set_decoration_string(long r9, int r11, int r12, long r13) {
            long r0 = org.lwjgl.util.spvc.Spvc.Functions.compiler_set_decoration_string
            r15 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L10
            r0 = r9
            long r0 = org.lwjgl.system.Checks.check(r0)
        L10:
            r0 = r9
            r1 = r11
            r2 = r12
            r3 = r13
            r4 = r15
            org.lwjgl.system.JNI.invokePPV(r0, r1, r2, r3, r4)
            return
    }

    public static void spvc_compiler_set_decoration_string(@org.lwjgl.system.NativeType("spvc_compiler") long r7, @org.lwjgl.system.NativeType("SpvId") int r9, @org.lwjgl.system.NativeType("SpvDecoration") int r10, @org.lwjgl.system.NativeType("char const *") java.nio.ByteBuffer r11) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r11
            org.lwjgl.system.Checks.checkNT1(r0)
        Lb:
            r0 = r7
            r1 = r9
            r2 = r10
            r3 = r11
            long r3 = org.lwjgl.system.MemoryUtil.memAddress(r3)
            nspvc_compiler_set_decoration_string(r0, r1, r2, r3)
            return
    }

    public static void spvc_compiler_set_decoration_string(@org.lwjgl.system.NativeType("spvc_compiler") long r7, @org.lwjgl.system.NativeType("SpvId") int r9, @org.lwjgl.system.NativeType("SpvDecoration") int r10, @org.lwjgl.system.NativeType("char const *") java.lang.CharSequence r11) {
            org.lwjgl.system.MemoryStack r0 = org.lwjgl.system.MemoryStack.stackGet()
            r12 = r0
            r0 = r12
            int r0 = r0.getPointer()
            r13 = r0
            r0 = r12
            r1 = r11
            r2 = 1
            int r0 = r0.nUTF8(r1, r2)     // Catch: java.lang.Throwable -> L2e
            r0 = r12
            long r0 = r0.getPointerAddress()     // Catch: java.lang.Throwable -> L2e
            r14 = r0
            r0 = r7
            r1 = r9
            r2 = r10
            r3 = r14
            nspvc_compiler_set_decoration_string(r0, r1, r2, r3)     // Catch: java.lang.Throwable -> L2e
            r0 = r12
            r1 = r13
            r0.setPointer(r1)
            goto L3a
        L2e:
            r16 = move-exception
            r0 = r12
            r1 = r13
            r0.setPointer(r1)
            r0 = r16
            throw r0
        L3a:
            return
    }

    public static void nspvc_compiler_set_name(long r8, int r10, long r11) {
            long r0 = org.lwjgl.util.spvc.Spvc.Functions.compiler_set_name
            r13 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L10
            r0 = r8
            long r0 = org.lwjgl.system.Checks.check(r0)
        L10:
            r0 = r8
            r1 = r10
            r2 = r11
            r3 = r13
            org.lwjgl.system.JNI.invokePPV(r0, r1, r2, r3)
            return
    }

    public static void spvc_compiler_set_name(@org.lwjgl.system.NativeType("spvc_compiler") long r6, @org.lwjgl.system.NativeType("SpvId") int r8, @org.lwjgl.system.NativeType("char const *") java.nio.ByteBuffer r9) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto La
            r0 = r9
            org.lwjgl.system.Checks.checkNT1(r0)
        La:
            r0 = r6
            r1 = r8
            r2 = r9
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            nspvc_compiler_set_name(r0, r1, r2)
            return
    }

    public static void spvc_compiler_set_name(@org.lwjgl.system.NativeType("spvc_compiler") long r6, @org.lwjgl.system.NativeType("SpvId") int r8, @org.lwjgl.system.NativeType("char const *") java.lang.CharSequence r9) {
            org.lwjgl.system.MemoryStack r0 = org.lwjgl.system.MemoryStack.stackGet()
            r10 = r0
            r0 = r10
            int r0 = r0.getPointer()
            r11 = r0
            r0 = r10
            r1 = r9
            r2 = 1
            int r0 = r0.nUTF8(r1, r2)     // Catch: java.lang.Throwable -> L2c
            r0 = r10
            long r0 = r0.getPointerAddress()     // Catch: java.lang.Throwable -> L2c
            r12 = r0
            r0 = r6
            r1 = r8
            r2 = r12
            nspvc_compiler_set_name(r0, r1, r2)     // Catch: java.lang.Throwable -> L2c
            r0 = r10
            r1 = r11
            r0.setPointer(r1)
            goto L38
        L2c:
            r14 = move-exception
            r0 = r10
            r1 = r11
            r0.setPointer(r1)
            r0 = r14
            throw r0
        L38:
            return
    }

    public static void spvc_compiler_set_member_decoration(@org.lwjgl.system.NativeType("spvc_compiler") long r9, @org.lwjgl.system.NativeType("spvc_type_id") int r11, @org.lwjgl.system.NativeType("unsigned int") int r12, @org.lwjgl.system.NativeType("SpvDecoration") int r13, @org.lwjgl.system.NativeType("unsigned int") int r14) {
            long r0 = org.lwjgl.util.spvc.Spvc.Functions.compiler_set_member_decoration
            r15 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L10
            r0 = r9
            long r0 = org.lwjgl.system.Checks.check(r0)
        L10:
            r0 = r9
            r1 = r11
            r2 = r12
            r3 = r13
            r4 = r14
            r5 = r15
            org.lwjgl.system.JNI.invokePV(r0, r1, r2, r3, r4, r5)
            return
    }

    public static void nspvc_compiler_set_member_decoration_string(long r10, int r12, int r13, int r14, long r15) {
            long r0 = org.lwjgl.util.spvc.Spvc.Functions.compiler_set_member_decoration_string
            r17 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L10
            r0 = r10
            long r0 = org.lwjgl.system.Checks.check(r0)
        L10:
            r0 = r10
            r1 = r12
            r2 = r13
            r3 = r14
            r4 = r15
            r5 = r17
            org.lwjgl.system.JNI.invokePPV(r0, r1, r2, r3, r4, r5)
            return
    }

    public static void spvc_compiler_set_member_decoration_string(@org.lwjgl.system.NativeType("spvc_compiler") long r8, @org.lwjgl.system.NativeType("spvc_type_id") int r10, @org.lwjgl.system.NativeType("unsigned int") int r11, @org.lwjgl.system.NativeType("SpvDecoration") int r12, @org.lwjgl.system.NativeType("char const *") java.nio.ByteBuffer r13) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r13
            org.lwjgl.system.Checks.checkNT1(r0)
        Lb:
            r0 = r8
            r1 = r10
            r2 = r11
            r3 = r12
            r4 = r13
            long r4 = org.lwjgl.system.MemoryUtil.memAddress(r4)
            nspvc_compiler_set_member_decoration_string(r0, r1, r2, r3, r4)
            return
    }

    public static void spvc_compiler_set_member_decoration_string(@org.lwjgl.system.NativeType("spvc_compiler") long r8, @org.lwjgl.system.NativeType("spvc_type_id") int r10, @org.lwjgl.system.NativeType("unsigned int") int r11, @org.lwjgl.system.NativeType("SpvDecoration") int r12, @org.lwjgl.system.NativeType("char const *") java.lang.CharSequence r13) {
            org.lwjgl.system.MemoryStack r0 = org.lwjgl.system.MemoryStack.stackGet()
            r14 = r0
            r0 = r14
            int r0 = r0.getPointer()
            r15 = r0
            r0 = r14
            r1 = r13
            r2 = 1
            int r0 = r0.nUTF8(r1, r2)     // Catch: java.lang.Throwable -> L30
            r0 = r14
            long r0 = r0.getPointerAddress()     // Catch: java.lang.Throwable -> L30
            r16 = r0
            r0 = r8
            r1 = r10
            r2 = r11
            r3 = r12
            r4 = r16
            nspvc_compiler_set_member_decoration_string(r0, r1, r2, r3, r4)     // Catch: java.lang.Throwable -> L30
            r0 = r14
            r1 = r15
            r0.setPointer(r1)
            goto L3c
        L30:
            r18 = move-exception
            r0 = r14
            r1 = r15
            r0.setPointer(r1)
            r0 = r18
            throw r0
        L3c:
            return
    }

    public static void nspvc_compiler_set_member_name(long r9, int r11, int r12, long r13) {
            long r0 = org.lwjgl.util.spvc.Spvc.Functions.compiler_set_member_name
            r15 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L10
            r0 = r9
            long r0 = org.lwjgl.system.Checks.check(r0)
        L10:
            r0 = r9
            r1 = r11
            r2 = r12
            r3 = r13
            r4 = r15
            org.lwjgl.system.JNI.invokePPV(r0, r1, r2, r3, r4)
            return
    }

    public static void spvc_compiler_set_member_name(@org.lwjgl.system.NativeType("spvc_compiler") long r7, @org.lwjgl.system.NativeType("spvc_type_id") int r9, @org.lwjgl.system.NativeType("unsigned int") int r10, @org.lwjgl.system.NativeType("char const *") java.nio.ByteBuffer r11) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r11
            org.lwjgl.system.Checks.checkNT1(r0)
        Lb:
            r0 = r7
            r1 = r9
            r2 = r10
            r3 = r11
            long r3 = org.lwjgl.system.MemoryUtil.memAddress(r3)
            nspvc_compiler_set_member_name(r0, r1, r2, r3)
            return
    }

    public static void spvc_compiler_set_member_name(@org.lwjgl.system.NativeType("spvc_compiler") long r7, @org.lwjgl.system.NativeType("spvc_type_id") int r9, @org.lwjgl.system.NativeType("unsigned int") int r10, @org.lwjgl.system.NativeType("char const *") java.lang.CharSequence r11) {
            org.lwjgl.system.MemoryStack r0 = org.lwjgl.system.MemoryStack.stackGet()
            r12 = r0
            r0 = r12
            int r0 = r0.getPointer()
            r13 = r0
            r0 = r12
            r1 = r11
            r2 = 1
            int r0 = r0.nUTF8(r1, r2)     // Catch: java.lang.Throwable -> L2e
            r0 = r12
            long r0 = r0.getPointerAddress()     // Catch: java.lang.Throwable -> L2e
            r14 = r0
            r0 = r7
            r1 = r9
            r2 = r10
            r3 = r14
            nspvc_compiler_set_member_name(r0, r1, r2, r3)     // Catch: java.lang.Throwable -> L2e
            r0 = r12
            r1 = r13
            r0.setPointer(r1)
            goto L3a
        L2e:
            r16 = move-exception
            r0 = r12
            r1 = r13
            r0.setPointer(r1)
            r0 = r16
            throw r0
        L3a:
            return
    }

    public static void spvc_compiler_unset_decoration(@org.lwjgl.system.NativeType("spvc_compiler") long r7, @org.lwjgl.system.NativeType("SpvId") int r9, @org.lwjgl.system.NativeType("SpvDecoration") int r10) {
            long r0 = org.lwjgl.util.spvc.Spvc.Functions.compiler_unset_decoration
            r11 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L10
            r0 = r7
            long r0 = org.lwjgl.system.Checks.check(r0)
        L10:
            r0 = r7
            r1 = r9
            r2 = r10
            r3 = r11
            org.lwjgl.system.JNI.invokePV(r0, r1, r2, r3)
            return
    }

    public static void spvc_compiler_unset_member_decoration(@org.lwjgl.system.NativeType("spvc_compiler") long r8, @org.lwjgl.system.NativeType("spvc_type_id") int r10, @org.lwjgl.system.NativeType("unsigned int") int r11, @org.lwjgl.system.NativeType("SpvDecoration") int r12) {
            long r0 = org.lwjgl.util.spvc.Spvc.Functions.compiler_unset_member_decoration
            r13 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L10
            r0 = r8
            long r0 = org.lwjgl.system.Checks.check(r0)
        L10:
            r0 = r8
            r1 = r10
            r2 = r11
            r3 = r12
            r4 = r13
            org.lwjgl.system.JNI.invokePV(r0, r1, r2, r3, r4)
            return
    }

    @org.lwjgl.system.NativeType("spvc_bool")
    public static boolean spvc_compiler_has_decoration(@org.lwjgl.system.NativeType("spvc_compiler") long r7, @org.lwjgl.system.NativeType("SpvId") int r9, @org.lwjgl.system.NativeType("SpvDecoration") int r10) {
            long r0 = org.lwjgl.util.spvc.Spvc.Functions.compiler_has_decoration
            r11 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L10
            r0 = r7
            long r0 = org.lwjgl.system.Checks.check(r0)
        L10:
            r0 = r7
            r1 = r9
            r2 = r10
            r3 = r11
            boolean r0 = org.lwjgl.system.JNI.invokePZ(r0, r1, r2, r3)
            return r0
    }

    @org.lwjgl.system.NativeType("spvc_bool")
    public static boolean spvc_compiler_has_member_decoration(@org.lwjgl.system.NativeType("spvc_compiler") long r8, @org.lwjgl.system.NativeType("spvc_type_id") int r10, @org.lwjgl.system.NativeType("unsigned int") int r11, @org.lwjgl.system.NativeType("SpvDecoration") int r12) {
            long r0 = org.lwjgl.util.spvc.Spvc.Functions.compiler_has_member_decoration
            r13 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L10
            r0 = r8
            long r0 = org.lwjgl.system.Checks.check(r0)
        L10:
            r0 = r8
            r1 = r10
            r2 = r11
            r3 = r12
            r4 = r13
            boolean r0 = org.lwjgl.system.JNI.invokePZ(r0, r1, r2, r3, r4)
            return r0
    }

    public static long nspvc_compiler_get_name(long r6, int r8) {
            long r0 = org.lwjgl.util.spvc.Spvc.Functions.compiler_get_name
            r9 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lf
            r0 = r6
            long r0 = org.lwjgl.system.Checks.check(r0)
        Lf:
            r0 = r6
            r1 = r8
            r2 = r9
            long r0 = org.lwjgl.system.JNI.invokePP(r0, r1, r2)
            return r0
    }

    @org.lwjgl.system.NativeType("char const *")
    public static java.lang.String spvc_compiler_get_name(@org.lwjgl.system.NativeType("spvc_compiler") long r4, @org.lwjgl.system.NativeType("SpvId") int r6) {
            r0 = r4
            r1 = r6
            long r0 = nspvc_compiler_get_name(r0, r1)
            r7 = r0
            r0 = r7
            java.lang.String r0 = org.lwjgl.system.MemoryUtil.memUTF8Safe(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("unsigned int")
    public static int spvc_compiler_get_decoration(@org.lwjgl.system.NativeType("spvc_compiler") long r7, @org.lwjgl.system.NativeType("SpvId") int r9, @org.lwjgl.system.NativeType("SpvDecoration") int r10) {
            long r0 = org.lwjgl.util.spvc.Spvc.Functions.compiler_get_decoration
            r11 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L10
            r0 = r7
            long r0 = org.lwjgl.system.Checks.check(r0)
        L10:
            r0 = r7
            r1 = r9
            r2 = r10
            r3 = r11
            int r0 = org.lwjgl.system.JNI.invokePI(r0, r1, r2, r3)
            return r0
    }

    public static long nspvc_compiler_get_decoration_string(long r7, int r9, int r10) {
            long r0 = org.lwjgl.util.spvc.Spvc.Functions.compiler_get_decoration_string
            r11 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L10
            r0 = r7
            long r0 = org.lwjgl.system.Checks.check(r0)
        L10:
            r0 = r7
            r1 = r9
            r2 = r10
            r3 = r11
            long r0 = org.lwjgl.system.JNI.invokePP(r0, r1, r2, r3)
            return r0
    }

    @org.lwjgl.system.NativeType("char const *")
    public static java.lang.String spvc_compiler_get_decoration_string(@org.lwjgl.system.NativeType("spvc_compiler") long r5, @org.lwjgl.system.NativeType("SpvId") int r7, @org.lwjgl.system.NativeType("SpvDecoration") int r8) {
            r0 = r5
            r1 = r7
            r2 = r8
            long r0 = nspvc_compiler_get_decoration_string(r0, r1, r2)
            r9 = r0
            r0 = r9
            java.lang.String r0 = org.lwjgl.system.MemoryUtil.memUTF8Safe(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("unsigned int")
    public static int spvc_compiler_get_member_decoration(@org.lwjgl.system.NativeType("spvc_compiler") long r8, @org.lwjgl.system.NativeType("spvc_type_id") int r10, @org.lwjgl.system.NativeType("unsigned int") int r11, @org.lwjgl.system.NativeType("SpvDecoration") int r12) {
            long r0 = org.lwjgl.util.spvc.Spvc.Functions.compiler_get_member_decoration
            r13 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L10
            r0 = r8
            long r0 = org.lwjgl.system.Checks.check(r0)
        L10:
            r0 = r8
            r1 = r10
            r2 = r11
            r3 = r12
            r4 = r13
            int r0 = org.lwjgl.system.JNI.invokePI(r0, r1, r2, r3, r4)
            return r0
    }

    public static long nspvc_compiler_get_member_decoration_string(long r8, int r10, int r11, int r12) {
            long r0 = org.lwjgl.util.spvc.Spvc.Functions.compiler_get_member_decoration_string
            r13 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L10
            r0 = r8
            long r0 = org.lwjgl.system.Checks.check(r0)
        L10:
            r0 = r8
            r1 = r10
            r2 = r11
            r3 = r12
            r4 = r13
            long r0 = org.lwjgl.system.JNI.invokePP(r0, r1, r2, r3, r4)
            return r0
    }

    @org.lwjgl.system.NativeType("char const *")
    public static java.lang.String spvc_compiler_get_member_decoration_string(@org.lwjgl.system.NativeType("spvc_compiler") long r6, @org.lwjgl.system.NativeType("spvc_type_id") int r8, @org.lwjgl.system.NativeType("unsigned int") int r9, @org.lwjgl.system.NativeType("SpvDecoration") int r10) {
            r0 = r6
            r1 = r8
            r2 = r9
            r3 = r10
            long r0 = nspvc_compiler_get_member_decoration_string(r0, r1, r2, r3)
            r11 = r0
            r0 = r11
            java.lang.String r0 = org.lwjgl.system.MemoryUtil.memUTF8Safe(r0)
            return r0
    }

    public static long nspvc_compiler_get_member_name(long r7, int r9, int r10) {
            long r0 = org.lwjgl.util.spvc.Spvc.Functions.compiler_get_member_name
            r11 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L10
            r0 = r7
            long r0 = org.lwjgl.system.Checks.check(r0)
        L10:
            r0 = r7
            r1 = r9
            r2 = r10
            r3 = r11
            long r0 = org.lwjgl.system.JNI.invokePP(r0, r1, r2, r3)
            return r0
    }

    @org.lwjgl.system.NativeType("char const *")
    public static java.lang.String spvc_compiler_get_member_name(@org.lwjgl.system.NativeType("spvc_compiler") long r5, @org.lwjgl.system.NativeType("spvc_type_id") int r7, @org.lwjgl.system.NativeType("unsigned int") int r8) {
            r0 = r5
            r1 = r7
            r2 = r8
            long r0 = nspvc_compiler_get_member_name(r0, r1, r2)
            r9 = r0
            r0 = r9
            java.lang.String r0 = org.lwjgl.system.MemoryUtil.memUTF8Safe(r0)
            return r0
    }

    public static int nspvc_compiler_get_entry_points(long r9, long r11, long r13) {
            long r0 = org.lwjgl.util.spvc.Spvc.Functions.compiler_get_entry_points
            r15 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L10
            r0 = r9
            long r0 = org.lwjgl.system.Checks.check(r0)
        L10:
            r0 = r9
            r1 = r11
            r2 = r13
            r3 = r15
            int r0 = org.lwjgl.system.JNI.invokePPPI(r0, r1, r2, r3)
            return r0
    }

    @org.lwjgl.system.NativeType("spvc_result")
    public static int spvc_compiler_get_entry_points(@org.lwjgl.system.NativeType("spvc_compiler") long r7, @org.lwjgl.system.NativeType("spvc_entry_point const **") org.lwjgl.PointerBuffer r9, @org.lwjgl.system.NativeType("size_t *") org.lwjgl.PointerBuffer r10) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L10
            r0 = r9
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
            r0 = r10
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
        L10:
            r0 = r7
            r1 = r9
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            r2 = r10
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            int r0 = nspvc_compiler_get_entry_points(r0, r1, r2)
            return r0
    }

    public static int nspvc_compiler_set_entry_point(long r8, long r10, int r12) {
            long r0 = org.lwjgl.util.spvc.Spvc.Functions.compiler_set_entry_point
            r13 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L10
            r0 = r8
            long r0 = org.lwjgl.system.Checks.check(r0)
        L10:
            r0 = r8
            r1 = r10
            r2 = r12
            r3 = r13
            int r0 = org.lwjgl.system.JNI.invokePPI(r0, r1, r2, r3)
            return r0
    }

    @org.lwjgl.system.NativeType("spvc_result")
    public static int spvc_compiler_set_entry_point(@org.lwjgl.system.NativeType("spvc_compiler") long r6, @org.lwjgl.system.NativeType("char const *") java.nio.ByteBuffer r8, @org.lwjgl.system.NativeType("SpvExecutionModel") int r9) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto La
            r0 = r8
            org.lwjgl.system.Checks.checkNT1(r0)
        La:
            r0 = r6
            r1 = r8
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            r2 = r9
            int r0 = nspvc_compiler_set_entry_point(r0, r1, r2)
            return r0
    }

    @org.lwjgl.system.NativeType("spvc_result")
    public static int spvc_compiler_set_entry_point(@org.lwjgl.system.NativeType("spvc_compiler") long r6, @org.lwjgl.system.NativeType("char const *") java.lang.CharSequence r8, @org.lwjgl.system.NativeType("SpvExecutionModel") int r9) {
            org.lwjgl.system.MemoryStack r0 = org.lwjgl.system.MemoryStack.stackGet()
            r10 = r0
            r0 = r10
            int r0 = r0.getPointer()
            r11 = r0
            r0 = r10
            r1 = r8
            r2 = 1
            int r0 = r0.nUTF8(r1, r2)     // Catch: java.lang.Throwable -> L2e
            r0 = r10
            long r0 = r0.getPointerAddress()     // Catch: java.lang.Throwable -> L2e
            r12 = r0
            r0 = r6
            r1 = r12
            r2 = r9
            int r0 = nspvc_compiler_set_entry_point(r0, r1, r2)     // Catch: java.lang.Throwable -> L2e
            r14 = r0
            r0 = r10
            r1 = r11
            r0.setPointer(r1)
            r0 = r14
            return r0
        L2e:
            r15 = move-exception
            r0 = r10
            r1 = r11
            r0.setPointer(r1)
            r0 = r15
            throw r0
    }

    public static int nspvc_compiler_rename_entry_point(long r10, long r12, long r14, int r16) {
            long r0 = org.lwjgl.util.spvc.Spvc.Functions.compiler_rename_entry_point
            r17 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L10
            r0 = r10
            long r0 = org.lwjgl.system.Checks.check(r0)
        L10:
            r0 = r10
            r1 = r12
            r2 = r14
            r3 = r16
            r4 = r17
            int r0 = org.lwjgl.system.JNI.invokePPPI(r0, r1, r2, r3, r4)
            return r0
    }

    @org.lwjgl.system.NativeType("spvc_result")
    public static int spvc_compiler_rename_entry_point(@org.lwjgl.system.NativeType("spvc_compiler") long r8, @org.lwjgl.system.NativeType("char const *") java.nio.ByteBuffer r10, @org.lwjgl.system.NativeType("char const *") java.nio.ByteBuffer r11, @org.lwjgl.system.NativeType("SpvExecutionModel") int r12) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Le
            r0 = r10
            org.lwjgl.system.Checks.checkNT1(r0)
            r0 = r11
            org.lwjgl.system.Checks.checkNT1(r0)
        Le:
            r0 = r8
            r1 = r10
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            r2 = r11
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            r3 = r12
            int r0 = nspvc_compiler_rename_entry_point(r0, r1, r2, r3)
            return r0
    }

    @org.lwjgl.system.NativeType("spvc_result")
    public static int spvc_compiler_rename_entry_point(@org.lwjgl.system.NativeType("spvc_compiler") long r8, @org.lwjgl.system.NativeType("char const *") java.lang.CharSequence r10, @org.lwjgl.system.NativeType("char const *") java.lang.CharSequence r11, @org.lwjgl.system.NativeType("SpvExecutionModel") int r12) {
            org.lwjgl.system.MemoryStack r0 = org.lwjgl.system.MemoryStack.stackGet()
            r13 = r0
            r0 = r13
            int r0 = r0.getPointer()
            r14 = r0
            r0 = r13
            r1 = r10
            r2 = 1
            int r0 = r0.nUTF8(r1, r2)     // Catch: java.lang.Throwable -> L40
            r0 = r13
            long r0 = r0.getPointerAddress()     // Catch: java.lang.Throwable -> L40
            r15 = r0
            r0 = r13
            r1 = r11
            r2 = 1
            int r0 = r0.nUTF8(r1, r2)     // Catch: java.lang.Throwable -> L40
            r0 = r13
            long r0 = r0.getPointerAddress()     // Catch: java.lang.Throwable -> L40
            r17 = r0
            r0 = r8
            r1 = r15
            r2 = r17
            r3 = r12
            int r0 = nspvc_compiler_rename_entry_point(r0, r1, r2, r3)     // Catch: java.lang.Throwable -> L40
            r19 = r0
            r0 = r13
            r1 = r14
            r0.setPointer(r1)
            r0 = r19
            return r0
        L40:
            r20 = move-exception
            r0 = r13
            r1 = r14
            r0.setPointer(r1)
            r0 = r20
            throw r0
    }

    public static long nspvc_compiler_get_cleansed_entry_point_name(long r8, long r10, int r12) {
            long r0 = org.lwjgl.util.spvc.Spvc.Functions.compiler_get_cleansed_entry_point_name
            r13 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L10
            r0 = r8
            long r0 = org.lwjgl.system.Checks.check(r0)
        L10:
            r0 = r8
            r1 = r10
            r2 = r12
            r3 = r13
            long r0 = org.lwjgl.system.JNI.invokePPP(r0, r1, r2, r3)
            return r0
    }

    @org.lwjgl.system.NativeType("char const *")
    public static java.lang.String spvc_compiler_get_cleansed_entry_point_name(@org.lwjgl.system.NativeType("spvc_compiler") long r6, @org.lwjgl.system.NativeType("char const *") java.nio.ByteBuffer r8, @org.lwjgl.system.NativeType("SpvExecutionModel") int r9) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto La
            r0 = r8
            org.lwjgl.system.Checks.checkNT1(r0)
        La:
            r0 = r6
            r1 = r8
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            r2 = r9
            long r0 = nspvc_compiler_get_cleansed_entry_point_name(r0, r1, r2)
            r10 = r0
            r0 = r10
            java.lang.String r0 = org.lwjgl.system.MemoryUtil.memUTF8Safe(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("char const *")
    public static java.lang.String spvc_compiler_get_cleansed_entry_point_name(@org.lwjgl.system.NativeType("spvc_compiler") long r6, @org.lwjgl.system.NativeType("char const *") java.lang.CharSequence r8, @org.lwjgl.system.NativeType("SpvExecutionModel") int r9) {
            org.lwjgl.system.MemoryStack r0 = org.lwjgl.system.MemoryStack.stackGet()
            r10 = r0
            r0 = r10
            int r0 = r0.getPointer()
            r11 = r0
            r0 = r10
            r1 = r8
            r2 = 1
            int r0 = r0.nUTF8(r1, r2)     // Catch: java.lang.Throwable -> L35
            r0 = r10
            long r0 = r0.getPointerAddress()     // Catch: java.lang.Throwable -> L35
            r12 = r0
            r0 = r6
            r1 = r12
            r2 = r9
            long r0 = nspvc_compiler_get_cleansed_entry_point_name(r0, r1, r2)     // Catch: java.lang.Throwable -> L35
            r14 = r0
            r0 = r14
            java.lang.String r0 = org.lwjgl.system.MemoryUtil.memUTF8Safe(r0)     // Catch: java.lang.Throwable -> L35
            r16 = r0
            r0 = r10
            r1 = r11
            r0.setPointer(r1)
            r0 = r16
            return r0
        L35:
            r17 = move-exception
            r0 = r10
            r1 = r11
            r0.setPointer(r1)
            r0 = r17
            throw r0
    }

    public static void spvc_compiler_set_execution_mode(@org.lwjgl.system.NativeType("spvc_compiler") long r6, @org.lwjgl.system.NativeType("SpvExecutionMode") int r8) {
            long r0 = org.lwjgl.util.spvc.Spvc.Functions.compiler_set_execution_mode
            r9 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lf
            r0 = r6
            long r0 = org.lwjgl.system.Checks.check(r0)
        Lf:
            r0 = r6
            r1 = r8
            r2 = r9
            org.lwjgl.system.JNI.invokePV(r0, r1, r2)
            return
    }

    public static void spvc_compiler_unset_execution_mode(@org.lwjgl.system.NativeType("spvc_compiler") long r6, @org.lwjgl.system.NativeType("SpvExecutionMode") int r8) {
            long r0 = org.lwjgl.util.spvc.Spvc.Functions.compiler_unset_execution_mode
            r9 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lf
            r0 = r6
            long r0 = org.lwjgl.system.Checks.check(r0)
        Lf:
            r0 = r6
            r1 = r8
            r2 = r9
            org.lwjgl.system.JNI.invokePV(r0, r1, r2)
            return
    }

    public static void spvc_compiler_set_execution_mode_with_arguments(@org.lwjgl.system.NativeType("spvc_compiler") long r9, @org.lwjgl.system.NativeType("SpvExecutionMode") int r11, @org.lwjgl.system.NativeType("unsigned int") int r12, @org.lwjgl.system.NativeType("unsigned int") int r13, @org.lwjgl.system.NativeType("unsigned int") int r14) {
            long r0 = org.lwjgl.util.spvc.Spvc.Functions.compiler_set_execution_mode_with_arguments
            r15 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L10
            r0 = r9
            long r0 = org.lwjgl.system.Checks.check(r0)
        L10:
            r0 = r9
            r1 = r11
            r2 = r12
            r3 = r13
            r4 = r14
            r5 = r15
            org.lwjgl.system.JNI.invokePV(r0, r1, r2, r3, r4, r5)
            return
    }

    public static int nspvc_compiler_get_execution_modes(long r9, long r11, long r13) {
            long r0 = org.lwjgl.util.spvc.Spvc.Functions.compiler_get_execution_modes
            r15 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L10
            r0 = r9
            long r0 = org.lwjgl.system.Checks.check(r0)
        L10:
            r0 = r9
            r1 = r11
            r2 = r13
            r3 = r15
            int r0 = org.lwjgl.system.JNI.invokePPPI(r0, r1, r2, r3)
            return r0
    }

    @org.lwjgl.system.NativeType("spvc_result")
    public static int spvc_compiler_get_execution_modes(@org.lwjgl.system.NativeType("spvc_compiler") long r7, @org.lwjgl.system.NativeType("SpvExecutionMode const **") org.lwjgl.PointerBuffer r9, @org.lwjgl.system.NativeType("size_t *") org.lwjgl.PointerBuffer r10) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L10
            r0 = r9
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
            r0 = r10
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
        L10:
            r0 = r7
            r1 = r9
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            r2 = r10
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            int r0 = nspvc_compiler_get_execution_modes(r0, r1, r2)
            return r0
    }

    @org.lwjgl.system.NativeType("unsigned int")
    public static int spvc_compiler_get_execution_mode_argument(@org.lwjgl.system.NativeType("spvc_compiler") long r6, @org.lwjgl.system.NativeType("SpvExecutionMode") int r8) {
            long r0 = org.lwjgl.util.spvc.Spvc.Functions.compiler_get_execution_mode_argument
            r9 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lf
            r0 = r6
            long r0 = org.lwjgl.system.Checks.check(r0)
        Lf:
            r0 = r6
            r1 = r8
            r2 = r9
            int r0 = org.lwjgl.system.JNI.invokePI(r0, r1, r2)
            return r0
    }

    @org.lwjgl.system.NativeType("unsigned int")
    public static int spvc_compiler_get_execution_mode_argument_by_index(@org.lwjgl.system.NativeType("spvc_compiler") long r7, @org.lwjgl.system.NativeType("SpvExecutionMode") int r9, @org.lwjgl.system.NativeType("unsigned int") int r10) {
            long r0 = org.lwjgl.util.spvc.Spvc.Functions.compiler_get_execution_mode_argument_by_index
            r11 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L10
            r0 = r7
            long r0 = org.lwjgl.system.Checks.check(r0)
        L10:
            r0 = r7
            r1 = r9
            r2 = r10
            r3 = r11
            int r0 = org.lwjgl.system.JNI.invokePI(r0, r1, r2, r3)
            return r0
    }

    @org.lwjgl.system.NativeType("SpvExecutionModel")
    public static int spvc_compiler_get_execution_model(@org.lwjgl.system.NativeType("spvc_compiler") long r5) {
            long r0 = org.lwjgl.util.spvc.Spvc.Functions.compiler_get_execution_model
            r7 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lf
            r0 = r5
            long r0 = org.lwjgl.system.Checks.check(r0)
        Lf:
            r0 = r5
            r1 = r7
            int r0 = org.lwjgl.system.JNI.invokePI(r0, r1)
            return r0
    }

    public static void spvc_compiler_update_active_builtins(@org.lwjgl.system.NativeType("spvc_compiler") long r5) {
            long r0 = org.lwjgl.util.spvc.Spvc.Functions.compiler_update_active_builtins
            r7 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lf
            r0 = r5
            long r0 = org.lwjgl.system.Checks.check(r0)
        Lf:
            r0 = r5
            r1 = r7
            org.lwjgl.system.JNI.invokePV(r0, r1)
            return
    }

    @org.lwjgl.system.NativeType("spvc_bool")
    public static boolean spvc_compiler_has_active_builtin(@org.lwjgl.system.NativeType("spvc_compiler") long r7, @org.lwjgl.system.NativeType("SpvBuiltIn") int r9, @org.lwjgl.system.NativeType("SpvStorageClass") int r10) {
            long r0 = org.lwjgl.util.spvc.Spvc.Functions.compiler_has_active_builtin
            r11 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L10
            r0 = r7
            long r0 = org.lwjgl.system.Checks.check(r0)
        L10:
            r0 = r7
            r1 = r9
            r2 = r10
            r3 = r11
            boolean r0 = org.lwjgl.system.JNI.invokePZ(r0, r1, r2, r3)
            return r0
    }

    @org.lwjgl.system.NativeType("spvc_type")
    public static long spvc_compiler_get_type_handle(@org.lwjgl.system.NativeType("spvc_compiler") long r6, @org.lwjgl.system.NativeType("spvc_type_id") int r8) {
            long r0 = org.lwjgl.util.spvc.Spvc.Functions.compiler_get_type_handle
            r9 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lf
            r0 = r6
            long r0 = org.lwjgl.system.Checks.check(r0)
        Lf:
            r0 = r6
            r1 = r8
            r2 = r9
            long r0 = org.lwjgl.system.JNI.invokePP(r0, r1, r2)
            return r0
    }

    @org.lwjgl.system.NativeType("spvc_type_id")
    public static int spvc_type_get_base_type_id(@org.lwjgl.system.NativeType("spvc_type") long r5) {
            long r0 = org.lwjgl.util.spvc.Spvc.Functions.type_get_base_type_id
            r7 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lf
            r0 = r5
            long r0 = org.lwjgl.system.Checks.check(r0)
        Lf:
            r0 = r5
            r1 = r7
            int r0 = org.lwjgl.system.JNI.invokePI(r0, r1)
            return r0
    }

    @org.lwjgl.system.NativeType("spvc_basetype")
    public static int spvc_type_get_basetype(@org.lwjgl.system.NativeType("spvc_type") long r5) {
            long r0 = org.lwjgl.util.spvc.Spvc.Functions.type_get_basetype
            r7 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lf
            r0 = r5
            long r0 = org.lwjgl.system.Checks.check(r0)
        Lf:
            r0 = r5
            r1 = r7
            int r0 = org.lwjgl.system.JNI.invokePI(r0, r1)
            return r0
    }

    @org.lwjgl.system.NativeType("unsigned int")
    public static int spvc_type_get_bit_width(@org.lwjgl.system.NativeType("spvc_type") long r5) {
            long r0 = org.lwjgl.util.spvc.Spvc.Functions.type_get_bit_width
            r7 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lf
            r0 = r5
            long r0 = org.lwjgl.system.Checks.check(r0)
        Lf:
            r0 = r5
            r1 = r7
            int r0 = org.lwjgl.system.JNI.invokePI(r0, r1)
            return r0
    }

    @org.lwjgl.system.NativeType("unsigned int")
    public static int spvc_type_get_vector_size(@org.lwjgl.system.NativeType("spvc_type") long r5) {
            long r0 = org.lwjgl.util.spvc.Spvc.Functions.type_get_vector_size
            r7 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lf
            r0 = r5
            long r0 = org.lwjgl.system.Checks.check(r0)
        Lf:
            r0 = r5
            r1 = r7
            int r0 = org.lwjgl.system.JNI.invokePI(r0, r1)
            return r0
    }

    @org.lwjgl.system.NativeType("unsigned int")
    public static int spvc_type_get_columns(@org.lwjgl.system.NativeType("spvc_type") long r5) {
            long r0 = org.lwjgl.util.spvc.Spvc.Functions.type_get_columns
            r7 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lf
            r0 = r5
            long r0 = org.lwjgl.system.Checks.check(r0)
        Lf:
            r0 = r5
            r1 = r7
            int r0 = org.lwjgl.system.JNI.invokePI(r0, r1)
            return r0
    }

    @org.lwjgl.system.NativeType("unsigned int")
    public static int spvc_type_get_num_array_dimensions(@org.lwjgl.system.NativeType("spvc_type") long r5) {
            long r0 = org.lwjgl.util.spvc.Spvc.Functions.type_get_num_array_dimensions
            r7 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lf
            r0 = r5
            long r0 = org.lwjgl.system.Checks.check(r0)
        Lf:
            r0 = r5
            r1 = r7
            int r0 = org.lwjgl.system.JNI.invokePI(r0, r1)
            return r0
    }

    @org.lwjgl.system.NativeType("spvc_bool")
    public static boolean spvc_type_array_dimension_is_literal(@org.lwjgl.system.NativeType("spvc_type") long r6, @org.lwjgl.system.NativeType("unsigned int") int r8) {
            long r0 = org.lwjgl.util.spvc.Spvc.Functions.type_array_dimension_is_literal
            r9 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lf
            r0 = r6
            long r0 = org.lwjgl.system.Checks.check(r0)
        Lf:
            r0 = r6
            r1 = r8
            r2 = r9
            boolean r0 = org.lwjgl.system.JNI.invokePZ(r0, r1, r2)
            return r0
    }

    @org.lwjgl.system.NativeType("SpvId")
    public static int spvc_type_get_array_dimension(@org.lwjgl.system.NativeType("spvc_type") long r6, @org.lwjgl.system.NativeType("unsigned int") int r8) {
            long r0 = org.lwjgl.util.spvc.Spvc.Functions.type_get_array_dimension
            r9 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lf
            r0 = r6
            long r0 = org.lwjgl.system.Checks.check(r0)
        Lf:
            r0 = r6
            r1 = r8
            r2 = r9
            int r0 = org.lwjgl.system.JNI.invokePI(r0, r1, r2)
            return r0
    }

    @org.lwjgl.system.NativeType("unsigned int")
    public static int spvc_type_get_num_member_types(@org.lwjgl.system.NativeType("spvc_type") long r5) {
            long r0 = org.lwjgl.util.spvc.Spvc.Functions.type_get_num_member_types
            r7 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lf
            r0 = r5
            long r0 = org.lwjgl.system.Checks.check(r0)
        Lf:
            r0 = r5
            r1 = r7
            int r0 = org.lwjgl.system.JNI.invokePI(r0, r1)
            return r0
    }

    @org.lwjgl.system.NativeType("spvc_type_id")
    public static int spvc_type_get_member_type(@org.lwjgl.system.NativeType("spvc_type") long r6, @org.lwjgl.system.NativeType("unsigned int") int r8) {
            long r0 = org.lwjgl.util.spvc.Spvc.Functions.type_get_member_type
            r9 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lf
            r0 = r6
            long r0 = org.lwjgl.system.Checks.check(r0)
        Lf:
            r0 = r6
            r1 = r8
            r2 = r9
            int r0 = org.lwjgl.system.JNI.invokePI(r0, r1, r2)
            return r0
    }

    @org.lwjgl.system.NativeType("SpvStorageClass")
    public static int spvc_type_get_storage_class(@org.lwjgl.system.NativeType("spvc_type") long r5) {
            long r0 = org.lwjgl.util.spvc.Spvc.Functions.type_get_storage_class
            r7 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lf
            r0 = r5
            long r0 = org.lwjgl.system.Checks.check(r0)
        Lf:
            r0 = r5
            r1 = r7
            int r0 = org.lwjgl.system.JNI.invokePI(r0, r1)
            return r0
    }

    @org.lwjgl.system.NativeType("spvc_type_id")
    public static int spvc_type_get_image_sampled_type(@org.lwjgl.system.NativeType("spvc_type") long r5) {
            long r0 = org.lwjgl.util.spvc.Spvc.Functions.type_get_image_sampled_type
            r7 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lf
            r0 = r5
            long r0 = org.lwjgl.system.Checks.check(r0)
        Lf:
            r0 = r5
            r1 = r7
            int r0 = org.lwjgl.system.JNI.invokePI(r0, r1)
            return r0
    }

    @org.lwjgl.system.NativeType("SpvDim")
    public static int spvc_type_get_image_dimension(@org.lwjgl.system.NativeType("spvc_type") long r5) {
            long r0 = org.lwjgl.util.spvc.Spvc.Functions.type_get_image_dimension
            r7 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lf
            r0 = r5
            long r0 = org.lwjgl.system.Checks.check(r0)
        Lf:
            r0 = r5
            r1 = r7
            int r0 = org.lwjgl.system.JNI.invokePI(r0, r1)
            return r0
    }

    @org.lwjgl.system.NativeType("spvc_bool")
    public static boolean spvc_type_get_image_is_depth(@org.lwjgl.system.NativeType("spvc_type") long r5) {
            long r0 = org.lwjgl.util.spvc.Spvc.Functions.type_get_image_is_depth
            r7 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lf
            r0 = r5
            long r0 = org.lwjgl.system.Checks.check(r0)
        Lf:
            r0 = r5
            r1 = r7
            boolean r0 = org.lwjgl.system.JNI.invokePZ(r0, r1)
            return r0
    }

    @org.lwjgl.system.NativeType("spvc_bool")
    public static boolean spvc_type_get_image_arrayed(@org.lwjgl.system.NativeType("spvc_type") long r5) {
            long r0 = org.lwjgl.util.spvc.Spvc.Functions.type_get_image_arrayed
            r7 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lf
            r0 = r5
            long r0 = org.lwjgl.system.Checks.check(r0)
        Lf:
            r0 = r5
            r1 = r7
            boolean r0 = org.lwjgl.system.JNI.invokePZ(r0, r1)
            return r0
    }

    @org.lwjgl.system.NativeType("spvc_bool")
    public static boolean spvc_type_get_image_multisampled(@org.lwjgl.system.NativeType("spvc_type") long r5) {
            long r0 = org.lwjgl.util.spvc.Spvc.Functions.type_get_image_multisampled
            r7 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lf
            r0 = r5
            long r0 = org.lwjgl.system.Checks.check(r0)
        Lf:
            r0 = r5
            r1 = r7
            boolean r0 = org.lwjgl.system.JNI.invokePZ(r0, r1)
            return r0
    }

    @org.lwjgl.system.NativeType("spvc_bool")
    public static boolean spvc_type_get_image_is_storage(@org.lwjgl.system.NativeType("spvc_type") long r5) {
            long r0 = org.lwjgl.util.spvc.Spvc.Functions.type_get_image_is_storage
            r7 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lf
            r0 = r5
            long r0 = org.lwjgl.system.Checks.check(r0)
        Lf:
            r0 = r5
            r1 = r7
            boolean r0 = org.lwjgl.system.JNI.invokePZ(r0, r1)
            return r0
    }

    @org.lwjgl.system.NativeType("SpvImageFormat")
    public static int spvc_type_get_image_storage_format(@org.lwjgl.system.NativeType("spvc_type") long r5) {
            long r0 = org.lwjgl.util.spvc.Spvc.Functions.type_get_image_storage_format
            r7 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lf
            r0 = r5
            long r0 = org.lwjgl.system.Checks.check(r0)
        Lf:
            r0 = r5
            r1 = r7
            int r0 = org.lwjgl.system.JNI.invokePI(r0, r1)
            return r0
    }

    @org.lwjgl.system.NativeType("SpvAccessQualifier")
    public static int spvc_type_get_image_access_qualifier(@org.lwjgl.system.NativeType("spvc_type") long r5) {
            long r0 = org.lwjgl.util.spvc.Spvc.Functions.type_get_image_access_qualifier
            r7 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lf
            r0 = r5
            long r0 = org.lwjgl.system.Checks.check(r0)
        Lf:
            r0 = r5
            r1 = r7
            int r0 = org.lwjgl.system.JNI.invokePI(r0, r1)
            return r0
    }

    public static int nspvc_compiler_get_declared_struct_size(long r9, long r11, long r13) {
            long r0 = org.lwjgl.util.spvc.Spvc.Functions.compiler_get_declared_struct_size
            r15 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L15
            r0 = r9
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r11
            long r0 = org.lwjgl.system.Checks.check(r0)
        L15:
            r0 = r9
            r1 = r11
            r2 = r13
            r3 = r15
            int r0 = org.lwjgl.system.JNI.invokePPPI(r0, r1, r2, r3)
            return r0
    }

    @org.lwjgl.system.NativeType("spvc_result")
    public static int spvc_compiler_get_declared_struct_size(@org.lwjgl.system.NativeType("spvc_compiler") long r7, @org.lwjgl.system.NativeType("spvc_type") long r9, @org.lwjgl.system.NativeType("size_t *") org.lwjgl.PointerBuffer r11) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lc
            r0 = r11
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
        Lc:
            r0 = r7
            r1 = r9
            r2 = r11
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            int r0 = nspvc_compiler_get_declared_struct_size(r0, r1, r2)
            return r0
    }

    public static int nspvc_compiler_get_declared_struct_size_runtime_array(long r11, long r13, long r15, long r17) {
            long r0 = org.lwjgl.util.spvc.Spvc.Functions.compiler_get_declared_struct_size_runtime_array
            r19 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L15
            r0 = r11
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r13
            long r0 = org.lwjgl.system.Checks.check(r0)
        L15:
            r0 = r11
            r1 = r13
            r2 = r15
            r3 = r17
            r4 = r19
            int r0 = org.lwjgl.system.JNI.invokePPPPI(r0, r1, r2, r3, r4)
            return r0
    }

    @org.lwjgl.system.NativeType("spvc_result")
    public static int spvc_compiler_get_declared_struct_size_runtime_array(@org.lwjgl.system.NativeType("spvc_compiler") long r9, @org.lwjgl.system.NativeType("spvc_type") long r11, @org.lwjgl.system.NativeType("size_t") long r13, @org.lwjgl.system.NativeType("size_t *") org.lwjgl.PointerBuffer r15) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lc
            r0 = r15
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
        Lc:
            r0 = r9
            r1 = r11
            r2 = r13
            r3 = r15
            long r3 = org.lwjgl.system.MemoryUtil.memAddress(r3)
            int r0 = nspvc_compiler_get_declared_struct_size_runtime_array(r0, r1, r2, r3)
            return r0
    }

    public static int nspvc_compiler_get_declared_struct_member_size(long r10, long r12, int r14, long r15) {
            long r0 = org.lwjgl.util.spvc.Spvc.Functions.compiler_get_declared_struct_member_size
            r17 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L15
            r0 = r10
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r12
            long r0 = org.lwjgl.system.Checks.check(r0)
        L15:
            r0 = r10
            r1 = r12
            r2 = r14
            r3 = r15
            r4 = r17
            int r0 = org.lwjgl.system.JNI.invokePPPI(r0, r1, r2, r3, r4)
            return r0
    }

    @org.lwjgl.system.NativeType("spvc_result")
    public static int spvc_compiler_get_declared_struct_member_size(@org.lwjgl.system.NativeType("spvc_compiler") long r8, @org.lwjgl.system.NativeType("spvc_type") long r10, @org.lwjgl.system.NativeType("unsigned int") int r12, @org.lwjgl.system.NativeType("size_t *") org.lwjgl.PointerBuffer r13) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lc
            r0 = r13
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
        Lc:
            r0 = r8
            r1 = r10
            r2 = r12
            r3 = r13
            long r3 = org.lwjgl.system.MemoryUtil.memAddress(r3)
            int r0 = nspvc_compiler_get_declared_struct_member_size(r0, r1, r2, r3)
            return r0
    }

    public static int nspvc_compiler_type_struct_member_offset(long r10, long r12, int r14, long r15) {
            long r0 = org.lwjgl.util.spvc.Spvc.Functions.compiler_type_struct_member_offset
            r17 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L15
            r0 = r10
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r12
            long r0 = org.lwjgl.system.Checks.check(r0)
        L15:
            r0 = r10
            r1 = r12
            r2 = r14
            r3 = r15
            r4 = r17
            int r0 = org.lwjgl.system.JNI.invokePPPI(r0, r1, r2, r3, r4)
            return r0
    }

    @org.lwjgl.system.NativeType("spvc_result")
    public static int spvc_compiler_type_struct_member_offset(@org.lwjgl.system.NativeType("spvc_compiler") long r8, @org.lwjgl.system.NativeType("spvc_type") long r10, @org.lwjgl.system.NativeType("unsigned int") int r12, @org.lwjgl.system.NativeType("unsigned int *") java.nio.IntBuffer r13) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lc
            r0 = r13
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
        Lc:
            r0 = r8
            r1 = r10
            r2 = r12
            r3 = r13
            long r3 = org.lwjgl.system.MemoryUtil.memAddress(r3)
            int r0 = nspvc_compiler_type_struct_member_offset(r0, r1, r2, r3)
            return r0
    }

    public static int nspvc_compiler_type_struct_member_array_stride(long r10, long r12, int r14, long r15) {
            long r0 = org.lwjgl.util.spvc.Spvc.Functions.compiler_type_struct_member_array_stride
            r17 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L15
            r0 = r10
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r12
            long r0 = org.lwjgl.system.Checks.check(r0)
        L15:
            r0 = r10
            r1 = r12
            r2 = r14
            r3 = r15
            r4 = r17
            int r0 = org.lwjgl.system.JNI.invokePPPI(r0, r1, r2, r3, r4)
            return r0
    }

    @org.lwjgl.system.NativeType("spvc_result")
    public static int spvc_compiler_type_struct_member_array_stride(@org.lwjgl.system.NativeType("spvc_compiler") long r8, @org.lwjgl.system.NativeType("spvc_type") long r10, @org.lwjgl.system.NativeType("unsigned int") int r12, @org.lwjgl.system.NativeType("unsigned int *") java.nio.IntBuffer r13) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lc
            r0 = r13
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
        Lc:
            r0 = r8
            r1 = r10
            r2 = r12
            r3 = r13
            long r3 = org.lwjgl.system.MemoryUtil.memAddress(r3)
            int r0 = nspvc_compiler_type_struct_member_array_stride(r0, r1, r2, r3)
            return r0
    }

    public static int nspvc_compiler_type_struct_member_matrix_stride(long r10, long r12, int r14, long r15) {
            long r0 = org.lwjgl.util.spvc.Spvc.Functions.compiler_type_struct_member_matrix_stride
            r17 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L15
            r0 = r10
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r12
            long r0 = org.lwjgl.system.Checks.check(r0)
        L15:
            r0 = r10
            r1 = r12
            r2 = r14
            r3 = r15
            r4 = r17
            int r0 = org.lwjgl.system.JNI.invokePPPI(r0, r1, r2, r3, r4)
            return r0
    }

    @org.lwjgl.system.NativeType("spvc_result")
    public static int spvc_compiler_type_struct_member_matrix_stride(@org.lwjgl.system.NativeType("spvc_compiler") long r8, @org.lwjgl.system.NativeType("spvc_type") long r10, @org.lwjgl.system.NativeType("unsigned int") int r12, @org.lwjgl.system.NativeType("unsigned int *") java.nio.IntBuffer r13) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lc
            r0 = r13
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
        Lc:
            r0 = r8
            r1 = r10
            r2 = r12
            r3 = r13
            long r3 = org.lwjgl.system.MemoryUtil.memAddress(r3)
            int r0 = nspvc_compiler_type_struct_member_matrix_stride(r0, r1, r2, r3)
            return r0
    }

    public static int nspvc_compiler_build_dummy_sampler_for_combined_images(long r7, long r9) {
            long r0 = org.lwjgl.util.spvc.Spvc.Functions.compiler_build_dummy_sampler_for_combined_images
            r11 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L10
            r0 = r7
            long r0 = org.lwjgl.system.Checks.check(r0)
        L10:
            r0 = r7
            r1 = r9
            r2 = r11
            int r0 = org.lwjgl.system.JNI.invokePPI(r0, r1, r2)
            return r0
    }

    @org.lwjgl.system.NativeType("spvc_result")
    public static int spvc_compiler_build_dummy_sampler_for_combined_images(@org.lwjgl.system.NativeType("spvc_compiler") long r5, @org.lwjgl.system.NativeType("spvc_variable_id *") java.nio.IntBuffer r7) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r7
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
        Lb:
            r0 = r5
            r1 = r7
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            int r0 = nspvc_compiler_build_dummy_sampler_for_combined_images(r0, r1)
            return r0
    }

    @org.lwjgl.system.NativeType("spvc_result")
    public static int spvc_compiler_build_combined_image_samplers(@org.lwjgl.system.NativeType("spvc_compiler") long r5) {
            long r0 = org.lwjgl.util.spvc.Spvc.Functions.compiler_build_combined_image_samplers
            r7 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lf
            r0 = r5
            long r0 = org.lwjgl.system.Checks.check(r0)
        Lf:
            r0 = r5
            r1 = r7
            int r0 = org.lwjgl.system.JNI.invokePI(r0, r1)
            return r0
    }

    public static int nspvc_compiler_get_combined_image_samplers(long r9, long r11, long r13) {
            long r0 = org.lwjgl.util.spvc.Spvc.Functions.compiler_get_combined_image_samplers
            r15 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L10
            r0 = r9
            long r0 = org.lwjgl.system.Checks.check(r0)
        L10:
            r0 = r9
            r1 = r11
            r2 = r13
            r3 = r15
            int r0 = org.lwjgl.system.JNI.invokePPPI(r0, r1, r2, r3)
            return r0
    }

    @org.lwjgl.system.NativeType("spvc_result")
    public static int spvc_compiler_get_combined_image_samplers(@org.lwjgl.system.NativeType("spvc_compiler") long r7, @org.lwjgl.system.NativeType("spvc_combined_image_sampler const **") org.lwjgl.PointerBuffer r9, @org.lwjgl.system.NativeType("size_t *") org.lwjgl.PointerBuffer r10) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L10
            r0 = r9
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
            r0 = r10
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
        L10:
            r0 = r7
            r1 = r9
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            r2 = r10
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            int r0 = nspvc_compiler_get_combined_image_samplers(r0, r1, r2)
            return r0
    }

    public static int nspvc_compiler_get_specialization_constants(long r9, long r11, long r13) {
            long r0 = org.lwjgl.util.spvc.Spvc.Functions.compiler_get_specialization_constants
            r15 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L10
            r0 = r9
            long r0 = org.lwjgl.system.Checks.check(r0)
        L10:
            r0 = r9
            r1 = r11
            r2 = r13
            r3 = r15
            int r0 = org.lwjgl.system.JNI.invokePPPI(r0, r1, r2, r3)
            return r0
    }

    @org.lwjgl.system.NativeType("spvc_result")
    public static int spvc_compiler_get_specialization_constants(@org.lwjgl.system.NativeType("spvc_compiler") long r7, @org.lwjgl.system.NativeType("spvc_specialization_constant const **") org.lwjgl.PointerBuffer r9, @org.lwjgl.system.NativeType("size_t *") org.lwjgl.PointerBuffer r10) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L10
            r0 = r9
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
            r0 = r10
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
        L10:
            r0 = r7
            r1 = r9
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            r2 = r10
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            int r0 = nspvc_compiler_get_specialization_constants(r0, r1, r2)
            return r0
    }

    @org.lwjgl.system.NativeType("spvc_constant")
    public static long spvc_compiler_get_constant_handle(@org.lwjgl.system.NativeType("spvc_compiler") long r6, @org.lwjgl.system.NativeType("spvc_constant_id") int r8) {
            long r0 = org.lwjgl.util.spvc.Spvc.Functions.compiler_get_constant_handle
            r9 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lf
            r0 = r6
            long r0 = org.lwjgl.system.Checks.check(r0)
        Lf:
            r0 = r6
            r1 = r8
            r2 = r9
            long r0 = org.lwjgl.system.JNI.invokePP(r0, r1, r2)
            return r0
    }

    public static int nspvc_compiler_get_work_group_size_specialization_constants(long r11, long r13, long r15, long r17) {
            long r0 = org.lwjgl.util.spvc.Spvc.Functions.compiler_get_work_group_size_specialization_constants
            r19 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L10
            r0 = r11
            long r0 = org.lwjgl.system.Checks.check(r0)
        L10:
            r0 = r11
            r1 = r13
            r2 = r15
            r3 = r17
            r4 = r19
            int r0 = org.lwjgl.system.JNI.invokePPPPI(r0, r1, r2, r3, r4)
            return r0
    }

    @org.lwjgl.system.NativeType("spvc_constant_id")
    public static int spvc_compiler_get_work_group_size_specialization_constants(@org.lwjgl.system.NativeType("spvc_compiler") long r9, @org.lwjgl.system.NativeType("spvc_specialization_constant *") org.lwjgl.util.spvc.SpvcSpecializationConstant r11, @org.lwjgl.system.NativeType("spvc_specialization_constant *") org.lwjgl.util.spvc.SpvcSpecializationConstant r12, @org.lwjgl.system.NativeType("spvc_specialization_constant *") org.lwjgl.util.spvc.SpvcSpecializationConstant r13) {
            r0 = r9
            r1 = r11
            long r1 = r1.address()
            r2 = r12
            long r2 = r2.address()
            r3 = r13
            long r3 = r3.address()
            int r0 = nspvc_compiler_get_work_group_size_specialization_constants(r0, r1, r2, r3)
            return r0
    }

    public static int nspvc_compiler_get_active_buffer_ranges(long r10, int r12, long r13, long r15) {
            long r0 = org.lwjgl.util.spvc.Spvc.Functions.compiler_get_active_buffer_ranges
            r17 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L10
            r0 = r10
            long r0 = org.lwjgl.system.Checks.check(r0)
        L10:
            r0 = r10
            r1 = r12
            r2 = r13
            r3 = r15
            r4 = r17
            int r0 = org.lwjgl.system.JNI.invokePPPI(r0, r1, r2, r3, r4)
            return r0
    }

    @org.lwjgl.system.NativeType("spvc_result")
    public static int spvc_compiler_get_active_buffer_ranges(@org.lwjgl.system.NativeType("spvc_compiler") long r8, @org.lwjgl.system.NativeType("spvc_variable_id") int r10, @org.lwjgl.system.NativeType("spvc_buffer_range const **") org.lwjgl.PointerBuffer r11, @org.lwjgl.system.NativeType("size_t *") org.lwjgl.PointerBuffer r12) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L11
            r0 = r11
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
            r0 = r12
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
        L11:
            r0 = r8
            r1 = r10
            r2 = r11
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            r3 = r12
            long r3 = org.lwjgl.system.MemoryUtil.memAddress(r3)
            int r0 = nspvc_compiler_get_active_buffer_ranges(r0, r1, r2, r3)
            return r0
    }

    public static float spvc_constant_get_scalar_fp16(@org.lwjgl.system.NativeType("spvc_constant") long r7, @org.lwjgl.system.NativeType("unsigned int") int r9, @org.lwjgl.system.NativeType("unsigned int") int r10) {
            long r0 = org.lwjgl.util.spvc.Spvc.Functions.constant_get_scalar_fp16
            r11 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L10
            r0 = r7
            long r0 = org.lwjgl.system.Checks.check(r0)
        L10:
            r0 = r7
            r1 = r9
            r2 = r10
            r3 = r11
            float r0 = org.lwjgl.system.JNI.invokePF(r0, r1, r2, r3)
            return r0
    }

    public static float spvc_constant_get_scalar_fp32(@org.lwjgl.system.NativeType("spvc_constant") long r7, @org.lwjgl.system.NativeType("unsigned int") int r9, @org.lwjgl.system.NativeType("unsigned int") int r10) {
            long r0 = org.lwjgl.util.spvc.Spvc.Functions.constant_get_scalar_fp32
            r11 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L10
            r0 = r7
            long r0 = org.lwjgl.system.Checks.check(r0)
        L10:
            r0 = r7
            r1 = r9
            r2 = r10
            r3 = r11
            float r0 = org.lwjgl.system.JNI.invokePF(r0, r1, r2, r3)
            return r0
    }

    public static double spvc_constant_get_scalar_fp64(@org.lwjgl.system.NativeType("spvc_constant") long r7, @org.lwjgl.system.NativeType("unsigned int") int r9, @org.lwjgl.system.NativeType("unsigned int") int r10) {
            long r0 = org.lwjgl.util.spvc.Spvc.Functions.constant_get_scalar_fp64
            r11 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L10
            r0 = r7
            long r0 = org.lwjgl.system.Checks.check(r0)
        L10:
            r0 = r7
            r1 = r9
            r2 = r10
            r3 = r11
            double r0 = org.lwjgl.system.JNI.invokePD(r0, r1, r2, r3)
            return r0
    }

    @org.lwjgl.system.NativeType("unsigned int")
    public static int spvc_constant_get_scalar_u32(@org.lwjgl.system.NativeType("spvc_constant") long r7, @org.lwjgl.system.NativeType("unsigned int") int r9, @org.lwjgl.system.NativeType("unsigned int") int r10) {
            long r0 = org.lwjgl.util.spvc.Spvc.Functions.constant_get_scalar_u32
            r11 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L10
            r0 = r7
            long r0 = org.lwjgl.system.Checks.check(r0)
        L10:
            r0 = r7
            r1 = r9
            r2 = r10
            r3 = r11
            int r0 = org.lwjgl.system.JNI.invokePI(r0, r1, r2, r3)
            return r0
    }

    public static int spvc_constant_get_scalar_i32(@org.lwjgl.system.NativeType("spvc_constant") long r7, @org.lwjgl.system.NativeType("unsigned int") int r9, @org.lwjgl.system.NativeType("unsigned int") int r10) {
            long r0 = org.lwjgl.util.spvc.Spvc.Functions.constant_get_scalar_i32
            r11 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L10
            r0 = r7
            long r0 = org.lwjgl.system.Checks.check(r0)
        L10:
            r0 = r7
            r1 = r9
            r2 = r10
            r3 = r11
            int r0 = org.lwjgl.system.JNI.invokePI(r0, r1, r2, r3)
            return r0
    }

    @org.lwjgl.system.NativeType("unsigned int")
    public static int spvc_constant_get_scalar_u16(@org.lwjgl.system.NativeType("spvc_constant") long r7, @org.lwjgl.system.NativeType("unsigned int") int r9, @org.lwjgl.system.NativeType("unsigned int") int r10) {
            long r0 = org.lwjgl.util.spvc.Spvc.Functions.constant_get_scalar_u16
            r11 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L10
            r0 = r7
            long r0 = org.lwjgl.system.Checks.check(r0)
        L10:
            r0 = r7
            r1 = r9
            r2 = r10
            r3 = r11
            int r0 = org.lwjgl.system.JNI.invokePI(r0, r1, r2, r3)
            return r0
    }

    public static int spvc_constant_get_scalar_i16(@org.lwjgl.system.NativeType("spvc_constant") long r7, @org.lwjgl.system.NativeType("unsigned int") int r9, @org.lwjgl.system.NativeType("unsigned int") int r10) {
            long r0 = org.lwjgl.util.spvc.Spvc.Functions.constant_get_scalar_i16
            r11 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L10
            r0 = r7
            long r0 = org.lwjgl.system.Checks.check(r0)
        L10:
            r0 = r7
            r1 = r9
            r2 = r10
            r3 = r11
            int r0 = org.lwjgl.system.JNI.invokePI(r0, r1, r2, r3)
            return r0
    }

    @org.lwjgl.system.NativeType("unsigned int")
    public static int spvc_constant_get_scalar_u8(@org.lwjgl.system.NativeType("spvc_constant") long r7, @org.lwjgl.system.NativeType("unsigned int") int r9, @org.lwjgl.system.NativeType("unsigned int") int r10) {
            long r0 = org.lwjgl.util.spvc.Spvc.Functions.constant_get_scalar_u8
            r11 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L10
            r0 = r7
            long r0 = org.lwjgl.system.Checks.check(r0)
        L10:
            r0 = r7
            r1 = r9
            r2 = r10
            r3 = r11
            int r0 = org.lwjgl.system.JNI.invokePI(r0, r1, r2, r3)
            return r0
    }

    public static int spvc_constant_get_scalar_i8(@org.lwjgl.system.NativeType("spvc_constant") long r7, @org.lwjgl.system.NativeType("unsigned int") int r9, @org.lwjgl.system.NativeType("unsigned int") int r10) {
            long r0 = org.lwjgl.util.spvc.Spvc.Functions.constant_get_scalar_i8
            r11 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L10
            r0 = r7
            long r0 = org.lwjgl.system.Checks.check(r0)
        L10:
            r0 = r7
            r1 = r9
            r2 = r10
            r3 = r11
            int r0 = org.lwjgl.system.JNI.invokePI(r0, r1, r2, r3)
            return r0
    }

    public static void nspvc_constant_get_subconstants(long r9, long r11, long r13) {
            long r0 = org.lwjgl.util.spvc.Spvc.Functions.constant_get_subconstants
            r15 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L10
            r0 = r9
            long r0 = org.lwjgl.system.Checks.check(r0)
        L10:
            r0 = r9
            r1 = r11
            r2 = r13
            r3 = r15
            org.lwjgl.system.JNI.invokePPPV(r0, r1, r2, r3)
            return
    }

    public static void spvc_constant_get_subconstants(@org.lwjgl.system.NativeType("spvc_constant") long r7, @org.lwjgl.system.NativeType("spvc_constant_id const **") org.lwjgl.PointerBuffer r9, @org.lwjgl.system.NativeType("size_t *") org.lwjgl.PointerBuffer r10) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L10
            r0 = r9
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
            r0 = r10
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
        L10:
            r0 = r7
            r1 = r9
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            r2 = r10
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            nspvc_constant_get_subconstants(r0, r1, r2)
            return
    }

    @org.lwjgl.system.NativeType("unsigned long long")
    public static long spvc_constant_get_scalar_u64(@org.lwjgl.system.NativeType("spvc_constant") long r7, @org.lwjgl.system.NativeType("unsigned") int r9, @org.lwjgl.system.NativeType("unsigned") int r10) {
            long r0 = org.lwjgl.util.spvc.Spvc.Functions.constant_get_scalar_u64
            r11 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L10
            r0 = r7
            long r0 = org.lwjgl.system.Checks.check(r0)
        L10:
            r0 = r7
            r1 = r9
            r2 = r10
            r3 = r11
            long r0 = org.lwjgl.system.JNI.invokePJ(r0, r1, r2, r3)
            return r0
    }

    @org.lwjgl.system.NativeType("long long")
    public static long spvc_constant_get_scalar_i64(@org.lwjgl.system.NativeType("spvc_constant") long r7, @org.lwjgl.system.NativeType("unsigned") int r9, @org.lwjgl.system.NativeType("unsigned") int r10) {
            long r0 = org.lwjgl.util.spvc.Spvc.Functions.constant_get_scalar_i64
            r11 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L10
            r0 = r7
            long r0 = org.lwjgl.system.Checks.check(r0)
        L10:
            r0 = r7
            r1 = r9
            r2 = r10
            r3 = r11
            long r0 = org.lwjgl.system.JNI.invokePJ(r0, r1, r2, r3)
            return r0
    }

    @org.lwjgl.system.NativeType("spvc_type_id")
    public static int spvc_constant_get_type(@org.lwjgl.system.NativeType("spvc_constant") long r5) {
            long r0 = org.lwjgl.util.spvc.Spvc.Functions.constant_get_type
            r7 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lf
            r0 = r5
            long r0 = org.lwjgl.system.Checks.check(r0)
        Lf:
            r0 = r5
            r1 = r7
            int r0 = org.lwjgl.system.JNI.invokePI(r0, r1)
            return r0
    }

    public static void spvc_constant_set_scalar_fp16(@org.lwjgl.system.NativeType("spvc_constant") long r8, @org.lwjgl.system.NativeType("unsigned") int r10, @org.lwjgl.system.NativeType("unsigned") int r11, @org.lwjgl.system.NativeType("unsigned short") short r12) {
            long r0 = org.lwjgl.util.spvc.Spvc.Functions.constant_set_scalar_fp16
            r13 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L10
            r0 = r8
            long r0 = org.lwjgl.system.Checks.check(r0)
        L10:
            r0 = r8
            r1 = r10
            r2 = r11
            r3 = r12
            r4 = r13
            org.lwjgl.system.JNI.invokePCV(r0, r1, r2, r3, r4)
            return
    }

    public static void spvc_constant_set_scalar_fp32(@org.lwjgl.system.NativeType("spvc_constant") long r8, @org.lwjgl.system.NativeType("unsigned") int r10, @org.lwjgl.system.NativeType("unsigned") int r11, float r12) {
            long r0 = org.lwjgl.util.spvc.Spvc.Functions.constant_set_scalar_fp32
            r13 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L10
            r0 = r8
            long r0 = org.lwjgl.system.Checks.check(r0)
        L10:
            r0 = r8
            r1 = r10
            r2 = r11
            r3 = r12
            r4 = r13
            org.lwjgl.system.JNI.invokePV(r0, r1, r2, r3, r4)
            return
    }

    public static void spvc_constant_set_scalar_fp64(@org.lwjgl.system.NativeType("spvc_constant") long r9, @org.lwjgl.system.NativeType("unsigned") int r11, @org.lwjgl.system.NativeType("unsigned") int r12, double r13) {
            long r0 = org.lwjgl.util.spvc.Spvc.Functions.constant_set_scalar_fp64
            r15 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L10
            r0 = r9
            long r0 = org.lwjgl.system.Checks.check(r0)
        L10:
            r0 = r9
            r1 = r11
            r2 = r12
            r3 = r13
            r4 = r15
            org.lwjgl.system.JNI.invokePV(r0, r1, r2, r3, r4)
            return
    }

    public static void spvc_constant_set_scalar_u32(@org.lwjgl.system.NativeType("spvc_constant") long r8, @org.lwjgl.system.NativeType("unsigned") int r10, @org.lwjgl.system.NativeType("unsigned") int r11, @org.lwjgl.system.NativeType("unsigned") int r12) {
            long r0 = org.lwjgl.util.spvc.Spvc.Functions.constant_set_scalar_u32
            r13 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L10
            r0 = r8
            long r0 = org.lwjgl.system.Checks.check(r0)
        L10:
            r0 = r8
            r1 = r10
            r2 = r11
            r3 = r12
            r4 = r13
            org.lwjgl.system.JNI.invokePV(r0, r1, r2, r3, r4)
            return
    }

    public static void spvc_constant_set_scalar_i32(@org.lwjgl.system.NativeType("spvc_constant") long r8, @org.lwjgl.system.NativeType("unsigned") int r10, @org.lwjgl.system.NativeType("unsigned") int r11, int r12) {
            long r0 = org.lwjgl.util.spvc.Spvc.Functions.constant_set_scalar_i32
            r13 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L10
            r0 = r8
            long r0 = org.lwjgl.system.Checks.check(r0)
        L10:
            r0 = r8
            r1 = r10
            r2 = r11
            r3 = r12
            r4 = r13
            org.lwjgl.system.JNI.invokePV(r0, r1, r2, r3, r4)
            return
    }

    public static void spvc_constant_set_scalar_u64(@org.lwjgl.system.NativeType("spvc_constant") long r9, @org.lwjgl.system.NativeType("unsigned") int r11, @org.lwjgl.system.NativeType("unsigned") int r12, @org.lwjgl.system.NativeType("unsigned long long") long r13) {
            long r0 = org.lwjgl.util.spvc.Spvc.Functions.constant_set_scalar_u64
            r15 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L10
            r0 = r9
            long r0 = org.lwjgl.system.Checks.check(r0)
        L10:
            r0 = r9
            r1 = r11
            r2 = r12
            r3 = r13
            r4 = r15
            org.lwjgl.system.JNI.invokePJV(r0, r1, r2, r3, r4)
            return
    }

    public static void spvc_constant_set_scalar_i64(@org.lwjgl.system.NativeType("spvc_constant") long r9, @org.lwjgl.system.NativeType("unsigned") int r11, @org.lwjgl.system.NativeType("unsigned") int r12, @org.lwjgl.system.NativeType("long long") long r13) {
            long r0 = org.lwjgl.util.spvc.Spvc.Functions.constant_set_scalar_i64
            r15 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L10
            r0 = r9
            long r0 = org.lwjgl.system.Checks.check(r0)
        L10:
            r0 = r9
            r1 = r11
            r2 = r12
            r3 = r13
            r4 = r15
            org.lwjgl.system.JNI.invokePJV(r0, r1, r2, r3, r4)
            return
    }

    public static void spvc_constant_set_scalar_u16(@org.lwjgl.system.NativeType("spvc_constant") long r8, @org.lwjgl.system.NativeType("unsigned") int r10, @org.lwjgl.system.NativeType("unsigned") int r11, @org.lwjgl.system.NativeType("unsigned short") short r12) {
            long r0 = org.lwjgl.util.spvc.Spvc.Functions.constant_set_scalar_u16
            r13 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L10
            r0 = r8
            long r0 = org.lwjgl.system.Checks.check(r0)
        L10:
            r0 = r8
            r1 = r10
            r2 = r11
            r3 = r12
            r4 = r13
            org.lwjgl.system.JNI.invokePCV(r0, r1, r2, r3, r4)
            return
    }

    public static void spvc_constant_set_scalar_i16(@org.lwjgl.system.NativeType("spvc_constant") long r8, @org.lwjgl.system.NativeType("unsigned") int r10, @org.lwjgl.system.NativeType("unsigned") int r11, short r12) {
            long r0 = org.lwjgl.util.spvc.Spvc.Functions.constant_set_scalar_i16
            r13 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L10
            r0 = r8
            long r0 = org.lwjgl.system.Checks.check(r0)
        L10:
            r0 = r8
            r1 = r10
            r2 = r11
            r3 = r12
            r4 = r13
            org.lwjgl.system.JNI.invokePSV(r0, r1, r2, r3, r4)
            return
    }

    public static void spvc_constant_set_scalar_u8(@org.lwjgl.system.NativeType("spvc_constant") long r8, @org.lwjgl.system.NativeType("unsigned") int r10, @org.lwjgl.system.NativeType("unsigned") int r11, @org.lwjgl.system.NativeType("unsigned char") byte r12) {
            long r0 = org.lwjgl.util.spvc.Spvc.Functions.constant_set_scalar_u8
            r13 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L10
            r0 = r8
            long r0 = org.lwjgl.system.Checks.check(r0)
        L10:
            r0 = r8
            r1 = r10
            r2 = r11
            r3 = r12
            r4 = r13
            org.lwjgl.system.JNI.invokePUV(r0, r1, r2, r3, r4)
            return
    }

    public static void spvc_constant_set_scalar_i8(@org.lwjgl.system.NativeType("spvc_constant") long r8, @org.lwjgl.system.NativeType("unsigned") int r10, @org.lwjgl.system.NativeType("unsigned") int r11, @org.lwjgl.system.NativeType("char") byte r12) {
            long r0 = org.lwjgl.util.spvc.Spvc.Functions.constant_set_scalar_i8
            r13 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L10
            r0 = r8
            long r0 = org.lwjgl.system.Checks.check(r0)
        L10:
            r0 = r8
            r1 = r10
            r2 = r11
            r3 = r12
            r4 = r13
            org.lwjgl.system.JNI.invokePBV(r0, r1, r2, r3, r4)
            return
    }

    public static boolean nspvc_compiler_get_binary_offset_for_decoration(long r9, int r11, int r12, long r13) {
            long r0 = org.lwjgl.util.spvc.Spvc.Functions.compiler_get_binary_offset_for_decoration
            r15 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L10
            r0 = r9
            long r0 = org.lwjgl.system.Checks.check(r0)
        L10:
            r0 = r9
            r1 = r11
            r2 = r12
            r3 = r13
            r4 = r15
            boolean r0 = org.lwjgl.system.JNI.invokePPZ(r0, r1, r2, r3, r4)
            return r0
    }

    @org.lwjgl.system.NativeType("spvc_bool")
    public static boolean spvc_compiler_get_binary_offset_for_decoration(@org.lwjgl.system.NativeType("spvc_compiler") long r7, @org.lwjgl.system.NativeType("spvc_variable_id") int r9, @org.lwjgl.system.NativeType("SpvDecoration") int r10, @org.lwjgl.system.NativeType("unsigned int *") java.nio.IntBuffer r11) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lc
            r0 = r11
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
        Lc:
            r0 = r7
            r1 = r9
            r2 = r10
            r3 = r11
            long r3 = org.lwjgl.system.MemoryUtil.memAddress(r3)
            boolean r0 = nspvc_compiler_get_binary_offset_for_decoration(r0, r1, r2, r3)
            return r0
    }

    @org.lwjgl.system.NativeType("spvc_bool")
    public static boolean spvc_compiler_buffer_is_hlsl_counter_buffer(@org.lwjgl.system.NativeType("spvc_compiler") long r6, @org.lwjgl.system.NativeType("spvc_variable_id") int r8) {
            long r0 = org.lwjgl.util.spvc.Spvc.Functions.compiler_buffer_is_hlsl_counter_buffer
            r9 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lf
            r0 = r6
            long r0 = org.lwjgl.system.Checks.check(r0)
        Lf:
            r0 = r6
            r1 = r8
            r2 = r9
            boolean r0 = org.lwjgl.system.JNI.invokePZ(r0, r1, r2)
            return r0
    }

    public static boolean nspvc_compiler_buffer_get_hlsl_counter_buffer(long r8, int r10, long r11) {
            long r0 = org.lwjgl.util.spvc.Spvc.Functions.compiler_buffer_get_hlsl_counter_buffer
            r13 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L10
            r0 = r8
            long r0 = org.lwjgl.system.Checks.check(r0)
        L10:
            r0 = r8
            r1 = r10
            r2 = r11
            r3 = r13
            boolean r0 = org.lwjgl.system.JNI.invokePPZ(r0, r1, r2, r3)
            return r0
    }

    @org.lwjgl.system.NativeType("spvc_bool")
    public static boolean spvc_compiler_buffer_get_hlsl_counter_buffer(@org.lwjgl.system.NativeType("spvc_compiler") long r6, @org.lwjgl.system.NativeType("spvc_variable_id") int r8, @org.lwjgl.system.NativeType("spvc_variable_id *") java.nio.IntBuffer r9) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r9
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
        Lb:
            r0 = r6
            r1 = r8
            r2 = r9
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            boolean r0 = nspvc_compiler_buffer_get_hlsl_counter_buffer(r0, r1, r2)
            return r0
    }

    public static int nspvc_compiler_get_declared_capabilities(long r9, long r11, long r13) {
            long r0 = org.lwjgl.util.spvc.Spvc.Functions.compiler_get_declared_capabilities
            r15 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L10
            r0 = r9
            long r0 = org.lwjgl.system.Checks.check(r0)
        L10:
            r0 = r9
            r1 = r11
            r2 = r13
            r3 = r15
            int r0 = org.lwjgl.system.JNI.invokePPPI(r0, r1, r2, r3)
            return r0
    }

    @org.lwjgl.system.NativeType("spvc_result")
    public static int spvc_compiler_get_declared_capabilities(@org.lwjgl.system.NativeType("spvc_compiler") long r7, @org.lwjgl.system.NativeType("SpvCapability const **") org.lwjgl.PointerBuffer r9, @org.lwjgl.system.NativeType("size_t *") org.lwjgl.PointerBuffer r10) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L10
            r0 = r9
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
            r0 = r10
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
        L10:
            r0 = r7
            r1 = r9
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            r2 = r10
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            int r0 = nspvc_compiler_get_declared_capabilities(r0, r1, r2)
            return r0
    }

    public static int nspvc_compiler_get_declared_extensions(long r9, long r11, long r13) {
            long r0 = org.lwjgl.util.spvc.Spvc.Functions.compiler_get_declared_extensions
            r15 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L10
            r0 = r9
            long r0 = org.lwjgl.system.Checks.check(r0)
        L10:
            r0 = r9
            r1 = r11
            r2 = r13
            r3 = r15
            int r0 = org.lwjgl.system.JNI.invokePPPI(r0, r1, r2, r3)
            return r0
    }

    @org.lwjgl.system.NativeType("spvc_result")
    public static int spvc_compiler_get_declared_extensions(@org.lwjgl.system.NativeType("spvc_compiler") long r7, @org.lwjgl.system.NativeType("char const ***") org.lwjgl.PointerBuffer r9, @org.lwjgl.system.NativeType("size_t *") org.lwjgl.PointerBuffer r10) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L10
            r0 = r9
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
            r0 = r10
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
        L10:
            r0 = r7
            r1 = r9
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            r2 = r10
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            int r0 = nspvc_compiler_get_declared_extensions(r0, r1, r2)
            return r0
    }

    public static long nspvc_compiler_get_remapped_declared_block_name(long r6, int r8) {
            long r0 = org.lwjgl.util.spvc.Spvc.Functions.compiler_get_remapped_declared_block_name
            r9 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lf
            r0 = r6
            long r0 = org.lwjgl.system.Checks.check(r0)
        Lf:
            r0 = r6
            r1 = r8
            r2 = r9
            long r0 = org.lwjgl.system.JNI.invokePP(r0, r1, r2)
            return r0
    }

    @org.lwjgl.system.NativeType("char const *")
    public static java.lang.String spvc_compiler_get_remapped_declared_block_name(@org.lwjgl.system.NativeType("spvc_compiler") long r4, @org.lwjgl.system.NativeType("spvc_variable_id") int r6) {
            r0 = r4
            r1 = r6
            long r0 = nspvc_compiler_get_remapped_declared_block_name(r0, r1)
            r7 = r0
            r0 = r7
            java.lang.String r0 = org.lwjgl.system.MemoryUtil.memUTF8Safe(r0)
            return r0
    }

    public static int nspvc_compiler_get_buffer_block_decorations(long r10, int r12, long r13, long r15) {
            long r0 = org.lwjgl.util.spvc.Spvc.Functions.compiler_get_buffer_block_decorations
            r17 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L10
            r0 = r10
            long r0 = org.lwjgl.system.Checks.check(r0)
        L10:
            r0 = r10
            r1 = r12
            r2 = r13
            r3 = r15
            r4 = r17
            int r0 = org.lwjgl.system.JNI.invokePPPI(r0, r1, r2, r3, r4)
            return r0
    }

    @org.lwjgl.system.NativeType("spvc_result")
    public static int spvc_compiler_get_buffer_block_decorations(@org.lwjgl.system.NativeType("spvc_compiler") long r8, @org.lwjgl.system.NativeType("spvc_variable_id") int r10, @org.lwjgl.system.NativeType("SpvDecoration const **") org.lwjgl.PointerBuffer r11, @org.lwjgl.system.NativeType("size_t *") org.lwjgl.PointerBuffer r12) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L11
            r0 = r11
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
            r0 = r12
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
        L11:
            r0 = r8
            r1 = r10
            r2 = r11
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            r3 = r12
            long r3 = org.lwjgl.system.MemoryUtil.memAddress(r3)
            int r0 = nspvc_compiler_get_buffer_block_decorations(r0, r1, r2, r3)
            return r0
    }

    static /* synthetic */ org.lwjgl.system.SharedLibrary access$000() {
            org.lwjgl.system.SharedLibrary r0 = org.lwjgl.util.spvc.Spvc.SPVC
            return r0
    }

    static {
            java.lang.Class<org.lwjgl.util.spvc.Spvc> r0 = org.lwjgl.util.spvc.Spvc.class
            java.lang.String r1 = "org.lwjgl.spvc"
            org.lwjgl.system.Configuration<java.lang.String> r2 = org.lwjgl.system.Configuration.SPVC_LIBRARY_NAME
            java.lang.String r3 = "spirv-cross"
            java.lang.String r3 = org.lwjgl.system.Platform.mapLibraryNameBundled(r3)
            java.lang.Object r2 = r2.get(r3)
            java.lang.String r2 = (java.lang.String) r2
            r3 = 1
            org.lwjgl.system.SharedLibrary r0 = org.lwjgl.system.Library.loadNative(r0, r1, r2, r3)
            org.lwjgl.util.spvc.Spvc.SPVC = r0
            return
    }
}
