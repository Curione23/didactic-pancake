package org.lwjgl.vulkan.video;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/video/StdVideoH264SequenceParameterSet.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/video/StdVideoH264SequenceParameterSet.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/video/StdVideoH264SequenceParameterSet.class */
public class StdVideoH264SequenceParameterSet extends org.lwjgl.system.Struct<org.lwjgl.vulkan.video.StdVideoH264SequenceParameterSet> implements org.lwjgl.system.NativeResource {
    public static final int SIZEOF = 0;
    public static final int ALIGNOF = 0;
    public static final int FLAGS = 0;
    public static final int PROFILE_IDC = 0;
    public static final int LEVEL_IDC = 0;
    public static final int CHROMA_FORMAT_IDC = 0;
    public static final int SEQ_PARAMETER_SET_ID = 0;
    public static final int BIT_DEPTH_LUMA_MINUS8 = 0;
    public static final int BIT_DEPTH_CHROMA_MINUS8 = 0;
    public static final int LOG2_MAX_FRAME_NUM_MINUS4 = 0;
    public static final int PIC_ORDER_CNT_TYPE = 0;
    public static final int OFFSET_FOR_NON_REF_PIC = 0;
    public static final int OFFSET_FOR_TOP_TO_BOTTOM_FIELD = 0;
    public static final int LOG2_MAX_PIC_ORDER_CNT_LSB_MINUS4 = 0;
    public static final int NUM_REF_FRAMES_IN_PIC_ORDER_CNT_CYCLE = 0;
    public static final int MAX_NUM_REF_FRAMES = 0;
    public static final int RESERVED1 = 0;
    public static final int PIC_WIDTH_IN_MBS_MINUS1 = 0;
    public static final int PIC_HEIGHT_IN_MAP_UNITS_MINUS1 = 0;
    public static final int FRAME_CROP_LEFT_OFFSET = 0;
    public static final int FRAME_CROP_RIGHT_OFFSET = 0;
    public static final int FRAME_CROP_TOP_OFFSET = 0;
    public static final int FRAME_CROP_BOTTOM_OFFSET = 0;
    public static final int RESERVED2 = 0;
    public static final int POFFSETFORREFFRAME = 0;
    public static final int PSCALINGLISTS = 0;
    public static final int PSEQUENCEPARAMETERSETVUI = 0;

    /* JADX WARN: Classes with same name are omitted, all sources:
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/video/StdVideoH264SequenceParameterSet$Buffer.class
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/video/StdVideoH264SequenceParameterSet$Buffer.class
     */
    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/video/StdVideoH264SequenceParameterSet$Buffer.class */
    public static class Buffer extends org.lwjgl.system.StructBuffer<org.lwjgl.vulkan.video.StdVideoH264SequenceParameterSet, org.lwjgl.vulkan.video.StdVideoH264SequenceParameterSet.Buffer> implements org.lwjgl.system.NativeResource {
        private static final org.lwjgl.vulkan.video.StdVideoH264SequenceParameterSet ELEMENT_FACTORY = null;

        public Buffer(java.nio.ByteBuffer r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r6
                int r2 = r2.remaining()
                int r3 = org.lwjgl.vulkan.video.StdVideoH264SequenceParameterSet.SIZEOF
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
        protected org.lwjgl.vulkan.video.StdVideoH264SequenceParameterSet.Buffer self() {
                r2 = this;
                r0 = r2
                return r0
        }

        @Override // org.lwjgl.system.StructBuffer
        protected org.lwjgl.vulkan.video.StdVideoH264SequenceParameterSet getElementFactory() {
                r2 = this;
                org.lwjgl.vulkan.video.StdVideoH264SequenceParameterSet r0 = org.lwjgl.vulkan.video.StdVideoH264SequenceParameterSet.Buffer.ELEMENT_FACTORY
                return r0
        }

        public org.lwjgl.vulkan.video.StdVideoH264SpsFlags flags() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                org.lwjgl.vulkan.video.StdVideoH264SpsFlags r0 = org.lwjgl.vulkan.video.StdVideoH264SequenceParameterSet.nflags(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("StdVideoH264ProfileIdc")
        public int profile_idc() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.video.StdVideoH264SequenceParameterSet.nprofile_idc(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("StdVideoH264LevelIdc")
        public int level_idc() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.video.StdVideoH264SequenceParameterSet.nlevel_idc(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("StdVideoH264ChromaFormatIdc")
        public int chroma_format_idc() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.video.StdVideoH264SequenceParameterSet.nchroma_format_idc(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint8_t")
        public byte seq_parameter_set_id() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                byte r0 = org.lwjgl.vulkan.video.StdVideoH264SequenceParameterSet.nseq_parameter_set_id(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint8_t")
        public byte bit_depth_luma_minus8() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                byte r0 = org.lwjgl.vulkan.video.StdVideoH264SequenceParameterSet.nbit_depth_luma_minus8(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint8_t")
        public byte bit_depth_chroma_minus8() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                byte r0 = org.lwjgl.vulkan.video.StdVideoH264SequenceParameterSet.nbit_depth_chroma_minus8(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint8_t")
        public byte log2_max_frame_num_minus4() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                byte r0 = org.lwjgl.vulkan.video.StdVideoH264SequenceParameterSet.nlog2_max_frame_num_minus4(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("StdVideoH264PocType")
        public int pic_order_cnt_type() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.video.StdVideoH264SequenceParameterSet.npic_order_cnt_type(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("int32_t")
        public int offset_for_non_ref_pic() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.video.StdVideoH264SequenceParameterSet.noffset_for_non_ref_pic(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("int32_t")
        public int offset_for_top_to_bottom_field() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.video.StdVideoH264SequenceParameterSet.noffset_for_top_to_bottom_field(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint8_t")
        public byte log2_max_pic_order_cnt_lsb_minus4() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                byte r0 = org.lwjgl.vulkan.video.StdVideoH264SequenceParameterSet.nlog2_max_pic_order_cnt_lsb_minus4(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint8_t")
        public byte num_ref_frames_in_pic_order_cnt_cycle() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                byte r0 = org.lwjgl.vulkan.video.StdVideoH264SequenceParameterSet.nnum_ref_frames_in_pic_order_cnt_cycle(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint8_t")
        public byte max_num_ref_frames() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                byte r0 = org.lwjgl.vulkan.video.StdVideoH264SequenceParameterSet.nmax_num_ref_frames(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint32_t")
        public int pic_width_in_mbs_minus1() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.video.StdVideoH264SequenceParameterSet.npic_width_in_mbs_minus1(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint32_t")
        public int pic_height_in_map_units_minus1() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.video.StdVideoH264SequenceParameterSet.npic_height_in_map_units_minus1(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint32_t")
        public int frame_crop_left_offset() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.video.StdVideoH264SequenceParameterSet.nframe_crop_left_offset(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint32_t")
        public int frame_crop_right_offset() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.video.StdVideoH264SequenceParameterSet.nframe_crop_right_offset(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint32_t")
        public int frame_crop_top_offset() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.video.StdVideoH264SequenceParameterSet.nframe_crop_top_offset(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint32_t")
        public int frame_crop_bottom_offset() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.video.StdVideoH264SequenceParameterSet.nframe_crop_bottom_offset(r0)
                return r0
        }

        @javax.annotation.Nullable
        @org.lwjgl.system.NativeType("int32_t const *")
        public java.nio.IntBuffer pOffsetForRefFrame() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                java.nio.IntBuffer r0 = org.lwjgl.vulkan.video.StdVideoH264SequenceParameterSet.npOffsetForRefFrame(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("StdVideoH264ScalingLists const *")
        public org.lwjgl.vulkan.video.StdVideoH264ScalingLists pScalingLists() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                org.lwjgl.vulkan.video.StdVideoH264ScalingLists r0 = org.lwjgl.vulkan.video.StdVideoH264SequenceParameterSet.npScalingLists(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("StdVideoH264SequenceParameterSetVui const *")
        public org.lwjgl.vulkan.video.StdVideoH264SequenceParameterSetVui pSequenceParameterSetVui() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                org.lwjgl.vulkan.video.StdVideoH264SequenceParameterSetVui r0 = org.lwjgl.vulkan.video.StdVideoH264SequenceParameterSet.npSequenceParameterSetVui(r0)
                return r0
        }

        public org.lwjgl.vulkan.video.StdVideoH264SequenceParameterSet.Buffer flags(org.lwjgl.vulkan.video.StdVideoH264SpsFlags r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.video.StdVideoH264SequenceParameterSet.nflags(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.video.StdVideoH264SequenceParameterSet.Buffer flags(java.util.function.Consumer<org.lwjgl.vulkan.video.StdVideoH264SpsFlags> r4) {
                r3 = this;
                r0 = r4
                r1 = r3
                org.lwjgl.vulkan.video.StdVideoH264SpsFlags r1 = r1.flags()
                r0.accept(r1)
                r0 = r3
                return r0
        }

        public org.lwjgl.vulkan.video.StdVideoH264SequenceParameterSet.Buffer profile_idc(@org.lwjgl.system.NativeType("StdVideoH264ProfileIdc") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.video.StdVideoH264SequenceParameterSet.nprofile_idc(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.video.StdVideoH264SequenceParameterSet.Buffer level_idc(@org.lwjgl.system.NativeType("StdVideoH264LevelIdc") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.video.StdVideoH264SequenceParameterSet.nlevel_idc(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.video.StdVideoH264SequenceParameterSet.Buffer chroma_format_idc(@org.lwjgl.system.NativeType("StdVideoH264ChromaFormatIdc") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.video.StdVideoH264SequenceParameterSet.nchroma_format_idc(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.video.StdVideoH264SequenceParameterSet.Buffer seq_parameter_set_id(@org.lwjgl.system.NativeType("uint8_t") byte r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.video.StdVideoH264SequenceParameterSet.nseq_parameter_set_id(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.video.StdVideoH264SequenceParameterSet.Buffer bit_depth_luma_minus8(@org.lwjgl.system.NativeType("uint8_t") byte r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.video.StdVideoH264SequenceParameterSet.nbit_depth_luma_minus8(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.video.StdVideoH264SequenceParameterSet.Buffer bit_depth_chroma_minus8(@org.lwjgl.system.NativeType("uint8_t") byte r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.video.StdVideoH264SequenceParameterSet.nbit_depth_chroma_minus8(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.video.StdVideoH264SequenceParameterSet.Buffer log2_max_frame_num_minus4(@org.lwjgl.system.NativeType("uint8_t") byte r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.video.StdVideoH264SequenceParameterSet.nlog2_max_frame_num_minus4(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.video.StdVideoH264SequenceParameterSet.Buffer pic_order_cnt_type(@org.lwjgl.system.NativeType("StdVideoH264PocType") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.video.StdVideoH264SequenceParameterSet.npic_order_cnt_type(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.video.StdVideoH264SequenceParameterSet.Buffer offset_for_non_ref_pic(@org.lwjgl.system.NativeType("int32_t") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.video.StdVideoH264SequenceParameterSet.noffset_for_non_ref_pic(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.video.StdVideoH264SequenceParameterSet.Buffer offset_for_top_to_bottom_field(@org.lwjgl.system.NativeType("int32_t") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.video.StdVideoH264SequenceParameterSet.noffset_for_top_to_bottom_field(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.video.StdVideoH264SequenceParameterSet.Buffer log2_max_pic_order_cnt_lsb_minus4(@org.lwjgl.system.NativeType("uint8_t") byte r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.video.StdVideoH264SequenceParameterSet.nlog2_max_pic_order_cnt_lsb_minus4(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.video.StdVideoH264SequenceParameterSet.Buffer num_ref_frames_in_pic_order_cnt_cycle(@org.lwjgl.system.NativeType("uint8_t") byte r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.video.StdVideoH264SequenceParameterSet.nnum_ref_frames_in_pic_order_cnt_cycle(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.video.StdVideoH264SequenceParameterSet.Buffer max_num_ref_frames(@org.lwjgl.system.NativeType("uint8_t") byte r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.video.StdVideoH264SequenceParameterSet.nmax_num_ref_frames(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.video.StdVideoH264SequenceParameterSet.Buffer pic_width_in_mbs_minus1(@org.lwjgl.system.NativeType("uint32_t") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.video.StdVideoH264SequenceParameterSet.npic_width_in_mbs_minus1(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.video.StdVideoH264SequenceParameterSet.Buffer pic_height_in_map_units_minus1(@org.lwjgl.system.NativeType("uint32_t") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.video.StdVideoH264SequenceParameterSet.npic_height_in_map_units_minus1(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.video.StdVideoH264SequenceParameterSet.Buffer frame_crop_left_offset(@org.lwjgl.system.NativeType("uint32_t") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.video.StdVideoH264SequenceParameterSet.nframe_crop_left_offset(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.video.StdVideoH264SequenceParameterSet.Buffer frame_crop_right_offset(@org.lwjgl.system.NativeType("uint32_t") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.video.StdVideoH264SequenceParameterSet.nframe_crop_right_offset(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.video.StdVideoH264SequenceParameterSet.Buffer frame_crop_top_offset(@org.lwjgl.system.NativeType("uint32_t") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.video.StdVideoH264SequenceParameterSet.nframe_crop_top_offset(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.video.StdVideoH264SequenceParameterSet.Buffer frame_crop_bottom_offset(@org.lwjgl.system.NativeType("uint32_t") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.video.StdVideoH264SequenceParameterSet.nframe_crop_bottom_offset(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.video.StdVideoH264SequenceParameterSet.Buffer pOffsetForRefFrame(@javax.annotation.Nullable @org.lwjgl.system.NativeType("int32_t const *") java.nio.IntBuffer r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.video.StdVideoH264SequenceParameterSet.npOffsetForRefFrame(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.video.StdVideoH264SequenceParameterSet.Buffer pScalingLists(@org.lwjgl.system.NativeType("StdVideoH264ScalingLists const *") org.lwjgl.vulkan.video.StdVideoH264ScalingLists r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.video.StdVideoH264SequenceParameterSet.npScalingLists(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.video.StdVideoH264SequenceParameterSet.Buffer pSequenceParameterSetVui(@org.lwjgl.system.NativeType("StdVideoH264SequenceParameterSetVui const *") org.lwjgl.vulkan.video.StdVideoH264SequenceParameterSetVui r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.video.StdVideoH264SequenceParameterSet.npSequenceParameterSetVui(r0, r1)
                r0 = r4
                return r0
        }

        @Override // org.lwjgl.system.StructBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.Struct getElementFactory() {
                r2 = this;
                r0 = r2
                org.lwjgl.vulkan.video.StdVideoH264SequenceParameterSet r0 = r0.getElementFactory()
                return r0
        }

        @Override // org.lwjgl.system.CustomBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.CustomBuffer self() {
                r2 = this;
                r0 = r2
                org.lwjgl.vulkan.video.StdVideoH264SequenceParameterSet$Buffer r0 = r0.self()
                return r0
        }

        static {
                r0 = -1
                org.lwjgl.vulkan.video.StdVideoH264SequenceParameterSet r0 = org.lwjgl.vulkan.video.StdVideoH264SequenceParameterSet.create(r0)
                org.lwjgl.vulkan.video.StdVideoH264SequenceParameterSet.Buffer.ELEMENT_FACTORY = r0
                return
        }
    }

    protected StdVideoH264SequenceParameterSet(long r6, @javax.annotation.Nullable java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    protected org.lwjgl.vulkan.video.StdVideoH264SequenceParameterSet create(long r7, @javax.annotation.Nullable java.nio.ByteBuffer r9) {
            r6 = this;
            org.lwjgl.vulkan.video.StdVideoH264SequenceParameterSet r0 = new org.lwjgl.vulkan.video.StdVideoH264SequenceParameterSet
            r1 = r0
            r2 = r7
            r3 = r9
            r1.<init>(r2, r3)
            return r0
    }

    public StdVideoH264SequenceParameterSet(java.nio.ByteBuffer r7) {
            r6 = this;
            r0 = r6
            r1 = r7
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            r2 = r7
            int r3 = org.lwjgl.vulkan.video.StdVideoH264SequenceParameterSet.SIZEOF
            java.nio.ByteBuffer r2 = __checkContainer(r2, r3)
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
            r2 = this;
            int r0 = org.lwjgl.vulkan.video.StdVideoH264SequenceParameterSet.SIZEOF
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoH264SpsFlags flags() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            org.lwjgl.vulkan.video.StdVideoH264SpsFlags r0 = nflags(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("StdVideoH264ProfileIdc")
    public int profile_idc() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nprofile_idc(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("StdVideoH264LevelIdc")
    public int level_idc() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nlevel_idc(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("StdVideoH264ChromaFormatIdc")
    public int chroma_format_idc() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nchroma_format_idc(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("uint8_t")
    public byte seq_parameter_set_id() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            byte r0 = nseq_parameter_set_id(r0)
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
    public byte log2_max_frame_num_minus4() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            byte r0 = nlog2_max_frame_num_minus4(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("StdVideoH264PocType")
    public int pic_order_cnt_type() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = npic_order_cnt_type(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("int32_t")
    public int offset_for_non_ref_pic() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = noffset_for_non_ref_pic(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("int32_t")
    public int offset_for_top_to_bottom_field() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = noffset_for_top_to_bottom_field(r0)
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
    public byte num_ref_frames_in_pic_order_cnt_cycle() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            byte r0 = nnum_ref_frames_in_pic_order_cnt_cycle(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("uint8_t")
    public byte max_num_ref_frames() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            byte r0 = nmax_num_ref_frames(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("uint32_t")
    public int pic_width_in_mbs_minus1() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = npic_width_in_mbs_minus1(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("uint32_t")
    public int pic_height_in_map_units_minus1() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = npic_height_in_map_units_minus1(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("uint32_t")
    public int frame_crop_left_offset() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nframe_crop_left_offset(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("uint32_t")
    public int frame_crop_right_offset() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nframe_crop_right_offset(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("uint32_t")
    public int frame_crop_top_offset() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nframe_crop_top_offset(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("uint32_t")
    public int frame_crop_bottom_offset() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nframe_crop_bottom_offset(r0)
            return r0
    }

    @javax.annotation.Nullable
    @org.lwjgl.system.NativeType("int32_t const *")
    public java.nio.IntBuffer pOffsetForRefFrame() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            java.nio.IntBuffer r0 = npOffsetForRefFrame(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("StdVideoH264ScalingLists const *")
    public org.lwjgl.vulkan.video.StdVideoH264ScalingLists pScalingLists() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            org.lwjgl.vulkan.video.StdVideoH264ScalingLists r0 = npScalingLists(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("StdVideoH264SequenceParameterSetVui const *")
    public org.lwjgl.vulkan.video.StdVideoH264SequenceParameterSetVui pSequenceParameterSetVui() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            org.lwjgl.vulkan.video.StdVideoH264SequenceParameterSetVui r0 = npSequenceParameterSetVui(r0)
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoH264SequenceParameterSet flags(org.lwjgl.vulkan.video.StdVideoH264SpsFlags r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nflags(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoH264SequenceParameterSet flags(java.util.function.Consumer<org.lwjgl.vulkan.video.StdVideoH264SpsFlags> r4) {
            r3 = this;
            r0 = r4
            r1 = r3
            org.lwjgl.vulkan.video.StdVideoH264SpsFlags r1 = r1.flags()
            r0.accept(r1)
            r0 = r3
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoH264SequenceParameterSet profile_idc(@org.lwjgl.system.NativeType("StdVideoH264ProfileIdc") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nprofile_idc(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoH264SequenceParameterSet level_idc(@org.lwjgl.system.NativeType("StdVideoH264LevelIdc") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nlevel_idc(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoH264SequenceParameterSet chroma_format_idc(@org.lwjgl.system.NativeType("StdVideoH264ChromaFormatIdc") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nchroma_format_idc(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoH264SequenceParameterSet seq_parameter_set_id(@org.lwjgl.system.NativeType("uint8_t") byte r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nseq_parameter_set_id(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoH264SequenceParameterSet bit_depth_luma_minus8(@org.lwjgl.system.NativeType("uint8_t") byte r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nbit_depth_luma_minus8(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoH264SequenceParameterSet bit_depth_chroma_minus8(@org.lwjgl.system.NativeType("uint8_t") byte r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nbit_depth_chroma_minus8(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoH264SequenceParameterSet log2_max_frame_num_minus4(@org.lwjgl.system.NativeType("uint8_t") byte r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nlog2_max_frame_num_minus4(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoH264SequenceParameterSet pic_order_cnt_type(@org.lwjgl.system.NativeType("StdVideoH264PocType") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            npic_order_cnt_type(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoH264SequenceParameterSet offset_for_non_ref_pic(@org.lwjgl.system.NativeType("int32_t") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            noffset_for_non_ref_pic(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoH264SequenceParameterSet offset_for_top_to_bottom_field(@org.lwjgl.system.NativeType("int32_t") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            noffset_for_top_to_bottom_field(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoH264SequenceParameterSet log2_max_pic_order_cnt_lsb_minus4(@org.lwjgl.system.NativeType("uint8_t") byte r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nlog2_max_pic_order_cnt_lsb_minus4(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoH264SequenceParameterSet num_ref_frames_in_pic_order_cnt_cycle(@org.lwjgl.system.NativeType("uint8_t") byte r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nnum_ref_frames_in_pic_order_cnt_cycle(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoH264SequenceParameterSet max_num_ref_frames(@org.lwjgl.system.NativeType("uint8_t") byte r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nmax_num_ref_frames(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoH264SequenceParameterSet pic_width_in_mbs_minus1(@org.lwjgl.system.NativeType("uint32_t") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            npic_width_in_mbs_minus1(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoH264SequenceParameterSet pic_height_in_map_units_minus1(@org.lwjgl.system.NativeType("uint32_t") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            npic_height_in_map_units_minus1(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoH264SequenceParameterSet frame_crop_left_offset(@org.lwjgl.system.NativeType("uint32_t") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nframe_crop_left_offset(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoH264SequenceParameterSet frame_crop_right_offset(@org.lwjgl.system.NativeType("uint32_t") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nframe_crop_right_offset(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoH264SequenceParameterSet frame_crop_top_offset(@org.lwjgl.system.NativeType("uint32_t") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nframe_crop_top_offset(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoH264SequenceParameterSet frame_crop_bottom_offset(@org.lwjgl.system.NativeType("uint32_t") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nframe_crop_bottom_offset(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoH264SequenceParameterSet pOffsetForRefFrame(@javax.annotation.Nullable @org.lwjgl.system.NativeType("int32_t const *") java.nio.IntBuffer r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            npOffsetForRefFrame(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoH264SequenceParameterSet pScalingLists(@org.lwjgl.system.NativeType("StdVideoH264ScalingLists const *") org.lwjgl.vulkan.video.StdVideoH264ScalingLists r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            npScalingLists(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoH264SequenceParameterSet pSequenceParameterSetVui(@org.lwjgl.system.NativeType("StdVideoH264SequenceParameterSetVui const *") org.lwjgl.vulkan.video.StdVideoH264SequenceParameterSetVui r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            npSequenceParameterSetVui(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoH264SequenceParameterSet set(org.lwjgl.vulkan.video.StdVideoH264SpsFlags r4, int r5, int r6, int r7, byte r8, byte r9, byte r10, byte r11, int r12, int r13, int r14, byte r15, byte r16, byte r17, int r18, int r19, int r20, int r21, int r22, int r23, @javax.annotation.Nullable java.nio.IntBuffer r24, org.lwjgl.vulkan.video.StdVideoH264ScalingLists r25, org.lwjgl.vulkan.video.StdVideoH264SequenceParameterSetVui r26) {
            r3 = this;
            r0 = r3
            r1 = r4
            org.lwjgl.vulkan.video.StdVideoH264SequenceParameterSet r0 = r0.flags(r1)
            r0 = r3
            r1 = r5
            org.lwjgl.vulkan.video.StdVideoH264SequenceParameterSet r0 = r0.profile_idc(r1)
            r0 = r3
            r1 = r6
            org.lwjgl.vulkan.video.StdVideoH264SequenceParameterSet r0 = r0.level_idc(r1)
            r0 = r3
            r1 = r7
            org.lwjgl.vulkan.video.StdVideoH264SequenceParameterSet r0 = r0.chroma_format_idc(r1)
            r0 = r3
            r1 = r8
            org.lwjgl.vulkan.video.StdVideoH264SequenceParameterSet r0 = r0.seq_parameter_set_id(r1)
            r0 = r3
            r1 = r9
            org.lwjgl.vulkan.video.StdVideoH264SequenceParameterSet r0 = r0.bit_depth_luma_minus8(r1)
            r0 = r3
            r1 = r10
            org.lwjgl.vulkan.video.StdVideoH264SequenceParameterSet r0 = r0.bit_depth_chroma_minus8(r1)
            r0 = r3
            r1 = r11
            org.lwjgl.vulkan.video.StdVideoH264SequenceParameterSet r0 = r0.log2_max_frame_num_minus4(r1)
            r0 = r3
            r1 = r12
            org.lwjgl.vulkan.video.StdVideoH264SequenceParameterSet r0 = r0.pic_order_cnt_type(r1)
            r0 = r3
            r1 = r13
            org.lwjgl.vulkan.video.StdVideoH264SequenceParameterSet r0 = r0.offset_for_non_ref_pic(r1)
            r0 = r3
            r1 = r14
            org.lwjgl.vulkan.video.StdVideoH264SequenceParameterSet r0 = r0.offset_for_top_to_bottom_field(r1)
            r0 = r3
            r1 = r15
            org.lwjgl.vulkan.video.StdVideoH264SequenceParameterSet r0 = r0.log2_max_pic_order_cnt_lsb_minus4(r1)
            r0 = r3
            r1 = r16
            org.lwjgl.vulkan.video.StdVideoH264SequenceParameterSet r0 = r0.num_ref_frames_in_pic_order_cnt_cycle(r1)
            r0 = r3
            r1 = r17
            org.lwjgl.vulkan.video.StdVideoH264SequenceParameterSet r0 = r0.max_num_ref_frames(r1)
            r0 = r3
            r1 = r18
            org.lwjgl.vulkan.video.StdVideoH264SequenceParameterSet r0 = r0.pic_width_in_mbs_minus1(r1)
            r0 = r3
            r1 = r19
            org.lwjgl.vulkan.video.StdVideoH264SequenceParameterSet r0 = r0.pic_height_in_map_units_minus1(r1)
            r0 = r3
            r1 = r20
            org.lwjgl.vulkan.video.StdVideoH264SequenceParameterSet r0 = r0.frame_crop_left_offset(r1)
            r0 = r3
            r1 = r21
            org.lwjgl.vulkan.video.StdVideoH264SequenceParameterSet r0 = r0.frame_crop_right_offset(r1)
            r0 = r3
            r1 = r22
            org.lwjgl.vulkan.video.StdVideoH264SequenceParameterSet r0 = r0.frame_crop_top_offset(r1)
            r0 = r3
            r1 = r23
            org.lwjgl.vulkan.video.StdVideoH264SequenceParameterSet r0 = r0.frame_crop_bottom_offset(r1)
            r0 = r3
            r1 = r24
            org.lwjgl.vulkan.video.StdVideoH264SequenceParameterSet r0 = r0.pOffsetForRefFrame(r1)
            r0 = r3
            r1 = r25
            org.lwjgl.vulkan.video.StdVideoH264SequenceParameterSet r0 = r0.pScalingLists(r1)
            r0 = r3
            r1 = r26
            org.lwjgl.vulkan.video.StdVideoH264SequenceParameterSet r0 = r0.pSequenceParameterSetVui(r1)
            r0 = r3
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoH264SequenceParameterSet set(org.lwjgl.vulkan.video.StdVideoH264SequenceParameterSet r8) {
            r7 = this;
            r0 = r8
            long r0 = r0.address()
            r1 = r7
            long r1 = r1.address()
            int r2 = org.lwjgl.vulkan.video.StdVideoH264SequenceParameterSet.SIZEOF
            long r2 = (long) r2
            org.lwjgl.system.MemoryUtil.memCopy(r0, r1, r2)
            r0 = r7
            return r0
    }

    public static org.lwjgl.vulkan.video.StdVideoH264SequenceParameterSet malloc() {
            org.lwjgl.vulkan.video.StdVideoH264SequenceParameterSet r0 = new org.lwjgl.vulkan.video.StdVideoH264SequenceParameterSet
            r1 = r0
            int r2 = org.lwjgl.vulkan.video.StdVideoH264SequenceParameterSet.SIZEOF
            long r2 = (long) r2
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.video.StdVideoH264SequenceParameterSet calloc() {
            org.lwjgl.vulkan.video.StdVideoH264SequenceParameterSet r0 = new org.lwjgl.vulkan.video.StdVideoH264SequenceParameterSet
            r1 = r0
            r2 = 1
            int r3 = org.lwjgl.vulkan.video.StdVideoH264SequenceParameterSet.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.video.StdVideoH264SequenceParameterSet create() {
            int r0 = org.lwjgl.vulkan.video.StdVideoH264SequenceParameterSet.SIZEOF
            java.nio.ByteBuffer r0 = org.lwjgl.BufferUtils.createByteBuffer(r0)
            r6 = r0
            org.lwjgl.vulkan.video.StdVideoH264SequenceParameterSet r0 = new org.lwjgl.vulkan.video.StdVideoH264SequenceParameterSet
            r1 = r0
            r2 = r6
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.video.StdVideoH264SequenceParameterSet create(long r6) {
            org.lwjgl.vulkan.video.StdVideoH264SequenceParameterSet r0 = new org.lwjgl.vulkan.video.StdVideoH264SequenceParameterSet
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.vulkan.video.StdVideoH264SequenceParameterSet createSafe(long r6) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.vulkan.video.StdVideoH264SequenceParameterSet r0 = new org.lwjgl.vulkan.video.StdVideoH264SequenceParameterSet
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static org.lwjgl.vulkan.video.StdVideoH264SequenceParameterSet.Buffer malloc(int r6) {
            org.lwjgl.vulkan.video.StdVideoH264SequenceParameterSet$Buffer r0 = new org.lwjgl.vulkan.video.StdVideoH264SequenceParameterSet$Buffer
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.vulkan.video.StdVideoH264SequenceParameterSet.SIZEOF
            long r2 = __checkMalloc(r2, r3)
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.video.StdVideoH264SequenceParameterSet.Buffer calloc(int r7) {
            org.lwjgl.vulkan.video.StdVideoH264SequenceParameterSet$Buffer r0 = new org.lwjgl.vulkan.video.StdVideoH264SequenceParameterSet$Buffer
            r1 = r0
            r2 = r7
            long r2 = (long) r2
            int r3 = org.lwjgl.vulkan.video.StdVideoH264SequenceParameterSet.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.video.StdVideoH264SequenceParameterSet.Buffer create(int r10) {
            r0 = r10
            int r1 = org.lwjgl.vulkan.video.StdVideoH264SequenceParameterSet.SIZEOF
            java.nio.ByteBuffer r0 = __create(r0, r1)
            r11 = r0
            org.lwjgl.vulkan.video.StdVideoH264SequenceParameterSet$Buffer r0 = new org.lwjgl.vulkan.video.StdVideoH264SequenceParameterSet$Buffer
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

    public static org.lwjgl.vulkan.video.StdVideoH264SequenceParameterSet.Buffer create(long r6, int r8) {
            org.lwjgl.vulkan.video.StdVideoH264SequenceParameterSet$Buffer r0 = new org.lwjgl.vulkan.video.StdVideoH264SequenceParameterSet$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.vulkan.video.StdVideoH264SequenceParameterSet.Buffer createSafe(long r6, int r8) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.vulkan.video.StdVideoH264SequenceParameterSet$Buffer r0 = new org.lwjgl.vulkan.video.StdVideoH264SequenceParameterSet$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static org.lwjgl.vulkan.video.StdVideoH264SequenceParameterSet malloc(org.lwjgl.system.MemoryStack r6) {
            org.lwjgl.vulkan.video.StdVideoH264SequenceParameterSet r0 = new org.lwjgl.vulkan.video.StdVideoH264SequenceParameterSet
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.vulkan.video.StdVideoH264SequenceParameterSet.ALIGNOF
            int r4 = org.lwjgl.vulkan.video.StdVideoH264SequenceParameterSet.SIZEOF
            long r2 = r2.nmalloc(r3, r4)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.video.StdVideoH264SequenceParameterSet calloc(org.lwjgl.system.MemoryStack r7) {
            org.lwjgl.vulkan.video.StdVideoH264SequenceParameterSet r0 = new org.lwjgl.vulkan.video.StdVideoH264SequenceParameterSet
            r1 = r0
            r2 = r7
            int r3 = org.lwjgl.vulkan.video.StdVideoH264SequenceParameterSet.ALIGNOF
            r4 = 1
            int r5 = org.lwjgl.vulkan.video.StdVideoH264SequenceParameterSet.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.video.StdVideoH264SequenceParameterSet.Buffer malloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.vulkan.video.StdVideoH264SequenceParameterSet$Buffer r0 = new org.lwjgl.vulkan.video.StdVideoH264SequenceParameterSet$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.vulkan.video.StdVideoH264SequenceParameterSet.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.vulkan.video.StdVideoH264SequenceParameterSet.SIZEOF
            int r4 = r4 * r5
            long r2 = r2.nmalloc(r3, r4)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.video.StdVideoH264SequenceParameterSet.Buffer calloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.vulkan.video.StdVideoH264SequenceParameterSet$Buffer r0 = new org.lwjgl.vulkan.video.StdVideoH264SequenceParameterSet$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.vulkan.video.StdVideoH264SequenceParameterSet.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.vulkan.video.StdVideoH264SequenceParameterSet.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.video.StdVideoH264SpsFlags nflags(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.video.StdVideoH264SequenceParameterSet.FLAGS
            long r1 = (long) r1
            long r0 = r0 + r1
            org.lwjgl.vulkan.video.StdVideoH264SpsFlags r0 = org.lwjgl.vulkan.video.StdVideoH264SpsFlags.create(r0)
            return r0
    }

    public static int nprofile_idc(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.video.StdVideoH264SequenceParameterSet.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.video.StdVideoH264SequenceParameterSet.PROFILE_IDC
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int nlevel_idc(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.video.StdVideoH264SequenceParameterSet.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.video.StdVideoH264SequenceParameterSet.LEVEL_IDC
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int nchroma_format_idc(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.video.StdVideoH264SequenceParameterSet.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.video.StdVideoH264SequenceParameterSet.CHROMA_FORMAT_IDC
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static byte nseq_parameter_set_id(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.video.StdVideoH264SequenceParameterSet.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.video.StdVideoH264SequenceParameterSet.SEQ_PARAMETER_SET_ID
            long r3 = (long) r3
            long r2 = r2 + r3
            byte r0 = r0.getByte(r1, r2)
            return r0
    }

    public static byte nbit_depth_luma_minus8(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.video.StdVideoH264SequenceParameterSet.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.video.StdVideoH264SequenceParameterSet.BIT_DEPTH_LUMA_MINUS8
            long r3 = (long) r3
            long r2 = r2 + r3
            byte r0 = r0.getByte(r1, r2)
            return r0
    }

    public static byte nbit_depth_chroma_minus8(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.video.StdVideoH264SequenceParameterSet.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.video.StdVideoH264SequenceParameterSet.BIT_DEPTH_CHROMA_MINUS8
            long r3 = (long) r3
            long r2 = r2 + r3
            byte r0 = r0.getByte(r1, r2)
            return r0
    }

    public static byte nlog2_max_frame_num_minus4(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.video.StdVideoH264SequenceParameterSet.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.video.StdVideoH264SequenceParameterSet.LOG2_MAX_FRAME_NUM_MINUS4
            long r3 = (long) r3
            long r2 = r2 + r3
            byte r0 = r0.getByte(r1, r2)
            return r0
    }

    public static int npic_order_cnt_type(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.video.StdVideoH264SequenceParameterSet.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.video.StdVideoH264SequenceParameterSet.PIC_ORDER_CNT_TYPE
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int noffset_for_non_ref_pic(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.video.StdVideoH264SequenceParameterSet.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.video.StdVideoH264SequenceParameterSet.OFFSET_FOR_NON_REF_PIC
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int noffset_for_top_to_bottom_field(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.video.StdVideoH264SequenceParameterSet.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.video.StdVideoH264SequenceParameterSet.OFFSET_FOR_TOP_TO_BOTTOM_FIELD
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static byte nlog2_max_pic_order_cnt_lsb_minus4(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.video.StdVideoH264SequenceParameterSet.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.video.StdVideoH264SequenceParameterSet.LOG2_MAX_PIC_ORDER_CNT_LSB_MINUS4
            long r3 = (long) r3
            long r2 = r2 + r3
            byte r0 = r0.getByte(r1, r2)
            return r0
    }

    public static byte nnum_ref_frames_in_pic_order_cnt_cycle(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.video.StdVideoH264SequenceParameterSet.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.video.StdVideoH264SequenceParameterSet.NUM_REF_FRAMES_IN_PIC_ORDER_CNT_CYCLE
            long r3 = (long) r3
            long r2 = r2 + r3
            byte r0 = r0.getByte(r1, r2)
            return r0
    }

    public static byte nmax_num_ref_frames(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.video.StdVideoH264SequenceParameterSet.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.video.StdVideoH264SequenceParameterSet.MAX_NUM_REF_FRAMES
            long r3 = (long) r3
            long r2 = r2 + r3
            byte r0 = r0.getByte(r1, r2)
            return r0
    }

    public static byte nreserved1(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.video.StdVideoH264SequenceParameterSet.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.video.StdVideoH264SequenceParameterSet.RESERVED1
            long r3 = (long) r3
            long r2 = r2 + r3
            byte r0 = r0.getByte(r1, r2)
            return r0
    }

    public static int npic_width_in_mbs_minus1(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.video.StdVideoH264SequenceParameterSet.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.video.StdVideoH264SequenceParameterSet.PIC_WIDTH_IN_MBS_MINUS1
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int npic_height_in_map_units_minus1(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.video.StdVideoH264SequenceParameterSet.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.video.StdVideoH264SequenceParameterSet.PIC_HEIGHT_IN_MAP_UNITS_MINUS1
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int nframe_crop_left_offset(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.video.StdVideoH264SequenceParameterSet.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.video.StdVideoH264SequenceParameterSet.FRAME_CROP_LEFT_OFFSET
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int nframe_crop_right_offset(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.video.StdVideoH264SequenceParameterSet.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.video.StdVideoH264SequenceParameterSet.FRAME_CROP_RIGHT_OFFSET
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int nframe_crop_top_offset(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.video.StdVideoH264SequenceParameterSet.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.video.StdVideoH264SequenceParameterSet.FRAME_CROP_TOP_OFFSET
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int nframe_crop_bottom_offset(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.video.StdVideoH264SequenceParameterSet.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.video.StdVideoH264SequenceParameterSet.FRAME_CROP_BOTTOM_OFFSET
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int nreserved2(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.video.StdVideoH264SequenceParameterSet.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.video.StdVideoH264SequenceParameterSet.RESERVED2
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    @javax.annotation.Nullable
    public static java.nio.IntBuffer npOffsetForRefFrame(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.video.StdVideoH264SequenceParameterSet.POFFSETFORREFFRAME
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            r1 = r5
            byte r1 = nnum_ref_frames_in_pic_order_cnt_cycle(r1)
            int r1 = java.lang.Byte.toUnsignedInt(r1)
            java.nio.IntBuffer r0 = org.lwjgl.system.MemoryUtil.memIntBufferSafe(r0, r1)
            return r0
    }

    public static org.lwjgl.vulkan.video.StdVideoH264ScalingLists npScalingLists(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.video.StdVideoH264SequenceParameterSet.PSCALINGLISTS
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            org.lwjgl.vulkan.video.StdVideoH264ScalingLists r0 = org.lwjgl.vulkan.video.StdVideoH264ScalingLists.create(r0)
            return r0
    }

    public static org.lwjgl.vulkan.video.StdVideoH264SequenceParameterSetVui npSequenceParameterSetVui(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.video.StdVideoH264SequenceParameterSet.PSEQUENCEPARAMETERSETVUI
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            org.lwjgl.vulkan.video.StdVideoH264SequenceParameterSetVui r0 = org.lwjgl.vulkan.video.StdVideoH264SequenceParameterSetVui.create(r0)
            return r0
    }

    public static void nflags(long r7, org.lwjgl.vulkan.video.StdVideoH264SpsFlags r9) {
            r0 = r9
            long r0 = r0.address()
            r1 = r7
            int r2 = org.lwjgl.vulkan.video.StdVideoH264SequenceParameterSet.FLAGS
            long r2 = (long) r2
            long r1 = r1 + r2
            int r2 = org.lwjgl.vulkan.video.StdVideoH264SpsFlags.SIZEOF
            long r2 = (long) r2
            org.lwjgl.system.MemoryUtil.memCopy(r0, r1, r2)
            return
    }

    public static void nprofile_idc(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.video.StdVideoH264SequenceParameterSet.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.video.StdVideoH264SequenceParameterSet.PROFILE_IDC
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void nlevel_idc(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.video.StdVideoH264SequenceParameterSet.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.video.StdVideoH264SequenceParameterSet.LEVEL_IDC
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void nchroma_format_idc(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.video.StdVideoH264SequenceParameterSet.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.video.StdVideoH264SequenceParameterSet.CHROMA_FORMAT_IDC
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void nseq_parameter_set_id(long r7, byte r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.video.StdVideoH264SequenceParameterSet.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.video.StdVideoH264SequenceParameterSet.SEQ_PARAMETER_SET_ID
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putByte(r1, r2, r3)
            return
    }

    public static void nbit_depth_luma_minus8(long r7, byte r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.video.StdVideoH264SequenceParameterSet.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.video.StdVideoH264SequenceParameterSet.BIT_DEPTH_LUMA_MINUS8
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putByte(r1, r2, r3)
            return
    }

    public static void nbit_depth_chroma_minus8(long r7, byte r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.video.StdVideoH264SequenceParameterSet.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.video.StdVideoH264SequenceParameterSet.BIT_DEPTH_CHROMA_MINUS8
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putByte(r1, r2, r3)
            return
    }

    public static void nlog2_max_frame_num_minus4(long r7, byte r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.video.StdVideoH264SequenceParameterSet.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.video.StdVideoH264SequenceParameterSet.LOG2_MAX_FRAME_NUM_MINUS4
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putByte(r1, r2, r3)
            return
    }

    public static void npic_order_cnt_type(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.video.StdVideoH264SequenceParameterSet.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.video.StdVideoH264SequenceParameterSet.PIC_ORDER_CNT_TYPE
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void noffset_for_non_ref_pic(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.video.StdVideoH264SequenceParameterSet.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.video.StdVideoH264SequenceParameterSet.OFFSET_FOR_NON_REF_PIC
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void noffset_for_top_to_bottom_field(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.video.StdVideoH264SequenceParameterSet.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.video.StdVideoH264SequenceParameterSet.OFFSET_FOR_TOP_TO_BOTTOM_FIELD
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void nlog2_max_pic_order_cnt_lsb_minus4(long r7, byte r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.video.StdVideoH264SequenceParameterSet.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.video.StdVideoH264SequenceParameterSet.LOG2_MAX_PIC_ORDER_CNT_LSB_MINUS4
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putByte(r1, r2, r3)
            return
    }

    public static void nnum_ref_frames_in_pic_order_cnt_cycle(long r7, byte r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.video.StdVideoH264SequenceParameterSet.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.video.StdVideoH264SequenceParameterSet.NUM_REF_FRAMES_IN_PIC_ORDER_CNT_CYCLE
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putByte(r1, r2, r3)
            return
    }

    public static void nmax_num_ref_frames(long r7, byte r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.video.StdVideoH264SequenceParameterSet.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.video.StdVideoH264SequenceParameterSet.MAX_NUM_REF_FRAMES
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putByte(r1, r2, r3)
            return
    }

    public static void nreserved1(long r7, byte r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.video.StdVideoH264SequenceParameterSet.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.video.StdVideoH264SequenceParameterSet.RESERVED1
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putByte(r1, r2, r3)
            return
    }

    public static void npic_width_in_mbs_minus1(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.video.StdVideoH264SequenceParameterSet.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.video.StdVideoH264SequenceParameterSet.PIC_WIDTH_IN_MBS_MINUS1
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void npic_height_in_map_units_minus1(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.video.StdVideoH264SequenceParameterSet.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.video.StdVideoH264SequenceParameterSet.PIC_HEIGHT_IN_MAP_UNITS_MINUS1
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void nframe_crop_left_offset(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.video.StdVideoH264SequenceParameterSet.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.video.StdVideoH264SequenceParameterSet.FRAME_CROP_LEFT_OFFSET
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void nframe_crop_right_offset(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.video.StdVideoH264SequenceParameterSet.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.video.StdVideoH264SequenceParameterSet.FRAME_CROP_RIGHT_OFFSET
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void nframe_crop_top_offset(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.video.StdVideoH264SequenceParameterSet.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.video.StdVideoH264SequenceParameterSet.FRAME_CROP_TOP_OFFSET
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void nframe_crop_bottom_offset(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.video.StdVideoH264SequenceParameterSet.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.video.StdVideoH264SequenceParameterSet.FRAME_CROP_BOTTOM_OFFSET
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void nreserved2(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.video.StdVideoH264SequenceParameterSet.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.video.StdVideoH264SequenceParameterSet.RESERVED2
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void npOffsetForRefFrame(long r5, @javax.annotation.Nullable java.nio.IntBuffer r7) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.video.StdVideoH264SequenceParameterSet.POFFSETFORREFFRAME
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            long r1 = org.lwjgl.system.MemoryUtil.memAddressSafe(r1)
            org.lwjgl.system.MemoryUtil.memPutAddress(r0, r1)
            r0 = r5
            r1 = r7
            if (r1 != 0) goto L16
            r1 = 0
            goto L1b
        L16:
            r1 = r7
            int r1 = r1.remaining()
            byte r1 = (byte) r1
        L1b:
            nnum_ref_frames_in_pic_order_cnt_cycle(r0, r1)
            return
    }

    public static void npScalingLists(long r5, org.lwjgl.vulkan.video.StdVideoH264ScalingLists r7) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.video.StdVideoH264SequenceParameterSet.PSCALINGLISTS
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            long r1 = r1.address()
            org.lwjgl.system.MemoryUtil.memPutAddress(r0, r1)
            return
    }

    public static void npSequenceParameterSetVui(long r5, org.lwjgl.vulkan.video.StdVideoH264SequenceParameterSetVui r7) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.video.StdVideoH264SequenceParameterSet.PSEQUENCEPARAMETERSETVUI
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            long r1 = r1.address()
            org.lwjgl.system.MemoryUtil.memPutAddress(r0, r1)
            return
    }

    public static void validate(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.video.StdVideoH264SequenceParameterSet.PSCALINGLISTS
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r5
            int r1 = org.lwjgl.vulkan.video.StdVideoH264SequenceParameterSet.PSEQUENCEPARAMETERSETVUI
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            r7 = r0
            r0 = r7
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r7
            org.lwjgl.vulkan.video.StdVideoH264SequenceParameterSetVui.validate(r0)
            return
    }

    @Override // org.lwjgl.system.Struct
    protected /* bridge */ /* synthetic */ org.lwjgl.system.Struct create(long r6, @javax.annotation.Nullable java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            org.lwjgl.vulkan.video.StdVideoH264SequenceParameterSet r0 = r0.create(r1, r2)
            return r0
    }

    static {
            r0 = 25
            org.lwjgl.system.Struct$Member[] r0 = new org.lwjgl.system.Struct.Member[r0]
            r1 = r0
            r2 = 0
            int r3 = org.lwjgl.vulkan.video.StdVideoH264SpsFlags.SIZEOF
            int r4 = org.lwjgl.vulkan.video.StdVideoH264SpsFlags.ALIGNOF
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
            r3 = 4
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 9
            r3 = 4
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 10
            r3 = 4
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
            r3 = 4
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
            r3 = 4
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 20
            r3 = 4
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 21
            r3 = 4
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 22
            int r3 = org.lwjgl.vulkan.video.StdVideoH264SequenceParameterSet.POINTER_SIZE
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 23
            int r3 = org.lwjgl.vulkan.video.StdVideoH264SequenceParameterSet.POINTER_SIZE
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 24
            int r3 = org.lwjgl.vulkan.video.StdVideoH264SequenceParameterSet.POINTER_SIZE
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            org.lwjgl.system.Struct$Layout r0 = __struct(r0)
            r6 = r0
            r0 = r6
            int r0 = r0.getSize()
            org.lwjgl.vulkan.video.StdVideoH264SequenceParameterSet.SIZEOF = r0
            r0 = r6
            int r0 = r0.getAlignment()
            org.lwjgl.vulkan.video.StdVideoH264SequenceParameterSet.ALIGNOF = r0
            r0 = r6
            r1 = 0
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.video.StdVideoH264SequenceParameterSet.FLAGS = r0
            r0 = r6
            r1 = 1
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.video.StdVideoH264SequenceParameterSet.PROFILE_IDC = r0
            r0 = r6
            r1 = 2
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.video.StdVideoH264SequenceParameterSet.LEVEL_IDC = r0
            r0 = r6
            r1 = 3
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.video.StdVideoH264SequenceParameterSet.CHROMA_FORMAT_IDC = r0
            r0 = r6
            r1 = 4
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.video.StdVideoH264SequenceParameterSet.SEQ_PARAMETER_SET_ID = r0
            r0 = r6
            r1 = 5
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.video.StdVideoH264SequenceParameterSet.BIT_DEPTH_LUMA_MINUS8 = r0
            r0 = r6
            r1 = 6
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.video.StdVideoH264SequenceParameterSet.BIT_DEPTH_CHROMA_MINUS8 = r0
            r0 = r6
            r1 = 7
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.video.StdVideoH264SequenceParameterSet.LOG2_MAX_FRAME_NUM_MINUS4 = r0
            r0 = r6
            r1 = 8
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.video.StdVideoH264SequenceParameterSet.PIC_ORDER_CNT_TYPE = r0
            r0 = r6
            r1 = 9
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.video.StdVideoH264SequenceParameterSet.OFFSET_FOR_NON_REF_PIC = r0
            r0 = r6
            r1 = 10
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.video.StdVideoH264SequenceParameterSet.OFFSET_FOR_TOP_TO_BOTTOM_FIELD = r0
            r0 = r6
            r1 = 11
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.video.StdVideoH264SequenceParameterSet.LOG2_MAX_PIC_ORDER_CNT_LSB_MINUS4 = r0
            r0 = r6
            r1 = 12
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.video.StdVideoH264SequenceParameterSet.NUM_REF_FRAMES_IN_PIC_ORDER_CNT_CYCLE = r0
            r0 = r6
            r1 = 13
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.video.StdVideoH264SequenceParameterSet.MAX_NUM_REF_FRAMES = r0
            r0 = r6
            r1 = 14
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.video.StdVideoH264SequenceParameterSet.RESERVED1 = r0
            r0 = r6
            r1 = 15
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.video.StdVideoH264SequenceParameterSet.PIC_WIDTH_IN_MBS_MINUS1 = r0
            r0 = r6
            r1 = 16
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.video.StdVideoH264SequenceParameterSet.PIC_HEIGHT_IN_MAP_UNITS_MINUS1 = r0
            r0 = r6
            r1 = 17
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.video.StdVideoH264SequenceParameterSet.FRAME_CROP_LEFT_OFFSET = r0
            r0 = r6
            r1 = 18
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.video.StdVideoH264SequenceParameterSet.FRAME_CROP_RIGHT_OFFSET = r0
            r0 = r6
            r1 = 19
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.video.StdVideoH264SequenceParameterSet.FRAME_CROP_TOP_OFFSET = r0
            r0 = r6
            r1 = 20
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.video.StdVideoH264SequenceParameterSet.FRAME_CROP_BOTTOM_OFFSET = r0
            r0 = r6
            r1 = 21
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.video.StdVideoH264SequenceParameterSet.RESERVED2 = r0
            r0 = r6
            r1 = 22
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.video.StdVideoH264SequenceParameterSet.POFFSETFORREFFRAME = r0
            r0 = r6
            r1 = 23
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.video.StdVideoH264SequenceParameterSet.PSCALINGLISTS = r0
            r0 = r6
            r1 = 24
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.video.StdVideoH264SequenceParameterSet.PSEQUENCEPARAMETERSETVUI = r0
            return
    }
}
