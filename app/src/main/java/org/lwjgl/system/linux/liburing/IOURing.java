package org.lwjgl.system.linux.liburing;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/system/linux/liburing/IOURing.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/system/linux/liburing/IOURing.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/system/linux/liburing/IOURing.class */
@org.lwjgl.system.NativeType("struct io_uring")
public class IOURing extends org.lwjgl.system.Struct<org.lwjgl.system.linux.liburing.IOURing> implements org.lwjgl.system.NativeResource {
    public static final int SIZEOF = 0;
    public static final int ALIGNOF = 0;
    public static final int SQ = 0;
    public static final int CQ = 0;
    public static final int FLAGS = 0;
    public static final int RING_FD = 0;
    public static final int FEATURES = 0;
    public static final int ENTER_RING_FD = 0;
    public static final int INT_FLAGS = 0;
    public static final int PAD = 0;
    public static final int PAD2 = 0;

    /* JADX WARN: Classes with same name are omitted, all sources:
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/system/linux/liburing/IOURing$Buffer.class
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/system/linux/liburing/IOURing$Buffer.class
     */
    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/system/linux/liburing/IOURing$Buffer.class */
    public static class Buffer extends org.lwjgl.system.StructBuffer<org.lwjgl.system.linux.liburing.IOURing, org.lwjgl.system.linux.liburing.IOURing.Buffer> implements org.lwjgl.system.NativeResource {
        private static final org.lwjgl.system.linux.liburing.IOURing ELEMENT_FACTORY = null;

        public Buffer(java.nio.ByteBuffer r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r6
                int r2 = r2.remaining()
                int r3 = org.lwjgl.system.linux.liburing.IOURing.SIZEOF
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
        protected org.lwjgl.system.linux.liburing.IOURing.Buffer self() {
                r2 = this;
                r0 = r2
                return r0
        }

        @Override // org.lwjgl.system.StructBuffer
        protected org.lwjgl.system.linux.liburing.IOURing getElementFactory() {
                r2 = this;
                org.lwjgl.system.linux.liburing.IOURing r0 = org.lwjgl.system.linux.liburing.IOURing.Buffer.ELEMENT_FACTORY
                return r0
        }

        @org.lwjgl.system.NativeType("struct io_uring_sq")
        public org.lwjgl.system.linux.liburing.IOURingSQ sq() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                org.lwjgl.system.linux.liburing.IOURingSQ r0 = org.lwjgl.system.linux.liburing.IOURing.nsq(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("struct io_uring_cq")
        public org.lwjgl.system.linux.liburing.IOURingCQ cq() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                org.lwjgl.system.linux.liburing.IOURingCQ r0 = org.lwjgl.system.linux.liburing.IOURing.ncq(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("unsigned int")
        public int flags() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.system.linux.liburing.IOURing.nflags(r0)
                return r0
        }

        public int ring_fd() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.system.linux.liburing.IOURing.nring_fd(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("unsigned int")
        public int features() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.system.linux.liburing.IOURing.nfeatures(r0)
                return r0
        }

        public int enter_ring_fd() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.system.linux.liburing.IOURing.nenter_ring_fd(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("__u8")
        public byte int_flags() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                byte r0 = org.lwjgl.system.linux.liburing.IOURing.nint_flags(r0)
                return r0
        }

        public org.lwjgl.system.linux.liburing.IOURing.Buffer sq(@org.lwjgl.system.NativeType("struct io_uring_sq") org.lwjgl.system.linux.liburing.IOURingSQ r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.system.linux.liburing.IOURing.nsq(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.system.linux.liburing.IOURing.Buffer sq(java.util.function.Consumer<org.lwjgl.system.linux.liburing.IOURingSQ> r4) {
                r3 = this;
                r0 = r4
                r1 = r3
                org.lwjgl.system.linux.liburing.IOURingSQ r1 = r1.sq()
                r0.accept(r1)
                r0 = r3
                return r0
        }

        public org.lwjgl.system.linux.liburing.IOURing.Buffer cq(@org.lwjgl.system.NativeType("struct io_uring_cq") org.lwjgl.system.linux.liburing.IOURingCQ r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.system.linux.liburing.IOURing.ncq(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.system.linux.liburing.IOURing.Buffer cq(java.util.function.Consumer<org.lwjgl.system.linux.liburing.IOURingCQ> r4) {
                r3 = this;
                r0 = r4
                r1 = r3
                org.lwjgl.system.linux.liburing.IOURingCQ r1 = r1.cq()
                r0.accept(r1)
                r0 = r3
                return r0
        }

        public org.lwjgl.system.linux.liburing.IOURing.Buffer flags(@org.lwjgl.system.NativeType("unsigned int") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.system.linux.liburing.IOURing.nflags(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.system.linux.liburing.IOURing.Buffer ring_fd(int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.system.linux.liburing.IOURing.nring_fd(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.system.linux.liburing.IOURing.Buffer features(@org.lwjgl.system.NativeType("unsigned int") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.system.linux.liburing.IOURing.nfeatures(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.system.linux.liburing.IOURing.Buffer enter_ring_fd(int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.system.linux.liburing.IOURing.nenter_ring_fd(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.system.linux.liburing.IOURing.Buffer int_flags(@org.lwjgl.system.NativeType("__u8") byte r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.system.linux.liburing.IOURing.nint_flags(r0, r1)
                r0 = r4
                return r0
        }

        @Override // org.lwjgl.system.StructBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.Struct getElementFactory() {
                r2 = this;
                r0 = r2
                org.lwjgl.system.linux.liburing.IOURing r0 = r0.getElementFactory()
                return r0
        }

        @Override // org.lwjgl.system.CustomBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.CustomBuffer self() {
                r2 = this;
                r0 = r2
                org.lwjgl.system.linux.liburing.IOURing$Buffer r0 = r0.self()
                return r0
        }

        static {
                r0 = -1
                org.lwjgl.system.linux.liburing.IOURing r0 = org.lwjgl.system.linux.liburing.IOURing.create(r0)
                org.lwjgl.system.linux.liburing.IOURing.Buffer.ELEMENT_FACTORY = r0
                return
        }
    }

    protected IOURing(long r6, @javax.annotation.Nullable java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    protected org.lwjgl.system.linux.liburing.IOURing create(long r7, @javax.annotation.Nullable java.nio.ByteBuffer r9) {
            r6 = this;
            org.lwjgl.system.linux.liburing.IOURing r0 = new org.lwjgl.system.linux.liburing.IOURing
            r1 = r0
            r2 = r7
            r3 = r9
            r1.<init>(r2, r3)
            return r0
    }

    public IOURing(java.nio.ByteBuffer r7) {
            r6 = this;
            r0 = r6
            r1 = r7
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            r2 = r7
            int r3 = org.lwjgl.system.linux.liburing.IOURing.SIZEOF
            java.nio.ByteBuffer r2 = __checkContainer(r2, r3)
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
            r2 = this;
            int r0 = org.lwjgl.system.linux.liburing.IOURing.SIZEOF
            return r0
    }

    @org.lwjgl.system.NativeType("struct io_uring_sq")
    public org.lwjgl.system.linux.liburing.IOURingSQ sq() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            org.lwjgl.system.linux.liburing.IOURingSQ r0 = nsq(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("struct io_uring_cq")
    public org.lwjgl.system.linux.liburing.IOURingCQ cq() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            org.lwjgl.system.linux.liburing.IOURingCQ r0 = ncq(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("unsigned int")
    public int flags() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nflags(r0)
            return r0
    }

    public int ring_fd() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nring_fd(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("unsigned int")
    public int features() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nfeatures(r0)
            return r0
    }

    public int enter_ring_fd() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nenter_ring_fd(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("__u8")
    public byte int_flags() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            byte r0 = nint_flags(r0)
            return r0
    }

    public org.lwjgl.system.linux.liburing.IOURing sq(@org.lwjgl.system.NativeType("struct io_uring_sq") org.lwjgl.system.linux.liburing.IOURingSQ r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nsq(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.system.linux.liburing.IOURing sq(java.util.function.Consumer<org.lwjgl.system.linux.liburing.IOURingSQ> r4) {
            r3 = this;
            r0 = r4
            r1 = r3
            org.lwjgl.system.linux.liburing.IOURingSQ r1 = r1.sq()
            r0.accept(r1)
            r0 = r3
            return r0
    }

    public org.lwjgl.system.linux.liburing.IOURing cq(@org.lwjgl.system.NativeType("struct io_uring_cq") org.lwjgl.system.linux.liburing.IOURingCQ r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            ncq(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.system.linux.liburing.IOURing cq(java.util.function.Consumer<org.lwjgl.system.linux.liburing.IOURingCQ> r4) {
            r3 = this;
            r0 = r4
            r1 = r3
            org.lwjgl.system.linux.liburing.IOURingCQ r1 = r1.cq()
            r0.accept(r1)
            r0 = r3
            return r0
    }

    public org.lwjgl.system.linux.liburing.IOURing flags(@org.lwjgl.system.NativeType("unsigned int") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nflags(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.system.linux.liburing.IOURing ring_fd(int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nring_fd(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.system.linux.liburing.IOURing features(@org.lwjgl.system.NativeType("unsigned int") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nfeatures(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.system.linux.liburing.IOURing enter_ring_fd(int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nenter_ring_fd(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.system.linux.liburing.IOURing int_flags(@org.lwjgl.system.NativeType("__u8") byte r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nint_flags(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.system.linux.liburing.IOURing set(org.lwjgl.system.linux.liburing.IOURingSQ r4, org.lwjgl.system.linux.liburing.IOURingCQ r5, int r6, int r7, int r8, int r9, byte r10) {
            r3 = this;
            r0 = r3
            r1 = r4
            org.lwjgl.system.linux.liburing.IOURing r0 = r0.sq(r1)
            r0 = r3
            r1 = r5
            org.lwjgl.system.linux.liburing.IOURing r0 = r0.cq(r1)
            r0 = r3
            r1 = r6
            org.lwjgl.system.linux.liburing.IOURing r0 = r0.flags(r1)
            r0 = r3
            r1 = r7
            org.lwjgl.system.linux.liburing.IOURing r0 = r0.ring_fd(r1)
            r0 = r3
            r1 = r8
            org.lwjgl.system.linux.liburing.IOURing r0 = r0.features(r1)
            r0 = r3
            r1 = r9
            org.lwjgl.system.linux.liburing.IOURing r0 = r0.enter_ring_fd(r1)
            r0 = r3
            r1 = r10
            org.lwjgl.system.linux.liburing.IOURing r0 = r0.int_flags(r1)
            r0 = r3
            return r0
    }

    public org.lwjgl.system.linux.liburing.IOURing set(org.lwjgl.system.linux.liburing.IOURing r7) {
            r6 = this;
            r0 = r7
            long r0 = r0.address()
            r1 = r6
            long r1 = r1.address()
            int r2 = org.lwjgl.system.linux.liburing.IOURing.SIZEOF
            org.lwjgl.system.MemoryUtil.memCopy(r0, r1, r2)
            r0 = r6
            return r0
    }

    public static org.lwjgl.system.linux.liburing.IOURing malloc() {
            org.lwjgl.system.linux.liburing.IOURing r0 = new org.lwjgl.system.linux.liburing.IOURing
            r1 = r0
            int r2 = org.lwjgl.system.linux.liburing.IOURing.SIZEOF
            long r2 = (long) r2
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.system.linux.liburing.IOURing calloc() {
            org.lwjgl.system.linux.liburing.IOURing r0 = new org.lwjgl.system.linux.liburing.IOURing
            r1 = r0
            r2 = 1
            int r3 = org.lwjgl.system.linux.liburing.IOURing.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.system.linux.liburing.IOURing create() {
            int r0 = org.lwjgl.system.linux.liburing.IOURing.SIZEOF
            java.nio.ByteBuffer r0 = org.lwjgl.BufferUtils.createByteBuffer(r0)
            r6 = r0
            org.lwjgl.system.linux.liburing.IOURing r0 = new org.lwjgl.system.linux.liburing.IOURing
            r1 = r0
            r2 = r6
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.system.linux.liburing.IOURing create(long r6) {
            org.lwjgl.system.linux.liburing.IOURing r0 = new org.lwjgl.system.linux.liburing.IOURing
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.system.linux.liburing.IOURing createSafe(long r6) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.system.linux.liburing.IOURing r0 = new org.lwjgl.system.linux.liburing.IOURing
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static org.lwjgl.system.linux.liburing.IOURing.Buffer malloc(int r6) {
            org.lwjgl.system.linux.liburing.IOURing$Buffer r0 = new org.lwjgl.system.linux.liburing.IOURing$Buffer
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.system.linux.liburing.IOURing.SIZEOF
            long r2 = __checkMalloc(r2, r3)
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.system.linux.liburing.IOURing.Buffer calloc(int r7) {
            org.lwjgl.system.linux.liburing.IOURing$Buffer r0 = new org.lwjgl.system.linux.liburing.IOURing$Buffer
            r1 = r0
            r2 = r7
            long r2 = (long) r2
            int r3 = org.lwjgl.system.linux.liburing.IOURing.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.system.linux.liburing.IOURing.Buffer create(int r10) {
            r0 = r10
            int r1 = org.lwjgl.system.linux.liburing.IOURing.SIZEOF
            java.nio.ByteBuffer r0 = __create(r0, r1)
            r11 = r0
            org.lwjgl.system.linux.liburing.IOURing$Buffer r0 = new org.lwjgl.system.linux.liburing.IOURing$Buffer
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

    public static org.lwjgl.system.linux.liburing.IOURing.Buffer create(long r6, int r8) {
            org.lwjgl.system.linux.liburing.IOURing$Buffer r0 = new org.lwjgl.system.linux.liburing.IOURing$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.system.linux.liburing.IOURing.Buffer createSafe(long r6, int r8) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.system.linux.liburing.IOURing$Buffer r0 = new org.lwjgl.system.linux.liburing.IOURing$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static org.lwjgl.system.linux.liburing.IOURing malloc(org.lwjgl.system.MemoryStack r6) {
            org.lwjgl.system.linux.liburing.IOURing r0 = new org.lwjgl.system.linux.liburing.IOURing
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.system.linux.liburing.IOURing.ALIGNOF
            int r4 = org.lwjgl.system.linux.liburing.IOURing.SIZEOF
            long r2 = r2.nmalloc(r3, r4)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.system.linux.liburing.IOURing calloc(org.lwjgl.system.MemoryStack r7) {
            org.lwjgl.system.linux.liburing.IOURing r0 = new org.lwjgl.system.linux.liburing.IOURing
            r1 = r0
            r2 = r7
            int r3 = org.lwjgl.system.linux.liburing.IOURing.ALIGNOF
            r4 = 1
            int r5 = org.lwjgl.system.linux.liburing.IOURing.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.system.linux.liburing.IOURing.Buffer malloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.system.linux.liburing.IOURing$Buffer r0 = new org.lwjgl.system.linux.liburing.IOURing$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.system.linux.liburing.IOURing.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.system.linux.liburing.IOURing.SIZEOF
            int r4 = r4 * r5
            long r2 = r2.nmalloc(r3, r4)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.system.linux.liburing.IOURing.Buffer calloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.system.linux.liburing.IOURing$Buffer r0 = new org.lwjgl.system.linux.liburing.IOURing$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.system.linux.liburing.IOURing.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.system.linux.liburing.IOURing.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.system.linux.liburing.IOURingSQ nsq(long r5) {
            r0 = r5
            int r1 = org.lwjgl.system.linux.liburing.IOURing.SQ
            long r1 = (long) r1
            long r0 = r0 + r1
            org.lwjgl.system.linux.liburing.IOURingSQ r0 = org.lwjgl.system.linux.liburing.IOURingSQ.create(r0)
            return r0
    }

    public static org.lwjgl.system.linux.liburing.IOURingCQ ncq(long r5) {
            r0 = r5
            int r1 = org.lwjgl.system.linux.liburing.IOURing.CQ
            long r1 = (long) r1
            long r0 = r0 + r1
            org.lwjgl.system.linux.liburing.IOURingCQ r0 = org.lwjgl.system.linux.liburing.IOURingCQ.create(r0)
            return r0
    }

    public static int nflags(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.system.linux.liburing.IOURing.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.system.linux.liburing.IOURing.FLAGS
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int nring_fd(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.system.linux.liburing.IOURing.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.system.linux.liburing.IOURing.RING_FD
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int nfeatures(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.system.linux.liburing.IOURing.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.system.linux.liburing.IOURing.FEATURES
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int nenter_ring_fd(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.system.linux.liburing.IOURing.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.system.linux.liburing.IOURing.ENTER_RING_FD
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static byte nint_flags(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.system.linux.liburing.IOURing.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.system.linux.liburing.IOURing.INT_FLAGS
            long r3 = (long) r3
            long r2 = r2 + r3
            byte r0 = r0.getByte(r1, r2)
            return r0
    }

    public static java.nio.ByteBuffer npad(long r5) {
            r0 = r5
            int r1 = org.lwjgl.system.linux.liburing.IOURing.PAD
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = 3
            java.nio.ByteBuffer r0 = org.lwjgl.system.MemoryUtil.memByteBuffer(r0, r1)
            return r0
    }

    public static byte npad(long r9, int r11) {
            sun.misc.Unsafe r0 = org.lwjgl.system.linux.liburing.IOURing.UNSAFE
            r1 = 0
            r2 = r9
            int r3 = org.lwjgl.system.linux.liburing.IOURing.PAD
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r11
            r4 = 3
            long r3 = org.lwjgl.system.Checks.check(r3, r4)
            r4 = 1
            long r3 = r3 * r4
            long r2 = r2 + r3
            byte r0 = r0.getByte(r1, r2)
            return r0
    }

    public static int npad2(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.system.linux.liburing.IOURing.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.system.linux.liburing.IOURing.PAD2
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static void nsq(long r7, org.lwjgl.system.linux.liburing.IOURingSQ r9) {
            r0 = r9
            long r0 = r0.address()
            r1 = r7
            int r2 = org.lwjgl.system.linux.liburing.IOURing.SQ
            long r2 = (long) r2
            long r1 = r1 + r2
            int r2 = org.lwjgl.system.linux.liburing.IOURingSQ.SIZEOF
            org.lwjgl.system.MemoryUtil.memCopy(r0, r1, r2)
            return
    }

    public static void ncq(long r7, org.lwjgl.system.linux.liburing.IOURingCQ r9) {
            r0 = r9
            long r0 = r0.address()
            r1 = r7
            int r2 = org.lwjgl.system.linux.liburing.IOURing.CQ
            long r2 = (long) r2
            long r1 = r1 + r2
            int r2 = org.lwjgl.system.linux.liburing.IOURingCQ.SIZEOF
            org.lwjgl.system.MemoryUtil.memCopy(r0, r1, r2)
            return
    }

    public static void nflags(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.system.linux.liburing.IOURing.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.system.linux.liburing.IOURing.FLAGS
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void nring_fd(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.system.linux.liburing.IOURing.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.system.linux.liburing.IOURing.RING_FD
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void nfeatures(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.system.linux.liburing.IOURing.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.system.linux.liburing.IOURing.FEATURES
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void nenter_ring_fd(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.system.linux.liburing.IOURing.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.system.linux.liburing.IOURing.ENTER_RING_FD
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void nint_flags(long r7, byte r9) {
            sun.misc.Unsafe r0 = org.lwjgl.system.linux.liburing.IOURing.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.system.linux.liburing.IOURing.INT_FLAGS
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putByte(r1, r2, r3)
            return
    }

    public static void npad(long r7, java.nio.ByteBuffer r9) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r9
            r1 = 3
            org.lwjgl.system.Checks.checkGT(r0, r1)
        Lb:
            r0 = r9
            long r0 = org.lwjgl.system.MemoryUtil.memAddress(r0)
            r1 = r7
            int r2 = org.lwjgl.system.linux.liburing.IOURing.PAD
            long r2 = (long) r2
            long r1 = r1 + r2
            r2 = r9
            int r2 = r2.remaining()
            r3 = 1
            int r2 = r2 * r3
            org.lwjgl.system.MemoryUtil.memCopy(r0, r1, r2)
            return
    }

    public static void npad(long r9, int r11, byte r12) {
            sun.misc.Unsafe r0 = org.lwjgl.system.linux.liburing.IOURing.UNSAFE
            r1 = 0
            r2 = r9
            int r3 = org.lwjgl.system.linux.liburing.IOURing.PAD
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r11
            r4 = 3
            long r3 = org.lwjgl.system.Checks.check(r3, r4)
            r4 = 1
            long r3 = r3 * r4
            long r2 = r2 + r3
            r3 = r12
            r0.putByte(r1, r2, r3)
            return
    }

    public static void npad2(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.system.linux.liburing.IOURing.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.system.linux.liburing.IOURing.PAD2
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void validate(long r5) {
            r0 = r5
            int r1 = org.lwjgl.system.linux.liburing.IOURing.SQ
            long r1 = (long) r1
            long r0 = r0 + r1
            org.lwjgl.system.linux.liburing.IOURingSQ.validate(r0)
            r0 = r5
            int r1 = org.lwjgl.system.linux.liburing.IOURing.CQ
            long r1 = (long) r1
            long r0 = r0 + r1
            org.lwjgl.system.linux.liburing.IOURingCQ.validate(r0)
            return
    }

    @Override // org.lwjgl.system.Struct
    protected /* bridge */ /* synthetic */ org.lwjgl.system.Struct create(long r6, @javax.annotation.Nullable java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            org.lwjgl.system.linux.liburing.IOURing r0 = r0.create(r1, r2)
            return r0
    }

    static {
            r0 = 9
            org.lwjgl.system.Struct$Member[] r0 = new org.lwjgl.system.Struct.Member[r0]
            r1 = r0
            r2 = 0
            int r3 = org.lwjgl.system.linux.liburing.IOURingSQ.SIZEOF
            int r4 = org.lwjgl.system.linux.liburing.IOURingSQ.ALIGNOF
            org.lwjgl.system.Struct$Member r3 = __member(r3, r4)
            r1[r2] = r3
            r1 = r0
            r2 = 1
            int r3 = org.lwjgl.system.linux.liburing.IOURingCQ.SIZEOF
            int r4 = org.lwjgl.system.linux.liburing.IOURingCQ.ALIGNOF
            org.lwjgl.system.Struct$Member r3 = __member(r3, r4)
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
            r3 = 1
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 7
            r3 = 1
            r4 = 3
            org.lwjgl.system.Struct$Member r3 = __array(r3, r4)
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
            org.lwjgl.system.linux.liburing.IOURing.SIZEOF = r0
            r0 = r6
            int r0 = r0.getAlignment()
            org.lwjgl.system.linux.liburing.IOURing.ALIGNOF = r0
            r0 = r6
            r1 = 0
            int r0 = r0.offsetof(r1)
            org.lwjgl.system.linux.liburing.IOURing.SQ = r0
            r0 = r6
            r1 = 1
            int r0 = r0.offsetof(r1)
            org.lwjgl.system.linux.liburing.IOURing.CQ = r0
            r0 = r6
            r1 = 2
            int r0 = r0.offsetof(r1)
            org.lwjgl.system.linux.liburing.IOURing.FLAGS = r0
            r0 = r6
            r1 = 3
            int r0 = r0.offsetof(r1)
            org.lwjgl.system.linux.liburing.IOURing.RING_FD = r0
            r0 = r6
            r1 = 4
            int r0 = r0.offsetof(r1)
            org.lwjgl.system.linux.liburing.IOURing.FEATURES = r0
            r0 = r6
            r1 = 5
            int r0 = r0.offsetof(r1)
            org.lwjgl.system.linux.liburing.IOURing.ENTER_RING_FD = r0
            r0 = r6
            r1 = 6
            int r0 = r0.offsetof(r1)
            org.lwjgl.system.linux.liburing.IOURing.INT_FLAGS = r0
            r0 = r6
            r1 = 7
            int r0 = r0.offsetof(r1)
            org.lwjgl.system.linux.liburing.IOURing.PAD = r0
            r0 = r6
            r1 = 8
            int r0 = r0.offsetof(r1)
            org.lwjgl.system.linux.liburing.IOURing.PAD2 = r0
            return
    }
}
