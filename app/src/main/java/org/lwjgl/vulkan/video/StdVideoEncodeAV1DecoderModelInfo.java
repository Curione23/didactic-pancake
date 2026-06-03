package org.lwjgl.vulkan.video;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/video/StdVideoEncodeAV1DecoderModelInfo.class */
public class StdVideoEncodeAV1DecoderModelInfo extends org.lwjgl.system.Struct<org.lwjgl.vulkan.video.StdVideoEncodeAV1DecoderModelInfo> implements org.lwjgl.system.NativeResource {
    public static final int SIZEOF = 0;
    public static final int ALIGNOF = 0;
    public static final int BUFFER_DELAY_LENGTH_MINUS_1 = 0;
    public static final int BUFFER_REMOVAL_TIME_LENGTH_MINUS_1 = 0;
    public static final int FRAME_PRESENTATION_TIME_LENGTH_MINUS_1 = 0;
    public static final int RESERVED1 = 0;
    public static final int NUM_UNITS_IN_DECODING_TICK = 0;

    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/video/StdVideoEncodeAV1DecoderModelInfo$Buffer.class */
    public static class Buffer extends org.lwjgl.system.StructBuffer<org.lwjgl.vulkan.video.StdVideoEncodeAV1DecoderModelInfo, org.lwjgl.vulkan.video.StdVideoEncodeAV1DecoderModelInfo.Buffer> implements org.lwjgl.system.NativeResource {
        private static final org.lwjgl.vulkan.video.StdVideoEncodeAV1DecoderModelInfo ELEMENT_FACTORY = null;

        public Buffer(java.nio.ByteBuffer r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r6
                int r2 = r2.remaining()
                int r3 = org.lwjgl.vulkan.video.StdVideoEncodeAV1DecoderModelInfo.SIZEOF
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
        protected org.lwjgl.vulkan.video.StdVideoEncodeAV1DecoderModelInfo.Buffer self() {
                r2 = this;
                r0 = r2
                return r0
        }

        protected org.lwjgl.vulkan.video.StdVideoEncodeAV1DecoderModelInfo.Buffer create(long r11, java.nio.ByteBuffer r13, int r14, int r15, int r16, int r17) {
                r10 = this;
                org.lwjgl.vulkan.video.StdVideoEncodeAV1DecoderModelInfo$Buffer r0 = new org.lwjgl.vulkan.video.StdVideoEncodeAV1DecoderModelInfo$Buffer
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
        protected org.lwjgl.vulkan.video.StdVideoEncodeAV1DecoderModelInfo getElementFactory() {
                r2 = this;
                org.lwjgl.vulkan.video.StdVideoEncodeAV1DecoderModelInfo r0 = org.lwjgl.vulkan.video.StdVideoEncodeAV1DecoderModelInfo.Buffer.ELEMENT_FACTORY
                return r0
        }

        @org.lwjgl.system.NativeType("uint8_t")
        public byte buffer_delay_length_minus_1() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                byte r0 = org.lwjgl.vulkan.video.StdVideoEncodeAV1DecoderModelInfo.nbuffer_delay_length_minus_1(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint8_t")
        public byte buffer_removal_time_length_minus_1() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                byte r0 = org.lwjgl.vulkan.video.StdVideoEncodeAV1DecoderModelInfo.nbuffer_removal_time_length_minus_1(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint8_t")
        public byte frame_presentation_time_length_minus_1() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                byte r0 = org.lwjgl.vulkan.video.StdVideoEncodeAV1DecoderModelInfo.nframe_presentation_time_length_minus_1(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint32_t")
        public int num_units_in_decoding_tick() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.video.StdVideoEncodeAV1DecoderModelInfo.nnum_units_in_decoding_tick(r0)
                return r0
        }

        public org.lwjgl.vulkan.video.StdVideoEncodeAV1DecoderModelInfo.Buffer buffer_delay_length_minus_1(@org.lwjgl.system.NativeType("uint8_t") byte r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.video.StdVideoEncodeAV1DecoderModelInfo.nbuffer_delay_length_minus_1(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.video.StdVideoEncodeAV1DecoderModelInfo.Buffer buffer_removal_time_length_minus_1(@org.lwjgl.system.NativeType("uint8_t") byte r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.video.StdVideoEncodeAV1DecoderModelInfo.nbuffer_removal_time_length_minus_1(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.video.StdVideoEncodeAV1DecoderModelInfo.Buffer frame_presentation_time_length_minus_1(@org.lwjgl.system.NativeType("uint8_t") byte r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.video.StdVideoEncodeAV1DecoderModelInfo.nframe_presentation_time_length_minus_1(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.video.StdVideoEncodeAV1DecoderModelInfo.Buffer num_units_in_decoding_tick(@org.lwjgl.system.NativeType("uint32_t") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.video.StdVideoEncodeAV1DecoderModelInfo.nnum_units_in_decoding_tick(r0, r1)
                r0 = r4
                return r0
        }

        @Override // org.lwjgl.system.StructBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.Struct getElementFactory() {
                r2 = this;
                r0 = r2
                org.lwjgl.vulkan.video.StdVideoEncodeAV1DecoderModelInfo r0 = r0.getElementFactory()
                return r0
        }

        /* JADX INFO: renamed from: create, reason: collision with other method in class */
        protected /* bridge */ /* synthetic */ org.lwjgl.system.CustomBuffer m7422create(long r10, java.nio.ByteBuffer r12, int r13, int r14, int r15, int r16) {
                r9 = this;
                r0 = r9
                r1 = r10
                r2 = r12
                r3 = r13
                r4 = r14
                r5 = r15
                r6 = r16
                org.lwjgl.vulkan.video.StdVideoEncodeAV1DecoderModelInfo$Buffer r0 = r0.create(r1, r2, r3, r4, r5, r6)
                return r0
        }

        @Override // org.lwjgl.system.CustomBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.CustomBuffer self() {
                r2 = this;
                r0 = r2
                org.lwjgl.vulkan.video.StdVideoEncodeAV1DecoderModelInfo$Buffer r0 = r0.self()
                return r0
        }

        static {
                r0 = -1
                org.lwjgl.vulkan.video.StdVideoEncodeAV1DecoderModelInfo r0 = org.lwjgl.vulkan.video.StdVideoEncodeAV1DecoderModelInfo.create(r0)
                org.lwjgl.vulkan.video.StdVideoEncodeAV1DecoderModelInfo.Buffer.ELEMENT_FACTORY = r0
                return
        }
    }

    protected StdVideoEncodeAV1DecoderModelInfo(long r6, java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    protected org.lwjgl.vulkan.video.StdVideoEncodeAV1DecoderModelInfo create(long r7, java.nio.ByteBuffer r9) {
            r6 = this;
            org.lwjgl.vulkan.video.StdVideoEncodeAV1DecoderModelInfo r0 = new org.lwjgl.vulkan.video.StdVideoEncodeAV1DecoderModelInfo
            r1 = r0
            r2 = r7
            r3 = r9
            r1.<init>(r2, r3)
            return r0
    }

    public StdVideoEncodeAV1DecoderModelInfo(java.nio.ByteBuffer r7) {
            r6 = this;
            r0 = r6
            r1 = r7
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            r2 = r7
            int r3 = org.lwjgl.vulkan.video.StdVideoEncodeAV1DecoderModelInfo.SIZEOF
            java.nio.ByteBuffer r2 = __checkContainer(r2, r3)
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
            r2 = this;
            int r0 = org.lwjgl.vulkan.video.StdVideoEncodeAV1DecoderModelInfo.SIZEOF
            return r0
    }

    @org.lwjgl.system.NativeType("uint8_t")
    public byte buffer_delay_length_minus_1() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            byte r0 = nbuffer_delay_length_minus_1(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("uint8_t")
    public byte buffer_removal_time_length_minus_1() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            byte r0 = nbuffer_removal_time_length_minus_1(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("uint8_t")
    public byte frame_presentation_time_length_minus_1() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            byte r0 = nframe_presentation_time_length_minus_1(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("uint32_t")
    public int num_units_in_decoding_tick() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nnum_units_in_decoding_tick(r0)
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoEncodeAV1DecoderModelInfo buffer_delay_length_minus_1(@org.lwjgl.system.NativeType("uint8_t") byte r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nbuffer_delay_length_minus_1(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoEncodeAV1DecoderModelInfo buffer_removal_time_length_minus_1(@org.lwjgl.system.NativeType("uint8_t") byte r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nbuffer_removal_time_length_minus_1(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoEncodeAV1DecoderModelInfo frame_presentation_time_length_minus_1(@org.lwjgl.system.NativeType("uint8_t") byte r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nframe_presentation_time_length_minus_1(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoEncodeAV1DecoderModelInfo num_units_in_decoding_tick(@org.lwjgl.system.NativeType("uint32_t") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nnum_units_in_decoding_tick(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoEncodeAV1DecoderModelInfo set(byte r4, byte r5, byte r6, int r7) {
            r3 = this;
            r0 = r3
            r1 = r4
            org.lwjgl.vulkan.video.StdVideoEncodeAV1DecoderModelInfo r0 = r0.buffer_delay_length_minus_1(r1)
            r0 = r3
            r1 = r5
            org.lwjgl.vulkan.video.StdVideoEncodeAV1DecoderModelInfo r0 = r0.buffer_removal_time_length_minus_1(r1)
            r0 = r3
            r1 = r6
            org.lwjgl.vulkan.video.StdVideoEncodeAV1DecoderModelInfo r0 = r0.frame_presentation_time_length_minus_1(r1)
            r0 = r3
            r1 = r7
            org.lwjgl.vulkan.video.StdVideoEncodeAV1DecoderModelInfo r0 = r0.num_units_in_decoding_tick(r1)
            r0 = r3
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoEncodeAV1DecoderModelInfo set(org.lwjgl.vulkan.video.StdVideoEncodeAV1DecoderModelInfo r8) {
            r7 = this;
            r0 = r8
            long r0 = r0.address()
            r1 = r7
            long r1 = r1.address()
            int r2 = org.lwjgl.vulkan.video.StdVideoEncodeAV1DecoderModelInfo.SIZEOF
            long r2 = (long) r2
            org.lwjgl.system.MemoryUtil.memCopy(r0, r1, r2)
            r0 = r7
            return r0
    }

    public static org.lwjgl.vulkan.video.StdVideoEncodeAV1DecoderModelInfo malloc() {
            org.lwjgl.vulkan.video.StdVideoEncodeAV1DecoderModelInfo r0 = new org.lwjgl.vulkan.video.StdVideoEncodeAV1DecoderModelInfo
            r1 = r0
            int r2 = org.lwjgl.vulkan.video.StdVideoEncodeAV1DecoderModelInfo.SIZEOF
            long r2 = (long) r2
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.video.StdVideoEncodeAV1DecoderModelInfo calloc() {
            org.lwjgl.vulkan.video.StdVideoEncodeAV1DecoderModelInfo r0 = new org.lwjgl.vulkan.video.StdVideoEncodeAV1DecoderModelInfo
            r1 = r0
            r2 = 1
            int r3 = org.lwjgl.vulkan.video.StdVideoEncodeAV1DecoderModelInfo.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.video.StdVideoEncodeAV1DecoderModelInfo create() {
            int r0 = org.lwjgl.vulkan.video.StdVideoEncodeAV1DecoderModelInfo.SIZEOF
            java.nio.ByteBuffer r0 = org.lwjgl.BufferUtils.createByteBuffer(r0)
            r6 = r0
            org.lwjgl.vulkan.video.StdVideoEncodeAV1DecoderModelInfo r0 = new org.lwjgl.vulkan.video.StdVideoEncodeAV1DecoderModelInfo
            r1 = r0
            r2 = r6
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.video.StdVideoEncodeAV1DecoderModelInfo create(long r6) {
            org.lwjgl.vulkan.video.StdVideoEncodeAV1DecoderModelInfo r0 = new org.lwjgl.vulkan.video.StdVideoEncodeAV1DecoderModelInfo
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.video.StdVideoEncodeAV1DecoderModelInfo createSafe(long r6) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.vulkan.video.StdVideoEncodeAV1DecoderModelInfo r0 = new org.lwjgl.vulkan.video.StdVideoEncodeAV1DecoderModelInfo
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static org.lwjgl.vulkan.video.StdVideoEncodeAV1DecoderModelInfo.Buffer malloc(int r6) {
            org.lwjgl.vulkan.video.StdVideoEncodeAV1DecoderModelInfo$Buffer r0 = new org.lwjgl.vulkan.video.StdVideoEncodeAV1DecoderModelInfo$Buffer
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.vulkan.video.StdVideoEncodeAV1DecoderModelInfo.SIZEOF
            long r2 = __checkMalloc(r2, r3)
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.video.StdVideoEncodeAV1DecoderModelInfo.Buffer calloc(int r7) {
            org.lwjgl.vulkan.video.StdVideoEncodeAV1DecoderModelInfo$Buffer r0 = new org.lwjgl.vulkan.video.StdVideoEncodeAV1DecoderModelInfo$Buffer
            r1 = r0
            r2 = r7
            long r2 = (long) r2
            int r3 = org.lwjgl.vulkan.video.StdVideoEncodeAV1DecoderModelInfo.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.video.StdVideoEncodeAV1DecoderModelInfo.Buffer create(int r10) {
            r0 = r10
            int r1 = org.lwjgl.vulkan.video.StdVideoEncodeAV1DecoderModelInfo.SIZEOF
            java.nio.ByteBuffer r0 = __create(r0, r1)
            r11 = r0
            org.lwjgl.vulkan.video.StdVideoEncodeAV1DecoderModelInfo$Buffer r0 = new org.lwjgl.vulkan.video.StdVideoEncodeAV1DecoderModelInfo$Buffer
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

    public static org.lwjgl.vulkan.video.StdVideoEncodeAV1DecoderModelInfo.Buffer create(long r6, int r8) {
            org.lwjgl.vulkan.video.StdVideoEncodeAV1DecoderModelInfo$Buffer r0 = new org.lwjgl.vulkan.video.StdVideoEncodeAV1DecoderModelInfo$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.video.StdVideoEncodeAV1DecoderModelInfo.Buffer createSafe(long r6, int r8) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.vulkan.video.StdVideoEncodeAV1DecoderModelInfo$Buffer r0 = new org.lwjgl.vulkan.video.StdVideoEncodeAV1DecoderModelInfo$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static org.lwjgl.vulkan.video.StdVideoEncodeAV1DecoderModelInfo malloc(org.lwjgl.system.MemoryStack r6) {
            org.lwjgl.vulkan.video.StdVideoEncodeAV1DecoderModelInfo r0 = new org.lwjgl.vulkan.video.StdVideoEncodeAV1DecoderModelInfo
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.vulkan.video.StdVideoEncodeAV1DecoderModelInfo.ALIGNOF
            int r4 = org.lwjgl.vulkan.video.StdVideoEncodeAV1DecoderModelInfo.SIZEOF
            long r2 = r2.nmalloc(r3, r4)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.video.StdVideoEncodeAV1DecoderModelInfo calloc(org.lwjgl.system.MemoryStack r7) {
            org.lwjgl.vulkan.video.StdVideoEncodeAV1DecoderModelInfo r0 = new org.lwjgl.vulkan.video.StdVideoEncodeAV1DecoderModelInfo
            r1 = r0
            r2 = r7
            int r3 = org.lwjgl.vulkan.video.StdVideoEncodeAV1DecoderModelInfo.ALIGNOF
            r4 = 1
            int r5 = org.lwjgl.vulkan.video.StdVideoEncodeAV1DecoderModelInfo.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.video.StdVideoEncodeAV1DecoderModelInfo.Buffer malloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.vulkan.video.StdVideoEncodeAV1DecoderModelInfo$Buffer r0 = new org.lwjgl.vulkan.video.StdVideoEncodeAV1DecoderModelInfo$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.vulkan.video.StdVideoEncodeAV1DecoderModelInfo.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.vulkan.video.StdVideoEncodeAV1DecoderModelInfo.SIZEOF
            int r4 = r4 * r5
            long r2 = r2.nmalloc(r3, r4)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.video.StdVideoEncodeAV1DecoderModelInfo.Buffer calloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.vulkan.video.StdVideoEncodeAV1DecoderModelInfo$Buffer r0 = new org.lwjgl.vulkan.video.StdVideoEncodeAV1DecoderModelInfo$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.vulkan.video.StdVideoEncodeAV1DecoderModelInfo.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.vulkan.video.StdVideoEncodeAV1DecoderModelInfo.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static byte nbuffer_delay_length_minus_1(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.video.StdVideoEncodeAV1DecoderModelInfo.BUFFER_DELAY_LENGTH_MINUS_1
            long r1 = (long) r1
            long r0 = r0 + r1
            byte r0 = org.lwjgl.system.MemoryUtil.memGetByte(r0)
            return r0
    }

    public static byte nbuffer_removal_time_length_minus_1(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.video.StdVideoEncodeAV1DecoderModelInfo.BUFFER_REMOVAL_TIME_LENGTH_MINUS_1
            long r1 = (long) r1
            long r0 = r0 + r1
            byte r0 = org.lwjgl.system.MemoryUtil.memGetByte(r0)
            return r0
    }

    public static byte nframe_presentation_time_length_minus_1(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.video.StdVideoEncodeAV1DecoderModelInfo.FRAME_PRESENTATION_TIME_LENGTH_MINUS_1
            long r1 = (long) r1
            long r0 = r0 + r1
            byte r0 = org.lwjgl.system.MemoryUtil.memGetByte(r0)
            return r0
    }

    public static byte nreserved1(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.video.StdVideoEncodeAV1DecoderModelInfo.RESERVED1
            long r1 = (long) r1
            long r0 = r0 + r1
            byte r0 = org.lwjgl.system.MemoryUtil.memGetByte(r0)
            return r0
    }

    public static int nnum_units_in_decoding_tick(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.video.StdVideoEncodeAV1DecoderModelInfo.NUM_UNITS_IN_DECODING_TICK
            long r1 = (long) r1
            long r0 = r0 + r1
            int r0 = org.lwjgl.system.MemoryUtil.memGetInt(r0)
            return r0
    }

    public static void nbuffer_delay_length_minus_1(long r5, byte r7) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.video.StdVideoEncodeAV1DecoderModelInfo.BUFFER_DELAY_LENGTH_MINUS_1
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            org.lwjgl.system.MemoryUtil.memPutByte(r0, r1)
            return
    }

    public static void nbuffer_removal_time_length_minus_1(long r5, byte r7) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.video.StdVideoEncodeAV1DecoderModelInfo.BUFFER_REMOVAL_TIME_LENGTH_MINUS_1
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            org.lwjgl.system.MemoryUtil.memPutByte(r0, r1)
            return
    }

    public static void nframe_presentation_time_length_minus_1(long r5, byte r7) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.video.StdVideoEncodeAV1DecoderModelInfo.FRAME_PRESENTATION_TIME_LENGTH_MINUS_1
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            org.lwjgl.system.MemoryUtil.memPutByte(r0, r1)
            return
    }

    public static void nreserved1(long r5, byte r7) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.video.StdVideoEncodeAV1DecoderModelInfo.RESERVED1
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            org.lwjgl.system.MemoryUtil.memPutByte(r0, r1)
            return
    }

    public static void nnum_units_in_decoding_tick(long r5, int r7) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.video.StdVideoEncodeAV1DecoderModelInfo.NUM_UNITS_IN_DECODING_TICK
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
            org.lwjgl.vulkan.video.StdVideoEncodeAV1DecoderModelInfo r0 = r0.create(r1, r2)
            return r0
    }

    static {
            r0 = 5
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
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 3
            r3 = 1
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 4
            r3 = 4
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            org.lwjgl.system.Struct$Layout r0 = __struct(r0)
            r5 = r0
            r0 = r5
            int r0 = r0.getSize()
            org.lwjgl.vulkan.video.StdVideoEncodeAV1DecoderModelInfo.SIZEOF = r0
            r0 = r5
            int r0 = r0.getAlignment()
            org.lwjgl.vulkan.video.StdVideoEncodeAV1DecoderModelInfo.ALIGNOF = r0
            r0 = r5
            r1 = 0
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.video.StdVideoEncodeAV1DecoderModelInfo.BUFFER_DELAY_LENGTH_MINUS_1 = r0
            r0 = r5
            r1 = 1
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.video.StdVideoEncodeAV1DecoderModelInfo.BUFFER_REMOVAL_TIME_LENGTH_MINUS_1 = r0
            r0 = r5
            r1 = 2
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.video.StdVideoEncodeAV1DecoderModelInfo.FRAME_PRESENTATION_TIME_LENGTH_MINUS_1 = r0
            r0 = r5
            r1 = 3
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.video.StdVideoEncodeAV1DecoderModelInfo.RESERVED1 = r0
            r0 = r5
            r1 = 4
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.video.StdVideoEncodeAV1DecoderModelInfo.NUM_UNITS_IN_DECODING_TICK = r0
            return
    }
}
