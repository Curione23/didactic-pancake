package org.lwjgl.opengl;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/opengl/GL11.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/opengl/GL11.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/opengl/GL11.class */
public class GL11 {
    public static final int GL_ACCUM = 256;
    public static final int GL_LOAD = 257;
    public static final int GL_RETURN = 258;
    public static final int GL_MULT = 259;
    public static final int GL_ADD = 260;
    public static final int GL_NEVER = 512;
    public static final int GL_LESS = 513;
    public static final int GL_EQUAL = 514;
    public static final int GL_LEQUAL = 515;
    public static final int GL_GREATER = 516;
    public static final int GL_NOTEQUAL = 517;
    public static final int GL_GEQUAL = 518;
    public static final int GL_ALWAYS = 519;
    public static final int GL_CURRENT_BIT = 1;
    public static final int GL_POINT_BIT = 2;
    public static final int GL_LINE_BIT = 4;
    public static final int GL_POLYGON_BIT = 8;
    public static final int GL_POLYGON_STIPPLE_BIT = 16;
    public static final int GL_PIXEL_MODE_BIT = 32;
    public static final int GL_LIGHTING_BIT = 64;
    public static final int GL_FOG_BIT = 128;
    public static final int GL_DEPTH_BUFFER_BIT = 256;
    public static final int GL_ACCUM_BUFFER_BIT = 512;
    public static final int GL_STENCIL_BUFFER_BIT = 1024;
    public static final int GL_VIEWPORT_BIT = 2048;
    public static final int GL_TRANSFORM_BIT = 4096;
    public static final int GL_ENABLE_BIT = 8192;
    public static final int GL_COLOR_BUFFER_BIT = 16384;
    public static final int GL_HINT_BIT = 32768;
    public static final int GL_EVAL_BIT = 65536;
    public static final int GL_LIST_BIT = 131072;
    public static final int GL_TEXTURE_BIT = 262144;
    public static final int GL_SCISSOR_BIT = 524288;
    public static final int GL_ALL_ATTRIB_BITS = 1048575;
    public static final int GL_POINTS = 0;
    public static final int GL_LINES = 1;
    public static final int GL_LINE_LOOP = 2;
    public static final int GL_LINE_STRIP = 3;
    public static final int GL_TRIANGLES = 4;
    public static final int GL_TRIANGLE_STRIP = 5;
    public static final int GL_TRIANGLE_FAN = 6;
    public static final int GL_QUADS = 7;
    public static final int GL_QUAD_STRIP = 8;
    public static final int GL_POLYGON = 9;
    public static final int GL_ZERO = 0;
    public static final int GL_ONE = 1;
    public static final int GL_SRC_COLOR = 768;
    public static final int GL_ONE_MINUS_SRC_COLOR = 769;
    public static final int GL_SRC_ALPHA = 770;
    public static final int GL_ONE_MINUS_SRC_ALPHA = 771;
    public static final int GL_DST_ALPHA = 772;
    public static final int GL_ONE_MINUS_DST_ALPHA = 773;
    public static final int GL_DST_COLOR = 774;
    public static final int GL_ONE_MINUS_DST_COLOR = 775;
    public static final int GL_SRC_ALPHA_SATURATE = 776;
    public static final int GL_TRUE = 1;
    public static final int GL_FALSE = 0;
    public static final int GL_CLIP_PLANE0 = 12288;
    public static final int GL_CLIP_PLANE1 = 12289;
    public static final int GL_CLIP_PLANE2 = 12290;
    public static final int GL_CLIP_PLANE3 = 12291;
    public static final int GL_CLIP_PLANE4 = 12292;
    public static final int GL_CLIP_PLANE5 = 12293;
    public static final int GL_BYTE = 5120;
    public static final int GL_UNSIGNED_BYTE = 5121;
    public static final int GL_SHORT = 5122;
    public static final int GL_UNSIGNED_SHORT = 5123;
    public static final int GL_INT = 5124;
    public static final int GL_UNSIGNED_INT = 5125;
    public static final int GL_FLOAT = 5126;
    public static final int GL_2_BYTES = 5127;
    public static final int GL_3_BYTES = 5128;
    public static final int GL_4_BYTES = 5129;
    public static final int GL_DOUBLE = 5130;
    public static final int GL_NONE = 0;
    public static final int GL_FRONT_LEFT = 1024;
    public static final int GL_FRONT_RIGHT = 1025;
    public static final int GL_BACK_LEFT = 1026;
    public static final int GL_BACK_RIGHT = 1027;
    public static final int GL_FRONT = 1028;
    public static final int GL_BACK = 1029;
    public static final int GL_LEFT = 1030;
    public static final int GL_RIGHT = 1031;
    public static final int GL_FRONT_AND_BACK = 1032;
    public static final int GL_AUX0 = 1033;
    public static final int GL_AUX1 = 1034;
    public static final int GL_AUX2 = 1035;
    public static final int GL_AUX3 = 1036;
    public static final int GL_NO_ERROR = 0;
    public static final int GL_INVALID_ENUM = 1280;
    public static final int GL_INVALID_VALUE = 1281;
    public static final int GL_INVALID_OPERATION = 1282;
    public static final int GL_STACK_OVERFLOW = 1283;
    public static final int GL_STACK_UNDERFLOW = 1284;
    public static final int GL_OUT_OF_MEMORY = 1285;
    public static final int GL_2D = 1536;
    public static final int GL_3D = 1537;
    public static final int GL_3D_COLOR = 1538;
    public static final int GL_3D_COLOR_TEXTURE = 1539;
    public static final int GL_4D_COLOR_TEXTURE = 1540;
    public static final int GL_PASS_THROUGH_TOKEN = 1792;
    public static final int GL_POINT_TOKEN = 1793;
    public static final int GL_LINE_TOKEN = 1794;
    public static final int GL_POLYGON_TOKEN = 1795;
    public static final int GL_BITMAP_TOKEN = 1796;
    public static final int GL_DRAW_PIXEL_TOKEN = 1797;
    public static final int GL_COPY_PIXEL_TOKEN = 1798;
    public static final int GL_LINE_RESET_TOKEN = 1799;
    public static final int GL_EXP = 2048;
    public static final int GL_EXP2 = 2049;
    public static final int GL_CW = 2304;
    public static final int GL_CCW = 2305;
    public static final int GL_COEFF = 2560;
    public static final int GL_ORDER = 2561;
    public static final int GL_DOMAIN = 2562;
    public static final int GL_CURRENT_COLOR = 2816;
    public static final int GL_CURRENT_INDEX = 2817;
    public static final int GL_CURRENT_NORMAL = 2818;
    public static final int GL_CURRENT_TEXTURE_COORDS = 2819;
    public static final int GL_CURRENT_RASTER_COLOR = 2820;
    public static final int GL_CURRENT_RASTER_INDEX = 2821;
    public static final int GL_CURRENT_RASTER_TEXTURE_COORDS = 2822;
    public static final int GL_CURRENT_RASTER_POSITION = 2823;
    public static final int GL_CURRENT_RASTER_POSITION_VALID = 2824;
    public static final int GL_CURRENT_RASTER_DISTANCE = 2825;
    public static final int GL_POINT_SMOOTH = 2832;
    public static final int GL_POINT_SIZE = 2833;
    public static final int GL_POINT_SIZE_RANGE = 2834;
    public static final int GL_POINT_SIZE_GRANULARITY = 2835;
    public static final int GL_LINE_SMOOTH = 2848;
    public static final int GL_LINE_WIDTH = 2849;
    public static final int GL_LINE_WIDTH_RANGE = 2850;
    public static final int GL_LINE_WIDTH_GRANULARITY = 2851;
    public static final int GL_LINE_STIPPLE = 2852;
    public static final int GL_LINE_STIPPLE_PATTERN = 2853;
    public static final int GL_LINE_STIPPLE_REPEAT = 2854;
    public static final int GL_LIST_MODE = 2864;
    public static final int GL_MAX_LIST_NESTING = 2865;
    public static final int GL_LIST_BASE = 2866;
    public static final int GL_LIST_INDEX = 2867;
    public static final int GL_POLYGON_MODE = 2880;
    public static final int GL_POLYGON_SMOOTH = 2881;
    public static final int GL_POLYGON_STIPPLE = 2882;
    public static final int GL_EDGE_FLAG = 2883;
    public static final int GL_CULL_FACE = 2884;
    public static final int GL_CULL_FACE_MODE = 2885;
    public static final int GL_FRONT_FACE = 2886;
    public static final int GL_LIGHTING = 2896;
    public static final int GL_LIGHT_MODEL_LOCAL_VIEWER = 2897;
    public static final int GL_LIGHT_MODEL_TWO_SIDE = 2898;
    public static final int GL_LIGHT_MODEL_AMBIENT = 2899;
    public static final int GL_SHADE_MODEL = 2900;
    public static final int GL_COLOR_MATERIAL_FACE = 2901;
    public static final int GL_COLOR_MATERIAL_PARAMETER = 2902;
    public static final int GL_COLOR_MATERIAL = 2903;
    public static final int GL_FOG = 2912;
    public static final int GL_FOG_INDEX = 2913;
    public static final int GL_FOG_DENSITY = 2914;
    public static final int GL_FOG_START = 2915;
    public static final int GL_FOG_END = 2916;
    public static final int GL_FOG_MODE = 2917;
    public static final int GL_FOG_COLOR = 2918;
    public static final int GL_DEPTH_RANGE = 2928;
    public static final int GL_DEPTH_TEST = 2929;
    public static final int GL_DEPTH_WRITEMASK = 2930;
    public static final int GL_DEPTH_CLEAR_VALUE = 2931;
    public static final int GL_DEPTH_FUNC = 2932;
    public static final int GL_ACCUM_CLEAR_VALUE = 2944;
    public static final int GL_STENCIL_TEST = 2960;
    public static final int GL_STENCIL_CLEAR_VALUE = 2961;
    public static final int GL_STENCIL_FUNC = 2962;
    public static final int GL_STENCIL_VALUE_MASK = 2963;
    public static final int GL_STENCIL_FAIL = 2964;
    public static final int GL_STENCIL_PASS_DEPTH_FAIL = 2965;
    public static final int GL_STENCIL_PASS_DEPTH_PASS = 2966;
    public static final int GL_STENCIL_REF = 2967;
    public static final int GL_STENCIL_WRITEMASK = 2968;
    public static final int GL_MATRIX_MODE = 2976;
    public static final int GL_NORMALIZE = 2977;
    public static final int GL_VIEWPORT = 2978;
    public static final int GL_MODELVIEW_STACK_DEPTH = 2979;
    public static final int GL_PROJECTION_STACK_DEPTH = 2980;
    public static final int GL_TEXTURE_STACK_DEPTH = 2981;
    public static final int GL_MODELVIEW_MATRIX = 2982;
    public static final int GL_PROJECTION_MATRIX = 2983;
    public static final int GL_TEXTURE_MATRIX = 2984;
    public static final int GL_ATTRIB_STACK_DEPTH = 2992;
    public static final int GL_CLIENT_ATTRIB_STACK_DEPTH = 2993;
    public static final int GL_ALPHA_TEST = 3008;
    public static final int GL_ALPHA_TEST_FUNC = 3009;
    public static final int GL_ALPHA_TEST_REF = 3010;
    public static final int GL_DITHER = 3024;
    public static final int GL_BLEND_DST = 3040;
    public static final int GL_BLEND_SRC = 3041;
    public static final int GL_BLEND = 3042;
    public static final int GL_LOGIC_OP_MODE = 3056;
    public static final int GL_INDEX_LOGIC_OP = 3057;
    public static final int GL_LOGIC_OP = 3057;
    public static final int GL_COLOR_LOGIC_OP = 3058;
    public static final int GL_AUX_BUFFERS = 3072;
    public static final int GL_DRAW_BUFFER = 3073;
    public static final int GL_READ_BUFFER = 3074;
    public static final int GL_SCISSOR_BOX = 3088;
    public static final int GL_SCISSOR_TEST = 3089;
    public static final int GL_INDEX_CLEAR_VALUE = 3104;
    public static final int GL_INDEX_WRITEMASK = 3105;
    public static final int GL_COLOR_CLEAR_VALUE = 3106;
    public static final int GL_COLOR_WRITEMASK = 3107;
    public static final int GL_INDEX_MODE = 3120;
    public static final int GL_RGBA_MODE = 3121;
    public static final int GL_DOUBLEBUFFER = 3122;
    public static final int GL_STEREO = 3123;
    public static final int GL_RENDER_MODE = 3136;
    public static final int GL_PERSPECTIVE_CORRECTION_HINT = 3152;
    public static final int GL_POINT_SMOOTH_HINT = 3153;
    public static final int GL_LINE_SMOOTH_HINT = 3154;
    public static final int GL_POLYGON_SMOOTH_HINT = 3155;
    public static final int GL_FOG_HINT = 3156;
    public static final int GL_TEXTURE_GEN_S = 3168;
    public static final int GL_TEXTURE_GEN_T = 3169;
    public static final int GL_TEXTURE_GEN_R = 3170;
    public static final int GL_TEXTURE_GEN_Q = 3171;
    public static final int GL_PIXEL_MAP_I_TO_I = 3184;
    public static final int GL_PIXEL_MAP_S_TO_S = 3185;
    public static final int GL_PIXEL_MAP_I_TO_R = 3186;
    public static final int GL_PIXEL_MAP_I_TO_G = 3187;
    public static final int GL_PIXEL_MAP_I_TO_B = 3188;
    public static final int GL_PIXEL_MAP_I_TO_A = 3189;
    public static final int GL_PIXEL_MAP_R_TO_R = 3190;
    public static final int GL_PIXEL_MAP_G_TO_G = 3191;
    public static final int GL_PIXEL_MAP_B_TO_B = 3192;
    public static final int GL_PIXEL_MAP_A_TO_A = 3193;
    public static final int GL_PIXEL_MAP_I_TO_I_SIZE = 3248;
    public static final int GL_PIXEL_MAP_S_TO_S_SIZE = 3249;
    public static final int GL_PIXEL_MAP_I_TO_R_SIZE = 3250;
    public static final int GL_PIXEL_MAP_I_TO_G_SIZE = 3251;
    public static final int GL_PIXEL_MAP_I_TO_B_SIZE = 3252;
    public static final int GL_PIXEL_MAP_I_TO_A_SIZE = 3253;
    public static final int GL_PIXEL_MAP_R_TO_R_SIZE = 3254;
    public static final int GL_PIXEL_MAP_G_TO_G_SIZE = 3255;
    public static final int GL_PIXEL_MAP_B_TO_B_SIZE = 3256;
    public static final int GL_PIXEL_MAP_A_TO_A_SIZE = 3257;
    public static final int GL_UNPACK_SWAP_BYTES = 3312;
    public static final int GL_UNPACK_LSB_FIRST = 3313;
    public static final int GL_UNPACK_ROW_LENGTH = 3314;
    public static final int GL_UNPACK_SKIP_ROWS = 3315;
    public static final int GL_UNPACK_SKIP_PIXELS = 3316;
    public static final int GL_UNPACK_ALIGNMENT = 3317;
    public static final int GL_PACK_SWAP_BYTES = 3328;
    public static final int GL_PACK_LSB_FIRST = 3329;
    public static final int GL_PACK_ROW_LENGTH = 3330;
    public static final int GL_PACK_SKIP_ROWS = 3331;
    public static final int GL_PACK_SKIP_PIXELS = 3332;
    public static final int GL_PACK_ALIGNMENT = 3333;
    public static final int GL_MAP_COLOR = 3344;
    public static final int GL_MAP_STENCIL = 3345;
    public static final int GL_INDEX_SHIFT = 3346;
    public static final int GL_INDEX_OFFSET = 3347;
    public static final int GL_RED_SCALE = 3348;
    public static final int GL_RED_BIAS = 3349;
    public static final int GL_ZOOM_X = 3350;
    public static final int GL_ZOOM_Y = 3351;
    public static final int GL_GREEN_SCALE = 3352;
    public static final int GL_GREEN_BIAS = 3353;
    public static final int GL_BLUE_SCALE = 3354;
    public static final int GL_BLUE_BIAS = 3355;
    public static final int GL_ALPHA_SCALE = 3356;
    public static final int GL_ALPHA_BIAS = 3357;
    public static final int GL_DEPTH_SCALE = 3358;
    public static final int GL_DEPTH_BIAS = 3359;
    public static final int GL_MAX_EVAL_ORDER = 3376;
    public static final int GL_MAX_LIGHTS = 3377;
    public static final int GL_MAX_CLIP_PLANES = 3378;
    public static final int GL_MAX_TEXTURE_SIZE = 3379;
    public static final int GL_MAX_PIXEL_MAP_TABLE = 3380;
    public static final int GL_MAX_ATTRIB_STACK_DEPTH = 3381;
    public static final int GL_MAX_MODELVIEW_STACK_DEPTH = 3382;
    public static final int GL_MAX_NAME_STACK_DEPTH = 3383;
    public static final int GL_MAX_PROJECTION_STACK_DEPTH = 3384;
    public static final int GL_MAX_TEXTURE_STACK_DEPTH = 3385;
    public static final int GL_MAX_VIEWPORT_DIMS = 3386;
    public static final int GL_MAX_CLIENT_ATTRIB_STACK_DEPTH = 3387;
    public static final int GL_SUBPIXEL_BITS = 3408;
    public static final int GL_INDEX_BITS = 3409;
    public static final int GL_RED_BITS = 3410;
    public static final int GL_GREEN_BITS = 3411;
    public static final int GL_BLUE_BITS = 3412;
    public static final int GL_ALPHA_BITS = 3413;
    public static final int GL_DEPTH_BITS = 3414;
    public static final int GL_STENCIL_BITS = 3415;
    public static final int GL_ACCUM_RED_BITS = 3416;
    public static final int GL_ACCUM_GREEN_BITS = 3417;
    public static final int GL_ACCUM_BLUE_BITS = 3418;
    public static final int GL_ACCUM_ALPHA_BITS = 3419;
    public static final int GL_NAME_STACK_DEPTH = 3440;
    public static final int GL_AUTO_NORMAL = 3456;
    public static final int GL_MAP1_COLOR_4 = 3472;
    public static final int GL_MAP1_INDEX = 3473;
    public static final int GL_MAP1_NORMAL = 3474;
    public static final int GL_MAP1_TEXTURE_COORD_1 = 3475;
    public static final int GL_MAP1_TEXTURE_COORD_2 = 3476;
    public static final int GL_MAP1_TEXTURE_COORD_3 = 3477;
    public static final int GL_MAP1_TEXTURE_COORD_4 = 3478;
    public static final int GL_MAP1_VERTEX_3 = 3479;
    public static final int GL_MAP1_VERTEX_4 = 3480;
    public static final int GL_MAP2_COLOR_4 = 3504;
    public static final int GL_MAP2_INDEX = 3505;
    public static final int GL_MAP2_NORMAL = 3506;
    public static final int GL_MAP2_TEXTURE_COORD_1 = 3507;
    public static final int GL_MAP2_TEXTURE_COORD_2 = 3508;
    public static final int GL_MAP2_TEXTURE_COORD_3 = 3509;
    public static final int GL_MAP2_TEXTURE_COORD_4 = 3510;
    public static final int GL_MAP2_VERTEX_3 = 3511;
    public static final int GL_MAP2_VERTEX_4 = 3512;
    public static final int GL_MAP1_GRID_DOMAIN = 3536;
    public static final int GL_MAP1_GRID_SEGMENTS = 3537;
    public static final int GL_MAP2_GRID_DOMAIN = 3538;
    public static final int GL_MAP2_GRID_SEGMENTS = 3539;
    public static final int GL_TEXTURE_1D = 3552;
    public static final int GL_TEXTURE_2D = 3553;
    public static final int GL_FEEDBACK_BUFFER_POINTER = 3568;
    public static final int GL_FEEDBACK_BUFFER_SIZE = 3569;
    public static final int GL_FEEDBACK_BUFFER_TYPE = 3570;
    public static final int GL_SELECTION_BUFFER_POINTER = 3571;
    public static final int GL_SELECTION_BUFFER_SIZE = 3572;
    public static final int GL_TEXTURE_WIDTH = 4096;
    public static final int GL_TEXTURE_HEIGHT = 4097;
    public static final int GL_TEXTURE_INTERNAL_FORMAT = 4099;
    public static final int GL_TEXTURE_COMPONENTS = 4099;
    public static final int GL_TEXTURE_BORDER_COLOR = 4100;
    public static final int GL_TEXTURE_BORDER = 4101;
    public static final int GL_DONT_CARE = 4352;
    public static final int GL_FASTEST = 4353;
    public static final int GL_NICEST = 4354;
    public static final int GL_LIGHT0 = 16384;
    public static final int GL_LIGHT1 = 16385;
    public static final int GL_LIGHT2 = 16386;
    public static final int GL_LIGHT3 = 16387;
    public static final int GL_LIGHT4 = 16388;
    public static final int GL_LIGHT5 = 16389;
    public static final int GL_LIGHT6 = 16390;
    public static final int GL_LIGHT7 = 16391;
    public static final int GL_AMBIENT = 4608;
    public static final int GL_DIFFUSE = 4609;
    public static final int GL_SPECULAR = 4610;
    public static final int GL_POSITION = 4611;
    public static final int GL_SPOT_DIRECTION = 4612;
    public static final int GL_SPOT_EXPONENT = 4613;
    public static final int GL_SPOT_CUTOFF = 4614;
    public static final int GL_CONSTANT_ATTENUATION = 4615;
    public static final int GL_LINEAR_ATTENUATION = 4616;
    public static final int GL_QUADRATIC_ATTENUATION = 4617;
    public static final int GL_COMPILE = 4864;
    public static final int GL_COMPILE_AND_EXECUTE = 4865;
    public static final int GL_CLEAR = 5376;
    public static final int GL_AND = 5377;
    public static final int GL_AND_REVERSE = 5378;
    public static final int GL_COPY = 5379;
    public static final int GL_AND_INVERTED = 5380;
    public static final int GL_NOOP = 5381;
    public static final int GL_XOR = 5382;
    public static final int GL_OR = 5383;
    public static final int GL_NOR = 5384;
    public static final int GL_EQUIV = 5385;
    public static final int GL_INVERT = 5386;
    public static final int GL_OR_REVERSE = 5387;
    public static final int GL_COPY_INVERTED = 5388;
    public static final int GL_OR_INVERTED = 5389;
    public static final int GL_NAND = 5390;
    public static final int GL_SET = 5391;
    public static final int GL_EMISSION = 5632;
    public static final int GL_SHININESS = 5633;
    public static final int GL_AMBIENT_AND_DIFFUSE = 5634;
    public static final int GL_COLOR_INDEXES = 5635;
    public static final int GL_MODELVIEW = 5888;
    public static final int GL_PROJECTION = 5889;
    public static final int GL_TEXTURE = 5890;
    public static final int GL_COLOR = 6144;
    public static final int GL_DEPTH = 6145;
    public static final int GL_STENCIL = 6146;
    public static final int GL_COLOR_INDEX = 6400;
    public static final int GL_STENCIL_INDEX = 6401;
    public static final int GL_DEPTH_COMPONENT = 6402;
    public static final int GL_RED = 6403;
    public static final int GL_GREEN = 6404;
    public static final int GL_BLUE = 6405;
    public static final int GL_ALPHA = 6406;
    public static final int GL_RGB = 6407;
    public static final int GL_RGBA = 6408;
    public static final int GL_LUMINANCE = 6409;
    public static final int GL_LUMINANCE_ALPHA = 6410;
    public static final int GL_BITMAP = 6656;
    public static final int GL_POINT = 6912;
    public static final int GL_LINE = 6913;
    public static final int GL_FILL = 6914;
    public static final int GL_RENDER = 7168;
    public static final int GL_FEEDBACK = 7169;
    public static final int GL_SELECT = 7170;
    public static final int GL_FLAT = 7424;
    public static final int GL_SMOOTH = 7425;
    public static final int GL_KEEP = 7680;
    public static final int GL_REPLACE = 7681;
    public static final int GL_INCR = 7682;
    public static final int GL_DECR = 7683;
    public static final int GL_VENDOR = 7936;
    public static final int GL_RENDERER = 7937;
    public static final int GL_VERSION = 7938;
    public static final int GL_EXTENSIONS = 7939;
    public static final int GL_S = 8192;
    public static final int GL_T = 8193;
    public static final int GL_R = 8194;
    public static final int GL_Q = 8195;
    public static final int GL_MODULATE = 8448;
    public static final int GL_DECAL = 8449;
    public static final int GL_TEXTURE_ENV_MODE = 8704;
    public static final int GL_TEXTURE_ENV_COLOR = 8705;
    public static final int GL_TEXTURE_ENV = 8960;
    public static final int GL_EYE_LINEAR = 9216;
    public static final int GL_OBJECT_LINEAR = 9217;
    public static final int GL_SPHERE_MAP = 9218;
    public static final int GL_TEXTURE_GEN_MODE = 9472;
    public static final int GL_OBJECT_PLANE = 9473;
    public static final int GL_EYE_PLANE = 9474;
    public static final int GL_NEAREST = 9728;
    public static final int GL_LINEAR = 9729;
    public static final int GL_NEAREST_MIPMAP_NEAREST = 9984;
    public static final int GL_LINEAR_MIPMAP_NEAREST = 9985;
    public static final int GL_NEAREST_MIPMAP_LINEAR = 9986;
    public static final int GL_LINEAR_MIPMAP_LINEAR = 9987;
    public static final int GL_TEXTURE_MAG_FILTER = 10240;
    public static final int GL_TEXTURE_MIN_FILTER = 10241;
    public static final int GL_TEXTURE_WRAP_S = 10242;
    public static final int GL_TEXTURE_WRAP_T = 10243;
    public static final int GL_CLAMP = 10496;
    public static final int GL_REPEAT = 10497;
    public static final int GL_CLIENT_PIXEL_STORE_BIT = 1;
    public static final int GL_CLIENT_VERTEX_ARRAY_BIT = 2;
    public static final int GL_CLIENT_ALL_ATTRIB_BITS = -1;
    public static final int GL_POLYGON_OFFSET_FACTOR = 32824;
    public static final int GL_POLYGON_OFFSET_UNITS = 10752;
    public static final int GL_POLYGON_OFFSET_POINT = 10753;
    public static final int GL_POLYGON_OFFSET_LINE = 10754;
    public static final int GL_POLYGON_OFFSET_FILL = 32823;
    public static final int GL_ALPHA4 = 32827;
    public static final int GL_ALPHA8 = 32828;
    public static final int GL_ALPHA12 = 32829;
    public static final int GL_ALPHA16 = 32830;
    public static final int GL_LUMINANCE4 = 32831;
    public static final int GL_LUMINANCE8 = 32832;
    public static final int GL_LUMINANCE12 = 32833;
    public static final int GL_LUMINANCE16 = 32834;
    public static final int GL_LUMINANCE4_ALPHA4 = 32835;
    public static final int GL_LUMINANCE6_ALPHA2 = 32836;
    public static final int GL_LUMINANCE8_ALPHA8 = 32837;
    public static final int GL_LUMINANCE12_ALPHA4 = 32838;
    public static final int GL_LUMINANCE12_ALPHA12 = 32839;
    public static final int GL_LUMINANCE16_ALPHA16 = 32840;
    public static final int GL_INTENSITY = 32841;
    public static final int GL_INTENSITY4 = 32842;
    public static final int GL_INTENSITY8 = 32843;
    public static final int GL_INTENSITY12 = 32844;
    public static final int GL_INTENSITY16 = 32845;
    public static final int GL_R3_G3_B2 = 10768;
    public static final int GL_RGB4 = 32847;
    public static final int GL_RGB5 = 32848;
    public static final int GL_RGB8 = 32849;
    public static final int GL_RGB10 = 32850;
    public static final int GL_RGB12 = 32851;
    public static final int GL_RGB16 = 32852;
    public static final int GL_RGBA2 = 32853;
    public static final int GL_RGBA4 = 32854;
    public static final int GL_RGB5_A1 = 32855;
    public static final int GL_RGBA8 = 32856;
    public static final int GL_RGB10_A2 = 32857;
    public static final int GL_RGBA12 = 32858;
    public static final int GL_RGBA16 = 32859;
    public static final int GL_TEXTURE_RED_SIZE = 32860;
    public static final int GL_TEXTURE_GREEN_SIZE = 32861;
    public static final int GL_TEXTURE_BLUE_SIZE = 32862;
    public static final int GL_TEXTURE_ALPHA_SIZE = 32863;
    public static final int GL_TEXTURE_LUMINANCE_SIZE = 32864;
    public static final int GL_TEXTURE_INTENSITY_SIZE = 32865;
    public static final int GL_PROXY_TEXTURE_1D = 32867;
    public static final int GL_PROXY_TEXTURE_2D = 32868;
    public static final int GL_TEXTURE_PRIORITY = 32870;
    public static final int GL_TEXTURE_RESIDENT = 32871;
    public static final int GL_TEXTURE_BINDING_1D = 32872;
    public static final int GL_TEXTURE_BINDING_2D = 32873;
    public static final int GL_VERTEX_ARRAY = 32884;
    public static final int GL_NORMAL_ARRAY = 32885;
    public static final int GL_COLOR_ARRAY = 32886;
    public static final int GL_INDEX_ARRAY = 32887;
    public static final int GL_TEXTURE_COORD_ARRAY = 32888;
    public static final int GL_EDGE_FLAG_ARRAY = 32889;
    public static final int GL_VERTEX_ARRAY_SIZE = 32890;
    public static final int GL_VERTEX_ARRAY_TYPE = 32891;
    public static final int GL_VERTEX_ARRAY_STRIDE = 32892;
    public static final int GL_NORMAL_ARRAY_TYPE = 32894;
    public static final int GL_NORMAL_ARRAY_STRIDE = 32895;
    public static final int GL_COLOR_ARRAY_SIZE = 32897;
    public static final int GL_COLOR_ARRAY_TYPE = 32898;
    public static final int GL_COLOR_ARRAY_STRIDE = 32899;
    public static final int GL_INDEX_ARRAY_TYPE = 32901;
    public static final int GL_INDEX_ARRAY_STRIDE = 32902;
    public static final int GL_TEXTURE_COORD_ARRAY_SIZE = 32904;
    public static final int GL_TEXTURE_COORD_ARRAY_TYPE = 32905;
    public static final int GL_TEXTURE_COORD_ARRAY_STRIDE = 32906;
    public static final int GL_EDGE_FLAG_ARRAY_STRIDE = 32908;
    public static final int GL_VERTEX_ARRAY_POINTER = 32910;
    public static final int GL_NORMAL_ARRAY_POINTER = 32911;
    public static final int GL_COLOR_ARRAY_POINTER = 32912;
    public static final int GL_INDEX_ARRAY_POINTER = 32913;
    public static final int GL_TEXTURE_COORD_ARRAY_POINTER = 32914;
    public static final int GL_EDGE_FLAG_ARRAY_POINTER = 32915;
    public static final int GL_V2F = 10784;
    public static final int GL_V3F = 10785;
    public static final int GL_C4UB_V2F = 10786;
    public static final int GL_C4UB_V3F = 10787;
    public static final int GL_C3F_V3F = 10788;
    public static final int GL_N3F_V3F = 10789;
    public static final int GL_C4F_N3F_V3F = 10790;
    public static final int GL_T2F_V3F = 10791;
    public static final int GL_T4F_V4F = 10792;
    public static final int GL_T2F_C4UB_V3F = 10793;
    public static final int GL_T2F_C3F_V3F = 10794;
    public static final int GL_T2F_N3F_V3F = 10795;
    public static final int GL_T2F_C4F_N3F_V3F = 10796;
    public static final int GL_T4F_C4F_N3F_V4F = 10797;

    public static void glColorPointer(int r5, boolean r6, int r7, java.nio.ByteBuffer r8) {
            r0 = r5
            r1 = r6
            if (r1 == 0) goto Lb
            r1 = 5121(0x1401, float:7.176E-42)
            goto Le
        Lb:
            r1 = 5120(0x1400, float:7.175E-42)
        Le:
            r2 = r7
            r3 = r8
            glColorPointer(r0, r1, r2, r3)
            return
    }

    public static void glColorPointer(int r5, int r6, java.nio.FloatBuffer r7) {
            r0 = r5
            r1 = 5126(0x1406, float:7.183E-42)
            r2 = r6
            r3 = r7
            glColorPointer(r0, r1, r2, r3)
            return
    }

    public static void glFog(int r3, java.nio.FloatBuffer r4) {
            r0 = r3
            r1 = r4
            glFogfv(r0, r1)
            return
    }

    public static void glFog(int r3, java.nio.IntBuffer r4) {
            r0 = r3
            r1 = r4
            glFogiv(r0, r1)
            return
    }

    public static void glGetBoolean(int r3, java.nio.ByteBuffer r4) {
            r0 = r3
            r1 = r4
            glGetBooleanv(r0, r1)
            return
    }

    public static void glGetDouble(int r3, java.nio.DoubleBuffer r4) {
            r0 = r3
            r1 = r4
            glGetDoublev(r0, r1)
            return
    }

    public static void glGetFloat(int r3, java.nio.FloatBuffer r4) {
            r0 = r3
            r1 = r4
            glGetFloatv(r0, r1)
            return
    }

    public static void glGetInteger(int r3, java.nio.IntBuffer r4) {
            r0 = r3
            r1 = r4
            glGetIntegerv(r0, r1)
            return
    }

    public static void glGetLight(int r4, int r5, java.nio.FloatBuffer r6) {
            r0 = r4
            r1 = r5
            r2 = r6
            glGetLightfv(r0, r1, r2)
            return
    }

    public static void glGetLight(int r4, int r5, java.nio.IntBuffer r6) {
            r0 = r4
            r1 = r5
            r2 = r6
            glGetLightiv(r0, r1, r2)
            return
    }

    public static void glGetMap(int r4, int r5, java.nio.DoubleBuffer r6) {
            r0 = r4
            r1 = r5
            r2 = r6
            glGetMapdv(r0, r1, r2)
            return
    }

    public static void glGetMap(int r4, int r5, java.nio.FloatBuffer r6) {
            r0 = r4
            r1 = r5
            r2 = r6
            glGetMapfv(r0, r1, r2)
            return
    }

    public static void glGetMap(int r4, int r5, java.nio.IntBuffer r6) {
            r0 = r4
            r1 = r5
            r2 = r6
            glGetMapiv(r0, r1, r2)
            return
    }

    public static void glGetMaterial(int r4, int r5, java.nio.FloatBuffer r6) {
            r0 = r4
            r1 = r5
            r2 = r6
            glGetMaterialfv(r0, r1, r2)
            return
    }

    public static void glGetMaterial(int r4, int r5, java.nio.IntBuffer r6) {
            r0 = r4
            r1 = r5
            r2 = r6
            glGetMaterialiv(r0, r1, r2)
            return
    }

    public static void glGetPixelMap(int r3, java.nio.FloatBuffer r4) {
            r0 = r3
            r1 = r4
            glGetPixelMapfv(r0, r1)
            return
    }

    public static void glGetPixelMapu(int r3, java.nio.IntBuffer r4) {
            r0 = r3
            r1 = r4
            glGetPixelMapuiv(r0, r1)
            return
    }

    public static void glGetPixelMapu(int r3, java.nio.ShortBuffer r4) {
            r0 = r3
            r1 = r4
            glGetPixelMapusv(r0, r1)
            return
    }

    public static void glGetTexEnv(int r4, int r5, java.nio.FloatBuffer r6) {
            r0 = r4
            r1 = r5
            r2 = r6
            glGetTexEnvfv(r0, r1, r2)
            return
    }

    public static void glGetTexEnv(int r4, int r5, java.nio.IntBuffer r6) {
            r0 = r4
            r1 = r5
            r2 = r6
            glGetTexEnviv(r0, r1, r2)
            return
    }

    public static void glGetTexGen(int r4, int r5, java.nio.DoubleBuffer r6) {
            r0 = r4
            r1 = r5
            r2 = r6
            glGetTexGendv(r0, r1, r2)
            return
    }

    public static void glGetTexGen(int r4, int r5, java.nio.FloatBuffer r6) {
            r0 = r4
            r1 = r5
            r2 = r6
            glGetTexGenfv(r0, r1, r2)
            return
    }

    public static void glGetTexGen(int r4, int r5, java.nio.IntBuffer r6) {
            r0 = r4
            r1 = r5
            r2 = r6
            glGetTexGeniv(r0, r1, r2)
            return
    }

    public static void glGetTexLevelParameter(int r5, int r6, int r7, java.nio.FloatBuffer r8) {
            r0 = r5
            r1 = r6
            r2 = r7
            r3 = r8
            glGetTexLevelParameterfv(r0, r1, r2, r3)
            return
    }

    public static void glGetTexLevelParameter(int r5, int r6, int r7, java.nio.IntBuffer r8) {
            r0 = r5
            r1 = r6
            r2 = r7
            r3 = r8
            glGetTexLevelParameteriv(r0, r1, r2, r3)
            return
    }

    public static void glGetTexParameter(int r4, int r5, java.nio.FloatBuffer r6) {
            r0 = r4
            r1 = r5
            r2 = r6
            glGetTexParameterfv(r0, r1, r2)
            return
    }

    public static void glGetTexParameter(int r4, int r5, java.nio.IntBuffer r6) {
            r0 = r4
            r1 = r5
            r2 = r6
            glGetTexParameteriv(r0, r1, r2)
            return
    }

    public static void glLight(int r4, int r5, java.nio.FloatBuffer r6) {
            r0 = r4
            r1 = r5
            r2 = r6
            glLightfv(r0, r1, r2)
            return
    }

    public static void glLight(int r4, int r5, java.nio.IntBuffer r6) {
            r0 = r4
            r1 = r5
            r2 = r6
            glLightiv(r0, r1, r2)
            return
    }

    public static void glLightModel(int r3, java.nio.FloatBuffer r4) {
            r0 = r3
            r1 = r4
            glLightModelfv(r0, r1)
            return
    }

    public static void glLightModel(int r3, java.nio.IntBuffer r4) {
            r0 = r3
            r1 = r4
            glLightModeliv(r0, r1)
            return
    }

    public static void glLoadMatrix(java.nio.DoubleBuffer r2) {
            r0 = r2
            glLoadMatrixd(r0)
            return
    }

    public static void glLoadMatrix(java.nio.FloatBuffer r2) {
            r0 = r2
            glLoadMatrixf(r0)
            return
    }

    public static void glMaterial(int r4, int r5, java.nio.FloatBuffer r6) {
            r0 = r4
            r1 = r5
            r2 = r6
            glMaterialfv(r0, r1, r2)
            return
    }

    public static void glMaterial(int r4, int r5, java.nio.IntBuffer r6) {
            r0 = r4
            r1 = r5
            r2 = r6
            glMaterialiv(r0, r1, r2)
            return
    }

    public static void glMultMatrix(java.nio.DoubleBuffer r2) {
            r0 = r2
            glMultMatrixd(r0)
            return
    }

    public static void glMultMatrix(java.nio.FloatBuffer r2) {
            r0 = r2
            glMultMatrixf(r0)
            return
    }

    public static void glNormalPointer(int r4, java.nio.ByteBuffer r5) {
            r0 = 5120(0x1400, float:7.175E-42)
            r1 = r4
            r2 = r5
            glNormalPointer(r0, r1, r2)
            return
    }

    public static void glNormalPointer(int r4, java.nio.FloatBuffer r5) {
            r0 = 5126(0x1406, float:7.183E-42)
            r1 = r4
            r2 = r5
            glNormalPointer(r0, r1, r2)
            return
    }

    public static void glNormalPointer(int r4, java.nio.IntBuffer r5) {
            r0 = 5124(0x1404, float:7.18E-42)
            r1 = r4
            r2 = r5
            glNormalPointer(r0, r1, r2)
            return
    }

    public static void glNormalPointer(int r4, java.nio.ShortBuffer r5) {
            r0 = 5122(0x1402, float:7.177E-42)
            r1 = r4
            r2 = r5
            glNormalPointer(r0, r1, r2)
            return
    }

    public static void glPixelMap(int r3, java.nio.FloatBuffer r4) {
            r0 = r3
            r1 = r4
            glPixelMapfv(r0, r1)
            return
    }

    public static void glPixelMapu(int r3, java.nio.IntBuffer r4) {
            r0 = r3
            r1 = r4
            glPixelMapuiv(r0, r1)
            return
    }

    public static void glPixelMapu(int r3, java.nio.ShortBuffer r4) {
            r0 = r3
            r1 = r4
            glPixelMapusv(r0, r1)
            return
    }

    public static void glTexCoordPointer(int r5, int r6, java.nio.FloatBuffer r7) {
            r0 = r5
            r1 = 5126(0x1406, float:7.183E-42)
            r2 = r6
            r3 = r7
            glTexCoordPointer(r0, r1, r2, r3)
            return
    }

    public static void glTexCoordPointer(int r5, int r6, java.nio.IntBuffer r7) {
            r0 = r5
            r1 = 5124(0x1404, float:7.18E-42)
            r2 = r6
            r3 = r7
            glTexCoordPointer(r0, r1, r2, r3)
            return
    }

    public static void glTexCoordPointer(int r5, int r6, java.nio.ShortBuffer r7) {
            r0 = r5
            r1 = 5122(0x1402, float:7.177E-42)
            r2 = r6
            r3 = r7
            glTexCoordPointer(r0, r1, r2, r3)
            return
    }

    public static void glTexEnv(int r4, int r5, java.nio.FloatBuffer r6) {
            r0 = r4
            r1 = r5
            r2 = r6
            glTexEnvfv(r0, r1, r2)
            return
    }

    public static void glTexEnv(int r4, int r5, java.nio.IntBuffer r6) {
            r0 = r4
            r1 = r5
            r2 = r6
            glTexEnviv(r0, r1, r2)
            return
    }

    public static void glTexGen(int r4, int r5, java.nio.DoubleBuffer r6) {
            r0 = r4
            r1 = r5
            r2 = r6
            glTexGendv(r0, r1, r2)
            return
    }

    public static void glTexGen(int r4, int r5, java.nio.FloatBuffer r6) {
            r0 = r4
            r1 = r5
            r2 = r6
            glTexGenfv(r0, r1, r2)
            return
    }

    public static void glTexGen(int r4, int r5, java.nio.IntBuffer r6) {
            r0 = r4
            r1 = r5
            r2 = r6
            glTexGeniv(r0, r1, r2)
            return
    }

    public static void glVertexPointer(int r5, int r6, java.nio.FloatBuffer r7) {
            r0 = r5
            r1 = 5126(0x1406, float:7.183E-42)
            r2 = r6
            r3 = r7
            glVertexPointer(r0, r1, r2, r3)
            return
    }

    public static void glVertexPointer(int r5, int r6, java.nio.IntBuffer r7) {
            r0 = r5
            r1 = 5124(0x1404, float:7.18E-42)
            r2 = r6
            r3 = r7
            glVertexPointer(r0, r1, r2, r3)
            return
    }

    public static void glVertexPointer(int r5, int r6, java.nio.ShortBuffer r7) {
            r0 = r5
            r1 = 5122(0x1402, float:7.177E-42)
            r2 = r6
            r3 = r7
            glVertexPointer(r0, r1, r2, r3)
            return
    }

    protected GL11() {
            r3 = this;
            r0 = r3
            r0.<init>()
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r1 = r0
            r1.<init>()
            throw r0
    }

    public static void glEnable(@org.lwjgl.system.NativeType("GLenum") int r2) {
            r0 = r2
            org.lwjgl.opengl.GL11C.glEnable(r0)
            return
    }

    public static void glDisable(@org.lwjgl.system.NativeType("GLenum") int r2) {
            r0 = r2
            org.lwjgl.opengl.GL11C.glDisable(r0)
            return
    }

    public static native void glAccum(@org.lwjgl.system.NativeType("GLenum") int r0, @org.lwjgl.system.NativeType("GLfloat") float r1);

    public static native void glAlphaFunc(@org.lwjgl.system.NativeType("GLenum") int r0, @org.lwjgl.system.NativeType("GLfloat") float r1);

    public static native boolean nglAreTexturesResident(int r0, long r1, long r3);

    @org.lwjgl.system.NativeType("GLboolean")
    public static boolean glAreTexturesResident(@org.lwjgl.system.NativeType("GLuint const *") java.nio.IntBuffer r6, @org.lwjgl.system.NativeType("GLboolean *") java.nio.ByteBuffer r7) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Le
            r0 = r7
            r1 = r6
            int r1 = r1.remaining()
            org.lwjgl.system.Checks.check(r0, r1)
        Le:
            r0 = r6
            int r0 = r0.remaining()
            r1 = r6
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            r2 = r7
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            boolean r0 = nglAreTexturesResident(r0, r1, r2)
            return r0
    }

    @org.lwjgl.system.NativeType("GLboolean")
    public static boolean glAreTexturesResident(@org.lwjgl.system.NativeType("GLuint const *") int r6, @org.lwjgl.system.NativeType("GLboolean *") java.nio.ByteBuffer r7) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r7
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
        Lb:
            org.lwjgl.system.MemoryStack r0 = org.lwjgl.system.MemoryStack.stackGet()
            r8 = r0
            r0 = r8
            int r0 = r0.getPointer()
            r9 = r0
            r0 = r8
            r1 = r6
            java.nio.IntBuffer r0 = r0.ints(r1)     // Catch: java.lang.Throwable -> L32
            r10 = r0
            r0 = 1
            r1 = r10
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)     // Catch: java.lang.Throwable -> L32
            r2 = r7
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)     // Catch: java.lang.Throwable -> L32
            boolean r0 = nglAreTexturesResident(r0, r1, r2)     // Catch: java.lang.Throwable -> L32
            r11 = r0
            r0 = r8
            r1 = r9
            r0.setPointer(r1)
            r0 = r11
            return r0
        L32:
            r12 = move-exception
            r0 = r8
            r1 = r9
            r0.setPointer(r1)
            r0 = r12
            throw r0
    }

    public static native void glArrayElement(@org.lwjgl.system.NativeType("GLint") int r0);

    public static native void glBegin(@org.lwjgl.system.NativeType("GLenum") int r0);

    public static void glBindTexture(@org.lwjgl.system.NativeType("GLenum") int r3, @org.lwjgl.system.NativeType("GLuint") int r4) {
            r0 = r3
            r1 = r4
            org.lwjgl.opengl.GL11C.glBindTexture(r0, r1)
            return
    }

    public static native void nglBitmap(int r0, int r1, float r2, float r3, float r4, float r5, long r6);

    public static void glBitmap(@org.lwjgl.system.NativeType("GLsizei") int r9, @org.lwjgl.system.NativeType("GLsizei") int r10, @org.lwjgl.system.NativeType("GLfloat") float r11, @org.lwjgl.system.NativeType("GLfloat") float r12, @org.lwjgl.system.NativeType("GLfloat") float r13, @org.lwjgl.system.NativeType("GLfloat") float r14, @javax.annotation.Nullable @org.lwjgl.system.NativeType("GLubyte const *") java.nio.ByteBuffer r15) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L13
            r0 = r15
            r1 = r9
            r2 = 7
            int r1 = r1 + r2
            r2 = 3
            int r1 = r1 >> r2
            r2 = r10
            int r1 = r1 * r2
            org.lwjgl.system.Checks.checkSafe(r0, r1)
        L13:
            r0 = r9
            r1 = r10
            r2 = r11
            r3 = r12
            r4 = r13
            r5 = r14
            r6 = r15
            long r6 = org.lwjgl.system.MemoryUtil.memAddressSafe(r6)
            nglBitmap(r0, r1, r2, r3, r4, r5, r6)
            return
    }

    public static void glBitmap(@org.lwjgl.system.NativeType("GLsizei") int r9, @org.lwjgl.system.NativeType("GLsizei") int r10, @org.lwjgl.system.NativeType("GLfloat") float r11, @org.lwjgl.system.NativeType("GLfloat") float r12, @org.lwjgl.system.NativeType("GLfloat") float r13, @org.lwjgl.system.NativeType("GLfloat") float r14, @org.lwjgl.system.NativeType("GLubyte const *") long r15) {
            r0 = r9
            r1 = r10
            r2 = r11
            r3 = r12
            r4 = r13
            r5 = r14
            r6 = r15
            nglBitmap(r0, r1, r2, r3, r4, r5, r6)
            return
    }

    public static void glBlendFunc(@org.lwjgl.system.NativeType("GLenum") int r3, @org.lwjgl.system.NativeType("GLenum") int r4) {
            r0 = r3
            r1 = r4
            org.lwjgl.opengl.GL11C.glBlendFunc(r0, r1)
            return
    }

    public static native void glCallList(@org.lwjgl.system.NativeType("GLuint") int r0);

    public static native void nglCallLists(int r0, int r1, long r2);

    public static void glCallLists(@org.lwjgl.system.NativeType("GLenum") int r5, @org.lwjgl.system.NativeType("void const *") java.nio.ByteBuffer r6) {
            r0 = r6
            int r0 = r0.remaining()
            r1 = r5
            int r1 = org.lwjgl.opengl.GLChecks.typeToBytes(r1)
            int r0 = r0 / r1
            r1 = r5
            r2 = r6
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            nglCallLists(r0, r1, r2)
            return
    }

    public static void glCallLists(@org.lwjgl.system.NativeType("void const *") java.nio.ByteBuffer r5) {
            r0 = r5
            int r0 = r0.remaining()
            r1 = 5121(0x1401, float:7.176E-42)
            r2 = r5
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            nglCallLists(r0, r1, r2)
            return
    }

    public static void glCallLists(@org.lwjgl.system.NativeType("void const *") java.nio.ShortBuffer r5) {
            r0 = r5
            int r0 = r0.remaining()
            r1 = 5123(0x1403, float:7.179E-42)
            r2 = r5
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            nglCallLists(r0, r1, r2)
            return
    }

    public static void glCallLists(@org.lwjgl.system.NativeType("void const *") java.nio.IntBuffer r5) {
            r0 = r5
            int r0 = r0.remaining()
            r1 = 5125(0x1405, float:7.182E-42)
            r2 = r5
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            nglCallLists(r0, r1, r2)
            return
    }

    public static void glClear(@org.lwjgl.system.NativeType("GLbitfield") int r2) {
            r0 = r2
            org.lwjgl.opengl.GL11C.glClear(r0)
            return
    }

    public static native void glClearAccum(@org.lwjgl.system.NativeType("GLfloat") float r0, @org.lwjgl.system.NativeType("GLfloat") float r1, @org.lwjgl.system.NativeType("GLfloat") float r2, @org.lwjgl.system.NativeType("GLfloat") float r3);

    public static void glClearColor(@org.lwjgl.system.NativeType("GLfloat") float r5, @org.lwjgl.system.NativeType("GLfloat") float r6, @org.lwjgl.system.NativeType("GLfloat") float r7, @org.lwjgl.system.NativeType("GLfloat") float r8) {
            r0 = r5
            r1 = r6
            r2 = r7
            r3 = r8
            org.lwjgl.opengl.GL11C.glClearColor(r0, r1, r2, r3)
            return
    }

    public static void glClearDepth(@org.lwjgl.system.NativeType("GLdouble") double r3) {
            r0 = r3
            org.lwjgl.opengl.GL11C.glClearDepth(r0)
            return
    }

    public static native void glClearIndex(@org.lwjgl.system.NativeType("GLfloat") float r0);

    public static void glClearStencil(@org.lwjgl.system.NativeType("GLint") int r2) {
            r0 = r2
            org.lwjgl.opengl.GL11C.glClearStencil(r0)
            return
    }

    public static native void nglClipPlane(int r0, long r1);

    public static void glClipPlane(@org.lwjgl.system.NativeType("GLenum") int r4, @org.lwjgl.system.NativeType("GLdouble const *") java.nio.DoubleBuffer r5) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r5
            r1 = 4
            org.lwjgl.system.Checks.check(r0, r1)
        Lb:
            r0 = r4
            r1 = r5
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            nglClipPlane(r0, r1)
            return
    }

    public static native void glColor3b(@org.lwjgl.system.NativeType("GLbyte") byte r0, @org.lwjgl.system.NativeType("GLbyte") byte r1, @org.lwjgl.system.NativeType("GLbyte") byte r2);

    public static native void glColor3s(@org.lwjgl.system.NativeType("GLshort") short r0, @org.lwjgl.system.NativeType("GLshort") short r1, @org.lwjgl.system.NativeType("GLshort") short r2);

    public static native void glColor3i(@org.lwjgl.system.NativeType("GLint") int r0, @org.lwjgl.system.NativeType("GLint") int r1, @org.lwjgl.system.NativeType("GLint") int r2);

    public static native void glColor3f(@org.lwjgl.system.NativeType("GLfloat") float r0, @org.lwjgl.system.NativeType("GLfloat") float r1, @org.lwjgl.system.NativeType("GLfloat") float r2);

    public static native void glColor3d(@org.lwjgl.system.NativeType("GLdouble") double r0, @org.lwjgl.system.NativeType("GLdouble") double r2, @org.lwjgl.system.NativeType("GLdouble") double r4);

    public static native void glColor3ub(@org.lwjgl.system.NativeType("GLubyte") byte r0, @org.lwjgl.system.NativeType("GLubyte") byte r1, @org.lwjgl.system.NativeType("GLubyte") byte r2);

    public static native void glColor3us(@org.lwjgl.system.NativeType("GLushort") short r0, @org.lwjgl.system.NativeType("GLushort") short r1, @org.lwjgl.system.NativeType("GLushort") short r2);

    public static native void glColor3ui(@org.lwjgl.system.NativeType("GLint") int r0, @org.lwjgl.system.NativeType("GLint") int r1, @org.lwjgl.system.NativeType("GLint") int r2);

    public static native void nglColor3bv(long r0);

    public static void glColor3bv(@org.lwjgl.system.NativeType("GLbyte const *") java.nio.ByteBuffer r3) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r3
            r1 = 3
            org.lwjgl.system.Checks.check(r0, r1)
        Lb:
            r0 = r3
            long r0 = org.lwjgl.system.MemoryUtil.memAddress(r0)
            nglColor3bv(r0)
            return
    }

    public static native void nglColor3sv(long r0);

    public static void glColor3sv(@org.lwjgl.system.NativeType("GLshort const *") java.nio.ShortBuffer r3) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r3
            r1 = 3
            org.lwjgl.system.Checks.check(r0, r1)
        Lb:
            r0 = r3
            long r0 = org.lwjgl.system.MemoryUtil.memAddress(r0)
            nglColor3sv(r0)
            return
    }

    public static native void nglColor3iv(long r0);

    public static void glColor3iv(@org.lwjgl.system.NativeType("GLint const *") java.nio.IntBuffer r3) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r3
            r1 = 3
            org.lwjgl.system.Checks.check(r0, r1)
        Lb:
            r0 = r3
            long r0 = org.lwjgl.system.MemoryUtil.memAddress(r0)
            nglColor3iv(r0)
            return
    }

    public static native void nglColor3fv(long r0);

    public static void glColor3fv(@org.lwjgl.system.NativeType("GLfloat const *") java.nio.FloatBuffer r3) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r3
            r1 = 3
            org.lwjgl.system.Checks.check(r0, r1)
        Lb:
            r0 = r3
            long r0 = org.lwjgl.system.MemoryUtil.memAddress(r0)
            nglColor3fv(r0)
            return
    }

    public static native void nglColor3dv(long r0);

    public static void glColor3dv(@org.lwjgl.system.NativeType("GLdouble const *") java.nio.DoubleBuffer r3) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r3
            r1 = 3
            org.lwjgl.system.Checks.check(r0, r1)
        Lb:
            r0 = r3
            long r0 = org.lwjgl.system.MemoryUtil.memAddress(r0)
            nglColor3dv(r0)
            return
    }

    public static native void nglColor3ubv(long r0);

    public static void glColor3ubv(@org.lwjgl.system.NativeType("GLubyte const *") java.nio.ByteBuffer r3) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r3
            r1 = 3
            org.lwjgl.system.Checks.check(r0, r1)
        Lb:
            r0 = r3
            long r0 = org.lwjgl.system.MemoryUtil.memAddress(r0)
            nglColor3ubv(r0)
            return
    }

    public static native void nglColor3usv(long r0);

    public static void glColor3usv(@org.lwjgl.system.NativeType("GLushort const *") java.nio.ShortBuffer r3) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r3
            r1 = 3
            org.lwjgl.system.Checks.check(r0, r1)
        Lb:
            r0 = r3
            long r0 = org.lwjgl.system.MemoryUtil.memAddress(r0)
            nglColor3usv(r0)
            return
    }

    public static native void nglColor3uiv(long r0);

    public static void glColor3uiv(@org.lwjgl.system.NativeType("GLuint const *") java.nio.IntBuffer r3) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r3
            r1 = 3
            org.lwjgl.system.Checks.check(r0, r1)
        Lb:
            r0 = r3
            long r0 = org.lwjgl.system.MemoryUtil.memAddress(r0)
            nglColor3uiv(r0)
            return
    }

    public static native void glColor4b(@org.lwjgl.system.NativeType("GLbyte") byte r0, @org.lwjgl.system.NativeType("GLbyte") byte r1, @org.lwjgl.system.NativeType("GLbyte") byte r2, @org.lwjgl.system.NativeType("GLbyte") byte r3);

    public static native void glColor4s(@org.lwjgl.system.NativeType("GLshort") short r0, @org.lwjgl.system.NativeType("GLshort") short r1, @org.lwjgl.system.NativeType("GLshort") short r2, @org.lwjgl.system.NativeType("GLshort") short r3);

    public static native void glColor4i(@org.lwjgl.system.NativeType("GLint") int r0, @org.lwjgl.system.NativeType("GLint") int r1, @org.lwjgl.system.NativeType("GLint") int r2, @org.lwjgl.system.NativeType("GLint") int r3);

    public static native void glColor4f(@org.lwjgl.system.NativeType("GLfloat") float r0, @org.lwjgl.system.NativeType("GLfloat") float r1, @org.lwjgl.system.NativeType("GLfloat") float r2, @org.lwjgl.system.NativeType("GLfloat") float r3);

    public static native void glColor4d(@org.lwjgl.system.NativeType("GLdouble") double r0, @org.lwjgl.system.NativeType("GLdouble") double r2, @org.lwjgl.system.NativeType("GLdouble") double r4, @org.lwjgl.system.NativeType("GLdouble") double r6);

    public static native void glColor4ub(@org.lwjgl.system.NativeType("GLubyte") byte r0, @org.lwjgl.system.NativeType("GLubyte") byte r1, @org.lwjgl.system.NativeType("GLubyte") byte r2, @org.lwjgl.system.NativeType("GLubyte") byte r3);

    public static native void glColor4us(@org.lwjgl.system.NativeType("GLushort") short r0, @org.lwjgl.system.NativeType("GLushort") short r1, @org.lwjgl.system.NativeType("GLushort") short r2, @org.lwjgl.system.NativeType("GLushort") short r3);

    public static native void glColor4ui(@org.lwjgl.system.NativeType("GLint") int r0, @org.lwjgl.system.NativeType("GLint") int r1, @org.lwjgl.system.NativeType("GLint") int r2, @org.lwjgl.system.NativeType("GLint") int r3);

    public static native void nglColor4bv(long r0);

    public static void glColor4bv(@org.lwjgl.system.NativeType("GLbyte const *") java.nio.ByteBuffer r3) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r3
            r1 = 4
            org.lwjgl.system.Checks.check(r0, r1)
        Lb:
            r0 = r3
            long r0 = org.lwjgl.system.MemoryUtil.memAddress(r0)
            nglColor4bv(r0)
            return
    }

    public static native void nglColor4sv(long r0);

    public static void glColor4sv(@org.lwjgl.system.NativeType("GLshort const *") java.nio.ShortBuffer r3) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r3
            r1 = 4
            org.lwjgl.system.Checks.check(r0, r1)
        Lb:
            r0 = r3
            long r0 = org.lwjgl.system.MemoryUtil.memAddress(r0)
            nglColor4sv(r0)
            return
    }

    public static native void nglColor4iv(long r0);

    public static void glColor4iv(@org.lwjgl.system.NativeType("GLint const *") java.nio.IntBuffer r3) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r3
            r1 = 4
            org.lwjgl.system.Checks.check(r0, r1)
        Lb:
            r0 = r3
            long r0 = org.lwjgl.system.MemoryUtil.memAddress(r0)
            nglColor4iv(r0)
            return
    }

    public static native void nglColor4fv(long r0);

    public static void glColor4fv(@org.lwjgl.system.NativeType("GLfloat const *") java.nio.FloatBuffer r3) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r3
            r1 = 4
            org.lwjgl.system.Checks.check(r0, r1)
        Lb:
            r0 = r3
            long r0 = org.lwjgl.system.MemoryUtil.memAddress(r0)
            nglColor4fv(r0)
            return
    }

    public static native void nglColor4dv(long r0);

    public static void glColor4dv(@org.lwjgl.system.NativeType("GLdouble const *") java.nio.DoubleBuffer r3) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r3
            r1 = 4
            org.lwjgl.system.Checks.check(r0, r1)
        Lb:
            r0 = r3
            long r0 = org.lwjgl.system.MemoryUtil.memAddress(r0)
            nglColor4dv(r0)
            return
    }

    public static native void nglColor4ubv(long r0);

    public static void glColor4ubv(@org.lwjgl.system.NativeType("GLubyte const *") java.nio.ByteBuffer r3) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r3
            r1 = 4
            org.lwjgl.system.Checks.check(r0, r1)
        Lb:
            r0 = r3
            long r0 = org.lwjgl.system.MemoryUtil.memAddress(r0)
            nglColor4ubv(r0)
            return
    }

    public static native void nglColor4usv(long r0);

    public static void glColor4usv(@org.lwjgl.system.NativeType("GLushort const *") java.nio.ShortBuffer r3) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r3
            r1 = 4
            org.lwjgl.system.Checks.check(r0, r1)
        Lb:
            r0 = r3
            long r0 = org.lwjgl.system.MemoryUtil.memAddress(r0)
            nglColor4usv(r0)
            return
    }

    public static native void nglColor4uiv(long r0);

    public static void glColor4uiv(@org.lwjgl.system.NativeType("GLuint const *") java.nio.IntBuffer r3) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r3
            r1 = 4
            org.lwjgl.system.Checks.check(r0, r1)
        Lb:
            r0 = r3
            long r0 = org.lwjgl.system.MemoryUtil.memAddress(r0)
            nglColor4uiv(r0)
            return
    }

    public static void glColorMask(@org.lwjgl.system.NativeType("GLboolean") boolean r5, @org.lwjgl.system.NativeType("GLboolean") boolean r6, @org.lwjgl.system.NativeType("GLboolean") boolean r7, @org.lwjgl.system.NativeType("GLboolean") boolean r8) {
            r0 = r5
            r1 = r6
            r2 = r7
            r3 = r8
            org.lwjgl.opengl.GL11C.glColorMask(r0, r1, r2, r3)
            return
    }

    public static native void glColorMaterial(@org.lwjgl.system.NativeType("GLenum") int r0, @org.lwjgl.system.NativeType("GLenum") int r1);

    public static native void nglColorPointer(int r0, int r1, int r2, long r3);

    public static void glColorPointer(@org.lwjgl.system.NativeType("GLint") int r6, @org.lwjgl.system.NativeType("GLenum") int r7, @org.lwjgl.system.NativeType("GLsizei") int r8, @org.lwjgl.system.NativeType("void const *") java.nio.ByteBuffer r9) {
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            long r3 = org.lwjgl.system.MemoryUtil.memAddress(r3)
            nglColorPointer(r0, r1, r2, r3)
            return
    }

    public static void glColorPointer(@org.lwjgl.system.NativeType("GLint") int r6, @org.lwjgl.system.NativeType("GLenum") int r7, @org.lwjgl.system.NativeType("GLsizei") int r8, @org.lwjgl.system.NativeType("void const *") long r9) {
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            nglColorPointer(r0, r1, r2, r3)
            return
    }

    public static void glColorPointer(@org.lwjgl.system.NativeType("GLint") int r6, @org.lwjgl.system.NativeType("GLenum") int r7, @org.lwjgl.system.NativeType("GLsizei") int r8, @org.lwjgl.system.NativeType("void const *") java.nio.ShortBuffer r9) {
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            long r3 = org.lwjgl.system.MemoryUtil.memAddress(r3)
            nglColorPointer(r0, r1, r2, r3)
            return
    }

    public static void glColorPointer(@org.lwjgl.system.NativeType("GLint") int r6, @org.lwjgl.system.NativeType("GLenum") int r7, @org.lwjgl.system.NativeType("GLsizei") int r8, @org.lwjgl.system.NativeType("void const *") java.nio.IntBuffer r9) {
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            long r3 = org.lwjgl.system.MemoryUtil.memAddress(r3)
            nglColorPointer(r0, r1, r2, r3)
            return
    }

    public static void glColorPointer(@org.lwjgl.system.NativeType("GLint") int r6, @org.lwjgl.system.NativeType("GLenum") int r7, @org.lwjgl.system.NativeType("GLsizei") int r8, @org.lwjgl.system.NativeType("void const *") java.nio.FloatBuffer r9) {
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            long r3 = org.lwjgl.system.MemoryUtil.memAddress(r3)
            nglColorPointer(r0, r1, r2, r3)
            return
    }

    public static native void glCopyPixels(@org.lwjgl.system.NativeType("GLint") int r0, @org.lwjgl.system.NativeType("GLint") int r1, @org.lwjgl.system.NativeType("GLsizei") int r2, @org.lwjgl.system.NativeType("GLsizei") int r3, @org.lwjgl.system.NativeType("GLenum") int r4);

    public static void glCullFace(@org.lwjgl.system.NativeType("GLenum") int r2) {
            r0 = r2
            org.lwjgl.opengl.GL11C.glCullFace(r0)
            return
    }

    public static native void glDeleteLists(@org.lwjgl.system.NativeType("GLuint") int r0, @org.lwjgl.system.NativeType("GLsizei") int r1);

    public static void glDepthFunc(@org.lwjgl.system.NativeType("GLenum") int r2) {
            r0 = r2
            org.lwjgl.opengl.GL11C.glDepthFunc(r0)
            return
    }

    public static void glDepthMask(@org.lwjgl.system.NativeType("GLboolean") boolean r2) {
            r0 = r2
            org.lwjgl.opengl.GL11C.glDepthMask(r0)
            return
    }

    public static void glDepthRange(@org.lwjgl.system.NativeType("GLdouble") double r5, @org.lwjgl.system.NativeType("GLdouble") double r7) {
            r0 = r5
            r1 = r7
            org.lwjgl.opengl.GL11C.glDepthRange(r0, r1)
            return
    }

    public static native void glDisableClientState(@org.lwjgl.system.NativeType("GLenum") int r0);

    public static void glDrawArrays(@org.lwjgl.system.NativeType("GLenum") int r4, @org.lwjgl.system.NativeType("GLint") int r5, @org.lwjgl.system.NativeType("GLsizei") int r6) {
            r0 = r4
            r1 = r5
            r2 = r6
            org.lwjgl.opengl.GL11C.glDrawArrays(r0, r1, r2)
            return
    }

    public static void glDrawBuffer(@org.lwjgl.system.NativeType("GLenum") int r2) {
            r0 = r2
            org.lwjgl.opengl.GL11C.glDrawBuffer(r0)
            return
    }

    public static void nglDrawElements(int r6, int r7, int r8, long r9) {
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            org.lwjgl.opengl.GL11C.nglDrawElements(r0, r1, r2, r3)
            return
    }

    public static void glDrawElements(@org.lwjgl.system.NativeType("GLenum") int r6, @org.lwjgl.system.NativeType("GLsizei") int r7, @org.lwjgl.system.NativeType("GLenum") int r8, @org.lwjgl.system.NativeType("void const *") long r9) {
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            org.lwjgl.opengl.GL11C.glDrawElements(r0, r1, r2, r3)
            return
    }

    public static void glDrawElements(@org.lwjgl.system.NativeType("GLenum") int r4, @org.lwjgl.system.NativeType("GLenum") int r5, @org.lwjgl.system.NativeType("void const *") java.nio.ByteBuffer r6) {
            r0 = r4
            r1 = r5
            r2 = r6
            org.lwjgl.opengl.GL11C.glDrawElements(r0, r1, r2)
            return
    }

    public static void glDrawElements(@org.lwjgl.system.NativeType("GLenum") int r3, @org.lwjgl.system.NativeType("void const *") java.nio.ByteBuffer r4) {
            r0 = r3
            r1 = r4
            org.lwjgl.opengl.GL11C.glDrawElements(r0, r1)
            return
    }

    public static void glDrawElements(@org.lwjgl.system.NativeType("GLenum") int r3, @org.lwjgl.system.NativeType("void const *") java.nio.ShortBuffer r4) {
            r0 = r3
            r1 = r4
            org.lwjgl.opengl.GL11C.glDrawElements(r0, r1)
            return
    }

    public static void glDrawElements(@org.lwjgl.system.NativeType("GLenum") int r3, @org.lwjgl.system.NativeType("void const *") java.nio.IntBuffer r4) {
            r0 = r3
            r1 = r4
            org.lwjgl.opengl.GL11C.glDrawElements(r0, r1)
            return
    }

    public static native void nglDrawPixels(int r0, int r1, int r2, int r3, long r4);

    public static void glDrawPixels(@org.lwjgl.system.NativeType("GLsizei") int r7, @org.lwjgl.system.NativeType("GLsizei") int r8, @org.lwjgl.system.NativeType("GLenum") int r9, @org.lwjgl.system.NativeType("GLenum") int r10, @org.lwjgl.system.NativeType("void const *") java.nio.ByteBuffer r11) {
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            long r4 = org.lwjgl.system.MemoryUtil.memAddress(r4)
            nglDrawPixels(r0, r1, r2, r3, r4)
            return
    }

    public static void glDrawPixels(@org.lwjgl.system.NativeType("GLsizei") int r7, @org.lwjgl.system.NativeType("GLsizei") int r8, @org.lwjgl.system.NativeType("GLenum") int r9, @org.lwjgl.system.NativeType("GLenum") int r10, @org.lwjgl.system.NativeType("void const *") long r11) {
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            nglDrawPixels(r0, r1, r2, r3, r4)
            return
    }

    public static void glDrawPixels(@org.lwjgl.system.NativeType("GLsizei") int r7, @org.lwjgl.system.NativeType("GLsizei") int r8, @org.lwjgl.system.NativeType("GLenum") int r9, @org.lwjgl.system.NativeType("GLenum") int r10, @org.lwjgl.system.NativeType("void const *") java.nio.ShortBuffer r11) {
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            long r4 = org.lwjgl.system.MemoryUtil.memAddress(r4)
            nglDrawPixels(r0, r1, r2, r3, r4)
            return
    }

    public static void glDrawPixels(@org.lwjgl.system.NativeType("GLsizei") int r7, @org.lwjgl.system.NativeType("GLsizei") int r8, @org.lwjgl.system.NativeType("GLenum") int r9, @org.lwjgl.system.NativeType("GLenum") int r10, @org.lwjgl.system.NativeType("void const *") java.nio.IntBuffer r11) {
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            long r4 = org.lwjgl.system.MemoryUtil.memAddress(r4)
            nglDrawPixels(r0, r1, r2, r3, r4)
            return
    }

    public static void glDrawPixels(@org.lwjgl.system.NativeType("GLsizei") int r7, @org.lwjgl.system.NativeType("GLsizei") int r8, @org.lwjgl.system.NativeType("GLenum") int r9, @org.lwjgl.system.NativeType("GLenum") int r10, @org.lwjgl.system.NativeType("void const *") java.nio.FloatBuffer r11) {
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            long r4 = org.lwjgl.system.MemoryUtil.memAddress(r4)
            nglDrawPixels(r0, r1, r2, r3, r4)
            return
    }

    public static native void glEdgeFlag(@org.lwjgl.system.NativeType("GLboolean") boolean r0);

    public static native void nglEdgeFlagv(long r0);

    public static void glEdgeFlagv(@org.lwjgl.system.NativeType("GLboolean const *") java.nio.ByteBuffer r3) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r3
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
        Lb:
            r0 = r3
            long r0 = org.lwjgl.system.MemoryUtil.memAddress(r0)
            nglEdgeFlagv(r0)
            return
    }

    public static native void nglEdgeFlagPointer(int r0, long r1);

    public static void glEdgeFlagPointer(@org.lwjgl.system.NativeType("GLsizei") int r4, @org.lwjgl.system.NativeType("GLboolean const *") java.nio.ByteBuffer r5) {
            r0 = r4
            r1 = r5
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            nglEdgeFlagPointer(r0, r1)
            return
    }

    public static void glEdgeFlagPointer(@org.lwjgl.system.NativeType("GLsizei") int r4, @org.lwjgl.system.NativeType("GLboolean const *") long r5) {
            r0 = r4
            r1 = r5
            nglEdgeFlagPointer(r0, r1)
            return
    }

    public static native void glEnableClientState(@org.lwjgl.system.NativeType("GLenum") int r0);

    public static native void glEnd();

    public static native void glEvalCoord1f(@org.lwjgl.system.NativeType("GLfloat") float r0);

    public static native void nglEvalCoord1fv(long r0);

    public static void glEvalCoord1fv(@org.lwjgl.system.NativeType("GLfloat const *") java.nio.FloatBuffer r3) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r3
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
        Lb:
            r0 = r3
            long r0 = org.lwjgl.system.MemoryUtil.memAddress(r0)
            nglEvalCoord1fv(r0)
            return
    }

    public static native void glEvalCoord1d(@org.lwjgl.system.NativeType("GLdouble") double r0);

    public static native void nglEvalCoord1dv(long r0);

    public static void glEvalCoord1dv(@org.lwjgl.system.NativeType("GLdouble const *") java.nio.DoubleBuffer r3) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r3
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
        Lb:
            r0 = r3
            long r0 = org.lwjgl.system.MemoryUtil.memAddress(r0)
            nglEvalCoord1dv(r0)
            return
    }

    public static native void glEvalCoord2f(@org.lwjgl.system.NativeType("GLfloat") float r0, @org.lwjgl.system.NativeType("GLfloat") float r1);

    public static native void nglEvalCoord2fv(long r0);

    public static void glEvalCoord2fv(@org.lwjgl.system.NativeType("GLfloat const *") java.nio.FloatBuffer r3) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r3
            r1 = 2
            org.lwjgl.system.Checks.check(r0, r1)
        Lb:
            r0 = r3
            long r0 = org.lwjgl.system.MemoryUtil.memAddress(r0)
            nglEvalCoord2fv(r0)
            return
    }

    public static native void glEvalCoord2d(@org.lwjgl.system.NativeType("GLdouble") double r0, @org.lwjgl.system.NativeType("GLdouble") double r2);

    public static native void nglEvalCoord2dv(long r0);

    public static void glEvalCoord2dv(@org.lwjgl.system.NativeType("GLdouble const *") java.nio.DoubleBuffer r3) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r3
            r1 = 2
            org.lwjgl.system.Checks.check(r0, r1)
        Lb:
            r0 = r3
            long r0 = org.lwjgl.system.MemoryUtil.memAddress(r0)
            nglEvalCoord2dv(r0)
            return
    }

    public static native void glEvalMesh1(@org.lwjgl.system.NativeType("GLenum") int r0, @org.lwjgl.system.NativeType("GLint") int r1, @org.lwjgl.system.NativeType("GLint") int r2);

    public static native void glEvalMesh2(@org.lwjgl.system.NativeType("GLenum") int r0, @org.lwjgl.system.NativeType("GLint") int r1, @org.lwjgl.system.NativeType("GLint") int r2, @org.lwjgl.system.NativeType("GLint") int r3, @org.lwjgl.system.NativeType("GLint") int r4);

    public static native void glEvalPoint1(@org.lwjgl.system.NativeType("GLint") int r0);

    public static native void glEvalPoint2(@org.lwjgl.system.NativeType("GLint") int r0, @org.lwjgl.system.NativeType("GLint") int r1);

    public static native void nglFeedbackBuffer(int r0, int r1, long r2);

    public static void glFeedbackBuffer(@org.lwjgl.system.NativeType("GLenum") int r5, @org.lwjgl.system.NativeType("GLfloat *") java.nio.FloatBuffer r6) {
            r0 = r6
            int r0 = r0.remaining()
            r1 = r5
            r2 = r6
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            nglFeedbackBuffer(r0, r1, r2)
            return
    }

    public static void glFinish() {
            org.lwjgl.opengl.GL11C.glFinish()
            return
    }

    public static void glFlush() {
            org.lwjgl.opengl.GL11C.glFlush()
            return
    }

    public static native void glFogi(@org.lwjgl.system.NativeType("GLenum") int r0, @org.lwjgl.system.NativeType("GLint") int r1);

    public static native void nglFogiv(int r0, long r1);

    public static void glFogiv(@org.lwjgl.system.NativeType("GLenum") int r4, @org.lwjgl.system.NativeType("GLint const *") java.nio.IntBuffer r5) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r5
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
        Lb:
            r0 = r4
            r1 = r5
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            nglFogiv(r0, r1)
            return
    }

    public static native void glFogf(@org.lwjgl.system.NativeType("GLenum") int r0, @org.lwjgl.system.NativeType("GLfloat") float r1);

    public static native void nglFogfv(int r0, long r1);

    public static void glFogfv(@org.lwjgl.system.NativeType("GLenum") int r4, @org.lwjgl.system.NativeType("GLfloat const *") java.nio.FloatBuffer r5) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r5
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
        Lb:
            r0 = r4
            r1 = r5
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            nglFogfv(r0, r1)
            return
    }

    public static void glFrontFace(@org.lwjgl.system.NativeType("GLenum") int r2) {
            r0 = r2
            org.lwjgl.opengl.GL11C.glFrontFace(r0)
            return
    }

    @org.lwjgl.system.NativeType("GLuint")
    public static native int glGenLists(@org.lwjgl.system.NativeType("GLsizei") int r0);

    public static void nglGenTextures(int r4, long r5) {
            r0 = r4
            r1 = r5
            org.lwjgl.opengl.GL11C.nglGenTextures(r0, r1)
            return
    }

    public static void glGenTextures(@org.lwjgl.system.NativeType("GLuint *") java.nio.IntBuffer r2) {
            r0 = r2
            org.lwjgl.opengl.GL11C.glGenTextures(r0)
            return
    }

    @org.lwjgl.system.NativeType("void")
    public static int glGenTextures() {
            int r0 = org.lwjgl.opengl.GL11C.glGenTextures()
            return r0
    }

    public static void nglDeleteTextures(int r4, long r5) {
            r0 = r4
            r1 = r5
            org.lwjgl.opengl.GL11C.nglDeleteTextures(r0, r1)
            return
    }

    public static void glDeleteTextures(@org.lwjgl.system.NativeType("GLuint const *") java.nio.IntBuffer r2) {
            r0 = r2
            org.lwjgl.opengl.GL11C.glDeleteTextures(r0)
            return
    }

    public static void glDeleteTextures(@org.lwjgl.system.NativeType("GLuint const *") int r2) {
            r0 = r2
            org.lwjgl.opengl.GL11C.glDeleteTextures(r0)
            return
    }

    public static native void nglGetClipPlane(int r0, long r1);

    public static void glGetClipPlane(@org.lwjgl.system.NativeType("GLenum") int r4, @org.lwjgl.system.NativeType("GLdouble *") java.nio.DoubleBuffer r5) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r5
            r1 = 4
            org.lwjgl.system.Checks.check(r0, r1)
        Lb:
            r0 = r4
            r1 = r5
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            nglGetClipPlane(r0, r1)
            return
    }

    public static void nglGetBooleanv(int r4, long r5) {
            r0 = r4
            r1 = r5
            org.lwjgl.opengl.GL11C.nglGetBooleanv(r0, r1)
            return
    }

    public static void glGetBooleanv(@org.lwjgl.system.NativeType("GLenum") int r3, @org.lwjgl.system.NativeType("GLboolean *") java.nio.ByteBuffer r4) {
            r0 = r3
            r1 = r4
            org.lwjgl.opengl.GL11C.glGetBooleanv(r0, r1)
            return
    }

    @org.lwjgl.system.NativeType("void")
    public static boolean glGetBoolean(@org.lwjgl.system.NativeType("GLenum") int r2) {
            r0 = r2
            boolean r0 = org.lwjgl.opengl.GL11C.glGetBoolean(r0)
            return r0
    }

    public static void nglGetFloatv(int r4, long r5) {
            r0 = r4
            r1 = r5
            org.lwjgl.opengl.GL11C.nglGetFloatv(r0, r1)
            return
    }

    public static void glGetFloatv(@org.lwjgl.system.NativeType("GLenum") int r3, @org.lwjgl.system.NativeType("GLfloat *") java.nio.FloatBuffer r4) {
            r0 = r3
            r1 = r4
            org.lwjgl.opengl.GL11C.glGetFloatv(r0, r1)
            return
    }

    @org.lwjgl.system.NativeType("void")
    public static float glGetFloat(@org.lwjgl.system.NativeType("GLenum") int r2) {
            r0 = r2
            float r0 = org.lwjgl.opengl.GL11C.glGetFloat(r0)
            return r0
    }

    public static void nglGetIntegerv(int r4, long r5) {
            r0 = r4
            r1 = r5
            org.lwjgl.opengl.GL11C.nglGetIntegerv(r0, r1)
            return
    }

    public static void glGetIntegerv(@org.lwjgl.system.NativeType("GLenum") int r3, @org.lwjgl.system.NativeType("GLint *") java.nio.IntBuffer r4) {
            r0 = r3
            r1 = r4
            org.lwjgl.opengl.GL11C.glGetIntegerv(r0, r1)
            return
    }

    @org.lwjgl.system.NativeType("void")
    public static int glGetInteger(@org.lwjgl.system.NativeType("GLenum") int r2) {
            r0 = r2
            int r0 = org.lwjgl.opengl.GL11C.glGetInteger(r0)
            return r0
    }

    public static void nglGetDoublev(int r4, long r5) {
            r0 = r4
            r1 = r5
            org.lwjgl.opengl.GL11C.nglGetDoublev(r0, r1)
            return
    }

    public static void glGetDoublev(@org.lwjgl.system.NativeType("GLenum") int r3, @org.lwjgl.system.NativeType("GLdouble *") java.nio.DoubleBuffer r4) {
            r0 = r3
            r1 = r4
            org.lwjgl.opengl.GL11C.glGetDoublev(r0, r1)
            return
    }

    @org.lwjgl.system.NativeType("void")
    public static double glGetDouble(@org.lwjgl.system.NativeType("GLenum") int r3) {
            r0 = r3
            double r0 = org.lwjgl.opengl.GL11C.glGetDouble(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("GLenum")
    public static int glGetError() {
            int r0 = org.lwjgl.opengl.GL11C.glGetError()
            return r0
    }

    public static native void nglGetLightiv(int r0, int r1, long r2);

    public static void glGetLightiv(@org.lwjgl.system.NativeType("GLenum") int r5, @org.lwjgl.system.NativeType("GLenum") int r6, @org.lwjgl.system.NativeType("GLint *") java.nio.IntBuffer r7) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r7
            r1 = 4
            org.lwjgl.system.Checks.check(r0, r1)
        Lb:
            r0 = r5
            r1 = r6
            r2 = r7
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            nglGetLightiv(r0, r1, r2)
            return
    }

    @org.lwjgl.system.NativeType("void")
    public static int glGetLighti(@org.lwjgl.system.NativeType("GLenum") int r5, @org.lwjgl.system.NativeType("GLenum") int r6) {
            org.lwjgl.system.MemoryStack r0 = org.lwjgl.system.MemoryStack.stackGet()
            r7 = r0
            r0 = r7
            int r0 = r0.getPointer()
            r8 = r0
            r0 = r7
            r1 = 1
            java.nio.IntBuffer r0 = r0.callocInt(r1)     // Catch: java.lang.Throwable -> L2a
            r9 = r0
            r0 = r5
            r1 = r6
            r2 = r9
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)     // Catch: java.lang.Throwable -> L2a
            nglGetLightiv(r0, r1, r2)     // Catch: java.lang.Throwable -> L2a
            r0 = r9
            r1 = 0
            int r0 = r0.get(r1)     // Catch: java.lang.Throwable -> L2a
            r10 = r0
            r0 = r7
            r1 = r8
            r0.setPointer(r1)
            r0 = r10
            return r0
        L2a:
            r11 = move-exception
            r0 = r7
            r1 = r8
            r0.setPointer(r1)
            r0 = r11
            throw r0
    }

    public static native void nglGetLightfv(int r0, int r1, long r2);

    public static void glGetLightfv(@org.lwjgl.system.NativeType("GLenum") int r5, @org.lwjgl.system.NativeType("GLenum") int r6, @org.lwjgl.system.NativeType("GLfloat *") java.nio.FloatBuffer r7) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r7
            r1 = 4
            org.lwjgl.system.Checks.check(r0, r1)
        Lb:
            r0 = r5
            r1 = r6
            r2 = r7
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            nglGetLightfv(r0, r1, r2)
            return
    }

    @org.lwjgl.system.NativeType("void")
    public static float glGetLightf(@org.lwjgl.system.NativeType("GLenum") int r5, @org.lwjgl.system.NativeType("GLenum") int r6) {
            org.lwjgl.system.MemoryStack r0 = org.lwjgl.system.MemoryStack.stackGet()
            r7 = r0
            r0 = r7
            int r0 = r0.getPointer()
            r8 = r0
            r0 = r7
            r1 = 1
            java.nio.FloatBuffer r0 = r0.callocFloat(r1)     // Catch: java.lang.Throwable -> L2a
            r9 = r0
            r0 = r5
            r1 = r6
            r2 = r9
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)     // Catch: java.lang.Throwable -> L2a
            nglGetLightfv(r0, r1, r2)     // Catch: java.lang.Throwable -> L2a
            r0 = r9
            r1 = 0
            float r0 = r0.get(r1)     // Catch: java.lang.Throwable -> L2a
            r10 = r0
            r0 = r7
            r1 = r8
            r0.setPointer(r1)
            r0 = r10
            return r0
        L2a:
            r11 = move-exception
            r0 = r7
            r1 = r8
            r0.setPointer(r1)
            r0 = r11
            throw r0
    }

    public static native void nglGetMapiv(int r0, int r1, long r2);

    public static void glGetMapiv(@org.lwjgl.system.NativeType("GLenum") int r5, @org.lwjgl.system.NativeType("GLenum") int r6, @org.lwjgl.system.NativeType("GLint *") java.nio.IntBuffer r7) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r7
            r1 = 4
            org.lwjgl.system.Checks.check(r0, r1)
        Lb:
            r0 = r5
            r1 = r6
            r2 = r7
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            nglGetMapiv(r0, r1, r2)
            return
    }

    @org.lwjgl.system.NativeType("void")
    public static int glGetMapi(@org.lwjgl.system.NativeType("GLenum") int r5, @org.lwjgl.system.NativeType("GLenum") int r6) {
            org.lwjgl.system.MemoryStack r0 = org.lwjgl.system.MemoryStack.stackGet()
            r7 = r0
            r0 = r7
            int r0 = r0.getPointer()
            r8 = r0
            r0 = r7
            r1 = 1
            java.nio.IntBuffer r0 = r0.callocInt(r1)     // Catch: java.lang.Throwable -> L2a
            r9 = r0
            r0 = r5
            r1 = r6
            r2 = r9
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)     // Catch: java.lang.Throwable -> L2a
            nglGetMapiv(r0, r1, r2)     // Catch: java.lang.Throwable -> L2a
            r0 = r9
            r1 = 0
            int r0 = r0.get(r1)     // Catch: java.lang.Throwable -> L2a
            r10 = r0
            r0 = r7
            r1 = r8
            r0.setPointer(r1)
            r0 = r10
            return r0
        L2a:
            r11 = move-exception
            r0 = r7
            r1 = r8
            r0.setPointer(r1)
            r0 = r11
            throw r0
    }

    public static native void nglGetMapfv(int r0, int r1, long r2);

    public static void glGetMapfv(@org.lwjgl.system.NativeType("GLenum") int r5, @org.lwjgl.system.NativeType("GLenum") int r6, @org.lwjgl.system.NativeType("GLfloat *") java.nio.FloatBuffer r7) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r7
            r1 = 4
            org.lwjgl.system.Checks.check(r0, r1)
        Lb:
            r0 = r5
            r1 = r6
            r2 = r7
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            nglGetMapfv(r0, r1, r2)
            return
    }

    @org.lwjgl.system.NativeType("void")
    public static float glGetMapf(@org.lwjgl.system.NativeType("GLenum") int r5, @org.lwjgl.system.NativeType("GLenum") int r6) {
            org.lwjgl.system.MemoryStack r0 = org.lwjgl.system.MemoryStack.stackGet()
            r7 = r0
            r0 = r7
            int r0 = r0.getPointer()
            r8 = r0
            r0 = r7
            r1 = 1
            java.nio.FloatBuffer r0 = r0.callocFloat(r1)     // Catch: java.lang.Throwable -> L2a
            r9 = r0
            r0 = r5
            r1 = r6
            r2 = r9
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)     // Catch: java.lang.Throwable -> L2a
            nglGetMapfv(r0, r1, r2)     // Catch: java.lang.Throwable -> L2a
            r0 = r9
            r1 = 0
            float r0 = r0.get(r1)     // Catch: java.lang.Throwable -> L2a
            r10 = r0
            r0 = r7
            r1 = r8
            r0.setPointer(r1)
            r0 = r10
            return r0
        L2a:
            r11 = move-exception
            r0 = r7
            r1 = r8
            r0.setPointer(r1)
            r0 = r11
            throw r0
    }

    public static native void nglGetMapdv(int r0, int r1, long r2);

    public static void glGetMapdv(@org.lwjgl.system.NativeType("GLenum") int r5, @org.lwjgl.system.NativeType("GLenum") int r6, @org.lwjgl.system.NativeType("GLdouble *") java.nio.DoubleBuffer r7) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r7
            r1 = 4
            org.lwjgl.system.Checks.check(r0, r1)
        Lb:
            r0 = r5
            r1 = r6
            r2 = r7
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            nglGetMapdv(r0, r1, r2)
            return
    }

    @org.lwjgl.system.NativeType("void")
    public static double glGetMapd(@org.lwjgl.system.NativeType("GLenum") int r5, @org.lwjgl.system.NativeType("GLenum") int r6) {
            org.lwjgl.system.MemoryStack r0 = org.lwjgl.system.MemoryStack.stackGet()
            r7 = r0
            r0 = r7
            int r0 = r0.getPointer()
            r8 = r0
            r0 = r7
            r1 = 1
            java.nio.DoubleBuffer r0 = r0.callocDouble(r1)     // Catch: java.lang.Throwable -> L2a
            r9 = r0
            r0 = r5
            r1 = r6
            r2 = r9
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)     // Catch: java.lang.Throwable -> L2a
            nglGetMapdv(r0, r1, r2)     // Catch: java.lang.Throwable -> L2a
            r0 = r9
            r1 = 0
            double r0 = r0.get(r1)     // Catch: java.lang.Throwable -> L2a
            r10 = r0
            r0 = r7
            r1 = r8
            r0.setPointer(r1)
            r0 = r10
            return r0
        L2a:
            r12 = move-exception
            r0 = r7
            r1 = r8
            r0.setPointer(r1)
            r0 = r12
            throw r0
    }

    public static native void nglGetMaterialiv(int r0, int r1, long r2);

    public static void glGetMaterialiv(@org.lwjgl.system.NativeType("GLenum") int r5, @org.lwjgl.system.NativeType("GLenum") int r6, @org.lwjgl.system.NativeType("GLint *") java.nio.IntBuffer r7) {
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
            nglGetMaterialiv(r0, r1, r2)
            return
    }

    public static native void nglGetMaterialfv(int r0, int r1, long r2);

    public static void glGetMaterialfv(@org.lwjgl.system.NativeType("GLenum") int r5, @org.lwjgl.system.NativeType("GLenum") int r6, @org.lwjgl.system.NativeType("GLfloat *") java.nio.FloatBuffer r7) {
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
            nglGetMaterialfv(r0, r1, r2)
            return
    }

    public static native void nglGetPixelMapfv(int r0, long r1);

    public static void glGetPixelMapfv(@org.lwjgl.system.NativeType("GLenum") int r4, @org.lwjgl.system.NativeType("GLfloat *") java.nio.FloatBuffer r5) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lc
            r0 = r5
            r1 = 32
            org.lwjgl.system.Checks.check(r0, r1)
        Lc:
            r0 = r4
            r1 = r5
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            nglGetPixelMapfv(r0, r1)
            return
    }

    public static void glGetPixelMapfv(@org.lwjgl.system.NativeType("GLenum") int r4, @org.lwjgl.system.NativeType("GLfloat *") long r5) {
            r0 = r4
            r1 = r5
            nglGetPixelMapfv(r0, r1)
            return
    }

    public static native void nglGetPixelMapusv(int r0, long r1);

    public static void glGetPixelMapusv(@org.lwjgl.system.NativeType("GLenum") int r4, @org.lwjgl.system.NativeType("GLushort *") java.nio.ShortBuffer r5) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lc
            r0 = r5
            r1 = 32
            org.lwjgl.system.Checks.check(r0, r1)
        Lc:
            r0 = r4
            r1 = r5
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            nglGetPixelMapusv(r0, r1)
            return
    }

    public static void glGetPixelMapusv(@org.lwjgl.system.NativeType("GLenum") int r4, @org.lwjgl.system.NativeType("GLushort *") long r5) {
            r0 = r4
            r1 = r5
            nglGetPixelMapusv(r0, r1)
            return
    }

    public static native void nglGetPixelMapuiv(int r0, long r1);

    public static void glGetPixelMapuiv(@org.lwjgl.system.NativeType("GLenum") int r4, @org.lwjgl.system.NativeType("GLuint *") java.nio.IntBuffer r5) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lc
            r0 = r5
            r1 = 32
            org.lwjgl.system.Checks.check(r0, r1)
        Lc:
            r0 = r4
            r1 = r5
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            nglGetPixelMapuiv(r0, r1)
            return
    }

    public static void glGetPixelMapuiv(@org.lwjgl.system.NativeType("GLenum") int r4, @org.lwjgl.system.NativeType("GLuint *") long r5) {
            r0 = r4
            r1 = r5
            nglGetPixelMapuiv(r0, r1)
            return
    }

    public static void nglGetPointerv(int r4, long r5) {
            r0 = r4
            r1 = r5
            org.lwjgl.opengl.GL11C.nglGetPointerv(r0, r1)
            return
    }

    public static void glGetPointerv(@org.lwjgl.system.NativeType("GLenum") int r3, @org.lwjgl.system.NativeType("void **") org.lwjgl.PointerBuffer r4) {
            r0 = r3
            r1 = r4
            org.lwjgl.opengl.GL11C.glGetPointerv(r0, r1)
            return
    }

    @org.lwjgl.system.NativeType("void")
    public static long glGetPointer(@org.lwjgl.system.NativeType("GLenum") int r3) {
            r0 = r3
            long r0 = org.lwjgl.opengl.GL11C.glGetPointer(r0)
            return r0
    }

    public static native void nglGetPolygonStipple(long r0);

    public static void glGetPolygonStipple(@org.lwjgl.system.NativeType("void *") java.nio.ByteBuffer r3) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Ld
            r0 = r3
            r1 = 128(0x80, float:1.8E-43)
            org.lwjgl.system.Checks.check(r0, r1)
        Ld:
            r0 = r3
            long r0 = org.lwjgl.system.MemoryUtil.memAddress(r0)
            nglGetPolygonStipple(r0)
            return
    }

    public static void glGetPolygonStipple(@org.lwjgl.system.NativeType("void *") long r3) {
            r0 = r3
            nglGetPolygonStipple(r0)
            return
    }

    public static long nglGetString(int r3) {
            r0 = r3
            long r0 = org.lwjgl.opengl.GL11C.nglGetString(r0)
            return r0
    }

    @javax.annotation.Nullable
    @org.lwjgl.system.NativeType("GLubyte const *")
    public static java.lang.String glGetString(@org.lwjgl.system.NativeType("GLenum") int r2) {
            r0 = r2
            java.lang.String r0 = org.lwjgl.opengl.GL11C.glGetString(r0)
            return r0
    }

    public static native void nglGetTexEnviv(int r0, int r1, long r2);

    public static void glGetTexEnviv(@org.lwjgl.system.NativeType("GLenum") int r5, @org.lwjgl.system.NativeType("GLenum") int r6, @org.lwjgl.system.NativeType("GLint *") java.nio.IntBuffer r7) {
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
            nglGetTexEnviv(r0, r1, r2)
            return
    }

    @org.lwjgl.system.NativeType("void")
    public static int glGetTexEnvi(@org.lwjgl.system.NativeType("GLenum") int r5, @org.lwjgl.system.NativeType("GLenum") int r6) {
            org.lwjgl.system.MemoryStack r0 = org.lwjgl.system.MemoryStack.stackGet()
            r7 = r0
            r0 = r7
            int r0 = r0.getPointer()
            r8 = r0
            r0 = r7
            r1 = 1
            java.nio.IntBuffer r0 = r0.callocInt(r1)     // Catch: java.lang.Throwable -> L2a
            r9 = r0
            r0 = r5
            r1 = r6
            r2 = r9
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)     // Catch: java.lang.Throwable -> L2a
            nglGetTexEnviv(r0, r1, r2)     // Catch: java.lang.Throwable -> L2a
            r0 = r9
            r1 = 0
            int r0 = r0.get(r1)     // Catch: java.lang.Throwable -> L2a
            r10 = r0
            r0 = r7
            r1 = r8
            r0.setPointer(r1)
            r0 = r10
            return r0
        L2a:
            r11 = move-exception
            r0 = r7
            r1 = r8
            r0.setPointer(r1)
            r0 = r11
            throw r0
    }

    public static native void nglGetTexEnvfv(int r0, int r1, long r2);

    public static void glGetTexEnvfv(@org.lwjgl.system.NativeType("GLenum") int r5, @org.lwjgl.system.NativeType("GLenum") int r6, @org.lwjgl.system.NativeType("GLfloat *") java.nio.FloatBuffer r7) {
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
            nglGetTexEnvfv(r0, r1, r2)
            return
    }

    @org.lwjgl.system.NativeType("void")
    public static float glGetTexEnvf(@org.lwjgl.system.NativeType("GLenum") int r5, @org.lwjgl.system.NativeType("GLenum") int r6) {
            org.lwjgl.system.MemoryStack r0 = org.lwjgl.system.MemoryStack.stackGet()
            r7 = r0
            r0 = r7
            int r0 = r0.getPointer()
            r8 = r0
            r0 = r7
            r1 = 1
            java.nio.FloatBuffer r0 = r0.callocFloat(r1)     // Catch: java.lang.Throwable -> L2a
            r9 = r0
            r0 = r5
            r1 = r6
            r2 = r9
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)     // Catch: java.lang.Throwable -> L2a
            nglGetTexEnvfv(r0, r1, r2)     // Catch: java.lang.Throwable -> L2a
            r0 = r9
            r1 = 0
            float r0 = r0.get(r1)     // Catch: java.lang.Throwable -> L2a
            r10 = r0
            r0 = r7
            r1 = r8
            r0.setPointer(r1)
            r0 = r10
            return r0
        L2a:
            r11 = move-exception
            r0 = r7
            r1 = r8
            r0.setPointer(r1)
            r0 = r11
            throw r0
    }

    public static native void nglGetTexGeniv(int r0, int r1, long r2);

    public static void glGetTexGeniv(@org.lwjgl.system.NativeType("GLenum") int r5, @org.lwjgl.system.NativeType("GLenum") int r6, @org.lwjgl.system.NativeType("GLint *") java.nio.IntBuffer r7) {
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
            nglGetTexGeniv(r0, r1, r2)
            return
    }

    @org.lwjgl.system.NativeType("void")
    public static int glGetTexGeni(@org.lwjgl.system.NativeType("GLenum") int r5, @org.lwjgl.system.NativeType("GLenum") int r6) {
            org.lwjgl.system.MemoryStack r0 = org.lwjgl.system.MemoryStack.stackGet()
            r7 = r0
            r0 = r7
            int r0 = r0.getPointer()
            r8 = r0
            r0 = r7
            r1 = 1
            java.nio.IntBuffer r0 = r0.callocInt(r1)     // Catch: java.lang.Throwable -> L2a
            r9 = r0
            r0 = r5
            r1 = r6
            r2 = r9
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)     // Catch: java.lang.Throwable -> L2a
            nglGetTexGeniv(r0, r1, r2)     // Catch: java.lang.Throwable -> L2a
            r0 = r9
            r1 = 0
            int r0 = r0.get(r1)     // Catch: java.lang.Throwable -> L2a
            r10 = r0
            r0 = r7
            r1 = r8
            r0.setPointer(r1)
            r0 = r10
            return r0
        L2a:
            r11 = move-exception
            r0 = r7
            r1 = r8
            r0.setPointer(r1)
            r0 = r11
            throw r0
    }

    public static native void nglGetTexGenfv(int r0, int r1, long r2);

    public static void glGetTexGenfv(@org.lwjgl.system.NativeType("GLenum") int r5, @org.lwjgl.system.NativeType("GLenum") int r6, @org.lwjgl.system.NativeType("GLfloat *") java.nio.FloatBuffer r7) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r7
            r1 = 4
            org.lwjgl.system.Checks.check(r0, r1)
        Lb:
            r0 = r5
            r1 = r6
            r2 = r7
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            nglGetTexGenfv(r0, r1, r2)
            return
    }

    @org.lwjgl.system.NativeType("void")
    public static float glGetTexGenf(@org.lwjgl.system.NativeType("GLenum") int r5, @org.lwjgl.system.NativeType("GLenum") int r6) {
            org.lwjgl.system.MemoryStack r0 = org.lwjgl.system.MemoryStack.stackGet()
            r7 = r0
            r0 = r7
            int r0 = r0.getPointer()
            r8 = r0
            r0 = r7
            r1 = 1
            java.nio.FloatBuffer r0 = r0.callocFloat(r1)     // Catch: java.lang.Throwable -> L2a
            r9 = r0
            r0 = r5
            r1 = r6
            r2 = r9
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)     // Catch: java.lang.Throwable -> L2a
            nglGetTexGenfv(r0, r1, r2)     // Catch: java.lang.Throwable -> L2a
            r0 = r9
            r1 = 0
            float r0 = r0.get(r1)     // Catch: java.lang.Throwable -> L2a
            r10 = r0
            r0 = r7
            r1 = r8
            r0.setPointer(r1)
            r0 = r10
            return r0
        L2a:
            r11 = move-exception
            r0 = r7
            r1 = r8
            r0.setPointer(r1)
            r0 = r11
            throw r0
    }

    public static native void nglGetTexGendv(int r0, int r1, long r2);

    public static void glGetTexGendv(@org.lwjgl.system.NativeType("GLenum") int r5, @org.lwjgl.system.NativeType("GLenum") int r6, @org.lwjgl.system.NativeType("GLdouble *") java.nio.DoubleBuffer r7) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r7
            r1 = 4
            org.lwjgl.system.Checks.check(r0, r1)
        Lb:
            r0 = r5
            r1 = r6
            r2 = r7
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            nglGetTexGendv(r0, r1, r2)
            return
    }

    @org.lwjgl.system.NativeType("void")
    public static double glGetTexGend(@org.lwjgl.system.NativeType("GLenum") int r5, @org.lwjgl.system.NativeType("GLenum") int r6) {
            org.lwjgl.system.MemoryStack r0 = org.lwjgl.system.MemoryStack.stackGet()
            r7 = r0
            r0 = r7
            int r0 = r0.getPointer()
            r8 = r0
            r0 = r7
            r1 = 1
            java.nio.DoubleBuffer r0 = r0.callocDouble(r1)     // Catch: java.lang.Throwable -> L2a
            r9 = r0
            r0 = r5
            r1 = r6
            r2 = r9
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)     // Catch: java.lang.Throwable -> L2a
            nglGetTexGendv(r0, r1, r2)     // Catch: java.lang.Throwable -> L2a
            r0 = r9
            r1 = 0
            double r0 = r0.get(r1)     // Catch: java.lang.Throwable -> L2a
            r10 = r0
            r0 = r7
            r1 = r8
            r0.setPointer(r1)
            r0 = r10
            return r0
        L2a:
            r12 = move-exception
            r0 = r7
            r1 = r8
            r0.setPointer(r1)
            r0 = r12
            throw r0
    }

    public static void nglGetTexImage(int r7, int r8, int r9, int r10, long r11) {
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            org.lwjgl.opengl.GL11C.nglGetTexImage(r0, r1, r2, r3, r4)
            return
    }

    public static void glGetTexImage(@org.lwjgl.system.NativeType("GLenum") int r6, @org.lwjgl.system.NativeType("GLint") int r7, @org.lwjgl.system.NativeType("GLenum") int r8, @org.lwjgl.system.NativeType("GLenum") int r9, @org.lwjgl.system.NativeType("void *") java.nio.ByteBuffer r10) {
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            org.lwjgl.opengl.GL11C.glGetTexImage(r0, r1, r2, r3, r4)
            return
    }

    public static void glGetTexImage(@org.lwjgl.system.NativeType("GLenum") int r7, @org.lwjgl.system.NativeType("GLint") int r8, @org.lwjgl.system.NativeType("GLenum") int r9, @org.lwjgl.system.NativeType("GLenum") int r10, @org.lwjgl.system.NativeType("void *") long r11) {
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            org.lwjgl.opengl.GL11C.glGetTexImage(r0, r1, r2, r3, r4)
            return
    }

    public static void glGetTexImage(@org.lwjgl.system.NativeType("GLenum") int r6, @org.lwjgl.system.NativeType("GLint") int r7, @org.lwjgl.system.NativeType("GLenum") int r8, @org.lwjgl.system.NativeType("GLenum") int r9, @org.lwjgl.system.NativeType("void *") java.nio.ShortBuffer r10) {
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            org.lwjgl.opengl.GL11C.glGetTexImage(r0, r1, r2, r3, r4)
            return
    }

    public static void glGetTexImage(@org.lwjgl.system.NativeType("GLenum") int r6, @org.lwjgl.system.NativeType("GLint") int r7, @org.lwjgl.system.NativeType("GLenum") int r8, @org.lwjgl.system.NativeType("GLenum") int r9, @org.lwjgl.system.NativeType("void *") java.nio.IntBuffer r10) {
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            org.lwjgl.opengl.GL11C.glGetTexImage(r0, r1, r2, r3, r4)
            return
    }

    public static void glGetTexImage(@org.lwjgl.system.NativeType("GLenum") int r6, @org.lwjgl.system.NativeType("GLint") int r7, @org.lwjgl.system.NativeType("GLenum") int r8, @org.lwjgl.system.NativeType("GLenum") int r9, @org.lwjgl.system.NativeType("void *") java.nio.FloatBuffer r10) {
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            org.lwjgl.opengl.GL11C.glGetTexImage(r0, r1, r2, r3, r4)
            return
    }

    public static void glGetTexImage(@org.lwjgl.system.NativeType("GLenum") int r6, @org.lwjgl.system.NativeType("GLint") int r7, @org.lwjgl.system.NativeType("GLenum") int r8, @org.lwjgl.system.NativeType("GLenum") int r9, @org.lwjgl.system.NativeType("void *") java.nio.DoubleBuffer r10) {
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            org.lwjgl.opengl.GL11C.glGetTexImage(r0, r1, r2, r3, r4)
            return
    }

    public static void nglGetTexLevelParameteriv(int r6, int r7, int r8, long r9) {
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            org.lwjgl.opengl.GL11C.nglGetTexLevelParameteriv(r0, r1, r2, r3)
            return
    }

    public static void glGetTexLevelParameteriv(@org.lwjgl.system.NativeType("GLenum") int r5, @org.lwjgl.system.NativeType("GLint") int r6, @org.lwjgl.system.NativeType("GLenum") int r7, @org.lwjgl.system.NativeType("GLint *") java.nio.IntBuffer r8) {
            r0 = r5
            r1 = r6
            r2 = r7
            r3 = r8
            org.lwjgl.opengl.GL11C.glGetTexLevelParameteriv(r0, r1, r2, r3)
            return
    }

    @org.lwjgl.system.NativeType("void")
    public static int glGetTexLevelParameteri(@org.lwjgl.system.NativeType("GLenum") int r4, @org.lwjgl.system.NativeType("GLint") int r5, @org.lwjgl.system.NativeType("GLenum") int r6) {
            r0 = r4
            r1 = r5
            r2 = r6
            int r0 = org.lwjgl.opengl.GL11C.glGetTexLevelParameteri(r0, r1, r2)
            return r0
    }

    public static void nglGetTexLevelParameterfv(int r6, int r7, int r8, long r9) {
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            org.lwjgl.opengl.GL11C.nglGetTexLevelParameterfv(r0, r1, r2, r3)
            return
    }

    public static void glGetTexLevelParameterfv(@org.lwjgl.system.NativeType("GLenum") int r5, @org.lwjgl.system.NativeType("GLint") int r6, @org.lwjgl.system.NativeType("GLenum") int r7, @org.lwjgl.system.NativeType("GLfloat *") java.nio.FloatBuffer r8) {
            r0 = r5
            r1 = r6
            r2 = r7
            r3 = r8
            org.lwjgl.opengl.GL11C.glGetTexLevelParameterfv(r0, r1, r2, r3)
            return
    }

    @org.lwjgl.system.NativeType("void")
    public static float glGetTexLevelParameterf(@org.lwjgl.system.NativeType("GLenum") int r4, @org.lwjgl.system.NativeType("GLint") int r5, @org.lwjgl.system.NativeType("GLenum") int r6) {
            r0 = r4
            r1 = r5
            r2 = r6
            float r0 = org.lwjgl.opengl.GL11C.glGetTexLevelParameterf(r0, r1, r2)
            return r0
    }

    public static void nglGetTexParameteriv(int r5, int r6, long r7) {
            r0 = r5
            r1 = r6
            r2 = r7
            org.lwjgl.opengl.GL11C.nglGetTexParameteriv(r0, r1, r2)
            return
    }

    public static void glGetTexParameteriv(@org.lwjgl.system.NativeType("GLenum") int r4, @org.lwjgl.system.NativeType("GLenum") int r5, @org.lwjgl.system.NativeType("GLint *") java.nio.IntBuffer r6) {
            r0 = r4
            r1 = r5
            r2 = r6
            org.lwjgl.opengl.GL11C.glGetTexParameteriv(r0, r1, r2)
            return
    }

    @org.lwjgl.system.NativeType("void")
    public static int glGetTexParameteri(@org.lwjgl.system.NativeType("GLenum") int r3, @org.lwjgl.system.NativeType("GLenum") int r4) {
            r0 = r3
            r1 = r4
            int r0 = org.lwjgl.opengl.GL11C.glGetTexParameteri(r0, r1)
            return r0
    }

    public static void nglGetTexParameterfv(int r5, int r6, long r7) {
            r0 = r5
            r1 = r6
            r2 = r7
            org.lwjgl.opengl.GL11C.nglGetTexParameterfv(r0, r1, r2)
            return
    }

    public static void glGetTexParameterfv(@org.lwjgl.system.NativeType("GLenum") int r4, @org.lwjgl.system.NativeType("GLenum") int r5, @org.lwjgl.system.NativeType("GLfloat *") java.nio.FloatBuffer r6) {
            r0 = r4
            r1 = r5
            r2 = r6
            org.lwjgl.opengl.GL11C.glGetTexParameterfv(r0, r1, r2)
            return
    }

    @org.lwjgl.system.NativeType("void")
    public static float glGetTexParameterf(@org.lwjgl.system.NativeType("GLenum") int r3, @org.lwjgl.system.NativeType("GLenum") int r4) {
            r0 = r3
            r1 = r4
            float r0 = org.lwjgl.opengl.GL11C.glGetTexParameterf(r0, r1)
            return r0
    }

    public static void glHint(@org.lwjgl.system.NativeType("GLenum") int r3, @org.lwjgl.system.NativeType("GLenum") int r4) {
            r0 = r3
            r1 = r4
            org.lwjgl.opengl.GL11C.glHint(r0, r1)
            return
    }

    public static native void glIndexi(@org.lwjgl.system.NativeType("GLint") int r0);

    public static native void glIndexub(@org.lwjgl.system.NativeType("GLubyte") byte r0);

    public static native void glIndexs(@org.lwjgl.system.NativeType("GLshort") short r0);

    public static native void glIndexf(@org.lwjgl.system.NativeType("GLfloat") float r0);

    public static native void glIndexd(@org.lwjgl.system.NativeType("GLdouble") double r0);

    public static native void nglIndexiv(long r0);

    public static void glIndexiv(@org.lwjgl.system.NativeType("GLint const *") java.nio.IntBuffer r3) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r3
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
        Lb:
            r0 = r3
            long r0 = org.lwjgl.system.MemoryUtil.memAddress(r0)
            nglIndexiv(r0)
            return
    }

    public static native void nglIndexubv(long r0);

    public static void glIndexubv(@org.lwjgl.system.NativeType("GLubyte const *") java.nio.ByteBuffer r3) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r3
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
        Lb:
            r0 = r3
            long r0 = org.lwjgl.system.MemoryUtil.memAddress(r0)
            nglIndexubv(r0)
            return
    }

    public static native void nglIndexsv(long r0);

    public static void glIndexsv(@org.lwjgl.system.NativeType("GLshort const *") java.nio.ShortBuffer r3) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r3
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
        Lb:
            r0 = r3
            long r0 = org.lwjgl.system.MemoryUtil.memAddress(r0)
            nglIndexsv(r0)
            return
    }

    public static native void nglIndexfv(long r0);

    public static void glIndexfv(@org.lwjgl.system.NativeType("GLfloat const *") java.nio.FloatBuffer r3) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r3
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
        Lb:
            r0 = r3
            long r0 = org.lwjgl.system.MemoryUtil.memAddress(r0)
            nglIndexfv(r0)
            return
    }

    public static native void nglIndexdv(long r0);

    public static void glIndexdv(@org.lwjgl.system.NativeType("GLdouble const *") java.nio.DoubleBuffer r3) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r3
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
        Lb:
            r0 = r3
            long r0 = org.lwjgl.system.MemoryUtil.memAddress(r0)
            nglIndexdv(r0)
            return
    }

    public static native void glIndexMask(@org.lwjgl.system.NativeType("GLuint") int r0);

    public static native void nglIndexPointer(int r0, int r1, long r2);

    public static void glIndexPointer(@org.lwjgl.system.NativeType("GLenum") int r5, @org.lwjgl.system.NativeType("GLsizei") int r6, @org.lwjgl.system.NativeType("void const *") java.nio.ByteBuffer r7) {
            r0 = r5
            r1 = r6
            r2 = r7
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            nglIndexPointer(r0, r1, r2)
            return
    }

    public static void glIndexPointer(@org.lwjgl.system.NativeType("GLenum") int r5, @org.lwjgl.system.NativeType("GLsizei") int r6, @org.lwjgl.system.NativeType("void const *") long r7) {
            r0 = r5
            r1 = r6
            r2 = r7
            nglIndexPointer(r0, r1, r2)
            return
    }

    public static void glIndexPointer(@org.lwjgl.system.NativeType("GLsizei") int r5, @org.lwjgl.system.NativeType("void const *") java.nio.ByteBuffer r6) {
            r0 = 5121(0x1401, float:7.176E-42)
            r1 = r5
            r2 = r6
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            nglIndexPointer(r0, r1, r2)
            return
    }

    public static void glIndexPointer(@org.lwjgl.system.NativeType("GLsizei") int r5, @org.lwjgl.system.NativeType("void const *") java.nio.ShortBuffer r6) {
            r0 = 5122(0x1402, float:7.177E-42)
            r1 = r5
            r2 = r6
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            nglIndexPointer(r0, r1, r2)
            return
    }

    public static void glIndexPointer(@org.lwjgl.system.NativeType("GLsizei") int r5, @org.lwjgl.system.NativeType("void const *") java.nio.IntBuffer r6) {
            r0 = 5124(0x1404, float:7.18E-42)
            r1 = r5
            r2 = r6
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            nglIndexPointer(r0, r1, r2)
            return
    }

    public static native void glInitNames();

    public static native void nglInterleavedArrays(int r0, int r1, long r2);

    public static void glInterleavedArrays(@org.lwjgl.system.NativeType("GLenum") int r5, @org.lwjgl.system.NativeType("GLsizei") int r6, @org.lwjgl.system.NativeType("void const *") java.nio.ByteBuffer r7) {
            r0 = r5
            r1 = r6
            r2 = r7
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            nglInterleavedArrays(r0, r1, r2)
            return
    }

    public static void glInterleavedArrays(@org.lwjgl.system.NativeType("GLenum") int r5, @org.lwjgl.system.NativeType("GLsizei") int r6, @org.lwjgl.system.NativeType("void const *") long r7) {
            r0 = r5
            r1 = r6
            r2 = r7
            nglInterleavedArrays(r0, r1, r2)
            return
    }

    public static void glInterleavedArrays(@org.lwjgl.system.NativeType("GLenum") int r5, @org.lwjgl.system.NativeType("GLsizei") int r6, @org.lwjgl.system.NativeType("void const *") java.nio.ShortBuffer r7) {
            r0 = r5
            r1 = r6
            r2 = r7
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            nglInterleavedArrays(r0, r1, r2)
            return
    }

    public static void glInterleavedArrays(@org.lwjgl.system.NativeType("GLenum") int r5, @org.lwjgl.system.NativeType("GLsizei") int r6, @org.lwjgl.system.NativeType("void const *") java.nio.IntBuffer r7) {
            r0 = r5
            r1 = r6
            r2 = r7
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            nglInterleavedArrays(r0, r1, r2)
            return
    }

    public static void glInterleavedArrays(@org.lwjgl.system.NativeType("GLenum") int r5, @org.lwjgl.system.NativeType("GLsizei") int r6, @org.lwjgl.system.NativeType("void const *") java.nio.FloatBuffer r7) {
            r0 = r5
            r1 = r6
            r2 = r7
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            nglInterleavedArrays(r0, r1, r2)
            return
    }

    public static void glInterleavedArrays(@org.lwjgl.system.NativeType("GLenum") int r5, @org.lwjgl.system.NativeType("GLsizei") int r6, @org.lwjgl.system.NativeType("void const *") java.nio.DoubleBuffer r7) {
            r0 = r5
            r1 = r6
            r2 = r7
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            nglInterleavedArrays(r0, r1, r2)
            return
    }

    @org.lwjgl.system.NativeType("GLboolean")
    public static boolean glIsEnabled(@org.lwjgl.system.NativeType("GLenum") int r2) {
            r0 = r2
            boolean r0 = org.lwjgl.opengl.GL11C.glIsEnabled(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("GLboolean")
    public static native boolean glIsList(@org.lwjgl.system.NativeType("GLuint") int r0);

    @org.lwjgl.system.NativeType("GLboolean")
    public static boolean glIsTexture(@org.lwjgl.system.NativeType("GLuint") int r2) {
            r0 = r2
            boolean r0 = org.lwjgl.opengl.GL11C.glIsTexture(r0)
            return r0
    }

    public static native void glLightModeli(@org.lwjgl.system.NativeType("GLenum") int r0, @org.lwjgl.system.NativeType("GLint") int r1);

    public static native void glLightModelf(@org.lwjgl.system.NativeType("GLenum") int r0, @org.lwjgl.system.NativeType("GLfloat") float r1);

    public static native void nglLightModeliv(int r0, long r1);

    public static void glLightModeliv(@org.lwjgl.system.NativeType("GLenum") int r4, @org.lwjgl.system.NativeType("GLint const *") java.nio.IntBuffer r5) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r5
            r1 = 4
            org.lwjgl.system.Checks.check(r0, r1)
        Lb:
            r0 = r4
            r1 = r5
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            nglLightModeliv(r0, r1)
            return
    }

    public static native void nglLightModelfv(int r0, long r1);

    public static void glLightModelfv(@org.lwjgl.system.NativeType("GLenum") int r4, @org.lwjgl.system.NativeType("GLfloat const *") java.nio.FloatBuffer r5) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r5
            r1 = 4
            org.lwjgl.system.Checks.check(r0, r1)
        Lb:
            r0 = r4
            r1 = r5
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            nglLightModelfv(r0, r1)
            return
    }

    public static native void glLighti(@org.lwjgl.system.NativeType("GLenum") int r0, @org.lwjgl.system.NativeType("GLenum") int r1, @org.lwjgl.system.NativeType("GLint") int r2);

    public static native void glLightf(@org.lwjgl.system.NativeType("GLenum") int r0, @org.lwjgl.system.NativeType("GLenum") int r1, @org.lwjgl.system.NativeType("GLfloat") float r2);

    public static native void nglLightiv(int r0, int r1, long r2);

    public static void glLightiv(@org.lwjgl.system.NativeType("GLenum") int r5, @org.lwjgl.system.NativeType("GLenum") int r6, @org.lwjgl.system.NativeType("GLint const *") java.nio.IntBuffer r7) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r7
            r1 = 4
            org.lwjgl.system.Checks.check(r0, r1)
        Lb:
            r0 = r5
            r1 = r6
            r2 = r7
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            nglLightiv(r0, r1, r2)
            return
    }

    public static native void nglLightfv(int r0, int r1, long r2);

    public static void glLightfv(@org.lwjgl.system.NativeType("GLenum") int r5, @org.lwjgl.system.NativeType("GLenum") int r6, @org.lwjgl.system.NativeType("GLfloat const *") java.nio.FloatBuffer r7) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r7
            r1 = 4
            org.lwjgl.system.Checks.check(r0, r1)
        Lb:
            r0 = r5
            r1 = r6
            r2 = r7
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            nglLightfv(r0, r1, r2)
            return
    }

    public static native void glLineStipple(@org.lwjgl.system.NativeType("GLint") int r0, @org.lwjgl.system.NativeType("GLushort") short r1);

    public static void glLineWidth(@org.lwjgl.system.NativeType("GLfloat") float r2) {
            r0 = r2
            org.lwjgl.opengl.GL11C.glLineWidth(r0)
            return
    }

    public static native void glListBase(@org.lwjgl.system.NativeType("GLuint") int r0);

    public static native void nglLoadMatrixf(long r0);

    public static void glLoadMatrixf(@org.lwjgl.system.NativeType("GLfloat const *") java.nio.FloatBuffer r3) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lc
            r0 = r3
            r1 = 16
            org.lwjgl.system.Checks.check(r0, r1)
        Lc:
            r0 = r3
            long r0 = org.lwjgl.system.MemoryUtil.memAddress(r0)
            nglLoadMatrixf(r0)
            return
    }

    public static native void nglLoadMatrixd(long r0);

    public static void glLoadMatrixd(@org.lwjgl.system.NativeType("GLdouble const *") java.nio.DoubleBuffer r3) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lc
            r0 = r3
            r1 = 16
            org.lwjgl.system.Checks.check(r0, r1)
        Lc:
            r0 = r3
            long r0 = org.lwjgl.system.MemoryUtil.memAddress(r0)
            nglLoadMatrixd(r0)
            return
    }

    public static native void glLoadIdentity();

    public static native void glLoadName(@org.lwjgl.system.NativeType("GLuint") int r0);

    public static void glLogicOp(@org.lwjgl.system.NativeType("GLenum") int r2) {
            r0 = r2
            org.lwjgl.opengl.GL11C.glLogicOp(r0)
            return
    }

    public static native void nglMap1f(int r0, float r1, float r2, int r3, int r4, long r5);

    public static void glMap1f(@org.lwjgl.system.NativeType("GLenum") int r8, @org.lwjgl.system.NativeType("GLfloat") float r9, @org.lwjgl.system.NativeType("GLfloat") float r10, @org.lwjgl.system.NativeType("GLint") int r11, @org.lwjgl.system.NativeType("GLint") int r12, @org.lwjgl.system.NativeType("GLfloat const *") java.nio.FloatBuffer r13) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lf
            r0 = r13
            r1 = r12
            r2 = r11
            int r1 = r1 * r2
            org.lwjgl.system.Checks.check(r0, r1)
        Lf:
            r0 = r8
            r1 = r9
            r2 = r10
            r3 = r11
            r4 = r12
            r5 = r13
            long r5 = org.lwjgl.system.MemoryUtil.memAddress(r5)
            nglMap1f(r0, r1, r2, r3, r4, r5)
            return
    }

    public static native void nglMap1d(int r0, double r1, double r3, int r5, int r6, long r7);

    public static void glMap1d(@org.lwjgl.system.NativeType("GLenum") int r10, @org.lwjgl.system.NativeType("GLdouble") double r11, @org.lwjgl.system.NativeType("GLdouble") double r13, @org.lwjgl.system.NativeType("GLint") int r15, @org.lwjgl.system.NativeType("GLint") int r16, @org.lwjgl.system.NativeType("GLdouble const *") java.nio.DoubleBuffer r17) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L10
            r0 = r17
            r1 = r15
            r2 = r16
            int r1 = r1 * r2
            org.lwjgl.system.Checks.check(r0, r1)
        L10:
            r0 = r10
            r1 = r11
            r2 = r13
            r3 = r15
            r4 = r16
            r5 = r17
            long r5 = org.lwjgl.system.MemoryUtil.memAddress(r5)
            nglMap1d(r0, r1, r2, r3, r4, r5)
            return
    }

    public static native void nglMap2f(int r0, float r1, float r2, int r3, int r4, float r5, float r6, int r7, int r8, long r9);

    public static void glMap2f(@org.lwjgl.system.NativeType("GLenum") int r12, @org.lwjgl.system.NativeType("GLfloat") float r13, @org.lwjgl.system.NativeType("GLfloat") float r14, @org.lwjgl.system.NativeType("GLint") int r15, @org.lwjgl.system.NativeType("GLint") int r16, @org.lwjgl.system.NativeType("GLfloat") float r17, @org.lwjgl.system.NativeType("GLfloat") float r18, @org.lwjgl.system.NativeType("GLint") int r19, @org.lwjgl.system.NativeType("GLint") int r20, @org.lwjgl.system.NativeType("GLfloat const *") java.nio.FloatBuffer r21) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L15
            r0 = r21
            r1 = r15
            r2 = r16
            int r1 = r1 * r2
            r2 = r19
            int r1 = r1 * r2
            r2 = r20
            int r1 = r1 * r2
            org.lwjgl.system.Checks.check(r0, r1)
        L15:
            r0 = r12
            r1 = r13
            r2 = r14
            r3 = r15
            r4 = r16
            r5 = r17
            r6 = r18
            r7 = r19
            r8 = r20
            r9 = r21
            long r9 = org.lwjgl.system.MemoryUtil.memAddress(r9)
            nglMap2f(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9)
            return
    }

    public static native void nglMap2d(int r0, double r1, double r3, int r5, int r6, double r7, double r9, int r11, int r12, long r13);

    public static void glMap2d(@org.lwjgl.system.NativeType("GLenum") int r16, @org.lwjgl.system.NativeType("GLdouble") double r17, @org.lwjgl.system.NativeType("GLdouble") double r19, @org.lwjgl.system.NativeType("GLint") int r21, @org.lwjgl.system.NativeType("GLint") int r22, @org.lwjgl.system.NativeType("GLdouble") double r23, @org.lwjgl.system.NativeType("GLdouble") double r25, @org.lwjgl.system.NativeType("GLint") int r27, @org.lwjgl.system.NativeType("GLint") int r28, @org.lwjgl.system.NativeType("GLdouble const *") java.nio.DoubleBuffer r29) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L16
            r0 = r29
            r1 = r21
            r2 = r22
            int r1 = r1 * r2
            r2 = r27
            int r1 = r1 * r2
            r2 = r28
            int r1 = r1 * r2
            org.lwjgl.system.Checks.check(r0, r1)
        L16:
            r0 = r16
            r1 = r17
            r2 = r19
            r3 = r21
            r4 = r22
            r5 = r23
            r6 = r25
            r7 = r27
            r8 = r28
            r9 = r29
            long r9 = org.lwjgl.system.MemoryUtil.memAddress(r9)
            nglMap2d(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9)
            return
    }

    public static native void glMapGrid1f(@org.lwjgl.system.NativeType("GLint") int r0, @org.lwjgl.system.NativeType("GLfloat") float r1, @org.lwjgl.system.NativeType("GLfloat") float r2);

    public static native void glMapGrid1d(@org.lwjgl.system.NativeType("GLint") int r0, @org.lwjgl.system.NativeType("GLdouble") double r1, @org.lwjgl.system.NativeType("GLdouble") double r3);

    public static native void glMapGrid2f(@org.lwjgl.system.NativeType("GLint") int r0, @org.lwjgl.system.NativeType("GLfloat") float r1, @org.lwjgl.system.NativeType("GLfloat") float r2, @org.lwjgl.system.NativeType("GLint") int r3, @org.lwjgl.system.NativeType("GLfloat") float r4, @org.lwjgl.system.NativeType("GLfloat") float r5);

    public static native void glMapGrid2d(@org.lwjgl.system.NativeType("GLint") int r0, @org.lwjgl.system.NativeType("GLdouble") double r1, @org.lwjgl.system.NativeType("GLdouble") double r3, @org.lwjgl.system.NativeType("GLint") int r5, @org.lwjgl.system.NativeType("GLdouble") double r6, @org.lwjgl.system.NativeType("GLdouble") double r8);

    public static native void glMateriali(@org.lwjgl.system.NativeType("GLenum") int r0, @org.lwjgl.system.NativeType("GLenum") int r1, @org.lwjgl.system.NativeType("GLint") int r2);

    public static native void glMaterialf(@org.lwjgl.system.NativeType("GLenum") int r0, @org.lwjgl.system.NativeType("GLenum") int r1, @org.lwjgl.system.NativeType("GLfloat") float r2);

    public static native void nglMaterialiv(int r0, int r1, long r2);

    public static void glMaterialiv(@org.lwjgl.system.NativeType("GLenum") int r5, @org.lwjgl.system.NativeType("GLenum") int r6, @org.lwjgl.system.NativeType("GLint const *") java.nio.IntBuffer r7) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r7
            r1 = 4
            org.lwjgl.system.Checks.check(r0, r1)
        Lb:
            r0 = r5
            r1 = r6
            r2 = r7
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            nglMaterialiv(r0, r1, r2)
            return
    }

    public static native void nglMaterialfv(int r0, int r1, long r2);

    public static void glMaterialfv(@org.lwjgl.system.NativeType("GLenum") int r5, @org.lwjgl.system.NativeType("GLenum") int r6, @org.lwjgl.system.NativeType("GLfloat const *") java.nio.FloatBuffer r7) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r7
            r1 = 4
            org.lwjgl.system.Checks.check(r0, r1)
        Lb:
            r0 = r5
            r1 = r6
            r2 = r7
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            nglMaterialfv(r0, r1, r2)
            return
    }

    public static native void glMatrixMode(@org.lwjgl.system.NativeType("GLenum") int r0);

    public static native void nglMultMatrixf(long r0);

    public static void glMultMatrixf(@org.lwjgl.system.NativeType("GLfloat const *") java.nio.FloatBuffer r3) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lc
            r0 = r3
            r1 = 16
            org.lwjgl.system.Checks.check(r0, r1)
        Lc:
            r0 = r3
            long r0 = org.lwjgl.system.MemoryUtil.memAddress(r0)
            nglMultMatrixf(r0)
            return
    }

    public static native void nglMultMatrixd(long r0);

    public static void glMultMatrixd(@org.lwjgl.system.NativeType("GLdouble const *") java.nio.DoubleBuffer r3) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lc
            r0 = r3
            r1 = 16
            org.lwjgl.system.Checks.check(r0, r1)
        Lc:
            r0 = r3
            long r0 = org.lwjgl.system.MemoryUtil.memAddress(r0)
            nglMultMatrixd(r0)
            return
    }

    public static native void glFrustum(@org.lwjgl.system.NativeType("GLdouble") double r0, @org.lwjgl.system.NativeType("GLdouble") double r2, @org.lwjgl.system.NativeType("GLdouble") double r4, @org.lwjgl.system.NativeType("GLdouble") double r6, @org.lwjgl.system.NativeType("GLdouble") double r8, @org.lwjgl.system.NativeType("GLdouble") double r10);

    public static native void glNewList(@org.lwjgl.system.NativeType("GLuint") int r0, @org.lwjgl.system.NativeType("GLenum") int r1);

    public static native void glEndList();

    public static native void glNormal3f(@org.lwjgl.system.NativeType("GLfloat") float r0, @org.lwjgl.system.NativeType("GLfloat") float r1, @org.lwjgl.system.NativeType("GLfloat") float r2);

    public static native void glNormal3b(@org.lwjgl.system.NativeType("GLbyte") byte r0, @org.lwjgl.system.NativeType("GLbyte") byte r1, @org.lwjgl.system.NativeType("GLbyte") byte r2);

    public static native void glNormal3s(@org.lwjgl.system.NativeType("GLshort") short r0, @org.lwjgl.system.NativeType("GLshort") short r1, @org.lwjgl.system.NativeType("GLshort") short r2);

    public static native void glNormal3i(@org.lwjgl.system.NativeType("GLint") int r0, @org.lwjgl.system.NativeType("GLint") int r1, @org.lwjgl.system.NativeType("GLint") int r2);

    public static native void glNormal3d(@org.lwjgl.system.NativeType("GLdouble") double r0, @org.lwjgl.system.NativeType("GLdouble") double r2, @org.lwjgl.system.NativeType("GLdouble") double r4);

    public static native void nglNormal3fv(long r0);

    public static void glNormal3fv(@org.lwjgl.system.NativeType("GLfloat const *") java.nio.FloatBuffer r3) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r3
            r1 = 3
            org.lwjgl.system.Checks.check(r0, r1)
        Lb:
            r0 = r3
            long r0 = org.lwjgl.system.MemoryUtil.memAddress(r0)
            nglNormal3fv(r0)
            return
    }

    public static native void nglNormal3bv(long r0);

    public static void glNormal3bv(@org.lwjgl.system.NativeType("GLbyte const *") java.nio.ByteBuffer r3) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r3
            r1 = 3
            org.lwjgl.system.Checks.check(r0, r1)
        Lb:
            r0 = r3
            long r0 = org.lwjgl.system.MemoryUtil.memAddress(r0)
            nglNormal3bv(r0)
            return
    }

    public static native void nglNormal3sv(long r0);

    public static void glNormal3sv(@org.lwjgl.system.NativeType("GLshort const *") java.nio.ShortBuffer r3) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r3
            r1 = 3
            org.lwjgl.system.Checks.check(r0, r1)
        Lb:
            r0 = r3
            long r0 = org.lwjgl.system.MemoryUtil.memAddress(r0)
            nglNormal3sv(r0)
            return
    }

    public static native void nglNormal3iv(long r0);

    public static void glNormal3iv(@org.lwjgl.system.NativeType("GLint const *") java.nio.IntBuffer r3) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r3
            r1 = 3
            org.lwjgl.system.Checks.check(r0, r1)
        Lb:
            r0 = r3
            long r0 = org.lwjgl.system.MemoryUtil.memAddress(r0)
            nglNormal3iv(r0)
            return
    }

    public static native void nglNormal3dv(long r0);

    public static void glNormal3dv(@org.lwjgl.system.NativeType("GLdouble const *") java.nio.DoubleBuffer r3) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r3
            r1 = 3
            org.lwjgl.system.Checks.check(r0, r1)
        Lb:
            r0 = r3
            long r0 = org.lwjgl.system.MemoryUtil.memAddress(r0)
            nglNormal3dv(r0)
            return
    }

    public static native void nglNormalPointer(int r0, int r1, long r2);

    public static void glNormalPointer(@org.lwjgl.system.NativeType("GLenum") int r5, @org.lwjgl.system.NativeType("GLsizei") int r6, @org.lwjgl.system.NativeType("void const *") java.nio.ByteBuffer r7) {
            r0 = r5
            r1 = r6
            r2 = r7
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            nglNormalPointer(r0, r1, r2)
            return
    }

    public static void glNormalPointer(@org.lwjgl.system.NativeType("GLenum") int r5, @org.lwjgl.system.NativeType("GLsizei") int r6, @org.lwjgl.system.NativeType("void const *") long r7) {
            r0 = r5
            r1 = r6
            r2 = r7
            nglNormalPointer(r0, r1, r2)
            return
    }

    public static void glNormalPointer(@org.lwjgl.system.NativeType("GLenum") int r5, @org.lwjgl.system.NativeType("GLsizei") int r6, @org.lwjgl.system.NativeType("void const *") java.nio.ShortBuffer r7) {
            r0 = r5
            r1 = r6
            r2 = r7
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            nglNormalPointer(r0, r1, r2)
            return
    }

    public static void glNormalPointer(@org.lwjgl.system.NativeType("GLenum") int r5, @org.lwjgl.system.NativeType("GLsizei") int r6, @org.lwjgl.system.NativeType("void const *") java.nio.IntBuffer r7) {
            r0 = r5
            r1 = r6
            r2 = r7
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            nglNormalPointer(r0, r1, r2)
            return
    }

    public static void glNormalPointer(@org.lwjgl.system.NativeType("GLenum") int r5, @org.lwjgl.system.NativeType("GLsizei") int r6, @org.lwjgl.system.NativeType("void const *") java.nio.FloatBuffer r7) {
            r0 = r5
            r1 = r6
            r2 = r7
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            nglNormalPointer(r0, r1, r2)
            return
    }

    public static native void glOrtho(@org.lwjgl.system.NativeType("GLdouble") double r0, @org.lwjgl.system.NativeType("GLdouble") double r2, @org.lwjgl.system.NativeType("GLdouble") double r4, @org.lwjgl.system.NativeType("GLdouble") double r6, @org.lwjgl.system.NativeType("GLdouble") double r8, @org.lwjgl.system.NativeType("GLdouble") double r10);

    public static native void glPassThrough(@org.lwjgl.system.NativeType("GLfloat") float r0);

    public static native void nglPixelMapfv(int r0, int r1, long r2);

    public static void glPixelMapfv(@org.lwjgl.system.NativeType("GLenum") int r5, @org.lwjgl.system.NativeType("GLsizei") int r6, @org.lwjgl.system.NativeType("GLfloat const *") long r7) {
            r0 = r5
            r1 = r6
            r2 = r7
            nglPixelMapfv(r0, r1, r2)
            return
    }

    public static void glPixelMapfv(@org.lwjgl.system.NativeType("GLenum") int r5, @org.lwjgl.system.NativeType("GLfloat const *") java.nio.FloatBuffer r6) {
            r0 = r5
            r1 = r6
            int r1 = r1.remaining()
            r2 = r6
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            nglPixelMapfv(r0, r1, r2)
            return
    }

    public static native void nglPixelMapusv(int r0, int r1, long r2);

    public static void glPixelMapusv(@org.lwjgl.system.NativeType("GLenum") int r5, @org.lwjgl.system.NativeType("GLsizei") int r6, @org.lwjgl.system.NativeType("GLushort const *") long r7) {
            r0 = r5
            r1 = r6
            r2 = r7
            nglPixelMapusv(r0, r1, r2)
            return
    }

    public static void glPixelMapusv(@org.lwjgl.system.NativeType("GLenum") int r5, @org.lwjgl.system.NativeType("GLushort const *") java.nio.ShortBuffer r6) {
            r0 = r5
            r1 = r6
            int r1 = r1.remaining()
            r2 = r6
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            nglPixelMapusv(r0, r1, r2)
            return
    }

    public static native void nglPixelMapuiv(int r0, int r1, long r2);

    public static void glPixelMapuiv(@org.lwjgl.system.NativeType("GLenum") int r5, @org.lwjgl.system.NativeType("GLsizei") int r6, @org.lwjgl.system.NativeType("GLuint const *") long r7) {
            r0 = r5
            r1 = r6
            r2 = r7
            nglPixelMapuiv(r0, r1, r2)
            return
    }

    public static void glPixelMapuiv(@org.lwjgl.system.NativeType("GLenum") int r5, @org.lwjgl.system.NativeType("GLuint const *") java.nio.IntBuffer r6) {
            r0 = r5
            r1 = r6
            int r1 = r1.remaining()
            r2 = r6
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            nglPixelMapuiv(r0, r1, r2)
            return
    }

    public static void glPixelStorei(@org.lwjgl.system.NativeType("GLenum") int r3, @org.lwjgl.system.NativeType("GLint") int r4) {
            r0 = r3
            r1 = r4
            org.lwjgl.opengl.GL11C.glPixelStorei(r0, r1)
            return
    }

    public static void glPixelStoref(@org.lwjgl.system.NativeType("GLenum") int r3, @org.lwjgl.system.NativeType("GLfloat") float r4) {
            r0 = r3
            r1 = r4
            org.lwjgl.opengl.GL11C.glPixelStoref(r0, r1)
            return
    }

    public static native void glPixelTransferi(@org.lwjgl.system.NativeType("GLenum") int r0, @org.lwjgl.system.NativeType("GLint") int r1);

    public static native void glPixelTransferf(@org.lwjgl.system.NativeType("GLenum") int r0, @org.lwjgl.system.NativeType("GLfloat") float r1);

    public static native void glPixelZoom(@org.lwjgl.system.NativeType("GLfloat") float r0, @org.lwjgl.system.NativeType("GLfloat") float r1);

    public static void glPointSize(@org.lwjgl.system.NativeType("GLfloat") float r2) {
            r0 = r2
            org.lwjgl.opengl.GL11C.glPointSize(r0)
            return
    }

    public static void glPolygonMode(@org.lwjgl.system.NativeType("GLenum") int r3, @org.lwjgl.system.NativeType("GLenum") int r4) {
            r0 = r3
            r1 = r4
            org.lwjgl.opengl.GL11C.glPolygonMode(r0, r1)
            return
    }

    public static void glPolygonOffset(@org.lwjgl.system.NativeType("GLfloat") float r3, @org.lwjgl.system.NativeType("GLfloat") float r4) {
            r0 = r3
            r1 = r4
            org.lwjgl.opengl.GL11C.glPolygonOffset(r0, r1)
            return
    }

    public static native void nglPolygonStipple(long r0);

    public static void glPolygonStipple(@org.lwjgl.system.NativeType("GLubyte const *") java.nio.ByteBuffer r3) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Ld
            r0 = r3
            r1 = 128(0x80, float:1.8E-43)
            org.lwjgl.system.Checks.check(r0, r1)
        Ld:
            r0 = r3
            long r0 = org.lwjgl.system.MemoryUtil.memAddress(r0)
            nglPolygonStipple(r0)
            return
    }

    public static void glPolygonStipple(@org.lwjgl.system.NativeType("GLubyte const *") long r3) {
            r0 = r3
            nglPolygonStipple(r0)
            return
    }

    public static native void glPushAttrib(@org.lwjgl.system.NativeType("GLbitfield") int r0);

    public static native void glPushClientAttrib(@org.lwjgl.system.NativeType("GLbitfield") int r0);

    public static native void glPopAttrib();

    public static native void glPopClientAttrib();

    public static native void glPopMatrix();

    public static native void glPopName();

    public static native void nglPrioritizeTextures(int r0, long r1, long r3);

    public static void glPrioritizeTextures(@org.lwjgl.system.NativeType("GLuint const *") java.nio.IntBuffer r6, @org.lwjgl.system.NativeType("GLfloat const *") java.nio.FloatBuffer r7) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Le
            r0 = r7
            r1 = r6
            int r1 = r1.remaining()
            org.lwjgl.system.Checks.check(r0, r1)
        Le:
            r0 = r6
            int r0 = r0.remaining()
            r1 = r6
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            r2 = r7
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            nglPrioritizeTextures(r0, r1, r2)
            return
    }

    public static native void glPushMatrix();

    public static native void glPushName(@org.lwjgl.system.NativeType("GLuint") int r0);

    public static native void glRasterPos2i(@org.lwjgl.system.NativeType("GLint") int r0, @org.lwjgl.system.NativeType("GLint") int r1);

    public static native void glRasterPos2s(@org.lwjgl.system.NativeType("GLshort") short r0, @org.lwjgl.system.NativeType("GLshort") short r1);

    public static native void glRasterPos2f(@org.lwjgl.system.NativeType("GLfloat") float r0, @org.lwjgl.system.NativeType("GLfloat") float r1);

    public static native void glRasterPos2d(@org.lwjgl.system.NativeType("GLdouble") double r0, @org.lwjgl.system.NativeType("GLdouble") double r2);

    public static native void nglRasterPos2iv(long r0);

    public static void glRasterPos2iv(@org.lwjgl.system.NativeType("GLint const *") java.nio.IntBuffer r3) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r3
            r1 = 2
            org.lwjgl.system.Checks.check(r0, r1)
        Lb:
            r0 = r3
            long r0 = org.lwjgl.system.MemoryUtil.memAddress(r0)
            nglRasterPos2iv(r0)
            return
    }

    public static native void nglRasterPos2sv(long r0);

    public static void glRasterPos2sv(@org.lwjgl.system.NativeType("GLshort const *") java.nio.ShortBuffer r3) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r3
            r1 = 2
            org.lwjgl.system.Checks.check(r0, r1)
        Lb:
            r0 = r3
            long r0 = org.lwjgl.system.MemoryUtil.memAddress(r0)
            nglRasterPos2sv(r0)
            return
    }

    public static native void nglRasterPos2fv(long r0);

    public static void glRasterPos2fv(@org.lwjgl.system.NativeType("GLfloat const *") java.nio.FloatBuffer r3) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r3
            r1 = 2
            org.lwjgl.system.Checks.check(r0, r1)
        Lb:
            r0 = r3
            long r0 = org.lwjgl.system.MemoryUtil.memAddress(r0)
            nglRasterPos2fv(r0)
            return
    }

    public static native void nglRasterPos2dv(long r0);

    public static void glRasterPos2dv(@org.lwjgl.system.NativeType("GLdouble const *") java.nio.DoubleBuffer r3) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r3
            r1 = 2
            org.lwjgl.system.Checks.check(r0, r1)
        Lb:
            r0 = r3
            long r0 = org.lwjgl.system.MemoryUtil.memAddress(r0)
            nglRasterPos2dv(r0)
            return
    }

    public static native void glRasterPos3i(@org.lwjgl.system.NativeType("GLint") int r0, @org.lwjgl.system.NativeType("GLint") int r1, @org.lwjgl.system.NativeType("GLint") int r2);

    public static native void glRasterPos3s(@org.lwjgl.system.NativeType("GLshort") short r0, @org.lwjgl.system.NativeType("GLshort") short r1, @org.lwjgl.system.NativeType("GLshort") short r2);

    public static native void glRasterPos3f(@org.lwjgl.system.NativeType("GLfloat") float r0, @org.lwjgl.system.NativeType("GLfloat") float r1, @org.lwjgl.system.NativeType("GLfloat") float r2);

    public static native void glRasterPos3d(@org.lwjgl.system.NativeType("GLdouble") double r0, @org.lwjgl.system.NativeType("GLdouble") double r2, @org.lwjgl.system.NativeType("GLdouble") double r4);

    public static native void nglRasterPos3iv(long r0);

    public static void glRasterPos3iv(@org.lwjgl.system.NativeType("GLint const *") java.nio.IntBuffer r3) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r3
            r1 = 3
            org.lwjgl.system.Checks.check(r0, r1)
        Lb:
            r0 = r3
            long r0 = org.lwjgl.system.MemoryUtil.memAddress(r0)
            nglRasterPos3iv(r0)
            return
    }

    public static native void nglRasterPos3sv(long r0);

    public static void glRasterPos3sv(@org.lwjgl.system.NativeType("GLshort const *") java.nio.ShortBuffer r3) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r3
            r1 = 3
            org.lwjgl.system.Checks.check(r0, r1)
        Lb:
            r0 = r3
            long r0 = org.lwjgl.system.MemoryUtil.memAddress(r0)
            nglRasterPos3sv(r0)
            return
    }

    public static native void nglRasterPos3fv(long r0);

    public static void glRasterPos3fv(@org.lwjgl.system.NativeType("GLfloat const *") java.nio.FloatBuffer r3) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r3
            r1 = 3
            org.lwjgl.system.Checks.check(r0, r1)
        Lb:
            r0 = r3
            long r0 = org.lwjgl.system.MemoryUtil.memAddress(r0)
            nglRasterPos3fv(r0)
            return
    }

    public static native void nglRasterPos3dv(long r0);

    public static void glRasterPos3dv(@org.lwjgl.system.NativeType("GLdouble const *") java.nio.DoubleBuffer r3) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r3
            r1 = 3
            org.lwjgl.system.Checks.check(r0, r1)
        Lb:
            r0 = r3
            long r0 = org.lwjgl.system.MemoryUtil.memAddress(r0)
            nglRasterPos3dv(r0)
            return
    }

    public static native void glRasterPos4i(@org.lwjgl.system.NativeType("GLint") int r0, @org.lwjgl.system.NativeType("GLint") int r1, @org.lwjgl.system.NativeType("GLint") int r2, @org.lwjgl.system.NativeType("GLint") int r3);

    public static native void glRasterPos4s(@org.lwjgl.system.NativeType("GLshort") short r0, @org.lwjgl.system.NativeType("GLshort") short r1, @org.lwjgl.system.NativeType("GLshort") short r2, @org.lwjgl.system.NativeType("GLshort") short r3);

    public static native void glRasterPos4f(@org.lwjgl.system.NativeType("GLfloat") float r0, @org.lwjgl.system.NativeType("GLfloat") float r1, @org.lwjgl.system.NativeType("GLfloat") float r2, @org.lwjgl.system.NativeType("GLfloat") float r3);

    public static native void glRasterPos4d(@org.lwjgl.system.NativeType("GLdouble") double r0, @org.lwjgl.system.NativeType("GLdouble") double r2, @org.lwjgl.system.NativeType("GLdouble") double r4, @org.lwjgl.system.NativeType("GLdouble") double r6);

    public static native void nglRasterPos4iv(long r0);

    public static void glRasterPos4iv(@org.lwjgl.system.NativeType("GLint const *") java.nio.IntBuffer r3) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r3
            r1 = 4
            org.lwjgl.system.Checks.check(r0, r1)
        Lb:
            r0 = r3
            long r0 = org.lwjgl.system.MemoryUtil.memAddress(r0)
            nglRasterPos4iv(r0)
            return
    }

    public static native void nglRasterPos4sv(long r0);

    public static void glRasterPos4sv(@org.lwjgl.system.NativeType("GLshort const *") java.nio.ShortBuffer r3) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r3
            r1 = 4
            org.lwjgl.system.Checks.check(r0, r1)
        Lb:
            r0 = r3
            long r0 = org.lwjgl.system.MemoryUtil.memAddress(r0)
            nglRasterPos4sv(r0)
            return
    }

    public static native void nglRasterPos4fv(long r0);

    public static void glRasterPos4fv(@org.lwjgl.system.NativeType("GLfloat const *") java.nio.FloatBuffer r3) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r3
            r1 = 4
            org.lwjgl.system.Checks.check(r0, r1)
        Lb:
            r0 = r3
            long r0 = org.lwjgl.system.MemoryUtil.memAddress(r0)
            nglRasterPos4fv(r0)
            return
    }

    public static native void nglRasterPos4dv(long r0);

    public static void glRasterPos4dv(@org.lwjgl.system.NativeType("GLdouble const *") java.nio.DoubleBuffer r3) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r3
            r1 = 4
            org.lwjgl.system.Checks.check(r0, r1)
        Lb:
            r0 = r3
            long r0 = org.lwjgl.system.MemoryUtil.memAddress(r0)
            nglRasterPos4dv(r0)
            return
    }

    public static void glReadBuffer(@org.lwjgl.system.NativeType("GLenum") int r2) {
            r0 = r2
            org.lwjgl.opengl.GL11C.glReadBuffer(r0)
            return
    }

    public static void nglReadPixels(int r9, int r10, int r11, int r12, int r13, int r14, long r15) {
            r0 = r9
            r1 = r10
            r2 = r11
            r3 = r12
            r4 = r13
            r5 = r14
            r6 = r15
            org.lwjgl.opengl.GL11C.nglReadPixels(r0, r1, r2, r3, r4, r5, r6)
            return
    }

    public static void glReadPixels(@org.lwjgl.system.NativeType("GLint") int r8, @org.lwjgl.system.NativeType("GLint") int r9, @org.lwjgl.system.NativeType("GLsizei") int r10, @org.lwjgl.system.NativeType("GLsizei") int r11, @org.lwjgl.system.NativeType("GLenum") int r12, @org.lwjgl.system.NativeType("GLenum") int r13, @org.lwjgl.system.NativeType("void *") java.nio.ByteBuffer r14) {
            r0 = r8
            r1 = r9
            r2 = r10
            r3 = r11
            r4 = r12
            r5 = r13
            r6 = r14
            org.lwjgl.opengl.GL11C.glReadPixels(r0, r1, r2, r3, r4, r5, r6)
            return
    }

    public static void glReadPixels(@org.lwjgl.system.NativeType("GLint") int r9, @org.lwjgl.system.NativeType("GLint") int r10, @org.lwjgl.system.NativeType("GLsizei") int r11, @org.lwjgl.system.NativeType("GLsizei") int r12, @org.lwjgl.system.NativeType("GLenum") int r13, @org.lwjgl.system.NativeType("GLenum") int r14, @org.lwjgl.system.NativeType("void *") long r15) {
            r0 = r9
            r1 = r10
            r2 = r11
            r3 = r12
            r4 = r13
            r5 = r14
            r6 = r15
            org.lwjgl.opengl.GL11C.glReadPixels(r0, r1, r2, r3, r4, r5, r6)
            return
    }

    public static void glReadPixels(@org.lwjgl.system.NativeType("GLint") int r8, @org.lwjgl.system.NativeType("GLint") int r9, @org.lwjgl.system.NativeType("GLsizei") int r10, @org.lwjgl.system.NativeType("GLsizei") int r11, @org.lwjgl.system.NativeType("GLenum") int r12, @org.lwjgl.system.NativeType("GLenum") int r13, @org.lwjgl.system.NativeType("void *") java.nio.ShortBuffer r14) {
            r0 = r8
            r1 = r9
            r2 = r10
            r3 = r11
            r4 = r12
            r5 = r13
            r6 = r14
            org.lwjgl.opengl.GL11C.glReadPixels(r0, r1, r2, r3, r4, r5, r6)
            return
    }

    public static void glReadPixels(@org.lwjgl.system.NativeType("GLint") int r8, @org.lwjgl.system.NativeType("GLint") int r9, @org.lwjgl.system.NativeType("GLsizei") int r10, @org.lwjgl.system.NativeType("GLsizei") int r11, @org.lwjgl.system.NativeType("GLenum") int r12, @org.lwjgl.system.NativeType("GLenum") int r13, @org.lwjgl.system.NativeType("void *") java.nio.IntBuffer r14) {
            r0 = r8
            r1 = r9
            r2 = r10
            r3 = r11
            r4 = r12
            r5 = r13
            r6 = r14
            org.lwjgl.opengl.GL11C.glReadPixels(r0, r1, r2, r3, r4, r5, r6)
            return
    }

    public static void glReadPixels(@org.lwjgl.system.NativeType("GLint") int r8, @org.lwjgl.system.NativeType("GLint") int r9, @org.lwjgl.system.NativeType("GLsizei") int r10, @org.lwjgl.system.NativeType("GLsizei") int r11, @org.lwjgl.system.NativeType("GLenum") int r12, @org.lwjgl.system.NativeType("GLenum") int r13, @org.lwjgl.system.NativeType("void *") java.nio.FloatBuffer r14) {
            r0 = r8
            r1 = r9
            r2 = r10
            r3 = r11
            r4 = r12
            r5 = r13
            r6 = r14
            org.lwjgl.opengl.GL11C.glReadPixels(r0, r1, r2, r3, r4, r5, r6)
            return
    }

    public static native void glRecti(@org.lwjgl.system.NativeType("GLint") int r0, @org.lwjgl.system.NativeType("GLint") int r1, @org.lwjgl.system.NativeType("GLint") int r2, @org.lwjgl.system.NativeType("GLint") int r3);

    public static native void glRects(@org.lwjgl.system.NativeType("GLshort") short r0, @org.lwjgl.system.NativeType("GLshort") short r1, @org.lwjgl.system.NativeType("GLshort") short r2, @org.lwjgl.system.NativeType("GLshort") short r3);

    public static native void glRectf(@org.lwjgl.system.NativeType("GLfloat") float r0, @org.lwjgl.system.NativeType("GLfloat") float r1, @org.lwjgl.system.NativeType("GLfloat") float r2, @org.lwjgl.system.NativeType("GLfloat") float r3);

    public static native void glRectd(@org.lwjgl.system.NativeType("GLdouble") double r0, @org.lwjgl.system.NativeType("GLdouble") double r2, @org.lwjgl.system.NativeType("GLdouble") double r4, @org.lwjgl.system.NativeType("GLdouble") double r6);

    public static native void nglRectiv(long r0, long r2);

    public static void glRectiv(@org.lwjgl.system.NativeType("GLint const *") java.nio.IntBuffer r5, @org.lwjgl.system.NativeType("GLint const *") java.nio.IntBuffer r6) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L10
            r0 = r5
            r1 = 2
            org.lwjgl.system.Checks.check(r0, r1)
            r0 = r6
            r1 = 2
            org.lwjgl.system.Checks.check(r0, r1)
        L10:
            r0 = r5
            long r0 = org.lwjgl.system.MemoryUtil.memAddress(r0)
            r1 = r6
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            nglRectiv(r0, r1)
            return
    }

    public static native void nglRectsv(long r0, long r2);

    public static void glRectsv(@org.lwjgl.system.NativeType("GLshort const *") java.nio.ShortBuffer r5, @org.lwjgl.system.NativeType("GLshort const *") java.nio.ShortBuffer r6) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L10
            r0 = r5
            r1 = 2
            org.lwjgl.system.Checks.check(r0, r1)
            r0 = r6
            r1 = 2
            org.lwjgl.system.Checks.check(r0, r1)
        L10:
            r0 = r5
            long r0 = org.lwjgl.system.MemoryUtil.memAddress(r0)
            r1 = r6
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            nglRectsv(r0, r1)
            return
    }

    public static native void nglRectfv(long r0, long r2);

    public static void glRectfv(@org.lwjgl.system.NativeType("GLfloat const *") java.nio.FloatBuffer r5, @org.lwjgl.system.NativeType("GLfloat const *") java.nio.FloatBuffer r6) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L10
            r0 = r5
            r1 = 2
            org.lwjgl.system.Checks.check(r0, r1)
            r0 = r6
            r1 = 2
            org.lwjgl.system.Checks.check(r0, r1)
        L10:
            r0 = r5
            long r0 = org.lwjgl.system.MemoryUtil.memAddress(r0)
            r1 = r6
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            nglRectfv(r0, r1)
            return
    }

    public static native void nglRectdv(long r0, long r2);

    public static void glRectdv(@org.lwjgl.system.NativeType("GLdouble const *") java.nio.DoubleBuffer r5, @org.lwjgl.system.NativeType("GLdouble const *") java.nio.DoubleBuffer r6) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L10
            r0 = r5
            r1 = 2
            org.lwjgl.system.Checks.check(r0, r1)
            r0 = r6
            r1 = 2
            org.lwjgl.system.Checks.check(r0, r1)
        L10:
            r0 = r5
            long r0 = org.lwjgl.system.MemoryUtil.memAddress(r0)
            r1 = r6
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            nglRectdv(r0, r1)
            return
    }

    @org.lwjgl.system.NativeType("GLint")
    public static native int glRenderMode(@org.lwjgl.system.NativeType("GLenum") int r0);

    public static native void glRotatef(@org.lwjgl.system.NativeType("GLfloat") float r0, @org.lwjgl.system.NativeType("GLfloat") float r1, @org.lwjgl.system.NativeType("GLfloat") float r2, @org.lwjgl.system.NativeType("GLfloat") float r3);

    public static native void glRotated(@org.lwjgl.system.NativeType("GLdouble") double r0, @org.lwjgl.system.NativeType("GLdouble") double r2, @org.lwjgl.system.NativeType("GLdouble") double r4, @org.lwjgl.system.NativeType("GLdouble") double r6);

    public static native void glScalef(@org.lwjgl.system.NativeType("GLfloat") float r0, @org.lwjgl.system.NativeType("GLfloat") float r1, @org.lwjgl.system.NativeType("GLfloat") float r2);

    public static native void glScaled(@org.lwjgl.system.NativeType("GLdouble") double r0, @org.lwjgl.system.NativeType("GLdouble") double r2, @org.lwjgl.system.NativeType("GLdouble") double r4);

    public static void glScissor(@org.lwjgl.system.NativeType("GLint") int r5, @org.lwjgl.system.NativeType("GLint") int r6, @org.lwjgl.system.NativeType("GLsizei") int r7, @org.lwjgl.system.NativeType("GLsizei") int r8) {
            r0 = r5
            r1 = r6
            r2 = r7
            r3 = r8
            org.lwjgl.opengl.GL11C.glScissor(r0, r1, r2, r3)
            return
    }

    public static native void nglSelectBuffer(int r0, long r1);

    public static void glSelectBuffer(@org.lwjgl.system.NativeType("GLuint *") java.nio.IntBuffer r4) {
            r0 = r4
            int r0 = r0.remaining()
            r1 = r4
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            nglSelectBuffer(r0, r1)
            return
    }

    public static native void glShadeModel(@org.lwjgl.system.NativeType("GLenum") int r0);

    public static void glStencilFunc(@org.lwjgl.system.NativeType("GLenum") int r4, @org.lwjgl.system.NativeType("GLint") int r5, @org.lwjgl.system.NativeType("GLuint") int r6) {
            r0 = r4
            r1 = r5
            r2 = r6
            org.lwjgl.opengl.GL11C.glStencilFunc(r0, r1, r2)
            return
    }

    public static void glStencilMask(@org.lwjgl.system.NativeType("GLuint") int r2) {
            r0 = r2
            org.lwjgl.opengl.GL11C.glStencilMask(r0)
            return
    }

    public static void glStencilOp(@org.lwjgl.system.NativeType("GLenum") int r4, @org.lwjgl.system.NativeType("GLenum") int r5, @org.lwjgl.system.NativeType("GLenum") int r6) {
            r0 = r4
            r1 = r5
            r2 = r6
            org.lwjgl.opengl.GL11C.glStencilOp(r0, r1, r2)
            return
    }

    public static native void glTexCoord1f(@org.lwjgl.system.NativeType("GLfloat") float r0);

    public static native void glTexCoord1s(@org.lwjgl.system.NativeType("GLshort") short r0);

    public static native void glTexCoord1i(@org.lwjgl.system.NativeType("GLint") int r0);

    public static native void glTexCoord1d(@org.lwjgl.system.NativeType("GLdouble") double r0);

    public static native void nglTexCoord1fv(long r0);

    public static void glTexCoord1fv(@org.lwjgl.system.NativeType("GLfloat const *") java.nio.FloatBuffer r3) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r3
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
        Lb:
            r0 = r3
            long r0 = org.lwjgl.system.MemoryUtil.memAddress(r0)
            nglTexCoord1fv(r0)
            return
    }

    public static native void nglTexCoord1sv(long r0);

    public static void glTexCoord1sv(@org.lwjgl.system.NativeType("GLshort const *") java.nio.ShortBuffer r3) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r3
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
        Lb:
            r0 = r3
            long r0 = org.lwjgl.system.MemoryUtil.memAddress(r0)
            nglTexCoord1sv(r0)
            return
    }

    public static native void nglTexCoord1iv(long r0);

    public static void glTexCoord1iv(@org.lwjgl.system.NativeType("GLint const *") java.nio.IntBuffer r3) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r3
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
        Lb:
            r0 = r3
            long r0 = org.lwjgl.system.MemoryUtil.memAddress(r0)
            nglTexCoord1iv(r0)
            return
    }

    public static native void nglTexCoord1dv(long r0);

    public static void glTexCoord1dv(@org.lwjgl.system.NativeType("GLdouble const *") java.nio.DoubleBuffer r3) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r3
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
        Lb:
            r0 = r3
            long r0 = org.lwjgl.system.MemoryUtil.memAddress(r0)
            nglTexCoord1dv(r0)
            return
    }

    public static native void glTexCoord2f(@org.lwjgl.system.NativeType("GLfloat") float r0, @org.lwjgl.system.NativeType("GLfloat") float r1);

    public static native void glTexCoord2s(@org.lwjgl.system.NativeType("GLshort") short r0, @org.lwjgl.system.NativeType("GLshort") short r1);

    public static native void glTexCoord2i(@org.lwjgl.system.NativeType("GLint") int r0, @org.lwjgl.system.NativeType("GLint") int r1);

    public static native void glTexCoord2d(@org.lwjgl.system.NativeType("GLdouble") double r0, @org.lwjgl.system.NativeType("GLdouble") double r2);

    public static native void nglTexCoord2fv(long r0);

    public static void glTexCoord2fv(@org.lwjgl.system.NativeType("GLfloat const *") java.nio.FloatBuffer r3) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r3
            r1 = 2
            org.lwjgl.system.Checks.check(r0, r1)
        Lb:
            r0 = r3
            long r0 = org.lwjgl.system.MemoryUtil.memAddress(r0)
            nglTexCoord2fv(r0)
            return
    }

    public static native void nglTexCoord2sv(long r0);

    public static void glTexCoord2sv(@org.lwjgl.system.NativeType("GLshort const *") java.nio.ShortBuffer r3) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r3
            r1 = 2
            org.lwjgl.system.Checks.check(r0, r1)
        Lb:
            r0 = r3
            long r0 = org.lwjgl.system.MemoryUtil.memAddress(r0)
            nglTexCoord2sv(r0)
            return
    }

    public static native void nglTexCoord2iv(long r0);

    public static void glTexCoord2iv(@org.lwjgl.system.NativeType("GLint const *") java.nio.IntBuffer r3) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r3
            r1 = 2
            org.lwjgl.system.Checks.check(r0, r1)
        Lb:
            r0 = r3
            long r0 = org.lwjgl.system.MemoryUtil.memAddress(r0)
            nglTexCoord2iv(r0)
            return
    }

    public static native void nglTexCoord2dv(long r0);

    public static void glTexCoord2dv(@org.lwjgl.system.NativeType("GLdouble const *") java.nio.DoubleBuffer r3) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r3
            r1 = 2
            org.lwjgl.system.Checks.check(r0, r1)
        Lb:
            r0 = r3
            long r0 = org.lwjgl.system.MemoryUtil.memAddress(r0)
            nglTexCoord2dv(r0)
            return
    }

    public static native void glTexCoord3f(@org.lwjgl.system.NativeType("GLfloat") float r0, @org.lwjgl.system.NativeType("GLfloat") float r1, @org.lwjgl.system.NativeType("GLfloat") float r2);

    public static native void glTexCoord3s(@org.lwjgl.system.NativeType("GLshort") short r0, @org.lwjgl.system.NativeType("GLshort") short r1, @org.lwjgl.system.NativeType("GLshort") short r2);

    public static native void glTexCoord3i(@org.lwjgl.system.NativeType("GLint") int r0, @org.lwjgl.system.NativeType("GLint") int r1, @org.lwjgl.system.NativeType("GLint") int r2);

    public static native void glTexCoord3d(@org.lwjgl.system.NativeType("GLdouble") double r0, @org.lwjgl.system.NativeType("GLdouble") double r2, @org.lwjgl.system.NativeType("GLdouble") double r4);

    public static native void nglTexCoord3fv(long r0);

    public static void glTexCoord3fv(@org.lwjgl.system.NativeType("GLfloat const *") java.nio.FloatBuffer r3) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r3
            r1 = 3
            org.lwjgl.system.Checks.check(r0, r1)
        Lb:
            r0 = r3
            long r0 = org.lwjgl.system.MemoryUtil.memAddress(r0)
            nglTexCoord3fv(r0)
            return
    }

    public static native void nglTexCoord3sv(long r0);

    public static void glTexCoord3sv(@org.lwjgl.system.NativeType("GLshort const *") java.nio.ShortBuffer r3) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r3
            r1 = 3
            org.lwjgl.system.Checks.check(r0, r1)
        Lb:
            r0 = r3
            long r0 = org.lwjgl.system.MemoryUtil.memAddress(r0)
            nglTexCoord3sv(r0)
            return
    }

    public static native void nglTexCoord3iv(long r0);

    public static void glTexCoord3iv(@org.lwjgl.system.NativeType("GLint const *") java.nio.IntBuffer r3) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r3
            r1 = 3
            org.lwjgl.system.Checks.check(r0, r1)
        Lb:
            r0 = r3
            long r0 = org.lwjgl.system.MemoryUtil.memAddress(r0)
            nglTexCoord3iv(r0)
            return
    }

    public static native void nglTexCoord3dv(long r0);

    public static void glTexCoord3dv(@org.lwjgl.system.NativeType("GLdouble const *") java.nio.DoubleBuffer r3) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r3
            r1 = 3
            org.lwjgl.system.Checks.check(r0, r1)
        Lb:
            r0 = r3
            long r0 = org.lwjgl.system.MemoryUtil.memAddress(r0)
            nglTexCoord3dv(r0)
            return
    }

    public static native void glTexCoord4f(@org.lwjgl.system.NativeType("GLfloat") float r0, @org.lwjgl.system.NativeType("GLfloat") float r1, @org.lwjgl.system.NativeType("GLfloat") float r2, @org.lwjgl.system.NativeType("GLfloat") float r3);

    public static native void glTexCoord4s(@org.lwjgl.system.NativeType("GLshort") short r0, @org.lwjgl.system.NativeType("GLshort") short r1, @org.lwjgl.system.NativeType("GLshort") short r2, @org.lwjgl.system.NativeType("GLshort") short r3);

    public static native void glTexCoord4i(@org.lwjgl.system.NativeType("GLint") int r0, @org.lwjgl.system.NativeType("GLint") int r1, @org.lwjgl.system.NativeType("GLint") int r2, @org.lwjgl.system.NativeType("GLint") int r3);

    public static native void glTexCoord4d(@org.lwjgl.system.NativeType("GLdouble") double r0, @org.lwjgl.system.NativeType("GLdouble") double r2, @org.lwjgl.system.NativeType("GLdouble") double r4, @org.lwjgl.system.NativeType("GLdouble") double r6);

    public static native void nglTexCoord4fv(long r0);

    public static void glTexCoord4fv(@org.lwjgl.system.NativeType("GLfloat const *") java.nio.FloatBuffer r3) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r3
            r1 = 4
            org.lwjgl.system.Checks.check(r0, r1)
        Lb:
            r0 = r3
            long r0 = org.lwjgl.system.MemoryUtil.memAddress(r0)
            nglTexCoord4fv(r0)
            return
    }

    public static native void nglTexCoord4sv(long r0);

    public static void glTexCoord4sv(@org.lwjgl.system.NativeType("GLshort const *") java.nio.ShortBuffer r3) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r3
            r1 = 4
            org.lwjgl.system.Checks.check(r0, r1)
        Lb:
            r0 = r3
            long r0 = org.lwjgl.system.MemoryUtil.memAddress(r0)
            nglTexCoord4sv(r0)
            return
    }

    public static native void nglTexCoord4iv(long r0);

    public static void glTexCoord4iv(@org.lwjgl.system.NativeType("GLint const *") java.nio.IntBuffer r3) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r3
            r1 = 4
            org.lwjgl.system.Checks.check(r0, r1)
        Lb:
            r0 = r3
            long r0 = org.lwjgl.system.MemoryUtil.memAddress(r0)
            nglTexCoord4iv(r0)
            return
    }

    public static native void nglTexCoord4dv(long r0);

    public static void glTexCoord4dv(@org.lwjgl.system.NativeType("GLdouble const *") java.nio.DoubleBuffer r3) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r3
            r1 = 4
            org.lwjgl.system.Checks.check(r0, r1)
        Lb:
            r0 = r3
            long r0 = org.lwjgl.system.MemoryUtil.memAddress(r0)
            nglTexCoord4dv(r0)
            return
    }

    public static native void nglTexCoordPointer(int r0, int r1, int r2, long r3);

    public static void glTexCoordPointer(@org.lwjgl.system.NativeType("GLint") int r6, @org.lwjgl.system.NativeType("GLenum") int r7, @org.lwjgl.system.NativeType("GLsizei") int r8, @org.lwjgl.system.NativeType("void const *") java.nio.ByteBuffer r9) {
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            long r3 = org.lwjgl.system.MemoryUtil.memAddress(r3)
            nglTexCoordPointer(r0, r1, r2, r3)
            return
    }

    public static void glTexCoordPointer(@org.lwjgl.system.NativeType("GLint") int r6, @org.lwjgl.system.NativeType("GLenum") int r7, @org.lwjgl.system.NativeType("GLsizei") int r8, @org.lwjgl.system.NativeType("void const *") long r9) {
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            nglTexCoordPointer(r0, r1, r2, r3)
            return
    }

    public static void glTexCoordPointer(@org.lwjgl.system.NativeType("GLint") int r6, @org.lwjgl.system.NativeType("GLenum") int r7, @org.lwjgl.system.NativeType("GLsizei") int r8, @org.lwjgl.system.NativeType("void const *") java.nio.ShortBuffer r9) {
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            long r3 = org.lwjgl.system.MemoryUtil.memAddress(r3)
            nglTexCoordPointer(r0, r1, r2, r3)
            return
    }

    public static void glTexCoordPointer(@org.lwjgl.system.NativeType("GLint") int r6, @org.lwjgl.system.NativeType("GLenum") int r7, @org.lwjgl.system.NativeType("GLsizei") int r8, @org.lwjgl.system.NativeType("void const *") java.nio.IntBuffer r9) {
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            long r3 = org.lwjgl.system.MemoryUtil.memAddress(r3)
            nglTexCoordPointer(r0, r1, r2, r3)
            return
    }

    public static void glTexCoordPointer(@org.lwjgl.system.NativeType("GLint") int r6, @org.lwjgl.system.NativeType("GLenum") int r7, @org.lwjgl.system.NativeType("GLsizei") int r8, @org.lwjgl.system.NativeType("void const *") java.nio.FloatBuffer r9) {
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            long r3 = org.lwjgl.system.MemoryUtil.memAddress(r3)
            nglTexCoordPointer(r0, r1, r2, r3)
            return
    }

    public static native void glTexEnvi(@org.lwjgl.system.NativeType("GLenum") int r0, @org.lwjgl.system.NativeType("GLenum") int r1, @org.lwjgl.system.NativeType("GLint") int r2);

    public static native void nglTexEnviv(int r0, int r1, long r2);

    public static void glTexEnviv(@org.lwjgl.system.NativeType("GLenum") int r5, @org.lwjgl.system.NativeType("GLenum") int r6, @org.lwjgl.system.NativeType("GLint const *") java.nio.IntBuffer r7) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r7
            r1 = 4
            org.lwjgl.system.Checks.check(r0, r1)
        Lb:
            r0 = r5
            r1 = r6
            r2 = r7
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            nglTexEnviv(r0, r1, r2)
            return
    }

    public static native void glTexEnvf(@org.lwjgl.system.NativeType("GLenum") int r0, @org.lwjgl.system.NativeType("GLenum") int r1, @org.lwjgl.system.NativeType("GLfloat") float r2);

    public static native void nglTexEnvfv(int r0, int r1, long r2);

    public static void glTexEnvfv(@org.lwjgl.system.NativeType("GLenum") int r5, @org.lwjgl.system.NativeType("GLenum") int r6, @org.lwjgl.system.NativeType("GLfloat const *") java.nio.FloatBuffer r7) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r7
            r1 = 4
            org.lwjgl.system.Checks.check(r0, r1)
        Lb:
            r0 = r5
            r1 = r6
            r2 = r7
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            nglTexEnvfv(r0, r1, r2)
            return
    }

    public static native void glTexGeni(@org.lwjgl.system.NativeType("GLenum") int r0, @org.lwjgl.system.NativeType("GLenum") int r1, @org.lwjgl.system.NativeType("GLint") int r2);

    public static native void nglTexGeniv(int r0, int r1, long r2);

    public static void glTexGeniv(@org.lwjgl.system.NativeType("GLenum") int r5, @org.lwjgl.system.NativeType("GLenum") int r6, @org.lwjgl.system.NativeType("GLint const *") java.nio.IntBuffer r7) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r7
            r1 = 4
            org.lwjgl.system.Checks.check(r0, r1)
        Lb:
            r0 = r5
            r1 = r6
            r2 = r7
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            nglTexGeniv(r0, r1, r2)
            return
    }

    public static native void glTexGenf(@org.lwjgl.system.NativeType("GLenum") int r0, @org.lwjgl.system.NativeType("GLenum") int r1, @org.lwjgl.system.NativeType("GLfloat") float r2);

    public static native void nglTexGenfv(int r0, int r1, long r2);

    public static void glTexGenfv(@org.lwjgl.system.NativeType("GLenum") int r5, @org.lwjgl.system.NativeType("GLenum") int r6, @org.lwjgl.system.NativeType("GLfloat const *") java.nio.FloatBuffer r7) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r7
            r1 = 4
            org.lwjgl.system.Checks.check(r0, r1)
        Lb:
            r0 = r5
            r1 = r6
            r2 = r7
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            nglTexGenfv(r0, r1, r2)
            return
    }

    public static native void glTexGend(@org.lwjgl.system.NativeType("GLenum") int r0, @org.lwjgl.system.NativeType("GLenum") int r1, @org.lwjgl.system.NativeType("GLdouble") double r2);

    public static native void nglTexGendv(int r0, int r1, long r2);

    public static void glTexGendv(@org.lwjgl.system.NativeType("GLenum") int r5, @org.lwjgl.system.NativeType("GLenum") int r6, @org.lwjgl.system.NativeType("GLdouble const *") java.nio.DoubleBuffer r7) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r7
            r1 = 4
            org.lwjgl.system.Checks.check(r0, r1)
        Lb:
            r0 = r5
            r1 = r6
            r2 = r7
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            nglTexGendv(r0, r1, r2)
            return
    }

    public static void nglTexImage1D(int r10, int r11, int r12, int r13, int r14, int r15, int r16, long r17) {
            r0 = r10
            r1 = r11
            r2 = r12
            r3 = r13
            r4 = r14
            r5 = r15
            r6 = r16
            r7 = r17
            org.lwjgl.opengl.GL11C.nglTexImage1D(r0, r1, r2, r3, r4, r5, r6, r7)
            return
    }

    public static void glTexImage1D(@org.lwjgl.system.NativeType("GLenum") int r9, @org.lwjgl.system.NativeType("GLint") int r10, @org.lwjgl.system.NativeType("GLint") int r11, @org.lwjgl.system.NativeType("GLsizei") int r12, @org.lwjgl.system.NativeType("GLint") int r13, @org.lwjgl.system.NativeType("GLenum") int r14, @org.lwjgl.system.NativeType("GLenum") int r15, @javax.annotation.Nullable @org.lwjgl.system.NativeType("void const *") java.nio.ByteBuffer r16) {
            r0 = r9
            r1 = r10
            r2 = r11
            r3 = r12
            r4 = r13
            r5 = r14
            r6 = r15
            r7 = r16
            org.lwjgl.opengl.GL11C.glTexImage1D(r0, r1, r2, r3, r4, r5, r6, r7)
            return
    }

    public static void glTexImage1D(@org.lwjgl.system.NativeType("GLenum") int r10, @org.lwjgl.system.NativeType("GLint") int r11, @org.lwjgl.system.NativeType("GLint") int r12, @org.lwjgl.system.NativeType("GLsizei") int r13, @org.lwjgl.system.NativeType("GLint") int r14, @org.lwjgl.system.NativeType("GLenum") int r15, @org.lwjgl.system.NativeType("GLenum") int r16, @org.lwjgl.system.NativeType("void const *") long r17) {
            r0 = r10
            r1 = r11
            r2 = r12
            r3 = r13
            r4 = r14
            r5 = r15
            r6 = r16
            r7 = r17
            org.lwjgl.opengl.GL11C.glTexImage1D(r0, r1, r2, r3, r4, r5, r6, r7)
            return
    }

    public static void glTexImage1D(@org.lwjgl.system.NativeType("GLenum") int r9, @org.lwjgl.system.NativeType("GLint") int r10, @org.lwjgl.system.NativeType("GLint") int r11, @org.lwjgl.system.NativeType("GLsizei") int r12, @org.lwjgl.system.NativeType("GLint") int r13, @org.lwjgl.system.NativeType("GLenum") int r14, @org.lwjgl.system.NativeType("GLenum") int r15, @javax.annotation.Nullable @org.lwjgl.system.NativeType("void const *") java.nio.ShortBuffer r16) {
            r0 = r9
            r1 = r10
            r2 = r11
            r3 = r12
            r4 = r13
            r5 = r14
            r6 = r15
            r7 = r16
            org.lwjgl.opengl.GL11C.glTexImage1D(r0, r1, r2, r3, r4, r5, r6, r7)
            return
    }

    public static void glTexImage1D(@org.lwjgl.system.NativeType("GLenum") int r9, @org.lwjgl.system.NativeType("GLint") int r10, @org.lwjgl.system.NativeType("GLint") int r11, @org.lwjgl.system.NativeType("GLsizei") int r12, @org.lwjgl.system.NativeType("GLint") int r13, @org.lwjgl.system.NativeType("GLenum") int r14, @org.lwjgl.system.NativeType("GLenum") int r15, @javax.annotation.Nullable @org.lwjgl.system.NativeType("void const *") java.nio.IntBuffer r16) {
            r0 = r9
            r1 = r10
            r2 = r11
            r3 = r12
            r4 = r13
            r5 = r14
            r6 = r15
            r7 = r16
            org.lwjgl.opengl.GL11C.glTexImage1D(r0, r1, r2, r3, r4, r5, r6, r7)
            return
    }

    public static void glTexImage1D(@org.lwjgl.system.NativeType("GLenum") int r9, @org.lwjgl.system.NativeType("GLint") int r10, @org.lwjgl.system.NativeType("GLint") int r11, @org.lwjgl.system.NativeType("GLsizei") int r12, @org.lwjgl.system.NativeType("GLint") int r13, @org.lwjgl.system.NativeType("GLenum") int r14, @org.lwjgl.system.NativeType("GLenum") int r15, @javax.annotation.Nullable @org.lwjgl.system.NativeType("void const *") java.nio.FloatBuffer r16) {
            r0 = r9
            r1 = r10
            r2 = r11
            r3 = r12
            r4 = r13
            r5 = r14
            r6 = r15
            r7 = r16
            org.lwjgl.opengl.GL11C.glTexImage1D(r0, r1, r2, r3, r4, r5, r6, r7)
            return
    }

    public static void glTexImage1D(@org.lwjgl.system.NativeType("GLenum") int r9, @org.lwjgl.system.NativeType("GLint") int r10, @org.lwjgl.system.NativeType("GLint") int r11, @org.lwjgl.system.NativeType("GLsizei") int r12, @org.lwjgl.system.NativeType("GLint") int r13, @org.lwjgl.system.NativeType("GLenum") int r14, @org.lwjgl.system.NativeType("GLenum") int r15, @javax.annotation.Nullable @org.lwjgl.system.NativeType("void const *") java.nio.DoubleBuffer r16) {
            r0 = r9
            r1 = r10
            r2 = r11
            r3 = r12
            r4 = r13
            r5 = r14
            r6 = r15
            r7 = r16
            org.lwjgl.opengl.GL11C.glTexImage1D(r0, r1, r2, r3, r4, r5, r6, r7)
            return
    }

    public static void nglTexImage2D(int r11, int r12, int r13, int r14, int r15, int r16, int r17, int r18, long r19) {
            r0 = r11
            r1 = r12
            r2 = r13
            r3 = r14
            r4 = r15
            r5 = r16
            r6 = r17
            r7 = r18
            r8 = r19
            org.lwjgl.opengl.GL11C.nglTexImage2D(r0, r1, r2, r3, r4, r5, r6, r7, r8)
            return
    }

    public static void glTexImage2D(@org.lwjgl.system.NativeType("GLenum") int r10, @org.lwjgl.system.NativeType("GLint") int r11, @org.lwjgl.system.NativeType("GLint") int r12, @org.lwjgl.system.NativeType("GLsizei") int r13, @org.lwjgl.system.NativeType("GLsizei") int r14, @org.lwjgl.system.NativeType("GLint") int r15, @org.lwjgl.system.NativeType("GLenum") int r16, @org.lwjgl.system.NativeType("GLenum") int r17, @javax.annotation.Nullable @org.lwjgl.system.NativeType("void const *") java.nio.ByteBuffer r18) {
            r0 = r10
            r1 = r11
            r2 = r12
            r3 = r13
            r4 = r14
            r5 = r15
            r6 = r16
            r7 = r17
            r8 = r18
            org.lwjgl.opengl.GL11C.glTexImage2D(r0, r1, r2, r3, r4, r5, r6, r7, r8)
            return
    }

    public static void glTexImage2D(@org.lwjgl.system.NativeType("GLenum") int r11, @org.lwjgl.system.NativeType("GLint") int r12, @org.lwjgl.system.NativeType("GLint") int r13, @org.lwjgl.system.NativeType("GLsizei") int r14, @org.lwjgl.system.NativeType("GLsizei") int r15, @org.lwjgl.system.NativeType("GLint") int r16, @org.lwjgl.system.NativeType("GLenum") int r17, @org.lwjgl.system.NativeType("GLenum") int r18, @org.lwjgl.system.NativeType("void const *") long r19) {
            r0 = r11
            r1 = r12
            r2 = r13
            r3 = r14
            r4 = r15
            r5 = r16
            r6 = r17
            r7 = r18
            r8 = r19
            org.lwjgl.opengl.GL11C.glTexImage2D(r0, r1, r2, r3, r4, r5, r6, r7, r8)
            return
    }

    public static void glTexImage2D(@org.lwjgl.system.NativeType("GLenum") int r10, @org.lwjgl.system.NativeType("GLint") int r11, @org.lwjgl.system.NativeType("GLint") int r12, @org.lwjgl.system.NativeType("GLsizei") int r13, @org.lwjgl.system.NativeType("GLsizei") int r14, @org.lwjgl.system.NativeType("GLint") int r15, @org.lwjgl.system.NativeType("GLenum") int r16, @org.lwjgl.system.NativeType("GLenum") int r17, @javax.annotation.Nullable @org.lwjgl.system.NativeType("void const *") java.nio.ShortBuffer r18) {
            r0 = r10
            r1 = r11
            r2 = r12
            r3 = r13
            r4 = r14
            r5 = r15
            r6 = r16
            r7 = r17
            r8 = r18
            org.lwjgl.opengl.GL11C.glTexImage2D(r0, r1, r2, r3, r4, r5, r6, r7, r8)
            return
    }

    public static void glTexImage2D(@org.lwjgl.system.NativeType("GLenum") int r10, @org.lwjgl.system.NativeType("GLint") int r11, @org.lwjgl.system.NativeType("GLint") int r12, @org.lwjgl.system.NativeType("GLsizei") int r13, @org.lwjgl.system.NativeType("GLsizei") int r14, @org.lwjgl.system.NativeType("GLint") int r15, @org.lwjgl.system.NativeType("GLenum") int r16, @org.lwjgl.system.NativeType("GLenum") int r17, @javax.annotation.Nullable @org.lwjgl.system.NativeType("void const *") java.nio.IntBuffer r18) {
            r0 = r10
            r1 = r11
            r2 = r12
            r3 = r13
            r4 = r14
            r5 = r15
            r6 = r16
            r7 = r17
            r8 = r18
            org.lwjgl.opengl.GL11C.glTexImage2D(r0, r1, r2, r3, r4, r5, r6, r7, r8)
            return
    }

    public static void glTexImage2D(@org.lwjgl.system.NativeType("GLenum") int r10, @org.lwjgl.system.NativeType("GLint") int r11, @org.lwjgl.system.NativeType("GLint") int r12, @org.lwjgl.system.NativeType("GLsizei") int r13, @org.lwjgl.system.NativeType("GLsizei") int r14, @org.lwjgl.system.NativeType("GLint") int r15, @org.lwjgl.system.NativeType("GLenum") int r16, @org.lwjgl.system.NativeType("GLenum") int r17, @javax.annotation.Nullable @org.lwjgl.system.NativeType("void const *") java.nio.FloatBuffer r18) {
            r0 = r10
            r1 = r11
            r2 = r12
            r3 = r13
            r4 = r14
            r5 = r15
            r6 = r16
            r7 = r17
            r8 = r18
            org.lwjgl.opengl.GL11C.glTexImage2D(r0, r1, r2, r3, r4, r5, r6, r7, r8)
            return
    }

    public static void glTexImage2D(@org.lwjgl.system.NativeType("GLenum") int r10, @org.lwjgl.system.NativeType("GLint") int r11, @org.lwjgl.system.NativeType("GLint") int r12, @org.lwjgl.system.NativeType("GLsizei") int r13, @org.lwjgl.system.NativeType("GLsizei") int r14, @org.lwjgl.system.NativeType("GLint") int r15, @org.lwjgl.system.NativeType("GLenum") int r16, @org.lwjgl.system.NativeType("GLenum") int r17, @javax.annotation.Nullable @org.lwjgl.system.NativeType("void const *") java.nio.DoubleBuffer r18) {
            r0 = r10
            r1 = r11
            r2 = r12
            r3 = r13
            r4 = r14
            r5 = r15
            r6 = r16
            r7 = r17
            r8 = r18
            org.lwjgl.opengl.GL11C.glTexImage2D(r0, r1, r2, r3, r4, r5, r6, r7, r8)
            return
    }

    public static void glCopyTexImage1D(@org.lwjgl.system.NativeType("GLenum") int r8, @org.lwjgl.system.NativeType("GLint") int r9, @org.lwjgl.system.NativeType("GLenum") int r10, @org.lwjgl.system.NativeType("GLint") int r11, @org.lwjgl.system.NativeType("GLint") int r12, @org.lwjgl.system.NativeType("GLsizei") int r13, @org.lwjgl.system.NativeType("GLint") int r14) {
            r0 = r8
            r1 = r9
            r2 = r10
            r3 = r11
            r4 = r12
            r5 = r13
            r6 = r14
            org.lwjgl.opengl.GL11C.glCopyTexImage1D(r0, r1, r2, r3, r4, r5, r6)
            return
    }

    public static void glCopyTexImage2D(@org.lwjgl.system.NativeType("GLenum") int r9, @org.lwjgl.system.NativeType("GLint") int r10, @org.lwjgl.system.NativeType("GLenum") int r11, @org.lwjgl.system.NativeType("GLint") int r12, @org.lwjgl.system.NativeType("GLint") int r13, @org.lwjgl.system.NativeType("GLsizei") int r14, @org.lwjgl.system.NativeType("GLsizei") int r15, @org.lwjgl.system.NativeType("GLint") int r16) {
            r0 = r9
            r1 = r10
            r2 = r11
            r3 = r12
            r4 = r13
            r5 = r14
            r6 = r15
            r7 = r16
            org.lwjgl.opengl.GL11C.glCopyTexImage2D(r0, r1, r2, r3, r4, r5, r6, r7)
            return
    }

    public static void glCopyTexSubImage1D(@org.lwjgl.system.NativeType("GLenum") int r7, @org.lwjgl.system.NativeType("GLint") int r8, @org.lwjgl.system.NativeType("GLint") int r9, @org.lwjgl.system.NativeType("GLint") int r10, @org.lwjgl.system.NativeType("GLint") int r11, @org.lwjgl.system.NativeType("GLsizei") int r12) {
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            r5 = r12
            org.lwjgl.opengl.GL11C.glCopyTexSubImage1D(r0, r1, r2, r3, r4, r5)
            return
    }

    public static void glCopyTexSubImage2D(@org.lwjgl.system.NativeType("GLenum") int r9, @org.lwjgl.system.NativeType("GLint") int r10, @org.lwjgl.system.NativeType("GLint") int r11, @org.lwjgl.system.NativeType("GLint") int r12, @org.lwjgl.system.NativeType("GLint") int r13, @org.lwjgl.system.NativeType("GLint") int r14, @org.lwjgl.system.NativeType("GLsizei") int r15, @org.lwjgl.system.NativeType("GLsizei") int r16) {
            r0 = r9
            r1 = r10
            r2 = r11
            r3 = r12
            r4 = r13
            r5 = r14
            r6 = r15
            r7 = r16
            org.lwjgl.opengl.GL11C.glCopyTexSubImage2D(r0, r1, r2, r3, r4, r5, r6, r7)
            return
    }

    public static void glTexParameteri(@org.lwjgl.system.NativeType("GLenum") int r4, @org.lwjgl.system.NativeType("GLenum") int r5, @org.lwjgl.system.NativeType("GLint") int r6) {
            r0 = r4
            r1 = r5
            r2 = r6
            org.lwjgl.opengl.GL11C.glTexParameteri(r0, r1, r2)
            return
    }

    public static void nglTexParameteriv(int r5, int r6, long r7) {
            r0 = r5
            r1 = r6
            r2 = r7
            org.lwjgl.opengl.GL11C.nglTexParameteriv(r0, r1, r2)
            return
    }

    public static void glTexParameteriv(@org.lwjgl.system.NativeType("GLenum") int r4, @org.lwjgl.system.NativeType("GLenum") int r5, @org.lwjgl.system.NativeType("GLint const *") java.nio.IntBuffer r6) {
            r0 = r4
            r1 = r5
            r2 = r6
            org.lwjgl.opengl.GL11C.glTexParameteriv(r0, r1, r2)
            return
    }

    public static void glTexParameterf(@org.lwjgl.system.NativeType("GLenum") int r4, @org.lwjgl.system.NativeType("GLenum") int r5, @org.lwjgl.system.NativeType("GLfloat") float r6) {
            r0 = r4
            r1 = r5
            r2 = r6
            org.lwjgl.opengl.GL11C.glTexParameterf(r0, r1, r2)
            return
    }

    public static void nglTexParameterfv(int r5, int r6, long r7) {
            r0 = r5
            r1 = r6
            r2 = r7
            org.lwjgl.opengl.GL11C.nglTexParameterfv(r0, r1, r2)
            return
    }

    public static void glTexParameterfv(@org.lwjgl.system.NativeType("GLenum") int r4, @org.lwjgl.system.NativeType("GLenum") int r5, @org.lwjgl.system.NativeType("GLfloat const *") java.nio.FloatBuffer r6) {
            r0 = r4
            r1 = r5
            r2 = r6
            org.lwjgl.opengl.GL11C.glTexParameterfv(r0, r1, r2)
            return
    }

    public static void nglTexSubImage1D(int r9, int r10, int r11, int r12, int r13, int r14, long r15) {
            r0 = r9
            r1 = r10
            r2 = r11
            r3 = r12
            r4 = r13
            r5 = r14
            r6 = r15
            org.lwjgl.opengl.GL11C.nglTexSubImage1D(r0, r1, r2, r3, r4, r5, r6)
            return
    }

    public static void glTexSubImage1D(@org.lwjgl.system.NativeType("GLenum") int r8, @org.lwjgl.system.NativeType("GLint") int r9, @org.lwjgl.system.NativeType("GLint") int r10, @org.lwjgl.system.NativeType("GLsizei") int r11, @org.lwjgl.system.NativeType("GLenum") int r12, @org.lwjgl.system.NativeType("GLenum") int r13, @org.lwjgl.system.NativeType("void const *") java.nio.ByteBuffer r14) {
            r0 = r8
            r1 = r9
            r2 = r10
            r3 = r11
            r4 = r12
            r5 = r13
            r6 = r14
            org.lwjgl.opengl.GL11C.glTexSubImage1D(r0, r1, r2, r3, r4, r5, r6)
            return
    }

    public static void glTexSubImage1D(@org.lwjgl.system.NativeType("GLenum") int r9, @org.lwjgl.system.NativeType("GLint") int r10, @org.lwjgl.system.NativeType("GLint") int r11, @org.lwjgl.system.NativeType("GLsizei") int r12, @org.lwjgl.system.NativeType("GLenum") int r13, @org.lwjgl.system.NativeType("GLenum") int r14, @org.lwjgl.system.NativeType("void const *") long r15) {
            r0 = r9
            r1 = r10
            r2 = r11
            r3 = r12
            r4 = r13
            r5 = r14
            r6 = r15
            org.lwjgl.opengl.GL11C.glTexSubImage1D(r0, r1, r2, r3, r4, r5, r6)
            return
    }

    public static void glTexSubImage1D(@org.lwjgl.system.NativeType("GLenum") int r8, @org.lwjgl.system.NativeType("GLint") int r9, @org.lwjgl.system.NativeType("GLint") int r10, @org.lwjgl.system.NativeType("GLsizei") int r11, @org.lwjgl.system.NativeType("GLenum") int r12, @org.lwjgl.system.NativeType("GLenum") int r13, @org.lwjgl.system.NativeType("void const *") java.nio.ShortBuffer r14) {
            r0 = r8
            r1 = r9
            r2 = r10
            r3 = r11
            r4 = r12
            r5 = r13
            r6 = r14
            org.lwjgl.opengl.GL11C.glTexSubImage1D(r0, r1, r2, r3, r4, r5, r6)
            return
    }

    public static void glTexSubImage1D(@org.lwjgl.system.NativeType("GLenum") int r8, @org.lwjgl.system.NativeType("GLint") int r9, @org.lwjgl.system.NativeType("GLint") int r10, @org.lwjgl.system.NativeType("GLsizei") int r11, @org.lwjgl.system.NativeType("GLenum") int r12, @org.lwjgl.system.NativeType("GLenum") int r13, @org.lwjgl.system.NativeType("void const *") java.nio.IntBuffer r14) {
            r0 = r8
            r1 = r9
            r2 = r10
            r3 = r11
            r4 = r12
            r5 = r13
            r6 = r14
            org.lwjgl.opengl.GL11C.glTexSubImage1D(r0, r1, r2, r3, r4, r5, r6)
            return
    }

    public static void glTexSubImage1D(@org.lwjgl.system.NativeType("GLenum") int r8, @org.lwjgl.system.NativeType("GLint") int r9, @org.lwjgl.system.NativeType("GLint") int r10, @org.lwjgl.system.NativeType("GLsizei") int r11, @org.lwjgl.system.NativeType("GLenum") int r12, @org.lwjgl.system.NativeType("GLenum") int r13, @org.lwjgl.system.NativeType("void const *") java.nio.FloatBuffer r14) {
            r0 = r8
            r1 = r9
            r2 = r10
            r3 = r11
            r4 = r12
            r5 = r13
            r6 = r14
            org.lwjgl.opengl.GL11C.glTexSubImage1D(r0, r1, r2, r3, r4, r5, r6)
            return
    }

    public static void glTexSubImage1D(@org.lwjgl.system.NativeType("GLenum") int r8, @org.lwjgl.system.NativeType("GLint") int r9, @org.lwjgl.system.NativeType("GLint") int r10, @org.lwjgl.system.NativeType("GLsizei") int r11, @org.lwjgl.system.NativeType("GLenum") int r12, @org.lwjgl.system.NativeType("GLenum") int r13, @org.lwjgl.system.NativeType("void const *") java.nio.DoubleBuffer r14) {
            r0 = r8
            r1 = r9
            r2 = r10
            r3 = r11
            r4 = r12
            r5 = r13
            r6 = r14
            org.lwjgl.opengl.GL11C.glTexSubImage1D(r0, r1, r2, r3, r4, r5, r6)
            return
    }

    public static void nglTexSubImage2D(int r11, int r12, int r13, int r14, int r15, int r16, int r17, int r18, long r19) {
            r0 = r11
            r1 = r12
            r2 = r13
            r3 = r14
            r4 = r15
            r5 = r16
            r6 = r17
            r7 = r18
            r8 = r19
            org.lwjgl.opengl.GL11C.nglTexSubImage2D(r0, r1, r2, r3, r4, r5, r6, r7, r8)
            return
    }

    public static void glTexSubImage2D(@org.lwjgl.system.NativeType("GLenum") int r10, @org.lwjgl.system.NativeType("GLint") int r11, @org.lwjgl.system.NativeType("GLint") int r12, @org.lwjgl.system.NativeType("GLint") int r13, @org.lwjgl.system.NativeType("GLsizei") int r14, @org.lwjgl.system.NativeType("GLsizei") int r15, @org.lwjgl.system.NativeType("GLenum") int r16, @org.lwjgl.system.NativeType("GLenum") int r17, @org.lwjgl.system.NativeType("void const *") java.nio.ByteBuffer r18) {
            r0 = r10
            r1 = r11
            r2 = r12
            r3 = r13
            r4 = r14
            r5 = r15
            r6 = r16
            r7 = r17
            r8 = r18
            org.lwjgl.opengl.GL11C.glTexSubImage2D(r0, r1, r2, r3, r4, r5, r6, r7, r8)
            return
    }

    public static void glTexSubImage2D(@org.lwjgl.system.NativeType("GLenum") int r11, @org.lwjgl.system.NativeType("GLint") int r12, @org.lwjgl.system.NativeType("GLint") int r13, @org.lwjgl.system.NativeType("GLint") int r14, @org.lwjgl.system.NativeType("GLsizei") int r15, @org.lwjgl.system.NativeType("GLsizei") int r16, @org.lwjgl.system.NativeType("GLenum") int r17, @org.lwjgl.system.NativeType("GLenum") int r18, @org.lwjgl.system.NativeType("void const *") long r19) {
            r0 = r11
            r1 = r12
            r2 = r13
            r3 = r14
            r4 = r15
            r5 = r16
            r6 = r17
            r7 = r18
            r8 = r19
            org.lwjgl.opengl.GL11C.glTexSubImage2D(r0, r1, r2, r3, r4, r5, r6, r7, r8)
            return
    }

    public static void glTexSubImage2D(@org.lwjgl.system.NativeType("GLenum") int r10, @org.lwjgl.system.NativeType("GLint") int r11, @org.lwjgl.system.NativeType("GLint") int r12, @org.lwjgl.system.NativeType("GLint") int r13, @org.lwjgl.system.NativeType("GLsizei") int r14, @org.lwjgl.system.NativeType("GLsizei") int r15, @org.lwjgl.system.NativeType("GLenum") int r16, @org.lwjgl.system.NativeType("GLenum") int r17, @org.lwjgl.system.NativeType("void const *") java.nio.ShortBuffer r18) {
            r0 = r10
            r1 = r11
            r2 = r12
            r3 = r13
            r4 = r14
            r5 = r15
            r6 = r16
            r7 = r17
            r8 = r18
            org.lwjgl.opengl.GL11C.glTexSubImage2D(r0, r1, r2, r3, r4, r5, r6, r7, r8)
            return
    }

    public static void glTexSubImage2D(@org.lwjgl.system.NativeType("GLenum") int r10, @org.lwjgl.system.NativeType("GLint") int r11, @org.lwjgl.system.NativeType("GLint") int r12, @org.lwjgl.system.NativeType("GLint") int r13, @org.lwjgl.system.NativeType("GLsizei") int r14, @org.lwjgl.system.NativeType("GLsizei") int r15, @org.lwjgl.system.NativeType("GLenum") int r16, @org.lwjgl.system.NativeType("GLenum") int r17, @org.lwjgl.system.NativeType("void const *") java.nio.IntBuffer r18) {
            r0 = r10
            r1 = r11
            r2 = r12
            r3 = r13
            r4 = r14
            r5 = r15
            r6 = r16
            r7 = r17
            r8 = r18
            org.lwjgl.opengl.GL11C.glTexSubImage2D(r0, r1, r2, r3, r4, r5, r6, r7, r8)
            return
    }

    public static void glTexSubImage2D(@org.lwjgl.system.NativeType("GLenum") int r10, @org.lwjgl.system.NativeType("GLint") int r11, @org.lwjgl.system.NativeType("GLint") int r12, @org.lwjgl.system.NativeType("GLint") int r13, @org.lwjgl.system.NativeType("GLsizei") int r14, @org.lwjgl.system.NativeType("GLsizei") int r15, @org.lwjgl.system.NativeType("GLenum") int r16, @org.lwjgl.system.NativeType("GLenum") int r17, @org.lwjgl.system.NativeType("void const *") java.nio.FloatBuffer r18) {
            r0 = r10
            r1 = r11
            r2 = r12
            r3 = r13
            r4 = r14
            r5 = r15
            r6 = r16
            r7 = r17
            r8 = r18
            org.lwjgl.opengl.GL11C.glTexSubImage2D(r0, r1, r2, r3, r4, r5, r6, r7, r8)
            return
    }

    public static void glTexSubImage2D(@org.lwjgl.system.NativeType("GLenum") int r10, @org.lwjgl.system.NativeType("GLint") int r11, @org.lwjgl.system.NativeType("GLint") int r12, @org.lwjgl.system.NativeType("GLint") int r13, @org.lwjgl.system.NativeType("GLsizei") int r14, @org.lwjgl.system.NativeType("GLsizei") int r15, @org.lwjgl.system.NativeType("GLenum") int r16, @org.lwjgl.system.NativeType("GLenum") int r17, @org.lwjgl.system.NativeType("void const *") java.nio.DoubleBuffer r18) {
            r0 = r10
            r1 = r11
            r2 = r12
            r3 = r13
            r4 = r14
            r5 = r15
            r6 = r16
            r7 = r17
            r8 = r18
            org.lwjgl.opengl.GL11C.glTexSubImage2D(r0, r1, r2, r3, r4, r5, r6, r7, r8)
            return
    }

    public static native void glTranslatef(@org.lwjgl.system.NativeType("GLfloat") float r0, @org.lwjgl.system.NativeType("GLfloat") float r1, @org.lwjgl.system.NativeType("GLfloat") float r2);

    public static native void glTranslated(@org.lwjgl.system.NativeType("GLdouble") double r0, @org.lwjgl.system.NativeType("GLdouble") double r2, @org.lwjgl.system.NativeType("GLdouble") double r4);

    public static native void glVertex2f(@org.lwjgl.system.NativeType("GLfloat") float r0, @org.lwjgl.system.NativeType("GLfloat") float r1);

    public static native void glVertex2s(@org.lwjgl.system.NativeType("GLshort") short r0, @org.lwjgl.system.NativeType("GLshort") short r1);

    public static native void glVertex2i(@org.lwjgl.system.NativeType("GLint") int r0, @org.lwjgl.system.NativeType("GLint") int r1);

    public static native void glVertex2d(@org.lwjgl.system.NativeType("GLdouble") double r0, @org.lwjgl.system.NativeType("GLdouble") double r2);

    public static native void nglVertex2fv(long r0);

    public static void glVertex2fv(@org.lwjgl.system.NativeType("GLfloat const *") java.nio.FloatBuffer r3) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r3
            r1 = 2
            org.lwjgl.system.Checks.check(r0, r1)
        Lb:
            r0 = r3
            long r0 = org.lwjgl.system.MemoryUtil.memAddress(r0)
            nglVertex2fv(r0)
            return
    }

    public static native void nglVertex2sv(long r0);

    public static void glVertex2sv(@org.lwjgl.system.NativeType("GLshort const *") java.nio.ShortBuffer r3) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r3
            r1 = 2
            org.lwjgl.system.Checks.check(r0, r1)
        Lb:
            r0 = r3
            long r0 = org.lwjgl.system.MemoryUtil.memAddress(r0)
            nglVertex2sv(r0)
            return
    }

    public static native void nglVertex2iv(long r0);

    public static void glVertex2iv(@org.lwjgl.system.NativeType("GLint const *") java.nio.IntBuffer r3) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r3
            r1 = 2
            org.lwjgl.system.Checks.check(r0, r1)
        Lb:
            r0 = r3
            long r0 = org.lwjgl.system.MemoryUtil.memAddress(r0)
            nglVertex2iv(r0)
            return
    }

    public static native void nglVertex2dv(long r0);

    public static void glVertex2dv(@org.lwjgl.system.NativeType("GLdouble const *") java.nio.DoubleBuffer r3) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r3
            r1 = 2
            org.lwjgl.system.Checks.check(r0, r1)
        Lb:
            r0 = r3
            long r0 = org.lwjgl.system.MemoryUtil.memAddress(r0)
            nglVertex2dv(r0)
            return
    }

    public static native void glVertex3f(@org.lwjgl.system.NativeType("GLfloat") float r0, @org.lwjgl.system.NativeType("GLfloat") float r1, @org.lwjgl.system.NativeType("GLfloat") float r2);

    public static native void glVertex3s(@org.lwjgl.system.NativeType("GLshort") short r0, @org.lwjgl.system.NativeType("GLshort") short r1, @org.lwjgl.system.NativeType("GLshort") short r2);

    public static native void glVertex3i(@org.lwjgl.system.NativeType("GLint") int r0, @org.lwjgl.system.NativeType("GLint") int r1, @org.lwjgl.system.NativeType("GLint") int r2);

    public static native void glVertex3d(@org.lwjgl.system.NativeType("GLdouble") double r0, @org.lwjgl.system.NativeType("GLdouble") double r2, @org.lwjgl.system.NativeType("GLdouble") double r4);

    public static native void nglVertex3fv(long r0);

    public static void glVertex3fv(@org.lwjgl.system.NativeType("GLfloat const *") java.nio.FloatBuffer r3) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r3
            r1 = 3
            org.lwjgl.system.Checks.check(r0, r1)
        Lb:
            r0 = r3
            long r0 = org.lwjgl.system.MemoryUtil.memAddress(r0)
            nglVertex3fv(r0)
            return
    }

    public static native void nglVertex3sv(long r0);

    public static void glVertex3sv(@org.lwjgl.system.NativeType("GLshort const *") java.nio.ShortBuffer r3) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r3
            r1 = 3
            org.lwjgl.system.Checks.check(r0, r1)
        Lb:
            r0 = r3
            long r0 = org.lwjgl.system.MemoryUtil.memAddress(r0)
            nglVertex3sv(r0)
            return
    }

    public static native void nglVertex3iv(long r0);

    public static void glVertex3iv(@org.lwjgl.system.NativeType("GLint const *") java.nio.IntBuffer r3) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r3
            r1 = 3
            org.lwjgl.system.Checks.check(r0, r1)
        Lb:
            r0 = r3
            long r0 = org.lwjgl.system.MemoryUtil.memAddress(r0)
            nglVertex3iv(r0)
            return
    }

    public static native void nglVertex3dv(long r0);

    public static void glVertex3dv(@org.lwjgl.system.NativeType("GLdouble const *") java.nio.DoubleBuffer r3) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r3
            r1 = 3
            org.lwjgl.system.Checks.check(r0, r1)
        Lb:
            r0 = r3
            long r0 = org.lwjgl.system.MemoryUtil.memAddress(r0)
            nglVertex3dv(r0)
            return
    }

    public static native void glVertex4f(@org.lwjgl.system.NativeType("GLfloat") float r0, @org.lwjgl.system.NativeType("GLfloat") float r1, @org.lwjgl.system.NativeType("GLfloat") float r2, @org.lwjgl.system.NativeType("GLfloat") float r3);

    public static native void glVertex4s(@org.lwjgl.system.NativeType("GLshort") short r0, @org.lwjgl.system.NativeType("GLshort") short r1, @org.lwjgl.system.NativeType("GLshort") short r2, @org.lwjgl.system.NativeType("GLshort") short r3);

    public static native void glVertex4i(@org.lwjgl.system.NativeType("GLint") int r0, @org.lwjgl.system.NativeType("GLint") int r1, @org.lwjgl.system.NativeType("GLint") int r2, @org.lwjgl.system.NativeType("GLint") int r3);

    public static native void glVertex4d(@org.lwjgl.system.NativeType("GLdouble") double r0, @org.lwjgl.system.NativeType("GLdouble") double r2, @org.lwjgl.system.NativeType("GLdouble") double r4, @org.lwjgl.system.NativeType("GLdouble") double r6);

    public static native void nglVertex4fv(long r0);

    public static void glVertex4fv(@org.lwjgl.system.NativeType("GLfloat const *") java.nio.FloatBuffer r3) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r3
            r1 = 4
            org.lwjgl.system.Checks.check(r0, r1)
        Lb:
            r0 = r3
            long r0 = org.lwjgl.system.MemoryUtil.memAddress(r0)
            nglVertex4fv(r0)
            return
    }

    public static native void nglVertex4sv(long r0);

    public static void glVertex4sv(@org.lwjgl.system.NativeType("GLshort const *") java.nio.ShortBuffer r3) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r3
            r1 = 4
            org.lwjgl.system.Checks.check(r0, r1)
        Lb:
            r0 = r3
            long r0 = org.lwjgl.system.MemoryUtil.memAddress(r0)
            nglVertex4sv(r0)
            return
    }

    public static native void nglVertex4iv(long r0);

    public static void glVertex4iv(@org.lwjgl.system.NativeType("GLint const *") java.nio.IntBuffer r3) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r3
            r1 = 4
            org.lwjgl.system.Checks.check(r0, r1)
        Lb:
            r0 = r3
            long r0 = org.lwjgl.system.MemoryUtil.memAddress(r0)
            nglVertex4iv(r0)
            return
    }

    public static native void nglVertex4dv(long r0);

    public static void glVertex4dv(@org.lwjgl.system.NativeType("GLdouble const *") java.nio.DoubleBuffer r3) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r3
            r1 = 4
            org.lwjgl.system.Checks.check(r0, r1)
        Lb:
            r0 = r3
            long r0 = org.lwjgl.system.MemoryUtil.memAddress(r0)
            nglVertex4dv(r0)
            return
    }

    public static native void nglVertexPointer(int r0, int r1, int r2, long r3);

    public static void glVertexPointer(@org.lwjgl.system.NativeType("GLint") int r6, @org.lwjgl.system.NativeType("GLenum") int r7, @org.lwjgl.system.NativeType("GLsizei") int r8, @org.lwjgl.system.NativeType("void const *") java.nio.ByteBuffer r9) {
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            long r3 = org.lwjgl.system.MemoryUtil.memAddress(r3)
            nglVertexPointer(r0, r1, r2, r3)
            return
    }

    public static void glVertexPointer(@org.lwjgl.system.NativeType("GLint") int r6, @org.lwjgl.system.NativeType("GLenum") int r7, @org.lwjgl.system.NativeType("GLsizei") int r8, @org.lwjgl.system.NativeType("void const *") long r9) {
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            nglVertexPointer(r0, r1, r2, r3)
            return
    }

    public static void glVertexPointer(@org.lwjgl.system.NativeType("GLint") int r6, @org.lwjgl.system.NativeType("GLenum") int r7, @org.lwjgl.system.NativeType("GLsizei") int r8, @org.lwjgl.system.NativeType("void const *") java.nio.ShortBuffer r9) {
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            long r3 = org.lwjgl.system.MemoryUtil.memAddress(r3)
            nglVertexPointer(r0, r1, r2, r3)
            return
    }

    public static void glVertexPointer(@org.lwjgl.system.NativeType("GLint") int r6, @org.lwjgl.system.NativeType("GLenum") int r7, @org.lwjgl.system.NativeType("GLsizei") int r8, @org.lwjgl.system.NativeType("void const *") java.nio.IntBuffer r9) {
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            long r3 = org.lwjgl.system.MemoryUtil.memAddress(r3)
            nglVertexPointer(r0, r1, r2, r3)
            return
    }

    public static void glVertexPointer(@org.lwjgl.system.NativeType("GLint") int r6, @org.lwjgl.system.NativeType("GLenum") int r7, @org.lwjgl.system.NativeType("GLsizei") int r8, @org.lwjgl.system.NativeType("void const *") java.nio.FloatBuffer r9) {
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            long r3 = org.lwjgl.system.MemoryUtil.memAddress(r3)
            nglVertexPointer(r0, r1, r2, r3)
            return
    }

    public static void glViewport(@org.lwjgl.system.NativeType("GLint") int r5, @org.lwjgl.system.NativeType("GLint") int r6, @org.lwjgl.system.NativeType("GLsizei") int r7, @org.lwjgl.system.NativeType("GLsizei") int r8) {
            r0 = r5
            r1 = r6
            r2 = r7
            r3 = r8
            org.lwjgl.opengl.GL11C.glViewport(r0, r1, r2, r3)
            return
    }

    @org.lwjgl.system.NativeType("GLboolean")
    public static boolean glAreTexturesResident(@org.lwjgl.system.NativeType("GLuint const *") int[] r7, @org.lwjgl.system.NativeType("GLboolean *") java.nio.ByteBuffer r8) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glAreTexturesResident
            r9 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L18
            r0 = r9
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r8
            r1 = r7
            int r1 = r1.length
            org.lwjgl.system.Checks.check(r0, r1)
        L18:
            r0 = r7
            int r0 = r0.length
            r1 = r7
            r2 = r8
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            r3 = r9
            boolean r0 = org.lwjgl.system.JNI.callPPZ(r0, r1, r2, r3)
            return r0
    }

    public static void glClipPlane(@org.lwjgl.system.NativeType("GLenum") int r5, @org.lwjgl.system.NativeType("GLdouble const *") double[] r6) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glClipPlane
            r7 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L17
            r0 = r7
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r6
            r1 = 4
            org.lwjgl.system.Checks.check(r0, r1)
        L17:
            r0 = r5
            r1 = r6
            r2 = r7
            org.lwjgl.system.JNI.callPV(r0, r1, r2)
            return
    }

    public static void glColor3sv(@org.lwjgl.system.NativeType("GLshort const *") short[] r4) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glColor3sv
            r5 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L17
            r0 = r5
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r4
            r1 = 3
            org.lwjgl.system.Checks.check(r0, r1)
        L17:
            r0 = r4
            r1 = r5
            org.lwjgl.system.JNI.callPV(r0, r1)
            return
    }

    public static void glColor3iv(@org.lwjgl.system.NativeType("GLint const *") int[] r4) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glColor3iv
            r5 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L17
            r0 = r5
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r4
            r1 = 3
            org.lwjgl.system.Checks.check(r0, r1)
        L17:
            r0 = r4
            r1 = r5
            org.lwjgl.system.JNI.callPV(r0, r1)
            return
    }

    public static void glColor3fv(@org.lwjgl.system.NativeType("GLfloat const *") float[] r4) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glColor3fv
            r5 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L17
            r0 = r5
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r4
            r1 = 3
            org.lwjgl.system.Checks.check(r0, r1)
        L17:
            r0 = r4
            r1 = r5
            org.lwjgl.system.JNI.callPV(r0, r1)
            return
    }

    public static void glColor3dv(@org.lwjgl.system.NativeType("GLdouble const *") double[] r4) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glColor3dv
            r5 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L17
            r0 = r5
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r4
            r1 = 3
            org.lwjgl.system.Checks.check(r0, r1)
        L17:
            r0 = r4
            r1 = r5
            org.lwjgl.system.JNI.callPV(r0, r1)
            return
    }

    public static void glColor3usv(@org.lwjgl.system.NativeType("GLushort const *") short[] r4) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glColor3usv
            r5 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L17
            r0 = r5
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r4
            r1 = 3
            org.lwjgl.system.Checks.check(r0, r1)
        L17:
            r0 = r4
            r1 = r5
            org.lwjgl.system.JNI.callPV(r0, r1)
            return
    }

    public static void glColor3uiv(@org.lwjgl.system.NativeType("GLuint const *") int[] r4) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glColor3uiv
            r5 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L17
            r0 = r5
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r4
            r1 = 3
            org.lwjgl.system.Checks.check(r0, r1)
        L17:
            r0 = r4
            r1 = r5
            org.lwjgl.system.JNI.callPV(r0, r1)
            return
    }

    public static void glColor4sv(@org.lwjgl.system.NativeType("GLshort const *") short[] r4) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glColor4sv
            r5 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L17
            r0 = r5
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r4
            r1 = 4
            org.lwjgl.system.Checks.check(r0, r1)
        L17:
            r0 = r4
            r1 = r5
            org.lwjgl.system.JNI.callPV(r0, r1)
            return
    }

    public static void glColor4iv(@org.lwjgl.system.NativeType("GLint const *") int[] r4) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glColor4iv
            r5 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L17
            r0 = r5
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r4
            r1 = 4
            org.lwjgl.system.Checks.check(r0, r1)
        L17:
            r0 = r4
            r1 = r5
            org.lwjgl.system.JNI.callPV(r0, r1)
            return
    }

    public static void glColor4fv(@org.lwjgl.system.NativeType("GLfloat const *") float[] r4) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glColor4fv
            r5 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L17
            r0 = r5
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r4
            r1 = 4
            org.lwjgl.system.Checks.check(r0, r1)
        L17:
            r0 = r4
            r1 = r5
            org.lwjgl.system.JNI.callPV(r0, r1)
            return
    }

    public static void glColor4dv(@org.lwjgl.system.NativeType("GLdouble const *") double[] r4) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glColor4dv
            r5 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L17
            r0 = r5
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r4
            r1 = 4
            org.lwjgl.system.Checks.check(r0, r1)
        L17:
            r0 = r4
            r1 = r5
            org.lwjgl.system.JNI.callPV(r0, r1)
            return
    }

    public static void glColor4usv(@org.lwjgl.system.NativeType("GLushort const *") short[] r4) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glColor4usv
            r5 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L17
            r0 = r5
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r4
            r1 = 4
            org.lwjgl.system.Checks.check(r0, r1)
        L17:
            r0 = r4
            r1 = r5
            org.lwjgl.system.JNI.callPV(r0, r1)
            return
    }

    public static void glColor4uiv(@org.lwjgl.system.NativeType("GLuint const *") int[] r4) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glColor4uiv
            r5 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L17
            r0 = r5
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r4
            r1 = 4
            org.lwjgl.system.Checks.check(r0, r1)
        L17:
            r0 = r4
            r1 = r5
            org.lwjgl.system.JNI.callPV(r0, r1)
            return
    }

    public static void glDrawPixels(@org.lwjgl.system.NativeType("GLsizei") int r8, @org.lwjgl.system.NativeType("GLsizei") int r9, @org.lwjgl.system.NativeType("GLenum") int r10, @org.lwjgl.system.NativeType("GLenum") int r11, @org.lwjgl.system.NativeType("void const *") short[] r12) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glDrawPixels
            r13 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L14
            r0 = r13
            long r0 = org.lwjgl.system.Checks.check(r0)
        L14:
            r0 = r8
            r1 = r9
            r2 = r10
            r3 = r11
            r4 = r12
            r5 = r13
            org.lwjgl.system.JNI.callPV(r0, r1, r2, r3, r4, r5)
            return
    }

    public static void glDrawPixels(@org.lwjgl.system.NativeType("GLsizei") int r8, @org.lwjgl.system.NativeType("GLsizei") int r9, @org.lwjgl.system.NativeType("GLenum") int r10, @org.lwjgl.system.NativeType("GLenum") int r11, @org.lwjgl.system.NativeType("void const *") int[] r12) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glDrawPixels
            r13 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L14
            r0 = r13
            long r0 = org.lwjgl.system.Checks.check(r0)
        L14:
            r0 = r8
            r1 = r9
            r2 = r10
            r3 = r11
            r4 = r12
            r5 = r13
            org.lwjgl.system.JNI.callPV(r0, r1, r2, r3, r4, r5)
            return
    }

    public static void glDrawPixels(@org.lwjgl.system.NativeType("GLsizei") int r8, @org.lwjgl.system.NativeType("GLsizei") int r9, @org.lwjgl.system.NativeType("GLenum") int r10, @org.lwjgl.system.NativeType("GLenum") int r11, @org.lwjgl.system.NativeType("void const *") float[] r12) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glDrawPixels
            r13 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L14
            r0 = r13
            long r0 = org.lwjgl.system.Checks.check(r0)
        L14:
            r0 = r8
            r1 = r9
            r2 = r10
            r3 = r11
            r4 = r12
            r5 = r13
            org.lwjgl.system.JNI.callPV(r0, r1, r2, r3, r4, r5)
            return
    }

    public static void glEvalCoord1fv(@org.lwjgl.system.NativeType("GLfloat const *") float[] r4) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glEvalCoord1fv
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
            org.lwjgl.system.JNI.callPV(r0, r1)
            return
    }

    public static void glEvalCoord1dv(@org.lwjgl.system.NativeType("GLdouble const *") double[] r4) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glEvalCoord1dv
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
            org.lwjgl.system.JNI.callPV(r0, r1)
            return
    }

    public static void glEvalCoord2fv(@org.lwjgl.system.NativeType("GLfloat const *") float[] r4) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glEvalCoord2fv
            r5 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L17
            r0 = r5
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r4
            r1 = 2
            org.lwjgl.system.Checks.check(r0, r1)
        L17:
            r0 = r4
            r1 = r5
            org.lwjgl.system.JNI.callPV(r0, r1)
            return
    }

    public static void glEvalCoord2dv(@org.lwjgl.system.NativeType("GLdouble const *") double[] r4) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glEvalCoord2dv
            r5 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L17
            r0 = r5
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r4
            r1 = 2
            org.lwjgl.system.Checks.check(r0, r1)
        L17:
            r0 = r4
            r1 = r5
            org.lwjgl.system.JNI.callPV(r0, r1)
            return
    }

    public static void glFeedbackBuffer(@org.lwjgl.system.NativeType("GLenum") int r6, @org.lwjgl.system.NativeType("GLfloat *") float[] r7) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glFeedbackBuffer
            r8 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L12
            r0 = r8
            long r0 = org.lwjgl.system.Checks.check(r0)
        L12:
            r0 = r7
            int r0 = r0.length
            r1 = r6
            r2 = r7
            r3 = r8
            org.lwjgl.system.JNI.callPV(r0, r1, r2, r3)
            return
    }

    public static void glFogiv(@org.lwjgl.system.NativeType("GLenum") int r5, @org.lwjgl.system.NativeType("GLint const *") int[] r6) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glFogiv
            r7 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L17
            r0 = r7
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r6
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
        L17:
            r0 = r5
            r1 = r6
            r2 = r7
            org.lwjgl.system.JNI.callPV(r0, r1, r2)
            return
    }

    public static void glFogfv(@org.lwjgl.system.NativeType("GLenum") int r5, @org.lwjgl.system.NativeType("GLfloat const *") float[] r6) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glFogfv
            r7 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L17
            r0 = r7
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r6
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
        L17:
            r0 = r5
            r1 = r6
            r2 = r7
            org.lwjgl.system.JNI.callPV(r0, r1, r2)
            return
    }

    public static void glGenTextures(@org.lwjgl.system.NativeType("GLuint *") int[] r2) {
            r0 = r2
            org.lwjgl.opengl.GL11C.glGenTextures(r0)
            return
    }

    public static void glDeleteTextures(@org.lwjgl.system.NativeType("GLuint const *") int[] r2) {
            r0 = r2
            org.lwjgl.opengl.GL11C.glDeleteTextures(r0)
            return
    }

    public static void glGetClipPlane(@org.lwjgl.system.NativeType("GLenum") int r5, @org.lwjgl.system.NativeType("GLdouble *") double[] r6) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glGetClipPlane
            r7 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L17
            r0 = r7
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r6
            r1 = 4
            org.lwjgl.system.Checks.check(r0, r1)
        L17:
            r0 = r5
            r1 = r6
            r2 = r7
            org.lwjgl.system.JNI.callPV(r0, r1, r2)
            return
    }

    public static void glGetFloatv(@org.lwjgl.system.NativeType("GLenum") int r3, @org.lwjgl.system.NativeType("GLfloat *") float[] r4) {
            r0 = r3
            r1 = r4
            org.lwjgl.opengl.GL11C.glGetFloatv(r0, r1)
            return
    }

    public static void glGetIntegerv(@org.lwjgl.system.NativeType("GLenum") int r3, @org.lwjgl.system.NativeType("GLint *") int[] r4) {
            r0 = r3
            r1 = r4
            org.lwjgl.opengl.GL11C.glGetIntegerv(r0, r1)
            return
    }

    public static void glGetDoublev(@org.lwjgl.system.NativeType("GLenum") int r3, @org.lwjgl.system.NativeType("GLdouble *") double[] r4) {
            r0 = r3
            r1 = r4
            org.lwjgl.opengl.GL11C.glGetDoublev(r0, r1)
            return
    }

    public static void glGetLightiv(@org.lwjgl.system.NativeType("GLenum") int r6, @org.lwjgl.system.NativeType("GLenum") int r7, @org.lwjgl.system.NativeType("GLint *") int[] r8) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glGetLightiv
            r9 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L17
            r0 = r9
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r8
            r1 = 4
            org.lwjgl.system.Checks.check(r0, r1)
        L17:
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            org.lwjgl.system.JNI.callPV(r0, r1, r2, r3)
            return
    }

    public static void glGetLightfv(@org.lwjgl.system.NativeType("GLenum") int r6, @org.lwjgl.system.NativeType("GLenum") int r7, @org.lwjgl.system.NativeType("GLfloat *") float[] r8) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glGetLightfv
            r9 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L17
            r0 = r9
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r8
            r1 = 4
            org.lwjgl.system.Checks.check(r0, r1)
        L17:
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            org.lwjgl.system.JNI.callPV(r0, r1, r2, r3)
            return
    }

    public static void glGetMapiv(@org.lwjgl.system.NativeType("GLenum") int r6, @org.lwjgl.system.NativeType("GLenum") int r7, @org.lwjgl.system.NativeType("GLint *") int[] r8) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glGetMapiv
            r9 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L17
            r0 = r9
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r8
            r1 = 4
            org.lwjgl.system.Checks.check(r0, r1)
        L17:
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            org.lwjgl.system.JNI.callPV(r0, r1, r2, r3)
            return
    }

    public static void glGetMapfv(@org.lwjgl.system.NativeType("GLenum") int r6, @org.lwjgl.system.NativeType("GLenum") int r7, @org.lwjgl.system.NativeType("GLfloat *") float[] r8) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glGetMapfv
            r9 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L17
            r0 = r9
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r8
            r1 = 4
            org.lwjgl.system.Checks.check(r0, r1)
        L17:
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            org.lwjgl.system.JNI.callPV(r0, r1, r2, r3)
            return
    }

    public static void glGetMapdv(@org.lwjgl.system.NativeType("GLenum") int r6, @org.lwjgl.system.NativeType("GLenum") int r7, @org.lwjgl.system.NativeType("GLdouble *") double[] r8) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glGetMapdv
            r9 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L17
            r0 = r9
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r8
            r1 = 4
            org.lwjgl.system.Checks.check(r0, r1)
        L17:
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            org.lwjgl.system.JNI.callPV(r0, r1, r2, r3)
            return
    }

    public static void glGetMaterialiv(@org.lwjgl.system.NativeType("GLenum") int r6, @org.lwjgl.system.NativeType("GLenum") int r7, @org.lwjgl.system.NativeType("GLint *") int[] r8) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glGetMaterialiv
            r9 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L17
            r0 = r9
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r8
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
        L17:
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            org.lwjgl.system.JNI.callPV(r0, r1, r2, r3)
            return
    }

    public static void glGetMaterialfv(@org.lwjgl.system.NativeType("GLenum") int r6, @org.lwjgl.system.NativeType("GLenum") int r7, @org.lwjgl.system.NativeType("GLfloat *") float[] r8) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glGetMaterialfv
            r9 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L17
            r0 = r9
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r8
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
        L17:
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            org.lwjgl.system.JNI.callPV(r0, r1, r2, r3)
            return
    }

    public static void glGetPixelMapfv(@org.lwjgl.system.NativeType("GLenum") int r5, @org.lwjgl.system.NativeType("GLfloat *") float[] r6) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glGetPixelMapfv
            r7 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L18
            r0 = r7
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r6
            r1 = 32
            org.lwjgl.system.Checks.check(r0, r1)
        L18:
            r0 = r5
            r1 = r6
            r2 = r7
            org.lwjgl.system.JNI.callPV(r0, r1, r2)
            return
    }

    public static void glGetPixelMapusv(@org.lwjgl.system.NativeType("GLenum") int r5, @org.lwjgl.system.NativeType("GLushort *") short[] r6) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glGetPixelMapusv
            r7 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L18
            r0 = r7
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r6
            r1 = 32
            org.lwjgl.system.Checks.check(r0, r1)
        L18:
            r0 = r5
            r1 = r6
            r2 = r7
            org.lwjgl.system.JNI.callPV(r0, r1, r2)
            return
    }

    public static void glGetPixelMapuiv(@org.lwjgl.system.NativeType("GLenum") int r5, @org.lwjgl.system.NativeType("GLuint *") int[] r6) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glGetPixelMapuiv
            r7 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L18
            r0 = r7
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r6
            r1 = 32
            org.lwjgl.system.Checks.check(r0, r1)
        L18:
            r0 = r5
            r1 = r6
            r2 = r7
            org.lwjgl.system.JNI.callPV(r0, r1, r2)
            return
    }

    public static void glGetTexEnviv(@org.lwjgl.system.NativeType("GLenum") int r6, @org.lwjgl.system.NativeType("GLenum") int r7, @org.lwjgl.system.NativeType("GLint *") int[] r8) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glGetTexEnviv
            r9 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L17
            r0 = r9
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r8
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
        L17:
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            org.lwjgl.system.JNI.callPV(r0, r1, r2, r3)
            return
    }

    public static void glGetTexEnvfv(@org.lwjgl.system.NativeType("GLenum") int r6, @org.lwjgl.system.NativeType("GLenum") int r7, @org.lwjgl.system.NativeType("GLfloat *") float[] r8) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glGetTexEnvfv
            r9 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L17
            r0 = r9
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r8
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
        L17:
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            org.lwjgl.system.JNI.callPV(r0, r1, r2, r3)
            return
    }

    public static void glGetTexGeniv(@org.lwjgl.system.NativeType("GLenum") int r6, @org.lwjgl.system.NativeType("GLenum") int r7, @org.lwjgl.system.NativeType("GLint *") int[] r8) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glGetTexGeniv
            r9 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L17
            r0 = r9
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r8
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
        L17:
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            org.lwjgl.system.JNI.callPV(r0, r1, r2, r3)
            return
    }

    public static void glGetTexGenfv(@org.lwjgl.system.NativeType("GLenum") int r6, @org.lwjgl.system.NativeType("GLenum") int r7, @org.lwjgl.system.NativeType("GLfloat *") float[] r8) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glGetTexGenfv
            r9 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L17
            r0 = r9
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r8
            r1 = 4
            org.lwjgl.system.Checks.check(r0, r1)
        L17:
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            org.lwjgl.system.JNI.callPV(r0, r1, r2, r3)
            return
    }

    public static void glGetTexGendv(@org.lwjgl.system.NativeType("GLenum") int r6, @org.lwjgl.system.NativeType("GLenum") int r7, @org.lwjgl.system.NativeType("GLdouble *") double[] r8) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glGetTexGendv
            r9 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L17
            r0 = r9
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r8
            r1 = 4
            org.lwjgl.system.Checks.check(r0, r1)
        L17:
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            org.lwjgl.system.JNI.callPV(r0, r1, r2, r3)
            return
    }

    public static void glGetTexImage(@org.lwjgl.system.NativeType("GLenum") int r6, @org.lwjgl.system.NativeType("GLint") int r7, @org.lwjgl.system.NativeType("GLenum") int r8, @org.lwjgl.system.NativeType("GLenum") int r9, @org.lwjgl.system.NativeType("void *") short[] r10) {
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            org.lwjgl.opengl.GL11C.glGetTexImage(r0, r1, r2, r3, r4)
            return
    }

    public static void glGetTexImage(@org.lwjgl.system.NativeType("GLenum") int r6, @org.lwjgl.system.NativeType("GLint") int r7, @org.lwjgl.system.NativeType("GLenum") int r8, @org.lwjgl.system.NativeType("GLenum") int r9, @org.lwjgl.system.NativeType("void *") int[] r10) {
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            org.lwjgl.opengl.GL11C.glGetTexImage(r0, r1, r2, r3, r4)
            return
    }

    public static void glGetTexImage(@org.lwjgl.system.NativeType("GLenum") int r6, @org.lwjgl.system.NativeType("GLint") int r7, @org.lwjgl.system.NativeType("GLenum") int r8, @org.lwjgl.system.NativeType("GLenum") int r9, @org.lwjgl.system.NativeType("void *") float[] r10) {
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            org.lwjgl.opengl.GL11C.glGetTexImage(r0, r1, r2, r3, r4)
            return
    }

    public static void glGetTexImage(@org.lwjgl.system.NativeType("GLenum") int r6, @org.lwjgl.system.NativeType("GLint") int r7, @org.lwjgl.system.NativeType("GLenum") int r8, @org.lwjgl.system.NativeType("GLenum") int r9, @org.lwjgl.system.NativeType("void *") double[] r10) {
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            org.lwjgl.opengl.GL11C.glGetTexImage(r0, r1, r2, r3, r4)
            return
    }

    public static void glGetTexLevelParameteriv(@org.lwjgl.system.NativeType("GLenum") int r5, @org.lwjgl.system.NativeType("GLint") int r6, @org.lwjgl.system.NativeType("GLenum") int r7, @org.lwjgl.system.NativeType("GLint *") int[] r8) {
            r0 = r5
            r1 = r6
            r2 = r7
            r3 = r8
            org.lwjgl.opengl.GL11C.glGetTexLevelParameteriv(r0, r1, r2, r3)
            return
    }

    public static void glGetTexLevelParameterfv(@org.lwjgl.system.NativeType("GLenum") int r5, @org.lwjgl.system.NativeType("GLint") int r6, @org.lwjgl.system.NativeType("GLenum") int r7, @org.lwjgl.system.NativeType("GLfloat *") float[] r8) {
            r0 = r5
            r1 = r6
            r2 = r7
            r3 = r8
            org.lwjgl.opengl.GL11C.glGetTexLevelParameterfv(r0, r1, r2, r3)
            return
    }

    public static void glGetTexParameteriv(@org.lwjgl.system.NativeType("GLenum") int r4, @org.lwjgl.system.NativeType("GLenum") int r5, @org.lwjgl.system.NativeType("GLint *") int[] r6) {
            r0 = r4
            r1 = r5
            r2 = r6
            org.lwjgl.opengl.GL11C.glGetTexParameteriv(r0, r1, r2)
            return
    }

    public static void glGetTexParameterfv(@org.lwjgl.system.NativeType("GLenum") int r4, @org.lwjgl.system.NativeType("GLenum") int r5, @org.lwjgl.system.NativeType("GLfloat *") float[] r6) {
            r0 = r4
            r1 = r5
            r2 = r6
            org.lwjgl.opengl.GL11C.glGetTexParameterfv(r0, r1, r2)
            return
    }

    public static void glIndexiv(@org.lwjgl.system.NativeType("GLint const *") int[] r4) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glIndexiv
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
            org.lwjgl.system.JNI.callPV(r0, r1)
            return
    }

    public static void glIndexsv(@org.lwjgl.system.NativeType("GLshort const *") short[] r4) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glIndexsv
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
            org.lwjgl.system.JNI.callPV(r0, r1)
            return
    }

    public static void glIndexfv(@org.lwjgl.system.NativeType("GLfloat const *") float[] r4) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glIndexfv
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
            org.lwjgl.system.JNI.callPV(r0, r1)
            return
    }

    public static void glIndexdv(@org.lwjgl.system.NativeType("GLdouble const *") double[] r4) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glIndexdv
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
            org.lwjgl.system.JNI.callPV(r0, r1)
            return
    }

    public static void glInterleavedArrays(@org.lwjgl.system.NativeType("GLenum") int r6, @org.lwjgl.system.NativeType("GLsizei") int r7, @org.lwjgl.system.NativeType("void const *") short[] r8) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glInterleavedArrays
            r9 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L12
            r0 = r9
            long r0 = org.lwjgl.system.Checks.check(r0)
        L12:
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            org.lwjgl.system.JNI.callPV(r0, r1, r2, r3)
            return
    }

    public static void glInterleavedArrays(@org.lwjgl.system.NativeType("GLenum") int r6, @org.lwjgl.system.NativeType("GLsizei") int r7, @org.lwjgl.system.NativeType("void const *") int[] r8) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glInterleavedArrays
            r9 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L12
            r0 = r9
            long r0 = org.lwjgl.system.Checks.check(r0)
        L12:
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            org.lwjgl.system.JNI.callPV(r0, r1, r2, r3)
            return
    }

    public static void glInterleavedArrays(@org.lwjgl.system.NativeType("GLenum") int r6, @org.lwjgl.system.NativeType("GLsizei") int r7, @org.lwjgl.system.NativeType("void const *") float[] r8) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glInterleavedArrays
            r9 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L12
            r0 = r9
            long r0 = org.lwjgl.system.Checks.check(r0)
        L12:
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            org.lwjgl.system.JNI.callPV(r0, r1, r2, r3)
            return
    }

    public static void glInterleavedArrays(@org.lwjgl.system.NativeType("GLenum") int r6, @org.lwjgl.system.NativeType("GLsizei") int r7, @org.lwjgl.system.NativeType("void const *") double[] r8) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glInterleavedArrays
            r9 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L12
            r0 = r9
            long r0 = org.lwjgl.system.Checks.check(r0)
        L12:
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            org.lwjgl.system.JNI.callPV(r0, r1, r2, r3)
            return
    }

    public static void glLightModeliv(@org.lwjgl.system.NativeType("GLenum") int r5, @org.lwjgl.system.NativeType("GLint const *") int[] r6) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glLightModeliv
            r7 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L17
            r0 = r7
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r6
            r1 = 4
            org.lwjgl.system.Checks.check(r0, r1)
        L17:
            r0 = r5
            r1 = r6
            r2 = r7
            org.lwjgl.system.JNI.callPV(r0, r1, r2)
            return
    }

    public static void glLightModelfv(@org.lwjgl.system.NativeType("GLenum") int r5, @org.lwjgl.system.NativeType("GLfloat const *") float[] r6) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glLightModelfv
            r7 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L17
            r0 = r7
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r6
            r1 = 4
            org.lwjgl.system.Checks.check(r0, r1)
        L17:
            r0 = r5
            r1 = r6
            r2 = r7
            org.lwjgl.system.JNI.callPV(r0, r1, r2)
            return
    }

    public static void glLightiv(@org.lwjgl.system.NativeType("GLenum") int r6, @org.lwjgl.system.NativeType("GLenum") int r7, @org.lwjgl.system.NativeType("GLint const *") int[] r8) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glLightiv
            r9 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L17
            r0 = r9
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r8
            r1 = 4
            org.lwjgl.system.Checks.check(r0, r1)
        L17:
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            org.lwjgl.system.JNI.callPV(r0, r1, r2, r3)
            return
    }

    public static void glLightfv(@org.lwjgl.system.NativeType("GLenum") int r6, @org.lwjgl.system.NativeType("GLenum") int r7, @org.lwjgl.system.NativeType("GLfloat const *") float[] r8) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glLightfv
            r9 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L17
            r0 = r9
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r8
            r1 = 4
            org.lwjgl.system.Checks.check(r0, r1)
        L17:
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            org.lwjgl.system.JNI.callPV(r0, r1, r2, r3)
            return
    }

    public static void glLoadMatrixf(@org.lwjgl.system.NativeType("GLfloat const *") float[] r4) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glLoadMatrixf
            r5 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L18
            r0 = r5
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r4
            r1 = 16
            org.lwjgl.system.Checks.check(r0, r1)
        L18:
            r0 = r4
            r1 = r5
            org.lwjgl.system.JNI.callPV(r0, r1)
            return
    }

    public static void glLoadMatrixd(@org.lwjgl.system.NativeType("GLdouble const *") double[] r4) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glLoadMatrixd
            r5 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L18
            r0 = r5
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r4
            r1 = 16
            org.lwjgl.system.Checks.check(r0, r1)
        L18:
            r0 = r4
            r1 = r5
            org.lwjgl.system.JNI.callPV(r0, r1)
            return
    }

    public static void glMap1f(@org.lwjgl.system.NativeType("GLenum") int r9, @org.lwjgl.system.NativeType("GLfloat") float r10, @org.lwjgl.system.NativeType("GLfloat") float r11, @org.lwjgl.system.NativeType("GLint") int r12, @org.lwjgl.system.NativeType("GLint") int r13, @org.lwjgl.system.NativeType("GLfloat const *") float[] r14) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glMap1f
            r15 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L1d
            r0 = r15
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r14
            r1 = r13
            r2 = r12
            int r1 = r1 * r2
            org.lwjgl.system.Checks.check(r0, r1)
        L1d:
            r0 = r9
            r1 = r10
            r2 = r11
            r3 = r12
            r4 = r13
            r5 = r14
            r6 = r15
            org.lwjgl.system.JNI.callPV(r0, r1, r2, r3, r4, r5, r6)
            return
    }

    public static void glMap1d(@org.lwjgl.system.NativeType("GLenum") int r11, @org.lwjgl.system.NativeType("GLdouble") double r12, @org.lwjgl.system.NativeType("GLdouble") double r14, @org.lwjgl.system.NativeType("GLint") int r16, @org.lwjgl.system.NativeType("GLint") int r17, @org.lwjgl.system.NativeType("GLdouble const *") double[] r18) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glMap1d
            r19 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L1e
            r0 = r19
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r18
            r1 = r16
            r2 = r17
            int r1 = r1 * r2
            org.lwjgl.system.Checks.check(r0, r1)
        L1e:
            r0 = r11
            r1 = r12
            r2 = r14
            r3 = r16
            r4 = r17
            r5 = r18
            r6 = r19
            org.lwjgl.system.JNI.callPV(r0, r1, r2, r3, r4, r5, r6)
            return
    }

    public static void glMap2f(@org.lwjgl.system.NativeType("GLenum") int r13, @org.lwjgl.system.NativeType("GLfloat") float r14, @org.lwjgl.system.NativeType("GLfloat") float r15, @org.lwjgl.system.NativeType("GLint") int r16, @org.lwjgl.system.NativeType("GLint") int r17, @org.lwjgl.system.NativeType("GLfloat") float r18, @org.lwjgl.system.NativeType("GLfloat") float r19, @org.lwjgl.system.NativeType("GLint") int r20, @org.lwjgl.system.NativeType("GLint") int r21, @org.lwjgl.system.NativeType("GLfloat const *") float[] r22) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glMap2f
            r23 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L23
            r0 = r23
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r22
            r1 = r16
            r2 = r17
            int r1 = r1 * r2
            r2 = r20
            int r1 = r1 * r2
            r2 = r21
            int r1 = r1 * r2
            org.lwjgl.system.Checks.check(r0, r1)
        L23:
            r0 = r13
            r1 = r14
            r2 = r15
            r3 = r16
            r4 = r17
            r5 = r18
            r6 = r19
            r7 = r20
            r8 = r21
            r9 = r22
            r10 = r23
            org.lwjgl.system.JNI.callPV(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            return
    }

    public static void glMap2d(@org.lwjgl.system.NativeType("GLenum") int r17, @org.lwjgl.system.NativeType("GLdouble") double r18, @org.lwjgl.system.NativeType("GLdouble") double r20, @org.lwjgl.system.NativeType("GLint") int r22, @org.lwjgl.system.NativeType("GLint") int r23, @org.lwjgl.system.NativeType("GLdouble") double r24, @org.lwjgl.system.NativeType("GLdouble") double r26, @org.lwjgl.system.NativeType("GLint") int r28, @org.lwjgl.system.NativeType("GLint") int r29, @org.lwjgl.system.NativeType("GLdouble const *") double[] r30) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glMap2d
            r31 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L24
            r0 = r31
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r30
            r1 = r22
            r2 = r23
            int r1 = r1 * r2
            r2 = r28
            int r1 = r1 * r2
            r2 = r29
            int r1 = r1 * r2
            org.lwjgl.system.Checks.check(r0, r1)
        L24:
            r0 = r17
            r1 = r18
            r2 = r20
            r3 = r22
            r4 = r23
            r5 = r24
            r6 = r26
            r7 = r28
            r8 = r29
            r9 = r30
            r10 = r31
            org.lwjgl.system.JNI.callPV(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            return
    }

    public static void glMaterialiv(@org.lwjgl.system.NativeType("GLenum") int r6, @org.lwjgl.system.NativeType("GLenum") int r7, @org.lwjgl.system.NativeType("GLint const *") int[] r8) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glMaterialiv
            r9 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L17
            r0 = r9
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r8
            r1 = 4
            org.lwjgl.system.Checks.check(r0, r1)
        L17:
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            org.lwjgl.system.JNI.callPV(r0, r1, r2, r3)
            return
    }

    public static void glMaterialfv(@org.lwjgl.system.NativeType("GLenum") int r6, @org.lwjgl.system.NativeType("GLenum") int r7, @org.lwjgl.system.NativeType("GLfloat const *") float[] r8) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glMaterialfv
            r9 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L17
            r0 = r9
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r8
            r1 = 4
            org.lwjgl.system.Checks.check(r0, r1)
        L17:
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            org.lwjgl.system.JNI.callPV(r0, r1, r2, r3)
            return
    }

    public static void glMultMatrixf(@org.lwjgl.system.NativeType("GLfloat const *") float[] r4) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glMultMatrixf
            r5 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L18
            r0 = r5
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r4
            r1 = 16
            org.lwjgl.system.Checks.check(r0, r1)
        L18:
            r0 = r4
            r1 = r5
            org.lwjgl.system.JNI.callPV(r0, r1)
            return
    }

    public static void glMultMatrixd(@org.lwjgl.system.NativeType("GLdouble const *") double[] r4) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glMultMatrixd
            r5 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L18
            r0 = r5
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r4
            r1 = 16
            org.lwjgl.system.Checks.check(r0, r1)
        L18:
            r0 = r4
            r1 = r5
            org.lwjgl.system.JNI.callPV(r0, r1)
            return
    }

    public static void glNormal3fv(@org.lwjgl.system.NativeType("GLfloat const *") float[] r4) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glNormal3fv
            r5 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L17
            r0 = r5
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r4
            r1 = 3
            org.lwjgl.system.Checks.check(r0, r1)
        L17:
            r0 = r4
            r1 = r5
            org.lwjgl.system.JNI.callPV(r0, r1)
            return
    }

    public static void glNormal3sv(@org.lwjgl.system.NativeType("GLshort const *") short[] r4) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glNormal3sv
            r5 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L17
            r0 = r5
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r4
            r1 = 3
            org.lwjgl.system.Checks.check(r0, r1)
        L17:
            r0 = r4
            r1 = r5
            org.lwjgl.system.JNI.callPV(r0, r1)
            return
    }

    public static void glNormal3iv(@org.lwjgl.system.NativeType("GLint const *") int[] r4) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glNormal3iv
            r5 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L17
            r0 = r5
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r4
            r1 = 3
            org.lwjgl.system.Checks.check(r0, r1)
        L17:
            r0 = r4
            r1 = r5
            org.lwjgl.system.JNI.callPV(r0, r1)
            return
    }

    public static void glNormal3dv(@org.lwjgl.system.NativeType("GLdouble const *") double[] r4) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glNormal3dv
            r5 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L17
            r0 = r5
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r4
            r1 = 3
            org.lwjgl.system.Checks.check(r0, r1)
        L17:
            r0 = r4
            r1 = r5
            org.lwjgl.system.JNI.callPV(r0, r1)
            return
    }

    public static void glPixelMapfv(@org.lwjgl.system.NativeType("GLenum") int r6, @org.lwjgl.system.NativeType("GLfloat const *") float[] r7) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glPixelMapfv
            r8 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L12
            r0 = r8
            long r0 = org.lwjgl.system.Checks.check(r0)
        L12:
            r0 = r6
            r1 = r7
            int r1 = r1.length
            r2 = r7
            r3 = r8
            org.lwjgl.system.JNI.callPV(r0, r1, r2, r3)
            return
    }

    public static void glPixelMapusv(@org.lwjgl.system.NativeType("GLenum") int r6, @org.lwjgl.system.NativeType("GLushort const *") short[] r7) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glPixelMapusv
            r8 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L12
            r0 = r8
            long r0 = org.lwjgl.system.Checks.check(r0)
        L12:
            r0 = r6
            r1 = r7
            int r1 = r1.length
            r2 = r7
            r3 = r8
            org.lwjgl.system.JNI.callPV(r0, r1, r2, r3)
            return
    }

    public static void glPixelMapuiv(@org.lwjgl.system.NativeType("GLenum") int r6, @org.lwjgl.system.NativeType("GLuint const *") int[] r7) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glPixelMapuiv
            r8 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L12
            r0 = r8
            long r0 = org.lwjgl.system.Checks.check(r0)
        L12:
            r0 = r6
            r1 = r7
            int r1 = r1.length
            r2 = r7
            r3 = r8
            org.lwjgl.system.JNI.callPV(r0, r1, r2, r3)
            return
    }

    public static void glPrioritizeTextures(@org.lwjgl.system.NativeType("GLuint const *") int[] r6, @org.lwjgl.system.NativeType("GLfloat const *") float[] r7) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glPrioritizeTextures
            r8 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L18
            r0 = r8
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r7
            r1 = r6
            int r1 = r1.length
            org.lwjgl.system.Checks.check(r0, r1)
        L18:
            r0 = r6
            int r0 = r0.length
            r1 = r6
            r2 = r7
            r3 = r8
            org.lwjgl.system.JNI.callPPV(r0, r1, r2, r3)
            return
    }

    public static void glRasterPos2iv(@org.lwjgl.system.NativeType("GLint const *") int[] r4) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glRasterPos2iv
            r5 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L17
            r0 = r5
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r4
            r1 = 2
            org.lwjgl.system.Checks.check(r0, r1)
        L17:
            r0 = r4
            r1 = r5
            org.lwjgl.system.JNI.callPV(r0, r1)
            return
    }

    public static void glRasterPos2sv(@org.lwjgl.system.NativeType("GLshort const *") short[] r4) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glRasterPos2sv
            r5 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L17
            r0 = r5
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r4
            r1 = 2
            org.lwjgl.system.Checks.check(r0, r1)
        L17:
            r0 = r4
            r1 = r5
            org.lwjgl.system.JNI.callPV(r0, r1)
            return
    }

    public static void glRasterPos2fv(@org.lwjgl.system.NativeType("GLfloat const *") float[] r4) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glRasterPos2fv
            r5 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L17
            r0 = r5
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r4
            r1 = 2
            org.lwjgl.system.Checks.check(r0, r1)
        L17:
            r0 = r4
            r1 = r5
            org.lwjgl.system.JNI.callPV(r0, r1)
            return
    }

    public static void glRasterPos2dv(@org.lwjgl.system.NativeType("GLdouble const *") double[] r4) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glRasterPos2dv
            r5 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L17
            r0 = r5
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r4
            r1 = 2
            org.lwjgl.system.Checks.check(r0, r1)
        L17:
            r0 = r4
            r1 = r5
            org.lwjgl.system.JNI.callPV(r0, r1)
            return
    }

    public static void glRasterPos3iv(@org.lwjgl.system.NativeType("GLint const *") int[] r4) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glRasterPos3iv
            r5 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L17
            r0 = r5
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r4
            r1 = 3
            org.lwjgl.system.Checks.check(r0, r1)
        L17:
            r0 = r4
            r1 = r5
            org.lwjgl.system.JNI.callPV(r0, r1)
            return
    }

    public static void glRasterPos3sv(@org.lwjgl.system.NativeType("GLshort const *") short[] r4) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glRasterPos3sv
            r5 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L17
            r0 = r5
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r4
            r1 = 3
            org.lwjgl.system.Checks.check(r0, r1)
        L17:
            r0 = r4
            r1 = r5
            org.lwjgl.system.JNI.callPV(r0, r1)
            return
    }

    public static void glRasterPos3fv(@org.lwjgl.system.NativeType("GLfloat const *") float[] r4) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glRasterPos3fv
            r5 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L17
            r0 = r5
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r4
            r1 = 3
            org.lwjgl.system.Checks.check(r0, r1)
        L17:
            r0 = r4
            r1 = r5
            org.lwjgl.system.JNI.callPV(r0, r1)
            return
    }

    public static void glRasterPos3dv(@org.lwjgl.system.NativeType("GLdouble const *") double[] r4) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glRasterPos3dv
            r5 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L17
            r0 = r5
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r4
            r1 = 3
            org.lwjgl.system.Checks.check(r0, r1)
        L17:
            r0 = r4
            r1 = r5
            org.lwjgl.system.JNI.callPV(r0, r1)
            return
    }

    public static void glRasterPos4iv(@org.lwjgl.system.NativeType("GLint const *") int[] r4) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glRasterPos4iv
            r5 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L17
            r0 = r5
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r4
            r1 = 4
            org.lwjgl.system.Checks.check(r0, r1)
        L17:
            r0 = r4
            r1 = r5
            org.lwjgl.system.JNI.callPV(r0, r1)
            return
    }

    public static void glRasterPos4sv(@org.lwjgl.system.NativeType("GLshort const *") short[] r4) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glRasterPos4sv
            r5 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L17
            r0 = r5
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r4
            r1 = 4
            org.lwjgl.system.Checks.check(r0, r1)
        L17:
            r0 = r4
            r1 = r5
            org.lwjgl.system.JNI.callPV(r0, r1)
            return
    }

    public static void glRasterPos4fv(@org.lwjgl.system.NativeType("GLfloat const *") float[] r4) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glRasterPos4fv
            r5 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L17
            r0 = r5
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r4
            r1 = 4
            org.lwjgl.system.Checks.check(r0, r1)
        L17:
            r0 = r4
            r1 = r5
            org.lwjgl.system.JNI.callPV(r0, r1)
            return
    }

    public static void glRasterPos4dv(@org.lwjgl.system.NativeType("GLdouble const *") double[] r4) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glRasterPos4dv
            r5 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L17
            r0 = r5
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r4
            r1 = 4
            org.lwjgl.system.Checks.check(r0, r1)
        L17:
            r0 = r4
            r1 = r5
            org.lwjgl.system.JNI.callPV(r0, r1)
            return
    }

    public static void glReadPixels(@org.lwjgl.system.NativeType("GLint") int r8, @org.lwjgl.system.NativeType("GLint") int r9, @org.lwjgl.system.NativeType("GLsizei") int r10, @org.lwjgl.system.NativeType("GLsizei") int r11, @org.lwjgl.system.NativeType("GLenum") int r12, @org.lwjgl.system.NativeType("GLenum") int r13, @org.lwjgl.system.NativeType("void *") short[] r14) {
            r0 = r8
            r1 = r9
            r2 = r10
            r3 = r11
            r4 = r12
            r5 = r13
            r6 = r14
            org.lwjgl.opengl.GL11C.glReadPixels(r0, r1, r2, r3, r4, r5, r6)
            return
    }

    public static void glReadPixels(@org.lwjgl.system.NativeType("GLint") int r8, @org.lwjgl.system.NativeType("GLint") int r9, @org.lwjgl.system.NativeType("GLsizei") int r10, @org.lwjgl.system.NativeType("GLsizei") int r11, @org.lwjgl.system.NativeType("GLenum") int r12, @org.lwjgl.system.NativeType("GLenum") int r13, @org.lwjgl.system.NativeType("void *") int[] r14) {
            r0 = r8
            r1 = r9
            r2 = r10
            r3 = r11
            r4 = r12
            r5 = r13
            r6 = r14
            org.lwjgl.opengl.GL11C.glReadPixels(r0, r1, r2, r3, r4, r5, r6)
            return
    }

    public static void glReadPixels(@org.lwjgl.system.NativeType("GLint") int r8, @org.lwjgl.system.NativeType("GLint") int r9, @org.lwjgl.system.NativeType("GLsizei") int r10, @org.lwjgl.system.NativeType("GLsizei") int r11, @org.lwjgl.system.NativeType("GLenum") int r12, @org.lwjgl.system.NativeType("GLenum") int r13, @org.lwjgl.system.NativeType("void *") float[] r14) {
            r0 = r8
            r1 = r9
            r2 = r10
            r3 = r11
            r4 = r12
            r5 = r13
            r6 = r14
            org.lwjgl.opengl.GL11C.glReadPixels(r0, r1, r2, r3, r4, r5, r6)
            return
    }

    public static void glRectiv(@org.lwjgl.system.NativeType("GLint const *") int[] r5, @org.lwjgl.system.NativeType("GLint const *") int[] r6) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glRectiv
            r7 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L1c
            r0 = r7
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r5
            r1 = 2
            org.lwjgl.system.Checks.check(r0, r1)
            r0 = r6
            r1 = 2
            org.lwjgl.system.Checks.check(r0, r1)
        L1c:
            r0 = r5
            r1 = r6
            r2 = r7
            org.lwjgl.system.JNI.callPPV(r0, r1, r2)
            return
    }

    public static void glRectsv(@org.lwjgl.system.NativeType("GLshort const *") short[] r5, @org.lwjgl.system.NativeType("GLshort const *") short[] r6) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glRectsv
            r7 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L1c
            r0 = r7
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r5
            r1 = 2
            org.lwjgl.system.Checks.check(r0, r1)
            r0 = r6
            r1 = 2
            org.lwjgl.system.Checks.check(r0, r1)
        L1c:
            r0 = r5
            r1 = r6
            r2 = r7
            org.lwjgl.system.JNI.callPPV(r0, r1, r2)
            return
    }

    public static void glRectfv(@org.lwjgl.system.NativeType("GLfloat const *") float[] r5, @org.lwjgl.system.NativeType("GLfloat const *") float[] r6) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glRectfv
            r7 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L1c
            r0 = r7
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r5
            r1 = 2
            org.lwjgl.system.Checks.check(r0, r1)
            r0 = r6
            r1 = 2
            org.lwjgl.system.Checks.check(r0, r1)
        L1c:
            r0 = r5
            r1 = r6
            r2 = r7
            org.lwjgl.system.JNI.callPPV(r0, r1, r2)
            return
    }

    public static void glRectdv(@org.lwjgl.system.NativeType("GLdouble const *") double[] r5, @org.lwjgl.system.NativeType("GLdouble const *") double[] r6) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glRectdv
            r7 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L1c
            r0 = r7
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r5
            r1 = 2
            org.lwjgl.system.Checks.check(r0, r1)
            r0 = r6
            r1 = 2
            org.lwjgl.system.Checks.check(r0, r1)
        L1c:
            r0 = r5
            r1 = r6
            r2 = r7
            org.lwjgl.system.JNI.callPPV(r0, r1, r2)
            return
    }

    public static void glSelectBuffer(@org.lwjgl.system.NativeType("GLuint *") int[] r5) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glSelectBuffer
            r6 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L12
            r0 = r6
            long r0 = org.lwjgl.system.Checks.check(r0)
        L12:
            r0 = r5
            int r0 = r0.length
            r1 = r5
            r2 = r6
            org.lwjgl.system.JNI.callPV(r0, r1, r2)
            return
    }

    public static void glTexCoord1fv(@org.lwjgl.system.NativeType("GLfloat const *") float[] r4) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glTexCoord1fv
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
            org.lwjgl.system.JNI.callPV(r0, r1)
            return
    }

    public static void glTexCoord1sv(@org.lwjgl.system.NativeType("GLshort const *") short[] r4) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glTexCoord1sv
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
            org.lwjgl.system.JNI.callPV(r0, r1)
            return
    }

    public static void glTexCoord1iv(@org.lwjgl.system.NativeType("GLint const *") int[] r4) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glTexCoord1iv
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
            org.lwjgl.system.JNI.callPV(r0, r1)
            return
    }

    public static void glTexCoord1dv(@org.lwjgl.system.NativeType("GLdouble const *") double[] r4) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glTexCoord1dv
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
            org.lwjgl.system.JNI.callPV(r0, r1)
            return
    }

    public static void glTexCoord2fv(@org.lwjgl.system.NativeType("GLfloat const *") float[] r4) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glTexCoord2fv
            r5 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L17
            r0 = r5
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r4
            r1 = 2
            org.lwjgl.system.Checks.check(r0, r1)
        L17:
            r0 = r4
            r1 = r5
            org.lwjgl.system.JNI.callPV(r0, r1)
            return
    }

    public static void glTexCoord2sv(@org.lwjgl.system.NativeType("GLshort const *") short[] r4) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glTexCoord2sv
            r5 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L17
            r0 = r5
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r4
            r1 = 2
            org.lwjgl.system.Checks.check(r0, r1)
        L17:
            r0 = r4
            r1 = r5
            org.lwjgl.system.JNI.callPV(r0, r1)
            return
    }

    public static void glTexCoord2iv(@org.lwjgl.system.NativeType("GLint const *") int[] r4) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glTexCoord2iv
            r5 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L17
            r0 = r5
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r4
            r1 = 2
            org.lwjgl.system.Checks.check(r0, r1)
        L17:
            r0 = r4
            r1 = r5
            org.lwjgl.system.JNI.callPV(r0, r1)
            return
    }

    public static void glTexCoord2dv(@org.lwjgl.system.NativeType("GLdouble const *") double[] r4) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glTexCoord2dv
            r5 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L17
            r0 = r5
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r4
            r1 = 2
            org.lwjgl.system.Checks.check(r0, r1)
        L17:
            r0 = r4
            r1 = r5
            org.lwjgl.system.JNI.callPV(r0, r1)
            return
    }

    public static void glTexCoord3fv(@org.lwjgl.system.NativeType("GLfloat const *") float[] r4) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glTexCoord3fv
            r5 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L17
            r0 = r5
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r4
            r1 = 3
            org.lwjgl.system.Checks.check(r0, r1)
        L17:
            r0 = r4
            r1 = r5
            org.lwjgl.system.JNI.callPV(r0, r1)
            return
    }

    public static void glTexCoord3sv(@org.lwjgl.system.NativeType("GLshort const *") short[] r4) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glTexCoord3sv
            r5 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L17
            r0 = r5
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r4
            r1 = 3
            org.lwjgl.system.Checks.check(r0, r1)
        L17:
            r0 = r4
            r1 = r5
            org.lwjgl.system.JNI.callPV(r0, r1)
            return
    }

    public static void glTexCoord3iv(@org.lwjgl.system.NativeType("GLint const *") int[] r4) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glTexCoord3iv
            r5 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L17
            r0 = r5
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r4
            r1 = 3
            org.lwjgl.system.Checks.check(r0, r1)
        L17:
            r0 = r4
            r1 = r5
            org.lwjgl.system.JNI.callPV(r0, r1)
            return
    }

    public static void glTexCoord3dv(@org.lwjgl.system.NativeType("GLdouble const *") double[] r4) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glTexCoord3dv
            r5 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L17
            r0 = r5
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r4
            r1 = 3
            org.lwjgl.system.Checks.check(r0, r1)
        L17:
            r0 = r4
            r1 = r5
            org.lwjgl.system.JNI.callPV(r0, r1)
            return
    }

    public static void glTexCoord4fv(@org.lwjgl.system.NativeType("GLfloat const *") float[] r4) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glTexCoord4fv
            r5 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L17
            r0 = r5
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r4
            r1 = 4
            org.lwjgl.system.Checks.check(r0, r1)
        L17:
            r0 = r4
            r1 = r5
            org.lwjgl.system.JNI.callPV(r0, r1)
            return
    }

    public static void glTexCoord4sv(@org.lwjgl.system.NativeType("GLshort const *") short[] r4) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glTexCoord4sv
            r5 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L17
            r0 = r5
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r4
            r1 = 4
            org.lwjgl.system.Checks.check(r0, r1)
        L17:
            r0 = r4
            r1 = r5
            org.lwjgl.system.JNI.callPV(r0, r1)
            return
    }

    public static void glTexCoord4iv(@org.lwjgl.system.NativeType("GLint const *") int[] r4) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glTexCoord4iv
            r5 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L17
            r0 = r5
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r4
            r1 = 4
            org.lwjgl.system.Checks.check(r0, r1)
        L17:
            r0 = r4
            r1 = r5
            org.lwjgl.system.JNI.callPV(r0, r1)
            return
    }

    public static void glTexCoord4dv(@org.lwjgl.system.NativeType("GLdouble const *") double[] r4) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glTexCoord4dv
            r5 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L17
            r0 = r5
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r4
            r1 = 4
            org.lwjgl.system.Checks.check(r0, r1)
        L17:
            r0 = r4
            r1 = r5
            org.lwjgl.system.JNI.callPV(r0, r1)
            return
    }

    public static void glTexEnviv(@org.lwjgl.system.NativeType("GLenum") int r6, @org.lwjgl.system.NativeType("GLenum") int r7, @org.lwjgl.system.NativeType("GLint const *") int[] r8) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glTexEnviv
            r9 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L17
            r0 = r9
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r8
            r1 = 4
            org.lwjgl.system.Checks.check(r0, r1)
        L17:
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            org.lwjgl.system.JNI.callPV(r0, r1, r2, r3)
            return
    }

    public static void glTexEnvfv(@org.lwjgl.system.NativeType("GLenum") int r6, @org.lwjgl.system.NativeType("GLenum") int r7, @org.lwjgl.system.NativeType("GLfloat const *") float[] r8) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glTexEnvfv
            r9 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L17
            r0 = r9
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r8
            r1 = 4
            org.lwjgl.system.Checks.check(r0, r1)
        L17:
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            org.lwjgl.system.JNI.callPV(r0, r1, r2, r3)
            return
    }

    public static void glTexGeniv(@org.lwjgl.system.NativeType("GLenum") int r6, @org.lwjgl.system.NativeType("GLenum") int r7, @org.lwjgl.system.NativeType("GLint const *") int[] r8) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glTexGeniv
            r9 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L17
            r0 = r9
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r8
            r1 = 4
            org.lwjgl.system.Checks.check(r0, r1)
        L17:
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            org.lwjgl.system.JNI.callPV(r0, r1, r2, r3)
            return
    }

    public static void glTexGenfv(@org.lwjgl.system.NativeType("GLenum") int r6, @org.lwjgl.system.NativeType("GLenum") int r7, @org.lwjgl.system.NativeType("GLfloat const *") float[] r8) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glTexGenfv
            r9 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L17
            r0 = r9
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r8
            r1 = 4
            org.lwjgl.system.Checks.check(r0, r1)
        L17:
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            org.lwjgl.system.JNI.callPV(r0, r1, r2, r3)
            return
    }

    public static void glTexGendv(@org.lwjgl.system.NativeType("GLenum") int r6, @org.lwjgl.system.NativeType("GLenum") int r7, @org.lwjgl.system.NativeType("GLdouble const *") double[] r8) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glTexGendv
            r9 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L17
            r0 = r9
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r8
            r1 = 4
            org.lwjgl.system.Checks.check(r0, r1)
        L17:
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            org.lwjgl.system.JNI.callPV(r0, r1, r2, r3)
            return
    }

    public static void glTexImage1D(@org.lwjgl.system.NativeType("GLenum") int r9, @org.lwjgl.system.NativeType("GLint") int r10, @org.lwjgl.system.NativeType("GLint") int r11, @org.lwjgl.system.NativeType("GLsizei") int r12, @org.lwjgl.system.NativeType("GLint") int r13, @org.lwjgl.system.NativeType("GLenum") int r14, @org.lwjgl.system.NativeType("GLenum") int r15, @javax.annotation.Nullable @org.lwjgl.system.NativeType("void const *") short[] r16) {
            r0 = r9
            r1 = r10
            r2 = r11
            r3 = r12
            r4 = r13
            r5 = r14
            r6 = r15
            r7 = r16
            org.lwjgl.opengl.GL11C.glTexImage1D(r0, r1, r2, r3, r4, r5, r6, r7)
            return
    }

    public static void glTexImage1D(@org.lwjgl.system.NativeType("GLenum") int r9, @org.lwjgl.system.NativeType("GLint") int r10, @org.lwjgl.system.NativeType("GLint") int r11, @org.lwjgl.system.NativeType("GLsizei") int r12, @org.lwjgl.system.NativeType("GLint") int r13, @org.lwjgl.system.NativeType("GLenum") int r14, @org.lwjgl.system.NativeType("GLenum") int r15, @javax.annotation.Nullable @org.lwjgl.system.NativeType("void const *") int[] r16) {
            r0 = r9
            r1 = r10
            r2 = r11
            r3 = r12
            r4 = r13
            r5 = r14
            r6 = r15
            r7 = r16
            org.lwjgl.opengl.GL11C.glTexImage1D(r0, r1, r2, r3, r4, r5, r6, r7)
            return
    }

    public static void glTexImage1D(@org.lwjgl.system.NativeType("GLenum") int r9, @org.lwjgl.system.NativeType("GLint") int r10, @org.lwjgl.system.NativeType("GLint") int r11, @org.lwjgl.system.NativeType("GLsizei") int r12, @org.lwjgl.system.NativeType("GLint") int r13, @org.lwjgl.system.NativeType("GLenum") int r14, @org.lwjgl.system.NativeType("GLenum") int r15, @javax.annotation.Nullable @org.lwjgl.system.NativeType("void const *") float[] r16) {
            r0 = r9
            r1 = r10
            r2 = r11
            r3 = r12
            r4 = r13
            r5 = r14
            r6 = r15
            r7 = r16
            org.lwjgl.opengl.GL11C.glTexImage1D(r0, r1, r2, r3, r4, r5, r6, r7)
            return
    }

    public static void glTexImage1D(@org.lwjgl.system.NativeType("GLenum") int r9, @org.lwjgl.system.NativeType("GLint") int r10, @org.lwjgl.system.NativeType("GLint") int r11, @org.lwjgl.system.NativeType("GLsizei") int r12, @org.lwjgl.system.NativeType("GLint") int r13, @org.lwjgl.system.NativeType("GLenum") int r14, @org.lwjgl.system.NativeType("GLenum") int r15, @javax.annotation.Nullable @org.lwjgl.system.NativeType("void const *") double[] r16) {
            r0 = r9
            r1 = r10
            r2 = r11
            r3 = r12
            r4 = r13
            r5 = r14
            r6 = r15
            r7 = r16
            org.lwjgl.opengl.GL11C.glTexImage1D(r0, r1, r2, r3, r4, r5, r6, r7)
            return
    }

    public static void glTexImage2D(@org.lwjgl.system.NativeType("GLenum") int r10, @org.lwjgl.system.NativeType("GLint") int r11, @org.lwjgl.system.NativeType("GLint") int r12, @org.lwjgl.system.NativeType("GLsizei") int r13, @org.lwjgl.system.NativeType("GLsizei") int r14, @org.lwjgl.system.NativeType("GLint") int r15, @org.lwjgl.system.NativeType("GLenum") int r16, @org.lwjgl.system.NativeType("GLenum") int r17, @javax.annotation.Nullable @org.lwjgl.system.NativeType("void const *") short[] r18) {
            r0 = r10
            r1 = r11
            r2 = r12
            r3 = r13
            r4 = r14
            r5 = r15
            r6 = r16
            r7 = r17
            r8 = r18
            org.lwjgl.opengl.GL11C.glTexImage2D(r0, r1, r2, r3, r4, r5, r6, r7, r8)
            return
    }

    public static void glTexImage2D(@org.lwjgl.system.NativeType("GLenum") int r10, @org.lwjgl.system.NativeType("GLint") int r11, @org.lwjgl.system.NativeType("GLint") int r12, @org.lwjgl.system.NativeType("GLsizei") int r13, @org.lwjgl.system.NativeType("GLsizei") int r14, @org.lwjgl.system.NativeType("GLint") int r15, @org.lwjgl.system.NativeType("GLenum") int r16, @org.lwjgl.system.NativeType("GLenum") int r17, @javax.annotation.Nullable @org.lwjgl.system.NativeType("void const *") int[] r18) {
            r0 = r10
            r1 = r11
            r2 = r12
            r3 = r13
            r4 = r14
            r5 = r15
            r6 = r16
            r7 = r17
            r8 = r18
            org.lwjgl.opengl.GL11C.glTexImage2D(r0, r1, r2, r3, r4, r5, r6, r7, r8)
            return
    }

    public static void glTexImage2D(@org.lwjgl.system.NativeType("GLenum") int r10, @org.lwjgl.system.NativeType("GLint") int r11, @org.lwjgl.system.NativeType("GLint") int r12, @org.lwjgl.system.NativeType("GLsizei") int r13, @org.lwjgl.system.NativeType("GLsizei") int r14, @org.lwjgl.system.NativeType("GLint") int r15, @org.lwjgl.system.NativeType("GLenum") int r16, @org.lwjgl.system.NativeType("GLenum") int r17, @javax.annotation.Nullable @org.lwjgl.system.NativeType("void const *") float[] r18) {
            r0 = r10
            r1 = r11
            r2 = r12
            r3 = r13
            r4 = r14
            r5 = r15
            r6 = r16
            r7 = r17
            r8 = r18
            org.lwjgl.opengl.GL11C.glTexImage2D(r0, r1, r2, r3, r4, r5, r6, r7, r8)
            return
    }

    public static void glTexImage2D(@org.lwjgl.system.NativeType("GLenum") int r10, @org.lwjgl.system.NativeType("GLint") int r11, @org.lwjgl.system.NativeType("GLint") int r12, @org.lwjgl.system.NativeType("GLsizei") int r13, @org.lwjgl.system.NativeType("GLsizei") int r14, @org.lwjgl.system.NativeType("GLint") int r15, @org.lwjgl.system.NativeType("GLenum") int r16, @org.lwjgl.system.NativeType("GLenum") int r17, @javax.annotation.Nullable @org.lwjgl.system.NativeType("void const *") double[] r18) {
            r0 = r10
            r1 = r11
            r2 = r12
            r3 = r13
            r4 = r14
            r5 = r15
            r6 = r16
            r7 = r17
            r8 = r18
            org.lwjgl.opengl.GL11C.glTexImage2D(r0, r1, r2, r3, r4, r5, r6, r7, r8)
            return
    }

    public static void glTexParameteriv(@org.lwjgl.system.NativeType("GLenum") int r4, @org.lwjgl.system.NativeType("GLenum") int r5, @org.lwjgl.system.NativeType("GLint const *") int[] r6) {
            r0 = r4
            r1 = r5
            r2 = r6
            org.lwjgl.opengl.GL11C.glTexParameteriv(r0, r1, r2)
            return
    }

    public static void glTexParameterfv(@org.lwjgl.system.NativeType("GLenum") int r4, @org.lwjgl.system.NativeType("GLenum") int r5, @org.lwjgl.system.NativeType("GLfloat const *") float[] r6) {
            r0 = r4
            r1 = r5
            r2 = r6
            org.lwjgl.opengl.GL11C.glTexParameterfv(r0, r1, r2)
            return
    }

    public static void glTexSubImage1D(@org.lwjgl.system.NativeType("GLenum") int r8, @org.lwjgl.system.NativeType("GLint") int r9, @org.lwjgl.system.NativeType("GLint") int r10, @org.lwjgl.system.NativeType("GLsizei") int r11, @org.lwjgl.system.NativeType("GLenum") int r12, @org.lwjgl.system.NativeType("GLenum") int r13, @org.lwjgl.system.NativeType("void const *") short[] r14) {
            r0 = r8
            r1 = r9
            r2 = r10
            r3 = r11
            r4 = r12
            r5 = r13
            r6 = r14
            org.lwjgl.opengl.GL11C.glTexSubImage1D(r0, r1, r2, r3, r4, r5, r6)
            return
    }

    public static void glTexSubImage1D(@org.lwjgl.system.NativeType("GLenum") int r8, @org.lwjgl.system.NativeType("GLint") int r9, @org.lwjgl.system.NativeType("GLint") int r10, @org.lwjgl.system.NativeType("GLsizei") int r11, @org.lwjgl.system.NativeType("GLenum") int r12, @org.lwjgl.system.NativeType("GLenum") int r13, @org.lwjgl.system.NativeType("void const *") int[] r14) {
            r0 = r8
            r1 = r9
            r2 = r10
            r3 = r11
            r4 = r12
            r5 = r13
            r6 = r14
            org.lwjgl.opengl.GL11C.glTexSubImage1D(r0, r1, r2, r3, r4, r5, r6)
            return
    }

    public static void glTexSubImage1D(@org.lwjgl.system.NativeType("GLenum") int r8, @org.lwjgl.system.NativeType("GLint") int r9, @org.lwjgl.system.NativeType("GLint") int r10, @org.lwjgl.system.NativeType("GLsizei") int r11, @org.lwjgl.system.NativeType("GLenum") int r12, @org.lwjgl.system.NativeType("GLenum") int r13, @org.lwjgl.system.NativeType("void const *") float[] r14) {
            r0 = r8
            r1 = r9
            r2 = r10
            r3 = r11
            r4 = r12
            r5 = r13
            r6 = r14
            org.lwjgl.opengl.GL11C.glTexSubImage1D(r0, r1, r2, r3, r4, r5, r6)
            return
    }

    public static void glTexSubImage1D(@org.lwjgl.system.NativeType("GLenum") int r8, @org.lwjgl.system.NativeType("GLint") int r9, @org.lwjgl.system.NativeType("GLint") int r10, @org.lwjgl.system.NativeType("GLsizei") int r11, @org.lwjgl.system.NativeType("GLenum") int r12, @org.lwjgl.system.NativeType("GLenum") int r13, @org.lwjgl.system.NativeType("void const *") double[] r14) {
            r0 = r8
            r1 = r9
            r2 = r10
            r3 = r11
            r4 = r12
            r5 = r13
            r6 = r14
            org.lwjgl.opengl.GL11C.glTexSubImage1D(r0, r1, r2, r3, r4, r5, r6)
            return
    }

    public static void glTexSubImage2D(@org.lwjgl.system.NativeType("GLenum") int r10, @org.lwjgl.system.NativeType("GLint") int r11, @org.lwjgl.system.NativeType("GLint") int r12, @org.lwjgl.system.NativeType("GLint") int r13, @org.lwjgl.system.NativeType("GLsizei") int r14, @org.lwjgl.system.NativeType("GLsizei") int r15, @org.lwjgl.system.NativeType("GLenum") int r16, @org.lwjgl.system.NativeType("GLenum") int r17, @org.lwjgl.system.NativeType("void const *") short[] r18) {
            r0 = r10
            r1 = r11
            r2 = r12
            r3 = r13
            r4 = r14
            r5 = r15
            r6 = r16
            r7 = r17
            r8 = r18
            org.lwjgl.opengl.GL11C.glTexSubImage2D(r0, r1, r2, r3, r4, r5, r6, r7, r8)
            return
    }

    public static void glTexSubImage2D(@org.lwjgl.system.NativeType("GLenum") int r10, @org.lwjgl.system.NativeType("GLint") int r11, @org.lwjgl.system.NativeType("GLint") int r12, @org.lwjgl.system.NativeType("GLint") int r13, @org.lwjgl.system.NativeType("GLsizei") int r14, @org.lwjgl.system.NativeType("GLsizei") int r15, @org.lwjgl.system.NativeType("GLenum") int r16, @org.lwjgl.system.NativeType("GLenum") int r17, @org.lwjgl.system.NativeType("void const *") int[] r18) {
            r0 = r10
            r1 = r11
            r2 = r12
            r3 = r13
            r4 = r14
            r5 = r15
            r6 = r16
            r7 = r17
            r8 = r18
            org.lwjgl.opengl.GL11C.glTexSubImage2D(r0, r1, r2, r3, r4, r5, r6, r7, r8)
            return
    }

    public static void glTexSubImage2D(@org.lwjgl.system.NativeType("GLenum") int r10, @org.lwjgl.system.NativeType("GLint") int r11, @org.lwjgl.system.NativeType("GLint") int r12, @org.lwjgl.system.NativeType("GLint") int r13, @org.lwjgl.system.NativeType("GLsizei") int r14, @org.lwjgl.system.NativeType("GLsizei") int r15, @org.lwjgl.system.NativeType("GLenum") int r16, @org.lwjgl.system.NativeType("GLenum") int r17, @org.lwjgl.system.NativeType("void const *") float[] r18) {
            r0 = r10
            r1 = r11
            r2 = r12
            r3 = r13
            r4 = r14
            r5 = r15
            r6 = r16
            r7 = r17
            r8 = r18
            org.lwjgl.opengl.GL11C.glTexSubImage2D(r0, r1, r2, r3, r4, r5, r6, r7, r8)
            return
    }

    public static void glTexSubImage2D(@org.lwjgl.system.NativeType("GLenum") int r10, @org.lwjgl.system.NativeType("GLint") int r11, @org.lwjgl.system.NativeType("GLint") int r12, @org.lwjgl.system.NativeType("GLint") int r13, @org.lwjgl.system.NativeType("GLsizei") int r14, @org.lwjgl.system.NativeType("GLsizei") int r15, @org.lwjgl.system.NativeType("GLenum") int r16, @org.lwjgl.system.NativeType("GLenum") int r17, @org.lwjgl.system.NativeType("void const *") double[] r18) {
            r0 = r10
            r1 = r11
            r2 = r12
            r3 = r13
            r4 = r14
            r5 = r15
            r6 = r16
            r7 = r17
            r8 = r18
            org.lwjgl.opengl.GL11C.glTexSubImage2D(r0, r1, r2, r3, r4, r5, r6, r7, r8)
            return
    }

    public static void glVertex2fv(@org.lwjgl.system.NativeType("GLfloat const *") float[] r4) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glVertex2fv
            r5 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L17
            r0 = r5
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r4
            r1 = 2
            org.lwjgl.system.Checks.check(r0, r1)
        L17:
            r0 = r4
            r1 = r5
            org.lwjgl.system.JNI.callPV(r0, r1)
            return
    }

    public static void glVertex2sv(@org.lwjgl.system.NativeType("GLshort const *") short[] r4) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glVertex2sv
            r5 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L17
            r0 = r5
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r4
            r1 = 2
            org.lwjgl.system.Checks.check(r0, r1)
        L17:
            r0 = r4
            r1 = r5
            org.lwjgl.system.JNI.callPV(r0, r1)
            return
    }

    public static void glVertex2iv(@org.lwjgl.system.NativeType("GLint const *") int[] r4) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glVertex2iv
            r5 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L17
            r0 = r5
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r4
            r1 = 2
            org.lwjgl.system.Checks.check(r0, r1)
        L17:
            r0 = r4
            r1 = r5
            org.lwjgl.system.JNI.callPV(r0, r1)
            return
    }

    public static void glVertex2dv(@org.lwjgl.system.NativeType("GLdouble const *") double[] r4) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glVertex2dv
            r5 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L17
            r0 = r5
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r4
            r1 = 2
            org.lwjgl.system.Checks.check(r0, r1)
        L17:
            r0 = r4
            r1 = r5
            org.lwjgl.system.JNI.callPV(r0, r1)
            return
    }

    public static void glVertex3fv(@org.lwjgl.system.NativeType("GLfloat const *") float[] r4) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glVertex3fv
            r5 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L17
            r0 = r5
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r4
            r1 = 3
            org.lwjgl.system.Checks.check(r0, r1)
        L17:
            r0 = r4
            r1 = r5
            org.lwjgl.system.JNI.callPV(r0, r1)
            return
    }

    public static void glVertex3sv(@org.lwjgl.system.NativeType("GLshort const *") short[] r4) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glVertex3sv
            r5 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L17
            r0 = r5
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r4
            r1 = 3
            org.lwjgl.system.Checks.check(r0, r1)
        L17:
            r0 = r4
            r1 = r5
            org.lwjgl.system.JNI.callPV(r0, r1)
            return
    }

    public static void glVertex3iv(@org.lwjgl.system.NativeType("GLint const *") int[] r4) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glVertex3iv
            r5 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L17
            r0 = r5
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r4
            r1 = 3
            org.lwjgl.system.Checks.check(r0, r1)
        L17:
            r0 = r4
            r1 = r5
            org.lwjgl.system.JNI.callPV(r0, r1)
            return
    }

    public static void glVertex3dv(@org.lwjgl.system.NativeType("GLdouble const *") double[] r4) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glVertex3dv
            r5 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L17
            r0 = r5
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r4
            r1 = 3
            org.lwjgl.system.Checks.check(r0, r1)
        L17:
            r0 = r4
            r1 = r5
            org.lwjgl.system.JNI.callPV(r0, r1)
            return
    }

    public static void glVertex4fv(@org.lwjgl.system.NativeType("GLfloat const *") float[] r4) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glVertex4fv
            r5 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L17
            r0 = r5
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r4
            r1 = 4
            org.lwjgl.system.Checks.check(r0, r1)
        L17:
            r0 = r4
            r1 = r5
            org.lwjgl.system.JNI.callPV(r0, r1)
            return
    }

    public static void glVertex4sv(@org.lwjgl.system.NativeType("GLshort const *") short[] r4) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glVertex4sv
            r5 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L17
            r0 = r5
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r4
            r1 = 4
            org.lwjgl.system.Checks.check(r0, r1)
        L17:
            r0 = r4
            r1 = r5
            org.lwjgl.system.JNI.callPV(r0, r1)
            return
    }

    public static void glVertex4iv(@org.lwjgl.system.NativeType("GLint const *") int[] r4) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glVertex4iv
            r5 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L17
            r0 = r5
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r4
            r1 = 4
            org.lwjgl.system.Checks.check(r0, r1)
        L17:
            r0 = r4
            r1 = r5
            org.lwjgl.system.JNI.callPV(r0, r1)
            return
    }

    public static void glVertex4dv(@org.lwjgl.system.NativeType("GLdouble const *") double[] r4) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glVertex4dv
            r5 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L17
            r0 = r5
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r4
            r1 = 4
            org.lwjgl.system.Checks.check(r0, r1)
        L17:
            r0 = r4
            r1 = r5
            org.lwjgl.system.JNI.callPV(r0, r1)
            return
    }

    static {
            org.lwjgl.opengl.GL.initialize()
            return
    }
}
