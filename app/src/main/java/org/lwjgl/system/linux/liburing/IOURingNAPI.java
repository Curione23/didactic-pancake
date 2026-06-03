package org.lwjgl.system.linux.liburing;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/system/linux/liburing/IOURingNAPI.class */
@org.lwjgl.system.NativeType("struct io_uring_napi")
public class IOURingNAPI extends org.lwjgl.system.Struct<org.lwjgl.system.linux.liburing.IOURingNAPI> implements org.lwjgl.system.NativeResource {
    public static final int SIZEOF = 0;
    public static final int ALIGNOF = 0;
    public static final int BUSY_POLL_TO = 0;
    public static final int PREFER_BUSY_POLL = 0;
    public static final int PAD = 0;
    public static final int RESV = 0;

    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/system/linux/liburing/IOURingNAPI$Buffer.class */
    public static class Buffer extends org.lwjgl.system.StructBuffer<org.lwjgl.system.linux.liburing.IOURingNAPI, org.lwjgl.system.linux.liburing.IOURingNAPI.Buffer> implements org.lwjgl.system.NativeResource {
        private static final org.lwjgl.system.linux.liburing.IOURingNAPI ELEMENT_FACTORY = null;

        public Buffer(java.nio.ByteBuffer r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r6
                int r2 = r2.remaining()
                int r3 = org.lwjgl.system.linux.liburing.IOURingNAPI.SIZEOF
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
        protected org.lwjgl.system.linux.liburing.IOURingNAPI.Buffer self() {
                r2 = this;
                r0 = r2
                return r0
        }

        protected org.lwjgl.system.linux.liburing.IOURingNAPI.Buffer create(long r11, java.nio.ByteBuffer r13, int r14, int r15, int r16, int r17) {
                r10 = this;
                org.lwjgl.system.linux.liburing.IOURingNAPI$Buffer r0 = new org.lwjgl.system.linux.liburing.IOURingNAPI$Buffer
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
        protected org.lwjgl.system.linux.liburing.IOURingNAPI getElementFactory() {
                r2 = this;
                org.lwjgl.system.linux.liburing.IOURingNAPI r0 = org.lwjgl.system.linux.liburing.IOURingNAPI.Buffer.ELEMENT_FACTORY
                return r0
        }

        @org.lwjgl.system.NativeType("__u32")
        public int busy_poll_to() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.system.linux.liburing.IOURingNAPI.nbusy_poll_to(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("__u8")
        public byte prefer_busy_poll() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                byte r0 = org.lwjgl.system.linux.liburing.IOURingNAPI.nprefer_busy_poll(r0)
                return r0
        }

        public org.lwjgl.system.linux.liburing.IOURingNAPI.Buffer busy_poll_to(@org.lwjgl.system.NativeType("__u32") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.system.linux.liburing.IOURingNAPI.nbusy_poll_to(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.system.linux.liburing.IOURingNAPI.Buffer prefer_busy_poll(@org.lwjgl.system.NativeType("__u8") byte r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.system.linux.liburing.IOURingNAPI.nprefer_busy_poll(r0, r1)
                r0 = r4
                return r0
        }

        @Override // org.lwjgl.system.StructBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.Struct getElementFactory() {
                r2 = this;
                r0 = r2
                org.lwjgl.system.linux.liburing.IOURingNAPI r0 = r0.getElementFactory()
                return r0
        }

        /* JADX INFO: renamed from: create, reason: collision with other method in class */
        protected /* bridge */ /* synthetic */ org.lwjgl.system.CustomBuffer m3319create(long r10, java.nio.ByteBuffer r12, int r13, int r14, int r15, int r16) {
                r9 = this;
                r0 = r9
                r1 = r10
                r2 = r12
                r3 = r13
                r4 = r14
                r5 = r15
                r6 = r16
                org.lwjgl.system.linux.liburing.IOURingNAPI$Buffer r0 = r0.create(r1, r2, r3, r4, r5, r6)
                return r0
        }

        @Override // org.lwjgl.system.CustomBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.CustomBuffer self() {
                r2 = this;
                r0 = r2
                org.lwjgl.system.linux.liburing.IOURingNAPI$Buffer r0 = r0.self()
                return r0
        }

        static {
                r0 = -1
                org.lwjgl.system.linux.liburing.IOURingNAPI r0 = org.lwjgl.system.linux.liburing.IOURingNAPI.create(r0)
                org.lwjgl.system.linux.liburing.IOURingNAPI.Buffer.ELEMENT_FACTORY = r0
                return
        }
    }

    protected IOURingNAPI(long r6, java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    protected org.lwjgl.system.linux.liburing.IOURingNAPI create(long r7, java.nio.ByteBuffer r9) {
            r6 = this;
            org.lwjgl.system.linux.liburing.IOURingNAPI r0 = new org.lwjgl.system.linux.liburing.IOURingNAPI
            r1 = r0
            r2 = r7
            r3 = r9
            r1.<init>(r2, r3)
            return r0
    }

    public IOURingNAPI(java.nio.ByteBuffer r7) {
            r6 = this;
            r0 = r6
            r1 = r7
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            r2 = r7
            int r3 = org.lwjgl.system.linux.liburing.IOURingNAPI.SIZEOF
            java.nio.ByteBuffer r2 = __checkContainer(r2, r3)
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
            r2 = this;
            int r0 = org.lwjgl.system.linux.liburing.IOURingNAPI.SIZEOF
            return r0
    }

    @org.lwjgl.system.NativeType("__u32")
    public int busy_poll_to() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nbusy_poll_to(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("__u8")
    public byte prefer_busy_poll() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            byte r0 = nprefer_busy_poll(r0)
            return r0
    }

    public org.lwjgl.system.linux.liburing.IOURingNAPI busy_poll_to(@org.lwjgl.system.NativeType("__u32") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nbusy_poll_to(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.system.linux.liburing.IOURingNAPI prefer_busy_poll(@org.lwjgl.system.NativeType("__u8") byte r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nprefer_busy_poll(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.system.linux.liburing.IOURingNAPI set(int r4, byte r5) {
            r3 = this;
            r0 = r3
            r1 = r4
            org.lwjgl.system.linux.liburing.IOURingNAPI r0 = r0.busy_poll_to(r1)
            r0 = r3
            r1 = r5
            org.lwjgl.system.linux.liburing.IOURingNAPI r0 = r0.prefer_busy_poll(r1)
            r0 = r3
            return r0
    }

    public org.lwjgl.system.linux.liburing.IOURingNAPI set(org.lwjgl.system.linux.liburing.IOURingNAPI r8) {
            r7 = this;
            r0 = r8
            long r0 = r0.address()
            r1 = r7
            long r1 = r1.address()
            int r2 = org.lwjgl.system.linux.liburing.IOURingNAPI.SIZEOF
            long r2 = (long) r2
            org.lwjgl.system.MemoryUtil.memCopy(r0, r1, r2)
            r0 = r7
            return r0
    }

    public static org.lwjgl.system.linux.liburing.IOURingNAPI malloc() {
            org.lwjgl.system.linux.liburing.IOURingNAPI r0 = new org.lwjgl.system.linux.liburing.IOURingNAPI
            r1 = r0
            int r2 = org.lwjgl.system.linux.liburing.IOURingNAPI.SIZEOF
            long r2 = (long) r2
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.system.linux.liburing.IOURingNAPI calloc() {
            org.lwjgl.system.linux.liburing.IOURingNAPI r0 = new org.lwjgl.system.linux.liburing.IOURingNAPI
            r1 = r0
            r2 = 1
            int r3 = org.lwjgl.system.linux.liburing.IOURingNAPI.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.system.linux.liburing.IOURingNAPI create() {
            int r0 = org.lwjgl.system.linux.liburing.IOURingNAPI.SIZEOF
            java.nio.ByteBuffer r0 = org.lwjgl.BufferUtils.createByteBuffer(r0)
            r6 = r0
            org.lwjgl.system.linux.liburing.IOURingNAPI r0 = new org.lwjgl.system.linux.liburing.IOURingNAPI
            r1 = r0
            r2 = r6
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.system.linux.liburing.IOURingNAPI create(long r6) {
            org.lwjgl.system.linux.liburing.IOURingNAPI r0 = new org.lwjgl.system.linux.liburing.IOURingNAPI
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.system.linux.liburing.IOURingNAPI createSafe(long r6) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.system.linux.liburing.IOURingNAPI r0 = new org.lwjgl.system.linux.liburing.IOURingNAPI
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static org.lwjgl.system.linux.liburing.IOURingNAPI.Buffer malloc(int r6) {
            org.lwjgl.system.linux.liburing.IOURingNAPI$Buffer r0 = new org.lwjgl.system.linux.liburing.IOURingNAPI$Buffer
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.system.linux.liburing.IOURingNAPI.SIZEOF
            long r2 = __checkMalloc(r2, r3)
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.system.linux.liburing.IOURingNAPI.Buffer calloc(int r7) {
            org.lwjgl.system.linux.liburing.IOURingNAPI$Buffer r0 = new org.lwjgl.system.linux.liburing.IOURingNAPI$Buffer
            r1 = r0
            r2 = r7
            long r2 = (long) r2
            int r3 = org.lwjgl.system.linux.liburing.IOURingNAPI.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.system.linux.liburing.IOURingNAPI.Buffer create(int r10) {
            r0 = r10
            int r1 = org.lwjgl.system.linux.liburing.IOURingNAPI.SIZEOF
            java.nio.ByteBuffer r0 = __create(r0, r1)
            r11 = r0
            org.lwjgl.system.linux.liburing.IOURingNAPI$Buffer r0 = new org.lwjgl.system.linux.liburing.IOURingNAPI$Buffer
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

    public static org.lwjgl.system.linux.liburing.IOURingNAPI.Buffer create(long r6, int r8) {
            org.lwjgl.system.linux.liburing.IOURingNAPI$Buffer r0 = new org.lwjgl.system.linux.liburing.IOURingNAPI$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.system.linux.liburing.IOURingNAPI.Buffer createSafe(long r6, int r8) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.system.linux.liburing.IOURingNAPI$Buffer r0 = new org.lwjgl.system.linux.liburing.IOURingNAPI$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static org.lwjgl.system.linux.liburing.IOURingNAPI malloc(org.lwjgl.system.MemoryStack r6) {
            org.lwjgl.system.linux.liburing.IOURingNAPI r0 = new org.lwjgl.system.linux.liburing.IOURingNAPI
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.system.linux.liburing.IOURingNAPI.ALIGNOF
            int r4 = org.lwjgl.system.linux.liburing.IOURingNAPI.SIZEOF
            long r2 = r2.nmalloc(r3, r4)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.system.linux.liburing.IOURingNAPI calloc(org.lwjgl.system.MemoryStack r7) {
            org.lwjgl.system.linux.liburing.IOURingNAPI r0 = new org.lwjgl.system.linux.liburing.IOURingNAPI
            r1 = r0
            r2 = r7
            int r3 = org.lwjgl.system.linux.liburing.IOURingNAPI.ALIGNOF
            r4 = 1
            int r5 = org.lwjgl.system.linux.liburing.IOURingNAPI.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.system.linux.liburing.IOURingNAPI.Buffer malloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.system.linux.liburing.IOURingNAPI$Buffer r0 = new org.lwjgl.system.linux.liburing.IOURingNAPI$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.system.linux.liburing.IOURingNAPI.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.system.linux.liburing.IOURingNAPI.SIZEOF
            int r4 = r4 * r5
            long r2 = r2.nmalloc(r3, r4)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.system.linux.liburing.IOURingNAPI.Buffer calloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.system.linux.liburing.IOURingNAPI$Buffer r0 = new org.lwjgl.system.linux.liburing.IOURingNAPI$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.system.linux.liburing.IOURingNAPI.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.system.linux.liburing.IOURingNAPI.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static int nbusy_poll_to(long r5) {
            r0 = r5
            int r1 = org.lwjgl.system.linux.liburing.IOURingNAPI.BUSY_POLL_TO
            long r1 = (long) r1
            long r0 = r0 + r1
            int r0 = org.lwjgl.system.MemoryUtil.memGetInt(r0)
            return r0
    }

    public static byte nprefer_busy_poll(long r5) {
            r0 = r5
            int r1 = org.lwjgl.system.linux.liburing.IOURingNAPI.PREFER_BUSY_POLL
            long r1 = (long) r1
            long r0 = r0 + r1
            byte r0 = org.lwjgl.system.MemoryUtil.memGetByte(r0)
            return r0
    }

    public static java.nio.ByteBuffer npad(long r5) {
            r0 = r5
            int r1 = org.lwjgl.system.linux.liburing.IOURingNAPI.PAD
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = 3
            java.nio.ByteBuffer r0 = org.lwjgl.system.MemoryUtil.memByteBuffer(r0, r1)
            return r0
    }

    public static byte npad(long r7, int r9) {
            r0 = r7
            int r1 = org.lwjgl.system.linux.liburing.IOURingNAPI.PAD
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r9
            r2 = 3
            long r1 = org.lwjgl.system.Checks.check(r1, r2)
            r2 = 1
            long r1 = r1 * r2
            long r0 = r0 + r1
            byte r0 = org.lwjgl.system.MemoryUtil.memGetByte(r0)
            return r0
    }

    public static long nresv(long r5) {
            r0 = r5
            int r1 = org.lwjgl.system.linux.liburing.IOURingNAPI.RESV
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetLong(r0)
            return r0
    }

    public static void nbusy_poll_to(long r5, int r7) {
            r0 = r5
            int r1 = org.lwjgl.system.linux.liburing.IOURingNAPI.BUSY_POLL_TO
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            org.lwjgl.system.MemoryUtil.memPutInt(r0, r1)
            return
    }

    public static void nprefer_busy_poll(long r5, byte r7) {
            r0 = r5
            int r1 = org.lwjgl.system.linux.liburing.IOURingNAPI.PREFER_BUSY_POLL
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            org.lwjgl.system.MemoryUtil.memPutByte(r0, r1)
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
            int r2 = org.lwjgl.system.linux.liburing.IOURingNAPI.PAD
            long r2 = (long) r2
            long r1 = r1 + r2
            r2 = r9
            int r2 = r2.remaining()
            r3 = 1
            int r2 = r2 * r3
            long r2 = (long) r2
            org.lwjgl.system.MemoryUtil.memCopy(r0, r1, r2)
            return
    }

    public static void npad(long r7, int r9, byte r10) {
            r0 = r7
            int r1 = org.lwjgl.system.linux.liburing.IOURingNAPI.PAD
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r9
            r2 = 3
            long r1 = org.lwjgl.system.Checks.check(r1, r2)
            r2 = 1
            long r1 = r1 * r2
            long r0 = r0 + r1
            r1 = r10
            org.lwjgl.system.MemoryUtil.memPutByte(r0, r1)
            return
    }

    public static void nresv(long r5, long r7) {
            r0 = r5
            int r1 = org.lwjgl.system.linux.liburing.IOURingNAPI.RESV
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
            org.lwjgl.system.linux.liburing.IOURingNAPI r0 = r0.create(r1, r2)
            return r0
    }

    static {
            r0 = 4
            org.lwjgl.system.Struct$Member[] r0 = new org.lwjgl.system.Struct.Member[r0]
            r1 = r0
            r2 = 0
            r3 = 4
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 1
            r3 = 1
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 2
            r3 = 1
            r4 = 3
            org.lwjgl.system.Struct$Member r3 = __array(r3, r4)
            r1[r2] = r3
            r1 = r0
            r2 = 3
            r3 = 8
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            org.lwjgl.system.Struct$Layout r0 = __struct(r0)
            r6 = r0
            r0 = r6
            int r0 = r0.getSize()
            org.lwjgl.system.linux.liburing.IOURingNAPI.SIZEOF = r0
            r0 = r6
            int r0 = r0.getAlignment()
            org.lwjgl.system.linux.liburing.IOURingNAPI.ALIGNOF = r0
            r0 = r6
            r1 = 0
            int r0 = r0.offsetof(r1)
            org.lwjgl.system.linux.liburing.IOURingNAPI.BUSY_POLL_TO = r0
            r0 = r6
            r1 = 1
            int r0 = r0.offsetof(r1)
            org.lwjgl.system.linux.liburing.IOURingNAPI.PREFER_BUSY_POLL = r0
            r0 = r6
            r1 = 2
            int r0 = r0.offsetof(r1)
            org.lwjgl.system.linux.liburing.IOURingNAPI.PAD = r0
            r0 = r6
            r1 = 3
            int r0 = r0.offsetof(r1)
            org.lwjgl.system.linux.liburing.IOURingNAPI.RESV = r0
            return
    }
}
