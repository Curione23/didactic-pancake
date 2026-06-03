package org.lwjgl.system.linux.liburing;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/system/linux/liburing/IOURingCQ.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/system/linux/liburing/IOURingCQ.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/system/linux/liburing/IOURingCQ.class */
@org.lwjgl.system.NativeType("struct io_uring_cq")
public class IOURingCQ extends org.lwjgl.system.Struct<org.lwjgl.system.linux.liburing.IOURingCQ> implements org.lwjgl.system.NativeResource {
    public static final int SIZEOF = 0;
    public static final int ALIGNOF = 0;
    public static final int KHEAD = 0;
    public static final int KTAIL = 0;
    public static final int KRING_MASK = 0;
    public static final int KRING_ENTRIES = 0;
    public static final int KFLAGS = 0;
    public static final int KOVERFLOW = 0;
    public static final int CQES = 0;
    public static final int RING_SZ = 0;
    public static final int RING_PTR = 0;
    public static final int RING_MASK = 0;
    public static final int RING_ENTRIES = 0;
    public static final int PAD = 0;

    /* JADX WARN: Classes with same name are omitted, all sources:
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/system/linux/liburing/IOURingCQ$Buffer.class
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/system/linux/liburing/IOURingCQ$Buffer.class
     */
    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/system/linux/liburing/IOURingCQ$Buffer.class */
    public static class Buffer extends org.lwjgl.system.StructBuffer<org.lwjgl.system.linux.liburing.IOURingCQ, org.lwjgl.system.linux.liburing.IOURingCQ.Buffer> implements org.lwjgl.system.NativeResource {
        private static final org.lwjgl.system.linux.liburing.IOURingCQ ELEMENT_FACTORY = null;

        public Buffer(java.nio.ByteBuffer r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r6
                int r2 = r2.remaining()
                int r3 = org.lwjgl.system.linux.liburing.IOURingCQ.SIZEOF
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
        protected org.lwjgl.system.linux.liburing.IOURingCQ.Buffer self() {
                r2 = this;
                r0 = r2
                return r0
        }

        @Override // org.lwjgl.system.StructBuffer
        protected org.lwjgl.system.linux.liburing.IOURingCQ getElementFactory() {
                r2 = this;
                org.lwjgl.system.linux.liburing.IOURingCQ r0 = org.lwjgl.system.linux.liburing.IOURingCQ.Buffer.ELEMENT_FACTORY
                return r0
        }

        @org.lwjgl.system.NativeType("unsigned *")
        public java.nio.IntBuffer khead(int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                java.nio.IntBuffer r0 = org.lwjgl.system.linux.liburing.IOURingCQ.nkhead(r0, r1)
                return r0
        }

        @org.lwjgl.system.NativeType("unsigned *")
        public java.nio.IntBuffer ktail(int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                java.nio.IntBuffer r0 = org.lwjgl.system.linux.liburing.IOURingCQ.nktail(r0, r1)
                return r0
        }

        @org.lwjgl.system.NativeType("unsigned *")
        public java.nio.IntBuffer kring_mask(int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                java.nio.IntBuffer r0 = org.lwjgl.system.linux.liburing.IOURingCQ.nkring_mask(r0, r1)
                return r0
        }

        @org.lwjgl.system.NativeType("unsigned *")
        public java.nio.IntBuffer kring_entries(int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                java.nio.IntBuffer r0 = org.lwjgl.system.linux.liburing.IOURingCQ.nkring_entries(r0, r1)
                return r0
        }

        @org.lwjgl.system.NativeType("unsigned *")
        public java.nio.IntBuffer kflags(int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                java.nio.IntBuffer r0 = org.lwjgl.system.linux.liburing.IOURingCQ.nkflags(r0, r1)
                return r0
        }

        @org.lwjgl.system.NativeType("unsigned *")
        public java.nio.IntBuffer koverflow(int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                java.nio.IntBuffer r0 = org.lwjgl.system.linux.liburing.IOURingCQ.nkoverflow(r0, r1)
                return r0
        }

        @org.lwjgl.system.NativeType("struct io_uring_cqe *")
        public org.lwjgl.system.linux.liburing.IOURingCQE cqes() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                org.lwjgl.system.linux.liburing.IOURingCQE r0 = org.lwjgl.system.linux.liburing.IOURingCQ.ncqes(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("size_t")
        public long ring_sz() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                long r0 = org.lwjgl.system.linux.liburing.IOURingCQ.nring_sz(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("void *")
        public java.nio.ByteBuffer ring_ptr() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                java.nio.ByteBuffer r0 = org.lwjgl.system.linux.liburing.IOURingCQ.nring_ptr(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("unsigned")
        public int ring_mask() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.system.linux.liburing.IOURingCQ.nring_mask(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("unsigned")
        public int ring_entries() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.system.linux.liburing.IOURingCQ.nring_entries(r0)
                return r0
        }

        public org.lwjgl.system.linux.liburing.IOURingCQ.Buffer khead(@org.lwjgl.system.NativeType("unsigned *") java.nio.IntBuffer r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.system.linux.liburing.IOURingCQ.nkhead(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.system.linux.liburing.IOURingCQ.Buffer ktail(@org.lwjgl.system.NativeType("unsigned *") java.nio.IntBuffer r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.system.linux.liburing.IOURingCQ.nktail(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.system.linux.liburing.IOURingCQ.Buffer kring_mask(@org.lwjgl.system.NativeType("unsigned *") java.nio.IntBuffer r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.system.linux.liburing.IOURingCQ.nkring_mask(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.system.linux.liburing.IOURingCQ.Buffer kring_entries(@org.lwjgl.system.NativeType("unsigned *") java.nio.IntBuffer r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.system.linux.liburing.IOURingCQ.nkring_entries(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.system.linux.liburing.IOURingCQ.Buffer kflags(@org.lwjgl.system.NativeType("unsigned *") java.nio.IntBuffer r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.system.linux.liburing.IOURingCQ.nkflags(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.system.linux.liburing.IOURingCQ.Buffer koverflow(@org.lwjgl.system.NativeType("unsigned *") java.nio.IntBuffer r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.system.linux.liburing.IOURingCQ.nkoverflow(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.system.linux.liburing.IOURingCQ.Buffer cqes(@org.lwjgl.system.NativeType("struct io_uring_cqe *") org.lwjgl.system.linux.liburing.IOURingCQE r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.system.linux.liburing.IOURingCQ.ncqes(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.system.linux.liburing.IOURingCQ.Buffer ring_ptr(@org.lwjgl.system.NativeType("void *") java.nio.ByteBuffer r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.system.linux.liburing.IOURingCQ.nring_ptr(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.system.linux.liburing.IOURingCQ.Buffer ring_mask(@org.lwjgl.system.NativeType("unsigned") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.system.linux.liburing.IOURingCQ.nring_mask(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.system.linux.liburing.IOURingCQ.Buffer ring_entries(@org.lwjgl.system.NativeType("unsigned") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.system.linux.liburing.IOURingCQ.nring_entries(r0, r1)
                r0 = r4
                return r0
        }

        @Override // org.lwjgl.system.StructBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.Struct getElementFactory() {
                r2 = this;
                r0 = r2
                org.lwjgl.system.linux.liburing.IOURingCQ r0 = r0.getElementFactory()
                return r0
        }

        @Override // org.lwjgl.system.CustomBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.CustomBuffer self() {
                r2 = this;
                r0 = r2
                org.lwjgl.system.linux.liburing.IOURingCQ$Buffer r0 = r0.self()
                return r0
        }

        static {
                r0 = -1
                org.lwjgl.system.linux.liburing.IOURingCQ r0 = org.lwjgl.system.linux.liburing.IOURingCQ.create(r0)
                org.lwjgl.system.linux.liburing.IOURingCQ.Buffer.ELEMENT_FACTORY = r0
                return
        }
    }

    protected IOURingCQ(long r6, @javax.annotation.Nullable java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    protected org.lwjgl.system.linux.liburing.IOURingCQ create(long r7, @javax.annotation.Nullable java.nio.ByteBuffer r9) {
            r6 = this;
            org.lwjgl.system.linux.liburing.IOURingCQ r0 = new org.lwjgl.system.linux.liburing.IOURingCQ
            r1 = r0
            r2 = r7
            r3 = r9
            r1.<init>(r2, r3)
            return r0
    }

    public IOURingCQ(java.nio.ByteBuffer r7) {
            r6 = this;
            r0 = r6
            r1 = r7
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            r2 = r7
            int r3 = org.lwjgl.system.linux.liburing.IOURingCQ.SIZEOF
            java.nio.ByteBuffer r2 = __checkContainer(r2, r3)
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
            r2 = this;
            int r0 = org.lwjgl.system.linux.liburing.IOURingCQ.SIZEOF
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
    public java.nio.IntBuffer koverflow(int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            java.nio.IntBuffer r0 = nkoverflow(r0, r1)
            return r0
    }

    @org.lwjgl.system.NativeType("struct io_uring_cqe *")
    public org.lwjgl.system.linux.liburing.IOURingCQE cqes() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            org.lwjgl.system.linux.liburing.IOURingCQE r0 = ncqes(r0)
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

    public org.lwjgl.system.linux.liburing.IOURingCQ khead(@org.lwjgl.system.NativeType("unsigned *") java.nio.IntBuffer r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nkhead(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.system.linux.liburing.IOURingCQ ktail(@org.lwjgl.system.NativeType("unsigned *") java.nio.IntBuffer r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nktail(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.system.linux.liburing.IOURingCQ kring_mask(@org.lwjgl.system.NativeType("unsigned *") java.nio.IntBuffer r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nkring_mask(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.system.linux.liburing.IOURingCQ kring_entries(@org.lwjgl.system.NativeType("unsigned *") java.nio.IntBuffer r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nkring_entries(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.system.linux.liburing.IOURingCQ kflags(@org.lwjgl.system.NativeType("unsigned *") java.nio.IntBuffer r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nkflags(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.system.linux.liburing.IOURingCQ koverflow(@org.lwjgl.system.NativeType("unsigned *") java.nio.IntBuffer r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nkoverflow(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.system.linux.liburing.IOURingCQ cqes(@org.lwjgl.system.NativeType("struct io_uring_cqe *") org.lwjgl.system.linux.liburing.IOURingCQE r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            ncqes(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.system.linux.liburing.IOURingCQ ring_ptr(@org.lwjgl.system.NativeType("void *") java.nio.ByteBuffer r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nring_ptr(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.system.linux.liburing.IOURingCQ ring_mask(@org.lwjgl.system.NativeType("unsigned") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nring_mask(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.system.linux.liburing.IOURingCQ ring_entries(@org.lwjgl.system.NativeType("unsigned") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nring_entries(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.system.linux.liburing.IOURingCQ set(java.nio.IntBuffer r4, java.nio.IntBuffer r5, java.nio.IntBuffer r6, java.nio.IntBuffer r7, java.nio.IntBuffer r8, java.nio.IntBuffer r9, org.lwjgl.system.linux.liburing.IOURingCQE r10, java.nio.ByteBuffer r11, int r12, int r13) {
            r3 = this;
            r0 = r3
            r1 = r4
            org.lwjgl.system.linux.liburing.IOURingCQ r0 = r0.khead(r1)
            r0 = r3
            r1 = r5
            org.lwjgl.system.linux.liburing.IOURingCQ r0 = r0.ktail(r1)
            r0 = r3
            r1 = r6
            org.lwjgl.system.linux.liburing.IOURingCQ r0 = r0.kring_mask(r1)
            r0 = r3
            r1 = r7
            org.lwjgl.system.linux.liburing.IOURingCQ r0 = r0.kring_entries(r1)
            r0 = r3
            r1 = r8
            org.lwjgl.system.linux.liburing.IOURingCQ r0 = r0.kflags(r1)
            r0 = r3
            r1 = r9
            org.lwjgl.system.linux.liburing.IOURingCQ r0 = r0.koverflow(r1)
            r0 = r3
            r1 = r10
            org.lwjgl.system.linux.liburing.IOURingCQ r0 = r0.cqes(r1)
            r0 = r3
            r1 = r11
            org.lwjgl.system.linux.liburing.IOURingCQ r0 = r0.ring_ptr(r1)
            r0 = r3
            r1 = r12
            org.lwjgl.system.linux.liburing.IOURingCQ r0 = r0.ring_mask(r1)
            r0 = r3
            r1 = r13
            org.lwjgl.system.linux.liburing.IOURingCQ r0 = r0.ring_entries(r1)
            r0 = r3
            return r0
    }

    public org.lwjgl.system.linux.liburing.IOURingCQ set(org.lwjgl.system.linux.liburing.IOURingCQ r7) {
            r6 = this;
            r0 = r7
            long r0 = r0.address()
            r1 = r6
            long r1 = r1.address()
            int r2 = org.lwjgl.system.linux.liburing.IOURingCQ.SIZEOF
            org.lwjgl.system.MemoryUtil.memCopy(r0, r1, r2)
            r0 = r6
            return r0
    }

    public static org.lwjgl.system.linux.liburing.IOURingCQ malloc() {
            org.lwjgl.system.linux.liburing.IOURingCQ r0 = new org.lwjgl.system.linux.liburing.IOURingCQ
            r1 = r0
            int r2 = org.lwjgl.system.linux.liburing.IOURingCQ.SIZEOF
            long r2 = (long) r2
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.system.linux.liburing.IOURingCQ calloc() {
            org.lwjgl.system.linux.liburing.IOURingCQ r0 = new org.lwjgl.system.linux.liburing.IOURingCQ
            r1 = r0
            r2 = 1
            int r3 = org.lwjgl.system.linux.liburing.IOURingCQ.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.system.linux.liburing.IOURingCQ create() {
            int r0 = org.lwjgl.system.linux.liburing.IOURingCQ.SIZEOF
            java.nio.ByteBuffer r0 = org.lwjgl.BufferUtils.createByteBuffer(r0)
            r6 = r0
            org.lwjgl.system.linux.liburing.IOURingCQ r0 = new org.lwjgl.system.linux.liburing.IOURingCQ
            r1 = r0
            r2 = r6
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.system.linux.liburing.IOURingCQ create(long r6) {
            org.lwjgl.system.linux.liburing.IOURingCQ r0 = new org.lwjgl.system.linux.liburing.IOURingCQ
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.system.linux.liburing.IOURingCQ createSafe(long r6) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.system.linux.liburing.IOURingCQ r0 = new org.lwjgl.system.linux.liburing.IOURingCQ
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static org.lwjgl.system.linux.liburing.IOURingCQ.Buffer malloc(int r6) {
            org.lwjgl.system.linux.liburing.IOURingCQ$Buffer r0 = new org.lwjgl.system.linux.liburing.IOURingCQ$Buffer
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.system.linux.liburing.IOURingCQ.SIZEOF
            long r2 = __checkMalloc(r2, r3)
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.system.linux.liburing.IOURingCQ.Buffer calloc(int r7) {
            org.lwjgl.system.linux.liburing.IOURingCQ$Buffer r0 = new org.lwjgl.system.linux.liburing.IOURingCQ$Buffer
            r1 = r0
            r2 = r7
            long r2 = (long) r2
            int r3 = org.lwjgl.system.linux.liburing.IOURingCQ.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.system.linux.liburing.IOURingCQ.Buffer create(int r10) {
            r0 = r10
            int r1 = org.lwjgl.system.linux.liburing.IOURingCQ.SIZEOF
            java.nio.ByteBuffer r0 = __create(r0, r1)
            r11 = r0
            org.lwjgl.system.linux.liburing.IOURingCQ$Buffer r0 = new org.lwjgl.system.linux.liburing.IOURingCQ$Buffer
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

    public static org.lwjgl.system.linux.liburing.IOURingCQ.Buffer create(long r6, int r8) {
            org.lwjgl.system.linux.liburing.IOURingCQ$Buffer r0 = new org.lwjgl.system.linux.liburing.IOURingCQ$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.system.linux.liburing.IOURingCQ.Buffer createSafe(long r6, int r8) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.system.linux.liburing.IOURingCQ$Buffer r0 = new org.lwjgl.system.linux.liburing.IOURingCQ$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static org.lwjgl.system.linux.liburing.IOURingCQ malloc(org.lwjgl.system.MemoryStack r6) {
            org.lwjgl.system.linux.liburing.IOURingCQ r0 = new org.lwjgl.system.linux.liburing.IOURingCQ
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.system.linux.liburing.IOURingCQ.ALIGNOF
            int r4 = org.lwjgl.system.linux.liburing.IOURingCQ.SIZEOF
            long r2 = r2.nmalloc(r3, r4)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.system.linux.liburing.IOURingCQ calloc(org.lwjgl.system.MemoryStack r7) {
            org.lwjgl.system.linux.liburing.IOURingCQ r0 = new org.lwjgl.system.linux.liburing.IOURingCQ
            r1 = r0
            r2 = r7
            int r3 = org.lwjgl.system.linux.liburing.IOURingCQ.ALIGNOF
            r4 = 1
            int r5 = org.lwjgl.system.linux.liburing.IOURingCQ.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.system.linux.liburing.IOURingCQ.Buffer malloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.system.linux.liburing.IOURingCQ$Buffer r0 = new org.lwjgl.system.linux.liburing.IOURingCQ$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.system.linux.liburing.IOURingCQ.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.system.linux.liburing.IOURingCQ.SIZEOF
            int r4 = r4 * r5
            long r2 = r2.nmalloc(r3, r4)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.system.linux.liburing.IOURingCQ.Buffer calloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.system.linux.liburing.IOURingCQ$Buffer r0 = new org.lwjgl.system.linux.liburing.IOURingCQ$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.system.linux.liburing.IOURingCQ.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.system.linux.liburing.IOURingCQ.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static java.nio.IntBuffer nkhead(long r5, int r7) {
            r0 = r5
            int r1 = org.lwjgl.system.linux.liburing.IOURingCQ.KHEAD
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            r1 = r7
            java.nio.IntBuffer r0 = org.lwjgl.system.MemoryUtil.memIntBuffer(r0, r1)
            return r0
    }

    public static java.nio.IntBuffer nktail(long r5, int r7) {
            r0 = r5
            int r1 = org.lwjgl.system.linux.liburing.IOURingCQ.KTAIL
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            r1 = r7
            java.nio.IntBuffer r0 = org.lwjgl.system.MemoryUtil.memIntBuffer(r0, r1)
            return r0
    }

    public static java.nio.IntBuffer nkring_mask(long r5, int r7) {
            r0 = r5
            int r1 = org.lwjgl.system.linux.liburing.IOURingCQ.KRING_MASK
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            r1 = r7
            java.nio.IntBuffer r0 = org.lwjgl.system.MemoryUtil.memIntBuffer(r0, r1)
            return r0
    }

    public static java.nio.IntBuffer nkring_entries(long r5, int r7) {
            r0 = r5
            int r1 = org.lwjgl.system.linux.liburing.IOURingCQ.KRING_ENTRIES
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            r1 = r7
            java.nio.IntBuffer r0 = org.lwjgl.system.MemoryUtil.memIntBuffer(r0, r1)
            return r0
    }

    public static java.nio.IntBuffer nkflags(long r5, int r7) {
            r0 = r5
            int r1 = org.lwjgl.system.linux.liburing.IOURingCQ.KFLAGS
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            r1 = r7
            java.nio.IntBuffer r0 = org.lwjgl.system.MemoryUtil.memIntBuffer(r0, r1)
            return r0
    }

    public static java.nio.IntBuffer nkoverflow(long r5, int r7) {
            r0 = r5
            int r1 = org.lwjgl.system.linux.liburing.IOURingCQ.KOVERFLOW
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            r1 = r7
            java.nio.IntBuffer r0 = org.lwjgl.system.MemoryUtil.memIntBuffer(r0, r1)
            return r0
    }

    public static org.lwjgl.system.linux.liburing.IOURingCQE ncqes(long r5) {
            r0 = r5
            int r1 = org.lwjgl.system.linux.liburing.IOURingCQ.CQES
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            org.lwjgl.system.linux.liburing.IOURingCQE r0 = org.lwjgl.system.linux.liburing.IOURingCQE.create(r0)
            return r0
    }

    public static long nring_sz(long r5) {
            r0 = r5
            int r1 = org.lwjgl.system.linux.liburing.IOURingCQ.RING_SZ
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            return r0
    }

    public static java.nio.ByteBuffer nring_ptr(long r5) {
            r0 = r5
            int r1 = org.lwjgl.system.linux.liburing.IOURingCQ.RING_PTR
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
            sun.misc.Unsafe r0 = org.lwjgl.system.linux.liburing.IOURingCQ.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.system.linux.liburing.IOURingCQ.RING_MASK
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int nring_entries(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.system.linux.liburing.IOURingCQ.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.system.linux.liburing.IOURingCQ.RING_ENTRIES
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static java.nio.IntBuffer npad(long r5) {
            r0 = r5
            int r1 = org.lwjgl.system.linux.liburing.IOURingCQ.PAD
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = 2
            java.nio.IntBuffer r0 = org.lwjgl.system.MemoryUtil.memIntBuffer(r0, r1)
            return r0
    }

    public static int npad(long r9, int r11) {
            sun.misc.Unsafe r0 = org.lwjgl.system.linux.liburing.IOURingCQ.UNSAFE
            r1 = 0
            r2 = r9
            int r3 = org.lwjgl.system.linux.liburing.IOURingCQ.PAD
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
            int r1 = org.lwjgl.system.linux.liburing.IOURingCQ.KHEAD
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            org.lwjgl.system.MemoryUtil.memPutAddress(r0, r1)
            return
    }

    public static void nktail(long r5, java.nio.IntBuffer r7) {
            r0 = r5
            int r1 = org.lwjgl.system.linux.liburing.IOURingCQ.KTAIL
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            org.lwjgl.system.MemoryUtil.memPutAddress(r0, r1)
            return
    }

    public static void nkring_mask(long r5, java.nio.IntBuffer r7) {
            r0 = r5
            int r1 = org.lwjgl.system.linux.liburing.IOURingCQ.KRING_MASK
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            org.lwjgl.system.MemoryUtil.memPutAddress(r0, r1)
            return
    }

    public static void nkring_entries(long r5, java.nio.IntBuffer r7) {
            r0 = r5
            int r1 = org.lwjgl.system.linux.liburing.IOURingCQ.KRING_ENTRIES
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            org.lwjgl.system.MemoryUtil.memPutAddress(r0, r1)
            return
    }

    public static void nkflags(long r5, java.nio.IntBuffer r7) {
            r0 = r5
            int r1 = org.lwjgl.system.linux.liburing.IOURingCQ.KFLAGS
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            org.lwjgl.system.MemoryUtil.memPutAddress(r0, r1)
            return
    }

    public static void nkoverflow(long r5, java.nio.IntBuffer r7) {
            r0 = r5
            int r1 = org.lwjgl.system.linux.liburing.IOURingCQ.KOVERFLOW
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            org.lwjgl.system.MemoryUtil.memPutAddress(r0, r1)
            return
    }

    public static void ncqes(long r5, org.lwjgl.system.linux.liburing.IOURingCQE r7) {
            r0 = r5
            int r1 = org.lwjgl.system.linux.liburing.IOURingCQ.CQES
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            long r1 = r1.address()
            org.lwjgl.system.MemoryUtil.memPutAddress(r0, r1)
            return
    }

    public static void nring_sz(long r5, long r7) {
            r0 = r5
            int r1 = org.lwjgl.system.linux.liburing.IOURingCQ.RING_SZ
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            org.lwjgl.system.MemoryUtil.memPutAddress(r0, r1)
            return
    }

    public static void nring_ptr(long r5, java.nio.ByteBuffer r7) {
            r0 = r5
            int r1 = org.lwjgl.system.linux.liburing.IOURingCQ.RING_PTR
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
            sun.misc.Unsafe r0 = org.lwjgl.system.linux.liburing.IOURingCQ.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.system.linux.liburing.IOURingCQ.RING_MASK
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void nring_entries(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.system.linux.liburing.IOURingCQ.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.system.linux.liburing.IOURingCQ.RING_ENTRIES
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
            int r2 = org.lwjgl.system.linux.liburing.IOURingCQ.PAD
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
            sun.misc.Unsafe r0 = org.lwjgl.system.linux.liburing.IOURingCQ.UNSAFE
            r1 = 0
            r2 = r9
            int r3 = org.lwjgl.system.linux.liburing.IOURingCQ.PAD
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
            int r1 = org.lwjgl.system.linux.liburing.IOURingCQ.KHEAD
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r5
            int r1 = org.lwjgl.system.linux.liburing.IOURingCQ.KTAIL
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r5
            int r1 = org.lwjgl.system.linux.liburing.IOURingCQ.KRING_MASK
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r5
            int r1 = org.lwjgl.system.linux.liburing.IOURingCQ.KRING_ENTRIES
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r5
            int r1 = org.lwjgl.system.linux.liburing.IOURingCQ.KFLAGS
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r5
            int r1 = org.lwjgl.system.linux.liburing.IOURingCQ.KOVERFLOW
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r5
            int r1 = org.lwjgl.system.linux.liburing.IOURingCQ.CQES
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r5
            int r1 = org.lwjgl.system.linux.liburing.IOURingCQ.RING_PTR
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
            org.lwjgl.system.linux.liburing.IOURingCQ r0 = r0.create(r1, r2)
            return r0
    }

    static {
            r0 = 12
            org.lwjgl.system.Struct$Member[] r0 = new org.lwjgl.system.Struct.Member[r0]
            r1 = r0
            r2 = 0
            int r3 = org.lwjgl.system.linux.liburing.IOURingCQ.POINTER_SIZE
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 1
            int r3 = org.lwjgl.system.linux.liburing.IOURingCQ.POINTER_SIZE
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 2
            int r3 = org.lwjgl.system.linux.liburing.IOURingCQ.POINTER_SIZE
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 3
            int r3 = org.lwjgl.system.linux.liburing.IOURingCQ.POINTER_SIZE
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 4
            int r3 = org.lwjgl.system.linux.liburing.IOURingCQ.POINTER_SIZE
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 5
            int r3 = org.lwjgl.system.linux.liburing.IOURingCQ.POINTER_SIZE
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 6
            int r3 = org.lwjgl.system.linux.liburing.IOURingCQ.POINTER_SIZE
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 7
            int r3 = org.lwjgl.system.linux.liburing.IOURingCQ.POINTER_SIZE
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 8
            int r3 = org.lwjgl.system.linux.liburing.IOURingCQ.POINTER_SIZE
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 9
            r3 = 4
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 10
            r3 = 4
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 11
            r3 = 4
            r4 = 2
            org.lwjgl.system.Struct$Member r3 = __array(r3, r4)
            r1[r2] = r3
            org.lwjgl.system.Struct$Layout r0 = __struct(r0)
            r6 = r0
            r0 = r6
            int r0 = r0.getSize()
            org.lwjgl.system.linux.liburing.IOURingCQ.SIZEOF = r0
            r0 = r6
            int r0 = r0.getAlignment()
            org.lwjgl.system.linux.liburing.IOURingCQ.ALIGNOF = r0
            r0 = r6
            r1 = 0
            int r0 = r0.offsetof(r1)
            org.lwjgl.system.linux.liburing.IOURingCQ.KHEAD = r0
            r0 = r6
            r1 = 1
            int r0 = r0.offsetof(r1)
            org.lwjgl.system.linux.liburing.IOURingCQ.KTAIL = r0
            r0 = r6
            r1 = 2
            int r0 = r0.offsetof(r1)
            org.lwjgl.system.linux.liburing.IOURingCQ.KRING_MASK = r0
            r0 = r6
            r1 = 3
            int r0 = r0.offsetof(r1)
            org.lwjgl.system.linux.liburing.IOURingCQ.KRING_ENTRIES = r0
            r0 = r6
            r1 = 4
            int r0 = r0.offsetof(r1)
            org.lwjgl.system.linux.liburing.IOURingCQ.KFLAGS = r0
            r0 = r6
            r1 = 5
            int r0 = r0.offsetof(r1)
            org.lwjgl.system.linux.liburing.IOURingCQ.KOVERFLOW = r0
            r0 = r6
            r1 = 6
            int r0 = r0.offsetof(r1)
            org.lwjgl.system.linux.liburing.IOURingCQ.CQES = r0
            r0 = r6
            r1 = 7
            int r0 = r0.offsetof(r1)
            org.lwjgl.system.linux.liburing.IOURingCQ.RING_SZ = r0
            r0 = r6
            r1 = 8
            int r0 = r0.offsetof(r1)
            org.lwjgl.system.linux.liburing.IOURingCQ.RING_PTR = r0
            r0 = r6
            r1 = 9
            int r0 = r0.offsetof(r1)
            org.lwjgl.system.linux.liburing.IOURingCQ.RING_MASK = r0
            r0 = r6
            r1 = 10
            int r0 = r0.offsetof(r1)
            org.lwjgl.system.linux.liburing.IOURingCQ.RING_ENTRIES = r0
            r0 = r6
            r1 = 11
            int r0 = r0.offsetof(r1)
            org.lwjgl.system.linux.liburing.IOURingCQ.PAD = r0
            return
    }
}
