package org.lwjgl.vulkan.video;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/video/StdVideoH264PictureParameterSet.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/video/StdVideoH264PictureParameterSet.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/video/StdVideoH264PictureParameterSet.class */
public class StdVideoH264PictureParameterSet extends org.lwjgl.system.Struct<org.lwjgl.vulkan.video.StdVideoH264PictureParameterSet> implements org.lwjgl.system.NativeResource {
    public static final int SIZEOF = 0;
    public static final int ALIGNOF = 0;
    public static final int FLAGS = 0;
    public static final int SEQ_PARAMETER_SET_ID = 0;
    public static final int PIC_PARAMETER_SET_ID = 0;
    public static final int NUM_REF_IDX_L0_DEFAULT_ACTIVE_MINUS1 = 0;
    public static final int NUM_REF_IDX_L1_DEFAULT_ACTIVE_MINUS1 = 0;
    public static final int WEIGHTED_BIPRED_IDC = 0;
    public static final int PIC_INIT_QP_MINUS26 = 0;
    public static final int PIC_INIT_QS_MINUS26 = 0;
    public static final int CHROMA_QP_INDEX_OFFSET = 0;
    public static final int SECOND_CHROMA_QP_INDEX_OFFSET = 0;
    public static final int PSCALINGLISTS = 0;

    /* JADX WARN: Classes with same name are omitted, all sources:
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/video/StdVideoH264PictureParameterSet$Buffer.class
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/video/StdVideoH264PictureParameterSet$Buffer.class
     */
    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/video/StdVideoH264PictureParameterSet$Buffer.class */
    public static class Buffer extends org.lwjgl.system.StructBuffer<org.lwjgl.vulkan.video.StdVideoH264PictureParameterSet, org.lwjgl.vulkan.video.StdVideoH264PictureParameterSet.Buffer> implements org.lwjgl.system.NativeResource {
        private static final org.lwjgl.vulkan.video.StdVideoH264PictureParameterSet ELEMENT_FACTORY = null;

        public Buffer(java.nio.ByteBuffer r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r6
                int r2 = r2.remaining()
                int r3 = org.lwjgl.vulkan.video.StdVideoH264PictureParameterSet.SIZEOF
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
        protected org.lwjgl.vulkan.video.StdVideoH264PictureParameterSet.Buffer self() {
                r2 = this;
                r0 = r2
                return r0
        }

        @Override // org.lwjgl.system.StructBuffer
        protected org.lwjgl.vulkan.video.StdVideoH264PictureParameterSet getElementFactory() {
                r2 = this;
                org.lwjgl.vulkan.video.StdVideoH264PictureParameterSet r0 = org.lwjgl.vulkan.video.StdVideoH264PictureParameterSet.Buffer.ELEMENT_FACTORY
                return r0
        }

        public org.lwjgl.vulkan.video.StdVideoH264PpsFlags flags() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                org.lwjgl.vulkan.video.StdVideoH264PpsFlags r0 = org.lwjgl.vulkan.video.StdVideoH264PictureParameterSet.nflags(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint8_t")
        public byte seq_parameter_set_id() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                byte r0 = org.lwjgl.vulkan.video.StdVideoH264PictureParameterSet.nseq_parameter_set_id(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint8_t")
        public byte pic_parameter_set_id() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                byte r0 = org.lwjgl.vulkan.video.StdVideoH264PictureParameterSet.npic_parameter_set_id(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint8_t")
        public byte num_ref_idx_l0_default_active_minus1() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                byte r0 = org.lwjgl.vulkan.video.StdVideoH264PictureParameterSet.nnum_ref_idx_l0_default_active_minus1(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint8_t")
        public byte num_ref_idx_l1_default_active_minus1() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                byte r0 = org.lwjgl.vulkan.video.StdVideoH264PictureParameterSet.nnum_ref_idx_l1_default_active_minus1(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("StdVideoH264WeightedBipredIdc")
        public int weighted_bipred_idc() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.video.StdVideoH264PictureParameterSet.nweighted_bipred_idc(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("int8_t")
        public byte pic_init_qp_minus26() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                byte r0 = org.lwjgl.vulkan.video.StdVideoH264PictureParameterSet.npic_init_qp_minus26(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("int8_t")
        public byte pic_init_qs_minus26() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                byte r0 = org.lwjgl.vulkan.video.StdVideoH264PictureParameterSet.npic_init_qs_minus26(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("int8_t")
        public byte chroma_qp_index_offset() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                byte r0 = org.lwjgl.vulkan.video.StdVideoH264PictureParameterSet.nchroma_qp_index_offset(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("int8_t")
        public byte second_chroma_qp_index_offset() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                byte r0 = org.lwjgl.vulkan.video.StdVideoH264PictureParameterSet.nsecond_chroma_qp_index_offset(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("StdVideoH264ScalingLists const *")
        public org.lwjgl.vulkan.video.StdVideoH264ScalingLists pScalingLists() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                org.lwjgl.vulkan.video.StdVideoH264ScalingLists r0 = org.lwjgl.vulkan.video.StdVideoH264PictureParameterSet.npScalingLists(r0)
                return r0
        }

        public org.lwjgl.vulkan.video.StdVideoH264PictureParameterSet.Buffer flags(org.lwjgl.vulkan.video.StdVideoH264PpsFlags r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.video.StdVideoH264PictureParameterSet.nflags(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.video.StdVideoH264PictureParameterSet.Buffer flags(java.util.function.Consumer<org.lwjgl.vulkan.video.StdVideoH264PpsFlags> r4) {
                r3 = this;
                r0 = r4
                r1 = r3
                org.lwjgl.vulkan.video.StdVideoH264PpsFlags r1 = r1.flags()
                r0.accept(r1)
                r0 = r3
                return r0
        }

        public org.lwjgl.vulkan.video.StdVideoH264PictureParameterSet.Buffer seq_parameter_set_id(@org.lwjgl.system.NativeType("uint8_t") byte r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.video.StdVideoH264PictureParameterSet.nseq_parameter_set_id(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.video.StdVideoH264PictureParameterSet.Buffer pic_parameter_set_id(@org.lwjgl.system.NativeType("uint8_t") byte r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.video.StdVideoH264PictureParameterSet.npic_parameter_set_id(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.video.StdVideoH264PictureParameterSet.Buffer num_ref_idx_l0_default_active_minus1(@org.lwjgl.system.NativeType("uint8_t") byte r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.video.StdVideoH264PictureParameterSet.nnum_ref_idx_l0_default_active_minus1(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.video.StdVideoH264PictureParameterSet.Buffer num_ref_idx_l1_default_active_minus1(@org.lwjgl.system.NativeType("uint8_t") byte r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.video.StdVideoH264PictureParameterSet.nnum_ref_idx_l1_default_active_minus1(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.video.StdVideoH264PictureParameterSet.Buffer weighted_bipred_idc(@org.lwjgl.system.NativeType("StdVideoH264WeightedBipredIdc") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.video.StdVideoH264PictureParameterSet.nweighted_bipred_idc(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.video.StdVideoH264PictureParameterSet.Buffer pic_init_qp_minus26(@org.lwjgl.system.NativeType("int8_t") byte r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.video.StdVideoH264PictureParameterSet.npic_init_qp_minus26(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.video.StdVideoH264PictureParameterSet.Buffer pic_init_qs_minus26(@org.lwjgl.system.NativeType("int8_t") byte r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.video.StdVideoH264PictureParameterSet.npic_init_qs_minus26(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.video.StdVideoH264PictureParameterSet.Buffer chroma_qp_index_offset(@org.lwjgl.system.NativeType("int8_t") byte r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.video.StdVideoH264PictureParameterSet.nchroma_qp_index_offset(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.video.StdVideoH264PictureParameterSet.Buffer second_chroma_qp_index_offset(@org.lwjgl.system.NativeType("int8_t") byte r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.video.StdVideoH264PictureParameterSet.nsecond_chroma_qp_index_offset(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.video.StdVideoH264PictureParameterSet.Buffer pScalingLists(@org.lwjgl.system.NativeType("StdVideoH264ScalingLists const *") org.lwjgl.vulkan.video.StdVideoH264ScalingLists r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.video.StdVideoH264PictureParameterSet.npScalingLists(r0, r1)
                r0 = r4
                return r0
        }

        @Override // org.lwjgl.system.StructBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.Struct getElementFactory() {
                r2 = this;
                r0 = r2
                org.lwjgl.vulkan.video.StdVideoH264PictureParameterSet r0 = r0.getElementFactory()
                return r0
        }

        @Override // org.lwjgl.system.CustomBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.CustomBuffer self() {
                r2 = this;
                r0 = r2
                org.lwjgl.vulkan.video.StdVideoH264PictureParameterSet$Buffer r0 = r0.self()
                return r0
        }

        static {
                r0 = -1
                org.lwjgl.vulkan.video.StdVideoH264PictureParameterSet r0 = org.lwjgl.vulkan.video.StdVideoH264PictureParameterSet.create(r0)
                org.lwjgl.vulkan.video.StdVideoH264PictureParameterSet.Buffer.ELEMENT_FACTORY = r0
                return
        }
    }

    protected StdVideoH264PictureParameterSet(long r6, @javax.annotation.Nullable java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    protected org.lwjgl.vulkan.video.StdVideoH264PictureParameterSet create(long r7, @javax.annotation.Nullable java.nio.ByteBuffer r9) {
            r6 = this;
            org.lwjgl.vulkan.video.StdVideoH264PictureParameterSet r0 = new org.lwjgl.vulkan.video.StdVideoH264PictureParameterSet
            r1 = r0
            r2 = r7
            r3 = r9
            r1.<init>(r2, r3)
            return r0
    }

    public StdVideoH264PictureParameterSet(java.nio.ByteBuffer r7) {
            r6 = this;
            r0 = r6
            r1 = r7
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            r2 = r7
            int r3 = org.lwjgl.vulkan.video.StdVideoH264PictureParameterSet.SIZEOF
            java.nio.ByteBuffer r2 = __checkContainer(r2, r3)
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
            r2 = this;
            int r0 = org.lwjgl.vulkan.video.StdVideoH264PictureParameterSet.SIZEOF
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoH264PpsFlags flags() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            org.lwjgl.vulkan.video.StdVideoH264PpsFlags r0 = nflags(r0)
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
    public byte pic_parameter_set_id() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            byte r0 = npic_parameter_set_id(r0)
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

    @org.lwjgl.system.NativeType("StdVideoH264WeightedBipredIdc")
    public int weighted_bipred_idc() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nweighted_bipred_idc(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("int8_t")
    public byte pic_init_qp_minus26() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            byte r0 = npic_init_qp_minus26(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("int8_t")
    public byte pic_init_qs_minus26() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            byte r0 = npic_init_qs_minus26(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("int8_t")
    public byte chroma_qp_index_offset() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            byte r0 = nchroma_qp_index_offset(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("int8_t")
    public byte second_chroma_qp_index_offset() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            byte r0 = nsecond_chroma_qp_index_offset(r0)
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

    public org.lwjgl.vulkan.video.StdVideoH264PictureParameterSet flags(org.lwjgl.vulkan.video.StdVideoH264PpsFlags r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nflags(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoH264PictureParameterSet flags(java.util.function.Consumer<org.lwjgl.vulkan.video.StdVideoH264PpsFlags> r4) {
            r3 = this;
            r0 = r4
            r1 = r3
            org.lwjgl.vulkan.video.StdVideoH264PpsFlags r1 = r1.flags()
            r0.accept(r1)
            r0 = r3
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoH264PictureParameterSet seq_parameter_set_id(@org.lwjgl.system.NativeType("uint8_t") byte r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nseq_parameter_set_id(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoH264PictureParameterSet pic_parameter_set_id(@org.lwjgl.system.NativeType("uint8_t") byte r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            npic_parameter_set_id(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoH264PictureParameterSet num_ref_idx_l0_default_active_minus1(@org.lwjgl.system.NativeType("uint8_t") byte r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nnum_ref_idx_l0_default_active_minus1(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoH264PictureParameterSet num_ref_idx_l1_default_active_minus1(@org.lwjgl.system.NativeType("uint8_t") byte r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nnum_ref_idx_l1_default_active_minus1(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoH264PictureParameterSet weighted_bipred_idc(@org.lwjgl.system.NativeType("StdVideoH264WeightedBipredIdc") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nweighted_bipred_idc(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoH264PictureParameterSet pic_init_qp_minus26(@org.lwjgl.system.NativeType("int8_t") byte r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            npic_init_qp_minus26(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoH264PictureParameterSet pic_init_qs_minus26(@org.lwjgl.system.NativeType("int8_t") byte r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            npic_init_qs_minus26(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoH264PictureParameterSet chroma_qp_index_offset(@org.lwjgl.system.NativeType("int8_t") byte r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nchroma_qp_index_offset(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoH264PictureParameterSet second_chroma_qp_index_offset(@org.lwjgl.system.NativeType("int8_t") byte r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nsecond_chroma_qp_index_offset(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoH264PictureParameterSet pScalingLists(@org.lwjgl.system.NativeType("StdVideoH264ScalingLists const *") org.lwjgl.vulkan.video.StdVideoH264ScalingLists r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            npScalingLists(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoH264PictureParameterSet set(org.lwjgl.vulkan.video.StdVideoH264PpsFlags r4, byte r5, byte r6, byte r7, byte r8, int r9, byte r10, byte r11, byte r12, byte r13, org.lwjgl.vulkan.video.StdVideoH264ScalingLists r14) {
            r3 = this;
            r0 = r3
            r1 = r4
            org.lwjgl.vulkan.video.StdVideoH264PictureParameterSet r0 = r0.flags(r1)
            r0 = r3
            r1 = r5
            org.lwjgl.vulkan.video.StdVideoH264PictureParameterSet r0 = r0.seq_parameter_set_id(r1)
            r0 = r3
            r1 = r6
            org.lwjgl.vulkan.video.StdVideoH264PictureParameterSet r0 = r0.pic_parameter_set_id(r1)
            r0 = r3
            r1 = r7
            org.lwjgl.vulkan.video.StdVideoH264PictureParameterSet r0 = r0.num_ref_idx_l0_default_active_minus1(r1)
            r0 = r3
            r1 = r8
            org.lwjgl.vulkan.video.StdVideoH264PictureParameterSet r0 = r0.num_ref_idx_l1_default_active_minus1(r1)
            r0 = r3
            r1 = r9
            org.lwjgl.vulkan.video.StdVideoH264PictureParameterSet r0 = r0.weighted_bipred_idc(r1)
            r0 = r3
            r1 = r10
            org.lwjgl.vulkan.video.StdVideoH264PictureParameterSet r0 = r0.pic_init_qp_minus26(r1)
            r0 = r3
            r1 = r11
            org.lwjgl.vulkan.video.StdVideoH264PictureParameterSet r0 = r0.pic_init_qs_minus26(r1)
            r0 = r3
            r1 = r12
            org.lwjgl.vulkan.video.StdVideoH264PictureParameterSet r0 = r0.chroma_qp_index_offset(r1)
            r0 = r3
            r1 = r13
            org.lwjgl.vulkan.video.StdVideoH264PictureParameterSet r0 = r0.second_chroma_qp_index_offset(r1)
            r0 = r3
            r1 = r14
            org.lwjgl.vulkan.video.StdVideoH264PictureParameterSet r0 = r0.pScalingLists(r1)
            r0 = r3
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoH264PictureParameterSet set(org.lwjgl.vulkan.video.StdVideoH264PictureParameterSet r8) {
            r7 = this;
            r0 = r8
            long r0 = r0.address()
            r1 = r7
            long r1 = r1.address()
            int r2 = org.lwjgl.vulkan.video.StdVideoH264PictureParameterSet.SIZEOF
            long r2 = (long) r2
            org.lwjgl.system.MemoryUtil.memCopy(r0, r1, r2)
            r0 = r7
            return r0
    }

    public static org.lwjgl.vulkan.video.StdVideoH264PictureParameterSet malloc() {
            org.lwjgl.vulkan.video.StdVideoH264PictureParameterSet r0 = new org.lwjgl.vulkan.video.StdVideoH264PictureParameterSet
            r1 = r0
            int r2 = org.lwjgl.vulkan.video.StdVideoH264PictureParameterSet.SIZEOF
            long r2 = (long) r2
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.video.StdVideoH264PictureParameterSet calloc() {
            org.lwjgl.vulkan.video.StdVideoH264PictureParameterSet r0 = new org.lwjgl.vulkan.video.StdVideoH264PictureParameterSet
            r1 = r0
            r2 = 1
            int r3 = org.lwjgl.vulkan.video.StdVideoH264PictureParameterSet.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.video.StdVideoH264PictureParameterSet create() {
            int r0 = org.lwjgl.vulkan.video.StdVideoH264PictureParameterSet.SIZEOF
            java.nio.ByteBuffer r0 = org.lwjgl.BufferUtils.createByteBuffer(r0)
            r6 = r0
            org.lwjgl.vulkan.video.StdVideoH264PictureParameterSet r0 = new org.lwjgl.vulkan.video.StdVideoH264PictureParameterSet
            r1 = r0
            r2 = r6
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.video.StdVideoH264PictureParameterSet create(long r6) {
            org.lwjgl.vulkan.video.StdVideoH264PictureParameterSet r0 = new org.lwjgl.vulkan.video.StdVideoH264PictureParameterSet
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.vulkan.video.StdVideoH264PictureParameterSet createSafe(long r6) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.vulkan.video.StdVideoH264PictureParameterSet r0 = new org.lwjgl.vulkan.video.StdVideoH264PictureParameterSet
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static org.lwjgl.vulkan.video.StdVideoH264PictureParameterSet.Buffer malloc(int r6) {
            org.lwjgl.vulkan.video.StdVideoH264PictureParameterSet$Buffer r0 = new org.lwjgl.vulkan.video.StdVideoH264PictureParameterSet$Buffer
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.vulkan.video.StdVideoH264PictureParameterSet.SIZEOF
            long r2 = __checkMalloc(r2, r3)
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.video.StdVideoH264PictureParameterSet.Buffer calloc(int r7) {
            org.lwjgl.vulkan.video.StdVideoH264PictureParameterSet$Buffer r0 = new org.lwjgl.vulkan.video.StdVideoH264PictureParameterSet$Buffer
            r1 = r0
            r2 = r7
            long r2 = (long) r2
            int r3 = org.lwjgl.vulkan.video.StdVideoH264PictureParameterSet.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.video.StdVideoH264PictureParameterSet.Buffer create(int r10) {
            r0 = r10
            int r1 = org.lwjgl.vulkan.video.StdVideoH264PictureParameterSet.SIZEOF
            java.nio.ByteBuffer r0 = __create(r0, r1)
            r11 = r0
            org.lwjgl.vulkan.video.StdVideoH264PictureParameterSet$Buffer r0 = new org.lwjgl.vulkan.video.StdVideoH264PictureParameterSet$Buffer
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

    public static org.lwjgl.vulkan.video.StdVideoH264PictureParameterSet.Buffer create(long r6, int r8) {
            org.lwjgl.vulkan.video.StdVideoH264PictureParameterSet$Buffer r0 = new org.lwjgl.vulkan.video.StdVideoH264PictureParameterSet$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.vulkan.video.StdVideoH264PictureParameterSet.Buffer createSafe(long r6, int r8) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.vulkan.video.StdVideoH264PictureParameterSet$Buffer r0 = new org.lwjgl.vulkan.video.StdVideoH264PictureParameterSet$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static org.lwjgl.vulkan.video.StdVideoH264PictureParameterSet malloc(org.lwjgl.system.MemoryStack r6) {
            org.lwjgl.vulkan.video.StdVideoH264PictureParameterSet r0 = new org.lwjgl.vulkan.video.StdVideoH264PictureParameterSet
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.vulkan.video.StdVideoH264PictureParameterSet.ALIGNOF
            int r4 = org.lwjgl.vulkan.video.StdVideoH264PictureParameterSet.SIZEOF
            long r2 = r2.nmalloc(r3, r4)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.video.StdVideoH264PictureParameterSet calloc(org.lwjgl.system.MemoryStack r7) {
            org.lwjgl.vulkan.video.StdVideoH264PictureParameterSet r0 = new org.lwjgl.vulkan.video.StdVideoH264PictureParameterSet
            r1 = r0
            r2 = r7
            int r3 = org.lwjgl.vulkan.video.StdVideoH264PictureParameterSet.ALIGNOF
            r4 = 1
            int r5 = org.lwjgl.vulkan.video.StdVideoH264PictureParameterSet.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.video.StdVideoH264PictureParameterSet.Buffer malloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.vulkan.video.StdVideoH264PictureParameterSet$Buffer r0 = new org.lwjgl.vulkan.video.StdVideoH264PictureParameterSet$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.vulkan.video.StdVideoH264PictureParameterSet.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.vulkan.video.StdVideoH264PictureParameterSet.SIZEOF
            int r4 = r4 * r5
            long r2 = r2.nmalloc(r3, r4)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.video.StdVideoH264PictureParameterSet.Buffer calloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.vulkan.video.StdVideoH264PictureParameterSet$Buffer r0 = new org.lwjgl.vulkan.video.StdVideoH264PictureParameterSet$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.vulkan.video.StdVideoH264PictureParameterSet.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.vulkan.video.StdVideoH264PictureParameterSet.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.video.StdVideoH264PpsFlags nflags(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.video.StdVideoH264PictureParameterSet.FLAGS
            long r1 = (long) r1
            long r0 = r0 + r1
            org.lwjgl.vulkan.video.StdVideoH264PpsFlags r0 = org.lwjgl.vulkan.video.StdVideoH264PpsFlags.create(r0)
            return r0
    }

    public static byte nseq_parameter_set_id(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.video.StdVideoH264PictureParameterSet.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.video.StdVideoH264PictureParameterSet.SEQ_PARAMETER_SET_ID
            long r3 = (long) r3
            long r2 = r2 + r3
            byte r0 = r0.getByte(r1, r2)
            return r0
    }

    public static byte npic_parameter_set_id(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.video.StdVideoH264PictureParameterSet.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.video.StdVideoH264PictureParameterSet.PIC_PARAMETER_SET_ID
            long r3 = (long) r3
            long r2 = r2 + r3
            byte r0 = r0.getByte(r1, r2)
            return r0
    }

    public static byte nnum_ref_idx_l0_default_active_minus1(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.video.StdVideoH264PictureParameterSet.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.video.StdVideoH264PictureParameterSet.NUM_REF_IDX_L0_DEFAULT_ACTIVE_MINUS1
            long r3 = (long) r3
            long r2 = r2 + r3
            byte r0 = r0.getByte(r1, r2)
            return r0
    }

    public static byte nnum_ref_idx_l1_default_active_minus1(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.video.StdVideoH264PictureParameterSet.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.video.StdVideoH264PictureParameterSet.NUM_REF_IDX_L1_DEFAULT_ACTIVE_MINUS1
            long r3 = (long) r3
            long r2 = r2 + r3
            byte r0 = r0.getByte(r1, r2)
            return r0
    }

    public static int nweighted_bipred_idc(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.video.StdVideoH264PictureParameterSet.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.video.StdVideoH264PictureParameterSet.WEIGHTED_BIPRED_IDC
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static byte npic_init_qp_minus26(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.video.StdVideoH264PictureParameterSet.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.video.StdVideoH264PictureParameterSet.PIC_INIT_QP_MINUS26
            long r3 = (long) r3
            long r2 = r2 + r3
            byte r0 = r0.getByte(r1, r2)
            return r0
    }

    public static byte npic_init_qs_minus26(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.video.StdVideoH264PictureParameterSet.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.video.StdVideoH264PictureParameterSet.PIC_INIT_QS_MINUS26
            long r3 = (long) r3
            long r2 = r2 + r3
            byte r0 = r0.getByte(r1, r2)
            return r0
    }

    public static byte nchroma_qp_index_offset(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.video.StdVideoH264PictureParameterSet.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.video.StdVideoH264PictureParameterSet.CHROMA_QP_INDEX_OFFSET
            long r3 = (long) r3
            long r2 = r2 + r3
            byte r0 = r0.getByte(r1, r2)
            return r0
    }

    public static byte nsecond_chroma_qp_index_offset(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.video.StdVideoH264PictureParameterSet.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.video.StdVideoH264PictureParameterSet.SECOND_CHROMA_QP_INDEX_OFFSET
            long r3 = (long) r3
            long r2 = r2 + r3
            byte r0 = r0.getByte(r1, r2)
            return r0
    }

    public static org.lwjgl.vulkan.video.StdVideoH264ScalingLists npScalingLists(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.video.StdVideoH264PictureParameterSet.PSCALINGLISTS
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            org.lwjgl.vulkan.video.StdVideoH264ScalingLists r0 = org.lwjgl.vulkan.video.StdVideoH264ScalingLists.create(r0)
            return r0
    }

    public static void nflags(long r7, org.lwjgl.vulkan.video.StdVideoH264PpsFlags r9) {
            r0 = r9
            long r0 = r0.address()
            r1 = r7
            int r2 = org.lwjgl.vulkan.video.StdVideoH264PictureParameterSet.FLAGS
            long r2 = (long) r2
            long r1 = r1 + r2
            int r2 = org.lwjgl.vulkan.video.StdVideoH264PpsFlags.SIZEOF
            long r2 = (long) r2
            org.lwjgl.system.MemoryUtil.memCopy(r0, r1, r2)
            return
    }

    public static void nseq_parameter_set_id(long r7, byte r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.video.StdVideoH264PictureParameterSet.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.video.StdVideoH264PictureParameterSet.SEQ_PARAMETER_SET_ID
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putByte(r1, r2, r3)
            return
    }

    public static void npic_parameter_set_id(long r7, byte r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.video.StdVideoH264PictureParameterSet.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.video.StdVideoH264PictureParameterSet.PIC_PARAMETER_SET_ID
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putByte(r1, r2, r3)
            return
    }

    public static void nnum_ref_idx_l0_default_active_minus1(long r7, byte r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.video.StdVideoH264PictureParameterSet.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.video.StdVideoH264PictureParameterSet.NUM_REF_IDX_L0_DEFAULT_ACTIVE_MINUS1
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putByte(r1, r2, r3)
            return
    }

    public static void nnum_ref_idx_l1_default_active_minus1(long r7, byte r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.video.StdVideoH264PictureParameterSet.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.video.StdVideoH264PictureParameterSet.NUM_REF_IDX_L1_DEFAULT_ACTIVE_MINUS1
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putByte(r1, r2, r3)
            return
    }

    public static void nweighted_bipred_idc(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.video.StdVideoH264PictureParameterSet.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.video.StdVideoH264PictureParameterSet.WEIGHTED_BIPRED_IDC
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void npic_init_qp_minus26(long r7, byte r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.video.StdVideoH264PictureParameterSet.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.video.StdVideoH264PictureParameterSet.PIC_INIT_QP_MINUS26
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putByte(r1, r2, r3)
            return
    }

    public static void npic_init_qs_minus26(long r7, byte r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.video.StdVideoH264PictureParameterSet.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.video.StdVideoH264PictureParameterSet.PIC_INIT_QS_MINUS26
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putByte(r1, r2, r3)
            return
    }

    public static void nchroma_qp_index_offset(long r7, byte r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.video.StdVideoH264PictureParameterSet.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.video.StdVideoH264PictureParameterSet.CHROMA_QP_INDEX_OFFSET
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putByte(r1, r2, r3)
            return
    }

    public static void nsecond_chroma_qp_index_offset(long r7, byte r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.video.StdVideoH264PictureParameterSet.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.video.StdVideoH264PictureParameterSet.SECOND_CHROMA_QP_INDEX_OFFSET
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putByte(r1, r2, r3)
            return
    }

    public static void npScalingLists(long r5, org.lwjgl.vulkan.video.StdVideoH264ScalingLists r7) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.video.StdVideoH264PictureParameterSet.PSCALINGLISTS
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            long r1 = r1.address()
            org.lwjgl.system.MemoryUtil.memPutAddress(r0, r1)
            return
    }

    public static void validate(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.video.StdVideoH264PictureParameterSet.PSCALINGLISTS
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
            org.lwjgl.vulkan.video.StdVideoH264PictureParameterSet r0 = r0.create(r1, r2)
            return r0
    }

    static {
            r0 = 11
            org.lwjgl.system.Struct$Member[] r0 = new org.lwjgl.system.Struct.Member[r0]
            r1 = r0
            r2 = 0
            int r3 = org.lwjgl.vulkan.video.StdVideoH264PpsFlags.SIZEOF
            int r4 = org.lwjgl.vulkan.video.StdVideoH264PpsFlags.ALIGNOF
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
            r3 = 4
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
            int r3 = org.lwjgl.vulkan.video.StdVideoH264PictureParameterSet.POINTER_SIZE
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            org.lwjgl.system.Struct$Layout r0 = __struct(r0)
            r6 = r0
            r0 = r6
            int r0 = r0.getSize()
            org.lwjgl.vulkan.video.StdVideoH264PictureParameterSet.SIZEOF = r0
            r0 = r6
            int r0 = r0.getAlignment()
            org.lwjgl.vulkan.video.StdVideoH264PictureParameterSet.ALIGNOF = r0
            r0 = r6
            r1 = 0
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.video.StdVideoH264PictureParameterSet.FLAGS = r0
            r0 = r6
            r1 = 1
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.video.StdVideoH264PictureParameterSet.SEQ_PARAMETER_SET_ID = r0
            r0 = r6
            r1 = 2
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.video.StdVideoH264PictureParameterSet.PIC_PARAMETER_SET_ID = r0
            r0 = r6
            r1 = 3
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.video.StdVideoH264PictureParameterSet.NUM_REF_IDX_L0_DEFAULT_ACTIVE_MINUS1 = r0
            r0 = r6
            r1 = 4
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.video.StdVideoH264PictureParameterSet.NUM_REF_IDX_L1_DEFAULT_ACTIVE_MINUS1 = r0
            r0 = r6
            r1 = 5
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.video.StdVideoH264PictureParameterSet.WEIGHTED_BIPRED_IDC = r0
            r0 = r6
            r1 = 6
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.video.StdVideoH264PictureParameterSet.PIC_INIT_QP_MINUS26 = r0
            r0 = r6
            r1 = 7
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.video.StdVideoH264PictureParameterSet.PIC_INIT_QS_MINUS26 = r0
            r0 = r6
            r1 = 8
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.video.StdVideoH264PictureParameterSet.CHROMA_QP_INDEX_OFFSET = r0
            r0 = r6
            r1 = 9
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.video.StdVideoH264PictureParameterSet.SECOND_CHROMA_QP_INDEX_OFFSET = r0
            r0 = r6
            r1 = 10
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.video.StdVideoH264PictureParameterSet.PSCALINGLISTS = r0
            return
    }
}
