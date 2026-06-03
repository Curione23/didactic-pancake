package org.lwjgl.vulkan;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkVideoDecodeAV1PictureInfoKHR.class */
public class VkVideoDecodeAV1PictureInfoKHR extends org.lwjgl.system.Struct<org.lwjgl.vulkan.VkVideoDecodeAV1PictureInfoKHR> implements org.lwjgl.system.NativeResource {
    public static final int SIZEOF = 0;
    public static final int ALIGNOF = 0;
    public static final int STYPE = 0;
    public static final int PNEXT = 0;
    public static final int PSTDPICTUREINFO = 0;
    public static final int REFERENCENAMESLOTINDICES = 0;
    public static final int FRAMEHEADEROFFSET = 0;
    public static final int TILECOUNT = 0;
    public static final int PTILEOFFSETS = 0;
    public static final int PTILESIZES = 0;

    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkVideoDecodeAV1PictureInfoKHR$Buffer.class */
    public static class Buffer extends org.lwjgl.system.StructBuffer<org.lwjgl.vulkan.VkVideoDecodeAV1PictureInfoKHR, org.lwjgl.vulkan.VkVideoDecodeAV1PictureInfoKHR.Buffer> implements org.lwjgl.system.NativeResource {
        private static final org.lwjgl.vulkan.VkVideoDecodeAV1PictureInfoKHR ELEMENT_FACTORY = null;

        public Buffer(java.nio.ByteBuffer r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r6
                int r2 = r2.remaining()
                int r3 = org.lwjgl.vulkan.VkVideoDecodeAV1PictureInfoKHR.SIZEOF
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
        protected org.lwjgl.vulkan.VkVideoDecodeAV1PictureInfoKHR.Buffer self() {
                r2 = this;
                r0 = r2
                return r0
        }

        protected org.lwjgl.vulkan.VkVideoDecodeAV1PictureInfoKHR.Buffer create(long r11, java.nio.ByteBuffer r13, int r14, int r15, int r16, int r17) {
                r10 = this;
                org.lwjgl.vulkan.VkVideoDecodeAV1PictureInfoKHR$Buffer r0 = new org.lwjgl.vulkan.VkVideoDecodeAV1PictureInfoKHR$Buffer
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
        protected org.lwjgl.vulkan.VkVideoDecodeAV1PictureInfoKHR getElementFactory() {
                r2 = this;
                org.lwjgl.vulkan.VkVideoDecodeAV1PictureInfoKHR r0 = org.lwjgl.vulkan.VkVideoDecodeAV1PictureInfoKHR.Buffer.ELEMENT_FACTORY
                return r0
        }

        @org.lwjgl.system.NativeType("VkStructureType")
        public int sType() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkVideoDecodeAV1PictureInfoKHR.nsType(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("void const *")
        public long pNext() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                long r0 = org.lwjgl.vulkan.VkVideoDecodeAV1PictureInfoKHR.npNext(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("StdVideoDecodeAV1PictureInfo const *")
        public org.lwjgl.vulkan.video.StdVideoDecodeAV1PictureInfo pStdPictureInfo() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                org.lwjgl.vulkan.video.StdVideoDecodeAV1PictureInfo r0 = org.lwjgl.vulkan.VkVideoDecodeAV1PictureInfoKHR.npStdPictureInfo(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("int32_t[VK_MAX_VIDEO_AV1_REFERENCES_PER_FRAME_KHR]")
        public java.nio.IntBuffer referenceNameSlotIndices() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                java.nio.IntBuffer r0 = org.lwjgl.vulkan.VkVideoDecodeAV1PictureInfoKHR.nreferenceNameSlotIndices(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("int32_t")
        public int referenceNameSlotIndices(int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                int r0 = org.lwjgl.vulkan.VkVideoDecodeAV1PictureInfoKHR.nreferenceNameSlotIndices(r0, r1)
                return r0
        }

        @org.lwjgl.system.NativeType("uint32_t")
        public int frameHeaderOffset() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkVideoDecodeAV1PictureInfoKHR.nframeHeaderOffset(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint32_t")
        public int tileCount() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkVideoDecodeAV1PictureInfoKHR.ntileCount(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint32_t const *")
        public java.nio.IntBuffer pTileOffsets() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                java.nio.IntBuffer r0 = org.lwjgl.vulkan.VkVideoDecodeAV1PictureInfoKHR.npTileOffsets(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint32_t const *")
        public java.nio.IntBuffer pTileSizes() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                java.nio.IntBuffer r0 = org.lwjgl.vulkan.VkVideoDecodeAV1PictureInfoKHR.npTileSizes(r0)
                return r0
        }

        public org.lwjgl.vulkan.VkVideoDecodeAV1PictureInfoKHR.Buffer sType(@org.lwjgl.system.NativeType("VkStructureType") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkVideoDecodeAV1PictureInfoKHR.nsType(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkVideoDecodeAV1PictureInfoKHR.Buffer sType$Default() {
                r3 = this;
                r0 = r3
                r1 = 1000512001(0x3ba29a01, float:0.0049622064)
                org.lwjgl.vulkan.VkVideoDecodeAV1PictureInfoKHR$Buffer r0 = r0.sType(r1)
                return r0
        }

        public org.lwjgl.vulkan.VkVideoDecodeAV1PictureInfoKHR.Buffer pNext(@org.lwjgl.system.NativeType("void const *") long r6) {
                r5 = this;
                r0 = r5
                long r0 = r0.address()
                r1 = r6
                org.lwjgl.vulkan.VkVideoDecodeAV1PictureInfoKHR.npNext(r0, r1)
                r0 = r5
                return r0
        }

        public org.lwjgl.vulkan.VkVideoDecodeAV1PictureInfoKHR.Buffer pStdPictureInfo(@org.lwjgl.system.NativeType("StdVideoDecodeAV1PictureInfo const *") org.lwjgl.vulkan.video.StdVideoDecodeAV1PictureInfo r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkVideoDecodeAV1PictureInfoKHR.npStdPictureInfo(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkVideoDecodeAV1PictureInfoKHR.Buffer referenceNameSlotIndices(@org.lwjgl.system.NativeType("int32_t[VK_MAX_VIDEO_AV1_REFERENCES_PER_FRAME_KHR]") java.nio.IntBuffer r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkVideoDecodeAV1PictureInfoKHR.nreferenceNameSlotIndices(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkVideoDecodeAV1PictureInfoKHR.Buffer referenceNameSlotIndices(int r6, @org.lwjgl.system.NativeType("int32_t") int r7) {
                r5 = this;
                r0 = r5
                long r0 = r0.address()
                r1 = r6
                r2 = r7
                org.lwjgl.vulkan.VkVideoDecodeAV1PictureInfoKHR.nreferenceNameSlotIndices(r0, r1, r2)
                r0 = r5
                return r0
        }

        public org.lwjgl.vulkan.VkVideoDecodeAV1PictureInfoKHR.Buffer frameHeaderOffset(@org.lwjgl.system.NativeType("uint32_t") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkVideoDecodeAV1PictureInfoKHR.nframeHeaderOffset(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkVideoDecodeAV1PictureInfoKHR.Buffer tileCount(@org.lwjgl.system.NativeType("uint32_t") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkVideoDecodeAV1PictureInfoKHR.ntileCount(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkVideoDecodeAV1PictureInfoKHR.Buffer pTileOffsets(@org.lwjgl.system.NativeType("uint32_t const *") java.nio.IntBuffer r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkVideoDecodeAV1PictureInfoKHR.npTileOffsets(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkVideoDecodeAV1PictureInfoKHR.Buffer pTileSizes(@org.lwjgl.system.NativeType("uint32_t const *") java.nio.IntBuffer r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkVideoDecodeAV1PictureInfoKHR.npTileSizes(r0, r1)
                r0 = r4
                return r0
        }

        @Override // org.lwjgl.system.StructBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.Struct getElementFactory() {
                r2 = this;
                r0 = r2
                org.lwjgl.vulkan.VkVideoDecodeAV1PictureInfoKHR r0 = r0.getElementFactory()
                return r0
        }

        /* JADX INFO: renamed from: create, reason: collision with other method in class */
        protected /* bridge */ /* synthetic */ org.lwjgl.system.CustomBuffer m6950create(long r10, java.nio.ByteBuffer r12, int r13, int r14, int r15, int r16) {
                r9 = this;
                r0 = r9
                r1 = r10
                r2 = r12
                r3 = r13
                r4 = r14
                r5 = r15
                r6 = r16
                org.lwjgl.vulkan.VkVideoDecodeAV1PictureInfoKHR$Buffer r0 = r0.create(r1, r2, r3, r4, r5, r6)
                return r0
        }

        @Override // org.lwjgl.system.CustomBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.CustomBuffer self() {
                r2 = this;
                r0 = r2
                org.lwjgl.vulkan.VkVideoDecodeAV1PictureInfoKHR$Buffer r0 = r0.self()
                return r0
        }

        static {
                r0 = -1
                org.lwjgl.vulkan.VkVideoDecodeAV1PictureInfoKHR r0 = org.lwjgl.vulkan.VkVideoDecodeAV1PictureInfoKHR.create(r0)
                org.lwjgl.vulkan.VkVideoDecodeAV1PictureInfoKHR.Buffer.ELEMENT_FACTORY = r0
                return
        }
    }

    protected VkVideoDecodeAV1PictureInfoKHR(long r6, java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    protected org.lwjgl.vulkan.VkVideoDecodeAV1PictureInfoKHR create(long r7, java.nio.ByteBuffer r9) {
            r6 = this;
            org.lwjgl.vulkan.VkVideoDecodeAV1PictureInfoKHR r0 = new org.lwjgl.vulkan.VkVideoDecodeAV1PictureInfoKHR
            r1 = r0
            r2 = r7
            r3 = r9
            r1.<init>(r2, r3)
            return r0
    }

    public VkVideoDecodeAV1PictureInfoKHR(java.nio.ByteBuffer r7) {
            r6 = this;
            r0 = r6
            r1 = r7
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkVideoDecodeAV1PictureInfoKHR.SIZEOF
            java.nio.ByteBuffer r2 = __checkContainer(r2, r3)
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
            r2 = this;
            int r0 = org.lwjgl.vulkan.VkVideoDecodeAV1PictureInfoKHR.SIZEOF
            return r0
    }

    @org.lwjgl.system.NativeType("VkStructureType")
    public int sType() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nsType(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("void const *")
    public long pNext() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            long r0 = npNext(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("StdVideoDecodeAV1PictureInfo const *")
    public org.lwjgl.vulkan.video.StdVideoDecodeAV1PictureInfo pStdPictureInfo() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            org.lwjgl.vulkan.video.StdVideoDecodeAV1PictureInfo r0 = npStdPictureInfo(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("int32_t[VK_MAX_VIDEO_AV1_REFERENCES_PER_FRAME_KHR]")
    public java.nio.IntBuffer referenceNameSlotIndices() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            java.nio.IntBuffer r0 = nreferenceNameSlotIndices(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("int32_t")
    public int referenceNameSlotIndices(int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            int r0 = nreferenceNameSlotIndices(r0, r1)
            return r0
    }

    @org.lwjgl.system.NativeType("uint32_t")
    public int frameHeaderOffset() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nframeHeaderOffset(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("uint32_t")
    public int tileCount() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = ntileCount(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("uint32_t const *")
    public java.nio.IntBuffer pTileOffsets() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            java.nio.IntBuffer r0 = npTileOffsets(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("uint32_t const *")
    public java.nio.IntBuffer pTileSizes() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            java.nio.IntBuffer r0 = npTileSizes(r0)
            return r0
    }

    public org.lwjgl.vulkan.VkVideoDecodeAV1PictureInfoKHR sType(@org.lwjgl.system.NativeType("VkStructureType") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nsType(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkVideoDecodeAV1PictureInfoKHR sType$Default() {
            r3 = this;
            r0 = r3
            r1 = 1000512001(0x3ba29a01, float:0.0049622064)
            org.lwjgl.vulkan.VkVideoDecodeAV1PictureInfoKHR r0 = r0.sType(r1)
            return r0
    }

    public org.lwjgl.vulkan.VkVideoDecodeAV1PictureInfoKHR pNext(@org.lwjgl.system.NativeType("void const *") long r6) {
            r5 = this;
            r0 = r5
            long r0 = r0.address()
            r1 = r6
            npNext(r0, r1)
            r0 = r5
            return r0
    }

    public org.lwjgl.vulkan.VkVideoDecodeAV1PictureInfoKHR pStdPictureInfo(@org.lwjgl.system.NativeType("StdVideoDecodeAV1PictureInfo const *") org.lwjgl.vulkan.video.StdVideoDecodeAV1PictureInfo r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            npStdPictureInfo(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkVideoDecodeAV1PictureInfoKHR referenceNameSlotIndices(@org.lwjgl.system.NativeType("int32_t[VK_MAX_VIDEO_AV1_REFERENCES_PER_FRAME_KHR]") java.nio.IntBuffer r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nreferenceNameSlotIndices(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkVideoDecodeAV1PictureInfoKHR referenceNameSlotIndices(int r6, @org.lwjgl.system.NativeType("int32_t") int r7) {
            r5 = this;
            r0 = r5
            long r0 = r0.address()
            r1 = r6
            r2 = r7
            nreferenceNameSlotIndices(r0, r1, r2)
            r0 = r5
            return r0
    }

    public org.lwjgl.vulkan.VkVideoDecodeAV1PictureInfoKHR frameHeaderOffset(@org.lwjgl.system.NativeType("uint32_t") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nframeHeaderOffset(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkVideoDecodeAV1PictureInfoKHR tileCount(@org.lwjgl.system.NativeType("uint32_t") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            ntileCount(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkVideoDecodeAV1PictureInfoKHR pTileOffsets(@org.lwjgl.system.NativeType("uint32_t const *") java.nio.IntBuffer r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            npTileOffsets(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkVideoDecodeAV1PictureInfoKHR pTileSizes(@org.lwjgl.system.NativeType("uint32_t const *") java.nio.IntBuffer r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            npTileSizes(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkVideoDecodeAV1PictureInfoKHR set(int r5, long r6, org.lwjgl.vulkan.video.StdVideoDecodeAV1PictureInfo r8, java.nio.IntBuffer r9, int r10, int r11, java.nio.IntBuffer r12, java.nio.IntBuffer r13) {
            r4 = this;
            r0 = r4
            r1 = r5
            org.lwjgl.vulkan.VkVideoDecodeAV1PictureInfoKHR r0 = r0.sType(r1)
            r0 = r4
            r1 = r6
            org.lwjgl.vulkan.VkVideoDecodeAV1PictureInfoKHR r0 = r0.pNext(r1)
            r0 = r4
            r1 = r8
            org.lwjgl.vulkan.VkVideoDecodeAV1PictureInfoKHR r0 = r0.pStdPictureInfo(r1)
            r0 = r4
            r1 = r9
            org.lwjgl.vulkan.VkVideoDecodeAV1PictureInfoKHR r0 = r0.referenceNameSlotIndices(r1)
            r0 = r4
            r1 = r10
            org.lwjgl.vulkan.VkVideoDecodeAV1PictureInfoKHR r0 = r0.frameHeaderOffset(r1)
            r0 = r4
            r1 = r11
            org.lwjgl.vulkan.VkVideoDecodeAV1PictureInfoKHR r0 = r0.tileCount(r1)
            r0 = r4
            r1 = r12
            org.lwjgl.vulkan.VkVideoDecodeAV1PictureInfoKHR r0 = r0.pTileOffsets(r1)
            r0 = r4
            r1 = r13
            org.lwjgl.vulkan.VkVideoDecodeAV1PictureInfoKHR r0 = r0.pTileSizes(r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkVideoDecodeAV1PictureInfoKHR set(org.lwjgl.vulkan.VkVideoDecodeAV1PictureInfoKHR r8) {
            r7 = this;
            r0 = r8
            long r0 = r0.address()
            r1 = r7
            long r1 = r1.address()
            int r2 = org.lwjgl.vulkan.VkVideoDecodeAV1PictureInfoKHR.SIZEOF
            long r2 = (long) r2
            org.lwjgl.system.MemoryUtil.memCopy(r0, r1, r2)
            r0 = r7
            return r0
    }

    public static org.lwjgl.vulkan.VkVideoDecodeAV1PictureInfoKHR malloc() {
            org.lwjgl.vulkan.VkVideoDecodeAV1PictureInfoKHR r0 = new org.lwjgl.vulkan.VkVideoDecodeAV1PictureInfoKHR
            r1 = r0
            int r2 = org.lwjgl.vulkan.VkVideoDecodeAV1PictureInfoKHR.SIZEOF
            long r2 = (long) r2
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkVideoDecodeAV1PictureInfoKHR calloc() {
            org.lwjgl.vulkan.VkVideoDecodeAV1PictureInfoKHR r0 = new org.lwjgl.vulkan.VkVideoDecodeAV1PictureInfoKHR
            r1 = r0
            r2 = 1
            int r3 = org.lwjgl.vulkan.VkVideoDecodeAV1PictureInfoKHR.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkVideoDecodeAV1PictureInfoKHR create() {
            int r0 = org.lwjgl.vulkan.VkVideoDecodeAV1PictureInfoKHR.SIZEOF
            java.nio.ByteBuffer r0 = org.lwjgl.BufferUtils.createByteBuffer(r0)
            r6 = r0
            org.lwjgl.vulkan.VkVideoDecodeAV1PictureInfoKHR r0 = new org.lwjgl.vulkan.VkVideoDecodeAV1PictureInfoKHR
            r1 = r0
            r2 = r6
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkVideoDecodeAV1PictureInfoKHR create(long r6) {
            org.lwjgl.vulkan.VkVideoDecodeAV1PictureInfoKHR r0 = new org.lwjgl.vulkan.VkVideoDecodeAV1PictureInfoKHR
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkVideoDecodeAV1PictureInfoKHR createSafe(long r6) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.vulkan.VkVideoDecodeAV1PictureInfoKHR r0 = new org.lwjgl.vulkan.VkVideoDecodeAV1PictureInfoKHR
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static org.lwjgl.vulkan.VkVideoDecodeAV1PictureInfoKHR.Buffer malloc(int r6) {
            org.lwjgl.vulkan.VkVideoDecodeAV1PictureInfoKHR$Buffer r0 = new org.lwjgl.vulkan.VkVideoDecodeAV1PictureInfoKHR$Buffer
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.vulkan.VkVideoDecodeAV1PictureInfoKHR.SIZEOF
            long r2 = __checkMalloc(r2, r3)
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkVideoDecodeAV1PictureInfoKHR.Buffer calloc(int r7) {
            org.lwjgl.vulkan.VkVideoDecodeAV1PictureInfoKHR$Buffer r0 = new org.lwjgl.vulkan.VkVideoDecodeAV1PictureInfoKHR$Buffer
            r1 = r0
            r2 = r7
            long r2 = (long) r2
            int r3 = org.lwjgl.vulkan.VkVideoDecodeAV1PictureInfoKHR.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkVideoDecodeAV1PictureInfoKHR.Buffer create(int r10) {
            r0 = r10
            int r1 = org.lwjgl.vulkan.VkVideoDecodeAV1PictureInfoKHR.SIZEOF
            java.nio.ByteBuffer r0 = __create(r0, r1)
            r11 = r0
            org.lwjgl.vulkan.VkVideoDecodeAV1PictureInfoKHR$Buffer r0 = new org.lwjgl.vulkan.VkVideoDecodeAV1PictureInfoKHR$Buffer
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

    public static org.lwjgl.vulkan.VkVideoDecodeAV1PictureInfoKHR.Buffer create(long r6, int r8) {
            org.lwjgl.vulkan.VkVideoDecodeAV1PictureInfoKHR$Buffer r0 = new org.lwjgl.vulkan.VkVideoDecodeAV1PictureInfoKHR$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkVideoDecodeAV1PictureInfoKHR.Buffer createSafe(long r6, int r8) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.vulkan.VkVideoDecodeAV1PictureInfoKHR$Buffer r0 = new org.lwjgl.vulkan.VkVideoDecodeAV1PictureInfoKHR$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static org.lwjgl.vulkan.VkVideoDecodeAV1PictureInfoKHR malloc(org.lwjgl.system.MemoryStack r6) {
            org.lwjgl.vulkan.VkVideoDecodeAV1PictureInfoKHR r0 = new org.lwjgl.vulkan.VkVideoDecodeAV1PictureInfoKHR
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.vulkan.VkVideoDecodeAV1PictureInfoKHR.ALIGNOF
            int r4 = org.lwjgl.vulkan.VkVideoDecodeAV1PictureInfoKHR.SIZEOF
            long r2 = r2.nmalloc(r3, r4)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkVideoDecodeAV1PictureInfoKHR calloc(org.lwjgl.system.MemoryStack r7) {
            org.lwjgl.vulkan.VkVideoDecodeAV1PictureInfoKHR r0 = new org.lwjgl.vulkan.VkVideoDecodeAV1PictureInfoKHR
            r1 = r0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkVideoDecodeAV1PictureInfoKHR.ALIGNOF
            r4 = 1
            int r5 = org.lwjgl.vulkan.VkVideoDecodeAV1PictureInfoKHR.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkVideoDecodeAV1PictureInfoKHR.Buffer malloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.vulkan.VkVideoDecodeAV1PictureInfoKHR$Buffer r0 = new org.lwjgl.vulkan.VkVideoDecodeAV1PictureInfoKHR$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.vulkan.VkVideoDecodeAV1PictureInfoKHR.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.vulkan.VkVideoDecodeAV1PictureInfoKHR.SIZEOF
            int r4 = r4 * r5
            long r2 = r2.nmalloc(r3, r4)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkVideoDecodeAV1PictureInfoKHR.Buffer calloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.vulkan.VkVideoDecodeAV1PictureInfoKHR$Buffer r0 = new org.lwjgl.vulkan.VkVideoDecodeAV1PictureInfoKHR$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.vulkan.VkVideoDecodeAV1PictureInfoKHR.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.vulkan.VkVideoDecodeAV1PictureInfoKHR.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static int nsType(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkVideoDecodeAV1PictureInfoKHR.STYPE
            long r1 = (long) r1
            long r0 = r0 + r1
            int r0 = org.lwjgl.system.MemoryUtil.memGetInt(r0)
            return r0
    }

    public static long npNext(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkVideoDecodeAV1PictureInfoKHR.PNEXT
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            return r0
    }

    public static org.lwjgl.vulkan.video.StdVideoDecodeAV1PictureInfo npStdPictureInfo(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkVideoDecodeAV1PictureInfoKHR.PSTDPICTUREINFO
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            org.lwjgl.vulkan.video.StdVideoDecodeAV1PictureInfo r0 = org.lwjgl.vulkan.video.StdVideoDecodeAV1PictureInfo.create(r0)
            return r0
    }

    public static java.nio.IntBuffer nreferenceNameSlotIndices(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkVideoDecodeAV1PictureInfoKHR.REFERENCENAMESLOTINDICES
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = 7
            java.nio.IntBuffer r0 = org.lwjgl.system.MemoryUtil.memIntBuffer(r0, r1)
            return r0
    }

    public static int nreferenceNameSlotIndices(long r7, int r9) {
            r0 = r7
            int r1 = org.lwjgl.vulkan.VkVideoDecodeAV1PictureInfoKHR.REFERENCENAMESLOTINDICES
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r9
            r2 = 7
            long r1 = org.lwjgl.system.Checks.check(r1, r2)
            r2 = 4
            long r1 = r1 * r2
            long r0 = r0 + r1
            int r0 = org.lwjgl.system.MemoryUtil.memGetInt(r0)
            return r0
    }

    public static int nframeHeaderOffset(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkVideoDecodeAV1PictureInfoKHR.FRAMEHEADEROFFSET
            long r1 = (long) r1
            long r0 = r0 + r1
            int r0 = org.lwjgl.system.MemoryUtil.memGetInt(r0)
            return r0
    }

    public static int ntileCount(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkVideoDecodeAV1PictureInfoKHR.TILECOUNT
            long r1 = (long) r1
            long r0 = r0 + r1
            int r0 = org.lwjgl.system.MemoryUtil.memGetInt(r0)
            return r0
    }

    public static java.nio.IntBuffer npTileOffsets(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkVideoDecodeAV1PictureInfoKHR.PTILEOFFSETS
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            r1 = r5
            int r1 = ntileCount(r1)
            java.nio.IntBuffer r0 = org.lwjgl.system.MemoryUtil.memIntBuffer(r0, r1)
            return r0
    }

    public static java.nio.IntBuffer npTileSizes(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkVideoDecodeAV1PictureInfoKHR.PTILESIZES
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            r1 = r5
            int r1 = ntileCount(r1)
            java.nio.IntBuffer r0 = org.lwjgl.system.MemoryUtil.memIntBuffer(r0, r1)
            return r0
    }

    public static void nsType(long r5, int r7) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkVideoDecodeAV1PictureInfoKHR.STYPE
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            org.lwjgl.system.MemoryUtil.memPutInt(r0, r1)
            return
    }

    public static void npNext(long r5, long r7) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkVideoDecodeAV1PictureInfoKHR.PNEXT
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            org.lwjgl.system.MemoryUtil.memPutAddress(r0, r1)
            return
    }

    public static void npStdPictureInfo(long r5, org.lwjgl.vulkan.video.StdVideoDecodeAV1PictureInfo r7) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkVideoDecodeAV1PictureInfoKHR.PSTDPICTUREINFO
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            long r1 = r1.address()
            org.lwjgl.system.MemoryUtil.memPutAddress(r0, r1)
            return
    }

    public static void nreferenceNameSlotIndices(long r7, java.nio.IntBuffer r9) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lc
            r0 = r9
            r1 = 7
            org.lwjgl.system.Checks.checkGT(r0, r1)
        Lc:
            r0 = r9
            long r0 = org.lwjgl.system.MemoryUtil.memAddress(r0)
            r1 = r7
            int r2 = org.lwjgl.vulkan.VkVideoDecodeAV1PictureInfoKHR.REFERENCENAMESLOTINDICES
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

    public static void nreferenceNameSlotIndices(long r7, int r9, int r10) {
            r0 = r7
            int r1 = org.lwjgl.vulkan.VkVideoDecodeAV1PictureInfoKHR.REFERENCENAMESLOTINDICES
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r9
            r2 = 7
            long r1 = org.lwjgl.system.Checks.check(r1, r2)
            r2 = 4
            long r1 = r1 * r2
            long r0 = r0 + r1
            r1 = r10
            org.lwjgl.system.MemoryUtil.memPutInt(r0, r1)
            return
    }

    public static void nframeHeaderOffset(long r5, int r7) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkVideoDecodeAV1PictureInfoKHR.FRAMEHEADEROFFSET
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            org.lwjgl.system.MemoryUtil.memPutInt(r0, r1)
            return
    }

    public static void ntileCount(long r5, int r7) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkVideoDecodeAV1PictureInfoKHR.TILECOUNT
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            org.lwjgl.system.MemoryUtil.memPutInt(r0, r1)
            return
    }

    public static void npTileOffsets(long r5, java.nio.IntBuffer r7) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkVideoDecodeAV1PictureInfoKHR.PTILEOFFSETS
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            org.lwjgl.system.MemoryUtil.memPutAddress(r0, r1)
            return
    }

    public static void npTileSizes(long r5, java.nio.IntBuffer r7) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkVideoDecodeAV1PictureInfoKHR.PTILESIZES
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            org.lwjgl.system.MemoryUtil.memPutAddress(r0, r1)
            return
    }

    public static void validate(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkVideoDecodeAV1PictureInfoKHR.PSTDPICTUREINFO
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            r7 = r0
            r0 = r7
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r7
            org.lwjgl.vulkan.video.StdVideoDecodeAV1PictureInfo.validate(r0)
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkVideoDecodeAV1PictureInfoKHR.PTILEOFFSETS
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkVideoDecodeAV1PictureInfoKHR.PTILESIZES
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
            org.lwjgl.vulkan.VkVideoDecodeAV1PictureInfoKHR r0 = r0.create(r1, r2)
            return r0
    }

    static {
            r0 = 8
            org.lwjgl.system.Struct$Member[] r0 = new org.lwjgl.system.Struct.Member[r0]
            r1 = r0
            r2 = 0
            r3 = 4
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 1
            int r3 = org.lwjgl.vulkan.VkVideoDecodeAV1PictureInfoKHR.POINTER_SIZE
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 2
            int r3 = org.lwjgl.vulkan.VkVideoDecodeAV1PictureInfoKHR.POINTER_SIZE
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 3
            r3 = 4
            r4 = 7
            org.lwjgl.system.Struct$Member r3 = __array(r3, r4)
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
            int r3 = org.lwjgl.vulkan.VkVideoDecodeAV1PictureInfoKHR.POINTER_SIZE
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 7
            int r3 = org.lwjgl.vulkan.VkVideoDecodeAV1PictureInfoKHR.POINTER_SIZE
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            org.lwjgl.system.Struct$Layout r0 = __struct(r0)
            r6 = r0
            r0 = r6
            int r0 = r0.getSize()
            org.lwjgl.vulkan.VkVideoDecodeAV1PictureInfoKHR.SIZEOF = r0
            r0 = r6
            int r0 = r0.getAlignment()
            org.lwjgl.vulkan.VkVideoDecodeAV1PictureInfoKHR.ALIGNOF = r0
            r0 = r6
            r1 = 0
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkVideoDecodeAV1PictureInfoKHR.STYPE = r0
            r0 = r6
            r1 = 1
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkVideoDecodeAV1PictureInfoKHR.PNEXT = r0
            r0 = r6
            r1 = 2
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkVideoDecodeAV1PictureInfoKHR.PSTDPICTUREINFO = r0
            r0 = r6
            r1 = 3
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkVideoDecodeAV1PictureInfoKHR.REFERENCENAMESLOTINDICES = r0
            r0 = r6
            r1 = 4
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkVideoDecodeAV1PictureInfoKHR.FRAMEHEADEROFFSET = r0
            r0 = r6
            r1 = 5
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkVideoDecodeAV1PictureInfoKHR.TILECOUNT = r0
            r0 = r6
            r1 = 6
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkVideoDecodeAV1PictureInfoKHR.PTILEOFFSETS = r0
            r0 = r6
            r1 = 7
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkVideoDecodeAV1PictureInfoKHR.PTILESIZES = r0
            return
    }
}
