package org.lwjgl.vulkan.video;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/video/StdVideoAV1CDEF.class */
public class StdVideoAV1CDEF extends org.lwjgl.system.Struct<org.lwjgl.vulkan.video.StdVideoAV1CDEF> implements org.lwjgl.system.NativeResource {
    public static final int SIZEOF = 0;
    public static final int ALIGNOF = 0;
    public static final int CDEF_DAMPING_MINUS_3 = 0;
    public static final int CDEF_BITS = 0;
    public static final int CDEF_Y_PRI_STRENGTH = 0;
    public static final int CDEF_Y_SEC_STRENGTH = 0;
    public static final int CDEF_UV_PRI_STRENGTH = 0;
    public static final int CDEF_UV_SEC_STRENGTH = 0;

    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/video/StdVideoAV1CDEF$Buffer.class */
    public static class Buffer extends org.lwjgl.system.StructBuffer<org.lwjgl.vulkan.video.StdVideoAV1CDEF, org.lwjgl.vulkan.video.StdVideoAV1CDEF.Buffer> implements org.lwjgl.system.NativeResource {
        private static final org.lwjgl.vulkan.video.StdVideoAV1CDEF ELEMENT_FACTORY = null;

        public Buffer(java.nio.ByteBuffer r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r6
                int r2 = r2.remaining()
                int r3 = org.lwjgl.vulkan.video.StdVideoAV1CDEF.SIZEOF
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
        protected org.lwjgl.vulkan.video.StdVideoAV1CDEF.Buffer self() {
                r2 = this;
                r0 = r2
                return r0
        }

        protected org.lwjgl.vulkan.video.StdVideoAV1CDEF.Buffer create(long r11, java.nio.ByteBuffer r13, int r14, int r15, int r16, int r17) {
                r10 = this;
                org.lwjgl.vulkan.video.StdVideoAV1CDEF$Buffer r0 = new org.lwjgl.vulkan.video.StdVideoAV1CDEF$Buffer
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
        protected org.lwjgl.vulkan.video.StdVideoAV1CDEF getElementFactory() {
                r2 = this;
                org.lwjgl.vulkan.video.StdVideoAV1CDEF r0 = org.lwjgl.vulkan.video.StdVideoAV1CDEF.Buffer.ELEMENT_FACTORY
                return r0
        }

        @org.lwjgl.system.NativeType("uint8_t")
        public byte cdef_damping_minus_3() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                byte r0 = org.lwjgl.vulkan.video.StdVideoAV1CDEF.ncdef_damping_minus_3(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint8_t")
        public byte cdef_bits() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                byte r0 = org.lwjgl.vulkan.video.StdVideoAV1CDEF.ncdef_bits(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint8_t[STD_VIDEO_AV1_MAX_CDEF_FILTER_STRENGTHS]")
        public java.nio.ByteBuffer cdef_y_pri_strength() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                java.nio.ByteBuffer r0 = org.lwjgl.vulkan.video.StdVideoAV1CDEF.ncdef_y_pri_strength(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint8_t")
        public byte cdef_y_pri_strength(int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                byte r0 = org.lwjgl.vulkan.video.StdVideoAV1CDEF.ncdef_y_pri_strength(r0, r1)
                return r0
        }

        @org.lwjgl.system.NativeType("uint8_t[STD_VIDEO_AV1_MAX_CDEF_FILTER_STRENGTHS]")
        public java.nio.ByteBuffer cdef_y_sec_strength() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                java.nio.ByteBuffer r0 = org.lwjgl.vulkan.video.StdVideoAV1CDEF.ncdef_y_sec_strength(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint8_t")
        public byte cdef_y_sec_strength(int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                byte r0 = org.lwjgl.vulkan.video.StdVideoAV1CDEF.ncdef_y_sec_strength(r0, r1)
                return r0
        }

        @org.lwjgl.system.NativeType("uint8_t[STD_VIDEO_AV1_MAX_CDEF_FILTER_STRENGTHS]")
        public java.nio.ByteBuffer cdef_uv_pri_strength() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                java.nio.ByteBuffer r0 = org.lwjgl.vulkan.video.StdVideoAV1CDEF.ncdef_uv_pri_strength(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint8_t")
        public byte cdef_uv_pri_strength(int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                byte r0 = org.lwjgl.vulkan.video.StdVideoAV1CDEF.ncdef_uv_pri_strength(r0, r1)
                return r0
        }

        @org.lwjgl.system.NativeType("uint8_t[STD_VIDEO_AV1_MAX_CDEF_FILTER_STRENGTHS]")
        public java.nio.ByteBuffer cdef_uv_sec_strength() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                java.nio.ByteBuffer r0 = org.lwjgl.vulkan.video.StdVideoAV1CDEF.ncdef_uv_sec_strength(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint8_t")
        public byte cdef_uv_sec_strength(int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                byte r0 = org.lwjgl.vulkan.video.StdVideoAV1CDEF.ncdef_uv_sec_strength(r0, r1)
                return r0
        }

        public org.lwjgl.vulkan.video.StdVideoAV1CDEF.Buffer cdef_damping_minus_3(@org.lwjgl.system.NativeType("uint8_t") byte r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.video.StdVideoAV1CDEF.ncdef_damping_minus_3(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.video.StdVideoAV1CDEF.Buffer cdef_bits(@org.lwjgl.system.NativeType("uint8_t") byte r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.video.StdVideoAV1CDEF.ncdef_bits(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.video.StdVideoAV1CDEF.Buffer cdef_y_pri_strength(@org.lwjgl.system.NativeType("uint8_t[STD_VIDEO_AV1_MAX_CDEF_FILTER_STRENGTHS]") java.nio.ByteBuffer r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.video.StdVideoAV1CDEF.ncdef_y_pri_strength(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.video.StdVideoAV1CDEF.Buffer cdef_y_pri_strength(int r6, @org.lwjgl.system.NativeType("uint8_t") byte r7) {
                r5 = this;
                r0 = r5
                long r0 = r0.address()
                r1 = r6
                r2 = r7
                org.lwjgl.vulkan.video.StdVideoAV1CDEF.ncdef_y_pri_strength(r0, r1, r2)
                r0 = r5
                return r0
        }

        public org.lwjgl.vulkan.video.StdVideoAV1CDEF.Buffer cdef_y_sec_strength(@org.lwjgl.system.NativeType("uint8_t[STD_VIDEO_AV1_MAX_CDEF_FILTER_STRENGTHS]") java.nio.ByteBuffer r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.video.StdVideoAV1CDEF.ncdef_y_sec_strength(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.video.StdVideoAV1CDEF.Buffer cdef_y_sec_strength(int r6, @org.lwjgl.system.NativeType("uint8_t") byte r7) {
                r5 = this;
                r0 = r5
                long r0 = r0.address()
                r1 = r6
                r2 = r7
                org.lwjgl.vulkan.video.StdVideoAV1CDEF.ncdef_y_sec_strength(r0, r1, r2)
                r0 = r5
                return r0
        }

        public org.lwjgl.vulkan.video.StdVideoAV1CDEF.Buffer cdef_uv_pri_strength(@org.lwjgl.system.NativeType("uint8_t[STD_VIDEO_AV1_MAX_CDEF_FILTER_STRENGTHS]") java.nio.ByteBuffer r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.video.StdVideoAV1CDEF.ncdef_uv_pri_strength(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.video.StdVideoAV1CDEF.Buffer cdef_uv_pri_strength(int r6, @org.lwjgl.system.NativeType("uint8_t") byte r7) {
                r5 = this;
                r0 = r5
                long r0 = r0.address()
                r1 = r6
                r2 = r7
                org.lwjgl.vulkan.video.StdVideoAV1CDEF.ncdef_uv_pri_strength(r0, r1, r2)
                r0 = r5
                return r0
        }

        public org.lwjgl.vulkan.video.StdVideoAV1CDEF.Buffer cdef_uv_sec_strength(@org.lwjgl.system.NativeType("uint8_t[STD_VIDEO_AV1_MAX_CDEF_FILTER_STRENGTHS]") java.nio.ByteBuffer r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.video.StdVideoAV1CDEF.ncdef_uv_sec_strength(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.video.StdVideoAV1CDEF.Buffer cdef_uv_sec_strength(int r6, @org.lwjgl.system.NativeType("uint8_t") byte r7) {
                r5 = this;
                r0 = r5
                long r0 = r0.address()
                r1 = r6
                r2 = r7
                org.lwjgl.vulkan.video.StdVideoAV1CDEF.ncdef_uv_sec_strength(r0, r1, r2)
                r0 = r5
                return r0
        }

        @Override // org.lwjgl.system.StructBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.Struct getElementFactory() {
                r2 = this;
                r0 = r2
                org.lwjgl.vulkan.video.StdVideoAV1CDEF r0 = r0.getElementFactory()
                return r0
        }

        /* JADX INFO: renamed from: create, reason: collision with other method in class */
        protected /* bridge */ /* synthetic */ org.lwjgl.system.CustomBuffer m7334create(long r10, java.nio.ByteBuffer r12, int r13, int r14, int r15, int r16) {
                r9 = this;
                r0 = r9
                r1 = r10
                r2 = r12
                r3 = r13
                r4 = r14
                r5 = r15
                r6 = r16
                org.lwjgl.vulkan.video.StdVideoAV1CDEF$Buffer r0 = r0.create(r1, r2, r3, r4, r5, r6)
                return r0
        }

        @Override // org.lwjgl.system.CustomBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.CustomBuffer self() {
                r2 = this;
                r0 = r2
                org.lwjgl.vulkan.video.StdVideoAV1CDEF$Buffer r0 = r0.self()
                return r0
        }

        static {
                r0 = -1
                org.lwjgl.vulkan.video.StdVideoAV1CDEF r0 = org.lwjgl.vulkan.video.StdVideoAV1CDEF.create(r0)
                org.lwjgl.vulkan.video.StdVideoAV1CDEF.Buffer.ELEMENT_FACTORY = r0
                return
        }
    }

    protected StdVideoAV1CDEF(long r6, java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    protected org.lwjgl.vulkan.video.StdVideoAV1CDEF create(long r7, java.nio.ByteBuffer r9) {
            r6 = this;
            org.lwjgl.vulkan.video.StdVideoAV1CDEF r0 = new org.lwjgl.vulkan.video.StdVideoAV1CDEF
            r1 = r0
            r2 = r7
            r3 = r9
            r1.<init>(r2, r3)
            return r0
    }

    public StdVideoAV1CDEF(java.nio.ByteBuffer r7) {
            r6 = this;
            r0 = r6
            r1 = r7
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            r2 = r7
            int r3 = org.lwjgl.vulkan.video.StdVideoAV1CDEF.SIZEOF
            java.nio.ByteBuffer r2 = __checkContainer(r2, r3)
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
            r2 = this;
            int r0 = org.lwjgl.vulkan.video.StdVideoAV1CDEF.SIZEOF
            return r0
    }

    @org.lwjgl.system.NativeType("uint8_t")
    public byte cdef_damping_minus_3() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            byte r0 = ncdef_damping_minus_3(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("uint8_t")
    public byte cdef_bits() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            byte r0 = ncdef_bits(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("uint8_t[STD_VIDEO_AV1_MAX_CDEF_FILTER_STRENGTHS]")
    public java.nio.ByteBuffer cdef_y_pri_strength() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            java.nio.ByteBuffer r0 = ncdef_y_pri_strength(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("uint8_t")
    public byte cdef_y_pri_strength(int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            byte r0 = ncdef_y_pri_strength(r0, r1)
            return r0
    }

    @org.lwjgl.system.NativeType("uint8_t[STD_VIDEO_AV1_MAX_CDEF_FILTER_STRENGTHS]")
    public java.nio.ByteBuffer cdef_y_sec_strength() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            java.nio.ByteBuffer r0 = ncdef_y_sec_strength(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("uint8_t")
    public byte cdef_y_sec_strength(int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            byte r0 = ncdef_y_sec_strength(r0, r1)
            return r0
    }

    @org.lwjgl.system.NativeType("uint8_t[STD_VIDEO_AV1_MAX_CDEF_FILTER_STRENGTHS]")
    public java.nio.ByteBuffer cdef_uv_pri_strength() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            java.nio.ByteBuffer r0 = ncdef_uv_pri_strength(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("uint8_t")
    public byte cdef_uv_pri_strength(int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            byte r0 = ncdef_uv_pri_strength(r0, r1)
            return r0
    }

    @org.lwjgl.system.NativeType("uint8_t[STD_VIDEO_AV1_MAX_CDEF_FILTER_STRENGTHS]")
    public java.nio.ByteBuffer cdef_uv_sec_strength() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            java.nio.ByteBuffer r0 = ncdef_uv_sec_strength(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("uint8_t")
    public byte cdef_uv_sec_strength(int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            byte r0 = ncdef_uv_sec_strength(r0, r1)
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoAV1CDEF cdef_damping_minus_3(@org.lwjgl.system.NativeType("uint8_t") byte r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            ncdef_damping_minus_3(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoAV1CDEF cdef_bits(@org.lwjgl.system.NativeType("uint8_t") byte r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            ncdef_bits(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoAV1CDEF cdef_y_pri_strength(@org.lwjgl.system.NativeType("uint8_t[STD_VIDEO_AV1_MAX_CDEF_FILTER_STRENGTHS]") java.nio.ByteBuffer r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            ncdef_y_pri_strength(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoAV1CDEF cdef_y_pri_strength(int r6, @org.lwjgl.system.NativeType("uint8_t") byte r7) {
            r5 = this;
            r0 = r5
            long r0 = r0.address()
            r1 = r6
            r2 = r7
            ncdef_y_pri_strength(r0, r1, r2)
            r0 = r5
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoAV1CDEF cdef_y_sec_strength(@org.lwjgl.system.NativeType("uint8_t[STD_VIDEO_AV1_MAX_CDEF_FILTER_STRENGTHS]") java.nio.ByteBuffer r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            ncdef_y_sec_strength(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoAV1CDEF cdef_y_sec_strength(int r6, @org.lwjgl.system.NativeType("uint8_t") byte r7) {
            r5 = this;
            r0 = r5
            long r0 = r0.address()
            r1 = r6
            r2 = r7
            ncdef_y_sec_strength(r0, r1, r2)
            r0 = r5
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoAV1CDEF cdef_uv_pri_strength(@org.lwjgl.system.NativeType("uint8_t[STD_VIDEO_AV1_MAX_CDEF_FILTER_STRENGTHS]") java.nio.ByteBuffer r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            ncdef_uv_pri_strength(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoAV1CDEF cdef_uv_pri_strength(int r6, @org.lwjgl.system.NativeType("uint8_t") byte r7) {
            r5 = this;
            r0 = r5
            long r0 = r0.address()
            r1 = r6
            r2 = r7
            ncdef_uv_pri_strength(r0, r1, r2)
            r0 = r5
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoAV1CDEF cdef_uv_sec_strength(@org.lwjgl.system.NativeType("uint8_t[STD_VIDEO_AV1_MAX_CDEF_FILTER_STRENGTHS]") java.nio.ByteBuffer r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            ncdef_uv_sec_strength(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoAV1CDEF cdef_uv_sec_strength(int r6, @org.lwjgl.system.NativeType("uint8_t") byte r7) {
            r5 = this;
            r0 = r5
            long r0 = r0.address()
            r1 = r6
            r2 = r7
            ncdef_uv_sec_strength(r0, r1, r2)
            r0 = r5
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoAV1CDEF set(byte r4, byte r5, java.nio.ByteBuffer r6, java.nio.ByteBuffer r7, java.nio.ByteBuffer r8, java.nio.ByteBuffer r9) {
            r3 = this;
            r0 = r3
            r1 = r4
            org.lwjgl.vulkan.video.StdVideoAV1CDEF r0 = r0.cdef_damping_minus_3(r1)
            r0 = r3
            r1 = r5
            org.lwjgl.vulkan.video.StdVideoAV1CDEF r0 = r0.cdef_bits(r1)
            r0 = r3
            r1 = r6
            org.lwjgl.vulkan.video.StdVideoAV1CDEF r0 = r0.cdef_y_pri_strength(r1)
            r0 = r3
            r1 = r7
            org.lwjgl.vulkan.video.StdVideoAV1CDEF r0 = r0.cdef_y_sec_strength(r1)
            r0 = r3
            r1 = r8
            org.lwjgl.vulkan.video.StdVideoAV1CDEF r0 = r0.cdef_uv_pri_strength(r1)
            r0 = r3
            r1 = r9
            org.lwjgl.vulkan.video.StdVideoAV1CDEF r0 = r0.cdef_uv_sec_strength(r1)
            r0 = r3
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoAV1CDEF set(org.lwjgl.vulkan.video.StdVideoAV1CDEF r8) {
            r7 = this;
            r0 = r8
            long r0 = r0.address()
            r1 = r7
            long r1 = r1.address()
            int r2 = org.lwjgl.vulkan.video.StdVideoAV1CDEF.SIZEOF
            long r2 = (long) r2
            org.lwjgl.system.MemoryUtil.memCopy(r0, r1, r2)
            r0 = r7
            return r0
    }

    public static org.lwjgl.vulkan.video.StdVideoAV1CDEF malloc() {
            org.lwjgl.vulkan.video.StdVideoAV1CDEF r0 = new org.lwjgl.vulkan.video.StdVideoAV1CDEF
            r1 = r0
            int r2 = org.lwjgl.vulkan.video.StdVideoAV1CDEF.SIZEOF
            long r2 = (long) r2
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.video.StdVideoAV1CDEF calloc() {
            org.lwjgl.vulkan.video.StdVideoAV1CDEF r0 = new org.lwjgl.vulkan.video.StdVideoAV1CDEF
            r1 = r0
            r2 = 1
            int r3 = org.lwjgl.vulkan.video.StdVideoAV1CDEF.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.video.StdVideoAV1CDEF create() {
            int r0 = org.lwjgl.vulkan.video.StdVideoAV1CDEF.SIZEOF
            java.nio.ByteBuffer r0 = org.lwjgl.BufferUtils.createByteBuffer(r0)
            r6 = r0
            org.lwjgl.vulkan.video.StdVideoAV1CDEF r0 = new org.lwjgl.vulkan.video.StdVideoAV1CDEF
            r1 = r0
            r2 = r6
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.video.StdVideoAV1CDEF create(long r6) {
            org.lwjgl.vulkan.video.StdVideoAV1CDEF r0 = new org.lwjgl.vulkan.video.StdVideoAV1CDEF
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.video.StdVideoAV1CDEF createSafe(long r6) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.vulkan.video.StdVideoAV1CDEF r0 = new org.lwjgl.vulkan.video.StdVideoAV1CDEF
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static org.lwjgl.vulkan.video.StdVideoAV1CDEF.Buffer malloc(int r6) {
            org.lwjgl.vulkan.video.StdVideoAV1CDEF$Buffer r0 = new org.lwjgl.vulkan.video.StdVideoAV1CDEF$Buffer
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.vulkan.video.StdVideoAV1CDEF.SIZEOF
            long r2 = __checkMalloc(r2, r3)
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.video.StdVideoAV1CDEF.Buffer calloc(int r7) {
            org.lwjgl.vulkan.video.StdVideoAV1CDEF$Buffer r0 = new org.lwjgl.vulkan.video.StdVideoAV1CDEF$Buffer
            r1 = r0
            r2 = r7
            long r2 = (long) r2
            int r3 = org.lwjgl.vulkan.video.StdVideoAV1CDEF.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.video.StdVideoAV1CDEF.Buffer create(int r10) {
            r0 = r10
            int r1 = org.lwjgl.vulkan.video.StdVideoAV1CDEF.SIZEOF
            java.nio.ByteBuffer r0 = __create(r0, r1)
            r11 = r0
            org.lwjgl.vulkan.video.StdVideoAV1CDEF$Buffer r0 = new org.lwjgl.vulkan.video.StdVideoAV1CDEF$Buffer
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

    public static org.lwjgl.vulkan.video.StdVideoAV1CDEF.Buffer create(long r6, int r8) {
            org.lwjgl.vulkan.video.StdVideoAV1CDEF$Buffer r0 = new org.lwjgl.vulkan.video.StdVideoAV1CDEF$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.video.StdVideoAV1CDEF.Buffer createSafe(long r6, int r8) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.vulkan.video.StdVideoAV1CDEF$Buffer r0 = new org.lwjgl.vulkan.video.StdVideoAV1CDEF$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static org.lwjgl.vulkan.video.StdVideoAV1CDEF malloc(org.lwjgl.system.MemoryStack r6) {
            org.lwjgl.vulkan.video.StdVideoAV1CDEF r0 = new org.lwjgl.vulkan.video.StdVideoAV1CDEF
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.vulkan.video.StdVideoAV1CDEF.ALIGNOF
            int r4 = org.lwjgl.vulkan.video.StdVideoAV1CDEF.SIZEOF
            long r2 = r2.nmalloc(r3, r4)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.video.StdVideoAV1CDEF calloc(org.lwjgl.system.MemoryStack r7) {
            org.lwjgl.vulkan.video.StdVideoAV1CDEF r0 = new org.lwjgl.vulkan.video.StdVideoAV1CDEF
            r1 = r0
            r2 = r7
            int r3 = org.lwjgl.vulkan.video.StdVideoAV1CDEF.ALIGNOF
            r4 = 1
            int r5 = org.lwjgl.vulkan.video.StdVideoAV1CDEF.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.video.StdVideoAV1CDEF.Buffer malloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.vulkan.video.StdVideoAV1CDEF$Buffer r0 = new org.lwjgl.vulkan.video.StdVideoAV1CDEF$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.vulkan.video.StdVideoAV1CDEF.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.vulkan.video.StdVideoAV1CDEF.SIZEOF
            int r4 = r4 * r5
            long r2 = r2.nmalloc(r3, r4)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.video.StdVideoAV1CDEF.Buffer calloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.vulkan.video.StdVideoAV1CDEF$Buffer r0 = new org.lwjgl.vulkan.video.StdVideoAV1CDEF$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.vulkan.video.StdVideoAV1CDEF.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.vulkan.video.StdVideoAV1CDEF.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static byte ncdef_damping_minus_3(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.video.StdVideoAV1CDEF.CDEF_DAMPING_MINUS_3
            long r1 = (long) r1
            long r0 = r0 + r1
            byte r0 = org.lwjgl.system.MemoryUtil.memGetByte(r0)
            return r0
    }

    public static byte ncdef_bits(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.video.StdVideoAV1CDEF.CDEF_BITS
            long r1 = (long) r1
            long r0 = r0 + r1
            byte r0 = org.lwjgl.system.MemoryUtil.memGetByte(r0)
            return r0
    }

    public static java.nio.ByteBuffer ncdef_y_pri_strength(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.video.StdVideoAV1CDEF.CDEF_Y_PRI_STRENGTH
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = 8
            java.nio.ByteBuffer r0 = org.lwjgl.system.MemoryUtil.memByteBuffer(r0, r1)
            return r0
    }

    public static byte ncdef_y_pri_strength(long r7, int r9) {
            r0 = r7
            int r1 = org.lwjgl.vulkan.video.StdVideoAV1CDEF.CDEF_Y_PRI_STRENGTH
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r9
            r2 = 8
            long r1 = org.lwjgl.system.Checks.check(r1, r2)
            r2 = 1
            long r1 = r1 * r2
            long r0 = r0 + r1
            byte r0 = org.lwjgl.system.MemoryUtil.memGetByte(r0)
            return r0
    }

    public static java.nio.ByteBuffer ncdef_y_sec_strength(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.video.StdVideoAV1CDEF.CDEF_Y_SEC_STRENGTH
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = 8
            java.nio.ByteBuffer r0 = org.lwjgl.system.MemoryUtil.memByteBuffer(r0, r1)
            return r0
    }

    public static byte ncdef_y_sec_strength(long r7, int r9) {
            r0 = r7
            int r1 = org.lwjgl.vulkan.video.StdVideoAV1CDEF.CDEF_Y_SEC_STRENGTH
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r9
            r2 = 8
            long r1 = org.lwjgl.system.Checks.check(r1, r2)
            r2 = 1
            long r1 = r1 * r2
            long r0 = r0 + r1
            byte r0 = org.lwjgl.system.MemoryUtil.memGetByte(r0)
            return r0
    }

    public static java.nio.ByteBuffer ncdef_uv_pri_strength(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.video.StdVideoAV1CDEF.CDEF_UV_PRI_STRENGTH
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = 8
            java.nio.ByteBuffer r0 = org.lwjgl.system.MemoryUtil.memByteBuffer(r0, r1)
            return r0
    }

    public static byte ncdef_uv_pri_strength(long r7, int r9) {
            r0 = r7
            int r1 = org.lwjgl.vulkan.video.StdVideoAV1CDEF.CDEF_UV_PRI_STRENGTH
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r9
            r2 = 8
            long r1 = org.lwjgl.system.Checks.check(r1, r2)
            r2 = 1
            long r1 = r1 * r2
            long r0 = r0 + r1
            byte r0 = org.lwjgl.system.MemoryUtil.memGetByte(r0)
            return r0
    }

    public static java.nio.ByteBuffer ncdef_uv_sec_strength(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.video.StdVideoAV1CDEF.CDEF_UV_SEC_STRENGTH
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = 8
            java.nio.ByteBuffer r0 = org.lwjgl.system.MemoryUtil.memByteBuffer(r0, r1)
            return r0
    }

    public static byte ncdef_uv_sec_strength(long r7, int r9) {
            r0 = r7
            int r1 = org.lwjgl.vulkan.video.StdVideoAV1CDEF.CDEF_UV_SEC_STRENGTH
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r9
            r2 = 8
            long r1 = org.lwjgl.system.Checks.check(r1, r2)
            r2 = 1
            long r1 = r1 * r2
            long r0 = r0 + r1
            byte r0 = org.lwjgl.system.MemoryUtil.memGetByte(r0)
            return r0
    }

    public static void ncdef_damping_minus_3(long r5, byte r7) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.video.StdVideoAV1CDEF.CDEF_DAMPING_MINUS_3
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            org.lwjgl.system.MemoryUtil.memPutByte(r0, r1)
            return
    }

    public static void ncdef_bits(long r5, byte r7) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.video.StdVideoAV1CDEF.CDEF_BITS
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            org.lwjgl.system.MemoryUtil.memPutByte(r0, r1)
            return
    }

    public static void ncdef_y_pri_strength(long r7, java.nio.ByteBuffer r9) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lc
            r0 = r9
            r1 = 8
            org.lwjgl.system.Checks.checkGT(r0, r1)
        Lc:
            r0 = r9
            long r0 = org.lwjgl.system.MemoryUtil.memAddress(r0)
            r1 = r7
            int r2 = org.lwjgl.vulkan.video.StdVideoAV1CDEF.CDEF_Y_PRI_STRENGTH
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

    public static void ncdef_y_pri_strength(long r7, int r9, byte r10) {
            r0 = r7
            int r1 = org.lwjgl.vulkan.video.StdVideoAV1CDEF.CDEF_Y_PRI_STRENGTH
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r9
            r2 = 8
            long r1 = org.lwjgl.system.Checks.check(r1, r2)
            r2 = 1
            long r1 = r1 * r2
            long r0 = r0 + r1
            r1 = r10
            org.lwjgl.system.MemoryUtil.memPutByte(r0, r1)
            return
    }

    public static void ncdef_y_sec_strength(long r7, java.nio.ByteBuffer r9) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lc
            r0 = r9
            r1 = 8
            org.lwjgl.system.Checks.checkGT(r0, r1)
        Lc:
            r0 = r9
            long r0 = org.lwjgl.system.MemoryUtil.memAddress(r0)
            r1 = r7
            int r2 = org.lwjgl.vulkan.video.StdVideoAV1CDEF.CDEF_Y_SEC_STRENGTH
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

    public static void ncdef_y_sec_strength(long r7, int r9, byte r10) {
            r0 = r7
            int r1 = org.lwjgl.vulkan.video.StdVideoAV1CDEF.CDEF_Y_SEC_STRENGTH
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r9
            r2 = 8
            long r1 = org.lwjgl.system.Checks.check(r1, r2)
            r2 = 1
            long r1 = r1 * r2
            long r0 = r0 + r1
            r1 = r10
            org.lwjgl.system.MemoryUtil.memPutByte(r0, r1)
            return
    }

    public static void ncdef_uv_pri_strength(long r7, java.nio.ByteBuffer r9) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lc
            r0 = r9
            r1 = 8
            org.lwjgl.system.Checks.checkGT(r0, r1)
        Lc:
            r0 = r9
            long r0 = org.lwjgl.system.MemoryUtil.memAddress(r0)
            r1 = r7
            int r2 = org.lwjgl.vulkan.video.StdVideoAV1CDEF.CDEF_UV_PRI_STRENGTH
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

    public static void ncdef_uv_pri_strength(long r7, int r9, byte r10) {
            r0 = r7
            int r1 = org.lwjgl.vulkan.video.StdVideoAV1CDEF.CDEF_UV_PRI_STRENGTH
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r9
            r2 = 8
            long r1 = org.lwjgl.system.Checks.check(r1, r2)
            r2 = 1
            long r1 = r1 * r2
            long r0 = r0 + r1
            r1 = r10
            org.lwjgl.system.MemoryUtil.memPutByte(r0, r1)
            return
    }

    public static void ncdef_uv_sec_strength(long r7, java.nio.ByteBuffer r9) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lc
            r0 = r9
            r1 = 8
            org.lwjgl.system.Checks.checkGT(r0, r1)
        Lc:
            r0 = r9
            long r0 = org.lwjgl.system.MemoryUtil.memAddress(r0)
            r1 = r7
            int r2 = org.lwjgl.vulkan.video.StdVideoAV1CDEF.CDEF_UV_SEC_STRENGTH
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

    public static void ncdef_uv_sec_strength(long r7, int r9, byte r10) {
            r0 = r7
            int r1 = org.lwjgl.vulkan.video.StdVideoAV1CDEF.CDEF_UV_SEC_STRENGTH
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r9
            r2 = 8
            long r1 = org.lwjgl.system.Checks.check(r1, r2)
            r2 = 1
            long r1 = r1 * r2
            long r0 = r0 + r1
            r1 = r10
            org.lwjgl.system.MemoryUtil.memPutByte(r0, r1)
            return
    }

    @Override // org.lwjgl.system.Struct
    protected /* bridge */ /* synthetic */ org.lwjgl.system.Struct create(long r6, java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            org.lwjgl.vulkan.video.StdVideoAV1CDEF r0 = r0.create(r1, r2)
            return r0
    }

    static {
            r0 = 6
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
            r4 = 8
            org.lwjgl.system.Struct$Member r3 = __array(r3, r4)
            r1[r2] = r3
            r1 = r0
            r2 = 3
            r3 = 1
            r4 = 8
            org.lwjgl.system.Struct$Member r3 = __array(r3, r4)
            r1[r2] = r3
            r1 = r0
            r2 = 4
            r3 = 1
            r4 = 8
            org.lwjgl.system.Struct$Member r3 = __array(r3, r4)
            r1[r2] = r3
            r1 = r0
            r2 = 5
            r3 = 1
            r4 = 8
            org.lwjgl.system.Struct$Member r3 = __array(r3, r4)
            r1[r2] = r3
            org.lwjgl.system.Struct$Layout r0 = __struct(r0)
            r6 = r0
            r0 = r6
            int r0 = r0.getSize()
            org.lwjgl.vulkan.video.StdVideoAV1CDEF.SIZEOF = r0
            r0 = r6
            int r0 = r0.getAlignment()
            org.lwjgl.vulkan.video.StdVideoAV1CDEF.ALIGNOF = r0
            r0 = r6
            r1 = 0
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.video.StdVideoAV1CDEF.CDEF_DAMPING_MINUS_3 = r0
            r0 = r6
            r1 = 1
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.video.StdVideoAV1CDEF.CDEF_BITS = r0
            r0 = r6
            r1 = 2
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.video.StdVideoAV1CDEF.CDEF_Y_PRI_STRENGTH = r0
            r0 = r6
            r1 = 3
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.video.StdVideoAV1CDEF.CDEF_Y_SEC_STRENGTH = r0
            r0 = r6
            r1 = 4
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.video.StdVideoAV1CDEF.CDEF_UV_PRI_STRENGTH = r0
            r0 = r6
            r1 = 5
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.video.StdVideoAV1CDEF.CDEF_UV_SEC_STRENGTH = r0
            return
    }
}
