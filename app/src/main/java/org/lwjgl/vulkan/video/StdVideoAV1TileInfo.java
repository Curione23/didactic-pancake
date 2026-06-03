package org.lwjgl.vulkan.video;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/video/StdVideoAV1TileInfo.class */
public class StdVideoAV1TileInfo extends org.lwjgl.system.Struct<org.lwjgl.vulkan.video.StdVideoAV1TileInfo> implements org.lwjgl.system.NativeResource {
    public static final int SIZEOF = 0;
    public static final int ALIGNOF = 0;
    public static final int FLAGS = 0;
    public static final int TILECOLS = 0;
    public static final int TILEROWS = 0;
    public static final int CONTEXT_UPDATE_TILE_ID = 0;
    public static final int TILE_SIZE_BYTES_MINUS_1 = 0;
    public static final int RESERVED1 = 0;
    public static final int PMICOLSTARTS = 0;
    public static final int PMIROWSTARTS = 0;
    public static final int PWIDTHINSBSMINUS1 = 0;
    public static final int PHEIGHTINSBSMINUS1 = 0;

    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/video/StdVideoAV1TileInfo$Buffer.class */
    public static class Buffer extends org.lwjgl.system.StructBuffer<org.lwjgl.vulkan.video.StdVideoAV1TileInfo, org.lwjgl.vulkan.video.StdVideoAV1TileInfo.Buffer> implements org.lwjgl.system.NativeResource {
        private static final org.lwjgl.vulkan.video.StdVideoAV1TileInfo ELEMENT_FACTORY = null;

        public Buffer(java.nio.ByteBuffer r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r6
                int r2 = r2.remaining()
                int r3 = org.lwjgl.vulkan.video.StdVideoAV1TileInfo.SIZEOF
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
        protected org.lwjgl.vulkan.video.StdVideoAV1TileInfo.Buffer self() {
                r2 = this;
                r0 = r2
                return r0
        }

        protected org.lwjgl.vulkan.video.StdVideoAV1TileInfo.Buffer create(long r11, java.nio.ByteBuffer r13, int r14, int r15, int r16, int r17) {
                r10 = this;
                org.lwjgl.vulkan.video.StdVideoAV1TileInfo$Buffer r0 = new org.lwjgl.vulkan.video.StdVideoAV1TileInfo$Buffer
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
        protected org.lwjgl.vulkan.video.StdVideoAV1TileInfo getElementFactory() {
                r2 = this;
                org.lwjgl.vulkan.video.StdVideoAV1TileInfo r0 = org.lwjgl.vulkan.video.StdVideoAV1TileInfo.Buffer.ELEMENT_FACTORY
                return r0
        }

        public org.lwjgl.vulkan.video.StdVideoAV1TileInfoFlag flags() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                org.lwjgl.vulkan.video.StdVideoAV1TileInfoFlag r0 = org.lwjgl.vulkan.video.StdVideoAV1TileInfo.nflags(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint8_t")
        public byte TileCols() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                byte r0 = org.lwjgl.vulkan.video.StdVideoAV1TileInfo.nTileCols(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint8_t")
        public byte TileRows() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                byte r0 = org.lwjgl.vulkan.video.StdVideoAV1TileInfo.nTileRows(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint16_t")
        public short context_update_tile_id() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                short r0 = org.lwjgl.vulkan.video.StdVideoAV1TileInfo.ncontext_update_tile_id(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint8_t")
        public byte tile_size_bytes_minus_1() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                byte r0 = org.lwjgl.vulkan.video.StdVideoAV1TileInfo.ntile_size_bytes_minus_1(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint16_t const *")
        public java.nio.ShortBuffer pMiColStarts() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                java.nio.ShortBuffer r0 = org.lwjgl.vulkan.video.StdVideoAV1TileInfo.npMiColStarts(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint16_t const *")
        public java.nio.ShortBuffer pMiRowStarts() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                java.nio.ShortBuffer r0 = org.lwjgl.vulkan.video.StdVideoAV1TileInfo.npMiRowStarts(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint16_t const *")
        public java.nio.ShortBuffer pWidthInSbsMinus1() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                java.nio.ShortBuffer r0 = org.lwjgl.vulkan.video.StdVideoAV1TileInfo.npWidthInSbsMinus1(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint16_t const *")
        public java.nio.ShortBuffer pHeightInSbsMinus1() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                java.nio.ShortBuffer r0 = org.lwjgl.vulkan.video.StdVideoAV1TileInfo.npHeightInSbsMinus1(r0)
                return r0
        }

        public org.lwjgl.vulkan.video.StdVideoAV1TileInfo.Buffer flags(org.lwjgl.vulkan.video.StdVideoAV1TileInfoFlag r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.video.StdVideoAV1TileInfo.nflags(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.video.StdVideoAV1TileInfo.Buffer flags(java.util.function.Consumer<org.lwjgl.vulkan.video.StdVideoAV1TileInfoFlag> r4) {
                r3 = this;
                r0 = r4
                r1 = r3
                org.lwjgl.vulkan.video.StdVideoAV1TileInfoFlag r1 = r1.flags()
                r0.accept(r1)
                r0 = r3
                return r0
        }

        public org.lwjgl.vulkan.video.StdVideoAV1TileInfo.Buffer TileCols(@org.lwjgl.system.NativeType("uint8_t") byte r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.video.StdVideoAV1TileInfo.nTileCols(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.video.StdVideoAV1TileInfo.Buffer TileRows(@org.lwjgl.system.NativeType("uint8_t") byte r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.video.StdVideoAV1TileInfo.nTileRows(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.video.StdVideoAV1TileInfo.Buffer context_update_tile_id(@org.lwjgl.system.NativeType("uint16_t") short r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.video.StdVideoAV1TileInfo.ncontext_update_tile_id(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.video.StdVideoAV1TileInfo.Buffer tile_size_bytes_minus_1(@org.lwjgl.system.NativeType("uint8_t") byte r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.video.StdVideoAV1TileInfo.ntile_size_bytes_minus_1(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.video.StdVideoAV1TileInfo.Buffer pMiColStarts(@org.lwjgl.system.NativeType("uint16_t const *") java.nio.ShortBuffer r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.video.StdVideoAV1TileInfo.npMiColStarts(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.video.StdVideoAV1TileInfo.Buffer pMiRowStarts(@org.lwjgl.system.NativeType("uint16_t const *") java.nio.ShortBuffer r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.video.StdVideoAV1TileInfo.npMiRowStarts(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.video.StdVideoAV1TileInfo.Buffer pWidthInSbsMinus1(@org.lwjgl.system.NativeType("uint16_t const *") java.nio.ShortBuffer r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.video.StdVideoAV1TileInfo.npWidthInSbsMinus1(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.video.StdVideoAV1TileInfo.Buffer pHeightInSbsMinus1(@org.lwjgl.system.NativeType("uint16_t const *") java.nio.ShortBuffer r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.video.StdVideoAV1TileInfo.npHeightInSbsMinus1(r0, r1)
                r0 = r4
                return r0
        }

        @Override // org.lwjgl.system.StructBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.Struct getElementFactory() {
                r2 = this;
                r0 = r2
                org.lwjgl.vulkan.video.StdVideoAV1TileInfo r0 = r0.getElementFactory()
                return r0
        }

        /* JADX INFO: renamed from: create, reason: collision with other method in class */
        protected /* bridge */ /* synthetic */ org.lwjgl.system.CustomBuffer m7376create(long r10, java.nio.ByteBuffer r12, int r13, int r14, int r15, int r16) {
                r9 = this;
                r0 = r9
                r1 = r10
                r2 = r12
                r3 = r13
                r4 = r14
                r5 = r15
                r6 = r16
                org.lwjgl.vulkan.video.StdVideoAV1TileInfo$Buffer r0 = r0.create(r1, r2, r3, r4, r5, r6)
                return r0
        }

        @Override // org.lwjgl.system.CustomBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.CustomBuffer self() {
                r2 = this;
                r0 = r2
                org.lwjgl.vulkan.video.StdVideoAV1TileInfo$Buffer r0 = r0.self()
                return r0
        }

        static {
                r0 = -1
                org.lwjgl.vulkan.video.StdVideoAV1TileInfo r0 = org.lwjgl.vulkan.video.StdVideoAV1TileInfo.create(r0)
                org.lwjgl.vulkan.video.StdVideoAV1TileInfo.Buffer.ELEMENT_FACTORY = r0
                return
        }
    }

    protected StdVideoAV1TileInfo(long r6, java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    protected org.lwjgl.vulkan.video.StdVideoAV1TileInfo create(long r7, java.nio.ByteBuffer r9) {
            r6 = this;
            org.lwjgl.vulkan.video.StdVideoAV1TileInfo r0 = new org.lwjgl.vulkan.video.StdVideoAV1TileInfo
            r1 = r0
            r2 = r7
            r3 = r9
            r1.<init>(r2, r3)
            return r0
    }

    public StdVideoAV1TileInfo(java.nio.ByteBuffer r7) {
            r6 = this;
            r0 = r6
            r1 = r7
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            r2 = r7
            int r3 = org.lwjgl.vulkan.video.StdVideoAV1TileInfo.SIZEOF
            java.nio.ByteBuffer r2 = __checkContainer(r2, r3)
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
            r2 = this;
            int r0 = org.lwjgl.vulkan.video.StdVideoAV1TileInfo.SIZEOF
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoAV1TileInfoFlag flags() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            org.lwjgl.vulkan.video.StdVideoAV1TileInfoFlag r0 = nflags(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("uint8_t")
    public byte TileCols() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            byte r0 = nTileCols(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("uint8_t")
    public byte TileRows() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            byte r0 = nTileRows(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("uint16_t")
    public short context_update_tile_id() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            short r0 = ncontext_update_tile_id(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("uint8_t")
    public byte tile_size_bytes_minus_1() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            byte r0 = ntile_size_bytes_minus_1(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("uint16_t const *")
    public java.nio.ShortBuffer pMiColStarts() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            java.nio.ShortBuffer r0 = npMiColStarts(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("uint16_t const *")
    public java.nio.ShortBuffer pMiRowStarts() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            java.nio.ShortBuffer r0 = npMiRowStarts(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("uint16_t const *")
    public java.nio.ShortBuffer pWidthInSbsMinus1() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            java.nio.ShortBuffer r0 = npWidthInSbsMinus1(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("uint16_t const *")
    public java.nio.ShortBuffer pHeightInSbsMinus1() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            java.nio.ShortBuffer r0 = npHeightInSbsMinus1(r0)
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoAV1TileInfo flags(org.lwjgl.vulkan.video.StdVideoAV1TileInfoFlag r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nflags(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoAV1TileInfo flags(java.util.function.Consumer<org.lwjgl.vulkan.video.StdVideoAV1TileInfoFlag> r4) {
            r3 = this;
            r0 = r4
            r1 = r3
            org.lwjgl.vulkan.video.StdVideoAV1TileInfoFlag r1 = r1.flags()
            r0.accept(r1)
            r0 = r3
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoAV1TileInfo TileCols(@org.lwjgl.system.NativeType("uint8_t") byte r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nTileCols(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoAV1TileInfo TileRows(@org.lwjgl.system.NativeType("uint8_t") byte r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nTileRows(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoAV1TileInfo context_update_tile_id(@org.lwjgl.system.NativeType("uint16_t") short r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            ncontext_update_tile_id(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoAV1TileInfo tile_size_bytes_minus_1(@org.lwjgl.system.NativeType("uint8_t") byte r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            ntile_size_bytes_minus_1(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoAV1TileInfo pMiColStarts(@org.lwjgl.system.NativeType("uint16_t const *") java.nio.ShortBuffer r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            npMiColStarts(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoAV1TileInfo pMiRowStarts(@org.lwjgl.system.NativeType("uint16_t const *") java.nio.ShortBuffer r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            npMiRowStarts(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoAV1TileInfo pWidthInSbsMinus1(@org.lwjgl.system.NativeType("uint16_t const *") java.nio.ShortBuffer r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            npWidthInSbsMinus1(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoAV1TileInfo pHeightInSbsMinus1(@org.lwjgl.system.NativeType("uint16_t const *") java.nio.ShortBuffer r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            npHeightInSbsMinus1(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoAV1TileInfo set(org.lwjgl.vulkan.video.StdVideoAV1TileInfoFlag r4, byte r5, byte r6, short r7, byte r8, java.nio.ShortBuffer r9, java.nio.ShortBuffer r10, java.nio.ShortBuffer r11, java.nio.ShortBuffer r12) {
            r3 = this;
            r0 = r3
            r1 = r4
            org.lwjgl.vulkan.video.StdVideoAV1TileInfo r0 = r0.flags(r1)
            r0 = r3
            r1 = r5
            org.lwjgl.vulkan.video.StdVideoAV1TileInfo r0 = r0.TileCols(r1)
            r0 = r3
            r1 = r6
            org.lwjgl.vulkan.video.StdVideoAV1TileInfo r0 = r0.TileRows(r1)
            r0 = r3
            r1 = r7
            org.lwjgl.vulkan.video.StdVideoAV1TileInfo r0 = r0.context_update_tile_id(r1)
            r0 = r3
            r1 = r8
            org.lwjgl.vulkan.video.StdVideoAV1TileInfo r0 = r0.tile_size_bytes_minus_1(r1)
            r0 = r3
            r1 = r9
            org.lwjgl.vulkan.video.StdVideoAV1TileInfo r0 = r0.pMiColStarts(r1)
            r0 = r3
            r1 = r10
            org.lwjgl.vulkan.video.StdVideoAV1TileInfo r0 = r0.pMiRowStarts(r1)
            r0 = r3
            r1 = r11
            org.lwjgl.vulkan.video.StdVideoAV1TileInfo r0 = r0.pWidthInSbsMinus1(r1)
            r0 = r3
            r1 = r12
            org.lwjgl.vulkan.video.StdVideoAV1TileInfo r0 = r0.pHeightInSbsMinus1(r1)
            r0 = r3
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoAV1TileInfo set(org.lwjgl.vulkan.video.StdVideoAV1TileInfo r8) {
            r7 = this;
            r0 = r8
            long r0 = r0.address()
            r1 = r7
            long r1 = r1.address()
            int r2 = org.lwjgl.vulkan.video.StdVideoAV1TileInfo.SIZEOF
            long r2 = (long) r2
            org.lwjgl.system.MemoryUtil.memCopy(r0, r1, r2)
            r0 = r7
            return r0
    }

    public static org.lwjgl.vulkan.video.StdVideoAV1TileInfo malloc() {
            org.lwjgl.vulkan.video.StdVideoAV1TileInfo r0 = new org.lwjgl.vulkan.video.StdVideoAV1TileInfo
            r1 = r0
            int r2 = org.lwjgl.vulkan.video.StdVideoAV1TileInfo.SIZEOF
            long r2 = (long) r2
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.video.StdVideoAV1TileInfo calloc() {
            org.lwjgl.vulkan.video.StdVideoAV1TileInfo r0 = new org.lwjgl.vulkan.video.StdVideoAV1TileInfo
            r1 = r0
            r2 = 1
            int r3 = org.lwjgl.vulkan.video.StdVideoAV1TileInfo.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.video.StdVideoAV1TileInfo create() {
            int r0 = org.lwjgl.vulkan.video.StdVideoAV1TileInfo.SIZEOF
            java.nio.ByteBuffer r0 = org.lwjgl.BufferUtils.createByteBuffer(r0)
            r6 = r0
            org.lwjgl.vulkan.video.StdVideoAV1TileInfo r0 = new org.lwjgl.vulkan.video.StdVideoAV1TileInfo
            r1 = r0
            r2 = r6
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.video.StdVideoAV1TileInfo create(long r6) {
            org.lwjgl.vulkan.video.StdVideoAV1TileInfo r0 = new org.lwjgl.vulkan.video.StdVideoAV1TileInfo
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.video.StdVideoAV1TileInfo createSafe(long r6) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.vulkan.video.StdVideoAV1TileInfo r0 = new org.lwjgl.vulkan.video.StdVideoAV1TileInfo
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static org.lwjgl.vulkan.video.StdVideoAV1TileInfo.Buffer malloc(int r6) {
            org.lwjgl.vulkan.video.StdVideoAV1TileInfo$Buffer r0 = new org.lwjgl.vulkan.video.StdVideoAV1TileInfo$Buffer
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.vulkan.video.StdVideoAV1TileInfo.SIZEOF
            long r2 = __checkMalloc(r2, r3)
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.video.StdVideoAV1TileInfo.Buffer calloc(int r7) {
            org.lwjgl.vulkan.video.StdVideoAV1TileInfo$Buffer r0 = new org.lwjgl.vulkan.video.StdVideoAV1TileInfo$Buffer
            r1 = r0
            r2 = r7
            long r2 = (long) r2
            int r3 = org.lwjgl.vulkan.video.StdVideoAV1TileInfo.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.video.StdVideoAV1TileInfo.Buffer create(int r10) {
            r0 = r10
            int r1 = org.lwjgl.vulkan.video.StdVideoAV1TileInfo.SIZEOF
            java.nio.ByteBuffer r0 = __create(r0, r1)
            r11 = r0
            org.lwjgl.vulkan.video.StdVideoAV1TileInfo$Buffer r0 = new org.lwjgl.vulkan.video.StdVideoAV1TileInfo$Buffer
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

    public static org.lwjgl.vulkan.video.StdVideoAV1TileInfo.Buffer create(long r6, int r8) {
            org.lwjgl.vulkan.video.StdVideoAV1TileInfo$Buffer r0 = new org.lwjgl.vulkan.video.StdVideoAV1TileInfo$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.video.StdVideoAV1TileInfo.Buffer createSafe(long r6, int r8) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.vulkan.video.StdVideoAV1TileInfo$Buffer r0 = new org.lwjgl.vulkan.video.StdVideoAV1TileInfo$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static org.lwjgl.vulkan.video.StdVideoAV1TileInfo malloc(org.lwjgl.system.MemoryStack r6) {
            org.lwjgl.vulkan.video.StdVideoAV1TileInfo r0 = new org.lwjgl.vulkan.video.StdVideoAV1TileInfo
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.vulkan.video.StdVideoAV1TileInfo.ALIGNOF
            int r4 = org.lwjgl.vulkan.video.StdVideoAV1TileInfo.SIZEOF
            long r2 = r2.nmalloc(r3, r4)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.video.StdVideoAV1TileInfo calloc(org.lwjgl.system.MemoryStack r7) {
            org.lwjgl.vulkan.video.StdVideoAV1TileInfo r0 = new org.lwjgl.vulkan.video.StdVideoAV1TileInfo
            r1 = r0
            r2 = r7
            int r3 = org.lwjgl.vulkan.video.StdVideoAV1TileInfo.ALIGNOF
            r4 = 1
            int r5 = org.lwjgl.vulkan.video.StdVideoAV1TileInfo.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.video.StdVideoAV1TileInfo.Buffer malloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.vulkan.video.StdVideoAV1TileInfo$Buffer r0 = new org.lwjgl.vulkan.video.StdVideoAV1TileInfo$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.vulkan.video.StdVideoAV1TileInfo.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.vulkan.video.StdVideoAV1TileInfo.SIZEOF
            int r4 = r4 * r5
            long r2 = r2.nmalloc(r3, r4)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.video.StdVideoAV1TileInfo.Buffer calloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.vulkan.video.StdVideoAV1TileInfo$Buffer r0 = new org.lwjgl.vulkan.video.StdVideoAV1TileInfo$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.vulkan.video.StdVideoAV1TileInfo.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.vulkan.video.StdVideoAV1TileInfo.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.video.StdVideoAV1TileInfoFlag nflags(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.video.StdVideoAV1TileInfo.FLAGS
            long r1 = (long) r1
            long r0 = r0 + r1
            org.lwjgl.vulkan.video.StdVideoAV1TileInfoFlag r0 = org.lwjgl.vulkan.video.StdVideoAV1TileInfoFlag.create(r0)
            return r0
    }

    public static byte nTileCols(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.video.StdVideoAV1TileInfo.TILECOLS
            long r1 = (long) r1
            long r0 = r0 + r1
            byte r0 = org.lwjgl.system.MemoryUtil.memGetByte(r0)
            return r0
    }

    public static byte nTileRows(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.video.StdVideoAV1TileInfo.TILEROWS
            long r1 = (long) r1
            long r0 = r0 + r1
            byte r0 = org.lwjgl.system.MemoryUtil.memGetByte(r0)
            return r0
    }

    public static short ncontext_update_tile_id(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.video.StdVideoAV1TileInfo.CONTEXT_UPDATE_TILE_ID
            long r1 = (long) r1
            long r0 = r0 + r1
            short r0 = org.lwjgl.system.MemoryUtil.memGetShort(r0)
            return r0
    }

    public static byte ntile_size_bytes_minus_1(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.video.StdVideoAV1TileInfo.TILE_SIZE_BYTES_MINUS_1
            long r1 = (long) r1
            long r0 = r0 + r1
            byte r0 = org.lwjgl.system.MemoryUtil.memGetByte(r0)
            return r0
    }

    public static java.nio.ByteBuffer nreserved1(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.video.StdVideoAV1TileInfo.RESERVED1
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = 7
            java.nio.ByteBuffer r0 = org.lwjgl.system.MemoryUtil.memByteBuffer(r0, r1)
            return r0
    }

    public static byte nreserved1(long r7, int r9) {
            r0 = r7
            int r1 = org.lwjgl.vulkan.video.StdVideoAV1TileInfo.RESERVED1
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r9
            r2 = 7
            long r1 = org.lwjgl.system.Checks.check(r1, r2)
            r2 = 1
            long r1 = r1 * r2
            long r0 = r0 + r1
            byte r0 = org.lwjgl.system.MemoryUtil.memGetByte(r0)
            return r0
    }

    public static java.nio.ShortBuffer npMiColStarts(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.video.StdVideoAV1TileInfo.PMICOLSTARTS
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            r1 = r5
            byte r1 = nTileCols(r1)
            int r1 = java.lang.Byte.toUnsignedInt(r1)
            java.nio.ShortBuffer r0 = org.lwjgl.system.MemoryUtil.memShortBuffer(r0, r1)
            return r0
    }

    public static java.nio.ShortBuffer npMiRowStarts(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.video.StdVideoAV1TileInfo.PMIROWSTARTS
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            r1 = r5
            byte r1 = nTileRows(r1)
            int r1 = java.lang.Byte.toUnsignedInt(r1)
            java.nio.ShortBuffer r0 = org.lwjgl.system.MemoryUtil.memShortBuffer(r0, r1)
            return r0
    }

    public static java.nio.ShortBuffer npWidthInSbsMinus1(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.video.StdVideoAV1TileInfo.PWIDTHINSBSMINUS1
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            r1 = r5
            byte r1 = nTileCols(r1)
            int r1 = java.lang.Byte.toUnsignedInt(r1)
            java.nio.ShortBuffer r0 = org.lwjgl.system.MemoryUtil.memShortBuffer(r0, r1)
            return r0
    }

    public static java.nio.ShortBuffer npHeightInSbsMinus1(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.video.StdVideoAV1TileInfo.PHEIGHTINSBSMINUS1
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            r1 = r5
            byte r1 = nTileRows(r1)
            int r1 = java.lang.Byte.toUnsignedInt(r1)
            java.nio.ShortBuffer r0 = org.lwjgl.system.MemoryUtil.memShortBuffer(r0, r1)
            return r0
    }

    public static void nflags(long r7, org.lwjgl.vulkan.video.StdVideoAV1TileInfoFlag r9) {
            r0 = r9
            long r0 = r0.address()
            r1 = r7
            int r2 = org.lwjgl.vulkan.video.StdVideoAV1TileInfo.FLAGS
            long r2 = (long) r2
            long r1 = r1 + r2
            int r2 = org.lwjgl.vulkan.video.StdVideoAV1TileInfoFlag.SIZEOF
            long r2 = (long) r2
            org.lwjgl.system.MemoryUtil.memCopy(r0, r1, r2)
            return
    }

    public static void nTileCols(long r5, byte r7) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.video.StdVideoAV1TileInfo.TILECOLS
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            org.lwjgl.system.MemoryUtil.memPutByte(r0, r1)
            return
    }

    public static void nTileRows(long r5, byte r7) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.video.StdVideoAV1TileInfo.TILEROWS
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            org.lwjgl.system.MemoryUtil.memPutByte(r0, r1)
            return
    }

    public static void ncontext_update_tile_id(long r5, short r7) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.video.StdVideoAV1TileInfo.CONTEXT_UPDATE_TILE_ID
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            org.lwjgl.system.MemoryUtil.memPutShort(r0, r1)
            return
    }

    public static void ntile_size_bytes_minus_1(long r5, byte r7) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.video.StdVideoAV1TileInfo.TILE_SIZE_BYTES_MINUS_1
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            org.lwjgl.system.MemoryUtil.memPutByte(r0, r1)
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
            int r2 = org.lwjgl.vulkan.video.StdVideoAV1TileInfo.RESERVED1
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
            int r1 = org.lwjgl.vulkan.video.StdVideoAV1TileInfo.RESERVED1
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r9
            r2 = 7
            long r1 = org.lwjgl.system.Checks.check(r1, r2)
            r2 = 1
            long r1 = r1 * r2
            long r0 = r0 + r1
            r1 = r10
            org.lwjgl.system.MemoryUtil.memPutByte(r0, r1)
            return
    }

    public static void npMiColStarts(long r5, java.nio.ShortBuffer r7) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.video.StdVideoAV1TileInfo.PMICOLSTARTS
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            org.lwjgl.system.MemoryUtil.memPutAddress(r0, r1)
            return
    }

    public static void npMiRowStarts(long r5, java.nio.ShortBuffer r7) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.video.StdVideoAV1TileInfo.PMIROWSTARTS
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            org.lwjgl.system.MemoryUtil.memPutAddress(r0, r1)
            return
    }

    public static void npWidthInSbsMinus1(long r5, java.nio.ShortBuffer r7) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.video.StdVideoAV1TileInfo.PWIDTHINSBSMINUS1
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            org.lwjgl.system.MemoryUtil.memPutAddress(r0, r1)
            return
    }

    public static void npHeightInSbsMinus1(long r5, java.nio.ShortBuffer r7) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.video.StdVideoAV1TileInfo.PHEIGHTINSBSMINUS1
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            org.lwjgl.system.MemoryUtil.memPutAddress(r0, r1)
            return
    }

    public static void validate(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.video.StdVideoAV1TileInfo.PMICOLSTARTS
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r5
            int r1 = org.lwjgl.vulkan.video.StdVideoAV1TileInfo.PMIROWSTARTS
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r5
            int r1 = org.lwjgl.vulkan.video.StdVideoAV1TileInfo.PWIDTHINSBSMINUS1
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r5
            int r1 = org.lwjgl.vulkan.video.StdVideoAV1TileInfo.PHEIGHTINSBSMINUS1
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
            org.lwjgl.vulkan.video.StdVideoAV1TileInfo r0 = r0.create(r1, r2)
            return r0
    }

    static {
            r0 = 10
            org.lwjgl.system.Struct$Member[] r0 = new org.lwjgl.system.Struct.Member[r0]
            r1 = r0
            r2 = 0
            int r3 = org.lwjgl.vulkan.video.StdVideoAV1TileInfoFlag.SIZEOF
            int r4 = org.lwjgl.vulkan.video.StdVideoAV1TileInfoFlag.ALIGNOF
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
            r3 = 1
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 5
            r3 = 1
            r4 = 7
            org.lwjgl.system.Struct$Member r3 = __array(r3, r4)
            r1[r2] = r3
            r1 = r0
            r2 = 6
            int r3 = org.lwjgl.vulkan.video.StdVideoAV1TileInfo.POINTER_SIZE
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 7
            int r3 = org.lwjgl.vulkan.video.StdVideoAV1TileInfo.POINTER_SIZE
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 8
            int r3 = org.lwjgl.vulkan.video.StdVideoAV1TileInfo.POINTER_SIZE
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 9
            int r3 = org.lwjgl.vulkan.video.StdVideoAV1TileInfo.POINTER_SIZE
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            org.lwjgl.system.Struct$Layout r0 = __struct(r0)
            r6 = r0
            r0 = r6
            int r0 = r0.getSize()
            org.lwjgl.vulkan.video.StdVideoAV1TileInfo.SIZEOF = r0
            r0 = r6
            int r0 = r0.getAlignment()
            org.lwjgl.vulkan.video.StdVideoAV1TileInfo.ALIGNOF = r0
            r0 = r6
            r1 = 0
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.video.StdVideoAV1TileInfo.FLAGS = r0
            r0 = r6
            r1 = 1
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.video.StdVideoAV1TileInfo.TILECOLS = r0
            r0 = r6
            r1 = 2
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.video.StdVideoAV1TileInfo.TILEROWS = r0
            r0 = r6
            r1 = 3
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.video.StdVideoAV1TileInfo.CONTEXT_UPDATE_TILE_ID = r0
            r0 = r6
            r1 = 4
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.video.StdVideoAV1TileInfo.TILE_SIZE_BYTES_MINUS_1 = r0
            r0 = r6
            r1 = 5
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.video.StdVideoAV1TileInfo.RESERVED1 = r0
            r0 = r6
            r1 = 6
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.video.StdVideoAV1TileInfo.PMICOLSTARTS = r0
            r0 = r6
            r1 = 7
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.video.StdVideoAV1TileInfo.PMIROWSTARTS = r0
            r0 = r6
            r1 = 8
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.video.StdVideoAV1TileInfo.PWIDTHINSBSMINUS1 = r0
            r0 = r6
            r1 = 9
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.video.StdVideoAV1TileInfo.PHEIGHTINSBSMINUS1 = r0
            return
    }
}
