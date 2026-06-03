package org.lwjgl.vulkan.video;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/video/StdVideoH265HrdParameters.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/video/StdVideoH265HrdParameters.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/video/StdVideoH265HrdParameters.class */
public class StdVideoH265HrdParameters extends org.lwjgl.system.Struct<org.lwjgl.vulkan.video.StdVideoH265HrdParameters> implements org.lwjgl.system.NativeResource {
    public static final int SIZEOF = 0;
    public static final int ALIGNOF = 0;
    public static final int FLAGS = 0;
    public static final int TICK_DIVISOR_MINUS2 = 0;
    public static final int DU_CPB_REMOVAL_DELAY_INCREMENT_LENGTH_MINUS1 = 0;
    public static final int DPB_OUTPUT_DELAY_DU_LENGTH_MINUS1 = 0;
    public static final int BIT_RATE_SCALE = 0;
    public static final int CPB_SIZE_SCALE = 0;
    public static final int CPB_SIZE_DU_SCALE = 0;
    public static final int INITIAL_CPB_REMOVAL_DELAY_LENGTH_MINUS1 = 0;
    public static final int AU_CPB_REMOVAL_DELAY_LENGTH_MINUS1 = 0;
    public static final int DPB_OUTPUT_DELAY_LENGTH_MINUS1 = 0;
    public static final int CPB_CNT_MINUS1 = 0;
    public static final int ELEMENTAL_DURATION_IN_TC_MINUS1 = 0;
    public static final int RESERVED = 0;
    public static final int PSUBLAYERHRDPARAMETERSNAL = 0;
    public static final int PSUBLAYERHRDPARAMETERSVCL = 0;

    /* JADX WARN: Classes with same name are omitted, all sources:
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/video/StdVideoH265HrdParameters$Buffer.class
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/video/StdVideoH265HrdParameters$Buffer.class
     */
    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/video/StdVideoH265HrdParameters$Buffer.class */
    public static class Buffer extends org.lwjgl.system.StructBuffer<org.lwjgl.vulkan.video.StdVideoH265HrdParameters, org.lwjgl.vulkan.video.StdVideoH265HrdParameters.Buffer> implements org.lwjgl.system.NativeResource {
        private static final org.lwjgl.vulkan.video.StdVideoH265HrdParameters ELEMENT_FACTORY = null;

        public Buffer(java.nio.ByteBuffer r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r6
                int r2 = r2.remaining()
                int r3 = org.lwjgl.vulkan.video.StdVideoH265HrdParameters.SIZEOF
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
        protected org.lwjgl.vulkan.video.StdVideoH265HrdParameters.Buffer self() {
                r2 = this;
                r0 = r2
                return r0
        }

        @Override // org.lwjgl.system.StructBuffer
        protected org.lwjgl.vulkan.video.StdVideoH265HrdParameters getElementFactory() {
                r2 = this;
                org.lwjgl.vulkan.video.StdVideoH265HrdParameters r0 = org.lwjgl.vulkan.video.StdVideoH265HrdParameters.Buffer.ELEMENT_FACTORY
                return r0
        }

        public org.lwjgl.vulkan.video.StdVideoH265HrdFlags flags() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                org.lwjgl.vulkan.video.StdVideoH265HrdFlags r0 = org.lwjgl.vulkan.video.StdVideoH265HrdParameters.nflags(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint8_t")
        public byte tick_divisor_minus2() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                byte r0 = org.lwjgl.vulkan.video.StdVideoH265HrdParameters.ntick_divisor_minus2(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint8_t")
        public byte du_cpb_removal_delay_increment_length_minus1() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                byte r0 = org.lwjgl.vulkan.video.StdVideoH265HrdParameters.ndu_cpb_removal_delay_increment_length_minus1(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint8_t")
        public byte dpb_output_delay_du_length_minus1() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                byte r0 = org.lwjgl.vulkan.video.StdVideoH265HrdParameters.ndpb_output_delay_du_length_minus1(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint8_t")
        public byte bit_rate_scale() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                byte r0 = org.lwjgl.vulkan.video.StdVideoH265HrdParameters.nbit_rate_scale(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint8_t")
        public byte cpb_size_scale() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                byte r0 = org.lwjgl.vulkan.video.StdVideoH265HrdParameters.ncpb_size_scale(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint8_t")
        public byte cpb_size_du_scale() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                byte r0 = org.lwjgl.vulkan.video.StdVideoH265HrdParameters.ncpb_size_du_scale(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint8_t")
        public byte initial_cpb_removal_delay_length_minus1() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                byte r0 = org.lwjgl.vulkan.video.StdVideoH265HrdParameters.ninitial_cpb_removal_delay_length_minus1(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint8_t")
        public byte au_cpb_removal_delay_length_minus1() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                byte r0 = org.lwjgl.vulkan.video.StdVideoH265HrdParameters.nau_cpb_removal_delay_length_minus1(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint8_t")
        public byte dpb_output_delay_length_minus1() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                byte r0 = org.lwjgl.vulkan.video.StdVideoH265HrdParameters.ndpb_output_delay_length_minus1(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint8_t[STD_VIDEO_H265_SUBLAYERS_LIST_SIZE]")
        public java.nio.ByteBuffer cpb_cnt_minus1() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                java.nio.ByteBuffer r0 = org.lwjgl.vulkan.video.StdVideoH265HrdParameters.ncpb_cnt_minus1(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint8_t")
        public byte cpb_cnt_minus1(int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                byte r0 = org.lwjgl.vulkan.video.StdVideoH265HrdParameters.ncpb_cnt_minus1(r0, r1)
                return r0
        }

        @org.lwjgl.system.NativeType("uint16_t[STD_VIDEO_H265_SUBLAYERS_LIST_SIZE]")
        public java.nio.ShortBuffer elemental_duration_in_tc_minus1() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                java.nio.ShortBuffer r0 = org.lwjgl.vulkan.video.StdVideoH265HrdParameters.nelemental_duration_in_tc_minus1(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint16_t")
        public short elemental_duration_in_tc_minus1(int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                short r0 = org.lwjgl.vulkan.video.StdVideoH265HrdParameters.nelemental_duration_in_tc_minus1(r0, r1)
                return r0
        }

        @org.lwjgl.system.NativeType("StdVideoH265SubLayerHrdParameters const *")
        public org.lwjgl.vulkan.video.StdVideoH265SubLayerHrdParameters pSubLayerHrdParametersNal() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                org.lwjgl.vulkan.video.StdVideoH265SubLayerHrdParameters r0 = org.lwjgl.vulkan.video.StdVideoH265HrdParameters.npSubLayerHrdParametersNal(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("StdVideoH265SubLayerHrdParameters const *")
        public org.lwjgl.vulkan.video.StdVideoH265SubLayerHrdParameters pSubLayerHrdParametersVcl() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                org.lwjgl.vulkan.video.StdVideoH265SubLayerHrdParameters r0 = org.lwjgl.vulkan.video.StdVideoH265HrdParameters.npSubLayerHrdParametersVcl(r0)
                return r0
        }

        public org.lwjgl.vulkan.video.StdVideoH265HrdParameters.Buffer flags(org.lwjgl.vulkan.video.StdVideoH265HrdFlags r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.video.StdVideoH265HrdParameters.nflags(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.video.StdVideoH265HrdParameters.Buffer flags(java.util.function.Consumer<org.lwjgl.vulkan.video.StdVideoH265HrdFlags> r4) {
                r3 = this;
                r0 = r4
                r1 = r3
                org.lwjgl.vulkan.video.StdVideoH265HrdFlags r1 = r1.flags()
                r0.accept(r1)
                r0 = r3
                return r0
        }

        public org.lwjgl.vulkan.video.StdVideoH265HrdParameters.Buffer tick_divisor_minus2(@org.lwjgl.system.NativeType("uint8_t") byte r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.video.StdVideoH265HrdParameters.ntick_divisor_minus2(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.video.StdVideoH265HrdParameters.Buffer du_cpb_removal_delay_increment_length_minus1(@org.lwjgl.system.NativeType("uint8_t") byte r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.video.StdVideoH265HrdParameters.ndu_cpb_removal_delay_increment_length_minus1(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.video.StdVideoH265HrdParameters.Buffer dpb_output_delay_du_length_minus1(@org.lwjgl.system.NativeType("uint8_t") byte r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.video.StdVideoH265HrdParameters.ndpb_output_delay_du_length_minus1(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.video.StdVideoH265HrdParameters.Buffer bit_rate_scale(@org.lwjgl.system.NativeType("uint8_t") byte r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.video.StdVideoH265HrdParameters.nbit_rate_scale(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.video.StdVideoH265HrdParameters.Buffer cpb_size_scale(@org.lwjgl.system.NativeType("uint8_t") byte r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.video.StdVideoH265HrdParameters.ncpb_size_scale(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.video.StdVideoH265HrdParameters.Buffer cpb_size_du_scale(@org.lwjgl.system.NativeType("uint8_t") byte r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.video.StdVideoH265HrdParameters.ncpb_size_du_scale(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.video.StdVideoH265HrdParameters.Buffer initial_cpb_removal_delay_length_minus1(@org.lwjgl.system.NativeType("uint8_t") byte r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.video.StdVideoH265HrdParameters.ninitial_cpb_removal_delay_length_minus1(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.video.StdVideoH265HrdParameters.Buffer au_cpb_removal_delay_length_minus1(@org.lwjgl.system.NativeType("uint8_t") byte r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.video.StdVideoH265HrdParameters.nau_cpb_removal_delay_length_minus1(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.video.StdVideoH265HrdParameters.Buffer dpb_output_delay_length_minus1(@org.lwjgl.system.NativeType("uint8_t") byte r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.video.StdVideoH265HrdParameters.ndpb_output_delay_length_minus1(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.video.StdVideoH265HrdParameters.Buffer cpb_cnt_minus1(@org.lwjgl.system.NativeType("uint8_t[STD_VIDEO_H265_SUBLAYERS_LIST_SIZE]") java.nio.ByteBuffer r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.video.StdVideoH265HrdParameters.ncpb_cnt_minus1(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.video.StdVideoH265HrdParameters.Buffer cpb_cnt_minus1(int r6, @org.lwjgl.system.NativeType("uint8_t") byte r7) {
                r5 = this;
                r0 = r5
                long r0 = r0.address()
                r1 = r6
                r2 = r7
                org.lwjgl.vulkan.video.StdVideoH265HrdParameters.ncpb_cnt_minus1(r0, r1, r2)
                r0 = r5
                return r0
        }

        public org.lwjgl.vulkan.video.StdVideoH265HrdParameters.Buffer elemental_duration_in_tc_minus1(@org.lwjgl.system.NativeType("uint16_t[STD_VIDEO_H265_SUBLAYERS_LIST_SIZE]") java.nio.ShortBuffer r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.video.StdVideoH265HrdParameters.nelemental_duration_in_tc_minus1(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.video.StdVideoH265HrdParameters.Buffer elemental_duration_in_tc_minus1(int r6, @org.lwjgl.system.NativeType("uint16_t") short r7) {
                r5 = this;
                r0 = r5
                long r0 = r0.address()
                r1 = r6
                r2 = r7
                org.lwjgl.vulkan.video.StdVideoH265HrdParameters.nelemental_duration_in_tc_minus1(r0, r1, r2)
                r0 = r5
                return r0
        }

        public org.lwjgl.vulkan.video.StdVideoH265HrdParameters.Buffer pSubLayerHrdParametersNal(@org.lwjgl.system.NativeType("StdVideoH265SubLayerHrdParameters const *") org.lwjgl.vulkan.video.StdVideoH265SubLayerHrdParameters r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.video.StdVideoH265HrdParameters.npSubLayerHrdParametersNal(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.video.StdVideoH265HrdParameters.Buffer pSubLayerHrdParametersVcl(@org.lwjgl.system.NativeType("StdVideoH265SubLayerHrdParameters const *") org.lwjgl.vulkan.video.StdVideoH265SubLayerHrdParameters r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.video.StdVideoH265HrdParameters.npSubLayerHrdParametersVcl(r0, r1)
                r0 = r4
                return r0
        }

        @Override // org.lwjgl.system.StructBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.Struct getElementFactory() {
                r2 = this;
                r0 = r2
                org.lwjgl.vulkan.video.StdVideoH265HrdParameters r0 = r0.getElementFactory()
                return r0
        }

        @Override // org.lwjgl.system.CustomBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.CustomBuffer self() {
                r2 = this;
                r0 = r2
                org.lwjgl.vulkan.video.StdVideoH265HrdParameters$Buffer r0 = r0.self()
                return r0
        }

        static {
                r0 = -1
                org.lwjgl.vulkan.video.StdVideoH265HrdParameters r0 = org.lwjgl.vulkan.video.StdVideoH265HrdParameters.create(r0)
                org.lwjgl.vulkan.video.StdVideoH265HrdParameters.Buffer.ELEMENT_FACTORY = r0
                return
        }
    }

    protected StdVideoH265HrdParameters(long r6, @javax.annotation.Nullable java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    protected org.lwjgl.vulkan.video.StdVideoH265HrdParameters create(long r7, @javax.annotation.Nullable java.nio.ByteBuffer r9) {
            r6 = this;
            org.lwjgl.vulkan.video.StdVideoH265HrdParameters r0 = new org.lwjgl.vulkan.video.StdVideoH265HrdParameters
            r1 = r0
            r2 = r7
            r3 = r9
            r1.<init>(r2, r3)
            return r0
    }

    public StdVideoH265HrdParameters(java.nio.ByteBuffer r7) {
            r6 = this;
            r0 = r6
            r1 = r7
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            r2 = r7
            int r3 = org.lwjgl.vulkan.video.StdVideoH265HrdParameters.SIZEOF
            java.nio.ByteBuffer r2 = __checkContainer(r2, r3)
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
            r2 = this;
            int r0 = org.lwjgl.vulkan.video.StdVideoH265HrdParameters.SIZEOF
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoH265HrdFlags flags() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            org.lwjgl.vulkan.video.StdVideoH265HrdFlags r0 = nflags(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("uint8_t")
    public byte tick_divisor_minus2() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            byte r0 = ntick_divisor_minus2(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("uint8_t")
    public byte du_cpb_removal_delay_increment_length_minus1() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            byte r0 = ndu_cpb_removal_delay_increment_length_minus1(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("uint8_t")
    public byte dpb_output_delay_du_length_minus1() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            byte r0 = ndpb_output_delay_du_length_minus1(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("uint8_t")
    public byte bit_rate_scale() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            byte r0 = nbit_rate_scale(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("uint8_t")
    public byte cpb_size_scale() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            byte r0 = ncpb_size_scale(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("uint8_t")
    public byte cpb_size_du_scale() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            byte r0 = ncpb_size_du_scale(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("uint8_t")
    public byte initial_cpb_removal_delay_length_minus1() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            byte r0 = ninitial_cpb_removal_delay_length_minus1(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("uint8_t")
    public byte au_cpb_removal_delay_length_minus1() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            byte r0 = nau_cpb_removal_delay_length_minus1(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("uint8_t")
    public byte dpb_output_delay_length_minus1() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            byte r0 = ndpb_output_delay_length_minus1(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("uint8_t[STD_VIDEO_H265_SUBLAYERS_LIST_SIZE]")
    public java.nio.ByteBuffer cpb_cnt_minus1() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            java.nio.ByteBuffer r0 = ncpb_cnt_minus1(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("uint8_t")
    public byte cpb_cnt_minus1(int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            byte r0 = ncpb_cnt_minus1(r0, r1)
            return r0
    }

    @org.lwjgl.system.NativeType("uint16_t[STD_VIDEO_H265_SUBLAYERS_LIST_SIZE]")
    public java.nio.ShortBuffer elemental_duration_in_tc_minus1() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            java.nio.ShortBuffer r0 = nelemental_duration_in_tc_minus1(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("uint16_t")
    public short elemental_duration_in_tc_minus1(int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            short r0 = nelemental_duration_in_tc_minus1(r0, r1)
            return r0
    }

    @org.lwjgl.system.NativeType("StdVideoH265SubLayerHrdParameters const *")
    public org.lwjgl.vulkan.video.StdVideoH265SubLayerHrdParameters pSubLayerHrdParametersNal() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            org.lwjgl.vulkan.video.StdVideoH265SubLayerHrdParameters r0 = npSubLayerHrdParametersNal(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("StdVideoH265SubLayerHrdParameters const *")
    public org.lwjgl.vulkan.video.StdVideoH265SubLayerHrdParameters pSubLayerHrdParametersVcl() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            org.lwjgl.vulkan.video.StdVideoH265SubLayerHrdParameters r0 = npSubLayerHrdParametersVcl(r0)
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoH265HrdParameters flags(org.lwjgl.vulkan.video.StdVideoH265HrdFlags r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nflags(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoH265HrdParameters flags(java.util.function.Consumer<org.lwjgl.vulkan.video.StdVideoH265HrdFlags> r4) {
            r3 = this;
            r0 = r4
            r1 = r3
            org.lwjgl.vulkan.video.StdVideoH265HrdFlags r1 = r1.flags()
            r0.accept(r1)
            r0 = r3
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoH265HrdParameters tick_divisor_minus2(@org.lwjgl.system.NativeType("uint8_t") byte r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            ntick_divisor_minus2(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoH265HrdParameters du_cpb_removal_delay_increment_length_minus1(@org.lwjgl.system.NativeType("uint8_t") byte r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            ndu_cpb_removal_delay_increment_length_minus1(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoH265HrdParameters dpb_output_delay_du_length_minus1(@org.lwjgl.system.NativeType("uint8_t") byte r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            ndpb_output_delay_du_length_minus1(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoH265HrdParameters bit_rate_scale(@org.lwjgl.system.NativeType("uint8_t") byte r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nbit_rate_scale(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoH265HrdParameters cpb_size_scale(@org.lwjgl.system.NativeType("uint8_t") byte r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            ncpb_size_scale(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoH265HrdParameters cpb_size_du_scale(@org.lwjgl.system.NativeType("uint8_t") byte r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            ncpb_size_du_scale(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoH265HrdParameters initial_cpb_removal_delay_length_minus1(@org.lwjgl.system.NativeType("uint8_t") byte r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            ninitial_cpb_removal_delay_length_minus1(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoH265HrdParameters au_cpb_removal_delay_length_minus1(@org.lwjgl.system.NativeType("uint8_t") byte r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nau_cpb_removal_delay_length_minus1(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoH265HrdParameters dpb_output_delay_length_minus1(@org.lwjgl.system.NativeType("uint8_t") byte r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            ndpb_output_delay_length_minus1(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoH265HrdParameters cpb_cnt_minus1(@org.lwjgl.system.NativeType("uint8_t[STD_VIDEO_H265_SUBLAYERS_LIST_SIZE]") java.nio.ByteBuffer r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            ncpb_cnt_minus1(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoH265HrdParameters cpb_cnt_minus1(int r6, @org.lwjgl.system.NativeType("uint8_t") byte r7) {
            r5 = this;
            r0 = r5
            long r0 = r0.address()
            r1 = r6
            r2 = r7
            ncpb_cnt_minus1(r0, r1, r2)
            r0 = r5
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoH265HrdParameters elemental_duration_in_tc_minus1(@org.lwjgl.system.NativeType("uint16_t[STD_VIDEO_H265_SUBLAYERS_LIST_SIZE]") java.nio.ShortBuffer r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nelemental_duration_in_tc_minus1(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoH265HrdParameters elemental_duration_in_tc_minus1(int r6, @org.lwjgl.system.NativeType("uint16_t") short r7) {
            r5 = this;
            r0 = r5
            long r0 = r0.address()
            r1 = r6
            r2 = r7
            nelemental_duration_in_tc_minus1(r0, r1, r2)
            r0 = r5
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoH265HrdParameters pSubLayerHrdParametersNal(@org.lwjgl.system.NativeType("StdVideoH265SubLayerHrdParameters const *") org.lwjgl.vulkan.video.StdVideoH265SubLayerHrdParameters r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            npSubLayerHrdParametersNal(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoH265HrdParameters pSubLayerHrdParametersVcl(@org.lwjgl.system.NativeType("StdVideoH265SubLayerHrdParameters const *") org.lwjgl.vulkan.video.StdVideoH265SubLayerHrdParameters r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            npSubLayerHrdParametersVcl(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoH265HrdParameters set(org.lwjgl.vulkan.video.StdVideoH265HrdFlags r4, byte r5, byte r6, byte r7, byte r8, byte r9, byte r10, byte r11, byte r12, byte r13, java.nio.ByteBuffer r14, java.nio.ShortBuffer r15, org.lwjgl.vulkan.video.StdVideoH265SubLayerHrdParameters r16, org.lwjgl.vulkan.video.StdVideoH265SubLayerHrdParameters r17) {
            r3 = this;
            r0 = r3
            r1 = r4
            org.lwjgl.vulkan.video.StdVideoH265HrdParameters r0 = r0.flags(r1)
            r0 = r3
            r1 = r5
            org.lwjgl.vulkan.video.StdVideoH265HrdParameters r0 = r0.tick_divisor_minus2(r1)
            r0 = r3
            r1 = r6
            org.lwjgl.vulkan.video.StdVideoH265HrdParameters r0 = r0.du_cpb_removal_delay_increment_length_minus1(r1)
            r0 = r3
            r1 = r7
            org.lwjgl.vulkan.video.StdVideoH265HrdParameters r0 = r0.dpb_output_delay_du_length_minus1(r1)
            r0 = r3
            r1 = r8
            org.lwjgl.vulkan.video.StdVideoH265HrdParameters r0 = r0.bit_rate_scale(r1)
            r0 = r3
            r1 = r9
            org.lwjgl.vulkan.video.StdVideoH265HrdParameters r0 = r0.cpb_size_scale(r1)
            r0 = r3
            r1 = r10
            org.lwjgl.vulkan.video.StdVideoH265HrdParameters r0 = r0.cpb_size_du_scale(r1)
            r0 = r3
            r1 = r11
            org.lwjgl.vulkan.video.StdVideoH265HrdParameters r0 = r0.initial_cpb_removal_delay_length_minus1(r1)
            r0 = r3
            r1 = r12
            org.lwjgl.vulkan.video.StdVideoH265HrdParameters r0 = r0.au_cpb_removal_delay_length_minus1(r1)
            r0 = r3
            r1 = r13
            org.lwjgl.vulkan.video.StdVideoH265HrdParameters r0 = r0.dpb_output_delay_length_minus1(r1)
            r0 = r3
            r1 = r14
            org.lwjgl.vulkan.video.StdVideoH265HrdParameters r0 = r0.cpb_cnt_minus1(r1)
            r0 = r3
            r1 = r15
            org.lwjgl.vulkan.video.StdVideoH265HrdParameters r0 = r0.elemental_duration_in_tc_minus1(r1)
            r0 = r3
            r1 = r16
            org.lwjgl.vulkan.video.StdVideoH265HrdParameters r0 = r0.pSubLayerHrdParametersNal(r1)
            r0 = r3
            r1 = r17
            org.lwjgl.vulkan.video.StdVideoH265HrdParameters r0 = r0.pSubLayerHrdParametersVcl(r1)
            r0 = r3
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoH265HrdParameters set(org.lwjgl.vulkan.video.StdVideoH265HrdParameters r8) {
            r7 = this;
            r0 = r8
            long r0 = r0.address()
            r1 = r7
            long r1 = r1.address()
            int r2 = org.lwjgl.vulkan.video.StdVideoH265HrdParameters.SIZEOF
            long r2 = (long) r2
            org.lwjgl.system.MemoryUtil.memCopy(r0, r1, r2)
            r0 = r7
            return r0
    }

    public static org.lwjgl.vulkan.video.StdVideoH265HrdParameters malloc() {
            org.lwjgl.vulkan.video.StdVideoH265HrdParameters r0 = new org.lwjgl.vulkan.video.StdVideoH265HrdParameters
            r1 = r0
            int r2 = org.lwjgl.vulkan.video.StdVideoH265HrdParameters.SIZEOF
            long r2 = (long) r2
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.video.StdVideoH265HrdParameters calloc() {
            org.lwjgl.vulkan.video.StdVideoH265HrdParameters r0 = new org.lwjgl.vulkan.video.StdVideoH265HrdParameters
            r1 = r0
            r2 = 1
            int r3 = org.lwjgl.vulkan.video.StdVideoH265HrdParameters.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.video.StdVideoH265HrdParameters create() {
            int r0 = org.lwjgl.vulkan.video.StdVideoH265HrdParameters.SIZEOF
            java.nio.ByteBuffer r0 = org.lwjgl.BufferUtils.createByteBuffer(r0)
            r6 = r0
            org.lwjgl.vulkan.video.StdVideoH265HrdParameters r0 = new org.lwjgl.vulkan.video.StdVideoH265HrdParameters
            r1 = r0
            r2 = r6
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.video.StdVideoH265HrdParameters create(long r6) {
            org.lwjgl.vulkan.video.StdVideoH265HrdParameters r0 = new org.lwjgl.vulkan.video.StdVideoH265HrdParameters
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.vulkan.video.StdVideoH265HrdParameters createSafe(long r6) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.vulkan.video.StdVideoH265HrdParameters r0 = new org.lwjgl.vulkan.video.StdVideoH265HrdParameters
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static org.lwjgl.vulkan.video.StdVideoH265HrdParameters.Buffer malloc(int r6) {
            org.lwjgl.vulkan.video.StdVideoH265HrdParameters$Buffer r0 = new org.lwjgl.vulkan.video.StdVideoH265HrdParameters$Buffer
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.vulkan.video.StdVideoH265HrdParameters.SIZEOF
            long r2 = __checkMalloc(r2, r3)
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.video.StdVideoH265HrdParameters.Buffer calloc(int r7) {
            org.lwjgl.vulkan.video.StdVideoH265HrdParameters$Buffer r0 = new org.lwjgl.vulkan.video.StdVideoH265HrdParameters$Buffer
            r1 = r0
            r2 = r7
            long r2 = (long) r2
            int r3 = org.lwjgl.vulkan.video.StdVideoH265HrdParameters.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.video.StdVideoH265HrdParameters.Buffer create(int r10) {
            r0 = r10
            int r1 = org.lwjgl.vulkan.video.StdVideoH265HrdParameters.SIZEOF
            java.nio.ByteBuffer r0 = __create(r0, r1)
            r11 = r0
            org.lwjgl.vulkan.video.StdVideoH265HrdParameters$Buffer r0 = new org.lwjgl.vulkan.video.StdVideoH265HrdParameters$Buffer
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

    public static org.lwjgl.vulkan.video.StdVideoH265HrdParameters.Buffer create(long r6, int r8) {
            org.lwjgl.vulkan.video.StdVideoH265HrdParameters$Buffer r0 = new org.lwjgl.vulkan.video.StdVideoH265HrdParameters$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.vulkan.video.StdVideoH265HrdParameters.Buffer createSafe(long r6, int r8) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.vulkan.video.StdVideoH265HrdParameters$Buffer r0 = new org.lwjgl.vulkan.video.StdVideoH265HrdParameters$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static org.lwjgl.vulkan.video.StdVideoH265HrdParameters malloc(org.lwjgl.system.MemoryStack r6) {
            org.lwjgl.vulkan.video.StdVideoH265HrdParameters r0 = new org.lwjgl.vulkan.video.StdVideoH265HrdParameters
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.vulkan.video.StdVideoH265HrdParameters.ALIGNOF
            int r4 = org.lwjgl.vulkan.video.StdVideoH265HrdParameters.SIZEOF
            long r2 = r2.nmalloc(r3, r4)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.video.StdVideoH265HrdParameters calloc(org.lwjgl.system.MemoryStack r7) {
            org.lwjgl.vulkan.video.StdVideoH265HrdParameters r0 = new org.lwjgl.vulkan.video.StdVideoH265HrdParameters
            r1 = r0
            r2 = r7
            int r3 = org.lwjgl.vulkan.video.StdVideoH265HrdParameters.ALIGNOF
            r4 = 1
            int r5 = org.lwjgl.vulkan.video.StdVideoH265HrdParameters.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.video.StdVideoH265HrdParameters.Buffer malloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.vulkan.video.StdVideoH265HrdParameters$Buffer r0 = new org.lwjgl.vulkan.video.StdVideoH265HrdParameters$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.vulkan.video.StdVideoH265HrdParameters.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.vulkan.video.StdVideoH265HrdParameters.SIZEOF
            int r4 = r4 * r5
            long r2 = r2.nmalloc(r3, r4)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.video.StdVideoH265HrdParameters.Buffer calloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.vulkan.video.StdVideoH265HrdParameters$Buffer r0 = new org.lwjgl.vulkan.video.StdVideoH265HrdParameters$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.vulkan.video.StdVideoH265HrdParameters.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.vulkan.video.StdVideoH265HrdParameters.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.video.StdVideoH265HrdFlags nflags(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.video.StdVideoH265HrdParameters.FLAGS
            long r1 = (long) r1
            long r0 = r0 + r1
            org.lwjgl.vulkan.video.StdVideoH265HrdFlags r0 = org.lwjgl.vulkan.video.StdVideoH265HrdFlags.create(r0)
            return r0
    }

    public static byte ntick_divisor_minus2(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.video.StdVideoH265HrdParameters.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.video.StdVideoH265HrdParameters.TICK_DIVISOR_MINUS2
            long r3 = (long) r3
            long r2 = r2 + r3
            byte r0 = r0.getByte(r1, r2)
            return r0
    }

    public static byte ndu_cpb_removal_delay_increment_length_minus1(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.video.StdVideoH265HrdParameters.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.video.StdVideoH265HrdParameters.DU_CPB_REMOVAL_DELAY_INCREMENT_LENGTH_MINUS1
            long r3 = (long) r3
            long r2 = r2 + r3
            byte r0 = r0.getByte(r1, r2)
            return r0
    }

    public static byte ndpb_output_delay_du_length_minus1(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.video.StdVideoH265HrdParameters.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.video.StdVideoH265HrdParameters.DPB_OUTPUT_DELAY_DU_LENGTH_MINUS1
            long r3 = (long) r3
            long r2 = r2 + r3
            byte r0 = r0.getByte(r1, r2)
            return r0
    }

    public static byte nbit_rate_scale(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.video.StdVideoH265HrdParameters.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.video.StdVideoH265HrdParameters.BIT_RATE_SCALE
            long r3 = (long) r3
            long r2 = r2 + r3
            byte r0 = r0.getByte(r1, r2)
            return r0
    }

    public static byte ncpb_size_scale(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.video.StdVideoH265HrdParameters.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.video.StdVideoH265HrdParameters.CPB_SIZE_SCALE
            long r3 = (long) r3
            long r2 = r2 + r3
            byte r0 = r0.getByte(r1, r2)
            return r0
    }

    public static byte ncpb_size_du_scale(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.video.StdVideoH265HrdParameters.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.video.StdVideoH265HrdParameters.CPB_SIZE_DU_SCALE
            long r3 = (long) r3
            long r2 = r2 + r3
            byte r0 = r0.getByte(r1, r2)
            return r0
    }

    public static byte ninitial_cpb_removal_delay_length_minus1(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.video.StdVideoH265HrdParameters.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.video.StdVideoH265HrdParameters.INITIAL_CPB_REMOVAL_DELAY_LENGTH_MINUS1
            long r3 = (long) r3
            long r2 = r2 + r3
            byte r0 = r0.getByte(r1, r2)
            return r0
    }

    public static byte nau_cpb_removal_delay_length_minus1(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.video.StdVideoH265HrdParameters.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.video.StdVideoH265HrdParameters.AU_CPB_REMOVAL_DELAY_LENGTH_MINUS1
            long r3 = (long) r3
            long r2 = r2 + r3
            byte r0 = r0.getByte(r1, r2)
            return r0
    }

    public static byte ndpb_output_delay_length_minus1(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.video.StdVideoH265HrdParameters.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.video.StdVideoH265HrdParameters.DPB_OUTPUT_DELAY_LENGTH_MINUS1
            long r3 = (long) r3
            long r2 = r2 + r3
            byte r0 = r0.getByte(r1, r2)
            return r0
    }

    public static java.nio.ByteBuffer ncpb_cnt_minus1(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.video.StdVideoH265HrdParameters.CPB_CNT_MINUS1
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = 7
            java.nio.ByteBuffer r0 = org.lwjgl.system.MemoryUtil.memByteBuffer(r0, r1)
            return r0
    }

    public static byte ncpb_cnt_minus1(long r9, int r11) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.video.StdVideoH265HrdParameters.UNSAFE
            r1 = 0
            r2 = r9
            int r3 = org.lwjgl.vulkan.video.StdVideoH265HrdParameters.CPB_CNT_MINUS1
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r11
            r4 = 7
            long r3 = org.lwjgl.system.Checks.check(r3, r4)
            r4 = 1
            long r3 = r3 * r4
            long r2 = r2 + r3
            byte r0 = r0.getByte(r1, r2)
            return r0
    }

    public static java.nio.ShortBuffer nelemental_duration_in_tc_minus1(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.video.StdVideoH265HrdParameters.ELEMENTAL_DURATION_IN_TC_MINUS1
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = 7
            java.nio.ShortBuffer r0 = org.lwjgl.system.MemoryUtil.memShortBuffer(r0, r1)
            return r0
    }

    public static short nelemental_duration_in_tc_minus1(long r9, int r11) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.video.StdVideoH265HrdParameters.UNSAFE
            r1 = 0
            r2 = r9
            int r3 = org.lwjgl.vulkan.video.StdVideoH265HrdParameters.ELEMENTAL_DURATION_IN_TC_MINUS1
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r11
            r4 = 7
            long r3 = org.lwjgl.system.Checks.check(r3, r4)
            r4 = 2
            long r3 = r3 * r4
            long r2 = r2 + r3
            short r0 = r0.getShort(r1, r2)
            return r0
    }

    public static java.nio.ShortBuffer nreserved(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.video.StdVideoH265HrdParameters.RESERVED
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = 3
            java.nio.ShortBuffer r0 = org.lwjgl.system.MemoryUtil.memShortBuffer(r0, r1)
            return r0
    }

    public static short nreserved(long r9, int r11) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.video.StdVideoH265HrdParameters.UNSAFE
            r1 = 0
            r2 = r9
            int r3 = org.lwjgl.vulkan.video.StdVideoH265HrdParameters.RESERVED
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r11
            r4 = 3
            long r3 = org.lwjgl.system.Checks.check(r3, r4)
            r4 = 2
            long r3 = r3 * r4
            long r2 = r2 + r3
            short r0 = r0.getShort(r1, r2)
            return r0
    }

    public static org.lwjgl.vulkan.video.StdVideoH265SubLayerHrdParameters npSubLayerHrdParametersNal(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.video.StdVideoH265HrdParameters.PSUBLAYERHRDPARAMETERSNAL
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            org.lwjgl.vulkan.video.StdVideoH265SubLayerHrdParameters r0 = org.lwjgl.vulkan.video.StdVideoH265SubLayerHrdParameters.create(r0)
            return r0
    }

    public static org.lwjgl.vulkan.video.StdVideoH265SubLayerHrdParameters npSubLayerHrdParametersVcl(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.video.StdVideoH265HrdParameters.PSUBLAYERHRDPARAMETERSVCL
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            org.lwjgl.vulkan.video.StdVideoH265SubLayerHrdParameters r0 = org.lwjgl.vulkan.video.StdVideoH265SubLayerHrdParameters.create(r0)
            return r0
    }

    public static void nflags(long r7, org.lwjgl.vulkan.video.StdVideoH265HrdFlags r9) {
            r0 = r9
            long r0 = r0.address()
            r1 = r7
            int r2 = org.lwjgl.vulkan.video.StdVideoH265HrdParameters.FLAGS
            long r2 = (long) r2
            long r1 = r1 + r2
            int r2 = org.lwjgl.vulkan.video.StdVideoH265HrdFlags.SIZEOF
            long r2 = (long) r2
            org.lwjgl.system.MemoryUtil.memCopy(r0, r1, r2)
            return
    }

    public static void ntick_divisor_minus2(long r7, byte r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.video.StdVideoH265HrdParameters.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.video.StdVideoH265HrdParameters.TICK_DIVISOR_MINUS2
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putByte(r1, r2, r3)
            return
    }

    public static void ndu_cpb_removal_delay_increment_length_minus1(long r7, byte r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.video.StdVideoH265HrdParameters.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.video.StdVideoH265HrdParameters.DU_CPB_REMOVAL_DELAY_INCREMENT_LENGTH_MINUS1
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putByte(r1, r2, r3)
            return
    }

    public static void ndpb_output_delay_du_length_minus1(long r7, byte r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.video.StdVideoH265HrdParameters.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.video.StdVideoH265HrdParameters.DPB_OUTPUT_DELAY_DU_LENGTH_MINUS1
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putByte(r1, r2, r3)
            return
    }

    public static void nbit_rate_scale(long r7, byte r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.video.StdVideoH265HrdParameters.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.video.StdVideoH265HrdParameters.BIT_RATE_SCALE
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putByte(r1, r2, r3)
            return
    }

    public static void ncpb_size_scale(long r7, byte r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.video.StdVideoH265HrdParameters.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.video.StdVideoH265HrdParameters.CPB_SIZE_SCALE
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putByte(r1, r2, r3)
            return
    }

    public static void ncpb_size_du_scale(long r7, byte r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.video.StdVideoH265HrdParameters.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.video.StdVideoH265HrdParameters.CPB_SIZE_DU_SCALE
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putByte(r1, r2, r3)
            return
    }

    public static void ninitial_cpb_removal_delay_length_minus1(long r7, byte r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.video.StdVideoH265HrdParameters.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.video.StdVideoH265HrdParameters.INITIAL_CPB_REMOVAL_DELAY_LENGTH_MINUS1
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putByte(r1, r2, r3)
            return
    }

    public static void nau_cpb_removal_delay_length_minus1(long r7, byte r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.video.StdVideoH265HrdParameters.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.video.StdVideoH265HrdParameters.AU_CPB_REMOVAL_DELAY_LENGTH_MINUS1
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putByte(r1, r2, r3)
            return
    }

    public static void ndpb_output_delay_length_minus1(long r7, byte r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.video.StdVideoH265HrdParameters.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.video.StdVideoH265HrdParameters.DPB_OUTPUT_DELAY_LENGTH_MINUS1
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putByte(r1, r2, r3)
            return
    }

    public static void ncpb_cnt_minus1(long r7, java.nio.ByteBuffer r9) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lc
            r0 = r9
            r1 = 7
            org.lwjgl.system.Checks.checkGT(r0, r1)
        Lc:
            r0 = r9
            long r0 = org.lwjgl.system.MemoryUtil.memAddress(r0)
            r1 = r7
            int r2 = org.lwjgl.vulkan.video.StdVideoH265HrdParameters.CPB_CNT_MINUS1
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

    public static void ncpb_cnt_minus1(long r9, int r11, byte r12) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.video.StdVideoH265HrdParameters.UNSAFE
            r1 = 0
            r2 = r9
            int r3 = org.lwjgl.vulkan.video.StdVideoH265HrdParameters.CPB_CNT_MINUS1
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r11
            r4 = 7
            long r3 = org.lwjgl.system.Checks.check(r3, r4)
            r4 = 1
            long r3 = r3 * r4
            long r2 = r2 + r3
            r3 = r12
            r0.putByte(r1, r2, r3)
            return
    }

    public static void nelemental_duration_in_tc_minus1(long r7, java.nio.ShortBuffer r9) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lc
            r0 = r9
            r1 = 7
            org.lwjgl.system.Checks.checkGT(r0, r1)
        Lc:
            r0 = r9
            long r0 = org.lwjgl.system.MemoryUtil.memAddress(r0)
            r1 = r7
            int r2 = org.lwjgl.vulkan.video.StdVideoH265HrdParameters.ELEMENTAL_DURATION_IN_TC_MINUS1
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

    public static void nelemental_duration_in_tc_minus1(long r9, int r11, short r12) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.video.StdVideoH265HrdParameters.UNSAFE
            r1 = 0
            r2 = r9
            int r3 = org.lwjgl.vulkan.video.StdVideoH265HrdParameters.ELEMENTAL_DURATION_IN_TC_MINUS1
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r11
            r4 = 7
            long r3 = org.lwjgl.system.Checks.check(r3, r4)
            r4 = 2
            long r3 = r3 * r4
            long r2 = r2 + r3
            r3 = r12
            r0.putShort(r1, r2, r3)
            return
    }

    public static void nreserved(long r7, java.nio.ShortBuffer r9) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r9
            r1 = 3
            org.lwjgl.system.Checks.checkGT(r0, r1)
        Lb:
            r0 = r9
            long r0 = org.lwjgl.system.MemoryUtil.memAddress(r0)
            r1 = r7
            int r2 = org.lwjgl.vulkan.video.StdVideoH265HrdParameters.RESERVED
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

    public static void nreserved(long r9, int r11, short r12) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.video.StdVideoH265HrdParameters.UNSAFE
            r1 = 0
            r2 = r9
            int r3 = org.lwjgl.vulkan.video.StdVideoH265HrdParameters.RESERVED
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r11
            r4 = 3
            long r3 = org.lwjgl.system.Checks.check(r3, r4)
            r4 = 2
            long r3 = r3 * r4
            long r2 = r2 + r3
            r3 = r12
            r0.putShort(r1, r2, r3)
            return
    }

    public static void npSubLayerHrdParametersNal(long r5, org.lwjgl.vulkan.video.StdVideoH265SubLayerHrdParameters r7) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.video.StdVideoH265HrdParameters.PSUBLAYERHRDPARAMETERSNAL
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            long r1 = r1.address()
            org.lwjgl.system.MemoryUtil.memPutAddress(r0, r1)
            return
    }

    public static void npSubLayerHrdParametersVcl(long r5, org.lwjgl.vulkan.video.StdVideoH265SubLayerHrdParameters r7) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.video.StdVideoH265HrdParameters.PSUBLAYERHRDPARAMETERSVCL
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            long r1 = r1.address()
            org.lwjgl.system.MemoryUtil.memPutAddress(r0, r1)
            return
    }

    public static void validate(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.video.StdVideoH265HrdParameters.PSUBLAYERHRDPARAMETERSNAL
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r5
            int r1 = org.lwjgl.vulkan.video.StdVideoH265HrdParameters.PSUBLAYERHRDPARAMETERSVCL
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
            org.lwjgl.vulkan.video.StdVideoH265HrdParameters r0 = r0.create(r1, r2)
            return r0
    }

    static {
            r0 = 15
            org.lwjgl.system.Struct$Member[] r0 = new org.lwjgl.system.Struct.Member[r0]
            r1 = r0
            r2 = 0
            int r3 = org.lwjgl.vulkan.video.StdVideoH265HrdFlags.SIZEOF
            int r4 = org.lwjgl.vulkan.video.StdVideoH265HrdFlags.ALIGNOF
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
            r4 = 7
            org.lwjgl.system.Struct$Member r3 = __array(r3, r4)
            r1[r2] = r3
            r1 = r0
            r2 = 11
            r3 = 2
            r4 = 7
            org.lwjgl.system.Struct$Member r3 = __array(r3, r4)
            r1[r2] = r3
            r1 = r0
            r2 = 12
            r3 = 2
            r4 = 3
            org.lwjgl.system.Struct$Member r3 = __array(r3, r4)
            r1[r2] = r3
            r1 = r0
            r2 = 13
            int r3 = org.lwjgl.vulkan.video.StdVideoH265HrdParameters.POINTER_SIZE
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 14
            int r3 = org.lwjgl.vulkan.video.StdVideoH265HrdParameters.POINTER_SIZE
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            org.lwjgl.system.Struct$Layout r0 = __struct(r0)
            r6 = r0
            r0 = r6
            int r0 = r0.getSize()
            org.lwjgl.vulkan.video.StdVideoH265HrdParameters.SIZEOF = r0
            r0 = r6
            int r0 = r0.getAlignment()
            org.lwjgl.vulkan.video.StdVideoH265HrdParameters.ALIGNOF = r0
            r0 = r6
            r1 = 0
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.video.StdVideoH265HrdParameters.FLAGS = r0
            r0 = r6
            r1 = 1
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.video.StdVideoH265HrdParameters.TICK_DIVISOR_MINUS2 = r0
            r0 = r6
            r1 = 2
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.video.StdVideoH265HrdParameters.DU_CPB_REMOVAL_DELAY_INCREMENT_LENGTH_MINUS1 = r0
            r0 = r6
            r1 = 3
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.video.StdVideoH265HrdParameters.DPB_OUTPUT_DELAY_DU_LENGTH_MINUS1 = r0
            r0 = r6
            r1 = 4
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.video.StdVideoH265HrdParameters.BIT_RATE_SCALE = r0
            r0 = r6
            r1 = 5
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.video.StdVideoH265HrdParameters.CPB_SIZE_SCALE = r0
            r0 = r6
            r1 = 6
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.video.StdVideoH265HrdParameters.CPB_SIZE_DU_SCALE = r0
            r0 = r6
            r1 = 7
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.video.StdVideoH265HrdParameters.INITIAL_CPB_REMOVAL_DELAY_LENGTH_MINUS1 = r0
            r0 = r6
            r1 = 8
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.video.StdVideoH265HrdParameters.AU_CPB_REMOVAL_DELAY_LENGTH_MINUS1 = r0
            r0 = r6
            r1 = 9
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.video.StdVideoH265HrdParameters.DPB_OUTPUT_DELAY_LENGTH_MINUS1 = r0
            r0 = r6
            r1 = 10
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.video.StdVideoH265HrdParameters.CPB_CNT_MINUS1 = r0
            r0 = r6
            r1 = 11
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.video.StdVideoH265HrdParameters.ELEMENTAL_DURATION_IN_TC_MINUS1 = r0
            r0 = r6
            r1 = 12
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.video.StdVideoH265HrdParameters.RESERVED = r0
            r0 = r6
            r1 = 13
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.video.StdVideoH265HrdParameters.PSUBLAYERHRDPARAMETERSNAL = r0
            r0 = r6
            r1 = 14
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.video.StdVideoH265HrdParameters.PSUBLAYERHRDPARAMETERSVCL = r0
            return
    }
}
