package org.lwjgl.system.linux.liburing;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/system/linux/liburing/IOUringRegionDesc.class */
@org.lwjgl.system.NativeType("struct io_uring_region_desc")
public class IOUringRegionDesc extends org.lwjgl.system.Struct<org.lwjgl.system.linux.liburing.IOUringRegionDesc> implements org.lwjgl.system.NativeResource {
    public static final int SIZEOF = 0;
    public static final int ALIGNOF = 0;
    public static final int USER_ADDR = 0;
    public static final int SIZE = 0;
    public static final int FLAGS = 0;
    public static final int ID = 0;
    public static final int MMAP_OFFSET = 0;
    public static final int __RESV = 0;

    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/system/linux/liburing/IOUringRegionDesc$Buffer.class */
    public static class Buffer extends org.lwjgl.system.StructBuffer<org.lwjgl.system.linux.liburing.IOUringRegionDesc, org.lwjgl.system.linux.liburing.IOUringRegionDesc.Buffer> implements org.lwjgl.system.NativeResource {
        private static final org.lwjgl.system.linux.liburing.IOUringRegionDesc ELEMENT_FACTORY = null;

        public Buffer(java.nio.ByteBuffer r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r6
                int r2 = r2.remaining()
                int r3 = org.lwjgl.system.linux.liburing.IOUringRegionDesc.SIZEOF
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
        protected org.lwjgl.system.linux.liburing.IOUringRegionDesc.Buffer self() {
                r2 = this;
                r0 = r2
                return r0
        }

        protected org.lwjgl.system.linux.liburing.IOUringRegionDesc.Buffer create(long r11, java.nio.ByteBuffer r13, int r14, int r15, int r16, int r17) {
                r10 = this;
                org.lwjgl.system.linux.liburing.IOUringRegionDesc$Buffer r0 = new org.lwjgl.system.linux.liburing.IOUringRegionDesc$Buffer
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
        protected org.lwjgl.system.linux.liburing.IOUringRegionDesc getElementFactory() {
                r2 = this;
                org.lwjgl.system.linux.liburing.IOUringRegionDesc r0 = org.lwjgl.system.linux.liburing.IOUringRegionDesc.Buffer.ELEMENT_FACTORY
                return r0
        }

        @org.lwjgl.system.NativeType("__u64")
        public long user_addr() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                long r0 = org.lwjgl.system.linux.liburing.IOUringRegionDesc.nuser_addr(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("__u64")
        public long size() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                long r0 = org.lwjgl.system.linux.liburing.IOUringRegionDesc.nsize(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("__u32")
        public int flags() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.system.linux.liburing.IOUringRegionDesc.nflags(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("__u32")
        public int id() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.system.linux.liburing.IOUringRegionDesc.nid(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("__u64")
        public long mmap_offset() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                long r0 = org.lwjgl.system.linux.liburing.IOUringRegionDesc.nmmap_offset(r0)
                return r0
        }

        public org.lwjgl.system.linux.liburing.IOUringRegionDesc.Buffer user_addr(@org.lwjgl.system.NativeType("__u64") long r6) {
                r5 = this;
                r0 = r5
                long r0 = r0.address()
                r1 = r6
                org.lwjgl.system.linux.liburing.IOUringRegionDesc.nuser_addr(r0, r1)
                r0 = r5
                return r0
        }

        public org.lwjgl.system.linux.liburing.IOUringRegionDesc.Buffer size(@org.lwjgl.system.NativeType("__u64") long r6) {
                r5 = this;
                r0 = r5
                long r0 = r0.address()
                r1 = r6
                org.lwjgl.system.linux.liburing.IOUringRegionDesc.nsize(r0, r1)
                r0 = r5
                return r0
        }

        public org.lwjgl.system.linux.liburing.IOUringRegionDesc.Buffer flags(@org.lwjgl.system.NativeType("__u32") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.system.linux.liburing.IOUringRegionDesc.nflags(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.system.linux.liburing.IOUringRegionDesc.Buffer id(@org.lwjgl.system.NativeType("__u32") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.system.linux.liburing.IOUringRegionDesc.nid(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.system.linux.liburing.IOUringRegionDesc.Buffer mmap_offset(@org.lwjgl.system.NativeType("__u64") long r6) {
                r5 = this;
                r0 = r5
                long r0 = r0.address()
                r1 = r6
                org.lwjgl.system.linux.liburing.IOUringRegionDesc.nmmap_offset(r0, r1)
                r0 = r5
                return r0
        }

        @Override // org.lwjgl.system.StructBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.Struct getElementFactory() {
                r2 = this;
                r0 = r2
                org.lwjgl.system.linux.liburing.IOUringRegionDesc r0 = r0.getElementFactory()
                return r0
        }

        /* JADX INFO: renamed from: create, reason: collision with other method in class */
        protected /* bridge */ /* synthetic */ org.lwjgl.system.CustomBuffer m3371create(long r10, java.nio.ByteBuffer r12, int r13, int r14, int r15, int r16) {
                r9 = this;
                r0 = r9
                r1 = r10
                r2 = r12
                r3 = r13
                r4 = r14
                r5 = r15
                r6 = r16
                org.lwjgl.system.linux.liburing.IOUringRegionDesc$Buffer r0 = r0.create(r1, r2, r3, r4, r5, r6)
                return r0
        }

        @Override // org.lwjgl.system.CustomBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.CustomBuffer self() {
                r2 = this;
                r0 = r2
                org.lwjgl.system.linux.liburing.IOUringRegionDesc$Buffer r0 = r0.self()
                return r0
        }

        static {
                r0 = -1
                org.lwjgl.system.linux.liburing.IOUringRegionDesc r0 = org.lwjgl.system.linux.liburing.IOUringRegionDesc.create(r0)
                org.lwjgl.system.linux.liburing.IOUringRegionDesc.Buffer.ELEMENT_FACTORY = r0
                return
        }
    }

    protected IOUringRegionDesc(long r6, java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    protected org.lwjgl.system.linux.liburing.IOUringRegionDesc create(long r7, java.nio.ByteBuffer r9) {
            r6 = this;
            org.lwjgl.system.linux.liburing.IOUringRegionDesc r0 = new org.lwjgl.system.linux.liburing.IOUringRegionDesc
            r1 = r0
            r2 = r7
            r3 = r9
            r1.<init>(r2, r3)
            return r0
    }

    public IOUringRegionDesc(java.nio.ByteBuffer r7) {
            r6 = this;
            r0 = r6
            r1 = r7
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            r2 = r7
            int r3 = org.lwjgl.system.linux.liburing.IOUringRegionDesc.SIZEOF
            java.nio.ByteBuffer r2 = __checkContainer(r2, r3)
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
            r2 = this;
            int r0 = org.lwjgl.system.linux.liburing.IOUringRegionDesc.SIZEOF
            return r0
    }

    @org.lwjgl.system.NativeType("__u64")
    public long user_addr() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            long r0 = nuser_addr(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("__u64")
    public long size() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            long r0 = nsize(r0)
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
    public int id() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nid(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("__u64")
    public long mmap_offset() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            long r0 = nmmap_offset(r0)
            return r0
    }

    public org.lwjgl.system.linux.liburing.IOUringRegionDesc user_addr(@org.lwjgl.system.NativeType("__u64") long r6) {
            r5 = this;
            r0 = r5
            long r0 = r0.address()
            r1 = r6
            nuser_addr(r0, r1)
            r0 = r5
            return r0
    }

    public org.lwjgl.system.linux.liburing.IOUringRegionDesc size(@org.lwjgl.system.NativeType("__u64") long r6) {
            r5 = this;
            r0 = r5
            long r0 = r0.address()
            r1 = r6
            nsize(r0, r1)
            r0 = r5
            return r0
    }

    public org.lwjgl.system.linux.liburing.IOUringRegionDesc flags(@org.lwjgl.system.NativeType("__u32") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nflags(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.system.linux.liburing.IOUringRegionDesc id(@org.lwjgl.system.NativeType("__u32") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nid(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.system.linux.liburing.IOUringRegionDesc mmap_offset(@org.lwjgl.system.NativeType("__u64") long r6) {
            r5 = this;
            r0 = r5
            long r0 = r0.address()
            r1 = r6
            nmmap_offset(r0, r1)
            r0 = r5
            return r0
    }

    public org.lwjgl.system.linux.liburing.IOUringRegionDesc set(long r5, long r7, int r9, int r10, long r11) {
            r4 = this;
            r0 = r4
            r1 = r5
            org.lwjgl.system.linux.liburing.IOUringRegionDesc r0 = r0.user_addr(r1)
            r0 = r4
            r1 = r7
            org.lwjgl.system.linux.liburing.IOUringRegionDesc r0 = r0.size(r1)
            r0 = r4
            r1 = r9
            org.lwjgl.system.linux.liburing.IOUringRegionDesc r0 = r0.flags(r1)
            r0 = r4
            r1 = r10
            org.lwjgl.system.linux.liburing.IOUringRegionDesc r0 = r0.id(r1)
            r0 = r4
            r1 = r11
            org.lwjgl.system.linux.liburing.IOUringRegionDesc r0 = r0.mmap_offset(r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.system.linux.liburing.IOUringRegionDesc set(org.lwjgl.system.linux.liburing.IOUringRegionDesc r8) {
            r7 = this;
            r0 = r8
            long r0 = r0.address()
            r1 = r7
            long r1 = r1.address()
            int r2 = org.lwjgl.system.linux.liburing.IOUringRegionDesc.SIZEOF
            long r2 = (long) r2
            org.lwjgl.system.MemoryUtil.memCopy(r0, r1, r2)
            r0 = r7
            return r0
    }

    public static org.lwjgl.system.linux.liburing.IOUringRegionDesc malloc() {
            org.lwjgl.system.linux.liburing.IOUringRegionDesc r0 = new org.lwjgl.system.linux.liburing.IOUringRegionDesc
            r1 = r0
            int r2 = org.lwjgl.system.linux.liburing.IOUringRegionDesc.SIZEOF
            long r2 = (long) r2
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.system.linux.liburing.IOUringRegionDesc calloc() {
            org.lwjgl.system.linux.liburing.IOUringRegionDesc r0 = new org.lwjgl.system.linux.liburing.IOUringRegionDesc
            r1 = r0
            r2 = 1
            int r3 = org.lwjgl.system.linux.liburing.IOUringRegionDesc.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.system.linux.liburing.IOUringRegionDesc create() {
            int r0 = org.lwjgl.system.linux.liburing.IOUringRegionDesc.SIZEOF
            java.nio.ByteBuffer r0 = org.lwjgl.BufferUtils.createByteBuffer(r0)
            r6 = r0
            org.lwjgl.system.linux.liburing.IOUringRegionDesc r0 = new org.lwjgl.system.linux.liburing.IOUringRegionDesc
            r1 = r0
            r2 = r6
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.system.linux.liburing.IOUringRegionDesc create(long r6) {
            org.lwjgl.system.linux.liburing.IOUringRegionDesc r0 = new org.lwjgl.system.linux.liburing.IOUringRegionDesc
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.system.linux.liburing.IOUringRegionDesc createSafe(long r6) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.system.linux.liburing.IOUringRegionDesc r0 = new org.lwjgl.system.linux.liburing.IOUringRegionDesc
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static org.lwjgl.system.linux.liburing.IOUringRegionDesc.Buffer malloc(int r6) {
            org.lwjgl.system.linux.liburing.IOUringRegionDesc$Buffer r0 = new org.lwjgl.system.linux.liburing.IOUringRegionDesc$Buffer
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.system.linux.liburing.IOUringRegionDesc.SIZEOF
            long r2 = __checkMalloc(r2, r3)
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.system.linux.liburing.IOUringRegionDesc.Buffer calloc(int r7) {
            org.lwjgl.system.linux.liburing.IOUringRegionDesc$Buffer r0 = new org.lwjgl.system.linux.liburing.IOUringRegionDesc$Buffer
            r1 = r0
            r2 = r7
            long r2 = (long) r2
            int r3 = org.lwjgl.system.linux.liburing.IOUringRegionDesc.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.system.linux.liburing.IOUringRegionDesc.Buffer create(int r10) {
            r0 = r10
            int r1 = org.lwjgl.system.linux.liburing.IOUringRegionDesc.SIZEOF
            java.nio.ByteBuffer r0 = __create(r0, r1)
            r11 = r0
            org.lwjgl.system.linux.liburing.IOUringRegionDesc$Buffer r0 = new org.lwjgl.system.linux.liburing.IOUringRegionDesc$Buffer
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

    public static org.lwjgl.system.linux.liburing.IOUringRegionDesc.Buffer create(long r6, int r8) {
            org.lwjgl.system.linux.liburing.IOUringRegionDesc$Buffer r0 = new org.lwjgl.system.linux.liburing.IOUringRegionDesc$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.system.linux.liburing.IOUringRegionDesc.Buffer createSafe(long r6, int r8) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.system.linux.liburing.IOUringRegionDesc$Buffer r0 = new org.lwjgl.system.linux.liburing.IOUringRegionDesc$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static org.lwjgl.system.linux.liburing.IOUringRegionDesc malloc(org.lwjgl.system.MemoryStack r6) {
            org.lwjgl.system.linux.liburing.IOUringRegionDesc r0 = new org.lwjgl.system.linux.liburing.IOUringRegionDesc
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.system.linux.liburing.IOUringRegionDesc.ALIGNOF
            int r4 = org.lwjgl.system.linux.liburing.IOUringRegionDesc.SIZEOF
            long r2 = r2.nmalloc(r3, r4)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.system.linux.liburing.IOUringRegionDesc calloc(org.lwjgl.system.MemoryStack r7) {
            org.lwjgl.system.linux.liburing.IOUringRegionDesc r0 = new org.lwjgl.system.linux.liburing.IOUringRegionDesc
            r1 = r0
            r2 = r7
            int r3 = org.lwjgl.system.linux.liburing.IOUringRegionDesc.ALIGNOF
            r4 = 1
            int r5 = org.lwjgl.system.linux.liburing.IOUringRegionDesc.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.system.linux.liburing.IOUringRegionDesc.Buffer malloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.system.linux.liburing.IOUringRegionDesc$Buffer r0 = new org.lwjgl.system.linux.liburing.IOUringRegionDesc$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.system.linux.liburing.IOUringRegionDesc.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.system.linux.liburing.IOUringRegionDesc.SIZEOF
            int r4 = r4 * r5
            long r2 = r2.nmalloc(r3, r4)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.system.linux.liburing.IOUringRegionDesc.Buffer calloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.system.linux.liburing.IOUringRegionDesc$Buffer r0 = new org.lwjgl.system.linux.liburing.IOUringRegionDesc$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.system.linux.liburing.IOUringRegionDesc.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.system.linux.liburing.IOUringRegionDesc.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static long nuser_addr(long r5) {
            r0 = r5
            int r1 = org.lwjgl.system.linux.liburing.IOUringRegionDesc.USER_ADDR
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetLong(r0)
            return r0
    }

    public static long nsize(long r5) {
            r0 = r5
            int r1 = org.lwjgl.system.linux.liburing.IOUringRegionDesc.SIZE
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetLong(r0)
            return r0
    }

    public static int nflags(long r5) {
            r0 = r5
            int r1 = org.lwjgl.system.linux.liburing.IOUringRegionDesc.FLAGS
            long r1 = (long) r1
            long r0 = r0 + r1
            int r0 = org.lwjgl.system.MemoryUtil.memGetInt(r0)
            return r0
    }

    public static int nid(long r5) {
            r0 = r5
            int r1 = org.lwjgl.system.linux.liburing.IOUringRegionDesc.ID
            long r1 = (long) r1
            long r0 = r0 + r1
            int r0 = org.lwjgl.system.MemoryUtil.memGetInt(r0)
            return r0
    }

    public static long nmmap_offset(long r5) {
            r0 = r5
            int r1 = org.lwjgl.system.linux.liburing.IOUringRegionDesc.MMAP_OFFSET
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetLong(r0)
            return r0
    }

    public static java.nio.LongBuffer n__resv(long r5) {
            r0 = r5
            int r1 = org.lwjgl.system.linux.liburing.IOUringRegionDesc.__RESV
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = 4
            java.nio.LongBuffer r0 = org.lwjgl.system.MemoryUtil.memLongBuffer(r0, r1)
            return r0
    }

    public static long n__resv(long r7, int r9) {
            r0 = r7
            int r1 = org.lwjgl.system.linux.liburing.IOUringRegionDesc.__RESV
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r9
            r2 = 4
            long r1 = org.lwjgl.system.Checks.check(r1, r2)
            r2 = 8
            long r1 = r1 * r2
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetLong(r0)
            return r0
    }

    public static void nuser_addr(long r5, long r7) {
            r0 = r5
            int r1 = org.lwjgl.system.linux.liburing.IOUringRegionDesc.USER_ADDR
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            org.lwjgl.system.MemoryUtil.memPutLong(r0, r1)
            return
    }

    public static void nsize(long r5, long r7) {
            r0 = r5
            int r1 = org.lwjgl.system.linux.liburing.IOUringRegionDesc.SIZE
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            org.lwjgl.system.MemoryUtil.memPutLong(r0, r1)
            return
    }

    public static void nflags(long r5, int r7) {
            r0 = r5
            int r1 = org.lwjgl.system.linux.liburing.IOUringRegionDesc.FLAGS
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            org.lwjgl.system.MemoryUtil.memPutInt(r0, r1)
            return
    }

    public static void nid(long r5, int r7) {
            r0 = r5
            int r1 = org.lwjgl.system.linux.liburing.IOUringRegionDesc.ID
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            org.lwjgl.system.MemoryUtil.memPutInt(r0, r1)
            return
    }

    public static void nmmap_offset(long r5, long r7) {
            r0 = r5
            int r1 = org.lwjgl.system.linux.liburing.IOUringRegionDesc.MMAP_OFFSET
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            org.lwjgl.system.MemoryUtil.memPutLong(r0, r1)
            return
    }

    public static void n__resv(long r7, java.nio.LongBuffer r9) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r9
            r1 = 4
            org.lwjgl.system.Checks.checkGT(r0, r1)
        Lb:
            r0 = r9
            long r0 = org.lwjgl.system.MemoryUtil.memAddress(r0)
            r1 = r7
            int r2 = org.lwjgl.system.linux.liburing.IOUringRegionDesc.__RESV
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

    public static void n__resv(long r7, int r9, long r10) {
            r0 = r7
            int r1 = org.lwjgl.system.linux.liburing.IOUringRegionDesc.__RESV
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r9
            r2 = 4
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
            org.lwjgl.system.linux.liburing.IOUringRegionDesc r0 = r0.create(r1, r2)
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
            r3 = 8
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 5
            r3 = 8
            r4 = 4
            org.lwjgl.system.Struct$Member r3 = __array(r3, r4)
            r1[r2] = r3
            org.lwjgl.system.Struct$Layout r0 = __struct(r0)
            r6 = r0
            r0 = r6
            int r0 = r0.getSize()
            org.lwjgl.system.linux.liburing.IOUringRegionDesc.SIZEOF = r0
            r0 = r6
            int r0 = r0.getAlignment()
            org.lwjgl.system.linux.liburing.IOUringRegionDesc.ALIGNOF = r0
            r0 = r6
            r1 = 0
            int r0 = r0.offsetof(r1)
            org.lwjgl.system.linux.liburing.IOUringRegionDesc.USER_ADDR = r0
            r0 = r6
            r1 = 1
            int r0 = r0.offsetof(r1)
            org.lwjgl.system.linux.liburing.IOUringRegionDesc.SIZE = r0
            r0 = r6
            r1 = 2
            int r0 = r0.offsetof(r1)
            org.lwjgl.system.linux.liburing.IOUringRegionDesc.FLAGS = r0
            r0 = r6
            r1 = 3
            int r0 = r0.offsetof(r1)
            org.lwjgl.system.linux.liburing.IOUringRegionDesc.ID = r0
            r0 = r6
            r1 = 4
            int r0 = r0.offsetof(r1)
            org.lwjgl.system.linux.liburing.IOUringRegionDesc.MMAP_OFFSET = r0
            r0 = r6
            r1 = 5
            int r0 = r0.offsetof(r1)
            org.lwjgl.system.linux.liburing.IOUringRegionDesc.__RESV = r0
            return
    }
}
