package org.lwjgl.system.linux.liburing;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/system/linux/liburing/IOURingQueryOpcode.class */
@org.lwjgl.system.NativeType("struct io_uring_query_opcode")
public class IOURingQueryOpcode extends org.lwjgl.system.Struct<org.lwjgl.system.linux.liburing.IOURingQueryOpcode> implements org.lwjgl.system.NativeResource {
    public static final int SIZEOF = 0;
    public static final int ALIGNOF = 0;
    public static final int NR_REQUEST_OPCODES = 0;
    public static final int NR_REGISTER_OPCODES = 0;
    public static final int FEATURE_FLAGS = 0;
    public static final int RING_SETUP_FLAGS = 0;
    public static final int ENTER_FLAGS = 0;
    public static final int SQE_FLAGS = 0;

    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/system/linux/liburing/IOURingQueryOpcode$Buffer.class */
    public static class Buffer extends org.lwjgl.system.StructBuffer<org.lwjgl.system.linux.liburing.IOURingQueryOpcode, org.lwjgl.system.linux.liburing.IOURingQueryOpcode.Buffer> implements org.lwjgl.system.NativeResource {
        private static final org.lwjgl.system.linux.liburing.IOURingQueryOpcode ELEMENT_FACTORY = null;

        public Buffer(java.nio.ByteBuffer r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r6
                int r2 = r2.remaining()
                int r3 = org.lwjgl.system.linux.liburing.IOURingQueryOpcode.SIZEOF
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
        protected org.lwjgl.system.linux.liburing.IOURingQueryOpcode.Buffer self() {
                r2 = this;
                r0 = r2
                return r0
        }

        protected org.lwjgl.system.linux.liburing.IOURingQueryOpcode.Buffer create(long r11, java.nio.ByteBuffer r13, int r14, int r15, int r16, int r17) {
                r10 = this;
                org.lwjgl.system.linux.liburing.IOURingQueryOpcode$Buffer r0 = new org.lwjgl.system.linux.liburing.IOURingQueryOpcode$Buffer
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
        protected org.lwjgl.system.linux.liburing.IOURingQueryOpcode getElementFactory() {
                r2 = this;
                org.lwjgl.system.linux.liburing.IOURingQueryOpcode r0 = org.lwjgl.system.linux.liburing.IOURingQueryOpcode.Buffer.ELEMENT_FACTORY
                return r0
        }

        @org.lwjgl.system.NativeType("__u32")
        public int nr_request_opcodes() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.system.linux.liburing.IOURingQueryOpcode.nnr_request_opcodes(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("__u32")
        public int nr_register_opcodes() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.system.linux.liburing.IOURingQueryOpcode.nnr_register_opcodes(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("__u64")
        public long feature_flags() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                long r0 = org.lwjgl.system.linux.liburing.IOURingQueryOpcode.nfeature_flags(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("__u64")
        public long ring_setup_flags() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                long r0 = org.lwjgl.system.linux.liburing.IOURingQueryOpcode.nring_setup_flags(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("__u64")
        public long enter_flags() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                long r0 = org.lwjgl.system.linux.liburing.IOURingQueryOpcode.nenter_flags(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("__u64")
        public long sqe_flags() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                long r0 = org.lwjgl.system.linux.liburing.IOURingQueryOpcode.nsqe_flags(r0)
                return r0
        }

        public org.lwjgl.system.linux.liburing.IOURingQueryOpcode.Buffer nr_request_opcodes(@org.lwjgl.system.NativeType("__u32") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.system.linux.liburing.IOURingQueryOpcode.nnr_request_opcodes(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.system.linux.liburing.IOURingQueryOpcode.Buffer nr_register_opcodes(@org.lwjgl.system.NativeType("__u32") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.system.linux.liburing.IOURingQueryOpcode.nnr_register_opcodes(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.system.linux.liburing.IOURingQueryOpcode.Buffer feature_flags(@org.lwjgl.system.NativeType("__u64") long r6) {
                r5 = this;
                r0 = r5
                long r0 = r0.address()
                r1 = r6
                org.lwjgl.system.linux.liburing.IOURingQueryOpcode.nfeature_flags(r0, r1)
                r0 = r5
                return r0
        }

        public org.lwjgl.system.linux.liburing.IOURingQueryOpcode.Buffer ring_setup_flags(@org.lwjgl.system.NativeType("__u64") long r6) {
                r5 = this;
                r0 = r5
                long r0 = r0.address()
                r1 = r6
                org.lwjgl.system.linux.liburing.IOURingQueryOpcode.nring_setup_flags(r0, r1)
                r0 = r5
                return r0
        }

        public org.lwjgl.system.linux.liburing.IOURingQueryOpcode.Buffer enter_flags(@org.lwjgl.system.NativeType("__u64") long r6) {
                r5 = this;
                r0 = r5
                long r0 = r0.address()
                r1 = r6
                org.lwjgl.system.linux.liburing.IOURingQueryOpcode.nenter_flags(r0, r1)
                r0 = r5
                return r0
        }

        public org.lwjgl.system.linux.liburing.IOURingQueryOpcode.Buffer sqe_flags(@org.lwjgl.system.NativeType("__u64") long r6) {
                r5 = this;
                r0 = r5
                long r0 = r0.address()
                r1 = r6
                org.lwjgl.system.linux.liburing.IOURingQueryOpcode.nsqe_flags(r0, r1)
                r0 = r5
                return r0
        }

        @Override // org.lwjgl.system.StructBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.Struct getElementFactory() {
                r2 = this;
                r0 = r2
                org.lwjgl.system.linux.liburing.IOURingQueryOpcode r0 = r0.getElementFactory()
                return r0
        }

        /* JADX INFO: renamed from: create, reason: collision with other method in class */
        protected /* bridge */ /* synthetic */ org.lwjgl.system.CustomBuffer m3331create(long r10, java.nio.ByteBuffer r12, int r13, int r14, int r15, int r16) {
                r9 = this;
                r0 = r9
                r1 = r10
                r2 = r12
                r3 = r13
                r4 = r14
                r5 = r15
                r6 = r16
                org.lwjgl.system.linux.liburing.IOURingQueryOpcode$Buffer r0 = r0.create(r1, r2, r3, r4, r5, r6)
                return r0
        }

        @Override // org.lwjgl.system.CustomBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.CustomBuffer self() {
                r2 = this;
                r0 = r2
                org.lwjgl.system.linux.liburing.IOURingQueryOpcode$Buffer r0 = r0.self()
                return r0
        }

        static {
                r0 = -1
                org.lwjgl.system.linux.liburing.IOURingQueryOpcode r0 = org.lwjgl.system.linux.liburing.IOURingQueryOpcode.create(r0)
                org.lwjgl.system.linux.liburing.IOURingQueryOpcode.Buffer.ELEMENT_FACTORY = r0
                return
        }
    }

    protected IOURingQueryOpcode(long r6, java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    protected org.lwjgl.system.linux.liburing.IOURingQueryOpcode create(long r7, java.nio.ByteBuffer r9) {
            r6 = this;
            org.lwjgl.system.linux.liburing.IOURingQueryOpcode r0 = new org.lwjgl.system.linux.liburing.IOURingQueryOpcode
            r1 = r0
            r2 = r7
            r3 = r9
            r1.<init>(r2, r3)
            return r0
    }

    public IOURingQueryOpcode(java.nio.ByteBuffer r7) {
            r6 = this;
            r0 = r6
            r1 = r7
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            r2 = r7
            int r3 = org.lwjgl.system.linux.liburing.IOURingQueryOpcode.SIZEOF
            java.nio.ByteBuffer r2 = __checkContainer(r2, r3)
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
            r2 = this;
            int r0 = org.lwjgl.system.linux.liburing.IOURingQueryOpcode.SIZEOF
            return r0
    }

    @org.lwjgl.system.NativeType("__u32")
    public int nr_request_opcodes() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nnr_request_opcodes(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("__u32")
    public int nr_register_opcodes() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nnr_register_opcodes(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("__u64")
    public long feature_flags() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            long r0 = nfeature_flags(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("__u64")
    public long ring_setup_flags() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            long r0 = nring_setup_flags(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("__u64")
    public long enter_flags() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            long r0 = nenter_flags(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("__u64")
    public long sqe_flags() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            long r0 = nsqe_flags(r0)
            return r0
    }

    public org.lwjgl.system.linux.liburing.IOURingQueryOpcode nr_request_opcodes(@org.lwjgl.system.NativeType("__u32") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nnr_request_opcodes(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.system.linux.liburing.IOURingQueryOpcode nr_register_opcodes(@org.lwjgl.system.NativeType("__u32") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nnr_register_opcodes(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.system.linux.liburing.IOURingQueryOpcode feature_flags(@org.lwjgl.system.NativeType("__u64") long r6) {
            r5 = this;
            r0 = r5
            long r0 = r0.address()
            r1 = r6
            nfeature_flags(r0, r1)
            r0 = r5
            return r0
    }

    public org.lwjgl.system.linux.liburing.IOURingQueryOpcode ring_setup_flags(@org.lwjgl.system.NativeType("__u64") long r6) {
            r5 = this;
            r0 = r5
            long r0 = r0.address()
            r1 = r6
            nring_setup_flags(r0, r1)
            r0 = r5
            return r0
    }

    public org.lwjgl.system.linux.liburing.IOURingQueryOpcode enter_flags(@org.lwjgl.system.NativeType("__u64") long r6) {
            r5 = this;
            r0 = r5
            long r0 = r0.address()
            r1 = r6
            nenter_flags(r0, r1)
            r0 = r5
            return r0
    }

    public org.lwjgl.system.linux.liburing.IOURingQueryOpcode sqe_flags(@org.lwjgl.system.NativeType("__u64") long r6) {
            r5 = this;
            r0 = r5
            long r0 = r0.address()
            r1 = r6
            nsqe_flags(r0, r1)
            r0 = r5
            return r0
    }

    public org.lwjgl.system.linux.liburing.IOURingQueryOpcode set(int r5, int r6, long r7, long r9, long r11, long r13) {
            r4 = this;
            r0 = r4
            r1 = r5
            org.lwjgl.system.linux.liburing.IOURingQueryOpcode r0 = r0.nr_request_opcodes(r1)
            r0 = r4
            r1 = r6
            org.lwjgl.system.linux.liburing.IOURingQueryOpcode r0 = r0.nr_register_opcodes(r1)
            r0 = r4
            r1 = r7
            org.lwjgl.system.linux.liburing.IOURingQueryOpcode r0 = r0.feature_flags(r1)
            r0 = r4
            r1 = r9
            org.lwjgl.system.linux.liburing.IOURingQueryOpcode r0 = r0.ring_setup_flags(r1)
            r0 = r4
            r1 = r11
            org.lwjgl.system.linux.liburing.IOURingQueryOpcode r0 = r0.enter_flags(r1)
            r0 = r4
            r1 = r13
            org.lwjgl.system.linux.liburing.IOURingQueryOpcode r0 = r0.sqe_flags(r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.system.linux.liburing.IOURingQueryOpcode set(org.lwjgl.system.linux.liburing.IOURingQueryOpcode r8) {
            r7 = this;
            r0 = r8
            long r0 = r0.address()
            r1 = r7
            long r1 = r1.address()
            int r2 = org.lwjgl.system.linux.liburing.IOURingQueryOpcode.SIZEOF
            long r2 = (long) r2
            org.lwjgl.system.MemoryUtil.memCopy(r0, r1, r2)
            r0 = r7
            return r0
    }

    public static org.lwjgl.system.linux.liburing.IOURingQueryOpcode malloc() {
            org.lwjgl.system.linux.liburing.IOURingQueryOpcode r0 = new org.lwjgl.system.linux.liburing.IOURingQueryOpcode
            r1 = r0
            int r2 = org.lwjgl.system.linux.liburing.IOURingQueryOpcode.SIZEOF
            long r2 = (long) r2
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.system.linux.liburing.IOURingQueryOpcode calloc() {
            org.lwjgl.system.linux.liburing.IOURingQueryOpcode r0 = new org.lwjgl.system.linux.liburing.IOURingQueryOpcode
            r1 = r0
            r2 = 1
            int r3 = org.lwjgl.system.linux.liburing.IOURingQueryOpcode.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.system.linux.liburing.IOURingQueryOpcode create() {
            int r0 = org.lwjgl.system.linux.liburing.IOURingQueryOpcode.SIZEOF
            java.nio.ByteBuffer r0 = org.lwjgl.BufferUtils.createByteBuffer(r0)
            r6 = r0
            org.lwjgl.system.linux.liburing.IOURingQueryOpcode r0 = new org.lwjgl.system.linux.liburing.IOURingQueryOpcode
            r1 = r0
            r2 = r6
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.system.linux.liburing.IOURingQueryOpcode create(long r6) {
            org.lwjgl.system.linux.liburing.IOURingQueryOpcode r0 = new org.lwjgl.system.linux.liburing.IOURingQueryOpcode
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.system.linux.liburing.IOURingQueryOpcode createSafe(long r6) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.system.linux.liburing.IOURingQueryOpcode r0 = new org.lwjgl.system.linux.liburing.IOURingQueryOpcode
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static org.lwjgl.system.linux.liburing.IOURingQueryOpcode.Buffer malloc(int r6) {
            org.lwjgl.system.linux.liburing.IOURingQueryOpcode$Buffer r0 = new org.lwjgl.system.linux.liburing.IOURingQueryOpcode$Buffer
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.system.linux.liburing.IOURingQueryOpcode.SIZEOF
            long r2 = __checkMalloc(r2, r3)
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.system.linux.liburing.IOURingQueryOpcode.Buffer calloc(int r7) {
            org.lwjgl.system.linux.liburing.IOURingQueryOpcode$Buffer r0 = new org.lwjgl.system.linux.liburing.IOURingQueryOpcode$Buffer
            r1 = r0
            r2 = r7
            long r2 = (long) r2
            int r3 = org.lwjgl.system.linux.liburing.IOURingQueryOpcode.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.system.linux.liburing.IOURingQueryOpcode.Buffer create(int r10) {
            r0 = r10
            int r1 = org.lwjgl.system.linux.liburing.IOURingQueryOpcode.SIZEOF
            java.nio.ByteBuffer r0 = __create(r0, r1)
            r11 = r0
            org.lwjgl.system.linux.liburing.IOURingQueryOpcode$Buffer r0 = new org.lwjgl.system.linux.liburing.IOURingQueryOpcode$Buffer
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

    public static org.lwjgl.system.linux.liburing.IOURingQueryOpcode.Buffer create(long r6, int r8) {
            org.lwjgl.system.linux.liburing.IOURingQueryOpcode$Buffer r0 = new org.lwjgl.system.linux.liburing.IOURingQueryOpcode$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.system.linux.liburing.IOURingQueryOpcode.Buffer createSafe(long r6, int r8) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.system.linux.liburing.IOURingQueryOpcode$Buffer r0 = new org.lwjgl.system.linux.liburing.IOURingQueryOpcode$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static org.lwjgl.system.linux.liburing.IOURingQueryOpcode malloc(org.lwjgl.system.MemoryStack r6) {
            org.lwjgl.system.linux.liburing.IOURingQueryOpcode r0 = new org.lwjgl.system.linux.liburing.IOURingQueryOpcode
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.system.linux.liburing.IOURingQueryOpcode.ALIGNOF
            int r4 = org.lwjgl.system.linux.liburing.IOURingQueryOpcode.SIZEOF
            long r2 = r2.nmalloc(r3, r4)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.system.linux.liburing.IOURingQueryOpcode calloc(org.lwjgl.system.MemoryStack r7) {
            org.lwjgl.system.linux.liburing.IOURingQueryOpcode r0 = new org.lwjgl.system.linux.liburing.IOURingQueryOpcode
            r1 = r0
            r2 = r7
            int r3 = org.lwjgl.system.linux.liburing.IOURingQueryOpcode.ALIGNOF
            r4 = 1
            int r5 = org.lwjgl.system.linux.liburing.IOURingQueryOpcode.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.system.linux.liburing.IOURingQueryOpcode.Buffer malloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.system.linux.liburing.IOURingQueryOpcode$Buffer r0 = new org.lwjgl.system.linux.liburing.IOURingQueryOpcode$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.system.linux.liburing.IOURingQueryOpcode.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.system.linux.liburing.IOURingQueryOpcode.SIZEOF
            int r4 = r4 * r5
            long r2 = r2.nmalloc(r3, r4)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.system.linux.liburing.IOURingQueryOpcode.Buffer calloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.system.linux.liburing.IOURingQueryOpcode$Buffer r0 = new org.lwjgl.system.linux.liburing.IOURingQueryOpcode$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.system.linux.liburing.IOURingQueryOpcode.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.system.linux.liburing.IOURingQueryOpcode.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static int nnr_request_opcodes(long r5) {
            r0 = r5
            int r1 = org.lwjgl.system.linux.liburing.IOURingQueryOpcode.NR_REQUEST_OPCODES
            long r1 = (long) r1
            long r0 = r0 + r1
            int r0 = org.lwjgl.system.MemoryUtil.memGetInt(r0)
            return r0
    }

    public static int nnr_register_opcodes(long r5) {
            r0 = r5
            int r1 = org.lwjgl.system.linux.liburing.IOURingQueryOpcode.NR_REGISTER_OPCODES
            long r1 = (long) r1
            long r0 = r0 + r1
            int r0 = org.lwjgl.system.MemoryUtil.memGetInt(r0)
            return r0
    }

    public static long nfeature_flags(long r5) {
            r0 = r5
            int r1 = org.lwjgl.system.linux.liburing.IOURingQueryOpcode.FEATURE_FLAGS
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetLong(r0)
            return r0
    }

    public static long nring_setup_flags(long r5) {
            r0 = r5
            int r1 = org.lwjgl.system.linux.liburing.IOURingQueryOpcode.RING_SETUP_FLAGS
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetLong(r0)
            return r0
    }

    public static long nenter_flags(long r5) {
            r0 = r5
            int r1 = org.lwjgl.system.linux.liburing.IOURingQueryOpcode.ENTER_FLAGS
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetLong(r0)
            return r0
    }

    public static long nsqe_flags(long r5) {
            r0 = r5
            int r1 = org.lwjgl.system.linux.liburing.IOURingQueryOpcode.SQE_FLAGS
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetLong(r0)
            return r0
    }

    public static void nnr_request_opcodes(long r5, int r7) {
            r0 = r5
            int r1 = org.lwjgl.system.linux.liburing.IOURingQueryOpcode.NR_REQUEST_OPCODES
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            org.lwjgl.system.MemoryUtil.memPutInt(r0, r1)
            return
    }

    public static void nnr_register_opcodes(long r5, int r7) {
            r0 = r5
            int r1 = org.lwjgl.system.linux.liburing.IOURingQueryOpcode.NR_REGISTER_OPCODES
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            org.lwjgl.system.MemoryUtil.memPutInt(r0, r1)
            return
    }

    public static void nfeature_flags(long r5, long r7) {
            r0 = r5
            int r1 = org.lwjgl.system.linux.liburing.IOURingQueryOpcode.FEATURE_FLAGS
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            org.lwjgl.system.MemoryUtil.memPutLong(r0, r1)
            return
    }

    public static void nring_setup_flags(long r5, long r7) {
            r0 = r5
            int r1 = org.lwjgl.system.linux.liburing.IOURingQueryOpcode.RING_SETUP_FLAGS
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            org.lwjgl.system.MemoryUtil.memPutLong(r0, r1)
            return
    }

    public static void nenter_flags(long r5, long r7) {
            r0 = r5
            int r1 = org.lwjgl.system.linux.liburing.IOURingQueryOpcode.ENTER_FLAGS
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            org.lwjgl.system.MemoryUtil.memPutLong(r0, r1)
            return
    }

    public static void nsqe_flags(long r5, long r7) {
            r0 = r5
            int r1 = org.lwjgl.system.linux.liburing.IOURingQueryOpcode.SQE_FLAGS
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            org.lwjgl.system.MemoryUtil.memPutLong(r0, r1)
            return
    }

    @Override // org.lwjgl.system.Struct
    protected /* bridge */ /* synthetic */ org.lwjgl.system.Struct create(long r6, java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            org.lwjgl.system.linux.liburing.IOURingQueryOpcode r0 = r0.create(r1, r2)
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
            r3 = 8
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 3
            r3 = 8
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 4
            r3 = 8
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 5
            r3 = 8
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            org.lwjgl.system.Struct$Layout r0 = __struct(r0)
            r5 = r0
            r0 = r5
            int r0 = r0.getSize()
            org.lwjgl.system.linux.liburing.IOURingQueryOpcode.SIZEOF = r0
            r0 = r5
            int r0 = r0.getAlignment()
            org.lwjgl.system.linux.liburing.IOURingQueryOpcode.ALIGNOF = r0
            r0 = r5
            r1 = 0
            int r0 = r0.offsetof(r1)
            org.lwjgl.system.linux.liburing.IOURingQueryOpcode.NR_REQUEST_OPCODES = r0
            r0 = r5
            r1 = 1
            int r0 = r0.offsetof(r1)
            org.lwjgl.system.linux.liburing.IOURingQueryOpcode.NR_REGISTER_OPCODES = r0
            r0 = r5
            r1 = 2
            int r0 = r0.offsetof(r1)
            org.lwjgl.system.linux.liburing.IOURingQueryOpcode.FEATURE_FLAGS = r0
            r0 = r5
            r1 = 3
            int r0 = r0.offsetof(r1)
            org.lwjgl.system.linux.liburing.IOURingQueryOpcode.RING_SETUP_FLAGS = r0
            r0 = r5
            r1 = 4
            int r0 = r0.offsetof(r1)
            org.lwjgl.system.linux.liburing.IOURingQueryOpcode.ENTER_FLAGS = r0
            r0 = r5
            r1 = 5
            int r0 = r0.offsetof(r1)
            org.lwjgl.system.linux.liburing.IOURingQueryOpcode.SQE_FLAGS = r0
            return
    }
}
