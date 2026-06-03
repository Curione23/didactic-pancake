package org.lwjgl.vulkan.video;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/video/StdVideoAV1ColorConfig.class */
public class StdVideoAV1ColorConfig extends org.lwjgl.system.Struct<org.lwjgl.vulkan.video.StdVideoAV1ColorConfig> implements org.lwjgl.system.NativeResource {
    public static final int SIZEOF = 0;
    public static final int ALIGNOF = 0;
    public static final int FLAGS = 0;
    public static final int BITDEPTH = 0;
    public static final int SUBSAMPLING_X = 0;
    public static final int SUBSAMPLING_Y = 0;
    public static final int RESERVED1 = 0;
    public static final int COLOR_PRIMARIES = 0;
    public static final int TRANSFER_CHARACTERISTICS = 0;
    public static final int MATRIX_COEFFICIENTS = 0;
    public static final int CHROMA_SAMPLE_POSITION = 0;

    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/video/StdVideoAV1ColorConfig$Buffer.class */
    public static class Buffer extends org.lwjgl.system.StructBuffer<org.lwjgl.vulkan.video.StdVideoAV1ColorConfig, org.lwjgl.vulkan.video.StdVideoAV1ColorConfig.Buffer> implements org.lwjgl.system.NativeResource {
        private static final org.lwjgl.vulkan.video.StdVideoAV1ColorConfig ELEMENT_FACTORY = null;

        public Buffer(java.nio.ByteBuffer r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r6
                int r2 = r2.remaining()
                int r3 = org.lwjgl.vulkan.video.StdVideoAV1ColorConfig.SIZEOF
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
        protected org.lwjgl.vulkan.video.StdVideoAV1ColorConfig.Buffer self() {
                r2 = this;
                r0 = r2
                return r0
        }

        protected org.lwjgl.vulkan.video.StdVideoAV1ColorConfig.Buffer create(long r11, java.nio.ByteBuffer r13, int r14, int r15, int r16, int r17) {
                r10 = this;
                org.lwjgl.vulkan.video.StdVideoAV1ColorConfig$Buffer r0 = new org.lwjgl.vulkan.video.StdVideoAV1ColorConfig$Buffer
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
        protected org.lwjgl.vulkan.video.StdVideoAV1ColorConfig getElementFactory() {
                r2 = this;
                org.lwjgl.vulkan.video.StdVideoAV1ColorConfig r0 = org.lwjgl.vulkan.video.StdVideoAV1ColorConfig.Buffer.ELEMENT_FACTORY
                return r0
        }

        public org.lwjgl.vulkan.video.StdVideoAV1ColorConfigFlags flags() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                org.lwjgl.vulkan.video.StdVideoAV1ColorConfigFlags r0 = org.lwjgl.vulkan.video.StdVideoAV1ColorConfig.nflags(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint8_t")
        public byte BitDepth() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                byte r0 = org.lwjgl.vulkan.video.StdVideoAV1ColorConfig.nBitDepth(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint8_t")
        public byte subsampling_x() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                byte r0 = org.lwjgl.vulkan.video.StdVideoAV1ColorConfig.nsubsampling_x(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint8_t")
        public byte subsampling_y() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                byte r0 = org.lwjgl.vulkan.video.StdVideoAV1ColorConfig.nsubsampling_y(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("StdVideoAV1ColorPrimaries")
        public int color_primaries() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.video.StdVideoAV1ColorConfig.ncolor_primaries(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("StdVideoAV1TransferCharacteristics")
        public int transfer_characteristics() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.video.StdVideoAV1ColorConfig.ntransfer_characteristics(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("StdVideoAV1MatrixCoefficients")
        public int matrix_coefficients() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.video.StdVideoAV1ColorConfig.nmatrix_coefficients(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("StdVideoAV1ChromaSamplePosition")
        public int chroma_sample_position() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.video.StdVideoAV1ColorConfig.nchroma_sample_position(r0)
                return r0
        }

        public org.lwjgl.vulkan.video.StdVideoAV1ColorConfig.Buffer flags(org.lwjgl.vulkan.video.StdVideoAV1ColorConfigFlags r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.video.StdVideoAV1ColorConfig.nflags(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.video.StdVideoAV1ColorConfig.Buffer flags(java.util.function.Consumer<org.lwjgl.vulkan.video.StdVideoAV1ColorConfigFlags> r4) {
                r3 = this;
                r0 = r4
                r1 = r3
                org.lwjgl.vulkan.video.StdVideoAV1ColorConfigFlags r1 = r1.flags()
                r0.accept(r1)
                r0 = r3
                return r0
        }

        public org.lwjgl.vulkan.video.StdVideoAV1ColorConfig.Buffer BitDepth(@org.lwjgl.system.NativeType("uint8_t") byte r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.video.StdVideoAV1ColorConfig.nBitDepth(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.video.StdVideoAV1ColorConfig.Buffer subsampling_x(@org.lwjgl.system.NativeType("uint8_t") byte r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.video.StdVideoAV1ColorConfig.nsubsampling_x(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.video.StdVideoAV1ColorConfig.Buffer subsampling_y(@org.lwjgl.system.NativeType("uint8_t") byte r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.video.StdVideoAV1ColorConfig.nsubsampling_y(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.video.StdVideoAV1ColorConfig.Buffer color_primaries(@org.lwjgl.system.NativeType("StdVideoAV1ColorPrimaries") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.video.StdVideoAV1ColorConfig.ncolor_primaries(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.video.StdVideoAV1ColorConfig.Buffer transfer_characteristics(@org.lwjgl.system.NativeType("StdVideoAV1TransferCharacteristics") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.video.StdVideoAV1ColorConfig.ntransfer_characteristics(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.video.StdVideoAV1ColorConfig.Buffer matrix_coefficients(@org.lwjgl.system.NativeType("StdVideoAV1MatrixCoefficients") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.video.StdVideoAV1ColorConfig.nmatrix_coefficients(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.video.StdVideoAV1ColorConfig.Buffer chroma_sample_position(@org.lwjgl.system.NativeType("StdVideoAV1ChromaSamplePosition") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.video.StdVideoAV1ColorConfig.nchroma_sample_position(r0, r1)
                r0 = r4
                return r0
        }

        @Override // org.lwjgl.system.StructBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.Struct getElementFactory() {
                r2 = this;
                r0 = r2
                org.lwjgl.vulkan.video.StdVideoAV1ColorConfig r0 = r0.getElementFactory()
                return r0
        }

        /* JADX INFO: renamed from: create, reason: collision with other method in class */
        protected /* bridge */ /* synthetic */ org.lwjgl.system.CustomBuffer m7337create(long r10, java.nio.ByteBuffer r12, int r13, int r14, int r15, int r16) {
                r9 = this;
                r0 = r9
                r1 = r10
                r2 = r12
                r3 = r13
                r4 = r14
                r5 = r15
                r6 = r16
                org.lwjgl.vulkan.video.StdVideoAV1ColorConfig$Buffer r0 = r0.create(r1, r2, r3, r4, r5, r6)
                return r0
        }

        @Override // org.lwjgl.system.CustomBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.CustomBuffer self() {
                r2 = this;
                r0 = r2
                org.lwjgl.vulkan.video.StdVideoAV1ColorConfig$Buffer r0 = r0.self()
                return r0
        }

        static {
                r0 = -1
                org.lwjgl.vulkan.video.StdVideoAV1ColorConfig r0 = org.lwjgl.vulkan.video.StdVideoAV1ColorConfig.create(r0)
                org.lwjgl.vulkan.video.StdVideoAV1ColorConfig.Buffer.ELEMENT_FACTORY = r0
                return
        }
    }

    protected StdVideoAV1ColorConfig(long r6, java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    protected org.lwjgl.vulkan.video.StdVideoAV1ColorConfig create(long r7, java.nio.ByteBuffer r9) {
            r6 = this;
            org.lwjgl.vulkan.video.StdVideoAV1ColorConfig r0 = new org.lwjgl.vulkan.video.StdVideoAV1ColorConfig
            r1 = r0
            r2 = r7
            r3 = r9
            r1.<init>(r2, r3)
            return r0
    }

    public StdVideoAV1ColorConfig(java.nio.ByteBuffer r7) {
            r6 = this;
            r0 = r6
            r1 = r7
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            r2 = r7
            int r3 = org.lwjgl.vulkan.video.StdVideoAV1ColorConfig.SIZEOF
            java.nio.ByteBuffer r2 = __checkContainer(r2, r3)
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
            r2 = this;
            int r0 = org.lwjgl.vulkan.video.StdVideoAV1ColorConfig.SIZEOF
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoAV1ColorConfigFlags flags() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            org.lwjgl.vulkan.video.StdVideoAV1ColorConfigFlags r0 = nflags(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("uint8_t")
    public byte BitDepth() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            byte r0 = nBitDepth(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("uint8_t")
    public byte subsampling_x() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            byte r0 = nsubsampling_x(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("uint8_t")
    public byte subsampling_y() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            byte r0 = nsubsampling_y(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("StdVideoAV1ColorPrimaries")
    public int color_primaries() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = ncolor_primaries(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("StdVideoAV1TransferCharacteristics")
    public int transfer_characteristics() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = ntransfer_characteristics(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("StdVideoAV1MatrixCoefficients")
    public int matrix_coefficients() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nmatrix_coefficients(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("StdVideoAV1ChromaSamplePosition")
    public int chroma_sample_position() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nchroma_sample_position(r0)
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoAV1ColorConfig flags(org.lwjgl.vulkan.video.StdVideoAV1ColorConfigFlags r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nflags(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoAV1ColorConfig flags(java.util.function.Consumer<org.lwjgl.vulkan.video.StdVideoAV1ColorConfigFlags> r4) {
            r3 = this;
            r0 = r4
            r1 = r3
            org.lwjgl.vulkan.video.StdVideoAV1ColorConfigFlags r1 = r1.flags()
            r0.accept(r1)
            r0 = r3
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoAV1ColorConfig BitDepth(@org.lwjgl.system.NativeType("uint8_t") byte r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nBitDepth(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoAV1ColorConfig subsampling_x(@org.lwjgl.system.NativeType("uint8_t") byte r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nsubsampling_x(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoAV1ColorConfig subsampling_y(@org.lwjgl.system.NativeType("uint8_t") byte r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nsubsampling_y(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoAV1ColorConfig color_primaries(@org.lwjgl.system.NativeType("StdVideoAV1ColorPrimaries") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            ncolor_primaries(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoAV1ColorConfig transfer_characteristics(@org.lwjgl.system.NativeType("StdVideoAV1TransferCharacteristics") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            ntransfer_characteristics(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoAV1ColorConfig matrix_coefficients(@org.lwjgl.system.NativeType("StdVideoAV1MatrixCoefficients") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nmatrix_coefficients(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoAV1ColorConfig chroma_sample_position(@org.lwjgl.system.NativeType("StdVideoAV1ChromaSamplePosition") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nchroma_sample_position(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoAV1ColorConfig set(org.lwjgl.vulkan.video.StdVideoAV1ColorConfigFlags r4, byte r5, byte r6, byte r7, int r8, int r9, int r10, int r11) {
            r3 = this;
            r0 = r3
            r1 = r4
            org.lwjgl.vulkan.video.StdVideoAV1ColorConfig r0 = r0.flags(r1)
            r0 = r3
            r1 = r5
            org.lwjgl.vulkan.video.StdVideoAV1ColorConfig r0 = r0.BitDepth(r1)
            r0 = r3
            r1 = r6
            org.lwjgl.vulkan.video.StdVideoAV1ColorConfig r0 = r0.subsampling_x(r1)
            r0 = r3
            r1 = r7
            org.lwjgl.vulkan.video.StdVideoAV1ColorConfig r0 = r0.subsampling_y(r1)
            r0 = r3
            r1 = r8
            org.lwjgl.vulkan.video.StdVideoAV1ColorConfig r0 = r0.color_primaries(r1)
            r0 = r3
            r1 = r9
            org.lwjgl.vulkan.video.StdVideoAV1ColorConfig r0 = r0.transfer_characteristics(r1)
            r0 = r3
            r1 = r10
            org.lwjgl.vulkan.video.StdVideoAV1ColorConfig r0 = r0.matrix_coefficients(r1)
            r0 = r3
            r1 = r11
            org.lwjgl.vulkan.video.StdVideoAV1ColorConfig r0 = r0.chroma_sample_position(r1)
            r0 = r3
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoAV1ColorConfig set(org.lwjgl.vulkan.video.StdVideoAV1ColorConfig r8) {
            r7 = this;
            r0 = r8
            long r0 = r0.address()
            r1 = r7
            long r1 = r1.address()
            int r2 = org.lwjgl.vulkan.video.StdVideoAV1ColorConfig.SIZEOF
            long r2 = (long) r2
            org.lwjgl.system.MemoryUtil.memCopy(r0, r1, r2)
            r0 = r7
            return r0
    }

    public static org.lwjgl.vulkan.video.StdVideoAV1ColorConfig malloc() {
            org.lwjgl.vulkan.video.StdVideoAV1ColorConfig r0 = new org.lwjgl.vulkan.video.StdVideoAV1ColorConfig
            r1 = r0
            int r2 = org.lwjgl.vulkan.video.StdVideoAV1ColorConfig.SIZEOF
            long r2 = (long) r2
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.video.StdVideoAV1ColorConfig calloc() {
            org.lwjgl.vulkan.video.StdVideoAV1ColorConfig r0 = new org.lwjgl.vulkan.video.StdVideoAV1ColorConfig
            r1 = r0
            r2 = 1
            int r3 = org.lwjgl.vulkan.video.StdVideoAV1ColorConfig.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.video.StdVideoAV1ColorConfig create() {
            int r0 = org.lwjgl.vulkan.video.StdVideoAV1ColorConfig.SIZEOF
            java.nio.ByteBuffer r0 = org.lwjgl.BufferUtils.createByteBuffer(r0)
            r6 = r0
            org.lwjgl.vulkan.video.StdVideoAV1ColorConfig r0 = new org.lwjgl.vulkan.video.StdVideoAV1ColorConfig
            r1 = r0
            r2 = r6
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.video.StdVideoAV1ColorConfig create(long r6) {
            org.lwjgl.vulkan.video.StdVideoAV1ColorConfig r0 = new org.lwjgl.vulkan.video.StdVideoAV1ColorConfig
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.video.StdVideoAV1ColorConfig createSafe(long r6) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.vulkan.video.StdVideoAV1ColorConfig r0 = new org.lwjgl.vulkan.video.StdVideoAV1ColorConfig
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static org.lwjgl.vulkan.video.StdVideoAV1ColorConfig.Buffer malloc(int r6) {
            org.lwjgl.vulkan.video.StdVideoAV1ColorConfig$Buffer r0 = new org.lwjgl.vulkan.video.StdVideoAV1ColorConfig$Buffer
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.vulkan.video.StdVideoAV1ColorConfig.SIZEOF
            long r2 = __checkMalloc(r2, r3)
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.video.StdVideoAV1ColorConfig.Buffer calloc(int r7) {
            org.lwjgl.vulkan.video.StdVideoAV1ColorConfig$Buffer r0 = new org.lwjgl.vulkan.video.StdVideoAV1ColorConfig$Buffer
            r1 = r0
            r2 = r7
            long r2 = (long) r2
            int r3 = org.lwjgl.vulkan.video.StdVideoAV1ColorConfig.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.video.StdVideoAV1ColorConfig.Buffer create(int r10) {
            r0 = r10
            int r1 = org.lwjgl.vulkan.video.StdVideoAV1ColorConfig.SIZEOF
            java.nio.ByteBuffer r0 = __create(r0, r1)
            r11 = r0
            org.lwjgl.vulkan.video.StdVideoAV1ColorConfig$Buffer r0 = new org.lwjgl.vulkan.video.StdVideoAV1ColorConfig$Buffer
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

    public static org.lwjgl.vulkan.video.StdVideoAV1ColorConfig.Buffer create(long r6, int r8) {
            org.lwjgl.vulkan.video.StdVideoAV1ColorConfig$Buffer r0 = new org.lwjgl.vulkan.video.StdVideoAV1ColorConfig$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.video.StdVideoAV1ColorConfig.Buffer createSafe(long r6, int r8) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.vulkan.video.StdVideoAV1ColorConfig$Buffer r0 = new org.lwjgl.vulkan.video.StdVideoAV1ColorConfig$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static org.lwjgl.vulkan.video.StdVideoAV1ColorConfig malloc(org.lwjgl.system.MemoryStack r6) {
            org.lwjgl.vulkan.video.StdVideoAV1ColorConfig r0 = new org.lwjgl.vulkan.video.StdVideoAV1ColorConfig
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.vulkan.video.StdVideoAV1ColorConfig.ALIGNOF
            int r4 = org.lwjgl.vulkan.video.StdVideoAV1ColorConfig.SIZEOF
            long r2 = r2.nmalloc(r3, r4)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.video.StdVideoAV1ColorConfig calloc(org.lwjgl.system.MemoryStack r7) {
            org.lwjgl.vulkan.video.StdVideoAV1ColorConfig r0 = new org.lwjgl.vulkan.video.StdVideoAV1ColorConfig
            r1 = r0
            r2 = r7
            int r3 = org.lwjgl.vulkan.video.StdVideoAV1ColorConfig.ALIGNOF
            r4 = 1
            int r5 = org.lwjgl.vulkan.video.StdVideoAV1ColorConfig.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.video.StdVideoAV1ColorConfig.Buffer malloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.vulkan.video.StdVideoAV1ColorConfig$Buffer r0 = new org.lwjgl.vulkan.video.StdVideoAV1ColorConfig$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.vulkan.video.StdVideoAV1ColorConfig.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.vulkan.video.StdVideoAV1ColorConfig.SIZEOF
            int r4 = r4 * r5
            long r2 = r2.nmalloc(r3, r4)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.video.StdVideoAV1ColorConfig.Buffer calloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.vulkan.video.StdVideoAV1ColorConfig$Buffer r0 = new org.lwjgl.vulkan.video.StdVideoAV1ColorConfig$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.vulkan.video.StdVideoAV1ColorConfig.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.vulkan.video.StdVideoAV1ColorConfig.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.video.StdVideoAV1ColorConfigFlags nflags(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.video.StdVideoAV1ColorConfig.FLAGS
            long r1 = (long) r1
            long r0 = r0 + r1
            org.lwjgl.vulkan.video.StdVideoAV1ColorConfigFlags r0 = org.lwjgl.vulkan.video.StdVideoAV1ColorConfigFlags.create(r0)
            return r0
    }

    public static byte nBitDepth(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.video.StdVideoAV1ColorConfig.BITDEPTH
            long r1 = (long) r1
            long r0 = r0 + r1
            byte r0 = org.lwjgl.system.MemoryUtil.memGetByte(r0)
            return r0
    }

    public static byte nsubsampling_x(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.video.StdVideoAV1ColorConfig.SUBSAMPLING_X
            long r1 = (long) r1
            long r0 = r0 + r1
            byte r0 = org.lwjgl.system.MemoryUtil.memGetByte(r0)
            return r0
    }

    public static byte nsubsampling_y(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.video.StdVideoAV1ColorConfig.SUBSAMPLING_Y
            long r1 = (long) r1
            long r0 = r0 + r1
            byte r0 = org.lwjgl.system.MemoryUtil.memGetByte(r0)
            return r0
    }

    public static byte nreserved1(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.video.StdVideoAV1ColorConfig.RESERVED1
            long r1 = (long) r1
            long r0 = r0 + r1
            byte r0 = org.lwjgl.system.MemoryUtil.memGetByte(r0)
            return r0
    }

    public static int ncolor_primaries(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.video.StdVideoAV1ColorConfig.COLOR_PRIMARIES
            long r1 = (long) r1
            long r0 = r0 + r1
            int r0 = org.lwjgl.system.MemoryUtil.memGetInt(r0)
            return r0
    }

    public static int ntransfer_characteristics(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.video.StdVideoAV1ColorConfig.TRANSFER_CHARACTERISTICS
            long r1 = (long) r1
            long r0 = r0 + r1
            int r0 = org.lwjgl.system.MemoryUtil.memGetInt(r0)
            return r0
    }

    public static int nmatrix_coefficients(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.video.StdVideoAV1ColorConfig.MATRIX_COEFFICIENTS
            long r1 = (long) r1
            long r0 = r0 + r1
            int r0 = org.lwjgl.system.MemoryUtil.memGetInt(r0)
            return r0
    }

    public static int nchroma_sample_position(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.video.StdVideoAV1ColorConfig.CHROMA_SAMPLE_POSITION
            long r1 = (long) r1
            long r0 = r0 + r1
            int r0 = org.lwjgl.system.MemoryUtil.memGetInt(r0)
            return r0
    }

    public static void nflags(long r7, org.lwjgl.vulkan.video.StdVideoAV1ColorConfigFlags r9) {
            r0 = r9
            long r0 = r0.address()
            r1 = r7
            int r2 = org.lwjgl.vulkan.video.StdVideoAV1ColorConfig.FLAGS
            long r2 = (long) r2
            long r1 = r1 + r2
            int r2 = org.lwjgl.vulkan.video.StdVideoAV1ColorConfigFlags.SIZEOF
            long r2 = (long) r2
            org.lwjgl.system.MemoryUtil.memCopy(r0, r1, r2)
            return
    }

    public static void nBitDepth(long r5, byte r7) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.video.StdVideoAV1ColorConfig.BITDEPTH
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            org.lwjgl.system.MemoryUtil.memPutByte(r0, r1)
            return
    }

    public static void nsubsampling_x(long r5, byte r7) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.video.StdVideoAV1ColorConfig.SUBSAMPLING_X
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            org.lwjgl.system.MemoryUtil.memPutByte(r0, r1)
            return
    }

    public static void nsubsampling_y(long r5, byte r7) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.video.StdVideoAV1ColorConfig.SUBSAMPLING_Y
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            org.lwjgl.system.MemoryUtil.memPutByte(r0, r1)
            return
    }

    public static void nreserved1(long r5, byte r7) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.video.StdVideoAV1ColorConfig.RESERVED1
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            org.lwjgl.system.MemoryUtil.memPutByte(r0, r1)
            return
    }

    public static void ncolor_primaries(long r5, int r7) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.video.StdVideoAV1ColorConfig.COLOR_PRIMARIES
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            org.lwjgl.system.MemoryUtil.memPutInt(r0, r1)
            return
    }

    public static void ntransfer_characteristics(long r5, int r7) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.video.StdVideoAV1ColorConfig.TRANSFER_CHARACTERISTICS
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            org.lwjgl.system.MemoryUtil.memPutInt(r0, r1)
            return
    }

    public static void nmatrix_coefficients(long r5, int r7) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.video.StdVideoAV1ColorConfig.MATRIX_COEFFICIENTS
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            org.lwjgl.system.MemoryUtil.memPutInt(r0, r1)
            return
    }

    public static void nchroma_sample_position(long r5, int r7) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.video.StdVideoAV1ColorConfig.CHROMA_SAMPLE_POSITION
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            org.lwjgl.system.MemoryUtil.memPutInt(r0, r1)
            return
    }

    @Override // org.lwjgl.system.Struct
    protected /* bridge */ /* synthetic */ org.lwjgl.system.Struct create(long r6, java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            org.lwjgl.vulkan.video.StdVideoAV1ColorConfig r0 = r0.create(r1, r2)
            return r0
    }

    static {
            r0 = 9
            org.lwjgl.system.Struct$Member[] r0 = new org.lwjgl.system.Struct.Member[r0]
            r1 = r0
            r2 = 0
            int r3 = org.lwjgl.vulkan.video.StdVideoAV1ColorConfigFlags.SIZEOF
            int r4 = org.lwjgl.vulkan.video.StdVideoAV1ColorConfigFlags.ALIGNOF
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
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 4
            r3 = 1
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
            r3 = 4
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 8
            r3 = 4
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            org.lwjgl.system.Struct$Layout r0 = __struct(r0)
            r6 = r0
            r0 = r6
            int r0 = r0.getSize()
            org.lwjgl.vulkan.video.StdVideoAV1ColorConfig.SIZEOF = r0
            r0 = r6
            int r0 = r0.getAlignment()
            org.lwjgl.vulkan.video.StdVideoAV1ColorConfig.ALIGNOF = r0
            r0 = r6
            r1 = 0
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.video.StdVideoAV1ColorConfig.FLAGS = r0
            r0 = r6
            r1 = 1
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.video.StdVideoAV1ColorConfig.BITDEPTH = r0
            r0 = r6
            r1 = 2
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.video.StdVideoAV1ColorConfig.SUBSAMPLING_X = r0
            r0 = r6
            r1 = 3
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.video.StdVideoAV1ColorConfig.SUBSAMPLING_Y = r0
            r0 = r6
            r1 = 4
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.video.StdVideoAV1ColorConfig.RESERVED1 = r0
            r0 = r6
            r1 = 5
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.video.StdVideoAV1ColorConfig.COLOR_PRIMARIES = r0
            r0 = r6
            r1 = 6
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.video.StdVideoAV1ColorConfig.TRANSFER_CHARACTERISTICS = r0
            r0 = r6
            r1 = 7
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.video.StdVideoAV1ColorConfig.MATRIX_COEFFICIENTS = r0
            r0 = r6
            r1 = 8
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.video.StdVideoAV1ColorConfig.CHROMA_SAMPLE_POSITION = r0
            return
    }
}
