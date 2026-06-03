package org.lwjgl.vulkan.video;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/video/StdVideoEncodeH265WeightTable.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/video/StdVideoEncodeH265WeightTable.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/video/StdVideoEncodeH265WeightTable.class */
public class StdVideoEncodeH265WeightTable extends org.lwjgl.system.Struct<org.lwjgl.vulkan.video.StdVideoEncodeH265WeightTable> implements org.lwjgl.system.NativeResource {
    public static final int SIZEOF = 0;
    public static final int ALIGNOF = 0;
    public static final int FLAGS = 0;
    public static final int LUMA_LOG2_WEIGHT_DENOM = 0;
    public static final int DELTA_CHROMA_LOG2_WEIGHT_DENOM = 0;
    public static final int DELTA_LUMA_WEIGHT_L0 = 0;
    public static final int LUMA_OFFSET_L0 = 0;
    public static final int DELTA_CHROMA_WEIGHT_L0 = 0;
    public static final int DELTA_CHROMA_OFFSET_L0 = 0;
    public static final int DELTA_LUMA_WEIGHT_L1 = 0;
    public static final int LUMA_OFFSET_L1 = 0;
    public static final int DELTA_CHROMA_WEIGHT_L1 = 0;
    public static final int DELTA_CHROMA_OFFSET_L1 = 0;

    /* JADX WARN: Classes with same name are omitted, all sources:
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/video/StdVideoEncodeH265WeightTable$Buffer.class
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/video/StdVideoEncodeH265WeightTable$Buffer.class
     */
    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/video/StdVideoEncodeH265WeightTable$Buffer.class */
    public static class Buffer extends org.lwjgl.system.StructBuffer<org.lwjgl.vulkan.video.StdVideoEncodeH265WeightTable, org.lwjgl.vulkan.video.StdVideoEncodeH265WeightTable.Buffer> implements org.lwjgl.system.NativeResource {
        private static final org.lwjgl.vulkan.video.StdVideoEncodeH265WeightTable ELEMENT_FACTORY = null;

        public Buffer(java.nio.ByteBuffer r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r6
                int r2 = r2.remaining()
                int r3 = org.lwjgl.vulkan.video.StdVideoEncodeH265WeightTable.SIZEOF
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
        protected org.lwjgl.vulkan.video.StdVideoEncodeH265WeightTable.Buffer self() {
                r2 = this;
                r0 = r2
                return r0
        }

        @Override // org.lwjgl.system.StructBuffer
        protected org.lwjgl.vulkan.video.StdVideoEncodeH265WeightTable getElementFactory() {
                r2 = this;
                org.lwjgl.vulkan.video.StdVideoEncodeH265WeightTable r0 = org.lwjgl.vulkan.video.StdVideoEncodeH265WeightTable.Buffer.ELEMENT_FACTORY
                return r0
        }

        public org.lwjgl.vulkan.video.StdVideoEncodeH265WeightTableFlags flags() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                org.lwjgl.vulkan.video.StdVideoEncodeH265WeightTableFlags r0 = org.lwjgl.vulkan.video.StdVideoEncodeH265WeightTable.nflags(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint8_t")
        public byte luma_log2_weight_denom() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                byte r0 = org.lwjgl.vulkan.video.StdVideoEncodeH265WeightTable.nluma_log2_weight_denom(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("int8_t")
        public byte delta_chroma_log2_weight_denom() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                byte r0 = org.lwjgl.vulkan.video.StdVideoEncodeH265WeightTable.ndelta_chroma_log2_weight_denom(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("int8_t[STD_VIDEO_H265_MAX_NUM_LIST_REF]")
        public java.nio.ByteBuffer delta_luma_weight_l0() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                java.nio.ByteBuffer r0 = org.lwjgl.vulkan.video.StdVideoEncodeH265WeightTable.ndelta_luma_weight_l0(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("int8_t")
        public byte delta_luma_weight_l0(int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                byte r0 = org.lwjgl.vulkan.video.StdVideoEncodeH265WeightTable.ndelta_luma_weight_l0(r0, r1)
                return r0
        }

        @org.lwjgl.system.NativeType("int8_t[STD_VIDEO_H265_MAX_NUM_LIST_REF]")
        public java.nio.ByteBuffer luma_offset_l0() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                java.nio.ByteBuffer r0 = org.lwjgl.vulkan.video.StdVideoEncodeH265WeightTable.nluma_offset_l0(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("int8_t")
        public byte luma_offset_l0(int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                byte r0 = org.lwjgl.vulkan.video.StdVideoEncodeH265WeightTable.nluma_offset_l0(r0, r1)
                return r0
        }

        @org.lwjgl.system.NativeType("int8_t[STD_VIDEO_H265_MAX_CHROMA_PLANES]")
        public java.nio.ByteBuffer delta_chroma_weight_l0() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                java.nio.ByteBuffer r0 = org.lwjgl.vulkan.video.StdVideoEncodeH265WeightTable.ndelta_chroma_weight_l0(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("int8_t")
        public byte delta_chroma_weight_l0(int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                byte r0 = org.lwjgl.vulkan.video.StdVideoEncodeH265WeightTable.ndelta_chroma_weight_l0(r0, r1)
                return r0
        }

        @org.lwjgl.system.NativeType("int8_t[STD_VIDEO_H265_MAX_CHROMA_PLANES]")
        public java.nio.ByteBuffer delta_chroma_offset_l0() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                java.nio.ByteBuffer r0 = org.lwjgl.vulkan.video.StdVideoEncodeH265WeightTable.ndelta_chroma_offset_l0(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("int8_t")
        public byte delta_chroma_offset_l0(int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                byte r0 = org.lwjgl.vulkan.video.StdVideoEncodeH265WeightTable.ndelta_chroma_offset_l0(r0, r1)
                return r0
        }

        @org.lwjgl.system.NativeType("int8_t[STD_VIDEO_H265_MAX_NUM_LIST_REF]")
        public java.nio.ByteBuffer delta_luma_weight_l1() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                java.nio.ByteBuffer r0 = org.lwjgl.vulkan.video.StdVideoEncodeH265WeightTable.ndelta_luma_weight_l1(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("int8_t")
        public byte delta_luma_weight_l1(int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                byte r0 = org.lwjgl.vulkan.video.StdVideoEncodeH265WeightTable.ndelta_luma_weight_l1(r0, r1)
                return r0
        }

        @org.lwjgl.system.NativeType("int8_t[STD_VIDEO_H265_MAX_NUM_LIST_REF]")
        public java.nio.ByteBuffer luma_offset_l1() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                java.nio.ByteBuffer r0 = org.lwjgl.vulkan.video.StdVideoEncodeH265WeightTable.nluma_offset_l1(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("int8_t")
        public byte luma_offset_l1(int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                byte r0 = org.lwjgl.vulkan.video.StdVideoEncodeH265WeightTable.nluma_offset_l1(r0, r1)
                return r0
        }

        @org.lwjgl.system.NativeType("int8_t[STD_VIDEO_H265_MAX_CHROMA_PLANES]")
        public java.nio.ByteBuffer delta_chroma_weight_l1() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                java.nio.ByteBuffer r0 = org.lwjgl.vulkan.video.StdVideoEncodeH265WeightTable.ndelta_chroma_weight_l1(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("int8_t")
        public byte delta_chroma_weight_l1(int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                byte r0 = org.lwjgl.vulkan.video.StdVideoEncodeH265WeightTable.ndelta_chroma_weight_l1(r0, r1)
                return r0
        }

        @org.lwjgl.system.NativeType("int8_t[STD_VIDEO_H265_MAX_CHROMA_PLANES]")
        public java.nio.ByteBuffer delta_chroma_offset_l1() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                java.nio.ByteBuffer r0 = org.lwjgl.vulkan.video.StdVideoEncodeH265WeightTable.ndelta_chroma_offset_l1(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("int8_t")
        public byte delta_chroma_offset_l1(int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                byte r0 = org.lwjgl.vulkan.video.StdVideoEncodeH265WeightTable.ndelta_chroma_offset_l1(r0, r1)
                return r0
        }

        public org.lwjgl.vulkan.video.StdVideoEncodeH265WeightTable.Buffer flags(org.lwjgl.vulkan.video.StdVideoEncodeH265WeightTableFlags r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.video.StdVideoEncodeH265WeightTable.nflags(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.video.StdVideoEncodeH265WeightTable.Buffer flags(java.util.function.Consumer<org.lwjgl.vulkan.video.StdVideoEncodeH265WeightTableFlags> r4) {
                r3 = this;
                r0 = r4
                r1 = r3
                org.lwjgl.vulkan.video.StdVideoEncodeH265WeightTableFlags r1 = r1.flags()
                r0.accept(r1)
                r0 = r3
                return r0
        }

        public org.lwjgl.vulkan.video.StdVideoEncodeH265WeightTable.Buffer luma_log2_weight_denom(@org.lwjgl.system.NativeType("uint8_t") byte r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.video.StdVideoEncodeH265WeightTable.nluma_log2_weight_denom(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.video.StdVideoEncodeH265WeightTable.Buffer delta_chroma_log2_weight_denom(@org.lwjgl.system.NativeType("int8_t") byte r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.video.StdVideoEncodeH265WeightTable.ndelta_chroma_log2_weight_denom(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.video.StdVideoEncodeH265WeightTable.Buffer delta_luma_weight_l0(@org.lwjgl.system.NativeType("int8_t[STD_VIDEO_H265_MAX_NUM_LIST_REF]") java.nio.ByteBuffer r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.video.StdVideoEncodeH265WeightTable.ndelta_luma_weight_l0(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.video.StdVideoEncodeH265WeightTable.Buffer delta_luma_weight_l0(int r6, @org.lwjgl.system.NativeType("int8_t") byte r7) {
                r5 = this;
                r0 = r5
                long r0 = r0.address()
                r1 = r6
                r2 = r7
                org.lwjgl.vulkan.video.StdVideoEncodeH265WeightTable.ndelta_luma_weight_l0(r0, r1, r2)
                r0 = r5
                return r0
        }

        public org.lwjgl.vulkan.video.StdVideoEncodeH265WeightTable.Buffer luma_offset_l0(@org.lwjgl.system.NativeType("int8_t[STD_VIDEO_H265_MAX_NUM_LIST_REF]") java.nio.ByteBuffer r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.video.StdVideoEncodeH265WeightTable.nluma_offset_l0(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.video.StdVideoEncodeH265WeightTable.Buffer luma_offset_l0(int r6, @org.lwjgl.system.NativeType("int8_t") byte r7) {
                r5 = this;
                r0 = r5
                long r0 = r0.address()
                r1 = r6
                r2 = r7
                org.lwjgl.vulkan.video.StdVideoEncodeH265WeightTable.nluma_offset_l0(r0, r1, r2)
                r0 = r5
                return r0
        }

        public org.lwjgl.vulkan.video.StdVideoEncodeH265WeightTable.Buffer delta_chroma_weight_l0(@org.lwjgl.system.NativeType("int8_t[STD_VIDEO_H265_MAX_CHROMA_PLANES]") java.nio.ByteBuffer r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.video.StdVideoEncodeH265WeightTable.ndelta_chroma_weight_l0(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.video.StdVideoEncodeH265WeightTable.Buffer delta_chroma_weight_l0(int r6, @org.lwjgl.system.NativeType("int8_t") byte r7) {
                r5 = this;
                r0 = r5
                long r0 = r0.address()
                r1 = r6
                r2 = r7
                org.lwjgl.vulkan.video.StdVideoEncodeH265WeightTable.ndelta_chroma_weight_l0(r0, r1, r2)
                r0 = r5
                return r0
        }

        public org.lwjgl.vulkan.video.StdVideoEncodeH265WeightTable.Buffer delta_chroma_offset_l0(@org.lwjgl.system.NativeType("int8_t[STD_VIDEO_H265_MAX_CHROMA_PLANES]") java.nio.ByteBuffer r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.video.StdVideoEncodeH265WeightTable.ndelta_chroma_offset_l0(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.video.StdVideoEncodeH265WeightTable.Buffer delta_chroma_offset_l0(int r6, @org.lwjgl.system.NativeType("int8_t") byte r7) {
                r5 = this;
                r0 = r5
                long r0 = r0.address()
                r1 = r6
                r2 = r7
                org.lwjgl.vulkan.video.StdVideoEncodeH265WeightTable.ndelta_chroma_offset_l0(r0, r1, r2)
                r0 = r5
                return r0
        }

        public org.lwjgl.vulkan.video.StdVideoEncodeH265WeightTable.Buffer delta_luma_weight_l1(@org.lwjgl.system.NativeType("int8_t[STD_VIDEO_H265_MAX_NUM_LIST_REF]") java.nio.ByteBuffer r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.video.StdVideoEncodeH265WeightTable.ndelta_luma_weight_l1(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.video.StdVideoEncodeH265WeightTable.Buffer delta_luma_weight_l1(int r6, @org.lwjgl.system.NativeType("int8_t") byte r7) {
                r5 = this;
                r0 = r5
                long r0 = r0.address()
                r1 = r6
                r2 = r7
                org.lwjgl.vulkan.video.StdVideoEncodeH265WeightTable.ndelta_luma_weight_l1(r0, r1, r2)
                r0 = r5
                return r0
        }

        public org.lwjgl.vulkan.video.StdVideoEncodeH265WeightTable.Buffer luma_offset_l1(@org.lwjgl.system.NativeType("int8_t[STD_VIDEO_H265_MAX_NUM_LIST_REF]") java.nio.ByteBuffer r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.video.StdVideoEncodeH265WeightTable.nluma_offset_l1(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.video.StdVideoEncodeH265WeightTable.Buffer luma_offset_l1(int r6, @org.lwjgl.system.NativeType("int8_t") byte r7) {
                r5 = this;
                r0 = r5
                long r0 = r0.address()
                r1 = r6
                r2 = r7
                org.lwjgl.vulkan.video.StdVideoEncodeH265WeightTable.nluma_offset_l1(r0, r1, r2)
                r0 = r5
                return r0
        }

        public org.lwjgl.vulkan.video.StdVideoEncodeH265WeightTable.Buffer delta_chroma_weight_l1(@org.lwjgl.system.NativeType("int8_t[STD_VIDEO_H265_MAX_CHROMA_PLANES]") java.nio.ByteBuffer r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.video.StdVideoEncodeH265WeightTable.ndelta_chroma_weight_l1(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.video.StdVideoEncodeH265WeightTable.Buffer delta_chroma_weight_l1(int r6, @org.lwjgl.system.NativeType("int8_t") byte r7) {
                r5 = this;
                r0 = r5
                long r0 = r0.address()
                r1 = r6
                r2 = r7
                org.lwjgl.vulkan.video.StdVideoEncodeH265WeightTable.ndelta_chroma_weight_l1(r0, r1, r2)
                r0 = r5
                return r0
        }

        public org.lwjgl.vulkan.video.StdVideoEncodeH265WeightTable.Buffer delta_chroma_offset_l1(@org.lwjgl.system.NativeType("int8_t[STD_VIDEO_H265_MAX_CHROMA_PLANES]") java.nio.ByteBuffer r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.video.StdVideoEncodeH265WeightTable.ndelta_chroma_offset_l1(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.video.StdVideoEncodeH265WeightTable.Buffer delta_chroma_offset_l1(int r6, @org.lwjgl.system.NativeType("int8_t") byte r7) {
                r5 = this;
                r0 = r5
                long r0 = r0.address()
                r1 = r6
                r2 = r7
                org.lwjgl.vulkan.video.StdVideoEncodeH265WeightTable.ndelta_chroma_offset_l1(r0, r1, r2)
                r0 = r5
                return r0
        }

        @Override // org.lwjgl.system.StructBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.Struct getElementFactory() {
                r2 = this;
                r0 = r2
                org.lwjgl.vulkan.video.StdVideoEncodeH265WeightTable r0 = r0.getElementFactory()
                return r0
        }

        @Override // org.lwjgl.system.CustomBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.CustomBuffer self() {
                r2 = this;
                r0 = r2
                org.lwjgl.vulkan.video.StdVideoEncodeH265WeightTable$Buffer r0 = r0.self()
                return r0
        }

        static {
                r0 = -1
                org.lwjgl.vulkan.video.StdVideoEncodeH265WeightTable r0 = org.lwjgl.vulkan.video.StdVideoEncodeH265WeightTable.create(r0)
                org.lwjgl.vulkan.video.StdVideoEncodeH265WeightTable.Buffer.ELEMENT_FACTORY = r0
                return
        }
    }

    protected StdVideoEncodeH265WeightTable(long r6, @javax.annotation.Nullable java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    protected org.lwjgl.vulkan.video.StdVideoEncodeH265WeightTable create(long r7, @javax.annotation.Nullable java.nio.ByteBuffer r9) {
            r6 = this;
            org.lwjgl.vulkan.video.StdVideoEncodeH265WeightTable r0 = new org.lwjgl.vulkan.video.StdVideoEncodeH265WeightTable
            r1 = r0
            r2 = r7
            r3 = r9
            r1.<init>(r2, r3)
            return r0
    }

    public StdVideoEncodeH265WeightTable(java.nio.ByteBuffer r7) {
            r6 = this;
            r0 = r6
            r1 = r7
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            r2 = r7
            int r3 = org.lwjgl.vulkan.video.StdVideoEncodeH265WeightTable.SIZEOF
            java.nio.ByteBuffer r2 = __checkContainer(r2, r3)
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
            r2 = this;
            int r0 = org.lwjgl.vulkan.video.StdVideoEncodeH265WeightTable.SIZEOF
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoEncodeH265WeightTableFlags flags() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            org.lwjgl.vulkan.video.StdVideoEncodeH265WeightTableFlags r0 = nflags(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("uint8_t")
    public byte luma_log2_weight_denom() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            byte r0 = nluma_log2_weight_denom(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("int8_t")
    public byte delta_chroma_log2_weight_denom() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            byte r0 = ndelta_chroma_log2_weight_denom(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("int8_t[STD_VIDEO_H265_MAX_NUM_LIST_REF]")
    public java.nio.ByteBuffer delta_luma_weight_l0() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            java.nio.ByteBuffer r0 = ndelta_luma_weight_l0(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("int8_t")
    public byte delta_luma_weight_l0(int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            byte r0 = ndelta_luma_weight_l0(r0, r1)
            return r0
    }

    @org.lwjgl.system.NativeType("int8_t[STD_VIDEO_H265_MAX_NUM_LIST_REF]")
    public java.nio.ByteBuffer luma_offset_l0() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            java.nio.ByteBuffer r0 = nluma_offset_l0(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("int8_t")
    public byte luma_offset_l0(int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            byte r0 = nluma_offset_l0(r0, r1)
            return r0
    }

    @org.lwjgl.system.NativeType("int8_t[STD_VIDEO_H265_MAX_CHROMA_PLANES]")
    public java.nio.ByteBuffer delta_chroma_weight_l0() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            java.nio.ByteBuffer r0 = ndelta_chroma_weight_l0(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("int8_t")
    public byte delta_chroma_weight_l0(int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            byte r0 = ndelta_chroma_weight_l0(r0, r1)
            return r0
    }

    @org.lwjgl.system.NativeType("int8_t[STD_VIDEO_H265_MAX_CHROMA_PLANES]")
    public java.nio.ByteBuffer delta_chroma_offset_l0() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            java.nio.ByteBuffer r0 = ndelta_chroma_offset_l0(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("int8_t")
    public byte delta_chroma_offset_l0(int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            byte r0 = ndelta_chroma_offset_l0(r0, r1)
            return r0
    }

    @org.lwjgl.system.NativeType("int8_t[STD_VIDEO_H265_MAX_NUM_LIST_REF]")
    public java.nio.ByteBuffer delta_luma_weight_l1() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            java.nio.ByteBuffer r0 = ndelta_luma_weight_l1(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("int8_t")
    public byte delta_luma_weight_l1(int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            byte r0 = ndelta_luma_weight_l1(r0, r1)
            return r0
    }

    @org.lwjgl.system.NativeType("int8_t[STD_VIDEO_H265_MAX_NUM_LIST_REF]")
    public java.nio.ByteBuffer luma_offset_l1() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            java.nio.ByteBuffer r0 = nluma_offset_l1(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("int8_t")
    public byte luma_offset_l1(int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            byte r0 = nluma_offset_l1(r0, r1)
            return r0
    }

    @org.lwjgl.system.NativeType("int8_t[STD_VIDEO_H265_MAX_CHROMA_PLANES]")
    public java.nio.ByteBuffer delta_chroma_weight_l1() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            java.nio.ByteBuffer r0 = ndelta_chroma_weight_l1(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("int8_t")
    public byte delta_chroma_weight_l1(int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            byte r0 = ndelta_chroma_weight_l1(r0, r1)
            return r0
    }

    @org.lwjgl.system.NativeType("int8_t[STD_VIDEO_H265_MAX_CHROMA_PLANES]")
    public java.nio.ByteBuffer delta_chroma_offset_l1() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            java.nio.ByteBuffer r0 = ndelta_chroma_offset_l1(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("int8_t")
    public byte delta_chroma_offset_l1(int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            byte r0 = ndelta_chroma_offset_l1(r0, r1)
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoEncodeH265WeightTable flags(org.lwjgl.vulkan.video.StdVideoEncodeH265WeightTableFlags r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nflags(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoEncodeH265WeightTable flags(java.util.function.Consumer<org.lwjgl.vulkan.video.StdVideoEncodeH265WeightTableFlags> r4) {
            r3 = this;
            r0 = r4
            r1 = r3
            org.lwjgl.vulkan.video.StdVideoEncodeH265WeightTableFlags r1 = r1.flags()
            r0.accept(r1)
            r0 = r3
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoEncodeH265WeightTable luma_log2_weight_denom(@org.lwjgl.system.NativeType("uint8_t") byte r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nluma_log2_weight_denom(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoEncodeH265WeightTable delta_chroma_log2_weight_denom(@org.lwjgl.system.NativeType("int8_t") byte r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            ndelta_chroma_log2_weight_denom(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoEncodeH265WeightTable delta_luma_weight_l0(@org.lwjgl.system.NativeType("int8_t[STD_VIDEO_H265_MAX_NUM_LIST_REF]") java.nio.ByteBuffer r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            ndelta_luma_weight_l0(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoEncodeH265WeightTable delta_luma_weight_l0(int r6, @org.lwjgl.system.NativeType("int8_t") byte r7) {
            r5 = this;
            r0 = r5
            long r0 = r0.address()
            r1 = r6
            r2 = r7
            ndelta_luma_weight_l0(r0, r1, r2)
            r0 = r5
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoEncodeH265WeightTable luma_offset_l0(@org.lwjgl.system.NativeType("int8_t[STD_VIDEO_H265_MAX_NUM_LIST_REF]") java.nio.ByteBuffer r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nluma_offset_l0(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoEncodeH265WeightTable luma_offset_l0(int r6, @org.lwjgl.system.NativeType("int8_t") byte r7) {
            r5 = this;
            r0 = r5
            long r0 = r0.address()
            r1 = r6
            r2 = r7
            nluma_offset_l0(r0, r1, r2)
            r0 = r5
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoEncodeH265WeightTable delta_chroma_weight_l0(@org.lwjgl.system.NativeType("int8_t[STD_VIDEO_H265_MAX_CHROMA_PLANES]") java.nio.ByteBuffer r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            ndelta_chroma_weight_l0(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoEncodeH265WeightTable delta_chroma_weight_l0(int r6, @org.lwjgl.system.NativeType("int8_t") byte r7) {
            r5 = this;
            r0 = r5
            long r0 = r0.address()
            r1 = r6
            r2 = r7
            ndelta_chroma_weight_l0(r0, r1, r2)
            r0 = r5
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoEncodeH265WeightTable delta_chroma_offset_l0(@org.lwjgl.system.NativeType("int8_t[STD_VIDEO_H265_MAX_CHROMA_PLANES]") java.nio.ByteBuffer r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            ndelta_chroma_offset_l0(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoEncodeH265WeightTable delta_chroma_offset_l0(int r6, @org.lwjgl.system.NativeType("int8_t") byte r7) {
            r5 = this;
            r0 = r5
            long r0 = r0.address()
            r1 = r6
            r2 = r7
            ndelta_chroma_offset_l0(r0, r1, r2)
            r0 = r5
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoEncodeH265WeightTable delta_luma_weight_l1(@org.lwjgl.system.NativeType("int8_t[STD_VIDEO_H265_MAX_NUM_LIST_REF]") java.nio.ByteBuffer r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            ndelta_luma_weight_l1(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoEncodeH265WeightTable delta_luma_weight_l1(int r6, @org.lwjgl.system.NativeType("int8_t") byte r7) {
            r5 = this;
            r0 = r5
            long r0 = r0.address()
            r1 = r6
            r2 = r7
            ndelta_luma_weight_l1(r0, r1, r2)
            r0 = r5
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoEncodeH265WeightTable luma_offset_l1(@org.lwjgl.system.NativeType("int8_t[STD_VIDEO_H265_MAX_NUM_LIST_REF]") java.nio.ByteBuffer r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nluma_offset_l1(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoEncodeH265WeightTable luma_offset_l1(int r6, @org.lwjgl.system.NativeType("int8_t") byte r7) {
            r5 = this;
            r0 = r5
            long r0 = r0.address()
            r1 = r6
            r2 = r7
            nluma_offset_l1(r0, r1, r2)
            r0 = r5
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoEncodeH265WeightTable delta_chroma_weight_l1(@org.lwjgl.system.NativeType("int8_t[STD_VIDEO_H265_MAX_CHROMA_PLANES]") java.nio.ByteBuffer r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            ndelta_chroma_weight_l1(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoEncodeH265WeightTable delta_chroma_weight_l1(int r6, @org.lwjgl.system.NativeType("int8_t") byte r7) {
            r5 = this;
            r0 = r5
            long r0 = r0.address()
            r1 = r6
            r2 = r7
            ndelta_chroma_weight_l1(r0, r1, r2)
            r0 = r5
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoEncodeH265WeightTable delta_chroma_offset_l1(@org.lwjgl.system.NativeType("int8_t[STD_VIDEO_H265_MAX_CHROMA_PLANES]") java.nio.ByteBuffer r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            ndelta_chroma_offset_l1(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoEncodeH265WeightTable delta_chroma_offset_l1(int r6, @org.lwjgl.system.NativeType("int8_t") byte r7) {
            r5 = this;
            r0 = r5
            long r0 = r0.address()
            r1 = r6
            r2 = r7
            ndelta_chroma_offset_l1(r0, r1, r2)
            r0 = r5
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoEncodeH265WeightTable set(org.lwjgl.vulkan.video.StdVideoEncodeH265WeightTableFlags r4, byte r5, byte r6, java.nio.ByteBuffer r7, java.nio.ByteBuffer r8, java.nio.ByteBuffer r9, java.nio.ByteBuffer r10, java.nio.ByteBuffer r11, java.nio.ByteBuffer r12, java.nio.ByteBuffer r13, java.nio.ByteBuffer r14) {
            r3 = this;
            r0 = r3
            r1 = r4
            org.lwjgl.vulkan.video.StdVideoEncodeH265WeightTable r0 = r0.flags(r1)
            r0 = r3
            r1 = r5
            org.lwjgl.vulkan.video.StdVideoEncodeH265WeightTable r0 = r0.luma_log2_weight_denom(r1)
            r0 = r3
            r1 = r6
            org.lwjgl.vulkan.video.StdVideoEncodeH265WeightTable r0 = r0.delta_chroma_log2_weight_denom(r1)
            r0 = r3
            r1 = r7
            org.lwjgl.vulkan.video.StdVideoEncodeH265WeightTable r0 = r0.delta_luma_weight_l0(r1)
            r0 = r3
            r1 = r8
            org.lwjgl.vulkan.video.StdVideoEncodeH265WeightTable r0 = r0.luma_offset_l0(r1)
            r0 = r3
            r1 = r9
            org.lwjgl.vulkan.video.StdVideoEncodeH265WeightTable r0 = r0.delta_chroma_weight_l0(r1)
            r0 = r3
            r1 = r10
            org.lwjgl.vulkan.video.StdVideoEncodeH265WeightTable r0 = r0.delta_chroma_offset_l0(r1)
            r0 = r3
            r1 = r11
            org.lwjgl.vulkan.video.StdVideoEncodeH265WeightTable r0 = r0.delta_luma_weight_l1(r1)
            r0 = r3
            r1 = r12
            org.lwjgl.vulkan.video.StdVideoEncodeH265WeightTable r0 = r0.luma_offset_l1(r1)
            r0 = r3
            r1 = r13
            org.lwjgl.vulkan.video.StdVideoEncodeH265WeightTable r0 = r0.delta_chroma_weight_l1(r1)
            r0 = r3
            r1 = r14
            org.lwjgl.vulkan.video.StdVideoEncodeH265WeightTable r0 = r0.delta_chroma_offset_l1(r1)
            r0 = r3
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoEncodeH265WeightTable set(org.lwjgl.vulkan.video.StdVideoEncodeH265WeightTable r8) {
            r7 = this;
            r0 = r8
            long r0 = r0.address()
            r1 = r7
            long r1 = r1.address()
            int r2 = org.lwjgl.vulkan.video.StdVideoEncodeH265WeightTable.SIZEOF
            long r2 = (long) r2
            org.lwjgl.system.MemoryUtil.memCopy(r0, r1, r2)
            r0 = r7
            return r0
    }

    public static org.lwjgl.vulkan.video.StdVideoEncodeH265WeightTable malloc() {
            org.lwjgl.vulkan.video.StdVideoEncodeH265WeightTable r0 = new org.lwjgl.vulkan.video.StdVideoEncodeH265WeightTable
            r1 = r0
            int r2 = org.lwjgl.vulkan.video.StdVideoEncodeH265WeightTable.SIZEOF
            long r2 = (long) r2
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.video.StdVideoEncodeH265WeightTable calloc() {
            org.lwjgl.vulkan.video.StdVideoEncodeH265WeightTable r0 = new org.lwjgl.vulkan.video.StdVideoEncodeH265WeightTable
            r1 = r0
            r2 = 1
            int r3 = org.lwjgl.vulkan.video.StdVideoEncodeH265WeightTable.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.video.StdVideoEncodeH265WeightTable create() {
            int r0 = org.lwjgl.vulkan.video.StdVideoEncodeH265WeightTable.SIZEOF
            java.nio.ByteBuffer r0 = org.lwjgl.BufferUtils.createByteBuffer(r0)
            r6 = r0
            org.lwjgl.vulkan.video.StdVideoEncodeH265WeightTable r0 = new org.lwjgl.vulkan.video.StdVideoEncodeH265WeightTable
            r1 = r0
            r2 = r6
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.video.StdVideoEncodeH265WeightTable create(long r6) {
            org.lwjgl.vulkan.video.StdVideoEncodeH265WeightTable r0 = new org.lwjgl.vulkan.video.StdVideoEncodeH265WeightTable
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.vulkan.video.StdVideoEncodeH265WeightTable createSafe(long r6) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.vulkan.video.StdVideoEncodeH265WeightTable r0 = new org.lwjgl.vulkan.video.StdVideoEncodeH265WeightTable
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static org.lwjgl.vulkan.video.StdVideoEncodeH265WeightTable.Buffer malloc(int r6) {
            org.lwjgl.vulkan.video.StdVideoEncodeH265WeightTable$Buffer r0 = new org.lwjgl.vulkan.video.StdVideoEncodeH265WeightTable$Buffer
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.vulkan.video.StdVideoEncodeH265WeightTable.SIZEOF
            long r2 = __checkMalloc(r2, r3)
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.video.StdVideoEncodeH265WeightTable.Buffer calloc(int r7) {
            org.lwjgl.vulkan.video.StdVideoEncodeH265WeightTable$Buffer r0 = new org.lwjgl.vulkan.video.StdVideoEncodeH265WeightTable$Buffer
            r1 = r0
            r2 = r7
            long r2 = (long) r2
            int r3 = org.lwjgl.vulkan.video.StdVideoEncodeH265WeightTable.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.video.StdVideoEncodeH265WeightTable.Buffer create(int r10) {
            r0 = r10
            int r1 = org.lwjgl.vulkan.video.StdVideoEncodeH265WeightTable.SIZEOF
            java.nio.ByteBuffer r0 = __create(r0, r1)
            r11 = r0
            org.lwjgl.vulkan.video.StdVideoEncodeH265WeightTable$Buffer r0 = new org.lwjgl.vulkan.video.StdVideoEncodeH265WeightTable$Buffer
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

    public static org.lwjgl.vulkan.video.StdVideoEncodeH265WeightTable.Buffer create(long r6, int r8) {
            org.lwjgl.vulkan.video.StdVideoEncodeH265WeightTable$Buffer r0 = new org.lwjgl.vulkan.video.StdVideoEncodeH265WeightTable$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.vulkan.video.StdVideoEncodeH265WeightTable.Buffer createSafe(long r6, int r8) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.vulkan.video.StdVideoEncodeH265WeightTable$Buffer r0 = new org.lwjgl.vulkan.video.StdVideoEncodeH265WeightTable$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static org.lwjgl.vulkan.video.StdVideoEncodeH265WeightTable malloc(org.lwjgl.system.MemoryStack r6) {
            org.lwjgl.vulkan.video.StdVideoEncodeH265WeightTable r0 = new org.lwjgl.vulkan.video.StdVideoEncodeH265WeightTable
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.vulkan.video.StdVideoEncodeH265WeightTable.ALIGNOF
            int r4 = org.lwjgl.vulkan.video.StdVideoEncodeH265WeightTable.SIZEOF
            long r2 = r2.nmalloc(r3, r4)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.video.StdVideoEncodeH265WeightTable calloc(org.lwjgl.system.MemoryStack r7) {
            org.lwjgl.vulkan.video.StdVideoEncodeH265WeightTable r0 = new org.lwjgl.vulkan.video.StdVideoEncodeH265WeightTable
            r1 = r0
            r2 = r7
            int r3 = org.lwjgl.vulkan.video.StdVideoEncodeH265WeightTable.ALIGNOF
            r4 = 1
            int r5 = org.lwjgl.vulkan.video.StdVideoEncodeH265WeightTable.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.video.StdVideoEncodeH265WeightTable.Buffer malloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.vulkan.video.StdVideoEncodeH265WeightTable$Buffer r0 = new org.lwjgl.vulkan.video.StdVideoEncodeH265WeightTable$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.vulkan.video.StdVideoEncodeH265WeightTable.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.vulkan.video.StdVideoEncodeH265WeightTable.SIZEOF
            int r4 = r4 * r5
            long r2 = r2.nmalloc(r3, r4)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.video.StdVideoEncodeH265WeightTable.Buffer calloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.vulkan.video.StdVideoEncodeH265WeightTable$Buffer r0 = new org.lwjgl.vulkan.video.StdVideoEncodeH265WeightTable$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.vulkan.video.StdVideoEncodeH265WeightTable.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.vulkan.video.StdVideoEncodeH265WeightTable.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.video.StdVideoEncodeH265WeightTableFlags nflags(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.video.StdVideoEncodeH265WeightTable.FLAGS
            long r1 = (long) r1
            long r0 = r0 + r1
            org.lwjgl.vulkan.video.StdVideoEncodeH265WeightTableFlags r0 = org.lwjgl.vulkan.video.StdVideoEncodeH265WeightTableFlags.create(r0)
            return r0
    }

    public static byte nluma_log2_weight_denom(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.video.StdVideoEncodeH265WeightTable.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.video.StdVideoEncodeH265WeightTable.LUMA_LOG2_WEIGHT_DENOM
            long r3 = (long) r3
            long r2 = r2 + r3
            byte r0 = r0.getByte(r1, r2)
            return r0
    }

    public static byte ndelta_chroma_log2_weight_denom(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.video.StdVideoEncodeH265WeightTable.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.video.StdVideoEncodeH265WeightTable.DELTA_CHROMA_LOG2_WEIGHT_DENOM
            long r3 = (long) r3
            long r2 = r2 + r3
            byte r0 = r0.getByte(r1, r2)
            return r0
    }

    public static java.nio.ByteBuffer ndelta_luma_weight_l0(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.video.StdVideoEncodeH265WeightTable.DELTA_LUMA_WEIGHT_L0
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = 15
            java.nio.ByteBuffer r0 = org.lwjgl.system.MemoryUtil.memByteBuffer(r0, r1)
            return r0
    }

    public static byte ndelta_luma_weight_l0(long r9, int r11) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.video.StdVideoEncodeH265WeightTable.UNSAFE
            r1 = 0
            r2 = r9
            int r3 = org.lwjgl.vulkan.video.StdVideoEncodeH265WeightTable.DELTA_LUMA_WEIGHT_L0
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r11
            r4 = 15
            long r3 = org.lwjgl.system.Checks.check(r3, r4)
            r4 = 1
            long r3 = r3 * r4
            long r2 = r2 + r3
            byte r0 = r0.getByte(r1, r2)
            return r0
    }

    public static java.nio.ByteBuffer nluma_offset_l0(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.video.StdVideoEncodeH265WeightTable.LUMA_OFFSET_L0
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = 15
            java.nio.ByteBuffer r0 = org.lwjgl.system.MemoryUtil.memByteBuffer(r0, r1)
            return r0
    }

    public static byte nluma_offset_l0(long r9, int r11) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.video.StdVideoEncodeH265WeightTable.UNSAFE
            r1 = 0
            r2 = r9
            int r3 = org.lwjgl.vulkan.video.StdVideoEncodeH265WeightTable.LUMA_OFFSET_L0
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r11
            r4 = 15
            long r3 = org.lwjgl.system.Checks.check(r3, r4)
            r4 = 1
            long r3 = r3 * r4
            long r2 = r2 + r3
            byte r0 = r0.getByte(r1, r2)
            return r0
    }

    public static java.nio.ByteBuffer ndelta_chroma_weight_l0(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.video.StdVideoEncodeH265WeightTable.DELTA_CHROMA_WEIGHT_L0
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = 2
            java.nio.ByteBuffer r0 = org.lwjgl.system.MemoryUtil.memByteBuffer(r0, r1)
            return r0
    }

    public static byte ndelta_chroma_weight_l0(long r9, int r11) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.video.StdVideoEncodeH265WeightTable.UNSAFE
            r1 = 0
            r2 = r9
            int r3 = org.lwjgl.vulkan.video.StdVideoEncodeH265WeightTable.DELTA_CHROMA_WEIGHT_L0
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r11
            r4 = 2
            long r3 = org.lwjgl.system.Checks.check(r3, r4)
            r4 = 1
            long r3 = r3 * r4
            long r2 = r2 + r3
            byte r0 = r0.getByte(r1, r2)
            return r0
    }

    public static java.nio.ByteBuffer ndelta_chroma_offset_l0(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.video.StdVideoEncodeH265WeightTable.DELTA_CHROMA_OFFSET_L0
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = 2
            java.nio.ByteBuffer r0 = org.lwjgl.system.MemoryUtil.memByteBuffer(r0, r1)
            return r0
    }

    public static byte ndelta_chroma_offset_l0(long r9, int r11) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.video.StdVideoEncodeH265WeightTable.UNSAFE
            r1 = 0
            r2 = r9
            int r3 = org.lwjgl.vulkan.video.StdVideoEncodeH265WeightTable.DELTA_CHROMA_OFFSET_L0
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r11
            r4 = 2
            long r3 = org.lwjgl.system.Checks.check(r3, r4)
            r4 = 1
            long r3 = r3 * r4
            long r2 = r2 + r3
            byte r0 = r0.getByte(r1, r2)
            return r0
    }

    public static java.nio.ByteBuffer ndelta_luma_weight_l1(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.video.StdVideoEncodeH265WeightTable.DELTA_LUMA_WEIGHT_L1
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = 15
            java.nio.ByteBuffer r0 = org.lwjgl.system.MemoryUtil.memByteBuffer(r0, r1)
            return r0
    }

    public static byte ndelta_luma_weight_l1(long r9, int r11) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.video.StdVideoEncodeH265WeightTable.UNSAFE
            r1 = 0
            r2 = r9
            int r3 = org.lwjgl.vulkan.video.StdVideoEncodeH265WeightTable.DELTA_LUMA_WEIGHT_L1
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r11
            r4 = 15
            long r3 = org.lwjgl.system.Checks.check(r3, r4)
            r4 = 1
            long r3 = r3 * r4
            long r2 = r2 + r3
            byte r0 = r0.getByte(r1, r2)
            return r0
    }

    public static java.nio.ByteBuffer nluma_offset_l1(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.video.StdVideoEncodeH265WeightTable.LUMA_OFFSET_L1
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = 15
            java.nio.ByteBuffer r0 = org.lwjgl.system.MemoryUtil.memByteBuffer(r0, r1)
            return r0
    }

    public static byte nluma_offset_l1(long r9, int r11) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.video.StdVideoEncodeH265WeightTable.UNSAFE
            r1 = 0
            r2 = r9
            int r3 = org.lwjgl.vulkan.video.StdVideoEncodeH265WeightTable.LUMA_OFFSET_L1
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r11
            r4 = 15
            long r3 = org.lwjgl.system.Checks.check(r3, r4)
            r4 = 1
            long r3 = r3 * r4
            long r2 = r2 + r3
            byte r0 = r0.getByte(r1, r2)
            return r0
    }

    public static java.nio.ByteBuffer ndelta_chroma_weight_l1(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.video.StdVideoEncodeH265WeightTable.DELTA_CHROMA_WEIGHT_L1
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = 2
            java.nio.ByteBuffer r0 = org.lwjgl.system.MemoryUtil.memByteBuffer(r0, r1)
            return r0
    }

    public static byte ndelta_chroma_weight_l1(long r9, int r11) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.video.StdVideoEncodeH265WeightTable.UNSAFE
            r1 = 0
            r2 = r9
            int r3 = org.lwjgl.vulkan.video.StdVideoEncodeH265WeightTable.DELTA_CHROMA_WEIGHT_L1
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r11
            r4 = 2
            long r3 = org.lwjgl.system.Checks.check(r3, r4)
            r4 = 1
            long r3 = r3 * r4
            long r2 = r2 + r3
            byte r0 = r0.getByte(r1, r2)
            return r0
    }

    public static java.nio.ByteBuffer ndelta_chroma_offset_l1(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.video.StdVideoEncodeH265WeightTable.DELTA_CHROMA_OFFSET_L1
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = 2
            java.nio.ByteBuffer r0 = org.lwjgl.system.MemoryUtil.memByteBuffer(r0, r1)
            return r0
    }

    public static byte ndelta_chroma_offset_l1(long r9, int r11) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.video.StdVideoEncodeH265WeightTable.UNSAFE
            r1 = 0
            r2 = r9
            int r3 = org.lwjgl.vulkan.video.StdVideoEncodeH265WeightTable.DELTA_CHROMA_OFFSET_L1
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r11
            r4 = 2
            long r3 = org.lwjgl.system.Checks.check(r3, r4)
            r4 = 1
            long r3 = r3 * r4
            long r2 = r2 + r3
            byte r0 = r0.getByte(r1, r2)
            return r0
    }

    public static void nflags(long r7, org.lwjgl.vulkan.video.StdVideoEncodeH265WeightTableFlags r9) {
            r0 = r9
            long r0 = r0.address()
            r1 = r7
            int r2 = org.lwjgl.vulkan.video.StdVideoEncodeH265WeightTable.FLAGS
            long r2 = (long) r2
            long r1 = r1 + r2
            int r2 = org.lwjgl.vulkan.video.StdVideoEncodeH265WeightTableFlags.SIZEOF
            long r2 = (long) r2
            org.lwjgl.system.MemoryUtil.memCopy(r0, r1, r2)
            return
    }

    public static void nluma_log2_weight_denom(long r7, byte r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.video.StdVideoEncodeH265WeightTable.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.video.StdVideoEncodeH265WeightTable.LUMA_LOG2_WEIGHT_DENOM
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putByte(r1, r2, r3)
            return
    }

    public static void ndelta_chroma_log2_weight_denom(long r7, byte r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.video.StdVideoEncodeH265WeightTable.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.video.StdVideoEncodeH265WeightTable.DELTA_CHROMA_LOG2_WEIGHT_DENOM
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putByte(r1, r2, r3)
            return
    }

    public static void ndelta_luma_weight_l0(long r7, java.nio.ByteBuffer r9) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lc
            r0 = r9
            r1 = 15
            org.lwjgl.system.Checks.checkGT(r0, r1)
        Lc:
            r0 = r9
            long r0 = org.lwjgl.system.MemoryUtil.memAddress(r0)
            r1 = r7
            int r2 = org.lwjgl.vulkan.video.StdVideoEncodeH265WeightTable.DELTA_LUMA_WEIGHT_L0
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

    public static void ndelta_luma_weight_l0(long r9, int r11, byte r12) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.video.StdVideoEncodeH265WeightTable.UNSAFE
            r1 = 0
            r2 = r9
            int r3 = org.lwjgl.vulkan.video.StdVideoEncodeH265WeightTable.DELTA_LUMA_WEIGHT_L0
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r11
            r4 = 15
            long r3 = org.lwjgl.system.Checks.check(r3, r4)
            r4 = 1
            long r3 = r3 * r4
            long r2 = r2 + r3
            r3 = r12
            r0.putByte(r1, r2, r3)
            return
    }

    public static void nluma_offset_l0(long r7, java.nio.ByteBuffer r9) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lc
            r0 = r9
            r1 = 15
            org.lwjgl.system.Checks.checkGT(r0, r1)
        Lc:
            r0 = r9
            long r0 = org.lwjgl.system.MemoryUtil.memAddress(r0)
            r1 = r7
            int r2 = org.lwjgl.vulkan.video.StdVideoEncodeH265WeightTable.LUMA_OFFSET_L0
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

    public static void nluma_offset_l0(long r9, int r11, byte r12) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.video.StdVideoEncodeH265WeightTable.UNSAFE
            r1 = 0
            r2 = r9
            int r3 = org.lwjgl.vulkan.video.StdVideoEncodeH265WeightTable.LUMA_OFFSET_L0
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r11
            r4 = 15
            long r3 = org.lwjgl.system.Checks.check(r3, r4)
            r4 = 1
            long r3 = r3 * r4
            long r2 = r2 + r3
            r3 = r12
            r0.putByte(r1, r2, r3)
            return
    }

    public static void ndelta_chroma_weight_l0(long r7, java.nio.ByteBuffer r9) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r9
            r1 = 2
            org.lwjgl.system.Checks.checkGT(r0, r1)
        Lb:
            r0 = r9
            long r0 = org.lwjgl.system.MemoryUtil.memAddress(r0)
            r1 = r7
            int r2 = org.lwjgl.vulkan.video.StdVideoEncodeH265WeightTable.DELTA_CHROMA_WEIGHT_L0
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

    public static void ndelta_chroma_weight_l0(long r9, int r11, byte r12) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.video.StdVideoEncodeH265WeightTable.UNSAFE
            r1 = 0
            r2 = r9
            int r3 = org.lwjgl.vulkan.video.StdVideoEncodeH265WeightTable.DELTA_CHROMA_WEIGHT_L0
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r11
            r4 = 2
            long r3 = org.lwjgl.system.Checks.check(r3, r4)
            r4 = 1
            long r3 = r3 * r4
            long r2 = r2 + r3
            r3 = r12
            r0.putByte(r1, r2, r3)
            return
    }

    public static void ndelta_chroma_offset_l0(long r7, java.nio.ByteBuffer r9) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r9
            r1 = 2
            org.lwjgl.system.Checks.checkGT(r0, r1)
        Lb:
            r0 = r9
            long r0 = org.lwjgl.system.MemoryUtil.memAddress(r0)
            r1 = r7
            int r2 = org.lwjgl.vulkan.video.StdVideoEncodeH265WeightTable.DELTA_CHROMA_OFFSET_L0
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

    public static void ndelta_chroma_offset_l0(long r9, int r11, byte r12) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.video.StdVideoEncodeH265WeightTable.UNSAFE
            r1 = 0
            r2 = r9
            int r3 = org.lwjgl.vulkan.video.StdVideoEncodeH265WeightTable.DELTA_CHROMA_OFFSET_L0
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r11
            r4 = 2
            long r3 = org.lwjgl.system.Checks.check(r3, r4)
            r4 = 1
            long r3 = r3 * r4
            long r2 = r2 + r3
            r3 = r12
            r0.putByte(r1, r2, r3)
            return
    }

    public static void ndelta_luma_weight_l1(long r7, java.nio.ByteBuffer r9) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lc
            r0 = r9
            r1 = 15
            org.lwjgl.system.Checks.checkGT(r0, r1)
        Lc:
            r0 = r9
            long r0 = org.lwjgl.system.MemoryUtil.memAddress(r0)
            r1 = r7
            int r2 = org.lwjgl.vulkan.video.StdVideoEncodeH265WeightTable.DELTA_LUMA_WEIGHT_L1
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

    public static void ndelta_luma_weight_l1(long r9, int r11, byte r12) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.video.StdVideoEncodeH265WeightTable.UNSAFE
            r1 = 0
            r2 = r9
            int r3 = org.lwjgl.vulkan.video.StdVideoEncodeH265WeightTable.DELTA_LUMA_WEIGHT_L1
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r11
            r4 = 15
            long r3 = org.lwjgl.system.Checks.check(r3, r4)
            r4 = 1
            long r3 = r3 * r4
            long r2 = r2 + r3
            r3 = r12
            r0.putByte(r1, r2, r3)
            return
    }

    public static void nluma_offset_l1(long r7, java.nio.ByteBuffer r9) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lc
            r0 = r9
            r1 = 15
            org.lwjgl.system.Checks.checkGT(r0, r1)
        Lc:
            r0 = r9
            long r0 = org.lwjgl.system.MemoryUtil.memAddress(r0)
            r1 = r7
            int r2 = org.lwjgl.vulkan.video.StdVideoEncodeH265WeightTable.LUMA_OFFSET_L1
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

    public static void nluma_offset_l1(long r9, int r11, byte r12) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.video.StdVideoEncodeH265WeightTable.UNSAFE
            r1 = 0
            r2 = r9
            int r3 = org.lwjgl.vulkan.video.StdVideoEncodeH265WeightTable.LUMA_OFFSET_L1
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r11
            r4 = 15
            long r3 = org.lwjgl.system.Checks.check(r3, r4)
            r4 = 1
            long r3 = r3 * r4
            long r2 = r2 + r3
            r3 = r12
            r0.putByte(r1, r2, r3)
            return
    }

    public static void ndelta_chroma_weight_l1(long r7, java.nio.ByteBuffer r9) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r9
            r1 = 2
            org.lwjgl.system.Checks.checkGT(r0, r1)
        Lb:
            r0 = r9
            long r0 = org.lwjgl.system.MemoryUtil.memAddress(r0)
            r1 = r7
            int r2 = org.lwjgl.vulkan.video.StdVideoEncodeH265WeightTable.DELTA_CHROMA_WEIGHT_L1
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

    public static void ndelta_chroma_weight_l1(long r9, int r11, byte r12) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.video.StdVideoEncodeH265WeightTable.UNSAFE
            r1 = 0
            r2 = r9
            int r3 = org.lwjgl.vulkan.video.StdVideoEncodeH265WeightTable.DELTA_CHROMA_WEIGHT_L1
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r11
            r4 = 2
            long r3 = org.lwjgl.system.Checks.check(r3, r4)
            r4 = 1
            long r3 = r3 * r4
            long r2 = r2 + r3
            r3 = r12
            r0.putByte(r1, r2, r3)
            return
    }

    public static void ndelta_chroma_offset_l1(long r7, java.nio.ByteBuffer r9) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r9
            r1 = 2
            org.lwjgl.system.Checks.checkGT(r0, r1)
        Lb:
            r0 = r9
            long r0 = org.lwjgl.system.MemoryUtil.memAddress(r0)
            r1 = r7
            int r2 = org.lwjgl.vulkan.video.StdVideoEncodeH265WeightTable.DELTA_CHROMA_OFFSET_L1
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

    public static void ndelta_chroma_offset_l1(long r9, int r11, byte r12) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.video.StdVideoEncodeH265WeightTable.UNSAFE
            r1 = 0
            r2 = r9
            int r3 = org.lwjgl.vulkan.video.StdVideoEncodeH265WeightTable.DELTA_CHROMA_OFFSET_L1
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r11
            r4 = 2
            long r3 = org.lwjgl.system.Checks.check(r3, r4)
            r4 = 1
            long r3 = r3 * r4
            long r2 = r2 + r3
            r3 = r12
            r0.putByte(r1, r2, r3)
            return
    }

    @Override // org.lwjgl.system.Struct
    protected /* bridge */ /* synthetic */ org.lwjgl.system.Struct create(long r6, @javax.annotation.Nullable java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            org.lwjgl.vulkan.video.StdVideoEncodeH265WeightTable r0 = r0.create(r1, r2)
            return r0
    }

    static {
            r0 = 11
            org.lwjgl.system.Struct$Member[] r0 = new org.lwjgl.system.Struct.Member[r0]
            r1 = r0
            r2 = 0
            int r3 = org.lwjgl.vulkan.video.StdVideoEncodeH265WeightTableFlags.SIZEOF
            int r4 = org.lwjgl.vulkan.video.StdVideoEncodeH265WeightTableFlags.ALIGNOF
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
            r4 = 15
            org.lwjgl.system.Struct$Member r3 = __array(r3, r4)
            r1[r2] = r3
            r1 = r0
            r2 = 4
            r3 = 1
            r4 = 15
            org.lwjgl.system.Struct$Member r3 = __array(r3, r4)
            r1[r2] = r3
            r1 = r0
            r2 = 5
            r3 = 1
            r4 = 2
            org.lwjgl.system.Struct$Member r3 = __array(r3, r4)
            r1[r2] = r3
            r1 = r0
            r2 = 6
            r3 = 1
            r4 = 2
            org.lwjgl.system.Struct$Member r3 = __array(r3, r4)
            r1[r2] = r3
            r1 = r0
            r2 = 7
            r3 = 1
            r4 = 15
            org.lwjgl.system.Struct$Member r3 = __array(r3, r4)
            r1[r2] = r3
            r1 = r0
            r2 = 8
            r3 = 1
            r4 = 15
            org.lwjgl.system.Struct$Member r3 = __array(r3, r4)
            r1[r2] = r3
            r1 = r0
            r2 = 9
            r3 = 1
            r4 = 2
            org.lwjgl.system.Struct$Member r3 = __array(r3, r4)
            r1[r2] = r3
            r1 = r0
            r2 = 10
            r3 = 1
            r4 = 2
            org.lwjgl.system.Struct$Member r3 = __array(r3, r4)
            r1[r2] = r3
            org.lwjgl.system.Struct$Layout r0 = __struct(r0)
            r6 = r0
            r0 = r6
            int r0 = r0.getSize()
            org.lwjgl.vulkan.video.StdVideoEncodeH265WeightTable.SIZEOF = r0
            r0 = r6
            int r0 = r0.getAlignment()
            org.lwjgl.vulkan.video.StdVideoEncodeH265WeightTable.ALIGNOF = r0
            r0 = r6
            r1 = 0
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.video.StdVideoEncodeH265WeightTable.FLAGS = r0
            r0 = r6
            r1 = 1
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.video.StdVideoEncodeH265WeightTable.LUMA_LOG2_WEIGHT_DENOM = r0
            r0 = r6
            r1 = 2
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.video.StdVideoEncodeH265WeightTable.DELTA_CHROMA_LOG2_WEIGHT_DENOM = r0
            r0 = r6
            r1 = 3
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.video.StdVideoEncodeH265WeightTable.DELTA_LUMA_WEIGHT_L0 = r0
            r0 = r6
            r1 = 4
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.video.StdVideoEncodeH265WeightTable.LUMA_OFFSET_L0 = r0
            r0 = r6
            r1 = 5
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.video.StdVideoEncodeH265WeightTable.DELTA_CHROMA_WEIGHT_L0 = r0
            r0 = r6
            r1 = 6
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.video.StdVideoEncodeH265WeightTable.DELTA_CHROMA_OFFSET_L0 = r0
            r0 = r6
            r1 = 7
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.video.StdVideoEncodeH265WeightTable.DELTA_LUMA_WEIGHT_L1 = r0
            r0 = r6
            r1 = 8
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.video.StdVideoEncodeH265WeightTable.LUMA_OFFSET_L1 = r0
            r0 = r6
            r1 = 9
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.video.StdVideoEncodeH265WeightTable.DELTA_CHROMA_WEIGHT_L1 = r0
            r0 = r6
            r1 = 10
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.video.StdVideoEncodeH265WeightTable.DELTA_CHROMA_OFFSET_L1 = r0
            return
    }
}
