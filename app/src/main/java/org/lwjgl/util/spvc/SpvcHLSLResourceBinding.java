package org.lwjgl.util.spvc;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/util/spvc/SpvcHLSLResourceBinding.class */
@org.lwjgl.system.NativeType("struct spvc_hlsl_resource_binding")
public class SpvcHLSLResourceBinding extends org.lwjgl.system.Struct<org.lwjgl.util.spvc.SpvcHLSLResourceBinding> implements org.lwjgl.system.NativeResource {
    public static final int SIZEOF = 0;
    public static final int ALIGNOF = 0;
    public static final int STAGE = 0;
    public static final int DESC_SET = 0;
    public static final int BINDING = 0;
    public static final int CBV = 0;
    public static final int UAV = 0;
    public static final int SRV = 0;
    public static final int SAMPLER = 0;

    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/util/spvc/SpvcHLSLResourceBinding$Buffer.class */
    public static class Buffer extends org.lwjgl.system.StructBuffer<org.lwjgl.util.spvc.SpvcHLSLResourceBinding, org.lwjgl.util.spvc.SpvcHLSLResourceBinding.Buffer> implements org.lwjgl.system.NativeResource {
        private static final org.lwjgl.util.spvc.SpvcHLSLResourceBinding ELEMENT_FACTORY = null;

        public Buffer(java.nio.ByteBuffer r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r6
                int r2 = r2.remaining()
                int r3 = org.lwjgl.util.spvc.SpvcHLSLResourceBinding.SIZEOF
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
        protected org.lwjgl.util.spvc.SpvcHLSLResourceBinding.Buffer self() {
                r2 = this;
                r0 = r2
                return r0
        }

        protected org.lwjgl.util.spvc.SpvcHLSLResourceBinding.Buffer create(long r11, java.nio.ByteBuffer r13, int r14, int r15, int r16, int r17) {
                r10 = this;
                org.lwjgl.util.spvc.SpvcHLSLResourceBinding$Buffer r0 = new org.lwjgl.util.spvc.SpvcHLSLResourceBinding$Buffer
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
        protected org.lwjgl.util.spvc.SpvcHLSLResourceBinding getElementFactory() {
                r2 = this;
                org.lwjgl.util.spvc.SpvcHLSLResourceBinding r0 = org.lwjgl.util.spvc.SpvcHLSLResourceBinding.Buffer.ELEMENT_FACTORY
                return r0
        }

        @org.lwjgl.system.NativeType("SpvExecutionModel")
        public int stage() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.util.spvc.SpvcHLSLResourceBinding.nstage(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("unsigned")
        public int desc_set() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.util.spvc.SpvcHLSLResourceBinding.ndesc_set(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("unsigned")
        public int binding() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.util.spvc.SpvcHLSLResourceBinding.nbinding(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("spvc_hlsl_resource_binding_mapping")
        public org.lwjgl.util.spvc.SpvcHLSLResourceBindingMapping cbv() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                org.lwjgl.util.spvc.SpvcHLSLResourceBindingMapping r0 = org.lwjgl.util.spvc.SpvcHLSLResourceBinding.ncbv(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("spvc_hlsl_resource_binding_mapping")
        public org.lwjgl.util.spvc.SpvcHLSLResourceBindingMapping uav() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                org.lwjgl.util.spvc.SpvcHLSLResourceBindingMapping r0 = org.lwjgl.util.spvc.SpvcHLSLResourceBinding.nuav(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("spvc_hlsl_resource_binding_mapping")
        public org.lwjgl.util.spvc.SpvcHLSLResourceBindingMapping srv() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                org.lwjgl.util.spvc.SpvcHLSLResourceBindingMapping r0 = org.lwjgl.util.spvc.SpvcHLSLResourceBinding.nsrv(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("spvc_hlsl_resource_binding_mapping")
        public org.lwjgl.util.spvc.SpvcHLSLResourceBindingMapping sampler() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                org.lwjgl.util.spvc.SpvcHLSLResourceBindingMapping r0 = org.lwjgl.util.spvc.SpvcHLSLResourceBinding.nsampler(r0)
                return r0
        }

        public org.lwjgl.util.spvc.SpvcHLSLResourceBinding.Buffer stage(@org.lwjgl.system.NativeType("SpvExecutionModel") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.util.spvc.SpvcHLSLResourceBinding.nstage(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.util.spvc.SpvcHLSLResourceBinding.Buffer desc_set(@org.lwjgl.system.NativeType("unsigned") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.util.spvc.SpvcHLSLResourceBinding.ndesc_set(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.util.spvc.SpvcHLSLResourceBinding.Buffer binding(@org.lwjgl.system.NativeType("unsigned") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.util.spvc.SpvcHLSLResourceBinding.nbinding(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.util.spvc.SpvcHLSLResourceBinding.Buffer cbv(@org.lwjgl.system.NativeType("spvc_hlsl_resource_binding_mapping") org.lwjgl.util.spvc.SpvcHLSLResourceBindingMapping r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.util.spvc.SpvcHLSLResourceBinding.ncbv(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.util.spvc.SpvcHLSLResourceBinding.Buffer cbv(java.util.function.Consumer<org.lwjgl.util.spvc.SpvcHLSLResourceBindingMapping> r4) {
                r3 = this;
                r0 = r4
                r1 = r3
                org.lwjgl.util.spvc.SpvcHLSLResourceBindingMapping r1 = r1.cbv()
                r0.accept(r1)
                r0 = r3
                return r0
        }

        public org.lwjgl.util.spvc.SpvcHLSLResourceBinding.Buffer uav(@org.lwjgl.system.NativeType("spvc_hlsl_resource_binding_mapping") org.lwjgl.util.spvc.SpvcHLSLResourceBindingMapping r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.util.spvc.SpvcHLSLResourceBinding.nuav(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.util.spvc.SpvcHLSLResourceBinding.Buffer uav(java.util.function.Consumer<org.lwjgl.util.spvc.SpvcHLSLResourceBindingMapping> r4) {
                r3 = this;
                r0 = r4
                r1 = r3
                org.lwjgl.util.spvc.SpvcHLSLResourceBindingMapping r1 = r1.uav()
                r0.accept(r1)
                r0 = r3
                return r0
        }

        public org.lwjgl.util.spvc.SpvcHLSLResourceBinding.Buffer srv(@org.lwjgl.system.NativeType("spvc_hlsl_resource_binding_mapping") org.lwjgl.util.spvc.SpvcHLSLResourceBindingMapping r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.util.spvc.SpvcHLSLResourceBinding.nsrv(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.util.spvc.SpvcHLSLResourceBinding.Buffer srv(java.util.function.Consumer<org.lwjgl.util.spvc.SpvcHLSLResourceBindingMapping> r4) {
                r3 = this;
                r0 = r4
                r1 = r3
                org.lwjgl.util.spvc.SpvcHLSLResourceBindingMapping r1 = r1.srv()
                r0.accept(r1)
                r0 = r3
                return r0
        }

        public org.lwjgl.util.spvc.SpvcHLSLResourceBinding.Buffer sampler(@org.lwjgl.system.NativeType("spvc_hlsl_resource_binding_mapping") org.lwjgl.util.spvc.SpvcHLSLResourceBindingMapping r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.util.spvc.SpvcHLSLResourceBinding.nsampler(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.util.spvc.SpvcHLSLResourceBinding.Buffer sampler(java.util.function.Consumer<org.lwjgl.util.spvc.SpvcHLSLResourceBindingMapping> r4) {
                r3 = this;
                r0 = r4
                r1 = r3
                org.lwjgl.util.spvc.SpvcHLSLResourceBindingMapping r1 = r1.sampler()
                r0.accept(r1)
                r0 = r3
                return r0
        }

        @Override // org.lwjgl.system.StructBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.Struct getElementFactory() {
                r2 = this;
                r0 = r2
                org.lwjgl.util.spvc.SpvcHLSLResourceBinding r0 = r0.getElementFactory()
                return r0
        }

        /* JADX INFO: renamed from: create, reason: collision with other method in class */
        protected /* bridge */ /* synthetic */ org.lwjgl.system.CustomBuffer m3739create(long r10, java.nio.ByteBuffer r12, int r13, int r14, int r15, int r16) {
                r9 = this;
                r0 = r9
                r1 = r10
                r2 = r12
                r3 = r13
                r4 = r14
                r5 = r15
                r6 = r16
                org.lwjgl.util.spvc.SpvcHLSLResourceBinding$Buffer r0 = r0.create(r1, r2, r3, r4, r5, r6)
                return r0
        }

        @Override // org.lwjgl.system.CustomBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.CustomBuffer self() {
                r2 = this;
                r0 = r2
                org.lwjgl.util.spvc.SpvcHLSLResourceBinding$Buffer r0 = r0.self()
                return r0
        }

        static {
                r0 = -1
                org.lwjgl.util.spvc.SpvcHLSLResourceBinding r0 = org.lwjgl.util.spvc.SpvcHLSLResourceBinding.create(r0)
                org.lwjgl.util.spvc.SpvcHLSLResourceBinding.Buffer.ELEMENT_FACTORY = r0
                return
        }
    }

    protected SpvcHLSLResourceBinding(long r6, java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    protected org.lwjgl.util.spvc.SpvcHLSLResourceBinding create(long r7, java.nio.ByteBuffer r9) {
            r6 = this;
            org.lwjgl.util.spvc.SpvcHLSLResourceBinding r0 = new org.lwjgl.util.spvc.SpvcHLSLResourceBinding
            r1 = r0
            r2 = r7
            r3 = r9
            r1.<init>(r2, r3)
            return r0
    }

    public SpvcHLSLResourceBinding(java.nio.ByteBuffer r7) {
            r6 = this;
            r0 = r6
            r1 = r7
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            r2 = r7
            int r3 = org.lwjgl.util.spvc.SpvcHLSLResourceBinding.SIZEOF
            java.nio.ByteBuffer r2 = __checkContainer(r2, r3)
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
            r2 = this;
            int r0 = org.lwjgl.util.spvc.SpvcHLSLResourceBinding.SIZEOF
            return r0
    }

    @org.lwjgl.system.NativeType("SpvExecutionModel")
    public int stage() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nstage(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("unsigned")
    public int desc_set() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = ndesc_set(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("unsigned")
    public int binding() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nbinding(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("spvc_hlsl_resource_binding_mapping")
    public org.lwjgl.util.spvc.SpvcHLSLResourceBindingMapping cbv() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            org.lwjgl.util.spvc.SpvcHLSLResourceBindingMapping r0 = ncbv(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("spvc_hlsl_resource_binding_mapping")
    public org.lwjgl.util.spvc.SpvcHLSLResourceBindingMapping uav() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            org.lwjgl.util.spvc.SpvcHLSLResourceBindingMapping r0 = nuav(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("spvc_hlsl_resource_binding_mapping")
    public org.lwjgl.util.spvc.SpvcHLSLResourceBindingMapping srv() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            org.lwjgl.util.spvc.SpvcHLSLResourceBindingMapping r0 = nsrv(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("spvc_hlsl_resource_binding_mapping")
    public org.lwjgl.util.spvc.SpvcHLSLResourceBindingMapping sampler() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            org.lwjgl.util.spvc.SpvcHLSLResourceBindingMapping r0 = nsampler(r0)
            return r0
    }

    public org.lwjgl.util.spvc.SpvcHLSLResourceBinding stage(@org.lwjgl.system.NativeType("SpvExecutionModel") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nstage(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.util.spvc.SpvcHLSLResourceBinding desc_set(@org.lwjgl.system.NativeType("unsigned") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            ndesc_set(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.util.spvc.SpvcHLSLResourceBinding binding(@org.lwjgl.system.NativeType("unsigned") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nbinding(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.util.spvc.SpvcHLSLResourceBinding cbv(@org.lwjgl.system.NativeType("spvc_hlsl_resource_binding_mapping") org.lwjgl.util.spvc.SpvcHLSLResourceBindingMapping r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            ncbv(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.util.spvc.SpvcHLSLResourceBinding cbv(java.util.function.Consumer<org.lwjgl.util.spvc.SpvcHLSLResourceBindingMapping> r4) {
            r3 = this;
            r0 = r4
            r1 = r3
            org.lwjgl.util.spvc.SpvcHLSLResourceBindingMapping r1 = r1.cbv()
            r0.accept(r1)
            r0 = r3
            return r0
    }

    public org.lwjgl.util.spvc.SpvcHLSLResourceBinding uav(@org.lwjgl.system.NativeType("spvc_hlsl_resource_binding_mapping") org.lwjgl.util.spvc.SpvcHLSLResourceBindingMapping r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nuav(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.util.spvc.SpvcHLSLResourceBinding uav(java.util.function.Consumer<org.lwjgl.util.spvc.SpvcHLSLResourceBindingMapping> r4) {
            r3 = this;
            r0 = r4
            r1 = r3
            org.lwjgl.util.spvc.SpvcHLSLResourceBindingMapping r1 = r1.uav()
            r0.accept(r1)
            r0 = r3
            return r0
    }

    public org.lwjgl.util.spvc.SpvcHLSLResourceBinding srv(@org.lwjgl.system.NativeType("spvc_hlsl_resource_binding_mapping") org.lwjgl.util.spvc.SpvcHLSLResourceBindingMapping r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nsrv(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.util.spvc.SpvcHLSLResourceBinding srv(java.util.function.Consumer<org.lwjgl.util.spvc.SpvcHLSLResourceBindingMapping> r4) {
            r3 = this;
            r0 = r4
            r1 = r3
            org.lwjgl.util.spvc.SpvcHLSLResourceBindingMapping r1 = r1.srv()
            r0.accept(r1)
            r0 = r3
            return r0
    }

    public org.lwjgl.util.spvc.SpvcHLSLResourceBinding sampler(@org.lwjgl.system.NativeType("spvc_hlsl_resource_binding_mapping") org.lwjgl.util.spvc.SpvcHLSLResourceBindingMapping r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nsampler(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.util.spvc.SpvcHLSLResourceBinding sampler(java.util.function.Consumer<org.lwjgl.util.spvc.SpvcHLSLResourceBindingMapping> r4) {
            r3 = this;
            r0 = r4
            r1 = r3
            org.lwjgl.util.spvc.SpvcHLSLResourceBindingMapping r1 = r1.sampler()
            r0.accept(r1)
            r0 = r3
            return r0
    }

    public org.lwjgl.util.spvc.SpvcHLSLResourceBinding set(int r4, int r5, int r6, org.lwjgl.util.spvc.SpvcHLSLResourceBindingMapping r7, org.lwjgl.util.spvc.SpvcHLSLResourceBindingMapping r8, org.lwjgl.util.spvc.SpvcHLSLResourceBindingMapping r9, org.lwjgl.util.spvc.SpvcHLSLResourceBindingMapping r10) {
            r3 = this;
            r0 = r3
            r1 = r4
            org.lwjgl.util.spvc.SpvcHLSLResourceBinding r0 = r0.stage(r1)
            r0 = r3
            r1 = r5
            org.lwjgl.util.spvc.SpvcHLSLResourceBinding r0 = r0.desc_set(r1)
            r0 = r3
            r1 = r6
            org.lwjgl.util.spvc.SpvcHLSLResourceBinding r0 = r0.binding(r1)
            r0 = r3
            r1 = r7
            org.lwjgl.util.spvc.SpvcHLSLResourceBinding r0 = r0.cbv(r1)
            r0 = r3
            r1 = r8
            org.lwjgl.util.spvc.SpvcHLSLResourceBinding r0 = r0.uav(r1)
            r0 = r3
            r1 = r9
            org.lwjgl.util.spvc.SpvcHLSLResourceBinding r0 = r0.srv(r1)
            r0 = r3
            r1 = r10
            org.lwjgl.util.spvc.SpvcHLSLResourceBinding r0 = r0.sampler(r1)
            r0 = r3
            return r0
    }

    public org.lwjgl.util.spvc.SpvcHLSLResourceBinding set(org.lwjgl.util.spvc.SpvcHLSLResourceBinding r8) {
            r7 = this;
            r0 = r8
            long r0 = r0.address()
            r1 = r7
            long r1 = r1.address()
            int r2 = org.lwjgl.util.spvc.SpvcHLSLResourceBinding.SIZEOF
            long r2 = (long) r2
            org.lwjgl.system.MemoryUtil.memCopy(r0, r1, r2)
            r0 = r7
            return r0
    }

    public static org.lwjgl.util.spvc.SpvcHLSLResourceBinding malloc() {
            org.lwjgl.util.spvc.SpvcHLSLResourceBinding r0 = new org.lwjgl.util.spvc.SpvcHLSLResourceBinding
            r1 = r0
            int r2 = org.lwjgl.util.spvc.SpvcHLSLResourceBinding.SIZEOF
            long r2 = (long) r2
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.util.spvc.SpvcHLSLResourceBinding calloc() {
            org.lwjgl.util.spvc.SpvcHLSLResourceBinding r0 = new org.lwjgl.util.spvc.SpvcHLSLResourceBinding
            r1 = r0
            r2 = 1
            int r3 = org.lwjgl.util.spvc.SpvcHLSLResourceBinding.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.util.spvc.SpvcHLSLResourceBinding create() {
            int r0 = org.lwjgl.util.spvc.SpvcHLSLResourceBinding.SIZEOF
            java.nio.ByteBuffer r0 = org.lwjgl.BufferUtils.createByteBuffer(r0)
            r6 = r0
            org.lwjgl.util.spvc.SpvcHLSLResourceBinding r0 = new org.lwjgl.util.spvc.SpvcHLSLResourceBinding
            r1 = r0
            r2 = r6
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.util.spvc.SpvcHLSLResourceBinding create(long r6) {
            org.lwjgl.util.spvc.SpvcHLSLResourceBinding r0 = new org.lwjgl.util.spvc.SpvcHLSLResourceBinding
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.util.spvc.SpvcHLSLResourceBinding createSafe(long r6) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.util.spvc.SpvcHLSLResourceBinding r0 = new org.lwjgl.util.spvc.SpvcHLSLResourceBinding
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static org.lwjgl.util.spvc.SpvcHLSLResourceBinding.Buffer malloc(int r6) {
            org.lwjgl.util.spvc.SpvcHLSLResourceBinding$Buffer r0 = new org.lwjgl.util.spvc.SpvcHLSLResourceBinding$Buffer
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.util.spvc.SpvcHLSLResourceBinding.SIZEOF
            long r2 = __checkMalloc(r2, r3)
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.util.spvc.SpvcHLSLResourceBinding.Buffer calloc(int r7) {
            org.lwjgl.util.spvc.SpvcHLSLResourceBinding$Buffer r0 = new org.lwjgl.util.spvc.SpvcHLSLResourceBinding$Buffer
            r1 = r0
            r2 = r7
            long r2 = (long) r2
            int r3 = org.lwjgl.util.spvc.SpvcHLSLResourceBinding.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.util.spvc.SpvcHLSLResourceBinding.Buffer create(int r10) {
            r0 = r10
            int r1 = org.lwjgl.util.spvc.SpvcHLSLResourceBinding.SIZEOF
            java.nio.ByteBuffer r0 = __create(r0, r1)
            r11 = r0
            org.lwjgl.util.spvc.SpvcHLSLResourceBinding$Buffer r0 = new org.lwjgl.util.spvc.SpvcHLSLResourceBinding$Buffer
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

    public static org.lwjgl.util.spvc.SpvcHLSLResourceBinding.Buffer create(long r6, int r8) {
            org.lwjgl.util.spvc.SpvcHLSLResourceBinding$Buffer r0 = new org.lwjgl.util.spvc.SpvcHLSLResourceBinding$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.util.spvc.SpvcHLSLResourceBinding.Buffer createSafe(long r6, int r8) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.util.spvc.SpvcHLSLResourceBinding$Buffer r0 = new org.lwjgl.util.spvc.SpvcHLSLResourceBinding$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static org.lwjgl.util.spvc.SpvcHLSLResourceBinding malloc(org.lwjgl.system.MemoryStack r6) {
            org.lwjgl.util.spvc.SpvcHLSLResourceBinding r0 = new org.lwjgl.util.spvc.SpvcHLSLResourceBinding
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.util.spvc.SpvcHLSLResourceBinding.ALIGNOF
            int r4 = org.lwjgl.util.spvc.SpvcHLSLResourceBinding.SIZEOF
            long r2 = r2.nmalloc(r3, r4)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.util.spvc.SpvcHLSLResourceBinding calloc(org.lwjgl.system.MemoryStack r7) {
            org.lwjgl.util.spvc.SpvcHLSLResourceBinding r0 = new org.lwjgl.util.spvc.SpvcHLSLResourceBinding
            r1 = r0
            r2 = r7
            int r3 = org.lwjgl.util.spvc.SpvcHLSLResourceBinding.ALIGNOF
            r4 = 1
            int r5 = org.lwjgl.util.spvc.SpvcHLSLResourceBinding.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.util.spvc.SpvcHLSLResourceBinding.Buffer malloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.util.spvc.SpvcHLSLResourceBinding$Buffer r0 = new org.lwjgl.util.spvc.SpvcHLSLResourceBinding$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.util.spvc.SpvcHLSLResourceBinding.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.util.spvc.SpvcHLSLResourceBinding.SIZEOF
            int r4 = r4 * r5
            long r2 = r2.nmalloc(r3, r4)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.util.spvc.SpvcHLSLResourceBinding.Buffer calloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.util.spvc.SpvcHLSLResourceBinding$Buffer r0 = new org.lwjgl.util.spvc.SpvcHLSLResourceBinding$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.util.spvc.SpvcHLSLResourceBinding.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.util.spvc.SpvcHLSLResourceBinding.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static int nstage(long r5) {
            r0 = r5
            int r1 = org.lwjgl.util.spvc.SpvcHLSLResourceBinding.STAGE
            long r1 = (long) r1
            long r0 = r0 + r1
            int r0 = org.lwjgl.system.MemoryUtil.memGetInt(r0)
            return r0
    }

    public static int ndesc_set(long r5) {
            r0 = r5
            int r1 = org.lwjgl.util.spvc.SpvcHLSLResourceBinding.DESC_SET
            long r1 = (long) r1
            long r0 = r0 + r1
            int r0 = org.lwjgl.system.MemoryUtil.memGetInt(r0)
            return r0
    }

    public static int nbinding(long r5) {
            r0 = r5
            int r1 = org.lwjgl.util.spvc.SpvcHLSLResourceBinding.BINDING
            long r1 = (long) r1
            long r0 = r0 + r1
            int r0 = org.lwjgl.system.MemoryUtil.memGetInt(r0)
            return r0
    }

    public static org.lwjgl.util.spvc.SpvcHLSLResourceBindingMapping ncbv(long r5) {
            r0 = r5
            int r1 = org.lwjgl.util.spvc.SpvcHLSLResourceBinding.CBV
            long r1 = (long) r1
            long r0 = r0 + r1
            org.lwjgl.util.spvc.SpvcHLSLResourceBindingMapping r0 = org.lwjgl.util.spvc.SpvcHLSLResourceBindingMapping.create(r0)
            return r0
    }

    public static org.lwjgl.util.spvc.SpvcHLSLResourceBindingMapping nuav(long r5) {
            r0 = r5
            int r1 = org.lwjgl.util.spvc.SpvcHLSLResourceBinding.UAV
            long r1 = (long) r1
            long r0 = r0 + r1
            org.lwjgl.util.spvc.SpvcHLSLResourceBindingMapping r0 = org.lwjgl.util.spvc.SpvcHLSLResourceBindingMapping.create(r0)
            return r0
    }

    public static org.lwjgl.util.spvc.SpvcHLSLResourceBindingMapping nsrv(long r5) {
            r0 = r5
            int r1 = org.lwjgl.util.spvc.SpvcHLSLResourceBinding.SRV
            long r1 = (long) r1
            long r0 = r0 + r1
            org.lwjgl.util.spvc.SpvcHLSLResourceBindingMapping r0 = org.lwjgl.util.spvc.SpvcHLSLResourceBindingMapping.create(r0)
            return r0
    }

    public static org.lwjgl.util.spvc.SpvcHLSLResourceBindingMapping nsampler(long r5) {
            r0 = r5
            int r1 = org.lwjgl.util.spvc.SpvcHLSLResourceBinding.SAMPLER
            long r1 = (long) r1
            long r0 = r0 + r1
            org.lwjgl.util.spvc.SpvcHLSLResourceBindingMapping r0 = org.lwjgl.util.spvc.SpvcHLSLResourceBindingMapping.create(r0)
            return r0
    }

    public static void nstage(long r5, int r7) {
            r0 = r5
            int r1 = org.lwjgl.util.spvc.SpvcHLSLResourceBinding.STAGE
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            org.lwjgl.system.MemoryUtil.memPutInt(r0, r1)
            return
    }

    public static void ndesc_set(long r5, int r7) {
            r0 = r5
            int r1 = org.lwjgl.util.spvc.SpvcHLSLResourceBinding.DESC_SET
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            org.lwjgl.system.MemoryUtil.memPutInt(r0, r1)
            return
    }

    public static void nbinding(long r5, int r7) {
            r0 = r5
            int r1 = org.lwjgl.util.spvc.SpvcHLSLResourceBinding.BINDING
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            org.lwjgl.system.MemoryUtil.memPutInt(r0, r1)
            return
    }

    public static void ncbv(long r7, org.lwjgl.util.spvc.SpvcHLSLResourceBindingMapping r9) {
            r0 = r9
            long r0 = r0.address()
            r1 = r7
            int r2 = org.lwjgl.util.spvc.SpvcHLSLResourceBinding.CBV
            long r2 = (long) r2
            long r1 = r1 + r2
            int r2 = org.lwjgl.util.spvc.SpvcHLSLResourceBindingMapping.SIZEOF
            long r2 = (long) r2
            org.lwjgl.system.MemoryUtil.memCopy(r0, r1, r2)
            return
    }

    public static void nuav(long r7, org.lwjgl.util.spvc.SpvcHLSLResourceBindingMapping r9) {
            r0 = r9
            long r0 = r0.address()
            r1 = r7
            int r2 = org.lwjgl.util.spvc.SpvcHLSLResourceBinding.UAV
            long r2 = (long) r2
            long r1 = r1 + r2
            int r2 = org.lwjgl.util.spvc.SpvcHLSLResourceBindingMapping.SIZEOF
            long r2 = (long) r2
            org.lwjgl.system.MemoryUtil.memCopy(r0, r1, r2)
            return
    }

    public static void nsrv(long r7, org.lwjgl.util.spvc.SpvcHLSLResourceBindingMapping r9) {
            r0 = r9
            long r0 = r0.address()
            r1 = r7
            int r2 = org.lwjgl.util.spvc.SpvcHLSLResourceBinding.SRV
            long r2 = (long) r2
            long r1 = r1 + r2
            int r2 = org.lwjgl.util.spvc.SpvcHLSLResourceBindingMapping.SIZEOF
            long r2 = (long) r2
            org.lwjgl.system.MemoryUtil.memCopy(r0, r1, r2)
            return
    }

    public static void nsampler(long r7, org.lwjgl.util.spvc.SpvcHLSLResourceBindingMapping r9) {
            r0 = r9
            long r0 = r0.address()
            r1 = r7
            int r2 = org.lwjgl.util.spvc.SpvcHLSLResourceBinding.SAMPLER
            long r2 = (long) r2
            long r1 = r1 + r2
            int r2 = org.lwjgl.util.spvc.SpvcHLSLResourceBindingMapping.SIZEOF
            long r2 = (long) r2
            org.lwjgl.system.MemoryUtil.memCopy(r0, r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    protected /* bridge */ /* synthetic */ org.lwjgl.system.Struct create(long r6, java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            org.lwjgl.util.spvc.SpvcHLSLResourceBinding r0 = r0.create(r1, r2)
            return r0
    }

    static {
            r0 = 7
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
            int r3 = org.lwjgl.util.spvc.SpvcHLSLResourceBindingMapping.SIZEOF
            int r4 = org.lwjgl.util.spvc.SpvcHLSLResourceBindingMapping.ALIGNOF
            org.lwjgl.system.Struct$Member r3 = __member(r3, r4)
            r1[r2] = r3
            r1 = r0
            r2 = 4
            int r3 = org.lwjgl.util.spvc.SpvcHLSLResourceBindingMapping.SIZEOF
            int r4 = org.lwjgl.util.spvc.SpvcHLSLResourceBindingMapping.ALIGNOF
            org.lwjgl.system.Struct$Member r3 = __member(r3, r4)
            r1[r2] = r3
            r1 = r0
            r2 = 5
            int r3 = org.lwjgl.util.spvc.SpvcHLSLResourceBindingMapping.SIZEOF
            int r4 = org.lwjgl.util.spvc.SpvcHLSLResourceBindingMapping.ALIGNOF
            org.lwjgl.system.Struct$Member r3 = __member(r3, r4)
            r1[r2] = r3
            r1 = r0
            r2 = 6
            int r3 = org.lwjgl.util.spvc.SpvcHLSLResourceBindingMapping.SIZEOF
            int r4 = org.lwjgl.util.spvc.SpvcHLSLResourceBindingMapping.ALIGNOF
            org.lwjgl.system.Struct$Member r3 = __member(r3, r4)
            r1[r2] = r3
            org.lwjgl.system.Struct$Layout r0 = __struct(r0)
            r6 = r0
            r0 = r6
            int r0 = r0.getSize()
            org.lwjgl.util.spvc.SpvcHLSLResourceBinding.SIZEOF = r0
            r0 = r6
            int r0 = r0.getAlignment()
            org.lwjgl.util.spvc.SpvcHLSLResourceBinding.ALIGNOF = r0
            r0 = r6
            r1 = 0
            int r0 = r0.offsetof(r1)
            org.lwjgl.util.spvc.SpvcHLSLResourceBinding.STAGE = r0
            r0 = r6
            r1 = 1
            int r0 = r0.offsetof(r1)
            org.lwjgl.util.spvc.SpvcHLSLResourceBinding.DESC_SET = r0
            r0 = r6
            r1 = 2
            int r0 = r0.offsetof(r1)
            org.lwjgl.util.spvc.SpvcHLSLResourceBinding.BINDING = r0
            r0 = r6
            r1 = 3
            int r0 = r0.offsetof(r1)
            org.lwjgl.util.spvc.SpvcHLSLResourceBinding.CBV = r0
            r0 = r6
            r1 = 4
            int r0 = r0.offsetof(r1)
            org.lwjgl.util.spvc.SpvcHLSLResourceBinding.UAV = r0
            r0 = r6
            r1 = 5
            int r0 = r0.offsetof(r1)
            org.lwjgl.util.spvc.SpvcHLSLResourceBinding.SRV = r0
            r0 = r6
            r1 = 6
            int r0 = r0.offsetof(r1)
            org.lwjgl.util.spvc.SpvcHLSLResourceBinding.SAMPLER = r0
            return
    }
}
