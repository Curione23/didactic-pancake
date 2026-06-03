package org.lwjgl.system.linux.liburing;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/system/linux/liburing/IOURingBufRing.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/system/linux/liburing/IOURingBufRing.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/system/linux/liburing/IOURingBufRing.class */
@org.lwjgl.system.NativeType("struct io_uring_buf_ring")
public class IOURingBufRing extends org.lwjgl.system.Struct<org.lwjgl.system.linux.liburing.IOURingBufRing> implements org.lwjgl.system.NativeResource {
    public static final int SIZEOF = 0;
    public static final int ALIGNOF = 0;
    public static final int RESV1 = 0;
    public static final int RESV2 = 0;
    public static final int RESV3 = 0;
    public static final int TAIL = 0;
    public static final int BUFS = 0;

    /* JADX WARN: Classes with same name are omitted, all sources:
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/system/linux/liburing/IOURingBufRing$Buffer.class
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/system/linux/liburing/IOURingBufRing$Buffer.class
     */
    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/system/linux/liburing/IOURingBufRing$Buffer.class */
    public static class Buffer extends org.lwjgl.system.StructBuffer<org.lwjgl.system.linux.liburing.IOURingBufRing, org.lwjgl.system.linux.liburing.IOURingBufRing.Buffer> implements org.lwjgl.system.NativeResource {
        private static final org.lwjgl.system.linux.liburing.IOURingBufRing ELEMENT_FACTORY = null;

        public Buffer(java.nio.ByteBuffer r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r6
                int r2 = r2.remaining()
                int r3 = org.lwjgl.system.linux.liburing.IOURingBufRing.SIZEOF
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
        protected org.lwjgl.system.linux.liburing.IOURingBufRing.Buffer self() {
                r2 = this;
                r0 = r2
                return r0
        }

        @Override // org.lwjgl.system.StructBuffer
        protected org.lwjgl.system.linux.liburing.IOURingBufRing getElementFactory() {
                r2 = this;
                org.lwjgl.system.linux.liburing.IOURingBufRing r0 = org.lwjgl.system.linux.liburing.IOURingBufRing.Buffer.ELEMENT_FACTORY
                return r0
        }

        @org.lwjgl.system.NativeType("__u64")
        public long resv1() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                long r0 = org.lwjgl.system.linux.liburing.IOURingBufRing.nresv1(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("__u32")
        public int resv2() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.system.linux.liburing.IOURingBufRing.nresv2(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("__u16")
        public short resv3() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                short r0 = org.lwjgl.system.linux.liburing.IOURingBufRing.nresv3(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("__u16")
        public short tail() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                short r0 = org.lwjgl.system.linux.liburing.IOURingBufRing.ntail(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("struct io_uring_buf[0]")
        public org.lwjgl.system.linux.liburing.IOURingBuf.Buffer bufs() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                org.lwjgl.system.linux.liburing.IOURingBuf$Buffer r0 = org.lwjgl.system.linux.liburing.IOURingBufRing.nbufs(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("struct io_uring_buf")
        public org.lwjgl.system.linux.liburing.IOURingBuf bufs(int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.system.linux.liburing.IOURingBuf r0 = org.lwjgl.system.linux.liburing.IOURingBufRing.nbufs(r0, r1)
                return r0
        }

        public org.lwjgl.system.linux.liburing.IOURingBufRing.Buffer resv1(@org.lwjgl.system.NativeType("__u64") long r6) {
                r5 = this;
                r0 = r5
                long r0 = r0.address()
                r1 = r6
                org.lwjgl.system.linux.liburing.IOURingBufRing.nresv1(r0, r1)
                r0 = r5
                return r0
        }

        public org.lwjgl.system.linux.liburing.IOURingBufRing.Buffer resv2(@org.lwjgl.system.NativeType("__u32") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.system.linux.liburing.IOURingBufRing.nresv2(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.system.linux.liburing.IOURingBufRing.Buffer resv3(@org.lwjgl.system.NativeType("__u16") short r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.system.linux.liburing.IOURingBufRing.nresv3(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.system.linux.liburing.IOURingBufRing.Buffer tail(@org.lwjgl.system.NativeType("__u16") short r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.system.linux.liburing.IOURingBufRing.ntail(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.system.linux.liburing.IOURingBufRing.Buffer bufs(@org.lwjgl.system.NativeType("struct io_uring_buf[0]") org.lwjgl.system.linux.liburing.IOURingBuf.Buffer r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.system.linux.liburing.IOURingBufRing.nbufs(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.system.linux.liburing.IOURingBufRing.Buffer bufs(int r6, @org.lwjgl.system.NativeType("struct io_uring_buf") org.lwjgl.system.linux.liburing.IOURingBuf r7) {
                r5 = this;
                r0 = r5
                long r0 = r0.address()
                r1 = r6
                r2 = r7
                org.lwjgl.system.linux.liburing.IOURingBufRing.nbufs(r0, r1, r2)
                r0 = r5
                return r0
        }

        public org.lwjgl.system.linux.liburing.IOURingBufRing.Buffer bufs(java.util.function.Consumer<org.lwjgl.system.linux.liburing.IOURingBuf.Buffer> r4) {
                r3 = this;
                r0 = r4
                r1 = r3
                org.lwjgl.system.linux.liburing.IOURingBuf$Buffer r1 = r1.bufs()
                r0.accept(r1)
                r0 = r3
                return r0
        }

        public org.lwjgl.system.linux.liburing.IOURingBufRing.Buffer bufs(int r5, java.util.function.Consumer<org.lwjgl.system.linux.liburing.IOURingBuf> r6) {
                r4 = this;
                r0 = r6
                r1 = r4
                r2 = r5
                org.lwjgl.system.linux.liburing.IOURingBuf r1 = r1.bufs(r2)
                r0.accept(r1)
                r0 = r4
                return r0
        }

        @Override // org.lwjgl.system.StructBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.Struct getElementFactory() {
                r2 = this;
                r0 = r2
                org.lwjgl.system.linux.liburing.IOURingBufRing r0 = r0.getElementFactory()
                return r0
        }

        @Override // org.lwjgl.system.CustomBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.CustomBuffer self() {
                r2 = this;
                r0 = r2
                org.lwjgl.system.linux.liburing.IOURingBufRing$Buffer r0 = r0.self()
                return r0
        }

        static {
                r0 = -1
                org.lwjgl.system.linux.liburing.IOURingBufRing r0 = org.lwjgl.system.linux.liburing.IOURingBufRing.create(r0)
                org.lwjgl.system.linux.liburing.IOURingBufRing.Buffer.ELEMENT_FACTORY = r0
                return
        }
    }

    protected IOURingBufRing(long r6, @javax.annotation.Nullable java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    protected org.lwjgl.system.linux.liburing.IOURingBufRing create(long r7, @javax.annotation.Nullable java.nio.ByteBuffer r9) {
            r6 = this;
            org.lwjgl.system.linux.liburing.IOURingBufRing r0 = new org.lwjgl.system.linux.liburing.IOURingBufRing
            r1 = r0
            r2 = r7
            r3 = r9
            r1.<init>(r2, r3)
            return r0
    }

    public IOURingBufRing(java.nio.ByteBuffer r7) {
            r6 = this;
            r0 = r6
            r1 = r7
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            r2 = r7
            int r3 = org.lwjgl.system.linux.liburing.IOURingBufRing.SIZEOF
            java.nio.ByteBuffer r2 = __checkContainer(r2, r3)
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
            r2 = this;
            int r0 = org.lwjgl.system.linux.liburing.IOURingBufRing.SIZEOF
            return r0
    }

    @org.lwjgl.system.NativeType("__u64")
    public long resv1() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            long r0 = nresv1(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("__u32")
    public int resv2() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nresv2(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("__u16")
    public short resv3() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            short r0 = nresv3(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("__u16")
    public short tail() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            short r0 = ntail(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("struct io_uring_buf[0]")
    public org.lwjgl.system.linux.liburing.IOURingBuf.Buffer bufs() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            org.lwjgl.system.linux.liburing.IOURingBuf$Buffer r0 = nbufs(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("struct io_uring_buf")
    public org.lwjgl.system.linux.liburing.IOURingBuf bufs(int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            org.lwjgl.system.linux.liburing.IOURingBuf r0 = nbufs(r0, r1)
            return r0
    }

    public org.lwjgl.system.linux.liburing.IOURingBufRing resv1(@org.lwjgl.system.NativeType("__u64") long r6) {
            r5 = this;
            r0 = r5
            long r0 = r0.address()
            r1 = r6
            nresv1(r0, r1)
            r0 = r5
            return r0
    }

    public org.lwjgl.system.linux.liburing.IOURingBufRing resv2(@org.lwjgl.system.NativeType("__u32") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nresv2(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.system.linux.liburing.IOURingBufRing resv3(@org.lwjgl.system.NativeType("__u16") short r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nresv3(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.system.linux.liburing.IOURingBufRing tail(@org.lwjgl.system.NativeType("__u16") short r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            ntail(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.system.linux.liburing.IOURingBufRing bufs(@org.lwjgl.system.NativeType("struct io_uring_buf[0]") org.lwjgl.system.linux.liburing.IOURingBuf.Buffer r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nbufs(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.system.linux.liburing.IOURingBufRing bufs(int r6, @org.lwjgl.system.NativeType("struct io_uring_buf") org.lwjgl.system.linux.liburing.IOURingBuf r7) {
            r5 = this;
            r0 = r5
            long r0 = r0.address()
            r1 = r6
            r2 = r7
            nbufs(r0, r1, r2)
            r0 = r5
            return r0
    }

    public org.lwjgl.system.linux.liburing.IOURingBufRing bufs(java.util.function.Consumer<org.lwjgl.system.linux.liburing.IOURingBuf.Buffer> r4) {
            r3 = this;
            r0 = r4
            r1 = r3
            org.lwjgl.system.linux.liburing.IOURingBuf$Buffer r1 = r1.bufs()
            r0.accept(r1)
            r0 = r3
            return r0
    }

    public org.lwjgl.system.linux.liburing.IOURingBufRing bufs(int r5, java.util.function.Consumer<org.lwjgl.system.linux.liburing.IOURingBuf> r6) {
            r4 = this;
            r0 = r6
            r1 = r4
            r2 = r5
            org.lwjgl.system.linux.liburing.IOURingBuf r1 = r1.bufs(r2)
            r0.accept(r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.system.linux.liburing.IOURingBufRing set(org.lwjgl.system.linux.liburing.IOURingBufRing r7) {
            r6 = this;
            r0 = r7
            long r0 = r0.address()
            r1 = r6
            long r1 = r1.address()
            int r2 = org.lwjgl.system.linux.liburing.IOURingBufRing.SIZEOF
            org.lwjgl.system.MemoryUtil.memCopy(r0, r1, r2)
            r0 = r6
            return r0
    }

    public static org.lwjgl.system.linux.liburing.IOURingBufRing malloc() {
            org.lwjgl.system.linux.liburing.IOURingBufRing r0 = new org.lwjgl.system.linux.liburing.IOURingBufRing
            r1 = r0
            int r2 = org.lwjgl.system.linux.liburing.IOURingBufRing.SIZEOF
            long r2 = (long) r2
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.system.linux.liburing.IOURingBufRing calloc() {
            org.lwjgl.system.linux.liburing.IOURingBufRing r0 = new org.lwjgl.system.linux.liburing.IOURingBufRing
            r1 = r0
            r2 = 1
            int r3 = org.lwjgl.system.linux.liburing.IOURingBufRing.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.system.linux.liburing.IOURingBufRing create() {
            int r0 = org.lwjgl.system.linux.liburing.IOURingBufRing.SIZEOF
            java.nio.ByteBuffer r0 = org.lwjgl.BufferUtils.createByteBuffer(r0)
            r6 = r0
            org.lwjgl.system.linux.liburing.IOURingBufRing r0 = new org.lwjgl.system.linux.liburing.IOURingBufRing
            r1 = r0
            r2 = r6
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.system.linux.liburing.IOURingBufRing create(long r6) {
            org.lwjgl.system.linux.liburing.IOURingBufRing r0 = new org.lwjgl.system.linux.liburing.IOURingBufRing
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.system.linux.liburing.IOURingBufRing createSafe(long r6) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.system.linux.liburing.IOURingBufRing r0 = new org.lwjgl.system.linux.liburing.IOURingBufRing
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static org.lwjgl.system.linux.liburing.IOURingBufRing.Buffer malloc(int r6) {
            org.lwjgl.system.linux.liburing.IOURingBufRing$Buffer r0 = new org.lwjgl.system.linux.liburing.IOURingBufRing$Buffer
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.system.linux.liburing.IOURingBufRing.SIZEOF
            long r2 = __checkMalloc(r2, r3)
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.system.linux.liburing.IOURingBufRing.Buffer calloc(int r7) {
            org.lwjgl.system.linux.liburing.IOURingBufRing$Buffer r0 = new org.lwjgl.system.linux.liburing.IOURingBufRing$Buffer
            r1 = r0
            r2 = r7
            long r2 = (long) r2
            int r3 = org.lwjgl.system.linux.liburing.IOURingBufRing.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.system.linux.liburing.IOURingBufRing.Buffer create(int r10) {
            r0 = r10
            int r1 = org.lwjgl.system.linux.liburing.IOURingBufRing.SIZEOF
            java.nio.ByteBuffer r0 = __create(r0, r1)
            r11 = r0
            org.lwjgl.system.linux.liburing.IOURingBufRing$Buffer r0 = new org.lwjgl.system.linux.liburing.IOURingBufRing$Buffer
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

    public static org.lwjgl.system.linux.liburing.IOURingBufRing.Buffer create(long r6, int r8) {
            org.lwjgl.system.linux.liburing.IOURingBufRing$Buffer r0 = new org.lwjgl.system.linux.liburing.IOURingBufRing$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.system.linux.liburing.IOURingBufRing.Buffer createSafe(long r6, int r8) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.system.linux.liburing.IOURingBufRing$Buffer r0 = new org.lwjgl.system.linux.liburing.IOURingBufRing$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static org.lwjgl.system.linux.liburing.IOURingBufRing malloc(org.lwjgl.system.MemoryStack r6) {
            org.lwjgl.system.linux.liburing.IOURingBufRing r0 = new org.lwjgl.system.linux.liburing.IOURingBufRing
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.system.linux.liburing.IOURingBufRing.ALIGNOF
            int r4 = org.lwjgl.system.linux.liburing.IOURingBufRing.SIZEOF
            long r2 = r2.nmalloc(r3, r4)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.system.linux.liburing.IOURingBufRing calloc(org.lwjgl.system.MemoryStack r7) {
            org.lwjgl.system.linux.liburing.IOURingBufRing r0 = new org.lwjgl.system.linux.liburing.IOURingBufRing
            r1 = r0
            r2 = r7
            int r3 = org.lwjgl.system.linux.liburing.IOURingBufRing.ALIGNOF
            r4 = 1
            int r5 = org.lwjgl.system.linux.liburing.IOURingBufRing.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.system.linux.liburing.IOURingBufRing.Buffer malloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.system.linux.liburing.IOURingBufRing$Buffer r0 = new org.lwjgl.system.linux.liburing.IOURingBufRing$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.system.linux.liburing.IOURingBufRing.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.system.linux.liburing.IOURingBufRing.SIZEOF
            int r4 = r4 * r5
            long r2 = r2.nmalloc(r3, r4)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.system.linux.liburing.IOURingBufRing.Buffer calloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.system.linux.liburing.IOURingBufRing$Buffer r0 = new org.lwjgl.system.linux.liburing.IOURingBufRing$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.system.linux.liburing.IOURingBufRing.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.system.linux.liburing.IOURingBufRing.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static long nresv1(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.system.linux.liburing.IOURingBufRing.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.system.linux.liburing.IOURingBufRing.RESV1
            long r3 = (long) r3
            long r2 = r2 + r3
            long r0 = r0.getLong(r1, r2)
            return r0
    }

    public static int nresv2(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.system.linux.liburing.IOURingBufRing.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.system.linux.liburing.IOURingBufRing.RESV2
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static short nresv3(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.system.linux.liburing.IOURingBufRing.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.system.linux.liburing.IOURingBufRing.RESV3
            long r3 = (long) r3
            long r2 = r2 + r3
            short r0 = r0.getShort(r1, r2)
            return r0
    }

    public static short ntail(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.system.linux.liburing.IOURingBufRing.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.system.linux.liburing.IOURingBufRing.TAIL
            long r3 = (long) r3
            long r2 = r2 + r3
            short r0 = r0.getShort(r1, r2)
            return r0
    }

    public static org.lwjgl.system.linux.liburing.IOURingBuf.Buffer nbufs(long r5) {
            r0 = r5
            int r1 = org.lwjgl.system.linux.liburing.IOURingBufRing.BUFS
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = 0
            org.lwjgl.system.linux.liburing.IOURingBuf$Buffer r0 = org.lwjgl.system.linux.liburing.IOURingBuf.create(r0, r1)
            return r0
    }

    public static org.lwjgl.system.linux.liburing.IOURingBuf nbufs(long r7, int r9) {
            r0 = r7
            int r1 = org.lwjgl.system.linux.liburing.IOURingBufRing.BUFS
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r9
            r2 = 0
            long r1 = org.lwjgl.system.Checks.check(r1, r2)
            int r2 = org.lwjgl.system.linux.liburing.IOURingBuf.SIZEOF
            long r2 = (long) r2
            long r1 = r1 * r2
            long r0 = r0 + r1
            org.lwjgl.system.linux.liburing.IOURingBuf r0 = org.lwjgl.system.linux.liburing.IOURingBuf.create(r0)
            return r0
    }

    public static void nresv1(long r7, long r9) {
            sun.misc.Unsafe r0 = org.lwjgl.system.linux.liburing.IOURingBufRing.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.system.linux.liburing.IOURingBufRing.RESV1
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putLong(r1, r2, r3)
            return
    }

    public static void nresv2(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.system.linux.liburing.IOURingBufRing.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.system.linux.liburing.IOURingBufRing.RESV2
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void nresv3(long r7, short r9) {
            sun.misc.Unsafe r0 = org.lwjgl.system.linux.liburing.IOURingBufRing.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.system.linux.liburing.IOURingBufRing.RESV3
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putShort(r1, r2, r3)
            return
    }

    public static void ntail(long r7, short r9) {
            sun.misc.Unsafe r0 = org.lwjgl.system.linux.liburing.IOURingBufRing.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.system.linux.liburing.IOURingBufRing.TAIL
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putShort(r1, r2, r3)
            return
    }

    public static void nbufs(long r7, org.lwjgl.system.linux.liburing.IOURingBuf.Buffer r9) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r9
            r1 = 0
            org.lwjgl.system.Checks.checkGT(r0, r1)
        Lb:
            r0 = r9
            long r0 = r0.address()
            r1 = r7
            int r2 = org.lwjgl.system.linux.liburing.IOURingBufRing.BUFS
            long r2 = (long) r2
            long r1 = r1 + r2
            r2 = r9
            int r2 = r2.remaining()
            int r3 = org.lwjgl.system.linux.liburing.IOURingBuf.SIZEOF
            int r2 = r2 * r3
            org.lwjgl.system.MemoryUtil.memCopy(r0, r1, r2)
            return
    }

    public static void nbufs(long r9, int r11, org.lwjgl.system.linux.liburing.IOURingBuf r12) {
            r0 = r12
            long r0 = r0.address()
            r1 = r9
            int r2 = org.lwjgl.system.linux.liburing.IOURingBufRing.BUFS
            long r2 = (long) r2
            long r1 = r1 + r2
            r2 = r11
            r3 = 0
            long r2 = org.lwjgl.system.Checks.check(r2, r3)
            int r3 = org.lwjgl.system.linux.liburing.IOURingBuf.SIZEOF
            long r3 = (long) r3
            long r2 = r2 * r3
            long r1 = r1 + r2
            int r2 = org.lwjgl.system.linux.liburing.IOURingBuf.SIZEOF
            org.lwjgl.system.MemoryUtil.memCopy(r0, r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    protected /* bridge */ /* synthetic */ org.lwjgl.system.Struct create(long r6, @javax.annotation.Nullable java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            org.lwjgl.system.linux.liburing.IOURingBufRing r0 = r0.create(r1, r2)
            return r0
    }

    static {
            r0 = 1
            org.lwjgl.system.Struct$Member[] r0 = new org.lwjgl.system.Struct.Member[r0]
            r1 = r0
            r2 = 0
            r3 = 2
            org.lwjgl.system.Struct$Member[] r3 = new org.lwjgl.system.Struct.Member[r3]
            r4 = r3
            r5 = 0
            r6 = 4
            org.lwjgl.system.Struct$Member[] r6 = new org.lwjgl.system.Struct.Member[r6]
            r7 = r6
            r8 = 0
            r9 = 8
            org.lwjgl.system.Struct$Member r9 = __member(r9)
            r7[r8] = r9
            r7 = r6
            r8 = 1
            r9 = 4
            org.lwjgl.system.Struct$Member r9 = __member(r9)
            r7[r8] = r9
            r7 = r6
            r8 = 2
            r9 = 2
            org.lwjgl.system.Struct$Member r9 = __member(r9)
            r7[r8] = r9
            r7 = r6
            r8 = 3
            r9 = 2
            org.lwjgl.system.Struct$Member r9 = __member(r9)
            r7[r8] = r9
            org.lwjgl.system.Struct$Layout r6 = __struct(r6)
            r4[r5] = r6
            r4 = r3
            r5 = 1
            int r6 = org.lwjgl.system.linux.liburing.IOURingBuf.SIZEOF
            int r7 = org.lwjgl.system.linux.liburing.IOURingBuf.ALIGNOF
            r8 = 0
            org.lwjgl.system.Struct$Member r6 = __array(r6, r7, r8)
            r4[r5] = r6
            org.lwjgl.system.Struct$Layout r3 = __union(r3)
            r1[r2] = r3
            org.lwjgl.system.Struct$Layout r0 = __struct(r0)
            r11 = r0
            r0 = r11
            int r0 = r0.getSize()
            org.lwjgl.system.linux.liburing.IOURingBufRing.SIZEOF = r0
            r0 = r11
            int r0 = r0.getAlignment()
            org.lwjgl.system.linux.liburing.IOURingBufRing.ALIGNOF = r0
            r0 = r11
            r1 = 2
            int r0 = r0.offsetof(r1)
            org.lwjgl.system.linux.liburing.IOURingBufRing.RESV1 = r0
            r0 = r11
            r1 = 3
            int r0 = r0.offsetof(r1)
            org.lwjgl.system.linux.liburing.IOURingBufRing.RESV2 = r0
            r0 = r11
            r1 = 4
            int r0 = r0.offsetof(r1)
            org.lwjgl.system.linux.liburing.IOURingBufRing.RESV3 = r0
            r0 = r11
            r1 = 5
            int r0 = r0.offsetof(r1)
            org.lwjgl.system.linux.liburing.IOURingBufRing.TAIL = r0
            r0 = r11
            r1 = 6
            int r0 = r0.offsetof(r1)
            org.lwjgl.system.linux.liburing.IOURingBufRing.BUFS = r0
            return
    }
}
