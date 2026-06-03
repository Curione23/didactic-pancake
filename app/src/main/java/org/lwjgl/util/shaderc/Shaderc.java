package org.lwjgl.util.shaderc;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/util/shaderc/Shaderc.class */
public class Shaderc {
    private static final org.lwjgl.system.SharedLibrary SHADERC = null;
    public static final int shaderc_target_env_vulkan = 0;
    public static final int shaderc_target_env_opengl = 1;
    public static final int shaderc_target_env_opengl_compat = 2;
    public static final int shaderc_target_env_webgpu = 3;
    public static final int shaderc_target_env_default = 0;
    public static final int shaderc_env_version_vulkan_1_0 = 4194304;
    public static final int shaderc_env_version_vulkan_1_1 = 4198400;
    public static final int shaderc_env_version_vulkan_1_2 = 4202496;
    public static final int shaderc_env_version_vulkan_1_3 = 4206592;
    public static final int shaderc_env_version_vulkan_1_4 = 4210688;
    public static final int shaderc_env_version_opengl_4_5 = 450;
    public static final int shaderc_env_version_webgpu = 451;
    public static final int shaderc_spirv_version_1_0 = 65536;
    public static final int shaderc_spirv_version_1_1 = 65792;
    public static final int shaderc_spirv_version_1_2 = 66048;
    public static final int shaderc_spirv_version_1_3 = 66304;
    public static final int shaderc_spirv_version_1_4 = 66560;
    public static final int shaderc_spirv_version_1_5 = 66816;
    public static final int shaderc_spirv_version_1_6 = 67072;
    public static final int shaderc_compilation_status_success = 0;
    public static final int shaderc_compilation_status_invalid_stage = 1;
    public static final int shaderc_compilation_status_compilation_error = 2;
    public static final int shaderc_compilation_status_internal_error = 3;
    public static final int shaderc_compilation_status_null_result_object = 4;
    public static final int shaderc_compilation_status_invalid_assembly = 5;
    public static final int shaderc_compilation_status_validation_error = 6;
    public static final int shaderc_compilation_status_transformation_error = 7;
    public static final int shaderc_compilation_status_configuration_error = 8;
    public static final int shaderc_source_language_glsl = 0;
    public static final int shaderc_source_language_hlsl = 1;
    public static final int shaderc_vertex_shader = 0;
    public static final int shaderc_fragment_shader = 1;
    public static final int shaderc_compute_shader = 2;
    public static final int shaderc_geometry_shader = 3;
    public static final int shaderc_tess_control_shader = 4;
    public static final int shaderc_tess_evaluation_shader = 5;
    public static final int shaderc_glsl_vertex_shader = 0;
    public static final int shaderc_glsl_fragment_shader = 1;
    public static final int shaderc_glsl_compute_shader = 2;
    public static final int shaderc_glsl_geometry_shader = 3;
    public static final int shaderc_glsl_tess_control_shader = 4;
    public static final int shaderc_glsl_tess_evaluation_shader = 5;
    public static final int shaderc_glsl_infer_from_source = 6;
    public static final int shaderc_glsl_default_vertex_shader = 7;
    public static final int shaderc_glsl_default_fragment_shader = 8;
    public static final int shaderc_glsl_default_compute_shader = 9;
    public static final int shaderc_glsl_default_geometry_shader = 10;
    public static final int shaderc_glsl_default_tess_control_shader = 11;
    public static final int shaderc_glsl_default_tess_evaluation_shader = 12;
    public static final int shaderc_spirv_assembly = 13;
    public static final int shaderc_raygen_shader = 14;
    public static final int shaderc_anyhit_shader = 15;
    public static final int shaderc_closesthit_shader = 16;
    public static final int shaderc_miss_shader = 17;
    public static final int shaderc_intersection_shader = 18;
    public static final int shaderc_callable_shader = 19;
    public static final int shaderc_glsl_raygen_shader = 14;
    public static final int shaderc_glsl_anyhit_shader = 15;
    public static final int shaderc_glsl_closesthit_shader = 16;
    public static final int shaderc_glsl_miss_shader = 17;
    public static final int shaderc_glsl_intersection_shader = 18;
    public static final int shaderc_glsl_callable_shader = 19;
    public static final int shaderc_glsl_default_raygen_shader = 20;
    public static final int shaderc_glsl_default_anyhit_shader = 21;
    public static final int shaderc_glsl_default_closesthit_shader = 22;
    public static final int shaderc_glsl_default_miss_shader = 23;
    public static final int shaderc_glsl_default_intersection_shader = 24;
    public static final int shaderc_glsl_default_callable_shader = 25;
    public static final int shaderc_task_shader = 26;
    public static final int shaderc_mesh_shader = 27;
    public static final int shaderc_glsl_task_shader = 26;
    public static final int shaderc_glsl_mesh_shader = 27;
    public static final int shaderc_glsl_default_task_shader = 28;
    public static final int shaderc_glsl_default_mesh_shader = 29;
    public static final int shaderc_profile_none = 0;
    public static final int shaderc_profile_core = 1;
    public static final int shaderc_profile_compatibility = 2;
    public static final int shaderc_profile_es = 3;
    public static final int shaderc_optimization_level_zero = 0;
    public static final int shaderc_optimization_level_size = 1;
    public static final int shaderc_optimization_level_performance = 2;
    public static final int shaderc_limit_max_lights = 0;
    public static final int shaderc_limit_max_clip_planes = 1;
    public static final int shaderc_limit_max_texture_units = 2;
    public static final int shaderc_limit_max_texture_coords = 3;
    public static final int shaderc_limit_max_vertex_attribs = 4;
    public static final int shaderc_limit_max_vertex_uniform_components = 5;
    public static final int shaderc_limit_max_varying_floats = 6;
    public static final int shaderc_limit_max_vertex_texture_image_units = 7;
    public static final int shaderc_limit_max_combined_texture_image_units = 8;
    public static final int shaderc_limit_max_texture_image_units = 9;
    public static final int shaderc_limit_max_fragment_uniform_components = 10;
    public static final int shaderc_limit_max_draw_buffers = 11;
    public static final int shaderc_limit_max_vertex_uniform_vectors = 12;
    public static final int shaderc_limit_max_varying_vectors = 13;
    public static final int shaderc_limit_max_fragment_uniform_vectors = 14;
    public static final int shaderc_limit_max_vertex_output_vectors = 15;
    public static final int shaderc_limit_max_fragment_input_vectors = 16;
    public static final int shaderc_limit_min_program_texel_offset = 17;
    public static final int shaderc_limit_max_program_texel_offset = 18;
    public static final int shaderc_limit_max_clip_distances = 19;
    public static final int shaderc_limit_max_compute_work_group_count_x = 20;
    public static final int shaderc_limit_max_compute_work_group_count_y = 21;
    public static final int shaderc_limit_max_compute_work_group_count_z = 22;
    public static final int shaderc_limit_max_compute_work_group_size_x = 23;
    public static final int shaderc_limit_max_compute_work_group_size_y = 24;
    public static final int shaderc_limit_max_compute_work_group_size_z = 25;
    public static final int shaderc_limit_max_compute_uniform_components = 26;
    public static final int shaderc_limit_max_compute_texture_image_units = 27;
    public static final int shaderc_limit_max_compute_image_uniforms = 28;
    public static final int shaderc_limit_max_compute_atomic_counters = 29;
    public static final int shaderc_limit_max_compute_atomic_counter_buffers = 30;
    public static final int shaderc_limit_max_varying_components = 31;
    public static final int shaderc_limit_max_vertex_output_components = 32;
    public static final int shaderc_limit_max_geometry_input_components = 33;
    public static final int shaderc_limit_max_geometry_output_components = 34;
    public static final int shaderc_limit_max_fragment_input_components = 35;
    public static final int shaderc_limit_max_image_units = 36;
    public static final int shaderc_limit_max_combined_image_units_and_fragment_outputs = 37;
    public static final int shaderc_limit_max_combined_shader_output_resources = 38;
    public static final int shaderc_limit_max_image_samples = 39;
    public static final int shaderc_limit_max_vertex_image_uniforms = 40;
    public static final int shaderc_limit_max_tess_control_image_uniforms = 41;
    public static final int shaderc_limit_max_tess_evaluation_image_uniforms = 42;
    public static final int shaderc_limit_max_geometry_image_uniforms = 43;
    public static final int shaderc_limit_max_fragment_image_uniforms = 44;
    public static final int shaderc_limit_max_combined_image_uniforms = 45;
    public static final int shaderc_limit_max_geometry_texture_image_units = 46;
    public static final int shaderc_limit_max_geometry_output_vertices = 47;
    public static final int shaderc_limit_max_geometry_total_output_components = 48;
    public static final int shaderc_limit_max_geometry_uniform_components = 49;
    public static final int shaderc_limit_max_geometry_varying_components = 50;
    public static final int shaderc_limit_max_tess_control_input_components = 51;
    public static final int shaderc_limit_max_tess_control_output_components = 52;
    public static final int shaderc_limit_max_tess_control_texture_image_units = 53;
    public static final int shaderc_limit_max_tess_control_uniform_components = 54;
    public static final int shaderc_limit_max_tess_control_total_output_components = 55;
    public static final int shaderc_limit_max_tess_evaluation_input_components = 56;
    public static final int shaderc_limit_max_tess_evaluation_output_components = 57;
    public static final int shaderc_limit_max_tess_evaluation_texture_image_units = 58;
    public static final int shaderc_limit_max_tess_evaluation_uniform_components = 59;
    public static final int shaderc_limit_max_tess_patch_components = 60;
    public static final int shaderc_limit_max_patch_vertices = 61;
    public static final int shaderc_limit_max_tess_gen_level = 62;
    public static final int shaderc_limit_max_viewports = 63;
    public static final int shaderc_limit_max_vertex_atomic_counters = 64;
    public static final int shaderc_limit_max_tess_control_atomic_counters = 65;
    public static final int shaderc_limit_max_tess_evaluation_atomic_counters = 66;
    public static final int shaderc_limit_max_geometry_atomic_counters = 67;
    public static final int shaderc_limit_max_fragment_atomic_counters = 68;
    public static final int shaderc_limit_max_combined_atomic_counters = 69;
    public static final int shaderc_limit_max_atomic_counter_bindings = 70;
    public static final int shaderc_limit_max_vertex_atomic_counter_buffers = 71;
    public static final int shaderc_limit_max_tess_control_atomic_counter_buffers = 72;
    public static final int shaderc_limit_max_tess_evaluation_atomic_counter_buffers = 73;
    public static final int shaderc_limit_max_geometry_atomic_counter_buffers = 74;
    public static final int shaderc_limit_max_fragment_atomic_counter_buffers = 75;
    public static final int shaderc_limit_max_combined_atomic_counter_buffers = 76;
    public static final int shaderc_limit_max_atomic_counter_buffer_size = 77;
    public static final int shaderc_limit_max_transform_feedback_buffers = 78;
    public static final int shaderc_limit_max_transform_feedback_interleaved_components = 79;
    public static final int shaderc_limit_max_cull_distances = 80;
    public static final int shaderc_limit_max_combined_clip_and_cull_distances = 81;
    public static final int shaderc_limit_max_samples = 82;
    public static final int shaderc_limit_max_mesh_output_vertices_nv = 83;
    public static final int shaderc_limit_max_mesh_output_primitives_nv = 84;
    public static final int shaderc_limit_max_mesh_work_group_size_x_nv = 85;
    public static final int shaderc_limit_max_mesh_work_group_size_y_nv = 86;
    public static final int shaderc_limit_max_mesh_work_group_size_z_nv = 87;
    public static final int shaderc_limit_max_task_work_group_size_x_nv = 88;
    public static final int shaderc_limit_max_task_work_group_size_y_nv = 89;
    public static final int shaderc_limit_max_task_work_group_size_z_nv = 90;
    public static final int shaderc_limit_max_mesh_view_count_nv = 91;
    public static final int shaderc_limit_max_mesh_output_vertices_ext = 92;
    public static final int shaderc_limit_max_mesh_output_primitives_ext = 93;
    public static final int shaderc_limit_max_mesh_work_group_size_x_ext = 94;
    public static final int shaderc_limit_max_mesh_work_group_size_y_ext = 95;
    public static final int shaderc_limit_max_mesh_work_group_size_z_ext = 96;
    public static final int shaderc_limit_max_task_work_group_size_x_ext = 97;
    public static final int shaderc_limit_max_task_work_group_size_y_ext = 98;
    public static final int shaderc_limit_max_task_work_group_size_z_ext = 99;
    public static final int shaderc_limit_max_mesh_view_count_ext = 100;
    public static final int shaderc_limit_max_dual_source_draw_buffers_ext = 101;
    public static final int shaderc_uniform_kind_image = 0;
    public static final int shaderc_uniform_kind_sampler = 1;
    public static final int shaderc_uniform_kind_texture = 2;
    public static final int shaderc_uniform_kind_buffer = 3;
    public static final int shaderc_uniform_kind_storage_buffer = 4;
    public static final int shaderc_uniform_kind_unordered_access_view = 5;
    public static final int shaderc_include_type_relative = 0;
    public static final int shaderc_include_type_standard = 1;

    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/util/shaderc/Shaderc$Functions.class */
    public static final class Functions {
        public static final long compiler_initialize = 0;
        public static final long compiler_release = 0;
        public static final long compile_options_initialize = 0;
        public static final long compile_options_clone = 0;
        public static final long compile_options_release = 0;
        public static final long compile_options_add_macro_definition = 0;
        public static final long compile_options_set_source_language = 0;
        public static final long compile_options_set_generate_debug_info = 0;
        public static final long compile_options_set_optimization_level = 0;
        public static final long compile_options_set_forced_version_profile = 0;
        public static final long compile_options_set_include_callbacks = 0;
        public static final long compile_options_set_suppress_warnings = 0;
        public static final long compile_options_set_target_env = 0;
        public static final long compile_options_set_target_spirv = 0;
        public static final long compile_options_set_warnings_as_errors = 0;
        public static final long compile_options_set_limit = 0;
        public static final long compile_options_set_auto_bind_uniforms = 0;
        public static final long compile_options_set_auto_combined_image_sampler = 0;
        public static final long compile_options_set_hlsl_io_mapping = 0;
        public static final long compile_options_set_hlsl_offsets = 0;
        public static final long compile_options_set_binding_base = 0;
        public static final long compile_options_set_binding_base_for_stage = 0;
        public static final long compile_options_set_preserve_bindings = 0;
        public static final long compile_options_set_max_id_bound = 0;
        public static final long compile_options_set_auto_map_locations = 0;
        public static final long compile_options_set_hlsl_register_set_and_binding_for_stage = 0;
        public static final long compile_options_set_hlsl_register_set_and_binding = 0;
        public static final long compile_options_set_hlsl_functionality1 = 0;
        public static final long compile_options_set_hlsl_16bit_types = 0;
        public static final long compile_options_set_vulkan_rules_relaxed = 0;
        public static final long compile_options_set_invert_y = 0;
        public static final long compile_options_set_nan_clamp = 0;
        public static final long compile_into_spv = 0;
        public static final long compile_into_spv_assembly = 0;
        public static final long compile_into_preprocessed_text = 0;
        public static final long assemble_into_spv = 0;
        public static final long result_release = 0;
        public static final long result_get_length = 0;
        public static final long result_get_num_warnings = 0;
        public static final long result_get_num_errors = 0;
        public static final long result_get_compilation_status = 0;
        public static final long result_get_bytes = 0;
        public static final long result_get_error_message = 0;
        public static final long get_spv_version = 0;
        public static final long parse_version_profile = 0;

        private Functions() {
                r2 = this;
                r0 = r2
                r0.<init>()
                return
        }

        static {
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.util.shaderc.Shaderc.access$000()
                java.lang.String r1 = "shaderc_compiler_initialize"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.util.shaderc.Shaderc.Functions.compiler_initialize = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.util.shaderc.Shaderc.access$000()
                java.lang.String r1 = "shaderc_compiler_release"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.util.shaderc.Shaderc.Functions.compiler_release = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.util.shaderc.Shaderc.access$000()
                java.lang.String r1 = "shaderc_compile_options_initialize"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.util.shaderc.Shaderc.Functions.compile_options_initialize = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.util.shaderc.Shaderc.access$000()
                java.lang.String r1 = "shaderc_compile_options_clone"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.util.shaderc.Shaderc.Functions.compile_options_clone = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.util.shaderc.Shaderc.access$000()
                java.lang.String r1 = "shaderc_compile_options_release"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.util.shaderc.Shaderc.Functions.compile_options_release = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.util.shaderc.Shaderc.access$000()
                java.lang.String r1 = "shaderc_compile_options_add_macro_definition"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.util.shaderc.Shaderc.Functions.compile_options_add_macro_definition = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.util.shaderc.Shaderc.access$000()
                java.lang.String r1 = "shaderc_compile_options_set_source_language"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.util.shaderc.Shaderc.Functions.compile_options_set_source_language = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.util.shaderc.Shaderc.access$000()
                java.lang.String r1 = "shaderc_compile_options_set_generate_debug_info"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.util.shaderc.Shaderc.Functions.compile_options_set_generate_debug_info = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.util.shaderc.Shaderc.access$000()
                java.lang.String r1 = "shaderc_compile_options_set_optimization_level"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.util.shaderc.Shaderc.Functions.compile_options_set_optimization_level = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.util.shaderc.Shaderc.access$000()
                java.lang.String r1 = "shaderc_compile_options_set_forced_version_profile"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.util.shaderc.Shaderc.Functions.compile_options_set_forced_version_profile = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.util.shaderc.Shaderc.access$000()
                java.lang.String r1 = "shaderc_compile_options_set_include_callbacks"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.util.shaderc.Shaderc.Functions.compile_options_set_include_callbacks = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.util.shaderc.Shaderc.access$000()
                java.lang.String r1 = "shaderc_compile_options_set_suppress_warnings"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.util.shaderc.Shaderc.Functions.compile_options_set_suppress_warnings = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.util.shaderc.Shaderc.access$000()
                java.lang.String r1 = "shaderc_compile_options_set_target_env"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.util.shaderc.Shaderc.Functions.compile_options_set_target_env = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.util.shaderc.Shaderc.access$000()
                java.lang.String r1 = "shaderc_compile_options_set_target_spirv"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.util.shaderc.Shaderc.Functions.compile_options_set_target_spirv = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.util.shaderc.Shaderc.access$000()
                java.lang.String r1 = "shaderc_compile_options_set_warnings_as_errors"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.util.shaderc.Shaderc.Functions.compile_options_set_warnings_as_errors = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.util.shaderc.Shaderc.access$000()
                java.lang.String r1 = "shaderc_compile_options_set_limit"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.util.shaderc.Shaderc.Functions.compile_options_set_limit = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.util.shaderc.Shaderc.access$000()
                java.lang.String r1 = "shaderc_compile_options_set_auto_bind_uniforms"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.util.shaderc.Shaderc.Functions.compile_options_set_auto_bind_uniforms = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.util.shaderc.Shaderc.access$000()
                java.lang.String r1 = "shaderc_compile_options_set_auto_combined_image_sampler"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.util.shaderc.Shaderc.Functions.compile_options_set_auto_combined_image_sampler = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.util.shaderc.Shaderc.access$000()
                java.lang.String r1 = "shaderc_compile_options_set_hlsl_io_mapping"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.util.shaderc.Shaderc.Functions.compile_options_set_hlsl_io_mapping = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.util.shaderc.Shaderc.access$000()
                java.lang.String r1 = "shaderc_compile_options_set_hlsl_offsets"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.util.shaderc.Shaderc.Functions.compile_options_set_hlsl_offsets = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.util.shaderc.Shaderc.access$000()
                java.lang.String r1 = "shaderc_compile_options_set_binding_base"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.util.shaderc.Shaderc.Functions.compile_options_set_binding_base = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.util.shaderc.Shaderc.access$000()
                java.lang.String r1 = "shaderc_compile_options_set_binding_base_for_stage"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.util.shaderc.Shaderc.Functions.compile_options_set_binding_base_for_stage = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.util.shaderc.Shaderc.access$000()
                java.lang.String r1 = "shaderc_compile_options_set_preserve_bindings"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.util.shaderc.Shaderc.Functions.compile_options_set_preserve_bindings = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.util.shaderc.Shaderc.access$000()
                java.lang.String r1 = "shaderc_compile_options_set_max_id_bound"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.util.shaderc.Shaderc.Functions.compile_options_set_max_id_bound = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.util.shaderc.Shaderc.access$000()
                java.lang.String r1 = "shaderc_compile_options_set_auto_map_locations"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.util.shaderc.Shaderc.Functions.compile_options_set_auto_map_locations = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.util.shaderc.Shaderc.access$000()
                java.lang.String r1 = "shaderc_compile_options_set_hlsl_register_set_and_binding_for_stage"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.util.shaderc.Shaderc.Functions.compile_options_set_hlsl_register_set_and_binding_for_stage = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.util.shaderc.Shaderc.access$000()
                java.lang.String r1 = "shaderc_compile_options_set_hlsl_register_set_and_binding"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.util.shaderc.Shaderc.Functions.compile_options_set_hlsl_register_set_and_binding = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.util.shaderc.Shaderc.access$000()
                java.lang.String r1 = "shaderc_compile_options_set_hlsl_functionality1"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.util.shaderc.Shaderc.Functions.compile_options_set_hlsl_functionality1 = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.util.shaderc.Shaderc.access$000()
                java.lang.String r1 = "shaderc_compile_options_set_hlsl_16bit_types"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.util.shaderc.Shaderc.Functions.compile_options_set_hlsl_16bit_types = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.util.shaderc.Shaderc.access$000()
                java.lang.String r1 = "shaderc_compile_options_set_vulkan_rules_relaxed"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.util.shaderc.Shaderc.Functions.compile_options_set_vulkan_rules_relaxed = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.util.shaderc.Shaderc.access$000()
                java.lang.String r1 = "shaderc_compile_options_set_invert_y"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.util.shaderc.Shaderc.Functions.compile_options_set_invert_y = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.util.shaderc.Shaderc.access$000()
                java.lang.String r1 = "shaderc_compile_options_set_nan_clamp"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.util.shaderc.Shaderc.Functions.compile_options_set_nan_clamp = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.util.shaderc.Shaderc.access$000()
                java.lang.String r1 = "shaderc_compile_into_spv"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.util.shaderc.Shaderc.Functions.compile_into_spv = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.util.shaderc.Shaderc.access$000()
                java.lang.String r1 = "shaderc_compile_into_spv_assembly"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.util.shaderc.Shaderc.Functions.compile_into_spv_assembly = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.util.shaderc.Shaderc.access$000()
                java.lang.String r1 = "shaderc_compile_into_preprocessed_text"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.util.shaderc.Shaderc.Functions.compile_into_preprocessed_text = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.util.shaderc.Shaderc.access$000()
                java.lang.String r1 = "shaderc_assemble_into_spv"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.util.shaderc.Shaderc.Functions.assemble_into_spv = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.util.shaderc.Shaderc.access$000()
                java.lang.String r1 = "shaderc_result_release"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.util.shaderc.Shaderc.Functions.result_release = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.util.shaderc.Shaderc.access$000()
                java.lang.String r1 = "shaderc_result_get_length"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.util.shaderc.Shaderc.Functions.result_get_length = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.util.shaderc.Shaderc.access$000()
                java.lang.String r1 = "shaderc_result_get_num_warnings"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.util.shaderc.Shaderc.Functions.result_get_num_warnings = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.util.shaderc.Shaderc.access$000()
                java.lang.String r1 = "shaderc_result_get_num_errors"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.util.shaderc.Shaderc.Functions.result_get_num_errors = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.util.shaderc.Shaderc.access$000()
                java.lang.String r1 = "shaderc_result_get_compilation_status"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.util.shaderc.Shaderc.Functions.result_get_compilation_status = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.util.shaderc.Shaderc.access$000()
                java.lang.String r1 = "shaderc_result_get_bytes"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.util.shaderc.Shaderc.Functions.result_get_bytes = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.util.shaderc.Shaderc.access$000()
                java.lang.String r1 = "shaderc_result_get_error_message"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.util.shaderc.Shaderc.Functions.result_get_error_message = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.util.shaderc.Shaderc.access$000()
                java.lang.String r1 = "shaderc_get_spv_version"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.util.shaderc.Shaderc.Functions.get_spv_version = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.util.shaderc.Shaderc.access$000()
                java.lang.String r1 = "shaderc_parse_version_profile"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.util.shaderc.Shaderc.Functions.parse_version_profile = r0
                return
        }
    }

    public static org.lwjgl.system.SharedLibrary getLibrary() {
            org.lwjgl.system.SharedLibrary r0 = org.lwjgl.util.shaderc.Shaderc.SHADERC
            return r0
    }

    protected Shaderc() {
            r3 = this;
            r0 = r3
            r0.<init>()
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r1 = r0
            r1.<init>()
            throw r0
    }

    @org.lwjgl.system.NativeType("shaderc_compiler_t")
    public static long shaderc_compiler_initialize() {
            long r0 = org.lwjgl.util.shaderc.Shaderc.Functions.compiler_initialize
            r3 = r0
            r0 = r3
            long r0 = org.lwjgl.system.JNI.invokeP(r0)
            return r0
    }

    public static void shaderc_compiler_release(@org.lwjgl.system.NativeType("shaderc_compiler_t") long r5) {
            long r0 = org.lwjgl.util.shaderc.Shaderc.Functions.compiler_release
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

    @org.lwjgl.system.NativeType("shaderc_compile_options_t")
    public static long shaderc_compile_options_initialize() {
            long r0 = org.lwjgl.util.shaderc.Shaderc.Functions.compile_options_initialize
            r3 = r0
            r0 = r3
            long r0 = org.lwjgl.system.JNI.invokeP(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("shaderc_compile_options_t")
    public static long shaderc_compile_options_clone(@org.lwjgl.system.NativeType("shaderc_compile_options_t const") long r5) {
            long r0 = org.lwjgl.util.shaderc.Shaderc.Functions.compile_options_clone
            r7 = r0
            r0 = r5
            r1 = r7
            long r0 = org.lwjgl.system.JNI.invokePP(r0, r1)
            return r0
    }

    public static void shaderc_compile_options_release(@org.lwjgl.system.NativeType("shaderc_compile_options_t") long r5) {
            long r0 = org.lwjgl.util.shaderc.Shaderc.Functions.compile_options_release
            r7 = r0
            r0 = r5
            r1 = r7
            org.lwjgl.system.JNI.invokePV(r0, r1)
            return
    }

    public static void nshaderc_compile_options_add_macro_definition(long r13, long r15, long r17, long r19, long r21) {
            long r0 = org.lwjgl.util.shaderc.Shaderc.Functions.compile_options_add_macro_definition
            r23 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L10
            r0 = r13
            long r0 = org.lwjgl.system.Checks.check(r0)
        L10:
            r0 = r13
            r1 = r15
            r2 = r17
            r3 = r19
            r4 = r21
            r5 = r23
            org.lwjgl.system.JNI.invokePPPPPV(r0, r1, r2, r3, r4, r5)
            return
    }

    public static void shaderc_compile_options_add_macro_definition(@org.lwjgl.system.NativeType("shaderc_compile_options_t") long r11, @org.lwjgl.system.NativeType("char const *") java.nio.ByteBuffer r13, @org.lwjgl.system.NativeType("char const *") java.nio.ByteBuffer r14) {
            r0 = r11
            r1 = r13
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            r2 = r13
            int r2 = r2.remaining()
            long r2 = (long) r2
            r3 = r14
            long r3 = org.lwjgl.system.MemoryUtil.memAddressSafe(r3)
            r4 = r14
            int r4 = org.lwjgl.system.Checks.remainingSafe(r4)
            long r4 = (long) r4
            nshaderc_compile_options_add_macro_definition(r0, r1, r2, r3, r4)
            return
    }

    public static void shaderc_compile_options_add_macro_definition(@org.lwjgl.system.NativeType("shaderc_compile_options_t") long r11, @org.lwjgl.system.NativeType("char const *") java.lang.CharSequence r13, @org.lwjgl.system.NativeType("char const *") java.lang.CharSequence r14) {
            org.lwjgl.system.MemoryStack r0 = org.lwjgl.system.MemoryStack.stackGet()
            r15 = r0
            r0 = r15
            int r0 = r0.getPointer()
            r16 = r0
            r0 = r15
            r1 = r13
            r2 = 0
            int r0 = r0.nUTF8(r1, r2)     // Catch: java.lang.Throwable -> L4c
            r17 = r0
            r0 = r15
            long r0 = r0.getPointerAddress()     // Catch: java.lang.Throwable -> L4c
            r18 = r0
            r0 = r15
            r1 = r14
            r2 = 0
            int r0 = r0.nUTF8Safe(r1, r2)     // Catch: java.lang.Throwable -> L4c
            r20 = r0
            r0 = r14
            if (r0 != 0) goto L2d
            r0 = 0
            goto L32
        L2d:
            r0 = r15
            long r0 = r0.getPointerAddress()     // Catch: java.lang.Throwable -> L4c
        L32:
            r21 = r0
            r0 = r11
            r1 = r18
            r2 = r17
            long r2 = (long) r2     // Catch: java.lang.Throwable -> L4c
            r3 = r21
            r4 = r20
            long r4 = (long) r4     // Catch: java.lang.Throwable -> L4c
            nshaderc_compile_options_add_macro_definition(r0, r1, r2, r3, r4)     // Catch: java.lang.Throwable -> L4c
            r0 = r15
            r1 = r16
            r0.setPointer(r1)
            goto L58
        L4c:
            r23 = move-exception
            r0 = r15
            r1 = r16
            r0.setPointer(r1)
            r0 = r23
            throw r0
        L58:
            return
    }

    public static void shaderc_compile_options_set_source_language(@org.lwjgl.system.NativeType("shaderc_compile_options_t") long r6, @org.lwjgl.system.NativeType("shaderc_source_language") int r8) {
            long r0 = org.lwjgl.util.shaderc.Shaderc.Functions.compile_options_set_source_language
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

    public static void shaderc_compile_options_set_generate_debug_info(@org.lwjgl.system.NativeType("shaderc_compile_options_t") long r5) {
            long r0 = org.lwjgl.util.shaderc.Shaderc.Functions.compile_options_set_generate_debug_info
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

    public static void shaderc_compile_options_set_optimization_level(@org.lwjgl.system.NativeType("shaderc_compile_options_t") long r6, @org.lwjgl.system.NativeType("shaderc_optimization_level") int r8) {
            long r0 = org.lwjgl.util.shaderc.Shaderc.Functions.compile_options_set_optimization_level
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

    public static void shaderc_compile_options_set_forced_version_profile(@org.lwjgl.system.NativeType("shaderc_compile_options_t") long r7, int r9, @org.lwjgl.system.NativeType("shaderc_profile") int r10) {
            long r0 = org.lwjgl.util.shaderc.Shaderc.Functions.compile_options_set_forced_version_profile
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

    public static void nshaderc_compile_options_set_include_callbacks(long r11, long r13, long r15, long r17) {
            long r0 = org.lwjgl.util.shaderc.Shaderc.Functions.compile_options_set_include_callbacks
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
            org.lwjgl.system.JNI.invokePPPPV(r0, r1, r2, r3, r4)
            return
    }

    public static void shaderc_compile_options_set_include_callbacks(@org.lwjgl.system.NativeType("shaderc_compile_options_t") long r9, @org.lwjgl.system.NativeType("shaderc_include_resolve_fn") org.lwjgl.util.shaderc.ShadercIncludeResolveI r11, @org.lwjgl.system.NativeType("shaderc_include_result_release_fn") org.lwjgl.util.shaderc.ShadercIncludeResultReleaseI r12, @org.lwjgl.system.NativeType("void *") long r13) {
            r0 = r9
            r1 = r11
            long r1 = org.lwjgl.system.MemoryUtil.memAddressSafe(r1)
            r2 = r12
            long r2 = org.lwjgl.system.MemoryUtil.memAddressSafe(r2)
            r3 = r13
            nshaderc_compile_options_set_include_callbacks(r0, r1, r2, r3)
            return
    }

    public static void shaderc_compile_options_set_suppress_warnings(@org.lwjgl.system.NativeType("shaderc_compile_options_t") long r5) {
            long r0 = org.lwjgl.util.shaderc.Shaderc.Functions.compile_options_set_suppress_warnings
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

    public static void shaderc_compile_options_set_target_env(@org.lwjgl.system.NativeType("shaderc_compile_options_t") long r7, @org.lwjgl.system.NativeType("shaderc_target_env") int r9, @org.lwjgl.system.NativeType("uint32_t") int r10) {
            long r0 = org.lwjgl.util.shaderc.Shaderc.Functions.compile_options_set_target_env
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

    public static void shaderc_compile_options_set_target_spirv(@org.lwjgl.system.NativeType("shaderc_compile_options_t") long r6, @org.lwjgl.system.NativeType("shaderc_spirv_version") int r8) {
            long r0 = org.lwjgl.util.shaderc.Shaderc.Functions.compile_options_set_target_spirv
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

    public static void shaderc_compile_options_set_warnings_as_errors(@org.lwjgl.system.NativeType("shaderc_compile_options_t") long r5) {
            long r0 = org.lwjgl.util.shaderc.Shaderc.Functions.compile_options_set_warnings_as_errors
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

    public static void shaderc_compile_options_set_limit(@org.lwjgl.system.NativeType("shaderc_compile_options_t") long r7, @org.lwjgl.system.NativeType("shaderc_limit") int r9, int r10) {
            long r0 = org.lwjgl.util.shaderc.Shaderc.Functions.compile_options_set_limit
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

    public static void shaderc_compile_options_set_auto_bind_uniforms(@org.lwjgl.system.NativeType("shaderc_compile_options_t") long r6, @org.lwjgl.system.NativeType("bool") boolean r8) {
            long r0 = org.lwjgl.util.shaderc.Shaderc.Functions.compile_options_set_auto_bind_uniforms
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

    public static void shaderc_compile_options_set_auto_combined_image_sampler(@org.lwjgl.system.NativeType("shaderc_compile_options_t") long r6, @org.lwjgl.system.NativeType("bool") boolean r8) {
            long r0 = org.lwjgl.util.shaderc.Shaderc.Functions.compile_options_set_auto_combined_image_sampler
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

    public static void shaderc_compile_options_set_hlsl_io_mapping(@org.lwjgl.system.NativeType("shaderc_compile_options_t") long r6, @org.lwjgl.system.NativeType("bool") boolean r8) {
            long r0 = org.lwjgl.util.shaderc.Shaderc.Functions.compile_options_set_hlsl_io_mapping
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

    public static void shaderc_compile_options_set_hlsl_offsets(@org.lwjgl.system.NativeType("shaderc_compile_options_t") long r6, @org.lwjgl.system.NativeType("bool") boolean r8) {
            long r0 = org.lwjgl.util.shaderc.Shaderc.Functions.compile_options_set_hlsl_offsets
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

    public static void shaderc_compile_options_set_binding_base(@org.lwjgl.system.NativeType("shaderc_compile_options_t") long r7, @org.lwjgl.system.NativeType("shaderc_uniform_kind") int r9, @org.lwjgl.system.NativeType("uint32_t") int r10) {
            long r0 = org.lwjgl.util.shaderc.Shaderc.Functions.compile_options_set_binding_base
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

    public static void shaderc_compile_options_set_binding_base_for_stage(@org.lwjgl.system.NativeType("shaderc_compile_options_t") long r8, @org.lwjgl.system.NativeType("shaderc_shader_kind") int r10, @org.lwjgl.system.NativeType("shaderc_uniform_kind") int r11, @org.lwjgl.system.NativeType("uint32_t") int r12) {
            long r0 = org.lwjgl.util.shaderc.Shaderc.Functions.compile_options_set_binding_base_for_stage
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

    public static void shaderc_compile_options_set_preserve_bindings(@org.lwjgl.system.NativeType("shaderc_compile_options_t") long r6, @org.lwjgl.system.NativeType("bool") boolean r8) {
            long r0 = org.lwjgl.util.shaderc.Shaderc.Functions.compile_options_set_preserve_bindings
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

    public static void shaderc_compile_options_set_max_id_bound(@org.lwjgl.system.NativeType("shaderc_compile_options_t") long r6, @org.lwjgl.system.NativeType("uint32_t") int r8) {
            long r0 = org.lwjgl.util.shaderc.Shaderc.Functions.compile_options_set_max_id_bound
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

    public static void shaderc_compile_options_set_auto_map_locations(@org.lwjgl.system.NativeType("shaderc_compile_options_t") long r6, @org.lwjgl.system.NativeType("bool") boolean r8) {
            long r0 = org.lwjgl.util.shaderc.Shaderc.Functions.compile_options_set_auto_map_locations
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

    public static void nshaderc_compile_options_set_hlsl_register_set_and_binding_for_stage(long r12, int r14, long r15, long r17, long r19) {
            long r0 = org.lwjgl.util.shaderc.Shaderc.Functions.compile_options_set_hlsl_register_set_and_binding_for_stage
            r21 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L10
            r0 = r12
            long r0 = org.lwjgl.system.Checks.check(r0)
        L10:
            r0 = r12
            r1 = r14
            r2 = r15
            r3 = r17
            r4 = r19
            r5 = r21
            org.lwjgl.system.JNI.invokePPPPV(r0, r1, r2, r3, r4, r5)
            return
    }

    public static void shaderc_compile_options_set_hlsl_register_set_and_binding_for_stage(@org.lwjgl.system.NativeType("shaderc_compile_options_t") long r10, @org.lwjgl.system.NativeType("shaderc_shader_kind") int r12, @org.lwjgl.system.NativeType("char const *") java.nio.ByteBuffer r13, @org.lwjgl.system.NativeType("char const *") java.nio.ByteBuffer r14, @org.lwjgl.system.NativeType("char const *") java.nio.ByteBuffer r15) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L14
            r0 = r13
            org.lwjgl.system.Checks.checkNT1(r0)
            r0 = r14
            org.lwjgl.system.Checks.checkNT1(r0)
            r0 = r15
            org.lwjgl.system.Checks.checkNT1(r0)
        L14:
            r0 = r10
            r1 = r12
            r2 = r13
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            r3 = r14
            long r3 = org.lwjgl.system.MemoryUtil.memAddress(r3)
            r4 = r15
            long r4 = org.lwjgl.system.MemoryUtil.memAddress(r4)
            nshaderc_compile_options_set_hlsl_register_set_and_binding_for_stage(r0, r1, r2, r3, r4)
            return
    }

    public static void shaderc_compile_options_set_hlsl_register_set_and_binding_for_stage(@org.lwjgl.system.NativeType("shaderc_compile_options_t") long r10, @org.lwjgl.system.NativeType("shaderc_shader_kind") int r12, @org.lwjgl.system.NativeType("char const *") java.lang.CharSequence r13, @org.lwjgl.system.NativeType("char const *") java.lang.CharSequence r14, @org.lwjgl.system.NativeType("char const *") java.lang.CharSequence r15) {
            org.lwjgl.system.MemoryStack r0 = org.lwjgl.system.MemoryStack.stackGet()
            r16 = r0
            r0 = r16
            int r0 = r0.getPointer()
            r17 = r0
            r0 = r16
            r1 = r13
            r2 = 1
            int r0 = r0.nUTF8(r1, r2)     // Catch: java.lang.Throwable -> L50
            r0 = r16
            long r0 = r0.getPointerAddress()     // Catch: java.lang.Throwable -> L50
            r18 = r0
            r0 = r16
            r1 = r14
            r2 = 1
            int r0 = r0.nUTF8(r1, r2)     // Catch: java.lang.Throwable -> L50
            r0 = r16
            long r0 = r0.getPointerAddress()     // Catch: java.lang.Throwable -> L50
            r20 = r0
            r0 = r16
            r1 = r15
            r2 = 1
            int r0 = r0.nUTF8(r1, r2)     // Catch: java.lang.Throwable -> L50
            r0 = r16
            long r0 = r0.getPointerAddress()     // Catch: java.lang.Throwable -> L50
            r22 = r0
            r0 = r10
            r1 = r12
            r2 = r18
            r3 = r20
            r4 = r22
            nshaderc_compile_options_set_hlsl_register_set_and_binding_for_stage(r0, r1, r2, r3, r4)     // Catch: java.lang.Throwable -> L50
            r0 = r16
            r1 = r17
            r0.setPointer(r1)
            goto L5c
        L50:
            r24 = move-exception
            r0 = r16
            r1 = r17
            r0.setPointer(r1)
            r0 = r24
            throw r0
        L5c:
            return
    }

    public static void nshaderc_compile_options_set_hlsl_register_set_and_binding(long r11, long r13, long r15, long r17) {
            long r0 = org.lwjgl.util.shaderc.Shaderc.Functions.compile_options_set_hlsl_register_set_and_binding
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
            org.lwjgl.system.JNI.invokePPPPV(r0, r1, r2, r3, r4)
            return
    }

    public static void shaderc_compile_options_set_hlsl_register_set_and_binding(@org.lwjgl.system.NativeType("shaderc_compile_options_t") long r9, @org.lwjgl.system.NativeType("char const *") java.nio.ByteBuffer r11, @org.lwjgl.system.NativeType("char const *") java.nio.ByteBuffer r12, @org.lwjgl.system.NativeType("char const *") java.nio.ByteBuffer r13) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L13
            r0 = r11
            org.lwjgl.system.Checks.checkNT1(r0)
            r0 = r12
            org.lwjgl.system.Checks.checkNT1(r0)
            r0 = r13
            org.lwjgl.system.Checks.checkNT1(r0)
        L13:
            r0 = r9
            r1 = r11
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            r2 = r12
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            r3 = r13
            long r3 = org.lwjgl.system.MemoryUtil.memAddress(r3)
            nshaderc_compile_options_set_hlsl_register_set_and_binding(r0, r1, r2, r3)
            return
    }

    public static void shaderc_compile_options_set_hlsl_register_set_and_binding(@org.lwjgl.system.NativeType("shaderc_compile_options_t") long r9, @org.lwjgl.system.NativeType("char const *") java.lang.CharSequence r11, @org.lwjgl.system.NativeType("char const *") java.lang.CharSequence r12, @org.lwjgl.system.NativeType("char const *") java.lang.CharSequence r13) {
            org.lwjgl.system.MemoryStack r0 = org.lwjgl.system.MemoryStack.stackGet()
            r14 = r0
            r0 = r14
            int r0 = r0.getPointer()
            r15 = r0
            r0 = r14
            r1 = r11
            r2 = 1
            int r0 = r0.nUTF8(r1, r2)     // Catch: java.lang.Throwable -> L4e
            r0 = r14
            long r0 = r0.getPointerAddress()     // Catch: java.lang.Throwable -> L4e
            r16 = r0
            r0 = r14
            r1 = r12
            r2 = 1
            int r0 = r0.nUTF8(r1, r2)     // Catch: java.lang.Throwable -> L4e
            r0 = r14
            long r0 = r0.getPointerAddress()     // Catch: java.lang.Throwable -> L4e
            r18 = r0
            r0 = r14
            r1 = r13
            r2 = 1
            int r0 = r0.nUTF8(r1, r2)     // Catch: java.lang.Throwable -> L4e
            r0 = r14
            long r0 = r0.getPointerAddress()     // Catch: java.lang.Throwable -> L4e
            r20 = r0
            r0 = r9
            r1 = r16
            r2 = r18
            r3 = r20
            nshaderc_compile_options_set_hlsl_register_set_and_binding(r0, r1, r2, r3)     // Catch: java.lang.Throwable -> L4e
            r0 = r14
            r1 = r15
            r0.setPointer(r1)
            goto L5a
        L4e:
            r22 = move-exception
            r0 = r14
            r1 = r15
            r0.setPointer(r1)
            r0 = r22
            throw r0
        L5a:
            return
    }

    public static void shaderc_compile_options_set_hlsl_functionality1(@org.lwjgl.system.NativeType("shaderc_compile_options_t") long r6, @org.lwjgl.system.NativeType("bool") boolean r8) {
            long r0 = org.lwjgl.util.shaderc.Shaderc.Functions.compile_options_set_hlsl_functionality1
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

    public static void shaderc_compile_options_set_hlsl_16bit_types(@org.lwjgl.system.NativeType("shaderc_compile_options_t") long r6, @org.lwjgl.system.NativeType("bool") boolean r8) {
            long r0 = org.lwjgl.util.shaderc.Shaderc.Functions.compile_options_set_hlsl_16bit_types
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

    public static void shaderc_compile_options_set_vulkan_rules_relaxed(@org.lwjgl.system.NativeType("shaderc_compile_options_t") long r6, @org.lwjgl.system.NativeType("bool") boolean r8) {
            long r0 = org.lwjgl.util.shaderc.Shaderc.Functions.compile_options_set_vulkan_rules_relaxed
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

    public static void shaderc_compile_options_set_invert_y(@org.lwjgl.system.NativeType("shaderc_compile_options_t") long r6, @org.lwjgl.system.NativeType("bool") boolean r8) {
            long r0 = org.lwjgl.util.shaderc.Shaderc.Functions.compile_options_set_invert_y
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

    public static void shaderc_compile_options_set_nan_clamp(@org.lwjgl.system.NativeType("shaderc_compile_options_t") long r6, @org.lwjgl.system.NativeType("bool") boolean r8) {
            long r0 = org.lwjgl.util.shaderc.Shaderc.Functions.compile_options_set_nan_clamp
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

    public static long nshaderc_compile_into_spv(long r16, long r18, long r20, int r22, long r23, long r25, long r27) {
            long r0 = org.lwjgl.util.shaderc.Shaderc.Functions.compile_into_spv
            r29 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L10
            r0 = r16
            long r0 = org.lwjgl.system.Checks.check(r0)
        L10:
            r0 = r16
            r1 = r18
            r2 = r20
            r3 = r22
            r4 = r23
            r5 = r25
            r6 = r27
            r7 = r29
            long r0 = org.lwjgl.system.JNI.invokePPPPPPP(r0, r1, r2, r3, r4, r5, r6, r7)
            return r0
    }

    @org.lwjgl.system.NativeType("shaderc_compilation_result_t")
    public static long shaderc_compile_into_spv(@org.lwjgl.system.NativeType("shaderc_compiler_t const") long r14, @org.lwjgl.system.NativeType("char const *") java.nio.ByteBuffer r16, @org.lwjgl.system.NativeType("shaderc_shader_kind") int r17, @org.lwjgl.system.NativeType("char const *") java.nio.ByteBuffer r18, @org.lwjgl.system.NativeType("char const *") java.nio.ByteBuffer r19, @org.lwjgl.system.NativeType("shaderc_compile_options_t const") long r20) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L10
            r0 = r18
            org.lwjgl.system.Checks.checkNT1(r0)
            r0 = r19
            org.lwjgl.system.Checks.checkNT1(r0)
        L10:
            r0 = r14
            r1 = r16
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            r2 = r16
            int r2 = r2.remaining()
            long r2 = (long) r2
            r3 = r17
            r4 = r18
            long r4 = org.lwjgl.system.MemoryUtil.memAddress(r4)
            r5 = r19
            long r5 = org.lwjgl.system.MemoryUtil.memAddress(r5)
            r6 = r20
            long r0 = nshaderc_compile_into_spv(r0, r1, r2, r3, r4, r5, r6)
            return r0
    }

    @org.lwjgl.system.NativeType("shaderc_compilation_result_t")
    public static long shaderc_compile_into_spv(@org.lwjgl.system.NativeType("shaderc_compiler_t const") long r14, @org.lwjgl.system.NativeType("char const *") java.lang.CharSequence r16, @org.lwjgl.system.NativeType("shaderc_shader_kind") int r17, @org.lwjgl.system.NativeType("char const *") java.lang.CharSequence r18, @org.lwjgl.system.NativeType("char const *") java.lang.CharSequence r19, @org.lwjgl.system.NativeType("shaderc_compile_options_t const") long r20) {
            org.lwjgl.system.MemoryStack r0 = org.lwjgl.system.MemoryStack.stackGet()
            r22 = r0
            r0 = r22
            int r0 = r0.getPointer()
            r23 = r0
            r0 = r22
            r1 = r16
            r2 = 0
            int r0 = r0.nUTF8(r1, r2)     // Catch: java.lang.Throwable -> L58
            r24 = r0
            r0 = r22
            long r0 = r0.getPointerAddress()     // Catch: java.lang.Throwable -> L58
            r25 = r0
            r0 = r22
            r1 = r18
            r2 = 1
            int r0 = r0.nUTF8(r1, r2)     // Catch: java.lang.Throwable -> L58
            r0 = r22
            long r0 = r0.getPointerAddress()     // Catch: java.lang.Throwable -> L58
            r27 = r0
            r0 = r22
            r1 = r19
            r2 = 1
            int r0 = r0.nUTF8(r1, r2)     // Catch: java.lang.Throwable -> L58
            r0 = r22
            long r0 = r0.getPointerAddress()     // Catch: java.lang.Throwable -> L58
            r29 = r0
            r0 = r14
            r1 = r25
            r2 = r24
            long r2 = (long) r2     // Catch: java.lang.Throwable -> L58
            r3 = r17
            r4 = r27
            r5 = r29
            r6 = r20
            long r0 = nshaderc_compile_into_spv(r0, r1, r2, r3, r4, r5, r6)     // Catch: java.lang.Throwable -> L58
            r31 = r0
            r0 = r22
            r1 = r23
            r0.setPointer(r1)
            r0 = r31
            return r0
        L58:
            r33 = move-exception
            r0 = r22
            r1 = r23
            r0.setPointer(r1)
            r0 = r33
            throw r0
    }

    public static long nshaderc_compile_into_spv_assembly(long r16, long r18, long r20, int r22, long r23, long r25, long r27) {
            long r0 = org.lwjgl.util.shaderc.Shaderc.Functions.compile_into_spv_assembly
            r29 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L10
            r0 = r16
            long r0 = org.lwjgl.system.Checks.check(r0)
        L10:
            r0 = r16
            r1 = r18
            r2 = r20
            r3 = r22
            r4 = r23
            r5 = r25
            r6 = r27
            r7 = r29
            long r0 = org.lwjgl.system.JNI.invokePPPPPPP(r0, r1, r2, r3, r4, r5, r6, r7)
            return r0
    }

    @org.lwjgl.system.NativeType("shaderc_compilation_result_t")
    public static long shaderc_compile_into_spv_assembly(@org.lwjgl.system.NativeType("shaderc_compiler_t const") long r14, @org.lwjgl.system.NativeType("char const *") java.nio.ByteBuffer r16, @org.lwjgl.system.NativeType("shaderc_shader_kind") int r17, @org.lwjgl.system.NativeType("char const *") java.nio.ByteBuffer r18, @org.lwjgl.system.NativeType("char const *") java.nio.ByteBuffer r19, @org.lwjgl.system.NativeType("shaderc_compile_options_t const") long r20) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L10
            r0 = r18
            org.lwjgl.system.Checks.checkNT1(r0)
            r0 = r19
            org.lwjgl.system.Checks.checkNT1(r0)
        L10:
            r0 = r14
            r1 = r16
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            r2 = r16
            int r2 = r2.remaining()
            long r2 = (long) r2
            r3 = r17
            r4 = r18
            long r4 = org.lwjgl.system.MemoryUtil.memAddress(r4)
            r5 = r19
            long r5 = org.lwjgl.system.MemoryUtil.memAddress(r5)
            r6 = r20
            long r0 = nshaderc_compile_into_spv_assembly(r0, r1, r2, r3, r4, r5, r6)
            return r0
    }

    @org.lwjgl.system.NativeType("shaderc_compilation_result_t")
    public static long shaderc_compile_into_spv_assembly(@org.lwjgl.system.NativeType("shaderc_compiler_t const") long r14, @org.lwjgl.system.NativeType("char const *") java.lang.CharSequence r16, @org.lwjgl.system.NativeType("shaderc_shader_kind") int r17, @org.lwjgl.system.NativeType("char const *") java.lang.CharSequence r18, @org.lwjgl.system.NativeType("char const *") java.lang.CharSequence r19, @org.lwjgl.system.NativeType("shaderc_compile_options_t const") long r20) {
            org.lwjgl.system.MemoryStack r0 = org.lwjgl.system.MemoryStack.stackGet()
            r22 = r0
            r0 = r22
            int r0 = r0.getPointer()
            r23 = r0
            r0 = r22
            r1 = r16
            r2 = 0
            int r0 = r0.nUTF8(r1, r2)     // Catch: java.lang.Throwable -> L58
            r24 = r0
            r0 = r22
            long r0 = r0.getPointerAddress()     // Catch: java.lang.Throwable -> L58
            r25 = r0
            r0 = r22
            r1 = r18
            r2 = 1
            int r0 = r0.nUTF8(r1, r2)     // Catch: java.lang.Throwable -> L58
            r0 = r22
            long r0 = r0.getPointerAddress()     // Catch: java.lang.Throwable -> L58
            r27 = r0
            r0 = r22
            r1 = r19
            r2 = 1
            int r0 = r0.nUTF8(r1, r2)     // Catch: java.lang.Throwable -> L58
            r0 = r22
            long r0 = r0.getPointerAddress()     // Catch: java.lang.Throwable -> L58
            r29 = r0
            r0 = r14
            r1 = r25
            r2 = r24
            long r2 = (long) r2     // Catch: java.lang.Throwable -> L58
            r3 = r17
            r4 = r27
            r5 = r29
            r6 = r20
            long r0 = nshaderc_compile_into_spv_assembly(r0, r1, r2, r3, r4, r5, r6)     // Catch: java.lang.Throwable -> L58
            r31 = r0
            r0 = r22
            r1 = r23
            r0.setPointer(r1)
            r0 = r31
            return r0
        L58:
            r33 = move-exception
            r0 = r22
            r1 = r23
            r0.setPointer(r1)
            r0 = r33
            throw r0
    }

    public static long nshaderc_compile_into_preprocessed_text(long r16, long r18, long r20, int r22, long r23, long r25, long r27) {
            long r0 = org.lwjgl.util.shaderc.Shaderc.Functions.compile_into_preprocessed_text
            r29 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L10
            r0 = r16
            long r0 = org.lwjgl.system.Checks.check(r0)
        L10:
            r0 = r16
            r1 = r18
            r2 = r20
            r3 = r22
            r4 = r23
            r5 = r25
            r6 = r27
            r7 = r29
            long r0 = org.lwjgl.system.JNI.invokePPPPPPP(r0, r1, r2, r3, r4, r5, r6, r7)
            return r0
    }

    @org.lwjgl.system.NativeType("shaderc_compilation_result_t")
    public static long shaderc_compile_into_preprocessed_text(@org.lwjgl.system.NativeType("shaderc_compiler_t const") long r14, @org.lwjgl.system.NativeType("char const *") java.nio.ByteBuffer r16, @org.lwjgl.system.NativeType("shaderc_shader_kind") int r17, @org.lwjgl.system.NativeType("char const *") java.nio.ByteBuffer r18, @org.lwjgl.system.NativeType("char const *") java.nio.ByteBuffer r19, @org.lwjgl.system.NativeType("shaderc_compile_options_t const") long r20) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L10
            r0 = r18
            org.lwjgl.system.Checks.checkNT1(r0)
            r0 = r19
            org.lwjgl.system.Checks.checkNT1(r0)
        L10:
            r0 = r14
            r1 = r16
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            r2 = r16
            int r2 = r2.remaining()
            long r2 = (long) r2
            r3 = r17
            r4 = r18
            long r4 = org.lwjgl.system.MemoryUtil.memAddress(r4)
            r5 = r19
            long r5 = org.lwjgl.system.MemoryUtil.memAddress(r5)
            r6 = r20
            long r0 = nshaderc_compile_into_preprocessed_text(r0, r1, r2, r3, r4, r5, r6)
            return r0
    }

    @org.lwjgl.system.NativeType("shaderc_compilation_result_t")
    public static long shaderc_compile_into_preprocessed_text(@org.lwjgl.system.NativeType("shaderc_compiler_t const") long r14, @org.lwjgl.system.NativeType("char const *") java.lang.CharSequence r16, @org.lwjgl.system.NativeType("shaderc_shader_kind") int r17, @org.lwjgl.system.NativeType("char const *") java.lang.CharSequence r18, @org.lwjgl.system.NativeType("char const *") java.lang.CharSequence r19, @org.lwjgl.system.NativeType("shaderc_compile_options_t const") long r20) {
            org.lwjgl.system.MemoryStack r0 = org.lwjgl.system.MemoryStack.stackGet()
            r22 = r0
            r0 = r22
            int r0 = r0.getPointer()
            r23 = r0
            r0 = r22
            r1 = r16
            r2 = 0
            int r0 = r0.nUTF8(r1, r2)     // Catch: java.lang.Throwable -> L58
            r24 = r0
            r0 = r22
            long r0 = r0.getPointerAddress()     // Catch: java.lang.Throwable -> L58
            r25 = r0
            r0 = r22
            r1 = r18
            r2 = 1
            int r0 = r0.nUTF8(r1, r2)     // Catch: java.lang.Throwable -> L58
            r0 = r22
            long r0 = r0.getPointerAddress()     // Catch: java.lang.Throwable -> L58
            r27 = r0
            r0 = r22
            r1 = r19
            r2 = 1
            int r0 = r0.nUTF8(r1, r2)     // Catch: java.lang.Throwable -> L58
            r0 = r22
            long r0 = r0.getPointerAddress()     // Catch: java.lang.Throwable -> L58
            r29 = r0
            r0 = r14
            r1 = r25
            r2 = r24
            long r2 = (long) r2     // Catch: java.lang.Throwable -> L58
            r3 = r17
            r4 = r27
            r5 = r29
            r6 = r20
            long r0 = nshaderc_compile_into_preprocessed_text(r0, r1, r2, r3, r4, r5, r6)     // Catch: java.lang.Throwable -> L58
            r31 = r0
            r0 = r22
            r1 = r23
            r0.setPointer(r1)
            r0 = r31
            return r0
        L58:
            r33 = move-exception
            r0 = r22
            r1 = r23
            r0.setPointer(r1)
            r0 = r33
            throw r0
    }

    public static long nshaderc_assemble_into_spv(long r11, long r13, long r15, long r17) {
            long r0 = org.lwjgl.util.shaderc.Shaderc.Functions.assemble_into_spv
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
            long r0 = org.lwjgl.system.JNI.invokePPPPP(r0, r1, r2, r3, r4)
            return r0
    }

    @org.lwjgl.system.NativeType("shaderc_compilation_result_t")
    public static long shaderc_assemble_into_spv(@org.lwjgl.system.NativeType("shaderc_compiler_t const") long r9, @org.lwjgl.system.NativeType("char const *") java.nio.ByteBuffer r11, @org.lwjgl.system.NativeType("shaderc_compile_options_t const") long r12) {
            r0 = r9
            r1 = r11
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            r2 = r11
            int r2 = r2.remaining()
            long r2 = (long) r2
            r3 = r12
            long r0 = nshaderc_assemble_into_spv(r0, r1, r2, r3)
            return r0
    }

    @org.lwjgl.system.NativeType("shaderc_compilation_result_t")
    public static long shaderc_assemble_into_spv(@org.lwjgl.system.NativeType("shaderc_compiler_t const") long r9, @org.lwjgl.system.NativeType("char const *") java.lang.CharSequence r11, @org.lwjgl.system.NativeType("shaderc_compile_options_t const") long r12) {
            org.lwjgl.system.MemoryStack r0 = org.lwjgl.system.MemoryStack.stackGet()
            r14 = r0
            r0 = r14
            int r0 = r0.getPointer()
            r15 = r0
            r0 = r14
            r1 = r11
            r2 = 0
            int r0 = r0.nUTF8(r1, r2)     // Catch: java.lang.Throwable -> L32
            r16 = r0
            r0 = r14
            long r0 = r0.getPointerAddress()     // Catch: java.lang.Throwable -> L32
            r17 = r0
            r0 = r9
            r1 = r17
            r2 = r16
            long r2 = (long) r2     // Catch: java.lang.Throwable -> L32
            r3 = r12
            long r0 = nshaderc_assemble_into_spv(r0, r1, r2, r3)     // Catch: java.lang.Throwable -> L32
            r19 = r0
            r0 = r14
            r1 = r15
            r0.setPointer(r1)
            r0 = r19
            return r0
        L32:
            r21 = move-exception
            r0 = r14
            r1 = r15
            r0.setPointer(r1)
            r0 = r21
            throw r0
    }

    public static void shaderc_result_release(@org.lwjgl.system.NativeType("shaderc_compilation_result_t") long r5) {
            long r0 = org.lwjgl.util.shaderc.Shaderc.Functions.result_release
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

    @org.lwjgl.system.NativeType("size_t")
    public static long shaderc_result_get_length(@org.lwjgl.system.NativeType("shaderc_compilation_result_t const") long r5) {
            long r0 = org.lwjgl.util.shaderc.Shaderc.Functions.result_get_length
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

    @org.lwjgl.system.NativeType("size_t")
    public static long shaderc_result_get_num_warnings(@org.lwjgl.system.NativeType("shaderc_compilation_result_t const") long r5) {
            long r0 = org.lwjgl.util.shaderc.Shaderc.Functions.result_get_num_warnings
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

    @org.lwjgl.system.NativeType("size_t")
    public static long shaderc_result_get_num_errors(@org.lwjgl.system.NativeType("shaderc_compilation_result_t const") long r5) {
            long r0 = org.lwjgl.util.shaderc.Shaderc.Functions.result_get_num_errors
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

    @org.lwjgl.system.NativeType("shaderc_compilation_status")
    public static int shaderc_result_get_compilation_status(@org.lwjgl.system.NativeType("shaderc_compilation_result_t const") long r5) {
            long r0 = org.lwjgl.util.shaderc.Shaderc.Functions.result_get_compilation_status
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

    public static long nshaderc_result_get_bytes(long r5) {
            long r0 = org.lwjgl.util.shaderc.Shaderc.Functions.result_get_bytes
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
    public static java.nio.ByteBuffer shaderc_result_get_bytes(@org.lwjgl.system.NativeType("shaderc_compilation_result_t const") long r5) {
            r0 = r5
            long r0 = nshaderc_result_get_bytes(r0)
            r7 = r0
            r0 = r7
            r1 = r5
            long r1 = shaderc_result_get_length(r1)
            int r1 = (int) r1
            java.nio.ByteBuffer r0 = org.lwjgl.system.MemoryUtil.memByteBufferSafe(r0, r1)
            return r0
    }

    @org.lwjgl.system.NativeType("char const *")
    public static java.nio.ByteBuffer shaderc_result_get_bytes(@org.lwjgl.system.NativeType("shaderc_compilation_result_t const") long r5, long r7) {
            r0 = r5
            long r0 = nshaderc_result_get_bytes(r0)
            r9 = r0
            r0 = r9
            r1 = r7
            int r1 = (int) r1
            java.nio.ByteBuffer r0 = org.lwjgl.system.MemoryUtil.memByteBufferSafe(r0, r1)
            return r0
    }

    public static long nshaderc_result_get_error_message(long r5) {
            long r0 = org.lwjgl.util.shaderc.Shaderc.Functions.result_get_error_message
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
    public static java.lang.String shaderc_result_get_error_message(@org.lwjgl.system.NativeType("shaderc_compilation_result_t const") long r3) {
            r0 = r3
            long r0 = nshaderc_result_get_error_message(r0)
            r5 = r0
            r0 = r5
            java.lang.String r0 = org.lwjgl.system.MemoryUtil.memUTF8Safe(r0)
            return r0
    }

    public static void nshaderc_get_spv_version(long r7, long r9) {
            long r0 = org.lwjgl.util.shaderc.Shaderc.Functions.get_spv_version
            r11 = r0
            r0 = r7
            r1 = r9
            r2 = r11
            org.lwjgl.system.JNI.invokePPV(r0, r1, r2)
            return
    }

    public static void shaderc_get_spv_version(@org.lwjgl.system.NativeType("unsigned int *") java.nio.IntBuffer r5, @org.lwjgl.system.NativeType("unsigned int *") java.nio.IntBuffer r6) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L10
            r0 = r5
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
            r0 = r6
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
        L10:
            r0 = r5
            long r0 = org.lwjgl.system.MemoryUtil.memAddress(r0)
            r1 = r6
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            nshaderc_get_spv_version(r0, r1)
            return
    }

    public static boolean nshaderc_parse_version_profile(long r9, long r11, long r13) {
            long r0 = org.lwjgl.util.shaderc.Shaderc.Functions.parse_version_profile
            r15 = r0
            r0 = r9
            r1 = r11
            r2 = r13
            r3 = r15
            boolean r0 = org.lwjgl.system.JNI.invokePPPZ(r0, r1, r2, r3)
            return r0
    }

    @org.lwjgl.system.NativeType("bool")
    public static boolean shaderc_parse_version_profile(@org.lwjgl.system.NativeType("char const *") java.nio.ByteBuffer r7, @org.lwjgl.system.NativeType("int *") java.nio.IntBuffer r8, @org.lwjgl.system.NativeType("shaderc_profile *") java.nio.IntBuffer r9) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L14
            r0 = r7
            org.lwjgl.system.Checks.checkNT1(r0)
            r0 = r8
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
            r0 = r9
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
        L14:
            r0 = r7
            long r0 = org.lwjgl.system.MemoryUtil.memAddress(r0)
            r1 = r8
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            r2 = r9
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            boolean r0 = nshaderc_parse_version_profile(r0, r1, r2)
            return r0
    }

    @org.lwjgl.system.NativeType("bool")
    public static boolean shaderc_parse_version_profile(@org.lwjgl.system.NativeType("char const *") java.lang.CharSequence r7, @org.lwjgl.system.NativeType("int *") java.nio.IntBuffer r8, @org.lwjgl.system.NativeType("shaderc_profile *") java.nio.IntBuffer r9) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L10
            r0 = r8
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
            r0 = r9
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
        L10:
            org.lwjgl.system.MemoryStack r0 = org.lwjgl.system.MemoryStack.stackGet()
            r10 = r0
            r0 = r10
            int r0 = r0.getPointer()
            r11 = r0
            r0 = r10
            r1 = r7
            r2 = 1
            int r0 = r0.nUTF8(r1, r2)     // Catch: java.lang.Throwable -> L3f
            r0 = r10
            long r0 = r0.getPointerAddress()     // Catch: java.lang.Throwable -> L3f
            r12 = r0
            r0 = r12
            r1 = r8
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)     // Catch: java.lang.Throwable -> L3f
            r2 = r9
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)     // Catch: java.lang.Throwable -> L3f
            boolean r0 = nshaderc_parse_version_profile(r0, r1, r2)     // Catch: java.lang.Throwable -> L3f
            r14 = r0
            r0 = r10
            r1 = r11
            r0.setPointer(r1)
            r0 = r14
            return r0
        L3f:
            r15 = move-exception
            r0 = r10
            r1 = r11
            r0.setPointer(r1)
            r0 = r15
            throw r0
    }

    static /* synthetic */ org.lwjgl.system.SharedLibrary access$000() {
            org.lwjgl.system.SharedLibrary r0 = org.lwjgl.util.shaderc.Shaderc.SHADERC
            return r0
    }

    static {
            java.lang.Class<org.lwjgl.util.shaderc.Shaderc> r0 = org.lwjgl.util.shaderc.Shaderc.class
            java.lang.String r1 = "org.lwjgl.shaderc"
            org.lwjgl.system.Configuration<java.lang.String> r2 = org.lwjgl.system.Configuration.SHADERC_LIBRARY_NAME
            java.lang.String r3 = "shaderc"
            java.lang.String r3 = org.lwjgl.system.Platform.mapLibraryNameBundled(r3)
            java.lang.Object r2 = r2.get(r3)
            java.lang.String r2 = (java.lang.String) r2
            r3 = 1
            org.lwjgl.system.SharedLibrary r0 = org.lwjgl.system.Library.loadNative(r0, r1, r2, r3)
            org.lwjgl.util.shaderc.Shaderc.SHADERC = r0
            return
    }
}
