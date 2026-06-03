package org.lwjgl.system.linux.liburing;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/system/linux/liburing/IOURingAttrPI.class */
@org.lwjgl.system.NativeType("struct io_uring_attr_pi")
public class IOURingAttrPI extends org.lwjgl.system.Struct<org.lwjgl.system.linux.liburing.IOURingAttrPI> implements org.lwjgl.system.NativeResource {
    public static final int SIZEOF = 0;
    public static final int ALIGNOF = 0;
    public static final int FLAGS = 0;
    public static final int APP_TAG = 0;
    public static final int LEN = 0;
    public static final int ADDR = 0;
    public static final int SEED = 0;
    public static final int RSVD = 0;

    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/system/linux/liburing/IOURingAttrPI$Buffer.class */
    public static class Buffer extends org.lwjgl.system.StructBuffer<org.lwjgl.system.linux.liburing.IOURingAttrPI, org.lwjgl.system.linux.liburing.IOURingAttrPI.Buffer> implements org.lwjgl.system.NativeResource {
        private static final org.lwjgl.system.linux.liburing.IOURingAttrPI ELEMENT_FACTORY = null;

        public Buffer(java.nio.ByteBuffer r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r6
                int r2 = r2.remaining()
                int r3 = org.lwjgl.system.linux.liburing.IOURingAttrPI.SIZEOF
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
        protected org.lwjgl.system.linux.liburing.IOURingAttrPI.Buffer self() {
                r2 = this;
                r0 = r2
                return r0
        }

        protected org.lwjgl.system.linux.liburing.IOURingAttrPI.Buffer create(long r11, java.nio.ByteBuffer r13, int r14, int r15, int r16, int r17) {
                r10 = this;
                org.lwjgl.system.linux.liburing.IOURingAttrPI$Buffer r0 = new org.lwjgl.system.linux.liburing.IOURingAttrPI$Buffer
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
        protected org.lwjgl.system.linux.liburing.IOURingAttrPI getElementFactory() {
                r2 = this;
                org.lwjgl.system.linux.liburing.IOURingAttrPI r0 = org.lwjgl.system.linux.liburing.IOURingAttrPI.Buffer.ELEMENT_FACTORY
                return r0
        }

        @org.lwjgl.system.NativeType("__u16")
        public short flags() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                short r0 = org.lwjgl.system.linux.liburing.IOURingAttrPI.nflags(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("__u16")
        public short app_tag() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                short r0 = org.lwjgl.system.linux.liburing.IOURingAttrPI.napp_tag(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("__u32")
        public int len() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.system.linux.liburing.IOURingAttrPI.nlen(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("__u64")
        public long addr() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                long r0 = org.lwjgl.system.linux.liburing.IOURingAttrPI.naddr(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("__u64")
        public long seed() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                long r0 = org.lwjgl.system.linux.liburing.IOURingAttrPI.nseed(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("__u64")
        public long rsvd() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                long r0 = org.lwjgl.system.linux.liburing.IOURingAttrPI.nrsvd(r0)
                return r0
        }

        public org.lwjgl.system.linux.liburing.IOURingAttrPI.Buffer flags(@org.lwjgl.system.NativeType("__u16") short r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.system.linux.liburing.IOURingAttrPI.nflags(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.system.linux.liburing.IOURingAttrPI.Buffer app_tag(@org.lwjgl.system.NativeType("__u16") short r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.system.linux.liburing.IOURingAttrPI.napp_tag(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.system.linux.liburing.IOURingAttrPI.Buffer len(@org.lwjgl.system.NativeType("__u32") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.system.linux.liburing.IOURingAttrPI.nlen(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.system.linux.liburing.IOURingAttrPI.Buffer addr(@org.lwjgl.system.NativeType("__u64") long r6) {
                r5 = this;
                r0 = r5
                long r0 = r0.address()
                r1 = r6
                org.lwjgl.system.linux.liburing.IOURingAttrPI.naddr(r0, r1)
                r0 = r5
                return r0
        }

        public org.lwjgl.system.linux.liburing.IOURingAttrPI.Buffer seed(@org.lwjgl.system.NativeType("__u64") long r6) {
                r5 = this;
                r0 = r5
                long r0 = r0.address()
                r1 = r6
                org.lwjgl.system.linux.liburing.IOURingAttrPI.nseed(r0, r1)
                r0 = r5
                return r0
        }

        public org.lwjgl.system.linux.liburing.IOURingAttrPI.Buffer rsvd(@org.lwjgl.system.NativeType("__u64") long r6) {
                r5 = this;
                r0 = r5
                long r0 = r0.address()
                r1 = r6
                org.lwjgl.system.linux.liburing.IOURingAttrPI.nrsvd(r0, r1)
                r0 = r5
                return r0
        }

        @Override // org.lwjgl.system.StructBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.Struct getElementFactory() {
                r2 = this;
                r0 = r2
                org.lwjgl.system.linux.liburing.IOURingAttrPI r0 = r0.getElementFactory()
                return r0
        }

        /* JADX INFO: renamed from: create, reason: collision with other method in class */
        protected /* bridge */ /* synthetic */ org.lwjgl.system.CustomBuffer m3290create(long r10, java.nio.ByteBuffer r12, int r13, int r14, int r15, int r16) {
                r9 = this;
                r0 = r9
                r1 = r10
                r2 = r12
                r3 = r13
                r4 = r14
                r5 = r15
                r6 = r16
                org.lwjgl.system.linux.liburing.IOURingAttrPI$Buffer r0 = r0.create(r1, r2, r3, r4, r5, r6)
                return r0
        }

        @Override // org.lwjgl.system.CustomBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.CustomBuffer self() {
                r2 = this;
                r0 = r2
                org.lwjgl.system.linux.liburing.IOURingAttrPI$Buffer r0 = r0.self()
                return r0
        }

        static {
                r0 = -1
                org.lwjgl.system.linux.liburing.IOURingAttrPI r0 = org.lwjgl.system.linux.liburing.IOURingAttrPI.create(r0)
                org.lwjgl.system.linux.liburing.IOURingAttrPI.Buffer.ELEMENT_FACTORY = r0
                return
        }
    }

    protected IOURingAttrPI(long r6, java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    protected org.lwjgl.system.linux.liburing.IOURingAttrPI create(long r7, java.nio.ByteBuffer r9) {
            r6 = this;
            org.lwjgl.system.linux.liburing.IOURingAttrPI r0 = new org.lwjgl.system.linux.liburing.IOURingAttrPI
            r1 = r0
            r2 = r7
            r3 = r9
            r1.<init>(r2, r3)
            return r0
    }

    public IOURingAttrPI(java.nio.ByteBuffer r7) {
            r6 = this;
            r0 = r6
            r1 = r7
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            r2 = r7
            int r3 = org.lwjgl.system.linux.liburing.IOURingAttrPI.SIZEOF
            java.nio.ByteBuffer r2 = __checkContainer(r2, r3)
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
            r2 = this;
            int r0 = org.lwjgl.system.linux.liburing.IOURingAttrPI.SIZEOF
            return r0
    }

    @org.lwjgl.system.NativeType("__u16")
    public short flags() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            short r0 = nflags(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("__u16")
    public short app_tag() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            short r0 = napp_tag(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("__u32")
    public int len() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nlen(r0)
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
    public long seed() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            long r0 = nseed(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("__u64")
    public long rsvd() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            long r0 = nrsvd(r0)
            return r0
    }

    public org.lwjgl.system.linux.liburing.IOURingAttrPI flags(@org.lwjgl.system.NativeType("__u16") short r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nflags(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.system.linux.liburing.IOURingAttrPI app_tag(@org.lwjgl.system.NativeType("__u16") short r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            napp_tag(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.system.linux.liburing.IOURingAttrPI len(@org.lwjgl.system.NativeType("__u32") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nlen(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.system.linux.liburing.IOURingAttrPI addr(@org.lwjgl.system.NativeType("__u64") long r6) {
            r5 = this;
            r0 = r5
            long r0 = r0.address()
            r1 = r6
            naddr(r0, r1)
            r0 = r5
            return r0
    }

    public org.lwjgl.system.linux.liburing.IOURingAttrPI seed(@org.lwjgl.system.NativeType("__u64") long r6) {
            r5 = this;
            r0 = r5
            long r0 = r0.address()
            r1 = r6
            nseed(r0, r1)
            r0 = r5
            return r0
    }

    public org.lwjgl.system.linux.liburing.IOURingAttrPI rsvd(@org.lwjgl.system.NativeType("__u64") long r6) {
            r5 = this;
            r0 = r5
            long r0 = r0.address()
            r1 = r6
            nrsvd(r0, r1)
            r0 = r5
            return r0
    }

    public org.lwjgl.system.linux.liburing.IOURingAttrPI set(short r5, short r6, int r7, long r8, long r10, long r12) {
            r4 = this;
            r0 = r4
            r1 = r5
            org.lwjgl.system.linux.liburing.IOURingAttrPI r0 = r0.flags(r1)
            r0 = r4
            r1 = r6
            org.lwjgl.system.linux.liburing.IOURingAttrPI r0 = r0.app_tag(r1)
            r0 = r4
            r1 = r7
            org.lwjgl.system.linux.liburing.IOURingAttrPI r0 = r0.len(r1)
            r0 = r4
            r1 = r8
            org.lwjgl.system.linux.liburing.IOURingAttrPI r0 = r0.addr(r1)
            r0 = r4
            r1 = r10
            org.lwjgl.system.linux.liburing.IOURingAttrPI r0 = r0.seed(r1)
            r0 = r4
            r1 = r12
            org.lwjgl.system.linux.liburing.IOURingAttrPI r0 = r0.rsvd(r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.system.linux.liburing.IOURingAttrPI set(org.lwjgl.system.linux.liburing.IOURingAttrPI r8) {
            r7 = this;
            r0 = r8
            long r0 = r0.address()
            r1 = r7
            long r1 = r1.address()
            int r2 = org.lwjgl.system.linux.liburing.IOURingAttrPI.SIZEOF
            long r2 = (long) r2
            org.lwjgl.system.MemoryUtil.memCopy(r0, r1, r2)
            r0 = r7
            return r0
    }

    public static org.lwjgl.system.linux.liburing.IOURingAttrPI malloc() {
            org.lwjgl.system.linux.liburing.IOURingAttrPI r0 = new org.lwjgl.system.linux.liburing.IOURingAttrPI
            r1 = r0
            int r2 = org.lwjgl.system.linux.liburing.IOURingAttrPI.SIZEOF
            long r2 = (long) r2
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.system.linux.liburing.IOURingAttrPI calloc() {
            org.lwjgl.system.linux.liburing.IOURingAttrPI r0 = new org.lwjgl.system.linux.liburing.IOURingAttrPI
            r1 = r0
            r2 = 1
            int r3 = org.lwjgl.system.linux.liburing.IOURingAttrPI.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.system.linux.liburing.IOURingAttrPI create() {
            int r0 = org.lwjgl.system.linux.liburing.IOURingAttrPI.SIZEOF
            java.nio.ByteBuffer r0 = org.lwjgl.BufferUtils.createByteBuffer(r0)
            r6 = r0
            org.lwjgl.system.linux.liburing.IOURingAttrPI r0 = new org.lwjgl.system.linux.liburing.IOURingAttrPI
            r1 = r0
            r2 = r6
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.system.linux.liburing.IOURingAttrPI create(long r6) {
            org.lwjgl.system.linux.liburing.IOURingAttrPI r0 = new org.lwjgl.system.linux.liburing.IOURingAttrPI
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.system.linux.liburing.IOURingAttrPI createSafe(long r6) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.system.linux.liburing.IOURingAttrPI r0 = new org.lwjgl.system.linux.liburing.IOURingAttrPI
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static org.lwjgl.system.linux.liburing.IOURingAttrPI.Buffer malloc(int r6) {
            org.lwjgl.system.linux.liburing.IOURingAttrPI$Buffer r0 = new org.lwjgl.system.linux.liburing.IOURingAttrPI$Buffer
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.system.linux.liburing.IOURingAttrPI.SIZEOF
            long r2 = __checkMalloc(r2, r3)
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.system.linux.liburing.IOURingAttrPI.Buffer calloc(int r7) {
            org.lwjgl.system.linux.liburing.IOURingAttrPI$Buffer r0 = new org.lwjgl.system.linux.liburing.IOURingAttrPI$Buffer
            r1 = r0
            r2 = r7
            long r2 = (long) r2
            int r3 = org.lwjgl.system.linux.liburing.IOURingAttrPI.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.system.linux.liburing.IOURingAttrPI.Buffer create(int r10) {
            r0 = r10
            int r1 = org.lwjgl.system.linux.liburing.IOURingAttrPI.SIZEOF
            java.nio.ByteBuffer r0 = __create(r0, r1)
            r11 = r0
            org.lwjgl.system.linux.liburing.IOURingAttrPI$Buffer r0 = new org.lwjgl.system.linux.liburing.IOURingAttrPI$Buffer
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

    public static org.lwjgl.system.linux.liburing.IOURingAttrPI.Buffer create(long r6, int r8) {
            org.lwjgl.system.linux.liburing.IOURingAttrPI$Buffer r0 = new org.lwjgl.system.linux.liburing.IOURingAttrPI$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.system.linux.liburing.IOURingAttrPI.Buffer createSafe(long r6, int r8) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.system.linux.liburing.IOURingAttrPI$Buffer r0 = new org.lwjgl.system.linux.liburing.IOURingAttrPI$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static org.lwjgl.system.linux.liburing.IOURingAttrPI malloc(org.lwjgl.system.MemoryStack r6) {
            org.lwjgl.system.linux.liburing.IOURingAttrPI r0 = new org.lwjgl.system.linux.liburing.IOURingAttrPI
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.system.linux.liburing.IOURingAttrPI.ALIGNOF
            int r4 = org.lwjgl.system.linux.liburing.IOURingAttrPI.SIZEOF
            long r2 = r2.nmalloc(r3, r4)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.system.linux.liburing.IOURingAttrPI calloc(org.lwjgl.system.MemoryStack r7) {
            org.lwjgl.system.linux.liburing.IOURingAttrPI r0 = new org.lwjgl.system.linux.liburing.IOURingAttrPI
            r1 = r0
            r2 = r7
            int r3 = org.lwjgl.system.linux.liburing.IOURingAttrPI.ALIGNOF
            r4 = 1
            int r5 = org.lwjgl.system.linux.liburing.IOURingAttrPI.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.system.linux.liburing.IOURingAttrPI.Buffer malloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.system.linux.liburing.IOURingAttrPI$Buffer r0 = new org.lwjgl.system.linux.liburing.IOURingAttrPI$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.system.linux.liburing.IOURingAttrPI.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.system.linux.liburing.IOURingAttrPI.SIZEOF
            int r4 = r4 * r5
            long r2 = r2.nmalloc(r3, r4)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.system.linux.liburing.IOURingAttrPI.Buffer calloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.system.linux.liburing.IOURingAttrPI$Buffer r0 = new org.lwjgl.system.linux.liburing.IOURingAttrPI$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.system.linux.liburing.IOURingAttrPI.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.system.linux.liburing.IOURingAttrPI.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static short nflags(long r5) {
            r0 = r5
            int r1 = org.lwjgl.system.linux.liburing.IOURingAttrPI.FLAGS
            long r1 = (long) r1
            long r0 = r0 + r1
            short r0 = org.lwjgl.system.MemoryUtil.memGetShort(r0)
            return r0
    }

    public static short napp_tag(long r5) {
            r0 = r5
            int r1 = org.lwjgl.system.linux.liburing.IOURingAttrPI.APP_TAG
            long r1 = (long) r1
            long r0 = r0 + r1
            short r0 = org.lwjgl.system.MemoryUtil.memGetShort(r0)
            return r0
    }

    public static int nlen(long r5) {
            r0 = r5
            int r1 = org.lwjgl.system.linux.liburing.IOURingAttrPI.LEN
            long r1 = (long) r1
            long r0 = r0 + r1
            int r0 = org.lwjgl.system.MemoryUtil.memGetInt(r0)
            return r0
    }

    public static long naddr(long r5) {
            r0 = r5
            int r1 = org.lwjgl.system.linux.liburing.IOURingAttrPI.ADDR
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetLong(r0)
            return r0
    }

    public static long nseed(long r5) {
            r0 = r5
            int r1 = org.lwjgl.system.linux.liburing.IOURingAttrPI.SEED
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetLong(r0)
            return r0
    }

    public static long nrsvd(long r5) {
            r0 = r5
            int r1 = org.lwjgl.system.linux.liburing.IOURingAttrPI.RSVD
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetLong(r0)
            return r0
    }

    public static void nflags(long r5, short r7) {
            r0 = r5
            int r1 = org.lwjgl.system.linux.liburing.IOURingAttrPI.FLAGS
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            org.lwjgl.system.MemoryUtil.memPutShort(r0, r1)
            return
    }

    public static void napp_tag(long r5, short r7) {
            r0 = r5
            int r1 = org.lwjgl.system.linux.liburing.IOURingAttrPI.APP_TAG
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            org.lwjgl.system.MemoryUtil.memPutShort(r0, r1)
            return
    }

    public static void nlen(long r5, int r7) {
            r0 = r5
            int r1 = org.lwjgl.system.linux.liburing.IOURingAttrPI.LEN
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            org.lwjgl.system.MemoryUtil.memPutInt(r0, r1)
            return
    }

    public static void naddr(long r5, long r7) {
            r0 = r5
            int r1 = org.lwjgl.system.linux.liburing.IOURingAttrPI.ADDR
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            org.lwjgl.system.MemoryUtil.memPutLong(r0, r1)
            return
    }

    public static void nseed(long r5, long r7) {
            r0 = r5
            int r1 = org.lwjgl.system.linux.liburing.IOURingAttrPI.SEED
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            org.lwjgl.system.MemoryUtil.memPutLong(r0, r1)
            return
    }

    public static void nrsvd(long r5, long r7) {
            r0 = r5
            int r1 = org.lwjgl.system.linux.liburing.IOURingAttrPI.RSVD
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
            org.lwjgl.system.linux.liburing.IOURingAttrPI r0 = r0.create(r1, r2)
            return r0
    }

    static {
            r0 = 6
            org.lwjgl.system.Struct$Member[] r0 = new org.lwjgl.system.Struct.Member[r0]
            r1 = r0
            r2 = 0
            r3 = 2
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 1
            r3 = 2
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 2
            r3 = 4
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
            org.lwjgl.system.linux.liburing.IOURingAttrPI.SIZEOF = r0
            r0 = r5
            int r0 = r0.getAlignment()
            org.lwjgl.system.linux.liburing.IOURingAttrPI.ALIGNOF = r0
            r0 = r5
            r1 = 0
            int r0 = r0.offsetof(r1)
            org.lwjgl.system.linux.liburing.IOURingAttrPI.FLAGS = r0
            r0 = r5
            r1 = 1
            int r0 = r0.offsetof(r1)
            org.lwjgl.system.linux.liburing.IOURingAttrPI.APP_TAG = r0
            r0 = r5
            r1 = 2
            int r0 = r0.offsetof(r1)
            org.lwjgl.system.linux.liburing.IOURingAttrPI.LEN = r0
            r0 = r5
            r1 = 3
            int r0 = r0.offsetof(r1)
            org.lwjgl.system.linux.liburing.IOURingAttrPI.ADDR = r0
            r0 = r5
            r1 = 4
            int r0 = r0.offsetof(r1)
            org.lwjgl.system.linux.liburing.IOURingAttrPI.SEED = r0
            r0 = r5
            r1 = 5
            int r0 = r0.offsetof(r1)
            org.lwjgl.system.linux.liburing.IOURingAttrPI.RSVD = r0
            return
    }
}
