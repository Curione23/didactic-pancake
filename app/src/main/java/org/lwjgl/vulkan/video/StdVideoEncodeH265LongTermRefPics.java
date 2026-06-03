package org.lwjgl.vulkan.video;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/video/StdVideoEncodeH265LongTermRefPics.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/video/StdVideoEncodeH265LongTermRefPics.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/video/StdVideoEncodeH265LongTermRefPics.class */
public class StdVideoEncodeH265LongTermRefPics extends org.lwjgl.system.Struct<org.lwjgl.vulkan.video.StdVideoEncodeH265LongTermRefPics> implements org.lwjgl.system.NativeResource {
    public static final int SIZEOF = 0;
    public static final int ALIGNOF = 0;
    public static final int NUM_LONG_TERM_SPS = 0;
    public static final int NUM_LONG_TERM_PICS = 0;
    public static final int LT_IDX_SPS = 0;
    public static final int POC_LSB_LT = 0;
    public static final int USED_BY_CURR_PIC_LT_FLAG = 0;
    public static final int DELTA_POC_MSB_PRESENT_FLAG = 0;
    public static final int DELTA_POC_MSB_CYCLE_LT = 0;

    /* JADX WARN: Classes with same name are omitted, all sources:
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/video/StdVideoEncodeH265LongTermRefPics$Buffer.class
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/video/StdVideoEncodeH265LongTermRefPics$Buffer.class
     */
    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/video/StdVideoEncodeH265LongTermRefPics$Buffer.class */
    public static class Buffer extends org.lwjgl.system.StructBuffer<org.lwjgl.vulkan.video.StdVideoEncodeH265LongTermRefPics, org.lwjgl.vulkan.video.StdVideoEncodeH265LongTermRefPics.Buffer> implements org.lwjgl.system.NativeResource {
        private static final org.lwjgl.vulkan.video.StdVideoEncodeH265LongTermRefPics ELEMENT_FACTORY = null;

        public Buffer(java.nio.ByteBuffer r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r6
                int r2 = r2.remaining()
                int r3 = org.lwjgl.vulkan.video.StdVideoEncodeH265LongTermRefPics.SIZEOF
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
        protected org.lwjgl.vulkan.video.StdVideoEncodeH265LongTermRefPics.Buffer self() {
                r2 = this;
                r0 = r2
                return r0
        }

        @Override // org.lwjgl.system.StructBuffer
        protected org.lwjgl.vulkan.video.StdVideoEncodeH265LongTermRefPics getElementFactory() {
                r2 = this;
                org.lwjgl.vulkan.video.StdVideoEncodeH265LongTermRefPics r0 = org.lwjgl.vulkan.video.StdVideoEncodeH265LongTermRefPics.Buffer.ELEMENT_FACTORY
                return r0
        }

        @org.lwjgl.system.NativeType("uint8_t")
        public byte num_long_term_sps() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                byte r0 = org.lwjgl.vulkan.video.StdVideoEncodeH265LongTermRefPics.nnum_long_term_sps(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint8_t")
        public byte num_long_term_pics() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                byte r0 = org.lwjgl.vulkan.video.StdVideoEncodeH265LongTermRefPics.nnum_long_term_pics(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint8_t[STD_VIDEO_H265_MAX_LONG_TERM_REF_PICS_SPS]")
        public java.nio.ByteBuffer lt_idx_sps() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                java.nio.ByteBuffer r0 = org.lwjgl.vulkan.video.StdVideoEncodeH265LongTermRefPics.nlt_idx_sps(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint8_t")
        public byte lt_idx_sps(int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                byte r0 = org.lwjgl.vulkan.video.StdVideoEncodeH265LongTermRefPics.nlt_idx_sps(r0, r1)
                return r0
        }

        @org.lwjgl.system.NativeType("uint8_t[STD_VIDEO_H265_MAX_LONG_TERM_PICS]")
        public java.nio.ByteBuffer poc_lsb_lt() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                java.nio.ByteBuffer r0 = org.lwjgl.vulkan.video.StdVideoEncodeH265LongTermRefPics.npoc_lsb_lt(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint8_t")
        public byte poc_lsb_lt(int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                byte r0 = org.lwjgl.vulkan.video.StdVideoEncodeH265LongTermRefPics.npoc_lsb_lt(r0, r1)
                return r0
        }

        @org.lwjgl.system.NativeType("uint16_t")
        public short used_by_curr_pic_lt_flag() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                short r0 = org.lwjgl.vulkan.video.StdVideoEncodeH265LongTermRefPics.nused_by_curr_pic_lt_flag(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint8_t[STD_VIDEO_H265_MAX_DELTA_POC]")
        public java.nio.ByteBuffer delta_poc_msb_present_flag() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                java.nio.ByteBuffer r0 = org.lwjgl.vulkan.video.StdVideoEncodeH265LongTermRefPics.ndelta_poc_msb_present_flag(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint8_t")
        public byte delta_poc_msb_present_flag(int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                byte r0 = org.lwjgl.vulkan.video.StdVideoEncodeH265LongTermRefPics.ndelta_poc_msb_present_flag(r0, r1)
                return r0
        }

        @org.lwjgl.system.NativeType("uint8_t[STD_VIDEO_H265_MAX_DELTA_POC]")
        public java.nio.ByteBuffer delta_poc_msb_cycle_lt() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                java.nio.ByteBuffer r0 = org.lwjgl.vulkan.video.StdVideoEncodeH265LongTermRefPics.ndelta_poc_msb_cycle_lt(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint8_t")
        public byte delta_poc_msb_cycle_lt(int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                byte r0 = org.lwjgl.vulkan.video.StdVideoEncodeH265LongTermRefPics.ndelta_poc_msb_cycle_lt(r0, r1)
                return r0
        }

        public org.lwjgl.vulkan.video.StdVideoEncodeH265LongTermRefPics.Buffer num_long_term_sps(@org.lwjgl.system.NativeType("uint8_t") byte r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.video.StdVideoEncodeH265LongTermRefPics.nnum_long_term_sps(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.video.StdVideoEncodeH265LongTermRefPics.Buffer num_long_term_pics(@org.lwjgl.system.NativeType("uint8_t") byte r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.video.StdVideoEncodeH265LongTermRefPics.nnum_long_term_pics(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.video.StdVideoEncodeH265LongTermRefPics.Buffer lt_idx_sps(@org.lwjgl.system.NativeType("uint8_t[STD_VIDEO_H265_MAX_LONG_TERM_REF_PICS_SPS]") java.nio.ByteBuffer r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.video.StdVideoEncodeH265LongTermRefPics.nlt_idx_sps(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.video.StdVideoEncodeH265LongTermRefPics.Buffer lt_idx_sps(int r6, @org.lwjgl.system.NativeType("uint8_t") byte r7) {
                r5 = this;
                r0 = r5
                long r0 = r0.address()
                r1 = r6
                r2 = r7
                org.lwjgl.vulkan.video.StdVideoEncodeH265LongTermRefPics.nlt_idx_sps(r0, r1, r2)
                r0 = r5
                return r0
        }

        public org.lwjgl.vulkan.video.StdVideoEncodeH265LongTermRefPics.Buffer poc_lsb_lt(@org.lwjgl.system.NativeType("uint8_t[STD_VIDEO_H265_MAX_LONG_TERM_PICS]") java.nio.ByteBuffer r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.video.StdVideoEncodeH265LongTermRefPics.npoc_lsb_lt(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.video.StdVideoEncodeH265LongTermRefPics.Buffer poc_lsb_lt(int r6, @org.lwjgl.system.NativeType("uint8_t") byte r7) {
                r5 = this;
                r0 = r5
                long r0 = r0.address()
                r1 = r6
                r2 = r7
                org.lwjgl.vulkan.video.StdVideoEncodeH265LongTermRefPics.npoc_lsb_lt(r0, r1, r2)
                r0 = r5
                return r0
        }

        public org.lwjgl.vulkan.video.StdVideoEncodeH265LongTermRefPics.Buffer used_by_curr_pic_lt_flag(@org.lwjgl.system.NativeType("uint16_t") short r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.video.StdVideoEncodeH265LongTermRefPics.nused_by_curr_pic_lt_flag(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.video.StdVideoEncodeH265LongTermRefPics.Buffer delta_poc_msb_present_flag(@org.lwjgl.system.NativeType("uint8_t[STD_VIDEO_H265_MAX_DELTA_POC]") java.nio.ByteBuffer r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.video.StdVideoEncodeH265LongTermRefPics.ndelta_poc_msb_present_flag(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.video.StdVideoEncodeH265LongTermRefPics.Buffer delta_poc_msb_present_flag(int r6, @org.lwjgl.system.NativeType("uint8_t") byte r7) {
                r5 = this;
                r0 = r5
                long r0 = r0.address()
                r1 = r6
                r2 = r7
                org.lwjgl.vulkan.video.StdVideoEncodeH265LongTermRefPics.ndelta_poc_msb_present_flag(r0, r1, r2)
                r0 = r5
                return r0
        }

        public org.lwjgl.vulkan.video.StdVideoEncodeH265LongTermRefPics.Buffer delta_poc_msb_cycle_lt(@org.lwjgl.system.NativeType("uint8_t[STD_VIDEO_H265_MAX_DELTA_POC]") java.nio.ByteBuffer r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.video.StdVideoEncodeH265LongTermRefPics.ndelta_poc_msb_cycle_lt(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.video.StdVideoEncodeH265LongTermRefPics.Buffer delta_poc_msb_cycle_lt(int r6, @org.lwjgl.system.NativeType("uint8_t") byte r7) {
                r5 = this;
                r0 = r5
                long r0 = r0.address()
                r1 = r6
                r2 = r7
                org.lwjgl.vulkan.video.StdVideoEncodeH265LongTermRefPics.ndelta_poc_msb_cycle_lt(r0, r1, r2)
                r0 = r5
                return r0
        }

        @Override // org.lwjgl.system.StructBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.Struct getElementFactory() {
                r2 = this;
                r0 = r2
                org.lwjgl.vulkan.video.StdVideoEncodeH265LongTermRefPics r0 = r0.getElementFactory()
                return r0
        }

        @Override // org.lwjgl.system.CustomBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.CustomBuffer self() {
                r2 = this;
                r0 = r2
                org.lwjgl.vulkan.video.StdVideoEncodeH265LongTermRefPics$Buffer r0 = r0.self()
                return r0
        }

        static {
                r0 = -1
                org.lwjgl.vulkan.video.StdVideoEncodeH265LongTermRefPics r0 = org.lwjgl.vulkan.video.StdVideoEncodeH265LongTermRefPics.create(r0)
                org.lwjgl.vulkan.video.StdVideoEncodeH265LongTermRefPics.Buffer.ELEMENT_FACTORY = r0
                return
        }
    }

    protected StdVideoEncodeH265LongTermRefPics(long r6, @javax.annotation.Nullable java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    protected org.lwjgl.vulkan.video.StdVideoEncodeH265LongTermRefPics create(long r7, @javax.annotation.Nullable java.nio.ByteBuffer r9) {
            r6 = this;
            org.lwjgl.vulkan.video.StdVideoEncodeH265LongTermRefPics r0 = new org.lwjgl.vulkan.video.StdVideoEncodeH265LongTermRefPics
            r1 = r0
            r2 = r7
            r3 = r9
            r1.<init>(r2, r3)
            return r0
    }

    public StdVideoEncodeH265LongTermRefPics(java.nio.ByteBuffer r7) {
            r6 = this;
            r0 = r6
            r1 = r7
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            r2 = r7
            int r3 = org.lwjgl.vulkan.video.StdVideoEncodeH265LongTermRefPics.SIZEOF
            java.nio.ByteBuffer r2 = __checkContainer(r2, r3)
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
            r2 = this;
            int r0 = org.lwjgl.vulkan.video.StdVideoEncodeH265LongTermRefPics.SIZEOF
            return r0
    }

    @org.lwjgl.system.NativeType("uint8_t")
    public byte num_long_term_sps() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            byte r0 = nnum_long_term_sps(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("uint8_t")
    public byte num_long_term_pics() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            byte r0 = nnum_long_term_pics(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("uint8_t[STD_VIDEO_H265_MAX_LONG_TERM_REF_PICS_SPS]")
    public java.nio.ByteBuffer lt_idx_sps() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            java.nio.ByteBuffer r0 = nlt_idx_sps(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("uint8_t")
    public byte lt_idx_sps(int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            byte r0 = nlt_idx_sps(r0, r1)
            return r0
    }

    @org.lwjgl.system.NativeType("uint8_t[STD_VIDEO_H265_MAX_LONG_TERM_PICS]")
    public java.nio.ByteBuffer poc_lsb_lt() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            java.nio.ByteBuffer r0 = npoc_lsb_lt(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("uint8_t")
    public byte poc_lsb_lt(int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            byte r0 = npoc_lsb_lt(r0, r1)
            return r0
    }

    @org.lwjgl.system.NativeType("uint16_t")
    public short used_by_curr_pic_lt_flag() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            short r0 = nused_by_curr_pic_lt_flag(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("uint8_t[STD_VIDEO_H265_MAX_DELTA_POC]")
    public java.nio.ByteBuffer delta_poc_msb_present_flag() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            java.nio.ByteBuffer r0 = ndelta_poc_msb_present_flag(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("uint8_t")
    public byte delta_poc_msb_present_flag(int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            byte r0 = ndelta_poc_msb_present_flag(r0, r1)
            return r0
    }

    @org.lwjgl.system.NativeType("uint8_t[STD_VIDEO_H265_MAX_DELTA_POC]")
    public java.nio.ByteBuffer delta_poc_msb_cycle_lt() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            java.nio.ByteBuffer r0 = ndelta_poc_msb_cycle_lt(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("uint8_t")
    public byte delta_poc_msb_cycle_lt(int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            byte r0 = ndelta_poc_msb_cycle_lt(r0, r1)
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoEncodeH265LongTermRefPics num_long_term_sps(@org.lwjgl.system.NativeType("uint8_t") byte r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nnum_long_term_sps(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoEncodeH265LongTermRefPics num_long_term_pics(@org.lwjgl.system.NativeType("uint8_t") byte r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nnum_long_term_pics(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoEncodeH265LongTermRefPics lt_idx_sps(@org.lwjgl.system.NativeType("uint8_t[STD_VIDEO_H265_MAX_LONG_TERM_REF_PICS_SPS]") java.nio.ByteBuffer r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nlt_idx_sps(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoEncodeH265LongTermRefPics lt_idx_sps(int r6, @org.lwjgl.system.NativeType("uint8_t") byte r7) {
            r5 = this;
            r0 = r5
            long r0 = r0.address()
            r1 = r6
            r2 = r7
            nlt_idx_sps(r0, r1, r2)
            r0 = r5
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoEncodeH265LongTermRefPics poc_lsb_lt(@org.lwjgl.system.NativeType("uint8_t[STD_VIDEO_H265_MAX_LONG_TERM_PICS]") java.nio.ByteBuffer r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            npoc_lsb_lt(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoEncodeH265LongTermRefPics poc_lsb_lt(int r6, @org.lwjgl.system.NativeType("uint8_t") byte r7) {
            r5 = this;
            r0 = r5
            long r0 = r0.address()
            r1 = r6
            r2 = r7
            npoc_lsb_lt(r0, r1, r2)
            r0 = r5
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoEncodeH265LongTermRefPics used_by_curr_pic_lt_flag(@org.lwjgl.system.NativeType("uint16_t") short r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nused_by_curr_pic_lt_flag(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoEncodeH265LongTermRefPics delta_poc_msb_present_flag(@org.lwjgl.system.NativeType("uint8_t[STD_VIDEO_H265_MAX_DELTA_POC]") java.nio.ByteBuffer r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            ndelta_poc_msb_present_flag(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoEncodeH265LongTermRefPics delta_poc_msb_present_flag(int r6, @org.lwjgl.system.NativeType("uint8_t") byte r7) {
            r5 = this;
            r0 = r5
            long r0 = r0.address()
            r1 = r6
            r2 = r7
            ndelta_poc_msb_present_flag(r0, r1, r2)
            r0 = r5
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoEncodeH265LongTermRefPics delta_poc_msb_cycle_lt(@org.lwjgl.system.NativeType("uint8_t[STD_VIDEO_H265_MAX_DELTA_POC]") java.nio.ByteBuffer r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            ndelta_poc_msb_cycle_lt(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoEncodeH265LongTermRefPics delta_poc_msb_cycle_lt(int r6, @org.lwjgl.system.NativeType("uint8_t") byte r7) {
            r5 = this;
            r0 = r5
            long r0 = r0.address()
            r1 = r6
            r2 = r7
            ndelta_poc_msb_cycle_lt(r0, r1, r2)
            r0 = r5
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoEncodeH265LongTermRefPics set(byte r4, byte r5, java.nio.ByteBuffer r6, java.nio.ByteBuffer r7, short r8, java.nio.ByteBuffer r9, java.nio.ByteBuffer r10) {
            r3 = this;
            r0 = r3
            r1 = r4
            org.lwjgl.vulkan.video.StdVideoEncodeH265LongTermRefPics r0 = r0.num_long_term_sps(r1)
            r0 = r3
            r1 = r5
            org.lwjgl.vulkan.video.StdVideoEncodeH265LongTermRefPics r0 = r0.num_long_term_pics(r1)
            r0 = r3
            r1 = r6
            org.lwjgl.vulkan.video.StdVideoEncodeH265LongTermRefPics r0 = r0.lt_idx_sps(r1)
            r0 = r3
            r1 = r7
            org.lwjgl.vulkan.video.StdVideoEncodeH265LongTermRefPics r0 = r0.poc_lsb_lt(r1)
            r0 = r3
            r1 = r8
            org.lwjgl.vulkan.video.StdVideoEncodeH265LongTermRefPics r0 = r0.used_by_curr_pic_lt_flag(r1)
            r0 = r3
            r1 = r9
            org.lwjgl.vulkan.video.StdVideoEncodeH265LongTermRefPics r0 = r0.delta_poc_msb_present_flag(r1)
            r0 = r3
            r1 = r10
            org.lwjgl.vulkan.video.StdVideoEncodeH265LongTermRefPics r0 = r0.delta_poc_msb_cycle_lt(r1)
            r0 = r3
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoEncodeH265LongTermRefPics set(org.lwjgl.vulkan.video.StdVideoEncodeH265LongTermRefPics r8) {
            r7 = this;
            r0 = r8
            long r0 = r0.address()
            r1 = r7
            long r1 = r1.address()
            int r2 = org.lwjgl.vulkan.video.StdVideoEncodeH265LongTermRefPics.SIZEOF
            long r2 = (long) r2
            org.lwjgl.system.MemoryUtil.memCopy(r0, r1, r2)
            r0 = r7
            return r0
    }

    public static org.lwjgl.vulkan.video.StdVideoEncodeH265LongTermRefPics malloc() {
            org.lwjgl.vulkan.video.StdVideoEncodeH265LongTermRefPics r0 = new org.lwjgl.vulkan.video.StdVideoEncodeH265LongTermRefPics
            r1 = r0
            int r2 = org.lwjgl.vulkan.video.StdVideoEncodeH265LongTermRefPics.SIZEOF
            long r2 = (long) r2
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.video.StdVideoEncodeH265LongTermRefPics calloc() {
            org.lwjgl.vulkan.video.StdVideoEncodeH265LongTermRefPics r0 = new org.lwjgl.vulkan.video.StdVideoEncodeH265LongTermRefPics
            r1 = r0
            r2 = 1
            int r3 = org.lwjgl.vulkan.video.StdVideoEncodeH265LongTermRefPics.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.video.StdVideoEncodeH265LongTermRefPics create() {
            int r0 = org.lwjgl.vulkan.video.StdVideoEncodeH265LongTermRefPics.SIZEOF
            java.nio.ByteBuffer r0 = org.lwjgl.BufferUtils.createByteBuffer(r0)
            r6 = r0
            org.lwjgl.vulkan.video.StdVideoEncodeH265LongTermRefPics r0 = new org.lwjgl.vulkan.video.StdVideoEncodeH265LongTermRefPics
            r1 = r0
            r2 = r6
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.video.StdVideoEncodeH265LongTermRefPics create(long r6) {
            org.lwjgl.vulkan.video.StdVideoEncodeH265LongTermRefPics r0 = new org.lwjgl.vulkan.video.StdVideoEncodeH265LongTermRefPics
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.vulkan.video.StdVideoEncodeH265LongTermRefPics createSafe(long r6) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.vulkan.video.StdVideoEncodeH265LongTermRefPics r0 = new org.lwjgl.vulkan.video.StdVideoEncodeH265LongTermRefPics
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static org.lwjgl.vulkan.video.StdVideoEncodeH265LongTermRefPics.Buffer malloc(int r6) {
            org.lwjgl.vulkan.video.StdVideoEncodeH265LongTermRefPics$Buffer r0 = new org.lwjgl.vulkan.video.StdVideoEncodeH265LongTermRefPics$Buffer
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.vulkan.video.StdVideoEncodeH265LongTermRefPics.SIZEOF
            long r2 = __checkMalloc(r2, r3)
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.video.StdVideoEncodeH265LongTermRefPics.Buffer calloc(int r7) {
            org.lwjgl.vulkan.video.StdVideoEncodeH265LongTermRefPics$Buffer r0 = new org.lwjgl.vulkan.video.StdVideoEncodeH265LongTermRefPics$Buffer
            r1 = r0
            r2 = r7
            long r2 = (long) r2
            int r3 = org.lwjgl.vulkan.video.StdVideoEncodeH265LongTermRefPics.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.video.StdVideoEncodeH265LongTermRefPics.Buffer create(int r10) {
            r0 = r10
            int r1 = org.lwjgl.vulkan.video.StdVideoEncodeH265LongTermRefPics.SIZEOF
            java.nio.ByteBuffer r0 = __create(r0, r1)
            r11 = r0
            org.lwjgl.vulkan.video.StdVideoEncodeH265LongTermRefPics$Buffer r0 = new org.lwjgl.vulkan.video.StdVideoEncodeH265LongTermRefPics$Buffer
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

    public static org.lwjgl.vulkan.video.StdVideoEncodeH265LongTermRefPics.Buffer create(long r6, int r8) {
            org.lwjgl.vulkan.video.StdVideoEncodeH265LongTermRefPics$Buffer r0 = new org.lwjgl.vulkan.video.StdVideoEncodeH265LongTermRefPics$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.vulkan.video.StdVideoEncodeH265LongTermRefPics.Buffer createSafe(long r6, int r8) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.vulkan.video.StdVideoEncodeH265LongTermRefPics$Buffer r0 = new org.lwjgl.vulkan.video.StdVideoEncodeH265LongTermRefPics$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static org.lwjgl.vulkan.video.StdVideoEncodeH265LongTermRefPics malloc(org.lwjgl.system.MemoryStack r6) {
            org.lwjgl.vulkan.video.StdVideoEncodeH265LongTermRefPics r0 = new org.lwjgl.vulkan.video.StdVideoEncodeH265LongTermRefPics
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.vulkan.video.StdVideoEncodeH265LongTermRefPics.ALIGNOF
            int r4 = org.lwjgl.vulkan.video.StdVideoEncodeH265LongTermRefPics.SIZEOF
            long r2 = r2.nmalloc(r3, r4)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.video.StdVideoEncodeH265LongTermRefPics calloc(org.lwjgl.system.MemoryStack r7) {
            org.lwjgl.vulkan.video.StdVideoEncodeH265LongTermRefPics r0 = new org.lwjgl.vulkan.video.StdVideoEncodeH265LongTermRefPics
            r1 = r0
            r2 = r7
            int r3 = org.lwjgl.vulkan.video.StdVideoEncodeH265LongTermRefPics.ALIGNOF
            r4 = 1
            int r5 = org.lwjgl.vulkan.video.StdVideoEncodeH265LongTermRefPics.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.video.StdVideoEncodeH265LongTermRefPics.Buffer malloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.vulkan.video.StdVideoEncodeH265LongTermRefPics$Buffer r0 = new org.lwjgl.vulkan.video.StdVideoEncodeH265LongTermRefPics$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.vulkan.video.StdVideoEncodeH265LongTermRefPics.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.vulkan.video.StdVideoEncodeH265LongTermRefPics.SIZEOF
            int r4 = r4 * r5
            long r2 = r2.nmalloc(r3, r4)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.video.StdVideoEncodeH265LongTermRefPics.Buffer calloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.vulkan.video.StdVideoEncodeH265LongTermRefPics$Buffer r0 = new org.lwjgl.vulkan.video.StdVideoEncodeH265LongTermRefPics$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.vulkan.video.StdVideoEncodeH265LongTermRefPics.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.vulkan.video.StdVideoEncodeH265LongTermRefPics.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static byte nnum_long_term_sps(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.video.StdVideoEncodeH265LongTermRefPics.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.video.StdVideoEncodeH265LongTermRefPics.NUM_LONG_TERM_SPS
            long r3 = (long) r3
            long r2 = r2 + r3
            byte r0 = r0.getByte(r1, r2)
            return r0
    }

    public static byte nnum_long_term_pics(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.video.StdVideoEncodeH265LongTermRefPics.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.video.StdVideoEncodeH265LongTermRefPics.NUM_LONG_TERM_PICS
            long r3 = (long) r3
            long r2 = r2 + r3
            byte r0 = r0.getByte(r1, r2)
            return r0
    }

    public static java.nio.ByteBuffer nlt_idx_sps(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.video.StdVideoEncodeH265LongTermRefPics.LT_IDX_SPS
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = 32
            java.nio.ByteBuffer r0 = org.lwjgl.system.MemoryUtil.memByteBuffer(r0, r1)
            return r0
    }

    public static byte nlt_idx_sps(long r9, int r11) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.video.StdVideoEncodeH265LongTermRefPics.UNSAFE
            r1 = 0
            r2 = r9
            int r3 = org.lwjgl.vulkan.video.StdVideoEncodeH265LongTermRefPics.LT_IDX_SPS
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r11
            r4 = 32
            long r3 = org.lwjgl.system.Checks.check(r3, r4)
            r4 = 1
            long r3 = r3 * r4
            long r2 = r2 + r3
            byte r0 = r0.getByte(r1, r2)
            return r0
    }

    public static java.nio.ByteBuffer npoc_lsb_lt(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.video.StdVideoEncodeH265LongTermRefPics.POC_LSB_LT
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = 16
            java.nio.ByteBuffer r0 = org.lwjgl.system.MemoryUtil.memByteBuffer(r0, r1)
            return r0
    }

    public static byte npoc_lsb_lt(long r9, int r11) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.video.StdVideoEncodeH265LongTermRefPics.UNSAFE
            r1 = 0
            r2 = r9
            int r3 = org.lwjgl.vulkan.video.StdVideoEncodeH265LongTermRefPics.POC_LSB_LT
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r11
            r4 = 16
            long r3 = org.lwjgl.system.Checks.check(r3, r4)
            r4 = 1
            long r3 = r3 * r4
            long r2 = r2 + r3
            byte r0 = r0.getByte(r1, r2)
            return r0
    }

    public static short nused_by_curr_pic_lt_flag(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.video.StdVideoEncodeH265LongTermRefPics.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.video.StdVideoEncodeH265LongTermRefPics.USED_BY_CURR_PIC_LT_FLAG
            long r3 = (long) r3
            long r2 = r2 + r3
            short r0 = r0.getShort(r1, r2)
            return r0
    }

    public static java.nio.ByteBuffer ndelta_poc_msb_present_flag(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.video.StdVideoEncodeH265LongTermRefPics.DELTA_POC_MSB_PRESENT_FLAG
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = 48
            java.nio.ByteBuffer r0 = org.lwjgl.system.MemoryUtil.memByteBuffer(r0, r1)
            return r0
    }

    public static byte ndelta_poc_msb_present_flag(long r9, int r11) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.video.StdVideoEncodeH265LongTermRefPics.UNSAFE
            r1 = 0
            r2 = r9
            int r3 = org.lwjgl.vulkan.video.StdVideoEncodeH265LongTermRefPics.DELTA_POC_MSB_PRESENT_FLAG
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r11
            r4 = 48
            long r3 = org.lwjgl.system.Checks.check(r3, r4)
            r4 = 1
            long r3 = r3 * r4
            long r2 = r2 + r3
            byte r0 = r0.getByte(r1, r2)
            return r0
    }

    public static java.nio.ByteBuffer ndelta_poc_msb_cycle_lt(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.video.StdVideoEncodeH265LongTermRefPics.DELTA_POC_MSB_CYCLE_LT
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = 48
            java.nio.ByteBuffer r0 = org.lwjgl.system.MemoryUtil.memByteBuffer(r0, r1)
            return r0
    }

    public static byte ndelta_poc_msb_cycle_lt(long r9, int r11) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.video.StdVideoEncodeH265LongTermRefPics.UNSAFE
            r1 = 0
            r2 = r9
            int r3 = org.lwjgl.vulkan.video.StdVideoEncodeH265LongTermRefPics.DELTA_POC_MSB_CYCLE_LT
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r11
            r4 = 48
            long r3 = org.lwjgl.system.Checks.check(r3, r4)
            r4 = 1
            long r3 = r3 * r4
            long r2 = r2 + r3
            byte r0 = r0.getByte(r1, r2)
            return r0
    }

    public static void nnum_long_term_sps(long r7, byte r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.video.StdVideoEncodeH265LongTermRefPics.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.video.StdVideoEncodeH265LongTermRefPics.NUM_LONG_TERM_SPS
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putByte(r1, r2, r3)
            return
    }

    public static void nnum_long_term_pics(long r7, byte r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.video.StdVideoEncodeH265LongTermRefPics.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.video.StdVideoEncodeH265LongTermRefPics.NUM_LONG_TERM_PICS
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putByte(r1, r2, r3)
            return
    }

    public static void nlt_idx_sps(long r7, java.nio.ByteBuffer r9) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lc
            r0 = r9
            r1 = 32
            org.lwjgl.system.Checks.checkGT(r0, r1)
        Lc:
            r0 = r9
            long r0 = org.lwjgl.system.MemoryUtil.memAddress(r0)
            r1 = r7
            int r2 = org.lwjgl.vulkan.video.StdVideoEncodeH265LongTermRefPics.LT_IDX_SPS
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

    public static void nlt_idx_sps(long r9, int r11, byte r12) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.video.StdVideoEncodeH265LongTermRefPics.UNSAFE
            r1 = 0
            r2 = r9
            int r3 = org.lwjgl.vulkan.video.StdVideoEncodeH265LongTermRefPics.LT_IDX_SPS
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r11
            r4 = 32
            long r3 = org.lwjgl.system.Checks.check(r3, r4)
            r4 = 1
            long r3 = r3 * r4
            long r2 = r2 + r3
            r3 = r12
            r0.putByte(r1, r2, r3)
            return
    }

    public static void npoc_lsb_lt(long r7, java.nio.ByteBuffer r9) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lc
            r0 = r9
            r1 = 16
            org.lwjgl.system.Checks.checkGT(r0, r1)
        Lc:
            r0 = r9
            long r0 = org.lwjgl.system.MemoryUtil.memAddress(r0)
            r1 = r7
            int r2 = org.lwjgl.vulkan.video.StdVideoEncodeH265LongTermRefPics.POC_LSB_LT
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

    public static void npoc_lsb_lt(long r9, int r11, byte r12) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.video.StdVideoEncodeH265LongTermRefPics.UNSAFE
            r1 = 0
            r2 = r9
            int r3 = org.lwjgl.vulkan.video.StdVideoEncodeH265LongTermRefPics.POC_LSB_LT
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r11
            r4 = 16
            long r3 = org.lwjgl.system.Checks.check(r3, r4)
            r4 = 1
            long r3 = r3 * r4
            long r2 = r2 + r3
            r3 = r12
            r0.putByte(r1, r2, r3)
            return
    }

    public static void nused_by_curr_pic_lt_flag(long r7, short r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.video.StdVideoEncodeH265LongTermRefPics.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.video.StdVideoEncodeH265LongTermRefPics.USED_BY_CURR_PIC_LT_FLAG
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putShort(r1, r2, r3)
            return
    }

    public static void ndelta_poc_msb_present_flag(long r7, java.nio.ByteBuffer r9) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lc
            r0 = r9
            r1 = 48
            org.lwjgl.system.Checks.checkGT(r0, r1)
        Lc:
            r0 = r9
            long r0 = org.lwjgl.system.MemoryUtil.memAddress(r0)
            r1 = r7
            int r2 = org.lwjgl.vulkan.video.StdVideoEncodeH265LongTermRefPics.DELTA_POC_MSB_PRESENT_FLAG
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

    public static void ndelta_poc_msb_present_flag(long r9, int r11, byte r12) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.video.StdVideoEncodeH265LongTermRefPics.UNSAFE
            r1 = 0
            r2 = r9
            int r3 = org.lwjgl.vulkan.video.StdVideoEncodeH265LongTermRefPics.DELTA_POC_MSB_PRESENT_FLAG
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r11
            r4 = 48
            long r3 = org.lwjgl.system.Checks.check(r3, r4)
            r4 = 1
            long r3 = r3 * r4
            long r2 = r2 + r3
            r3 = r12
            r0.putByte(r1, r2, r3)
            return
    }

    public static void ndelta_poc_msb_cycle_lt(long r7, java.nio.ByteBuffer r9) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lc
            r0 = r9
            r1 = 48
            org.lwjgl.system.Checks.checkGT(r0, r1)
        Lc:
            r0 = r9
            long r0 = org.lwjgl.system.MemoryUtil.memAddress(r0)
            r1 = r7
            int r2 = org.lwjgl.vulkan.video.StdVideoEncodeH265LongTermRefPics.DELTA_POC_MSB_CYCLE_LT
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

    public static void ndelta_poc_msb_cycle_lt(long r9, int r11, byte r12) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.video.StdVideoEncodeH265LongTermRefPics.UNSAFE
            r1 = 0
            r2 = r9
            int r3 = org.lwjgl.vulkan.video.StdVideoEncodeH265LongTermRefPics.DELTA_POC_MSB_CYCLE_LT
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r11
            r4 = 48
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
            org.lwjgl.vulkan.video.StdVideoEncodeH265LongTermRefPics r0 = r0.create(r1, r2)
            return r0
    }

    static {
            r0 = 7
            org.lwjgl.system.Struct$Member[] r0 = new org.lwjgl.system.Struct.Member[r0]
            r1 = r0
            r2 = 0
            r3 = 1
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 1
            r3 = 1
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 2
            r3 = 1
            r4 = 32
            org.lwjgl.system.Struct$Member r3 = __array(r3, r4)
            r1[r2] = r3
            r1 = r0
            r2 = 3
            r3 = 1
            r4 = 16
            org.lwjgl.system.Struct$Member r3 = __array(r3, r4)
            r1[r2] = r3
            r1 = r0
            r2 = 4
            r3 = 2
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 5
            r3 = 1
            r4 = 48
            org.lwjgl.system.Struct$Member r3 = __array(r3, r4)
            r1[r2] = r3
            r1 = r0
            r2 = 6
            r3 = 1
            r4 = 48
            org.lwjgl.system.Struct$Member r3 = __array(r3, r4)
            r1[r2] = r3
            org.lwjgl.system.Struct$Layout r0 = __struct(r0)
            r6 = r0
            r0 = r6
            int r0 = r0.getSize()
            org.lwjgl.vulkan.video.StdVideoEncodeH265LongTermRefPics.SIZEOF = r0
            r0 = r6
            int r0 = r0.getAlignment()
            org.lwjgl.vulkan.video.StdVideoEncodeH265LongTermRefPics.ALIGNOF = r0
            r0 = r6
            r1 = 0
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.video.StdVideoEncodeH265LongTermRefPics.NUM_LONG_TERM_SPS = r0
            r0 = r6
            r1 = 1
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.video.StdVideoEncodeH265LongTermRefPics.NUM_LONG_TERM_PICS = r0
            r0 = r6
            r1 = 2
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.video.StdVideoEncodeH265LongTermRefPics.LT_IDX_SPS = r0
            r0 = r6
            r1 = 3
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.video.StdVideoEncodeH265LongTermRefPics.POC_LSB_LT = r0
            r0 = r6
            r1 = 4
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.video.StdVideoEncodeH265LongTermRefPics.USED_BY_CURR_PIC_LT_FLAG = r0
            r0 = r6
            r1 = 5
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.video.StdVideoEncodeH265LongTermRefPics.DELTA_POC_MSB_PRESENT_FLAG = r0
            r0 = r6
            r1 = 6
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.video.StdVideoEncodeH265LongTermRefPics.DELTA_POC_MSB_CYCLE_LT = r0
            return
    }
}
