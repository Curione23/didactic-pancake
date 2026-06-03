package org.lwjgl.vulkan.video;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/video/StdVideoDecodeH264ReferenceInfo.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/video/StdVideoDecodeH264ReferenceInfo.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/video/StdVideoDecodeH264ReferenceInfo.class */
public class StdVideoDecodeH264ReferenceInfo extends org.lwjgl.system.Struct<org.lwjgl.vulkan.video.StdVideoDecodeH264ReferenceInfo> implements org.lwjgl.system.NativeResource {
    public static final int SIZEOF = 0;
    public static final int ALIGNOF = 0;
    public static final int FLAGS = 0;
    public static final int FRAMENUM = 0;
    public static final int RESERVED = 0;
    public static final int PICORDERCNT = 0;

    /* JADX WARN: Classes with same name are omitted, all sources:
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/video/StdVideoDecodeH264ReferenceInfo$Buffer.class
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/video/StdVideoDecodeH264ReferenceInfo$Buffer.class
     */
    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/video/StdVideoDecodeH264ReferenceInfo$Buffer.class */
    public static class Buffer extends org.lwjgl.system.StructBuffer<org.lwjgl.vulkan.video.StdVideoDecodeH264ReferenceInfo, org.lwjgl.vulkan.video.StdVideoDecodeH264ReferenceInfo.Buffer> implements org.lwjgl.system.NativeResource {
        private static final org.lwjgl.vulkan.video.StdVideoDecodeH264ReferenceInfo ELEMENT_FACTORY = null;

        public Buffer(java.nio.ByteBuffer r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r6
                int r2 = r2.remaining()
                int r3 = org.lwjgl.vulkan.video.StdVideoDecodeH264ReferenceInfo.SIZEOF
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
        protected org.lwjgl.vulkan.video.StdVideoDecodeH264ReferenceInfo.Buffer self() {
                r2 = this;
                r0 = r2
                return r0
        }

        @Override // org.lwjgl.system.StructBuffer
        protected org.lwjgl.vulkan.video.StdVideoDecodeH264ReferenceInfo getElementFactory() {
                r2 = this;
                org.lwjgl.vulkan.video.StdVideoDecodeH264ReferenceInfo r0 = org.lwjgl.vulkan.video.StdVideoDecodeH264ReferenceInfo.Buffer.ELEMENT_FACTORY
                return r0
        }

        public org.lwjgl.vulkan.video.StdVideoDecodeH264ReferenceInfoFlags flags() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                org.lwjgl.vulkan.video.StdVideoDecodeH264ReferenceInfoFlags r0 = org.lwjgl.vulkan.video.StdVideoDecodeH264ReferenceInfo.nflags(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint16_t")
        public short FrameNum() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                short r0 = org.lwjgl.vulkan.video.StdVideoDecodeH264ReferenceInfo.nFrameNum(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("int32_t[STD_VIDEO_DECODE_H264_FIELD_ORDER_COUNT_LIST_SIZE]")
        public java.nio.IntBuffer PicOrderCnt() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                java.nio.IntBuffer r0 = org.lwjgl.vulkan.video.StdVideoDecodeH264ReferenceInfo.nPicOrderCnt(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("int32_t")
        public int PicOrderCnt(int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                int r0 = org.lwjgl.vulkan.video.StdVideoDecodeH264ReferenceInfo.nPicOrderCnt(r0, r1)
                return r0
        }

        public org.lwjgl.vulkan.video.StdVideoDecodeH264ReferenceInfo.Buffer flags(org.lwjgl.vulkan.video.StdVideoDecodeH264ReferenceInfoFlags r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.video.StdVideoDecodeH264ReferenceInfo.nflags(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.video.StdVideoDecodeH264ReferenceInfo.Buffer flags(java.util.function.Consumer<org.lwjgl.vulkan.video.StdVideoDecodeH264ReferenceInfoFlags> r4) {
                r3 = this;
                r0 = r4
                r1 = r3
                org.lwjgl.vulkan.video.StdVideoDecodeH264ReferenceInfoFlags r1 = r1.flags()
                r0.accept(r1)
                r0 = r3
                return r0
        }

        public org.lwjgl.vulkan.video.StdVideoDecodeH264ReferenceInfo.Buffer FrameNum(@org.lwjgl.system.NativeType("uint16_t") short r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.video.StdVideoDecodeH264ReferenceInfo.nFrameNum(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.video.StdVideoDecodeH264ReferenceInfo.Buffer PicOrderCnt(@org.lwjgl.system.NativeType("int32_t[STD_VIDEO_DECODE_H264_FIELD_ORDER_COUNT_LIST_SIZE]") java.nio.IntBuffer r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.video.StdVideoDecodeH264ReferenceInfo.nPicOrderCnt(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.video.StdVideoDecodeH264ReferenceInfo.Buffer PicOrderCnt(int r6, @org.lwjgl.system.NativeType("int32_t") int r7) {
                r5 = this;
                r0 = r5
                long r0 = r0.address()
                r1 = r6
                r2 = r7
                org.lwjgl.vulkan.video.StdVideoDecodeH264ReferenceInfo.nPicOrderCnt(r0, r1, r2)
                r0 = r5
                return r0
        }

        @Override // org.lwjgl.system.StructBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.Struct getElementFactory() {
                r2 = this;
                r0 = r2
                org.lwjgl.vulkan.video.StdVideoDecodeH264ReferenceInfo r0 = r0.getElementFactory()
                return r0
        }

        @Override // org.lwjgl.system.CustomBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.CustomBuffer self() {
                r2 = this;
                r0 = r2
                org.lwjgl.vulkan.video.StdVideoDecodeH264ReferenceInfo$Buffer r0 = r0.self()
                return r0
        }

        static {
                r0 = -1
                org.lwjgl.vulkan.video.StdVideoDecodeH264ReferenceInfo r0 = org.lwjgl.vulkan.video.StdVideoDecodeH264ReferenceInfo.create(r0)
                org.lwjgl.vulkan.video.StdVideoDecodeH264ReferenceInfo.Buffer.ELEMENT_FACTORY = r0
                return
        }
    }

    protected StdVideoDecodeH264ReferenceInfo(long r6, @javax.annotation.Nullable java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    protected org.lwjgl.vulkan.video.StdVideoDecodeH264ReferenceInfo create(long r7, @javax.annotation.Nullable java.nio.ByteBuffer r9) {
            r6 = this;
            org.lwjgl.vulkan.video.StdVideoDecodeH264ReferenceInfo r0 = new org.lwjgl.vulkan.video.StdVideoDecodeH264ReferenceInfo
            r1 = r0
            r2 = r7
            r3 = r9
            r1.<init>(r2, r3)
            return r0
    }

    public StdVideoDecodeH264ReferenceInfo(java.nio.ByteBuffer r7) {
            r6 = this;
            r0 = r6
            r1 = r7
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            r2 = r7
            int r3 = org.lwjgl.vulkan.video.StdVideoDecodeH264ReferenceInfo.SIZEOF
            java.nio.ByteBuffer r2 = __checkContainer(r2, r3)
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
            r2 = this;
            int r0 = org.lwjgl.vulkan.video.StdVideoDecodeH264ReferenceInfo.SIZEOF
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoDecodeH264ReferenceInfoFlags flags() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            org.lwjgl.vulkan.video.StdVideoDecodeH264ReferenceInfoFlags r0 = nflags(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("uint16_t")
    public short FrameNum() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            short r0 = nFrameNum(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("int32_t[STD_VIDEO_DECODE_H264_FIELD_ORDER_COUNT_LIST_SIZE]")
    public java.nio.IntBuffer PicOrderCnt() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            java.nio.IntBuffer r0 = nPicOrderCnt(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("int32_t")
    public int PicOrderCnt(int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            int r0 = nPicOrderCnt(r0, r1)
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoDecodeH264ReferenceInfo flags(org.lwjgl.vulkan.video.StdVideoDecodeH264ReferenceInfoFlags r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nflags(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoDecodeH264ReferenceInfo flags(java.util.function.Consumer<org.lwjgl.vulkan.video.StdVideoDecodeH264ReferenceInfoFlags> r4) {
            r3 = this;
            r0 = r4
            r1 = r3
            org.lwjgl.vulkan.video.StdVideoDecodeH264ReferenceInfoFlags r1 = r1.flags()
            r0.accept(r1)
            r0 = r3
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoDecodeH264ReferenceInfo FrameNum(@org.lwjgl.system.NativeType("uint16_t") short r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nFrameNum(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoDecodeH264ReferenceInfo PicOrderCnt(@org.lwjgl.system.NativeType("int32_t[STD_VIDEO_DECODE_H264_FIELD_ORDER_COUNT_LIST_SIZE]") java.nio.IntBuffer r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nPicOrderCnt(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoDecodeH264ReferenceInfo PicOrderCnt(int r6, @org.lwjgl.system.NativeType("int32_t") int r7) {
            r5 = this;
            r0 = r5
            long r0 = r0.address()
            r1 = r6
            r2 = r7
            nPicOrderCnt(r0, r1, r2)
            r0 = r5
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoDecodeH264ReferenceInfo set(org.lwjgl.vulkan.video.StdVideoDecodeH264ReferenceInfoFlags r4, short r5, java.nio.IntBuffer r6) {
            r3 = this;
            r0 = r3
            r1 = r4
            org.lwjgl.vulkan.video.StdVideoDecodeH264ReferenceInfo r0 = r0.flags(r1)
            r0 = r3
            r1 = r5
            org.lwjgl.vulkan.video.StdVideoDecodeH264ReferenceInfo r0 = r0.FrameNum(r1)
            r0 = r3
            r1 = r6
            org.lwjgl.vulkan.video.StdVideoDecodeH264ReferenceInfo r0 = r0.PicOrderCnt(r1)
            r0 = r3
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoDecodeH264ReferenceInfo set(org.lwjgl.vulkan.video.StdVideoDecodeH264ReferenceInfo r8) {
            r7 = this;
            r0 = r8
            long r0 = r0.address()
            r1 = r7
            long r1 = r1.address()
            int r2 = org.lwjgl.vulkan.video.StdVideoDecodeH264ReferenceInfo.SIZEOF
            long r2 = (long) r2
            org.lwjgl.system.MemoryUtil.memCopy(r0, r1, r2)
            r0 = r7
            return r0
    }

    public static org.lwjgl.vulkan.video.StdVideoDecodeH264ReferenceInfo malloc() {
            org.lwjgl.vulkan.video.StdVideoDecodeH264ReferenceInfo r0 = new org.lwjgl.vulkan.video.StdVideoDecodeH264ReferenceInfo
            r1 = r0
            int r2 = org.lwjgl.vulkan.video.StdVideoDecodeH264ReferenceInfo.SIZEOF
            long r2 = (long) r2
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.video.StdVideoDecodeH264ReferenceInfo calloc() {
            org.lwjgl.vulkan.video.StdVideoDecodeH264ReferenceInfo r0 = new org.lwjgl.vulkan.video.StdVideoDecodeH264ReferenceInfo
            r1 = r0
            r2 = 1
            int r3 = org.lwjgl.vulkan.video.StdVideoDecodeH264ReferenceInfo.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.video.StdVideoDecodeH264ReferenceInfo create() {
            int r0 = org.lwjgl.vulkan.video.StdVideoDecodeH264ReferenceInfo.SIZEOF
            java.nio.ByteBuffer r0 = org.lwjgl.BufferUtils.createByteBuffer(r0)
            r6 = r0
            org.lwjgl.vulkan.video.StdVideoDecodeH264ReferenceInfo r0 = new org.lwjgl.vulkan.video.StdVideoDecodeH264ReferenceInfo
            r1 = r0
            r2 = r6
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.video.StdVideoDecodeH264ReferenceInfo create(long r6) {
            org.lwjgl.vulkan.video.StdVideoDecodeH264ReferenceInfo r0 = new org.lwjgl.vulkan.video.StdVideoDecodeH264ReferenceInfo
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.vulkan.video.StdVideoDecodeH264ReferenceInfo createSafe(long r6) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.vulkan.video.StdVideoDecodeH264ReferenceInfo r0 = new org.lwjgl.vulkan.video.StdVideoDecodeH264ReferenceInfo
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static org.lwjgl.vulkan.video.StdVideoDecodeH264ReferenceInfo.Buffer malloc(int r6) {
            org.lwjgl.vulkan.video.StdVideoDecodeH264ReferenceInfo$Buffer r0 = new org.lwjgl.vulkan.video.StdVideoDecodeH264ReferenceInfo$Buffer
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.vulkan.video.StdVideoDecodeH264ReferenceInfo.SIZEOF
            long r2 = __checkMalloc(r2, r3)
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.video.StdVideoDecodeH264ReferenceInfo.Buffer calloc(int r7) {
            org.lwjgl.vulkan.video.StdVideoDecodeH264ReferenceInfo$Buffer r0 = new org.lwjgl.vulkan.video.StdVideoDecodeH264ReferenceInfo$Buffer
            r1 = r0
            r2 = r7
            long r2 = (long) r2
            int r3 = org.lwjgl.vulkan.video.StdVideoDecodeH264ReferenceInfo.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.video.StdVideoDecodeH264ReferenceInfo.Buffer create(int r10) {
            r0 = r10
            int r1 = org.lwjgl.vulkan.video.StdVideoDecodeH264ReferenceInfo.SIZEOF
            java.nio.ByteBuffer r0 = __create(r0, r1)
            r11 = r0
            org.lwjgl.vulkan.video.StdVideoDecodeH264ReferenceInfo$Buffer r0 = new org.lwjgl.vulkan.video.StdVideoDecodeH264ReferenceInfo$Buffer
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

    public static org.lwjgl.vulkan.video.StdVideoDecodeH264ReferenceInfo.Buffer create(long r6, int r8) {
            org.lwjgl.vulkan.video.StdVideoDecodeH264ReferenceInfo$Buffer r0 = new org.lwjgl.vulkan.video.StdVideoDecodeH264ReferenceInfo$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.vulkan.video.StdVideoDecodeH264ReferenceInfo.Buffer createSafe(long r6, int r8) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.vulkan.video.StdVideoDecodeH264ReferenceInfo$Buffer r0 = new org.lwjgl.vulkan.video.StdVideoDecodeH264ReferenceInfo$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static org.lwjgl.vulkan.video.StdVideoDecodeH264ReferenceInfo malloc(org.lwjgl.system.MemoryStack r6) {
            org.lwjgl.vulkan.video.StdVideoDecodeH264ReferenceInfo r0 = new org.lwjgl.vulkan.video.StdVideoDecodeH264ReferenceInfo
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.vulkan.video.StdVideoDecodeH264ReferenceInfo.ALIGNOF
            int r4 = org.lwjgl.vulkan.video.StdVideoDecodeH264ReferenceInfo.SIZEOF
            long r2 = r2.nmalloc(r3, r4)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.video.StdVideoDecodeH264ReferenceInfo calloc(org.lwjgl.system.MemoryStack r7) {
            org.lwjgl.vulkan.video.StdVideoDecodeH264ReferenceInfo r0 = new org.lwjgl.vulkan.video.StdVideoDecodeH264ReferenceInfo
            r1 = r0
            r2 = r7
            int r3 = org.lwjgl.vulkan.video.StdVideoDecodeH264ReferenceInfo.ALIGNOF
            r4 = 1
            int r5 = org.lwjgl.vulkan.video.StdVideoDecodeH264ReferenceInfo.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.video.StdVideoDecodeH264ReferenceInfo.Buffer malloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.vulkan.video.StdVideoDecodeH264ReferenceInfo$Buffer r0 = new org.lwjgl.vulkan.video.StdVideoDecodeH264ReferenceInfo$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.vulkan.video.StdVideoDecodeH264ReferenceInfo.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.vulkan.video.StdVideoDecodeH264ReferenceInfo.SIZEOF
            int r4 = r4 * r5
            long r2 = r2.nmalloc(r3, r4)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.video.StdVideoDecodeH264ReferenceInfo.Buffer calloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.vulkan.video.StdVideoDecodeH264ReferenceInfo$Buffer r0 = new org.lwjgl.vulkan.video.StdVideoDecodeH264ReferenceInfo$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.vulkan.video.StdVideoDecodeH264ReferenceInfo.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.vulkan.video.StdVideoDecodeH264ReferenceInfo.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.video.StdVideoDecodeH264ReferenceInfoFlags nflags(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.video.StdVideoDecodeH264ReferenceInfo.FLAGS
            long r1 = (long) r1
            long r0 = r0 + r1
            org.lwjgl.vulkan.video.StdVideoDecodeH264ReferenceInfoFlags r0 = org.lwjgl.vulkan.video.StdVideoDecodeH264ReferenceInfoFlags.create(r0)
            return r0
    }

    public static short nFrameNum(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.video.StdVideoDecodeH264ReferenceInfo.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.video.StdVideoDecodeH264ReferenceInfo.FRAMENUM
            long r3 = (long) r3
            long r2 = r2 + r3
            short r0 = r0.getShort(r1, r2)
            return r0
    }

    public static short nreserved(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.video.StdVideoDecodeH264ReferenceInfo.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.video.StdVideoDecodeH264ReferenceInfo.RESERVED
            long r3 = (long) r3
            long r2 = r2 + r3
            short r0 = r0.getShort(r1, r2)
            return r0
    }

    public static java.nio.IntBuffer nPicOrderCnt(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.video.StdVideoDecodeH264ReferenceInfo.PICORDERCNT
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = 2
            java.nio.IntBuffer r0 = org.lwjgl.system.MemoryUtil.memIntBuffer(r0, r1)
            return r0
    }

    public static int nPicOrderCnt(long r9, int r11) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.video.StdVideoDecodeH264ReferenceInfo.UNSAFE
            r1 = 0
            r2 = r9
            int r3 = org.lwjgl.vulkan.video.StdVideoDecodeH264ReferenceInfo.PICORDERCNT
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r11
            r4 = 2
            long r3 = org.lwjgl.system.Checks.check(r3, r4)
            r4 = 4
            long r3 = r3 * r4
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static void nflags(long r7, org.lwjgl.vulkan.video.StdVideoDecodeH264ReferenceInfoFlags r9) {
            r0 = r9
            long r0 = r0.address()
            r1 = r7
            int r2 = org.lwjgl.vulkan.video.StdVideoDecodeH264ReferenceInfo.FLAGS
            long r2 = (long) r2
            long r1 = r1 + r2
            int r2 = org.lwjgl.vulkan.video.StdVideoDecodeH264ReferenceInfoFlags.SIZEOF
            long r2 = (long) r2
            org.lwjgl.system.MemoryUtil.memCopy(r0, r1, r2)
            return
    }

    public static void nFrameNum(long r7, short r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.video.StdVideoDecodeH264ReferenceInfo.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.video.StdVideoDecodeH264ReferenceInfo.FRAMENUM
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putShort(r1, r2, r3)
            return
    }

    public static void nreserved(long r7, short r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.video.StdVideoDecodeH264ReferenceInfo.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.video.StdVideoDecodeH264ReferenceInfo.RESERVED
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putShort(r1, r2, r3)
            return
    }

    public static void nPicOrderCnt(long r7, java.nio.IntBuffer r9) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r9
            r1 = 2
            org.lwjgl.system.Checks.checkGT(r0, r1)
        Lb:
            r0 = r9
            long r0 = org.lwjgl.system.MemoryUtil.memAddress(r0)
            r1 = r7
            int r2 = org.lwjgl.vulkan.video.StdVideoDecodeH264ReferenceInfo.PICORDERCNT
            long r2 = (long) r2
            long r1 = r1 + r2
            r2 = r9
            int r2 = r2.remaining()
            r3 = 4
            int r2 = r2 * r3
            long r2 = (long) r2
            org.lwjgl.system.MemoryUtil.memCopy(r0, r1, r2)
            return
    }

    public static void nPicOrderCnt(long r9, int r11, int r12) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.video.StdVideoDecodeH264ReferenceInfo.UNSAFE
            r1 = 0
            r2 = r9
            int r3 = org.lwjgl.vulkan.video.StdVideoDecodeH264ReferenceInfo.PICORDERCNT
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r11
            r4 = 2
            long r3 = org.lwjgl.system.Checks.check(r3, r4)
            r4 = 4
            long r3 = r3 * r4
            long r2 = r2 + r3
            r3 = r12
            r0.putInt(r1, r2, r3)
            return
    }

    @Override // org.lwjgl.system.Struct
    protected /* bridge */ /* synthetic */ org.lwjgl.system.Struct create(long r6, @javax.annotation.Nullable java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            org.lwjgl.vulkan.video.StdVideoDecodeH264ReferenceInfo r0 = r0.create(r1, r2)
            return r0
    }

    static {
            r0 = 4
            org.lwjgl.system.Struct$Member[] r0 = new org.lwjgl.system.Struct.Member[r0]
            r1 = r0
            r2 = 0
            int r3 = org.lwjgl.vulkan.video.StdVideoDecodeH264ReferenceInfoFlags.SIZEOF
            int r4 = org.lwjgl.vulkan.video.StdVideoDecodeH264ReferenceInfoFlags.ALIGNOF
            org.lwjgl.system.Struct$Member r3 = __member(r3, r4)
            r1[r2] = r3
            r1 = r0
            r2 = 1
            r3 = 2
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 2
            r3 = 2
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 3
            r3 = 4
            r4 = 2
            org.lwjgl.system.Struct$Member r3 = __array(r3, r4)
            r1[r2] = r3
            org.lwjgl.system.Struct$Layout r0 = __struct(r0)
            r6 = r0
            r0 = r6
            int r0 = r0.getSize()
            org.lwjgl.vulkan.video.StdVideoDecodeH264ReferenceInfo.SIZEOF = r0
            r0 = r6
            int r0 = r0.getAlignment()
            org.lwjgl.vulkan.video.StdVideoDecodeH264ReferenceInfo.ALIGNOF = r0
            r0 = r6
            r1 = 0
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.video.StdVideoDecodeH264ReferenceInfo.FLAGS = r0
            r0 = r6
            r1 = 1
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.video.StdVideoDecodeH264ReferenceInfo.FRAMENUM = r0
            r0 = r6
            r1 = 2
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.video.StdVideoDecodeH264ReferenceInfo.RESERVED = r0
            r0 = r6
            r1 = 3
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.video.StdVideoDecodeH264ReferenceInfo.PICORDERCNT = r0
            return
    }
}
