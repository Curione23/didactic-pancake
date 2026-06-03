package org.lwjgl.opengl;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/opengl/GL43.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/opengl/GL43.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/opengl/GL43.class */
public class GL43 extends org.lwjgl.opengl.GL42 {
    public static final int GL_NUM_SHADING_LANGUAGE_VERSIONS = 33513;
    public static final int GL_VERTEX_ATTRIB_ARRAY_LONG = 34638;
    public static final int GL_COMPRESSED_RGB8_ETC2 = 37492;
    public static final int GL_COMPRESSED_SRGB8_ETC2 = 37493;
    public static final int GL_COMPRESSED_RGB8_PUNCHTHROUGH_ALPHA1_ETC2 = 37494;
    public static final int GL_COMPRESSED_SRGB8_PUNCHTHROUGH_ALPHA1_ETC2 = 37495;
    public static final int GL_COMPRESSED_RGBA8_ETC2_EAC = 37496;
    public static final int GL_COMPRESSED_SRGB8_ALPHA8_ETC2_EAC = 37497;
    public static final int GL_COMPRESSED_R11_EAC = 37488;
    public static final int GL_COMPRESSED_SIGNED_R11_EAC = 37489;
    public static final int GL_COMPRESSED_RG11_EAC = 37490;
    public static final int GL_COMPRESSED_SIGNED_RG11_EAC = 37491;
    public static final int GL_PRIMITIVE_RESTART_FIXED_INDEX = 36201;
    public static final int GL_ANY_SAMPLES_PASSED_CONSERVATIVE = 36202;
    public static final int GL_MAX_ELEMENT_INDEX = 36203;
    public static final int GL_TEXTURE_IMMUTABLE_LEVELS = 33503;
    public static final int GL_COMPUTE_SHADER = 37305;
    public static final int GL_MAX_COMPUTE_UNIFORM_BLOCKS = 37307;
    public static final int GL_MAX_COMPUTE_TEXTURE_IMAGE_UNITS = 37308;
    public static final int GL_MAX_COMPUTE_IMAGE_UNIFORMS = 37309;
    public static final int GL_MAX_COMPUTE_SHARED_MEMORY_SIZE = 33378;
    public static final int GL_MAX_COMPUTE_UNIFORM_COMPONENTS = 33379;
    public static final int GL_MAX_COMPUTE_ATOMIC_COUNTER_BUFFERS = 33380;
    public static final int GL_MAX_COMPUTE_ATOMIC_COUNTERS = 33381;
    public static final int GL_MAX_COMBINED_COMPUTE_UNIFORM_COMPONENTS = 33382;
    public static final int GL_MAX_COMPUTE_WORK_GROUP_INVOCATIONS = 37099;
    public static final int GL_MAX_COMPUTE_WORK_GROUP_COUNT = 37310;
    public static final int GL_MAX_COMPUTE_WORK_GROUP_SIZE = 37311;
    public static final int GL_COMPUTE_WORK_GROUP_SIZE = 33383;
    public static final int GL_UNIFORM_BLOCK_REFERENCED_BY_COMPUTE_SHADER = 37100;
    public static final int GL_ATOMIC_COUNTER_BUFFER_REFERENCED_BY_COMPUTE_SHADER = 37101;
    public static final int GL_DISPATCH_INDIRECT_BUFFER = 37102;
    public static final int GL_DISPATCH_INDIRECT_BUFFER_BINDING = 37103;
    public static final int GL_COMPUTE_SHADER_BIT = 32;
    public static final int GL_DEBUG_OUTPUT = 37600;
    public static final int GL_DEBUG_OUTPUT_SYNCHRONOUS = 33346;
    public static final int GL_CONTEXT_FLAG_DEBUG_BIT = 2;
    public static final int GL_MAX_DEBUG_MESSAGE_LENGTH = 37187;
    public static final int GL_MAX_DEBUG_LOGGED_MESSAGES = 37188;
    public static final int GL_DEBUG_LOGGED_MESSAGES = 37189;
    public static final int GL_DEBUG_NEXT_LOGGED_MESSAGE_LENGTH = 33347;
    public static final int GL_MAX_DEBUG_GROUP_STACK_DEPTH = 33388;
    public static final int GL_DEBUG_GROUP_STACK_DEPTH = 33389;
    public static final int GL_MAX_LABEL_LENGTH = 33512;
    public static final int GL_DEBUG_CALLBACK_FUNCTION = 33348;
    public static final int GL_DEBUG_CALLBACK_USER_PARAM = 33349;
    public static final int GL_DEBUG_SOURCE_API = 33350;
    public static final int GL_DEBUG_SOURCE_WINDOW_SYSTEM = 33351;
    public static final int GL_DEBUG_SOURCE_SHADER_COMPILER = 33352;
    public static final int GL_DEBUG_SOURCE_THIRD_PARTY = 33353;
    public static final int GL_DEBUG_SOURCE_APPLICATION = 33354;
    public static final int GL_DEBUG_SOURCE_OTHER = 33355;
    public static final int GL_DEBUG_TYPE_ERROR = 33356;
    public static final int GL_DEBUG_TYPE_DEPRECATED_BEHAVIOR = 33357;
    public static final int GL_DEBUG_TYPE_UNDEFINED_BEHAVIOR = 33358;
    public static final int GL_DEBUG_TYPE_PORTABILITY = 33359;
    public static final int GL_DEBUG_TYPE_PERFORMANCE = 33360;
    public static final int GL_DEBUG_TYPE_OTHER = 33361;
    public static final int GL_DEBUG_TYPE_MARKER = 33384;
    public static final int GL_DEBUG_TYPE_PUSH_GROUP = 33385;
    public static final int GL_DEBUG_TYPE_POP_GROUP = 33386;
    public static final int GL_DEBUG_SEVERITY_HIGH = 37190;
    public static final int GL_DEBUG_SEVERITY_MEDIUM = 37191;
    public static final int GL_DEBUG_SEVERITY_LOW = 37192;
    public static final int GL_DEBUG_SEVERITY_NOTIFICATION = 33387;
    public static final int GL_BUFFER = 33504;
    public static final int GL_SHADER = 33505;
    public static final int GL_PROGRAM = 33506;
    public static final int GL_QUERY = 33507;
    public static final int GL_PROGRAM_PIPELINE = 33508;
    public static final int GL_SAMPLER = 33510;
    public static final int GL_DISPLAY_LIST = 33511;
    public static final int GL_MAX_UNIFORM_LOCATIONS = 33390;
    public static final int GL_FRAMEBUFFER_DEFAULT_WIDTH = 37648;
    public static final int GL_FRAMEBUFFER_DEFAULT_HEIGHT = 37649;
    public static final int GL_FRAMEBUFFER_DEFAULT_LAYERS = 37650;
    public static final int GL_FRAMEBUFFER_DEFAULT_SAMPLES = 37651;
    public static final int GL_FRAMEBUFFER_DEFAULT_FIXED_SAMPLE_LOCATIONS = 37652;
    public static final int GL_MAX_FRAMEBUFFER_WIDTH = 37653;
    public static final int GL_MAX_FRAMEBUFFER_HEIGHT = 37654;
    public static final int GL_MAX_FRAMEBUFFER_LAYERS = 37655;
    public static final int GL_MAX_FRAMEBUFFER_SAMPLES = 37656;
    public static final int GL_INTERNALFORMAT_SUPPORTED = 33391;
    public static final int GL_INTERNALFORMAT_PREFERRED = 33392;
    public static final int GL_INTERNALFORMAT_RED_SIZE = 33393;
    public static final int GL_INTERNALFORMAT_GREEN_SIZE = 33394;
    public static final int GL_INTERNALFORMAT_BLUE_SIZE = 33395;
    public static final int GL_INTERNALFORMAT_ALPHA_SIZE = 33396;
    public static final int GL_INTERNALFORMAT_DEPTH_SIZE = 33397;
    public static final int GL_INTERNALFORMAT_STENCIL_SIZE = 33398;
    public static final int GL_INTERNALFORMAT_SHARED_SIZE = 33399;
    public static final int GL_INTERNALFORMAT_RED_TYPE = 33400;
    public static final int GL_INTERNALFORMAT_GREEN_TYPE = 33401;
    public static final int GL_INTERNALFORMAT_BLUE_TYPE = 33402;
    public static final int GL_INTERNALFORMAT_ALPHA_TYPE = 33403;
    public static final int GL_INTERNALFORMAT_DEPTH_TYPE = 33404;
    public static final int GL_INTERNALFORMAT_STENCIL_TYPE = 33405;
    public static final int GL_MAX_WIDTH = 33406;
    public static final int GL_MAX_HEIGHT = 33407;
    public static final int GL_MAX_DEPTH = 33408;
    public static final int GL_MAX_LAYERS = 33409;
    public static final int GL_MAX_COMBINED_DIMENSIONS = 33410;
    public static final int GL_COLOR_COMPONENTS = 33411;
    public static final int GL_DEPTH_COMPONENTS = 33412;
    public static final int GL_STENCIL_COMPONENTS = 33413;
    public static final int GL_COLOR_RENDERABLE = 33414;
    public static final int GL_DEPTH_RENDERABLE = 33415;
    public static final int GL_STENCIL_RENDERABLE = 33416;
    public static final int GL_FRAMEBUFFER_RENDERABLE = 33417;
    public static final int GL_FRAMEBUFFER_RENDERABLE_LAYERED = 33418;
    public static final int GL_FRAMEBUFFER_BLEND = 33419;
    public static final int GL_READ_PIXELS = 33420;
    public static final int GL_READ_PIXELS_FORMAT = 33421;
    public static final int GL_READ_PIXELS_TYPE = 33422;
    public static final int GL_TEXTURE_IMAGE_FORMAT = 33423;
    public static final int GL_TEXTURE_IMAGE_TYPE = 33424;
    public static final int GL_GET_TEXTURE_IMAGE_FORMAT = 33425;
    public static final int GL_GET_TEXTURE_IMAGE_TYPE = 33426;
    public static final int GL_MIPMAP = 33427;
    public static final int GL_MANUAL_GENERATE_MIPMAP = 33428;
    public static final int GL_AUTO_GENERATE_MIPMAP = 33429;
    public static final int GL_COLOR_ENCODING = 33430;
    public static final int GL_SRGB_READ = 33431;
    public static final int GL_SRGB_WRITE = 33432;
    public static final int GL_FILTER = 33434;
    public static final int GL_VERTEX_TEXTURE = 33435;
    public static final int GL_TESS_CONTROL_TEXTURE = 33436;
    public static final int GL_TESS_EVALUATION_TEXTURE = 33437;
    public static final int GL_GEOMETRY_TEXTURE = 33438;
    public static final int GL_FRAGMENT_TEXTURE = 33439;
    public static final int GL_COMPUTE_TEXTURE = 33440;
    public static final int GL_TEXTURE_SHADOW = 33441;
    public static final int GL_TEXTURE_GATHER = 33442;
    public static final int GL_TEXTURE_GATHER_SHADOW = 33443;
    public static final int GL_SHADER_IMAGE_LOAD = 33444;
    public static final int GL_SHADER_IMAGE_STORE = 33445;
    public static final int GL_SHADER_IMAGE_ATOMIC = 33446;
    public static final int GL_IMAGE_TEXEL_SIZE = 33447;
    public static final int GL_IMAGE_COMPATIBILITY_CLASS = 33448;
    public static final int GL_IMAGE_PIXEL_FORMAT = 33449;
    public static final int GL_IMAGE_PIXEL_TYPE = 33450;
    public static final int GL_SIMULTANEOUS_TEXTURE_AND_DEPTH_TEST = 33452;
    public static final int GL_SIMULTANEOUS_TEXTURE_AND_STENCIL_TEST = 33453;
    public static final int GL_SIMULTANEOUS_TEXTURE_AND_DEPTH_WRITE = 33454;
    public static final int GL_SIMULTANEOUS_TEXTURE_AND_STENCIL_WRITE = 33455;
    public static final int GL_TEXTURE_COMPRESSED_BLOCK_WIDTH = 33457;
    public static final int GL_TEXTURE_COMPRESSED_BLOCK_HEIGHT = 33458;
    public static final int GL_TEXTURE_COMPRESSED_BLOCK_SIZE = 33459;
    public static final int GL_CLEAR_BUFFER = 33460;
    public static final int GL_TEXTURE_VIEW = 33461;
    public static final int GL_VIEW_COMPATIBILITY_CLASS = 33462;
    public static final int GL_FULL_SUPPORT = 33463;
    public static final int GL_CAVEAT_SUPPORT = 33464;
    public static final int GL_IMAGE_CLASS_4_X_32 = 33465;
    public static final int GL_IMAGE_CLASS_2_X_32 = 33466;
    public static final int GL_IMAGE_CLASS_1_X_32 = 33467;
    public static final int GL_IMAGE_CLASS_4_X_16 = 33468;
    public static final int GL_IMAGE_CLASS_2_X_16 = 33469;
    public static final int GL_IMAGE_CLASS_1_X_16 = 33470;
    public static final int GL_IMAGE_CLASS_4_X_8 = 33471;
    public static final int GL_IMAGE_CLASS_2_X_8 = 33472;
    public static final int GL_IMAGE_CLASS_1_X_8 = 33473;
    public static final int GL_IMAGE_CLASS_11_11_10 = 33474;
    public static final int GL_IMAGE_CLASS_10_10_10_2 = 33475;
    public static final int GL_VIEW_CLASS_128_BITS = 33476;
    public static final int GL_VIEW_CLASS_96_BITS = 33477;
    public static final int GL_VIEW_CLASS_64_BITS = 33478;
    public static final int GL_VIEW_CLASS_48_BITS = 33479;
    public static final int GL_VIEW_CLASS_32_BITS = 33480;
    public static final int GL_VIEW_CLASS_24_BITS = 33481;
    public static final int GL_VIEW_CLASS_16_BITS = 33482;
    public static final int GL_VIEW_CLASS_8_BITS = 33483;
    public static final int GL_VIEW_CLASS_S3TC_DXT1_RGB = 33484;
    public static final int GL_VIEW_CLASS_S3TC_DXT1_RGBA = 33485;
    public static final int GL_VIEW_CLASS_S3TC_DXT3_RGBA = 33486;
    public static final int GL_VIEW_CLASS_S3TC_DXT5_RGBA = 33487;
    public static final int GL_VIEW_CLASS_RGTC1_RED = 33488;
    public static final int GL_VIEW_CLASS_RGTC2_RG = 33489;
    public static final int GL_VIEW_CLASS_BPTC_UNORM = 33490;
    public static final int GL_VIEW_CLASS_BPTC_FLOAT = 33491;
    public static final int GL_UNIFORM = 37601;
    public static final int GL_UNIFORM_BLOCK = 37602;
    public static final int GL_PROGRAM_INPUT = 37603;
    public static final int GL_PROGRAM_OUTPUT = 37604;
    public static final int GL_BUFFER_VARIABLE = 37605;
    public static final int GL_SHADER_STORAGE_BLOCK = 37606;
    public static final int GL_VERTEX_SUBROUTINE = 37608;
    public static final int GL_TESS_CONTROL_SUBROUTINE = 37609;
    public static final int GL_TESS_EVALUATION_SUBROUTINE = 37610;
    public static final int GL_GEOMETRY_SUBROUTINE = 37611;
    public static final int GL_FRAGMENT_SUBROUTINE = 37612;
    public static final int GL_COMPUTE_SUBROUTINE = 37613;
    public static final int GL_VERTEX_SUBROUTINE_UNIFORM = 37614;
    public static final int GL_TESS_CONTROL_SUBROUTINE_UNIFORM = 37615;
    public static final int GL_TESS_EVALUATION_SUBROUTINE_UNIFORM = 37616;
    public static final int GL_GEOMETRY_SUBROUTINE_UNIFORM = 37617;
    public static final int GL_FRAGMENT_SUBROUTINE_UNIFORM = 37618;
    public static final int GL_COMPUTE_SUBROUTINE_UNIFORM = 37619;
    public static final int GL_TRANSFORM_FEEDBACK_VARYING = 37620;
    public static final int GL_ACTIVE_RESOURCES = 37621;
    public static final int GL_MAX_NAME_LENGTH = 37622;
    public static final int GL_MAX_NUM_ACTIVE_VARIABLES = 37623;
    public static final int GL_MAX_NUM_COMPATIBLE_SUBROUTINES = 37624;
    public static final int GL_NAME_LENGTH = 37625;
    public static final int GL_TYPE = 37626;
    public static final int GL_ARRAY_SIZE = 37627;
    public static final int GL_OFFSET = 37628;
    public static final int GL_BLOCK_INDEX = 37629;
    public static final int GL_ARRAY_STRIDE = 37630;
    public static final int GL_MATRIX_STRIDE = 37631;
    public static final int GL_IS_ROW_MAJOR = 37632;
    public static final int GL_ATOMIC_COUNTER_BUFFER_INDEX = 37633;
    public static final int GL_BUFFER_BINDING = 37634;
    public static final int GL_BUFFER_DATA_SIZE = 37635;
    public static final int GL_NUM_ACTIVE_VARIABLES = 37636;
    public static final int GL_ACTIVE_VARIABLES = 37637;
    public static final int GL_REFERENCED_BY_VERTEX_SHADER = 37638;
    public static final int GL_REFERENCED_BY_TESS_CONTROL_SHADER = 37639;
    public static final int GL_REFERENCED_BY_TESS_EVALUATION_SHADER = 37640;
    public static final int GL_REFERENCED_BY_GEOMETRY_SHADER = 37641;
    public static final int GL_REFERENCED_BY_FRAGMENT_SHADER = 37642;
    public static final int GL_REFERENCED_BY_COMPUTE_SHADER = 37643;
    public static final int GL_TOP_LEVEL_ARRAY_SIZE = 37644;
    public static final int GL_TOP_LEVEL_ARRAY_STRIDE = 37645;
    public static final int GL_LOCATION = 37646;
    public static final int GL_LOCATION_INDEX = 37647;
    public static final int GL_IS_PER_PATCH = 37607;
    public static final int GL_SHADER_STORAGE_BUFFER = 37074;
    public static final int GL_SHADER_STORAGE_BUFFER_BINDING = 37075;
    public static final int GL_SHADER_STORAGE_BUFFER_START = 37076;
    public static final int GL_SHADER_STORAGE_BUFFER_SIZE = 37077;
    public static final int GL_MAX_VERTEX_SHADER_STORAGE_BLOCKS = 37078;
    public static final int GL_MAX_GEOMETRY_SHADER_STORAGE_BLOCKS = 37079;
    public static final int GL_MAX_TESS_CONTROL_SHADER_STORAGE_BLOCKS = 37080;
    public static final int GL_MAX_TESS_EVALUATION_SHADER_STORAGE_BLOCKS = 37081;
    public static final int GL_MAX_FRAGMENT_SHADER_STORAGE_BLOCKS = 37082;
    public static final int GL_MAX_COMPUTE_SHADER_STORAGE_BLOCKS = 37083;
    public static final int GL_MAX_COMBINED_SHADER_STORAGE_BLOCKS = 37084;
    public static final int GL_MAX_SHADER_STORAGE_BUFFER_BINDINGS = 37085;
    public static final int GL_MAX_SHADER_STORAGE_BLOCK_SIZE = 37086;
    public static final int GL_SHADER_STORAGE_BUFFER_OFFSET_ALIGNMENT = 37087;
    public static final int GL_SHADER_STORAGE_BARRIER_BIT = 8192;
    public static final int GL_MAX_COMBINED_SHADER_OUTPUT_RESOURCES = 36665;
    public static final int GL_DEPTH_STENCIL_TEXTURE_MODE = 37098;
    public static final int GL_TEXTURE_BUFFER_OFFSET = 37277;
    public static final int GL_TEXTURE_BUFFER_SIZE = 37278;
    public static final int GL_TEXTURE_BUFFER_OFFSET_ALIGNMENT = 37279;
    public static final int GL_TEXTURE_VIEW_MIN_LEVEL = 33499;
    public static final int GL_TEXTURE_VIEW_NUM_LEVELS = 33500;
    public static final int GL_TEXTURE_VIEW_MIN_LAYER = 33501;
    public static final int GL_TEXTURE_VIEW_NUM_LAYERS = 33502;
    public static final int GL_VERTEX_ATTRIB_BINDING = 33492;
    public static final int GL_VERTEX_ATTRIB_RELATIVE_OFFSET = 33493;
    public static final int GL_VERTEX_BINDING_DIVISOR = 33494;
    public static final int GL_VERTEX_BINDING_OFFSET = 33495;
    public static final int GL_VERTEX_BINDING_STRIDE = 33496;
    public static final int GL_VERTEX_BINDING_BUFFER = 36687;
    public static final int GL_MAX_VERTEX_ATTRIB_RELATIVE_OFFSET = 33497;
    public static final int GL_MAX_VERTEX_ATTRIB_BINDINGS = 33498;

    protected GL43() {
            r3 = this;
            r0 = r3
            r0.<init>()
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r1 = r0
            r1.<init>()
            throw r0
    }

    public static void nglClearBufferData(int r7, int r8, int r9, int r10, long r11) {
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            org.lwjgl.opengl.GL43C.nglClearBufferData(r0, r1, r2, r3, r4)
            return
    }

    public static void glClearBufferData(@org.lwjgl.system.NativeType("GLenum") int r6, @org.lwjgl.system.NativeType("GLenum") int r7, @org.lwjgl.system.NativeType("GLenum") int r8, @org.lwjgl.system.NativeType("GLenum") int r9, @javax.annotation.Nullable @org.lwjgl.system.NativeType("void const *") java.nio.ByteBuffer r10) {
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            org.lwjgl.opengl.GL43C.glClearBufferData(r0, r1, r2, r3, r4)
            return
    }

    public static void glClearBufferData(@org.lwjgl.system.NativeType("GLenum") int r6, @org.lwjgl.system.NativeType("GLenum") int r7, @org.lwjgl.system.NativeType("GLenum") int r8, @org.lwjgl.system.NativeType("GLenum") int r9, @javax.annotation.Nullable @org.lwjgl.system.NativeType("void const *") java.nio.ShortBuffer r10) {
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            org.lwjgl.opengl.GL43C.glClearBufferData(r0, r1, r2, r3, r4)
            return
    }

    public static void glClearBufferData(@org.lwjgl.system.NativeType("GLenum") int r6, @org.lwjgl.system.NativeType("GLenum") int r7, @org.lwjgl.system.NativeType("GLenum") int r8, @org.lwjgl.system.NativeType("GLenum") int r9, @javax.annotation.Nullable @org.lwjgl.system.NativeType("void const *") java.nio.IntBuffer r10) {
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            org.lwjgl.opengl.GL43C.glClearBufferData(r0, r1, r2, r3, r4)
            return
    }

    public static void glClearBufferData(@org.lwjgl.system.NativeType("GLenum") int r6, @org.lwjgl.system.NativeType("GLenum") int r7, @org.lwjgl.system.NativeType("GLenum") int r8, @org.lwjgl.system.NativeType("GLenum") int r9, @javax.annotation.Nullable @org.lwjgl.system.NativeType("void const *") java.nio.FloatBuffer r10) {
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            org.lwjgl.opengl.GL43C.glClearBufferData(r0, r1, r2, r3, r4)
            return
    }

    public static void nglClearBufferSubData(int r11, int r12, long r13, long r15, int r17, int r18, long r19) {
            r0 = r11
            r1 = r12
            r2 = r13
            r3 = r15
            r4 = r17
            r5 = r18
            r6 = r19
            org.lwjgl.opengl.GL43C.nglClearBufferSubData(r0, r1, r2, r3, r4, r5, r6)
            return
    }

    public static void glClearBufferSubData(@org.lwjgl.system.NativeType("GLenum") int r10, @org.lwjgl.system.NativeType("GLenum") int r11, @org.lwjgl.system.NativeType("GLintptr") long r12, @org.lwjgl.system.NativeType("GLsizeiptr") long r14, @org.lwjgl.system.NativeType("GLenum") int r16, @org.lwjgl.system.NativeType("GLenum") int r17, @javax.annotation.Nullable @org.lwjgl.system.NativeType("void const *") java.nio.ByteBuffer r18) {
            r0 = r10
            r1 = r11
            r2 = r12
            r3 = r14
            r4 = r16
            r5 = r17
            r6 = r18
            org.lwjgl.opengl.GL43C.glClearBufferSubData(r0, r1, r2, r3, r4, r5, r6)
            return
    }

    public static void glClearBufferSubData(@org.lwjgl.system.NativeType("GLenum") int r10, @org.lwjgl.system.NativeType("GLenum") int r11, @org.lwjgl.system.NativeType("GLintptr") long r12, @org.lwjgl.system.NativeType("GLsizeiptr") long r14, @org.lwjgl.system.NativeType("GLenum") int r16, @org.lwjgl.system.NativeType("GLenum") int r17, @javax.annotation.Nullable @org.lwjgl.system.NativeType("void const *") java.nio.ShortBuffer r18) {
            r0 = r10
            r1 = r11
            r2 = r12
            r3 = r14
            r4 = r16
            r5 = r17
            r6 = r18
            org.lwjgl.opengl.GL43C.glClearBufferSubData(r0, r1, r2, r3, r4, r5, r6)
            return
    }

    public static void glClearBufferSubData(@org.lwjgl.system.NativeType("GLenum") int r10, @org.lwjgl.system.NativeType("GLenum") int r11, @org.lwjgl.system.NativeType("GLintptr") long r12, @org.lwjgl.system.NativeType("GLsizeiptr") long r14, @org.lwjgl.system.NativeType("GLenum") int r16, @org.lwjgl.system.NativeType("GLenum") int r17, @javax.annotation.Nullable @org.lwjgl.system.NativeType("void const *") java.nio.IntBuffer r18) {
            r0 = r10
            r1 = r11
            r2 = r12
            r3 = r14
            r4 = r16
            r5 = r17
            r6 = r18
            org.lwjgl.opengl.GL43C.glClearBufferSubData(r0, r1, r2, r3, r4, r5, r6)
            return
    }

    public static void glClearBufferSubData(@org.lwjgl.system.NativeType("GLenum") int r10, @org.lwjgl.system.NativeType("GLenum") int r11, @org.lwjgl.system.NativeType("GLintptr") long r12, @org.lwjgl.system.NativeType("GLsizeiptr") long r14, @org.lwjgl.system.NativeType("GLenum") int r16, @org.lwjgl.system.NativeType("GLenum") int r17, @javax.annotation.Nullable @org.lwjgl.system.NativeType("void const *") java.nio.FloatBuffer r18) {
            r0 = r10
            r1 = r11
            r2 = r12
            r3 = r14
            r4 = r16
            r5 = r17
            r6 = r18
            org.lwjgl.opengl.GL43C.glClearBufferSubData(r0, r1, r2, r3, r4, r5, r6)
            return
    }

    public static void glDispatchCompute(@org.lwjgl.system.NativeType("GLuint") int r4, @org.lwjgl.system.NativeType("GLuint") int r5, @org.lwjgl.system.NativeType("GLuint") int r6) {
            r0 = r4
            r1 = r5
            r2 = r6
            org.lwjgl.opengl.GL43C.glDispatchCompute(r0, r1, r2)
            return
    }

    public static void glDispatchComputeIndirect(@org.lwjgl.system.NativeType("GLintptr") long r3) {
            r0 = r3
            org.lwjgl.opengl.GL43C.glDispatchComputeIndirect(r0)
            return
    }

    public static void glCopyImageSubData(@org.lwjgl.system.NativeType("GLuint") int r16, @org.lwjgl.system.NativeType("GLenum") int r17, @org.lwjgl.system.NativeType("GLint") int r18, @org.lwjgl.system.NativeType("GLint") int r19, @org.lwjgl.system.NativeType("GLint") int r20, @org.lwjgl.system.NativeType("GLint") int r21, @org.lwjgl.system.NativeType("GLuint") int r22, @org.lwjgl.system.NativeType("GLenum") int r23, @org.lwjgl.system.NativeType("GLint") int r24, @org.lwjgl.system.NativeType("GLint") int r25, @org.lwjgl.system.NativeType("GLint") int r26, @org.lwjgl.system.NativeType("GLint") int r27, @org.lwjgl.system.NativeType("GLsizei") int r28, @org.lwjgl.system.NativeType("GLsizei") int r29, @org.lwjgl.system.NativeType("GLsizei") int r30) {
            r0 = r16
            r1 = r17
            r2 = r18
            r3 = r19
            r4 = r20
            r5 = r21
            r6 = r22
            r7 = r23
            r8 = r24
            r9 = r25
            r10 = r26
            r11 = r27
            r12 = r28
            r13 = r29
            r14 = r30
            org.lwjgl.opengl.GL43C.glCopyImageSubData(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            return
    }

    public static void nglDebugMessageControl(int r8, int r9, int r10, int r11, long r12, boolean r14) {
            r0 = r8
            r1 = r9
            r2 = r10
            r3 = r11
            r4 = r12
            r5 = r14
            org.lwjgl.opengl.GL43C.nglDebugMessageControl(r0, r1, r2, r3, r4, r5)
            return
    }

    public static void glDebugMessageControl(@org.lwjgl.system.NativeType("GLenum") int r6, @org.lwjgl.system.NativeType("GLenum") int r7, @org.lwjgl.system.NativeType("GLenum") int r8, @javax.annotation.Nullable @org.lwjgl.system.NativeType("GLuint const *") java.nio.IntBuffer r9, @org.lwjgl.system.NativeType("GLboolean") boolean r10) {
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            org.lwjgl.opengl.GL43C.glDebugMessageControl(r0, r1, r2, r3, r4)
            return
    }

    public static void glDebugMessageControl(@org.lwjgl.system.NativeType("GLenum") int r6, @org.lwjgl.system.NativeType("GLenum") int r7, @org.lwjgl.system.NativeType("GLenum") int r8, @org.lwjgl.system.NativeType("GLuint const *") int r9, @org.lwjgl.system.NativeType("GLboolean") boolean r10) {
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            org.lwjgl.opengl.GL43C.glDebugMessageControl(r0, r1, r2, r3, r4)
            return
    }

    public static void nglDebugMessageInsert(int r8, int r9, int r10, int r11, int r12, long r13) {
            r0 = r8
            r1 = r9
            r2 = r10
            r3 = r11
            r4 = r12
            r5 = r13
            org.lwjgl.opengl.GL43C.nglDebugMessageInsert(r0, r1, r2, r3, r4, r5)
            return
    }

    public static void glDebugMessageInsert(@org.lwjgl.system.NativeType("GLenum") int r6, @org.lwjgl.system.NativeType("GLenum") int r7, @org.lwjgl.system.NativeType("GLuint") int r8, @org.lwjgl.system.NativeType("GLenum") int r9, @org.lwjgl.system.NativeType("GLchar const *") java.nio.ByteBuffer r10) {
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            org.lwjgl.opengl.GL43C.glDebugMessageInsert(r0, r1, r2, r3, r4)
            return
    }

    public static void glDebugMessageInsert(@org.lwjgl.system.NativeType("GLenum") int r6, @org.lwjgl.system.NativeType("GLenum") int r7, @org.lwjgl.system.NativeType("GLuint") int r8, @org.lwjgl.system.NativeType("GLenum") int r9, @org.lwjgl.system.NativeType("GLchar const *") java.lang.CharSequence r10) {
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            org.lwjgl.opengl.GL43C.glDebugMessageInsert(r0, r1, r2, r3, r4)
            return
    }

    public static void nglDebugMessageCallback(long r5, long r7) {
            r0 = r5
            r1 = r7
            org.lwjgl.opengl.GL43C.nglDebugMessageCallback(r0, r1)
            return
    }

    public static void glDebugMessageCallback(@javax.annotation.Nullable @org.lwjgl.system.NativeType("GLDEBUGPROC") org.lwjgl.opengl.GLDebugMessageCallbackI r4, @org.lwjgl.system.NativeType("void const *") long r5) {
            r0 = r4
            r1 = r5
            org.lwjgl.opengl.GL43C.glDebugMessageCallback(r0, r1)
            return
    }

    public static int nglGetDebugMessageLog(int r15, int r16, long r17, long r19, long r21, long r23, long r25, long r27) {
            r0 = r15
            r1 = r16
            r2 = r17
            r3 = r19
            r4 = r21
            r5 = r23
            r6 = r25
            r7 = r27
            int r0 = org.lwjgl.opengl.GL43C.nglGetDebugMessageLog(r0, r1, r2, r3, r4, r5, r6, r7)
            return r0
    }

    @org.lwjgl.system.NativeType("GLuint")
    public static int glGetDebugMessageLog(@org.lwjgl.system.NativeType("GLuint") int r8, @javax.annotation.Nullable @org.lwjgl.system.NativeType("GLenum *") java.nio.IntBuffer r9, @javax.annotation.Nullable @org.lwjgl.system.NativeType("GLenum *") java.nio.IntBuffer r10, @javax.annotation.Nullable @org.lwjgl.system.NativeType("GLuint *") java.nio.IntBuffer r11, @javax.annotation.Nullable @org.lwjgl.system.NativeType("GLenum *") java.nio.IntBuffer r12, @javax.annotation.Nullable @org.lwjgl.system.NativeType("GLsizei *") java.nio.IntBuffer r13, @javax.annotation.Nullable @org.lwjgl.system.NativeType("GLchar *") java.nio.ByteBuffer r14) {
            r0 = r8
            r1 = r9
            r2 = r10
            r3 = r11
            r4 = r12
            r5 = r13
            r6 = r14
            int r0 = org.lwjgl.opengl.GL43C.glGetDebugMessageLog(r0, r1, r2, r3, r4, r5, r6)
            return r0
    }

    public static void nglPushDebugGroup(int r6, int r7, int r8, long r9) {
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            org.lwjgl.opengl.GL43C.nglPushDebugGroup(r0, r1, r2, r3)
            return
    }

    public static void glPushDebugGroup(@org.lwjgl.system.NativeType("GLenum") int r4, @org.lwjgl.system.NativeType("GLuint") int r5, @org.lwjgl.system.NativeType("GLchar const *") java.nio.ByteBuffer r6) {
            r0 = r4
            r1 = r5
            r2 = r6
            org.lwjgl.opengl.GL43C.glPushDebugGroup(r0, r1, r2)
            return
    }

    public static void glPushDebugGroup(@org.lwjgl.system.NativeType("GLenum") int r4, @org.lwjgl.system.NativeType("GLuint") int r5, @org.lwjgl.system.NativeType("GLchar const *") java.lang.CharSequence r6) {
            r0 = r4
            r1 = r5
            r2 = r6
            org.lwjgl.opengl.GL43C.glPushDebugGroup(r0, r1, r2)
            return
    }

    public static void glPopDebugGroup() {
            org.lwjgl.opengl.GL43C.glPopDebugGroup()
            return
    }

    public static void nglObjectLabel(int r6, int r7, int r8, long r9) {
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            org.lwjgl.opengl.GL43C.nglObjectLabel(r0, r1, r2, r3)
            return
    }

    public static void glObjectLabel(@org.lwjgl.system.NativeType("GLenum") int r4, @org.lwjgl.system.NativeType("GLuint") int r5, @org.lwjgl.system.NativeType("GLchar const *") java.nio.ByteBuffer r6) {
            r0 = r4
            r1 = r5
            r2 = r6
            org.lwjgl.opengl.GL43C.glObjectLabel(r0, r1, r2)
            return
    }

    public static void glObjectLabel(@org.lwjgl.system.NativeType("GLenum") int r4, @org.lwjgl.system.NativeType("GLuint") int r5, @org.lwjgl.system.NativeType("GLchar const *") java.lang.CharSequence r6) {
            r0 = r4
            r1 = r5
            r2 = r6
            org.lwjgl.opengl.GL43C.glObjectLabel(r0, r1, r2)
            return
    }

    public static void nglGetObjectLabel(int r8, int r9, int r10, long r11, long r13) {
            r0 = r8
            r1 = r9
            r2 = r10
            r3 = r11
            r4 = r13
            org.lwjgl.opengl.GL43C.nglGetObjectLabel(r0, r1, r2, r3, r4)
            return
    }

    public static void glGetObjectLabel(@org.lwjgl.system.NativeType("GLenum") int r5, @org.lwjgl.system.NativeType("GLuint") int r6, @javax.annotation.Nullable @org.lwjgl.system.NativeType("GLsizei *") java.nio.IntBuffer r7, @org.lwjgl.system.NativeType("GLchar *") java.nio.ByteBuffer r8) {
            r0 = r5
            r1 = r6
            r2 = r7
            r3 = r8
            org.lwjgl.opengl.GL43C.glGetObjectLabel(r0, r1, r2, r3)
            return
    }

    @org.lwjgl.system.NativeType("void")
    public static java.lang.String glGetObjectLabel(@org.lwjgl.system.NativeType("GLenum") int r4, @org.lwjgl.system.NativeType("GLuint") int r5, @org.lwjgl.system.NativeType("GLsizei") int r6) {
            r0 = r4
            r1 = r5
            r2 = r6
            java.lang.String r0 = org.lwjgl.opengl.GL43C.glGetObjectLabel(r0, r1, r2)
            return r0
    }

    @org.lwjgl.system.NativeType("void")
    public static java.lang.String glGetObjectLabel(@org.lwjgl.system.NativeType("GLenum") int r4, @org.lwjgl.system.NativeType("GLuint") int r5) {
            r0 = r4
            r1 = r5
            r2 = 33512(0x82e8, float:4.696E-41)
            int r2 = org.lwjgl.opengl.GL11.glGetInteger(r2)
            java.lang.String r0 = glGetObjectLabel(r0, r1, r2)
            return r0
    }

    public static void nglObjectPtrLabel(long r6, int r8, long r9) {
            r0 = r6
            r1 = r8
            r2 = r9
            org.lwjgl.opengl.GL43C.nglObjectPtrLabel(r0, r1, r2)
            return
    }

    public static void glObjectPtrLabel(@org.lwjgl.system.NativeType("void *") long r4, @org.lwjgl.system.NativeType("GLchar const *") java.nio.ByteBuffer r6) {
            r0 = r4
            r1 = r6
            org.lwjgl.opengl.GL43C.glObjectPtrLabel(r0, r1)
            return
    }

    public static void glObjectPtrLabel(@org.lwjgl.system.NativeType("void *") long r4, @org.lwjgl.system.NativeType("GLchar const *") java.lang.CharSequence r6) {
            r0 = r4
            r1 = r6
            org.lwjgl.opengl.GL43C.glObjectPtrLabel(r0, r1)
            return
    }

    public static void nglGetObjectPtrLabel(long r8, int r10, long r11, long r13) {
            r0 = r8
            r1 = r10
            r2 = r11
            r3 = r13
            org.lwjgl.opengl.GL43C.nglGetObjectPtrLabel(r0, r1, r2, r3)
            return
    }

    public static void glGetObjectPtrLabel(@org.lwjgl.system.NativeType("void *") long r5, @javax.annotation.Nullable @org.lwjgl.system.NativeType("GLsizei *") java.nio.IntBuffer r7, @org.lwjgl.system.NativeType("GLchar *") java.nio.ByteBuffer r8) {
            r0 = r5
            r1 = r7
            r2 = r8
            org.lwjgl.opengl.GL43C.glGetObjectPtrLabel(r0, r1, r2)
            return
    }

    @org.lwjgl.system.NativeType("void")
    public static java.lang.String glGetObjectPtrLabel(@org.lwjgl.system.NativeType("void *") long r4, @org.lwjgl.system.NativeType("GLsizei") int r6) {
            r0 = r4
            r1 = r6
            java.lang.String r0 = org.lwjgl.opengl.GL43C.glGetObjectPtrLabel(r0, r1)
            return r0
    }

    @org.lwjgl.system.NativeType("void")
    public static java.lang.String glGetObjectPtrLabel(@org.lwjgl.system.NativeType("void *") long r4) {
            r0 = r4
            r1 = 33512(0x82e8, float:4.696E-41)
            int r1 = org.lwjgl.opengl.GL11.glGetInteger(r1)
            java.lang.String r0 = glGetObjectPtrLabel(r0, r1)
            return r0
    }

    public static void glFramebufferParameteri(@org.lwjgl.system.NativeType("GLenum") int r4, @org.lwjgl.system.NativeType("GLenum") int r5, @org.lwjgl.system.NativeType("GLint") int r6) {
            r0 = r4
            r1 = r5
            r2 = r6
            org.lwjgl.opengl.GL43C.glFramebufferParameteri(r0, r1, r2)
            return
    }

    public static void nglGetFramebufferParameteriv(int r5, int r6, long r7) {
            r0 = r5
            r1 = r6
            r2 = r7
            org.lwjgl.opengl.GL43C.nglGetFramebufferParameteriv(r0, r1, r2)
            return
    }

    public static void glGetFramebufferParameteriv(@org.lwjgl.system.NativeType("GLenum") int r4, @org.lwjgl.system.NativeType("GLenum") int r5, @org.lwjgl.system.NativeType("GLint *") java.nio.IntBuffer r6) {
            r0 = r4
            r1 = r5
            r2 = r6
            org.lwjgl.opengl.GL43C.glGetFramebufferParameteriv(r0, r1, r2)
            return
    }

    @org.lwjgl.system.NativeType("void")
    public static int glGetFramebufferParameteri(@org.lwjgl.system.NativeType("GLenum") int r3, @org.lwjgl.system.NativeType("GLenum") int r4) {
            r0 = r3
            r1 = r4
            int r0 = org.lwjgl.opengl.GL43C.glGetFramebufferParameteri(r0, r1)
            return r0
    }

    public static void nglGetInternalformati64v(int r7, int r8, int r9, int r10, long r11) {
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            org.lwjgl.opengl.GL43C.nglGetInternalformati64v(r0, r1, r2, r3, r4)
            return
    }

    public static void glGetInternalformati64v(@org.lwjgl.system.NativeType("GLenum") int r5, @org.lwjgl.system.NativeType("GLenum") int r6, @org.lwjgl.system.NativeType("GLenum") int r7, @org.lwjgl.system.NativeType("GLint64 *") java.nio.LongBuffer r8) {
            r0 = r5
            r1 = r6
            r2 = r7
            r3 = r8
            org.lwjgl.opengl.GL43C.glGetInternalformati64v(r0, r1, r2, r3)
            return
    }

    @org.lwjgl.system.NativeType("void")
    public static long glGetInternalformati64(@org.lwjgl.system.NativeType("GLenum") int r4, @org.lwjgl.system.NativeType("GLenum") int r5, @org.lwjgl.system.NativeType("GLenum") int r6) {
            r0 = r4
            r1 = r5
            r2 = r6
            long r0 = org.lwjgl.opengl.GL43C.glGetInternalformati64(r0, r1, r2)
            return r0
    }

    public static void glInvalidateTexSubImage(@org.lwjgl.system.NativeType("GLuint") int r9, @org.lwjgl.system.NativeType("GLint") int r10, @org.lwjgl.system.NativeType("GLint") int r11, @org.lwjgl.system.NativeType("GLint") int r12, @org.lwjgl.system.NativeType("GLint") int r13, @org.lwjgl.system.NativeType("GLsizei") int r14, @org.lwjgl.system.NativeType("GLsizei") int r15, @org.lwjgl.system.NativeType("GLsizei") int r16) {
            r0 = r9
            r1 = r10
            r2 = r11
            r3 = r12
            r4 = r13
            r5 = r14
            r6 = r15
            r7 = r16
            org.lwjgl.opengl.GL43C.glInvalidateTexSubImage(r0, r1, r2, r3, r4, r5, r6, r7)
            return
    }

    public static void glInvalidateTexImage(@org.lwjgl.system.NativeType("GLuint") int r3, @org.lwjgl.system.NativeType("GLint") int r4) {
            r0 = r3
            r1 = r4
            org.lwjgl.opengl.GL43C.glInvalidateTexImage(r0, r1)
            return
    }

    public static void glInvalidateBufferSubData(@org.lwjgl.system.NativeType("GLuint") int r6, @org.lwjgl.system.NativeType("GLintptr") long r7, @org.lwjgl.system.NativeType("GLsizeiptr") long r9) {
            r0 = r6
            r1 = r7
            r2 = r9
            org.lwjgl.opengl.GL43C.glInvalidateBufferSubData(r0, r1, r2)
            return
    }

    public static void glInvalidateBufferData(@org.lwjgl.system.NativeType("GLuint") int r2) {
            r0 = r2
            org.lwjgl.opengl.GL43C.glInvalidateBufferData(r0)
            return
    }

    public static void nglInvalidateFramebuffer(int r5, int r6, long r7) {
            r0 = r5
            r1 = r6
            r2 = r7
            org.lwjgl.opengl.GL43C.nglInvalidateFramebuffer(r0, r1, r2)
            return
    }

    public static void glInvalidateFramebuffer(@org.lwjgl.system.NativeType("GLenum") int r3, @org.lwjgl.system.NativeType("GLenum const *") java.nio.IntBuffer r4) {
            r0 = r3
            r1 = r4
            org.lwjgl.opengl.GL43C.glInvalidateFramebuffer(r0, r1)
            return
    }

    public static void glInvalidateFramebuffer(@org.lwjgl.system.NativeType("GLenum") int r3, @org.lwjgl.system.NativeType("GLenum const *") int r4) {
            r0 = r3
            r1 = r4
            org.lwjgl.opengl.GL43C.glInvalidateFramebuffer(r0, r1)
            return
    }

    public static void nglInvalidateSubFramebuffer(int r9, int r10, long r11, int r13, int r14, int r15, int r16) {
            r0 = r9
            r1 = r10
            r2 = r11
            r3 = r13
            r4 = r14
            r5 = r15
            r6 = r16
            org.lwjgl.opengl.GL43C.nglInvalidateSubFramebuffer(r0, r1, r2, r3, r4, r5, r6)
            return
    }

    public static void glInvalidateSubFramebuffer(@org.lwjgl.system.NativeType("GLenum") int r7, @org.lwjgl.system.NativeType("GLenum const *") java.nio.IntBuffer r8, @org.lwjgl.system.NativeType("GLint") int r9, @org.lwjgl.system.NativeType("GLint") int r10, @org.lwjgl.system.NativeType("GLsizei") int r11, @org.lwjgl.system.NativeType("GLsizei") int r12) {
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            r5 = r12
            org.lwjgl.opengl.GL43C.glInvalidateSubFramebuffer(r0, r1, r2, r3, r4, r5)
            return
    }

    public static void glInvalidateSubFramebuffer(@org.lwjgl.system.NativeType("GLenum") int r7, @org.lwjgl.system.NativeType("GLenum const *") int r8, @org.lwjgl.system.NativeType("GLint") int r9, @org.lwjgl.system.NativeType("GLint") int r10, @org.lwjgl.system.NativeType("GLsizei") int r11, @org.lwjgl.system.NativeType("GLsizei") int r12) {
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            r5 = r12
            org.lwjgl.opengl.GL43C.glInvalidateSubFramebuffer(r0, r1, r2, r3, r4, r5)
            return
    }

    public static void nglMultiDrawArraysIndirect(int r6, long r7, int r9, int r10) {
            r0 = r6
            r1 = r7
            r2 = r9
            r3 = r10
            org.lwjgl.opengl.GL43C.nglMultiDrawArraysIndirect(r0, r1, r2, r3)
            return
    }

    public static void glMultiDrawArraysIndirect(@org.lwjgl.system.NativeType("GLenum") int r5, @org.lwjgl.system.NativeType("void const *") java.nio.ByteBuffer r6, @org.lwjgl.system.NativeType("GLsizei") int r7, @org.lwjgl.system.NativeType("GLsizei") int r8) {
            r0 = r5
            r1 = r6
            r2 = r7
            r3 = r8
            org.lwjgl.opengl.GL43C.glMultiDrawArraysIndirect(r0, r1, r2, r3)
            return
    }

    public static void glMultiDrawArraysIndirect(@org.lwjgl.system.NativeType("GLenum") int r6, @org.lwjgl.system.NativeType("void const *") long r7, @org.lwjgl.system.NativeType("GLsizei") int r9, @org.lwjgl.system.NativeType("GLsizei") int r10) {
            r0 = r6
            r1 = r7
            r2 = r9
            r3 = r10
            org.lwjgl.opengl.GL43C.glMultiDrawArraysIndirect(r0, r1, r2, r3)
            return
    }

    public static void glMultiDrawArraysIndirect(@org.lwjgl.system.NativeType("GLenum") int r5, @org.lwjgl.system.NativeType("void const *") java.nio.IntBuffer r6, @org.lwjgl.system.NativeType("GLsizei") int r7, @org.lwjgl.system.NativeType("GLsizei") int r8) {
            r0 = r5
            r1 = r6
            r2 = r7
            r3 = r8
            org.lwjgl.opengl.GL43C.glMultiDrawArraysIndirect(r0, r1, r2, r3)
            return
    }

    public static void nglMultiDrawElementsIndirect(int r7, int r8, long r9, int r11, int r12) {
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = r11
            r4 = r12
            org.lwjgl.opengl.GL43C.nglMultiDrawElementsIndirect(r0, r1, r2, r3, r4)
            return
    }

    public static void glMultiDrawElementsIndirect(@org.lwjgl.system.NativeType("GLenum") int r6, @org.lwjgl.system.NativeType("GLenum") int r7, @org.lwjgl.system.NativeType("void const *") java.nio.ByteBuffer r8, @org.lwjgl.system.NativeType("GLsizei") int r9, @org.lwjgl.system.NativeType("GLsizei") int r10) {
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            org.lwjgl.opengl.GL43C.glMultiDrawElementsIndirect(r0, r1, r2, r3, r4)
            return
    }

    public static void glMultiDrawElementsIndirect(@org.lwjgl.system.NativeType("GLenum") int r7, @org.lwjgl.system.NativeType("GLenum") int r8, @org.lwjgl.system.NativeType("void const *") long r9, @org.lwjgl.system.NativeType("GLsizei") int r11, @org.lwjgl.system.NativeType("GLsizei") int r12) {
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = r11
            r4 = r12
            org.lwjgl.opengl.GL43C.glMultiDrawElementsIndirect(r0, r1, r2, r3, r4)
            return
    }

    public static void glMultiDrawElementsIndirect(@org.lwjgl.system.NativeType("GLenum") int r6, @org.lwjgl.system.NativeType("GLenum") int r7, @org.lwjgl.system.NativeType("void const *") java.nio.IntBuffer r8, @org.lwjgl.system.NativeType("GLsizei") int r9, @org.lwjgl.system.NativeType("GLsizei") int r10) {
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            org.lwjgl.opengl.GL43C.glMultiDrawElementsIndirect(r0, r1, r2, r3, r4)
            return
    }

    public static void nglGetProgramInterfaceiv(int r6, int r7, int r8, long r9) {
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            org.lwjgl.opengl.GL43C.nglGetProgramInterfaceiv(r0, r1, r2, r3)
            return
    }

    public static void glGetProgramInterfaceiv(@org.lwjgl.system.NativeType("GLuint") int r5, @org.lwjgl.system.NativeType("GLenum") int r6, @org.lwjgl.system.NativeType("GLenum") int r7, @org.lwjgl.system.NativeType("GLint *") java.nio.IntBuffer r8) {
            r0 = r5
            r1 = r6
            r2 = r7
            r3 = r8
            org.lwjgl.opengl.GL43C.glGetProgramInterfaceiv(r0, r1, r2, r3)
            return
    }

    @org.lwjgl.system.NativeType("void")
    public static int glGetProgramInterfacei(@org.lwjgl.system.NativeType("GLuint") int r4, @org.lwjgl.system.NativeType("GLenum") int r5, @org.lwjgl.system.NativeType("GLenum") int r6) {
            r0 = r4
            r1 = r5
            r2 = r6
            int r0 = org.lwjgl.opengl.GL43C.glGetProgramInterfacei(r0, r1, r2)
            return r0
    }

    public static int nglGetProgramResourceIndex(int r5, int r6, long r7) {
            r0 = r5
            r1 = r6
            r2 = r7
            int r0 = org.lwjgl.opengl.GL43C.nglGetProgramResourceIndex(r0, r1, r2)
            return r0
    }

    @org.lwjgl.system.NativeType("GLuint")
    public static int glGetProgramResourceIndex(@org.lwjgl.system.NativeType("GLuint") int r4, @org.lwjgl.system.NativeType("GLenum") int r5, @org.lwjgl.system.NativeType("GLchar const *") java.nio.ByteBuffer r6) {
            r0 = r4
            r1 = r5
            r2 = r6
            int r0 = org.lwjgl.opengl.GL43C.glGetProgramResourceIndex(r0, r1, r2)
            return r0
    }

    @org.lwjgl.system.NativeType("GLuint")
    public static int glGetProgramResourceIndex(@org.lwjgl.system.NativeType("GLuint") int r4, @org.lwjgl.system.NativeType("GLenum") int r5, @org.lwjgl.system.NativeType("GLchar const *") java.lang.CharSequence r6) {
            r0 = r4
            r1 = r5
            r2 = r6
            int r0 = org.lwjgl.opengl.GL43C.glGetProgramResourceIndex(r0, r1, r2)
            return r0
    }

    public static void nglGetProgramResourceName(int r9, int r10, int r11, int r12, long r13, long r15) {
            r0 = r9
            r1 = r10
            r2 = r11
            r3 = r12
            r4 = r13
            r5 = r15
            org.lwjgl.opengl.GL43C.nglGetProgramResourceName(r0, r1, r2, r3, r4, r5)
            return
    }

    public static void glGetProgramResourceName(@org.lwjgl.system.NativeType("GLuint") int r6, @org.lwjgl.system.NativeType("GLenum") int r7, @org.lwjgl.system.NativeType("GLuint") int r8, @javax.annotation.Nullable @org.lwjgl.system.NativeType("GLsizei *") java.nio.IntBuffer r9, @org.lwjgl.system.NativeType("GLchar *") java.nio.ByteBuffer r10) {
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            org.lwjgl.opengl.GL43C.glGetProgramResourceName(r0, r1, r2, r3, r4)
            return
    }

    @org.lwjgl.system.NativeType("void")
    public static java.lang.String glGetProgramResourceName(@org.lwjgl.system.NativeType("GLuint") int r5, @org.lwjgl.system.NativeType("GLenum") int r6, @org.lwjgl.system.NativeType("GLuint") int r7, @org.lwjgl.system.NativeType("GLsizei") int r8) {
            r0 = r5
            r1 = r6
            r2 = r7
            r3 = r8
            java.lang.String r0 = org.lwjgl.opengl.GL43C.glGetProgramResourceName(r0, r1, r2, r3)
            return r0
    }

    @org.lwjgl.system.NativeType("void")
    public static java.lang.String glGetProgramResourceName(@org.lwjgl.system.NativeType("GLuint") int r7, @org.lwjgl.system.NativeType("GLenum") int r8, @org.lwjgl.system.NativeType("GLuint") int r9) {
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = r7
            r4 = r8
            r5 = 37622(0x92f6, float:5.272E-41)
            int r3 = glGetProgramInterfacei(r3, r4, r5)
            java.lang.String r0 = glGetProgramResourceName(r0, r1, r2, r3)
            return r0
    }

    public static void nglGetProgramResourceiv(int r12, int r13, int r14, int r15, long r16, int r18, long r19, long r21) {
            r0 = r12
            r1 = r13
            r2 = r14
            r3 = r15
            r4 = r16
            r5 = r18
            r6 = r19
            r7 = r21
            org.lwjgl.opengl.GL43C.nglGetProgramResourceiv(r0, r1, r2, r3, r4, r5, r6, r7)
            return
    }

    public static void glGetProgramResourceiv(@org.lwjgl.system.NativeType("GLuint") int r7, @org.lwjgl.system.NativeType("GLenum") int r8, @org.lwjgl.system.NativeType("GLuint") int r9, @org.lwjgl.system.NativeType("GLenum const *") java.nio.IntBuffer r10, @javax.annotation.Nullable @org.lwjgl.system.NativeType("GLsizei *") java.nio.IntBuffer r11, @org.lwjgl.system.NativeType("GLint *") java.nio.IntBuffer r12) {
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            r5 = r12
            org.lwjgl.opengl.GL43C.glGetProgramResourceiv(r0, r1, r2, r3, r4, r5)
            return
    }

    public static int nglGetProgramResourceLocation(int r5, int r6, long r7) {
            r0 = r5
            r1 = r6
            r2 = r7
            int r0 = org.lwjgl.opengl.GL43C.nglGetProgramResourceLocation(r0, r1, r2)
            return r0
    }

    @org.lwjgl.system.NativeType("GLint")
    public static int glGetProgramResourceLocation(@org.lwjgl.system.NativeType("GLuint") int r4, @org.lwjgl.system.NativeType("GLenum") int r5, @org.lwjgl.system.NativeType("GLchar const *") java.nio.ByteBuffer r6) {
            r0 = r4
            r1 = r5
            r2 = r6
            int r0 = org.lwjgl.opengl.GL43C.glGetProgramResourceLocation(r0, r1, r2)
            return r0
    }

    @org.lwjgl.system.NativeType("GLint")
    public static int glGetProgramResourceLocation(@org.lwjgl.system.NativeType("GLuint") int r4, @org.lwjgl.system.NativeType("GLenum") int r5, @org.lwjgl.system.NativeType("GLchar const *") java.lang.CharSequence r6) {
            r0 = r4
            r1 = r5
            r2 = r6
            int r0 = org.lwjgl.opengl.GL43C.glGetProgramResourceLocation(r0, r1, r2)
            return r0
    }

    public static int nglGetProgramResourceLocationIndex(int r5, int r6, long r7) {
            r0 = r5
            r1 = r6
            r2 = r7
            int r0 = org.lwjgl.opengl.GL43C.nglGetProgramResourceLocationIndex(r0, r1, r2)
            return r0
    }

    @org.lwjgl.system.NativeType("GLint")
    public static int glGetProgramResourceLocationIndex(@org.lwjgl.system.NativeType("GLuint") int r4, @org.lwjgl.system.NativeType("GLenum") int r5, @org.lwjgl.system.NativeType("GLchar const *") java.nio.ByteBuffer r6) {
            r0 = r4
            r1 = r5
            r2 = r6
            int r0 = org.lwjgl.opengl.GL43C.glGetProgramResourceLocationIndex(r0, r1, r2)
            return r0
    }

    @org.lwjgl.system.NativeType("GLint")
    public static int glGetProgramResourceLocationIndex(@org.lwjgl.system.NativeType("GLuint") int r4, @org.lwjgl.system.NativeType("GLenum") int r5, @org.lwjgl.system.NativeType("GLchar const *") java.lang.CharSequence r6) {
            r0 = r4
            r1 = r5
            r2 = r6
            int r0 = org.lwjgl.opengl.GL43C.glGetProgramResourceLocationIndex(r0, r1, r2)
            return r0
    }

    public static void glShaderStorageBlockBinding(@org.lwjgl.system.NativeType("GLuint") int r4, @org.lwjgl.system.NativeType("GLuint") int r5, @org.lwjgl.system.NativeType("GLuint") int r6) {
            r0 = r4
            r1 = r5
            r2 = r6
            org.lwjgl.opengl.GL43C.glShaderStorageBlockBinding(r0, r1, r2)
            return
    }

    public static void glTexBufferRange(@org.lwjgl.system.NativeType("GLenum") int r8, @org.lwjgl.system.NativeType("GLenum") int r9, @org.lwjgl.system.NativeType("GLuint") int r10, @org.lwjgl.system.NativeType("GLintptr") long r11, @org.lwjgl.system.NativeType("GLsizeiptr") long r13) {
            r0 = r8
            r1 = r9
            r2 = r10
            r3 = r11
            r4 = r13
            org.lwjgl.opengl.GL43C.glTexBufferRange(r0, r1, r2, r3, r4)
            return
    }

    public static void glTexStorage2DMultisample(@org.lwjgl.system.NativeType("GLenum") int r7, @org.lwjgl.system.NativeType("GLsizei") int r8, @org.lwjgl.system.NativeType("GLenum") int r9, @org.lwjgl.system.NativeType("GLsizei") int r10, @org.lwjgl.system.NativeType("GLsizei") int r11, @org.lwjgl.system.NativeType("GLboolean") boolean r12) {
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            r5 = r12
            org.lwjgl.opengl.GL43C.glTexStorage2DMultisample(r0, r1, r2, r3, r4, r5)
            return
    }

    public static void glTexStorage3DMultisample(@org.lwjgl.system.NativeType("GLenum") int r8, @org.lwjgl.system.NativeType("GLsizei") int r9, @org.lwjgl.system.NativeType("GLenum") int r10, @org.lwjgl.system.NativeType("GLsizei") int r11, @org.lwjgl.system.NativeType("GLsizei") int r12, @org.lwjgl.system.NativeType("GLsizei") int r13, @org.lwjgl.system.NativeType("GLboolean") boolean r14) {
            r0 = r8
            r1 = r9
            r2 = r10
            r3 = r11
            r4 = r12
            r5 = r13
            r6 = r14
            org.lwjgl.opengl.GL43C.glTexStorage3DMultisample(r0, r1, r2, r3, r4, r5, r6)
            return
    }

    public static void glTextureView(@org.lwjgl.system.NativeType("GLuint") int r9, @org.lwjgl.system.NativeType("GLenum") int r10, @org.lwjgl.system.NativeType("GLuint") int r11, @org.lwjgl.system.NativeType("GLenum") int r12, @org.lwjgl.system.NativeType("GLuint") int r13, @org.lwjgl.system.NativeType("GLuint") int r14, @org.lwjgl.system.NativeType("GLuint") int r15, @org.lwjgl.system.NativeType("GLuint") int r16) {
            r0 = r9
            r1 = r10
            r2 = r11
            r3 = r12
            r4 = r13
            r5 = r14
            r6 = r15
            r7 = r16
            org.lwjgl.opengl.GL43C.glTextureView(r0, r1, r2, r3, r4, r5, r6, r7)
            return
    }

    public static void glBindVertexBuffer(@org.lwjgl.system.NativeType("GLuint") int r6, @org.lwjgl.system.NativeType("GLuint") int r7, @org.lwjgl.system.NativeType("GLintptr") long r8, @org.lwjgl.system.NativeType("GLsizei") int r10) {
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r10
            org.lwjgl.opengl.GL43C.glBindVertexBuffer(r0, r1, r2, r3)
            return
    }

    public static void glVertexAttribFormat(@org.lwjgl.system.NativeType("GLuint") int r6, @org.lwjgl.system.NativeType("GLint") int r7, @org.lwjgl.system.NativeType("GLenum") int r8, @org.lwjgl.system.NativeType("GLboolean") boolean r9, @org.lwjgl.system.NativeType("GLuint") int r10) {
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            org.lwjgl.opengl.GL43C.glVertexAttribFormat(r0, r1, r2, r3, r4)
            return
    }

    public static void glVertexAttribIFormat(@org.lwjgl.system.NativeType("GLuint") int r5, @org.lwjgl.system.NativeType("GLint") int r6, @org.lwjgl.system.NativeType("GLenum") int r7, @org.lwjgl.system.NativeType("GLuint") int r8) {
            r0 = r5
            r1 = r6
            r2 = r7
            r3 = r8
            org.lwjgl.opengl.GL43C.glVertexAttribIFormat(r0, r1, r2, r3)
            return
    }

    public static void glVertexAttribLFormat(@org.lwjgl.system.NativeType("GLuint") int r5, @org.lwjgl.system.NativeType("GLint") int r6, @org.lwjgl.system.NativeType("GLenum") int r7, @org.lwjgl.system.NativeType("GLuint") int r8) {
            r0 = r5
            r1 = r6
            r2 = r7
            r3 = r8
            org.lwjgl.opengl.GL43C.glVertexAttribLFormat(r0, r1, r2, r3)
            return
    }

    public static void glVertexAttribBinding(@org.lwjgl.system.NativeType("GLuint") int r3, @org.lwjgl.system.NativeType("GLuint") int r4) {
            r0 = r3
            r1 = r4
            org.lwjgl.opengl.GL43C.glVertexAttribBinding(r0, r1)
            return
    }

    public static void glVertexBindingDivisor(@org.lwjgl.system.NativeType("GLuint") int r3, @org.lwjgl.system.NativeType("GLuint") int r4) {
            r0 = r3
            r1 = r4
            org.lwjgl.opengl.GL43C.glVertexBindingDivisor(r0, r1)
            return
    }

    public static void glClearBufferData(@org.lwjgl.system.NativeType("GLenum") int r6, @org.lwjgl.system.NativeType("GLenum") int r7, @org.lwjgl.system.NativeType("GLenum") int r8, @org.lwjgl.system.NativeType("GLenum") int r9, @javax.annotation.Nullable @org.lwjgl.system.NativeType("void const *") short[] r10) {
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            org.lwjgl.opengl.GL43C.glClearBufferData(r0, r1, r2, r3, r4)
            return
    }

    public static void glClearBufferData(@org.lwjgl.system.NativeType("GLenum") int r6, @org.lwjgl.system.NativeType("GLenum") int r7, @org.lwjgl.system.NativeType("GLenum") int r8, @org.lwjgl.system.NativeType("GLenum") int r9, @javax.annotation.Nullable @org.lwjgl.system.NativeType("void const *") int[] r10) {
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            org.lwjgl.opengl.GL43C.glClearBufferData(r0, r1, r2, r3, r4)
            return
    }

    public static void glClearBufferData(@org.lwjgl.system.NativeType("GLenum") int r6, @org.lwjgl.system.NativeType("GLenum") int r7, @org.lwjgl.system.NativeType("GLenum") int r8, @org.lwjgl.system.NativeType("GLenum") int r9, @javax.annotation.Nullable @org.lwjgl.system.NativeType("void const *") float[] r10) {
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            org.lwjgl.opengl.GL43C.glClearBufferData(r0, r1, r2, r3, r4)
            return
    }

    public static void glClearBufferSubData(@org.lwjgl.system.NativeType("GLenum") int r10, @org.lwjgl.system.NativeType("GLenum") int r11, @org.lwjgl.system.NativeType("GLintptr") long r12, @org.lwjgl.system.NativeType("GLsizeiptr") long r14, @org.lwjgl.system.NativeType("GLenum") int r16, @org.lwjgl.system.NativeType("GLenum") int r17, @javax.annotation.Nullable @org.lwjgl.system.NativeType("void const *") short[] r18) {
            r0 = r10
            r1 = r11
            r2 = r12
            r3 = r14
            r4 = r16
            r5 = r17
            r6 = r18
            org.lwjgl.opengl.GL43C.glClearBufferSubData(r0, r1, r2, r3, r4, r5, r6)
            return
    }

    public static void glClearBufferSubData(@org.lwjgl.system.NativeType("GLenum") int r10, @org.lwjgl.system.NativeType("GLenum") int r11, @org.lwjgl.system.NativeType("GLintptr") long r12, @org.lwjgl.system.NativeType("GLsizeiptr") long r14, @org.lwjgl.system.NativeType("GLenum") int r16, @org.lwjgl.system.NativeType("GLenum") int r17, @javax.annotation.Nullable @org.lwjgl.system.NativeType("void const *") int[] r18) {
            r0 = r10
            r1 = r11
            r2 = r12
            r3 = r14
            r4 = r16
            r5 = r17
            r6 = r18
            org.lwjgl.opengl.GL43C.glClearBufferSubData(r0, r1, r2, r3, r4, r5, r6)
            return
    }

    public static void glClearBufferSubData(@org.lwjgl.system.NativeType("GLenum") int r10, @org.lwjgl.system.NativeType("GLenum") int r11, @org.lwjgl.system.NativeType("GLintptr") long r12, @org.lwjgl.system.NativeType("GLsizeiptr") long r14, @org.lwjgl.system.NativeType("GLenum") int r16, @org.lwjgl.system.NativeType("GLenum") int r17, @javax.annotation.Nullable @org.lwjgl.system.NativeType("void const *") float[] r18) {
            r0 = r10
            r1 = r11
            r2 = r12
            r3 = r14
            r4 = r16
            r5 = r17
            r6 = r18
            org.lwjgl.opengl.GL43C.glClearBufferSubData(r0, r1, r2, r3, r4, r5, r6)
            return
    }

    public static void glDebugMessageControl(@org.lwjgl.system.NativeType("GLenum") int r6, @org.lwjgl.system.NativeType("GLenum") int r7, @org.lwjgl.system.NativeType("GLenum") int r8, @javax.annotation.Nullable @org.lwjgl.system.NativeType("GLuint const *") int[] r9, @org.lwjgl.system.NativeType("GLboolean") boolean r10) {
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            org.lwjgl.opengl.GL43C.glDebugMessageControl(r0, r1, r2, r3, r4)
            return
    }

    @org.lwjgl.system.NativeType("GLuint")
    public static int glGetDebugMessageLog(@org.lwjgl.system.NativeType("GLuint") int r8, @javax.annotation.Nullable @org.lwjgl.system.NativeType("GLenum *") int[] r9, @javax.annotation.Nullable @org.lwjgl.system.NativeType("GLenum *") int[] r10, @javax.annotation.Nullable @org.lwjgl.system.NativeType("GLuint *") int[] r11, @javax.annotation.Nullable @org.lwjgl.system.NativeType("GLenum *") int[] r12, @javax.annotation.Nullable @org.lwjgl.system.NativeType("GLsizei *") int[] r13, @javax.annotation.Nullable @org.lwjgl.system.NativeType("GLchar *") java.nio.ByteBuffer r14) {
            r0 = r8
            r1 = r9
            r2 = r10
            r3 = r11
            r4 = r12
            r5 = r13
            r6 = r14
            int r0 = org.lwjgl.opengl.GL43C.glGetDebugMessageLog(r0, r1, r2, r3, r4, r5, r6)
            return r0
    }

    public static void glGetObjectLabel(@org.lwjgl.system.NativeType("GLenum") int r5, @org.lwjgl.system.NativeType("GLuint") int r6, @javax.annotation.Nullable @org.lwjgl.system.NativeType("GLsizei *") int[] r7, @org.lwjgl.system.NativeType("GLchar *") java.nio.ByteBuffer r8) {
            r0 = r5
            r1 = r6
            r2 = r7
            r3 = r8
            org.lwjgl.opengl.GL43C.glGetObjectLabel(r0, r1, r2, r3)
            return
    }

    public static void glGetObjectPtrLabel(@org.lwjgl.system.NativeType("void *") long r5, @javax.annotation.Nullable @org.lwjgl.system.NativeType("GLsizei *") int[] r7, @org.lwjgl.system.NativeType("GLchar *") java.nio.ByteBuffer r8) {
            r0 = r5
            r1 = r7
            r2 = r8
            org.lwjgl.opengl.GL43C.glGetObjectPtrLabel(r0, r1, r2)
            return
    }

    public static void glGetFramebufferParameteriv(@org.lwjgl.system.NativeType("GLenum") int r4, @org.lwjgl.system.NativeType("GLenum") int r5, @org.lwjgl.system.NativeType("GLint *") int[] r6) {
            r0 = r4
            r1 = r5
            r2 = r6
            org.lwjgl.opengl.GL43C.glGetFramebufferParameteriv(r0, r1, r2)
            return
    }

    public static void glGetInternalformati64v(@org.lwjgl.system.NativeType("GLenum") int r5, @org.lwjgl.system.NativeType("GLenum") int r6, @org.lwjgl.system.NativeType("GLenum") int r7, @org.lwjgl.system.NativeType("GLint64 *") long[] r8) {
            r0 = r5
            r1 = r6
            r2 = r7
            r3 = r8
            org.lwjgl.opengl.GL43C.glGetInternalformati64v(r0, r1, r2, r3)
            return
    }

    public static void glInvalidateFramebuffer(@org.lwjgl.system.NativeType("GLenum") int r3, @org.lwjgl.system.NativeType("GLenum const *") int[] r4) {
            r0 = r3
            r1 = r4
            org.lwjgl.opengl.GL43C.glInvalidateFramebuffer(r0, r1)
            return
    }

    public static void glInvalidateSubFramebuffer(@org.lwjgl.system.NativeType("GLenum") int r7, @org.lwjgl.system.NativeType("GLenum const *") int[] r8, @org.lwjgl.system.NativeType("GLint") int r9, @org.lwjgl.system.NativeType("GLint") int r10, @org.lwjgl.system.NativeType("GLsizei") int r11, @org.lwjgl.system.NativeType("GLsizei") int r12) {
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            r5 = r12
            org.lwjgl.opengl.GL43C.glInvalidateSubFramebuffer(r0, r1, r2, r3, r4, r5)
            return
    }

    public static void glMultiDrawArraysIndirect(@org.lwjgl.system.NativeType("GLenum") int r5, @org.lwjgl.system.NativeType("void const *") int[] r6, @org.lwjgl.system.NativeType("GLsizei") int r7, @org.lwjgl.system.NativeType("GLsizei") int r8) {
            r0 = r5
            r1 = r6
            r2 = r7
            r3 = r8
            org.lwjgl.opengl.GL43C.glMultiDrawArraysIndirect(r0, r1, r2, r3)
            return
    }

    public static void glMultiDrawElementsIndirect(@org.lwjgl.system.NativeType("GLenum") int r6, @org.lwjgl.system.NativeType("GLenum") int r7, @org.lwjgl.system.NativeType("void const *") int[] r8, @org.lwjgl.system.NativeType("GLsizei") int r9, @org.lwjgl.system.NativeType("GLsizei") int r10) {
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            org.lwjgl.opengl.GL43C.glMultiDrawElementsIndirect(r0, r1, r2, r3, r4)
            return
    }

    public static void glGetProgramInterfaceiv(@org.lwjgl.system.NativeType("GLuint") int r5, @org.lwjgl.system.NativeType("GLenum") int r6, @org.lwjgl.system.NativeType("GLenum") int r7, @org.lwjgl.system.NativeType("GLint *") int[] r8) {
            r0 = r5
            r1 = r6
            r2 = r7
            r3 = r8
            org.lwjgl.opengl.GL43C.glGetProgramInterfaceiv(r0, r1, r2, r3)
            return
    }

    public static void glGetProgramResourceName(@org.lwjgl.system.NativeType("GLuint") int r6, @org.lwjgl.system.NativeType("GLenum") int r7, @org.lwjgl.system.NativeType("GLuint") int r8, @javax.annotation.Nullable @org.lwjgl.system.NativeType("GLsizei *") int[] r9, @org.lwjgl.system.NativeType("GLchar *") java.nio.ByteBuffer r10) {
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            org.lwjgl.opengl.GL43C.glGetProgramResourceName(r0, r1, r2, r3, r4)
            return
    }

    public static void glGetProgramResourceiv(@org.lwjgl.system.NativeType("GLuint") int r7, @org.lwjgl.system.NativeType("GLenum") int r8, @org.lwjgl.system.NativeType("GLuint") int r9, @org.lwjgl.system.NativeType("GLenum const *") int[] r10, @javax.annotation.Nullable @org.lwjgl.system.NativeType("GLsizei *") int[] r11, @org.lwjgl.system.NativeType("GLint *") int[] r12) {
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            r5 = r12
            org.lwjgl.opengl.GL43C.glGetProgramResourceiv(r0, r1, r2, r3, r4, r5)
            return
    }

    static {
            org.lwjgl.opengl.GL.initialize()
            return
    }
}
