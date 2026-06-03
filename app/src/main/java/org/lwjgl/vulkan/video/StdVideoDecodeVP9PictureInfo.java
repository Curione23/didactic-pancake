package org.lwjgl.vulkan.video;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/video/StdVideoDecodeVP9PictureInfo.class */
public class StdVideoDecodeVP9PictureInfo extends org.lwjgl.system.Struct<org.lwjgl.vulkan.video.StdVideoDecodeVP9PictureInfo> implements org.lwjgl.system.NativeResource {
    public static final int SIZEOF = 0;
    public static final int ALIGNOF = 0;
    public static final int FLAGS = 0;
    public static final int PROFILE = 0;
    public static final int FRAME_TYPE = 0;
    public static final int FRAME_CONTEXT_IDX = 0;
    public static final int RESET_FRAME_CONTEXT = 0;
    public static final int REFRESH_FRAME_FLAGS = 0;
    public static final int REF_FRAME_SIGN_BIAS_MASK = 0;
    public static final int INTERPOLATION_FILTER = 0;
    public static final int BASE_Q_IDX = 0;
    public static final int DELTA_Q_Y_DC = 0;
    public static final int DELTA_Q_UV_DC = 0;
    public static final int DELTA_Q_UV_AC = 0;
    public static final int TILE_COLS_LOG2 = 0;
    public static final int TILE_ROWS_LOG2 = 0;
    public static final int RESERVED1 = 0;
    public static final int PCOLORCONFIG = 0;
    public static final int PLOOPFILTER = 0;
    public static final int PSEGMENTATION = 0;

    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/video/StdVideoDecodeVP9PictureInfo$Buffer.class */
    public static class Buffer extends org.lwjgl.system.StructBuffer<org.lwjgl.vulkan.video.StdVideoDecodeVP9PictureInfo, org.lwjgl.vulkan.video.StdVideoDecodeVP9PictureInfo.Buffer> implements org.lwjgl.system.NativeResource {
        private static final org.lwjgl.vulkan.video.StdVideoDecodeVP9PictureInfo ELEMENT_FACTORY = null;

        public Buffer(java.nio.ByteBuffer r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r6
                int r2 = r2.remaining()
                int r3 = org.lwjgl.vulkan.video.StdVideoDecodeVP9PictureInfo.SIZEOF
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

        Buffer(long r10, java.nio.ByteBuffer r12, int r13, int r14, int r15, int r16) {
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
        protected org.lwjgl.vulkan.video.StdVideoDecodeVP9PictureInfo.Buffer self() {
                r2 = this;
                r0 = r2
                return r0
        }

        protected org.lwjgl.vulkan.video.StdVideoDecodeVP9PictureInfo.Buffer create(long r11, java.nio.ByteBuffer r13, int r14, int r15, int r16, int r17) {
                r10 = this;
                org.lwjgl.vulkan.video.StdVideoDecodeVP9PictureInfo$Buffer r0 = new org.lwjgl.vulkan.video.StdVideoDecodeVP9PictureInfo$Buffer
                r1 = r0
                r2 = r11
                r3 = r13
                r4 = r14
                r5 = r15
                r6 = r16
                r7 = r17
                r1.<init>(r2, r3, r4, r5, r6, r7)
                return r0
        }

        @Override // org.lwjgl.system.StructBuffer
        protected org.lwjgl.vulkan.video.StdVideoDecodeVP9PictureInfo getElementFactory() {
                r2 = this;
                org.lwjgl.vulkan.video.StdVideoDecodeVP9PictureInfo r0 = org.lwjgl.vulkan.video.StdVideoDecodeVP9PictureInfo.Buffer.ELEMENT_FACTORY
                return r0
        }

        public org.lwjgl.vulkan.video.StdVideoDecodeVP9PictureInfoFlags flags() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                org.lwjgl.vulkan.video.StdVideoDecodeVP9PictureInfoFlags r0 = org.lwjgl.vulkan.video.StdVideoDecodeVP9PictureInfo.nflags(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("StdVideoVP9Profile")
        public int profile() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.video.StdVideoDecodeVP9PictureInfo.nprofile(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("StdVideoVP9FrameType")
        public int frame_type() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.video.StdVideoDecodeVP9PictureInfo.nframe_type(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint8_t")
        public byte frame_context_idx() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                byte r0 = org.lwjgl.vulkan.video.StdVideoDecodeVP9PictureInfo.nframe_context_idx(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint8_t")
        public byte reset_frame_context() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                byte r0 = org.lwjgl.vulkan.video.StdVideoDecodeVP9PictureInfo.nreset_frame_context(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint8_t")
        public byte refresh_frame_flags() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                byte r0 = org.lwjgl.vulkan.video.StdVideoDecodeVP9PictureInfo.nrefresh_frame_flags(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint8_t")
        public byte ref_frame_sign_bias_mask() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                byte r0 = org.lwjgl.vulkan.video.StdVideoDecodeVP9PictureInfo.nref_frame_sign_bias_mask(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("StdVideoVP9InterpolationFilter")
        public int interpolation_filter() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.video.StdVideoDecodeVP9PictureInfo.ninterpolation_filter(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint8_t")
        public byte base_q_idx() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                byte r0 = org.lwjgl.vulkan.video.StdVideoDecodeVP9PictureInfo.nbase_q_idx(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("int8_t")
        public byte delta_q_y_dc() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                byte r0 = org.lwjgl.vulkan.video.StdVideoDecodeVP9PictureInfo.ndelta_q_y_dc(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("int8_t")
        public byte delta_q_uv_dc() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                byte r0 = org.lwjgl.vulkan.video.StdVideoDecodeVP9PictureInfo.ndelta_q_uv_dc(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("int8_t")
        public byte delta_q_uv_ac() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                byte r0 = org.lwjgl.vulkan.video.StdVideoDecodeVP9PictureInfo.ndelta_q_uv_ac(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint8_t")
        public byte tile_cols_log2() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                byte r0 = org.lwjgl.vulkan.video.StdVideoDecodeVP9PictureInfo.ntile_cols_log2(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint8_t")
        public byte tile_rows_log2() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                byte r0 = org.lwjgl.vulkan.video.StdVideoDecodeVP9PictureInfo.ntile_rows_log2(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("StdVideoVP9ColorConfig const *")
        public org.lwjgl.vulkan.video.StdVideoVP9ColorConfig pColorConfig() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                org.lwjgl.vulkan.video.StdVideoVP9ColorConfig r0 = org.lwjgl.vulkan.video.StdVideoDecodeVP9PictureInfo.npColorConfig(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("StdVideoVP9LoopFilter const *")
        public org.lwjgl.vulkan.video.StdVideoVP9LoopFilter pLoopFilter() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                org.lwjgl.vulkan.video.StdVideoVP9LoopFilter r0 = org.lwjgl.vulkan.video.StdVideoDecodeVP9PictureInfo.npLoopFilter(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("StdVideoVP9Segmentation const *")
        public org.lwjgl.vulkan.video.StdVideoVP9Segmentation pSegmentation() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                org.lwjgl.vulkan.video.StdVideoVP9Segmentation r0 = org.lwjgl.vulkan.video.StdVideoDecodeVP9PictureInfo.npSegmentation(r0)
                return r0
        }

        public org.lwjgl.vulkan.video.StdVideoDecodeVP9PictureInfo.Buffer flags(org.lwjgl.vulkan.video.StdVideoDecodeVP9PictureInfoFlags r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.video.StdVideoDecodeVP9PictureInfo.nflags(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.video.StdVideoDecodeVP9PictureInfo.Buffer flags(java.util.function.Consumer<org.lwjgl.vulkan.video.StdVideoDecodeVP9PictureInfoFlags> r4) {
                r3 = this;
                r0 = r4
                r1 = r3
                org.lwjgl.vulkan.video.StdVideoDecodeVP9PictureInfoFlags r1 = r1.flags()
                r0.accept(r1)
                r0 = r3
                return r0
        }

        public org.lwjgl.vulkan.video.StdVideoDecodeVP9PictureInfo.Buffer profile(@org.lwjgl.system.NativeType("StdVideoVP9Profile") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.video.StdVideoDecodeVP9PictureInfo.nprofile(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.video.StdVideoDecodeVP9PictureInfo.Buffer frame_type(@org.lwjgl.system.NativeType("StdVideoVP9FrameType") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.video.StdVideoDecodeVP9PictureInfo.nframe_type(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.video.StdVideoDecodeVP9PictureInfo.Buffer frame_context_idx(@org.lwjgl.system.NativeType("uint8_t") byte r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.video.StdVideoDecodeVP9PictureInfo.nframe_context_idx(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.video.StdVideoDecodeVP9PictureInfo.Buffer reset_frame_context(@org.lwjgl.system.NativeType("uint8_t") byte r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.video.StdVideoDecodeVP9PictureInfo.nreset_frame_context(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.video.StdVideoDecodeVP9PictureInfo.Buffer refresh_frame_flags(@org.lwjgl.system.NativeType("uint8_t") byte r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.video.StdVideoDecodeVP9PictureInfo.nrefresh_frame_flags(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.video.StdVideoDecodeVP9PictureInfo.Buffer ref_frame_sign_bias_mask(@org.lwjgl.system.NativeType("uint8_t") byte r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.video.StdVideoDecodeVP9PictureInfo.nref_frame_sign_bias_mask(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.video.StdVideoDecodeVP9PictureInfo.Buffer interpolation_filter(@org.lwjgl.system.NativeType("StdVideoVP9InterpolationFilter") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.video.StdVideoDecodeVP9PictureInfo.ninterpolation_filter(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.video.StdVideoDecodeVP9PictureInfo.Buffer base_q_idx(@org.lwjgl.system.NativeType("uint8_t") byte r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.video.StdVideoDecodeVP9PictureInfo.nbase_q_idx(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.video.StdVideoDecodeVP9PictureInfo.Buffer delta_q_y_dc(@org.lwjgl.system.NativeType("int8_t") byte r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.video.StdVideoDecodeVP9PictureInfo.ndelta_q_y_dc(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.video.StdVideoDecodeVP9PictureInfo.Buffer delta_q_uv_dc(@org.lwjgl.system.NativeType("int8_t") byte r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.video.StdVideoDecodeVP9PictureInfo.ndelta_q_uv_dc(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.video.StdVideoDecodeVP9PictureInfo.Buffer delta_q_uv_ac(@org.lwjgl.system.NativeType("int8_t") byte r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.video.StdVideoDecodeVP9PictureInfo.ndelta_q_uv_ac(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.video.StdVideoDecodeVP9PictureInfo.Buffer tile_cols_log2(@org.lwjgl.system.NativeType("uint8_t") byte r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.video.StdVideoDecodeVP9PictureInfo.ntile_cols_log2(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.video.StdVideoDecodeVP9PictureInfo.Buffer tile_rows_log2(@org.lwjgl.system.NativeType("uint8_t") byte r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.video.StdVideoDecodeVP9PictureInfo.ntile_rows_log2(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.video.StdVideoDecodeVP9PictureInfo.Buffer pColorConfig(@org.lwjgl.system.NativeType("StdVideoVP9ColorConfig const *") org.lwjgl.vulkan.video.StdVideoVP9ColorConfig r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.video.StdVideoDecodeVP9PictureInfo.npColorConfig(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.video.StdVideoDecodeVP9PictureInfo.Buffer pLoopFilter(@org.lwjgl.system.NativeType("StdVideoVP9LoopFilter const *") org.lwjgl.vulkan.video.StdVideoVP9LoopFilter r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.video.StdVideoDecodeVP9PictureInfo.npLoopFilter(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.video.StdVideoDecodeVP9PictureInfo.Buffer pSegmentation(@org.lwjgl.system.NativeType("StdVideoVP9Segmentation const *") org.lwjgl.vulkan.video.StdVideoVP9Segmentation r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.video.StdVideoDecodeVP9PictureInfo.npSegmentation(r0, r1)
                r0 = r4
                return r0
        }

        @Override // org.lwjgl.system.StructBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.Struct getElementFactory() {
                r2 = this;
                r0 = r2
                org.lwjgl.vulkan.video.StdVideoDecodeVP9PictureInfo r0 = r0.getElementFactory()
                return r0
        }

        /* JADX INFO: renamed from: create, reason: collision with other method in class */
        protected /* bridge */ /* synthetic */ org.lwjgl.system.CustomBuffer m7416create(long r10, java.nio.ByteBuffer r12, int r13, int r14, int r15, int r16) {
                r9 = this;
                r0 = r9
                r1 = r10
                r2 = r12
                r3 = r13
                r4 = r14
                r5 = r15
                r6 = r16
                org.lwjgl.vulkan.video.StdVideoDecodeVP9PictureInfo$Buffer r0 = r0.create(r1, r2, r3, r4, r5, r6)
                return r0
        }

        @Override // org.lwjgl.system.CustomBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.CustomBuffer self() {
                r2 = this;
                r0 = r2
                org.lwjgl.vulkan.video.StdVideoDecodeVP9PictureInfo$Buffer r0 = r0.self()
                return r0
        }

        static {
                r0 = -1
                org.lwjgl.vulkan.video.StdVideoDecodeVP9PictureInfo r0 = org.lwjgl.vulkan.video.StdVideoDecodeVP9PictureInfo.create(r0)
                org.lwjgl.vulkan.video.StdVideoDecodeVP9PictureInfo.Buffer.ELEMENT_FACTORY = r0
                return
        }
    }

    protected StdVideoDecodeVP9PictureInfo(long r6, java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    protected org.lwjgl.vulkan.video.StdVideoDecodeVP9PictureInfo create(long r7, java.nio.ByteBuffer r9) {
            r6 = this;
            org.lwjgl.vulkan.video.StdVideoDecodeVP9PictureInfo r0 = new org.lwjgl.vulkan.video.StdVideoDecodeVP9PictureInfo
            r1 = r0
            r2 = r7
            r3 = r9
            r1.<init>(r2, r3)
            return r0
    }

    public StdVideoDecodeVP9PictureInfo(java.nio.ByteBuffer r7) {
            r6 = this;
            r0 = r6
            r1 = r7
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            r2 = r7
            int r3 = org.lwjgl.vulkan.video.StdVideoDecodeVP9PictureInfo.SIZEOF
            java.nio.ByteBuffer r2 = __checkContainer(r2, r3)
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
            r2 = this;
            int r0 = org.lwjgl.vulkan.video.StdVideoDecodeVP9PictureInfo.SIZEOF
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoDecodeVP9PictureInfoFlags flags() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            org.lwjgl.vulkan.video.StdVideoDecodeVP9PictureInfoFlags r0 = nflags(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("StdVideoVP9Profile")
    public int profile() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nprofile(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("StdVideoVP9FrameType")
    public int frame_type() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nframe_type(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("uint8_t")
    public byte frame_context_idx() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            byte r0 = nframe_context_idx(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("uint8_t")
    public byte reset_frame_context() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            byte r0 = nreset_frame_context(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("uint8_t")
    public byte refresh_frame_flags() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            byte r0 = nrefresh_frame_flags(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("uint8_t")
    public byte ref_frame_sign_bias_mask() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            byte r0 = nref_frame_sign_bias_mask(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("StdVideoVP9InterpolationFilter")
    public int interpolation_filter() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = ninterpolation_filter(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("uint8_t")
    public byte base_q_idx() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            byte r0 = nbase_q_idx(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("int8_t")
    public byte delta_q_y_dc() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            byte r0 = ndelta_q_y_dc(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("int8_t")
    public byte delta_q_uv_dc() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            byte r0 = ndelta_q_uv_dc(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("int8_t")
    public byte delta_q_uv_ac() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            byte r0 = ndelta_q_uv_ac(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("uint8_t")
    public byte tile_cols_log2() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            byte r0 = ntile_cols_log2(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("uint8_t")
    public byte tile_rows_log2() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            byte r0 = ntile_rows_log2(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("StdVideoVP9ColorConfig const *")
    public org.lwjgl.vulkan.video.StdVideoVP9ColorConfig pColorConfig() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            org.lwjgl.vulkan.video.StdVideoVP9ColorConfig r0 = npColorConfig(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("StdVideoVP9LoopFilter const *")
    public org.lwjgl.vulkan.video.StdVideoVP9LoopFilter pLoopFilter() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            org.lwjgl.vulkan.video.StdVideoVP9LoopFilter r0 = npLoopFilter(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("StdVideoVP9Segmentation const *")
    public org.lwjgl.vulkan.video.StdVideoVP9Segmentation pSegmentation() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            org.lwjgl.vulkan.video.StdVideoVP9Segmentation r0 = npSegmentation(r0)
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoDecodeVP9PictureInfo flags(org.lwjgl.vulkan.video.StdVideoDecodeVP9PictureInfoFlags r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nflags(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoDecodeVP9PictureInfo flags(java.util.function.Consumer<org.lwjgl.vulkan.video.StdVideoDecodeVP9PictureInfoFlags> r4) {
            r3 = this;
            r0 = r4
            r1 = r3
            org.lwjgl.vulkan.video.StdVideoDecodeVP9PictureInfoFlags r1 = r1.flags()
            r0.accept(r1)
            r0 = r3
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoDecodeVP9PictureInfo profile(@org.lwjgl.system.NativeType("StdVideoVP9Profile") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nprofile(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoDecodeVP9PictureInfo frame_type(@org.lwjgl.system.NativeType("StdVideoVP9FrameType") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nframe_type(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoDecodeVP9PictureInfo frame_context_idx(@org.lwjgl.system.NativeType("uint8_t") byte r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nframe_context_idx(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoDecodeVP9PictureInfo reset_frame_context(@org.lwjgl.system.NativeType("uint8_t") byte r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nreset_frame_context(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoDecodeVP9PictureInfo refresh_frame_flags(@org.lwjgl.system.NativeType("uint8_t") byte r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nrefresh_frame_flags(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoDecodeVP9PictureInfo ref_frame_sign_bias_mask(@org.lwjgl.system.NativeType("uint8_t") byte r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nref_frame_sign_bias_mask(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoDecodeVP9PictureInfo interpolation_filter(@org.lwjgl.system.NativeType("StdVideoVP9InterpolationFilter") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            ninterpolation_filter(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoDecodeVP9PictureInfo base_q_idx(@org.lwjgl.system.NativeType("uint8_t") byte r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nbase_q_idx(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoDecodeVP9PictureInfo delta_q_y_dc(@org.lwjgl.system.NativeType("int8_t") byte r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            ndelta_q_y_dc(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoDecodeVP9PictureInfo delta_q_uv_dc(@org.lwjgl.system.NativeType("int8_t") byte r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            ndelta_q_uv_dc(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoDecodeVP9PictureInfo delta_q_uv_ac(@org.lwjgl.system.NativeType("int8_t") byte r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            ndelta_q_uv_ac(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoDecodeVP9PictureInfo tile_cols_log2(@org.lwjgl.system.NativeType("uint8_t") byte r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            ntile_cols_log2(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoDecodeVP9PictureInfo tile_rows_log2(@org.lwjgl.system.NativeType("uint8_t") byte r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            ntile_rows_log2(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoDecodeVP9PictureInfo pColorConfig(@org.lwjgl.system.NativeType("StdVideoVP9ColorConfig const *") org.lwjgl.vulkan.video.StdVideoVP9ColorConfig r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            npColorConfig(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoDecodeVP9PictureInfo pLoopFilter(@org.lwjgl.system.NativeType("StdVideoVP9LoopFilter const *") org.lwjgl.vulkan.video.StdVideoVP9LoopFilter r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            npLoopFilter(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoDecodeVP9PictureInfo pSegmentation(@org.lwjgl.system.NativeType("StdVideoVP9Segmentation const *") org.lwjgl.vulkan.video.StdVideoVP9Segmentation r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            npSegmentation(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoDecodeVP9PictureInfo set(org.lwjgl.vulkan.video.StdVideoDecodeVP9PictureInfoFlags r4, int r5, int r6, byte r7, byte r8, byte r9, byte r10, int r11, byte r12, byte r13, byte r14, byte r15, byte r16, byte r17, org.lwjgl.vulkan.video.StdVideoVP9ColorConfig r18, org.lwjgl.vulkan.video.StdVideoVP9LoopFilter r19, org.lwjgl.vulkan.video.StdVideoVP9Segmentation r20) {
            r3 = this;
            r0 = r3
            r1 = r4
            org.lwjgl.vulkan.video.StdVideoDecodeVP9PictureInfo r0 = r0.flags(r1)
            r0 = r3
            r1 = r5
            org.lwjgl.vulkan.video.StdVideoDecodeVP9PictureInfo r0 = r0.profile(r1)
            r0 = r3
            r1 = r6
            org.lwjgl.vulkan.video.StdVideoDecodeVP9PictureInfo r0 = r0.frame_type(r1)
            r0 = r3
            r1 = r7
            org.lwjgl.vulkan.video.StdVideoDecodeVP9PictureInfo r0 = r0.frame_context_idx(r1)
            r0 = r3
            r1 = r8
            org.lwjgl.vulkan.video.StdVideoDecodeVP9PictureInfo r0 = r0.reset_frame_context(r1)
            r0 = r3
            r1 = r9
            org.lwjgl.vulkan.video.StdVideoDecodeVP9PictureInfo r0 = r0.refresh_frame_flags(r1)
            r0 = r3
            r1 = r10
            org.lwjgl.vulkan.video.StdVideoDecodeVP9PictureInfo r0 = r0.ref_frame_sign_bias_mask(r1)
            r0 = r3
            r1 = r11
            org.lwjgl.vulkan.video.StdVideoDecodeVP9PictureInfo r0 = r0.interpolation_filter(r1)
            r0 = r3
            r1 = r12
            org.lwjgl.vulkan.video.StdVideoDecodeVP9PictureInfo r0 = r0.base_q_idx(r1)
            r0 = r3
            r1 = r13
            org.lwjgl.vulkan.video.StdVideoDecodeVP9PictureInfo r0 = r0.delta_q_y_dc(r1)
            r0 = r3
            r1 = r14
            org.lwjgl.vulkan.video.StdVideoDecodeVP9PictureInfo r0 = r0.delta_q_uv_dc(r1)
            r0 = r3
            r1 = r15
            org.lwjgl.vulkan.video.StdVideoDecodeVP9PictureInfo r0 = r0.delta_q_uv_ac(r1)
            r0 = r3
            r1 = r16
            org.lwjgl.vulkan.video.StdVideoDecodeVP9PictureInfo r0 = r0.tile_cols_log2(r1)
            r0 = r3
            r1 = r17
            org.lwjgl.vulkan.video.StdVideoDecodeVP9PictureInfo r0 = r0.tile_rows_log2(r1)
            r0 = r3
            r1 = r18
            org.lwjgl.vulkan.video.StdVideoDecodeVP9PictureInfo r0 = r0.pColorConfig(r1)
            r0 = r3
            r1 = r19
            org.lwjgl.vulkan.video.StdVideoDecodeVP9PictureInfo r0 = r0.pLoopFilter(r1)
            r0 = r3
            r1 = r20
            org.lwjgl.vulkan.video.StdVideoDecodeVP9PictureInfo r0 = r0.pSegmentation(r1)
            r0 = r3
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoDecodeVP9PictureInfo set(org.lwjgl.vulkan.video.StdVideoDecodeVP9PictureInfo r8) {
            r7 = this;
            r0 = r8
            long r0 = r0.address()
            r1 = r7
            long r1 = r1.address()
            int r2 = org.lwjgl.vulkan.video.StdVideoDecodeVP9PictureInfo.SIZEOF
            long r2 = (long) r2
            org.lwjgl.system.MemoryUtil.memCopy(r0, r1, r2)
            r0 = r7
            return r0
    }

    public static org.lwjgl.vulkan.video.StdVideoDecodeVP9PictureInfo malloc() {
            org.lwjgl.vulkan.video.StdVideoDecodeVP9PictureInfo r0 = new org.lwjgl.vulkan.video.StdVideoDecodeVP9PictureInfo
            r1 = r0
            int r2 = org.lwjgl.vulkan.video.StdVideoDecodeVP9PictureInfo.SIZEOF
            long r2 = (long) r2
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.video.StdVideoDecodeVP9PictureInfo calloc() {
            org.lwjgl.vulkan.video.StdVideoDecodeVP9PictureInfo r0 = new org.lwjgl.vulkan.video.StdVideoDecodeVP9PictureInfo
            r1 = r0
            r2 = 1
            int r3 = org.lwjgl.vulkan.video.StdVideoDecodeVP9PictureInfo.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.video.StdVideoDecodeVP9PictureInfo create() {
            int r0 = org.lwjgl.vulkan.video.StdVideoDecodeVP9PictureInfo.SIZEOF
            java.nio.ByteBuffer r0 = org.lwjgl.BufferUtils.createByteBuffer(r0)
            r6 = r0
            org.lwjgl.vulkan.video.StdVideoDecodeVP9PictureInfo r0 = new org.lwjgl.vulkan.video.StdVideoDecodeVP9PictureInfo
            r1 = r0
            r2 = r6
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.video.StdVideoDecodeVP9PictureInfo create(long r6) {
            org.lwjgl.vulkan.video.StdVideoDecodeVP9PictureInfo r0 = new org.lwjgl.vulkan.video.StdVideoDecodeVP9PictureInfo
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.video.StdVideoDecodeVP9PictureInfo createSafe(long r6) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.vulkan.video.StdVideoDecodeVP9PictureInfo r0 = new org.lwjgl.vulkan.video.StdVideoDecodeVP9PictureInfo
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static org.lwjgl.vulkan.video.StdVideoDecodeVP9PictureInfo.Buffer malloc(int r6) {
            org.lwjgl.vulkan.video.StdVideoDecodeVP9PictureInfo$Buffer r0 = new org.lwjgl.vulkan.video.StdVideoDecodeVP9PictureInfo$Buffer
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.vulkan.video.StdVideoDecodeVP9PictureInfo.SIZEOF
            long r2 = __checkMalloc(r2, r3)
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.video.StdVideoDecodeVP9PictureInfo.Buffer calloc(int r7) {
            org.lwjgl.vulkan.video.StdVideoDecodeVP9PictureInfo$Buffer r0 = new org.lwjgl.vulkan.video.StdVideoDecodeVP9PictureInfo$Buffer
            r1 = r0
            r2 = r7
            long r2 = (long) r2
            int r3 = org.lwjgl.vulkan.video.StdVideoDecodeVP9PictureInfo.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.video.StdVideoDecodeVP9PictureInfo.Buffer create(int r10) {
            r0 = r10
            int r1 = org.lwjgl.vulkan.video.StdVideoDecodeVP9PictureInfo.SIZEOF
            java.nio.ByteBuffer r0 = __create(r0, r1)
            r11 = r0
            org.lwjgl.vulkan.video.StdVideoDecodeVP9PictureInfo$Buffer r0 = new org.lwjgl.vulkan.video.StdVideoDecodeVP9PictureInfo$Buffer
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

    public static org.lwjgl.vulkan.video.StdVideoDecodeVP9PictureInfo.Buffer create(long r6, int r8) {
            org.lwjgl.vulkan.video.StdVideoDecodeVP9PictureInfo$Buffer r0 = new org.lwjgl.vulkan.video.StdVideoDecodeVP9PictureInfo$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.video.StdVideoDecodeVP9PictureInfo.Buffer createSafe(long r6, int r8) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.vulkan.video.StdVideoDecodeVP9PictureInfo$Buffer r0 = new org.lwjgl.vulkan.video.StdVideoDecodeVP9PictureInfo$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static org.lwjgl.vulkan.video.StdVideoDecodeVP9PictureInfo malloc(org.lwjgl.system.MemoryStack r6) {
            org.lwjgl.vulkan.video.StdVideoDecodeVP9PictureInfo r0 = new org.lwjgl.vulkan.video.StdVideoDecodeVP9PictureInfo
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.vulkan.video.StdVideoDecodeVP9PictureInfo.ALIGNOF
            int r4 = org.lwjgl.vulkan.video.StdVideoDecodeVP9PictureInfo.SIZEOF
            long r2 = r2.nmalloc(r3, r4)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.video.StdVideoDecodeVP9PictureInfo calloc(org.lwjgl.system.MemoryStack r7) {
            org.lwjgl.vulkan.video.StdVideoDecodeVP9PictureInfo r0 = new org.lwjgl.vulkan.video.StdVideoDecodeVP9PictureInfo
            r1 = r0
            r2 = r7
            int r3 = org.lwjgl.vulkan.video.StdVideoDecodeVP9PictureInfo.ALIGNOF
            r4 = 1
            int r5 = org.lwjgl.vulkan.video.StdVideoDecodeVP9PictureInfo.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.video.StdVideoDecodeVP9PictureInfo.Buffer malloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.vulkan.video.StdVideoDecodeVP9PictureInfo$Buffer r0 = new org.lwjgl.vulkan.video.StdVideoDecodeVP9PictureInfo$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.vulkan.video.StdVideoDecodeVP9PictureInfo.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.vulkan.video.StdVideoDecodeVP9PictureInfo.SIZEOF
            int r4 = r4 * r5
            long r2 = r2.nmalloc(r3, r4)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.video.StdVideoDecodeVP9PictureInfo.Buffer calloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.vulkan.video.StdVideoDecodeVP9PictureInfo$Buffer r0 = new org.lwjgl.vulkan.video.StdVideoDecodeVP9PictureInfo$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.vulkan.video.StdVideoDecodeVP9PictureInfo.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.vulkan.video.StdVideoDecodeVP9PictureInfo.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.video.StdVideoDecodeVP9PictureInfoFlags nflags(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.video.StdVideoDecodeVP9PictureInfo.FLAGS
            long r1 = (long) r1
            long r0 = r0 + r1
            org.lwjgl.vulkan.video.StdVideoDecodeVP9PictureInfoFlags r0 = org.lwjgl.vulkan.video.StdVideoDecodeVP9PictureInfoFlags.create(r0)
            return r0
    }

    public static int nprofile(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.video.StdVideoDecodeVP9PictureInfo.PROFILE
            long r1 = (long) r1
            long r0 = r0 + r1
            int r0 = org.lwjgl.system.MemoryUtil.memGetInt(r0)
            return r0
    }

    public static int nframe_type(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.video.StdVideoDecodeVP9PictureInfo.FRAME_TYPE
            long r1 = (long) r1
            long r0 = r0 + r1
            int r0 = org.lwjgl.system.MemoryUtil.memGetInt(r0)
            return r0
    }

    public static byte nframe_context_idx(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.video.StdVideoDecodeVP9PictureInfo.FRAME_CONTEXT_IDX
            long r1 = (long) r1
            long r0 = r0 + r1
            byte r0 = org.lwjgl.system.MemoryUtil.memGetByte(r0)
            return r0
    }

    public static byte nreset_frame_context(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.video.StdVideoDecodeVP9PictureInfo.RESET_FRAME_CONTEXT
            long r1 = (long) r1
            long r0 = r0 + r1
            byte r0 = org.lwjgl.system.MemoryUtil.memGetByte(r0)
            return r0
    }

    public static byte nrefresh_frame_flags(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.video.StdVideoDecodeVP9PictureInfo.REFRESH_FRAME_FLAGS
            long r1 = (long) r1
            long r0 = r0 + r1
            byte r0 = org.lwjgl.system.MemoryUtil.memGetByte(r0)
            return r0
    }

    public static byte nref_frame_sign_bias_mask(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.video.StdVideoDecodeVP9PictureInfo.REF_FRAME_SIGN_BIAS_MASK
            long r1 = (long) r1
            long r0 = r0 + r1
            byte r0 = org.lwjgl.system.MemoryUtil.memGetByte(r0)
            return r0
    }

    public static int ninterpolation_filter(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.video.StdVideoDecodeVP9PictureInfo.INTERPOLATION_FILTER
            long r1 = (long) r1
            long r0 = r0 + r1
            int r0 = org.lwjgl.system.MemoryUtil.memGetInt(r0)
            return r0
    }

    public static byte nbase_q_idx(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.video.StdVideoDecodeVP9PictureInfo.BASE_Q_IDX
            long r1 = (long) r1
            long r0 = r0 + r1
            byte r0 = org.lwjgl.system.MemoryUtil.memGetByte(r0)
            return r0
    }

    public static byte ndelta_q_y_dc(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.video.StdVideoDecodeVP9PictureInfo.DELTA_Q_Y_DC
            long r1 = (long) r1
            long r0 = r0 + r1
            byte r0 = org.lwjgl.system.MemoryUtil.memGetByte(r0)
            return r0
    }

    public static byte ndelta_q_uv_dc(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.video.StdVideoDecodeVP9PictureInfo.DELTA_Q_UV_DC
            long r1 = (long) r1
            long r0 = r0 + r1
            byte r0 = org.lwjgl.system.MemoryUtil.memGetByte(r0)
            return r0
    }

    public static byte ndelta_q_uv_ac(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.video.StdVideoDecodeVP9PictureInfo.DELTA_Q_UV_AC
            long r1 = (long) r1
            long r0 = r0 + r1
            byte r0 = org.lwjgl.system.MemoryUtil.memGetByte(r0)
            return r0
    }

    public static byte ntile_cols_log2(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.video.StdVideoDecodeVP9PictureInfo.TILE_COLS_LOG2
            long r1 = (long) r1
            long r0 = r0 + r1
            byte r0 = org.lwjgl.system.MemoryUtil.memGetByte(r0)
            return r0
    }

    public static byte ntile_rows_log2(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.video.StdVideoDecodeVP9PictureInfo.TILE_ROWS_LOG2
            long r1 = (long) r1
            long r0 = r0 + r1
            byte r0 = org.lwjgl.system.MemoryUtil.memGetByte(r0)
            return r0
    }

    public static java.nio.ShortBuffer nreserved1(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.video.StdVideoDecodeVP9PictureInfo.RESERVED1
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = 3
            java.nio.ShortBuffer r0 = org.lwjgl.system.MemoryUtil.memShortBuffer(r0, r1)
            return r0
    }

    public static short nreserved1(long r7, int r9) {
            r0 = r7
            int r1 = org.lwjgl.vulkan.video.StdVideoDecodeVP9PictureInfo.RESERVED1
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r9
            r2 = 3
            long r1 = org.lwjgl.system.Checks.check(r1, r2)
            r2 = 2
            long r1 = r1 * r2
            long r0 = r0 + r1
            short r0 = org.lwjgl.system.MemoryUtil.memGetShort(r0)
            return r0
    }

    public static org.lwjgl.vulkan.video.StdVideoVP9ColorConfig npColorConfig(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.video.StdVideoDecodeVP9PictureInfo.PCOLORCONFIG
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            org.lwjgl.vulkan.video.StdVideoVP9ColorConfig r0 = org.lwjgl.vulkan.video.StdVideoVP9ColorConfig.create(r0)
            return r0
    }

    public static org.lwjgl.vulkan.video.StdVideoVP9LoopFilter npLoopFilter(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.video.StdVideoDecodeVP9PictureInfo.PLOOPFILTER
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            org.lwjgl.vulkan.video.StdVideoVP9LoopFilter r0 = org.lwjgl.vulkan.video.StdVideoVP9LoopFilter.create(r0)
            return r0
    }

    public static org.lwjgl.vulkan.video.StdVideoVP9Segmentation npSegmentation(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.video.StdVideoDecodeVP9PictureInfo.PSEGMENTATION
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            org.lwjgl.vulkan.video.StdVideoVP9Segmentation r0 = org.lwjgl.vulkan.video.StdVideoVP9Segmentation.create(r0)
            return r0
    }

    public static void nflags(long r7, org.lwjgl.vulkan.video.StdVideoDecodeVP9PictureInfoFlags r9) {
            r0 = r9
            long r0 = r0.address()
            r1 = r7
            int r2 = org.lwjgl.vulkan.video.StdVideoDecodeVP9PictureInfo.FLAGS
            long r2 = (long) r2
            long r1 = r1 + r2
            int r2 = org.lwjgl.vulkan.video.StdVideoDecodeVP9PictureInfoFlags.SIZEOF
            long r2 = (long) r2
            org.lwjgl.system.MemoryUtil.memCopy(r0, r1, r2)
            return
    }

    public static void nprofile(long r5, int r7) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.video.StdVideoDecodeVP9PictureInfo.PROFILE
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            org.lwjgl.system.MemoryUtil.memPutInt(r0, r1)
            return
    }

    public static void nframe_type(long r5, int r7) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.video.StdVideoDecodeVP9PictureInfo.FRAME_TYPE
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            org.lwjgl.system.MemoryUtil.memPutInt(r0, r1)
            return
    }

    public static void nframe_context_idx(long r5, byte r7) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.video.StdVideoDecodeVP9PictureInfo.FRAME_CONTEXT_IDX
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            org.lwjgl.system.MemoryUtil.memPutByte(r0, r1)
            return
    }

    public static void nreset_frame_context(long r5, byte r7) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.video.StdVideoDecodeVP9PictureInfo.RESET_FRAME_CONTEXT
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            org.lwjgl.system.MemoryUtil.memPutByte(r0, r1)
            return
    }

    public static void nrefresh_frame_flags(long r5, byte r7) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.video.StdVideoDecodeVP9PictureInfo.REFRESH_FRAME_FLAGS
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            org.lwjgl.system.MemoryUtil.memPutByte(r0, r1)
            return
    }

    public static void nref_frame_sign_bias_mask(long r5, byte r7) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.video.StdVideoDecodeVP9PictureInfo.REF_FRAME_SIGN_BIAS_MASK
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            org.lwjgl.system.MemoryUtil.memPutByte(r0, r1)
            return
    }

    public static void ninterpolation_filter(long r5, int r7) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.video.StdVideoDecodeVP9PictureInfo.INTERPOLATION_FILTER
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            org.lwjgl.system.MemoryUtil.memPutInt(r0, r1)
            return
    }

    public static void nbase_q_idx(long r5, byte r7) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.video.StdVideoDecodeVP9PictureInfo.BASE_Q_IDX
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            org.lwjgl.system.MemoryUtil.memPutByte(r0, r1)
            return
    }

    public static void ndelta_q_y_dc(long r5, byte r7) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.video.StdVideoDecodeVP9PictureInfo.DELTA_Q_Y_DC
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            org.lwjgl.system.MemoryUtil.memPutByte(r0, r1)
            return
    }

    public static void ndelta_q_uv_dc(long r5, byte r7) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.video.StdVideoDecodeVP9PictureInfo.DELTA_Q_UV_DC
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            org.lwjgl.system.MemoryUtil.memPutByte(r0, r1)
            return
    }

    public static void ndelta_q_uv_ac(long r5, byte r7) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.video.StdVideoDecodeVP9PictureInfo.DELTA_Q_UV_AC
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            org.lwjgl.system.MemoryUtil.memPutByte(r0, r1)
            return
    }

    public static void ntile_cols_log2(long r5, byte r7) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.video.StdVideoDecodeVP9PictureInfo.TILE_COLS_LOG2
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            org.lwjgl.system.MemoryUtil.memPutByte(r0, r1)
            return
    }

    public static void ntile_rows_log2(long r5, byte r7) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.video.StdVideoDecodeVP9PictureInfo.TILE_ROWS_LOG2
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            org.lwjgl.system.MemoryUtil.memPutByte(r0, r1)
            return
    }

    public static void nreserved1(long r7, java.nio.ShortBuffer r9) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r9
            r1 = 3
            org.lwjgl.system.Checks.checkGT(r0, r1)
        Lb:
            r0 = r9
            long r0 = org.lwjgl.system.MemoryUtil.memAddress(r0)
            r1 = r7
            int r2 = org.lwjgl.vulkan.video.StdVideoDecodeVP9PictureInfo.RESERVED1
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

    public static void nreserved1(long r7, int r9, short r10) {
            r0 = r7
            int r1 = org.lwjgl.vulkan.video.StdVideoDecodeVP9PictureInfo.RESERVED1
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r9
            r2 = 3
            long r1 = org.lwjgl.system.Checks.check(r1, r2)
            r2 = 2
            long r1 = r1 * r2
            long r0 = r0 + r1
            r1 = r10
            org.lwjgl.system.MemoryUtil.memPutShort(r0, r1)
            return
    }

    public static void npColorConfig(long r5, org.lwjgl.vulkan.video.StdVideoVP9ColorConfig r7) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.video.StdVideoDecodeVP9PictureInfo.PCOLORCONFIG
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            long r1 = r1.address()
            org.lwjgl.system.MemoryUtil.memPutAddress(r0, r1)
            return
    }

    public static void npLoopFilter(long r5, org.lwjgl.vulkan.video.StdVideoVP9LoopFilter r7) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.video.StdVideoDecodeVP9PictureInfo.PLOOPFILTER
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            long r1 = r1.address()
            org.lwjgl.system.MemoryUtil.memPutAddress(r0, r1)
            return
    }

    public static void npSegmentation(long r5, org.lwjgl.vulkan.video.StdVideoVP9Segmentation r7) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.video.StdVideoDecodeVP9PictureInfo.PSEGMENTATION
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            long r1 = r1.address()
            org.lwjgl.system.MemoryUtil.memPutAddress(r0, r1)
            return
    }

    public static void validate(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.video.StdVideoDecodeVP9PictureInfo.PCOLORCONFIG
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r5
            int r1 = org.lwjgl.vulkan.video.StdVideoDecodeVP9PictureInfo.PLOOPFILTER
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r5
            int r1 = org.lwjgl.vulkan.video.StdVideoDecodeVP9PictureInfo.PSEGMENTATION
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            long r0 = org.lwjgl.system.Checks.check(r0)
            return
    }

    @Override // org.lwjgl.system.Struct
    protected /* bridge */ /* synthetic */ org.lwjgl.system.Struct create(long r6, java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            org.lwjgl.vulkan.video.StdVideoDecodeVP9PictureInfo r0 = r0.create(r1, r2)
            return r0
    }

    static {
            r0 = 18
            org.lwjgl.system.Struct$Member[] r0 = new org.lwjgl.system.Struct.Member[r0]
            r1 = r0
            r2 = 0
            int r3 = org.lwjgl.vulkan.video.StdVideoDecodeVP9PictureInfoFlags.SIZEOF
            int r4 = org.lwjgl.vulkan.video.StdVideoDecodeVP9PictureInfoFlags.ALIGNOF
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
            r3 = 4
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
            r3 = 2
            r4 = 3
            org.lwjgl.system.Struct$Member r3 = __array(r3, r4)
            r1[r2] = r3
            r1 = r0
            r2 = 15
            int r3 = org.lwjgl.vulkan.video.StdVideoDecodeVP9PictureInfo.POINTER_SIZE
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 16
            int r3 = org.lwjgl.vulkan.video.StdVideoDecodeVP9PictureInfo.POINTER_SIZE
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 17
            int r3 = org.lwjgl.vulkan.video.StdVideoDecodeVP9PictureInfo.POINTER_SIZE
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            org.lwjgl.system.Struct$Layout r0 = __struct(r0)
            r6 = r0
            r0 = r6
            int r0 = r0.getSize()
            org.lwjgl.vulkan.video.StdVideoDecodeVP9PictureInfo.SIZEOF = r0
            r0 = r6
            int r0 = r0.getAlignment()
            org.lwjgl.vulkan.video.StdVideoDecodeVP9PictureInfo.ALIGNOF = r0
            r0 = r6
            r1 = 0
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.video.StdVideoDecodeVP9PictureInfo.FLAGS = r0
            r0 = r6
            r1 = 1
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.video.StdVideoDecodeVP9PictureInfo.PROFILE = r0
            r0 = r6
            r1 = 2
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.video.StdVideoDecodeVP9PictureInfo.FRAME_TYPE = r0
            r0 = r6
            r1 = 3
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.video.StdVideoDecodeVP9PictureInfo.FRAME_CONTEXT_IDX = r0
            r0 = r6
            r1 = 4
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.video.StdVideoDecodeVP9PictureInfo.RESET_FRAME_CONTEXT = r0
            r0 = r6
            r1 = 5
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.video.StdVideoDecodeVP9PictureInfo.REFRESH_FRAME_FLAGS = r0
            r0 = r6
            r1 = 6
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.video.StdVideoDecodeVP9PictureInfo.REF_FRAME_SIGN_BIAS_MASK = r0
            r0 = r6
            r1 = 7
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.video.StdVideoDecodeVP9PictureInfo.INTERPOLATION_FILTER = r0
            r0 = r6
            r1 = 8
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.video.StdVideoDecodeVP9PictureInfo.BASE_Q_IDX = r0
            r0 = r6
            r1 = 9
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.video.StdVideoDecodeVP9PictureInfo.DELTA_Q_Y_DC = r0
            r0 = r6
            r1 = 10
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.video.StdVideoDecodeVP9PictureInfo.DELTA_Q_UV_DC = r0
            r0 = r6
            r1 = 11
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.video.StdVideoDecodeVP9PictureInfo.DELTA_Q_UV_AC = r0
            r0 = r6
            r1 = 12
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.video.StdVideoDecodeVP9PictureInfo.TILE_COLS_LOG2 = r0
            r0 = r6
            r1 = 13
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.video.StdVideoDecodeVP9PictureInfo.TILE_ROWS_LOG2 = r0
            r0 = r6
            r1 = 14
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.video.StdVideoDecodeVP9PictureInfo.RESERVED1 = r0
            r0 = r6
            r1 = 15
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.video.StdVideoDecodeVP9PictureInfo.PCOLORCONFIG = r0
            r0 = r6
            r1 = 16
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.video.StdVideoDecodeVP9PictureInfo.PLOOPFILTER = r0
            r0 = r6
            r1 = 17
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.video.StdVideoDecodeVP9PictureInfo.PSEGMENTATION = r0
            return
    }
}
