package org.lwjgl.vulkan.video;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/video/StdVideoH265SequenceParameterSetVui.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/video/StdVideoH265SequenceParameterSetVui.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/video/StdVideoH265SequenceParameterSetVui.class */
public class StdVideoH265SequenceParameterSetVui extends org.lwjgl.system.Struct<org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSetVui> implements org.lwjgl.system.NativeResource {
    public static final int SIZEOF = 0;
    public static final int ALIGNOF = 0;
    public static final int FLAGS = 0;
    public static final int ASPECT_RATIO_IDC = 0;
    public static final int SAR_WIDTH = 0;
    public static final int SAR_HEIGHT = 0;
    public static final int VIDEO_FORMAT = 0;
    public static final int COLOUR_PRIMARIES = 0;
    public static final int TRANSFER_CHARACTERISTICS = 0;
    public static final int MATRIX_COEFFS = 0;
    public static final int CHROMA_SAMPLE_LOC_TYPE_TOP_FIELD = 0;
    public static final int CHROMA_SAMPLE_LOC_TYPE_BOTTOM_FIELD = 0;
    public static final int RESERVED1 = 0;
    public static final int RESERVED2 = 0;
    public static final int DEF_DISP_WIN_LEFT_OFFSET = 0;
    public static final int DEF_DISP_WIN_RIGHT_OFFSET = 0;
    public static final int DEF_DISP_WIN_TOP_OFFSET = 0;
    public static final int DEF_DISP_WIN_BOTTOM_OFFSET = 0;
    public static final int VUI_NUM_UNITS_IN_TICK = 0;
    public static final int VUI_TIME_SCALE = 0;
    public static final int VUI_NUM_TICKS_POC_DIFF_ONE_MINUS1 = 0;
    public static final int MIN_SPATIAL_SEGMENTATION_IDC = 0;
    public static final int RESERVED3 = 0;
    public static final int MAX_BYTES_PER_PIC_DENOM = 0;
    public static final int MAX_BITS_PER_MIN_CU_DENOM = 0;
    public static final int LOG2_MAX_MV_LENGTH_HORIZONTAL = 0;
    public static final int LOG2_MAX_MV_LENGTH_VERTICAL = 0;
    public static final int PHRDPARAMETERS = 0;

    /* JADX WARN: Classes with same name are omitted, all sources:
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/video/StdVideoH265SequenceParameterSetVui$Buffer.class
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/video/StdVideoH265SequenceParameterSetVui$Buffer.class
     */
    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/video/StdVideoH265SequenceParameterSetVui$Buffer.class */
    public static class Buffer extends org.lwjgl.system.StructBuffer<org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSetVui, org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSetVui.Buffer> implements org.lwjgl.system.NativeResource {
        private static final org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSetVui ELEMENT_FACTORY = null;

        public Buffer(java.nio.ByteBuffer r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r6
                int r2 = r2.remaining()
                int r3 = org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSetVui.SIZEOF
                int r2 = r2 / r3
                r0.<init>(r1, r2)
                return
        }

        public Buffer(long r10, int r12) {
                r9 = this;
                r0 = r9
                r1 = r10
                r2 = 0
                r3 = -1
                r4 = 0
                r5 = r12
                r6 = r12
                r0.<init>(r1, r2, r3, r4, r5, r6)
                return
        }

        Buffer(long r10, @javax.annotation.Nullable java.nio.ByteBuffer r12, int r13, int r14, int r15, int r16) {
                r9 = this;
                r0 = r9
                r1 = r10
                r2 = r12
                r3 = r13
                r4 = r14
                r5 = r15
                r6 = r16
                r0.<init>(r1, r2, r3, r4, r5, r6)
                return
        }

        @Override // org.lwjgl.system.CustomBuffer
        protected org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSetVui.Buffer self() {
                r2 = this;
                r0 = r2
                return r0
        }

        @Override // org.lwjgl.system.StructBuffer
        protected org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSetVui getElementFactory() {
                r2 = this;
                org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSetVui r0 = org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSetVui.Buffer.ELEMENT_FACTORY
                return r0
        }

        public org.lwjgl.vulkan.video.StdVideoH265SpsVuiFlags flags() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                org.lwjgl.vulkan.video.StdVideoH265SpsVuiFlags r0 = org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSetVui.nflags(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("StdVideoH265AspectRatioIdc")
        public int aspect_ratio_idc() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSetVui.naspect_ratio_idc(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint16_t")
        public short sar_width() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                short r0 = org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSetVui.nsar_width(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint16_t")
        public short sar_height() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                short r0 = org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSetVui.nsar_height(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint8_t")
        public byte video_format() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                byte r0 = org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSetVui.nvideo_format(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint8_t")
        public byte colour_primaries() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                byte r0 = org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSetVui.ncolour_primaries(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint8_t")
        public byte transfer_characteristics() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                byte r0 = org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSetVui.ntransfer_characteristics(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint8_t")
        public byte matrix_coeffs() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                byte r0 = org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSetVui.nmatrix_coeffs(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint8_t")
        public byte chroma_sample_loc_type_top_field() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                byte r0 = org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSetVui.nchroma_sample_loc_type_top_field(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint8_t")
        public byte chroma_sample_loc_type_bottom_field() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                byte r0 = org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSetVui.nchroma_sample_loc_type_bottom_field(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint16_t")
        public short def_disp_win_left_offset() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                short r0 = org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSetVui.ndef_disp_win_left_offset(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint16_t")
        public short def_disp_win_right_offset() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                short r0 = org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSetVui.ndef_disp_win_right_offset(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint16_t")
        public short def_disp_win_top_offset() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                short r0 = org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSetVui.ndef_disp_win_top_offset(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint16_t")
        public short def_disp_win_bottom_offset() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                short r0 = org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSetVui.ndef_disp_win_bottom_offset(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint32_t")
        public int vui_num_units_in_tick() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSetVui.nvui_num_units_in_tick(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint32_t")
        public int vui_time_scale() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSetVui.nvui_time_scale(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint32_t")
        public int vui_num_ticks_poc_diff_one_minus1() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSetVui.nvui_num_ticks_poc_diff_one_minus1(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint16_t")
        public short min_spatial_segmentation_idc() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                short r0 = org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSetVui.nmin_spatial_segmentation_idc(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint8_t")
        public byte max_bytes_per_pic_denom() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                byte r0 = org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSetVui.nmax_bytes_per_pic_denom(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint8_t")
        public byte max_bits_per_min_cu_denom() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                byte r0 = org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSetVui.nmax_bits_per_min_cu_denom(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint8_t")
        public byte log2_max_mv_length_horizontal() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                byte r0 = org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSetVui.nlog2_max_mv_length_horizontal(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint8_t")
        public byte log2_max_mv_length_vertical() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                byte r0 = org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSetVui.nlog2_max_mv_length_vertical(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("StdVideoH265HrdParameters const *")
        public org.lwjgl.vulkan.video.StdVideoH265HrdParameters pHrdParameters() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                org.lwjgl.vulkan.video.StdVideoH265HrdParameters r0 = org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSetVui.npHrdParameters(r0)
                return r0
        }

        public org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSetVui.Buffer flags(org.lwjgl.vulkan.video.StdVideoH265SpsVuiFlags r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSetVui.nflags(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSetVui.Buffer flags(java.util.function.Consumer<org.lwjgl.vulkan.video.StdVideoH265SpsVuiFlags> r4) {
                r3 = this;
                r0 = r4
                r1 = r3
                org.lwjgl.vulkan.video.StdVideoH265SpsVuiFlags r1 = r1.flags()
                r0.accept(r1)
                r0 = r3
                return r0
        }

        public org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSetVui.Buffer aspect_ratio_idc(@org.lwjgl.system.NativeType("StdVideoH265AspectRatioIdc") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSetVui.naspect_ratio_idc(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSetVui.Buffer sar_width(@org.lwjgl.system.NativeType("uint16_t") short r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSetVui.nsar_width(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSetVui.Buffer sar_height(@org.lwjgl.system.NativeType("uint16_t") short r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSetVui.nsar_height(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSetVui.Buffer video_format(@org.lwjgl.system.NativeType("uint8_t") byte r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSetVui.nvideo_format(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSetVui.Buffer colour_primaries(@org.lwjgl.system.NativeType("uint8_t") byte r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSetVui.ncolour_primaries(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSetVui.Buffer transfer_characteristics(@org.lwjgl.system.NativeType("uint8_t") byte r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSetVui.ntransfer_characteristics(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSetVui.Buffer matrix_coeffs(@org.lwjgl.system.NativeType("uint8_t") byte r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSetVui.nmatrix_coeffs(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSetVui.Buffer chroma_sample_loc_type_top_field(@org.lwjgl.system.NativeType("uint8_t") byte r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSetVui.nchroma_sample_loc_type_top_field(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSetVui.Buffer chroma_sample_loc_type_bottom_field(@org.lwjgl.system.NativeType("uint8_t") byte r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSetVui.nchroma_sample_loc_type_bottom_field(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSetVui.Buffer def_disp_win_left_offset(@org.lwjgl.system.NativeType("uint16_t") short r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSetVui.ndef_disp_win_left_offset(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSetVui.Buffer def_disp_win_right_offset(@org.lwjgl.system.NativeType("uint16_t") short r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSetVui.ndef_disp_win_right_offset(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSetVui.Buffer def_disp_win_top_offset(@org.lwjgl.system.NativeType("uint16_t") short r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSetVui.ndef_disp_win_top_offset(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSetVui.Buffer def_disp_win_bottom_offset(@org.lwjgl.system.NativeType("uint16_t") short r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSetVui.ndef_disp_win_bottom_offset(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSetVui.Buffer vui_num_units_in_tick(@org.lwjgl.system.NativeType("uint32_t") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSetVui.nvui_num_units_in_tick(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSetVui.Buffer vui_time_scale(@org.lwjgl.system.NativeType("uint32_t") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSetVui.nvui_time_scale(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSetVui.Buffer vui_num_ticks_poc_diff_one_minus1(@org.lwjgl.system.NativeType("uint32_t") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSetVui.nvui_num_ticks_poc_diff_one_minus1(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSetVui.Buffer min_spatial_segmentation_idc(@org.lwjgl.system.NativeType("uint16_t") short r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSetVui.nmin_spatial_segmentation_idc(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSetVui.Buffer max_bytes_per_pic_denom(@org.lwjgl.system.NativeType("uint8_t") byte r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSetVui.nmax_bytes_per_pic_denom(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSetVui.Buffer max_bits_per_min_cu_denom(@org.lwjgl.system.NativeType("uint8_t") byte r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSetVui.nmax_bits_per_min_cu_denom(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSetVui.Buffer log2_max_mv_length_horizontal(@org.lwjgl.system.NativeType("uint8_t") byte r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSetVui.nlog2_max_mv_length_horizontal(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSetVui.Buffer log2_max_mv_length_vertical(@org.lwjgl.system.NativeType("uint8_t") byte r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSetVui.nlog2_max_mv_length_vertical(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSetVui.Buffer pHrdParameters(@org.lwjgl.system.NativeType("StdVideoH265HrdParameters const *") org.lwjgl.vulkan.video.StdVideoH265HrdParameters r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSetVui.npHrdParameters(r0, r1)
                r0 = r4
                return r0
        }

        @Override // org.lwjgl.system.StructBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.Struct getElementFactory() {
                r2 = this;
                r0 = r2
                org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSetVui r0 = r0.getElementFactory()
                return r0
        }

        @Override // org.lwjgl.system.CustomBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.CustomBuffer self() {
                r2 = this;
                r0 = r2
                org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSetVui$Buffer r0 = r0.self()
                return r0
        }

        static {
                r0 = -1
                org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSetVui r0 = org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSetVui.create(r0)
                org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSetVui.Buffer.ELEMENT_FACTORY = r0
                return
        }
    }

    protected StdVideoH265SequenceParameterSetVui(long r6, @javax.annotation.Nullable java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    protected org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSetVui create(long r7, @javax.annotation.Nullable java.nio.ByteBuffer r9) {
            r6 = this;
            org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSetVui r0 = new org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSetVui
            r1 = r0
            r2 = r7
            r3 = r9
            r1.<init>(r2, r3)
            return r0
    }

    public StdVideoH265SequenceParameterSetVui(java.nio.ByteBuffer r7) {
            r6 = this;
            r0 = r6
            r1 = r7
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            r2 = r7
            int r3 = org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSetVui.SIZEOF
            java.nio.ByteBuffer r2 = __checkContainer(r2, r3)
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
            r2 = this;
            int r0 = org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSetVui.SIZEOF
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoH265SpsVuiFlags flags() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            org.lwjgl.vulkan.video.StdVideoH265SpsVuiFlags r0 = nflags(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("StdVideoH265AspectRatioIdc")
    public int aspect_ratio_idc() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = naspect_ratio_idc(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("uint16_t")
    public short sar_width() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            short r0 = nsar_width(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("uint16_t")
    public short sar_height() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            short r0 = nsar_height(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("uint8_t")
    public byte video_format() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            byte r0 = nvideo_format(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("uint8_t")
    public byte colour_primaries() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            byte r0 = ncolour_primaries(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("uint8_t")
    public byte transfer_characteristics() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            byte r0 = ntransfer_characteristics(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("uint8_t")
    public byte matrix_coeffs() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            byte r0 = nmatrix_coeffs(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("uint8_t")
    public byte chroma_sample_loc_type_top_field() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            byte r0 = nchroma_sample_loc_type_top_field(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("uint8_t")
    public byte chroma_sample_loc_type_bottom_field() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            byte r0 = nchroma_sample_loc_type_bottom_field(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("uint16_t")
    public short def_disp_win_left_offset() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            short r0 = ndef_disp_win_left_offset(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("uint16_t")
    public short def_disp_win_right_offset() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            short r0 = ndef_disp_win_right_offset(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("uint16_t")
    public short def_disp_win_top_offset() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            short r0 = ndef_disp_win_top_offset(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("uint16_t")
    public short def_disp_win_bottom_offset() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            short r0 = ndef_disp_win_bottom_offset(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("uint32_t")
    public int vui_num_units_in_tick() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nvui_num_units_in_tick(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("uint32_t")
    public int vui_time_scale() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nvui_time_scale(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("uint32_t")
    public int vui_num_ticks_poc_diff_one_minus1() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nvui_num_ticks_poc_diff_one_minus1(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("uint16_t")
    public short min_spatial_segmentation_idc() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            short r0 = nmin_spatial_segmentation_idc(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("uint8_t")
    public byte max_bytes_per_pic_denom() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            byte r0 = nmax_bytes_per_pic_denom(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("uint8_t")
    public byte max_bits_per_min_cu_denom() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            byte r0 = nmax_bits_per_min_cu_denom(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("uint8_t")
    public byte log2_max_mv_length_horizontal() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            byte r0 = nlog2_max_mv_length_horizontal(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("uint8_t")
    public byte log2_max_mv_length_vertical() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            byte r0 = nlog2_max_mv_length_vertical(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("StdVideoH265HrdParameters const *")
    public org.lwjgl.vulkan.video.StdVideoH265HrdParameters pHrdParameters() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            org.lwjgl.vulkan.video.StdVideoH265HrdParameters r0 = npHrdParameters(r0)
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSetVui flags(org.lwjgl.vulkan.video.StdVideoH265SpsVuiFlags r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nflags(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSetVui flags(java.util.function.Consumer<org.lwjgl.vulkan.video.StdVideoH265SpsVuiFlags> r4) {
            r3 = this;
            r0 = r4
            r1 = r3
            org.lwjgl.vulkan.video.StdVideoH265SpsVuiFlags r1 = r1.flags()
            r0.accept(r1)
            r0 = r3
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSetVui aspect_ratio_idc(@org.lwjgl.system.NativeType("StdVideoH265AspectRatioIdc") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            naspect_ratio_idc(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSetVui sar_width(@org.lwjgl.system.NativeType("uint16_t") short r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nsar_width(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSetVui sar_height(@org.lwjgl.system.NativeType("uint16_t") short r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nsar_height(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSetVui video_format(@org.lwjgl.system.NativeType("uint8_t") byte r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nvideo_format(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSetVui colour_primaries(@org.lwjgl.system.NativeType("uint8_t") byte r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            ncolour_primaries(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSetVui transfer_characteristics(@org.lwjgl.system.NativeType("uint8_t") byte r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            ntransfer_characteristics(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSetVui matrix_coeffs(@org.lwjgl.system.NativeType("uint8_t") byte r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nmatrix_coeffs(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSetVui chroma_sample_loc_type_top_field(@org.lwjgl.system.NativeType("uint8_t") byte r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nchroma_sample_loc_type_top_field(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSetVui chroma_sample_loc_type_bottom_field(@org.lwjgl.system.NativeType("uint8_t") byte r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nchroma_sample_loc_type_bottom_field(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSetVui def_disp_win_left_offset(@org.lwjgl.system.NativeType("uint16_t") short r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            ndef_disp_win_left_offset(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSetVui def_disp_win_right_offset(@org.lwjgl.system.NativeType("uint16_t") short r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            ndef_disp_win_right_offset(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSetVui def_disp_win_top_offset(@org.lwjgl.system.NativeType("uint16_t") short r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            ndef_disp_win_top_offset(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSetVui def_disp_win_bottom_offset(@org.lwjgl.system.NativeType("uint16_t") short r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            ndef_disp_win_bottom_offset(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSetVui vui_num_units_in_tick(@org.lwjgl.system.NativeType("uint32_t") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nvui_num_units_in_tick(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSetVui vui_time_scale(@org.lwjgl.system.NativeType("uint32_t") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nvui_time_scale(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSetVui vui_num_ticks_poc_diff_one_minus1(@org.lwjgl.system.NativeType("uint32_t") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nvui_num_ticks_poc_diff_one_minus1(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSetVui min_spatial_segmentation_idc(@org.lwjgl.system.NativeType("uint16_t") short r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nmin_spatial_segmentation_idc(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSetVui max_bytes_per_pic_denom(@org.lwjgl.system.NativeType("uint8_t") byte r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nmax_bytes_per_pic_denom(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSetVui max_bits_per_min_cu_denom(@org.lwjgl.system.NativeType("uint8_t") byte r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nmax_bits_per_min_cu_denom(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSetVui log2_max_mv_length_horizontal(@org.lwjgl.system.NativeType("uint8_t") byte r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nlog2_max_mv_length_horizontal(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSetVui log2_max_mv_length_vertical(@org.lwjgl.system.NativeType("uint8_t") byte r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nlog2_max_mv_length_vertical(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSetVui pHrdParameters(@org.lwjgl.system.NativeType("StdVideoH265HrdParameters const *") org.lwjgl.vulkan.video.StdVideoH265HrdParameters r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            npHrdParameters(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSetVui set(org.lwjgl.vulkan.video.StdVideoH265SpsVuiFlags r4, int r5, short r6, short r7, byte r8, byte r9, byte r10, byte r11, byte r12, byte r13, short r14, short r15, short r16, short r17, int r18, int r19, int r20, short r21, byte r22, byte r23, byte r24, byte r25, org.lwjgl.vulkan.video.StdVideoH265HrdParameters r26) {
            r3 = this;
            r0 = r3
            r1 = r4
            org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSetVui r0 = r0.flags(r1)
            r0 = r3
            r1 = r5
            org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSetVui r0 = r0.aspect_ratio_idc(r1)
            r0 = r3
            r1 = r6
            org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSetVui r0 = r0.sar_width(r1)
            r0 = r3
            r1 = r7
            org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSetVui r0 = r0.sar_height(r1)
            r0 = r3
            r1 = r8
            org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSetVui r0 = r0.video_format(r1)
            r0 = r3
            r1 = r9
            org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSetVui r0 = r0.colour_primaries(r1)
            r0 = r3
            r1 = r10
            org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSetVui r0 = r0.transfer_characteristics(r1)
            r0 = r3
            r1 = r11
            org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSetVui r0 = r0.matrix_coeffs(r1)
            r0 = r3
            r1 = r12
            org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSetVui r0 = r0.chroma_sample_loc_type_top_field(r1)
            r0 = r3
            r1 = r13
            org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSetVui r0 = r0.chroma_sample_loc_type_bottom_field(r1)
            r0 = r3
            r1 = r14
            org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSetVui r0 = r0.def_disp_win_left_offset(r1)
            r0 = r3
            r1 = r15
            org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSetVui r0 = r0.def_disp_win_right_offset(r1)
            r0 = r3
            r1 = r16
            org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSetVui r0 = r0.def_disp_win_top_offset(r1)
            r0 = r3
            r1 = r17
            org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSetVui r0 = r0.def_disp_win_bottom_offset(r1)
            r0 = r3
            r1 = r18
            org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSetVui r0 = r0.vui_num_units_in_tick(r1)
            r0 = r3
            r1 = r19
            org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSetVui r0 = r0.vui_time_scale(r1)
            r0 = r3
            r1 = r20
            org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSetVui r0 = r0.vui_num_ticks_poc_diff_one_minus1(r1)
            r0 = r3
            r1 = r21
            org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSetVui r0 = r0.min_spatial_segmentation_idc(r1)
            r0 = r3
            r1 = r22
            org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSetVui r0 = r0.max_bytes_per_pic_denom(r1)
            r0 = r3
            r1 = r23
            org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSetVui r0 = r0.max_bits_per_min_cu_denom(r1)
            r0 = r3
            r1 = r24
            org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSetVui r0 = r0.log2_max_mv_length_horizontal(r1)
            r0 = r3
            r1 = r25
            org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSetVui r0 = r0.log2_max_mv_length_vertical(r1)
            r0 = r3
            r1 = r26
            org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSetVui r0 = r0.pHrdParameters(r1)
            r0 = r3
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSetVui set(org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSetVui r8) {
            r7 = this;
            r0 = r8
            long r0 = r0.address()
            r1 = r7
            long r1 = r1.address()
            int r2 = org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSetVui.SIZEOF
            long r2 = (long) r2
            org.lwjgl.system.MemoryUtil.memCopy(r0, r1, r2)
            r0 = r7
            return r0
    }

    public static org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSetVui malloc() {
            org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSetVui r0 = new org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSetVui
            r1 = r0
            int r2 = org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSetVui.SIZEOF
            long r2 = (long) r2
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSetVui calloc() {
            org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSetVui r0 = new org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSetVui
            r1 = r0
            r2 = 1
            int r3 = org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSetVui.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSetVui create() {
            int r0 = org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSetVui.SIZEOF
            java.nio.ByteBuffer r0 = org.lwjgl.BufferUtils.createByteBuffer(r0)
            r6 = r0
            org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSetVui r0 = new org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSetVui
            r1 = r0
            r2 = r6
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSetVui create(long r6) {
            org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSetVui r0 = new org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSetVui
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSetVui createSafe(long r6) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSetVui r0 = new org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSetVui
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSetVui.Buffer malloc(int r6) {
            org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSetVui$Buffer r0 = new org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSetVui$Buffer
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSetVui.SIZEOF
            long r2 = __checkMalloc(r2, r3)
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSetVui.Buffer calloc(int r7) {
            org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSetVui$Buffer r0 = new org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSetVui$Buffer
            r1 = r0
            r2 = r7
            long r2 = (long) r2
            int r3 = org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSetVui.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSetVui.Buffer create(int r10) {
            r0 = r10
            int r1 = org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSetVui.SIZEOF
            java.nio.ByteBuffer r0 = __create(r0, r1)
            r11 = r0
            org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSetVui$Buffer r0 = new org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSetVui$Buffer
            r1 = r0
            r2 = r11
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            r3 = r11
            r4 = -1
            r5 = 0
            r6 = r10
            r7 = r10
            r1.<init>(r2, r3, r4, r5, r6, r7)
            return r0
    }

    public static org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSetVui.Buffer create(long r6, int r8) {
            org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSetVui$Buffer r0 = new org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSetVui$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSetVui.Buffer createSafe(long r6, int r8) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSetVui$Buffer r0 = new org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSetVui$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSetVui malloc(org.lwjgl.system.MemoryStack r6) {
            org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSetVui r0 = new org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSetVui
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSetVui.ALIGNOF
            int r4 = org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSetVui.SIZEOF
            long r2 = r2.nmalloc(r3, r4)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSetVui calloc(org.lwjgl.system.MemoryStack r7) {
            org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSetVui r0 = new org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSetVui
            r1 = r0
            r2 = r7
            int r3 = org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSetVui.ALIGNOF
            r4 = 1
            int r5 = org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSetVui.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSetVui.Buffer malloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSetVui$Buffer r0 = new org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSetVui$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSetVui.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSetVui.SIZEOF
            int r4 = r4 * r5
            long r2 = r2.nmalloc(r3, r4)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSetVui.Buffer calloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSetVui$Buffer r0 = new org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSetVui$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSetVui.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSetVui.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.video.StdVideoH265SpsVuiFlags nflags(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSetVui.FLAGS
            long r1 = (long) r1
            long r0 = r0 + r1
            org.lwjgl.vulkan.video.StdVideoH265SpsVuiFlags r0 = org.lwjgl.vulkan.video.StdVideoH265SpsVuiFlags.create(r0)
            return r0
    }

    public static int naspect_ratio_idc(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSetVui.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSetVui.ASPECT_RATIO_IDC
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static short nsar_width(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSetVui.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSetVui.SAR_WIDTH
            long r3 = (long) r3
            long r2 = r2 + r3
            short r0 = r0.getShort(r1, r2)
            return r0
    }

    public static short nsar_height(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSetVui.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSetVui.SAR_HEIGHT
            long r3 = (long) r3
            long r2 = r2 + r3
            short r0 = r0.getShort(r1, r2)
            return r0
    }

    public static byte nvideo_format(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSetVui.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSetVui.VIDEO_FORMAT
            long r3 = (long) r3
            long r2 = r2 + r3
            byte r0 = r0.getByte(r1, r2)
            return r0
    }

    public static byte ncolour_primaries(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSetVui.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSetVui.COLOUR_PRIMARIES
            long r3 = (long) r3
            long r2 = r2 + r3
            byte r0 = r0.getByte(r1, r2)
            return r0
    }

    public static byte ntransfer_characteristics(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSetVui.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSetVui.TRANSFER_CHARACTERISTICS
            long r3 = (long) r3
            long r2 = r2 + r3
            byte r0 = r0.getByte(r1, r2)
            return r0
    }

    public static byte nmatrix_coeffs(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSetVui.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSetVui.MATRIX_COEFFS
            long r3 = (long) r3
            long r2 = r2 + r3
            byte r0 = r0.getByte(r1, r2)
            return r0
    }

    public static byte nchroma_sample_loc_type_top_field(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSetVui.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSetVui.CHROMA_SAMPLE_LOC_TYPE_TOP_FIELD
            long r3 = (long) r3
            long r2 = r2 + r3
            byte r0 = r0.getByte(r1, r2)
            return r0
    }

    public static byte nchroma_sample_loc_type_bottom_field(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSetVui.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSetVui.CHROMA_SAMPLE_LOC_TYPE_BOTTOM_FIELD
            long r3 = (long) r3
            long r2 = r2 + r3
            byte r0 = r0.getByte(r1, r2)
            return r0
    }

    public static byte nreserved1(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSetVui.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSetVui.RESERVED1
            long r3 = (long) r3
            long r2 = r2 + r3
            byte r0 = r0.getByte(r1, r2)
            return r0
    }

    public static byte nreserved2(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSetVui.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSetVui.RESERVED2
            long r3 = (long) r3
            long r2 = r2 + r3
            byte r0 = r0.getByte(r1, r2)
            return r0
    }

    public static short ndef_disp_win_left_offset(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSetVui.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSetVui.DEF_DISP_WIN_LEFT_OFFSET
            long r3 = (long) r3
            long r2 = r2 + r3
            short r0 = r0.getShort(r1, r2)
            return r0
    }

    public static short ndef_disp_win_right_offset(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSetVui.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSetVui.DEF_DISP_WIN_RIGHT_OFFSET
            long r3 = (long) r3
            long r2 = r2 + r3
            short r0 = r0.getShort(r1, r2)
            return r0
    }

    public static short ndef_disp_win_top_offset(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSetVui.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSetVui.DEF_DISP_WIN_TOP_OFFSET
            long r3 = (long) r3
            long r2 = r2 + r3
            short r0 = r0.getShort(r1, r2)
            return r0
    }

    public static short ndef_disp_win_bottom_offset(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSetVui.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSetVui.DEF_DISP_WIN_BOTTOM_OFFSET
            long r3 = (long) r3
            long r2 = r2 + r3
            short r0 = r0.getShort(r1, r2)
            return r0
    }

    public static int nvui_num_units_in_tick(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSetVui.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSetVui.VUI_NUM_UNITS_IN_TICK
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int nvui_time_scale(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSetVui.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSetVui.VUI_TIME_SCALE
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int nvui_num_ticks_poc_diff_one_minus1(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSetVui.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSetVui.VUI_NUM_TICKS_POC_DIFF_ONE_MINUS1
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static short nmin_spatial_segmentation_idc(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSetVui.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSetVui.MIN_SPATIAL_SEGMENTATION_IDC
            long r3 = (long) r3
            long r2 = r2 + r3
            short r0 = r0.getShort(r1, r2)
            return r0
    }

    public static short nreserved3(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSetVui.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSetVui.RESERVED3
            long r3 = (long) r3
            long r2 = r2 + r3
            short r0 = r0.getShort(r1, r2)
            return r0
    }

    public static byte nmax_bytes_per_pic_denom(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSetVui.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSetVui.MAX_BYTES_PER_PIC_DENOM
            long r3 = (long) r3
            long r2 = r2 + r3
            byte r0 = r0.getByte(r1, r2)
            return r0
    }

    public static byte nmax_bits_per_min_cu_denom(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSetVui.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSetVui.MAX_BITS_PER_MIN_CU_DENOM
            long r3 = (long) r3
            long r2 = r2 + r3
            byte r0 = r0.getByte(r1, r2)
            return r0
    }

    public static byte nlog2_max_mv_length_horizontal(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSetVui.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSetVui.LOG2_MAX_MV_LENGTH_HORIZONTAL
            long r3 = (long) r3
            long r2 = r2 + r3
            byte r0 = r0.getByte(r1, r2)
            return r0
    }

    public static byte nlog2_max_mv_length_vertical(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSetVui.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSetVui.LOG2_MAX_MV_LENGTH_VERTICAL
            long r3 = (long) r3
            long r2 = r2 + r3
            byte r0 = r0.getByte(r1, r2)
            return r0
    }

    public static org.lwjgl.vulkan.video.StdVideoH265HrdParameters npHrdParameters(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSetVui.PHRDPARAMETERS
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            org.lwjgl.vulkan.video.StdVideoH265HrdParameters r0 = org.lwjgl.vulkan.video.StdVideoH265HrdParameters.create(r0)
            return r0
    }

    public static void nflags(long r7, org.lwjgl.vulkan.video.StdVideoH265SpsVuiFlags r9) {
            r0 = r9
            long r0 = r0.address()
            r1 = r7
            int r2 = org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSetVui.FLAGS
            long r2 = (long) r2
            long r1 = r1 + r2
            int r2 = org.lwjgl.vulkan.video.StdVideoH265SpsVuiFlags.SIZEOF
            long r2 = (long) r2
            org.lwjgl.system.MemoryUtil.memCopy(r0, r1, r2)
            return
    }

    public static void naspect_ratio_idc(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSetVui.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSetVui.ASPECT_RATIO_IDC
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void nsar_width(long r7, short r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSetVui.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSetVui.SAR_WIDTH
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putShort(r1, r2, r3)
            return
    }

    public static void nsar_height(long r7, short r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSetVui.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSetVui.SAR_HEIGHT
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putShort(r1, r2, r3)
            return
    }

    public static void nvideo_format(long r7, byte r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSetVui.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSetVui.VIDEO_FORMAT
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putByte(r1, r2, r3)
            return
    }

    public static void ncolour_primaries(long r7, byte r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSetVui.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSetVui.COLOUR_PRIMARIES
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putByte(r1, r2, r3)
            return
    }

    public static void ntransfer_characteristics(long r7, byte r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSetVui.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSetVui.TRANSFER_CHARACTERISTICS
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putByte(r1, r2, r3)
            return
    }

    public static void nmatrix_coeffs(long r7, byte r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSetVui.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSetVui.MATRIX_COEFFS
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putByte(r1, r2, r3)
            return
    }

    public static void nchroma_sample_loc_type_top_field(long r7, byte r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSetVui.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSetVui.CHROMA_SAMPLE_LOC_TYPE_TOP_FIELD
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putByte(r1, r2, r3)
            return
    }

    public static void nchroma_sample_loc_type_bottom_field(long r7, byte r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSetVui.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSetVui.CHROMA_SAMPLE_LOC_TYPE_BOTTOM_FIELD
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putByte(r1, r2, r3)
            return
    }

    public static void nreserved1(long r7, byte r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSetVui.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSetVui.RESERVED1
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putByte(r1, r2, r3)
            return
    }

    public static void nreserved2(long r7, byte r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSetVui.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSetVui.RESERVED2
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putByte(r1, r2, r3)
            return
    }

    public static void ndef_disp_win_left_offset(long r7, short r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSetVui.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSetVui.DEF_DISP_WIN_LEFT_OFFSET
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putShort(r1, r2, r3)
            return
    }

    public static void ndef_disp_win_right_offset(long r7, short r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSetVui.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSetVui.DEF_DISP_WIN_RIGHT_OFFSET
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putShort(r1, r2, r3)
            return
    }

    public static void ndef_disp_win_top_offset(long r7, short r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSetVui.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSetVui.DEF_DISP_WIN_TOP_OFFSET
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putShort(r1, r2, r3)
            return
    }

    public static void ndef_disp_win_bottom_offset(long r7, short r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSetVui.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSetVui.DEF_DISP_WIN_BOTTOM_OFFSET
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putShort(r1, r2, r3)
            return
    }

    public static void nvui_num_units_in_tick(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSetVui.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSetVui.VUI_NUM_UNITS_IN_TICK
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void nvui_time_scale(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSetVui.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSetVui.VUI_TIME_SCALE
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void nvui_num_ticks_poc_diff_one_minus1(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSetVui.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSetVui.VUI_NUM_TICKS_POC_DIFF_ONE_MINUS1
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void nmin_spatial_segmentation_idc(long r7, short r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSetVui.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSetVui.MIN_SPATIAL_SEGMENTATION_IDC
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putShort(r1, r2, r3)
            return
    }

    public static void nreserved3(long r7, short r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSetVui.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSetVui.RESERVED3
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putShort(r1, r2, r3)
            return
    }

    public static void nmax_bytes_per_pic_denom(long r7, byte r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSetVui.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSetVui.MAX_BYTES_PER_PIC_DENOM
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putByte(r1, r2, r3)
            return
    }

    public static void nmax_bits_per_min_cu_denom(long r7, byte r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSetVui.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSetVui.MAX_BITS_PER_MIN_CU_DENOM
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putByte(r1, r2, r3)
            return
    }

    public static void nlog2_max_mv_length_horizontal(long r7, byte r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSetVui.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSetVui.LOG2_MAX_MV_LENGTH_HORIZONTAL
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putByte(r1, r2, r3)
            return
    }

    public static void nlog2_max_mv_length_vertical(long r7, byte r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSetVui.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSetVui.LOG2_MAX_MV_LENGTH_VERTICAL
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putByte(r1, r2, r3)
            return
    }

    public static void npHrdParameters(long r5, org.lwjgl.vulkan.video.StdVideoH265HrdParameters r7) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSetVui.PHRDPARAMETERS
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            long r1 = r1.address()
            org.lwjgl.system.MemoryUtil.memPutAddress(r0, r1)
            return
    }

    public static void validate(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSetVui.PHRDPARAMETERS
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            r7 = r0
            r0 = r7
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r7
            org.lwjgl.vulkan.video.StdVideoH265HrdParameters.validate(r0)
            return
    }

    @Override // org.lwjgl.system.Struct
    protected /* bridge */ /* synthetic */ org.lwjgl.system.Struct create(long r6, @javax.annotation.Nullable java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSetVui r0 = r0.create(r1, r2)
            return r0
    }

    static {
            r0 = 26
            org.lwjgl.system.Struct$Member[] r0 = new org.lwjgl.system.Struct.Member[r0]
            r1 = r0
            r2 = 0
            int r3 = org.lwjgl.vulkan.video.StdVideoH265SpsVuiFlags.SIZEOF
            int r4 = org.lwjgl.vulkan.video.StdVideoH265SpsVuiFlags.ALIGNOF
            org.lwjgl.system.Struct$Member r3 = __member(r3, r4)
            r1[r2] = r3
            r1 = r0
            r2 = 1
            r3 = 4
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 2
            r3 = 2
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 3
            r3 = 2
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 4
            r3 = 1
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 5
            r3 = 1
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 6
            r3 = 1
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 7
            r3 = 1
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 8
            r3 = 1
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 9
            r3 = 1
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 10
            r3 = 1
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 11
            r3 = 1
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 12
            r3 = 2
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 13
            r3 = 2
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 14
            r3 = 2
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 15
            r3 = 2
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 16
            r3 = 4
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 17
            r3 = 4
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 18
            r3 = 4
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 19
            r3 = 2
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 20
            r3 = 2
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 21
            r3 = 1
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 22
            r3 = 1
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 23
            r3 = 1
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 24
            r3 = 1
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 25
            int r3 = org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSetVui.POINTER_SIZE
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            org.lwjgl.system.Struct$Layout r0 = __struct(r0)
            r6 = r0
            r0 = r6
            int r0 = r0.getSize()
            org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSetVui.SIZEOF = r0
            r0 = r6
            int r0 = r0.getAlignment()
            org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSetVui.ALIGNOF = r0
            r0 = r6
            r1 = 0
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSetVui.FLAGS = r0
            r0 = r6
            r1 = 1
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSetVui.ASPECT_RATIO_IDC = r0
            r0 = r6
            r1 = 2
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSetVui.SAR_WIDTH = r0
            r0 = r6
            r1 = 3
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSetVui.SAR_HEIGHT = r0
            r0 = r6
            r1 = 4
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSetVui.VIDEO_FORMAT = r0
            r0 = r6
            r1 = 5
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSetVui.COLOUR_PRIMARIES = r0
            r0 = r6
            r1 = 6
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSetVui.TRANSFER_CHARACTERISTICS = r0
            r0 = r6
            r1 = 7
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSetVui.MATRIX_COEFFS = r0
            r0 = r6
            r1 = 8
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSetVui.CHROMA_SAMPLE_LOC_TYPE_TOP_FIELD = r0
            r0 = r6
            r1 = 9
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSetVui.CHROMA_SAMPLE_LOC_TYPE_BOTTOM_FIELD = r0
            r0 = r6
            r1 = 10
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSetVui.RESERVED1 = r0
            r0 = r6
            r1 = 11
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSetVui.RESERVED2 = r0
            r0 = r6
            r1 = 12
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSetVui.DEF_DISP_WIN_LEFT_OFFSET = r0
            r0 = r6
            r1 = 13
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSetVui.DEF_DISP_WIN_RIGHT_OFFSET = r0
            r0 = r6
            r1 = 14
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSetVui.DEF_DISP_WIN_TOP_OFFSET = r0
            r0 = r6
            r1 = 15
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSetVui.DEF_DISP_WIN_BOTTOM_OFFSET = r0
            r0 = r6
            r1 = 16
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSetVui.VUI_NUM_UNITS_IN_TICK = r0
            r0 = r6
            r1 = 17
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSetVui.VUI_TIME_SCALE = r0
            r0 = r6
            r1 = 18
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSetVui.VUI_NUM_TICKS_POC_DIFF_ONE_MINUS1 = r0
            r0 = r6
            r1 = 19
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSetVui.MIN_SPATIAL_SEGMENTATION_IDC = r0
            r0 = r6
            r1 = 20
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSetVui.RESERVED3 = r0
            r0 = r6
            r1 = 21
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSetVui.MAX_BYTES_PER_PIC_DENOM = r0
            r0 = r6
            r1 = 22
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSetVui.MAX_BITS_PER_MIN_CU_DENOM = r0
            r0 = r6
            r1 = 23
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSetVui.LOG2_MAX_MV_LENGTH_HORIZONTAL = r0
            r0 = r6
            r1 = 24
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSetVui.LOG2_MAX_MV_LENGTH_VERTICAL = r0
            r0 = r6
            r1 = 25
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSetVui.PHRDPARAMETERS = r0
            return
    }
}
