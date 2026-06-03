package org.lwjgl.vulkan.video;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/video/StdVideoEncodeH265SliceSegmentHeader.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/video/StdVideoEncodeH265SliceSegmentHeader.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/video/StdVideoEncodeH265SliceSegmentHeader.class */
public class StdVideoEncodeH265SliceSegmentHeader extends org.lwjgl.system.Struct<org.lwjgl.vulkan.video.StdVideoEncodeH265SliceSegmentHeader> implements org.lwjgl.system.NativeResource {
    public static final int SIZEOF = 0;
    public static final int ALIGNOF = 0;
    public static final int FLAGS = 0;
    public static final int SLICE_TYPE = 0;
    public static final int SLICE_SEGMENT_ADDRESS = 0;
    public static final int COLLOCATED_REF_IDX = 0;
    public static final int MAXNUMMERGECAND = 0;
    public static final int SLICE_CB_QP_OFFSET = 0;
    public static final int SLICE_CR_QP_OFFSET = 0;
    public static final int SLICE_BETA_OFFSET_DIV2 = 0;
    public static final int SLICE_TC_OFFSET_DIV2 = 0;
    public static final int SLICE_ACT_Y_QP_OFFSET = 0;
    public static final int SLICE_ACT_CB_QP_OFFSET = 0;
    public static final int SLICE_ACT_CR_QP_OFFSET = 0;
    public static final int SLICE_QP_DELTA = 0;
    public static final int RESERVED1 = 0;
    public static final int PWEIGHTTABLE = 0;

    /* JADX WARN: Classes with same name are omitted, all sources:
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/video/StdVideoEncodeH265SliceSegmentHeader$Buffer.class
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/video/StdVideoEncodeH265SliceSegmentHeader$Buffer.class
     */
    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/video/StdVideoEncodeH265SliceSegmentHeader$Buffer.class */
    public static class Buffer extends org.lwjgl.system.StructBuffer<org.lwjgl.vulkan.video.StdVideoEncodeH265SliceSegmentHeader, org.lwjgl.vulkan.video.StdVideoEncodeH265SliceSegmentHeader.Buffer> implements org.lwjgl.system.NativeResource {
        private static final org.lwjgl.vulkan.video.StdVideoEncodeH265SliceSegmentHeader ELEMENT_FACTORY = null;

        public Buffer(java.nio.ByteBuffer r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r6
                int r2 = r2.remaining()
                int r3 = org.lwjgl.vulkan.video.StdVideoEncodeH265SliceSegmentHeader.SIZEOF
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
        protected org.lwjgl.vulkan.video.StdVideoEncodeH265SliceSegmentHeader.Buffer self() {
                r2 = this;
                r0 = r2
                return r0
        }

        @Override // org.lwjgl.system.StructBuffer
        protected org.lwjgl.vulkan.video.StdVideoEncodeH265SliceSegmentHeader getElementFactory() {
                r2 = this;
                org.lwjgl.vulkan.video.StdVideoEncodeH265SliceSegmentHeader r0 = org.lwjgl.vulkan.video.StdVideoEncodeH265SliceSegmentHeader.Buffer.ELEMENT_FACTORY
                return r0
        }

        public org.lwjgl.vulkan.video.StdVideoEncodeH265SliceSegmentHeaderFlags flags() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                org.lwjgl.vulkan.video.StdVideoEncodeH265SliceSegmentHeaderFlags r0 = org.lwjgl.vulkan.video.StdVideoEncodeH265SliceSegmentHeader.nflags(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("StdVideoH265SliceType")
        public int slice_type() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.video.StdVideoEncodeH265SliceSegmentHeader.nslice_type(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint32_t")
        public int slice_segment_address() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.video.StdVideoEncodeH265SliceSegmentHeader.nslice_segment_address(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint8_t")
        public byte collocated_ref_idx() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                byte r0 = org.lwjgl.vulkan.video.StdVideoEncodeH265SliceSegmentHeader.ncollocated_ref_idx(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint8_t")
        public byte MaxNumMergeCand() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                byte r0 = org.lwjgl.vulkan.video.StdVideoEncodeH265SliceSegmentHeader.nMaxNumMergeCand(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("int8_t")
        public byte slice_cb_qp_offset() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                byte r0 = org.lwjgl.vulkan.video.StdVideoEncodeH265SliceSegmentHeader.nslice_cb_qp_offset(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("int8_t")
        public byte slice_cr_qp_offset() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                byte r0 = org.lwjgl.vulkan.video.StdVideoEncodeH265SliceSegmentHeader.nslice_cr_qp_offset(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("int8_t")
        public byte slice_beta_offset_div2() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                byte r0 = org.lwjgl.vulkan.video.StdVideoEncodeH265SliceSegmentHeader.nslice_beta_offset_div2(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("int8_t")
        public byte slice_tc_offset_div2() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                byte r0 = org.lwjgl.vulkan.video.StdVideoEncodeH265SliceSegmentHeader.nslice_tc_offset_div2(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("int8_t")
        public byte slice_act_y_qp_offset() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                byte r0 = org.lwjgl.vulkan.video.StdVideoEncodeH265SliceSegmentHeader.nslice_act_y_qp_offset(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("int8_t")
        public byte slice_act_cb_qp_offset() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                byte r0 = org.lwjgl.vulkan.video.StdVideoEncodeH265SliceSegmentHeader.nslice_act_cb_qp_offset(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("int8_t")
        public byte slice_act_cr_qp_offset() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                byte r0 = org.lwjgl.vulkan.video.StdVideoEncodeH265SliceSegmentHeader.nslice_act_cr_qp_offset(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("int8_t")
        public byte slice_qp_delta() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                byte r0 = org.lwjgl.vulkan.video.StdVideoEncodeH265SliceSegmentHeader.nslice_qp_delta(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("StdVideoEncodeH265WeightTable const *")
        public org.lwjgl.vulkan.video.StdVideoEncodeH265WeightTable pWeightTable() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                org.lwjgl.vulkan.video.StdVideoEncodeH265WeightTable r0 = org.lwjgl.vulkan.video.StdVideoEncodeH265SliceSegmentHeader.npWeightTable(r0)
                return r0
        }

        public org.lwjgl.vulkan.video.StdVideoEncodeH265SliceSegmentHeader.Buffer flags(org.lwjgl.vulkan.video.StdVideoEncodeH265SliceSegmentHeaderFlags r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.video.StdVideoEncodeH265SliceSegmentHeader.nflags(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.video.StdVideoEncodeH265SliceSegmentHeader.Buffer flags(java.util.function.Consumer<org.lwjgl.vulkan.video.StdVideoEncodeH265SliceSegmentHeaderFlags> r4) {
                r3 = this;
                r0 = r4
                r1 = r3
                org.lwjgl.vulkan.video.StdVideoEncodeH265SliceSegmentHeaderFlags r1 = r1.flags()
                r0.accept(r1)
                r0 = r3
                return r0
        }

        public org.lwjgl.vulkan.video.StdVideoEncodeH265SliceSegmentHeader.Buffer slice_type(@org.lwjgl.system.NativeType("StdVideoH265SliceType") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.video.StdVideoEncodeH265SliceSegmentHeader.nslice_type(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.video.StdVideoEncodeH265SliceSegmentHeader.Buffer slice_segment_address(@org.lwjgl.system.NativeType("uint32_t") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.video.StdVideoEncodeH265SliceSegmentHeader.nslice_segment_address(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.video.StdVideoEncodeH265SliceSegmentHeader.Buffer collocated_ref_idx(@org.lwjgl.system.NativeType("uint8_t") byte r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.video.StdVideoEncodeH265SliceSegmentHeader.ncollocated_ref_idx(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.video.StdVideoEncodeH265SliceSegmentHeader.Buffer MaxNumMergeCand(@org.lwjgl.system.NativeType("uint8_t") byte r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.video.StdVideoEncodeH265SliceSegmentHeader.nMaxNumMergeCand(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.video.StdVideoEncodeH265SliceSegmentHeader.Buffer slice_cb_qp_offset(@org.lwjgl.system.NativeType("int8_t") byte r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.video.StdVideoEncodeH265SliceSegmentHeader.nslice_cb_qp_offset(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.video.StdVideoEncodeH265SliceSegmentHeader.Buffer slice_cr_qp_offset(@org.lwjgl.system.NativeType("int8_t") byte r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.video.StdVideoEncodeH265SliceSegmentHeader.nslice_cr_qp_offset(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.video.StdVideoEncodeH265SliceSegmentHeader.Buffer slice_beta_offset_div2(@org.lwjgl.system.NativeType("int8_t") byte r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.video.StdVideoEncodeH265SliceSegmentHeader.nslice_beta_offset_div2(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.video.StdVideoEncodeH265SliceSegmentHeader.Buffer slice_tc_offset_div2(@org.lwjgl.system.NativeType("int8_t") byte r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.video.StdVideoEncodeH265SliceSegmentHeader.nslice_tc_offset_div2(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.video.StdVideoEncodeH265SliceSegmentHeader.Buffer slice_act_y_qp_offset(@org.lwjgl.system.NativeType("int8_t") byte r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.video.StdVideoEncodeH265SliceSegmentHeader.nslice_act_y_qp_offset(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.video.StdVideoEncodeH265SliceSegmentHeader.Buffer slice_act_cb_qp_offset(@org.lwjgl.system.NativeType("int8_t") byte r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.video.StdVideoEncodeH265SliceSegmentHeader.nslice_act_cb_qp_offset(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.video.StdVideoEncodeH265SliceSegmentHeader.Buffer slice_act_cr_qp_offset(@org.lwjgl.system.NativeType("int8_t") byte r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.video.StdVideoEncodeH265SliceSegmentHeader.nslice_act_cr_qp_offset(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.video.StdVideoEncodeH265SliceSegmentHeader.Buffer slice_qp_delta(@org.lwjgl.system.NativeType("int8_t") byte r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.video.StdVideoEncodeH265SliceSegmentHeader.nslice_qp_delta(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.video.StdVideoEncodeH265SliceSegmentHeader.Buffer pWeightTable(@org.lwjgl.system.NativeType("StdVideoEncodeH265WeightTable const *") org.lwjgl.vulkan.video.StdVideoEncodeH265WeightTable r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.video.StdVideoEncodeH265SliceSegmentHeader.npWeightTable(r0, r1)
                r0 = r4
                return r0
        }

        @Override // org.lwjgl.system.StructBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.Struct getElementFactory() {
                r2 = this;
                r0 = r2
                org.lwjgl.vulkan.video.StdVideoEncodeH265SliceSegmentHeader r0 = r0.getElementFactory()
                return r0
        }

        @Override // org.lwjgl.system.CustomBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.CustomBuffer self() {
                r2 = this;
                r0 = r2
                org.lwjgl.vulkan.video.StdVideoEncodeH265SliceSegmentHeader$Buffer r0 = r0.self()
                return r0
        }

        static {
                r0 = -1
                org.lwjgl.vulkan.video.StdVideoEncodeH265SliceSegmentHeader r0 = org.lwjgl.vulkan.video.StdVideoEncodeH265SliceSegmentHeader.create(r0)
                org.lwjgl.vulkan.video.StdVideoEncodeH265SliceSegmentHeader.Buffer.ELEMENT_FACTORY = r0
                return
        }
    }

    protected StdVideoEncodeH265SliceSegmentHeader(long r6, @javax.annotation.Nullable java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    protected org.lwjgl.vulkan.video.StdVideoEncodeH265SliceSegmentHeader create(long r7, @javax.annotation.Nullable java.nio.ByteBuffer r9) {
            r6 = this;
            org.lwjgl.vulkan.video.StdVideoEncodeH265SliceSegmentHeader r0 = new org.lwjgl.vulkan.video.StdVideoEncodeH265SliceSegmentHeader
            r1 = r0
            r2 = r7
            r3 = r9
            r1.<init>(r2, r3)
            return r0
    }

    public StdVideoEncodeH265SliceSegmentHeader(java.nio.ByteBuffer r7) {
            r6 = this;
            r0 = r6
            r1 = r7
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            r2 = r7
            int r3 = org.lwjgl.vulkan.video.StdVideoEncodeH265SliceSegmentHeader.SIZEOF
            java.nio.ByteBuffer r2 = __checkContainer(r2, r3)
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
            r2 = this;
            int r0 = org.lwjgl.vulkan.video.StdVideoEncodeH265SliceSegmentHeader.SIZEOF
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoEncodeH265SliceSegmentHeaderFlags flags() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            org.lwjgl.vulkan.video.StdVideoEncodeH265SliceSegmentHeaderFlags r0 = nflags(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("StdVideoH265SliceType")
    public int slice_type() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nslice_type(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("uint32_t")
    public int slice_segment_address() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nslice_segment_address(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("uint8_t")
    public byte collocated_ref_idx() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            byte r0 = ncollocated_ref_idx(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("uint8_t")
    public byte MaxNumMergeCand() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            byte r0 = nMaxNumMergeCand(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("int8_t")
    public byte slice_cb_qp_offset() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            byte r0 = nslice_cb_qp_offset(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("int8_t")
    public byte slice_cr_qp_offset() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            byte r0 = nslice_cr_qp_offset(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("int8_t")
    public byte slice_beta_offset_div2() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            byte r0 = nslice_beta_offset_div2(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("int8_t")
    public byte slice_tc_offset_div2() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            byte r0 = nslice_tc_offset_div2(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("int8_t")
    public byte slice_act_y_qp_offset() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            byte r0 = nslice_act_y_qp_offset(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("int8_t")
    public byte slice_act_cb_qp_offset() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            byte r0 = nslice_act_cb_qp_offset(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("int8_t")
    public byte slice_act_cr_qp_offset() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            byte r0 = nslice_act_cr_qp_offset(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("int8_t")
    public byte slice_qp_delta() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            byte r0 = nslice_qp_delta(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("StdVideoEncodeH265WeightTable const *")
    public org.lwjgl.vulkan.video.StdVideoEncodeH265WeightTable pWeightTable() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            org.lwjgl.vulkan.video.StdVideoEncodeH265WeightTable r0 = npWeightTable(r0)
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoEncodeH265SliceSegmentHeader flags(org.lwjgl.vulkan.video.StdVideoEncodeH265SliceSegmentHeaderFlags r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nflags(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoEncodeH265SliceSegmentHeader flags(java.util.function.Consumer<org.lwjgl.vulkan.video.StdVideoEncodeH265SliceSegmentHeaderFlags> r4) {
            r3 = this;
            r0 = r4
            r1 = r3
            org.lwjgl.vulkan.video.StdVideoEncodeH265SliceSegmentHeaderFlags r1 = r1.flags()
            r0.accept(r1)
            r0 = r3
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoEncodeH265SliceSegmentHeader slice_type(@org.lwjgl.system.NativeType("StdVideoH265SliceType") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nslice_type(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoEncodeH265SliceSegmentHeader slice_segment_address(@org.lwjgl.system.NativeType("uint32_t") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nslice_segment_address(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoEncodeH265SliceSegmentHeader collocated_ref_idx(@org.lwjgl.system.NativeType("uint8_t") byte r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            ncollocated_ref_idx(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoEncodeH265SliceSegmentHeader MaxNumMergeCand(@org.lwjgl.system.NativeType("uint8_t") byte r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nMaxNumMergeCand(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoEncodeH265SliceSegmentHeader slice_cb_qp_offset(@org.lwjgl.system.NativeType("int8_t") byte r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nslice_cb_qp_offset(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoEncodeH265SliceSegmentHeader slice_cr_qp_offset(@org.lwjgl.system.NativeType("int8_t") byte r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nslice_cr_qp_offset(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoEncodeH265SliceSegmentHeader slice_beta_offset_div2(@org.lwjgl.system.NativeType("int8_t") byte r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nslice_beta_offset_div2(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoEncodeH265SliceSegmentHeader slice_tc_offset_div2(@org.lwjgl.system.NativeType("int8_t") byte r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nslice_tc_offset_div2(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoEncodeH265SliceSegmentHeader slice_act_y_qp_offset(@org.lwjgl.system.NativeType("int8_t") byte r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nslice_act_y_qp_offset(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoEncodeH265SliceSegmentHeader slice_act_cb_qp_offset(@org.lwjgl.system.NativeType("int8_t") byte r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nslice_act_cb_qp_offset(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoEncodeH265SliceSegmentHeader slice_act_cr_qp_offset(@org.lwjgl.system.NativeType("int8_t") byte r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nslice_act_cr_qp_offset(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoEncodeH265SliceSegmentHeader slice_qp_delta(@org.lwjgl.system.NativeType("int8_t") byte r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nslice_qp_delta(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoEncodeH265SliceSegmentHeader pWeightTable(@org.lwjgl.system.NativeType("StdVideoEncodeH265WeightTable const *") org.lwjgl.vulkan.video.StdVideoEncodeH265WeightTable r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            npWeightTable(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoEncodeH265SliceSegmentHeader set(org.lwjgl.vulkan.video.StdVideoEncodeH265SliceSegmentHeaderFlags r4, int r5, int r6, byte r7, byte r8, byte r9, byte r10, byte r11, byte r12, byte r13, byte r14, byte r15, byte r16, org.lwjgl.vulkan.video.StdVideoEncodeH265WeightTable r17) {
            r3 = this;
            r0 = r3
            r1 = r4
            org.lwjgl.vulkan.video.StdVideoEncodeH265SliceSegmentHeader r0 = r0.flags(r1)
            r0 = r3
            r1 = r5
            org.lwjgl.vulkan.video.StdVideoEncodeH265SliceSegmentHeader r0 = r0.slice_type(r1)
            r0 = r3
            r1 = r6
            org.lwjgl.vulkan.video.StdVideoEncodeH265SliceSegmentHeader r0 = r0.slice_segment_address(r1)
            r0 = r3
            r1 = r7
            org.lwjgl.vulkan.video.StdVideoEncodeH265SliceSegmentHeader r0 = r0.collocated_ref_idx(r1)
            r0 = r3
            r1 = r8
            org.lwjgl.vulkan.video.StdVideoEncodeH265SliceSegmentHeader r0 = r0.MaxNumMergeCand(r1)
            r0 = r3
            r1 = r9
            org.lwjgl.vulkan.video.StdVideoEncodeH265SliceSegmentHeader r0 = r0.slice_cb_qp_offset(r1)
            r0 = r3
            r1 = r10
            org.lwjgl.vulkan.video.StdVideoEncodeH265SliceSegmentHeader r0 = r0.slice_cr_qp_offset(r1)
            r0 = r3
            r1 = r11
            org.lwjgl.vulkan.video.StdVideoEncodeH265SliceSegmentHeader r0 = r0.slice_beta_offset_div2(r1)
            r0 = r3
            r1 = r12
            org.lwjgl.vulkan.video.StdVideoEncodeH265SliceSegmentHeader r0 = r0.slice_tc_offset_div2(r1)
            r0 = r3
            r1 = r13
            org.lwjgl.vulkan.video.StdVideoEncodeH265SliceSegmentHeader r0 = r0.slice_act_y_qp_offset(r1)
            r0 = r3
            r1 = r14
            org.lwjgl.vulkan.video.StdVideoEncodeH265SliceSegmentHeader r0 = r0.slice_act_cb_qp_offset(r1)
            r0 = r3
            r1 = r15
            org.lwjgl.vulkan.video.StdVideoEncodeH265SliceSegmentHeader r0 = r0.slice_act_cr_qp_offset(r1)
            r0 = r3
            r1 = r16
            org.lwjgl.vulkan.video.StdVideoEncodeH265SliceSegmentHeader r0 = r0.slice_qp_delta(r1)
            r0 = r3
            r1 = r17
            org.lwjgl.vulkan.video.StdVideoEncodeH265SliceSegmentHeader r0 = r0.pWeightTable(r1)
            r0 = r3
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoEncodeH265SliceSegmentHeader set(org.lwjgl.vulkan.video.StdVideoEncodeH265SliceSegmentHeader r8) {
            r7 = this;
            r0 = r8
            long r0 = r0.address()
            r1 = r7
            long r1 = r1.address()
            int r2 = org.lwjgl.vulkan.video.StdVideoEncodeH265SliceSegmentHeader.SIZEOF
            long r2 = (long) r2
            org.lwjgl.system.MemoryUtil.memCopy(r0, r1, r2)
            r0 = r7
            return r0
    }

    public static org.lwjgl.vulkan.video.StdVideoEncodeH265SliceSegmentHeader malloc() {
            org.lwjgl.vulkan.video.StdVideoEncodeH265SliceSegmentHeader r0 = new org.lwjgl.vulkan.video.StdVideoEncodeH265SliceSegmentHeader
            r1 = r0
            int r2 = org.lwjgl.vulkan.video.StdVideoEncodeH265SliceSegmentHeader.SIZEOF
            long r2 = (long) r2
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.video.StdVideoEncodeH265SliceSegmentHeader calloc() {
            org.lwjgl.vulkan.video.StdVideoEncodeH265SliceSegmentHeader r0 = new org.lwjgl.vulkan.video.StdVideoEncodeH265SliceSegmentHeader
            r1 = r0
            r2 = 1
            int r3 = org.lwjgl.vulkan.video.StdVideoEncodeH265SliceSegmentHeader.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.video.StdVideoEncodeH265SliceSegmentHeader create() {
            int r0 = org.lwjgl.vulkan.video.StdVideoEncodeH265SliceSegmentHeader.SIZEOF
            java.nio.ByteBuffer r0 = org.lwjgl.BufferUtils.createByteBuffer(r0)
            r6 = r0
            org.lwjgl.vulkan.video.StdVideoEncodeH265SliceSegmentHeader r0 = new org.lwjgl.vulkan.video.StdVideoEncodeH265SliceSegmentHeader
            r1 = r0
            r2 = r6
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.video.StdVideoEncodeH265SliceSegmentHeader create(long r6) {
            org.lwjgl.vulkan.video.StdVideoEncodeH265SliceSegmentHeader r0 = new org.lwjgl.vulkan.video.StdVideoEncodeH265SliceSegmentHeader
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.vulkan.video.StdVideoEncodeH265SliceSegmentHeader createSafe(long r6) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.vulkan.video.StdVideoEncodeH265SliceSegmentHeader r0 = new org.lwjgl.vulkan.video.StdVideoEncodeH265SliceSegmentHeader
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static org.lwjgl.vulkan.video.StdVideoEncodeH265SliceSegmentHeader.Buffer malloc(int r6) {
            org.lwjgl.vulkan.video.StdVideoEncodeH265SliceSegmentHeader$Buffer r0 = new org.lwjgl.vulkan.video.StdVideoEncodeH265SliceSegmentHeader$Buffer
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.vulkan.video.StdVideoEncodeH265SliceSegmentHeader.SIZEOF
            long r2 = __checkMalloc(r2, r3)
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.video.StdVideoEncodeH265SliceSegmentHeader.Buffer calloc(int r7) {
            org.lwjgl.vulkan.video.StdVideoEncodeH265SliceSegmentHeader$Buffer r0 = new org.lwjgl.vulkan.video.StdVideoEncodeH265SliceSegmentHeader$Buffer
            r1 = r0
            r2 = r7
            long r2 = (long) r2
            int r3 = org.lwjgl.vulkan.video.StdVideoEncodeH265SliceSegmentHeader.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.video.StdVideoEncodeH265SliceSegmentHeader.Buffer create(int r10) {
            r0 = r10
            int r1 = org.lwjgl.vulkan.video.StdVideoEncodeH265SliceSegmentHeader.SIZEOF
            java.nio.ByteBuffer r0 = __create(r0, r1)
            r11 = r0
            org.lwjgl.vulkan.video.StdVideoEncodeH265SliceSegmentHeader$Buffer r0 = new org.lwjgl.vulkan.video.StdVideoEncodeH265SliceSegmentHeader$Buffer
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

    public static org.lwjgl.vulkan.video.StdVideoEncodeH265SliceSegmentHeader.Buffer create(long r6, int r8) {
            org.lwjgl.vulkan.video.StdVideoEncodeH265SliceSegmentHeader$Buffer r0 = new org.lwjgl.vulkan.video.StdVideoEncodeH265SliceSegmentHeader$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.vulkan.video.StdVideoEncodeH265SliceSegmentHeader.Buffer createSafe(long r6, int r8) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.vulkan.video.StdVideoEncodeH265SliceSegmentHeader$Buffer r0 = new org.lwjgl.vulkan.video.StdVideoEncodeH265SliceSegmentHeader$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static org.lwjgl.vulkan.video.StdVideoEncodeH265SliceSegmentHeader malloc(org.lwjgl.system.MemoryStack r6) {
            org.lwjgl.vulkan.video.StdVideoEncodeH265SliceSegmentHeader r0 = new org.lwjgl.vulkan.video.StdVideoEncodeH265SliceSegmentHeader
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.vulkan.video.StdVideoEncodeH265SliceSegmentHeader.ALIGNOF
            int r4 = org.lwjgl.vulkan.video.StdVideoEncodeH265SliceSegmentHeader.SIZEOF
            long r2 = r2.nmalloc(r3, r4)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.video.StdVideoEncodeH265SliceSegmentHeader calloc(org.lwjgl.system.MemoryStack r7) {
            org.lwjgl.vulkan.video.StdVideoEncodeH265SliceSegmentHeader r0 = new org.lwjgl.vulkan.video.StdVideoEncodeH265SliceSegmentHeader
            r1 = r0
            r2 = r7
            int r3 = org.lwjgl.vulkan.video.StdVideoEncodeH265SliceSegmentHeader.ALIGNOF
            r4 = 1
            int r5 = org.lwjgl.vulkan.video.StdVideoEncodeH265SliceSegmentHeader.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.video.StdVideoEncodeH265SliceSegmentHeader.Buffer malloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.vulkan.video.StdVideoEncodeH265SliceSegmentHeader$Buffer r0 = new org.lwjgl.vulkan.video.StdVideoEncodeH265SliceSegmentHeader$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.vulkan.video.StdVideoEncodeH265SliceSegmentHeader.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.vulkan.video.StdVideoEncodeH265SliceSegmentHeader.SIZEOF
            int r4 = r4 * r5
            long r2 = r2.nmalloc(r3, r4)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.video.StdVideoEncodeH265SliceSegmentHeader.Buffer calloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.vulkan.video.StdVideoEncodeH265SliceSegmentHeader$Buffer r0 = new org.lwjgl.vulkan.video.StdVideoEncodeH265SliceSegmentHeader$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.vulkan.video.StdVideoEncodeH265SliceSegmentHeader.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.vulkan.video.StdVideoEncodeH265SliceSegmentHeader.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.video.StdVideoEncodeH265SliceSegmentHeaderFlags nflags(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.video.StdVideoEncodeH265SliceSegmentHeader.FLAGS
            long r1 = (long) r1
            long r0 = r0 + r1
            org.lwjgl.vulkan.video.StdVideoEncodeH265SliceSegmentHeaderFlags r0 = org.lwjgl.vulkan.video.StdVideoEncodeH265SliceSegmentHeaderFlags.create(r0)
            return r0
    }

    public static int nslice_type(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.video.StdVideoEncodeH265SliceSegmentHeader.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.video.StdVideoEncodeH265SliceSegmentHeader.SLICE_TYPE
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int nslice_segment_address(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.video.StdVideoEncodeH265SliceSegmentHeader.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.video.StdVideoEncodeH265SliceSegmentHeader.SLICE_SEGMENT_ADDRESS
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static byte ncollocated_ref_idx(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.video.StdVideoEncodeH265SliceSegmentHeader.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.video.StdVideoEncodeH265SliceSegmentHeader.COLLOCATED_REF_IDX
            long r3 = (long) r3
            long r2 = r2 + r3
            byte r0 = r0.getByte(r1, r2)
            return r0
    }

    public static byte nMaxNumMergeCand(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.video.StdVideoEncodeH265SliceSegmentHeader.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.video.StdVideoEncodeH265SliceSegmentHeader.MAXNUMMERGECAND
            long r3 = (long) r3
            long r2 = r2 + r3
            byte r0 = r0.getByte(r1, r2)
            return r0
    }

    public static byte nslice_cb_qp_offset(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.video.StdVideoEncodeH265SliceSegmentHeader.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.video.StdVideoEncodeH265SliceSegmentHeader.SLICE_CB_QP_OFFSET
            long r3 = (long) r3
            long r2 = r2 + r3
            byte r0 = r0.getByte(r1, r2)
            return r0
    }

    public static byte nslice_cr_qp_offset(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.video.StdVideoEncodeH265SliceSegmentHeader.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.video.StdVideoEncodeH265SliceSegmentHeader.SLICE_CR_QP_OFFSET
            long r3 = (long) r3
            long r2 = r2 + r3
            byte r0 = r0.getByte(r1, r2)
            return r0
    }

    public static byte nslice_beta_offset_div2(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.video.StdVideoEncodeH265SliceSegmentHeader.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.video.StdVideoEncodeH265SliceSegmentHeader.SLICE_BETA_OFFSET_DIV2
            long r3 = (long) r3
            long r2 = r2 + r3
            byte r0 = r0.getByte(r1, r2)
            return r0
    }

    public static byte nslice_tc_offset_div2(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.video.StdVideoEncodeH265SliceSegmentHeader.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.video.StdVideoEncodeH265SliceSegmentHeader.SLICE_TC_OFFSET_DIV2
            long r3 = (long) r3
            long r2 = r2 + r3
            byte r0 = r0.getByte(r1, r2)
            return r0
    }

    public static byte nslice_act_y_qp_offset(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.video.StdVideoEncodeH265SliceSegmentHeader.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.video.StdVideoEncodeH265SliceSegmentHeader.SLICE_ACT_Y_QP_OFFSET
            long r3 = (long) r3
            long r2 = r2 + r3
            byte r0 = r0.getByte(r1, r2)
            return r0
    }

    public static byte nslice_act_cb_qp_offset(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.video.StdVideoEncodeH265SliceSegmentHeader.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.video.StdVideoEncodeH265SliceSegmentHeader.SLICE_ACT_CB_QP_OFFSET
            long r3 = (long) r3
            long r2 = r2 + r3
            byte r0 = r0.getByte(r1, r2)
            return r0
    }

    public static byte nslice_act_cr_qp_offset(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.video.StdVideoEncodeH265SliceSegmentHeader.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.video.StdVideoEncodeH265SliceSegmentHeader.SLICE_ACT_CR_QP_OFFSET
            long r3 = (long) r3
            long r2 = r2 + r3
            byte r0 = r0.getByte(r1, r2)
            return r0
    }

    public static byte nslice_qp_delta(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.video.StdVideoEncodeH265SliceSegmentHeader.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.video.StdVideoEncodeH265SliceSegmentHeader.SLICE_QP_DELTA
            long r3 = (long) r3
            long r2 = r2 + r3
            byte r0 = r0.getByte(r1, r2)
            return r0
    }

    public static short nreserved1(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.video.StdVideoEncodeH265SliceSegmentHeader.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.video.StdVideoEncodeH265SliceSegmentHeader.RESERVED1
            long r3 = (long) r3
            long r2 = r2 + r3
            short r0 = r0.getShort(r1, r2)
            return r0
    }

    public static org.lwjgl.vulkan.video.StdVideoEncodeH265WeightTable npWeightTable(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.video.StdVideoEncodeH265SliceSegmentHeader.PWEIGHTTABLE
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            org.lwjgl.vulkan.video.StdVideoEncodeH265WeightTable r0 = org.lwjgl.vulkan.video.StdVideoEncodeH265WeightTable.create(r0)
            return r0
    }

    public static void nflags(long r7, org.lwjgl.vulkan.video.StdVideoEncodeH265SliceSegmentHeaderFlags r9) {
            r0 = r9
            long r0 = r0.address()
            r1 = r7
            int r2 = org.lwjgl.vulkan.video.StdVideoEncodeH265SliceSegmentHeader.FLAGS
            long r2 = (long) r2
            long r1 = r1 + r2
            int r2 = org.lwjgl.vulkan.video.StdVideoEncodeH265SliceSegmentHeaderFlags.SIZEOF
            long r2 = (long) r2
            org.lwjgl.system.MemoryUtil.memCopy(r0, r1, r2)
            return
    }

    public static void nslice_type(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.video.StdVideoEncodeH265SliceSegmentHeader.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.video.StdVideoEncodeH265SliceSegmentHeader.SLICE_TYPE
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void nslice_segment_address(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.video.StdVideoEncodeH265SliceSegmentHeader.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.video.StdVideoEncodeH265SliceSegmentHeader.SLICE_SEGMENT_ADDRESS
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void ncollocated_ref_idx(long r7, byte r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.video.StdVideoEncodeH265SliceSegmentHeader.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.video.StdVideoEncodeH265SliceSegmentHeader.COLLOCATED_REF_IDX
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putByte(r1, r2, r3)
            return
    }

    public static void nMaxNumMergeCand(long r7, byte r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.video.StdVideoEncodeH265SliceSegmentHeader.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.video.StdVideoEncodeH265SliceSegmentHeader.MAXNUMMERGECAND
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putByte(r1, r2, r3)
            return
    }

    public static void nslice_cb_qp_offset(long r7, byte r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.video.StdVideoEncodeH265SliceSegmentHeader.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.video.StdVideoEncodeH265SliceSegmentHeader.SLICE_CB_QP_OFFSET
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putByte(r1, r2, r3)
            return
    }

    public static void nslice_cr_qp_offset(long r7, byte r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.video.StdVideoEncodeH265SliceSegmentHeader.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.video.StdVideoEncodeH265SliceSegmentHeader.SLICE_CR_QP_OFFSET
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putByte(r1, r2, r3)
            return
    }

    public static void nslice_beta_offset_div2(long r7, byte r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.video.StdVideoEncodeH265SliceSegmentHeader.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.video.StdVideoEncodeH265SliceSegmentHeader.SLICE_BETA_OFFSET_DIV2
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putByte(r1, r2, r3)
            return
    }

    public static void nslice_tc_offset_div2(long r7, byte r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.video.StdVideoEncodeH265SliceSegmentHeader.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.video.StdVideoEncodeH265SliceSegmentHeader.SLICE_TC_OFFSET_DIV2
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putByte(r1, r2, r3)
            return
    }

    public static void nslice_act_y_qp_offset(long r7, byte r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.video.StdVideoEncodeH265SliceSegmentHeader.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.video.StdVideoEncodeH265SliceSegmentHeader.SLICE_ACT_Y_QP_OFFSET
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putByte(r1, r2, r3)
            return
    }

    public static void nslice_act_cb_qp_offset(long r7, byte r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.video.StdVideoEncodeH265SliceSegmentHeader.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.video.StdVideoEncodeH265SliceSegmentHeader.SLICE_ACT_CB_QP_OFFSET
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putByte(r1, r2, r3)
            return
    }

    public static void nslice_act_cr_qp_offset(long r7, byte r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.video.StdVideoEncodeH265SliceSegmentHeader.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.video.StdVideoEncodeH265SliceSegmentHeader.SLICE_ACT_CR_QP_OFFSET
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putByte(r1, r2, r3)
            return
    }

    public static void nslice_qp_delta(long r7, byte r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.video.StdVideoEncodeH265SliceSegmentHeader.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.video.StdVideoEncodeH265SliceSegmentHeader.SLICE_QP_DELTA
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putByte(r1, r2, r3)
            return
    }

    public static void nreserved1(long r7, short r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.video.StdVideoEncodeH265SliceSegmentHeader.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.video.StdVideoEncodeH265SliceSegmentHeader.RESERVED1
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putShort(r1, r2, r3)
            return
    }

    public static void npWeightTable(long r5, org.lwjgl.vulkan.video.StdVideoEncodeH265WeightTable r7) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.video.StdVideoEncodeH265SliceSegmentHeader.PWEIGHTTABLE
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            long r1 = r1.address()
            org.lwjgl.system.MemoryUtil.memPutAddress(r0, r1)
            return
    }

    public static void validate(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.video.StdVideoEncodeH265SliceSegmentHeader.PWEIGHTTABLE
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
            org.lwjgl.vulkan.video.StdVideoEncodeH265SliceSegmentHeader r0 = r0.create(r1, r2)
            return r0
    }

    static {
            r0 = 15
            org.lwjgl.system.Struct$Member[] r0 = new org.lwjgl.system.Struct.Member[r0]
            r1 = r0
            r2 = 0
            int r3 = org.lwjgl.vulkan.video.StdVideoEncodeH265SliceSegmentHeaderFlags.SIZEOF
            int r4 = org.lwjgl.vulkan.video.StdVideoEncodeH265SliceSegmentHeaderFlags.ALIGNOF
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
            r3 = 2
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 14
            int r3 = org.lwjgl.vulkan.video.StdVideoEncodeH265SliceSegmentHeader.POINTER_SIZE
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            org.lwjgl.system.Struct$Layout r0 = __struct(r0)
            r6 = r0
            r0 = r6
            int r0 = r0.getSize()
            org.lwjgl.vulkan.video.StdVideoEncodeH265SliceSegmentHeader.SIZEOF = r0
            r0 = r6
            int r0 = r0.getAlignment()
            org.lwjgl.vulkan.video.StdVideoEncodeH265SliceSegmentHeader.ALIGNOF = r0
            r0 = r6
            r1 = 0
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.video.StdVideoEncodeH265SliceSegmentHeader.FLAGS = r0
            r0 = r6
            r1 = 1
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.video.StdVideoEncodeH265SliceSegmentHeader.SLICE_TYPE = r0
            r0 = r6
            r1 = 2
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.video.StdVideoEncodeH265SliceSegmentHeader.SLICE_SEGMENT_ADDRESS = r0
            r0 = r6
            r1 = 3
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.video.StdVideoEncodeH265SliceSegmentHeader.COLLOCATED_REF_IDX = r0
            r0 = r6
            r1 = 4
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.video.StdVideoEncodeH265SliceSegmentHeader.MAXNUMMERGECAND = r0
            r0 = r6
            r1 = 5
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.video.StdVideoEncodeH265SliceSegmentHeader.SLICE_CB_QP_OFFSET = r0
            r0 = r6
            r1 = 6
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.video.StdVideoEncodeH265SliceSegmentHeader.SLICE_CR_QP_OFFSET = r0
            r0 = r6
            r1 = 7
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.video.StdVideoEncodeH265SliceSegmentHeader.SLICE_BETA_OFFSET_DIV2 = r0
            r0 = r6
            r1 = 8
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.video.StdVideoEncodeH265SliceSegmentHeader.SLICE_TC_OFFSET_DIV2 = r0
            r0 = r6
            r1 = 9
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.video.StdVideoEncodeH265SliceSegmentHeader.SLICE_ACT_Y_QP_OFFSET = r0
            r0 = r6
            r1 = 10
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.video.StdVideoEncodeH265SliceSegmentHeader.SLICE_ACT_CB_QP_OFFSET = r0
            r0 = r6
            r1 = 11
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.video.StdVideoEncodeH265SliceSegmentHeader.SLICE_ACT_CR_QP_OFFSET = r0
            r0 = r6
            r1 = 12
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.video.StdVideoEncodeH265SliceSegmentHeader.SLICE_QP_DELTA = r0
            r0 = r6
            r1 = 13
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.video.StdVideoEncodeH265SliceSegmentHeader.RESERVED1 = r0
            r0 = r6
            r1 = 14
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.video.StdVideoEncodeH265SliceSegmentHeader.PWEIGHTTABLE = r0
            return
    }
}
