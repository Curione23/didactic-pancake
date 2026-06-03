package org.lwjgl.vulkan.video;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/video/StdVideoEncodeH264PictureInfo.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/video/StdVideoEncodeH264PictureInfo.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/video/StdVideoEncodeH264PictureInfo.class */
public class StdVideoEncodeH264PictureInfo extends org.lwjgl.system.Struct<org.lwjgl.vulkan.video.StdVideoEncodeH264PictureInfo> implements org.lwjgl.system.NativeResource {
    public static final int SIZEOF = 0;
    public static final int ALIGNOF = 0;
    public static final int FLAGS = 0;
    public static final int SEQ_PARAMETER_SET_ID = 0;
    public static final int PIC_PARAMETER_SET_ID = 0;
    public static final int IDR_PIC_ID = 0;
    public static final int PRIMARY_PIC_TYPE = 0;
    public static final int FRAME_NUM = 0;
    public static final int PICORDERCNT = 0;
    public static final int TEMPORAL_ID = 0;
    public static final int RESERVED1 = 0;
    public static final int PREFLISTS = 0;

    /* JADX WARN: Classes with same name are omitted, all sources:
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/video/StdVideoEncodeH264PictureInfo$Buffer.class
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/video/StdVideoEncodeH264PictureInfo$Buffer.class
     */
    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/video/StdVideoEncodeH264PictureInfo$Buffer.class */
    public static class Buffer extends org.lwjgl.system.StructBuffer<org.lwjgl.vulkan.video.StdVideoEncodeH264PictureInfo, org.lwjgl.vulkan.video.StdVideoEncodeH264PictureInfo.Buffer> implements org.lwjgl.system.NativeResource {
        private static final org.lwjgl.vulkan.video.StdVideoEncodeH264PictureInfo ELEMENT_FACTORY = null;

        public Buffer(java.nio.ByteBuffer r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r6
                int r2 = r2.remaining()
                int r3 = org.lwjgl.vulkan.video.StdVideoEncodeH264PictureInfo.SIZEOF
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
        protected org.lwjgl.vulkan.video.StdVideoEncodeH264PictureInfo.Buffer self() {
                r2 = this;
                r0 = r2
                return r0
        }

        @Override // org.lwjgl.system.StructBuffer
        protected org.lwjgl.vulkan.video.StdVideoEncodeH264PictureInfo getElementFactory() {
                r2 = this;
                org.lwjgl.vulkan.video.StdVideoEncodeH264PictureInfo r0 = org.lwjgl.vulkan.video.StdVideoEncodeH264PictureInfo.Buffer.ELEMENT_FACTORY
                return r0
        }

        public org.lwjgl.vulkan.video.StdVideoEncodeH264PictureInfoFlags flags() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                org.lwjgl.vulkan.video.StdVideoEncodeH264PictureInfoFlags r0 = org.lwjgl.vulkan.video.StdVideoEncodeH264PictureInfo.nflags(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint8_t")
        public byte seq_parameter_set_id() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                byte r0 = org.lwjgl.vulkan.video.StdVideoEncodeH264PictureInfo.nseq_parameter_set_id(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint8_t")
        public byte pic_parameter_set_id() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                byte r0 = org.lwjgl.vulkan.video.StdVideoEncodeH264PictureInfo.npic_parameter_set_id(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint16_t")
        public short idr_pic_id() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                short r0 = org.lwjgl.vulkan.video.StdVideoEncodeH264PictureInfo.nidr_pic_id(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("StdVideoH264PictureType")
        public int primary_pic_type() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.video.StdVideoEncodeH264PictureInfo.nprimary_pic_type(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint32_t")
        public int frame_num() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.video.StdVideoEncodeH264PictureInfo.nframe_num(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("int32_t")
        public int PicOrderCnt() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.video.StdVideoEncodeH264PictureInfo.nPicOrderCnt(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint8_t")
        public byte temporal_id() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                byte r0 = org.lwjgl.vulkan.video.StdVideoEncodeH264PictureInfo.ntemporal_id(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("StdVideoEncodeH264ReferenceListsInfo const *")
        public org.lwjgl.vulkan.video.StdVideoEncodeH264ReferenceListsInfo pRefLists() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                org.lwjgl.vulkan.video.StdVideoEncodeH264ReferenceListsInfo r0 = org.lwjgl.vulkan.video.StdVideoEncodeH264PictureInfo.npRefLists(r0)
                return r0
        }

        public org.lwjgl.vulkan.video.StdVideoEncodeH264PictureInfo.Buffer flags(org.lwjgl.vulkan.video.StdVideoEncodeH264PictureInfoFlags r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.video.StdVideoEncodeH264PictureInfo.nflags(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.video.StdVideoEncodeH264PictureInfo.Buffer flags(java.util.function.Consumer<org.lwjgl.vulkan.video.StdVideoEncodeH264PictureInfoFlags> r4) {
                r3 = this;
                r0 = r4
                r1 = r3
                org.lwjgl.vulkan.video.StdVideoEncodeH264PictureInfoFlags r1 = r1.flags()
                r0.accept(r1)
                r0 = r3
                return r0
        }

        public org.lwjgl.vulkan.video.StdVideoEncodeH264PictureInfo.Buffer seq_parameter_set_id(@org.lwjgl.system.NativeType("uint8_t") byte r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.video.StdVideoEncodeH264PictureInfo.nseq_parameter_set_id(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.video.StdVideoEncodeH264PictureInfo.Buffer pic_parameter_set_id(@org.lwjgl.system.NativeType("uint8_t") byte r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.video.StdVideoEncodeH264PictureInfo.npic_parameter_set_id(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.video.StdVideoEncodeH264PictureInfo.Buffer idr_pic_id(@org.lwjgl.system.NativeType("uint16_t") short r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.video.StdVideoEncodeH264PictureInfo.nidr_pic_id(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.video.StdVideoEncodeH264PictureInfo.Buffer primary_pic_type(@org.lwjgl.system.NativeType("StdVideoH264PictureType") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.video.StdVideoEncodeH264PictureInfo.nprimary_pic_type(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.video.StdVideoEncodeH264PictureInfo.Buffer frame_num(@org.lwjgl.system.NativeType("uint32_t") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.video.StdVideoEncodeH264PictureInfo.nframe_num(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.video.StdVideoEncodeH264PictureInfo.Buffer PicOrderCnt(@org.lwjgl.system.NativeType("int32_t") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.video.StdVideoEncodeH264PictureInfo.nPicOrderCnt(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.video.StdVideoEncodeH264PictureInfo.Buffer temporal_id(@org.lwjgl.system.NativeType("uint8_t") byte r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.video.StdVideoEncodeH264PictureInfo.ntemporal_id(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.video.StdVideoEncodeH264PictureInfo.Buffer pRefLists(@org.lwjgl.system.NativeType("StdVideoEncodeH264ReferenceListsInfo const *") org.lwjgl.vulkan.video.StdVideoEncodeH264ReferenceListsInfo r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.video.StdVideoEncodeH264PictureInfo.npRefLists(r0, r1)
                r0 = r4
                return r0
        }

        @Override // org.lwjgl.system.StructBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.Struct getElementFactory() {
                r2 = this;
                r0 = r2
                org.lwjgl.vulkan.video.StdVideoEncodeH264PictureInfo r0 = r0.getElementFactory()
                return r0
        }

        @Override // org.lwjgl.system.CustomBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.CustomBuffer self() {
                r2 = this;
                r0 = r2
                org.lwjgl.vulkan.video.StdVideoEncodeH264PictureInfo$Buffer r0 = r0.self()
                return r0
        }

        static {
                r0 = -1
                org.lwjgl.vulkan.video.StdVideoEncodeH264PictureInfo r0 = org.lwjgl.vulkan.video.StdVideoEncodeH264PictureInfo.create(r0)
                org.lwjgl.vulkan.video.StdVideoEncodeH264PictureInfo.Buffer.ELEMENT_FACTORY = r0
                return
        }
    }

    protected StdVideoEncodeH264PictureInfo(long r6, @javax.annotation.Nullable java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    protected org.lwjgl.vulkan.video.StdVideoEncodeH264PictureInfo create(long r7, @javax.annotation.Nullable java.nio.ByteBuffer r9) {
            r6 = this;
            org.lwjgl.vulkan.video.StdVideoEncodeH264PictureInfo r0 = new org.lwjgl.vulkan.video.StdVideoEncodeH264PictureInfo
            r1 = r0
            r2 = r7
            r3 = r9
            r1.<init>(r2, r3)
            return r0
    }

    public StdVideoEncodeH264PictureInfo(java.nio.ByteBuffer r7) {
            r6 = this;
            r0 = r6
            r1 = r7
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            r2 = r7
            int r3 = org.lwjgl.vulkan.video.StdVideoEncodeH264PictureInfo.SIZEOF
            java.nio.ByteBuffer r2 = __checkContainer(r2, r3)
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
            r2 = this;
            int r0 = org.lwjgl.vulkan.video.StdVideoEncodeH264PictureInfo.SIZEOF
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoEncodeH264PictureInfoFlags flags() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            org.lwjgl.vulkan.video.StdVideoEncodeH264PictureInfoFlags r0 = nflags(r0)
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

    @org.lwjgl.system.NativeType("uint16_t")
    public short idr_pic_id() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            short r0 = nidr_pic_id(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("StdVideoH264PictureType")
    public int primary_pic_type() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nprimary_pic_type(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("uint32_t")
    public int frame_num() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nframe_num(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("int32_t")
    public int PicOrderCnt() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nPicOrderCnt(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("uint8_t")
    public byte temporal_id() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            byte r0 = ntemporal_id(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("StdVideoEncodeH264ReferenceListsInfo const *")
    public org.lwjgl.vulkan.video.StdVideoEncodeH264ReferenceListsInfo pRefLists() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            org.lwjgl.vulkan.video.StdVideoEncodeH264ReferenceListsInfo r0 = npRefLists(r0)
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoEncodeH264PictureInfo flags(org.lwjgl.vulkan.video.StdVideoEncodeH264PictureInfoFlags r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nflags(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoEncodeH264PictureInfo flags(java.util.function.Consumer<org.lwjgl.vulkan.video.StdVideoEncodeH264PictureInfoFlags> r4) {
            r3 = this;
            r0 = r4
            r1 = r3
            org.lwjgl.vulkan.video.StdVideoEncodeH264PictureInfoFlags r1 = r1.flags()
            r0.accept(r1)
            r0 = r3
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoEncodeH264PictureInfo seq_parameter_set_id(@org.lwjgl.system.NativeType("uint8_t") byte r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nseq_parameter_set_id(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoEncodeH264PictureInfo pic_parameter_set_id(@org.lwjgl.system.NativeType("uint8_t") byte r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            npic_parameter_set_id(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoEncodeH264PictureInfo idr_pic_id(@org.lwjgl.system.NativeType("uint16_t") short r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nidr_pic_id(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoEncodeH264PictureInfo primary_pic_type(@org.lwjgl.system.NativeType("StdVideoH264PictureType") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nprimary_pic_type(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoEncodeH264PictureInfo frame_num(@org.lwjgl.system.NativeType("uint32_t") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nframe_num(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoEncodeH264PictureInfo PicOrderCnt(@org.lwjgl.system.NativeType("int32_t") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nPicOrderCnt(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoEncodeH264PictureInfo temporal_id(@org.lwjgl.system.NativeType("uint8_t") byte r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            ntemporal_id(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoEncodeH264PictureInfo pRefLists(@org.lwjgl.system.NativeType("StdVideoEncodeH264ReferenceListsInfo const *") org.lwjgl.vulkan.video.StdVideoEncodeH264ReferenceListsInfo r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            npRefLists(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoEncodeH264PictureInfo set(org.lwjgl.vulkan.video.StdVideoEncodeH264PictureInfoFlags r4, byte r5, byte r6, short r7, int r8, int r9, int r10, byte r11, org.lwjgl.vulkan.video.StdVideoEncodeH264ReferenceListsInfo r12) {
            r3 = this;
            r0 = r3
            r1 = r4
            org.lwjgl.vulkan.video.StdVideoEncodeH264PictureInfo r0 = r0.flags(r1)
            r0 = r3
            r1 = r5
            org.lwjgl.vulkan.video.StdVideoEncodeH264PictureInfo r0 = r0.seq_parameter_set_id(r1)
            r0 = r3
            r1 = r6
            org.lwjgl.vulkan.video.StdVideoEncodeH264PictureInfo r0 = r0.pic_parameter_set_id(r1)
            r0 = r3
            r1 = r7
            org.lwjgl.vulkan.video.StdVideoEncodeH264PictureInfo r0 = r0.idr_pic_id(r1)
            r0 = r3
            r1 = r8
            org.lwjgl.vulkan.video.StdVideoEncodeH264PictureInfo r0 = r0.primary_pic_type(r1)
            r0 = r3
            r1 = r9
            org.lwjgl.vulkan.video.StdVideoEncodeH264PictureInfo r0 = r0.frame_num(r1)
            r0 = r3
            r1 = r10
            org.lwjgl.vulkan.video.StdVideoEncodeH264PictureInfo r0 = r0.PicOrderCnt(r1)
            r0 = r3
            r1 = r11
            org.lwjgl.vulkan.video.StdVideoEncodeH264PictureInfo r0 = r0.temporal_id(r1)
            r0 = r3
            r1 = r12
            org.lwjgl.vulkan.video.StdVideoEncodeH264PictureInfo r0 = r0.pRefLists(r1)
            r0 = r3
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoEncodeH264PictureInfo set(org.lwjgl.vulkan.video.StdVideoEncodeH264PictureInfo r8) {
            r7 = this;
            r0 = r8
            long r0 = r0.address()
            r1 = r7
            long r1 = r1.address()
            int r2 = org.lwjgl.vulkan.video.StdVideoEncodeH264PictureInfo.SIZEOF
            long r2 = (long) r2
            org.lwjgl.system.MemoryUtil.memCopy(r0, r1, r2)
            r0 = r7
            return r0
    }

    public static org.lwjgl.vulkan.video.StdVideoEncodeH264PictureInfo malloc() {
            org.lwjgl.vulkan.video.StdVideoEncodeH264PictureInfo r0 = new org.lwjgl.vulkan.video.StdVideoEncodeH264PictureInfo
            r1 = r0
            int r2 = org.lwjgl.vulkan.video.StdVideoEncodeH264PictureInfo.SIZEOF
            long r2 = (long) r2
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.video.StdVideoEncodeH264PictureInfo calloc() {
            org.lwjgl.vulkan.video.StdVideoEncodeH264PictureInfo r0 = new org.lwjgl.vulkan.video.StdVideoEncodeH264PictureInfo
            r1 = r0
            r2 = 1
            int r3 = org.lwjgl.vulkan.video.StdVideoEncodeH264PictureInfo.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.video.StdVideoEncodeH264PictureInfo create() {
            int r0 = org.lwjgl.vulkan.video.StdVideoEncodeH264PictureInfo.SIZEOF
            java.nio.ByteBuffer r0 = org.lwjgl.BufferUtils.createByteBuffer(r0)
            r6 = r0
            org.lwjgl.vulkan.video.StdVideoEncodeH264PictureInfo r0 = new org.lwjgl.vulkan.video.StdVideoEncodeH264PictureInfo
            r1 = r0
            r2 = r6
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.video.StdVideoEncodeH264PictureInfo create(long r6) {
            org.lwjgl.vulkan.video.StdVideoEncodeH264PictureInfo r0 = new org.lwjgl.vulkan.video.StdVideoEncodeH264PictureInfo
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.vulkan.video.StdVideoEncodeH264PictureInfo createSafe(long r6) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.vulkan.video.StdVideoEncodeH264PictureInfo r0 = new org.lwjgl.vulkan.video.StdVideoEncodeH264PictureInfo
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static org.lwjgl.vulkan.video.StdVideoEncodeH264PictureInfo.Buffer malloc(int r6) {
            org.lwjgl.vulkan.video.StdVideoEncodeH264PictureInfo$Buffer r0 = new org.lwjgl.vulkan.video.StdVideoEncodeH264PictureInfo$Buffer
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.vulkan.video.StdVideoEncodeH264PictureInfo.SIZEOF
            long r2 = __checkMalloc(r2, r3)
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.video.StdVideoEncodeH264PictureInfo.Buffer calloc(int r7) {
            org.lwjgl.vulkan.video.StdVideoEncodeH264PictureInfo$Buffer r0 = new org.lwjgl.vulkan.video.StdVideoEncodeH264PictureInfo$Buffer
            r1 = r0
            r2 = r7
            long r2 = (long) r2
            int r3 = org.lwjgl.vulkan.video.StdVideoEncodeH264PictureInfo.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.video.StdVideoEncodeH264PictureInfo.Buffer create(int r10) {
            r0 = r10
            int r1 = org.lwjgl.vulkan.video.StdVideoEncodeH264PictureInfo.SIZEOF
            java.nio.ByteBuffer r0 = __create(r0, r1)
            r11 = r0
            org.lwjgl.vulkan.video.StdVideoEncodeH264PictureInfo$Buffer r0 = new org.lwjgl.vulkan.video.StdVideoEncodeH264PictureInfo$Buffer
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

    public static org.lwjgl.vulkan.video.StdVideoEncodeH264PictureInfo.Buffer create(long r6, int r8) {
            org.lwjgl.vulkan.video.StdVideoEncodeH264PictureInfo$Buffer r0 = new org.lwjgl.vulkan.video.StdVideoEncodeH264PictureInfo$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.vulkan.video.StdVideoEncodeH264PictureInfo.Buffer createSafe(long r6, int r8) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.vulkan.video.StdVideoEncodeH264PictureInfo$Buffer r0 = new org.lwjgl.vulkan.video.StdVideoEncodeH264PictureInfo$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static org.lwjgl.vulkan.video.StdVideoEncodeH264PictureInfo malloc(org.lwjgl.system.MemoryStack r6) {
            org.lwjgl.vulkan.video.StdVideoEncodeH264PictureInfo r0 = new org.lwjgl.vulkan.video.StdVideoEncodeH264PictureInfo
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.vulkan.video.StdVideoEncodeH264PictureInfo.ALIGNOF
            int r4 = org.lwjgl.vulkan.video.StdVideoEncodeH264PictureInfo.SIZEOF
            long r2 = r2.nmalloc(r3, r4)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.video.StdVideoEncodeH264PictureInfo calloc(org.lwjgl.system.MemoryStack r7) {
            org.lwjgl.vulkan.video.StdVideoEncodeH264PictureInfo r0 = new org.lwjgl.vulkan.video.StdVideoEncodeH264PictureInfo
            r1 = r0
            r2 = r7
            int r3 = org.lwjgl.vulkan.video.StdVideoEncodeH264PictureInfo.ALIGNOF
            r4 = 1
            int r5 = org.lwjgl.vulkan.video.StdVideoEncodeH264PictureInfo.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.video.StdVideoEncodeH264PictureInfo.Buffer malloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.vulkan.video.StdVideoEncodeH264PictureInfo$Buffer r0 = new org.lwjgl.vulkan.video.StdVideoEncodeH264PictureInfo$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.vulkan.video.StdVideoEncodeH264PictureInfo.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.vulkan.video.StdVideoEncodeH264PictureInfo.SIZEOF
            int r4 = r4 * r5
            long r2 = r2.nmalloc(r3, r4)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.video.StdVideoEncodeH264PictureInfo.Buffer calloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.vulkan.video.StdVideoEncodeH264PictureInfo$Buffer r0 = new org.lwjgl.vulkan.video.StdVideoEncodeH264PictureInfo$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.vulkan.video.StdVideoEncodeH264PictureInfo.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.vulkan.video.StdVideoEncodeH264PictureInfo.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.video.StdVideoEncodeH264PictureInfoFlags nflags(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.video.StdVideoEncodeH264PictureInfo.FLAGS
            long r1 = (long) r1
            long r0 = r0 + r1
            org.lwjgl.vulkan.video.StdVideoEncodeH264PictureInfoFlags r0 = org.lwjgl.vulkan.video.StdVideoEncodeH264PictureInfoFlags.create(r0)
            return r0
    }

    public static byte nseq_parameter_set_id(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.video.StdVideoEncodeH264PictureInfo.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.video.StdVideoEncodeH264PictureInfo.SEQ_PARAMETER_SET_ID
            long r3 = (long) r3
            long r2 = r2 + r3
            byte r0 = r0.getByte(r1, r2)
            return r0
    }

    public static byte npic_parameter_set_id(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.video.StdVideoEncodeH264PictureInfo.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.video.StdVideoEncodeH264PictureInfo.PIC_PARAMETER_SET_ID
            long r3 = (long) r3
            long r2 = r2 + r3
            byte r0 = r0.getByte(r1, r2)
            return r0
    }

    public static short nidr_pic_id(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.video.StdVideoEncodeH264PictureInfo.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.video.StdVideoEncodeH264PictureInfo.IDR_PIC_ID
            long r3 = (long) r3
            long r2 = r2 + r3
            short r0 = r0.getShort(r1, r2)
            return r0
    }

    public static int nprimary_pic_type(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.video.StdVideoEncodeH264PictureInfo.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.video.StdVideoEncodeH264PictureInfo.PRIMARY_PIC_TYPE
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int nframe_num(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.video.StdVideoEncodeH264PictureInfo.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.video.StdVideoEncodeH264PictureInfo.FRAME_NUM
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int nPicOrderCnt(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.video.StdVideoEncodeH264PictureInfo.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.video.StdVideoEncodeH264PictureInfo.PICORDERCNT
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static byte ntemporal_id(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.video.StdVideoEncodeH264PictureInfo.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.video.StdVideoEncodeH264PictureInfo.TEMPORAL_ID
            long r3 = (long) r3
            long r2 = r2 + r3
            byte r0 = r0.getByte(r1, r2)
            return r0
    }

    public static java.nio.ByteBuffer nreserved1(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.video.StdVideoEncodeH264PictureInfo.RESERVED1
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = 3
            java.nio.ByteBuffer r0 = org.lwjgl.system.MemoryUtil.memByteBuffer(r0, r1)
            return r0
    }

    public static byte nreserved1(long r9, int r11) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.video.StdVideoEncodeH264PictureInfo.UNSAFE
            r1 = 0
            r2 = r9
            int r3 = org.lwjgl.vulkan.video.StdVideoEncodeH264PictureInfo.RESERVED1
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r11
            r4 = 3
            long r3 = org.lwjgl.system.Checks.check(r3, r4)
            r4 = 1
            long r3 = r3 * r4
            long r2 = r2 + r3
            byte r0 = r0.getByte(r1, r2)
            return r0
    }

    public static org.lwjgl.vulkan.video.StdVideoEncodeH264ReferenceListsInfo npRefLists(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.video.StdVideoEncodeH264PictureInfo.PREFLISTS
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            org.lwjgl.vulkan.video.StdVideoEncodeH264ReferenceListsInfo r0 = org.lwjgl.vulkan.video.StdVideoEncodeH264ReferenceListsInfo.create(r0)
            return r0
    }

    public static void nflags(long r7, org.lwjgl.vulkan.video.StdVideoEncodeH264PictureInfoFlags r9) {
            r0 = r9
            long r0 = r0.address()
            r1 = r7
            int r2 = org.lwjgl.vulkan.video.StdVideoEncodeH264PictureInfo.FLAGS
            long r2 = (long) r2
            long r1 = r1 + r2
            int r2 = org.lwjgl.vulkan.video.StdVideoEncodeH264PictureInfoFlags.SIZEOF
            long r2 = (long) r2
            org.lwjgl.system.MemoryUtil.memCopy(r0, r1, r2)
            return
    }

    public static void nseq_parameter_set_id(long r7, byte r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.video.StdVideoEncodeH264PictureInfo.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.video.StdVideoEncodeH264PictureInfo.SEQ_PARAMETER_SET_ID
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putByte(r1, r2, r3)
            return
    }

    public static void npic_parameter_set_id(long r7, byte r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.video.StdVideoEncodeH264PictureInfo.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.video.StdVideoEncodeH264PictureInfo.PIC_PARAMETER_SET_ID
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putByte(r1, r2, r3)
            return
    }

    public static void nidr_pic_id(long r7, short r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.video.StdVideoEncodeH264PictureInfo.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.video.StdVideoEncodeH264PictureInfo.IDR_PIC_ID
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putShort(r1, r2, r3)
            return
    }

    public static void nprimary_pic_type(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.video.StdVideoEncodeH264PictureInfo.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.video.StdVideoEncodeH264PictureInfo.PRIMARY_PIC_TYPE
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void nframe_num(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.video.StdVideoEncodeH264PictureInfo.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.video.StdVideoEncodeH264PictureInfo.FRAME_NUM
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void nPicOrderCnt(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.video.StdVideoEncodeH264PictureInfo.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.video.StdVideoEncodeH264PictureInfo.PICORDERCNT
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void ntemporal_id(long r7, byte r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.video.StdVideoEncodeH264PictureInfo.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.video.StdVideoEncodeH264PictureInfo.TEMPORAL_ID
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putByte(r1, r2, r3)
            return
    }

    public static void nreserved1(long r7, java.nio.ByteBuffer r9) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r9
            r1 = 3
            org.lwjgl.system.Checks.checkGT(r0, r1)
        Lb:
            r0 = r9
            long r0 = org.lwjgl.system.MemoryUtil.memAddress(r0)
            r1 = r7
            int r2 = org.lwjgl.vulkan.video.StdVideoEncodeH264PictureInfo.RESERVED1
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
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.video.StdVideoEncodeH264PictureInfo.UNSAFE
            r1 = 0
            r2 = r9
            int r3 = org.lwjgl.vulkan.video.StdVideoEncodeH264PictureInfo.RESERVED1
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r11
            r4 = 3
            long r3 = org.lwjgl.system.Checks.check(r3, r4)
            r4 = 1
            long r3 = r3 * r4
            long r2 = r2 + r3
            r3 = r12
            r0.putByte(r1, r2, r3)
            return
    }

    public static void npRefLists(long r5, org.lwjgl.vulkan.video.StdVideoEncodeH264ReferenceListsInfo r7) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.video.StdVideoEncodeH264PictureInfo.PREFLISTS
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            long r1 = r1.address()
            org.lwjgl.system.MemoryUtil.memPutAddress(r0, r1)
            return
    }

    public static void validate(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.video.StdVideoEncodeH264PictureInfo.PREFLISTS
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            r7 = r0
            r0 = r7
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r7
            org.lwjgl.vulkan.video.StdVideoEncodeH264ReferenceListsInfo.validate(r0)
            return
    }

    @Override // org.lwjgl.system.Struct
    protected /* bridge */ /* synthetic */ org.lwjgl.system.Struct create(long r6, @javax.annotation.Nullable java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            org.lwjgl.vulkan.video.StdVideoEncodeH264PictureInfo r0 = r0.create(r1, r2)
            return r0
    }

    static {
            r0 = 10
            org.lwjgl.system.Struct$Member[] r0 = new org.lwjgl.system.Struct.Member[r0]
            r1 = r0
            r2 = 0
            int r3 = org.lwjgl.vulkan.video.StdVideoEncodeH264PictureInfoFlags.SIZEOF
            int r4 = org.lwjgl.vulkan.video.StdVideoEncodeH264PictureInfoFlags.ALIGNOF
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
            r3 = 2
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 4
            r3 = 4
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 5
            r3 = 4
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
            r4 = 3
            org.lwjgl.system.Struct$Member r3 = __array(r3, r4)
            r1[r2] = r3
            r1 = r0
            r2 = 9
            int r3 = org.lwjgl.vulkan.video.StdVideoEncodeH264PictureInfo.POINTER_SIZE
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            org.lwjgl.system.Struct$Layout r0 = __struct(r0)
            r6 = r0
            r0 = r6
            int r0 = r0.getSize()
            org.lwjgl.vulkan.video.StdVideoEncodeH264PictureInfo.SIZEOF = r0
            r0 = r6
            int r0 = r0.getAlignment()
            org.lwjgl.vulkan.video.StdVideoEncodeH264PictureInfo.ALIGNOF = r0
            r0 = r6
            r1 = 0
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.video.StdVideoEncodeH264PictureInfo.FLAGS = r0
            r0 = r6
            r1 = 1
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.video.StdVideoEncodeH264PictureInfo.SEQ_PARAMETER_SET_ID = r0
            r0 = r6
            r1 = 2
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.video.StdVideoEncodeH264PictureInfo.PIC_PARAMETER_SET_ID = r0
            r0 = r6
            r1 = 3
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.video.StdVideoEncodeH264PictureInfo.IDR_PIC_ID = r0
            r0 = r6
            r1 = 4
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.video.StdVideoEncodeH264PictureInfo.PRIMARY_PIC_TYPE = r0
            r0 = r6
            r1 = 5
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.video.StdVideoEncodeH264PictureInfo.FRAME_NUM = r0
            r0 = r6
            r1 = 6
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.video.StdVideoEncodeH264PictureInfo.PICORDERCNT = r0
            r0 = r6
            r1 = 7
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.video.StdVideoEncodeH264PictureInfo.TEMPORAL_ID = r0
            r0 = r6
            r1 = 8
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.video.StdVideoEncodeH264PictureInfo.RESERVED1 = r0
            r0 = r6
            r1 = 9
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.video.StdVideoEncodeH264PictureInfo.PREFLISTS = r0
            return
    }
}
