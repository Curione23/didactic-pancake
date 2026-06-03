package org.lwjgl.util.shaderc;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/util/shaderc/GLSLang.class */
public class GLSLang {
    private static final org.lwjgl.system.SharedLibrary SHADERC = null;
    public static final int GLSLANG_STAGE_VERTEX = 0;
    public static final int GLSLANG_STAGE_TESSCONTROL = 1;
    public static final int GLSLANG_STAGE_TESSEVALUATION = 2;
    public static final int GLSLANG_STAGE_GEOMETRY = 3;
    public static final int GLSLANG_STAGE_FRAGMENT = 4;
    public static final int GLSLANG_STAGE_COMPUTE = 5;
    public static final int GLSLANG_STAGE_RAYGEN = 6;
    public static final int GLSLANG_STAGE_RAYGEN_NV = 6;
    public static final int GLSLANG_STAGE_INTERSECT = 7;
    public static final int GLSLANG_STAGE_INTERSECT_NV = 7;
    public static final int GLSLANG_STAGE_ANYHIT = 8;
    public static final int GLSLANG_STAGE_ANYHIT_NV = 8;
    public static final int GLSLANG_STAGE_CLOSESTHIT = 9;
    public static final int GLSLANG_STAGE_CLOSESTHIT_NV = 9;
    public static final int GLSLANG_STAGE_MISS = 10;
    public static final int GLSLANG_STAGE_MISS_NV = 10;
    public static final int GLSLANG_STAGE_CALLABLE = 11;
    public static final int GLSLANG_STAGE_CALLABLE_NV = 11;
    public static final int GLSLANG_STAGE_TASK = 12;
    public static final int GLSLANG_STAGE_TASK_NV = 12;
    public static final int GLSLANG_STAGE_MESH = 13;
    public static final int GLSLANG_STAGE_MESH_NV = 13;
    public static final int GLSLANG_STAGE_VERTEX_MASK = 1;
    public static final int GLSLANG_STAGE_TESSCONTROL_MASK = 2;
    public static final int GLSLANG_STAGE_TESSEVALUATION_MASK = 4;
    public static final int GLSLANG_STAGE_GEOMETRY_MASK = 8;
    public static final int GLSLANG_STAGE_FRAGMENT_MASK = 16;
    public static final int GLSLANG_STAGE_COMPUTE_MASK = 32;
    public static final int GLSLANG_STAGE_RAYGEN_MASK = 64;
    public static final int GLSLANG_STAGE_RAYGEN_NV_MASK = 64;
    public static final int GLSLANG_STAGE_INTERSECT_MASK = 128;
    public static final int GLSLANG_STAGE_INTERSECT_NV_MASK = 128;
    public static final int GLSLANG_STAGE_ANYHIT_MASK = 256;
    public static final int GLSLANG_STAGE_ANYHIT_NV_MASK = 256;
    public static final int GLSLANG_STAGE_CLOSESTHIT_MASK = 512;
    public static final int GLSLANG_STAGE_CLOSESTHIT_NV_MASK = 512;
    public static final int GLSLANG_STAGE_MISS_MASK = 1024;
    public static final int GLSLANG_STAGE_MISS_NV_MASK = 1024;
    public static final int GLSLANG_STAGE_CALLABLE_MASK = 2048;
    public static final int GLSLANG_STAGE_CALLABLE_NV_MASK = 2048;
    public static final int GLSLANG_STAGE_TASK_MASK = 4096;
    public static final int GLSLANG_STAGE_TASK_NV_MASK = 4096;
    public static final int GLSLANG_STAGE_MESH_MASK = 8192;
    public static final int GLSLANG_STAGE_MESH_NV_MASK = 8192;
    public static final int GLSLANG_SOURCE_NONE = 0;
    public static final int GLSLANG_SOURCE_GLSL = 1;
    public static final int GLSLANG_SOURCE_HLSL = 2;
    public static final int GLSLANG_CLIENT_NONE = 0;
    public static final int GLSLANG_CLIENT_VULKAN = 1;
    public static final int GLSLANG_CLIENT_OPENGL = 2;
    public static final int GLSLANG_TARGET_NONE = 0;
    public static final int GLSLANG_TARGET_SPV = 1;
    public static final int GLSLANG_TARGET_VULKAN_1_0 = 4194304;
    public static final int GLSLANG_TARGET_VULKAN_1_1 = 4198400;
    public static final int GLSLANG_TARGET_VULKAN_1_2 = 4202496;
    public static final int GLSLANG_TARGET_VULKAN_1_3 = 4206592;
    public static final int GLSLANG_TARGET_VULKAN_1_4 = 4210688;
    public static final int GLSLANG_TARGET_OPENGL_450 = 450;
    public static final int GLSLANG_TARGET_SPV_1_0 = 65536;
    public static final int GLSLANG_TARGET_SPV_1_1 = 65792;
    public static final int GLSLANG_TARGET_SPV_1_2 = 66048;
    public static final int GLSLANG_TARGET_SPV_1_3 = 66304;
    public static final int GLSLANG_TARGET_SPV_1_4 = 66560;
    public static final int GLSLANG_TARGET_SPV_1_5 = 66816;
    public static final int GLSLANG_TARGET_SPV_1_6 = 67072;
    public static final int GLSLANG_EX_VERTEX_FRAGMENT = 0;
    public static final int GLSLANG_EX_FRAGMENT = 1;
    public static final int GLSLANG_OPT_NO_GENERATION = 0;
    public static final int GLSLANG_OPT_NONE = 1;
    public static final int GLSLANG_OPT_SIMPLE = 2;
    public static final int GLSLANG_OPT_FULL = 3;
    public static final int GLSLANG_TEX_SAMP_TRANS_KEEP = 0;
    public static final int GLSLANG_TEX_SAMP_TRANS_UPGRADE_TEXTURE_REMOVE_SAMPLER = 1;
    public static final int GLSLANG_MSG_DEFAULT_BIT = 0;
    public static final int GLSLANG_MSG_RELAXED_ERRORS_BIT = 1;
    public static final int GLSLANG_MSG_SUPPRESS_WARNINGS_BIT = 2;
    public static final int GLSLANG_MSG_AST_BIT = 4;
    public static final int GLSLANG_MSG_SPV_RULES_BIT = 8;
    public static final int GLSLANG_MSG_VULKAN_RULES_BIT = 16;
    public static final int GLSLANG_MSG_ONLY_PREPROCESSOR_BIT = 32;
    public static final int GLSLANG_MSG_READ_HLSL_BIT = 64;
    public static final int GLSLANG_MSG_CASCADING_ERRORS_BIT = 128;
    public static final int GLSLANG_MSG_KEEP_UNCALLED_BIT = 256;
    public static final int GLSLANG_MSG_HLSL_OFFSETS_BIT = 512;
    public static final int GLSLANG_MSG_DEBUG_INFO_BIT = 1024;
    public static final int GLSLANG_MSG_HLSL_ENABLE_16BIT_TYPES_BIT = 2048;
    public static final int GLSLANG_MSG_HLSL_LEGALIZATION_BIT = 4096;
    public static final int GLSLANG_MSG_HLSL_DX9_COMPATIBLE_BIT = 8192;
    public static final int GLSLANG_MSG_BUILTIN_SYMBOL_TABLE_BIT = 16384;
    public static final int GLSLANG_MSG_ENHANCED = 32768;
    public static final int GLSLANG_MSG_ABSOLUTE_PATH = 65536;
    public static final int GLSLANG_MSG_DISPLAY_ERROR_COLUMN = 131072;
    public static final int GLSLANG_MSG_LINK_TIME_OPTIMIZATION_BIT = 262144;
    public static final int GLSLANG_MSG_VALIDATE_CROSS_STAGE_IO_BIT = 524288;
    public static final int GLSLANG_REFLECTION_DEFAULT_BIT = 0;
    public static final int GLSLANG_REFLECTION_STRICT_ARRAY_SUFFIX_BIT = 1;
    public static final int GLSLANG_REFLECTION_BASIC_ARRAY_SUFFIX_BIT = 2;
    public static final int GLSLANG_REFLECTION_INTERMEDIATE_IOO_BIT = 4;
    public static final int GLSLANG_REFLECTION_SEPARATE_BUFFERS_BIT = 8;
    public static final int GLSLANG_REFLECTION_ALL_BLOCK_VARIABLES_BIT = 16;
    public static final int GLSLANG_REFLECTION_UNWRAP_IO_BLOCKS_BIT = 32;
    public static final int GLSLANG_REFLECTION_ALL_IO_VARIABLES_BIT = 64;
    public static final int GLSLANG_REFLECTION_SHARED_STD140_SSBO_BIT = 128;
    public static final int GLSLANG_REFLECTION_SHARED_STD140_UBO_BIT = 256;
    public static final int GLSLANG_BAD_PROFILE = 0;
    public static final int GLSLANG_NO_PROFILE = 1;
    public static final int GLSLANG_CORE_PROFILE = 2;
    public static final int GLSLANG_COMPATIBILITY_PROFILE = 4;
    public static final int GLSLANG_ES_PROFILE = 8;
    public static final int GLSLANG_SHADER_DEFAULT_BIT = 0;
    public static final int GLSLANG_SHADER_AUTO_MAP_BINDINGS = 1;
    public static final int GLSLANG_SHADER_AUTO_MAP_LOCATIONS = 2;
    public static final int GLSLANG_SHADER_VULKAN_RULES_RELAXED = 4;
    public static final int GLSLANG_SHADER_BINDINGS_PER_RESOURCE_TYPE = 8;
    public static final int GLSLANG_RESOURCE_TYPE_SAMPLER = 0;
    public static final int GLSLANG_RESOURCE_TYPE_TEXTURE = 1;
    public static final int GLSLANG_RESOURCE_TYPE_IMAGE = 2;
    public static final int GLSLANG_RESOURCE_TYPE_UBO = 3;
    public static final int GLSLANG_RESOURCE_TYPE_SSBO = 4;
    public static final int GLSLANG_RESOURCE_TYPE_UAV = 5;
    public static final int GLSLANG_RESOURCE_TYPE_COMBINED_SAMPLER = 6;
    public static final int GLSLANG_RESOURCE_TYPE_AS = 7;
    public static final int GLSLANG_RESOURCE_TYPE_TENSOR = 8;

    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/util/shaderc/GLSLang$Functions.class */
    public static final class Functions {
        public static final long get_version = 0;
        public static final long initialize_process = 0;
        public static final long finalize_process = 0;
        public static final long shader_create = 0;
        public static final long shader_delete = 0;
        public static final long shader_set_preamble = 0;
        public static final long shader_set_entry_point = 0;
        public static final long shader_set_invert_y = 0;
        public static final long shader_shift_binding = 0;
        public static final long shader_shift_binding_for_set = 0;
        public static final long shader_set_options = 0;
        public static final long shader_set_glsl_version = 0;
        public static final long shader_set_default_uniform_block_set_and_binding = 0;
        public static final long shader_set_default_uniform_block_name = 0;
        public static final long shader_set_resource_set_binding = 0;
        public static final long shader_preprocess = 0;
        public static final long shader_parse = 0;
        public static final long shader_get_preprocessed_code = 0;
        public static final long shader_set_preprocessed_code = 0;
        public static final long shader_get_info_log = 0;
        public static final long shader_get_info_debug_log = 0;
        public static final long program_create = 0;
        public static final long program_delete = 0;
        public static final long program_add_shader = 0;
        public static final long program_link = 0;
        public static final long program_add_source_text = 0;
        public static final long program_set_source_file = 0;
        public static final long program_map_io = 0;
        public static final long program_map_io_with_resolver_and_mapper = 0;
        public static final long program_SPIRV_generate = 0;
        public static final long program_SPIRV_generate_with_options = 0;
        public static final long program_SPIRV_get_size = 0;
        public static final long program_SPIRV_get = 0;
        public static final long program_SPIRV_get_ptr = 0;
        public static final long program_SPIRV_get_messages = 0;
        public static final long program_get_info_log = 0;
        public static final long program_get_info_debug_log = 0;
        public static final long glsl_mapper_create = 0;
        public static final long glsl_mapper_delete = 0;
        public static final long glsl_resolver_create = 0;
        public static final long glsl_resolver_delete = 0;

        private Functions() {
                r2 = this;
                r0 = r2
                r0.<init>()
                return
        }

        static {
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.util.shaderc.GLSLang.access$000()
                java.lang.String r1 = "glslang_get_version"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.util.shaderc.GLSLang.Functions.get_version = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.util.shaderc.GLSLang.access$000()
                java.lang.String r1 = "glslang_initialize_process"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.util.shaderc.GLSLang.Functions.initialize_process = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.util.shaderc.GLSLang.access$000()
                java.lang.String r1 = "glslang_finalize_process"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.util.shaderc.GLSLang.Functions.finalize_process = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.util.shaderc.GLSLang.access$000()
                java.lang.String r1 = "glslang_shader_create"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.util.shaderc.GLSLang.Functions.shader_create = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.util.shaderc.GLSLang.access$000()
                java.lang.String r1 = "glslang_shader_delete"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.util.shaderc.GLSLang.Functions.shader_delete = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.util.shaderc.GLSLang.access$000()
                java.lang.String r1 = "glslang_shader_set_preamble"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.util.shaderc.GLSLang.Functions.shader_set_preamble = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.util.shaderc.GLSLang.access$000()
                java.lang.String r1 = "glslang_shader_set_entry_point"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.util.shaderc.GLSLang.Functions.shader_set_entry_point = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.util.shaderc.GLSLang.access$000()
                java.lang.String r1 = "glslang_shader_set_invert_y"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.util.shaderc.GLSLang.Functions.shader_set_invert_y = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.util.shaderc.GLSLang.access$000()
                java.lang.String r1 = "glslang_shader_shift_binding"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.util.shaderc.GLSLang.Functions.shader_shift_binding = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.util.shaderc.GLSLang.access$000()
                java.lang.String r1 = "glslang_shader_shift_binding_for_set"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.util.shaderc.GLSLang.Functions.shader_shift_binding_for_set = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.util.shaderc.GLSLang.access$000()
                java.lang.String r1 = "glslang_shader_set_options"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.util.shaderc.GLSLang.Functions.shader_set_options = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.util.shaderc.GLSLang.access$000()
                java.lang.String r1 = "glslang_shader_set_glsl_version"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.util.shaderc.GLSLang.Functions.shader_set_glsl_version = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.util.shaderc.GLSLang.access$000()
                java.lang.String r1 = "glslang_shader_set_default_uniform_block_set_and_binding"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.util.shaderc.GLSLang.Functions.shader_set_default_uniform_block_set_and_binding = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.util.shaderc.GLSLang.access$000()
                java.lang.String r1 = "glslang_shader_set_default_uniform_block_name"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.util.shaderc.GLSLang.Functions.shader_set_default_uniform_block_name = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.util.shaderc.GLSLang.access$000()
                java.lang.String r1 = "glslang_shader_set_resource_set_binding"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.util.shaderc.GLSLang.Functions.shader_set_resource_set_binding = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.util.shaderc.GLSLang.access$000()
                java.lang.String r1 = "glslang_shader_preprocess"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.util.shaderc.GLSLang.Functions.shader_preprocess = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.util.shaderc.GLSLang.access$000()
                java.lang.String r1 = "glslang_shader_parse"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.util.shaderc.GLSLang.Functions.shader_parse = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.util.shaderc.GLSLang.access$000()
                java.lang.String r1 = "glslang_shader_get_preprocessed_code"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.util.shaderc.GLSLang.Functions.shader_get_preprocessed_code = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.util.shaderc.GLSLang.access$000()
                java.lang.String r1 = "glslang_shader_set_preprocessed_code"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.util.shaderc.GLSLang.Functions.shader_set_preprocessed_code = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.util.shaderc.GLSLang.access$000()
                java.lang.String r1 = "glslang_shader_get_info_log"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.util.shaderc.GLSLang.Functions.shader_get_info_log = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.util.shaderc.GLSLang.access$000()
                java.lang.String r1 = "glslang_shader_get_info_debug_log"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.util.shaderc.GLSLang.Functions.shader_get_info_debug_log = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.util.shaderc.GLSLang.access$000()
                java.lang.String r1 = "glslang_program_create"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.util.shaderc.GLSLang.Functions.program_create = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.util.shaderc.GLSLang.access$000()
                java.lang.String r1 = "glslang_program_delete"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.util.shaderc.GLSLang.Functions.program_delete = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.util.shaderc.GLSLang.access$000()
                java.lang.String r1 = "glslang_program_add_shader"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.util.shaderc.GLSLang.Functions.program_add_shader = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.util.shaderc.GLSLang.access$000()
                java.lang.String r1 = "glslang_program_link"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.util.shaderc.GLSLang.Functions.program_link = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.util.shaderc.GLSLang.access$000()
                java.lang.String r1 = "glslang_program_add_source_text"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.util.shaderc.GLSLang.Functions.program_add_source_text = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.util.shaderc.GLSLang.access$000()
                java.lang.String r1 = "glslang_program_set_source_file"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.util.shaderc.GLSLang.Functions.program_set_source_file = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.util.shaderc.GLSLang.access$000()
                java.lang.String r1 = "glslang_program_map_io"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.util.shaderc.GLSLang.Functions.program_map_io = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.util.shaderc.GLSLang.access$000()
                java.lang.String r1 = "glslang_program_map_io_with_resolver_and_mapper"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.util.shaderc.GLSLang.Functions.program_map_io_with_resolver_and_mapper = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.util.shaderc.GLSLang.access$000()
                java.lang.String r1 = "glslang_program_SPIRV_generate"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.util.shaderc.GLSLang.Functions.program_SPIRV_generate = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.util.shaderc.GLSLang.access$000()
                java.lang.String r1 = "glslang_program_SPIRV_generate_with_options"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.util.shaderc.GLSLang.Functions.program_SPIRV_generate_with_options = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.util.shaderc.GLSLang.access$000()
                java.lang.String r1 = "glslang_program_SPIRV_get_size"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.util.shaderc.GLSLang.Functions.program_SPIRV_get_size = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.util.shaderc.GLSLang.access$000()
                java.lang.String r1 = "glslang_program_SPIRV_get"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.util.shaderc.GLSLang.Functions.program_SPIRV_get = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.util.shaderc.GLSLang.access$000()
                java.lang.String r1 = "glslang_program_SPIRV_get_ptr"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.util.shaderc.GLSLang.Functions.program_SPIRV_get_ptr = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.util.shaderc.GLSLang.access$000()
                java.lang.String r1 = "glslang_program_SPIRV_get_messages"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.util.shaderc.GLSLang.Functions.program_SPIRV_get_messages = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.util.shaderc.GLSLang.access$000()
                java.lang.String r1 = "glslang_program_get_info_log"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.util.shaderc.GLSLang.Functions.program_get_info_log = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.util.shaderc.GLSLang.access$000()
                java.lang.String r1 = "glslang_program_get_info_debug_log"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.util.shaderc.GLSLang.Functions.program_get_info_debug_log = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.util.shaderc.GLSLang.access$000()
                java.lang.String r1 = "glslang_glsl_mapper_create"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.util.shaderc.GLSLang.Functions.glsl_mapper_create = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.util.shaderc.GLSLang.access$000()
                java.lang.String r1 = "glslang_glsl_mapper_delete"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.util.shaderc.GLSLang.Functions.glsl_mapper_delete = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.util.shaderc.GLSLang.access$000()
                java.lang.String r1 = "glslang_glsl_resolver_create"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.util.shaderc.GLSLang.Functions.glsl_resolver_create = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.util.shaderc.GLSLang.access$000()
                java.lang.String r1 = "glslang_glsl_resolver_delete"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.util.shaderc.GLSLang.Functions.glsl_resolver_delete = r0
                return
        }
    }

    public static org.lwjgl.system.SharedLibrary getLibrary() {
            org.lwjgl.system.SharedLibrary r0 = org.lwjgl.util.shaderc.GLSLang.SHADERC
            return r0
    }

    protected GLSLang() {
            r3 = this;
            r0 = r3
            r0.<init>()
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r1 = r0
            r1.<init>()
            throw r0
    }

    public static void nglslang_get_version(long r5) {
            long r0 = org.lwjgl.util.shaderc.GLSLang.Functions.get_version
            r7 = r0
            r0 = r5
            r1 = r7
            org.lwjgl.system.JNI.invokePV(r0, r1)
            return
    }

    public static void glslang_get_version(@org.lwjgl.system.NativeType("glslang_version_t *") org.lwjgl.util.shaderc.GLSLangVersion r3) {
            r0 = r3
            long r0 = r0.address()
            nglslang_get_version(r0)
            return
    }

    @org.lwjgl.system.NativeType("int")
    public static boolean glslang_initialize_process() {
            long r0 = org.lwjgl.util.shaderc.GLSLang.Functions.initialize_process
            r3 = r0
            r0 = r3
            int r0 = org.lwjgl.system.JNI.invokeI(r0)
            if (r0 == 0) goto Lf
            r0 = 1
            goto L10
        Lf:
            r0 = 0
        L10:
            return r0
    }

    public static void glslang_finalize_process() {
            long r0 = org.lwjgl.util.shaderc.GLSLang.Functions.finalize_process
            r3 = r0
            r0 = r3
            org.lwjgl.system.JNI.invokeV(r0)
            return
    }

    public static long nglslang_shader_create(long r5) {
            long r0 = org.lwjgl.util.shaderc.GLSLang.Functions.shader_create
            r7 = r0
            r0 = r5
            r1 = r7
            long r0 = org.lwjgl.system.JNI.invokePP(r0, r1)
            return r0
    }

    @org.lwjgl.system.NativeType("glslang_shader_t *")
    public static long glslang_shader_create(@org.lwjgl.system.NativeType("glslang_input_t const *") org.lwjgl.util.shaderc.GLSLangInput r3) {
            r0 = r3
            long r0 = r0.address()
            long r0 = nglslang_shader_create(r0)
            return r0
    }

    public static void glslang_shader_delete(@org.lwjgl.system.NativeType("glslang_shader_t *") long r5) {
            long r0 = org.lwjgl.util.shaderc.GLSLang.Functions.shader_delete
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

    public static void nglslang_shader_set_preamble(long r7, long r9) {
            long r0 = org.lwjgl.util.shaderc.GLSLang.Functions.shader_set_preamble
            r11 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L10
            r0 = r7
            long r0 = org.lwjgl.system.Checks.check(r0)
        L10:
            r0 = r7
            r1 = r9
            r2 = r11
            org.lwjgl.system.JNI.invokePPV(r0, r1, r2)
            return
    }

    public static void glslang_shader_set_preamble(@org.lwjgl.system.NativeType("glslang_shader_t *") long r5, @org.lwjgl.system.NativeType("char const *") java.nio.ByteBuffer r7) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto La
            r0 = r7
            org.lwjgl.system.Checks.checkNT1(r0)
        La:
            r0 = r5
            r1 = r7
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            nglslang_shader_set_preamble(r0, r1)
            return
    }

    public static void glslang_shader_set_preamble(@org.lwjgl.system.NativeType("glslang_shader_t *") long r5, @org.lwjgl.system.NativeType("char const *") java.lang.CharSequence r7) {
            org.lwjgl.system.MemoryStack r0 = org.lwjgl.system.MemoryStack.stackGet()
            r8 = r0
            r0 = r8
            int r0 = r0.getPointer()
            r9 = r0
            r0 = r8
            r1 = r7
            r2 = 1
            int r0 = r0.nUTF8(r1, r2)     // Catch: java.lang.Throwable -> L26
            r0 = r8
            long r0 = r0.getPointerAddress()     // Catch: java.lang.Throwable -> L26
            r10 = r0
            r0 = r5
            r1 = r10
            nglslang_shader_set_preamble(r0, r1)     // Catch: java.lang.Throwable -> L26
            r0 = r8
            r1 = r9
            r0.setPointer(r1)
            goto L31
        L26:
            r12 = move-exception
            r0 = r8
            r1 = r9
            r0.setPointer(r1)
            r0 = r12
            throw r0
        L31:
            return
    }

    public static void nglslang_shader_set_entry_point(long r7, long r9) {
            long r0 = org.lwjgl.util.shaderc.GLSLang.Functions.shader_set_entry_point
            r11 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L10
            r0 = r7
            long r0 = org.lwjgl.system.Checks.check(r0)
        L10:
            r0 = r7
            r1 = r9
            r2 = r11
            org.lwjgl.system.JNI.invokePPV(r0, r1, r2)
            return
    }

    public static void glslang_shader_set_entry_point(@org.lwjgl.system.NativeType("glslang_shader_t *") long r5, @org.lwjgl.system.NativeType("char const *") java.nio.ByteBuffer r7) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto La
            r0 = r7
            org.lwjgl.system.Checks.checkNT1(r0)
        La:
            r0 = r5
            r1 = r7
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            nglslang_shader_set_entry_point(r0, r1)
            return
    }

    public static void glslang_shader_set_entry_point(@org.lwjgl.system.NativeType("glslang_shader_t *") long r5, @org.lwjgl.system.NativeType("char const *") java.lang.CharSequence r7) {
            org.lwjgl.system.MemoryStack r0 = org.lwjgl.system.MemoryStack.stackGet()
            r8 = r0
            r0 = r8
            int r0 = r0.getPointer()
            r9 = r0
            r0 = r8
            r1 = r7
            r2 = 1
            int r0 = r0.nUTF8(r1, r2)     // Catch: java.lang.Throwable -> L26
            r0 = r8
            long r0 = r0.getPointerAddress()     // Catch: java.lang.Throwable -> L26
            r10 = r0
            r0 = r5
            r1 = r10
            nglslang_shader_set_entry_point(r0, r1)     // Catch: java.lang.Throwable -> L26
            r0 = r8
            r1 = r9
            r0.setPointer(r1)
            goto L31
        L26:
            r12 = move-exception
            r0 = r8
            r1 = r9
            r0.setPointer(r1)
            r0 = r12
            throw r0
        L31:
            return
    }

    public static void glslang_shader_set_invert_y(@org.lwjgl.system.NativeType("glslang_shader_t *") long r6, @org.lwjgl.system.NativeType("bool") boolean r8) {
            long r0 = org.lwjgl.util.shaderc.GLSLang.Functions.shader_set_invert_y
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

    public static void glslang_shader_shift_binding(@org.lwjgl.system.NativeType("glslang_shader_t *") long r7, @org.lwjgl.system.NativeType("glslang_resource_type_t") int r9, @org.lwjgl.system.NativeType("unsigned int") int r10) {
            long r0 = org.lwjgl.util.shaderc.GLSLang.Functions.shader_shift_binding
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

    public static void glslang_shader_shift_binding_for_set(@org.lwjgl.system.NativeType("glslang_shader_t *") long r8, @org.lwjgl.system.NativeType("glslang_resource_type_t") int r10, @org.lwjgl.system.NativeType("unsigned int") int r11, @org.lwjgl.system.NativeType("unsigned int") int r12) {
            long r0 = org.lwjgl.util.shaderc.GLSLang.Functions.shader_shift_binding_for_set
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

    public static void glslang_shader_set_options(@org.lwjgl.system.NativeType("glslang_shader_t *") long r6, int r8) {
            long r0 = org.lwjgl.util.shaderc.GLSLang.Functions.shader_set_options
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

    public static void glslang_shader_set_glsl_version(@org.lwjgl.system.NativeType("glslang_shader_t *") long r6, int r8) {
            long r0 = org.lwjgl.util.shaderc.GLSLang.Functions.shader_set_glsl_version
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

    public static void glslang_shader_set_default_uniform_block_set_and_binding(@org.lwjgl.system.NativeType("glslang_shader_t *") long r7, @org.lwjgl.system.NativeType("unsigned int") int r9, @org.lwjgl.system.NativeType("unsigned int") int r10) {
            long r0 = org.lwjgl.util.shaderc.GLSLang.Functions.shader_set_default_uniform_block_set_and_binding
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

    public static void nglslang_shader_set_default_uniform_block_name(long r7, long r9) {
            long r0 = org.lwjgl.util.shaderc.GLSLang.Functions.shader_set_default_uniform_block_name
            r11 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L10
            r0 = r7
            long r0 = org.lwjgl.system.Checks.check(r0)
        L10:
            r0 = r7
            r1 = r9
            r2 = r11
            org.lwjgl.system.JNI.invokePPV(r0, r1, r2)
            return
    }

    public static void glslang_shader_set_default_uniform_block_name(@org.lwjgl.system.NativeType("glslang_shader_t *") long r5, @org.lwjgl.system.NativeType("char const *") java.nio.ByteBuffer r7) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto La
            r0 = r7
            org.lwjgl.system.Checks.checkNT1(r0)
        La:
            r0 = r5
            r1 = r7
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            nglslang_shader_set_default_uniform_block_name(r0, r1)
            return
    }

    public static void glslang_shader_set_default_uniform_block_name(@org.lwjgl.system.NativeType("glslang_shader_t *") long r5, @org.lwjgl.system.NativeType("char const *") java.lang.CharSequence r7) {
            org.lwjgl.system.MemoryStack r0 = org.lwjgl.system.MemoryStack.stackGet()
            r8 = r0
            r0 = r8
            int r0 = r0.getPointer()
            r9 = r0
            r0 = r8
            r1 = r7
            r2 = 1
            int r0 = r0.nUTF8(r1, r2)     // Catch: java.lang.Throwable -> L26
            r0 = r8
            long r0 = r0.getPointerAddress()     // Catch: java.lang.Throwable -> L26
            r10 = r0
            r0 = r5
            r1 = r10
            nglslang_shader_set_default_uniform_block_name(r0, r1)     // Catch: java.lang.Throwable -> L26
            r0 = r8
            r1 = r9
            r0.setPointer(r1)
            goto L31
        L26:
            r12 = move-exception
            r0 = r8
            r1 = r9
            r0.setPointer(r1)
            r0 = r12
            throw r0
        L31:
            return
    }

    public static void nglslang_shader_set_resource_set_binding(long r8, long r10, int r12) {
            long r0 = org.lwjgl.util.shaderc.GLSLang.Functions.shader_set_resource_set_binding
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
            org.lwjgl.system.JNI.invokePPV(r0, r1, r2, r3)
            return
    }

    public static void glslang_shader_set_resource_set_binding(@org.lwjgl.system.NativeType("glslang_shader_t *") long r6, @org.lwjgl.system.NativeType("char const * const *") org.lwjgl.PointerBuffer r8) {
            r0 = r6
            r1 = r8
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            r2 = r8
            int r2 = r2.remaining()
            nglslang_shader_set_resource_set_binding(r0, r1, r2)
            return
    }

    public static int nglslang_shader_preprocess(long r7, long r9) {
            long r0 = org.lwjgl.util.shaderc.GLSLang.Functions.shader_preprocess
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

    @org.lwjgl.system.NativeType("int")
    public static boolean glslang_shader_preprocess(@org.lwjgl.system.NativeType("glslang_shader_t *") long r5, @org.lwjgl.system.NativeType("glslang_input_t const *") org.lwjgl.util.shaderc.GLSLangInput r7) {
            r0 = r5
            r1 = r7
            long r1 = r1.address()
            int r0 = nglslang_shader_preprocess(r0, r1)
            if (r0 == 0) goto Lf
            r0 = 1
            goto L10
        Lf:
            r0 = 0
        L10:
            return r0
    }

    public static int nglslang_shader_parse(long r7, long r9) {
            long r0 = org.lwjgl.util.shaderc.GLSLang.Functions.shader_parse
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

    @org.lwjgl.system.NativeType("int")
    public static boolean glslang_shader_parse(@org.lwjgl.system.NativeType("glslang_shader_t *") long r5, @org.lwjgl.system.NativeType("glslang_input_t const *") org.lwjgl.util.shaderc.GLSLangInput r7) {
            r0 = r5
            r1 = r7
            long r1 = r1.address()
            int r0 = nglslang_shader_parse(r0, r1)
            if (r0 == 0) goto Lf
            r0 = 1
            goto L10
        Lf:
            r0 = 0
        L10:
            return r0
    }

    public static long nglslang_shader_get_preprocessed_code(long r5) {
            long r0 = org.lwjgl.util.shaderc.GLSLang.Functions.shader_get_preprocessed_code
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
    public static java.lang.String glslang_shader_get_preprocessed_code(@org.lwjgl.system.NativeType("glslang_shader_t *") long r3) {
            r0 = r3
            long r0 = nglslang_shader_get_preprocessed_code(r0)
            r5 = r0
            r0 = r5
            java.lang.String r0 = org.lwjgl.system.MemoryUtil.memUTF8Safe(r0)
            return r0
    }

    public static void nglslang_shader_set_preprocessed_code(long r7, long r9) {
            long r0 = org.lwjgl.util.shaderc.GLSLang.Functions.shader_set_preprocessed_code
            r11 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L10
            r0 = r7
            long r0 = org.lwjgl.system.Checks.check(r0)
        L10:
            r0 = r7
            r1 = r9
            r2 = r11
            org.lwjgl.system.JNI.invokePPV(r0, r1, r2)
            return
    }

    public static void glslang_shader_set_preprocessed_code(@org.lwjgl.system.NativeType("glslang_shader_t *") long r5, @org.lwjgl.system.NativeType("char const *") java.nio.ByteBuffer r7) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto La
            r0 = r7
            org.lwjgl.system.Checks.checkNT1(r0)
        La:
            r0 = r5
            r1 = r7
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            nglslang_shader_set_preprocessed_code(r0, r1)
            return
    }

    public static void glslang_shader_set_preprocessed_code(@org.lwjgl.system.NativeType("glslang_shader_t *") long r5, @org.lwjgl.system.NativeType("char const *") java.lang.CharSequence r7) {
            org.lwjgl.system.MemoryStack r0 = org.lwjgl.system.MemoryStack.stackGet()
            r8 = r0
            r0 = r8
            int r0 = r0.getPointer()
            r9 = r0
            r0 = r8
            r1 = r7
            r2 = 1
            int r0 = r0.nUTF8(r1, r2)     // Catch: java.lang.Throwable -> L26
            r0 = r8
            long r0 = r0.getPointerAddress()     // Catch: java.lang.Throwable -> L26
            r10 = r0
            r0 = r5
            r1 = r10
            nglslang_shader_set_preprocessed_code(r0, r1)     // Catch: java.lang.Throwable -> L26
            r0 = r8
            r1 = r9
            r0.setPointer(r1)
            goto L31
        L26:
            r12 = move-exception
            r0 = r8
            r1 = r9
            r0.setPointer(r1)
            r0 = r12
            throw r0
        L31:
            return
    }

    public static long nglslang_shader_get_info_log(long r5) {
            long r0 = org.lwjgl.util.shaderc.GLSLang.Functions.shader_get_info_log
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
    public static java.lang.String glslang_shader_get_info_log(@org.lwjgl.system.NativeType("glslang_shader_t *") long r3) {
            r0 = r3
            long r0 = nglslang_shader_get_info_log(r0)
            r5 = r0
            r0 = r5
            java.lang.String r0 = org.lwjgl.system.MemoryUtil.memUTF8Safe(r0)
            return r0
    }

    public static long nglslang_shader_get_info_debug_log(long r5) {
            long r0 = org.lwjgl.util.shaderc.GLSLang.Functions.shader_get_info_debug_log
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
    public static java.lang.String glslang_shader_get_info_debug_log(@org.lwjgl.system.NativeType("glslang_shader_t *") long r3) {
            r0 = r3
            long r0 = nglslang_shader_get_info_debug_log(r0)
            r5 = r0
            r0 = r5
            java.lang.String r0 = org.lwjgl.system.MemoryUtil.memUTF8Safe(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("glslang_program_t *")
    public static long glslang_program_create() {
            long r0 = org.lwjgl.util.shaderc.GLSLang.Functions.program_create
            r3 = r0
            r0 = r3
            long r0 = org.lwjgl.system.JNI.invokeP(r0)
            return r0
    }

    public static void glslang_program_delete(@org.lwjgl.system.NativeType("glslang_program_t *") long r5) {
            long r0 = org.lwjgl.util.shaderc.GLSLang.Functions.program_delete
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

    public static void glslang_program_add_shader(@org.lwjgl.system.NativeType("glslang_program_t *") long r7, @org.lwjgl.system.NativeType("glslang_shader_t *") long r9) {
            long r0 = org.lwjgl.util.shaderc.GLSLang.Functions.program_add_shader
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
            org.lwjgl.system.JNI.invokePPV(r0, r1, r2)
            return
    }

    @org.lwjgl.system.NativeType("int")
    public static boolean glslang_program_link(@org.lwjgl.system.NativeType("glslang_program_t *") long r6, int r8) {
            long r0 = org.lwjgl.util.shaderc.GLSLang.Functions.program_link
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
            if (r0 == 0) goto L1c
            r0 = 1
            goto L1d
        L1c:
            r0 = 0
        L1d:
            return r0
    }

    public static void nglslang_program_add_source_text(long r10, int r12, long r13, long r15) {
            long r0 = org.lwjgl.util.shaderc.GLSLang.Functions.program_add_source_text
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
            org.lwjgl.system.JNI.invokePPPV(r0, r1, r2, r3, r4)
            return
    }

    public static void glslang_program_add_source_text(@org.lwjgl.system.NativeType("glslang_program_t *") long r8, @org.lwjgl.system.NativeType("glslang_stage_t") int r10, @org.lwjgl.system.NativeType("char const *") java.nio.ByteBuffer r11) {
            r0 = r8
            r1 = r10
            r2 = r11
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            r3 = r11
            int r3 = r3.remaining()
            long r3 = (long) r3
            nglslang_program_add_source_text(r0, r1, r2, r3)
            return
    }

    public static void glslang_program_add_source_text(@org.lwjgl.system.NativeType("glslang_program_t *") long r8, @org.lwjgl.system.NativeType("glslang_stage_t") int r10, @org.lwjgl.system.NativeType("char const *") java.lang.CharSequence r11) {
            org.lwjgl.system.MemoryStack r0 = org.lwjgl.system.MemoryStack.stackGet()
            r12 = r0
            r0 = r12
            int r0 = r0.getPointer()
            r13 = r0
            r0 = r12
            r1 = r11
            r2 = 0
            int r0 = r0.nUTF8(r1, r2)     // Catch: java.lang.Throwable -> L30
            r14 = r0
            r0 = r12
            long r0 = r0.getPointerAddress()     // Catch: java.lang.Throwable -> L30
            r15 = r0
            r0 = r8
            r1 = r10
            r2 = r15
            r3 = r14
            long r3 = (long) r3     // Catch: java.lang.Throwable -> L30
            nglslang_program_add_source_text(r0, r1, r2, r3)     // Catch: java.lang.Throwable -> L30
            r0 = r12
            r1 = r13
            r0.setPointer(r1)
            goto L3c
        L30:
            r17 = move-exception
            r0 = r12
            r1 = r13
            r0.setPointer(r1)
            r0 = r17
            throw r0
        L3c:
            return
    }

    public static void nglslang_program_set_source_file(long r8, int r10, long r11) {
            long r0 = org.lwjgl.util.shaderc.GLSLang.Functions.program_set_source_file
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

    public static void glslang_program_set_source_file(@org.lwjgl.system.NativeType("glslang_program_t *") long r6, @org.lwjgl.system.NativeType("glslang_stage_t") int r8, @org.lwjgl.system.NativeType("char const *") java.nio.ByteBuffer r9) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto La
            r0 = r9
            org.lwjgl.system.Checks.checkNT1(r0)
        La:
            r0 = r6
            r1 = r8
            r2 = r9
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            nglslang_program_set_source_file(r0, r1, r2)
            return
    }

    public static void glslang_program_set_source_file(@org.lwjgl.system.NativeType("glslang_program_t *") long r6, @org.lwjgl.system.NativeType("glslang_stage_t") int r8, @org.lwjgl.system.NativeType("char const *") java.lang.CharSequence r9) {
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
            nglslang_program_set_source_file(r0, r1, r2)     // Catch: java.lang.Throwable -> L2c
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

    @org.lwjgl.system.NativeType("int")
    public static boolean glslang_program_map_io(@org.lwjgl.system.NativeType("glslang_program_t *") long r5) {
            long r0 = org.lwjgl.util.shaderc.GLSLang.Functions.program_map_io
            r7 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lf
            r0 = r5
            long r0 = org.lwjgl.system.Checks.check(r0)
        Lf:
            r0 = r5
            r1 = r7
            int r0 = org.lwjgl.system.JNI.invokePI(r0, r1)
            if (r0 == 0) goto L1b
            r0 = 1
            goto L1c
        L1b:
            r0 = 0
        L1c:
            return r0
    }

    @org.lwjgl.system.NativeType("int")
    public static boolean glslang_program_map_io_with_resolver_and_mapper(@org.lwjgl.system.NativeType("glslang_program_t *") long r9, @org.lwjgl.system.NativeType("glslang_resolver_t *") long r11, @org.lwjgl.system.NativeType("glslang_mapper_t *") long r13) {
            long r0 = org.lwjgl.util.shaderc.GLSLang.Functions.program_map_io_with_resolver_and_mapper
            r15 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L1b
            r0 = r9
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r11
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r13
            long r0 = org.lwjgl.system.Checks.check(r0)
        L1b:
            r0 = r9
            r1 = r11
            r2 = r13
            r3 = r15
            int r0 = org.lwjgl.system.JNI.invokePPPI(r0, r1, r2, r3)
            if (r0 == 0) goto L2b
            r0 = 1
            goto L2c
        L2b:
            r0 = 0
        L2c:
            return r0
    }

    public static void glslang_program_SPIRV_generate(@org.lwjgl.system.NativeType("glslang_program_t *") long r6, @org.lwjgl.system.NativeType("glslang_stage_t") int r8) {
            long r0 = org.lwjgl.util.shaderc.GLSLang.Functions.program_SPIRV_generate
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

    public static void nglslang_program_SPIRV_generate_with_options(long r8, int r10, long r11) {
            long r0 = org.lwjgl.util.shaderc.GLSLang.Functions.program_SPIRV_generate_with_options
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

    public static void glslang_program_SPIRV_generate_with_options(@org.lwjgl.system.NativeType("glslang_program_t *") long r6, @org.lwjgl.system.NativeType("glslang_stage_t") int r8, @org.lwjgl.system.NativeType("glslang_spv_options_t *") org.lwjgl.util.shaderc.GLSLangSPVOptions r9) {
            r0 = r6
            r1 = r8
            r2 = r9
            long r2 = r2.address()
            nglslang_program_SPIRV_generate_with_options(r0, r1, r2)
            return
    }

    @org.lwjgl.system.NativeType("size_t")
    public static long glslang_program_SPIRV_get_size(@org.lwjgl.system.NativeType("glslang_program_t *") long r5) {
            long r0 = org.lwjgl.util.shaderc.GLSLang.Functions.program_SPIRV_get_size
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

    public static void nglslang_program_SPIRV_get(long r7, long r9) {
            long r0 = org.lwjgl.util.shaderc.GLSLang.Functions.program_SPIRV_get
            r11 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L10
            r0 = r7
            long r0 = org.lwjgl.system.Checks.check(r0)
        L10:
            r0 = r7
            r1 = r9
            r2 = r11
            org.lwjgl.system.JNI.invokePPV(r0, r1, r2)
            return
    }

    public static void glslang_program_SPIRV_get(@org.lwjgl.system.NativeType("glslang_program_t *") long r5, @org.lwjgl.system.NativeType("unsigned int *") java.nio.IntBuffer r7) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L14
            boolean r0 = org.lwjgl.system.Checks.DEBUG
            if (r0 == 0) goto L14
            r0 = r7
            r1 = r5
            long r1 = glslang_program_SPIRV_get_size(r1)
            org.lwjgl.system.Checks.check(r0, r1)
        L14:
            r0 = r5
            r1 = r7
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            nglslang_program_SPIRV_get(r0, r1)
            return
    }

    public static long nglslang_program_SPIRV_get_ptr(long r5) {
            long r0 = org.lwjgl.util.shaderc.GLSLang.Functions.program_SPIRV_get_ptr
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

    @org.lwjgl.system.NativeType("unsigned int *")
    public static java.nio.IntBuffer glslang_program_SPIRV_get_ptr(@org.lwjgl.system.NativeType("glslang_program_t *") long r5) {
            r0 = r5
            long r0 = nglslang_program_SPIRV_get_ptr(r0)
            r7 = r0
            r0 = r7
            r1 = r5
            long r1 = glslang_program_SPIRV_get_size(r1)
            int r1 = (int) r1
            java.nio.IntBuffer r0 = org.lwjgl.system.MemoryUtil.memIntBufferSafe(r0, r1)
            return r0
    }

    @org.lwjgl.system.NativeType("unsigned int *")
    public static java.nio.IntBuffer glslang_program_SPIRV_get_ptr(@org.lwjgl.system.NativeType("glslang_program_t *") long r5, long r7) {
            r0 = r5
            long r0 = nglslang_program_SPIRV_get_ptr(r0)
            r9 = r0
            r0 = r9
            r1 = r7
            int r1 = (int) r1
            java.nio.IntBuffer r0 = org.lwjgl.system.MemoryUtil.memIntBufferSafe(r0, r1)
            return r0
    }

    public static long nglslang_program_SPIRV_get_messages(long r5) {
            long r0 = org.lwjgl.util.shaderc.GLSLang.Functions.program_SPIRV_get_messages
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
    public static java.lang.String glslang_program_SPIRV_get_messages(@org.lwjgl.system.NativeType("glslang_program_t *") long r3) {
            r0 = r3
            long r0 = nglslang_program_SPIRV_get_messages(r0)
            r5 = r0
            r0 = r5
            java.lang.String r0 = org.lwjgl.system.MemoryUtil.memUTF8Safe(r0)
            return r0
    }

    public static long nglslang_program_get_info_log(long r5) {
            long r0 = org.lwjgl.util.shaderc.GLSLang.Functions.program_get_info_log
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
    public static java.lang.String glslang_program_get_info_log(@org.lwjgl.system.NativeType("glslang_program_t *") long r3) {
            r0 = r3
            long r0 = nglslang_program_get_info_log(r0)
            r5 = r0
            r0 = r5
            java.lang.String r0 = org.lwjgl.system.MemoryUtil.memUTF8Safe(r0)
            return r0
    }

    public static long nglslang_program_get_info_debug_log(long r5) {
            long r0 = org.lwjgl.util.shaderc.GLSLang.Functions.program_get_info_debug_log
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
    public static java.lang.String glslang_program_get_info_debug_log(@org.lwjgl.system.NativeType("glslang_program_t *") long r3) {
            r0 = r3
            long r0 = nglslang_program_get_info_debug_log(r0)
            r5 = r0
            r0 = r5
            java.lang.String r0 = org.lwjgl.system.MemoryUtil.memUTF8Safe(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("glslang_mapper_t *")
    public static long glslang_glsl_mapper_create() {
            long r0 = org.lwjgl.util.shaderc.GLSLang.Functions.glsl_mapper_create
            r3 = r0
            r0 = r3
            long r0 = org.lwjgl.system.JNI.invokeP(r0)
            return r0
    }

    public static void glslang_glsl_mapper_delete(@org.lwjgl.system.NativeType("glslang_mapper_t *") long r5) {
            long r0 = org.lwjgl.util.shaderc.GLSLang.Functions.glsl_mapper_delete
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

    @org.lwjgl.system.NativeType("glslang_resolver_t *")
    public static long glslang_glsl_resolver_create(@org.lwjgl.system.NativeType("glslang_program_t *") long r6, @org.lwjgl.system.NativeType("glslang_stage_t") int r8) {
            long r0 = org.lwjgl.util.shaderc.GLSLang.Functions.glsl_resolver_create
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

    public static void glslang_glsl_resolver_delete(@org.lwjgl.system.NativeType("glslang_resolver_t *") long r5) {
            long r0 = org.lwjgl.util.shaderc.GLSLang.Functions.glsl_resolver_delete
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

    static /* synthetic */ org.lwjgl.system.SharedLibrary access$000() {
            org.lwjgl.system.SharedLibrary r0 = org.lwjgl.util.shaderc.GLSLang.SHADERC
            return r0
    }

    static {
            java.lang.Class<org.lwjgl.util.shaderc.GLSLang> r0 = org.lwjgl.util.shaderc.GLSLang.class
            java.lang.String r1 = "org.lwjgl.shaderc"
            org.lwjgl.system.Configuration r2 = org.lwjgl.system.Configuration.GLSLANG_LIBRARY_NAME
            void r3 = org.lwjgl.util.shaderc.Shaderc::getLibrary
            r4 = 0
            java.lang.String[] r4 = new java.lang.String[r4]
            org.lwjgl.system.SharedLibrary r0 = org.lwjgl.system.Library.loadNative(r0, r1, r2, r3, r4)
            org.lwjgl.util.shaderc.GLSLang.SHADERC = r0
            return
    }
}
