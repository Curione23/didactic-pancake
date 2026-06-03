package org.lwjgl.vulkan.video;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/video/StdVideoH264SequenceParameterSetVui.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/video/StdVideoH264SequenceParameterSetVui.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/video/StdVideoH264SequenceParameterSetVui.class */
public class StdVideoH264SequenceParameterSetVui extends org.lwjgl.system.Struct<org.lwjgl.vulkan.video.StdVideoH264SequenceParameterSetVui> implements org.lwjgl.system.NativeResource {
    public static final int SIZEOF = 0;
    public static final int ALIGNOF = 0;
    public static final int FLAGS = 0;
    public static final int ASPECT_RATIO_IDC = 0;
    public static final int SAR_WIDTH = 0;
    public static final int SAR_HEIGHT = 0;
    public static final int VIDEO_FORMAT = 0;
    public static final int COLOUR_PRIMARIES = 0;
    public static final int TRANSFER_CHARACTERISTICS = 0;
    public static final int MATRIX_COEFFICIENTS = 0;
    public static final int NUM_UNITS_IN_TICK = 0;
    public static final int TIME_SCALE = 0;
    public static final int MAX_NUM_REORDER_FRAMES = 0;
    public static final int MAX_DEC_FRAME_BUFFERING = 0;
    public static final int CHROMA_SAMPLE_LOC_TYPE_TOP_FIELD = 0;
    public static final int CHROMA_SAMPLE_LOC_TYPE_BOTTOM_FIELD = 0;
    public static final int RESERVED1 = 0;
    public static final int PHRDPARAMETERS = 0;

    /* JADX WARN: Classes with same name are omitted, all sources:
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/video/StdVideoH264SequenceParameterSetVui$Buffer.class
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/video/StdVideoH264SequenceParameterSetVui$Buffer.class
     */
    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/video/StdVideoH264SequenceParameterSetVui$Buffer.class */
    public static class Buffer extends org.lwjgl.system.StructBuffer<org.lwjgl.vulkan.video.StdVideoH264SequenceParameterSetVui, org.lwjgl.vulkan.video.StdVideoH264SequenceParameterSetVui.Buffer> implements org.lwjgl.system.NativeResource {
        private static final org.lwjgl.vulkan.video.StdVideoH264SequenceParameterSetVui ELEMENT_FACTORY = null;

        public Buffer(java.nio.ByteBuffer r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r6
                int r2 = r2.remaining()
                int r3 = org.lwjgl.vulkan.video.StdVideoH264SequenceParameterSetVui.SIZEOF
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
        protected org.lwjgl.vulkan.video.StdVideoH264SequenceParameterSetVui.Buffer self() {
                r2 = this;
                r0 = r2
                return r0
        }

        @Override // org.lwjgl.system.StructBuffer
        protected org.lwjgl.vulkan.video.StdVideoH264SequenceParameterSetVui getElementFactory() {
                r2 = this;
                org.lwjgl.vulkan.video.StdVideoH264SequenceParameterSetVui r0 = org.lwjgl.vulkan.video.StdVideoH264SequenceParameterSetVui.Buffer.ELEMENT_FACTORY
                return r0
        }

        public org.lwjgl.vulkan.video.StdVideoH264SpsVuiFlags flags() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                org.lwjgl.vulkan.video.StdVideoH264SpsVuiFlags r0 = org.lwjgl.vulkan.video.StdVideoH264SequenceParameterSetVui.nflags(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("StdVideoH264AspectRatioIdc")
        public int aspect_ratio_idc() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.video.StdVideoH264SequenceParameterSetVui.naspect_ratio_idc(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint16_t")
        public short sar_width() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                short r0 = org.lwjgl.vulkan.video.StdVideoH264SequenceParameterSetVui.nsar_width(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint16_t")
        public short sar_height() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                short r0 = org.lwjgl.vulkan.video.StdVideoH264SequenceParameterSetVui.nsar_height(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint8_t")
        public byte video_format() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                byte r0 = org.lwjgl.vulkan.video.StdVideoH264SequenceParameterSetVui.nvideo_format(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint8_t")
        public byte colour_primaries() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                byte r0 = org.lwjgl.vulkan.video.StdVideoH264SequenceParameterSetVui.ncolour_primaries(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint8_t")
        public byte transfer_characteristics() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                byte r0 = org.lwjgl.vulkan.video.StdVideoH264SequenceParameterSetVui.ntransfer_characteristics(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint8_t")
        public byte matrix_coefficients() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                byte r0 = org.lwjgl.vulkan.video.StdVideoH264SequenceParameterSetVui.nmatrix_coefficients(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint32_t")
        public int num_units_in_tick() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.video.StdVideoH264SequenceParameterSetVui.nnum_units_in_tick(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint32_t")
        public int time_scale() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.video.StdVideoH264SequenceParameterSetVui.ntime_scale(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint8_t")
        public byte max_num_reorder_frames() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                byte r0 = org.lwjgl.vulkan.video.StdVideoH264SequenceParameterSetVui.nmax_num_reorder_frames(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint8_t")
        public byte max_dec_frame_buffering() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                byte r0 = org.lwjgl.vulkan.video.StdVideoH264SequenceParameterSetVui.nmax_dec_frame_buffering(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint8_t")
        public byte chroma_sample_loc_type_top_field() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                byte r0 = org.lwjgl.vulkan.video.StdVideoH264SequenceParameterSetVui.nchroma_sample_loc_type_top_field(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint8_t")
        public byte chroma_sample_loc_type_bottom_field() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                byte r0 = org.lwjgl.vulkan.video.StdVideoH264SequenceParameterSetVui.nchroma_sample_loc_type_bottom_field(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("StdVideoH264HrdParameters const *")
        public org.lwjgl.vulkan.video.StdVideoH264HrdParameters pHrdParameters() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                org.lwjgl.vulkan.video.StdVideoH264HrdParameters r0 = org.lwjgl.vulkan.video.StdVideoH264SequenceParameterSetVui.npHrdParameters(r0)
                return r0
        }

        public org.lwjgl.vulkan.video.StdVideoH264SequenceParameterSetVui.Buffer flags(org.lwjgl.vulkan.video.StdVideoH264SpsVuiFlags r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.video.StdVideoH264SequenceParameterSetVui.nflags(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.video.StdVideoH264SequenceParameterSetVui.Buffer flags(java.util.function.Consumer<org.lwjgl.vulkan.video.StdVideoH264SpsVuiFlags> r4) {
                r3 = this;
                r0 = r4
                r1 = r3
                org.lwjgl.vulkan.video.StdVideoH264SpsVuiFlags r1 = r1.flags()
                r0.accept(r1)
                r0 = r3
                return r0
        }

        public org.lwjgl.vulkan.video.StdVideoH264SequenceParameterSetVui.Buffer aspect_ratio_idc(@org.lwjgl.system.NativeType("StdVideoH264AspectRatioIdc") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.video.StdVideoH264SequenceParameterSetVui.naspect_ratio_idc(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.video.StdVideoH264SequenceParameterSetVui.Buffer sar_width(@org.lwjgl.system.NativeType("uint16_t") short r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.video.StdVideoH264SequenceParameterSetVui.nsar_width(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.video.StdVideoH264SequenceParameterSetVui.Buffer sar_height(@org.lwjgl.system.NativeType("uint16_t") short r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.video.StdVideoH264SequenceParameterSetVui.nsar_height(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.video.StdVideoH264SequenceParameterSetVui.Buffer video_format(@org.lwjgl.system.NativeType("uint8_t") byte r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.video.StdVideoH264SequenceParameterSetVui.nvideo_format(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.video.StdVideoH264SequenceParameterSetVui.Buffer colour_primaries(@org.lwjgl.system.NativeType("uint8_t") byte r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.video.StdVideoH264SequenceParameterSetVui.ncolour_primaries(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.video.StdVideoH264SequenceParameterSetVui.Buffer transfer_characteristics(@org.lwjgl.system.NativeType("uint8_t") byte r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.video.StdVideoH264SequenceParameterSetVui.ntransfer_characteristics(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.video.StdVideoH264SequenceParameterSetVui.Buffer matrix_coefficients(@org.lwjgl.system.NativeType("uint8_t") byte r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.video.StdVideoH264SequenceParameterSetVui.nmatrix_coefficients(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.video.StdVideoH264SequenceParameterSetVui.Buffer num_units_in_tick(@org.lwjgl.system.NativeType("uint32_t") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.video.StdVideoH264SequenceParameterSetVui.nnum_units_in_tick(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.video.StdVideoH264SequenceParameterSetVui.Buffer time_scale(@org.lwjgl.system.NativeType("uint32_t") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.video.StdVideoH264SequenceParameterSetVui.ntime_scale(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.video.StdVideoH264SequenceParameterSetVui.Buffer max_num_reorder_frames(@org.lwjgl.system.NativeType("uint8_t") byte r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.video.StdVideoH264SequenceParameterSetVui.nmax_num_reorder_frames(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.video.StdVideoH264SequenceParameterSetVui.Buffer max_dec_frame_buffering(@org.lwjgl.system.NativeType("uint8_t") byte r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.video.StdVideoH264SequenceParameterSetVui.nmax_dec_frame_buffering(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.video.StdVideoH264SequenceParameterSetVui.Buffer chroma_sample_loc_type_top_field(@org.lwjgl.system.NativeType("uint8_t") byte r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.video.StdVideoH264SequenceParameterSetVui.nchroma_sample_loc_type_top_field(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.video.StdVideoH264SequenceParameterSetVui.Buffer chroma_sample_loc_type_bottom_field(@org.lwjgl.system.NativeType("uint8_t") byte r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.video.StdVideoH264SequenceParameterSetVui.nchroma_sample_loc_type_bottom_field(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.video.StdVideoH264SequenceParameterSetVui.Buffer pHrdParameters(@org.lwjgl.system.NativeType("StdVideoH264HrdParameters const *") org.lwjgl.vulkan.video.StdVideoH264HrdParameters r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.video.StdVideoH264SequenceParameterSetVui.npHrdParameters(r0, r1)
                r0 = r4
                return r0
        }

        @Override // org.lwjgl.system.StructBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.Struct getElementFactory() {
                r2 = this;
                r0 = r2
                org.lwjgl.vulkan.video.StdVideoH264SequenceParameterSetVui r0 = r0.getElementFactory()
                return r0
        }

        @Override // org.lwjgl.system.CustomBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.CustomBuffer self() {
                r2 = this;
                r0 = r2
                org.lwjgl.vulkan.video.StdVideoH264SequenceParameterSetVui$Buffer r0 = r0.self()
                return r0
        }

        static {
                r0 = -1
                org.lwjgl.vulkan.video.StdVideoH264SequenceParameterSetVui r0 = org.lwjgl.vulkan.video.StdVideoH264SequenceParameterSetVui.create(r0)
                org.lwjgl.vulkan.video.StdVideoH264SequenceParameterSetVui.Buffer.ELEMENT_FACTORY = r0
                return
        }
    }

    protected StdVideoH264SequenceParameterSetVui(long r6, @javax.annotation.Nullable java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    protected org.lwjgl.vulkan.video.StdVideoH264SequenceParameterSetVui create(long r7, @javax.annotation.Nullable java.nio.ByteBuffer r9) {
            r6 = this;
            org.lwjgl.vulkan.video.StdVideoH264SequenceParameterSetVui r0 = new org.lwjgl.vulkan.video.StdVideoH264SequenceParameterSetVui
            r1 = r0
            r2 = r7
            r3 = r9
            r1.<init>(r2, r3)
            return r0
    }

    public StdVideoH264SequenceParameterSetVui(java.nio.ByteBuffer r7) {
            r6 = this;
            r0 = r6
            r1 = r7
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            r2 = r7
            int r3 = org.lwjgl.vulkan.video.StdVideoH264SequenceParameterSetVui.SIZEOF
            java.nio.ByteBuffer r2 = __checkContainer(r2, r3)
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
            r2 = this;
            int r0 = org.lwjgl.vulkan.video.StdVideoH264SequenceParameterSetVui.SIZEOF
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoH264SpsVuiFlags flags() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            org.lwjgl.vulkan.video.StdVideoH264SpsVuiFlags r0 = nflags(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("StdVideoH264AspectRatioIdc")
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
    public byte matrix_coefficients() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            byte r0 = nmatrix_coefficients(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("uint32_t")
    public int num_units_in_tick() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nnum_units_in_tick(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("uint32_t")
    public int time_scale() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = ntime_scale(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("uint8_t")
    public byte max_num_reorder_frames() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            byte r0 = nmax_num_reorder_frames(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("uint8_t")
    public byte max_dec_frame_buffering() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            byte r0 = nmax_dec_frame_buffering(r0)
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

    @org.lwjgl.system.NativeType("StdVideoH264HrdParameters const *")
    public org.lwjgl.vulkan.video.StdVideoH264HrdParameters pHrdParameters() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            org.lwjgl.vulkan.video.StdVideoH264HrdParameters r0 = npHrdParameters(r0)
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoH264SequenceParameterSetVui flags(org.lwjgl.vulkan.video.StdVideoH264SpsVuiFlags r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nflags(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoH264SequenceParameterSetVui flags(java.util.function.Consumer<org.lwjgl.vulkan.video.StdVideoH264SpsVuiFlags> r4) {
            r3 = this;
            r0 = r4
            r1 = r3
            org.lwjgl.vulkan.video.StdVideoH264SpsVuiFlags r1 = r1.flags()
            r0.accept(r1)
            r0 = r3
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoH264SequenceParameterSetVui aspect_ratio_idc(@org.lwjgl.system.NativeType("StdVideoH264AspectRatioIdc") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            naspect_ratio_idc(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoH264SequenceParameterSetVui sar_width(@org.lwjgl.system.NativeType("uint16_t") short r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nsar_width(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoH264SequenceParameterSetVui sar_height(@org.lwjgl.system.NativeType("uint16_t") short r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nsar_height(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoH264SequenceParameterSetVui video_format(@org.lwjgl.system.NativeType("uint8_t") byte r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nvideo_format(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoH264SequenceParameterSetVui colour_primaries(@org.lwjgl.system.NativeType("uint8_t") byte r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            ncolour_primaries(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoH264SequenceParameterSetVui transfer_characteristics(@org.lwjgl.system.NativeType("uint8_t") byte r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            ntransfer_characteristics(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoH264SequenceParameterSetVui matrix_coefficients(@org.lwjgl.system.NativeType("uint8_t") byte r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nmatrix_coefficients(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoH264SequenceParameterSetVui num_units_in_tick(@org.lwjgl.system.NativeType("uint32_t") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nnum_units_in_tick(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoH264SequenceParameterSetVui time_scale(@org.lwjgl.system.NativeType("uint32_t") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            ntime_scale(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoH264SequenceParameterSetVui max_num_reorder_frames(@org.lwjgl.system.NativeType("uint8_t") byte r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nmax_num_reorder_frames(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoH264SequenceParameterSetVui max_dec_frame_buffering(@org.lwjgl.system.NativeType("uint8_t") byte r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nmax_dec_frame_buffering(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoH264SequenceParameterSetVui chroma_sample_loc_type_top_field(@org.lwjgl.system.NativeType("uint8_t") byte r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nchroma_sample_loc_type_top_field(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoH264SequenceParameterSetVui chroma_sample_loc_type_bottom_field(@org.lwjgl.system.NativeType("uint8_t") byte r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nchroma_sample_loc_type_bottom_field(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoH264SequenceParameterSetVui pHrdParameters(@org.lwjgl.system.NativeType("StdVideoH264HrdParameters const *") org.lwjgl.vulkan.video.StdVideoH264HrdParameters r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            npHrdParameters(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoH264SequenceParameterSetVui set(org.lwjgl.vulkan.video.StdVideoH264SpsVuiFlags r4, int r5, short r6, short r7, byte r8, byte r9, byte r10, byte r11, int r12, int r13, byte r14, byte r15, byte r16, byte r17, org.lwjgl.vulkan.video.StdVideoH264HrdParameters r18) {
            r3 = this;
            r0 = r3
            r1 = r4
            org.lwjgl.vulkan.video.StdVideoH264SequenceParameterSetVui r0 = r0.flags(r1)
            r0 = r3
            r1 = r5
            org.lwjgl.vulkan.video.StdVideoH264SequenceParameterSetVui r0 = r0.aspect_ratio_idc(r1)
            r0 = r3
            r1 = r6
            org.lwjgl.vulkan.video.StdVideoH264SequenceParameterSetVui r0 = r0.sar_width(r1)
            r0 = r3
            r1 = r7
            org.lwjgl.vulkan.video.StdVideoH264SequenceParameterSetVui r0 = r0.sar_height(r1)
            r0 = r3
            r1 = r8
            org.lwjgl.vulkan.video.StdVideoH264SequenceParameterSetVui r0 = r0.video_format(r1)
            r0 = r3
            r1 = r9
            org.lwjgl.vulkan.video.StdVideoH264SequenceParameterSetVui r0 = r0.colour_primaries(r1)
            r0 = r3
            r1 = r10
            org.lwjgl.vulkan.video.StdVideoH264SequenceParameterSetVui r0 = r0.transfer_characteristics(r1)
            r0 = r3
            r1 = r11
            org.lwjgl.vulkan.video.StdVideoH264SequenceParameterSetVui r0 = r0.matrix_coefficients(r1)
            r0 = r3
            r1 = r12
            org.lwjgl.vulkan.video.StdVideoH264SequenceParameterSetVui r0 = r0.num_units_in_tick(r1)
            r0 = r3
            r1 = r13
            org.lwjgl.vulkan.video.StdVideoH264SequenceParameterSetVui r0 = r0.time_scale(r1)
            r0 = r3
            r1 = r14
            org.lwjgl.vulkan.video.StdVideoH264SequenceParameterSetVui r0 = r0.max_num_reorder_frames(r1)
            r0 = r3
            r1 = r15
            org.lwjgl.vulkan.video.StdVideoH264SequenceParameterSetVui r0 = r0.max_dec_frame_buffering(r1)
            r0 = r3
            r1 = r16
            org.lwjgl.vulkan.video.StdVideoH264SequenceParameterSetVui r0 = r0.chroma_sample_loc_type_top_field(r1)
            r0 = r3
            r1 = r17
            org.lwjgl.vulkan.video.StdVideoH264SequenceParameterSetVui r0 = r0.chroma_sample_loc_type_bottom_field(r1)
            r0 = r3
            r1 = r18
            org.lwjgl.vulkan.video.StdVideoH264SequenceParameterSetVui r0 = r0.pHrdParameters(r1)
            r0 = r3
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoH264SequenceParameterSetVui set(org.lwjgl.vulkan.video.StdVideoH264SequenceParameterSetVui r8) {
            r7 = this;
            r0 = r8
            long r0 = r0.address()
            r1 = r7
            long r1 = r1.address()
            int r2 = org.lwjgl.vulkan.video.StdVideoH264SequenceParameterSetVui.SIZEOF
            long r2 = (long) r2
            org.lwjgl.system.MemoryUtil.memCopy(r0, r1, r2)
            r0 = r7
            return r0
    }

    public static org.lwjgl.vulkan.video.StdVideoH264SequenceParameterSetVui malloc() {
            org.lwjgl.vulkan.video.StdVideoH264SequenceParameterSetVui r0 = new org.lwjgl.vulkan.video.StdVideoH264SequenceParameterSetVui
            r1 = r0
            int r2 = org.lwjgl.vulkan.video.StdVideoH264SequenceParameterSetVui.SIZEOF
            long r2 = (long) r2
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.video.StdVideoH264SequenceParameterSetVui calloc() {
            org.lwjgl.vulkan.video.StdVideoH264SequenceParameterSetVui r0 = new org.lwjgl.vulkan.video.StdVideoH264SequenceParameterSetVui
            r1 = r0
            r2 = 1
            int r3 = org.lwjgl.vulkan.video.StdVideoH264SequenceParameterSetVui.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.video.StdVideoH264SequenceParameterSetVui create() {
            int r0 = org.lwjgl.vulkan.video.StdVideoH264SequenceParameterSetVui.SIZEOF
            java.nio.ByteBuffer r0 = org.lwjgl.BufferUtils.createByteBuffer(r0)
            r6 = r0
            org.lwjgl.vulkan.video.StdVideoH264SequenceParameterSetVui r0 = new org.lwjgl.vulkan.video.StdVideoH264SequenceParameterSetVui
            r1 = r0
            r2 = r6
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.video.StdVideoH264SequenceParameterSetVui create(long r6) {
            org.lwjgl.vulkan.video.StdVideoH264SequenceParameterSetVui r0 = new org.lwjgl.vulkan.video.StdVideoH264SequenceParameterSetVui
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.vulkan.video.StdVideoH264SequenceParameterSetVui createSafe(long r6) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.vulkan.video.StdVideoH264SequenceParameterSetVui r0 = new org.lwjgl.vulkan.video.StdVideoH264SequenceParameterSetVui
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static org.lwjgl.vulkan.video.StdVideoH264SequenceParameterSetVui.Buffer malloc(int r6) {
            org.lwjgl.vulkan.video.StdVideoH264SequenceParameterSetVui$Buffer r0 = new org.lwjgl.vulkan.video.StdVideoH264SequenceParameterSetVui$Buffer
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.vulkan.video.StdVideoH264SequenceParameterSetVui.SIZEOF
            long r2 = __checkMalloc(r2, r3)
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.video.StdVideoH264SequenceParameterSetVui.Buffer calloc(int r7) {
            org.lwjgl.vulkan.video.StdVideoH264SequenceParameterSetVui$Buffer r0 = new org.lwjgl.vulkan.video.StdVideoH264SequenceParameterSetVui$Buffer
            r1 = r0
            r2 = r7
            long r2 = (long) r2
            int r3 = org.lwjgl.vulkan.video.StdVideoH264SequenceParameterSetVui.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.video.StdVideoH264SequenceParameterSetVui.Buffer create(int r10) {
            r0 = r10
            int r1 = org.lwjgl.vulkan.video.StdVideoH264SequenceParameterSetVui.SIZEOF
            java.nio.ByteBuffer r0 = __create(r0, r1)
            r11 = r0
            org.lwjgl.vulkan.video.StdVideoH264SequenceParameterSetVui$Buffer r0 = new org.lwjgl.vulkan.video.StdVideoH264SequenceParameterSetVui$Buffer
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

    public static org.lwjgl.vulkan.video.StdVideoH264SequenceParameterSetVui.Buffer create(long r6, int r8) {
            org.lwjgl.vulkan.video.StdVideoH264SequenceParameterSetVui$Buffer r0 = new org.lwjgl.vulkan.video.StdVideoH264SequenceParameterSetVui$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.vulkan.video.StdVideoH264SequenceParameterSetVui.Buffer createSafe(long r6, int r8) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.vulkan.video.StdVideoH264SequenceParameterSetVui$Buffer r0 = new org.lwjgl.vulkan.video.StdVideoH264SequenceParameterSetVui$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static org.lwjgl.vulkan.video.StdVideoH264SequenceParameterSetVui malloc(org.lwjgl.system.MemoryStack r6) {
            org.lwjgl.vulkan.video.StdVideoH264SequenceParameterSetVui r0 = new org.lwjgl.vulkan.video.StdVideoH264SequenceParameterSetVui
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.vulkan.video.StdVideoH264SequenceParameterSetVui.ALIGNOF
            int r4 = org.lwjgl.vulkan.video.StdVideoH264SequenceParameterSetVui.SIZEOF
            long r2 = r2.nmalloc(r3, r4)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.video.StdVideoH264SequenceParameterSetVui calloc(org.lwjgl.system.MemoryStack r7) {
            org.lwjgl.vulkan.video.StdVideoH264SequenceParameterSetVui r0 = new org.lwjgl.vulkan.video.StdVideoH264SequenceParameterSetVui
            r1 = r0
            r2 = r7
            int r3 = org.lwjgl.vulkan.video.StdVideoH264SequenceParameterSetVui.ALIGNOF
            r4 = 1
            int r5 = org.lwjgl.vulkan.video.StdVideoH264SequenceParameterSetVui.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.video.StdVideoH264SequenceParameterSetVui.Buffer malloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.vulkan.video.StdVideoH264SequenceParameterSetVui$Buffer r0 = new org.lwjgl.vulkan.video.StdVideoH264SequenceParameterSetVui$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.vulkan.video.StdVideoH264SequenceParameterSetVui.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.vulkan.video.StdVideoH264SequenceParameterSetVui.SIZEOF
            int r4 = r4 * r5
            long r2 = r2.nmalloc(r3, r4)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.video.StdVideoH264SequenceParameterSetVui.Buffer calloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.vulkan.video.StdVideoH264SequenceParameterSetVui$Buffer r0 = new org.lwjgl.vulkan.video.StdVideoH264SequenceParameterSetVui$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.vulkan.video.StdVideoH264SequenceParameterSetVui.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.vulkan.video.StdVideoH264SequenceParameterSetVui.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.video.StdVideoH264SpsVuiFlags nflags(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.video.StdVideoH264SequenceParameterSetVui.FLAGS
            long r1 = (long) r1
            long r0 = r0 + r1
            org.lwjgl.vulkan.video.StdVideoH264SpsVuiFlags r0 = org.lwjgl.vulkan.video.StdVideoH264SpsVuiFlags.create(r0)
            return r0
    }

    public static int naspect_ratio_idc(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.video.StdVideoH264SequenceParameterSetVui.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.video.StdVideoH264SequenceParameterSetVui.ASPECT_RATIO_IDC
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static short nsar_width(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.video.StdVideoH264SequenceParameterSetVui.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.video.StdVideoH264SequenceParameterSetVui.SAR_WIDTH
            long r3 = (long) r3
            long r2 = r2 + r3
            short r0 = r0.getShort(r1, r2)
            return r0
    }

    public static short nsar_height(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.video.StdVideoH264SequenceParameterSetVui.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.video.StdVideoH264SequenceParameterSetVui.SAR_HEIGHT
            long r3 = (long) r3
            long r2 = r2 + r3
            short r0 = r0.getShort(r1, r2)
            return r0
    }

    public static byte nvideo_format(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.video.StdVideoH264SequenceParameterSetVui.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.video.StdVideoH264SequenceParameterSetVui.VIDEO_FORMAT
            long r3 = (long) r3
            long r2 = r2 + r3
            byte r0 = r0.getByte(r1, r2)
            return r0
    }

    public static byte ncolour_primaries(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.video.StdVideoH264SequenceParameterSetVui.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.video.StdVideoH264SequenceParameterSetVui.COLOUR_PRIMARIES
            long r3 = (long) r3
            long r2 = r2 + r3
            byte r0 = r0.getByte(r1, r2)
            return r0
    }

    public static byte ntransfer_characteristics(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.video.StdVideoH264SequenceParameterSetVui.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.video.StdVideoH264SequenceParameterSetVui.TRANSFER_CHARACTERISTICS
            long r3 = (long) r3
            long r2 = r2 + r3
            byte r0 = r0.getByte(r1, r2)
            return r0
    }

    public static byte nmatrix_coefficients(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.video.StdVideoH264SequenceParameterSetVui.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.video.StdVideoH264SequenceParameterSetVui.MATRIX_COEFFICIENTS
            long r3 = (long) r3
            long r2 = r2 + r3
            byte r0 = r0.getByte(r1, r2)
            return r0
    }

    public static int nnum_units_in_tick(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.video.StdVideoH264SequenceParameterSetVui.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.video.StdVideoH264SequenceParameterSetVui.NUM_UNITS_IN_TICK
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int ntime_scale(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.video.StdVideoH264SequenceParameterSetVui.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.video.StdVideoH264SequenceParameterSetVui.TIME_SCALE
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static byte nmax_num_reorder_frames(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.video.StdVideoH264SequenceParameterSetVui.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.video.StdVideoH264SequenceParameterSetVui.MAX_NUM_REORDER_FRAMES
            long r3 = (long) r3
            long r2 = r2 + r3
            byte r0 = r0.getByte(r1, r2)
            return r0
    }

    public static byte nmax_dec_frame_buffering(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.video.StdVideoH264SequenceParameterSetVui.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.video.StdVideoH264SequenceParameterSetVui.MAX_DEC_FRAME_BUFFERING
            long r3 = (long) r3
            long r2 = r2 + r3
            byte r0 = r0.getByte(r1, r2)
            return r0
    }

    public static byte nchroma_sample_loc_type_top_field(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.video.StdVideoH264SequenceParameterSetVui.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.video.StdVideoH264SequenceParameterSetVui.CHROMA_SAMPLE_LOC_TYPE_TOP_FIELD
            long r3 = (long) r3
            long r2 = r2 + r3
            byte r0 = r0.getByte(r1, r2)
            return r0
    }

    public static byte nchroma_sample_loc_type_bottom_field(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.video.StdVideoH264SequenceParameterSetVui.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.video.StdVideoH264SequenceParameterSetVui.CHROMA_SAMPLE_LOC_TYPE_BOTTOM_FIELD
            long r3 = (long) r3
            long r2 = r2 + r3
            byte r0 = r0.getByte(r1, r2)
            return r0
    }

    public static int nreserved1(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.video.StdVideoH264SequenceParameterSetVui.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.video.StdVideoH264SequenceParameterSetVui.RESERVED1
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static org.lwjgl.vulkan.video.StdVideoH264HrdParameters npHrdParameters(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.video.StdVideoH264SequenceParameterSetVui.PHRDPARAMETERS
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            org.lwjgl.vulkan.video.StdVideoH264HrdParameters r0 = org.lwjgl.vulkan.video.StdVideoH264HrdParameters.create(r0)
            return r0
    }

    public static void nflags(long r7, org.lwjgl.vulkan.video.StdVideoH264SpsVuiFlags r9) {
            r0 = r9
            long r0 = r0.address()
            r1 = r7
            int r2 = org.lwjgl.vulkan.video.StdVideoH264SequenceParameterSetVui.FLAGS
            long r2 = (long) r2
            long r1 = r1 + r2
            int r2 = org.lwjgl.vulkan.video.StdVideoH264SpsVuiFlags.SIZEOF
            long r2 = (long) r2
            org.lwjgl.system.MemoryUtil.memCopy(r0, r1, r2)
            return
    }

    public static void naspect_ratio_idc(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.video.StdVideoH264SequenceParameterSetVui.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.video.StdVideoH264SequenceParameterSetVui.ASPECT_RATIO_IDC
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void nsar_width(long r7, short r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.video.StdVideoH264SequenceParameterSetVui.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.video.StdVideoH264SequenceParameterSetVui.SAR_WIDTH
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putShort(r1, r2, r3)
            return
    }

    public static void nsar_height(long r7, short r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.video.StdVideoH264SequenceParameterSetVui.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.video.StdVideoH264SequenceParameterSetVui.SAR_HEIGHT
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putShort(r1, r2, r3)
            return
    }

    public static void nvideo_format(long r7, byte r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.video.StdVideoH264SequenceParameterSetVui.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.video.StdVideoH264SequenceParameterSetVui.VIDEO_FORMAT
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putByte(r1, r2, r3)
            return
    }

    public static void ncolour_primaries(long r7, byte r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.video.StdVideoH264SequenceParameterSetVui.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.video.StdVideoH264SequenceParameterSetVui.COLOUR_PRIMARIES
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putByte(r1, r2, r3)
            return
    }

    public static void ntransfer_characteristics(long r7, byte r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.video.StdVideoH264SequenceParameterSetVui.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.video.StdVideoH264SequenceParameterSetVui.TRANSFER_CHARACTERISTICS
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putByte(r1, r2, r3)
            return
    }

    public static void nmatrix_coefficients(long r7, byte r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.video.StdVideoH264SequenceParameterSetVui.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.video.StdVideoH264SequenceParameterSetVui.MATRIX_COEFFICIENTS
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putByte(r1, r2, r3)
            return
    }

    public static void nnum_units_in_tick(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.video.StdVideoH264SequenceParameterSetVui.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.video.StdVideoH264SequenceParameterSetVui.NUM_UNITS_IN_TICK
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void ntime_scale(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.video.StdVideoH264SequenceParameterSetVui.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.video.StdVideoH264SequenceParameterSetVui.TIME_SCALE
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void nmax_num_reorder_frames(long r7, byte r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.video.StdVideoH264SequenceParameterSetVui.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.video.StdVideoH264SequenceParameterSetVui.MAX_NUM_REORDER_FRAMES
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putByte(r1, r2, r3)
            return
    }

    public static void nmax_dec_frame_buffering(long r7, byte r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.video.StdVideoH264SequenceParameterSetVui.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.video.StdVideoH264SequenceParameterSetVui.MAX_DEC_FRAME_BUFFERING
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putByte(r1, r2, r3)
            return
    }

    public static void nchroma_sample_loc_type_top_field(long r7, byte r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.video.StdVideoH264SequenceParameterSetVui.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.video.StdVideoH264SequenceParameterSetVui.CHROMA_SAMPLE_LOC_TYPE_TOP_FIELD
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putByte(r1, r2, r3)
            return
    }

    public static void nchroma_sample_loc_type_bottom_field(long r7, byte r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.video.StdVideoH264SequenceParameterSetVui.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.video.StdVideoH264SequenceParameterSetVui.CHROMA_SAMPLE_LOC_TYPE_BOTTOM_FIELD
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putByte(r1, r2, r3)
            return
    }

    public static void nreserved1(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.video.StdVideoH264SequenceParameterSetVui.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.video.StdVideoH264SequenceParameterSetVui.RESERVED1
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void npHrdParameters(long r5, org.lwjgl.vulkan.video.StdVideoH264HrdParameters r7) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.video.StdVideoH264SequenceParameterSetVui.PHRDPARAMETERS
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            long r1 = r1.address()
            org.lwjgl.system.MemoryUtil.memPutAddress(r0, r1)
            return
    }

    public static void validate(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.video.StdVideoH264SequenceParameterSetVui.PHRDPARAMETERS
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
            org.lwjgl.vulkan.video.StdVideoH264SequenceParameterSetVui r0 = r0.create(r1, r2)
            return r0
    }

    static {
            r0 = 16
            org.lwjgl.system.Struct$Member[] r0 = new org.lwjgl.system.Struct.Member[r0]
            r1 = r0
            r2 = 0
            int r3 = org.lwjgl.vulkan.video.StdVideoH264SpsVuiFlags.SIZEOF
            int r4 = org.lwjgl.vulkan.video.StdVideoH264SpsVuiFlags.ALIGNOF
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
            r3 = 4
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 15
            int r3 = org.lwjgl.vulkan.video.StdVideoH264SequenceParameterSetVui.POINTER_SIZE
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            org.lwjgl.system.Struct$Layout r0 = __struct(r0)
            r6 = r0
            r0 = r6
            int r0 = r0.getSize()
            org.lwjgl.vulkan.video.StdVideoH264SequenceParameterSetVui.SIZEOF = r0
            r0 = r6
            int r0 = r0.getAlignment()
            org.lwjgl.vulkan.video.StdVideoH264SequenceParameterSetVui.ALIGNOF = r0
            r0 = r6
            r1 = 0
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.video.StdVideoH264SequenceParameterSetVui.FLAGS = r0
            r0 = r6
            r1 = 1
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.video.StdVideoH264SequenceParameterSetVui.ASPECT_RATIO_IDC = r0
            r0 = r6
            r1 = 2
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.video.StdVideoH264SequenceParameterSetVui.SAR_WIDTH = r0
            r0 = r6
            r1 = 3
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.video.StdVideoH264SequenceParameterSetVui.SAR_HEIGHT = r0
            r0 = r6
            r1 = 4
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.video.StdVideoH264SequenceParameterSetVui.VIDEO_FORMAT = r0
            r0 = r6
            r1 = 5
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.video.StdVideoH264SequenceParameterSetVui.COLOUR_PRIMARIES = r0
            r0 = r6
            r1 = 6
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.video.StdVideoH264SequenceParameterSetVui.TRANSFER_CHARACTERISTICS = r0
            r0 = r6
            r1 = 7
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.video.StdVideoH264SequenceParameterSetVui.MATRIX_COEFFICIENTS = r0
            r0 = r6
            r1 = 8
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.video.StdVideoH264SequenceParameterSetVui.NUM_UNITS_IN_TICK = r0
            r0 = r6
            r1 = 9
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.video.StdVideoH264SequenceParameterSetVui.TIME_SCALE = r0
            r0 = r6
            r1 = 10
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.video.StdVideoH264SequenceParameterSetVui.MAX_NUM_REORDER_FRAMES = r0
            r0 = r6
            r1 = 11
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.video.StdVideoH264SequenceParameterSetVui.MAX_DEC_FRAME_BUFFERING = r0
            r0 = r6
            r1 = 12
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.video.StdVideoH264SequenceParameterSetVui.CHROMA_SAMPLE_LOC_TYPE_TOP_FIELD = r0
            r0 = r6
            r1 = 13
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.video.StdVideoH264SequenceParameterSetVui.CHROMA_SAMPLE_LOC_TYPE_BOTTOM_FIELD = r0
            r0 = r6
            r1 = 14
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.video.StdVideoH264SequenceParameterSetVui.RESERVED1 = r0
            r0 = r6
            r1 = 15
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.video.StdVideoH264SequenceParameterSetVui.PHRDPARAMETERS = r0
            return
    }
}
