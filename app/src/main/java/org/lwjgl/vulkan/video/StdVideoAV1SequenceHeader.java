package org.lwjgl.vulkan.video;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/video/StdVideoAV1SequenceHeader.class */
public class StdVideoAV1SequenceHeader extends org.lwjgl.system.Struct<org.lwjgl.vulkan.video.StdVideoAV1SequenceHeader> implements org.lwjgl.system.NativeResource {
    public static final int SIZEOF = 0;
    public static final int ALIGNOF = 0;
    public static final int FLAGS = 0;
    public static final int SEQ_PROFILE = 0;
    public static final int FRAME_WIDTH_BITS_MINUS_1 = 0;
    public static final int FRAME_HEIGHT_BITS_MINUS_1 = 0;
    public static final int MAX_FRAME_WIDTH_MINUS_1 = 0;
    public static final int MAX_FRAME_HEIGHT_MINUS_1 = 0;
    public static final int DELTA_FRAME_ID_LENGTH_MINUS_2 = 0;
    public static final int ADDITIONAL_FRAME_ID_LENGTH_MINUS_1 = 0;
    public static final int ORDER_HINT_BITS_MINUS_1 = 0;
    public static final int SEQ_FORCE_INTEGER_MV = 0;
    public static final int SEQ_FORCE_SCREEN_CONTENT_TOOLS = 0;
    public static final int RESERVED1 = 0;
    public static final int PCOLORCONFIG = 0;
    public static final int PTIMINGINFO = 0;

    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/video/StdVideoAV1SequenceHeader$Buffer.class */
    public static class Buffer extends org.lwjgl.system.StructBuffer<org.lwjgl.vulkan.video.StdVideoAV1SequenceHeader, org.lwjgl.vulkan.video.StdVideoAV1SequenceHeader.Buffer> implements org.lwjgl.system.NativeResource {
        private static final org.lwjgl.vulkan.video.StdVideoAV1SequenceHeader ELEMENT_FACTORY = null;

        public Buffer(java.nio.ByteBuffer r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r6
                int r2 = r2.remaining()
                int r3 = org.lwjgl.vulkan.video.StdVideoAV1SequenceHeader.SIZEOF
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
        protected org.lwjgl.vulkan.video.StdVideoAV1SequenceHeader.Buffer self() {
                r2 = this;
                r0 = r2
                return r0
        }

        protected org.lwjgl.vulkan.video.StdVideoAV1SequenceHeader.Buffer create(long r11, java.nio.ByteBuffer r13, int r14, int r15, int r16, int r17) {
                r10 = this;
                org.lwjgl.vulkan.video.StdVideoAV1SequenceHeader$Buffer r0 = new org.lwjgl.vulkan.video.StdVideoAV1SequenceHeader$Buffer
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
        protected org.lwjgl.vulkan.video.StdVideoAV1SequenceHeader getElementFactory() {
                r2 = this;
                org.lwjgl.vulkan.video.StdVideoAV1SequenceHeader r0 = org.lwjgl.vulkan.video.StdVideoAV1SequenceHeader.Buffer.ELEMENT_FACTORY
                return r0
        }

        public org.lwjgl.vulkan.video.StdVideoAV1SequenceHeaderFlags flags() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                org.lwjgl.vulkan.video.StdVideoAV1SequenceHeaderFlags r0 = org.lwjgl.vulkan.video.StdVideoAV1SequenceHeader.nflags(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("StdVideoAV1Profile")
        public int seq_profile() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.video.StdVideoAV1SequenceHeader.nseq_profile(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint8_t")
        public byte frame_width_bits_minus_1() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                byte r0 = org.lwjgl.vulkan.video.StdVideoAV1SequenceHeader.nframe_width_bits_minus_1(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint8_t")
        public byte frame_height_bits_minus_1() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                byte r0 = org.lwjgl.vulkan.video.StdVideoAV1SequenceHeader.nframe_height_bits_minus_1(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint16_t")
        public short max_frame_width_minus_1() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                short r0 = org.lwjgl.vulkan.video.StdVideoAV1SequenceHeader.nmax_frame_width_minus_1(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint16_t")
        public short max_frame_height_minus_1() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                short r0 = org.lwjgl.vulkan.video.StdVideoAV1SequenceHeader.nmax_frame_height_minus_1(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint8_t")
        public byte delta_frame_id_length_minus_2() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                byte r0 = org.lwjgl.vulkan.video.StdVideoAV1SequenceHeader.ndelta_frame_id_length_minus_2(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint8_t")
        public byte additional_frame_id_length_minus_1() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                byte r0 = org.lwjgl.vulkan.video.StdVideoAV1SequenceHeader.nadditional_frame_id_length_minus_1(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint8_t")
        public byte order_hint_bits_minus_1() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                byte r0 = org.lwjgl.vulkan.video.StdVideoAV1SequenceHeader.norder_hint_bits_minus_1(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint8_t")
        public byte seq_force_integer_mv() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                byte r0 = org.lwjgl.vulkan.video.StdVideoAV1SequenceHeader.nseq_force_integer_mv(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint8_t")
        public byte seq_force_screen_content_tools() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                byte r0 = org.lwjgl.vulkan.video.StdVideoAV1SequenceHeader.nseq_force_screen_content_tools(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("StdVideoAV1ColorConfig const *")
        public org.lwjgl.vulkan.video.StdVideoAV1ColorConfig pColorConfig() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                org.lwjgl.vulkan.video.StdVideoAV1ColorConfig r0 = org.lwjgl.vulkan.video.StdVideoAV1SequenceHeader.npColorConfig(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("StdVideoAV1TimingInfo const *")
        public org.lwjgl.vulkan.video.StdVideoAV1TimingInfo pTimingInfo() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                org.lwjgl.vulkan.video.StdVideoAV1TimingInfo r0 = org.lwjgl.vulkan.video.StdVideoAV1SequenceHeader.npTimingInfo(r0)
                return r0
        }

        public org.lwjgl.vulkan.video.StdVideoAV1SequenceHeader.Buffer flags(org.lwjgl.vulkan.video.StdVideoAV1SequenceHeaderFlags r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.video.StdVideoAV1SequenceHeader.nflags(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.video.StdVideoAV1SequenceHeader.Buffer flags(java.util.function.Consumer<org.lwjgl.vulkan.video.StdVideoAV1SequenceHeaderFlags> r4) {
                r3 = this;
                r0 = r4
                r1 = r3
                org.lwjgl.vulkan.video.StdVideoAV1SequenceHeaderFlags r1 = r1.flags()
                r0.accept(r1)
                r0 = r3
                return r0
        }

        public org.lwjgl.vulkan.video.StdVideoAV1SequenceHeader.Buffer seq_profile(@org.lwjgl.system.NativeType("StdVideoAV1Profile") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.video.StdVideoAV1SequenceHeader.nseq_profile(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.video.StdVideoAV1SequenceHeader.Buffer frame_width_bits_minus_1(@org.lwjgl.system.NativeType("uint8_t") byte r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.video.StdVideoAV1SequenceHeader.nframe_width_bits_minus_1(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.video.StdVideoAV1SequenceHeader.Buffer frame_height_bits_minus_1(@org.lwjgl.system.NativeType("uint8_t") byte r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.video.StdVideoAV1SequenceHeader.nframe_height_bits_minus_1(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.video.StdVideoAV1SequenceHeader.Buffer max_frame_width_minus_1(@org.lwjgl.system.NativeType("uint16_t") short r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.video.StdVideoAV1SequenceHeader.nmax_frame_width_minus_1(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.video.StdVideoAV1SequenceHeader.Buffer max_frame_height_minus_1(@org.lwjgl.system.NativeType("uint16_t") short r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.video.StdVideoAV1SequenceHeader.nmax_frame_height_minus_1(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.video.StdVideoAV1SequenceHeader.Buffer delta_frame_id_length_minus_2(@org.lwjgl.system.NativeType("uint8_t") byte r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.video.StdVideoAV1SequenceHeader.ndelta_frame_id_length_minus_2(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.video.StdVideoAV1SequenceHeader.Buffer additional_frame_id_length_minus_1(@org.lwjgl.system.NativeType("uint8_t") byte r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.video.StdVideoAV1SequenceHeader.nadditional_frame_id_length_minus_1(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.video.StdVideoAV1SequenceHeader.Buffer order_hint_bits_minus_1(@org.lwjgl.system.NativeType("uint8_t") byte r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.video.StdVideoAV1SequenceHeader.norder_hint_bits_minus_1(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.video.StdVideoAV1SequenceHeader.Buffer seq_force_integer_mv(@org.lwjgl.system.NativeType("uint8_t") byte r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.video.StdVideoAV1SequenceHeader.nseq_force_integer_mv(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.video.StdVideoAV1SequenceHeader.Buffer seq_force_screen_content_tools(@org.lwjgl.system.NativeType("uint8_t") byte r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.video.StdVideoAV1SequenceHeader.nseq_force_screen_content_tools(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.video.StdVideoAV1SequenceHeader.Buffer pColorConfig(@org.lwjgl.system.NativeType("StdVideoAV1ColorConfig const *") org.lwjgl.vulkan.video.StdVideoAV1ColorConfig r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.video.StdVideoAV1SequenceHeader.npColorConfig(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.video.StdVideoAV1SequenceHeader.Buffer pTimingInfo(@org.lwjgl.system.NativeType("StdVideoAV1TimingInfo const *") org.lwjgl.vulkan.video.StdVideoAV1TimingInfo r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.video.StdVideoAV1SequenceHeader.npTimingInfo(r0, r1)
                r0 = r4
                return r0
        }

        @Override // org.lwjgl.system.StructBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.Struct getElementFactory() {
                r2 = this;
                r0 = r2
                org.lwjgl.vulkan.video.StdVideoAV1SequenceHeader r0 = r0.getElementFactory()
                return r0
        }

        /* JADX INFO: renamed from: create, reason: collision with other method in class */
        protected /* bridge */ /* synthetic */ org.lwjgl.system.CustomBuffer m7370create(long r10, java.nio.ByteBuffer r12, int r13, int r14, int r15, int r16) {
                r9 = this;
                r0 = r9
                r1 = r10
                r2 = r12
                r3 = r13
                r4 = r14
                r5 = r15
                r6 = r16
                org.lwjgl.vulkan.video.StdVideoAV1SequenceHeader$Buffer r0 = r0.create(r1, r2, r3, r4, r5, r6)
                return r0
        }

        @Override // org.lwjgl.system.CustomBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.CustomBuffer self() {
                r2 = this;
                r0 = r2
                org.lwjgl.vulkan.video.StdVideoAV1SequenceHeader$Buffer r0 = r0.self()
                return r0
        }

        static {
                r0 = -1
                org.lwjgl.vulkan.video.StdVideoAV1SequenceHeader r0 = org.lwjgl.vulkan.video.StdVideoAV1SequenceHeader.create(r0)
                org.lwjgl.vulkan.video.StdVideoAV1SequenceHeader.Buffer.ELEMENT_FACTORY = r0
                return
        }
    }

    protected StdVideoAV1SequenceHeader(long r6, java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    protected org.lwjgl.vulkan.video.StdVideoAV1SequenceHeader create(long r7, java.nio.ByteBuffer r9) {
            r6 = this;
            org.lwjgl.vulkan.video.StdVideoAV1SequenceHeader r0 = new org.lwjgl.vulkan.video.StdVideoAV1SequenceHeader
            r1 = r0
            r2 = r7
            r3 = r9
            r1.<init>(r2, r3)
            return r0
    }

    public StdVideoAV1SequenceHeader(java.nio.ByteBuffer r7) {
            r6 = this;
            r0 = r6
            r1 = r7
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            r2 = r7
            int r3 = org.lwjgl.vulkan.video.StdVideoAV1SequenceHeader.SIZEOF
            java.nio.ByteBuffer r2 = __checkContainer(r2, r3)
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
            r2 = this;
            int r0 = org.lwjgl.vulkan.video.StdVideoAV1SequenceHeader.SIZEOF
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoAV1SequenceHeaderFlags flags() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            org.lwjgl.vulkan.video.StdVideoAV1SequenceHeaderFlags r0 = nflags(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("StdVideoAV1Profile")
    public int seq_profile() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nseq_profile(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("uint8_t")
    public byte frame_width_bits_minus_1() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            byte r0 = nframe_width_bits_minus_1(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("uint8_t")
    public byte frame_height_bits_minus_1() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            byte r0 = nframe_height_bits_minus_1(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("uint16_t")
    public short max_frame_width_minus_1() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            short r0 = nmax_frame_width_minus_1(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("uint16_t")
    public short max_frame_height_minus_1() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            short r0 = nmax_frame_height_minus_1(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("uint8_t")
    public byte delta_frame_id_length_minus_2() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            byte r0 = ndelta_frame_id_length_minus_2(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("uint8_t")
    public byte additional_frame_id_length_minus_1() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            byte r0 = nadditional_frame_id_length_minus_1(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("uint8_t")
    public byte order_hint_bits_minus_1() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            byte r0 = norder_hint_bits_minus_1(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("uint8_t")
    public byte seq_force_integer_mv() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            byte r0 = nseq_force_integer_mv(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("uint8_t")
    public byte seq_force_screen_content_tools() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            byte r0 = nseq_force_screen_content_tools(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("StdVideoAV1ColorConfig const *")
    public org.lwjgl.vulkan.video.StdVideoAV1ColorConfig pColorConfig() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            org.lwjgl.vulkan.video.StdVideoAV1ColorConfig r0 = npColorConfig(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("StdVideoAV1TimingInfo const *")
    public org.lwjgl.vulkan.video.StdVideoAV1TimingInfo pTimingInfo() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            org.lwjgl.vulkan.video.StdVideoAV1TimingInfo r0 = npTimingInfo(r0)
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoAV1SequenceHeader flags(org.lwjgl.vulkan.video.StdVideoAV1SequenceHeaderFlags r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nflags(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoAV1SequenceHeader flags(java.util.function.Consumer<org.lwjgl.vulkan.video.StdVideoAV1SequenceHeaderFlags> r4) {
            r3 = this;
            r0 = r4
            r1 = r3
            org.lwjgl.vulkan.video.StdVideoAV1SequenceHeaderFlags r1 = r1.flags()
            r0.accept(r1)
            r0 = r3
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoAV1SequenceHeader seq_profile(@org.lwjgl.system.NativeType("StdVideoAV1Profile") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nseq_profile(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoAV1SequenceHeader frame_width_bits_minus_1(@org.lwjgl.system.NativeType("uint8_t") byte r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nframe_width_bits_minus_1(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoAV1SequenceHeader frame_height_bits_minus_1(@org.lwjgl.system.NativeType("uint8_t") byte r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nframe_height_bits_minus_1(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoAV1SequenceHeader max_frame_width_minus_1(@org.lwjgl.system.NativeType("uint16_t") short r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nmax_frame_width_minus_1(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoAV1SequenceHeader max_frame_height_minus_1(@org.lwjgl.system.NativeType("uint16_t") short r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nmax_frame_height_minus_1(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoAV1SequenceHeader delta_frame_id_length_minus_2(@org.lwjgl.system.NativeType("uint8_t") byte r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            ndelta_frame_id_length_minus_2(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoAV1SequenceHeader additional_frame_id_length_minus_1(@org.lwjgl.system.NativeType("uint8_t") byte r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nadditional_frame_id_length_minus_1(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoAV1SequenceHeader order_hint_bits_minus_1(@org.lwjgl.system.NativeType("uint8_t") byte r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            norder_hint_bits_minus_1(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoAV1SequenceHeader seq_force_integer_mv(@org.lwjgl.system.NativeType("uint8_t") byte r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nseq_force_integer_mv(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoAV1SequenceHeader seq_force_screen_content_tools(@org.lwjgl.system.NativeType("uint8_t") byte r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nseq_force_screen_content_tools(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoAV1SequenceHeader pColorConfig(@org.lwjgl.system.NativeType("StdVideoAV1ColorConfig const *") org.lwjgl.vulkan.video.StdVideoAV1ColorConfig r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            npColorConfig(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoAV1SequenceHeader pTimingInfo(@org.lwjgl.system.NativeType("StdVideoAV1TimingInfo const *") org.lwjgl.vulkan.video.StdVideoAV1TimingInfo r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            npTimingInfo(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoAV1SequenceHeader set(org.lwjgl.vulkan.video.StdVideoAV1SequenceHeaderFlags r4, int r5, byte r6, byte r7, short r8, short r9, byte r10, byte r11, byte r12, byte r13, byte r14, org.lwjgl.vulkan.video.StdVideoAV1ColorConfig r15, org.lwjgl.vulkan.video.StdVideoAV1TimingInfo r16) {
            r3 = this;
            r0 = r3
            r1 = r4
            org.lwjgl.vulkan.video.StdVideoAV1SequenceHeader r0 = r0.flags(r1)
            r0 = r3
            r1 = r5
            org.lwjgl.vulkan.video.StdVideoAV1SequenceHeader r0 = r0.seq_profile(r1)
            r0 = r3
            r1 = r6
            org.lwjgl.vulkan.video.StdVideoAV1SequenceHeader r0 = r0.frame_width_bits_minus_1(r1)
            r0 = r3
            r1 = r7
            org.lwjgl.vulkan.video.StdVideoAV1SequenceHeader r0 = r0.frame_height_bits_minus_1(r1)
            r0 = r3
            r1 = r8
            org.lwjgl.vulkan.video.StdVideoAV1SequenceHeader r0 = r0.max_frame_width_minus_1(r1)
            r0 = r3
            r1 = r9
            org.lwjgl.vulkan.video.StdVideoAV1SequenceHeader r0 = r0.max_frame_height_minus_1(r1)
            r0 = r3
            r1 = r10
            org.lwjgl.vulkan.video.StdVideoAV1SequenceHeader r0 = r0.delta_frame_id_length_minus_2(r1)
            r0 = r3
            r1 = r11
            org.lwjgl.vulkan.video.StdVideoAV1SequenceHeader r0 = r0.additional_frame_id_length_minus_1(r1)
            r0 = r3
            r1 = r12
            org.lwjgl.vulkan.video.StdVideoAV1SequenceHeader r0 = r0.order_hint_bits_minus_1(r1)
            r0 = r3
            r1 = r13
            org.lwjgl.vulkan.video.StdVideoAV1SequenceHeader r0 = r0.seq_force_integer_mv(r1)
            r0 = r3
            r1 = r14
            org.lwjgl.vulkan.video.StdVideoAV1SequenceHeader r0 = r0.seq_force_screen_content_tools(r1)
            r0 = r3
            r1 = r15
            org.lwjgl.vulkan.video.StdVideoAV1SequenceHeader r0 = r0.pColorConfig(r1)
            r0 = r3
            r1 = r16
            org.lwjgl.vulkan.video.StdVideoAV1SequenceHeader r0 = r0.pTimingInfo(r1)
            r0 = r3
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoAV1SequenceHeader set(org.lwjgl.vulkan.video.StdVideoAV1SequenceHeader r8) {
            r7 = this;
            r0 = r8
            long r0 = r0.address()
            r1 = r7
            long r1 = r1.address()
            int r2 = org.lwjgl.vulkan.video.StdVideoAV1SequenceHeader.SIZEOF
            long r2 = (long) r2
            org.lwjgl.system.MemoryUtil.memCopy(r0, r1, r2)
            r0 = r7
            return r0
    }

    public static org.lwjgl.vulkan.video.StdVideoAV1SequenceHeader malloc() {
            org.lwjgl.vulkan.video.StdVideoAV1SequenceHeader r0 = new org.lwjgl.vulkan.video.StdVideoAV1SequenceHeader
            r1 = r0
            int r2 = org.lwjgl.vulkan.video.StdVideoAV1SequenceHeader.SIZEOF
            long r2 = (long) r2
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.video.StdVideoAV1SequenceHeader calloc() {
            org.lwjgl.vulkan.video.StdVideoAV1SequenceHeader r0 = new org.lwjgl.vulkan.video.StdVideoAV1SequenceHeader
            r1 = r0
            r2 = 1
            int r3 = org.lwjgl.vulkan.video.StdVideoAV1SequenceHeader.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.video.StdVideoAV1SequenceHeader create() {
            int r0 = org.lwjgl.vulkan.video.StdVideoAV1SequenceHeader.SIZEOF
            java.nio.ByteBuffer r0 = org.lwjgl.BufferUtils.createByteBuffer(r0)
            r6 = r0
            org.lwjgl.vulkan.video.StdVideoAV1SequenceHeader r0 = new org.lwjgl.vulkan.video.StdVideoAV1SequenceHeader
            r1 = r0
            r2 = r6
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.video.StdVideoAV1SequenceHeader create(long r6) {
            org.lwjgl.vulkan.video.StdVideoAV1SequenceHeader r0 = new org.lwjgl.vulkan.video.StdVideoAV1SequenceHeader
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.video.StdVideoAV1SequenceHeader createSafe(long r6) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.vulkan.video.StdVideoAV1SequenceHeader r0 = new org.lwjgl.vulkan.video.StdVideoAV1SequenceHeader
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static org.lwjgl.vulkan.video.StdVideoAV1SequenceHeader.Buffer malloc(int r6) {
            org.lwjgl.vulkan.video.StdVideoAV1SequenceHeader$Buffer r0 = new org.lwjgl.vulkan.video.StdVideoAV1SequenceHeader$Buffer
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.vulkan.video.StdVideoAV1SequenceHeader.SIZEOF
            long r2 = __checkMalloc(r2, r3)
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.video.StdVideoAV1SequenceHeader.Buffer calloc(int r7) {
            org.lwjgl.vulkan.video.StdVideoAV1SequenceHeader$Buffer r0 = new org.lwjgl.vulkan.video.StdVideoAV1SequenceHeader$Buffer
            r1 = r0
            r2 = r7
            long r2 = (long) r2
            int r3 = org.lwjgl.vulkan.video.StdVideoAV1SequenceHeader.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.video.StdVideoAV1SequenceHeader.Buffer create(int r10) {
            r0 = r10
            int r1 = org.lwjgl.vulkan.video.StdVideoAV1SequenceHeader.SIZEOF
            java.nio.ByteBuffer r0 = __create(r0, r1)
            r11 = r0
            org.lwjgl.vulkan.video.StdVideoAV1SequenceHeader$Buffer r0 = new org.lwjgl.vulkan.video.StdVideoAV1SequenceHeader$Buffer
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

    public static org.lwjgl.vulkan.video.StdVideoAV1SequenceHeader.Buffer create(long r6, int r8) {
            org.lwjgl.vulkan.video.StdVideoAV1SequenceHeader$Buffer r0 = new org.lwjgl.vulkan.video.StdVideoAV1SequenceHeader$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.video.StdVideoAV1SequenceHeader.Buffer createSafe(long r6, int r8) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.vulkan.video.StdVideoAV1SequenceHeader$Buffer r0 = new org.lwjgl.vulkan.video.StdVideoAV1SequenceHeader$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static org.lwjgl.vulkan.video.StdVideoAV1SequenceHeader malloc(org.lwjgl.system.MemoryStack r6) {
            org.lwjgl.vulkan.video.StdVideoAV1SequenceHeader r0 = new org.lwjgl.vulkan.video.StdVideoAV1SequenceHeader
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.vulkan.video.StdVideoAV1SequenceHeader.ALIGNOF
            int r4 = org.lwjgl.vulkan.video.StdVideoAV1SequenceHeader.SIZEOF
            long r2 = r2.nmalloc(r3, r4)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.video.StdVideoAV1SequenceHeader calloc(org.lwjgl.system.MemoryStack r7) {
            org.lwjgl.vulkan.video.StdVideoAV1SequenceHeader r0 = new org.lwjgl.vulkan.video.StdVideoAV1SequenceHeader
            r1 = r0
            r2 = r7
            int r3 = org.lwjgl.vulkan.video.StdVideoAV1SequenceHeader.ALIGNOF
            r4 = 1
            int r5 = org.lwjgl.vulkan.video.StdVideoAV1SequenceHeader.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.video.StdVideoAV1SequenceHeader.Buffer malloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.vulkan.video.StdVideoAV1SequenceHeader$Buffer r0 = new org.lwjgl.vulkan.video.StdVideoAV1SequenceHeader$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.vulkan.video.StdVideoAV1SequenceHeader.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.vulkan.video.StdVideoAV1SequenceHeader.SIZEOF
            int r4 = r4 * r5
            long r2 = r2.nmalloc(r3, r4)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.video.StdVideoAV1SequenceHeader.Buffer calloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.vulkan.video.StdVideoAV1SequenceHeader$Buffer r0 = new org.lwjgl.vulkan.video.StdVideoAV1SequenceHeader$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.vulkan.video.StdVideoAV1SequenceHeader.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.vulkan.video.StdVideoAV1SequenceHeader.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.video.StdVideoAV1SequenceHeaderFlags nflags(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.video.StdVideoAV1SequenceHeader.FLAGS
            long r1 = (long) r1
            long r0 = r0 + r1
            org.lwjgl.vulkan.video.StdVideoAV1SequenceHeaderFlags r0 = org.lwjgl.vulkan.video.StdVideoAV1SequenceHeaderFlags.create(r0)
            return r0
    }

    public static int nseq_profile(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.video.StdVideoAV1SequenceHeader.SEQ_PROFILE
            long r1 = (long) r1
            long r0 = r0 + r1
            int r0 = org.lwjgl.system.MemoryUtil.memGetInt(r0)
            return r0
    }

    public static byte nframe_width_bits_minus_1(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.video.StdVideoAV1SequenceHeader.FRAME_WIDTH_BITS_MINUS_1
            long r1 = (long) r1
            long r0 = r0 + r1
            byte r0 = org.lwjgl.system.MemoryUtil.memGetByte(r0)
            return r0
    }

    public static byte nframe_height_bits_minus_1(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.video.StdVideoAV1SequenceHeader.FRAME_HEIGHT_BITS_MINUS_1
            long r1 = (long) r1
            long r0 = r0 + r1
            byte r0 = org.lwjgl.system.MemoryUtil.memGetByte(r0)
            return r0
    }

    public static short nmax_frame_width_minus_1(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.video.StdVideoAV1SequenceHeader.MAX_FRAME_WIDTH_MINUS_1
            long r1 = (long) r1
            long r0 = r0 + r1
            short r0 = org.lwjgl.system.MemoryUtil.memGetShort(r0)
            return r0
    }

    public static short nmax_frame_height_minus_1(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.video.StdVideoAV1SequenceHeader.MAX_FRAME_HEIGHT_MINUS_1
            long r1 = (long) r1
            long r0 = r0 + r1
            short r0 = org.lwjgl.system.MemoryUtil.memGetShort(r0)
            return r0
    }

    public static byte ndelta_frame_id_length_minus_2(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.video.StdVideoAV1SequenceHeader.DELTA_FRAME_ID_LENGTH_MINUS_2
            long r1 = (long) r1
            long r0 = r0 + r1
            byte r0 = org.lwjgl.system.MemoryUtil.memGetByte(r0)
            return r0
    }

    public static byte nadditional_frame_id_length_minus_1(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.video.StdVideoAV1SequenceHeader.ADDITIONAL_FRAME_ID_LENGTH_MINUS_1
            long r1 = (long) r1
            long r0 = r0 + r1
            byte r0 = org.lwjgl.system.MemoryUtil.memGetByte(r0)
            return r0
    }

    public static byte norder_hint_bits_minus_1(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.video.StdVideoAV1SequenceHeader.ORDER_HINT_BITS_MINUS_1
            long r1 = (long) r1
            long r0 = r0 + r1
            byte r0 = org.lwjgl.system.MemoryUtil.memGetByte(r0)
            return r0
    }

    public static byte nseq_force_integer_mv(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.video.StdVideoAV1SequenceHeader.SEQ_FORCE_INTEGER_MV
            long r1 = (long) r1
            long r0 = r0 + r1
            byte r0 = org.lwjgl.system.MemoryUtil.memGetByte(r0)
            return r0
    }

    public static byte nseq_force_screen_content_tools(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.video.StdVideoAV1SequenceHeader.SEQ_FORCE_SCREEN_CONTENT_TOOLS
            long r1 = (long) r1
            long r0 = r0 + r1
            byte r0 = org.lwjgl.system.MemoryUtil.memGetByte(r0)
            return r0
    }

    public static java.nio.ByteBuffer nreserved1(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.video.StdVideoAV1SequenceHeader.RESERVED1
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = 5
            java.nio.ByteBuffer r0 = org.lwjgl.system.MemoryUtil.memByteBuffer(r0, r1)
            return r0
    }

    public static byte nreserved1(long r7, int r9) {
            r0 = r7
            int r1 = org.lwjgl.vulkan.video.StdVideoAV1SequenceHeader.RESERVED1
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r9
            r2 = 5
            long r1 = org.lwjgl.system.Checks.check(r1, r2)
            r2 = 1
            long r1 = r1 * r2
            long r0 = r0 + r1
            byte r0 = org.lwjgl.system.MemoryUtil.memGetByte(r0)
            return r0
    }

    public static org.lwjgl.vulkan.video.StdVideoAV1ColorConfig npColorConfig(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.video.StdVideoAV1SequenceHeader.PCOLORCONFIG
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            org.lwjgl.vulkan.video.StdVideoAV1ColorConfig r0 = org.lwjgl.vulkan.video.StdVideoAV1ColorConfig.create(r0)
            return r0
    }

    public static org.lwjgl.vulkan.video.StdVideoAV1TimingInfo npTimingInfo(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.video.StdVideoAV1SequenceHeader.PTIMINGINFO
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            org.lwjgl.vulkan.video.StdVideoAV1TimingInfo r0 = org.lwjgl.vulkan.video.StdVideoAV1TimingInfo.create(r0)
            return r0
    }

    public static void nflags(long r7, org.lwjgl.vulkan.video.StdVideoAV1SequenceHeaderFlags r9) {
            r0 = r9
            long r0 = r0.address()
            r1 = r7
            int r2 = org.lwjgl.vulkan.video.StdVideoAV1SequenceHeader.FLAGS
            long r2 = (long) r2
            long r1 = r1 + r2
            int r2 = org.lwjgl.vulkan.video.StdVideoAV1SequenceHeaderFlags.SIZEOF
            long r2 = (long) r2
            org.lwjgl.system.MemoryUtil.memCopy(r0, r1, r2)
            return
    }

    public static void nseq_profile(long r5, int r7) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.video.StdVideoAV1SequenceHeader.SEQ_PROFILE
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            org.lwjgl.system.MemoryUtil.memPutInt(r0, r1)
            return
    }

    public static void nframe_width_bits_minus_1(long r5, byte r7) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.video.StdVideoAV1SequenceHeader.FRAME_WIDTH_BITS_MINUS_1
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            org.lwjgl.system.MemoryUtil.memPutByte(r0, r1)
            return
    }

    public static void nframe_height_bits_minus_1(long r5, byte r7) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.video.StdVideoAV1SequenceHeader.FRAME_HEIGHT_BITS_MINUS_1
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            org.lwjgl.system.MemoryUtil.memPutByte(r0, r1)
            return
    }

    public static void nmax_frame_width_minus_1(long r5, short r7) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.video.StdVideoAV1SequenceHeader.MAX_FRAME_WIDTH_MINUS_1
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            org.lwjgl.system.MemoryUtil.memPutShort(r0, r1)
            return
    }

    public static void nmax_frame_height_minus_1(long r5, short r7) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.video.StdVideoAV1SequenceHeader.MAX_FRAME_HEIGHT_MINUS_1
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            org.lwjgl.system.MemoryUtil.memPutShort(r0, r1)
            return
    }

    public static void ndelta_frame_id_length_minus_2(long r5, byte r7) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.video.StdVideoAV1SequenceHeader.DELTA_FRAME_ID_LENGTH_MINUS_2
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            org.lwjgl.system.MemoryUtil.memPutByte(r0, r1)
            return
    }

    public static void nadditional_frame_id_length_minus_1(long r5, byte r7) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.video.StdVideoAV1SequenceHeader.ADDITIONAL_FRAME_ID_LENGTH_MINUS_1
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            org.lwjgl.system.MemoryUtil.memPutByte(r0, r1)
            return
    }

    public static void norder_hint_bits_minus_1(long r5, byte r7) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.video.StdVideoAV1SequenceHeader.ORDER_HINT_BITS_MINUS_1
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            org.lwjgl.system.MemoryUtil.memPutByte(r0, r1)
            return
    }

    public static void nseq_force_integer_mv(long r5, byte r7) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.video.StdVideoAV1SequenceHeader.SEQ_FORCE_INTEGER_MV
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            org.lwjgl.system.MemoryUtil.memPutByte(r0, r1)
            return
    }

    public static void nseq_force_screen_content_tools(long r5, byte r7) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.video.StdVideoAV1SequenceHeader.SEQ_FORCE_SCREEN_CONTENT_TOOLS
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            org.lwjgl.system.MemoryUtil.memPutByte(r0, r1)
            return
    }

    public static void nreserved1(long r7, java.nio.ByteBuffer r9) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r9
            r1 = 5
            org.lwjgl.system.Checks.checkGT(r0, r1)
        Lb:
            r0 = r9
            long r0 = org.lwjgl.system.MemoryUtil.memAddress(r0)
            r1 = r7
            int r2 = org.lwjgl.vulkan.video.StdVideoAV1SequenceHeader.RESERVED1
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

    public static void nreserved1(long r7, int r9, byte r10) {
            r0 = r7
            int r1 = org.lwjgl.vulkan.video.StdVideoAV1SequenceHeader.RESERVED1
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r9
            r2 = 5
            long r1 = org.lwjgl.system.Checks.check(r1, r2)
            r2 = 1
            long r1 = r1 * r2
            long r0 = r0 + r1
            r1 = r10
            org.lwjgl.system.MemoryUtil.memPutByte(r0, r1)
            return
    }

    public static void npColorConfig(long r5, org.lwjgl.vulkan.video.StdVideoAV1ColorConfig r7) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.video.StdVideoAV1SequenceHeader.PCOLORCONFIG
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            long r1 = r1.address()
            org.lwjgl.system.MemoryUtil.memPutAddress(r0, r1)
            return
    }

    public static void npTimingInfo(long r5, org.lwjgl.vulkan.video.StdVideoAV1TimingInfo r7) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.video.StdVideoAV1SequenceHeader.PTIMINGINFO
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            long r1 = r1.address()
            org.lwjgl.system.MemoryUtil.memPutAddress(r0, r1)
            return
    }

    public static void validate(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.video.StdVideoAV1SequenceHeader.PCOLORCONFIG
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r5
            int r1 = org.lwjgl.vulkan.video.StdVideoAV1SequenceHeader.PTIMINGINFO
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
            org.lwjgl.vulkan.video.StdVideoAV1SequenceHeader r0 = r0.create(r1, r2)
            return r0
    }

    static {
            r0 = 14
            org.lwjgl.system.Struct$Member[] r0 = new org.lwjgl.system.Struct.Member[r0]
            r1 = r0
            r2 = 0
            int r3 = org.lwjgl.vulkan.video.StdVideoAV1SequenceHeaderFlags.SIZEOF
            int r4 = org.lwjgl.vulkan.video.StdVideoAV1SequenceHeaderFlags.ALIGNOF
            org.lwjgl.system.Struct$Member r3 = __member(r3, r4)
            r1[r2] = r3
            r1 = r0
            r2 = 1
            r3 = 4
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
            r3 = 2
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 5
            r3 = 2
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
            r4 = 5
            org.lwjgl.system.Struct$Member r3 = __array(r3, r4)
            r1[r2] = r3
            r1 = r0
            r2 = 12
            int r3 = org.lwjgl.vulkan.video.StdVideoAV1SequenceHeader.POINTER_SIZE
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 13
            int r3 = org.lwjgl.vulkan.video.StdVideoAV1SequenceHeader.POINTER_SIZE
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            org.lwjgl.system.Struct$Layout r0 = __struct(r0)
            r6 = r0
            r0 = r6
            int r0 = r0.getSize()
            org.lwjgl.vulkan.video.StdVideoAV1SequenceHeader.SIZEOF = r0
            r0 = r6
            int r0 = r0.getAlignment()
            org.lwjgl.vulkan.video.StdVideoAV1SequenceHeader.ALIGNOF = r0
            r0 = r6
            r1 = 0
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.video.StdVideoAV1SequenceHeader.FLAGS = r0
            r0 = r6
            r1 = 1
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.video.StdVideoAV1SequenceHeader.SEQ_PROFILE = r0
            r0 = r6
            r1 = 2
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.video.StdVideoAV1SequenceHeader.FRAME_WIDTH_BITS_MINUS_1 = r0
            r0 = r6
            r1 = 3
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.video.StdVideoAV1SequenceHeader.FRAME_HEIGHT_BITS_MINUS_1 = r0
            r0 = r6
            r1 = 4
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.video.StdVideoAV1SequenceHeader.MAX_FRAME_WIDTH_MINUS_1 = r0
            r0 = r6
            r1 = 5
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.video.StdVideoAV1SequenceHeader.MAX_FRAME_HEIGHT_MINUS_1 = r0
            r0 = r6
            r1 = 6
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.video.StdVideoAV1SequenceHeader.DELTA_FRAME_ID_LENGTH_MINUS_2 = r0
            r0 = r6
            r1 = 7
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.video.StdVideoAV1SequenceHeader.ADDITIONAL_FRAME_ID_LENGTH_MINUS_1 = r0
            r0 = r6
            r1 = 8
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.video.StdVideoAV1SequenceHeader.ORDER_HINT_BITS_MINUS_1 = r0
            r0 = r6
            r1 = 9
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.video.StdVideoAV1SequenceHeader.SEQ_FORCE_INTEGER_MV = r0
            r0 = r6
            r1 = 10
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.video.StdVideoAV1SequenceHeader.SEQ_FORCE_SCREEN_CONTENT_TOOLS = r0
            r0 = r6
            r1 = 11
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.video.StdVideoAV1SequenceHeader.RESERVED1 = r0
            r0 = r6
            r1 = 12
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.video.StdVideoAV1SequenceHeader.PCOLORCONFIG = r0
            r0 = r6
            r1 = 13
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.video.StdVideoAV1SequenceHeader.PTIMINGINFO = r0
            return
    }
}
