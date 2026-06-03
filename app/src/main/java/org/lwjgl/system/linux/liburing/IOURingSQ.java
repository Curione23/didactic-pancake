package org.lwjgl.system.linux.liburing;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/system/linux/liburing/IOURingSQ.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/system/linux/liburing/IOURingSQ.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/system/linux/liburing/IOURingSQ.class */
@org.lwjgl.system.NativeType("struct io_uring_sq")
public class IOURingSQ extends org.lwjgl.system.Struct<org.lwjgl.system.linux.liburing.IOURingSQ> implements org.lwjgl.system.NativeResource {
    public static final int SIZEOF = 0;
    public static final int ALIGNOF = 0;
    public static final int KHEAD = 0;
    public static final int KTAIL = 0;
    public static final int KRING_MASK = 0;
    public static final int KRING_ENTRIES = 0;
    public static final int KFLAGS = 0;
    public static final int KDROPPED = 0;
    public static final int ARRAY = 0;
    public static final int SQES = 0;
    public static final int SQE_HEAD = 0;
    public static final int SQE_TAIL = 0;
    public static final int RING_SZ = 0;
    public static final int RING_PTR = 0;
    public static final int RING_MASK = 0;
    public static final int RING_ENTRIES = 0;
    public static final int PAD = 0;

    /* JADX WARN: Classes with same name are omitted, all sources:
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/system/linux/liburing/IOURingSQ$Buffer.class
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/system/linux/liburing/IOURingSQ$Buffer.class
     */
    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/system/linux/liburing/IOURingSQ$Buffer.class */
    public static class Buffer extends org.lwjgl.system.StructBuffer<org.lwjgl.system.linux.liburing.IOURingSQ, org.lwjgl.system.linux.liburing.IOURingSQ.Buffer> implements org.lwjgl.system.NativeResource {
        private static final org.lwjgl.system.linux.liburing.IOURingSQ ELEMENT_FACTORY = null;

        public Buffer(java.nio.ByteBuffer r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r6
                int r2 = r2.remaining()
                int r3 = org.lwjgl.system.linux.liburing.IOURingSQ.SIZEOF
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
        protected org.lwjgl.system.linux.liburing.IOURingSQ.Buffer self() {
                r2 = this;
                r0 = r2
                return r0
        }

        @Override // org.lwjgl.system.StructBuffer
        protected org.lwjgl.system.linux.liburing.IOURingSQ getElementFactory() {
                r2 = this;
                org.lwjgl.system.linux.liburing.IOURingSQ r0 = org.lwjgl.system.linux.liburing.IOURingSQ.Buffer.ELEMENT_FACTORY
                return r0
        }

        @org.lwjgl.system.NativeType("unsigned *")
        public java.nio.IntBuffer khead(int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                java.nio.IntBuffer r0 = org.lwjgl.system.linux.liburing.IOURingSQ.nkhead(r0, r1)
                return r0
        }

        @org.lwjgl.system.NativeType("unsigned *")
        public java.nio.IntBuffer ktail(int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                java.nio.IntBuffer r0 = org.lwjgl.system.linux.liburing.IOURingSQ.nktail(r0, r1)
                return r0
        }

        @org.lwjgl.system.NativeType("unsigned *")
        public java.nio.IntBuffer kring_mask(int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                java.nio.IntBuffer r0 = org.lwjgl.system.linux.liburing.IOURingSQ.nkring_mask(r0, r1)
                return r0
        }

        @org.lwjgl.system.NativeType("unsigned *")
        public java.nio.IntBuffer kring_entries(int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                java.nio.IntBuffer r0 = org.lwjgl.system.linux.liburing.IOURingSQ.nkring_entries(r0, r1)
                return r0
        }

        @org.lwjgl.system.NativeType("unsigned *")
        public java.nio.IntBuffer kflags(int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                java.nio.IntBuffer r0 = org.lwjgl.system.linux.liburing.IOURingSQ.nkflags(r0, r1)
                return r0
        }

        @org.lwjgl.system.NativeType("unsigned *")
        public java.nio.IntBuffer kdropped(int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                java.nio.IntBuffer r0 = org.lwjgl.system.linux.liburing.IOURingSQ.nkdropped(r0, r1)
                return r0
        }

        @org.lwjgl.system.NativeType("unsigned *")
        public java.nio.IntBuffer array(int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                java.nio.IntBuffer r0 = org.lwjgl.system.linux.liburing.IOURingSQ.narray(r0, r1)
                return r0
        }

        @org.lwjgl.system.NativeType("struct io_uring_sqe *")
        public org.lwjgl.system.linux.liburing.IOURingSQE sqes() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                org.lwjgl.system.linux.liburing.IOURingSQE r0 = org.lwjgl.system.linux.liburing.IOURingSQ.nsqes(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("unsigned")
        public int sqe_head() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.system.linux.liburing.IOURingSQ.nsqe_head(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("unsigned")
        public int sqe_tail() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.system.linux.liburing.IOURingSQ.nsqe_tail(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("size_t")
        public long ring_sz() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                long r0 = org.lwjgl.system.linux.liburing.IOURingSQ.nring_sz(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("void *")
        public java.nio.ByteBuffer ring_ptr() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                java.nio.ByteBuffer r0 = org.lwjgl.system.linux.liburing.IOURingSQ.nring_ptr(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("unsigned")
        public int ring_mask() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.system.linux.liburing.IOURingSQ.nring_mask(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("unsigned")
        public int ring_entries() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.system.linux.liburing.IOURingSQ.nring_entries(r0)
                return r0
        }

        public org.lwjgl.system.linux.liburing.IOURingSQ.Buffer khead(@org.lwjgl.system.NativeType("unsigned *") java.nio.IntBuffer r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.system.linux.liburing.IOURingSQ.nkhead(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.system.linux.liburing.IOURingSQ.Buffer ktail(@org.lwjgl.system.NativeType("unsigned *") java.nio.IntBuffer r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.system.linux.liburing.IOURingSQ.nktail(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.system.linux.liburing.IOURingSQ.Buffer kring_mask(@org.lwjgl.system.NativeType("unsigned *") java.nio.IntBuffer r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.system.linux.liburing.IOURingSQ.nkring_mask(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.system.linux.liburing.IOURingSQ.Buffer kring_entries(@org.lwjgl.system.NativeType("unsigned *") java.nio.IntBuffer r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.system.linux.liburing.IOURingSQ.nkring_entries(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.system.linux.liburing.IOURingSQ.Buffer kflags(@org.lwjgl.system.NativeType("unsigned *") java.nio.IntBuffer r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.system.linux.liburing.IOURingSQ.nkflags(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.system.linux.liburing.IOURingSQ.Buffer kdropped(@org.lwjgl.system.NativeType("unsigned *") java.nio.IntBuffer r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.system.linux.liburing.IOURingSQ.nkdropped(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.system.linux.liburing.IOURingSQ.Buffer array(@org.lwjgl.system.NativeType("unsigned *") java.nio.IntBuffer r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.system.linux.liburing.IOURingSQ.narray(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.system.linux.liburing.IOURingSQ.Buffer sqes(@org.lwjgl.system.NativeType("struct io_uring_sqe *") org.lwjgl.system.linux.liburing.IOURingSQE r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.system.linux.liburing.IOURingSQ.nsqes(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.system.linux.liburing.IOURingSQ.Buffer sqe_head(@org.lwjgl.system.NativeType("unsigned") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.system.linux.liburing.IOURingSQ.nsqe_head(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.system.linux.liburing.IOURingSQ.Buffer sqe_tail(@org.lwjgl.system.NativeType("unsigned") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.system.linux.liburing.IOURingSQ.nsqe_tail(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.system.linux.liburing.IOURingSQ.Buffer ring_ptr(@org.lwjgl.system.NativeType("void *") java.nio.ByteBuffer r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.system.linux.liburing.IOURingSQ.nring_ptr(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.system.linux.liburing.IOURingSQ.Buffer ring_mask(@org.lwjgl.system.NativeType("unsigned") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.system.linux.liburing.IOURingSQ.nring_mask(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.system.linux.liburing.IOURingSQ.Buffer ring_entries(@org.lwjgl.system.NativeType("unsigned") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.system.linux.liburing.IOURingSQ.nring_entries(r0, r1)
                r0 = r4
                return r0
        }

        @Override // org.lwjgl.system.StructBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.Struct getElementFactory() {
                r2 = this;
                r0 = r2
                org.lwjgl.system.linux.liburing.IOURingSQ r0 = r0.getElementFactory()
                return r0
        }

        @Override // org.lwjgl.system.CustomBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.CustomBuffer self() {
                r2 = this;
                r0 = r2
                org.lwjgl.system.linux.liburing.IOURingSQ$Buffer r0 = r0.self()
                return r0
        }

        static {
                r0 = -1
                org.lwjgl.system.linux.liburing.IOURingSQ r0 = org.lwjgl.system.linux.liburing.IOURingSQ.create(r0)
                org.lwjgl.system.linux.liburing.IOURingSQ.Buffer.ELEMENT_FACTORY = r0
                return
        }
    }

    protected IOURingSQ(long r6, @javax.annotation.Nullable java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    protected org.lwjgl.system.linux.liburing.IOURingSQ create(long r7, @javax.annotation.Nullable java.nio.ByteBuffer r9) {
            r6 = this;
            org.lwjgl.system.linux.liburing.IOURingSQ r0 = new org.lwjgl.system.linux.liburing.IOURingSQ
            r1 = r0
            r2 = r7
            r3 = r9
            r1.<init>(r2, r3)
            return r0
    }

    public IOURingSQ(java.nio.ByteBuffer r7) {
            r6 = this;
            r0 = r6
            r1 = r7
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            r2 = r7
            int r3 = org.lwjgl.system.linux.liburing.IOURingSQ.SIZEOF
            java.nio.ByteBuffer r2 = __checkContainer(r2, r3)
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
            r2 = this;
            int r0 = org.lwjgl.system.linux.liburing.IOURingSQ.SIZEOF
            return r0
    }

    @org.lwjgl.system.NativeType("unsigned *")
    public java.nio.IntBuffer khead(int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            java.nio.IntBuffer r0 = nkhead(r0, r1)
            return r0
    }

    @org.lwjgl.system.NativeType("unsigned *")
    public java.nio.IntBuffer ktail(int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            java.nio.IntBuffer r0 = nktail(r0, r1)
            return r0
    }

    @org.lwjgl.system.NativeType("unsigned *")
    public java.nio.IntBuffer kring_mask(int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            java.nio.IntBuffer r0 = nkring_mask(r0, r1)
            return r0
    }

    @org.lwjgl.system.NativeType("unsigned *")
    public java.nio.IntBuffer kring_entries(int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            java.nio.IntBuffer r0 = nkring_entries(r0, r1)
            return r0
    }

    @org.lwjgl.system.NativeType("unsigned *")
    public java.nio.IntBuffer kflags(int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            java.nio.IntBuffer r0 = nkflags(r0, r1)
            return r0
    }

    @org.lwjgl.system.NativeType("unsigned *")
    public java.nio.IntBuffer kdropped(int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            java.nio.IntBuffer r0 = nkdropped(r0, r1)
            return r0
    }

    @org.lwjgl.system.NativeType("unsigned *")
    public java.nio.IntBuffer array(int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            java.nio.IntBuffer r0 = narray(r0, r1)
            return r0
    }

    @org.lwjgl.system.NativeType("struct io_uring_sqe *")
    public org.lwjgl.system.linux.liburing.IOURingSQE sqes() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            org.lwjgl.system.linux.liburing.IOURingSQE r0 = nsqes(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("unsigned")
    public int sqe_head() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nsqe_head(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("unsigned")
    public int sqe_tail() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nsqe_tail(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("size_t")
    public long ring_sz() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            long r0 = nring_sz(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("void *")
    public java.nio.ByteBuffer ring_ptr() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            java.nio.ByteBuffer r0 = nring_ptr(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("unsigned")
    public int ring_mask() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nring_mask(r0)
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

    public org.lwjgl.system.linux.liburing.IOURingSQ khead(@org.lwjgl.system.NativeType("unsigned *") java.nio.IntBuffer r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nkhead(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.system.linux.liburing.IOURingSQ ktail(@org.lwjgl.system.NativeType("unsigned *") java.nio.IntBuffer r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nktail(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.system.linux.liburing.IOURingSQ kring_mask(@org.lwjgl.system.NativeType("unsigned *") java.nio.IntBuffer r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nkring_mask(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.system.linux.liburing.IOURingSQ kring_entries(@org.lwjgl.system.NativeType("unsigned *") java.nio.IntBuffer r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nkring_entries(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.system.linux.liburing.IOURingSQ kflags(@org.lwjgl.system.NativeType("unsigned *") java.nio.IntBuffer r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nkflags(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.system.linux.liburing.IOURingSQ kdropped(@org.lwjgl.system.NativeType("unsigned *") java.nio.IntBuffer r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nkdropped(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.system.linux.liburing.IOURingSQ array(@org.lwjgl.system.NativeType("unsigned *") java.nio.IntBuffer r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            narray(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.system.linux.liburing.IOURingSQ sqes(@org.lwjgl.system.NativeType("struct io_uring_sqe *") org.lwjgl.system.linux.liburing.IOURingSQE r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nsqes(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.system.linux.liburing.IOURingSQ sqe_head(@org.lwjgl.system.NativeType("unsigned") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nsqe_head(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.system.linux.liburing.IOURingSQ sqe_tail(@org.lwjgl.system.NativeType("unsigned") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nsqe_tail(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.system.linux.liburing.IOURingSQ ring_ptr(@org.lwjgl.system.NativeType("void *") java.nio.ByteBuffer r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nring_ptr(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.system.linux.liburing.IOURingSQ ring_mask(@org.lwjgl.system.NativeType("unsigned") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nring_mask(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.system.linux.liburing.IOURingSQ ring_entries(@org.lwjgl.system.NativeType("unsigned") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nring_entries(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.system.linux.liburing.IOURingSQ set(java.nio.IntBuffer r4, java.nio.IntBuffer r5, java.nio.IntBuffer r6, java.nio.IntBuffer r7, java.nio.IntBuffer r8, java.nio.IntBuffer r9, java.nio.IntBuffer r10, org.lwjgl.system.linux.liburing.IOURingSQE r11, int r12, int r13, java.nio.ByteBuffer r14, int r15, int r16) {
            r3 = this;
            r0 = r3
            r1 = r4
            org.lwjgl.system.linux.liburing.IOURingSQ r0 = r0.khead(r1)
            r0 = r3
            r1 = r5
            org.lwjgl.system.linux.liburing.IOURingSQ r0 = r0.ktail(r1)
            r0 = r3
            r1 = r6
            org.lwjgl.system.linux.liburing.IOURingSQ r0 = r0.kring_mask(r1)
            r0 = r3
            r1 = r7
            org.lwjgl.system.linux.liburing.IOURingSQ r0 = r0.kring_entries(r1)
            r0 = r3
            r1 = r8
            org.lwjgl.system.linux.liburing.IOURingSQ r0 = r0.kflags(r1)
            r0 = r3
            r1 = r9
            org.lwjgl.system.linux.liburing.IOURingSQ r0 = r0.kdropped(r1)
            r0 = r3
            r1 = r10
            org.lwjgl.system.linux.liburing.IOURingSQ r0 = r0.array(r1)
            r0 = r3
            r1 = r11
            org.lwjgl.system.linux.liburing.IOURingSQ r0 = r0.sqes(r1)
            r0 = r3
            r1 = r12
            org.lwjgl.system.linux.liburing.IOURingSQ r0 = r0.sqe_head(r1)
            r0 = r3
            r1 = r13
            org.lwjgl.system.linux.liburing.IOURingSQ r0 = r0.sqe_tail(r1)
            r0 = r3
            r1 = r14
            org.lwjgl.system.linux.liburing.IOURingSQ r0 = r0.ring_ptr(r1)
            r0 = r3
            r1 = r15
            org.lwjgl.system.linux.liburing.IOURingSQ r0 = r0.ring_mask(r1)
            r0 = r3
            r1 = r16
            org.lwjgl.system.linux.liburing.IOURingSQ r0 = r0.ring_entries(r1)
            r0 = r3
            return r0
    }

    public org.lwjgl.system.linux.liburing.IOURingSQ set(org.lwjgl.system.linux.liburing.IOURingSQ r7) {
            r6 = this;
            r0 = r7
            long r0 = r0.address()
            r1 = r6
            long r1 = r1.address()
            int r2 = org.lwjgl.system.linux.liburing.IOURingSQ.SIZEOF
            org.lwjgl.system.MemoryUtil.memCopy(r0, r1, r2)
            r0 = r6
            return r0
    }

    public static org.lwjgl.system.linux.liburing.IOURingSQ malloc() {
            org.lwjgl.system.linux.liburing.IOURingSQ r0 = new org.lwjgl.system.linux.liburing.IOURingSQ
            r1 = r0
            int r2 = org.lwjgl.system.linux.liburing.IOURingSQ.SIZEOF
            long r2 = (long) r2
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.system.linux.liburing.IOURingSQ calloc() {
            org.lwjgl.system.linux.liburing.IOURingSQ r0 = new org.lwjgl.system.linux.liburing.IOURingSQ
            r1 = r0
            r2 = 1
            int r3 = org.lwjgl.system.linux.liburing.IOURingSQ.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.system.linux.liburing.IOURingSQ create() {
            int r0 = org.lwjgl.system.linux.liburing.IOURingSQ.SIZEOF
            java.nio.ByteBuffer r0 = org.lwjgl.BufferUtils.createByteBuffer(r0)
            r6 = r0
            org.lwjgl.system.linux.liburing.IOURingSQ r0 = new org.lwjgl.system.linux.liburing.IOURingSQ
            r1 = r0
            r2 = r6
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.system.linux.liburing.IOURingSQ create(long r6) {
            org.lwjgl.system.linux.liburing.IOURingSQ r0 = new org.lwjgl.system.linux.liburing.IOURingSQ
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.system.linux.liburing.IOURingSQ createSafe(long r6) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.system.linux.liburing.IOURingSQ r0 = new org.lwjgl.system.linux.liburing.IOURingSQ
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static org.lwjgl.system.linux.liburing.IOURingSQ.Buffer malloc(int r6) {
            org.lwjgl.system.linux.liburing.IOURingSQ$Buffer r0 = new org.lwjgl.system.linux.liburing.IOURingSQ$Buffer
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.system.linux.liburing.IOURingSQ.SIZEOF
            long r2 = __checkMalloc(r2, r3)
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.system.linux.liburing.IOURingSQ.Buffer calloc(int r7) {
            org.lwjgl.system.linux.liburing.IOURingSQ$Buffer r0 = new org.lwjgl.system.linux.liburing.IOURingSQ$Buffer
            r1 = r0
            r2 = r7
            long r2 = (long) r2
            int r3 = org.lwjgl.system.linux.liburing.IOURingSQ.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.system.linux.liburing.IOURingSQ.Buffer create(int r10) {
            r0 = r10
            int r1 = org.lwjgl.system.linux.liburing.IOURingSQ.SIZEOF
            java.nio.ByteBuffer r0 = __create(r0, r1)
            r11 = r0
            org.lwjgl.system.linux.liburing.IOURingSQ$Buffer r0 = new org.lwjgl.system.linux.liburing.IOURingSQ$Buffer
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

    public static org.lwjgl.system.linux.liburing.IOURingSQ.Buffer create(long r6, int r8) {
            org.lwjgl.system.linux.liburing.IOURingSQ$Buffer r0 = new org.lwjgl.system.linux.liburing.IOURingSQ$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.system.linux.liburing.IOURingSQ.Buffer createSafe(long r6, int r8) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.system.linux.liburing.IOURingSQ$Buffer r0 = new org.lwjgl.system.linux.liburing.IOURingSQ$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static org.lwjgl.system.linux.liburing.IOURingSQ malloc(org.lwjgl.system.MemoryStack r6) {
            org.lwjgl.system.linux.liburing.IOURingSQ r0 = new org.lwjgl.system.linux.liburing.IOURingSQ
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.system.linux.liburing.IOURingSQ.ALIGNOF
            int r4 = org.lwjgl.system.linux.liburing.IOURingSQ.SIZEOF
            long r2 = r2.nmalloc(r3, r4)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.system.linux.liburing.IOURingSQ calloc(org.lwjgl.system.MemoryStack r7) {
            org.lwjgl.system.linux.liburing.IOURingSQ r0 = new org.lwjgl.system.linux.liburing.IOURingSQ
            r1 = r0
            r2 = r7
            int r3 = org.lwjgl.system.linux.liburing.IOURingSQ.ALIGNOF
            r4 = 1
            int r5 = org.lwjgl.system.linux.liburing.IOURingSQ.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.system.linux.liburing.IOURingSQ.Buffer malloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.system.linux.liburing.IOURingSQ$Buffer r0 = new org.lwjgl.system.linux.liburing.IOURingSQ$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.system.linux.liburing.IOURingSQ.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.system.linux.liburing.IOURingSQ.SIZEOF
            int r4 = r4 * r5
            long r2 = r2.nmalloc(r3, r4)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.system.linux.liburing.IOURingSQ.Buffer calloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.system.linux.liburing.IOURingSQ$Buffer r0 = new org.lwjgl.system.linux.liburing.IOURingSQ$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.system.linux.liburing.IOURingSQ.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.system.linux.liburing.IOURingSQ.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static java.nio.IntBuffer nkhead(long r5, int r7) {
            r0 = r5
            int r1 = org.lwjgl.system.linux.liburing.IOURingSQ.KHEAD
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            r1 = r7
            java.nio.IntBuffer r0 = org.lwjgl.system.MemoryUtil.memIntBuffer(r0, r1)
            return r0
    }

    public static java.nio.IntBuffer nktail(long r5, int r7) {
            r0 = r5
            int r1 = org.lwjgl.system.linux.liburing.IOURingSQ.KTAIL
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            r1 = r7
            java.nio.IntBuffer r0 = org.lwjgl.system.MemoryUtil.memIntBuffer(r0, r1)
            return r0
    }

    public static java.nio.IntBuffer nkring_mask(long r5, int r7) {
            r0 = r5
            int r1 = org.lwjgl.system.linux.liburing.IOURingSQ.KRING_MASK
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            r1 = r7
            java.nio.IntBuffer r0 = org.lwjgl.system.MemoryUtil.memIntBuffer(r0, r1)
            return r0
    }

    public static java.nio.IntBuffer nkring_entries(long r5, int r7) {
            r0 = r5
            int r1 = org.lwjgl.system.linux.liburing.IOURingSQ.KRING_ENTRIES
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            r1 = r7
            java.nio.IntBuffer r0 = org.lwjgl.system.MemoryUtil.memIntBuffer(r0, r1)
            return r0
    }

    public static java.nio.IntBuffer nkflags(long r5, int r7) {
            r0 = r5
            int r1 = org.lwjgl.system.linux.liburing.IOURingSQ.KFLAGS
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            r1 = r7
            java.nio.IntBuffer r0 = org.lwjgl.system.MemoryUtil.memIntBuffer(r0, r1)
            return r0
    }

    public static java.nio.IntBuffer nkdropped(long r5, int r7) {
            r0 = r5
            int r1 = org.lwjgl.system.linux.liburing.IOURingSQ.KDROPPED
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            r1 = r7
            java.nio.IntBuffer r0 = org.lwjgl.system.MemoryUtil.memIntBuffer(r0, r1)
            return r0
    }

    public static java.nio.IntBuffer narray(long r5, int r7) {
            r0 = r5
            int r1 = org.lwjgl.system.linux.liburing.IOURingSQ.ARRAY
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            r1 = r7
            java.nio.IntBuffer r0 = org.lwjgl.system.MemoryUtil.memIntBuffer(r0, r1)
            return r0
    }

    public static org.lwjgl.system.linux.liburing.IOURingSQE nsqes(long r5) {
            r0 = r5
            int r1 = org.lwjgl.system.linux.liburing.IOURingSQ.SQES
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            org.lwjgl.system.linux.liburing.IOURingSQE r0 = org.lwjgl.system.linux.liburing.IOURingSQE.create(r0)
            return r0
    }

    public static int nsqe_head(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.system.linux.liburing.IOURingSQ.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.system.linux.liburing.IOURingSQ.SQE_HEAD
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int nsqe_tail(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.system.linux.liburing.IOURingSQ.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.system.linux.liburing.IOURingSQ.SQE_TAIL
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static long nring_sz(long r5) {
            r0 = r5
            int r1 = org.lwjgl.system.linux.liburing.IOURingSQ.RING_SZ
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            return r0
    }

    public static java.nio.ByteBuffer nring_ptr(long r5) {
            r0 = r5
            int r1 = org.lwjgl.system.linux.liburing.IOURingSQ.RING_PTR
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            r1 = r5
            long r1 = nring_sz(r1)
            int r1 = (int) r1
            java.nio.ByteBuffer r0 = org.lwjgl.system.MemoryUtil.memByteBuffer(r0, r1)
            return r0
    }

    public static int nring_mask(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.system.linux.liburing.IOURingSQ.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.system.linux.liburing.IOURingSQ.RING_MASK
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int nring_entries(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.system.linux.liburing.IOURingSQ.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.system.linux.liburing.IOURingSQ.RING_ENTRIES
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static java.nio.IntBuffer npad(long r5) {
            r0 = r5
            int r1 = org.lwjgl.system.linux.liburing.IOURingSQ.PAD
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = 2
            java.nio.IntBuffer r0 = org.lwjgl.system.MemoryUtil.memIntBuffer(r0, r1)
            return r0
    }

    public static int npad(long r9, int r11) {
            sun.misc.Unsafe r0 = org.lwjgl.system.linux.liburing.IOURingSQ.UNSAFE
            r1 = 0
            r2 = r9
            int r3 = org.lwjgl.system.linux.liburing.IOURingSQ.PAD
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r11
            r4 = 2
            long r3 = org.lwjgl.system.Checks.check(r3, r4)
            r4 = 4
            long r3 = r3 * r4
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static void nkhead(long r5, java.nio.IntBuffer r7) {
            r0 = r5
            int r1 = org.lwjgl.system.linux.liburing.IOURingSQ.KHEAD
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            org.lwjgl.system.MemoryUtil.memPutAddress(r0, r1)
            return
    }

    public static void nktail(long r5, java.nio.IntBuffer r7) {
            r0 = r5
            int r1 = org.lwjgl.system.linux.liburing.IOURingSQ.KTAIL
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            org.lwjgl.system.MemoryUtil.memPutAddress(r0, r1)
            return
    }

    public static void nkring_mask(long r5, java.nio.IntBuffer r7) {
            r0 = r5
            int r1 = org.lwjgl.system.linux.liburing.IOURingSQ.KRING_MASK
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            org.lwjgl.system.MemoryUtil.memPutAddress(r0, r1)
            return
    }

    public static void nkring_entries(long r5, java.nio.IntBuffer r7) {
            r0 = r5
            int r1 = org.lwjgl.system.linux.liburing.IOURingSQ.KRING_ENTRIES
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            org.lwjgl.system.MemoryUtil.memPutAddress(r0, r1)
            return
    }

    public static void nkflags(long r5, java.nio.IntBuffer r7) {
            r0 = r5
            int r1 = org.lwjgl.system.linux.liburing.IOURingSQ.KFLAGS
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            org.lwjgl.system.MemoryUtil.memPutAddress(r0, r1)
            return
    }

    public static void nkdropped(long r5, java.nio.IntBuffer r7) {
            r0 = r5
            int r1 = org.lwjgl.system.linux.liburing.IOURingSQ.KDROPPED
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            org.lwjgl.system.MemoryUtil.memPutAddress(r0, r1)
            return
    }

    public static void narray(long r5, java.nio.IntBuffer r7) {
            r0 = r5
            int r1 = org.lwjgl.system.linux.liburing.IOURingSQ.ARRAY
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            org.lwjgl.system.MemoryUtil.memPutAddress(r0, r1)
            return
    }

    public static void nsqes(long r5, org.lwjgl.system.linux.liburing.IOURingSQE r7) {
            r0 = r5
            int r1 = org.lwjgl.system.linux.liburing.IOURingSQ.SQES
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            long r1 = r1.address()
            org.lwjgl.system.MemoryUtil.memPutAddress(r0, r1)
            return
    }

    public static void nsqe_head(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.system.linux.liburing.IOURingSQ.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.system.linux.liburing.IOURingSQ.SQE_HEAD
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void nsqe_tail(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.system.linux.liburing.IOURingSQ.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.system.linux.liburing.IOURingSQ.SQE_TAIL
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void nring_sz(long r5, long r7) {
            r0 = r5
            int r1 = org.lwjgl.system.linux.liburing.IOURingSQ.RING_SZ
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            org.lwjgl.system.MemoryUtil.memPutAddress(r0, r1)
            return
    }

    public static void nring_ptr(long r5, java.nio.ByteBuffer r7) {
            r0 = r5
            int r1 = org.lwjgl.system.linux.liburing.IOURingSQ.RING_PTR
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            org.lwjgl.system.MemoryUtil.memPutAddress(r0, r1)
            r0 = r5
            r1 = r7
            int r1 = r1.remaining()
            long r1 = (long) r1
            nring_sz(r0, r1)
            return
    }

    public static void nring_mask(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.system.linux.liburing.IOURingSQ.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.system.linux.liburing.IOURingSQ.RING_MASK
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void nring_entries(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.system.linux.liburing.IOURingSQ.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.system.linux.liburing.IOURingSQ.RING_ENTRIES
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void npad(long r7, java.nio.IntBuffer r9) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r9
            r1 = 2
            org.lwjgl.system.Checks.checkGT(r0, r1)
        Lb:
            r0 = r9
            long r0 = org.lwjgl.system.MemoryUtil.memAddress(r0)
            r1 = r7
            int r2 = org.lwjgl.system.linux.liburing.IOURingSQ.PAD
            long r2 = (long) r2
            long r1 = r1 + r2
            r2 = r9
            int r2 = r2.remaining()
            r3 = 4
            int r2 = r2 * r3
            org.lwjgl.system.MemoryUtil.memCopy(r0, r1, r2)
            return
    }

    public static void npad(long r9, int r11, int r12) {
            sun.misc.Unsafe r0 = org.lwjgl.system.linux.liburing.IOURingSQ.UNSAFE
            r1 = 0
            r2 = r9
            int r3 = org.lwjgl.system.linux.liburing.IOURingSQ.PAD
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r11
            r4 = 2
            long r3 = org.lwjgl.system.Checks.check(r3, r4)
            r4 = 4
            long r3 = r3 * r4
            long r2 = r2 + r3
            r3 = r12
            r0.putInt(r1, r2, r3)
            return
    }

    public static void validate(long r5) {
            r0 = r5
            int r1 = org.lwjgl.system.linux.liburing.IOURingSQ.KHEAD
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r5
            int r1 = org.lwjgl.system.linux.liburing.IOURingSQ.KTAIL
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r5
            int r1 = org.lwjgl.system.linux.liburing.IOURingSQ.KRING_MASK
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r5
            int r1 = org.lwjgl.system.linux.liburing.IOURingSQ.KRING_ENTRIES
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r5
            int r1 = org.lwjgl.system.linux.liburing.IOURingSQ.KFLAGS
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r5
            int r1 = org.lwjgl.system.linux.liburing.IOURingSQ.KDROPPED
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r5
            int r1 = org.lwjgl.system.linux.liburing.IOURingSQ.ARRAY
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r5
            int r1 = org.lwjgl.system.linux.liburing.IOURingSQ.SQES
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r5
            int r1 = org.lwjgl.system.linux.liburing.IOURingSQ.RING_PTR
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            long r0 = org.lwjgl.system.Checks.check(r0)
            return
    }

    @Override // org.lwjgl.system.Struct
    protected /* bridge */ /* synthetic */ org.lwjgl.system.Struct create(long r6, @javax.annotation.Nullable java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            org.lwjgl.system.linux.liburing.IOURingSQ r0 = r0.create(r1, r2)
            return r0
    }

    static {
            r0 = 15
            org.lwjgl.system.Struct$Member[] r0 = new org.lwjgl.system.Struct.Member[r0]
            r1 = r0
            r2 = 0
            int r3 = org.lwjgl.system.linux.liburing.IOURingSQ.POINTER_SIZE
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 1
            int r3 = org.lwjgl.system.linux.liburing.IOURingSQ.POINTER_SIZE
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 2
            int r3 = org.lwjgl.system.linux.liburing.IOURingSQ.POINTER_SIZE
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 3
            int r3 = org.lwjgl.system.linux.liburing.IOURingSQ.POINTER_SIZE
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 4
            int r3 = org.lwjgl.system.linux.liburing.IOURingSQ.POINTER_SIZE
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 5
            int r3 = org.lwjgl.system.linux.liburing.IOURingSQ.POINTER_SIZE
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 6
            int r3 = org.lwjgl.system.linux.liburing.IOURingSQ.POINTER_SIZE
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 7
            int r3 = org.lwjgl.system.linux.liburing.IOURingSQ.POINTER_SIZE
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 8
            r3 = 4
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 9
            r3 = 4
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 10
            int r3 = org.lwjgl.system.linux.liburing.IOURingSQ.POINTER_SIZE
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 11
            int r3 = org.lwjgl.system.linux.liburing.IOURingSQ.POINTER_SIZE
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 12
            r3 = 4
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 13
            r3 = 4
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 14
            r3 = 4
            r4 = 2
            org.lwjgl.system.Struct$Member r3 = __array(r3, r4)
            r1[r2] = r3
            org.lwjgl.system.Struct$Layout r0 = __struct(r0)
            r6 = r0
            r0 = r6
            int r0 = r0.getSize()
            org.lwjgl.system.linux.liburing.IOURingSQ.SIZEOF = r0
            r0 = r6
            int r0 = r0.getAlignment()
            org.lwjgl.system.linux.liburing.IOURingSQ.ALIGNOF = r0
            r0 = r6
            r1 = 0
            int r0 = r0.offsetof(r1)
            org.lwjgl.system.linux.liburing.IOURingSQ.KHEAD = r0
            r0 = r6
            r1 = 1
            int r0 = r0.offsetof(r1)
            org.lwjgl.system.linux.liburing.IOURingSQ.KTAIL = r0
            r0 = r6
            r1 = 2
            int r0 = r0.offsetof(r1)
            org.lwjgl.system.linux.liburing.IOURingSQ.KRING_MASK = r0
            r0 = r6
            r1 = 3
            int r0 = r0.offsetof(r1)
            org.lwjgl.system.linux.liburing.IOURingSQ.KRING_ENTRIES = r0
            r0 = r6
            r1 = 4
            int r0 = r0.offsetof(r1)
            org.lwjgl.system.linux.liburing.IOURingSQ.KFLAGS = r0
            r0 = r6
            r1 = 5
            int r0 = r0.offsetof(r1)
            org.lwjgl.system.linux.liburing.IOURingSQ.KDROPPED = r0
            r0 = r6
            r1 = 6
            int r0 = r0.offsetof(r1)
            org.lwjgl.system.linux.liburing.IOURingSQ.ARRAY = r0
            r0 = r6
            r1 = 7
            int r0 = r0.offsetof(r1)
            org.lwjgl.system.linux.liburing.IOURingSQ.SQES = r0
            r0 = r6
            r1 = 8
            int r0 = r0.offsetof(r1)
            org.lwjgl.system.linux.liburing.IOURingSQ.SQE_HEAD = r0
            r0 = r6
            r1 = 9
            int r0 = r0.offsetof(r1)
            org.lwjgl.system.linux.liburing.IOURingSQ.SQE_TAIL = r0
            r0 = r6
            r1 = 10
            int r0 = r0.offsetof(r1)
            org.lwjgl.system.linux.liburing.IOURingSQ.RING_SZ = r0
            r0 = r6
            r1 = 11
            int r0 = r0.offsetof(r1)
            org.lwjgl.system.linux.liburing.IOURingSQ.RING_PTR = r0
            r0 = r6
            r1 = 12
            int r0 = r0.offsetof(r1)
            org.lwjgl.system.linux.liburing.IOURingSQ.RING_MASK = r0
            r0 = r6
            r1 = 13
            int r0 = r0.offsetof(r1)
            org.lwjgl.system.linux.liburing.IOURingSQ.RING_ENTRIES = r0
            r0 = r6
            r1 = 14
            int r0 = r0.offsetof(r1)
            org.lwjgl.system.linux.liburing.IOURingSQ.PAD = r0
            return
    }
}
