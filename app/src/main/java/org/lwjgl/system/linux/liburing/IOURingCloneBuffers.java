package org.lwjgl.system.linux.liburing;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/system/linux/liburing/IOURingCloneBuffers.class */
@org.lwjgl.system.NativeType("struct io_uring_clone_buffers")
public class IOURingCloneBuffers extends org.lwjgl.system.Struct<org.lwjgl.system.linux.liburing.IOURingCloneBuffers> implements org.lwjgl.system.NativeResource {
    public static final int SIZEOF = 0;
    public static final int ALIGNOF = 0;
    public static final int SRC_FD = 0;
    public static final int FLAGS = 0;
    public static final int SRC_OFF = 0;
    public static final int DST_OFF = 0;
    public static final int NR = 0;
    public static final int PAD = 0;

    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/system/linux/liburing/IOURingCloneBuffers$Buffer.class */
    public static class Buffer extends org.lwjgl.system.StructBuffer<org.lwjgl.system.linux.liburing.IOURingCloneBuffers, org.lwjgl.system.linux.liburing.IOURingCloneBuffers.Buffer> implements org.lwjgl.system.NativeResource {
        private static final org.lwjgl.system.linux.liburing.IOURingCloneBuffers ELEMENT_FACTORY = null;

        public Buffer(java.nio.ByteBuffer r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r6
                int r2 = r2.remaining()
                int r3 = org.lwjgl.system.linux.liburing.IOURingCloneBuffers.SIZEOF
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
        protected org.lwjgl.system.linux.liburing.IOURingCloneBuffers.Buffer self() {
                r2 = this;
                r0 = r2
                return r0
        }

        protected org.lwjgl.system.linux.liburing.IOURingCloneBuffers.Buffer create(long r11, java.nio.ByteBuffer r13, int r14, int r15, int r16, int r17) {
                r10 = this;
                org.lwjgl.system.linux.liburing.IOURingCloneBuffers$Buffer r0 = new org.lwjgl.system.linux.liburing.IOURingCloneBuffers$Buffer
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
        protected org.lwjgl.system.linux.liburing.IOURingCloneBuffers getElementFactory() {
                r2 = this;
                org.lwjgl.system.linux.liburing.IOURingCloneBuffers r0 = org.lwjgl.system.linux.liburing.IOURingCloneBuffers.Buffer.ELEMENT_FACTORY
                return r0
        }

        @org.lwjgl.system.NativeType("__u32")
        public int src_fd() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.system.linux.liburing.IOURingCloneBuffers.nsrc_fd(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("__u32")
        public int flags() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.system.linux.liburing.IOURingCloneBuffers.nflags(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("__u32")
        public int src_off() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.system.linux.liburing.IOURingCloneBuffers.nsrc_off(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("__u32")
        public int dst_off() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.system.linux.liburing.IOURingCloneBuffers.ndst_off(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("__u32")
        public int nr() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.system.linux.liburing.IOURingCloneBuffers.nnr(r0)
                return r0
        }

        public org.lwjgl.system.linux.liburing.IOURingCloneBuffers.Buffer src_fd(@org.lwjgl.system.NativeType("__u32") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.system.linux.liburing.IOURingCloneBuffers.nsrc_fd(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.system.linux.liburing.IOURingCloneBuffers.Buffer flags(@org.lwjgl.system.NativeType("__u32") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.system.linux.liburing.IOURingCloneBuffers.nflags(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.system.linux.liburing.IOURingCloneBuffers.Buffer src_off(@org.lwjgl.system.NativeType("__u32") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.system.linux.liburing.IOURingCloneBuffers.nsrc_off(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.system.linux.liburing.IOURingCloneBuffers.Buffer dst_off(@org.lwjgl.system.NativeType("__u32") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.system.linux.liburing.IOURingCloneBuffers.ndst_off(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.system.linux.liburing.IOURingCloneBuffers.Buffer nr(@org.lwjgl.system.NativeType("__u32") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.system.linux.liburing.IOURingCloneBuffers.nnr(r0, r1)
                r0 = r4
                return r0
        }

        @Override // org.lwjgl.system.StructBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.Struct getElementFactory() {
                r2 = this;
                r0 = r2
                org.lwjgl.system.linux.liburing.IOURingCloneBuffers r0 = r0.getElementFactory()
                return r0
        }

        /* JADX INFO: renamed from: create, reason: collision with other method in class */
        protected /* bridge */ /* synthetic */ org.lwjgl.system.CustomBuffer m3309create(long r10, java.nio.ByteBuffer r12, int r13, int r14, int r15, int r16) {
                r9 = this;
                r0 = r9
                r1 = r10
                r2 = r12
                r3 = r13
                r4 = r14
                r5 = r15
                r6 = r16
                org.lwjgl.system.linux.liburing.IOURingCloneBuffers$Buffer r0 = r0.create(r1, r2, r3, r4, r5, r6)
                return r0
        }

        @Override // org.lwjgl.system.CustomBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.CustomBuffer self() {
                r2 = this;
                r0 = r2
                org.lwjgl.system.linux.liburing.IOURingCloneBuffers$Buffer r0 = r0.self()
                return r0
        }

        static {
                r0 = -1
                org.lwjgl.system.linux.liburing.IOURingCloneBuffers r0 = org.lwjgl.system.linux.liburing.IOURingCloneBuffers.create(r0)
                org.lwjgl.system.linux.liburing.IOURingCloneBuffers.Buffer.ELEMENT_FACTORY = r0
                return
        }
    }

    protected IOURingCloneBuffers(long r6, java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    protected org.lwjgl.system.linux.liburing.IOURingCloneBuffers create(long r7, java.nio.ByteBuffer r9) {
            r6 = this;
            org.lwjgl.system.linux.liburing.IOURingCloneBuffers r0 = new org.lwjgl.system.linux.liburing.IOURingCloneBuffers
            r1 = r0
            r2 = r7
            r3 = r9
            r1.<init>(r2, r3)
            return r0
    }

    public IOURingCloneBuffers(java.nio.ByteBuffer r7) {
            r6 = this;
            r0 = r6
            r1 = r7
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            r2 = r7
            int r3 = org.lwjgl.system.linux.liburing.IOURingCloneBuffers.SIZEOF
            java.nio.ByteBuffer r2 = __checkContainer(r2, r3)
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
            r2 = this;
            int r0 = org.lwjgl.system.linux.liburing.IOURingCloneBuffers.SIZEOF
            return r0
    }

    @org.lwjgl.system.NativeType("__u32")
    public int src_fd() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nsrc_fd(r0)
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

    @org.lwjgl.system.NativeType("__u32")
    public int src_off() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nsrc_off(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("__u32")
    public int dst_off() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = ndst_off(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("__u32")
    public int nr() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nnr(r0)
            return r0
    }

    public org.lwjgl.system.linux.liburing.IOURingCloneBuffers src_fd(@org.lwjgl.system.NativeType("__u32") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nsrc_fd(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.system.linux.liburing.IOURingCloneBuffers flags(@org.lwjgl.system.NativeType("__u32") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nflags(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.system.linux.liburing.IOURingCloneBuffers src_off(@org.lwjgl.system.NativeType("__u32") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nsrc_off(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.system.linux.liburing.IOURingCloneBuffers dst_off(@org.lwjgl.system.NativeType("__u32") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            ndst_off(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.system.linux.liburing.IOURingCloneBuffers nr(@org.lwjgl.system.NativeType("__u32") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nnr(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.system.linux.liburing.IOURingCloneBuffers set(int r4, int r5, int r6, int r7, int r8) {
            r3 = this;
            r0 = r3
            r1 = r4
            org.lwjgl.system.linux.liburing.IOURingCloneBuffers r0 = r0.src_fd(r1)
            r0 = r3
            r1 = r5
            org.lwjgl.system.linux.liburing.IOURingCloneBuffers r0 = r0.flags(r1)
            r0 = r3
            r1 = r6
            org.lwjgl.system.linux.liburing.IOURingCloneBuffers r0 = r0.src_off(r1)
            r0 = r3
            r1 = r7
            org.lwjgl.system.linux.liburing.IOURingCloneBuffers r0 = r0.dst_off(r1)
            r0 = r3
            r1 = r8
            org.lwjgl.system.linux.liburing.IOURingCloneBuffers r0 = r0.nr(r1)
            r0 = r3
            return r0
    }

    public org.lwjgl.system.linux.liburing.IOURingCloneBuffers set(org.lwjgl.system.linux.liburing.IOURingCloneBuffers r8) {
            r7 = this;
            r0 = r8
            long r0 = r0.address()
            r1 = r7
            long r1 = r1.address()
            int r2 = org.lwjgl.system.linux.liburing.IOURingCloneBuffers.SIZEOF
            long r2 = (long) r2
            org.lwjgl.system.MemoryUtil.memCopy(r0, r1, r2)
            r0 = r7
            return r0
    }

    public static org.lwjgl.system.linux.liburing.IOURingCloneBuffers malloc() {
            org.lwjgl.system.linux.liburing.IOURingCloneBuffers r0 = new org.lwjgl.system.linux.liburing.IOURingCloneBuffers
            r1 = r0
            int r2 = org.lwjgl.system.linux.liburing.IOURingCloneBuffers.SIZEOF
            long r2 = (long) r2
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.system.linux.liburing.IOURingCloneBuffers calloc() {
            org.lwjgl.system.linux.liburing.IOURingCloneBuffers r0 = new org.lwjgl.system.linux.liburing.IOURingCloneBuffers
            r1 = r0
            r2 = 1
            int r3 = org.lwjgl.system.linux.liburing.IOURingCloneBuffers.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.system.linux.liburing.IOURingCloneBuffers create() {
            int r0 = org.lwjgl.system.linux.liburing.IOURingCloneBuffers.SIZEOF
            java.nio.ByteBuffer r0 = org.lwjgl.BufferUtils.createByteBuffer(r0)
            r6 = r0
            org.lwjgl.system.linux.liburing.IOURingCloneBuffers r0 = new org.lwjgl.system.linux.liburing.IOURingCloneBuffers
            r1 = r0
            r2 = r6
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.system.linux.liburing.IOURingCloneBuffers create(long r6) {
            org.lwjgl.system.linux.liburing.IOURingCloneBuffers r0 = new org.lwjgl.system.linux.liburing.IOURingCloneBuffers
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.system.linux.liburing.IOURingCloneBuffers createSafe(long r6) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.system.linux.liburing.IOURingCloneBuffers r0 = new org.lwjgl.system.linux.liburing.IOURingCloneBuffers
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static org.lwjgl.system.linux.liburing.IOURingCloneBuffers.Buffer malloc(int r6) {
            org.lwjgl.system.linux.liburing.IOURingCloneBuffers$Buffer r0 = new org.lwjgl.system.linux.liburing.IOURingCloneBuffers$Buffer
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.system.linux.liburing.IOURingCloneBuffers.SIZEOF
            long r2 = __checkMalloc(r2, r3)
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.system.linux.liburing.IOURingCloneBuffers.Buffer calloc(int r7) {
            org.lwjgl.system.linux.liburing.IOURingCloneBuffers$Buffer r0 = new org.lwjgl.system.linux.liburing.IOURingCloneBuffers$Buffer
            r1 = r0
            r2 = r7
            long r2 = (long) r2
            int r3 = org.lwjgl.system.linux.liburing.IOURingCloneBuffers.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.system.linux.liburing.IOURingCloneBuffers.Buffer create(int r10) {
            r0 = r10
            int r1 = org.lwjgl.system.linux.liburing.IOURingCloneBuffers.SIZEOF
            java.nio.ByteBuffer r0 = __create(r0, r1)
            r11 = r0
            org.lwjgl.system.linux.liburing.IOURingCloneBuffers$Buffer r0 = new org.lwjgl.system.linux.liburing.IOURingCloneBuffers$Buffer
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

    public static org.lwjgl.system.linux.liburing.IOURingCloneBuffers.Buffer create(long r6, int r8) {
            org.lwjgl.system.linux.liburing.IOURingCloneBuffers$Buffer r0 = new org.lwjgl.system.linux.liburing.IOURingCloneBuffers$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.system.linux.liburing.IOURingCloneBuffers.Buffer createSafe(long r6, int r8) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.system.linux.liburing.IOURingCloneBuffers$Buffer r0 = new org.lwjgl.system.linux.liburing.IOURingCloneBuffers$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static org.lwjgl.system.linux.liburing.IOURingCloneBuffers malloc(org.lwjgl.system.MemoryStack r6) {
            org.lwjgl.system.linux.liburing.IOURingCloneBuffers r0 = new org.lwjgl.system.linux.liburing.IOURingCloneBuffers
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.system.linux.liburing.IOURingCloneBuffers.ALIGNOF
            int r4 = org.lwjgl.system.linux.liburing.IOURingCloneBuffers.SIZEOF
            long r2 = r2.nmalloc(r3, r4)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.system.linux.liburing.IOURingCloneBuffers calloc(org.lwjgl.system.MemoryStack r7) {
            org.lwjgl.system.linux.liburing.IOURingCloneBuffers r0 = new org.lwjgl.system.linux.liburing.IOURingCloneBuffers
            r1 = r0
            r2 = r7
            int r3 = org.lwjgl.system.linux.liburing.IOURingCloneBuffers.ALIGNOF
            r4 = 1
            int r5 = org.lwjgl.system.linux.liburing.IOURingCloneBuffers.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.system.linux.liburing.IOURingCloneBuffers.Buffer malloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.system.linux.liburing.IOURingCloneBuffers$Buffer r0 = new org.lwjgl.system.linux.liburing.IOURingCloneBuffers$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.system.linux.liburing.IOURingCloneBuffers.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.system.linux.liburing.IOURingCloneBuffers.SIZEOF
            int r4 = r4 * r5
            long r2 = r2.nmalloc(r3, r4)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.system.linux.liburing.IOURingCloneBuffers.Buffer calloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.system.linux.liburing.IOURingCloneBuffers$Buffer r0 = new org.lwjgl.system.linux.liburing.IOURingCloneBuffers$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.system.linux.liburing.IOURingCloneBuffers.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.system.linux.liburing.IOURingCloneBuffers.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static int nsrc_fd(long r5) {
            r0 = r5
            int r1 = org.lwjgl.system.linux.liburing.IOURingCloneBuffers.SRC_FD
            long r1 = (long) r1
            long r0 = r0 + r1
            int r0 = org.lwjgl.system.MemoryUtil.memGetInt(r0)
            return r0
    }

    public static int nflags(long r5) {
            r0 = r5
            int r1 = org.lwjgl.system.linux.liburing.IOURingCloneBuffers.FLAGS
            long r1 = (long) r1
            long r0 = r0 + r1
            int r0 = org.lwjgl.system.MemoryUtil.memGetInt(r0)
            return r0
    }

    public static int nsrc_off(long r5) {
            r0 = r5
            int r1 = org.lwjgl.system.linux.liburing.IOURingCloneBuffers.SRC_OFF
            long r1 = (long) r1
            long r0 = r0 + r1
            int r0 = org.lwjgl.system.MemoryUtil.memGetInt(r0)
            return r0
    }

    public static int ndst_off(long r5) {
            r0 = r5
            int r1 = org.lwjgl.system.linux.liburing.IOURingCloneBuffers.DST_OFF
            long r1 = (long) r1
            long r0 = r0 + r1
            int r0 = org.lwjgl.system.MemoryUtil.memGetInt(r0)
            return r0
    }

    public static int nnr(long r5) {
            r0 = r5
            int r1 = org.lwjgl.system.linux.liburing.IOURingCloneBuffers.NR
            long r1 = (long) r1
            long r0 = r0 + r1
            int r0 = org.lwjgl.system.MemoryUtil.memGetInt(r0)
            return r0
    }

    public static java.nio.IntBuffer npad(long r5) {
            r0 = r5
            int r1 = org.lwjgl.system.linux.liburing.IOURingCloneBuffers.PAD
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = 3
            java.nio.IntBuffer r0 = org.lwjgl.system.MemoryUtil.memIntBuffer(r0, r1)
            return r0
    }

    public static int npad(long r7, int r9) {
            r0 = r7
            int r1 = org.lwjgl.system.linux.liburing.IOURingCloneBuffers.PAD
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r9
            r2 = 3
            long r1 = org.lwjgl.system.Checks.check(r1, r2)
            r2 = 4
            long r1 = r1 * r2
            long r0 = r0 + r1
            int r0 = org.lwjgl.system.MemoryUtil.memGetInt(r0)
            return r0
    }

    public static void nsrc_fd(long r5, int r7) {
            r0 = r5
            int r1 = org.lwjgl.system.linux.liburing.IOURingCloneBuffers.SRC_FD
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            org.lwjgl.system.MemoryUtil.memPutInt(r0, r1)
            return
    }

    public static void nflags(long r5, int r7) {
            r0 = r5
            int r1 = org.lwjgl.system.linux.liburing.IOURingCloneBuffers.FLAGS
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            org.lwjgl.system.MemoryUtil.memPutInt(r0, r1)
            return
    }

    public static void nsrc_off(long r5, int r7) {
            r0 = r5
            int r1 = org.lwjgl.system.linux.liburing.IOURingCloneBuffers.SRC_OFF
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            org.lwjgl.system.MemoryUtil.memPutInt(r0, r1)
            return
    }

    public static void ndst_off(long r5, int r7) {
            r0 = r5
            int r1 = org.lwjgl.system.linux.liburing.IOURingCloneBuffers.DST_OFF
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            org.lwjgl.system.MemoryUtil.memPutInt(r0, r1)
            return
    }

    public static void nnr(long r5, int r7) {
            r0 = r5
            int r1 = org.lwjgl.system.linux.liburing.IOURingCloneBuffers.NR
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            org.lwjgl.system.MemoryUtil.memPutInt(r0, r1)
            return
    }

    public static void npad(long r7, java.nio.IntBuffer r9) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r9
            r1 = 3
            org.lwjgl.system.Checks.checkGT(r0, r1)
        Lb:
            r0 = r9
            long r0 = org.lwjgl.system.MemoryUtil.memAddress(r0)
            r1 = r7
            int r2 = org.lwjgl.system.linux.liburing.IOURingCloneBuffers.PAD
            long r2 = (long) r2
            long r1 = r1 + r2
            r2 = r9
            int r2 = r2.remaining()
            r3 = 4
            int r2 = r2 * r3
            long r2 = (long) r2
            org.lwjgl.system.MemoryUtil.memCopy(r0, r1, r2)
            return
    }

    public static void npad(long r7, int r9, int r10) {
            r0 = r7
            int r1 = org.lwjgl.system.linux.liburing.IOURingCloneBuffers.PAD
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r9
            r2 = 3
            long r1 = org.lwjgl.system.Checks.check(r1, r2)
            r2 = 4
            long r1 = r1 * r2
            long r0 = r0 + r1
            r1 = r10
            org.lwjgl.system.MemoryUtil.memPutInt(r0, r1)
            return
    }

    @Override // org.lwjgl.system.Struct
    protected /* bridge */ /* synthetic */ org.lwjgl.system.Struct create(long r6, java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            org.lwjgl.system.linux.liburing.IOURingCloneBuffers r0 = r0.create(r1, r2)
            return r0
    }

    static {
            r0 = 6
            org.lwjgl.system.Struct$Member[] r0 = new org.lwjgl.system.Struct.Member[r0]
            r1 = r0
            r2 = 0
            r3 = 4
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
            r4 = 3
            org.lwjgl.system.Struct$Member r3 = __array(r3, r4)
            r1[r2] = r3
            org.lwjgl.system.Struct$Layout r0 = __struct(r0)
            r6 = r0
            r0 = r6
            int r0 = r0.getSize()
            org.lwjgl.system.linux.liburing.IOURingCloneBuffers.SIZEOF = r0
            r0 = r6
            int r0 = r0.getAlignment()
            org.lwjgl.system.linux.liburing.IOURingCloneBuffers.ALIGNOF = r0
            r0 = r6
            r1 = 0
            int r0 = r0.offsetof(r1)
            org.lwjgl.system.linux.liburing.IOURingCloneBuffers.SRC_FD = r0
            r0 = r6
            r1 = 1
            int r0 = r0.offsetof(r1)
            org.lwjgl.system.linux.liburing.IOURingCloneBuffers.FLAGS = r0
            r0 = r6
            r1 = 2
            int r0 = r0.offsetof(r1)
            org.lwjgl.system.linux.liburing.IOURingCloneBuffers.SRC_OFF = r0
            r0 = r6
            r1 = 3
            int r0 = r0.offsetof(r1)
            org.lwjgl.system.linux.liburing.IOURingCloneBuffers.DST_OFF = r0
            r0 = r6
            r1 = 4
            int r0 = r0.offsetof(r1)
            org.lwjgl.system.linux.liburing.IOURingCloneBuffers.NR = r0
            r0 = r6
            r1 = 5
            int r0 = r0.offsetof(r1)
            org.lwjgl.system.linux.liburing.IOURingCloneBuffers.PAD = r0
            return
    }
}
