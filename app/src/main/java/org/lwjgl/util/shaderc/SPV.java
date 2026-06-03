package org.lwjgl.util.shaderc;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/util/shaderc/SPV.class */
public class SPV {
    private static final org.lwjgl.system.SharedLibrary SHADERC = null;
    public static final int SPV_SUCCESS = 0;
    public static final int SPV_UNSUPPORTED = 1;
    public static final int SPV_END_OF_STREAM = 2;
    public static final int SPV_WARNING = 3;
    public static final int SPV_FAILED_MATCH = 4;
    public static final int SPV_REQUESTED_TERMINATION = 5;
    public static final int SPV_ERROR_INTERNAL = -1;
    public static final int SPV_ERROR_OUT_OF_MEMORY = -2;
    public static final int SPV_ERROR_INVALID_POINTER = -3;
    public static final int SPV_ERROR_INVALID_BINARY = -4;
    public static final int SPV_ERROR_INVALID_TEXT = -5;
    public static final int SPV_ERROR_INVALID_TABLE = -6;
    public static final int SPV_ERROR_INVALID_VALUE = -7;
    public static final int SPV_ERROR_INVALID_DIAGNOSTIC = -8;
    public static final int SPV_ERROR_INVALID_LOOKUP = -9;
    public static final int SPV_ERROR_INVALID_ID = -10;
    public static final int SPV_ERROR_INVALID_CFG = -11;
    public static final int SPV_ERROR_INVALID_LAYOUT = -12;
    public static final int SPV_ERROR_INVALID_CAPABILITY = -13;
    public static final int SPV_ERROR_INVALID_DATA = -14;
    public static final int SPV_ERROR_MISSING_EXTENSION = -15;
    public static final int SPV_ERROR_WRONG_VERSION = -16;
    public static final int SPV_ERROR_FNVAR = -17;
    public static final int SPV_MSG_FATAL = 0;
    public static final int SPV_MSG_INTERNAL_ERROR = 1;
    public static final int SPV_MSG_ERROR = 2;
    public static final int SPV_MSG_WARNING = 3;
    public static final int SPV_MSG_INFO = 4;
    public static final int SPV_MSG_DEBUG = 5;
    public static final int SPV_ENDIANNESS_LITTLE = 0;
    public static final int SPV_ENDIANNESS_BIG = 1;
    public static final int SPV_OPERAND_TYPE_NONE = 0;
    public static final int SPV_OPERAND_TYPE_ID = 1;
    public static final int SPV_OPERAND_TYPE_TYPE_ID = 2;
    public static final int SPV_OPERAND_TYPE_RESULT_ID = 3;
    public static final int SPV_OPERAND_TYPE_MEMORY_SEMANTICS_ID = 4;
    public static final int SPV_OPERAND_TYPE_SCOPE_ID = 5;
    public static final int SPV_OPERAND_TYPE_LITERAL_INTEGER = 6;
    public static final int SPV_OPERAND_TYPE_EXTENSION_INSTRUCTION_NUMBER = 7;
    public static final int SPV_OPERAND_TYPE_SPEC_CONSTANT_OP_NUMBER = 8;
    public static final int SPV_OPERAND_TYPE_TYPED_LITERAL_NUMBER = 9;
    public static final int SPV_OPERAND_TYPE_LITERAL_FLOAT = 10;
    public static final int SPV_OPERAND_TYPE_LITERAL_STRING = 11;
    public static final int SPV_OPERAND_TYPE_SOURCE_LANGUAGE = 12;
    public static final int SPV_OPERAND_TYPE_EXECUTION_MODEL = 13;
    public static final int SPV_OPERAND_TYPE_ADDRESSING_MODEL = 14;
    public static final int SPV_OPERAND_TYPE_MEMORY_MODEL = 15;
    public static final int SPV_OPERAND_TYPE_EXECUTION_MODE = 16;
    public static final int SPV_OPERAND_TYPE_STORAGE_CLASS = 17;
    public static final int SPV_OPERAND_TYPE_DIMENSIONALITY = 18;
    public static final int SPV_OPERAND_TYPE_SAMPLER_ADDRESSING_MODE = 19;
    public static final int SPV_OPERAND_TYPE_SAMPLER_FILTER_MODE = 20;
    public static final int SPV_OPERAND_TYPE_SAMPLER_IMAGE_FORMAT = 21;
    public static final int SPV_OPERAND_TYPE_IMAGE_CHANNEL_ORDER = 22;
    public static final int SPV_OPERAND_TYPE_IMAGE_CHANNEL_DATA_TYPE = 23;
    public static final int SPV_OPERAND_TYPE_FP_ROUNDING_MODE = 24;
    public static final int SPV_OPERAND_TYPE_LINKAGE_TYPE = 25;
    public static final int SPV_OPERAND_TYPE_ACCESS_QUALIFIER = 26;
    public static final int SPV_OPERAND_TYPE_FUNCTION_PARAMETER_ATTRIBUTE = 27;
    public static final int SPV_OPERAND_TYPE_DECORATION = 28;
    public static final int SPV_OPERAND_TYPE_BUILT_IN = 29;
    public static final int SPV_OPERAND_TYPE_GROUP_OPERATION = 30;
    public static final int SPV_OPERAND_TYPE_KERNEL_ENQ_FLAGS = 31;
    public static final int SPV_OPERAND_TYPE_KERNEL_PROFILING_INFO = 32;
    public static final int SPV_OPERAND_TYPE_CAPABILITY = 33;
    public static final int SPV_OPERAND_TYPE_FPENCODING = 34;
    public static final int SPV_OPERAND_TYPE_IMAGE = 35;
    public static final int SPV_OPERAND_TYPE_FP_FAST_MATH_MODE = 36;
    public static final int SPV_OPERAND_TYPE_SELECTION_CONTROL = 37;
    public static final int SPV_OPERAND_TYPE_LOOP_CONTROL = 38;
    public static final int SPV_OPERAND_TYPE_FUNCTION_CONTROL = 39;
    public static final int SPV_OPERAND_TYPE_MEMORY_ACCESS = 40;
    public static final int SPV_OPERAND_TYPE_FRAGMENT_SHADING_RATE = 41;
    public static final int SPV_OPERAND_TYPE_OPTIONAL_ID = 42;
    public static final int SPV_OPERAND_TYPE_OPTIONAL_IMAGE = 43;
    public static final int SPV_OPERAND_TYPE_OPTIONAL_MEMORY_ACCESS = 44;
    public static final int SPV_OPERAND_TYPE_OPTIONAL_LITERAL_INTEGER = 45;
    public static final int SPV_OPERAND_TYPE_OPTIONAL_LITERAL_NUMBER = 46;
    public static final int SPV_OPERAND_TYPE_OPTIONAL_TYPED_LITERAL_INTEGER = 47;
    public static final int SPV_OPERAND_TYPE_OPTIONAL_LITERAL_STRING = 48;
    public static final int SPV_OPERAND_TYPE_OPTIONAL_ACCESS_QUALIFIER = 49;
    public static final int SPV_OPERAND_TYPE_OPTIONAL_CIV = 50;
    public static final int SPV_OPERAND_TYPE_OPTIONAL_FPENCODING = 51;
    public static final int SPV_OPERAND_TYPE_VARIABLE_ID = 52;
    public static final int SPV_OPERAND_TYPE_VARIABLE_LITERAL_INTEGER = 53;
    public static final int SPV_OPERAND_TYPE_VARIABLE_LITERAL_INTEGER_ID = 54;
    public static final int SPV_OPERAND_TYPE_VARIABLE_ID_LITERAL_INTEGER = 55;
    public static final int SPV_OPERAND_TYPE_DEBUG_INFO_FLAGS = 56;
    public static final int SPV_OPERAND_TYPE_DEBUG_BASE_TYPE_ATTRIBUTE_ENCODING = 57;
    public static final int SPV_OPERAND_TYPE_DEBUG_COMPOSITE_TYPE = 58;
    public static final int SPV_OPERAND_TYPE_DEBUG_TYPE_QUALIFIER = 59;
    public static final int SPV_OPERAND_TYPE_DEBUG_OPERATION = 60;
    public static final int SPV_OPERAND_TYPE_CLDEBUG100_DEBUG_INFO_FLAGS = 61;
    public static final int SPV_OPERAND_TYPE_CLDEBUG100_DEBUG_BASE_TYPE_ATTRIBUTE_ENCODING = 62;
    public static final int SPV_OPERAND_TYPE_CLDEBUG100_DEBUG_COMPOSITE_TYPE = 63;
    public static final int SPV_OPERAND_TYPE_CLDEBUG100_DEBUG_TYPE_QUALIFIER = 64;
    public static final int SPV_OPERAND_TYPE_CLDEBUG100_DEBUG_OPERATION = 65;
    public static final int SPV_OPERAND_TYPE_CLDEBUG100_DEBUG_IMPORTED_ENTITY = 66;
    public static final int SPV_OPERAND_TYPE_FPDENORM_MODE = 67;
    public static final int SPV_OPERAND_TYPE_FPOPERATION_MODE = 68;
    public static final int SPV_OPERAND_TYPE_QUANTIZATION_MODES = 69;
    public static final int SPV_OPERAND_TYPE_OVERFLOW_MODES = 70;
    public static final int SPV_OPERAND_TYPE_RAY_FLAGS = 71;
    public static final int SPV_OPERAND_TYPE_RAY_QUERY_INTERSECTION = 72;
    public static final int SPV_OPERAND_TYPE_RAY_QUERY_COMMITTED_INTERSECTION_TYPE = 73;
    public static final int SPV_OPERAND_TYPE_RAY_QUERY_CANDIDATE_INTERSECTION_TYPE = 74;
    public static final int SPV_OPERAND_TYPE_PACKED_VECTOR_FORMAT = 75;
    public static final int SPV_OPERAND_TYPE_OPTIONAL_PACKED_VECTOR_FORMAT = 76;
    public static final int SPV_OPERAND_TYPE_COOPERATIVE_MATRIX_OPERANDS = 77;
    public static final int SPV_OPERAND_TYPE_OPTIONAL_COOPERATIVE_MATRIX_OPERANDS = 78;
    public static final int SPV_OPERAND_TYPE_COOPERATIVE_MATRIX_LAYOUT = 79;
    public static final int SPV_OPERAND_TYPE_COOPERATIVE_MATRIX_USE = 80;
    public static final int SPV_OPERAND_TYPE_INITIALIZATION_MODE_QUALIFIER = 81;
    public static final int SPV_OPERAND_TYPE_HOST_ACCESS_QUALIFIER = 82;
    public static final int SPV_OPERAND_TYPE_LOAD_CACHE_CONTROL = 83;
    public static final int SPV_OPERAND_TYPE_STORE_CACHE_CONTROL = 84;
    public static final int SPV_OPERAND_TYPE_NAMED_MAXIMUM_NUMBER_OF_REGISTERS = 85;
    public static final int SPV_OPERAND_TYPE_RAW_ACCESS_CHAIN_OPERANDS = 86;
    public static final int SPV_OPERAND_TYPE_OPTIONAL_RAW_ACCESS_CHAIN_OPERANDS = 87;
    public static final int SPV_OPERAND_TYPE_TENSOR_CLAMP_MODE = 88;
    public static final int SPV_OPERAND_TYPE_COOPERATIVE_MATRIX_REDUCE = 89;
    public static final int SPV_OPERAND_TYPE_TENSOR_ADDRESSING_OPERANDS = 90;
    public static final int SPV_OPERAND_TYPE_MATRIX_MULTIPLY_ACCUMULATE_OPERANDS = 91;
    public static final int SPV_OPERAND_TYPE_OPTIONAL_MATRIX_MULTIPLY_ACCUMULATE_OPERANDS = 92;
    public static final int SPV_OPERAND_TYPE_COOPERATIVE_VECTOR_MATRIX_LAYOUT = 93;
    public static final int SPV_OPERAND_TYPE_COMPONENT_TYPE = 94;
    public static final int SPV_OPERAND_TYPE_KERNEL_PROPERTY_FLAGS = 95;
    public static final int SPV_OPERAND_TYPE_SHDEBUG100_BUILD_IDENTIFIER_FLAGS = 96;
    public static final int SPV_OPERAND_TYPE_SHDEBUG100_DEBUG_BASE_TYPE_ATTRIBUTE_ENCODING = 97;
    public static final int SPV_OPERAND_TYPE_SHDEBUG100_DEBUG_COMPOSITE_TYPE = 98;
    public static final int SPV_OPERAND_TYPE_SHDEBUG100_DEBUG_IMPORTED_ENTITY = 99;
    public static final int SPV_OPERAND_TYPE_SHDEBUG100_DEBUG_INFO_FLAGS = 100;
    public static final int SPV_OPERAND_TYPE_SHDEBUG100_DEBUG_OPERATION = 101;
    public static final int SPV_OPERAND_TYPE_SHDEBUG100_DEBUG_TYPE_QUALIFIER = 102;
    public static final int SPV_OPERAND_TYPE_TENSOR_OPERANDS = 103;
    public static final int SPV_OPERAND_TYPE_OPTIONAL_TENSOR_OPERANDS = 104;
    public static final int SPV_OPERAND_TYPE_OPTIONAL_CAPABILITY = 105;
    public static final int SPV_OPERAND_TYPE_VARIABLE_CAPABILITY = 106;
    public static final int SPV_OPERAND_TYPE_NUM_OPERAND_TYPES = 107;
    public static final int SPV_EXT_INST_TYPE_NONE = 0;
    public static final int SPV_EXT_INST_TYPE_GLSL_STD_450 = 1;
    public static final int SPV_EXT_INST_TYPE_OPENCL_STD = 2;
    public static final int SPV_EXT_INST_TYPE_SPV_AMD_SHADER_EXPLICIT_VERTEX_PARAMETER = 3;
    public static final int SPV_EXT_INST_TYPE_SPV_AMD_SHADER_TRINARY_MINMAX = 4;
    public static final int SPV_EXT_INST_TYPE_SPV_AMD_GCN_SHADER = 5;
    public static final int SPV_EXT_INST_TYPE_SPV_AMD_SHADER_BALLOT = 6;
    public static final int SPV_EXT_INST_TYPE_DEBUGINFO = 7;
    public static final int SPV_EXT_INST_TYPE_OPENCL_DEBUGINFO_100 = 8;
    public static final int SPV_EXT_INST_TYPE_NONSEMANTIC_CLSPVREFLECTION = 9;
    public static final int SPV_EXT_INST_TYPE_NONSEMANTIC_SHADER_DEBUGINFO_100 = 10;
    public static final int SPV_EXT_INST_TYPE_NONSEMANTIC_VKSPREFLECTION = 11;
    public static final int SPV_EXT_INST_TYPE_TOSA_001000_1 = 12;
    public static final int SPV_EXT_INST_TYPE_ARM_MOTION_ENGINE_100 = 13;
    public static final int SPV_EXT_INST_TYPE_NONSEMANTIC_UNKNOWN = 14;
    public static final int SPV_NUMBER_NONE = 0;
    public static final int SPV_NUMBER_UNSIGNED_INT = 1;
    public static final int SPV_NUMBER_SIGNED_INT = 2;
    public static final int SPV_NUMBER_FLOATING = 3;
    public static final int SPV_FP_ENCODING_UNKNOWN = 0;
    public static final int SPV_FP_ENCODING_IEEE754_BINARY16 = 1;
    public static final int SPV_FP_ENCODING_IEEE754_BINARY32 = 2;
    public static final int SPV_FP_ENCODING_IEEE754_BINARY64 = 3;
    public static final int SPV_FP_ENCODING_BFLOAT16 = 4;
    public static final int SPV_FP_ENCODING_FLOAT8_E4M3 = 5;
    public static final int SPV_FP_ENCODING_FLOAT8_E5M2 = 6;
    public static final int SPV_TEXT_TO_BINARY_OPTION_NONE = 1;
    public static final int SPV_TEXT_TO_BINARY_OPTION_PRESERVE_NUMERIC_IDS = 2;
    public static final int SPV_BINARY_TO_TEXT_OPTION_NONE = 1;
    public static final int SPV_BINARY_TO_TEXT_OPTION_PRINT = 2;
    public static final int SPV_BINARY_TO_TEXT_OPTION_COLOR = 4;
    public static final int SPV_BINARY_TO_TEXT_OPTION_INDENT = 8;
    public static final int SPV_BINARY_TO_TEXT_OPTION_SHOW_BYTE_OFFSET = 16;
    public static final int SPV_BINARY_TO_TEXT_OPTION_NO_HEADER = 32;
    public static final int SPV_BINARY_TO_TEXT_OPTION_FRIENDLY_NAMES = 64;
    public static final int SPV_BINARY_TO_TEXT_OPTION_COMMENT = 128;
    public static final int SPV_BINARY_TO_TEXT_OPTION_NESTED_INDENT = 256;
    public static final int SPV_BINARY_TO_TEXT_OPTION_REORDER_BLOCKS = 512;
    public static final int kDefaultMaxIdBound = 4194303;
    public static final int SPV_ENV_UNIVERSAL_1_0 = 0;
    public static final int SPV_ENV_VULKAN_1_0 = 1;
    public static final int SPV_ENV_UNIVERSAL_1_1 = 2;
    public static final int SPV_ENV_OPENCL_2_1 = 3;
    public static final int SPV_ENV_OPENCL_2_2 = 4;
    public static final int SPV_ENV_OPENGL_4_0 = 5;
    public static final int SPV_ENV_OPENGL_4_1 = 6;
    public static final int SPV_ENV_OPENGL_4_2 = 7;
    public static final int SPV_ENV_OPENGL_4_3 = 8;
    public static final int SPV_ENV_OPENGL_4_5 = 9;
    public static final int SPV_ENV_UNIVERSAL_1_2 = 10;
    public static final int SPV_ENV_OPENCL_1_2 = 11;
    public static final int SPV_ENV_OPENCL_EMBEDDED_1_2 = 12;
    public static final int SPV_ENV_OPENCL_2_0 = 13;
    public static final int SPV_ENV_OPENCL_EMBEDDED_2_0 = 14;
    public static final int SPV_ENV_OPENCL_EMBEDDED_2_1 = 15;
    public static final int SPV_ENV_OPENCL_EMBEDDED_2_2 = 16;
    public static final int SPV_ENV_UNIVERSAL_1_3 = 17;
    public static final int SPV_ENV_VULKAN_1_1 = 18;
    public static final int SPV_ENV_WEBGPU_0 = 19;
    public static final int SPV_ENV_UNIVERSAL_1_4 = 20;
    public static final int SPV_ENV_VULKAN_1_1_SPIRV_1_4 = 21;
    public static final int SPV_ENV_UNIVERSAL_1_5 = 22;
    public static final int SPV_ENV_VULKAN_1_2 = 23;
    public static final int SPV_ENV_UNIVERSAL_1_6 = 24;
    public static final int SPV_ENV_VULKAN_1_3 = 25;
    public static final int SPV_ENV_VULKAN_1_4 = 26;
    public static final int spv_validator_limit_max_struct_members = 0;
    public static final int spv_validator_limit_max_struct_depth = 1;
    public static final int spv_validator_limit_max_local_variables = 2;
    public static final int spv_validator_limit_max_global_variables = 3;
    public static final int spv_validator_limit_max_switch_branches = 4;
    public static final int spv_validator_limit_max_function_args = 5;
    public static final int spv_validator_limit_max_control_flow_nesting_depth = 6;
    public static final int spv_validator_limit_max_access_chain_indexes = 7;
    public static final int spv_validator_limit_max_id_bound = 8;

    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/util/shaderc/SPV$Functions.class */
    public static final class Functions {
        public static final long SoftwareVersionString = 0;
        public static final long SoftwareVersionDetailsString = 0;
        public static final long TargetEnvDescription = 0;
        public static final long ParseTargetEnv = 0;
        public static final long ParseVulkanEnv = 0;
        public static final long ContextCreate = 0;
        public static final long ContextDestroy = 0;
        public static final long ValidatorOptionsCreate = 0;
        public static final long ValidatorOptionsDestroy = 0;
        public static final long ValidatorOptionsSetUniversalLimit = 0;
        public static final long ValidatorOptionsSetRelaxStoreStruct = 0;
        public static final long ValidatorOptionsSetRelaxLogicalPointer = 0;
        public static final long ValidatorOptionsSetBeforeHlslLegalization = 0;
        public static final long ValidatorOptionsSetRelaxBlockLayout = 0;
        public static final long ValidatorOptionsSetUniformBufferStandardLayout = 0;
        public static final long ValidatorOptionsSetScalarBlockLayout = 0;
        public static final long ValidatorOptionsSetWorkgroupScalarBlockLayout = 0;
        public static final long ValidatorOptionsSetSkipBlockLayout = 0;
        public static final long ValidatorOptionsSetAllowLocalSizeId = 0;
        public static final long ValidatorOptionsSetAllowOffsetTextureOperand = 0;
        public static final long ValidatorOptionsSetAllowVulkan32BitBitwise = 0;
        public static final long ValidatorOptionsSetFriendlyNames = 0;
        public static final long OptimizerOptionsCreate = 0;
        public static final long OptimizerOptionsDestroy = 0;
        public static final long OptimizerOptionsSetRunValidator = 0;
        public static final long OptimizerOptionsSetValidatorOptions = 0;
        public static final long OptimizerOptionsSetMaxIdBound = 0;
        public static final long OptimizerOptionsSetPreserveBindings = 0;
        public static final long OptimizerOptionsSetPreserveSpecConstants = 0;
        public static final long ReducerOptionsCreate = 0;
        public static final long ReducerOptionsDestroy = 0;
        public static final long ReducerOptionsSetStepLimit = 0;
        public static final long ReducerOptionsSetFailOnValidationError = 0;
        public static final long ReducerOptionsSetTargetFunction = 0;
        public static final long FuzzerOptionsCreate = 0;
        public static final long FuzzerOptionsDestroy = 0;
        public static final long FuzzerOptionsEnableReplayValidation = 0;
        public static final long FuzzerOptionsSetRandomSeed = 0;
        public static final long FuzzerOptionsSetReplayRange = 0;
        public static final long FuzzerOptionsSetShrinkerStepLimit = 0;
        public static final long FuzzerOptionsEnableFuzzerPassValidation = 0;
        public static final long FuzzerOptionsEnableAllPasses = 0;
        public static final long TextToBinary = 0;
        public static final long TextToBinaryWithOptions = 0;
        public static final long TextDestroy = 0;
        public static final long BinaryToText = 0;
        public static final long BinaryDestroy = 0;
        public static final long Validate = 0;
        public static final long ValidateWithOptions = 0;
        public static final long ValidateBinary = 0;
        public static final long DiagnosticCreate = 0;
        public static final long DiagnosticDestroy = 0;
        public static final long DiagnosticPrint = 0;
        public static final long OpcodeString = 0;
        public static final long BinaryParse = 0;

        private Functions() {
                r2 = this;
                r0 = r2
                r0.<init>()
                return
        }

        static {
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.util.shaderc.SPV.access$000()
                java.lang.String r1 = "spvSoftwareVersionString"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.util.shaderc.SPV.Functions.SoftwareVersionString = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.util.shaderc.SPV.access$000()
                java.lang.String r1 = "spvSoftwareVersionDetailsString"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.util.shaderc.SPV.Functions.SoftwareVersionDetailsString = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.util.shaderc.SPV.access$000()
                java.lang.String r1 = "spvTargetEnvDescription"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.util.shaderc.SPV.Functions.TargetEnvDescription = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.util.shaderc.SPV.access$000()
                java.lang.String r1 = "spvParseTargetEnv"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.util.shaderc.SPV.Functions.ParseTargetEnv = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.util.shaderc.SPV.access$000()
                java.lang.String r1 = "spvParseVulkanEnv"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.util.shaderc.SPV.Functions.ParseVulkanEnv = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.util.shaderc.SPV.access$000()
                java.lang.String r1 = "spvContextCreate"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.util.shaderc.SPV.Functions.ContextCreate = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.util.shaderc.SPV.access$000()
                java.lang.String r1 = "spvContextDestroy"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.util.shaderc.SPV.Functions.ContextDestroy = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.util.shaderc.SPV.access$000()
                java.lang.String r1 = "spvValidatorOptionsCreate"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.util.shaderc.SPV.Functions.ValidatorOptionsCreate = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.util.shaderc.SPV.access$000()
                java.lang.String r1 = "spvValidatorOptionsDestroy"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.util.shaderc.SPV.Functions.ValidatorOptionsDestroy = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.util.shaderc.SPV.access$000()
                java.lang.String r1 = "spvValidatorOptionsSetUniversalLimit"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.util.shaderc.SPV.Functions.ValidatorOptionsSetUniversalLimit = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.util.shaderc.SPV.access$000()
                java.lang.String r1 = "spvValidatorOptionsSetRelaxStoreStruct"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.util.shaderc.SPV.Functions.ValidatorOptionsSetRelaxStoreStruct = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.util.shaderc.SPV.access$000()
                java.lang.String r1 = "spvValidatorOptionsSetRelaxLogicalPointer"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.util.shaderc.SPV.Functions.ValidatorOptionsSetRelaxLogicalPointer = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.util.shaderc.SPV.access$000()
                java.lang.String r1 = "spvValidatorOptionsSetBeforeHlslLegalization"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.util.shaderc.SPV.Functions.ValidatorOptionsSetBeforeHlslLegalization = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.util.shaderc.SPV.access$000()
                java.lang.String r1 = "spvValidatorOptionsSetRelaxBlockLayout"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.util.shaderc.SPV.Functions.ValidatorOptionsSetRelaxBlockLayout = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.util.shaderc.SPV.access$000()
                java.lang.String r1 = "spvValidatorOptionsSetUniformBufferStandardLayout"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.util.shaderc.SPV.Functions.ValidatorOptionsSetUniformBufferStandardLayout = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.util.shaderc.SPV.access$000()
                java.lang.String r1 = "spvValidatorOptionsSetScalarBlockLayout"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.util.shaderc.SPV.Functions.ValidatorOptionsSetScalarBlockLayout = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.util.shaderc.SPV.access$000()
                java.lang.String r1 = "spvValidatorOptionsSetWorkgroupScalarBlockLayout"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.util.shaderc.SPV.Functions.ValidatorOptionsSetWorkgroupScalarBlockLayout = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.util.shaderc.SPV.access$000()
                java.lang.String r1 = "spvValidatorOptionsSetSkipBlockLayout"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.util.shaderc.SPV.Functions.ValidatorOptionsSetSkipBlockLayout = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.util.shaderc.SPV.access$000()
                java.lang.String r1 = "spvValidatorOptionsSetAllowLocalSizeId"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.util.shaderc.SPV.Functions.ValidatorOptionsSetAllowLocalSizeId = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.util.shaderc.SPV.access$000()
                java.lang.String r1 = "spvValidatorOptionsSetAllowOffsetTextureOperand"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.util.shaderc.SPV.Functions.ValidatorOptionsSetAllowOffsetTextureOperand = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.util.shaderc.SPV.access$000()
                java.lang.String r1 = "spvValidatorOptionsSetAllowVulkan32BitBitwise"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.util.shaderc.SPV.Functions.ValidatorOptionsSetAllowVulkan32BitBitwise = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.util.shaderc.SPV.access$000()
                java.lang.String r1 = "spvValidatorOptionsSetFriendlyNames"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.util.shaderc.SPV.Functions.ValidatorOptionsSetFriendlyNames = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.util.shaderc.SPV.access$000()
                java.lang.String r1 = "spvOptimizerOptionsCreate"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.util.shaderc.SPV.Functions.OptimizerOptionsCreate = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.util.shaderc.SPV.access$000()
                java.lang.String r1 = "spvOptimizerOptionsDestroy"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.util.shaderc.SPV.Functions.OptimizerOptionsDestroy = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.util.shaderc.SPV.access$000()
                java.lang.String r1 = "spvOptimizerOptionsSetRunValidator"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.util.shaderc.SPV.Functions.OptimizerOptionsSetRunValidator = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.util.shaderc.SPV.access$000()
                java.lang.String r1 = "spvOptimizerOptionsSetValidatorOptions"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.util.shaderc.SPV.Functions.OptimizerOptionsSetValidatorOptions = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.util.shaderc.SPV.access$000()
                java.lang.String r1 = "spvOptimizerOptionsSetMaxIdBound"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.util.shaderc.SPV.Functions.OptimizerOptionsSetMaxIdBound = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.util.shaderc.SPV.access$000()
                java.lang.String r1 = "spvOptimizerOptionsSetPreserveBindings"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.util.shaderc.SPV.Functions.OptimizerOptionsSetPreserveBindings = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.util.shaderc.SPV.access$000()
                java.lang.String r1 = "spvOptimizerOptionsSetPreserveSpecConstants"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.util.shaderc.SPV.Functions.OptimizerOptionsSetPreserveSpecConstants = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.util.shaderc.SPV.access$000()
                java.lang.String r1 = "spvReducerOptionsCreate"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.util.shaderc.SPV.Functions.ReducerOptionsCreate = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.util.shaderc.SPV.access$000()
                java.lang.String r1 = "spvReducerOptionsDestroy"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.util.shaderc.SPV.Functions.ReducerOptionsDestroy = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.util.shaderc.SPV.access$000()
                java.lang.String r1 = "spvReducerOptionsSetStepLimit"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.util.shaderc.SPV.Functions.ReducerOptionsSetStepLimit = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.util.shaderc.SPV.access$000()
                java.lang.String r1 = "spvReducerOptionsSetFailOnValidationError"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.util.shaderc.SPV.Functions.ReducerOptionsSetFailOnValidationError = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.util.shaderc.SPV.access$000()
                java.lang.String r1 = "spvReducerOptionsSetTargetFunction"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.util.shaderc.SPV.Functions.ReducerOptionsSetTargetFunction = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.util.shaderc.SPV.access$000()
                java.lang.String r1 = "spvFuzzerOptionsCreate"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.util.shaderc.SPV.Functions.FuzzerOptionsCreate = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.util.shaderc.SPV.access$000()
                java.lang.String r1 = "spvFuzzerOptionsDestroy"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.util.shaderc.SPV.Functions.FuzzerOptionsDestroy = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.util.shaderc.SPV.access$000()
                java.lang.String r1 = "spvFuzzerOptionsEnableReplayValidation"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.util.shaderc.SPV.Functions.FuzzerOptionsEnableReplayValidation = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.util.shaderc.SPV.access$000()
                java.lang.String r1 = "spvFuzzerOptionsSetRandomSeed"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.util.shaderc.SPV.Functions.FuzzerOptionsSetRandomSeed = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.util.shaderc.SPV.access$000()
                java.lang.String r1 = "spvFuzzerOptionsSetReplayRange"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.util.shaderc.SPV.Functions.FuzzerOptionsSetReplayRange = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.util.shaderc.SPV.access$000()
                java.lang.String r1 = "spvFuzzerOptionsSetShrinkerStepLimit"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.util.shaderc.SPV.Functions.FuzzerOptionsSetShrinkerStepLimit = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.util.shaderc.SPV.access$000()
                java.lang.String r1 = "spvFuzzerOptionsEnableFuzzerPassValidation"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.util.shaderc.SPV.Functions.FuzzerOptionsEnableFuzzerPassValidation = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.util.shaderc.SPV.access$000()
                java.lang.String r1 = "spvFuzzerOptionsEnableAllPasses"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.util.shaderc.SPV.Functions.FuzzerOptionsEnableAllPasses = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.util.shaderc.SPV.access$000()
                java.lang.String r1 = "spvTextToBinary"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.util.shaderc.SPV.Functions.TextToBinary = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.util.shaderc.SPV.access$000()
                java.lang.String r1 = "spvTextToBinaryWithOptions"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.util.shaderc.SPV.Functions.TextToBinaryWithOptions = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.util.shaderc.SPV.access$000()
                java.lang.String r1 = "spvTextDestroy"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.util.shaderc.SPV.Functions.TextDestroy = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.util.shaderc.SPV.access$000()
                java.lang.String r1 = "spvBinaryToText"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.util.shaderc.SPV.Functions.BinaryToText = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.util.shaderc.SPV.access$000()
                java.lang.String r1 = "spvBinaryDestroy"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.util.shaderc.SPV.Functions.BinaryDestroy = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.util.shaderc.SPV.access$000()
                java.lang.String r1 = "spvValidate"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.util.shaderc.SPV.Functions.Validate = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.util.shaderc.SPV.access$000()
                java.lang.String r1 = "spvValidateWithOptions"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.util.shaderc.SPV.Functions.ValidateWithOptions = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.util.shaderc.SPV.access$000()
                java.lang.String r1 = "spvValidateBinary"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.util.shaderc.SPV.Functions.ValidateBinary = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.util.shaderc.SPV.access$000()
                java.lang.String r1 = "spvDiagnosticCreate"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.util.shaderc.SPV.Functions.DiagnosticCreate = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.util.shaderc.SPV.access$000()
                java.lang.String r1 = "spvDiagnosticDestroy"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.util.shaderc.SPV.Functions.DiagnosticDestroy = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.util.shaderc.SPV.access$000()
                java.lang.String r1 = "spvDiagnosticPrint"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.util.shaderc.SPV.Functions.DiagnosticPrint = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.util.shaderc.SPV.access$000()
                java.lang.String r1 = "spvOpcodeString"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.util.shaderc.SPV.Functions.OpcodeString = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.util.shaderc.SPV.access$000()
                java.lang.String r1 = "spvBinaryParse"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.util.shaderc.SPV.Functions.BinaryParse = r0
                return
        }
    }

    public static org.lwjgl.system.SharedLibrary getLibrary() {
            org.lwjgl.system.SharedLibrary r0 = org.lwjgl.util.shaderc.SPV.SHADERC
            return r0
    }

    protected SPV() {
            r3 = this;
            r0 = r3
            r0.<init>()
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r1 = r0
            r1.<init>()
            throw r0
    }

    public static long nspvSoftwareVersionString() {
            long r0 = org.lwjgl.util.shaderc.SPV.Functions.SoftwareVersionString
            r3 = r0
            r0 = r3
            long r0 = org.lwjgl.system.JNI.invokeP(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("char const *")
    public static java.lang.String spvSoftwareVersionString() {
            long r0 = nspvSoftwareVersionString()
            r3 = r0
            r0 = r3
            java.lang.String r0 = org.lwjgl.system.MemoryUtil.memASCIISafe(r0)
            return r0
    }

    public static long nspvSoftwareVersionDetailsString() {
            long r0 = org.lwjgl.util.shaderc.SPV.Functions.SoftwareVersionDetailsString
            r3 = r0
            r0 = r3
            long r0 = org.lwjgl.system.JNI.invokeP(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("char const *")
    public static java.lang.String spvSoftwareVersionDetailsString() {
            long r0 = nspvSoftwareVersionDetailsString()
            r3 = r0
            r0 = r3
            java.lang.String r0 = org.lwjgl.system.MemoryUtil.memASCIISafe(r0)
            return r0
    }

    public static long nspvTargetEnvDescription(int r4) {
            long r0 = org.lwjgl.util.shaderc.SPV.Functions.TargetEnvDescription
            r5 = r0
            r0 = r4
            r1 = r5
            long r0 = org.lwjgl.system.JNI.invokeP(r0, r1)
            return r0
    }

    @org.lwjgl.system.NativeType("char const *")
    public static java.lang.String spvTargetEnvDescription(@org.lwjgl.system.NativeType("spv_target_env") int r3) {
            r0 = r3
            long r0 = nspvTargetEnvDescription(r0)
            r4 = r0
            r0 = r4
            java.lang.String r0 = org.lwjgl.system.MemoryUtil.memASCIISafe(r0)
            return r0
    }

    public static boolean nspvParseTargetEnv(long r7, long r9) {
            long r0 = org.lwjgl.util.shaderc.SPV.Functions.ParseTargetEnv
            r11 = r0
            r0 = r7
            r1 = r9
            r2 = r11
            boolean r0 = org.lwjgl.system.JNI.invokePPZ(r0, r1, r2)
            return r0
    }

    @org.lwjgl.system.NativeType("bool")
    public static boolean spvParseTargetEnv(@org.lwjgl.system.NativeType("char const *") java.nio.ByteBuffer r5, @org.lwjgl.system.NativeType("spv_target_env *") java.nio.IntBuffer r6) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lf
            r0 = r5
            org.lwjgl.system.Checks.checkNT1(r0)
            r0 = r6
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
        Lf:
            r0 = r5
            long r0 = org.lwjgl.system.MemoryUtil.memAddress(r0)
            r1 = r6
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            boolean r0 = nspvParseTargetEnv(r0, r1)
            return r0
    }

    @org.lwjgl.system.NativeType("bool")
    public static boolean spvParseTargetEnv(@org.lwjgl.system.NativeType("char const *") java.lang.CharSequence r5, @org.lwjgl.system.NativeType("spv_target_env *") java.nio.IntBuffer r6) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r6
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
        Lb:
            org.lwjgl.system.MemoryStack r0 = org.lwjgl.system.MemoryStack.stackGet()
            r7 = r0
            r0 = r7
            int r0 = r0.getPointer()
            r8 = r0
            r0 = r7
            r1 = r5
            r2 = 1
            int r0 = r0.nASCII(r1, r2)     // Catch: java.lang.Throwable -> L34
            r0 = r7
            long r0 = r0.getPointerAddress()     // Catch: java.lang.Throwable -> L34
            r9 = r0
            r0 = r9
            r1 = r6
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)     // Catch: java.lang.Throwable -> L34
            boolean r0 = nspvParseTargetEnv(r0, r1)     // Catch: java.lang.Throwable -> L34
            r11 = r0
            r0 = r7
            r1 = r8
            r0.setPointer(r1)
            r0 = r11
            return r0
        L34:
            r12 = move-exception
            r0 = r7
            r1 = r8
            r0.setPointer(r1)
            r0 = r12
            throw r0
    }

    public static boolean nspvParseVulkanEnv(int r7, int r8, long r9) {
            long r0 = org.lwjgl.util.shaderc.SPV.Functions.ParseVulkanEnv
            r11 = r0
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = r11
            boolean r0 = org.lwjgl.system.JNI.invokePZ(r0, r1, r2, r3)
            return r0
    }

    @org.lwjgl.system.NativeType("bool")
    public static boolean spvParseVulkanEnv(@org.lwjgl.system.NativeType("uint32_t") int r5, @org.lwjgl.system.NativeType("uint32_t") int r6, @org.lwjgl.system.NativeType("spv_target_env *") java.nio.IntBuffer r7) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r7
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
        Lb:
            r0 = r5
            r1 = r6
            r2 = r7
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            boolean r0 = nspvParseVulkanEnv(r0, r1, r2)
            return r0
    }

    @org.lwjgl.system.NativeType("spv_context")
    public static long spvContextCreate(@org.lwjgl.system.NativeType("spv_target_env") int r4) {
            long r0 = org.lwjgl.util.shaderc.SPV.Functions.ContextCreate
            r5 = r0
            r0 = r4
            r1 = r5
            long r0 = org.lwjgl.system.JNI.invokeP(r0, r1)
            return r0
    }

    public static void spvContextDestroy(@org.lwjgl.system.NativeType("spv_context") long r5) {
            long r0 = org.lwjgl.util.shaderc.SPV.Functions.ContextDestroy
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

    @org.lwjgl.system.NativeType("spv_validator_options")
    public static long spvValidatorOptionsCreate() {
            long r0 = org.lwjgl.util.shaderc.SPV.Functions.ValidatorOptionsCreate
            r3 = r0
            r0 = r3
            long r0 = org.lwjgl.system.JNI.invokeP(r0)
            return r0
    }

    public static void spvValidatorOptionsDestroy(@org.lwjgl.system.NativeType("spv_validator_options") long r5) {
            long r0 = org.lwjgl.util.shaderc.SPV.Functions.ValidatorOptionsDestroy
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

    public static void spvValidatorOptionsSetUniversalLimit(@org.lwjgl.system.NativeType("spv_validator_options") long r7, @org.lwjgl.system.NativeType("spv_validator_limit") int r9, @org.lwjgl.system.NativeType("uint32_t") int r10) {
            long r0 = org.lwjgl.util.shaderc.SPV.Functions.ValidatorOptionsSetUniversalLimit
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

    public static void spvValidatorOptionsSetRelaxStoreStruct(@org.lwjgl.system.NativeType("spv_validator_options") long r6, @org.lwjgl.system.NativeType("bool") boolean r8) {
            long r0 = org.lwjgl.util.shaderc.SPV.Functions.ValidatorOptionsSetRelaxStoreStruct
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

    public static void spvValidatorOptionsSetRelaxLogicalPointer(@org.lwjgl.system.NativeType("spv_validator_options") long r6, @org.lwjgl.system.NativeType("bool") boolean r8) {
            long r0 = org.lwjgl.util.shaderc.SPV.Functions.ValidatorOptionsSetRelaxLogicalPointer
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

    public static void spvValidatorOptionsSetBeforeHlslLegalization(@org.lwjgl.system.NativeType("spv_validator_options") long r6, @org.lwjgl.system.NativeType("bool") boolean r8) {
            long r0 = org.lwjgl.util.shaderc.SPV.Functions.ValidatorOptionsSetBeforeHlslLegalization
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

    public static void spvValidatorOptionsSetRelaxBlockLayout(@org.lwjgl.system.NativeType("spv_validator_options") long r6, @org.lwjgl.system.NativeType("bool") boolean r8) {
            long r0 = org.lwjgl.util.shaderc.SPV.Functions.ValidatorOptionsSetRelaxBlockLayout
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

    public static void spvValidatorOptionsSetUniformBufferStandardLayout(@org.lwjgl.system.NativeType("spv_validator_options") long r6, @org.lwjgl.system.NativeType("bool") boolean r8) {
            long r0 = org.lwjgl.util.shaderc.SPV.Functions.ValidatorOptionsSetUniformBufferStandardLayout
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

    public static void spvValidatorOptionsSetScalarBlockLayout(@org.lwjgl.system.NativeType("spv_validator_options") long r6, @org.lwjgl.system.NativeType("bool") boolean r8) {
            long r0 = org.lwjgl.util.shaderc.SPV.Functions.ValidatorOptionsSetScalarBlockLayout
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

    public static void spvValidatorOptionsSetWorkgroupScalarBlockLayout(@org.lwjgl.system.NativeType("spv_validator_options") long r6, @org.lwjgl.system.NativeType("bool") boolean r8) {
            long r0 = org.lwjgl.util.shaderc.SPV.Functions.ValidatorOptionsSetWorkgroupScalarBlockLayout
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

    public static void spvValidatorOptionsSetSkipBlockLayout(@org.lwjgl.system.NativeType("spv_validator_options") long r6, @org.lwjgl.system.NativeType("bool") boolean r8) {
            long r0 = org.lwjgl.util.shaderc.SPV.Functions.ValidatorOptionsSetSkipBlockLayout
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

    public static void spvValidatorOptionsSetAllowLocalSizeId(@org.lwjgl.system.NativeType("spv_validator_options") long r6, @org.lwjgl.system.NativeType("bool") boolean r8) {
            long r0 = org.lwjgl.util.shaderc.SPV.Functions.ValidatorOptionsSetAllowLocalSizeId
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

    public static void spvValidatorOptionsSetAllowOffsetTextureOperand(@org.lwjgl.system.NativeType("spv_validator_options") long r6, @org.lwjgl.system.NativeType("bool") boolean r8) {
            long r0 = org.lwjgl.util.shaderc.SPV.Functions.ValidatorOptionsSetAllowOffsetTextureOperand
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

    public static void spvValidatorOptionsSetAllowVulkan32BitBitwise(@org.lwjgl.system.NativeType("spv_validator_options") long r6, @org.lwjgl.system.NativeType("bool") boolean r8) {
            long r0 = org.lwjgl.util.shaderc.SPV.Functions.ValidatorOptionsSetAllowVulkan32BitBitwise
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

    public static void spvValidatorOptionsSetFriendlyNames(@org.lwjgl.system.NativeType("spv_validator_options") long r6, @org.lwjgl.system.NativeType("bool") boolean r8) {
            long r0 = org.lwjgl.util.shaderc.SPV.Functions.ValidatorOptionsSetFriendlyNames
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

    @org.lwjgl.system.NativeType("spv_optimizer_options")
    public static long spvOptimizerOptionsCreate() {
            long r0 = org.lwjgl.util.shaderc.SPV.Functions.OptimizerOptionsCreate
            r3 = r0
            r0 = r3
            long r0 = org.lwjgl.system.JNI.invokeP(r0)
            return r0
    }

    public static void spvOptimizerOptionsDestroy(@org.lwjgl.system.NativeType("spv_optimizer_options") long r5) {
            long r0 = org.lwjgl.util.shaderc.SPV.Functions.OptimizerOptionsDestroy
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

    public static void spvOptimizerOptionsSetRunValidator(@org.lwjgl.system.NativeType("spv_optimizer_options") long r6, @org.lwjgl.system.NativeType("bool") boolean r8) {
            long r0 = org.lwjgl.util.shaderc.SPV.Functions.OptimizerOptionsSetRunValidator
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

    public static void spvOptimizerOptionsSetValidatorOptions(@org.lwjgl.system.NativeType("spv_optimizer_options") long r7, @org.lwjgl.system.NativeType("spv_validator_options") long r9) {
            long r0 = org.lwjgl.util.shaderc.SPV.Functions.OptimizerOptionsSetValidatorOptions
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

    public static void spvOptimizerOptionsSetMaxIdBound(@org.lwjgl.system.NativeType("spv_optimizer_options") long r6, @org.lwjgl.system.NativeType("uint32_t") int r8) {
            long r0 = org.lwjgl.util.shaderc.SPV.Functions.OptimizerOptionsSetMaxIdBound
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

    public static void spvOptimizerOptionsSetPreserveBindings(@org.lwjgl.system.NativeType("spv_optimizer_options") long r6, @org.lwjgl.system.NativeType("bool") boolean r8) {
            long r0 = org.lwjgl.util.shaderc.SPV.Functions.OptimizerOptionsSetPreserveBindings
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

    public static void spvOptimizerOptionsSetPreserveSpecConstants(@org.lwjgl.system.NativeType("spv_optimizer_options") long r6, @org.lwjgl.system.NativeType("bool") boolean r8) {
            long r0 = org.lwjgl.util.shaderc.SPV.Functions.OptimizerOptionsSetPreserveSpecConstants
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

    @org.lwjgl.system.NativeType("spv_reducer_options")
    public static long spvReducerOptionsCreate() {
            long r0 = org.lwjgl.util.shaderc.SPV.Functions.ReducerOptionsCreate
            r3 = r0
            r0 = r3
            long r0 = org.lwjgl.system.JNI.invokeP(r0)
            return r0
    }

    public static void spvReducerOptionsDestroy(@org.lwjgl.system.NativeType("spv_reducer_options") long r5) {
            long r0 = org.lwjgl.util.shaderc.SPV.Functions.ReducerOptionsDestroy
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

    public static void spvReducerOptionsSetStepLimit(@org.lwjgl.system.NativeType("spv_reducer_options") long r6, @org.lwjgl.system.NativeType("uint32_t") int r8) {
            long r0 = org.lwjgl.util.shaderc.SPV.Functions.ReducerOptionsSetStepLimit
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

    public static void spvReducerOptionsSetFailOnValidationError(@org.lwjgl.system.NativeType("spv_reducer_options") long r6, @org.lwjgl.system.NativeType("bool") boolean r8) {
            long r0 = org.lwjgl.util.shaderc.SPV.Functions.ReducerOptionsSetFailOnValidationError
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

    public static void spvReducerOptionsSetTargetFunction(@org.lwjgl.system.NativeType("spv_reducer_options") long r6, @org.lwjgl.system.NativeType("uint32_t") int r8) {
            long r0 = org.lwjgl.util.shaderc.SPV.Functions.ReducerOptionsSetTargetFunction
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

    @org.lwjgl.system.NativeType("spv_fuzzer_options")
    public static long spvFuzzerOptionsCreate() {
            long r0 = org.lwjgl.util.shaderc.SPV.Functions.FuzzerOptionsCreate
            r3 = r0
            r0 = r3
            long r0 = org.lwjgl.system.JNI.invokeP(r0)
            return r0
    }

    public static void spvFuzzerOptionsDestroy(@org.lwjgl.system.NativeType("spv_fuzzer_options") long r5) {
            long r0 = org.lwjgl.util.shaderc.SPV.Functions.FuzzerOptionsDestroy
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

    public static void spvFuzzerOptionsEnableReplayValidation(@org.lwjgl.system.NativeType("spv_fuzzer_options") long r5) {
            long r0 = org.lwjgl.util.shaderc.SPV.Functions.FuzzerOptionsEnableReplayValidation
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

    public static void spvFuzzerOptionsSetRandomSeed(@org.lwjgl.system.NativeType("spv_fuzzer_options") long r6, @org.lwjgl.system.NativeType("uint32_t") int r8) {
            long r0 = org.lwjgl.util.shaderc.SPV.Functions.FuzzerOptionsSetRandomSeed
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

    public static void spvFuzzerOptionsSetReplayRange(@org.lwjgl.system.NativeType("spv_fuzzer_options") long r6, @org.lwjgl.system.NativeType("int32_t") int r8) {
            long r0 = org.lwjgl.util.shaderc.SPV.Functions.FuzzerOptionsSetReplayRange
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

    public static void spvFuzzerOptionsSetShrinkerStepLimit(@org.lwjgl.system.NativeType("spv_fuzzer_options") long r6, @org.lwjgl.system.NativeType("uint32_t") int r8) {
            long r0 = org.lwjgl.util.shaderc.SPV.Functions.FuzzerOptionsSetShrinkerStepLimit
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

    public static void spvFuzzerOptionsEnableFuzzerPassValidation(@org.lwjgl.system.NativeType("spv_fuzzer_options") long r5) {
            long r0 = org.lwjgl.util.shaderc.SPV.Functions.FuzzerOptionsEnableFuzzerPassValidation
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

    public static void spvFuzzerOptionsEnableAllPasses(@org.lwjgl.system.NativeType("spv_fuzzer_options") long r5) {
            long r0 = org.lwjgl.util.shaderc.SPV.Functions.FuzzerOptionsEnableAllPasses
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

    public static int nspvTextToBinary(long r13, long r15, long r17, long r19, long r21) {
            long r0 = org.lwjgl.util.shaderc.SPV.Functions.TextToBinary
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
            int r0 = org.lwjgl.system.JNI.invokePPPPPI(r0, r1, r2, r3, r4, r5)
            return r0
    }

    @org.lwjgl.system.NativeType("spv_result_t")
    public static int spvTextToBinary(@org.lwjgl.system.NativeType("spv_const_context const") long r11, @org.lwjgl.system.NativeType("char const *") java.nio.ByteBuffer r13, @org.lwjgl.system.NativeType("spv_binary *") org.lwjgl.PointerBuffer r14, @org.lwjgl.system.NativeType("spv_diagnostic *") org.lwjgl.PointerBuffer r15) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L11
            r0 = r14
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
            r0 = r15
            r1 = 1
            org.lwjgl.system.Checks.checkSafe(r0, r1)
        L11:
            r0 = r11
            r1 = r13
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            r2 = r13
            int r2 = r2.remaining()
            long r2 = (long) r2
            r3 = r14
            long r3 = org.lwjgl.system.MemoryUtil.memAddress(r3)
            r4 = r15
            long r4 = org.lwjgl.system.MemoryUtil.memAddressSafe(r4)
            int r0 = nspvTextToBinary(r0, r1, r2, r3, r4)
            return r0
    }

    @org.lwjgl.system.NativeType("spv_result_t")
    public static int spvTextToBinary(@org.lwjgl.system.NativeType("spv_const_context const") long r11, @org.lwjgl.system.NativeType("char const *") java.lang.CharSequence r13, @org.lwjgl.system.NativeType("spv_binary *") org.lwjgl.PointerBuffer r14, @org.lwjgl.system.NativeType("spv_diagnostic *") org.lwjgl.PointerBuffer r15) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L11
            r0 = r14
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
            r0 = r15
            r1 = 1
            org.lwjgl.system.Checks.checkSafe(r0, r1)
        L11:
            org.lwjgl.system.MemoryStack r0 = org.lwjgl.system.MemoryStack.stackGet()
            r16 = r0
            r0 = r16
            int r0 = r0.getPointer()
            r17 = r0
            r0 = r16
            r1 = r13
            r2 = 0
            int r0 = r0.nUTF8(r1, r2)     // Catch: java.lang.Throwable -> L4b
            r18 = r0
            r0 = r16
            long r0 = r0.getPointerAddress()     // Catch: java.lang.Throwable -> L4b
            r19 = r0
            r0 = r11
            r1 = r19
            r2 = r18
            long r2 = (long) r2     // Catch: java.lang.Throwable -> L4b
            r3 = r14
            long r3 = org.lwjgl.system.MemoryUtil.memAddress(r3)     // Catch: java.lang.Throwable -> L4b
            r4 = r15
            long r4 = org.lwjgl.system.MemoryUtil.memAddressSafe(r4)     // Catch: java.lang.Throwable -> L4b
            int r0 = nspvTextToBinary(r0, r1, r2, r3, r4)     // Catch: java.lang.Throwable -> L4b
            r21 = r0
            r0 = r16
            r1 = r17
            r0.setPointer(r1)
            r0 = r21
            return r0
        L4b:
            r22 = move-exception
            r0 = r16
            r1 = r17
            r0.setPointer(r1)
            r0 = r22
            throw r0
    }

    public static int nspvTextToBinaryWithOptions(long r14, long r16, long r18, int r20, long r21, long r23) {
            long r0 = org.lwjgl.util.shaderc.SPV.Functions.TextToBinaryWithOptions
            r25 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L10
            r0 = r14
            long r0 = org.lwjgl.system.Checks.check(r0)
        L10:
            r0 = r14
            r1 = r16
            r2 = r18
            r3 = r20
            r4 = r21
            r5 = r23
            r6 = r25
            int r0 = org.lwjgl.system.JNI.invokePPPPPI(r0, r1, r2, r3, r4, r5, r6)
            return r0
    }

    @org.lwjgl.system.NativeType("spv_result_t")
    public static int spvTextToBinaryWithOptions(@org.lwjgl.system.NativeType("spv_const_context const") long r12, @org.lwjgl.system.NativeType("char const *") java.nio.ByteBuffer r14, @org.lwjgl.system.NativeType("uint32_t") int r15, @org.lwjgl.system.NativeType("spv_binary *") org.lwjgl.PointerBuffer r16, @org.lwjgl.system.NativeType("spv_diagnostic *") org.lwjgl.PointerBuffer r17) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L12
            r0 = r16
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
            r0 = r17
            r1 = 1
            org.lwjgl.system.Checks.checkSafe(r0, r1)
        L12:
            r0 = r12
            r1 = r14
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            r2 = r14
            int r2 = r2.remaining()
            long r2 = (long) r2
            r3 = r15
            r4 = r16
            long r4 = org.lwjgl.system.MemoryUtil.memAddress(r4)
            r5 = r17
            long r5 = org.lwjgl.system.MemoryUtil.memAddressSafe(r5)
            int r0 = nspvTextToBinaryWithOptions(r0, r1, r2, r3, r4, r5)
            return r0
    }

    @org.lwjgl.system.NativeType("spv_result_t")
    public static int spvTextToBinaryWithOptions(@org.lwjgl.system.NativeType("spv_const_context const") long r12, @org.lwjgl.system.NativeType("char const *") java.lang.CharSequence r14, @org.lwjgl.system.NativeType("uint32_t") int r15, @org.lwjgl.system.NativeType("spv_binary *") org.lwjgl.PointerBuffer r16, @org.lwjgl.system.NativeType("spv_diagnostic *") org.lwjgl.PointerBuffer r17) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L12
            r0 = r16
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
            r0 = r17
            r1 = 1
            org.lwjgl.system.Checks.checkSafe(r0, r1)
        L12:
            org.lwjgl.system.MemoryStack r0 = org.lwjgl.system.MemoryStack.stackGet()
            r18 = r0
            r0 = r18
            int r0 = r0.getPointer()
            r19 = r0
            r0 = r18
            r1 = r14
            r2 = 0
            int r0 = r0.nUTF8(r1, r2)     // Catch: java.lang.Throwable -> L4e
            r20 = r0
            r0 = r18
            long r0 = r0.getPointerAddress()     // Catch: java.lang.Throwable -> L4e
            r21 = r0
            r0 = r12
            r1 = r21
            r2 = r20
            long r2 = (long) r2     // Catch: java.lang.Throwable -> L4e
            r3 = r15
            r4 = r16
            long r4 = org.lwjgl.system.MemoryUtil.memAddress(r4)     // Catch: java.lang.Throwable -> L4e
            r5 = r17
            long r5 = org.lwjgl.system.MemoryUtil.memAddressSafe(r5)     // Catch: java.lang.Throwable -> L4e
            int r0 = nspvTextToBinaryWithOptions(r0, r1, r2, r3, r4, r5)     // Catch: java.lang.Throwable -> L4e
            r23 = r0
            r0 = r18
            r1 = r19
            r0.setPointer(r1)
            r0 = r23
            return r0
        L4e:
            r24 = move-exception
            r0 = r18
            r1 = r19
            r0.setPointer(r1)
            r0 = r24
            throw r0
    }

    public static void nspvTextDestroy(long r5) {
            long r0 = org.lwjgl.util.shaderc.SPV.Functions.TextDestroy
            r7 = r0
            r0 = r5
            r1 = r7
            org.lwjgl.system.JNI.invokePV(r0, r1)
            return
    }

    public static void spvTextDestroy(@org.lwjgl.system.NativeType("spv_text") org.lwjgl.util.shaderc.SPVText r3) {
            r0 = r3
            long r0 = org.lwjgl.system.MemoryUtil.memAddressSafe(r0)
            nspvTextDestroy(r0)
            return
    }

    public static int nspvBinaryToText(long r14, long r16, long r18, int r20, long r21, long r23) {
            long r0 = org.lwjgl.util.shaderc.SPV.Functions.BinaryToText
            r25 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L10
            r0 = r14
            long r0 = org.lwjgl.system.Checks.check(r0)
        L10:
            r0 = r14
            r1 = r16
            r2 = r18
            r3 = r20
            r4 = r21
            r5 = r23
            r6 = r25
            int r0 = org.lwjgl.system.JNI.invokePPPPPI(r0, r1, r2, r3, r4, r5, r6)
            return r0
    }

    @org.lwjgl.system.NativeType("spv_result_t")
    public static int spvBinaryToText(@org.lwjgl.system.NativeType("spv_const_context const") long r12, @org.lwjgl.system.NativeType("uint32_t const *") java.nio.IntBuffer r14, @org.lwjgl.system.NativeType("uint32_t") int r15, @org.lwjgl.system.NativeType("spv_text *") org.lwjgl.PointerBuffer r16, @org.lwjgl.system.NativeType("spv_diagnostic *") org.lwjgl.PointerBuffer r17) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L12
            r0 = r16
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
            r0 = r17
            r1 = 1
            org.lwjgl.system.Checks.checkSafe(r0, r1)
        L12:
            r0 = r12
            r1 = r14
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            r2 = r14
            int r2 = r2.remaining()
            long r2 = (long) r2
            r3 = r15
            r4 = r16
            long r4 = org.lwjgl.system.MemoryUtil.memAddress(r4)
            r5 = r17
            long r5 = org.lwjgl.system.MemoryUtil.memAddressSafe(r5)
            int r0 = nspvBinaryToText(r0, r1, r2, r3, r4, r5)
            return r0
    }

    public static void nspvBinaryDestroy(long r5) {
            long r0 = org.lwjgl.util.shaderc.SPV.Functions.BinaryDestroy
            r7 = r0
            r0 = r5
            r1 = r7
            org.lwjgl.system.JNI.invokePV(r0, r1)
            return
    }

    public static void spvBinaryDestroy(@org.lwjgl.system.NativeType("spv_binary") org.lwjgl.util.shaderc.SPVBinary r3) {
            r0 = r3
            long r0 = r0.address()
            nspvBinaryDestroy(r0)
            return
    }

    public static int nspvValidate(long r9, long r11, long r13) {
            long r0 = org.lwjgl.util.shaderc.SPV.Functions.Validate
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

    @org.lwjgl.system.NativeType("spv_result_t")
    public static int spvValidate(@org.lwjgl.system.NativeType("spv_const_context const") long r7, @org.lwjgl.system.NativeType("spv_const_binary const") org.lwjgl.util.shaderc.SPVBinary r9, @org.lwjgl.system.NativeType("spv_diagnostic *") org.lwjgl.PointerBuffer r10) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r10
            r1 = 1
            org.lwjgl.system.Checks.checkSafe(r0, r1)
        Lb:
            r0 = r7
            r1 = r9
            long r1 = r1.address()
            r2 = r10
            long r2 = org.lwjgl.system.MemoryUtil.memAddressSafe(r2)
            int r0 = nspvValidate(r0, r1, r2)
            return r0
    }

    public static int nspvValidateWithOptions(long r11, long r13, long r15, long r17) {
            long r0 = org.lwjgl.util.shaderc.SPV.Functions.ValidateWithOptions
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

    @org.lwjgl.system.NativeType("spv_result_t")
    public static int spvValidateWithOptions(@org.lwjgl.system.NativeType("spv_const_context const") long r9, @org.lwjgl.system.NativeType("spv_const_validator_options const") long r11, @org.lwjgl.system.NativeType("spv_const_binary const") org.lwjgl.util.shaderc.SPVBinary r13, @org.lwjgl.system.NativeType("spv_diagnostic *") org.lwjgl.PointerBuffer r14) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lc
            r0 = r14
            r1 = 1
            org.lwjgl.system.Checks.checkSafe(r0, r1)
        Lc:
            r0 = r9
            r1 = r11
            r2 = r13
            long r2 = r2.address()
            r3 = r14
            long r3 = org.lwjgl.system.MemoryUtil.memAddressSafe(r3)
            int r0 = nspvValidateWithOptions(r0, r1, r2, r3)
            return r0
    }

    public static int nspvValidateBinary(long r11, long r13, long r15, long r17) {
            long r0 = org.lwjgl.util.shaderc.SPV.Functions.ValidateBinary
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

    @org.lwjgl.system.NativeType("spv_result_t")
    public static int spvValidateBinary(@org.lwjgl.system.NativeType("spv_const_context const") long r9, @org.lwjgl.system.NativeType("uint32_t const *") java.nio.IntBuffer r11, @org.lwjgl.system.NativeType("spv_diagnostic *") org.lwjgl.PointerBuffer r12) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r12
            r1 = 1
            org.lwjgl.system.Checks.checkSafe(r0, r1)
        Lb:
            r0 = r9
            r1 = r11
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            r2 = r11
            int r2 = r2.remaining()
            long r2 = (long) r2
            r3 = r12
            long r3 = org.lwjgl.system.MemoryUtil.memAddressSafe(r3)
            int r0 = nspvValidateBinary(r0, r1, r2, r3)
            return r0
    }

    public static long nspvDiagnosticCreate(long r7, long r9) {
            long r0 = org.lwjgl.util.shaderc.SPV.Functions.DiagnosticCreate
            r11 = r0
            r0 = r7
            r1 = r9
            r2 = r11
            long r0 = org.lwjgl.system.JNI.invokePPP(r0, r1, r2)
            return r0
    }

    @org.lwjgl.system.NativeType("spv_diagnostic")
    public static org.lwjgl.util.shaderc.SPVDiagnostic spvDiagnosticCreate(@org.lwjgl.system.NativeType("spv_position const") org.lwjgl.util.shaderc.SPVPosition r5, @org.lwjgl.system.NativeType("char const *") java.nio.ByteBuffer r6) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto La
            r0 = r6
            org.lwjgl.system.Checks.checkNT1(r0)
        La:
            r0 = r5
            long r0 = r0.address()
            r1 = r6
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            long r0 = nspvDiagnosticCreate(r0, r1)
            r7 = r0
            r0 = r7
            org.lwjgl.util.shaderc.SPVDiagnostic r0 = org.lwjgl.util.shaderc.SPVDiagnostic.createSafe(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("spv_diagnostic")
    public static org.lwjgl.util.shaderc.SPVDiagnostic spvDiagnosticCreate(@org.lwjgl.system.NativeType("spv_position const") org.lwjgl.util.shaderc.SPVPosition r5, @org.lwjgl.system.NativeType("char const *") java.lang.CharSequence r6) {
            org.lwjgl.system.MemoryStack r0 = org.lwjgl.system.MemoryStack.stackGet()
            r7 = r0
            r0 = r7
            int r0 = r0.getPointer()
            r8 = r0
            r0 = r7
            r1 = r6
            r2 = 1
            int r0 = r0.nUTF8(r1, r2)     // Catch: java.lang.Throwable -> L30
            r0 = r7
            long r0 = r0.getPointerAddress()     // Catch: java.lang.Throwable -> L30
            r9 = r0
            r0 = r5
            long r0 = r0.address()     // Catch: java.lang.Throwable -> L30
            r1 = r9
            long r0 = nspvDiagnosticCreate(r0, r1)     // Catch: java.lang.Throwable -> L30
            r11 = r0
            r0 = r11
            org.lwjgl.util.shaderc.SPVDiagnostic r0 = org.lwjgl.util.shaderc.SPVDiagnostic.createSafe(r0)     // Catch: java.lang.Throwable -> L30
            r13 = r0
            r0 = r7
            r1 = r8
            r0.setPointer(r1)
            r0 = r13
            return r0
        L30:
            r14 = move-exception
            r0 = r7
            r1 = r8
            r0.setPointer(r1)
            r0 = r14
            throw r0
    }

    public static void nspvDiagnosticDestroy(long r5) {
            long r0 = org.lwjgl.util.shaderc.SPV.Functions.DiagnosticDestroy
            r7 = r0
            r0 = r5
            r1 = r7
            org.lwjgl.system.JNI.invokePV(r0, r1)
            return
    }

    public static void spvDiagnosticDestroy(@org.lwjgl.system.NativeType("spv_diagnostic") org.lwjgl.util.shaderc.SPVDiagnostic r3) {
            r0 = r3
            long r0 = r0.address()
            nspvDiagnosticDestroy(r0)
            return
    }

    public static int nspvDiagnosticPrint(long r5) {
            long r0 = org.lwjgl.util.shaderc.SPV.Functions.DiagnosticPrint
            r7 = r0
            r0 = r5
            r1 = r7
            int r0 = org.lwjgl.system.JNI.invokePI(r0, r1)
            return r0
    }

    @org.lwjgl.system.NativeType("spv_result_t")
    public static int spvDiagnosticPrint(@org.lwjgl.system.NativeType("spv_diagnostic const") org.lwjgl.util.shaderc.SPVDiagnostic r3) {
            r0 = r3
            long r0 = r0.address()
            int r0 = nspvDiagnosticPrint(r0)
            return r0
    }

    public static long nspvOpcodeString(int r4) {
            long r0 = org.lwjgl.util.shaderc.SPV.Functions.OpcodeString
            r5 = r0
            r0 = r4
            r1 = r5
            long r0 = org.lwjgl.system.JNI.invokeP(r0, r1)
            return r0
    }

    @org.lwjgl.system.NativeType("char const *")
    public static java.lang.String spvOpcodeString(@org.lwjgl.system.NativeType("uint32_t const") int r3) {
            r0 = r3
            long r0 = nspvOpcodeString(r0)
            r4 = r0
            r0 = r4
            java.lang.String r0 = org.lwjgl.system.MemoryUtil.memASCIISafe(r0)
            return r0
    }

    public static int nspvBinaryParse(long r17, long r19, long r21, long r23, long r25, long r27, long r29) {
            long r0 = org.lwjgl.util.shaderc.SPV.Functions.BinaryParse
            r31 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L10
            r0 = r17
            long r0 = org.lwjgl.system.Checks.check(r0)
        L10:
            r0 = r17
            r1 = r19
            r2 = r21
            r3 = r23
            r4 = r25
            r5 = r27
            r6 = r29
            r7 = r31
            int r0 = org.lwjgl.system.JNI.invokePPPPPPPI(r0, r1, r2, r3, r4, r5, r6, r7)
            return r0
    }

    @org.lwjgl.system.NativeType("spv_result_t")
    public static int spvBinaryParse(@org.lwjgl.system.NativeType("spv_const_context const") long r15, @org.lwjgl.system.NativeType("void *") long r17, @org.lwjgl.system.NativeType("uint32_t const *") java.nio.IntBuffer r19, @org.lwjgl.system.NativeType("spv_parsed_header_fn_t") org.lwjgl.util.shaderc.SPVParsedHeaderFnI r20, @org.lwjgl.system.NativeType("spv_parsed_instruction_fn_t") org.lwjgl.util.shaderc.SPVParsedInstructionFnI r21, @org.lwjgl.system.NativeType("spv_diagnostic *") org.lwjgl.PointerBuffer r22) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lc
            r0 = r22
            r1 = 1
            org.lwjgl.system.Checks.checkSafe(r0, r1)
        Lc:
            r0 = r15
            r1 = r17
            r2 = r19
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            r3 = r19
            int r3 = r3.remaining()
            long r3 = (long) r3
            r4 = r20
            long r4 = org.lwjgl.system.MemoryUtil.memAddressSafe(r4)
            r5 = r21
            long r5 = org.lwjgl.system.MemoryUtil.memAddressSafe(r5)
            r6 = r22
            long r6 = org.lwjgl.system.MemoryUtil.memAddressSafe(r6)
            int r0 = nspvBinaryParse(r0, r1, r2, r3, r4, r5, r6)
            return r0
    }

    static /* synthetic */ org.lwjgl.system.SharedLibrary access$000() {
            org.lwjgl.system.SharedLibrary r0 = org.lwjgl.util.shaderc.SPV.SHADERC
            return r0
    }

    static {
            java.lang.Class<org.lwjgl.util.shaderc.SPV> r0 = org.lwjgl.util.shaderc.SPV.class
            java.lang.String r1 = "org.lwjgl.shaderc"
            org.lwjgl.system.Configuration r2 = org.lwjgl.system.Configuration.SPIRV_TOOLS_LIBRARY_NAME
            void r3 = org.lwjgl.util.shaderc.Shaderc::getLibrary
            r4 = 0
            java.lang.String[] r4 = new java.lang.String[r4]
            org.lwjgl.system.SharedLibrary r0 = org.lwjgl.system.Library.loadNative(r0, r1, r2, r3, r4)
            org.lwjgl.util.shaderc.SPV.SHADERC = r0
            return
    }
}
