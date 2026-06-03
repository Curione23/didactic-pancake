package org.lwjgl.vulkan.video;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/video/StdVideoH265SequenceParameterSet.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/video/StdVideoH265SequenceParameterSet.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/video/StdVideoH265SequenceParameterSet.class */
public class StdVideoH265SequenceParameterSet extends org.lwjgl.system.Struct<org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSet> implements org.lwjgl.system.NativeResource {
    public static final int SIZEOF = 0;
    public static final int ALIGNOF = 0;
    public static final int FLAGS = 0;
    public static final int CHROMA_FORMAT_IDC = 0;
    public static final int PIC_WIDTH_IN_LUMA_SAMPLES = 0;
    public static final int PIC_HEIGHT_IN_LUMA_SAMPLES = 0;
    public static final int SPS_VIDEO_PARAMETER_SET_ID = 0;
    public static final int SPS_MAX_SUB_LAYERS_MINUS1 = 0;
    public static final int SPS_SEQ_PARAMETER_SET_ID = 0;
    public static final int BIT_DEPTH_LUMA_MINUS8 = 0;
    public static final int BIT_DEPTH_CHROMA_MINUS8 = 0;
    public static final int LOG2_MAX_PIC_ORDER_CNT_LSB_MINUS4 = 0;
    public static final int SPS_MAX_DEC_PIC_BUFFERING_MINUS1 = 0;
    public static final int LOG2_MIN_LUMA_CODING_BLOCK_SIZE_MINUS3 = 0;
    public static final int LOG2_DIFF_MAX_MIN_LUMA_CODING_BLOCK_SIZE = 0;
    public static final int LOG2_MIN_LUMA_TRANSFORM_BLOCK_SIZE_MINUS2 = 0;
    public static final int LOG2_DIFF_MAX_MIN_LUMA_TRANSFORM_BLOCK_SIZE = 0;
    public static final int MAX_TRANSFORM_HIERARCHY_DEPTH_INTER = 0;
    public static final int MAX_TRANSFORM_HIERARCHY_DEPTH_INTRA = 0;
    public static final int NUM_SHORT_TERM_REF_PIC_SETS = 0;
    public static final int NUM_LONG_TERM_REF_PICS_SPS = 0;
    public static final int PCM_SAMPLE_BIT_DEPTH_LUMA_MINUS1 = 0;
    public static final int PCM_SAMPLE_BIT_DEPTH_CHROMA_MINUS1 = 0;
    public static final int LOG2_MIN_PCM_LUMA_CODING_BLOCK_SIZE_MINUS3 = 0;
    public static final int LOG2_DIFF_MAX_MIN_PCM_LUMA_CODING_BLOCK_SIZE = 0;
    public static final int RESERVED1 = 0;
    public static final int RESERVED2 = 0;
    public static final int PALETTE_MAX_SIZE = 0;
    public static final int DELTA_PALETTE_MAX_PREDICTOR_SIZE = 0;
    public static final int MOTION_VECTOR_RESOLUTION_CONTROL_IDC = 0;
    public static final int SPS_NUM_PALETTE_PREDICTOR_INITIALIZER_MINUS1 = 0;
    public static final int CONF_WIN_LEFT_OFFSET = 0;
    public static final int CONF_WIN_RIGHT_OFFSET = 0;
    public static final int CONF_WIN_TOP_OFFSET = 0;
    public static final int CONF_WIN_BOTTOM_OFFSET = 0;
    public static final int PPROFILETIERLEVEL = 0;
    public static final int PDECPICBUFMGR = 0;
    public static final int PSCALINGLISTS = 0;
    public static final int PSHORTTERMREFPICSET = 0;
    public static final int PLONGTERMREFPICSSPS = 0;
    public static final int PSEQUENCEPARAMETERSETVUI = 0;
    public static final int PPREDICTORPALETTEENTRIES = 0;

    /* JADX WARN: Classes with same name are omitted, all sources:
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/video/StdVideoH265SequenceParameterSet$Buffer.class
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/video/StdVideoH265SequenceParameterSet$Buffer.class
     */
    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/video/StdVideoH265SequenceParameterSet$Buffer.class */
    public static class Buffer extends org.lwjgl.system.StructBuffer<org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSet, org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSet.Buffer> implements org.lwjgl.system.NativeResource {
        private static final org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSet ELEMENT_FACTORY = null;

        public Buffer(java.nio.ByteBuffer r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r6
                int r2 = r2.remaining()
                int r3 = org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSet.SIZEOF
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
        protected org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSet.Buffer self() {
                r2 = this;
                r0 = r2
                return r0
        }

        @Override // org.lwjgl.system.StructBuffer
        protected org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSet getElementFactory() {
                r2 = this;
                org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSet r0 = org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSet.Buffer.ELEMENT_FACTORY
                return r0
        }

        public org.lwjgl.vulkan.video.StdVideoH265SpsFlags flags() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                org.lwjgl.vulkan.video.StdVideoH265SpsFlags r0 = org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSet.nflags(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("StdVideoH265ChromaFormatIdc")
        public int chroma_format_idc() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSet.nchroma_format_idc(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint32_t")
        public int pic_width_in_luma_samples() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSet.npic_width_in_luma_samples(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint32_t")
        public int pic_height_in_luma_samples() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSet.npic_height_in_luma_samples(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint8_t")
        public byte sps_video_parameter_set_id() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                byte r0 = org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSet.nsps_video_parameter_set_id(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint8_t")
        public byte sps_max_sub_layers_minus1() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                byte r0 = org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSet.nsps_max_sub_layers_minus1(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint8_t")
        public byte sps_seq_parameter_set_id() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                byte r0 = org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSet.nsps_seq_parameter_set_id(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint8_t")
        public byte bit_depth_luma_minus8() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                byte r0 = org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSet.nbit_depth_luma_minus8(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint8_t")
        public byte bit_depth_chroma_minus8() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                byte r0 = org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSet.nbit_depth_chroma_minus8(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint8_t")
        public byte log2_max_pic_order_cnt_lsb_minus4() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                byte r0 = org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSet.nlog2_max_pic_order_cnt_lsb_minus4(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint8_t")
        public byte sps_max_dec_pic_buffering_minus1() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                byte r0 = org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSet.nsps_max_dec_pic_buffering_minus1(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint8_t")
        public byte log2_min_luma_coding_block_size_minus3() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                byte r0 = org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSet.nlog2_min_luma_coding_block_size_minus3(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint8_t")
        public byte log2_diff_max_min_luma_coding_block_size() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                byte r0 = org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSet.nlog2_diff_max_min_luma_coding_block_size(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint8_t")
        public byte log2_min_luma_transform_block_size_minus2() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                byte r0 = org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSet.nlog2_min_luma_transform_block_size_minus2(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint8_t")
        public byte log2_diff_max_min_luma_transform_block_size() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                byte r0 = org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSet.nlog2_diff_max_min_luma_transform_block_size(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint8_t")
        public byte max_transform_hierarchy_depth_inter() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                byte r0 = org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSet.nmax_transform_hierarchy_depth_inter(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint8_t")
        public byte max_transform_hierarchy_depth_intra() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                byte r0 = org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSet.nmax_transform_hierarchy_depth_intra(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint8_t")
        public byte num_short_term_ref_pic_sets() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                byte r0 = org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSet.nnum_short_term_ref_pic_sets(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint8_t")
        public byte num_long_term_ref_pics_sps() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                byte r0 = org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSet.nnum_long_term_ref_pics_sps(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint8_t")
        public byte pcm_sample_bit_depth_luma_minus1() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                byte r0 = org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSet.npcm_sample_bit_depth_luma_minus1(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint8_t")
        public byte pcm_sample_bit_depth_chroma_minus1() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                byte r0 = org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSet.npcm_sample_bit_depth_chroma_minus1(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint8_t")
        public byte log2_min_pcm_luma_coding_block_size_minus3() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                byte r0 = org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSet.nlog2_min_pcm_luma_coding_block_size_minus3(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint8_t")
        public byte log2_diff_max_min_pcm_luma_coding_block_size() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                byte r0 = org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSet.nlog2_diff_max_min_pcm_luma_coding_block_size(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint8_t")
        public byte palette_max_size() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                byte r0 = org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSet.npalette_max_size(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint8_t")
        public byte delta_palette_max_predictor_size() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                byte r0 = org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSet.ndelta_palette_max_predictor_size(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint8_t")
        public byte motion_vector_resolution_control_idc() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                byte r0 = org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSet.nmotion_vector_resolution_control_idc(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint8_t")
        public byte sps_num_palette_predictor_initializer_minus1() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                byte r0 = org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSet.nsps_num_palette_predictor_initializer_minus1(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint32_t")
        public int conf_win_left_offset() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSet.nconf_win_left_offset(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint32_t")
        public int conf_win_right_offset() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSet.nconf_win_right_offset(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint32_t")
        public int conf_win_top_offset() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSet.nconf_win_top_offset(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint32_t")
        public int conf_win_bottom_offset() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSet.nconf_win_bottom_offset(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("StdVideoH265ProfileTierLevel const *")
        public org.lwjgl.vulkan.video.StdVideoH265ProfileTierLevel pProfileTierLevel() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                org.lwjgl.vulkan.video.StdVideoH265ProfileTierLevel r0 = org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSet.npProfileTierLevel(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("StdVideoH265DecPicBufMgr const *")
        public org.lwjgl.vulkan.video.StdVideoH265DecPicBufMgr pDecPicBufMgr() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                org.lwjgl.vulkan.video.StdVideoH265DecPicBufMgr r0 = org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSet.npDecPicBufMgr(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("StdVideoH265ScalingLists const *")
        public org.lwjgl.vulkan.video.StdVideoH265ScalingLists pScalingLists() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                org.lwjgl.vulkan.video.StdVideoH265ScalingLists r0 = org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSet.npScalingLists(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("StdVideoH265ShortTermRefPicSet const *")
        public org.lwjgl.vulkan.video.StdVideoH265ShortTermRefPicSet pShortTermRefPicSet() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                org.lwjgl.vulkan.video.StdVideoH265ShortTermRefPicSet r0 = org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSet.npShortTermRefPicSet(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("StdVideoH265LongTermRefPicsSps const *")
        public org.lwjgl.vulkan.video.StdVideoH265LongTermRefPicsSps pLongTermRefPicsSps() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                org.lwjgl.vulkan.video.StdVideoH265LongTermRefPicsSps r0 = org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSet.npLongTermRefPicsSps(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("StdVideoH265SequenceParameterSetVui const *")
        public org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSetVui pSequenceParameterSetVui() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSetVui r0 = org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSet.npSequenceParameterSetVui(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("StdVideoH265PredictorPaletteEntries const *")
        public org.lwjgl.vulkan.video.StdVideoH265PredictorPaletteEntries pPredictorPaletteEntries() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                org.lwjgl.vulkan.video.StdVideoH265PredictorPaletteEntries r0 = org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSet.npPredictorPaletteEntries(r0)
                return r0
        }

        public org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSet.Buffer flags(org.lwjgl.vulkan.video.StdVideoH265SpsFlags r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSet.nflags(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSet.Buffer flags(java.util.function.Consumer<org.lwjgl.vulkan.video.StdVideoH265SpsFlags> r4) {
                r3 = this;
                r0 = r4
                r1 = r3
                org.lwjgl.vulkan.video.StdVideoH265SpsFlags r1 = r1.flags()
                r0.accept(r1)
                r0 = r3
                return r0
        }

        public org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSet.Buffer chroma_format_idc(@org.lwjgl.system.NativeType("StdVideoH265ChromaFormatIdc") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSet.nchroma_format_idc(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSet.Buffer pic_width_in_luma_samples(@org.lwjgl.system.NativeType("uint32_t") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSet.npic_width_in_luma_samples(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSet.Buffer pic_height_in_luma_samples(@org.lwjgl.system.NativeType("uint32_t") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSet.npic_height_in_luma_samples(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSet.Buffer sps_video_parameter_set_id(@org.lwjgl.system.NativeType("uint8_t") byte r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSet.nsps_video_parameter_set_id(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSet.Buffer sps_max_sub_layers_minus1(@org.lwjgl.system.NativeType("uint8_t") byte r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSet.nsps_max_sub_layers_minus1(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSet.Buffer sps_seq_parameter_set_id(@org.lwjgl.system.NativeType("uint8_t") byte r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSet.nsps_seq_parameter_set_id(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSet.Buffer bit_depth_luma_minus8(@org.lwjgl.system.NativeType("uint8_t") byte r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSet.nbit_depth_luma_minus8(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSet.Buffer bit_depth_chroma_minus8(@org.lwjgl.system.NativeType("uint8_t") byte r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSet.nbit_depth_chroma_minus8(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSet.Buffer log2_max_pic_order_cnt_lsb_minus4(@org.lwjgl.system.NativeType("uint8_t") byte r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSet.nlog2_max_pic_order_cnt_lsb_minus4(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSet.Buffer sps_max_dec_pic_buffering_minus1(@org.lwjgl.system.NativeType("uint8_t") byte r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSet.nsps_max_dec_pic_buffering_minus1(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSet.Buffer log2_min_luma_coding_block_size_minus3(@org.lwjgl.system.NativeType("uint8_t") byte r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSet.nlog2_min_luma_coding_block_size_minus3(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSet.Buffer log2_diff_max_min_luma_coding_block_size(@org.lwjgl.system.NativeType("uint8_t") byte r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSet.nlog2_diff_max_min_luma_coding_block_size(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSet.Buffer log2_min_luma_transform_block_size_minus2(@org.lwjgl.system.NativeType("uint8_t") byte r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSet.nlog2_min_luma_transform_block_size_minus2(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSet.Buffer log2_diff_max_min_luma_transform_block_size(@org.lwjgl.system.NativeType("uint8_t") byte r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSet.nlog2_diff_max_min_luma_transform_block_size(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSet.Buffer max_transform_hierarchy_depth_inter(@org.lwjgl.system.NativeType("uint8_t") byte r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSet.nmax_transform_hierarchy_depth_inter(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSet.Buffer max_transform_hierarchy_depth_intra(@org.lwjgl.system.NativeType("uint8_t") byte r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSet.nmax_transform_hierarchy_depth_intra(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSet.Buffer num_short_term_ref_pic_sets(@org.lwjgl.system.NativeType("uint8_t") byte r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSet.nnum_short_term_ref_pic_sets(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSet.Buffer num_long_term_ref_pics_sps(@org.lwjgl.system.NativeType("uint8_t") byte r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSet.nnum_long_term_ref_pics_sps(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSet.Buffer pcm_sample_bit_depth_luma_minus1(@org.lwjgl.system.NativeType("uint8_t") byte r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSet.npcm_sample_bit_depth_luma_minus1(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSet.Buffer pcm_sample_bit_depth_chroma_minus1(@org.lwjgl.system.NativeType("uint8_t") byte r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSet.npcm_sample_bit_depth_chroma_minus1(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSet.Buffer log2_min_pcm_luma_coding_block_size_minus3(@org.lwjgl.system.NativeType("uint8_t") byte r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSet.nlog2_min_pcm_luma_coding_block_size_minus3(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSet.Buffer log2_diff_max_min_pcm_luma_coding_block_size(@org.lwjgl.system.NativeType("uint8_t") byte r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSet.nlog2_diff_max_min_pcm_luma_coding_block_size(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSet.Buffer palette_max_size(@org.lwjgl.system.NativeType("uint8_t") byte r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSet.npalette_max_size(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSet.Buffer delta_palette_max_predictor_size(@org.lwjgl.system.NativeType("uint8_t") byte r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSet.ndelta_palette_max_predictor_size(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSet.Buffer motion_vector_resolution_control_idc(@org.lwjgl.system.NativeType("uint8_t") byte r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSet.nmotion_vector_resolution_control_idc(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSet.Buffer sps_num_palette_predictor_initializer_minus1(@org.lwjgl.system.NativeType("uint8_t") byte r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSet.nsps_num_palette_predictor_initializer_minus1(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSet.Buffer conf_win_left_offset(@org.lwjgl.system.NativeType("uint32_t") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSet.nconf_win_left_offset(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSet.Buffer conf_win_right_offset(@org.lwjgl.system.NativeType("uint32_t") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSet.nconf_win_right_offset(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSet.Buffer conf_win_top_offset(@org.lwjgl.system.NativeType("uint32_t") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSet.nconf_win_top_offset(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSet.Buffer conf_win_bottom_offset(@org.lwjgl.system.NativeType("uint32_t") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSet.nconf_win_bottom_offset(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSet.Buffer pProfileTierLevel(@org.lwjgl.system.NativeType("StdVideoH265ProfileTierLevel const *") org.lwjgl.vulkan.video.StdVideoH265ProfileTierLevel r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSet.npProfileTierLevel(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSet.Buffer pDecPicBufMgr(@org.lwjgl.system.NativeType("StdVideoH265DecPicBufMgr const *") org.lwjgl.vulkan.video.StdVideoH265DecPicBufMgr r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSet.npDecPicBufMgr(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSet.Buffer pScalingLists(@org.lwjgl.system.NativeType("StdVideoH265ScalingLists const *") org.lwjgl.vulkan.video.StdVideoH265ScalingLists r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSet.npScalingLists(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSet.Buffer pShortTermRefPicSet(@org.lwjgl.system.NativeType("StdVideoH265ShortTermRefPicSet const *") org.lwjgl.vulkan.video.StdVideoH265ShortTermRefPicSet r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSet.npShortTermRefPicSet(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSet.Buffer pLongTermRefPicsSps(@org.lwjgl.system.NativeType("StdVideoH265LongTermRefPicsSps const *") org.lwjgl.vulkan.video.StdVideoH265LongTermRefPicsSps r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSet.npLongTermRefPicsSps(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSet.Buffer pSequenceParameterSetVui(@org.lwjgl.system.NativeType("StdVideoH265SequenceParameterSetVui const *") org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSetVui r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSet.npSequenceParameterSetVui(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSet.Buffer pPredictorPaletteEntries(@org.lwjgl.system.NativeType("StdVideoH265PredictorPaletteEntries const *") org.lwjgl.vulkan.video.StdVideoH265PredictorPaletteEntries r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSet.npPredictorPaletteEntries(r0, r1)
                r0 = r4
                return r0
        }

        @Override // org.lwjgl.system.StructBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.Struct getElementFactory() {
                r2 = this;
                r0 = r2
                org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSet r0 = r0.getElementFactory()
                return r0
        }

        @Override // org.lwjgl.system.CustomBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.CustomBuffer self() {
                r2 = this;
                r0 = r2
                org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSet$Buffer r0 = r0.self()
                return r0
        }

        static {
                r0 = -1
                org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSet r0 = org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSet.create(r0)
                org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSet.Buffer.ELEMENT_FACTORY = r0
                return
        }
    }

    protected StdVideoH265SequenceParameterSet(long r6, @javax.annotation.Nullable java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    protected org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSet create(long r7, @javax.annotation.Nullable java.nio.ByteBuffer r9) {
            r6 = this;
            org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSet r0 = new org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSet
            r1 = r0
            r2 = r7
            r3 = r9
            r1.<init>(r2, r3)
            return r0
    }

    public StdVideoH265SequenceParameterSet(java.nio.ByteBuffer r7) {
            r6 = this;
            r0 = r6
            r1 = r7
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            r2 = r7
            int r3 = org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSet.SIZEOF
            java.nio.ByteBuffer r2 = __checkContainer(r2, r3)
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
            r2 = this;
            int r0 = org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSet.SIZEOF
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoH265SpsFlags flags() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            org.lwjgl.vulkan.video.StdVideoH265SpsFlags r0 = nflags(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("StdVideoH265ChromaFormatIdc")
    public int chroma_format_idc() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nchroma_format_idc(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("uint32_t")
    public int pic_width_in_luma_samples() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = npic_width_in_luma_samples(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("uint32_t")
    public int pic_height_in_luma_samples() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = npic_height_in_luma_samples(r0)
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
    public byte sps_max_sub_layers_minus1() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            byte r0 = nsps_max_sub_layers_minus1(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("uint8_t")
    public byte sps_seq_parameter_set_id() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            byte r0 = nsps_seq_parameter_set_id(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("uint8_t")
    public byte bit_depth_luma_minus8() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            byte r0 = nbit_depth_luma_minus8(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("uint8_t")
    public byte bit_depth_chroma_minus8() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            byte r0 = nbit_depth_chroma_minus8(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("uint8_t")
    public byte log2_max_pic_order_cnt_lsb_minus4() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            byte r0 = nlog2_max_pic_order_cnt_lsb_minus4(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("uint8_t")
    public byte sps_max_dec_pic_buffering_minus1() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            byte r0 = nsps_max_dec_pic_buffering_minus1(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("uint8_t")
    public byte log2_min_luma_coding_block_size_minus3() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            byte r0 = nlog2_min_luma_coding_block_size_minus3(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("uint8_t")
    public byte log2_diff_max_min_luma_coding_block_size() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            byte r0 = nlog2_diff_max_min_luma_coding_block_size(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("uint8_t")
    public byte log2_min_luma_transform_block_size_minus2() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            byte r0 = nlog2_min_luma_transform_block_size_minus2(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("uint8_t")
    public byte log2_diff_max_min_luma_transform_block_size() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            byte r0 = nlog2_diff_max_min_luma_transform_block_size(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("uint8_t")
    public byte max_transform_hierarchy_depth_inter() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            byte r0 = nmax_transform_hierarchy_depth_inter(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("uint8_t")
    public byte max_transform_hierarchy_depth_intra() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            byte r0 = nmax_transform_hierarchy_depth_intra(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("uint8_t")
    public byte num_short_term_ref_pic_sets() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            byte r0 = nnum_short_term_ref_pic_sets(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("uint8_t")
    public byte num_long_term_ref_pics_sps() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            byte r0 = nnum_long_term_ref_pics_sps(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("uint8_t")
    public byte pcm_sample_bit_depth_luma_minus1() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            byte r0 = npcm_sample_bit_depth_luma_minus1(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("uint8_t")
    public byte pcm_sample_bit_depth_chroma_minus1() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            byte r0 = npcm_sample_bit_depth_chroma_minus1(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("uint8_t")
    public byte log2_min_pcm_luma_coding_block_size_minus3() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            byte r0 = nlog2_min_pcm_luma_coding_block_size_minus3(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("uint8_t")
    public byte log2_diff_max_min_pcm_luma_coding_block_size() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            byte r0 = nlog2_diff_max_min_pcm_luma_coding_block_size(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("uint8_t")
    public byte palette_max_size() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            byte r0 = npalette_max_size(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("uint8_t")
    public byte delta_palette_max_predictor_size() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            byte r0 = ndelta_palette_max_predictor_size(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("uint8_t")
    public byte motion_vector_resolution_control_idc() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            byte r0 = nmotion_vector_resolution_control_idc(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("uint8_t")
    public byte sps_num_palette_predictor_initializer_minus1() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            byte r0 = nsps_num_palette_predictor_initializer_minus1(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("uint32_t")
    public int conf_win_left_offset() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nconf_win_left_offset(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("uint32_t")
    public int conf_win_right_offset() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nconf_win_right_offset(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("uint32_t")
    public int conf_win_top_offset() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nconf_win_top_offset(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("uint32_t")
    public int conf_win_bottom_offset() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nconf_win_bottom_offset(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("StdVideoH265ProfileTierLevel const *")
    public org.lwjgl.vulkan.video.StdVideoH265ProfileTierLevel pProfileTierLevel() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            org.lwjgl.vulkan.video.StdVideoH265ProfileTierLevel r0 = npProfileTierLevel(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("StdVideoH265DecPicBufMgr const *")
    public org.lwjgl.vulkan.video.StdVideoH265DecPicBufMgr pDecPicBufMgr() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            org.lwjgl.vulkan.video.StdVideoH265DecPicBufMgr r0 = npDecPicBufMgr(r0)
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

    @org.lwjgl.system.NativeType("StdVideoH265ShortTermRefPicSet const *")
    public org.lwjgl.vulkan.video.StdVideoH265ShortTermRefPicSet pShortTermRefPicSet() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            org.lwjgl.vulkan.video.StdVideoH265ShortTermRefPicSet r0 = npShortTermRefPicSet(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("StdVideoH265LongTermRefPicsSps const *")
    public org.lwjgl.vulkan.video.StdVideoH265LongTermRefPicsSps pLongTermRefPicsSps() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            org.lwjgl.vulkan.video.StdVideoH265LongTermRefPicsSps r0 = npLongTermRefPicsSps(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("StdVideoH265SequenceParameterSetVui const *")
    public org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSetVui pSequenceParameterSetVui() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSetVui r0 = npSequenceParameterSetVui(r0)
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

    public org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSet flags(org.lwjgl.vulkan.video.StdVideoH265SpsFlags r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nflags(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSet flags(java.util.function.Consumer<org.lwjgl.vulkan.video.StdVideoH265SpsFlags> r4) {
            r3 = this;
            r0 = r4
            r1 = r3
            org.lwjgl.vulkan.video.StdVideoH265SpsFlags r1 = r1.flags()
            r0.accept(r1)
            r0 = r3
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSet chroma_format_idc(@org.lwjgl.system.NativeType("StdVideoH265ChromaFormatIdc") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nchroma_format_idc(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSet pic_width_in_luma_samples(@org.lwjgl.system.NativeType("uint32_t") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            npic_width_in_luma_samples(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSet pic_height_in_luma_samples(@org.lwjgl.system.NativeType("uint32_t") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            npic_height_in_luma_samples(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSet sps_video_parameter_set_id(@org.lwjgl.system.NativeType("uint8_t") byte r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nsps_video_parameter_set_id(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSet sps_max_sub_layers_minus1(@org.lwjgl.system.NativeType("uint8_t") byte r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nsps_max_sub_layers_minus1(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSet sps_seq_parameter_set_id(@org.lwjgl.system.NativeType("uint8_t") byte r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nsps_seq_parameter_set_id(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSet bit_depth_luma_minus8(@org.lwjgl.system.NativeType("uint8_t") byte r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nbit_depth_luma_minus8(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSet bit_depth_chroma_minus8(@org.lwjgl.system.NativeType("uint8_t") byte r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nbit_depth_chroma_minus8(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSet log2_max_pic_order_cnt_lsb_minus4(@org.lwjgl.system.NativeType("uint8_t") byte r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nlog2_max_pic_order_cnt_lsb_minus4(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSet sps_max_dec_pic_buffering_minus1(@org.lwjgl.system.NativeType("uint8_t") byte r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nsps_max_dec_pic_buffering_minus1(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSet log2_min_luma_coding_block_size_minus3(@org.lwjgl.system.NativeType("uint8_t") byte r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nlog2_min_luma_coding_block_size_minus3(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSet log2_diff_max_min_luma_coding_block_size(@org.lwjgl.system.NativeType("uint8_t") byte r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nlog2_diff_max_min_luma_coding_block_size(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSet log2_min_luma_transform_block_size_minus2(@org.lwjgl.system.NativeType("uint8_t") byte r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nlog2_min_luma_transform_block_size_minus2(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSet log2_diff_max_min_luma_transform_block_size(@org.lwjgl.system.NativeType("uint8_t") byte r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nlog2_diff_max_min_luma_transform_block_size(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSet max_transform_hierarchy_depth_inter(@org.lwjgl.system.NativeType("uint8_t") byte r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nmax_transform_hierarchy_depth_inter(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSet max_transform_hierarchy_depth_intra(@org.lwjgl.system.NativeType("uint8_t") byte r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nmax_transform_hierarchy_depth_intra(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSet num_short_term_ref_pic_sets(@org.lwjgl.system.NativeType("uint8_t") byte r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nnum_short_term_ref_pic_sets(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSet num_long_term_ref_pics_sps(@org.lwjgl.system.NativeType("uint8_t") byte r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nnum_long_term_ref_pics_sps(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSet pcm_sample_bit_depth_luma_minus1(@org.lwjgl.system.NativeType("uint8_t") byte r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            npcm_sample_bit_depth_luma_minus1(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSet pcm_sample_bit_depth_chroma_minus1(@org.lwjgl.system.NativeType("uint8_t") byte r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            npcm_sample_bit_depth_chroma_minus1(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSet log2_min_pcm_luma_coding_block_size_minus3(@org.lwjgl.system.NativeType("uint8_t") byte r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nlog2_min_pcm_luma_coding_block_size_minus3(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSet log2_diff_max_min_pcm_luma_coding_block_size(@org.lwjgl.system.NativeType("uint8_t") byte r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nlog2_diff_max_min_pcm_luma_coding_block_size(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSet palette_max_size(@org.lwjgl.system.NativeType("uint8_t") byte r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            npalette_max_size(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSet delta_palette_max_predictor_size(@org.lwjgl.system.NativeType("uint8_t") byte r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            ndelta_palette_max_predictor_size(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSet motion_vector_resolution_control_idc(@org.lwjgl.system.NativeType("uint8_t") byte r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nmotion_vector_resolution_control_idc(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSet sps_num_palette_predictor_initializer_minus1(@org.lwjgl.system.NativeType("uint8_t") byte r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nsps_num_palette_predictor_initializer_minus1(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSet conf_win_left_offset(@org.lwjgl.system.NativeType("uint32_t") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nconf_win_left_offset(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSet conf_win_right_offset(@org.lwjgl.system.NativeType("uint32_t") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nconf_win_right_offset(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSet conf_win_top_offset(@org.lwjgl.system.NativeType("uint32_t") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nconf_win_top_offset(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSet conf_win_bottom_offset(@org.lwjgl.system.NativeType("uint32_t") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nconf_win_bottom_offset(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSet pProfileTierLevel(@org.lwjgl.system.NativeType("StdVideoH265ProfileTierLevel const *") org.lwjgl.vulkan.video.StdVideoH265ProfileTierLevel r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            npProfileTierLevel(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSet pDecPicBufMgr(@org.lwjgl.system.NativeType("StdVideoH265DecPicBufMgr const *") org.lwjgl.vulkan.video.StdVideoH265DecPicBufMgr r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            npDecPicBufMgr(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSet pScalingLists(@org.lwjgl.system.NativeType("StdVideoH265ScalingLists const *") org.lwjgl.vulkan.video.StdVideoH265ScalingLists r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            npScalingLists(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSet pShortTermRefPicSet(@org.lwjgl.system.NativeType("StdVideoH265ShortTermRefPicSet const *") org.lwjgl.vulkan.video.StdVideoH265ShortTermRefPicSet r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            npShortTermRefPicSet(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSet pLongTermRefPicsSps(@org.lwjgl.system.NativeType("StdVideoH265LongTermRefPicsSps const *") org.lwjgl.vulkan.video.StdVideoH265LongTermRefPicsSps r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            npLongTermRefPicsSps(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSet pSequenceParameterSetVui(@org.lwjgl.system.NativeType("StdVideoH265SequenceParameterSetVui const *") org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSetVui r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            npSequenceParameterSetVui(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSet pPredictorPaletteEntries(@org.lwjgl.system.NativeType("StdVideoH265PredictorPaletteEntries const *") org.lwjgl.vulkan.video.StdVideoH265PredictorPaletteEntries r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            npPredictorPaletteEntries(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSet set(org.lwjgl.vulkan.video.StdVideoH265SpsFlags r4, int r5, int r6, int r7, byte r8, byte r9, byte r10, byte r11, byte r12, byte r13, byte r14, byte r15, byte r16, byte r17, byte r18, byte r19, byte r20, byte r21, byte r22, byte r23, byte r24, byte r25, byte r26, byte r27, byte r28, byte r29, byte r30, int r31, int r32, int r33, int r34, org.lwjgl.vulkan.video.StdVideoH265ProfileTierLevel r35, org.lwjgl.vulkan.video.StdVideoH265DecPicBufMgr r36, org.lwjgl.vulkan.video.StdVideoH265ScalingLists r37, org.lwjgl.vulkan.video.StdVideoH265ShortTermRefPicSet r38, org.lwjgl.vulkan.video.StdVideoH265LongTermRefPicsSps r39, org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSetVui r40, org.lwjgl.vulkan.video.StdVideoH265PredictorPaletteEntries r41) {
            r3 = this;
            r0 = r3
            r1 = r4
            org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSet r0 = r0.flags(r1)
            r0 = r3
            r1 = r5
            org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSet r0 = r0.chroma_format_idc(r1)
            r0 = r3
            r1 = r6
            org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSet r0 = r0.pic_width_in_luma_samples(r1)
            r0 = r3
            r1 = r7
            org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSet r0 = r0.pic_height_in_luma_samples(r1)
            r0 = r3
            r1 = r8
            org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSet r0 = r0.sps_video_parameter_set_id(r1)
            r0 = r3
            r1 = r9
            org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSet r0 = r0.sps_max_sub_layers_minus1(r1)
            r0 = r3
            r1 = r10
            org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSet r0 = r0.sps_seq_parameter_set_id(r1)
            r0 = r3
            r1 = r11
            org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSet r0 = r0.bit_depth_luma_minus8(r1)
            r0 = r3
            r1 = r12
            org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSet r0 = r0.bit_depth_chroma_minus8(r1)
            r0 = r3
            r1 = r13
            org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSet r0 = r0.log2_max_pic_order_cnt_lsb_minus4(r1)
            r0 = r3
            r1 = r14
            org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSet r0 = r0.sps_max_dec_pic_buffering_minus1(r1)
            r0 = r3
            r1 = r15
            org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSet r0 = r0.log2_min_luma_coding_block_size_minus3(r1)
            r0 = r3
            r1 = r16
            org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSet r0 = r0.log2_diff_max_min_luma_coding_block_size(r1)
            r0 = r3
            r1 = r17
            org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSet r0 = r0.log2_min_luma_transform_block_size_minus2(r1)
            r0 = r3
            r1 = r18
            org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSet r0 = r0.log2_diff_max_min_luma_transform_block_size(r1)
            r0 = r3
            r1 = r19
            org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSet r0 = r0.max_transform_hierarchy_depth_inter(r1)
            r0 = r3
            r1 = r20
            org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSet r0 = r0.max_transform_hierarchy_depth_intra(r1)
            r0 = r3
            r1 = r21
            org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSet r0 = r0.num_short_term_ref_pic_sets(r1)
            r0 = r3
            r1 = r22
            org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSet r0 = r0.num_long_term_ref_pics_sps(r1)
            r0 = r3
            r1 = r23
            org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSet r0 = r0.pcm_sample_bit_depth_luma_minus1(r1)
            r0 = r3
            r1 = r24
            org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSet r0 = r0.pcm_sample_bit_depth_chroma_minus1(r1)
            r0 = r3
            r1 = r25
            org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSet r0 = r0.log2_min_pcm_luma_coding_block_size_minus3(r1)
            r0 = r3
            r1 = r26
            org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSet r0 = r0.log2_diff_max_min_pcm_luma_coding_block_size(r1)
            r0 = r3
            r1 = r27
            org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSet r0 = r0.palette_max_size(r1)
            r0 = r3
            r1 = r28
            org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSet r0 = r0.delta_palette_max_predictor_size(r1)
            r0 = r3
            r1 = r29
            org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSet r0 = r0.motion_vector_resolution_control_idc(r1)
            r0 = r3
            r1 = r30
            org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSet r0 = r0.sps_num_palette_predictor_initializer_minus1(r1)
            r0 = r3
            r1 = r31
            org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSet r0 = r0.conf_win_left_offset(r1)
            r0 = r3
            r1 = r32
            org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSet r0 = r0.conf_win_right_offset(r1)
            r0 = r3
            r1 = r33
            org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSet r0 = r0.conf_win_top_offset(r1)
            r0 = r3
            r1 = r34
            org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSet r0 = r0.conf_win_bottom_offset(r1)
            r0 = r3
            r1 = r35
            org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSet r0 = r0.pProfileTierLevel(r1)
            r0 = r3
            r1 = r36
            org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSet r0 = r0.pDecPicBufMgr(r1)
            r0 = r3
            r1 = r37
            org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSet r0 = r0.pScalingLists(r1)
            r0 = r3
            r1 = r38
            org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSet r0 = r0.pShortTermRefPicSet(r1)
            r0 = r3
            r1 = r39
            org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSet r0 = r0.pLongTermRefPicsSps(r1)
            r0 = r3
            r1 = r40
            org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSet r0 = r0.pSequenceParameterSetVui(r1)
            r0 = r3
            r1 = r41
            org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSet r0 = r0.pPredictorPaletteEntries(r1)
            r0 = r3
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSet set(org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSet r8) {
            r7 = this;
            r0 = r8
            long r0 = r0.address()
            r1 = r7
            long r1 = r1.address()
            int r2 = org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSet.SIZEOF
            long r2 = (long) r2
            org.lwjgl.system.MemoryUtil.memCopy(r0, r1, r2)
            r0 = r7
            return r0
    }

    public static org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSet malloc() {
            org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSet r0 = new org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSet
            r1 = r0
            int r2 = org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSet.SIZEOF
            long r2 = (long) r2
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSet calloc() {
            org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSet r0 = new org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSet
            r1 = r0
            r2 = 1
            int r3 = org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSet.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSet create() {
            int r0 = org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSet.SIZEOF
            java.nio.ByteBuffer r0 = org.lwjgl.BufferUtils.createByteBuffer(r0)
            r6 = r0
            org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSet r0 = new org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSet
            r1 = r0
            r2 = r6
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSet create(long r6) {
            org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSet r0 = new org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSet
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSet createSafe(long r6) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSet r0 = new org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSet
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSet.Buffer malloc(int r6) {
            org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSet$Buffer r0 = new org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSet$Buffer
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSet.SIZEOF
            long r2 = __checkMalloc(r2, r3)
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSet.Buffer calloc(int r7) {
            org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSet$Buffer r0 = new org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSet$Buffer
            r1 = r0
            r2 = r7
            long r2 = (long) r2
            int r3 = org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSet.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSet.Buffer create(int r10) {
            r0 = r10
            int r1 = org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSet.SIZEOF
            java.nio.ByteBuffer r0 = __create(r0, r1)
            r11 = r0
            org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSet$Buffer r0 = new org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSet$Buffer
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

    public static org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSet.Buffer create(long r6, int r8) {
            org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSet$Buffer r0 = new org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSet$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSet.Buffer createSafe(long r6, int r8) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSet$Buffer r0 = new org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSet$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSet malloc(org.lwjgl.system.MemoryStack r6) {
            org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSet r0 = new org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSet
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSet.ALIGNOF
            int r4 = org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSet.SIZEOF
            long r2 = r2.nmalloc(r3, r4)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSet calloc(org.lwjgl.system.MemoryStack r7) {
            org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSet r0 = new org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSet
            r1 = r0
            r2 = r7
            int r3 = org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSet.ALIGNOF
            r4 = 1
            int r5 = org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSet.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSet.Buffer malloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSet$Buffer r0 = new org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSet$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSet.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSet.SIZEOF
            int r4 = r4 * r5
            long r2 = r2.nmalloc(r3, r4)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSet.Buffer calloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSet$Buffer r0 = new org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSet$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSet.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSet.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.video.StdVideoH265SpsFlags nflags(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSet.FLAGS
            long r1 = (long) r1
            long r0 = r0 + r1
            org.lwjgl.vulkan.video.StdVideoH265SpsFlags r0 = org.lwjgl.vulkan.video.StdVideoH265SpsFlags.create(r0)
            return r0
    }

    public static int nchroma_format_idc(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSet.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSet.CHROMA_FORMAT_IDC
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int npic_width_in_luma_samples(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSet.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSet.PIC_WIDTH_IN_LUMA_SAMPLES
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int npic_height_in_luma_samples(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSet.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSet.PIC_HEIGHT_IN_LUMA_SAMPLES
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static byte nsps_video_parameter_set_id(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSet.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSet.SPS_VIDEO_PARAMETER_SET_ID
            long r3 = (long) r3
            long r2 = r2 + r3
            byte r0 = r0.getByte(r1, r2)
            return r0
    }

    public static byte nsps_max_sub_layers_minus1(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSet.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSet.SPS_MAX_SUB_LAYERS_MINUS1
            long r3 = (long) r3
            long r2 = r2 + r3
            byte r0 = r0.getByte(r1, r2)
            return r0
    }

    public static byte nsps_seq_parameter_set_id(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSet.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSet.SPS_SEQ_PARAMETER_SET_ID
            long r3 = (long) r3
            long r2 = r2 + r3
            byte r0 = r0.getByte(r1, r2)
            return r0
    }

    public static byte nbit_depth_luma_minus8(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSet.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSet.BIT_DEPTH_LUMA_MINUS8
            long r3 = (long) r3
            long r2 = r2 + r3
            byte r0 = r0.getByte(r1, r2)
            return r0
    }

    public static byte nbit_depth_chroma_minus8(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSet.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSet.BIT_DEPTH_CHROMA_MINUS8
            long r3 = (long) r3
            long r2 = r2 + r3
            byte r0 = r0.getByte(r1, r2)
            return r0
    }

    public static byte nlog2_max_pic_order_cnt_lsb_minus4(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSet.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSet.LOG2_MAX_PIC_ORDER_CNT_LSB_MINUS4
            long r3 = (long) r3
            long r2 = r2 + r3
            byte r0 = r0.getByte(r1, r2)
            return r0
    }

    public static byte nsps_max_dec_pic_buffering_minus1(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSet.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSet.SPS_MAX_DEC_PIC_BUFFERING_MINUS1
            long r3 = (long) r3
            long r2 = r2 + r3
            byte r0 = r0.getByte(r1, r2)
            return r0
    }

    public static byte nlog2_min_luma_coding_block_size_minus3(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSet.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSet.LOG2_MIN_LUMA_CODING_BLOCK_SIZE_MINUS3
            long r3 = (long) r3
            long r2 = r2 + r3
            byte r0 = r0.getByte(r1, r2)
            return r0
    }

    public static byte nlog2_diff_max_min_luma_coding_block_size(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSet.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSet.LOG2_DIFF_MAX_MIN_LUMA_CODING_BLOCK_SIZE
            long r3 = (long) r3
            long r2 = r2 + r3
            byte r0 = r0.getByte(r1, r2)
            return r0
    }

    public static byte nlog2_min_luma_transform_block_size_minus2(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSet.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSet.LOG2_MIN_LUMA_TRANSFORM_BLOCK_SIZE_MINUS2
            long r3 = (long) r3
            long r2 = r2 + r3
            byte r0 = r0.getByte(r1, r2)
            return r0
    }

    public static byte nlog2_diff_max_min_luma_transform_block_size(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSet.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSet.LOG2_DIFF_MAX_MIN_LUMA_TRANSFORM_BLOCK_SIZE
            long r3 = (long) r3
            long r2 = r2 + r3
            byte r0 = r0.getByte(r1, r2)
            return r0
    }

    public static byte nmax_transform_hierarchy_depth_inter(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSet.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSet.MAX_TRANSFORM_HIERARCHY_DEPTH_INTER
            long r3 = (long) r3
            long r2 = r2 + r3
            byte r0 = r0.getByte(r1, r2)
            return r0
    }

    public static byte nmax_transform_hierarchy_depth_intra(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSet.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSet.MAX_TRANSFORM_HIERARCHY_DEPTH_INTRA
            long r3 = (long) r3
            long r2 = r2 + r3
            byte r0 = r0.getByte(r1, r2)
            return r0
    }

    public static byte nnum_short_term_ref_pic_sets(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSet.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSet.NUM_SHORT_TERM_REF_PIC_SETS
            long r3 = (long) r3
            long r2 = r2 + r3
            byte r0 = r0.getByte(r1, r2)
            return r0
    }

    public static byte nnum_long_term_ref_pics_sps(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSet.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSet.NUM_LONG_TERM_REF_PICS_SPS
            long r3 = (long) r3
            long r2 = r2 + r3
            byte r0 = r0.getByte(r1, r2)
            return r0
    }

    public static byte npcm_sample_bit_depth_luma_minus1(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSet.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSet.PCM_SAMPLE_BIT_DEPTH_LUMA_MINUS1
            long r3 = (long) r3
            long r2 = r2 + r3
            byte r0 = r0.getByte(r1, r2)
            return r0
    }

    public static byte npcm_sample_bit_depth_chroma_minus1(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSet.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSet.PCM_SAMPLE_BIT_DEPTH_CHROMA_MINUS1
            long r3 = (long) r3
            long r2 = r2 + r3
            byte r0 = r0.getByte(r1, r2)
            return r0
    }

    public static byte nlog2_min_pcm_luma_coding_block_size_minus3(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSet.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSet.LOG2_MIN_PCM_LUMA_CODING_BLOCK_SIZE_MINUS3
            long r3 = (long) r3
            long r2 = r2 + r3
            byte r0 = r0.getByte(r1, r2)
            return r0
    }

    public static byte nlog2_diff_max_min_pcm_luma_coding_block_size(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSet.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSet.LOG2_DIFF_MAX_MIN_PCM_LUMA_CODING_BLOCK_SIZE
            long r3 = (long) r3
            long r2 = r2 + r3
            byte r0 = r0.getByte(r1, r2)
            return r0
    }

    public static byte nreserved1(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSet.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSet.RESERVED1
            long r3 = (long) r3
            long r2 = r2 + r3
            byte r0 = r0.getByte(r1, r2)
            return r0
    }

    public static byte nreserved2(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSet.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSet.RESERVED2
            long r3 = (long) r3
            long r2 = r2 + r3
            byte r0 = r0.getByte(r1, r2)
            return r0
    }

    public static byte npalette_max_size(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSet.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSet.PALETTE_MAX_SIZE
            long r3 = (long) r3
            long r2 = r2 + r3
            byte r0 = r0.getByte(r1, r2)
            return r0
    }

    public static byte ndelta_palette_max_predictor_size(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSet.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSet.DELTA_PALETTE_MAX_PREDICTOR_SIZE
            long r3 = (long) r3
            long r2 = r2 + r3
            byte r0 = r0.getByte(r1, r2)
            return r0
    }

    public static byte nmotion_vector_resolution_control_idc(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSet.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSet.MOTION_VECTOR_RESOLUTION_CONTROL_IDC
            long r3 = (long) r3
            long r2 = r2 + r3
            byte r0 = r0.getByte(r1, r2)
            return r0
    }

    public static byte nsps_num_palette_predictor_initializer_minus1(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSet.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSet.SPS_NUM_PALETTE_PREDICTOR_INITIALIZER_MINUS1
            long r3 = (long) r3
            long r2 = r2 + r3
            byte r0 = r0.getByte(r1, r2)
            return r0
    }

    public static int nconf_win_left_offset(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSet.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSet.CONF_WIN_LEFT_OFFSET
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int nconf_win_right_offset(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSet.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSet.CONF_WIN_RIGHT_OFFSET
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int nconf_win_top_offset(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSet.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSet.CONF_WIN_TOP_OFFSET
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int nconf_win_bottom_offset(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSet.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSet.CONF_WIN_BOTTOM_OFFSET
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static org.lwjgl.vulkan.video.StdVideoH265ProfileTierLevel npProfileTierLevel(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSet.PPROFILETIERLEVEL
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            org.lwjgl.vulkan.video.StdVideoH265ProfileTierLevel r0 = org.lwjgl.vulkan.video.StdVideoH265ProfileTierLevel.create(r0)
            return r0
    }

    public static org.lwjgl.vulkan.video.StdVideoH265DecPicBufMgr npDecPicBufMgr(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSet.PDECPICBUFMGR
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            org.lwjgl.vulkan.video.StdVideoH265DecPicBufMgr r0 = org.lwjgl.vulkan.video.StdVideoH265DecPicBufMgr.create(r0)
            return r0
    }

    public static org.lwjgl.vulkan.video.StdVideoH265ScalingLists npScalingLists(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSet.PSCALINGLISTS
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            org.lwjgl.vulkan.video.StdVideoH265ScalingLists r0 = org.lwjgl.vulkan.video.StdVideoH265ScalingLists.create(r0)
            return r0
    }

    public static org.lwjgl.vulkan.video.StdVideoH265ShortTermRefPicSet npShortTermRefPicSet(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSet.PSHORTTERMREFPICSET
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            org.lwjgl.vulkan.video.StdVideoH265ShortTermRefPicSet r0 = org.lwjgl.vulkan.video.StdVideoH265ShortTermRefPicSet.create(r0)
            return r0
    }

    public static org.lwjgl.vulkan.video.StdVideoH265LongTermRefPicsSps npLongTermRefPicsSps(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSet.PLONGTERMREFPICSSPS
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            org.lwjgl.vulkan.video.StdVideoH265LongTermRefPicsSps r0 = org.lwjgl.vulkan.video.StdVideoH265LongTermRefPicsSps.create(r0)
            return r0
    }

    public static org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSetVui npSequenceParameterSetVui(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSet.PSEQUENCEPARAMETERSETVUI
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSetVui r0 = org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSetVui.create(r0)
            return r0
    }

    public static org.lwjgl.vulkan.video.StdVideoH265PredictorPaletteEntries npPredictorPaletteEntries(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSet.PPREDICTORPALETTEENTRIES
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            org.lwjgl.vulkan.video.StdVideoH265PredictorPaletteEntries r0 = org.lwjgl.vulkan.video.StdVideoH265PredictorPaletteEntries.create(r0)
            return r0
    }

    public static void nflags(long r7, org.lwjgl.vulkan.video.StdVideoH265SpsFlags r9) {
            r0 = r9
            long r0 = r0.address()
            r1 = r7
            int r2 = org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSet.FLAGS
            long r2 = (long) r2
            long r1 = r1 + r2
            int r2 = org.lwjgl.vulkan.video.StdVideoH265SpsFlags.SIZEOF
            long r2 = (long) r2
            org.lwjgl.system.MemoryUtil.memCopy(r0, r1, r2)
            return
    }

    public static void nchroma_format_idc(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSet.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSet.CHROMA_FORMAT_IDC
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void npic_width_in_luma_samples(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSet.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSet.PIC_WIDTH_IN_LUMA_SAMPLES
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void npic_height_in_luma_samples(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSet.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSet.PIC_HEIGHT_IN_LUMA_SAMPLES
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void nsps_video_parameter_set_id(long r7, byte r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSet.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSet.SPS_VIDEO_PARAMETER_SET_ID
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putByte(r1, r2, r3)
            return
    }

    public static void nsps_max_sub_layers_minus1(long r7, byte r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSet.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSet.SPS_MAX_SUB_LAYERS_MINUS1
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putByte(r1, r2, r3)
            return
    }

    public static void nsps_seq_parameter_set_id(long r7, byte r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSet.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSet.SPS_SEQ_PARAMETER_SET_ID
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putByte(r1, r2, r3)
            return
    }

    public static void nbit_depth_luma_minus8(long r7, byte r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSet.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSet.BIT_DEPTH_LUMA_MINUS8
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putByte(r1, r2, r3)
            return
    }

    public static void nbit_depth_chroma_minus8(long r7, byte r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSet.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSet.BIT_DEPTH_CHROMA_MINUS8
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putByte(r1, r2, r3)
            return
    }

    public static void nlog2_max_pic_order_cnt_lsb_minus4(long r7, byte r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSet.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSet.LOG2_MAX_PIC_ORDER_CNT_LSB_MINUS4
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putByte(r1, r2, r3)
            return
    }

    public static void nsps_max_dec_pic_buffering_minus1(long r7, byte r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSet.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSet.SPS_MAX_DEC_PIC_BUFFERING_MINUS1
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putByte(r1, r2, r3)
            return
    }

    public static void nlog2_min_luma_coding_block_size_minus3(long r7, byte r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSet.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSet.LOG2_MIN_LUMA_CODING_BLOCK_SIZE_MINUS3
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putByte(r1, r2, r3)
            return
    }

    public static void nlog2_diff_max_min_luma_coding_block_size(long r7, byte r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSet.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSet.LOG2_DIFF_MAX_MIN_LUMA_CODING_BLOCK_SIZE
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putByte(r1, r2, r3)
            return
    }

    public static void nlog2_min_luma_transform_block_size_minus2(long r7, byte r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSet.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSet.LOG2_MIN_LUMA_TRANSFORM_BLOCK_SIZE_MINUS2
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putByte(r1, r2, r3)
            return
    }

    public static void nlog2_diff_max_min_luma_transform_block_size(long r7, byte r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSet.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSet.LOG2_DIFF_MAX_MIN_LUMA_TRANSFORM_BLOCK_SIZE
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putByte(r1, r2, r3)
            return
    }

    public static void nmax_transform_hierarchy_depth_inter(long r7, byte r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSet.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSet.MAX_TRANSFORM_HIERARCHY_DEPTH_INTER
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putByte(r1, r2, r3)
            return
    }

    public static void nmax_transform_hierarchy_depth_intra(long r7, byte r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSet.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSet.MAX_TRANSFORM_HIERARCHY_DEPTH_INTRA
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putByte(r1, r2, r3)
            return
    }

    public static void nnum_short_term_ref_pic_sets(long r7, byte r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSet.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSet.NUM_SHORT_TERM_REF_PIC_SETS
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putByte(r1, r2, r3)
            return
    }

    public static void nnum_long_term_ref_pics_sps(long r7, byte r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSet.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSet.NUM_LONG_TERM_REF_PICS_SPS
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putByte(r1, r2, r3)
            return
    }

    public static void npcm_sample_bit_depth_luma_minus1(long r7, byte r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSet.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSet.PCM_SAMPLE_BIT_DEPTH_LUMA_MINUS1
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putByte(r1, r2, r3)
            return
    }

    public static void npcm_sample_bit_depth_chroma_minus1(long r7, byte r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSet.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSet.PCM_SAMPLE_BIT_DEPTH_CHROMA_MINUS1
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putByte(r1, r2, r3)
            return
    }

    public static void nlog2_min_pcm_luma_coding_block_size_minus3(long r7, byte r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSet.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSet.LOG2_MIN_PCM_LUMA_CODING_BLOCK_SIZE_MINUS3
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putByte(r1, r2, r3)
            return
    }

    public static void nlog2_diff_max_min_pcm_luma_coding_block_size(long r7, byte r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSet.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSet.LOG2_DIFF_MAX_MIN_PCM_LUMA_CODING_BLOCK_SIZE
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putByte(r1, r2, r3)
            return
    }

    public static void nreserved1(long r7, byte r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSet.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSet.RESERVED1
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putByte(r1, r2, r3)
            return
    }

    public static void nreserved2(long r7, byte r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSet.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSet.RESERVED2
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putByte(r1, r2, r3)
            return
    }

    public static void npalette_max_size(long r7, byte r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSet.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSet.PALETTE_MAX_SIZE
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putByte(r1, r2, r3)
            return
    }

    public static void ndelta_palette_max_predictor_size(long r7, byte r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSet.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSet.DELTA_PALETTE_MAX_PREDICTOR_SIZE
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putByte(r1, r2, r3)
            return
    }

    public static void nmotion_vector_resolution_control_idc(long r7, byte r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSet.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSet.MOTION_VECTOR_RESOLUTION_CONTROL_IDC
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putByte(r1, r2, r3)
            return
    }

    public static void nsps_num_palette_predictor_initializer_minus1(long r7, byte r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSet.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSet.SPS_NUM_PALETTE_PREDICTOR_INITIALIZER_MINUS1
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putByte(r1, r2, r3)
            return
    }

    public static void nconf_win_left_offset(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSet.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSet.CONF_WIN_LEFT_OFFSET
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void nconf_win_right_offset(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSet.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSet.CONF_WIN_RIGHT_OFFSET
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void nconf_win_top_offset(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSet.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSet.CONF_WIN_TOP_OFFSET
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void nconf_win_bottom_offset(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSet.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSet.CONF_WIN_BOTTOM_OFFSET
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void npProfileTierLevel(long r5, org.lwjgl.vulkan.video.StdVideoH265ProfileTierLevel r7) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSet.PPROFILETIERLEVEL
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            long r1 = r1.address()
            org.lwjgl.system.MemoryUtil.memPutAddress(r0, r1)
            return
    }

    public static void npDecPicBufMgr(long r5, org.lwjgl.vulkan.video.StdVideoH265DecPicBufMgr r7) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSet.PDECPICBUFMGR
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            long r1 = r1.address()
            org.lwjgl.system.MemoryUtil.memPutAddress(r0, r1)
            return
    }

    public static void npScalingLists(long r5, org.lwjgl.vulkan.video.StdVideoH265ScalingLists r7) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSet.PSCALINGLISTS
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            long r1 = r1.address()
            org.lwjgl.system.MemoryUtil.memPutAddress(r0, r1)
            return
    }

    public static void npShortTermRefPicSet(long r5, org.lwjgl.vulkan.video.StdVideoH265ShortTermRefPicSet r7) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSet.PSHORTTERMREFPICSET
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            long r1 = r1.address()
            org.lwjgl.system.MemoryUtil.memPutAddress(r0, r1)
            return
    }

    public static void npLongTermRefPicsSps(long r5, org.lwjgl.vulkan.video.StdVideoH265LongTermRefPicsSps r7) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSet.PLONGTERMREFPICSSPS
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            long r1 = r1.address()
            org.lwjgl.system.MemoryUtil.memPutAddress(r0, r1)
            return
    }

    public static void npSequenceParameterSetVui(long r5, org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSetVui r7) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSet.PSEQUENCEPARAMETERSETVUI
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            long r1 = r1.address()
            org.lwjgl.system.MemoryUtil.memPutAddress(r0, r1)
            return
    }

    public static void npPredictorPaletteEntries(long r5, org.lwjgl.vulkan.video.StdVideoH265PredictorPaletteEntries r7) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSet.PPREDICTORPALETTEENTRIES
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            long r1 = r1.address()
            org.lwjgl.system.MemoryUtil.memPutAddress(r0, r1)
            return
    }

    public static void validate(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSet.PPROFILETIERLEVEL
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r5
            int r1 = org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSet.PDECPICBUFMGR
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r5
            int r1 = org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSet.PSCALINGLISTS
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r5
            int r1 = org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSet.PSHORTTERMREFPICSET
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r5
            int r1 = org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSet.PLONGTERMREFPICSSPS
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r5
            int r1 = org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSet.PSEQUENCEPARAMETERSETVUI
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            r7 = r0
            r0 = r7
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r7
            org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSetVui.validate(r0)
            r0 = r5
            int r1 = org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSet.PPREDICTORPALETTEENTRIES
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
            org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSet r0 = r0.create(r1, r2)
            return r0
    }

    static {
            r0 = 40
            org.lwjgl.system.Struct$Member[] r0 = new org.lwjgl.system.Struct.Member[r0]
            r1 = r0
            r2 = 0
            int r3 = org.lwjgl.vulkan.video.StdVideoH265SpsFlags.SIZEOF
            int r4 = org.lwjgl.vulkan.video.StdVideoH265SpsFlags.ALIGNOF
            org.lwjgl.system.Struct$Member r3 = __member(r3, r4)
            r1[r2] = r3
            r1 = r0
            r2 = 1
            r3 = 4
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 2
            r3 = 4
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 3
            r3 = 4
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
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 18
            r3 = 1
            org.lwjgl.system.Struct$Member r3 = __member(r3)
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
            r3 = 4
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 30
            r3 = 4
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 31
            r3 = 4
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 32
            r3 = 4
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 33
            int r3 = org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSet.POINTER_SIZE
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 34
            int r3 = org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSet.POINTER_SIZE
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 35
            int r3 = org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSet.POINTER_SIZE
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 36
            int r3 = org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSet.POINTER_SIZE
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 37
            int r3 = org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSet.POINTER_SIZE
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 38
            int r3 = org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSet.POINTER_SIZE
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 39
            int r3 = org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSet.POINTER_SIZE
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            org.lwjgl.system.Struct$Layout r0 = __struct(r0)
            r6 = r0
            r0 = r6
            int r0 = r0.getSize()
            org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSet.SIZEOF = r0
            r0 = r6
            int r0 = r0.getAlignment()
            org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSet.ALIGNOF = r0
            r0 = r6
            r1 = 0
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSet.FLAGS = r0
            r0 = r6
            r1 = 1
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSet.CHROMA_FORMAT_IDC = r0
            r0 = r6
            r1 = 2
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSet.PIC_WIDTH_IN_LUMA_SAMPLES = r0
            r0 = r6
            r1 = 3
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSet.PIC_HEIGHT_IN_LUMA_SAMPLES = r0
            r0 = r6
            r1 = 4
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSet.SPS_VIDEO_PARAMETER_SET_ID = r0
            r0 = r6
            r1 = 5
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSet.SPS_MAX_SUB_LAYERS_MINUS1 = r0
            r0 = r6
            r1 = 6
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSet.SPS_SEQ_PARAMETER_SET_ID = r0
            r0 = r6
            r1 = 7
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSet.BIT_DEPTH_LUMA_MINUS8 = r0
            r0 = r6
            r1 = 8
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSet.BIT_DEPTH_CHROMA_MINUS8 = r0
            r0 = r6
            r1 = 9
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSet.LOG2_MAX_PIC_ORDER_CNT_LSB_MINUS4 = r0
            r0 = r6
            r1 = 10
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSet.SPS_MAX_DEC_PIC_BUFFERING_MINUS1 = r0
            r0 = r6
            r1 = 11
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSet.LOG2_MIN_LUMA_CODING_BLOCK_SIZE_MINUS3 = r0
            r0 = r6
            r1 = 12
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSet.LOG2_DIFF_MAX_MIN_LUMA_CODING_BLOCK_SIZE = r0
            r0 = r6
            r1 = 13
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSet.LOG2_MIN_LUMA_TRANSFORM_BLOCK_SIZE_MINUS2 = r0
            r0 = r6
            r1 = 14
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSet.LOG2_DIFF_MAX_MIN_LUMA_TRANSFORM_BLOCK_SIZE = r0
            r0 = r6
            r1 = 15
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSet.MAX_TRANSFORM_HIERARCHY_DEPTH_INTER = r0
            r0 = r6
            r1 = 16
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSet.MAX_TRANSFORM_HIERARCHY_DEPTH_INTRA = r0
            r0 = r6
            r1 = 17
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSet.NUM_SHORT_TERM_REF_PIC_SETS = r0
            r0 = r6
            r1 = 18
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSet.NUM_LONG_TERM_REF_PICS_SPS = r0
            r0 = r6
            r1 = 19
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSet.PCM_SAMPLE_BIT_DEPTH_LUMA_MINUS1 = r0
            r0 = r6
            r1 = 20
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSet.PCM_SAMPLE_BIT_DEPTH_CHROMA_MINUS1 = r0
            r0 = r6
            r1 = 21
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSet.LOG2_MIN_PCM_LUMA_CODING_BLOCK_SIZE_MINUS3 = r0
            r0 = r6
            r1 = 22
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSet.LOG2_DIFF_MAX_MIN_PCM_LUMA_CODING_BLOCK_SIZE = r0
            r0 = r6
            r1 = 23
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSet.RESERVED1 = r0
            r0 = r6
            r1 = 24
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSet.RESERVED2 = r0
            r0 = r6
            r1 = 25
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSet.PALETTE_MAX_SIZE = r0
            r0 = r6
            r1 = 26
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSet.DELTA_PALETTE_MAX_PREDICTOR_SIZE = r0
            r0 = r6
            r1 = 27
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSet.MOTION_VECTOR_RESOLUTION_CONTROL_IDC = r0
            r0 = r6
            r1 = 28
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSet.SPS_NUM_PALETTE_PREDICTOR_INITIALIZER_MINUS1 = r0
            r0 = r6
            r1 = 29
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSet.CONF_WIN_LEFT_OFFSET = r0
            r0 = r6
            r1 = 30
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSet.CONF_WIN_RIGHT_OFFSET = r0
            r0 = r6
            r1 = 31
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSet.CONF_WIN_TOP_OFFSET = r0
            r0 = r6
            r1 = 32
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSet.CONF_WIN_BOTTOM_OFFSET = r0
            r0 = r6
            r1 = 33
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSet.PPROFILETIERLEVEL = r0
            r0 = r6
            r1 = 34
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSet.PDECPICBUFMGR = r0
            r0 = r6
            r1 = 35
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSet.PSCALINGLISTS = r0
            r0 = r6
            r1 = 36
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSet.PSHORTTERMREFPICSET = r0
            r0 = r6
            r1 = 37
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSet.PLONGTERMREFPICSSPS = r0
            r0 = r6
            r1 = 38
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSet.PSEQUENCEPARAMETERSETVUI = r0
            r0 = r6
            r1 = 39
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSet.PPREDICTORPALETTEENTRIES = r0
            return
    }
}
