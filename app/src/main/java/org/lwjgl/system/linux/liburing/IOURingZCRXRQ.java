package org.lwjgl.system.linux.liburing;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/system/linux/liburing/IOURingZCRXRQ.class */
@org.lwjgl.system.NativeType("struct io_uring_zcrx_rq")
public class IOURingZCRXRQ extends org.lwjgl.system.Struct<org.lwjgl.system.linux.liburing.IOURingZCRXRQ> implements org.lwjgl.system.NativeResource {
    public static final int SIZEOF = 0;
    public static final int ALIGNOF = 0;
    public static final int KHEAD = 0;
    public static final int KTAIL = 0;
    public static final int RQ_TAIL = 0;
    public static final int RING_ENTRIES = 0;
    public static final int RQES = 0;
    public static final int RING_PTR = 0;

    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/system/linux/liburing/IOURingZCRXRQ$Buffer.class */
    public static class Buffer extends org.lwjgl.system.StructBuffer<org.lwjgl.system.linux.liburing.IOURingZCRXRQ, org.lwjgl.system.linux.liburing.IOURingZCRXRQ.Buffer> implements org.lwjgl.system.NativeResource {
        private static final org.lwjgl.system.linux.liburing.IOURingZCRXRQ ELEMENT_FACTORY = null;

        public Buffer(java.nio.ByteBuffer r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r6
                int r2 = r2.remaining()
                int r3 = org.lwjgl.system.linux.liburing.IOURingZCRXRQ.SIZEOF
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
        protected org.lwjgl.system.linux.liburing.IOURingZCRXRQ.Buffer self() {
                r2 = this;
                r0 = r2
                return r0
        }

        protected org.lwjgl.system.linux.liburing.IOURingZCRXRQ.Buffer create(long r11, java.nio.ByteBuffer r13, int r14, int r15, int r16, int r17) {
                r10 = this;
                org.lwjgl.system.linux.liburing.IOURingZCRXRQ$Buffer r0 = new org.lwjgl.system.linux.liburing.IOURingZCRXRQ$Buffer
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
        protected org.lwjgl.system.linux.liburing.IOURingZCRXRQ getElementFactory() {
                r2 = this;
                org.lwjgl.system.linux.liburing.IOURingZCRXRQ r0 = org.lwjgl.system.linux.liburing.IOURingZCRXRQ.Buffer.ELEMENT_FACTORY
                return r0
        }

        @org.lwjgl.system.NativeType("__u32 *")
        public java.nio.IntBuffer khead(int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                java.nio.IntBuffer r0 = org.lwjgl.system.linux.liburing.IOURingZCRXRQ.nkhead(r0, r1)
                return r0
        }

        @org.lwjgl.system.NativeType("__u32 *")
        public java.nio.IntBuffer ktail(int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                java.nio.IntBuffer r0 = org.lwjgl.system.linux.liburing.IOURingZCRXRQ.nktail(r0, r1)
                return r0
        }

        @org.lwjgl.system.NativeType("__u32")
        public int rq_tail() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.system.linux.liburing.IOURingZCRXRQ.nrq_tail(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("unsigned")
        public int ring_entries() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.system.linux.liburing.IOURingZCRXRQ.nring_entries(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("struct io_uring_zcrx_rqe *")
        public org.lwjgl.system.linux.liburing.IOURingZCRXRQE rqes() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                org.lwjgl.system.linux.liburing.IOURingZCRXRQE r0 = org.lwjgl.system.linux.liburing.IOURingZCRXRQ.nrqes(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("void *")
        public long ring_ptr() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                long r0 = org.lwjgl.system.linux.liburing.IOURingZCRXRQ.nring_ptr(r0)
                return r0
        }

        public org.lwjgl.system.linux.liburing.IOURingZCRXRQ.Buffer khead(@org.lwjgl.system.NativeType("__u32 *") java.nio.IntBuffer r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.system.linux.liburing.IOURingZCRXRQ.nkhead(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.system.linux.liburing.IOURingZCRXRQ.Buffer ktail(@org.lwjgl.system.NativeType("__u32 *") java.nio.IntBuffer r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.system.linux.liburing.IOURingZCRXRQ.nktail(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.system.linux.liburing.IOURingZCRXRQ.Buffer rq_tail(@org.lwjgl.system.NativeType("__u32") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.system.linux.liburing.IOURingZCRXRQ.nrq_tail(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.system.linux.liburing.IOURingZCRXRQ.Buffer ring_entries(@org.lwjgl.system.NativeType("unsigned") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.system.linux.liburing.IOURingZCRXRQ.nring_entries(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.system.linux.liburing.IOURingZCRXRQ.Buffer rqes(@org.lwjgl.system.NativeType("struct io_uring_zcrx_rqe *") org.lwjgl.system.linux.liburing.IOURingZCRXRQE r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.system.linux.liburing.IOURingZCRXRQ.nrqes(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.system.linux.liburing.IOURingZCRXRQ.Buffer ring_ptr(@org.lwjgl.system.NativeType("void *") long r6) {
                r5 = this;
                r0 = r5
                long r0 = r0.address()
                r1 = r6
                org.lwjgl.system.linux.liburing.IOURingZCRXRQ.nring_ptr(r0, r1)
                r0 = r5
                return r0
        }

        @Override // org.lwjgl.system.StructBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.Struct getElementFactory() {
                r2 = this;
                r0 = r2
                org.lwjgl.system.linux.liburing.IOURingZCRXRQ r0 = r0.getElementFactory()
                return r0
        }

        /* JADX INFO: renamed from: create, reason: collision with other method in class */
        protected /* bridge */ /* synthetic */ org.lwjgl.system.CustomBuffer m3365create(long r10, java.nio.ByteBuffer r12, int r13, int r14, int r15, int r16) {
                r9 = this;
                r0 = r9
                r1 = r10
                r2 = r12
                r3 = r13
                r4 = r14
                r5 = r15
                r6 = r16
                org.lwjgl.system.linux.liburing.IOURingZCRXRQ$Buffer r0 = r0.create(r1, r2, r3, r4, r5, r6)
                return r0
        }

        @Override // org.lwjgl.system.CustomBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.CustomBuffer self() {
                r2 = this;
                r0 = r2
                org.lwjgl.system.linux.liburing.IOURingZCRXRQ$Buffer r0 = r0.self()
                return r0
        }

        static {
                r0 = -1
                org.lwjgl.system.linux.liburing.IOURingZCRXRQ r0 = org.lwjgl.system.linux.liburing.IOURingZCRXRQ.create(r0)
                org.lwjgl.system.linux.liburing.IOURingZCRXRQ.Buffer.ELEMENT_FACTORY = r0
                return
        }
    }

    protected IOURingZCRXRQ(long r6, java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    protected org.lwjgl.system.linux.liburing.IOURingZCRXRQ create(long r7, java.nio.ByteBuffer r9) {
            r6 = this;
            org.lwjgl.system.linux.liburing.IOURingZCRXRQ r0 = new org.lwjgl.system.linux.liburing.IOURingZCRXRQ
            r1 = r0
            r2 = r7
            r3 = r9
            r1.<init>(r2, r3)
            return r0
    }

    public IOURingZCRXRQ(java.nio.ByteBuffer r7) {
            r6 = this;
            r0 = r6
            r1 = r7
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            r2 = r7
            int r3 = org.lwjgl.system.linux.liburing.IOURingZCRXRQ.SIZEOF
            java.nio.ByteBuffer r2 = __checkContainer(r2, r3)
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
            r2 = this;
            int r0 = org.lwjgl.system.linux.liburing.IOURingZCRXRQ.SIZEOF
            return r0
    }

    @org.lwjgl.system.NativeType("__u32 *")
    public java.nio.IntBuffer khead(int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            java.nio.IntBuffer r0 = nkhead(r0, r1)
            return r0
    }

    @org.lwjgl.system.NativeType("__u32 *")
    public java.nio.IntBuffer ktail(int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            java.nio.IntBuffer r0 = nktail(r0, r1)
            return r0
    }

    @org.lwjgl.system.NativeType("__u32")
    public int rq_tail() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nrq_tail(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("unsigned")
    public int ring_entries() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nring_entries(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("struct io_uring_zcrx_rqe *")
    public org.lwjgl.system.linux.liburing.IOURingZCRXRQE rqes() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            org.lwjgl.system.linux.liburing.IOURingZCRXRQE r0 = nrqes(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("void *")
    public long ring_ptr() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            long r0 = nring_ptr(r0)
            return r0
    }

    public org.lwjgl.system.linux.liburing.IOURingZCRXRQ khead(@org.lwjgl.system.NativeType("__u32 *") java.nio.IntBuffer r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nkhead(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.system.linux.liburing.IOURingZCRXRQ ktail(@org.lwjgl.system.NativeType("__u32 *") java.nio.IntBuffer r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nktail(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.system.linux.liburing.IOURingZCRXRQ rq_tail(@org.lwjgl.system.NativeType("__u32") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nrq_tail(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.system.linux.liburing.IOURingZCRXRQ ring_entries(@org.lwjgl.system.NativeType("unsigned") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nring_entries(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.system.linux.liburing.IOURingZCRXRQ rqes(@org.lwjgl.system.NativeType("struct io_uring_zcrx_rqe *") org.lwjgl.system.linux.liburing.IOURingZCRXRQE r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nrqes(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.system.linux.liburing.IOURingZCRXRQ ring_ptr(@org.lwjgl.system.NativeType("void *") long r6) {
            r5 = this;
            r0 = r5
            long r0 = r0.address()
            r1 = r6
            nring_ptr(r0, r1)
            r0 = r5
            return r0
    }

    public org.lwjgl.system.linux.liburing.IOURingZCRXRQ set(java.nio.IntBuffer r5, java.nio.IntBuffer r6, int r7, int r8, org.lwjgl.system.linux.liburing.IOURingZCRXRQE r9, long r10) {
            r4 = this;
            r0 = r4
            r1 = r5
            org.lwjgl.system.linux.liburing.IOURingZCRXRQ r0 = r0.khead(r1)
            r0 = r4
            r1 = r6
            org.lwjgl.system.linux.liburing.IOURingZCRXRQ r0 = r0.ktail(r1)
            r0 = r4
            r1 = r7
            org.lwjgl.system.linux.liburing.IOURingZCRXRQ r0 = r0.rq_tail(r1)
            r0 = r4
            r1 = r8
            org.lwjgl.system.linux.liburing.IOURingZCRXRQ r0 = r0.ring_entries(r1)
            r0 = r4
            r1 = r9
            org.lwjgl.system.linux.liburing.IOURingZCRXRQ r0 = r0.rqes(r1)
            r0 = r4
            r1 = r10
            org.lwjgl.system.linux.liburing.IOURingZCRXRQ r0 = r0.ring_ptr(r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.system.linux.liburing.IOURingZCRXRQ set(org.lwjgl.system.linux.liburing.IOURingZCRXRQ r8) {
            r7 = this;
            r0 = r8
            long r0 = r0.address()
            r1 = r7
            long r1 = r1.address()
            int r2 = org.lwjgl.system.linux.liburing.IOURingZCRXRQ.SIZEOF
            long r2 = (long) r2
            org.lwjgl.system.MemoryUtil.memCopy(r0, r1, r2)
            r0 = r7
            return r0
    }

    public static org.lwjgl.system.linux.liburing.IOURingZCRXRQ malloc() {
            org.lwjgl.system.linux.liburing.IOURingZCRXRQ r0 = new org.lwjgl.system.linux.liburing.IOURingZCRXRQ
            r1 = r0
            int r2 = org.lwjgl.system.linux.liburing.IOURingZCRXRQ.SIZEOF
            long r2 = (long) r2
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.system.linux.liburing.IOURingZCRXRQ calloc() {
            org.lwjgl.system.linux.liburing.IOURingZCRXRQ r0 = new org.lwjgl.system.linux.liburing.IOURingZCRXRQ
            r1 = r0
            r2 = 1
            int r3 = org.lwjgl.system.linux.liburing.IOURingZCRXRQ.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.system.linux.liburing.IOURingZCRXRQ create() {
            int r0 = org.lwjgl.system.linux.liburing.IOURingZCRXRQ.SIZEOF
            java.nio.ByteBuffer r0 = org.lwjgl.BufferUtils.createByteBuffer(r0)
            r6 = r0
            org.lwjgl.system.linux.liburing.IOURingZCRXRQ r0 = new org.lwjgl.system.linux.liburing.IOURingZCRXRQ
            r1 = r0
            r2 = r6
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.system.linux.liburing.IOURingZCRXRQ create(long r6) {
            org.lwjgl.system.linux.liburing.IOURingZCRXRQ r0 = new org.lwjgl.system.linux.liburing.IOURingZCRXRQ
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.system.linux.liburing.IOURingZCRXRQ createSafe(long r6) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.system.linux.liburing.IOURingZCRXRQ r0 = new org.lwjgl.system.linux.liburing.IOURingZCRXRQ
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static org.lwjgl.system.linux.liburing.IOURingZCRXRQ.Buffer malloc(int r6) {
            org.lwjgl.system.linux.liburing.IOURingZCRXRQ$Buffer r0 = new org.lwjgl.system.linux.liburing.IOURingZCRXRQ$Buffer
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.system.linux.liburing.IOURingZCRXRQ.SIZEOF
            long r2 = __checkMalloc(r2, r3)
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.system.linux.liburing.IOURingZCRXRQ.Buffer calloc(int r7) {
            org.lwjgl.system.linux.liburing.IOURingZCRXRQ$Buffer r0 = new org.lwjgl.system.linux.liburing.IOURingZCRXRQ$Buffer
            r1 = r0
            r2 = r7
            long r2 = (long) r2
            int r3 = org.lwjgl.system.linux.liburing.IOURingZCRXRQ.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.system.linux.liburing.IOURingZCRXRQ.Buffer create(int r10) {
            r0 = r10
            int r1 = org.lwjgl.system.linux.liburing.IOURingZCRXRQ.SIZEOF
            java.nio.ByteBuffer r0 = __create(r0, r1)
            r11 = r0
            org.lwjgl.system.linux.liburing.IOURingZCRXRQ$Buffer r0 = new org.lwjgl.system.linux.liburing.IOURingZCRXRQ$Buffer
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

    public static org.lwjgl.system.linux.liburing.IOURingZCRXRQ.Buffer create(long r6, int r8) {
            org.lwjgl.system.linux.liburing.IOURingZCRXRQ$Buffer r0 = new org.lwjgl.system.linux.liburing.IOURingZCRXRQ$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.system.linux.liburing.IOURingZCRXRQ.Buffer createSafe(long r6, int r8) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.system.linux.liburing.IOURingZCRXRQ$Buffer r0 = new org.lwjgl.system.linux.liburing.IOURingZCRXRQ$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static org.lwjgl.system.linux.liburing.IOURingZCRXRQ malloc(org.lwjgl.system.MemoryStack r6) {
            org.lwjgl.system.linux.liburing.IOURingZCRXRQ r0 = new org.lwjgl.system.linux.liburing.IOURingZCRXRQ
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.system.linux.liburing.IOURingZCRXRQ.ALIGNOF
            int r4 = org.lwjgl.system.linux.liburing.IOURingZCRXRQ.SIZEOF
            long r2 = r2.nmalloc(r3, r4)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.system.linux.liburing.IOURingZCRXRQ calloc(org.lwjgl.system.MemoryStack r7) {
            org.lwjgl.system.linux.liburing.IOURingZCRXRQ r0 = new org.lwjgl.system.linux.liburing.IOURingZCRXRQ
            r1 = r0
            r2 = r7
            int r3 = org.lwjgl.system.linux.liburing.IOURingZCRXRQ.ALIGNOF
            r4 = 1
            int r5 = org.lwjgl.system.linux.liburing.IOURingZCRXRQ.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.system.linux.liburing.IOURingZCRXRQ.Buffer malloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.system.linux.liburing.IOURingZCRXRQ$Buffer r0 = new org.lwjgl.system.linux.liburing.IOURingZCRXRQ$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.system.linux.liburing.IOURingZCRXRQ.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.system.linux.liburing.IOURingZCRXRQ.SIZEOF
            int r4 = r4 * r5
            long r2 = r2.nmalloc(r3, r4)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.system.linux.liburing.IOURingZCRXRQ.Buffer calloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.system.linux.liburing.IOURingZCRXRQ$Buffer r0 = new org.lwjgl.system.linux.liburing.IOURingZCRXRQ$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.system.linux.liburing.IOURingZCRXRQ.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.system.linux.liburing.IOURingZCRXRQ.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static java.nio.IntBuffer nkhead(long r5, int r7) {
            r0 = r5
            int r1 = org.lwjgl.system.linux.liburing.IOURingZCRXRQ.KHEAD
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            r1 = r7
            java.nio.IntBuffer r0 = org.lwjgl.system.MemoryUtil.memIntBuffer(r0, r1)
            return r0
    }

    public static java.nio.IntBuffer nktail(long r5, int r7) {
            r0 = r5
            int r1 = org.lwjgl.system.linux.liburing.IOURingZCRXRQ.KTAIL
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            r1 = r7
            java.nio.IntBuffer r0 = org.lwjgl.system.MemoryUtil.memIntBuffer(r0, r1)
            return r0
    }

    public static int nrq_tail(long r5) {
            r0 = r5
            int r1 = org.lwjgl.system.linux.liburing.IOURingZCRXRQ.RQ_TAIL
            long r1 = (long) r1
            long r0 = r0 + r1
            int r0 = org.lwjgl.system.MemoryUtil.memGetInt(r0)
            return r0
    }

    public static int nring_entries(long r5) {
            r0 = r5
            int r1 = org.lwjgl.system.linux.liburing.IOURingZCRXRQ.RING_ENTRIES
            long r1 = (long) r1
            long r0 = r0 + r1
            int r0 = org.lwjgl.system.MemoryUtil.memGetInt(r0)
            return r0
    }

    public static org.lwjgl.system.linux.liburing.IOURingZCRXRQE nrqes(long r5) {
            r0 = r5
            int r1 = org.lwjgl.system.linux.liburing.IOURingZCRXRQ.RQES
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            org.lwjgl.system.linux.liburing.IOURingZCRXRQE r0 = org.lwjgl.system.linux.liburing.IOURingZCRXRQE.create(r0)
            return r0
    }

    public static long nring_ptr(long r5) {
            r0 = r5
            int r1 = org.lwjgl.system.linux.liburing.IOURingZCRXRQ.RING_PTR
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            return r0
    }

    public static void nkhead(long r5, java.nio.IntBuffer r7) {
            r0 = r5
            int r1 = org.lwjgl.system.linux.liburing.IOURingZCRXRQ.KHEAD
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            org.lwjgl.system.MemoryUtil.memPutAddress(r0, r1)
            return
    }

    public static void nktail(long r5, java.nio.IntBuffer r7) {
            r0 = r5
            int r1 = org.lwjgl.system.linux.liburing.IOURingZCRXRQ.KTAIL
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            org.lwjgl.system.MemoryUtil.memPutAddress(r0, r1)
            return
    }

    public static void nrq_tail(long r5, int r7) {
            r0 = r5
            int r1 = org.lwjgl.system.linux.liburing.IOURingZCRXRQ.RQ_TAIL
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            org.lwjgl.system.MemoryUtil.memPutInt(r0, r1)
            return
    }

    public static void nring_entries(long r5, int r7) {
            r0 = r5
            int r1 = org.lwjgl.system.linux.liburing.IOURingZCRXRQ.RING_ENTRIES
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            org.lwjgl.system.MemoryUtil.memPutInt(r0, r1)
            return
    }

    public static void nrqes(long r5, org.lwjgl.system.linux.liburing.IOURingZCRXRQE r7) {
            r0 = r5
            int r1 = org.lwjgl.system.linux.liburing.IOURingZCRXRQ.RQES
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            long r1 = r1.address()
            org.lwjgl.system.MemoryUtil.memPutAddress(r0, r1)
            return
    }

    public static void nring_ptr(long r5, long r7) {
            r0 = r5
            int r1 = org.lwjgl.system.linux.liburing.IOURingZCRXRQ.RING_PTR
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            long r1 = org.lwjgl.system.Checks.check(r1)
            org.lwjgl.system.MemoryUtil.memPutAddress(r0, r1)
            return
    }

    public static void validate(long r5) {
            r0 = r5
            int r1 = org.lwjgl.system.linux.liburing.IOURingZCRXRQ.KHEAD
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r5
            int r1 = org.lwjgl.system.linux.liburing.IOURingZCRXRQ.KTAIL
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r5
            int r1 = org.lwjgl.system.linux.liburing.IOURingZCRXRQ.RQES
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r5
            int r1 = org.lwjgl.system.linux.liburing.IOURingZCRXRQ.RING_PTR
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            long r0 = org.lwjgl.system.Checks.check(r0)
            return
    }

    @Override // org.lwjgl.system.Struct
    protected /* bridge */ /* synthetic */ org.lwjgl.system.Struct create(long r6, java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            org.lwjgl.system.linux.liburing.IOURingZCRXRQ r0 = r0.create(r1, r2)
            return r0
    }

    static {
            r0 = 6
            org.lwjgl.system.Struct$Member[] r0 = new org.lwjgl.system.Struct.Member[r0]
            r1 = r0
            r2 = 0
            int r3 = org.lwjgl.system.linux.liburing.IOURingZCRXRQ.POINTER_SIZE
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 1
            int r3 = org.lwjgl.system.linux.liburing.IOURingZCRXRQ.POINTER_SIZE
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
            int r3 = org.lwjgl.system.linux.liburing.IOURingZCRXRQ.POINTER_SIZE
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 5
            int r3 = org.lwjgl.system.linux.liburing.IOURingZCRXRQ.POINTER_SIZE
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            org.lwjgl.system.Struct$Layout r0 = __struct(r0)
            r5 = r0
            r0 = r5
            int r0 = r0.getSize()
            org.lwjgl.system.linux.liburing.IOURingZCRXRQ.SIZEOF = r0
            r0 = r5
            int r0 = r0.getAlignment()
            org.lwjgl.system.linux.liburing.IOURingZCRXRQ.ALIGNOF = r0
            r0 = r5
            r1 = 0
            int r0 = r0.offsetof(r1)
            org.lwjgl.system.linux.liburing.IOURingZCRXRQ.KHEAD = r0
            r0 = r5
            r1 = 1
            int r0 = r0.offsetof(r1)
            org.lwjgl.system.linux.liburing.IOURingZCRXRQ.KTAIL = r0
            r0 = r5
            r1 = 2
            int r0 = r0.offsetof(r1)
            org.lwjgl.system.linux.liburing.IOURingZCRXRQ.RQ_TAIL = r0
            r0 = r5
            r1 = 3
            int r0 = r0.offsetof(r1)
            org.lwjgl.system.linux.liburing.IOURingZCRXRQ.RING_ENTRIES = r0
            r0 = r5
            r1 = 4
            int r0 = r0.offsetof(r1)
            org.lwjgl.system.linux.liburing.IOURingZCRXRQ.RQES = r0
            r0 = r5
            r1 = 5
            int r0 = r0.offsetof(r1)
            org.lwjgl.system.linux.liburing.IOURingZCRXRQ.RING_PTR = r0
            return
    }
}
