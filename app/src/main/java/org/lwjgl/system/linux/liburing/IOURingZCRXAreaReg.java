package org.lwjgl.system.linux.liburing;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/system/linux/liburing/IOURingZCRXAreaReg.class */
@org.lwjgl.system.NativeType("struct io_uring_zcrx_area_reg")
public class IOURingZCRXAreaReg extends org.lwjgl.system.Struct<org.lwjgl.system.linux.liburing.IOURingZCRXAreaReg> implements org.lwjgl.system.NativeResource {
    public static final int SIZEOF = 0;
    public static final int ALIGNOF = 0;
    public static final int ADDR = 0;
    public static final int LEN = 0;
    public static final int RQ_AREA_TOKEN = 0;
    public static final int FLAGS = 0;
    public static final int DMABUF_FD = 0;
    public static final int __RESV2 = 0;

    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/system/linux/liburing/IOURingZCRXAreaReg$Buffer.class */
    public static class Buffer extends org.lwjgl.system.StructBuffer<org.lwjgl.system.linux.liburing.IOURingZCRXAreaReg, org.lwjgl.system.linux.liburing.IOURingZCRXAreaReg.Buffer> implements org.lwjgl.system.NativeResource {
        private static final org.lwjgl.system.linux.liburing.IOURingZCRXAreaReg ELEMENT_FACTORY = null;

        public Buffer(java.nio.ByteBuffer r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r6
                int r2 = r2.remaining()
                int r3 = org.lwjgl.system.linux.liburing.IOURingZCRXAreaReg.SIZEOF
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
        protected org.lwjgl.system.linux.liburing.IOURingZCRXAreaReg.Buffer self() {
                r2 = this;
                r0 = r2
                return r0
        }

        protected org.lwjgl.system.linux.liburing.IOURingZCRXAreaReg.Buffer create(long r11, java.nio.ByteBuffer r13, int r14, int r15, int r16, int r17) {
                r10 = this;
                org.lwjgl.system.linux.liburing.IOURingZCRXAreaReg$Buffer r0 = new org.lwjgl.system.linux.liburing.IOURingZCRXAreaReg$Buffer
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
        protected org.lwjgl.system.linux.liburing.IOURingZCRXAreaReg getElementFactory() {
                r2 = this;
                org.lwjgl.system.linux.liburing.IOURingZCRXAreaReg r0 = org.lwjgl.system.linux.liburing.IOURingZCRXAreaReg.Buffer.ELEMENT_FACTORY
                return r0
        }

        @org.lwjgl.system.NativeType("__u64")
        public long addr() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                long r0 = org.lwjgl.system.linux.liburing.IOURingZCRXAreaReg.naddr(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("__u64")
        public long len() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                long r0 = org.lwjgl.system.linux.liburing.IOURingZCRXAreaReg.nlen(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("__u64")
        public long rq_area_token() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                long r0 = org.lwjgl.system.linux.liburing.IOURingZCRXAreaReg.nrq_area_token(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("__u32")
        public int flags() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.system.linux.liburing.IOURingZCRXAreaReg.nflags(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("__u32")
        public int dmabuf_fd() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.system.linux.liburing.IOURingZCRXAreaReg.ndmabuf_fd(r0)
                return r0
        }

        public org.lwjgl.system.linux.liburing.IOURingZCRXAreaReg.Buffer addr(@org.lwjgl.system.NativeType("__u64") long r6) {
                r5 = this;
                r0 = r5
                long r0 = r0.address()
                r1 = r6
                org.lwjgl.system.linux.liburing.IOURingZCRXAreaReg.naddr(r0, r1)
                r0 = r5
                return r0
        }

        public org.lwjgl.system.linux.liburing.IOURingZCRXAreaReg.Buffer len(@org.lwjgl.system.NativeType("__u64") long r6) {
                r5 = this;
                r0 = r5
                long r0 = r0.address()
                r1 = r6
                org.lwjgl.system.linux.liburing.IOURingZCRXAreaReg.nlen(r0, r1)
                r0 = r5
                return r0
        }

        public org.lwjgl.system.linux.liburing.IOURingZCRXAreaReg.Buffer rq_area_token(@org.lwjgl.system.NativeType("__u64") long r6) {
                r5 = this;
                r0 = r5
                long r0 = r0.address()
                r1 = r6
                org.lwjgl.system.linux.liburing.IOURingZCRXAreaReg.nrq_area_token(r0, r1)
                r0 = r5
                return r0
        }

        public org.lwjgl.system.linux.liburing.IOURingZCRXAreaReg.Buffer flags(@org.lwjgl.system.NativeType("__u32") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.system.linux.liburing.IOURingZCRXAreaReg.nflags(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.system.linux.liburing.IOURingZCRXAreaReg.Buffer dmabuf_fd(@org.lwjgl.system.NativeType("__u32") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.system.linux.liburing.IOURingZCRXAreaReg.ndmabuf_fd(r0, r1)
                r0 = r4
                return r0
        }

        @Override // org.lwjgl.system.StructBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.Struct getElementFactory() {
                r2 = this;
                r0 = r2
                org.lwjgl.system.linux.liburing.IOURingZCRXAreaReg r0 = r0.getElementFactory()
                return r0
        }

        /* JADX INFO: renamed from: create, reason: collision with other method in class */
        protected /* bridge */ /* synthetic */ org.lwjgl.system.CustomBuffer m3353create(long r10, java.nio.ByteBuffer r12, int r13, int r14, int r15, int r16) {
                r9 = this;
                r0 = r9
                r1 = r10
                r2 = r12
                r3 = r13
                r4 = r14
                r5 = r15
                r6 = r16
                org.lwjgl.system.linux.liburing.IOURingZCRXAreaReg$Buffer r0 = r0.create(r1, r2, r3, r4, r5, r6)
                return r0
        }

        @Override // org.lwjgl.system.CustomBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.CustomBuffer self() {
                r2 = this;
                r0 = r2
                org.lwjgl.system.linux.liburing.IOURingZCRXAreaReg$Buffer r0 = r0.self()
                return r0
        }

        static {
                r0 = -1
                org.lwjgl.system.linux.liburing.IOURingZCRXAreaReg r0 = org.lwjgl.system.linux.liburing.IOURingZCRXAreaReg.create(r0)
                org.lwjgl.system.linux.liburing.IOURingZCRXAreaReg.Buffer.ELEMENT_FACTORY = r0
                return
        }
    }

    protected IOURingZCRXAreaReg(long r6, java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    protected org.lwjgl.system.linux.liburing.IOURingZCRXAreaReg create(long r7, java.nio.ByteBuffer r9) {
            r6 = this;
            org.lwjgl.system.linux.liburing.IOURingZCRXAreaReg r0 = new org.lwjgl.system.linux.liburing.IOURingZCRXAreaReg
            r1 = r0
            r2 = r7
            r3 = r9
            r1.<init>(r2, r3)
            return r0
    }

    public IOURingZCRXAreaReg(java.nio.ByteBuffer r7) {
            r6 = this;
            r0 = r6
            r1 = r7
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            r2 = r7
            int r3 = org.lwjgl.system.linux.liburing.IOURingZCRXAreaReg.SIZEOF
            java.nio.ByteBuffer r2 = __checkContainer(r2, r3)
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
            r2 = this;
            int r0 = org.lwjgl.system.linux.liburing.IOURingZCRXAreaReg.SIZEOF
            return r0
    }

    @org.lwjgl.system.NativeType("__u64")
    public long addr() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            long r0 = naddr(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("__u64")
    public long len() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            long r0 = nlen(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("__u64")
    public long rq_area_token() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            long r0 = nrq_area_token(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("__u32")
    public int flags() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nflags(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("__u32")
    public int dmabuf_fd() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = ndmabuf_fd(r0)
            return r0
    }

    public org.lwjgl.system.linux.liburing.IOURingZCRXAreaReg addr(@org.lwjgl.system.NativeType("__u64") long r6) {
            r5 = this;
            r0 = r5
            long r0 = r0.address()
            r1 = r6
            naddr(r0, r1)
            r0 = r5
            return r0
    }

    public org.lwjgl.system.linux.liburing.IOURingZCRXAreaReg len(@org.lwjgl.system.NativeType("__u64") long r6) {
            r5 = this;
            r0 = r5
            long r0 = r0.address()
            r1 = r6
            nlen(r0, r1)
            r0 = r5
            return r0
    }

    public org.lwjgl.system.linux.liburing.IOURingZCRXAreaReg rq_area_token(@org.lwjgl.system.NativeType("__u64") long r6) {
            r5 = this;
            r0 = r5
            long r0 = r0.address()
            r1 = r6
            nrq_area_token(r0, r1)
            r0 = r5
            return r0
    }

    public org.lwjgl.system.linux.liburing.IOURingZCRXAreaReg flags(@org.lwjgl.system.NativeType("__u32") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nflags(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.system.linux.liburing.IOURingZCRXAreaReg dmabuf_fd(@org.lwjgl.system.NativeType("__u32") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            ndmabuf_fd(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.system.linux.liburing.IOURingZCRXAreaReg set(long r5, long r7, long r9, int r11, int r12) {
            r4 = this;
            r0 = r4
            r1 = r5
            org.lwjgl.system.linux.liburing.IOURingZCRXAreaReg r0 = r0.addr(r1)
            r0 = r4
            r1 = r7
            org.lwjgl.system.linux.liburing.IOURingZCRXAreaReg r0 = r0.len(r1)
            r0 = r4
            r1 = r9
            org.lwjgl.system.linux.liburing.IOURingZCRXAreaReg r0 = r0.rq_area_token(r1)
            r0 = r4
            r1 = r11
            org.lwjgl.system.linux.liburing.IOURingZCRXAreaReg r0 = r0.flags(r1)
            r0 = r4
            r1 = r12
            org.lwjgl.system.linux.liburing.IOURingZCRXAreaReg r0 = r0.dmabuf_fd(r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.system.linux.liburing.IOURingZCRXAreaReg set(org.lwjgl.system.linux.liburing.IOURingZCRXAreaReg r8) {
            r7 = this;
            r0 = r8
            long r0 = r0.address()
            r1 = r7
            long r1 = r1.address()
            int r2 = org.lwjgl.system.linux.liburing.IOURingZCRXAreaReg.SIZEOF
            long r2 = (long) r2
            org.lwjgl.system.MemoryUtil.memCopy(r0, r1, r2)
            r0 = r7
            return r0
    }

    public static org.lwjgl.system.linux.liburing.IOURingZCRXAreaReg malloc() {
            org.lwjgl.system.linux.liburing.IOURingZCRXAreaReg r0 = new org.lwjgl.system.linux.liburing.IOURingZCRXAreaReg
            r1 = r0
            int r2 = org.lwjgl.system.linux.liburing.IOURingZCRXAreaReg.SIZEOF
            long r2 = (long) r2
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.system.linux.liburing.IOURingZCRXAreaReg calloc() {
            org.lwjgl.system.linux.liburing.IOURingZCRXAreaReg r0 = new org.lwjgl.system.linux.liburing.IOURingZCRXAreaReg
            r1 = r0
            r2 = 1
            int r3 = org.lwjgl.system.linux.liburing.IOURingZCRXAreaReg.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.system.linux.liburing.IOURingZCRXAreaReg create() {
            int r0 = org.lwjgl.system.linux.liburing.IOURingZCRXAreaReg.SIZEOF
            java.nio.ByteBuffer r0 = org.lwjgl.BufferUtils.createByteBuffer(r0)
            r6 = r0
            org.lwjgl.system.linux.liburing.IOURingZCRXAreaReg r0 = new org.lwjgl.system.linux.liburing.IOURingZCRXAreaReg
            r1 = r0
            r2 = r6
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.system.linux.liburing.IOURingZCRXAreaReg create(long r6) {
            org.lwjgl.system.linux.liburing.IOURingZCRXAreaReg r0 = new org.lwjgl.system.linux.liburing.IOURingZCRXAreaReg
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.system.linux.liburing.IOURingZCRXAreaReg createSafe(long r6) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.system.linux.liburing.IOURingZCRXAreaReg r0 = new org.lwjgl.system.linux.liburing.IOURingZCRXAreaReg
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static org.lwjgl.system.linux.liburing.IOURingZCRXAreaReg.Buffer malloc(int r6) {
            org.lwjgl.system.linux.liburing.IOURingZCRXAreaReg$Buffer r0 = new org.lwjgl.system.linux.liburing.IOURingZCRXAreaReg$Buffer
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.system.linux.liburing.IOURingZCRXAreaReg.SIZEOF
            long r2 = __checkMalloc(r2, r3)
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.system.linux.liburing.IOURingZCRXAreaReg.Buffer calloc(int r7) {
            org.lwjgl.system.linux.liburing.IOURingZCRXAreaReg$Buffer r0 = new org.lwjgl.system.linux.liburing.IOURingZCRXAreaReg$Buffer
            r1 = r0
            r2 = r7
            long r2 = (long) r2
            int r3 = org.lwjgl.system.linux.liburing.IOURingZCRXAreaReg.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.system.linux.liburing.IOURingZCRXAreaReg.Buffer create(int r10) {
            r0 = r10
            int r1 = org.lwjgl.system.linux.liburing.IOURingZCRXAreaReg.SIZEOF
            java.nio.ByteBuffer r0 = __create(r0, r1)
            r11 = r0
            org.lwjgl.system.linux.liburing.IOURingZCRXAreaReg$Buffer r0 = new org.lwjgl.system.linux.liburing.IOURingZCRXAreaReg$Buffer
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

    public static org.lwjgl.system.linux.liburing.IOURingZCRXAreaReg.Buffer create(long r6, int r8) {
            org.lwjgl.system.linux.liburing.IOURingZCRXAreaReg$Buffer r0 = new org.lwjgl.system.linux.liburing.IOURingZCRXAreaReg$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.system.linux.liburing.IOURingZCRXAreaReg.Buffer createSafe(long r6, int r8) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.system.linux.liburing.IOURingZCRXAreaReg$Buffer r0 = new org.lwjgl.system.linux.liburing.IOURingZCRXAreaReg$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static org.lwjgl.system.linux.liburing.IOURingZCRXAreaReg malloc(org.lwjgl.system.MemoryStack r6) {
            org.lwjgl.system.linux.liburing.IOURingZCRXAreaReg r0 = new org.lwjgl.system.linux.liburing.IOURingZCRXAreaReg
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.system.linux.liburing.IOURingZCRXAreaReg.ALIGNOF
            int r4 = org.lwjgl.system.linux.liburing.IOURingZCRXAreaReg.SIZEOF
            long r2 = r2.nmalloc(r3, r4)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.system.linux.liburing.IOURingZCRXAreaReg calloc(org.lwjgl.system.MemoryStack r7) {
            org.lwjgl.system.linux.liburing.IOURingZCRXAreaReg r0 = new org.lwjgl.system.linux.liburing.IOURingZCRXAreaReg
            r1 = r0
            r2 = r7
            int r3 = org.lwjgl.system.linux.liburing.IOURingZCRXAreaReg.ALIGNOF
            r4 = 1
            int r5 = org.lwjgl.system.linux.liburing.IOURingZCRXAreaReg.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.system.linux.liburing.IOURingZCRXAreaReg.Buffer malloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.system.linux.liburing.IOURingZCRXAreaReg$Buffer r0 = new org.lwjgl.system.linux.liburing.IOURingZCRXAreaReg$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.system.linux.liburing.IOURingZCRXAreaReg.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.system.linux.liburing.IOURingZCRXAreaReg.SIZEOF
            int r4 = r4 * r5
            long r2 = r2.nmalloc(r3, r4)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.system.linux.liburing.IOURingZCRXAreaReg.Buffer calloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.system.linux.liburing.IOURingZCRXAreaReg$Buffer r0 = new org.lwjgl.system.linux.liburing.IOURingZCRXAreaReg$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.system.linux.liburing.IOURingZCRXAreaReg.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.system.linux.liburing.IOURingZCRXAreaReg.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static long naddr(long r5) {
            r0 = r5
            int r1 = org.lwjgl.system.linux.liburing.IOURingZCRXAreaReg.ADDR
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetLong(r0)
            return r0
    }

    public static long nlen(long r5) {
            r0 = r5
            int r1 = org.lwjgl.system.linux.liburing.IOURingZCRXAreaReg.LEN
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetLong(r0)
            return r0
    }

    public static long nrq_area_token(long r5) {
            r0 = r5
            int r1 = org.lwjgl.system.linux.liburing.IOURingZCRXAreaReg.RQ_AREA_TOKEN
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetLong(r0)
            return r0
    }

    public static int nflags(long r5) {
            r0 = r5
            int r1 = org.lwjgl.system.linux.liburing.IOURingZCRXAreaReg.FLAGS
            long r1 = (long) r1
            long r0 = r0 + r1
            int r0 = org.lwjgl.system.MemoryUtil.memGetInt(r0)
            return r0
    }

    public static int ndmabuf_fd(long r5) {
            r0 = r5
            int r1 = org.lwjgl.system.linux.liburing.IOURingZCRXAreaReg.DMABUF_FD
            long r1 = (long) r1
            long r0 = r0 + r1
            int r0 = org.lwjgl.system.MemoryUtil.memGetInt(r0)
            return r0
    }

    public static java.nio.LongBuffer n__resv2(long r5) {
            r0 = r5
            int r1 = org.lwjgl.system.linux.liburing.IOURingZCRXAreaReg.__RESV2
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = 2
            java.nio.LongBuffer r0 = org.lwjgl.system.MemoryUtil.memLongBuffer(r0, r1)
            return r0
    }

    public static long n__resv2(long r7, int r9) {
            r0 = r7
            int r1 = org.lwjgl.system.linux.liburing.IOURingZCRXAreaReg.__RESV2
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r9
            r2 = 2
            long r1 = org.lwjgl.system.Checks.check(r1, r2)
            r2 = 8
            long r1 = r1 * r2
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetLong(r0)
            return r0
    }

    public static void naddr(long r5, long r7) {
            r0 = r5
            int r1 = org.lwjgl.system.linux.liburing.IOURingZCRXAreaReg.ADDR
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            org.lwjgl.system.MemoryUtil.memPutLong(r0, r1)
            return
    }

    public static void nlen(long r5, long r7) {
            r0 = r5
            int r1 = org.lwjgl.system.linux.liburing.IOURingZCRXAreaReg.LEN
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            org.lwjgl.system.MemoryUtil.memPutLong(r0, r1)
            return
    }

    public static void nrq_area_token(long r5, long r7) {
            r0 = r5
            int r1 = org.lwjgl.system.linux.liburing.IOURingZCRXAreaReg.RQ_AREA_TOKEN
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            org.lwjgl.system.MemoryUtil.memPutLong(r0, r1)
            return
    }

    public static void nflags(long r5, int r7) {
            r0 = r5
            int r1 = org.lwjgl.system.linux.liburing.IOURingZCRXAreaReg.FLAGS
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            org.lwjgl.system.MemoryUtil.memPutInt(r0, r1)
            return
    }

    public static void ndmabuf_fd(long r5, int r7) {
            r0 = r5
            int r1 = org.lwjgl.system.linux.liburing.IOURingZCRXAreaReg.DMABUF_FD
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            org.lwjgl.system.MemoryUtil.memPutInt(r0, r1)
            return
    }

    public static void n__resv2(long r7, java.nio.LongBuffer r9) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r9
            r1 = 2
            org.lwjgl.system.Checks.checkGT(r0, r1)
        Lb:
            r0 = r9
            long r0 = org.lwjgl.system.MemoryUtil.memAddress(r0)
            r1 = r7
            int r2 = org.lwjgl.system.linux.liburing.IOURingZCRXAreaReg.__RESV2
            long r2 = (long) r2
            long r1 = r1 + r2
            r2 = r9
            int r2 = r2.remaining()
            r3 = 8
            int r2 = r2 * r3
            long r2 = (long) r2
            org.lwjgl.system.MemoryUtil.memCopy(r0, r1, r2)
            return
    }

    public static void n__resv2(long r7, int r9, long r10) {
            r0 = r7
            int r1 = org.lwjgl.system.linux.liburing.IOURingZCRXAreaReg.__RESV2
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r9
            r2 = 2
            long r1 = org.lwjgl.system.Checks.check(r1, r2)
            r2 = 8
            long r1 = r1 * r2
            long r0 = r0 + r1
            r1 = r10
            org.lwjgl.system.MemoryUtil.memPutLong(r0, r1)
            return
    }

    @Override // org.lwjgl.system.Struct
    protected /* bridge */ /* synthetic */ org.lwjgl.system.Struct create(long r6, java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            org.lwjgl.system.linux.liburing.IOURingZCRXAreaReg r0 = r0.create(r1, r2)
            return r0
    }

    static {
            r0 = 6
            org.lwjgl.system.Struct$Member[] r0 = new org.lwjgl.system.Struct.Member[r0]
            r1 = r0
            r2 = 0
            r3 = 8
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 1
            r3 = 8
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 2
            r3 = 8
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
            r3 = 8
            r4 = 2
            org.lwjgl.system.Struct$Member r3 = __array(r3, r4)
            r1[r2] = r3
            org.lwjgl.system.Struct$Layout r0 = __struct(r0)
            r6 = r0
            r0 = r6
            int r0 = r0.getSize()
            org.lwjgl.system.linux.liburing.IOURingZCRXAreaReg.SIZEOF = r0
            r0 = r6
            int r0 = r0.getAlignment()
            org.lwjgl.system.linux.liburing.IOURingZCRXAreaReg.ALIGNOF = r0
            r0 = r6
            r1 = 0
            int r0 = r0.offsetof(r1)
            org.lwjgl.system.linux.liburing.IOURingZCRXAreaReg.ADDR = r0
            r0 = r6
            r1 = 1
            int r0 = r0.offsetof(r1)
            org.lwjgl.system.linux.liburing.IOURingZCRXAreaReg.LEN = r0
            r0 = r6
            r1 = 2
            int r0 = r0.offsetof(r1)
            org.lwjgl.system.linux.liburing.IOURingZCRXAreaReg.RQ_AREA_TOKEN = r0
            r0 = r6
            r1 = 3
            int r0 = r0.offsetof(r1)
            org.lwjgl.system.linux.liburing.IOURingZCRXAreaReg.FLAGS = r0
            r0 = r6
            r1 = 4
            int r0 = r0.offsetof(r1)
            org.lwjgl.system.linux.liburing.IOURingZCRXAreaReg.DMABUF_FD = r0
            r0 = r6
            r1 = 5
            int r0 = r0.offsetof(r1)
            org.lwjgl.system.linux.liburing.IOURingZCRXAreaReg.__RESV2 = r0
            return
    }
}
