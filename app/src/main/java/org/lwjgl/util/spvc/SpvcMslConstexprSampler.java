package org.lwjgl.util.spvc;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/util/spvc/SpvcMslConstexprSampler.class */
@org.lwjgl.system.NativeType("struct spvc_msl_constexpr_sampler")
public class SpvcMslConstexprSampler extends org.lwjgl.system.Struct<org.lwjgl.util.spvc.SpvcMslConstexprSampler> implements org.lwjgl.system.NativeResource {
    public static final int SIZEOF = 0;
    public static final int ALIGNOF = 0;
    public static final int COORD = 0;
    public static final int MIN_FILTER = 0;
    public static final int MAG_FILTER = 0;
    public static final int MIP_FILTER = 0;
    public static final int S_ADDRESS = 0;
    public static final int T_ADDRESS = 0;
    public static final int R_ADDRESS = 0;
    public static final int COMPARE_FUNC = 0;
    public static final int BORDER_COLOR = 0;
    public static final int LOD_CLAMP_MIN = 0;
    public static final int LOD_CLAMP_MAX = 0;
    public static final int MAX_ANISOTROPY = 0;
    public static final int COMPARE_ENABLE = 0;
    public static final int LOD_CLAMP_ENABLE = 0;
    public static final int ANISOTROPY_ENABLE = 0;

    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/util/spvc/SpvcMslConstexprSampler$Buffer.class */
    public static class Buffer extends org.lwjgl.system.StructBuffer<org.lwjgl.util.spvc.SpvcMslConstexprSampler, org.lwjgl.util.spvc.SpvcMslConstexprSampler.Buffer> implements org.lwjgl.system.NativeResource {
        private static final org.lwjgl.util.spvc.SpvcMslConstexprSampler ELEMENT_FACTORY = null;

        public Buffer(java.nio.ByteBuffer r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r6
                int r2 = r2.remaining()
                int r3 = org.lwjgl.util.spvc.SpvcMslConstexprSampler.SIZEOF
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
        protected org.lwjgl.util.spvc.SpvcMslConstexprSampler.Buffer self() {
                r2 = this;
                r0 = r2
                return r0
        }

        protected org.lwjgl.util.spvc.SpvcMslConstexprSampler.Buffer create(long r11, java.nio.ByteBuffer r13, int r14, int r15, int r16, int r17) {
                r10 = this;
                org.lwjgl.util.spvc.SpvcMslConstexprSampler$Buffer r0 = new org.lwjgl.util.spvc.SpvcMslConstexprSampler$Buffer
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
        protected org.lwjgl.util.spvc.SpvcMslConstexprSampler getElementFactory() {
                r2 = this;
                org.lwjgl.util.spvc.SpvcMslConstexprSampler r0 = org.lwjgl.util.spvc.SpvcMslConstexprSampler.Buffer.ELEMENT_FACTORY
                return r0
        }

        @org.lwjgl.system.NativeType("spvc_msl_sampler_coord")
        public int coord() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.util.spvc.SpvcMslConstexprSampler.ncoord(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("spvc_msl_sampler_filter")
        public int min_filter() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.util.spvc.SpvcMslConstexprSampler.nmin_filter(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("spvc_msl_sampler_filter")
        public int mag_filter() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.util.spvc.SpvcMslConstexprSampler.nmag_filter(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("spvc_msl_sampler_mip_filter")
        public int mip_filter() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.util.spvc.SpvcMslConstexprSampler.nmip_filter(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("spvc_msl_sampler_address")
        public int s_address() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.util.spvc.SpvcMslConstexprSampler.ns_address(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("spvc_msl_sampler_address")
        public int t_address() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.util.spvc.SpvcMslConstexprSampler.nt_address(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("spvc_msl_sampler_address")
        public int r_address() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.util.spvc.SpvcMslConstexprSampler.nr_address(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("spvc_msl_sampler_compare_func")
        public int compare_func() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.util.spvc.SpvcMslConstexprSampler.ncompare_func(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("spvc_msl_sampler_border_color")
        public int border_color() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.util.spvc.SpvcMslConstexprSampler.nborder_color(r0)
                return r0
        }

        public float lod_clamp_min() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                float r0 = org.lwjgl.util.spvc.SpvcMslConstexprSampler.nlod_clamp_min(r0)
                return r0
        }

        public float lod_clamp_max() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                float r0 = org.lwjgl.util.spvc.SpvcMslConstexprSampler.nlod_clamp_max(r0)
                return r0
        }

        public int max_anisotropy() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.util.spvc.SpvcMslConstexprSampler.nmax_anisotropy(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("spvc_bool")
        public boolean compare_enable() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                boolean r0 = org.lwjgl.util.spvc.SpvcMslConstexprSampler.ncompare_enable(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("spvc_bool")
        public boolean lod_clamp_enable() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                boolean r0 = org.lwjgl.util.spvc.SpvcMslConstexprSampler.nlod_clamp_enable(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("spvc_bool")
        public boolean anisotropy_enable() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                boolean r0 = org.lwjgl.util.spvc.SpvcMslConstexprSampler.nanisotropy_enable(r0)
                return r0
        }

        public org.lwjgl.util.spvc.SpvcMslConstexprSampler.Buffer coord(@org.lwjgl.system.NativeType("spvc_msl_sampler_coord") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.util.spvc.SpvcMslConstexprSampler.ncoord(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.util.spvc.SpvcMslConstexprSampler.Buffer min_filter(@org.lwjgl.system.NativeType("spvc_msl_sampler_filter") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.util.spvc.SpvcMslConstexprSampler.nmin_filter(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.util.spvc.SpvcMslConstexprSampler.Buffer mag_filter(@org.lwjgl.system.NativeType("spvc_msl_sampler_filter") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.util.spvc.SpvcMslConstexprSampler.nmag_filter(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.util.spvc.SpvcMslConstexprSampler.Buffer mip_filter(@org.lwjgl.system.NativeType("spvc_msl_sampler_mip_filter") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.util.spvc.SpvcMslConstexprSampler.nmip_filter(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.util.spvc.SpvcMslConstexprSampler.Buffer s_address(@org.lwjgl.system.NativeType("spvc_msl_sampler_address") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.util.spvc.SpvcMslConstexprSampler.ns_address(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.util.spvc.SpvcMslConstexprSampler.Buffer t_address(@org.lwjgl.system.NativeType("spvc_msl_sampler_address") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.util.spvc.SpvcMslConstexprSampler.nt_address(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.util.spvc.SpvcMslConstexprSampler.Buffer r_address(@org.lwjgl.system.NativeType("spvc_msl_sampler_address") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.util.spvc.SpvcMslConstexprSampler.nr_address(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.util.spvc.SpvcMslConstexprSampler.Buffer compare_func(@org.lwjgl.system.NativeType("spvc_msl_sampler_compare_func") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.util.spvc.SpvcMslConstexprSampler.ncompare_func(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.util.spvc.SpvcMslConstexprSampler.Buffer border_color(@org.lwjgl.system.NativeType("spvc_msl_sampler_border_color") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.util.spvc.SpvcMslConstexprSampler.nborder_color(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.util.spvc.SpvcMslConstexprSampler.Buffer lod_clamp_min(float r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.util.spvc.SpvcMslConstexprSampler.nlod_clamp_min(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.util.spvc.SpvcMslConstexprSampler.Buffer lod_clamp_max(float r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.util.spvc.SpvcMslConstexprSampler.nlod_clamp_max(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.util.spvc.SpvcMslConstexprSampler.Buffer max_anisotropy(int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.util.spvc.SpvcMslConstexprSampler.nmax_anisotropy(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.util.spvc.SpvcMslConstexprSampler.Buffer compare_enable(@org.lwjgl.system.NativeType("spvc_bool") boolean r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.util.spvc.SpvcMslConstexprSampler.ncompare_enable(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.util.spvc.SpvcMslConstexprSampler.Buffer lod_clamp_enable(@org.lwjgl.system.NativeType("spvc_bool") boolean r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.util.spvc.SpvcMslConstexprSampler.nlod_clamp_enable(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.util.spvc.SpvcMslConstexprSampler.Buffer anisotropy_enable(@org.lwjgl.system.NativeType("spvc_bool") boolean r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.util.spvc.SpvcMslConstexprSampler.nanisotropy_enable(r0, r1)
                r0 = r4
                return r0
        }

        @Override // org.lwjgl.system.StructBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.Struct getElementFactory() {
                r2 = this;
                r0 = r2
                org.lwjgl.util.spvc.SpvcMslConstexprSampler r0 = r0.getElementFactory()
                return r0
        }

        /* JADX INFO: renamed from: create, reason: collision with other method in class */
        protected /* bridge */ /* synthetic */ org.lwjgl.system.CustomBuffer m3751create(long r10, java.nio.ByteBuffer r12, int r13, int r14, int r15, int r16) {
                r9 = this;
                r0 = r9
                r1 = r10
                r2 = r12
                r3 = r13
                r4 = r14
                r5 = r15
                r6 = r16
                org.lwjgl.util.spvc.SpvcMslConstexprSampler$Buffer r0 = r0.create(r1, r2, r3, r4, r5, r6)
                return r0
        }

        @Override // org.lwjgl.system.CustomBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.CustomBuffer self() {
                r2 = this;
                r0 = r2
                org.lwjgl.util.spvc.SpvcMslConstexprSampler$Buffer r0 = r0.self()
                return r0
        }

        static {
                r0 = -1
                org.lwjgl.util.spvc.SpvcMslConstexprSampler r0 = org.lwjgl.util.spvc.SpvcMslConstexprSampler.create(r0)
                org.lwjgl.util.spvc.SpvcMslConstexprSampler.Buffer.ELEMENT_FACTORY = r0
                return
        }
    }

    protected SpvcMslConstexprSampler(long r6, java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    protected org.lwjgl.util.spvc.SpvcMslConstexprSampler create(long r7, java.nio.ByteBuffer r9) {
            r6 = this;
            org.lwjgl.util.spvc.SpvcMslConstexprSampler r0 = new org.lwjgl.util.spvc.SpvcMslConstexprSampler
            r1 = r0
            r2 = r7
            r3 = r9
            r1.<init>(r2, r3)
            return r0
    }

    public SpvcMslConstexprSampler(java.nio.ByteBuffer r7) {
            r6 = this;
            r0 = r6
            r1 = r7
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            r2 = r7
            int r3 = org.lwjgl.util.spvc.SpvcMslConstexprSampler.SIZEOF
            java.nio.ByteBuffer r2 = __checkContainer(r2, r3)
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
            r2 = this;
            int r0 = org.lwjgl.util.spvc.SpvcMslConstexprSampler.SIZEOF
            return r0
    }

    @org.lwjgl.system.NativeType("spvc_msl_sampler_coord")
    public int coord() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = ncoord(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("spvc_msl_sampler_filter")
    public int min_filter() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nmin_filter(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("spvc_msl_sampler_filter")
    public int mag_filter() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nmag_filter(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("spvc_msl_sampler_mip_filter")
    public int mip_filter() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nmip_filter(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("spvc_msl_sampler_address")
    public int s_address() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = ns_address(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("spvc_msl_sampler_address")
    public int t_address() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nt_address(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("spvc_msl_sampler_address")
    public int r_address() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nr_address(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("spvc_msl_sampler_compare_func")
    public int compare_func() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = ncompare_func(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("spvc_msl_sampler_border_color")
    public int border_color() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nborder_color(r0)
            return r0
    }

    public float lod_clamp_min() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            float r0 = nlod_clamp_min(r0)
            return r0
    }

    public float lod_clamp_max() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            float r0 = nlod_clamp_max(r0)
            return r0
    }

    public int max_anisotropy() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nmax_anisotropy(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("spvc_bool")
    public boolean compare_enable() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            boolean r0 = ncompare_enable(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("spvc_bool")
    public boolean lod_clamp_enable() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            boolean r0 = nlod_clamp_enable(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("spvc_bool")
    public boolean anisotropy_enable() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            boolean r0 = nanisotropy_enable(r0)
            return r0
    }

    public org.lwjgl.util.spvc.SpvcMslConstexprSampler coord(@org.lwjgl.system.NativeType("spvc_msl_sampler_coord") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            ncoord(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.util.spvc.SpvcMslConstexprSampler min_filter(@org.lwjgl.system.NativeType("spvc_msl_sampler_filter") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nmin_filter(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.util.spvc.SpvcMslConstexprSampler mag_filter(@org.lwjgl.system.NativeType("spvc_msl_sampler_filter") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nmag_filter(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.util.spvc.SpvcMslConstexprSampler mip_filter(@org.lwjgl.system.NativeType("spvc_msl_sampler_mip_filter") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nmip_filter(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.util.spvc.SpvcMslConstexprSampler s_address(@org.lwjgl.system.NativeType("spvc_msl_sampler_address") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            ns_address(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.util.spvc.SpvcMslConstexprSampler t_address(@org.lwjgl.system.NativeType("spvc_msl_sampler_address") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nt_address(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.util.spvc.SpvcMslConstexprSampler r_address(@org.lwjgl.system.NativeType("spvc_msl_sampler_address") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nr_address(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.util.spvc.SpvcMslConstexprSampler compare_func(@org.lwjgl.system.NativeType("spvc_msl_sampler_compare_func") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            ncompare_func(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.util.spvc.SpvcMslConstexprSampler border_color(@org.lwjgl.system.NativeType("spvc_msl_sampler_border_color") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nborder_color(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.util.spvc.SpvcMslConstexprSampler lod_clamp_min(float r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nlod_clamp_min(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.util.spvc.SpvcMslConstexprSampler lod_clamp_max(float r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nlod_clamp_max(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.util.spvc.SpvcMslConstexprSampler max_anisotropy(int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nmax_anisotropy(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.util.spvc.SpvcMslConstexprSampler compare_enable(@org.lwjgl.system.NativeType("spvc_bool") boolean r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            ncompare_enable(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.util.spvc.SpvcMslConstexprSampler lod_clamp_enable(@org.lwjgl.system.NativeType("spvc_bool") boolean r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nlod_clamp_enable(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.util.spvc.SpvcMslConstexprSampler anisotropy_enable(@org.lwjgl.system.NativeType("spvc_bool") boolean r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nanisotropy_enable(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.util.spvc.SpvcMslConstexprSampler set(int r4, int r5, int r6, int r7, int r8, int r9, int r10, int r11, int r12, float r13, float r14, int r15, boolean r16, boolean r17, boolean r18) {
            r3 = this;
            r0 = r3
            r1 = r4
            org.lwjgl.util.spvc.SpvcMslConstexprSampler r0 = r0.coord(r1)
            r0 = r3
            r1 = r5
            org.lwjgl.util.spvc.SpvcMslConstexprSampler r0 = r0.min_filter(r1)
            r0 = r3
            r1 = r6
            org.lwjgl.util.spvc.SpvcMslConstexprSampler r0 = r0.mag_filter(r1)
            r0 = r3
            r1 = r7
            org.lwjgl.util.spvc.SpvcMslConstexprSampler r0 = r0.mip_filter(r1)
            r0 = r3
            r1 = r8
            org.lwjgl.util.spvc.SpvcMslConstexprSampler r0 = r0.s_address(r1)
            r0 = r3
            r1 = r9
            org.lwjgl.util.spvc.SpvcMslConstexprSampler r0 = r0.t_address(r1)
            r0 = r3
            r1 = r10
            org.lwjgl.util.spvc.SpvcMslConstexprSampler r0 = r0.r_address(r1)
            r0 = r3
            r1 = r11
            org.lwjgl.util.spvc.SpvcMslConstexprSampler r0 = r0.compare_func(r1)
            r0 = r3
            r1 = r12
            org.lwjgl.util.spvc.SpvcMslConstexprSampler r0 = r0.border_color(r1)
            r0 = r3
            r1 = r13
            org.lwjgl.util.spvc.SpvcMslConstexprSampler r0 = r0.lod_clamp_min(r1)
            r0 = r3
            r1 = r14
            org.lwjgl.util.spvc.SpvcMslConstexprSampler r0 = r0.lod_clamp_max(r1)
            r0 = r3
            r1 = r15
            org.lwjgl.util.spvc.SpvcMslConstexprSampler r0 = r0.max_anisotropy(r1)
            r0 = r3
            r1 = r16
            org.lwjgl.util.spvc.SpvcMslConstexprSampler r0 = r0.compare_enable(r1)
            r0 = r3
            r1 = r17
            org.lwjgl.util.spvc.SpvcMslConstexprSampler r0 = r0.lod_clamp_enable(r1)
            r0 = r3
            r1 = r18
            org.lwjgl.util.spvc.SpvcMslConstexprSampler r0 = r0.anisotropy_enable(r1)
            r0 = r3
            return r0
    }

    public org.lwjgl.util.spvc.SpvcMslConstexprSampler set(org.lwjgl.util.spvc.SpvcMslConstexprSampler r8) {
            r7 = this;
            r0 = r8
            long r0 = r0.address()
            r1 = r7
            long r1 = r1.address()
            int r2 = org.lwjgl.util.spvc.SpvcMslConstexprSampler.SIZEOF
            long r2 = (long) r2
            org.lwjgl.system.MemoryUtil.memCopy(r0, r1, r2)
            r0 = r7
            return r0
    }

    public static org.lwjgl.util.spvc.SpvcMslConstexprSampler malloc() {
            org.lwjgl.util.spvc.SpvcMslConstexprSampler r0 = new org.lwjgl.util.spvc.SpvcMslConstexprSampler
            r1 = r0
            int r2 = org.lwjgl.util.spvc.SpvcMslConstexprSampler.SIZEOF
            long r2 = (long) r2
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.util.spvc.SpvcMslConstexprSampler calloc() {
            org.lwjgl.util.spvc.SpvcMslConstexprSampler r0 = new org.lwjgl.util.spvc.SpvcMslConstexprSampler
            r1 = r0
            r2 = 1
            int r3 = org.lwjgl.util.spvc.SpvcMslConstexprSampler.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.util.spvc.SpvcMslConstexprSampler create() {
            int r0 = org.lwjgl.util.spvc.SpvcMslConstexprSampler.SIZEOF
            java.nio.ByteBuffer r0 = org.lwjgl.BufferUtils.createByteBuffer(r0)
            r6 = r0
            org.lwjgl.util.spvc.SpvcMslConstexprSampler r0 = new org.lwjgl.util.spvc.SpvcMslConstexprSampler
            r1 = r0
            r2 = r6
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.util.spvc.SpvcMslConstexprSampler create(long r6) {
            org.lwjgl.util.spvc.SpvcMslConstexprSampler r0 = new org.lwjgl.util.spvc.SpvcMslConstexprSampler
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.util.spvc.SpvcMslConstexprSampler createSafe(long r6) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.util.spvc.SpvcMslConstexprSampler r0 = new org.lwjgl.util.spvc.SpvcMslConstexprSampler
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static org.lwjgl.util.spvc.SpvcMslConstexprSampler.Buffer malloc(int r6) {
            org.lwjgl.util.spvc.SpvcMslConstexprSampler$Buffer r0 = new org.lwjgl.util.spvc.SpvcMslConstexprSampler$Buffer
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.util.spvc.SpvcMslConstexprSampler.SIZEOF
            long r2 = __checkMalloc(r2, r3)
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.util.spvc.SpvcMslConstexprSampler.Buffer calloc(int r7) {
            org.lwjgl.util.spvc.SpvcMslConstexprSampler$Buffer r0 = new org.lwjgl.util.spvc.SpvcMslConstexprSampler$Buffer
            r1 = r0
            r2 = r7
            long r2 = (long) r2
            int r3 = org.lwjgl.util.spvc.SpvcMslConstexprSampler.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.util.spvc.SpvcMslConstexprSampler.Buffer create(int r10) {
            r0 = r10
            int r1 = org.lwjgl.util.spvc.SpvcMslConstexprSampler.SIZEOF
            java.nio.ByteBuffer r0 = __create(r0, r1)
            r11 = r0
            org.lwjgl.util.spvc.SpvcMslConstexprSampler$Buffer r0 = new org.lwjgl.util.spvc.SpvcMslConstexprSampler$Buffer
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

    public static org.lwjgl.util.spvc.SpvcMslConstexprSampler.Buffer create(long r6, int r8) {
            org.lwjgl.util.spvc.SpvcMslConstexprSampler$Buffer r0 = new org.lwjgl.util.spvc.SpvcMslConstexprSampler$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.util.spvc.SpvcMslConstexprSampler.Buffer createSafe(long r6, int r8) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.util.spvc.SpvcMslConstexprSampler$Buffer r0 = new org.lwjgl.util.spvc.SpvcMslConstexprSampler$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static org.lwjgl.util.spvc.SpvcMslConstexprSampler malloc(org.lwjgl.system.MemoryStack r6) {
            org.lwjgl.util.spvc.SpvcMslConstexprSampler r0 = new org.lwjgl.util.spvc.SpvcMslConstexprSampler
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.util.spvc.SpvcMslConstexprSampler.ALIGNOF
            int r4 = org.lwjgl.util.spvc.SpvcMslConstexprSampler.SIZEOF
            long r2 = r2.nmalloc(r3, r4)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.util.spvc.SpvcMslConstexprSampler calloc(org.lwjgl.system.MemoryStack r7) {
            org.lwjgl.util.spvc.SpvcMslConstexprSampler r0 = new org.lwjgl.util.spvc.SpvcMslConstexprSampler
            r1 = r0
            r2 = r7
            int r3 = org.lwjgl.util.spvc.SpvcMslConstexprSampler.ALIGNOF
            r4 = 1
            int r5 = org.lwjgl.util.spvc.SpvcMslConstexprSampler.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.util.spvc.SpvcMslConstexprSampler.Buffer malloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.util.spvc.SpvcMslConstexprSampler$Buffer r0 = new org.lwjgl.util.spvc.SpvcMslConstexprSampler$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.util.spvc.SpvcMslConstexprSampler.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.util.spvc.SpvcMslConstexprSampler.SIZEOF
            int r4 = r4 * r5
            long r2 = r2.nmalloc(r3, r4)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.util.spvc.SpvcMslConstexprSampler.Buffer calloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.util.spvc.SpvcMslConstexprSampler$Buffer r0 = new org.lwjgl.util.spvc.SpvcMslConstexprSampler$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.util.spvc.SpvcMslConstexprSampler.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.util.spvc.SpvcMslConstexprSampler.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static int ncoord(long r5) {
            r0 = r5
            int r1 = org.lwjgl.util.spvc.SpvcMslConstexprSampler.COORD
            long r1 = (long) r1
            long r0 = r0 + r1
            int r0 = org.lwjgl.system.MemoryUtil.memGetInt(r0)
            return r0
    }

    public static int nmin_filter(long r5) {
            r0 = r5
            int r1 = org.lwjgl.util.spvc.SpvcMslConstexprSampler.MIN_FILTER
            long r1 = (long) r1
            long r0 = r0 + r1
            int r0 = org.lwjgl.system.MemoryUtil.memGetInt(r0)
            return r0
    }

    public static int nmag_filter(long r5) {
            r0 = r5
            int r1 = org.lwjgl.util.spvc.SpvcMslConstexprSampler.MAG_FILTER
            long r1 = (long) r1
            long r0 = r0 + r1
            int r0 = org.lwjgl.system.MemoryUtil.memGetInt(r0)
            return r0
    }

    public static int nmip_filter(long r5) {
            r0 = r5
            int r1 = org.lwjgl.util.spvc.SpvcMslConstexprSampler.MIP_FILTER
            long r1 = (long) r1
            long r0 = r0 + r1
            int r0 = org.lwjgl.system.MemoryUtil.memGetInt(r0)
            return r0
    }

    public static int ns_address(long r5) {
            r0 = r5
            int r1 = org.lwjgl.util.spvc.SpvcMslConstexprSampler.S_ADDRESS
            long r1 = (long) r1
            long r0 = r0 + r1
            int r0 = org.lwjgl.system.MemoryUtil.memGetInt(r0)
            return r0
    }

    public static int nt_address(long r5) {
            r0 = r5
            int r1 = org.lwjgl.util.spvc.SpvcMslConstexprSampler.T_ADDRESS
            long r1 = (long) r1
            long r0 = r0 + r1
            int r0 = org.lwjgl.system.MemoryUtil.memGetInt(r0)
            return r0
    }

    public static int nr_address(long r5) {
            r0 = r5
            int r1 = org.lwjgl.util.spvc.SpvcMslConstexprSampler.R_ADDRESS
            long r1 = (long) r1
            long r0 = r0 + r1
            int r0 = org.lwjgl.system.MemoryUtil.memGetInt(r0)
            return r0
    }

    public static int ncompare_func(long r5) {
            r0 = r5
            int r1 = org.lwjgl.util.spvc.SpvcMslConstexprSampler.COMPARE_FUNC
            long r1 = (long) r1
            long r0 = r0 + r1
            int r0 = org.lwjgl.system.MemoryUtil.memGetInt(r0)
            return r0
    }

    public static int nborder_color(long r5) {
            r0 = r5
            int r1 = org.lwjgl.util.spvc.SpvcMslConstexprSampler.BORDER_COLOR
            long r1 = (long) r1
            long r0 = r0 + r1
            int r0 = org.lwjgl.system.MemoryUtil.memGetInt(r0)
            return r0
    }

    public static float nlod_clamp_min(long r5) {
            r0 = r5
            int r1 = org.lwjgl.util.spvc.SpvcMslConstexprSampler.LOD_CLAMP_MIN
            long r1 = (long) r1
            long r0 = r0 + r1
            float r0 = org.lwjgl.system.MemoryUtil.memGetFloat(r0)
            return r0
    }

    public static float nlod_clamp_max(long r5) {
            r0 = r5
            int r1 = org.lwjgl.util.spvc.SpvcMslConstexprSampler.LOD_CLAMP_MAX
            long r1 = (long) r1
            long r0 = r0 + r1
            float r0 = org.lwjgl.system.MemoryUtil.memGetFloat(r0)
            return r0
    }

    public static int nmax_anisotropy(long r5) {
            r0 = r5
            int r1 = org.lwjgl.util.spvc.SpvcMslConstexprSampler.MAX_ANISOTROPY
            long r1 = (long) r1
            long r0 = r0 + r1
            int r0 = org.lwjgl.system.MemoryUtil.memGetInt(r0)
            return r0
    }

    public static boolean ncompare_enable(long r5) {
            r0 = r5
            int r1 = org.lwjgl.util.spvc.SpvcMslConstexprSampler.COMPARE_ENABLE
            long r1 = (long) r1
            long r0 = r0 + r1
            byte r0 = org.lwjgl.system.MemoryUtil.memGetByte(r0)
            if (r0 == 0) goto L10
            r0 = 1
            goto L11
        L10:
            r0 = 0
        L11:
            return r0
    }

    public static boolean nlod_clamp_enable(long r5) {
            r0 = r5
            int r1 = org.lwjgl.util.spvc.SpvcMslConstexprSampler.LOD_CLAMP_ENABLE
            long r1 = (long) r1
            long r0 = r0 + r1
            byte r0 = org.lwjgl.system.MemoryUtil.memGetByte(r0)
            if (r0 == 0) goto L10
            r0 = 1
            goto L11
        L10:
            r0 = 0
        L11:
            return r0
    }

    public static boolean nanisotropy_enable(long r5) {
            r0 = r5
            int r1 = org.lwjgl.util.spvc.SpvcMslConstexprSampler.ANISOTROPY_ENABLE
            long r1 = (long) r1
            long r0 = r0 + r1
            byte r0 = org.lwjgl.system.MemoryUtil.memGetByte(r0)
            if (r0 == 0) goto L10
            r0 = 1
            goto L11
        L10:
            r0 = 0
        L11:
            return r0
    }

    public static void ncoord(long r5, int r7) {
            r0 = r5
            int r1 = org.lwjgl.util.spvc.SpvcMslConstexprSampler.COORD
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            org.lwjgl.system.MemoryUtil.memPutInt(r0, r1)
            return
    }

    public static void nmin_filter(long r5, int r7) {
            r0 = r5
            int r1 = org.lwjgl.util.spvc.SpvcMslConstexprSampler.MIN_FILTER
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            org.lwjgl.system.MemoryUtil.memPutInt(r0, r1)
            return
    }

    public static void nmag_filter(long r5, int r7) {
            r0 = r5
            int r1 = org.lwjgl.util.spvc.SpvcMslConstexprSampler.MAG_FILTER
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            org.lwjgl.system.MemoryUtil.memPutInt(r0, r1)
            return
    }

    public static void nmip_filter(long r5, int r7) {
            r0 = r5
            int r1 = org.lwjgl.util.spvc.SpvcMslConstexprSampler.MIP_FILTER
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            org.lwjgl.system.MemoryUtil.memPutInt(r0, r1)
            return
    }

    public static void ns_address(long r5, int r7) {
            r0 = r5
            int r1 = org.lwjgl.util.spvc.SpvcMslConstexprSampler.S_ADDRESS
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            org.lwjgl.system.MemoryUtil.memPutInt(r0, r1)
            return
    }

    public static void nt_address(long r5, int r7) {
            r0 = r5
            int r1 = org.lwjgl.util.spvc.SpvcMslConstexprSampler.T_ADDRESS
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            org.lwjgl.system.MemoryUtil.memPutInt(r0, r1)
            return
    }

    public static void nr_address(long r5, int r7) {
            r0 = r5
            int r1 = org.lwjgl.util.spvc.SpvcMslConstexprSampler.R_ADDRESS
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            org.lwjgl.system.MemoryUtil.memPutInt(r0, r1)
            return
    }

    public static void ncompare_func(long r5, int r7) {
            r0 = r5
            int r1 = org.lwjgl.util.spvc.SpvcMslConstexprSampler.COMPARE_FUNC
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            org.lwjgl.system.MemoryUtil.memPutInt(r0, r1)
            return
    }

    public static void nborder_color(long r5, int r7) {
            r0 = r5
            int r1 = org.lwjgl.util.spvc.SpvcMslConstexprSampler.BORDER_COLOR
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            org.lwjgl.system.MemoryUtil.memPutInt(r0, r1)
            return
    }

    public static void nlod_clamp_min(long r5, float r7) {
            r0 = r5
            int r1 = org.lwjgl.util.spvc.SpvcMslConstexprSampler.LOD_CLAMP_MIN
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            org.lwjgl.system.MemoryUtil.memPutFloat(r0, r1)
            return
    }

    public static void nlod_clamp_max(long r5, float r7) {
            r0 = r5
            int r1 = org.lwjgl.util.spvc.SpvcMslConstexprSampler.LOD_CLAMP_MAX
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            org.lwjgl.system.MemoryUtil.memPutFloat(r0, r1)
            return
    }

    public static void nmax_anisotropy(long r5, int r7) {
            r0 = r5
            int r1 = org.lwjgl.util.spvc.SpvcMslConstexprSampler.MAX_ANISOTROPY
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            org.lwjgl.system.MemoryUtil.memPutInt(r0, r1)
            return
    }

    public static void ncompare_enable(long r5, boolean r7) {
            r0 = r5
            int r1 = org.lwjgl.util.spvc.SpvcMslConstexprSampler.COMPARE_ENABLE
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            if (r1 == 0) goto Le
            r1 = 1
            goto Lf
        Le:
            r1 = 0
        Lf:
            org.lwjgl.system.MemoryUtil.memPutByte(r0, r1)
            return
    }

    public static void nlod_clamp_enable(long r5, boolean r7) {
            r0 = r5
            int r1 = org.lwjgl.util.spvc.SpvcMslConstexprSampler.LOD_CLAMP_ENABLE
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            if (r1 == 0) goto Le
            r1 = 1
            goto Lf
        Le:
            r1 = 0
        Lf:
            org.lwjgl.system.MemoryUtil.memPutByte(r0, r1)
            return
    }

    public static void nanisotropy_enable(long r5, boolean r7) {
            r0 = r5
            int r1 = org.lwjgl.util.spvc.SpvcMslConstexprSampler.ANISOTROPY_ENABLE
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            if (r1 == 0) goto Le
            r1 = 1
            goto Lf
        Le:
            r1 = 0
        Lf:
            org.lwjgl.system.MemoryUtil.memPutByte(r0, r1)
            return
    }

    @Override // org.lwjgl.system.Struct
    protected /* bridge */ /* synthetic */ org.lwjgl.system.Struct create(long r6, java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            org.lwjgl.util.spvc.SpvcMslConstexprSampler r0 = r0.create(r1, r2)
            return r0
    }

    static {
            r0 = 15
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
            r1 = r0
            r2 = 9
            r3 = 4
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 10
            r3 = 4
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 11
            r3 = 4
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 12
            r3 = 1
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 13
            r3 = 1
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 14
            r3 = 1
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            org.lwjgl.system.Struct$Layout r0 = __struct(r0)
            r5 = r0
            r0 = r5
            int r0 = r0.getSize()
            org.lwjgl.util.spvc.SpvcMslConstexprSampler.SIZEOF = r0
            r0 = r5
            int r0 = r0.getAlignment()
            org.lwjgl.util.spvc.SpvcMslConstexprSampler.ALIGNOF = r0
            r0 = r5
            r1 = 0
            int r0 = r0.offsetof(r1)
            org.lwjgl.util.spvc.SpvcMslConstexprSampler.COORD = r0
            r0 = r5
            r1 = 1
            int r0 = r0.offsetof(r1)
            org.lwjgl.util.spvc.SpvcMslConstexprSampler.MIN_FILTER = r0
            r0 = r5
            r1 = 2
            int r0 = r0.offsetof(r1)
            org.lwjgl.util.spvc.SpvcMslConstexprSampler.MAG_FILTER = r0
            r0 = r5
            r1 = 3
            int r0 = r0.offsetof(r1)
            org.lwjgl.util.spvc.SpvcMslConstexprSampler.MIP_FILTER = r0
            r0 = r5
            r1 = 4
            int r0 = r0.offsetof(r1)
            org.lwjgl.util.spvc.SpvcMslConstexprSampler.S_ADDRESS = r0
            r0 = r5
            r1 = 5
            int r0 = r0.offsetof(r1)
            org.lwjgl.util.spvc.SpvcMslConstexprSampler.T_ADDRESS = r0
            r0 = r5
            r1 = 6
            int r0 = r0.offsetof(r1)
            org.lwjgl.util.spvc.SpvcMslConstexprSampler.R_ADDRESS = r0
            r0 = r5
            r1 = 7
            int r0 = r0.offsetof(r1)
            org.lwjgl.util.spvc.SpvcMslConstexprSampler.COMPARE_FUNC = r0
            r0 = r5
            r1 = 8
            int r0 = r0.offsetof(r1)
            org.lwjgl.util.spvc.SpvcMslConstexprSampler.BORDER_COLOR = r0
            r0 = r5
            r1 = 9
            int r0 = r0.offsetof(r1)
            org.lwjgl.util.spvc.SpvcMslConstexprSampler.LOD_CLAMP_MIN = r0
            r0 = r5
            r1 = 10
            int r0 = r0.offsetof(r1)
            org.lwjgl.util.spvc.SpvcMslConstexprSampler.LOD_CLAMP_MAX = r0
            r0 = r5
            r1 = 11
            int r0 = r0.offsetof(r1)
            org.lwjgl.util.spvc.SpvcMslConstexprSampler.MAX_ANISOTROPY = r0
            r0 = r5
            r1 = 12
            int r0 = r0.offsetof(r1)
            org.lwjgl.util.spvc.SpvcMslConstexprSampler.COMPARE_ENABLE = r0
            r0 = r5
            r1 = 13
            int r0 = r0.offsetof(r1)
            org.lwjgl.util.spvc.SpvcMslConstexprSampler.LOD_CLAMP_ENABLE = r0
            r0 = r5
            r1 = 14
            int r0 = r0.offsetof(r1)
            org.lwjgl.util.spvc.SpvcMslConstexprSampler.ANISOTROPY_ENABLE = r0
            return
    }
}
