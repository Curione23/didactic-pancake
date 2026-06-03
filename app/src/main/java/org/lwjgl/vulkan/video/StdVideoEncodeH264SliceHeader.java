package org.lwjgl.vulkan.video;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/video/StdVideoEncodeH264SliceHeader.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/video/StdVideoEncodeH264SliceHeader.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/video/StdVideoEncodeH264SliceHeader.class */
public class StdVideoEncodeH264SliceHeader extends org.lwjgl.system.Struct<org.lwjgl.vulkan.video.StdVideoEncodeH264SliceHeader> implements org.lwjgl.system.NativeResource {
    public static final int SIZEOF = 0;
    public static final int ALIGNOF = 0;
    public static final int FLAGS = 0;
    public static final int FIRST_MB_IN_SLICE = 0;
    public static final int SLICE_TYPE = 0;
    public static final int SLICE_ALPHA_C0_OFFSET_DIV2 = 0;
    public static final int SLICE_BETA_OFFSET_DIV2 = 0;
    public static final int SLICE_QP_DELTA = 0;
    public static final int RESERVED1 = 0;
    public static final int CABAC_INIT_IDC = 0;
    public static final int DISABLE_DEBLOCKING_FILTER_IDC = 0;
    public static final int PWEIGHTTABLE = 0;

    /* JADX WARN: Classes with same name are omitted, all sources:
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/video/StdVideoEncodeH264SliceHeader$Buffer.class
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/video/StdVideoEncodeH264SliceHeader$Buffer.class
     */
    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/video/StdVideoEncodeH264SliceHeader$Buffer.class */
    public static class Buffer extends org.lwjgl.system.StructBuffer<org.lwjgl.vulkan.video.StdVideoEncodeH264SliceHeader, org.lwjgl.vulkan.video.StdVideoEncodeH264SliceHeader.Buffer> implements org.lwjgl.system.NativeResource {
        private static final org.lwjgl.vulkan.video.StdVideoEncodeH264SliceHeader ELEMENT_FACTORY = null;

        public Buffer(java.nio.ByteBuffer r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r6
                int r2 = r2.remaining()
                int r3 = org.lwjgl.vulkan.video.StdVideoEncodeH264SliceHeader.SIZEOF
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
        protected org.lwjgl.vulkan.video.StdVideoEncodeH264SliceHeader.Buffer self() {
                r2 = this;
                r0 = r2
                return r0
        }

        @Override // org.lwjgl.system.StructBuffer
        protected org.lwjgl.vulkan.video.StdVideoEncodeH264SliceHeader getElementFactory() {
                r2 = this;
                org.lwjgl.vulkan.video.StdVideoEncodeH264SliceHeader r0 = org.lwjgl.vulkan.video.StdVideoEncodeH264SliceHeader.Buffer.ELEMENT_FACTORY
                return r0
        }

        public org.lwjgl.vulkan.video.StdVideoEncodeH264SliceHeaderFlags flags() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                org.lwjgl.vulkan.video.StdVideoEncodeH264SliceHeaderFlags r0 = org.lwjgl.vulkan.video.StdVideoEncodeH264SliceHeader.nflags(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint32_t")
        public int first_mb_in_slice() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.video.StdVideoEncodeH264SliceHeader.nfirst_mb_in_slice(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("StdVideoH264SliceType")
        public int slice_type() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.video.StdVideoEncodeH264SliceHeader.nslice_type(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("int8_t")
        public byte slice_alpha_c0_offset_div2() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                byte r0 = org.lwjgl.vulkan.video.StdVideoEncodeH264SliceHeader.nslice_alpha_c0_offset_div2(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("int8_t")
        public byte slice_beta_offset_div2() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                byte r0 = org.lwjgl.vulkan.video.StdVideoEncodeH264SliceHeader.nslice_beta_offset_div2(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("int8_t")
        public byte slice_qp_delta() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                byte r0 = org.lwjgl.vulkan.video.StdVideoEncodeH264SliceHeader.nslice_qp_delta(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("StdVideoH264CabacInitIdc")
        public int cabac_init_idc() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.video.StdVideoEncodeH264SliceHeader.ncabac_init_idc(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("StdVideoH264DisableDeblockingFilterIdc")
        public int disable_deblocking_filter_idc() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.video.StdVideoEncodeH264SliceHeader.ndisable_deblocking_filter_idc(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("StdVideoEncodeH264WeightTable const *")
        public org.lwjgl.vulkan.video.StdVideoEncodeH264WeightTable pWeightTable() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                org.lwjgl.vulkan.video.StdVideoEncodeH264WeightTable r0 = org.lwjgl.vulkan.video.StdVideoEncodeH264SliceHeader.npWeightTable(r0)
                return r0
        }

        public org.lwjgl.vulkan.video.StdVideoEncodeH264SliceHeader.Buffer flags(org.lwjgl.vulkan.video.StdVideoEncodeH264SliceHeaderFlags r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.video.StdVideoEncodeH264SliceHeader.nflags(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.video.StdVideoEncodeH264SliceHeader.Buffer flags(java.util.function.Consumer<org.lwjgl.vulkan.video.StdVideoEncodeH264SliceHeaderFlags> r4) {
                r3 = this;
                r0 = r4
                r1 = r3
                org.lwjgl.vulkan.video.StdVideoEncodeH264SliceHeaderFlags r1 = r1.flags()
                r0.accept(r1)
                r0 = r3
                return r0
        }

        public org.lwjgl.vulkan.video.StdVideoEncodeH264SliceHeader.Buffer first_mb_in_slice(@org.lwjgl.system.NativeType("uint32_t") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.video.StdVideoEncodeH264SliceHeader.nfirst_mb_in_slice(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.video.StdVideoEncodeH264SliceHeader.Buffer slice_type(@org.lwjgl.system.NativeType("StdVideoH264SliceType") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.video.StdVideoEncodeH264SliceHeader.nslice_type(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.video.StdVideoEncodeH264SliceHeader.Buffer slice_alpha_c0_offset_div2(@org.lwjgl.system.NativeType("int8_t") byte r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.video.StdVideoEncodeH264SliceHeader.nslice_alpha_c0_offset_div2(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.video.StdVideoEncodeH264SliceHeader.Buffer slice_beta_offset_div2(@org.lwjgl.system.NativeType("int8_t") byte r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.video.StdVideoEncodeH264SliceHeader.nslice_beta_offset_div2(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.video.StdVideoEncodeH264SliceHeader.Buffer slice_qp_delta(@org.lwjgl.system.NativeType("int8_t") byte r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.video.StdVideoEncodeH264SliceHeader.nslice_qp_delta(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.video.StdVideoEncodeH264SliceHeader.Buffer cabac_init_idc(@org.lwjgl.system.NativeType("StdVideoH264CabacInitIdc") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.video.StdVideoEncodeH264SliceHeader.ncabac_init_idc(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.video.StdVideoEncodeH264SliceHeader.Buffer disable_deblocking_filter_idc(@org.lwjgl.system.NativeType("StdVideoH264DisableDeblockingFilterIdc") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.video.StdVideoEncodeH264SliceHeader.ndisable_deblocking_filter_idc(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.video.StdVideoEncodeH264SliceHeader.Buffer pWeightTable(@org.lwjgl.system.NativeType("StdVideoEncodeH264WeightTable const *") org.lwjgl.vulkan.video.StdVideoEncodeH264WeightTable r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.video.StdVideoEncodeH264SliceHeader.npWeightTable(r0, r1)
                r0 = r4
                return r0
        }

        @Override // org.lwjgl.system.StructBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.Struct getElementFactory() {
                r2 = this;
                r0 = r2
                org.lwjgl.vulkan.video.StdVideoEncodeH264SliceHeader r0 = r0.getElementFactory()
                return r0
        }

        @Override // org.lwjgl.system.CustomBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.CustomBuffer self() {
                r2 = this;
                r0 = r2
                org.lwjgl.vulkan.video.StdVideoEncodeH264SliceHeader$Buffer r0 = r0.self()
                return r0
        }

        static {
                r0 = -1
                org.lwjgl.vulkan.video.StdVideoEncodeH264SliceHeader r0 = org.lwjgl.vulkan.video.StdVideoEncodeH264SliceHeader.create(r0)
                org.lwjgl.vulkan.video.StdVideoEncodeH264SliceHeader.Buffer.ELEMENT_FACTORY = r0
                return
        }
    }

    protected StdVideoEncodeH264SliceHeader(long r6, @javax.annotation.Nullable java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    protected org.lwjgl.vulkan.video.StdVideoEncodeH264SliceHeader create(long r7, @javax.annotation.Nullable java.nio.ByteBuffer r9) {
            r6 = this;
            org.lwjgl.vulkan.video.StdVideoEncodeH264SliceHeader r0 = new org.lwjgl.vulkan.video.StdVideoEncodeH264SliceHeader
            r1 = r0
            r2 = r7
            r3 = r9
            r1.<init>(r2, r3)
            return r0
    }

    public StdVideoEncodeH264SliceHeader(java.nio.ByteBuffer r7) {
            r6 = this;
            r0 = r6
            r1 = r7
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            r2 = r7
            int r3 = org.lwjgl.vulkan.video.StdVideoEncodeH264SliceHeader.SIZEOF
            java.nio.ByteBuffer r2 = __checkContainer(r2, r3)
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
            r2 = this;
            int r0 = org.lwjgl.vulkan.video.StdVideoEncodeH264SliceHeader.SIZEOF
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoEncodeH264SliceHeaderFlags flags() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            org.lwjgl.vulkan.video.StdVideoEncodeH264SliceHeaderFlags r0 = nflags(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("uint32_t")
    public int first_mb_in_slice() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nfirst_mb_in_slice(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("StdVideoH264SliceType")
    public int slice_type() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nslice_type(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("int8_t")
    public byte slice_alpha_c0_offset_div2() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            byte r0 = nslice_alpha_c0_offset_div2(r0)
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
    public byte slice_qp_delta() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            byte r0 = nslice_qp_delta(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("StdVideoH264CabacInitIdc")
    public int cabac_init_idc() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = ncabac_init_idc(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("StdVideoH264DisableDeblockingFilterIdc")
    public int disable_deblocking_filter_idc() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = ndisable_deblocking_filter_idc(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("StdVideoEncodeH264WeightTable const *")
    public org.lwjgl.vulkan.video.StdVideoEncodeH264WeightTable pWeightTable() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            org.lwjgl.vulkan.video.StdVideoEncodeH264WeightTable r0 = npWeightTable(r0)
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoEncodeH264SliceHeader flags(org.lwjgl.vulkan.video.StdVideoEncodeH264SliceHeaderFlags r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nflags(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoEncodeH264SliceHeader flags(java.util.function.Consumer<org.lwjgl.vulkan.video.StdVideoEncodeH264SliceHeaderFlags> r4) {
            r3 = this;
            r0 = r4
            r1 = r3
            org.lwjgl.vulkan.video.StdVideoEncodeH264SliceHeaderFlags r1 = r1.flags()
            r0.accept(r1)
            r0 = r3
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoEncodeH264SliceHeader first_mb_in_slice(@org.lwjgl.system.NativeType("uint32_t") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nfirst_mb_in_slice(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoEncodeH264SliceHeader slice_type(@org.lwjgl.system.NativeType("StdVideoH264SliceType") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nslice_type(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoEncodeH264SliceHeader slice_alpha_c0_offset_div2(@org.lwjgl.system.NativeType("int8_t") byte r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nslice_alpha_c0_offset_div2(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoEncodeH264SliceHeader slice_beta_offset_div2(@org.lwjgl.system.NativeType("int8_t") byte r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nslice_beta_offset_div2(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoEncodeH264SliceHeader slice_qp_delta(@org.lwjgl.system.NativeType("int8_t") byte r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nslice_qp_delta(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoEncodeH264SliceHeader cabac_init_idc(@org.lwjgl.system.NativeType("StdVideoH264CabacInitIdc") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            ncabac_init_idc(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoEncodeH264SliceHeader disable_deblocking_filter_idc(@org.lwjgl.system.NativeType("StdVideoH264DisableDeblockingFilterIdc") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            ndisable_deblocking_filter_idc(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoEncodeH264SliceHeader pWeightTable(@org.lwjgl.system.NativeType("StdVideoEncodeH264WeightTable const *") org.lwjgl.vulkan.video.StdVideoEncodeH264WeightTable r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            npWeightTable(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoEncodeH264SliceHeader set(org.lwjgl.vulkan.video.StdVideoEncodeH264SliceHeaderFlags r4, int r5, int r6, byte r7, byte r8, byte r9, int r10, int r11, org.lwjgl.vulkan.video.StdVideoEncodeH264WeightTable r12) {
            r3 = this;
            r0 = r3
            r1 = r4
            org.lwjgl.vulkan.video.StdVideoEncodeH264SliceHeader r0 = r0.flags(r1)
            r0 = r3
            r1 = r5
            org.lwjgl.vulkan.video.StdVideoEncodeH264SliceHeader r0 = r0.first_mb_in_slice(r1)
            r0 = r3
            r1 = r6
            org.lwjgl.vulkan.video.StdVideoEncodeH264SliceHeader r0 = r0.slice_type(r1)
            r0 = r3
            r1 = r7
            org.lwjgl.vulkan.video.StdVideoEncodeH264SliceHeader r0 = r0.slice_alpha_c0_offset_div2(r1)
            r0 = r3
            r1 = r8
            org.lwjgl.vulkan.video.StdVideoEncodeH264SliceHeader r0 = r0.slice_beta_offset_div2(r1)
            r0 = r3
            r1 = r9
            org.lwjgl.vulkan.video.StdVideoEncodeH264SliceHeader r0 = r0.slice_qp_delta(r1)
            r0 = r3
            r1 = r10
            org.lwjgl.vulkan.video.StdVideoEncodeH264SliceHeader r0 = r0.cabac_init_idc(r1)
            r0 = r3
            r1 = r11
            org.lwjgl.vulkan.video.StdVideoEncodeH264SliceHeader r0 = r0.disable_deblocking_filter_idc(r1)
            r0 = r3
            r1 = r12
            org.lwjgl.vulkan.video.StdVideoEncodeH264SliceHeader r0 = r0.pWeightTable(r1)
            r0 = r3
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoEncodeH264SliceHeader set(org.lwjgl.vulkan.video.StdVideoEncodeH264SliceHeader r8) {
            r7 = this;
            r0 = r8
            long r0 = r0.address()
            r1 = r7
            long r1 = r1.address()
            int r2 = org.lwjgl.vulkan.video.StdVideoEncodeH264SliceHeader.SIZEOF
            long r2 = (long) r2
            org.lwjgl.system.MemoryUtil.memCopy(r0, r1, r2)
            r0 = r7
            return r0
    }

    public static org.lwjgl.vulkan.video.StdVideoEncodeH264SliceHeader malloc() {
            org.lwjgl.vulkan.video.StdVideoEncodeH264SliceHeader r0 = new org.lwjgl.vulkan.video.StdVideoEncodeH264SliceHeader
            r1 = r0
            int r2 = org.lwjgl.vulkan.video.StdVideoEncodeH264SliceHeader.SIZEOF
            long r2 = (long) r2
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.video.StdVideoEncodeH264SliceHeader calloc() {
            org.lwjgl.vulkan.video.StdVideoEncodeH264SliceHeader r0 = new org.lwjgl.vulkan.video.StdVideoEncodeH264SliceHeader
            r1 = r0
            r2 = 1
            int r3 = org.lwjgl.vulkan.video.StdVideoEncodeH264SliceHeader.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.video.StdVideoEncodeH264SliceHeader create() {
            int r0 = org.lwjgl.vulkan.video.StdVideoEncodeH264SliceHeader.SIZEOF
            java.nio.ByteBuffer r0 = org.lwjgl.BufferUtils.createByteBuffer(r0)
            r6 = r0
            org.lwjgl.vulkan.video.StdVideoEncodeH264SliceHeader r0 = new org.lwjgl.vulkan.video.StdVideoEncodeH264SliceHeader
            r1 = r0
            r2 = r6
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.video.StdVideoEncodeH264SliceHeader create(long r6) {
            org.lwjgl.vulkan.video.StdVideoEncodeH264SliceHeader r0 = new org.lwjgl.vulkan.video.StdVideoEncodeH264SliceHeader
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.vulkan.video.StdVideoEncodeH264SliceHeader createSafe(long r6) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.vulkan.video.StdVideoEncodeH264SliceHeader r0 = new org.lwjgl.vulkan.video.StdVideoEncodeH264SliceHeader
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static org.lwjgl.vulkan.video.StdVideoEncodeH264SliceHeader.Buffer malloc(int r6) {
            org.lwjgl.vulkan.video.StdVideoEncodeH264SliceHeader$Buffer r0 = new org.lwjgl.vulkan.video.StdVideoEncodeH264SliceHeader$Buffer
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.vulkan.video.StdVideoEncodeH264SliceHeader.SIZEOF
            long r2 = __checkMalloc(r2, r3)
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.video.StdVideoEncodeH264SliceHeader.Buffer calloc(int r7) {
            org.lwjgl.vulkan.video.StdVideoEncodeH264SliceHeader$Buffer r0 = new org.lwjgl.vulkan.video.StdVideoEncodeH264SliceHeader$Buffer
            r1 = r0
            r2 = r7
            long r2 = (long) r2
            int r3 = org.lwjgl.vulkan.video.StdVideoEncodeH264SliceHeader.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.video.StdVideoEncodeH264SliceHeader.Buffer create(int r10) {
            r0 = r10
            int r1 = org.lwjgl.vulkan.video.StdVideoEncodeH264SliceHeader.SIZEOF
            java.nio.ByteBuffer r0 = __create(r0, r1)
            r11 = r0
            org.lwjgl.vulkan.video.StdVideoEncodeH264SliceHeader$Buffer r0 = new org.lwjgl.vulkan.video.StdVideoEncodeH264SliceHeader$Buffer
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

    public static org.lwjgl.vulkan.video.StdVideoEncodeH264SliceHeader.Buffer create(long r6, int r8) {
            org.lwjgl.vulkan.video.StdVideoEncodeH264SliceHeader$Buffer r0 = new org.lwjgl.vulkan.video.StdVideoEncodeH264SliceHeader$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.vulkan.video.StdVideoEncodeH264SliceHeader.Buffer createSafe(long r6, int r8) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.vulkan.video.StdVideoEncodeH264SliceHeader$Buffer r0 = new org.lwjgl.vulkan.video.StdVideoEncodeH264SliceHeader$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static org.lwjgl.vulkan.video.StdVideoEncodeH264SliceHeader malloc(org.lwjgl.system.MemoryStack r6) {
            org.lwjgl.vulkan.video.StdVideoEncodeH264SliceHeader r0 = new org.lwjgl.vulkan.video.StdVideoEncodeH264SliceHeader
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.vulkan.video.StdVideoEncodeH264SliceHeader.ALIGNOF
            int r4 = org.lwjgl.vulkan.video.StdVideoEncodeH264SliceHeader.SIZEOF
            long r2 = r2.nmalloc(r3, r4)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.video.StdVideoEncodeH264SliceHeader calloc(org.lwjgl.system.MemoryStack r7) {
            org.lwjgl.vulkan.video.StdVideoEncodeH264SliceHeader r0 = new org.lwjgl.vulkan.video.StdVideoEncodeH264SliceHeader
            r1 = r0
            r2 = r7
            int r3 = org.lwjgl.vulkan.video.StdVideoEncodeH264SliceHeader.ALIGNOF
            r4 = 1
            int r5 = org.lwjgl.vulkan.video.StdVideoEncodeH264SliceHeader.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.video.StdVideoEncodeH264SliceHeader.Buffer malloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.vulkan.video.StdVideoEncodeH264SliceHeader$Buffer r0 = new org.lwjgl.vulkan.video.StdVideoEncodeH264SliceHeader$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.vulkan.video.StdVideoEncodeH264SliceHeader.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.vulkan.video.StdVideoEncodeH264SliceHeader.SIZEOF
            int r4 = r4 * r5
            long r2 = r2.nmalloc(r3, r4)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.video.StdVideoEncodeH264SliceHeader.Buffer calloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.vulkan.video.StdVideoEncodeH264SliceHeader$Buffer r0 = new org.lwjgl.vulkan.video.StdVideoEncodeH264SliceHeader$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.vulkan.video.StdVideoEncodeH264SliceHeader.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.vulkan.video.StdVideoEncodeH264SliceHeader.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.video.StdVideoEncodeH264SliceHeaderFlags nflags(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.video.StdVideoEncodeH264SliceHeader.FLAGS
            long r1 = (long) r1
            long r0 = r0 + r1
            org.lwjgl.vulkan.video.StdVideoEncodeH264SliceHeaderFlags r0 = org.lwjgl.vulkan.video.StdVideoEncodeH264SliceHeaderFlags.create(r0)
            return r0
    }

    public static int nfirst_mb_in_slice(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.video.StdVideoEncodeH264SliceHeader.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.video.StdVideoEncodeH264SliceHeader.FIRST_MB_IN_SLICE
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int nslice_type(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.video.StdVideoEncodeH264SliceHeader.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.video.StdVideoEncodeH264SliceHeader.SLICE_TYPE
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static byte nslice_alpha_c0_offset_div2(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.video.StdVideoEncodeH264SliceHeader.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.video.StdVideoEncodeH264SliceHeader.SLICE_ALPHA_C0_OFFSET_DIV2
            long r3 = (long) r3
            long r2 = r2 + r3
            byte r0 = r0.getByte(r1, r2)
            return r0
    }

    public static byte nslice_beta_offset_div2(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.video.StdVideoEncodeH264SliceHeader.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.video.StdVideoEncodeH264SliceHeader.SLICE_BETA_OFFSET_DIV2
            long r3 = (long) r3
            long r2 = r2 + r3
            byte r0 = r0.getByte(r1, r2)
            return r0
    }

    public static byte nslice_qp_delta(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.video.StdVideoEncodeH264SliceHeader.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.video.StdVideoEncodeH264SliceHeader.SLICE_QP_DELTA
            long r3 = (long) r3
            long r2 = r2 + r3
            byte r0 = r0.getByte(r1, r2)
            return r0
    }

    public static byte nreserved1(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.video.StdVideoEncodeH264SliceHeader.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.video.StdVideoEncodeH264SliceHeader.RESERVED1
            long r3 = (long) r3
            long r2 = r2 + r3
            byte r0 = r0.getByte(r1, r2)
            return r0
    }

    public static int ncabac_init_idc(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.video.StdVideoEncodeH264SliceHeader.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.video.StdVideoEncodeH264SliceHeader.CABAC_INIT_IDC
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int ndisable_deblocking_filter_idc(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.video.StdVideoEncodeH264SliceHeader.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.video.StdVideoEncodeH264SliceHeader.DISABLE_DEBLOCKING_FILTER_IDC
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static org.lwjgl.vulkan.video.StdVideoEncodeH264WeightTable npWeightTable(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.video.StdVideoEncodeH264SliceHeader.PWEIGHTTABLE
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            org.lwjgl.vulkan.video.StdVideoEncodeH264WeightTable r0 = org.lwjgl.vulkan.video.StdVideoEncodeH264WeightTable.create(r0)
            return r0
    }

    public static void nflags(long r7, org.lwjgl.vulkan.video.StdVideoEncodeH264SliceHeaderFlags r9) {
            r0 = r9
            long r0 = r0.address()
            r1 = r7
            int r2 = org.lwjgl.vulkan.video.StdVideoEncodeH264SliceHeader.FLAGS
            long r2 = (long) r2
            long r1 = r1 + r2
            int r2 = org.lwjgl.vulkan.video.StdVideoEncodeH264SliceHeaderFlags.SIZEOF
            long r2 = (long) r2
            org.lwjgl.system.MemoryUtil.memCopy(r0, r1, r2)
            return
    }

    public static void nfirst_mb_in_slice(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.video.StdVideoEncodeH264SliceHeader.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.video.StdVideoEncodeH264SliceHeader.FIRST_MB_IN_SLICE
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void nslice_type(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.video.StdVideoEncodeH264SliceHeader.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.video.StdVideoEncodeH264SliceHeader.SLICE_TYPE
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void nslice_alpha_c0_offset_div2(long r7, byte r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.video.StdVideoEncodeH264SliceHeader.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.video.StdVideoEncodeH264SliceHeader.SLICE_ALPHA_C0_OFFSET_DIV2
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putByte(r1, r2, r3)
            return
    }

    public static void nslice_beta_offset_div2(long r7, byte r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.video.StdVideoEncodeH264SliceHeader.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.video.StdVideoEncodeH264SliceHeader.SLICE_BETA_OFFSET_DIV2
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putByte(r1, r2, r3)
            return
    }

    public static void nslice_qp_delta(long r7, byte r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.video.StdVideoEncodeH264SliceHeader.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.video.StdVideoEncodeH264SliceHeader.SLICE_QP_DELTA
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putByte(r1, r2, r3)
            return
    }

    public static void nreserved1(long r7, byte r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.video.StdVideoEncodeH264SliceHeader.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.video.StdVideoEncodeH264SliceHeader.RESERVED1
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putByte(r1, r2, r3)
            return
    }

    public static void ncabac_init_idc(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.video.StdVideoEncodeH264SliceHeader.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.video.StdVideoEncodeH264SliceHeader.CABAC_INIT_IDC
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void ndisable_deblocking_filter_idc(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.video.StdVideoEncodeH264SliceHeader.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.video.StdVideoEncodeH264SliceHeader.DISABLE_DEBLOCKING_FILTER_IDC
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void npWeightTable(long r5, org.lwjgl.vulkan.video.StdVideoEncodeH264WeightTable r7) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.video.StdVideoEncodeH264SliceHeader.PWEIGHTTABLE
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            long r1 = r1.address()
            org.lwjgl.system.MemoryUtil.memPutAddress(r0, r1)
            return
    }

    public static void validate(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.video.StdVideoEncodeH264SliceHeader.PWEIGHTTABLE
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
            org.lwjgl.vulkan.video.StdVideoEncodeH264SliceHeader r0 = r0.create(r1, r2)
            return r0
    }

    static {
            r0 = 10
            org.lwjgl.system.Struct$Member[] r0 = new org.lwjgl.system.Struct.Member[r0]
            r1 = r0
            r2 = 0
            int r3 = org.lwjgl.vulkan.video.StdVideoEncodeH264SliceHeaderFlags.SIZEOF
            int r4 = org.lwjgl.vulkan.video.StdVideoEncodeH264SliceHeaderFlags.ALIGNOF
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
            r3 = 4
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 9
            int r3 = org.lwjgl.vulkan.video.StdVideoEncodeH264SliceHeader.POINTER_SIZE
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            org.lwjgl.system.Struct$Layout r0 = __struct(r0)
            r6 = r0
            r0 = r6
            int r0 = r0.getSize()
            org.lwjgl.vulkan.video.StdVideoEncodeH264SliceHeader.SIZEOF = r0
            r0 = r6
            int r0 = r0.getAlignment()
            org.lwjgl.vulkan.video.StdVideoEncodeH264SliceHeader.ALIGNOF = r0
            r0 = r6
            r1 = 0
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.video.StdVideoEncodeH264SliceHeader.FLAGS = r0
            r0 = r6
            r1 = 1
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.video.StdVideoEncodeH264SliceHeader.FIRST_MB_IN_SLICE = r0
            r0 = r6
            r1 = 2
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.video.StdVideoEncodeH264SliceHeader.SLICE_TYPE = r0
            r0 = r6
            r1 = 3
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.video.StdVideoEncodeH264SliceHeader.SLICE_ALPHA_C0_OFFSET_DIV2 = r0
            r0 = r6
            r1 = 4
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.video.StdVideoEncodeH264SliceHeader.SLICE_BETA_OFFSET_DIV2 = r0
            r0 = r6
            r1 = 5
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.video.StdVideoEncodeH264SliceHeader.SLICE_QP_DELTA = r0
            r0 = r6
            r1 = 6
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.video.StdVideoEncodeH264SliceHeader.RESERVED1 = r0
            r0 = r6
            r1 = 7
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.video.StdVideoEncodeH264SliceHeader.CABAC_INIT_IDC = r0
            r0 = r6
            r1 = 8
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.video.StdVideoEncodeH264SliceHeader.DISABLE_DEBLOCKING_FILTER_IDC = r0
            r0 = r6
            r1 = 9
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.video.StdVideoEncodeH264SliceHeader.PWEIGHTTABLE = r0
            return
    }
}
