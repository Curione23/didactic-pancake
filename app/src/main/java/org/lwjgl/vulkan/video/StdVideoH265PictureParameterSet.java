package org.lwjgl.vulkan.video;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/video/StdVideoH265PictureParameterSet.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/video/StdVideoH265PictureParameterSet.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/video/StdVideoH265PictureParameterSet.class */
public class StdVideoH265PictureParameterSet extends org.lwjgl.system.Struct<org.lwjgl.vulkan.video.StdVideoH265PictureParameterSet> implements org.lwjgl.system.NativeResource {
    public static final int SIZEOF = 0;
    public static final int ALIGNOF = 0;
    public static final int FLAGS = 0;
    public static final int PPS_PIC_PARAMETER_SET_ID = 0;
    public static final int PPS_SEQ_PARAMETER_SET_ID = 0;
    public static final int SPS_VIDEO_PARAMETER_SET_ID = 0;
    public static final int NUM_EXTRA_SLICE_HEADER_BITS = 0;
    public static final int NUM_REF_IDX_L0_DEFAULT_ACTIVE_MINUS1 = 0;
    public static final int NUM_REF_IDX_L1_DEFAULT_ACTIVE_MINUS1 = 0;
    public static final int INIT_QP_MINUS26 = 0;
    public static final int DIFF_CU_QP_DELTA_DEPTH = 0;
    public static final int PPS_CB_QP_OFFSET = 0;
    public static final int PPS_CR_QP_OFFSET = 0;
    public static final int PPS_BETA_OFFSET_DIV2 = 0;
    public static final int PPS_TC_OFFSET_DIV2 = 0;
    public static final int LOG2_PARALLEL_MERGE_LEVEL_MINUS2 = 0;
    public static final int LOG2_MAX_TRANSFORM_SKIP_BLOCK_SIZE_MINUS2 = 0;
    public static final int DIFF_CU_CHROMA_QP_OFFSET_DEPTH = 0;
    public static final int CHROMA_QP_OFFSET_LIST_LEN_MINUS1 = 0;
    public static final int CB_QP_OFFSET_LIST = 0;
    public static final int CR_QP_OFFSET_LIST = 0;
    public static final int LOG2_SAO_OFFSET_SCALE_LUMA = 0;
    public static final int LOG2_SAO_OFFSET_SCALE_CHROMA = 0;
    public static final int PPS_ACT_Y_QP_OFFSET_PLUS5 = 0;
    public static final int PPS_ACT_CB_QP_OFFSET_PLUS5 = 0;
    public static final int PPS_ACT_CR_QP_OFFSET_PLUS3 = 0;
    public static final int PPS_NUM_PALETTE_PREDICTOR_INITIALIZERS = 0;
    public static final int LUMA_BIT_DEPTH_ENTRY_MINUS8 = 0;
    public static final int CHROMA_BIT_DEPTH_ENTRY_MINUS8 = 0;
    public static final int NUM_TILE_COLUMNS_MINUS1 = 0;
    public static final int NUM_TILE_ROWS_MINUS1 = 0;
    public static final int RESERVED1 = 0;
    public static final int RESERVED2 = 0;
    public static final int COLUMN_WIDTH_MINUS1 = 0;
    public static final int ROW_HEIGHT_MINUS1 = 0;
    public static final int RESERVED3 = 0;
    public static final int PSCALINGLISTS = 0;
    public static final int PPREDICTORPALETTEENTRIES = 0;

    /* JADX WARN: Classes with same name are omitted, all sources:
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/video/StdVideoH265PictureParameterSet$Buffer.class
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/video/StdVideoH265PictureParameterSet$Buffer.class
     */
    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/video/StdVideoH265PictureParameterSet$Buffer.class */
    public static class Buffer extends org.lwjgl.system.StructBuffer<org.lwjgl.vulkan.video.StdVideoH265PictureParameterSet, org.lwjgl.vulkan.video.StdVideoH265PictureParameterSet.Buffer> implements org.lwjgl.system.NativeResource {
        private static final org.lwjgl.vulkan.video.StdVideoH265PictureParameterSet ELEMENT_FACTORY = null;

        public Buffer(java.nio.ByteBuffer r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r6
                int r2 = r2.remaining()
                int r3 = org.lwjgl.vulkan.video.StdVideoH265PictureParameterSet.SIZEOF
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
        protected org.lwjgl.vulkan.video.StdVideoH265PictureParameterSet.Buffer self() {
                r2 = this;
                r0 = r2
                return r0
        }

        @Override // org.lwjgl.system.StructBuffer
        protected org.lwjgl.vulkan.video.StdVideoH265PictureParameterSet getElementFactory() {
                r2 = this;
                org.lwjgl.vulkan.video.StdVideoH265PictureParameterSet r0 = org.lwjgl.vulkan.video.StdVideoH265PictureParameterSet.Buffer.ELEMENT_FACTORY
                return r0
        }

        public org.lwjgl.vulkan.video.StdVideoH265PpsFlags flags() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                org.lwjgl.vulkan.video.StdVideoH265PpsFlags r0 = org.lwjgl.vulkan.video.StdVideoH265PictureParameterSet.nflags(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint8_t")
        public byte pps_pic_parameter_set_id() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                byte r0 = org.lwjgl.vulkan.video.StdVideoH265PictureParameterSet.npps_pic_parameter_set_id(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint8_t")
        public byte pps_seq_parameter_set_id() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                byte r0 = org.lwjgl.vulkan.video.StdVideoH265PictureParameterSet.npps_seq_parameter_set_id(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint8_t")
        public byte sps_video_parameter_set_id() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                byte r0 = org.lwjgl.vulkan.video.StdVideoH265PictureParameterSet.nsps_video_parameter_set_id(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint8_t")
        public byte num_extra_slice_header_bits() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                byte r0 = org.lwjgl.vulkan.video.StdVideoH265PictureParameterSet.nnum_extra_slice_header_bits(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint8_t")
        public byte num_ref_idx_l0_default_active_minus1() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                byte r0 = org.lwjgl.vulkan.video.StdVideoH265PictureParameterSet.nnum_ref_idx_l0_default_active_minus1(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint8_t")
        public byte num_ref_idx_l1_default_active_minus1() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                byte r0 = org.lwjgl.vulkan.video.StdVideoH265PictureParameterSet.nnum_ref_idx_l1_default_active_minus1(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("int8_t")
        public byte init_qp_minus26() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                byte r0 = org.lwjgl.vulkan.video.StdVideoH265PictureParameterSet.ninit_qp_minus26(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint8_t")
        public byte diff_cu_qp_delta_depth() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                byte r0 = org.lwjgl.vulkan.video.StdVideoH265PictureParameterSet.ndiff_cu_qp_delta_depth(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("int8_t")
        public byte pps_cb_qp_offset() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                byte r0 = org.lwjgl.vulkan.video.StdVideoH265PictureParameterSet.npps_cb_qp_offset(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("int8_t")
        public byte pps_cr_qp_offset() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                byte r0 = org.lwjgl.vulkan.video.StdVideoH265PictureParameterSet.npps_cr_qp_offset(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("int8_t")
        public byte pps_beta_offset_div2() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                byte r0 = org.lwjgl.vulkan.video.StdVideoH265PictureParameterSet.npps_beta_offset_div2(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("int8_t")
        public byte pps_tc_offset_div2() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                byte r0 = org.lwjgl.vulkan.video.StdVideoH265PictureParameterSet.npps_tc_offset_div2(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint8_t")
        public byte log2_parallel_merge_level_minus2() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                byte r0 = org.lwjgl.vulkan.video.StdVideoH265PictureParameterSet.nlog2_parallel_merge_level_minus2(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint8_t")
        public byte log2_max_transform_skip_block_size_minus2() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                byte r0 = org.lwjgl.vulkan.video.StdVideoH265PictureParameterSet.nlog2_max_transform_skip_block_size_minus2(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint8_t")
        public byte diff_cu_chroma_qp_offset_depth() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                byte r0 = org.lwjgl.vulkan.video.StdVideoH265PictureParameterSet.ndiff_cu_chroma_qp_offset_depth(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint8_t")
        public byte chroma_qp_offset_list_len_minus1() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                byte r0 = org.lwjgl.vulkan.video.StdVideoH265PictureParameterSet.nchroma_qp_offset_list_len_minus1(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("int8_t[STD_VIDEO_H265_CHROMA_QP_OFFSET_LIST_SIZE]")
        public java.nio.ByteBuffer cb_qp_offset_list() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                java.nio.ByteBuffer r0 = org.lwjgl.vulkan.video.StdVideoH265PictureParameterSet.ncb_qp_offset_list(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("int8_t")
        public byte cb_qp_offset_list(int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                byte r0 = org.lwjgl.vulkan.video.StdVideoH265PictureParameterSet.ncb_qp_offset_list(r0, r1)
                return r0
        }

        @org.lwjgl.system.NativeType("int8_t[STD_VIDEO_H265_CHROMA_QP_OFFSET_LIST_SIZE]")
        public java.nio.ByteBuffer cr_qp_offset_list() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                java.nio.ByteBuffer r0 = org.lwjgl.vulkan.video.StdVideoH265PictureParameterSet.ncr_qp_offset_list(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("int8_t")
        public byte cr_qp_offset_list(int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                byte r0 = org.lwjgl.vulkan.video.StdVideoH265PictureParameterSet.ncr_qp_offset_list(r0, r1)
                return r0
        }

        @org.lwjgl.system.NativeType("uint8_t")
        public byte log2_sao_offset_scale_luma() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                byte r0 = org.lwjgl.vulkan.video.StdVideoH265PictureParameterSet.nlog2_sao_offset_scale_luma(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint8_t")
        public byte log2_sao_offset_scale_chroma() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                byte r0 = org.lwjgl.vulkan.video.StdVideoH265PictureParameterSet.nlog2_sao_offset_scale_chroma(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("int8_t")
        public byte pps_act_y_qp_offset_plus5() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                byte r0 = org.lwjgl.vulkan.video.StdVideoH265PictureParameterSet.npps_act_y_qp_offset_plus5(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("int8_t")
        public byte pps_act_cb_qp_offset_plus5() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                byte r0 = org.lwjgl.vulkan.video.StdVideoH265PictureParameterSet.npps_act_cb_qp_offset_plus5(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("int8_t")
        public byte pps_act_cr_qp_offset_plus3() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                byte r0 = org.lwjgl.vulkan.video.StdVideoH265PictureParameterSet.npps_act_cr_qp_offset_plus3(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint8_t")
        public byte pps_num_palette_predictor_initializers() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                byte r0 = org.lwjgl.vulkan.video.StdVideoH265PictureParameterSet.npps_num_palette_predictor_initializers(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint8_t")
        public byte luma_bit_depth_entry_minus8() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                byte r0 = org.lwjgl.vulkan.video.StdVideoH265PictureParameterSet.nluma_bit_depth_entry_minus8(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint8_t")
        public byte chroma_bit_depth_entry_minus8() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                byte r0 = org.lwjgl.vulkan.video.StdVideoH265PictureParameterSet.nchroma_bit_depth_entry_minus8(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint8_t")
        public byte num_tile_columns_minus1() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                byte r0 = org.lwjgl.vulkan.video.StdVideoH265PictureParameterSet.nnum_tile_columns_minus1(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint8_t")
        public byte num_tile_rows_minus1() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                byte r0 = org.lwjgl.vulkan.video.StdVideoH265PictureParameterSet.nnum_tile_rows_minus1(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint16_t[STD_VIDEO_H265_CHROMA_QP_OFFSET_TILE_COLS_LIST_SIZE]")
        public java.nio.ShortBuffer column_width_minus1() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                java.nio.ShortBuffer r0 = org.lwjgl.vulkan.video.StdVideoH265PictureParameterSet.ncolumn_width_minus1(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint16_t")
        public short column_width_minus1(int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                short r0 = org.lwjgl.vulkan.video.StdVideoH265PictureParameterSet.ncolumn_width_minus1(r0, r1)
                return r0
        }

        @org.lwjgl.system.NativeType("uint16_t[STD_VIDEO_H265_CHROMA_QP_OFFSET_TILE_ROWS_LIST_SIZE]")
        public java.nio.ShortBuffer row_height_minus1() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                java.nio.ShortBuffer r0 = org.lwjgl.vulkan.video.StdVideoH265PictureParameterSet.nrow_height_minus1(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint16_t")
        public short row_height_minus1(int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                short r0 = org.lwjgl.vulkan.video.StdVideoH265PictureParameterSet.nrow_height_minus1(r0, r1)
                return r0
        }

        @org.lwjgl.system.NativeType("StdVideoH265ScalingLists const *")
        public org.lwjgl.vulkan.video.StdVideoH265ScalingLists pScalingLists() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                org.lwjgl.vulkan.video.StdVideoH265ScalingLists r0 = org.lwjgl.vulkan.video.StdVideoH265PictureParameterSet.npScalingLists(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("StdVideoH265PredictorPaletteEntries const *")
        public org.lwjgl.vulkan.video.StdVideoH265PredictorPaletteEntries pPredictorPaletteEntries() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                org.lwjgl.vulkan.video.StdVideoH265PredictorPaletteEntries r0 = org.lwjgl.vulkan.video.StdVideoH265PictureParameterSet.npPredictorPaletteEntries(r0)
                return r0
        }

        public org.lwjgl.vulkan.video.StdVideoH265PictureParameterSet.Buffer flags(org.lwjgl.vulkan.video.StdVideoH265PpsFlags r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.video.StdVideoH265PictureParameterSet.nflags(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.video.StdVideoH265PictureParameterSet.Buffer flags(java.util.function.Consumer<org.lwjgl.vulkan.video.StdVideoH265PpsFlags> r4) {
                r3 = this;
                r0 = r4
                r1 = r3
                org.lwjgl.vulkan.video.StdVideoH265PpsFlags r1 = r1.flags()
                r0.accept(r1)
                r0 = r3
                return r0
        }

        public org.lwjgl.vulkan.video.StdVideoH265PictureParameterSet.Buffer pps_pic_parameter_set_id(@org.lwjgl.system.NativeType("uint8_t") byte r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.video.StdVideoH265PictureParameterSet.npps_pic_parameter_set_id(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.video.StdVideoH265PictureParameterSet.Buffer pps_seq_parameter_set_id(@org.lwjgl.system.NativeType("uint8_t") byte r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.video.StdVideoH265PictureParameterSet.npps_seq_parameter_set_id(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.video.StdVideoH265PictureParameterSet.Buffer sps_video_parameter_set_id(@org.lwjgl.system.NativeType("uint8_t") byte r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.video.StdVideoH265PictureParameterSet.nsps_video_parameter_set_id(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.video.StdVideoH265PictureParameterSet.Buffer num_extra_slice_header_bits(@org.lwjgl.system.NativeType("uint8_t") byte r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.video.StdVideoH265PictureParameterSet.nnum_extra_slice_header_bits(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.video.StdVideoH265PictureParameterSet.Buffer num_ref_idx_l0_default_active_minus1(@org.lwjgl.system.NativeType("uint8_t") byte r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.video.StdVideoH265PictureParameterSet.nnum_ref_idx_l0_default_active_minus1(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.video.StdVideoH265PictureParameterSet.Buffer num_ref_idx_l1_default_active_minus1(@org.lwjgl.system.NativeType("uint8_t") byte r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.video.StdVideoH265PictureParameterSet.nnum_ref_idx_l1_default_active_minus1(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.video.StdVideoH265PictureParameterSet.Buffer init_qp_minus26(@org.lwjgl.system.NativeType("int8_t") byte r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.video.StdVideoH265PictureParameterSet.ninit_qp_minus26(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.video.StdVideoH265PictureParameterSet.Buffer diff_cu_qp_delta_depth(@org.lwjgl.system.NativeType("uint8_t") byte r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.video.StdVideoH265PictureParameterSet.ndiff_cu_qp_delta_depth(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.video.StdVideoH265PictureParameterSet.Buffer pps_cb_qp_offset(@org.lwjgl.system.NativeType("int8_t") byte r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.video.StdVideoH265PictureParameterSet.npps_cb_qp_offset(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.video.StdVideoH265PictureParameterSet.Buffer pps_cr_qp_offset(@org.lwjgl.system.NativeType("int8_t") byte r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.video.StdVideoH265PictureParameterSet.npps_cr_qp_offset(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.video.StdVideoH265PictureParameterSet.Buffer pps_beta_offset_div2(@org.lwjgl.system.NativeType("int8_t") byte r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.video.StdVideoH265PictureParameterSet.npps_beta_offset_div2(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.video.StdVideoH265PictureParameterSet.Buffer pps_tc_offset_div2(@org.lwjgl.system.NativeType("int8_t") byte r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.video.StdVideoH265PictureParameterSet.npps_tc_offset_div2(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.video.StdVideoH265PictureParameterSet.Buffer log2_parallel_merge_level_minus2(@org.lwjgl.system.NativeType("uint8_t") byte r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.video.StdVideoH265PictureParameterSet.nlog2_parallel_merge_level_minus2(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.video.StdVideoH265PictureParameterSet.Buffer log2_max_transform_skip_block_size_minus2(@org.lwjgl.system.NativeType("uint8_t") byte r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.video.StdVideoH265PictureParameterSet.nlog2_max_transform_skip_block_size_minus2(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.video.StdVideoH265PictureParameterSet.Buffer diff_cu_chroma_qp_offset_depth(@org.lwjgl.system.NativeType("uint8_t") byte r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.video.StdVideoH265PictureParameterSet.ndiff_cu_chroma_qp_offset_depth(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.video.StdVideoH265PictureParameterSet.Buffer chroma_qp_offset_list_len_minus1(@org.lwjgl.system.NativeType("uint8_t") byte r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.video.StdVideoH265PictureParameterSet.nchroma_qp_offset_list_len_minus1(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.video.StdVideoH265PictureParameterSet.Buffer cb_qp_offset_list(@org.lwjgl.system.NativeType("int8_t[STD_VIDEO_H265_CHROMA_QP_OFFSET_LIST_SIZE]") java.nio.ByteBuffer r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.video.StdVideoH265PictureParameterSet.ncb_qp_offset_list(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.video.StdVideoH265PictureParameterSet.Buffer cb_qp_offset_list(int r6, @org.lwjgl.system.NativeType("int8_t") byte r7) {
                r5 = this;
                r0 = r5
                long r0 = r0.address()
                r1 = r6
                r2 = r7
                org.lwjgl.vulkan.video.StdVideoH265PictureParameterSet.ncb_qp_offset_list(r0, r1, r2)
                r0 = r5
                return r0
        }

        public org.lwjgl.vulkan.video.StdVideoH265PictureParameterSet.Buffer cr_qp_offset_list(@org.lwjgl.system.NativeType("int8_t[STD_VIDEO_H265_CHROMA_QP_OFFSET_LIST_SIZE]") java.nio.ByteBuffer r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.video.StdVideoH265PictureParameterSet.ncr_qp_offset_list(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.video.StdVideoH265PictureParameterSet.Buffer cr_qp_offset_list(int r6, @org.lwjgl.system.NativeType("int8_t") byte r7) {
                r5 = this;
                r0 = r5
                long r0 = r0.address()
                r1 = r6
                r2 = r7
                org.lwjgl.vulkan.video.StdVideoH265PictureParameterSet.ncr_qp_offset_list(r0, r1, r2)
                r0 = r5
                return r0
        }

        public org.lwjgl.vulkan.video.StdVideoH265PictureParameterSet.Buffer log2_sao_offset_scale_luma(@org.lwjgl.system.NativeType("uint8_t") byte r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.video.StdVideoH265PictureParameterSet.nlog2_sao_offset_scale_luma(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.video.StdVideoH265PictureParameterSet.Buffer log2_sao_offset_scale_chroma(@org.lwjgl.system.NativeType("uint8_t") byte r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.video.StdVideoH265PictureParameterSet.nlog2_sao_offset_scale_chroma(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.video.StdVideoH265PictureParameterSet.Buffer pps_act_y_qp_offset_plus5(@org.lwjgl.system.NativeType("int8_t") byte r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.video.StdVideoH265PictureParameterSet.npps_act_y_qp_offset_plus5(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.video.StdVideoH265PictureParameterSet.Buffer pps_act_cb_qp_offset_plus5(@org.lwjgl.system.NativeType("int8_t") byte r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.video.StdVideoH265PictureParameterSet.npps_act_cb_qp_offset_plus5(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.video.StdVideoH265PictureParameterSet.Buffer pps_act_cr_qp_offset_plus3(@org.lwjgl.system.NativeType("int8_t") byte r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.video.StdVideoH265PictureParameterSet.npps_act_cr_qp_offset_plus3(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.video.StdVideoH265PictureParameterSet.Buffer pps_num_palette_predictor_initializers(@org.lwjgl.system.NativeType("uint8_t") byte r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.video.StdVideoH265PictureParameterSet.npps_num_palette_predictor_initializers(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.video.StdVideoH265PictureParameterSet.Buffer luma_bit_depth_entry_minus8(@org.lwjgl.system.NativeType("uint8_t") byte r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.video.StdVideoH265PictureParameterSet.nluma_bit_depth_entry_minus8(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.video.StdVideoH265PictureParameterSet.Buffer chroma_bit_depth_entry_minus8(@org.lwjgl.system.NativeType("uint8_t") byte r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.video.StdVideoH265PictureParameterSet.nchroma_bit_depth_entry_minus8(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.video.StdVideoH265PictureParameterSet.Buffer num_tile_columns_minus1(@org.lwjgl.system.NativeType("uint8_t") byte r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.video.StdVideoH265PictureParameterSet.nnum_tile_columns_minus1(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.video.StdVideoH265PictureParameterSet.Buffer num_tile_rows_minus1(@org.lwjgl.system.NativeType("uint8_t") byte r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.video.StdVideoH265PictureParameterSet.nnum_tile_rows_minus1(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.video.StdVideoH265PictureParameterSet.Buffer column_width_minus1(@org.lwjgl.system.NativeType("uint16_t[STD_VIDEO_H265_CHROMA_QP_OFFSET_TILE_COLS_LIST_SIZE]") java.nio.ShortBuffer r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.video.StdVideoH265PictureParameterSet.ncolumn_width_minus1(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.video.StdVideoH265PictureParameterSet.Buffer column_width_minus1(int r6, @org.lwjgl.system.NativeType("uint16_t") short r7) {
                r5 = this;
                r0 = r5
                long r0 = r0.address()
                r1 = r6
                r2 = r7
                org.lwjgl.vulkan.video.StdVideoH265PictureParameterSet.ncolumn_width_minus1(r0, r1, r2)
                r0 = r5
                return r0
        }

        public org.lwjgl.vulkan.video.StdVideoH265PictureParameterSet.Buffer row_height_minus1(@org.lwjgl.system.NativeType("uint16_t[STD_VIDEO_H265_CHROMA_QP_OFFSET_TILE_ROWS_LIST_SIZE]") java.nio.ShortBuffer r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.video.StdVideoH265PictureParameterSet.nrow_height_minus1(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.video.StdVideoH265PictureParameterSet.Buffer row_height_minus1(int r6, @org.lwjgl.system.NativeType("uint16_t") short r7) {
                r5 = this;
                r0 = r5
                long r0 = r0.address()
                r1 = r6
                r2 = r7
                org.lwjgl.vulkan.video.StdVideoH265PictureParameterSet.nrow_height_minus1(r0, r1, r2)
                r0 = r5
                return r0
        }

        public org.lwjgl.vulkan.video.StdVideoH265PictureParameterSet.Buffer pScalingLists(@org.lwjgl.system.NativeType("StdVideoH265ScalingLists const *") org.lwjgl.vulkan.video.StdVideoH265ScalingLists r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.video.StdVideoH265PictureParameterSet.npScalingLists(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.video.StdVideoH265PictureParameterSet.Buffer pPredictorPaletteEntries(@org.lwjgl.system.NativeType("StdVideoH265PredictorPaletteEntries const *") org.lwjgl.vulkan.video.StdVideoH265PredictorPaletteEntries r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.video.StdVideoH265PictureParameterSet.npPredictorPaletteEntries(r0, r1)
                r0 = r4
                return r0
        }

        @Override // org.lwjgl.system.StructBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.Struct getElementFactory() {
                r2 = this;
                r0 = r2
                org.lwjgl.vulkan.video.StdVideoH265PictureParameterSet r0 = r0.getElementFactory()
                return r0
        }

        @Override // org.lwjgl.system.CustomBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.CustomBuffer self() {
                r2 = this;
                r0 = r2
                org.lwjgl.vulkan.video.StdVideoH265PictureParameterSet$Buffer r0 = r0.self()
                return r0
        }

        static {
                r0 = -1
                org.lwjgl.vulkan.video.StdVideoH265PictureParameterSet r0 = org.lwjgl.vulkan.video.StdVideoH265PictureParameterSet.create(r0)
                org.lwjgl.vulkan.video.StdVideoH265PictureParameterSet.Buffer.ELEMENT_FACTORY = r0
                return
        }
    }

    protected StdVideoH265PictureParameterSet(long r6, @javax.annotation.Nullable java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    protected org.lwjgl.vulkan.video.StdVideoH265PictureParameterSet create(long r7, @javax.annotation.Nullable java.nio.ByteBuffer r9) {
            r6 = this;
            org.lwjgl.vulkan.video.StdVideoH265PictureParameterSet r0 = new org.lwjgl.vulkan.video.StdVideoH265PictureParameterSet
            r1 = r0
            r2 = r7
            r3 = r9
            r1.<init>(r2, r3)
            return r0
    }

    public StdVideoH265PictureParameterSet(java.nio.ByteBuffer r7) {
            r6 = this;
            r0 = r6
            r1 = r7
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            r2 = r7
            int r3 = org.lwjgl.vulkan.video.StdVideoH265PictureParameterSet.SIZEOF
            java.nio.ByteBuffer r2 = __checkContainer(r2, r3)
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
            r2 = this;
            int r0 = org.lwjgl.vulkan.video.StdVideoH265PictureParameterSet.SIZEOF
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoH265PpsFlags flags() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            org.lwjgl.vulkan.video.StdVideoH265PpsFlags r0 = nflags(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("uint8_t")
    public byte pps_pic_parameter_set_id() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            byte r0 = npps_pic_parameter_set_id(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("uint8_t")
    public byte pps_seq_parameter_set_id() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            byte r0 = npps_seq_parameter_set_id(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("uint8_t")
    public byte sps_video_parameter_set_id() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            byte r0 = nsps_video_parameter_set_id(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("uint8_t")
    public byte num_extra_slice_header_bits() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            byte r0 = nnum_extra_slice_header_bits(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("uint8_t")
    public byte num_ref_idx_l0_default_active_minus1() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            byte r0 = nnum_ref_idx_l0_default_active_minus1(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("uint8_t")
    public byte num_ref_idx_l1_default_active_minus1() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            byte r0 = nnum_ref_idx_l1_default_active_minus1(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("int8_t")
    public byte init_qp_minus26() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            byte r0 = ninit_qp_minus26(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("uint8_t")
    public byte diff_cu_qp_delta_depth() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            byte r0 = ndiff_cu_qp_delta_depth(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("int8_t")
    public byte pps_cb_qp_offset() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            byte r0 = npps_cb_qp_offset(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("int8_t")
    public byte pps_cr_qp_offset() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            byte r0 = npps_cr_qp_offset(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("int8_t")
    public byte pps_beta_offset_div2() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            byte r0 = npps_beta_offset_div2(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("int8_t")
    public byte pps_tc_offset_div2() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            byte r0 = npps_tc_offset_div2(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("uint8_t")
    public byte log2_parallel_merge_level_minus2() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            byte r0 = nlog2_parallel_merge_level_minus2(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("uint8_t")
    public byte log2_max_transform_skip_block_size_minus2() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            byte r0 = nlog2_max_transform_skip_block_size_minus2(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("uint8_t")
    public byte diff_cu_chroma_qp_offset_depth() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            byte r0 = ndiff_cu_chroma_qp_offset_depth(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("uint8_t")
    public byte chroma_qp_offset_list_len_minus1() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            byte r0 = nchroma_qp_offset_list_len_minus1(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("int8_t[STD_VIDEO_H265_CHROMA_QP_OFFSET_LIST_SIZE]")
    public java.nio.ByteBuffer cb_qp_offset_list() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            java.nio.ByteBuffer r0 = ncb_qp_offset_list(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("int8_t")
    public byte cb_qp_offset_list(int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            byte r0 = ncb_qp_offset_list(r0, r1)
            return r0
    }

    @org.lwjgl.system.NativeType("int8_t[STD_VIDEO_H265_CHROMA_QP_OFFSET_LIST_SIZE]")
    public java.nio.ByteBuffer cr_qp_offset_list() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            java.nio.ByteBuffer r0 = ncr_qp_offset_list(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("int8_t")
    public byte cr_qp_offset_list(int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            byte r0 = ncr_qp_offset_list(r0, r1)
            return r0
    }

    @org.lwjgl.system.NativeType("uint8_t")
    public byte log2_sao_offset_scale_luma() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            byte r0 = nlog2_sao_offset_scale_luma(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("uint8_t")
    public byte log2_sao_offset_scale_chroma() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            byte r0 = nlog2_sao_offset_scale_chroma(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("int8_t")
    public byte pps_act_y_qp_offset_plus5() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            byte r0 = npps_act_y_qp_offset_plus5(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("int8_t")
    public byte pps_act_cb_qp_offset_plus5() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            byte r0 = npps_act_cb_qp_offset_plus5(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("int8_t")
    public byte pps_act_cr_qp_offset_plus3() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            byte r0 = npps_act_cr_qp_offset_plus3(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("uint8_t")
    public byte pps_num_palette_predictor_initializers() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            byte r0 = npps_num_palette_predictor_initializers(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("uint8_t")
    public byte luma_bit_depth_entry_minus8() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            byte r0 = nluma_bit_depth_entry_minus8(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("uint8_t")
    public byte chroma_bit_depth_entry_minus8() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            byte r0 = nchroma_bit_depth_entry_minus8(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("uint8_t")
    public byte num_tile_columns_minus1() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            byte r0 = nnum_tile_columns_minus1(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("uint8_t")
    public byte num_tile_rows_minus1() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            byte r0 = nnum_tile_rows_minus1(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("uint16_t[STD_VIDEO_H265_CHROMA_QP_OFFSET_TILE_COLS_LIST_SIZE]")
    public java.nio.ShortBuffer column_width_minus1() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            java.nio.ShortBuffer r0 = ncolumn_width_minus1(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("uint16_t")
    public short column_width_minus1(int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            short r0 = ncolumn_width_minus1(r0, r1)
            return r0
    }

    @org.lwjgl.system.NativeType("uint16_t[STD_VIDEO_H265_CHROMA_QP_OFFSET_TILE_ROWS_LIST_SIZE]")
    public java.nio.ShortBuffer row_height_minus1() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            java.nio.ShortBuffer r0 = nrow_height_minus1(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("uint16_t")
    public short row_height_minus1(int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            short r0 = nrow_height_minus1(r0, r1)
            return r0
    }

    @org.lwjgl.system.NativeType("StdVideoH265ScalingLists const *")
    public org.lwjgl.vulkan.video.StdVideoH265ScalingLists pScalingLists() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            org.lwjgl.vulkan.video.StdVideoH265ScalingLists r0 = npScalingLists(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("StdVideoH265PredictorPaletteEntries const *")
    public org.lwjgl.vulkan.video.StdVideoH265PredictorPaletteEntries pPredictorPaletteEntries() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            org.lwjgl.vulkan.video.StdVideoH265PredictorPaletteEntries r0 = npPredictorPaletteEntries(r0)
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoH265PictureParameterSet flags(org.lwjgl.vulkan.video.StdVideoH265PpsFlags r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nflags(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoH265PictureParameterSet flags(java.util.function.Consumer<org.lwjgl.vulkan.video.StdVideoH265PpsFlags> r4) {
            r3 = this;
            r0 = r4
            r1 = r3
            org.lwjgl.vulkan.video.StdVideoH265PpsFlags r1 = r1.flags()
            r0.accept(r1)
            r0 = r3
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoH265PictureParameterSet pps_pic_parameter_set_id(@org.lwjgl.system.NativeType("uint8_t") byte r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            npps_pic_parameter_set_id(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoH265PictureParameterSet pps_seq_parameter_set_id(@org.lwjgl.system.NativeType("uint8_t") byte r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            npps_seq_parameter_set_id(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoH265PictureParameterSet sps_video_parameter_set_id(@org.lwjgl.system.NativeType("uint8_t") byte r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nsps_video_parameter_set_id(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoH265PictureParameterSet num_extra_slice_header_bits(@org.lwjgl.system.NativeType("uint8_t") byte r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nnum_extra_slice_header_bits(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoH265PictureParameterSet num_ref_idx_l0_default_active_minus1(@org.lwjgl.system.NativeType("uint8_t") byte r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nnum_ref_idx_l0_default_active_minus1(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoH265PictureParameterSet num_ref_idx_l1_default_active_minus1(@org.lwjgl.system.NativeType("uint8_t") byte r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nnum_ref_idx_l1_default_active_minus1(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoH265PictureParameterSet init_qp_minus26(@org.lwjgl.system.NativeType("int8_t") byte r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            ninit_qp_minus26(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoH265PictureParameterSet diff_cu_qp_delta_depth(@org.lwjgl.system.NativeType("uint8_t") byte r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            ndiff_cu_qp_delta_depth(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoH265PictureParameterSet pps_cb_qp_offset(@org.lwjgl.system.NativeType("int8_t") byte r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            npps_cb_qp_offset(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoH265PictureParameterSet pps_cr_qp_offset(@org.lwjgl.system.NativeType("int8_t") byte r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            npps_cr_qp_offset(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoH265PictureParameterSet pps_beta_offset_div2(@org.lwjgl.system.NativeType("int8_t") byte r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            npps_beta_offset_div2(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoH265PictureParameterSet pps_tc_offset_div2(@org.lwjgl.system.NativeType("int8_t") byte r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            npps_tc_offset_div2(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoH265PictureParameterSet log2_parallel_merge_level_minus2(@org.lwjgl.system.NativeType("uint8_t") byte r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nlog2_parallel_merge_level_minus2(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoH265PictureParameterSet log2_max_transform_skip_block_size_minus2(@org.lwjgl.system.NativeType("uint8_t") byte r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nlog2_max_transform_skip_block_size_minus2(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoH265PictureParameterSet diff_cu_chroma_qp_offset_depth(@org.lwjgl.system.NativeType("uint8_t") byte r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            ndiff_cu_chroma_qp_offset_depth(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoH265PictureParameterSet chroma_qp_offset_list_len_minus1(@org.lwjgl.system.NativeType("uint8_t") byte r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nchroma_qp_offset_list_len_minus1(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoH265PictureParameterSet cb_qp_offset_list(@org.lwjgl.system.NativeType("int8_t[STD_VIDEO_H265_CHROMA_QP_OFFSET_LIST_SIZE]") java.nio.ByteBuffer r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            ncb_qp_offset_list(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoH265PictureParameterSet cb_qp_offset_list(int r6, @org.lwjgl.system.NativeType("int8_t") byte r7) {
            r5 = this;
            r0 = r5
            long r0 = r0.address()
            r1 = r6
            r2 = r7
            ncb_qp_offset_list(r0, r1, r2)
            r0 = r5
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoH265PictureParameterSet cr_qp_offset_list(@org.lwjgl.system.NativeType("int8_t[STD_VIDEO_H265_CHROMA_QP_OFFSET_LIST_SIZE]") java.nio.ByteBuffer r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            ncr_qp_offset_list(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoH265PictureParameterSet cr_qp_offset_list(int r6, @org.lwjgl.system.NativeType("int8_t") byte r7) {
            r5 = this;
            r0 = r5
            long r0 = r0.address()
            r1 = r6
            r2 = r7
            ncr_qp_offset_list(r0, r1, r2)
            r0 = r5
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoH265PictureParameterSet log2_sao_offset_scale_luma(@org.lwjgl.system.NativeType("uint8_t") byte r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nlog2_sao_offset_scale_luma(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoH265PictureParameterSet log2_sao_offset_scale_chroma(@org.lwjgl.system.NativeType("uint8_t") byte r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nlog2_sao_offset_scale_chroma(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoH265PictureParameterSet pps_act_y_qp_offset_plus5(@org.lwjgl.system.NativeType("int8_t") byte r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            npps_act_y_qp_offset_plus5(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoH265PictureParameterSet pps_act_cb_qp_offset_plus5(@org.lwjgl.system.NativeType("int8_t") byte r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            npps_act_cb_qp_offset_plus5(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoH265PictureParameterSet pps_act_cr_qp_offset_plus3(@org.lwjgl.system.NativeType("int8_t") byte r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            npps_act_cr_qp_offset_plus3(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoH265PictureParameterSet pps_num_palette_predictor_initializers(@org.lwjgl.system.NativeType("uint8_t") byte r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            npps_num_palette_predictor_initializers(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoH265PictureParameterSet luma_bit_depth_entry_minus8(@org.lwjgl.system.NativeType("uint8_t") byte r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nluma_bit_depth_entry_minus8(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoH265PictureParameterSet chroma_bit_depth_entry_minus8(@org.lwjgl.system.NativeType("uint8_t") byte r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nchroma_bit_depth_entry_minus8(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoH265PictureParameterSet num_tile_columns_minus1(@org.lwjgl.system.NativeType("uint8_t") byte r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nnum_tile_columns_minus1(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoH265PictureParameterSet num_tile_rows_minus1(@org.lwjgl.system.NativeType("uint8_t") byte r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nnum_tile_rows_minus1(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoH265PictureParameterSet column_width_minus1(@org.lwjgl.system.NativeType("uint16_t[STD_VIDEO_H265_CHROMA_QP_OFFSET_TILE_COLS_LIST_SIZE]") java.nio.ShortBuffer r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            ncolumn_width_minus1(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoH265PictureParameterSet column_width_minus1(int r6, @org.lwjgl.system.NativeType("uint16_t") short r7) {
            r5 = this;
            r0 = r5
            long r0 = r0.address()
            r1 = r6
            r2 = r7
            ncolumn_width_minus1(r0, r1, r2)
            r0 = r5
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoH265PictureParameterSet row_height_minus1(@org.lwjgl.system.NativeType("uint16_t[STD_VIDEO_H265_CHROMA_QP_OFFSET_TILE_ROWS_LIST_SIZE]") java.nio.ShortBuffer r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nrow_height_minus1(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoH265PictureParameterSet row_height_minus1(int r6, @org.lwjgl.system.NativeType("uint16_t") short r7) {
            r5 = this;
            r0 = r5
            long r0 = r0.address()
            r1 = r6
            r2 = r7
            nrow_height_minus1(r0, r1, r2)
            r0 = r5
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoH265PictureParameterSet pScalingLists(@org.lwjgl.system.NativeType("StdVideoH265ScalingLists const *") org.lwjgl.vulkan.video.StdVideoH265ScalingLists r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            npScalingLists(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoH265PictureParameterSet pPredictorPaletteEntries(@org.lwjgl.system.NativeType("StdVideoH265PredictorPaletteEntries const *") org.lwjgl.vulkan.video.StdVideoH265PredictorPaletteEntries r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            npPredictorPaletteEntries(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoH265PictureParameterSet set(org.lwjgl.vulkan.video.StdVideoH265PpsFlags r4, byte r5, byte r6, byte r7, byte r8, byte r9, byte r10, byte r11, byte r12, byte r13, byte r14, byte r15, byte r16, byte r17, byte r18, byte r19, byte r20, java.nio.ByteBuffer r21, java.nio.ByteBuffer r22, byte r23, byte r24, byte r25, byte r26, byte r27, byte r28, byte r29, byte r30, byte r31, byte r32, java.nio.ShortBuffer r33, java.nio.ShortBuffer r34, org.lwjgl.vulkan.video.StdVideoH265ScalingLists r35, org.lwjgl.vulkan.video.StdVideoH265PredictorPaletteEntries r36) {
            r3 = this;
            r0 = r3
            r1 = r4
            org.lwjgl.vulkan.video.StdVideoH265PictureParameterSet r0 = r0.flags(r1)
            r0 = r3
            r1 = r5
            org.lwjgl.vulkan.video.StdVideoH265PictureParameterSet r0 = r0.pps_pic_parameter_set_id(r1)
            r0 = r3
            r1 = r6
            org.lwjgl.vulkan.video.StdVideoH265PictureParameterSet r0 = r0.pps_seq_parameter_set_id(r1)
            r0 = r3
            r1 = r7
            org.lwjgl.vulkan.video.StdVideoH265PictureParameterSet r0 = r0.sps_video_parameter_set_id(r1)
            r0 = r3
            r1 = r8
            org.lwjgl.vulkan.video.StdVideoH265PictureParameterSet r0 = r0.num_extra_slice_header_bits(r1)
            r0 = r3
            r1 = r9
            org.lwjgl.vulkan.video.StdVideoH265PictureParameterSet r0 = r0.num_ref_idx_l0_default_active_minus1(r1)
            r0 = r3
            r1 = r10
            org.lwjgl.vulkan.video.StdVideoH265PictureParameterSet r0 = r0.num_ref_idx_l1_default_active_minus1(r1)
            r0 = r3
            r1 = r11
            org.lwjgl.vulkan.video.StdVideoH265PictureParameterSet r0 = r0.init_qp_minus26(r1)
            r0 = r3
            r1 = r12
            org.lwjgl.vulkan.video.StdVideoH265PictureParameterSet r0 = r0.diff_cu_qp_delta_depth(r1)
            r0 = r3
            r1 = r13
            org.lwjgl.vulkan.video.StdVideoH265PictureParameterSet r0 = r0.pps_cb_qp_offset(r1)
            r0 = r3
            r1 = r14
            org.lwjgl.vulkan.video.StdVideoH265PictureParameterSet r0 = r0.pps_cr_qp_offset(r1)
            r0 = r3
            r1 = r15
            org.lwjgl.vulkan.video.StdVideoH265PictureParameterSet r0 = r0.pps_beta_offset_div2(r1)
            r0 = r3
            r1 = r16
            org.lwjgl.vulkan.video.StdVideoH265PictureParameterSet r0 = r0.pps_tc_offset_div2(r1)
            r0 = r3
            r1 = r17
            org.lwjgl.vulkan.video.StdVideoH265PictureParameterSet r0 = r0.log2_parallel_merge_level_minus2(r1)
            r0 = r3
            r1 = r18
            org.lwjgl.vulkan.video.StdVideoH265PictureParameterSet r0 = r0.log2_max_transform_skip_block_size_minus2(r1)
            r0 = r3
            r1 = r19
            org.lwjgl.vulkan.video.StdVideoH265PictureParameterSet r0 = r0.diff_cu_chroma_qp_offset_depth(r1)
            r0 = r3
            r1 = r20
            org.lwjgl.vulkan.video.StdVideoH265PictureParameterSet r0 = r0.chroma_qp_offset_list_len_minus1(r1)
            r0 = r3
            r1 = r21
            org.lwjgl.vulkan.video.StdVideoH265PictureParameterSet r0 = r0.cb_qp_offset_list(r1)
            r0 = r3
            r1 = r22
            org.lwjgl.vulkan.video.StdVideoH265PictureParameterSet r0 = r0.cr_qp_offset_list(r1)
            r0 = r3
            r1 = r23
            org.lwjgl.vulkan.video.StdVideoH265PictureParameterSet r0 = r0.log2_sao_offset_scale_luma(r1)
            r0 = r3
            r1 = r24
            org.lwjgl.vulkan.video.StdVideoH265PictureParameterSet r0 = r0.log2_sao_offset_scale_chroma(r1)
            r0 = r3
            r1 = r25
            org.lwjgl.vulkan.video.StdVideoH265PictureParameterSet r0 = r0.pps_act_y_qp_offset_plus5(r1)
            r0 = r3
            r1 = r26
            org.lwjgl.vulkan.video.StdVideoH265PictureParameterSet r0 = r0.pps_act_cb_qp_offset_plus5(r1)
            r0 = r3
            r1 = r27
            org.lwjgl.vulkan.video.StdVideoH265PictureParameterSet r0 = r0.pps_act_cr_qp_offset_plus3(r1)
            r0 = r3
            r1 = r28
            org.lwjgl.vulkan.video.StdVideoH265PictureParameterSet r0 = r0.pps_num_palette_predictor_initializers(r1)
            r0 = r3
            r1 = r29
            org.lwjgl.vulkan.video.StdVideoH265PictureParameterSet r0 = r0.luma_bit_depth_entry_minus8(r1)
            r0 = r3
            r1 = r30
            org.lwjgl.vulkan.video.StdVideoH265PictureParameterSet r0 = r0.chroma_bit_depth_entry_minus8(r1)
            r0 = r3
            r1 = r31
            org.lwjgl.vulkan.video.StdVideoH265PictureParameterSet r0 = r0.num_tile_columns_minus1(r1)
            r0 = r3
            r1 = r32
            org.lwjgl.vulkan.video.StdVideoH265PictureParameterSet r0 = r0.num_tile_rows_minus1(r1)
            r0 = r3
            r1 = r33
            org.lwjgl.vulkan.video.StdVideoH265PictureParameterSet r0 = r0.column_width_minus1(r1)
            r0 = r3
            r1 = r34
            org.lwjgl.vulkan.video.StdVideoH265PictureParameterSet r0 = r0.row_height_minus1(r1)
            r0 = r3
            r1 = r35
            org.lwjgl.vulkan.video.StdVideoH265PictureParameterSet r0 = r0.pScalingLists(r1)
            r0 = r3
            r1 = r36
            org.lwjgl.vulkan.video.StdVideoH265PictureParameterSet r0 = r0.pPredictorPaletteEntries(r1)
            r0 = r3
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoH265PictureParameterSet set(org.lwjgl.vulkan.video.StdVideoH265PictureParameterSet r8) {
            r7 = this;
            r0 = r8
            long r0 = r0.address()
            r1 = r7
            long r1 = r1.address()
            int r2 = org.lwjgl.vulkan.video.StdVideoH265PictureParameterSet.SIZEOF
            long r2 = (long) r2
            org.lwjgl.system.MemoryUtil.memCopy(r0, r1, r2)
            r0 = r7
            return r0
    }

    public static org.lwjgl.vulkan.video.StdVideoH265PictureParameterSet malloc() {
            org.lwjgl.vulkan.video.StdVideoH265PictureParameterSet r0 = new org.lwjgl.vulkan.video.StdVideoH265PictureParameterSet
            r1 = r0
            int r2 = org.lwjgl.vulkan.video.StdVideoH265PictureParameterSet.SIZEOF
            long r2 = (long) r2
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.video.StdVideoH265PictureParameterSet calloc() {
            org.lwjgl.vulkan.video.StdVideoH265PictureParameterSet r0 = new org.lwjgl.vulkan.video.StdVideoH265PictureParameterSet
            r1 = r0
            r2 = 1
            int r3 = org.lwjgl.vulkan.video.StdVideoH265PictureParameterSet.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.video.StdVideoH265PictureParameterSet create() {
            int r0 = org.lwjgl.vulkan.video.StdVideoH265PictureParameterSet.SIZEOF
            java.nio.ByteBuffer r0 = org.lwjgl.BufferUtils.createByteBuffer(r0)
            r6 = r0
            org.lwjgl.vulkan.video.StdVideoH265PictureParameterSet r0 = new org.lwjgl.vulkan.video.StdVideoH265PictureParameterSet
            r1 = r0
            r2 = r6
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.video.StdVideoH265PictureParameterSet create(long r6) {
            org.lwjgl.vulkan.video.StdVideoH265PictureParameterSet r0 = new org.lwjgl.vulkan.video.StdVideoH265PictureParameterSet
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.vulkan.video.StdVideoH265PictureParameterSet createSafe(long r6) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.vulkan.video.StdVideoH265PictureParameterSet r0 = new org.lwjgl.vulkan.video.StdVideoH265PictureParameterSet
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static org.lwjgl.vulkan.video.StdVideoH265PictureParameterSet.Buffer malloc(int r6) {
            org.lwjgl.vulkan.video.StdVideoH265PictureParameterSet$Buffer r0 = new org.lwjgl.vulkan.video.StdVideoH265PictureParameterSet$Buffer
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.vulkan.video.StdVideoH265PictureParameterSet.SIZEOF
            long r2 = __checkMalloc(r2, r3)
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.video.StdVideoH265PictureParameterSet.Buffer calloc(int r7) {
            org.lwjgl.vulkan.video.StdVideoH265PictureParameterSet$Buffer r0 = new org.lwjgl.vulkan.video.StdVideoH265PictureParameterSet$Buffer
            r1 = r0
            r2 = r7
            long r2 = (long) r2
            int r3 = org.lwjgl.vulkan.video.StdVideoH265PictureParameterSet.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.video.StdVideoH265PictureParameterSet.Buffer create(int r10) {
            r0 = r10
            int r1 = org.lwjgl.vulkan.video.StdVideoH265PictureParameterSet.SIZEOF
            java.nio.ByteBuffer r0 = __create(r0, r1)
            r11 = r0
            org.lwjgl.vulkan.video.StdVideoH265PictureParameterSet$Buffer r0 = new org.lwjgl.vulkan.video.StdVideoH265PictureParameterSet$Buffer
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

    public static org.lwjgl.vulkan.video.StdVideoH265PictureParameterSet.Buffer create(long r6, int r8) {
            org.lwjgl.vulkan.video.StdVideoH265PictureParameterSet$Buffer r0 = new org.lwjgl.vulkan.video.StdVideoH265PictureParameterSet$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.vulkan.video.StdVideoH265PictureParameterSet.Buffer createSafe(long r6, int r8) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.vulkan.video.StdVideoH265PictureParameterSet$Buffer r0 = new org.lwjgl.vulkan.video.StdVideoH265PictureParameterSet$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static org.lwjgl.vulkan.video.StdVideoH265PictureParameterSet malloc(org.lwjgl.system.MemoryStack r6) {
            org.lwjgl.vulkan.video.StdVideoH265PictureParameterSet r0 = new org.lwjgl.vulkan.video.StdVideoH265PictureParameterSet
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.vulkan.video.StdVideoH265PictureParameterSet.ALIGNOF
            int r4 = org.lwjgl.vulkan.video.StdVideoH265PictureParameterSet.SIZEOF
            long r2 = r2.nmalloc(r3, r4)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.video.StdVideoH265PictureParameterSet calloc(org.lwjgl.system.MemoryStack r7) {
            org.lwjgl.vulkan.video.StdVideoH265PictureParameterSet r0 = new org.lwjgl.vulkan.video.StdVideoH265PictureParameterSet
            r1 = r0
            r2 = r7
            int r3 = org.lwjgl.vulkan.video.StdVideoH265PictureParameterSet.ALIGNOF
            r4 = 1
            int r5 = org.lwjgl.vulkan.video.StdVideoH265PictureParameterSet.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.video.StdVideoH265PictureParameterSet.Buffer malloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.vulkan.video.StdVideoH265PictureParameterSet$Buffer r0 = new org.lwjgl.vulkan.video.StdVideoH265PictureParameterSet$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.vulkan.video.StdVideoH265PictureParameterSet.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.vulkan.video.StdVideoH265PictureParameterSet.SIZEOF
            int r4 = r4 * r5
            long r2 = r2.nmalloc(r3, r4)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.video.StdVideoH265PictureParameterSet.Buffer calloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.vulkan.video.StdVideoH265PictureParameterSet$Buffer r0 = new org.lwjgl.vulkan.video.StdVideoH265PictureParameterSet$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.vulkan.video.StdVideoH265PictureParameterSet.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.vulkan.video.StdVideoH265PictureParameterSet.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.video.StdVideoH265PpsFlags nflags(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.video.StdVideoH265PictureParameterSet.FLAGS
            long r1 = (long) r1
            long r0 = r0 + r1
            org.lwjgl.vulkan.video.StdVideoH265PpsFlags r0 = org.lwjgl.vulkan.video.StdVideoH265PpsFlags.create(r0)
            return r0
    }

    public static byte npps_pic_parameter_set_id(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.video.StdVideoH265PictureParameterSet.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.video.StdVideoH265PictureParameterSet.PPS_PIC_PARAMETER_SET_ID
            long r3 = (long) r3
            long r2 = r2 + r3
            byte r0 = r0.getByte(r1, r2)
            return r0
    }

    public static byte npps_seq_parameter_set_id(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.video.StdVideoH265PictureParameterSet.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.video.StdVideoH265PictureParameterSet.PPS_SEQ_PARAMETER_SET_ID
            long r3 = (long) r3
            long r2 = r2 + r3
            byte r0 = r0.getByte(r1, r2)
            return r0
    }

    public static byte nsps_video_parameter_set_id(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.video.StdVideoH265PictureParameterSet.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.video.StdVideoH265PictureParameterSet.SPS_VIDEO_PARAMETER_SET_ID
            long r3 = (long) r3
            long r2 = r2 + r3
            byte r0 = r0.getByte(r1, r2)
            return r0
    }

    public static byte nnum_extra_slice_header_bits(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.video.StdVideoH265PictureParameterSet.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.video.StdVideoH265PictureParameterSet.NUM_EXTRA_SLICE_HEADER_BITS
            long r3 = (long) r3
            long r2 = r2 + r3
            byte r0 = r0.getByte(r1, r2)
            return r0
    }

    public static byte nnum_ref_idx_l0_default_active_minus1(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.video.StdVideoH265PictureParameterSet.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.video.StdVideoH265PictureParameterSet.NUM_REF_IDX_L0_DEFAULT_ACTIVE_MINUS1
            long r3 = (long) r3
            long r2 = r2 + r3
            byte r0 = r0.getByte(r1, r2)
            return r0
    }

    public static byte nnum_ref_idx_l1_default_active_minus1(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.video.StdVideoH265PictureParameterSet.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.video.StdVideoH265PictureParameterSet.NUM_REF_IDX_L1_DEFAULT_ACTIVE_MINUS1
            long r3 = (long) r3
            long r2 = r2 + r3
            byte r0 = r0.getByte(r1, r2)
            return r0
    }

    public static byte ninit_qp_minus26(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.video.StdVideoH265PictureParameterSet.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.video.StdVideoH265PictureParameterSet.INIT_QP_MINUS26
            long r3 = (long) r3
            long r2 = r2 + r3
            byte r0 = r0.getByte(r1, r2)
            return r0
    }

    public static byte ndiff_cu_qp_delta_depth(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.video.StdVideoH265PictureParameterSet.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.video.StdVideoH265PictureParameterSet.DIFF_CU_QP_DELTA_DEPTH
            long r3 = (long) r3
            long r2 = r2 + r3
            byte r0 = r0.getByte(r1, r2)
            return r0
    }

    public static byte npps_cb_qp_offset(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.video.StdVideoH265PictureParameterSet.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.video.StdVideoH265PictureParameterSet.PPS_CB_QP_OFFSET
            long r3 = (long) r3
            long r2 = r2 + r3
            byte r0 = r0.getByte(r1, r2)
            return r0
    }

    public static byte npps_cr_qp_offset(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.video.StdVideoH265PictureParameterSet.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.video.StdVideoH265PictureParameterSet.PPS_CR_QP_OFFSET
            long r3 = (long) r3
            long r2 = r2 + r3
            byte r0 = r0.getByte(r1, r2)
            return r0
    }

    public static byte npps_beta_offset_div2(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.video.StdVideoH265PictureParameterSet.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.video.StdVideoH265PictureParameterSet.PPS_BETA_OFFSET_DIV2
            long r3 = (long) r3
            long r2 = r2 + r3
            byte r0 = r0.getByte(r1, r2)
            return r0
    }

    public static byte npps_tc_offset_div2(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.video.StdVideoH265PictureParameterSet.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.video.StdVideoH265PictureParameterSet.PPS_TC_OFFSET_DIV2
            long r3 = (long) r3
            long r2 = r2 + r3
            byte r0 = r0.getByte(r1, r2)
            return r0
    }

    public static byte nlog2_parallel_merge_level_minus2(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.video.StdVideoH265PictureParameterSet.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.video.StdVideoH265PictureParameterSet.LOG2_PARALLEL_MERGE_LEVEL_MINUS2
            long r3 = (long) r3
            long r2 = r2 + r3
            byte r0 = r0.getByte(r1, r2)
            return r0
    }

    public static byte nlog2_max_transform_skip_block_size_minus2(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.video.StdVideoH265PictureParameterSet.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.video.StdVideoH265PictureParameterSet.LOG2_MAX_TRANSFORM_SKIP_BLOCK_SIZE_MINUS2
            long r3 = (long) r3
            long r2 = r2 + r3
            byte r0 = r0.getByte(r1, r2)
            return r0
    }

    public static byte ndiff_cu_chroma_qp_offset_depth(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.video.StdVideoH265PictureParameterSet.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.video.StdVideoH265PictureParameterSet.DIFF_CU_CHROMA_QP_OFFSET_DEPTH
            long r3 = (long) r3
            long r2 = r2 + r3
            byte r0 = r0.getByte(r1, r2)
            return r0
    }

    public static byte nchroma_qp_offset_list_len_minus1(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.video.StdVideoH265PictureParameterSet.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.video.StdVideoH265PictureParameterSet.CHROMA_QP_OFFSET_LIST_LEN_MINUS1
            long r3 = (long) r3
            long r2 = r2 + r3
            byte r0 = r0.getByte(r1, r2)
            return r0
    }

    public static java.nio.ByteBuffer ncb_qp_offset_list(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.video.StdVideoH265PictureParameterSet.CB_QP_OFFSET_LIST
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = 6
            java.nio.ByteBuffer r0 = org.lwjgl.system.MemoryUtil.memByteBuffer(r0, r1)
            return r0
    }

    public static byte ncb_qp_offset_list(long r9, int r11) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.video.StdVideoH265PictureParameterSet.UNSAFE
            r1 = 0
            r2 = r9
            int r3 = org.lwjgl.vulkan.video.StdVideoH265PictureParameterSet.CB_QP_OFFSET_LIST
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r11
            r4 = 6
            long r3 = org.lwjgl.system.Checks.check(r3, r4)
            r4 = 1
            long r3 = r3 * r4
            long r2 = r2 + r3
            byte r0 = r0.getByte(r1, r2)
            return r0
    }

    public static java.nio.ByteBuffer ncr_qp_offset_list(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.video.StdVideoH265PictureParameterSet.CR_QP_OFFSET_LIST
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = 6
            java.nio.ByteBuffer r0 = org.lwjgl.system.MemoryUtil.memByteBuffer(r0, r1)
            return r0
    }

    public static byte ncr_qp_offset_list(long r9, int r11) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.video.StdVideoH265PictureParameterSet.UNSAFE
            r1 = 0
            r2 = r9
            int r3 = org.lwjgl.vulkan.video.StdVideoH265PictureParameterSet.CR_QP_OFFSET_LIST
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r11
            r4 = 6
            long r3 = org.lwjgl.system.Checks.check(r3, r4)
            r4 = 1
            long r3 = r3 * r4
            long r2 = r2 + r3
            byte r0 = r0.getByte(r1, r2)
            return r0
    }

    public static byte nlog2_sao_offset_scale_luma(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.video.StdVideoH265PictureParameterSet.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.video.StdVideoH265PictureParameterSet.LOG2_SAO_OFFSET_SCALE_LUMA
            long r3 = (long) r3
            long r2 = r2 + r3
            byte r0 = r0.getByte(r1, r2)
            return r0
    }

    public static byte nlog2_sao_offset_scale_chroma(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.video.StdVideoH265PictureParameterSet.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.video.StdVideoH265PictureParameterSet.LOG2_SAO_OFFSET_SCALE_CHROMA
            long r3 = (long) r3
            long r2 = r2 + r3
            byte r0 = r0.getByte(r1, r2)
            return r0
    }

    public static byte npps_act_y_qp_offset_plus5(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.video.StdVideoH265PictureParameterSet.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.video.StdVideoH265PictureParameterSet.PPS_ACT_Y_QP_OFFSET_PLUS5
            long r3 = (long) r3
            long r2 = r2 + r3
            byte r0 = r0.getByte(r1, r2)
            return r0
    }

    public static byte npps_act_cb_qp_offset_plus5(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.video.StdVideoH265PictureParameterSet.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.video.StdVideoH265PictureParameterSet.PPS_ACT_CB_QP_OFFSET_PLUS5
            long r3 = (long) r3
            long r2 = r2 + r3
            byte r0 = r0.getByte(r1, r2)
            return r0
    }

    public static byte npps_act_cr_qp_offset_plus3(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.video.StdVideoH265PictureParameterSet.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.video.StdVideoH265PictureParameterSet.PPS_ACT_CR_QP_OFFSET_PLUS3
            long r3 = (long) r3
            long r2 = r2 + r3
            byte r0 = r0.getByte(r1, r2)
            return r0
    }

    public static byte npps_num_palette_predictor_initializers(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.video.StdVideoH265PictureParameterSet.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.video.StdVideoH265PictureParameterSet.PPS_NUM_PALETTE_PREDICTOR_INITIALIZERS
            long r3 = (long) r3
            long r2 = r2 + r3
            byte r0 = r0.getByte(r1, r2)
            return r0
    }

    public static byte nluma_bit_depth_entry_minus8(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.video.StdVideoH265PictureParameterSet.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.video.StdVideoH265PictureParameterSet.LUMA_BIT_DEPTH_ENTRY_MINUS8
            long r3 = (long) r3
            long r2 = r2 + r3
            byte r0 = r0.getByte(r1, r2)
            return r0
    }

    public static byte nchroma_bit_depth_entry_minus8(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.video.StdVideoH265PictureParameterSet.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.video.StdVideoH265PictureParameterSet.CHROMA_BIT_DEPTH_ENTRY_MINUS8
            long r3 = (long) r3
            long r2 = r2 + r3
            byte r0 = r0.getByte(r1, r2)
            return r0
    }

    public static byte nnum_tile_columns_minus1(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.video.StdVideoH265PictureParameterSet.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.video.StdVideoH265PictureParameterSet.NUM_TILE_COLUMNS_MINUS1
            long r3 = (long) r3
            long r2 = r2 + r3
            byte r0 = r0.getByte(r1, r2)
            return r0
    }

    public static byte nnum_tile_rows_minus1(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.video.StdVideoH265PictureParameterSet.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.video.StdVideoH265PictureParameterSet.NUM_TILE_ROWS_MINUS1
            long r3 = (long) r3
            long r2 = r2 + r3
            byte r0 = r0.getByte(r1, r2)
            return r0
    }

    public static byte nreserved1(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.video.StdVideoH265PictureParameterSet.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.video.StdVideoH265PictureParameterSet.RESERVED1
            long r3 = (long) r3
            long r2 = r2 + r3
            byte r0 = r0.getByte(r1, r2)
            return r0
    }

    public static byte nreserved2(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.video.StdVideoH265PictureParameterSet.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.video.StdVideoH265PictureParameterSet.RESERVED2
            long r3 = (long) r3
            long r2 = r2 + r3
            byte r0 = r0.getByte(r1, r2)
            return r0
    }

    public static java.nio.ShortBuffer ncolumn_width_minus1(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.video.StdVideoH265PictureParameterSet.COLUMN_WIDTH_MINUS1
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = 19
            java.nio.ShortBuffer r0 = org.lwjgl.system.MemoryUtil.memShortBuffer(r0, r1)
            return r0
    }

    public static short ncolumn_width_minus1(long r9, int r11) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.video.StdVideoH265PictureParameterSet.UNSAFE
            r1 = 0
            r2 = r9
            int r3 = org.lwjgl.vulkan.video.StdVideoH265PictureParameterSet.COLUMN_WIDTH_MINUS1
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r11
            r4 = 19
            long r3 = org.lwjgl.system.Checks.check(r3, r4)
            r4 = 2
            long r3 = r3 * r4
            long r2 = r2 + r3
            short r0 = r0.getShort(r1, r2)
            return r0
    }

    public static java.nio.ShortBuffer nrow_height_minus1(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.video.StdVideoH265PictureParameterSet.ROW_HEIGHT_MINUS1
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = 21
            java.nio.ShortBuffer r0 = org.lwjgl.system.MemoryUtil.memShortBuffer(r0, r1)
            return r0
    }

    public static short nrow_height_minus1(long r9, int r11) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.video.StdVideoH265PictureParameterSet.UNSAFE
            r1 = 0
            r2 = r9
            int r3 = org.lwjgl.vulkan.video.StdVideoH265PictureParameterSet.ROW_HEIGHT_MINUS1
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r11
            r4 = 21
            long r3 = org.lwjgl.system.Checks.check(r3, r4)
            r4 = 2
            long r3 = r3 * r4
            long r2 = r2 + r3
            short r0 = r0.getShort(r1, r2)
            return r0
    }

    public static int nreserved3(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.video.StdVideoH265PictureParameterSet.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.video.StdVideoH265PictureParameterSet.RESERVED3
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static org.lwjgl.vulkan.video.StdVideoH265ScalingLists npScalingLists(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.video.StdVideoH265PictureParameterSet.PSCALINGLISTS
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            org.lwjgl.vulkan.video.StdVideoH265ScalingLists r0 = org.lwjgl.vulkan.video.StdVideoH265ScalingLists.create(r0)
            return r0
    }

    public static org.lwjgl.vulkan.video.StdVideoH265PredictorPaletteEntries npPredictorPaletteEntries(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.video.StdVideoH265PictureParameterSet.PPREDICTORPALETTEENTRIES
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            org.lwjgl.vulkan.video.StdVideoH265PredictorPaletteEntries r0 = org.lwjgl.vulkan.video.StdVideoH265PredictorPaletteEntries.create(r0)
            return r0
    }

    public static void nflags(long r7, org.lwjgl.vulkan.video.StdVideoH265PpsFlags r9) {
            r0 = r9
            long r0 = r0.address()
            r1 = r7
            int r2 = org.lwjgl.vulkan.video.StdVideoH265PictureParameterSet.FLAGS
            long r2 = (long) r2
            long r1 = r1 + r2
            int r2 = org.lwjgl.vulkan.video.StdVideoH265PpsFlags.SIZEOF
            long r2 = (long) r2
            org.lwjgl.system.MemoryUtil.memCopy(r0, r1, r2)
            return
    }

    public static void npps_pic_parameter_set_id(long r7, byte r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.video.StdVideoH265PictureParameterSet.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.video.StdVideoH265PictureParameterSet.PPS_PIC_PARAMETER_SET_ID
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putByte(r1, r2, r3)
            return
    }

    public static void npps_seq_parameter_set_id(long r7, byte r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.video.StdVideoH265PictureParameterSet.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.video.StdVideoH265PictureParameterSet.PPS_SEQ_PARAMETER_SET_ID
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putByte(r1, r2, r3)
            return
    }

    public static void nsps_video_parameter_set_id(long r7, byte r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.video.StdVideoH265PictureParameterSet.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.video.StdVideoH265PictureParameterSet.SPS_VIDEO_PARAMETER_SET_ID
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putByte(r1, r2, r3)
            return
    }

    public static void nnum_extra_slice_header_bits(long r7, byte r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.video.StdVideoH265PictureParameterSet.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.video.StdVideoH265PictureParameterSet.NUM_EXTRA_SLICE_HEADER_BITS
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putByte(r1, r2, r3)
            return
    }

    public static void nnum_ref_idx_l0_default_active_minus1(long r7, byte r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.video.StdVideoH265PictureParameterSet.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.video.StdVideoH265PictureParameterSet.NUM_REF_IDX_L0_DEFAULT_ACTIVE_MINUS1
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putByte(r1, r2, r3)
            return
    }

    public static void nnum_ref_idx_l1_default_active_minus1(long r7, byte r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.video.StdVideoH265PictureParameterSet.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.video.StdVideoH265PictureParameterSet.NUM_REF_IDX_L1_DEFAULT_ACTIVE_MINUS1
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putByte(r1, r2, r3)
            return
    }

    public static void ninit_qp_minus26(long r7, byte r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.video.StdVideoH265PictureParameterSet.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.video.StdVideoH265PictureParameterSet.INIT_QP_MINUS26
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putByte(r1, r2, r3)
            return
    }

    public static void ndiff_cu_qp_delta_depth(long r7, byte r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.video.StdVideoH265PictureParameterSet.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.video.StdVideoH265PictureParameterSet.DIFF_CU_QP_DELTA_DEPTH
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putByte(r1, r2, r3)
            return
    }

    public static void npps_cb_qp_offset(long r7, byte r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.video.StdVideoH265PictureParameterSet.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.video.StdVideoH265PictureParameterSet.PPS_CB_QP_OFFSET
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putByte(r1, r2, r3)
            return
    }

    public static void npps_cr_qp_offset(long r7, byte r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.video.StdVideoH265PictureParameterSet.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.video.StdVideoH265PictureParameterSet.PPS_CR_QP_OFFSET
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putByte(r1, r2, r3)
            return
    }

    public static void npps_beta_offset_div2(long r7, byte r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.video.StdVideoH265PictureParameterSet.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.video.StdVideoH265PictureParameterSet.PPS_BETA_OFFSET_DIV2
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putByte(r1, r2, r3)
            return
    }

    public static void npps_tc_offset_div2(long r7, byte r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.video.StdVideoH265PictureParameterSet.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.video.StdVideoH265PictureParameterSet.PPS_TC_OFFSET_DIV2
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putByte(r1, r2, r3)
            return
    }

    public static void nlog2_parallel_merge_level_minus2(long r7, byte r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.video.StdVideoH265PictureParameterSet.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.video.StdVideoH265PictureParameterSet.LOG2_PARALLEL_MERGE_LEVEL_MINUS2
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putByte(r1, r2, r3)
            return
    }

    public static void nlog2_max_transform_skip_block_size_minus2(long r7, byte r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.video.StdVideoH265PictureParameterSet.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.video.StdVideoH265PictureParameterSet.LOG2_MAX_TRANSFORM_SKIP_BLOCK_SIZE_MINUS2
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putByte(r1, r2, r3)
            return
    }

    public static void ndiff_cu_chroma_qp_offset_depth(long r7, byte r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.video.StdVideoH265PictureParameterSet.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.video.StdVideoH265PictureParameterSet.DIFF_CU_CHROMA_QP_OFFSET_DEPTH
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putByte(r1, r2, r3)
            return
    }

    public static void nchroma_qp_offset_list_len_minus1(long r7, byte r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.video.StdVideoH265PictureParameterSet.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.video.StdVideoH265PictureParameterSet.CHROMA_QP_OFFSET_LIST_LEN_MINUS1
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putByte(r1, r2, r3)
            return
    }

    public static void ncb_qp_offset_list(long r7, java.nio.ByteBuffer r9) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lc
            r0 = r9
            r1 = 6
            org.lwjgl.system.Checks.checkGT(r0, r1)
        Lc:
            r0 = r9
            long r0 = org.lwjgl.system.MemoryUtil.memAddress(r0)
            r1 = r7
            int r2 = org.lwjgl.vulkan.video.StdVideoH265PictureParameterSet.CB_QP_OFFSET_LIST
            long r2 = (long) r2
            long r1 = r1 + r2
            r2 = r9
            int r2 = r2.remaining()
            r3 = 1
            int r2 = r2 * r3
            long r2 = (long) r2
            org.lwjgl.system.MemoryUtil.memCopy(r0, r1, r2)
            return
    }

    public static void ncb_qp_offset_list(long r9, int r11, byte r12) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.video.StdVideoH265PictureParameterSet.UNSAFE
            r1 = 0
            r2 = r9
            int r3 = org.lwjgl.vulkan.video.StdVideoH265PictureParameterSet.CB_QP_OFFSET_LIST
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r11
            r4 = 6
            long r3 = org.lwjgl.system.Checks.check(r3, r4)
            r4 = 1
            long r3 = r3 * r4
            long r2 = r2 + r3
            r3 = r12
            r0.putByte(r1, r2, r3)
            return
    }

    public static void ncr_qp_offset_list(long r7, java.nio.ByteBuffer r9) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lc
            r0 = r9
            r1 = 6
            org.lwjgl.system.Checks.checkGT(r0, r1)
        Lc:
            r0 = r9
            long r0 = org.lwjgl.system.MemoryUtil.memAddress(r0)
            r1 = r7
            int r2 = org.lwjgl.vulkan.video.StdVideoH265PictureParameterSet.CR_QP_OFFSET_LIST
            long r2 = (long) r2
            long r1 = r1 + r2
            r2 = r9
            int r2 = r2.remaining()
            r3 = 1
            int r2 = r2 * r3
            long r2 = (long) r2
            org.lwjgl.system.MemoryUtil.memCopy(r0, r1, r2)
            return
    }

    public static void ncr_qp_offset_list(long r9, int r11, byte r12) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.video.StdVideoH265PictureParameterSet.UNSAFE
            r1 = 0
            r2 = r9
            int r3 = org.lwjgl.vulkan.video.StdVideoH265PictureParameterSet.CR_QP_OFFSET_LIST
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r11
            r4 = 6
            long r3 = org.lwjgl.system.Checks.check(r3, r4)
            r4 = 1
            long r3 = r3 * r4
            long r2 = r2 + r3
            r3 = r12
            r0.putByte(r1, r2, r3)
            return
    }

    public static void nlog2_sao_offset_scale_luma(long r7, byte r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.video.StdVideoH265PictureParameterSet.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.video.StdVideoH265PictureParameterSet.LOG2_SAO_OFFSET_SCALE_LUMA
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putByte(r1, r2, r3)
            return
    }

    public static void nlog2_sao_offset_scale_chroma(long r7, byte r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.video.StdVideoH265PictureParameterSet.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.video.StdVideoH265PictureParameterSet.LOG2_SAO_OFFSET_SCALE_CHROMA
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putByte(r1, r2, r3)
            return
    }

    public static void npps_act_y_qp_offset_plus5(long r7, byte r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.video.StdVideoH265PictureParameterSet.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.video.StdVideoH265PictureParameterSet.PPS_ACT_Y_QP_OFFSET_PLUS5
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putByte(r1, r2, r3)
            return
    }

    public static void npps_act_cb_qp_offset_plus5(long r7, byte r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.video.StdVideoH265PictureParameterSet.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.video.StdVideoH265PictureParameterSet.PPS_ACT_CB_QP_OFFSET_PLUS5
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putByte(r1, r2, r3)
            return
    }

    public static void npps_act_cr_qp_offset_plus3(long r7, byte r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.video.StdVideoH265PictureParameterSet.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.video.StdVideoH265PictureParameterSet.PPS_ACT_CR_QP_OFFSET_PLUS3
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putByte(r1, r2, r3)
            return
    }

    public static void npps_num_palette_predictor_initializers(long r7, byte r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.video.StdVideoH265PictureParameterSet.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.video.StdVideoH265PictureParameterSet.PPS_NUM_PALETTE_PREDICTOR_INITIALIZERS
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putByte(r1, r2, r3)
            return
    }

    public static void nluma_bit_depth_entry_minus8(long r7, byte r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.video.StdVideoH265PictureParameterSet.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.video.StdVideoH265PictureParameterSet.LUMA_BIT_DEPTH_ENTRY_MINUS8
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putByte(r1, r2, r3)
            return
    }

    public static void nchroma_bit_depth_entry_minus8(long r7, byte r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.video.StdVideoH265PictureParameterSet.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.video.StdVideoH265PictureParameterSet.CHROMA_BIT_DEPTH_ENTRY_MINUS8
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putByte(r1, r2, r3)
            return
    }

    public static void nnum_tile_columns_minus1(long r7, byte r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.video.StdVideoH265PictureParameterSet.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.video.StdVideoH265PictureParameterSet.NUM_TILE_COLUMNS_MINUS1
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putByte(r1, r2, r3)
            return
    }

    public static void nnum_tile_rows_minus1(long r7, byte r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.video.StdVideoH265PictureParameterSet.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.video.StdVideoH265PictureParameterSet.NUM_TILE_ROWS_MINUS1
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putByte(r1, r2, r3)
            return
    }

    public static void nreserved1(long r7, byte r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.video.StdVideoH265PictureParameterSet.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.video.StdVideoH265PictureParameterSet.RESERVED1
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putByte(r1, r2, r3)
            return
    }

    public static void nreserved2(long r7, byte r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.video.StdVideoH265PictureParameterSet.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.video.StdVideoH265PictureParameterSet.RESERVED2
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putByte(r1, r2, r3)
            return
    }

    public static void ncolumn_width_minus1(long r7, java.nio.ShortBuffer r9) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lc
            r0 = r9
            r1 = 19
            org.lwjgl.system.Checks.checkGT(r0, r1)
        Lc:
            r0 = r9
            long r0 = org.lwjgl.system.MemoryUtil.memAddress(r0)
            r1 = r7
            int r2 = org.lwjgl.vulkan.video.StdVideoH265PictureParameterSet.COLUMN_WIDTH_MINUS1
            long r2 = (long) r2
            long r1 = r1 + r2
            r2 = r9
            int r2 = r2.remaining()
            r3 = 2
            int r2 = r2 * r3
            long r2 = (long) r2
            org.lwjgl.system.MemoryUtil.memCopy(r0, r1, r2)
            return
    }

    public static void ncolumn_width_minus1(long r9, int r11, short r12) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.video.StdVideoH265PictureParameterSet.UNSAFE
            r1 = 0
            r2 = r9
            int r3 = org.lwjgl.vulkan.video.StdVideoH265PictureParameterSet.COLUMN_WIDTH_MINUS1
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r11
            r4 = 19
            long r3 = org.lwjgl.system.Checks.check(r3, r4)
            r4 = 2
            long r3 = r3 * r4
            long r2 = r2 + r3
            r3 = r12
            r0.putShort(r1, r2, r3)
            return
    }

    public static void nrow_height_minus1(long r7, java.nio.ShortBuffer r9) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lc
            r0 = r9
            r1 = 21
            org.lwjgl.system.Checks.checkGT(r0, r1)
        Lc:
            r0 = r9
            long r0 = org.lwjgl.system.MemoryUtil.memAddress(r0)
            r1 = r7
            int r2 = org.lwjgl.vulkan.video.StdVideoH265PictureParameterSet.ROW_HEIGHT_MINUS1
            long r2 = (long) r2
            long r1 = r1 + r2
            r2 = r9
            int r2 = r2.remaining()
            r3 = 2
            int r2 = r2 * r3
            long r2 = (long) r2
            org.lwjgl.system.MemoryUtil.memCopy(r0, r1, r2)
            return
    }

    public static void nrow_height_minus1(long r9, int r11, short r12) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.video.StdVideoH265PictureParameterSet.UNSAFE
            r1 = 0
            r2 = r9
            int r3 = org.lwjgl.vulkan.video.StdVideoH265PictureParameterSet.ROW_HEIGHT_MINUS1
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r11
            r4 = 21
            long r3 = org.lwjgl.system.Checks.check(r3, r4)
            r4 = 2
            long r3 = r3 * r4
            long r2 = r2 + r3
            r3 = r12
            r0.putShort(r1, r2, r3)
            return
    }

    public static void nreserved3(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.video.StdVideoH265PictureParameterSet.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.video.StdVideoH265PictureParameterSet.RESERVED3
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void npScalingLists(long r5, org.lwjgl.vulkan.video.StdVideoH265ScalingLists r7) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.video.StdVideoH265PictureParameterSet.PSCALINGLISTS
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            long r1 = r1.address()
            org.lwjgl.system.MemoryUtil.memPutAddress(r0, r1)
            return
    }

    public static void npPredictorPaletteEntries(long r5, org.lwjgl.vulkan.video.StdVideoH265PredictorPaletteEntries r7) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.video.StdVideoH265PictureParameterSet.PPREDICTORPALETTEENTRIES
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            long r1 = r1.address()
            org.lwjgl.system.MemoryUtil.memPutAddress(r0, r1)
            return
    }

    public static void validate(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.video.StdVideoH265PictureParameterSet.PSCALINGLISTS
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r5
            int r1 = org.lwjgl.vulkan.video.StdVideoH265PictureParameterSet.PPREDICTORPALETTEENTRIES
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            long r0 = org.lwjgl.system.Checks.check(r0)
            return
    }

    @Override // org.lwjgl.system.Struct
    protected /* bridge */ /* synthetic */ org.lwjgl.system.Struct create(long r6, @javax.annotation.Nullable java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            org.lwjgl.vulkan.video.StdVideoH265PictureParameterSet r0 = r0.create(r1, r2)
            return r0
    }

    static {
            r0 = 36
            org.lwjgl.system.Struct$Member[] r0 = new org.lwjgl.system.Struct.Member[r0]
            r1 = r0
            r2 = 0
            int r3 = org.lwjgl.vulkan.video.StdVideoH265PpsFlags.SIZEOF
            int r4 = org.lwjgl.vulkan.video.StdVideoH265PpsFlags.ALIGNOF
            org.lwjgl.system.Struct$Member r3 = __member(r3, r4)
            r1[r2] = r3
            r1 = r0
            r2 = 1
            r3 = 1
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 2
            r3 = 1
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 3
            r3 = 1
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
            r3 = 1
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 13
            r3 = 1
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 14
            r3 = 1
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 15
            r3 = 1
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 16
            r3 = 1
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 17
            r3 = 1
            r4 = 6
            org.lwjgl.system.Struct$Member r3 = __array(r3, r4)
            r1[r2] = r3
            r1 = r0
            r2 = 18
            r3 = 1
            r4 = 6
            org.lwjgl.system.Struct$Member r3 = __array(r3, r4)
            r1[r2] = r3
            r1 = r0
            r2 = 19
            r3 = 1
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 20
            r3 = 1
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
            r3 = 1
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 26
            r3 = 1
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 27
            r3 = 1
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 28
            r3 = 1
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 29
            r3 = 1
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 30
            r3 = 1
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 31
            r3 = 2
            r4 = 19
            org.lwjgl.system.Struct$Member r3 = __array(r3, r4)
            r1[r2] = r3
            r1 = r0
            r2 = 32
            r3 = 2
            r4 = 21
            org.lwjgl.system.Struct$Member r3 = __array(r3, r4)
            r1[r2] = r3
            r1 = r0
            r2 = 33
            r3 = 4
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 34
            int r3 = org.lwjgl.vulkan.video.StdVideoH265PictureParameterSet.POINTER_SIZE
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 35
            int r3 = org.lwjgl.vulkan.video.StdVideoH265PictureParameterSet.POINTER_SIZE
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            org.lwjgl.system.Struct$Layout r0 = __struct(r0)
            r6 = r0
            r0 = r6
            int r0 = r0.getSize()
            org.lwjgl.vulkan.video.StdVideoH265PictureParameterSet.SIZEOF = r0
            r0 = r6
            int r0 = r0.getAlignment()
            org.lwjgl.vulkan.video.StdVideoH265PictureParameterSet.ALIGNOF = r0
            r0 = r6
            r1 = 0
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.video.StdVideoH265PictureParameterSet.FLAGS = r0
            r0 = r6
            r1 = 1
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.video.StdVideoH265PictureParameterSet.PPS_PIC_PARAMETER_SET_ID = r0
            r0 = r6
            r1 = 2
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.video.StdVideoH265PictureParameterSet.PPS_SEQ_PARAMETER_SET_ID = r0
            r0 = r6
            r1 = 3
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.video.StdVideoH265PictureParameterSet.SPS_VIDEO_PARAMETER_SET_ID = r0
            r0 = r6
            r1 = 4
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.video.StdVideoH265PictureParameterSet.NUM_EXTRA_SLICE_HEADER_BITS = r0
            r0 = r6
            r1 = 5
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.video.StdVideoH265PictureParameterSet.NUM_REF_IDX_L0_DEFAULT_ACTIVE_MINUS1 = r0
            r0 = r6
            r1 = 6
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.video.StdVideoH265PictureParameterSet.NUM_REF_IDX_L1_DEFAULT_ACTIVE_MINUS1 = r0
            r0 = r6
            r1 = 7
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.video.StdVideoH265PictureParameterSet.INIT_QP_MINUS26 = r0
            r0 = r6
            r1 = 8
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.video.StdVideoH265PictureParameterSet.DIFF_CU_QP_DELTA_DEPTH = r0
            r0 = r6
            r1 = 9
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.video.StdVideoH265PictureParameterSet.PPS_CB_QP_OFFSET = r0
            r0 = r6
            r1 = 10
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.video.StdVideoH265PictureParameterSet.PPS_CR_QP_OFFSET = r0
            r0 = r6
            r1 = 11
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.video.StdVideoH265PictureParameterSet.PPS_BETA_OFFSET_DIV2 = r0
            r0 = r6
            r1 = 12
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.video.StdVideoH265PictureParameterSet.PPS_TC_OFFSET_DIV2 = r0
            r0 = r6
            r1 = 13
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.video.StdVideoH265PictureParameterSet.LOG2_PARALLEL_MERGE_LEVEL_MINUS2 = r0
            r0 = r6
            r1 = 14
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.video.StdVideoH265PictureParameterSet.LOG2_MAX_TRANSFORM_SKIP_BLOCK_SIZE_MINUS2 = r0
            r0 = r6
            r1 = 15
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.video.StdVideoH265PictureParameterSet.DIFF_CU_CHROMA_QP_OFFSET_DEPTH = r0
            r0 = r6
            r1 = 16
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.video.StdVideoH265PictureParameterSet.CHROMA_QP_OFFSET_LIST_LEN_MINUS1 = r0
            r0 = r6
            r1 = 17
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.video.StdVideoH265PictureParameterSet.CB_QP_OFFSET_LIST = r0
            r0 = r6
            r1 = 18
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.video.StdVideoH265PictureParameterSet.CR_QP_OFFSET_LIST = r0
            r0 = r6
            r1 = 19
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.video.StdVideoH265PictureParameterSet.LOG2_SAO_OFFSET_SCALE_LUMA = r0
            r0 = r6
            r1 = 20
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.video.StdVideoH265PictureParameterSet.LOG2_SAO_OFFSET_SCALE_CHROMA = r0
            r0 = r6
            r1 = 21
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.video.StdVideoH265PictureParameterSet.PPS_ACT_Y_QP_OFFSET_PLUS5 = r0
            r0 = r6
            r1 = 22
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.video.StdVideoH265PictureParameterSet.PPS_ACT_CB_QP_OFFSET_PLUS5 = r0
            r0 = r6
            r1 = 23
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.video.StdVideoH265PictureParameterSet.PPS_ACT_CR_QP_OFFSET_PLUS3 = r0
            r0 = r6
            r1 = 24
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.video.StdVideoH265PictureParameterSet.PPS_NUM_PALETTE_PREDICTOR_INITIALIZERS = r0
            r0 = r6
            r1 = 25
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.video.StdVideoH265PictureParameterSet.LUMA_BIT_DEPTH_ENTRY_MINUS8 = r0
            r0 = r6
            r1 = 26
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.video.StdVideoH265PictureParameterSet.CHROMA_BIT_DEPTH_ENTRY_MINUS8 = r0
            r0 = r6
            r1 = 27
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.video.StdVideoH265PictureParameterSet.NUM_TILE_COLUMNS_MINUS1 = r0
            r0 = r6
            r1 = 28
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.video.StdVideoH265PictureParameterSet.NUM_TILE_ROWS_MINUS1 = r0
            r0 = r6
            r1 = 29
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.video.StdVideoH265PictureParameterSet.RESERVED1 = r0
            r0 = r6
            r1 = 30
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.video.StdVideoH265PictureParameterSet.RESERVED2 = r0
            r0 = r6
            r1 = 31
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.video.StdVideoH265PictureParameterSet.COLUMN_WIDTH_MINUS1 = r0
            r0 = r6
            r1 = 32
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.video.StdVideoH265PictureParameterSet.ROW_HEIGHT_MINUS1 = r0
            r0 = r6
            r1 = 33
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.video.StdVideoH265PictureParameterSet.RESERVED3 = r0
            r0 = r6
            r1 = 34
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.video.StdVideoH265PictureParameterSet.PSCALINGLISTS = r0
            r0 = r6
            r1 = 35
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.video.StdVideoH265PictureParameterSet.PPREDICTORPALETTEENTRIES = r0
            return
    }
}
