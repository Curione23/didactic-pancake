package org.lwjgl.opengl;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/opengl/NVPathRendering.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/opengl/NVPathRendering.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/opengl/NVPathRendering.class */
public class NVPathRendering {
    public static final byte GL_CLOSE_PATH_NV = 0;
    public static final byte GL_MOVE_TO_NV = 2;
    public static final byte GL_RELATIVE_MOVE_TO_NV = 3;
    public static final byte GL_LINE_TO_NV = 4;
    public static final byte GL_RELATIVE_LINE_TO_NV = 5;
    public static final byte GL_HORIZONTAL_LINE_TO_NV = 6;
    public static final byte GL_RELATIVE_HORIZONTAL_LINE_TO_NV = 7;
    public static final byte GL_VERTICAL_LINE_TO_NV = 8;
    public static final byte GL_RELATIVE_VERTICAL_LINE_TO_NV = 9;
    public static final byte GL_QUADRATIC_CURVE_TO_NV = 10;
    public static final byte GL_RELATIVE_QUADRATIC_CURVE_TO_NV = 11;
    public static final byte GL_CUBIC_CURVE_TO_NV = 12;
    public static final byte GL_RELATIVE_CUBIC_CURVE_TO_NV = 13;
    public static final byte GL_SMOOTH_QUADRATIC_CURVE_TO_NV = 14;
    public static final byte GL_RELATIVE_SMOOTH_QUADRATIC_CURVE_TO_NV = 15;
    public static final byte GL_SMOOTH_CUBIC_CURVE_TO_NV = 16;
    public static final byte GL_RELATIVE_SMOOTH_CUBIC_CURVE_TO_NV = 17;
    public static final byte GL_SMALL_CCW_ARC_TO_NV = 18;
    public static final byte GL_RELATIVE_SMALL_CCW_ARC_TO_NV = 19;
    public static final byte GL_SMALL_CW_ARC_TO_NV = 20;
    public static final byte GL_RELATIVE_SMALL_CW_ARC_TO_NV = 21;
    public static final byte GL_LARGE_CCW_ARC_TO_NV = 22;
    public static final byte GL_RELATIVE_LARGE_CCW_ARC_TO_NV = 23;
    public static final byte GL_LARGE_CW_ARC_TO_NV = 24;
    public static final byte GL_RELATIVE_LARGE_CW_ARC_TO_NV = 25;
    public static final byte GL_CONIC_CURVE_TO_NV = 26;
    public static final byte GL_RELATIVE_CONIC_CURVE_TO_NV = 27;
    public static final byte GL_ROUNDED_RECT_NV = -24;
    public static final byte GL_RELATIVE_ROUNDED_RECT_NV = -23;
    public static final byte GL_ROUNDED_RECT2_NV = -22;
    public static final byte GL_RELATIVE_ROUNDED_RECT2_NV = -21;
    public static final byte GL_ROUNDED_RECT4_NV = -20;
    public static final byte GL_RELATIVE_ROUNDED_RECT4_NV = -19;
    public static final byte GL_ROUNDED_RECT8_NV = -18;
    public static final byte GL_RELATIVE_ROUNDED_RECT8_NV = -17;
    public static final byte GL_RESTART_PATH_NV = -16;
    public static final byte GL_DUP_FIRST_CUBIC_CURVE_TO_NV = -14;
    public static final byte GL_DUP_LAST_CUBIC_CURVE_TO_NV = -12;
    public static final byte GL_RECT_NV = -10;
    public static final byte GL_RELATIVE_RECT_NV = -9;
    public static final byte GL_CIRCULAR_CCW_ARC_TO_NV = -8;
    public static final byte GL_CIRCULAR_CW_ARC_TO_NV = -6;
    public static final byte GL_CIRCULAR_TANGENT_ARC_TO_NV = -4;
    public static final byte GL_ARC_TO_NV = -2;
    public static final byte GL_RELATIVE_ARC_TO_NV = -1;
    public static final int GL_PATH_FORMAT_SVG_NV = 36976;
    public static final int GL_PATH_FORMAT_PS_NV = 36977;
    public static final int GL_STANDARD_FONT_NAME_NV = 36978;
    public static final int GL_SYSTEM_FONT_NAME_NV = 36979;
    public static final int GL_FILE_NAME_NV = 36980;
    public static final int GL_STANDARD_FONT_FORMAT_NV = 37740;
    public static final int GL_SKIP_MISSING_GLYPH_NV = 37033;
    public static final int GL_USE_MISSING_GLYPH_NV = 37034;
    public static final int GL_FONT_GLYPHS_AVAILABLE_NV = 37736;
    public static final int GL_FONT_TARGET_UNAVAILABLE_NV = 37737;
    public static final int GL_FONT_UNAVAILABLE_NV = 37738;
    public static final int GL_FONT_UNINTELLIGIBLE_NV = 37739;
    public static final int GL_PATH_STROKE_WIDTH_NV = 36981;
    public static final int GL_PATH_INITIAL_END_CAP_NV = 36983;
    public static final int GL_PATH_TERMINAL_END_CAP_NV = 36984;
    public static final int GL_PATH_JOIN_STYLE_NV = 36985;
    public static final int GL_PATH_MITER_LIMIT_NV = 36986;
    public static final int GL_PATH_INITIAL_DASH_CAP_NV = 36988;
    public static final int GL_PATH_TERMINAL_DASH_CAP_NV = 36989;
    public static final int GL_PATH_DASH_OFFSET_NV = 36990;
    public static final int GL_PATH_CLIENT_LENGTH_NV = 36991;
    public static final int GL_PATH_DASH_OFFSET_RESET_NV = 37044;
    public static final int GL_PATH_FILL_MODE_NV = 36992;
    public static final int GL_PATH_FILL_MASK_NV = 36993;
    public static final int GL_PATH_FILL_COVER_MODE_NV = 36994;
    public static final int GL_PATH_STROKE_COVER_MODE_NV = 36995;
    public static final int GL_PATH_STROKE_MASK_NV = 36996;
    public static final int GL_PATH_STROKE_BOUND_NV = 36998;
    public static final int GL_PATH_END_CAPS_NV = 36982;
    public static final int GL_PATH_DASH_CAPS_NV = 36987;
    public static final int GL_COUNT_UP_NV = 37000;
    public static final int GL_COUNT_DOWN_NV = 37001;
    public static final int GL_PRIMARY_COLOR_NV = 34092;
    public static final int GL_SECONDARY_COLOR_NV = 34093;
    public static final int GL_PATH_OBJECT_BOUNDING_BOX_NV = 37002;
    public static final int GL_CONVEX_HULL_NV = 37003;
    public static final int GL_BOUNDING_BOX_NV = 37005;
    public static final int GL_TRANSLATE_X_NV = 37006;
    public static final int GL_TRANSLATE_Y_NV = 37007;
    public static final int GL_TRANSLATE_2D_NV = 37008;
    public static final int GL_TRANSLATE_3D_NV = 37009;
    public static final int GL_AFFINE_2D_NV = 37010;
    public static final int GL_AFFINE_3D_NV = 37012;
    public static final int GL_TRANSPOSE_AFFINE_2D_NV = 37014;
    public static final int GL_TRANSPOSE_AFFINE_3D_NV = 37016;
    public static final int GL_UTF8_NV = 37018;
    public static final int GL_UTF16_NV = 37019;
    public static final int GL_BOUNDING_BOX_OF_BOUNDING_BOXES_NV = 37020;
    public static final int GL_PATH_COMMAND_COUNT_NV = 37021;
    public static final int GL_PATH_COORD_COUNT_NV = 37022;
    public static final int GL_PATH_DASH_ARRAY_COUNT_NV = 37023;
    public static final int GL_PATH_COMPUTED_LENGTH_NV = 37024;
    public static final int GL_PATH_FILL_BOUNDING_BOX_NV = 37025;
    public static final int GL_PATH_STROKE_BOUNDING_BOX_NV = 37026;
    public static final int GL_SQUARE_NV = 37027;
    public static final int GL_ROUND_NV = 37028;
    public static final int GL_TRIANGULAR_NV = 37029;
    public static final int GL_BEVEL_NV = 37030;
    public static final int GL_MITER_REVERT_NV = 37031;
    public static final int GL_MITER_TRUNCATE_NV = 37032;
    public static final int GL_MOVE_TO_RESETS_NV = 37045;
    public static final int GL_MOVE_TO_CONTINUES_NV = 37046;
    public static final int GL_BOLD_BIT_NV = 1;
    public static final int GL_ITALIC_BIT_NV = 2;
    public static final int GL_PATH_ERROR_POSITION_NV = 37035;
    public static final int GL_PATH_FOG_GEN_MODE_NV = 37036;
    public static final int GL_PATH_STENCIL_FUNC_NV = 37047;
    public static final int GL_PATH_STENCIL_REF_NV = 37048;
    public static final int GL_PATH_STENCIL_VALUE_MASK_NV = 37049;
    public static final int GL_PATH_STENCIL_DEPTH_OFFSET_FACTOR_NV = 37053;
    public static final int GL_PATH_STENCIL_DEPTH_OFFSET_UNITS_NV = 37054;
    public static final int GL_PATH_COVER_DEPTH_FUNC_NV = 37055;
    public static final int GL_GLYPH_WIDTH_BIT_NV = 1;
    public static final int GL_GLYPH_HEIGHT_BIT_NV = 2;
    public static final int GL_GLYPH_HORIZONTAL_BEARING_X_BIT_NV = 4;
    public static final int GL_GLYPH_HORIZONTAL_BEARING_Y_BIT_NV = 8;
    public static final int GL_GLYPH_HORIZONTAL_BEARING_ADVANCE_BIT_NV = 16;
    public static final int GL_GLYPH_VERTICAL_BEARING_X_BIT_NV = 32;
    public static final int GL_GLYPH_VERTICAL_BEARING_Y_BIT_NV = 64;
    public static final int GL_GLYPH_VERTICAL_BEARING_ADVANCE_BIT_NV = 128;
    public static final int GL_GLYPH_HAS_KERNING_BIT_NV = 256;
    public static final int GL_FONT_X_MIN_BOUNDS_BIT_NV = 65536;
    public static final int GL_FONT_Y_MIN_BOUNDS_BIT_NV = 131072;
    public static final int GL_FONT_X_MAX_BOUNDS_BIT_NV = 262144;
    public static final int GL_FONT_Y_MAX_BOUNDS_BIT_NV = 524288;
    public static final int GL_FONT_UNITS_PER_EM_BIT_NV = 1048576;
    public static final int GL_FONT_ASCENDER_BIT_NV = 2097152;
    public static final int GL_FONT_DESCENDER_BIT_NV = 4194304;
    public static final int GL_FONT_HEIGHT_BIT_NV = 8388608;
    public static final int GL_FONT_MAX_ADVANCE_WIDTH_BIT_NV = 16777216;
    public static final int GL_FONT_MAX_ADVANCE_HEIGHT_BIT_NV = 33554432;
    public static final int GL_FONT_UNDERLINE_POSITION_BIT_NV = 67108864;
    public static final int GL_FONT_UNDERLINE_THICKNESS_BIT_NV = 134217728;
    public static final int GL_FONT_HAS_KERNING_BIT_NV = 268435456;
    public static final int GL_FONT_NUM_GLYPH_INDICES_BIT_NV = 536870912;
    public static final int GL_ACCUM_ADJACENT_PAIRS_NV = 37037;
    public static final int GL_ADJACENT_PAIRS_NV = 37038;
    public static final int GL_FIRST_TO_REST_NV = 37039;
    public static final int GL_PATH_GEN_MODE_NV = 37040;
    public static final int GL_PATH_GEN_COEFF_NV = 37041;
    public static final int GL_PATH_GEN_COLOR_FORMAT_NV = 37042;
    public static final int GL_PATH_GEN_COMPONENTS_NV = 37043;
    public static final int GL_FRAGMENT_INPUT_NV = 37741;
    public static final int GL_PATH_PROJECTION_NV = 5889;
    public static final int GL_PATH_MODELVIEW_NV = 5888;
    public static final int GL_PATH_MODELVIEW_STACK_DEPTH_NV = 2979;
    public static final int GL_PATH_MODELVIEW_MATRIX_NV = 2982;
    public static final int GL_PATH_MAX_MODELVIEW_STACK_DEPTH_NV = 3382;
    public static final int GL_PATH_TRANSPOSE_MODELVIEW_MATRIX_NV = 34019;
    public static final int GL_PATH_PROJECTION_STACK_DEPTH_NV = 2980;
    public static final int GL_PATH_PROJECTION_MATRIX_NV = 2983;
    public static final int GL_PATH_MAX_PROJECTION_STACK_DEPTH_NV = 3384;
    public static final int GL_PATH_TRANSPOSE_PROJECTION_MATRIX_NV = 34020;
    public static final int GL_2_BYTES_NV = 5127;
    public static final int GL_3_BYTES_NV = 5128;
    public static final int GL_4_BYTES_NV = 5129;
    public static final int GL_EYE_LINEAR_NV = 9216;
    public static final int GL_OBJECT_LINEAR_NV = 9217;
    public static final int GL_CONSTANT_NV = 34166;

    protected NVPathRendering() {
            r3 = this;
            r0 = r3
            r0.<init>()
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r1 = r0
            r1.<init>()
            throw r0
    }

    public static native void nglPathCommandsNV(int r0, int r1, long r2, int r4, int r5, long r6);

    public static void glPathCommandsNV(@org.lwjgl.system.NativeType("GLuint") int r9, @org.lwjgl.system.NativeType("GLubyte const *") java.nio.ByteBuffer r10, @org.lwjgl.system.NativeType("GLenum") int r11, @org.lwjgl.system.NativeType("void const *") java.nio.ByteBuffer r12) {
            r0 = r9
            r1 = r10
            int r1 = r1.remaining()
            r2 = r10
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            r3 = r12
            int r3 = r3.remaining()
            r4 = r11
            int r4 = org.lwjgl.opengl.GLChecks.typeToByteShift(r4)
            int r3 = r3 >> r4
            r4 = r11
            r5 = r12
            long r5 = org.lwjgl.system.MemoryUtil.memAddress(r5)
            nglPathCommandsNV(r0, r1, r2, r3, r4, r5)
            return
    }

    public static void glPathCommandsNV(@org.lwjgl.system.NativeType("GLuint") int r9, @org.lwjgl.system.NativeType("GLubyte const *") java.nio.ByteBuffer r10, @org.lwjgl.system.NativeType("GLenum") int r11, @org.lwjgl.system.NativeType("void const *") java.nio.ShortBuffer r12) {
            r0 = r9
            r1 = r10
            int r1 = r1.remaining()
            r2 = r10
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            r3 = r12
            int r3 = r3.remaining()
            long r3 = (long) r3
            r4 = 1
            long r3 = r3 << r4
            r4 = r11
            int r4 = org.lwjgl.opengl.GLChecks.typeToByteShift(r4)
            long r3 = r3 >> r4
            int r3 = (int) r3
            r4 = r11
            r5 = r12
            long r5 = org.lwjgl.system.MemoryUtil.memAddress(r5)
            nglPathCommandsNV(r0, r1, r2, r3, r4, r5)
            return
    }

    public static void glPathCommandsNV(@org.lwjgl.system.NativeType("GLuint") int r9, @org.lwjgl.system.NativeType("GLubyte const *") java.nio.ByteBuffer r10, @org.lwjgl.system.NativeType("GLenum") int r11, @org.lwjgl.system.NativeType("void const *") java.nio.FloatBuffer r12) {
            r0 = r9
            r1 = r10
            int r1 = r1.remaining()
            r2 = r10
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            r3 = r12
            int r3 = r3.remaining()
            long r3 = (long) r3
            r4 = 2
            long r3 = r3 << r4
            r4 = r11
            int r4 = org.lwjgl.opengl.GLChecks.typeToByteShift(r4)
            long r3 = r3 >> r4
            int r3 = (int) r3
            r4 = r11
            r5 = r12
            long r5 = org.lwjgl.system.MemoryUtil.memAddress(r5)
            nglPathCommandsNV(r0, r1, r2, r3, r4, r5)
            return
    }

    public static native void nglPathCoordsNV(int r0, int r1, int r2, long r3);

    public static void glPathCoordsNV(@org.lwjgl.system.NativeType("GLuint") int r6, @org.lwjgl.system.NativeType("GLenum") int r7, @org.lwjgl.system.NativeType("void const *") java.nio.ByteBuffer r8) {
            r0 = r6
            r1 = r8
            int r1 = r1.remaining()
            r2 = r7
            int r2 = org.lwjgl.opengl.GLChecks.typeToByteShift(r2)
            int r1 = r1 >> r2
            r2 = r7
            r3 = r8
            long r3 = org.lwjgl.system.MemoryUtil.memAddress(r3)
            nglPathCoordsNV(r0, r1, r2, r3)
            return
    }

    public static void glPathCoordsNV(@org.lwjgl.system.NativeType("GLuint") int r6, @org.lwjgl.system.NativeType("GLenum") int r7, @org.lwjgl.system.NativeType("void const *") java.nio.ShortBuffer r8) {
            r0 = r6
            r1 = r8
            int r1 = r1.remaining()
            long r1 = (long) r1
            r2 = 1
            long r1 = r1 << r2
            r2 = r7
            int r2 = org.lwjgl.opengl.GLChecks.typeToByteShift(r2)
            long r1 = r1 >> r2
            int r1 = (int) r1
            r2 = r7
            r3 = r8
            long r3 = org.lwjgl.system.MemoryUtil.memAddress(r3)
            nglPathCoordsNV(r0, r1, r2, r3)
            return
    }

    public static void glPathCoordsNV(@org.lwjgl.system.NativeType("GLuint") int r6, @org.lwjgl.system.NativeType("GLenum") int r7, @org.lwjgl.system.NativeType("void const *") java.nio.FloatBuffer r8) {
            r0 = r6
            r1 = r8
            int r1 = r1.remaining()
            long r1 = (long) r1
            r2 = 2
            long r1 = r1 << r2
            r2 = r7
            int r2 = org.lwjgl.opengl.GLChecks.typeToByteShift(r2)
            long r1 = r1 >> r2
            int r1 = (int) r1
            r2 = r7
            r3 = r8
            long r3 = org.lwjgl.system.MemoryUtil.memAddress(r3)
            nglPathCoordsNV(r0, r1, r2, r3)
            return
    }

    public static native void nglPathSubCommandsNV(int r0, int r1, int r2, int r3, long r4, int r6, int r7, long r8);

    public static void glPathSubCommandsNV(@org.lwjgl.system.NativeType("GLuint") int r11, @org.lwjgl.system.NativeType("GLsizei") int r12, @org.lwjgl.system.NativeType("GLsizei") int r13, @org.lwjgl.system.NativeType("GLubyte const *") java.nio.ByteBuffer r14, @org.lwjgl.system.NativeType("GLenum") int r15, @org.lwjgl.system.NativeType("void const *") java.nio.ByteBuffer r16) {
            r0 = r11
            r1 = r12
            r2 = r13
            r3 = r14
            int r3 = r3.remaining()
            r4 = r14
            long r4 = org.lwjgl.system.MemoryUtil.memAddress(r4)
            r5 = r16
            int r5 = r5.remaining()
            r6 = r15
            int r6 = org.lwjgl.opengl.GLChecks.typeToByteShift(r6)
            int r5 = r5 >> r6
            r6 = r15
            r7 = r16
            long r7 = org.lwjgl.system.MemoryUtil.memAddress(r7)
            nglPathSubCommandsNV(r0, r1, r2, r3, r4, r5, r6, r7)
            return
    }

    public static void glPathSubCommandsNV(@org.lwjgl.system.NativeType("GLuint") int r11, @org.lwjgl.system.NativeType("GLsizei") int r12, @org.lwjgl.system.NativeType("GLsizei") int r13, @org.lwjgl.system.NativeType("GLubyte const *") java.nio.ByteBuffer r14, @org.lwjgl.system.NativeType("GLenum") int r15, @org.lwjgl.system.NativeType("void const *") java.nio.ShortBuffer r16) {
            r0 = r11
            r1 = r12
            r2 = r13
            r3 = r14
            int r3 = r3.remaining()
            r4 = r14
            long r4 = org.lwjgl.system.MemoryUtil.memAddress(r4)
            r5 = r16
            int r5 = r5.remaining()
            long r5 = (long) r5
            r6 = 1
            long r5 = r5 << r6
            r6 = r15
            int r6 = org.lwjgl.opengl.GLChecks.typeToByteShift(r6)
            long r5 = r5 >> r6
            int r5 = (int) r5
            r6 = r15
            r7 = r16
            long r7 = org.lwjgl.system.MemoryUtil.memAddress(r7)
            nglPathSubCommandsNV(r0, r1, r2, r3, r4, r5, r6, r7)
            return
    }

    public static void glPathSubCommandsNV(@org.lwjgl.system.NativeType("GLuint") int r11, @org.lwjgl.system.NativeType("GLsizei") int r12, @org.lwjgl.system.NativeType("GLsizei") int r13, @org.lwjgl.system.NativeType("GLubyte const *") java.nio.ByteBuffer r14, @org.lwjgl.system.NativeType("GLenum") int r15, @org.lwjgl.system.NativeType("void const *") java.nio.FloatBuffer r16) {
            r0 = r11
            r1 = r12
            r2 = r13
            r3 = r14
            int r3 = r3.remaining()
            r4 = r14
            long r4 = org.lwjgl.system.MemoryUtil.memAddress(r4)
            r5 = r16
            int r5 = r5.remaining()
            long r5 = (long) r5
            r6 = 2
            long r5 = r5 << r6
            r6 = r15
            int r6 = org.lwjgl.opengl.GLChecks.typeToByteShift(r6)
            long r5 = r5 >> r6
            int r5 = (int) r5
            r6 = r15
            r7 = r16
            long r7 = org.lwjgl.system.MemoryUtil.memAddress(r7)
            nglPathSubCommandsNV(r0, r1, r2, r3, r4, r5, r6, r7)
            return
    }

    public static native void nglPathSubCoordsNV(int r0, int r1, int r2, int r3, long r4);

    public static void glPathSubCoordsNV(@org.lwjgl.system.NativeType("GLuint") int r7, @org.lwjgl.system.NativeType("GLsizei") int r8, @org.lwjgl.system.NativeType("GLenum") int r9, @org.lwjgl.system.NativeType("void const *") java.nio.ByteBuffer r10) {
            r0 = r7
            r1 = r8
            r2 = r10
            int r2 = r2.remaining()
            r3 = r9
            int r3 = org.lwjgl.opengl.GLChecks.typeToByteShift(r3)
            int r2 = r2 >> r3
            r3 = r9
            r4 = r10
            long r4 = org.lwjgl.system.MemoryUtil.memAddress(r4)
            nglPathSubCoordsNV(r0, r1, r2, r3, r4)
            return
    }

    public static void glPathSubCoordsNV(@org.lwjgl.system.NativeType("GLuint") int r7, @org.lwjgl.system.NativeType("GLsizei") int r8, @org.lwjgl.system.NativeType("GLenum") int r9, @org.lwjgl.system.NativeType("void const *") java.nio.ShortBuffer r10) {
            r0 = r7
            r1 = r8
            r2 = r10
            int r2 = r2.remaining()
            long r2 = (long) r2
            r3 = 1
            long r2 = r2 << r3
            r3 = r9
            int r3 = org.lwjgl.opengl.GLChecks.typeToByteShift(r3)
            long r2 = r2 >> r3
            int r2 = (int) r2
            r3 = r9
            r4 = r10
            long r4 = org.lwjgl.system.MemoryUtil.memAddress(r4)
            nglPathSubCoordsNV(r0, r1, r2, r3, r4)
            return
    }

    public static void glPathSubCoordsNV(@org.lwjgl.system.NativeType("GLuint") int r7, @org.lwjgl.system.NativeType("GLsizei") int r8, @org.lwjgl.system.NativeType("GLenum") int r9, @org.lwjgl.system.NativeType("void const *") java.nio.FloatBuffer r10) {
            r0 = r7
            r1 = r8
            r2 = r10
            int r2 = r2.remaining()
            long r2 = (long) r2
            r3 = 2
            long r2 = r2 << r3
            r3 = r9
            int r3 = org.lwjgl.opengl.GLChecks.typeToByteShift(r3)
            long r2 = r2 >> r3
            int r2 = (int) r2
            r3 = r9
            r4 = r10
            long r4 = org.lwjgl.system.MemoryUtil.memAddress(r4)
            nglPathSubCoordsNV(r0, r1, r2, r3, r4)
            return
    }

    public static native void nglPathStringNV(int r0, int r1, int r2, long r3);

    public static void glPathStringNV(@org.lwjgl.system.NativeType("GLuint") int r6, @org.lwjgl.system.NativeType("GLenum") int r7, @org.lwjgl.system.NativeType("void const *") java.nio.ByteBuffer r8) {
            r0 = r6
            r1 = r7
            r2 = r8
            int r2 = r2.remaining()
            r3 = r8
            long r3 = org.lwjgl.system.MemoryUtil.memAddress(r3)
            nglPathStringNV(r0, r1, r2, r3)
            return
    }

    public static native void nglPathGlyphsNV(int r0, int r1, long r2, int r4, int r5, int r6, long r7, int r9, int r10, float r11);

    public static void glPathGlyphsNV(@org.lwjgl.system.NativeType("GLuint") int r13, @org.lwjgl.system.NativeType("GLenum") int r14, @org.lwjgl.system.NativeType("void const *") java.nio.ByteBuffer r15, @org.lwjgl.system.NativeType("GLbitfield") int r16, @org.lwjgl.system.NativeType("GLenum") int r17, @org.lwjgl.system.NativeType("void const *") java.nio.ByteBuffer r18, @org.lwjgl.system.NativeType("GLenum") int r19, @org.lwjgl.system.NativeType("GLuint") int r20, @org.lwjgl.system.NativeType("GLfloat") float r21) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto La
            r0 = r15
            org.lwjgl.system.Checks.checkNT1(r0)
        La:
            r0 = r13
            r1 = r14
            r2 = r15
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            r3 = r16
            r4 = r18
            int r4 = r4.remaining()
            r5 = r17
            int r5 = charcodeTypeToBytes(r5)
            int r4 = r4 / r5
            r5 = r17
            r6 = r18
            long r6 = org.lwjgl.system.MemoryUtil.memAddress(r6)
            r7 = r19
            r8 = r20
            r9 = r21
            nglPathGlyphsNV(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9)
            return
    }

    public static native void nglPathGlyphRangeNV(int r0, int r1, long r2, int r4, int r5, int r6, int r7, int r8, float r9);

    public static void glPathGlyphRangeNV(@org.lwjgl.system.NativeType("GLuint") int r11, @org.lwjgl.system.NativeType("GLenum") int r12, @org.lwjgl.system.NativeType("void const *") java.nio.ByteBuffer r13, @org.lwjgl.system.NativeType("GLbitfield") int r14, @org.lwjgl.system.NativeType("GLuint") int r15, @org.lwjgl.system.NativeType("GLsizei") int r16, @org.lwjgl.system.NativeType("GLenum") int r17, @org.lwjgl.system.NativeType("GLuint") int r18, @org.lwjgl.system.NativeType("GLfloat") float r19) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto La
            r0 = r13
            org.lwjgl.system.Checks.checkNT1(r0)
        La:
            r0 = r11
            r1 = r12
            r2 = r13
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            r3 = r14
            r4 = r15
            r5 = r16
            r6 = r17
            r7 = r18
            r8 = r19
            nglPathGlyphRangeNV(r0, r1, r2, r3, r4, r5, r6, r7, r8)
            return
    }

    public static native int nglPathGlyphIndexArrayNV(int r0, int r1, long r2, int r4, int r5, int r6, int r7, float r8);

    @org.lwjgl.system.NativeType("GLenum")
    public static int glPathGlyphIndexArrayNV(@org.lwjgl.system.NativeType("GLuint") int r10, @org.lwjgl.system.NativeType("GLenum") int r11, @org.lwjgl.system.NativeType("void const *") java.nio.ByteBuffer r12, @org.lwjgl.system.NativeType("GLbitfield") int r13, @org.lwjgl.system.NativeType("GLuint") int r14, @org.lwjgl.system.NativeType("GLsizei") int r15, @org.lwjgl.system.NativeType("GLuint") int r16, @org.lwjgl.system.NativeType("GLfloat") float r17) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto La
            r0 = r12
            org.lwjgl.system.Checks.checkNT1(r0)
        La:
            r0 = r10
            r1 = r11
            r2 = r12
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            r3 = r13
            r4 = r14
            r5 = r15
            r6 = r16
            r7 = r17
            int r0 = nglPathGlyphIndexArrayNV(r0, r1, r2, r3, r4, r5, r6, r7)
            return r0
    }

    public static native int nglPathMemoryGlyphIndexArrayNV(int r0, int r1, long r2, long r4, int r6, int r7, int r8, int r9, float r10);

    @org.lwjgl.system.NativeType("GLenum")
    public static int glPathMemoryGlyphIndexArrayNV(@org.lwjgl.system.NativeType("GLuint") int r12, @org.lwjgl.system.NativeType("GLenum") int r13, @org.lwjgl.system.NativeType("void const *") java.nio.ByteBuffer r14, @org.lwjgl.system.NativeType("GLsizei") int r15, @org.lwjgl.system.NativeType("GLuint") int r16, @org.lwjgl.system.NativeType("GLsizei") int r17, @org.lwjgl.system.NativeType("GLuint") int r18, @org.lwjgl.system.NativeType("GLfloat") float r19) {
            r0 = r12
            r1 = r13
            r2 = r14
            int r2 = r2.remaining()
            long r2 = (long) r2
            r3 = r14
            long r3 = org.lwjgl.system.MemoryUtil.memAddress(r3)
            r4 = r15
            r5 = r16
            r6 = r17
            r7 = r18
            r8 = r19
            int r0 = nglPathMemoryGlyphIndexArrayNV(r0, r1, r2, r3, r4, r5, r6, r7, r8)
            return r0
    }

    public static native void glCopyPathNV(@org.lwjgl.system.NativeType("GLuint") int r0, @org.lwjgl.system.NativeType("GLuint") int r1);

    public static native void nglWeightPathsNV(int r0, int r1, long r2, long r4);

    public static void glWeightPathsNV(@org.lwjgl.system.NativeType("GLuint") int r7, @org.lwjgl.system.NativeType("GLuint const *") java.nio.IntBuffer r8, @org.lwjgl.system.NativeType("GLfloat const *") java.nio.FloatBuffer r9) {
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
            long r3 = org.lwjgl.system.MemoryUtil.memAddress(r3)
            nglWeightPathsNV(r0, r1, r2, r3)
            return
    }

    public static native void glInterpolatePathsNV(@org.lwjgl.system.NativeType("GLuint") int r0, @org.lwjgl.system.NativeType("GLuint") int r1, @org.lwjgl.system.NativeType("GLuint") int r2, @org.lwjgl.system.NativeType("GLfloat") float r3);

    public static native void nglTransformPathNV(int r0, int r1, int r2, long r3);

    public static void glTransformPathNV(@org.lwjgl.system.NativeType("GLuint") int r6, @org.lwjgl.system.NativeType("GLuint") int r7, @org.lwjgl.system.NativeType("GLenum") int r8, @org.lwjgl.system.NativeType("GLfloat const *") java.nio.FloatBuffer r9) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Le
            r0 = r9
            r1 = r8
            int r1 = transformTypeToElements(r1)
            org.lwjgl.system.Checks.check(r0, r1)
        Le:
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            long r3 = org.lwjgl.system.MemoryUtil.memAddress(r3)
            nglTransformPathNV(r0, r1, r2, r3)
            return
    }

    public static native void nglPathParameterivNV(int r0, int r1, long r2);

    public static void glPathParameterivNV(@org.lwjgl.system.NativeType("GLuint") int r5, @org.lwjgl.system.NativeType("GLenum") int r6, @org.lwjgl.system.NativeType("GLint const *") java.nio.IntBuffer r7) {
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
            nglPathParameterivNV(r0, r1, r2)
            return
    }

    public static native void glPathParameteriNV(@org.lwjgl.system.NativeType("GLuint") int r0, @org.lwjgl.system.NativeType("GLenum") int r1, @org.lwjgl.system.NativeType("GLint") int r2);

    public static native void nglPathParameterfvNV(int r0, int r1, long r2);

    public static void glPathParameterfvNV(@org.lwjgl.system.NativeType("GLuint") int r5, @org.lwjgl.system.NativeType("GLenum") int r6, @org.lwjgl.system.NativeType("GLfloat const *") java.nio.FloatBuffer r7) {
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
            nglPathParameterfvNV(r0, r1, r2)
            return
    }

    public static native void glPathParameterfNV(@org.lwjgl.system.NativeType("GLuint") int r0, @org.lwjgl.system.NativeType("GLenum") int r1, @org.lwjgl.system.NativeType("GLfloat") float r2);

    public static native void nglPathDashArrayNV(int r0, int r1, long r2);

    public static void glPathDashArrayNV(@org.lwjgl.system.NativeType("GLuint") int r5, @org.lwjgl.system.NativeType("GLfloat const *") java.nio.FloatBuffer r6) {
            r0 = r5
            r1 = r6
            int r1 = r1.remaining()
            r2 = r6
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            nglPathDashArrayNV(r0, r1, r2)
            return
    }

    @org.lwjgl.system.NativeType("GLuint")
    public static native int glGenPathsNV(@org.lwjgl.system.NativeType("GLsizei") int r0);

    public static native void glDeletePathsNV(@org.lwjgl.system.NativeType("GLuint") int r0, @org.lwjgl.system.NativeType("GLsizei") int r1);

    @org.lwjgl.system.NativeType("GLboolean")
    public static native boolean glIsPathNV(@org.lwjgl.system.NativeType("GLuint") int r0);

    public static native void glPathStencilFuncNV(@org.lwjgl.system.NativeType("GLenum") int r0, @org.lwjgl.system.NativeType("GLint") int r1, @org.lwjgl.system.NativeType("GLuint") int r2);

    public static native void glPathStencilDepthOffsetNV(@org.lwjgl.system.NativeType("GLfloat") float r0, @org.lwjgl.system.NativeType("GLfloat") float r1);

    public static native void glStencilFillPathNV(@org.lwjgl.system.NativeType("GLuint") int r0, @org.lwjgl.system.NativeType("GLenum") int r1, @org.lwjgl.system.NativeType("GLuint") int r2);

    public static native void glStencilStrokePathNV(@org.lwjgl.system.NativeType("GLuint") int r0, @org.lwjgl.system.NativeType("GLint") int r1, @org.lwjgl.system.NativeType("GLuint") int r2);

    public static native void nglStencilFillPathInstancedNV(int r0, int r1, long r2, int r4, int r5, int r6, int r7, long r8);

    public static void glStencilFillPathInstancedNV(@org.lwjgl.system.NativeType("GLenum") int r11, @org.lwjgl.system.NativeType("void const *") java.nio.ByteBuffer r12, @org.lwjgl.system.NativeType("GLuint") int r13, @org.lwjgl.system.NativeType("GLenum") int r14, @org.lwjgl.system.NativeType("GLuint") int r15, @org.lwjgl.system.NativeType("GLenum") int r16, @org.lwjgl.system.NativeType("GLfloat const *") java.nio.FloatBuffer r17) {
            r0 = r12
            int r0 = r0.remaining()
            r1 = r11
            int r1 = pathNameTypeToBytes(r1)
            int r0 = r0 / r1
            r18 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L1e
            r0 = r17
            r1 = r18
            r2 = r16
            int r2 = transformTypeToElements(r2)
            int r1 = r1 * r2
            org.lwjgl.system.Checks.check(r0, r1)
        L1e:
            r0 = r18
            r1 = r11
            r2 = r12
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            r3 = r13
            r4 = r14
            r5 = r15
            r6 = r16
            r7 = r17
            long r7 = org.lwjgl.system.MemoryUtil.memAddress(r7)
            nglStencilFillPathInstancedNV(r0, r1, r2, r3, r4, r5, r6, r7)
            return
    }

    public static native void nglStencilStrokePathInstancedNV(int r0, int r1, long r2, int r4, int r5, int r6, int r7, long r8);

    public static void glStencilStrokePathInstancedNV(@org.lwjgl.system.NativeType("GLenum") int r11, @org.lwjgl.system.NativeType("void const *") java.nio.ByteBuffer r12, @org.lwjgl.system.NativeType("GLuint") int r13, @org.lwjgl.system.NativeType("GLint") int r14, @org.lwjgl.system.NativeType("GLuint") int r15, @org.lwjgl.system.NativeType("GLenum") int r16, @org.lwjgl.system.NativeType("GLfloat const *") java.nio.FloatBuffer r17) {
            r0 = r12
            int r0 = r0.remaining()
            r1 = r11
            int r1 = pathNameTypeToBytes(r1)
            int r0 = r0 / r1
            r18 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L1e
            r0 = r17
            r1 = r18
            r2 = r16
            int r2 = transformTypeToElements(r2)
            int r1 = r1 * r2
            org.lwjgl.system.Checks.check(r0, r1)
        L1e:
            r0 = r18
            r1 = r11
            r2 = r12
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            r3 = r13
            r4 = r14
            r5 = r15
            r6 = r16
            r7 = r17
            long r7 = org.lwjgl.system.MemoryUtil.memAddress(r7)
            nglStencilStrokePathInstancedNV(r0, r1, r2, r3, r4, r5, r6, r7)
            return
    }

    public static native void glPathCoverDepthFuncNV(@org.lwjgl.system.NativeType("GLenum") int r0);

    public static native void nglPathColorGenNV(int r0, int r1, int r2, long r3);

    public static void glPathColorGenNV(@org.lwjgl.system.NativeType("GLenum") int r6, @org.lwjgl.system.NativeType("GLenum") int r7, @org.lwjgl.system.NativeType("GLenum") int r8, @org.lwjgl.system.NativeType("GLfloat const *") java.nio.FloatBuffer r9) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L13
            r0 = r9
            r1 = r7
            int r1 = genModeToElements(r1)
            r2 = r8
            int r2 = colorFormatToComponents(r2)
            int r1 = r1 * r2
            org.lwjgl.system.Checks.check(r0, r1)
        L13:
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            long r3 = org.lwjgl.system.MemoryUtil.memAddress(r3)
            nglPathColorGenNV(r0, r1, r2, r3)
            return
    }

    public static native void nglPathTexGenNV(int r0, int r1, int r2, long r3);

    public static void glPathTexGenNV(@org.lwjgl.system.NativeType("GLenum") int r6, @org.lwjgl.system.NativeType("GLenum") int r7, @org.lwjgl.system.NativeType("GLint") int r8, @org.lwjgl.system.NativeType("GLfloat const *") java.nio.FloatBuffer r9) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L10
            r0 = r9
            r1 = r7
            int r1 = genModeToElements(r1)
            r2 = r8
            int r1 = r1 * r2
            org.lwjgl.system.Checks.check(r0, r1)
        L10:
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            long r3 = org.lwjgl.system.MemoryUtil.memAddress(r3)
            nglPathTexGenNV(r0, r1, r2, r3)
            return
    }

    public static native void glPathFogGenNV(@org.lwjgl.system.NativeType("GLenum") int r0);

    public static native void glCoverFillPathNV(@org.lwjgl.system.NativeType("GLuint") int r0, @org.lwjgl.system.NativeType("GLenum") int r1);

    public static native void glCoverStrokePathNV(@org.lwjgl.system.NativeType("GLuint") int r0, @org.lwjgl.system.NativeType("GLenum") int r1);

    public static native void nglCoverFillPathInstancedNV(int r0, int r1, long r2, int r4, int r5, int r6, long r7);

    public static void glCoverFillPathInstancedNV(@org.lwjgl.system.NativeType("GLenum") int r10, @org.lwjgl.system.NativeType("void const *") java.nio.ByteBuffer r11, @org.lwjgl.system.NativeType("GLuint") int r12, @org.lwjgl.system.NativeType("GLenum") int r13, @org.lwjgl.system.NativeType("GLenum") int r14, @org.lwjgl.system.NativeType("GLfloat const *") java.nio.FloatBuffer r15) {
            r0 = r11
            int r0 = r0.remaining()
            r1 = r10
            int r1 = pathNameTypeToBytes(r1)
            int r0 = r0 / r1
            r16 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L1e
            r0 = r15
            r1 = r16
            r2 = r14
            int r2 = transformTypeToElements(r2)
            int r1 = r1 * r2
            org.lwjgl.system.Checks.check(r0, r1)
        L1e:
            r0 = r16
            r1 = r10
            r2 = r11
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            r3 = r12
            r4 = r13
            r5 = r14
            r6 = r15
            long r6 = org.lwjgl.system.MemoryUtil.memAddress(r6)
            nglCoverFillPathInstancedNV(r0, r1, r2, r3, r4, r5, r6)
            return
    }

    public static native void nglCoverStrokePathInstancedNV(int r0, int r1, long r2, int r4, int r5, int r6, long r7);

    public static void glCoverStrokePathInstancedNV(@org.lwjgl.system.NativeType("GLenum") int r10, @org.lwjgl.system.NativeType("void const *") java.nio.ByteBuffer r11, @org.lwjgl.system.NativeType("GLuint") int r12, @org.lwjgl.system.NativeType("GLenum") int r13, @org.lwjgl.system.NativeType("GLenum") int r14, @org.lwjgl.system.NativeType("GLfloat const *") java.nio.FloatBuffer r15) {
            r0 = r11
            int r0 = r0.remaining()
            r1 = r10
            int r1 = pathNameTypeToBytes(r1)
            int r0 = r0 / r1
            r16 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L1e
            r0 = r15
            r1 = r16
            r2 = r14
            int r2 = transformTypeToElements(r2)
            int r1 = r1 * r2
            org.lwjgl.system.Checks.check(r0, r1)
        L1e:
            r0 = r16
            r1 = r10
            r2 = r11
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            r3 = r12
            r4 = r13
            r5 = r14
            r6 = r15
            long r6 = org.lwjgl.system.MemoryUtil.memAddress(r6)
            nglCoverStrokePathInstancedNV(r0, r1, r2, r3, r4, r5, r6)
            return
    }

    public static native void glStencilThenCoverFillPathNV(@org.lwjgl.system.NativeType("GLuint") int r0, @org.lwjgl.system.NativeType("GLenum") int r1, @org.lwjgl.system.NativeType("GLuint") int r2, @org.lwjgl.system.NativeType("GLenum") int r3);

    public static native void glStencilThenCoverStrokePathNV(@org.lwjgl.system.NativeType("GLuint") int r0, @org.lwjgl.system.NativeType("GLint") int r1, @org.lwjgl.system.NativeType("GLuint") int r2, @org.lwjgl.system.NativeType("GLenum") int r3);

    public static native void nglStencilThenCoverFillPathInstancedNV(int r0, int r1, long r2, int r4, int r5, int r6, int r7, int r8, long r9);

    public static void glStencilThenCoverFillPathInstancedNV(@org.lwjgl.system.NativeType("GLenum") int r12, @org.lwjgl.system.NativeType("void const *") java.nio.ByteBuffer r13, @org.lwjgl.system.NativeType("GLuint") int r14, @org.lwjgl.system.NativeType("GLenum") int r15, @org.lwjgl.system.NativeType("GLuint") int r16, @org.lwjgl.system.NativeType("GLenum") int r17, @org.lwjgl.system.NativeType("GLenum") int r18, @org.lwjgl.system.NativeType("GLfloat const *") java.nio.FloatBuffer r19) {
            r0 = r13
            int r0 = r0.remaining()
            r1 = r12
            int r1 = pathNameTypeToBytes(r1)
            int r0 = r0 / r1
            r20 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L1e
            r0 = r19
            r1 = r20
            r2 = r18
            int r2 = transformTypeToElements(r2)
            int r1 = r1 * r2
            org.lwjgl.system.Checks.check(r0, r1)
        L1e:
            r0 = r20
            r1 = r12
            r2 = r13
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            r3 = r14
            r4 = r15
            r5 = r16
            r6 = r17
            r7 = r18
            r8 = r19
            long r8 = org.lwjgl.system.MemoryUtil.memAddress(r8)
            nglStencilThenCoverFillPathInstancedNV(r0, r1, r2, r3, r4, r5, r6, r7, r8)
            return
    }

    public static native void nglStencilThenCoverStrokePathInstancedNV(int r0, int r1, long r2, int r4, int r5, int r6, int r7, int r8, long r9);

    public static void glStencilThenCoverStrokePathInstancedNV(@org.lwjgl.system.NativeType("GLenum") int r12, @org.lwjgl.system.NativeType("void const *") java.nio.ByteBuffer r13, @org.lwjgl.system.NativeType("GLuint") int r14, @org.lwjgl.system.NativeType("GLint") int r15, @org.lwjgl.system.NativeType("GLuint") int r16, @org.lwjgl.system.NativeType("GLenum") int r17, @org.lwjgl.system.NativeType("GLenum") int r18, @org.lwjgl.system.NativeType("GLfloat const *") java.nio.FloatBuffer r19) {
            r0 = r13
            int r0 = r0.remaining()
            r1 = r12
            int r1 = pathNameTypeToBytes(r1)
            int r0 = r0 / r1
            r20 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L1e
            r0 = r19
            r1 = r20
            r2 = r18
            int r2 = transformTypeToElements(r2)
            int r1 = r1 * r2
            org.lwjgl.system.Checks.check(r0, r1)
        L1e:
            r0 = r20
            r1 = r12
            r2 = r13
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            r3 = r14
            r4 = r15
            r5 = r16
            r6 = r17
            r7 = r18
            r8 = r19
            long r8 = org.lwjgl.system.MemoryUtil.memAddress(r8)
            nglStencilThenCoverStrokePathInstancedNV(r0, r1, r2, r3, r4, r5, r6, r7, r8)
            return
    }

    public static native int nglPathGlyphIndexRangeNV(int r0, long r1, int r3, int r4, float r5, long r6);

    @org.lwjgl.system.NativeType("GLenum")
    public static int glPathGlyphIndexRangeNV(@org.lwjgl.system.NativeType("GLenum") int r9, @org.lwjgl.system.NativeType("void const *") java.nio.ByteBuffer r10, @org.lwjgl.system.NativeType("GLbitfield") int r11, @org.lwjgl.system.NativeType("GLuint") int r12, @org.lwjgl.system.NativeType("GLfloat") float r13, @org.lwjgl.system.NativeType("GLuint *") java.nio.IntBuffer r14) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L10
            r0 = r10
            org.lwjgl.system.Checks.checkNT1(r0)
            r0 = r14
            r1 = 2
            org.lwjgl.system.Checks.check(r0, r1)
        L10:
            r0 = r9
            r1 = r10
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            r2 = r11
            r3 = r12
            r4 = r13
            r5 = r14
            long r5 = org.lwjgl.system.MemoryUtil.memAddress(r5)
            int r0 = nglPathGlyphIndexRangeNV(r0, r1, r2, r3, r4, r5)
            return r0
    }

    public static native void nglProgramPathFragmentInputGenNV(int r0, int r1, int r2, int r3, long r4);

    public static void glProgramPathFragmentInputGenNV(@org.lwjgl.system.NativeType("GLuint") int r7, @org.lwjgl.system.NativeType("GLint") int r8, @org.lwjgl.system.NativeType("GLenum") int r9, @org.lwjgl.system.NativeType("GLint") int r10, @org.lwjgl.system.NativeType("GLfloat const *") java.nio.FloatBuffer r11) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L11
            r0 = r11
            r1 = r9
            int r1 = genModeToElements(r1)
            r2 = r10
            int r1 = r1 * r2
            org.lwjgl.system.Checks.check(r0, r1)
        L11:
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            long r4 = org.lwjgl.system.MemoryUtil.memAddress(r4)
            nglProgramPathFragmentInputGenNV(r0, r1, r2, r3, r4)
            return
    }

    public static native void nglGetPathParameterivNV(int r0, int r1, long r2);

    public static void glGetPathParameterivNV(@org.lwjgl.system.NativeType("GLuint") int r5, @org.lwjgl.system.NativeType("GLenum") int r6, @org.lwjgl.system.NativeType("GLint *") java.nio.IntBuffer r7) {
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
            nglGetPathParameterivNV(r0, r1, r2)
            return
    }

    @org.lwjgl.system.NativeType("void")
    public static int glGetPathParameteriNV(@org.lwjgl.system.NativeType("GLuint") int r5, @org.lwjgl.system.NativeType("GLenum") int r6) {
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
            nglGetPathParameterivNV(r0, r1, r2)     // Catch: java.lang.Throwable -> L2a
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

    public static native void nglGetPathParameterfvNV(int r0, int r1, long r2);

    public static void glGetPathParameterfvNV(@org.lwjgl.system.NativeType("GLuint") int r5, @org.lwjgl.system.NativeType("GLenum") int r6, @org.lwjgl.system.NativeType("GLfloat *") java.nio.FloatBuffer r7) {
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
            nglGetPathParameterfvNV(r0, r1, r2)
            return
    }

    @org.lwjgl.system.NativeType("void")
    public static float glGetPathParameterfNV(@org.lwjgl.system.NativeType("GLuint") int r5, @org.lwjgl.system.NativeType("GLenum") int r6) {
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
            nglGetPathParameterfvNV(r0, r1, r2)     // Catch: java.lang.Throwable -> L2a
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

    public static native void nglGetPathCommandsNV(int r0, long r1);

    public static void glGetPathCommandsNV(@org.lwjgl.system.NativeType("GLuint") int r4, @org.lwjgl.system.NativeType("GLubyte *") java.nio.ByteBuffer r5) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L16
            boolean r0 = org.lwjgl.system.Checks.DEBUG
            if (r0 == 0) goto L16
            r0 = r5
            r1 = r4
            r2 = 37021(0x909d, float:5.1877E-41)
            int r1 = glGetPathParameteriNV(r1, r2)
            org.lwjgl.system.Checks.check(r0, r1)
        L16:
            r0 = r4
            r1 = r5
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            nglGetPathCommandsNV(r0, r1)
            return
    }

    public static native void nglGetPathCoordsNV(int r0, long r1);

    public static void glGetPathCoordsNV(@org.lwjgl.system.NativeType("GLuint") int r4, @org.lwjgl.system.NativeType("GLfloat *") java.nio.FloatBuffer r5) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L16
            boolean r0 = org.lwjgl.system.Checks.DEBUG
            if (r0 == 0) goto L16
            r0 = r5
            r1 = r4
            r2 = 37022(0x909e, float:5.1879E-41)
            int r1 = glGetPathParameteriNV(r1, r2)
            org.lwjgl.system.Checks.check(r0, r1)
        L16:
            r0 = r4
            r1 = r5
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            nglGetPathCoordsNV(r0, r1)
            return
    }

    public static native void nglGetPathDashArrayNV(int r0, long r1);

    public static void glGetPathDashArrayNV(@org.lwjgl.system.NativeType("GLuint") int r4, @org.lwjgl.system.NativeType("GLfloat *") java.nio.FloatBuffer r5) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L16
            boolean r0 = org.lwjgl.system.Checks.DEBUG
            if (r0 == 0) goto L16
            r0 = r5
            r1 = r4
            r2 = 37023(0x909f, float:5.188E-41)
            int r1 = glGetPathParameteriNV(r1, r2)
            org.lwjgl.system.Checks.check(r0, r1)
        L16:
            r0 = r4
            r1 = r5
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            nglGetPathDashArrayNV(r0, r1)
            return
    }

    public static native void nglGetPathMetricsNV(int r0, int r1, int r2, long r3, int r5, int r6, long r7);

    public static void glGetPathMetricsNV(@org.lwjgl.system.NativeType("GLbitfield") int r10, @org.lwjgl.system.NativeType("GLenum") int r11, @org.lwjgl.system.NativeType("void const *") java.nio.ByteBuffer r12, @org.lwjgl.system.NativeType("GLuint") int r13, @org.lwjgl.system.NativeType("GLsizei") int r14, @org.lwjgl.system.NativeType("GLfloat *") java.nio.FloatBuffer r15) {
            r0 = r12
            int r0 = r0.remaining()
            r1 = r11
            int r1 = pathNameTypeToBytes(r1)
            int r0 = r0 / r1
            r16 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L29
            r0 = r15
            r1 = r16
            r2 = r14
            if (r2 != 0) goto L21
            r2 = r10
            int r2 = java.lang.Integer.bitCount(r2)
            goto L25
        L21:
            r2 = r14
            r3 = 2
            int r2 = r2 >> r3
        L25:
            int r1 = r1 * r2
            org.lwjgl.system.Checks.check(r0, r1)
        L29:
            r0 = r10
            r1 = r16
            r2 = r11
            r3 = r12
            long r3 = org.lwjgl.system.MemoryUtil.memAddress(r3)
            r4 = r13
            r5 = r14
            r6 = r15
            long r6 = org.lwjgl.system.MemoryUtil.memAddress(r6)
            nglGetPathMetricsNV(r0, r1, r2, r3, r4, r5, r6)
            return
    }

    public static native void nglGetPathMetricRangeNV(int r0, int r1, int r2, int r3, long r4);

    public static void glGetPathMetricRangeNV(@org.lwjgl.system.NativeType("GLbitfield") int r7, @org.lwjgl.system.NativeType("GLuint") int r8, @org.lwjgl.system.NativeType("GLsizei") int r9, @org.lwjgl.system.NativeType("GLsizei") int r10, @org.lwjgl.system.NativeType("GLfloat *") java.nio.FloatBuffer r11) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L1b
            r0 = r11
            r1 = r9
            r2 = r10
            if (r2 != 0) goto L14
            r2 = r7
            int r2 = java.lang.Integer.bitCount(r2)
            goto L17
        L14:
            r2 = r10
            r3 = 2
            int r2 = r2 >> r3
        L17:
            int r1 = r1 * r2
            org.lwjgl.system.Checks.check(r0, r1)
        L1b:
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            long r4 = org.lwjgl.system.MemoryUtil.memAddress(r4)
            nglGetPathMetricRangeNV(r0, r1, r2, r3, r4)
            return
    }

    public static native void nglGetPathSpacingNV(int r0, int r1, int r2, long r3, int r5, float r6, float r7, int r8, long r9);

    public static void glGetPathSpacingNV(@org.lwjgl.system.NativeType("GLenum") int r12, @org.lwjgl.system.NativeType("GLenum") int r13, @org.lwjgl.system.NativeType("void const *") java.nio.ByteBuffer r14, @org.lwjgl.system.NativeType("GLuint") int r15, @org.lwjgl.system.NativeType("GLfloat") float r16, @org.lwjgl.system.NativeType("GLfloat") float r17, @org.lwjgl.system.NativeType("GLenum") int r18, @org.lwjgl.system.NativeType("GLfloat *") java.nio.FloatBuffer r19) {
            r0 = r14
            int r0 = r0.remaining()
            r1 = r13
            int r1 = pathNameTypeToBytes(r1)
            int r0 = r0 / r1
            r20 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L27
            r0 = r19
            r1 = r20
            r2 = 1
            int r1 = r1 - r2
            r2 = r18
            r3 = 37006(0x908e, float:5.1856E-41)
            if (r2 != r3) goto L22
            r2 = 1
            goto L23
        L22:
            r2 = 2
        L23:
            int r1 = r1 * r2
            org.lwjgl.system.Checks.check(r0, r1)
        L27:
            r0 = r12
            r1 = r20
            r2 = r13
            r3 = r14
            long r3 = org.lwjgl.system.MemoryUtil.memAddress(r3)
            r4 = r15
            r5 = r16
            r6 = r17
            r7 = r18
            r8 = r19
            long r8 = org.lwjgl.system.MemoryUtil.memAddress(r8)
            nglGetPathSpacingNV(r0, r1, r2, r3, r4, r5, r6, r7, r8)
            return
    }

    public static native void nglGetPathColorGenivNV(int r0, int r1, long r2);

    public static void glGetPathColorGenivNV(@org.lwjgl.system.NativeType("GLenum") int r5, @org.lwjgl.system.NativeType("GLenum") int r6, @org.lwjgl.system.NativeType("GLint *") java.nio.IntBuffer r7) {
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
            nglGetPathColorGenivNV(r0, r1, r2)
            return
    }

    @org.lwjgl.system.NativeType("void")
    public static int glGetPathColorGeniNV(@org.lwjgl.system.NativeType("GLenum") int r5, @org.lwjgl.system.NativeType("GLenum") int r6) {
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
            nglGetPathColorGenivNV(r0, r1, r2)     // Catch: java.lang.Throwable -> L2a
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

    public static native void nglGetPathColorGenfvNV(int r0, int r1, long r2);

    public static void glGetPathColorGenfvNV(@org.lwjgl.system.NativeType("GLenum") int r5, @org.lwjgl.system.NativeType("GLenum") int r6, @org.lwjgl.system.NativeType("GLfloat *") java.nio.FloatBuffer r7) {
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
            nglGetPathColorGenfvNV(r0, r1, r2)
            return
    }

    @org.lwjgl.system.NativeType("void")
    public static float glGetPathColorGenfNV(@org.lwjgl.system.NativeType("GLenum") int r5, @org.lwjgl.system.NativeType("GLenum") int r6) {
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
            nglGetPathColorGenfvNV(r0, r1, r2)     // Catch: java.lang.Throwable -> L2a
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

    public static native void nglGetPathTexGenivNV(int r0, int r1, long r2);

    public static void glGetPathTexGenivNV(@org.lwjgl.system.NativeType("GLenum") int r5, @org.lwjgl.system.NativeType("GLenum") int r6, @org.lwjgl.system.NativeType("GLint *") java.nio.IntBuffer r7) {
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
            nglGetPathTexGenivNV(r0, r1, r2)
            return
    }

    @org.lwjgl.system.NativeType("void")
    public static int glGetPathTexGeniNV(@org.lwjgl.system.NativeType("GLenum") int r5, @org.lwjgl.system.NativeType("GLenum") int r6) {
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
            nglGetPathTexGenivNV(r0, r1, r2)     // Catch: java.lang.Throwable -> L2a
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

    public static native void nglGetPathTexGenfvNV(int r0, int r1, long r2);

    public static void glGetPathTexGenfvNV(@org.lwjgl.system.NativeType("GLenum") int r5, @org.lwjgl.system.NativeType("GLenum") int r6, @org.lwjgl.system.NativeType("GLfloat *") java.nio.FloatBuffer r7) {
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
            nglGetPathTexGenfvNV(r0, r1, r2)
            return
    }

    @org.lwjgl.system.NativeType("void")
    public static float glGetPathTexGenfNV(@org.lwjgl.system.NativeType("GLenum") int r5, @org.lwjgl.system.NativeType("GLenum") int r6) {
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
            nglGetPathTexGenfvNV(r0, r1, r2)     // Catch: java.lang.Throwable -> L2a
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

    @org.lwjgl.system.NativeType("GLboolean")
    public static native boolean glIsPointInFillPathNV(@org.lwjgl.system.NativeType("GLuint") int r0, @org.lwjgl.system.NativeType("GLuint") int r1, @org.lwjgl.system.NativeType("GLfloat") float r2, @org.lwjgl.system.NativeType("GLfloat") float r3);

    @org.lwjgl.system.NativeType("GLboolean")
    public static native boolean glIsPointInStrokePathNV(@org.lwjgl.system.NativeType("GLuint") int r0, @org.lwjgl.system.NativeType("GLfloat") float r1, @org.lwjgl.system.NativeType("GLfloat") float r2);

    @org.lwjgl.system.NativeType("GLfloat")
    public static native float glGetPathLengthNV(@org.lwjgl.system.NativeType("GLuint") int r0, @org.lwjgl.system.NativeType("GLsizei") int r1, @org.lwjgl.system.NativeType("GLsizei") int r2);

    public static native boolean nglPointAlongPathNV(int r0, int r1, int r2, float r3, long r4, long r6, long r8, long r10);

    @org.lwjgl.system.NativeType("GLboolean")
    public static boolean glPointAlongPathNV(@org.lwjgl.system.NativeType("GLuint") int r13, @org.lwjgl.system.NativeType("GLsizei") int r14, @org.lwjgl.system.NativeType("GLsizei") int r15, @org.lwjgl.system.NativeType("GLfloat") float r16, @javax.annotation.Nullable @org.lwjgl.system.NativeType("GLfloat *") java.nio.FloatBuffer r17, @javax.annotation.Nullable @org.lwjgl.system.NativeType("GLfloat *") java.nio.FloatBuffer r18, @javax.annotation.Nullable @org.lwjgl.system.NativeType("GLfloat *") java.nio.FloatBuffer r19, @javax.annotation.Nullable @org.lwjgl.system.NativeType("GLfloat *") java.nio.FloatBuffer r20) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L1e
            r0 = r17
            r1 = 1
            org.lwjgl.system.Checks.checkSafe(r0, r1)
            r0 = r18
            r1 = 1
            org.lwjgl.system.Checks.checkSafe(r0, r1)
            r0 = r19
            r1 = 1
            org.lwjgl.system.Checks.checkSafe(r0, r1)
            r0 = r20
            r1 = 1
            org.lwjgl.system.Checks.checkSafe(r0, r1)
        L1e:
            r0 = r13
            r1 = r14
            r2 = r15
            r3 = r16
            r4 = r17
            long r4 = org.lwjgl.system.MemoryUtil.memAddressSafe(r4)
            r5 = r18
            long r5 = org.lwjgl.system.MemoryUtil.memAddressSafe(r5)
            r6 = r19
            long r6 = org.lwjgl.system.MemoryUtil.memAddressSafe(r6)
            r7 = r20
            long r7 = org.lwjgl.system.MemoryUtil.memAddressSafe(r7)
            boolean r0 = nglPointAlongPathNV(r0, r1, r2, r3, r4, r5, r6, r7)
            return r0
    }

    public static native void nglMatrixLoad3x2fNV(int r0, long r1);

    public static void glMatrixLoad3x2fNV(@org.lwjgl.system.NativeType("GLenum") int r4, @org.lwjgl.system.NativeType("GLfloat const *") java.nio.FloatBuffer r5) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lc
            r0 = r5
            r1 = 6
            org.lwjgl.system.Checks.check(r0, r1)
        Lc:
            r0 = r4
            r1 = r5
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            nglMatrixLoad3x2fNV(r0, r1)
            return
    }

    public static native void nglMatrixLoad3x3fNV(int r0, long r1);

    public static void glMatrixLoad3x3fNV(@org.lwjgl.system.NativeType("GLenum") int r4, @org.lwjgl.system.NativeType("GLfloat const *") java.nio.FloatBuffer r5) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lc
            r0 = r5
            r1 = 9
            org.lwjgl.system.Checks.check(r0, r1)
        Lc:
            r0 = r4
            r1 = r5
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            nglMatrixLoad3x3fNV(r0, r1)
            return
    }

    public static native void nglMatrixLoadTranspose3x3fNV(int r0, long r1);

    public static void glMatrixLoadTranspose3x3fNV(@org.lwjgl.system.NativeType("GLenum") int r4, @org.lwjgl.system.NativeType("GLfloat const *") java.nio.FloatBuffer r5) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lc
            r0 = r5
            r1 = 9
            org.lwjgl.system.Checks.check(r0, r1)
        Lc:
            r0 = r4
            r1 = r5
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            nglMatrixLoadTranspose3x3fNV(r0, r1)
            return
    }

    public static native void nglMatrixMult3x2fNV(int r0, long r1);

    public static void glMatrixMult3x2fNV(@org.lwjgl.system.NativeType("GLenum") int r4, @org.lwjgl.system.NativeType("GLfloat const *") java.nio.FloatBuffer r5) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lc
            r0 = r5
            r1 = 6
            org.lwjgl.system.Checks.check(r0, r1)
        Lc:
            r0 = r4
            r1 = r5
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            nglMatrixMult3x2fNV(r0, r1)
            return
    }

    public static native void nglMatrixMult3x3fNV(int r0, long r1);

    public static void glMatrixMult3x3fNV(@org.lwjgl.system.NativeType("GLenum") int r4, @org.lwjgl.system.NativeType("GLfloat const *") java.nio.FloatBuffer r5) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lc
            r0 = r5
            r1 = 9
            org.lwjgl.system.Checks.check(r0, r1)
        Lc:
            r0 = r4
            r1 = r5
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            nglMatrixMult3x3fNV(r0, r1)
            return
    }

    public static native void nglMatrixMultTranspose3x3fNV(int r0, long r1);

    public static void glMatrixMultTranspose3x3fNV(@org.lwjgl.system.NativeType("GLenum") int r4, @org.lwjgl.system.NativeType("GLfloat const *") java.nio.FloatBuffer r5) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lc
            r0 = r5
            r1 = 9
            org.lwjgl.system.Checks.check(r0, r1)
        Lc:
            r0 = r4
            r1 = r5
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            nglMatrixMultTranspose3x3fNV(r0, r1)
            return
    }

    public static native void nglGetProgramResourcefvNV(int r0, int r1, int r2, int r3, long r4, int r6, long r7, long r9);

    public static void glGetProgramResourcefvNV(@org.lwjgl.system.NativeType("GLuint") int r12, @org.lwjgl.system.NativeType("GLenum") int r13, @org.lwjgl.system.NativeType("GLuint") int r14, @org.lwjgl.system.NativeType("GLenum const *") java.nio.IntBuffer r15, @javax.annotation.Nullable @org.lwjgl.system.NativeType("GLsizei *") java.nio.IntBuffer r16, @org.lwjgl.system.NativeType("GLfloat *") java.nio.FloatBuffer r17) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lc
            r0 = r16
            r1 = 1
            org.lwjgl.system.Checks.checkSafe(r0, r1)
        Lc:
            r0 = r12
            r1 = r13
            r2 = r14
            r3 = r15
            int r3 = r3.remaining()
            r4 = r15
            long r4 = org.lwjgl.system.MemoryUtil.memAddress(r4)
            r5 = r17
            int r5 = r5.remaining()
            r6 = r16
            long r6 = org.lwjgl.system.MemoryUtil.memAddressSafe(r6)
            r7 = r17
            long r7 = org.lwjgl.system.MemoryUtil.memAddress(r7)
            nglGetProgramResourcefvNV(r0, r1, r2, r3, r4, r5, r6, r7)
            return
    }

    public static void glPathCommandsNV(@org.lwjgl.system.NativeType("GLuint") int r10, @org.lwjgl.system.NativeType("GLubyte const *") java.nio.ByteBuffer r11, @org.lwjgl.system.NativeType("GLenum") int r12, @org.lwjgl.system.NativeType("void const *") short[] r13) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glPathCommandsNV
            r14 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L14
            r0 = r14
            long r0 = org.lwjgl.system.Checks.check(r0)
        L14:
            r0 = r10
            r1 = r11
            int r1 = r1.remaining()
            r2 = r11
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            r3 = r13
            int r3 = r3.length
            r4 = r12
            r5 = r13
            r6 = r14
            org.lwjgl.system.JNI.callPPV(r0, r1, r2, r3, r4, r5, r6)
            return
    }

    public static void glPathCommandsNV(@org.lwjgl.system.NativeType("GLuint") int r10, @org.lwjgl.system.NativeType("GLubyte const *") java.nio.ByteBuffer r11, @org.lwjgl.system.NativeType("GLenum") int r12, @org.lwjgl.system.NativeType("void const *") float[] r13) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glPathCommandsNV
            r14 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L14
            r0 = r14
            long r0 = org.lwjgl.system.Checks.check(r0)
        L14:
            r0 = r10
            r1 = r11
            int r1 = r1.remaining()
            r2 = r11
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            r3 = r13
            int r3 = r3.length
            r4 = r12
            r5 = r13
            r6 = r14
            org.lwjgl.system.JNI.callPPV(r0, r1, r2, r3, r4, r5, r6)
            return
    }

    public static void glPathCoordsNV(@org.lwjgl.system.NativeType("GLuint") int r7, @org.lwjgl.system.NativeType("GLenum") int r8, @org.lwjgl.system.NativeType("void const *") short[] r9) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glPathCoordsNV
            r10 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L12
            r0 = r10
            long r0 = org.lwjgl.system.Checks.check(r0)
        L12:
            r0 = r7
            r1 = r9
            int r1 = r1.length
            r2 = r8
            r3 = r9
            r4 = r10
            org.lwjgl.system.JNI.callPV(r0, r1, r2, r3, r4)
            return
    }

    public static void glPathCoordsNV(@org.lwjgl.system.NativeType("GLuint") int r7, @org.lwjgl.system.NativeType("GLenum") int r8, @org.lwjgl.system.NativeType("void const *") float[] r9) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glPathCoordsNV
            r10 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L12
            r0 = r10
            long r0 = org.lwjgl.system.Checks.check(r0)
        L12:
            r0 = r7
            r1 = r9
            int r1 = r1.length
            r2 = r8
            r3 = r9
            r4 = r10
            org.lwjgl.system.JNI.callPV(r0, r1, r2, r3, r4)
            return
    }

    public static void glPathSubCommandsNV(@org.lwjgl.system.NativeType("GLuint") int r12, @org.lwjgl.system.NativeType("GLsizei") int r13, @org.lwjgl.system.NativeType("GLsizei") int r14, @org.lwjgl.system.NativeType("GLubyte const *") java.nio.ByteBuffer r15, @org.lwjgl.system.NativeType("GLenum") int r16, @org.lwjgl.system.NativeType("void const *") short[] r17) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glPathSubCommandsNV
            r18 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L14
            r0 = r18
            long r0 = org.lwjgl.system.Checks.check(r0)
        L14:
            r0 = r12
            r1 = r13
            r2 = r14
            r3 = r15
            int r3 = r3.remaining()
            r4 = r15
            long r4 = org.lwjgl.system.MemoryUtil.memAddress(r4)
            r5 = r17
            int r5 = r5.length
            r6 = r16
            r7 = r17
            r8 = r18
            org.lwjgl.system.JNI.callPPV(r0, r1, r2, r3, r4, r5, r6, r7, r8)
            return
    }

    public static void glPathSubCommandsNV(@org.lwjgl.system.NativeType("GLuint") int r12, @org.lwjgl.system.NativeType("GLsizei") int r13, @org.lwjgl.system.NativeType("GLsizei") int r14, @org.lwjgl.system.NativeType("GLubyte const *") java.nio.ByteBuffer r15, @org.lwjgl.system.NativeType("GLenum") int r16, @org.lwjgl.system.NativeType("void const *") float[] r17) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glPathSubCommandsNV
            r18 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L14
            r0 = r18
            long r0 = org.lwjgl.system.Checks.check(r0)
        L14:
            r0 = r12
            r1 = r13
            r2 = r14
            r3 = r15
            int r3 = r3.remaining()
            r4 = r15
            long r4 = org.lwjgl.system.MemoryUtil.memAddress(r4)
            r5 = r17
            int r5 = r5.length
            r6 = r16
            r7 = r17
            r8 = r18
            org.lwjgl.system.JNI.callPPV(r0, r1, r2, r3, r4, r5, r6, r7, r8)
            return
    }

    public static void glPathSubCoordsNV(@org.lwjgl.system.NativeType("GLuint") int r8, @org.lwjgl.system.NativeType("GLsizei") int r9, @org.lwjgl.system.NativeType("GLenum") int r10, @org.lwjgl.system.NativeType("void const *") short[] r11) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glPathSubCoordsNV
            r12 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L14
            r0 = r12
            long r0 = org.lwjgl.system.Checks.check(r0)
        L14:
            r0 = r8
            r1 = r9
            r2 = r11
            int r2 = r2.length
            r3 = r10
            r4 = r11
            r5 = r12
            org.lwjgl.system.JNI.callPV(r0, r1, r2, r3, r4, r5)
            return
    }

    public static void glPathSubCoordsNV(@org.lwjgl.system.NativeType("GLuint") int r8, @org.lwjgl.system.NativeType("GLsizei") int r9, @org.lwjgl.system.NativeType("GLenum") int r10, @org.lwjgl.system.NativeType("void const *") float[] r11) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glPathSubCoordsNV
            r12 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L14
            r0 = r12
            long r0 = org.lwjgl.system.Checks.check(r0)
        L14:
            r0 = r8
            r1 = r9
            r2 = r11
            int r2 = r2.length
            r3 = r10
            r4 = r11
            r5 = r12
            org.lwjgl.system.JNI.callPV(r0, r1, r2, r3, r4, r5)
            return
    }

    public static void glWeightPathsNV(@org.lwjgl.system.NativeType("GLuint") int r7, @org.lwjgl.system.NativeType("GLuint const *") int[] r8, @org.lwjgl.system.NativeType("GLfloat const *") float[] r9) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glWeightPathsNV
            r10 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L18
            r0 = r10
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r9
            r1 = r8
            int r1 = r1.length
            org.lwjgl.system.Checks.check(r0, r1)
        L18:
            r0 = r7
            r1 = r8
            int r1 = r1.length
            r2 = r8
            r3 = r9
            r4 = r10
            org.lwjgl.system.JNI.callPPV(r0, r1, r2, r3, r4)
            return
    }

    public static void glTransformPathNV(@org.lwjgl.system.NativeType("GLuint") int r7, @org.lwjgl.system.NativeType("GLuint") int r8, @org.lwjgl.system.NativeType("GLenum") int r9, @org.lwjgl.system.NativeType("GLfloat const *") float[] r10) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glTransformPathNV
            r11 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L1c
            r0 = r11
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r10
            r1 = r9
            int r1 = transformTypeToElements(r1)
            org.lwjgl.system.Checks.check(r0, r1)
        L1c:
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            org.lwjgl.system.JNI.callPV(r0, r1, r2, r3, r4)
            return
    }

    public static void glPathParameterivNV(@org.lwjgl.system.NativeType("GLuint") int r6, @org.lwjgl.system.NativeType("GLenum") int r7, @org.lwjgl.system.NativeType("GLint const *") int[] r8) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glPathParameterivNV
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

    public static void glPathParameterfvNV(@org.lwjgl.system.NativeType("GLuint") int r6, @org.lwjgl.system.NativeType("GLenum") int r7, @org.lwjgl.system.NativeType("GLfloat const *") float[] r8) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glPathParameterfvNV
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

    public static void glPathDashArrayNV(@org.lwjgl.system.NativeType("GLuint") int r6, @org.lwjgl.system.NativeType("GLfloat const *") float[] r7) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glPathDashArrayNV
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

    public static void glStencilFillPathInstancedNV(@org.lwjgl.system.NativeType("GLenum") int r12, @org.lwjgl.system.NativeType("void const *") java.nio.ByteBuffer r13, @org.lwjgl.system.NativeType("GLuint") int r14, @org.lwjgl.system.NativeType("GLenum") int r15, @org.lwjgl.system.NativeType("GLuint") int r16, @org.lwjgl.system.NativeType("GLenum") int r17, @org.lwjgl.system.NativeType("GLfloat const *") float[] r18) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glStencilFillPathInstancedNV
            r19 = r0
            r0 = r13
            int r0 = r0.remaining()
            r1 = r12
            int r1 = pathNameTypeToBytes(r1)
            int r0 = r0 / r1
            r21 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L2c
            r0 = r19
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r18
            r1 = r21
            r2 = r17
            int r2 = transformTypeToElements(r2)
            int r1 = r1 * r2
            org.lwjgl.system.Checks.check(r0, r1)
        L2c:
            r0 = r21
            r1 = r12
            r2 = r13
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            r3 = r14
            r4 = r15
            r5 = r16
            r6 = r17
            r7 = r18
            r8 = r19
            org.lwjgl.system.JNI.callPPV(r0, r1, r2, r3, r4, r5, r6, r7, r8)
            return
    }

    public static void glStencilStrokePathInstancedNV(@org.lwjgl.system.NativeType("GLenum") int r12, @org.lwjgl.system.NativeType("void const *") java.nio.ByteBuffer r13, @org.lwjgl.system.NativeType("GLuint") int r14, @org.lwjgl.system.NativeType("GLint") int r15, @org.lwjgl.system.NativeType("GLuint") int r16, @org.lwjgl.system.NativeType("GLenum") int r17, @org.lwjgl.system.NativeType("GLfloat const *") float[] r18) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glStencilStrokePathInstancedNV
            r19 = r0
            r0 = r13
            int r0 = r0.remaining()
            r1 = r12
            int r1 = pathNameTypeToBytes(r1)
            int r0 = r0 / r1
            r21 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L2c
            r0 = r19
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r18
            r1 = r21
            r2 = r17
            int r2 = transformTypeToElements(r2)
            int r1 = r1 * r2
            org.lwjgl.system.Checks.check(r0, r1)
        L2c:
            r0 = r21
            r1 = r12
            r2 = r13
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            r3 = r14
            r4 = r15
            r5 = r16
            r6 = r17
            r7 = r18
            r8 = r19
            org.lwjgl.system.JNI.callPPV(r0, r1, r2, r3, r4, r5, r6, r7, r8)
            return
    }

    public static void glPathColorGenNV(@org.lwjgl.system.NativeType("GLenum") int r7, @org.lwjgl.system.NativeType("GLenum") int r8, @org.lwjgl.system.NativeType("GLenum") int r9, @org.lwjgl.system.NativeType("GLfloat const *") float[] r10) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glPathColorGenNV
            r11 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L21
            r0 = r11
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r10
            r1 = r8
            int r1 = genModeToElements(r1)
            r2 = r9
            int r2 = colorFormatToComponents(r2)
            int r1 = r1 * r2
            org.lwjgl.system.Checks.check(r0, r1)
        L21:
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            org.lwjgl.system.JNI.callPV(r0, r1, r2, r3, r4)
            return
    }

    public static void glPathTexGenNV(@org.lwjgl.system.NativeType("GLenum") int r7, @org.lwjgl.system.NativeType("GLenum") int r8, @org.lwjgl.system.NativeType("GLint") int r9, @org.lwjgl.system.NativeType("GLfloat const *") float[] r10) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glPathTexGenNV
            r11 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L1e
            r0 = r11
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r10
            r1 = r8
            int r1 = genModeToElements(r1)
            r2 = r9
            int r1 = r1 * r2
            org.lwjgl.system.Checks.check(r0, r1)
        L1e:
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            org.lwjgl.system.JNI.callPV(r0, r1, r2, r3, r4)
            return
    }

    public static void glCoverFillPathInstancedNV(@org.lwjgl.system.NativeType("GLenum") int r11, @org.lwjgl.system.NativeType("void const *") java.nio.ByteBuffer r12, @org.lwjgl.system.NativeType("GLuint") int r13, @org.lwjgl.system.NativeType("GLenum") int r14, @org.lwjgl.system.NativeType("GLenum") int r15, @org.lwjgl.system.NativeType("GLfloat const *") float[] r16) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glCoverFillPathInstancedNV
            r17 = r0
            r0 = r12
            int r0 = r0.remaining()
            r1 = r11
            int r1 = pathNameTypeToBytes(r1)
            int r0 = r0 / r1
            r19 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L2c
            r0 = r17
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r16
            r1 = r19
            r2 = r15
            int r2 = transformTypeToElements(r2)
            int r1 = r1 * r2
            org.lwjgl.system.Checks.check(r0, r1)
        L2c:
            r0 = r19
            r1 = r11
            r2 = r12
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            r3 = r13
            r4 = r14
            r5 = r15
            r6 = r16
            r7 = r17
            org.lwjgl.system.JNI.callPPV(r0, r1, r2, r3, r4, r5, r6, r7)
            return
    }

    public static void glCoverStrokePathInstancedNV(@org.lwjgl.system.NativeType("GLenum") int r11, @org.lwjgl.system.NativeType("void const *") java.nio.ByteBuffer r12, @org.lwjgl.system.NativeType("GLuint") int r13, @org.lwjgl.system.NativeType("GLenum") int r14, @org.lwjgl.system.NativeType("GLenum") int r15, @org.lwjgl.system.NativeType("GLfloat const *") float[] r16) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glCoverStrokePathInstancedNV
            r17 = r0
            r0 = r12
            int r0 = r0.remaining()
            r1 = r11
            int r1 = pathNameTypeToBytes(r1)
            int r0 = r0 / r1
            r19 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L2c
            r0 = r17
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r16
            r1 = r19
            r2 = r15
            int r2 = transformTypeToElements(r2)
            int r1 = r1 * r2
            org.lwjgl.system.Checks.check(r0, r1)
        L2c:
            r0 = r19
            r1 = r11
            r2 = r12
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            r3 = r13
            r4 = r14
            r5 = r15
            r6 = r16
            r7 = r17
            org.lwjgl.system.JNI.callPPV(r0, r1, r2, r3, r4, r5, r6, r7)
            return
    }

    public static void glStencilThenCoverFillPathInstancedNV(@org.lwjgl.system.NativeType("GLenum") int r13, @org.lwjgl.system.NativeType("void const *") java.nio.ByteBuffer r14, @org.lwjgl.system.NativeType("GLuint") int r15, @org.lwjgl.system.NativeType("GLenum") int r16, @org.lwjgl.system.NativeType("GLuint") int r17, @org.lwjgl.system.NativeType("GLenum") int r18, @org.lwjgl.system.NativeType("GLenum") int r19, @org.lwjgl.system.NativeType("GLfloat const *") float[] r20) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glStencilThenCoverFillPathInstancedNV
            r21 = r0
            r0 = r14
            int r0 = r0.remaining()
            r1 = r13
            int r1 = pathNameTypeToBytes(r1)
            int r0 = r0 / r1
            r23 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L2c
            r0 = r21
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r20
            r1 = r23
            r2 = r19
            int r2 = transformTypeToElements(r2)
            int r1 = r1 * r2
            org.lwjgl.system.Checks.check(r0, r1)
        L2c:
            r0 = r23
            r1 = r13
            r2 = r14
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            r3 = r15
            r4 = r16
            r5 = r17
            r6 = r18
            r7 = r19
            r8 = r20
            r9 = r21
            org.lwjgl.system.JNI.callPPV(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9)
            return
    }

    public static void glStencilThenCoverStrokePathInstancedNV(@org.lwjgl.system.NativeType("GLenum") int r13, @org.lwjgl.system.NativeType("void const *") java.nio.ByteBuffer r14, @org.lwjgl.system.NativeType("GLuint") int r15, @org.lwjgl.system.NativeType("GLint") int r16, @org.lwjgl.system.NativeType("GLuint") int r17, @org.lwjgl.system.NativeType("GLenum") int r18, @org.lwjgl.system.NativeType("GLenum") int r19, @org.lwjgl.system.NativeType("GLfloat const *") float[] r20) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glStencilThenCoverStrokePathInstancedNV
            r21 = r0
            r0 = r14
            int r0 = r0.remaining()
            r1 = r13
            int r1 = pathNameTypeToBytes(r1)
            int r0 = r0 / r1
            r23 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L2c
            r0 = r21
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r20
            r1 = r23
            r2 = r19
            int r2 = transformTypeToElements(r2)
            int r1 = r1 * r2
            org.lwjgl.system.Checks.check(r0, r1)
        L2c:
            r0 = r23
            r1 = r13
            r2 = r14
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            r3 = r15
            r4 = r16
            r5 = r17
            r6 = r18
            r7 = r19
            r8 = r20
            r9 = r21
            org.lwjgl.system.JNI.callPPV(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9)
            return
    }

    @org.lwjgl.system.NativeType("GLenum")
    public static int glPathGlyphIndexRangeNV(@org.lwjgl.system.NativeType("GLenum") int r10, @org.lwjgl.system.NativeType("void const *") java.nio.ByteBuffer r11, @org.lwjgl.system.NativeType("GLbitfield") int r12, @org.lwjgl.system.NativeType("GLuint") int r13, @org.lwjgl.system.NativeType("GLfloat") float r14, @org.lwjgl.system.NativeType("GLuint *") int[] r15) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glPathGlyphIndexRangeNV
            r16 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L1e
            r0 = r16
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r11
            org.lwjgl.system.Checks.checkNT1(r0)
            r0 = r15
            r1 = 2
            org.lwjgl.system.Checks.check(r0, r1)
        L1e:
            r0 = r10
            r1 = r11
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            r2 = r12
            r3 = r13
            r4 = r14
            r5 = r15
            r6 = r16
            int r0 = org.lwjgl.system.JNI.callPPI(r0, r1, r2, r3, r4, r5, r6)
            return r0
    }

    public static void glProgramPathFragmentInputGenNV(@org.lwjgl.system.NativeType("GLuint") int r8, @org.lwjgl.system.NativeType("GLint") int r9, @org.lwjgl.system.NativeType("GLenum") int r10, @org.lwjgl.system.NativeType("GLint") int r11, @org.lwjgl.system.NativeType("GLfloat const *") float[] r12) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glProgramPathFragmentInputGenNV
            r13 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L1f
            r0 = r13
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r12
            r1 = r10
            int r1 = genModeToElements(r1)
            r2 = r11
            int r1 = r1 * r2
            org.lwjgl.system.Checks.check(r0, r1)
        L1f:
            r0 = r8
            r1 = r9
            r2 = r10
            r3 = r11
            r4 = r12
            r5 = r13
            org.lwjgl.system.JNI.callPV(r0, r1, r2, r3, r4, r5)
            return
    }

    public static void glGetPathParameterivNV(@org.lwjgl.system.NativeType("GLuint") int r6, @org.lwjgl.system.NativeType("GLenum") int r7, @org.lwjgl.system.NativeType("GLint *") int[] r8) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glGetPathParameterivNV
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

    public static void glGetPathParameterfvNV(@org.lwjgl.system.NativeType("GLuint") int r6, @org.lwjgl.system.NativeType("GLenum") int r7, @org.lwjgl.system.NativeType("GLfloat *") float[] r8) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glGetPathParameterfvNV
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

    public static void glGetPathCoordsNV(@org.lwjgl.system.NativeType("GLuint") int r5, @org.lwjgl.system.NativeType("GLfloat *") float[] r6) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glGetPathCoordsNV
            r7 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L22
            r0 = r7
            long r0 = org.lwjgl.system.Checks.check(r0)
            boolean r0 = org.lwjgl.system.Checks.DEBUG
            if (r0 == 0) goto L22
            r0 = r6
            r1 = r5
            r2 = 37022(0x909e, float:5.1879E-41)
            int r1 = glGetPathParameteriNV(r1, r2)
            org.lwjgl.system.Checks.check(r0, r1)
        L22:
            r0 = r5
            r1 = r6
            r2 = r7
            org.lwjgl.system.JNI.callPV(r0, r1, r2)
            return
    }

    public static void glGetPathDashArrayNV(@org.lwjgl.system.NativeType("GLuint") int r5, @org.lwjgl.system.NativeType("GLfloat *") float[] r6) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glGetPathDashArrayNV
            r7 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L22
            r0 = r7
            long r0 = org.lwjgl.system.Checks.check(r0)
            boolean r0 = org.lwjgl.system.Checks.DEBUG
            if (r0 == 0) goto L22
            r0 = r6
            r1 = r5
            r2 = 37023(0x909f, float:5.188E-41)
            int r1 = glGetPathParameteriNV(r1, r2)
            org.lwjgl.system.Checks.check(r0, r1)
        L22:
            r0 = r5
            r1 = r6
            r2 = r7
            org.lwjgl.system.JNI.callPV(r0, r1, r2)
            return
    }

    public static void glGetPathMetricsNV(@org.lwjgl.system.NativeType("GLbitfield") int r11, @org.lwjgl.system.NativeType("GLenum") int r12, @org.lwjgl.system.NativeType("void const *") java.nio.ByteBuffer r13, @org.lwjgl.system.NativeType("GLuint") int r14, @org.lwjgl.system.NativeType("GLsizei") int r15, @org.lwjgl.system.NativeType("GLfloat *") float[] r16) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glGetPathMetricsNV
            r17 = r0
            r0 = r13
            int r0 = r0.remaining()
            r1 = r12
            int r1 = pathNameTypeToBytes(r1)
            int r0 = r0 / r1
            r19 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L37
            r0 = r17
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r16
            r1 = r19
            r2 = r15
            if (r2 != 0) goto L2f
            r2 = r11
            int r2 = java.lang.Integer.bitCount(r2)
            goto L33
        L2f:
            r2 = r15
            r3 = 2
            int r2 = r2 >> r3
        L33:
            int r1 = r1 * r2
            org.lwjgl.system.Checks.check(r0, r1)
        L37:
            r0 = r11
            r1 = r19
            r2 = r12
            r3 = r13
            long r3 = org.lwjgl.system.MemoryUtil.memAddress(r3)
            r4 = r14
            r5 = r15
            r6 = r16
            r7 = r17
            org.lwjgl.system.JNI.callPPV(r0, r1, r2, r3, r4, r5, r6, r7)
            return
    }

    public static void glGetPathMetricRangeNV(@org.lwjgl.system.NativeType("GLbitfield") int r8, @org.lwjgl.system.NativeType("GLuint") int r9, @org.lwjgl.system.NativeType("GLsizei") int r10, @org.lwjgl.system.NativeType("GLsizei") int r11, @org.lwjgl.system.NativeType("GLfloat *") float[] r12) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glGetPathMetricRangeNV
            r13 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L29
            r0 = r13
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r12
            r1 = r10
            r2 = r11
            if (r2 != 0) goto L22
            r2 = r8
            int r2 = java.lang.Integer.bitCount(r2)
            goto L25
        L22:
            r2 = r11
            r3 = 2
            int r2 = r2 >> r3
        L25:
            int r1 = r1 * r2
            org.lwjgl.system.Checks.check(r0, r1)
        L29:
            r0 = r8
            r1 = r9
            r2 = r10
            r3 = r11
            r4 = r12
            r5 = r13
            org.lwjgl.system.JNI.callPV(r0, r1, r2, r3, r4, r5)
            return
    }

    public static void glGetPathSpacingNV(@org.lwjgl.system.NativeType("GLenum") int r13, @org.lwjgl.system.NativeType("GLenum") int r14, @org.lwjgl.system.NativeType("void const *") java.nio.ByteBuffer r15, @org.lwjgl.system.NativeType("GLuint") int r16, @org.lwjgl.system.NativeType("GLfloat") float r17, @org.lwjgl.system.NativeType("GLfloat") float r18, @org.lwjgl.system.NativeType("GLenum") int r19, @org.lwjgl.system.NativeType("GLfloat *") float[] r20) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glGetPathSpacingNV
            r21 = r0
            r0 = r15
            int r0 = r0.remaining()
            r1 = r14
            int r1 = pathNameTypeToBytes(r1)
            int r0 = r0 / r1
            r23 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L35
            r0 = r21
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r20
            r1 = r23
            r2 = 1
            int r1 = r1 - r2
            r2 = r19
            r3 = 37006(0x908e, float:5.1856E-41)
            if (r2 != r3) goto L30
            r2 = 1
            goto L31
        L30:
            r2 = 2
        L31:
            int r1 = r1 * r2
            org.lwjgl.system.Checks.check(r0, r1)
        L35:
            r0 = r13
            r1 = r23
            r2 = r14
            r3 = r15
            long r3 = org.lwjgl.system.MemoryUtil.memAddress(r3)
            r4 = r16
            r5 = r17
            r6 = r18
            r7 = r19
            r8 = r20
            r9 = r21
            org.lwjgl.system.JNI.callPPV(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9)
            return
    }

    public static void glGetPathColorGenivNV(@org.lwjgl.system.NativeType("GLenum") int r6, @org.lwjgl.system.NativeType("GLenum") int r7, @org.lwjgl.system.NativeType("GLint *") int[] r8) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glGetPathColorGenivNV
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

    public static void glGetPathColorGenfvNV(@org.lwjgl.system.NativeType("GLenum") int r6, @org.lwjgl.system.NativeType("GLenum") int r7, @org.lwjgl.system.NativeType("GLfloat *") float[] r8) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glGetPathColorGenfvNV
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

    public static void glGetPathTexGenivNV(@org.lwjgl.system.NativeType("GLenum") int r6, @org.lwjgl.system.NativeType("GLenum") int r7, @org.lwjgl.system.NativeType("GLint *") int[] r8) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glGetPathTexGenivNV
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

    public static void glGetPathTexGenfvNV(@org.lwjgl.system.NativeType("GLenum") int r6, @org.lwjgl.system.NativeType("GLenum") int r7, @org.lwjgl.system.NativeType("GLfloat *") float[] r8) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glGetPathTexGenfvNV
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

    @org.lwjgl.system.NativeType("GLboolean")
    public static boolean glPointAlongPathNV(@org.lwjgl.system.NativeType("GLuint") int r11, @org.lwjgl.system.NativeType("GLsizei") int r12, @org.lwjgl.system.NativeType("GLsizei") int r13, @org.lwjgl.system.NativeType("GLfloat") float r14, @javax.annotation.Nullable @org.lwjgl.system.NativeType("GLfloat *") float[] r15, @javax.annotation.Nullable @org.lwjgl.system.NativeType("GLfloat *") float[] r16, @javax.annotation.Nullable @org.lwjgl.system.NativeType("GLfloat *") float[] r17, @javax.annotation.Nullable @org.lwjgl.system.NativeType("GLfloat *") float[] r18) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glPointAlongPathNV
            r19 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L2c
            r0 = r19
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r15
            r1 = 1
            org.lwjgl.system.Checks.checkSafe(r0, r1)
            r0 = r16
            r1 = 1
            org.lwjgl.system.Checks.checkSafe(r0, r1)
            r0 = r17
            r1 = 1
            org.lwjgl.system.Checks.checkSafe(r0, r1)
            r0 = r18
            r1 = 1
            org.lwjgl.system.Checks.checkSafe(r0, r1)
        L2c:
            r0 = r11
            r1 = r12
            r2 = r13
            r3 = r14
            r4 = r15
            r5 = r16
            r6 = r17
            r7 = r18
            r8 = r19
            boolean r0 = org.lwjgl.system.JNI.callPPPPZ(r0, r1, r2, r3, r4, r5, r6, r7, r8)
            return r0
    }

    public static void glMatrixLoad3x2fNV(@org.lwjgl.system.NativeType("GLenum") int r5, @org.lwjgl.system.NativeType("GLfloat const *") float[] r6) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glMatrixLoad3x2fNV
            r7 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L18
            r0 = r7
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r6
            r1 = 6
            org.lwjgl.system.Checks.check(r0, r1)
        L18:
            r0 = r5
            r1 = r6
            r2 = r7
            org.lwjgl.system.JNI.callPV(r0, r1, r2)
            return
    }

    public static void glMatrixLoad3x3fNV(@org.lwjgl.system.NativeType("GLenum") int r5, @org.lwjgl.system.NativeType("GLfloat const *") float[] r6) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glMatrixLoad3x3fNV
            r7 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L18
            r0 = r7
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r6
            r1 = 9
            org.lwjgl.system.Checks.check(r0, r1)
        L18:
            r0 = r5
            r1 = r6
            r2 = r7
            org.lwjgl.system.JNI.callPV(r0, r1, r2)
            return
    }

    public static void glMatrixLoadTranspose3x3fNV(@org.lwjgl.system.NativeType("GLenum") int r5, @org.lwjgl.system.NativeType("GLfloat const *") float[] r6) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glMatrixLoadTranspose3x3fNV
            r7 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L18
            r0 = r7
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r6
            r1 = 9
            org.lwjgl.system.Checks.check(r0, r1)
        L18:
            r0 = r5
            r1 = r6
            r2 = r7
            org.lwjgl.system.JNI.callPV(r0, r1, r2)
            return
    }

    public static void glMatrixMult3x2fNV(@org.lwjgl.system.NativeType("GLenum") int r5, @org.lwjgl.system.NativeType("GLfloat const *") float[] r6) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glMatrixMult3x2fNV
            r7 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L18
            r0 = r7
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r6
            r1 = 6
            org.lwjgl.system.Checks.check(r0, r1)
        L18:
            r0 = r5
            r1 = r6
            r2 = r7
            org.lwjgl.system.JNI.callPV(r0, r1, r2)
            return
    }

    public static void glMatrixMult3x3fNV(@org.lwjgl.system.NativeType("GLenum") int r5, @org.lwjgl.system.NativeType("GLfloat const *") float[] r6) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glMatrixMult3x3fNV
            r7 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L18
            r0 = r7
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r6
            r1 = 9
            org.lwjgl.system.Checks.check(r0, r1)
        L18:
            r0 = r5
            r1 = r6
            r2 = r7
            org.lwjgl.system.JNI.callPV(r0, r1, r2)
            return
    }

    public static void glMatrixMultTranspose3x3fNV(@org.lwjgl.system.NativeType("GLenum") int r5, @org.lwjgl.system.NativeType("GLfloat const *") float[] r6) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glMatrixMultTranspose3x3fNV
            r7 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L18
            r0 = r7
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r6
            r1 = 9
            org.lwjgl.system.Checks.check(r0, r1)
        L18:
            r0 = r5
            r1 = r6
            r2 = r7
            org.lwjgl.system.JNI.callPV(r0, r1, r2)
            return
    }

    public static void glGetProgramResourcefvNV(@org.lwjgl.system.NativeType("GLuint") int r11, @org.lwjgl.system.NativeType("GLenum") int r12, @org.lwjgl.system.NativeType("GLuint") int r13, @org.lwjgl.system.NativeType("GLenum const *") int[] r14, @javax.annotation.Nullable @org.lwjgl.system.NativeType("GLsizei *") int[] r15, @org.lwjgl.system.NativeType("GLfloat *") float[] r16) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glGetProgramResourcefvNV
            r17 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L1a
            r0 = r17
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r15
            r1 = 1
            org.lwjgl.system.Checks.checkSafe(r0, r1)
        L1a:
            r0 = r11
            r1 = r12
            r2 = r13
            r3 = r14
            int r3 = r3.length
            r4 = r14
            r5 = r16
            int r5 = r5.length
            r6 = r15
            r7 = r16
            r8 = r17
            org.lwjgl.system.JNI.callPPPV(r0, r1, r2, r3, r4, r5, r6, r7, r8)
            return
    }

    private static int charcodeTypeToBytes(int r8) {
            r0 = r8
            switch(r0) {
                case 5121: goto L4c;
                case 5123: goto L4e;
                case 5125: goto L52;
                case 5127: goto L4e;
                case 5128: goto L50;
                case 5129: goto L52;
                case 37018: goto L4c;
                case 37019: goto L4e;
                default: goto L54;
            }
        L4c:
            r0 = 1
            return r0
        L4e:
            r0 = 2
            return r0
        L50:
            r0 = 3
            return r0
        L52:
            r0 = 4
            return r0
        L54:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r1 = r0
            java.lang.String r2 = "Unsupported charcode type: 0x%X"
            r3 = 1
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r4 = r3
            r5 = 0
            r6 = r8
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r4[r5] = r6
            java.lang.String r2 = java.lang.String.format(r2, r3)
            r1.<init>(r2)
            throw r0
    }

    private static int pathNameTypeToBytes(int r8) {
            r0 = r8
            switch(r0) {
                case 5120: goto L64;
                case 5121: goto L64;
                case 5122: goto L66;
                case 5123: goto L66;
                case 5124: goto L6a;
                case 5125: goto L6a;
                case 5127: goto L66;
                case 5128: goto L68;
                case 5129: goto L6a;
                case 37018: goto L64;
                case 37019: goto L66;
                default: goto L6c;
            }
        L64:
            r0 = 1
            return r0
        L66:
            r0 = 2
            return r0
        L68:
            r0 = 3
            return r0
        L6a:
            r0 = 4
            return r0
        L6c:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r1 = r0
            java.lang.String r2 = "Unsupported path name type: 0x%X"
            r3 = 1
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r4 = r3
            r5 = 0
            r6 = r8
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r4[r5] = r6
            java.lang.String r2 = java.lang.String.format(r2, r3)
            r1.<init>(r2)
            throw r0
    }

    private static int transformTypeToElements(int r8) {
            r0 = r8
            switch(r0) {
                case 0: goto L54;
                case 37006: goto L56;
                case 37007: goto L56;
                case 37008: goto L58;
                case 37009: goto L5a;
                case 37010: goto L5c;
                case 37012: goto L5f;
                case 37014: goto L5c;
                case 37016: goto L5f;
                default: goto L62;
            }
        L54:
            r0 = 0
            return r0
        L56:
            r0 = 1
            return r0
        L58:
            r0 = 2
            return r0
        L5a:
            r0 = 3
            return r0
        L5c:
            r0 = 6
            return r0
        L5f:
            r0 = 12
            return r0
        L62:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r1 = r0
            java.lang.String r2 = "Unsupported transform type: 0x%X"
            r3 = 1
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r4 = r3
            r5 = 0
            r6 = r8
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r4[r5] = r6
            java.lang.String r2 = java.lang.String.format(r2, r3)
            r1.<init>(r2)
            throw r0
    }

    private static int colorFormatToComponents(int r8) {
            r0 = r8
            switch(r0) {
                case 6406: goto L3c;
                case 6407: goto L40;
                case 6408: goto L42;
                case 6409: goto L3c;
                case 6410: goto L3e;
                case 32841: goto L3c;
                default: goto L44;
            }
        L3c:
            r0 = 1
            return r0
        L3e:
            r0 = 2
            return r0
        L40:
            r0 = 3
            return r0
        L42:
            r0 = 4
            return r0
        L44:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r1 = r0
            java.lang.String r2 = "Unsupported colorFormat specified: 0x%X"
            r3 = 1
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r4 = r3
            r5 = 0
            r6 = r8
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r4[r5] = r6
            java.lang.String r2 = java.lang.String.format(r2, r3)
            r1.<init>(r2)
            throw r0
    }

    private static int genModeToElements(int r8) {
            r0 = r8
            switch(r0) {
                case 0: goto L34;
                case 9216: goto L3a;
                case 9217: goto L38;
                case 34166: goto L36;
                case 37002: goto L38;
                default: goto L3c;
            }
        L34:
            r0 = 0
            return r0
        L36:
            r0 = 1
            return r0
        L38:
            r0 = 3
            return r0
        L3a:
            r0 = 4
            return r0
        L3c:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r1 = r0
            java.lang.String r2 = "Unsupported genMode specified: 0x%X"
            r3 = 1
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r4 = r3
            r5 = 0
            r6 = r8
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r4[r5] = r6
            java.lang.String r2 = java.lang.String.format(r2, r3)
            r1.<init>(r2)
            throw r0
    }

    static {
            org.lwjgl.opengl.GL.initialize()
            return
    }
}
