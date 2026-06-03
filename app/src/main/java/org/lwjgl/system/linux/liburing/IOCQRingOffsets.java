package org.lwjgl.system.linux.liburing;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/system/linux/liburing/IOCQRingOffsets.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/system/linux/liburing/IOCQRingOffsets.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/system/linux/liburing/IOCQRingOffsets.class */
@org.lwjgl.system.NativeType("struct io_cqring_offsets")
public class IOCQRingOffsets extends org.lwjgl.system.Struct<org.lwjgl.system.linux.liburing.IOCQRingOffsets> implements org.lwjgl.system.NativeResource {
    public static final int SIZEOF = 0;
    public static final int ALIGNOF = 0;
    public static final int HEAD = 0;
    public static final int TAIL = 0;
    public static final int RING_MASK = 0;
    public static final int RING_ENTRIES = 0;
    public static final int OVERFLOW = 0;
    public static final int CQES = 0;
    public static final int FLAGS = 0;
    public static final int RESV1 = 0;
    public static final int RESV2 = 0;

    /* JADX WARN: Classes with same name are omitted, all sources:
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/system/linux/liburing/IOCQRingOffsets$Buffer.class
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/system/linux/liburing/IOCQRingOffsets$Buffer.class
     */
    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/system/linux/liburing/IOCQRingOffsets$Buffer.class */
    public static class Buffer extends org.lwjgl.system.StructBuffer<org.lwjgl.system.linux.liburing.IOCQRingOffsets, org.lwjgl.system.linux.liburing.IOCQRingOffsets.Buffer> implements org.lwjgl.system.NativeResource {
        private static final org.lwjgl.system.linux.liburing.IOCQRingOffsets ELEMENT_FACTORY = null;

        public Buffer(java.nio.ByteBuffer r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r6
                int r2 = r2.remaining()
                int r3 = org.lwjgl.system.linux.liburing.IOCQRingOffsets.SIZEOF
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
        protected org.lwjgl.system.linux.liburing.IOCQRingOffsets.Buffer self() {
                r2 = this;
                r0 = r2
                return r0
        }

        @Override // org.lwjgl.system.StructBuffer
        protected org.lwjgl.system.linux.liburing.IOCQRingOffsets getElementFactory() {
                r2 = this;
                org.lwjgl.system.linux.liburing.IOCQRingOffsets r0 = org.lwjgl.system.linux.liburing.IOCQRingOffsets.Buffer.ELEMENT_FACTORY
                return r0
        }

        @org.lwjgl.system.NativeType("__u32")
        public int head() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.system.linux.liburing.IOCQRingOffsets.nhead(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("__u32")
        public int tail() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.system.linux.liburing.IOCQRingOffsets.ntail(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("__u32")
        public int ring_mask() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.system.linux.liburing.IOCQRingOffsets.nring_mask(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("__u32")
        public int ring_entries() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.system.linux.liburing.IOCQRingOffsets.nring_entries(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("__u32")
        public int overflow() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.system.linux.liburing.IOCQRingOffsets.noverflow(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("__u32")
        public int cqes() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.system.linux.liburing.IOCQRingOffsets.ncqes(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("__u32")
        public int flags() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.system.linux.liburing.IOCQRingOffsets.nflags(r0)
                return r0
        }

        public org.lwjgl.system.linux.liburing.IOCQRingOffsets.Buffer head(@org.lwjgl.system.NativeType("__u32") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.system.linux.liburing.IOCQRingOffsets.nhead(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.system.linux.liburing.IOCQRingOffsets.Buffer tail(@org.lwjgl.system.NativeType("__u32") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.system.linux.liburing.IOCQRingOffsets.ntail(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.system.linux.liburing.IOCQRingOffsets.Buffer ring_mask(@org.lwjgl.system.NativeType("__u32") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.system.linux.liburing.IOCQRingOffsets.nring_mask(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.system.linux.liburing.IOCQRingOffsets.Buffer ring_entries(@org.lwjgl.system.NativeType("__u32") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.system.linux.liburing.IOCQRingOffsets.nring_entries(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.system.linux.liburing.IOCQRingOffsets.Buffer overflow(@org.lwjgl.system.NativeType("__u32") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.system.linux.liburing.IOCQRingOffsets.noverflow(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.system.linux.liburing.IOCQRingOffsets.Buffer cqes(@org.lwjgl.system.NativeType("__u32") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.system.linux.liburing.IOCQRingOffsets.ncqes(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.system.linux.liburing.IOCQRingOffsets.Buffer flags(@org.lwjgl.system.NativeType("__u32") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.system.linux.liburing.IOCQRingOffsets.nflags(r0, r1)
                r0 = r4
                return r0
        }

        @Override // org.lwjgl.system.StructBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.Struct getElementFactory() {
                r2 = this;
                r0 = r2
                org.lwjgl.system.linux.liburing.IOCQRingOffsets r0 = r0.getElementFactory()
                return r0
        }

        @Override // org.lwjgl.system.CustomBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.CustomBuffer self() {
                r2 = this;
                r0 = r2
                org.lwjgl.system.linux.liburing.IOCQRingOffsets$Buffer r0 = r0.self()
                return r0
        }

        static {
                r0 = -1
                org.lwjgl.system.linux.liburing.IOCQRingOffsets r0 = org.lwjgl.system.linux.liburing.IOCQRingOffsets.create(r0)
                org.lwjgl.system.linux.liburing.IOCQRingOffsets.Buffer.ELEMENT_FACTORY = r0
                return
        }
    }

    protected IOCQRingOffsets(long r6, @javax.annotation.Nullable java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    protected org.lwjgl.system.linux.liburing.IOCQRingOffsets create(long r7, @javax.annotation.Nullable java.nio.ByteBuffer r9) {
            r6 = this;
            org.lwjgl.system.linux.liburing.IOCQRingOffsets r0 = new org.lwjgl.system.linux.liburing.IOCQRingOffsets
            r1 = r0
            r2 = r7
            r3 = r9
            r1.<init>(r2, r3)
            return r0
    }

    public IOCQRingOffsets(java.nio.ByteBuffer r7) {
            r6 = this;
            r0 = r6
            r1 = r7
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            r2 = r7
            int r3 = org.lwjgl.system.linux.liburing.IOCQRingOffsets.SIZEOF
            java.nio.ByteBuffer r2 = __checkContainer(r2, r3)
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
            r2 = this;
            int r0 = org.lwjgl.system.linux.liburing.IOCQRingOffsets.SIZEOF
            return r0
    }

    @org.lwjgl.system.NativeType("__u32")
    public int head() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nhead(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("__u32")
    public int tail() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = ntail(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("__u32")
    public int ring_mask() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nring_mask(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("__u32")
    public int ring_entries() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nring_entries(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("__u32")
    public int overflow() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = noverflow(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("__u32")
    public int cqes() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = ncqes(r0)
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

    public org.lwjgl.system.linux.liburing.IOCQRingOffsets head(@org.lwjgl.system.NativeType("__u32") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nhead(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.system.linux.liburing.IOCQRingOffsets tail(@org.lwjgl.system.NativeType("__u32") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            ntail(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.system.linux.liburing.IOCQRingOffsets ring_mask(@org.lwjgl.system.NativeType("__u32") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nring_mask(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.system.linux.liburing.IOCQRingOffsets ring_entries(@org.lwjgl.system.NativeType("__u32") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nring_entries(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.system.linux.liburing.IOCQRingOffsets overflow(@org.lwjgl.system.NativeType("__u32") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            noverflow(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.system.linux.liburing.IOCQRingOffsets cqes(@org.lwjgl.system.NativeType("__u32") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            ncqes(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.system.linux.liburing.IOCQRingOffsets flags(@org.lwjgl.system.NativeType("__u32") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nflags(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.system.linux.liburing.IOCQRingOffsets set(int r4, int r5, int r6, int r7, int r8, int r9, int r10) {
            r3 = this;
            r0 = r3
            r1 = r4
            org.lwjgl.system.linux.liburing.IOCQRingOffsets r0 = r0.head(r1)
            r0 = r3
            r1 = r5
            org.lwjgl.system.linux.liburing.IOCQRingOffsets r0 = r0.tail(r1)
            r0 = r3
            r1 = r6
            org.lwjgl.system.linux.liburing.IOCQRingOffsets r0 = r0.ring_mask(r1)
            r0 = r3
            r1 = r7
            org.lwjgl.system.linux.liburing.IOCQRingOffsets r0 = r0.ring_entries(r1)
            r0 = r3
            r1 = r8
            org.lwjgl.system.linux.liburing.IOCQRingOffsets r0 = r0.overflow(r1)
            r0 = r3
            r1 = r9
            org.lwjgl.system.linux.liburing.IOCQRingOffsets r0 = r0.cqes(r1)
            r0 = r3
            r1 = r10
            org.lwjgl.system.linux.liburing.IOCQRingOffsets r0 = r0.flags(r1)
            r0 = r3
            return r0
    }

    public org.lwjgl.system.linux.liburing.IOCQRingOffsets set(org.lwjgl.system.linux.liburing.IOCQRingOffsets r7) {
            r6 = this;
            r0 = r7
            long r0 = r0.address()
            r1 = r6
            long r1 = r1.address()
            int r2 = org.lwjgl.system.linux.liburing.IOCQRingOffsets.SIZEOF
            org.lwjgl.system.MemoryUtil.memCopy(r0, r1, r2)
            r0 = r6
            return r0
    }

    public static org.lwjgl.system.linux.liburing.IOCQRingOffsets malloc() {
            org.lwjgl.system.linux.liburing.IOCQRingOffsets r0 = new org.lwjgl.system.linux.liburing.IOCQRingOffsets
            r1 = r0
            int r2 = org.lwjgl.system.linux.liburing.IOCQRingOffsets.SIZEOF
            long r2 = (long) r2
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.system.linux.liburing.IOCQRingOffsets calloc() {
            org.lwjgl.system.linux.liburing.IOCQRingOffsets r0 = new org.lwjgl.system.linux.liburing.IOCQRingOffsets
            r1 = r0
            r2 = 1
            int r3 = org.lwjgl.system.linux.liburing.IOCQRingOffsets.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.system.linux.liburing.IOCQRingOffsets create() {
            int r0 = org.lwjgl.system.linux.liburing.IOCQRingOffsets.SIZEOF
            java.nio.ByteBuffer r0 = org.lwjgl.BufferUtils.createByteBuffer(r0)
            r6 = r0
            org.lwjgl.system.linux.liburing.IOCQRingOffsets r0 = new org.lwjgl.system.linux.liburing.IOCQRingOffsets
            r1 = r0
            r2 = r6
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.system.linux.liburing.IOCQRingOffsets create(long r6) {
            org.lwjgl.system.linux.liburing.IOCQRingOffsets r0 = new org.lwjgl.system.linux.liburing.IOCQRingOffsets
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.system.linux.liburing.IOCQRingOffsets createSafe(long r6) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.system.linux.liburing.IOCQRingOffsets r0 = new org.lwjgl.system.linux.liburing.IOCQRingOffsets
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static org.lwjgl.system.linux.liburing.IOCQRingOffsets.Buffer malloc(int r6) {
            org.lwjgl.system.linux.liburing.IOCQRingOffsets$Buffer r0 = new org.lwjgl.system.linux.liburing.IOCQRingOffsets$Buffer
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.system.linux.liburing.IOCQRingOffsets.SIZEOF
            long r2 = __checkMalloc(r2, r3)
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.system.linux.liburing.IOCQRingOffsets.Buffer calloc(int r7) {
            org.lwjgl.system.linux.liburing.IOCQRingOffsets$Buffer r0 = new org.lwjgl.system.linux.liburing.IOCQRingOffsets$Buffer
            r1 = r0
            r2 = r7
            long r2 = (long) r2
            int r3 = org.lwjgl.system.linux.liburing.IOCQRingOffsets.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.system.linux.liburing.IOCQRingOffsets.Buffer create(int r10) {
            r0 = r10
            int r1 = org.lwjgl.system.linux.liburing.IOCQRingOffsets.SIZEOF
            java.nio.ByteBuffer r0 = __create(r0, r1)
            r11 = r0
            org.lwjgl.system.linux.liburing.IOCQRingOffsets$Buffer r0 = new org.lwjgl.system.linux.liburing.IOCQRingOffsets$Buffer
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

    public static org.lwjgl.system.linux.liburing.IOCQRingOffsets.Buffer create(long r6, int r8) {
            org.lwjgl.system.linux.liburing.IOCQRingOffsets$Buffer r0 = new org.lwjgl.system.linux.liburing.IOCQRingOffsets$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.system.linux.liburing.IOCQRingOffsets.Buffer createSafe(long r6, int r8) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.system.linux.liburing.IOCQRingOffsets$Buffer r0 = new org.lwjgl.system.linux.liburing.IOCQRingOffsets$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static org.lwjgl.system.linux.liburing.IOCQRingOffsets malloc(org.lwjgl.system.MemoryStack r6) {
            org.lwjgl.system.linux.liburing.IOCQRingOffsets r0 = new org.lwjgl.system.linux.liburing.IOCQRingOffsets
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.system.linux.liburing.IOCQRingOffsets.ALIGNOF
            int r4 = org.lwjgl.system.linux.liburing.IOCQRingOffsets.SIZEOF
            long r2 = r2.nmalloc(r3, r4)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.system.linux.liburing.IOCQRingOffsets calloc(org.lwjgl.system.MemoryStack r7) {
            org.lwjgl.system.linux.liburing.IOCQRingOffsets r0 = new org.lwjgl.system.linux.liburing.IOCQRingOffsets
            r1 = r0
            r2 = r7
            int r3 = org.lwjgl.system.linux.liburing.IOCQRingOffsets.ALIGNOF
            r4 = 1
            int r5 = org.lwjgl.system.linux.liburing.IOCQRingOffsets.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.system.linux.liburing.IOCQRingOffsets.Buffer malloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.system.linux.liburing.IOCQRingOffsets$Buffer r0 = new org.lwjgl.system.linux.liburing.IOCQRingOffsets$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.system.linux.liburing.IOCQRingOffsets.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.system.linux.liburing.IOCQRingOffsets.SIZEOF
            int r4 = r4 * r5
            long r2 = r2.nmalloc(r3, r4)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.system.linux.liburing.IOCQRingOffsets.Buffer calloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.system.linux.liburing.IOCQRingOffsets$Buffer r0 = new org.lwjgl.system.linux.liburing.IOCQRingOffsets$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.system.linux.liburing.IOCQRingOffsets.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.system.linux.liburing.IOCQRingOffsets.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static int nhead(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.system.linux.liburing.IOCQRingOffsets.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.system.linux.liburing.IOCQRingOffsets.HEAD
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int ntail(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.system.linux.liburing.IOCQRingOffsets.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.system.linux.liburing.IOCQRingOffsets.TAIL
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int nring_mask(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.system.linux.liburing.IOCQRingOffsets.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.system.linux.liburing.IOCQRingOffsets.RING_MASK
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int nring_entries(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.system.linux.liburing.IOCQRingOffsets.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.system.linux.liburing.IOCQRingOffsets.RING_ENTRIES
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int noverflow(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.system.linux.liburing.IOCQRingOffsets.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.system.linux.liburing.IOCQRingOffsets.OVERFLOW
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int ncqes(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.system.linux.liburing.IOCQRingOffsets.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.system.linux.liburing.IOCQRingOffsets.CQES
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int nflags(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.system.linux.liburing.IOCQRingOffsets.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.system.linux.liburing.IOCQRingOffsets.FLAGS
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int nresv1(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.system.linux.liburing.IOCQRingOffsets.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.system.linux.liburing.IOCQRingOffsets.RESV1
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static long nresv2(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.system.linux.liburing.IOCQRingOffsets.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.system.linux.liburing.IOCQRingOffsets.RESV2
            long r3 = (long) r3
            long r2 = r2 + r3
            long r0 = r0.getLong(r1, r2)
            return r0
    }

    public static void nhead(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.system.linux.liburing.IOCQRingOffsets.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.system.linux.liburing.IOCQRingOffsets.HEAD
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void ntail(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.system.linux.liburing.IOCQRingOffsets.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.system.linux.liburing.IOCQRingOffsets.TAIL
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void nring_mask(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.system.linux.liburing.IOCQRingOffsets.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.system.linux.liburing.IOCQRingOffsets.RING_MASK
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void nring_entries(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.system.linux.liburing.IOCQRingOffsets.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.system.linux.liburing.IOCQRingOffsets.RING_ENTRIES
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void noverflow(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.system.linux.liburing.IOCQRingOffsets.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.system.linux.liburing.IOCQRingOffsets.OVERFLOW
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void ncqes(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.system.linux.liburing.IOCQRingOffsets.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.system.linux.liburing.IOCQRingOffsets.CQES
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void nflags(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.system.linux.liburing.IOCQRingOffsets.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.system.linux.liburing.IOCQRingOffsets.FLAGS
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void nresv1(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.system.linux.liburing.IOCQRingOffsets.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.system.linux.liburing.IOCQRingOffsets.RESV1
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void nresv2(long r7, long r9) {
            sun.misc.Unsafe r0 = org.lwjgl.system.linux.liburing.IOCQRingOffsets.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.system.linux.liburing.IOCQRingOffsets.RESV2
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putLong(r1, r2, r3)
            return
    }

    @Override // org.lwjgl.system.Struct
    protected /* bridge */ /* synthetic */ org.lwjgl.system.Struct create(long r6, @javax.annotation.Nullable java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            org.lwjgl.system.linux.liburing.IOCQRingOffsets r0 = r0.create(r1, r2)
            return r0
    }

    static {
            r0 = 9
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
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 6
            r3 = 4
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 7
            r3 = 4
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 8
            r3 = 8
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            org.lwjgl.system.Struct$Layout r0 = __struct(r0)
            r5 = r0
            r0 = r5
            int r0 = r0.getSize()
            org.lwjgl.system.linux.liburing.IOCQRingOffsets.SIZEOF = r0
            r0 = r5
            int r0 = r0.getAlignment()
            org.lwjgl.system.linux.liburing.IOCQRingOffsets.ALIGNOF = r0
            r0 = r5
            r1 = 0
            int r0 = r0.offsetof(r1)
            org.lwjgl.system.linux.liburing.IOCQRingOffsets.HEAD = r0
            r0 = r5
            r1 = 1
            int r0 = r0.offsetof(r1)
            org.lwjgl.system.linux.liburing.IOCQRingOffsets.TAIL = r0
            r0 = r5
            r1 = 2
            int r0 = r0.offsetof(r1)
            org.lwjgl.system.linux.liburing.IOCQRingOffsets.RING_MASK = r0
            r0 = r5
            r1 = 3
            int r0 = r0.offsetof(r1)
            org.lwjgl.system.linux.liburing.IOCQRingOffsets.RING_ENTRIES = r0
            r0 = r5
            r1 = 4
            int r0 = r0.offsetof(r1)
            org.lwjgl.system.linux.liburing.IOCQRingOffsets.OVERFLOW = r0
            r0 = r5
            r1 = 5
            int r0 = r0.offsetof(r1)
            org.lwjgl.system.linux.liburing.IOCQRingOffsets.CQES = r0
            r0 = r5
            r1 = 6
            int r0 = r0.offsetof(r1)
            org.lwjgl.system.linux.liburing.IOCQRingOffsets.FLAGS = r0
            r0 = r5
            r1 = 7
            int r0 = r0.offsetof(r1)
            org.lwjgl.system.linux.liburing.IOCQRingOffsets.RESV1 = r0
            r0 = r5
            r1 = 8
            int r0 = r0.offsetof(r1)
            org.lwjgl.system.linux.liburing.IOCQRingOffsets.RESV2 = r0
            return
    }
}
