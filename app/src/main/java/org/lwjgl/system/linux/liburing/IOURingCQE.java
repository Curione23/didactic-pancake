package org.lwjgl.system.linux.liburing;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/system/linux/liburing/IOURingCQE.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/system/linux/liburing/IOURingCQE.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/system/linux/liburing/IOURingCQE.class */
@org.lwjgl.system.NativeType("struct io_uring_cqe")
public class IOURingCQE extends org.lwjgl.system.Struct<org.lwjgl.system.linux.liburing.IOURingCQE> implements org.lwjgl.system.NativeResource {
    public static final int SIZEOF = 0;
    public static final int ALIGNOF = 0;
    public static final int USER_DATA = 0;
    public static final int RES = 0;
    public static final int FLAGS = 0;
    public static final int BIG_CQE = 0;

    /* JADX WARN: Classes with same name are omitted, all sources:
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/system/linux/liburing/IOURingCQE$Buffer.class
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/system/linux/liburing/IOURingCQE$Buffer.class
     */
    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/system/linux/liburing/IOURingCQE$Buffer.class */
    public static class Buffer extends org.lwjgl.system.StructBuffer<org.lwjgl.system.linux.liburing.IOURingCQE, org.lwjgl.system.linux.liburing.IOURingCQE.Buffer> implements org.lwjgl.system.NativeResource {
        private static final org.lwjgl.system.linux.liburing.IOURingCQE ELEMENT_FACTORY = null;

        public Buffer(java.nio.ByteBuffer r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r6
                int r2 = r2.remaining()
                int r3 = org.lwjgl.system.linux.liburing.IOURingCQE.SIZEOF
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
        protected org.lwjgl.system.linux.liburing.IOURingCQE.Buffer self() {
                r2 = this;
                r0 = r2
                return r0
        }

        @Override // org.lwjgl.system.StructBuffer
        protected org.lwjgl.system.linux.liburing.IOURingCQE getElementFactory() {
                r2 = this;
                org.lwjgl.system.linux.liburing.IOURingCQE r0 = org.lwjgl.system.linux.liburing.IOURingCQE.Buffer.ELEMENT_FACTORY
                return r0
        }

        @org.lwjgl.system.NativeType("__u64")
        public long user_data() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                long r0 = org.lwjgl.system.linux.liburing.IOURingCQE.nuser_data(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("__s32")
        public int res() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.system.linux.liburing.IOURingCQE.nres(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("__u32")
        public int flags() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.system.linux.liburing.IOURingCQE.nflags(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("__u64[0]")
        public java.nio.LongBuffer big_cqe() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                java.nio.LongBuffer r0 = org.lwjgl.system.linux.liburing.IOURingCQE.nbig_cqe(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("__u64")
        public long big_cqe(int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                long r0 = org.lwjgl.system.linux.liburing.IOURingCQE.nbig_cqe(r0, r1)
                return r0
        }

        public org.lwjgl.system.linux.liburing.IOURingCQE.Buffer user_data(@org.lwjgl.system.NativeType("__u64") long r6) {
                r5 = this;
                r0 = r5
                long r0 = r0.address()
                r1 = r6
                org.lwjgl.system.linux.liburing.IOURingCQE.nuser_data(r0, r1)
                r0 = r5
                return r0
        }

        public org.lwjgl.system.linux.liburing.IOURingCQE.Buffer res(@org.lwjgl.system.NativeType("__s32") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.system.linux.liburing.IOURingCQE.nres(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.system.linux.liburing.IOURingCQE.Buffer flags(@org.lwjgl.system.NativeType("__u32") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.system.linux.liburing.IOURingCQE.nflags(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.system.linux.liburing.IOURingCQE.Buffer big_cqe(@org.lwjgl.system.NativeType("__u64[0]") java.nio.LongBuffer r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.system.linux.liburing.IOURingCQE.nbig_cqe(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.system.linux.liburing.IOURingCQE.Buffer big_cqe(int r7, @org.lwjgl.system.NativeType("__u64") long r8) {
                r6 = this;
                r0 = r6
                long r0 = r0.address()
                r1 = r7
                r2 = r8
                org.lwjgl.system.linux.liburing.IOURingCQE.nbig_cqe(r0, r1, r2)
                r0 = r6
                return r0
        }

        @Override // org.lwjgl.system.StructBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.Struct getElementFactory() {
                r2 = this;
                r0 = r2
                org.lwjgl.system.linux.liburing.IOURingCQE r0 = r0.getElementFactory()
                return r0
        }

        @Override // org.lwjgl.system.CustomBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.CustomBuffer self() {
                r2 = this;
                r0 = r2
                org.lwjgl.system.linux.liburing.IOURingCQE$Buffer r0 = r0.self()
                return r0
        }

        static {
                r0 = -1
                org.lwjgl.system.linux.liburing.IOURingCQE r0 = org.lwjgl.system.linux.liburing.IOURingCQE.create(r0)
                org.lwjgl.system.linux.liburing.IOURingCQE.Buffer.ELEMENT_FACTORY = r0
                return
        }
    }

    protected IOURingCQE(long r6, @javax.annotation.Nullable java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    protected org.lwjgl.system.linux.liburing.IOURingCQE create(long r7, @javax.annotation.Nullable java.nio.ByteBuffer r9) {
            r6 = this;
            org.lwjgl.system.linux.liburing.IOURingCQE r0 = new org.lwjgl.system.linux.liburing.IOURingCQE
            r1 = r0
            r2 = r7
            r3 = r9
            r1.<init>(r2, r3)
            return r0
    }

    public IOURingCQE(java.nio.ByteBuffer r7) {
            r6 = this;
            r0 = r6
            r1 = r7
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            r2 = r7
            int r3 = org.lwjgl.system.linux.liburing.IOURingCQE.SIZEOF
            java.nio.ByteBuffer r2 = __checkContainer(r2, r3)
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
            r2 = this;
            int r0 = org.lwjgl.system.linux.liburing.IOURingCQE.SIZEOF
            return r0
    }

    @org.lwjgl.system.NativeType("__u64")
    public long user_data() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            long r0 = nuser_data(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("__s32")
    public int res() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nres(r0)
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

    @org.lwjgl.system.NativeType("__u64[0]")
    public java.nio.LongBuffer big_cqe() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            java.nio.LongBuffer r0 = nbig_cqe(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("__u64")
    public long big_cqe(int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            long r0 = nbig_cqe(r0, r1)
            return r0
    }

    public org.lwjgl.system.linux.liburing.IOURingCQE user_data(@org.lwjgl.system.NativeType("__u64") long r6) {
            r5 = this;
            r0 = r5
            long r0 = r0.address()
            r1 = r6
            nuser_data(r0, r1)
            r0 = r5
            return r0
    }

    public org.lwjgl.system.linux.liburing.IOURingCQE res(@org.lwjgl.system.NativeType("__s32") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nres(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.system.linux.liburing.IOURingCQE flags(@org.lwjgl.system.NativeType("__u32") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nflags(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.system.linux.liburing.IOURingCQE big_cqe(@org.lwjgl.system.NativeType("__u64[0]") java.nio.LongBuffer r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nbig_cqe(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.system.linux.liburing.IOURingCQE big_cqe(int r7, @org.lwjgl.system.NativeType("__u64") long r8) {
            r6 = this;
            r0 = r6
            long r0 = r0.address()
            r1 = r7
            r2 = r8
            nbig_cqe(r0, r1, r2)
            r0 = r6
            return r0
    }

    public org.lwjgl.system.linux.liburing.IOURingCQE set(long r5, int r7, int r8, java.nio.LongBuffer r9) {
            r4 = this;
            r0 = r4
            r1 = r5
            org.lwjgl.system.linux.liburing.IOURingCQE r0 = r0.user_data(r1)
            r0 = r4
            r1 = r7
            org.lwjgl.system.linux.liburing.IOURingCQE r0 = r0.res(r1)
            r0 = r4
            r1 = r8
            org.lwjgl.system.linux.liburing.IOURingCQE r0 = r0.flags(r1)
            r0 = r4
            r1 = r9
            org.lwjgl.system.linux.liburing.IOURingCQE r0 = r0.big_cqe(r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.system.linux.liburing.IOURingCQE set(org.lwjgl.system.linux.liburing.IOURingCQE r7) {
            r6 = this;
            r0 = r7
            long r0 = r0.address()
            r1 = r6
            long r1 = r1.address()
            int r2 = org.lwjgl.system.linux.liburing.IOURingCQE.SIZEOF
            org.lwjgl.system.MemoryUtil.memCopy(r0, r1, r2)
            r0 = r6
            return r0
    }

    public static org.lwjgl.system.linux.liburing.IOURingCQE malloc() {
            org.lwjgl.system.linux.liburing.IOURingCQE r0 = new org.lwjgl.system.linux.liburing.IOURingCQE
            r1 = r0
            int r2 = org.lwjgl.system.linux.liburing.IOURingCQE.SIZEOF
            long r2 = (long) r2
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.system.linux.liburing.IOURingCQE calloc() {
            org.lwjgl.system.linux.liburing.IOURingCQE r0 = new org.lwjgl.system.linux.liburing.IOURingCQE
            r1 = r0
            r2 = 1
            int r3 = org.lwjgl.system.linux.liburing.IOURingCQE.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.system.linux.liburing.IOURingCQE create() {
            int r0 = org.lwjgl.system.linux.liburing.IOURingCQE.SIZEOF
            java.nio.ByteBuffer r0 = org.lwjgl.BufferUtils.createByteBuffer(r0)
            r6 = r0
            org.lwjgl.system.linux.liburing.IOURingCQE r0 = new org.lwjgl.system.linux.liburing.IOURingCQE
            r1 = r0
            r2 = r6
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.system.linux.liburing.IOURingCQE create(long r6) {
            org.lwjgl.system.linux.liburing.IOURingCQE r0 = new org.lwjgl.system.linux.liburing.IOURingCQE
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.system.linux.liburing.IOURingCQE createSafe(long r6) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.system.linux.liburing.IOURingCQE r0 = new org.lwjgl.system.linux.liburing.IOURingCQE
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static org.lwjgl.system.linux.liburing.IOURingCQE.Buffer malloc(int r6) {
            org.lwjgl.system.linux.liburing.IOURingCQE$Buffer r0 = new org.lwjgl.system.linux.liburing.IOURingCQE$Buffer
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.system.linux.liburing.IOURingCQE.SIZEOF
            long r2 = __checkMalloc(r2, r3)
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.system.linux.liburing.IOURingCQE.Buffer calloc(int r7) {
            org.lwjgl.system.linux.liburing.IOURingCQE$Buffer r0 = new org.lwjgl.system.linux.liburing.IOURingCQE$Buffer
            r1 = r0
            r2 = r7
            long r2 = (long) r2
            int r3 = org.lwjgl.system.linux.liburing.IOURingCQE.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.system.linux.liburing.IOURingCQE.Buffer create(int r10) {
            r0 = r10
            int r1 = org.lwjgl.system.linux.liburing.IOURingCQE.SIZEOF
            java.nio.ByteBuffer r0 = __create(r0, r1)
            r11 = r0
            org.lwjgl.system.linux.liburing.IOURingCQE$Buffer r0 = new org.lwjgl.system.linux.liburing.IOURingCQE$Buffer
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

    public static org.lwjgl.system.linux.liburing.IOURingCQE.Buffer create(long r6, int r8) {
            org.lwjgl.system.linux.liburing.IOURingCQE$Buffer r0 = new org.lwjgl.system.linux.liburing.IOURingCQE$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.system.linux.liburing.IOURingCQE.Buffer createSafe(long r6, int r8) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.system.linux.liburing.IOURingCQE$Buffer r0 = new org.lwjgl.system.linux.liburing.IOURingCQE$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static org.lwjgl.system.linux.liburing.IOURingCQE malloc(org.lwjgl.system.MemoryStack r6) {
            org.lwjgl.system.linux.liburing.IOURingCQE r0 = new org.lwjgl.system.linux.liburing.IOURingCQE
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.system.linux.liburing.IOURingCQE.ALIGNOF
            int r4 = org.lwjgl.system.linux.liburing.IOURingCQE.SIZEOF
            long r2 = r2.nmalloc(r3, r4)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.system.linux.liburing.IOURingCQE calloc(org.lwjgl.system.MemoryStack r7) {
            org.lwjgl.system.linux.liburing.IOURingCQE r0 = new org.lwjgl.system.linux.liburing.IOURingCQE
            r1 = r0
            r2 = r7
            int r3 = org.lwjgl.system.linux.liburing.IOURingCQE.ALIGNOF
            r4 = 1
            int r5 = org.lwjgl.system.linux.liburing.IOURingCQE.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.system.linux.liburing.IOURingCQE.Buffer malloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.system.linux.liburing.IOURingCQE$Buffer r0 = new org.lwjgl.system.linux.liburing.IOURingCQE$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.system.linux.liburing.IOURingCQE.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.system.linux.liburing.IOURingCQE.SIZEOF
            int r4 = r4 * r5
            long r2 = r2.nmalloc(r3, r4)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.system.linux.liburing.IOURingCQE.Buffer calloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.system.linux.liburing.IOURingCQE$Buffer r0 = new org.lwjgl.system.linux.liburing.IOURingCQE$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.system.linux.liburing.IOURingCQE.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.system.linux.liburing.IOURingCQE.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static long nuser_data(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.system.linux.liburing.IOURingCQE.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.system.linux.liburing.IOURingCQE.USER_DATA
            long r3 = (long) r3
            long r2 = r2 + r3
            long r0 = r0.getLong(r1, r2)
            return r0
    }

    public static int nres(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.system.linux.liburing.IOURingCQE.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.system.linux.liburing.IOURingCQE.RES
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int nflags(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.system.linux.liburing.IOURingCQE.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.system.linux.liburing.IOURingCQE.FLAGS
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static java.nio.LongBuffer nbig_cqe(long r5) {
            r0 = r5
            int r1 = org.lwjgl.system.linux.liburing.IOURingCQE.BIG_CQE
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = 0
            java.nio.LongBuffer r0 = org.lwjgl.system.MemoryUtil.memLongBuffer(r0, r1)
            return r0
    }

    public static long nbig_cqe(long r9, int r11) {
            sun.misc.Unsafe r0 = org.lwjgl.system.linux.liburing.IOURingCQE.UNSAFE
            r1 = 0
            r2 = r9
            int r3 = org.lwjgl.system.linux.liburing.IOURingCQE.BIG_CQE
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r11
            r4 = 0
            long r3 = org.lwjgl.system.Checks.check(r3, r4)
            r4 = 8
            long r3 = r3 * r4
            long r2 = r2 + r3
            long r0 = r0.getLong(r1, r2)
            return r0
    }

    public static void nuser_data(long r7, long r9) {
            sun.misc.Unsafe r0 = org.lwjgl.system.linux.liburing.IOURingCQE.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.system.linux.liburing.IOURingCQE.USER_DATA
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putLong(r1, r2, r3)
            return
    }

    public static void nres(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.system.linux.liburing.IOURingCQE.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.system.linux.liburing.IOURingCQE.RES
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void nflags(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.system.linux.liburing.IOURingCQE.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.system.linux.liburing.IOURingCQE.FLAGS
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void nbig_cqe(long r7, java.nio.LongBuffer r9) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r9
            r1 = 0
            org.lwjgl.system.Checks.checkGT(r0, r1)
        Lb:
            r0 = r9
            long r0 = org.lwjgl.system.MemoryUtil.memAddress(r0)
            r1 = r7
            int r2 = org.lwjgl.system.linux.liburing.IOURingCQE.BIG_CQE
            long r2 = (long) r2
            long r1 = r1 + r2
            r2 = r9
            int r2 = r2.remaining()
            r3 = 8
            int r2 = r2 * r3
            org.lwjgl.system.MemoryUtil.memCopy(r0, r1, r2)
            return
    }

    public static void nbig_cqe(long r9, int r11, long r12) {
            sun.misc.Unsafe r0 = org.lwjgl.system.linux.liburing.IOURingCQE.UNSAFE
            r1 = 0
            r2 = r9
            int r3 = org.lwjgl.system.linux.liburing.IOURingCQE.BIG_CQE
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r11
            r4 = 0
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
            org.lwjgl.system.linux.liburing.IOURingCQE r0 = r0.create(r1, r2)
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
            r3 = 4
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 3
            r3 = 8
            r4 = 0
            org.lwjgl.system.Struct$Member r3 = __array(r3, r4)
            r1[r2] = r3
            org.lwjgl.system.Struct$Layout r0 = __struct(r0)
            r6 = r0
            r0 = r6
            int r0 = r0.getSize()
            org.lwjgl.system.linux.liburing.IOURingCQE.SIZEOF = r0
            r0 = r6
            int r0 = r0.getAlignment()
            org.lwjgl.system.linux.liburing.IOURingCQE.ALIGNOF = r0
            r0 = r6
            r1 = 0
            int r0 = r0.offsetof(r1)
            org.lwjgl.system.linux.liburing.IOURingCQE.USER_DATA = r0
            r0 = r6
            r1 = 1
            int r0 = r0.offsetof(r1)
            org.lwjgl.system.linux.liburing.IOURingCQE.RES = r0
            r0 = r6
            r1 = 2
            int r0 = r0.offsetof(r1)
            org.lwjgl.system.linux.liburing.IOURingCQE.FLAGS = r0
            r0 = r6
            r1 = 3
            int r0 = r0.offsetof(r1)
            org.lwjgl.system.linux.liburing.IOURingCQE.BIG_CQE = r0
            return
    }
}
