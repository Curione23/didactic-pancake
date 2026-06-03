package org.lwjgl.system.linux.liburing;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/system/linux/liburing/IOURingSyncCancelReg.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/system/linux/liburing/IOURingSyncCancelReg.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/system/linux/liburing/IOURingSyncCancelReg.class */
@org.lwjgl.system.NativeType("struct io_uring_sync_cancel_reg")
public class IOURingSyncCancelReg extends org.lwjgl.system.Struct<org.lwjgl.system.linux.liburing.IOURingSyncCancelReg> implements org.lwjgl.system.NativeResource {
    public static final int SIZEOF = 0;
    public static final int ALIGNOF = 0;
    public static final int ADDR = 0;
    public static final int FD = 0;
    public static final int FLAGS = 0;
    public static final int TIMEOUT = 0;
    public static final int PAD = 0;

    /* JADX WARN: Classes with same name are omitted, all sources:
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/system/linux/liburing/IOURingSyncCancelReg$Buffer.class
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/system/linux/liburing/IOURingSyncCancelReg$Buffer.class
     */
    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/system/linux/liburing/IOURingSyncCancelReg$Buffer.class */
    public static class Buffer extends org.lwjgl.system.StructBuffer<org.lwjgl.system.linux.liburing.IOURingSyncCancelReg, org.lwjgl.system.linux.liburing.IOURingSyncCancelReg.Buffer> implements org.lwjgl.system.NativeResource {
        private static final org.lwjgl.system.linux.liburing.IOURingSyncCancelReg ELEMENT_FACTORY = null;

        public Buffer(java.nio.ByteBuffer r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r6
                int r2 = r2.remaining()
                int r3 = org.lwjgl.system.linux.liburing.IOURingSyncCancelReg.SIZEOF
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
        protected org.lwjgl.system.linux.liburing.IOURingSyncCancelReg.Buffer self() {
                r2 = this;
                r0 = r2
                return r0
        }

        @Override // org.lwjgl.system.StructBuffer
        protected org.lwjgl.system.linux.liburing.IOURingSyncCancelReg getElementFactory() {
                r2 = this;
                org.lwjgl.system.linux.liburing.IOURingSyncCancelReg r0 = org.lwjgl.system.linux.liburing.IOURingSyncCancelReg.Buffer.ELEMENT_FACTORY
                return r0
        }

        @org.lwjgl.system.NativeType("__u64")
        public long addr() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                long r0 = org.lwjgl.system.linux.liburing.IOURingSyncCancelReg.naddr(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("__s32")
        public int fd() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.system.linux.liburing.IOURingSyncCancelReg.nfd(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("__u32")
        public int flags() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.system.linux.liburing.IOURingSyncCancelReg.nflags(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("struct __kernel_timespec")
        public org.lwjgl.system.linux.KernelTimespec timeout() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                org.lwjgl.system.linux.KernelTimespec r0 = org.lwjgl.system.linux.liburing.IOURingSyncCancelReg.ntimeout(r0)
                return r0
        }

        public org.lwjgl.system.linux.liburing.IOURingSyncCancelReg.Buffer addr(@org.lwjgl.system.NativeType("__u64") long r6) {
                r5 = this;
                r0 = r5
                long r0 = r0.address()
                r1 = r6
                org.lwjgl.system.linux.liburing.IOURingSyncCancelReg.naddr(r0, r1)
                r0 = r5
                return r0
        }

        public org.lwjgl.system.linux.liburing.IOURingSyncCancelReg.Buffer fd(@org.lwjgl.system.NativeType("__s32") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.system.linux.liburing.IOURingSyncCancelReg.nfd(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.system.linux.liburing.IOURingSyncCancelReg.Buffer flags(@org.lwjgl.system.NativeType("__u32") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.system.linux.liburing.IOURingSyncCancelReg.nflags(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.system.linux.liburing.IOURingSyncCancelReg.Buffer timeout(@org.lwjgl.system.NativeType("struct __kernel_timespec") org.lwjgl.system.linux.KernelTimespec r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.system.linux.liburing.IOURingSyncCancelReg.ntimeout(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.system.linux.liburing.IOURingSyncCancelReg.Buffer timeout(java.util.function.Consumer<org.lwjgl.system.linux.KernelTimespec> r4) {
                r3 = this;
                r0 = r4
                r1 = r3
                org.lwjgl.system.linux.KernelTimespec r1 = r1.timeout()
                r0.accept(r1)
                r0 = r3
                return r0
        }

        @Override // org.lwjgl.system.StructBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.Struct getElementFactory() {
                r2 = this;
                r0 = r2
                org.lwjgl.system.linux.liburing.IOURingSyncCancelReg r0 = r0.getElementFactory()
                return r0
        }

        @Override // org.lwjgl.system.CustomBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.CustomBuffer self() {
                r2 = this;
                r0 = r2
                org.lwjgl.system.linux.liburing.IOURingSyncCancelReg$Buffer r0 = r0.self()
                return r0
        }

        static {
                r0 = -1
                org.lwjgl.system.linux.liburing.IOURingSyncCancelReg r0 = org.lwjgl.system.linux.liburing.IOURingSyncCancelReg.create(r0)
                org.lwjgl.system.linux.liburing.IOURingSyncCancelReg.Buffer.ELEMENT_FACTORY = r0
                return
        }
    }

    protected IOURingSyncCancelReg(long r6, @javax.annotation.Nullable java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    protected org.lwjgl.system.linux.liburing.IOURingSyncCancelReg create(long r7, @javax.annotation.Nullable java.nio.ByteBuffer r9) {
            r6 = this;
            org.lwjgl.system.linux.liburing.IOURingSyncCancelReg r0 = new org.lwjgl.system.linux.liburing.IOURingSyncCancelReg
            r1 = r0
            r2 = r7
            r3 = r9
            r1.<init>(r2, r3)
            return r0
    }

    public IOURingSyncCancelReg(java.nio.ByteBuffer r7) {
            r6 = this;
            r0 = r6
            r1 = r7
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            r2 = r7
            int r3 = org.lwjgl.system.linux.liburing.IOURingSyncCancelReg.SIZEOF
            java.nio.ByteBuffer r2 = __checkContainer(r2, r3)
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
            r2 = this;
            int r0 = org.lwjgl.system.linux.liburing.IOURingSyncCancelReg.SIZEOF
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

    @org.lwjgl.system.NativeType("__s32")
    public int fd() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nfd(r0)
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

    @org.lwjgl.system.NativeType("struct __kernel_timespec")
    public org.lwjgl.system.linux.KernelTimespec timeout() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            org.lwjgl.system.linux.KernelTimespec r0 = ntimeout(r0)
            return r0
    }

    public org.lwjgl.system.linux.liburing.IOURingSyncCancelReg addr(@org.lwjgl.system.NativeType("__u64") long r6) {
            r5 = this;
            r0 = r5
            long r0 = r0.address()
            r1 = r6
            naddr(r0, r1)
            r0 = r5
            return r0
    }

    public org.lwjgl.system.linux.liburing.IOURingSyncCancelReg fd(@org.lwjgl.system.NativeType("__s32") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nfd(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.system.linux.liburing.IOURingSyncCancelReg flags(@org.lwjgl.system.NativeType("__u32") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nflags(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.system.linux.liburing.IOURingSyncCancelReg timeout(@org.lwjgl.system.NativeType("struct __kernel_timespec") org.lwjgl.system.linux.KernelTimespec r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            ntimeout(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.system.linux.liburing.IOURingSyncCancelReg timeout(java.util.function.Consumer<org.lwjgl.system.linux.KernelTimespec> r4) {
            r3 = this;
            r0 = r4
            r1 = r3
            org.lwjgl.system.linux.KernelTimespec r1 = r1.timeout()
            r0.accept(r1)
            r0 = r3
            return r0
    }

    public org.lwjgl.system.linux.liburing.IOURingSyncCancelReg set(long r5, int r7, int r8, org.lwjgl.system.linux.KernelTimespec r9) {
            r4 = this;
            r0 = r4
            r1 = r5
            org.lwjgl.system.linux.liburing.IOURingSyncCancelReg r0 = r0.addr(r1)
            r0 = r4
            r1 = r7
            org.lwjgl.system.linux.liburing.IOURingSyncCancelReg r0 = r0.fd(r1)
            r0 = r4
            r1 = r8
            org.lwjgl.system.linux.liburing.IOURingSyncCancelReg r0 = r0.flags(r1)
            r0 = r4
            r1 = r9
            org.lwjgl.system.linux.liburing.IOURingSyncCancelReg r0 = r0.timeout(r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.system.linux.liburing.IOURingSyncCancelReg set(org.lwjgl.system.linux.liburing.IOURingSyncCancelReg r7) {
            r6 = this;
            r0 = r7
            long r0 = r0.address()
            r1 = r6
            long r1 = r1.address()
            int r2 = org.lwjgl.system.linux.liburing.IOURingSyncCancelReg.SIZEOF
            org.lwjgl.system.MemoryUtil.memCopy(r0, r1, r2)
            r0 = r6
            return r0
    }

    public static org.lwjgl.system.linux.liburing.IOURingSyncCancelReg malloc() {
            org.lwjgl.system.linux.liburing.IOURingSyncCancelReg r0 = new org.lwjgl.system.linux.liburing.IOURingSyncCancelReg
            r1 = r0
            int r2 = org.lwjgl.system.linux.liburing.IOURingSyncCancelReg.SIZEOF
            long r2 = (long) r2
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.system.linux.liburing.IOURingSyncCancelReg calloc() {
            org.lwjgl.system.linux.liburing.IOURingSyncCancelReg r0 = new org.lwjgl.system.linux.liburing.IOURingSyncCancelReg
            r1 = r0
            r2 = 1
            int r3 = org.lwjgl.system.linux.liburing.IOURingSyncCancelReg.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.system.linux.liburing.IOURingSyncCancelReg create() {
            int r0 = org.lwjgl.system.linux.liburing.IOURingSyncCancelReg.SIZEOF
            java.nio.ByteBuffer r0 = org.lwjgl.BufferUtils.createByteBuffer(r0)
            r6 = r0
            org.lwjgl.system.linux.liburing.IOURingSyncCancelReg r0 = new org.lwjgl.system.linux.liburing.IOURingSyncCancelReg
            r1 = r0
            r2 = r6
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.system.linux.liburing.IOURingSyncCancelReg create(long r6) {
            org.lwjgl.system.linux.liburing.IOURingSyncCancelReg r0 = new org.lwjgl.system.linux.liburing.IOURingSyncCancelReg
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.system.linux.liburing.IOURingSyncCancelReg createSafe(long r6) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.system.linux.liburing.IOURingSyncCancelReg r0 = new org.lwjgl.system.linux.liburing.IOURingSyncCancelReg
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static org.lwjgl.system.linux.liburing.IOURingSyncCancelReg.Buffer malloc(int r6) {
            org.lwjgl.system.linux.liburing.IOURingSyncCancelReg$Buffer r0 = new org.lwjgl.system.linux.liburing.IOURingSyncCancelReg$Buffer
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.system.linux.liburing.IOURingSyncCancelReg.SIZEOF
            long r2 = __checkMalloc(r2, r3)
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.system.linux.liburing.IOURingSyncCancelReg.Buffer calloc(int r7) {
            org.lwjgl.system.linux.liburing.IOURingSyncCancelReg$Buffer r0 = new org.lwjgl.system.linux.liburing.IOURingSyncCancelReg$Buffer
            r1 = r0
            r2 = r7
            long r2 = (long) r2
            int r3 = org.lwjgl.system.linux.liburing.IOURingSyncCancelReg.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.system.linux.liburing.IOURingSyncCancelReg.Buffer create(int r10) {
            r0 = r10
            int r1 = org.lwjgl.system.linux.liburing.IOURingSyncCancelReg.SIZEOF
            java.nio.ByteBuffer r0 = __create(r0, r1)
            r11 = r0
            org.lwjgl.system.linux.liburing.IOURingSyncCancelReg$Buffer r0 = new org.lwjgl.system.linux.liburing.IOURingSyncCancelReg$Buffer
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

    public static org.lwjgl.system.linux.liburing.IOURingSyncCancelReg.Buffer create(long r6, int r8) {
            org.lwjgl.system.linux.liburing.IOURingSyncCancelReg$Buffer r0 = new org.lwjgl.system.linux.liburing.IOURingSyncCancelReg$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.system.linux.liburing.IOURingSyncCancelReg.Buffer createSafe(long r6, int r8) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.system.linux.liburing.IOURingSyncCancelReg$Buffer r0 = new org.lwjgl.system.linux.liburing.IOURingSyncCancelReg$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static org.lwjgl.system.linux.liburing.IOURingSyncCancelReg malloc(org.lwjgl.system.MemoryStack r6) {
            org.lwjgl.system.linux.liburing.IOURingSyncCancelReg r0 = new org.lwjgl.system.linux.liburing.IOURingSyncCancelReg
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.system.linux.liburing.IOURingSyncCancelReg.ALIGNOF
            int r4 = org.lwjgl.system.linux.liburing.IOURingSyncCancelReg.SIZEOF
            long r2 = r2.nmalloc(r3, r4)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.system.linux.liburing.IOURingSyncCancelReg calloc(org.lwjgl.system.MemoryStack r7) {
            org.lwjgl.system.linux.liburing.IOURingSyncCancelReg r0 = new org.lwjgl.system.linux.liburing.IOURingSyncCancelReg
            r1 = r0
            r2 = r7
            int r3 = org.lwjgl.system.linux.liburing.IOURingSyncCancelReg.ALIGNOF
            r4 = 1
            int r5 = org.lwjgl.system.linux.liburing.IOURingSyncCancelReg.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.system.linux.liburing.IOURingSyncCancelReg.Buffer malloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.system.linux.liburing.IOURingSyncCancelReg$Buffer r0 = new org.lwjgl.system.linux.liburing.IOURingSyncCancelReg$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.system.linux.liburing.IOURingSyncCancelReg.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.system.linux.liburing.IOURingSyncCancelReg.SIZEOF
            int r4 = r4 * r5
            long r2 = r2.nmalloc(r3, r4)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.system.linux.liburing.IOURingSyncCancelReg.Buffer calloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.system.linux.liburing.IOURingSyncCancelReg$Buffer r0 = new org.lwjgl.system.linux.liburing.IOURingSyncCancelReg$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.system.linux.liburing.IOURingSyncCancelReg.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.system.linux.liburing.IOURingSyncCancelReg.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static long naddr(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.system.linux.liburing.IOURingSyncCancelReg.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.system.linux.liburing.IOURingSyncCancelReg.ADDR
            long r3 = (long) r3
            long r2 = r2 + r3
            long r0 = r0.getLong(r1, r2)
            return r0
    }

    public static int nfd(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.system.linux.liburing.IOURingSyncCancelReg.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.system.linux.liburing.IOURingSyncCancelReg.FD
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int nflags(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.system.linux.liburing.IOURingSyncCancelReg.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.system.linux.liburing.IOURingSyncCancelReg.FLAGS
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static org.lwjgl.system.linux.KernelTimespec ntimeout(long r5) {
            r0 = r5
            int r1 = org.lwjgl.system.linux.liburing.IOURingSyncCancelReg.TIMEOUT
            long r1 = (long) r1
            long r0 = r0 + r1
            org.lwjgl.system.linux.KernelTimespec r0 = org.lwjgl.system.linux.KernelTimespec.create(r0)
            return r0
    }

    public static java.nio.LongBuffer npad(long r5) {
            r0 = r5
            int r1 = org.lwjgl.system.linux.liburing.IOURingSyncCancelReg.PAD
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = 4
            java.nio.LongBuffer r0 = org.lwjgl.system.MemoryUtil.memLongBuffer(r0, r1)
            return r0
    }

    public static long npad(long r9, int r11) {
            sun.misc.Unsafe r0 = org.lwjgl.system.linux.liburing.IOURingSyncCancelReg.UNSAFE
            r1 = 0
            r2 = r9
            int r3 = org.lwjgl.system.linux.liburing.IOURingSyncCancelReg.PAD
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r11
            r4 = 4
            long r3 = org.lwjgl.system.Checks.check(r3, r4)
            r4 = 8
            long r3 = r3 * r4
            long r2 = r2 + r3
            long r0 = r0.getLong(r1, r2)
            return r0
    }

    public static void naddr(long r7, long r9) {
            sun.misc.Unsafe r0 = org.lwjgl.system.linux.liburing.IOURingSyncCancelReg.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.system.linux.liburing.IOURingSyncCancelReg.ADDR
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putLong(r1, r2, r3)
            return
    }

    public static void nfd(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.system.linux.liburing.IOURingSyncCancelReg.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.system.linux.liburing.IOURingSyncCancelReg.FD
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void nflags(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.system.linux.liburing.IOURingSyncCancelReg.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.system.linux.liburing.IOURingSyncCancelReg.FLAGS
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void ntimeout(long r7, org.lwjgl.system.linux.KernelTimespec r9) {
            r0 = r9
            long r0 = r0.address()
            r1 = r7
            int r2 = org.lwjgl.system.linux.liburing.IOURingSyncCancelReg.TIMEOUT
            long r2 = (long) r2
            long r1 = r1 + r2
            int r2 = org.lwjgl.system.linux.KernelTimespec.SIZEOF
            org.lwjgl.system.MemoryUtil.memCopy(r0, r1, r2)
            return
    }

    public static void npad(long r7, java.nio.LongBuffer r9) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r9
            r1 = 4
            org.lwjgl.system.Checks.checkGT(r0, r1)
        Lb:
            r0 = r9
            long r0 = org.lwjgl.system.MemoryUtil.memAddress(r0)
            r1 = r7
            int r2 = org.lwjgl.system.linux.liburing.IOURingSyncCancelReg.PAD
            long r2 = (long) r2
            long r1 = r1 + r2
            r2 = r9
            int r2 = r2.remaining()
            r3 = 8
            int r2 = r2 * r3
            org.lwjgl.system.MemoryUtil.memCopy(r0, r1, r2)
            return
    }

    public static void npad(long r9, int r11, long r12) {
            sun.misc.Unsafe r0 = org.lwjgl.system.linux.liburing.IOURingSyncCancelReg.UNSAFE
            r1 = 0
            r2 = r9
            int r3 = org.lwjgl.system.linux.liburing.IOURingSyncCancelReg.PAD
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r11
            r4 = 4
            long r3 = org.lwjgl.system.Checks.check(r3, r4)
            r4 = 8
            long r3 = r3 * r4
            long r2 = r2 + r3
            r3 = r12
            r0.putLong(r1, r2, r3)
            return
    }

    @Override // org.lwjgl.system.Struct
    protected /* bridge */ /* synthetic */ org.lwjgl.system.Struct create(long r6, @javax.annotation.Nullable java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            org.lwjgl.system.linux.liburing.IOURingSyncCancelReg r0 = r0.create(r1, r2)
            return r0
    }

    static {
            r0 = 5
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
            r3 = 4
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 3
            int r3 = org.lwjgl.system.linux.KernelTimespec.SIZEOF
            int r4 = org.lwjgl.system.linux.KernelTimespec.ALIGNOF
            org.lwjgl.system.Struct$Member r3 = __member(r3, r4)
            r1[r2] = r3
            r1 = r0
            r2 = 4
            r3 = 8
            r4 = 4
            org.lwjgl.system.Struct$Member r3 = __array(r3, r4)
            r1[r2] = r3
            org.lwjgl.system.Struct$Layout r0 = __struct(r0)
            r6 = r0
            r0 = r6
            int r0 = r0.getSize()
            org.lwjgl.system.linux.liburing.IOURingSyncCancelReg.SIZEOF = r0
            r0 = r6
            int r0 = r0.getAlignment()
            org.lwjgl.system.linux.liburing.IOURingSyncCancelReg.ALIGNOF = r0
            r0 = r6
            r1 = 0
            int r0 = r0.offsetof(r1)
            org.lwjgl.system.linux.liburing.IOURingSyncCancelReg.ADDR = r0
            r0 = r6
            r1 = 1
            int r0 = r0.offsetof(r1)
            org.lwjgl.system.linux.liburing.IOURingSyncCancelReg.FD = r0
            r0 = r6
            r1 = 2
            int r0 = r0.offsetof(r1)
            org.lwjgl.system.linux.liburing.IOURingSyncCancelReg.FLAGS = r0
            r0 = r6
            r1 = 3
            int r0 = r0.offsetof(r1)
            org.lwjgl.system.linux.liburing.IOURingSyncCancelReg.TIMEOUT = r0
            r0 = r6
            r1 = 4
            int r0 = r0.offsetof(r1)
            org.lwjgl.system.linux.liburing.IOURingSyncCancelReg.PAD = r0
            return
    }
}
