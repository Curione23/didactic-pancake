package org.lwjgl.vulkan.video;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/video/StdVideoH265ShortTermRefPicSet.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/video/StdVideoH265ShortTermRefPicSet.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/video/StdVideoH265ShortTermRefPicSet.class */
public class StdVideoH265ShortTermRefPicSet extends org.lwjgl.system.Struct<org.lwjgl.vulkan.video.StdVideoH265ShortTermRefPicSet> implements org.lwjgl.system.NativeResource {
    public static final int SIZEOF = 0;
    public static final int ALIGNOF = 0;
    public static final int FLAGS = 0;
    public static final int DELTA_IDX_MINUS1 = 0;
    public static final int USE_DELTA_FLAG = 0;
    public static final int ABS_DELTA_RPS_MINUS1 = 0;
    public static final int USED_BY_CURR_PIC_FLAG = 0;
    public static final int USED_BY_CURR_PIC_S0_FLAG = 0;
    public static final int USED_BY_CURR_PIC_S1_FLAG = 0;
    public static final int RESERVED1 = 0;
    public static final int RESERVED2 = 0;
    public static final int RESERVED3 = 0;
    public static final int NUM_NEGATIVE_PICS = 0;
    public static final int NUM_POSITIVE_PICS = 0;
    public static final int DELTA_POC_S0_MINUS1 = 0;
    public static final int DELTA_POC_S1_MINUS1 = 0;

    /* JADX WARN: Classes with same name are omitted, all sources:
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/video/StdVideoH265ShortTermRefPicSet$Buffer.class
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/video/StdVideoH265ShortTermRefPicSet$Buffer.class
     */
    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/video/StdVideoH265ShortTermRefPicSet$Buffer.class */
    public static class Buffer extends org.lwjgl.system.StructBuffer<org.lwjgl.vulkan.video.StdVideoH265ShortTermRefPicSet, org.lwjgl.vulkan.video.StdVideoH265ShortTermRefPicSet.Buffer> implements org.lwjgl.system.NativeResource {
        private static final org.lwjgl.vulkan.video.StdVideoH265ShortTermRefPicSet ELEMENT_FACTORY = null;

        public Buffer(java.nio.ByteBuffer r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r6
                int r2 = r2.remaining()
                int r3 = org.lwjgl.vulkan.video.StdVideoH265ShortTermRefPicSet.SIZEOF
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
        protected org.lwjgl.vulkan.video.StdVideoH265ShortTermRefPicSet.Buffer self() {
                r2 = this;
                r0 = r2
                return r0
        }

        @Override // org.lwjgl.system.StructBuffer
        protected org.lwjgl.vulkan.video.StdVideoH265ShortTermRefPicSet getElementFactory() {
                r2 = this;
                org.lwjgl.vulkan.video.StdVideoH265ShortTermRefPicSet r0 = org.lwjgl.vulkan.video.StdVideoH265ShortTermRefPicSet.Buffer.ELEMENT_FACTORY
                return r0
        }

        public org.lwjgl.vulkan.video.StdVideoH265ShortTermRefPicSetFlags flags() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                org.lwjgl.vulkan.video.StdVideoH265ShortTermRefPicSetFlags r0 = org.lwjgl.vulkan.video.StdVideoH265ShortTermRefPicSet.nflags(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint32_t")
        public int delta_idx_minus1() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.video.StdVideoH265ShortTermRefPicSet.ndelta_idx_minus1(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint16_t")
        public short use_delta_flag() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                short r0 = org.lwjgl.vulkan.video.StdVideoH265ShortTermRefPicSet.nuse_delta_flag(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint16_t")
        public short abs_delta_rps_minus1() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                short r0 = org.lwjgl.vulkan.video.StdVideoH265ShortTermRefPicSet.nabs_delta_rps_minus1(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint16_t")
        public short used_by_curr_pic_flag() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                short r0 = org.lwjgl.vulkan.video.StdVideoH265ShortTermRefPicSet.nused_by_curr_pic_flag(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint16_t")
        public short used_by_curr_pic_s0_flag() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                short r0 = org.lwjgl.vulkan.video.StdVideoH265ShortTermRefPicSet.nused_by_curr_pic_s0_flag(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint16_t")
        public short used_by_curr_pic_s1_flag() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                short r0 = org.lwjgl.vulkan.video.StdVideoH265ShortTermRefPicSet.nused_by_curr_pic_s1_flag(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint8_t")
        public byte num_negative_pics() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                byte r0 = org.lwjgl.vulkan.video.StdVideoH265ShortTermRefPicSet.nnum_negative_pics(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint8_t")
        public byte num_positive_pics() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                byte r0 = org.lwjgl.vulkan.video.StdVideoH265ShortTermRefPicSet.nnum_positive_pics(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint16_t[STD_VIDEO_H265_MAX_DPB_SIZE]")
        public java.nio.ShortBuffer delta_poc_s0_minus1() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                java.nio.ShortBuffer r0 = org.lwjgl.vulkan.video.StdVideoH265ShortTermRefPicSet.ndelta_poc_s0_minus1(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint16_t")
        public short delta_poc_s0_minus1(int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                short r0 = org.lwjgl.vulkan.video.StdVideoH265ShortTermRefPicSet.ndelta_poc_s0_minus1(r0, r1)
                return r0
        }

        @org.lwjgl.system.NativeType("uint16_t[STD_VIDEO_H265_MAX_DPB_SIZE]")
        public java.nio.ShortBuffer delta_poc_s1_minus1() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                java.nio.ShortBuffer r0 = org.lwjgl.vulkan.video.StdVideoH265ShortTermRefPicSet.ndelta_poc_s1_minus1(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint16_t")
        public short delta_poc_s1_minus1(int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                short r0 = org.lwjgl.vulkan.video.StdVideoH265ShortTermRefPicSet.ndelta_poc_s1_minus1(r0, r1)
                return r0
        }

        public org.lwjgl.vulkan.video.StdVideoH265ShortTermRefPicSet.Buffer flags(org.lwjgl.vulkan.video.StdVideoH265ShortTermRefPicSetFlags r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.video.StdVideoH265ShortTermRefPicSet.nflags(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.video.StdVideoH265ShortTermRefPicSet.Buffer flags(java.util.function.Consumer<org.lwjgl.vulkan.video.StdVideoH265ShortTermRefPicSetFlags> r4) {
                r3 = this;
                r0 = r4
                r1 = r3
                org.lwjgl.vulkan.video.StdVideoH265ShortTermRefPicSetFlags r1 = r1.flags()
                r0.accept(r1)
                r0 = r3
                return r0
        }

        public org.lwjgl.vulkan.video.StdVideoH265ShortTermRefPicSet.Buffer delta_idx_minus1(@org.lwjgl.system.NativeType("uint32_t") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.video.StdVideoH265ShortTermRefPicSet.ndelta_idx_minus1(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.video.StdVideoH265ShortTermRefPicSet.Buffer use_delta_flag(@org.lwjgl.system.NativeType("uint16_t") short r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.video.StdVideoH265ShortTermRefPicSet.nuse_delta_flag(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.video.StdVideoH265ShortTermRefPicSet.Buffer abs_delta_rps_minus1(@org.lwjgl.system.NativeType("uint16_t") short r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.video.StdVideoH265ShortTermRefPicSet.nabs_delta_rps_minus1(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.video.StdVideoH265ShortTermRefPicSet.Buffer used_by_curr_pic_flag(@org.lwjgl.system.NativeType("uint16_t") short r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.video.StdVideoH265ShortTermRefPicSet.nused_by_curr_pic_flag(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.video.StdVideoH265ShortTermRefPicSet.Buffer used_by_curr_pic_s0_flag(@org.lwjgl.system.NativeType("uint16_t") short r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.video.StdVideoH265ShortTermRefPicSet.nused_by_curr_pic_s0_flag(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.video.StdVideoH265ShortTermRefPicSet.Buffer used_by_curr_pic_s1_flag(@org.lwjgl.system.NativeType("uint16_t") short r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.video.StdVideoH265ShortTermRefPicSet.nused_by_curr_pic_s1_flag(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.video.StdVideoH265ShortTermRefPicSet.Buffer num_negative_pics(@org.lwjgl.system.NativeType("uint8_t") byte r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.video.StdVideoH265ShortTermRefPicSet.nnum_negative_pics(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.video.StdVideoH265ShortTermRefPicSet.Buffer num_positive_pics(@org.lwjgl.system.NativeType("uint8_t") byte r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.video.StdVideoH265ShortTermRefPicSet.nnum_positive_pics(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.video.StdVideoH265ShortTermRefPicSet.Buffer delta_poc_s0_minus1(@org.lwjgl.system.NativeType("uint16_t[STD_VIDEO_H265_MAX_DPB_SIZE]") java.nio.ShortBuffer r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.video.StdVideoH265ShortTermRefPicSet.ndelta_poc_s0_minus1(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.video.StdVideoH265ShortTermRefPicSet.Buffer delta_poc_s0_minus1(int r6, @org.lwjgl.system.NativeType("uint16_t") short r7) {
                r5 = this;
                r0 = r5
                long r0 = r0.address()
                r1 = r6
                r2 = r7
                org.lwjgl.vulkan.video.StdVideoH265ShortTermRefPicSet.ndelta_poc_s0_minus1(r0, r1, r2)
                r0 = r5
                return r0
        }

        public org.lwjgl.vulkan.video.StdVideoH265ShortTermRefPicSet.Buffer delta_poc_s1_minus1(@org.lwjgl.system.NativeType("uint16_t[STD_VIDEO_H265_MAX_DPB_SIZE]") java.nio.ShortBuffer r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.video.StdVideoH265ShortTermRefPicSet.ndelta_poc_s1_minus1(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.video.StdVideoH265ShortTermRefPicSet.Buffer delta_poc_s1_minus1(int r6, @org.lwjgl.system.NativeType("uint16_t") short r7) {
                r5 = this;
                r0 = r5
                long r0 = r0.address()
                r1 = r6
                r2 = r7
                org.lwjgl.vulkan.video.StdVideoH265ShortTermRefPicSet.ndelta_poc_s1_minus1(r0, r1, r2)
                r0 = r5
                return r0
        }

        @Override // org.lwjgl.system.StructBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.Struct getElementFactory() {
                r2 = this;
                r0 = r2
                org.lwjgl.vulkan.video.StdVideoH265ShortTermRefPicSet r0 = r0.getElementFactory()
                return r0
        }

        @Override // org.lwjgl.system.CustomBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.CustomBuffer self() {
                r2 = this;
                r0 = r2
                org.lwjgl.vulkan.video.StdVideoH265ShortTermRefPicSet$Buffer r0 = r0.self()
                return r0
        }

        static {
                r0 = -1
                org.lwjgl.vulkan.video.StdVideoH265ShortTermRefPicSet r0 = org.lwjgl.vulkan.video.StdVideoH265ShortTermRefPicSet.create(r0)
                org.lwjgl.vulkan.video.StdVideoH265ShortTermRefPicSet.Buffer.ELEMENT_FACTORY = r0
                return
        }
    }

    protected StdVideoH265ShortTermRefPicSet(long r6, @javax.annotation.Nullable java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    protected org.lwjgl.vulkan.video.StdVideoH265ShortTermRefPicSet create(long r7, @javax.annotation.Nullable java.nio.ByteBuffer r9) {
            r6 = this;
            org.lwjgl.vulkan.video.StdVideoH265ShortTermRefPicSet r0 = new org.lwjgl.vulkan.video.StdVideoH265ShortTermRefPicSet
            r1 = r0
            r2 = r7
            r3 = r9
            r1.<init>(r2, r3)
            return r0
    }

    public StdVideoH265ShortTermRefPicSet(java.nio.ByteBuffer r7) {
            r6 = this;
            r0 = r6
            r1 = r7
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            r2 = r7
            int r3 = org.lwjgl.vulkan.video.StdVideoH265ShortTermRefPicSet.SIZEOF
            java.nio.ByteBuffer r2 = __checkContainer(r2, r3)
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
            r2 = this;
            int r0 = org.lwjgl.vulkan.video.StdVideoH265ShortTermRefPicSet.SIZEOF
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoH265ShortTermRefPicSetFlags flags() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            org.lwjgl.vulkan.video.StdVideoH265ShortTermRefPicSetFlags r0 = nflags(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("uint32_t")
    public int delta_idx_minus1() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = ndelta_idx_minus1(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("uint16_t")
    public short use_delta_flag() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            short r0 = nuse_delta_flag(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("uint16_t")
    public short abs_delta_rps_minus1() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            short r0 = nabs_delta_rps_minus1(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("uint16_t")
    public short used_by_curr_pic_flag() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            short r0 = nused_by_curr_pic_flag(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("uint16_t")
    public short used_by_curr_pic_s0_flag() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            short r0 = nused_by_curr_pic_s0_flag(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("uint16_t")
    public short used_by_curr_pic_s1_flag() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            short r0 = nused_by_curr_pic_s1_flag(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("uint8_t")
    public byte num_negative_pics() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            byte r0 = nnum_negative_pics(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("uint8_t")
    public byte num_positive_pics() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            byte r0 = nnum_positive_pics(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("uint16_t[STD_VIDEO_H265_MAX_DPB_SIZE]")
    public java.nio.ShortBuffer delta_poc_s0_minus1() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            java.nio.ShortBuffer r0 = ndelta_poc_s0_minus1(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("uint16_t")
    public short delta_poc_s0_minus1(int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            short r0 = ndelta_poc_s0_minus1(r0, r1)
            return r0
    }

    @org.lwjgl.system.NativeType("uint16_t[STD_VIDEO_H265_MAX_DPB_SIZE]")
    public java.nio.ShortBuffer delta_poc_s1_minus1() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            java.nio.ShortBuffer r0 = ndelta_poc_s1_minus1(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("uint16_t")
    public short delta_poc_s1_minus1(int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            short r0 = ndelta_poc_s1_minus1(r0, r1)
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoH265ShortTermRefPicSet flags(org.lwjgl.vulkan.video.StdVideoH265ShortTermRefPicSetFlags r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nflags(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoH265ShortTermRefPicSet flags(java.util.function.Consumer<org.lwjgl.vulkan.video.StdVideoH265ShortTermRefPicSetFlags> r4) {
            r3 = this;
            r0 = r4
            r1 = r3
            org.lwjgl.vulkan.video.StdVideoH265ShortTermRefPicSetFlags r1 = r1.flags()
            r0.accept(r1)
            r0 = r3
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoH265ShortTermRefPicSet delta_idx_minus1(@org.lwjgl.system.NativeType("uint32_t") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            ndelta_idx_minus1(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoH265ShortTermRefPicSet use_delta_flag(@org.lwjgl.system.NativeType("uint16_t") short r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nuse_delta_flag(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoH265ShortTermRefPicSet abs_delta_rps_minus1(@org.lwjgl.system.NativeType("uint16_t") short r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nabs_delta_rps_minus1(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoH265ShortTermRefPicSet used_by_curr_pic_flag(@org.lwjgl.system.NativeType("uint16_t") short r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nused_by_curr_pic_flag(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoH265ShortTermRefPicSet used_by_curr_pic_s0_flag(@org.lwjgl.system.NativeType("uint16_t") short r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nused_by_curr_pic_s0_flag(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoH265ShortTermRefPicSet used_by_curr_pic_s1_flag(@org.lwjgl.system.NativeType("uint16_t") short r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nused_by_curr_pic_s1_flag(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoH265ShortTermRefPicSet num_negative_pics(@org.lwjgl.system.NativeType("uint8_t") byte r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nnum_negative_pics(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoH265ShortTermRefPicSet num_positive_pics(@org.lwjgl.system.NativeType("uint8_t") byte r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nnum_positive_pics(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoH265ShortTermRefPicSet delta_poc_s0_minus1(@org.lwjgl.system.NativeType("uint16_t[STD_VIDEO_H265_MAX_DPB_SIZE]") java.nio.ShortBuffer r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            ndelta_poc_s0_minus1(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoH265ShortTermRefPicSet delta_poc_s0_minus1(int r6, @org.lwjgl.system.NativeType("uint16_t") short r7) {
            r5 = this;
            r0 = r5
            long r0 = r0.address()
            r1 = r6
            r2 = r7
            ndelta_poc_s0_minus1(r0, r1, r2)
            r0 = r5
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoH265ShortTermRefPicSet delta_poc_s1_minus1(@org.lwjgl.system.NativeType("uint16_t[STD_VIDEO_H265_MAX_DPB_SIZE]") java.nio.ShortBuffer r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            ndelta_poc_s1_minus1(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoH265ShortTermRefPicSet delta_poc_s1_minus1(int r6, @org.lwjgl.system.NativeType("uint16_t") short r7) {
            r5 = this;
            r0 = r5
            long r0 = r0.address()
            r1 = r6
            r2 = r7
            ndelta_poc_s1_minus1(r0, r1, r2)
            r0 = r5
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoH265ShortTermRefPicSet set(org.lwjgl.vulkan.video.StdVideoH265ShortTermRefPicSetFlags r4, int r5, short r6, short r7, short r8, short r9, short r10, byte r11, byte r12, java.nio.ShortBuffer r13, java.nio.ShortBuffer r14) {
            r3 = this;
            r0 = r3
            r1 = r4
            org.lwjgl.vulkan.video.StdVideoH265ShortTermRefPicSet r0 = r0.flags(r1)
            r0 = r3
            r1 = r5
            org.lwjgl.vulkan.video.StdVideoH265ShortTermRefPicSet r0 = r0.delta_idx_minus1(r1)
            r0 = r3
            r1 = r6
            org.lwjgl.vulkan.video.StdVideoH265ShortTermRefPicSet r0 = r0.use_delta_flag(r1)
            r0 = r3
            r1 = r7
            org.lwjgl.vulkan.video.StdVideoH265ShortTermRefPicSet r0 = r0.abs_delta_rps_minus1(r1)
            r0 = r3
            r1 = r8
            org.lwjgl.vulkan.video.StdVideoH265ShortTermRefPicSet r0 = r0.used_by_curr_pic_flag(r1)
            r0 = r3
            r1 = r9
            org.lwjgl.vulkan.video.StdVideoH265ShortTermRefPicSet r0 = r0.used_by_curr_pic_s0_flag(r1)
            r0 = r3
            r1 = r10
            org.lwjgl.vulkan.video.StdVideoH265ShortTermRefPicSet r0 = r0.used_by_curr_pic_s1_flag(r1)
            r0 = r3
            r1 = r11
            org.lwjgl.vulkan.video.StdVideoH265ShortTermRefPicSet r0 = r0.num_negative_pics(r1)
            r0 = r3
            r1 = r12
            org.lwjgl.vulkan.video.StdVideoH265ShortTermRefPicSet r0 = r0.num_positive_pics(r1)
            r0 = r3
            r1 = r13
            org.lwjgl.vulkan.video.StdVideoH265ShortTermRefPicSet r0 = r0.delta_poc_s0_minus1(r1)
            r0 = r3
            r1 = r14
            org.lwjgl.vulkan.video.StdVideoH265ShortTermRefPicSet r0 = r0.delta_poc_s1_minus1(r1)
            r0 = r3
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoH265ShortTermRefPicSet set(org.lwjgl.vulkan.video.StdVideoH265ShortTermRefPicSet r8) {
            r7 = this;
            r0 = r8
            long r0 = r0.address()
            r1 = r7
            long r1 = r1.address()
            int r2 = org.lwjgl.vulkan.video.StdVideoH265ShortTermRefPicSet.SIZEOF
            long r2 = (long) r2
            org.lwjgl.system.MemoryUtil.memCopy(r0, r1, r2)
            r0 = r7
            return r0
    }

    public static org.lwjgl.vulkan.video.StdVideoH265ShortTermRefPicSet malloc() {
            org.lwjgl.vulkan.video.StdVideoH265ShortTermRefPicSet r0 = new org.lwjgl.vulkan.video.StdVideoH265ShortTermRefPicSet
            r1 = r0
            int r2 = org.lwjgl.vulkan.video.StdVideoH265ShortTermRefPicSet.SIZEOF
            long r2 = (long) r2
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.video.StdVideoH265ShortTermRefPicSet calloc() {
            org.lwjgl.vulkan.video.StdVideoH265ShortTermRefPicSet r0 = new org.lwjgl.vulkan.video.StdVideoH265ShortTermRefPicSet
            r1 = r0
            r2 = 1
            int r3 = org.lwjgl.vulkan.video.StdVideoH265ShortTermRefPicSet.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.video.StdVideoH265ShortTermRefPicSet create() {
            int r0 = org.lwjgl.vulkan.video.StdVideoH265ShortTermRefPicSet.SIZEOF
            java.nio.ByteBuffer r0 = org.lwjgl.BufferUtils.createByteBuffer(r0)
            r6 = r0
            org.lwjgl.vulkan.video.StdVideoH265ShortTermRefPicSet r0 = new org.lwjgl.vulkan.video.StdVideoH265ShortTermRefPicSet
            r1 = r0
            r2 = r6
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.video.StdVideoH265ShortTermRefPicSet create(long r6) {
            org.lwjgl.vulkan.video.StdVideoH265ShortTermRefPicSet r0 = new org.lwjgl.vulkan.video.StdVideoH265ShortTermRefPicSet
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.vulkan.video.StdVideoH265ShortTermRefPicSet createSafe(long r6) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.vulkan.video.StdVideoH265ShortTermRefPicSet r0 = new org.lwjgl.vulkan.video.StdVideoH265ShortTermRefPicSet
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static org.lwjgl.vulkan.video.StdVideoH265ShortTermRefPicSet.Buffer malloc(int r6) {
            org.lwjgl.vulkan.video.StdVideoH265ShortTermRefPicSet$Buffer r0 = new org.lwjgl.vulkan.video.StdVideoH265ShortTermRefPicSet$Buffer
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.vulkan.video.StdVideoH265ShortTermRefPicSet.SIZEOF
            long r2 = __checkMalloc(r2, r3)
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.video.StdVideoH265ShortTermRefPicSet.Buffer calloc(int r7) {
            org.lwjgl.vulkan.video.StdVideoH265ShortTermRefPicSet$Buffer r0 = new org.lwjgl.vulkan.video.StdVideoH265ShortTermRefPicSet$Buffer
            r1 = r0
            r2 = r7
            long r2 = (long) r2
            int r3 = org.lwjgl.vulkan.video.StdVideoH265ShortTermRefPicSet.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.video.StdVideoH265ShortTermRefPicSet.Buffer create(int r10) {
            r0 = r10
            int r1 = org.lwjgl.vulkan.video.StdVideoH265ShortTermRefPicSet.SIZEOF
            java.nio.ByteBuffer r0 = __create(r0, r1)
            r11 = r0
            org.lwjgl.vulkan.video.StdVideoH265ShortTermRefPicSet$Buffer r0 = new org.lwjgl.vulkan.video.StdVideoH265ShortTermRefPicSet$Buffer
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

    public static org.lwjgl.vulkan.video.StdVideoH265ShortTermRefPicSet.Buffer create(long r6, int r8) {
            org.lwjgl.vulkan.video.StdVideoH265ShortTermRefPicSet$Buffer r0 = new org.lwjgl.vulkan.video.StdVideoH265ShortTermRefPicSet$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.vulkan.video.StdVideoH265ShortTermRefPicSet.Buffer createSafe(long r6, int r8) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.vulkan.video.StdVideoH265ShortTermRefPicSet$Buffer r0 = new org.lwjgl.vulkan.video.StdVideoH265ShortTermRefPicSet$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static org.lwjgl.vulkan.video.StdVideoH265ShortTermRefPicSet malloc(org.lwjgl.system.MemoryStack r6) {
            org.lwjgl.vulkan.video.StdVideoH265ShortTermRefPicSet r0 = new org.lwjgl.vulkan.video.StdVideoH265ShortTermRefPicSet
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.vulkan.video.StdVideoH265ShortTermRefPicSet.ALIGNOF
            int r4 = org.lwjgl.vulkan.video.StdVideoH265ShortTermRefPicSet.SIZEOF
            long r2 = r2.nmalloc(r3, r4)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.video.StdVideoH265ShortTermRefPicSet calloc(org.lwjgl.system.MemoryStack r7) {
            org.lwjgl.vulkan.video.StdVideoH265ShortTermRefPicSet r0 = new org.lwjgl.vulkan.video.StdVideoH265ShortTermRefPicSet
            r1 = r0
            r2 = r7
            int r3 = org.lwjgl.vulkan.video.StdVideoH265ShortTermRefPicSet.ALIGNOF
            r4 = 1
            int r5 = org.lwjgl.vulkan.video.StdVideoH265ShortTermRefPicSet.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.video.StdVideoH265ShortTermRefPicSet.Buffer malloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.vulkan.video.StdVideoH265ShortTermRefPicSet$Buffer r0 = new org.lwjgl.vulkan.video.StdVideoH265ShortTermRefPicSet$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.vulkan.video.StdVideoH265ShortTermRefPicSet.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.vulkan.video.StdVideoH265ShortTermRefPicSet.SIZEOF
            int r4 = r4 * r5
            long r2 = r2.nmalloc(r3, r4)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.video.StdVideoH265ShortTermRefPicSet.Buffer calloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.vulkan.video.StdVideoH265ShortTermRefPicSet$Buffer r0 = new org.lwjgl.vulkan.video.StdVideoH265ShortTermRefPicSet$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.vulkan.video.StdVideoH265ShortTermRefPicSet.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.vulkan.video.StdVideoH265ShortTermRefPicSet.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.video.StdVideoH265ShortTermRefPicSetFlags nflags(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.video.StdVideoH265ShortTermRefPicSet.FLAGS
            long r1 = (long) r1
            long r0 = r0 + r1
            org.lwjgl.vulkan.video.StdVideoH265ShortTermRefPicSetFlags r0 = org.lwjgl.vulkan.video.StdVideoH265ShortTermRefPicSetFlags.create(r0)
            return r0
    }

    public static int ndelta_idx_minus1(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.video.StdVideoH265ShortTermRefPicSet.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.video.StdVideoH265ShortTermRefPicSet.DELTA_IDX_MINUS1
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static short nuse_delta_flag(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.video.StdVideoH265ShortTermRefPicSet.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.video.StdVideoH265ShortTermRefPicSet.USE_DELTA_FLAG
            long r3 = (long) r3
            long r2 = r2 + r3
            short r0 = r0.getShort(r1, r2)
            return r0
    }

    public static short nabs_delta_rps_minus1(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.video.StdVideoH265ShortTermRefPicSet.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.video.StdVideoH265ShortTermRefPicSet.ABS_DELTA_RPS_MINUS1
            long r3 = (long) r3
            long r2 = r2 + r3
            short r0 = r0.getShort(r1, r2)
            return r0
    }

    public static short nused_by_curr_pic_flag(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.video.StdVideoH265ShortTermRefPicSet.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.video.StdVideoH265ShortTermRefPicSet.USED_BY_CURR_PIC_FLAG
            long r3 = (long) r3
            long r2 = r2 + r3
            short r0 = r0.getShort(r1, r2)
            return r0
    }

    public static short nused_by_curr_pic_s0_flag(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.video.StdVideoH265ShortTermRefPicSet.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.video.StdVideoH265ShortTermRefPicSet.USED_BY_CURR_PIC_S0_FLAG
            long r3 = (long) r3
            long r2 = r2 + r3
            short r0 = r0.getShort(r1, r2)
            return r0
    }

    public static short nused_by_curr_pic_s1_flag(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.video.StdVideoH265ShortTermRefPicSet.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.video.StdVideoH265ShortTermRefPicSet.USED_BY_CURR_PIC_S1_FLAG
            long r3 = (long) r3
            long r2 = r2 + r3
            short r0 = r0.getShort(r1, r2)
            return r0
    }

    public static short nreserved1(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.video.StdVideoH265ShortTermRefPicSet.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.video.StdVideoH265ShortTermRefPicSet.RESERVED1
            long r3 = (long) r3
            long r2 = r2 + r3
            short r0 = r0.getShort(r1, r2)
            return r0
    }

    public static byte nreserved2(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.video.StdVideoH265ShortTermRefPicSet.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.video.StdVideoH265ShortTermRefPicSet.RESERVED2
            long r3 = (long) r3
            long r2 = r2 + r3
            byte r0 = r0.getByte(r1, r2)
            return r0
    }

    public static byte nreserved3(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.video.StdVideoH265ShortTermRefPicSet.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.video.StdVideoH265ShortTermRefPicSet.RESERVED3
            long r3 = (long) r3
            long r2 = r2 + r3
            byte r0 = r0.getByte(r1, r2)
            return r0
    }

    public static byte nnum_negative_pics(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.video.StdVideoH265ShortTermRefPicSet.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.video.StdVideoH265ShortTermRefPicSet.NUM_NEGATIVE_PICS
            long r3 = (long) r3
            long r2 = r2 + r3
            byte r0 = r0.getByte(r1, r2)
            return r0
    }

    public static byte nnum_positive_pics(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.video.StdVideoH265ShortTermRefPicSet.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.video.StdVideoH265ShortTermRefPicSet.NUM_POSITIVE_PICS
            long r3 = (long) r3
            long r2 = r2 + r3
            byte r0 = r0.getByte(r1, r2)
            return r0
    }

    public static java.nio.ShortBuffer ndelta_poc_s0_minus1(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.video.StdVideoH265ShortTermRefPicSet.DELTA_POC_S0_MINUS1
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = 16
            java.nio.ShortBuffer r0 = org.lwjgl.system.MemoryUtil.memShortBuffer(r0, r1)
            return r0
    }

    public static short ndelta_poc_s0_minus1(long r9, int r11) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.video.StdVideoH265ShortTermRefPicSet.UNSAFE
            r1 = 0
            r2 = r9
            int r3 = org.lwjgl.vulkan.video.StdVideoH265ShortTermRefPicSet.DELTA_POC_S0_MINUS1
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r11
            r4 = 16
            long r3 = org.lwjgl.system.Checks.check(r3, r4)
            r4 = 2
            long r3 = r3 * r4
            long r2 = r2 + r3
            short r0 = r0.getShort(r1, r2)
            return r0
    }

    public static java.nio.ShortBuffer ndelta_poc_s1_minus1(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.video.StdVideoH265ShortTermRefPicSet.DELTA_POC_S1_MINUS1
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = 16
            java.nio.ShortBuffer r0 = org.lwjgl.system.MemoryUtil.memShortBuffer(r0, r1)
            return r0
    }

    public static short ndelta_poc_s1_minus1(long r9, int r11) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.video.StdVideoH265ShortTermRefPicSet.UNSAFE
            r1 = 0
            r2 = r9
            int r3 = org.lwjgl.vulkan.video.StdVideoH265ShortTermRefPicSet.DELTA_POC_S1_MINUS1
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r11
            r4 = 16
            long r3 = org.lwjgl.system.Checks.check(r3, r4)
            r4 = 2
            long r3 = r3 * r4
            long r2 = r2 + r3
            short r0 = r0.getShort(r1, r2)
            return r0
    }

    public static void nflags(long r7, org.lwjgl.vulkan.video.StdVideoH265ShortTermRefPicSetFlags r9) {
            r0 = r9
            long r0 = r0.address()
            r1 = r7
            int r2 = org.lwjgl.vulkan.video.StdVideoH265ShortTermRefPicSet.FLAGS
            long r2 = (long) r2
            long r1 = r1 + r2
            int r2 = org.lwjgl.vulkan.video.StdVideoH265ShortTermRefPicSetFlags.SIZEOF
            long r2 = (long) r2
            org.lwjgl.system.MemoryUtil.memCopy(r0, r1, r2)
            return
    }

    public static void ndelta_idx_minus1(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.video.StdVideoH265ShortTermRefPicSet.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.video.StdVideoH265ShortTermRefPicSet.DELTA_IDX_MINUS1
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void nuse_delta_flag(long r7, short r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.video.StdVideoH265ShortTermRefPicSet.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.video.StdVideoH265ShortTermRefPicSet.USE_DELTA_FLAG
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putShort(r1, r2, r3)
            return
    }

    public static void nabs_delta_rps_minus1(long r7, short r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.video.StdVideoH265ShortTermRefPicSet.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.video.StdVideoH265ShortTermRefPicSet.ABS_DELTA_RPS_MINUS1
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putShort(r1, r2, r3)
            return
    }

    public static void nused_by_curr_pic_flag(long r7, short r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.video.StdVideoH265ShortTermRefPicSet.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.video.StdVideoH265ShortTermRefPicSet.USED_BY_CURR_PIC_FLAG
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putShort(r1, r2, r3)
            return
    }

    public static void nused_by_curr_pic_s0_flag(long r7, short r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.video.StdVideoH265ShortTermRefPicSet.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.video.StdVideoH265ShortTermRefPicSet.USED_BY_CURR_PIC_S0_FLAG
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putShort(r1, r2, r3)
            return
    }

    public static void nused_by_curr_pic_s1_flag(long r7, short r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.video.StdVideoH265ShortTermRefPicSet.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.video.StdVideoH265ShortTermRefPicSet.USED_BY_CURR_PIC_S1_FLAG
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putShort(r1, r2, r3)
            return
    }

    public static void nreserved1(long r7, short r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.video.StdVideoH265ShortTermRefPicSet.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.video.StdVideoH265ShortTermRefPicSet.RESERVED1
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putShort(r1, r2, r3)
            return
    }

    public static void nreserved2(long r7, byte r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.video.StdVideoH265ShortTermRefPicSet.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.video.StdVideoH265ShortTermRefPicSet.RESERVED2
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putByte(r1, r2, r3)
            return
    }

    public static void nreserved3(long r7, byte r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.video.StdVideoH265ShortTermRefPicSet.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.video.StdVideoH265ShortTermRefPicSet.RESERVED3
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putByte(r1, r2, r3)
            return
    }

    public static void nnum_negative_pics(long r7, byte r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.video.StdVideoH265ShortTermRefPicSet.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.video.StdVideoH265ShortTermRefPicSet.NUM_NEGATIVE_PICS
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putByte(r1, r2, r3)
            return
    }

    public static void nnum_positive_pics(long r7, byte r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.video.StdVideoH265ShortTermRefPicSet.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.video.StdVideoH265ShortTermRefPicSet.NUM_POSITIVE_PICS
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putByte(r1, r2, r3)
            return
    }

    public static void ndelta_poc_s0_minus1(long r7, java.nio.ShortBuffer r9) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lc
            r0 = r9
            r1 = 16
            org.lwjgl.system.Checks.checkGT(r0, r1)
        Lc:
            r0 = r9
            long r0 = org.lwjgl.system.MemoryUtil.memAddress(r0)
            r1 = r7
            int r2 = org.lwjgl.vulkan.video.StdVideoH265ShortTermRefPicSet.DELTA_POC_S0_MINUS1
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

    public static void ndelta_poc_s0_minus1(long r9, int r11, short r12) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.video.StdVideoH265ShortTermRefPicSet.UNSAFE
            r1 = 0
            r2 = r9
            int r3 = org.lwjgl.vulkan.video.StdVideoH265ShortTermRefPicSet.DELTA_POC_S0_MINUS1
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r11
            r4 = 16
            long r3 = org.lwjgl.system.Checks.check(r3, r4)
            r4 = 2
            long r3 = r3 * r4
            long r2 = r2 + r3
            r3 = r12
            r0.putShort(r1, r2, r3)
            return
    }

    public static void ndelta_poc_s1_minus1(long r7, java.nio.ShortBuffer r9) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lc
            r0 = r9
            r1 = 16
            org.lwjgl.system.Checks.checkGT(r0, r1)
        Lc:
            r0 = r9
            long r0 = org.lwjgl.system.MemoryUtil.memAddress(r0)
            r1 = r7
            int r2 = org.lwjgl.vulkan.video.StdVideoH265ShortTermRefPicSet.DELTA_POC_S1_MINUS1
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

    public static void ndelta_poc_s1_minus1(long r9, int r11, short r12) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.video.StdVideoH265ShortTermRefPicSet.UNSAFE
            r1 = 0
            r2 = r9
            int r3 = org.lwjgl.vulkan.video.StdVideoH265ShortTermRefPicSet.DELTA_POC_S1_MINUS1
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r11
            r4 = 16
            long r3 = org.lwjgl.system.Checks.check(r3, r4)
            r4 = 2
            long r3 = r3 * r4
            long r2 = r2 + r3
            r3 = r12
            r0.putShort(r1, r2, r3)
            return
    }

    @Override // org.lwjgl.system.Struct
    protected /* bridge */ /* synthetic */ org.lwjgl.system.Struct create(long r6, @javax.annotation.Nullable java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            org.lwjgl.vulkan.video.StdVideoH265ShortTermRefPicSet r0 = r0.create(r1, r2)
            return r0
    }

    static {
            r0 = 14
            org.lwjgl.system.Struct$Member[] r0 = new org.lwjgl.system.Struct.Member[r0]
            r1 = r0
            r2 = 0
            int r3 = org.lwjgl.vulkan.video.StdVideoH265ShortTermRefPicSetFlags.SIZEOF
            int r4 = org.lwjgl.vulkan.video.StdVideoH265ShortTermRefPicSetFlags.ALIGNOF
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
            r3 = 2
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 7
            r3 = 2
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
            r3 = 2
            r4 = 16
            org.lwjgl.system.Struct$Member r3 = __array(r3, r4)
            r1[r2] = r3
            r1 = r0
            r2 = 13
            r3 = 2
            r4 = 16
            org.lwjgl.system.Struct$Member r3 = __array(r3, r4)
            r1[r2] = r3
            org.lwjgl.system.Struct$Layout r0 = __struct(r0)
            r6 = r0
            r0 = r6
            int r0 = r0.getSize()
            org.lwjgl.vulkan.video.StdVideoH265ShortTermRefPicSet.SIZEOF = r0
            r0 = r6
            int r0 = r0.getAlignment()
            org.lwjgl.vulkan.video.StdVideoH265ShortTermRefPicSet.ALIGNOF = r0
            r0 = r6
            r1 = 0
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.video.StdVideoH265ShortTermRefPicSet.FLAGS = r0
            r0 = r6
            r1 = 1
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.video.StdVideoH265ShortTermRefPicSet.DELTA_IDX_MINUS1 = r0
            r0 = r6
            r1 = 2
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.video.StdVideoH265ShortTermRefPicSet.USE_DELTA_FLAG = r0
            r0 = r6
            r1 = 3
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.video.StdVideoH265ShortTermRefPicSet.ABS_DELTA_RPS_MINUS1 = r0
            r0 = r6
            r1 = 4
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.video.StdVideoH265ShortTermRefPicSet.USED_BY_CURR_PIC_FLAG = r0
            r0 = r6
            r1 = 5
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.video.StdVideoH265ShortTermRefPicSet.USED_BY_CURR_PIC_S0_FLAG = r0
            r0 = r6
            r1 = 6
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.video.StdVideoH265ShortTermRefPicSet.USED_BY_CURR_PIC_S1_FLAG = r0
            r0 = r6
            r1 = 7
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.video.StdVideoH265ShortTermRefPicSet.RESERVED1 = r0
            r0 = r6
            r1 = 8
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.video.StdVideoH265ShortTermRefPicSet.RESERVED2 = r0
            r0 = r6
            r1 = 9
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.video.StdVideoH265ShortTermRefPicSet.RESERVED3 = r0
            r0 = r6
            r1 = 10
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.video.StdVideoH265ShortTermRefPicSet.NUM_NEGATIVE_PICS = r0
            r0 = r6
            r1 = 11
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.video.StdVideoH265ShortTermRefPicSet.NUM_POSITIVE_PICS = r0
            r0 = r6
            r1 = 12
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.video.StdVideoH265ShortTermRefPicSet.DELTA_POC_S0_MINUS1 = r0
            r0 = r6
            r1 = 13
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.video.StdVideoH265ShortTermRefPicSet.DELTA_POC_S1_MINUS1 = r0
            return
    }
}
