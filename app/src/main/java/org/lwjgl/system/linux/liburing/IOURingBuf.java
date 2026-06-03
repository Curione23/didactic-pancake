package org.lwjgl.system.linux.liburing;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/system/linux/liburing/IOURingBuf.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/system/linux/liburing/IOURingBuf.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/system/linux/liburing/IOURingBuf.class */
@org.lwjgl.system.NativeType("struct io_uring_buf")
public class IOURingBuf extends org.lwjgl.system.Struct<org.lwjgl.system.linux.liburing.IOURingBuf> implements org.lwjgl.system.NativeResource {
    public static final int SIZEOF = 0;
    public static final int ALIGNOF = 0;
    public static final int ADDR = 0;
    public static final int LEN = 0;
    public static final int BID = 0;
    public static final int RESV = 0;

    /* JADX WARN: Classes with same name are omitted, all sources:
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/system/linux/liburing/IOURingBuf$Buffer.class
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/system/linux/liburing/IOURingBuf$Buffer.class
     */
    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/system/linux/liburing/IOURingBuf$Buffer.class */
    public static class Buffer extends org.lwjgl.system.StructBuffer<org.lwjgl.system.linux.liburing.IOURingBuf, org.lwjgl.system.linux.liburing.IOURingBuf.Buffer> implements org.lwjgl.system.NativeResource {
        private static final org.lwjgl.system.linux.liburing.IOURingBuf ELEMENT_FACTORY = null;

        public Buffer(java.nio.ByteBuffer r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r6
                int r2 = r2.remaining()
                int r3 = org.lwjgl.system.linux.liburing.IOURingBuf.SIZEOF
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

        Buffer(long r10, @javax.annotation.Nullable java.nio.ByteBuffer r12, int r13, int r14, int r15, int r16) {
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
        protected org.lwjgl.system.linux.liburing.IOURingBuf.Buffer self() {
                r2 = this;
                r0 = r2
                return r0
        }

        @Override // org.lwjgl.system.StructBuffer
        protected org.lwjgl.system.linux.liburing.IOURingBuf getElementFactory() {
                r2 = this;
                org.lwjgl.system.linux.liburing.IOURingBuf r0 = org.lwjgl.system.linux.liburing.IOURingBuf.Buffer.ELEMENT_FACTORY
                return r0
        }

        @org.lwjgl.system.NativeType("__u64")
        public long addr() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                long r0 = org.lwjgl.system.linux.liburing.IOURingBuf.naddr(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("__u32")
        public int len() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.system.linux.liburing.IOURingBuf.nlen(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("__u16")
        public short bid() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                short r0 = org.lwjgl.system.linux.liburing.IOURingBuf.nbid(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("__u16")
        public short resv() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                short r0 = org.lwjgl.system.linux.liburing.IOURingBuf.nresv(r0)
                return r0
        }

        public org.lwjgl.system.linux.liburing.IOURingBuf.Buffer addr(@org.lwjgl.system.NativeType("__u64") long r6) {
                r5 = this;
                r0 = r5
                long r0 = r0.address()
                r1 = r6
                org.lwjgl.system.linux.liburing.IOURingBuf.naddr(r0, r1)
                r0 = r5
                return r0
        }

        public org.lwjgl.system.linux.liburing.IOURingBuf.Buffer len(@org.lwjgl.system.NativeType("__u32") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.system.linux.liburing.IOURingBuf.nlen(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.system.linux.liburing.IOURingBuf.Buffer bid(@org.lwjgl.system.NativeType("__u16") short r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.system.linux.liburing.IOURingBuf.nbid(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.system.linux.liburing.IOURingBuf.Buffer resv(@org.lwjgl.system.NativeType("__u16") short r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.system.linux.liburing.IOURingBuf.nresv(r0, r1)
                r0 = r4
                return r0
        }

        @Override // org.lwjgl.system.StructBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.Struct getElementFactory() {
                r2 = this;
                r0 = r2
                org.lwjgl.system.linux.liburing.IOURingBuf r0 = r0.getElementFactory()
                return r0
        }

        @Override // org.lwjgl.system.CustomBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.CustomBuffer self() {
                r2 = this;
                r0 = r2
                org.lwjgl.system.linux.liburing.IOURingBuf$Buffer r0 = r0.self()
                return r0
        }

        static {
                r0 = -1
                org.lwjgl.system.linux.liburing.IOURingBuf r0 = org.lwjgl.system.linux.liburing.IOURingBuf.create(r0)
                org.lwjgl.system.linux.liburing.IOURingBuf.Buffer.ELEMENT_FACTORY = r0
                return
        }
    }

    protected IOURingBuf(long r6, @javax.annotation.Nullable java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    protected org.lwjgl.system.linux.liburing.IOURingBuf create(long r7, @javax.annotation.Nullable java.nio.ByteBuffer r9) {
            r6 = this;
            org.lwjgl.system.linux.liburing.IOURingBuf r0 = new org.lwjgl.system.linux.liburing.IOURingBuf
            r1 = r0
            r2 = r7
            r3 = r9
            r1.<init>(r2, r3)
            return r0
    }

    public IOURingBuf(java.nio.ByteBuffer r7) {
            r6 = this;
            r0 = r6
            r1 = r7
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            r2 = r7
            int r3 = org.lwjgl.system.linux.liburing.IOURingBuf.SIZEOF
            java.nio.ByteBuffer r2 = __checkContainer(r2, r3)
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
            r2 = this;
            int r0 = org.lwjgl.system.linux.liburing.IOURingBuf.SIZEOF
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

    @org.lwjgl.system.NativeType("__u32")
    public int len() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nlen(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("__u16")
    public short bid() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            short r0 = nbid(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("__u16")
    public short resv() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            short r0 = nresv(r0)
            return r0
    }

    public org.lwjgl.system.linux.liburing.IOURingBuf addr(@org.lwjgl.system.NativeType("__u64") long r6) {
            r5 = this;
            r0 = r5
            long r0 = r0.address()
            r1 = r6
            naddr(r0, r1)
            r0 = r5
            return r0
    }

    public org.lwjgl.system.linux.liburing.IOURingBuf len(@org.lwjgl.system.NativeType("__u32") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nlen(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.system.linux.liburing.IOURingBuf bid(@org.lwjgl.system.NativeType("__u16") short r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nbid(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.system.linux.liburing.IOURingBuf resv(@org.lwjgl.system.NativeType("__u16") short r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nresv(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.system.linux.liburing.IOURingBuf set(long r5, int r7, short r8, short r9) {
            r4 = this;
            r0 = r4
            r1 = r5
            org.lwjgl.system.linux.liburing.IOURingBuf r0 = r0.addr(r1)
            r0 = r4
            r1 = r7
            org.lwjgl.system.linux.liburing.IOURingBuf r0 = r0.len(r1)
            r0 = r4
            r1 = r8
            org.lwjgl.system.linux.liburing.IOURingBuf r0 = r0.bid(r1)
            r0 = r4
            r1 = r9
            org.lwjgl.system.linux.liburing.IOURingBuf r0 = r0.resv(r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.system.linux.liburing.IOURingBuf set(org.lwjgl.system.linux.liburing.IOURingBuf r7) {
            r6 = this;
            r0 = r7
            long r0 = r0.address()
            r1 = r6
            long r1 = r1.address()
            int r2 = org.lwjgl.system.linux.liburing.IOURingBuf.SIZEOF
            org.lwjgl.system.MemoryUtil.memCopy(r0, r1, r2)
            r0 = r6
            return r0
    }

    public static org.lwjgl.system.linux.liburing.IOURingBuf malloc() {
            org.lwjgl.system.linux.liburing.IOURingBuf r0 = new org.lwjgl.system.linux.liburing.IOURingBuf
            r1 = r0
            int r2 = org.lwjgl.system.linux.liburing.IOURingBuf.SIZEOF
            long r2 = (long) r2
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.system.linux.liburing.IOURingBuf calloc() {
            org.lwjgl.system.linux.liburing.IOURingBuf r0 = new org.lwjgl.system.linux.liburing.IOURingBuf
            r1 = r0
            r2 = 1
            int r3 = org.lwjgl.system.linux.liburing.IOURingBuf.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.system.linux.liburing.IOURingBuf create() {
            int r0 = org.lwjgl.system.linux.liburing.IOURingBuf.SIZEOF
            java.nio.ByteBuffer r0 = org.lwjgl.BufferUtils.createByteBuffer(r0)
            r6 = r0
            org.lwjgl.system.linux.liburing.IOURingBuf r0 = new org.lwjgl.system.linux.liburing.IOURingBuf
            r1 = r0
            r2 = r6
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.system.linux.liburing.IOURingBuf create(long r6) {
            org.lwjgl.system.linux.liburing.IOURingBuf r0 = new org.lwjgl.system.linux.liburing.IOURingBuf
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.system.linux.liburing.IOURingBuf createSafe(long r6) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.system.linux.liburing.IOURingBuf r0 = new org.lwjgl.system.linux.liburing.IOURingBuf
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static org.lwjgl.system.linux.liburing.IOURingBuf.Buffer malloc(int r6) {
            org.lwjgl.system.linux.liburing.IOURingBuf$Buffer r0 = new org.lwjgl.system.linux.liburing.IOURingBuf$Buffer
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.system.linux.liburing.IOURingBuf.SIZEOF
            long r2 = __checkMalloc(r2, r3)
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.system.linux.liburing.IOURingBuf.Buffer calloc(int r7) {
            org.lwjgl.system.linux.liburing.IOURingBuf$Buffer r0 = new org.lwjgl.system.linux.liburing.IOURingBuf$Buffer
            r1 = r0
            r2 = r7
            long r2 = (long) r2
            int r3 = org.lwjgl.system.linux.liburing.IOURingBuf.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.system.linux.liburing.IOURingBuf.Buffer create(int r10) {
            r0 = r10
            int r1 = org.lwjgl.system.linux.liburing.IOURingBuf.SIZEOF
            java.nio.ByteBuffer r0 = __create(r0, r1)
            r11 = r0
            org.lwjgl.system.linux.liburing.IOURingBuf$Buffer r0 = new org.lwjgl.system.linux.liburing.IOURingBuf$Buffer
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

    public static org.lwjgl.system.linux.liburing.IOURingBuf.Buffer create(long r6, int r8) {
            org.lwjgl.system.linux.liburing.IOURingBuf$Buffer r0 = new org.lwjgl.system.linux.liburing.IOURingBuf$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.system.linux.liburing.IOURingBuf.Buffer createSafe(long r6, int r8) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.system.linux.liburing.IOURingBuf$Buffer r0 = new org.lwjgl.system.linux.liburing.IOURingBuf$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static org.lwjgl.system.linux.liburing.IOURingBuf malloc(org.lwjgl.system.MemoryStack r6) {
            org.lwjgl.system.linux.liburing.IOURingBuf r0 = new org.lwjgl.system.linux.liburing.IOURingBuf
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.system.linux.liburing.IOURingBuf.ALIGNOF
            int r4 = org.lwjgl.system.linux.liburing.IOURingBuf.SIZEOF
            long r2 = r2.nmalloc(r3, r4)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.system.linux.liburing.IOURingBuf calloc(org.lwjgl.system.MemoryStack r7) {
            org.lwjgl.system.linux.liburing.IOURingBuf r0 = new org.lwjgl.system.linux.liburing.IOURingBuf
            r1 = r0
            r2 = r7
            int r3 = org.lwjgl.system.linux.liburing.IOURingBuf.ALIGNOF
            r4 = 1
            int r5 = org.lwjgl.system.linux.liburing.IOURingBuf.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.system.linux.liburing.IOURingBuf.Buffer malloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.system.linux.liburing.IOURingBuf$Buffer r0 = new org.lwjgl.system.linux.liburing.IOURingBuf$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.system.linux.liburing.IOURingBuf.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.system.linux.liburing.IOURingBuf.SIZEOF
            int r4 = r4 * r5
            long r2 = r2.nmalloc(r3, r4)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.system.linux.liburing.IOURingBuf.Buffer calloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.system.linux.liburing.IOURingBuf$Buffer r0 = new org.lwjgl.system.linux.liburing.IOURingBuf$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.system.linux.liburing.IOURingBuf.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.system.linux.liburing.IOURingBuf.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static long naddr(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.system.linux.liburing.IOURingBuf.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.system.linux.liburing.IOURingBuf.ADDR
            long r3 = (long) r3
            long r2 = r2 + r3
            long r0 = r0.getLong(r1, r2)
            return r0
    }

    public static int nlen(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.system.linux.liburing.IOURingBuf.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.system.linux.liburing.IOURingBuf.LEN
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static short nbid(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.system.linux.liburing.IOURingBuf.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.system.linux.liburing.IOURingBuf.BID
            long r3 = (long) r3
            long r2 = r2 + r3
            short r0 = r0.getShort(r1, r2)
            return r0
    }

    public static short nresv(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.system.linux.liburing.IOURingBuf.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.system.linux.liburing.IOURingBuf.RESV
            long r3 = (long) r3
            long r2 = r2 + r3
            short r0 = r0.getShort(r1, r2)
            return r0
    }

    public static void naddr(long r7, long r9) {
            sun.misc.Unsafe r0 = org.lwjgl.system.linux.liburing.IOURingBuf.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.system.linux.liburing.IOURingBuf.ADDR
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putLong(r1, r2, r3)
            return
    }

    public static void nlen(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.system.linux.liburing.IOURingBuf.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.system.linux.liburing.IOURingBuf.LEN
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void nbid(long r7, short r9) {
            sun.misc.Unsafe r0 = org.lwjgl.system.linux.liburing.IOURingBuf.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.system.linux.liburing.IOURingBuf.BID
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putShort(r1, r2, r3)
            return
    }

    public static void nresv(long r7, short r9) {
            sun.misc.Unsafe r0 = org.lwjgl.system.linux.liburing.IOURingBuf.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.system.linux.liburing.IOURingBuf.RESV
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putShort(r1, r2, r3)
            return
    }

    @Override // org.lwjgl.system.Struct
    protected /* bridge */ /* synthetic */ org.lwjgl.system.Struct create(long r6, @javax.annotation.Nullable java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            org.lwjgl.system.linux.liburing.IOURingBuf r0 = r0.create(r1, r2)
            return r0
    }

    static {
            r0 = 4
            org.lwjgl.system.Struct$Member[] r0 = new org.lwjgl.system.Struct.Member[r0]
            r1 = r0
            r2 = 0
            r3 = 8
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 1
            r3 = 4
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 2
            r3 = 2
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 3
            r3 = 2
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            org.lwjgl.system.Struct$Layout r0 = __struct(r0)
            r5 = r0
            r0 = r5
            int r0 = r0.getSize()
            org.lwjgl.system.linux.liburing.IOURingBuf.SIZEOF = r0
            r0 = r5
            int r0 = r0.getAlignment()
            org.lwjgl.system.linux.liburing.IOURingBuf.ALIGNOF = r0
            r0 = r5
            r1 = 0
            int r0 = r0.offsetof(r1)
            org.lwjgl.system.linux.liburing.IOURingBuf.ADDR = r0
            r0 = r5
            r1 = 1
            int r0 = r0.offsetof(r1)
            org.lwjgl.system.linux.liburing.IOURingBuf.LEN = r0
            r0 = r5
            r1 = 2
            int r0 = r0.offsetof(r1)
            org.lwjgl.system.linux.liburing.IOURingBuf.BID = r0
            r0 = r5
            r1 = 3
            int r0 = r0.offsetof(r1)
            org.lwjgl.system.linux.liburing.IOURingBuf.RESV = r0
            return
    }
}
