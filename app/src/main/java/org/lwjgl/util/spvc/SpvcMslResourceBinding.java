package org.lwjgl.util.spvc;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/util/spvc/SpvcMslResourceBinding.class */
@org.lwjgl.system.NativeType("struct spvc_msl_resource_binding")
public class SpvcMslResourceBinding extends org.lwjgl.system.Struct<org.lwjgl.util.spvc.SpvcMslResourceBinding> implements org.lwjgl.system.NativeResource {
    public static final int SIZEOF = 0;
    public static final int ALIGNOF = 0;
    public static final int STAGE = 0;
    public static final int DESC_SET = 0;
    public static final int BINDING = 0;
    public static final int MSL_BUFFER = 0;
    public static final int MSL_TEXTURE = 0;
    public static final int MSL_SAMPLER = 0;

    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/util/spvc/SpvcMslResourceBinding$Buffer.class */
    public static class Buffer extends org.lwjgl.system.StructBuffer<org.lwjgl.util.spvc.SpvcMslResourceBinding, org.lwjgl.util.spvc.SpvcMslResourceBinding.Buffer> implements org.lwjgl.system.NativeResource {
        private static final org.lwjgl.util.spvc.SpvcMslResourceBinding ELEMENT_FACTORY = null;

        public Buffer(java.nio.ByteBuffer r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r6
                int r2 = r2.remaining()
                int r3 = org.lwjgl.util.spvc.SpvcMslResourceBinding.SIZEOF
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
        protected org.lwjgl.util.spvc.SpvcMslResourceBinding.Buffer self() {
                r2 = this;
                r0 = r2
                return r0
        }

        protected org.lwjgl.util.spvc.SpvcMslResourceBinding.Buffer create(long r11, java.nio.ByteBuffer r13, int r14, int r15, int r16, int r17) {
                r10 = this;
                org.lwjgl.util.spvc.SpvcMslResourceBinding$Buffer r0 = new org.lwjgl.util.spvc.SpvcMslResourceBinding$Buffer
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
        protected org.lwjgl.util.spvc.SpvcMslResourceBinding getElementFactory() {
                r2 = this;
                org.lwjgl.util.spvc.SpvcMslResourceBinding r0 = org.lwjgl.util.spvc.SpvcMslResourceBinding.Buffer.ELEMENT_FACTORY
                return r0
        }

        @org.lwjgl.system.NativeType("SpvExecutionModel")
        public int stage() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.util.spvc.SpvcMslResourceBinding.nstage(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("unsigned int")
        public int desc_set() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.util.spvc.SpvcMslResourceBinding.ndesc_set(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("unsigned int")
        public int binding() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.util.spvc.SpvcMslResourceBinding.nbinding(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("unsigned int")
        public int msl_buffer() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.util.spvc.SpvcMslResourceBinding.nmsl_buffer(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("unsigned int")
        public int msl_texture() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.util.spvc.SpvcMslResourceBinding.nmsl_texture(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("unsigned int")
        public int msl_sampler() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.util.spvc.SpvcMslResourceBinding.nmsl_sampler(r0)
                return r0
        }

        public org.lwjgl.util.spvc.SpvcMslResourceBinding.Buffer stage(@org.lwjgl.system.NativeType("SpvExecutionModel") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.util.spvc.SpvcMslResourceBinding.nstage(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.util.spvc.SpvcMslResourceBinding.Buffer desc_set(@org.lwjgl.system.NativeType("unsigned int") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.util.spvc.SpvcMslResourceBinding.ndesc_set(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.util.spvc.SpvcMslResourceBinding.Buffer binding(@org.lwjgl.system.NativeType("unsigned int") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.util.spvc.SpvcMslResourceBinding.nbinding(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.util.spvc.SpvcMslResourceBinding.Buffer msl_buffer(@org.lwjgl.system.NativeType("unsigned int") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.util.spvc.SpvcMslResourceBinding.nmsl_buffer(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.util.spvc.SpvcMslResourceBinding.Buffer msl_texture(@org.lwjgl.system.NativeType("unsigned int") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.util.spvc.SpvcMslResourceBinding.nmsl_texture(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.util.spvc.SpvcMslResourceBinding.Buffer msl_sampler(@org.lwjgl.system.NativeType("unsigned int") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.util.spvc.SpvcMslResourceBinding.nmsl_sampler(r0, r1)
                r0 = r4
                return r0
        }

        @Override // org.lwjgl.system.StructBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.Struct getElementFactory() {
                r2 = this;
                r0 = r2
                org.lwjgl.util.spvc.SpvcMslResourceBinding r0 = r0.getElementFactory()
                return r0
        }

        /* JADX INFO: renamed from: create, reason: collision with other method in class */
        protected /* bridge */ /* synthetic */ org.lwjgl.system.CustomBuffer m3754create(long r10, java.nio.ByteBuffer r12, int r13, int r14, int r15, int r16) {
                r9 = this;
                r0 = r9
                r1 = r10
                r2 = r12
                r3 = r13
                r4 = r14
                r5 = r15
                r6 = r16
                org.lwjgl.util.spvc.SpvcMslResourceBinding$Buffer r0 = r0.create(r1, r2, r3, r4, r5, r6)
                return r0
        }

        @Override // org.lwjgl.system.CustomBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.CustomBuffer self() {
                r2 = this;
                r0 = r2
                org.lwjgl.util.spvc.SpvcMslResourceBinding$Buffer r0 = r0.self()
                return r0
        }

        static {
                r0 = -1
                org.lwjgl.util.spvc.SpvcMslResourceBinding r0 = org.lwjgl.util.spvc.SpvcMslResourceBinding.create(r0)
                org.lwjgl.util.spvc.SpvcMslResourceBinding.Buffer.ELEMENT_FACTORY = r0
                return
        }
    }

    protected SpvcMslResourceBinding(long r6, java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    protected org.lwjgl.util.spvc.SpvcMslResourceBinding create(long r7, java.nio.ByteBuffer r9) {
            r6 = this;
            org.lwjgl.util.spvc.SpvcMslResourceBinding r0 = new org.lwjgl.util.spvc.SpvcMslResourceBinding
            r1 = r0
            r2 = r7
            r3 = r9
            r1.<init>(r2, r3)
            return r0
    }

    public SpvcMslResourceBinding(java.nio.ByteBuffer r7) {
            r6 = this;
            r0 = r6
            r1 = r7
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            r2 = r7
            int r3 = org.lwjgl.util.spvc.SpvcMslResourceBinding.SIZEOF
            java.nio.ByteBuffer r2 = __checkContainer(r2, r3)
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
            r2 = this;
            int r0 = org.lwjgl.util.spvc.SpvcMslResourceBinding.SIZEOF
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

    @org.lwjgl.system.NativeType("unsigned int")
    public int desc_set() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = ndesc_set(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("unsigned int")
    public int binding() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nbinding(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("unsigned int")
    public int msl_buffer() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nmsl_buffer(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("unsigned int")
    public int msl_texture() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nmsl_texture(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("unsigned int")
    public int msl_sampler() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nmsl_sampler(r0)
            return r0
    }

    public org.lwjgl.util.spvc.SpvcMslResourceBinding stage(@org.lwjgl.system.NativeType("SpvExecutionModel") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nstage(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.util.spvc.SpvcMslResourceBinding desc_set(@org.lwjgl.system.NativeType("unsigned int") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            ndesc_set(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.util.spvc.SpvcMslResourceBinding binding(@org.lwjgl.system.NativeType("unsigned int") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nbinding(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.util.spvc.SpvcMslResourceBinding msl_buffer(@org.lwjgl.system.NativeType("unsigned int") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nmsl_buffer(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.util.spvc.SpvcMslResourceBinding msl_texture(@org.lwjgl.system.NativeType("unsigned int") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nmsl_texture(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.util.spvc.SpvcMslResourceBinding msl_sampler(@org.lwjgl.system.NativeType("unsigned int") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nmsl_sampler(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.util.spvc.SpvcMslResourceBinding set(int r4, int r5, int r6, int r7, int r8, int r9) {
            r3 = this;
            r0 = r3
            r1 = r4
            org.lwjgl.util.spvc.SpvcMslResourceBinding r0 = r0.stage(r1)
            r0 = r3
            r1 = r5
            org.lwjgl.util.spvc.SpvcMslResourceBinding r0 = r0.desc_set(r1)
            r0 = r3
            r1 = r6
            org.lwjgl.util.spvc.SpvcMslResourceBinding r0 = r0.binding(r1)
            r0 = r3
            r1 = r7
            org.lwjgl.util.spvc.SpvcMslResourceBinding r0 = r0.msl_buffer(r1)
            r0 = r3
            r1 = r8
            org.lwjgl.util.spvc.SpvcMslResourceBinding r0 = r0.msl_texture(r1)
            r0 = r3
            r1 = r9
            org.lwjgl.util.spvc.SpvcMslResourceBinding r0 = r0.msl_sampler(r1)
            r0 = r3
            return r0
    }

    public org.lwjgl.util.spvc.SpvcMslResourceBinding set(org.lwjgl.util.spvc.SpvcMslResourceBinding r8) {
            r7 = this;
            r0 = r8
            long r0 = r0.address()
            r1 = r7
            long r1 = r1.address()
            int r2 = org.lwjgl.util.spvc.SpvcMslResourceBinding.SIZEOF
            long r2 = (long) r2
            org.lwjgl.system.MemoryUtil.memCopy(r0, r1, r2)
            r0 = r7
            return r0
    }

    public static org.lwjgl.util.spvc.SpvcMslResourceBinding malloc() {
            org.lwjgl.util.spvc.SpvcMslResourceBinding r0 = new org.lwjgl.util.spvc.SpvcMslResourceBinding
            r1 = r0
            int r2 = org.lwjgl.util.spvc.SpvcMslResourceBinding.SIZEOF
            long r2 = (long) r2
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.util.spvc.SpvcMslResourceBinding calloc() {
            org.lwjgl.util.spvc.SpvcMslResourceBinding r0 = new org.lwjgl.util.spvc.SpvcMslResourceBinding
            r1 = r0
            r2 = 1
            int r3 = org.lwjgl.util.spvc.SpvcMslResourceBinding.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.util.spvc.SpvcMslResourceBinding create() {
            int r0 = org.lwjgl.util.spvc.SpvcMslResourceBinding.SIZEOF
            java.nio.ByteBuffer r0 = org.lwjgl.BufferUtils.createByteBuffer(r0)
            r6 = r0
            org.lwjgl.util.spvc.SpvcMslResourceBinding r0 = new org.lwjgl.util.spvc.SpvcMslResourceBinding
            r1 = r0
            r2 = r6
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.util.spvc.SpvcMslResourceBinding create(long r6) {
            org.lwjgl.util.spvc.SpvcMslResourceBinding r0 = new org.lwjgl.util.spvc.SpvcMslResourceBinding
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.util.spvc.SpvcMslResourceBinding createSafe(long r6) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.util.spvc.SpvcMslResourceBinding r0 = new org.lwjgl.util.spvc.SpvcMslResourceBinding
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static org.lwjgl.util.spvc.SpvcMslResourceBinding.Buffer malloc(int r6) {
            org.lwjgl.util.spvc.SpvcMslResourceBinding$Buffer r0 = new org.lwjgl.util.spvc.SpvcMslResourceBinding$Buffer
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.util.spvc.SpvcMslResourceBinding.SIZEOF
            long r2 = __checkMalloc(r2, r3)
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.util.spvc.SpvcMslResourceBinding.Buffer calloc(int r7) {
            org.lwjgl.util.spvc.SpvcMslResourceBinding$Buffer r0 = new org.lwjgl.util.spvc.SpvcMslResourceBinding$Buffer
            r1 = r0
            r2 = r7
            long r2 = (long) r2
            int r3 = org.lwjgl.util.spvc.SpvcMslResourceBinding.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.util.spvc.SpvcMslResourceBinding.Buffer create(int r10) {
            r0 = r10
            int r1 = org.lwjgl.util.spvc.SpvcMslResourceBinding.SIZEOF
            java.nio.ByteBuffer r0 = __create(r0, r1)
            r11 = r0
            org.lwjgl.util.spvc.SpvcMslResourceBinding$Buffer r0 = new org.lwjgl.util.spvc.SpvcMslResourceBinding$Buffer
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

    public static org.lwjgl.util.spvc.SpvcMslResourceBinding.Buffer create(long r6, int r8) {
            org.lwjgl.util.spvc.SpvcMslResourceBinding$Buffer r0 = new org.lwjgl.util.spvc.SpvcMslResourceBinding$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.util.spvc.SpvcMslResourceBinding.Buffer createSafe(long r6, int r8) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.util.spvc.SpvcMslResourceBinding$Buffer r0 = new org.lwjgl.util.spvc.SpvcMslResourceBinding$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static org.lwjgl.util.spvc.SpvcMslResourceBinding malloc(org.lwjgl.system.MemoryStack r6) {
            org.lwjgl.util.spvc.SpvcMslResourceBinding r0 = new org.lwjgl.util.spvc.SpvcMslResourceBinding
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.util.spvc.SpvcMslResourceBinding.ALIGNOF
            int r4 = org.lwjgl.util.spvc.SpvcMslResourceBinding.SIZEOF
            long r2 = r2.nmalloc(r3, r4)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.util.spvc.SpvcMslResourceBinding calloc(org.lwjgl.system.MemoryStack r7) {
            org.lwjgl.util.spvc.SpvcMslResourceBinding r0 = new org.lwjgl.util.spvc.SpvcMslResourceBinding
            r1 = r0
            r2 = r7
            int r3 = org.lwjgl.util.spvc.SpvcMslResourceBinding.ALIGNOF
            r4 = 1
            int r5 = org.lwjgl.util.spvc.SpvcMslResourceBinding.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.util.spvc.SpvcMslResourceBinding.Buffer malloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.util.spvc.SpvcMslResourceBinding$Buffer r0 = new org.lwjgl.util.spvc.SpvcMslResourceBinding$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.util.spvc.SpvcMslResourceBinding.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.util.spvc.SpvcMslResourceBinding.SIZEOF
            int r4 = r4 * r5
            long r2 = r2.nmalloc(r3, r4)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.util.spvc.SpvcMslResourceBinding.Buffer calloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.util.spvc.SpvcMslResourceBinding$Buffer r0 = new org.lwjgl.util.spvc.SpvcMslResourceBinding$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.util.spvc.SpvcMslResourceBinding.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.util.spvc.SpvcMslResourceBinding.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static int nstage(long r5) {
            r0 = r5
            int r1 = org.lwjgl.util.spvc.SpvcMslResourceBinding.STAGE
            long r1 = (long) r1
            long r0 = r0 + r1
            int r0 = org.lwjgl.system.MemoryUtil.memGetInt(r0)
            return r0
    }

    public static int ndesc_set(long r5) {
            r0 = r5
            int r1 = org.lwjgl.util.spvc.SpvcMslResourceBinding.DESC_SET
            long r1 = (long) r1
            long r0 = r0 + r1
            int r0 = org.lwjgl.system.MemoryUtil.memGetInt(r0)
            return r0
    }

    public static int nbinding(long r5) {
            r0 = r5
            int r1 = org.lwjgl.util.spvc.SpvcMslResourceBinding.BINDING
            long r1 = (long) r1
            long r0 = r0 + r1
            int r0 = org.lwjgl.system.MemoryUtil.memGetInt(r0)
            return r0
    }

    public static int nmsl_buffer(long r5) {
            r0 = r5
            int r1 = org.lwjgl.util.spvc.SpvcMslResourceBinding.MSL_BUFFER
            long r1 = (long) r1
            long r0 = r0 + r1
            int r0 = org.lwjgl.system.MemoryUtil.memGetInt(r0)
            return r0
    }

    public static int nmsl_texture(long r5) {
            r0 = r5
            int r1 = org.lwjgl.util.spvc.SpvcMslResourceBinding.MSL_TEXTURE
            long r1 = (long) r1
            long r0 = r0 + r1
            int r0 = org.lwjgl.system.MemoryUtil.memGetInt(r0)
            return r0
    }

    public static int nmsl_sampler(long r5) {
            r0 = r5
            int r1 = org.lwjgl.util.spvc.SpvcMslResourceBinding.MSL_SAMPLER
            long r1 = (long) r1
            long r0 = r0 + r1
            int r0 = org.lwjgl.system.MemoryUtil.memGetInt(r0)
            return r0
    }

    public static void nstage(long r5, int r7) {
            r0 = r5
            int r1 = org.lwjgl.util.spvc.SpvcMslResourceBinding.STAGE
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            org.lwjgl.system.MemoryUtil.memPutInt(r0, r1)
            return
    }

    public static void ndesc_set(long r5, int r7) {
            r0 = r5
            int r1 = org.lwjgl.util.spvc.SpvcMslResourceBinding.DESC_SET
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            org.lwjgl.system.MemoryUtil.memPutInt(r0, r1)
            return
    }

    public static void nbinding(long r5, int r7) {
            r0 = r5
            int r1 = org.lwjgl.util.spvc.SpvcMslResourceBinding.BINDING
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            org.lwjgl.system.MemoryUtil.memPutInt(r0, r1)
            return
    }

    public static void nmsl_buffer(long r5, int r7) {
            r0 = r5
            int r1 = org.lwjgl.util.spvc.SpvcMslResourceBinding.MSL_BUFFER
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            org.lwjgl.system.MemoryUtil.memPutInt(r0, r1)
            return
    }

    public static void nmsl_texture(long r5, int r7) {
            r0 = r5
            int r1 = org.lwjgl.util.spvc.SpvcMslResourceBinding.MSL_TEXTURE
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            org.lwjgl.system.MemoryUtil.memPutInt(r0, r1)
            return
    }

    public static void nmsl_sampler(long r5, int r7) {
            r0 = r5
            int r1 = org.lwjgl.util.spvc.SpvcMslResourceBinding.MSL_SAMPLER
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
            org.lwjgl.util.spvc.SpvcMslResourceBinding r0 = r0.create(r1, r2)
            return r0
    }

    static {
            r0 = 6
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
            org.lwjgl.system.Struct$Layout r0 = __struct(r0)
            r5 = r0
            r0 = r5
            int r0 = r0.getSize()
            org.lwjgl.util.spvc.SpvcMslResourceBinding.SIZEOF = r0
            r0 = r5
            int r0 = r0.getAlignment()
            org.lwjgl.util.spvc.SpvcMslResourceBinding.ALIGNOF = r0
            r0 = r5
            r1 = 0
            int r0 = r0.offsetof(r1)
            org.lwjgl.util.spvc.SpvcMslResourceBinding.STAGE = r0
            r0 = r5
            r1 = 1
            int r0 = r0.offsetof(r1)
            org.lwjgl.util.spvc.SpvcMslResourceBinding.DESC_SET = r0
            r0 = r5
            r1 = 2
            int r0 = r0.offsetof(r1)
            org.lwjgl.util.spvc.SpvcMslResourceBinding.BINDING = r0
            r0 = r5
            r1 = 3
            int r0 = r0.offsetof(r1)
            org.lwjgl.util.spvc.SpvcMslResourceBinding.MSL_BUFFER = r0
            r0 = r5
            r1 = 4
            int r0 = r0.offsetof(r1)
            org.lwjgl.util.spvc.SpvcMslResourceBinding.MSL_TEXTURE = r0
            r0 = r5
            r1 = 5
            int r0 = r0.offsetof(r1)
            org.lwjgl.util.spvc.SpvcMslResourceBinding.MSL_SAMPLER = r0
            return
    }
}
