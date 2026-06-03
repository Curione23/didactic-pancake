package org.lwjgl.util.freetype;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/util/freetype/FreeType.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/util/freetype/FreeType.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/util/freetype/FreeType.class */
public class FreeType {
    private static final org.lwjgl.system.SharedLibrary FREETYPE = null;
    public static final int FT_ENCODING_NONE = 0;
    public static final int FT_ENCODING_MS_SYMBOL = 0;
    public static final int FT_ENCODING_UNICODE = 0;
    public static final int FT_ENCODING_SJIS = 0;
    public static final int FT_ENCODING_PRC = 0;
    public static final int FT_ENCODING_BIG5 = 0;
    public static final int FT_ENCODING_WANSUNG = 0;
    public static final int FT_ENCODING_JOHAB = 0;
    public static final int FT_ENCODING_GB2312 = 0;
    public static final int FT_ENCODING_MS_SJIS = 0;
    public static final int FT_ENCODING_MS_GB2312 = 0;
    public static final int FT_ENCODING_MS_BIG5 = 0;
    public static final int FT_ENCODING_MS_WANSUNG = 0;
    public static final int FT_ENCODING_MS_JOHAB = 0;
    public static final int FT_ENCODING_ADOBE_STANDARD = 0;
    public static final int FT_ENCODING_ADOBE_EXPERT = 0;
    public static final int FT_ENCODING_ADOBE_CUSTOM = 0;
    public static final int FT_ENCODING_ADOBE_LATIN_1 = 0;
    public static final int FT_ENCODING_OLD_LATIN_2 = 0;
    public static final int FT_ENCODING_APPLE_ROMAN = 0;
    public static final int FT_FACE_FLAG_SCALABLE = 1;
    public static final int FT_FACE_FLAG_FIXED_SIZES = 2;
    public static final int FT_FACE_FLAG_FIXED_WIDTH = 4;
    public static final int FT_FACE_FLAG_SFNT = 8;
    public static final int FT_FACE_FLAG_HORIZONTAL = 16;
    public static final int FT_FACE_FLAG_VERTICAL = 32;
    public static final int FT_FACE_FLAG_KERNING = 64;
    public static final int FT_FACE_FLAG_FAST_GLYPHS = 128;
    public static final int FT_FACE_FLAG_MULTIPLE_MASTERS = 256;
    public static final int FT_FACE_FLAG_GLYPH_NAMES = 512;
    public static final int FT_FACE_FLAG_EXTERNAL_STREAM = 1024;
    public static final int FT_FACE_FLAG_HINTER = 2048;
    public static final int FT_FACE_FLAG_CID_KEYED = 4096;
    public static final int FT_FACE_FLAG_TRICKY = 8192;
    public static final int FT_FACE_FLAG_COLOR = 16384;
    public static final int FT_FACE_FLAG_VARIATION = 32768;
    public static final int FT_FACE_FLAG_SVG = 65536;
    public static final int FT_FACE_FLAG_SBIX = 131072;
    public static final int FT_FACE_FLAG_SBIX_OVERLAY = 262144;
    public static final int FT_STYLE_FLAG_ITALIC = 1;
    public static final int FT_STYLE_FLAG_BOLD = 2;
    public static final int FT_OPEN_MEMORY = 1;
    public static final int FT_OPEN_STREAM = 2;
    public static final int FT_OPEN_PATHNAME = 4;
    public static final int FT_OPEN_DRIVER = 8;
    public static final int FT_OPEN_PARAMS = 16;
    public static final int FT_SIZE_REQUEST_TYPE_NOMINAL = 0;
    public static final int FT_SIZE_REQUEST_TYPE_REAL_DIM = 1;
    public static final int FT_SIZE_REQUEST_TYPE_BBOX = 2;
    public static final int FT_SIZE_REQUEST_TYPE_CELL = 3;
    public static final int FT_SIZE_REQUEST_TYPE_SCALES = 4;
    public static final int FT_SIZE_REQUEST_TYPE_MAX = 5;
    public static final int FT_LOAD_DEFAULT = 0;
    public static final int FT_LOAD_NO_SCALE = 1;
    public static final int FT_LOAD_NO_HINTING = 2;
    public static final int FT_LOAD_RENDER = 4;
    public static final int FT_LOAD_NO_BITMAP = 8;
    public static final int FT_LOAD_VERTICAL_LAYOUT = 16;
    public static final int FT_LOAD_FORCE_AUTOHINT = 32;
    public static final int FT_LOAD_CROP_BITMAP = 64;
    public static final int FT_LOAD_PEDANTIC = 128;
    public static final int FT_LOAD_IGNORE_GLOBAL_ADVANCE_WIDTH = 512;
    public static final int FT_LOAD_NO_RECURSE = 1024;
    public static final int FT_LOAD_IGNORE_TRANSFORM = 2048;
    public static final int FT_LOAD_MONOCHROME = 4096;
    public static final int FT_LOAD_LINEAR_DESIGN = 8192;
    public static final int FT_LOAD_SBITS_ONLY = 16384;
    public static final int FT_LOAD_NO_AUTOHINT = 32768;
    public static final int FT_LOAD_COLOR = 1048576;
    public static final int FT_LOAD_COMPUTE_METRICS = 2097152;
    public static final int FT_LOAD_BITMAP_METRICS_ONLY = 4194304;
    public static final int FT_LOAD_NO_SVG = 16777216;
    public static final int FT_LOAD_ADVANCE_ONLY = 256;
    public static final int FT_LOAD_SVG_ONLY = 8388608;
    public static final int FT_RENDER_MODE_NORMAL = 0;
    public static final int FT_RENDER_MODE_LIGHT = 1;
    public static final int FT_RENDER_MODE_MONO = 2;
    public static final int FT_RENDER_MODE_LCD = 3;
    public static final int FT_RENDER_MODE_LCD_V = 4;
    public static final int FT_RENDER_MODE_SDF = 5;
    public static final int FT_RENDER_MODE_MAX = 6;
    public static final int FT_FT_LOAD_TARGET_NORMAL = 0;
    public static final int FT_FT_LOAD_TARGET_LIGHT = 0;
    public static final int FT_FT_LOAD_TARGET_MONO = 0;
    public static final int FT_FT_LOAD_TARGET_LCD = 0;
    public static final int FT_FT_LOAD_TARGET_LCD_V = 0;
    public static final int FT_KERNING_DEFAULT = 0;
    public static final int FT_KERNING_UNFITTED = 1;
    public static final int FT_KERNING_UNSCALED = 2;
    public static final int FT_SUBGLYPH_FLAG_ARGS_ARE_WORDS = 1;
    public static final int FT_SUBGLYPH_FLAG_ARGS_ARE_XY_VALUES = 2;
    public static final int FT_SUBGLYPH_FLAG_ROUND_XY_TO_GRID = 4;
    public static final int FT_SUBGLYPH_FLAG_SCALE = 8;
    public static final int FT_SUBGLYPH_FLAG_XY_SCALE = 64;
    public static final int FT_SUBGLYPH_FLAG_2X2 = 128;
    public static final int FT_SUBGLYPH_FLAG_USE_MY_METRICS = 512;
    public static final int FT_FSTYPE_INSTALLABLE_EMBEDDING = 0;
    public static final int FT_FSTYPE_RESTRICTED_LICENSE_EMBEDDING = 2;
    public static final int FT_FSTYPE_PREVIEW_AND_PRINT_EMBEDDING = 4;
    public static final int FT_FSTYPE_EDITABLE_EMBEDDING = 8;
    public static final int FT_FSTYPE_NO_SUBSETTING = 256;
    public static final int FT_FSTYPE_BITMAP_EMBEDDING_ONLY = 512;
    public static final int FREETYPE_MAJOR = 2;
    public static final int FREETYPE_MINOR = 13;
    public static final int FREETYPE_PATCH = 2;
    public static final int FT_ADVANCE_FLAG_FAST_ONLY = 536870912;
    public static final int BDF_PROPERTY_TYPE_NONE = 0;
    public static final int BDF_PROPERTY_TYPE_ATOM = 1;
    public static final int BDF_PROPERTY_TYPE_INTEGER = 2;
    public static final int BDF_PROPERTY_TYPE_CARDINAL = 3;
    public static final int FT_PALETTE_FOR_LIGHT_BACKGROUND = 1;
    public static final int FT_PALETTE_FOR_DARK_BACKGROUND = 2;
    public static final int FT_COLR_PAINTFORMAT_COLR_LAYERS = 1;
    public static final int FT_COLR_PAINTFORMAT_SOLID = 2;
    public static final int FT_COLR_PAINTFORMAT_LINEAR_GRADIENT = 4;
    public static final int FT_COLR_PAINTFORMAT_RADIAL_GRADIENT = 6;
    public static final int FT_COLR_PAINTFORMAT_SWEEP_GRADIENT = 8;
    public static final int FT_COLR_PAINTFORMAT_GLYPH = 10;
    public static final int FT_COLR_PAINTFORMAT_COLR_GLYPH = 11;
    public static final int FT_COLR_PAINTFORMAT_TRANSFORM = 12;
    public static final int FT_COLR_PAINTFORMAT_TRANSLATE = 14;
    public static final int FT_COLR_PAINTFORMAT_SCALE = 16;
    public static final int FT_COLR_PAINTFORMAT_ROTATE = 24;
    public static final int FT_COLR_PAINTFORMAT_SKEW = 28;
    public static final int FT_COLR_PAINTFORMAT_COMPOSITE = 32;
    public static final int FT_COLR_PAINT_FORMAT_MAX = 33;
    public static final int FT_COLR_PAINTFORMAT_UNSUPPORTED = 255;
    public static final int FT_COLR_PAINT_EXTEND_PAD = 0;
    public static final int FT_COLR_PAINT_EXTEND_REPEAT = 1;
    public static final int FT_COLR_PAINT_EXTEND_REFLECT = 2;
    public static final int FT_COLR_COMPOSITE_CLEAR = 0;
    public static final int FT_COLR_COMPOSITE_SRC = 1;
    public static final int FT_COLR_COMPOSITE_DEST = 2;
    public static final int FT_COLR_COMPOSITE_SRC_OVER = 3;
    public static final int FT_COLR_COMPOSITE_DEST_OVER = 4;
    public static final int FT_COLR_COMPOSITE_SRC_IN = 5;
    public static final int FT_COLR_COMPOSITE_DEST_IN = 6;
    public static final int FT_COLR_COMPOSITE_SRC_OUT = 7;
    public static final int FT_COLR_COMPOSITE_DEST_OUT = 8;
    public static final int FT_COLR_COMPOSITE_SRC_ATOP = 9;
    public static final int FT_COLR_COMPOSITE_DEST_ATOP = 10;
    public static final int FT_COLR_COMPOSITE_XOR = 11;
    public static final int FT_COLR_COMPOSITE_PLUS = 12;
    public static final int FT_COLR_COMPOSITE_SCREEN = 13;
    public static final int FT_COLR_COMPOSITE_OVERLAY = 14;
    public static final int FT_COLR_COMPOSITE_DARKEN = 15;
    public static final int FT_COLR_COMPOSITE_LIGHTEN = 16;
    public static final int FT_COLR_COMPOSITE_COLOR_DODGE = 17;
    public static final int FT_COLR_COMPOSITE_COLOR_BURN = 18;
    public static final int FT_COLR_COMPOSITE_HARD_LIGHT = 19;
    public static final int FT_COLR_COMPOSITE_SOFT_LIGHT = 20;
    public static final int FT_COLR_COMPOSITE_DIFFERENCE = 21;
    public static final int FT_COLR_COMPOSITE_EXCLUSION = 22;
    public static final int FT_COLR_COMPOSITE_MULTIPLY = 23;
    public static final int FT_COLR_COMPOSITE_HSL_HUE = 24;
    public static final int FT_COLR_COMPOSITE_HSL_SATURATION = 25;
    public static final int FT_COLR_COMPOSITE_HSL_COLOR = 26;
    public static final int FT_COLR_COMPOSITE_HSL_LUMINOSITY = 27;
    public static final int FT_COLR_COMPOSITE_MAX = 28;
    public static final int FT_COLOR_INCLUDE_ROOT_TRANSFORM = 0;
    public static final int FT_COLOR_NO_ROOT_TRANSFORM = 1;
    public static final int FT_COLOR_ROOT_TRANSFORM_MAX = 2;
    public static final int FT_HINTING_FREETYPE = 0;
    public static final int FT_HINTING_ADOBE = 1;
    public static final int TT_INTERPRETER_VERSION_35 = 35;
    public static final int TT_INTERPRETER_VERSION_38 = 38;
    public static final int TT_INTERPRETER_VERSION_40 = 40;
    public static final int FT_AUTOHINTER_SCRIPT_NONE = 0;
    public static final int FT_AUTOHINTER_SCRIPT_LATIN = 1;
    public static final int FT_AUTOHINTER_SCRIPT_CJK = 2;
    public static final int FT_AUTOHINTER_SCRIPT_INDIC = 3;
    public static final int FT_Err_Ok = 0;
    public static final int FT_Err_Cannot_Open_Resource = 1;
    public static final int FT_Err_Unknown_File_Format = 2;
    public static final int FT_Err_Invalid_File_Format = 3;
    public static final int FT_Err_Invalid_Version = 4;
    public static final int FT_Err_Lower_Module_Version = 5;
    public static final int FT_Err_Invalid_Argument = 6;
    public static final int FT_Err_Unimplemented_Feature = 7;
    public static final int FT_Err_Invalid_Table = 8;
    public static final int FT_Err_Invalid_Offset = 9;
    public static final int FT_Err_Array_Too_Large = 10;
    public static final int FT_Err_Missing_Module = 11;
    public static final int FT_Err_Missing_Property = 12;
    public static final int FT_Err_Invalid_Glyph_Index = 16;
    public static final int FT_Err_Invalid_Character_Code = 17;
    public static final int FT_Err_Invalid_Glyph_Format = 18;
    public static final int FT_Err_Cannot_Render_Glyph = 19;
    public static final int FT_Err_Invalid_Outline = 20;
    public static final int FT_Err_Invalid_Composite = 21;
    public static final int FT_Err_Too_Many_Hints = 22;
    public static final int FT_Err_Invalid_Pixel_Size = 23;
    public static final int FT_Err_Invalid_SVG_Document = 24;
    public static final int FT_Err_Invalid_Handle = 32;
    public static final int FT_Err_Invalid_Library_Handle = 33;
    public static final int FT_Err_Invalid_Driver_Handle = 34;
    public static final int FT_Err_Invalid_Face_Handle = 35;
    public static final int FT_Err_Invalid_Size_Handle = 36;
    public static final int FT_Err_Invalid_Slot_Handle = 37;
    public static final int FT_Err_Invalid_CharMap_Handle = 38;
    public static final int FT_Err_Invalid_Cache_Handle = 39;
    public static final int FT_Err_Invalid_Stream_Handle = 40;
    public static final int FT_Err_Too_Many_Drivers = 48;
    public static final int FT_Err_Too_Many_Extensions = 49;
    public static final int FT_Err_Out_Of_Memory = 64;
    public static final int FT_Err_Unlisted_Object = 65;
    public static final int FT_Err_Cannot_Open_Stream = 81;
    public static final int FT_Err_Invalid_Stream_Seek = 82;
    public static final int FT_Err_Invalid_Stream_Skip = 83;
    public static final int FT_Err_Invalid_Stream_Read = 84;
    public static final int FT_Err_Invalid_Stream_Operation = 85;
    public static final int FT_Err_Invalid_Frame_Operation = 86;
    public static final int FT_Err_Nested_Frame_Access = 87;
    public static final int FT_Err_Invalid_Frame_Read = 88;
    public static final int FT_Err_Raster_Uninitialized = 96;
    public static final int FT_Err_Raster_Corrupted = 97;
    public static final int FT_Err_Raster_Overflow = 98;
    public static final int FT_Err_Raster_Negative_Height = 99;
    public static final int FT_Err_Too_Many_Caches = 112;
    public static final int FT_Err_Invalid_Opcode = 128;
    public static final int FT_Err_Too_Few_Arguments = 129;
    public static final int FT_Err_Stack_Overflow = 130;
    public static final int FT_Err_Code_Overflow = 131;
    public static final int FT_Err_Bad_Argument = 132;
    public static final int FT_Err_Divide_By_Zero = 133;
    public static final int FT_Err_Invalid_Reference = 134;
    public static final int FT_Err_Debug_OpCode = 135;
    public static final int FT_Err_ENDF_In_Exec_Stream = 136;
    public static final int FT_Err_Nested_DEFS = 137;
    public static final int FT_Err_Invalid_CodeRange = 138;
    public static final int FT_Err_Execution_Too_Long = 139;
    public static final int FT_Err_Too_Many_Function_Defs = 140;
    public static final int FT_Err_Too_Many_Instruction_Defs = 141;
    public static final int FT_Err_Table_Missing = 142;
    public static final int FT_Err_Horiz_Header_Missing = 143;
    public static final int FT_Err_Locations_Missing = 144;
    public static final int FT_Err_Name_Table_Missing = 145;
    public static final int FT_Err_CMap_Table_Missing = 146;
    public static final int FT_Err_Hmtx_Table_Missing = 147;
    public static final int FT_Err_Post_Table_Missing = 148;
    public static final int FT_Err_Invalid_Horiz_Metrics = 149;
    public static final int FT_Err_Invalid_CharMap_Format = 150;
    public static final int FT_Err_Invalid_PPem = 151;
    public static final int FT_Err_Invalid_Vert_Metrics = 152;
    public static final int FT_Err_Could_Not_Find_Context = 153;
    public static final int FT_Err_Invalid_Post_Table_Format = 154;
    public static final int FT_Err_Invalid_Post_Table = 155;
    public static final int FT_Err_DEF_In_Glyf_Bytecode = 156;
    public static final int FT_Err_Missing_Bitmap = 157;
    public static final int FT_Err_Missing_SVG_Hooks = 158;
    public static final int FT_Err_Syntax_Error = 160;
    public static final int FT_Err_Stack_Underflow = 161;
    public static final int FT_Err_Ignore = 162;
    public static final int FT_Err_No_Unicode_Glyph_Name = 163;
    public static final int FT_Err_Glyph_Too_Big = 164;
    public static final int FT_Err_Missing_Startfont_Field = 176;
    public static final int FT_Err_Missing_Font_Field = 177;
    public static final int FT_Err_Missing_Size_Field = 178;
    public static final int FT_Err_Missing_Fontboundingbox_Field = 179;
    public static final int FT_Err_Missing_Chars_Field = 180;
    public static final int FT_Err_Missing_Startchar_Field = 181;
    public static final int FT_Err_Missing_Encoding_Field = 182;
    public static final int FT_Err_Missing_Bbx_Field = 183;
    public static final int FT_Err_Bbx_Too_Big = 184;
    public static final int FT_Err_Corrupted_Font_Header = 185;
    public static final int FT_Err_Corrupted_Font_Glyphs = 186;
    public static final int FT_Err_Max = 187;
    public static final int FT_GASP_NO_TABLE = -1;
    public static final int FT_GASP_DO_GRIDFIT = 1;
    public static final int FT_GASP_DO_GRAY = 2;
    public static final int FT_GASP_SYMMETRIC_GRIDFIT = 4;
    public static final int FT_GASP_SYMMETRIC_SMOOTHING = 8;
    public static final int FT_GLYPH_BBOX_UNSCALED = 0;
    public static final int FT_GLYPH_BBOX_SUBPIXELS = 0;
    public static final int FT_GLYPH_BBOX_GRIDFIT = 1;
    public static final int FT_GLYPH_BBOX_TRUNCATE = 2;
    public static final int FT_GLYPH_BBOX_PIXELS = 3;
    public static final int FT_VALIDATE_feat_INDEX = 0;
    public static final int FT_VALIDATE_mort_INDEX = 1;
    public static final int FT_VALIDATE_morx_INDEX = 2;
    public static final int FT_VALIDATE_bsln_INDEX = 3;
    public static final int FT_VALIDATE_just_INDEX = 4;
    public static final int FT_VALIDATE_kern_INDEX = 5;
    public static final int FT_VALIDATE_opbd_INDEX = 6;
    public static final int FT_VALIDATE_trak_INDEX = 7;
    public static final int FT_VALIDATE_prop_INDEX = 8;
    public static final int FT_VALIDATE_lcar_INDEX = 9;
    public static final int FT_VALIDATE_GX_LAST_INDEX = 9;
    public static final int FT_VALIDATE_GX_LENGTH = 10;
    public static final int FT_VALIDATE_GX_START = 16384;
    public static final int FT_VALIDATE_feat = 16384;
    public static final int FT_VALIDATE_mort = 32768;
    public static final int FT_VALIDATE_morx = 65536;
    public static final int FT_VALIDATE_bsln = 131072;
    public static final int FT_VALIDATE_just = 262144;
    public static final int FT_VALIDATE_kern = 524288;
    public static final int FT_VALIDATE_opbd = 1048576;
    public static final int FT_VALIDATE_trak = 2097152;
    public static final int FT_VALIDATE_prop = 4194304;
    public static final int FT_VALIDATE_lcar = 8388608;
    public static final int FT_FT_VALIDATE_GX = 16760832;
    public static final int FT_VALIDATE_MS = 16384;
    public static final int FT_VALIDATE_APPLE = 32768;
    public static final int FT_VALIDATE_CKERN = 49152;
    public static final int FT_PIXEL_MODE_NONE = 0;
    public static final int FT_PIXEL_MODE_MONO = 1;
    public static final int FT_PIXEL_MODE_GRAY = 2;
    public static final int FT_PIXEL_MODE_GRAY2 = 3;
    public static final int FT_PIXEL_MODE_GRAY4 = 4;
    public static final int FT_PIXEL_MODE_LCD = 5;
    public static final int FT_PIXEL_MODE_LCD_V = 6;
    public static final int FT_PIXEL_MODE_BGRA = 7;
    public static final int FT_PIXEL_MODE_MAX = 8;
    public static final int FT_OUTLINE_CONTOURS_MAX = 65535;
    public static final int FT_OUTLINE_POINTS_MAX = 65535;
    public static final int FT_OUTLINE_NONE = 0;
    public static final int FT_OUTLINE_OWNER = 1;
    public static final int FT_OUTLINE_EVEN_ODD_FILL = 2;
    public static final int FT_OUTLINE_REVERSE_FILL = 4;
    public static final int FT_OUTLINE_IGNORE_DROPOUTS = 8;
    public static final int FT_OUTLINE_SMART_DROPOUTS = 16;
    public static final int FT_OUTLINE_INCLUDE_STUBS = 32;
    public static final int FT_OUTLINE_OVERLAP = 64;
    public static final int FT_OUTLINE_HIGH_PRECISION = 256;
    public static final int FT_OUTLINE_SINGLE_PASS = 512;
    public static final int FT_CURVE_TAG_ON = 1;
    public static final int FT_CURVE_TAG_CONIC = 0;
    public static final int FT_CURVE_TAG_CUBIC = 2;
    public static final int FT_CURVE_TAG_HAS_SCANMODE = 4;
    public static final int FT_CURVE_TAG_TOUCH_X = 8;
    public static final int FT_CURVE_TAG_TOUCH_Y = 16;
    public static final int FT_CURVE_TAG_TOUCH_BOTH = 24;
    public static final int FT_GLYPH_FORMAT_NONE = 0;
    public static final int FT_GLYPH_FORMAT_COMPOSITE = 0;
    public static final int FT_GLYPH_FORMAT_BITMAP = 0;
    public static final int FT_GLYPH_FORMAT_OUTLINE = 0;
    public static final int FT_GLYPH_FORMAT_PLOTTER = 0;
    public static final int FT_GLYPH_FORMAT_SVG = 0;
    public static final int FT_RASTER_FLAG_DEFAULT = 0;
    public static final int FT_RASTER_FLAG_AA = 1;
    public static final int FT_RASTER_FLAG_DIRECT = 2;
    public static final int FT_RASTER_FLAG_CLIP = 4;
    public static final int FT_RASTER_FLAG_SDF = 8;
    public static final int FT_LCD_FILTER_NONE = 0;
    public static final int FT_LCD_FILTER_DEFAULT = 1;
    public static final int FT_LCD_FILTER_LIGHT = 2;
    public static final int FT_LCD_FILTER_LEGACY1 = 3;
    public static final int FT_LCD_FILTER_LEGACY = 16;
    public static final int FT_LCD_FILTER_MAX = 17;
    public static final int FT_LCD_FILTER_FIVE_TAPS = 5;
    public static final int FT_VAR_AXIS_FLAG_HIDDEN = 1;
    public static final int FT_MODULE_FONT_DRIVER = 1;
    public static final int FT_MODULE_RENDERER = 2;
    public static final int FT_MODULE_HINTER = 4;
    public static final int FT_MODULE_STYLER = 8;
    public static final int FT_MODULE_DRIVER_SCALABLE = 256;
    public static final int FT_MODULE_DRIVER_NO_OUTLINES = 512;
    public static final int FT_MODULE_DRIVER_HAS_HINTER = 1024;
    public static final int FT_MODULE_DRIVER_HINTS_LIGHTLY = 2048;
    public static final int FT_DEBUG_HOOK_TRUETYPE = 0;
    public static final int FT_TRUETYPE_ENGINE_TYPE_NONE = 0;
    public static final int FT_TRUETYPE_ENGINE_TYPE_UNPATENTED = 1;
    public static final int FT_TRUETYPE_ENGINE_TYPE_PATENTED = 2;
    public static final int FT_Mod_Err_Base = 0;
    public static final int FT_Mod_Err_Autofit = 256;
    public static final int FT_Mod_Err_BDF = 512;
    public static final int FT_Mod_Err_Bzip2 = 768;
    public static final int FT_Mod_Err_Cache = 1024;
    public static final int FT_Mod_Err_CFF = 1280;
    public static final int FT_Mod_Err_CID = 1536;
    public static final int FT_Mod_Err_Gzip = 1792;
    public static final int FT_Mod_Err_LZW = 2048;
    public static final int FT_Mod_Err_OTvalid = 2304;
    public static final int FT_Mod_Err_PCF = 2560;
    public static final int FT_Mod_Err_PFR = 2816;
    public static final int FT_Mod_Err_PSaux = 3072;
    public static final int FT_Mod_Err_PShinter = 3328;
    public static final int FT_Mod_Err_PSnames = 3584;
    public static final int FT_Mod_Err_Raster = 3840;
    public static final int FT_Mod_Err_SFNT = 4096;
    public static final int FT_Mod_Err_Smooth = 4352;
    public static final int FT_Mod_Err_TrueType = 4608;
    public static final int FT_Mod_Err_Type1 = 4864;
    public static final int FT_Mod_Err_Type42 = 5120;
    public static final int FT_Mod_Err_Winfonts = 5376;
    public static final int FT_Mod_Err_GXvalid = 5632;
    public static final int FT_Mod_Err_Sdf = 5888;
    public static final int FT_Mod_Err_Max = 5889;
    public static final int FT_VALIDATE_BASE = 256;
    public static final int FT_VALIDATE_GDEF = 512;
    public static final int FT_VALIDATE_GPOS = 1024;
    public static final int FT_VALIDATE_GSUB = 2048;
    public static final int FT_VALIDATE_JSTF = 4096;
    public static final int FT_VALIDATE_MATH = 8192;
    public static final int FT_VALIDATE_OT = 16128;
    public static final int FT_ORIENTATION_TRUETYPE = 0;
    public static final int FT_ORIENTATION_POSTSCRIPT = 1;
    public static final int FT_ORIENTATION_FILL_RIGHT = 0;
    public static final int FT_ORIENTATION_FILL_LEFT = 1;
    public static final int FT_ORIENTATION_NONE = 2;
    public static final int FT_PARAM_TAG_IGNORE_TYPOGRAPHIC_FAMILY = 0;
    public static final int FT_PARAM_TAG_IGNORE_TYPOGRAPHIC_SUBFAMILY = 0;
    public static final int FT_PARAM_TAG_INCREMENTAL = 0;
    public static final int FT_PARAM_TAG_IGNORE_SBIX = 0;
    public static final int FT_PARAM_TAG_LCD_FILTER_WEIGHTS = 0;
    public static final int FT_PARAM_TAG_RANDOM_SEED = 0;
    public static final int FT_PARAM_TAG_STEM_DARKENING = 0;
    public static final int FT_PARAM_TAG_UNPATENTED_HINTING = 0;
    public static final int FT_STROKER_LINEJOIN_ROUND = 0;
    public static final int FT_STROKER_LINEJOIN_BEVEL = 1;
    public static final int FT_STROKER_LINEJOIN_MITER_VARIABLE = 2;
    public static final int FT_STROKER_LINEJOIN_MITER = 2;
    public static final int FT_STROKER_LINEJOIN_MITER_FIXED = 3;
    public static final int FT_STROKER_LINECAP_BUTT = 0;
    public static final int FT_STROKER_LINECAP_ROUND = 1;
    public static final int FT_STROKER_LINECAP_SQUARE = 2;
    public static final int FT_STROKER_BORDER_LEFT = 0;
    public static final int FT_STROKER_BORDER_RIGHT = 1;
    public static final int FT_ANGLE_PI = 11796480;
    public static final int FT_ANGLE_2PI = 23592960;
    public static final int FT_ANGLE_PI2 = 5898240;
    public static final int FT_ANGLE_PI4 = 2949120;
    public static final int T1_BLEND_UNDERLINE_POSITION = 0;
    public static final int T1_BLEND_UNDERLINE_THICKNESS = 1;
    public static final int T1_BLEND_ITALIC_ANGLE = 2;
    public static final int T1_BLEND_BLUE_VALUES = 3;
    public static final int T1_BLEND_OTHER_BLUES = 4;
    public static final int T1_BLEND_STANDARD_WIDTH = 5;
    public static final int T1_BLEND_STANDARD_HEIGHT = 6;
    public static final int T1_BLEND_STEM_SNAP_WIDTHS = 7;
    public static final int T1_BLEND_STEM_SNAP_HEIGHTS = 8;
    public static final int T1_BLEND_BLUE_SCALE = 9;
    public static final int T1_BLEND_BLUE_SHIFT = 10;
    public static final int T1_BLEND_FAMILY_BLUES = 11;
    public static final int T1_BLEND_FAMILY_OTHER_BLUES = 12;
    public static final int T1_BLEND_FORCE_BOLD = 13;
    public static final int T1_BLEND_MAX = 14;
    public static final int T1_MAX_MM_DESIGNS = 16;
    public static final int T1_MAX_MM_AXIS = 4;
    public static final int T1_MAX_MM_MAP_POINTS = 20;
    public static final int T1_ENCODING_TYPE_NONE = 0;
    public static final int T1_ENCODING_TYPE_ARRAY = 1;
    public static final int T1_ENCODING_TYPE_STANDARD = 2;
    public static final int T1_ENCODING_TYPE_ISOLATIN1 = 3;
    public static final int T1_ENCODING_TYPE_EXPERT = 4;
    public static final int PS_DICT_FONT_TYPE = 0;
    public static final int PS_DICT_FONT_MATRIX = 1;
    public static final int PS_DICT_FONT_BBOX = 2;
    public static final int PS_DICT_PAINT_TYPE = 3;
    public static final int PS_DICT_FONT_NAME = 4;
    public static final int PS_DICT_UNIQUE_ID = 5;
    public static final int PS_DICT_NUM_CHAR_STRINGS = 6;
    public static final int PS_DICT_CHAR_STRING_KEY = 7;
    public static final int PS_DICT_CHAR_STRING = 8;
    public static final int PS_DICT_ENCODING_TYPE = 9;
    public static final int PS_DICT_ENCODING_ENTRY = 10;
    public static final int PS_DICT_NUM_SUBRS = 11;
    public static final int PS_DICT_SUBR = 12;
    public static final int PS_DICT_STD_HW = 13;
    public static final int PS_DICT_STD_VW = 14;
    public static final int PS_DICT_NUM_BLUE_VALUES = 15;
    public static final int PS_DICT_BLUE_VALUE = 16;
    public static final int PS_DICT_BLUE_FUZZ = 17;
    public static final int PS_DICT_NUM_OTHER_BLUES = 18;
    public static final int PS_DICT_OTHER_BLUE = 19;
    public static final int PS_DICT_NUM_FAMILY_BLUES = 20;
    public static final int PS_DICT_FAMILY_BLUE = 21;
    public static final int PS_DICT_NUM_FAMILY_OTHER_BLUES = 22;
    public static final int PS_DICT_FAMILY_OTHER_BLUE = 23;
    public static final int PS_DICT_BLUE_SCALE = 24;
    public static final int PS_DICT_BLUE_SHIFT = 25;
    public static final int PS_DICT_NUM_STEM_SNAP_H = 26;
    public static final int PS_DICT_STEM_SNAP_H = 27;
    public static final int PS_DICT_NUM_STEM_SNAP_V = 28;
    public static final int PS_DICT_STEM_SNAP_V = 29;
    public static final int PS_DICT_FORCE_BOLD = 30;
    public static final int PS_DICT_RND_STEM_UP = 31;
    public static final int PS_DICT_MIN_FEATURE = 32;
    public static final int PS_DICT_LEN_IV = 33;
    public static final int PS_DICT_PASSWORD = 34;
    public static final int PS_DICT_LANGUAGE_GROUP = 35;
    public static final int PS_DICT_VERSION = 36;
    public static final int PS_DICT_NOTICE = 37;
    public static final int PS_DICT_FULL_NAME = 38;
    public static final int PS_DICT_FAMILY_NAME = 39;
    public static final int PS_DICT_WEIGHT = 40;
    public static final int PS_DICT_IS_FIXED_PITCH = 41;
    public static final int PS_DICT_UNDERLINE_POSITION = 42;
    public static final int PS_DICT_UNDERLINE_THICKNESS = 43;
    public static final int PS_DICT_FS_TYPE = 44;
    public static final int PS_DICT_ITALIC_ANGLE = 45;
    public static final int PS_DICT_MAX = 45;
    public static final int TT_PLATFORM_APPLE_UNICODE = 0;
    public static final int TT_PLATFORM_MACINTOSH = 1;
    public static final int TT_PLATFORM_ISO = 2;
    public static final int TT_PLATFORM_MICROSOFT = 3;
    public static final int TT_PLATFORM_CUSTOM = 4;
    public static final int TT_PLATFORM_ADOBE = 7;
    public static final int TT_APPLE_ID_DEFAULT = 0;
    public static final int TT_APPLE_ID_UNICODE_1_1 = 1;
    public static final int TT_APPLE_ID_ISO_10646 = 2;
    public static final int TT_APPLE_ID_UNICODE_2_0 = 3;
    public static final int TT_APPLE_ID_UNICODE_32 = 4;
    public static final int TT_APPLE_ID_VARIANT_SELECTOR = 5;
    public static final int TT_APPLE_ID_FULL_UNICODE = 6;
    public static final int TT_MAC_ID_ROMAN = 0;
    public static final int TT_MAC_ID_JAPANESE = 1;
    public static final int TT_MAC_ID_TRADITIONAL_CHINESE = 2;
    public static final int TT_MAC_ID_KOREAN = 3;
    public static final int TT_MAC_ID_ARABIC = 4;
    public static final int TT_MAC_ID_HEBREW = 5;
    public static final int TT_MAC_ID_GREEK = 6;
    public static final int TT_MAC_ID_RUSSIAN = 7;
    public static final int TT_MAC_ID_RSYMBOL = 8;
    public static final int TT_MAC_ID_DEVANAGARI = 9;
    public static final int TT_MAC_ID_GURMUKHI = 10;
    public static final int TT_MAC_ID_GUJARATI = 11;
    public static final int TT_MAC_ID_ORIYA = 12;
    public static final int TT_MAC_ID_BENGALI = 13;
    public static final int TT_MAC_ID_TAMIL = 14;
    public static final int TT_MAC_ID_TELUGU = 15;
    public static final int TT_MAC_ID_KANNADA = 16;
    public static final int TT_MAC_ID_MALAYALAM = 17;
    public static final int TT_MAC_ID_SINHALESE = 18;
    public static final int TT_MAC_ID_BURMESE = 19;
    public static final int TT_MAC_ID_KHMER = 20;
    public static final int TT_MAC_ID_THAI = 21;
    public static final int TT_MAC_ID_LAOTIAN = 22;
    public static final int TT_MAC_ID_GEORGIAN = 23;
    public static final int TT_MAC_ID_ARMENIAN = 24;
    public static final int TT_MAC_ID_MALDIVIAN = 25;
    public static final int TT_MAC_ID_SIMPLIFIED_CHINESE = 26;
    public static final int TT_MAC_ID_TIBETAN = 27;
    public static final int TT_MAC_ID_MONGOLIAN = 28;
    public static final int TT_MAC_ID_GEEZ = 29;
    public static final int TT_MAC_ID_SLAVIC = 30;
    public static final int TT_MAC_ID_VIETNAMESE = 31;
    public static final int TT_MAC_ID_SINDHI = 32;
    public static final int TT_MAC_ID_UNINTERP = 33;
    public static final int TT_ISO_ID_7BIT_ASCII = 0;
    public static final int TT_ISO_ID_10646 = 1;
    public static final int TT_ISO_ID_8859_1 = 2;
    public static final int TT_MS_ID_SYMBOL_CS = 0;
    public static final int TT_MS_ID_UNICODE_CS = 1;
    public static final int TT_MS_ID_SJIS = 2;
    public static final int TT_MS_ID_PRC = 3;
    public static final int TT_MS_ID_BIG_5 = 4;
    public static final int TT_MS_ID_WANSUNG = 5;
    public static final int TT_MS_ID_JOHAB = 6;
    public static final int TT_MS_ID_UCS_4 = 10;
    public static final int TT_ADOBE_ID_STANDARD = 0;
    public static final int TT_ADOBE_ID_EXPERT = 1;
    public static final int TT_ADOBE_ID_CUSTOM = 2;
    public static final int TT_ADOBE_ID_LATIN_1 = 3;
    public static final int TT_MAC_LANGID_ENGLISH = 0;
    public static final int TT_MAC_LANGID_FRENCH = 1;
    public static final int TT_MAC_LANGID_GERMAN = 2;
    public static final int TT_MAC_LANGID_ITALIAN = 3;
    public static final int TT_MAC_LANGID_DUTCH = 4;
    public static final int TT_MAC_LANGID_SWEDISH = 5;
    public static final int TT_MAC_LANGID_SPANISH = 6;
    public static final int TT_MAC_LANGID_DANISH = 7;
    public static final int TT_MAC_LANGID_PORTUGUESE = 8;
    public static final int TT_MAC_LANGID_NORWEGIAN = 9;
    public static final int TT_MAC_LANGID_HEBREW = 10;
    public static final int TT_MAC_LANGID_JAPANESE = 11;
    public static final int TT_MAC_LANGID_ARABIC = 12;
    public static final int TT_MAC_LANGID_FINNISH = 13;
    public static final int TT_MAC_LANGID_GREEK = 14;
    public static final int TT_MAC_LANGID_ICELANDIC = 15;
    public static final int TT_MAC_LANGID_MALTESE = 16;
    public static final int TT_MAC_LANGID_TURKISH = 17;
    public static final int TT_MAC_LANGID_CROATIAN = 18;
    public static final int TT_MAC_LANGID_CHINESE_TRADITIONAL = 19;
    public static final int TT_MAC_LANGID_URDU = 20;
    public static final int TT_MAC_LANGID_HINDI = 21;
    public static final int TT_MAC_LANGID_THAI = 22;
    public static final int TT_MAC_LANGID_KOREAN = 23;
    public static final int TT_MAC_LANGID_LITHUANIAN = 24;
    public static final int TT_MAC_LANGID_POLISH = 25;
    public static final int TT_MAC_LANGID_HUNGARIAN = 26;
    public static final int TT_MAC_LANGID_ESTONIAN = 27;
    public static final int TT_MAC_LANGID_LETTISH = 28;
    public static final int TT_MAC_LANGID_SAAMISK = 29;
    public static final int TT_MAC_LANGID_FAEROESE = 30;
    public static final int TT_MAC_LANGID_FARSI = 31;
    public static final int TT_MAC_LANGID_RUSSIAN = 32;
    public static final int TT_MAC_LANGID_CHINESE_SIMPLIFIED = 33;
    public static final int TT_MAC_LANGID_FLEMISH = 34;
    public static final int TT_MAC_LANGID_IRISH = 35;
    public static final int TT_MAC_LANGID_ALBANIAN = 36;
    public static final int TT_MAC_LANGID_ROMANIAN = 37;
    public static final int TT_MAC_LANGID_CZECH = 38;
    public static final int TT_MAC_LANGID_SLOVAK = 39;
    public static final int TT_MAC_LANGID_SLOVENIAN = 40;
    public static final int TT_MAC_LANGID_YIDDISH = 41;
    public static final int TT_MAC_LANGID_SERBIAN = 42;
    public static final int TT_MAC_LANGID_MACEDONIAN = 43;
    public static final int TT_MAC_LANGID_BULGARIAN = 44;
    public static final int TT_MAC_LANGID_UKRAINIAN = 45;
    public static final int TT_MAC_LANGID_BYELORUSSIAN = 46;
    public static final int TT_MAC_LANGID_UZBEK = 47;
    public static final int TT_MAC_LANGID_KAZAKH = 48;
    public static final int TT_MAC_LANGID_AZERBAIJANI = 49;
    public static final int TT_MAC_LANGID_AZERBAIJANI_CYRILLIC_SCRIPT = 50;
    public static final int TT_MAC_LANGID_AZERBAIJANI_ARABIC_SCRIPT = 51;
    public static final int TT_MAC_LANGID_ARMENIAN = 52;
    public static final int TT_MAC_LANGID_GEORGIAN = 53;
    public static final int TT_MAC_LANGID_MOLDAVIAN = 54;
    public static final int TT_MAC_LANGID_KIRGHIZ = 55;
    public static final int TT_MAC_LANGID_TAJIKI = 56;
    public static final int TT_MAC_LANGID_TURKMEN = 57;
    public static final int TT_MAC_LANGID_MONGOLIAN = 58;
    public static final int TT_MAC_LANGID_MONGOLIAN_MONGOLIAN_SCRIPT = 59;
    public static final int TT_MAC_LANGID_MONGOLIAN_CYRILLIC_SCRIPT = 60;
    public static final int TT_MAC_LANGID_PASHTO = 61;
    public static final int TT_MAC_LANGID_KURDISH = 62;
    public static final int TT_MAC_LANGID_KASHMIRI = 63;
    public static final int TT_MAC_LANGID_SINDHI = 64;
    public static final int TT_MAC_LANGID_TIBETAN = 65;
    public static final int TT_MAC_LANGID_NEPALI = 66;
    public static final int TT_MAC_LANGID_SANSKRIT = 67;
    public static final int TT_MAC_LANGID_MARATHI = 68;
    public static final int TT_MAC_LANGID_BENGALI = 69;
    public static final int TT_MAC_LANGID_ASSAMESE = 70;
    public static final int TT_MAC_LANGID_GUJARATI = 71;
    public static final int TT_MAC_LANGID_PUNJABI = 72;
    public static final int TT_MAC_LANGID_ORIYA = 73;
    public static final int TT_MAC_LANGID_MALAYALAM = 74;
    public static final int TT_MAC_LANGID_KANNADA = 75;
    public static final int TT_MAC_LANGID_TAMIL = 76;
    public static final int TT_MAC_LANGID_TELUGU = 77;
    public static final int TT_MAC_LANGID_SINHALESE = 78;
    public static final int TT_MAC_LANGID_BURMESE = 79;
    public static final int TT_MAC_LANGID_KHMER = 80;
    public static final int TT_MAC_LANGID_LAO = 81;
    public static final int TT_MAC_LANGID_VIETNAMESE = 82;
    public static final int TT_MAC_LANGID_INDONESIAN = 83;
    public static final int TT_MAC_LANGID_TAGALOG = 84;
    public static final int TT_MAC_LANGID_MALAY_ROMAN_SCRIPT = 85;
    public static final int TT_MAC_LANGID_MALAY_ARABIC_SCRIPT = 86;
    public static final int TT_MAC_LANGID_AMHARIC = 87;
    public static final int TT_MAC_LANGID_TIGRINYA = 88;
    public static final int TT_MAC_LANGID_GALLA = 89;
    public static final int TT_MAC_LANGID_SOMALI = 90;
    public static final int TT_MAC_LANGID_SWAHILI = 91;
    public static final int TT_MAC_LANGID_RUANDA = 92;
    public static final int TT_MAC_LANGID_RUNDI = 93;
    public static final int TT_MAC_LANGID_CHEWA = 94;
    public static final int TT_MAC_LANGID_MALAGASY = 95;
    public static final int TT_MAC_LANGID_ESPERANTO = 96;
    public static final int TT_MAC_LANGID_WELSH = 128;
    public static final int TT_MAC_LANGID_BASQUE = 129;
    public static final int TT_MAC_LANGID_CATALAN = 130;
    public static final int TT_MAC_LANGID_LATIN = 131;
    public static final int TT_MAC_LANGID_QUECHUA = 132;
    public static final int TT_MAC_LANGID_GUARANI = 133;
    public static final int TT_MAC_LANGID_AYMARA = 134;
    public static final int TT_MAC_LANGID_TATAR = 135;
    public static final int TT_MAC_LANGID_UIGHUR = 136;
    public static final int TT_MAC_LANGID_DZONGKHA = 137;
    public static final int TT_MAC_LANGID_JAVANESE = 138;
    public static final int TT_MAC_LANGID_SUNDANESE = 139;
    public static final int TT_MAC_LANGID_GALICIAN = 140;
    public static final int TT_MAC_LANGID_AFRIKAANS = 141;
    public static final int TT_MAC_LANGID_BRETON = 142;
    public static final int TT_MAC_LANGID_INUKTITUT = 143;
    public static final int TT_MAC_LANGID_SCOTTISH_GAELIC = 144;
    public static final int TT_MAC_LANGID_MANX_GAELIC = 145;
    public static final int TT_MAC_LANGID_IRISH_GAELIC = 146;
    public static final int TT_MAC_LANGID_TONGAN = 147;
    public static final int TT_MAC_LANGID_GREEK_POLYTONIC = 148;
    public static final int TT_MAC_LANGID_GREELANDIC = 149;
    public static final int TT_MAC_LANGID_AZERBAIJANI_ROMAN_SCRIPT = 150;
    public static final int TT_MS_LANGID_ARABIC_SAUDI_ARABIA = 1025;
    public static final int TT_MS_LANGID_ARABIC_IRAQ = 2049;
    public static final int TT_MS_LANGID_ARABIC_EGYPT = 3073;
    public static final int TT_MS_LANGID_ARABIC_LIBYA = 4097;
    public static final int TT_MS_LANGID_ARABIC_ALGERIA = 5121;
    public static final int TT_MS_LANGID_ARABIC_MOROCCO = 6145;
    public static final int TT_MS_LANGID_ARABIC_TUNISIA = 7169;
    public static final int TT_MS_LANGID_ARABIC_OMAN = 8193;
    public static final int TT_MS_LANGID_ARABIC_YEMEN = 9217;
    public static final int TT_MS_LANGID_ARABIC_SYRIA = 10241;
    public static final int TT_MS_LANGID_ARABIC_JORDAN = 11265;
    public static final int TT_MS_LANGID_ARABIC_LEBANON = 12289;
    public static final int TT_MS_LANGID_ARABIC_KUWAIT = 13313;
    public static final int TT_MS_LANGID_ARABIC_UAE = 14337;
    public static final int TT_MS_LANGID_ARABIC_BAHRAIN = 15361;
    public static final int TT_MS_LANGID_ARABIC_QATAR = 16385;
    public static final int TT_MS_LANGID_BULGARIAN_BULGARIA = 1026;
    public static final int TT_MS_LANGID_CATALAN_CATALAN = 1027;
    public static final int TT_MS_LANGID_CHINESE_TAIWAN = 1028;
    public static final int TT_MS_LANGID_CHINESE_PRC = 2052;
    public static final int TT_MS_LANGID_CHINESE_HONG_KONG = 3076;
    public static final int TT_MS_LANGID_CHINESE_SINGAPORE = 4100;
    public static final int TT_MS_LANGID_CHINESE_MACAO = 5124;
    public static final int TT_MS_LANGID_CZECH_CZECH_REPUBLIC = 1029;
    public static final int TT_MS_LANGID_DANISH_DENMARK = 1030;
    public static final int TT_MS_LANGID_GERMAN_GERMANY = 1031;
    public static final int TT_MS_LANGID_GERMAN_SWITZERLAND = 2055;
    public static final int TT_MS_LANGID_GERMAN_AUSTRIA = 3079;
    public static final int TT_MS_LANGID_GERMAN_LUXEMBOURG = 4103;
    public static final int TT_MS_LANGID_GERMAN_LIECHTENSTEIN = 5127;
    public static final int TT_MS_LANGID_GREEK_GREECE = 1032;
    public static final int TT_MS_LANGID_ENGLISH_UNITED_STATES = 1033;
    public static final int TT_MS_LANGID_ENGLISH_UNITED_KINGDOM = 2057;
    public static final int TT_MS_LANGID_ENGLISH_AUSTRALIA = 3081;
    public static final int TT_MS_LANGID_ENGLISH_CANADA = 4105;
    public static final int TT_MS_LANGID_ENGLISH_NEW_ZEALAND = 5129;
    public static final int TT_MS_LANGID_ENGLISH_IRELAND = 6153;
    public static final int TT_MS_LANGID_ENGLISH_SOUTH_AFRICA = 7177;
    public static final int TT_MS_LANGID_ENGLISH_JAMAICA = 8201;
    public static final int TT_MS_LANGID_ENGLISH_CARIBBEAN = 9225;
    public static final int TT_MS_LANGID_ENGLISH_BELIZE = 10249;
    public static final int TT_MS_LANGID_ENGLISH_TRINIDAD = 11273;
    public static final int TT_MS_LANGID_ENGLISH_ZIMBABWE = 12297;
    public static final int TT_MS_LANGID_ENGLISH_PHILIPPINES = 13321;
    public static final int TT_MS_LANGID_ENGLISH_INDIA = 16393;
    public static final int TT_MS_LANGID_ENGLISH_MALAYSIA = 17417;
    public static final int TT_MS_LANGID_ENGLISH_SINGAPORE = 18441;
    public static final int TT_MS_LANGID_SPANISH_SPAIN_TRADITIONAL_SORT = 1034;
    public static final int TT_MS_LANGID_SPANISH_MEXICO = 2058;
    public static final int TT_MS_LANGID_SPANISH_SPAIN_MODERN_SORT = 3082;
    public static final int TT_MS_LANGID_SPANISH_GUATEMALA = 4106;
    public static final int TT_MS_LANGID_SPANISH_COSTA_RICA = 5130;
    public static final int TT_MS_LANGID_SPANISH_PANAMA = 6154;
    public static final int TT_MS_LANGID_SPANISH_DOMINICAN_REPUBLIC = 7178;
    public static final int TT_MS_LANGID_SPANISH_VENEZUELA = 8202;
    public static final int TT_MS_LANGID_SPANISH_COLOMBIA = 9226;
    public static final int TT_MS_LANGID_SPANISH_PERU = 10250;
    public static final int TT_MS_LANGID_SPANISH_ARGENTINA = 11274;
    public static final int TT_MS_LANGID_SPANISH_ECUADOR = 12298;
    public static final int TT_MS_LANGID_SPANISH_CHILE = 13322;
    public static final int TT_MS_LANGID_SPANISH_URUGUAY = 14346;
    public static final int TT_MS_LANGID_SPANISH_PARAGUAY = 15370;
    public static final int TT_MS_LANGID_SPANISH_BOLIVIA = 16394;
    public static final int TT_MS_LANGID_SPANISH_EL_SALVADOR = 17418;
    public static final int TT_MS_LANGID_SPANISH_HONDURAS = 18442;
    public static final int TT_MS_LANGID_SPANISH_NICARAGUA = 19466;
    public static final int TT_MS_LANGID_SPANISH_PUERTO_RICO = 20490;
    public static final int TT_MS_LANGID_SPANISH_UNITED_STATES = 21514;
    public static final int TT_MS_LANGID_FINNISH_FINLAND = 1035;
    public static final int TT_MS_LANGID_FRENCH_FRANCE = 1036;
    public static final int TT_MS_LANGID_FRENCH_BELGIUM = 2060;
    public static final int TT_MS_LANGID_FRENCH_CANADA = 3084;
    public static final int TT_MS_LANGID_FRENCH_SWITZERLAND = 4108;
    public static final int TT_MS_LANGID_FRENCH_LUXEMBOURG = 5132;
    public static final int TT_MS_LANGID_FRENCH_MONACO = 6156;
    public static final int TT_MS_LANGID_HEBREW_ISRAEL = 1037;
    public static final int TT_MS_LANGID_HUNGARIAN_HUNGARY = 1038;
    public static final int TT_MS_LANGID_ICELANDIC_ICELAND = 1039;
    public static final int TT_MS_LANGID_ITALIAN_ITALY = 1040;
    public static final int TT_MS_LANGID_ITALIAN_SWITZERLAND = 2064;
    public static final int TT_MS_LANGID_JAPANESE_JAPAN = 1041;
    public static final int TT_MS_LANGID_KOREAN_KOREA = 1042;
    public static final int TT_MS_LANGID_DUTCH_NETHERLANDS = 1043;
    public static final int TT_MS_LANGID_DUTCH_BELGIUM = 2067;
    public static final int TT_MS_LANGID_NORWEGIAN_NORWAY_BOKMAL = 1044;
    public static final int TT_MS_LANGID_NORWEGIAN_NORWAY_NYNORSK = 2068;
    public static final int TT_MS_LANGID_POLISH_POLAND = 1045;
    public static final int TT_MS_LANGID_PORTUGUESE_BRAZIL = 1046;
    public static final int TT_MS_LANGID_PORTUGUESE_PORTUGAL = 2070;
    public static final int TT_MS_LANGID_ROMANSH_SWITZERLAND = 1047;
    public static final int TT_MS_LANGID_ROMANIAN_ROMANIA = 1048;
    public static final int TT_MS_LANGID_RUSSIAN_RUSSIA = 1049;
    public static final int TT_MS_LANGID_CROATIAN_CROATIA = 1050;
    public static final int TT_MS_LANGID_SERBIAN_SERBIA_LATIN = 2074;
    public static final int TT_MS_LANGID_SERBIAN_SERBIA_CYRILLIC = 3098;
    public static final int TT_MS_LANGID_CROATIAN_BOSNIA_HERZEGOVINA = 4122;
    public static final int TT_MS_LANGID_BOSNIAN_BOSNIA_HERZEGOVINA = 5146;
    public static final int TT_MS_LANGID_SERBIAN_BOSNIA_HERZ_LATIN = 6170;
    public static final int TT_MS_LANGID_SERBIAN_BOSNIA_HERZ_CYRILLIC = 7194;
    public static final int TT_MS_LANGID_BOSNIAN_BOSNIA_HERZ_CYRILLIC = 8218;
    public static final int TT_MS_LANGID_SLOVAK_SLOVAKIA = 1051;
    public static final int TT_MS_LANGID_ALBANIAN_ALBANIA = 1052;
    public static final int TT_MS_LANGID_SWEDISH_SWEDEN = 1053;
    public static final int TT_MS_LANGID_SWEDISH_FINLAND = 2077;
    public static final int TT_MS_LANGID_THAI_THAILAND = 1054;
    public static final int TT_MS_LANGID_TURKISH_TURKEY = 1055;
    public static final int TT_MS_LANGID_URDU_PAKISTAN = 1056;
    public static final int TT_MS_LANGID_INDONESIAN_INDONESIA = 1057;
    public static final int TT_MS_LANGID_UKRAINIAN_UKRAINE = 1058;
    public static final int TT_MS_LANGID_BELARUSIAN_BELARUS = 1059;
    public static final int TT_MS_LANGID_SLOVENIAN_SLOVENIA = 1060;
    public static final int TT_MS_LANGID_ESTONIAN_ESTONIA = 1061;
    public static final int TT_MS_LANGID_LATVIAN_LATVIA = 1062;
    public static final int TT_MS_LANGID_LITHUANIAN_LITHUANIA = 1063;
    public static final int TT_MS_LANGID_TAJIK_TAJIKISTAN = 1064;
    public static final int TT_MS_LANGID_VIETNAMESE_VIET_NAM = 1066;
    public static final int TT_MS_LANGID_ARMENIAN_ARMENIA = 1067;
    public static final int TT_MS_LANGID_AZERI_AZERBAIJAN_LATIN = 1068;
    public static final int TT_MS_LANGID_AZERI_AZERBAIJAN_CYRILLIC = 2092;
    public static final int TT_MS_LANGID_BASQUE_BASQUE = 1069;
    public static final int TT_MS_LANGID_UPPER_SORBIAN_GERMANY = 1070;
    public static final int TT_MS_LANGID_LOWER_SORBIAN_GERMANY = 2094;
    public static final int TT_MS_LANGID_MACEDONIAN_MACEDONIA = 1071;
    public static final int TT_MS_LANGID_SETSWANA_SOUTH_AFRICA = 1074;
    public static final int TT_MS_LANGID_ISIXHOSA_SOUTH_AFRICA = 1076;
    public static final int TT_MS_LANGID_ISIZULU_SOUTH_AFRICA = 1077;
    public static final int TT_MS_LANGID_AFRIKAANS_SOUTH_AFRICA = 1078;
    public static final int TT_MS_LANGID_GEORGIAN_GEORGIA = 1079;
    public static final int TT_MS_LANGID_FAEROESE_FAEROE_ISLANDS = 1080;
    public static final int TT_MS_LANGID_HINDI_INDIA = 1081;
    public static final int TT_MS_LANGID_MALTESE_MALTA = 1082;
    public static final int TT_MS_LANGID_SAMI_NORTHERN_NORWAY = 1083;
    public static final int TT_MS_LANGID_SAMI_NORTHERN_SWEDEN = 2107;
    public static final int TT_MS_LANGID_SAMI_NORTHERN_FINLAND = 3131;
    public static final int TT_MS_LANGID_SAMI_LULE_NORWAY = 4155;
    public static final int TT_MS_LANGID_SAMI_LULE_SWEDEN = 5179;
    public static final int TT_MS_LANGID_SAMI_SOUTHERN_NORWAY = 6203;
    public static final int TT_MS_LANGID_SAMI_SOUTHERN_SWEDEN = 7227;
    public static final int TT_MS_LANGID_SAMI_SKOLT_FINLAND = 8251;
    public static final int TT_MS_LANGID_SAMI_INARI_FINLAND = 9275;
    public static final int TT_MS_LANGID_IRISH_IRELAND = 2108;
    public static final int TT_MS_LANGID_MALAY_MALAYSIA = 1086;
    public static final int TT_MS_LANGID_MALAY_BRUNEI_DARUSSALAM = 2110;
    public static final int TT_MS_LANGID_KAZAKH_KAZAKHSTAN = 1087;
    public static final int TT_MS_LANGID_KYRGYZ_KYRGYZSTAN = 1088;
    public static final int TT_MS_LANGID_KISWAHILI_KENYA = 1089;
    public static final int TT_MS_LANGID_TURKMEN_TURKMENISTAN = 1090;
    public static final int TT_MS_LANGID_UZBEK_UZBEKISTAN_LATIN = 1091;
    public static final int TT_MS_LANGID_UZBEK_UZBEKISTAN_CYRILLIC = 2115;
    public static final int TT_MS_LANGID_TATAR_RUSSIA = 1092;
    public static final int TT_MS_LANGID_BENGALI_INDIA = 1093;
    public static final int TT_MS_LANGID_BENGALI_BANGLADESH = 2117;
    public static final int TT_MS_LANGID_PUNJABI_INDIA = 1094;
    public static final int TT_MS_LANGID_GUJARATI_INDIA = 1095;
    public static final int TT_MS_LANGID_ODIA_INDIA = 1096;
    public static final int TT_MS_LANGID_TAMIL_INDIA = 1097;
    public static final int TT_MS_LANGID_TELUGU_INDIA = 1098;
    public static final int TT_MS_LANGID_KANNADA_INDIA = 1099;
    public static final int TT_MS_LANGID_MALAYALAM_INDIA = 1100;
    public static final int TT_MS_LANGID_ASSAMESE_INDIA = 1101;
    public static final int TT_MS_LANGID_MARATHI_INDIA = 1102;
    public static final int TT_MS_LANGID_SANSKRIT_INDIA = 1103;
    public static final int TT_MS_LANGID_MONGOLIAN_MONGOLIA = 1104;
    public static final int TT_MS_LANGID_MONGOLIAN_PRC = 2128;
    public static final int TT_MS_LANGID_TIBETAN_PRC = 1105;
    public static final int TT_MS_LANGID_WELSH_UNITED_KINGDOM = 1106;
    public static final int TT_MS_LANGID_KHMER_CAMBODIA = 1107;
    public static final int TT_MS_LANGID_LAO_LAOS = 1108;
    public static final int TT_MS_LANGID_GALICIAN_GALICIAN = 1110;
    public static final int TT_MS_LANGID_KONKANI_INDIA = 1111;
    public static final int TT_MS_LANGID_SYRIAC_SYRIA = 1114;
    public static final int TT_MS_LANGID_SINHALA_SRI_LANKA = 1115;
    public static final int TT_MS_LANGID_INUKTITUT_CANADA = 1117;
    public static final int TT_MS_LANGID_INUKTITUT_CANADA_LATIN = 2141;
    public static final int TT_MS_LANGID_AMHARIC_ETHIOPIA = 1118;
    public static final int TT_MS_LANGID_TAMAZIGHT_ALGERIA = 2143;
    public static final int TT_MS_LANGID_NEPALI_NEPAL = 1121;
    public static final int TT_MS_LANGID_FRISIAN_NETHERLANDS = 1122;
    public static final int TT_MS_LANGID_PASHTO_AFGHANISTAN = 1123;
    public static final int TT_MS_LANGID_FILIPINO_PHILIPPINES = 1124;
    public static final int TT_MS_LANGID_DHIVEHI_MALDIVES = 1125;
    public static final int TT_MS_LANGID_HAUSA_NIGERIA = 1128;
    public static final int TT_MS_LANGID_YORUBA_NIGERIA = 1130;
    public static final int TT_MS_LANGID_QUECHUA_BOLIVIA = 1131;
    public static final int TT_MS_LANGID_QUECHUA_ECUADOR = 2155;
    public static final int TT_MS_LANGID_QUECHUA_PERU = 3179;
    public static final int TT_MS_LANGID_SESOTHO_SA_LEBOA_SOUTH_AFRICA = 1132;
    public static final int TT_MS_LANGID_BASHKIR_RUSSIA = 1133;
    public static final int TT_MS_LANGID_LUXEMBOURGISH_LUXEMBOURG = 1134;
    public static final int TT_MS_LANGID_GREENLANDIC_GREENLAND = 1135;
    public static final int TT_MS_LANGID_IGBO_NIGERIA = 1136;
    public static final int TT_MS_LANGID_YI_PRC = 1144;
    public static final int TT_MS_LANGID_MAPUDUNGUN_CHILE = 1146;
    public static final int TT_MS_LANGID_MOHAWK_MOHAWK = 1148;
    public static final int TT_MS_LANGID_BRETON_FRANCE = 1150;
    public static final int TT_MS_LANGID_UIGHUR_PRC = 1152;
    public static final int TT_MS_LANGID_MAORI_NEW_ZEALAND = 1153;
    public static final int TT_MS_LANGID_OCCITAN_FRANCE = 1154;
    public static final int TT_MS_LANGID_CORSICAN_FRANCE = 1155;
    public static final int TT_MS_LANGID_ALSATIAN_FRANCE = 1156;
    public static final int TT_MS_LANGID_YAKUT_RUSSIA = 1157;
    public static final int TT_MS_LANGID_KICHE_GUATEMALA = 1158;
    public static final int TT_MS_LANGID_KINYARWANDA_RWANDA = 1159;
    public static final int TT_MS_LANGID_WOLOF_SENEGAL = 1160;
    public static final int TT_MS_LANGID_DARI_AFGHANISTAN = 1164;
    public static final int TT_NAME_ID_COPYRIGHT = 0;
    public static final int TT_NAME_ID_FONT_FAMILY = 1;
    public static final int TT_NAME_ID_FONT_SUBFAMILY = 2;
    public static final int TT_NAME_ID_UNIQUE_ID = 3;
    public static final int TT_NAME_ID_FULL_NAME = 4;
    public static final int TT_NAME_ID_VERSION_STRING = 5;
    public static final int TT_NAME_ID_PS_NAME = 6;
    public static final int TT_NAME_ID_TRADEMARK = 7;
    public static final int TT_NAME_ID_MANUFACTURER = 8;
    public static final int TT_NAME_ID_DESIGNER = 9;
    public static final int TT_NAME_ID_DESCRIPTION = 10;
    public static final int TT_NAME_ID_VENDOR_URL = 11;
    public static final int TT_NAME_ID_DESIGNER_URL = 12;
    public static final int TT_NAME_ID_LICENSE = 13;
    public static final int TT_NAME_ID_LICENSE_URL = 14;
    public static final int TT_NAME_ID_TYPOGRAPHIC_FAMILY = 16;
    public static final int TT_NAME_ID_TYPOGRAPHIC_SUBFAMILY = 17;
    public static final int TT_NAME_ID_MAC_FULL_NAME = 18;
    public static final int TT_NAME_ID_SAMPLE_TEXT = 19;
    public static final int TT_NAME_ID_CID_FINDFONT_NAME = 20;
    public static final int TT_NAME_ID_WWS_FAMILY = 21;
    public static final int TT_NAME_ID_WWS_SUBFAMILY = 22;
    public static final int TT_NAME_ID_LIGHT_BACKGROUND = 23;
    public static final int TT_NAME_ID_DARK_BACKGROUND = 24;
    public static final int TT_NAME_ID_VARIATIONS_PREFIX = 25;
    public static final int TT_UCR_BASIC_LATIN = 1;
    public static final int TT_UCR_LATIN1_SUPPLEMENT = 2;
    public static final int TT_UCR_LATIN_EXTENDED_A = 4;
    public static final int TT_UCR_LATIN_EXTENDED_B = 8;
    public static final int TT_UCR_IPA_EXTENSIONS = 16;
    public static final int TT_UCR_SPACING_MODIFIER = 32;
    public static final int TT_UCR_COMBINING_DIACRITICAL_MARKS = 64;
    public static final int TT_UCR_GREEK = 128;
    public static final int TT_UCR_COPTIC = 256;
    public static final int TT_UCR_CYRILLIC = 512;
    public static final int TT_UCR_ARMENIAN = 1024;
    public static final int TT_UCR_HEBREW = 2048;
    public static final int TT_UCR_VAI = 4096;
    public static final int TT_UCR_ARABIC = 8192;
    public static final int TT_UCR_NKO = 16384;
    public static final int TT_UCR_DEVANAGARI = 32768;
    public static final int TT_UCR_BENGALI = 65536;
    public static final int TT_UCR_GURMUKHI = 131072;
    public static final int TT_UCR_GUJARATI = 262144;
    public static final int TT_UCR_ORIYA = 524288;
    public static final int TT_UCR_TAMIL = 1048576;
    public static final int TT_UCR_TELUGU = 2097152;
    public static final int TT_UCR_KANNADA = 4194304;
    public static final int TT_UCR_MALAYALAM = 8388608;
    public static final int TT_UCR_THAI = 16777216;
    public static final int TT_UCR_LAO = 33554432;
    public static final int TT_UCR_GEORGIAN = 67108864;
    public static final int TT_UCR_BALINESE = 134217728;
    public static final int TT_UCR_HANGUL_JAMO = 268435456;
    public static final int TT_UCR_LATIN_EXTENDED_ADDITIONAL = 536870912;
    public static final int TT_UCR_GREEK_EXTENDED = 1073741824;
    public static final int TT_UCR_GENERAL_PUNCTUATION = Integer.MIN_VALUE;
    public static final int TT_UCR_SUPERSCRIPTS_SUBSCRIPTS = 1;
    public static final int TT_UCR_CURRENCY_SYMBOLS = 2;
    public static final int TT_UCR_COMBINING_DIACRITICAL_MARKS_SYMB = 4;
    public static final int TT_UCR_LETTERLIKE_SYMBOLS = 8;
    public static final int TT_UCR_NUMBER_FORMS = 16;
    public static final int TT_UCR_ARROWS = 32;
    public static final int TT_UCR_MATHEMATICAL_OPERATORS = 64;
    public static final int TT_UCR_MISCELLANEOUS_TECHNICAL = 128;
    public static final int TT_UCR_CONTROL_PICTURES = 256;
    public static final int TT_UCR_OCR = 512;
    public static final int TT_UCR_ENCLOSED_ALPHANUMERICS = 1024;
    public static final int TT_UCR_BOX_DRAWING = 2048;
    public static final int TT_UCR_BLOCK_ELEMENTS = 4096;
    public static final int TT_UCR_GEOMETRIC_SHAPES = 8192;
    public static final int TT_UCR_MISCELLANEOUS_SYMBOLS = 16384;
    public static final int TT_UCR_DINGBATS = 32768;
    public static final int TT_UCR_CJK_SYMBOLS = 65536;
    public static final int TT_UCR_HIRAGANA = 131072;
    public static final int TT_UCR_KATAKANA = 262144;
    public static final int TT_UCR_BOPOMOFO = 524288;
    public static final int TT_UCR_HANGUL_COMPATIBILITY_JAMO = 1048576;
    public static final int TT_UCR_CJK_MISC = 2097152;
    public static final int TT_UCR_ENCLOSED_CJK_LETTERS_MONTHS = 4194304;
    public static final int TT_UCR_CJK_COMPATIBILITY = 8388608;
    public static final int TT_UCR_HANGUL = 16777216;
    public static final int TT_UCR_SURROGATES = 33554432;
    public static final int TT_UCR_PHOENICIAN = 67108864;
    public static final int TT_UCR_CJK_UNIFIED_IDEOGRAPHS = 134217728;
    public static final int TT_UCR_PRIVATE_USE = 268435456;
    public static final int TT_UCR_CJK_COMPATIBILITY_IDEOGRAPHS = 536870912;
    public static final int TT_UCR_ALPHABETIC_PRESENTATION_FORMS = 1073741824;
    public static final int TT_UCR_ARABIC_PRESENTATION_FORMS_A = Integer.MIN_VALUE;
    public static final int TT_UCR_COMBINING_HALF_MARKS = 1;
    public static final int TT_UCR_CJK_COMPATIBILITY_FORMS = 2;
    public static final int TT_UCR_SMALL_FORM_VARIANTS = 4;
    public static final int TT_UCR_ARABIC_PRESENTATION_FORMS_B = 8;
    public static final int TT_UCR_HALFWIDTH_FULLWIDTH_FORMS = 16;
    public static final int TT_UCR_SPECIALS = 32;
    public static final int TT_UCR_TIBETAN = 64;
    public static final int TT_UCR_SYRIAC = 128;
    public static final int TT_UCR_THAANA = 256;
    public static final int TT_UCR_SINHALA = 512;
    public static final int TT_UCR_MYANMAR = 1024;
    public static final int TT_UCR_ETHIOPIC = 2048;
    public static final int TT_UCR_CHEROKEE = 4096;
    public static final int TT_UCR_CANADIAN_ABORIGINAL_SYLLABICS = 8192;
    public static final int TT_UCR_OGHAM = 16384;
    public static final int TT_UCR_RUNIC = 32768;
    public static final int TT_UCR_KHMER = 65536;
    public static final int TT_UCR_MONGOLIAN = 131072;
    public static final int TT_UCR_BRAILLE = 262144;
    public static final int TT_UCR_YI = 524288;
    public static final int TT_UCR_PHILIPPINE = 1048576;
    public static final int TT_UCR_OLD_ITALIC = 2097152;
    public static final int TT_UCR_GOTHIC = 4194304;
    public static final int TT_UCR_DESERET = 8388608;
    public static final int TT_UCR_MUSICAL_SYMBOLS = 16777216;
    public static final int TT_UCR_MATH_ALPHANUMERIC_SYMBOLS = 33554432;
    public static final int TT_UCR_PRIVATE_USE_SUPPLEMENTARY = 67108864;
    public static final int TT_UCR_VARIATION_SELECTORS = 134217728;
    public static final int TT_UCR_TAGS = 268435456;
    public static final int TT_UCR_LIMBU = 536870912;
    public static final int TT_UCR_TAI_LE = 1073741824;
    public static final int TT_UCR_NEW_TAI_LUE = Integer.MIN_VALUE;
    public static final int TT_UCR_BUGINESE = 1;
    public static final int TT_UCR_GLAGOLITIC = 2;
    public static final int TT_UCR_TIFINAGH = 4;
    public static final int TT_UCR_YIJING = 8;
    public static final int TT_UCR_SYLOTI_NAGRI = 16;
    public static final int TT_UCR_LINEAR_B = 32;
    public static final int TT_UCR_ANCIENT_GREEK_NUMBERS = 64;
    public static final int TT_UCR_UGARITIC = 128;
    public static final int TT_UCR_OLD_PERSIAN = 256;
    public static final int TT_UCR_SHAVIAN = 512;
    public static final int TT_UCR_OSMANYA = 1024;
    public static final int TT_UCR_CYPRIOT_SYLLABARY = 2048;
    public static final int TT_UCR_KHAROSHTHI = 4096;
    public static final int TT_UCR_TAI_XUAN_JING = 8192;
    public static final int TT_UCR_CUNEIFORM = 16384;
    public static final int TT_UCR_COUNTING_ROD_NUMERALS = 32768;
    public static final int TT_UCR_SUNDANESE = 65536;
    public static final int TT_UCR_LEPCHA = 131072;
    public static final int TT_UCR_OL_CHIKI = 262144;
    public static final int TT_UCR_SAURASHTRA = 524288;
    public static final int TT_UCR_KAYAH_LI = 1048576;
    public static final int TT_UCR_REJANG = 2097152;
    public static final int TT_UCR_CHAM = 4194304;
    public static final int TT_UCR_ANCIENT_SYMBOLS = 8388608;
    public static final int TT_UCR_PHAISTOS_DISC = 16777216;
    public static final int TT_UCR_OLD_ANATOLIAN = 33554432;
    public static final int TT_UCR_GAME_TILES = 67108864;
    public static final int FT_SFNT_HEAD = 0;
    public static final int FT_SFNT_MAXP = 1;
    public static final int FT_SFNT_OS2 = 2;
    public static final int FT_SFNT_HHEA = 3;
    public static final int FT_SFNT_VHEA = 4;
    public static final int FT_SFNT_POST = 5;
    public static final int FT_SFNT_PCLT = 6;
    public static final int FT_SFNT_MAX = 7;
    public static final int TTAG_avar = 0;
    public static final int TTAG_BASE = 0;
    public static final int TTAG_bdat = 0;
    public static final int TTAG_BDF = 0;
    public static final int TTAG_bhed = 0;
    public static final int TTAG_bloc = 0;
    public static final int TTAG_bsln = 0;
    public static final int TTAG_CBDT = 0;
    public static final int TTAG_CBLC = 0;
    public static final int TTAG_CFF = 0;
    public static final int TTAG_CFF2 = 0;
    public static final int TTAG_CID = 0;
    public static final int TTAG_cmap = 0;
    public static final int TTAG_COLR = 0;
    public static final int TTAG_CPAL = 0;
    public static final int TTAG_cvar = 0;
    public static final int TTAG_cvt = 0;
    public static final int TTAG_DSIG = 0;
    public static final int TTAG_EBDT = 0;
    public static final int TTAG_EBLC = 0;
    public static final int TTAG_EBSC = 0;
    public static final int TTAG_feat = 0;
    public static final int TTAG_FOND = 0;
    public static final int TTAG_fpgm = 0;
    public static final int TTAG_fvar = 0;
    public static final int TTAG_gasp = 0;
    public static final int TTAG_GDEF = 0;
    public static final int TTAG_glyf = 0;
    public static final int TTAG_GPOS = 0;
    public static final int TTAG_GSUB = 0;
    public static final int TTAG_gvar = 0;
    public static final int TTAG_HVAR = 0;
    public static final int TTAG_hdmx = 0;
    public static final int TTAG_head = 0;
    public static final int TTAG_hhea = 0;
    public static final int TTAG_hmtx = 0;
    public static final int TTAG_JSTF = 0;
    public static final int TTAG_just = 0;
    public static final int TTAG_kern = 0;
    public static final int TTAG_lcar = 0;
    public static final int TTAG_loca = 0;
    public static final int TTAG_LTSH = 0;
    public static final int TTAG_LWFN = 0;
    public static final int TTAG_MATH = 0;
    public static final int TTAG_maxp = 0;
    public static final int TTAG_META = 0;
    public static final int TTAG_MMFX = 0;
    public static final int TTAG_MMSD = 0;
    public static final int TTAG_mort = 0;
    public static final int TTAG_morx = 0;
    public static final int TTAG_MVAR = 0;
    public static final int TTAG_name = 0;
    public static final int TTAG_opbd = 0;
    public static final int TTAG_OS2 = 0;
    public static final int TTAG_OTTO = 0;
    public static final int TTAG_PCLT = 0;
    public static final int TTAG_POST = 0;
    public static final int TTAG_post = 0;
    public static final int TTAG_prep = 0;
    public static final int TTAG_prop = 0;
    public static final int TTAG_sbix = 0;
    public static final int TTAG_sfnt = 0;
    public static final int TTAG_SING = 0;
    public static final int TTAG_SVG = 0;
    public static final int TTAG_trak = 0;
    public static final int TTAG_true = 0;
    public static final int TTAG_ttc = 0;
    public static final int TTAG_ttcf = 0;
    public static final int TTAG_TYP1 = 0;
    public static final int TTAG_typ1 = 0;
    public static final int TTAG_VDMX = 0;
    public static final int TTAG_vhea = 0;
    public static final int TTAG_vmtx = 0;
    public static final int TTAG_VVAR = 0;
    public static final int TTAG_wOFF = 0;
    public static final int TTAG_wOF2 = 0;
    public static final int TTAG_0xA5kbd = 0;
    public static final int TTAG_0xA5lst = 0;
    private static final org.lwjgl.system.libffi.FFICIF FT_Bitmap_BlendCIF = null;
    private static final org.lwjgl.system.libffi.FFICIF FT_Palette_Set_Foreground_ColorCIF = null;
    private static final org.lwjgl.system.libffi.FFICIF FT_Get_PaintCIF = null;

    /* JADX WARN: Classes with same name are omitted, all sources:
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/util/freetype/FreeType$Functions.class
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/util/freetype/FreeType$Functions.class
     */
    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/util/freetype/FreeType$Functions.class */
    public static final class Functions {
        public static final long Init_FreeType = 0;
        public static final long Done_FreeType = 0;
        public static final long New_Face = 0;
        public static final long New_Memory_Face = 0;
        public static final long Open_Face = 0;
        public static final long Attach_File = 0;
        public static final long Attach_Stream = 0;
        public static final long Reference_Face = 0;
        public static final long Done_Face = 0;
        public static final long Select_Size = 0;
        public static final long Request_Size = 0;
        public static final long Set_Char_Size = 0;
        public static final long Set_Pixel_Sizes = 0;
        public static final long Load_Glyph = 0;
        public static final long Load_Char = 0;
        public static final long Set_Transform = 0;
        public static final long Get_Transform = 0;
        public static final long Render_Glyph = 0;
        public static final long Get_Kerning = 0;
        public static final long Get_Track_Kerning = 0;
        public static final long Select_Charmap = 0;
        public static final long Set_Charmap = 0;
        public static final long Get_Charmap_Index = 0;
        public static final long Get_Char_Index = 0;
        public static final long Get_First_Char = 0;
        public static final long Get_Next_Char = 0;
        public static final long Face_Properties = 0;
        public static final long Get_Name_Index = 0;
        public static final long Get_Glyph_Name = 0;
        public static final long Get_Postscript_Name = 0;
        public static final long Get_SubGlyph_Info = 0;
        public static final long Get_FSType_Flags = 0;
        public static final long Face_GetCharVariantIndex = 0;
        public static final long Face_GetCharVariantIsDefault = 0;
        public static final long Face_GetVariantSelectors = 0;
        public static final long Face_GetVariantsOfChar = 0;
        public static final long Face_GetCharsOfVariant = 0;
        public static final long MulDiv = 0;
        public static final long MulFix = 0;
        public static final long DivFix = 0;
        public static final long RoundFix = 0;
        public static final long CeilFix = 0;
        public static final long FloorFix = 0;
        public static final long Vector_Transform = 0;
        public static final long Library_Version = 0;
        public static final long Face_CheckTrueTypePatents = 0;
        public static final long Face_SetUnpatentedHinting = 0;
        public static final long Get_Advance = 0;
        public static final long Get_Advances = 0;
        public static final long Outline_Get_BBox = 0;
        public static final long Get_BDF_Charset_ID = 0;
        public static final long Get_BDF_Property = 0;
        public static final long Bitmap_Init = 0;
        public static final long Bitmap_Copy = 0;
        public static final long Bitmap_Embolden = 0;
        public static final long Bitmap_Convert = 0;
        public static final long Bitmap_Blend = 0;
        public static final long GlyphSlot_Own_Bitmap = 0;
        public static final long Bitmap_Done = 0;
        public static final long Stream_OpenBzip2 = 0;
        public static final long FTC_Manager_New = 0;
        public static final long FTC_Manager_Reset = 0;
        public static final long FTC_Manager_Done = 0;
        public static final long FTC_Manager_LookupFace = 0;
        public static final long FTC_Manager_LookupSize = 0;
        public static final long FTC_Node_Unref = 0;
        public static final long FTC_Manager_RemoveFaceID = 0;
        public static final long FTC_CMapCache_New = 0;
        public static final long FTC_CMapCache_Lookup = 0;
        public static final long FTC_ImageCache_New = 0;
        public static final long FTC_ImageCache_Lookup = 0;
        public static final long FTC_ImageCache_LookupScaler = 0;
        public static final long FTC_SBitCache_New = 0;
        public static final long FTC_SBitCache_Lookup = 0;
        public static final long FTC_SBitCache_LookupScaler = 0;
        public static final long Get_CID_Registry_Ordering_Supplement = 0;
        public static final long Get_CID_Is_Internally_CID_Keyed = 0;
        public static final long Get_CID_From_Glyph_Index = 0;
        public static final long Palette_Data_Get = 0;
        public static final long Palette_Select = 0;
        public static final long Palette_Set_Foreground_Color = 0;
        public static final long Get_Color_Glyph_Layer = 0;
        public static final long Get_Color_Glyph_Paint = 0;
        public static final long Get_Color_Glyph_ClipBox = 0;
        public static final long Get_Paint_Layers = 0;
        public static final long Get_Colorline_Stops = 0;
        public static final long Get_Paint = 0;
        public static final long Error_String = 0;
        public static final long Get_Font_Format = 0;
        public static final long Get_Gasp = 0;
        public static final long New_Glyph = 0;
        public static final long Get_Glyph = 0;
        public static final long Glyph_Copy = 0;
        public static final long Glyph_Transform = 0;
        public static final long Glyph_Get_CBox = 0;
        public static final long Glyph_To_Bitmap = 0;
        public static final long Done_Glyph = 0;
        public static final long Matrix_Multiply = 0;
        public static final long Matrix_Invert = 0;
        public static final long TrueTypeGX_Validate = 0;
        public static final long TrueTypeGX_Free = 0;
        public static final long ClassicKern_Validate = 0;
        public static final long ClassicKern_Free = 0;
        public static final long Stream_OpenGzip = 0;
        public static final long Gzip_Uncompress = 0;
        public static final long Library_SetLcdFilter = 0;
        public static final long Library_SetLcdFilterWeights = 0;
        public static final long Library_SetLcdGeometry = 0;
        public static final long List_Find = 0;
        public static final long List_Add = 0;
        public static final long List_Insert = 0;
        public static final long List_Remove = 0;
        public static final long List_Up = 0;
        public static final long List_Iterate = 0;
        public static final long List_Finalize = 0;
        public static final long Stream_OpenLZW = 0;
        public static final long Get_Multi_Master = 0;
        public static final long Get_MM_Var = 0;
        public static final long Done_MM_Var = 0;
        public static final long Set_MM_Design_Coordinates = 0;
        public static final long Set_Var_Design_Coordinates = 0;
        public static final long Get_Var_Design_Coordinates = 0;
        public static final long Set_MM_Blend_Coordinates = 0;
        public static final long Get_MM_Blend_Coordinates = 0;
        public static final long Set_Var_Blend_Coordinates = 0;
        public static final long Get_Var_Blend_Coordinates = 0;
        public static final long Set_MM_WeightVector = 0;
        public static final long Get_MM_WeightVector = 0;
        public static final long Get_Var_Axis_Flags = 0;
        public static final long Set_Named_Instance = 0;
        public static final long Get_Default_Named_Instance = 0;
        public static final long Add_Module = 0;
        public static final long Get_Module = 0;
        public static final long Remove_Module = 0;
        public static final long Property_Set = 0;
        public static final long Property_Get = 0;
        public static final long Set_Default_Properties = 0;
        public static final long Reference_Library = 0;
        public static final long New_Library = 0;
        public static final long Done_Library = 0;
        public static final long Set_Debug_Hook = 0;
        public static final long Add_Default_Modules = 0;
        public static final long Get_TrueType_Engine_Type = 0;
        public static final long OpenType_Validate = 0;
        public static final long OpenType_Free = 0;
        public static final long Outline_Decompose = 0;
        public static final long Outline_New = 0;
        public static final long Outline_Done = 0;
        public static final long Outline_Check = 0;
        public static final long Outline_Get_CBox = 0;
        public static final long Outline_Translate = 0;
        public static final long Outline_Copy = 0;
        public static final long Outline_Transform = 0;
        public static final long Outline_Embolden = 0;
        public static final long Outline_EmboldenXY = 0;
        public static final long Outline_Reverse = 0;
        public static final long Outline_Get_Bitmap = 0;
        public static final long Outline_Render = 0;
        public static final long Outline_Get_Orientation = 0;
        public static final long Get_PFR_Metrics = 0;
        public static final long Get_PFR_Kerning = 0;
        public static final long Get_PFR_Advance = 0;
        public static final long Get_Renderer = 0;
        public static final long Set_Renderer = 0;
        public static final long New_Size = 0;
        public static final long Done_Size = 0;
        public static final long Activate_Size = 0;
        public static final long Get_Sfnt_Name_Count = 0;
        public static final long Get_Sfnt_Name = 0;
        public static final long Get_Sfnt_LangTag = 0;
        public static final long Outline_GetInsideBorder = 0;
        public static final long Outline_GetOutsideBorder = 0;
        public static final long Stroker_New = 0;
        public static final long Stroker_Set = 0;
        public static final long Stroker_Rewind = 0;
        public static final long Stroker_ParseOutline = 0;
        public static final long Stroker_BeginSubPath = 0;
        public static final long Stroker_EndSubPath = 0;
        public static final long Stroker_LineTo = 0;
        public static final long Stroker_ConicTo = 0;
        public static final long Stroker_CubicTo = 0;
        public static final long Stroker_GetBorderCounts = 0;
        public static final long Stroker_ExportBorder = 0;
        public static final long Stroker_GetCounts = 0;
        public static final long Stroker_Export = 0;
        public static final long Stroker_Done = 0;
        public static final long Glyph_Stroke = 0;
        public static final long Glyph_StrokeBorder = 0;
        public static final long GlyphSlot_Embolden = 0;
        public static final long GlyphSlot_AdjustWeight = 0;
        public static final long GlyphSlot_Oblique = 0;
        public static final long GlyphSlot_Slant = 0;
        public static final long Sin = 0;
        public static final long Cos = 0;
        public static final long Tan = 0;
        public static final long Atan2 = 0;
        public static final long Angle_Diff = 0;
        public static final long Vector_Unit = 0;
        public static final long Vector_Rotate = 0;
        public static final long Vector_Length = 0;
        public static final long Vector_Polarize = 0;
        public static final long Vector_From_Polar = 0;
        public static final long Has_PS_Glyph_Names = 0;
        public static final long Get_PS_Font_Info = 0;
        public static final long Get_PS_Font_Private = 0;
        public static final long Get_PS_Font_Value = 0;
        public static final long Get_Sfnt_Table = 0;
        public static final long Load_Sfnt_Table = 0;
        public static final long Sfnt_Table_Info = 0;
        public static final long Get_CMap_Language_ID = 0;
        public static final long Get_CMap_Format = 0;

        private Functions() {
                r2 = this;
                r0 = r2
                r0.<init>()
                return
        }

        static {
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.util.freetype.FreeType.access$000()
                java.lang.String r1 = "FT_Init_FreeType"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.util.freetype.FreeType.Functions.Init_FreeType = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.util.freetype.FreeType.access$000()
                java.lang.String r1 = "FT_Done_FreeType"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.util.freetype.FreeType.Functions.Done_FreeType = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.util.freetype.FreeType.access$000()
                java.lang.String r1 = "FT_New_Face"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.util.freetype.FreeType.Functions.New_Face = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.util.freetype.FreeType.access$000()
                java.lang.String r1 = "FT_New_Memory_Face"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.util.freetype.FreeType.Functions.New_Memory_Face = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.util.freetype.FreeType.access$000()
                java.lang.String r1 = "FT_Open_Face"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.util.freetype.FreeType.Functions.Open_Face = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.util.freetype.FreeType.access$000()
                java.lang.String r1 = "FT_Attach_File"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.util.freetype.FreeType.Functions.Attach_File = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.util.freetype.FreeType.access$000()
                java.lang.String r1 = "FT_Attach_Stream"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.util.freetype.FreeType.Functions.Attach_Stream = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.util.freetype.FreeType.access$000()
                java.lang.String r1 = "FT_Reference_Face"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.util.freetype.FreeType.Functions.Reference_Face = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.util.freetype.FreeType.access$000()
                java.lang.String r1 = "FT_Done_Face"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.util.freetype.FreeType.Functions.Done_Face = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.util.freetype.FreeType.access$000()
                java.lang.String r1 = "FT_Select_Size"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.util.freetype.FreeType.Functions.Select_Size = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.util.freetype.FreeType.access$000()
                java.lang.String r1 = "FT_Request_Size"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.util.freetype.FreeType.Functions.Request_Size = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.util.freetype.FreeType.access$000()
                java.lang.String r1 = "FT_Set_Char_Size"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.util.freetype.FreeType.Functions.Set_Char_Size = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.util.freetype.FreeType.access$000()
                java.lang.String r1 = "FT_Set_Pixel_Sizes"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.util.freetype.FreeType.Functions.Set_Pixel_Sizes = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.util.freetype.FreeType.access$000()
                java.lang.String r1 = "FT_Load_Glyph"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.util.freetype.FreeType.Functions.Load_Glyph = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.util.freetype.FreeType.access$000()
                java.lang.String r1 = "FT_Load_Char"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.util.freetype.FreeType.Functions.Load_Char = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.util.freetype.FreeType.access$000()
                java.lang.String r1 = "FT_Set_Transform"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.util.freetype.FreeType.Functions.Set_Transform = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.util.freetype.FreeType.access$000()
                java.lang.String r1 = "FT_Get_Transform"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.util.freetype.FreeType.Functions.Get_Transform = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.util.freetype.FreeType.access$000()
                java.lang.String r1 = "FT_Render_Glyph"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.util.freetype.FreeType.Functions.Render_Glyph = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.util.freetype.FreeType.access$000()
                java.lang.String r1 = "FT_Get_Kerning"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.util.freetype.FreeType.Functions.Get_Kerning = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.util.freetype.FreeType.access$000()
                java.lang.String r1 = "FT_Get_Track_Kerning"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.util.freetype.FreeType.Functions.Get_Track_Kerning = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.util.freetype.FreeType.access$000()
                java.lang.String r1 = "FT_Select_Charmap"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.util.freetype.FreeType.Functions.Select_Charmap = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.util.freetype.FreeType.access$000()
                java.lang.String r1 = "FT_Set_Charmap"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.util.freetype.FreeType.Functions.Set_Charmap = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.util.freetype.FreeType.access$000()
                java.lang.String r1 = "FT_Get_Charmap_Index"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.util.freetype.FreeType.Functions.Get_Charmap_Index = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.util.freetype.FreeType.access$000()
                java.lang.String r1 = "FT_Get_Char_Index"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.util.freetype.FreeType.Functions.Get_Char_Index = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.util.freetype.FreeType.access$000()
                java.lang.String r1 = "FT_Get_First_Char"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.util.freetype.FreeType.Functions.Get_First_Char = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.util.freetype.FreeType.access$000()
                java.lang.String r1 = "FT_Get_Next_Char"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.util.freetype.FreeType.Functions.Get_Next_Char = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.util.freetype.FreeType.access$000()
                java.lang.String r1 = "FT_Face_Properties"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.util.freetype.FreeType.Functions.Face_Properties = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.util.freetype.FreeType.access$000()
                java.lang.String r1 = "FT_Get_Name_Index"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.util.freetype.FreeType.Functions.Get_Name_Index = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.util.freetype.FreeType.access$000()
                java.lang.String r1 = "FT_Get_Glyph_Name"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.util.freetype.FreeType.Functions.Get_Glyph_Name = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.util.freetype.FreeType.access$000()
                java.lang.String r1 = "FT_Get_Postscript_Name"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.util.freetype.FreeType.Functions.Get_Postscript_Name = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.util.freetype.FreeType.access$000()
                java.lang.String r1 = "FT_Get_SubGlyph_Info"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.util.freetype.FreeType.Functions.Get_SubGlyph_Info = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.util.freetype.FreeType.access$000()
                java.lang.String r1 = "FT_Get_FSType_Flags"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.util.freetype.FreeType.Functions.Get_FSType_Flags = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.util.freetype.FreeType.access$000()
                java.lang.String r1 = "FT_Face_GetCharVariantIndex"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.util.freetype.FreeType.Functions.Face_GetCharVariantIndex = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.util.freetype.FreeType.access$000()
                java.lang.String r1 = "FT_Face_GetCharVariantIsDefault"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.util.freetype.FreeType.Functions.Face_GetCharVariantIsDefault = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.util.freetype.FreeType.access$000()
                java.lang.String r1 = "FT_Face_GetVariantSelectors"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.util.freetype.FreeType.Functions.Face_GetVariantSelectors = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.util.freetype.FreeType.access$000()
                java.lang.String r1 = "FT_Face_GetVariantsOfChar"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.util.freetype.FreeType.Functions.Face_GetVariantsOfChar = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.util.freetype.FreeType.access$000()
                java.lang.String r1 = "FT_Face_GetCharsOfVariant"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.util.freetype.FreeType.Functions.Face_GetCharsOfVariant = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.util.freetype.FreeType.access$000()
                java.lang.String r1 = "FT_MulDiv"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.util.freetype.FreeType.Functions.MulDiv = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.util.freetype.FreeType.access$000()
                java.lang.String r1 = "FT_MulFix"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.util.freetype.FreeType.Functions.MulFix = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.util.freetype.FreeType.access$000()
                java.lang.String r1 = "FT_DivFix"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.util.freetype.FreeType.Functions.DivFix = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.util.freetype.FreeType.access$000()
                java.lang.String r1 = "FT_RoundFix"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.util.freetype.FreeType.Functions.RoundFix = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.util.freetype.FreeType.access$000()
                java.lang.String r1 = "FT_CeilFix"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.util.freetype.FreeType.Functions.CeilFix = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.util.freetype.FreeType.access$000()
                java.lang.String r1 = "FT_FloorFix"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.util.freetype.FreeType.Functions.FloorFix = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.util.freetype.FreeType.access$000()
                java.lang.String r1 = "FT_Vector_Transform"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.util.freetype.FreeType.Functions.Vector_Transform = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.util.freetype.FreeType.access$000()
                java.lang.String r1 = "FT_Library_Version"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.util.freetype.FreeType.Functions.Library_Version = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.util.freetype.FreeType.access$000()
                java.lang.String r1 = "FT_Face_CheckTrueTypePatents"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.util.freetype.FreeType.Functions.Face_CheckTrueTypePatents = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.util.freetype.FreeType.access$000()
                java.lang.String r1 = "FT_Face_SetUnpatentedHinting"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.util.freetype.FreeType.Functions.Face_SetUnpatentedHinting = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.util.freetype.FreeType.access$000()
                java.lang.String r1 = "FT_Get_Advance"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.util.freetype.FreeType.Functions.Get_Advance = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.util.freetype.FreeType.access$000()
                java.lang.String r1 = "FT_Get_Advances"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.util.freetype.FreeType.Functions.Get_Advances = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.util.freetype.FreeType.access$000()
                java.lang.String r1 = "FT_Outline_Get_BBox"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.util.freetype.FreeType.Functions.Outline_Get_BBox = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.util.freetype.FreeType.access$000()
                java.lang.String r1 = "FT_Get_BDF_Charset_ID"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.util.freetype.FreeType.Functions.Get_BDF_Charset_ID = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.util.freetype.FreeType.access$000()
                java.lang.String r1 = "FT_Get_BDF_Property"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.util.freetype.FreeType.Functions.Get_BDF_Property = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.util.freetype.FreeType.access$000()
                java.lang.String r1 = "FT_Bitmap_Init"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.util.freetype.FreeType.Functions.Bitmap_Init = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.util.freetype.FreeType.access$000()
                java.lang.String r1 = "FT_Bitmap_Copy"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.util.freetype.FreeType.Functions.Bitmap_Copy = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.util.freetype.FreeType.access$000()
                java.lang.String r1 = "FT_Bitmap_Embolden"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.util.freetype.FreeType.Functions.Bitmap_Embolden = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.util.freetype.FreeType.access$000()
                java.lang.String r1 = "FT_Bitmap_Convert"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.util.freetype.FreeType.Functions.Bitmap_Convert = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.util.freetype.FreeType.access$000()
                java.lang.String r1 = "FT_Bitmap_Blend"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.util.freetype.FreeType.Functions.Bitmap_Blend = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.util.freetype.FreeType.access$000()
                java.lang.String r1 = "FT_GlyphSlot_Own_Bitmap"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.util.freetype.FreeType.Functions.GlyphSlot_Own_Bitmap = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.util.freetype.FreeType.access$000()
                java.lang.String r1 = "FT_Bitmap_Done"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.util.freetype.FreeType.Functions.Bitmap_Done = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.util.freetype.FreeType.access$000()
                java.lang.String r1 = "FT_Stream_OpenBzip2"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddressOptional(r0, r1)
                org.lwjgl.util.freetype.FreeType.Functions.Stream_OpenBzip2 = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.util.freetype.FreeType.access$000()
                java.lang.String r1 = "FTC_Manager_New"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.util.freetype.FreeType.Functions.FTC_Manager_New = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.util.freetype.FreeType.access$000()
                java.lang.String r1 = "FTC_Manager_Reset"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.util.freetype.FreeType.Functions.FTC_Manager_Reset = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.util.freetype.FreeType.access$000()
                java.lang.String r1 = "FTC_Manager_Done"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.util.freetype.FreeType.Functions.FTC_Manager_Done = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.util.freetype.FreeType.access$000()
                java.lang.String r1 = "FTC_Manager_LookupFace"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.util.freetype.FreeType.Functions.FTC_Manager_LookupFace = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.util.freetype.FreeType.access$000()
                java.lang.String r1 = "FTC_Manager_LookupSize"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.util.freetype.FreeType.Functions.FTC_Manager_LookupSize = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.util.freetype.FreeType.access$000()
                java.lang.String r1 = "FTC_Node_Unref"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.util.freetype.FreeType.Functions.FTC_Node_Unref = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.util.freetype.FreeType.access$000()
                java.lang.String r1 = "FTC_Manager_RemoveFaceID"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.util.freetype.FreeType.Functions.FTC_Manager_RemoveFaceID = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.util.freetype.FreeType.access$000()
                java.lang.String r1 = "FTC_CMapCache_New"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.util.freetype.FreeType.Functions.FTC_CMapCache_New = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.util.freetype.FreeType.access$000()
                java.lang.String r1 = "FTC_CMapCache_Lookup"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.util.freetype.FreeType.Functions.FTC_CMapCache_Lookup = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.util.freetype.FreeType.access$000()
                java.lang.String r1 = "FTC_ImageCache_New"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.util.freetype.FreeType.Functions.FTC_ImageCache_New = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.util.freetype.FreeType.access$000()
                java.lang.String r1 = "FTC_ImageCache_Lookup"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.util.freetype.FreeType.Functions.FTC_ImageCache_Lookup = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.util.freetype.FreeType.access$000()
                java.lang.String r1 = "FTC_ImageCache_LookupScaler"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.util.freetype.FreeType.Functions.FTC_ImageCache_LookupScaler = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.util.freetype.FreeType.access$000()
                java.lang.String r1 = "FTC_SBitCache_New"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.util.freetype.FreeType.Functions.FTC_SBitCache_New = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.util.freetype.FreeType.access$000()
                java.lang.String r1 = "FTC_SBitCache_Lookup"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.util.freetype.FreeType.Functions.FTC_SBitCache_Lookup = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.util.freetype.FreeType.access$000()
                java.lang.String r1 = "FTC_SBitCache_LookupScaler"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.util.freetype.FreeType.Functions.FTC_SBitCache_LookupScaler = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.util.freetype.FreeType.access$000()
                java.lang.String r1 = "FT_Get_CID_Registry_Ordering_Supplement"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.util.freetype.FreeType.Functions.Get_CID_Registry_Ordering_Supplement = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.util.freetype.FreeType.access$000()
                java.lang.String r1 = "FT_Get_CID_Is_Internally_CID_Keyed"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.util.freetype.FreeType.Functions.Get_CID_Is_Internally_CID_Keyed = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.util.freetype.FreeType.access$000()
                java.lang.String r1 = "FT_Get_CID_From_Glyph_Index"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.util.freetype.FreeType.Functions.Get_CID_From_Glyph_Index = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.util.freetype.FreeType.access$000()
                java.lang.String r1 = "FT_Palette_Data_Get"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.util.freetype.FreeType.Functions.Palette_Data_Get = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.util.freetype.FreeType.access$000()
                java.lang.String r1 = "FT_Palette_Select"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.util.freetype.FreeType.Functions.Palette_Select = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.util.freetype.FreeType.access$000()
                java.lang.String r1 = "FT_Palette_Set_Foreground_Color"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.util.freetype.FreeType.Functions.Palette_Set_Foreground_Color = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.util.freetype.FreeType.access$000()
                java.lang.String r1 = "FT_Get_Color_Glyph_Layer"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.util.freetype.FreeType.Functions.Get_Color_Glyph_Layer = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.util.freetype.FreeType.access$000()
                java.lang.String r1 = "FT_Get_Color_Glyph_Paint"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.util.freetype.FreeType.Functions.Get_Color_Glyph_Paint = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.util.freetype.FreeType.access$000()
                java.lang.String r1 = "FT_Get_Color_Glyph_ClipBox"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.util.freetype.FreeType.Functions.Get_Color_Glyph_ClipBox = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.util.freetype.FreeType.access$000()
                java.lang.String r1 = "FT_Get_Paint_Layers"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.util.freetype.FreeType.Functions.Get_Paint_Layers = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.util.freetype.FreeType.access$000()
                java.lang.String r1 = "FT_Get_Colorline_Stops"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.util.freetype.FreeType.Functions.Get_Colorline_Stops = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.util.freetype.FreeType.access$000()
                java.lang.String r1 = "FT_Get_Paint"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.util.freetype.FreeType.Functions.Get_Paint = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.util.freetype.FreeType.access$000()
                java.lang.String r1 = "FT_Error_String"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.util.freetype.FreeType.Functions.Error_String = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.util.freetype.FreeType.access$000()
                java.lang.String r1 = "FT_Get_Font_Format"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.util.freetype.FreeType.Functions.Get_Font_Format = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.util.freetype.FreeType.access$000()
                java.lang.String r1 = "FT_Get_Gasp"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.util.freetype.FreeType.Functions.Get_Gasp = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.util.freetype.FreeType.access$000()
                java.lang.String r1 = "FT_New_Glyph"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.util.freetype.FreeType.Functions.New_Glyph = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.util.freetype.FreeType.access$000()
                java.lang.String r1 = "FT_Get_Glyph"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.util.freetype.FreeType.Functions.Get_Glyph = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.util.freetype.FreeType.access$000()
                java.lang.String r1 = "FT_Glyph_Copy"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.util.freetype.FreeType.Functions.Glyph_Copy = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.util.freetype.FreeType.access$000()
                java.lang.String r1 = "FT_Glyph_Transform"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.util.freetype.FreeType.Functions.Glyph_Transform = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.util.freetype.FreeType.access$000()
                java.lang.String r1 = "FT_Glyph_Get_CBox"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.util.freetype.FreeType.Functions.Glyph_Get_CBox = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.util.freetype.FreeType.access$000()
                java.lang.String r1 = "FT_Glyph_To_Bitmap"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.util.freetype.FreeType.Functions.Glyph_To_Bitmap = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.util.freetype.FreeType.access$000()
                java.lang.String r1 = "FT_Done_Glyph"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.util.freetype.FreeType.Functions.Done_Glyph = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.util.freetype.FreeType.access$000()
                java.lang.String r1 = "FT_Matrix_Multiply"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.util.freetype.FreeType.Functions.Matrix_Multiply = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.util.freetype.FreeType.access$000()
                java.lang.String r1 = "FT_Matrix_Invert"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.util.freetype.FreeType.Functions.Matrix_Invert = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.util.freetype.FreeType.access$000()
                java.lang.String r1 = "FT_TrueTypeGX_Validate"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.util.freetype.FreeType.Functions.TrueTypeGX_Validate = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.util.freetype.FreeType.access$000()
                java.lang.String r1 = "FT_TrueTypeGX_Free"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.util.freetype.FreeType.Functions.TrueTypeGX_Free = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.util.freetype.FreeType.access$000()
                java.lang.String r1 = "FT_ClassicKern_Validate"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.util.freetype.FreeType.Functions.ClassicKern_Validate = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.util.freetype.FreeType.access$000()
                java.lang.String r1 = "FT_ClassicKern_Free"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.util.freetype.FreeType.Functions.ClassicKern_Free = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.util.freetype.FreeType.access$000()
                java.lang.String r1 = "FT_Stream_OpenGzip"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.util.freetype.FreeType.Functions.Stream_OpenGzip = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.util.freetype.FreeType.access$000()
                java.lang.String r1 = "FT_Gzip_Uncompress"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.util.freetype.FreeType.Functions.Gzip_Uncompress = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.util.freetype.FreeType.access$000()
                java.lang.String r1 = "FT_Library_SetLcdFilter"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.util.freetype.FreeType.Functions.Library_SetLcdFilter = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.util.freetype.FreeType.access$000()
                java.lang.String r1 = "FT_Library_SetLcdFilterWeights"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.util.freetype.FreeType.Functions.Library_SetLcdFilterWeights = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.util.freetype.FreeType.access$000()
                java.lang.String r1 = "FT_Library_SetLcdGeometry"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.util.freetype.FreeType.Functions.Library_SetLcdGeometry = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.util.freetype.FreeType.access$000()
                java.lang.String r1 = "FT_List_Find"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.util.freetype.FreeType.Functions.List_Find = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.util.freetype.FreeType.access$000()
                java.lang.String r1 = "FT_List_Add"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.util.freetype.FreeType.Functions.List_Add = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.util.freetype.FreeType.access$000()
                java.lang.String r1 = "FT_List_Insert"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.util.freetype.FreeType.Functions.List_Insert = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.util.freetype.FreeType.access$000()
                java.lang.String r1 = "FT_List_Remove"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.util.freetype.FreeType.Functions.List_Remove = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.util.freetype.FreeType.access$000()
                java.lang.String r1 = "FT_List_Up"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.util.freetype.FreeType.Functions.List_Up = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.util.freetype.FreeType.access$000()
                java.lang.String r1 = "FT_List_Iterate"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.util.freetype.FreeType.Functions.List_Iterate = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.util.freetype.FreeType.access$000()
                java.lang.String r1 = "FT_List_Finalize"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.util.freetype.FreeType.Functions.List_Finalize = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.util.freetype.FreeType.access$000()
                java.lang.String r1 = "FT_Stream_OpenLZW"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.util.freetype.FreeType.Functions.Stream_OpenLZW = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.util.freetype.FreeType.access$000()
                java.lang.String r1 = "FT_Get_Multi_Master"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.util.freetype.FreeType.Functions.Get_Multi_Master = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.util.freetype.FreeType.access$000()
                java.lang.String r1 = "FT_Get_MM_Var"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.util.freetype.FreeType.Functions.Get_MM_Var = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.util.freetype.FreeType.access$000()
                java.lang.String r1 = "FT_Done_MM_Var"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.util.freetype.FreeType.Functions.Done_MM_Var = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.util.freetype.FreeType.access$000()
                java.lang.String r1 = "FT_Set_MM_Design_Coordinates"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.util.freetype.FreeType.Functions.Set_MM_Design_Coordinates = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.util.freetype.FreeType.access$000()
                java.lang.String r1 = "FT_Set_Var_Design_Coordinates"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.util.freetype.FreeType.Functions.Set_Var_Design_Coordinates = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.util.freetype.FreeType.access$000()
                java.lang.String r1 = "FT_Get_Var_Design_Coordinates"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.util.freetype.FreeType.Functions.Get_Var_Design_Coordinates = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.util.freetype.FreeType.access$000()
                java.lang.String r1 = "FT_Set_MM_Blend_Coordinates"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.util.freetype.FreeType.Functions.Set_MM_Blend_Coordinates = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.util.freetype.FreeType.access$000()
                java.lang.String r1 = "FT_Get_MM_Blend_Coordinates"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.util.freetype.FreeType.Functions.Get_MM_Blend_Coordinates = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.util.freetype.FreeType.access$000()
                java.lang.String r1 = "FT_Set_Var_Blend_Coordinates"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.util.freetype.FreeType.Functions.Set_Var_Blend_Coordinates = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.util.freetype.FreeType.access$000()
                java.lang.String r1 = "FT_Get_Var_Blend_Coordinates"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.util.freetype.FreeType.Functions.Get_Var_Blend_Coordinates = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.util.freetype.FreeType.access$000()
                java.lang.String r1 = "FT_Set_MM_WeightVector"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.util.freetype.FreeType.Functions.Set_MM_WeightVector = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.util.freetype.FreeType.access$000()
                java.lang.String r1 = "FT_Get_MM_WeightVector"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.util.freetype.FreeType.Functions.Get_MM_WeightVector = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.util.freetype.FreeType.access$000()
                java.lang.String r1 = "FT_Get_Var_Axis_Flags"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.util.freetype.FreeType.Functions.Get_Var_Axis_Flags = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.util.freetype.FreeType.access$000()
                java.lang.String r1 = "FT_Set_Named_Instance"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.util.freetype.FreeType.Functions.Set_Named_Instance = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.util.freetype.FreeType.access$000()
                java.lang.String r1 = "FT_Get_Default_Named_Instance"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.util.freetype.FreeType.Functions.Get_Default_Named_Instance = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.util.freetype.FreeType.access$000()
                java.lang.String r1 = "FT_Add_Module"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.util.freetype.FreeType.Functions.Add_Module = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.util.freetype.FreeType.access$000()
                java.lang.String r1 = "FT_Get_Module"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.util.freetype.FreeType.Functions.Get_Module = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.util.freetype.FreeType.access$000()
                java.lang.String r1 = "FT_Remove_Module"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.util.freetype.FreeType.Functions.Remove_Module = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.util.freetype.FreeType.access$000()
                java.lang.String r1 = "FT_Property_Set"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.util.freetype.FreeType.Functions.Property_Set = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.util.freetype.FreeType.access$000()
                java.lang.String r1 = "FT_Property_Get"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.util.freetype.FreeType.Functions.Property_Get = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.util.freetype.FreeType.access$000()
                java.lang.String r1 = "FT_Set_Default_Properties"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.util.freetype.FreeType.Functions.Set_Default_Properties = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.util.freetype.FreeType.access$000()
                java.lang.String r1 = "FT_Reference_Library"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.util.freetype.FreeType.Functions.Reference_Library = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.util.freetype.FreeType.access$000()
                java.lang.String r1 = "FT_New_Library"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.util.freetype.FreeType.Functions.New_Library = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.util.freetype.FreeType.access$000()
                java.lang.String r1 = "FT_Done_Library"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.util.freetype.FreeType.Functions.Done_Library = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.util.freetype.FreeType.access$000()
                java.lang.String r1 = "FT_Set_Debug_Hook"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.util.freetype.FreeType.Functions.Set_Debug_Hook = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.util.freetype.FreeType.access$000()
                java.lang.String r1 = "FT_Add_Default_Modules"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.util.freetype.FreeType.Functions.Add_Default_Modules = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.util.freetype.FreeType.access$000()
                java.lang.String r1 = "FT_Get_TrueType_Engine_Type"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.util.freetype.FreeType.Functions.Get_TrueType_Engine_Type = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.util.freetype.FreeType.access$000()
                java.lang.String r1 = "FT_OpenType_Validate"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.util.freetype.FreeType.Functions.OpenType_Validate = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.util.freetype.FreeType.access$000()
                java.lang.String r1 = "FT_OpenType_Free"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.util.freetype.FreeType.Functions.OpenType_Free = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.util.freetype.FreeType.access$000()
                java.lang.String r1 = "FT_Outline_Decompose"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.util.freetype.FreeType.Functions.Outline_Decompose = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.util.freetype.FreeType.access$000()
                java.lang.String r1 = "FT_Outline_New"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.util.freetype.FreeType.Functions.Outline_New = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.util.freetype.FreeType.access$000()
                java.lang.String r1 = "FT_Outline_Done"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.util.freetype.FreeType.Functions.Outline_Done = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.util.freetype.FreeType.access$000()
                java.lang.String r1 = "FT_Outline_Check"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.util.freetype.FreeType.Functions.Outline_Check = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.util.freetype.FreeType.access$000()
                java.lang.String r1 = "FT_Outline_Get_CBox"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.util.freetype.FreeType.Functions.Outline_Get_CBox = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.util.freetype.FreeType.access$000()
                java.lang.String r1 = "FT_Outline_Translate"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.util.freetype.FreeType.Functions.Outline_Translate = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.util.freetype.FreeType.access$000()
                java.lang.String r1 = "FT_Outline_Copy"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.util.freetype.FreeType.Functions.Outline_Copy = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.util.freetype.FreeType.access$000()
                java.lang.String r1 = "FT_Outline_Transform"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.util.freetype.FreeType.Functions.Outline_Transform = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.util.freetype.FreeType.access$000()
                java.lang.String r1 = "FT_Outline_Embolden"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.util.freetype.FreeType.Functions.Outline_Embolden = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.util.freetype.FreeType.access$000()
                java.lang.String r1 = "FT_Outline_EmboldenXY"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.util.freetype.FreeType.Functions.Outline_EmboldenXY = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.util.freetype.FreeType.access$000()
                java.lang.String r1 = "FT_Outline_Reverse"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.util.freetype.FreeType.Functions.Outline_Reverse = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.util.freetype.FreeType.access$000()
                java.lang.String r1 = "FT_Outline_Get_Bitmap"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.util.freetype.FreeType.Functions.Outline_Get_Bitmap = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.util.freetype.FreeType.access$000()
                java.lang.String r1 = "FT_Outline_Render"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.util.freetype.FreeType.Functions.Outline_Render = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.util.freetype.FreeType.access$000()
                java.lang.String r1 = "FT_Outline_Get_Orientation"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.util.freetype.FreeType.Functions.Outline_Get_Orientation = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.util.freetype.FreeType.access$000()
                java.lang.String r1 = "FT_Get_PFR_Metrics"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.util.freetype.FreeType.Functions.Get_PFR_Metrics = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.util.freetype.FreeType.access$000()
                java.lang.String r1 = "FT_Get_PFR_Kerning"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.util.freetype.FreeType.Functions.Get_PFR_Kerning = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.util.freetype.FreeType.access$000()
                java.lang.String r1 = "FT_Get_PFR_Advance"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.util.freetype.FreeType.Functions.Get_PFR_Advance = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.util.freetype.FreeType.access$000()
                java.lang.String r1 = "FT_Get_Renderer"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.util.freetype.FreeType.Functions.Get_Renderer = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.util.freetype.FreeType.access$000()
                java.lang.String r1 = "FT_Set_Renderer"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.util.freetype.FreeType.Functions.Set_Renderer = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.util.freetype.FreeType.access$000()
                java.lang.String r1 = "FT_New_Size"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.util.freetype.FreeType.Functions.New_Size = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.util.freetype.FreeType.access$000()
                java.lang.String r1 = "FT_Done_Size"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.util.freetype.FreeType.Functions.Done_Size = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.util.freetype.FreeType.access$000()
                java.lang.String r1 = "FT_Activate_Size"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.util.freetype.FreeType.Functions.Activate_Size = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.util.freetype.FreeType.access$000()
                java.lang.String r1 = "FT_Get_Sfnt_Name_Count"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.util.freetype.FreeType.Functions.Get_Sfnt_Name_Count = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.util.freetype.FreeType.access$000()
                java.lang.String r1 = "FT_Get_Sfnt_Name"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.util.freetype.FreeType.Functions.Get_Sfnt_Name = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.util.freetype.FreeType.access$000()
                java.lang.String r1 = "FT_Get_Sfnt_LangTag"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.util.freetype.FreeType.Functions.Get_Sfnt_LangTag = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.util.freetype.FreeType.access$000()
                java.lang.String r1 = "FT_Outline_GetInsideBorder"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.util.freetype.FreeType.Functions.Outline_GetInsideBorder = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.util.freetype.FreeType.access$000()
                java.lang.String r1 = "FT_Outline_GetOutsideBorder"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.util.freetype.FreeType.Functions.Outline_GetOutsideBorder = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.util.freetype.FreeType.access$000()
                java.lang.String r1 = "FT_Stroker_New"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.util.freetype.FreeType.Functions.Stroker_New = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.util.freetype.FreeType.access$000()
                java.lang.String r1 = "FT_Stroker_Set"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.util.freetype.FreeType.Functions.Stroker_Set = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.util.freetype.FreeType.access$000()
                java.lang.String r1 = "FT_Stroker_Rewind"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.util.freetype.FreeType.Functions.Stroker_Rewind = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.util.freetype.FreeType.access$000()
                java.lang.String r1 = "FT_Stroker_ParseOutline"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.util.freetype.FreeType.Functions.Stroker_ParseOutline = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.util.freetype.FreeType.access$000()
                java.lang.String r1 = "FT_Stroker_BeginSubPath"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.util.freetype.FreeType.Functions.Stroker_BeginSubPath = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.util.freetype.FreeType.access$000()
                java.lang.String r1 = "FT_Stroker_EndSubPath"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.util.freetype.FreeType.Functions.Stroker_EndSubPath = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.util.freetype.FreeType.access$000()
                java.lang.String r1 = "FT_Stroker_LineTo"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.util.freetype.FreeType.Functions.Stroker_LineTo = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.util.freetype.FreeType.access$000()
                java.lang.String r1 = "FT_Stroker_ConicTo"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.util.freetype.FreeType.Functions.Stroker_ConicTo = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.util.freetype.FreeType.access$000()
                java.lang.String r1 = "FT_Stroker_CubicTo"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.util.freetype.FreeType.Functions.Stroker_CubicTo = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.util.freetype.FreeType.access$000()
                java.lang.String r1 = "FT_Stroker_GetBorderCounts"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.util.freetype.FreeType.Functions.Stroker_GetBorderCounts = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.util.freetype.FreeType.access$000()
                java.lang.String r1 = "FT_Stroker_ExportBorder"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.util.freetype.FreeType.Functions.Stroker_ExportBorder = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.util.freetype.FreeType.access$000()
                java.lang.String r1 = "FT_Stroker_GetCounts"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.util.freetype.FreeType.Functions.Stroker_GetCounts = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.util.freetype.FreeType.access$000()
                java.lang.String r1 = "FT_Stroker_Export"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.util.freetype.FreeType.Functions.Stroker_Export = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.util.freetype.FreeType.access$000()
                java.lang.String r1 = "FT_Stroker_Done"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.util.freetype.FreeType.Functions.Stroker_Done = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.util.freetype.FreeType.access$000()
                java.lang.String r1 = "FT_Glyph_Stroke"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.util.freetype.FreeType.Functions.Glyph_Stroke = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.util.freetype.FreeType.access$000()
                java.lang.String r1 = "FT_Glyph_StrokeBorder"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.util.freetype.FreeType.Functions.Glyph_StrokeBorder = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.util.freetype.FreeType.access$000()
                java.lang.String r1 = "FT_GlyphSlot_Embolden"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.util.freetype.FreeType.Functions.GlyphSlot_Embolden = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.util.freetype.FreeType.access$000()
                java.lang.String r1 = "FT_GlyphSlot_AdjustWeight"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.util.freetype.FreeType.Functions.GlyphSlot_AdjustWeight = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.util.freetype.FreeType.access$000()
                java.lang.String r1 = "FT_GlyphSlot_Oblique"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.util.freetype.FreeType.Functions.GlyphSlot_Oblique = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.util.freetype.FreeType.access$000()
                java.lang.String r1 = "FT_GlyphSlot_Slant"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.util.freetype.FreeType.Functions.GlyphSlot_Slant = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.util.freetype.FreeType.access$000()
                java.lang.String r1 = "FT_Sin"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.util.freetype.FreeType.Functions.Sin = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.util.freetype.FreeType.access$000()
                java.lang.String r1 = "FT_Cos"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.util.freetype.FreeType.Functions.Cos = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.util.freetype.FreeType.access$000()
                java.lang.String r1 = "FT_Tan"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.util.freetype.FreeType.Functions.Tan = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.util.freetype.FreeType.access$000()
                java.lang.String r1 = "FT_Atan2"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.util.freetype.FreeType.Functions.Atan2 = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.util.freetype.FreeType.access$000()
                java.lang.String r1 = "FT_Angle_Diff"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.util.freetype.FreeType.Functions.Angle_Diff = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.util.freetype.FreeType.access$000()
                java.lang.String r1 = "FT_Vector_Unit"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.util.freetype.FreeType.Functions.Vector_Unit = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.util.freetype.FreeType.access$000()
                java.lang.String r1 = "FT_Vector_Rotate"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.util.freetype.FreeType.Functions.Vector_Rotate = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.util.freetype.FreeType.access$000()
                java.lang.String r1 = "FT_Vector_Length"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.util.freetype.FreeType.Functions.Vector_Length = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.util.freetype.FreeType.access$000()
                java.lang.String r1 = "FT_Vector_Polarize"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.util.freetype.FreeType.Functions.Vector_Polarize = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.util.freetype.FreeType.access$000()
                java.lang.String r1 = "FT_Vector_From_Polar"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.util.freetype.FreeType.Functions.Vector_From_Polar = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.util.freetype.FreeType.access$000()
                java.lang.String r1 = "FT_Has_PS_Glyph_Names"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.util.freetype.FreeType.Functions.Has_PS_Glyph_Names = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.util.freetype.FreeType.access$000()
                java.lang.String r1 = "FT_Get_PS_Font_Info"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.util.freetype.FreeType.Functions.Get_PS_Font_Info = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.util.freetype.FreeType.access$000()
                java.lang.String r1 = "FT_Get_PS_Font_Private"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.util.freetype.FreeType.Functions.Get_PS_Font_Private = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.util.freetype.FreeType.access$000()
                java.lang.String r1 = "FT_Get_PS_Font_Value"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.util.freetype.FreeType.Functions.Get_PS_Font_Value = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.util.freetype.FreeType.access$000()
                java.lang.String r1 = "FT_Get_Sfnt_Table"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.util.freetype.FreeType.Functions.Get_Sfnt_Table = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.util.freetype.FreeType.access$000()
                java.lang.String r1 = "FT_Load_Sfnt_Table"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.util.freetype.FreeType.Functions.Load_Sfnt_Table = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.util.freetype.FreeType.access$000()
                java.lang.String r1 = "FT_Sfnt_Table_Info"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.util.freetype.FreeType.Functions.Sfnt_Table_Info = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.util.freetype.FreeType.access$000()
                java.lang.String r1 = "FT_Get_CMap_Language_ID"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.util.freetype.FreeType.Functions.Get_CMap_Language_ID = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.util.freetype.FreeType.access$000()
                java.lang.String r1 = "FT_Get_CMap_Format"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.util.freetype.FreeType.Functions.Get_CMap_Format = r0
                return
        }
    }

    public static org.lwjgl.system.SharedLibrary getLibrary() {
            org.lwjgl.system.SharedLibrary r0 = org.lwjgl.util.freetype.FreeType.FREETYPE
            return r0
    }

    protected FreeType() {
            r3 = this;
            r0 = r3
            r0.<init>()
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r1 = r0
            r1.<init>()
            throw r0
    }

    public static int nFT_Init_FreeType(long r5) {
            long r0 = org.lwjgl.util.freetype.FreeType.Functions.Init_FreeType
            r7 = r0
            r0 = r5
            r1 = r7
            int r0 = org.lwjgl.system.JNI.invokePI(r0, r1)
            return r0
    }

    @org.lwjgl.system.NativeType("FT_Error")
    public static int FT_Init_FreeType(@org.lwjgl.system.NativeType("FT_Library *") org.lwjgl.PointerBuffer r3) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r3
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
        Lb:
            r0 = r3
            long r0 = org.lwjgl.system.MemoryUtil.memAddress(r0)
            int r0 = nFT_Init_FreeType(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("FT_Error")
    public static int FT_Done_FreeType(@org.lwjgl.system.NativeType("FT_Library") long r5) {
            long r0 = org.lwjgl.util.freetype.FreeType.Functions.Done_FreeType
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

    public static int nFT_New_Face(long r11, long r13, long r15, long r17) {
            long r0 = org.lwjgl.util.freetype.FreeType.Functions.New_Face
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
            int r0 = org.lwjgl.system.JNI.invokePPNPI(r0, r1, r2, r3, r4)
            return r0
    }

    @org.lwjgl.system.NativeType("FT_Error")
    public static int FT_New_Face(@org.lwjgl.system.NativeType("FT_Library") long r9, @org.lwjgl.system.NativeType("char const *") java.nio.ByteBuffer r11, @org.lwjgl.system.NativeType("FT_Long") long r12, @org.lwjgl.system.NativeType("FT_Face *") org.lwjgl.PointerBuffer r14) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L10
            r0 = r11
            org.lwjgl.system.Checks.checkNT1(r0)
            r0 = r14
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
        L10:
            r0 = r9
            r1 = r11
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            r2 = r12
            r3 = r14
            long r3 = org.lwjgl.system.MemoryUtil.memAddress(r3)
            int r0 = nFT_New_Face(r0, r1, r2, r3)
            return r0
    }

    @org.lwjgl.system.NativeType("FT_Error")
    public static int FT_New_Face(@org.lwjgl.system.NativeType("FT_Library") long r9, @org.lwjgl.system.NativeType("char const *") java.lang.CharSequence r11, @org.lwjgl.system.NativeType("FT_Long") long r12, @org.lwjgl.system.NativeType("FT_Face *") org.lwjgl.PointerBuffer r14) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lc
            r0 = r14
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
        Lc:
            org.lwjgl.system.MemoryStack r0 = org.lwjgl.system.MemoryStack.stackGet()
            r15 = r0
            r0 = r15
            int r0 = r0.getPointer()
            r16 = r0
            r0 = r15
            r1 = r11
            r2 = 1
            int r0 = r0.nUTF8(r1, r2)     // Catch: java.lang.Throwable -> L3f
            r0 = r15
            long r0 = r0.getPointerAddress()     // Catch: java.lang.Throwable -> L3f
            r17 = r0
            r0 = r9
            r1 = r17
            r2 = r12
            r3 = r14
            long r3 = org.lwjgl.system.MemoryUtil.memAddress(r3)     // Catch: java.lang.Throwable -> L3f
            int r0 = nFT_New_Face(r0, r1, r2, r3)     // Catch: java.lang.Throwable -> L3f
            r19 = r0
            r0 = r15
            r1 = r16
            r0.setPointer(r1)
            r0 = r19
            return r0
        L3f:
            r20 = move-exception
            r0 = r15
            r1 = r16
            r0.setPointer(r1)
            r0 = r20
            throw r0
    }

    public static int nFT_New_Memory_Face(long r13, long r15, long r17, long r19, long r21) {
            long r0 = org.lwjgl.util.freetype.FreeType.Functions.New_Memory_Face
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
            int r0 = org.lwjgl.system.JNI.invokePPNNPI(r0, r1, r2, r3, r4, r5)
            return r0
    }

    @org.lwjgl.system.NativeType("FT_Error")
    public static int FT_New_Memory_Face(@org.lwjgl.system.NativeType("FT_Library") long r11, @org.lwjgl.system.NativeType("FT_Byte const *") java.nio.ByteBuffer r13, @org.lwjgl.system.NativeType("FT_Long") long r14, @org.lwjgl.system.NativeType("FT_Face *") org.lwjgl.PointerBuffer r16) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lc
            r0 = r16
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
        Lc:
            r0 = r11
            r1 = r13
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            r2 = r13
            int r2 = r2.remaining()
            long r2 = (long) r2
            r3 = r14
            r4 = r16
            long r4 = org.lwjgl.system.MemoryUtil.memAddress(r4)
            int r0 = nFT_New_Memory_Face(r0, r1, r2, r3, r4)
            return r0
    }

    public static int nFT_Open_Face(long r11, long r13, long r15, long r17) {
            long r0 = org.lwjgl.util.freetype.FreeType.Functions.Open_Face
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
            int r0 = org.lwjgl.system.JNI.invokePPNPI(r0, r1, r2, r3, r4)
            return r0
    }

    @org.lwjgl.system.NativeType("FT_Error")
    public static int FT_Open_Face(@org.lwjgl.system.NativeType("FT_Library") long r9, @org.lwjgl.system.NativeType("FT_Open_Args const *") org.lwjgl.util.freetype.FT_Open_Args r11, @org.lwjgl.system.NativeType("FT_Long") long r12, @org.lwjgl.system.NativeType("FT_Face *") org.lwjgl.PointerBuffer r14) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lc
            r0 = r14
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
        Lc:
            r0 = r9
            r1 = r11
            long r1 = r1.address()
            r2 = r12
            r3 = r14
            long r3 = org.lwjgl.system.MemoryUtil.memAddress(r3)
            int r0 = nFT_Open_Face(r0, r1, r2, r3)
            return r0
    }

    public static int nFT_Attach_File(long r7, long r9) {
            long r0 = org.lwjgl.util.freetype.FreeType.Functions.Attach_File
            r11 = r0
            r0 = r7
            r1 = r9
            r2 = r11
            int r0 = org.lwjgl.system.JNI.invokePPI(r0, r1, r2)
            return r0
    }

    @org.lwjgl.system.NativeType("FT_Error")
    public static int FT_Attach_File(org.lwjgl.util.freetype.FT_Face r5, @org.lwjgl.system.NativeType("char const *") java.nio.ByteBuffer r6) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto La
            r0 = r6
            org.lwjgl.system.Checks.checkNT1(r0)
        La:
            r0 = r5
            long r0 = r0.address()
            r1 = r6
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            int r0 = nFT_Attach_File(r0, r1)
            return r0
    }

    @org.lwjgl.system.NativeType("FT_Error")
    public static int FT_Attach_File(org.lwjgl.util.freetype.FT_Face r5, @org.lwjgl.system.NativeType("char const *") java.lang.CharSequence r6) {
            org.lwjgl.system.MemoryStack r0 = org.lwjgl.system.MemoryStack.stackGet()
            r7 = r0
            r0 = r7
            int r0 = r0.getPointer()
            r8 = r0
            r0 = r7
            r1 = r6
            r2 = 1
            int r0 = r0.nUTF8(r1, r2)     // Catch: java.lang.Throwable -> L29
            r0 = r7
            long r0 = r0.getPointerAddress()     // Catch: java.lang.Throwable -> L29
            r9 = r0
            r0 = r5
            long r0 = r0.address()     // Catch: java.lang.Throwable -> L29
            r1 = r9
            int r0 = nFT_Attach_File(r0, r1)     // Catch: java.lang.Throwable -> L29
            r11 = r0
            r0 = r7
            r1 = r8
            r0.setPointer(r1)
            r0 = r11
            return r0
        L29:
            r12 = move-exception
            r0 = r7
            r1 = r8
            r0.setPointer(r1)
            r0 = r12
            throw r0
    }

    public static int nFT_Attach_Stream(long r7, long r9) {
            long r0 = org.lwjgl.util.freetype.FreeType.Functions.Attach_Stream
            r11 = r0
            r0 = r7
            r1 = r9
            r2 = r11
            int r0 = org.lwjgl.system.JNI.invokePPI(r0, r1, r2)
            return r0
    }

    @org.lwjgl.system.NativeType("FT_Error")
    public static int FT_Attach_Stream(org.lwjgl.util.freetype.FT_Face r5, @org.lwjgl.system.NativeType("FT_Open_Args const *") org.lwjgl.util.freetype.FT_Open_Args r6) {
            r0 = r5
            long r0 = r0.address()
            r1 = r6
            long r1 = r1.address()
            int r0 = nFT_Attach_Stream(r0, r1)
            return r0
    }

    public static int nFT_Reference_Face(long r5) {
            long r0 = org.lwjgl.util.freetype.FreeType.Functions.Reference_Face
            r7 = r0
            r0 = r5
            r1 = r7
            int r0 = org.lwjgl.system.JNI.invokePI(r0, r1)
            return r0
    }

    @org.lwjgl.system.NativeType("FT_Error")
    public static int FT_Reference_Face(org.lwjgl.util.freetype.FT_Face r3) {
            r0 = r3
            long r0 = r0.address()
            int r0 = nFT_Reference_Face(r0)
            return r0
    }

    public static int nFT_Done_Face(long r5) {
            long r0 = org.lwjgl.util.freetype.FreeType.Functions.Done_Face
            r7 = r0
            r0 = r5
            r1 = r7
            int r0 = org.lwjgl.system.JNI.invokePI(r0, r1)
            return r0
    }

    @org.lwjgl.system.NativeType("FT_Error")
    public static int FT_Done_Face(org.lwjgl.util.freetype.FT_Face r3) {
            r0 = r3
            long r0 = r0.address()
            int r0 = nFT_Done_Face(r0)
            return r0
    }

    public static int nFT_Select_Size(long r6, int r8) {
            long r0 = org.lwjgl.util.freetype.FreeType.Functions.Select_Size
            r9 = r0
            r0 = r6
            r1 = r8
            r2 = r9
            int r0 = org.lwjgl.system.JNI.invokePI(r0, r1, r2)
            return r0
    }

    @org.lwjgl.system.NativeType("FT_Error")
    public static int FT_Select_Size(org.lwjgl.util.freetype.FT_Face r4, @org.lwjgl.system.NativeType("FT_Int") int r5) {
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            int r0 = nFT_Select_Size(r0, r1)
            return r0
    }

    public static int nFT_Request_Size(long r7, long r9) {
            long r0 = org.lwjgl.util.freetype.FreeType.Functions.Request_Size
            r11 = r0
            r0 = r7
            r1 = r9
            r2 = r11
            int r0 = org.lwjgl.system.JNI.invokePPI(r0, r1, r2)
            return r0
    }

    @org.lwjgl.system.NativeType("FT_Error")
    public static int FT_Request_Size(org.lwjgl.util.freetype.FT_Face r5, org.lwjgl.util.freetype.FT_Size_Request r6) {
            r0 = r5
            long r0 = r0.address()
            r1 = r6
            long r1 = r1.address()
            int r0 = nFT_Request_Size(r0, r1)
            return r0
    }

    public static int nFT_Set_Char_Size(long r11, long r13, long r15, int r17, int r18) {
            long r0 = org.lwjgl.util.freetype.FreeType.Functions.Set_Char_Size
            r19 = r0
            r0 = r11
            r1 = r13
            r2 = r15
            r3 = r17
            r4 = r18
            r5 = r19
            int r0 = org.lwjgl.system.JNI.invokePNNI(r0, r1, r2, r3, r4, r5)
            return r0
    }

    @org.lwjgl.system.NativeType("FT_Error")
    public static int FT_Set_Char_Size(org.lwjgl.util.freetype.FT_Face r9, @org.lwjgl.system.NativeType("FT_F26Dot6") long r10, @org.lwjgl.system.NativeType("FT_F26Dot6") long r12, @org.lwjgl.system.NativeType("FT_UInt") int r14, @org.lwjgl.system.NativeType("FT_UInt") int r15) {
            r0 = r9
            long r0 = r0.address()
            r1 = r10
            r2 = r12
            r3 = r14
            r4 = r15
            int r0 = nFT_Set_Char_Size(r0, r1, r2, r3, r4)
            return r0
    }

    public static int nFT_Set_Pixel_Sizes(long r7, int r9, int r10) {
            long r0 = org.lwjgl.util.freetype.FreeType.Functions.Set_Pixel_Sizes
            r11 = r0
            r0 = r7
            r1 = r9
            r2 = r10
            r3 = r11
            int r0 = org.lwjgl.system.JNI.invokePI(r0, r1, r2, r3)
            return r0
    }

    @org.lwjgl.system.NativeType("FT_Error")
    public static int FT_Set_Pixel_Sizes(org.lwjgl.util.freetype.FT_Face r5, @org.lwjgl.system.NativeType("FT_UInt") int r6, @org.lwjgl.system.NativeType("FT_UInt") int r7) {
            r0 = r5
            long r0 = r0.address()
            r1 = r6
            r2 = r7
            int r0 = nFT_Set_Pixel_Sizes(r0, r1, r2)
            return r0
    }

    public static int nFT_Load_Glyph(long r7, int r9, int r10) {
            long r0 = org.lwjgl.util.freetype.FreeType.Functions.Load_Glyph
            r11 = r0
            r0 = r7
            r1 = r9
            r2 = r10
            r3 = r11
            int r0 = org.lwjgl.system.JNI.invokePI(r0, r1, r2, r3)
            return r0
    }

    @org.lwjgl.system.NativeType("FT_Error")
    public static int FT_Load_Glyph(org.lwjgl.util.freetype.FT_Face r5, @org.lwjgl.system.NativeType("FT_UInt") int r6, @org.lwjgl.system.NativeType("FT_Int32") int r7) {
            r0 = r5
            long r0 = r0.address()
            r1 = r6
            r2 = r7
            int r0 = nFT_Load_Glyph(r0, r1, r2)
            return r0
    }

    public static int nFT_Load_Char(long r8, long r10, int r12) {
            long r0 = org.lwjgl.util.freetype.FreeType.Functions.Load_Char
            r13 = r0
            r0 = r8
            r1 = r10
            r2 = r12
            r3 = r13
            int r0 = org.lwjgl.system.JNI.invokePNI(r0, r1, r2, r3)
            return r0
    }

    @org.lwjgl.system.NativeType("FT_Error")
    public static int FT_Load_Char(org.lwjgl.util.freetype.FT_Face r6, @org.lwjgl.system.NativeType("FT_ULong") long r7, @org.lwjgl.system.NativeType("FT_Int32") int r9) {
            r0 = r6
            long r0 = r0.address()
            r1 = r7
            r2 = r9
            int r0 = nFT_Load_Char(r0, r1, r2)
            return r0
    }

    public static void nFT_Set_Transform(long r9, long r11, long r13) {
            long r0 = org.lwjgl.util.freetype.FreeType.Functions.Set_Transform
            r15 = r0
            r0 = r9
            r1 = r11
            r2 = r13
            r3 = r15
            org.lwjgl.system.JNI.invokePPPV(r0, r1, r2, r3)
            return
    }

    public static void FT_Set_Transform(org.lwjgl.util.freetype.FT_Face r7, @javax.annotation.Nullable @org.lwjgl.system.NativeType("FT_Matrix *") org.lwjgl.util.freetype.FT_Matrix r8, @javax.annotation.Nullable @org.lwjgl.system.NativeType("FT_Vector *") org.lwjgl.util.freetype.FT_Vector r9) {
            r0 = r7
            long r0 = r0.address()
            r1 = r8
            long r1 = org.lwjgl.system.MemoryUtil.memAddressSafe(r1)
            r2 = r9
            long r2 = org.lwjgl.system.MemoryUtil.memAddressSafe(r2)
            nFT_Set_Transform(r0, r1, r2)
            return
    }

    public static void nFT_Get_Transform(long r9, long r11, long r13) {
            long r0 = org.lwjgl.util.freetype.FreeType.Functions.Get_Transform
            r15 = r0
            r0 = r9
            r1 = r11
            r2 = r13
            r3 = r15
            org.lwjgl.system.JNI.invokePPPV(r0, r1, r2, r3)
            return
    }

    public static void FT_Get_Transform(org.lwjgl.util.freetype.FT_Face r7, @javax.annotation.Nullable @org.lwjgl.system.NativeType("FT_Matrix *") org.lwjgl.util.freetype.FT_Matrix r8, @javax.annotation.Nullable @org.lwjgl.system.NativeType("FT_Vector *") org.lwjgl.util.freetype.FT_Vector r9) {
            r0 = r7
            long r0 = r0.address()
            r1 = r8
            long r1 = org.lwjgl.system.MemoryUtil.memAddressSafe(r1)
            r2 = r9
            long r2 = org.lwjgl.system.MemoryUtil.memAddressSafe(r2)
            nFT_Get_Transform(r0, r1, r2)
            return
    }

    public static int nFT_Render_Glyph(long r6, int r8) {
            long r0 = org.lwjgl.util.freetype.FreeType.Functions.Render_Glyph
            r9 = r0
            r0 = r6
            r1 = r8
            r2 = r9
            int r0 = org.lwjgl.system.JNI.invokePI(r0, r1, r2)
            return r0
    }

    @org.lwjgl.system.NativeType("FT_Error")
    public static int FT_Render_Glyph(org.lwjgl.util.freetype.FT_GlyphSlot r4, @org.lwjgl.system.NativeType("FT_Render_Mode") int r5) {
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            int r0 = nFT_Render_Glyph(r0, r1)
            return r0
    }

    public static int nFT_Get_Kerning(long r10, int r12, int r13, int r14, long r15) {
            long r0 = org.lwjgl.util.freetype.FreeType.Functions.Get_Kerning
            r17 = r0
            r0 = r10
            r1 = r12
            r2 = r13
            r3 = r14
            r4 = r15
            r5 = r17
            int r0 = org.lwjgl.system.JNI.invokePPI(r0, r1, r2, r3, r4, r5)
            return r0
    }

    @org.lwjgl.system.NativeType("FT_Error")
    public static int FT_Get_Kerning(org.lwjgl.util.freetype.FT_Face r8, @org.lwjgl.system.NativeType("FT_UInt") int r9, @org.lwjgl.system.NativeType("FT_UInt") int r10, @org.lwjgl.system.NativeType("FT_UInt") int r11, @org.lwjgl.system.NativeType("FT_Vector *") org.lwjgl.util.freetype.FT_Vector r12) {
            r0 = r8
            long r0 = r0.address()
            r1 = r9
            r2 = r10
            r3 = r11
            r4 = r12
            long r4 = r4.address()
            int r0 = nFT_Get_Kerning(r0, r1, r2, r3, r4)
            return r0
    }

    public static int nFT_Get_Track_Kerning(long r10, long r12, int r14, long r15) {
            long r0 = org.lwjgl.util.freetype.FreeType.Functions.Get_Track_Kerning
            r17 = r0
            r0 = r10
            r1 = r12
            r2 = r14
            r3 = r15
            r4 = r17
            int r0 = org.lwjgl.system.JNI.invokePNPI(r0, r1, r2, r3, r4)
            return r0
    }

    @org.lwjgl.system.NativeType("FT_Error")
    public static int FT_Get_Track_Kerning(org.lwjgl.util.freetype.FT_Face r8, @org.lwjgl.system.NativeType("FT_Fixed") long r9, @org.lwjgl.system.NativeType("FT_Int") int r11, @org.lwjgl.system.NativeType("FT_Fixed *") org.lwjgl.CLongBuffer r12) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lc
            r0 = r12
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
        Lc:
            r0 = r8
            long r0 = r0.address()
            r1 = r9
            r2 = r11
            r3 = r12
            long r3 = org.lwjgl.system.MemoryUtil.memAddress(r3)
            int r0 = nFT_Get_Track_Kerning(r0, r1, r2, r3)
            return r0
    }

    public static int nFT_Select_Charmap(long r6, int r8) {
            long r0 = org.lwjgl.util.freetype.FreeType.Functions.Select_Charmap
            r9 = r0
            r0 = r6
            r1 = r8
            r2 = r9
            int r0 = org.lwjgl.system.JNI.invokePI(r0, r1, r2)
            return r0
    }

    @org.lwjgl.system.NativeType("FT_Error")
    public static int FT_Select_Charmap(org.lwjgl.util.freetype.FT_Face r4, @org.lwjgl.system.NativeType("FT_Encoding") int r5) {
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            int r0 = nFT_Select_Charmap(r0, r1)
            return r0
    }

    public static int nFT_Set_Charmap(long r7, long r9) {
            long r0 = org.lwjgl.util.freetype.FreeType.Functions.Set_Charmap
            r11 = r0
            r0 = r7
            r1 = r9
            r2 = r11
            int r0 = org.lwjgl.system.JNI.invokePPI(r0, r1, r2)
            return r0
    }

    @org.lwjgl.system.NativeType("FT_Error")
    public static int FT_Set_Charmap(org.lwjgl.util.freetype.FT_Face r5, org.lwjgl.util.freetype.FT_CharMap r6) {
            r0 = r5
            long r0 = r0.address()
            r1 = r6
            long r1 = r1.address()
            int r0 = nFT_Set_Charmap(r0, r1)
            return r0
    }

    public static int nFT_Get_Charmap_Index(long r5) {
            long r0 = org.lwjgl.util.freetype.FreeType.Functions.Get_Charmap_Index
            r7 = r0
            r0 = r5
            r1 = r7
            int r0 = org.lwjgl.system.JNI.invokePI(r0, r1)
            return r0
    }

    @org.lwjgl.system.NativeType("FT_Int")
    public static int FT_Get_Charmap_Index(org.lwjgl.util.freetype.FT_CharMap r3) {
            r0 = r3
            long r0 = r0.address()
            int r0 = nFT_Get_Charmap_Index(r0)
            return r0
    }

    public static int nFT_Get_Char_Index(long r7, long r9) {
            long r0 = org.lwjgl.util.freetype.FreeType.Functions.Get_Char_Index
            r11 = r0
            r0 = r7
            r1 = r9
            r2 = r11
            int r0 = org.lwjgl.system.JNI.invokePNI(r0, r1, r2)
            return r0
    }

    @org.lwjgl.system.NativeType("FT_UInt")
    public static int FT_Get_Char_Index(org.lwjgl.util.freetype.FT_Face r5, @org.lwjgl.system.NativeType("FT_ULong") long r6) {
            r0 = r5
            long r0 = r0.address()
            r1 = r6
            int r0 = nFT_Get_Char_Index(r0, r1)
            return r0
    }

    public static long nFT_Get_First_Char(long r7, long r9) {
            long r0 = org.lwjgl.util.freetype.FreeType.Functions.Get_First_Char
            r11 = r0
            r0 = r7
            r1 = r9
            r2 = r11
            long r0 = org.lwjgl.system.JNI.invokePPN(r0, r1, r2)
            return r0
    }

    @org.lwjgl.system.NativeType("FT_ULong")
    public static long FT_Get_First_Char(org.lwjgl.util.freetype.FT_Face r5, @org.lwjgl.system.NativeType("FT_UInt *") java.nio.IntBuffer r6) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r6
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
        Lb:
            r0 = r5
            long r0 = r0.address()
            r1 = r6
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            long r0 = nFT_Get_First_Char(r0, r1)
            return r0
    }

    public static long nFT_Get_Next_Char(long r9, long r11, long r13) {
            long r0 = org.lwjgl.util.freetype.FreeType.Functions.Get_Next_Char
            r15 = r0
            r0 = r9
            r1 = r11
            r2 = r13
            r3 = r15
            long r0 = org.lwjgl.system.JNI.invokePNPN(r0, r1, r2, r3)
            return r0
    }

    @org.lwjgl.system.NativeType("FT_ULong")
    public static long FT_Get_Next_Char(org.lwjgl.util.freetype.FT_Face r7, @org.lwjgl.system.NativeType("FT_ULong") long r8, @org.lwjgl.system.NativeType("FT_UInt *") java.nio.IntBuffer r10) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r10
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
        Lb:
            r0 = r7
            long r0 = r0.address()
            r1 = r8
            r2 = r10
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            long r0 = nFT_Get_Next_Char(r0, r1, r2)
            return r0
    }

    public static int nFT_Face_Properties(long r8, int r10, long r11) {
            long r0 = org.lwjgl.util.freetype.FreeType.Functions.Face_Properties
            r13 = r0
            r0 = r8
            r1 = r10
            r2 = r11
            r3 = r13
            int r0 = org.lwjgl.system.JNI.invokePPI(r0, r1, r2, r3)
            return r0
    }

    @org.lwjgl.system.NativeType("FT_Error")
    public static int FT_Face_Properties(org.lwjgl.util.freetype.FT_Face r6, @org.lwjgl.system.NativeType("FT_Parameter *") org.lwjgl.util.freetype.FT_Parameter.Buffer r7) {
            r0 = r6
            long r0 = r0.address()
            r1 = r7
            int r1 = r1.remaining()
            r2 = r7
            long r2 = r2.address()
            int r0 = nFT_Face_Properties(r0, r1, r2)
            return r0
    }

    public static int nFT_Get_Name_Index(long r7, long r9) {
            long r0 = org.lwjgl.util.freetype.FreeType.Functions.Get_Name_Index
            r11 = r0
            r0 = r7
            r1 = r9
            r2 = r11
            int r0 = org.lwjgl.system.JNI.invokePPI(r0, r1, r2)
            return r0
    }

    @org.lwjgl.system.NativeType("FT_UInt")
    public static int FT_Get_Name_Index(org.lwjgl.util.freetype.FT_Face r5, @org.lwjgl.system.NativeType("FT_String const *") java.nio.ByteBuffer r6) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto La
            r0 = r6
            org.lwjgl.system.Checks.checkNT1(r0)
        La:
            r0 = r5
            long r0 = r0.address()
            r1 = r6
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            int r0 = nFT_Get_Name_Index(r0, r1)
            return r0
    }

    @org.lwjgl.system.NativeType("FT_UInt")
    public static int FT_Get_Name_Index(org.lwjgl.util.freetype.FT_Face r5, @org.lwjgl.system.NativeType("FT_String const *") java.lang.CharSequence r6) {
            org.lwjgl.system.MemoryStack r0 = org.lwjgl.system.MemoryStack.stackGet()
            r7 = r0
            r0 = r7
            int r0 = r0.getPointer()
            r8 = r0
            r0 = r7
            r1 = r6
            r2 = 1
            int r0 = r0.nUTF8(r1, r2)     // Catch: java.lang.Throwable -> L29
            r0 = r7
            long r0 = r0.getPointerAddress()     // Catch: java.lang.Throwable -> L29
            r9 = r0
            r0 = r5
            long r0 = r0.address()     // Catch: java.lang.Throwable -> L29
            r1 = r9
            int r0 = nFT_Get_Name_Index(r0, r1)     // Catch: java.lang.Throwable -> L29
            r11 = r0
            r0 = r7
            r1 = r8
            r0.setPointer(r1)
            r0 = r11
            return r0
        L29:
            r12 = move-exception
            r0 = r7
            r1 = r8
            r0.setPointer(r1)
            r0 = r12
            throw r0
    }

    public static int nFT_Get_Glyph_Name(long r9, int r11, long r12, int r14) {
            long r0 = org.lwjgl.util.freetype.FreeType.Functions.Get_Glyph_Name
            r15 = r0
            r0 = r9
            r1 = r11
            r2 = r12
            r3 = r14
            r4 = r15
            int r0 = org.lwjgl.system.JNI.invokePPI(r0, r1, r2, r3, r4)
            return r0
    }

    @org.lwjgl.system.NativeType("FT_Error")
    public static int FT_Get_Glyph_Name(org.lwjgl.util.freetype.FT_Face r7, @org.lwjgl.system.NativeType("FT_UInt") int r8, @org.lwjgl.system.NativeType("FT_Pointer") java.nio.ByteBuffer r9) {
            r0 = r7
            long r0 = r0.address()
            r1 = r8
            r2 = r9
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            r3 = r9
            int r3 = r3.remaining()
            int r0 = nFT_Get_Glyph_Name(r0, r1, r2, r3)
            return r0
    }

    public static long nFT_Get_Postscript_Name(long r5) {
            long r0 = org.lwjgl.util.freetype.FreeType.Functions.Get_Postscript_Name
            r7 = r0
            r0 = r5
            r1 = r7
            long r0 = org.lwjgl.system.JNI.invokePP(r0, r1)
            return r0
    }

    @javax.annotation.Nullable
    @org.lwjgl.system.NativeType("char const *")
    public static java.lang.String FT_Get_Postscript_Name(org.lwjgl.util.freetype.FT_Face r3) {
            r0 = r3
            long r0 = r0.address()
            long r0 = nFT_Get_Postscript_Name(r0)
            r4 = r0
            r0 = r4
            java.lang.String r0 = org.lwjgl.system.MemoryUtil.memASCIISafe(r0)
            return r0
    }

    public static int nFT_Get_SubGlyph_Info(long r16, int r18, long r19, long r21, long r23, long r25, long r27) {
            long r0 = org.lwjgl.util.freetype.FreeType.Functions.Get_SubGlyph_Info
            r29 = r0
            r0 = r16
            r1 = r18
            r2 = r19
            r3 = r21
            r4 = r23
            r5 = r25
            r6 = r27
            r7 = r29
            int r0 = org.lwjgl.system.JNI.invokePPPPPPI(r0, r1, r2, r3, r4, r5, r6, r7)
            return r0
    }

    @org.lwjgl.system.NativeType("FT_Error")
    public static int FT_Get_SubGlyph_Info(org.lwjgl.util.freetype.FT_GlyphSlot r14, @org.lwjgl.system.NativeType("FT_UInt") int r15, @org.lwjgl.system.NativeType("FT_Int *") java.nio.IntBuffer r16, @org.lwjgl.system.NativeType("FT_UInt *") java.nio.IntBuffer r17, @org.lwjgl.system.NativeType("FT_Int *") java.nio.IntBuffer r18, @org.lwjgl.system.NativeType("FT_Int *") java.nio.IntBuffer r19, @org.lwjgl.system.NativeType("FT_Matrix *") org.lwjgl.util.freetype.FT_Matrix r20) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L1c
            r0 = r16
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
            r0 = r17
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
            r0 = r18
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
            r0 = r19
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
        L1c:
            r0 = r14
            long r0 = r0.address()
            r1 = r15
            r2 = r16
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            r3 = r17
            long r3 = org.lwjgl.system.MemoryUtil.memAddress(r3)
            r4 = r18
            long r4 = org.lwjgl.system.MemoryUtil.memAddress(r4)
            r5 = r19
            long r5 = org.lwjgl.system.MemoryUtil.memAddress(r5)
            r6 = r20
            long r6 = r6.address()
            int r0 = nFT_Get_SubGlyph_Info(r0, r1, r2, r3, r4, r5, r6)
            return r0
    }

    public static short nFT_Get_FSType_Flags(long r5) {
            long r0 = org.lwjgl.util.freetype.FreeType.Functions.Get_FSType_Flags
            r7 = r0
            r0 = r5
            r1 = r7
            short r0 = org.lwjgl.system.JNI.invokePC(r0, r1)
            return r0
    }

    @org.lwjgl.system.NativeType("FT_UShort")
    public static short FT_Get_FSType_Flags(org.lwjgl.util.freetype.FT_Face r3) {
            r0 = r3
            long r0 = r0.address()
            short r0 = nFT_Get_FSType_Flags(r0)
            return r0
    }

    public static int nFT_Face_GetCharVariantIndex(long r9, long r11, long r13) {
            long r0 = org.lwjgl.util.freetype.FreeType.Functions.Face_GetCharVariantIndex
            r15 = r0
            r0 = r9
            r1 = r11
            r2 = r13
            r3 = r15
            int r0 = org.lwjgl.system.JNI.invokePNNI(r0, r1, r2, r3)
            return r0
    }

    @org.lwjgl.system.NativeType("FT_UInt")
    public static int FT_Face_GetCharVariantIndex(org.lwjgl.util.freetype.FT_Face r7, @org.lwjgl.system.NativeType("FT_ULong") long r8, @org.lwjgl.system.NativeType("FT_ULong") long r10) {
            r0 = r7
            long r0 = r0.address()
            r1 = r8
            r2 = r10
            int r0 = nFT_Face_GetCharVariantIndex(r0, r1, r2)
            return r0
    }

    public static int nFT_Face_GetCharVariantIsDefault(long r9, long r11, long r13) {
            long r0 = org.lwjgl.util.freetype.FreeType.Functions.Face_GetCharVariantIsDefault
            r15 = r0
            r0 = r9
            r1 = r11
            r2 = r13
            r3 = r15
            int r0 = org.lwjgl.system.JNI.invokePNNI(r0, r1, r2, r3)
            return r0
    }

    @org.lwjgl.system.NativeType("FT_Int")
    public static int FT_Face_GetCharVariantIsDefault(org.lwjgl.util.freetype.FT_Face r7, @org.lwjgl.system.NativeType("FT_ULong") long r8, @org.lwjgl.system.NativeType("FT_ULong") long r10) {
            r0 = r7
            long r0 = r0.address()
            r1 = r8
            r2 = r10
            int r0 = nFT_Face_GetCharVariantIsDefault(r0, r1, r2)
            return r0
    }

    public static long nFT_Face_GetVariantSelectors(long r5) {
            long r0 = org.lwjgl.util.freetype.FreeType.Functions.Face_GetVariantSelectors
            r7 = r0
            r0 = r5
            r1 = r7
            long r0 = org.lwjgl.system.JNI.invokePP(r0, r1)
            return r0
    }

    @org.lwjgl.system.NativeType("FT_UInt32 *")
    public static long FT_Face_GetVariantSelectors(org.lwjgl.util.freetype.FT_Face r3) {
            r0 = r3
            long r0 = r0.address()
            long r0 = nFT_Face_GetVariantSelectors(r0)
            return r0
    }

    public static long nFT_Face_GetVariantsOfChar(long r7, long r9) {
            long r0 = org.lwjgl.util.freetype.FreeType.Functions.Face_GetVariantsOfChar
            r11 = r0
            r0 = r7
            r1 = r9
            r2 = r11
            long r0 = org.lwjgl.system.JNI.invokePNP(r0, r1, r2)
            return r0
    }

    @org.lwjgl.system.NativeType("FT_UInt32 *")
    public static long FT_Face_GetVariantsOfChar(org.lwjgl.util.freetype.FT_Face r5, @org.lwjgl.system.NativeType("FT_ULong") long r6) {
            r0 = r5
            long r0 = r0.address()
            r1 = r6
            long r0 = nFT_Face_GetVariantsOfChar(r0, r1)
            return r0
    }

    public static long nFT_Face_GetCharsOfVariant(long r7, long r9) {
            long r0 = org.lwjgl.util.freetype.FreeType.Functions.Face_GetCharsOfVariant
            r11 = r0
            r0 = r7
            r1 = r9
            r2 = r11
            long r0 = org.lwjgl.system.JNI.invokePNP(r0, r1, r2)
            return r0
    }

    @org.lwjgl.system.NativeType("FT_UInt32 *")
    public static long FT_Face_GetCharsOfVariant(org.lwjgl.util.freetype.FT_Face r5, @org.lwjgl.system.NativeType("FT_ULong") long r6) {
            r0 = r5
            long r0 = r0.address()
            r1 = r6
            long r0 = nFT_Face_GetCharsOfVariant(r0, r1)
            return r0
    }

    @org.lwjgl.system.NativeType("FT_Long")
    public static long FT_MulDiv(@org.lwjgl.system.NativeType("FT_Long") long r9, @org.lwjgl.system.NativeType("FT_Long") long r11, @org.lwjgl.system.NativeType("FT_Long") long r13) {
            long r0 = org.lwjgl.util.freetype.FreeType.Functions.MulDiv
            r15 = r0
            r0 = r9
            r1 = r11
            r2 = r13
            r3 = r15
            long r0 = org.lwjgl.system.JNI.invokeNNNN(r0, r1, r2, r3)
            return r0
    }

    @org.lwjgl.system.NativeType("FT_Long")
    public static long FT_MulFix(@org.lwjgl.system.NativeType("FT_Long") long r7, @org.lwjgl.system.NativeType("FT_Long") long r9) {
            long r0 = org.lwjgl.util.freetype.FreeType.Functions.MulFix
            r11 = r0
            r0 = r7
            r1 = r9
            r2 = r11
            long r0 = org.lwjgl.system.JNI.invokeNNN(r0, r1, r2)
            return r0
    }

    @org.lwjgl.system.NativeType("FT_Long")
    public static long FT_DivFix(@org.lwjgl.system.NativeType("FT_Long") long r7, @org.lwjgl.system.NativeType("FT_Long") long r9) {
            long r0 = org.lwjgl.util.freetype.FreeType.Functions.DivFix
            r11 = r0
            r0 = r7
            r1 = r9
            r2 = r11
            long r0 = org.lwjgl.system.JNI.invokeNNN(r0, r1, r2)
            return r0
    }

    @org.lwjgl.system.NativeType("FT_Fixed")
    public static long FT_RoundFix(@org.lwjgl.system.NativeType("FT_Fixed") long r5) {
            long r0 = org.lwjgl.util.freetype.FreeType.Functions.RoundFix
            r7 = r0
            r0 = r5
            r1 = r7
            long r0 = org.lwjgl.system.JNI.invokeNN(r0, r1)
            return r0
    }

    @org.lwjgl.system.NativeType("FT_Fixed")
    public static long FT_CeilFix(@org.lwjgl.system.NativeType("FT_Fixed") long r5) {
            long r0 = org.lwjgl.util.freetype.FreeType.Functions.CeilFix
            r7 = r0
            r0 = r5
            r1 = r7
            long r0 = org.lwjgl.system.JNI.invokeNN(r0, r1)
            return r0
    }

    @org.lwjgl.system.NativeType("FT_Fixed")
    public static long FT_FloorFix(@org.lwjgl.system.NativeType("FT_Fixed") long r5) {
            long r0 = org.lwjgl.util.freetype.FreeType.Functions.FloorFix
            r7 = r0
            r0 = r5
            r1 = r7
            long r0 = org.lwjgl.system.JNI.invokeNN(r0, r1)
            return r0
    }

    public static void nFT_Vector_Transform(long r7, long r9) {
            long r0 = org.lwjgl.util.freetype.FreeType.Functions.Vector_Transform
            r11 = r0
            r0 = r7
            r1 = r9
            r2 = r11
            org.lwjgl.system.JNI.invokePPV(r0, r1, r2)
            return
    }

    public static void FT_Vector_Transform(@org.lwjgl.system.NativeType("FT_Vector *") org.lwjgl.util.freetype.FT_Vector r5, @org.lwjgl.system.NativeType("FT_Matrix const *") org.lwjgl.util.freetype.FT_Matrix r6) {
            r0 = r5
            long r0 = r0.address()
            r1 = r6
            long r1 = r1.address()
            nFT_Vector_Transform(r0, r1)
            return
    }

    public static void nFT_Library_Version(long r11, long r13, long r15, long r17) {
            long r0 = org.lwjgl.util.freetype.FreeType.Functions.Library_Version
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

    public static void FT_Library_Version(@org.lwjgl.system.NativeType("FT_Library") long r9, @org.lwjgl.system.NativeType("FT_Int *") java.nio.IntBuffer r11, @org.lwjgl.system.NativeType("FT_Int *") java.nio.IntBuffer r12, @org.lwjgl.system.NativeType("FT_Int *") java.nio.IntBuffer r13) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L16
            r0 = r11
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
            r0 = r12
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
            r0 = r13
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
        L16:
            r0 = r9
            r1 = r11
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            r2 = r12
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            r3 = r13
            long r3 = org.lwjgl.system.MemoryUtil.memAddress(r3)
            nFT_Library_Version(r0, r1, r2, r3)
            return
    }

    public static boolean nFT_Face_CheckTrueTypePatents(long r5) {
            long r0 = org.lwjgl.util.freetype.FreeType.Functions.Face_CheckTrueTypePatents
            r7 = r0
            r0 = r5
            r1 = r7
            boolean r0 = org.lwjgl.system.JNI.invokePZ(r0, r1)
            return r0
    }

    @org.lwjgl.system.NativeType("FT_Bool")
    public static boolean FT_Face_CheckTrueTypePatents(org.lwjgl.util.freetype.FT_Face r3) {
            r0 = r3
            long r0 = r0.address()
            boolean r0 = nFT_Face_CheckTrueTypePatents(r0)
            return r0
    }

    public static boolean nFT_Face_SetUnpatentedHinting(long r6, boolean r8) {
            long r0 = org.lwjgl.util.freetype.FreeType.Functions.Face_SetUnpatentedHinting
            r9 = r0
            r0 = r6
            r1 = r8
            r2 = r9
            boolean r0 = org.lwjgl.system.JNI.invokePZ(r0, r1, r2)
            return r0
    }

    @org.lwjgl.system.NativeType("FT_Bool")
    public static boolean FT_Face_SetUnpatentedHinting(org.lwjgl.util.freetype.FT_Face r4, @org.lwjgl.system.NativeType("FT_Bool") boolean r5) {
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            boolean r0 = nFT_Face_SetUnpatentedHinting(r0, r1)
            return r0
    }

    public static int nFT_Get_Advance(long r9, int r11, int r12, long r13) {
            long r0 = org.lwjgl.util.freetype.FreeType.Functions.Get_Advance
            r15 = r0
            r0 = r9
            r1 = r11
            r2 = r12
            r3 = r13
            r4 = r15
            int r0 = org.lwjgl.system.JNI.invokePPI(r0, r1, r2, r3, r4)
            return r0
    }

    @org.lwjgl.system.NativeType("FT_Error")
    public static int FT_Get_Advance(org.lwjgl.util.freetype.FT_Face r7, @org.lwjgl.system.NativeType("FT_UInt") int r8, @org.lwjgl.system.NativeType("FT_Int32") int r9, @org.lwjgl.system.NativeType("FT_Fixed *") org.lwjgl.CLongBuffer r10) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r10
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
        Lb:
            r0 = r7
            long r0 = r0.address()
            r1 = r8
            r2 = r9
            r3 = r10
            long r3 = org.lwjgl.system.MemoryUtil.memAddress(r3)
            int r0 = nFT_Get_Advance(r0, r1, r2, r3)
            return r0
    }

    public static int nFT_Get_Advances(long r10, int r12, int r13, int r14, long r15) {
            long r0 = org.lwjgl.util.freetype.FreeType.Functions.Get_Advances
            r17 = r0
            r0 = r10
            r1 = r12
            r2 = r13
            r3 = r14
            r4 = r15
            r5 = r17
            int r0 = org.lwjgl.system.JNI.invokePPI(r0, r1, r2, r3, r4, r5)
            return r0
    }

    @org.lwjgl.system.NativeType("FT_Error")
    public static int FT_Get_Advances(org.lwjgl.util.freetype.FT_Face r8, @org.lwjgl.system.NativeType("FT_UInt") int r9, @org.lwjgl.system.NativeType("FT_Int32") int r10, @org.lwjgl.system.NativeType("FT_Fixed *") org.lwjgl.CLongBuffer r11) {
            r0 = r8
            long r0 = r0.address()
            r1 = r9
            r2 = r11
            int r2 = r2.remaining()
            r3 = r10
            r4 = r11
            long r4 = org.lwjgl.system.MemoryUtil.memAddress(r4)
            int r0 = nFT_Get_Advances(r0, r1, r2, r3, r4)
            return r0
    }

    public static int nFT_Outline_Get_BBox(long r7, long r9) {
            long r0 = org.lwjgl.util.freetype.FreeType.Functions.Outline_Get_BBox
            r11 = r0
            r0 = r7
            r1 = r9
            r2 = r11
            int r0 = org.lwjgl.system.JNI.invokePPI(r0, r1, r2)
            return r0
    }

    @org.lwjgl.system.NativeType("FT_Error")
    public static int FT_Outline_Get_BBox(@org.lwjgl.system.NativeType("FT_Outline *") org.lwjgl.util.freetype.FT_Outline r5, @org.lwjgl.system.NativeType("FT_BBox *") org.lwjgl.util.freetype.FT_BBox r6) {
            r0 = r5
            long r0 = r0.address()
            r1 = r6
            long r1 = r1.address()
            int r0 = nFT_Outline_Get_BBox(r0, r1)
            return r0
    }

    public static int nFT_Get_BDF_Charset_ID(long r9, long r11, long r13) {
            long r0 = org.lwjgl.util.freetype.FreeType.Functions.Get_BDF_Charset_ID
            r15 = r0
            r0 = r9
            r1 = r11
            r2 = r13
            r3 = r15
            int r0 = org.lwjgl.system.JNI.invokePPPI(r0, r1, r2, r3)
            return r0
    }

    @org.lwjgl.system.NativeType("FT_Error")
    public static int FT_Get_BDF_Charset_ID(org.lwjgl.util.freetype.FT_Face r7, @org.lwjgl.system.NativeType("char const **") org.lwjgl.PointerBuffer r8, @org.lwjgl.system.NativeType("char const **") org.lwjgl.PointerBuffer r9) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L10
            r0 = r8
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
            r0 = r9
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
        L10:
            r0 = r7
            long r0 = r0.address()
            r1 = r8
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            r2 = r9
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            int r0 = nFT_Get_BDF_Charset_ID(r0, r1, r2)
            return r0
    }

    public static int nFT_Get_BDF_Property(long r9, long r11, long r13) {
            long r0 = org.lwjgl.util.freetype.FreeType.Functions.Get_BDF_Property
            r15 = r0
            r0 = r9
            r1 = r11
            r2 = r13
            r3 = r15
            int r0 = org.lwjgl.system.JNI.invokePPPI(r0, r1, r2, r3)
            return r0
    }

    @org.lwjgl.system.NativeType("FT_Error")
    public static int FT_Get_BDF_Property(org.lwjgl.util.freetype.FT_Face r7, @org.lwjgl.system.NativeType("char const *") java.nio.ByteBuffer r8, @org.lwjgl.system.NativeType("BDF_PropertyRec *") org.lwjgl.util.freetype.BDF_Property r9) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto La
            r0 = r8
            org.lwjgl.system.Checks.checkNT1(r0)
        La:
            r0 = r7
            long r0 = r0.address()
            r1 = r8
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            r2 = r9
            long r2 = r2.address()
            int r0 = nFT_Get_BDF_Property(r0, r1, r2)
            return r0
    }

    @org.lwjgl.system.NativeType("FT_Error")
    public static int FT_Get_BDF_Property(org.lwjgl.util.freetype.FT_Face r7, @org.lwjgl.system.NativeType("char const *") java.lang.CharSequence r8, @org.lwjgl.system.NativeType("BDF_PropertyRec *") org.lwjgl.util.freetype.BDF_Property r9) {
            org.lwjgl.system.MemoryStack r0 = org.lwjgl.system.MemoryStack.stackGet()
            r10 = r0
            r0 = r10
            int r0 = r0.getPointer()
            r11 = r0
            r0 = r10
            r1 = r8
            r2 = 1
            int r0 = r0.nASCII(r1, r2)     // Catch: java.lang.Throwable -> L2f
            r0 = r10
            long r0 = r0.getPointerAddress()     // Catch: java.lang.Throwable -> L2f
            r12 = r0
            r0 = r7
            long r0 = r0.address()     // Catch: java.lang.Throwable -> L2f
            r1 = r12
            r2 = r9
            long r2 = r2.address()     // Catch: java.lang.Throwable -> L2f
            int r0 = nFT_Get_BDF_Property(r0, r1, r2)     // Catch: java.lang.Throwable -> L2f
            r14 = r0
            r0 = r10
            r1 = r11
            r0.setPointer(r1)
            r0 = r14
            return r0
        L2f:
            r15 = move-exception
            r0 = r10
            r1 = r11
            r0.setPointer(r1)
            r0 = r15
            throw r0
    }

    public static void nFT_Bitmap_Init(long r5) {
            long r0 = org.lwjgl.util.freetype.FreeType.Functions.Bitmap_Init
            r7 = r0
            r0 = r5
            r1 = r7
            org.lwjgl.system.JNI.invokePV(r0, r1)
            return
    }

    public static void FT_Bitmap_Init(@org.lwjgl.system.NativeType("FT_Bitmap *") org.lwjgl.util.freetype.FT_Bitmap r3) {
            r0 = r3
            long r0 = r0.address()
            nFT_Bitmap_Init(r0)
            return
    }

    public static int nFT_Bitmap_Copy(long r9, long r11, long r13) {
            long r0 = org.lwjgl.util.freetype.FreeType.Functions.Bitmap_Copy
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

    @org.lwjgl.system.NativeType("FT_Error")
    public static int FT_Bitmap_Copy(@org.lwjgl.system.NativeType("FT_Library") long r7, @org.lwjgl.system.NativeType("FT_Bitmap const *") org.lwjgl.util.freetype.FT_Bitmap r9, @org.lwjgl.system.NativeType("FT_Bitmap *") org.lwjgl.util.freetype.FT_Bitmap r10) {
            r0 = r7
            r1 = r9
            long r1 = r1.address()
            r2 = r10
            long r2 = r2.address()
            int r0 = nFT_Bitmap_Copy(r0, r1, r2)
            return r0
    }

    public static int nFT_Bitmap_Embolden(long r11, long r13, long r15, long r17) {
            long r0 = org.lwjgl.util.freetype.FreeType.Functions.Bitmap_Embolden
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
            int r0 = org.lwjgl.system.JNI.invokePPNNI(r0, r1, r2, r3, r4)
            return r0
    }

    @org.lwjgl.system.NativeType("FT_Error")
    public static int FT_Bitmap_Embolden(@org.lwjgl.system.NativeType("FT_Library") long r9, @org.lwjgl.system.NativeType("FT_Bitmap *") org.lwjgl.util.freetype.FT_Bitmap r11, @org.lwjgl.system.NativeType("FT_Pos") long r12, @org.lwjgl.system.NativeType("FT_Pos") long r14) {
            r0 = r9
            r1 = r11
            long r1 = r1.address()
            r2 = r12
            r3 = r14
            int r0 = nFT_Bitmap_Embolden(r0, r1, r2, r3)
            return r0
    }

    public static int nFT_Bitmap_Convert(long r10, long r12, long r14, int r16) {
            long r0 = org.lwjgl.util.freetype.FreeType.Functions.Bitmap_Convert
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

    @org.lwjgl.system.NativeType("FT_Error")
    public static int FT_Bitmap_Convert(@org.lwjgl.system.NativeType("FT_Library") long r8, @org.lwjgl.system.NativeType("FT_Bitmap const *") org.lwjgl.util.freetype.FT_Bitmap r10, @org.lwjgl.system.NativeType("FT_Bitmap *") org.lwjgl.util.freetype.FT_Bitmap r11, @org.lwjgl.system.NativeType("FT_Int") int r12) {
            r0 = r8
            r1 = r10
            long r1 = r1.address()
            r2 = r11
            long r2 = r2.address()
            r3 = r12
            int r0 = nFT_Bitmap_Convert(r0, r1, r2, r3)
            return r0
    }

    public static int nFT_Bitmap_Blend(long r9, long r11, long r13, long r15, long r17, long r19) {
            long r0 = org.lwjgl.util.freetype.FreeType.Functions.Bitmap_Blend
            r21 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L10
            r0 = r9
            long r0 = org.lwjgl.system.Checks.check(r0)
        L10:
            org.lwjgl.system.MemoryStack r0 = org.lwjgl.system.MemoryStack.stackGet()
            r23 = r0
            r0 = r23
            int r0 = r0.getPointer()
            r24 = r0
            r0 = r23
            r1 = 0
            long r0 = r0.nint(r1)     // Catch: java.lang.Throwable -> Lb1
            r25 = r0
            r0 = r23
            int r1 = org.lwjgl.system.MemoryStack.POINTER_SIZE     // Catch: java.lang.Throwable -> Lb1
            int r2 = org.lwjgl.system.MemoryStack.POINTER_SIZE     // Catch: java.lang.Throwable -> Lb1
            r3 = 6
            int r2 = r2 * r3
            long r0 = r0.nmalloc(r1, r2)     // Catch: java.lang.Throwable -> Lb1
            r27 = r0
            r0 = r27
            r1 = r23
            r2 = r9
            long r1 = r1.npointer(r2)     // Catch: java.lang.Throwable -> Lb1
            org.lwjgl.system.MemoryUtil.memPutAddress(r0, r1)     // Catch: java.lang.Throwable -> Lb1
            r0 = r27
            int r1 = org.lwjgl.system.MemoryStack.POINTER_SIZE     // Catch: java.lang.Throwable -> Lb1
            long r1 = (long) r1     // Catch: java.lang.Throwable -> Lb1
            long r0 = r0 + r1
            r1 = r23
            r2 = r11
            long r1 = r1.npointer(r2)     // Catch: java.lang.Throwable -> Lb1
            org.lwjgl.system.MemoryUtil.memPutAddress(r0, r1)     // Catch: java.lang.Throwable -> Lb1
            r0 = r27
            r1 = 2
            int r2 = org.lwjgl.system.MemoryStack.POINTER_SIZE     // Catch: java.lang.Throwable -> Lb1
            int r1 = r1 * r2
            long r1 = (long) r1     // Catch: java.lang.Throwable -> Lb1
            long r0 = r0 + r1
            r1 = r13
            org.lwjgl.system.MemoryUtil.memPutAddress(r0, r1)     // Catch: java.lang.Throwable -> Lb1
            r0 = r27
            r1 = 3
            int r2 = org.lwjgl.system.MemoryStack.POINTER_SIZE     // Catch: java.lang.Throwable -> Lb1
            int r1 = r1 * r2
            long r1 = (long) r1     // Catch: java.lang.Throwable -> Lb1
            long r0 = r0 + r1
            r1 = r23
            r2 = r15
            long r1 = r1.npointer(r2)     // Catch: java.lang.Throwable -> Lb1
            org.lwjgl.system.MemoryUtil.memPutAddress(r0, r1)     // Catch: java.lang.Throwable -> Lb1
            r0 = r27
            r1 = 4
            int r2 = org.lwjgl.system.MemoryStack.POINTER_SIZE     // Catch: java.lang.Throwable -> Lb1
            int r1 = r1 * r2
            long r1 = (long) r1     // Catch: java.lang.Throwable -> Lb1
            long r0 = r0 + r1
            r1 = r23
            r2 = r17
            long r1 = r1.npointer(r2)     // Catch: java.lang.Throwable -> Lb1
            org.lwjgl.system.MemoryUtil.memPutAddress(r0, r1)     // Catch: java.lang.Throwable -> Lb1
            r0 = r27
            r1 = 5
            int r2 = org.lwjgl.system.MemoryStack.POINTER_SIZE     // Catch: java.lang.Throwable -> Lb1
            int r1 = r1 * r2
            long r1 = (long) r1     // Catch: java.lang.Throwable -> Lb1
            long r0 = r0 + r1
            r1 = r19
            org.lwjgl.system.MemoryUtil.memPutAddress(r0, r1)     // Catch: java.lang.Throwable -> Lb1
            org.lwjgl.system.libffi.FFICIF r0 = org.lwjgl.util.freetype.FreeType.FT_Bitmap_BlendCIF     // Catch: java.lang.Throwable -> Lb1
            long r0 = r0.address()     // Catch: java.lang.Throwable -> Lb1
            r1 = r21
            r2 = r25
            r3 = r27
            org.lwjgl.system.libffi.LibFFI.nffi_call(r0, r1, r2, r3)     // Catch: java.lang.Throwable -> Lb1
            r0 = r25
            int r0 = org.lwjgl.system.MemoryUtil.memGetInt(r0)     // Catch: java.lang.Throwable -> Lb1
            r29 = r0
            r0 = r23
            r1 = r24
            r0.setPointer(r1)
            r0 = r29
            return r0
        Lb1:
            r30 = move-exception
            r0 = r23
            r1 = r24
            r0.setPointer(r1)
            r0 = r30
            throw r0
    }

    @org.lwjgl.system.NativeType("FT_Error")
    public static int FT_Bitmap_Blend(@org.lwjgl.system.NativeType("FT_Library") long r13, @org.lwjgl.system.NativeType("FT_Bitmap const *") org.lwjgl.util.freetype.FT_Bitmap r15, @org.lwjgl.system.NativeType("FT_Vector const") org.lwjgl.util.freetype.FT_Vector r16, @org.lwjgl.system.NativeType("FT_Bitmap *") org.lwjgl.util.freetype.FT_Bitmap r17, @org.lwjgl.system.NativeType("FT_Vector *") org.lwjgl.util.freetype.FT_Vector r18, org.lwjgl.util.freetype.FT_Color r19) {
            r0 = r13
            r1 = r15
            long r1 = r1.address()
            r2 = r16
            long r2 = r2.address()
            r3 = r17
            long r3 = r3.address()
            r4 = r18
            long r4 = r4.address()
            r5 = r19
            long r5 = r5.address()
            int r0 = nFT_Bitmap_Blend(r0, r1, r2, r3, r4, r5)
            return r0
    }

    public static int nFT_GlyphSlot_Own_Bitmap(long r5) {
            long r0 = org.lwjgl.util.freetype.FreeType.Functions.GlyphSlot_Own_Bitmap
            r7 = r0
            r0 = r5
            r1 = r7
            int r0 = org.lwjgl.system.JNI.invokePI(r0, r1)
            return r0
    }

    @org.lwjgl.system.NativeType("FT_Error")
    public static int FT_GlyphSlot_Own_Bitmap(org.lwjgl.util.freetype.FT_GlyphSlot r3) {
            r0 = r3
            long r0 = r0.address()
            int r0 = nFT_GlyphSlot_Own_Bitmap(r0)
            return r0
    }

    public static int nFT_Bitmap_Done(long r7, long r9) {
            long r0 = org.lwjgl.util.freetype.FreeType.Functions.Bitmap_Done
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

    @org.lwjgl.system.NativeType("FT_Error")
    public static int FT_Bitmap_Done(@org.lwjgl.system.NativeType("FT_Library") long r5, @org.lwjgl.system.NativeType("FT_Bitmap *") org.lwjgl.util.freetype.FT_Bitmap r7) {
            r0 = r5
            r1 = r7
            long r1 = r1.address()
            int r0 = nFT_Bitmap_Done(r0, r1)
            return r0
    }

    public static int nFT_Stream_OpenBzip2(long r7, long r9) {
            long r0 = org.lwjgl.util.freetype.FreeType.Functions.Stream_OpenBzip2
            r11 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L11
            r0 = r11
            long r0 = org.lwjgl.system.Checks.check(r0)
        L11:
            r0 = r7
            r1 = r9
            r2 = r11
            int r0 = org.lwjgl.system.JNI.invokePPI(r0, r1, r2)
            return r0
    }

    @org.lwjgl.system.NativeType("FT_Error")
    public static int FT_Stream_OpenBzip2(org.lwjgl.util.freetype.FT_Stream r5, org.lwjgl.util.freetype.FT_Stream r6) {
            r0 = r5
            long r0 = r0.address()
            r1 = r6
            long r1 = r1.address()
            int r0 = nFT_Stream_OpenBzip2(r0, r1)
            return r0
    }

    public static int nFTC_Manager_New(long r15, int r17, int r18, long r19, long r21, long r23, long r25) {
            long r0 = org.lwjgl.util.freetype.FreeType.Functions.FTC_Manager_New
            r27 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L10
            r0 = r15
            long r0 = org.lwjgl.system.Checks.check(r0)
        L10:
            r0 = r15
            r1 = r17
            r2 = r18
            r3 = r19
            r4 = r21
            r5 = r23
            r6 = r25
            r7 = r27
            int r0 = org.lwjgl.system.JNI.invokePNPPPI(r0, r1, r2, r3, r4, r5, r6, r7)
            return r0
    }

    @org.lwjgl.system.NativeType("FT_Error")
    public static int FTC_Manager_New(@org.lwjgl.system.NativeType("FT_Library") long r13, @org.lwjgl.system.NativeType("FT_UInt") int r15, @org.lwjgl.system.NativeType("FT_UInt") int r16, @org.lwjgl.system.NativeType("FT_ULong") long r17, @org.lwjgl.system.NativeType("FTC_Face_Requester") org.lwjgl.util.freetype.FTC_Face_RequesterI r19, @javax.annotation.Nullable @org.lwjgl.system.NativeType("FT_Pointer") java.nio.ByteBuffer r20, @org.lwjgl.system.NativeType("FTC_Manager *") org.lwjgl.PointerBuffer r21) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lc
            r0 = r21
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
        Lc:
            r0 = r13
            r1 = r15
            r2 = r16
            r3 = r17
            r4 = r19
            long r4 = r4.address()
            r5 = r20
            long r5 = org.lwjgl.system.MemoryUtil.memAddressSafe(r5)
            r6 = r21
            long r6 = org.lwjgl.system.MemoryUtil.memAddress(r6)
            int r0 = nFTC_Manager_New(r0, r1, r2, r3, r4, r5, r6)
            return r0
    }

    public static void FTC_Manager_Reset(@org.lwjgl.system.NativeType("FTC_Manager") long r5) {
            long r0 = org.lwjgl.util.freetype.FreeType.Functions.FTC_Manager_Reset
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

    public static void FTC_Manager_Done(@org.lwjgl.system.NativeType("FTC_Manager") long r5) {
            long r0 = org.lwjgl.util.freetype.FreeType.Functions.FTC_Manager_Done
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

    public static int nFTC_Manager_LookupFace(long r9, long r11, long r13) {
            long r0 = org.lwjgl.util.freetype.FreeType.Functions.FTC_Manager_LookupFace
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

    @org.lwjgl.system.NativeType("FT_Error")
    public static int FTC_Manager_LookupFace(@org.lwjgl.system.NativeType("FTC_Manager") long r7, @org.lwjgl.system.NativeType("FTC_FaceID") long r9, @org.lwjgl.system.NativeType("FT_Face *") org.lwjgl.PointerBuffer r11) {
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
            int r0 = nFTC_Manager_LookupFace(r0, r1, r2)
            return r0
    }

    public static int nFTC_Manager_LookupSize(long r9, long r11, long r13) {
            long r0 = org.lwjgl.util.freetype.FreeType.Functions.FTC_Manager_LookupSize
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

    @org.lwjgl.system.NativeType("FT_Error")
    public static int FTC_Manager_LookupSize(@org.lwjgl.system.NativeType("FTC_Manager") long r7, org.lwjgl.util.freetype.FTC_Scaler r9, @org.lwjgl.system.NativeType("FT_Size *") org.lwjgl.PointerBuffer r10) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r10
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
        Lb:
            r0 = r7
            r1 = r9
            long r1 = r1.address()
            r2 = r10
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            int r0 = nFTC_Manager_LookupSize(r0, r1, r2)
            return r0
    }

    public static void FTC_Node_Unref(@org.lwjgl.system.NativeType("FTC_Node") long r7, @org.lwjgl.system.NativeType("FTC_Manager") long r9) {
            long r0 = org.lwjgl.util.freetype.FreeType.Functions.FTC_Node_Unref
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

    public static void FTC_Manager_RemoveFaceID(@org.lwjgl.system.NativeType("FTC_Manager") long r7, @org.lwjgl.system.NativeType("FTC_FaceID") long r9) {
            long r0 = org.lwjgl.util.freetype.FreeType.Functions.FTC_Manager_RemoveFaceID
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

    public static int nFTC_CMapCache_New(long r7, long r9) {
            long r0 = org.lwjgl.util.freetype.FreeType.Functions.FTC_CMapCache_New
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

    @org.lwjgl.system.NativeType("FT_Error")
    public static int FTC_CMapCache_New(@org.lwjgl.system.NativeType("FTC_Manager") long r5, @org.lwjgl.system.NativeType("FTC_CMapCache *") org.lwjgl.PointerBuffer r7) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r7
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
        Lb:
            r0 = r5
            r1 = r7
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            int r0 = nFTC_CMapCache_New(r0, r1)
            return r0
    }

    @org.lwjgl.system.NativeType("FT_UInt")
    public static int FTC_CMapCache_Lookup(@org.lwjgl.system.NativeType("FTC_CMapCache") long r9, @org.lwjgl.system.NativeType("FTC_FaceID") long r11, @org.lwjgl.system.NativeType("FT_Int") int r13, @org.lwjgl.system.NativeType("FT_UInt32") int r14) {
            long r0 = org.lwjgl.util.freetype.FreeType.Functions.FTC_CMapCache_Lookup
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
            r3 = r14
            r4 = r15
            int r0 = org.lwjgl.system.JNI.invokePPI(r0, r1, r2, r3, r4)
            return r0
    }

    public static int nFTC_ImageCache_New(long r7, long r9) {
            long r0 = org.lwjgl.util.freetype.FreeType.Functions.FTC_ImageCache_New
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

    @org.lwjgl.system.NativeType("FT_Error")
    public static int FTC_ImageCache_New(@org.lwjgl.system.NativeType("FTC_Manager") long r5, @org.lwjgl.system.NativeType("FTC_ImageCache *") org.lwjgl.PointerBuffer r7) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r7
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
        Lb:
            r0 = r5
            r1 = r7
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            int r0 = nFTC_ImageCache_New(r0, r1)
            return r0
    }

    public static int nFTC_ImageCache_Lookup(long r12, long r14, int r16, long r17, long r19) {
            long r0 = org.lwjgl.util.freetype.FreeType.Functions.FTC_ImageCache_Lookup
            r21 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L10
            r0 = r12
            long r0 = org.lwjgl.system.Checks.check(r0)
        L10:
            r0 = r12
            r1 = r14
            r2 = r16
            r3 = r17
            r4 = r19
            r5 = r21
            int r0 = org.lwjgl.system.JNI.invokePPPPI(r0, r1, r2, r3, r4, r5)
            return r0
    }

    @org.lwjgl.system.NativeType("FT_Error")
    public static int FTC_ImageCache_Lookup(@org.lwjgl.system.NativeType("FTC_ImageCache") long r10, org.lwjgl.util.freetype.FTC_ImageType r12, @org.lwjgl.system.NativeType("FT_UInt") int r13, @org.lwjgl.system.NativeType("FT_Glyph *") org.lwjgl.PointerBuffer r14, @javax.annotation.Nullable @org.lwjgl.system.NativeType("FTC_Node *") org.lwjgl.PointerBuffer r15) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L12
            r0 = r14
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
            r0 = r15
            r1 = 1
            org.lwjgl.system.Checks.checkSafe(r0, r1)
        L12:
            r0 = r10
            r1 = r12
            long r1 = r1.address()
            r2 = r13
            r3 = r14
            long r3 = org.lwjgl.system.MemoryUtil.memAddress(r3)
            r4 = r15
            long r4 = org.lwjgl.system.MemoryUtil.memAddressSafe(r4)
            int r0 = nFTC_ImageCache_Lookup(r0, r1, r2, r3, r4)
            return r0
    }

    public static int nFTC_ImageCache_LookupScaler(long r14, long r16, long r18, int r20, long r21, long r23) {
            long r0 = org.lwjgl.util.freetype.FreeType.Functions.FTC_ImageCache_LookupScaler
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
            int r0 = org.lwjgl.system.JNI.invokePPNPPI(r0, r1, r2, r3, r4, r5, r6)
            return r0
    }

    @org.lwjgl.system.NativeType("FT_Error")
    public static int FTC_ImageCache_LookupScaler(@org.lwjgl.system.NativeType("FTC_ImageCache") long r12, org.lwjgl.util.freetype.FTC_Scaler r14, @org.lwjgl.system.NativeType("FT_ULong") long r15, @org.lwjgl.system.NativeType("FT_UInt") int r17, @org.lwjgl.system.NativeType("FT_Glyph *") org.lwjgl.PointerBuffer r18, @javax.annotation.Nullable @org.lwjgl.system.NativeType("FTC_Node *") org.lwjgl.PointerBuffer r19) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L12
            r0 = r18
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
            r0 = r19
            r1 = 1
            org.lwjgl.system.Checks.checkSafe(r0, r1)
        L12:
            r0 = r12
            r1 = r14
            long r1 = r1.address()
            r2 = r15
            r3 = r17
            r4 = r18
            long r4 = org.lwjgl.system.MemoryUtil.memAddress(r4)
            r5 = r19
            long r5 = org.lwjgl.system.MemoryUtil.memAddressSafe(r5)
            int r0 = nFTC_ImageCache_LookupScaler(r0, r1, r2, r3, r4, r5)
            return r0
    }

    public static int nFTC_SBitCache_New(long r7, long r9) {
            long r0 = org.lwjgl.util.freetype.FreeType.Functions.FTC_SBitCache_New
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

    @org.lwjgl.system.NativeType("FT_Error")
    public static int FTC_SBitCache_New(@org.lwjgl.system.NativeType("FTC_Manager") long r5, @org.lwjgl.system.NativeType("FTC_SBitCache *") org.lwjgl.PointerBuffer r7) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r7
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
        Lb:
            r0 = r5
            r1 = r7
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            int r0 = nFTC_SBitCache_New(r0, r1)
            return r0
    }

    public static int nFTC_SBitCache_Lookup(long r12, long r14, int r16, long r17, long r19) {
            long r0 = org.lwjgl.util.freetype.FreeType.Functions.FTC_SBitCache_Lookup
            r21 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L10
            r0 = r12
            long r0 = org.lwjgl.system.Checks.check(r0)
        L10:
            r0 = r12
            r1 = r14
            r2 = r16
            r3 = r17
            r4 = r19
            r5 = r21
            int r0 = org.lwjgl.system.JNI.invokePPPPI(r0, r1, r2, r3, r4, r5)
            return r0
    }

    @org.lwjgl.system.NativeType("FT_Error")
    public static int FTC_SBitCache_Lookup(@org.lwjgl.system.NativeType("FTC_SBitCache") long r10, org.lwjgl.util.freetype.FTC_ImageType r12, @org.lwjgl.system.NativeType("FT_UInt") int r13, @org.lwjgl.system.NativeType("FTC_SBit *") org.lwjgl.PointerBuffer r14, @javax.annotation.Nullable @org.lwjgl.system.NativeType("FTC_Node *") org.lwjgl.PointerBuffer r15) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L12
            r0 = r14
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
            r0 = r15
            r1 = 1
            org.lwjgl.system.Checks.checkSafe(r0, r1)
        L12:
            r0 = r10
            r1 = r12
            long r1 = r1.address()
            r2 = r13
            r3 = r14
            long r3 = org.lwjgl.system.MemoryUtil.memAddress(r3)
            r4 = r15
            long r4 = org.lwjgl.system.MemoryUtil.memAddressSafe(r4)
            int r0 = nFTC_SBitCache_Lookup(r0, r1, r2, r3, r4)
            return r0
    }

    public static int nFTC_SBitCache_LookupScaler(long r14, long r16, long r18, int r20, long r21, long r23) {
            long r0 = org.lwjgl.util.freetype.FreeType.Functions.FTC_SBitCache_LookupScaler
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
            int r0 = org.lwjgl.system.JNI.invokePPNPPI(r0, r1, r2, r3, r4, r5, r6)
            return r0
    }

    @org.lwjgl.system.NativeType("FT_Error")
    public static int FTC_SBitCache_LookupScaler(@org.lwjgl.system.NativeType("FTC_SBitCache") long r12, org.lwjgl.util.freetype.FTC_Scaler r14, @org.lwjgl.system.NativeType("FT_ULong") long r15, @org.lwjgl.system.NativeType("FT_UInt") int r17, @org.lwjgl.system.NativeType("FTC_SBit *") org.lwjgl.PointerBuffer r18, @javax.annotation.Nullable @org.lwjgl.system.NativeType("FTC_Node *") org.lwjgl.PointerBuffer r19) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L12
            r0 = r18
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
            r0 = r19
            r1 = 1
            org.lwjgl.system.Checks.checkSafe(r0, r1)
        L12:
            r0 = r12
            r1 = r14
            long r1 = r1.address()
            r2 = r15
            r3 = r17
            r4 = r18
            long r4 = org.lwjgl.system.MemoryUtil.memAddress(r4)
            r5 = r19
            long r5 = org.lwjgl.system.MemoryUtil.memAddressSafe(r5)
            int r0 = nFTC_SBitCache_LookupScaler(r0, r1, r2, r3, r4, r5)
            return r0
    }

    public static int nFT_Get_CID_Registry_Ordering_Supplement(long r11, long r13, long r15, long r17) {
            long r0 = org.lwjgl.util.freetype.FreeType.Functions.Get_CID_Registry_Ordering_Supplement
            r19 = r0
            r0 = r11
            r1 = r13
            r2 = r15
            r3 = r17
            r4 = r19
            int r0 = org.lwjgl.system.JNI.invokePPPPI(r0, r1, r2, r3, r4)
            return r0
    }

    @org.lwjgl.system.NativeType("FT_Error")
    public static int FT_Get_CID_Registry_Ordering_Supplement(org.lwjgl.util.freetype.FT_Face r9, @org.lwjgl.system.NativeType("char const **") org.lwjgl.PointerBuffer r10, @org.lwjgl.system.NativeType("char const **") org.lwjgl.PointerBuffer r11, @org.lwjgl.system.NativeType("FT_Int *") java.nio.IntBuffer r12) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L15
            r0 = r10
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
            r0 = r11
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
            r0 = r12
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
        L15:
            r0 = r9
            long r0 = r0.address()
            r1 = r10
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            r2 = r11
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            r3 = r12
            long r3 = org.lwjgl.system.MemoryUtil.memAddress(r3)
            int r0 = nFT_Get_CID_Registry_Ordering_Supplement(r0, r1, r2, r3)
            return r0
    }

    public static int nFT_Get_CID_Is_Internally_CID_Keyed(long r7, long r9) {
            long r0 = org.lwjgl.util.freetype.FreeType.Functions.Get_CID_Is_Internally_CID_Keyed
            r11 = r0
            r0 = r7
            r1 = r9
            r2 = r11
            int r0 = org.lwjgl.system.JNI.invokePPI(r0, r1, r2)
            return r0
    }

    @org.lwjgl.system.NativeType("FT_Error")
    public static int FT_Get_CID_Is_Internally_CID_Keyed(org.lwjgl.util.freetype.FT_Face r5, @org.lwjgl.system.NativeType("FT_Bool *") java.nio.ByteBuffer r6) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r6
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
        Lb:
            r0 = r5
            long r0 = r0.address()
            r1 = r6
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            int r0 = nFT_Get_CID_Is_Internally_CID_Keyed(r0, r1)
            return r0
    }

    public static int nFT_Get_CID_From_Glyph_Index(long r8, int r10, long r11) {
            long r0 = org.lwjgl.util.freetype.FreeType.Functions.Get_CID_From_Glyph_Index
            r13 = r0
            r0 = r8
            r1 = r10
            r2 = r11
            r3 = r13
            int r0 = org.lwjgl.system.JNI.invokePPI(r0, r1, r2, r3)
            return r0
    }

    @org.lwjgl.system.NativeType("FT_Error")
    public static int FT_Get_CID_From_Glyph_Index(org.lwjgl.util.freetype.FT_Face r6, @org.lwjgl.system.NativeType("FT_UInt") int r7, @org.lwjgl.system.NativeType("FT_UInt *") java.nio.IntBuffer r8) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r8
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
        Lb:
            r0 = r6
            long r0 = r0.address()
            r1 = r7
            r2 = r8
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            int r0 = nFT_Get_CID_From_Glyph_Index(r0, r1, r2)
            return r0
    }

    public static int nFT_Palette_Data_Get(long r7, long r9) {
            long r0 = org.lwjgl.util.freetype.FreeType.Functions.Palette_Data_Get
            r11 = r0
            r0 = r7
            r1 = r9
            r2 = r11
            int r0 = org.lwjgl.system.JNI.invokePPI(r0, r1, r2)
            return r0
    }

    @org.lwjgl.system.NativeType("FT_Error")
    public static int FT_Palette_Data_Get(org.lwjgl.util.freetype.FT_Face r5, @org.lwjgl.system.NativeType("FT_Palette_Data *") org.lwjgl.util.freetype.FT_Palette_Data r6) {
            r0 = r5
            long r0 = r0.address()
            r1 = r6
            long r1 = r1.address()
            int r0 = nFT_Palette_Data_Get(r0, r1)
            return r0
    }

    public static int nFT_Palette_Select(long r8, short r10, long r11) {
            long r0 = org.lwjgl.util.freetype.FreeType.Functions.Palette_Select
            r13 = r0
            r0 = r8
            r1 = r10
            r2 = r11
            r3 = r13
            int r0 = org.lwjgl.system.JNI.invokePCPI(r0, r1, r2, r3)
            return r0
    }

    @org.lwjgl.system.NativeType("FT_Error")
    public static int FT_Palette_Select(org.lwjgl.util.freetype.FT_Face r6, @org.lwjgl.system.NativeType("FT_UShort") short r7, @javax.annotation.Nullable @org.lwjgl.system.NativeType("FT_Color **") org.lwjgl.PointerBuffer r8) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r8
            r1 = 1
            org.lwjgl.system.Checks.checkSafe(r0, r1)
        Lb:
            r0 = r6
            long r0 = r0.address()
            r1 = r7
            r2 = r8
            long r2 = org.lwjgl.system.MemoryUtil.memAddressSafe(r2)
            int r0 = nFT_Palette_Select(r0, r1, r2)
            return r0
    }

    public static int nFT_Palette_Set_Foreground_Color(long r9, long r11) {
            long r0 = org.lwjgl.util.freetype.FreeType.Functions.Palette_Set_Foreground_Color
            r13 = r0
            org.lwjgl.system.MemoryStack r0 = org.lwjgl.system.MemoryStack.stackGet()
            r15 = r0
            r0 = r15
            int r0 = r0.getPointer()
            r16 = r0
            r0 = r15
            r1 = 0
            long r0 = r0.nint(r1)     // Catch: java.lang.Throwable -> L5e
            r17 = r0
            r0 = r15
            int r1 = org.lwjgl.system.MemoryStack.POINTER_SIZE     // Catch: java.lang.Throwable -> L5e
            int r2 = org.lwjgl.system.MemoryStack.POINTER_SIZE     // Catch: java.lang.Throwable -> L5e
            r3 = 2
            int r2 = r2 * r3
            long r0 = r0.nmalloc(r1, r2)     // Catch: java.lang.Throwable -> L5e
            r19 = r0
            r0 = r19
            r1 = r15
            r2 = r9
            long r1 = r1.npointer(r2)     // Catch: java.lang.Throwable -> L5e
            org.lwjgl.system.MemoryUtil.memPutAddress(r0, r1)     // Catch: java.lang.Throwable -> L5e
            r0 = r19
            int r1 = org.lwjgl.system.MemoryStack.POINTER_SIZE     // Catch: java.lang.Throwable -> L5e
            long r1 = (long) r1     // Catch: java.lang.Throwable -> L5e
            long r0 = r0 + r1
            r1 = r11
            org.lwjgl.system.MemoryUtil.memPutAddress(r0, r1)     // Catch: java.lang.Throwable -> L5e
            org.lwjgl.system.libffi.FFICIF r0 = org.lwjgl.util.freetype.FreeType.FT_Palette_Set_Foreground_ColorCIF     // Catch: java.lang.Throwable -> L5e
            long r0 = r0.address()     // Catch: java.lang.Throwable -> L5e
            r1 = r13
            r2 = r17
            r3 = r19
            org.lwjgl.system.libffi.LibFFI.nffi_call(r0, r1, r2, r3)     // Catch: java.lang.Throwable -> L5e
            r0 = r17
            int r0 = org.lwjgl.system.MemoryUtil.memGetInt(r0)     // Catch: java.lang.Throwable -> L5e
            r21 = r0
            r0 = r15
            r1 = r16
            r0.setPointer(r1)
            r0 = r21
            return r0
        L5e:
            r22 = move-exception
            r0 = r15
            r1 = r16
            r0.setPointer(r1)
            r0 = r22
            throw r0
    }

    @org.lwjgl.system.NativeType("FT_Error")
    public static int FT_Palette_Set_Foreground_Color(org.lwjgl.util.freetype.FT_Face r5, org.lwjgl.util.freetype.FT_Color r6) {
            r0 = r5
            long r0 = r0.address()
            r1 = r6
            long r1 = r1.address()
            int r0 = nFT_Palette_Set_Foreground_Color(r0, r1)
            return r0
    }

    public static boolean nFT_Get_Color_Glyph_Layer(long r12, int r14, long r15, long r17, long r19) {
            long r0 = org.lwjgl.util.freetype.FreeType.Functions.Get_Color_Glyph_Layer
            r21 = r0
            r0 = r12
            r1 = r14
            r2 = r15
            r3 = r17
            r4 = r19
            r5 = r21
            boolean r0 = org.lwjgl.system.JNI.invokePPPPZ(r0, r1, r2, r3, r4, r5)
            return r0
    }

    @org.lwjgl.system.NativeType("FT_Bool")
    public static boolean FT_Get_Color_Glyph_Layer(org.lwjgl.util.freetype.FT_Face r10, @org.lwjgl.system.NativeType("FT_UInt") int r11, @org.lwjgl.system.NativeType("FT_UInt *") java.nio.IntBuffer r12, @org.lwjgl.system.NativeType("FT_UInt *") java.nio.IntBuffer r13, @org.lwjgl.system.NativeType("FT_LayerIterator *") org.lwjgl.util.freetype.FT_LayerIterator r14) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L10
            r0 = r12
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
            r0 = r13
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
        L10:
            r0 = r10
            long r0 = r0.address()
            r1 = r11
            r2 = r12
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            r3 = r13
            long r3 = org.lwjgl.system.MemoryUtil.memAddress(r3)
            r4 = r14
            long r4 = r4.address()
            boolean r0 = nFT_Get_Color_Glyph_Layer(r0, r1, r2, r3, r4)
            return r0
    }

    public static boolean nFT_Get_Color_Glyph_Paint(long r9, int r11, int r12, long r13) {
            long r0 = org.lwjgl.util.freetype.FreeType.Functions.Get_Color_Glyph_Paint
            r15 = r0
            r0 = r9
            r1 = r11
            r2 = r12
            r3 = r13
            r4 = r15
            boolean r0 = org.lwjgl.system.JNI.invokePPZ(r0, r1, r2, r3, r4)
            return r0
    }

    @org.lwjgl.system.NativeType("FT_Bool")
    public static boolean FT_Get_Color_Glyph_Paint(org.lwjgl.util.freetype.FT_Face r7, @org.lwjgl.system.NativeType("FT_UInt") int r8, @org.lwjgl.system.NativeType("FT_Color_Root_Transform") int r9, @org.lwjgl.system.NativeType("FT_OpaquePaintRec *") org.lwjgl.util.freetype.FT_OpaquePaint r10) {
            r0 = r7
            long r0 = r0.address()
            r1 = r8
            r2 = r9
            r3 = r10
            long r3 = r3.address()
            boolean r0 = nFT_Get_Color_Glyph_Paint(r0, r1, r2, r3)
            return r0
    }

    public static boolean nFT_Get_Color_Glyph_ClipBox(long r8, int r10, long r11) {
            long r0 = org.lwjgl.util.freetype.FreeType.Functions.Get_Color_Glyph_ClipBox
            r13 = r0
            r0 = r8
            r1 = r10
            r2 = r11
            r3 = r13
            boolean r0 = org.lwjgl.system.JNI.invokePPZ(r0, r1, r2, r3)
            return r0
    }

    @org.lwjgl.system.NativeType("FT_Bool")
    public static boolean FT_Get_Color_Glyph_ClipBox(org.lwjgl.util.freetype.FT_Face r6, @org.lwjgl.system.NativeType("FT_UInt") int r7, @org.lwjgl.system.NativeType("FT_ClipBox *") org.lwjgl.util.freetype.FT_ClipBox r8) {
            r0 = r6
            long r0 = r0.address()
            r1 = r7
            r2 = r8
            long r2 = r2.address()
            boolean r0 = nFT_Get_Color_Glyph_ClipBox(r0, r1, r2)
            return r0
    }

    public static boolean nFT_Get_Paint_Layers(long r9, long r11, long r13) {
            long r0 = org.lwjgl.util.freetype.FreeType.Functions.Get_Paint_Layers
            r15 = r0
            r0 = r9
            r1 = r11
            r2 = r13
            r3 = r15
            boolean r0 = org.lwjgl.system.JNI.invokePPPZ(r0, r1, r2, r3)
            return r0
    }

    @org.lwjgl.system.NativeType("FT_Bool")
    public static boolean FT_Get_Paint_Layers(org.lwjgl.util.freetype.FT_Face r7, @org.lwjgl.system.NativeType("FT_LayerIterator *") org.lwjgl.util.freetype.FT_LayerIterator r8, @org.lwjgl.system.NativeType("FT_OpaquePaintRec *") org.lwjgl.util.freetype.FT_OpaquePaint r9) {
            r0 = r7
            long r0 = r0.address()
            r1 = r8
            long r1 = r1.address()
            r2 = r9
            long r2 = r2.address()
            boolean r0 = nFT_Get_Paint_Layers(r0, r1, r2)
            return r0
    }

    public static boolean nFT_Get_Colorline_Stops(long r9, long r11, long r13) {
            long r0 = org.lwjgl.util.freetype.FreeType.Functions.Get_Colorline_Stops
            r15 = r0
            r0 = r9
            r1 = r11
            r2 = r13
            r3 = r15
            boolean r0 = org.lwjgl.system.JNI.invokePPPZ(r0, r1, r2, r3)
            return r0
    }

    @org.lwjgl.system.NativeType("FT_Bool")
    public static boolean FT_Get_Colorline_Stops(org.lwjgl.util.freetype.FT_Face r7, @org.lwjgl.system.NativeType("FT_ColorStop *") org.lwjgl.util.freetype.FT_ColorStop r8, @org.lwjgl.system.NativeType("FT_ColorStopIterator *") org.lwjgl.util.freetype.FT_ColorStopIterator r9) {
            r0 = r7
            long r0 = r0.address()
            r1 = r8
            long r1 = r1.address()
            r2 = r9
            long r2 = r2.address()
            boolean r0 = nFT_Get_Colorline_Stops(r0, r1, r2)
            return r0
    }

    public static boolean nFT_Get_Paint(long r9, long r11, long r13) {
            long r0 = org.lwjgl.util.freetype.FreeType.Functions.Get_Paint
            r15 = r0
            org.lwjgl.system.MemoryStack r0 = org.lwjgl.system.MemoryStack.stackGet()
            r17 = r0
            r0 = r17
            int r0 = r0.getPointer()
            r18 = r0
            r0 = r17
            r1 = 0
            long r0 = r0.nbyte(r1)     // Catch: java.lang.Throwable -> L79
            r19 = r0
            r0 = r17
            int r1 = org.lwjgl.system.MemoryStack.POINTER_SIZE     // Catch: java.lang.Throwable -> L79
            int r2 = org.lwjgl.system.MemoryStack.POINTER_SIZE     // Catch: java.lang.Throwable -> L79
            r3 = 3
            int r2 = r2 * r3
            long r0 = r0.nmalloc(r1, r2)     // Catch: java.lang.Throwable -> L79
            r21 = r0
            r0 = r21
            r1 = r17
            r2 = r9
            long r1 = r1.npointer(r2)     // Catch: java.lang.Throwable -> L79
            org.lwjgl.system.MemoryUtil.memPutAddress(r0, r1)     // Catch: java.lang.Throwable -> L79
            r0 = r21
            int r1 = org.lwjgl.system.MemoryStack.POINTER_SIZE     // Catch: java.lang.Throwable -> L79
            long r1 = (long) r1     // Catch: java.lang.Throwable -> L79
            long r0 = r0 + r1
            r1 = r11
            org.lwjgl.system.MemoryUtil.memPutAddress(r0, r1)     // Catch: java.lang.Throwable -> L79
            r0 = r21
            r1 = 2
            int r2 = org.lwjgl.system.MemoryStack.POINTER_SIZE     // Catch: java.lang.Throwable -> L79
            int r1 = r1 * r2
            long r1 = (long) r1     // Catch: java.lang.Throwable -> L79
            long r0 = r0 + r1
            r1 = r17
            r2 = r13
            long r1 = r1.npointer(r2)     // Catch: java.lang.Throwable -> L79
            org.lwjgl.system.MemoryUtil.memPutAddress(r0, r1)     // Catch: java.lang.Throwable -> L79
            org.lwjgl.system.libffi.FFICIF r0 = org.lwjgl.util.freetype.FreeType.FT_Get_PaintCIF     // Catch: java.lang.Throwable -> L79
            long r0 = r0.address()     // Catch: java.lang.Throwable -> L79
            r1 = r15
            r2 = r19
            r3 = r21
            org.lwjgl.system.libffi.LibFFI.nffi_call(r0, r1, r2, r3)     // Catch: java.lang.Throwable -> L79
            r0 = r19
            byte r0 = org.lwjgl.system.MemoryUtil.memGetByte(r0)     // Catch: java.lang.Throwable -> L79
            if (r0 == 0) goto L6c
            r0 = 1
            goto L6d
        L6c:
            r0 = 0
        L6d:
            r23 = r0
            r0 = r17
            r1 = r18
            r0.setPointer(r1)
            r0 = r23
            return r0
        L79:
            r24 = move-exception
            r0 = r17
            r1 = r18
            r0.setPointer(r1)
            r0 = r24
            throw r0
    }

    @org.lwjgl.system.NativeType("FT_Bool")
    public static boolean FT_Get_Paint(org.lwjgl.util.freetype.FT_Face r7, @org.lwjgl.system.NativeType("FT_OpaquePaintRec") org.lwjgl.util.freetype.FT_OpaquePaint r8, @org.lwjgl.system.NativeType("FT_COLR_Paint *") org.lwjgl.util.freetype.FT_COLR_Paint r9) {
            r0 = r7
            long r0 = r0.address()
            r1 = r8
            long r1 = r1.address()
            r2 = r9
            long r2 = r2.address()
            boolean r0 = nFT_Get_Paint(r0, r1, r2)
            return r0
    }

    public static long nFT_Error_String(int r4) {
            long r0 = org.lwjgl.util.freetype.FreeType.Functions.Error_String
            r5 = r0
            r0 = r4
            r1 = r5
            long r0 = org.lwjgl.system.JNI.invokeP(r0, r1)
            return r0
    }

    @javax.annotation.Nullable
    @org.lwjgl.system.NativeType("char const *")
    public static java.lang.String FT_Error_String(@org.lwjgl.system.NativeType("FT_Error") int r3) {
            r0 = r3
            long r0 = nFT_Error_String(r0)
            r4 = r0
            r0 = r4
            java.lang.String r0 = org.lwjgl.system.MemoryUtil.memASCIISafe(r0)
            return r0
    }

    public static long nFT_Get_Font_Format(long r5) {
            long r0 = org.lwjgl.util.freetype.FreeType.Functions.Get_Font_Format
            r7 = r0
            r0 = r5
            r1 = r7
            long r0 = org.lwjgl.system.JNI.invokePP(r0, r1)
            return r0
    }

    @javax.annotation.Nullable
    @org.lwjgl.system.NativeType("char const *")
    public static java.lang.String FT_Get_Font_Format(org.lwjgl.util.freetype.FT_Face r3) {
            r0 = r3
            long r0 = r0.address()
            long r0 = nFT_Get_Font_Format(r0)
            r4 = r0
            r0 = r4
            java.lang.String r0 = org.lwjgl.system.MemoryUtil.memASCIISafe(r0)
            return r0
    }

    public static int nFT_Get_Gasp(long r6, int r8) {
            long r0 = org.lwjgl.util.freetype.FreeType.Functions.Get_Gasp
            r9 = r0
            r0 = r6
            r1 = r8
            r2 = r9
            int r0 = org.lwjgl.system.JNI.invokePI(r0, r1, r2)
            return r0
    }

    @org.lwjgl.system.NativeType("FT_Int")
    public static int FT_Get_Gasp(org.lwjgl.util.freetype.FT_Face r4, @org.lwjgl.system.NativeType("FT_UInt") int r5) {
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            int r0 = nFT_Get_Gasp(r0, r1)
            return r0
    }

    public static int nFT_New_Glyph(long r8, int r10, long r11) {
            long r0 = org.lwjgl.util.freetype.FreeType.Functions.New_Glyph
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

    @org.lwjgl.system.NativeType("FT_Error")
    public static int FT_New_Glyph(@org.lwjgl.system.NativeType("FT_Library") long r6, @org.lwjgl.system.NativeType("FT_Glyph_Format") int r8, @org.lwjgl.system.NativeType("FT_Glyph *") org.lwjgl.PointerBuffer r9) {
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
            int r0 = nFT_New_Glyph(r0, r1, r2)
            return r0
    }

    public static int nFT_Get_Glyph(long r7, long r9) {
            long r0 = org.lwjgl.util.freetype.FreeType.Functions.Get_Glyph
            r11 = r0
            r0 = r7
            r1 = r9
            r2 = r11
            int r0 = org.lwjgl.system.JNI.invokePPI(r0, r1, r2)
            return r0
    }

    @org.lwjgl.system.NativeType("FT_Error")
    public static int FT_Get_Glyph(org.lwjgl.util.freetype.FT_GlyphSlot r5, @org.lwjgl.system.NativeType("FT_Glyph *") org.lwjgl.PointerBuffer r6) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r6
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
        Lb:
            r0 = r5
            long r0 = r0.address()
            r1 = r6
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            int r0 = nFT_Get_Glyph(r0, r1)
            return r0
    }

    public static int nFT_Glyph_Copy(long r7, long r9) {
            long r0 = org.lwjgl.util.freetype.FreeType.Functions.Glyph_Copy
            r11 = r0
            r0 = r7
            r1 = r9
            r2 = r11
            int r0 = org.lwjgl.system.JNI.invokePPI(r0, r1, r2)
            return r0
    }

    @org.lwjgl.system.NativeType("FT_Error")
    public static int FT_Glyph_Copy(org.lwjgl.util.freetype.FT_Glyph r5, @org.lwjgl.system.NativeType("FT_Glyph *") org.lwjgl.PointerBuffer r6) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r6
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
        Lb:
            r0 = r5
            long r0 = r0.address()
            r1 = r6
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            int r0 = nFT_Glyph_Copy(r0, r1)
            return r0
    }

    public static int nFT_Glyph_Transform(long r9, long r11, long r13) {
            long r0 = org.lwjgl.util.freetype.FreeType.Functions.Glyph_Transform
            r15 = r0
            r0 = r9
            r1 = r11
            r2 = r13
            r3 = r15
            int r0 = org.lwjgl.system.JNI.invokePPPI(r0, r1, r2, r3)
            return r0
    }

    @org.lwjgl.system.NativeType("FT_Error")
    public static int FT_Glyph_Transform(org.lwjgl.util.freetype.FT_Glyph r7, @javax.annotation.Nullable @org.lwjgl.system.NativeType("FT_Matrix const *") org.lwjgl.util.freetype.FT_Matrix r8, @javax.annotation.Nullable @org.lwjgl.system.NativeType("FT_Vector const *") org.lwjgl.util.freetype.FT_Vector r9) {
            r0 = r7
            long r0 = r0.address()
            r1 = r8
            long r1 = org.lwjgl.system.MemoryUtil.memAddressSafe(r1)
            r2 = r9
            long r2 = org.lwjgl.system.MemoryUtil.memAddressSafe(r2)
            int r0 = nFT_Glyph_Transform(r0, r1, r2)
            return r0
    }

    public static void nFT_Glyph_Get_CBox(long r8, int r10, long r11) {
            long r0 = org.lwjgl.util.freetype.FreeType.Functions.Glyph_Get_CBox
            r13 = r0
            r0 = r8
            r1 = r10
            r2 = r11
            r3 = r13
            org.lwjgl.system.JNI.invokePPV(r0, r1, r2, r3)
            return
    }

    public static void FT_Glyph_Get_CBox(org.lwjgl.util.freetype.FT_Glyph r6, @org.lwjgl.system.NativeType("FT_UInt") int r7, @org.lwjgl.system.NativeType("FT_BBox *") org.lwjgl.util.freetype.FT_BBox r8) {
            r0 = r6
            long r0 = r0.address()
            r1 = r7
            r2 = r8
            long r2 = r2.address()
            nFT_Glyph_Get_CBox(r0, r1, r2)
            return
    }

    public static int nFT_Glyph_To_Bitmap(long r9, int r11, long r12, boolean r14) {
            long r0 = org.lwjgl.util.freetype.FreeType.Functions.Glyph_To_Bitmap
            r15 = r0
            r0 = r9
            r1 = r11
            r2 = r12
            r3 = r14
            r4 = r15
            int r0 = org.lwjgl.system.JNI.invokePPI(r0, r1, r2, r3, r4)
            return r0
    }

    @org.lwjgl.system.NativeType("FT_Error")
    public static int FT_Glyph_To_Bitmap(@org.lwjgl.system.NativeType("FT_Glyph *") org.lwjgl.PointerBuffer r7, @org.lwjgl.system.NativeType("FT_Render_Mode") int r8, @javax.annotation.Nullable @org.lwjgl.system.NativeType("FT_Vector const *") org.lwjgl.util.freetype.FT_Vector r9, @org.lwjgl.system.NativeType("FT_Bool") boolean r10) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r7
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
        Lb:
            r0 = r7
            long r0 = org.lwjgl.system.MemoryUtil.memAddress(r0)
            r1 = r8
            r2 = r9
            long r2 = org.lwjgl.system.MemoryUtil.memAddressSafe(r2)
            r3 = r10
            int r0 = nFT_Glyph_To_Bitmap(r0, r1, r2, r3)
            return r0
    }

    public static void nFT_Done_Glyph(long r5) {
            long r0 = org.lwjgl.util.freetype.FreeType.Functions.Done_Glyph
            r7 = r0
            r0 = r5
            r1 = r7
            org.lwjgl.system.JNI.invokePV(r0, r1)
            return
    }

    public static void FT_Done_Glyph(@javax.annotation.Nullable org.lwjgl.util.freetype.FT_Glyph r3) {
            r0 = r3
            long r0 = org.lwjgl.system.MemoryUtil.memAddressSafe(r0)
            nFT_Done_Glyph(r0)
            return
    }

    public static void nFT_Matrix_Multiply(long r7, long r9) {
            long r0 = org.lwjgl.util.freetype.FreeType.Functions.Matrix_Multiply
            r11 = r0
            r0 = r7
            r1 = r9
            r2 = r11
            org.lwjgl.system.JNI.invokePPV(r0, r1, r2)
            return
    }

    public static void FT_Matrix_Multiply(@org.lwjgl.system.NativeType("FT_Matrix const *") org.lwjgl.util.freetype.FT_Matrix r5, @org.lwjgl.system.NativeType("FT_Matrix *") org.lwjgl.util.freetype.FT_Matrix r6) {
            r0 = r5
            long r0 = r0.address()
            r1 = r6
            long r1 = r1.address()
            nFT_Matrix_Multiply(r0, r1)
            return
    }

    public static int nFT_Matrix_Invert(long r5) {
            long r0 = org.lwjgl.util.freetype.FreeType.Functions.Matrix_Invert
            r7 = r0
            r0 = r5
            r1 = r7
            int r0 = org.lwjgl.system.JNI.invokePI(r0, r1)
            return r0
    }

    @org.lwjgl.system.NativeType("FT_Error")
    public static int FT_Matrix_Invert(@org.lwjgl.system.NativeType("FT_Matrix *") org.lwjgl.util.freetype.FT_Matrix r3) {
            r0 = r3
            long r0 = r0.address()
            int r0 = nFT_Matrix_Invert(r0)
            return r0
    }

    public static int nFT_TrueTypeGX_Validate(long r9, int r11, long r12, int r14) {
            long r0 = org.lwjgl.util.freetype.FreeType.Functions.TrueTypeGX_Validate
            r15 = r0
            r0 = r9
            r1 = r11
            r2 = r12
            r3 = r14
            r4 = r15
            int r0 = org.lwjgl.system.JNI.invokePPI(r0, r1, r2, r3, r4)
            return r0
    }

    @org.lwjgl.system.NativeType("FT_Error")
    public static int FT_TrueTypeGX_Validate(org.lwjgl.util.freetype.FT_Face r7, @org.lwjgl.system.NativeType("FT_UInt") int r8, @org.lwjgl.system.NativeType("FT_Bytes *") org.lwjgl.PointerBuffer r9) {
            r0 = r7
            long r0 = r0.address()
            r1 = r8
            r2 = r9
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            r3 = r9
            int r3 = r3.remaining()
            int r0 = nFT_TrueTypeGX_Validate(r0, r1, r2, r3)
            return r0
    }

    public static void nFT_TrueTypeGX_Free(long r7, long r9) {
            long r0 = org.lwjgl.util.freetype.FreeType.Functions.TrueTypeGX_Free
            r11 = r0
            r0 = r7
            r1 = r9
            r2 = r11
            org.lwjgl.system.JNI.invokePPV(r0, r1, r2)
            return
    }

    public static void FT_TrueTypeGX_Free(org.lwjgl.util.freetype.FT_Face r5, @org.lwjgl.system.NativeType("FT_Bytes") java.nio.ByteBuffer r6) {
            r0 = r5
            long r0 = r0.address()
            r1 = r6
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            nFT_TrueTypeGX_Free(r0, r1)
            return
    }

    public static int nFT_ClassicKern_Validate(long r8, int r10, long r11) {
            long r0 = org.lwjgl.util.freetype.FreeType.Functions.ClassicKern_Validate
            r13 = r0
            r0 = r8
            r1 = r10
            r2 = r11
            r3 = r13
            int r0 = org.lwjgl.system.JNI.invokePPI(r0, r1, r2, r3)
            return r0
    }

    @org.lwjgl.system.NativeType("FT_Error")
    public static int FT_ClassicKern_Validate(org.lwjgl.util.freetype.FT_Face r6, @org.lwjgl.system.NativeType("FT_UInt") int r7, @org.lwjgl.system.NativeType("FT_Bytes *") org.lwjgl.PointerBuffer r8) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r8
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
        Lb:
            r0 = r6
            long r0 = r0.address()
            r1 = r7
            r2 = r8
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            int r0 = nFT_ClassicKern_Validate(r0, r1, r2)
            return r0
    }

    public static void nFT_ClassicKern_Free(long r7, long r9) {
            long r0 = org.lwjgl.util.freetype.FreeType.Functions.ClassicKern_Free
            r11 = r0
            r0 = r7
            r1 = r9
            r2 = r11
            org.lwjgl.system.JNI.invokePPV(r0, r1, r2)
            return
    }

    public static void FT_ClassicKern_Free(org.lwjgl.util.freetype.FT_Face r5, @org.lwjgl.system.NativeType("FT_Bytes") java.nio.ByteBuffer r6) {
            r0 = r5
            long r0 = r0.address()
            r1 = r6
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            nFT_ClassicKern_Free(r0, r1)
            return
    }

    public static int nFT_Stream_OpenGzip(long r7, long r9) {
            long r0 = org.lwjgl.util.freetype.FreeType.Functions.Stream_OpenGzip
            r11 = r0
            r0 = r7
            r1 = r9
            r2 = r11
            int r0 = org.lwjgl.system.JNI.invokePPI(r0, r1, r2)
            return r0
    }

    @org.lwjgl.system.NativeType("FT_Error")
    public static int FT_Stream_OpenGzip(org.lwjgl.util.freetype.FT_Stream r5, org.lwjgl.util.freetype.FT_Stream r6) {
            r0 = r5
            long r0 = r0.address()
            r1 = r6
            long r1 = r1.address()
            int r0 = nFT_Stream_OpenGzip(r0, r1)
            return r0
    }

    public static int nFT_Gzip_Uncompress(long r13, long r15, long r17, long r19, long r21) {
            long r0 = org.lwjgl.util.freetype.FreeType.Functions.Gzip_Uncompress
            r23 = r0
            r0 = r13
            r1 = r15
            r2 = r17
            r3 = r19
            r4 = r21
            r5 = r23
            int r0 = org.lwjgl.system.JNI.invokePPPPNI(r0, r1, r2, r3, r4, r5)
            return r0
    }

    @org.lwjgl.system.NativeType("FT_Error")
    public static int FT_Gzip_Uncompress(org.lwjgl.util.freetype.FT_Memory r11, @org.lwjgl.system.NativeType("FT_Byte *") java.nio.ByteBuffer r12, @org.lwjgl.system.NativeType("FT_ULong *") org.lwjgl.CLongBuffer r13, @org.lwjgl.system.NativeType("FT_Byte const *") java.nio.ByteBuffer r14) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L17
            r0 = r13
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
            r0 = r12
            r1 = r13
            r2 = r13
            int r2 = r2.position()
            long r1 = r1.get(r2)
            org.lwjgl.system.Checks.check(r0, r1)
        L17:
            r0 = r11
            long r0 = r0.address()
            r1 = r12
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            r2 = r13
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            r3 = r14
            long r3 = org.lwjgl.system.MemoryUtil.memAddress(r3)
            r4 = r14
            int r4 = r4.remaining()
            long r4 = (long) r4
            int r0 = nFT_Gzip_Uncompress(r0, r1, r2, r3, r4)
            return r0
    }

    @org.lwjgl.system.NativeType("FT_Error")
    public static int FT_Library_SetLcdFilter(@org.lwjgl.system.NativeType("FT_Library") long r6, @org.lwjgl.system.NativeType("FT_LcdFilter") int r8) {
            long r0 = org.lwjgl.util.freetype.FreeType.Functions.Library_SetLcdFilter
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

    public static int nFT_Library_SetLcdFilterWeights(long r7, long r9) {
            long r0 = org.lwjgl.util.freetype.FreeType.Functions.Library_SetLcdFilterWeights
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

    @org.lwjgl.system.NativeType("FT_Error")
    public static int FT_Library_SetLcdFilterWeights(@org.lwjgl.system.NativeType("FT_Library") long r5, @org.lwjgl.system.NativeType("unsigned char *") java.nio.ByteBuffer r7) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r7
            r1 = 5
            org.lwjgl.system.Checks.check(r0, r1)
        Lb:
            r0 = r5
            r1 = r7
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            int r0 = nFT_Library_SetLcdFilterWeights(r0, r1)
            return r0
    }

    public static int nFT_Library_SetLcdGeometry(long r7, long r9) {
            long r0 = org.lwjgl.util.freetype.FreeType.Functions.Library_SetLcdGeometry
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

    @org.lwjgl.system.NativeType("FT_Error")
    public static int FT_Library_SetLcdGeometry(@org.lwjgl.system.NativeType("FT_Library") long r5, @org.lwjgl.system.NativeType("FT_Vector *") org.lwjgl.util.freetype.FT_Vector.Buffer r7) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r7
            r1 = 3
            org.lwjgl.system.Checks.check(r0, r1)
        Lb:
            r0 = r5
            r1 = r7
            long r1 = r1.address()
            int r0 = nFT_Library_SetLcdGeometry(r0, r1)
            return r0
    }

    public static long nFT_List_Find(long r7, long r9) {
            long r0 = org.lwjgl.util.freetype.FreeType.Functions.List_Find
            r11 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L10
            r0 = r9
            long r0 = org.lwjgl.system.Checks.check(r0)
        L10:
            r0 = r7
            r1 = r9
            r2 = r11
            long r0 = org.lwjgl.system.JNI.invokePPP(r0, r1, r2)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.util.freetype.FT_ListNode FT_List_Find(org.lwjgl.util.freetype.FT_List r5, @org.lwjgl.system.NativeType("void *") long r6) {
            r0 = r5
            long r0 = r0.address()
            r1 = r6
            long r0 = nFT_List_Find(r0, r1)
            r8 = r0
            r0 = r8
            org.lwjgl.util.freetype.FT_ListNode r0 = org.lwjgl.util.freetype.FT_ListNode.createSafe(r0)
            return r0
    }

    public static void nFT_List_Add(long r7, long r9) {
            long r0 = org.lwjgl.util.freetype.FreeType.Functions.List_Add
            r11 = r0
            r0 = r7
            r1 = r9
            r2 = r11
            org.lwjgl.system.JNI.invokePPV(r0, r1, r2)
            return
    }

    public static void FT_List_Add(org.lwjgl.util.freetype.FT_List r5, org.lwjgl.util.freetype.FT_ListNode r6) {
            r0 = r5
            long r0 = r0.address()
            r1 = r6
            long r1 = r1.address()
            nFT_List_Add(r0, r1)
            return
    }

    public static void nFT_List_Insert(long r7, long r9) {
            long r0 = org.lwjgl.util.freetype.FreeType.Functions.List_Insert
            r11 = r0
            r0 = r7
            r1 = r9
            r2 = r11
            org.lwjgl.system.JNI.invokePPV(r0, r1, r2)
            return
    }

    public static void FT_List_Insert(org.lwjgl.util.freetype.FT_List r5, org.lwjgl.util.freetype.FT_ListNode r6) {
            r0 = r5
            long r0 = r0.address()
            r1 = r6
            long r1 = r1.address()
            nFT_List_Insert(r0, r1)
            return
    }

    public static void nFT_List_Remove(long r7, long r9) {
            long r0 = org.lwjgl.util.freetype.FreeType.Functions.List_Remove
            r11 = r0
            r0 = r7
            r1 = r9
            r2 = r11
            org.lwjgl.system.JNI.invokePPV(r0, r1, r2)
            return
    }

    public static void FT_List_Remove(org.lwjgl.util.freetype.FT_List r5, org.lwjgl.util.freetype.FT_ListNode r6) {
            r0 = r5
            long r0 = r0.address()
            r1 = r6
            long r1 = r1.address()
            nFT_List_Remove(r0, r1)
            return
    }

    public static void nFT_List_Up(long r7, long r9) {
            long r0 = org.lwjgl.util.freetype.FreeType.Functions.List_Up
            r11 = r0
            r0 = r7
            r1 = r9
            r2 = r11
            org.lwjgl.system.JNI.invokePPV(r0, r1, r2)
            return
    }

    public static void FT_List_Up(org.lwjgl.util.freetype.FT_List r5, org.lwjgl.util.freetype.FT_ListNode r6) {
            r0 = r5
            long r0 = r0.address()
            r1 = r6
            long r1 = r1.address()
            nFT_List_Up(r0, r1)
            return
    }

    public static int nFT_List_Iterate(long r9, long r11, long r13) {
            long r0 = org.lwjgl.util.freetype.FreeType.Functions.List_Iterate
            r15 = r0
            r0 = r9
            r1 = r11
            r2 = r13
            r3 = r15
            int r0 = org.lwjgl.system.JNI.invokePPPI(r0, r1, r2, r3)
            return r0
    }

    @org.lwjgl.system.NativeType("FT_Error")
    public static int FT_List_Iterate(org.lwjgl.util.freetype.FT_List r7, @org.lwjgl.system.NativeType("FT_List_Iterator") org.lwjgl.util.freetype.FT_List_IteratorI r8, @org.lwjgl.system.NativeType("void *") long r9) {
            r0 = r7
            long r0 = r0.address()
            r1 = r8
            long r1 = r1.address()
            r2 = r9
            int r0 = nFT_List_Iterate(r0, r1, r2)
            return r0
    }

    public static void nFT_List_Finalize(long r11, long r13, long r15, long r17) {
            long r0 = org.lwjgl.util.freetype.FreeType.Functions.List_Finalize
            r19 = r0
            r0 = r11
            r1 = r13
            r2 = r15
            r3 = r17
            r4 = r19
            org.lwjgl.system.JNI.invokePPPPV(r0, r1, r2, r3, r4)
            return
    }

    public static void FT_List_Finalize(org.lwjgl.util.freetype.FT_List r9, @javax.annotation.Nullable @org.lwjgl.system.NativeType("FT_List_Destructor") org.lwjgl.util.freetype.FT_List_DestructorI r10, org.lwjgl.util.freetype.FT_Memory r11, @org.lwjgl.system.NativeType("void *") long r12) {
            r0 = r9
            long r0 = r0.address()
            r1 = r10
            long r1 = org.lwjgl.system.MemoryUtil.memAddressSafe(r1)
            r2 = r11
            long r2 = r2.address()
            r3 = r12
            nFT_List_Finalize(r0, r1, r2, r3)
            return
    }

    public static int nFT_Stream_OpenLZW(long r7, long r9) {
            long r0 = org.lwjgl.util.freetype.FreeType.Functions.Stream_OpenLZW
            r11 = r0
            r0 = r7
            r1 = r9
            r2 = r11
            int r0 = org.lwjgl.system.JNI.invokePPI(r0, r1, r2)
            return r0
    }

    @org.lwjgl.system.NativeType("FT_Error")
    public static int FT_Stream_OpenLZW(org.lwjgl.util.freetype.FT_Stream r5, org.lwjgl.util.freetype.FT_Stream r6) {
            r0 = r5
            long r0 = r0.address()
            r1 = r6
            long r1 = r1.address()
            int r0 = nFT_Stream_OpenLZW(r0, r1)
            return r0
    }

    public static int nFT_Get_Multi_Master(long r7, long r9) {
            long r0 = org.lwjgl.util.freetype.FreeType.Functions.Get_Multi_Master
            r11 = r0
            r0 = r7
            r1 = r9
            r2 = r11
            int r0 = org.lwjgl.system.JNI.invokePPI(r0, r1, r2)
            return r0
    }

    @org.lwjgl.system.NativeType("FT_Error")
    public static int FT_Get_Multi_Master(org.lwjgl.util.freetype.FT_Face r5, @org.lwjgl.system.NativeType("FT_Multi_Master *") org.lwjgl.util.freetype.FT_Multi_Master r6) {
            r0 = r5
            long r0 = r0.address()
            r1 = r6
            long r1 = r1.address()
            int r0 = nFT_Get_Multi_Master(r0, r1)
            return r0
    }

    public static int nFT_Get_MM_Var(long r7, long r9) {
            long r0 = org.lwjgl.util.freetype.FreeType.Functions.Get_MM_Var
            r11 = r0
            r0 = r7
            r1 = r9
            r2 = r11
            int r0 = org.lwjgl.system.JNI.invokePPI(r0, r1, r2)
            return r0
    }

    @org.lwjgl.system.NativeType("FT_Error")
    public static int FT_Get_MM_Var(org.lwjgl.util.freetype.FT_Face r5, @org.lwjgl.system.NativeType("FT_MM_Var **") org.lwjgl.PointerBuffer r6) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r6
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
        Lb:
            r0 = r5
            long r0 = r0.address()
            r1 = r6
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            int r0 = nFT_Get_MM_Var(r0, r1)
            return r0
    }

    public static int nFT_Done_MM_Var(long r7, long r9) {
            long r0 = org.lwjgl.util.freetype.FreeType.Functions.Done_MM_Var
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

    @org.lwjgl.system.NativeType("FT_Error")
    public static int FT_Done_MM_Var(@org.lwjgl.system.NativeType("FT_Library") long r5, @org.lwjgl.system.NativeType("FT_MM_Var *") org.lwjgl.util.freetype.FT_MM_Var r7) {
            r0 = r5
            r1 = r7
            long r1 = r1.address()
            int r0 = nFT_Done_MM_Var(r0, r1)
            return r0
    }

    public static int nFT_Set_MM_Design_Coordinates(long r8, int r10, long r11) {
            long r0 = org.lwjgl.util.freetype.FreeType.Functions.Set_MM_Design_Coordinates
            r13 = r0
            r0 = r8
            r1 = r10
            r2 = r11
            r3 = r13
            int r0 = org.lwjgl.system.JNI.invokePPI(r0, r1, r2, r3)
            return r0
    }

    @org.lwjgl.system.NativeType("FT_Error")
    public static int FT_Set_MM_Design_Coordinates(org.lwjgl.util.freetype.FT_Face r6, @org.lwjgl.system.NativeType("FT_Long *") org.lwjgl.CLongBuffer r7) {
            r0 = r6
            long r0 = r0.address()
            r1 = r7
            int r1 = r1.remaining()
            r2 = r7
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            int r0 = nFT_Set_MM_Design_Coordinates(r0, r1, r2)
            return r0
    }

    public static int nFT_Set_Var_Design_Coordinates(long r8, int r10, long r11) {
            long r0 = org.lwjgl.util.freetype.FreeType.Functions.Set_Var_Design_Coordinates
            r13 = r0
            r0 = r8
            r1 = r10
            r2 = r11
            r3 = r13
            int r0 = org.lwjgl.system.JNI.invokePPI(r0, r1, r2, r3)
            return r0
    }

    @org.lwjgl.system.NativeType("FT_Error")
    public static int FT_Set_Var_Design_Coordinates(org.lwjgl.util.freetype.FT_Face r6, @org.lwjgl.system.NativeType("FT_Fixed *") org.lwjgl.CLongBuffer r7) {
            r0 = r6
            long r0 = r0.address()
            r1 = r7
            int r1 = r1.remaining()
            r2 = r7
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            int r0 = nFT_Set_Var_Design_Coordinates(r0, r1, r2)
            return r0
    }

    public static int nFT_Get_Var_Design_Coordinates(long r8, int r10, long r11) {
            long r0 = org.lwjgl.util.freetype.FreeType.Functions.Get_Var_Design_Coordinates
            r13 = r0
            r0 = r8
            r1 = r10
            r2 = r11
            r3 = r13
            int r0 = org.lwjgl.system.JNI.invokePPI(r0, r1, r2, r3)
            return r0
    }

    @org.lwjgl.system.NativeType("FT_Error")
    public static int FT_Get_Var_Design_Coordinates(org.lwjgl.util.freetype.FT_Face r6, @org.lwjgl.system.NativeType("FT_Fixed *") org.lwjgl.CLongBuffer r7) {
            r0 = r6
            long r0 = r0.address()
            r1 = r7
            int r1 = r1.remaining()
            r2 = r7
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            int r0 = nFT_Get_Var_Design_Coordinates(r0, r1, r2)
            return r0
    }

    public static int nFT_Set_MM_Blend_Coordinates(long r8, int r10, long r11) {
            long r0 = org.lwjgl.util.freetype.FreeType.Functions.Set_MM_Blend_Coordinates
            r13 = r0
            r0 = r8
            r1 = r10
            r2 = r11
            r3 = r13
            int r0 = org.lwjgl.system.JNI.invokePPI(r0, r1, r2, r3)
            return r0
    }

    @org.lwjgl.system.NativeType("FT_Error")
    public static int FT_Set_MM_Blend_Coordinates(org.lwjgl.util.freetype.FT_Face r6, @org.lwjgl.system.NativeType("FT_Fixed *") org.lwjgl.CLongBuffer r7) {
            r0 = r6
            long r0 = r0.address()
            r1 = r7
            int r1 = r1.remaining()
            r2 = r7
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            int r0 = nFT_Set_MM_Blend_Coordinates(r0, r1, r2)
            return r0
    }

    public static int nFT_Get_MM_Blend_Coordinates(long r8, int r10, long r11) {
            long r0 = org.lwjgl.util.freetype.FreeType.Functions.Get_MM_Blend_Coordinates
            r13 = r0
            r0 = r8
            r1 = r10
            r2 = r11
            r3 = r13
            int r0 = org.lwjgl.system.JNI.invokePPI(r0, r1, r2, r3)
            return r0
    }

    @org.lwjgl.system.NativeType("FT_Error")
    public static int FT_Get_MM_Blend_Coordinates(org.lwjgl.util.freetype.FT_Face r6, @org.lwjgl.system.NativeType("FT_Fixed *") org.lwjgl.CLongBuffer r7) {
            r0 = r6
            long r0 = r0.address()
            r1 = r7
            int r1 = r1.remaining()
            r2 = r7
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            int r0 = nFT_Get_MM_Blend_Coordinates(r0, r1, r2)
            return r0
    }

    public static int nFT_Set_Var_Blend_Coordinates(long r8, int r10, long r11) {
            long r0 = org.lwjgl.util.freetype.FreeType.Functions.Set_Var_Blend_Coordinates
            r13 = r0
            r0 = r8
            r1 = r10
            r2 = r11
            r3 = r13
            int r0 = org.lwjgl.system.JNI.invokePPI(r0, r1, r2, r3)
            return r0
    }

    @org.lwjgl.system.NativeType("FT_Error")
    public static int FT_Set_Var_Blend_Coordinates(org.lwjgl.util.freetype.FT_Face r6, @org.lwjgl.system.NativeType("FT_Fixed *") org.lwjgl.CLongBuffer r7) {
            r0 = r6
            long r0 = r0.address()
            r1 = r7
            int r1 = r1.remaining()
            r2 = r7
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            int r0 = nFT_Set_Var_Blend_Coordinates(r0, r1, r2)
            return r0
    }

    public static int nFT_Get_Var_Blend_Coordinates(long r8, int r10, long r11) {
            long r0 = org.lwjgl.util.freetype.FreeType.Functions.Get_Var_Blend_Coordinates
            r13 = r0
            r0 = r8
            r1 = r10
            r2 = r11
            r3 = r13
            int r0 = org.lwjgl.system.JNI.invokePPI(r0, r1, r2, r3)
            return r0
    }

    @org.lwjgl.system.NativeType("FT_Error")
    public static int FT_Get_Var_Blend_Coordinates(org.lwjgl.util.freetype.FT_Face r6, @org.lwjgl.system.NativeType("FT_Fixed *") org.lwjgl.CLongBuffer r7) {
            r0 = r6
            long r0 = r0.address()
            r1 = r7
            int r1 = r1.remaining()
            r2 = r7
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            int r0 = nFT_Get_Var_Blend_Coordinates(r0, r1, r2)
            return r0
    }

    public static int nFT_Set_MM_WeightVector(long r8, int r10, long r11) {
            long r0 = org.lwjgl.util.freetype.FreeType.Functions.Set_MM_WeightVector
            r13 = r0
            r0 = r8
            r1 = r10
            r2 = r11
            r3 = r13
            int r0 = org.lwjgl.system.JNI.invokePPI(r0, r1, r2, r3)
            return r0
    }

    @org.lwjgl.system.NativeType("FT_Error")
    public static int FT_Set_MM_WeightVector(org.lwjgl.util.freetype.FT_Face r6, @javax.annotation.Nullable @org.lwjgl.system.NativeType("FT_Fixed *") org.lwjgl.CLongBuffer r7) {
            r0 = r6
            long r0 = r0.address()
            r1 = r7
            int r1 = org.lwjgl.system.Checks.remainingSafe(r1)
            r2 = r7
            long r2 = org.lwjgl.system.MemoryUtil.memAddressSafe(r2)
            int r0 = nFT_Set_MM_WeightVector(r0, r1, r2)
            return r0
    }

    public static int nFT_Get_MM_WeightVector(long r9, long r11, long r13) {
            long r0 = org.lwjgl.util.freetype.FreeType.Functions.Get_MM_WeightVector
            r15 = r0
            r0 = r9
            r1 = r11
            r2 = r13
            r3 = r15
            int r0 = org.lwjgl.system.JNI.invokePPPI(r0, r1, r2, r3)
            return r0
    }

    @org.lwjgl.system.NativeType("FT_Error")
    public static int FT_Get_MM_WeightVector(org.lwjgl.util.freetype.FT_Face r7, @org.lwjgl.system.NativeType("FT_UInt *") java.nio.IntBuffer r8, @org.lwjgl.system.NativeType("FT_Fixed *") org.lwjgl.CLongBuffer r9) {
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
            org.lwjgl.system.Checks.check(r0, r1)
        L17:
            r0 = r7
            long r0 = r0.address()
            r1 = r8
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            r2 = r9
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            int r0 = nFT_Get_MM_WeightVector(r0, r1, r2)
            return r0
    }

    public static int nFT_Get_Var_Axis_Flags(long r8, int r10, long r11) {
            long r0 = org.lwjgl.util.freetype.FreeType.Functions.Get_Var_Axis_Flags
            r13 = r0
            r0 = r8
            r1 = r10
            r2 = r11
            r3 = r13
            int r0 = org.lwjgl.system.JNI.invokePPI(r0, r1, r2, r3)
            return r0
    }

    @org.lwjgl.system.NativeType("FT_Error")
    public static int FT_Get_Var_Axis_Flags(@org.lwjgl.system.NativeType("FT_MM_Var *") org.lwjgl.util.freetype.FT_MM_Var r6, @org.lwjgl.system.NativeType("FT_UInt") int r7, @org.lwjgl.system.NativeType("FT_UInt *") java.nio.IntBuffer r8) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r8
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
        Lb:
            r0 = r6
            long r0 = r0.address()
            r1 = r7
            r2 = r8
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            int r0 = nFT_Get_Var_Axis_Flags(r0, r1, r2)
            return r0
    }

    public static int nFT_Set_Named_Instance(long r6, int r8) {
            long r0 = org.lwjgl.util.freetype.FreeType.Functions.Set_Named_Instance
            r9 = r0
            r0 = r6
            r1 = r8
            r2 = r9
            int r0 = org.lwjgl.system.JNI.invokePI(r0, r1, r2)
            return r0
    }

    @org.lwjgl.system.NativeType("FT_Error")
    public static int FT_Set_Named_Instance(org.lwjgl.util.freetype.FT_Face r4, @org.lwjgl.system.NativeType("FT_UInt") int r5) {
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            int r0 = nFT_Set_Named_Instance(r0, r1)
            return r0
    }

    public static int nFT_Get_Default_Named_Instance(long r7, long r9) {
            long r0 = org.lwjgl.util.freetype.FreeType.Functions.Get_Default_Named_Instance
            r11 = r0
            r0 = r7
            r1 = r9
            r2 = r11
            int r0 = org.lwjgl.system.JNI.invokePPI(r0, r1, r2)
            return r0
    }

    @org.lwjgl.system.NativeType("FT_Error")
    public static int FT_Get_Default_Named_Instance(org.lwjgl.util.freetype.FT_Face r5, @org.lwjgl.system.NativeType("FT_UInt *") java.nio.IntBuffer r6) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r6
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
        Lb:
            r0 = r5
            long r0 = r0.address()
            r1 = r6
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            int r0 = nFT_Get_Default_Named_Instance(r0, r1)
            return r0
    }

    public static int nFT_Add_Module(long r7, long r9) {
            long r0 = org.lwjgl.util.freetype.FreeType.Functions.Add_Module
            r11 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L14
            r0 = r7
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r9
            org.lwjgl.util.freetype.FT_Module_Class.validate(r0)
        L14:
            r0 = r7
            r1 = r9
            r2 = r11
            int r0 = org.lwjgl.system.JNI.invokePPI(r0, r1, r2)
            return r0
    }

    @org.lwjgl.system.NativeType("FT_Error")
    public static int FT_Add_Module(@org.lwjgl.system.NativeType("FT_Library") long r5, @org.lwjgl.system.NativeType("FT_Module_Class const *") org.lwjgl.util.freetype.FT_Module_Class r7) {
            r0 = r5
            r1 = r7
            long r1 = r1.address()
            int r0 = nFT_Add_Module(r0, r1)
            return r0
    }

    public static long nFT_Get_Module(long r7, long r9) {
            long r0 = org.lwjgl.util.freetype.FreeType.Functions.Get_Module
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

    @org.lwjgl.system.NativeType("FT_Module")
    public static long FT_Get_Module(@org.lwjgl.system.NativeType("FT_Library") long r5, @org.lwjgl.system.NativeType("char const *") java.nio.ByteBuffer r7) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto La
            r0 = r7
            org.lwjgl.system.Checks.checkNT1(r0)
        La:
            r0 = r5
            r1 = r7
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            long r0 = nFT_Get_Module(r0, r1)
            return r0
    }

    @org.lwjgl.system.NativeType("FT_Module")
    public static long FT_Get_Module(@org.lwjgl.system.NativeType("FT_Library") long r5, @org.lwjgl.system.NativeType("char const *") java.lang.CharSequence r7) {
            org.lwjgl.system.MemoryStack r0 = org.lwjgl.system.MemoryStack.stackGet()
            r8 = r0
            r0 = r8
            int r0 = r0.getPointer()
            r9 = r0
            r0 = r8
            r1 = r7
            r2 = 1
            int r0 = r0.nASCII(r1, r2)     // Catch: java.lang.Throwable -> L28
            r0 = r8
            long r0 = r0.getPointerAddress()     // Catch: java.lang.Throwable -> L28
            r10 = r0
            r0 = r5
            r1 = r10
            long r0 = nFT_Get_Module(r0, r1)     // Catch: java.lang.Throwable -> L28
            r12 = r0
            r0 = r8
            r1 = r9
            r0.setPointer(r1)
            r0 = r12
            return r0
        L28:
            r14 = move-exception
            r0 = r8
            r1 = r9
            r0.setPointer(r1)
            r0 = r14
            throw r0
    }

    @org.lwjgl.system.NativeType("FT_Error")
    public static int FT_Remove_Module(@org.lwjgl.system.NativeType("FT_Library") long r7, @org.lwjgl.system.NativeType("FT_Module") long r9) {
            long r0 = org.lwjgl.util.freetype.FreeType.Functions.Remove_Module
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

    public static int nFT_Property_Set(long r11, long r13, long r15, long r17) {
            long r0 = org.lwjgl.util.freetype.FreeType.Functions.Property_Set
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

    @org.lwjgl.system.NativeType("FT_Error")
    public static int FT_Property_Set(@org.lwjgl.system.NativeType("FT_Library") long r9, @org.lwjgl.system.NativeType("FT_String const *") java.nio.ByteBuffer r11, @org.lwjgl.system.NativeType("FT_String const *") java.nio.ByteBuffer r12, @org.lwjgl.system.NativeType("void const *") java.nio.ByteBuffer r13) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Le
            r0 = r11
            org.lwjgl.system.Checks.checkNT1(r0)
            r0 = r12
            org.lwjgl.system.Checks.checkNT1(r0)
        Le:
            r0 = r9
            r1 = r11
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            r2 = r12
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            r3 = r13
            long r3 = org.lwjgl.system.MemoryUtil.memAddress(r3)
            int r0 = nFT_Property_Set(r0, r1, r2, r3)
            return r0
    }

    @org.lwjgl.system.NativeType("FT_Error")
    public static int FT_Property_Set(@org.lwjgl.system.NativeType("FT_Library") long r9, @org.lwjgl.system.NativeType("FT_String const *") java.lang.CharSequence r11, @org.lwjgl.system.NativeType("FT_String const *") java.lang.CharSequence r12, @org.lwjgl.system.NativeType("void const *") java.nio.ByteBuffer r13) {
            org.lwjgl.system.MemoryStack r0 = org.lwjgl.system.MemoryStack.stackGet()
            r14 = r0
            r0 = r14
            int r0 = r0.getPointer()
            r15 = r0
            r0 = r14
            r1 = r11
            r2 = 1
            int r0 = r0.nUTF8(r1, r2)     // Catch: java.lang.Throwable -> L43
            r0 = r14
            long r0 = r0.getPointerAddress()     // Catch: java.lang.Throwable -> L43
            r16 = r0
            r0 = r14
            r1 = r12
            r2 = 1
            int r0 = r0.nUTF8(r1, r2)     // Catch: java.lang.Throwable -> L43
            r0 = r14
            long r0 = r0.getPointerAddress()     // Catch: java.lang.Throwable -> L43
            r18 = r0
            r0 = r9
            r1 = r16
            r2 = r18
            r3 = r13
            long r3 = org.lwjgl.system.MemoryUtil.memAddress(r3)     // Catch: java.lang.Throwable -> L43
            int r0 = nFT_Property_Set(r0, r1, r2, r3)     // Catch: java.lang.Throwable -> L43
            r20 = r0
            r0 = r14
            r1 = r15
            r0.setPointer(r1)
            r0 = r20
            return r0
        L43:
            r21 = move-exception
            r0 = r14
            r1 = r15
            r0.setPointer(r1)
            r0 = r21
            throw r0
    }

    public static int nFT_Property_Get(long r11, long r13, long r15, long r17) {
            long r0 = org.lwjgl.util.freetype.FreeType.Functions.Property_Get
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

    @org.lwjgl.system.NativeType("FT_Error")
    public static int FT_Property_Get(@org.lwjgl.system.NativeType("FT_Library") long r9, @org.lwjgl.system.NativeType("FT_String const *") java.nio.ByteBuffer r11, @org.lwjgl.system.NativeType("FT_String const *") java.nio.ByteBuffer r12, @org.lwjgl.system.NativeType("void *") java.nio.ByteBuffer r13) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Le
            r0 = r11
            org.lwjgl.system.Checks.checkNT1(r0)
            r0 = r12
            org.lwjgl.system.Checks.checkNT1(r0)
        Le:
            r0 = r9
            r1 = r11
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            r2 = r12
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            r3 = r13
            long r3 = org.lwjgl.system.MemoryUtil.memAddress(r3)
            int r0 = nFT_Property_Get(r0, r1, r2, r3)
            return r0
    }

    @org.lwjgl.system.NativeType("FT_Error")
    public static int FT_Property_Get(@org.lwjgl.system.NativeType("FT_Library") long r9, @org.lwjgl.system.NativeType("FT_String const *") java.lang.CharSequence r11, @org.lwjgl.system.NativeType("FT_String const *") java.lang.CharSequence r12, @org.lwjgl.system.NativeType("void *") java.nio.ByteBuffer r13) {
            org.lwjgl.system.MemoryStack r0 = org.lwjgl.system.MemoryStack.stackGet()
            r14 = r0
            r0 = r14
            int r0 = r0.getPointer()
            r15 = r0
            r0 = r14
            r1 = r11
            r2 = 1
            int r0 = r0.nUTF8(r1, r2)     // Catch: java.lang.Throwable -> L43
            r0 = r14
            long r0 = r0.getPointerAddress()     // Catch: java.lang.Throwable -> L43
            r16 = r0
            r0 = r14
            r1 = r12
            r2 = 1
            int r0 = r0.nUTF8(r1, r2)     // Catch: java.lang.Throwable -> L43
            r0 = r14
            long r0 = r0.getPointerAddress()     // Catch: java.lang.Throwable -> L43
            r18 = r0
            r0 = r9
            r1 = r16
            r2 = r18
            r3 = r13
            long r3 = org.lwjgl.system.MemoryUtil.memAddress(r3)     // Catch: java.lang.Throwable -> L43
            int r0 = nFT_Property_Get(r0, r1, r2, r3)     // Catch: java.lang.Throwable -> L43
            r20 = r0
            r0 = r14
            r1 = r15
            r0.setPointer(r1)
            r0 = r20
            return r0
        L43:
            r21 = move-exception
            r0 = r14
            r1 = r15
            r0.setPointer(r1)
            r0 = r21
            throw r0
    }

    public static void FT_Set_Default_Properties(@org.lwjgl.system.NativeType("FT_Library") long r5) {
            long r0 = org.lwjgl.util.freetype.FreeType.Functions.Set_Default_Properties
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

    @org.lwjgl.system.NativeType("FT_Error")
    public static int FT_Reference_Library(@org.lwjgl.system.NativeType("FT_Library") long r5) {
            long r0 = org.lwjgl.util.freetype.FreeType.Functions.Reference_Library
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

    public static int nFT_New_Library(long r7, long r9) {
            long r0 = org.lwjgl.util.freetype.FreeType.Functions.New_Library
            r11 = r0
            r0 = r7
            r1 = r9
            r2 = r11
            int r0 = org.lwjgl.system.JNI.invokePPI(r0, r1, r2)
            return r0
    }

    @org.lwjgl.system.NativeType("FT_Error")
    public static int FT_New_Library(org.lwjgl.util.freetype.FT_Memory r5, @org.lwjgl.system.NativeType("FT_Library *") org.lwjgl.PointerBuffer r6) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r6
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
        Lb:
            r0 = r5
            long r0 = r0.address()
            r1 = r6
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            int r0 = nFT_New_Library(r0, r1)
            return r0
    }

    @org.lwjgl.system.NativeType("FT_Error")
    public static int FT_Done_Library(@org.lwjgl.system.NativeType("FT_Library") long r5) {
            long r0 = org.lwjgl.util.freetype.FreeType.Functions.Done_Library
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

    public static void nFT_Set_Debug_Hook(long r8, int r10, long r11) {
            long r0 = org.lwjgl.util.freetype.FreeType.Functions.Set_Debug_Hook
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

    public static void FT_Set_Debug_Hook(@org.lwjgl.system.NativeType("FT_Library") long r6, @org.lwjgl.system.NativeType("FT_UInt") int r8, @javax.annotation.Nullable @org.lwjgl.system.NativeType("FT_DebugHook_Func") org.lwjgl.util.freetype.FT_DebugHook_FuncI r9) {
            r0 = r6
            r1 = r8
            r2 = r9
            long r2 = org.lwjgl.system.MemoryUtil.memAddressSafe(r2)
            nFT_Set_Debug_Hook(r0, r1, r2)
            return
    }

    public static void FT_Add_Default_Modules(@org.lwjgl.system.NativeType("FT_Library") long r5) {
            long r0 = org.lwjgl.util.freetype.FreeType.Functions.Add_Default_Modules
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

    @org.lwjgl.system.NativeType("FT_TrueTypeEngineType")
    public static int FT_Get_TrueType_Engine_Type(@org.lwjgl.system.NativeType("FT_Library") long r5) {
            long r0 = org.lwjgl.util.freetype.FreeType.Functions.Get_TrueType_Engine_Type
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

    public static int nFT_OpenType_Validate(long r16, int r18, long r19, long r21, long r23, long r25, long r27) {
            long r0 = org.lwjgl.util.freetype.FreeType.Functions.OpenType_Validate
            r29 = r0
            r0 = r16
            r1 = r18
            r2 = r19
            r3 = r21
            r4 = r23
            r5 = r25
            r6 = r27
            r7 = r29
            int r0 = org.lwjgl.system.JNI.invokePPPPPPI(r0, r1, r2, r3, r4, r5, r6, r7)
            return r0
    }

    @org.lwjgl.system.NativeType("FT_Error")
    public static int FT_OpenType_Validate(org.lwjgl.util.freetype.FT_Face r14, @org.lwjgl.system.NativeType("FT_UInt") int r15, @org.lwjgl.system.NativeType("FT_Bytes *") org.lwjgl.PointerBuffer r16, @org.lwjgl.system.NativeType("FT_Bytes *") org.lwjgl.PointerBuffer r17, @org.lwjgl.system.NativeType("FT_Bytes *") org.lwjgl.PointerBuffer r18, @org.lwjgl.system.NativeType("FT_Bytes *") org.lwjgl.PointerBuffer r19, @org.lwjgl.system.NativeType("FT_Bytes *") org.lwjgl.PointerBuffer r20) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L22
            r0 = r16
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
            r0 = r17
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
            r0 = r18
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
            r0 = r19
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
            r0 = r20
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
        L22:
            r0 = r14
            long r0 = r0.address()
            r1 = r15
            r2 = r16
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            r3 = r17
            long r3 = org.lwjgl.system.MemoryUtil.memAddress(r3)
            r4 = r18
            long r4 = org.lwjgl.system.MemoryUtil.memAddress(r4)
            r5 = r19
            long r5 = org.lwjgl.system.MemoryUtil.memAddress(r5)
            r6 = r20
            long r6 = org.lwjgl.system.MemoryUtil.memAddress(r6)
            int r0 = nFT_OpenType_Validate(r0, r1, r2, r3, r4, r5, r6)
            return r0
    }

    public static void nFT_OpenType_Free(long r7, long r9) {
            long r0 = org.lwjgl.util.freetype.FreeType.Functions.OpenType_Free
            r11 = r0
            r0 = r7
            r1 = r9
            r2 = r11
            org.lwjgl.system.JNI.invokePPV(r0, r1, r2)
            return
    }

    public static void FT_OpenType_Free(org.lwjgl.util.freetype.FT_Face r5, @org.lwjgl.system.NativeType("FT_Bytes") java.nio.ByteBuffer r6) {
            r0 = r5
            long r0 = r0.address()
            r1 = r6
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            nFT_OpenType_Free(r0, r1)
            return
    }

    public static int nFT_Outline_Decompose(long r9, long r11, long r13) {
            long r0 = org.lwjgl.util.freetype.FreeType.Functions.Outline_Decompose
            r15 = r0
            r0 = r9
            r1 = r11
            r2 = r13
            r3 = r15
            int r0 = org.lwjgl.system.JNI.invokePPPI(r0, r1, r2, r3)
            return r0
    }

    @org.lwjgl.system.NativeType("FT_Error")
    public static int FT_Outline_Decompose(@org.lwjgl.system.NativeType("FT_Outline *") org.lwjgl.util.freetype.FT_Outline r7, @org.lwjgl.system.NativeType("FT_Outline_Funcs const *") org.lwjgl.util.freetype.FT_Outline_Funcs r8, @org.lwjgl.system.NativeType("void *") long r9) {
            r0 = r7
            long r0 = r0.address()
            r1 = r8
            long r1 = r1.address()
            r2 = r9
            int r0 = nFT_Outline_Decompose(r0, r1, r2)
            return r0
    }

    public static int nFT_Outline_New(long r9, int r11, int r12, long r13) {
            long r0 = org.lwjgl.util.freetype.FreeType.Functions.Outline_New
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

    @org.lwjgl.system.NativeType("FT_Error")
    public static int FT_Outline_New(@org.lwjgl.system.NativeType("FT_Library") long r7, @org.lwjgl.system.NativeType("FT_UInt") int r9, @org.lwjgl.system.NativeType("FT_Int") int r10, @org.lwjgl.system.NativeType("FT_Outline *") org.lwjgl.util.freetype.FT_Outline r11) {
            r0 = r7
            r1 = r9
            r2 = r10
            r3 = r11
            long r3 = r3.address()
            int r0 = nFT_Outline_New(r0, r1, r2, r3)
            return r0
    }

    public static int nFT_Outline_Done(long r7, long r9) {
            long r0 = org.lwjgl.util.freetype.FreeType.Functions.Outline_Done
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

    @org.lwjgl.system.NativeType("FT_Error")
    public static int FT_Outline_Done(@org.lwjgl.system.NativeType("FT_Library") long r5, @org.lwjgl.system.NativeType("FT_Outline *") org.lwjgl.util.freetype.FT_Outline r7) {
            r0 = r5
            r1 = r7
            long r1 = r1.address()
            int r0 = nFT_Outline_Done(r0, r1)
            return r0
    }

    public static int nFT_Outline_Check(long r5) {
            long r0 = org.lwjgl.util.freetype.FreeType.Functions.Outline_Check
            r7 = r0
            r0 = r5
            r1 = r7
            int r0 = org.lwjgl.system.JNI.invokePI(r0, r1)
            return r0
    }

    @org.lwjgl.system.NativeType("FT_Error")
    public static int FT_Outline_Check(@org.lwjgl.system.NativeType("FT_Outline *") org.lwjgl.util.freetype.FT_Outline r3) {
            r0 = r3
            long r0 = r0.address()
            int r0 = nFT_Outline_Check(r0)
            return r0
    }

    public static void nFT_Outline_Get_CBox(long r7, long r9) {
            long r0 = org.lwjgl.util.freetype.FreeType.Functions.Outline_Get_CBox
            r11 = r0
            r0 = r7
            r1 = r9
            r2 = r11
            org.lwjgl.system.JNI.invokePPV(r0, r1, r2)
            return
    }

    public static void FT_Outline_Get_CBox(@org.lwjgl.system.NativeType("FT_Outline const *") org.lwjgl.util.freetype.FT_Outline r5, @org.lwjgl.system.NativeType("FT_BBox *") org.lwjgl.util.freetype.FT_BBox r6) {
            r0 = r5
            long r0 = r0.address()
            r1 = r6
            long r1 = r1.address()
            nFT_Outline_Get_CBox(r0, r1)
            return
    }

    public static void nFT_Outline_Translate(long r9, long r11, long r13) {
            long r0 = org.lwjgl.util.freetype.FreeType.Functions.Outline_Translate
            r15 = r0
            r0 = r9
            r1 = r11
            r2 = r13
            r3 = r15
            org.lwjgl.system.JNI.invokePNNV(r0, r1, r2, r3)
            return
    }

    public static void FT_Outline_Translate(@org.lwjgl.system.NativeType("FT_Outline const *") org.lwjgl.util.freetype.FT_Outline r7, @org.lwjgl.system.NativeType("FT_Pos") long r8, @org.lwjgl.system.NativeType("FT_Pos") long r10) {
            r0 = r7
            long r0 = r0.address()
            r1 = r8
            r2 = r10
            nFT_Outline_Translate(r0, r1, r2)
            return
    }

    public static int nFT_Outline_Copy(long r7, long r9) {
            long r0 = org.lwjgl.util.freetype.FreeType.Functions.Outline_Copy
            r11 = r0
            r0 = r7
            r1 = r9
            r2 = r11
            int r0 = org.lwjgl.system.JNI.invokePPI(r0, r1, r2)
            return r0
    }

    @org.lwjgl.system.NativeType("FT_Error")
    public static int FT_Outline_Copy(@org.lwjgl.system.NativeType("FT_Outline const *") org.lwjgl.util.freetype.FT_Outline r5, @org.lwjgl.system.NativeType("FT_Outline *") org.lwjgl.util.freetype.FT_Outline r6) {
            r0 = r5
            long r0 = r0.address()
            r1 = r6
            long r1 = r1.address()
            int r0 = nFT_Outline_Copy(r0, r1)
            return r0
    }

    public static void nFT_Outline_Transform(long r7, long r9) {
            long r0 = org.lwjgl.util.freetype.FreeType.Functions.Outline_Transform
            r11 = r0
            r0 = r7
            r1 = r9
            r2 = r11
            org.lwjgl.system.JNI.invokePPV(r0, r1, r2)
            return
    }

    public static void FT_Outline_Transform(@org.lwjgl.system.NativeType("FT_Outline const *") org.lwjgl.util.freetype.FT_Outline r5, @org.lwjgl.system.NativeType("FT_Matrix const *") org.lwjgl.util.freetype.FT_Matrix r6) {
            r0 = r5
            long r0 = r0.address()
            r1 = r6
            long r1 = r1.address()
            nFT_Outline_Transform(r0, r1)
            return
    }

    public static int nFT_Outline_Embolden(long r7, long r9) {
            long r0 = org.lwjgl.util.freetype.FreeType.Functions.Outline_Embolden
            r11 = r0
            r0 = r7
            r1 = r9
            r2 = r11
            int r0 = org.lwjgl.system.JNI.invokePNI(r0, r1, r2)
            return r0
    }

    @org.lwjgl.system.NativeType("FT_Error")
    public static int FT_Outline_Embolden(@org.lwjgl.system.NativeType("FT_Outline *") org.lwjgl.util.freetype.FT_Outline r5, @org.lwjgl.system.NativeType("FT_Pos") long r6) {
            r0 = r5
            long r0 = r0.address()
            r1 = r6
            int r0 = nFT_Outline_Embolden(r0, r1)
            return r0
    }

    public static int nFT_Outline_EmboldenXY(long r9, long r11, long r13) {
            long r0 = org.lwjgl.util.freetype.FreeType.Functions.Outline_EmboldenXY
            r15 = r0
            r0 = r9
            r1 = r11
            r2 = r13
            r3 = r15
            int r0 = org.lwjgl.system.JNI.invokePNNI(r0, r1, r2, r3)
            return r0
    }

    @org.lwjgl.system.NativeType("FT_Error")
    public static int FT_Outline_EmboldenXY(@org.lwjgl.system.NativeType("FT_Outline *") org.lwjgl.util.freetype.FT_Outline r7, @org.lwjgl.system.NativeType("FT_Pos") long r8, @org.lwjgl.system.NativeType("FT_Pos") long r10) {
            r0 = r7
            long r0 = r0.address()
            r1 = r8
            r2 = r10
            int r0 = nFT_Outline_EmboldenXY(r0, r1, r2)
            return r0
    }

    public static void nFT_Outline_Reverse(long r5) {
            long r0 = org.lwjgl.util.freetype.FreeType.Functions.Outline_Reverse
            r7 = r0
            r0 = r5
            r1 = r7
            org.lwjgl.system.JNI.invokePV(r0, r1)
            return
    }

    public static void FT_Outline_Reverse(@org.lwjgl.system.NativeType("FT_Outline *") org.lwjgl.util.freetype.FT_Outline r3) {
            r0 = r3
            long r0 = r0.address()
            nFT_Outline_Reverse(r0)
            return
    }

    public static int nFT_Outline_Get_Bitmap(long r9, long r11, long r13) {
            long r0 = org.lwjgl.util.freetype.FreeType.Functions.Outline_Get_Bitmap
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

    @org.lwjgl.system.NativeType("FT_Error")
    public static int FT_Outline_Get_Bitmap(@org.lwjgl.system.NativeType("FT_Library") long r7, @org.lwjgl.system.NativeType("FT_Outline *") org.lwjgl.util.freetype.FT_Outline r9, @org.lwjgl.system.NativeType("FT_Bitmap const *") org.lwjgl.util.freetype.FT_Bitmap r10) {
            r0 = r7
            r1 = r9
            long r1 = r1.address()
            r2 = r10
            long r2 = r2.address()
            int r0 = nFT_Outline_Get_Bitmap(r0, r1, r2)
            return r0
    }

    public static int nFT_Outline_Render(long r9, long r11, long r13) {
            long r0 = org.lwjgl.util.freetype.FreeType.Functions.Outline_Render
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

    @org.lwjgl.system.NativeType("FT_Error")
    public static int FT_Outline_Render(@org.lwjgl.system.NativeType("FT_Library") long r7, @org.lwjgl.system.NativeType("FT_Outline *") org.lwjgl.util.freetype.FT_Outline r9, @org.lwjgl.system.NativeType("FT_Raster_Params *") org.lwjgl.util.freetype.FT_Raster_Params r10) {
            r0 = r7
            r1 = r9
            long r1 = r1.address()
            r2 = r10
            long r2 = r2.address()
            int r0 = nFT_Outline_Render(r0, r1, r2)
            return r0
    }

    public static int nFT_Outline_Get_Orientation(long r5) {
            long r0 = org.lwjgl.util.freetype.FreeType.Functions.Outline_Get_Orientation
            r7 = r0
            r0 = r5
            r1 = r7
            int r0 = org.lwjgl.system.JNI.invokePI(r0, r1)
            return r0
    }

    @org.lwjgl.system.NativeType("FT_Orientation")
    public static int FT_Outline_Get_Orientation(@org.lwjgl.system.NativeType("FT_Outline *") org.lwjgl.util.freetype.FT_Outline r3) {
            r0 = r3
            long r0 = r0.address()
            int r0 = nFT_Outline_Get_Orientation(r0)
            return r0
    }

    public static int nFT_Get_PFR_Metrics(long r13, long r15, long r17, long r19, long r21) {
            long r0 = org.lwjgl.util.freetype.FreeType.Functions.Get_PFR_Metrics
            r23 = r0
            r0 = r13
            r1 = r15
            r2 = r17
            r3 = r19
            r4 = r21
            r5 = r23
            int r0 = org.lwjgl.system.JNI.invokePPPPPI(r0, r1, r2, r3, r4, r5)
            return r0
    }

    @org.lwjgl.system.NativeType("FT_Error")
    public static int FT_Get_PFR_Metrics(org.lwjgl.util.freetype.FT_Face r11, @javax.annotation.Nullable @org.lwjgl.system.NativeType("FT_UInt *") java.nio.IntBuffer r12, @javax.annotation.Nullable @org.lwjgl.system.NativeType("FT_UInt *") java.nio.IntBuffer r13, @javax.annotation.Nullable @org.lwjgl.system.NativeType("FT_Fixed *") org.lwjgl.CLongBuffer r14, @javax.annotation.Nullable @org.lwjgl.system.NativeType("FT_Fixed *") org.lwjgl.CLongBuffer r15) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L1b
            r0 = r12
            r1 = 1
            org.lwjgl.system.Checks.checkSafe(r0, r1)
            r0 = r13
            r1 = 1
            org.lwjgl.system.Checks.checkSafe(r0, r1)
            r0 = r14
            r1 = 1
            org.lwjgl.system.Checks.checkSafe(r0, r1)
            r0 = r15
            r1 = 1
            org.lwjgl.system.Checks.checkSafe(r0, r1)
        L1b:
            r0 = r11
            long r0 = r0.address()
            r1 = r12
            long r1 = org.lwjgl.system.MemoryUtil.memAddressSafe(r1)
            r2 = r13
            long r2 = org.lwjgl.system.MemoryUtil.memAddressSafe(r2)
            r3 = r14
            long r3 = org.lwjgl.system.MemoryUtil.memAddressSafe(r3)
            r4 = r15
            long r4 = org.lwjgl.system.MemoryUtil.memAddressSafe(r4)
            int r0 = nFT_Get_PFR_Metrics(r0, r1, r2, r3, r4)
            return r0
    }

    public static int nFT_Get_PFR_Kerning(long r9, int r11, int r12, long r13) {
            long r0 = org.lwjgl.util.freetype.FreeType.Functions.Get_PFR_Kerning
            r15 = r0
            r0 = r9
            r1 = r11
            r2 = r12
            r3 = r13
            r4 = r15
            int r0 = org.lwjgl.system.JNI.invokePPI(r0, r1, r2, r3, r4)
            return r0
    }

    @org.lwjgl.system.NativeType("FT_Error")
    public static int FT_Get_PFR_Kerning(org.lwjgl.util.freetype.FT_Face r7, @org.lwjgl.system.NativeType("FT_UInt") int r8, @org.lwjgl.system.NativeType("FT_UInt") int r9, @org.lwjgl.system.NativeType("FT_Vector *") org.lwjgl.util.freetype.FT_Vector r10) {
            r0 = r7
            long r0 = r0.address()
            r1 = r8
            r2 = r9
            r3 = r10
            long r3 = r3.address()
            int r0 = nFT_Get_PFR_Kerning(r0, r1, r2, r3)
            return r0
    }

    public static int nFT_Get_PFR_Advance(long r8, int r10, long r11) {
            long r0 = org.lwjgl.util.freetype.FreeType.Functions.Get_PFR_Advance
            r13 = r0
            r0 = r8
            r1 = r10
            r2 = r11
            r3 = r13
            int r0 = org.lwjgl.system.JNI.invokePPI(r0, r1, r2, r3)
            return r0
    }

    @org.lwjgl.system.NativeType("FT_Error")
    public static int FT_Get_PFR_Advance(org.lwjgl.util.freetype.FT_Face r6, @org.lwjgl.system.NativeType("FT_UInt") int r7, @org.lwjgl.system.NativeType("FT_Pos *") org.lwjgl.CLongBuffer r8) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r8
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
        Lb:
            r0 = r6
            long r0 = r0.address()
            r1 = r7
            r2 = r8
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            int r0 = nFT_Get_PFR_Advance(r0, r1, r2)
            return r0
    }

    @org.lwjgl.system.NativeType("FT_Renderer")
    public static long FT_Get_Renderer(@org.lwjgl.system.NativeType("FT_Library") long r6, @org.lwjgl.system.NativeType("FT_Glyph_Format") int r8) {
            long r0 = org.lwjgl.util.freetype.FreeType.Functions.Get_Renderer
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

    public static int nFT_Set_Renderer(long r10, long r12, int r14, long r15) {
            long r0 = org.lwjgl.util.freetype.FreeType.Functions.Set_Renderer
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

    @org.lwjgl.system.NativeType("FT_Error")
    public static int FT_Set_Renderer(@org.lwjgl.system.NativeType("FT_Library") long r8, @org.lwjgl.system.NativeType("FT_Renderer") long r10, @org.lwjgl.system.NativeType("FT_Parameter *") org.lwjgl.util.freetype.FT_Parameter.Buffer r12) {
            r0 = r8
            r1 = r10
            r2 = r12
            int r2 = r2.remaining()
            r3 = r12
            long r3 = r3.address()
            int r0 = nFT_Set_Renderer(r0, r1, r2, r3)
            return r0
    }

    public static int nFT_New_Size(long r7, long r9) {
            long r0 = org.lwjgl.util.freetype.FreeType.Functions.New_Size
            r11 = r0
            r0 = r7
            r1 = r9
            r2 = r11
            int r0 = org.lwjgl.system.JNI.invokePPI(r0, r1, r2)
            return r0
    }

    @org.lwjgl.system.NativeType("FT_Error")
    public static int FT_New_Size(org.lwjgl.util.freetype.FT_Face r5, @org.lwjgl.system.NativeType("FT_Size *") org.lwjgl.PointerBuffer r6) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r6
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
        Lb:
            r0 = r5
            long r0 = r0.address()
            r1 = r6
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            int r0 = nFT_New_Size(r0, r1)
            return r0
    }

    public static int nFT_Done_Size(long r5) {
            long r0 = org.lwjgl.util.freetype.FreeType.Functions.Done_Size
            r7 = r0
            r0 = r5
            r1 = r7
            int r0 = org.lwjgl.system.JNI.invokePI(r0, r1)
            return r0
    }

    @org.lwjgl.system.NativeType("FT_Error")
    public static int FT_Done_Size(org.lwjgl.util.freetype.FT_Size r3) {
            r0 = r3
            long r0 = r0.address()
            int r0 = nFT_Done_Size(r0)
            return r0
    }

    public static int nFT_Activate_Size(long r5) {
            long r0 = org.lwjgl.util.freetype.FreeType.Functions.Activate_Size
            r7 = r0
            r0 = r5
            r1 = r7
            int r0 = org.lwjgl.system.JNI.invokePI(r0, r1)
            return r0
    }

    @org.lwjgl.system.NativeType("FT_Error")
    public static int FT_Activate_Size(org.lwjgl.util.freetype.FT_Size r3) {
            r0 = r3
            long r0 = r0.address()
            int r0 = nFT_Activate_Size(r0)
            return r0
    }

    public static int nFT_Get_Sfnt_Name_Count(long r5) {
            long r0 = org.lwjgl.util.freetype.FreeType.Functions.Get_Sfnt_Name_Count
            r7 = r0
            r0 = r5
            r1 = r7
            int r0 = org.lwjgl.system.JNI.invokePI(r0, r1)
            return r0
    }

    @org.lwjgl.system.NativeType("FT_UInt")
    public static int FT_Get_Sfnt_Name_Count(org.lwjgl.util.freetype.FT_Face r3) {
            r0 = r3
            long r0 = r0.address()
            int r0 = nFT_Get_Sfnt_Name_Count(r0)
            return r0
    }

    public static int nFT_Get_Sfnt_Name(long r8, int r10, long r11) {
            long r0 = org.lwjgl.util.freetype.FreeType.Functions.Get_Sfnt_Name
            r13 = r0
            r0 = r8
            r1 = r10
            r2 = r11
            r3 = r13
            int r0 = org.lwjgl.system.JNI.invokePPI(r0, r1, r2, r3)
            return r0
    }

    @org.lwjgl.system.NativeType("FT_Error")
    public static int FT_Get_Sfnt_Name(org.lwjgl.util.freetype.FT_Face r6, @org.lwjgl.system.NativeType("FT_UInt") int r7, @org.lwjgl.system.NativeType("FT_SfntName *") org.lwjgl.util.freetype.FT_SfntName r8) {
            r0 = r6
            long r0 = r0.address()
            r1 = r7
            r2 = r8
            long r2 = r2.address()
            int r0 = nFT_Get_Sfnt_Name(r0, r1, r2)
            return r0
    }

    public static int nFT_Get_Sfnt_LangTag(long r8, int r10, long r11) {
            long r0 = org.lwjgl.util.freetype.FreeType.Functions.Get_Sfnt_LangTag
            r13 = r0
            r0 = r8
            r1 = r10
            r2 = r11
            r3 = r13
            int r0 = org.lwjgl.system.JNI.invokePPI(r0, r1, r2, r3)
            return r0
    }

    @org.lwjgl.system.NativeType("FT_Error")
    public static int FT_Get_Sfnt_LangTag(org.lwjgl.util.freetype.FT_Face r6, @org.lwjgl.system.NativeType("FT_UInt") int r7, @org.lwjgl.system.NativeType("FT_SfntLangTag *") org.lwjgl.util.freetype.FT_SfntLangTag r8) {
            r0 = r6
            long r0 = r0.address()
            r1 = r7
            r2 = r8
            long r2 = r2.address()
            int r0 = nFT_Get_Sfnt_LangTag(r0, r1, r2)
            return r0
    }

    public static int nFT_Outline_GetInsideBorder(long r5) {
            long r0 = org.lwjgl.util.freetype.FreeType.Functions.Outline_GetInsideBorder
            r7 = r0
            r0 = r5
            r1 = r7
            int r0 = org.lwjgl.system.JNI.invokePI(r0, r1)
            return r0
    }

    @org.lwjgl.system.NativeType("FT_StrokerBorder")
    public static int FT_Outline_GetInsideBorder(@org.lwjgl.system.NativeType("FT_Outline *") org.lwjgl.util.freetype.FT_Outline r3) {
            r0 = r3
            long r0 = r0.address()
            int r0 = nFT_Outline_GetInsideBorder(r0)
            return r0
    }

    public static int nFT_Outline_GetOutsideBorder(long r5) {
            long r0 = org.lwjgl.util.freetype.FreeType.Functions.Outline_GetOutsideBorder
            r7 = r0
            r0 = r5
            r1 = r7
            int r0 = org.lwjgl.system.JNI.invokePI(r0, r1)
            return r0
    }

    @org.lwjgl.system.NativeType("FT_StrokerBorder")
    public static int FT_Outline_GetOutsideBorder(@org.lwjgl.system.NativeType("FT_Outline *") org.lwjgl.util.freetype.FT_Outline r3) {
            r0 = r3
            long r0 = r0.address()
            int r0 = nFT_Outline_GetOutsideBorder(r0)
            return r0
    }

    public static int nFT_Stroker_New(long r7, long r9) {
            long r0 = org.lwjgl.util.freetype.FreeType.Functions.Stroker_New
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

    @org.lwjgl.system.NativeType("FT_Error")
    public static int FT_Stroker_New(@org.lwjgl.system.NativeType("FT_Library") long r5, @org.lwjgl.system.NativeType("FT_Stroker *") org.lwjgl.PointerBuffer r7) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r7
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
        Lb:
            r0 = r5
            r1 = r7
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            int r0 = nFT_Stroker_New(r0, r1)
            return r0
    }

    public static void FT_Stroker_Set(@org.lwjgl.system.NativeType("FT_Stroker") long r11, @org.lwjgl.system.NativeType("FT_Fixed") long r13, @org.lwjgl.system.NativeType("FT_Stroker_LineCap") int r15, @org.lwjgl.system.NativeType("FT_Stroker_LineJoin") int r16, @org.lwjgl.system.NativeType("FT_Fixed") long r17) {
            long r0 = org.lwjgl.util.freetype.FreeType.Functions.Stroker_Set
            r19 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L10
            r0 = r11
            long r0 = org.lwjgl.system.Checks.check(r0)
        L10:
            r0 = r11
            r1 = r13
            r2 = r15
            r3 = r16
            r4 = r17
            r5 = r19
            org.lwjgl.system.JNI.invokePNNV(r0, r1, r2, r3, r4, r5)
            return
    }

    public static void FT_Stroker_Rewind(@org.lwjgl.system.NativeType("FT_Stroker") long r5) {
            long r0 = org.lwjgl.util.freetype.FreeType.Functions.Stroker_Rewind
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

    public static int nFT_Stroker_ParseOutline(long r8, long r10, boolean r12) {
            long r0 = org.lwjgl.util.freetype.FreeType.Functions.Stroker_ParseOutline
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

    @org.lwjgl.system.NativeType("FT_Error")
    public static int FT_Stroker_ParseOutline(@org.lwjgl.system.NativeType("FT_Stroker") long r6, @org.lwjgl.system.NativeType("FT_Outline *") org.lwjgl.util.freetype.FT_Outline r8, @org.lwjgl.system.NativeType("FT_Bool") boolean r9) {
            r0 = r6
            r1 = r8
            long r1 = r1.address()
            r2 = r9
            int r0 = nFT_Stroker_ParseOutline(r0, r1, r2)
            return r0
    }

    public static int nFT_Stroker_BeginSubPath(long r8, long r10, boolean r12) {
            long r0 = org.lwjgl.util.freetype.FreeType.Functions.Stroker_BeginSubPath
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

    @org.lwjgl.system.NativeType("FT_Error")
    public static int FT_Stroker_BeginSubPath(@org.lwjgl.system.NativeType("FT_Stroker") long r6, @org.lwjgl.system.NativeType("FT_Vector *") org.lwjgl.util.freetype.FT_Vector r8, @org.lwjgl.system.NativeType("FT_Bool") boolean r9) {
            r0 = r6
            r1 = r8
            long r1 = r1.address()
            r2 = r9
            int r0 = nFT_Stroker_BeginSubPath(r0, r1, r2)
            return r0
    }

    @org.lwjgl.system.NativeType("FT_Error")
    public static int FT_Stroker_EndSubPath(@org.lwjgl.system.NativeType("FT_Stroker") long r5) {
            long r0 = org.lwjgl.util.freetype.FreeType.Functions.Stroker_EndSubPath
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

    public static int nFT_Stroker_LineTo(long r7, long r9) {
            long r0 = org.lwjgl.util.freetype.FreeType.Functions.Stroker_LineTo
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

    @org.lwjgl.system.NativeType("FT_Error")
    public static int FT_Stroker_LineTo(@org.lwjgl.system.NativeType("FT_Stroker") long r5, @org.lwjgl.system.NativeType("FT_Vector *") org.lwjgl.util.freetype.FT_Vector r7) {
            r0 = r5
            r1 = r7
            long r1 = r1.address()
            int r0 = nFT_Stroker_LineTo(r0, r1)
            return r0
    }

    public static int nFT_Stroker_ConicTo(long r9, long r11, long r13) {
            long r0 = org.lwjgl.util.freetype.FreeType.Functions.Stroker_ConicTo
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

    @org.lwjgl.system.NativeType("FT_Error")
    public static int FT_Stroker_ConicTo(@org.lwjgl.system.NativeType("FT_Stroker") long r7, @org.lwjgl.system.NativeType("FT_Vector *") org.lwjgl.util.freetype.FT_Vector r9, @org.lwjgl.system.NativeType("FT_Vector *") org.lwjgl.util.freetype.FT_Vector r10) {
            r0 = r7
            r1 = r9
            long r1 = r1.address()
            r2 = r10
            long r2 = r2.address()
            int r0 = nFT_Stroker_ConicTo(r0, r1, r2)
            return r0
    }

    public static int nFT_Stroker_CubicTo(long r11, long r13, long r15, long r17) {
            long r0 = org.lwjgl.util.freetype.FreeType.Functions.Stroker_CubicTo
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

    @org.lwjgl.system.NativeType("FT_Error")
    public static int FT_Stroker_CubicTo(@org.lwjgl.system.NativeType("FT_Stroker") long r9, @org.lwjgl.system.NativeType("FT_Vector *") org.lwjgl.util.freetype.FT_Vector r11, @org.lwjgl.system.NativeType("FT_Vector *") org.lwjgl.util.freetype.FT_Vector r12, @org.lwjgl.system.NativeType("FT_Vector *") org.lwjgl.util.freetype.FT_Vector r13) {
            r0 = r9
            r1 = r11
            long r1 = r1.address()
            r2 = r12
            long r2 = r2.address()
            r3 = r13
            long r3 = r3.address()
            int r0 = nFT_Stroker_CubicTo(r0, r1, r2, r3)
            return r0
    }

    public static int nFT_Stroker_GetBorderCounts(long r10, int r12, long r13, long r15) {
            long r0 = org.lwjgl.util.freetype.FreeType.Functions.Stroker_GetBorderCounts
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

    @org.lwjgl.system.NativeType("FT_Error")
    public static int FT_Stroker_GetBorderCounts(@org.lwjgl.system.NativeType("FT_Stroker") long r8, @org.lwjgl.system.NativeType("FT_StrokerBorder") int r10, @org.lwjgl.system.NativeType("FT_UInt *") java.nio.IntBuffer r11, @org.lwjgl.system.NativeType("FT_UInt *") java.nio.IntBuffer r12) {
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
            int r0 = nFT_Stroker_GetBorderCounts(r0, r1, r2, r3)
            return r0
    }

    public static void nFT_Stroker_ExportBorder(long r8, int r10, long r11) {
            long r0 = org.lwjgl.util.freetype.FreeType.Functions.Stroker_ExportBorder
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

    public static void FT_Stroker_ExportBorder(@org.lwjgl.system.NativeType("FT_Stroker") long r6, @org.lwjgl.system.NativeType("FT_StrokerBorder") int r8, @org.lwjgl.system.NativeType("FT_Outline *") org.lwjgl.util.freetype.FT_Outline r9) {
            r0 = r6
            r1 = r8
            r2 = r9
            long r2 = r2.address()
            nFT_Stroker_ExportBorder(r0, r1, r2)
            return
    }

    public static int nFT_Stroker_GetCounts(long r9, long r11, long r13) {
            long r0 = org.lwjgl.util.freetype.FreeType.Functions.Stroker_GetCounts
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

    @org.lwjgl.system.NativeType("FT_Error")
    public static int FT_Stroker_GetCounts(@org.lwjgl.system.NativeType("FT_Stroker") long r7, @org.lwjgl.system.NativeType("FT_UInt *") java.nio.IntBuffer r9, @org.lwjgl.system.NativeType("FT_UInt *") java.nio.IntBuffer r10) {
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
            int r0 = nFT_Stroker_GetCounts(r0, r1, r2)
            return r0
    }

    public static void nFT_Stroker_Export(long r7, long r9) {
            long r0 = org.lwjgl.util.freetype.FreeType.Functions.Stroker_Export
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

    public static void FT_Stroker_Export(@org.lwjgl.system.NativeType("FT_Stroker") long r5, @org.lwjgl.system.NativeType("FT_Outline *") org.lwjgl.util.freetype.FT_Outline r7) {
            r0 = r5
            r1 = r7
            long r1 = r1.address()
            nFT_Stroker_Export(r0, r1)
            return
    }

    public static void FT_Stroker_Done(@org.lwjgl.system.NativeType("FT_Stroker") long r5) {
            long r0 = org.lwjgl.util.freetype.FreeType.Functions.Stroker_Done
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

    public static int nFT_Glyph_Stroke(long r8, long r10, boolean r12) {
            long r0 = org.lwjgl.util.freetype.FreeType.Functions.Glyph_Stroke
            r13 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L10
            r0 = r10
            long r0 = org.lwjgl.system.Checks.check(r0)
        L10:
            r0 = r8
            r1 = r10
            r2 = r12
            r3 = r13
            int r0 = org.lwjgl.system.JNI.invokePPI(r0, r1, r2, r3)
            return r0
    }

    @org.lwjgl.system.NativeType("FT_Error")
    public static int FT_Glyph_Stroke(@org.lwjgl.system.NativeType("FT_Glyph *") org.lwjgl.PointerBuffer r6, @org.lwjgl.system.NativeType("FT_Stroker") long r7, @org.lwjgl.system.NativeType("FT_Bool") boolean r9) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r6
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
        Lb:
            r0 = r6
            long r0 = org.lwjgl.system.MemoryUtil.memAddress(r0)
            r1 = r7
            r2 = r9
            int r0 = nFT_Glyph_Stroke(r0, r1, r2)
            return r0
    }

    public static int nFT_Glyph_StrokeBorder(long r9, long r11, boolean r13, boolean r14) {
            long r0 = org.lwjgl.util.freetype.FreeType.Functions.Glyph_StrokeBorder
            r15 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L10
            r0 = r11
            long r0 = org.lwjgl.system.Checks.check(r0)
        L10:
            r0 = r9
            r1 = r11
            r2 = r13
            r3 = r14
            r4 = r15
            int r0 = org.lwjgl.system.JNI.invokePPI(r0, r1, r2, r3, r4)
            return r0
    }

    @org.lwjgl.system.NativeType("FT_Error")
    public static int FT_Glyph_StrokeBorder(@org.lwjgl.system.NativeType("FT_Glyph *") org.lwjgl.PointerBuffer r7, @org.lwjgl.system.NativeType("FT_Stroker") long r8, @org.lwjgl.system.NativeType("FT_Bool") boolean r10, @org.lwjgl.system.NativeType("FT_Bool") boolean r11) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r7
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
        Lb:
            r0 = r7
            long r0 = org.lwjgl.system.MemoryUtil.memAddress(r0)
            r1 = r8
            r2 = r10
            r3 = r11
            int r0 = nFT_Glyph_StrokeBorder(r0, r1, r2, r3)
            return r0
    }

    public static void nFT_GlyphSlot_Embolden(long r5) {
            long r0 = org.lwjgl.util.freetype.FreeType.Functions.GlyphSlot_Embolden
            r7 = r0
            r0 = r5
            r1 = r7
            org.lwjgl.system.JNI.invokePV(r0, r1)
            return
    }

    public static void FT_GlyphSlot_Embolden(org.lwjgl.util.freetype.FT_GlyphSlot r3) {
            r0 = r3
            long r0 = r0.address()
            nFT_GlyphSlot_Embolden(r0)
            return
    }

    public static void nFT_GlyphSlot_AdjustWeight(long r9, long r11, long r13) {
            long r0 = org.lwjgl.util.freetype.FreeType.Functions.GlyphSlot_AdjustWeight
            r15 = r0
            r0 = r9
            r1 = r11
            r2 = r13
            r3 = r15
            org.lwjgl.system.JNI.invokePNNV(r0, r1, r2, r3)
            return
    }

    public static void FT_GlyphSlot_AdjustWeight(org.lwjgl.util.freetype.FT_GlyphSlot r7, @org.lwjgl.system.NativeType("FT_Fixed") long r8, @org.lwjgl.system.NativeType("FT_Fixed") long r10) {
            r0 = r7
            long r0 = r0.address()
            r1 = r8
            r2 = r10
            nFT_GlyphSlot_AdjustWeight(r0, r1, r2)
            return
    }

    public static void nFT_GlyphSlot_Oblique(long r5) {
            long r0 = org.lwjgl.util.freetype.FreeType.Functions.GlyphSlot_Oblique
            r7 = r0
            r0 = r5
            r1 = r7
            org.lwjgl.system.JNI.invokePV(r0, r1)
            return
    }

    public static void FT_GlyphSlot_Oblique(org.lwjgl.util.freetype.FT_GlyphSlot r3) {
            r0 = r3
            long r0 = r0.address()
            nFT_GlyphSlot_Oblique(r0)
            return
    }

    public static void nFT_GlyphSlot_Slant(long r9, long r11, long r13) {
            long r0 = org.lwjgl.util.freetype.FreeType.Functions.GlyphSlot_Slant
            r15 = r0
            r0 = r9
            r1 = r11
            r2 = r13
            r3 = r15
            org.lwjgl.system.JNI.invokePNNV(r0, r1, r2, r3)
            return
    }

    public static void FT_GlyphSlot_Slant(org.lwjgl.util.freetype.FT_GlyphSlot r7, @org.lwjgl.system.NativeType("FT_Fixed") long r8, @org.lwjgl.system.NativeType("FT_Fixed") long r10) {
            r0 = r7
            long r0 = r0.address()
            r1 = r8
            r2 = r10
            nFT_GlyphSlot_Slant(r0, r1, r2)
            return
    }

    @org.lwjgl.system.NativeType("FT_Fixed")
    public static long FT_Sin(@org.lwjgl.system.NativeType("FT_Angle") long r5) {
            long r0 = org.lwjgl.util.freetype.FreeType.Functions.Sin
            r7 = r0
            r0 = r5
            r1 = r7
            long r0 = org.lwjgl.system.JNI.invokeNN(r0, r1)
            return r0
    }

    @org.lwjgl.system.NativeType("FT_Fixed")
    public static long FT_Cos(@org.lwjgl.system.NativeType("FT_Angle") long r5) {
            long r0 = org.lwjgl.util.freetype.FreeType.Functions.Cos
            r7 = r0
            r0 = r5
            r1 = r7
            long r0 = org.lwjgl.system.JNI.invokeNN(r0, r1)
            return r0
    }

    @org.lwjgl.system.NativeType("FT_Fixed")
    public static long FT_Tan(@org.lwjgl.system.NativeType("FT_Angle") long r5) {
            long r0 = org.lwjgl.util.freetype.FreeType.Functions.Tan
            r7 = r0
            r0 = r5
            r1 = r7
            long r0 = org.lwjgl.system.JNI.invokeNN(r0, r1)
            return r0
    }

    @org.lwjgl.system.NativeType("FT_Angle")
    public static long FT_Atan2(@org.lwjgl.system.NativeType("FT_Fixed") long r7, @org.lwjgl.system.NativeType("FT_Fixed") long r9) {
            long r0 = org.lwjgl.util.freetype.FreeType.Functions.Atan2
            r11 = r0
            r0 = r7
            r1 = r9
            r2 = r11
            long r0 = org.lwjgl.system.JNI.invokeNNN(r0, r1, r2)
            return r0
    }

    @org.lwjgl.system.NativeType("FT_Angle")
    public static long FT_Angle_Diff(@org.lwjgl.system.NativeType("FT_Angle") long r7, @org.lwjgl.system.NativeType("FT_Angle") long r9) {
            long r0 = org.lwjgl.util.freetype.FreeType.Functions.Angle_Diff
            r11 = r0
            r0 = r7
            r1 = r9
            r2 = r11
            long r0 = org.lwjgl.system.JNI.invokeNNN(r0, r1, r2)
            return r0
    }

    public static void nFT_Vector_Unit(long r7, long r9) {
            long r0 = org.lwjgl.util.freetype.FreeType.Functions.Vector_Unit
            r11 = r0
            r0 = r7
            r1 = r9
            r2 = r11
            org.lwjgl.system.JNI.invokePNV(r0, r1, r2)
            return
    }

    public static void FT_Vector_Unit(@org.lwjgl.system.NativeType("FT_Vector *") org.lwjgl.util.freetype.FT_Vector r5, @org.lwjgl.system.NativeType("FT_Angle") long r6) {
            r0 = r5
            long r0 = r0.address()
            r1 = r6
            nFT_Vector_Unit(r0, r1)
            return
    }

    public static void nFT_Vector_Rotate(long r7, long r9) {
            long r0 = org.lwjgl.util.freetype.FreeType.Functions.Vector_Rotate
            r11 = r0
            r0 = r7
            r1 = r9
            r2 = r11
            org.lwjgl.system.JNI.invokePNV(r0, r1, r2)
            return
    }

    public static void FT_Vector_Rotate(@org.lwjgl.system.NativeType("FT_Vector *") org.lwjgl.util.freetype.FT_Vector r5, @org.lwjgl.system.NativeType("FT_Angle") long r6) {
            r0 = r5
            long r0 = r0.address()
            r1 = r6
            nFT_Vector_Rotate(r0, r1)
            return
    }

    public static long nFT_Vector_Length(long r5) {
            long r0 = org.lwjgl.util.freetype.FreeType.Functions.Vector_Length
            r7 = r0
            r0 = r5
            r1 = r7
            long r0 = org.lwjgl.system.JNI.invokePN(r0, r1)
            return r0
    }

    @org.lwjgl.system.NativeType("FT_Fixed")
    public static long FT_Vector_Length(@org.lwjgl.system.NativeType("FT_Vector *") org.lwjgl.util.freetype.FT_Vector r3) {
            r0 = r3
            long r0 = r0.address()
            long r0 = nFT_Vector_Length(r0)
            return r0
    }

    public static void nFT_Vector_Polarize(long r9, long r11, long r13) {
            long r0 = org.lwjgl.util.freetype.FreeType.Functions.Vector_Polarize
            r15 = r0
            r0 = r9
            r1 = r11
            r2 = r13
            r3 = r15
            org.lwjgl.system.JNI.invokePPPV(r0, r1, r2, r3)
            return
    }

    public static void FT_Vector_Polarize(@org.lwjgl.system.NativeType("FT_Vector *") org.lwjgl.util.freetype.FT_Vector r7, @org.lwjgl.system.NativeType("FT_Fixed *") org.lwjgl.CLongBuffer r8, @org.lwjgl.system.NativeType("FT_Angle *") org.lwjgl.CLongBuffer r9) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L10
            r0 = r8
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
            r0 = r9
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
        L10:
            r0 = r7
            long r0 = r0.address()
            r1 = r8
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            r2 = r9
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            nFT_Vector_Polarize(r0, r1, r2)
            return
    }

    public static void nFT_Vector_From_Polar(long r9, long r11, long r13) {
            long r0 = org.lwjgl.util.freetype.FreeType.Functions.Vector_From_Polar
            r15 = r0
            r0 = r9
            r1 = r11
            r2 = r13
            r3 = r15
            org.lwjgl.system.JNI.invokePNNV(r0, r1, r2, r3)
            return
    }

    public static void FT_Vector_From_Polar(@org.lwjgl.system.NativeType("FT_Vector *") org.lwjgl.util.freetype.FT_Vector r7, @org.lwjgl.system.NativeType("FT_Fixed") long r8, @org.lwjgl.system.NativeType("FT_Angle") long r10) {
            r0 = r7
            long r0 = r0.address()
            r1 = r8
            r2 = r10
            nFT_Vector_From_Polar(r0, r1, r2)
            return
    }

    public static int nFT_Has_PS_Glyph_Names(long r5) {
            long r0 = org.lwjgl.util.freetype.FreeType.Functions.Has_PS_Glyph_Names
            r7 = r0
            r0 = r5
            r1 = r7
            int r0 = org.lwjgl.system.JNI.invokePI(r0, r1)
            return r0
    }

    @org.lwjgl.system.NativeType("FT_Int")
    public static int FT_Has_PS_Glyph_Names(org.lwjgl.util.freetype.FT_Face r3) {
            r0 = r3
            long r0 = r0.address()
            int r0 = nFT_Has_PS_Glyph_Names(r0)
            return r0
    }

    public static int nFT_Get_PS_Font_Info(long r7, long r9) {
            long r0 = org.lwjgl.util.freetype.FreeType.Functions.Get_PS_Font_Info
            r11 = r0
            r0 = r7
            r1 = r9
            r2 = r11
            int r0 = org.lwjgl.system.JNI.invokePPI(r0, r1, r2)
            return r0
    }

    @org.lwjgl.system.NativeType("FT_Error")
    public static int FT_Get_PS_Font_Info(org.lwjgl.util.freetype.FT_Face r5, org.lwjgl.util.freetype.PS_FontInfo r6) {
            r0 = r5
            long r0 = r0.address()
            r1 = r6
            long r1 = r1.address()
            int r0 = nFT_Get_PS_Font_Info(r0, r1)
            return r0
    }

    public static int nFT_Get_PS_Font_Private(long r7, long r9) {
            long r0 = org.lwjgl.util.freetype.FreeType.Functions.Get_PS_Font_Private
            r11 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L10
            r0 = r9
            long r0 = org.lwjgl.system.Checks.check(r0)
        L10:
            r0 = r7
            r1 = r9
            r2 = r11
            int r0 = org.lwjgl.system.JNI.invokePPI(r0, r1, r2)
            return r0
    }

    @org.lwjgl.system.NativeType("FT_Error")
    public static int FT_Get_PS_Font_Private(org.lwjgl.util.freetype.FT_Face r5, @org.lwjgl.system.NativeType("PS_Private") long r6) {
            r0 = r5
            long r0 = r0.address()
            r1 = r6
            int r0 = nFT_Get_PS_Font_Private(r0, r1)
            return r0
    }

    public static long nFT_Get_PS_Font_Value(long r11, int r13, int r14, long r15, long r17) {
            long r0 = org.lwjgl.util.freetype.FreeType.Functions.Get_PS_Font_Value
            r19 = r0
            r0 = r11
            r1 = r13
            r2 = r14
            r3 = r15
            r4 = r17
            r5 = r19
            long r0 = org.lwjgl.system.JNI.invokePPNN(r0, r1, r2, r3, r4, r5)
            return r0
    }

    @org.lwjgl.system.NativeType("FT_Long")
    public static long FT_Get_PS_Font_Value(org.lwjgl.util.freetype.FT_Face r9, @org.lwjgl.system.NativeType("PS_Dict_Keys") int r10, @org.lwjgl.system.NativeType("FT_UInt") int r11, @javax.annotation.Nullable @org.lwjgl.system.NativeType("void *") java.nio.ByteBuffer r12) {
            r0 = r9
            long r0 = r0.address()
            r1 = r10
            r2 = r11
            r3 = r12
            long r3 = org.lwjgl.system.MemoryUtil.memAddressSafe(r3)
            r4 = r12
            int r4 = org.lwjgl.system.Checks.remainingSafe(r4)
            long r4 = (long) r4
            long r0 = nFT_Get_PS_Font_Value(r0, r1, r2, r3, r4)
            return r0
    }

    public static long nFT_Get_Sfnt_Table(long r6, int r8) {
            long r0 = org.lwjgl.util.freetype.FreeType.Functions.Get_Sfnt_Table
            r9 = r0
            r0 = r6
            r1 = r8
            r2 = r9
            long r0 = org.lwjgl.system.JNI.invokePP(r0, r1, r2)
            return r0
    }

    @org.lwjgl.system.NativeType("void *")
    public static long FT_Get_Sfnt_Table(org.lwjgl.util.freetype.FT_Face r4, @org.lwjgl.system.NativeType("FT_Sfnt_Tag") int r5) {
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            long r0 = nFT_Get_Sfnt_Table(r0, r1)
            return r0
    }

    public static int nFT_Load_Sfnt_Table(long r13, long r15, long r17, long r19, long r21) {
            long r0 = org.lwjgl.util.freetype.FreeType.Functions.Load_Sfnt_Table
            r23 = r0
            r0 = r13
            r1 = r15
            r2 = r17
            r3 = r19
            r4 = r21
            r5 = r23
            int r0 = org.lwjgl.system.JNI.invokePNNPPI(r0, r1, r2, r3, r4, r5)
            return r0
    }

    @org.lwjgl.system.NativeType("FT_Error")
    public static int FT_Load_Sfnt_Table(org.lwjgl.util.freetype.FT_Face r11, @org.lwjgl.system.NativeType("FT_ULong") long r12, @org.lwjgl.system.NativeType("FT_Long") long r14, @javax.annotation.Nullable @org.lwjgl.system.NativeType("FT_Byte *") java.nio.ByteBuffer r16, @javax.annotation.Nullable @org.lwjgl.system.NativeType("FT_ULong *") org.lwjgl.CLongBuffer r17) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lc
            r0 = r17
            r1 = 1
            org.lwjgl.system.Checks.checkSafe(r0, r1)
        Lc:
            r0 = r11
            long r0 = r0.address()
            r1 = r12
            r2 = r14
            r3 = r16
            long r3 = org.lwjgl.system.MemoryUtil.memAddressSafe(r3)
            r4 = r17
            long r4 = org.lwjgl.system.MemoryUtil.memAddressSafe(r4)
            int r0 = nFT_Load_Sfnt_Table(r0, r1, r2, r3, r4)
            return r0
    }

    public static int nFT_Sfnt_Table_Info(long r10, int r12, long r13, long r15) {
            long r0 = org.lwjgl.util.freetype.FreeType.Functions.Sfnt_Table_Info
            r17 = r0
            r0 = r10
            r1 = r12
            r2 = r13
            r3 = r15
            r4 = r17
            int r0 = org.lwjgl.system.JNI.invokePPPI(r0, r1, r2, r3, r4)
            return r0
    }

    @org.lwjgl.system.NativeType("FT_Error")
    public static int FT_Sfnt_Table_Info(org.lwjgl.util.freetype.FT_Face r8, @org.lwjgl.system.NativeType("FT_UInt") int r9, @javax.annotation.Nullable @org.lwjgl.system.NativeType("FT_ULong *") org.lwjgl.CLongBuffer r10, @javax.annotation.Nullable @org.lwjgl.system.NativeType("FT_ULong *") org.lwjgl.CLongBuffer r11) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r11
            r1 = 1
            org.lwjgl.system.Checks.checkSafe(r0, r1)
        Lb:
            r0 = r8
            long r0 = r0.address()
            r1 = r9
            r2 = r10
            long r2 = org.lwjgl.system.MemoryUtil.memAddressSafe(r2)
            r3 = r11
            long r3 = org.lwjgl.system.MemoryUtil.memAddressSafe(r3)
            int r0 = nFT_Sfnt_Table_Info(r0, r1, r2, r3)
            return r0
    }

    public static long nFT_Get_CMap_Language_ID(long r5) {
            long r0 = org.lwjgl.util.freetype.FreeType.Functions.Get_CMap_Language_ID
            r7 = r0
            r0 = r5
            r1 = r7
            long r0 = org.lwjgl.system.JNI.invokePN(r0, r1)
            return r0
    }

    @org.lwjgl.system.NativeType("FT_ULong")
    public static long FT_Get_CMap_Language_ID(org.lwjgl.util.freetype.FT_CharMap r3) {
            r0 = r3
            long r0 = r0.address()
            long r0 = nFT_Get_CMap_Language_ID(r0)
            return r0
    }

    public static long nFT_Get_CMap_Format(long r5) {
            long r0 = org.lwjgl.util.freetype.FreeType.Functions.Get_CMap_Format
            r7 = r0
            r0 = r5
            r1 = r7
            long r0 = org.lwjgl.system.JNI.invokePN(r0, r1)
            return r0
    }

    @org.lwjgl.system.NativeType("FT_Long")
    public static long FT_Get_CMap_Format(org.lwjgl.util.freetype.FT_CharMap r3) {
            r0 = r3
            long r0 = r0.address()
            long r0 = nFT_Get_CMap_Format(r0)
            return r0
    }

    public static int FT_ENC_TAG(int r4, int r5, int r6, int r7) {
            r0 = r4
            r1 = 255(0xff, float:3.57E-43)
            r0 = r0 & r1
            r1 = 24
            int r0 = r0 << r1
            r1 = r5
            r2 = 255(0xff, float:3.57E-43)
            r1 = r1 & r2
            r2 = 16
            int r1 = r1 << r2
            r0 = r0 | r1
            r1 = r6
            r2 = 255(0xff, float:3.57E-43)
            r1 = r1 & r2
            r2 = 8
            int r1 = r1 << r2
            r0 = r0 | r1
            r1 = r7
            r2 = 255(0xff, float:3.57E-43)
            r1 = r1 & r2
            r0 = r0 | r1
            return r0
    }

    public static boolean FT_HAS_HORIZONTAL(org.lwjgl.util.freetype.FT_Face r5) {
            r0 = r5
            long r0 = r0.face_flags()
            r1 = 16
            long r0 = r0 & r1
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto L11
            r0 = 1
            goto L12
        L11:
            r0 = 0
        L12:
            return r0
    }

    public static boolean FT_HAS_VERTICAL(org.lwjgl.util.freetype.FT_Face r5) {
            r0 = r5
            long r0 = r0.face_flags()
            r1 = 32
            long r0 = r0 & r1
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto L11
            r0 = 1
            goto L12
        L11:
            r0 = 0
        L12:
            return r0
    }

    public static boolean FT_HAS_KERNING(org.lwjgl.util.freetype.FT_Face r5) {
            r0 = r5
            long r0 = r0.face_flags()
            r1 = 64
            long r0 = r0 & r1
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto L11
            r0 = 1
            goto L12
        L11:
            r0 = 0
        L12:
            return r0
    }

    public static boolean FT_IS_SCALABLE(org.lwjgl.util.freetype.FT_Face r5) {
            r0 = r5
            long r0 = r0.face_flags()
            r1 = 1
            long r0 = r0 & r1
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto Lf
            r0 = 1
            goto L10
        Lf:
            r0 = 0
        L10:
            return r0
    }

    public static boolean FT_IS_SFNT(org.lwjgl.util.freetype.FT_Face r5) {
            r0 = r5
            long r0 = r0.face_flags()
            r1 = 8
            long r0 = r0 & r1
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto L11
            r0 = 1
            goto L12
        L11:
            r0 = 0
        L12:
            return r0
    }

    public static boolean FT_IS_FIXED_WIDTH(org.lwjgl.util.freetype.FT_Face r5) {
            r0 = r5
            long r0 = r0.face_flags()
            r1 = 4
            long r0 = r0 & r1
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto L11
            r0 = 1
            goto L12
        L11:
            r0 = 0
        L12:
            return r0
    }

    public static boolean FT_HAS_FIXED_SIZES(org.lwjgl.util.freetype.FT_Face r5) {
            r0 = r5
            long r0 = r0.face_flags()
            r1 = 2
            long r0 = r0 & r1
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto L11
            r0 = 1
            goto L12
        L11:
            r0 = 0
        L12:
            return r0
    }

    public static boolean FT_HAS_GLYPH_NAMES(org.lwjgl.util.freetype.FT_Face r5) {
            r0 = r5
            long r0 = r0.face_flags()
            r1 = 512(0x200, double:2.53E-321)
            long r0 = r0 & r1
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto L11
            r0 = 1
            goto L12
        L11:
            r0 = 0
        L12:
            return r0
    }

    public static boolean FT_HAS_MULTIPLE_MASTERS(org.lwjgl.util.freetype.FT_Face r5) {
            r0 = r5
            long r0 = r0.face_flags()
            r1 = 256(0x100, double:1.265E-321)
            long r0 = r0 & r1
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto L11
            r0 = 1
            goto L12
        L11:
            r0 = 0
        L12:
            return r0
    }

    public static boolean FT_IS_NAMED_INSTANCE(org.lwjgl.util.freetype.FT_Face r5) {
            r0 = r5
            long r0 = r0.face_index()
            r1 = 2147418112(0x7fff0000, double:1.0609655164E-314)
            long r0 = r0 & r1
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto L11
            r0 = 1
            goto L12
        L11:
            r0 = 0
        L12:
            return r0
    }

    public static boolean FT_IS_VARIATION(org.lwjgl.util.freetype.FT_Face r5) {
            r0 = r5
            long r0 = r0.face_flags()
            r1 = 32768(0x8000, double:1.61895E-319)
            long r0 = r0 & r1
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto L11
            r0 = 1
            goto L12
        L11:
            r0 = 0
        L12:
            return r0
    }

    public static boolean FT_IS_CID_KEYED(org.lwjgl.util.freetype.FT_Face r5) {
            r0 = r5
            long r0 = r0.face_flags()
            r1 = 4096(0x1000, double:2.0237E-320)
            long r0 = r0 & r1
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto L11
            r0 = 1
            goto L12
        L11:
            r0 = 0
        L12:
            return r0
    }

    public static boolean FT_IS_TRICKY(org.lwjgl.util.freetype.FT_Face r5) {
            r0 = r5
            long r0 = r0.face_flags()
            r1 = 8192(0x2000, double:4.0474E-320)
            long r0 = r0 & r1
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto L11
            r0 = 1
            goto L12
        L11:
            r0 = 0
        L12:
            return r0
    }

    public static boolean FT_HAS_COLOR(org.lwjgl.util.freetype.FT_Face r5) {
            r0 = r5
            long r0 = r0.face_flags()
            r1 = 16384(0x4000, double:8.095E-320)
            long r0 = r0 & r1
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto L11
            r0 = 1
            goto L12
        L11:
            r0 = 0
        L12:
            return r0
    }

    public static boolean FT_HAS_SVG(org.lwjgl.util.freetype.FT_Face r5) {
            r0 = r5
            long r0 = r0.face_flags()
            r1 = 65536(0x10000, double:3.2379E-319)
            long r0 = r0 & r1
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto L11
            r0 = 1
            goto L12
        L11:
            r0 = 0
        L12:
            return r0
    }

    public static boolean FT_HAS_SBIX(org.lwjgl.util.freetype.FT_Face r5) {
            r0 = r5
            long r0 = r0.face_flags()
            r1 = 131072(0x20000, double:6.4758E-319)
            long r0 = r0 & r1
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto L11
            r0 = 1
            goto L12
        L11:
            r0 = 0
        L12:
            return r0
    }

    public static boolean FT_HAS_SBIX_OVERLAY(org.lwjgl.util.freetype.FT_Face r5) {
            r0 = r5
            long r0 = r0.face_flags()
            r1 = 262144(0x40000, double:1.295163E-318)
            long r0 = r0 & r1
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto L11
            r0 = 1
            goto L12
        L11:
            r0 = 0
        L12:
            return r0
    }

    private static int FT_LOAD_TARGET_(int r3) {
            r0 = r3
            r1 = 15
            r0 = r0 & r1
            r1 = 16
            int r0 = r0 << r1
            return r0
    }

    public static int FT_LOAD_TARGET_MODE(int r3) {
            r0 = r3
            r1 = 16
            int r0 = r0 >> r1
            r1 = 15
            r0 = r0 & r1
            return r0
    }

    public static boolean FTC_IMAGE_TYPE_COMPARE(org.lwjgl.util.freetype.FTC_ImageType r5, org.lwjgl.util.freetype.FTC_ImageType r6) {
            r0 = r5
            long r0 = r0.face_id()
            r1 = r6
            long r1 = r1.face_id()
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto L26
            r0 = r5
            int r0 = r0.width()
            r1 = r6
            int r1 = r1.width()
            if (r0 != r1) goto L26
            r0 = r5
            int r0 = r0.flags()
            r1 = r6
            int r1 = r1.flags()
            if (r0 != r1) goto L26
            r0 = 1
            goto L27
        L26:
            r0 = 0
        L27:
            return r0
    }

    public static int FT_CURVE_TAG(int r3) {
            r0 = r3
            r1 = 3
            r0 = r0 & r1
            return r0
    }

    public static int FT_IMAGE_TAG(int r4, int r5, int r6, int r7) {
            r0 = r4
            r1 = 255(0xff, float:3.57E-43)
            r0 = r0 & r1
            r1 = 24
            int r0 = r0 << r1
            r1 = r5
            r2 = 255(0xff, float:3.57E-43)
            r1 = r1 & r2
            r2 = 16
            int r1 = r1 << r2
            r0 = r0 | r1
            r1 = r6
            r2 = 255(0xff, float:3.57E-43)
            r1 = r1 & r2
            r2 = 8
            int r1 = r1 << r2
            r0 = r0 | r1
            r1 = r7
            r2 = 255(0xff, float:3.57E-43)
            r1 = r1 & r2
            r0 = r0 | r1
            return r0
    }

    public static int FT_MAKE_TAG(int r4, int r5, int r6, int r7) {
            r0 = r4
            r1 = 255(0xff, float:3.57E-43)
            r0 = r0 & r1
            r1 = 24
            int r0 = r0 << r1
            r1 = r5
            r2 = 255(0xff, float:3.57E-43)
            r1 = r1 & r2
            r2 = 16
            int r1 = r1 << r2
            r0 = r0 | r1
            r1 = r6
            r2 = 255(0xff, float:3.57E-43)
            r1 = r1 & r2
            r2 = 8
            int r1 = r1 << r2
            r0 = r0 | r1
            r1 = r7
            r2 = 255(0xff, float:3.57E-43)
            r1 = r1 & r2
            r0 = r0 | r1
            return r0
    }

    public static boolean FT_IS_EMPTY(org.lwjgl.util.freetype.FT_List r2) {
            r0 = r2
            org.lwjgl.util.freetype.FT_ListNode r0 = r0.head()
            if (r0 != 0) goto Lb
            r0 = 1
            goto Lc
        Lb:
            r0 = 0
        Lc:
            return r0
    }

    static /* synthetic */ org.lwjgl.system.SharedLibrary access$000() {
            org.lwjgl.system.SharedLibrary r0 = org.lwjgl.util.freetype.FreeType.FREETYPE
            return r0
    }

    static {
            java.lang.Class<org.lwjgl.util.freetype.FreeType> r0 = org.lwjgl.util.freetype.FreeType.class
            java.lang.String r1 = "org.lwjgl.freetype"
            org.lwjgl.system.Configuration<java.lang.String> r2 = org.lwjgl.system.Configuration.FREETYPE_LIBRARY_NAME
            java.lang.String r3 = "freetype"
            java.lang.String r3 = org.lwjgl.system.Platform.mapLibraryNameBundled(r3)
            java.lang.Object r2 = r2.get(r3)
            java.lang.String r2 = (java.lang.String) r2
            r3 = 1
            org.lwjgl.system.SharedLibrary r0 = org.lwjgl.system.Library.loadNative(r0, r1, r2, r3)
            org.lwjgl.util.freetype.FreeType.FREETYPE = r0
            r0 = 0
            r1 = 0
            r2 = 0
            r3 = 0
            int r0 = FT_ENC_TAG(r0, r1, r2, r3)
            org.lwjgl.util.freetype.FreeType.FT_ENCODING_NONE = r0
            r0 = 115(0x73, float:1.61E-43)
            r1 = 121(0x79, float:1.7E-43)
            r2 = 109(0x6d, float:1.53E-43)
            r3 = 98
            int r0 = FT_ENC_TAG(r0, r1, r2, r3)
            org.lwjgl.util.freetype.FreeType.FT_ENCODING_MS_SYMBOL = r0
            r0 = 117(0x75, float:1.64E-43)
            r1 = 110(0x6e, float:1.54E-43)
            r2 = 105(0x69, float:1.47E-43)
            r3 = 99
            int r0 = FT_ENC_TAG(r0, r1, r2, r3)
            org.lwjgl.util.freetype.FreeType.FT_ENCODING_UNICODE = r0
            r0 = 115(0x73, float:1.61E-43)
            r1 = 106(0x6a, float:1.49E-43)
            r2 = 105(0x69, float:1.47E-43)
            r3 = 115(0x73, float:1.61E-43)
            int r0 = FT_ENC_TAG(r0, r1, r2, r3)
            org.lwjgl.util.freetype.FreeType.FT_ENCODING_SJIS = r0
            r0 = 103(0x67, float:1.44E-43)
            r1 = 98
            r2 = 32
            r3 = 32
            int r0 = FT_ENC_TAG(r0, r1, r2, r3)
            org.lwjgl.util.freetype.FreeType.FT_ENCODING_PRC = r0
            r0 = 98
            r1 = 105(0x69, float:1.47E-43)
            r2 = 103(0x67, float:1.44E-43)
            r3 = 53
            int r0 = FT_ENC_TAG(r0, r1, r2, r3)
            org.lwjgl.util.freetype.FreeType.FT_ENCODING_BIG5 = r0
            r0 = 119(0x77, float:1.67E-43)
            r1 = 97
            r2 = 110(0x6e, float:1.54E-43)
            r3 = 115(0x73, float:1.61E-43)
            int r0 = FT_ENC_TAG(r0, r1, r2, r3)
            org.lwjgl.util.freetype.FreeType.FT_ENCODING_WANSUNG = r0
            r0 = 106(0x6a, float:1.49E-43)
            r1 = 111(0x6f, float:1.56E-43)
            r2 = 104(0x68, float:1.46E-43)
            r3 = 97
            int r0 = FT_ENC_TAG(r0, r1, r2, r3)
            org.lwjgl.util.freetype.FreeType.FT_ENCODING_JOHAB = r0
            int r0 = org.lwjgl.util.freetype.FreeType.FT_ENCODING_PRC
            org.lwjgl.util.freetype.FreeType.FT_ENCODING_GB2312 = r0
            int r0 = org.lwjgl.util.freetype.FreeType.FT_ENCODING_SJIS
            org.lwjgl.util.freetype.FreeType.FT_ENCODING_MS_SJIS = r0
            int r0 = org.lwjgl.util.freetype.FreeType.FT_ENCODING_PRC
            org.lwjgl.util.freetype.FreeType.FT_ENCODING_MS_GB2312 = r0
            int r0 = org.lwjgl.util.freetype.FreeType.FT_ENCODING_BIG5
            org.lwjgl.util.freetype.FreeType.FT_ENCODING_MS_BIG5 = r0
            int r0 = org.lwjgl.util.freetype.FreeType.FT_ENCODING_WANSUNG
            org.lwjgl.util.freetype.FreeType.FT_ENCODING_MS_WANSUNG = r0
            int r0 = org.lwjgl.util.freetype.FreeType.FT_ENCODING_JOHAB
            org.lwjgl.util.freetype.FreeType.FT_ENCODING_MS_JOHAB = r0
            r0 = 65
            r1 = 68
            r2 = 79
            r3 = 66
            int r0 = FT_ENC_TAG(r0, r1, r2, r3)
            org.lwjgl.util.freetype.FreeType.FT_ENCODING_ADOBE_STANDARD = r0
            r0 = 65
            r1 = 68
            r2 = 66
            r3 = 69
            int r0 = FT_ENC_TAG(r0, r1, r2, r3)
            org.lwjgl.util.freetype.FreeType.FT_ENCODING_ADOBE_EXPERT = r0
            r0 = 65
            r1 = 68
            r2 = 66
            r3 = 67
            int r0 = FT_ENC_TAG(r0, r1, r2, r3)
            org.lwjgl.util.freetype.FreeType.FT_ENCODING_ADOBE_CUSTOM = r0
            r0 = 108(0x6c, float:1.51E-43)
            r1 = 97
            r2 = 116(0x74, float:1.63E-43)
            r3 = 49
            int r0 = FT_ENC_TAG(r0, r1, r2, r3)
            org.lwjgl.util.freetype.FreeType.FT_ENCODING_ADOBE_LATIN_1 = r0
            r0 = 108(0x6c, float:1.51E-43)
            r1 = 97
            r2 = 116(0x74, float:1.63E-43)
            r3 = 50
            int r0 = FT_ENC_TAG(r0, r1, r2, r3)
            org.lwjgl.util.freetype.FreeType.FT_ENCODING_OLD_LATIN_2 = r0
            r0 = 97
            r1 = 114(0x72, float:1.6E-43)
            r2 = 109(0x6d, float:1.53E-43)
            r3 = 110(0x6e, float:1.54E-43)
            int r0 = FT_ENC_TAG(r0, r1, r2, r3)
            org.lwjgl.util.freetype.FreeType.FT_ENCODING_APPLE_ROMAN = r0
            r0 = 0
            int r0 = FT_LOAD_TARGET_(r0)
            org.lwjgl.util.freetype.FreeType.FT_FT_LOAD_TARGET_NORMAL = r0
            r0 = 1
            int r0 = FT_LOAD_TARGET_(r0)
            org.lwjgl.util.freetype.FreeType.FT_FT_LOAD_TARGET_LIGHT = r0
            r0 = 2
            int r0 = FT_LOAD_TARGET_(r0)
            org.lwjgl.util.freetype.FreeType.FT_FT_LOAD_TARGET_MONO = r0
            r0 = 3
            int r0 = FT_LOAD_TARGET_(r0)
            org.lwjgl.util.freetype.FreeType.FT_FT_LOAD_TARGET_LCD = r0
            r0 = 4
            int r0 = FT_LOAD_TARGET_(r0)
            org.lwjgl.util.freetype.FreeType.FT_FT_LOAD_TARGET_LCD_V = r0
            r0 = 0
            r1 = 0
            r2 = 0
            r3 = 0
            int r0 = FT_IMAGE_TAG(r0, r1, r2, r3)
            org.lwjgl.util.freetype.FreeType.FT_GLYPH_FORMAT_NONE = r0
            r0 = 99
            r1 = 111(0x6f, float:1.56E-43)
            r2 = 109(0x6d, float:1.53E-43)
            r3 = 112(0x70, float:1.57E-43)
            int r0 = FT_IMAGE_TAG(r0, r1, r2, r3)
            org.lwjgl.util.freetype.FreeType.FT_GLYPH_FORMAT_COMPOSITE = r0
            r0 = 98
            r1 = 105(0x69, float:1.47E-43)
            r2 = 116(0x74, float:1.63E-43)
            r3 = 115(0x73, float:1.61E-43)
            int r0 = FT_IMAGE_TAG(r0, r1, r2, r3)
            org.lwjgl.util.freetype.FreeType.FT_GLYPH_FORMAT_BITMAP = r0
            r0 = 111(0x6f, float:1.56E-43)
            r1 = 117(0x75, float:1.64E-43)
            r2 = 116(0x74, float:1.63E-43)
            r3 = 108(0x6c, float:1.51E-43)
            int r0 = FT_IMAGE_TAG(r0, r1, r2, r3)
            org.lwjgl.util.freetype.FreeType.FT_GLYPH_FORMAT_OUTLINE = r0
            r0 = 112(0x70, float:1.57E-43)
            r1 = 108(0x6c, float:1.51E-43)
            r2 = 111(0x6f, float:1.56E-43)
            r3 = 116(0x74, float:1.63E-43)
            int r0 = FT_IMAGE_TAG(r0, r1, r2, r3)
            org.lwjgl.util.freetype.FreeType.FT_GLYPH_FORMAT_PLOTTER = r0
            r0 = 83
            r1 = 86
            r2 = 71
            r3 = 32
            int r0 = FT_IMAGE_TAG(r0, r1, r2, r3)
            org.lwjgl.util.freetype.FreeType.FT_GLYPH_FORMAT_SVG = r0
            r0 = 105(0x69, float:1.47E-43)
            r1 = 103(0x67, float:1.44E-43)
            r2 = 112(0x70, float:1.57E-43)
            r3 = 102(0x66, float:1.43E-43)
            int r0 = FT_MAKE_TAG(r0, r1, r2, r3)
            org.lwjgl.util.freetype.FreeType.FT_PARAM_TAG_IGNORE_TYPOGRAPHIC_FAMILY = r0
            r0 = 105(0x69, float:1.47E-43)
            r1 = 103(0x67, float:1.44E-43)
            r2 = 112(0x70, float:1.57E-43)
            r3 = 115(0x73, float:1.61E-43)
            int r0 = FT_MAKE_TAG(r0, r1, r2, r3)
            org.lwjgl.util.freetype.FreeType.FT_PARAM_TAG_IGNORE_TYPOGRAPHIC_SUBFAMILY = r0
            r0 = 105(0x69, float:1.47E-43)
            r1 = 110(0x6e, float:1.54E-43)
            r2 = 99
            r3 = 114(0x72, float:1.6E-43)
            int r0 = FT_MAKE_TAG(r0, r1, r2, r3)
            org.lwjgl.util.freetype.FreeType.FT_PARAM_TAG_INCREMENTAL = r0
            r0 = 105(0x69, float:1.47E-43)
            r1 = 115(0x73, float:1.61E-43)
            r2 = 98
            r3 = 120(0x78, float:1.68E-43)
            int r0 = FT_MAKE_TAG(r0, r1, r2, r3)
            org.lwjgl.util.freetype.FreeType.FT_PARAM_TAG_IGNORE_SBIX = r0
            r0 = 108(0x6c, float:1.51E-43)
            r1 = 99
            r2 = 100
            r3 = 102(0x66, float:1.43E-43)
            int r0 = FT_MAKE_TAG(r0, r1, r2, r3)
            org.lwjgl.util.freetype.FreeType.FT_PARAM_TAG_LCD_FILTER_WEIGHTS = r0
            r0 = 115(0x73, float:1.61E-43)
            r1 = 101(0x65, float:1.42E-43)
            r2 = 101(0x65, float:1.42E-43)
            r3 = 100
            int r0 = FT_MAKE_TAG(r0, r1, r2, r3)
            org.lwjgl.util.freetype.FreeType.FT_PARAM_TAG_RANDOM_SEED = r0
            r0 = 100
            r1 = 97
            r2 = 114(0x72, float:1.6E-43)
            r3 = 107(0x6b, float:1.5E-43)
            int r0 = FT_MAKE_TAG(r0, r1, r2, r3)
            org.lwjgl.util.freetype.FreeType.FT_PARAM_TAG_STEM_DARKENING = r0
            r0 = 117(0x75, float:1.64E-43)
            r1 = 110(0x6e, float:1.54E-43)
            r2 = 112(0x70, float:1.57E-43)
            r3 = 97
            int r0 = FT_MAKE_TAG(r0, r1, r2, r3)
            org.lwjgl.util.freetype.FreeType.FT_PARAM_TAG_UNPATENTED_HINTING = r0
            r0 = 97
            r1 = 118(0x76, float:1.65E-43)
            r2 = 97
            r3 = 114(0x72, float:1.6E-43)
            int r0 = FT_MAKE_TAG(r0, r1, r2, r3)
            org.lwjgl.util.freetype.FreeType.TTAG_avar = r0
            r0 = 66
            r1 = 65
            r2 = 83
            r3 = 69
            int r0 = FT_MAKE_TAG(r0, r1, r2, r3)
            org.lwjgl.util.freetype.FreeType.TTAG_BASE = r0
            r0 = 98
            r1 = 100
            r2 = 97
            r3 = 116(0x74, float:1.63E-43)
            int r0 = FT_MAKE_TAG(r0, r1, r2, r3)
            org.lwjgl.util.freetype.FreeType.TTAG_bdat = r0
            r0 = 66
            r1 = 68
            r2 = 70
            r3 = 32
            int r0 = FT_MAKE_TAG(r0, r1, r2, r3)
            org.lwjgl.util.freetype.FreeType.TTAG_BDF = r0
            r0 = 98
            r1 = 104(0x68, float:1.46E-43)
            r2 = 101(0x65, float:1.42E-43)
            r3 = 100
            int r0 = FT_MAKE_TAG(r0, r1, r2, r3)
            org.lwjgl.util.freetype.FreeType.TTAG_bhed = r0
            r0 = 98
            r1 = 108(0x6c, float:1.51E-43)
            r2 = 111(0x6f, float:1.56E-43)
            r3 = 99
            int r0 = FT_MAKE_TAG(r0, r1, r2, r3)
            org.lwjgl.util.freetype.FreeType.TTAG_bloc = r0
            r0 = 98
            r1 = 115(0x73, float:1.61E-43)
            r2 = 108(0x6c, float:1.51E-43)
            r3 = 110(0x6e, float:1.54E-43)
            int r0 = FT_MAKE_TAG(r0, r1, r2, r3)
            org.lwjgl.util.freetype.FreeType.TTAG_bsln = r0
            r0 = 67
            r1 = 66
            r2 = 68
            r3 = 84
            int r0 = FT_MAKE_TAG(r0, r1, r2, r3)
            org.lwjgl.util.freetype.FreeType.TTAG_CBDT = r0
            r0 = 67
            r1 = 66
            r2 = 76
            r3 = 67
            int r0 = FT_MAKE_TAG(r0, r1, r2, r3)
            org.lwjgl.util.freetype.FreeType.TTAG_CBLC = r0
            r0 = 67
            r1 = 70
            r2 = 70
            r3 = 32
            int r0 = FT_MAKE_TAG(r0, r1, r2, r3)
            org.lwjgl.util.freetype.FreeType.TTAG_CFF = r0
            r0 = 67
            r1 = 70
            r2 = 70
            r3 = 50
            int r0 = FT_MAKE_TAG(r0, r1, r2, r3)
            org.lwjgl.util.freetype.FreeType.TTAG_CFF2 = r0
            r0 = 67
            r1 = 73
            r2 = 68
            r3 = 32
            int r0 = FT_MAKE_TAG(r0, r1, r2, r3)
            org.lwjgl.util.freetype.FreeType.TTAG_CID = r0
            r0 = 99
            r1 = 109(0x6d, float:1.53E-43)
            r2 = 97
            r3 = 112(0x70, float:1.57E-43)
            int r0 = FT_MAKE_TAG(r0, r1, r2, r3)
            org.lwjgl.util.freetype.FreeType.TTAG_cmap = r0
            r0 = 67
            r1 = 79
            r2 = 76
            r3 = 82
            int r0 = FT_MAKE_TAG(r0, r1, r2, r3)
            org.lwjgl.util.freetype.FreeType.TTAG_COLR = r0
            r0 = 67
            r1 = 80
            r2 = 65
            r3 = 76
            int r0 = FT_MAKE_TAG(r0, r1, r2, r3)
            org.lwjgl.util.freetype.FreeType.TTAG_CPAL = r0
            r0 = 99
            r1 = 118(0x76, float:1.65E-43)
            r2 = 97
            r3 = 114(0x72, float:1.6E-43)
            int r0 = FT_MAKE_TAG(r0, r1, r2, r3)
            org.lwjgl.util.freetype.FreeType.TTAG_cvar = r0
            r0 = 99
            r1 = 118(0x76, float:1.65E-43)
            r2 = 116(0x74, float:1.63E-43)
            r3 = 32
            int r0 = FT_MAKE_TAG(r0, r1, r2, r3)
            org.lwjgl.util.freetype.FreeType.TTAG_cvt = r0
            r0 = 68
            r1 = 83
            r2 = 73
            r3 = 71
            int r0 = FT_MAKE_TAG(r0, r1, r2, r3)
            org.lwjgl.util.freetype.FreeType.TTAG_DSIG = r0
            r0 = 69
            r1 = 66
            r2 = 68
            r3 = 84
            int r0 = FT_MAKE_TAG(r0, r1, r2, r3)
            org.lwjgl.util.freetype.FreeType.TTAG_EBDT = r0
            r0 = 69
            r1 = 66
            r2 = 76
            r3 = 67
            int r0 = FT_MAKE_TAG(r0, r1, r2, r3)
            org.lwjgl.util.freetype.FreeType.TTAG_EBLC = r0
            r0 = 69
            r1 = 66
            r2 = 83
            r3 = 67
            int r0 = FT_MAKE_TAG(r0, r1, r2, r3)
            org.lwjgl.util.freetype.FreeType.TTAG_EBSC = r0
            r0 = 102(0x66, float:1.43E-43)
            r1 = 101(0x65, float:1.42E-43)
            r2 = 97
            r3 = 116(0x74, float:1.63E-43)
            int r0 = FT_MAKE_TAG(r0, r1, r2, r3)
            org.lwjgl.util.freetype.FreeType.TTAG_feat = r0
            r0 = 70
            r1 = 79
            r2 = 78
            r3 = 68
            int r0 = FT_MAKE_TAG(r0, r1, r2, r3)
            org.lwjgl.util.freetype.FreeType.TTAG_FOND = r0
            r0 = 102(0x66, float:1.43E-43)
            r1 = 112(0x70, float:1.57E-43)
            r2 = 103(0x67, float:1.44E-43)
            r3 = 109(0x6d, float:1.53E-43)
            int r0 = FT_MAKE_TAG(r0, r1, r2, r3)
            org.lwjgl.util.freetype.FreeType.TTAG_fpgm = r0
            r0 = 102(0x66, float:1.43E-43)
            r1 = 118(0x76, float:1.65E-43)
            r2 = 97
            r3 = 114(0x72, float:1.6E-43)
            int r0 = FT_MAKE_TAG(r0, r1, r2, r3)
            org.lwjgl.util.freetype.FreeType.TTAG_fvar = r0
            r0 = 103(0x67, float:1.44E-43)
            r1 = 97
            r2 = 115(0x73, float:1.61E-43)
            r3 = 112(0x70, float:1.57E-43)
            int r0 = FT_MAKE_TAG(r0, r1, r2, r3)
            org.lwjgl.util.freetype.FreeType.TTAG_gasp = r0
            r0 = 71
            r1 = 68
            r2 = 69
            r3 = 70
            int r0 = FT_MAKE_TAG(r0, r1, r2, r3)
            org.lwjgl.util.freetype.FreeType.TTAG_GDEF = r0
            r0 = 103(0x67, float:1.44E-43)
            r1 = 108(0x6c, float:1.51E-43)
            r2 = 121(0x79, float:1.7E-43)
            r3 = 102(0x66, float:1.43E-43)
            int r0 = FT_MAKE_TAG(r0, r1, r2, r3)
            org.lwjgl.util.freetype.FreeType.TTAG_glyf = r0
            r0 = 71
            r1 = 80
            r2 = 79
            r3 = 83
            int r0 = FT_MAKE_TAG(r0, r1, r2, r3)
            org.lwjgl.util.freetype.FreeType.TTAG_GPOS = r0
            r0 = 71
            r1 = 83
            r2 = 85
            r3 = 66
            int r0 = FT_MAKE_TAG(r0, r1, r2, r3)
            org.lwjgl.util.freetype.FreeType.TTAG_GSUB = r0
            r0 = 103(0x67, float:1.44E-43)
            r1 = 118(0x76, float:1.65E-43)
            r2 = 97
            r3 = 114(0x72, float:1.6E-43)
            int r0 = FT_MAKE_TAG(r0, r1, r2, r3)
            org.lwjgl.util.freetype.FreeType.TTAG_gvar = r0
            r0 = 72
            r1 = 86
            r2 = 65
            r3 = 82
            int r0 = FT_MAKE_TAG(r0, r1, r2, r3)
            org.lwjgl.util.freetype.FreeType.TTAG_HVAR = r0
            r0 = 104(0x68, float:1.46E-43)
            r1 = 100
            r2 = 109(0x6d, float:1.53E-43)
            r3 = 120(0x78, float:1.68E-43)
            int r0 = FT_MAKE_TAG(r0, r1, r2, r3)
            org.lwjgl.util.freetype.FreeType.TTAG_hdmx = r0
            r0 = 104(0x68, float:1.46E-43)
            r1 = 101(0x65, float:1.42E-43)
            r2 = 97
            r3 = 100
            int r0 = FT_MAKE_TAG(r0, r1, r2, r3)
            org.lwjgl.util.freetype.FreeType.TTAG_head = r0
            r0 = 104(0x68, float:1.46E-43)
            r1 = 104(0x68, float:1.46E-43)
            r2 = 101(0x65, float:1.42E-43)
            r3 = 97
            int r0 = FT_MAKE_TAG(r0, r1, r2, r3)
            org.lwjgl.util.freetype.FreeType.TTAG_hhea = r0
            r0 = 104(0x68, float:1.46E-43)
            r1 = 109(0x6d, float:1.53E-43)
            r2 = 116(0x74, float:1.63E-43)
            r3 = 120(0x78, float:1.68E-43)
            int r0 = FT_MAKE_TAG(r0, r1, r2, r3)
            org.lwjgl.util.freetype.FreeType.TTAG_hmtx = r0
            r0 = 74
            r1 = 83
            r2 = 84
            r3 = 70
            int r0 = FT_MAKE_TAG(r0, r1, r2, r3)
            org.lwjgl.util.freetype.FreeType.TTAG_JSTF = r0
            r0 = 106(0x6a, float:1.49E-43)
            r1 = 117(0x75, float:1.64E-43)
            r2 = 115(0x73, float:1.61E-43)
            r3 = 116(0x74, float:1.63E-43)
            int r0 = FT_MAKE_TAG(r0, r1, r2, r3)
            org.lwjgl.util.freetype.FreeType.TTAG_just = r0
            r0 = 107(0x6b, float:1.5E-43)
            r1 = 101(0x65, float:1.42E-43)
            r2 = 114(0x72, float:1.6E-43)
            r3 = 110(0x6e, float:1.54E-43)
            int r0 = FT_MAKE_TAG(r0, r1, r2, r3)
            org.lwjgl.util.freetype.FreeType.TTAG_kern = r0
            r0 = 108(0x6c, float:1.51E-43)
            r1 = 99
            r2 = 97
            r3 = 114(0x72, float:1.6E-43)
            int r0 = FT_MAKE_TAG(r0, r1, r2, r3)
            org.lwjgl.util.freetype.FreeType.TTAG_lcar = r0
            r0 = 108(0x6c, float:1.51E-43)
            r1 = 111(0x6f, float:1.56E-43)
            r2 = 99
            r3 = 97
            int r0 = FT_MAKE_TAG(r0, r1, r2, r3)
            org.lwjgl.util.freetype.FreeType.TTAG_loca = r0
            r0 = 76
            r1 = 84
            r2 = 83
            r3 = 72
            int r0 = FT_MAKE_TAG(r0, r1, r2, r3)
            org.lwjgl.util.freetype.FreeType.TTAG_LTSH = r0
            r0 = 76
            r1 = 87
            r2 = 70
            r3 = 78
            int r0 = FT_MAKE_TAG(r0, r1, r2, r3)
            org.lwjgl.util.freetype.FreeType.TTAG_LWFN = r0
            r0 = 77
            r1 = 65
            r2 = 84
            r3 = 72
            int r0 = FT_MAKE_TAG(r0, r1, r2, r3)
            org.lwjgl.util.freetype.FreeType.TTAG_MATH = r0
            r0 = 109(0x6d, float:1.53E-43)
            r1 = 97
            r2 = 120(0x78, float:1.68E-43)
            r3 = 112(0x70, float:1.57E-43)
            int r0 = FT_MAKE_TAG(r0, r1, r2, r3)
            org.lwjgl.util.freetype.FreeType.TTAG_maxp = r0
            r0 = 77
            r1 = 69
            r2 = 84
            r3 = 65
            int r0 = FT_MAKE_TAG(r0, r1, r2, r3)
            org.lwjgl.util.freetype.FreeType.TTAG_META = r0
            r0 = 77
            r1 = 77
            r2 = 70
            r3 = 88
            int r0 = FT_MAKE_TAG(r0, r1, r2, r3)
            org.lwjgl.util.freetype.FreeType.TTAG_MMFX = r0
            r0 = 77
            r1 = 77
            r2 = 83
            r3 = 68
            int r0 = FT_MAKE_TAG(r0, r1, r2, r3)
            org.lwjgl.util.freetype.FreeType.TTAG_MMSD = r0
            r0 = 109(0x6d, float:1.53E-43)
            r1 = 111(0x6f, float:1.56E-43)
            r2 = 114(0x72, float:1.6E-43)
            r3 = 116(0x74, float:1.63E-43)
            int r0 = FT_MAKE_TAG(r0, r1, r2, r3)
            org.lwjgl.util.freetype.FreeType.TTAG_mort = r0
            r0 = 109(0x6d, float:1.53E-43)
            r1 = 111(0x6f, float:1.56E-43)
            r2 = 114(0x72, float:1.6E-43)
            r3 = 120(0x78, float:1.68E-43)
            int r0 = FT_MAKE_TAG(r0, r1, r2, r3)
            org.lwjgl.util.freetype.FreeType.TTAG_morx = r0
            r0 = 77
            r1 = 86
            r2 = 65
            r3 = 82
            int r0 = FT_MAKE_TAG(r0, r1, r2, r3)
            org.lwjgl.util.freetype.FreeType.TTAG_MVAR = r0
            r0 = 110(0x6e, float:1.54E-43)
            r1 = 97
            r2 = 109(0x6d, float:1.53E-43)
            r3 = 101(0x65, float:1.42E-43)
            int r0 = FT_MAKE_TAG(r0, r1, r2, r3)
            org.lwjgl.util.freetype.FreeType.TTAG_name = r0
            r0 = 111(0x6f, float:1.56E-43)
            r1 = 112(0x70, float:1.57E-43)
            r2 = 98
            r3 = 100
            int r0 = FT_MAKE_TAG(r0, r1, r2, r3)
            org.lwjgl.util.freetype.FreeType.TTAG_opbd = r0
            r0 = 79
            r1 = 83
            r2 = 47
            r3 = 50
            int r0 = FT_MAKE_TAG(r0, r1, r2, r3)
            org.lwjgl.util.freetype.FreeType.TTAG_OS2 = r0
            r0 = 79
            r1 = 84
            r2 = 84
            r3 = 79
            int r0 = FT_MAKE_TAG(r0, r1, r2, r3)
            org.lwjgl.util.freetype.FreeType.TTAG_OTTO = r0
            r0 = 80
            r1 = 67
            r2 = 76
            r3 = 84
            int r0 = FT_MAKE_TAG(r0, r1, r2, r3)
            org.lwjgl.util.freetype.FreeType.TTAG_PCLT = r0
            r0 = 80
            r1 = 79
            r2 = 83
            r3 = 84
            int r0 = FT_MAKE_TAG(r0, r1, r2, r3)
            org.lwjgl.util.freetype.FreeType.TTAG_POST = r0
            r0 = 112(0x70, float:1.57E-43)
            r1 = 111(0x6f, float:1.56E-43)
            r2 = 115(0x73, float:1.61E-43)
            r3 = 116(0x74, float:1.63E-43)
            int r0 = FT_MAKE_TAG(r0, r1, r2, r3)
            org.lwjgl.util.freetype.FreeType.TTAG_post = r0
            r0 = 112(0x70, float:1.57E-43)
            r1 = 114(0x72, float:1.6E-43)
            r2 = 101(0x65, float:1.42E-43)
            r3 = 112(0x70, float:1.57E-43)
            int r0 = FT_MAKE_TAG(r0, r1, r2, r3)
            org.lwjgl.util.freetype.FreeType.TTAG_prep = r0
            r0 = 112(0x70, float:1.57E-43)
            r1 = 114(0x72, float:1.6E-43)
            r2 = 111(0x6f, float:1.56E-43)
            r3 = 112(0x70, float:1.57E-43)
            int r0 = FT_MAKE_TAG(r0, r1, r2, r3)
            org.lwjgl.util.freetype.FreeType.TTAG_prop = r0
            r0 = 115(0x73, float:1.61E-43)
            r1 = 98
            r2 = 105(0x69, float:1.47E-43)
            r3 = 120(0x78, float:1.68E-43)
            int r0 = FT_MAKE_TAG(r0, r1, r2, r3)
            org.lwjgl.util.freetype.FreeType.TTAG_sbix = r0
            r0 = 115(0x73, float:1.61E-43)
            r1 = 102(0x66, float:1.43E-43)
            r2 = 110(0x6e, float:1.54E-43)
            r3 = 116(0x74, float:1.63E-43)
            int r0 = FT_MAKE_TAG(r0, r1, r2, r3)
            org.lwjgl.util.freetype.FreeType.TTAG_sfnt = r0
            r0 = 83
            r1 = 73
            r2 = 78
            r3 = 71
            int r0 = FT_MAKE_TAG(r0, r1, r2, r3)
            org.lwjgl.util.freetype.FreeType.TTAG_SING = r0
            r0 = 83
            r1 = 86
            r2 = 71
            r3 = 32
            int r0 = FT_MAKE_TAG(r0, r1, r2, r3)
            org.lwjgl.util.freetype.FreeType.TTAG_SVG = r0
            r0 = 116(0x74, float:1.63E-43)
            r1 = 114(0x72, float:1.6E-43)
            r2 = 97
            r3 = 107(0x6b, float:1.5E-43)
            int r0 = FT_MAKE_TAG(r0, r1, r2, r3)
            org.lwjgl.util.freetype.FreeType.TTAG_trak = r0
            r0 = 116(0x74, float:1.63E-43)
            r1 = 114(0x72, float:1.6E-43)
            r2 = 117(0x75, float:1.64E-43)
            r3 = 101(0x65, float:1.42E-43)
            int r0 = FT_MAKE_TAG(r0, r1, r2, r3)
            org.lwjgl.util.freetype.FreeType.TTAG_true = r0
            r0 = 116(0x74, float:1.63E-43)
            r1 = 116(0x74, float:1.63E-43)
            r2 = 99
            r3 = 32
            int r0 = FT_MAKE_TAG(r0, r1, r2, r3)
            org.lwjgl.util.freetype.FreeType.TTAG_ttc = r0
            r0 = 116(0x74, float:1.63E-43)
            r1 = 116(0x74, float:1.63E-43)
            r2 = 99
            r3 = 102(0x66, float:1.43E-43)
            int r0 = FT_MAKE_TAG(r0, r1, r2, r3)
            org.lwjgl.util.freetype.FreeType.TTAG_ttcf = r0
            r0 = 84
            r1 = 89
            r2 = 80
            r3 = 49
            int r0 = FT_MAKE_TAG(r0, r1, r2, r3)
            org.lwjgl.util.freetype.FreeType.TTAG_TYP1 = r0
            r0 = 116(0x74, float:1.63E-43)
            r1 = 121(0x79, float:1.7E-43)
            r2 = 112(0x70, float:1.57E-43)
            r3 = 49
            int r0 = FT_MAKE_TAG(r0, r1, r2, r3)
            org.lwjgl.util.freetype.FreeType.TTAG_typ1 = r0
            r0 = 86
            r1 = 68
            r2 = 77
            r3 = 88
            int r0 = FT_MAKE_TAG(r0, r1, r2, r3)
            org.lwjgl.util.freetype.FreeType.TTAG_VDMX = r0
            r0 = 118(0x76, float:1.65E-43)
            r1 = 104(0x68, float:1.46E-43)
            r2 = 101(0x65, float:1.42E-43)
            r3 = 97
            int r0 = FT_MAKE_TAG(r0, r1, r2, r3)
            org.lwjgl.util.freetype.FreeType.TTAG_vhea = r0
            r0 = 118(0x76, float:1.65E-43)
            r1 = 109(0x6d, float:1.53E-43)
            r2 = 116(0x74, float:1.63E-43)
            r3 = 120(0x78, float:1.68E-43)
            int r0 = FT_MAKE_TAG(r0, r1, r2, r3)
            org.lwjgl.util.freetype.FreeType.TTAG_vmtx = r0
            r0 = 86
            r1 = 86
            r2 = 65
            r3 = 82
            int r0 = FT_MAKE_TAG(r0, r1, r2, r3)
            org.lwjgl.util.freetype.FreeType.TTAG_VVAR = r0
            r0 = 119(0x77, float:1.67E-43)
            r1 = 79
            r2 = 70
            r3 = 70
            int r0 = FT_MAKE_TAG(r0, r1, r2, r3)
            org.lwjgl.util.freetype.FreeType.TTAG_wOFF = r0
            r0 = 119(0x77, float:1.67E-43)
            r1 = 79
            r2 = 70
            r3 = 50
            int r0 = FT_MAKE_TAG(r0, r1, r2, r3)
            org.lwjgl.util.freetype.FreeType.TTAG_wOF2 = r0
            r0 = 165(0xa5, float:2.31E-43)
            r1 = 107(0x6b, float:1.5E-43)
            r2 = 98
            r3 = 100
            int r0 = FT_MAKE_TAG(r0, r1, r2, r3)
            org.lwjgl.util.freetype.FreeType.TTAG_0xA5kbd = r0
            r0 = 165(0xa5, float:2.31E-43)
            r1 = 108(0x6c, float:1.51E-43)
            r2 = 115(0x73, float:1.61E-43)
            r3 = 116(0x74, float:1.63E-43)
            int r0 = FT_MAKE_TAG(r0, r1, r2, r3)
            org.lwjgl.util.freetype.FreeType.TTAG_0xA5lst = r0
            int r0 = org.lwjgl.system.libffi.LibFFI.FFI_DEFAULT_ABI
            org.lwjgl.system.libffi.FFIType r1 = org.lwjgl.system.libffi.LibFFI.ffi_type_sint32
            r2 = 6
            org.lwjgl.system.libffi.FFIType[] r2 = new org.lwjgl.system.libffi.FFIType[r2]
            r3 = r2
            r4 = 0
            org.lwjgl.system.libffi.FFIType r5 = org.lwjgl.system.libffi.LibFFI.ffi_type_pointer
            r3[r4] = r5
            r3 = r2
            r4 = 1
            org.lwjgl.system.libffi.FFIType r5 = org.lwjgl.system.libffi.LibFFI.ffi_type_pointer
            r3[r4] = r5
            r3 = r2
            r4 = 2
            r5 = 2
            org.lwjgl.system.libffi.FFIType[] r5 = new org.lwjgl.system.libffi.FFIType[r5]
            r6 = r5
            r7 = 0
            org.lwjgl.system.libffi.FFIType r8 = org.lwjgl.system.libffi.LibFFI.ffi_type_slong
            r6[r7] = r8
            r6 = r5
            r7 = 1
            org.lwjgl.system.libffi.FFIType r8 = org.lwjgl.system.libffi.LibFFI.ffi_type_slong
            r6[r7] = r8
            org.lwjgl.system.libffi.FFIType r5 = org.lwjgl.system.APIUtil.apiCreateStruct(r5)
            r3[r4] = r5
            r3 = r2
            r4 = 3
            org.lwjgl.system.libffi.FFIType r5 = org.lwjgl.system.libffi.LibFFI.ffi_type_pointer
            r3[r4] = r5
            r3 = r2
            r4 = 4
            org.lwjgl.system.libffi.FFIType r5 = org.lwjgl.system.libffi.LibFFI.ffi_type_pointer
            r3[r4] = r5
            r3 = r2
            r4 = 5
            r5 = 4
            org.lwjgl.system.libffi.FFIType[] r5 = new org.lwjgl.system.libffi.FFIType[r5]
            r6 = r5
            r7 = 0
            org.lwjgl.system.libffi.FFIType r8 = org.lwjgl.system.libffi.LibFFI.ffi_type_uint8
            r6[r7] = r8
            r6 = r5
            r7 = 1
            org.lwjgl.system.libffi.FFIType r8 = org.lwjgl.system.libffi.LibFFI.ffi_type_uint8
            r6[r7] = r8
            r6 = r5
            r7 = 2
            org.lwjgl.system.libffi.FFIType r8 = org.lwjgl.system.libffi.LibFFI.ffi_type_uint8
            r6[r7] = r8
            r6 = r5
            r7 = 3
            org.lwjgl.system.libffi.FFIType r8 = org.lwjgl.system.libffi.LibFFI.ffi_type_uint8
            r6[r7] = r8
            org.lwjgl.system.libffi.FFIType r5 = org.lwjgl.system.APIUtil.apiCreateStruct(r5)
            r3[r4] = r5
            org.lwjgl.system.libffi.FFICIF r0 = org.lwjgl.system.APIUtil.apiCreateCIF(r0, r1, r2)
            org.lwjgl.util.freetype.FreeType.FT_Bitmap_BlendCIF = r0
            int r0 = org.lwjgl.system.libffi.LibFFI.FFI_DEFAULT_ABI
            org.lwjgl.system.libffi.FFIType r1 = org.lwjgl.system.libffi.LibFFI.ffi_type_sint32
            r2 = 2
            org.lwjgl.system.libffi.FFIType[] r2 = new org.lwjgl.system.libffi.FFIType[r2]
            r3 = r2
            r4 = 0
            org.lwjgl.system.libffi.FFIType r5 = org.lwjgl.system.libffi.LibFFI.ffi_type_pointer
            r3[r4] = r5
            r3 = r2
            r4 = 1
            r5 = 4
            org.lwjgl.system.libffi.FFIType[] r5 = new org.lwjgl.system.libffi.FFIType[r5]
            r6 = r5
            r7 = 0
            org.lwjgl.system.libffi.FFIType r8 = org.lwjgl.system.libffi.LibFFI.ffi_type_uint8
            r6[r7] = r8
            r6 = r5
            r7 = 1
            org.lwjgl.system.libffi.FFIType r8 = org.lwjgl.system.libffi.LibFFI.ffi_type_uint8
            r6[r7] = r8
            r6 = r5
            r7 = 2
            org.lwjgl.system.libffi.FFIType r8 = org.lwjgl.system.libffi.LibFFI.ffi_type_uint8
            r6[r7] = r8
            r6 = r5
            r7 = 3
            org.lwjgl.system.libffi.FFIType r8 = org.lwjgl.system.libffi.LibFFI.ffi_type_uint8
            r6[r7] = r8
            org.lwjgl.system.libffi.FFIType r5 = org.lwjgl.system.APIUtil.apiCreateStruct(r5)
            r3[r4] = r5
            org.lwjgl.system.libffi.FFICIF r0 = org.lwjgl.system.APIUtil.apiCreateCIF(r0, r1, r2)
            org.lwjgl.util.freetype.FreeType.FT_Palette_Set_Foreground_ColorCIF = r0
            int r0 = org.lwjgl.system.libffi.LibFFI.FFI_DEFAULT_ABI
            org.lwjgl.system.libffi.FFIType r1 = org.lwjgl.system.libffi.LibFFI.ffi_type_uint8
            r2 = 3
            org.lwjgl.system.libffi.FFIType[] r2 = new org.lwjgl.system.libffi.FFIType[r2]
            r3 = r2
            r4 = 0
            org.lwjgl.system.libffi.FFIType r5 = org.lwjgl.system.libffi.LibFFI.ffi_type_pointer
            r3[r4] = r5
            r3 = r2
            r4 = 1
            r5 = 2
            org.lwjgl.system.libffi.FFIType[] r5 = new org.lwjgl.system.libffi.FFIType[r5]
            r6 = r5
            r7 = 0
            org.lwjgl.system.libffi.FFIType r8 = org.lwjgl.system.libffi.LibFFI.ffi_type_pointer
            r6[r7] = r8
            r6 = r5
            r7 = 1
            org.lwjgl.system.libffi.FFIType r8 = org.lwjgl.system.libffi.LibFFI.ffi_type_uint8
            r6[r7] = r8
            org.lwjgl.system.libffi.FFIType r5 = org.lwjgl.system.APIUtil.apiCreateStruct(r5)
            r3[r4] = r5
            r3 = r2
            r4 = 2
            org.lwjgl.system.libffi.FFIType r5 = org.lwjgl.system.libffi.LibFFI.ffi_type_pointer
            r3[r4] = r5
            org.lwjgl.system.libffi.FFICIF r0 = org.lwjgl.system.APIUtil.apiCreateCIF(r0, r1, r2)
            org.lwjgl.util.freetype.FreeType.FT_Get_PaintCIF = r0
            return
    }
}
