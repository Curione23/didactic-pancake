package org.lwjgl.vulkan.video;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/video/StdVideoEncodeAV1ReferenceInfo.class */
public class StdVideoEncodeAV1ReferenceInfo extends org.lwjgl.system.Struct<org.lwjgl.vulkan.video.StdVideoEncodeAV1ReferenceInfo> implements org.lwjgl.system.NativeResource {
    public static final int SIZEOF = 0;
    public static final int ALIGNOF = 0;
    public static final int FLAGS = 0;
    public static final int REFFRAMEID = 0;
    public static final int FRAME_TYPE = 0;
    public static final int ORDERHINT = 0;
    public static final int RESERVED1 = 0;
    public static final int PEXTENSIONHEADER = 0;

    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/video/StdVideoEncodeAV1ReferenceInfo$Buffer.class */
    public static class Buffer extends org.lwjgl.system.StructBuffer<org.lwjgl.vulkan.video.StdVideoEncodeAV1ReferenceInfo, org.lwjgl.vulkan.video.StdVideoEncodeAV1ReferenceInfo.Buffer> implements org.lwjgl.system.NativeResource {
        private static final org.lwjgl.vulkan.video.StdVideoEncodeAV1ReferenceInfo ELEMENT_FACTORY = null;

        public Buffer(java.nio.ByteBuffer r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r6
                int r2 = r2.remaining()
                int r3 = org.lwjgl.vulkan.video.StdVideoEncodeAV1ReferenceInfo.SIZEOF
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

        Buffer(long r10, java.nio.ByteBuffer r12, int r13, int r14, int r15, int r16) {
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
        protected org.lwjgl.vulkan.video.StdVideoEncodeAV1ReferenceInfo.Buffer self() {
                r2 = this;
                r0 = r2
                return r0
        }

        protected org.lwjgl.vulkan.video.StdVideoEncodeAV1ReferenceInfo.Buffer create(long r11, java.nio.ByteBuffer r13, int r14, int r15, int r16, int r17) {
                r10 = this;
                org.lwjgl.vulkan.video.StdVideoEncodeAV1ReferenceInfo$Buffer r0 = new org.lwjgl.vulkan.video.StdVideoEncodeAV1ReferenceInfo$Buffer
                r1 = r0
                r2 = r11
                r3 = r13
                r4 = r14
                r5 = r15
                r6 = r16
                r7 = r17
                r1.<init>(r2, r3, r4, r5, r6, r7)
                return r0
        }

        @Override // org.lwjgl.system.StructBuffer
        protected org.lwjgl.vulkan.video.StdVideoEncodeAV1ReferenceInfo getElementFactory() {
                r2 = this;
                org.lwjgl.vulkan.video.StdVideoEncodeAV1ReferenceInfo r0 = org.lwjgl.vulkan.video.StdVideoEncodeAV1ReferenceInfo.Buffer.ELEMENT_FACTORY
                return r0
        }

        public org.lwjgl.vulkan.video.StdVideoEncodeAV1ReferenceInfoFlags flags() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                org.lwjgl.vulkan.video.StdVideoEncodeAV1ReferenceInfoFlags r0 = org.lwjgl.vulkan.video.StdVideoEncodeAV1ReferenceInfo.nflags(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint32_t")
        public int RefFrameId() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.video.StdVideoEncodeAV1ReferenceInfo.nRefFrameId(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("StdVideoAV1FrameType")
        public int frame_type() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.video.StdVideoEncodeAV1ReferenceInfo.nframe_type(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint8_t")
        public byte OrderHint() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                byte r0 = org.lwjgl.vulkan.video.StdVideoEncodeAV1ReferenceInfo.nOrderHint(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("StdVideoEncodeAV1ExtensionHeader const *")
        public org.lwjgl.vulkan.video.StdVideoEncodeAV1ExtensionHeader pExtensionHeader() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                org.lwjgl.vulkan.video.StdVideoEncodeAV1ExtensionHeader r0 = org.lwjgl.vulkan.video.StdVideoEncodeAV1ReferenceInfo.npExtensionHeader(r0)
                return r0
        }

        public org.lwjgl.vulkan.video.StdVideoEncodeAV1ReferenceInfo.Buffer flags(org.lwjgl.vulkan.video.StdVideoEncodeAV1ReferenceInfoFlags r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.video.StdVideoEncodeAV1ReferenceInfo.nflags(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.video.StdVideoEncodeAV1ReferenceInfo.Buffer flags(java.util.function.Consumer<org.lwjgl.vulkan.video.StdVideoEncodeAV1ReferenceInfoFlags> r4) {
                r3 = this;
                r0 = r4
                r1 = r3
                org.lwjgl.vulkan.video.StdVideoEncodeAV1ReferenceInfoFlags r1 = r1.flags()
                r0.accept(r1)
                r0 = r3
                return r0
        }

        public org.lwjgl.vulkan.video.StdVideoEncodeAV1ReferenceInfo.Buffer RefFrameId(@org.lwjgl.system.NativeType("uint32_t") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.video.StdVideoEncodeAV1ReferenceInfo.nRefFrameId(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.video.StdVideoEncodeAV1ReferenceInfo.Buffer frame_type(@org.lwjgl.system.NativeType("StdVideoAV1FrameType") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.video.StdVideoEncodeAV1ReferenceInfo.nframe_type(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.video.StdVideoEncodeAV1ReferenceInfo.Buffer OrderHint(@org.lwjgl.system.NativeType("uint8_t") byte r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.video.StdVideoEncodeAV1ReferenceInfo.nOrderHint(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.video.StdVideoEncodeAV1ReferenceInfo.Buffer pExtensionHeader(@org.lwjgl.system.NativeType("StdVideoEncodeAV1ExtensionHeader const *") org.lwjgl.vulkan.video.StdVideoEncodeAV1ExtensionHeader r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.video.StdVideoEncodeAV1ReferenceInfo.npExtensionHeader(r0, r1)
                r0 = r4
                return r0
        }

        @Override // org.lwjgl.system.StructBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.Struct getElementFactory() {
                r2 = this;
                r0 = r2
                org.lwjgl.vulkan.video.StdVideoEncodeAV1ReferenceInfo r0 = r0.getElementFactory()
                return r0
        }

        /* JADX INFO: renamed from: create, reason: collision with other method in class */
        protected /* bridge */ /* synthetic */ org.lwjgl.system.CustomBuffer m7440create(long r10, java.nio.ByteBuffer r12, int r13, int r14, int r15, int r16) {
                r9 = this;
                r0 = r9
                r1 = r10
                r2 = r12
                r3 = r13
                r4 = r14
                r5 = r15
                r6 = r16
                org.lwjgl.vulkan.video.StdVideoEncodeAV1ReferenceInfo$Buffer r0 = r0.create(r1, r2, r3, r4, r5, r6)
                return r0
        }

        @Override // org.lwjgl.system.CustomBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.CustomBuffer self() {
                r2 = this;
                r0 = r2
                org.lwjgl.vulkan.video.StdVideoEncodeAV1ReferenceInfo$Buffer r0 = r0.self()
                return r0
        }

        static {
                r0 = -1
                org.lwjgl.vulkan.video.StdVideoEncodeAV1ReferenceInfo r0 = org.lwjgl.vulkan.video.StdVideoEncodeAV1ReferenceInfo.create(r0)
                org.lwjgl.vulkan.video.StdVideoEncodeAV1ReferenceInfo.Buffer.ELEMENT_FACTORY = r0
                return
        }
    }

    protected StdVideoEncodeAV1ReferenceInfo(long r6, java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    protected org.lwjgl.vulkan.video.StdVideoEncodeAV1ReferenceInfo create(long r7, java.nio.ByteBuffer r9) {
            r6 = this;
            org.lwjgl.vulkan.video.StdVideoEncodeAV1ReferenceInfo r0 = new org.lwjgl.vulkan.video.StdVideoEncodeAV1ReferenceInfo
            r1 = r0
            r2 = r7
            r3 = r9
            r1.<init>(r2, r3)
            return r0
    }

    public StdVideoEncodeAV1ReferenceInfo(java.nio.ByteBuffer r7) {
            r6 = this;
            r0 = r6
            r1 = r7
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            r2 = r7
            int r3 = org.lwjgl.vulkan.video.StdVideoEncodeAV1ReferenceInfo.SIZEOF
            java.nio.ByteBuffer r2 = __checkContainer(r2, r3)
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
            r2 = this;
            int r0 = org.lwjgl.vulkan.video.StdVideoEncodeAV1ReferenceInfo.SIZEOF
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoEncodeAV1ReferenceInfoFlags flags() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            org.lwjgl.vulkan.video.StdVideoEncodeAV1ReferenceInfoFlags r0 = nflags(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("uint32_t")
    public int RefFrameId() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nRefFrameId(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("StdVideoAV1FrameType")
    public int frame_type() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nframe_type(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("uint8_t")
    public byte OrderHint() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            byte r0 = nOrderHint(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("StdVideoEncodeAV1ExtensionHeader const *")
    public org.lwjgl.vulkan.video.StdVideoEncodeAV1ExtensionHeader pExtensionHeader() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            org.lwjgl.vulkan.video.StdVideoEncodeAV1ExtensionHeader r0 = npExtensionHeader(r0)
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoEncodeAV1ReferenceInfo flags(org.lwjgl.vulkan.video.StdVideoEncodeAV1ReferenceInfoFlags r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nflags(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoEncodeAV1ReferenceInfo flags(java.util.function.Consumer<org.lwjgl.vulkan.video.StdVideoEncodeAV1ReferenceInfoFlags> r4) {
            r3 = this;
            r0 = r4
            r1 = r3
            org.lwjgl.vulkan.video.StdVideoEncodeAV1ReferenceInfoFlags r1 = r1.flags()
            r0.accept(r1)
            r0 = r3
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoEncodeAV1ReferenceInfo RefFrameId(@org.lwjgl.system.NativeType("uint32_t") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nRefFrameId(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoEncodeAV1ReferenceInfo frame_type(@org.lwjgl.system.NativeType("StdVideoAV1FrameType") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nframe_type(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoEncodeAV1ReferenceInfo OrderHint(@org.lwjgl.system.NativeType("uint8_t") byte r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nOrderHint(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoEncodeAV1ReferenceInfo pExtensionHeader(@org.lwjgl.system.NativeType("StdVideoEncodeAV1ExtensionHeader const *") org.lwjgl.vulkan.video.StdVideoEncodeAV1ExtensionHeader r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            npExtensionHeader(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoEncodeAV1ReferenceInfo set(org.lwjgl.vulkan.video.StdVideoEncodeAV1ReferenceInfoFlags r4, int r5, int r6, byte r7, org.lwjgl.vulkan.video.StdVideoEncodeAV1ExtensionHeader r8) {
            r3 = this;
            r0 = r3
            r1 = r4
            org.lwjgl.vulkan.video.StdVideoEncodeAV1ReferenceInfo r0 = r0.flags(r1)
            r0 = r3
            r1 = r5
            org.lwjgl.vulkan.video.StdVideoEncodeAV1ReferenceInfo r0 = r0.RefFrameId(r1)
            r0 = r3
            r1 = r6
            org.lwjgl.vulkan.video.StdVideoEncodeAV1ReferenceInfo r0 = r0.frame_type(r1)
            r0 = r3
            r1 = r7
            org.lwjgl.vulkan.video.StdVideoEncodeAV1ReferenceInfo r0 = r0.OrderHint(r1)
            r0 = r3
            r1 = r8
            org.lwjgl.vulkan.video.StdVideoEncodeAV1ReferenceInfo r0 = r0.pExtensionHeader(r1)
            r0 = r3
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoEncodeAV1ReferenceInfo set(org.lwjgl.vulkan.video.StdVideoEncodeAV1ReferenceInfo r8) {
            r7 = this;
            r0 = r8
            long r0 = r0.address()
            r1 = r7
            long r1 = r1.address()
            int r2 = org.lwjgl.vulkan.video.StdVideoEncodeAV1ReferenceInfo.SIZEOF
            long r2 = (long) r2
            org.lwjgl.system.MemoryUtil.memCopy(r0, r1, r2)
            r0 = r7
            return r0
    }

    public static org.lwjgl.vulkan.video.StdVideoEncodeAV1ReferenceInfo malloc() {
            org.lwjgl.vulkan.video.StdVideoEncodeAV1ReferenceInfo r0 = new org.lwjgl.vulkan.video.StdVideoEncodeAV1ReferenceInfo
            r1 = r0
            int r2 = org.lwjgl.vulkan.video.StdVideoEncodeAV1ReferenceInfo.SIZEOF
            long r2 = (long) r2
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.video.StdVideoEncodeAV1ReferenceInfo calloc() {
            org.lwjgl.vulkan.video.StdVideoEncodeAV1ReferenceInfo r0 = new org.lwjgl.vulkan.video.StdVideoEncodeAV1ReferenceInfo
            r1 = r0
            r2 = 1
            int r3 = org.lwjgl.vulkan.video.StdVideoEncodeAV1ReferenceInfo.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.video.StdVideoEncodeAV1ReferenceInfo create() {
            int r0 = org.lwjgl.vulkan.video.StdVideoEncodeAV1ReferenceInfo.SIZEOF
            java.nio.ByteBuffer r0 = org.lwjgl.BufferUtils.createByteBuffer(r0)
            r6 = r0
            org.lwjgl.vulkan.video.StdVideoEncodeAV1ReferenceInfo r0 = new org.lwjgl.vulkan.video.StdVideoEncodeAV1ReferenceInfo
            r1 = r0
            r2 = r6
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.video.StdVideoEncodeAV1ReferenceInfo create(long r6) {
            org.lwjgl.vulkan.video.StdVideoEncodeAV1ReferenceInfo r0 = new org.lwjgl.vulkan.video.StdVideoEncodeAV1ReferenceInfo
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.video.StdVideoEncodeAV1ReferenceInfo createSafe(long r6) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.vulkan.video.StdVideoEncodeAV1ReferenceInfo r0 = new org.lwjgl.vulkan.video.StdVideoEncodeAV1ReferenceInfo
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static org.lwjgl.vulkan.video.StdVideoEncodeAV1ReferenceInfo.Buffer malloc(int r6) {
            org.lwjgl.vulkan.video.StdVideoEncodeAV1ReferenceInfo$Buffer r0 = new org.lwjgl.vulkan.video.StdVideoEncodeAV1ReferenceInfo$Buffer
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.vulkan.video.StdVideoEncodeAV1ReferenceInfo.SIZEOF
            long r2 = __checkMalloc(r2, r3)
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.video.StdVideoEncodeAV1ReferenceInfo.Buffer calloc(int r7) {
            org.lwjgl.vulkan.video.StdVideoEncodeAV1ReferenceInfo$Buffer r0 = new org.lwjgl.vulkan.video.StdVideoEncodeAV1ReferenceInfo$Buffer
            r1 = r0
            r2 = r7
            long r2 = (long) r2
            int r3 = org.lwjgl.vulkan.video.StdVideoEncodeAV1ReferenceInfo.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.video.StdVideoEncodeAV1ReferenceInfo.Buffer create(int r10) {
            r0 = r10
            int r1 = org.lwjgl.vulkan.video.StdVideoEncodeAV1ReferenceInfo.SIZEOF
            java.nio.ByteBuffer r0 = __create(r0, r1)
            r11 = r0
            org.lwjgl.vulkan.video.StdVideoEncodeAV1ReferenceInfo$Buffer r0 = new org.lwjgl.vulkan.video.StdVideoEncodeAV1ReferenceInfo$Buffer
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

    public static org.lwjgl.vulkan.video.StdVideoEncodeAV1ReferenceInfo.Buffer create(long r6, int r8) {
            org.lwjgl.vulkan.video.StdVideoEncodeAV1ReferenceInfo$Buffer r0 = new org.lwjgl.vulkan.video.StdVideoEncodeAV1ReferenceInfo$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.video.StdVideoEncodeAV1ReferenceInfo.Buffer createSafe(long r6, int r8) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.vulkan.video.StdVideoEncodeAV1ReferenceInfo$Buffer r0 = new org.lwjgl.vulkan.video.StdVideoEncodeAV1ReferenceInfo$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static org.lwjgl.vulkan.video.StdVideoEncodeAV1ReferenceInfo malloc(org.lwjgl.system.MemoryStack r6) {
            org.lwjgl.vulkan.video.StdVideoEncodeAV1ReferenceInfo r0 = new org.lwjgl.vulkan.video.StdVideoEncodeAV1ReferenceInfo
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.vulkan.video.StdVideoEncodeAV1ReferenceInfo.ALIGNOF
            int r4 = org.lwjgl.vulkan.video.StdVideoEncodeAV1ReferenceInfo.SIZEOF
            long r2 = r2.nmalloc(r3, r4)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.video.StdVideoEncodeAV1ReferenceInfo calloc(org.lwjgl.system.MemoryStack r7) {
            org.lwjgl.vulkan.video.StdVideoEncodeAV1ReferenceInfo r0 = new org.lwjgl.vulkan.video.StdVideoEncodeAV1ReferenceInfo
            r1 = r0
            r2 = r7
            int r3 = org.lwjgl.vulkan.video.StdVideoEncodeAV1ReferenceInfo.ALIGNOF
            r4 = 1
            int r5 = org.lwjgl.vulkan.video.StdVideoEncodeAV1ReferenceInfo.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.video.StdVideoEncodeAV1ReferenceInfo.Buffer malloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.vulkan.video.StdVideoEncodeAV1ReferenceInfo$Buffer r0 = new org.lwjgl.vulkan.video.StdVideoEncodeAV1ReferenceInfo$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.vulkan.video.StdVideoEncodeAV1ReferenceInfo.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.vulkan.video.StdVideoEncodeAV1ReferenceInfo.SIZEOF
            int r4 = r4 * r5
            long r2 = r2.nmalloc(r3, r4)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.video.StdVideoEncodeAV1ReferenceInfo.Buffer calloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.vulkan.video.StdVideoEncodeAV1ReferenceInfo$Buffer r0 = new org.lwjgl.vulkan.video.StdVideoEncodeAV1ReferenceInfo$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.vulkan.video.StdVideoEncodeAV1ReferenceInfo.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.vulkan.video.StdVideoEncodeAV1ReferenceInfo.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.video.StdVideoEncodeAV1ReferenceInfoFlags nflags(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.video.StdVideoEncodeAV1ReferenceInfo.FLAGS
            long r1 = (long) r1
            long r0 = r0 + r1
            org.lwjgl.vulkan.video.StdVideoEncodeAV1ReferenceInfoFlags r0 = org.lwjgl.vulkan.video.StdVideoEncodeAV1ReferenceInfoFlags.create(r0)
            return r0
    }

    public static int nRefFrameId(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.video.StdVideoEncodeAV1ReferenceInfo.REFFRAMEID
            long r1 = (long) r1
            long r0 = r0 + r1
            int r0 = org.lwjgl.system.MemoryUtil.memGetInt(r0)
            return r0
    }

    public static int nframe_type(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.video.StdVideoEncodeAV1ReferenceInfo.FRAME_TYPE
            long r1 = (long) r1
            long r0 = r0 + r1
            int r0 = org.lwjgl.system.MemoryUtil.memGetInt(r0)
            return r0
    }

    public static byte nOrderHint(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.video.StdVideoEncodeAV1ReferenceInfo.ORDERHINT
            long r1 = (long) r1
            long r0 = r0 + r1
            byte r0 = org.lwjgl.system.MemoryUtil.memGetByte(r0)
            return r0
    }

    public static java.nio.ByteBuffer nreserved1(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.video.StdVideoEncodeAV1ReferenceInfo.RESERVED1
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = 3
            java.nio.ByteBuffer r0 = org.lwjgl.system.MemoryUtil.memByteBuffer(r0, r1)
            return r0
    }

    public static byte nreserved1(long r7, int r9) {
            r0 = r7
            int r1 = org.lwjgl.vulkan.video.StdVideoEncodeAV1ReferenceInfo.RESERVED1
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r9
            r2 = 3
            long r1 = org.lwjgl.system.Checks.check(r1, r2)
            r2 = 1
            long r1 = r1 * r2
            long r0 = r0 + r1
            byte r0 = org.lwjgl.system.MemoryUtil.memGetByte(r0)
            return r0
    }

    public static org.lwjgl.vulkan.video.StdVideoEncodeAV1ExtensionHeader npExtensionHeader(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.video.StdVideoEncodeAV1ReferenceInfo.PEXTENSIONHEADER
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            org.lwjgl.vulkan.video.StdVideoEncodeAV1ExtensionHeader r0 = org.lwjgl.vulkan.video.StdVideoEncodeAV1ExtensionHeader.create(r0)
            return r0
    }

    public static void nflags(long r7, org.lwjgl.vulkan.video.StdVideoEncodeAV1ReferenceInfoFlags r9) {
            r0 = r9
            long r0 = r0.address()
            r1 = r7
            int r2 = org.lwjgl.vulkan.video.StdVideoEncodeAV1ReferenceInfo.FLAGS
            long r2 = (long) r2
            long r1 = r1 + r2
            int r2 = org.lwjgl.vulkan.video.StdVideoEncodeAV1ReferenceInfoFlags.SIZEOF
            long r2 = (long) r2
            org.lwjgl.system.MemoryUtil.memCopy(r0, r1, r2)
            return
    }

    public static void nRefFrameId(long r5, int r7) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.video.StdVideoEncodeAV1ReferenceInfo.REFFRAMEID
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            org.lwjgl.system.MemoryUtil.memPutInt(r0, r1)
            return
    }

    public static void nframe_type(long r5, int r7) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.video.StdVideoEncodeAV1ReferenceInfo.FRAME_TYPE
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            org.lwjgl.system.MemoryUtil.memPutInt(r0, r1)
            return
    }

    public static void nOrderHint(long r5, byte r7) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.video.StdVideoEncodeAV1ReferenceInfo.ORDERHINT
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            org.lwjgl.system.MemoryUtil.memPutByte(r0, r1)
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
            int r2 = org.lwjgl.vulkan.video.StdVideoEncodeAV1ReferenceInfo.RESERVED1
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

    public static void nreserved1(long r7, int r9, byte r10) {
            r0 = r7
            int r1 = org.lwjgl.vulkan.video.StdVideoEncodeAV1ReferenceInfo.RESERVED1
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r9
            r2 = 3
            long r1 = org.lwjgl.system.Checks.check(r1, r2)
            r2 = 1
            long r1 = r1 * r2
            long r0 = r0 + r1
            r1 = r10
            org.lwjgl.system.MemoryUtil.memPutByte(r0, r1)
            return
    }

    public static void npExtensionHeader(long r5, org.lwjgl.vulkan.video.StdVideoEncodeAV1ExtensionHeader r7) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.video.StdVideoEncodeAV1ReferenceInfo.PEXTENSIONHEADER
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            long r1 = r1.address()
            org.lwjgl.system.MemoryUtil.memPutAddress(r0, r1)
            return
    }

    public static void validate(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.video.StdVideoEncodeAV1ReferenceInfo.PEXTENSIONHEADER
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            long r0 = org.lwjgl.system.Checks.check(r0)
            return
    }

    @Override // org.lwjgl.system.Struct
    protected /* bridge */ /* synthetic */ org.lwjgl.system.Struct create(long r6, java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            org.lwjgl.vulkan.video.StdVideoEncodeAV1ReferenceInfo r0 = r0.create(r1, r2)
            return r0
    }

    static {
            r0 = 6
            org.lwjgl.system.Struct$Member[] r0 = new org.lwjgl.system.Struct.Member[r0]
            r1 = r0
            r2 = 0
            int r3 = org.lwjgl.vulkan.video.StdVideoEncodeAV1ReferenceInfoFlags.SIZEOF
            int r4 = org.lwjgl.vulkan.video.StdVideoEncodeAV1ReferenceInfoFlags.ALIGNOF
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
            r4 = 3
            org.lwjgl.system.Struct$Member r3 = __array(r3, r4)
            r1[r2] = r3
            r1 = r0
            r2 = 5
            int r3 = org.lwjgl.vulkan.video.StdVideoEncodeAV1ReferenceInfo.POINTER_SIZE
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            org.lwjgl.system.Struct$Layout r0 = __struct(r0)
            r6 = r0
            r0 = r6
            int r0 = r0.getSize()
            org.lwjgl.vulkan.video.StdVideoEncodeAV1ReferenceInfo.SIZEOF = r0
            r0 = r6
            int r0 = r0.getAlignment()
            org.lwjgl.vulkan.video.StdVideoEncodeAV1ReferenceInfo.ALIGNOF = r0
            r0 = r6
            r1 = 0
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.video.StdVideoEncodeAV1ReferenceInfo.FLAGS = r0
            r0 = r6
            r1 = 1
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.video.StdVideoEncodeAV1ReferenceInfo.REFFRAMEID = r0
            r0 = r6
            r1 = 2
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.video.StdVideoEncodeAV1ReferenceInfo.FRAME_TYPE = r0
            r0 = r6
            r1 = 3
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.video.StdVideoEncodeAV1ReferenceInfo.ORDERHINT = r0
            r0 = r6
            r1 = 4
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.video.StdVideoEncodeAV1ReferenceInfo.RESERVED1 = r0
            r0 = r6
            r1 = 5
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.video.StdVideoEncodeAV1ReferenceInfo.PEXTENSIONHEADER = r0
            return
    }
}
