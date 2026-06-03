package org.lwjgl.util.spvc;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/util/spvc/SpvcMslSamplerYcbcrConversion.class */
@org.lwjgl.system.NativeType("struct spvc_msl_sampler_ycbcr_conversion")
public class SpvcMslSamplerYcbcrConversion extends org.lwjgl.system.Struct<org.lwjgl.util.spvc.SpvcMslSamplerYcbcrConversion> implements org.lwjgl.system.NativeResource {
    public static final int SIZEOF = 0;
    public static final int ALIGNOF = 0;
    public static final int PLANES = 0;
    public static final int RESOLUTION = 0;
    public static final int CHROMA_FILTER = 0;
    public static final int X_CHROMA_OFFSET = 0;
    public static final int Y_CHROMA_OFFSET = 0;
    public static final int SWIZZLE = 0;
    public static final int YCBCR_MODEL = 0;
    public static final int YCBCR_RANGE = 0;
    public static final int BPC = 0;

    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/util/spvc/SpvcMslSamplerYcbcrConversion$Buffer.class */
    public static class Buffer extends org.lwjgl.system.StructBuffer<org.lwjgl.util.spvc.SpvcMslSamplerYcbcrConversion, org.lwjgl.util.spvc.SpvcMslSamplerYcbcrConversion.Buffer> implements org.lwjgl.system.NativeResource {
        private static final org.lwjgl.util.spvc.SpvcMslSamplerYcbcrConversion ELEMENT_FACTORY = null;

        public Buffer(java.nio.ByteBuffer r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r6
                int r2 = r2.remaining()
                int r3 = org.lwjgl.util.spvc.SpvcMslSamplerYcbcrConversion.SIZEOF
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
        protected org.lwjgl.util.spvc.SpvcMslSamplerYcbcrConversion.Buffer self() {
                r2 = this;
                r0 = r2
                return r0
        }

        protected org.lwjgl.util.spvc.SpvcMslSamplerYcbcrConversion.Buffer create(long r11, java.nio.ByteBuffer r13, int r14, int r15, int r16, int r17) {
                r10 = this;
                org.lwjgl.util.spvc.SpvcMslSamplerYcbcrConversion$Buffer r0 = new org.lwjgl.util.spvc.SpvcMslSamplerYcbcrConversion$Buffer
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
        protected org.lwjgl.util.spvc.SpvcMslSamplerYcbcrConversion getElementFactory() {
                r2 = this;
                org.lwjgl.util.spvc.SpvcMslSamplerYcbcrConversion r0 = org.lwjgl.util.spvc.SpvcMslSamplerYcbcrConversion.Buffer.ELEMENT_FACTORY
                return r0
        }

        @org.lwjgl.system.NativeType("unsigned int")
        public int planes() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.util.spvc.SpvcMslSamplerYcbcrConversion.nplanes(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("spvc_msl_format_resolution")
        public int resolution() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.util.spvc.SpvcMslSamplerYcbcrConversion.nresolution(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("spvc_msl_sampler_filter")
        public int chroma_filter() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.util.spvc.SpvcMslSamplerYcbcrConversion.nchroma_filter(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("spvc_msl_chroma_location")
        public int x_chroma_offset() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.util.spvc.SpvcMslSamplerYcbcrConversion.nx_chroma_offset(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("spvc_msl_chroma_location")
        public int y_chroma_offset() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.util.spvc.SpvcMslSamplerYcbcrConversion.ny_chroma_offset(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("spvc_msl_component_swizzle[4]")
        public java.nio.IntBuffer swizzle() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                java.nio.IntBuffer r0 = org.lwjgl.util.spvc.SpvcMslSamplerYcbcrConversion.nswizzle(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("spvc_msl_component_swizzle")
        public int swizzle(int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                int r0 = org.lwjgl.util.spvc.SpvcMslSamplerYcbcrConversion.nswizzle(r0, r1)
                return r0
        }

        @org.lwjgl.system.NativeType("spvc_msl_sampler_ycbcr_model_conversion")
        public int ycbcr_model() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.util.spvc.SpvcMslSamplerYcbcrConversion.nycbcr_model(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("spvc_msl_sampler_ycbcr_range")
        public int ycbcr_range() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.util.spvc.SpvcMslSamplerYcbcrConversion.nycbcr_range(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("unsigned int")
        public int bpc() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.util.spvc.SpvcMslSamplerYcbcrConversion.nbpc(r0)
                return r0
        }

        public org.lwjgl.util.spvc.SpvcMslSamplerYcbcrConversion.Buffer planes(@org.lwjgl.system.NativeType("unsigned int") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.util.spvc.SpvcMslSamplerYcbcrConversion.nplanes(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.util.spvc.SpvcMslSamplerYcbcrConversion.Buffer resolution(@org.lwjgl.system.NativeType("spvc_msl_format_resolution") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.util.spvc.SpvcMslSamplerYcbcrConversion.nresolution(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.util.spvc.SpvcMslSamplerYcbcrConversion.Buffer chroma_filter(@org.lwjgl.system.NativeType("spvc_msl_sampler_filter") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.util.spvc.SpvcMslSamplerYcbcrConversion.nchroma_filter(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.util.spvc.SpvcMslSamplerYcbcrConversion.Buffer x_chroma_offset(@org.lwjgl.system.NativeType("spvc_msl_chroma_location") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.util.spvc.SpvcMslSamplerYcbcrConversion.nx_chroma_offset(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.util.spvc.SpvcMslSamplerYcbcrConversion.Buffer y_chroma_offset(@org.lwjgl.system.NativeType("spvc_msl_chroma_location") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.util.spvc.SpvcMslSamplerYcbcrConversion.ny_chroma_offset(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.util.spvc.SpvcMslSamplerYcbcrConversion.Buffer swizzle(@org.lwjgl.system.NativeType("spvc_msl_component_swizzle[4]") java.nio.IntBuffer r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.util.spvc.SpvcMslSamplerYcbcrConversion.nswizzle(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.util.spvc.SpvcMslSamplerYcbcrConversion.Buffer swizzle(int r6, @org.lwjgl.system.NativeType("spvc_msl_component_swizzle") int r7) {
                r5 = this;
                r0 = r5
                long r0 = r0.address()
                r1 = r6
                r2 = r7
                org.lwjgl.util.spvc.SpvcMslSamplerYcbcrConversion.nswizzle(r0, r1, r2)
                r0 = r5
                return r0
        }

        public org.lwjgl.util.spvc.SpvcMslSamplerYcbcrConversion.Buffer ycbcr_model(@org.lwjgl.system.NativeType("spvc_msl_sampler_ycbcr_model_conversion") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.util.spvc.SpvcMslSamplerYcbcrConversion.nycbcr_model(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.util.spvc.SpvcMslSamplerYcbcrConversion.Buffer ycbcr_range(@org.lwjgl.system.NativeType("spvc_msl_sampler_ycbcr_range") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.util.spvc.SpvcMslSamplerYcbcrConversion.nycbcr_range(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.util.spvc.SpvcMslSamplerYcbcrConversion.Buffer bpc(@org.lwjgl.system.NativeType("unsigned int") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.util.spvc.SpvcMslSamplerYcbcrConversion.nbpc(r0, r1)
                r0 = r4
                return r0
        }

        @Override // org.lwjgl.system.StructBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.Struct getElementFactory() {
                r2 = this;
                r0 = r2
                org.lwjgl.util.spvc.SpvcMslSamplerYcbcrConversion r0 = r0.getElementFactory()
                return r0
        }

        /* JADX INFO: renamed from: create, reason: collision with other method in class */
        protected /* bridge */ /* synthetic */ org.lwjgl.system.CustomBuffer m3760create(long r10, java.nio.ByteBuffer r12, int r13, int r14, int r15, int r16) {
                r9 = this;
                r0 = r9
                r1 = r10
                r2 = r12
                r3 = r13
                r4 = r14
                r5 = r15
                r6 = r16
                org.lwjgl.util.spvc.SpvcMslSamplerYcbcrConversion$Buffer r0 = r0.create(r1, r2, r3, r4, r5, r6)
                return r0
        }

        @Override // org.lwjgl.system.CustomBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.CustomBuffer self() {
                r2 = this;
                r0 = r2
                org.lwjgl.util.spvc.SpvcMslSamplerYcbcrConversion$Buffer r0 = r0.self()
                return r0
        }

        static {
                r0 = -1
                org.lwjgl.util.spvc.SpvcMslSamplerYcbcrConversion r0 = org.lwjgl.util.spvc.SpvcMslSamplerYcbcrConversion.create(r0)
                org.lwjgl.util.spvc.SpvcMslSamplerYcbcrConversion.Buffer.ELEMENT_FACTORY = r0
                return
        }
    }

    protected SpvcMslSamplerYcbcrConversion(long r6, java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    protected org.lwjgl.util.spvc.SpvcMslSamplerYcbcrConversion create(long r7, java.nio.ByteBuffer r9) {
            r6 = this;
            org.lwjgl.util.spvc.SpvcMslSamplerYcbcrConversion r0 = new org.lwjgl.util.spvc.SpvcMslSamplerYcbcrConversion
            r1 = r0
            r2 = r7
            r3 = r9
            r1.<init>(r2, r3)
            return r0
    }

    public SpvcMslSamplerYcbcrConversion(java.nio.ByteBuffer r7) {
            r6 = this;
            r0 = r6
            r1 = r7
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            r2 = r7
            int r3 = org.lwjgl.util.spvc.SpvcMslSamplerYcbcrConversion.SIZEOF
            java.nio.ByteBuffer r2 = __checkContainer(r2, r3)
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
            r2 = this;
            int r0 = org.lwjgl.util.spvc.SpvcMslSamplerYcbcrConversion.SIZEOF
            return r0
    }

    @org.lwjgl.system.NativeType("unsigned int")
    public int planes() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nplanes(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("spvc_msl_format_resolution")
    public int resolution() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nresolution(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("spvc_msl_sampler_filter")
    public int chroma_filter() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nchroma_filter(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("spvc_msl_chroma_location")
    public int x_chroma_offset() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nx_chroma_offset(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("spvc_msl_chroma_location")
    public int y_chroma_offset() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = ny_chroma_offset(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("spvc_msl_component_swizzle[4]")
    public java.nio.IntBuffer swizzle() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            java.nio.IntBuffer r0 = nswizzle(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("spvc_msl_component_swizzle")
    public int swizzle(int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            int r0 = nswizzle(r0, r1)
            return r0
    }

    @org.lwjgl.system.NativeType("spvc_msl_sampler_ycbcr_model_conversion")
    public int ycbcr_model() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nycbcr_model(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("spvc_msl_sampler_ycbcr_range")
    public int ycbcr_range() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nycbcr_range(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("unsigned int")
    public int bpc() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nbpc(r0)
            return r0
    }

    public org.lwjgl.util.spvc.SpvcMslSamplerYcbcrConversion planes(@org.lwjgl.system.NativeType("unsigned int") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nplanes(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.util.spvc.SpvcMslSamplerYcbcrConversion resolution(@org.lwjgl.system.NativeType("spvc_msl_format_resolution") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nresolution(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.util.spvc.SpvcMslSamplerYcbcrConversion chroma_filter(@org.lwjgl.system.NativeType("spvc_msl_sampler_filter") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nchroma_filter(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.util.spvc.SpvcMslSamplerYcbcrConversion x_chroma_offset(@org.lwjgl.system.NativeType("spvc_msl_chroma_location") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nx_chroma_offset(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.util.spvc.SpvcMslSamplerYcbcrConversion y_chroma_offset(@org.lwjgl.system.NativeType("spvc_msl_chroma_location") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            ny_chroma_offset(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.util.spvc.SpvcMslSamplerYcbcrConversion swizzle(@org.lwjgl.system.NativeType("spvc_msl_component_swizzle[4]") java.nio.IntBuffer r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nswizzle(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.util.spvc.SpvcMslSamplerYcbcrConversion swizzle(int r6, @org.lwjgl.system.NativeType("spvc_msl_component_swizzle") int r7) {
            r5 = this;
            r0 = r5
            long r0 = r0.address()
            r1 = r6
            r2 = r7
            nswizzle(r0, r1, r2)
            r0 = r5
            return r0
    }

    public org.lwjgl.util.spvc.SpvcMslSamplerYcbcrConversion ycbcr_model(@org.lwjgl.system.NativeType("spvc_msl_sampler_ycbcr_model_conversion") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nycbcr_model(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.util.spvc.SpvcMslSamplerYcbcrConversion ycbcr_range(@org.lwjgl.system.NativeType("spvc_msl_sampler_ycbcr_range") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nycbcr_range(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.util.spvc.SpvcMslSamplerYcbcrConversion bpc(@org.lwjgl.system.NativeType("unsigned int") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nbpc(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.util.spvc.SpvcMslSamplerYcbcrConversion set(int r4, int r5, int r6, int r7, int r8, java.nio.IntBuffer r9, int r10, int r11, int r12) {
            r3 = this;
            r0 = r3
            r1 = r4
            org.lwjgl.util.spvc.SpvcMslSamplerYcbcrConversion r0 = r0.planes(r1)
            r0 = r3
            r1 = r5
            org.lwjgl.util.spvc.SpvcMslSamplerYcbcrConversion r0 = r0.resolution(r1)
            r0 = r3
            r1 = r6
            org.lwjgl.util.spvc.SpvcMslSamplerYcbcrConversion r0 = r0.chroma_filter(r1)
            r0 = r3
            r1 = r7
            org.lwjgl.util.spvc.SpvcMslSamplerYcbcrConversion r0 = r0.x_chroma_offset(r1)
            r0 = r3
            r1 = r8
            org.lwjgl.util.spvc.SpvcMslSamplerYcbcrConversion r0 = r0.y_chroma_offset(r1)
            r0 = r3
            r1 = r9
            org.lwjgl.util.spvc.SpvcMslSamplerYcbcrConversion r0 = r0.swizzle(r1)
            r0 = r3
            r1 = r10
            org.lwjgl.util.spvc.SpvcMslSamplerYcbcrConversion r0 = r0.ycbcr_model(r1)
            r0 = r3
            r1 = r11
            org.lwjgl.util.spvc.SpvcMslSamplerYcbcrConversion r0 = r0.ycbcr_range(r1)
            r0 = r3
            r1 = r12
            org.lwjgl.util.spvc.SpvcMslSamplerYcbcrConversion r0 = r0.bpc(r1)
            r0 = r3
            return r0
    }

    public org.lwjgl.util.spvc.SpvcMslSamplerYcbcrConversion set(org.lwjgl.util.spvc.SpvcMslSamplerYcbcrConversion r8) {
            r7 = this;
            r0 = r8
            long r0 = r0.address()
            r1 = r7
            long r1 = r1.address()
            int r2 = org.lwjgl.util.spvc.SpvcMslSamplerYcbcrConversion.SIZEOF
            long r2 = (long) r2
            org.lwjgl.system.MemoryUtil.memCopy(r0, r1, r2)
            r0 = r7
            return r0
    }

    public static org.lwjgl.util.spvc.SpvcMslSamplerYcbcrConversion malloc() {
            org.lwjgl.util.spvc.SpvcMslSamplerYcbcrConversion r0 = new org.lwjgl.util.spvc.SpvcMslSamplerYcbcrConversion
            r1 = r0
            int r2 = org.lwjgl.util.spvc.SpvcMslSamplerYcbcrConversion.SIZEOF
            long r2 = (long) r2
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.util.spvc.SpvcMslSamplerYcbcrConversion calloc() {
            org.lwjgl.util.spvc.SpvcMslSamplerYcbcrConversion r0 = new org.lwjgl.util.spvc.SpvcMslSamplerYcbcrConversion
            r1 = r0
            r2 = 1
            int r3 = org.lwjgl.util.spvc.SpvcMslSamplerYcbcrConversion.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.util.spvc.SpvcMslSamplerYcbcrConversion create() {
            int r0 = org.lwjgl.util.spvc.SpvcMslSamplerYcbcrConversion.SIZEOF
            java.nio.ByteBuffer r0 = org.lwjgl.BufferUtils.createByteBuffer(r0)
            r6 = r0
            org.lwjgl.util.spvc.SpvcMslSamplerYcbcrConversion r0 = new org.lwjgl.util.spvc.SpvcMslSamplerYcbcrConversion
            r1 = r0
            r2 = r6
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.util.spvc.SpvcMslSamplerYcbcrConversion create(long r6) {
            org.lwjgl.util.spvc.SpvcMslSamplerYcbcrConversion r0 = new org.lwjgl.util.spvc.SpvcMslSamplerYcbcrConversion
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.util.spvc.SpvcMslSamplerYcbcrConversion createSafe(long r6) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.util.spvc.SpvcMslSamplerYcbcrConversion r0 = new org.lwjgl.util.spvc.SpvcMslSamplerYcbcrConversion
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static org.lwjgl.util.spvc.SpvcMslSamplerYcbcrConversion.Buffer malloc(int r6) {
            org.lwjgl.util.spvc.SpvcMslSamplerYcbcrConversion$Buffer r0 = new org.lwjgl.util.spvc.SpvcMslSamplerYcbcrConversion$Buffer
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.util.spvc.SpvcMslSamplerYcbcrConversion.SIZEOF
            long r2 = __checkMalloc(r2, r3)
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.util.spvc.SpvcMslSamplerYcbcrConversion.Buffer calloc(int r7) {
            org.lwjgl.util.spvc.SpvcMslSamplerYcbcrConversion$Buffer r0 = new org.lwjgl.util.spvc.SpvcMslSamplerYcbcrConversion$Buffer
            r1 = r0
            r2 = r7
            long r2 = (long) r2
            int r3 = org.lwjgl.util.spvc.SpvcMslSamplerYcbcrConversion.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.util.spvc.SpvcMslSamplerYcbcrConversion.Buffer create(int r10) {
            r0 = r10
            int r1 = org.lwjgl.util.spvc.SpvcMslSamplerYcbcrConversion.SIZEOF
            java.nio.ByteBuffer r0 = __create(r0, r1)
            r11 = r0
            org.lwjgl.util.spvc.SpvcMslSamplerYcbcrConversion$Buffer r0 = new org.lwjgl.util.spvc.SpvcMslSamplerYcbcrConversion$Buffer
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

    public static org.lwjgl.util.spvc.SpvcMslSamplerYcbcrConversion.Buffer create(long r6, int r8) {
            org.lwjgl.util.spvc.SpvcMslSamplerYcbcrConversion$Buffer r0 = new org.lwjgl.util.spvc.SpvcMslSamplerYcbcrConversion$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.util.spvc.SpvcMslSamplerYcbcrConversion.Buffer createSafe(long r6, int r8) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.util.spvc.SpvcMslSamplerYcbcrConversion$Buffer r0 = new org.lwjgl.util.spvc.SpvcMslSamplerYcbcrConversion$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static org.lwjgl.util.spvc.SpvcMslSamplerYcbcrConversion malloc(org.lwjgl.system.MemoryStack r6) {
            org.lwjgl.util.spvc.SpvcMslSamplerYcbcrConversion r0 = new org.lwjgl.util.spvc.SpvcMslSamplerYcbcrConversion
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.util.spvc.SpvcMslSamplerYcbcrConversion.ALIGNOF
            int r4 = org.lwjgl.util.spvc.SpvcMslSamplerYcbcrConversion.SIZEOF
            long r2 = r2.nmalloc(r3, r4)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.util.spvc.SpvcMslSamplerYcbcrConversion calloc(org.lwjgl.system.MemoryStack r7) {
            org.lwjgl.util.spvc.SpvcMslSamplerYcbcrConversion r0 = new org.lwjgl.util.spvc.SpvcMslSamplerYcbcrConversion
            r1 = r0
            r2 = r7
            int r3 = org.lwjgl.util.spvc.SpvcMslSamplerYcbcrConversion.ALIGNOF
            r4 = 1
            int r5 = org.lwjgl.util.spvc.SpvcMslSamplerYcbcrConversion.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.util.spvc.SpvcMslSamplerYcbcrConversion.Buffer malloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.util.spvc.SpvcMslSamplerYcbcrConversion$Buffer r0 = new org.lwjgl.util.spvc.SpvcMslSamplerYcbcrConversion$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.util.spvc.SpvcMslSamplerYcbcrConversion.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.util.spvc.SpvcMslSamplerYcbcrConversion.SIZEOF
            int r4 = r4 * r5
            long r2 = r2.nmalloc(r3, r4)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.util.spvc.SpvcMslSamplerYcbcrConversion.Buffer calloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.util.spvc.SpvcMslSamplerYcbcrConversion$Buffer r0 = new org.lwjgl.util.spvc.SpvcMslSamplerYcbcrConversion$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.util.spvc.SpvcMslSamplerYcbcrConversion.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.util.spvc.SpvcMslSamplerYcbcrConversion.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static int nplanes(long r5) {
            r0 = r5
            int r1 = org.lwjgl.util.spvc.SpvcMslSamplerYcbcrConversion.PLANES
            long r1 = (long) r1
            long r0 = r0 + r1
            int r0 = org.lwjgl.system.MemoryUtil.memGetInt(r0)
            return r0
    }

    public static int nresolution(long r5) {
            r0 = r5
            int r1 = org.lwjgl.util.spvc.SpvcMslSamplerYcbcrConversion.RESOLUTION
            long r1 = (long) r1
            long r0 = r0 + r1
            int r0 = org.lwjgl.system.MemoryUtil.memGetInt(r0)
            return r0
    }

    public static int nchroma_filter(long r5) {
            r0 = r5
            int r1 = org.lwjgl.util.spvc.SpvcMslSamplerYcbcrConversion.CHROMA_FILTER
            long r1 = (long) r1
            long r0 = r0 + r1
            int r0 = org.lwjgl.system.MemoryUtil.memGetInt(r0)
            return r0
    }

    public static int nx_chroma_offset(long r5) {
            r0 = r5
            int r1 = org.lwjgl.util.spvc.SpvcMslSamplerYcbcrConversion.X_CHROMA_OFFSET
            long r1 = (long) r1
            long r0 = r0 + r1
            int r0 = org.lwjgl.system.MemoryUtil.memGetInt(r0)
            return r0
    }

    public static int ny_chroma_offset(long r5) {
            r0 = r5
            int r1 = org.lwjgl.util.spvc.SpvcMslSamplerYcbcrConversion.Y_CHROMA_OFFSET
            long r1 = (long) r1
            long r0 = r0 + r1
            int r0 = org.lwjgl.system.MemoryUtil.memGetInt(r0)
            return r0
    }

    public static java.nio.IntBuffer nswizzle(long r5) {
            r0 = r5
            int r1 = org.lwjgl.util.spvc.SpvcMslSamplerYcbcrConversion.SWIZZLE
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = 4
            java.nio.IntBuffer r0 = org.lwjgl.system.MemoryUtil.memIntBuffer(r0, r1)
            return r0
    }

    public static int nswizzle(long r7, int r9) {
            r0 = r7
            int r1 = org.lwjgl.util.spvc.SpvcMslSamplerYcbcrConversion.SWIZZLE
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r9
            r2 = 4
            long r1 = org.lwjgl.system.Checks.check(r1, r2)
            r2 = 4
            long r1 = r1 * r2
            long r0 = r0 + r1
            int r0 = org.lwjgl.system.MemoryUtil.memGetInt(r0)
            return r0
    }

    public static int nycbcr_model(long r5) {
            r0 = r5
            int r1 = org.lwjgl.util.spvc.SpvcMslSamplerYcbcrConversion.YCBCR_MODEL
            long r1 = (long) r1
            long r0 = r0 + r1
            int r0 = org.lwjgl.system.MemoryUtil.memGetInt(r0)
            return r0
    }

    public static int nycbcr_range(long r5) {
            r0 = r5
            int r1 = org.lwjgl.util.spvc.SpvcMslSamplerYcbcrConversion.YCBCR_RANGE
            long r1 = (long) r1
            long r0 = r0 + r1
            int r0 = org.lwjgl.system.MemoryUtil.memGetInt(r0)
            return r0
    }

    public static int nbpc(long r5) {
            r0 = r5
            int r1 = org.lwjgl.util.spvc.SpvcMslSamplerYcbcrConversion.BPC
            long r1 = (long) r1
            long r0 = r0 + r1
            int r0 = org.lwjgl.system.MemoryUtil.memGetInt(r0)
            return r0
    }

    public static void nplanes(long r5, int r7) {
            r0 = r5
            int r1 = org.lwjgl.util.spvc.SpvcMslSamplerYcbcrConversion.PLANES
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            org.lwjgl.system.MemoryUtil.memPutInt(r0, r1)
            return
    }

    public static void nresolution(long r5, int r7) {
            r0 = r5
            int r1 = org.lwjgl.util.spvc.SpvcMslSamplerYcbcrConversion.RESOLUTION
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            org.lwjgl.system.MemoryUtil.memPutInt(r0, r1)
            return
    }

    public static void nchroma_filter(long r5, int r7) {
            r0 = r5
            int r1 = org.lwjgl.util.spvc.SpvcMslSamplerYcbcrConversion.CHROMA_FILTER
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            org.lwjgl.system.MemoryUtil.memPutInt(r0, r1)
            return
    }

    public static void nx_chroma_offset(long r5, int r7) {
            r0 = r5
            int r1 = org.lwjgl.util.spvc.SpvcMslSamplerYcbcrConversion.X_CHROMA_OFFSET
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            org.lwjgl.system.MemoryUtil.memPutInt(r0, r1)
            return
    }

    public static void ny_chroma_offset(long r5, int r7) {
            r0 = r5
            int r1 = org.lwjgl.util.spvc.SpvcMslSamplerYcbcrConversion.Y_CHROMA_OFFSET
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            org.lwjgl.system.MemoryUtil.memPutInt(r0, r1)
            return
    }

    public static void nswizzle(long r7, java.nio.IntBuffer r9) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r9
            r1 = 4
            org.lwjgl.system.Checks.checkGT(r0, r1)
        Lb:
            r0 = r9
            long r0 = org.lwjgl.system.MemoryUtil.memAddress(r0)
            r1 = r7
            int r2 = org.lwjgl.util.spvc.SpvcMslSamplerYcbcrConversion.SWIZZLE
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

    public static void nswizzle(long r7, int r9, int r10) {
            r0 = r7
            int r1 = org.lwjgl.util.spvc.SpvcMslSamplerYcbcrConversion.SWIZZLE
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r9
            r2 = 4
            long r1 = org.lwjgl.system.Checks.check(r1, r2)
            r2 = 4
            long r1 = r1 * r2
            long r0 = r0 + r1
            r1 = r10
            org.lwjgl.system.MemoryUtil.memPutInt(r0, r1)
            return
    }

    public static void nycbcr_model(long r5, int r7) {
            r0 = r5
            int r1 = org.lwjgl.util.spvc.SpvcMslSamplerYcbcrConversion.YCBCR_MODEL
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            org.lwjgl.system.MemoryUtil.memPutInt(r0, r1)
            return
    }

    public static void nycbcr_range(long r5, int r7) {
            r0 = r5
            int r1 = org.lwjgl.util.spvc.SpvcMslSamplerYcbcrConversion.YCBCR_RANGE
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            org.lwjgl.system.MemoryUtil.memPutInt(r0, r1)
            return
    }

    public static void nbpc(long r5, int r7) {
            r0 = r5
            int r1 = org.lwjgl.util.spvc.SpvcMslSamplerYcbcrConversion.BPC
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
            org.lwjgl.util.spvc.SpvcMslSamplerYcbcrConversion r0 = r0.create(r1, r2)
            return r0
    }

    static {
            r0 = 9
            org.lwjgl.system.Struct$Member[] r0 = new org.lwjgl.system.Struct.Member[r0]
            r1 = r0
            r2 = 0
            r3 = 4
            org.lwjgl.system.Struct$Member r3 = __member(r3)
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
            r3 = 4
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
            r4 = 4
            org.lwjgl.system.Struct$Member r3 = __array(r3, r4)
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
            org.lwjgl.util.spvc.SpvcMslSamplerYcbcrConversion.SIZEOF = r0
            r0 = r6
            int r0 = r0.getAlignment()
            org.lwjgl.util.spvc.SpvcMslSamplerYcbcrConversion.ALIGNOF = r0
            r0 = r6
            r1 = 0
            int r0 = r0.offsetof(r1)
            org.lwjgl.util.spvc.SpvcMslSamplerYcbcrConversion.PLANES = r0
            r0 = r6
            r1 = 1
            int r0 = r0.offsetof(r1)
            org.lwjgl.util.spvc.SpvcMslSamplerYcbcrConversion.RESOLUTION = r0
            r0 = r6
            r1 = 2
            int r0 = r0.offsetof(r1)
            org.lwjgl.util.spvc.SpvcMslSamplerYcbcrConversion.CHROMA_FILTER = r0
            r0 = r6
            r1 = 3
            int r0 = r0.offsetof(r1)
            org.lwjgl.util.spvc.SpvcMslSamplerYcbcrConversion.X_CHROMA_OFFSET = r0
            r0 = r6
            r1 = 4
            int r0 = r0.offsetof(r1)
            org.lwjgl.util.spvc.SpvcMslSamplerYcbcrConversion.Y_CHROMA_OFFSET = r0
            r0 = r6
            r1 = 5
            int r0 = r0.offsetof(r1)
            org.lwjgl.util.spvc.SpvcMslSamplerYcbcrConversion.SWIZZLE = r0
            r0 = r6
            r1 = 6
            int r0 = r0.offsetof(r1)
            org.lwjgl.util.spvc.SpvcMslSamplerYcbcrConversion.YCBCR_MODEL = r0
            r0 = r6
            r1 = 7
            int r0 = r0.offsetof(r1)
            org.lwjgl.util.spvc.SpvcMslSamplerYcbcrConversion.YCBCR_RANGE = r0
            r0 = r6
            r1 = 8
            int r0 = r0.offsetof(r1)
            org.lwjgl.util.spvc.SpvcMslSamplerYcbcrConversion.BPC = r0
            return
    }
}
