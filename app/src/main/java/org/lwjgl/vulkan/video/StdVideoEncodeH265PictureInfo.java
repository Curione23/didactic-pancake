package org.lwjgl.vulkan.video;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/video/StdVideoEncodeH265PictureInfo.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/video/StdVideoEncodeH265PictureInfo.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/video/StdVideoEncodeH265PictureInfo.class */
public class StdVideoEncodeH265PictureInfo extends org.lwjgl.system.Struct<org.lwjgl.vulkan.video.StdVideoEncodeH265PictureInfo> implements org.lwjgl.system.NativeResource {
    public static final int SIZEOF = 0;
    public static final int ALIGNOF = 0;
    public static final int FLAGS = 0;
    public static final int PIC_TYPE = 0;
    public static final int SPS_VIDEO_PARAMETER_SET_ID = 0;
    public static final int PPS_SEQ_PARAMETER_SET_ID = 0;
    public static final int PPS_PIC_PARAMETER_SET_ID = 0;
    public static final int SHORT_TERM_REF_PIC_SET_IDX = 0;
    public static final int PICORDERCNTVAL = 0;
    public static final int TEMPORALID = 0;
    public static final int RESERVED1 = 0;
    public static final int PREFLISTS = 0;
    public static final int PSHORTTERMREFPICSET = 0;
    public static final int PLONGTERMREFPICS = 0;

    /* JADX WARN: Classes with same name are omitted, all sources:
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/video/StdVideoEncodeH265PictureInfo$Buffer.class
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/video/StdVideoEncodeH265PictureInfo$Buffer.class
     */
    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/video/StdVideoEncodeH265PictureInfo$Buffer.class */
    public static class Buffer extends org.lwjgl.system.StructBuffer<org.lwjgl.vulkan.video.StdVideoEncodeH265PictureInfo, org.lwjgl.vulkan.video.StdVideoEncodeH265PictureInfo.Buffer> implements org.lwjgl.system.NativeResource {
        private static final org.lwjgl.vulkan.video.StdVideoEncodeH265PictureInfo ELEMENT_FACTORY = null;

        public Buffer(java.nio.ByteBuffer r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r6
                int r2 = r2.remaining()
                int r3 = org.lwjgl.vulkan.video.StdVideoEncodeH265PictureInfo.SIZEOF
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
        protected org.lwjgl.vulkan.video.StdVideoEncodeH265PictureInfo.Buffer self() {
                r2 = this;
                r0 = r2
                return r0
        }

        @Override // org.lwjgl.system.StructBuffer
        protected org.lwjgl.vulkan.video.StdVideoEncodeH265PictureInfo getElementFactory() {
                r2 = this;
                org.lwjgl.vulkan.video.StdVideoEncodeH265PictureInfo r0 = org.lwjgl.vulkan.video.StdVideoEncodeH265PictureInfo.Buffer.ELEMENT_FACTORY
                return r0
        }

        public org.lwjgl.vulkan.video.StdVideoEncodeH265PictureInfoFlags flags() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                org.lwjgl.vulkan.video.StdVideoEncodeH265PictureInfoFlags r0 = org.lwjgl.vulkan.video.StdVideoEncodeH265PictureInfo.nflags(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("StdVideoH265PictureType")
        public int pic_type() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.video.StdVideoEncodeH265PictureInfo.npic_type(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint8_t")
        public byte sps_video_parameter_set_id() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                byte r0 = org.lwjgl.vulkan.video.StdVideoEncodeH265PictureInfo.nsps_video_parameter_set_id(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint8_t")
        public byte pps_seq_parameter_set_id() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                byte r0 = org.lwjgl.vulkan.video.StdVideoEncodeH265PictureInfo.npps_seq_parameter_set_id(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint8_t")
        public byte pps_pic_parameter_set_id() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                byte r0 = org.lwjgl.vulkan.video.StdVideoEncodeH265PictureInfo.npps_pic_parameter_set_id(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint8_t")
        public byte short_term_ref_pic_set_idx() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                byte r0 = org.lwjgl.vulkan.video.StdVideoEncodeH265PictureInfo.nshort_term_ref_pic_set_idx(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("int32_t")
        public int PicOrderCntVal() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.video.StdVideoEncodeH265PictureInfo.nPicOrderCntVal(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint8_t")
        public byte TemporalId() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                byte r0 = org.lwjgl.vulkan.video.StdVideoEncodeH265PictureInfo.nTemporalId(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("StdVideoEncodeH265ReferenceModifications const *")
        public org.lwjgl.vulkan.video.StdVideoEncodeH265ReferenceModifications pRefLists() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                org.lwjgl.vulkan.video.StdVideoEncodeH265ReferenceModifications r0 = org.lwjgl.vulkan.video.StdVideoEncodeH265PictureInfo.npRefLists(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("StdVideoH265ShortTermRefPicSet const *")
        public org.lwjgl.vulkan.video.StdVideoH265ShortTermRefPicSet pShortTermRefPicSet() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                org.lwjgl.vulkan.video.StdVideoH265ShortTermRefPicSet r0 = org.lwjgl.vulkan.video.StdVideoEncodeH265PictureInfo.npShortTermRefPicSet(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("StdVideoEncodeH265LongTermRefPics const *")
        public org.lwjgl.vulkan.video.StdVideoEncodeH265LongTermRefPics pLongTermRefPics() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                org.lwjgl.vulkan.video.StdVideoEncodeH265LongTermRefPics r0 = org.lwjgl.vulkan.video.StdVideoEncodeH265PictureInfo.npLongTermRefPics(r0)
                return r0
        }

        public org.lwjgl.vulkan.video.StdVideoEncodeH265PictureInfo.Buffer flags(org.lwjgl.vulkan.video.StdVideoEncodeH265PictureInfoFlags r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.video.StdVideoEncodeH265PictureInfo.nflags(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.video.StdVideoEncodeH265PictureInfo.Buffer flags(java.util.function.Consumer<org.lwjgl.vulkan.video.StdVideoEncodeH265PictureInfoFlags> r4) {
                r3 = this;
                r0 = r4
                r1 = r3
                org.lwjgl.vulkan.video.StdVideoEncodeH265PictureInfoFlags r1 = r1.flags()
                r0.accept(r1)
                r0 = r3
                return r0
        }

        public org.lwjgl.vulkan.video.StdVideoEncodeH265PictureInfo.Buffer pic_type(@org.lwjgl.system.NativeType("StdVideoH265PictureType") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.video.StdVideoEncodeH265PictureInfo.npic_type(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.video.StdVideoEncodeH265PictureInfo.Buffer sps_video_parameter_set_id(@org.lwjgl.system.NativeType("uint8_t") byte r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.video.StdVideoEncodeH265PictureInfo.nsps_video_parameter_set_id(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.video.StdVideoEncodeH265PictureInfo.Buffer pps_seq_parameter_set_id(@org.lwjgl.system.NativeType("uint8_t") byte r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.video.StdVideoEncodeH265PictureInfo.npps_seq_parameter_set_id(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.video.StdVideoEncodeH265PictureInfo.Buffer pps_pic_parameter_set_id(@org.lwjgl.system.NativeType("uint8_t") byte r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.video.StdVideoEncodeH265PictureInfo.npps_pic_parameter_set_id(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.video.StdVideoEncodeH265PictureInfo.Buffer short_term_ref_pic_set_idx(@org.lwjgl.system.NativeType("uint8_t") byte r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.video.StdVideoEncodeH265PictureInfo.nshort_term_ref_pic_set_idx(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.video.StdVideoEncodeH265PictureInfo.Buffer PicOrderCntVal(@org.lwjgl.system.NativeType("int32_t") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.video.StdVideoEncodeH265PictureInfo.nPicOrderCntVal(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.video.StdVideoEncodeH265PictureInfo.Buffer TemporalId(@org.lwjgl.system.NativeType("uint8_t") byte r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.video.StdVideoEncodeH265PictureInfo.nTemporalId(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.video.StdVideoEncodeH265PictureInfo.Buffer pRefLists(@org.lwjgl.system.NativeType("StdVideoEncodeH265ReferenceModifications const *") org.lwjgl.vulkan.video.StdVideoEncodeH265ReferenceModifications r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.video.StdVideoEncodeH265PictureInfo.npRefLists(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.video.StdVideoEncodeH265PictureInfo.Buffer pShortTermRefPicSet(@org.lwjgl.system.NativeType("StdVideoH265ShortTermRefPicSet const *") org.lwjgl.vulkan.video.StdVideoH265ShortTermRefPicSet r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.video.StdVideoEncodeH265PictureInfo.npShortTermRefPicSet(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.video.StdVideoEncodeH265PictureInfo.Buffer pLongTermRefPics(@org.lwjgl.system.NativeType("StdVideoEncodeH265LongTermRefPics const *") org.lwjgl.vulkan.video.StdVideoEncodeH265LongTermRefPics r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.video.StdVideoEncodeH265PictureInfo.npLongTermRefPics(r0, r1)
                r0 = r4
                return r0
        }

        @Override // org.lwjgl.system.StructBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.Struct getElementFactory() {
                r2 = this;
                r0 = r2
                org.lwjgl.vulkan.video.StdVideoEncodeH265PictureInfo r0 = r0.getElementFactory()
                return r0
        }

        @Override // org.lwjgl.system.CustomBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.CustomBuffer self() {
                r2 = this;
                r0 = r2
                org.lwjgl.vulkan.video.StdVideoEncodeH265PictureInfo$Buffer r0 = r0.self()
                return r0
        }

        static {
                r0 = -1
                org.lwjgl.vulkan.video.StdVideoEncodeH265PictureInfo r0 = org.lwjgl.vulkan.video.StdVideoEncodeH265PictureInfo.create(r0)
                org.lwjgl.vulkan.video.StdVideoEncodeH265PictureInfo.Buffer.ELEMENT_FACTORY = r0
                return
        }
    }

    protected StdVideoEncodeH265PictureInfo(long r6, @javax.annotation.Nullable java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    protected org.lwjgl.vulkan.video.StdVideoEncodeH265PictureInfo create(long r7, @javax.annotation.Nullable java.nio.ByteBuffer r9) {
            r6 = this;
            org.lwjgl.vulkan.video.StdVideoEncodeH265PictureInfo r0 = new org.lwjgl.vulkan.video.StdVideoEncodeH265PictureInfo
            r1 = r0
            r2 = r7
            r3 = r9
            r1.<init>(r2, r3)
            return r0
    }

    public StdVideoEncodeH265PictureInfo(java.nio.ByteBuffer r7) {
            r6 = this;
            r0 = r6
            r1 = r7
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            r2 = r7
            int r3 = org.lwjgl.vulkan.video.StdVideoEncodeH265PictureInfo.SIZEOF
            java.nio.ByteBuffer r2 = __checkContainer(r2, r3)
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
            r2 = this;
            int r0 = org.lwjgl.vulkan.video.StdVideoEncodeH265PictureInfo.SIZEOF
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoEncodeH265PictureInfoFlags flags() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            org.lwjgl.vulkan.video.StdVideoEncodeH265PictureInfoFlags r0 = nflags(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("StdVideoH265PictureType")
    public int pic_type() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = npic_type(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("uint8_t")
    public byte sps_video_parameter_set_id() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            byte r0 = nsps_video_parameter_set_id(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("uint8_t")
    public byte pps_seq_parameter_set_id() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            byte r0 = npps_seq_parameter_set_id(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("uint8_t")
    public byte pps_pic_parameter_set_id() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            byte r0 = npps_pic_parameter_set_id(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("uint8_t")
    public byte short_term_ref_pic_set_idx() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            byte r0 = nshort_term_ref_pic_set_idx(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("int32_t")
    public int PicOrderCntVal() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nPicOrderCntVal(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("uint8_t")
    public byte TemporalId() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            byte r0 = nTemporalId(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("StdVideoEncodeH265ReferenceModifications const *")
    public org.lwjgl.vulkan.video.StdVideoEncodeH265ReferenceModifications pRefLists() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            org.lwjgl.vulkan.video.StdVideoEncodeH265ReferenceModifications r0 = npRefLists(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("StdVideoH265ShortTermRefPicSet const *")
    public org.lwjgl.vulkan.video.StdVideoH265ShortTermRefPicSet pShortTermRefPicSet() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            org.lwjgl.vulkan.video.StdVideoH265ShortTermRefPicSet r0 = npShortTermRefPicSet(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("StdVideoEncodeH265LongTermRefPics const *")
    public org.lwjgl.vulkan.video.StdVideoEncodeH265LongTermRefPics pLongTermRefPics() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            org.lwjgl.vulkan.video.StdVideoEncodeH265LongTermRefPics r0 = npLongTermRefPics(r0)
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoEncodeH265PictureInfo flags(org.lwjgl.vulkan.video.StdVideoEncodeH265PictureInfoFlags r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nflags(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoEncodeH265PictureInfo flags(java.util.function.Consumer<org.lwjgl.vulkan.video.StdVideoEncodeH265PictureInfoFlags> r4) {
            r3 = this;
            r0 = r4
            r1 = r3
            org.lwjgl.vulkan.video.StdVideoEncodeH265PictureInfoFlags r1 = r1.flags()
            r0.accept(r1)
            r0 = r3
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoEncodeH265PictureInfo pic_type(@org.lwjgl.system.NativeType("StdVideoH265PictureType") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            npic_type(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoEncodeH265PictureInfo sps_video_parameter_set_id(@org.lwjgl.system.NativeType("uint8_t") byte r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nsps_video_parameter_set_id(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoEncodeH265PictureInfo pps_seq_parameter_set_id(@org.lwjgl.system.NativeType("uint8_t") byte r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            npps_seq_parameter_set_id(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoEncodeH265PictureInfo pps_pic_parameter_set_id(@org.lwjgl.system.NativeType("uint8_t") byte r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            npps_pic_parameter_set_id(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoEncodeH265PictureInfo short_term_ref_pic_set_idx(@org.lwjgl.system.NativeType("uint8_t") byte r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nshort_term_ref_pic_set_idx(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoEncodeH265PictureInfo PicOrderCntVal(@org.lwjgl.system.NativeType("int32_t") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nPicOrderCntVal(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoEncodeH265PictureInfo TemporalId(@org.lwjgl.system.NativeType("uint8_t") byte r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nTemporalId(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoEncodeH265PictureInfo pRefLists(@org.lwjgl.system.NativeType("StdVideoEncodeH265ReferenceModifications const *") org.lwjgl.vulkan.video.StdVideoEncodeH265ReferenceModifications r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            npRefLists(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoEncodeH265PictureInfo pShortTermRefPicSet(@org.lwjgl.system.NativeType("StdVideoH265ShortTermRefPicSet const *") org.lwjgl.vulkan.video.StdVideoH265ShortTermRefPicSet r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            npShortTermRefPicSet(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoEncodeH265PictureInfo pLongTermRefPics(@org.lwjgl.system.NativeType("StdVideoEncodeH265LongTermRefPics const *") org.lwjgl.vulkan.video.StdVideoEncodeH265LongTermRefPics r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            npLongTermRefPics(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoEncodeH265PictureInfo set(org.lwjgl.vulkan.video.StdVideoEncodeH265PictureInfoFlags r4, int r5, byte r6, byte r7, byte r8, byte r9, int r10, byte r11, org.lwjgl.vulkan.video.StdVideoEncodeH265ReferenceModifications r12, org.lwjgl.vulkan.video.StdVideoH265ShortTermRefPicSet r13, org.lwjgl.vulkan.video.StdVideoEncodeH265LongTermRefPics r14) {
            r3 = this;
            r0 = r3
            r1 = r4
            org.lwjgl.vulkan.video.StdVideoEncodeH265PictureInfo r0 = r0.flags(r1)
            r0 = r3
            r1 = r5
            org.lwjgl.vulkan.video.StdVideoEncodeH265PictureInfo r0 = r0.pic_type(r1)
            r0 = r3
            r1 = r6
            org.lwjgl.vulkan.video.StdVideoEncodeH265PictureInfo r0 = r0.sps_video_parameter_set_id(r1)
            r0 = r3
            r1 = r7
            org.lwjgl.vulkan.video.StdVideoEncodeH265PictureInfo r0 = r0.pps_seq_parameter_set_id(r1)
            r0 = r3
            r1 = r8
            org.lwjgl.vulkan.video.StdVideoEncodeH265PictureInfo r0 = r0.pps_pic_parameter_set_id(r1)
            r0 = r3
            r1 = r9
            org.lwjgl.vulkan.video.StdVideoEncodeH265PictureInfo r0 = r0.short_term_ref_pic_set_idx(r1)
            r0 = r3
            r1 = r10
            org.lwjgl.vulkan.video.StdVideoEncodeH265PictureInfo r0 = r0.PicOrderCntVal(r1)
            r0 = r3
            r1 = r11
            org.lwjgl.vulkan.video.StdVideoEncodeH265PictureInfo r0 = r0.TemporalId(r1)
            r0 = r3
            r1 = r12
            org.lwjgl.vulkan.video.StdVideoEncodeH265PictureInfo r0 = r0.pRefLists(r1)
            r0 = r3
            r1 = r13
            org.lwjgl.vulkan.video.StdVideoEncodeH265PictureInfo r0 = r0.pShortTermRefPicSet(r1)
            r0 = r3
            r1 = r14
            org.lwjgl.vulkan.video.StdVideoEncodeH265PictureInfo r0 = r0.pLongTermRefPics(r1)
            r0 = r3
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoEncodeH265PictureInfo set(org.lwjgl.vulkan.video.StdVideoEncodeH265PictureInfo r8) {
            r7 = this;
            r0 = r8
            long r0 = r0.address()
            r1 = r7
            long r1 = r1.address()
            int r2 = org.lwjgl.vulkan.video.StdVideoEncodeH265PictureInfo.SIZEOF
            long r2 = (long) r2
            org.lwjgl.system.MemoryUtil.memCopy(r0, r1, r2)
            r0 = r7
            return r0
    }

    public static org.lwjgl.vulkan.video.StdVideoEncodeH265PictureInfo malloc() {
            org.lwjgl.vulkan.video.StdVideoEncodeH265PictureInfo r0 = new org.lwjgl.vulkan.video.StdVideoEncodeH265PictureInfo
            r1 = r0
            int r2 = org.lwjgl.vulkan.video.StdVideoEncodeH265PictureInfo.SIZEOF
            long r2 = (long) r2
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.video.StdVideoEncodeH265PictureInfo calloc() {
            org.lwjgl.vulkan.video.StdVideoEncodeH265PictureInfo r0 = new org.lwjgl.vulkan.video.StdVideoEncodeH265PictureInfo
            r1 = r0
            r2 = 1
            int r3 = org.lwjgl.vulkan.video.StdVideoEncodeH265PictureInfo.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.video.StdVideoEncodeH265PictureInfo create() {
            int r0 = org.lwjgl.vulkan.video.StdVideoEncodeH265PictureInfo.SIZEOF
            java.nio.ByteBuffer r0 = org.lwjgl.BufferUtils.createByteBuffer(r0)
            r6 = r0
            org.lwjgl.vulkan.video.StdVideoEncodeH265PictureInfo r0 = new org.lwjgl.vulkan.video.StdVideoEncodeH265PictureInfo
            r1 = r0
            r2 = r6
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.video.StdVideoEncodeH265PictureInfo create(long r6) {
            org.lwjgl.vulkan.video.StdVideoEncodeH265PictureInfo r0 = new org.lwjgl.vulkan.video.StdVideoEncodeH265PictureInfo
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.vulkan.video.StdVideoEncodeH265PictureInfo createSafe(long r6) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.vulkan.video.StdVideoEncodeH265PictureInfo r0 = new org.lwjgl.vulkan.video.StdVideoEncodeH265PictureInfo
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static org.lwjgl.vulkan.video.StdVideoEncodeH265PictureInfo.Buffer malloc(int r6) {
            org.lwjgl.vulkan.video.StdVideoEncodeH265PictureInfo$Buffer r0 = new org.lwjgl.vulkan.video.StdVideoEncodeH265PictureInfo$Buffer
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.vulkan.video.StdVideoEncodeH265PictureInfo.SIZEOF
            long r2 = __checkMalloc(r2, r3)
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.video.StdVideoEncodeH265PictureInfo.Buffer calloc(int r7) {
            org.lwjgl.vulkan.video.StdVideoEncodeH265PictureInfo$Buffer r0 = new org.lwjgl.vulkan.video.StdVideoEncodeH265PictureInfo$Buffer
            r1 = r0
            r2 = r7
            long r2 = (long) r2
            int r3 = org.lwjgl.vulkan.video.StdVideoEncodeH265PictureInfo.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.video.StdVideoEncodeH265PictureInfo.Buffer create(int r10) {
            r0 = r10
            int r1 = org.lwjgl.vulkan.video.StdVideoEncodeH265PictureInfo.SIZEOF
            java.nio.ByteBuffer r0 = __create(r0, r1)
            r11 = r0
            org.lwjgl.vulkan.video.StdVideoEncodeH265PictureInfo$Buffer r0 = new org.lwjgl.vulkan.video.StdVideoEncodeH265PictureInfo$Buffer
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

    public static org.lwjgl.vulkan.video.StdVideoEncodeH265PictureInfo.Buffer create(long r6, int r8) {
            org.lwjgl.vulkan.video.StdVideoEncodeH265PictureInfo$Buffer r0 = new org.lwjgl.vulkan.video.StdVideoEncodeH265PictureInfo$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.vulkan.video.StdVideoEncodeH265PictureInfo.Buffer createSafe(long r6, int r8) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.vulkan.video.StdVideoEncodeH265PictureInfo$Buffer r0 = new org.lwjgl.vulkan.video.StdVideoEncodeH265PictureInfo$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static org.lwjgl.vulkan.video.StdVideoEncodeH265PictureInfo malloc(org.lwjgl.system.MemoryStack r6) {
            org.lwjgl.vulkan.video.StdVideoEncodeH265PictureInfo r0 = new org.lwjgl.vulkan.video.StdVideoEncodeH265PictureInfo
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.vulkan.video.StdVideoEncodeH265PictureInfo.ALIGNOF
            int r4 = org.lwjgl.vulkan.video.StdVideoEncodeH265PictureInfo.SIZEOF
            long r2 = r2.nmalloc(r3, r4)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.video.StdVideoEncodeH265PictureInfo calloc(org.lwjgl.system.MemoryStack r7) {
            org.lwjgl.vulkan.video.StdVideoEncodeH265PictureInfo r0 = new org.lwjgl.vulkan.video.StdVideoEncodeH265PictureInfo
            r1 = r0
            r2 = r7
            int r3 = org.lwjgl.vulkan.video.StdVideoEncodeH265PictureInfo.ALIGNOF
            r4 = 1
            int r5 = org.lwjgl.vulkan.video.StdVideoEncodeH265PictureInfo.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.video.StdVideoEncodeH265PictureInfo.Buffer malloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.vulkan.video.StdVideoEncodeH265PictureInfo$Buffer r0 = new org.lwjgl.vulkan.video.StdVideoEncodeH265PictureInfo$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.vulkan.video.StdVideoEncodeH265PictureInfo.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.vulkan.video.StdVideoEncodeH265PictureInfo.SIZEOF
            int r4 = r4 * r5
            long r2 = r2.nmalloc(r3, r4)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.video.StdVideoEncodeH265PictureInfo.Buffer calloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.vulkan.video.StdVideoEncodeH265PictureInfo$Buffer r0 = new org.lwjgl.vulkan.video.StdVideoEncodeH265PictureInfo$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.vulkan.video.StdVideoEncodeH265PictureInfo.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.vulkan.video.StdVideoEncodeH265PictureInfo.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.video.StdVideoEncodeH265PictureInfoFlags nflags(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.video.StdVideoEncodeH265PictureInfo.FLAGS
            long r1 = (long) r1
            long r0 = r0 + r1
            org.lwjgl.vulkan.video.StdVideoEncodeH265PictureInfoFlags r0 = org.lwjgl.vulkan.video.StdVideoEncodeH265PictureInfoFlags.create(r0)
            return r0
    }

    public static int npic_type(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.video.StdVideoEncodeH265PictureInfo.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.video.StdVideoEncodeH265PictureInfo.PIC_TYPE
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static byte nsps_video_parameter_set_id(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.video.StdVideoEncodeH265PictureInfo.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.video.StdVideoEncodeH265PictureInfo.SPS_VIDEO_PARAMETER_SET_ID
            long r3 = (long) r3
            long r2 = r2 + r3
            byte r0 = r0.getByte(r1, r2)
            return r0
    }

    public static byte npps_seq_parameter_set_id(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.video.StdVideoEncodeH265PictureInfo.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.video.StdVideoEncodeH265PictureInfo.PPS_SEQ_PARAMETER_SET_ID
            long r3 = (long) r3
            long r2 = r2 + r3
            byte r0 = r0.getByte(r1, r2)
            return r0
    }

    public static byte npps_pic_parameter_set_id(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.video.StdVideoEncodeH265PictureInfo.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.video.StdVideoEncodeH265PictureInfo.PPS_PIC_PARAMETER_SET_ID
            long r3 = (long) r3
            long r2 = r2 + r3
            byte r0 = r0.getByte(r1, r2)
            return r0
    }

    public static byte nshort_term_ref_pic_set_idx(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.video.StdVideoEncodeH265PictureInfo.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.video.StdVideoEncodeH265PictureInfo.SHORT_TERM_REF_PIC_SET_IDX
            long r3 = (long) r3
            long r2 = r2 + r3
            byte r0 = r0.getByte(r1, r2)
            return r0
    }

    public static int nPicOrderCntVal(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.video.StdVideoEncodeH265PictureInfo.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.video.StdVideoEncodeH265PictureInfo.PICORDERCNTVAL
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static byte nTemporalId(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.video.StdVideoEncodeH265PictureInfo.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.video.StdVideoEncodeH265PictureInfo.TEMPORALID
            long r3 = (long) r3
            long r2 = r2 + r3
            byte r0 = r0.getByte(r1, r2)
            return r0
    }

    public static java.nio.ByteBuffer nreserved1(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.video.StdVideoEncodeH265PictureInfo.RESERVED1
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = 7
            java.nio.ByteBuffer r0 = org.lwjgl.system.MemoryUtil.memByteBuffer(r0, r1)
            return r0
    }

    public static byte nreserved1(long r9, int r11) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.video.StdVideoEncodeH265PictureInfo.UNSAFE
            r1 = 0
            r2 = r9
            int r3 = org.lwjgl.vulkan.video.StdVideoEncodeH265PictureInfo.RESERVED1
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

    public static org.lwjgl.vulkan.video.StdVideoEncodeH265ReferenceModifications npRefLists(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.video.StdVideoEncodeH265PictureInfo.PREFLISTS
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            org.lwjgl.vulkan.video.StdVideoEncodeH265ReferenceModifications r0 = org.lwjgl.vulkan.video.StdVideoEncodeH265ReferenceModifications.create(r0)
            return r0
    }

    public static org.lwjgl.vulkan.video.StdVideoH265ShortTermRefPicSet npShortTermRefPicSet(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.video.StdVideoEncodeH265PictureInfo.PSHORTTERMREFPICSET
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            org.lwjgl.vulkan.video.StdVideoH265ShortTermRefPicSet r0 = org.lwjgl.vulkan.video.StdVideoH265ShortTermRefPicSet.create(r0)
            return r0
    }

    public static org.lwjgl.vulkan.video.StdVideoEncodeH265LongTermRefPics npLongTermRefPics(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.video.StdVideoEncodeH265PictureInfo.PLONGTERMREFPICS
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            org.lwjgl.vulkan.video.StdVideoEncodeH265LongTermRefPics r0 = org.lwjgl.vulkan.video.StdVideoEncodeH265LongTermRefPics.create(r0)
            return r0
    }

    public static void nflags(long r7, org.lwjgl.vulkan.video.StdVideoEncodeH265PictureInfoFlags r9) {
            r0 = r9
            long r0 = r0.address()
            r1 = r7
            int r2 = org.lwjgl.vulkan.video.StdVideoEncodeH265PictureInfo.FLAGS
            long r2 = (long) r2
            long r1 = r1 + r2
            int r2 = org.lwjgl.vulkan.video.StdVideoEncodeH265PictureInfoFlags.SIZEOF
            long r2 = (long) r2
            org.lwjgl.system.MemoryUtil.memCopy(r0, r1, r2)
            return
    }

    public static void npic_type(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.video.StdVideoEncodeH265PictureInfo.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.video.StdVideoEncodeH265PictureInfo.PIC_TYPE
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void nsps_video_parameter_set_id(long r7, byte r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.video.StdVideoEncodeH265PictureInfo.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.video.StdVideoEncodeH265PictureInfo.SPS_VIDEO_PARAMETER_SET_ID
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putByte(r1, r2, r3)
            return
    }

    public static void npps_seq_parameter_set_id(long r7, byte r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.video.StdVideoEncodeH265PictureInfo.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.video.StdVideoEncodeH265PictureInfo.PPS_SEQ_PARAMETER_SET_ID
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putByte(r1, r2, r3)
            return
    }

    public static void npps_pic_parameter_set_id(long r7, byte r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.video.StdVideoEncodeH265PictureInfo.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.video.StdVideoEncodeH265PictureInfo.PPS_PIC_PARAMETER_SET_ID
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putByte(r1, r2, r3)
            return
    }

    public static void nshort_term_ref_pic_set_idx(long r7, byte r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.video.StdVideoEncodeH265PictureInfo.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.video.StdVideoEncodeH265PictureInfo.SHORT_TERM_REF_PIC_SET_IDX
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putByte(r1, r2, r3)
            return
    }

    public static void nPicOrderCntVal(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.video.StdVideoEncodeH265PictureInfo.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.video.StdVideoEncodeH265PictureInfo.PICORDERCNTVAL
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void nTemporalId(long r7, byte r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.video.StdVideoEncodeH265PictureInfo.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.video.StdVideoEncodeH265PictureInfo.TEMPORALID
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putByte(r1, r2, r3)
            return
    }

    public static void nreserved1(long r7, java.nio.ByteBuffer r9) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lc
            r0 = r9
            r1 = 7
            org.lwjgl.system.Checks.checkGT(r0, r1)
        Lc:
            r0 = r9
            long r0 = org.lwjgl.system.MemoryUtil.memAddress(r0)
            r1 = r7
            int r2 = org.lwjgl.vulkan.video.StdVideoEncodeH265PictureInfo.RESERVED1
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

    public static void nreserved1(long r9, int r11, byte r12) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.video.StdVideoEncodeH265PictureInfo.UNSAFE
            r1 = 0
            r2 = r9
            int r3 = org.lwjgl.vulkan.video.StdVideoEncodeH265PictureInfo.RESERVED1
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

    public static void npRefLists(long r5, org.lwjgl.vulkan.video.StdVideoEncodeH265ReferenceModifications r7) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.video.StdVideoEncodeH265PictureInfo.PREFLISTS
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            long r1 = r1.address()
            org.lwjgl.system.MemoryUtil.memPutAddress(r0, r1)
            return
    }

    public static void npShortTermRefPicSet(long r5, org.lwjgl.vulkan.video.StdVideoH265ShortTermRefPicSet r7) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.video.StdVideoEncodeH265PictureInfo.PSHORTTERMREFPICSET
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            long r1 = r1.address()
            org.lwjgl.system.MemoryUtil.memPutAddress(r0, r1)
            return
    }

    public static void npLongTermRefPics(long r5, org.lwjgl.vulkan.video.StdVideoEncodeH265LongTermRefPics r7) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.video.StdVideoEncodeH265PictureInfo.PLONGTERMREFPICS
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            long r1 = r1.address()
            org.lwjgl.system.MemoryUtil.memPutAddress(r0, r1)
            return
    }

    public static void validate(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.video.StdVideoEncodeH265PictureInfo.PREFLISTS
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r5
            int r1 = org.lwjgl.vulkan.video.StdVideoEncodeH265PictureInfo.PSHORTTERMREFPICSET
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r5
            int r1 = org.lwjgl.vulkan.video.StdVideoEncodeH265PictureInfo.PLONGTERMREFPICS
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
            org.lwjgl.vulkan.video.StdVideoEncodeH265PictureInfo r0 = r0.create(r1, r2)
            return r0
    }

    static {
            r0 = 12
            org.lwjgl.system.Struct$Member[] r0 = new org.lwjgl.system.Struct.Member[r0]
            r1 = r0
            r2 = 0
            int r3 = org.lwjgl.vulkan.video.StdVideoEncodeH265PictureInfoFlags.SIZEOF
            int r4 = org.lwjgl.vulkan.video.StdVideoEncodeH265PictureInfoFlags.ALIGNOF
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
            r3 = 4
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
            r4 = 7
            org.lwjgl.system.Struct$Member r3 = __array(r3, r4)
            r1[r2] = r3
            r1 = r0
            r2 = 9
            int r3 = org.lwjgl.vulkan.video.StdVideoEncodeH265PictureInfo.POINTER_SIZE
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 10
            int r3 = org.lwjgl.vulkan.video.StdVideoEncodeH265PictureInfo.POINTER_SIZE
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 11
            int r3 = org.lwjgl.vulkan.video.StdVideoEncodeH265PictureInfo.POINTER_SIZE
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            org.lwjgl.system.Struct$Layout r0 = __struct(r0)
            r6 = r0
            r0 = r6
            int r0 = r0.getSize()
            org.lwjgl.vulkan.video.StdVideoEncodeH265PictureInfo.SIZEOF = r0
            r0 = r6
            int r0 = r0.getAlignment()
            org.lwjgl.vulkan.video.StdVideoEncodeH265PictureInfo.ALIGNOF = r0
            r0 = r6
            r1 = 0
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.video.StdVideoEncodeH265PictureInfo.FLAGS = r0
            r0 = r6
            r1 = 1
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.video.StdVideoEncodeH265PictureInfo.PIC_TYPE = r0
            r0 = r6
            r1 = 2
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.video.StdVideoEncodeH265PictureInfo.SPS_VIDEO_PARAMETER_SET_ID = r0
            r0 = r6
            r1 = 3
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.video.StdVideoEncodeH265PictureInfo.PPS_SEQ_PARAMETER_SET_ID = r0
            r0 = r6
            r1 = 4
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.video.StdVideoEncodeH265PictureInfo.PPS_PIC_PARAMETER_SET_ID = r0
            r0 = r6
            r1 = 5
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.video.StdVideoEncodeH265PictureInfo.SHORT_TERM_REF_PIC_SET_IDX = r0
            r0 = r6
            r1 = 6
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.video.StdVideoEncodeH265PictureInfo.PICORDERCNTVAL = r0
            r0 = r6
            r1 = 7
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.video.StdVideoEncodeH265PictureInfo.TEMPORALID = r0
            r0 = r6
            r1 = 8
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.video.StdVideoEncodeH265PictureInfo.RESERVED1 = r0
            r0 = r6
            r1 = 9
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.video.StdVideoEncodeH265PictureInfo.PREFLISTS = r0
            r0 = r6
            r1 = 10
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.video.StdVideoEncodeH265PictureInfo.PSHORTTERMREFPICSET = r0
            r0 = r6
            r1 = 11
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.video.StdVideoEncodeH265PictureInfo.PLONGTERMREFPICS = r0
            return
    }
}
